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

	@OriginalMember(owner = "client!client", name = "tb", descriptor = "I")
	private static int anInt234;

	@OriginalMember(owner = "client!client", name = "ac", descriptor = "I")
	private static int anInt240;

	@OriginalMember(owner = "client!client", name = "fc", descriptor = "I")
	private static int anInt244;

	@OriginalMember(owner = "client!client", name = "hc", descriptor = "Z")
	private static boolean aBoolean57;

	@OriginalMember(owner = "client!client", name = "jc", descriptor = "I")
	private static int anInt245;

	@OriginalMember(owner = "client!client", name = "oc", descriptor = "I")
	private static int anInt248;

	@OriginalMember(owner = "client!client", name = "vc", descriptor = "I")
	public static int anInt252;

	@OriginalMember(owner = "client!client", name = "xc", descriptor = "I")
	private static int anInt253;

	@OriginalMember(owner = "client!client", name = "Sc", descriptor = "I")
	private static int anInt262;

	@OriginalMember(owner = "client!client", name = "Ld", descriptor = "I")
	private static int anInt272;

	@OriginalMember(owner = "client!client", name = "ue", descriptor = "I")
	private static int anInt294;

	@OriginalMember(owner = "client!client", name = "ye", descriptor = "I")
	private static int anInt295;

	@OriginalMember(owner = "client!client", name = "bg", descriptor = "I")
	public static int anInt340;

	@OriginalMember(owner = "client!client", name = "dg", descriptor = "Z")
	private static boolean aBoolean77;

	@OriginalMember(owner = "client!client", name = "Lg", descriptor = "Lclient!ab;")
	public static Class1_Sub1_Sub1_Sub1_Sub1 aClass1_Sub1_Sub1_Sub1_Sub1_1;

	@OriginalMember(owner = "client!client", name = "Xg", descriptor = "Z")
	private static boolean aBoolean80;

	@OriginalMember(owner = "client!client", name = "dh", descriptor = "I")
	private static int anInt358;

	@OriginalMember(owner = "client!client", name = "eh", descriptor = "I")
	private static int anInt359;

	@OriginalMember(owner = "client!client", name = "yh", descriptor = "I")
	private static int anInt367;

	@OriginalMember(owner = "client!client", name = "zh", descriptor = "I")
	private static int anInt368;

	@OriginalMember(owner = "client!client", name = "di", descriptor = "Z")
	private static boolean aBoolean86;

	@OriginalMember(owner = "client!client", name = "mi", descriptor = "I")
	private static int anInt387;

	@OriginalMember(owner = "client!client", name = "vi", descriptor = "I")
	private static int anInt392;

	@OriginalMember(owner = "client!client", name = "mj", descriptor = "I")
	private static int anInt418;

	@OriginalMember(owner = "client!client", name = "pj", descriptor = "I")
	private static int anInt419;

	@OriginalMember(owner = "client!client", name = "S", descriptor = "B")
	private static byte aByte3 = -69;

	@OriginalMember(owner = "client!client", name = "xd", descriptor = "I")
	private static int anInt269 = 35850;

	@OriginalMember(owner = "client!client", name = "Hf", descriptor = "[I")
	private static int[] anIntArray64;

	@OriginalMember(owner = "client!client", name = "ag", descriptor = "I")
	private static int anInt339;

	@OriginalMember(owner = "client!client", name = "cg", descriptor = "Z")
	private static boolean aBoolean76;

	@OriginalMember(owner = "client!client", name = "rg", descriptor = "Ljava/lang/String;")
	private static String aString15;

	@OriginalMember(owner = "client!client", name = "Yg", descriptor = "[I")
	public static final int[] anIntArray72;

	@OriginalMember(owner = "client!client", name = "ah", descriptor = "[[I")
	public static final int[][] anIntArrayArray5;

	@OriginalMember(owner = "client!client", name = "ch", descriptor = "B")
	private static byte aByte14;

	@OriginalMember(owner = "client!client", name = "Gh", descriptor = "B")
	private static byte aByte17;

	@OriginalMember(owner = "client!client", name = "fi", descriptor = "Ljava/math/BigInteger;")
	private static BigInteger aBigInteger1;

	@OriginalMember(owner = "client!client", name = "ji", descriptor = "Ljava/math/BigInteger;")
	private static BigInteger aBigInteger2;

	@OriginalMember(owner = "client!client", name = "ui", descriptor = "I")
	private static int anInt391;

	@OriginalMember(owner = "client!client", name = "rj", descriptor = "I")
	private static int anInt421;

	@OriginalMember(owner = "client!client", name = "sj", descriptor = "[I")
	public static int[] anIntArray91;

	@OriginalMember(owner = "client!client", name = "N", descriptor = "[Lclient!jb;")
	private Class1_Sub1_Sub2_Sub3[] aClass1_Sub1_Sub2_Sub3Array1;

	@OriginalMember(owner = "client!client", name = "U", descriptor = "I")
	private int anInt220;

	@OriginalMember(owner = "client!client", name = "X", descriptor = "I")
	private int anInt221;

	@OriginalMember(owner = "client!client", name = "Y", descriptor = "I")
	private int anInt222;

	@OriginalMember(owner = "client!client", name = "Z", descriptor = "I")
	private int anInt223;

	@OriginalMember(owner = "client!client", name = "bb", descriptor = "Lclient!wb;")
	private Class46 aClass46_1;

	@OriginalMember(owner = "client!client", name = "db", descriptor = "[[B")
	private byte[][] aByteArrayArray1;

	@OriginalMember(owner = "client!client", name = "gb", descriptor = "I")
	private int anInt227;

	@OriginalMember(owner = "client!client", name = "hb", descriptor = "I")
	private int anInt228;

	@OriginalMember(owner = "client!client", name = "nb", descriptor = "I")
	private int anInt232;

	@OriginalMember(owner = "client!client", name = "pb", descriptor = "I")
	private int anInt233;

	@OriginalMember(owner = "client!client", name = "Gb", descriptor = "I")
	private int anInt237;

	@OriginalMember(owner = "client!client", name = "Nb", descriptor = "I")
	private int anInt238;

	@OriginalMember(owner = "client!client", name = "Pb", descriptor = "Lclient!kb;")
	private Class1_Sub1_Sub2_Sub4 aClass1_Sub1_Sub2_Sub4_1;

	@OriginalMember(owner = "client!client", name = "Qb", descriptor = "Lclient!kb;")
	private Class1_Sub1_Sub2_Sub4 aClass1_Sub1_Sub2_Sub4_2;

	@OriginalMember(owner = "client!client", name = "Rb", descriptor = "Lclient!kb;")
	private Class1_Sub1_Sub2_Sub4 aClass1_Sub1_Sub2_Sub4_3;

	@OriginalMember(owner = "client!client", name = "Sb", descriptor = "Lclient!kb;")
	private Class1_Sub1_Sub2_Sub4 aClass1_Sub1_Sub2_Sub4_4;

	@OriginalMember(owner = "client!client", name = "Ub", descriptor = "Lclient!ib;")
	private Class1_Sub1_Sub2_Sub2 aClass1_Sub1_Sub2_Sub2_1;

	@OriginalMember(owner = "client!client", name = "Vb", descriptor = "Lclient!ib;")
	private Class1_Sub1_Sub2_Sub2 aClass1_Sub1_Sub2_Sub2_2;

	@OriginalMember(owner = "client!client", name = "Xb", descriptor = "I")
	private int anInt239;

	@OriginalMember(owner = "client!client", name = "Yb", descriptor = "J")
	private long aLong14;

	@OriginalMember(owner = "client!client", name = "cc", descriptor = "I")
	private int anInt241;

	@OriginalMember(owner = "client!client", name = "kc", descriptor = "I")
	private int anInt246;

	@OriginalMember(owner = "client!client", name = "mc", descriptor = "I")
	private int anInt247;

	@OriginalMember(owner = "client!client", name = "pc", descriptor = "I")
	private int anInt249;

	@OriginalMember(owner = "client!client", name = "qc", descriptor = "I")
	private int anInt250;

	@OriginalMember(owner = "client!client", name = "rc", descriptor = "[[[B")
	private byte[][][] aByteArrayArrayArray7;

	@OriginalMember(owner = "client!client", name = "sc", descriptor = "I")
	private int anInt251;

	@OriginalMember(owner = "client!client", name = "Ac", descriptor = "I")
	private int anInt254;

	@OriginalMember(owner = "client!client", name = "Bc", descriptor = "I")
	private int anInt255;

	@OriginalMember(owner = "client!client", name = "Cc", descriptor = "I")
	private int anInt256;

	@OriginalMember(owner = "client!client", name = "Dc", descriptor = "J")
	private long aLong15;

	@OriginalMember(owner = "client!client", name = "Ec", descriptor = "[I")
	private int[] anIntArray42;

	@OriginalMember(owner = "client!client", name = "Fc", descriptor = "[I")
	private int[] anIntArray43;

	@OriginalMember(owner = "client!client", name = "Lc", descriptor = "I")
	private int anInt257;

	@OriginalMember(owner = "client!client", name = "Oc", descriptor = "I")
	private int anInt259;

	@OriginalMember(owner = "client!client", name = "Pc", descriptor = "I")
	private int anInt260;

	@OriginalMember(owner = "client!client", name = "Uc", descriptor = "Ljava/lang/String;")
	private String aString8;

	@OriginalMember(owner = "client!client", name = "Vc", descriptor = "Ljava/lang/String;")
	private String aString9;

	@OriginalMember(owner = "client!client", name = "Yc", descriptor = "I")
	private int anInt264;

	@OriginalMember(owner = "client!client", name = "jd", descriptor = "I")
	private int anInt266;

	@OriginalMember(owner = "client!client", name = "md", descriptor = "I")
	private int anInt267;

	@OriginalMember(owner = "client!client", name = "qd", descriptor = "I")
	private int anInt268;

	@OriginalMember(owner = "client!client", name = "sd", descriptor = "Lclient!jb;")
	private Class1_Sub1_Sub2_Sub3 aClass1_Sub1_Sub2_Sub3_1;

	@OriginalMember(owner = "client!client", name = "td", descriptor = "Lclient!jb;")
	private Class1_Sub1_Sub2_Sub3 aClass1_Sub1_Sub2_Sub3_2;

	@OriginalMember(owner = "client!client", name = "ud", descriptor = "Lclient!jb;")
	private Class1_Sub1_Sub2_Sub3 aClass1_Sub1_Sub2_Sub3_3;

	@OriginalMember(owner = "client!client", name = "vd", descriptor = "Lclient!jb;")
	private Class1_Sub1_Sub2_Sub3 aClass1_Sub1_Sub2_Sub3_4;

	@OriginalMember(owner = "client!client", name = "wd", descriptor = "Lclient!jb;")
	private Class1_Sub1_Sub2_Sub3 aClass1_Sub1_Sub2_Sub3_5;

	@OriginalMember(owner = "client!client", name = "yd", descriptor = "Lclient!qb;")
	private Class35 aClass35_3;

	@OriginalMember(owner = "client!client", name = "zd", descriptor = "Lclient!qb;")
	private Class35 aClass35_4;

	@OriginalMember(owner = "client!client", name = "Ad", descriptor = "Lclient!qb;")
	private Class35 aClass35_5;

	@OriginalMember(owner = "client!client", name = "Bd", descriptor = "Lclient!qb;")
	private Class35 aClass35_6;

	@OriginalMember(owner = "client!client", name = "Cd", descriptor = "Lclient!qb;")
	private Class35 aClass35_7;

	@OriginalMember(owner = "client!client", name = "Dd", descriptor = "Lclient!qb;")
	private Class35 aClass35_8;

	@OriginalMember(owner = "client!client", name = "Ed", descriptor = "Lclient!qb;")
	private Class35 aClass35_9;

	@OriginalMember(owner = "client!client", name = "Fd", descriptor = "Lclient!qb;")
	private Class35 aClass35_10;

	@OriginalMember(owner = "client!client", name = "Gd", descriptor = "Lclient!qb;")
	private Class35 aClass35_11;

	@OriginalMember(owner = "client!client", name = "Kd", descriptor = "Lclient!fc;")
	private Class11 aClass11_1;

	@OriginalMember(owner = "client!client", name = "Md", descriptor = "I")
	private int anInt273;

	@OriginalMember(owner = "client!client", name = "Rd", descriptor = "I")
	private int anInt274;

	@OriginalMember(owner = "client!client", name = "Sd", descriptor = "I")
	private int anInt275;

	@OriginalMember(owner = "client!client", name = "Td", descriptor = "I")
	private int anInt276;

	@OriginalMember(owner = "client!client", name = "Ud", descriptor = "I")
	private int anInt277;

	@OriginalMember(owner = "client!client", name = "Vd", descriptor = "I")
	private int anInt278;

	@OriginalMember(owner = "client!client", name = "Wd", descriptor = "I")
	private int anInt279;

	@OriginalMember(owner = "client!client", name = "Xd", descriptor = "I")
	private int anInt280;

	@OriginalMember(owner = "client!client", name = "Yd", descriptor = "I")
	private int anInt281;

	@OriginalMember(owner = "client!client", name = "Zd", descriptor = "I")
	private int anInt282;

	@OriginalMember(owner = "client!client", name = "ae", descriptor = "I")
	private int anInt283;

	@OriginalMember(owner = "client!client", name = "be", descriptor = "I")
	private int anInt284;

	@OriginalMember(owner = "client!client", name = "de", descriptor = "I")
	private int anInt285;

	@OriginalMember(owner = "client!client", name = "ee", descriptor = "I")
	private int anInt286;

	@OriginalMember(owner = "client!client", name = "fe", descriptor = "Lclient!ib;")
	private Class1_Sub1_Sub2_Sub2 aClass1_Sub1_Sub2_Sub2_3;

	@OriginalMember(owner = "client!client", name = "me", descriptor = "I")
	private int anInt288;

	@OriginalMember(owner = "client!client", name = "ne", descriptor = "I")
	private int anInt289;

	@OriginalMember(owner = "client!client", name = "oe", descriptor = "I")
	private int anInt290;

	@OriginalMember(owner = "client!client", name = "pe", descriptor = "I")
	private int anInt291;

	@OriginalMember(owner = "client!client", name = "qe", descriptor = "I")
	private int anInt292;

	@OriginalMember(owner = "client!client", name = "re", descriptor = "I")
	private int anInt293;

	@OriginalMember(owner = "client!client", name = "ze", descriptor = "I")
	private int anInt296;

	@OriginalMember(owner = "client!client", name = "Ae", descriptor = "I")
	private int anInt297;

	@OriginalMember(owner = "client!client", name = "Be", descriptor = "I")
	private int anInt298;

	@OriginalMember(owner = "client!client", name = "Ce", descriptor = "I")
	private int anInt299;

	@OriginalMember(owner = "client!client", name = "De", descriptor = "I")
	private int anInt300;

	@OriginalMember(owner = "client!client", name = "Ee", descriptor = "Ljava/lang/String;")
	private String aString12;

	@OriginalMember(owner = "client!client", name = "Fe", descriptor = "I")
	private int anInt301;

	@OriginalMember(owner = "client!client", name = "Ge", descriptor = "I")
	private int anInt302;

	@OriginalMember(owner = "client!client", name = "He", descriptor = "I")
	private int anInt303;

	@OriginalMember(owner = "client!client", name = "Ie", descriptor = "I")
	private int anInt304;

	@OriginalMember(owner = "client!client", name = "Je", descriptor = "I")
	private int anInt305;

	@OriginalMember(owner = "client!client", name = "Ke", descriptor = "I")
	private int anInt306;

	@OriginalMember(owner = "client!client", name = "Le", descriptor = "I")
	private int anInt307;

	@OriginalMember(owner = "client!client", name = "Pe", descriptor = "I")
	private int anInt310;

	@OriginalMember(owner = "client!client", name = "Qe", descriptor = "I")
	private int anInt311;

	@OriginalMember(owner = "client!client", name = "Re", descriptor = "I")
	private int anInt312;

	@OriginalMember(owner = "client!client", name = "Se", descriptor = "I")
	private int anInt313;

	@OriginalMember(owner = "client!client", name = "Ve", descriptor = "I")
	private int anInt314;

	@OriginalMember(owner = "client!client", name = "We", descriptor = "I")
	private int anInt315;

	@OriginalMember(owner = "client!client", name = "Xe", descriptor = "I")
	private int anInt316;

	@OriginalMember(owner = "client!client", name = "Ye", descriptor = "I")
	private int anInt317;

	@OriginalMember(owner = "client!client", name = "Ze", descriptor = "I")
	private int anInt318;

	@OriginalMember(owner = "client!client", name = "af", descriptor = "Lclient!jb;")
	private Class1_Sub1_Sub2_Sub3 aClass1_Sub1_Sub2_Sub3_6;

	@OriginalMember(owner = "client!client", name = "bf", descriptor = "Lclient!jb;")
	private Class1_Sub1_Sub2_Sub3 aClass1_Sub1_Sub2_Sub3_7;

	@OriginalMember(owner = "client!client", name = "cf", descriptor = "Lclient!jb;")
	private Class1_Sub1_Sub2_Sub3 aClass1_Sub1_Sub2_Sub3_8;

	@OriginalMember(owner = "client!client", name = "ff", descriptor = "Lclient!jb;")
	private Class1_Sub1_Sub2_Sub3 aClass1_Sub1_Sub2_Sub3_9;

	@OriginalMember(owner = "client!client", name = "gf", descriptor = "Lclient!jb;")
	private Class1_Sub1_Sub2_Sub3 aClass1_Sub1_Sub2_Sub3_10;

	@OriginalMember(owner = "client!client", name = "hf", descriptor = "Lclient!jb;")
	private Class1_Sub1_Sub2_Sub3 aClass1_Sub1_Sub2_Sub3_11;

	@OriginalMember(owner = "client!client", name = "jf", descriptor = "Lclient!jb;")
	private Class1_Sub1_Sub2_Sub3 aClass1_Sub1_Sub2_Sub3_12;

	@OriginalMember(owner = "client!client", name = "kf", descriptor = "Lclient!jb;")
	private Class1_Sub1_Sub2_Sub3 aClass1_Sub1_Sub2_Sub3_13;

	@OriginalMember(owner = "client!client", name = "lf", descriptor = "I")
	private int anInt319;

	@OriginalMember(owner = "client!client", name = "mf", descriptor = "Ljava/net/Socket;")
	private Socket aSocket1;

	@OriginalMember(owner = "client!client", name = "nf", descriptor = "I")
	private int anInt320;

	@OriginalMember(owner = "client!client", name = "of", descriptor = "Lclient!qb;")
	private Class35 aClass35_12;

	@OriginalMember(owner = "client!client", name = "pf", descriptor = "Lclient!qb;")
	private Class35 aClass35_13;

	@OriginalMember(owner = "client!client", name = "qf", descriptor = "Lclient!qb;")
	private Class35 aClass35_14;

	@OriginalMember(owner = "client!client", name = "rf", descriptor = "Lclient!qb;")
	private Class35 aClass35_15;

	@OriginalMember(owner = "client!client", name = "sf", descriptor = "I")
	private int anInt321;

	@OriginalMember(owner = "client!client", name = "tf", descriptor = "I")
	private int anInt322;

	@OriginalMember(owner = "client!client", name = "uf", descriptor = "I")
	private int anInt323;

	@OriginalMember(owner = "client!client", name = "wf", descriptor = "I")
	private int anInt325;

	@OriginalMember(owner = "client!client", name = "Bf", descriptor = "I")
	private int anInt326;

	@OriginalMember(owner = "client!client", name = "Cf", descriptor = "I")
	private int anInt327;

	@OriginalMember(owner = "client!client", name = "Df", descriptor = "I")
	private int anInt328;

	@OriginalMember(owner = "client!client", name = "Ef", descriptor = "Ljava/lang/String;")
	private String aString13;

	@OriginalMember(owner = "client!client", name = "Mf", descriptor = "I")
	private int anInt329;

	@OriginalMember(owner = "client!client", name = "Of", descriptor = "I")
	private int anInt330;

	@OriginalMember(owner = "client!client", name = "Qf", descriptor = "I")
	private int anInt331;

	@OriginalMember(owner = "client!client", name = "Sf", descriptor = "I")
	private int anInt332;

	@OriginalMember(owner = "client!client", name = "Tf", descriptor = "I")
	private int anInt333;

	@OriginalMember(owner = "client!client", name = "Vf", descriptor = "I")
	private int anInt334;

	@OriginalMember(owner = "client!client", name = "Wf", descriptor = "I")
	private int anInt335;

	@OriginalMember(owner = "client!client", name = "Xf", descriptor = "I")
	private int anInt336;

	@OriginalMember(owner = "client!client", name = "Yf", descriptor = "I")
	private int anInt337;

	@OriginalMember(owner = "client!client", name = "Zf", descriptor = "I")
	private int anInt338;

	@OriginalMember(owner = "client!client", name = "eg", descriptor = "Lclient!r;")
	private Class37 aClass37_1;

	@OriginalMember(owner = "client!client", name = "fg", descriptor = "Lclient!ib;")
	private Class1_Sub1_Sub2_Sub2 aClass1_Sub1_Sub2_Sub2_4;

	@OriginalMember(owner = "client!client", name = "hg", descriptor = "I")
	private int anInt341;

	@OriginalMember(owner = "client!client", name = "ig", descriptor = "Lclient!qb;")
	private Class35 aClass35_16;

	@OriginalMember(owner = "client!client", name = "jg", descriptor = "Lclient!qb;")
	private Class35 aClass35_17;

	@OriginalMember(owner = "client!client", name = "kg", descriptor = "Lclient!qb;")
	private Class35 aClass35_18;

	@OriginalMember(owner = "client!client", name = "lg", descriptor = "Lclient!qb;")
	private Class35 aClass35_19;

	@OriginalMember(owner = "client!client", name = "mg", descriptor = "Lclient!qb;")
	private Class35 aClass35_20;

	@OriginalMember(owner = "client!client", name = "ng", descriptor = "Lclient!qb;")
	private Class35 aClass35_21;

	@OriginalMember(owner = "client!client", name = "og", descriptor = "Lclient!qb;")
	private Class35 aClass35_22;

	@OriginalMember(owner = "client!client", name = "pg", descriptor = "Lclient!qb;")
	private Class35 aClass35_23;

	@OriginalMember(owner = "client!client", name = "qg", descriptor = "Lclient!qb;")
	private Class35 aClass35_24;

	@OriginalMember(owner = "client!client", name = "ug", descriptor = "[I")
	private int[] anIntArray66;

	@OriginalMember(owner = "client!client", name = "vg", descriptor = "[I")
	private int[] anIntArray67;

	@OriginalMember(owner = "client!client", name = "wg", descriptor = "[I")
	private int[] anIntArray68;

	@OriginalMember(owner = "client!client", name = "zg", descriptor = "I")
	private int anInt344;

	@OriginalMember(owner = "client!client", name = "Ag", descriptor = "I")
	private int anInt345;

	@OriginalMember(owner = "client!client", name = "Bg", descriptor = "I")
	private int anInt346;

	@OriginalMember(owner = "client!client", name = "Cg", descriptor = "I")
	private int anInt347;

	@OriginalMember(owner = "client!client", name = "Eg", descriptor = "I")
	private int anInt349;

	@OriginalMember(owner = "client!client", name = "Gg", descriptor = "[I")
	private int[] anIntArray69;

	@OriginalMember(owner = "client!client", name = "Hg", descriptor = "[I")
	private int[] anIntArray70;

	@OriginalMember(owner = "client!client", name = "Ig", descriptor = "[I")
	private int[] anIntArray71;

	@OriginalMember(owner = "client!client", name = "Mg", descriptor = "Lclient!ib;")
	private Class1_Sub1_Sub2_Sub2 aClass1_Sub1_Sub2_Sub2_5;

	@OriginalMember(owner = "client!client", name = "Ng", descriptor = "Lclient!ib;")
	private Class1_Sub1_Sub2_Sub2 aClass1_Sub1_Sub2_Sub2_6;

	@OriginalMember(owner = "client!client", name = "Og", descriptor = "I")
	private int anInt351;

	@OriginalMember(owner = "client!client", name = "Pg", descriptor = "I")
	private int anInt352;

	@OriginalMember(owner = "client!client", name = "Rg", descriptor = "I")
	private int anInt353;

	@OriginalMember(owner = "client!client", name = "Sg", descriptor = "I")
	private int anInt354;

	@OriginalMember(owner = "client!client", name = "Tg", descriptor = "I")
	private int anInt355;

	@OriginalMember(owner = "client!client", name = "Ug", descriptor = "Lclient!jb;")
	private Class1_Sub1_Sub2_Sub3 aClass1_Sub1_Sub2_Sub3_14;

	@OriginalMember(owner = "client!client", name = "Vg", descriptor = "Lclient!jb;")
	private Class1_Sub1_Sub2_Sub3 aClass1_Sub1_Sub2_Sub3_15;

	@OriginalMember(owner = "client!client", name = "Zg", descriptor = "I")
	private int anInt357;

	@OriginalMember(owner = "client!client", name = "lh", descriptor = "I")
	private int anInt360;

	@OriginalMember(owner = "client!client", name = "oh", descriptor = "J")
	private long aLong16;

	@OriginalMember(owner = "client!client", name = "ph", descriptor = "I")
	private int anInt362;

	@OriginalMember(owner = "client!client", name = "qh", descriptor = "I")
	private int anInt363;

	@OriginalMember(owner = "client!client", name = "rh", descriptor = "I")
	private int anInt364;

	@OriginalMember(owner = "client!client", name = "sh", descriptor = "I")
	private int anInt365;

	@OriginalMember(owner = "client!client", name = "uh", descriptor = "J")
	private long aLong17;

	@OriginalMember(owner = "client!client", name = "wh", descriptor = "I")
	private int anInt366;

	@OriginalMember(owner = "client!client", name = "Bh", descriptor = "Lclient!e;")
	private Class8 aClass8_1;

	@OriginalMember(owner = "client!client", name = "Ch", descriptor = "[[B")
	private byte[][] aByteArrayArray2;

	@OriginalMember(owner = "client!client", name = "Jh", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray5;

	@OriginalMember(owner = "client!client", name = "Lh", descriptor = "I")
	private int anInt370;

	@OriginalMember(owner = "client!client", name = "Mh", descriptor = "I")
	private int anInt371;

	@OriginalMember(owner = "client!client", name = "Nh", descriptor = "I")
	private int anInt372;

	@OriginalMember(owner = "client!client", name = "Oh", descriptor = "I")
	private int anInt373;

	@OriginalMember(owner = "client!client", name = "Ph", descriptor = "I")
	private int anInt374;

	@OriginalMember(owner = "client!client", name = "Uh", descriptor = "I")
	private int anInt375;

	@OriginalMember(owner = "client!client", name = "Vh", descriptor = "I")
	private int anInt376;

	@OriginalMember(owner = "client!client", name = "Wh", descriptor = "I")
	private int anInt377;

	@OriginalMember(owner = "client!client", name = "Yh", descriptor = "I")
	private int anInt379;

	@OriginalMember(owner = "client!client", name = "Zh", descriptor = "I")
	private int anInt380;

	@OriginalMember(owner = "client!client", name = "bi", descriptor = "I")
	private int anInt382;

	@OriginalMember(owner = "client!client", name = "hi", descriptor = "I")
	private int anInt384;

	@OriginalMember(owner = "client!client", name = "ii", descriptor = "I")
	private int anInt385;

	@OriginalMember(owner = "client!client", name = "ni", descriptor = "Lclient!qb;")
	private Class35 aClass35_25;

	@OriginalMember(owner = "client!client", name = "oi", descriptor = "Lclient!qb;")
	private Class35 aClass35_26;

	@OriginalMember(owner = "client!client", name = "pi", descriptor = "Lclient!qb;")
	private Class35 aClass35_27;

	@OriginalMember(owner = "client!client", name = "qi", descriptor = "I")
	private int anInt388;

	@OriginalMember(owner = "client!client", name = "si", descriptor = "I")
	private int anInt389;

	@OriginalMember(owner = "client!client", name = "wi", descriptor = "I")
	private int anInt393;

	@OriginalMember(owner = "client!client", name = "zi", descriptor = "I")
	private int anInt396;

	@OriginalMember(owner = "client!client", name = "Ci", descriptor = "I")
	private int anInt398;

	@OriginalMember(owner = "client!client", name = "Di", descriptor = "I")
	private int anInt399;

	@OriginalMember(owner = "client!client", name = "Ei", descriptor = "I")
	private int anInt400;

	@OriginalMember(owner = "client!client", name = "Fi", descriptor = "[I")
	private int[] anIntArray83;

	@OriginalMember(owner = "client!client", name = "Gi", descriptor = "[I")
	private int[] anIntArray84;

	@OriginalMember(owner = "client!client", name = "Hi", descriptor = "I")
	private int anInt401;

	@OriginalMember(owner = "client!client", name = "Li", descriptor = "Lclient!ib;")
	private Class1_Sub1_Sub2_Sub2 aClass1_Sub1_Sub2_Sub2_7;

	@OriginalMember(owner = "client!client", name = "Ni", descriptor = "I")
	private int anInt404;

	@OriginalMember(owner = "client!client", name = "Ri", descriptor = "I")
	private int anInt405;

	@OriginalMember(owner = "client!client", name = "Si", descriptor = "I")
	private int anInt406;

	@OriginalMember(owner = "client!client", name = "Ti", descriptor = "[I")
	private int[] anIntArray87;

	@OriginalMember(owner = "client!client", name = "Ui", descriptor = "[I")
	private int[] anIntArray88;

	@OriginalMember(owner = "client!client", name = "Vi", descriptor = "[I")
	private int[] anIntArray89;

	@OriginalMember(owner = "client!client", name = "Wi", descriptor = "[I")
	private int[] anIntArray90;

	@OriginalMember(owner = "client!client", name = "Xi", descriptor = "I")
	private int anInt407;

	@OriginalMember(owner = "client!client", name = "Yi", descriptor = "I")
	private int anInt408;

	@OriginalMember(owner = "client!client", name = "Zi", descriptor = "I")
	private int anInt409;

	@OriginalMember(owner = "client!client", name = "aj", descriptor = "I")
	private int anInt410;

	@OriginalMember(owner = "client!client", name = "cj", descriptor = "I")
	private int anInt411;

	@OriginalMember(owner = "client!client", name = "dj", descriptor = "I")
	private int anInt412;

	@OriginalMember(owner = "client!client", name = "fj", descriptor = "I")
	private int anInt413;

	@OriginalMember(owner = "client!client", name = "gj", descriptor = "I")
	private int anInt414;

	@OriginalMember(owner = "client!client", name = "hj", descriptor = "I")
	private int anInt415;

	@OriginalMember(owner = "client!client", name = "ij", descriptor = "Lclient!xb;")
	private Class47 aClass47_1;

	@OriginalMember(owner = "client!client", name = "jj", descriptor = "I")
	private int anInt416;

	@OriginalMember(owner = "client!client", name = "kj", descriptor = "J")
	private long aLong18;

	@OriginalMember(owner = "client!client", name = "lj", descriptor = "I")
	private int anInt417;

	@OriginalMember(owner = "client!client", name = "nj", descriptor = "Lclient!ib;")
	private Class1_Sub1_Sub2_Sub2 aClass1_Sub1_Sub2_Sub2_8;

	@OriginalMember(owner = "client!client", name = "oj", descriptor = "Lclient!ib;")
	private Class1_Sub1_Sub2_Sub2 aClass1_Sub1_Sub2_Sub2_9;

	@OriginalMember(owner = "client!client", name = "uj", descriptor = "I")
	private int anInt422;

	@OriginalMember(owner = "client!client", name = "vj", descriptor = "I")
	private int anInt423;

	@OriginalMember(owner = "client!client", name = "wj", descriptor = "I")
	private int anInt424;

	@OriginalMember(owner = "client!client", name = "xj", descriptor = "I")
	private int anInt425;

	@OriginalMember(owner = "client!client", name = "yj", descriptor = "I")
	private int anInt426;

	@OriginalMember(owner = "client!client", name = "Aj", descriptor = "Lclient!ub;")
	private Class44_Sub1 aClass44_Sub1_1;

	@OriginalMember(owner = "client!client", name = "Cj", descriptor = "Lclient!jb;")
	private Class1_Sub1_Sub2_Sub3 aClass1_Sub1_Sub2_Sub3_16;

	@OriginalMember(owner = "client!client", name = "Dj", descriptor = "Lclient!jb;")
	private Class1_Sub1_Sub2_Sub3 aClass1_Sub1_Sub2_Sub3_17;

	@OriginalMember(owner = "client!client", name = "Ej", descriptor = "Lclient!jb;")
	private Class1_Sub1_Sub2_Sub3 aClass1_Sub1_Sub2_Sub3_18;

	@OriginalMember(owner = "client!client", name = "Fj", descriptor = "Lclient!jb;")
	private Class1_Sub1_Sub2_Sub3 aClass1_Sub1_Sub2_Sub3_19;

	@OriginalMember(owner = "client!client", name = "Gj", descriptor = "Lclient!jb;")
	private Class1_Sub1_Sub2_Sub3 aClass1_Sub1_Sub2_Sub3_20;

	@OriginalMember(owner = "client!client", name = "Ij", descriptor = "Lclient!ib;")
	private Class1_Sub1_Sub2_Sub2 aClass1_Sub1_Sub2_Sub2_10;

	@OriginalMember(owner = "client!client", name = "Jj", descriptor = "Lclient!ib;")
	private Class1_Sub1_Sub2_Sub2 aClass1_Sub1_Sub2_Sub2_11;

	@OriginalMember(owner = "client!client", name = "Kj", descriptor = "Lclient!ib;")
	private Class1_Sub1_Sub2_Sub2 aClass1_Sub1_Sub2_Sub2_12;

	@OriginalMember(owner = "client!client", name = "Lj", descriptor = "Lclient!ib;")
	private Class1_Sub1_Sub2_Sub2 aClass1_Sub1_Sub2_Sub2_13;

	@OriginalMember(owner = "client!client", name = "L", descriptor = "I")
	private int anInt219 = 3;

	@OriginalMember(owner = "client!client", name = "M", descriptor = "[J")
	private long[] aLongArray3 = new long[200];

	@OriginalMember(owner = "client!client", name = "O", descriptor = "B")
	private byte aByte2 = 8;

	@OriginalMember(owner = "client!client", name = "P", descriptor = "Z")
	private boolean aBoolean47 = false;

	@OriginalMember(owner = "client!client", name = "Q", descriptor = "[Lclient!ib;")
	private Class1_Sub1_Sub2_Sub2[] aClass1_Sub1_Sub2_Sub2Array3 = new Class1_Sub1_Sub2_Sub2[8];

	@OriginalMember(owner = "client!client", name = "R", descriptor = "Z")
	private boolean aBoolean48 = false;

	@OriginalMember(owner = "client!client", name = "T", descriptor = "Z")
	private boolean aBoolean49 = false;

	@OriginalMember(owner = "client!client", name = "V", descriptor = "[I")
	private int[] anIntArray32 = new int[1000];

	@OriginalMember(owner = "client!client", name = "W", descriptor = "[I")
	private int[] anIntArray33 = new int[1000];

	@OriginalMember(owner = "client!client", name = "ab", descriptor = "[Lclient!ib;")
	private Class1_Sub1_Sub2_Sub2[] aClass1_Sub1_Sub2_Sub2Array4 = new Class1_Sub1_Sub2_Sub2[100];

	@OriginalMember(owner = "client!client", name = "cb", descriptor = "I")
	private int anInt224 = 753;

	@OriginalMember(owner = "client!client", name = "eb", descriptor = "I")
	private int anInt225 = -1;

	@OriginalMember(owner = "client!client", name = "fb", descriptor = "I")
	private int anInt226 = -1;

	@OriginalMember(owner = "client!client", name = "ib", descriptor = "I")
	private int anInt229 = -1;

	@OriginalMember(owner = "client!client", name = "jb", descriptor = "B")
	private byte aByte4 = 8;

	@OriginalMember(owner = "client!client", name = "kb", descriptor = "I")
	private int anInt230 = 2048;

	@OriginalMember(owner = "client!client", name = "lb", descriptor = "I")
	private int anInt231 = 2047;

	@OriginalMember(owner = "client!client", name = "mb", descriptor = "[Lclient!ab;")
	private Class1_Sub1_Sub1_Sub1_Sub1[] aClass1_Sub1_Sub1_Sub1_Sub1Array1 = new Class1_Sub1_Sub1_Sub1_Sub1[this.anInt230];

	@OriginalMember(owner = "client!client", name = "ob", descriptor = "[I")
	private int[] anIntArray34 = new int[this.anInt230];

	@OriginalMember(owner = "client!client", name = "qb", descriptor = "[I")
	private int[] anIntArray35 = new int[this.anInt230];

	@OriginalMember(owner = "client!client", name = "rb", descriptor = "[Lclient!lb;")
	private Class1_Sub1_Sub3[] aClass1_Sub1_Sub3Array1 = new Class1_Sub1_Sub3[this.anInt230];

	@OriginalMember(owner = "client!client", name = "sb", descriptor = "B")
	private byte aByte5 = 48;

	@OriginalMember(owner = "client!client", name = "ub", descriptor = "[I")
	private final int[] anIntArray36 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

	@OriginalMember(owner = "client!client", name = "vb", descriptor = "[I")
	private int[] anIntArray37 = new int[100];

	@OriginalMember(owner = "client!client", name = "wb", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray1 = new String[100];

	@OriginalMember(owner = "client!client", name = "xb", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray2 = new String[100];

	@OriginalMember(owner = "client!client", name = "yb", descriptor = "[Lclient!vb;")
	public Class45[] aClass45Array1 = new Class45[5];

	@OriginalMember(owner = "client!client", name = "zb", descriptor = "Z")
	private boolean aBoolean50 = true;

	@OriginalMember(owner = "client!client", name = "Ab", descriptor = "Z")
	private boolean aBoolean51 = false;

	@OriginalMember(owner = "client!client", name = "Bb", descriptor = "I")
	private int anInt235 = -1;

	@OriginalMember(owner = "client!client", name = "Cb", descriptor = "[I")
	private int[] anIntArray38 = new int[50];

	@OriginalMember(owner = "client!client", name = "Db", descriptor = "Lclient!ob;")
	private Class29 aClass29_1 = new Class29(464);

	@OriginalMember(owner = "client!client", name = "Eb", descriptor = "I")
	private int anInt236 = 2301979;

	@OriginalMember(owner = "client!client", name = "Fb", descriptor = "[Lclient!ib;")
	private Class1_Sub1_Sub2_Sub2[] aClass1_Sub1_Sub2_Sub2Array5 = new Class1_Sub1_Sub2_Sub2[1000];

	@OriginalMember(owner = "client!client", name = "Hb", descriptor = "Z")
	private boolean aBoolean52 = false;

	@OriginalMember(owner = "client!client", name = "Ib", descriptor = "[I")
	private int[] anIntArray39 = new int[256];

	@OriginalMember(owner = "client!client", name = "Jb", descriptor = "B")
	private byte aByte6 = -41;

	@OriginalMember(owner = "client!client", name = "Kb", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray3 = new String[5];

	@OriginalMember(owner = "client!client", name = "Lb", descriptor = "[Z")
	private boolean[] aBooleanArray3 = new boolean[5];

	@OriginalMember(owner = "client!client", name = "Mb", descriptor = "Z")
	private boolean aBoolean53 = true;

	@OriginalMember(owner = "client!client", name = "Ob", descriptor = "Z")
	private boolean aBoolean54 = true;

	@OriginalMember(owner = "client!client", name = "Tb", descriptor = "Ljava/lang/String;")
	private String aString4 = "";

	@OriginalMember(owner = "client!client", name = "Wb", descriptor = "Z")
	private boolean aBoolean55 = false;

	@OriginalMember(owner = "client!client", name = "Zb", descriptor = "Z")
	private boolean aBoolean56 = false;

	@OriginalMember(owner = "client!client", name = "bc", descriptor = "[Lclient!jc;")
	private Class19[] aClass19Array1 = new Class19[4];

	@OriginalMember(owner = "client!client", name = "dc", descriptor = "I")
	private int anInt242 = 1;

	@OriginalMember(owner = "client!client", name = "gc", descriptor = "[I")
	private int[] anIntArray40 = new int[Class30.anInt830];

	@OriginalMember(owner = "client!client", name = "ic", descriptor = "Z")
	private boolean aBoolean58 = false;

	@OriginalMember(owner = "client!client", name = "lc", descriptor = "Lclient!lb;")
	private Class1_Sub1_Sub3 aClass1_Sub1_Sub3_2 = Class1_Sub1_Sub3.method468();

	@OriginalMember(owner = "client!client", name = "nc", descriptor = "Ljava/lang/String;")
	private String aString5 = "";

	@OriginalMember(owner = "client!client", name = "tc", descriptor = "[Lclient!ib;")
	private Class1_Sub1_Sub2_Sub2[] aClass1_Sub1_Sub2_Sub2Array6 = new Class1_Sub1_Sub2_Sub2[20];

	@OriginalMember(owner = "client!client", name = "uc", descriptor = "[I")
	private int[] anIntArray41 = new int[50];

	@OriginalMember(owner = "client!client", name = "wc", descriptor = "[[[Lclient!ob;")
	private Class29[][][] aClass29ArrayArrayArray1 = new Class29[4][104][104];

	@OriginalMember(owner = "client!client", name = "yc", descriptor = "Ljava/lang/String;")
	private String aString6 = "";

	@OriginalMember(owner = "client!client", name = "zc", descriptor = "Ljava/lang/String;")
	private String aString7 = "";

	@OriginalMember(owner = "client!client", name = "Gc", descriptor = "B")
	private byte aByte7 = 4;

	@OriginalMember(owner = "client!client", name = "Hc", descriptor = "Ljava/util/zip/CRC32;")
	private CRC32 aCRC32_1 = new CRC32();

	@OriginalMember(owner = "client!client", name = "Ic", descriptor = "[I")
	private int[] anIntArray44 = new int[4000];

	@OriginalMember(owner = "client!client", name = "Jc", descriptor = "[I")
	private int[] anIntArray45 = new int[4000];

	@OriginalMember(owner = "client!client", name = "Kc", descriptor = "Z")
	private boolean aBoolean59 = false;

	@OriginalMember(owner = "client!client", name = "Mc", descriptor = "I")
	private int anInt258 = 2;

	@OriginalMember(owner = "client!client", name = "Nc", descriptor = "Z")
	private boolean aBoolean60 = false;

	@OriginalMember(owner = "client!client", name = "Qc", descriptor = "Z")
	private boolean aBoolean61 = true;

	@OriginalMember(owner = "client!client", name = "Rc", descriptor = "I")
	private int anInt261 = 7759444;

	@OriginalMember(owner = "client!client", name = "Tc", descriptor = "Lclient!ob;")
	private Class29 aClass29_2 = new Class29(464);

	@OriginalMember(owner = "client!client", name = "Wc", descriptor = "Z")
	private boolean aBoolean62 = true;

	@OriginalMember(owner = "client!client", name = "Xc", descriptor = "I")
	private int anInt263 = -1;

	@OriginalMember(owner = "client!client", name = "Zc", descriptor = "I")
	private int anInt265 = 50;

	@OriginalMember(owner = "client!client", name = "ad", descriptor = "[I")
	private int[] anIntArray46 = new int[this.anInt265];

	@OriginalMember(owner = "client!client", name = "bd", descriptor = "[I")
	private int[] anIntArray47 = new int[this.anInt265];

	@OriginalMember(owner = "client!client", name = "cd", descriptor = "[I")
	private int[] anIntArray48 = new int[this.anInt265];

	@OriginalMember(owner = "client!client", name = "dd", descriptor = "[I")
	private int[] anIntArray49 = new int[this.anInt265];

	@OriginalMember(owner = "client!client", name = "ed", descriptor = "[I")
	private int[] anIntArray50 = new int[this.anInt265];

	@OriginalMember(owner = "client!client", name = "fd", descriptor = "[I")
	private int[] anIntArray51 = new int[this.anInt265];

	@OriginalMember(owner = "client!client", name = "gd", descriptor = "[I")
	private int[] anIntArray52 = new int[this.anInt265];

	@OriginalMember(owner = "client!client", name = "hd", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray4 = new String[this.anInt265];

	@OriginalMember(owner = "client!client", name = "id", descriptor = "[Lclient!z;")
	private Class1_Sub1_Sub1_Sub1_Sub2[] aClass1_Sub1_Sub1_Sub1_Sub2Array1 = new Class1_Sub1_Sub1_Sub1_Sub2[16384];

	@OriginalMember(owner = "client!client", name = "kd", descriptor = "[I")
	private int[] anIntArray53 = new int[16384];

	@OriginalMember(owner = "client!client", name = "ld", descriptor = "Z")
	private boolean aBoolean63 = true;

	@OriginalMember(owner = "client!client", name = "nd", descriptor = "[I")
	private int[] anIntArray54 = new int[1000];

	@OriginalMember(owner = "client!client", name = "od", descriptor = "B")
	private byte aByte8 = 1;

	@OriginalMember(owner = "client!client", name = "pd", descriptor = "Lclient!lb;")
	private Class1_Sub1_Sub3 aClass1_Sub1_Sub3_3 = Class1_Sub1_Sub3.method468();

	@OriginalMember(owner = "client!client", name = "rd", descriptor = "[B")
	private byte[] aByteArray2 = new byte[16384];

	@OriginalMember(owner = "client!client", name = "Hd", descriptor = "I")
	private int anInt270 = -867;

	@OriginalMember(owner = "client!client", name = "Id", descriptor = "I")
	private int anInt271 = -1;

	@OriginalMember(owner = "client!client", name = "Jd", descriptor = "[I")
	private int[] anIntArray55 = new int[7];

	@OriginalMember(owner = "client!client", name = "Nd", descriptor = "Z")
	private boolean aBoolean64 = false;

	@OriginalMember(owner = "client!client", name = "Od", descriptor = "Ljava/lang/String;")
	private String aString10 = "";

	@OriginalMember(owner = "client!client", name = "Pd", descriptor = "Lclient!lb;")
	private Class1_Sub1_Sub3 aClass1_Sub1_Sub3_4 = Class1_Sub1_Sub3.method468();

	@OriginalMember(owner = "client!client", name = "Qd", descriptor = "Z")
	private boolean aBoolean65 = true;

	@OriginalMember(owner = "client!client", name = "ce", descriptor = "Ljava/lang/String;")
	private String aString11 = "";

	@OriginalMember(owner = "client!client", name = "ge", descriptor = "Z")
	private boolean aBoolean66 = false;

	@OriginalMember(owner = "client!client", name = "he", descriptor = "[Lclient!jb;")
	private Class1_Sub1_Sub2_Sub3[] aClass1_Sub1_Sub2_Sub3Array2 = new Class1_Sub1_Sub2_Sub3[2];

	@OriginalMember(owner = "client!client", name = "ie", descriptor = "[[I")
	private int[][] anIntArrayArray3 = new int[104][104];

	@OriginalMember(owner = "client!client", name = "je", descriptor = "I")
	private int anInt287 = 19639;

	@OriginalMember(owner = "client!client", name = "ke", descriptor = "[I")
	private int[] anIntArray56 = new int[9];

	@OriginalMember(owner = "client!client", name = "le", descriptor = "B")
	private byte aByte9 = 9;

	@OriginalMember(owner = "client!client", name = "se", descriptor = "[I")
	private int[] anIntArray57 = new int[33];

	@OriginalMember(owner = "client!client", name = "te", descriptor = "B")
	private byte aByte10 = 1;

	@OriginalMember(owner = "client!client", name = "ve", descriptor = "B")
	private byte aByte11 = 16;

	@OriginalMember(owner = "client!client", name = "we", descriptor = "[I")
	private int[] anIntArray58 = new int[5];

	@OriginalMember(owner = "client!client", name = "xe", descriptor = "Z")
	private boolean aBoolean67 = false;

	@OriginalMember(owner = "client!client", name = "Me", descriptor = "Z")
	private boolean aBoolean68 = false;

	@OriginalMember(owner = "client!client", name = "Ne", descriptor = "I")
	private int anInt308 = 3;

	@OriginalMember(owner = "client!client", name = "Oe", descriptor = "I")
	private int anInt309 = 3353893;

	@OriginalMember(owner = "client!client", name = "Te", descriptor = "[I")
	private int[] anIntArray59 = new int[200];

	@OriginalMember(owner = "client!client", name = "Ue", descriptor = "Z")
	private boolean aBoolean69 = false;

	@OriginalMember(owner = "client!client", name = "ef", descriptor = "Z")
	public boolean aBoolean71 = false;

	@OriginalMember(owner = "client!client", name = "vf", descriptor = "I")
	private int anInt324 = -1;

	@OriginalMember(owner = "client!client", name = "xf", descriptor = "[I")
	private int[] anIntArray60 = new int[500];

	@OriginalMember(owner = "client!client", name = "yf", descriptor = "[I")
	private int[] anIntArray61 = new int[500];

	@OriginalMember(owner = "client!client", name = "zf", descriptor = "[I")
	private int[] anIntArray62 = new int[500];

	@OriginalMember(owner = "client!client", name = "Af", descriptor = "[I")
	private int[] anIntArray63 = new int[500];

	@OriginalMember(owner = "client!client", name = "Ff", descriptor = "Z")
	private boolean aBoolean72 = false;

	@OriginalMember(owner = "client!client", name = "Gf", descriptor = "[[I")
	private int[][] anIntArrayArray4 = new int[104][104];

	@OriginalMember(owner = "client!client", name = "If", descriptor = "[Lclient!jb;")
	private Class1_Sub1_Sub2_Sub3[] aClass1_Sub1_Sub2_Sub3Array3 = new Class1_Sub1_Sub2_Sub3[100];

	@OriginalMember(owner = "client!client", name = "Jf", descriptor = "Ljava/lang/String;")
	private String aString14 = "";

	@OriginalMember(owner = "client!client", name = "Kf", descriptor = "Z")
	private boolean aBoolean73 = false;

	@OriginalMember(owner = "client!client", name = "Lf", descriptor = "B")
	private byte aByte12 = 1;

	@OriginalMember(owner = "client!client", name = "Nf", descriptor = "Z")
	private boolean aBoolean74 = false;

	@OriginalMember(owner = "client!client", name = "Pf", descriptor = "Z")
	private boolean aBoolean75 = false;

	@OriginalMember(owner = "client!client", name = "Rf", descriptor = "[Lclient!ib;")
	private Class1_Sub1_Sub2_Sub2[] aClass1_Sub1_Sub2_Sub2Array7 = new Class1_Sub1_Sub2_Sub2[20];

	@OriginalMember(owner = "client!client", name = "Uf", descriptor = "[I")
	private int[] anIntArray65 = new int[Class30.anInt830];

	@OriginalMember(owner = "client!client", name = "gg", descriptor = "Z")
	private boolean aBoolean78 = false;

	@OriginalMember(owner = "client!client", name = "sg", descriptor = "I")
	private int anInt342 = -1;

	@OriginalMember(owner = "client!client", name = "tg", descriptor = "I")
	private int anInt343 = -38693;

	@OriginalMember(owner = "client!client", name = "xg", descriptor = "Ljava/lang/String;")
	private String aString16 = "";

	@OriginalMember(owner = "client!client", name = "yg", descriptor = "Ljava/lang/String;")
	private String aString17 = "";

	@OriginalMember(owner = "client!client", name = "Dg", descriptor = "I")
	private int anInt348 = -1;

	@OriginalMember(owner = "client!client", name = "Fg", descriptor = "I")
	private int anInt350 = 2;

	@OriginalMember(owner = "client!client", name = "Jg", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray5 = new String[200];

	@OriginalMember(owner = "client!client", name = "Kg", descriptor = "B")
	private byte aByte13 = 73;

	@OriginalMember(owner = "client!client", name = "Qg", descriptor = "Z")
	private boolean aBoolean79 = false;

	@OriginalMember(owner = "client!client", name = "Wg", descriptor = "I")
	private int anInt356 = 6;

	@OriginalMember(owner = "client!client", name = "bh", descriptor = "[I")
	private int[] anIntArray73 = new int[5];

	@OriginalMember(owner = "client!client", name = "fh", descriptor = "[I")
	private int[] anIntArray74 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

	@OriginalMember(owner = "client!client", name = "gh", descriptor = "[J")
	private long[] aLongArray4 = new long[100];

	@OriginalMember(owner = "client!client", name = "hh", descriptor = "[[I")
	private int[][] anIntArrayArray6 = new int[104][104];

	@OriginalMember(owner = "client!client", name = "ih", descriptor = "Z")
	private boolean aBoolean81 = true;

	@OriginalMember(owner = "client!client", name = "jh", descriptor = "B")
	private byte aByte15 = -5;

	@OriginalMember(owner = "client!client", name = "kh", descriptor = "Lclient!ob;")
	private Class29 aClass29_3 = new Class29(464);

	@OriginalMember(owner = "client!client", name = "mh", descriptor = "I")
	private int anInt361 = 1;

	@OriginalMember(owner = "client!client", name = "nh", descriptor = "[I")
	private int[] anIntArray75 = new int[5];

	@OriginalMember(owner = "client!client", name = "th", descriptor = "Z")
	private boolean aBoolean82 = false;

	@OriginalMember(owner = "client!client", name = "vh", descriptor = "[I")
	private int[] anIntArray76 = new int[5];

	@OriginalMember(owner = "client!client", name = "xh", descriptor = "B")
	private byte aByte16 = 1;

	@OriginalMember(owner = "client!client", name = "Ah", descriptor = "[I")
	private int[] anIntArray77 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

	@OriginalMember(owner = "client!client", name = "Dh", descriptor = "I")
	private final int anInt369 = 100;

	@OriginalMember(owner = "client!client", name = "Eh", descriptor = "[I")
	private int[] anIntArray78 = new int[100];

	@OriginalMember(owner = "client!client", name = "Fh", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray6 = new String[500];

	@OriginalMember(owner = "client!client", name = "Hh", descriptor = "[Lclient!jb;")
	private Class1_Sub1_Sub2_Sub3[] aClass1_Sub1_Sub2_Sub3Array4 = new Class1_Sub1_Sub2_Sub3[13];

	@OriginalMember(owner = "client!client", name = "Ih", descriptor = "Lclient!d;")
	private Class6 aClass6_1 = new Class6();

	@OriginalMember(owner = "client!client", name = "Kh", descriptor = "Z")
	private boolean aBoolean83 = false;

	@OriginalMember(owner = "client!client", name = "Qh", descriptor = "[I")
	private int[] anIntArray79 = new int[151];

	@OriginalMember(owner = "client!client", name = "Rh", descriptor = "[I")
	private int[] anIntArray80 = new int[2000];

	@OriginalMember(owner = "client!client", name = "Sh", descriptor = "[I")
	public int[] anIntArray81 = new int[2000];

	@OriginalMember(owner = "client!client", name = "Th", descriptor = "Z")
	private boolean aBoolean84 = false;

	@OriginalMember(owner = "client!client", name = "Xh", descriptor = "I")
	private int anInt378 = 2;

	@OriginalMember(owner = "client!client", name = "ai", descriptor = "I")
	private int anInt381 = 5063219;

	@OriginalMember(owner = "client!client", name = "ci", descriptor = "Z")
	private boolean aBoolean85 = false;

	@OriginalMember(owner = "client!client", name = "ei", descriptor = "Z")
	private boolean aBoolean87 = false;

	@OriginalMember(owner = "client!client", name = "gi", descriptor = "I")
	private int anInt383 = -1;

	@OriginalMember(owner = "client!client", name = "ki", descriptor = "Z")
	private boolean aBoolean88 = false;

	@OriginalMember(owner = "client!client", name = "li", descriptor = "I")
	private int anInt386 = -1;

	@OriginalMember(owner = "client!client", name = "ri", descriptor = "[I")
	private int[] anIntArray82 = new int[5];

	@OriginalMember(owner = "client!client", name = "ti", descriptor = "I")
	private int anInt390 = 9;

	@OriginalMember(owner = "client!client", name = "xi", descriptor = "I")
	private int anInt394 = 78;

	@OriginalMember(owner = "client!client", name = "yi", descriptor = "I")
	private int anInt395 = -1;

	@OriginalMember(owner = "client!client", name = "Ai", descriptor = "Z")
	private boolean aBoolean89 = false;

	@OriginalMember(owner = "client!client", name = "Bi", descriptor = "I")
	private int anInt397 = 128;

	@OriginalMember(owner = "client!client", name = "Ii", descriptor = "Z")
	private boolean aBoolean90 = false;

	@OriginalMember(owner = "client!client", name = "Ji", descriptor = "[I")
	private int[] anIntArray85 = new int[50];

	@OriginalMember(owner = "client!client", name = "Ki", descriptor = "I")
	private int anInt402 = -1;

	@OriginalMember(owner = "client!client", name = "Mi", descriptor = "I")
	private int anInt403 = -1;

	@OriginalMember(owner = "client!client", name = "Oi", descriptor = "[I")
	private int[] anIntArray86 = new int[33];

	@OriginalMember(owner = "client!client", name = "Pi", descriptor = "[Z")
	private boolean[] aBooleanArray4 = new boolean[5];

	@OriginalMember(owner = "client!client", name = "Qi", descriptor = "Z")
	private boolean aBoolean91 = true;

	@OriginalMember(owner = "client!client", name = "bj", descriptor = "Z")
	private boolean aBoolean92 = false;

	@OriginalMember(owner = "client!client", name = "ej", descriptor = "Z")
	private boolean aBoolean93 = false;

	@OriginalMember(owner = "client!client", name = "qj", descriptor = "I")
	private int anInt420 = 9;

	@OriginalMember(owner = "client!client", name = "tj", descriptor = "[I")
	private int[] anIntArray92 = new int[151];

	@OriginalMember(owner = "client!client", name = "zj", descriptor = "[I")
	private int[] anIntArray93 = new int[Class30.anInt830];

	@OriginalMember(owner = "client!client", name = "Bj", descriptor = "Z")
	private boolean aBoolean94 = false;

	@OriginalMember(owner = "client!client", name = "Hj", descriptor = "B")
	private byte aByte18 = -42;

	static {
		aBoolean70 = true;
		anIntArray64 = new int[99];
		@Pc(10) int local10 = 0;
		@Pc(12) int local12;
		for (local12 = 0; local12 < 99; local12++) {
			@Pc(17) int local17 = local12 + 1;
			@Pc(30) int local30 = (int) ((double) local17 + Math.pow(2.0D, (double) local17 / 7.0D) * 300.0D);
			local10 += local30;
			anIntArray64[local12] = local10 / 4;
		}
		anInt339 = 10;
		aBoolean76 = true;
		aString15 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";
		anIntArray72 = new int[] { 9104, 10275, 7595, 3610, 7975, 8526, 918, 38802, 24466, 10145, 58654, 5027, 1457, 16565, 34991, 25486 };
		anIntArrayArray5 = new int[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, 33697, 22433, 2983, 54193 }, { 8741, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003, 25239 }, { 25238, 8742, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };
		aByte14 = 3;
		aByte17 = 8;
		aBigInteger1 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");
		aBigInteger2 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");
		anInt391 = 12601;
		anInt421 = -5861;
		anIntArray91 = new int[32];
		local10 = 2;
		for (local12 = 0; local12 < 32; local12++) {
			anIntArray91[local12] = local10 - 1;
			local10 += local10;
		}
	}

	@OriginalMember(owner = "client!client", name = "h", descriptor = "(Z)V")
	private static void method120() {
		try {
			Class37.aBoolean221 = false;
			Class1_Sub1_Sub2_Sub1.aBoolean160 = false;
			aBoolean77 = false;
			Class4.aBoolean36 = false;
		} catch (@Pc(12) RuntimeException local12) {
			signlink.reporterror("36495, " + false + ", " + local12.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "main", descriptor = "([Ljava/lang/String;)V")
	public static void main(@OriginalArg(0) String[] arg0) {
		try {
			System.out.println("RS2 user client - release #" + 297);
			if (arg0.length == 5) {
				anInt339 = Integer.parseInt(arg0[0]);
				anInt340 = Integer.parseInt(arg0[1]);
				if (arg0[2].equals("lowmem")) {
					method139();
				} else if (arg0[2].equals("highmem")) {
					method120();
				} else {
					System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
					return;
				}
				if (arg0[3].equals("free")) {
					aBoolean76 = false;
				} else if (arg0[3].equals("members")) {
					aBoolean76 = true;
				} else {
					System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
					return;
				}
				signlink.anInt953 = Integer.parseInt(arg0[4]);
				signlink.startpriv(InetAddress.getLocalHost());
				@Pc(87) client local87 = new client();
				local87.method84();
			} else {
				System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
			}
		} catch (@Pc(94) Exception local94) {
		}
	}

	@OriginalMember(owner = "client!client", name = "f", descriptor = "(B)V")
	private static void method139() {
		try {
			Class37.aBoolean221 = true;
			Class1_Sub1_Sub2_Sub1.aBoolean160 = true;
			aBoolean77 = true;
			Class4.aBoolean36 = true;
		} catch (@Pc(14) RuntimeException local14) {
			signlink.reporterror("64701, " + 66 + ", " + local14.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "f", descriptor = "(II)Ljava/lang/String;")
	private static String method173(@OriginalArg(1) int arg0) {
		try {
			@Pc(4) String local4 = String.valueOf(arg0);
			for (@Pc(14) int local14 = local4.length() - 3; local14 > 0; local14 -= 3) {
				local4 = local4.substring(0, local14) + "," + local4.substring(local14);
			}
			if (local4.length() > 8) {
				local4 = "@gre@" + local4.substring(0, local4.length() - 8) + " million @whi@(" + local4 + ")";
			} else if (local4.length() > 4) {
				local4 = "@cya@" + local4.substring(0, local4.length() - 4) + "K @whi@(" + local4 + ")";
			}
			return " " + local4;
		} catch (@Pc(94) RuntimeException local94) {
			signlink.reporterror("62647, " + 8 + ", " + arg0 + ", " + local94.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(III)Ljava/lang/String;")
	private static String method215(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		try {
			@Pc(13) int local13 = arg0 - arg1;
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
			signlink.reporterror("32577, " + arg0 + ", " + -198 + ", " + arg1 + ", " + local54.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(IB)Ljava/lang/String;")
	private static String method227(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		try {
			if (arg1 != aByte17) {
				for (@Pc(4) int local4 = 1; local4 > 0; local4++) {
				}
			}
			if (arg0 < 100000) {
				return String.valueOf(arg0);
			} else if (arg0 < 10000000) {
				return arg0 / 1000 + "K";
			} else {
				return arg0 / 1000000 + "M";
			}
		} catch (@Pc(41) RuntimeException local41) {
			signlink.reporterror("41737, " + arg0 + ", " + arg1 + ", " + local41.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(BI)V")
	private void method97(@OriginalArg(1) int arg0) {
		try {
			if (arg0 >= 0) {
				if (this.aBoolean78) {
					this.aBoolean78 = false;
					this.aBoolean68 = true;
				}
				@Pc(18) int local18 = this.anIntArray60[arg0];
				@Pc(23) int local23 = this.anIntArray61[arg0];
				@Pc(28) int local28 = this.anIntArray62[arg0];
				@Pc(33) int local33 = this.anIntArray63[arg0];
				if (local28 >= 2000) {
					local28 -= 2000;
				}
				if (local28 == 737) {
					this.method100();
				}
				@Pc(60) String local60;
				@Pc(64) int local64;
				@Pc(75) long local75;
				if (local28 == 605 || local28 == 47 || local28 == 513 || local28 == 884) {
					local60 = this.aStringArray6[arg0];
					local64 = local60.indexOf("@whi@");
					if (local64 != -1) {
						local75 = Class48.method667(local60.substring(local64 + 5).trim());
						if (local28 == 605) {
							this.method177(local75);
						}
						if (local28 == 47) {
							this.method221(local75);
						}
						if (local28 == 513) {
							this.method98(local75, this.aByte18);
						}
						if (local28 == 884) {
							this.method126(local75);
						}
					}
				}
				@Pc(129) int local129;
				if (local28 == 902) {
					local60 = this.aStringArray6[arg0];
					local64 = local60.indexOf("@whi@");
					if (local64 != -1) {
						local75 = Class48.method667(local60.substring(local64 + 5).trim());
						local129 = -1;
						for (@Pc(131) int local131 = 0; local131 < this.anInt351; local131++) {
							if (this.aLongArray3[local131] == local75) {
								local129 = local131;
								break;
							}
						}
						if (local129 != -1 && this.anIntArray59[local129] > 0) {
							this.aBoolean68 = true;
							this.aBoolean78 = false;
							this.aBoolean73 = true;
							this.aString14 = "";
							this.anInt259 = 3;
							this.aLong16 = this.aLongArray3[local129];
							this.aString4 = "Enter message to send to " + this.aStringArray5[local129];
						}
					}
				}
				@Pc(214) boolean local214;
				if (local28 == 370) {
					local214 = this.method184(local23, local18, aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray272[0], 0, 0, 0, 0, 2, 0, false, aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray273[0]);
					if (!local214) {
						this.method184(local23, local18, aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray272[0], 0, 1, 0, 0, 2, 1, false, aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray273[0]);
					}
					this.anInt344 = super.anInt214;
					this.anInt345 = super.anInt215;
					this.anInt347 = 2;
					this.anInt346 = 0;
					this.aClass1_Sub1_Sub3_4.method469(195);
					this.aClass1_Sub1_Sub3_4.method471(local18 + this.anInt302);
					this.aClass1_Sub1_Sub3_4.method471(local23 + this.anInt303);
					this.aClass1_Sub1_Sub3_4.method471(local33);
					this.aClass1_Sub1_Sub3_4.method471(this.anInt327);
				}
				if (local28 == 357) {
					this.method204(local33, 5, local23, local18);
				}
				if (local28 == 743) {
					anInt368++;
					if (anInt368 >= 124) {
						this.aClass1_Sub1_Sub3_4.method469(173);
						this.aClass1_Sub1_Sub3_4.method471(37954);
					}
					this.method204(local33, 98, local23, local18);
				}
				@Pc(325) Class1_Sub1_Sub1_Sub1_Sub1 local325;
				if (local28 == 275) {
					local325 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local33];
					if (local325 != null) {
						this.method184(local325.anIntArray273[0], local325.anIntArray272[0], aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray272[0], 0, 1, 0, 0, 2, 1, false, aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray273[0]);
						this.anInt344 = super.anInt214;
						this.anInt345 = super.anInt215;
						this.anInt347 = 2;
						this.anInt346 = 0;
						this.aClass1_Sub1_Sub3_4.method469(136);
						this.aClass1_Sub1_Sub3_4.method471(local33);
						this.aClass1_Sub1_Sub3_4.method471(this.anInt300);
						this.aClass1_Sub1_Sub3_4.method471(this.anInt298);
						this.aClass1_Sub1_Sub3_4.method471(this.anInt299);
					}
				}
				@Pc(398) Class15 local398;
				@Pc(407) String local407;
				if (local28 == 1152) {
					local398 = Class15.method361(local33);
					if (local398.aByteArray6 == null) {
						local407 = "It's a " + local398.aString25 + ".";
					} else {
						local407 = new String(local398.aByteArray6);
					}
					this.method152("", local407, 0);
				}
				if (local28 == 102) {
					this.anInt297 = 1;
					this.anInt298 = local18;
					this.anInt299 = local23;
					this.anInt300 = local33;
					this.aString12 = Class15.method361(local33).aString25;
					this.anInt326 = 0;
					this.aBoolean87 = true;
				} else {
					if (local28 == 1071) {
						this.method204(local33, 253, local23, local18);
					}
					if (local28 == 810 && this.method204(local33, 215, local23, local18)) {
						this.aClass1_Sub1_Sub3_4.method471(this.anInt300);
						this.aClass1_Sub1_Sub3_4.method471(this.anInt298);
						this.aClass1_Sub1_Sub3_4.method471(this.anInt299);
					}
					if (local28 == 563) {
						this.aClass1_Sub1_Sub3_4.method469(199);
						this.aClass1_Sub1_Sub3_4.method471(local33);
						this.aClass1_Sub1_Sub3_4.method471(local18);
						this.aClass1_Sub1_Sub3_4.method471(local23);
						this.aClass1_Sub1_Sub3_4.method471(this.anInt327);
						this.anInt310 = 0;
						this.anInt311 = local23;
						this.anInt312 = local18;
						this.anInt313 = 2;
						if (Class6.aClass6Array1[local23].anInt432 == this.anInt386) {
							this.anInt313 = 1;
						}
						if (Class6.aClass6Array1[local23].anInt432 == this.anInt235) {
							this.anInt313 = 3;
						}
					}
					if (local28 == 997 && !this.aBoolean92) {
						this.aClass1_Sub1_Sub3_4.method469(223);
						this.aClass1_Sub1_Sub3_4.method471(local23);
						this.aBoolean92 = true;
					}
					if (local28 == 131) {
						local325 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local33];
						if (local325 != null) {
							this.method184(local325.anIntArray273[0], local325.anIntArray272[0], aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray272[0], 0, 1, 0, 0, 2, 1, false, aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray273[0]);
							this.anInt344 = super.anInt214;
							this.anInt345 = super.anInt215;
							this.anInt347 = 2;
							this.anInt346 = 0;
							this.aClass1_Sub1_Sub3_4.method469(97);
							this.aClass1_Sub1_Sub3_4.method471(local33);
							this.aClass1_Sub1_Sub3_4.method471(this.anInt327);
						}
					}
					if (local28 == 524) {
						local60 = this.aStringArray6[arg0];
						local64 = local60.indexOf("@whi@");
						if (local64 != -1) {
							if (this.anInt386 == -1) {
								this.method100();
								this.aString5 = local60.substring(local64 + 5).trim();
								this.aBoolean93 = false;
								for (@Pc(665) int local665 = 0; local665 < Class6.aClass6Array1.length; local665++) {
									if (Class6.aClass6Array1[local665] != null && Class6.aClass6Array1[local665].anInt435 == 600) {
										this.anInt324 = this.anInt386 = Class6.aClass6Array1[local665].anInt432;
										break;
									}
								}
							} else {
								this.method152("", "Please close the interface you have open before using 'report abuse'", 0);
							}
						}
					}
					if (local28 == 582 || local28 == 113 || local28 == 555 || local28 == 331 || local28 == 354) {
						if (local28 == 354) {
							this.aClass1_Sub1_Sub3_4.method469(87);
						}
						if (local28 == 582) {
							if ((local33 & 0x3) == 0) {
								anInt392++;
							}
							if (anInt392 >= 133) {
								this.aClass1_Sub1_Sub3_4.method469(203);
								this.aClass1_Sub1_Sub3_4.method471(6118);
							}
							this.aClass1_Sub1_Sub3_4.method469(198);
						}
						if (local28 == 555) {
							this.aClass1_Sub1_Sub3_4.method469(130);
						}
						if (local28 == 113) {
							this.aClass1_Sub1_Sub3_4.method469(88);
						}
						if (local28 == 331) {
							this.aClass1_Sub1_Sub3_4.method469(125);
						}
						this.aClass1_Sub1_Sub3_4.method471(local33);
						this.aClass1_Sub1_Sub3_4.method471(local18);
						this.aClass1_Sub1_Sub3_4.method471(local23);
						this.anInt310 = 0;
						this.anInt311 = local23;
						this.anInt312 = local18;
						this.anInt313 = 2;
						if (Class6.aClass6Array1[local23].anInt432 == this.anInt386) {
							this.anInt313 = 1;
						}
						if (Class6.aClass6Array1[local23].anInt432 == this.anInt235) {
							this.anInt313 = 3;
						}
					}
					if (local28 == 899 && this.method204(local33, 124, local23, local18)) {
						this.aClass1_Sub1_Sub3_4.method471(this.anInt327);
					}
					@Pc(852) Class6 local852;
					if (local28 == 225) {
						this.aClass1_Sub1_Sub3_4.method469(62);
						this.aClass1_Sub1_Sub3_4.method471(local23);
						local852 = Class6.aClass6Array1[local23];
						if (local852.anIntArrayArray7 != null && local852.anIntArrayArray7[0][0] == 5) {
							local64 = local852.anIntArrayArray7[0][1];
							if (this.anIntArray81[local64] != local852.anIntArray97[0]) {
								this.anIntArray81[local64] = local852.anIntArray97[0];
								this.method133(this.anInt224, local64);
								this.aBoolean87 = true;
							}
						}
					}
					if (local28 == 625) {
						this.method204(local33, 238, local23, local18);
					}
					@Pc(914) Class1_Sub1_Sub1_Sub1_Sub2 local914;
					@Pc(937) String local937;
					if (local28 == 1714) {
						local914 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local33];
						if (local914 != null) {
							@Pc(919) Class13 local919 = local914.aClass13_2;
							if (local919.anIntArray174 != null) {
								local919 = local919.method327();
							}
							if (local919 != null) {
								if (local919.aByteArray5 == null) {
									local937 = "It's a " + local919.aString24 + ".";
								} else {
									local937 = new String(local919.aByteArray5);
								}
								this.method152("", local937, 0);
							}
						}
					}
					if (local28 == 639 || local28 == 499 || local28 == 27 || local28 == 387 || local28 == 185) {
						local325 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local33];
						if (local325 != null) {
							this.method184(local325.anIntArray273[0], local325.anIntArray272[0], aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray272[0], 0, 1, 0, 0, 2, 1, false, aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray273[0]);
							this.anInt344 = super.anInt214;
							this.anInt345 = super.anInt215;
							this.anInt347 = 2;
							this.anInt346 = 0;
							if (local28 == 387) {
								anInt240 += local33;
								if (anInt240 >= 66) {
									this.aClass1_Sub1_Sub3_4.method469(222);
									this.aClass1_Sub1_Sub3_4.method470(154);
								}
								this.aClass1_Sub1_Sub3_4.method469(241);
							}
							if (local28 == 185) {
								this.aClass1_Sub1_Sub3_4.method469(83);
							}
							if (local28 == 27) {
								this.aClass1_Sub1_Sub3_4.method469(17);
							}
							if (local28 == 499) {
								this.aClass1_Sub1_Sub3_4.method469(40);
							}
							if (local28 == 639) {
								anInt295++;
								if (anInt295 >= 52) {
									this.aClass1_Sub1_Sub3_4.method469(0);
									this.aClass1_Sub1_Sub3_4.method470(131);
								}
								this.aClass1_Sub1_Sub3_4.method469(10);
							}
							this.aClass1_Sub1_Sub3_4.method471(local33);
						}
					}
					if (local28 == 240) {
						local914 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local33];
						if (local914 != null) {
							this.method184(local914.anIntArray273[0], local914.anIntArray272[0], aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray272[0], 0, 1, 0, 0, 2, 1, false, aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray273[0]);
							this.anInt344 = super.anInt214;
							this.anInt345 = super.anInt215;
							this.anInt347 = 2;
							this.anInt346 = 0;
							this.aClass1_Sub1_Sub3_4.method469(100);
							this.aClass1_Sub1_Sub3_4.method471(local33);
							this.aClass1_Sub1_Sub3_4.method471(this.anInt327);
						}
					}
					if (local28 == 242 || local28 == 209 || local28 == 309 || local28 == 852 || local28 == 793) {
						local914 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local33];
						if (local914 != null) {
							this.method184(local914.anIntArray273[0], local914.anIntArray272[0], aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray272[0], 0, 1, 0, 0, 2, 1, false, aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray273[0]);
							this.anInt344 = super.anInt214;
							this.anInt345 = super.anInt215;
							this.anInt347 = 2;
							this.anInt346 = 0;
							if (local28 == 209) {
								this.aClass1_Sub1_Sub3_4.method469(4);
							}
							if (local28 == 852) {
								this.aClass1_Sub1_Sub3_4.method469(22);
							}
							if (local28 == 793) {
								this.aClass1_Sub1_Sub3_4.method469(188);
							}
							if (local28 == 242) {
								this.aClass1_Sub1_Sub3_4.method469(35);
							}
							if (local28 == 309) {
								this.aClass1_Sub1_Sub3_4.method469(239);
							}
							this.aClass1_Sub1_Sub3_4.method471(local33);
						}
					}
					if (local28 == 274) {
						local852 = Class6.aClass6Array1[local23];
						this.anInt326 = 1;
						this.anInt327 = local23;
						this.anInt328 = local852.anInt459;
						this.anInt297 = 0;
						this.aBoolean87 = true;
						local407 = local852.aString20;
						if (local407.indexOf(" ") != -1) {
							local407 = local407.substring(0, local407.indexOf(" "));
						}
						local937 = local852.aString20;
						if (local937.indexOf(" ") != -1) {
							local937 = local937.substring(local937.indexOf(" ") + 1);
						}
						this.aString13 = local407 + " " + local852.aString21 + " " + local937;
						if (this.anInt328 == 16) {
							this.aBoolean87 = true;
							this.anInt308 = 3;
							this.aBoolean66 = true;
						}
					} else {
						if (local28 == 721) {
							anInt245 += local23;
							if (anInt245 >= 139) {
								this.aClass1_Sub1_Sub3_4.method469(202);
								this.aClass1_Sub1_Sub3_4.method474(0);
							}
							this.method204(local33, 207, local23, local18);
						}
						if (local28 == 507 || local28 == 957) {
							local60 = this.aStringArray6[arg0];
							local64 = local60.indexOf("@whi@");
							if (local64 != -1) {
								local60 = local60.substring(local64 + 5).trim();
								local937 = Class48.method671(Class48.method668(Class48.method667(local60), this.anInt219));
								@Pc(1414) boolean local1414 = false;
								for (local129 = 0; local129 < this.anInt232; local129++) {
									@Pc(1426) Class1_Sub1_Sub1_Sub1_Sub1 local1426 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[this.anIntArray34[local129]];
									if (local1426 != null && local1426.aString3 != null && local1426.aString3.equalsIgnoreCase(local937)) {
										this.method184(local1426.anIntArray273[0], local1426.anIntArray272[0], aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray272[0], 0, 1, 0, 0, 2, 1, false, aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray273[0]);
										if (local28 == 507) {
											anInt240 += local33;
											if (anInt240 >= 66) {
												this.aClass1_Sub1_Sub3_4.method469(222);
												this.aClass1_Sub1_Sub3_4.method470(154);
											}
											this.aClass1_Sub1_Sub3_4.method469(241);
										}
										if (local28 == 957) {
											anInt295++;
											if (anInt295 >= 52) {
												this.aClass1_Sub1_Sub3_4.method469(0);
												this.aClass1_Sub1_Sub3_4.method470(131);
											}
											this.aClass1_Sub1_Sub3_4.method469(10);
										}
										this.aClass1_Sub1_Sub3_4.method471(this.anIntArray34[local129]);
										local1414 = true;
										break;
									}
								}
								if (!local1414) {
									this.method152("", "Unable to find " + local937, 0);
								}
							}
						}
						if (local28 == 435) {
							this.aClass1_Sub1_Sub3_4.method469(62);
							this.aClass1_Sub1_Sub3_4.method471(local23);
							local852 = Class6.aClass6Array1[local23];
							if (local852.anIntArrayArray7 != null && local852.anIntArrayArray7[0][0] == 5) {
								local64 = local852.anIntArrayArray7[0][1];
								this.anIntArray81[local64] = 1 - this.anIntArray81[local64];
								this.method133(this.anInt224, local64);
								this.aBoolean87 = true;
							}
						}
						if (local28 == 139 || local28 == 778 || local28 == 617 || local28 == 224 || local28 == 662) {
							local214 = this.method184(local23, local18, aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray272[0], 0, 0, 0, 0, 2, 0, false, aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray273[0]);
							if (!local214) {
								this.method184(local23, local18, aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray272[0], 0, 1, 0, 0, 2, 1, false, aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray273[0]);
							}
							this.anInt344 = super.anInt214;
							this.anInt345 = super.anInt215;
							this.anInt347 = 2;
							this.anInt346 = 0;
							if (local28 == 662) {
								anInt244 += this.anInt303;
								if (anInt244 >= 118) {
									this.aClass1_Sub1_Sub3_4.method469(26);
									this.aClass1_Sub1_Sub3_4.method474(0);
								}
								this.aClass1_Sub1_Sub3_4.method469(211);
							}
							if (local28 == 617) {
								this.aClass1_Sub1_Sub3_4.method469(60);
							}
							if (local28 == 778) {
								this.aClass1_Sub1_Sub3_4.method469(42);
							}
							if (local28 == 139) {
								if ((local18 & 0x3) == 0) {
									anInt248++;
								}
								if (anInt248 >= 123) {
									this.aClass1_Sub1_Sub3_4.method469(58);
									this.aClass1_Sub1_Sub3_4.method474(0);
								}
								this.aClass1_Sub1_Sub3_4.method469(27);
							}
							if (local28 == 224) {
								anInt418 += local23;
								if (anInt418 >= 75) {
									this.aClass1_Sub1_Sub3_4.method469(41);
									this.aClass1_Sub1_Sub3_4.method470(19);
								}
								this.aClass1_Sub1_Sub3_4.method469(123);
							}
							this.aClass1_Sub1_Sub3_4.method471(local18 + this.anInt302);
							this.aClass1_Sub1_Sub3_4.method471(local23 + this.anInt303);
							this.aClass1_Sub1_Sub3_4.method471(local33);
						}
						if (local28 == 231) {
							local852 = Class6.aClass6Array1[local23];
							@Pc(1786) boolean local1786 = true;
							if (local852.anInt435 > 0) {
								local1786 = this.method149(local852);
							}
							if (local1786) {
								this.aClass1_Sub1_Sub3_4.method469(62);
								this.aClass1_Sub1_Sub3_4.method471(local23);
							}
						}
						if (local28 == 1381) {
							@Pc(1814) int local1814 = local33 >> 14 & 0x7FFF;
							@Pc(1817) Class9 local1817 = Class9.method288(local1814);
							if (local1817.aByteArray4 == null) {
								local937 = "It's a " + local1817.aString23 + ".";
							} else {
								local937 = new String(local1817.aByteArray4);
							}
							this.method152("", local937, 0);
						}
						if (local28 == 829) {
							local914 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local33];
							if (local914 != null) {
								this.method184(local914.anIntArray273[0], local914.anIntArray272[0], aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray272[0], 0, 1, 0, 0, 2, 1, false, aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray273[0]);
								this.anInt344 = super.anInt214;
								this.anInt345 = super.anInt215;
								this.anInt347 = 2;
								this.anInt346 = 0;
								this.aClass1_Sub1_Sub3_4.method469(120);
								this.aClass1_Sub1_Sub3_4.method471(local33);
								this.aClass1_Sub1_Sub3_4.method471(this.anInt300);
								this.aClass1_Sub1_Sub3_4.method471(this.anInt298);
								this.aClass1_Sub1_Sub3_4.method471(this.anInt299);
							}
						}
						if (local28 == 111) {
							local214 = this.method184(local23, local18, aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray272[0], 0, 0, 0, 0, 2, 0, false, aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray273[0]);
							if (!local214) {
								this.method184(local23, local18, aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray272[0], 0, 1, 0, 0, 2, 1, false, aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray273[0]);
							}
							this.anInt344 = super.anInt214;
							this.anInt345 = super.anInt215;
							this.anInt347 = 2;
							this.anInt346 = 0;
							this.aClass1_Sub1_Sub3_4.method469(163);
							this.aClass1_Sub1_Sub3_4.method471(local18 + this.anInt302);
							this.aClass1_Sub1_Sub3_4.method471(local23 + this.anInt303);
							this.aClass1_Sub1_Sub3_4.method471(local33);
							this.aClass1_Sub1_Sub3_4.method471(this.anInt300);
							this.aClass1_Sub1_Sub3_4.method471(this.anInt298);
							this.aClass1_Sub1_Sub3_4.method471(this.anInt299);
						}
						if (local28 == 398) {
							this.aClass1_Sub1_Sub3_4.method469(101);
							this.aClass1_Sub1_Sub3_4.method471(local33);
							this.aClass1_Sub1_Sub3_4.method471(local18);
							this.aClass1_Sub1_Sub3_4.method471(local23);
							this.aClass1_Sub1_Sub3_4.method471(this.anInt300);
							this.aClass1_Sub1_Sub3_4.method471(this.anInt298);
							this.aClass1_Sub1_Sub3_4.method471(this.anInt299);
							this.anInt310 = 0;
							this.anInt311 = local23;
							this.anInt312 = local18;
							this.anInt313 = 2;
							if (Class6.aClass6Array1[local23].anInt432 == this.anInt386) {
								this.anInt313 = 1;
							}
							if (Class6.aClass6Array1[local23].anInt432 == this.anInt235) {
								this.anInt313 = 3;
							}
						}
						if (local28 == 718) {
							if (this.aBoolean64) {
								this.aClass37_1.method568(local18 - 4, local23 - 4);
							} else {
								this.aClass37_1.method568(super.anInt214 - 4, super.anInt215 - 4);
							}
						}
						if (local28 == 1328) {
							local398 = Class15.method361(local33);
							@Pc(2126) Class6 local2126 = Class6.aClass6Array1[local23];
							if (local2126 != null && local2126.anIntArray95[local18] >= 100000) {
								local407 = local2126.anIntArray95[local18] + " x " + local398.aString25;
							} else if (local398.aByteArray6 == null) {
								local407 = "It's a " + local398.aString25 + ".";
							} else {
								local407 = new String(local398.aByteArray6);
							}
							this.method152("", local407, 0);
						}
						if (local28 == 694 || local28 == 962 || local28 == 795 || local28 == 681 || local28 == 100) {
							if (local28 == 795) {
								this.aClass1_Sub1_Sub3_4.method469(213);
							}
							if (local28 == 694) {
								this.aClass1_Sub1_Sub3_4.method469(64);
							}
							if (local28 == 681) {
								anInt234++;
								if (anInt234 >= 116) {
									this.aClass1_Sub1_Sub3_4.method469(152);
									this.aClass1_Sub1_Sub3_4.method473(13018169);
								}
								this.aClass1_Sub1_Sub3_4.method469(254);
							}
							if (local28 == 100) {
								this.aClass1_Sub1_Sub3_4.method469(127);
							}
							if (local28 == 962) {
								this.aClass1_Sub1_Sub3_4.method469(156);
							}
							this.aClass1_Sub1_Sub3_4.method471(local33);
							this.aClass1_Sub1_Sub3_4.method471(local18);
							this.aClass1_Sub1_Sub3_4.method471(local23);
							this.anInt310 = 0;
							this.anInt311 = local23;
							this.anInt312 = local18;
							this.anInt313 = 2;
							if (Class6.aClass6Array1[local23].anInt432 == this.anInt386) {
								this.anInt313 = 1;
							}
							if (Class6.aClass6Array1[local23].anInt432 == this.anInt235) {
								this.anInt313 = 3;
							}
						}
						this.anInt297 = 0;
						this.anInt326 = 0;
						this.aBoolean87 = true;
					}
				}
			}
		} catch (@Pc(2312) RuntimeException local2312) {
			signlink.reporterror("70600, " + 7 + ", " + arg0 + ", " + local2312.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(JB)V")
	private void method98(@OriginalArg(0) long arg0, @OriginalArg(1) byte arg1) {
		try {
			if (arg1 == -42 && arg0 != 0L) {
				for (@Pc(12) int local12 = 0; local12 < this.anInt351; local12++) {
					if (this.aLongArray3[local12] == arg0) {
						this.anInt351--;
						this.aBoolean87 = true;
						for (@Pc(32) int local32 = local12; local32 < this.anInt351; local32++) {
							this.aStringArray5[local32] = this.aStringArray5[local32 + 1];
							this.anIntArray59[local32] = this.anIntArray59[local32 + 1];
							this.aLongArray3[local32] = this.aLongArray3[local32 + 1];
						}
						this.aClass1_Sub1_Sub3_4.method469(160);
						this.aClass1_Sub1_Sub3_4.method476(arg0, 359);
						return;
					}
				}
			}
		} catch (@Pc(87) RuntimeException local87) {
			signlink.reporterror("31879, " + arg0 + ", " + arg1 + ", " + local87.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ZLclient!ib;II)V")
	private void method99(@OriginalArg(1) Class1_Sub1_Sub2_Sub2 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		try {
			@Pc(7) int local7 = this.anInt398 + this.anInt349 & 0x7FF;
			this.aBoolean71 &= true;
			@Pc(21) int local21 = arg2 * arg2 + arg1 * arg1;
			if (local21 <= 6400) {
				@Pc(29) int local29 = Class1_Sub1_Sub1_Sub5.anIntArray151[local7];
				@Pc(33) int local33 = Class1_Sub1_Sub1_Sub5.anIntArray152[local7];
				@Pc(42) int local42 = local29 * 256 / (this.anInt241 + 256);
				@Pc(51) int local51 = local33 * 256 / (this.anInt241 + 256);
				@Pc(61) int local61 = arg1 * local42 + arg2 * local51 >> 16;
				@Pc(71) int local71 = arg1 * local51 - arg2 * local42 >> 16;
				if (local21 > 2500) {
					arg0.method397(83 - local71 - arg0.anInt672 / 2 - 4, this.aClass1_Sub1_Sub2_Sub3_7, local61 + 94 + 4 - arg0.anInt671 / 2);
				} else {
					arg0.method391(local61 + 94 + 4 - arg0.anInt671 / 2, 83 - local71 - arg0.anInt672 / 2 - 4);
				}
			}
		} catch (@Pc(125) RuntimeException local125) {
			signlink.reporterror("98282, " + true + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local125.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(Z)V")
	private void method100() {
		try {
			this.aClass1_Sub1_Sub3_4.method469(165);
			if (this.anInt383 != -1) {
				this.anInt383 = -1;
				this.aBoolean87 = true;
				this.aBoolean92 = false;
				this.aBoolean66 = true;
			}
			if (this.anInt235 != -1) {
				this.anInt235 = -1;
				this.aBoolean68 = true;
				this.aBoolean92 = false;
			}
			this.anInt386 = -1;
		} catch (@Pc(41) RuntimeException local41) {
			signlink.reporterror("65950, " + true + ", " + local41.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!ab;IIII)V")
	private void method101(@OriginalArg(0) Class1_Sub1_Sub1_Sub1_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		try {
			if (arg0 != aClass1_Sub1_Sub1_Sub1_Sub1_1 && this.anInt329 < 400) {
				@Pc(45) String local45;
				if (arg0.anInt140 == 0) {
					local45 = arg0.aString3 + method215(aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt139, arg0.anInt139) + " (level-" + arg0.anInt139 + ")";
				} else {
					local45 = arg0.aString3 + " (skill-" + arg0.anInt140 + ")";
				}
				@Pc(175) int local175;
				if (this.anInt297 == 1) {
					this.aStringArray6[this.anInt329] = "Use " + this.aString12 + " with @whi@" + local45;
					this.anIntArray62[this.anInt329] = 275;
					this.anIntArray63[this.anInt329] = arg1;
					this.anIntArray60[this.anInt329] = arg3;
					this.anIntArray61[this.anInt329] = arg2;
					this.anInt329++;
				} else if (this.anInt326 != 1) {
					for (local175 = 4; local175 >= 0; local175--) {
						if (this.aStringArray3[local175] != null) {
							this.aStringArray6[this.anInt329] = this.aStringArray3[local175] + " @whi@" + local45;
							@Pc(202) short local202 = 0;
							if (this.aStringArray3[local175].equalsIgnoreCase("attack")) {
								if (arg0.anInt139 > aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt139) {
									local202 = 2000;
								}
								if (aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt151 != 0 && arg0.anInt151 != 0) {
									if (aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt151 == arg0.anInt151) {
										local202 = 2000;
									} else {
										local202 = 0;
									}
								}
							} else if (this.aBooleanArray3[local175]) {
								local202 = 2000;
							}
							if (local175 == 0) {
								this.anIntArray62[this.anInt329] = local202 + 639;
							}
							if (local175 == 1) {
								this.anIntArray62[this.anInt329] = local202 + 499;
							}
							if (local175 == 2) {
								this.anIntArray62[this.anInt329] = local202 + 27;
							}
							if (local175 == 3) {
								this.anIntArray62[this.anInt329] = local202 + 387;
							}
							if (local175 == 4) {
								this.anIntArray62[this.anInt329] = local202 + 185;
							}
							this.anIntArray63[this.anInt329] = arg1;
							this.anIntArray60[this.anInt329] = arg3;
							this.anIntArray61[this.anInt329] = arg2;
							this.anInt329++;
						}
					}
				} else if ((this.anInt328 & 0x8) == 8) {
					this.aStringArray6[this.anInt329] = this.aString13 + " @whi@" + local45;
					this.anIntArray62[this.anInt329] = 131;
					this.anIntArray63[this.anInt329] = arg1;
					this.anIntArray60[this.anInt329] = arg3;
					this.anIntArray61[this.anInt329] = arg2;
					this.anInt329++;
				}
				for (local175 = 0; local175 < this.anInt329; local175++) {
					if (this.anIntArray62[local175] == 718) {
						this.aStringArray6[local175] = "Walk here @whi@" + local45;
						return;
					}
				}
			}
		} catch (@Pc(352) RuntimeException local352) {
			signlink.reporterror("37249, " + arg0 + ", " + arg1 + ", " + 11712 + ", " + arg2 + ", " + arg3 + ", " + local352.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!lb;BI)V")
	private void method102(@OriginalArg(0) Class1_Sub1_Sub3 arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) int arg2) {
		try {
			this.anInt267 = 0;
			this.anInt233 = 0;
			this.method229(arg2, arg0);
			this.method203(arg2, arg0);
			if (arg1 != this.aByte8) {
				this.aBoolean65 = !this.aBoolean65;
			}
			this.method198(arg0, arg2);
			this.method128(arg0, arg2);
			@Pc(48) int local48;
			for (@Pc(41) int local41 = 0; local41 < this.anInt267; local41++) {
				local48 = this.anIntArray54[local41];
				if (this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local48].anInt1049 != anInt252) {
					this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local48] = null;
				}
			}
			if (arg0.anInt763 != arg2) {
				signlink.reporterror("Error packet size mismatch in getplayer pos:" + arg0.anInt763 + " psize:" + arg2);
				throw new RuntimeException("eek");
			}
			for (local48 = 0; local48 < this.anInt232; local48++) {
				if (this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[this.anIntArray34[local48]] == null) {
					signlink.reporterror(this.aString6 + " null entry in pl list - pos:" + local48 + " size:" + this.anInt232);
					throw new RuntimeException("eek");
				}
			}
		} catch (@Pc(128) RuntimeException local128) {
			signlink.reporterror("66394, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local128.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(Z)V")
	private void method103(@OriginalArg(0) boolean arg0) {
		try {
			if (this.anInt318 > 0) {
				this.method171();
			} else {
				this.aClass35_14.method524();
				this.aClass1_Sub1_Sub2_Sub4_2.method447("Connection lost", 0, 257, 144);
				this.aClass1_Sub1_Sub2_Sub4_2.method447("Connection lost", 16777215, 256, 143);
				this.aClass1_Sub1_Sub2_Sub4_2.method447("Please wait - attempting to reestablish", 0, 257, 159);
				if (!arg0) {
					this.anInt315 = this.aClass1_Sub1_Sub3_3.method480();
				}
				this.aClass1_Sub1_Sub2_Sub4_2.method447("Please wait - attempting to reestablish", 16777215, 256, 158);
				this.aClass35_14.method525(4, 4, super.aGraphics2, this.anInt293);
				this.anInt357 = 0;
				this.anInt285 = 0;
				@Pc(67) Class8 local67 = this.aClass8_1;
				this.aBoolean71 = false;
				this.anInt249 = 0;
				this.method156(this.aString6, this.aString7, true);
				if (!this.aBoolean71) {
					this.method171();
				}
				try {
					local67.method247();
				} catch (@Pc(90) Exception local90) {
				}
			}
		} catch (@Pc(92) RuntimeException local92) {
			signlink.reporterror("71471, " + arg0 + ", " + local92.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "f", descriptor = "(Z)V")
	private void method104() {
		try {
			if (this.anInt413 > 1) {
				this.anInt413--;
			}
			if (this.anInt318 > 0) {
				this.anInt318--;
			}
			for (@Pc(22) int local22 = 0; local22 < 5 && this.method225((byte) 6); local22++) {
			}
			if (this.aBoolean71) {
				@Pc(41) Object local41 = this.aClass11_1.anObject1;
				@Pc(66) int local66;
				@Pc(68) int local68;
				@Pc(70) int local70;
				@Pc(103) int local103;
				synchronized (this.aClass11_1.anObject1) {
					if (!aBoolean80) {
						this.aClass11_1.anInt548 = 0;
					} else if (super.anInt213 != 0 || this.aClass11_1.anInt548 >= 40) {
						this.aClass1_Sub1_Sub3_4.method469(151);
						this.aClass1_Sub1_Sub3_4.method470(0);
						local66 = this.aClass1_Sub1_Sub3_4.anInt763;
						local68 = 0;
						@Pc(86) int local86;
						for (local70 = 0; local70 < this.aClass11_1.anInt548 && local66 - this.aClass1_Sub1_Sub3_4.anInt763 < 240; local70++) {
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
							if (local103 != this.anInt379 || local86 != this.anInt380) {
								@Pc(165) int local165 = local103 - this.anInt379;
								this.anInt379 = local103;
								@Pc(173) int local173 = local86 - this.anInt380;
								this.anInt380 = local86;
								if (this.anInt284 < 8 && local165 >= -32 && local165 <= 31 && local173 >= -32 && local173 <= 31) {
									local165 += 32;
									local173 += 32;
									this.aClass1_Sub1_Sub3_4.method471((this.anInt284 << 12) + (local165 << 6) + local173);
									this.anInt284 = 0;
								} else if (this.anInt284 < 8) {
									this.aClass1_Sub1_Sub3_4.method473((this.anInt284 << 19) + local120 + 8388608);
									this.anInt284 = 0;
								} else {
									this.aClass1_Sub1_Sub3_4.method474((this.anInt284 << 19) + local120 - 1073741824);
									this.anInt284 = 0;
								}
							} else if (this.anInt284 < 2047) {
								this.anInt284++;
							}
						}
						this.aClass1_Sub1_Sub3_4.method479(this.aClass1_Sub1_Sub3_4.anInt763 - local66);
						if (local68 >= this.aClass11_1.anInt548) {
							this.aClass11_1.anInt548 = 0;
						} else {
							this.aClass11_1.anInt548 -= local68;
							for (local86 = 0; local86 < this.aClass11_1.anInt548; local86++) {
								this.aClass11_1.anIntArray162[local86] = this.aClass11_1.anIntArray162[local86 + local68];
								this.aClass11_1.anIntArray163[local86] = this.aClass11_1.anIntArray163[local86 + local68];
							}
						}
					}
				}
				if (super.anInt213 != 0) {
					@Pc(336) long local336 = (super.aLong13 - this.aLong15) / 50L;
					if (local336 > 4095L) {
						local336 = 4095L;
					}
					this.aLong15 = super.aLong13;
					local66 = super.anInt215;
					if (local66 < 0) {
						local66 = 0;
					} else if (local66 > 502) {
						local66 = 502;
					}
					local68 = super.anInt214;
					if (local68 < 0) {
						local68 = 0;
					} else if (local68 > 764) {
						local68 = 764;
					}
					local70 = local66 * 765 + local68;
					@Pc(382) byte local382 = 0;
					if (super.anInt213 == 2) {
						local382 = 1;
					}
					local103 = (int) local336;
					this.aClass1_Sub1_Sub3_4.method469(240);
					this.aClass1_Sub1_Sub3_4.method474((local103 << 20) + (local382 << 19) + local70);
				}
				if (this.anInt365 > 0) {
					this.anInt365--;
				}
				if (super.anIntArray30[1] == 1 || super.anIntArray30[2] == 1 || super.anIntArray30[3] == 1 || super.anIntArray30[4] == 1) {
					this.aBoolean82 = true;
				}
				if (this.aBoolean82 && this.anInt365 <= 0) {
					this.anInt365 = 20;
					this.aBoolean82 = false;
					this.aClass1_Sub1_Sub3_4.method469(169);
					this.aClass1_Sub1_Sub3_4.method471(this.anInt397);
					this.aClass1_Sub1_Sub3_4.method471(this.anInt398);
				}
				if (super.aBoolean46 && !this.aBoolean63) {
					this.aBoolean63 = true;
					this.aClass1_Sub1_Sub3_4.method469(247);
					this.aClass1_Sub1_Sub3_4.method470(1);
				}
				if (!super.aBoolean46 && this.aBoolean63) {
					this.aBoolean63 = false;
					this.aClass1_Sub1_Sub3_4.method469(247);
					this.aClass1_Sub1_Sub3_4.method470(0);
				}
				this.method159();
				this.method205();
				this.method209();
				this.anInt316++;
				if (this.anInt316 > 750) {
					this.method103(this.aBoolean62);
				}
				this.method195();
				this.method109();
				this.method107();
				this.anInt333++;
				if (this.anInt347 != 0) {
					this.anInt346 += 20;
					if (this.anInt346 >= 400) {
						this.anInt347 = 0;
					}
				}
				if (this.anInt313 != 0) {
					this.anInt310++;
					if (this.anInt310 >= 15) {
						if (this.anInt313 == 2) {
							this.aBoolean87 = true;
						}
						if (this.anInt313 == 3) {
							this.aBoolean68 = true;
						}
						this.anInt313 = 0;
					}
				}
				if (this.anInt336 != 0) {
					this.anInt382++;
					if (super.anInt208 > this.anInt337 + 5 || super.anInt208 < this.anInt337 - 5 || super.anInt209 > this.anInt338 + 5 || super.anInt209 < this.anInt338 - 5) {
						this.aBoolean59 = true;
					}
					if (super.anInt207 == 0) {
						if (this.anInt336 == 2) {
							this.aBoolean87 = true;
						}
						if (this.anInt336 == 3) {
							this.aBoolean68 = true;
						}
						this.anInt336 = 0;
						if (this.aBoolean59 && this.anInt382 >= 5) {
							this.anInt255 = -1;
							this.method164();
							if (this.anInt255 == this.anInt334 && this.anInt254 != this.anInt335) {
								@Pc(683) Class6 local683 = Class6.aClass6Array1[this.anInt334];
								@Pc(685) byte local685 = 0;
								if (this.anInt396 == 1 && local683.anInt435 == 206) {
									local685 = 1;
								}
								if (local683.anIntArray94[this.anInt254] <= 0) {
									local685 = 0;
								}
								if (local683.aBoolean104) {
									local66 = this.anInt335;
									local68 = this.anInt254;
									local683.anIntArray94[local68] = local683.anIntArray94[local66];
									local683.anIntArray95[local68] = local683.anIntArray95[local66];
									local683.anIntArray94[local66] = -1;
									local683.anIntArray95[local66] = 0;
								} else if (local685 == 1) {
									local66 = this.anInt335;
									local68 = this.anInt254;
									while (local66 != local68) {
										if (local66 > local68) {
											local683.method232(local66, (byte) 2, local66 - 1);
											local66--;
										} else if (local66 < local68) {
											local683.method232(local66, (byte) 2, local66 + 1);
											local66++;
										}
									}
								} else {
									local683.method232(this.anInt335, (byte) 2, this.anInt254);
								}
								this.aClass1_Sub1_Sub3_4.method469(38);
								this.aClass1_Sub1_Sub3_4.method471(this.anInt334);
								this.aClass1_Sub1_Sub3_4.method471(this.anInt335);
								this.aClass1_Sub1_Sub3_4.method471(this.anInt254);
								this.aClass1_Sub1_Sub3_4.method470(local685);
							}
						} else if ((this.anInt256 == 1 || this.method224(anInt359, this.anInt329 - 1)) && this.anInt329 > 2) {
							this.method191();
						} else if (this.anInt329 > 0) {
							this.method97(this.anInt329 - 1);
						}
						this.anInt310 = 10;
						super.anInt213 = 0;
					}
				}
				anInt272++;
				if (anInt272 > 62) {
					anInt272 = 0;
					this.aClass1_Sub1_Sub3_4.method469(6);
				}
				@Pc(869) int local869;
				@Pc(871) int local871;
				if (Class37.anInt895 != -1) {
					local869 = Class37.anInt895;
					local871 = Class37.anInt896;
					@Pc(892) boolean local892 = this.method184(local871, local869, aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray272[0], 0, 0, 0, 0, 0, 0, true, aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray273[0]);
					Class37.anInt895 = -1;
					if (local892) {
						this.anInt344 = super.anInt214;
						this.anInt345 = super.anInt215;
						this.anInt347 = 1;
						this.anInt346 = 0;
					}
				}
				if (super.anInt213 == 1 && this.aString9 != null) {
					this.aString9 = null;
					this.aBoolean68 = true;
					super.anInt213 = 0;
				}
				this.method228(this.aBoolean58);
				this.method199();
				this.aBoolean71 &= true;
				this.method196();
				this.method131();
				if (super.anInt207 == 1 || super.anInt213 == 1) {
					this.anInt238++;
				}
				if (this.anInt388 == 2) {
					this.method106();
				}
				if (this.anInt388 == 2 && this.aBoolean51) {
					this.method216((byte) 2);
				}
				for (local869 = 0; local869 < 5; local869++) {
					@Pc(985) int local985 = this.anIntArray75[local869]++;
				}
				this.method142(538);
				super.anInt206++;
				if (super.anInt206 > 4500) {
					this.anInt318 = 250;
					super.anInt206 -= 500;
					this.aClass1_Sub1_Sub3_4.method469(80);
				}
				this.anInt405++;
				if (this.anInt405 > 500) {
					this.anInt405 = 0;
					local871 = (int) (Math.random() * 8.0D);
					if ((local871 & 0x1) == 1) {
						this.anInt257 += this.anInt258;
					}
					if ((local871 & 0x2) == 2) {
						this.anInt377 += this.anInt378;
					}
					if ((local871 & 0x4) == 4) {
						this.anInt360 += this.anInt361;
					}
				}
				if (this.anInt257 < -50) {
					this.anInt258 = 2;
				}
				if (this.anInt257 > 50) {
					this.anInt258 = -2;
				}
				if (this.anInt377 < -55) {
					this.anInt378 = 2;
				}
				if (this.anInt377 > 55) {
					this.anInt378 = -2;
				}
				if (this.anInt360 < -40) {
					this.anInt361 = 1;
				}
				if (this.anInt360 > 40) {
					this.anInt361 = -1;
				}
				this.anInt330++;
				if (this.anInt330 > 500) {
					this.anInt330 = 0;
					local871 = (int) (Math.random() * 8.0D);
					if ((local871 & 0x1) == 1) {
						this.anInt349 += this.anInt350;
					}
					if ((local871 & 0x2) == 2) {
						this.anInt241 += this.anInt242;
					}
				}
				if (this.anInt349 < -60) {
					this.anInt350 = 2;
				}
				if (this.anInt349 > 60) {
					this.anInt350 = -2;
				}
				if (this.anInt241 < -20) {
					this.anInt242 = 1;
				}
				if (this.anInt241 > 10) {
					this.anInt242 = -1;
				}
				this.anInt317++;
				if (this.anInt317 > 50) {
					this.aClass1_Sub1_Sub3_4.method469(115);
				}
				try {
					if (this.aClass8_1 != null && this.aClass1_Sub1_Sub3_4.anInt763 > 0) {
						this.aClass8_1.method251(this.aClass1_Sub1_Sub3_4.anInt763, this.aClass1_Sub1_Sub3_4.aByteArray9);
						this.aClass1_Sub1_Sub3_4.anInt763 = 0;
						this.anInt317 = 0;
					}
				} catch (@Pc(1227) IOException local1227) {
					this.method103(this.aBoolean62);
				} catch (@Pc(1233) Exception local1233) {
					this.method171();
				}
			}
		} catch (@Pc(1238) RuntimeException local1238) {
			signlink.reporterror("24746, " + true + ", " + local1238.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/String;)Ljava/io/DataInputStream;")
	private DataInputStream method105(@OriginalArg(0) String arg0) throws IOException {
		if (this.aBoolean60) {
			if (this.aSocket1 != null) {
				try {
					this.aSocket1.close();
				} catch (@Pc(26) Exception local26) {
				}
				this.aSocket1 = null;
			}
			this.aSocket1 = this.method168(43595);
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

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(I)V")
	private void method106() {
		try {
			try {
				@Pc(15) int local15 = aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt1009 + this.anInt257;
				@Pc(21) int local21 = aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt1010 + this.anInt377;
				if (this.anInt363 - local15 < -500 || this.anInt363 - local15 > 500 || this.anInt364 - local21 < -500 || this.anInt364 - local21 > 500) {
					this.anInt363 = local15;
					this.anInt364 = local21;
				}
				if (this.anInt363 != local15) {
					this.anInt363 += (local15 - this.anInt363) / 16;
				}
				if (this.anInt364 != local21) {
					this.anInt364 += (local21 - this.anInt364) / 16;
				}
				if (super.anIntArray30[1] == 1) {
					this.anInt399 += (-this.anInt399 - 24) / 2;
				} else if (super.anIntArray30[2] == 1) {
					this.anInt399 += (24 - this.anInt399) / 2;
				} else {
					this.anInt399 /= 2;
				}
				if (super.anIntArray30[3] == 1) {
					this.anInt400 += (12 - this.anInt400) / 2;
				} else if (super.anIntArray30[4] == 1) {
					this.anInt400 += (-this.anInt400 - 12) / 2;
				} else {
					this.anInt400 /= 2;
				}
				this.anInt398 = this.anInt398 + this.anInt399 / 2 & 0x7FF;
				this.anInt397 += this.anInt400 / 2;
				if (this.anInt397 < 128) {
					this.anInt397 = 128;
				}
				if (this.anInt397 > 383) {
					this.anInt397 = 383;
				}
				@Pc(208) int local208 = this.anInt363 >> 7;
				@Pc(213) int local213 = this.anInt364 >> 7;
				@Pc(223) int local223 = this.method200(this.anInt363, this.anInt355, this.anInt364);
				@Pc(225) int local225 = 0;
				@Pc(241) int local241;
				if (local208 > 3 && local213 > 3 && local208 < 100 && local213 < 100) {
					for (local241 = local208 - 4; local241 <= local208 + 4; local241++) {
						for (@Pc(247) int local247 = local213 - 4; local247 <= local213 + 4; local247++) {
							@Pc(252) int local252 = this.anInt355;
							if (local252 < 3 && (this.aByteArrayArrayArray7[1][local241][local247] & 0x2) == 2) {
								local252++;
							}
							@Pc(279) int local279 = local223 - this.anIntArrayArrayArray5[local252][local241][local247];
							if (local279 > local225) {
								local225 = local279;
							}
						}
					}
				}
				local241 = local225 * 192;
				if (local241 > 98048) {
					local241 = 98048;
				}
				if (local241 < 32768) {
					local241 = 32768;
				}
				if (local241 > this.anInt416) {
					this.anInt416 += (local241 - this.anInt416) / 24;
				} else if (local241 < this.anInt416) {
					this.anInt416 += (local241 - this.anInt416) / 80;
				}
			} catch (@Pc(343) Exception local343) {
				signlink.reporterror("glfc_ex " + aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt1009 + "," + aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt1010 + "," + this.anInt363 + "," + this.anInt364 + "," + this.anInt414 + "," + this.anInt415 + "," + this.anInt302 + "," + this.anInt303);
				throw new RuntimeException("eek");
			}
		} catch (@Pc(393) RuntimeException local393) {
			signlink.reporterror("39507, " + -38787 + ", " + local393.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(I)V")
	private void method107() {
		try {
			@Pc(11) int local11;
			for (@Pc(3) int local3 = -1; local3 < this.anInt232; local3++) {
				if (local3 == -1) {
					local11 = this.anInt231;
				} else {
					local11 = this.anIntArray34[local3];
				}
				@Pc(23) Class1_Sub1_Sub1_Sub1_Sub1 local23 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local11];
				if (local23 != null && local23.anInt1020 > 0) {
					local23.anInt1020--;
					if (local23.anInt1020 == 0) {
						local23.aString31 = null;
					}
				}
			}
			for (local11 = 0; local11 < this.anInt266; local11++) {
				@Pc(58) int local58 = this.anIntArray53[local11];
				@Pc(63) Class1_Sub1_Sub1_Sub1_Sub2 local63 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local58];
				if (local63 != null && local63.anInt1020 > 0) {
					local63.anInt1020--;
					if (local63.anInt1020 == 0) {
						local63.aString31 = null;
					}
				}
			}
		} catch (@Pc(87) RuntimeException local87) {
			signlink.reporterror("62623, " + -9963 + ", " + local87.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Z)V")
	@Override
	protected void method91() {
		try {
			signlink.reporterror = false;
			try {
				if (this.aClass8_1 != null) {
					this.aClass8_1.method247();
				}
			} catch (@Pc(9) Exception local9) {
			}
			this.aClass8_1 = null;
			this.method230();
			if (this.aClass11_1 != null) {
				this.aClass11_1.aBoolean145 = false;
			}
			this.aClass11_1 = null;
			this.aClass44_Sub1_1.method637();
			this.aClass44_Sub1_1 = null;
			this.aClass1_Sub1_Sub3_4 = null;
			this.aClass1_Sub1_Sub3_2 = null;
			this.aClass1_Sub1_Sub3_3 = null;
			this.anIntArray69 = null;
			this.aByteArrayArray1 = null;
			this.aByteArrayArray2 = null;
			this.anIntArray70 = null;
			this.anIntArray71 = null;
			this.anIntArrayArrayArray5 = null;
			this.aByteArrayArrayArray7 = null;
			this.aClass37_1 = null;
			this.aClass19Array1 = null;
			this.anIntArrayArray4 = null;
			this.anIntArrayArray3 = null;
			this.anIntArray44 = null;
			this.anIntArray45 = null;
			this.aByteArray2 = null;
			this.aClass35_12 = null;
			this.aClass35_13 = null;
			this.aClass35_14 = null;
			this.aClass35_15 = null;
			this.aClass35_25 = null;
			this.aClass35_26 = null;
			this.aClass35_27 = null;
			this.aClass35_3 = null;
			this.aClass35_4 = null;
			this.aClass35_5 = null;
			this.aClass35_6 = null;
			this.aClass35_7 = null;
			this.aClass35_8 = null;
			this.aClass35_9 = null;
			this.aClass35_10 = null;
			this.aClass35_11 = null;
			this.aClass1_Sub1_Sub2_Sub3_6 = null;
			this.aClass1_Sub1_Sub2_Sub3_7 = null;
			this.aClass1_Sub1_Sub2_Sub3_8 = null;
			this.aClass1_Sub1_Sub2_Sub3_16 = null;
			this.aClass1_Sub1_Sub2_Sub3_17 = null;
			this.aClass1_Sub1_Sub2_Sub3_18 = null;
			this.aClass1_Sub1_Sub2_Sub3Array4 = null;
			this.aClass1_Sub1_Sub2_Sub3_1 = null;
			this.aClass1_Sub1_Sub2_Sub3_2 = null;
			this.aClass1_Sub1_Sub2_Sub3_3 = null;
			this.aClass1_Sub1_Sub2_Sub3_4 = null;
			this.aClass1_Sub1_Sub2_Sub3_5 = null;
			this.aClass1_Sub1_Sub2_Sub3_9 = null;
			this.aClass1_Sub1_Sub2_Sub3_10 = null;
			this.aClass1_Sub1_Sub2_Sub3_11 = null;
			this.aClass1_Sub1_Sub2_Sub3_12 = null;
			this.aClass1_Sub1_Sub2_Sub3_13 = null;
			this.aClass1_Sub1_Sub2_Sub2_4 = null;
			this.aClass1_Sub1_Sub2_Sub2Array6 = null;
			this.aClass1_Sub1_Sub2_Sub2Array7 = null;
			this.aClass1_Sub1_Sub2_Sub2Array3 = null;
			this.aClass1_Sub1_Sub2_Sub2_10 = null;
			this.aClass1_Sub1_Sub2_Sub2_11 = null;
			this.aClass1_Sub1_Sub2_Sub2_12 = null;
			this.aClass1_Sub1_Sub2_Sub2_13 = null;
			this.aClass1_Sub1_Sub2_Sub3Array3 = null;
			this.aClass1_Sub1_Sub2_Sub2Array4 = null;
			this.anIntArrayArray6 = null;
			this.aClass1_Sub1_Sub1_Sub1_Sub1Array1 = null;
			this.anIntArray34 = null;
			this.anIntArray35 = null;
			this.aClass1_Sub1_Sub3Array1 = null;
			this.anIntArray54 = null;
			this.aClass1_Sub1_Sub1_Sub1_Sub2Array1 = null;
			this.anIntArray53 = null;
			this.aClass29ArrayArrayArray1 = null;
			this.aClass29_3 = null;
			this.aClass29_1 = null;
			this.aClass29_2 = null;
			this.anIntArray60 = null;
			this.anIntArray61 = null;
			this.anIntArray62 = null;
			this.anIntArray63 = null;
			this.aStringArray6 = null;
			this.anIntArray81 = null;
			this.anIntArray32 = null;
			this.anIntArray33 = null;
			this.aClass1_Sub1_Sub2_Sub2Array5 = null;
			this.aClass1_Sub1_Sub2_Sub2_3 = null;
			this.aStringArray5 = null;
			this.aLongArray3 = null;
			this.anIntArray59 = null;
			this.aClass35_19 = null;
			this.aClass35_20 = null;
			this.aClass35_16 = null;
			this.aClass35_17 = null;
			this.aClass35_18 = null;
			this.aClass35_21 = null;
			this.aClass35_22 = null;
			this.aClass35_23 = null;
			this.aClass35_24 = null;
			this.method154();
			Class9.method287();
			Class13.method322();
			Class15.method360();
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
			Class1_Sub1_Sub2_Sub1.method342();
			Class37.method529();
			Class1_Sub1_Sub1_Sub5.method257();
			Class12.method304();
			System.gc();
		} catch (@Pc(357) RuntimeException local357) {
			signlink.reporterror("43170, " + false + ", " + local357.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(B)V")
	@Override
	protected void method92(@OriginalArg(0) byte arg0) {
		try {
			@Pc(6) boolean local6 = false;
			if (this.aBoolean89 || this.aBoolean94 || this.aBoolean88) {
				this.method146();
			} else {
				anInt253++;
				if (this.aBoolean71) {
					this.method116();
				} else {
					this.method175(false);
				}
				this.anInt238 = 0;
			}
		} catch (@Pc(44) RuntimeException local44) {
			signlink.reporterror("5539, " + arg0 + ", " + local44.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(IIZ)V")
	private void method108(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1) {
		try {
			signlink.anInt957 = arg0;
			if (arg1) {
				signlink.midi = "voladjust";
			}
		} catch (@Pc(15) RuntimeException local15) {
			signlink.reporterror("9064, " + 1 + ", " + arg0 + ", " + arg1 + ", " + local15.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(B)V")
	private void method109() {
		try {
			for (@Pc(7) int local7 = 0; local7 < this.anInt266; local7++) {
				@Pc(14) int local14 = this.anIntArray53[local7];
				@Pc(19) Class1_Sub1_Sub1_Sub1_Sub2 local19 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local14];
				if (local19 != null) {
					this.method110(local19, local19.aClass13_2.aByte26);
				}
			}
		} catch (@Pc(35) RuntimeException local35) {
			signlink.reporterror("58593, " + -16 + ", " + local35.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!y;IZ)V")
	private void method110(@OriginalArg(0) Class1_Sub1_Sub1_Sub1 arg0, @OriginalArg(1) int arg1) {
		try {
			if (arg0.anInt1009 < 128 || arg0.anInt1010 < 128 || arg0.anInt1009 >= 13184 || arg0.anInt1010 >= 13184) {
				arg0.anInt1032 = -1;
				arg0.anInt1037 = -1;
				arg0.anInt1046 = 0;
				arg0.anInt1047 = 0;
				arg0.anInt1009 = arg0.anIntArray272[0] * 128 + arg0.anInt1012 * 64;
				arg0.anInt1010 = arg0.anIntArray273[0] * 128 + arg0.anInt1012 * 64;
				arg0.method679();
			}
			if (arg0 == aClass1_Sub1_Sub1_Sub1_Sub1_1 && (arg0.anInt1009 < 1536 || arg0.anInt1010 < 1536 || arg0.anInt1009 >= 11776 || arg0.anInt1010 >= 11776)) {
				arg0.anInt1032 = -1;
				arg0.anInt1037 = -1;
				arg0.anInt1046 = 0;
				arg0.anInt1047 = 0;
				arg0.anInt1009 = arg0.anIntArray272[0] * 128 + arg0.anInt1012 * 64;
				arg0.anInt1010 = arg0.anIntArray273[0] * 128 + arg0.anInt1012 * 64;
				arg0.method679();
			}
			if (arg0.anInt1046 > anInt252) {
				this.method111(arg0);
			} else if (arg0.anInt1047 >= anInt252) {
				this.method112(arg0, 841);
			} else {
				this.method113(arg0);
			}
			this.method114(arg0);
			this.method115(arg0);
		} catch (@Pc(157) RuntimeException local157) {
			signlink.reporterror("75722, " + arg0 + ", " + arg1 + ", " + true + ", " + local157.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILclient!y;)V")
	private void method111(@OriginalArg(1) Class1_Sub1_Sub1_Sub1 arg0) {
		try {
			@Pc(4) int local4 = arg0.anInt1046 - anInt252;
			@Pc(14) int local14 = arg0.anInt1042 * 128 + arg0.anInt1012 * 64;
			@Pc(24) int local24 = arg0.anInt1044 * 128 + arg0.anInt1012 * 64;
			arg0.anInt1009 += (local14 - arg0.anInt1009) / local4;
			arg0.anInt1010 += (local24 - arg0.anInt1010) / local4;
			arg0.anInt1054 = 0;
			if (arg0.anInt1048 == 0) {
				arg0.anInt1051 = 1024;
			}
			if (arg0.anInt1048 == 1) {
				arg0.anInt1051 = 1536;
			}
			if (arg0.anInt1048 == 2) {
				arg0.anInt1051 = 0;
			}
			if (arg0.anInt1048 == 3) {
				arg0.anInt1051 = 512;
			}
		} catch (@Pc(83) RuntimeException local83) {
			signlink.reporterror("81456, " + 0 + ", " + arg0 + ", " + local83.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!y;I)V")
	private void method112(@OriginalArg(0) Class1_Sub1_Sub1_Sub1 arg0, @OriginalArg(1) int arg1) {
		try {
			if (arg0.anInt1047 == anInt252 || arg0.anInt1032 == -1 || arg0.anInt1035 != 0 || arg0.anInt1034 + 1 > Class27.aClass27Array1[arg0.anInt1032].method506(arg0.anInt1033, this.aBoolean65)) {
				@Pc(30) int local30 = arg0.anInt1047 - arg0.anInt1046;
				@Pc(35) int local35 = anInt252 - arg0.anInt1046;
				@Pc(45) int local45 = arg0.anInt1042 * 128 + arg0.anInt1012 * 64;
				@Pc(55) int local55 = arg0.anInt1044 * 128 + arg0.anInt1012 * 64;
				@Pc(65) int local65 = arg0.anInt1043 * 128 + arg0.anInt1012 * 64;
				@Pc(75) int local75 = arg0.anInt1045 * 128 + arg0.anInt1012 * 64;
				arg0.anInt1009 = (local45 * (local30 - local35) + local65 * local35) / local30;
				arg0.anInt1010 = (local55 * (local30 - local35) + local75 * local35) / local30;
			}
			arg0.anInt1054 = 0;
			if (arg0.anInt1048 == 0) {
				arg0.anInt1051 = 1024;
			}
			if (arg0.anInt1048 == 1) {
				arg0.anInt1051 = 1536;
			}
			if (arg0.anInt1048 == 2) {
				arg0.anInt1051 = 0;
			}
			if (arg0.anInt1048 == 3) {
				arg0.anInt1051 = 512;
			}
			arg0.anInt1011 = arg0.anInt1051;
			@Pc(139) boolean local139 = false;
		} catch (@Pc(141) RuntimeException local141) {
			signlink.reporterror("62275, " + arg0 + ", " + arg1 + ", " + local141.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(BLclient!y;)V")
	private void method113(@OriginalArg(1) Class1_Sub1_Sub1_Sub1 arg0) {
		try {
			arg0.anInt1029 = arg0.anInt1013;
			if (arg0.anInt1053 == 0) {
				arg0.anInt1054 = 0;
			} else {
				if (arg0.anInt1032 != -1 && arg0.anInt1035 == 0) {
					@Pc(30) Class27 local30 = Class27.aClass27Array1[arg0.anInt1032];
					if (arg0.anInt1055 > 0 && local30.anInt820 == 0) {
						arg0.anInt1054++;
						return;
					}
					if (arg0.anInt1055 <= 0 && local30.anInt821 == 0) {
						arg0.anInt1054++;
						return;
					}
				}
				@Pc(59) int local59 = arg0.anInt1009;
				@Pc(62) int local62 = arg0.anInt1010;
				@Pc(77) int local77 = arg0.anIntArray272[arg0.anInt1053 - 1] * 128 + arg0.anInt1012 * 64;
				@Pc(92) int local92 = arg0.anIntArray273[arg0.anInt1053 - 1] * 128 + arg0.anInt1012 * 64;
				if (local77 - local59 <= 256 && local77 - local59 >= -256 && local92 - local62 <= 256 && local92 - local62 >= -256) {
					if (local59 < local77) {
						if (local62 < local92) {
							arg0.anInt1051 = 1280;
						} else if (local62 > local92) {
							arg0.anInt1051 = 1792;
						} else {
							arg0.anInt1051 = 1536;
						}
					} else if (local59 > local77) {
						if (local62 < local92) {
							arg0.anInt1051 = 768;
						} else if (local62 > local92) {
							arg0.anInt1051 = 256;
						} else {
							arg0.anInt1051 = 512;
						}
					} else if (local62 < local92) {
						arg0.anInt1051 = 1024;
					} else {
						arg0.anInt1051 = 0;
					}
					@Pc(186) int local186 = arg0.anInt1051 - arg0.anInt1011 & 0x7FF;
					if (local186 > 1024) {
						local186 -= 2048;
					}
					@Pc(193) int local193 = arg0.anInt1016;
					if (local186 >= -256 && local186 <= 256) {
						local193 = arg0.anInt1015;
					} else if (local186 >= 256 && local186 < 768) {
						local193 = arg0.anInt1018;
					} else if (local186 >= -768 && local186 <= -256) {
						local193 = arg0.anInt1017;
					}
					if (local193 == -1) {
						local193 = arg0.anInt1015;
					}
					arg0.anInt1029 = local193;
					@Pc(235) int local235 = 4;
					if (arg0.anInt1011 != arg0.anInt1051 && arg0.anInt1026 == -1 && arg0.anInt1052 != 0) {
						local235 = 2;
					}
					if (arg0.anInt1053 > 2) {
						local235 = 6;
					}
					if (arg0.anInt1053 > 3) {
						local235 = 8;
					}
					if (arg0.anInt1054 > 0 && arg0.anInt1053 > 1) {
						local235 = 8;
						arg0.anInt1054--;
					}
					if (arg0.aBooleanArray12[arg0.anInt1053 - 1]) {
						local235 <<= 0x1;
					}
					if (local235 >= 8 && arg0.anInt1029 == arg0.anInt1015 && arg0.anInt1019 != -1) {
						arg0.anInt1029 = arg0.anInt1019;
					}
					if (local59 < local77) {
						arg0.anInt1009 += local235;
						if (arg0.anInt1009 > local77) {
							arg0.anInt1009 = local77;
						}
					} else if (local59 > local77) {
						arg0.anInt1009 -= local235;
						if (arg0.anInt1009 < local77) {
							arg0.anInt1009 = local77;
						}
					}
					if (local62 < local92) {
						arg0.anInt1010 += local235;
						if (arg0.anInt1010 > local92) {
							arg0.anInt1010 = local92;
						}
					} else if (local62 > local92) {
						arg0.anInt1010 -= local235;
						if (arg0.anInt1010 < local92) {
							arg0.anInt1010 = local92;
						}
					}
					if (arg0.anInt1009 == local77 && arg0.anInt1010 == local92) {
						arg0.anInt1053--;
						if (arg0.anInt1055 > 0) {
							arg0.anInt1055--;
							return;
						}
					}
				} else {
					arg0.anInt1009 = local77;
					arg0.anInt1010 = local92;
				}
			}
		} catch (@Pc(397) RuntimeException local397) {
			signlink.reporterror("55091, " + 13 + ", " + arg0 + ", " + local397.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(BLclient!y;)V")
	private void method114(@OriginalArg(1) Class1_Sub1_Sub1_Sub1 arg0) {
		try {
			if (arg0.anInt1052 != 0) {
				@Pc(33) int local33;
				@Pc(39) int local39;
				if (arg0.anInt1026 != -1 && arg0.anInt1026 < 32768) {
					@Pc(25) Class1_Sub1_Sub1_Sub1_Sub2 local25 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[arg0.anInt1026];
					if (local25 != null) {
						local33 = arg0.anInt1009 - local25.anInt1009;
						local39 = arg0.anInt1010 - local25.anInt1010;
						if (local33 != 0 || local39 != 0) {
							arg0.anInt1051 = (int) (Math.atan2((double) local33, (double) local39) * 325.949D) & 0x7FF;
						}
					}
				}
				@Pc(64) int local64;
				if (arg0.anInt1026 >= 32768) {
					local64 = arg0.anInt1026 - 32768;
					if (local64 == this.anInt402) {
						local64 = this.anInt231;
					}
					@Pc(76) Class1_Sub1_Sub1_Sub1_Sub1 local76 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local64];
					if (local76 != null) {
						local39 = arg0.anInt1009 - local76.anInt1009;
						@Pc(90) int local90 = arg0.anInt1010 - local76.anInt1010;
						if (local39 != 0 || local90 != 0) {
							arg0.anInt1051 = (int) (Math.atan2((double) local39, (double) local90) * 325.949D) & 0x7FF;
						}
					}
				}
				if ((arg0.anInt1027 != 0 || arg0.anInt1028 != 0) && (arg0.anInt1053 == 0 || arg0.anInt1054 > 0)) {
					local64 = arg0.anInt1009 - (arg0.anInt1027 - this.anInt302 - this.anInt302) * 64;
					local33 = arg0.anInt1010 - (arg0.anInt1028 - this.anInt303 - this.anInt303) * 64;
					if (local64 != 0 || local33 != 0) {
						arg0.anInt1051 = (int) (Math.atan2((double) local64, (double) local33) * 325.949D) & 0x7FF;
					}
					arg0.anInt1027 = 0;
					arg0.anInt1028 = 0;
				}
				local64 = arg0.anInt1051 - arg0.anInt1011 & 0x7FF;
				if (local64 != 0) {
					if (local64 < arg0.anInt1052 || local64 > 2048 - arg0.anInt1052) {
						arg0.anInt1011 = arg0.anInt1051;
					} else if (local64 > 1024) {
						arg0.anInt1011 -= arg0.anInt1052;
					} else {
						arg0.anInt1011 += arg0.anInt1052;
					}
					arg0.anInt1011 &= 0x7FF;
					if (arg0.anInt1029 == arg0.anInt1013 && arg0.anInt1011 != arg0.anInt1051) {
						if (arg0.anInt1014 != -1) {
							arg0.anInt1029 = arg0.anInt1014;
							return;
						}
						arg0.anInt1029 = arg0.anInt1015;
						return;
					}
				}
			}
		} catch (@Pc(244) RuntimeException local244) {
			signlink.reporterror("49640, " + 5 + ", " + arg0 + ", " + local244.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ZLclient!y;)V")
	private void method115(@OriginalArg(1) Class1_Sub1_Sub1_Sub1 arg0) {
		try {
			arg0.aBoolean252 = false;
			@Pc(23) Class27 local23;
			if (arg0.anInt1029 != -1) {
				local23 = Class27.aClass27Array1[arg0.anInt1029];
				arg0.anInt1031++;
				if (arg0.anInt1030 < local23.anInt814 && arg0.anInt1031 > local23.method506(arg0.anInt1030, this.aBoolean65)) {
					arg0.anInt1031 = 0;
					arg0.anInt1030++;
				}
				if (arg0.anInt1030 >= local23.anInt814) {
					arg0.anInt1031 = 0;
					arg0.anInt1030 = 0;
				}
			}
			if (arg0.anInt1037 != -1 && anInt252 >= arg0.anInt1040) {
				if (arg0.anInt1038 < 0) {
					arg0.anInt1038 = 0;
				}
				local23 = Class33.aClass33Array1[arg0.anInt1037].aClass27_2;
				arg0.anInt1039++;
				while (arg0.anInt1038 < local23.anInt814 && arg0.anInt1039 > local23.method506(arg0.anInt1038, this.aBoolean65)) {
					arg0.anInt1039 -= local23.method506(arg0.anInt1038, this.aBoolean65);
					arg0.anInt1038++;
				}
				if (arg0.anInt1038 >= local23.anInt814 && (arg0.anInt1038 < 0 || arg0.anInt1038 >= local23.anInt814)) {
					arg0.anInt1037 = -1;
				}
			}
			if (arg0.anInt1032 != -1 && arg0.anInt1035 <= 1) {
				local23 = Class27.aClass27Array1[arg0.anInt1032];
				if (local23.anInt820 == 1 && arg0.anInt1055 > 0 && arg0.anInt1046 <= anInt252 && arg0.anInt1047 < anInt252) {
					arg0.anInt1035 = 1;
					return;
				}
			}
			if (arg0.anInt1032 != -1 && arg0.anInt1035 == 0) {
				local23 = Class27.aClass27Array1[arg0.anInt1032];
				arg0.anInt1034++;
				while (arg0.anInt1033 < local23.anInt814 && arg0.anInt1034 > local23.method506(arg0.anInt1033, this.aBoolean65)) {
					arg0.anInt1034 -= local23.method506(arg0.anInt1033, this.aBoolean65);
					arg0.anInt1033++;
				}
				if (arg0.anInt1033 >= local23.anInt814) {
					arg0.anInt1033 -= local23.anInt815;
					arg0.anInt1036++;
					if (arg0.anInt1036 >= local23.anInt819) {
						arg0.anInt1032 = -1;
					}
					if (arg0.anInt1033 < 0 || arg0.anInt1033 >= local23.anInt814) {
						arg0.anInt1032 = -1;
					}
				}
				arg0.aBoolean252 = local23.aBoolean211;
			}
			if (arg0.anInt1035 > 0) {
				arg0.anInt1035--;
			}
		} catch (@Pc(273) RuntimeException local273) {
			signlink.reporterror("18693, " + true + ", " + arg0 + ", " + local273.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(I)V")
	private void method116() {
		try {
			if (this.aBoolean75) {
				this.aBoolean75 = false;
				this.aClass35_3.method525(0, 4, super.aGraphics2, this.anInt293);
				this.aClass35_4.method525(0, 357, super.aGraphics2, this.anInt293);
				this.aClass35_5.method525(722, 4, super.aGraphics2, this.anInt293);
				this.aClass35_6.method525(743, 205, super.aGraphics2, this.anInt293);
				this.aClass35_7.method525(0, 0, super.aGraphics2, this.anInt293);
				this.aClass35_8.method525(516, 4, super.aGraphics2, this.anInt293);
				this.aClass35_9.method525(516, 205, super.aGraphics2, this.anInt293);
				this.aClass35_10.method525(496, 357, super.aGraphics2, this.anInt293);
				this.aClass35_11.method525(0, 338, super.aGraphics2, this.anInt293);
				this.aBoolean87 = true;
				this.aBoolean68 = true;
				this.aBoolean66 = true;
				this.aBoolean69 = true;
				if (this.anInt388 != 2) {
					this.aClass35_14.method525(4, 4, super.aGraphics2, this.anInt293);
					this.aClass35_13.method525(550, 4, super.aGraphics2, this.anInt293);
				}
			}
			if (this.anInt388 == 2) {
				this.method206();
			}
			if (this.aBoolean64 && this.anInt370 == 1) {
				this.aBoolean87 = true;
			}
			@Pc(159) boolean local159;
			if (this.anInt383 != -1) {
				local159 = this.method187(this.anInt333, this.anInt383);
				if (local159) {
					this.aBoolean87 = true;
				}
			}
			if (this.anInt313 == 2) {
				this.aBoolean87 = true;
			}
			if (this.anInt336 == 2) {
				this.aBoolean87 = true;
			}
			if (this.aBoolean87) {
				this.method136(aBoolean70);
				this.aBoolean87 = false;
			}
			if (this.anInt235 == -1) {
				this.aClass6_1.anInt442 = this.anInt394 - this.anInt354 - 77;
				if (super.anInt208 > 448 && super.anInt208 < 560 && super.anInt209 > 332) {
					this.method135(0, false, 77, this.aClass6_1, (byte) 8, super.anInt209 - 357, this.anInt394, super.anInt208 - 17, 463);
				}
				@Pc(241) int local241 = this.anInt394 - this.aClass6_1.anInt442 - 77;
				if (local241 < 0) {
					local241 = 0;
				}
				if (local241 > this.anInt394 - 77) {
					local241 = this.anInt394 - 77;
				}
				if (this.anInt354 != local241) {
					this.anInt354 = local241;
					this.aBoolean68 = true;
				}
			}
			if (this.anInt235 != -1) {
				local159 = this.method187(this.anInt333, this.anInt235);
				if (local159) {
					this.aBoolean68 = true;
				}
			}
			if (this.anInt313 == 3) {
				this.aBoolean68 = true;
			}
			if (this.anInt336 == 3) {
				this.aBoolean68 = true;
			}
			if (this.aString9 != null) {
				this.aBoolean68 = true;
			}
			if (this.aBoolean64 && this.anInt370 == 2) {
				this.aBoolean68 = true;
			}
			if (this.aBoolean68) {
				this.method124();
				this.aBoolean68 = false;
			}
			if (this.anInt388 == 2) {
				this.method141((byte) 1);
				this.aClass35_13.method525(550, 4, super.aGraphics2, this.anInt293);
			}
			if (this.anInt395 != -1) {
				this.aBoolean66 = true;
			}
			if (this.aBoolean66) {
				if (this.anInt395 != -1 && this.anInt395 == this.anInt308) {
					this.anInt395 = -1;
					this.aClass1_Sub1_Sub3_4.method469(36);
					this.aClass1_Sub1_Sub3_4.method470(this.anInt308);
				}
				this.aBoolean66 = false;
				this.aClass35_27.method524();
				this.aClass1_Sub1_Sub2_Sub3_18.method418(0, 0);
				if (this.anInt383 == -1) {
					if (this.anIntArray74[this.anInt308] != -1) {
						if (this.anInt308 == 0) {
							this.aClass1_Sub1_Sub2_Sub3_1.method418(22, 10);
						}
						if (this.anInt308 == 1) {
							this.aClass1_Sub1_Sub2_Sub3_2.method418(54, 8);
						}
						if (this.anInt308 == 2) {
							this.aClass1_Sub1_Sub2_Sub3_2.method418(82, 8);
						}
						if (this.anInt308 == 3) {
							this.aClass1_Sub1_Sub2_Sub3_3.method418(110, 8);
						}
						if (this.anInt308 == 4) {
							this.aClass1_Sub1_Sub2_Sub3_5.method418(153, 8);
						}
						if (this.anInt308 == 5) {
							this.aClass1_Sub1_Sub2_Sub3_5.method418(181, 8);
						}
						if (this.anInt308 == 6) {
							this.aClass1_Sub1_Sub2_Sub3_4.method418(209, 9);
						}
					}
					if (this.anIntArray74[0] != -1 && (this.anInt395 != 0 || anInt252 % 20 < 10)) {
						this.aClass1_Sub1_Sub2_Sub3Array4[0].method418(29, 13);
					}
					if (this.anIntArray74[1] != -1 && (this.anInt395 != 1 || anInt252 % 20 < 10)) {
						this.aClass1_Sub1_Sub2_Sub3Array4[1].method418(53, 11);
					}
					if (this.anIntArray74[2] != -1 && (this.anInt395 != 2 || anInt252 % 20 < 10)) {
						this.aClass1_Sub1_Sub2_Sub3Array4[2].method418(82, 11);
					}
					if (this.anIntArray74[3] != -1 && (this.anInt395 != 3 || anInt252 % 20 < 10)) {
						this.aClass1_Sub1_Sub2_Sub3Array4[3].method418(115, 12);
					}
					if (this.anIntArray74[4] != -1 && (this.anInt395 != 4 || anInt252 % 20 < 10)) {
						this.aClass1_Sub1_Sub2_Sub3Array4[4].method418(153, 13);
					}
					if (this.anIntArray74[5] != -1 && (this.anInt395 != 5 || anInt252 % 20 < 10)) {
						this.aClass1_Sub1_Sub2_Sub3Array4[5].method418(180, 11);
					}
					if (this.anIntArray74[6] != -1 && (this.anInt395 != 6 || anInt252 % 20 < 10)) {
						this.aClass1_Sub1_Sub2_Sub3Array4[6].method418(208, 13);
					}
				}
				this.aClass35_27.method525(516, 160, super.aGraphics2, this.anInt293);
				this.aClass35_26.method524();
				this.aClass1_Sub1_Sub2_Sub3_17.method418(0, 0);
				if (this.anInt383 == -1) {
					if (this.anIntArray74[this.anInt308] != -1) {
						if (this.anInt308 == 7) {
							this.aClass1_Sub1_Sub2_Sub3_9.method418(42, 0);
						}
						if (this.anInt308 == 8) {
							this.aClass1_Sub1_Sub2_Sub3_10.method418(74, 0);
						}
						if (this.anInt308 == 9) {
							this.aClass1_Sub1_Sub2_Sub3_10.method418(102, 0);
						}
						if (this.anInt308 == 10) {
							this.aClass1_Sub1_Sub2_Sub3_11.method418(130, 1);
						}
						if (this.anInt308 == 11) {
							this.aClass1_Sub1_Sub2_Sub3_13.method418(173, 0);
						}
						if (this.anInt308 == 12) {
							this.aClass1_Sub1_Sub2_Sub3_13.method418(201, 0);
						}
						if (this.anInt308 == 13) {
							this.aClass1_Sub1_Sub2_Sub3_12.method418(229, 0);
						}
					}
					if (this.anIntArray74[8] != -1 && (this.anInt395 != 8 || anInt252 % 20 < 10)) {
						this.aClass1_Sub1_Sub2_Sub3Array4[7].method418(74, 2);
					}
					if (this.anIntArray74[9] != -1 && (this.anInt395 != 9 || anInt252 % 20 < 10)) {
						this.aClass1_Sub1_Sub2_Sub3Array4[8].method418(102, 3);
					}
					if (this.anIntArray74[10] != -1 && (this.anInt395 != 10 || anInt252 % 20 < 10)) {
						this.aClass1_Sub1_Sub2_Sub3Array4[9].method418(137, 4);
					}
					if (this.anIntArray74[11] != -1 && (this.anInt395 != 11 || anInt252 % 20 < 10)) {
						this.aClass1_Sub1_Sub2_Sub3Array4[10].method418(174, 2);
					}
					if (this.anIntArray74[12] != -1 && (this.anInt395 != 12 || anInt252 % 20 < 10)) {
						this.aClass1_Sub1_Sub2_Sub3Array4[11].method418(201, 2);
					}
					if (this.anIntArray74[13] != -1 && (this.anInt395 != 13 || anInt252 % 20 < 10)) {
						this.aClass1_Sub1_Sub2_Sub3Array4[12].method418(226, 2);
					}
				}
				this.aClass35_26.method525(496, 466, super.aGraphics2, this.anInt293);
				this.aClass35_14.method524();
			}
			if (this.aBoolean69) {
				this.aBoolean69 = false;
				this.aClass35_25.method524();
				this.aClass1_Sub1_Sub2_Sub3_16.method418(0, 0);
				this.aClass1_Sub1_Sub2_Sub4_2.method448(28, (byte) 4, 55, "Public chat", 16777215, true);
				if (this.anInt246 == 0) {
					this.aClass1_Sub1_Sub2_Sub4_2.method448(41, (byte) 4, 55, "On", 65280, true);
				}
				if (this.anInt246 == 1) {
					this.aClass1_Sub1_Sub2_Sub4_2.method448(41, (byte) 4, 55, "Friends", 16776960, true);
				}
				if (this.anInt246 == 2) {
					this.aClass1_Sub1_Sub2_Sub4_2.method448(41, (byte) 4, 55, "Off", 16711680, true);
				}
				if (this.anInt246 == 3) {
					this.aClass1_Sub1_Sub2_Sub4_2.method448(41, (byte) 4, 55, "Hide", 65535, true);
				}
				this.aClass1_Sub1_Sub2_Sub4_2.method448(28, (byte) 4, 184, "Private chat", 16777215, true);
				if (this.anInt417 == 0) {
					this.aClass1_Sub1_Sub2_Sub4_2.method448(41, (byte) 4, 184, "On", 65280, true);
				}
				if (this.anInt417 == 1) {
					this.aClass1_Sub1_Sub2_Sub4_2.method448(41, (byte) 4, 184, "Friends", 16776960, true);
				}
				if (this.anInt417 == 2) {
					this.aClass1_Sub1_Sub2_Sub4_2.method448(41, (byte) 4, 184, "Off", 16711680, true);
				}
				this.aClass1_Sub1_Sub2_Sub4_2.method448(28, (byte) 4, 324, "Trade/compete", 16777215, true);
				if (this.anInt376 == 0) {
					this.aClass1_Sub1_Sub2_Sub4_2.method448(41, (byte) 4, 324, "On", 65280, true);
				}
				if (this.anInt376 == 1) {
					this.aClass1_Sub1_Sub2_Sub4_2.method448(41, (byte) 4, 324, "Friends", 16776960, true);
				}
				if (this.anInt376 == 2) {
					this.aClass1_Sub1_Sub2_Sub4_2.method448(41, (byte) 4, 324, "Off", 16711680, true);
				}
				this.aClass1_Sub1_Sub2_Sub4_2.method448(33, (byte) 4, 458, "Report abuse", 16777215, true);
				this.aClass35_25.method525(0, 453, super.aGraphics2, this.anInt293);
				this.aClass35_14.method524();
			}
			this.anInt333 = 0;
		} catch (@Pc(1071) RuntimeException local1071) {
			signlink.reporterror("41891, " + -287 + ", " + local1071.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "g", descriptor = "(Z)V")
	private void method117() {
		try {
			this.aClass1_Sub1_Sub2_Sub3_19 = new Class1_Sub1_Sub2_Sub3(this.aClass47_1, "titlebox", 0);
			this.aClass1_Sub1_Sub2_Sub3_20 = new Class1_Sub1_Sub2_Sub3(this.aClass47_1, "titlebutton", 0);
			this.aClass1_Sub1_Sub2_Sub3Array1 = new Class1_Sub1_Sub2_Sub3[12];
			@Pc(31) int local31 = 0;
			try {
				local31 = Integer.parseInt(this.getParameter("fl_icon"));
			} catch (@Pc(38) Exception local38) {
			}
			@Pc(42) int local42;
			if (local31 == 0) {
				for (local42 = 0; local42 < 12; local42++) {
					this.aClass1_Sub1_Sub2_Sub3Array1[local42] = new Class1_Sub1_Sub2_Sub3(this.aClass47_1, "runes", local42);
				}
			} else {
				for (local42 = 0; local42 < 12; local42++) {
					this.aClass1_Sub1_Sub2_Sub3Array1[local42] = new Class1_Sub1_Sub2_Sub3(this.aClass47_1, "runes", (local42 & 0x3) + 12);
				}
			}
			this.aClass1_Sub1_Sub2_Sub2_8 = new Class1_Sub1_Sub2_Sub2(128, 265);
			this.aClass1_Sub1_Sub2_Sub2_9 = new Class1_Sub1_Sub2_Sub2(128, 265);
			for (local42 = 0; local42 < 33920; local42++) {
				this.aClass1_Sub1_Sub2_Sub2_8.anIntArray208[local42] = this.aClass35_19.anIntArray231[local42];
			}
			for (@Pc(118) int local118 = 0; local118 < 33920; local118++) {
				this.aClass1_Sub1_Sub2_Sub2_9.anIntArray208[local118] = this.aClass35_20.anIntArray231[local118];
			}
			this.anIntArray88 = new int[256];
			for (@Pc(140) int local140 = 0; local140 < 64; local140++) {
				this.anIntArray88[local140] = local140 * 262144;
			}
			for (@Pc(155) int local155 = 0; local155 < 64; local155++) {
				this.anIntArray88[local155 + 64] = local155 * 1024 + 16711680;
			}
			for (@Pc(174) int local174 = 0; local174 < 64; local174++) {
				this.anIntArray88[local174 + 128] = local174 * 4 + 16776960;
			}
			for (@Pc(193) int local193 = 0; local193 < 64; local193++) {
				this.anIntArray88[local193 + 192] = 16777215;
			}
			this.anIntArray89 = new int[256];
			for (@Pc(212) int local212 = 0; local212 < 64; local212++) {
				this.anIntArray89[local212] = local212 * 1024;
			}
			for (@Pc(227) int local227 = 0; local227 < 64; local227++) {
				this.anIntArray89[local227 + 64] = local227 * 4 + 65280;
			}
			for (@Pc(246) int local246 = 0; local246 < 64; local246++) {
				this.anIntArray89[local246 + 128] = local246 * 262144 + 65535;
			}
			for (@Pc(265) int local265 = 0; local265 < 64; local265++) {
				this.anIntArray89[local265 + 192] = 16777215;
			}
			this.anIntArray90 = new int[256];
			for (@Pc(284) int local284 = 0; local284 < 64; local284++) {
				this.anIntArray90[local284] = local284 * 4;
			}
			for (@Pc(299) int local299 = 0; local299 < 64; local299++) {
				this.anIntArray90[local299 + 64] = local299 * 262144 + 255;
			}
			for (@Pc(318) int local318 = 0; local318 < 64; local318++) {
				this.anIntArray90[local318 + 128] = local318 * 1024 + 16711935;
			}
			for (@Pc(337) int local337 = 0; local337 < 64; local337++) {
				this.anIntArray90[local337 + 192] = 16777215;
			}
			this.anIntArray87 = new int[256];
			this.anIntArray42 = new int[32768];
			this.anIntArray43 = new int[32768];
			this.method179(null);
			this.anIntArray83 = new int[32768];
			this.anIntArray84 = new int[32768];
			this.method96(10, "Connecting to fileserver");
			if (!this.aBoolean55) {
				this.aBoolean84 = true;
				this.aBoolean55 = true;
				this.method95(this, 2);
			}
		} catch (@Pc(394) RuntimeException local394) {
			signlink.reporterror("94092, " + true + ", " + local394.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIIIII)V")
	private void method118(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		try {
			@Pc(5) int local5 = 2048 - arg2 & 0x7FF;
			@Pc(11) int local11 = 2048 - arg3 & 0x7FF;
			@Pc(13) int local13 = 0;
			@Pc(15) int local15 = 0;
			@Pc(17) int local17 = arg1;
			@Pc(23) int local23;
			@Pc(27) int local27;
			@Pc(37) int local37;
			if (local5 != 0) {
				local23 = Class1_Sub1_Sub1_Sub5.anIntArray151[local5];
				local27 = Class1_Sub1_Sub1_Sub5.anIntArray152[local5];
				local37 = local27 * 0 - arg1 * local23 >> 16;
				local17 = local23 * 0 + arg1 * local27 >> 16;
				local15 = local37;
			}
			if (local11 != 0) {
				local23 = Class1_Sub1_Sub1_Sub5.anIntArray151[local11];
				local27 = Class1_Sub1_Sub1_Sub5.anIntArray152[local11];
				local37 = local17 * local23 + local27 * 0 >> 16;
				local17 = local17 * local27 - local23 * 0 >> 16;
				local13 = local37;
			}
			this.anInt274 = arg5 - local13;
			this.anInt275 = arg0 - local15;
			this.anInt276 = arg4 - local17;
			this.anInt277 = arg2;
			this.anInt278 = arg3;
		} catch (@Pc(109) RuntimeException local109) {
			signlink.reporterror("78543, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + -177 + ", " + arg5 + ", " + local109.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(II)V")
	private void method119(@OriginalArg(1) int arg0) {
		try {
			signlink.anInt960 = arg0;
			if (this.anInt287 != 19639) {
				this.anInt315 = -1;
			}
		} catch (@Pc(10) RuntimeException local10) {
			signlink.reporterror("6192, " + 19639 + ", " + arg0 + ", " + local10.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIIII)V")
	private void method121(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		try {
			this.aClass1_Sub1_Sub2_Sub3_14.method418(arg2, arg3);
			this.aClass1_Sub1_Sub2_Sub3_15.method418(arg2, arg3 + arg1 - 16);
			Class1_Sub1_Sub2.method439(this.anInt236, arg3 + 16, arg1 - 32, arg2, 16);
			@Pc(40) int local40 = (arg1 - 32) * arg1 / arg0;
			if (local40 < 8) {
				local40 = 8;
			}
			@Pc(57) int local57 = (arg1 - local40 - 32) * arg4 / (arg0 - arg1);
			Class1_Sub1_Sub2.method439(this.anInt381, arg3 + local57 + 16, local40, arg2, 16);
			Class1_Sub1_Sub2.method444(this.anInt261, arg2, local40, arg3 + local57 + 16);
			Class1_Sub1_Sub2.method444(this.anInt261, arg2 + 1, local40, arg3 + local57 + 16);
			Class1_Sub1_Sub2.method442(16, this.anInt261, arg3 + local57 + 16, arg2);
			Class1_Sub1_Sub2.method442(16, this.anInt261, arg3 + local57 + 17, arg2);
			Class1_Sub1_Sub2.method444(this.anInt309, arg2 + 15, local40, arg3 + local57 + 16);
			Class1_Sub1_Sub2.method444(this.anInt309, arg2 + 14, local40 - 1, arg3 + local57 + 17);
			Class1_Sub1_Sub2.method442(16, this.anInt309, arg3 + local57 + local40 + 15, arg2);
			Class1_Sub1_Sub2.method442(15, this.anInt309, arg3 + local57 + local40 + 14, arg2 + 1);
		} catch (@Pc(173) RuntimeException local173) {
			signlink.reporterror("72760, " + arg0 + ", " + arg1 + ", " + -143 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local173.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "f", descriptor = "(I)V")
	private void method122() {
		try {
			this.aBoolean48 = true;
			for (@Pc(13) int local13 = 0; local13 < 7; local13++) {
				this.anIntArray55[local13] = -1;
				for (@Pc(22) int local22 = 0; local22 < Class23.anInt769; local22++) {
					if (!Class23.aClass23Array1[local22].aBoolean199 && Class23.aClass23Array1[local22].anInt770 == local13 + (this.aBoolean54 ? 0 : 7)) {
						this.anIntArray55[local13] = local22;
						break;
					}
				}
			}
		} catch (@Pc(59) RuntimeException local59) {
			signlink.reporterror("65439, " + -487 + ", " + local59.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IBLjava/lang/String;)V")
	@Override
	protected void method96(@OriginalArg(0) int arg0, @OriginalArg(2) String arg1) {
		try {
			this.anInt237 = arg0;
			this.aString8 = arg1;
			this.method150();
			if (this.aClass47_1 == null) {
				super.method96(arg0, arg1);
			} else {
				this.aClass35_18.method524();
				this.aClass1_Sub1_Sub2_Sub4_3.method447("RuneScape is loading - please wait...", 16777215, 180, 54);
				Class1_Sub1_Sub2.method440(9179409, 304, 34, 28, 62);
				Class1_Sub1_Sub2.method440(0, 302, 32, 29, 63);
				Class1_Sub1_Sub2.method439(9179409, 64, 30, 30, arg0 * 3);
				Class1_Sub1_Sub2.method439(0, 64, 30, arg0 * 3 + 30, 300 - arg0 * 3);
				this.aClass1_Sub1_Sub2_Sub4_3.method447(arg1, 16777215, 180, 85);
				this.aClass35_18.method525(202, 171, super.aGraphics2, this.anInt293);
				if (this.aBoolean75) {
					this.aBoolean75 = false;
					if (!this.aBoolean55) {
						this.aClass35_19.method525(0, 0, super.aGraphics2, this.anInt293);
						this.aClass35_20.method525(637, 0, super.aGraphics2, this.anInt293);
					}
					this.aClass35_16.method525(128, 0, super.aGraphics2, this.anInt293);
					this.aClass35_17.method525(202, 371, super.aGraphics2, this.anInt293);
					this.aClass35_21.method525(0, 265, super.aGraphics2, this.anInt293);
					this.aClass35_22.method525(562, 265, super.aGraphics2, this.anInt293);
					this.aClass35_23.method525(128, 171, super.aGraphics2, this.anInt293);
					this.aClass35_24.method525(562, 171, super.aGraphics2, this.anInt293);
				}
			}
		} catch (@Pc(223) RuntimeException local223) {
			signlink.reporterror("99894, " + arg0 + ", " + -37 + ", " + arg1 + ", " + local223.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "g", descriptor = "(I)V")
	private void method123() {
		try {
			for (@Pc(6) Class1_Sub1_Sub1_Sub4 local6 = (Class1_Sub1_Sub1_Sub4) this.aClass29_1.method511(); local6 != null; local6 = (Class1_Sub1_Sub1_Sub4) this.aClass29_1.method513()) {
				if (local6.anInt464 != this.anInt355 || anInt252 > local6.anInt470) {
					local6.method673();
				} else if (anInt252 >= local6.anInt469) {
					if (local6.anInt473 > 0) {
						@Pc(36) Class1_Sub1_Sub1_Sub1_Sub2 local36 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local6.anInt473 - 1];
						if (local36 != null && local36.anInt1009 >= 0 && local36.anInt1009 < 13312 && local36.anInt1010 >= 0 && local36.anInt1010 < 13312) {
							local6.method241(this.method200(local36.anInt1009, local6.anInt464, local36.anInt1010) - local6.anInt468, local36.anInt1010, local36.anInt1009, anInt252);
						}
					}
					if (local6.anInt473 < 0) {
						@Pc(81) int local81 = -local6.anInt473 - 1;
						@Pc(87) Class1_Sub1_Sub1_Sub1_Sub1 local87;
						if (local81 == this.anInt402) {
							local87 = aClass1_Sub1_Sub1_Sub1_Sub1_1;
						} else {
							local87 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local81];
						}
						if (local87 != null && local87.anInt1009 >= 0 && local87.anInt1009 < 13312 && local87.anInt1010 >= 0 && local87.anInt1010 < 13312) {
							local6.method241(this.method200(local87.anInt1009, local6.anInt464, local87.anInt1010) - local6.anInt468, local87.anInt1010, local87.anInt1009, anInt252);
						}
					}
					local6.method242(this.anInt333);
					this.aClass37_1.method541(false, local6.anInt474, (int) local6.aDouble2, (int) local6.aDouble1, -1, 60, this.anInt355, local6, (int) local6.aDouble3);
				}
			}
			anInt358++;
			if (anInt358 > 1174) {
				anInt358 = 0;
				this.aClass1_Sub1_Sub3_4.method469(90);
				this.aClass1_Sub1_Sub3_4.method470(0);
				@Pc(193) int local193 = this.aClass1_Sub1_Sub3_4.anInt763;
				if ((int) (Math.random() * 2.0D) == 0) {
					this.aClass1_Sub1_Sub3_4.method471(11499);
				}
				this.aClass1_Sub1_Sub3_4.method471(10548);
				if ((int) (Math.random() * 2.0D) == 0) {
					this.aClass1_Sub1_Sub3_4.method470(139);
				}
				if ((int) (Math.random() * 2.0D) == 0) {
					this.aClass1_Sub1_Sub3_4.method470(94);
				}
				this.aClass1_Sub1_Sub3_4.method471(51693);
				this.aClass1_Sub1_Sub3_4.method470(16);
				this.aClass1_Sub1_Sub3_4.method471(15036);
				if ((int) (Math.random() * 2.0D) == 0) {
					this.aClass1_Sub1_Sub3_4.method470(65);
				}
				this.aClass1_Sub1_Sub3_4.method470((int) (Math.random() * 256.0D));
				this.aClass1_Sub1_Sub3_4.method471(22990);
				this.aClass1_Sub1_Sub3_4.method479(this.aClass1_Sub1_Sub3_4.anInt763 - local193);
			}
		} catch (@Pc(267) RuntimeException local267) {
			signlink.reporterror("48582, " + -4798 + ", " + local267.toString());
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
				return new URL("http://127.0.0.1:" + (anInt340 + 80));
			}
		} catch (@Pc(21) Exception local21) {
		}
		return super.getCodeBase();
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(B)V")
	private void method124() {
		try {
			this.aClass35_15.method524();
			Class1_Sub1_Sub2_Sub1.anIntArray180 = this.anIntArray66;
			this.aClass1_Sub1_Sub2_Sub3_8.method418(0, 0);
			if (this.aBoolean73) {
				this.aClass1_Sub1_Sub2_Sub4_3.method447(this.aString4, 0, 239, 40);
				this.aClass1_Sub1_Sub2_Sub4_3.method447(this.aString14 + "*", 128, 239, 60);
			} else if (this.aBoolean78) {
				this.aClass1_Sub1_Sub2_Sub4_3.method447("Enter amount:", 0, 239, 40);
				this.aClass1_Sub1_Sub2_Sub4_3.method447(this.aString10 + "*", 128, 239, 60);
			} else if (this.aString9 != null) {
				this.aClass1_Sub1_Sub2_Sub4_3.method447(this.aString9, 0, 239, 40);
				this.aClass1_Sub1_Sub2_Sub4_3.method447("Click to continue", 128, 239, 60);
			} else if (this.anInt235 != -1) {
				this.method183(0, 0, 0, Class6.aClass6Array1[this.anInt235]);
			} else if (this.anInt263 == -1) {
				@Pc(137) Class1_Sub1_Sub2_Sub4 local137 = this.aClass1_Sub1_Sub2_Sub4_2;
				@Pc(139) int local139 = 0;
				Class1_Sub1_Sub2.method436(77, 0, 463, 0);
				for (@Pc(147) int local147 = 0; local147 < 100; local147++) {
					if (this.aStringArray2[local147] != null) {
						@Pc(159) int local159 = this.anIntArray37[local147];
						@Pc(168) int local168 = this.anInt354 + 70 - local139 * 14;
						@Pc(173) String local173 = this.aStringArray1[local147];
						@Pc(175) byte local175 = 0;
						if (local173 != null && local173.startsWith("@cr1@")) {
							local173 = local173.substring(5);
							local175 = 1;
						}
						if (local173 != null && local173.startsWith("@cr2@")) {
							local173 = local173.substring(5);
							local175 = 2;
						}
						if (local159 == 0) {
							if (local168 > 0 && local168 < 110) {
								local137.method451(local168, this.aStringArray2[local147], 0, 4);
							}
							local139++;
						}
						@Pc(245) int local245;
						if ((local159 == 1 || local159 == 2) && (local159 == 1 || this.anInt246 == 0 || this.anInt246 == 1 && this.method182(local173))) {
							if (local168 > 0 && local168 < 110) {
								local245 = 4;
								if (local175 == 1) {
									this.aClass1_Sub1_Sub2_Sub3Array2[0].method418(4, local168 - 12);
									local245 += 14;
								}
								if (local175 == 2) {
									this.aClass1_Sub1_Sub2_Sub3Array2[1].method418(local245, local168 - 12);
									local245 += 14;
								}
								local137.method451(local168, local173 + ":", 0, local245);
								local245 += local137.method449(local173) + 8;
								local137.method451(local168, this.aStringArray2[local147], 255, local245);
							}
							local139++;
						}
						if ((local159 == 3 || local159 == 7) && this.anInt250 == 0 && (local159 == 7 || this.anInt417 == 0 || this.anInt417 == 1 && this.method182(local173))) {
							if (local168 > 0 && local168 < 110) {
								local137.method451(local168, "From", 0, 4);
								local245 = local137.method449("From ") + 4;
								if (local175 == 1) {
									this.aClass1_Sub1_Sub2_Sub3Array2[0].method418(local245, local168 - 12);
									local245 += 14;
								}
								if (local175 == 2) {
									this.aClass1_Sub1_Sub2_Sub3Array2[1].method418(local245, local168 - 12);
									local245 += 14;
								}
								local137.method451(local168, local173 + ":", 0, local245);
								local245 += local137.method449(local173) + 8;
								local137.method451(local168, this.aStringArray2[local147], 8388608, local245);
							}
							local139++;
						}
						if (local159 == 4 && (this.anInt376 == 0 || this.anInt376 == 1 && this.method182(local173))) {
							if (local168 > 0 && local168 < 110) {
								local137.method451(local168, local173 + " " + this.aStringArray2[local147], 8388736, 4);
							}
							local139++;
						}
						if (local159 == 5 && this.anInt250 == 0 && this.anInt417 < 2) {
							if (local168 > 0 && local168 < 110) {
								local137.method451(local168, this.aStringArray2[local147], 8388608, 4);
							}
							local139++;
						}
						if (local159 == 6 && this.anInt250 == 0 && this.anInt417 < 2) {
							if (local168 > 0 && local168 < 110) {
								local137.method451(local168, "To " + local173 + ":", 0, 4);
								local137.method451(local168, this.aStringArray2[local147], 8388608, local137.method449("To " + local173) + 12);
							}
							local139++;
						}
						if (local159 == 8 && (this.anInt376 == 0 || this.anInt376 == 1 && this.method182(local173))) {
							if (local168 > 0 && local168 < 110) {
								local137.method451(local168, local173 + " " + this.aStringArray2[local147], 8270336, 4);
							}
							local139++;
						}
					}
				}
				Class1_Sub1_Sub2.method435();
				this.anInt394 = local139 * 14 + 7;
				if (this.anInt394 < 78) {
					this.anInt394 = 78;
				}
				this.method121(this.anInt394, 77, 463, 0, this.anInt394 - this.anInt354 - 77);
				@Pc(615) String local615;
				if (aClass1_Sub1_Sub1_Sub1_Sub1_1 == null || aClass1_Sub1_Sub1_Sub1_Sub1_1.aString3 == null) {
					local615 = Class48.method671(this.aString6);
				} else {
					local615 = aClass1_Sub1_Sub1_Sub1_Sub1_1.aString3;
				}
				local137.method451(90, local615 + ":", 0, 4);
				local137.method451(90, this.aString11 + "*", 255, local137.method449(local615 + ": ") + 6);
				Class1_Sub1_Sub2.method442(479, 0, 77, 0);
			} else {
				this.method183(0, 0, 0, Class6.aClass6Array1[this.anInt263]);
			}
			if (this.aBoolean64 && this.anInt370 == 2) {
				this.method211(107);
			}
			this.aClass35_15.method525(17, 357, super.aGraphics2, this.anInt293);
			this.aClass35_14.method524();
			Class1_Sub1_Sub2_Sub1.anIntArray180 = this.anIntArray68;
		} catch (@Pc(697) RuntimeException local697) {
			signlink.reporterror("27691, " + 2 + ", " + local697.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILclient!lb;B)V")
	private void method125(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub1_Sub3 arg1) {
		try {
			@Pc(21) int local21;
			@Pc(30) int local30;
			@Pc(37) int local37;
			@Pc(40) int local40;
			@Pc(44) int local44;
			@Pc(48) int local48;
			@Pc(53) int local53;
			@Pc(58) int local58;
			if (arg0 == 136 || arg0 == 211) {
				local21 = arg1.method480();
				local30 = this.anInt408 + (local21 >> 4 & 0x7);
				local37 = this.anInt409 + (local21 & 0x7);
				local40 = arg1.method480();
				local44 = local40 >> 2;
				local48 = local40 & 0x3;
				local53 = this.anIntArray36[local44];
				if (arg0 == 211) {
					local58 = -1;
				} else {
					local58 = arg1.method482();
				}
				if (local30 >= 0 && local37 >= 0 && local30 < 104 && local37 < 104) {
					this.method194(local53, local37, local58, local48, -1, 0, local44, this.anInt355, local30);
				}
			} else {
				@Pc(148) int local148;
				@Pc(160) int local160;
				@Pc(174) int local174;
				@Pc(186) int local186;
				if (arg0 == 2) {
					local21 = arg1.method480();
					local30 = this.anInt408 + (local21 >> 4 & 0x7);
					local37 = this.anInt409 + (local21 & 0x7);
					local40 = arg1.method480();
					local44 = local40 >> 2;
					local48 = local40 & 0x3;
					local53 = this.anIntArray36[local44];
					local58 = arg1.method482();
					if (local30 >= 0 && local37 >= 0 && local30 < 103 && local37 < 103) {
						local148 = this.anIntArrayArrayArray5[this.anInt355][local30][local37];
						local160 = this.anIntArrayArrayArray5[this.anInt355][local30 + 1][local37];
						local174 = this.anIntArrayArrayArray5[this.anInt355][local30 + 1][local37 + 1];
						local186 = this.anIntArrayArrayArray5[this.anInt355][local30][local37 + 1];
						if (local53 == 0) {
							@Pc(197) Class34 local197 = this.aClass37_1.method552(local37, this.anInt355, local30);
							if (local197 != null) {
								@Pc(206) int local206 = local197.anInt857 >> 14 & 0x7FFF;
								if (local44 == 2) {
									local197.aClass1_Sub1_Sub1_7 = new Class1_Sub1_Sub1_Sub2(2, local206, local148, local186, local48 + 4, local58, false, local160, local174, (byte) 87);
									local197.aClass1_Sub1_Sub1_8 = new Class1_Sub1_Sub1_Sub2(2, local206, local148, local186, local48 + 1 & 0x3, local58, false, local160, local174, (byte) 87);
								} else {
									local197.aClass1_Sub1_Sub1_7 = new Class1_Sub1_Sub1_Sub2(local44, local206, local148, local186, local48, local58, false, local160, local174, (byte) 87);
								}
							}
						}
						if (local53 == 1) {
							@Pc(274) Class14 local274 = this.aClass37_1.method553(local37, local30, this.anInt355);
							if (local274 != null) {
								local274.aClass1_Sub1_Sub1_1 = new Class1_Sub1_Sub1_Sub2(4, local274.anInt592 >> 14 & 0x7FFF, local148, local186, 0, local58, false, local160, local174, (byte) 87);
							}
						}
						if (local53 == 2) {
							@Pc(308) Class31 local308 = this.aClass37_1.method554(this.anInt355, local30, local37, 374);
							if (local44 == 11) {
								local44 = 10;
							}
							if (local308 != null) {
								local308.aClass1_Sub1_Sub1_6 = new Class1_Sub1_Sub1_Sub2(local44, local308.anInt842 >> 14 & 0x7FFF, local148, local186, local48, local58, false, local160, local174, (byte) 87);
							}
						}
						if (local53 == 3) {
							@Pc(347) Class18 local347 = this.aClass37_1.method555(local30, this.anInt355, local37, 518);
							if (local347 != null) {
								local347.aClass1_Sub1_Sub1_2 = new Class1_Sub1_Sub1_Sub2(22, local347.anInt676 >> 14 & 0x7FFF, local148, local186, local48, local58, false, local160, local174, (byte) 87);
							}
						}
					}
				} else {
					@Pc(412) Class1_Sub1_Sub1_Sub3 local412;
					if (arg0 == 147) {
						local21 = arg1.method480();
						local30 = this.anInt408 + (local21 >> 4 & 0x7);
						local37 = this.anInt409 + (local21 & 0x7);
						local40 = arg1.method482();
						local44 = arg1.method482();
						if (local30 >= 0 && local37 >= 0 && local30 < 104 && local37 < 104) {
							local412 = new Class1_Sub1_Sub1_Sub3();
							local412.anInt191 = local40;
							local412.anInt192 = local44;
							if (this.aClass29ArrayArrayArray1[this.anInt355][local30][local37] == null) {
								this.aClass29ArrayArrayArray1[this.anInt355][local30][local37] = new Class29(464);
							}
							this.aClass29ArrayArrayArray1[this.anInt355][local30][local37].method508(local412);
							this.method138(local30, local37);
						}
					} else if (arg0 == 53) {
						local21 = arg1.method480();
						local30 = this.anInt408 + (local21 >> 4 & 0x7);
						local37 = this.anInt409 + (local21 & 0x7);
						local40 = arg1.method482();
						if (local30 >= 0 && local37 >= 0 && local30 < 104 && local37 < 104) {
							@Pc(502) Class29 local502 = this.aClass29ArrayArrayArray1[this.anInt355][local30][local37];
							if (local502 != null) {
								for (local412 = (Class1_Sub1_Sub1_Sub3) local502.method511(); local412 != null; local412 = (Class1_Sub1_Sub1_Sub3) local502.method513()) {
									if (local412.anInt191 == (local40 & 0x7FFF)) {
										local412.method673();
										break;
									}
								}
								if (local502.method511() == null) {
									this.aClass29ArrayArrayArray1[this.anInt355][local30][local37] = null;
								}
								this.method138(local30, local37);
							}
						}
					} else if (arg0 == 30) {
						local21 = arg1.method480();
						local30 = this.anInt408 + (local21 >> 4 & 0x7);
						local37 = this.anInt409 + (local21 & 0x7);
						local40 = local30 + arg1.method481();
						local44 = local37 + arg1.method481();
						local48 = arg1.method483();
						local53 = arg1.method482();
						local58 = arg1.method480() * 4;
						local148 = arg1.method480() * 4;
						local160 = arg1.method482();
						local174 = arg1.method482();
						local186 = arg1.method480();
						@Pc(605) int local605 = arg1.method480();
						if (local30 >= 0 && local37 >= 0 && local30 < 104 && local37 < 104 && local40 >= 0 && local44 >= 0 && local40 < 104 && local44 < 104 && local53 != 65535) {
							local30 = local30 * 128 + 64;
							local37 = local37 * 128 + 64;
							local40 = local40 * 128 + 64;
							local44 = local44 * 128 + 64;
							@Pc(681) Class1_Sub1_Sub1_Sub4 local681 = new Class1_Sub1_Sub1_Sub4(local174 + anInt252, this.method200(local30, this.anInt355, local37) - local58, local160 + anInt252, local53, local48, (byte) 0, local30, local148, this.anInt355, local186, local37, local605);
							local681.method241(this.method200(local40, this.anInt355, local44) - local148, local44, local40, local160 + anInt252);
							this.aClass29_1.method508(local681);
						}
					} else if (arg0 == 193) {
						local21 = arg1.method480();
						local30 = this.anInt408 + (local21 >> 4 & 0x7);
						local37 = this.anInt409 + (local21 & 0x7);
						local40 = arg1.method482();
						local44 = arg1.method480();
						local48 = arg1.method482();
						if (local30 >= 0 && local37 >= 0 && local30 < 104 && local37 < 104) {
							local30 = local30 * 128 + 64;
							local37 = local37 * 128 + 64;
							@Pc(777) Class1_Sub1_Sub1_Sub6 local777 = new Class1_Sub1_Sub1_Sub6((byte) -99, anInt252, this.method200(local30, this.anInt355, local37) - local44, local30, this.anInt355, local40, local48, local37);
							this.aClass29_2.method508(local777);
						}
					} else if (arg0 == 137) {
						local21 = arg1.method480();
						local30 = this.anInt408 + (local21 >> 4 & 0x7);
						local37 = this.anInt409 + (local21 & 0x7);
						local40 = arg1.method482();
						local44 = arg1.method482();
						local48 = arg1.method482();
						if (local30 >= 0 && local37 >= 0 && local30 < 104 && local37 < 104 && local48 != this.anInt402) {
							@Pc(831) Class1_Sub1_Sub1_Sub3 local831 = new Class1_Sub1_Sub1_Sub3();
							local831.anInt191 = local40;
							local831.anInt192 = local44;
							if (this.aClass29ArrayArrayArray1[this.anInt355][local30][local37] == null) {
								this.aClass29ArrayArrayArray1[this.anInt355][local30][local37] = new Class29(464);
							}
							this.aClass29ArrayArrayArray1[this.anInt355][local30][local37].method508(local831);
							this.method138(local30, local37);
						}
					} else {
						if (arg0 == 191) {
							local21 = arg1.method480();
							local30 = this.anInt408 + (local21 >> 4 & 0x7);
							local37 = this.anInt409 + (local21 & 0x7);
							local40 = arg1.method480();
							local44 = local40 >> 2;
							local48 = local40 & 0x3;
							local53 = this.anIntArray36[local44];
							local58 = arg1.method482();
							local148 = arg1.method482();
							local160 = arg1.method482();
							local174 = arg1.method482();
							@Pc(929) byte local929 = arg1.method481();
							@Pc(932) byte local932 = arg1.method481();
							@Pc(935) byte local935 = arg1.method481();
							@Pc(938) byte local938 = arg1.method481();
							@Pc(944) Class1_Sub1_Sub1_Sub1_Sub1 local944;
							if (local174 == this.anInt402) {
								local944 = aClass1_Sub1_Sub1_Sub1_Sub1_1;
							} else {
								local944 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local174];
							}
							if (local944 != null) {
								@Pc(956) Class9 local956 = Class9.method288(local58);
								@Pc(966) int local966 = this.anIntArrayArrayArray5[this.anInt355][local30][local37];
								@Pc(978) int local978 = this.anIntArrayArrayArray5[this.anInt355][local30 + 1][local37];
								@Pc(992) int local992 = this.anIntArrayArrayArray5[this.anInt355][local30 + 1][local37 + 1];
								@Pc(1004) int local1004 = this.anIntArrayArrayArray5[this.anInt355][local30][local37 + 1];
								@Pc(1014) Class1_Sub1_Sub1_Sub5 local1014 = local956.method294(local44, local48, local966, local978, local992, local1004, -1);
								if (local1014 != null) {
									this.method194(local53, local37, -1, 0, local160 + 1, local148 + 1, 0, this.anInt355, local30);
									local944.anInt142 = local148 + anInt252;
									local944.anInt143 = local160 + anInt252;
									local944.aClass1_Sub1_Sub1_Sub5_1 = local1014;
									@Pc(1049) int local1049 = local956.anInt519;
									@Pc(1052) int local1052 = local956.anInt520;
									if (local48 == 1 || local48 == 3) {
										local1049 = local956.anInt520;
										local1052 = local956.anInt519;
									}
									local944.anInt144 = local30 * 128 + local1049 * 64;
									local944.anInt146 = local37 * 128 + local1052 * 64;
									local944.anInt145 = this.method200(local944.anInt144, this.anInt355, local944.anInt146);
									@Pc(1098) byte local1098;
									if (local929 > local935) {
										local1098 = local929;
										local929 = local935;
										local935 = local1098;
									}
									if (local932 > local938) {
										local1098 = local932;
										local932 = local938;
										local938 = local1098;
									}
									local944.anInt147 = local30 + local929;
									local944.anInt149 = local30 + local935;
									local944.anInt148 = local37 + local932;
									local944.anInt150 = local37 + local938;
								}
							}
						}
						if (arg0 == 253) {
							local21 = arg1.method480();
							local30 = this.anInt408 + (local21 >> 4 & 0x7);
							local37 = this.anInt409 + (local21 & 0x7);
							local40 = arg1.method482();
							local44 = arg1.method482();
							local48 = arg1.method482();
							if (local30 >= 0 && local37 >= 0 && local30 < 104 && local37 < 104) {
								@Pc(1182) Class29 local1182 = this.aClass29ArrayArrayArray1[this.anInt355][local30][local37];
								if (local1182 != null) {
									for (@Pc(1188) Class1_Sub1_Sub1_Sub3 local1188 = (Class1_Sub1_Sub1_Sub3) local1182.method511(); local1188 != null; local1188 = (Class1_Sub1_Sub1_Sub3) local1182.method513()) {
										if (local1188.anInt191 == (local40 & 0x7FFF) && local1188.anInt192 == local44) {
											local1188.anInt192 = local48;
											break;
										}
									}
									this.method138(local30, local37);
								}
							}
						} else if (arg0 == 222) {
							local21 = arg1.method480();
							local30 = this.anInt408 + (local21 >> 4 & 0x7);
							local37 = this.anInt409 + (local21 & 0x7);
							local40 = arg1.method482();
							local44 = arg1.method480();
							local48 = local44 >> 4 & 0xF;
							local53 = local44 & 0x7;
							if (aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray272[0] >= local30 - local48 && aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray272[0] <= local30 + local48 && aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray273[0] >= local37 - local48 && aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray273[0] <= local37 + local48 && this.aBoolean81 && !aBoolean77 && this.anInt407 < 50) {
								this.anIntArray38[this.anInt407] = local40;
								this.anIntArray85[this.anInt407] = local53;
								this.anIntArray41[this.anInt407] = Class5.anIntArray29[local40];
								this.anInt407++;
								return;
							}
						}
					}
				}
			}
		} catch (@Pc(1324) RuntimeException local1324) {
			signlink.reporterror("98018, " + arg0 + ", " + arg1 + ", " + -20 + ", " + local1324.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ZJ)V")
	private void method126(@OriginalArg(1) long arg0) {
		try {
			if (arg0 != 0L) {
				for (@Pc(8) int local8 = 0; local8 < this.anInt384; local8++) {
					if (this.aLongArray4[local8] == arg0) {
						this.anInt384--;
						this.aBoolean87 = true;
						for (@Pc(28) int local28 = local8; local28 < this.anInt384; local28++) {
							this.aLongArray4[local28] = this.aLongArray4[local28 + 1];
						}
						this.aClass1_Sub1_Sub3_4.method469(104);
						this.aClass1_Sub1_Sub3_4.method476(arg0, 359);
						break;
					}
				}
			}
		} catch (@Pc(73) RuntimeException local73) {
			signlink.reporterror("92504, " + false + ", " + arg0 + ", " + local73.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIIIZII)V")
	private void method127(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		try {
			if (arg4 >= 1 && arg6 >= 1 && arg4 <= 102 && arg6 <= 102) {
				if (aBoolean77 && arg3 != this.anInt355) {
					return;
				}
				@Pc(25) int local25 = 0;
				if (arg0 == 0) {
					local25 = this.aClass37_1.method556(arg3, arg4, arg6);
				}
				if (arg0 == 1) {
					local25 = this.aClass37_1.method557(arg3, arg4, 939, arg6);
				}
				if (arg0 == 2) {
					local25 = this.aClass37_1.method558(arg3, arg4, arg6);
				}
				if (arg0 == 3) {
					local25 = this.aClass37_1.method559(arg3, arg4, arg6);
				}
				@Pc(81) int local81;
				if (local25 != 0) {
					local81 = this.aClass37_1.method560(arg3, arg4, arg6, local25);
					@Pc(87) int local87 = local25 >> 14 & 0x7FFF;
					@Pc(91) int local91 = local81 & 0x1F;
					@Pc(95) int local95 = local81 >> 6;
					@Pc(107) Class9 local107;
					if (arg0 == 0) {
						this.aClass37_1.method547(arg3, arg4, arg6);
						local107 = Class9.method288(local87);
						if (local107.aBoolean127) {
							this.aClass19Array1[arg3].method425(local91, local95, arg6, local107.aBoolean128, arg4);
						}
					}
					if (arg0 == 1) {
						this.aClass37_1.method548(arg3, arg6, arg4);
					}
					if (arg0 == 2) {
						this.aClass37_1.method549(arg4, arg6, arg3);
						local107 = Class9.method288(local87);
						if (arg4 + local107.anInt519 > 103 || arg6 + local107.anInt519 > 103 || arg4 + local107.anInt520 > 103 || arg6 + local107.anInt520 > 103) {
							return;
						}
						if (local107.aBoolean127) {
							this.aClass19Array1[arg3].method426(local107.anInt519, local107.aBoolean128, (byte) 4, local95, arg4, arg6, local107.anInt520);
						}
					}
					if (arg0 == 3) {
						this.aClass37_1.method550(arg4, arg6, arg3);
						local107 = Class9.method288(local87);
						if (local107.aBoolean127 && local107.aBoolean129) {
							this.aClass19Array1[arg3].method428(arg4, arg6);
						}
					}
				}
				if (arg2 >= 0) {
					local81 = arg3;
					if (arg3 < 3 && (this.aByteArrayArrayArray7[1][arg4][arg6] & 0x2) == 2) {
						local81 = arg3 + 1;
					}
					Class4.method73(arg6, local81, arg5, this.aClass19Array1[arg3], arg4, arg3, this.anIntArrayArrayArray5, this.aClass37_1, arg1, arg2);
					return;
				}
			}
		} catch (@Pc(254) RuntimeException local254) {
			signlink.reporterror("75283, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + false + ", " + arg5 + ", " + arg6 + ", " + local254.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Lclient!lb;BI)V")
	private void method128(@OriginalArg(0) Class1_Sub1_Sub3 arg0, @OriginalArg(2) int arg1) {
		try {
			for (@Pc(1) int local1 = 0; local1 < this.anInt233; local1++) {
				@Pc(8) int local8 = this.anIntArray35[local1];
				@Pc(13) Class1_Sub1_Sub1_Sub1_Sub1 local13 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local8];
				@Pc(16) int local16 = arg0.method480();
				if ((local16 & 0x80) == 128) {
					local16 += arg0.method480() << 8;
				}
				this.method162(local16, arg0, local8, local13);
			}
		} catch (@Pc(49) RuntimeException local49) {
			signlink.reporterror("69468, " + arg0 + ", " + -18 + ", " + arg1 + ", " + local49.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "i", descriptor = "(Z)Ljava/lang/String;")
	private String method129() {
		try {
			if (signlink.mainapp == null) {
				return super.aFrame_Sub1_2 == null ? super.getDocumentBase().getHost().toLowerCase() : "runescape.com";
			} else {
				return signlink.mainapp.getDocumentBase().getHost().toLowerCase();
			}
		} catch (@Pc(24) RuntimeException local24) {
			signlink.reporterror("27569, " + false + ", " + local24.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(B)V")
	private void method130(@OriginalArg(0) byte arg0) {
		try {
			@Pc(21) int local21;
			@Pc(50) int local50;
			@Pc(54) int local54;
			@Pc(63) int local63;
			@Pc(70) int local70;
			@Pc(133) int local133;
			@Pc(190) int local190;
			try {
				this.anInt271 = -1;
				this.aClass29_2.method515();
				this.aClass29_1.method515();
				Class1_Sub1_Sub2_Sub1.method345();
				this.method148();
				this.aClass37_1.method530();
				for (local21 = 0; local21 < 4; local21++) {
					this.aClass19Array1[local21].method420();
				}
				System.gc();
				@Pc(46) Class4 local46 = new Class4(104, this.anIntArrayArrayArray5, 104, this.aByteArrayArrayArray7, this.aBoolean83);
				local50 = this.aByteArrayArray1.length;
				Class4.aBoolean36 = Class37.aBoolean221;
				for (local54 = 0; local54 < local50; local54++) {
					local63 = this.anIntArray69[local54] >> 8;
					local70 = this.anIntArray69[local54] & 0xFF;
					if (local63 == 33 && local70 >= 71 && local70 <= 73) {
						Class4.aBoolean36 = false;
					}
				}
				if (Class4.aBoolean36) {
					this.aClass37_1.method531(this.anInt355);
				} else {
					this.aClass37_1.method531(0);
				}
				this.aClass1_Sub1_Sub3_4.method469(115);
				@Pc(138) byte[] local138;
				for (local63 = 0; local63 < local50; local63++) {
					local70 = (this.anIntArray69[local63] >> 8) * 64 - this.anInt302;
					local133 = (this.anIntArray69[local63] & 0xFF) * 64 - this.anInt303;
					local138 = this.aByteArrayArray1[local63];
					if (local138 != null) {
						local46.method57((this.anInt414 - 6) * 8, (this.anInt415 - 6) * 8, local70, local138, local133);
					}
				}
				for (local70 = 0; local70 < local50; local70++) {
					local133 = (this.anIntArray69[local70] >> 8) * 64 - this.anInt302;
					local190 = (this.anIntArray69[local70] & 0xFF) * 64 - this.anInt303;
					@Pc(195) byte[] local195 = this.aByteArrayArray1[local70];
					if (local195 == null && this.anInt415 < 800) {
						local46.method56(local133, local190);
					}
				}
				this.aClass1_Sub1_Sub3_4.method469(115);
				@Pc(240) int local240;
				for (local133 = 0; local133 < local50; local133++) {
					local138 = this.aByteArrayArray2[local133];
					if (local138 != null) {
						local240 = (this.anIntArray69[local133] >> 8) * 64 - this.anInt302;
						@Pc(252) int local252 = (this.anIntArray69[local133] & 0xFF) * 64 - this.anInt303;
						local46.method60(this.aClass37_1, local252, local138, this.aClass19Array1, local240);
					}
				}
				this.aClass1_Sub1_Sub3_4.method469(115);
				local46.method62(this.aClass19Array1, this.aClass37_1);
				this.aClass35_14.method524();
				this.aClass1_Sub1_Sub3_4.method469(115);
				for (local190 = 0; local190 < 104; local190++) {
					for (local240 = 0; local240 < 104; local240++) {
						this.method138(local190, local240);
					}
				}
				this.method208();
			} catch (@Pc(312) Exception local312) {
			}
			Class9.aClass40_4.method593();
			@Pc(319) boolean local319 = false;
			@Pc(336) int local336;
			if (aBoolean77 && signlink.aRandomAccessFile1 != null) {
				local21 = this.aClass44_Sub1_1.method638(0, 763);
				for (local336 = 0; local336 < local21; local336++) {
					local50 = this.aClass44_Sub1_1.method643(local336);
					if ((local50 & 0x79) == 0) {
						Class1_Sub1_Sub1_Sub5.method260(local336);
					}
				}
			}
			System.gc();
			Class1_Sub1_Sub2_Sub1.method346();
			this.aClass44_Sub1_1.method649();
			local21 = (this.anInt414 - 6) / 8 - 1;
			local336 = (this.anInt414 + 6) / 8 + 1;
			local50 = (this.anInt415 - 6) / 8 - 1;
			local54 = (this.anInt415 + 6) / 8 + 1;
			if (this.aBoolean79) {
				local21 = 49;
				local336 = 50;
				local50 = 49;
				local54 = 50;
			}
			for (local63 = local21; local63 <= local336; local63++) {
				for (local70 = local50; local70 <= local54; local70++) {
					if (local63 == local21 || local63 == local336 || local70 == local50 || local70 == local54) {
						local133 = this.aClass44_Sub1_1.method640(local70, local63, 0);
						if (local133 != -1) {
							this.aClass44_Sub1_1.method650(3, local133);
						}
						local190 = this.aClass44_Sub1_1.method640(local70, local63, 1);
						if (local190 != -1) {
							this.aClass44_Sub1_1.method650(3, local190);
						}
					}
				}
			}
		} catch (@Pc(474) RuntimeException local474) {
			signlink.reporterror("94052, " + arg0 + ", " + local474.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "h", descriptor = "(I)V")
	private void method131() {
		try {
			if (super.anInt213 == 1) {
				if (super.anInt214 >= 6 && super.anInt214 <= 106 && super.anInt215 >= 467 && super.anInt215 <= 499) {
					this.anInt246 = (this.anInt246 + 1) % 4;
					this.aBoolean69 = true;
					this.aBoolean68 = true;
					this.aClass1_Sub1_Sub3_4.method469(242);
					this.aClass1_Sub1_Sub3_4.method470(this.anInt246);
					this.aClass1_Sub1_Sub3_4.method470(this.anInt417);
					this.aClass1_Sub1_Sub3_4.method470(this.anInt376);
				}
				if (super.anInt214 >= 135 && super.anInt214 <= 235 && super.anInt215 >= 467 && super.anInt215 <= 499) {
					this.anInt417 = (this.anInt417 + 1) % 3;
					this.aBoolean69 = true;
					this.aBoolean68 = true;
					this.aClass1_Sub1_Sub3_4.method469(242);
					this.aClass1_Sub1_Sub3_4.method470(this.anInt246);
					this.aClass1_Sub1_Sub3_4.method470(this.anInt417);
					this.aClass1_Sub1_Sub3_4.method470(this.anInt376);
				}
				if (super.anInt214 >= 273 && super.anInt214 <= 373 && super.anInt215 >= 467 && super.anInt215 <= 499) {
					this.anInt376 = (this.anInt376 + 1) % 3;
					this.aBoolean69 = true;
					this.aBoolean68 = true;
					this.aClass1_Sub1_Sub3_4.method469(242);
					this.aClass1_Sub1_Sub3_4.method470(this.anInt246);
					this.aClass1_Sub1_Sub3_4.method470(this.anInt417);
					this.aClass1_Sub1_Sub3_4.method470(this.anInt376);
				}
				if (super.anInt214 >= 412 && super.anInt214 <= 512 && super.anInt215 >= 467 && super.anInt215 <= 499) {
					if (this.anInt386 == -1) {
						this.method100();
						this.aString5 = "";
						this.aBoolean93 = false;
						for (@Pc(195) int local195 = 0; local195 < Class6.aClass6Array1.length; local195++) {
							if (Class6.aClass6Array1[local195] != null && Class6.aClass6Array1[local195].anInt435 == 600) {
								this.anInt324 = this.anInt386 = Class6.aClass6Array1[local195].anInt432;
								return;
							}
						}
						return;
					}
					this.method152("", "Please close the interface you have open before using 'report abuse'", 0);
					return;
				}
			}
		} catch (@Pc(231) RuntimeException local231) {
			signlink.reporterror("60162, " + 256 + ", " + local231.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILclient!lb;I)V")
	private void method132(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub1_Sub3 arg1) {
		try {
			for (@Pc(9) int local9 = 0; local9 < this.anInt233; local9++) {
				@Pc(16) int local16 = this.anIntArray35[local9];
				@Pc(21) Class1_Sub1_Sub1_Sub1_Sub2 local21 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local16];
				@Pc(24) int local24 = arg1.method480();
				@Pc(32) int local32;
				@Pc(35) int local35;
				if ((local24 & 0x1) == 1) {
					local32 = arg1.method480();
					local35 = arg1.method480();
					local21.method681(anInt252, local32, local35);
					local21.anInt1023 = anInt252 + 300;
					local21.anInt1024 = arg1.method480();
					local21.anInt1025 = arg1.method480();
				}
				if ((local24 & 0x2) == 2) {
					local32 = arg1.method482();
					if (local32 == 65535) {
						local32 = -1;
					}
					if (local32 == local21.anInt1032) {
						local21.anInt1036 = 0;
					}
					local35 = arg1.method480();
					if (local32 == local21.anInt1032 && local32 != -1) {
						@Pc(89) int local89 = Class27.aClass27Array1[local32].anInt822;
						if (local89 == 1) {
							local21.anInt1033 = 0;
							local21.anInt1034 = 0;
							local21.anInt1035 = local35;
							local21.anInt1036 = 0;
						}
						if (local89 == 2) {
							local21.anInt1036 = 0;
						}
					} else if (local32 == -1 || local21.anInt1032 == -1 || Class27.aClass27Array1[local32].anInt816 >= Class27.aClass27Array1[local21.anInt1032].anInt816) {
						local21.anInt1032 = local32;
						local21.anInt1033 = 0;
						local21.anInt1034 = 0;
						local21.anInt1035 = local35;
						local21.anInt1036 = 0;
						local21.anInt1055 = local21.anInt1053;
					}
				}
				if ((local24 & 0x4) == 4) {
					local21.anInt1026 = arg1.method482();
					if (local21.anInt1026 == 65535) {
						local21.anInt1026 = -1;
					}
				}
				if ((local24 & 0x8) == 8) {
					local21.aString31 = arg1.method487();
					local21.anInt1020 = 100;
				}
				if ((local24 & 0x10) == 16) {
					local32 = arg1.method480();
					local35 = arg1.method480();
					local21.method681(anInt252, local32, local35);
					local21.anInt1023 = anInt252 + 300;
					local21.anInt1024 = arg1.method480();
					local21.anInt1025 = arg1.method480();
				}
				if ((local24 & 0x20) == 32) {
					local21.aClass13_2 = Class13.method323(arg1.method482());
					local21.anInt1012 = local21.aClass13_2.aByte26;
					local21.anInt1052 = local21.aClass13_2.anInt584;
					local21.anInt1015 = local21.aClass13_2.anInt571;
					local21.anInt1016 = local21.aClass13_2.anInt572;
					local21.anInt1017 = local21.aClass13_2.anInt573;
					local21.anInt1018 = local21.aClass13_2.anInt574;
					local21.anInt1013 = local21.aClass13_2.anInt570;
				}
				if ((local24 & 0x40) == 64) {
					local21.anInt1037 = arg1.method482();
					local32 = arg1.method485();
					local21.anInt1041 = local32 >> 16;
					local21.anInt1040 = anInt252 + (local32 & 0xFFFF);
					local21.anInt1038 = 0;
					local21.anInt1039 = 0;
					if (local21.anInt1040 > anInt252) {
						local21.anInt1038 = -1;
					}
					if (local21.anInt1037 == 65535) {
						local21.anInt1037 = -1;
					}
				}
				if ((local24 & 0x80) == 128) {
					local21.anInt1027 = arg1.method482();
					local21.anInt1028 = arg1.method482();
				}
			}
		} catch (@Pc(315) RuntimeException local315) {
			signlink.reporterror("36124, " + arg0 + ", " + arg1 + ", " + 466 + ", " + local315.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(II)V")
	private void method133(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(5) int local5;
			if (arg0 <= 0) {
				for (local5 = 1; local5 > 0; local5++) {
				}
			}
			local5 = Class39.aClass39Array1[arg1].anInt910;
			if (local5 != 0) {
				@Pc(23) int local23 = this.anIntArray81[arg1];
				if (local5 == 1) {
					if (local23 == 1) {
						Class1_Sub1_Sub2_Sub1.method351(0.9D);
					}
					if (local23 == 2) {
						Class1_Sub1_Sub2_Sub1.method351(0.8D);
					}
					if (local23 == 3) {
						Class1_Sub1_Sub2_Sub1.method351(0.7D);
					}
					if (local23 == 4) {
						Class1_Sub1_Sub2_Sub1.method351(0.6D);
					}
					Class15.aClass40_8.method593();
					this.aBoolean75 = true;
				}
				if (local5 == 3) {
					@Pc(61) boolean local61 = this.aBoolean53;
					if (local23 == 0) {
						this.method108(0, this.aBoolean53);
						this.aBoolean53 = true;
					}
					if (local23 == 1) {
						this.method108(-400, this.aBoolean53);
						this.aBoolean53 = true;
					}
					if (local23 == 2) {
						this.method108(-800, this.aBoolean53);
						this.aBoolean53 = true;
					}
					if (local23 == 3) {
						this.method108(-1200, this.aBoolean53);
						this.aBoolean53 = true;
					}
					if (local23 == 4) {
						this.aBoolean53 = false;
					}
					if (this.aBoolean53 != local61 && !aBoolean77) {
						if (this.aBoolean53) {
							this.anInt260 = this.anInt229;
							this.aBoolean61 = true;
							this.aClass44_Sub1_1.method645(2, this.anInt260);
						} else {
							this.method230();
						}
						this.anInt301 = 0;
					}
				}
				if (local5 == 4) {
					if (local23 == 0) {
						this.aBoolean81 = true;
						this.method119(0);
					}
					if (local23 == 1) {
						this.aBoolean81 = true;
						this.method119(-400);
					}
					if (local23 == 2) {
						this.aBoolean81 = true;
						this.method119(-800);
					}
					if (local23 == 3) {
						this.aBoolean81 = true;
						this.method119(-1200);
					}
					if (local23 == 4) {
						this.aBoolean81 = false;
					}
				}
				if (local5 == 5) {
					this.anInt256 = local23;
				}
				if (local5 == 6) {
					this.anInt393 = local23;
				}
				if (local5 == 8) {
					this.anInt250 = local23;
					this.aBoolean68 = true;
				}
				if (local5 == 9) {
					this.anInt396 = local23;
				}
			}
		} catch (@Pc(221) RuntimeException local221) {
			signlink.reporterror("79197, " + arg0 + ", " + arg1 + ", " + local221.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(II)V")
	private void method134(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(5) int[] local5 = this.aClass1_Sub1_Sub2_Sub2_3.anIntArray208;
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
			this.aClass1_Sub1_Sub2_Sub2_3.method386();
			@Pc(146) int local146;
			for (@Pc(142) int local142 = 1; local142 < 103; local142++) {
				for (local146 = 1; local146 < 103; local146++) {
					if ((this.aByteArrayArrayArray7[arg1][local146][local142] & 0x18) == 0) {
						this.method207(local146, local36, local34, arg1, local142);
					}
					if (arg1 < 3 && (this.aByteArrayArrayArray7[arg1 + 1][local146][local142] & 0x8) != 0) {
						this.method207(local146, local36, local34, arg1 + 1, local142);
					}
				}
			}
			if (arg0 != 0) {
				this.aClass1_Sub1_Sub3_4.method470(83);
			}
			this.aClass35_14.method524();
			this.anInt220 = 0;
			for (local146 = 0; local146 < 104; local146++) {
				for (@Pc(220) int local220 = 0; local220 < 104; local220++) {
					@Pc(230) int local230 = this.aClass37_1.method559(this.anInt355, local146, local220);
					if (local230 != 0) {
						local230 = local230 >> 14 & 0x7FFF;
						@Pc(242) int local242 = Class9.method288(local230).anInt523;
						if (local242 >= 0) {
							@Pc(246) int local246 = local146;
							@Pc(248) int local248 = local220;
							if (local242 != 22 && local242 != 29 && local242 != 34 && local242 != 36 && local242 != 46 && local242 != 47 && local242 != 48) {
								@Pc(280) int[][] local280 = this.aClass19Array1[this.anInt355].anIntArrayArray18;
								for (@Pc(282) int local282 = 0; local282 < 10; local282++) {
									@Pc(289) int local289 = (int) (Math.random() * 4.0D);
									if (local289 == 0 && local246 > 0 && local246 > local146 - 3 && (local280[local246 - 1][local248] & 0x280108) == 0) {
										local246--;
									}
									if (local289 == 1 && local246 < 103 && local246 < local146 + 3 && (local280[local246 + 1][local248] & 0x280180) == 0) {
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
							this.aClass1_Sub1_Sub2_Sub2Array5[this.anInt220] = this.aClass1_Sub1_Sub2_Sub2Array4[local242];
							this.anIntArray32[this.anInt220] = local246;
							this.anIntArray33[this.anInt220] = local248;
							this.anInt220++;
						}
					}
				}
			}
			anInt367++;
			if (anInt367 > 112) {
				anInt367 = 0;
				this.aClass1_Sub1_Sub3_4.method469(164);
				this.aClass1_Sub1_Sub3_4.method470(50);
			}
		} catch (@Pc(437) RuntimeException local437) {
			signlink.reporterror("24177, " + arg0 + ", " + arg1 + ", " + local437.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(Z)V")
	@Override
	protected void method93() {
		try {
			this.aBoolean75 = true;
		} catch (@Pc(10) RuntimeException local10) {
			signlink.reporterror("86103, " + false + ", " + local10.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IZILclient!d;BIIII)V")
	private void method135(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class6 arg3, @OriginalArg(4) byte arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		try {
			if (this.aBoolean67) {
				this.anInt227 = 32;
			} else {
				this.anInt227 = 0;
			}
			this.aBoolean67 = false;
			if (this.aByte4 == 8) {
				@Pc(21) boolean local21 = false;
			} else {
				this.anInt270 = -406;
			}
			if (arg7 >= arg8 && arg7 < arg8 + 16 && arg5 >= arg0 && arg5 < arg0 + 16) {
				arg3.anInt442 -= this.anInt238 * 4;
				if (arg1) {
					this.aBoolean87 = true;
					return;
				}
			} else if (arg7 >= arg8 && arg7 < arg8 + 16 && arg5 >= arg0 + arg2 - 16 && arg5 < arg0 + arg2) {
				arg3.anInt442 += this.anInt238 * 4;
				if (arg1) {
					this.aBoolean87 = true;
					return;
				}
			} else if (arg7 >= arg8 - this.anInt227 && arg7 < arg8 + this.anInt227 + 16 && arg5 >= arg0 + 16 && arg5 < arg0 + arg2 - 16 && this.anInt238 > 0) {
				@Pc(129) int local129 = (arg2 - 32) * arg2 / arg6;
				if (local129 < 8) {
					local129 = 8;
				}
				@Pc(144) int local144 = arg5 - arg0 - local129 / 2 - 16;
				@Pc(150) int local150 = arg2 - local129 - 32;
				arg3.anInt442 = (arg6 - arg2) * local144 / local150;
				if (arg1) {
					this.aBoolean87 = true;
				}
				this.aBoolean67 = true;
			} else {
				return;
			}
		} catch (@Pc(169) RuntimeException local169) {
			signlink.reporterror("63503, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + local169.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "j", descriptor = "(Z)V")
	private void method136(@OriginalArg(0) boolean arg0) {
		try {
			this.aClass35_12.method524();
			Class1_Sub1_Sub2_Sub1.anIntArray180 = this.anIntArray67;
			if (!arg0) {
				this.anInt315 = this.aClass1_Sub1_Sub3_3.method480();
			}
			this.aClass1_Sub1_Sub2_Sub3_6.method418(0, 0);
			if (this.anInt383 != -1) {
				this.method183(0, 0, 0, Class6.aClass6Array1[this.anInt383]);
			} else if (this.anIntArray74[this.anInt308] != -1) {
				this.method183(0, 0, 0, Class6.aClass6Array1[this.anIntArray74[this.anInt308]]);
			}
			if (this.aBoolean64 && this.anInt370 == 1) {
				this.method211(107);
			}
			this.aClass35_12.method525(553, 205, super.aGraphics2, this.anInt293);
			this.aClass35_14.method524();
			Class1_Sub1_Sub2_Sub1.anIntArray180 = this.anIntArray68;
		} catch (@Pc(83) RuntimeException local83) {
			signlink.reporterror("80816, " + arg0 + ", " + local83.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(BILclient!d;)I")
	private int method137(@OriginalArg(1) int arg0, @OriginalArg(2) Class6 arg1) {
		try {
			if (arg1.anIntArrayArray7 == null || arg0 >= arg1.anIntArrayArray7.length) {
				return -2;
			}
			try {
				@Pc(21) int[] local21 = arg1.anIntArrayArray7[arg0];
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
						local34 = this.anIntArray93[local21[local25++]];
					}
					if (local32 == 2) {
						local34 = this.anIntArray65[local21[local25++]];
					}
					if (local32 == 3) {
						local34 = this.anIntArray40[local21[local25++]];
					}
					@Pc(83) Class6 local83;
					@Pc(88) int local88;
					@Pc(101) int local101;
					if (local32 == 4) {
						local83 = Class6.aClass6Array1[local21[local25++]];
						local88 = local21[local25++];
						if (local88 >= 0 && local88 < Class15.anInt617 && (!Class15.method361(local88).aBoolean167 || aBoolean76)) {
							for (local101 = 0; local101 < local83.anIntArray94.length; local101++) {
								if (local83.anIntArray94[local101] == local88 + 1) {
									local34 += local83.anIntArray95[local101];
								}
							}
						}
					}
					if (local32 == 5) {
						local34 = this.anIntArray81[local21[local25++]];
					}
					if (local32 == 6) {
						local34 = anIntArray64[this.anIntArray65[local21[local25++]] - 1];
					}
					if (local32 == 7) {
						local34 = this.anIntArray81[local21[local25++]] * 100 / 46875;
					}
					if (local32 == 8) {
						local34 = aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt139;
					}
					@Pc(176) int local176;
					if (local32 == 9) {
						for (local176 = 0; local176 < Class30.anInt830; local176++) {
							if (Class30.aBooleanArray9[local176]) {
								local34 += this.anIntArray65[local176];
							}
						}
					}
					if (local32 == 10) {
						local83 = Class6.aClass6Array1[local21[local25++]];
						local88 = local21[local25++] + 1;
						if (local88 >= 0 && local88 < Class15.anInt617 && (!Class15.method361(local88).aBoolean167 || aBoolean76)) {
							for (local101 = 0; local101 < local83.anIntArray94.length; local101++) {
								if (local83.anIntArray94[local101] == local88) {
									local34 = 999999999;
									break;
								}
							}
						}
					}
					if (local32 == 11) {
						local34 = this.anInt268;
					}
					if (local32 == 12) {
						local34 = this.anInt410;
					}
					if (local32 == 13) {
						local176 = this.anIntArray81[local21[local25++]];
						local88 = local21[local25++];
						local34 = (local176 & 0x1 << local88) == 0 ? 0 : 1;
					}
					if (local32 == 14) {
						local176 = local21[local25++];
						@Pc(291) Class36 local291 = Class36.aClass36Array1[local176];
						local101 = local291.anInt862;
						@Pc(297) int local297 = local291.anInt863;
						@Pc(300) int local300 = local291.anInt864;
						@Pc(306) int local306 = anIntArray91[local300 - local297];
						local34 = this.anIntArray81[local101] >> local297 & local306;
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
						local34 = (aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt1009 >> 7) + this.anInt302;
					}
					if (local32 == 19) {
						local34 = (aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt1010 >> 7) + this.anInt303;
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
			signlink.reporterror("66129, " + 96 + ", " + arg0 + ", " + arg1 + ", " + local402.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(II)V")
	private void method138(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(9) Class29 local9 = this.aClass29ArrayArrayArray1[this.anInt355][arg0][arg1];
		if (local9 == null) {
			this.aClass37_1.method551(this.anInt355, arg0, arg1);
			return;
		}
		@Pc(21) int local21 = -99999999;
		@Pc(23) Class1_Sub1_Sub1_Sub3 local23 = null;
		@Pc(27) Class1_Sub1_Sub1_Sub3 local27;
		for (local27 = (Class1_Sub1_Sub1_Sub3) local9.method511(); local27 != null; local27 = (Class1_Sub1_Sub1_Sub3) local9.method513()) {
			@Pc(32) Class15 local32 = Class15.method361(local27.anInt191);
			@Pc(35) int local35 = local32.anInt628;
			if (local32.aBoolean166) {
				local35 *= local27.anInt192 + 1;
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
			if (local27.anInt191 != local23.anInt191 && local65 == null) {
				local65 = local27;
			}
			if (local27.anInt191 != local23.anInt191 && local27.anInt191 != local65.anInt191 && local67 == null) {
				local67 = local27;
			}
		}
		@Pc(110) int local110 = arg0 + (arg1 << 7) + 1610612736;
		this.aClass37_1.method537(arg0, local23, local65, local67, this.method200(arg0 * 128 + 64, this.anInt355, arg1 * 128 + 64), local110, this.anInt355, arg1);
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(ILclient!lb;I)V")
	private void method140(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub1_Sub3 arg1) {
		try {
			arg1.method490();
			if (this.anInt356 > 6 || this.anInt356 < 6) {
				this.anInt315 = arg1.method480();
			}
			@Pc(22) int local22 = arg1.method491(8, this.aByte9);
			@Pc(28) int local28;
			if (local22 < this.anInt266) {
				for (local28 = local22; local28 < this.anInt266; local28++) {
					this.anIntArray54[this.anInt267++] = this.anIntArray53[local28];
				}
			}
			if (local22 > this.anInt266) {
				signlink.reporterror(this.aString6 + " Too many npcs");
				throw new RuntimeException("eek");
			}
			this.anInt266 = 0;
			for (local28 = 0; local28 < local22; local28++) {
				@Pc(80) int local80 = this.anIntArray53[local28];
				@Pc(85) Class1_Sub1_Sub1_Sub1_Sub2 local85 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local80];
				@Pc(91) int local91 = arg1.method491(1, this.aByte9);
				if (local91 == 0) {
					this.anIntArray53[this.anInt266++] = local80;
					local85.anInt1049 = anInt252;
				} else {
					@Pc(115) int local115 = arg1.method491(2, this.aByte9);
					if (local115 == 0) {
						this.anIntArray53[this.anInt266++] = local80;
						local85.anInt1049 = anInt252;
						this.anIntArray35[this.anInt233++] = local80;
					} else {
						@Pc(167) int local167;
						@Pc(178) int local178;
						if (local115 == 1) {
							this.anIntArray53[this.anInt266++] = local80;
							local85.anInt1049 = anInt252;
							local167 = arg1.method491(3, this.aByte9);
							local85.method678(false, local167);
							local178 = arg1.method491(1, this.aByte9);
							if (local178 == 1) {
								this.anIntArray35[this.anInt233++] = local80;
							}
						} else if (local115 == 2) {
							this.anIntArray53[this.anInt266++] = local80;
							local85.anInt1049 = anInt252;
							local167 = arg1.method491(3, this.aByte9);
							local85.method678(true, local167);
							local178 = arg1.method491(3, this.aByte9);
							local85.method678(true, local178);
							@Pc(239) int local239 = arg1.method491(1, this.aByte9);
							if (local239 == 1) {
								this.anIntArray35[this.anInt233++] = local80;
							}
						} else if (local115 == 3) {
							this.anIntArray54[this.anInt267++] = local80;
						}
					}
				}
			}
		} catch (@Pc(276) RuntimeException local276) {
			signlink.reporterror("57661, " + arg0 + ", " + arg1 + ", " + 6 + ", " + local276.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "g", descriptor = "(B)V")
	private void method141(@OriginalArg(0) byte arg0) {
		try {
			@Pc(6) boolean local6 = false;
			this.aClass35_13.method524();
			@Pc(28) int local28;
			@Pc(30) int local30;
			if (this.anInt357 == 2) {
				@Pc(23) byte[] local23 = this.aClass1_Sub1_Sub2_Sub3_7.aByteArray7;
				@Pc(25) int[] local25 = Class1_Sub1_Sub2.anIntArray213;
				local28 = local23.length;
				for (local30 = 0; local30 < local28; local30++) {
					if (local23[local30] == 0) {
						local25[local30] = 0;
					}
				}
				this.aClass1_Sub1_Sub2_Sub2_4.method395(this.anInt398, 33, 25, this.anIntArray86, 0, 256, 25, this.anIntArray57, 0, 33);
				this.aClass35_14.method524();
			} else {
				@Pc(74) int local74 = this.anInt398 + this.anInt349 & 0x7FF;
				@Pc(81) int local81 = aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt1009 / 32 + 48;
				local28 = 464 - aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt1010 / 32;
				this.aClass1_Sub1_Sub2_Sub2_3.method395(local74, 146, local28, this.anIntArray92, 25, this.anInt241 + 256, local81, this.anIntArray79, 5, 151);
				this.aClass1_Sub1_Sub2_Sub2_4.method395(this.anInt398, 33, 25, this.anIntArray86, 0, 256, 25, this.anIntArray57, 0, 33);
				for (local30 = 0; local30 < this.anInt220; local30++) {
					local81 = this.anIntArray32[local30] * 4 + 2 - aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt1009 / 32;
					local28 = this.anIntArray33[local30] * 4 + 2 - aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt1010 / 32;
					this.method99(this.aClass1_Sub1_Sub2_Sub2Array5[local30], local28, local81);
				}
				@Pc(176) int local176;
				for (@Pc(172) int local172 = 0; local172 < 104; local172++) {
					for (local176 = 0; local176 < 104; local176++) {
						@Pc(188) Class29 local188 = this.aClass29ArrayArrayArray1[this.anInt355][local172][local176];
						if (local188 != null) {
							local81 = local172 * 4 + 2 - aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt1009 / 32;
							local28 = local176 * 4 + 2 - aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt1010 / 32;
							this.method99(this.aClass1_Sub1_Sub2_Sub2_10, local28, local81);
						}
					}
				}
				for (local176 = 0; local176 < this.anInt266; local176++) {
					@Pc(239) Class1_Sub1_Sub1_Sub1_Sub2 local239 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[this.anIntArray53[local176]];
					if (local239 != null && local239.method680()) {
						@Pc(248) Class13 local248 = local239.aClass13_2;
						if (local248.anIntArray174 != null) {
							local248 = local248.method327();
						}
						if (local248 != null && local248.aBoolean152) {
							local81 = local239.anInt1009 / 32 - aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt1009 / 32;
							local28 = local239.anInt1010 / 32 - aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt1010 / 32;
							this.method99(this.aClass1_Sub1_Sub2_Sub2_11, local28, local81);
						}
					}
				}
				@Pc(304) Class1_Sub1_Sub1_Sub1_Sub1 local304;
				for (@Pc(294) int local294 = 0; local294 < this.anInt232; local294++) {
					local304 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[this.anIntArray34[local294]];
					if (local304 != null && local304.method680()) {
						local81 = local304.anInt1009 / 32 - aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt1009 / 32;
						local28 = local304.anInt1010 / 32 - aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt1010 / 32;
						@Pc(332) boolean local332 = false;
						@Pc(336) long local336 = Class48.method667(local304.aString3);
						for (@Pc(338) int local338 = 0; local338 < this.anInt351; local338++) {
							if (local336 == this.aLongArray3[local338] && this.anIntArray59[local338] != 0) {
								local332 = true;
								break;
							}
						}
						if (aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt151 != 0 && local304.anInt151 != 0) {
							if (aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt151 == local304.anInt151) {
								local332 = true;
							} else {
								local332 = false;
							}
						}
						if (local332) {
							this.method99(this.aClass1_Sub1_Sub2_Sub2_13, local28, local81);
						} else {
							this.method99(this.aClass1_Sub1_Sub2_Sub2_12, local28, local81);
						}
					}
				}
				if (this.anInt362 != 0 && anInt252 % 20 < 10) {
					if (this.anInt362 == 1 && this.anInt306 >= 0 && this.anInt306 < this.aClass1_Sub1_Sub1_Sub1_Sub2Array1.length) {
						@Pc(428) Class1_Sub1_Sub1_Sub1_Sub2 local428 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[this.anInt306];
						if (local428 != null) {
							local81 = local428.anInt1009 / 32 - aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt1009 / 32;
							local28 = local428.anInt1010 / 32 - aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt1010 / 32;
							this.method202(local81, local28, this.aClass1_Sub1_Sub2_Sub2_2);
						}
					}
					if (this.anInt362 == 2) {
						local81 = (this.anInt422 - this.anInt302) * 4 + 2 - aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt1009 / 32;
						local28 = (this.anInt423 - this.anInt303) * 4 + 2 - aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt1010 / 32;
						this.method202(local81, local28, this.aClass1_Sub1_Sub2_Sub2_2);
					}
					if (this.anInt362 == 10 && this.anInt385 >= 0 && this.anInt385 < this.aClass1_Sub1_Sub1_Sub1_Sub1Array1.length) {
						local304 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[this.anInt385];
						if (local304 != null) {
							local81 = local304.anInt1009 / 32 - aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt1009 / 32;
							local28 = local304.anInt1010 / 32 - aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt1010 / 32;
							this.method202(local81, local28, this.aClass1_Sub1_Sub2_Sub2_2);
						}
					}
				}
				if (this.anInt285 != 0) {
					local81 = this.anInt285 * 4 + 2 - aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt1009 / 32;
					local28 = this.anInt286 * 4 + 2 - aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt1010 / 32;
					this.method99(this.aClass1_Sub1_Sub2_Sub2_1, local28, local81);
				}
				Class1_Sub1_Sub2.method439(16777215, 78, 3, 97, 3);
				this.aClass35_14.method524();
			}
		} catch (@Pc(593) RuntimeException local593) {
			signlink.reporterror("36911, " + arg0 + ", " + local593.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "i", descriptor = "(I)V")
	private void method142(@OriginalArg(0) int arg0) {
		try {
			@Pc(5) boolean local5 = false;
			anInt419++;
			if (anInt419 > 192) {
				anInt419 = 0;
				this.aClass1_Sub1_Sub3_4.method469(24);
				this.aClass1_Sub1_Sub3_4.method470(232);
			}
			while (true) {
				@Pc(27) int local27;
				do {
					while (true) {
						local27 = this.method88();
						if (local27 == -1) {
							return;
						}
						if (this.anInt386 != -1 && this.anInt386 == this.anInt324) {
							if (local27 == 8 && this.aString5.length() > 0) {
								this.aString5 = this.aString5.substring(0, this.aString5.length() - 1);
							}
							break;
						}
						@Pc(208) int local208;
						if (this.aBoolean73) {
							if (local27 >= 32 && local27 <= 122 && this.aString14.length() < 80) {
								this.aString14 = this.aString14 + (char) local27;
								this.aBoolean68 = true;
							}
							if (local27 == 8 && this.aString14.length() > 0) {
								this.aString14 = this.aString14.substring(0, this.aString14.length() - 1);
								this.aBoolean68 = true;
							}
							if (local27 == 13 || local27 == 10) {
								this.aBoolean73 = false;
								this.aBoolean68 = true;
								@Pc(167) long local167;
								if (this.anInt259 == 1) {
									local167 = Class48.method667(this.aString14);
									this.method177(local167);
								}
								if (this.anInt259 == 2 && this.anInt351 > 0) {
									local167 = Class48.method667(this.aString14);
									this.method98(local167, this.aByte18);
								}
								if (this.anInt259 == 3 && this.aString14.length() > 0) {
									this.aClass1_Sub1_Sub3_4.method469(47);
									this.aClass1_Sub1_Sub3_4.method470(0);
									local208 = this.aClass1_Sub1_Sub3_4.anInt763;
									this.aClass1_Sub1_Sub3_4.method476(this.aLong16, 359);
									Class49.method684(this.aString14, this.aClass1_Sub1_Sub3_4);
									this.aClass1_Sub1_Sub3_4.method479(this.aClass1_Sub1_Sub3_4.anInt763 - local208);
									this.aString14 = Class49.method685(this.anInt270, this.aString14);
									this.aString14 = Class42.method604(this.anInt270, this.aString14);
									this.method152(Class48.method671(Class48.method668(this.aLong16, this.anInt219)), this.aString14, 6);
									if (this.anInt417 == 2) {
										this.anInt417 = 1;
										this.aBoolean69 = true;
										this.aClass1_Sub1_Sub3_4.method469(242);
										this.aClass1_Sub1_Sub3_4.method470(this.anInt246);
										this.aClass1_Sub1_Sub3_4.method470(this.anInt417);
										this.aClass1_Sub1_Sub3_4.method470(this.anInt376);
									}
								}
								if (this.anInt259 == 4 && this.anInt384 < 100) {
									local167 = Class48.method667(this.aString14);
									this.method221(local167);
								}
								if (this.anInt259 == 5 && this.anInt384 > 0) {
									local167 = Class48.method667(this.aString14);
									this.method126(local167);
								}
							}
						} else if (this.aBoolean78) {
							if (local27 >= 48 && local27 <= 57 && this.aString10.length() < 10) {
								this.aString10 = this.aString10 + (char) local27;
								this.aBoolean68 = true;
							}
							if (local27 == 8 && this.aString10.length() > 0) {
								this.aString10 = this.aString10.substring(0, this.aString10.length() - 1);
								this.aBoolean68 = true;
							}
							if (local27 == 13 || local27 == 10) {
								if (this.aString10.length() > 0) {
									local208 = 0;
									try {
										local208 = Integer.parseInt(this.aString10);
									} catch (@Pc(387) Exception local387) {
									}
									this.aClass1_Sub1_Sub3_4.method469(236);
									this.aClass1_Sub1_Sub3_4.method474(local208);
								}
								this.aBoolean78 = false;
								this.aBoolean68 = true;
							}
						} else if (this.anInt235 == -1) {
							if (local27 >= 32 && local27 <= 122 && this.aString11.length() < 80) {
								this.aString11 = this.aString11 + (char) local27;
								this.aBoolean68 = true;
							}
							if (local27 == 8 && this.aString11.length() > 0) {
								this.aString11 = this.aString11.substring(0, this.aString11.length() - 1);
								this.aBoolean68 = true;
							}
							if ((local27 == 13 || local27 == 10) && this.aString11.length() > 0) {
								if (this.anInt331 == 2) {
									if (this.aString11.equals("::clientdrop")) {
										this.method103(this.aBoolean62);
									}
									if (this.aString11.equals("::lag")) {
										this.method161();
									}
									if (this.aString11.equals("::prefetchmusic")) {
										for (local208 = 0; local208 < this.aClass44_Sub1_1.method638(2, 763); local208++) {
											this.aClass44_Sub1_1.method648(local208, (byte) 1, 2);
										}
									}
									if (this.aString11.equals("::fpson")) {
										aBoolean86 = true;
									}
									if (this.aString11.equals("::fpsoff")) {
										aBoolean86 = false;
									}
								}
								if (this.aString11.startsWith("::")) {
									this.aClass1_Sub1_Sub3_4.method469(248);
									this.aClass1_Sub1_Sub3_4.method470(this.aString11.length() - 1);
									this.aClass1_Sub1_Sub3_4.method477(this.aString11.substring(2));
								} else {
									@Pc(555) String local555 = this.aString11.toLowerCase();
									@Pc(557) byte local557 = 0;
									if (local555.startsWith("yellow:")) {
										local557 = 0;
										this.aString11 = this.aString11.substring(7);
									} else if (local555.startsWith("red:")) {
										local557 = 1;
										this.aString11 = this.aString11.substring(4);
									} else if (local555.startsWith("green:")) {
										local557 = 2;
										this.aString11 = this.aString11.substring(6);
									} else if (local555.startsWith("cyan:")) {
										local557 = 3;
										this.aString11 = this.aString11.substring(5);
									} else if (local555.startsWith("purple:")) {
										local557 = 4;
										this.aString11 = this.aString11.substring(7);
									} else if (local555.startsWith("white:")) {
										local557 = 5;
										this.aString11 = this.aString11.substring(6);
									} else if (local555.startsWith("flash1:")) {
										local557 = 6;
										this.aString11 = this.aString11.substring(7);
									} else if (local555.startsWith("flash2:")) {
										local557 = 7;
										this.aString11 = this.aString11.substring(7);
									} else if (local555.startsWith("flash3:")) {
										local557 = 8;
										this.aString11 = this.aString11.substring(7);
									} else if (local555.startsWith("glow1:")) {
										local557 = 9;
										this.aString11 = this.aString11.substring(6);
									} else if (local555.startsWith("glow2:")) {
										local557 = 10;
										this.aString11 = this.aString11.substring(6);
									} else if (local555.startsWith("glow3:")) {
										local557 = 11;
										this.aString11 = this.aString11.substring(6);
									}
									local555 = this.aString11.toLowerCase();
									@Pc(729) byte local729 = 0;
									if (local555.startsWith("wave:")) {
										local729 = 1;
										this.aString11 = this.aString11.substring(5);
									} else if (local555.startsWith("wave2:")) {
										local729 = 2;
										this.aString11 = this.aString11.substring(6);
									} else if (local555.startsWith("shake:")) {
										local729 = 3;
										this.aString11 = this.aString11.substring(6);
									} else if (local555.startsWith("scroll:")) {
										local729 = 4;
										this.aString11 = this.aString11.substring(7);
									} else if (local555.startsWith("slide:")) {
										local729 = 5;
										this.aString11 = this.aString11.substring(6);
									}
									this.aClass1_Sub1_Sub3_4.method469(37);
									this.aClass1_Sub1_Sub3_4.method470(0);
									@Pc(810) int local810 = this.aClass1_Sub1_Sub3_4.anInt763;
									this.aClass1_Sub1_Sub3_4.method470(local557);
									this.aClass1_Sub1_Sub3_4.method470(local729);
									Class49.method684(this.aString11, this.aClass1_Sub1_Sub3_4);
									this.aClass1_Sub1_Sub3_4.method479(this.aClass1_Sub1_Sub3_4.anInt763 - local810);
									this.aString11 = Class49.method685(this.anInt270, this.aString11);
									this.aString11 = Class42.method604(this.anInt270, this.aString11);
									aClass1_Sub1_Sub1_Sub1_Sub1_1.aString31 = this.aString11;
									aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt1021 = local557;
									aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt1022 = local729;
									aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt1020 = 150;
									if (this.anInt331 == 2) {
										this.method152("@cr2@" + aClass1_Sub1_Sub1_Sub1_Sub1_1.aString3, aClass1_Sub1_Sub1_Sub1_Sub1_1.aString31, 2);
									} else if (this.anInt331 == 1) {
										this.method152("@cr1@" + aClass1_Sub1_Sub1_Sub1_Sub1_1.aString3, aClass1_Sub1_Sub1_Sub1_Sub1_1.aString31, 2);
									} else {
										this.method152(aClass1_Sub1_Sub1_Sub1_Sub1_1.aString3, aClass1_Sub1_Sub1_Sub1_Sub1_1.aString31, 2);
									}
									if (this.anInt246 == 2) {
										this.anInt246 = 3;
										this.aBoolean69 = true;
										this.aClass1_Sub1_Sub3_4.method469(242);
										this.aClass1_Sub1_Sub3_4.method470(this.anInt246);
										this.aClass1_Sub1_Sub3_4.method470(this.anInt417);
										this.aClass1_Sub1_Sub3_4.method470(this.anInt376);
									}
								}
								this.aString11 = "";
								this.aBoolean68 = true;
							}
						}
					}
				} while ((local27 < 97 || local27 > 122) && (local27 < 65 || local27 > 90) && (local27 < 48 || local27 > 57) && local27 != 32);
				if (this.aString5.length() < 12) {
					this.aString5 = this.aString5 + (char) local27;
				}
			}
		} catch (@Pc(948) RuntimeException local948) {
			signlink.reporterror("38196, " + arg0 + ", " + local948.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ZLclient!d;)V")
	private void method143(@OriginalArg(1) Class6 arg0) {
		try {
			@Pc(4) int local4 = arg0.anInt435;
			@Pc(63) int local63;
			if ((local4 < 1 || local4 > 100) && (local4 < 701 || local4 > 800)) {
				if (local4 >= 101 && local4 <= 200 || local4 >= 801 && local4 <= 900) {
					local63 = this.anInt351;
					if (this.anInt352 != 2) {
						local63 = 0;
					}
					if (local4 > 800) {
						local4 -= 701;
					} else {
						local4 -= 101;
					}
					if (local4 >= local63) {
						arg0.aString18 = "";
						arg0.anInt434 = 0;
					} else {
						if (this.anIntArray59[local4] == 0) {
							arg0.aString18 = "@red@Offline";
						} else if (this.anIntArray59[local4] == anInt339) {
							arg0.aString18 = "@gre@World-" + (this.anIntArray59[local4] - 9);
						} else {
							arg0.aString18 = "@yel@World-" + (this.anIntArray59[local4] - 9);
						}
						arg0.anInt434 = 1;
					}
				} else if (local4 == 203) {
					local63 = this.anInt351;
					if (this.anInt352 != 2) {
						local63 = 0;
					}
					arg0.anInt441 = local63 * 15 + 20;
					if (arg0.anInt441 <= arg0.anInt437) {
						arg0.anInt441 = arg0.anInt437 + 1;
					}
				} else if (local4 >= 401 && local4 <= 500) {
					local4 -= 401;
					if (local4 == 0 && this.anInt352 == 0) {
						arg0.aString18 = "Loading ignore list";
						arg0.anInt434 = 0;
					} else if (local4 == 1 && this.anInt352 == 0) {
						arg0.aString18 = "Please wait...";
						arg0.anInt434 = 0;
					} else {
						local63 = this.anInt384;
						if (this.anInt352 == 0) {
							local63 = 0;
						}
						if (local4 >= local63) {
							arg0.aString18 = "";
							arg0.anInt434 = 0;
						} else {
							arg0.aString18 = Class48.method671(Class48.method668(this.aLongArray4[local4], this.anInt219));
							arg0.anInt434 = 1;
						}
					}
				} else if (local4 == 503) {
					arg0.anInt441 = this.anInt384 * 15 + 20;
					if (arg0.anInt441 <= arg0.anInt437) {
						arg0.anInt441 = arg0.anInt437 + 1;
					}
				} else if (local4 == 327) {
					arg0.anInt457 = 150;
					arg0.anInt458 = (int) (Math.sin((double) anInt252 / 40.0D) * 256.0D) & 0x7FF;
					if (this.aBoolean48) {
						for (local63 = 0; local63 < 7; local63++) {
							@Pc(333) int local333 = this.anIntArray55[local63];
							if (local333 >= 0 && !Class23.aClass23Array1[local333].method498()) {
								return;
							}
						}
						this.aBoolean48 = false;
						@Pc(352) Class1_Sub1_Sub1_Sub5[] local352 = new Class1_Sub1_Sub1_Sub5[7];
						@Pc(354) int local354 = 0;
						for (@Pc(356) int local356 = 0; local356 < 7; local356++) {
							@Pc(363) int local363 = this.anIntArray55[local356];
							if (local363 >= 0) {
								local352[local354++] = Class23.aClass23Array1[local363].method499();
							}
						}
						@Pc(386) Class1_Sub1_Sub1_Sub5 local386 = new Class1_Sub1_Sub1_Sub5(local352, this.aByte6, local354);
						for (@Pc(388) int local388 = 0; local388 < 5; local388++) {
							if (this.anIntArray73[local388] != 0) {
								local386.method275(anIntArrayArray5[local388][0], anIntArrayArray5[local388][this.anIntArray73[local388]]);
								if (local388 == 1) {
									local386.method275(anIntArray72[0], anIntArray72[this.anIntArray73[local388]]);
								}
							}
						}
						local386.method268();
						local386.method269(Class27.aClass27Array1[aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt1013].anIntArray225[0]);
						local386.method278(64, 850, -30, -50, -30, true);
						arg0.anInt450 = 5;
						arg0.anInt451 = 0;
						Class6.method235(local386);
					}
				} else if (local4 == 324) {
					if (this.aClass1_Sub1_Sub2_Sub2_5 == null) {
						this.aClass1_Sub1_Sub2_Sub2_5 = arg0.aClass1_Sub1_Sub2_Sub2_14;
						this.aClass1_Sub1_Sub2_Sub2_6 = arg0.aClass1_Sub1_Sub2_Sub2_15;
					}
					if (this.aBoolean54) {
						arg0.aClass1_Sub1_Sub2_Sub2_14 = this.aClass1_Sub1_Sub2_Sub2_6;
					} else {
						arg0.aClass1_Sub1_Sub2_Sub2_14 = this.aClass1_Sub1_Sub2_Sub2_5;
					}
				} else if (local4 == 325) {
					if (this.aClass1_Sub1_Sub2_Sub2_5 == null) {
						this.aClass1_Sub1_Sub2_Sub2_5 = arg0.aClass1_Sub1_Sub2_Sub2_14;
						this.aClass1_Sub1_Sub2_Sub2_6 = arg0.aClass1_Sub1_Sub2_Sub2_15;
					}
					if (this.aBoolean54) {
						arg0.aClass1_Sub1_Sub2_Sub2_14 = this.aClass1_Sub1_Sub2_Sub2_5;
					} else {
						arg0.aClass1_Sub1_Sub2_Sub2_14 = this.aClass1_Sub1_Sub2_Sub2_6;
					}
				} else if (local4 == 600) {
					arg0.aString18 = this.aString5;
					if (anInt252 % 20 < 10) {
						arg0.aString18 = arg0.aString18 + "|";
					} else {
						arg0.aString18 = arg0.aString18 + " ";
					}
				} else {
					if (local4 == 613) {
						if (this.anInt331 < 1) {
							arg0.aString18 = "";
						} else if (this.aBoolean93) {
							arg0.anInt446 = 16711680;
							arg0.aString18 = "Moderator option: Mute player for 48 hours: <ON>";
						} else {
							arg0.anInt446 = 16777215;
							arg0.aString18 = "Moderator option: Mute player for 48 hours: <OFF>";
						}
					}
					@Pc(594) String local594;
					if (local4 == 650 || local4 == 655) {
						if (this.anInt307 == 0) {
							arg0.aString18 = "";
						} else {
							if (this.anInt325 == 0) {
								local594 = "earlier today";
							} else if (this.anInt325 == 1) {
								local594 = "yesterday";
							} else {
								local594 = this.anInt325 + " days ago";
							}
							arg0.aString18 = "You last logged in " + local594 + " from: " + signlink.dns;
						}
					}
					if (local4 == 651) {
						if (this.anInt375 == 0) {
							arg0.aString18 = "0 unread messages";
							arg0.anInt446 = 16776960;
						}
						if (this.anInt375 == 1) {
							arg0.aString18 = "1 unread message";
							arg0.anInt446 = 65280;
						}
						if (this.anInt375 > 1) {
							arg0.aString18 = this.anInt375 + " unread messages";
							arg0.anInt446 = 65280;
						}
					}
					if (local4 == 652) {
						if (this.anInt273 == 201) {
							if (this.anInt319 == 1) {
								arg0.aString18 = "@yel@This is a non-members world: @whi@Since you are a member we";
							} else {
								arg0.aString18 = "";
							}
						} else if (this.anInt273 == 200) {
							arg0.aString18 = "You have not yet set any password recovery questions.";
						} else {
							if (this.anInt273 == 0) {
								local594 = "Earlier today";
							} else if (this.anInt273 == 1) {
								local594 = "Yesterday";
							} else {
								local594 = this.anInt273 + " days ago";
							}
							arg0.aString18 = local594 + " you changed your recovery questions";
						}
					}
					if (local4 == 653) {
						if (this.anInt273 == 201) {
							if (this.anInt319 == 1) {
								arg0.aString18 = "@whi@recommend you use a members world instead. You may use";
							} else {
								arg0.aString18 = "";
							}
						} else if (this.anInt273 == 200) {
							arg0.aString18 = "We strongly recommend you do so now to secure your account.";
						} else {
							arg0.aString18 = "If you do not remember making this change then cancel it immediately";
						}
					}
					if (local4 == 654) {
						if (this.anInt273 == 201) {
							if (this.anInt319 == 1) {
								arg0.aString18 = "@whi@this world but member benefits are unavailable whilst here.";
							} else {
								arg0.aString18 = "";
							}
						} else if (this.anInt273 == 200) {
							arg0.aString18 = "Do this from the 'account management' area on our front webpage";
						} else {
							arg0.aString18 = "Do this from the 'account management' area on our front webpage";
						}
					}
				}
			} else if (local4 == 1 && this.anInt352 == 0) {
				arg0.aString18 = "Loading friend list";
				arg0.anInt434 = 0;
			} else if (local4 == 1 && this.anInt352 == 1) {
				arg0.aString18 = "Connecting to friendserver";
				arg0.anInt434 = 0;
			} else if (local4 == 2 && this.anInt352 != 2) {
				arg0.aString18 = "Please wait...";
				arg0.anInt434 = 0;
			} else {
				local63 = this.anInt351;
				if (this.anInt352 != 2) {
					local63 = 0;
				}
				if (local4 > 700) {
					local4 -= 601;
				} else {
					local4--;
				}
				if (local4 >= local63) {
					arg0.aString18 = "";
					arg0.anInt434 = 0;
				} else {
					arg0.aString18 = this.aStringArray5[local4];
					arg0.anInt434 = 1;
				}
			}
		} catch (@Pc(802) RuntimeException local802) {
			signlink.reporterror("42508, " + true + ", " + arg0 + ", " + local802.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IB)Ljava/lang/String;")
	private String method144(@OriginalArg(0) int arg0) {
		try {
			if (this.aByte5 != 48) {
				this.anInt389 = this.aClass46_1.method662();
			}
			return arg0 < 999999999 ? String.valueOf(arg0) : "*";
		} catch (@Pc(17) RuntimeException local17) {
			signlink.reporterror("61426, " + arg0 + ", " + 48 + ", " + local17.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIILclient!gc;I)V")
	private void method145(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class13 arg2, @OriginalArg(4) int arg3) {
		try {
			if (this.anInt329 < 400) {
				if (arg2.anIntArray174 != null) {
					arg2 = arg2.method327();
				}
				if (arg2 != null) {
					@Pc(24) String local24 = arg2.aString24;
					if (arg2.anInt578 != 0) {
						local24 = local24 + method215(aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt139, arg2.anInt578) + " (level-" + arg2.anInt578 + ")";
					}
					if (this.anInt297 == 1) {
						this.aStringArray6[this.anInt329] = "Use " + this.aString12 + " with @yel@" + local24;
						this.anIntArray62[this.anInt329] = 829;
						this.anIntArray63[this.anInt329] = arg0;
						this.anIntArray60[this.anInt329] = arg3;
						this.anIntArray61[this.anInt329] = arg1;
						this.anInt329++;
					} else if (this.anInt326 != 1) {
						@Pc(162) int local162;
						if (arg2.aStringArray9 != null) {
							for (local162 = 4; local162 >= 0; local162--) {
								if (arg2.aStringArray9[local162] != null && !arg2.aStringArray9[local162].equalsIgnoreCase("attack")) {
									this.aStringArray6[this.anInt329] = arg2.aStringArray9[local162] + " @yel@" + local24;
									if (local162 == 0) {
										this.anIntArray62[this.anInt329] = 242;
									}
									if (local162 == 1) {
										this.anIntArray62[this.anInt329] = 209;
									}
									if (local162 == 2) {
										this.anIntArray62[this.anInt329] = 309;
									}
									if (local162 == 3) {
										this.anIntArray62[this.anInt329] = 852;
									}
									if (local162 == 4) {
										this.anIntArray62[this.anInt329] = 793;
									}
									this.anIntArray63[this.anInt329] = arg0;
									this.anIntArray60[this.anInt329] = arg3;
									this.anIntArray61[this.anInt329] = arg1;
									this.anInt329++;
								}
							}
						}
						if (arg2.aStringArray9 != null) {
							for (local162 = 4; local162 >= 0; local162--) {
								if (arg2.aStringArray9[local162] != null && arg2.aStringArray9[local162].equalsIgnoreCase("attack")) {
									@Pc(286) short local286 = 0;
									if (arg2.anInt578 > aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt139) {
										local286 = 2000;
									}
									this.aStringArray6[this.anInt329] = arg2.aStringArray9[local162] + " @yel@" + local24;
									if (local162 == 0) {
										this.anIntArray62[this.anInt329] = local286 + 242;
									}
									if (local162 == 1) {
										this.anIntArray62[this.anInt329] = local286 + 209;
									}
									if (local162 == 2) {
										this.anIntArray62[this.anInt329] = local286 + 309;
									}
									if (local162 == 3) {
										this.anIntArray62[this.anInt329] = local286 + 852;
									}
									if (local162 == 4) {
										this.anIntArray62[this.anInt329] = local286 + 793;
									}
									this.anIntArray63[this.anInt329] = arg0;
									this.anIntArray60[this.anInt329] = arg3;
									this.anIntArray61[this.anInt329] = arg1;
									this.anInt329++;
								}
							}
						}
						this.aStringArray6[this.anInt329] = "Examine @yel@" + local24;
						this.anIntArray62[this.anInt329] = 1714;
						this.anIntArray63[this.anInt329] = arg0;
						this.anIntArray60[this.anInt329] = arg3;
						this.anIntArray61[this.anInt329] = arg1;
						this.anInt329++;
					} else if ((this.anInt328 & 0x2) == 2) {
						this.aStringArray6[this.anInt329] = this.aString13 + " @yel@" + local24;
						this.anIntArray62[this.anInt329] = 240;
						this.anIntArray63[this.anInt329] = arg0;
						this.anIntArray60[this.anInt329] = arg3;
						this.anIntArray61[this.anInt329] = arg1;
						this.anInt329++;
						return;
					}
				}
			}
		} catch (@Pc(436) RuntimeException local436) {
			signlink.reporterror("71094, " + arg0 + ", " + arg1 + ", " + 176 + ", " + arg2 + ", " + arg3 + ", " + local436.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "j", descriptor = "(I)V")
	private void method146() {
		try {
			@Pc(4) Graphics local4 = this.method94().getGraphics();
			local4.setColor(Color.black);
			local4.fillRect(0, 0, 765, 503);
			this.method87();
			@Pc(45) byte local45;
			@Pc(51) int local51;
			if (this.aBoolean94) {
				this.aBoolean55 = false;
				local4.setFont(new Font("Helvetica", 1, 16));
				local4.setColor(Color.yellow);
				local45 = 35;
				local4.drawString("Sorry, an error has occured whilst loading RuneScape", 30, 35);
				local51 = local45 + 50;
				local4.setColor(Color.white);
				local4.drawString("To fix this try the following (in order):", 30, 85);
				@Pc(60) int local60 = local51 + 50;
				local4.setColor(Color.white);
				local4.setFont(new Font("Helvetica", 1, 12));
				local4.drawString("1: Try closing ALL open web-browser windows, and reloading", 30, 135);
				@Pc(77) int local77 = local60 + 30;
				local4.drawString("2: Try clearing your web-browsers cache from tools->internet options", 30, 165);
				@Pc(83) int local83 = local77 + 30;
				local4.drawString("3: Try using a different game-world", 30, 195);
				@Pc(89) int local89 = local83 + 30;
				local4.drawString("4: Try rebooting your computer", 30, 225);
				@Pc(95) int local95 = local89 + 30;
				local4.drawString("5: Try selecting a different version of Java from the play-game menu", 30, 255);
			}
			if (this.aBoolean88) {
				this.aBoolean55 = false;
				local4.setFont(new Font("Helvetica", 1, 20));
				local4.setColor(Color.white);
				local4.drawString("Error - unable to load game!", 50, 50);
				local4.drawString("To play RuneScape make sure you play from", 50, 100);
				local4.drawString("http://www.runescape.com", 50, 150);
			}
			if (this.aBoolean89) {
				this.aBoolean55 = false;
				local4.setColor(Color.yellow);
				local45 = 35;
				local4.drawString("Error a copy of RuneScape already appears to be loaded", 30, 35);
				local51 = local45 + 50;
				local4.setColor(Color.white);
				local4.drawString("To fix this try the following (in order):", 30, 85);
				local51 += 50;
				local4.setColor(Color.white);
				local4.setFont(new Font("Helvetica", 1, 12));
				local4.drawString("1: Try closing ALL open web-browser windows, and reloading", 30, 135);
				local51 += 30;
				local4.drawString("2: Try rebooting your computer, and reloading", 30, 165);
				local51 += 30;
			}
		} catch (@Pc(183) RuntimeException local183) {
			signlink.reporterror("94102, " + -509 + ", " + local183.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILclient!d;)Z")
	private boolean method147(@OriginalArg(1) Class6 arg0) {
		try {
			if (arg0.anIntArray96 == null) {
				return false;
			}
			for (@Pc(6) int local6 = 0; local6 < arg0.anIntArray96.length; local6++) {
				@Pc(14) int local14 = this.method137(local6, arg0);
				@Pc(19) int local19 = arg0.anIntArray97[local6];
				if (arg0.anIntArray96[local6] == 2) {
					if (local14 >= local19) {
						return false;
					}
				} else if (arg0.anIntArray96[local6] == 3) {
					if (local14 <= local19) {
						return false;
					}
				} else if (arg0.anIntArray96[local6] == 4) {
					if (local14 == local19) {
						return false;
					}
				} else if (local14 != local19) {
					return false;
				}
			}
			this.anInt314 += 0;
			return true;
		} catch (@Pc(72) RuntimeException local72) {
			signlink.reporterror("72352, " + 0 + ", " + arg0 + ", " + local72.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "k", descriptor = "(I)V")
	private void method148() {
		try {
			Class9.aClass40_4.method593();
			Class9.aClass40_5.method593();
			Class13.aClass40_6.method593();
			Class15.aClass40_7.method593();
			Class15.aClass40_8.method593();
			Class1_Sub1_Sub1_Sub1_Sub1.aClass40_1.method593();
			Class33.aClass40_9.method593();
			this.anInt314 += 0;
		} catch (@Pc(21) RuntimeException local21) {
			signlink.reporterror("46328, " + 0 + ", " + local21.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!d;Z)Z")
	private boolean method149(@OriginalArg(0) Class6 arg0) {
		try {
			@Pc(13) int local13 = arg0.anInt435;
			if (this.anInt352 == 2) {
				if (local13 == 201) {
					this.aBoolean68 = true;
					this.aBoolean78 = false;
					this.aBoolean73 = true;
					this.aString14 = "";
					this.anInt259 = 1;
					this.aString4 = "Enter name of friend to add to list";
				}
				if (local13 == 202) {
					this.aBoolean68 = true;
					this.aBoolean78 = false;
					this.aBoolean73 = true;
					this.aString14 = "";
					this.anInt259 = 2;
					this.aString4 = "Enter name of friend to delete from list";
				}
			}
			if (local13 == 205) {
				this.anInt318 = 250;
				return true;
			}
			if (local13 == 501) {
				this.aBoolean68 = true;
				this.aBoolean78 = false;
				this.aBoolean73 = true;
				this.aString14 = "";
				this.anInt259 = 4;
				this.aString4 = "Enter name of player to add to list";
			}
			if (local13 == 502) {
				this.aBoolean68 = true;
				this.aBoolean78 = false;
				this.aBoolean73 = true;
				this.aString14 = "";
				this.anInt259 = 5;
				this.aString4 = "Enter name of player to delete from list";
			}
			@Pc(121) int local121;
			@Pc(125) int local125;
			@Pc(130) int local130;
			if (local13 >= 300 && local13 <= 313) {
				local121 = (local13 - 300) / 2;
				local125 = local13 & 0x1;
				local130 = this.anIntArray55[local121];
				if (local130 != -1) {
					while (true) {
						if (local125 == 0) {
							local130--;
							if (local130 < 0) {
								local130 = Class23.anInt769 - 1;
							}
						}
						if (local125 == 1) {
							local130++;
							if (local130 >= Class23.anInt769) {
								local130 = 0;
							}
						}
						if (!Class23.aClass23Array1[local130].aBoolean199 && Class23.aClass23Array1[local130].anInt770 == local121 + (this.aBoolean54 ? 0 : 7)) {
							this.anIntArray55[local121] = local130;
							this.aBoolean48 = true;
							break;
						}
					}
				}
			}
			if (local13 >= 314 && local13 <= 323) {
				local121 = (local13 - 314) / 2;
				local125 = local13 & 0x1;
				local130 = this.anIntArray73[local121];
				if (local125 == 0) {
					local130--;
					if (local130 < 0) {
						local130 = anIntArrayArray5[local121].length - 1;
					}
				}
				if (local125 == 1) {
					local130++;
					if (local130 >= anIntArrayArray5[local121].length) {
						local130 = 0;
					}
				}
				this.anIntArray73[local121] = local130;
				this.aBoolean48 = true;
			}
			if (local13 == 324 && !this.aBoolean54) {
				this.aBoolean54 = true;
				this.method122();
			}
			if (local13 == 325 && this.aBoolean54) {
				this.aBoolean54 = false;
				this.method122();
			}
			if (local13 == 326) {
				this.aClass1_Sub1_Sub3_4.method469(145);
				this.aClass1_Sub1_Sub3_4.method470(this.aBoolean54 ? 0 : 1);
				for (local121 = 0; local121 < 7; local121++) {
					this.aClass1_Sub1_Sub3_4.method470(this.anIntArray55[local121]);
				}
				for (local125 = 0; local125 < 5; local125++) {
					this.aClass1_Sub1_Sub3_4.method470(this.anIntArray73[local125]);
				}
				return true;
			}
			if (local13 == 613) {
				this.aBoolean93 = !this.aBoolean93;
			}
			if (local13 >= 601 && local13 <= 612) {
				this.method100();
				if (this.aString5.length() > 0) {
					this.aClass1_Sub1_Sub3_4.method469(85);
					this.aClass1_Sub1_Sub3_4.method476(Class48.method667(this.aString5), 359);
					this.aClass1_Sub1_Sub3_4.method470(local13 - 601);
					this.aClass1_Sub1_Sub3_4.method470(this.aBoolean93 ? 1 : 0);
				}
			}
			return false;
		} catch (@Pc(358) RuntimeException local358) {
			signlink.reporterror("62934, " + arg0 + ", " + false + ", " + local358.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "l", descriptor = "(I)V")
	private void method150() {
		try {
			if (this.aClass35_16 == null) {
				super.aClass35_2 = null;
				this.aClass35_15 = null;
				this.aClass35_13 = null;
				this.aClass35_12 = null;
				this.aClass35_14 = null;
				this.aClass35_25 = null;
				this.aClass35_26 = null;
				this.aClass35_27 = null;
				this.aClass35_19 = new Class35(500, 128, this.method94(), 265);
				Class1_Sub1_Sub2.method437();
				this.aClass35_20 = new Class35(500, 128, this.method94(), 265);
				Class1_Sub1_Sub2.method437();
				this.aClass35_16 = new Class35(500, 509, this.method94(), 171);
				Class1_Sub1_Sub2.method437();
				this.aClass35_17 = new Class35(500, 360, this.method94(), 132);
				Class1_Sub1_Sub2.method437();
				this.aClass35_18 = new Class35(500, 360, this.method94(), 200);
				Class1_Sub1_Sub2.method437();
				this.aClass35_21 = new Class35(500, 202, this.method94(), 238);
				Class1_Sub1_Sub2.method437();
				this.aClass35_22 = new Class35(500, 203, this.method94(), 238);
				Class1_Sub1_Sub2.method437();
				this.aClass35_23 = new Class35(500, 74, this.method94(), 94);
				Class1_Sub1_Sub2.method437();
				this.aClass35_24 = new Class35(500, 75, this.method94(), 94);
				Class1_Sub1_Sub2.method437();
				if (this.aClass47_1 != null) {
					this.method219(anInt391);
					this.method117();
				}
				this.aBoolean75 = true;
				this.anInt314 += 0;
			}
		} catch (@Pc(164) RuntimeException local164) {
			signlink.reporterror("71097, " + 0 + ", " + local164.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIB)I")
	private int method151(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte arg3) {
		try {
			@Pc(3) int local3 = 256 - arg2;
			if (arg3 != 4) {
				this.anInt315 = -1;
			}
			return ((arg0 & 0xFF00FF) * local3 + (arg1 & 0xFF00FF) * arg2 & 0xFF00FF00) + ((arg0 & 0xFF00) * local3 + (arg1 & 0xFF00) * arg2 & 0xFF0000) >> 8;
		} catch (@Pc(40) RuntimeException local40) {
			signlink.reporterror("77851, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local40.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(BLjava/lang/String;Ljava/lang/String;I)V")
	private void method152(@OriginalArg(1) String arg0, @OriginalArg(2) String arg1, @OriginalArg(3) int arg2) {
		try {
			if (arg2 == 0 && this.anInt263 != -1) {
				this.aString9 = arg1;
				super.anInt213 = 0;
			}
			if (this.anInt235 == -1) {
				this.aBoolean68 = true;
			}
			for (@Pc(20) int local20 = 99; local20 > 0; local20--) {
				this.anIntArray37[local20] = this.anIntArray37[local20 - 1];
				this.aStringArray1[local20] = this.aStringArray1[local20 - 1];
				this.aStringArray2[local20] = this.aStringArray2[local20 - 1];
			}
			this.anIntArray37[0] = arg2;
			this.aStringArray1[0] = arg0;
			this.aStringArray2[0] = arg1;
		} catch (@Pc(80) RuntimeException local80) {
			signlink.reporterror("45119, " + -97 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local80.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Ljava/lang/String;)V")
	private void method153(@OriginalArg(0) String arg0) {
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

	@OriginalMember(owner = "client!client", name = "m", descriptor = "(I)V")
	private void method154() {
		try {
			this.aBoolean55 = false;
			while (this.aBoolean49) {
				this.aBoolean55 = false;
				try {
					Thread.sleep(50L);
				} catch (@Pc(11) Exception local11) {
				}
			}
			this.aClass1_Sub1_Sub2_Sub3_19 = null;
			this.aClass1_Sub1_Sub2_Sub3_20 = null;
			this.aClass1_Sub1_Sub2_Sub3Array1 = null;
			this.anInt314 += 0;
			this.anIntArray87 = null;
			this.anIntArray88 = null;
			this.anIntArray89 = null;
			this.anIntArray90 = null;
			this.anIntArray42 = null;
			this.anIntArray43 = null;
			this.anIntArray83 = null;
			this.anIntArray84 = null;
			this.aClass1_Sub1_Sub2_Sub2_8 = null;
			this.aClass1_Sub1_Sub2_Sub2_9 = null;
		} catch (@Pc(62) RuntimeException local62) {
			signlink.reporterror("13198, " + 0 + ", " + local62.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ZB)V")
	private void method155(@OriginalArg(0) boolean arg0) {
		try {
			if (aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt1009 >> 7 == this.anInt285 && aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt1010 >> 7 == this.anInt286) {
				this.anInt285 = 0;
				anInt387++;
				if (anInt387 > 122) {
					anInt387 = 0;
					this.aClass1_Sub1_Sub3_4.method469(110);
					this.aClass1_Sub1_Sub3_4.method470(62);
				}
			}
			@Pc(39) int local39 = this.anInt232;
			if (arg0) {
				local39 = 1;
			}
			for (@Pc(56) int local56 = 0; local56 < local39; local56++) {
				@Pc(62) Class1_Sub1_Sub1_Sub1_Sub1 local62;
				@Pc(67) int local67;
				if (arg0) {
					local62 = aClass1_Sub1_Sub1_Sub1_Sub1_1;
					local67 = this.anInt231 << 14;
				} else {
					local62 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[this.anIntArray34[local56]];
					local67 = this.anIntArray34[local56] << 14;
				}
				if (local62 != null && local62.method680()) {
					local62.aBoolean29 = false;
					if ((aBoolean77 && this.anInt232 > 50 || this.anInt232 > 200) && !arg0 && local62.anInt1029 == local62.anInt1013) {
						local62.aBoolean29 = true;
					}
					@Pc(118) int local118 = local62.anInt1009 >> 7;
					@Pc(123) int local123 = local62.anInt1010 >> 7;
					if (local118 >= 0 && local118 < 104 && local123 >= 0 && local123 < 104) {
						if (local62.aClass1_Sub1_Sub1_Sub5_1 == null || anInt252 < local62.anInt142 || anInt252 >= local62.anInt143) {
							if ((local62.anInt1009 & 0x7F) == 64 && (local62.anInt1010 & 0x7F) == 64) {
								if (this.anIntArrayArray6[local118][local123] == this.anInt321) {
									continue;
								}
								this.anIntArrayArray6[local118][local123] = this.anInt321;
							}
							local62.anInt141 = this.method200(local62.anInt1009, this.anInt355, local62.anInt1010);
							this.aClass37_1.method541(local62.aBoolean252, local62.anInt1011, local62.anInt1010, local62.anInt1009, local67, 60, this.anInt355, local62, local62.anInt141);
						} else {
							local62.aBoolean29 = false;
							local62.anInt141 = this.method200(local62.anInt1009, this.anInt355, local62.anInt1010);
							this.aClass37_1.method542(local67, local62.anInt147, local62, local62.anInt150, this.anInt355, local62.anInt148, local62.anInt141, local62.anInt1010, local62.anInt1011, local62.anInt149, local62.anInt1009);
						}
					}
				}
			}
		} catch (@Pc(252) RuntimeException local252) {
			signlink.reporterror("34939, " + arg0 + ", " + 58 + ", " + local252.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;Z)V")
	private void method156(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) boolean arg2) {
		signlink.errorname = arg0;
		try {
			if (!arg2) {
				this.aString16 = "";
				this.aString17 = "Connecting to server...";
				this.method175(true);
			}
			this.aClass8_1 = new Class8(-323, this.method168(anInt340 + 43594), this);
			@Pc(30) long local30 = Class48.method667(arg0);
			@Pc(37) int local37 = (int) (local30 >> 16 & 0x1FL);
			this.aClass1_Sub1_Sub3_4.anInt763 = 0;
			this.aClass1_Sub1_Sub3_4.method470(14);
			this.aClass1_Sub1_Sub3_4.method470(local37);
			this.aClass8_1.method251(2, this.aClass1_Sub1_Sub3_4.aByteArray9);
			for (@Pc(60) int local60 = 0; local60 < 8; local60++) {
				this.aClass8_1.method248();
			}
			@Pc(74) int local74 = this.aClass8_1.method248();
			@Pc(76) int local76 = local74;
			@Pc(225) int local225;
			@Pc(259) int local259;
			if (local74 == 0) {
				this.aClass8_1.method250(this.aClass1_Sub1_Sub3_3.aByteArray9, 0, 8);
				this.aClass1_Sub1_Sub3_3.anInt763 = 0;
				this.aLong18 = this.aClass1_Sub1_Sub3_3.method486();
				@Pc(99) int[] local99 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (this.aLong18 >> 32), (int) this.aLong18 };
				this.aClass1_Sub1_Sub3_4.anInt763 = 0;
				this.aClass1_Sub1_Sub3_4.method470(10);
				this.aClass1_Sub1_Sub3_4.method474(local99[0]);
				this.aClass1_Sub1_Sub3_4.method474(local99[1]);
				this.aClass1_Sub1_Sub3_4.method474(local99[2]);
				this.aClass1_Sub1_Sub3_4.method474(local99[3]);
				this.aClass1_Sub1_Sub3_4.method474(signlink.anInt952);
				this.aClass1_Sub1_Sub3_4.method477(arg0);
				this.aClass1_Sub1_Sub3_4.method477(arg1);
				this.aClass1_Sub1_Sub3_4.method495(aBigInteger1, aBigInteger2);
				this.aClass1_Sub1_Sub3_2.anInt763 = 0;
				if (arg2) {
					this.aClass1_Sub1_Sub3_2.method470(18);
				} else {
					this.aClass1_Sub1_Sub3_2.method470(16);
				}
				this.aClass1_Sub1_Sub3_2.method470(this.aClass1_Sub1_Sub3_4.anInt763 + 36 + 1 + 1 + 2);
				this.aClass1_Sub1_Sub3_2.method470(255);
				this.aClass1_Sub1_Sub3_2.method471(297);
				this.aClass1_Sub1_Sub3_2.method470(aBoolean77 ? 1 : 0);
				for (local225 = 0; local225 < 9; local225++) {
					this.aClass1_Sub1_Sub3_2.method474(this.anIntArray56[local225]);
				}
				this.aClass1_Sub1_Sub3_2.method478(this.aClass1_Sub1_Sub3_4.aByteArray9, this.aClass1_Sub1_Sub3_4.anInt763);
				this.aClass1_Sub1_Sub3_4.aClass46_2 = new Class46((byte) 99, local99);
				for (local259 = 0; local259 < 4; local259++) {
					local99[local259] += 50;
				}
				this.aClass46_1 = new Class46((byte) 99, local99);
				this.aClass8_1.method251(this.aClass1_Sub1_Sub3_2.anInt763, this.aClass1_Sub1_Sub3_2.aByteArray9);
				local74 = this.aClass8_1.method248();
			}
			if (local74 == 1) {
				try {
					Thread.sleep(2000L);
				} catch (@Pc(301) Exception local301) {
				}
				this.method156(arg0, arg1, arg2);
			} else {
				@Pc(389) int local389;
				if (local74 == 2) {
					this.anInt331 = this.aClass8_1.method248();
					aBoolean80 = this.aClass8_1.method248() == 1;
					this.aLong15 = 0L;
					this.anInt284 = 0;
					this.aClass11_1.anInt548 = 0;
					super.aBoolean46 = true;
					this.aBoolean63 = true;
					this.aBoolean71 = true;
					this.aClass1_Sub1_Sub3_4.anInt763 = 0;
					this.aClass1_Sub1_Sub3_3.anInt763 = 0;
					this.anInt315 = -1;
					this.anInt221 = -1;
					this.anInt222 = -1;
					this.anInt223 = -1;
					this.anInt314 = 0;
					this.anInt316 = 0;
					this.anInt413 = 0;
					this.anInt318 = 0;
					this.anInt362 = 0;
					this.anInt329 = 0;
					this.aBoolean64 = false;
					super.anInt206 = 0;
					for (local389 = 0; local389 < 100; local389++) {
						this.aStringArray2[local389] = null;
					}
					this.anInt297 = 0;
					this.anInt326 = 0;
					this.anInt388 = 0;
					this.anInt407 = 0;
					this.anInt257 = (int) (Math.random() * 100.0D) - 50;
					this.anInt377 = (int) (Math.random() * 110.0D) - 55;
					this.anInt360 = (int) (Math.random() * 80.0D) - 40;
					this.anInt349 = (int) (Math.random() * 120.0D) - 60;
					this.anInt241 = (int) (Math.random() * 30.0D) - 20;
					this.anInt398 = (int) (Math.random() * 20.0D) - 10 & 0x7FF;
					this.anInt357 = 0;
					this.anInt271 = -1;
					this.anInt285 = 0;
					this.anInt286 = 0;
					this.anInt232 = 0;
					this.anInt266 = 0;
					for (local225 = 0; local225 < this.anInt230; local225++) {
						this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local225] = null;
						this.aClass1_Sub1_Sub3Array1[local225] = null;
					}
					for (local259 = 0; local259 < 16384; local259++) {
						this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local259] = null;
					}
					aClass1_Sub1_Sub1_Sub1_Sub1_1 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[this.anInt231] = new Class1_Sub1_Sub1_Sub1_Sub1();
					this.aClass29_1.method515();
					this.aClass29_2.method515();
					@Pc(534) int local534;
					@Pc(538) int local538;
					for (@Pc(530) int local530 = 0; local530 < 4; local530++) {
						for (local534 = 0; local534 < 104; local534++) {
							for (local538 = 0; local538 < 104; local538++) {
								this.aClass29ArrayArrayArray1[local530][local534][local538] = null;
							}
						}
					}
					this.aClass29_3 = new Class29(464);
					this.anInt352 = 0;
					this.anInt351 = 0;
					this.anInt263 = -1;
					this.anInt235 = -1;
					this.anInt386 = -1;
					this.anInt383 = -1;
					this.anInt348 = -1;
					this.aBoolean92 = false;
					this.anInt308 = 3;
					this.aBoolean78 = false;
					this.aBoolean64 = false;
					this.aBoolean73 = false;
					this.aString9 = null;
					this.anInt251 = 0;
					this.anInt395 = -1;
					this.aBoolean54 = true;
					this.method122();
					for (local534 = 0; local534 < 5; local534++) {
						this.anIntArray73[local534] = 0;
					}
					for (local538 = 0; local538 < 5; local538++) {
						this.aStringArray3[local538] = null;
						this.aBooleanArray3[local538] = false;
					}
					anInt245 = 0;
					anInt368 = 0;
					anInt244 = 0;
					anInt295 = 0;
					anInt240 = 0;
					anInt392 = 0;
					anInt248 = 0;
					anInt418 = 0;
					anInt234 = 0;
					this.method170();
				} else if (local74 == 3) {
					this.aString16 = "";
					this.aString17 = "Invalid username or password.";
				} else if (local74 == 4) {
					this.aString16 = "Your account has been disabled.";
					this.aString17 = "Please check your message-centre for details.";
				} else if (local74 == 5) {
					this.aString16 = "Your account is already logged in.";
					this.aString17 = "Try again in 60 secs...";
				} else if (local74 == 6) {
					this.aString16 = "RuneScape has been updated!";
					this.aString17 = "Please reload this page.";
				} else if (local74 == 7) {
					this.aString16 = "This world is full.";
					this.aString17 = "Please use a different world.";
				} else if (local74 == 8) {
					this.aString16 = "Unable to connect.";
					this.aString17 = "Login server offline.";
				} else if (local74 == 9) {
					this.aString16 = "Login limit exceeded.";
					this.aString17 = "Too many connections from your address.";
				} else if (local74 == 10) {
					this.aString16 = "Unable to connect.";
					this.aString17 = "Bad session id.";
				} else if (local74 == 11) {
					this.aString17 = "Login server rejected session.";
					this.aString17 = "Please try again.";
				} else if (local74 == 12) {
					this.aString16 = "You need a members account to login to this world.";
					this.aString17 = "Please subscribe, or use a different world.";
				} else if (local74 == 13) {
					this.aString16 = "Could not complete login.";
					this.aString17 = "Please try using a different world.";
				} else if (local74 == 14) {
					this.aString16 = "The server is being updated.";
					this.aString17 = "Please wait 1 minute and try again.";
				} else if (local74 == 15) {
					this.aBoolean71 = true;
					this.aClass1_Sub1_Sub3_4.anInt763 = 0;
					this.aClass1_Sub1_Sub3_3.anInt763 = 0;
					this.anInt315 = -1;
					this.anInt221 = -1;
					this.anInt222 = -1;
					this.anInt223 = -1;
					this.anInt314 = 0;
					this.anInt316 = 0;
					this.anInt413 = 0;
					this.anInt329 = 0;
					this.aBoolean64 = false;
					this.aLong17 = System.currentTimeMillis();
				} else if (local74 == 16) {
					this.aString16 = "Login attempts exceeded.";
					this.aString17 = "Please wait 1 minute and try again.";
				} else if (local74 == 17) {
					this.aString16 = "You are standing in a members-only area.";
					this.aString17 = "To play on this world move to a free area first";
				} else if (local74 == 20) {
					this.aString16 = "Invalid loginserver requested";
					this.aString17 = "Please try using a different world.";
				} else if (local74 == 21) {
					for (local389 = this.aClass8_1.method248(); local389 >= 0; local389--) {
						this.aString16 = "You have only just left another world";
						this.aString17 = "Your profile will be transferred in: " + local389 + " seconds";
						this.method175(true);
						try {
							Thread.sleep(1000L);
						} catch (@Pc(899) Exception local899) {
						}
					}
					this.method156(arg0, arg1, arg2);
				} else if (local74 != -1) {
					System.out.println("response:" + local74);
					this.aString16 = "Unexpected server response";
					this.aString17 = "Please try using a different world.";
				} else if (local76 != 0) {
					this.aString16 = "No response from server";
					this.aString17 = "Please try using a different world.";
				} else if (this.anInt249 < 2) {
					try {
						Thread.sleep(2000L);
					} catch (@Pc(921) Exception local921) {
					}
					this.anInt249++;
					this.method156(arg0, arg1, arg2);
				} else {
					this.aString16 = "No response from loginserver";
					this.aString17 = "Please wait 1 minute and try again.";
				}
			}
		} catch (@Pc(964) IOException local964) {
			this.aString16 = "";
			this.aString17 = "Error connecting to server.";
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!d;B)Z")
	private boolean method157(@OriginalArg(0) Class6 arg0) {
		try {
			@Pc(4) int local4 = arg0.anInt435;
			if (this.aByte15 != -5) {
				throw new NullPointerException();
			} else if (local4 >= 1 && local4 <= 200 || !(local4 < 701 || local4 > 900)) {
				if (local4 >= 801) {
					local4 -= 701;
				} else if (local4 >= 701) {
					local4 -= 601;
				} else if (local4 >= 101) {
					local4 -= 101;
				} else {
					local4--;
				}
				this.aStringArray6[this.anInt329] = "Remove @whi@" + this.aStringArray5[local4];
				this.anIntArray62[this.anInt329] = 513;
				this.anInt329++;
				this.aStringArray6[this.anInt329] = "Message @whi@" + this.aStringArray5[local4];
				this.anIntArray62[this.anInt329] = 902;
				this.anInt329++;
				return true;
			} else if (local4 >= 401 && local4 <= 500) {
				this.aStringArray6[this.anInt329] = "Remove @whi@" + arg0.aString18;
				this.anIntArray62[this.anInt329] = 884;
				this.anInt329++;
				return true;
			} else {
				return false;
			}
		} catch (@Pc(135) RuntimeException local135) {
			signlink.reporterror("7880, " + arg0 + ", " + -5 + ", " + local135.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "k", descriptor = "(Z)V")
	private void method158() {
		try {
			for (@Pc(12) Class1_Sub1_Sub1_Sub6 local12 = (Class1_Sub1_Sub1_Sub6) this.aClass29_2.method511(); local12 != null; local12 = (Class1_Sub1_Sub1_Sub6) this.aClass29_2.method513()) {
				if (local12.anInt542 != this.anInt355 || local12.aBoolean144) {
					local12.method673();
				} else if (anInt252 >= local12.anInt541) {
					local12.method301(this.anInt333);
					if (local12.aBoolean144) {
						local12.method673();
					} else {
						this.aClass37_1.method541(false, 0, local12.anInt544, local12.anInt543, -1, 60, local12.anInt542, local12, local12.anInt545);
					}
				}
			}
		} catch (@Pc(70) RuntimeException local70) {
			signlink.reporterror("3393, " + false + ", " + local70.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "n", descriptor = "(I)V")
	private void method159() {
		try {
			if (this.anInt420 != 9) {
				this.anInt315 = this.aClass1_Sub1_Sub3_3.method480();
			}
			if (aBoolean77 && this.anInt388 == 2 && Class4.anInt183 != this.anInt355) {
				this.aClass35_14.method524();
				this.aClass1_Sub1_Sub2_Sub4_2.method447("Loading - please wait.", 0, 257, 151);
				this.aClass1_Sub1_Sub2_Sub4_2.method447("Loading - please wait.", 16777215, 256, 150);
				this.aClass35_14.method525(4, 4, super.aGraphics2, this.anInt293);
				this.anInt388 = 1;
				this.aLong17 = System.currentTimeMillis();
			}
			if (this.anInt388 == 1) {
				@Pc(61) int local61 = this.method160();
				if (local61 != 0 && System.currentTimeMillis() - this.aLong17 > 360000L) {
					signlink.reporterror(this.aString6 + " glcfb " + this.aLong18 + "," + local61 + "," + aBoolean77 + "," + this.aClass45Array1[0] + "," + this.aClass44_Sub1_1.method646() + "," + this.anInt355 + "," + this.anInt414 + "," + this.anInt415);
					this.aLong17 = System.currentTimeMillis();
				}
			}
			if (this.anInt388 == 2 && this.anInt355 != this.anInt271) {
				this.anInt271 = this.anInt355;
				this.method134(this.anInt389, this.anInt355);
			}
		} catch (@Pc(143) RuntimeException local143) {
			signlink.reporterror("98295, " + 9 + ", " + local143.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "l", descriptor = "(Z)I")
	private int method160() {
		try {
			for (@Pc(3) int local3 = 0; local3 < this.aByteArrayArray1.length; local3++) {
				if (this.aByteArrayArray1[local3] == null && this.anIntArray70[local3] != -1) {
					return -1;
				}
				if (this.aByteArrayArray2[local3] == null && this.anIntArray71[local3] != -1) {
					return -2;
				}
			}
			@Pc(39) boolean local39 = true;
			for (@Pc(46) int local46 = 0; local46 < this.aByteArrayArray1.length; local46++) {
				@Pc(53) byte[] local53 = this.aByteArrayArray2[local46];
				if (local53 != null) {
					@Pc(67) int local67 = (this.anIntArray69[local46] >> 8) * 64 - this.anInt302;
					@Pc(79) int local79 = (this.anIntArray69[local46] & 0xFF) * 64 - this.anInt303;
					local39 &= Class4.method58(local79, local53, local67);
				}
			}
			if (!local39) {
				return -3;
			} else if (this.aBoolean56) {
				return -4;
			} else {
				this.anInt388 = 2;
				Class4.anInt183 = this.anInt355;
				this.method130((byte) 1);
				this.aClass1_Sub1_Sub3_4.method469(81);
				return 0;
			}
		} catch (@Pc(119) RuntimeException local119) {
			signlink.reporterror("81624, " + false + ", " + local119.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "h", descriptor = "(B)V")
	private void method161() {
		try {
			System.out.println("============");
			System.out.println("flame-cycle:" + this.anInt239);
			if (this.aClass44_Sub1_1 != null) {
				System.out.println("Od-cycle:" + this.aClass44_Sub1_1.anInt976);
			}
			System.out.println("loop-cycle:" + anInt252);
			System.out.println("draw-cycle:" + anInt253);
			System.out.println("ptype:" + this.anInt315);
			System.out.println("psize:" + this.anInt314);
			if (this.aClass8_1 != null) {
				this.aClass8_1.method252();
			}
			super.aBoolean44 = true;
		} catch (@Pc(82) RuntimeException local82) {
			signlink.reporterror("66602, " + 3 + ", " + local82.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(I)Ljava/awt/Component;")
	@Override
	protected Component method94() {
		try {
			if (signlink.mainapp == null) {
				return super.aFrame_Sub1_2 == null ? this : super.aFrame_Sub1_2;
			} else {
				return signlink.mainapp;
			}
		} catch (@Pc(22) RuntimeException local22) {
			signlink.reporterror("11869, " + 19330 + ", " + local22.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILclient!lb;ZILclient!ab;)V")
	private void method162(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub1_Sub3 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class1_Sub1_Sub1_Sub1_Sub1 arg3) {
		try {
			@Pc(14) int local14;
			if ((arg0 & 0x1) == 1) {
				local14 = arg1.method480();
				@Pc(17) byte[] local17 = new byte[local14];
				@Pc(23) Class1_Sub1_Sub3 local23 = new Class1_Sub1_Sub3(-49365, local17);
				arg1.method489(local14, local17, 36);
				this.aClass1_Sub1_Sub3Array1[arg2] = local23;
				arg3.method39(local23);
			}
			@Pc(61) int local61;
			@Pc(73) int local73;
			if ((arg0 & 0x2) == 2) {
				local14 = arg1.method482();
				if (local14 == 65535) {
					local14 = -1;
				}
				if (local14 == arg3.anInt1032) {
					arg3.anInt1036 = 0;
				}
				local61 = arg1.method480();
				if (local14 == arg3.anInt1032 && local14 != -1) {
					local73 = Class27.aClass27Array1[local14].anInt822;
					if (local73 == 1) {
						arg3.anInt1033 = 0;
						arg3.anInt1034 = 0;
						arg3.anInt1035 = local61;
						arg3.anInt1036 = 0;
					}
					if (local73 == 2) {
						arg3.anInt1036 = 0;
					}
				} else if (local14 == -1 || arg3.anInt1032 == -1 || Class27.aClass27Array1[local14].anInt816 >= Class27.aClass27Array1[arg3.anInt1032].anInt816) {
					arg3.anInt1032 = local14;
					arg3.anInt1033 = 0;
					arg3.anInt1034 = 0;
					arg3.anInt1035 = local61;
					arg3.anInt1036 = 0;
					arg3.anInt1055 = arg3.anInt1053;
				}
			}
			if ((arg0 & 0x4) == 4) {
				arg3.anInt1026 = arg1.method482();
				if (arg3.anInt1026 == 65535) {
					arg3.anInt1026 = -1;
				}
			}
			if ((arg0 & 0x8) == 8) {
				arg3.aString31 = arg1.method487();
				if (arg3.aString31.charAt(0) == '~') {
					arg3.aString31 = arg3.aString31.substring(1);
					this.method152(arg3.aString3, arg3.aString31, 2);
				} else if (arg3 == aClass1_Sub1_Sub1_Sub1_Sub1_1) {
					this.method152(arg3.aString3, arg3.aString31, 2);
				}
				arg3.anInt1021 = 0;
				arg3.anInt1022 = 0;
				arg3.anInt1020 = 150;
			}
			if ((arg0 & 0x10) == 16) {
				local14 = arg1.method480();
				local61 = arg1.method480();
				arg3.method681(anInt252, local14, local61);
				arg3.anInt1023 = anInt252 + 300;
				arg3.anInt1024 = arg1.method480();
				arg3.anInt1025 = arg1.method480();
			}
			if ((arg0 & 0x20) == 32) {
				arg3.anInt1027 = arg1.method482();
				arg3.anInt1028 = arg1.method482();
			}
			if ((arg0 & 0x40) == 64) {
				local14 = arg1.method482();
				local61 = arg1.method480();
				local73 = arg1.method480();
				@Pc(259) int local259 = arg1.anInt763;
				if (arg3.aString3 != null && arg3.aBoolean28) {
					@Pc(269) long local269 = Class48.method667(arg3.aString3);
					@Pc(271) boolean local271 = false;
					if (local61 <= 1) {
						for (@Pc(276) int local276 = 0; local276 < this.anInt384; local276++) {
							if (this.aLongArray4[local276] == local269) {
								local271 = true;
								break;
							}
						}
					}
					if (!local271 && this.anInt341 == 0) {
						try {
							@Pc(304) String local304 = Class49.method683(local73, arg1);
							@Pc(309) String local309 = Class42.method604(this.anInt270, local304);
							arg3.aString31 = local309;
							arg3.anInt1021 = local14 >> 8;
							arg3.anInt1022 = local14 & 0xFF;
							arg3.anInt1020 = 150;
							if (local61 == 2 || local61 == 3) {
								this.method152("@cr2@" + arg3.aString3, local309, 1);
							} else if (local61 == 1) {
								this.method152("@cr1@" + arg3.aString3, local309, 1);
							} else {
								this.method152(arg3.aString3, local309, 2);
							}
						} catch (@Pc(373) Exception local373) {
							signlink.reporterror("cde2");
						}
					}
				}
				arg1.anInt763 = local259 + local73;
			}
			if ((arg0 & 0x100) == 256) {
				arg3.anInt1037 = arg1.method482();
				local14 = arg1.method485();
				arg3.anInt1041 = local14 >> 16;
				arg3.anInt1040 = anInt252 + (local14 & 0xFFFF);
				arg3.anInt1038 = 0;
				arg3.anInt1039 = 0;
				if (arg3.anInt1040 > anInt252) {
					arg3.anInt1038 = -1;
				}
				if (arg3.anInt1037 == 65535) {
					arg3.anInt1037 = -1;
				}
			}
			if ((arg0 & 0x200) == 512) {
				arg3.anInt1042 = arg1.method480();
				arg3.anInt1044 = arg1.method480();
				arg3.anInt1043 = arg1.method480();
				arg3.anInt1045 = arg1.method480();
				arg3.anInt1046 = arg1.method482() + anInt252;
				arg3.anInt1047 = arg1.method482() + anInt252;
				arg3.anInt1048 = arg1.method480();
				arg3.method679();
			}
			if ((arg0 & 0x400) == 1024) {
				local14 = arg1.method480();
				local61 = arg1.method480();
				arg3.method681(anInt252, local14, local61);
				arg3.anInt1023 = anInt252 + 300;
				arg3.anInt1024 = arg1.method480();
				arg3.anInt1025 = arg1.method480();
			}
		} catch (@Pc(497) RuntimeException local497) {
			signlink.reporterror("27049, " + arg0 + ", " + arg1 + ", " + false + ", " + arg2 + ", " + arg3 + ", " + local497.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(ILclient!lb;I)V")
	private void method163(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub1_Sub3 arg1, @OriginalArg(2) int arg2) {
		try {
			this.anInt267 = 0;
			this.anInt233 = 0;
			this.method140(arg2, arg1);
			@Pc(16) boolean local16 = false;
			this.method181(arg2, arg1);
			this.method132(arg2, arg1);
			@Pc(35) int local35;
			for (@Pc(28) int local28 = 0; local28 < this.anInt267; local28++) {
				local35 = this.anIntArray54[local28];
				if (this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local35].anInt1049 != anInt252) {
					this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local35].aClass13_2 = null;
					this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local35] = null;
				}
			}
			if (arg1.anInt763 != arg2) {
				signlink.reporterror(this.aString6 + " size mismatch in getnpcpos - pos:" + arg1.anInt763 + " psize:" + arg2);
				throw new RuntimeException("eek");
			}
			for (local35 = 0; local35 < this.anInt266; local35++) {
				if (this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[this.anIntArray53[local35]] == null) {
					signlink.reporterror(this.aString6 + " null entry in npc list - pos:" + local35 + " size:" + this.anInt266);
					throw new RuntimeException("eek");
				}
			}
		} catch (@Pc(125) RuntimeException local125) {
			signlink.reporterror("4594, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local125.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "o", descriptor = "(I)V")
	private void method164() {
		try {
			if (this.anInt336 == 0) {
				this.aStringArray6[0] = "Cancel";
				this.anIntArray62[0] = 1106;
				this.anInt329 = 1;
				this.method223();
				this.anInt401 = 0;
				this.anInt314 += 0;
				if (super.anInt208 > 4 && super.anInt209 > 4 && super.anInt208 < 516 && super.anInt209 < 338) {
					if (this.anInt386 == -1) {
						this.method176();
					} else {
						this.method210(0, Class6.aClass6Array1[this.anInt386], 4, 4, super.anInt208, super.anInt209);
					}
				}
				if (this.anInt401 != this.anInt406) {
					this.anInt406 = this.anInt401;
				}
				this.anInt401 = 0;
				if (super.anInt208 > 553 && super.anInt209 > 205 && super.anInt208 < 743 && super.anInt209 < 466) {
					if (this.anInt383 != -1) {
						this.method210(0, Class6.aClass6Array1[this.anInt383], 205, 553, super.anInt208, super.anInt209);
					} else if (this.anIntArray74[this.anInt308] != -1) {
						this.method210(0, Class6.aClass6Array1[this.anIntArray74[this.anInt308]], 205, 553, super.anInt208, super.anInt209);
					}
				}
				if (this.anInt401 != this.anInt296) {
					this.aBoolean87 = true;
					this.anInt296 = this.anInt401;
				}
				this.anInt401 = 0;
				if (super.anInt208 > 17 && super.anInt209 > 357 && super.anInt208 < 496 && super.anInt209 < 453) {
					if (this.anInt235 != -1) {
						this.method210(0, Class6.aClass6Array1[this.anInt235], 357, 17, super.anInt208, super.anInt209);
					} else if (super.anInt209 < 434 && super.anInt208 < 426) {
						this.method169(super.anInt208 - 17, super.anInt209 - 357);
					}
				}
				if (this.anInt235 != -1 && this.anInt401 != this.anInt332) {
					this.aBoolean68 = true;
					this.anInt332 = this.anInt401;
				}
				@Pc(229) boolean local229 = false;
				while (!local229) {
					local229 = true;
					for (@Pc(235) int local235 = 0; local235 < this.anInt329 - 1; local235++) {
						if (this.anIntArray62[local235] < 1000 && this.anIntArray62[local235 + 1] > 1000) {
							@Pc(256) String local256 = this.aStringArray6[local235];
							this.aStringArray6[local235] = this.aStringArray6[local235 + 1];
							this.aStringArray6[local235 + 1] = local256;
							@Pc(278) int local278 = this.anIntArray62[local235];
							this.anIntArray62[local235] = this.anIntArray62[local235 + 1];
							this.anIntArray62[local235 + 1] = local278;
							@Pc(300) int local300 = this.anIntArray60[local235];
							this.anIntArray60[local235] = this.anIntArray60[local235 + 1];
							this.anIntArray60[local235 + 1] = local300;
							@Pc(322) int local322 = this.anIntArray61[local235];
							this.anIntArray61[local235] = this.anIntArray61[local235 + 1];
							this.anIntArray61[local235 + 1] = local322;
							@Pc(344) int local344 = this.anIntArray63[local235];
							this.anIntArray63[local235] = this.anIntArray63[local235 + 1];
							this.anIntArray63[local235 + 1] = local344;
							local229 = false;
						}
					}
				}
			}
		} catch (@Pc(374) RuntimeException local374) {
			signlink.reporterror("42433, " + 0 + ", " + local374.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IBLclient!y;)V")
	private void method165(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub1_Sub1_Sub1 arg1) {
		try {
			this.method166(arg1.anInt1009, arg0, arg1.anInt1010);
		} catch (@Pc(16) RuntimeException local16) {
			signlink.reporterror("40709, " + arg0 + ", " + 122 + ", " + arg1 + ", " + local16.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIII)V")
	private void method166(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		try {
			if (arg0 >= 128 && arg2 >= 128 && arg0 <= 13056 && arg2 <= 13056) {
				@Pc(28) int local28 = this.method200(arg0, this.anInt355, arg2) - arg1;
				@Pc(33) int local33 = arg0 - this.anInt274;
				@Pc(49) int local49 = local28 - this.anInt275;
				@Pc(54) int local54 = arg2 - this.anInt276;
				@Pc(59) int local59 = Class1_Sub1_Sub1_Sub5.anIntArray151[this.anInt277];
				@Pc(64) int local64 = Class1_Sub1_Sub1_Sub5.anIntArray152[this.anInt277];
				@Pc(69) int local69 = Class1_Sub1_Sub1_Sub5.anIntArray151[this.anInt278];
				@Pc(74) int local74 = Class1_Sub1_Sub1_Sub5.anIntArray152[this.anInt278];
				@Pc(84) int local84 = local54 * local69 + local33 * local74 >> 16;
				@Pc(94) int local94 = local54 * local74 - local33 * local69 >> 16;
				@Pc(96) int local96 = local84;
				@Pc(106) int local106 = local49 * local64 - local94 * local59 >> 16;
				@Pc(116) int local116 = local49 * local59 + local94 * local64 >> 16;
				if (local116 >= 50) {
					this.anInt225 = Class1_Sub1_Sub2_Sub1.anInt611 + (local96 << 9) / local116;
					this.anInt226 = Class1_Sub1_Sub2_Sub1.anInt612 + (local106 << 9) / local116;
				} else {
					this.anInt225 = -1;
					this.anInt226 = -1;
				}
			} else {
				this.anInt225 = -1;
				this.anInt226 = -1;
			}
		} catch (@Pc(148) RuntimeException local148) {
			signlink.reporterror("19504, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 7 + ", " + local148.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "p", descriptor = "(I)V")
	private void method167() {
		try {
			@Pc(16) int local16;
			if (this.anInt411 > 0) {
				for (local16 = 0; local16 < 256; local16++) {
					if (this.anInt411 > 768) {
						this.anIntArray87[local16] = this.method151(this.anIntArray88[local16], this.anIntArray89[local16], 1024 - this.anInt411, this.aByte7);
					} else if (this.anInt411 > 256) {
						this.anIntArray87[local16] = this.anIntArray89[local16];
					} else {
						this.anIntArray87[local16] = this.method151(this.anIntArray89[local16], this.anIntArray88[local16], 256 - this.anInt411, this.aByte7);
					}
				}
			} else if (this.anInt412 > 0) {
				for (local16 = 0; local16 < 256; local16++) {
					if (this.anInt412 > 768) {
						this.anIntArray87[local16] = this.method151(this.anIntArray88[local16], this.anIntArray90[local16], 1024 - this.anInt412, this.aByte7);
					} else if (this.anInt412 > 256) {
						this.anIntArray87[local16] = this.anIntArray90[local16];
					} else {
						this.anIntArray87[local16] = this.method151(this.anIntArray90[local16], this.anIntArray88[local16], 256 - this.anInt412, this.aByte7);
					}
				}
			} else {
				for (local16 = 0; local16 < 256; local16++) {
					this.anIntArray87[local16] = this.anIntArray88[local16];
				}
			}
			for (local16 = 0; local16 < 33920; local16++) {
				this.aClass35_19.anIntArray231[local16] = this.aClass1_Sub1_Sub2_Sub2_8.anIntArray208[local16];
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
				local210 = this.anIntArray39[local197] * (256 - local197) / 256;
				local214 = local210 + 22;
				if (local214 < 0) {
					local214 = 0;
				}
				local193 += local214;
				for (local224 = local214; local224 < 128; local224++) {
					local232 = this.anIntArray83[local193++];
					if (local232 == 0) {
						local195++;
					} else {
						local236 = local232;
						local240 = 256 - local232;
						local232 = this.anIntArray87[local232];
						local251 = this.aClass35_19.anIntArray231[local195];
						this.aClass35_19.anIntArray231[local195++] = ((local232 & 0xFF00FF) * local236 + (local251 & 0xFF00FF) * local240 & 0xFF00FF00) + ((local232 & 0xFF00) * local236 + (local251 & 0xFF00) * local240 & 0xFF0000) >> 8;
					}
				}
				local195 += local214;
			}
			this.aClass35_19.method525(0, 0, super.aGraphics2, this.anInt293);
			for (local210 = 0; local210 < 33920; local210++) {
				this.aClass35_20.anIntArray231[local210] = this.aClass1_Sub1_Sub2_Sub2_9.anIntArray208[local210];
			}
			local193 = 0;
			local195 = 1176;
			for (local214 = 1; local214 < 255; local214++) {
				local224 = this.anIntArray39[local214] * (256 - local214) / 256;
				local232 = 103 - local224;
				local195 += local224;
				for (local236 = 0; local236 < local232; local236++) {
					local240 = this.anIntArray83[local193++];
					if (local240 == 0) {
						local195++;
					} else {
						local251 = local240;
						@Pc(375) int local375 = 256 - local240;
						local240 = this.anIntArray87[local240];
						@Pc(386) int local386 = this.aClass35_20.anIntArray231[local195];
						this.aClass35_20.anIntArray231[local195++] = ((local240 & 0xFF00FF) * local251 + (local386 & 0xFF00FF) * local375 & 0xFF00FF00) + ((local240 & 0xFF00) * local251 + (local386 & 0xFF00) * local375 & 0xFF0000) >> 8;
					}
				}
				local193 += 128 - local232;
				local195 += 128 - local232 - local224;
			}
			this.aClass35_20.method525(637, 0, super.aGraphics2, this.anInt293);
		} catch (@Pc(459) RuntimeException local459) {
			signlink.reporterror("94669, " + -527 + ", " + local459.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "q", descriptor = "(I)Ljava/net/Socket;")
	public Socket method168(@OriginalArg(0) int arg0) throws IOException {
		return signlink.mainapp == null ? new Socket(InetAddress.getByName(this.getCodeBase().getHost()), arg0) : signlink.opensocket(arg0);
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(III)V")
	private void method169(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(9) int local9 = 0;
			for (@Pc(11) int local11 = 0; local11 < 100; local11++) {
				if (this.aStringArray2[local11] != null) {
					@Pc(23) int local23 = this.anIntArray37[local11];
					@Pc(34) int local34 = this.anInt354 + 70 + 4 - local9 * 14;
					if (local34 < -20) {
						break;
					}
					@Pc(42) String local42 = this.aStringArray1[local11];
					if (local42 != null && local42.startsWith("@cr1@")) {
						local42 = local42.substring(5);
					}
					if (local42 != null && local42.startsWith("@cr2@")) {
						local42 = local42.substring(5);
					}
					if (local23 == 0) {
						local9++;
					}
					if ((local23 == 1 || local23 == 2) && (local23 == 1 || this.anInt246 == 0 || this.anInt246 == 1 && this.method182(local42))) {
						if (arg1 > local34 - 14 && arg1 <= local34 && !local42.equals(aClass1_Sub1_Sub1_Sub1_Sub1_1.aString3)) {
							if (this.anInt331 >= 1) {
								this.aStringArray6[this.anInt329] = "Report abuse @whi@" + local42;
								this.anIntArray62[this.anInt329] = 524;
								this.anInt329++;
							}
							this.aStringArray6[this.anInt329] = "Add ignore @whi@" + local42;
							this.anIntArray62[this.anInt329] = 47;
							this.anInt329++;
							this.aStringArray6[this.anInt329] = "Add friend @whi@" + local42;
							this.anIntArray62[this.anInt329] = 605;
							this.anInt329++;
						}
						local9++;
					}
					if ((local23 == 3 || local23 == 7) && this.anInt250 == 0 && (local23 == 7 || this.anInt417 == 0 || this.anInt417 == 1 && this.method182(local42))) {
						if (arg1 > local34 - 14 && arg1 <= local34) {
							if (this.anInt331 >= 1) {
								this.aStringArray6[this.anInt329] = "Report abuse @whi@" + local42;
								this.anIntArray62[this.anInt329] = 524;
								this.anInt329++;
							}
							this.aStringArray6[this.anInt329] = "Add ignore @whi@" + local42;
							this.anIntArray62[this.anInt329] = 47;
							this.anInt329++;
							this.aStringArray6[this.anInt329] = "Add friend @whi@" + local42;
							this.anIntArray62[this.anInt329] = 605;
							this.anInt329++;
						}
						local9++;
					}
					if (local23 == 4 && (this.anInt376 == 0 || this.anInt376 == 1 && this.method182(local42))) {
						if (arg1 > local34 - 14 && arg1 <= local34) {
							this.aStringArray6[this.anInt329] = "Accept trade @whi@" + local42;
							this.anIntArray62[this.anInt329] = 507;
							this.anInt329++;
						}
						local9++;
					}
					if ((local23 == 5 || local23 == 6) && this.anInt250 == 0 && this.anInt417 < 2) {
						local9++;
					}
					if (local23 == 8 && (this.anInt376 == 0 || this.anInt376 == 1 && this.method182(local42))) {
						if (arg1 > local34 - 14 && arg1 <= local34) {
							this.aStringArray6[this.anInt329] = "Accept challenge @whi@" + local42;
							this.anIntArray62[this.anInt329] = 957;
							this.anInt329++;
						}
						local9++;
					}
				}
			}
		} catch (@Pc(407) RuntimeException local407) {
			signlink.reporterror("82044, " + arg0 + ", " + arg1 + ", " + -5661 + ", " + local407.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "m", descriptor = "(Z)V")
	private void method170() {
		try {
			if (this.aClass35_15 == null) {
				this.method154();
				super.aClass35_2 = null;
				this.aClass35_16 = null;
				this.aClass35_17 = null;
				this.aClass35_18 = null;
				this.aClass35_19 = null;
				this.aClass35_20 = null;
				this.aBoolean71 &= true;
				this.aClass35_21 = null;
				this.aClass35_22 = null;
				this.aClass35_23 = null;
				this.aClass35_24 = null;
				this.aClass35_15 = new Class35(500, 479, this.method94(), 96);
				this.aClass35_13 = new Class35(500, 172, this.method94(), 156);
				Class1_Sub1_Sub2.method437();
				this.aClass1_Sub1_Sub2_Sub3_7.method418(0, 0);
				this.aClass35_12 = new Class35(500, 190, this.method94(), 261);
				this.aClass35_14 = new Class35(500, 512, this.method94(), 334);
				Class1_Sub1_Sub2.method437();
				this.aClass35_25 = new Class35(500, 496, this.method94(), 50);
				this.aClass35_26 = new Class35(500, 269, this.method94(), 37);
				this.aClass35_27 = new Class35(500, 249, this.method94(), 45);
				this.aBoolean75 = true;
			}
		} catch (@Pc(134) RuntimeException local134) {
			signlink.reporterror("6672, " + true + ", " + local134.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "r", descriptor = "(I)V")
	private void method171() {
		try {
			try {
				if (this.aClass8_1 != null) {
					this.aClass8_1.method247();
				}
			} catch (@Pc(7) Exception local7) {
			}
			this.aClass8_1 = null;
			if (anInt421 == -5861) {
				this.aBoolean71 = false;
				this.anInt320 = 0;
				this.aString6 = "";
				this.aString7 = "";
				this.method148();
				this.aClass37_1.method530();
				for (@Pc(35) int local35 = 0; local35 < 4; local35++) {
					this.aClass19Array1[local35].method420();
				}
				System.gc();
				this.method230();
				this.anInt229 = -1;
				this.anInt260 = -1;
				this.anInt301 = 0;
			}
		} catch (@Pc(62) RuntimeException local62) {
			signlink.reporterror("17119, " + -5861 + ", " + local62.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "n", descriptor = "(Z)V")
	private void method172() {
		try {
			if (this.anInt250 != 0) {
				@Pc(6) Class1_Sub1_Sub2_Sub4 local6 = this.aClass1_Sub1_Sub2_Sub4_2;
				@Pc(13) int local13 = 0;
				if (this.anInt413 != 0) {
					local13 = 1;
				}
				for (@Pc(20) int local20 = 0; local20 < 100; local20++) {
					if (this.aStringArray2[local20] != null) {
						@Pc(32) int local32 = this.anIntArray37[local20];
						@Pc(37) String local37 = this.aStringArray1[local20];
						@Pc(39) byte local39 = 0;
						if (local37 != null && local37.startsWith("@cr1@")) {
							local37 = local37.substring(5);
							local39 = 1;
						}
						if (local37 != null && local37.startsWith("@cr2@")) {
							local37 = local37.substring(5);
							local39 = 2;
						}
						@Pc(90) int local90;
						if ((local32 == 3 || local32 == 7) && (local32 == 7 || this.anInt417 == 0 || this.anInt417 == 1 && this.method182(local37))) {
							local90 = 329 - local13 * 13;
							local6.method451(local90, "From", 0, 4);
							local6.method451(local90 - 1, "From", 65535, 4);
							@Pc(115) int local115 = local6.method449("From ") + 4;
							if (local39 == 1) {
								this.aClass1_Sub1_Sub2_Sub3Array2[0].method418(local115, local90 - 12);
								local115 += 14;
							}
							if (local39 == 2) {
								this.aClass1_Sub1_Sub2_Sub3Array2[1].method418(local115, local90 - 12);
								local115 += 14;
							}
							local6.method451(local90, local37 + ": " + this.aStringArray2[local20], 0, local115);
							local6.method451(local90 - 1, local37 + ": " + this.aStringArray2[local20], 65535, local115);
							local13++;
							if (local13 >= 5) {
								return;
							}
						}
						if (local32 == 5 && this.anInt417 < 2) {
							local90 = 329 - local13 * 13;
							local6.method451(local90, this.aStringArray2[local20], 0, 4);
							local6.method451(local90 - 1, this.aStringArray2[local20], 65535, 4);
							local13++;
							if (local13 >= 5) {
								return;
							}
						}
						if (local32 == 6 && this.anInt417 < 2) {
							local90 = 329 - local13 * 13;
							local6.method451(local90, "To " + local37 + ": " + this.aStringArray2[local20], 0, 4);
							local6.method451(local90 - 1, "To " + local37 + ": " + this.aStringArray2[local20], 65535, 4);
							local13++;
							if (local13 >= 5) {
								return;
							}
						}
					}
				}
			}
		} catch (@Pc(294) RuntimeException local294) {
			signlink.reporterror("76176, " + false + ", " + local294.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "s", descriptor = "(I)V")
	private void method174() {
		try {
			if (this.anInt329 >= 2 || this.anInt297 != 0 || this.anInt326 != 0) {
				@Pc(31) String local31;
				if (this.anInt297 == 1 && this.anInt329 < 2) {
					local31 = "Use " + this.aString12 + " with...";
				} else if (this.anInt326 == 1 && this.anInt329 < 2) {
					local31 = this.aString13 + "...";
				} else {
					local31 = this.aStringArray6[this.anInt329 - 1];
				}
				if (this.anInt329 > 2) {
					local31 = local31 + "@whi@ / " + (this.anInt329 - 2) + " more options";
				}
				this.aClass1_Sub1_Sub2_Sub4_3.method456(local31, anInt252 / 1000, 15, 16777215, 4);
			}
		} catch (@Pc(102) RuntimeException local102) {
			signlink.reporterror("59864, " + -62 + ", " + local102.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ZZ)V")
	private void method175(@OriginalArg(1) boolean arg0) {
		try {
			this.method150();
			this.aClass35_18.method524();
			this.aClass1_Sub1_Sub2_Sub3_19.method418(0, 0);
			@Pc(52) byte local52;
			@Pc(64) int local64;
			if (this.anInt320 == 0) {
				this.aClass1_Sub1_Sub2_Sub4_1.method448(180, (byte) 4, 180, this.aClass44_Sub1_1.aString30, 7711145, true);
				local52 = 80;
				this.aClass1_Sub1_Sub2_Sub4_3.method448(80, (byte) 4, 180, "Welcome to RuneScape", 16776960, true);
				local64 = local52 + 30;
				this.aClass1_Sub1_Sub2_Sub3_20.method418(27, 100);
				this.aClass1_Sub1_Sub2_Sub4_3.method448(125, (byte) 4, 100, "New User", 16777215, true);
				this.aClass1_Sub1_Sub2_Sub3_20.method418(187, 100);
				this.aClass1_Sub1_Sub2_Sub4_3.method448(125, (byte) 4, 260, "Existing User", 16777215, true);
			}
			if (this.anInt320 == 2) {
				local52 = 60;
				if (this.aString16.length() > 0) {
					this.aClass1_Sub1_Sub2_Sub4_3.method448(45, (byte) 4, 180, this.aString16, 16776960, true);
					this.aClass1_Sub1_Sub2_Sub4_3.method448(60, (byte) 4, 180, this.aString17, 16776960, true);
					local64 = local52 + 30;
				} else {
					this.aClass1_Sub1_Sub2_Sub4_3.method448(53, (byte) 4, 180, this.aString17, 16776960, true);
					local64 = local52 + 30;
				}
				this.aClass1_Sub1_Sub2_Sub4_3.method455("Username: " + this.aString6 + (this.anInt404 == 0 & anInt252 % 40 < 20 ? "@yel@|" : ""), 16777215, 90, true, 90);
				local64 += 15;
				this.aClass1_Sub1_Sub2_Sub4_3.method455("Password: " + Class48.method672(this.aString7) + (this.anInt404 == 1 & anInt252 % 40 < 20 ? "@yel@|" : ""), 16777215, 105, true, 92);
				local64 += 15;
				if (!arg0) {
					this.aClass1_Sub1_Sub2_Sub3_20.method418(27, 130);
					this.aClass1_Sub1_Sub2_Sub4_3.method448(155, (byte) 4, 100, "Login", 16777215, true);
					this.aClass1_Sub1_Sub2_Sub3_20.method418(187, 130);
					this.aClass1_Sub1_Sub2_Sub4_3.method448(155, (byte) 4, 260, "Cancel", 16777215, true);
				}
			}
			if (this.anInt320 == 3) {
				this.aClass1_Sub1_Sub2_Sub4_3.method448(40, (byte) 4, 180, "Create a free account", 16776960, true);
				local52 = 65;
				this.aClass1_Sub1_Sub2_Sub4_3.method448(65, (byte) 4, 180, "To create a new account you need to", 16777215, true);
				local64 = local52 + 15;
				this.aClass1_Sub1_Sub2_Sub4_3.method448(80, (byte) 4, 180, "go back to the main RuneScape webpage", 16777215, true);
				local64 += 15;
				this.aClass1_Sub1_Sub2_Sub4_3.method448(95, (byte) 4, 180, "and choose the red 'create account'", 16777215, true);
				local64 += 15;
				this.aClass1_Sub1_Sub2_Sub4_3.method448(110, (byte) 4, 180, "button at the top right of that page.", 16777215, true);
				local64 += 15;
				this.aClass1_Sub1_Sub2_Sub3_20.method418(107, 130);
				this.aClass1_Sub1_Sub2_Sub4_3.method448(155, (byte) 4, 180, "Cancel", 16777215, true);
			}
			this.aClass35_18.method525(202, 171, super.aGraphics2, this.anInt293);
			if (this.aBoolean75) {
				this.aBoolean75 = false;
				this.aClass35_16.method525(128, 0, super.aGraphics2, this.anInt293);
				this.aClass35_17.method525(202, 371, super.aGraphics2, this.anInt293);
				this.aClass35_21.method525(0, 265, super.aGraphics2, this.anInt293);
				this.aClass35_22.method525(562, 265, super.aGraphics2, this.anInt293);
				this.aClass35_23.method525(128, 171, super.aGraphics2, this.anInt293);
				this.aClass35_24.method525(562, 171, super.aGraphics2, this.anInt293);
			}
		} catch (@Pc(504) RuntimeException local504) {
			signlink.reporterror("11811, " + false + ", " + arg0 + ", " + local504.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "i", descriptor = "(B)V")
	private void method176() {
		try {
			if (this.anInt297 == 0 && this.anInt326 == 0) {
				this.aStringArray6[this.anInt329] = "Walk here";
				this.anIntArray62[this.anInt329] = 718;
				this.anIntArray60[this.anInt329] = super.anInt208;
				this.anIntArray61[this.anInt329] = super.anInt209;
				this.anInt329++;
			}
			@Pc(41) int local41 = -1;
			for (@Pc(43) int local43 = 0; local43 < Class1_Sub1_Sub1_Sub5.anInt513; local43++) {
				@Pc(49) int local49 = Class1_Sub1_Sub1_Sub5.anIntArray150[local43];
				@Pc(53) int local53 = local49 & 0x7F;
				@Pc(59) int local59 = local49 >> 7 & 0x7F;
				@Pc(65) int local65 = local49 >> 29 & 0x3;
				@Pc(71) int local71 = local49 >> 14 & 0x7FFF;
				if (local49 != local41) {
					local41 = local49;
					@Pc(218) int local218;
					if (local65 == 2 && this.aClass37_1.method560(this.anInt355, local53, local59, local49) >= 0) {
						@Pc(91) Class9 local91 = Class9.method288(local71);
						if (local91.anIntArray160 != null) {
							local91 = local91.method296();
						}
						if (local91 == null) {
							continue;
						}
						if (this.anInt297 == 1) {
							this.aStringArray6[this.anInt329] = "Use " + this.aString12 + " with @cya@" + local91.aString23;
							this.anIntArray62[this.anInt329] = 810;
							this.anIntArray63[this.anInt329] = local49;
							this.anIntArray60[this.anInt329] = local53;
							this.anIntArray61[this.anInt329] = local59;
							this.anInt329++;
						} else if (this.anInt326 != 1) {
							if (local91.aStringArray8 != null) {
								for (local218 = 4; local218 >= 0; local218--) {
									if (local91.aStringArray8[local218] != null) {
										this.aStringArray6[this.anInt329] = local91.aStringArray8[local218] + " @cya@" + local91.aString23;
										if (local218 == 0) {
											this.anIntArray62[this.anInt329] = 625;
										}
										if (local218 == 1) {
											this.anIntArray62[this.anInt329] = 721;
										}
										if (local218 == 2) {
											this.anIntArray62[this.anInt329] = 743;
										}
										if (local218 == 3) {
											this.anIntArray62[this.anInt329] = 357;
										}
										if (local218 == 4) {
											this.anIntArray62[this.anInt329] = 1071;
										}
										this.anIntArray63[this.anInt329] = local49;
										this.anIntArray60[this.anInt329] = local53;
										this.anIntArray61[this.anInt329] = local59;
										this.anInt329++;
									}
								}
							}
							this.aStringArray6[this.anInt329] = "Examine @cya@" + local91.aString23;
							this.anIntArray62[this.anInt329] = 1381;
							this.anIntArray63[this.anInt329] = local91.anInt518 << 14;
							this.anIntArray60[this.anInt329] = local53;
							this.anIntArray61[this.anInt329] = local59;
							this.anInt329++;
						} else if ((this.anInt328 & 0x4) == 4) {
							this.aStringArray6[this.anInt329] = this.aString13 + " @cya@" + local91.aString23;
							this.anIntArray62[this.anInt329] = 899;
							this.anIntArray63[this.anInt329] = local49;
							this.anIntArray60[this.anInt329] = local53;
							this.anIntArray61[this.anInt329] = local59;
							this.anInt329++;
						}
					}
					@Pc(398) Class1_Sub1_Sub1_Sub1_Sub2 local398;
					@Pc(446) Class1_Sub1_Sub1_Sub1_Sub1 local446;
					@Pc(436) int local436;
					if (local65 == 1) {
						@Pc(369) Class1_Sub1_Sub1_Sub1_Sub2 local369 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local71];
						if (local369.aClass13_2.aByte26 == 1 && (local369.anInt1009 & 0x7F) == 64 && (local369.anInt1010 & 0x7F) == 64) {
							for (local218 = 0; local218 < this.anInt266; local218++) {
								local398 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[this.anIntArray53[local218]];
								if (local398 != null && local398 != local369 && local398.aClass13_2.aByte26 == 1 && local398.anInt1009 == local369.anInt1009 && local398.anInt1010 == local369.anInt1010) {
									this.method145(this.anIntArray53[local218], local59, local398.aClass13_2, local53);
								}
							}
							for (local436 = 0; local436 < this.anInt232; local436++) {
								local446 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[this.anIntArray34[local436]];
								if (local446 != null && local446.anInt1009 == local369.anInt1009 && local446.anInt1010 == local369.anInt1010) {
									this.method101(local446, this.anIntArray34[local436], local59, local53);
								}
							}
						}
						this.method145(local71, local59, local369.aClass13_2, local53);
					}
					if (local65 == 0) {
						@Pc(488) Class1_Sub1_Sub1_Sub1_Sub1 local488 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local71];
						if ((local488.anInt1009 & 0x7F) == 64 && (local488.anInt1010 & 0x7F) == 64) {
							for (local218 = 0; local218 < this.anInt266; local218++) {
								local398 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[this.anIntArray53[local218]];
								if (local398 != null && local398.aClass13_2.aByte26 == 1 && local398.anInt1009 == local488.anInt1009 && local398.anInt1010 == local488.anInt1010) {
									this.method145(this.anIntArray53[local218], local59, local398.aClass13_2, local53);
								}
							}
							for (local436 = 0; local436 < this.anInt232; local436++) {
								local446 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[this.anIntArray34[local436]];
								if (local446 != null && local446 != local488 && local446.anInt1009 == local488.anInt1009 && local446.anInt1010 == local488.anInt1010) {
									this.method101(local446, this.anIntArray34[local436], local59, local53);
								}
							}
						}
						this.method101(local488, local71, local59, local53);
					}
					if (local65 == 3) {
						@Pc(607) Class29 local607 = this.aClass29ArrayArrayArray1[this.anInt355][local53][local59];
						if (local607 != null) {
							for (@Pc(614) Class1_Sub1_Sub1_Sub3 local614 = (Class1_Sub1_Sub1_Sub3) local607.method512(); local614 != null; local614 = (Class1_Sub1_Sub1_Sub3) local607.method514(this.aByte13)) {
								@Pc(620) Class15 local620 = Class15.method361(local614.anInt191);
								if (this.anInt297 == 1) {
									this.aStringArray6[this.anInt329] = "Use " + this.aString12 + " with @lre@" + local620.aString25;
									this.anIntArray62[this.anInt329] = 111;
									this.anIntArray63[this.anInt329] = local614.anInt191;
									this.anIntArray60[this.anInt329] = local53;
									this.anIntArray61[this.anInt329] = local59;
									this.anInt329++;
								} else if (this.anInt326 != 1) {
									for (@Pc(737) int local737 = 4; local737 >= 0; local737--) {
										if (local620.aStringArray10 != null && local620.aStringArray10[local737] != null) {
											this.aStringArray6[this.anInt329] = local620.aStringArray10[local737] + " @lre@" + local620.aString25;
											if (local737 == 0) {
												this.anIntArray62[this.anInt329] = 139;
											}
											if (local737 == 1) {
												this.anIntArray62[this.anInt329] = 778;
											}
											if (local737 == 2) {
												this.anIntArray62[this.anInt329] = 617;
											}
											if (local737 == 3) {
												this.anIntArray62[this.anInt329] = 224;
											}
											if (local737 == 4) {
												this.anIntArray62[this.anInt329] = 662;
											}
											this.anIntArray63[this.anInt329] = local614.anInt191;
											this.anIntArray60[this.anInt329] = local53;
											this.anIntArray61[this.anInt329] = local59;
											this.anInt329++;
										} else if (local737 == 2) {
											this.aStringArray6[this.anInt329] = "Take @lre@" + local620.aString25;
											this.anIntArray62[this.anInt329] = 617;
											this.anIntArray63[this.anInt329] = local614.anInt191;
											this.anIntArray60[this.anInt329] = local53;
											this.anIntArray61[this.anInt329] = local59;
											this.anInt329++;
										}
									}
									this.aStringArray6[this.anInt329] = "Examine @lre@" + local620.aString25;
									this.anIntArray62[this.anInt329] = 1152;
									this.anIntArray63[this.anInt329] = local614.anInt191;
									this.anIntArray60[this.anInt329] = local53;
									this.anIntArray61[this.anInt329] = local59;
									this.anInt329++;
								} else if ((this.anInt328 & 0x1) == 1) {
									this.aStringArray6[this.anInt329] = this.aString13 + " @lre@" + local620.aString25;
									this.anIntArray62[this.anInt329] = 370;
									this.anIntArray63[this.anInt329] = local614.anInt191;
									this.anIntArray60[this.anInt329] = local53;
									this.anIntArray61[this.anInt329] = local59;
									this.anInt329++;
								}
							}
						}
					}
				}
			}
		} catch (@Pc(952) RuntimeException local952) {
			signlink.reporterror("54946, " + 6 + ", " + local952.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IJ)V")
	private void method177(@OriginalArg(1) long arg0) {
		try {
			if (arg0 != 0L) {
				if (this.anInt351 >= 100 && this.anInt353 != 1) {
					this.method152("", "Your friendlist is full. Max of 100 for free users, and 200 for members", 0);
				} else if (this.anInt351 >= 200) {
					this.method152("", "Your friendlist is full. Max of 100 for free users, and 200 for members", 0);
				} else {
					@Pc(39) String local39 = Class48.method671(Class48.method668(arg0, this.anInt219));
					for (@Pc(45) int local45 = 0; local45 < this.anInt351; local45++) {
						if (this.aLongArray3[local45] == arg0) {
							this.method152("", local39 + " is already on your friend list", 0);
							return;
						}
					}
					for (@Pc(75) int local75 = 0; local75 < this.anInt384; local75++) {
						if (this.aLongArray4[local75] == arg0) {
							this.method152("", "Please remove " + local39 + " from your ignore list first", 0);
							return;
						}
					}
					if (!local39.equals(aClass1_Sub1_Sub1_Sub1_Sub1_1.aString3)) {
						this.aStringArray5[this.anInt351] = local39;
						this.aLongArray3[this.anInt351] = arg0;
						this.anIntArray59[this.anInt351] = 0;
						this.anInt351++;
						this.aBoolean87 = true;
						this.aClass1_Sub1_Sub3_4.method469(221);
						this.aClass1_Sub1_Sub3_4.method476(arg0, 359);
					}
				}
			}
		} catch (@Pc(149) RuntimeException local149) {
			signlink.reporterror("86194, " + 7 + ", " + arg0 + ", " + local149.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "g", descriptor = "(II)V")
	private void method178(@OriginalArg(0) int arg0) {
		try {
			@Pc(3) Class6 local3 = Class6.aClass6Array1[arg0];
			for (@Pc(5) int local5 = 0; local5 < local3.anIntArray98.length && local3.anIntArray98[local5] != -1; local5++) {
				@Pc(20) Class6 local20 = Class6.aClass6Array1[local3.anIntArray98[local5]];
				if (local20.anInt433 == 1) {
					this.method178(local20.anInt431);
				}
				local20.anInt429 = 0;
				local20.anInt430 = 0;
			}
		} catch (@Pc(48) RuntimeException local48) {
			signlink.reporterror("64590, " + arg0 + ", " + 0 + ", " + local48.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILclient!jb;)V")
	private void method179(@OriginalArg(1) Class1_Sub1_Sub2_Sub3 arg0) {
		try {
			for (@Pc(5) int local5 = 0; local5 < this.anIntArray42.length; local5++) {
				this.anIntArray42[local5] = 0;
			}
			@Pc(30) int local30;
			for (@Pc(20) int local20 = 0; local20 < 5000; local20++) {
				local30 = (int) (Math.random() * 128.0D * (double) 256);
				this.anIntArray42[local30] = (int) (Math.random() * 256.0D);
			}
			@Pc(58) int local58;
			@Pc(62) int local62;
			@Pc(70) int local70;
			for (local30 = 0; local30 < 20; local30++) {
				for (local58 = 1; local58 < 255; local58++) {
					for (local62 = 1; local62 < 127; local62++) {
						local70 = local62 + (local58 << 7);
						this.anIntArray43[local70] = (this.anIntArray42[local70 - 1] + this.anIntArray42[local70 + 1] + this.anIntArray42[local70 - 128] + this.anIntArray42[local70 + 128]) / 4;
					}
				}
				@Pc(116) int[] local116 = this.anIntArray42;
				this.anIntArray42 = this.anIntArray43;
				this.anIntArray43 = local116;
			}
			if (arg0 != null) {
				local58 = 0;
				for (local62 = 0; local62 < arg0.anInt696; local62++) {
					for (local70 = 0; local70 < arg0.anInt695; local70++) {
						if (arg0.aByteArray7[local58++] != 0) {
							@Pc(152) int local152 = local70 + arg0.anInt697 + 16;
							@Pc(159) int local159 = local62 + arg0.anInt698 + 16;
							@Pc(165) int local165 = local152 + (local159 << 7);
							this.anIntArray42[local165] = 0;
						}
					}
				}
			}
		} catch (@Pc(182) RuntimeException local182) {
			signlink.reporterror("17669, " + 23272 + ", " + arg0 + ", " + local182.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "t", descriptor = "(I)V")
	private void method180() {
		try {
			this.aBoolean49 = true;
			try {
				@Pc(6) long local6 = System.currentTimeMillis();
				@Pc(8) int local8 = 0;
				@Pc(10) int local10 = 20;
				while (this.aBoolean55) {
					this.anInt239++;
					this.method186();
					this.method186();
					this.method167();
					local8++;
					if (local8 > 10) {
						@Pc(33) long local33 = System.currentTimeMillis();
						@Pc(42) int local42 = (int) (local33 - local6) / 10 - local10;
						local10 = 40 - local42;
						if (local10 < 5) {
							local10 = 5;
						}
						local8 = 0;
						local6 = local33;
					}
					try {
						Thread.sleep((long) local10);
					} catch (@Pc(60) Exception local60) {
					}
				}
			} catch (@Pc(66) Exception local66) {
			}
			this.aBoolean49 = false;
		} catch (@Pc(83) RuntimeException local83) {
			signlink.reporterror("35501, " + -974 + ", " + local83.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IILclient!lb;)V")
	private void method181(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub1_Sub3 arg1) {
		try {
			while (true) {
				if (arg1.anInt764 + 21 < arg0 * 8) {
					@Pc(16) int local16 = arg1.method491(14, this.aByte9);
					if (local16 != 16383) {
						if (this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local16] == null) {
							this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local16] = new Class1_Sub1_Sub1_Sub1_Sub2();
						}
						@Pc(36) Class1_Sub1_Sub1_Sub1_Sub2 local36 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local16];
						this.anIntArray53[this.anInt266++] = local16;
						local36.anInt1049 = anInt252;
						local36.aClass13_2 = Class13.method323(arg1.method491(12, this.aByte9));
						local36.anInt1012 = local36.aClass13_2.aByte26;
						local36.anInt1052 = local36.aClass13_2.anInt584;
						local36.anInt1015 = local36.aClass13_2.anInt571;
						local36.anInt1016 = local36.aClass13_2.anInt572;
						local36.anInt1017 = local36.aClass13_2.anInt573;
						local36.anInt1018 = local36.aClass13_2.anInt574;
						local36.anInt1013 = local36.aClass13_2.anInt570;
						@Pc(99) int local99 = arg1.method491(5, this.aByte9);
						if (local99 > 15) {
							local99 -= 32;
						}
						@Pc(109) int local109 = arg1.method491(5, this.aByte9);
						if (local109 > 15) {
							local109 -= 32;
						}
						@Pc(119) int local119 = arg1.method491(1, this.aByte9);
						local36.method677(local119 == 1, aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray272[0] + local99, aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray273[0] + local109);
						@Pc(146) int local146 = arg1.method491(1, this.aByte9);
						if (local146 == 1) {
							this.anIntArray35[this.anInt233++] = local16;
						}
						continue;
					}
				}
				arg1.method492();
				return;
			}
		} catch (@Pc(167) RuntimeException local167) {
			signlink.reporterror("27440, " + 0 + ", " + arg0 + ", " + arg1 + ", " + local167.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ZLjava/lang/String;)Z")
	private boolean method182(@OriginalArg(1) String arg0) {
		try {
			if (arg0 == null) {
				return false;
			}
			for (@Pc(5) int local5 = 0; local5 < this.anInt351; local5++) {
				if (arg0.equalsIgnoreCase(this.aStringArray5[local5])) {
					return true;
				}
			}
			return arg0.equalsIgnoreCase(aClass1_Sub1_Sub1_Sub1_Sub1_1.aString3);
		} catch (@Pc(38) RuntimeException local38) {
			signlink.reporterror("80532, " + false + ", " + arg0 + ", " + local38.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIILclient!d;)V")
	private void method183(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class6 arg3) {
		try {
			if (arg3.anInt433 == 0 && arg3.anIntArray98 != null && (!arg3.aBoolean99 || this.anInt406 == arg3.anInt431 || this.anInt296 == arg3.anInt431 || this.anInt332 == arg3.anInt431)) {
				@Pc(29) int local29 = Class1_Sub1_Sub2.anInt723;
				@Pc(31) int local31 = Class1_Sub1_Sub2.anInt721;
				@Pc(33) int local33 = Class1_Sub1_Sub2.anInt724;
				@Pc(35) int local35 = Class1_Sub1_Sub2.anInt722;
				Class1_Sub1_Sub2.method436(arg0 + arg3.anInt437, arg0, arg2 + arg3.anInt436, arg2);
				@Pc(51) int local51 = arg3.anIntArray98.length;
				for (@Pc(53) int local53 = 0; local53 < local51; local53++) {
					@Pc(62) int local62 = arg3.anIntArray99[local53] + arg2;
					@Pc(71) int local71 = arg3.anIntArray100[local53] + arg0 - arg1;
					@Pc(78) Class6 local78 = Class6.aClass6Array1[arg3.anIntArray98[local53]];
					@Pc(83) int local83 = local62 + local78.anInt438;
					@Pc(88) int local88 = local71 + local78.anInt439;
					if (local78.anInt435 > 0) {
						this.method143(local78);
					}
					if (local78.anInt433 == 0) {
						if (local78.anInt442 > local78.anInt441 - local78.anInt437) {
							local78.anInt442 = local78.anInt441 - local78.anInt437;
						}
						if (local78.anInt442 < 0) {
							local78.anInt442 = 0;
						}
						this.method183(local88, local78.anInt442, local83, local78);
						if (local78.anInt441 > local78.anInt437) {
							this.method121(local78.anInt441, local78.anInt437, local83 + local78.anInt436, local88, local78.anInt442);
						}
					} else if (local78.anInt433 != 1) {
						@Pc(160) int local160;
						@Pc(164) int local164;
						@Pc(175) int local175;
						@Pc(210) int local210;
						@Pc(217) int local217;
						@Pc(158) int local158;
						@Pc(208) int local208;
						if (local78.anInt433 == 2) {
							local158 = 0;
							for (local160 = 0; local160 < local78.anInt437; local160++) {
								for (local164 = 0; local164 < local78.anInt436; local164++) {
									local175 = local83 + local164 * (local78.anInt444 + 32);
									@Pc(184) int local184 = local88 + local160 * (local78.anInt445 + 32);
									if (local158 < 20) {
										local175 += local78.anIntArray101[local158];
										local184 += local78.anIntArray102[local158];
									}
									if (local78.anIntArray94[local158] > 0) {
										local208 = 0;
										local210 = 0;
										local217 = local78.anIntArray94[local158] - 1;
										if (local175 > Class1_Sub1_Sub2.anInt723 - 32 && local175 < Class1_Sub1_Sub2.anInt724 && local184 > Class1_Sub1_Sub2.anInt721 - 32 && local184 < Class1_Sub1_Sub2.anInt722 || this.anInt336 != 0 && this.anInt335 == local158) {
											@Pc(242) int local242 = 0;
											if (this.anInt297 == 1 && this.anInt298 == local158 && this.anInt299 == local78.anInt431) {
												local242 = 16777215;
											}
											@Pc(266) Class1_Sub1_Sub2_Sub2 local266 = Class15.method367(local78.anIntArray95[local158], local217, local242);
											if (local266 != null) {
												@Pc(345) int local345;
												if (this.anInt336 != 0 && this.anInt335 == local158 && this.anInt334 == local78.anInt431) {
													local208 = super.anInt208 - this.anInt337;
													local210 = super.anInt209 - this.anInt338;
													if (local208 < 5 && local208 > -5) {
														local208 = 0;
													}
													if (local210 < 5 && local210 > -5) {
														local210 = 0;
													}
													if (this.anInt382 < 5) {
														local208 = 0;
														local210 = 0;
													}
													local266.method393(local175 + local208, local184 + local210);
													if (local184 + local210 < Class1_Sub1_Sub2.anInt721 && arg3.anInt442 > 0) {
														local345 = this.anInt333 * (Class1_Sub1_Sub2.anInt721 - local184 - local210) / 3;
														if (local345 > this.anInt333 * 10) {
															local345 = this.anInt333 * 10;
														}
														if (local345 > arg3.anInt442) {
															local345 = arg3.anInt442;
														}
														arg3.anInt442 -= local345;
														this.anInt338 += local345;
													}
													if (local184 + local210 + 32 > Class1_Sub1_Sub2.anInt722 && arg3.anInt442 < arg3.anInt441 - arg3.anInt437) {
														local345 = this.anInt333 * (local184 + local210 + 32 - Class1_Sub1_Sub2.anInt722) / 3;
														if (local345 > this.anInt333 * 10) {
															local345 = this.anInt333 * 10;
														}
														if (local345 > arg3.anInt441 - arg3.anInt437 - arg3.anInt442) {
															local345 = arg3.anInt441 - arg3.anInt437 - arg3.anInt442;
														}
														arg3.anInt442 += local345;
														this.anInt338 -= local345;
													}
												} else if (this.anInt313 != 0 && this.anInt312 == local158 && this.anInt311 == local78.anInt431) {
													local266.method393(local175, local184);
												} else {
													local266.method391(local175, local184);
												}
												if (local266.anInt671 == 33 || local78.anIntArray95[local158] != 1) {
													local345 = local78.anIntArray95[local158];
													this.aClass1_Sub1_Sub2_Sub4_1.method451(local184 + local210 + 10, method227(local345, this.aByte2), 0, local175 + local208 + 1);
													this.aClass1_Sub1_Sub2_Sub4_1.method451(local184 + local210 + 9, method227(local345, this.aByte2), 16776960, local175 + local208);
												}
											}
										}
									} else if (local78.aClass1_Sub1_Sub2_Sub2Array8 != null && local158 < 20) {
										@Pc(536) Class1_Sub1_Sub2_Sub2 local536 = local78.aClass1_Sub1_Sub2_Sub2Array8[local158];
										if (local536 != null) {
											local536.method391(local175, local184);
										}
									}
									local158++;
								}
							}
						} else if (local78.anInt433 == 3) {
							@Pc(562) boolean local562 = false;
							if (this.anInt332 == local78.anInt431 || this.anInt296 == local78.anInt431 || this.anInt406 == local78.anInt431) {
								local562 = true;
							}
							if (this.method147(local78)) {
								local158 = local78.anInt447;
								if (local562 && local78.anInt449 != 0) {
									local158 = local78.anInt449;
								}
							} else {
								local158 = local78.anInt446;
								if (local562 && local78.anInt448 != 0) {
									local158 = local78.anInt448;
								}
							}
							if (local78.aByte20 == 0) {
								if (local78.aBoolean105) {
									Class1_Sub1_Sub2.method439(local158, local88, local78.anInt437, local83, local78.anInt436);
								} else {
									Class1_Sub1_Sub2.method440(local158, local78.anInt436, local78.anInt437, local83, local88);
								}
							} else if (local78.aBoolean105) {
								Class1_Sub1_Sub2.method438(local78.anInt436, local88, 256 - (local78.aByte20 & 0xFF), local158, local83, local78.anInt437);
							} else {
								Class1_Sub1_Sub2.method441(256 - (local78.aByte20 & 0xFF), this.anInt390, local78.anInt437, local78.anInt436, local158, local83, local88);
							}
						} else {
							@Pc(681) Class1_Sub1_Sub2_Sub4 local681;
							if (local78.anInt433 == 4) {
								local681 = local78.aClass1_Sub1_Sub2_Sub4_5;
								@Pc(684) String local684 = local78.aString18;
								@Pc(686) boolean local686 = false;
								if (this.anInt332 == local78.anInt431 || this.anInt296 == local78.anInt431 || this.anInt406 == local78.anInt431) {
									local686 = true;
								}
								if (this.method147(local78)) {
									local160 = local78.anInt447;
									if (local686 && local78.anInt449 != 0) {
										local160 = local78.anInt449;
									}
									if (local78.aString19.length() > 0) {
										local684 = local78.aString19;
									}
								} else {
									local160 = local78.anInt446;
									if (local686 && local78.anInt448 != 0) {
										local160 = local78.anInt448;
									}
								}
								if (local78.anInt434 == 6 && this.aBoolean92) {
									local684 = "Please wait...";
									local160 = local78.anInt446;
								}
								if (Class1_Sub1_Sub2.anInt719 == 479) {
									if (local160 == 16776960) {
										local160 = 255;
									}
									if (local160 == 49152) {
										local160 = 16777215;
									}
								}
								local208 = local88 + local681.anInt732;
								while (local684.length() > 0) {
									if (local684.indexOf("%") != -1) {
										label348: while (true) {
											local210 = local684.indexOf("%1");
											if (local210 == -1) {
												while (true) {
													local210 = local684.indexOf("%2");
													if (local210 == -1) {
														while (true) {
															local210 = local684.indexOf("%3");
															if (local210 == -1) {
																while (true) {
																	local210 = local684.indexOf("%4");
																	if (local210 == -1) {
																		while (true) {
																			local210 = local684.indexOf("%5");
																			if (local210 == -1) {
																				break label348;
																			}
																			local684 = local684.substring(0, local210) + this.method144(this.method137(4, local78)) + local684.substring(local210 + 2);
																		}
																	}
																	local684 = local684.substring(0, local210) + this.method144(this.method137(3, local78)) + local684.substring(local210 + 2);
																}
															}
															local684 = local684.substring(0, local210) + this.method144(this.method137(2, local78)) + local684.substring(local210 + 2);
														}
													}
													local684 = local684.substring(0, local210) + this.method144(this.method137(1, local78)) + local684.substring(local210 + 2);
												}
											}
											local684 = local684.substring(0, local210) + this.method144(this.method137(0, local78)) + local684.substring(local210 + 2);
										}
									}
									local210 = local684.indexOf("\\n");
									@Pc(958) String local958;
									if (local210 == -1) {
										local958 = local684;
										local684 = "";
									} else {
										local958 = local684.substring(0, local210);
										local684 = local684.substring(local210 + 2);
									}
									if (local78.aBoolean106) {
										local681.method448(local208, (byte) 4, local83 + local78.anInt436 / 2, local958, local160, local78.aBoolean107);
									} else {
										local681.method455(local958, local160, local208, local78.aBoolean107, local83);
									}
									local208 += local681.anInt732;
								}
							} else if (local78.anInt433 == 5) {
								@Pc(1020) Class1_Sub1_Sub2_Sub2 local1020;
								if (this.method147(local78)) {
									local1020 = local78.aClass1_Sub1_Sub2_Sub2_15;
								} else {
									local1020 = local78.aClass1_Sub1_Sub2_Sub2_14;
								}
								if (local1020 != null) {
									local1020.method391(local83, local88);
								}
							} else if (local78.anInt433 == 6) {
								local158 = Class1_Sub1_Sub2_Sub1.anInt611;
								local160 = Class1_Sub1_Sub2_Sub1.anInt612;
								Class1_Sub1_Sub2_Sub1.anInt611 = local83 + local78.anInt436 / 2;
								Class1_Sub1_Sub2_Sub1.anInt612 = local88 + local78.anInt437 / 2;
								local164 = Class1_Sub1_Sub2_Sub1.anIntArray178[local78.anInt457] * local78.anInt456 >> 16;
								local175 = Class1_Sub1_Sub2_Sub1.anIntArray179[local78.anInt457] * local78.anInt456 >> 16;
								@Pc(1081) boolean local1081 = this.method147(local78);
								if (local1081) {
									local208 = local78.anInt455;
								} else {
									local208 = local78.anInt454;
								}
								@Pc(1101) Class1_Sub1_Sub1_Sub5 local1101;
								if (local208 == -1) {
									local1101 = local78.method233(-1, -1, local1081);
								} else {
									@Pc(1107) Class27 local1107 = Class27.aClass27Array1[local208];
									local1101 = local78.method233(local1107.anIntArray225[local78.anInt429], local1107.anIntArray226[local78.anInt429], local1081);
								}
								if (local1101 != null) {
									local1101.method281(local78.anInt458, 0, local78.anInt457, 0, local164, local175);
								}
								Class1_Sub1_Sub2_Sub1.anInt611 = local158;
								Class1_Sub1_Sub2_Sub1.anInt612 = local160;
							} else if (local78.anInt433 == 7) {
								local681 = local78.aClass1_Sub1_Sub2_Sub4_5;
								local160 = 0;
								for (local164 = 0; local164 < local78.anInt437; local164++) {
									for (local175 = 0; local175 < local78.anInt436; local175++) {
										if (local78.anIntArray94[local160] > 0) {
											@Pc(1171) Class15 local1171 = Class15.method361(local78.anIntArray94[local160] - 1);
											@Pc(1174) String local1174 = local1171.aString25;
											if (local1171.aBoolean166 || local78.anIntArray95[local160] != 1) {
												local1174 = local1174 + " x" + method173(local78.anIntArray95[local160]);
											}
											local210 = local83 + local175 * (local78.anInt444 + 115);
											local217 = local88 + local164 * (local78.anInt445 + 12);
											if (local78.aBoolean106) {
												local681.method448(local217, (byte) 4, local210 + local78.anInt436 / 2, local1174, local78.anInt446, local78.aBoolean107);
											} else {
												local681.method455(local1174, local78.anInt446, local217, local78.aBoolean107, local210);
											}
										}
										local160++;
									}
								}
							}
						}
					}
				}
				Class1_Sub1_Sub2.method436(local35, local31, local33, local29);
			}
		} catch (@Pc(1275) RuntimeException local1275) {
			signlink.reporterror("78854, " + arg0 + ", " + arg1 + ", " + 1 + ", " + arg2 + ", " + arg3 + ", " + local1275.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIIIIIIIIZI)Z")
	private boolean method184(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) boolean arg9, @OriginalArg(11) int arg10) {
		try {
			@Pc(11) int local11;
			for (@Pc(7) int local7 = 0; local7 < 104; local7++) {
				for (local11 = 0; local11 < 104; local11++) {
					this.anIntArrayArray4[local7][local11] = 0;
					this.anIntArrayArray3[local7][local11] = 99999999;
				}
			}
			local11 = arg2;
			@Pc(39) int local39 = arg10;
			this.anIntArrayArray4[arg2][arg10] = 99;
			this.anIntArrayArray3[arg2][arg10] = 0;
			@Pc(55) byte local55 = 0;
			@Pc(57) int local57 = 0;
			this.anIntArray44[0] = arg2;
			@Pc(66) int local66 = local55 + 1;
			this.anIntArray45[0] = arg10;
			@Pc(70) boolean local70 = false;
			@Pc(74) int local74 = this.anIntArray44.length;
			@Pc(81) int[][] local81 = this.aClass19Array1[this.anInt355].anIntArrayArray18;
			@Pc(192) int local192;
			while (local57 != local66) {
				local11 = this.anIntArray44[local57];
				local39 = this.anIntArray45[local57];
				local57 = (local57 + 1) % local74;
				if (local11 == arg1 && local39 == arg0) {
					local70 = true;
					break;
				}
				if (arg3 != 0) {
					if ((arg3 < 5 || arg3 == 10) && this.aClass19Array1[this.anInt355].method429(local39, local11, arg5, arg1, arg0, arg3 - 1)) {
						local70 = true;
						break;
					}
					if (arg3 < 10 && this.aClass19Array1[this.anInt355].method430(local11, arg0, arg5, arg1, local39, arg3 - 1)) {
						local70 = true;
						break;
					}
				}
				if (arg8 != 0 && arg4 != 0 && this.aClass19Array1[this.anInt355].method431(arg0, arg6, arg8, arg4, local39, local11, arg1)) {
					local70 = true;
					break;
				}
				local192 = this.anIntArrayArray3[local11][local39] + 1;
				if (local11 > 0 && this.anIntArrayArray4[local11 - 1][local39] == 0 && (local81[local11 - 1][local39] & 0x280108) == 0) {
					this.anIntArray44[local66] = local11 - 1;
					this.anIntArray45[local66] = local39;
					local66 = (local66 + 1) % local74;
					this.anIntArrayArray4[local11 - 1][local39] = 2;
					this.anIntArrayArray3[local11 - 1][local39] = local192;
				}
				if (local11 < 103 && this.anIntArrayArray4[local11 + 1][local39] == 0 && (local81[local11 + 1][local39] & 0x280180) == 0) {
					this.anIntArray44[local66] = local11 + 1;
					this.anIntArray45[local66] = local39;
					local66 = (local66 + 1) % local74;
					this.anIntArrayArray4[local11 + 1][local39] = 8;
					this.anIntArrayArray3[local11 + 1][local39] = local192;
				}
				if (local39 > 0 && this.anIntArrayArray4[local11][local39 - 1] == 0 && (local81[local11][local39 - 1] & 0x280102) == 0) {
					this.anIntArray44[local66] = local11;
					this.anIntArray45[local66] = local39 - 1;
					local66 = (local66 + 1) % local74;
					this.anIntArrayArray4[local11][local39 - 1] = 1;
					this.anIntArrayArray3[local11][local39 - 1] = local192;
				}
				if (local39 < 103 && this.anIntArrayArray4[local11][local39 + 1] == 0 && (local81[local11][local39 + 1] & 0x280120) == 0) {
					this.anIntArray44[local66] = local11;
					this.anIntArray45[local66] = local39 + 1;
					local66 = (local66 + 1) % local74;
					this.anIntArrayArray4[local11][local39 + 1] = 4;
					this.anIntArrayArray3[local11][local39 + 1] = local192;
				}
				if (local11 > 0 && local39 > 0 && this.anIntArrayArray4[local11 - 1][local39 - 1] == 0 && (local81[local11 - 1][local39 - 1] & 0x28010E) == 0 && (local81[local11 - 1][local39] & 0x280108) == 0 && (local81[local11][local39 - 1] & 0x280102) == 0) {
					this.anIntArray44[local66] = local11 - 1;
					this.anIntArray45[local66] = local39 - 1;
					local66 = (local66 + 1) % local74;
					this.anIntArrayArray4[local11 - 1][local39 - 1] = 3;
					this.anIntArrayArray3[local11 - 1][local39 - 1] = local192;
				}
				if (local11 < 103 && local39 > 0 && this.anIntArrayArray4[local11 + 1][local39 - 1] == 0 && (local81[local11 + 1][local39 - 1] & 0x280183) == 0 && (local81[local11 + 1][local39] & 0x280180) == 0 && (local81[local11][local39 - 1] & 0x280102) == 0) {
					this.anIntArray44[local66] = local11 + 1;
					this.anIntArray45[local66] = local39 - 1;
					local66 = (local66 + 1) % local74;
					this.anIntArrayArray4[local11 + 1][local39 - 1] = 9;
					this.anIntArrayArray3[local11 + 1][local39 - 1] = local192;
				}
				if (local11 > 0 && local39 < 103 && this.anIntArrayArray4[local11 - 1][local39 + 1] == 0 && (local81[local11 - 1][local39 + 1] & 0x280138) == 0 && (local81[local11 - 1][local39] & 0x280108) == 0 && (local81[local11][local39 + 1] & 0x280120) == 0) {
					this.anIntArray44[local66] = local11 - 1;
					this.anIntArray45[local66] = local39 + 1;
					local66 = (local66 + 1) % local74;
					this.anIntArrayArray4[local11 - 1][local39 + 1] = 6;
					this.anIntArrayArray3[local11 - 1][local39 + 1] = local192;
				}
				if (local11 < 103 && local39 < 103 && this.anIntArrayArray4[local11 + 1][local39 + 1] == 0 && (local81[local11 + 1][local39 + 1] & 0x2801E0) == 0 && (local81[local11 + 1][local39] & 0x280180) == 0 && (local81[local11][local39 + 1] & 0x280120) == 0) {
					this.anIntArray44[local66] = local11 + 1;
					this.anIntArray45[local66] = local39 + 1;
					local66 = (local66 + 1) % local74;
					this.anIntArrayArray4[local11 + 1][local39 + 1] = 12;
					this.anIntArrayArray3[local11 + 1][local39 + 1] = local192;
				}
			}
			this.anInt322 = 0;
			@Pc(808) int local808;
			@Pc(814) int local814;
			@Pc(820) int local820;
			if (!local70) {
				if (arg9) {
					local192 = 100;
					for (local808 = 1; local808 < 2; local808++) {
						for (local814 = arg1 - local808; local814 <= arg1 + local808; local814++) {
							for (local820 = arg0 - local808; local820 <= arg0 + local808; local820++) {
								if (local814 >= 0 && local820 >= 0 && local814 < 104 && local820 < 104 && this.anIntArrayArray3[local814][local820] < local192) {
									local192 = this.anIntArrayArray3[local814][local820];
									local11 = local814;
									local39 = local820;
									this.anInt322 = 1;
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
			@Pc(881) byte local881 = 0;
			this.anIntArray44[0] = local11;
			local57 = local881 + 1;
			this.anIntArray45[0] = local39;
			local192 = local808 = this.anIntArrayArray4[local11][local39];
			while (local11 != arg2 || local39 != arg10) {
				if (local192 != local808) {
					local808 = local192;
					this.anIntArray44[local57] = local11;
					this.anIntArray45[local57++] = local39;
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
				local192 = this.anIntArrayArray4[local11][local39];
			}
			if (local57 > 0) {
				local74 = local57;
				if (local57 > 25) {
					local74 = 25;
				}
				local57--;
				local814 = this.anIntArray44[local57];
				local820 = this.anIntArray45[local57];
				if (arg7 == 0) {
					this.aClass1_Sub1_Sub3_4.method469(141);
					this.aClass1_Sub1_Sub3_4.method470(local74 + local74 + 3);
				}
				if (arg7 == 1) {
					this.aClass1_Sub1_Sub3_4.method469(196);
					this.aClass1_Sub1_Sub3_4.method470(local74 + local74 + 3 + 14);
				}
				if (arg7 == 2) {
					this.aClass1_Sub1_Sub3_4.method469(70);
					this.aClass1_Sub1_Sub3_4.method470(local74 + local74 + 3);
				}
				if (super.anIntArray30[5] == 1) {
					this.aClass1_Sub1_Sub3_4.method470(1);
				} else {
					this.aClass1_Sub1_Sub3_4.method470(0);
				}
				this.aClass1_Sub1_Sub3_4.method471(local814 + this.anInt302);
				this.aClass1_Sub1_Sub3_4.method471(local820 + this.anInt303);
				this.anInt285 = this.anIntArray44[0];
				this.anInt286 = this.anIntArray45[0];
				for (@Pc(1075) int local1075 = 1; local1075 < local74; local1075++) {
					local57--;
					this.aClass1_Sub1_Sub3_4.method470(this.anIntArray44[local57] - local814);
					this.aClass1_Sub1_Sub3_4.method470(this.anIntArray45[local57] - local820);
				}
				return true;
			} else if (arg7 == 1) {
				return false;
			} else {
				return true;
			}
		} catch (@Pc(1110) RuntimeException local1110) {
			signlink.reporterror("37532, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + 4 + ", " + arg8 + ", " + arg9 + ", " + arg10 + ", " + local1110.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
	@Override
	public String getParameter(@OriginalArg(0) String arg0) {
		return signlink.mainapp == null ? super.getParameter(arg0) : signlink.mainapp.getParameter(arg0);
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IZ)V")
	private void method185(@OriginalArg(1) boolean arg0) {
		try {
			if (this.anInt343 != -38693) {
				this.anInt315 = -1;
			}
			for (@Pc(8) int local8 = 0; local8 < this.anInt266; local8++) {
				@Pc(18) Class1_Sub1_Sub1_Sub1_Sub2 local18 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[this.anIntArray53[local8]];
				@Pc(27) int local27 = (this.anIntArray53[local8] << 14) + 536870912;
				if (local18 != null && local18.method680() && local18.aClass13_2.aBoolean153 == arg0) {
					@Pc(43) int local43 = local18.anInt1009 >> 7;
					@Pc(48) int local48 = local18.anInt1010 >> 7;
					if (local43 >= 0 && local43 < 104 && local48 >= 0 && local48 < 104) {
						if (local18.anInt1012 == 1 && (local18.anInt1009 & 0x7F) == 64 && (local18.anInt1010 & 0x7F) == 64) {
							if (this.anIntArrayArray6[local43][local48] == this.anInt321) {
								continue;
							}
							this.anIntArrayArray6[local43][local48] = this.anInt321;
						}
						this.aClass37_1.method541(local18.aBoolean252, local18.anInt1011, local18.anInt1010, local18.anInt1009, local27, (local18.anInt1012 - 1) * 64 + 60, this.anInt355, local18, this.method200(local18.anInt1009, this.anInt355, local18.anInt1010));
					}
				}
			}
		} catch (@Pc(132) RuntimeException local132) {
			signlink.reporterror("97984, " + -38693 + ", " + arg0 + ", " + local132.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "init", descriptor = "()V")
	@Override
	public void init() {
		anInt339 = Integer.parseInt(this.getParameter("nodeid"));
		anInt340 = Integer.parseInt(this.getParameter("portoff"));
		@Pc(15) String local15 = this.getParameter("lowmem");
		if (local15 != null && local15.equals("1")) {
			method139();
		} else {
			method120();
		}
		@Pc(31) String local31 = this.getParameter("free");
		if (local31 != null && local31.equals("1")) {
			aBoolean76 = false;
		} else {
			aBoolean76 = true;
		}
		this.method85();
	}

	@OriginalMember(owner = "client!client", name = "u", descriptor = "(I)V")
	private void method186() {
		try {
			@Pc(12) int local12;
			for (@Pc(5) int local5 = 10; local5 < 117; local5++) {
				local12 = (int) (Math.random() * 100.0D);
				if (local12 < 50) {
					this.anIntArray83[local5 + 32512] = 255;
				}
			}
			@Pc(41) int local41;
			@Pc(48) int local48;
			@Pc(54) int local54;
			for (local12 = 0; local12 < 100; local12++) {
				local41 = (int) (Math.random() * 124.0D) + 2;
				local48 = (int) (Math.random() * 128.0D) + 128;
				local54 = local41 + (local48 << 7);
				this.anIntArray83[local54] = 192;
			}
			for (local41 = 1; local41 < 255; local41++) {
				for (local48 = 1; local48 < 127; local48++) {
					local54 = local48 + (local41 << 7);
					this.anIntArray84[local54] = (this.anIntArray83[local54 - 1] + this.anIntArray83[local54 + 1] + this.anIntArray83[local54 - 128] + this.anIntArray83[local54 + 128]) / 4;
				}
			}
			this.anInt323 += 128;
			if (this.anInt323 > this.anIntArray42.length) {
				this.anInt323 -= this.anIntArray42.length;
				local48 = (int) (Math.random() * 12.0D);
				this.method179(this.aClass1_Sub1_Sub2_Sub3Array1[local48]);
			}
			@Pc(171) int local171;
			for (local48 = 1; local48 < 255; local48++) {
				for (local54 = 1; local54 < 127; local54++) {
					local171 = local54 + (local48 << 7);
					@Pc(194) int local194 = this.anIntArray84[local171 + 128] - this.anIntArray42[local171 + this.anInt323 & this.anIntArray42.length - 1] / 5;
					if (local194 < 0) {
						local194 = 0;
					}
					this.anIntArray83[local171] = local194;
				}
			}
			for (local54 = 0; local54 < 255; local54++) {
				this.anIntArray39[local54] = this.anIntArray39[local54 + 1];
			}
			this.anIntArray39[255] = (int) (Math.sin((double) anInt252 / 14.0D) * 16.0D + Math.sin((double) anInt252 / 15.0D) * 14.0D + Math.sin((double) anInt252 / 16.0D) * 12.0D);
			if (this.anInt411 > 0) {
				this.anInt411 -= 4;
			}
			if (this.anInt412 > 0) {
				this.anInt412 -= 4;
			}
			if (this.anInt411 == 0 && this.anInt412 == 0) {
				local171 = (int) (Math.random() * 2000.0D);
				if (local171 == 0) {
					this.anInt411 = 1024;
				}
				if (local171 == 1) {
					this.anInt412 = 1024;
					return;
				}
			}
		} catch (@Pc(305) RuntimeException local305) {
			signlink.reporterror("87151, " + -961 + ", " + local305.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(III)Z")
	private boolean method187(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(3) boolean local3 = false;
			@Pc(7) Class6 local7 = Class6.aClass6Array1[arg1];
			for (@Pc(9) int local9 = 0; local9 < local7.anIntArray98.length && local7.anIntArray98[local9] != -1; local9++) {
				@Pc(24) Class6 local24 = Class6.aClass6Array1[local7.anIntArray98[local9]];
				if (local24.anInt433 == 1) {
					local3 |= this.method187(arg0, local24.anInt431);
				}
				if (local24.anInt433 == 6 && (local24.anInt454 != -1 || local24.anInt455 != -1)) {
					@Pc(54) boolean local54 = this.method147(local24);
					@Pc(59) int local59;
					if (local54) {
						local59 = local24.anInt455;
					} else {
						local59 = local24.anInt454;
					}
					if (local59 != -1) {
						@Pc(71) Class27 local71 = Class27.aClass27Array1[local59];
						local24.anInt430 += arg0;
						while (local24.anInt430 > local71.method506(local24.anInt429, this.aBoolean65)) {
							local24.anInt430 -= local71.method506(local24.anInt429, this.aBoolean65) + 1;
							local24.anInt429++;
							if (local24.anInt429 >= local71.anInt814) {
								local24.anInt429 -= local71.anInt815;
								if (local24.anInt429 < 0 || local24.anInt429 >= local71.anInt814) {
									local24.anInt429 = 0;
								}
							}
							local3 = true;
						}
					}
				}
			}
			return local3;
		} catch (@Pc(146) RuntimeException local146) {
			signlink.reporterror("32337, " + arg0 + ", " + arg1 + ", " + 0 + ", " + local146.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "v", descriptor = "(I)V")
	private void method188() {
		try {
			@Pc(3) int local3 = 5;
			this.anIntArray56[8] = 0;
			@Pc(10) int local10 = 0;
			while (this.anIntArray56[8] == 0) {
				@Pc(20) String local20 = "Unknown problem";
				this.method96(20, "Connecting to web server");
				try {
					@Pc(42) DataInputStream local42 = this.method105("crc" + (int) (Math.random() * 9.9999999E7D) + "-" + 297);
					@Pc(49) Class1_Sub1_Sub3 local49 = new Class1_Sub1_Sub3(-49365, new byte[40]);
					local42.readFully(local49.aByteArray9, 0, 40);
					local42.close();
					for (@Pc(59) int local59 = 0; local59 < 9; local59++) {
						this.anIntArray56[local59] = local49.method485();
					}
					@Pc(74) int local74 = local49.method485();
					@Pc(76) int local76 = 1234;
					for (@Pc(78) int local78 = 0; local78 < 9; local78++) {
						local76 = (local76 << 1) + this.anIntArray56[local78];
					}
					if (local74 != local76) {
						local20 = "checksum problem";
						this.anIntArray56[8] = 0;
					}
				} catch (@Pc(105) EOFException local105) {
					local20 = "EOF problem";
					this.anIntArray56[8] = 0;
				} catch (@Pc(114) IOException local114) {
					local20 = "connection problem";
					this.anIntArray56[8] = 0;
				} catch (@Pc(123) Exception local123) {
					local20 = "logic problem";
					this.anIntArray56[8] = 0;
					if (!signlink.reporterror) {
						return;
					}
				}
				if (this.anIntArray56[8] == 0) {
					local10++;
					for (@Pc(141) int local141 = local3; local141 > 0; local141--) {
						if (local10 >= 10) {
							this.method96(10, "Game updated - please reload page");
							local141 = 10;
						} else {
							this.method96(10, local20 + " - Will retry in " + local141 + " secs.");
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
					this.aBoolean60 = !this.aBoolean60;
				}
			}
		} catch (@Pc(203) RuntimeException local203) {
			signlink.reporterror("16815, " + -763 + ", " + local203.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "o", descriptor = "(Z)V")
	private void method189() {
		try {
			while (true) {
				@Pc(11) Class1_Sub1_Sub4 local11 = this.aClass44_Sub1_1.method647();
				if (local11 == null) {
					return;
				}
				if (local11.anInt791 == 0) {
					Class1_Sub1_Sub1_Sub5.method259(local11.aByteArray10, local11.anInt792);
					if ((this.aClass44_Sub1_1.method643(local11.anInt792) & 0x62) != 0) {
						this.aBoolean87 = true;
						if (this.anInt235 != -1) {
							this.aBoolean68 = true;
						}
					}
				}
				if (local11.anInt791 == 1 && local11.aByteArray10 != null) {
					Class12.method303(local11.aByteArray10);
				}
				if (local11.anInt791 == 2 && local11.anInt792 == this.anInt260 && local11.aByteArray10 != null) {
					this.method192(local11.aByteArray10, this.aBoolean61);
				}
				if (local11.anInt791 == 3 && this.anInt388 == 1) {
					for (@Pc(82) int local82 = 0; local82 < this.aByteArrayArray1.length; local82++) {
						if (this.anIntArray70[local82] == local11.anInt792) {
							this.aByteArrayArray1[local82] = local11.aByteArray10;
							if (local11.aByteArray10 == null) {
								this.anIntArray70[local82] = -1;
							}
							break;
						}
						if (this.anIntArray71[local82] == local11.anInt792) {
							this.aByteArrayArray2[local82] = local11.aByteArray10;
							if (local11.aByteArray10 == null) {
								this.anIntArray71[local82] = -1;
							}
							break;
						}
					}
				}
				if (local11.anInt791 == 93 && this.aClass44_Sub1_1.method642(local11.anInt792)) {
					Class4.method59(new Class1_Sub1_Sub3(-49365, local11.aByteArray10), this.aClass44_Sub1_1);
				}
			}
		} catch (@Pc(159) RuntimeException local159) {
			signlink.reporterror("53514, " + true + ", " + local159.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
	@Override
	public AppletContext getAppletContext() {
		return signlink.mainapp == null ? super.getAppletContext() : signlink.mainapp.getAppletContext();
	}

	@OriginalMember(owner = "client!client", name = "p", descriptor = "(Z)V")
	private void method190() {
		try {
			if (this.anInt362 == 2) {
				this.method166((this.anInt422 - this.anInt302 << 7) + this.anInt425, this.anInt424 * 2, (this.anInt423 - this.anInt303 << 7) + this.anInt426);
				if (this.anInt225 > -1 && anInt252 % 20 < 10) {
					this.aClass1_Sub1_Sub2_Sub2Array7[2].method391(this.anInt225 - 12, this.anInt226 - 28);
				}
			}
		} catch (@Pc(64) RuntimeException local64) {
			signlink.reporterror("53471, " + false + ", " + local64.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "q", descriptor = "(Z)V")
	private void method191() {
		try {
			@Pc(7) int local7 = this.aClass1_Sub1_Sub2_Sub4_3.method449("Choose Option");
			@Pc(20) int local20;
			for (@Pc(9) int local9 = 0; local9 < this.anInt329; local9++) {
				local20 = this.aClass1_Sub1_Sub2_Sub4_3.method449(this.aStringArray6[local9]);
				if (local20 > local7) {
					local7 = local20;
				}
			}
			local7 += 8;
			local20 = this.anInt329 * 15 + 21;
			@Pc(66) int local66;
			@Pc(84) int local84;
			if (super.anInt214 > 4 && super.anInt215 > 4 && super.anInt214 < 516 && super.anInt215 < 338) {
				local66 = super.anInt214 - local7 / 2 - 4;
				if (local66 + local7 > 512) {
					local66 = 512 - local7;
				}
				if (local66 < 0) {
					local66 = 0;
				}
				local84 = super.anInt215 - 4;
				if (local84 + local20 > 334) {
					local84 = 334 - local20;
				}
				if (local84 < 0) {
					local84 = 0;
				}
				this.aBoolean64 = true;
				this.anInt370 = 0;
				this.anInt371 = local66;
				this.anInt372 = local84;
				this.anInt373 = local7;
				this.anInt374 = this.anInt329 * 15 + 22;
			}
			if (super.anInt214 > 553 && super.anInt215 > 205 && super.anInt214 < 743 && super.anInt215 < 466) {
				local66 = super.anInt214 - local7 / 2 - 553;
				if (local66 < 0) {
					local66 = 0;
				} else if (local66 + local7 > 190) {
					local66 = 190 - local7;
				}
				local84 = super.anInt215 - 205;
				if (local84 < 0) {
					local84 = 0;
				} else if (local84 + local20 > 261) {
					local84 = 261 - local20;
				}
				this.aBoolean64 = true;
				this.anInt370 = 1;
				this.anInt371 = local66;
				this.anInt372 = local84;
				this.anInt373 = local7;
				this.anInt374 = this.anInt329 * 15 + 22;
			}
			if (super.anInt214 > 17 && super.anInt215 > 357 && super.anInt214 < 496 && super.anInt215 < 453) {
				local66 = super.anInt214 - local7 / 2 - 17;
				if (local66 < 0) {
					local66 = 0;
				} else if (local66 + local7 > 479) {
					local66 = 479 - local7;
				}
				local84 = super.anInt215 - 357;
				if (local84 < 0) {
					local84 = 0;
				} else if (local84 + local20 > 96) {
					local84 = 96 - local20;
				}
				this.aBoolean64 = true;
				this.anInt370 = 2;
				this.anInt371 = local66;
				this.anInt372 = local84;
				this.anInt373 = local7;
				this.anInt374 = this.anInt329 * 15 + 22;
			}
		} catch (@Pc(288) RuntimeException local288) {
			signlink.reporterror("6534, " + false + ", " + local288.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Z[BZ)V")
	private void method192(@OriginalArg(1) byte[] arg0, @OriginalArg(2) boolean arg1) {
		try {
			signlink.anInt958 = arg1 ? 1 : 0;
			signlink.midisave(arg0, arg0.length);
		} catch (@Pc(16) RuntimeException local16) {
			signlink.reporterror("42883, " + false + ", " + arg0 + ", " + arg1 + ", " + local16.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!nb;I)V")
	private void method193(@OriginalArg(0) Class1_Sub2 arg0) {
		try {
			@Pc(1) int local1 = 0;
			@Pc(3) int local3 = -1;
			@Pc(5) int local5 = 0;
			@Pc(7) int local7 = 0;
			if (arg0.anInt802 == 0) {
				local1 = this.aClass37_1.method556(arg0.anInt801, arg0.anInt803, arg0.anInt804);
			}
			if (arg0.anInt802 == 1) {
				local1 = this.aClass37_1.method557(arg0.anInt801, arg0.anInt803, 939, arg0.anInt804);
			}
			if (arg0.anInt802 == 2) {
				local1 = this.aClass37_1.method558(arg0.anInt801, arg0.anInt803, arg0.anInt804);
			}
			if (arg0.anInt802 == 3) {
				local1 = this.aClass37_1.method559(arg0.anInt801, arg0.anInt803, arg0.anInt804);
			}
			if (local1 != 0) {
				@Pc(76) int local76 = this.aClass37_1.method560(arg0.anInt801, arg0.anInt803, arg0.anInt804, local1);
				local3 = local1 >> 14 & 0x7FFF;
				local5 = local76 & 0x1F;
				local7 = local76 >> 6;
			}
			arg0.anInt805 = local3;
			arg0.anInt807 = local5;
			arg0.anInt806 = local7;
		} catch (@Pc(107) RuntimeException local107) {
			signlink.reporterror("32529, " + arg0 + ", " + -17769 + ", " + local107.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIIIIIIII)V")
	private void method194(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		try {
			@Pc(1) Class1_Sub2 local1 = null;
			this.anInt314 += 0;
			for (@Pc(12) Class1_Sub2 local12 = (Class1_Sub2) this.aClass29_3.method511(); local12 != null; local12 = (Class1_Sub2) this.aClass29_3.method513()) {
				if (local12.anInt801 == arg7 && local12.anInt803 == arg8 && local12.anInt804 == arg1 && local12.anInt802 == arg0) {
					local1 = local12;
					break;
				}
			}
			if (local1 == null) {
				local1 = new Class1_Sub2();
				local1.anInt801 = arg7;
				local1.anInt802 = arg0;
				local1.anInt803 = arg8;
				local1.anInt804 = arg1;
				this.method193(local1);
				this.aClass29_3.method508(local1);
			}
			local1.anInt808 = arg2;
			local1.anInt810 = arg6;
			local1.anInt809 = arg3;
			local1.anInt811 = arg5;
			local1.anInt812 = arg4;
		} catch (@Pc(84) RuntimeException local84) {
			signlink.reporterror("85765, " + arg0 + ", " + arg1 + ", " + 0 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + local84.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "w", descriptor = "(I)V")
	private void method195() {
		try {
			for (@Pc(7) int local7 = -1; local7 < this.anInt232; local7++) {
				@Pc(15) int local15;
				if (local7 == -1) {
					local15 = this.anInt231;
				} else {
					local15 = this.anIntArray34[local7];
				}
				@Pc(27) Class1_Sub1_Sub1_Sub1_Sub1 local27 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local15];
				if (local27 != null) {
					this.method110(local27, 1);
				}
			}
		} catch (@Pc(41) RuntimeException local41) {
			signlink.reporterror("47987, " + 535 + ", " + local41.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "x", descriptor = "(I)V")
	private void method196() {
		try {
			if (super.anInt213 == 1) {
				if (super.anInt214 >= 539 && super.anInt214 <= 573 && super.anInt215 >= 169 && super.anInt215 < 205 && this.anIntArray74[0] != -1) {
					this.aBoolean87 = true;
					this.anInt308 = 0;
					this.aBoolean66 = true;
				}
				if (super.anInt214 >= 569 && super.anInt214 <= 599 && super.anInt215 >= 168 && super.anInt215 < 205 && this.anIntArray74[1] != -1) {
					this.aBoolean87 = true;
					this.anInt308 = 1;
					this.aBoolean66 = true;
				}
				if (super.anInt214 >= 597 && super.anInt214 <= 627 && super.anInt215 >= 168 && super.anInt215 < 205 && this.anIntArray74[2] != -1) {
					this.aBoolean87 = true;
					this.anInt308 = 2;
					this.aBoolean66 = true;
				}
				if (super.anInt214 >= 625 && super.anInt214 <= 669 && super.anInt215 >= 168 && super.anInt215 < 203 && this.anIntArray74[3] != -1) {
					this.aBoolean87 = true;
					this.anInt308 = 3;
					this.aBoolean66 = true;
				}
				if (super.anInt214 >= 666 && super.anInt214 <= 696 && super.anInt215 >= 168 && super.anInt215 < 205 && this.anIntArray74[4] != -1) {
					this.aBoolean87 = true;
					this.anInt308 = 4;
					this.aBoolean66 = true;
				}
				if (super.anInt214 >= 694 && super.anInt214 <= 724 && super.anInt215 >= 168 && super.anInt215 < 205 && this.anIntArray74[5] != -1) {
					this.aBoolean87 = true;
					this.anInt308 = 5;
					this.aBoolean66 = true;
				}
				if (super.anInt214 >= 722 && super.anInt214 <= 756 && super.anInt215 >= 169 && super.anInt215 < 205 && this.anIntArray74[6] != -1) {
					this.aBoolean87 = true;
					this.anInt308 = 6;
					this.aBoolean66 = true;
				}
				if (super.anInt214 >= 540 && super.anInt214 <= 574 && super.anInt215 >= 466 && super.anInt215 < 502 && this.anIntArray74[7] != -1) {
					this.aBoolean87 = true;
					this.anInt308 = 7;
					this.aBoolean66 = true;
				}
				if (super.anInt214 >= 572 && super.anInt214 <= 602 && super.anInt215 >= 466 && super.anInt215 < 503 && this.anIntArray74[8] != -1) {
					this.aBoolean87 = true;
					this.anInt308 = 8;
					this.aBoolean66 = true;
				}
				if (super.anInt214 >= 599 && super.anInt214 <= 629 && super.anInt215 >= 466 && super.anInt215 < 503 && this.anIntArray74[9] != -1) {
					this.aBoolean87 = true;
					this.anInt308 = 9;
					this.aBoolean66 = true;
				}
				if (super.anInt214 >= 627 && super.anInt214 <= 671 && super.anInt215 >= 467 && super.anInt215 < 502 && this.anIntArray74[10] != -1) {
					this.aBoolean87 = true;
					this.anInt308 = 10;
					this.aBoolean66 = true;
				}
				if (super.anInt214 >= 669 && super.anInt214 <= 699 && super.anInt215 >= 466 && super.anInt215 < 503 && this.anIntArray74[11] != -1) {
					this.aBoolean87 = true;
					this.anInt308 = 11;
					this.aBoolean66 = true;
				}
				if (super.anInt214 >= 696 && super.anInt214 <= 726 && super.anInt215 >= 466 && super.anInt215 < 503 && this.anIntArray74[12] != -1) {
					this.aBoolean87 = true;
					this.anInt308 = 12;
					this.aBoolean66 = true;
				}
				if (super.anInt214 >= 724 && super.anInt214 <= 758 && super.anInt215 >= 466 && super.anInt215 < 502 && this.anIntArray74[13] != -1) {
					this.aBoolean87 = true;
					this.anInt308 = 13;
					this.aBoolean66 = true;
					return;
				}
			}
		} catch (@Pc(445) RuntimeException local445) {
			signlink.reporterror("59166, " + 1639 + ", " + local445.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ZILjava/lang/String;Ljava/lang/String;II)Lclient!xb;")
	private Class47 method197(@OriginalArg(1) int arg0, @OriginalArg(2) String arg1, @OriginalArg(3) String arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		try {
			@Pc(9) byte[] local9 = null;
			@Pc(11) int local11 = 5;
			try {
				if (this.aClass45Array1[0] != null) {
					local9 = this.aClass45Array1[0].method658(arg0);
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
				return new Class47(false, local9);
			}
			local40 = 0;
			while (local9 == null) {
				@Pc(61) String local61 = "Unknown error";
				this.method96(arg3, "Requesting " + arg2);
				@Pc(76) int local76;
				try {
					local76 = 0;
					@Pc(87) DataInputStream local87 = this.method105(arg1 + arg4);
					@Pc(90) byte[] local90 = new byte[6];
					local87.readFully(local90, 0, 6);
					@Pc(101) Class1_Sub1_Sub3 local101 = new Class1_Sub1_Sub3(-49365, local90);
					local101.anInt763 = 3;
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
							this.method96(arg3, "Loading " + arg2 + " - " + local174 + "%");
						}
						local76 = local174;
					}
					local87.close();
					try {
						if (this.aClass45Array1[0] != null) {
							this.aClass45Array1[0].method659(arg0, (byte) 9, local9.length, local9);
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
							this.method96(arg3, "Game updated - please reload page");
							local76 = 10;
						} else {
							this.method96(arg3, local61 + " - Retrying in " + local76);
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
					this.aBoolean60 = !this.aBoolean60;
				}
			}
			return new Class47(false, local9);
		} catch (@Pc(358) RuntimeException local358) {
			signlink.reporterror("28204, " + true + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local358.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!lb;IZ)V")
	private void method198(@OriginalArg(0) Class1_Sub1_Sub3 arg0, @OriginalArg(1) int arg1) {
		try {
			while (true) {
				if (arg0.anInt764 + 10 < arg1 * 8) {
					@Pc(18) int local18 = arg0.method491(11, this.aByte9);
					if (local18 != 2047) {
						if (this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local18] == null) {
							this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local18] = new Class1_Sub1_Sub1_Sub1_Sub1();
							if (this.aClass1_Sub1_Sub3Array1[local18] != null) {
								this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local18].method39(this.aClass1_Sub1_Sub3Array1[local18]);
							}
						}
						this.anIntArray34[this.anInt232++] = local18;
						@Pc(64) Class1_Sub1_Sub1_Sub1_Sub1 local64 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local18];
						local64.anInt1049 = anInt252;
						@Pc(73) int local73 = arg0.method491(5, this.aByte9);
						if (local73 > 15) {
							local73 -= 32;
						}
						@Pc(83) int local83 = arg0.method491(5, this.aByte9);
						if (local83 > 15) {
							local83 -= 32;
						}
						@Pc(93) int local93 = arg0.method491(1, this.aByte9);
						local64.method677(local93 == 1, aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray272[0] + local73, aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray273[0] + local83);
						@Pc(120) int local120 = arg0.method491(1, this.aByte9);
						if (local120 == 1) {
							this.anIntArray35[this.anInt233++] = local18;
						}
						continue;
					}
				}
				arg0.method492();
				return;
			}
		} catch (@Pc(141) RuntimeException local141) {
			signlink.reporterror("52391, " + arg0 + ", " + arg1 + ", " + false + ", " + local141.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "y", descriptor = "(I)V")
	private void method199() {
		try {
			if (this.anInt357 == 0 && super.anInt213 == 1) {
				@Pc(23) int local23 = super.anInt214 - 25 - 550;
				@Pc(30) int local30 = super.anInt215 - 5 - 4;
				if (local23 >= 0 && local30 >= 0 && local23 < 146 && local30 < 151) {
					local23 -= 73;
					local30 -= 75;
					@Pc(50) int local50 = this.anInt398 + this.anInt349 & 0x7FF;
					@Pc(54) int local54 = Class1_Sub1_Sub2_Sub1.anIntArray178[local50];
					@Pc(58) int local58 = Class1_Sub1_Sub2_Sub1.anIntArray179[local50];
					@Pc(67) int local67 = local54 * (this.anInt241 + 256) >> 8;
					@Pc(76) int local76 = local58 * (this.anInt241 + 256) >> 8;
					@Pc(86) int local86 = local30 * local67 + local23 * local76 >> 11;
					@Pc(96) int local96 = local30 * local76 - local23 * local67 >> 11;
					@Pc(103) int local103 = aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt1009 + local86 >> 7;
					@Pc(110) int local110 = aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt1010 - local96 >> 7;
					@Pc(131) boolean local131 = this.method184(local110, local103, aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray272[0], 0, 0, 0, 0, 1, 0, true, aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray273[0]);
					if (local131) {
						this.aClass1_Sub1_Sub3_4.method470(local23);
						this.aClass1_Sub1_Sub3_4.method470(local30);
						this.aClass1_Sub1_Sub3_4.method471(this.anInt398);
						this.aClass1_Sub1_Sub3_4.method470(57);
						this.aClass1_Sub1_Sub3_4.method470(this.anInt349);
						this.aClass1_Sub1_Sub3_4.method470(this.anInt241);
						this.aClass1_Sub1_Sub3_4.method470(89);
						this.aClass1_Sub1_Sub3_4.method471(aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt1009);
						this.aClass1_Sub1_Sub3_4.method471(aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt1010);
						this.aClass1_Sub1_Sub3_4.method470(this.anInt322);
						this.aClass1_Sub1_Sub3_4.method470(63);
						return;
					}
				}
			}
		} catch (@Pc(185) RuntimeException local185) {
			signlink.reporterror("35936, " + 17250 + ", " + local185.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIBI)I")
	private int method200(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		try {
			@Pc(3) int local3 = arg0 >> 7;
			@Pc(7) int local7 = arg2 >> 7;
			if (local3 < 0 || local7 < 0 || local3 > 103 || local7 > 103) {
				return 0;
			}
			@Pc(21) int local21 = arg1;
			if (arg1 < 3 && (this.aByteArrayArrayArray7[1][local3][local7] & 0x2) == 2) {
				local21 = arg1 + 1;
			}
			@Pc(41) int local41 = arg0 & 0x7F;
			@Pc(45) int local45 = arg2 & 0x7F;
			@Pc(73) int local73 = this.anIntArrayArrayArray5[local21][local3][local7] * (128 - local41) + this.anIntArrayArrayArray5[local21][local3 + 1][local7] * local41 >> 7;
			@Pc(105) int local105 = this.anIntArrayArrayArray5[local21][local3][local7 + 1] * (128 - local41) + this.anIntArrayArrayArray5[local21][local3 + 1][local7 + 1] * local41 >> 7;
			return local73 * (128 - local45) + local105 * local45 >> 7;
		} catch (@Pc(129) RuntimeException local129) {
			signlink.reporterror("39135, " + arg0 + ", " + arg1 + ", " + 8 + ", " + arg2 + ", " + local129.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "z", descriptor = "(I)V")
	private void method201(@OriginalArg(0) int arg0) {
		try {
			@Pc(5) boolean local5 = false;
			this.anInt264 = 0;
			@Pc(94) int local94;
			@Pc(74) int local74;
			for (@Pc(10) int local10 = -1; local10 < this.anInt232 + this.anInt266; local10++) {
				@Pc(17) Class1_Sub1_Sub1_Sub1 local17;
				if (local10 == -1) {
					local17 = aClass1_Sub1_Sub1_Sub1_Sub1_1;
				} else if (local10 < this.anInt232) {
					local17 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[this.anIntArray34[local10]];
				} else {
					local17 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[this.anIntArray53[local10 - this.anInt232]];
				}
				if (local17 != null && local17.method680()) {
					@Pc(58) Class13 local58;
					if (local17 instanceof Class1_Sub1_Sub1_Sub1_Sub2) {
						local58 = ((Class1_Sub1_Sub1_Sub1_Sub2) local17).aClass13_2;
						if (local58.anIntArray174 != null) {
							local58 = local58.method327();
						}
						if (local58 == null) {
							continue;
						}
					}
					if (local10 >= this.anInt232) {
						local58 = ((Class1_Sub1_Sub1_Sub1_Sub2) local17).aClass13_2;
						if (local58.anInt583 >= 0 && local58.anInt583 < this.aClass1_Sub1_Sub2_Sub2Array7.length) {
							this.method165(local17.anInt1050 + 15, local17);
							if (this.anInt225 > -1) {
								this.aClass1_Sub1_Sub2_Sub2Array7[local58.anInt583].method391(this.anInt225 - 12, this.anInt226 - 30);
							}
						}
						if (this.anInt362 == 1 && this.anInt306 == this.anIntArray53[local10 - this.anInt232] && anInt252 % 20 < 10) {
							this.method165(local17.anInt1050 + 15, local17);
							if (this.anInt225 > -1) {
								this.aClass1_Sub1_Sub2_Sub2Array7[2].method391(this.anInt225 - 12, this.anInt226 - 28);
							}
						}
					} else {
						local74 = 30;
						@Pc(77) Class1_Sub1_Sub1_Sub1_Sub1 local77 = (Class1_Sub1_Sub1_Sub1_Sub1) local17;
						if (local77.anInt138 != 0) {
							this.method165(local17.anInt1050 + 15, local17);
							if (this.anInt225 > -1) {
								for (local94 = 0; local94 < 8; local94++) {
									if ((local77.anInt138 & 0x1 << local94) != 0) {
										this.aClass1_Sub1_Sub2_Sub2Array7[local94].method391(this.anInt225 - 12, this.anInt226 - local74);
										local74 -= 25;
									}
								}
							}
						}
						if (local10 >= 0 && this.anInt362 == 10 && this.anInt385 == this.anIntArray34[local10]) {
							this.method165(local17.anInt1050 + 15, local17);
							if (this.anInt225 > -1) {
								this.aClass1_Sub1_Sub2_Sub2Array7[7].method391(this.anInt225 - 12, this.anInt226 - local74);
							}
						}
					}
					if (local17.aString31 != null && (local10 >= this.anInt232 || this.anInt246 == 0 || this.anInt246 == 3 || this.anInt246 == 1 && this.method182(((Class1_Sub1_Sub1_Sub1_Sub1) local17).aString3))) {
						this.method165(local17.anInt1050, local17);
						if (this.anInt225 > -1 && this.anInt264 < this.anInt265) {
							this.anIntArray49[this.anInt264] = this.aClass1_Sub1_Sub2_Sub4_3.method450(local17.aString31) / 2;
							this.anIntArray48[this.anInt264] = this.aClass1_Sub1_Sub2_Sub4_3.anInt732;
							this.anIntArray46[this.anInt264] = this.anInt225;
							this.anIntArray47[this.anInt264] = this.anInt226;
							this.anIntArray50[this.anInt264] = local17.anInt1021;
							this.anIntArray51[this.anInt264] = local17.anInt1022;
							this.anIntArray52[this.anInt264] = local17.anInt1020;
							this.aStringArray4[this.anInt264++] = local17.aString31;
							if (this.anInt393 == 0 && local17.anInt1022 >= 1 && local17.anInt1022 <= 3) {
								this.anIntArray48[this.anInt264] += 10;
								this.anIntArray47[this.anInt264] += 5;
							}
							if (this.anInt393 == 0 && local17.anInt1022 == 4) {
								this.anIntArray49[this.anInt264] = 60;
							}
							if (this.anInt393 == 0 && local17.anInt1022 == 5) {
								this.anIntArray48[this.anInt264] += 5;
							}
						}
					}
					if (local17.anInt1023 > anInt252) {
						this.method165(local17.anInt1050 + 15, local17);
						if (this.anInt225 > -1) {
							local74 = local17.anInt1024 * 30 / local17.anInt1025;
							if (local74 > 30) {
								local74 = 30;
							}
							Class1_Sub1_Sub2.method439(65280, this.anInt226 - 3, 5, this.anInt225 - 15, local74);
							Class1_Sub1_Sub2.method439(16711680, this.anInt226 - 3, 5, this.anInt225 + local74 - 15, 30 - local74);
						}
					}
					for (local74 = 0; local74 < 4; local74++) {
						if (local17.anIntArray271[local74] > anInt252) {
							this.method165(local17.anInt1050 / 2, local17);
							if (this.anInt225 > -1) {
								if (local74 == 1) {
									this.anInt226 -= 20;
								}
								if (local74 == 2) {
									this.anInt225 -= 15;
									this.anInt226 -= 10;
								}
								if (local74 == 3) {
									this.anInt225 += 15;
									this.anInt226 -= 10;
								}
								this.aClass1_Sub1_Sub2_Sub2Array6[local17.anIntArray270[local74]].method391(this.anInt225 - 12, this.anInt226 - 12);
								this.aClass1_Sub1_Sub2_Sub4_1.method447(String.valueOf(local17.anIntArray269[local74]), 0, this.anInt225, this.anInt226 + 4);
								this.aClass1_Sub1_Sub2_Sub4_1.method447(String.valueOf(local17.anIntArray269[local74]), 16777215, this.anInt225 - 1, this.anInt226 + 3);
							}
						}
					}
				}
			}
			for (@Pc(599) int local599 = 0; local599 < this.anInt264; local599++) {
				local74 = this.anIntArray46[local599];
				@Pc(611) int local611 = this.anIntArray47[local599];
				local94 = this.anIntArray49[local599];
				@Pc(621) int local621 = this.anIntArray48[local599];
				@Pc(623) boolean local623 = true;
				while (local623) {
					local623 = false;
					for (@Pc(629) int local629 = 0; local629 < local599; local629++) {
						if (local611 + 2 > this.anIntArray47[local629] - this.anIntArray48[local629] && local611 - local621 < this.anIntArray47[local629] + 2 && local74 - local94 < this.anIntArray46[local629] + this.anIntArray49[local629] && local74 + local94 > this.anIntArray46[local629] - this.anIntArray49[local629] && this.anIntArray47[local629] - this.anIntArray48[local629] < local611) {
							local611 = this.anIntArray47[local629] - this.anIntArray48[local629];
							local623 = true;
						}
					}
				}
				this.anInt225 = this.anIntArray46[local599];
				this.anInt226 = this.anIntArray47[local599] = local611;
				@Pc(728) String local728 = this.aStringArray4[local599];
				if (this.anInt393 == 0) {
					@Pc(733) int local733 = 16776960;
					if (this.anIntArray50[local599] < 6) {
						local733 = this.anIntArray77[this.anIntArray50[local599]];
					}
					if (this.anIntArray50[local599] == 6) {
						local733 = this.anInt321 % 20 < 10 ? 16711680 : 16776960;
					}
					if (this.anIntArray50[local599] == 7) {
						local733 = this.anInt321 % 20 < 10 ? 255 : 65535;
					}
					if (this.anIntArray50[local599] == 8) {
						local733 = this.anInt321 % 20 < 10 ? 45056 : 8454016;
					}
					@Pc(808) int local808;
					if (this.anIntArray50[local599] == 9) {
						local808 = 150 - this.anIntArray52[local599];
						if (local808 < 50) {
							local733 = local808 * 1280 + 16711680;
						} else if (local808 < 100) {
							local733 = 16776960 - (local808 - 50) * 327680;
						} else if (local808 < 150) {
							local733 = (local808 - 100) * 5 + 65280;
						}
					}
					if (this.anIntArray50[local599] == 10) {
						local808 = 150 - this.anIntArray52[local599];
						if (local808 < 50) {
							local733 = local808 * 5 + 16711680;
						} else if (local808 < 100) {
							local733 = 16711935 - (local808 - 50) * 327680;
						} else if (local808 < 150) {
							local733 = (local808 - 100) * 327680 + 255 - (local808 - 100) * 5;
						}
					}
					if (this.anIntArray50[local599] == 11) {
						local808 = 150 - this.anIntArray52[local599];
						if (local808 < 50) {
							local733 = 16777215 - local808 * 327685;
						} else if (local808 < 100) {
							local733 = (local808 - 50) * 327685 + 65280;
						} else if (local808 < 150) {
							local733 = 16777215 - (local808 - 100) * 327680;
						}
					}
					if (this.anIntArray51[local599] == 0) {
						this.aClass1_Sub1_Sub2_Sub4_3.method447(local728, 0, this.anInt225, this.anInt226 + 1);
						this.aClass1_Sub1_Sub2_Sub4_3.method447(local728, local733, this.anInt225, this.anInt226);
					}
					if (this.anIntArray51[local599] == 1) {
						this.aClass1_Sub1_Sub2_Sub4_3.method452(local728, this.anInt226 + 1, this.anInt225, this.anInt321, 0);
						this.aClass1_Sub1_Sub2_Sub4_3.method452(local728, this.anInt226, this.anInt225, this.anInt321, local733);
					}
					if (this.anIntArray51[local599] == 2) {
						this.aClass1_Sub1_Sub2_Sub4_3.method453(local728, 0, this.anInt321, this.anInt226 + 1, this.anInt225);
						this.aClass1_Sub1_Sub2_Sub4_3.method453(local728, local733, this.anInt321, this.anInt226, this.anInt225);
					}
					if (this.anIntArray51[local599] == 3) {
						this.aClass1_Sub1_Sub2_Sub4_3.method454(0, this.anInt225, local728, this.anInt226 + 1, this.anInt321, 150 - this.anIntArray52[local599]);
						this.aClass1_Sub1_Sub2_Sub4_3.method454(local733, this.anInt225, local728, this.anInt226, this.anInt321, 150 - this.anIntArray52[local599]);
					}
					@Pc(1105) int local1105;
					if (this.anIntArray51[local599] == 4) {
						local808 = this.aClass1_Sub1_Sub2_Sub4_3.method450(local728);
						local1105 = (150 - this.anIntArray52[local599]) * (local808 + 100) / 150;
						Class1_Sub1_Sub2.method436(334, 0, this.anInt225 + 50, this.anInt225 - 50);
						this.aClass1_Sub1_Sub2_Sub4_3.method451(this.anInt226 + 1, local728, 0, this.anInt225 + 50 - local1105);
						this.aClass1_Sub1_Sub2_Sub4_3.method451(this.anInt226, local728, local733, this.anInt225 + 50 - local1105);
						Class1_Sub1_Sub2.method435();
					}
					if (this.anIntArray51[local599] == 5) {
						local808 = 150 - this.anIntArray52[local599];
						local1105 = 0;
						if (local808 < 25) {
							local1105 = local808 - 25;
						} else if (local808 > 125) {
							local1105 = local808 - 125;
						}
						Class1_Sub1_Sub2.method436(this.anInt226 + 5, this.anInt226 - this.aClass1_Sub1_Sub2_Sub4_3.anInt732 - 1, 512, 0);
						this.aClass1_Sub1_Sub2_Sub4_3.method447(local728, 0, this.anInt225, this.anInt226 + local1105 + 1);
						this.aClass1_Sub1_Sub2_Sub4_3.method447(local728, local733, this.anInt225, this.anInt226 + local1105);
						Class1_Sub1_Sub2.method435();
					}
				} else {
					this.aClass1_Sub1_Sub2_Sub4_3.method447(local728, 0, this.anInt225, this.anInt226 + 1);
					this.aClass1_Sub1_Sub2_Sub4_3.method447(local728, 16776960, this.anInt225, this.anInt226);
				}
			}
		} catch (@Pc(1255) RuntimeException local1255) {
			signlink.reporterror("93106, " + arg0 + ", " + local1255.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IILclient!ib;I)V")
	private void method202(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class1_Sub1_Sub2_Sub2 arg2) {
		try {
			@Pc(7) int local7 = arg0 * arg0 + arg1 * arg1;
			if (local7 > 4225 && local7 < 90000) {
				@Pc(25) int local25 = this.anInt398 + this.anInt349 & 0x7FF;
				@Pc(29) int local29 = Class1_Sub1_Sub1_Sub5.anIntArray151[local25];
				@Pc(33) int local33 = Class1_Sub1_Sub1_Sub5.anIntArray152[local25];
				@Pc(42) int local42 = local29 * 256 / (this.anInt241 + 256);
				@Pc(51) int local51 = local33 * 256 / (this.anInt241 + 256);
				@Pc(61) int local61 = arg1 * local42 + arg0 * local51 >> 16;
				@Pc(71) int local71 = arg1 * local51 - arg0 * local42 >> 16;
				@Pc(77) double local77 = Math.atan2((double) local61, (double) local71);
				@Pc(83) int local83 = (int) (Math.sin(local77) * 63.0D);
				@Pc(89) int local89 = (int) (Math.cos(local77) * 57.0D);
				this.aClass1_Sub1_Sub2_Sub2_7.method396(local83 + 94 + 4 - 10, local77, 83 - local89 - 20);
			} else {
				this.method99(arg2, arg1, arg0);
			}
		} catch (@Pc(120) RuntimeException local120) {
			signlink.reporterror("28534, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 6 + ", " + local120.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IZLclient!lb;)V")
	private void method203(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub1_Sub3 arg1) {
		try {
			@Pc(7) int local7 = arg1.method491(8, this.aByte9);
			@Pc(13) int local13;
			if (local7 < this.anInt232) {
				for (local13 = local7; local13 < this.anInt232; local13++) {
					this.anIntArray54[this.anInt267++] = this.anIntArray34[local13];
				}
			}
			if (local7 > this.anInt232) {
				signlink.reporterror(this.aString6 + " Too many players");
				throw new RuntimeException("eek");
			}
			this.anInt232 = 0;
			for (local13 = 0; local13 < local7; local13++) {
				@Pc(69) int local69 = this.anIntArray34[local13];
				@Pc(74) Class1_Sub1_Sub1_Sub1_Sub1 local74 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local69];
				@Pc(80) int local80 = arg1.method491(1, this.aByte9);
				if (local80 == 0) {
					this.anIntArray34[this.anInt232++] = local69;
					local74.anInt1049 = anInt252;
				} else {
					@Pc(104) int local104 = arg1.method491(2, this.aByte9);
					if (local104 == 0) {
						this.anIntArray34[this.anInt232++] = local69;
						local74.anInt1049 = anInt252;
						this.anIntArray35[this.anInt233++] = local69;
					} else {
						@Pc(156) int local156;
						@Pc(167) int local167;
						if (local104 == 1) {
							this.anIntArray34[this.anInt232++] = local69;
							local74.anInt1049 = anInt252;
							local156 = arg1.method491(3, this.aByte9);
							local74.method678(false, local156);
							local167 = arg1.method491(1, this.aByte9);
							if (local167 == 1) {
								this.anIntArray35[this.anInt233++] = local69;
							}
						} else if (local104 == 2) {
							this.anIntArray34[this.anInt232++] = local69;
							local74.anInt1049 = anInt252;
							local156 = arg1.method491(3, this.aByte9);
							local74.method678(true, local156);
							local167 = arg1.method491(3, this.aByte9);
							local74.method678(true, local167);
							@Pc(228) int local228 = arg1.method491(1, this.aByte9);
							if (local228 == 1) {
								this.anIntArray35[this.anInt233++] = local69;
							}
						} else if (local104 == 3) {
							this.anIntArray54[this.anInt267++] = local69;
						}
					}
				}
			}
		} catch (@Pc(265) RuntimeException local265) {
			signlink.reporterror("7075, " + arg0 + ", " + true + ", " + arg1 + ", " + local265.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIII)Z")
	private boolean method204(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		try {
			@Pc(7) int local7 = arg0 >> 14 & 0x7FFF;
			@Pc(16) int local16 = this.aClass37_1.method560(this.anInt355, arg3, arg2, arg0);
			if (local16 == -1) {
				return false;
			}
			@Pc(25) int local25 = local16 & 0x1F;
			@Pc(31) int local31 = local16 >> 6 & 0x3;
			anInt294++;
			if (anInt294 > 1086) {
				anInt294 = 0;
				this.aClass1_Sub1_Sub3_4.method469(170);
				this.aClass1_Sub1_Sub3_4.method470(0);
				@Pc(53) int local53 = this.aClass1_Sub1_Sub3_4.anInt763;
				if ((int) (Math.random() * 2.0D) == 0) {
					this.aClass1_Sub1_Sub3_4.method471(16791);
				}
				this.aClass1_Sub1_Sub3_4.method470(254);
				this.aClass1_Sub1_Sub3_4.method471((int) (Math.random() * 65536.0D));
				this.aClass1_Sub1_Sub3_4.method471(16128);
				this.aClass1_Sub1_Sub3_4.method471(52610);
				this.aClass1_Sub1_Sub3_4.method471((int) (Math.random() * 65536.0D));
				this.aClass1_Sub1_Sub3_4.method471(55420);
				if ((int) (Math.random() * 2.0D) == 0) {
					this.aClass1_Sub1_Sub3_4.method471(35025);
				}
				this.aClass1_Sub1_Sub3_4.method471(46628);
				this.aClass1_Sub1_Sub3_4.method470((int) (Math.random() * 256.0D));
				this.aClass1_Sub1_Sub3_4.method479(this.aClass1_Sub1_Sub3_4.anInt763 - local53);
			}
			if (local25 == 10 || local25 == 11 || local25 == 22) {
				@Pc(133) Class9 local133 = Class9.method288(local7);
				@Pc(141) int local141;
				@Pc(144) int local144;
				if (local31 == 0 || local31 == 2) {
					local141 = local133.anInt519;
					local144 = local133.anInt520;
				} else {
					local141 = local133.anInt520;
					local144 = local133.anInt519;
				}
				@Pc(155) int local155 = local133.anInt531;
				if (local31 != 0) {
					local155 = (local155 << local31 & 0xF) + (local155 >> 4 - local31);
				}
				this.method184(arg2, arg3, aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray272[0], 0, local144, 0, local155, 2, local141, false, aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray273[0]);
			} else {
				this.method184(arg2, arg3, aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray272[0], local25 + 1, 0, local31, 0, 2, 0, false, aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray273[0]);
			}
			this.anInt344 = super.anInt214;
			this.anInt345 = super.anInt215;
			this.anInt347 = 2;
			this.anInt346 = 0;
			this.aClass1_Sub1_Sub3_4.method469(arg1);
			this.aClass1_Sub1_Sub3_4.method471(arg3 + this.anInt302);
			this.aClass1_Sub1_Sub3_4.method471(arg2 + this.anInt303);
			this.aClass1_Sub1_Sub3_4.method471(local7);
			return true;
		} catch (@Pc(262) RuntimeException local262) {
			signlink.reporterror("70451, " + arg0 + ", " + 0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local262.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "r", descriptor = "(Z)V")
	private void method205() {
		try {
			if (this.anInt388 == 2) {
				for (@Pc(13) Class1_Sub2 local13 = (Class1_Sub2) this.aClass29_3.method511(); local13 != null; local13 = (Class1_Sub2) this.aClass29_3.method513()) {
					if (local13.anInt812 > 0) {
						local13.anInt812--;
					}
					if (local13.anInt812 != 0) {
						if (local13.anInt811 > 0) {
							local13.anInt811--;
						}
						if (local13.anInt811 == 0 && local13.anInt803 >= 1 && local13.anInt804 >= 1 && local13.anInt803 <= 102 && local13.anInt804 <= 102 && (local13.anInt808 < 0 || Class4.method72(local13.anInt810, local13.anInt808))) {
							this.method127(local13.anInt802, local13.anInt810, local13.anInt808, local13.anInt801, local13.anInt803, local13.anInt809, local13.anInt804);
							local13.anInt811 = -1;
							if (local13.anInt808 == local13.anInt805 && local13.anInt805 == -1) {
								local13.method673();
							} else if (local13.anInt808 == local13.anInt805 && local13.anInt809 == local13.anInt806 && local13.anInt810 == local13.anInt807) {
								local13.method673();
							}
						}
					} else if (local13.anInt805 < 0 || Class4.method72(local13.anInt807, local13.anInt805)) {
						this.method127(local13.anInt802, local13.anInt807, local13.anInt805, local13.anInt801, local13.anInt803, local13.anInt806, local13.anInt804);
						local13.method673();
					}
				}
			}
		} catch (@Pc(156) RuntimeException local156) {
			signlink.reporterror("28238, " + true + ", " + local156.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "s", descriptor = "(Z)V")
	private void method206() {
		try {
			this.anInt321++;
			this.method155(true);
			this.method185(true);
			this.method155(false);
			this.method185(false);
			this.method123();
			this.method158();
			@Pc(35) int local35;
			@Pc(74) int local74;
			if (!this.aBoolean51) {
				local35 = this.anInt397;
				if (this.anInt416 / 256 > local35) {
					local35 = this.anInt416 / 256;
				}
				if (this.aBooleanArray4[4] && this.anIntArray82[4] + 128 > local35) {
					local35 = this.anIntArray82[4] + 128;
				}
				local74 = this.anInt398 + this.anInt360 & 0x7FF;
				this.method118(this.method200(aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt1009, this.anInt355, aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt1010) - 50, local35 * 3 + 600, local35, local74, this.anInt364, this.anInt363);
			}
			if (this.aBoolean51) {
				local35 = this.method213();
			} else {
				local35 = this.method212();
			}
			local74 = this.anInt274;
			@Pc(118) int local118 = this.anInt275;
			@Pc(121) int local121 = this.anInt276;
			@Pc(124) int local124 = this.anInt277;
			@Pc(127) int local127 = this.anInt278;
			@Pc(176) int local176;
			for (@Pc(129) int local129 = 0; local129 < 5; local129++) {
				if (this.aBooleanArray4[local129]) {
					local176 = (int) (Math.random() * (double) (this.anIntArray76[local129] * 2 + 1) - (double) this.anIntArray76[local129] + Math.sin((double) this.anIntArray75[local129] * ((double) this.anIntArray58[local129] / 100.0D)) * (double) this.anIntArray82[local129]);
					if (local129 == 0) {
						this.anInt274 += local176;
					}
					if (local129 == 1) {
						this.anInt275 += local176;
					}
					if (local129 == 2) {
						this.anInt276 += local176;
					}
					if (local129 == 3) {
						this.anInt278 = this.anInt278 + local176 & 0x7FF;
					}
					if (local129 == 4) {
						this.anInt277 += local176;
						if (this.anInt277 < 128) {
							this.anInt277 = 128;
						}
						if (this.anInt277 > 383) {
							this.anInt277 = 383;
						}
					}
				}
			}
			local176 = Class1_Sub1_Sub2_Sub1.anInt615;
			Class1_Sub1_Sub1_Sub5.aBoolean124 = true;
			Class1_Sub1_Sub1_Sub5.anInt513 = 0;
			Class1_Sub1_Sub1_Sub5.anInt511 = super.anInt208 - 4;
			Class1_Sub1_Sub1_Sub5.anInt512 = super.anInt209 - 4;
			Class1_Sub1_Sub2.method437();
			this.aClass37_1.method569(this.anInt275, this.anInt277, this.anInt276, this.anInt278, this.anInt274, local35);
			this.aClass37_1.method544();
			this.method201(164);
			this.method190();
			this.method220(local176);
			this.method217();
			this.aClass35_14.method525(4, 4, super.aGraphics2, this.anInt293);
			this.anInt274 = local74;
			this.anInt275 = local118;
			this.anInt276 = local121;
			this.anInt277 = local124;
			this.anInt278 = local127;
		} catch (@Pc(319) RuntimeException local319) {
			signlink.reporterror("62952, " + false + ", " + local319.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(BIIIII)V")
	private void method207(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		try {
			@Pc(8) int local8 = this.aClass37_1.method556(arg3, arg0, arg4);
			if (this.aByte16 != 1) {
				this.aBoolean90 = !this.aBoolean90;
			}
			@Pc(30) int local30;
			@Pc(36) int local36;
			@Pc(40) int local40;
			@Pc(42) int local42;
			@Pc(64) int local64;
			@Pc(70) int local70;
			if (local8 != 0) {
				local30 = this.aClass37_1.method560(arg3, arg0, arg4, local8);
				local36 = local30 >> 6 & 0x3;
				local40 = local30 & 0x1F;
				local42 = arg2;
				if (local8 > 0) {
					local42 = arg1;
				}
				@Pc(50) int[] local50 = this.aClass1_Sub1_Sub2_Sub2_3.anIntArray208;
				local64 = arg0 * 4 + (103 - arg4) * 512 * 4 + 24624;
				local70 = local8 >> 14 & 0x7FFF;
				@Pc(73) Class9 local73 = Class9.method288(local70);
				if (local73.anInt524 == -1) {
					if (local40 == 0 || local40 == 2) {
						if (local36 == 0) {
							local50[local64] = local42;
							local50[local64 + 512] = local42;
							local50[local64 + 1024] = local42;
							local50[local64 + 1536] = local42;
						} else if (local36 == 1) {
							local50[local64] = local42;
							local50[local64 + 1] = local42;
							local50[local64 + 2] = local42;
							local50[local64 + 3] = local42;
						} else if (local36 == 2) {
							local50[local64 + 3] = local42;
							local50[local64 + 3 + 512] = local42;
							local50[local64 + 3 + 1024] = local42;
							local50[local64 + 3 + 1536] = local42;
						} else if (local36 == 3) {
							local50[local64 + 1536] = local42;
							local50[local64 + 1536 + 1] = local42;
							local50[local64 + 1536 + 2] = local42;
							local50[local64 + 1536 + 3] = local42;
						}
					}
					if (local40 == 3) {
						if (local36 == 0) {
							local50[local64] = local42;
						} else if (local36 == 1) {
							local50[local64 + 3] = local42;
						} else if (local36 == 2) {
							local50[local64 + 3 + 1536] = local42;
						} else if (local36 == 3) {
							local50[local64 + 1536] = local42;
						}
					}
					if (local40 == 2) {
						if (local36 == 3) {
							local50[local64] = local42;
							local50[local64 + 512] = local42;
							local50[local64 + 1024] = local42;
							local50[local64 + 1536] = local42;
						} else if (local36 == 0) {
							local50[local64] = local42;
							local50[local64 + 1] = local42;
							local50[local64 + 2] = local42;
							local50[local64 + 3] = local42;
						} else if (local36 == 1) {
							local50[local64 + 3] = local42;
							local50[local64 + 3 + 512] = local42;
							local50[local64 + 3 + 1024] = local42;
							local50[local64 + 3 + 1536] = local42;
						} else if (local36 == 2) {
							local50[local64 + 1536] = local42;
							local50[local64 + 1536 + 1] = local42;
							local50[local64 + 1536 + 2] = local42;
							local50[local64 + 1536 + 3] = local42;
						}
					}
				} else {
					@Pc(83) Class1_Sub1_Sub2_Sub3 local83 = this.aClass1_Sub1_Sub2_Sub3Array3[local73.anInt524];
					if (local83 != null) {
						@Pc(95) int local95 = (local73.anInt519 * 4 - local83.anInt695) / 2;
						@Pc(105) int local105 = (local73.anInt520 * 4 - local83.anInt696) / 2;
						local83.method418(arg0 * 4 + local95 + 48, (104 - arg4 - local73.anInt520) * 4 + 48 + local105);
					}
				}
			}
			local8 = this.aClass37_1.method558(arg3, arg0, arg4);
			if (local8 != 0) {
				local30 = this.aClass37_1.method560(arg3, arg0, arg4, local8);
				local36 = local30 >> 6 & 0x3;
				local40 = local30 & 0x1F;
				local42 = local8 >> 14 & 0x7FFF;
				@Pc(459) Class9 local459 = Class9.method288(local42);
				@Pc(491) int local491;
				if (local459.anInt524 != -1) {
					@Pc(469) Class1_Sub1_Sub2_Sub3 local469 = this.aClass1_Sub1_Sub2_Sub3Array3[local459.anInt524];
					if (local469 != null) {
						local70 = (local459.anInt519 * 4 - local469.anInt695) / 2;
						local491 = (local459.anInt520 * 4 - local469.anInt696) / 2;
						local469.method418(arg0 * 4 + local70 + 48, (104 - arg4 - local459.anInt520) * 4 + 48 + local491);
					}
				} else if (local40 == 9) {
					local64 = 15658734;
					if (local8 > 0) {
						local64 = 15597568;
					}
					@Pc(528) int[] local528 = this.aClass1_Sub1_Sub2_Sub2_3.anIntArray208;
					local491 = arg0 * 4 + (103 - arg4) * 512 * 4 + 24624;
					if (local36 == 0 || local36 == 2) {
						local528[local491 + 1536] = local64;
						local528[local491 + 1024 + 1] = local64;
						local528[local491 + 512 + 2] = local64;
						local528[local491 + 3] = local64;
					} else {
						local528[local491] = local64;
						local528[local491 + 512 + 1] = local64;
						local528[local491 + 1024 + 2] = local64;
						local528[local491 + 1536 + 3] = local64;
					}
				}
			}
			local8 = this.aClass37_1.method559(arg3, arg0, arg4);
			if (local8 != 0) {
				local30 = local8 >> 14 & 0x7FFF;
				@Pc(623) Class9 local623 = Class9.method288(local30);
				if (local623.anInt524 != -1) {
					@Pc(633) Class1_Sub1_Sub2_Sub3 local633 = this.aClass1_Sub1_Sub2_Sub3Array3[local623.anInt524];
					if (local633 != null) {
						local42 = (local623.anInt519 * 4 - local633.anInt695) / 2;
						@Pc(655) int local655 = (local623.anInt520 * 4 - local633.anInt696) / 2;
						local633.method418(arg0 * 4 + local42 + 48, (104 - arg4 - local623.anInt520) * 4 + 48 + local655);
						return;
					}
				}
			}
		} catch (@Pc(679) RuntimeException local679) {
			signlink.reporterror("79672, " + 1 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local679.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "A", descriptor = "(I)V")
	private void method208() {
		try {
			for (@Pc(11) Class1_Sub2 local11 = (Class1_Sub2) this.aClass29_3.method511(); local11 != null; local11 = (Class1_Sub2) this.aClass29_3.method513()) {
				if (local11.anInt812 == -1) {
					local11.anInt811 = 0;
					this.method193(local11);
				} else {
					local11.method673();
				}
			}
		} catch (@Pc(38) RuntimeException local38) {
			signlink.reporterror("94544, " + 43 + ", " + local38.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "t", descriptor = "(Z)V")
	private void method209() {
		try {
			for (@Pc(3) int local3 = 0; local3 < this.anInt407; local3++) {
				if (this.anIntArray41[local3] <= 0) {
					@Pc(12) boolean local12 = false;
					try {
						if (this.anIntArray38[local3] != this.anInt342 || this.anIntArray85[local3] != this.anInt403) {
							@Pc(45) Class1_Sub1_Sub3 local45 = Class5.method79((byte) 2, this.anIntArray85[local3], this.anIntArray38[local3]);
							if (System.currentTimeMillis() + (long) (local45.anInt763 / 22) > this.aLong14 + (long) (this.anInt228 / 22)) {
								this.anInt228 = local45.anInt763;
								this.aLong14 = System.currentTimeMillis();
								if (this.method218(this.aByte12, local45.anInt763, local45.aByteArray9)) {
									this.anInt342 = this.anIntArray38[local3];
									this.anInt403 = this.anIntArray85[local3];
								} else {
									local12 = true;
								}
							}
						} else if (!this.method226()) {
							local12 = true;
						}
					} catch (@Pc(96) Exception local96) {
					}
					if (local12 && this.anIntArray41[local3] != -5) {
						this.anIntArray41[local3] = -5;
					} else {
						this.anInt407--;
						for (@Pc(112) int local112 = local3; local112 < this.anInt407; local112++) {
							this.anIntArray38[local112] = this.anIntArray38[local112 + 1];
							this.anIntArray85[local112] = this.anIntArray85[local112 + 1];
							this.anIntArray41[local112] = this.anIntArray41[local112 + 1];
						}
						local3--;
					}
				} else {
					@Pc(164) int local164 = this.anIntArray41[local3]--;
				}
			}
			if (this.anInt301 > 0) {
				this.anInt301 -= 20;
				if (this.anInt301 < 0) {
					this.anInt301 = 0;
				}
				if (this.anInt301 == 0 && this.aBoolean53 && !aBoolean77) {
					this.anInt260 = this.anInt229;
					this.aBoolean61 = true;
					this.aClass44_Sub1_1.method645(2, this.anInt260);
					return;
				}
			}
		} catch (@Pc(213) RuntimeException local213) {
			signlink.reporterror("15394, " + true + ", " + local213.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILclient!d;BIIII)V")
	private void method210(@OriginalArg(0) int arg0, @OriginalArg(1) Class6 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		try {
			if (arg1.anInt433 == 0 && arg1.anIntArray98 != null && !arg1.aBoolean99 && (arg4 >= arg3 && arg5 >= arg2 && arg4 <= arg3 + arg1.anInt436 && arg5 <= arg2 + arg1.anInt437)) {
				@Pc(34) int local34 = arg1.anIntArray98.length;
				for (@Pc(47) int local47 = 0; local47 < local34; local47++) {
					@Pc(56) int local56 = arg1.anIntArray99[local47] + arg3;
					@Pc(65) int local65 = arg1.anIntArray100[local47] + arg2 - arg0;
					@Pc(72) Class6 local72 = Class6.aClass6Array1[arg1.anIntArray98[local47]];
					@Pc(77) int local77 = local56 + local72.anInt438;
					@Pc(82) int local82 = local65 + local72.anInt439;
					if ((local72.anInt440 >= 0 || local72.anInt448 != 0) && arg4 >= local77 && arg5 >= local82 && arg4 < local77 + local72.anInt436 && arg5 < local82 + local72.anInt437) {
						if (local72.anInt440 >= 0) {
							this.anInt401 = local72.anInt440;
						} else {
							this.anInt401 = local72.anInt431;
						}
					}
					if (local72.anInt433 == 0) {
						this.method210(local72.anInt442, local72, local82, local77, arg4, arg5);
						if (local72.anInt441 > local72.anInt437) {
							this.method135(local82, true, local72.anInt437, local72, (byte) 8, arg5, local72.anInt441, arg4, local77 + local72.anInt436);
						}
					} else {
						if (local72.anInt434 == 1 && arg4 >= local77 && arg5 >= local82 && arg4 < local77 + local72.anInt436 && arg5 < local82 + local72.anInt437) {
							@Pc(179) boolean local179 = false;
							if (local72.anInt435 != 0) {
								local179 = this.method157(local72);
							}
							if (!local179) {
								this.aStringArray6[this.anInt329] = local72.aString22;
								this.anIntArray62[this.anInt329] = 231;
								this.anIntArray61[this.anInt329] = local72.anInt431;
								this.anInt329++;
							}
						}
						if (local72.anInt434 == 2 && this.anInt326 == 0 && arg4 >= local77 && arg5 >= local82 && arg4 < local77 + local72.anInt436 && arg5 < local82 + local72.anInt437) {
							@Pc(243) String local243 = local72.aString20;
							if (local243.indexOf(" ") != -1) {
								local243 = local243.substring(0, local243.indexOf(" "));
							}
							this.aStringArray6[this.anInt329] = local243 + " @gre@" + local72.aString21;
							this.anIntArray62[this.anInt329] = 274;
							this.anIntArray61[this.anInt329] = local72.anInt431;
							this.anInt329++;
						}
						if (local72.anInt434 == 3 && arg4 >= local77 && arg5 >= local82 && arg4 < local77 + local72.anInt436 && arg5 < local82 + local72.anInt437) {
							this.aStringArray6[this.anInt329] = "Close";
							this.anIntArray62[this.anInt329] = 737;
							this.anIntArray61[this.anInt329] = local72.anInt431;
							this.anInt329++;
						}
						if (local72.anInt434 == 4 && arg4 >= local77 && arg5 >= local82 && arg4 < local77 + local72.anInt436 && arg5 < local82 + local72.anInt437) {
							this.aStringArray6[this.anInt329] = local72.aString22;
							this.anIntArray62[this.anInt329] = 435;
							this.anIntArray61[this.anInt329] = local72.anInt431;
							this.anInt329++;
						}
						if (local72.anInt434 == 5 && arg4 >= local77 && arg5 >= local82 && arg4 < local77 + local72.anInt436 && arg5 < local82 + local72.anInt437) {
							this.aStringArray6[this.anInt329] = local72.aString22;
							this.anIntArray62[this.anInt329] = 225;
							this.anIntArray61[this.anInt329] = local72.anInt431;
							this.anInt329++;
						}
						if (local72.anInt434 == 6 && !this.aBoolean92 && arg4 >= local77 && arg5 >= local82 && arg4 < local77 + local72.anInt436 && arg5 < local82 + local72.anInt437) {
							this.aStringArray6[this.anInt329] = local72.aString22;
							this.anIntArray62[this.anInt329] = 997;
							this.anIntArray61[this.anInt329] = local72.anInt431;
							this.anInt329++;
						}
						if (local72.anInt433 == 2) {
							@Pc(491) int local491 = 0;
							for (@Pc(493) int local493 = 0; local493 < local72.anInt437; local493++) {
								for (@Pc(497) int local497 = 0; local497 < local72.anInt436; local497++) {
									@Pc(508) int local508 = local77 + local497 * (local72.anInt444 + 32);
									@Pc(517) int local517 = local82 + local493 * (local72.anInt445 + 32);
									if (local491 < 20) {
										local508 += local72.anIntArray101[local491];
										local517 += local72.anIntArray102[local491];
									}
									if (arg4 >= local508 && arg5 >= local517 && arg4 < local508 + 32 && arg5 < local517 + 32) {
										this.anInt254 = local491;
										this.anInt255 = local72.anInt431;
										if (local72.anIntArray94[local491] > 0) {
											@Pc(570) Class15 local570 = Class15.method361(local72.anIntArray94[local491] - 1);
											if (this.anInt297 == 1 && local72.aBoolean102) {
												if (local72.anInt431 != this.anInt299 || local491 != this.anInt298) {
													this.aStringArray6[this.anInt329] = "Use " + this.aString12 + " with @lre@" + local570.aString25;
													this.anIntArray62[this.anInt329] = 398;
													this.anIntArray63[this.anInt329] = local570.anInt619;
													this.anIntArray60[this.anInt329] = local491;
													this.anIntArray61[this.anInt329] = local72.anInt431;
													this.anInt329++;
												}
											} else if (this.anInt326 != 1 || !local72.aBoolean102) {
												@Pc(707) int local707;
												if (local72.aBoolean102) {
													for (local707 = 4; local707 >= 3; local707--) {
														if (local570.aStringArray11 != null && local570.aStringArray11[local707] != null) {
															this.aStringArray6[this.anInt329] = local570.aStringArray11[local707] + " @lre@" + local570.aString25;
															if (local707 == 3) {
																this.anIntArray62[this.anInt329] = 681;
															}
															if (local707 == 4) {
																this.anIntArray62[this.anInt329] = 100;
															}
															this.anIntArray63[this.anInt329] = local570.anInt619;
															this.anIntArray60[this.anInt329] = local491;
															this.anIntArray61[this.anInt329] = local72.anInt431;
															this.anInt329++;
														} else if (local707 == 4) {
															this.aStringArray6[this.anInt329] = "Drop @lre@" + local570.aString25;
															this.anIntArray62[this.anInt329] = 100;
															this.anIntArray63[this.anInt329] = local570.anInt619;
															this.anIntArray60[this.anInt329] = local491;
															this.anIntArray61[this.anInt329] = local72.anInt431;
															this.anInt329++;
														}
													}
												}
												if (local72.aBoolean103) {
													this.aStringArray6[this.anInt329] = "Use @lre@" + local570.aString25;
													this.anIntArray62[this.anInt329] = 102;
													this.anIntArray63[this.anInt329] = local570.anInt619;
													this.anIntArray60[this.anInt329] = local491;
													this.anIntArray61[this.anInt329] = local72.anInt431;
													this.anInt329++;
												}
												if (local72.aBoolean102 && local570.aStringArray11 != null) {
													for (local707 = 2; local707 >= 0; local707--) {
														if (local570.aStringArray11[local707] != null) {
															this.aStringArray6[this.anInt329] = local570.aStringArray11[local707] + " @lre@" + local570.aString25;
															if (local707 == 0) {
																this.anIntArray62[this.anInt329] = 694;
															}
															if (local707 == 1) {
																this.anIntArray62[this.anInt329] = 962;
															}
															if (local707 == 2) {
																this.anIntArray62[this.anInt329] = 795;
															}
															this.anIntArray63[this.anInt329] = local570.anInt619;
															this.anIntArray60[this.anInt329] = local491;
															this.anIntArray61[this.anInt329] = local72.anInt431;
															this.anInt329++;
														}
													}
												}
												if (local72.aStringArray7 != null) {
													for (local707 = 4; local707 >= 0; local707--) {
														if (local72.aStringArray7[local707] != null) {
															this.aStringArray6[this.anInt329] = local72.aStringArray7[local707] + " @lre@" + local570.aString25;
															if (local707 == 0) {
																this.anIntArray62[this.anInt329] = 582;
															}
															if (local707 == 1) {
																this.anIntArray62[this.anInt329] = 113;
															}
															if (local707 == 2) {
																this.anIntArray62[this.anInt329] = 555;
															}
															if (local707 == 3) {
																this.anIntArray62[this.anInt329] = 331;
															}
															if (local707 == 4) {
																this.anIntArray62[this.anInt329] = 354;
															}
															this.anIntArray63[this.anInt329] = local570.anInt619;
															this.anIntArray60[this.anInt329] = local491;
															this.anIntArray61[this.anInt329] = local72.anInt431;
															this.anInt329++;
														}
													}
												}
												this.aStringArray6[this.anInt329] = "Examine @lre@" + local570.aString25;
												this.anIntArray62[this.anInt329] = 1328;
												this.anIntArray63[this.anInt329] = local570.anInt619;
												this.anIntArray60[this.anInt329] = local491;
												this.anIntArray61[this.anInt329] = local72.anInt431;
												this.anInt329++;
											} else if ((this.anInt328 & 0x10) == 16) {
												this.aStringArray6[this.anInt329] = this.aString13 + " @lre@" + local570.aString25;
												this.anIntArray62[this.anInt329] = 563;
												this.anIntArray63[this.anInt329] = local570.anInt619;
												this.anIntArray60[this.anInt329] = local491;
												this.anIntArray61[this.anInt329] = local72.anInt431;
												this.anInt329++;
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
			signlink.reporterror("85490, " + arg0 + ", " + arg1 + ", " + 0 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local1137.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "B", descriptor = "(I)V")
	private void method211(@OriginalArg(0) int arg0) {
		try {
			@Pc(2) int local2 = this.anInt371;
			@Pc(5) int local5 = this.anInt372;
			@Pc(8) int local8 = this.anInt373;
			@Pc(11) int local11 = this.anInt374;
			Class1_Sub1_Sub2.method439(6116423, local5, local11, local2, local8);
			Class1_Sub1_Sub2.method439(0, local5 + 1, 16, local2 + 1, local8 - 2);
			Class1_Sub1_Sub2.method440(0, local8 - 2, local11 - 19, local2 + 1, local5 + 18);
			this.aClass1_Sub1_Sub2_Sub4_3.method451(local5 + 14, "Choose Option", 6116423, local2 + 3);
			@Pc(63) int local63 = super.anInt208;
			@Pc(66) int local66 = super.anInt209;
			if (this.anInt370 == 0) {
				local63 -= 4;
				local66 -= 4;
			}
			if (this.anInt370 == 1) {
				local63 -= 553;
				local66 -= 205;
			}
			if (this.anInt370 == 2) {
				local63 -= 17;
				local66 -= 357;
			}
			for (@Pc(85) int local85 = 0; local85 < this.anInt329; local85++) {
				@Pc(100) int local100 = local5 + (this.anInt329 - 1 - local85) * 15 + 31;
				@Pc(102) int local102 = 16777215;
				if (local63 > local2 && local63 < local2 + local8 && local66 > local100 - 13 && local66 < local100 + 3) {
					local102 = 16776960;
				}
				this.aClass1_Sub1_Sub2_Sub4_3.method455(this.aStringArray6[local85], local102, local100, true, local2 + 3);
			}
			@Pc(145) boolean local145 = false;
		} catch (@Pc(147) RuntimeException local147) {
			signlink.reporterror("32313, " + arg0 + ", " + local147.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "C", descriptor = "(I)I")
	private int method212() {
		try {
			this.anInt314 += 0;
			@Pc(9) int local9 = 3;
			if (this.anInt277 < 310) {
				@Pc(18) int local18 = this.anInt274 >> 7;
				@Pc(23) int local23 = this.anInt276 >> 7;
				@Pc(28) int local28 = aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt1009 >> 7;
				@Pc(33) int local33 = aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt1010 >> 7;
				if ((this.aByteArrayArrayArray7[this.anInt355][local18][local23] & 0x4) != 0) {
					local9 = this.anInt355;
				}
				@Pc(55) int local55;
				if (local28 > local18) {
					local55 = local28 - local18;
				} else {
					local55 = local18 - local28;
				}
				@Pc(68) int local68;
				if (local33 > local23) {
					local68 = local33 - local23;
				} else {
					local68 = local23 - local33;
				}
				@Pc(83) int local83;
				@Pc(85) int local85;
				if (local55 > local68) {
					local83 = local68 * 65536 / local55;
					local85 = 32768;
					while (local18 != local28) {
						if (local18 < local28) {
							local18++;
						} else if (local18 > local28) {
							local18--;
						}
						if ((this.aByteArrayArrayArray7[this.anInt355][local18][local23] & 0x4) != 0) {
							local9 = this.anInt355;
						}
						local85 += local83;
						if (local85 >= 65536) {
							local85 -= 65536;
							if (local23 < local33) {
								local23++;
							} else if (local23 > local33) {
								local23--;
							}
							if ((this.aByteArrayArrayArray7[this.anInt355][local18][local23] & 0x4) != 0) {
								local9 = this.anInt355;
							}
						}
					}
				} else {
					local83 = local55 * 65536 / local68;
					local85 = 32768;
					while (local23 != local33) {
						if (local23 < local33) {
							local23++;
						} else if (local23 > local33) {
							local23--;
						}
						if ((this.aByteArrayArrayArray7[this.anInt355][local18][local23] & 0x4) != 0) {
							local9 = this.anInt355;
						}
						local85 += local83;
						if (local85 >= 65536) {
							local85 -= 65536;
							if (local18 < local28) {
								local18++;
							} else if (local18 > local28) {
								local18--;
							}
							if ((this.aByteArrayArrayArray7[this.anInt355][local18][local23] & 0x4) != 0) {
								local9 = this.anInt355;
							}
						}
					}
				}
			}
			if ((this.aByteArrayArrayArray7[this.anInt355][aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt1009 >> 7][aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt1010 >> 7] & 0x4) != 0) {
				local9 = this.anInt355;
			}
			return local9;
		} catch (@Pc(251) RuntimeException local251) {
			signlink.reporterror("69709, " + 0 + ", " + local251.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "D", descriptor = "(I)I")
	private int method213() {
		try {
			this.anInt314 += 0;
			@Pc(15) int local15 = this.method200(this.anInt274, this.anInt355, this.anInt276);
			return local15 - this.anInt275 >= 800 || (this.aByteArrayArrayArray7[this.anInt355][this.anInt274 >> 7][this.anInt276 >> 7] & 0x4) == 0 ? 3 : this.anInt355;
		} catch (@Pc(45) RuntimeException local45) {
			signlink.reporterror("38888, " + 0 + ", " + local45.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "j", descriptor = "(B)V")
	private void method214() {
		try {
			if (this.aByte11 != 16) {
				this.aBoolean85 = !this.aBoolean85;
			}
			@Pc(23) int local23;
			@Pc(30) int local30;
			if (this.anInt320 == 0) {
				local23 = super.anInt204 / 2 - 80;
				local30 = super.anInt205 / 2 + 20;
				@Pc(31) int local31 = local30 + 20;
				if (super.anInt213 == 1 && super.anInt214 >= local23 - 75 && super.anInt214 <= local23 + 75 && super.anInt215 >= local31 - 20 && super.anInt215 <= local31 + 20) {
					this.anInt320 = 3;
					this.anInt404 = 0;
				}
				local23 = super.anInt204 / 2 + 80;
				if (super.anInt213 == 1 && super.anInt214 >= local23 - 75 && super.anInt214 <= local23 + 75 && super.anInt215 >= local31 - 20 && super.anInt215 <= local31 + 20) {
					this.aString16 = "";
					this.aString17 = "Enter your username & password.";
					this.anInt320 = 2;
					this.anInt404 = 0;
					return;
				}
			} else {
				if (this.anInt320 == 2) {
					local23 = super.anInt205 / 2 - 40;
					local23 += 30;
					local23 += 25;
					if (super.anInt213 == 1 && super.anInt215 >= local23 - 15 && super.anInt215 < local23) {
						this.anInt404 = 0;
					}
					local23 += 15;
					if (super.anInt213 == 1 && super.anInt215 >= local23 - 15 && super.anInt215 < local23) {
						this.anInt404 = 1;
					}
					local23 += 15;
					local30 = super.anInt204 / 2 - 80;
					@Pc(176) int local176 = super.anInt205 / 2 + 50;
					@Pc(177) int local177 = local176 + 20;
					if (super.anInt213 == 1 && super.anInt214 >= local30 - 75 && super.anInt214 <= local30 + 75 && super.anInt215 >= local177 - 20 && super.anInt215 <= local177 + 20) {
						this.anInt249 = 0;
						this.method156(this.aString6, this.aString7, false);
						if (this.aBoolean71) {
							return;
						}
					}
					local30 = super.anInt204 / 2 + 80;
					if (super.anInt213 == 1 && super.anInt214 >= local30 - 75 && super.anInt214 <= local30 + 75 && super.anInt215 >= local177 - 20 && super.anInt215 <= local177 + 20) {
						this.anInt320 = 0;
						this.aString6 = "";
						this.aString7 = "";
					}
					while (true) {
						while (true) {
							@Pc(267) int local267 = this.method88();
							if (local267 == -1) {
								return;
							}
							@Pc(272) boolean local272 = false;
							for (@Pc(274) int local274 = 0; local274 < aString15.length(); local274++) {
								if (local267 == aString15.charAt(local274)) {
									local272 = true;
									break;
								}
							}
							if (this.anInt404 == 0) {
								if (local267 == 8 && this.aString6.length() > 0) {
									this.aString6 = this.aString6.substring(0, this.aString6.length() - 1);
								}
								if (local267 == 9 || local267 == 10 || local267 == 13) {
									this.anInt404 = 1;
								}
								if (local272) {
									this.aString6 = this.aString6 + (char) local267;
								}
								if (this.aString6.length() > 12) {
									this.aString6 = this.aString6.substring(0, 12);
								}
							} else if (this.anInt404 == 1) {
								if (local267 == 8 && this.aString7.length() > 0) {
									this.aString7 = this.aString7.substring(0, this.aString7.length() - 1);
								}
								if (local267 == 9 || local267 == 10 || local267 == 13) {
									this.anInt404 = 0;
								}
								if (local272) {
									this.aString7 = this.aString7 + (char) local267;
								}
								if (this.aString7.length() > 20) {
									this.aString7 = this.aString7.substring(0, 20);
								}
							}
						}
					}
				}
				if (this.anInt320 != 3) {
					return;
				}
				local23 = super.anInt204 / 2;
				local30 = super.anInt205 / 2 + 50;
				local30 += 20;
				if (super.anInt213 != 1 || super.anInt214 < local23 - 75 || super.anInt214 > local23 + 75 || super.anInt215 < local30 - 20 || super.anInt215 > local30 + 20) {
					return;
				}
				this.anInt320 = 0;
			}
		} catch (@Pc(464) RuntimeException local464) {
			signlink.reporterror("80997, " + 16 + ", " + local464.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "k", descriptor = "(B)V")
	private void method216(@OriginalArg(0) byte arg0) {
		try {
			@Pc(6) boolean local6 = false;
			@Pc(22) int local22 = this.anInt288 * 128 + 64;
			@Pc(29) int local29 = this.anInt289 * 128 + 64;
			@Pc(40) int local40 = this.method200(local22, this.anInt355, local29) - this.anInt290;
			if (this.anInt274 < local22) {
				this.anInt274 += this.anInt291 + (local22 - this.anInt274) * this.anInt292 / 1000;
				if (this.anInt274 > local22) {
					this.anInt274 = local22;
				}
			}
			if (this.anInt274 > local22) {
				this.anInt274 -= this.anInt291 + (this.anInt274 - local22) * this.anInt292 / 1000;
				if (this.anInt274 < local22) {
					this.anInt274 = local22;
				}
			}
			if (this.anInt275 < local40) {
				this.anInt275 += this.anInt291 + (local40 - this.anInt275) * this.anInt292 / 1000;
				if (this.anInt275 > local40) {
					this.anInt275 = local40;
				}
			}
			if (this.anInt275 > local40) {
				this.anInt275 -= this.anInt291 + (this.anInt275 - local40) * this.anInt292 / 1000;
				if (this.anInt275 < local40) {
					this.anInt275 = local40;
				}
			}
			if (this.anInt276 < local29) {
				this.anInt276 += this.anInt291 + (local29 - this.anInt276) * this.anInt292 / 1000;
				if (this.anInt276 > local29) {
					this.anInt276 = local29;
				}
			}
			if (this.anInt276 > local29) {
				this.anInt276 -= this.anInt291 + (this.anInt276 - local29) * this.anInt292 / 1000;
				if (this.anInt276 < local29) {
					this.anInt276 = local29;
				}
			}
			local22 = this.anInt279 * 128 + 64;
			local29 = this.anInt280 * 128 + 64;
			local40 = this.method200(local22, this.anInt355, local29) - this.anInt281;
			@Pc(238) int local238 = local22 - this.anInt274;
			@Pc(243) int local243 = local40 - this.anInt275;
			@Pc(248) int local248 = local29 - this.anInt276;
			@Pc(259) int local259 = (int) Math.sqrt((double) (local238 * local238 + local248 * local248));
			@Pc(270) int local270 = (int) (Math.atan2((double) local243, (double) local259) * 325.949D) & 0x7FF;
			@Pc(281) int local281 = (int) (Math.atan2((double) local238, (double) local248) * -325.949D) & 0x7FF;
			if (local270 < 128) {
				local270 = 128;
			}
			if (local270 > 383) {
				local270 = 383;
			}
			if (this.anInt277 < local270) {
				this.anInt277 += this.anInt282 + (local270 - this.anInt277) * this.anInt283 / 1000;
				if (this.anInt277 > local270) {
					this.anInt277 = local270;
				}
			}
			if (this.anInt277 > local270) {
				this.anInt277 -= this.anInt282 + (this.anInt277 - local270) * this.anInt283 / 1000;
				if (this.anInt277 < local270) {
					this.anInt277 = local270;
				}
			}
			@Pc(352) int local352 = local281 - this.anInt278;
			if (local352 > 1024) {
				local352 -= 2048;
			}
			if (local352 < -1024) {
				local352 += 2048;
			}
			if (local352 > 0) {
				this.anInt278 += this.anInt282 + local352 * this.anInt283 / 1000;
				this.anInt278 &= 0x7FF;
			}
			if (local352 < 0) {
				this.anInt278 -= this.anInt282 + -local352 * this.anInt283 / 1000;
				this.anInt278 &= 0x7FF;
			}
			@Pc(410) int local410 = local281 - this.anInt278;
			if (local410 > 1024) {
				local410 -= 2048;
			}
			if (local410 < -1024) {
				local410 += 2048;
			}
			if (local410 < 0 && local352 > 0 || local410 > 0 && local352 < 0) {
				this.anInt278 = local281;
			}
		} catch (@Pc(431) RuntimeException local431) {
			signlink.reporterror("59873, " + arg0 + ", " + local431.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "l", descriptor = "(B)V")
	private void method217() {
		try {
			this.method172();
			if (this.anInt347 == 1) {
				this.aClass1_Sub1_Sub2_Sub2Array3[this.anInt346 / 100].method391(this.anInt344 - 8 - 4, this.anInt345 - 8 - 4);
			}
			if (this.anInt347 == 2) {
				this.aClass1_Sub1_Sub2_Sub2Array3[this.anInt346 / 100 + 4].method391(this.anInt344 - 8 - 4, this.anInt345 - 8 - 4);
				anInt262++;
				if (anInt262 > 57) {
					anInt262 = 0;
					this.aClass1_Sub1_Sub3_4.method469(34);
				}
			}
			if (this.anInt348 != -1) {
				this.method187(this.anInt333, this.anInt348);
				this.method183(0, 0, 0, Class6.aClass6Array1[this.anInt348]);
			}
			if (this.anInt386 != -1) {
				this.method187(this.anInt333, this.anInt386);
				this.method183(0, 0, 0, Class6.aClass6Array1[this.anInt386]);
			}
			this.method222();
			if (!this.aBoolean64) {
				this.method164();
				this.method174();
			} else if (this.anInt370 == 0) {
				this.method211(107);
			}
			if (this.anInt251 == 1) {
				this.aClass1_Sub1_Sub2_Sub2Array7[1].method391(472, 296);
			}
			@Pc(182) int local182;
			if (aBoolean86) {
				@Pc(158) byte local158 = 20;
				@Pc(160) int local160 = 16776960;
				if (super.anInt203 < 15) {
					local160 = 16711680;
				}
				this.aClass1_Sub1_Sub2_Sub4_2.method446(local160, 20, "Fps:" + super.anInt203, (byte) 9);
				local182 = local158 + 15;
				@Pc(184) Runtime local184 = Runtime.getRuntime();
				@Pc(193) int local193 = (int) ((local184.totalMemory() - local184.freeMemory()) / 1024L);
				if (local193 > 33554432 && aBoolean77) {
				}
				this.aClass1_Sub1_Sub2_Sub4_2.method446(16776960, 35, "Mem:" + local193 + "k", (byte) 9);
				local182 += 15;
			}
			if (this.anInt413 != 0) {
				@Pc(227) int local227 = this.anInt413 / 50;
				local182 = local227 / 60;
				@Pc(235) int local235 = local227 % 60;
				if (local235 < 10) {
					this.aClass1_Sub1_Sub2_Sub4_2.method451(329, "System update in: " + local182 + ":0" + local235, 16776960, 4);
				} else {
					this.aClass1_Sub1_Sub2_Sub4_2.method451(329, "System update in: " + local182 + ":" + local235, 16776960, 4);
				}
			}
		} catch (@Pc(277) RuntimeException local277) {
			signlink.reporterror("50115, " + 8 + ", " + local277.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(BI[B)Z")
	private boolean method218(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2) {
		try {
			if (arg0 != 1) {
				this.anInt315 = -1;
			}
			return arg2 == null ? true : signlink.wavesave(arg2, arg1);
		} catch (@Pc(14) RuntimeException local14) {
			signlink.reporterror("61045, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local14.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "E", descriptor = "(I)V")
	private void method219(@OriginalArg(0) int arg0) {
		try {
			@Pc(7) byte[] local7 = this.aClass47_1.method666("title.dat", null);
			@Pc(13) Class1_Sub1_Sub2_Sub2 local13 = new Class1_Sub1_Sub2_Sub2(local7, this);
			this.aClass35_19.method524();
			local13.method389(0, 0);
			this.aClass35_20.method524();
			local13.method389(-637, 0);
			this.aClass35_16.method524();
			local13.method389(-128, 0);
			this.aClass35_17.method524();
			local13.method389(-202, -371);
			this.aClass35_18.method524();
			local13.method389(-202, -171);
			this.aClass35_21.method524();
			local13.method389(0, -265);
			this.aClass35_22.method524();
			local13.method389(-562, -265);
			this.aClass35_23.method524();
			local13.method389(-128, -171);
			this.aClass35_24.method524();
			local13.method389(-562, -171);
			@Pc(98) int[] local98 = new int[local13.anInt667];
			for (@Pc(100) int local100 = 0; local100 < local13.anInt668; local100++) {
				for (@Pc(104) int local104 = 0; local104 < local13.anInt667; local104++) {
					local98[local104] = local13.anIntArray208[local13.anInt667 + local13.anInt667 * local100 - local104 - 1];
				}
				for (@Pc(130) int local130 = 0; local130 < local13.anInt667; local130++) {
					local13.anIntArray208[local130 + local13.anInt667 * local100] = local98[local130];
				}
			}
			this.aClass35_19.method524();
			local13.method389(382, 0);
			this.aClass35_20.method524();
			local13.method389(-255, 0);
			this.aClass35_16.method524();
			local13.method389(254, 0);
			if (arg0 != 12601) {
				this.anInt315 = -1;
			}
			this.aClass35_17.method524();
			local13.method389(180, -371);
			this.aClass35_18.method524();
			local13.method389(180, -171);
			this.aClass35_21.method524();
			local13.method389(382, -265);
			this.aClass35_22.method524();
			local13.method389(-180, -265);
			this.aClass35_23.method524();
			local13.method389(254, -171);
			this.aClass35_24.method524();
			local13.method389(-180, -171);
			local13 = new Class1_Sub1_Sub2_Sub2(this.aClass47_1, "logo", 0);
			this.aClass35_16.method524();
			local13.method391(382 - local13.anInt667 / 2 - 128, 18);
			System.gc();
		} catch (@Pc(282) RuntimeException local282) {
			signlink.reporterror("6941, " + arg0 + ", " + local282.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(IZ)V")
	private void method220(@OriginalArg(0) int arg0) {
		try {
			if (!aBoolean77) {
				@Pc(17) Class1_Sub1_Sub2_Sub3 local17;
				@Pc(25) int local25;
				@Pc(33) int local33;
				@Pc(36) byte[] local36;
				@Pc(39) byte[] local39;
				@Pc(41) int local41;
				if (Class1_Sub1_Sub2_Sub1.anIntArray182[17] >= arg0) {
					local17 = Class1_Sub1_Sub2_Sub1.aClass1_Sub1_Sub2_Sub3Array5[17];
					local25 = local17.anInt695 * local17.anInt696 - 1;
					local33 = local17.anInt695 * this.anInt333 * 2;
					local36 = local17.aByteArray7;
					local39 = this.aByteArray2;
					for (local41 = 0; local41 <= local25; local41++) {
						local39[local41] = local36[local41 - local33 & local25];
					}
					local17.aByteArray7 = local39;
					this.aByteArray2 = local36;
					Class1_Sub1_Sub2_Sub1.method349(17);
				}
				if (Class1_Sub1_Sub2_Sub1.anIntArray182[24] >= arg0) {
					local17 = Class1_Sub1_Sub2_Sub1.aClass1_Sub1_Sub2_Sub3Array5[24];
					local25 = local17.anInt695 * local17.anInt696 - 1;
					local33 = local17.anInt695 * this.anInt333 * 2;
					local36 = local17.aByteArray7;
					local39 = this.aByteArray2;
					for (local41 = 0; local41 <= local25; local41++) {
						local39[local41] = local36[local41 - local33 & local25];
					}
					local17.aByteArray7 = local39;
					this.aByteArray2 = local36;
					Class1_Sub1_Sub2_Sub1.method349(24);
				}
				if (Class1_Sub1_Sub2_Sub1.anIntArray182[34] >= arg0) {
					local17 = Class1_Sub1_Sub2_Sub1.aClass1_Sub1_Sub2_Sub3Array5[34];
					local25 = local17.anInt695 * local17.anInt696 - 1;
					local33 = local17.anInt695 * this.anInt333 * 2;
					local36 = local17.aByteArray7;
					local39 = this.aByteArray2;
					for (local41 = 0; local41 <= local25; local41++) {
						local39[local41] = local36[local41 - local33 & local25];
					}
					local17.aByteArray7 = local39;
					this.aByteArray2 = local36;
					Class1_Sub1_Sub2_Sub1.method349(34);
					return;
				}
			}
		} catch (@Pc(184) RuntimeException local184) {
			signlink.reporterror("27776, " + arg0 + ", " + true + ", " + local184.toString());
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

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(JI)V")
	private void method221(@OriginalArg(0) long arg0) {
		try {
			if (arg0 != 0L) {
				if (this.anInt384 >= 100) {
					this.method152("", "Your ignore list is full. Max of 100 hit", 0);
				} else {
					@Pc(24) String local24 = Class48.method671(Class48.method668(arg0, this.anInt219));
					for (@Pc(29) int local29 = 0; local29 < this.anInt384; local29++) {
						if (this.aLongArray4[local29] == arg0) {
							this.method152("", local24 + " is already on your ignore list", 0);
							return;
						}
					}
					for (@Pc(59) int local59 = 0; local59 < this.anInt351; local59++) {
						if (this.aLongArray3[local59] == arg0) {
							this.method152("", "Please remove " + local24 + " from your friend list first", 0);
							return;
						}
					}
					this.aLongArray4[this.anInt384++] = arg0;
					this.aBoolean87 = true;
					this.aClass1_Sub1_Sub3_4.method469(158);
					this.aClass1_Sub1_Sub3_4.method476(arg0, 359);
				}
			}
		} catch (@Pc(114) RuntimeException local114) {
			signlink.reporterror("82413, " + arg0 + ", " + 571 + ", " + local114.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "u", descriptor = "(Z)V")
	private void method222() {
		try {
			this.anInt341 = 0;
			@Pc(16) int local16 = (aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt1009 >> 7) + this.anInt302;
			@Pc(24) int local24 = (aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt1010 >> 7) + this.anInt303;
			if (local16 >= 3053 && local16 <= 3156 && local24 >= 3056 && local24 <= 3136) {
				this.anInt341 = 1;
			}
			if (local16 >= 3072 && local16 <= 3118 && local24 >= 9492 && local24 <= 9535) {
				this.anInt341 = 1;
			}
			if (this.anInt341 == 1 && local16 >= 3139 && local16 <= 3199 && local24 >= 3008 && local24 <= 3062) {
				this.anInt341 = 0;
			}
		} catch (@Pc(75) RuntimeException local75) {
			signlink.reporterror("36606, " + false + ", " + local75.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "m", descriptor = "(B)V")
	private void method223() {
		try {
			if (this.anInt250 != 0) {
				@Pc(5) int local5 = 0;
				if (this.anInt413 != 0) {
					local5 = 1;
				}
				for (@Pc(23) int local23 = 0; local23 < 100; local23++) {
					if (this.aStringArray2[local23] != null) {
						@Pc(35) int local35 = this.anIntArray37[local23];
						@Pc(40) String local40 = this.aStringArray1[local23];
						if (local40 != null && local40.startsWith("@cr1@")) {
							local40 = local40.substring(5);
						}
						if (local40 != null && local40.startsWith("@cr2@")) {
							local40 = local40.substring(5);
						}
						if ((local35 == 3 || local35 == 7) && (local35 == 7 || this.anInt417 == 0 || this.anInt417 == 1 && this.method182(local40))) {
							@Pc(93) int local93 = 329 - local5 * 13;
							if (super.anInt208 > 4 && super.anInt209 - 4 > local93 - 10 && super.anInt209 - 4 <= local93 + 3) {
								@Pc(132) int local132 = this.aClass1_Sub1_Sub2_Sub4_2.method449("From:  " + local40 + this.aStringArray2[local23]) + 25;
								if (local132 > 450) {
									local132 = 450;
								}
								if (super.anInt208 < local132 + 4) {
									if (this.anInt331 >= 1) {
										this.aStringArray6[this.anInt329] = "Report abuse @whi@" + local40;
										this.anIntArray62[this.anInt329] = 2524;
										this.anInt329++;
									}
									this.aStringArray6[this.anInt329] = "Add ignore @whi@" + local40;
									this.anIntArray62[this.anInt329] = 2047;
									this.anInt329++;
									this.aStringArray6[this.anInt329] = "Add friend @whi@" + local40;
									this.anIntArray62[this.anInt329] = 2605;
									this.anInt329++;
								}
							}
							local5++;
							if (local5 >= 5) {
								return;
							}
						}
						if ((local35 == 5 || local35 == 6) && this.anInt417 < 2) {
							local5++;
							if (local5 >= 5) {
								return;
							}
						}
					}
				}
			}
		} catch (@Pc(245) RuntimeException local245) {
			signlink.reporterror("66739, " + 56 + ", " + local245.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "h", descriptor = "(II)Z")
	private boolean method224(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			this.anInt314 += arg0;
			if (arg1 < 0) {
				return false;
			}
			@Pc(14) int local14 = this.anIntArray62[arg1];
			if (local14 >= 2000) {
				local14 -= 2000;
			}
			return local14 == 605;
		} catch (@Pc(26) RuntimeException local26) {
			signlink.reporterror("58914, " + arg0 + ", " + arg1 + ", " + local26.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "n", descriptor = "(B)Z")
	private boolean method225(@OriginalArg(0) byte arg0) {
		try {
			@Pc(6) boolean local6 = false;
			if (this.aClass8_1 == null) {
				return false;
			}
			@Pc(1777) String local1777;
			@Pc(280) int local280;
			try {
				@Pc(24) int local24 = this.aClass8_1.method249();
				if (local24 == 0) {
					return false;
				}
				if (this.anInt315 == -1) {
					this.aClass8_1.method250(this.aClass1_Sub1_Sub3_3.aByteArray9, 0, 1);
					this.anInt315 = this.aClass1_Sub1_Sub3_3.aByteArray9[0] & 0xFF;
					if (this.aClass46_1 != null) {
						this.anInt315 = this.anInt315 - this.aClass46_1.method662() & 0xFF;
					}
					this.anInt314 = Class17.anIntArray210[this.anInt315];
					local24--;
				}
				if (this.anInt314 == -1) {
					if (local24 <= 0) {
						return false;
					}
					this.aClass8_1.method250(this.aClass1_Sub1_Sub3_3.aByteArray9, 0, 1);
					this.anInt314 = this.aClass1_Sub1_Sub3_3.aByteArray9[0] & 0xFF;
					local24--;
				}
				if (this.anInt314 == -2) {
					if (local24 <= 1) {
						return false;
					}
					this.aClass8_1.method250(this.aClass1_Sub1_Sub3_3.aByteArray9, 0, 2);
					this.aClass1_Sub1_Sub3_3.anInt763 = 0;
					this.anInt314 = this.aClass1_Sub1_Sub3_3.method482();
					local24 -= 2;
				}
				if (local24 < this.anInt314) {
					return false;
				}
				this.aClass1_Sub1_Sub3_3.anInt763 = 0;
				this.aClass8_1.method250(this.aClass1_Sub1_Sub3_3.aByteArray9, 0, this.anInt314);
				this.anInt316 = 0;
				this.anInt223 = this.anInt222;
				this.anInt222 = this.anInt221;
				this.anInt221 = this.anInt315;
				if (this.anInt315 == 55) {
					this.anInt362 = this.aClass1_Sub1_Sub3_3.method480();
					if (this.anInt362 == 1) {
						this.anInt306 = this.aClass1_Sub1_Sub3_3.method482();
					}
					if (this.anInt362 >= 2 && this.anInt362 <= 6) {
						if (this.anInt362 == 2) {
							this.anInt425 = 64;
							this.anInt426 = 64;
						}
						if (this.anInt362 == 3) {
							this.anInt425 = 0;
							this.anInt426 = 64;
						}
						if (this.anInt362 == 4) {
							this.anInt425 = 128;
							this.anInt426 = 64;
						}
						if (this.anInt362 == 5) {
							this.anInt425 = 64;
							this.anInt426 = 0;
						}
						if (this.anInt362 == 6) {
							this.anInt425 = 64;
							this.anInt426 = 128;
						}
						this.anInt362 = 2;
						this.anInt422 = this.aClass1_Sub1_Sub3_3.method482();
						this.anInt423 = this.aClass1_Sub1_Sub3_3.method482();
						this.anInt424 = this.aClass1_Sub1_Sub3_3.method480();
					}
					if (this.anInt362 == 10) {
						this.anInt385 = this.aClass1_Sub1_Sub3_3.method482();
					}
					this.anInt315 = -1;
					return true;
				}
				@Pc(284) int local284;
				@Pc(276) int local276;
				if (this.anInt315 == 130) {
					local276 = this.aClass1_Sub1_Sub3_3.method482();
					local280 = this.aClass1_Sub1_Sub3_3.method483();
					local284 = this.aClass1_Sub1_Sub3_3.method483();
					@Pc(288) Class6 local288 = Class6.aClass6Array1[local276];
					local288.anInt438 = local280;
					local288.anInt439 = local284;
					this.anInt315 = -1;
					return true;
				}
				if (this.anInt315 == 118) {
					this.anInt352 = this.aClass1_Sub1_Sub3_3.method480();
					this.aBoolean87 = true;
					this.anInt315 = -1;
					return true;
				}
				if (this.anInt315 == 236) {
					local276 = this.aClass1_Sub1_Sub3_3.method482();
					this.method178(local276);
					if (this.anInt383 != -1) {
						this.anInt383 = -1;
						this.aBoolean87 = true;
						this.aBoolean66 = true;
					}
					if (this.anInt235 != -1) {
						this.anInt235 = -1;
						this.aBoolean68 = true;
					}
					if (this.aBoolean78) {
						this.aBoolean78 = false;
						this.aBoolean68 = true;
					}
					this.anInt386 = local276;
					this.aBoolean92 = false;
					this.anInt315 = -1;
					return true;
				}
				if (this.anInt315 == 38) {
					local276 = this.aClass1_Sub1_Sub3_3.method482();
					if (local276 == 65535) {
						local276 = -1;
					}
					if (local276 != this.anInt229 && this.aBoolean53 && !aBoolean77 && this.anInt301 == 0) {
						this.anInt260 = local276;
						this.aBoolean61 = true;
						this.aClass44_Sub1_1.method645(2, this.anInt260);
					}
					this.anInt229 = local276;
					this.anInt315 = -1;
					return true;
				}
				if (this.anInt315 == 183) {
					local276 = this.aClass1_Sub1_Sub3_3.method482();
					local280 = this.aClass1_Sub1_Sub3_3.method482();
					if (this.aBoolean53 && !aBoolean77) {
						this.anInt260 = local276;
						this.aBoolean61 = false;
						this.aClass44_Sub1_1.method645(2, this.anInt260);
						this.anInt301 = local280;
					}
					this.anInt315 = -1;
					return true;
				}
				if (this.anInt315 == 228) {
					this.anInt413 = this.aClass1_Sub1_Sub3_3.method482() * 30;
					this.anInt315 = -1;
					return true;
				}
				if (this.anInt315 == 131) {
					this.anInt357 = this.aClass1_Sub1_Sub3_3.method480();
					this.anInt315 = -1;
					return true;
				}
				@Pc(549) int local549;
				@Pc(554) int local554;
				@Pc(559) int local559;
				@Pc(570) int local570;
				if (this.anInt315 == 241) {
					this.aBoolean51 = true;
					this.anInt279 = this.aClass1_Sub1_Sub3_3.method480();
					this.anInt280 = this.aClass1_Sub1_Sub3_3.method480();
					this.anInt281 = this.aClass1_Sub1_Sub3_3.method482();
					this.anInt282 = this.aClass1_Sub1_Sub3_3.method480();
					this.anInt283 = this.aClass1_Sub1_Sub3_3.method480();
					if (this.anInt283 >= 100) {
						local276 = this.anInt279 * 128 + 64;
						local280 = this.anInt280 * 128 + 64;
						local284 = this.method200(local276, this.anInt355, local280) - this.anInt281;
						local549 = local276 - this.anInt274;
						local554 = local284 - this.anInt275;
						local559 = local280 - this.anInt276;
						local570 = (int) Math.sqrt((double) (local549 * local549 + local559 * local559));
						this.anInt277 = (int) (Math.atan2((double) local554, (double) local570) * 325.949D) & 0x7FF;
						this.anInt278 = (int) (Math.atan2((double) local549, (double) local559) * -325.949D) & 0x7FF;
						if (this.anInt277 < 128) {
							this.anInt277 = 128;
						}
						if (this.anInt277 > 383) {
							this.anInt277 = 383;
						}
					}
					this.anInt315 = -1;
					return true;
				}
				@Pc(632) boolean local632;
				@Pc(701) String local701;
				@Pc(622) long local622;
				if (this.anInt315 == 224) {
					local622 = this.aClass1_Sub1_Sub3_3.method486();
					local284 = this.aClass1_Sub1_Sub3_3.method485();
					local549 = this.aClass1_Sub1_Sub3_3.method480();
					local632 = false;
					for (local559 = 0; local559 < 100; local559++) {
						if (this.anIntArray78[local559] == local284) {
							local632 = true;
							break;
						}
					}
					if (local549 <= 1) {
						for (local570 = 0; local570 < this.anInt384; local570++) {
							if (this.aLongArray4[local570] == local622) {
								local632 = true;
								break;
							}
						}
					}
					if (!local632 && this.anInt341 == 0) {
						try {
							this.anIntArray78[this.anInt366] = local284;
							this.anInt366 = (this.anInt366 + 1) % 100;
							local701 = Class49.method683(this.anInt314 - 13, this.aClass1_Sub1_Sub3_3);
							local701 = Class42.method604(this.anInt270, local701);
							if (local549 == 2 || local549 == 3) {
								this.method152("@cr2@" + Class48.method671(Class48.method668(local622, this.anInt219)), local701, 7);
							} else if (local549 == 1) {
								this.method152("@cr1@" + Class48.method671(Class48.method668(local622, this.anInt219)), local701, 7);
							} else {
								this.method152(Class48.method671(Class48.method668(local622, this.anInt219)), local701, 3);
							}
						} catch (@Pc(766) Exception local766) {
							signlink.reporterror("cde1");
						}
					}
					this.anInt315 = -1;
					return true;
				}
				if (this.anInt315 == 51) {
					local276 = this.aClass1_Sub1_Sub3_3.method482();
					@Pc(791) boolean local791 = this.aClass1_Sub1_Sub3_3.method480() == 1;
					Class6.aClass6Array1[local276].aBoolean99 = local791;
					this.anInt315 = -1;
					return true;
				}
				if (this.anInt315 == 7) {
					local276 = this.aClass1_Sub1_Sub3_3.method482();
					local280 = this.aClass1_Sub1_Sub3_3.method482();
					Class6.aClass6Array1[local276].anInt450 = 2;
					Class6.aClass6Array1[local276].anInt451 = local280;
					this.anInt315 = -1;
					return true;
				}
				@Pc(843) Class6 local843;
				if (this.anInt315 == 188) {
					this.aBoolean87 = true;
					local276 = this.aClass1_Sub1_Sub3_3.method482();
					local843 = Class6.aClass6Array1[local276];
					local284 = this.aClass1_Sub1_Sub3_3.method482();
					for (local549 = 0; local549 < local284; local549++) {
						local843.anIntArray94[local549] = this.aClass1_Sub1_Sub3_3.method482();
						local554 = this.aClass1_Sub1_Sub3_3.method480();
						if (local554 == 255) {
							local554 = this.aClass1_Sub1_Sub3_3.method485();
						}
						local843.anIntArray95[local549] = local554;
					}
					for (local554 = local284; local554 < local843.anIntArray94.length; local554++) {
						local843.anIntArray94[local554] = 0;
						local843.anIntArray95[local554] = 0;
					}
					this.anInt315 = -1;
					return true;
				}
				@Pc(1060) int local1060;
				if (this.anInt315 == 149) {
					local622 = this.aClass1_Sub1_Sub3_3.method486();
					local284 = this.aClass1_Sub1_Sub3_3.method480();
					@Pc(923) String local923 = Class48.method671(Class48.method668(local622, this.anInt219));
					for (local554 = 0; local554 < this.anInt351; local554++) {
						if (local622 == this.aLongArray3[local554]) {
							if (this.anIntArray59[local554] != local284) {
								this.anIntArray59[local554] = local284;
								this.aBoolean87 = true;
								if (local284 > 0) {
									this.method152("", local923 + " has logged in.", 5);
								}
								if (local284 == 0) {
									this.method152("", local923 + " has logged out.", 5);
								}
							}
							local923 = null;
							break;
						}
					}
					if (local923 != null && this.anInt351 < 200) {
						this.aLongArray3[this.anInt351] = local622;
						this.aStringArray5[this.anInt351] = local923;
						this.anIntArray59[this.anInt351] = local284;
						this.anInt351++;
						this.aBoolean87 = true;
					}
					@Pc(1021) boolean local1021 = false;
					while (!local1021) {
						local1021 = true;
						for (local570 = 0; local570 < this.anInt351 - 1; local570++) {
							if (this.anIntArray59[local570] != anInt339 && this.anIntArray59[local570 + 1] == anInt339 || this.anIntArray59[local570] == 0 && this.anIntArray59[local570 + 1] != 0) {
								local1060 = this.anIntArray59[local570];
								this.anIntArray59[local570] = this.anIntArray59[local570 + 1];
								this.anIntArray59[local570 + 1] = local1060;
								@Pc(1082) String local1082 = this.aStringArray5[local570];
								this.aStringArray5[local570] = this.aStringArray5[local570 + 1];
								this.aStringArray5[local570 + 1] = local1082;
								@Pc(1104) long local1104 = this.aLongArray3[local570];
								this.aLongArray3[local570] = this.aLongArray3[local570 + 1];
								this.aLongArray3[local570 + 1] = local1104;
								this.aBoolean87 = true;
								local1021 = false;
							}
						}
					}
					this.anInt315 = -1;
					return true;
				}
				if (this.anInt315 == 108) {
					this.anInt408 = this.aClass1_Sub1_Sub3_3.method480();
					this.anInt409 = this.aClass1_Sub1_Sub3_3.method480();
					while (this.aClass1_Sub1_Sub3_3.anInt763 < this.anInt314) {
						local276 = this.aClass1_Sub1_Sub3_3.method480();
						this.method125(local276, this.aClass1_Sub1_Sub3_3);
					}
					this.anInt315 = -1;
					return true;
				}
				if (this.anInt315 == 83) {
					this.anInt285 = 0;
					this.anInt315 = -1;
					return true;
				}
				if (this.anInt315 == 44) {
					this.anInt408 = this.aClass1_Sub1_Sub3_3.method480();
					this.anInt409 = this.aClass1_Sub1_Sub3_3.method480();
					for (local276 = this.anInt408; local276 < this.anInt408 + 8; local276++) {
						for (local280 = this.anInt409; local280 < this.anInt409 + 8; local280++) {
							if (this.aClass29ArrayArrayArray1[this.anInt355][local276][local280] != null) {
								this.aClass29ArrayArrayArray1[this.anInt355][local276][local280] = null;
								this.method138(local276, local280);
							}
						}
					}
					for (@Pc(1256) Class1_Sub2 local1256 = (Class1_Sub2) this.aClass29_3.method511(); local1256 != null; local1256 = (Class1_Sub2) this.aClass29_3.method513()) {
						if (local1256.anInt803 >= this.anInt408 && local1256.anInt803 < this.anInt408 + 8 && local1256.anInt804 >= this.anInt409 && local1256.anInt804 < this.anInt409 + 8 && local1256.anInt801 == this.anInt355) {
							local1256.anInt812 = 0;
						}
					}
					this.anInt315 = -1;
					return true;
				}
				if (this.anInt315 == 214) {
					local276 = this.aClass1_Sub1_Sub3_3.method482();
					local280 = this.aClass1_Sub1_Sub3_3.method482();
					local284 = local280 >> 10 & 0x1F;
					local549 = local280 >> 5 & 0x1F;
					local554 = local280 & 0x1F;
					Class6.aClass6Array1[local276].anInt446 = (local284 << 19) + (local549 << 11) + (local554 << 3);
					this.anInt315 = -1;
					return true;
				}
				if (this.anInt315 == 9) {
					local276 = this.aClass1_Sub1_Sub3_3.method483();
					this.anInt263 = local276;
					this.aBoolean68 = true;
					this.anInt315 = -1;
					return true;
				}
				if (this.anInt315 == 13) {
					this.aBoolean87 = true;
					local276 = this.aClass1_Sub1_Sub3_3.method482();
					local843 = Class6.aClass6Array1[local276];
					while (this.aClass1_Sub1_Sub3_3.anInt763 < this.anInt314) {
						local284 = this.aClass1_Sub1_Sub3_3.method494();
						local549 = this.aClass1_Sub1_Sub3_3.method482();
						local554 = this.aClass1_Sub1_Sub3_3.method480();
						if (local554 == 255) {
							local554 = this.aClass1_Sub1_Sub3_3.method485();
						}
						if (local284 >= 0 && local284 < local843.anIntArray94.length) {
							local843.anIntArray94[local284] = local549;
							local843.anIntArray95[local284] = local554;
						}
					}
					this.anInt315 = -1;
					return true;
				}
				if (this.anInt315 == 3) {
					this.anInt308 = this.aClass1_Sub1_Sub3_3.method480();
					this.aBoolean87 = true;
					this.aBoolean66 = true;
					this.anInt315 = -1;
					return true;
				}
				@Pc(1470) Class6 local1470;
				if (this.anInt315 == 85) {
					local276 = this.aClass1_Sub1_Sub3_3.method482();
					local280 = this.aClass1_Sub1_Sub3_3.method482();
					local1470 = Class6.aClass6Array1[local276];
					if (local1470 != null && local1470.anInt433 == 0) {
						if (local280 < 0) {
							local280 = 0;
						}
						if (local280 > local1470.anInt441 - local1470.anInt437) {
							local280 = local1470.anInt441 - local1470.anInt437;
						}
						local1470.anInt442 = local280;
					}
					this.anInt315 = -1;
					return true;
				}
				if (this.anInt315 == 181) {
					this.anInt395 = this.aClass1_Sub1_Sub3_3.method480();
					if (this.anInt395 == this.anInt308) {
						if (this.anInt395 == 3) {
							this.anInt308 = 1;
						} else {
							this.anInt308 = 3;
						}
						this.aBoolean87 = true;
					}
					this.anInt315 = -1;
					return true;
				}
				if (this.anInt315 == 81) {
					local276 = this.aClass1_Sub1_Sub3_3.method482();
					local280 = this.aClass1_Sub1_Sub3_3.method482();
					local284 = this.aClass1_Sub1_Sub3_3.method482();
					local549 = this.aClass1_Sub1_Sub3_3.method482();
					Class6.aClass6Array1[local276].anInt457 = local280;
					Class6.aClass6Array1[local276].anInt458 = local284;
					Class6.aClass6Array1[local276].anInt456 = local549;
					this.anInt315 = -1;
					return true;
				}
				if (this.anInt315 == 151) {
					this.aBoolean87 = true;
					local276 = this.aClass1_Sub1_Sub3_3.method480();
					local280 = this.aClass1_Sub1_Sub3_3.method485();
					local284 = this.aClass1_Sub1_Sub3_3.method480();
					this.anIntArray40[local276] = local280;
					this.anIntArray93[local276] = local284;
					this.anIntArray65[local276] = 1;
					for (local549 = 0; local549 < 98; local549++) {
						if (local280 >= anIntArray64[local549]) {
							this.anIntArray65[local276] = local549 + 2;
						}
					}
					this.anInt315 = -1;
					return true;
				}
				if (this.anInt315 == 185) {
					local276 = this.aClass1_Sub1_Sub3_3.method482();
					local280 = this.aClass1_Sub1_Sub3_3.method482();
					Class6.aClass6Array1[local276].anInt450 = 1;
					Class6.aClass6Array1[local276].anInt451 = local280;
					this.anInt315 = -1;
					return true;
				}
				if (this.anInt315 == 245) {
					local276 = this.aClass1_Sub1_Sub3_3.method482();
					local280 = this.aClass1_Sub1_Sub3_3.method482();
					if (this.anInt235 != -1) {
						this.anInt235 = -1;
						this.aBoolean68 = true;
					}
					if (this.aBoolean78) {
						this.aBoolean78 = false;
						this.aBoolean68 = true;
					}
					this.anInt386 = local276;
					this.anInt383 = local280;
					this.aBoolean87 = true;
					this.aBoolean66 = true;
					this.aBoolean92 = false;
					this.anInt315 = -1;
					return true;
				}
				if (this.anInt315 == 195) {
					this.method163(459, this.aClass1_Sub1_Sub3_3, this.anInt314);
					this.anInt315 = -1;
					return true;
				}
				if (this.anInt315 == 77) {
					local276 = this.aClass1_Sub1_Sub3_3.method482();
					this.method178(local276);
					if (this.anInt383 != -1) {
						this.anInt383 = -1;
						this.aBoolean87 = true;
						this.aBoolean66 = true;
					}
					this.anInt235 = local276;
					this.aBoolean68 = true;
					this.anInt386 = -1;
					this.aBoolean92 = false;
					this.anInt315 = -1;
					return true;
				}
				@Pc(1788) String local1788;
				if (this.anInt315 == 238) {
					local1777 = this.aClass1_Sub1_Sub3_3.method487();
					@Pc(1791) long local1791;
					if (local1777.endsWith(":tradereq:")) {
						local1788 = local1777.substring(0, local1777.indexOf(":"));
						local1791 = Class48.method667(local1788);
						local632 = false;
						for (local559 = 0; local559 < this.anInt384; local559++) {
							if (this.aLongArray4[local559] == local1791) {
								local632 = true;
								break;
							}
						}
						if (!local632 && this.anInt341 == 0) {
							this.method152(local1788, "wishes to trade with you.", 4);
						}
					} else if (local1777.endsWith(":duelreq:")) {
						local1788 = local1777.substring(0, local1777.indexOf(":"));
						local1791 = Class48.method667(local1788);
						local632 = false;
						for (local559 = 0; local559 < this.anInt384; local559++) {
							if (this.aLongArray4[local559] == local1791) {
								local632 = true;
								break;
							}
						}
						if (!local632 && this.anInt341 == 0) {
							this.method152(local1788, "wishes to duel with you.", 8);
						}
					} else if (local1777.endsWith(":chalreq:")) {
						local1788 = local1777.substring(0, local1777.indexOf(":"));
						local1791 = Class48.method667(local1788);
						local632 = false;
						for (local559 = 0; local559 < this.anInt384; local559++) {
							if (this.aLongArray4[local559] == local1791) {
								local632 = true;
								break;
							}
						}
						if (!local632 && this.anInt341 == 0) {
							local701 = local1777.substring(local1777.indexOf(":") + 1, local1777.length() - 9);
							this.method152(local1788, local701, 8);
						}
					} else {
						this.method152("", local1777, 0);
					}
					this.anInt315 = -1;
					return true;
				}
				if (this.anInt315 == 33) {
					this.anInt402 = this.aClass1_Sub1_Sub3_3.method482();
					this.anInt353 = this.aClass1_Sub1_Sub3_3.method480();
					this.anInt315 = -1;
					return true;
				}
				if (this.anInt315 == 75) {
					this.method171();
					this.anInt315 = -1;
					return false;
				}
				if (this.anInt315 == 153) {
					local276 = this.aClass1_Sub1_Sub3_3.method482();
					local280 = this.aClass1_Sub1_Sub3_3.method482();
					local284 = this.aClass1_Sub1_Sub3_3.method482();
					if (local280 == 65535) {
						Class6.aClass6Array1[local276].anInt450 = 0;
						this.anInt315 = -1;
						return true;
					}
					@Pc(2010) Class15 local2010 = Class15.method361(local280);
					Class6.aClass6Array1[local276].anInt450 = 4;
					Class6.aClass6Array1[local276].anInt451 = local280;
					Class6.aClass6Array1[local276].anInt457 = local2010.anInt622;
					Class6.aClass6Array1[local276].anInt458 = local2010.anInt623;
					Class6.aClass6Array1[local276].anInt456 = local2010.anInt621 * 100 / local284;
					this.anInt315 = -1;
					return true;
				}
				if (this.anInt315 == 105) {
					this.anInt384 = this.anInt314 / 8;
					for (local276 = 0; local276 < this.anInt384; local276++) {
						this.aLongArray4[local276] = this.aClass1_Sub1_Sub3_3.method486();
					}
					this.anInt315 = -1;
					return true;
				}
				if (this.anInt315 == 111) {
					for (local276 = 0; local276 < this.aClass1_Sub1_Sub1_Sub1_Sub1Array1.length; local276++) {
						if (this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local276] != null) {
							this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local276].anInt1032 = -1;
						}
					}
					for (local280 = 0; local280 < this.aClass1_Sub1_Sub1_Sub1_Sub2Array1.length; local280++) {
						if (this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local280] != null) {
							this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local280].anInt1032 = -1;
						}
					}
					this.anInt315 = -1;
					return true;
				}
				if (this.anInt315 == 222 || this.anInt315 == 253 || this.anInt315 == 191 || this.anInt315 == 137 || this.anInt315 == 193 || this.anInt315 == 30 || this.anInt315 == 53 || this.anInt315 == 147 || this.anInt315 == 2 || this.anInt315 == 211 || this.anInt315 == 136) {
					this.method125(this.anInt315, this.aClass1_Sub1_Sub3_3);
					this.anInt315 = -1;
					return true;
				}
				if (this.anInt315 == 98) {
					local276 = this.aClass1_Sub1_Sub3_3.method480();
					local280 = this.aClass1_Sub1_Sub3_3.method480();
					@Pc(2202) String local2202 = this.aClass1_Sub1_Sub3_3.method487();
					if (local276 >= 1 && local276 <= 5) {
						if (local2202.equalsIgnoreCase("null")) {
							local2202 = null;
						}
						this.aStringArray3[local276 - 1] = local2202;
						this.aBooleanArray3[local276 - 1] = local280 == 0;
					}
					this.anInt315 = -1;
					return true;
				}
				if (this.anInt315 == 22) {
					this.anInt408 = this.aClass1_Sub1_Sub3_3.method480();
					this.anInt409 = this.aClass1_Sub1_Sub3_3.method480();
					this.anInt315 = -1;
					return true;
				}
				if (this.anInt315 == 145) {
					local276 = this.aClass1_Sub1_Sub3_3.method482();
					local280 = this.aClass1_Sub1_Sub3_3.method485();
					this.anIntArray80[local276] = local280;
					if (this.anIntArray81[local276] != local280) {
						this.anIntArray81[local276] = local280;
						this.method133(this.anInt224, local276);
						this.aBoolean87 = true;
						if (this.anInt263 != -1) {
							this.aBoolean68 = true;
						}
					}
					this.anInt315 = -1;
					return true;
				}
				if (this.anInt315 == 186) {
					local276 = this.aClass1_Sub1_Sub3_3.method482();
					local280 = this.aClass1_Sub1_Sub3_3.method483();
					local1470 = Class6.aClass6Array1[local276];
					local1470.anInt454 = local280;
					if (local280 == -1) {
						local1470.anInt429 = 0;
						local1470.anInt430 = 0;
					}
					this.anInt315 = -1;
					return true;
				}
				if (this.anInt315 == 156) {
					if (this.anInt308 == 12) {
						this.aBoolean87 = true;
					}
					this.anInt410 = this.aClass1_Sub1_Sub3_3.method483();
					this.anInt315 = -1;
					return true;
				}
				if (this.anInt315 == 92) {
					local276 = this.aClass1_Sub1_Sub3_3.method480();
					local280 = this.aClass1_Sub1_Sub3_3.method480();
					local284 = this.aClass1_Sub1_Sub3_3.method480();
					local549 = this.aClass1_Sub1_Sub3_3.method480();
					this.aBooleanArray4[local276] = true;
					this.anIntArray76[local276] = local280;
					this.anIntArray82[local276] = local284;
					this.anIntArray58[local276] = local549;
					this.anIntArray75[local276] = 0;
					this.anInt315 = -1;
					return true;
				}
				if (this.anInt315 == 212) {
					if (this.anInt383 != -1) {
						this.anInt383 = -1;
						this.aBoolean87 = true;
						this.aBoolean66 = true;
					}
					if (this.anInt235 != -1) {
						this.anInt235 = -1;
						this.aBoolean68 = true;
					}
					if (this.aBoolean78) {
						this.aBoolean78 = false;
						this.aBoolean68 = true;
					}
					this.anInt386 = -1;
					this.aBoolean92 = false;
					this.anInt315 = -1;
					return true;
				}
				if (this.anInt315 == 206) {
					this.anInt246 = this.aClass1_Sub1_Sub3_3.method480();
					this.anInt417 = this.aClass1_Sub1_Sub3_3.method480();
					this.anInt376 = this.aClass1_Sub1_Sub3_3.method480();
					this.aBoolean69 = true;
					this.aBoolean68 = true;
					this.anInt315 = -1;
					return true;
				}
				if (this.anInt315 == 170) {
					local276 = this.aClass1_Sub1_Sub3_3.method482();
					local280 = this.aClass1_Sub1_Sub3_3.method482();
					if (this.anInt414 == local276 && this.anInt415 == local280 && this.anInt388 == 2) {
						this.anInt315 = -1;
						return true;
					}
					this.anInt414 = local276;
					this.anInt415 = local280;
					this.anInt302 = (this.anInt414 - 6) * 8;
					this.anInt303 = (this.anInt415 - 6) * 8;
					this.aBoolean79 = false;
					if ((this.anInt414 / 8 == 48 || this.anInt414 / 8 == 49) && this.anInt415 / 8 == 48) {
						this.aBoolean79 = true;
					}
					if (this.anInt414 / 8 == 48 && this.anInt415 / 8 == 148) {
						this.aBoolean79 = true;
					}
					this.anInt388 = 1;
					this.aLong17 = System.currentTimeMillis();
					this.aClass35_14.method524();
					this.aClass1_Sub1_Sub2_Sub4_2.method447("Loading - please wait.", 0, 257, 151);
					this.aClass1_Sub1_Sub2_Sub4_2.method447("Loading - please wait.", 16777215, 256, 150);
					this.aClass35_14.method525(4, 4, super.aGraphics2, this.anInt293);
					local284 = 0;
					for (local549 = (this.anInt414 - 6) / 8; local549 <= (this.anInt414 + 6) / 8; local549++) {
						for (local554 = (this.anInt415 - 6) / 8; local554 <= (this.anInt415 + 6) / 8; local554++) {
							local284++;
						}
					}
					this.aByteArrayArray1 = new byte[local284][];
					this.aByteArrayArray2 = new byte[local284][];
					this.anIntArray69 = new int[local284];
					this.anIntArray70 = new int[local284];
					this.anIntArray71 = new int[local284];
					local284 = 0;
					for (local554 = (this.anInt414 - 6) / 8; local554 <= (this.anInt414 + 6) / 8; local554++) {
						for (local559 = (this.anInt415 - 6) / 8; local559 <= (this.anInt415 + 6) / 8; local559++) {
							this.anIntArray69[local284] = (local554 << 8) + local559;
							if (this.aBoolean79 && (local559 == 49 || local559 == 149 || local559 == 147 || local554 == 50 || local554 == 49 && local559 == 47)) {
								this.anIntArray70[local284] = -1;
								this.anIntArray71[local284] = -1;
								local284++;
							} else {
								local570 = this.anIntArray70[local284] = this.aClass44_Sub1_1.method640(local559, local554, 0);
								if (local570 != -1) {
									this.aClass44_Sub1_1.method645(3, local570);
								}
								local1060 = this.anIntArray71[local284] = this.aClass44_Sub1_1.method640(local559, local554, 1);
								if (local1060 != -1) {
									this.aClass44_Sub1_1.method645(3, local1060);
								}
								local284++;
							}
						}
					}
					local559 = this.anInt302 - this.anInt304;
					local570 = this.anInt303 - this.anInt305;
					this.anInt304 = this.anInt302;
					this.anInt305 = this.anInt303;
					for (local1060 = 0; local1060 < 16384; local1060++) {
						@Pc(2822) Class1_Sub1_Sub1_Sub1_Sub2 local2822 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local1060];
						if (local2822 != null) {
							for (@Pc(2826) int local2826 = 0; local2826 < 10; local2826++) {
								local2822.anIntArray272[local2826] -= local559;
								local2822.anIntArray273[local2826] -= local570;
							}
							local2822.anInt1009 -= local559 * 128;
							local2822.anInt1010 -= local570 * 128;
						}
					}
					for (@Pc(2870) int local2870 = 0; local2870 < this.anInt230; local2870++) {
						@Pc(2877) Class1_Sub1_Sub1_Sub1_Sub1 local2877 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local2870];
						if (local2877 != null) {
							for (@Pc(2881) int local2881 = 0; local2881 < 10; local2881++) {
								local2877.anIntArray272[local2881] -= local559;
								local2877.anIntArray273[local2881] -= local570;
							}
							local2877.anInt1009 -= local559 * 128;
							local2877.anInt1010 -= local570 * 128;
						}
					}
					this.aBoolean56 = true;
					@Pc(2929) byte local2929 = 0;
					@Pc(2931) byte local2931 = 104;
					@Pc(2933) byte local2933 = 1;
					if (local559 < 0) {
						local2929 = 103;
						local2931 = -1;
						local2933 = -1;
					}
					@Pc(2943) byte local2943 = 0;
					@Pc(2945) byte local2945 = 104;
					@Pc(2947) byte local2947 = 1;
					if (local570 < 0) {
						local2943 = 103;
						local2945 = -1;
						local2947 = -1;
					}
					for (@Pc(2957) int local2957 = local2929; local2957 != local2931; local2957 += local2933) {
						for (@Pc(2961) int local2961 = local2943; local2961 != local2945; local2961 += local2947) {
							@Pc(2967) int local2967 = local2957 + local559;
							@Pc(2971) int local2971 = local2961 + local570;
							for (@Pc(2973) int local2973 = 0; local2973 < 4; local2973++) {
								if (local2967 >= 0 && local2971 >= 0 && local2967 < 104 && local2971 < 104) {
									this.aClass29ArrayArrayArray1[local2973][local2957][local2961] = this.aClass29ArrayArrayArray1[local2973][local2967][local2971];
								} else {
									this.aClass29ArrayArrayArray1[local2973][local2957][local2961] = null;
								}
							}
						}
					}
					for (@Pc(3035) Class1_Sub2 local3035 = (Class1_Sub2) this.aClass29_3.method511(); local3035 != null; local3035 = (Class1_Sub2) this.aClass29_3.method513()) {
						local3035.anInt803 -= local559;
						local3035.anInt804 -= local570;
						if (local3035.anInt803 < 0 || local3035.anInt804 < 0 || local3035.anInt803 >= 104 || local3035.anInt804 >= 104) {
							local3035.method673();
						}
					}
					if (this.anInt285 != 0) {
						this.anInt285 -= local559;
						this.anInt286 -= local570;
					}
					this.aBoolean51 = false;
					this.anInt315 = -1;
					return true;
				}
				if (this.anInt315 == 141) {
					local276 = this.aClass1_Sub1_Sub3_3.method482();
					local280 = this.aClass1_Sub1_Sub3_3.method480();
					if (local276 == 65535) {
						local276 = -1;
					}
					this.anIntArray74[local280] = local276;
					this.aBoolean87 = true;
					this.aBoolean66 = true;
					this.anInt315 = -1;
					return true;
				}
				if (this.anInt315 == 226) {
					for (local276 = 0; local276 < this.anIntArray81.length; local276++) {
						if (this.anIntArray81[local276] != this.anIntArray80[local276]) {
							this.anIntArray81[local276] = this.anIntArray80[local276];
							this.method133(this.anInt224, local276);
							this.aBoolean87 = true;
						}
					}
					this.anInt315 = -1;
					return true;
				}
				if (this.anInt315 == 138) {
					this.aBoolean51 = false;
					for (local276 = 0; local276 < 5; local276++) {
						this.aBooleanArray4[local276] = false;
					}
					this.anInt315 = -1;
					return true;
				}
				if (this.anInt315 == 196) {
					this.method102(this.aClass1_Sub1_Sub3_3, this.aByte10, this.anInt314);
					this.aBoolean56 = false;
					this.anInt315 = -1;
					return true;
				}
				if (this.anInt315 == 62) {
					this.aBoolean73 = false;
					this.aBoolean78 = true;
					this.aString10 = "";
					this.aBoolean68 = true;
					this.anInt315 = -1;
					return true;
				}
				if (this.anInt315 == 246) {
					local276 = this.aClass1_Sub1_Sub3_3.method483();
					if (local276 >= 0) {
						this.method178(local276);
					}
					this.anInt348 = local276;
					this.anInt315 = -1;
					return true;
				}
				if (this.anInt315 == 19) {
					this.anInt251 = this.aClass1_Sub1_Sub3_3.method480();
					this.anInt315 = -1;
					return true;
				}
				if (this.anInt315 == 204) {
					local276 = this.aClass1_Sub1_Sub3_3.method482();
					local843 = Class6.aClass6Array1[local276];
					for (local284 = 0; local284 < local843.anIntArray94.length; local284++) {
						local843.anIntArray94[local284] = -1;
						local843.anIntArray94[local284] = 0;
					}
					this.anInt315 = -1;
					return true;
				}
				if (this.anInt315 == 94) {
					local276 = this.aClass1_Sub1_Sub3_3.method482();
					Class6.aClass6Array1[local276].anInt450 = 3;
					if (aClass1_Sub1_Sub1_Sub1_Sub1_1.aClass13_1 == null) {
						Class6.aClass6Array1[local276].anInt451 = (aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray14[0] << 25) + (aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray14[4] << 20) + (aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray13[0] << 15) + (aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray13[8] << 10) + (aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray13[11] << 5) + aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray13[1];
					} else {
						Class6.aClass6Array1[local276].anInt451 = (int) (aClass1_Sub1_Sub1_Sub1_Sub1_1.aClass13_1.aLong23 + 305419896L);
					}
					this.anInt315 = -1;
					return true;
				}
				if (this.anInt315 == 213) {
					local276 = this.aClass1_Sub1_Sub3_3.method482();
					@Pc(3400) byte local3400 = this.aClass1_Sub1_Sub3_3.method481();
					this.anIntArray80[local276] = local3400;
					if (this.anIntArray81[local276] != local3400) {
						this.anIntArray81[local276] = local3400;
						this.method133(this.anInt224, local276);
						this.aBoolean87 = true;
						if (this.anInt263 != -1) {
							this.aBoolean68 = true;
						}
					}
					this.anInt315 = -1;
					return true;
				}
				if (this.anInt315 == 119) {
					this.anInt307 = this.aClass1_Sub1_Sub3_3.method485();
					this.anInt325 = this.aClass1_Sub1_Sub3_3.method482();
					this.anInt273 = this.aClass1_Sub1_Sub3_3.method480();
					this.anInt375 = this.aClass1_Sub1_Sub3_3.method482();
					this.anInt319 = this.aClass1_Sub1_Sub3_3.method480();
					if (this.anInt307 != 0 && this.anInt386 == -1) {
						signlink.dnslookup(Class48.method670(this.anInt307));
						this.method100();
						@Pc(3482) short local3482 = 650;
						if (this.anInt273 != 201 || this.anInt319 == 1) {
							local3482 = 655;
						}
						this.aString5 = "";
						this.aBoolean93 = false;
						for (local280 = 0; local280 < Class6.aClass6Array1.length; local280++) {
							if (Class6.aClass6Array1[local280] != null && Class6.aClass6Array1[local280].anInt435 == local3482) {
								this.anInt386 = Class6.aClass6Array1[local280].anInt432;
								break;
							}
						}
					}
					this.anInt315 = -1;
					return true;
				}
				if (this.anInt315 == 27) {
					if (this.anInt308 == 12) {
						this.aBoolean87 = true;
					}
					this.anInt268 = this.aClass1_Sub1_Sub3_3.method480();
					this.anInt315 = -1;
					return true;
				}
				if (this.anInt315 == 237) {
					local276 = this.aClass1_Sub1_Sub3_3.method482();
					this.method178(local276);
					if (this.anInt235 != -1) {
						this.anInt235 = -1;
						this.aBoolean68 = true;
					}
					if (this.aBoolean78) {
						this.aBoolean78 = false;
						this.aBoolean68 = true;
					}
					this.anInt383 = local276;
					this.aBoolean87 = true;
					this.aBoolean66 = true;
					this.anInt386 = -1;
					this.aBoolean92 = false;
					this.anInt315 = -1;
					return true;
				}
				if (this.anInt315 == 45) {
					local276 = this.aClass1_Sub1_Sub3_3.method482();
					local280 = this.aClass1_Sub1_Sub3_3.method480();
					local284 = this.aClass1_Sub1_Sub3_3.method482();
					if (this.aBoolean81 && !aBoolean77 && this.anInt407 < 50) {
						this.anIntArray38[this.anInt407] = local276;
						this.anIntArray85[this.anInt407] = local280;
						this.anIntArray41[this.anInt407] = local284 + Class5.anIntArray29[local276];
						this.anInt407++;
					}
					this.anInt315 = -1;
					return true;
				}
				if (this.anInt315 == 115) {
					this.aBoolean51 = true;
					this.anInt288 = this.aClass1_Sub1_Sub3_3.method480();
					this.anInt289 = this.aClass1_Sub1_Sub3_3.method480();
					this.anInt290 = this.aClass1_Sub1_Sub3_3.method482();
					this.anInt291 = this.aClass1_Sub1_Sub3_3.method480();
					this.anInt292 = this.aClass1_Sub1_Sub3_3.method480();
					if (this.anInt292 >= 100) {
						this.anInt274 = this.anInt288 * 128 + 64;
						this.anInt276 = this.anInt289 * 128 + 64;
						this.anInt275 = this.method200(this.anInt274, this.anInt355, this.anInt276) - this.anInt290;
					}
					this.anInt315 = -1;
					return true;
				}
				if (this.anInt315 == 169) {
					local276 = this.aClass1_Sub1_Sub3_3.method482();
					local1788 = this.aClass1_Sub1_Sub3_3.method487();
					Class6.aClass6Array1[local276].aString18 = local1788;
					if (Class6.aClass6Array1[local276].anInt432 == this.anIntArray74[this.anInt308]) {
						this.aBoolean87 = true;
					}
					this.anInt315 = -1;
					return true;
				}
				signlink.reporterror("T1 - " + this.anInt315 + "," + this.anInt314 + " - " + this.anInt222 + "," + this.anInt223);
				this.method171();
			} catch (@Pc(3795) IOException local3795) {
				this.method103(this.aBoolean62);
			} catch (@Pc(3801) Exception local3801) {
				local1777 = "T2 - " + this.anInt315 + "," + this.anInt222 + "," + this.anInt223 + " - " + this.anInt314 + "," + (this.anInt302 + aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray272[0]) + "," + (this.anInt303 + aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray273[0]) + " - ";
				for (local280 = 0; local280 < this.anInt314 && local280 < 50; local280++) {
					local1777 = local1777 + this.aClass1_Sub1_Sub3_3.aByteArray9[local280] + ",";
				}
				signlink.reporterror(local1777);
				this.method171();
			}
			return true;
		} catch (@Pc(3882) RuntimeException local3882) {
			signlink.reporterror("49078, " + arg0 + ", " + local3882.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "F", descriptor = "(I)Z")
	private boolean method226() {
		try {
			return signlink.wavereplay();
		} catch (@Pc(7) RuntimeException local7) {
			signlink.reporterror("18719, " + 484 + ", " + local7.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Z)V")
	@Override
	protected void method90() {
		try {
			if (!this.aBoolean89 && !this.aBoolean94 && !this.aBoolean88) {
				anInt252++;
				if (this.aBoolean71) {
					this.method104();
				} else {
					this.method214();
				}
				this.method189();
			}
		} catch (@Pc(34) RuntimeException local34) {
			signlink.reporterror("61852, " + false + ", " + local34.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "()V")
	@Override
	protected void method89() {
		this.method96(20, "Starting up");
		if (signlink.sunjava) {
			super.anInt202 = 5;
		}
		if (aBoolean57) {
			this.aBoolean89 = true;
			return;
		}
		aBoolean57 = true;
		@Pc(21) boolean local21 = false;
		@Pc(25) String local25 = this.method129();
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
			this.aBoolean88 = true;
			return;
		}
		if (signlink.aRandomAccessFile1 != null) {
			for (@Pc(95) int local95 = 0; local95 < 5; local95++) {
				this.aClass45Array1[local95] = new Class45(-490, signlink.aRandomAccessFileArray1[local95], signlink.aRandomAccessFile1, 500000, local95 + 1);
			}
		}
		try {
			this.method188();
			this.aClass47_1 = this.method197(1, "title", "title screen", 25, this.anIntArray56[1]);
			this.aClass1_Sub1_Sub2_Sub4_1 = new Class1_Sub1_Sub2_Sub4(false, false, "p11_full", this.aClass47_1);
			this.aClass1_Sub1_Sub2_Sub4_2 = new Class1_Sub1_Sub2_Sub4(false, false, "p12_full", this.aClass47_1);
			this.aClass1_Sub1_Sub2_Sub4_3 = new Class1_Sub1_Sub2_Sub4(false, false, "b12_full", this.aClass47_1);
			this.aClass1_Sub1_Sub2_Sub4_4 = new Class1_Sub1_Sub2_Sub4(true, false, "q8_full", this.aClass47_1);
			this.method219(anInt391);
			this.method117();
			@Pc(191) Class47 local191 = this.method197(2, "config", "config", 30, this.anIntArray56[2]);
			@Pc(203) Class47 local203 = this.method197(3, "interface", "interface", 35, this.anIntArray56[3]);
			@Pc(215) Class47 local215 = this.method197(4, "media", "2d graphics", 40, this.anIntArray56[4]);
			@Pc(227) Class47 local227 = this.method197(6, "textures", "textures", 45, this.anIntArray56[6]);
			@Pc(239) Class47 local239 = this.method197(7, "wordenc", "chat system", 50, this.anIntArray56[7]);
			@Pc(251) Class47 local251 = this.method197(8, "sounds", "sound effects", 55, this.anIntArray56[8]);
			this.aByteArrayArrayArray7 = new byte[4][104][104];
			this.anIntArrayArrayArray5 = new int[4][105][105];
			this.aClass37_1 = new Class37(this.anIntArrayArrayArray5, 104, 4, 119, 104);
			for (@Pc(276) int local276 = 0; local276 < 4; local276++) {
				this.aClass19Array1[local276] = new Class19(true, 104, 104);
			}
			this.aClass1_Sub1_Sub2_Sub2_3 = new Class1_Sub1_Sub2_Sub2(512, 512);
			@Pc(311) Class47 local311 = this.method197(5, "versionlist", "update list", 60, this.anIntArray56[5]);
			this.method96(60, "Connecting to update server");
			this.aClass44_Sub1_1 = new Class44_Sub1();
			this.aClass44_Sub1_1.method636(local311, this);
			Class12.method302(this.aClass44_Sub1_1.method639());
			Class1_Sub1_Sub1_Sub5.method258(this.aClass44_Sub1_1.method638(0, 763), this.aClass44_Sub1_1);
			if (!aBoolean77) {
				this.anInt260 = 0;
				try {
					this.anInt260 = Integer.parseInt(this.getParameter("music"));
				} catch (@Pc(352) Exception local352) {
				}
				this.aBoolean61 = true;
				this.aClass44_Sub1_1.method645(2, this.anInt260);
				while (this.aClass44_Sub1_1.method646() > 0) {
					this.method189();
					try {
						Thread.sleep(100L);
					} catch (@Pc(370) Exception local370) {
					}
					if (this.aClass44_Sub1_1.anInt971 > 3) {
						this.method153("ondemand");
						return;
					}
				}
			}
			this.method96(65, "Requesting animations");
			@Pc(394) int local394 = this.aClass44_Sub1_1.method638(1, 763);
			for (@Pc(396) int local396 = 0; local396 < local394; local396++) {
				this.aClass44_Sub1_1.method645(1, local396);
			}
			@Pc(414) int local414;
			while (this.aClass44_Sub1_1.method646() > 0) {
				local414 = local394 - this.aClass44_Sub1_1.method646();
				if (local414 > 0) {
					this.method96(65, "Loading animations - " + local414 * 100 / local394 + "%");
				}
				this.method189();
				try {
					Thread.sleep(100L);
				} catch (@Pc(440) Exception local440) {
				}
				if (this.aClass44_Sub1_1.anInt971 > 3) {
					this.method153("ondemand");
					return;
				}
			}
			this.method96(70, "Requesting models");
			local394 = this.aClass44_Sub1_1.method638(0, 763);
			@Pc(474) int local474;
			for (local414 = 0; local414 < local394; local414++) {
				local474 = this.aClass44_Sub1_1.method643(local414);
				if ((local474 & 0x1) != 0) {
					this.aClass44_Sub1_1.method645(0, local414);
				}
			}
			local394 = this.aClass44_Sub1_1.method646();
			while (this.aClass44_Sub1_1.method646() > 0) {
				local474 = local394 - this.aClass44_Sub1_1.method646();
				if (local474 > 0) {
					this.method96(70, "Loading models - " + local474 * 100 / local394 + "%");
				}
				this.method189();
				try {
					Thread.sleep(100L);
				} catch (@Pc(525) Exception local525) {
				}
			}
			if (this.aClass45Array1[0] != null) {
				this.method96(75, "Requesting maps");
				this.aClass44_Sub1_1.method645(3, this.aClass44_Sub1_1.method640(48, 47, 0));
				this.aClass44_Sub1_1.method645(3, this.aClass44_Sub1_1.method640(48, 47, 1));
				this.aClass44_Sub1_1.method645(3, this.aClass44_Sub1_1.method640(48, 48, 0));
				this.aClass44_Sub1_1.method645(3, this.aClass44_Sub1_1.method640(48, 48, 1));
				this.aClass44_Sub1_1.method645(3, this.aClass44_Sub1_1.method640(48, 49, 0));
				this.aClass44_Sub1_1.method645(3, this.aClass44_Sub1_1.method640(48, 49, 1));
				this.aClass44_Sub1_1.method645(3, this.aClass44_Sub1_1.method640(47, 47, 0));
				this.aClass44_Sub1_1.method645(3, this.aClass44_Sub1_1.method640(47, 47, 1));
				this.aClass44_Sub1_1.method645(3, this.aClass44_Sub1_1.method640(47, 48, 0));
				this.aClass44_Sub1_1.method645(3, this.aClass44_Sub1_1.method640(47, 48, 1));
				this.aClass44_Sub1_1.method645(3, this.aClass44_Sub1_1.method640(148, 48, 0));
				this.aClass44_Sub1_1.method645(3, this.aClass44_Sub1_1.method640(148, 48, 1));
				local394 = this.aClass44_Sub1_1.method646();
				while (this.aClass44_Sub1_1.method646() > 0) {
					local474 = local394 - this.aClass44_Sub1_1.method646();
					if (local474 > 0) {
						this.method96(75, "Loading maps - " + local474 * 100 / local394 + "%");
					}
					this.method189();
					try {
						Thread.sleep(100L);
					} catch (@Pc(710) Exception local710) {
					}
				}
			}
			local394 = this.aClass44_Sub1_1.method638(0, 763);
			@Pc(731) int local731;
			for (local474 = 0; local474 < local394; local474++) {
				local731 = this.aClass44_Sub1_1.method643(local474);
				@Pc(733) byte local733 = 0;
				if ((local731 & 0x8) != 0) {
					local733 = 10;
				} else if ((local731 & 0x20) != 0) {
					local733 = 9;
				} else if ((local731 & 0x10) != 0) {
					local733 = 8;
				} else if ((local731 & 0x40) != 0) {
					local733 = 7;
				} else if ((local731 & 0x80) != 0) {
					local733 = 6;
				} else if ((local731 & 0x2) != 0) {
					local733 = 5;
				} else if ((local731 & 0x4) != 0) {
					local733 = 4;
				}
				if ((local731 & 0x1) != 0) {
					local733 = 3;
				}
				if (local733 != 0) {
					this.aClass44_Sub1_1.method648(local474, local733, 0);
				}
			}
			this.aClass44_Sub1_1.method641(anInt269, aBoolean76);
			if (!aBoolean77) {
				local394 = this.aClass44_Sub1_1.method638(2, 763);
				for (local731 = 1; local731 < local394; local731++) {
					if (this.aClass44_Sub1_1.method644(local731)) {
						this.aClass44_Sub1_1.method648(local731, (byte) 1, 2);
					}
				}
			}
			this.method96(80, "Unpacking media");
			this.aClass1_Sub1_Sub2_Sub3_6 = new Class1_Sub1_Sub2_Sub3(local215, "invback", 0);
			this.aClass1_Sub1_Sub2_Sub3_8 = new Class1_Sub1_Sub2_Sub3(local215, "chatback", 0);
			this.aClass1_Sub1_Sub2_Sub3_7 = new Class1_Sub1_Sub2_Sub3(local215, "mapback", 0);
			this.aClass1_Sub1_Sub2_Sub3_16 = new Class1_Sub1_Sub2_Sub3(local215, "backbase1", 0);
			this.aClass1_Sub1_Sub2_Sub3_17 = new Class1_Sub1_Sub2_Sub3(local215, "backbase2", 0);
			this.aClass1_Sub1_Sub2_Sub3_18 = new Class1_Sub1_Sub2_Sub3(local215, "backhmid1", 0);
			for (local731 = 0; local731 < 13; local731++) {
				this.aClass1_Sub1_Sub2_Sub3Array4[local731] = new Class1_Sub1_Sub2_Sub3(local215, "sideicons", local731);
			}
			this.aClass1_Sub1_Sub2_Sub2_4 = new Class1_Sub1_Sub2_Sub2(local215, "compass", 0);
			this.aClass1_Sub1_Sub2_Sub2_7 = new Class1_Sub1_Sub2_Sub2(local215, "mapedge", 0);
			this.aClass1_Sub1_Sub2_Sub2_7.method388();
			@Pc(933) int local933;
			try {
				for (local933 = 0; local933 < 100; local933++) {
					this.aClass1_Sub1_Sub2_Sub3Array3[local933] = new Class1_Sub1_Sub2_Sub3(local215, "mapscene", local933);
				}
			} catch (@Pc(951) Exception local951) {
			}
			try {
				for (local933 = 0; local933 < 100; local933++) {
					this.aClass1_Sub1_Sub2_Sub2Array4[local933] = new Class1_Sub1_Sub2_Sub2(local215, "mapfunction", local933);
				}
			} catch (@Pc(971) Exception local971) {
			}
			try {
				for (local933 = 0; local933 < 20; local933++) {
					this.aClass1_Sub1_Sub2_Sub2Array6[local933] = new Class1_Sub1_Sub2_Sub2(local215, "hitmarks", local933);
				}
			} catch (@Pc(991) Exception local991) {
			}
			try {
				for (local933 = 0; local933 < 20; local933++) {
					this.aClass1_Sub1_Sub2_Sub2Array7[local933] = new Class1_Sub1_Sub2_Sub2(local215, "headicons", local933);
				}
			} catch (@Pc(1011) Exception local1011) {
			}
			this.aClass1_Sub1_Sub2_Sub2_1 = new Class1_Sub1_Sub2_Sub2(local215, "mapmarker", 0);
			this.aClass1_Sub1_Sub2_Sub2_2 = new Class1_Sub1_Sub2_Sub2(local215, "mapmarker", 1);
			for (local933 = 0; local933 < 8; local933++) {
				this.aClass1_Sub1_Sub2_Sub2Array3[local933] = new Class1_Sub1_Sub2_Sub2(local215, "cross", local933);
			}
			this.aClass1_Sub1_Sub2_Sub2_10 = new Class1_Sub1_Sub2_Sub2(local215, "mapdots", 0);
			this.aClass1_Sub1_Sub2_Sub2_11 = new Class1_Sub1_Sub2_Sub2(local215, "mapdots", 1);
			this.aClass1_Sub1_Sub2_Sub2_12 = new Class1_Sub1_Sub2_Sub2(local215, "mapdots", 2);
			this.aClass1_Sub1_Sub2_Sub2_13 = new Class1_Sub1_Sub2_Sub2(local215, "mapdots", 3);
			this.aClass1_Sub1_Sub2_Sub3_14 = new Class1_Sub1_Sub2_Sub3(local215, "scrollbar", 0);
			this.aClass1_Sub1_Sub2_Sub3_15 = new Class1_Sub1_Sub2_Sub3(local215, "scrollbar", 1);
			this.aClass1_Sub1_Sub2_Sub3_1 = new Class1_Sub1_Sub2_Sub3(local215, "redstone1", 0);
			this.aClass1_Sub1_Sub2_Sub3_2 = new Class1_Sub1_Sub2_Sub3(local215, "redstone2", 0);
			this.aClass1_Sub1_Sub2_Sub3_3 = new Class1_Sub1_Sub2_Sub3(local215, "redstone3", 0);
			this.aClass1_Sub1_Sub2_Sub3_4 = new Class1_Sub1_Sub2_Sub3(local215, "redstone1", 0);
			this.aClass1_Sub1_Sub2_Sub3_4.method415(aByte14);
			this.aClass1_Sub1_Sub2_Sub3_5 = new Class1_Sub1_Sub2_Sub3(local215, "redstone2", 0);
			this.aClass1_Sub1_Sub2_Sub3_5.method415(aByte14);
			this.aClass1_Sub1_Sub2_Sub3_9 = new Class1_Sub1_Sub2_Sub3(local215, "redstone1", 0);
			this.aClass1_Sub1_Sub2_Sub3_9.method416((byte) 2);
			this.aClass1_Sub1_Sub2_Sub3_10 = new Class1_Sub1_Sub2_Sub3(local215, "redstone2", 0);
			this.aClass1_Sub1_Sub2_Sub3_10.method416((byte) 2);
			this.aClass1_Sub1_Sub2_Sub3_11 = new Class1_Sub1_Sub2_Sub3(local215, "redstone3", 0);
			this.aClass1_Sub1_Sub2_Sub3_11.method416((byte) 2);
			this.aClass1_Sub1_Sub2_Sub3_12 = new Class1_Sub1_Sub2_Sub3(local215, "redstone1", 0);
			this.aClass1_Sub1_Sub2_Sub3_12.method415(aByte14);
			this.aClass1_Sub1_Sub2_Sub3_12.method416((byte) 2);
			this.aClass1_Sub1_Sub2_Sub3_13 = new Class1_Sub1_Sub2_Sub3(local215, "redstone2", 0);
			this.aClass1_Sub1_Sub2_Sub3_13.method415(aByte14);
			this.aClass1_Sub1_Sub2_Sub3_13.method416((byte) 2);
			for (@Pc(1211) int local1211 = 0; local1211 < 2; local1211++) {
				this.aClass1_Sub1_Sub2_Sub3Array2[local1211] = new Class1_Sub1_Sub2_Sub3(local215, "mod_icons", local1211);
			}
			@Pc(1234) Class1_Sub1_Sub2_Sub2 local1234 = new Class1_Sub1_Sub2_Sub2(local215, "backleft1", 0);
			this.aClass35_3 = new Class35(500, local1234.anInt667, this.method94(), local1234.anInt668);
			local1234.method389(0, 0);
			@Pc(1259) Class1_Sub1_Sub2_Sub2 local1259 = new Class1_Sub1_Sub2_Sub2(local215, "backleft2", 0);
			this.aClass35_4 = new Class35(500, local1259.anInt667, this.method94(), local1259.anInt668);
			local1259.method389(0, 0);
			@Pc(1284) Class1_Sub1_Sub2_Sub2 local1284 = new Class1_Sub1_Sub2_Sub2(local215, "backright1", 0);
			this.aClass35_5 = new Class35(500, local1284.anInt667, this.method94(), local1284.anInt668);
			local1284.method389(0, 0);
			@Pc(1309) Class1_Sub1_Sub2_Sub2 local1309 = new Class1_Sub1_Sub2_Sub2(local215, "backright2", 0);
			this.aClass35_6 = new Class35(500, local1309.anInt667, this.method94(), local1309.anInt668);
			local1309.method389(0, 0);
			@Pc(1334) Class1_Sub1_Sub2_Sub2 local1334 = new Class1_Sub1_Sub2_Sub2(local215, "backtop1", 0);
			this.aClass35_7 = new Class35(500, local1334.anInt667, this.method94(), local1334.anInt668);
			local1334.method389(0, 0);
			@Pc(1359) Class1_Sub1_Sub2_Sub2 local1359 = new Class1_Sub1_Sub2_Sub2(local215, "backvmid1", 0);
			this.aClass35_8 = new Class35(500, local1359.anInt667, this.method94(), local1359.anInt668);
			local1359.method389(0, 0);
			@Pc(1384) Class1_Sub1_Sub2_Sub2 local1384 = new Class1_Sub1_Sub2_Sub2(local215, "backvmid2", 0);
			this.aClass35_9 = new Class35(500, local1384.anInt667, this.method94(), local1384.anInt668);
			local1384.method389(0, 0);
			@Pc(1409) Class1_Sub1_Sub2_Sub2 local1409 = new Class1_Sub1_Sub2_Sub2(local215, "backvmid3", 0);
			this.aClass35_10 = new Class35(500, local1409.anInt667, this.method94(), local1409.anInt668);
			local1409.method389(0, 0);
			@Pc(1434) Class1_Sub1_Sub2_Sub2 local1434 = new Class1_Sub1_Sub2_Sub2(local215, "backhmid2", 0);
			this.aClass35_11 = new Class35(500, local1434.anInt667, this.method94(), local1434.anInt668);
			local1434.method389(0, 0);
			@Pc(1459) int local1459 = (int) (Math.random() * 21.0D) - 10;
			@Pc(1466) int local1466 = (int) (Math.random() * 21.0D) - 10;
			@Pc(1473) int local1473 = (int) (Math.random() * 21.0D) - 10;
			@Pc(1480) int local1480 = (int) (Math.random() * 41.0D) - 20;
			for (@Pc(1482) int local1482 = 0; local1482 < 100; local1482++) {
				if (this.aClass1_Sub1_Sub2_Sub2Array4[local1482] != null) {
					this.aClass1_Sub1_Sub2_Sub2Array4[local1482].method387(local1459 + local1480, local1466 + local1480, local1473 + local1480, 908);
				}
				if (this.aClass1_Sub1_Sub2_Sub3Array3[local1482] != null) {
					this.aClass1_Sub1_Sub2_Sub3Array3[local1482].method417(local1459 + local1480, local1466 + local1480, local1473 + local1480);
				}
			}
			this.method96(83, "Unpacking textures");
			Class1_Sub1_Sub2_Sub1.method347(local227, aByte3);
			Class1_Sub1_Sub2_Sub1.method351(0.8D);
			Class1_Sub1_Sub2_Sub1.method346();
			this.method96(86, "Unpacking config");
			Class27.method505(local191);
			Class9.method286(local191);
			Class21.method462(local191);
			Class15.method359(local191);
			Class13.method321(local191);
			Class23.method496(local191);
			Class33.method521(local191);
			Class39.method589(local191);
			Class36.method527(local191);
			Class15.aBoolean165 = aBoolean76;
			if (!aBoolean77) {
				this.method96(90, "Unpacking sounds");
				@Pc(1585) byte[] local1585 = local251.method666("sounds.dat", null);
				@Pc(1591) Class1_Sub1_Sub3 local1591 = new Class1_Sub1_Sub3(-49365, local1585);
				Class5.method78(local1591);
			}
			this.method96(95, "Unpacking interfaces");
			@Pc(1622) Class1_Sub1_Sub2_Sub4[] local1622 = new Class1_Sub1_Sub2_Sub4[] { this.aClass1_Sub1_Sub2_Sub4_1, this.aClass1_Sub1_Sub2_Sub4_2, this.aClass1_Sub1_Sub2_Sub4_3, this.aClass1_Sub1_Sub2_Sub4_4 };
			Class6.method231(local215, local203, local1622);
			this.method96(100, "Preparing game engine");
			@Pc(1638) int local1638;
			@Pc(1640) int local1640;
			@Pc(1642) int local1642;
			for (@Pc(1634) int local1634 = 0; local1634 < 33; local1634++) {
				local1638 = 999;
				local1640 = 0;
				for (local1642 = 0; local1642 < 34; local1642++) {
					if (this.aClass1_Sub1_Sub2_Sub3_7.aByteArray7[local1642 + local1634 * this.aClass1_Sub1_Sub2_Sub3_7.anInt695] == 0) {
						if (local1638 == 999) {
							local1638 = local1642;
						}
					} else if (local1638 != 999) {
						local1640 = local1642;
						break;
					}
				}
				this.anIntArray86[local1634] = local1638;
				this.anIntArray57[local1634] = local1640 - local1638;
			}
			@Pc(1700) int local1700;
			for (local1638 = 5; local1638 < 156; local1638++) {
				local1640 = 999;
				local1642 = 0;
				for (local1700 = 25; local1700 < 172; local1700++) {
					if (this.aClass1_Sub1_Sub2_Sub3_7.aByteArray7[local1700 + local1638 * this.aClass1_Sub1_Sub2_Sub3_7.anInt695] == 0 && (local1700 > 34 || local1638 > 34)) {
						if (local1640 == 999) {
							local1640 = local1700;
						}
					} else if (local1640 != 999) {
						local1642 = local1700;
						break;
					}
				}
				this.anIntArray92[local1638 - 5] = local1640 - 25;
				this.anIntArray79[local1638 - 5] = local1642 - local1640;
			}
			Class1_Sub1_Sub2_Sub1.method344(96, 479);
			this.anIntArray66 = Class1_Sub1_Sub2_Sub1.anIntArray180;
			Class1_Sub1_Sub2_Sub1.method344(261, 190);
			this.anIntArray67 = Class1_Sub1_Sub2_Sub1.anIntArray180;
			Class1_Sub1_Sub2_Sub1.method344(334, 512);
			this.anIntArray68 = Class1_Sub1_Sub2_Sub1.anIntArray180;
			@Pc(1784) int[] local1784 = new int[9];
			for (local1642 = 0; local1642 < 9; local1642++) {
				local1700 = local1642 * 32 + 128 + 15;
				@Pc(1802) int local1802 = local1700 * 3 + 600;
				@Pc(1806) int local1806 = Class1_Sub1_Sub2_Sub1.anIntArray178[local1700];
				local1784[local1642] = local1802 * local1806 >> 16;
			}
			Class37.method566(local1784);
			Class42.method594(local239);
			this.aClass11_1 = new Class11(489, this);
			this.method95(this.aClass11_1, 10);
			Class1_Sub1_Sub1_Sub2.aClient1 = this;
			Class9.aClient2 = this;
			Class13.aClient4 = this;
		} catch (@Pc(1847) Exception local1847) {
			signlink.reporterror("loaderror " + this.aString8 + " " + this.anInt237);
			this.aBoolean94 = true;
		}
	}

	@OriginalMember(owner = "client!client", name = "v", descriptor = "(Z)V")
	private void method228(@OriginalArg(0) boolean arg0) {
		try {
			if (this.anInt336 == 0) {
				@Pc(6) int local6 = super.anInt213;
				if (arg0) {
					this.anInt315 = this.aClass1_Sub1_Sub3_3.method480();
				}
				if (this.anInt326 == 1 && super.anInt214 >= 516 && super.anInt215 >= 160 && super.anInt214 <= 765 && super.anInt215 <= 205) {
					local6 = 0;
				}
				@Pc(44) int local44;
				@Pc(47) int local47;
				@Pc(123) int local123;
				if (this.aBoolean64) {
					if (local6 != 1) {
						local44 = super.anInt208;
						local47 = super.anInt209;
						if (this.anInt370 == 0) {
							local44 -= 4;
							local47 -= 4;
						}
						if (this.anInt370 == 1) {
							local44 -= 553;
							local47 -= 205;
						}
						if (this.anInt370 == 2) {
							local44 -= 17;
							local47 -= 357;
						}
						if (local44 < this.anInt371 - 10 || local44 > this.anInt371 + this.anInt373 + 10 || local47 < this.anInt372 - 10 || local47 > this.anInt372 + this.anInt374 + 10) {
							this.aBoolean64 = false;
							if (this.anInt370 == 1) {
								this.aBoolean87 = true;
							}
							if (this.anInt370 == 2) {
								this.aBoolean68 = true;
							}
						}
					}
					if (local6 == 1) {
						local44 = this.anInt371;
						local47 = this.anInt372;
						local123 = this.anInt373;
						@Pc(126) int local126 = super.anInt214;
						@Pc(129) int local129 = super.anInt215;
						if (this.anInt370 == 0) {
							local126 -= 4;
							local129 -= 4;
						}
						if (this.anInt370 == 1) {
							local126 -= 553;
							local129 -= 205;
						}
						if (this.anInt370 == 2) {
							local126 -= 17;
							local129 -= 357;
						}
						@Pc(148) int local148 = -1;
						for (@Pc(150) int local150 = 0; local150 < this.anInt329; local150++) {
							@Pc(165) int local165 = local47 + (this.anInt329 - 1 - local150) * 15 + 31;
							if (local126 > local44 && local126 < local44 + local123 && local129 > local165 - 13 && local129 < local165 + 3) {
								local148 = local150;
							}
						}
						if (local148 != -1) {
							this.method97(local148);
						}
						this.aBoolean64 = false;
						if (this.anInt370 == 1) {
							this.aBoolean87 = true;
						}
						if (this.anInt370 == 2) {
							this.aBoolean68 = true;
							return;
						}
					}
				} else {
					if (local6 == 1 && this.anInt329 > 0) {
						local44 = this.anIntArray62[this.anInt329 - 1];
						if (local44 == 582 || local44 == 113 || local44 == 555 || local44 == 331 || local44 == 354 || local44 == 694 || local44 == 962 || local44 == 795 || local44 == 681 || local44 == 100 || local44 == 102 || local44 == 1328) {
							local47 = this.anIntArray60[this.anInt329 - 1];
							local123 = this.anIntArray61[this.anInt329 - 1];
							@Pc(285) Class6 local285 = Class6.aClass6Array1[local123];
							if (local285.aBoolean101 || local285.aBoolean104) {
								this.aBoolean59 = false;
								this.anInt382 = 0;
								this.anInt334 = local123;
								this.anInt335 = local47;
								this.anInt336 = 2;
								this.anInt337 = super.anInt214;
								this.anInt338 = super.anInt215;
								if (Class6.aClass6Array1[local123].anInt432 == this.anInt386) {
									this.anInt336 = 1;
								}
								if (Class6.aClass6Array1[local123].anInt432 == this.anInt235) {
									this.anInt336 = 3;
								}
								return;
							}
						}
					}
					if (local6 == 1 && (this.anInt256 == 1 || this.method224(anInt359, this.anInt329 - 1)) && this.anInt329 > 2) {
						local6 = 2;
					}
					if (local6 == 1 && this.anInt329 > 0) {
						this.method97(this.anInt329 - 1);
					}
					if (local6 != 2 || this.anInt329 <= 0) {
						return;
					}
					this.method191();
				}
			}
		} catch (@Pc(380) RuntimeException local380) {
			signlink.reporterror("58845, " + arg0 + ", " + local380.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(ILclient!lb;I)V")
	private void method229(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub1_Sub3 arg1) {
		try {
			arg1.method490();
			@Pc(14) int local14 = arg1.method491(1, this.aByte9);
			if (local14 != 0) {
				@Pc(23) int local23 = arg1.method491(2, this.aByte9);
				if (local23 == 0) {
					this.anIntArray35[this.anInt233++] = this.anInt231;
				} else {
					@Pc(47) int local47;
					@Pc(58) int local58;
					if (local23 == 1) {
						local47 = arg1.method491(3, this.aByte9);
						aClass1_Sub1_Sub1_Sub1_Sub1_1.method678(false, local47);
						local58 = arg1.method491(1, this.aByte9);
						if (local58 == 1) {
							this.anIntArray35[this.anInt233++] = this.anInt231;
						}
					} else {
						@Pc(105) int local105;
						if (local23 == 2) {
							local47 = arg1.method491(3, this.aByte9);
							aClass1_Sub1_Sub1_Sub1_Sub1_1.method678(true, local47);
							local58 = arg1.method491(3, this.aByte9);
							aClass1_Sub1_Sub1_Sub1_Sub1_1.method678(true, local58);
							local105 = arg1.method491(1, this.aByte9);
							if (local105 == 1) {
								this.anIntArray35[this.anInt233++] = this.anInt231;
							}
						} else if (local23 == 3) {
							this.anInt355 = arg1.method491(2, this.aByte9);
							local47 = arg1.method491(7, this.aByte9);
							local58 = arg1.method491(7, this.aByte9);
							local105 = arg1.method491(1, this.aByte9);
							aClass1_Sub1_Sub1_Sub1_Sub1_1.method677(local105 == 1, local47, local58);
							@Pc(166) int local166 = arg1.method491(1, this.aByte9);
							if (local166 == 1) {
								this.anIntArray35[this.anInt233++] = this.anInt231;
							}
						}
					}
				}
			}
		} catch (@Pc(183) RuntimeException local183) {
			signlink.reporterror("17885, " + arg0 + ", " + arg1 + ", " + 0 + ", " + local183.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "run", descriptor = "()V")
	@Override
	public void run() {
		if (this.aBoolean84) {
			this.method180();
		} else {
			super.run();
		}
	}

	@OriginalMember(owner = "client!client", name = "G", descriptor = "(I)V")
	private void method230() {
		try {
			signlink.anInt958 = 0;
			signlink.midi = "stop";
		} catch (@Pc(9) RuntimeException local9) {
			signlink.reporterror("92528, " + 0 + ", " + local9.toString());
			throw new RuntimeException();
		}
	}
}
