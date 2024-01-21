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

	@OriginalMember(owner = "client!client", name = "P", descriptor = "I")
	public static int anInt207;

	@OriginalMember(owner = "client!client", name = "Db", descriptor = "I")
	private static int anInt227;

	@OriginalMember(owner = "client!client", name = "pc", descriptor = "I")
	private static int anInt241;

	@OriginalMember(owner = "client!client", name = "Jc", descriptor = "I")
	private static int anInt252;

	@OriginalMember(owner = "client!client", name = "jd", descriptor = "Z")
	private static boolean aBoolean54;

	@OriginalMember(owner = "client!client", name = "ae", descriptor = "I")
	private static int anInt283;

	@OriginalMember(owner = "client!client", name = "me", descriptor = "I")
	private static int anInt288;

	@OriginalMember(owner = "client!client", name = "Be", descriptor = "I")
	private static int anInt294;

	@OriginalMember(owner = "client!client", name = "Ce", descriptor = "I")
	private static int anInt295;

	@OriginalMember(owner = "client!client", name = "hf", descriptor = "I")
	private static int anInt311;

	@OriginalMember(owner = "client!client", name = "sf", descriptor = "I")
	private static int anInt318;

	@OriginalMember(owner = "client!client", name = "Gf", descriptor = "I")
	private static int anInt321;

	@OriginalMember(owner = "client!client", name = "Dg", descriptor = "I")
	private static int anInt340;

	@OriginalMember(owner = "client!client", name = "ih", descriptor = "I")
	private static int anInt353;

	@OriginalMember(owner = "client!client", name = "Bh", descriptor = "I")
	private static int anInt363;

	@OriginalMember(owner = "client!client", name = "Hh", descriptor = "I")
	private static int anInt364;

	@OriginalMember(owner = "client!client", name = "Rh", descriptor = "Z")
	private static boolean aBoolean79;

	@OriginalMember(owner = "client!client", name = "ti", descriptor = "I")
	private static int anInt380;

	@OriginalMember(owner = "client!client", name = "Zi", descriptor = "I")
	private static int anInt399;

	@OriginalMember(owner = "client!client", name = "ej", descriptor = "I")
	private static int anInt400;

	@OriginalMember(owner = "client!client", name = "hj", descriptor = "I")
	private static int anInt403;

	@OriginalMember(owner = "client!client", name = "kj", descriptor = "I")
	public static int anInt405;

	@OriginalMember(owner = "client!client", name = "mj", descriptor = "Z")
	private static boolean aBoolean87;

	@OriginalMember(owner = "client!client", name = "yj", descriptor = "Lclient!ab;")
	public static Class1_Sub1_Sub1_Sub1_Sub1 aClass1_Sub1_Sub1_Sub1_Sub1_1;

	@OriginalMember(owner = "client!client", name = "U", descriptor = "Ljava/lang/String;")
	private static String aString4 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";

	@OriginalMember(owner = "client!client", name = "W", descriptor = "[I")
	private static int[] anIntArray32 = new int[32];

	@OriginalMember(owner = "client!client", name = "Kc", descriptor = "I")
	private static int anInt253;

	@OriginalMember(owner = "client!client", name = "xd", descriptor = "I")
	private static int anInt273;

	@OriginalMember(owner = "client!client", name = "Rd", descriptor = "Z")
	private static boolean aBoolean59;

	@OriginalMember(owner = "client!client", name = "Re", descriptor = "Ljava/math/BigInteger;")
	private static BigInteger aBigInteger1;

	@OriginalMember(owner = "client!client", name = "Ef", descriptor = "Ljava/math/BigInteger;")
	private static BigInteger aBigInteger2;

	@OriginalMember(owner = "client!client", name = "Eg", descriptor = "B")
	private static byte aByte17;

	@OriginalMember(owner = "client!client", name = "kh", descriptor = "[I")
	public static final int[] anIntArray78;

	@OriginalMember(owner = "client!client", name = "Wi", descriptor = "I")
	private static int anInt398;

	@OriginalMember(owner = "client!client", name = "ij", descriptor = "[I")
	private static int[] anIntArray87;

	@OriginalMember(owner = "client!client", name = "jj", descriptor = "I")
	private static int anInt404;

	@OriginalMember(owner = "client!client", name = "lj", descriptor = "Z")
	private static boolean aBoolean86;

	@OriginalMember(owner = "client!client", name = "nj", descriptor = "[[I")
	public static final int[][] anIntArrayArray6;

	@OriginalMember(owner = "client!client", name = "K", descriptor = "I")
	private int anInt205;

	@OriginalMember(owner = "client!client", name = "Q", descriptor = "I")
	private int anInt208;

	@OriginalMember(owner = "client!client", name = "S", descriptor = "I")
	private int anInt209;

	@OriginalMember(owner = "client!client", name = "V", descriptor = "I")
	private int anInt211;

	@OriginalMember(owner = "client!client", name = "Y", descriptor = "I")
	private int anInt212;

	@OriginalMember(owner = "client!client", name = "Z", descriptor = "I")
	private int anInt213;

	@OriginalMember(owner = "client!client", name = "ab", descriptor = "I")
	private int anInt214;

	@OriginalMember(owner = "client!client", name = "bb", descriptor = "I")
	private int anInt215;

	@OriginalMember(owner = "client!client", name = "cb", descriptor = "Ljava/lang/String;")
	private String aString5;

	@OriginalMember(owner = "client!client", name = "fb", descriptor = "I")
	private int anInt216;

	@OriginalMember(owner = "client!client", name = "hb", descriptor = "I")
	private int anInt217;

	@OriginalMember(owner = "client!client", name = "ib", descriptor = "I")
	private int anInt218;

	@OriginalMember(owner = "client!client", name = "jb", descriptor = "I")
	private int anInt219;

	@OriginalMember(owner = "client!client", name = "kb", descriptor = "I")
	private int anInt220;

	@OriginalMember(owner = "client!client", name = "lb", descriptor = "I")
	private int anInt221;

	@OriginalMember(owner = "client!client", name = "ob", descriptor = "[[[B")
	private byte[][][] aByteArrayArrayArray7;

	@OriginalMember(owner = "client!client", name = "pb", descriptor = "Ljava/lang/String;")
	private String aString6;

	@OriginalMember(owner = "client!client", name = "qb", descriptor = "Ljava/lang/String;")
	private String aString7;

	@OriginalMember(owner = "client!client", name = "rb", descriptor = "[I")
	private int[] anIntArray34;

	@OriginalMember(owner = "client!client", name = "sb", descriptor = "[I")
	private int[] anIntArray35;

	@OriginalMember(owner = "client!client", name = "tb", descriptor = "[I")
	private int[] anIntArray36;

	@OriginalMember(owner = "client!client", name = "vb", descriptor = "I")
	private int anInt223;

	@OriginalMember(owner = "client!client", name = "yb", descriptor = "I")
	private int anInt225;

	@OriginalMember(owner = "client!client", name = "Bb", descriptor = "I")
	private int anInt226;

	@OriginalMember(owner = "client!client", name = "Ib", descriptor = "I")
	private int anInt229;

	@OriginalMember(owner = "client!client", name = "Jb", descriptor = "I")
	private int anInt230;

	@OriginalMember(owner = "client!client", name = "Kb", descriptor = "I")
	private int anInt231;

	@OriginalMember(owner = "client!client", name = "Lb", descriptor = "I")
	private int anInt232;

	@OriginalMember(owner = "client!client", name = "Nb", descriptor = "Lclient!qb;")
	private Class35 aClass35_3;

	@OriginalMember(owner = "client!client", name = "Ob", descriptor = "Lclient!qb;")
	private Class35 aClass35_4;

	@OriginalMember(owner = "client!client", name = "Pb", descriptor = "Lclient!qb;")
	private Class35 aClass35_5;

	@OriginalMember(owner = "client!client", name = "Qb", descriptor = "Lclient!qb;")
	private Class35 aClass35_6;

	@OriginalMember(owner = "client!client", name = "Rb", descriptor = "Lclient!qb;")
	private Class35 aClass35_7;

	@OriginalMember(owner = "client!client", name = "Sb", descriptor = "Lclient!qb;")
	private Class35 aClass35_8;

	@OriginalMember(owner = "client!client", name = "Tb", descriptor = "Lclient!qb;")
	private Class35 aClass35_9;

	@OriginalMember(owner = "client!client", name = "Ub", descriptor = "Lclient!qb;")
	private Class35 aClass35_10;

	@OriginalMember(owner = "client!client", name = "Vb", descriptor = "Lclient!qb;")
	private Class35 aClass35_11;

	@OriginalMember(owner = "client!client", name = "Xb", descriptor = "Lclient!qb;")
	private Class35 aClass35_12;

	@OriginalMember(owner = "client!client", name = "Yb", descriptor = "Lclient!qb;")
	private Class35 aClass35_13;

	@OriginalMember(owner = "client!client", name = "Zb", descriptor = "Lclient!qb;")
	private Class35 aClass35_14;

	@OriginalMember(owner = "client!client", name = "ac", descriptor = "Lclient!qb;")
	private Class35 aClass35_15;

	@OriginalMember(owner = "client!client", name = "bc", descriptor = "I")
	private int anInt233;

	@OriginalMember(owner = "client!client", name = "cc", descriptor = "J")
	private long aLong14;

	@OriginalMember(owner = "client!client", name = "dc", descriptor = "I")
	private int anInt234;

	@OriginalMember(owner = "client!client", name = "ec", descriptor = "I")
	private int anInt235;

	@OriginalMember(owner = "client!client", name = "fc", descriptor = "I")
	private int anInt236;

	@OriginalMember(owner = "client!client", name = "gc", descriptor = "I")
	private int anInt237;

	@OriginalMember(owner = "client!client", name = "hc", descriptor = "I")
	private int anInt238;

	@OriginalMember(owner = "client!client", name = "ic", descriptor = "I")
	private int anInt239;

	@OriginalMember(owner = "client!client", name = "jc", descriptor = "I")
	private int anInt240;

	@OriginalMember(owner = "client!client", name = "kc", descriptor = "Lclient!jb;")
	private Class1_Sub1_Sub2_Sub3 aClass1_Sub1_Sub2_Sub3_1;

	@OriginalMember(owner = "client!client", name = "lc", descriptor = "Lclient!jb;")
	private Class1_Sub1_Sub2_Sub3 aClass1_Sub1_Sub2_Sub3_2;

	@OriginalMember(owner = "client!client", name = "mc", descriptor = "Lclient!jb;")
	private Class1_Sub1_Sub2_Sub3 aClass1_Sub1_Sub2_Sub3_3;

	@OriginalMember(owner = "client!client", name = "nc", descriptor = "Lclient!jb;")
	private Class1_Sub1_Sub2_Sub3 aClass1_Sub1_Sub2_Sub3_4;

	@OriginalMember(owner = "client!client", name = "oc", descriptor = "Lclient!jb;")
	private Class1_Sub1_Sub2_Sub3 aClass1_Sub1_Sub2_Sub3_5;

	@OriginalMember(owner = "client!client", name = "rc", descriptor = "I")
	private int anInt242;

	@OriginalMember(owner = "client!client", name = "vc", descriptor = "[[B")
	private byte[][] aByteArrayArray1;

	@OriginalMember(owner = "client!client", name = "wc", descriptor = "I")
	private int anInt243;

	@OriginalMember(owner = "client!client", name = "xc", descriptor = "I")
	private int anInt244;

	@OriginalMember(owner = "client!client", name = "zc", descriptor = "I")
	private int anInt246;

	@OriginalMember(owner = "client!client", name = "Ac", descriptor = "Lclient!ib;")
	private Class1_Sub1_Sub2_Sub2 aClass1_Sub1_Sub2_Sub2_1;

	@OriginalMember(owner = "client!client", name = "Bc", descriptor = "Lclient!ib;")
	private Class1_Sub1_Sub2_Sub2 aClass1_Sub1_Sub2_Sub2_2;

	@OriginalMember(owner = "client!client", name = "Cc", descriptor = "I")
	private int anInt247;

	@OriginalMember(owner = "client!client", name = "Dc", descriptor = "I")
	private int anInt248;

	@OriginalMember(owner = "client!client", name = "Ec", descriptor = "I")
	private int anInt249;

	@OriginalMember(owner = "client!client", name = "Fc", descriptor = "I")
	private int anInt250;

	@OriginalMember(owner = "client!client", name = "Gc", descriptor = "I")
	private int anInt251;

	@OriginalMember(owner = "client!client", name = "Qc", descriptor = "I")
	private int anInt254;

	@OriginalMember(owner = "client!client", name = "Rc", descriptor = "I")
	private int anInt255;

	@OriginalMember(owner = "client!client", name = "Sc", descriptor = "I")
	private int anInt256;

	@OriginalMember(owner = "client!client", name = "Tc", descriptor = "I")
	private int anInt257;

	@OriginalMember(owner = "client!client", name = "Uc", descriptor = "I")
	private int anInt258;

	@OriginalMember(owner = "client!client", name = "Vc", descriptor = "I")
	private int anInt259;

	@OriginalMember(owner = "client!client", name = "Wc", descriptor = "I")
	private int anInt260;

	@OriginalMember(owner = "client!client", name = "Yc", descriptor = "Lclient!r;")
	private Class37 aClass37_1;

	@OriginalMember(owner = "client!client", name = "Zc", descriptor = "I")
	private int anInt261;

	@OriginalMember(owner = "client!client", name = "bd", descriptor = "I")
	private int anInt262;

	@OriginalMember(owner = "client!client", name = "cd", descriptor = "I")
	private int anInt263;

	@OriginalMember(owner = "client!client", name = "dd", descriptor = "I")
	private int anInt264;

	@OriginalMember(owner = "client!client", name = "ed", descriptor = "I")
	private int anInt265;

	@OriginalMember(owner = "client!client", name = "fd", descriptor = "I")
	private int anInt266;

	@OriginalMember(owner = "client!client", name = "gd", descriptor = "I")
	private int anInt267;

	@OriginalMember(owner = "client!client", name = "id", descriptor = "I")
	private int anInt268;

	@OriginalMember(owner = "client!client", name = "kd", descriptor = "I")
	private int anInt269;

	@OriginalMember(owner = "client!client", name = "md", descriptor = "I")
	private int anInt270;

	@OriginalMember(owner = "client!client", name = "td", descriptor = "[I")
	private int[] anIntArray45;

	@OriginalMember(owner = "client!client", name = "ud", descriptor = "[I")
	private int[] anIntArray46;

	@OriginalMember(owner = "client!client", name = "vd", descriptor = "[I")
	private int[] anIntArray47;

	@OriginalMember(owner = "client!client", name = "wd", descriptor = "[I")
	private int[] anIntArray48;

	@OriginalMember(owner = "client!client", name = "zd", descriptor = "Lclient!xb;")
	private Class47 aClass47_1;

	@OriginalMember(owner = "client!client", name = "Bd", descriptor = "Lclient!wb;")
	private Class46 aClass46_1;

	@OriginalMember(owner = "client!client", name = "Kd", descriptor = "[[B")
	private byte[][] aByteArrayArray2;

	@OriginalMember(owner = "client!client", name = "Md", descriptor = "I")
	private int anInt277;

	@OriginalMember(owner = "client!client", name = "Od", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray5;

	@OriginalMember(owner = "client!client", name = "Sd", descriptor = "I")
	private int anInt278;

	@OriginalMember(owner = "client!client", name = "Td", descriptor = "I")
	private int anInt279;

	@OriginalMember(owner = "client!client", name = "Ud", descriptor = "I")
	private int anInt280;

	@OriginalMember(owner = "client!client", name = "Vd", descriptor = "Lclient!ib;")
	private Class1_Sub1_Sub2_Sub2 aClass1_Sub1_Sub2_Sub2_3;

	@OriginalMember(owner = "client!client", name = "Wd", descriptor = "Lclient!ib;")
	private Class1_Sub1_Sub2_Sub2 aClass1_Sub1_Sub2_Sub2_4;

	@OriginalMember(owner = "client!client", name = "Xd", descriptor = "I")
	private int anInt281;

	@OriginalMember(owner = "client!client", name = "Yd", descriptor = "I")
	private int anInt282;

	@OriginalMember(owner = "client!client", name = "be", descriptor = "I")
	private int anInt284;

	@OriginalMember(owner = "client!client", name = "de", descriptor = "I")
	private int anInt285;

	@OriginalMember(owner = "client!client", name = "ge", descriptor = "I")
	private int anInt286;

	@OriginalMember(owner = "client!client", name = "ie", descriptor = "[I")
	private int[] anIntArray53;

	@OriginalMember(owner = "client!client", name = "je", descriptor = "[I")
	private int[] anIntArray54;

	@OriginalMember(owner = "client!client", name = "le", descriptor = "I")
	private int anInt287;

	@OriginalMember(owner = "client!client", name = "oe", descriptor = "I")
	private int anInt289;

	@OriginalMember(owner = "client!client", name = "se", descriptor = "I")
	private int anInt290;

	@OriginalMember(owner = "client!client", name = "ve", descriptor = "Lclient!qb;")
	private Class35 aClass35_16;

	@OriginalMember(owner = "client!client", name = "we", descriptor = "Lclient!qb;")
	private Class35 aClass35_17;

	@OriginalMember(owner = "client!client", name = "xe", descriptor = "Lclient!qb;")
	private Class35 aClass35_18;

	@OriginalMember(owner = "client!client", name = "ye", descriptor = "I")
	private int anInt291;

	@OriginalMember(owner = "client!client", name = "ze", descriptor = "I")
	private int anInt292;

	@OriginalMember(owner = "client!client", name = "Ae", descriptor = "I")
	private int anInt293;

	@OriginalMember(owner = "client!client", name = "Je", descriptor = "Ljava/net/Socket;")
	private Socket aSocket1;

	@OriginalMember(owner = "client!client", name = "Ke", descriptor = "I")
	private int anInt299;

	@OriginalMember(owner = "client!client", name = "Le", descriptor = "I")
	private int anInt300;

	@OriginalMember(owner = "client!client", name = "Pe", descriptor = "I")
	private int anInt302;

	@OriginalMember(owner = "client!client", name = "Ue", descriptor = "Lclient!ub;")
	private Class44_Sub1 aClass44_Sub1_1;

	@OriginalMember(owner = "client!client", name = "Ve", descriptor = "I")
	private int anInt305;

	@OriginalMember(owner = "client!client", name = "af", descriptor = "I")
	private int anInt306;

	@OriginalMember(owner = "client!client", name = "bf", descriptor = "I")
	private int anInt307;

	@OriginalMember(owner = "client!client", name = "cf", descriptor = "I")
	private int anInt308;

	@OriginalMember(owner = "client!client", name = "ef", descriptor = "I")
	private int anInt309;

	@OriginalMember(owner = "client!client", name = "ff", descriptor = "I")
	private int anInt310;

	@OriginalMember(owner = "client!client", name = "gf", descriptor = "Lclient!ib;")
	private Class1_Sub1_Sub2_Sub2 aClass1_Sub1_Sub2_Sub2_5;

	@OriginalMember(owner = "client!client", name = "jf", descriptor = "I")
	private int anInt312;

	@OriginalMember(owner = "client!client", name = "lf", descriptor = "I")
	private int anInt314;

	@OriginalMember(owner = "client!client", name = "tf", descriptor = "Lclient!qb;")
	private Class35 aClass35_19;

	@OriginalMember(owner = "client!client", name = "uf", descriptor = "Lclient!qb;")
	private Class35 aClass35_20;

	@OriginalMember(owner = "client!client", name = "vf", descriptor = "Lclient!qb;")
	private Class35 aClass35_21;

	@OriginalMember(owner = "client!client", name = "wf", descriptor = "Lclient!qb;")
	private Class35 aClass35_22;

	@OriginalMember(owner = "client!client", name = "xf", descriptor = "Lclient!qb;")
	private Class35 aClass35_23;

	@OriginalMember(owner = "client!client", name = "yf", descriptor = "Lclient!qb;")
	private Class35 aClass35_24;

	@OriginalMember(owner = "client!client", name = "zf", descriptor = "Lclient!qb;")
	private Class35 aClass35_25;

	@OriginalMember(owner = "client!client", name = "Af", descriptor = "Lclient!qb;")
	private Class35 aClass35_26;

	@OriginalMember(owner = "client!client", name = "Bf", descriptor = "Lclient!qb;")
	private Class35 aClass35_27;

	@OriginalMember(owner = "client!client", name = "Df", descriptor = "I")
	private int anInt319;

	@OriginalMember(owner = "client!client", name = "Ff", descriptor = "I")
	private int anInt320;

	@OriginalMember(owner = "client!client", name = "Jf", descriptor = "I")
	private int anInt322;

	@OriginalMember(owner = "client!client", name = "Kf", descriptor = "I")
	private int anInt323;

	@OriginalMember(owner = "client!client", name = "Lf", descriptor = "I")
	private int anInt324;

	@OriginalMember(owner = "client!client", name = "Mf", descriptor = "I")
	private int anInt325;

	@OriginalMember(owner = "client!client", name = "Nf", descriptor = "Lclient!ib;")
	private Class1_Sub1_Sub2_Sub2 aClass1_Sub1_Sub2_Sub2_6;

	@OriginalMember(owner = "client!client", name = "Of", descriptor = "Lclient!ib;")
	private Class1_Sub1_Sub2_Sub2 aClass1_Sub1_Sub2_Sub2_7;

	@OriginalMember(owner = "client!client", name = "Pf", descriptor = "I")
	private int anInt326;

	@OriginalMember(owner = "client!client", name = "Qf", descriptor = "I")
	private int anInt327;

	@OriginalMember(owner = "client!client", name = "Rf", descriptor = "I")
	private int anInt328;

	@OriginalMember(owner = "client!client", name = "Sf", descriptor = "I")
	private int anInt329;

	@OriginalMember(owner = "client!client", name = "Uf", descriptor = "I")
	private int anInt330;

	@OriginalMember(owner = "client!client", name = "ag", descriptor = "I")
	private int anInt332;

	@OriginalMember(owner = "client!client", name = "cg", descriptor = "I")
	private int anInt333;

	@OriginalMember(owner = "client!client", name = "dg", descriptor = "Lclient!kb;")
	private Class1_Sub1_Sub2_Sub4 aClass1_Sub1_Sub2_Sub4_1;

	@OriginalMember(owner = "client!client", name = "eg", descriptor = "Lclient!kb;")
	private Class1_Sub1_Sub2_Sub4 aClass1_Sub1_Sub2_Sub4_2;

	@OriginalMember(owner = "client!client", name = "fg", descriptor = "Lclient!kb;")
	private Class1_Sub1_Sub2_Sub4 aClass1_Sub1_Sub2_Sub4_3;

	@OriginalMember(owner = "client!client", name = "gg", descriptor = "Lclient!kb;")
	private Class1_Sub1_Sub2_Sub4 aClass1_Sub1_Sub2_Sub4_4;

	@OriginalMember(owner = "client!client", name = "hg", descriptor = "J")
	private long aLong15;

	@OriginalMember(owner = "client!client", name = "kg", descriptor = "I")
	private int anInt335;

	@OriginalMember(owner = "client!client", name = "ng", descriptor = "Lclient!ib;")
	private Class1_Sub1_Sub2_Sub2 aClass1_Sub1_Sub2_Sub2_8;

	@OriginalMember(owner = "client!client", name = "og", descriptor = "I")
	private int anInt336;

	@OriginalMember(owner = "client!client", name = "sg", descriptor = "I")
	private int anInt337;

	@OriginalMember(owner = "client!client", name = "Cg", descriptor = "I")
	private int anInt339;

	@OriginalMember(owner = "client!client", name = "Kg", descriptor = "Lclient!e;")
	private Class8 aClass8_1;

	@OriginalMember(owner = "client!client", name = "Ng", descriptor = "[I")
	private int[] anIntArray74;

	@OriginalMember(owner = "client!client", name = "Og", descriptor = "[I")
	private int[] anIntArray75;

	@OriginalMember(owner = "client!client", name = "Rg", descriptor = "I")
	private int anInt344;

	@OriginalMember(owner = "client!client", name = "Sg", descriptor = "I")
	private int anInt345;

	@OriginalMember(owner = "client!client", name = "Xg", descriptor = "I")
	private int anInt348;

	@OriginalMember(owner = "client!client", name = "Zg", descriptor = "I")
	private int anInt349;

	@OriginalMember(owner = "client!client", name = "ch", descriptor = "Lclient!ib;")
	private Class1_Sub1_Sub2_Sub2 aClass1_Sub1_Sub2_Sub2_9;

	@OriginalMember(owner = "client!client", name = "dh", descriptor = "J")
	private long aLong16;

	@OriginalMember(owner = "client!client", name = "fh", descriptor = "I")
	private int anInt350;

	@OriginalMember(owner = "client!client", name = "gh", descriptor = "I")
	private int anInt351;

	@OriginalMember(owner = "client!client", name = "jh", descriptor = "I")
	private int anInt354;

	@OriginalMember(owner = "client!client", name = "oh", descriptor = "I")
	private int anInt356;

	@OriginalMember(owner = "client!client", name = "ph", descriptor = "I")
	private int anInt357;

	@OriginalMember(owner = "client!client", name = "qh", descriptor = "I")
	private int anInt358;

	@OriginalMember(owner = "client!client", name = "sh", descriptor = "I")
	private int anInt359;

	@OriginalMember(owner = "client!client", name = "th", descriptor = "I")
	private int anInt360;

	@OriginalMember(owner = "client!client", name = "uh", descriptor = "I")
	private int anInt361;

	@OriginalMember(owner = "client!client", name = "vh", descriptor = "I")
	private int anInt362;

	@OriginalMember(owner = "client!client", name = "Eh", descriptor = "Lclient!jb;")
	private Class1_Sub1_Sub2_Sub3 aClass1_Sub1_Sub2_Sub3_6;

	@OriginalMember(owner = "client!client", name = "Fh", descriptor = "Lclient!jb;")
	private Class1_Sub1_Sub2_Sub3 aClass1_Sub1_Sub2_Sub3_7;

	@OriginalMember(owner = "client!client", name = "Kh", descriptor = "Lclient!fc;")
	private Class11 aClass11_1;

	@OriginalMember(owner = "client!client", name = "Mh", descriptor = "I")
	private int anInt366;

	@OriginalMember(owner = "client!client", name = "Nh", descriptor = "I")
	private int anInt367;

	@OriginalMember(owner = "client!client", name = "Oh", descriptor = "I")
	private int anInt368;

	@OriginalMember(owner = "client!client", name = "Ph", descriptor = "I")
	private int anInt369;

	@OriginalMember(owner = "client!client", name = "Qh", descriptor = "I")
	private int anInt370;

	@OriginalMember(owner = "client!client", name = "Uh", descriptor = "I")
	private int anInt371;

	@OriginalMember(owner = "client!client", name = "ci", descriptor = "Lclient!jb;")
	private Class1_Sub1_Sub2_Sub3 aClass1_Sub1_Sub2_Sub3_8;

	@OriginalMember(owner = "client!client", name = "di", descriptor = "Lclient!jb;")
	private Class1_Sub1_Sub2_Sub3 aClass1_Sub1_Sub2_Sub3_9;

	@OriginalMember(owner = "client!client", name = "ei", descriptor = "Lclient!jb;")
	private Class1_Sub1_Sub2_Sub3 aClass1_Sub1_Sub2_Sub3_10;

	@OriginalMember(owner = "client!client", name = "fi", descriptor = "I")
	private int anInt376;

	@OriginalMember(owner = "client!client", name = "hi", descriptor = "I")
	private int anInt377;

	@OriginalMember(owner = "client!client", name = "ji", descriptor = "I")
	private int anInt378;

	@OriginalMember(owner = "client!client", name = "ki", descriptor = "I")
	private int anInt379;

	@OriginalMember(owner = "client!client", name = "li", descriptor = "Lclient!ib;")
	private Class1_Sub1_Sub2_Sub2 aClass1_Sub1_Sub2_Sub2_10;

	@OriginalMember(owner = "client!client", name = "mi", descriptor = "Lclient!ib;")
	private Class1_Sub1_Sub2_Sub2 aClass1_Sub1_Sub2_Sub2_11;

	@OriginalMember(owner = "client!client", name = "ni", descriptor = "Lclient!ib;")
	private Class1_Sub1_Sub2_Sub2 aClass1_Sub1_Sub2_Sub2_12;

	@OriginalMember(owner = "client!client", name = "oi", descriptor = "Lclient!ib;")
	private Class1_Sub1_Sub2_Sub2 aClass1_Sub1_Sub2_Sub2_13;

	@OriginalMember(owner = "client!client", name = "ui", descriptor = "I")
	private int anInt381;

	@OriginalMember(owner = "client!client", name = "vi", descriptor = "I")
	private int anInt382;

	@OriginalMember(owner = "client!client", name = "wi", descriptor = "I")
	private int anInt383;

	@OriginalMember(owner = "client!client", name = "xi", descriptor = "Ljava/lang/String;")
	private String aString17;

	@OriginalMember(owner = "client!client", name = "yi", descriptor = "I")
	private int anInt384;

	@OriginalMember(owner = "client!client", name = "zi", descriptor = "Lclient!jb;")
	private Class1_Sub1_Sub2_Sub3 aClass1_Sub1_Sub2_Sub3_11;

	@OriginalMember(owner = "client!client", name = "Ai", descriptor = "Lclient!jb;")
	private Class1_Sub1_Sub2_Sub3 aClass1_Sub1_Sub2_Sub3_12;

	@OriginalMember(owner = "client!client", name = "Bi", descriptor = "Lclient!jb;")
	private Class1_Sub1_Sub2_Sub3 aClass1_Sub1_Sub2_Sub3_13;

	@OriginalMember(owner = "client!client", name = "Ei", descriptor = "I")
	private int anInt386;

	@OriginalMember(owner = "client!client", name = "Fi", descriptor = "I")
	private int anInt387;

	@OriginalMember(owner = "client!client", name = "Gi", descriptor = "I")
	private int anInt388;

	@OriginalMember(owner = "client!client", name = "Ii", descriptor = "Lclient!jb;")
	private Class1_Sub1_Sub2_Sub3 aClass1_Sub1_Sub2_Sub3_14;

	@OriginalMember(owner = "client!client", name = "Ji", descriptor = "Lclient!jb;")
	private Class1_Sub1_Sub2_Sub3 aClass1_Sub1_Sub2_Sub3_15;

	@OriginalMember(owner = "client!client", name = "Ki", descriptor = "Lclient!jb;")
	private Class1_Sub1_Sub2_Sub3 aClass1_Sub1_Sub2_Sub3_16;

	@OriginalMember(owner = "client!client", name = "Li", descriptor = "Lclient!jb;")
	private Class1_Sub1_Sub2_Sub3 aClass1_Sub1_Sub2_Sub3_17;

	@OriginalMember(owner = "client!client", name = "Mi", descriptor = "Lclient!jb;")
	private Class1_Sub1_Sub2_Sub3 aClass1_Sub1_Sub2_Sub3_18;

	@OriginalMember(owner = "client!client", name = "Pi", descriptor = "I")
	private int anInt391;

	@OriginalMember(owner = "client!client", name = "Ri", descriptor = "I")
	private int anInt393;

	@OriginalMember(owner = "client!client", name = "Si", descriptor = "I")
	private int anInt394;

	@OriginalMember(owner = "client!client", name = "Ti", descriptor = "I")
	private int anInt395;

	@OriginalMember(owner = "client!client", name = "Ui", descriptor = "I")
	private int anInt396;

	@OriginalMember(owner = "client!client", name = "Vi", descriptor = "I")
	private int anInt397;

	@OriginalMember(owner = "client!client", name = "bj", descriptor = "[Lclient!jb;")
	private Class1_Sub1_Sub2_Sub3[] aClass1_Sub1_Sub2_Sub3Array4;

	@OriginalMember(owner = "client!client", name = "cj", descriptor = "J")
	private long aLong17;

	@OriginalMember(owner = "client!client", name = "dj", descriptor = "J")
	private long aLong18;

	@OriginalMember(owner = "client!client", name = "fj", descriptor = "I")
	private int anInt401;

	@OriginalMember(owner = "client!client", name = "gj", descriptor = "I")
	private int anInt402;

	@OriginalMember(owner = "client!client", name = "pj", descriptor = "[I")
	private int[] anIntArray88;

	@OriginalMember(owner = "client!client", name = "qj", descriptor = "[I")
	private int[] anIntArray89;

	@OriginalMember(owner = "client!client", name = "rj", descriptor = "[I")
	private int[] anIntArray90;

	@OriginalMember(owner = "client!client", name = "sj", descriptor = "I")
	private int anInt407;

	@OriginalMember(owner = "client!client", name = "uj", descriptor = "I")
	private int anInt409;

	@OriginalMember(owner = "client!client", name = "wj", descriptor = "I")
	private int anInt410;

	@OriginalMember(owner = "client!client", name = "Aj", descriptor = "I")
	private int anInt411;

	@OriginalMember(owner = "client!client", name = "Bj", descriptor = "I")
	private int anInt412;

	@OriginalMember(owner = "client!client", name = "Cj", descriptor = "I")
	private int anInt413;

	@OriginalMember(owner = "client!client", name = "Dj", descriptor = "I")
	private int anInt414;

	@OriginalMember(owner = "client!client", name = "Ej", descriptor = "I")
	private int anInt415;

	@OriginalMember(owner = "client!client", name = "Gj", descriptor = "I")
	private int anInt416;

	@OriginalMember(owner = "client!client", name = "Jj", descriptor = "Lclient!jb;")
	private Class1_Sub1_Sub2_Sub3 aClass1_Sub1_Sub2_Sub3_19;

	@OriginalMember(owner = "client!client", name = "Kj", descriptor = "Lclient!jb;")
	private Class1_Sub1_Sub2_Sub3 aClass1_Sub1_Sub2_Sub3_20;

	@OriginalMember(owner = "client!client", name = "L", descriptor = "B")
	private byte aByte5 = 5;

	@OriginalMember(owner = "client!client", name = "M", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray1 = new String[5];

	@OriginalMember(owner = "client!client", name = "N", descriptor = "[Z")
	private boolean[] aBooleanArray3 = new boolean[5];

	@OriginalMember(owner = "client!client", name = "O", descriptor = "I")
	private int anInt206 = 443;

	@OriginalMember(owner = "client!client", name = "R", descriptor = "[I")
	private int[] anIntArray31 = new int[50];

	@OriginalMember(owner = "client!client", name = "T", descriptor = "I")
	private int anInt210 = 477;

	@OriginalMember(owner = "client!client", name = "X", descriptor = "[I")
	private int[] anIntArray33 = new int[7];

	@OriginalMember(owner = "client!client", name = "db", descriptor = "[[[Lclient!ob;")
	private Class29[][][] aClass29ArrayArrayArray1 = new Class29[4][104][104];

	@OriginalMember(owner = "client!client", name = "eb", descriptor = "[J")
	private long[] aLongArray3 = new long[100];

	@OriginalMember(owner = "client!client", name = "gb", descriptor = "Z")
	private boolean aBoolean44 = false;

	@OriginalMember(owner = "client!client", name = "mb", descriptor = "I")
	private int anInt222 = 3353893;

	@OriginalMember(owner = "client!client", name = "nb", descriptor = "Z")
	private boolean aBoolean45 = false;

	@OriginalMember(owner = "client!client", name = "ub", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray2 = new String[200];

	@OriginalMember(owner = "client!client", name = "wb", descriptor = "I")
	private int anInt224 = 2;

	@OriginalMember(owner = "client!client", name = "xb", descriptor = "B")
	private byte aByte6 = 3;

	@OriginalMember(owner = "client!client", name = "zb", descriptor = "[I")
	private int[] anIntArray37 = new int[4000];

	@OriginalMember(owner = "client!client", name = "Ab", descriptor = "[I")
	private int[] anIntArray38 = new int[4000];

	@OriginalMember(owner = "client!client", name = "Cb", descriptor = "Z")
	private boolean aBoolean46 = false;

	@OriginalMember(owner = "client!client", name = "Eb", descriptor = "Lclient!lb;")
	private Class1_Sub1_Sub3 aClass1_Sub1_Sub3_2 = Class1_Sub1_Sub3.method461();

	@OriginalMember(owner = "client!client", name = "Fb", descriptor = "[I")
	private int[] anIntArray39 = new int[5];

	@OriginalMember(owner = "client!client", name = "Gb", descriptor = "I")
	private int anInt228 = -43664;

	@OriginalMember(owner = "client!client", name = "Hb", descriptor = "B")
	private byte aByte7 = -120;

	@OriginalMember(owner = "client!client", name = "Mb", descriptor = "Z")
	private boolean aBoolean47 = false;

	@OriginalMember(owner = "client!client", name = "Wb", descriptor = "Lclient!d;")
	private Class6 aClass6_1 = new Class6();

	@OriginalMember(owner = "client!client", name = "qc", descriptor = "Z")
	private boolean aBoolean48 = true;

	@OriginalMember(owner = "client!client", name = "sc", descriptor = "[I")
	private int[] anIntArray40 = new int[33];

	@OriginalMember(owner = "client!client", name = "tc", descriptor = "[I")
	private int[] anIntArray41 = new int[Class30.anInt812];

	@OriginalMember(owner = "client!client", name = "uc", descriptor = "[I")
	private int[] anIntArray42 = new int[9];

	@OriginalMember(owner = "client!client", name = "yc", descriptor = "I")
	private int anInt245 = 1;

	@OriginalMember(owner = "client!client", name = "Hc", descriptor = "Z")
	private boolean aBoolean49 = false;

	@OriginalMember(owner = "client!client", name = "Ic", descriptor = "Z")
	private boolean aBoolean50 = false;

	@OriginalMember(owner = "client!client", name = "Lc", descriptor = "B")
	private byte aByte8 = 90;

	@OriginalMember(owner = "client!client", name = "Mc", descriptor = "[I")
	private int[] anIntArray43 = new int[256];

	@OriginalMember(owner = "client!client", name = "Nc", descriptor = "[I")
	private int[] anIntArray44 = new int[5];

	@OriginalMember(owner = "client!client", name = "Oc", descriptor = "Z")
	public boolean aBoolean51 = false;

	@OriginalMember(owner = "client!client", name = "Pc", descriptor = "Z")
	private boolean aBoolean52 = false;

	@OriginalMember(owner = "client!client", name = "Xc", descriptor = "[Lclient!jb;")
	private Class1_Sub1_Sub2_Sub3[] aClass1_Sub1_Sub2_Sub3Array1 = new Class1_Sub1_Sub2_Sub3[2];

	@OriginalMember(owner = "client!client", name = "ad", descriptor = "Z")
	private boolean aBoolean53 = false;

	@OriginalMember(owner = "client!client", name = "hd", descriptor = "Lclient!ob;")
	private Class29 aClass29_1 = new Class29(-822);

	@OriginalMember(owner = "client!client", name = "ld", descriptor = "Z")
	private boolean aBoolean55 = false;

	@OriginalMember(owner = "client!client", name = "nd", descriptor = "Z")
	private boolean aBoolean56 = true;

	@OriginalMember(owner = "client!client", name = "od", descriptor = "I")
	private int anInt271 = 78;

	@OriginalMember(owner = "client!client", name = "pd", descriptor = "Ljava/lang/String;")
	private String aString8 = "";

	@OriginalMember(owner = "client!client", name = "qd", descriptor = "Ljava/lang/String;")
	private String aString9 = "";

	@OriginalMember(owner = "client!client", name = "rd", descriptor = "I")
	private int anInt272 = -1;

	@OriginalMember(owner = "client!client", name = "sd", descriptor = "[Lclient!ib;")
	private Class1_Sub1_Sub2_Sub2[] aClass1_Sub1_Sub2_Sub2Array3 = new Class1_Sub1_Sub2_Sub2[20];

	@OriginalMember(owner = "client!client", name = "yd", descriptor = "I")
	private int anInt274 = -501;

	@OriginalMember(owner = "client!client", name = "Ad", descriptor = "[Lclient!ib;")
	private Class1_Sub1_Sub2_Sub2[] aClass1_Sub1_Sub2_Sub2Array4 = new Class1_Sub1_Sub2_Sub2[100];

	@OriginalMember(owner = "client!client", name = "Cd", descriptor = "Z")
	private boolean aBoolean57 = true;

	@OriginalMember(owner = "client!client", name = "Dd", descriptor = "I")
	private int anInt275 = 12122;

	@OriginalMember(owner = "client!client", name = "Ed", descriptor = "I")
	private int anInt276 = -1;

	@OriginalMember(owner = "client!client", name = "Fd", descriptor = "[I")
	private int[] anIntArray49 = new int[100];

	@OriginalMember(owner = "client!client", name = "Gd", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray3 = new String[100];

	@OriginalMember(owner = "client!client", name = "Hd", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray4 = new String[100];

	@OriginalMember(owner = "client!client", name = "Id", descriptor = "Ljava/lang/String;")
	private String aString10 = "";

	@OriginalMember(owner = "client!client", name = "Jd", descriptor = "[Lclient!jb;")
	private Class1_Sub1_Sub2_Sub3[] aClass1_Sub1_Sub2_Sub3Array2 = new Class1_Sub1_Sub2_Sub3[13];

	@OriginalMember(owner = "client!client", name = "Ld", descriptor = "[I")
	private int[] anIntArray50 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

	@OriginalMember(owner = "client!client", name = "Nd", descriptor = "Z")
	private boolean aBoolean58 = false;

	@OriginalMember(owner = "client!client", name = "Pd", descriptor = "B")
	private byte aByte9 = 0;

	@OriginalMember(owner = "client!client", name = "Qd", descriptor = "B")
	private byte aByte10 = 86;

	@OriginalMember(owner = "client!client", name = "Zd", descriptor = "[I")
	private int[] anIntArray51 = new int[5];

	@OriginalMember(owner = "client!client", name = "ce", descriptor = "Z")
	private boolean aBoolean60 = false;

	@OriginalMember(owner = "client!client", name = "ee", descriptor = "[I")
	private final int[] anIntArray52 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

	@OriginalMember(owner = "client!client", name = "fe", descriptor = "Z")
	private boolean aBoolean61 = false;

	@OriginalMember(owner = "client!client", name = "he", descriptor = "Z")
	private boolean aBoolean62 = false;

	@OriginalMember(owner = "client!client", name = "ke", descriptor = "Ljava/util/zip/CRC32;")
	private CRC32 aCRC32_1 = new CRC32();

	@OriginalMember(owner = "client!client", name = "ne", descriptor = "Z")
	private boolean aBoolean63 = true;

	@OriginalMember(owner = "client!client", name = "pe", descriptor = "Ljava/lang/String;")
	private String aString11 = "";

	@OriginalMember(owner = "client!client", name = "qe", descriptor = "[I")
	private int[] anIntArray55 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

	@OriginalMember(owner = "client!client", name = "re", descriptor = "[[I")
	private int[][] anIntArrayArray3 = new int[104][104];

	@OriginalMember(owner = "client!client", name = "te", descriptor = "[I")
	private int[] anIntArray56 = new int[1000];

	@OriginalMember(owner = "client!client", name = "ue", descriptor = "[I")
	private int[] anIntArray57 = new int[1000];

	@OriginalMember(owner = "client!client", name = "De", descriptor = "[I")
	private int[] anIntArray58 = new int[5];

	@OriginalMember(owner = "client!client", name = "Ee", descriptor = "I")
	private int anInt296 = -1;

	@OriginalMember(owner = "client!client", name = "Fe", descriptor = "I")
	private int anInt297 = -1;

	@OriginalMember(owner = "client!client", name = "Ge", descriptor = "[Lclient!ib;")
	private Class1_Sub1_Sub2_Sub2[] aClass1_Sub1_Sub2_Sub2Array5 = new Class1_Sub1_Sub2_Sub2[20];

	@OriginalMember(owner = "client!client", name = "He", descriptor = "Z")
	private boolean aBoolean64 = false;

	@OriginalMember(owner = "client!client", name = "Ie", descriptor = "I")
	private int anInt298 = 833;

	@OriginalMember(owner = "client!client", name = "Me", descriptor = "I")
	private int anInt301 = 5063219;

	@OriginalMember(owner = "client!client", name = "Ne", descriptor = "Z")
	private boolean aBoolean65 = false;

	@OriginalMember(owner = "client!client", name = "Oe", descriptor = "Ljava/lang/String;")
	private String aString12 = "";

	@OriginalMember(owner = "client!client", name = "Qe", descriptor = "I")
	private int anInt303 = -1;

	@OriginalMember(owner = "client!client", name = "Se", descriptor = "I")
	private int anInt304 = 3;

	@OriginalMember(owner = "client!client", name = "Te", descriptor = "B")
	private byte aByte11 = 9;

	@OriginalMember(owner = "client!client", name = "We", descriptor = "Z")
	private boolean aBoolean66 = false;

	@OriginalMember(owner = "client!client", name = "Xe", descriptor = "[Lclient!jb;")
	private Class1_Sub1_Sub2_Sub3[] aClass1_Sub1_Sub2_Sub3Array3 = new Class1_Sub1_Sub2_Sub3[100];

	@OriginalMember(owner = "client!client", name = "Ye", descriptor = "Ljava/lang/String;")
	private String aString13 = "";

	@OriginalMember(owner = "client!client", name = "Ze", descriptor = "[[I")
	private int[][] anIntArrayArray4 = new int[104][104];

	@OriginalMember(owner = "client!client", name = "df", descriptor = "Z")
	private boolean aBoolean67 = false;

	@OriginalMember(owner = "client!client", name = "kf", descriptor = "I")
	private int anInt313 = -1;

	@OriginalMember(owner = "client!client", name = "mf", descriptor = "B")
	private byte aByte12 = -123;

	@OriginalMember(owner = "client!client", name = "nf", descriptor = "I")
	private int anInt315 = 436;

	@OriginalMember(owner = "client!client", name = "of", descriptor = "B")
	private byte aByte13 = 111;

	@OriginalMember(owner = "client!client", name = "pf", descriptor = "Z")
	private boolean aBoolean68 = false;

	@OriginalMember(owner = "client!client", name = "qf", descriptor = "I")
	private int anInt316 = -593;

	@OriginalMember(owner = "client!client", name = "rf", descriptor = "I")
	private int anInt317 = -1;

	@OriginalMember(owner = "client!client", name = "Cf", descriptor = "[I")
	private int[] anIntArray59 = new int[50];

	@OriginalMember(owner = "client!client", name = "Hf", descriptor = "Z")
	private boolean aBoolean69 = false;

	@OriginalMember(owner = "client!client", name = "If", descriptor = "[I")
	private int[] anIntArray60 = new int[33];

	@OriginalMember(owner = "client!client", name = "Tf", descriptor = "[I")
	private int[] anIntArray61 = new int[1000];

	@OriginalMember(owner = "client!client", name = "Vf", descriptor = "I")
	private final int anInt331 = 100;

	@OriginalMember(owner = "client!client", name = "Wf", descriptor = "[I")
	private int[] anIntArray62 = new int[100];

	@OriginalMember(owner = "client!client", name = "Xf", descriptor = "Z")
	private boolean aBoolean70 = true;

	@OriginalMember(owner = "client!client", name = "Yf", descriptor = "B")
	private byte aByte14 = 7;

	@OriginalMember(owner = "client!client", name = "Zf", descriptor = "B")
	private byte aByte15 = 6;

	@OriginalMember(owner = "client!client", name = "bg", descriptor = "[I")
	private int[] anIntArray63 = new int[200];

	@OriginalMember(owner = "client!client", name = "ig", descriptor = "Z")
	private boolean aBoolean71 = true;

	@OriginalMember(owner = "client!client", name = "jg", descriptor = "I")
	private int anInt334 = -1;

	@OriginalMember(owner = "client!client", name = "lg", descriptor = "[I")
	private int[] anIntArray64 = new int[50];

	@OriginalMember(owner = "client!client", name = "mg", descriptor = "[[I")
	private int[][] anIntArrayArray5 = new int[104][104];

	@OriginalMember(owner = "client!client", name = "pg", descriptor = "B")
	private byte aByte16 = -44;

	@OriginalMember(owner = "client!client", name = "qg", descriptor = "[B")
	private byte[] aByteArray2 = new byte[16384];

	@OriginalMember(owner = "client!client", name = "rg", descriptor = "[I")
	private int[] anIntArray65 = new int[5];

	@OriginalMember(owner = "client!client", name = "tg", descriptor = "I")
	private int anInt338 = 50;

	@OriginalMember(owner = "client!client", name = "ug", descriptor = "[I")
	private int[] anIntArray66 = new int[this.anInt338];

	@OriginalMember(owner = "client!client", name = "vg", descriptor = "[I")
	private int[] anIntArray67 = new int[this.anInt338];

	@OriginalMember(owner = "client!client", name = "wg", descriptor = "[I")
	private int[] anIntArray68 = new int[this.anInt338];

	@OriginalMember(owner = "client!client", name = "xg", descriptor = "[I")
	private int[] anIntArray69 = new int[this.anInt338];

	@OriginalMember(owner = "client!client", name = "yg", descriptor = "[I")
	private int[] anIntArray70 = new int[this.anInt338];

	@OriginalMember(owner = "client!client", name = "zg", descriptor = "[I")
	private int[] anIntArray71 = new int[this.anInt338];

	@OriginalMember(owner = "client!client", name = "Ag", descriptor = "[I")
	private int[] anIntArray72 = new int[this.anInt338];

	@OriginalMember(owner = "client!client", name = "Bg", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray5 = new String[this.anInt338];

	@OriginalMember(owner = "client!client", name = "Fg", descriptor = "I")
	private int anInt341 = -1;

	@OriginalMember(owner = "client!client", name = "Gg", descriptor = "Z")
	private boolean aBoolean72 = false;

	@OriginalMember(owner = "client!client", name = "Hg", descriptor = "[Lclient!jc;")
	private Class19[] aClass19Array1 = new Class19[4];

	@OriginalMember(owner = "client!client", name = "Ig", descriptor = "Lclient!lb;")
	private Class1_Sub1_Sub3 aClass1_Sub1_Sub3_3 = Class1_Sub1_Sub3.method461();

	@OriginalMember(owner = "client!client", name = "Jg", descriptor = "[I")
	private int[] anIntArray73 = new int[2000];

	@OriginalMember(owner = "client!client", name = "Lg", descriptor = "Z")
	private boolean aBoolean73 = false;

	@OriginalMember(owner = "client!client", name = "Mg", descriptor = "I")
	private int anInt342 = -1;

	@OriginalMember(owner = "client!client", name = "Pg", descriptor = "I")
	private int anInt343 = 5;

	@OriginalMember(owner = "client!client", name = "Qg", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray6 = new String[500];

	@OriginalMember(owner = "client!client", name = "Tg", descriptor = "B")
	private byte aByte18 = 86;

	@OriginalMember(owner = "client!client", name = "Ug", descriptor = "I")
	private int anInt346 = 2048;

	@OriginalMember(owner = "client!client", name = "Vg", descriptor = "I")
	private int anInt347 = 2047;

	@OriginalMember(owner = "client!client", name = "Wg", descriptor = "[Lclient!ab;")
	private Class1_Sub1_Sub1_Sub1_Sub1[] aClass1_Sub1_Sub1_Sub1_Sub1Array1 = new Class1_Sub1_Sub1_Sub1_Sub1[this.anInt346];

	@OriginalMember(owner = "client!client", name = "Yg", descriptor = "[I")
	private int[] anIntArray76 = new int[this.anInt346];

	@OriginalMember(owner = "client!client", name = "ah", descriptor = "[I")
	private int[] anIntArray77 = new int[this.anInt346];

	@OriginalMember(owner = "client!client", name = "bh", descriptor = "[Lclient!lb;")
	private Class1_Sub1_Sub3[] aClass1_Sub1_Sub3Array1 = new Class1_Sub1_Sub3[this.anInt346];

	@OriginalMember(owner = "client!client", name = "eh", descriptor = "Z")
	private boolean aBoolean74 = false;

	@OriginalMember(owner = "client!client", name = "hh", descriptor = "I")
	private int anInt352 = -1;

	@OriginalMember(owner = "client!client", name = "lh", descriptor = "Lclient!lb;")
	private Class1_Sub1_Sub3 aClass1_Sub1_Sub3_4 = Class1_Sub1_Sub3.method461();

	@OriginalMember(owner = "client!client", name = "mh", descriptor = "[I")
	private int[] anIntArray79 = new int[151];

	@OriginalMember(owner = "client!client", name = "rh", descriptor = "Z")
	private boolean aBoolean75 = false;

	@OriginalMember(owner = "client!client", name = "wh", descriptor = "Z")
	private boolean aBoolean76 = false;

	@OriginalMember(owner = "client!client", name = "xh", descriptor = "Ljava/lang/String;")
	private String aString14 = "";

	@OriginalMember(owner = "client!client", name = "yh", descriptor = "Ljava/lang/String;")
	private String aString15 = "";

	@OriginalMember(owner = "client!client", name = "zh", descriptor = "Z")
	private boolean aBoolean77 = true;

	@OriginalMember(owner = "client!client", name = "Ah", descriptor = "[I")
	private int[] anIntArray80 = new int[151];

	@OriginalMember(owner = "client!client", name = "Ch", descriptor = "Z")
	private boolean aBoolean78 = true;

	@OriginalMember(owner = "client!client", name = "Dh", descriptor = "[I")
	private int[] anIntArray81 = new int[Class30.anInt812];

	@OriginalMember(owner = "client!client", name = "Gh", descriptor = "Lclient!ob;")
	private Class29 aClass29_2 = new Class29(-822);

	@OriginalMember(owner = "client!client", name = "Ih", descriptor = "I")
	private int anInt365 = 2301979;

	@OriginalMember(owner = "client!client", name = "Jh", descriptor = "[J")
	private long[] aLongArray4 = new long[200];

	@OriginalMember(owner = "client!client", name = "Lh", descriptor = "[Z")
	private boolean[] aBooleanArray4 = new boolean[5];

	@OriginalMember(owner = "client!client", name = "Sh", descriptor = "Z")
	private boolean aBoolean80 = false;

	@OriginalMember(owner = "client!client", name = "Th", descriptor = "Z")
	private boolean aBoolean81 = false;

	@OriginalMember(owner = "client!client", name = "Vh", descriptor = "I")
	private int anInt372 = 1;

	@OriginalMember(owner = "client!client", name = "Wh", descriptor = "[I")
	private int[] anIntArray82 = new int[2000];

	@OriginalMember(owner = "client!client", name = "Xh", descriptor = "I")
	private int anInt373 = -1;

	@OriginalMember(owner = "client!client", name = "Yh", descriptor = "Z")
	private boolean aBoolean82 = false;

	@OriginalMember(owner = "client!client", name = "Zh", descriptor = "Z")
	private boolean aBoolean83 = false;

	@OriginalMember(owner = "client!client", name = "ai", descriptor = "I")
	private int anInt374 = -48671;

	@OriginalMember(owner = "client!client", name = "bi", descriptor = "I")
	private int anInt375 = 7759444;

	@OriginalMember(owner = "client!client", name = "gi", descriptor = "Ljava/lang/String;")
	private String aString16 = "";

	@OriginalMember(owner = "client!client", name = "ii", descriptor = "Z")
	private boolean aBoolean84 = true;

	@OriginalMember(owner = "client!client", name = "pi", descriptor = "[I")
	private int[] anIntArray83 = new int[500];

	@OriginalMember(owner = "client!client", name = "qi", descriptor = "[I")
	private int[] anIntArray84 = new int[500];

	@OriginalMember(owner = "client!client", name = "ri", descriptor = "[I")
	private int[] anIntArray85 = new int[500];

	@OriginalMember(owner = "client!client", name = "si", descriptor = "[I")
	private int[] anIntArray86 = new int[500];

	@OriginalMember(owner = "client!client", name = "Ci", descriptor = "[Lclient!ib;")
	private Class1_Sub1_Sub2_Sub2[] aClass1_Sub1_Sub2_Sub2Array6 = new Class1_Sub1_Sub2_Sub2[1000];

	@OriginalMember(owner = "client!client", name = "Di", descriptor = "I")
	private int anInt385 = 128;

	@OriginalMember(owner = "client!client", name = "Hi", descriptor = "I")
	private int anInt389 = 814;

	@OriginalMember(owner = "client!client", name = "Ni", descriptor = "[Lclient!ib;")
	private Class1_Sub1_Sub2_Sub2[] aClass1_Sub1_Sub2_Sub2Array7 = new Class1_Sub1_Sub2_Sub2[8];

	@OriginalMember(owner = "client!client", name = "Oi", descriptor = "I")
	private int anInt390 = -1;

	@OriginalMember(owner = "client!client", name = "Qi", descriptor = "I")
	private int anInt392 = 2;

	@OriginalMember(owner = "client!client", name = "Xi", descriptor = "[Lclient!vb;")
	public Class45[] aClass45Array1 = new Class45[5];

	@OriginalMember(owner = "client!client", name = "Yi", descriptor = "Z")
	private boolean aBoolean85 = true;

	@OriginalMember(owner = "client!client", name = "aj", descriptor = "Lclient!ob;")
	private Class29 aClass29_3 = new Class29(-822);

	@OriginalMember(owner = "client!client", name = "oj", descriptor = "I")
	private int anInt406 = -1;

	@OriginalMember(owner = "client!client", name = "tj", descriptor = "I")
	private int anInt408 = 2;

	@OriginalMember(owner = "client!client", name = "vj", descriptor = "Z")
	private boolean aBoolean88 = false;

	@OriginalMember(owner = "client!client", name = "xj", descriptor = "B")
	private byte aByte19 = -111;

	@OriginalMember(owner = "client!client", name = "zj", descriptor = "[I")
	private int[] anIntArray91 = new int[Class30.anInt812];

	@OriginalMember(owner = "client!client", name = "Fj", descriptor = "[Lclient!z;")
	private Class1_Sub1_Sub1_Sub1_Sub2[] aClass1_Sub1_Sub1_Sub1_Sub2Array1 = new Class1_Sub1_Sub1_Sub1_Sub2[16384];

	@OriginalMember(owner = "client!client", name = "Hj", descriptor = "[I")
	private int[] anIntArray92 = new int[16384];

	@OriginalMember(owner = "client!client", name = "Ij", descriptor = "Z")
	private boolean aBoolean89 = false;

	@OriginalMember(owner = "client!client", name = "Lj", descriptor = "Z")
	private boolean aBoolean90 = false;

	static {
		@Pc(6) int local6 = 2;
		@Pc(8) int local8;
		for (local8 = 0; local8 < 32; local8++) {
			anIntArray32[local8] = local6 - 1;
			local6 += local6;
		}
		anInt253 = -303;
		anInt273 = 2;
		aBoolean59 = true;
		aBigInteger1 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");
		aBigInteger2 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");
		aByte17 = 7;
		anIntArray78 = new int[] { 9104, 10275, 7595, 3610, 7975, 8526, 918, 38802, 24466, 10145, 58654, 5027, 1457, 16565, 34991, 25486 };
		anInt398 = -39788;
		anIntArray87 = new int[99];
		local6 = 0;
		for (local8 = 0; local8 < 99; local8++) {
			@Pc(122) int local122 = local8 + 1;
			@Pc(135) int local135 = (int) ((double) local122 + Math.pow(2.0D, (double) local122 / 7.0D) * 300.0D);
			local6 += local135;
			anIntArray87[local8] = local6 / 4;
		}
		anInt404 = 10;
		aBoolean86 = true;
		anIntArrayArray6 = new int[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, 33697, 22433, 2983, 54193 }, { 8741, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003, 25239 }, { 25238, 8742, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };
	}

	@OriginalMember(owner = "client!client", name = "main", descriptor = "([Ljava/lang/String;)V")
	public static void main(@OriginalArg(0) String[] arg0) {
		try {
			System.out.println("RS2 user client - release #" + 274);
			if (arg0.length == 5) {
				anInt404 = Integer.parseInt(arg0[0]);
				anInt405 = Integer.parseInt(arg0[1]);
				if (arg0[2].equals("lowmem")) {
					method136();
				} else if (arg0[2].equals("highmem")) {
					method155();
				} else {
					System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
					return;
				}
				if (arg0[3].equals("free")) {
					aBoolean86 = false;
				} else if (arg0[3].equals("members")) {
					aBoolean86 = true;
				} else {
					System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
					return;
				}
				signlink.anInt936 = Integer.parseInt(arg0[4]);
				signlink.startpriv(InetAddress.getLocalHost());
				@Pc(87) client local87 = new client();
				local87.method83();
			} else {
				System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
			}
		} catch (@Pc(94) Exception local94) {
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(Z)V")
	private static void method136() {
		try {
			Class37.aBoolean210 = true;
			Class1_Sub1_Sub2_Sub1.aBoolean146 = true;
			aBoolean87 = true;
			Class4.aBoolean32 = true;
		} catch (@Pc(13) RuntimeException local13) {
			signlink.reporterror("90104, " + true + ", " + local13.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "t", descriptor = "(I)V")
	private static void method155() {
		try {
			Class37.aBoolean210 = false;
			Class1_Sub1_Sub2_Sub1.aBoolean146 = false;
			aBoolean87 = false;
			Class4.aBoolean32 = false;
		} catch (@Pc(14) RuntimeException local14) {
			signlink.reporterror("81733, " + 10969 + ", " + local14.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(III)Ljava/lang/String;")
	private static String method159(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		try {
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
			signlink.reporterror("23299, " + -684 + ", " + arg0 + ", " + arg1 + ", " + local50.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(IZ)Ljava/lang/String;")
	private static String method179(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		try {
			@Pc(4) String local4 = String.valueOf(arg0);
			if (arg1) {
				throw new NullPointerException();
			}
			for (@Pc(15) int local15 = local4.length() - 3; local15 > 0; local15 -= 3) {
				local4 = local4.substring(0, local15) + "," + local4.substring(local15);
			}
			if (local4.length() > 8) {
				local4 = "@gre@" + local4.substring(0, local4.length() - 8) + " million @whi@(" + local4 + ")";
			} else if (local4.length() > 4) {
				local4 = "@cya@" + local4.substring(0, local4.length() - 4) + "K @whi@(" + local4 + ")";
			}
			return " " + local4;
		} catch (@Pc(95) RuntimeException local95) {
			signlink.reporterror("45250, " + arg0 + ", " + arg1 + ", " + local95.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "f", descriptor = "(II)Ljava/lang/String;")
	private static String method192(@OriginalArg(1) int arg0) {
		try {
			if (arg0 < 100000) {
				return String.valueOf(arg0);
			} else if (arg0 < 10000000) {
				return arg0 / 1000 + "K";
			} else {
				return arg0 / 1000000 + "M";
			}
		} catch (@Pc(43) RuntimeException local43) {
			signlink.reporterror("33863, " + 5 + ", " + arg0 + ", " + local43.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(III)Z")
	private boolean method96(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		try {
			@Pc(5) boolean local5 = false;
			@Pc(7) boolean local7 = false;
			@Pc(11) Class6 local11 = Class6.aClass6Array1[arg2];
			for (@Pc(13) int local13 = 0; local13 < local11.anIntArray97.length && local11.anIntArray97[local13] != -1; local13++) {
				@Pc(28) Class6 local28 = Class6.aClass6Array1[local11.anIntArray97[local13]];
				if (local28.anInt422 == 1) {
					local7 |= this.method96(arg0, 753, local28.anInt420);
				}
				if (local28.anInt422 == 6 && (local28.anInt443 != -1 || local28.anInt444 != -1)) {
					@Pc(58) boolean local58 = this.method216(local28);
					@Pc(63) int local63;
					if (local58) {
						local63 = local28.anInt444;
					} else {
						local63 = local28.anInt443;
					}
					if (local63 != -1) {
						@Pc(75) Class27 local75 = Class27.aClass27Array1[local63];
						local28.anInt419 += arg0;
						while (local28.anInt419 > local75.method499(local28.anInt418)) {
							local28.anInt419 -= local75.method499(local28.anInt418) + 1;
							local28.anInt418++;
							if (local28.anInt418 >= local75.anInt795) {
								local28.anInt418 -= local75.anInt796;
								if (local28.anInt418 < 0 || local28.anInt418 >= local75.anInt795) {
									local28.anInt418 = 0;
								}
							}
							local7 = true;
						}
					}
				}
			}
			return local7;
		} catch (@Pc(143) RuntimeException local143) {
			signlink.reporterror("62802, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local143.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(I)V")
	private void method97() {
		try {
			@Pc(13) int local13 = this.anInt412;
			@Pc(16) int local16 = this.anInt413;
			@Pc(19) int local19 = this.anInt414;
			@Pc(22) int local22 = this.anInt415;
			Class1_Sub1_Sub2.method436(local22, 6116423, local19, local13, local16);
			Class1_Sub1_Sub2.method436(16, 0, local19 - 2, local13 + 1, local16 + 1);
			Class1_Sub1_Sub2.method437(local19 - 2, 0, local22 - 19, local13 + 1, local16 + 18);
			this.aClass1_Sub1_Sub2_Sub4_3.method446(local13 + 3, "Choose Option", 6116423, local16 + 14);
			@Pc(74) int local74 = super.anInt195;
			@Pc(77) int local77 = super.anInt196;
			if (this.anInt411 == 0) {
				local74 -= 4;
				local77 -= 4;
			}
			if (this.anInt411 == 1) {
				local74 -= 553;
				local77 -= 205;
			}
			if (this.anInt411 == 2) {
				local74 -= 17;
				local77 -= 357;
			}
			for (@Pc(96) int local96 = 0; local96 < this.anInt287; local96++) {
				@Pc(111) int local111 = local16 + (this.anInt287 - 1 - local96) * 15 + 31;
				@Pc(113) int local113 = 16777215;
				if (local74 > local13 && local74 < local13 + local19 && local77 > local111 - 13 && local77 < local111 + 3) {
					local113 = 16776960;
				}
				this.aClass1_Sub1_Sub2_Sub4_3.method448(this.aStringArray6[local96], this.anInt315, true, local111, local13 + 3, local113);
			}
		} catch (@Pc(155) RuntimeException local155) {
			signlink.reporterror("51799, " + -593 + ", " + local155.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "f", descriptor = "(I)V")
	private void method98(@OriginalArg(0) int arg0) {
		try {
			if (this.aClass35_19 == null) {
				super.aClass35_2 = null;
				this.aClass35_15 = null;
				this.aClass35_13 = null;
				this.aClass35_12 = null;
				this.aClass35_14 = null;
				this.aClass35_16 = null;
				this.aClass35_17 = null;
				this.aClass35_18 = null;
				this.aClass35_22 = new Class35(265, anInt273, 128, this.method93(aByte17));
				Class1_Sub1_Sub2.method434();
				this.aClass35_23 = new Class35(265, anInt273, 128, this.method93(aByte17));
				Class1_Sub1_Sub2.method434();
				this.aClass35_19 = new Class35(171, anInt273, 509, this.method93(aByte17));
				Class1_Sub1_Sub2.method434();
				this.aClass35_20 = new Class35(132, anInt273, 360, this.method93(aByte17));
				Class1_Sub1_Sub2.method434();
				if (arg0 != -43664) {
					for (@Pc(84) int local84 = 1; local84 > 0; local84++) {
					}
				}
				this.aClass35_21 = new Class35(200, anInt273, 360, this.method93(aByte17));
				Class1_Sub1_Sub2.method434();
				this.aClass35_24 = new Class35(238, anInt273, 202, this.method93(aByte17));
				Class1_Sub1_Sub2.method434();
				this.aClass35_25 = new Class35(238, anInt273, 203, this.method93(aByte17));
				Class1_Sub1_Sub2.method434();
				this.aClass35_26 = new Class35(94, anInt273, 74, this.method93(aByte17));
				Class1_Sub1_Sub2.method434();
				this.aClass35_27 = new Class35(94, anInt273, 75, this.method93(aByte17));
				Class1_Sub1_Sub2.method434();
				if (this.aClass47_1 != null) {
					this.method141();
					this.method173();
				}
				this.aBoolean53 = true;
			}
		} catch (@Pc(168) RuntimeException local168) {
			signlink.reporterror("45055, " + arg0 + ", " + local168.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IZIIIII)V")
	private void method99(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		try {
			@Pc(5) int local5 = 2048 - arg1 & 0x7FF;
			@Pc(11) int local11 = 2048 - arg4 & 0x7FF;
			@Pc(13) int local13 = 0;
			@Pc(15) int local15 = 0;
			@Pc(17) int local17 = arg5;
			this.aBoolean51 &= true;
			@Pc(29) int local29;
			@Pc(33) int local33;
			@Pc(43) int local43;
			if (local5 != 0) {
				local29 = Class1_Sub1_Sub1_Sub5.anIntArray150[local5];
				local33 = Class1_Sub1_Sub1_Sub5.anIntArray151[local5];
				local43 = local33 * 0 - arg5 * local29 >> 16;
				local17 = local29 * 0 + arg5 * local33 >> 16;
				local15 = local43;
			}
			if (local11 != 0) {
				local29 = Class1_Sub1_Sub1_Sub5.anIntArray150[local11];
				local33 = Class1_Sub1_Sub1_Sub5.anIntArray151[local11];
				local43 = local17 * local29 + local33 * 0 >> 16;
				local17 = local17 * local33 - local29 * 0 >> 16;
				local13 = local43;
			}
			this.anInt217 = arg3 - local13;
			this.anInt218 = arg2 - local15;
			this.anInt219 = arg0 - local17;
			this.anInt220 = arg1;
			this.anInt221 = arg4;
		} catch (@Pc(110) RuntimeException local110) {
			signlink.reporterror("27489, " + arg0 + ", " + true + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local110.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "g", descriptor = "(I)V")
	private void method100() {
		try {
			this.method156();
			if (this.anInt362 == 1) {
				this.aClass1_Sub1_Sub2_Sub2Array7[this.anInt361 / 100].method388(this.aByte14, this.anInt359 - 8 - 4, this.anInt360 - 8 - 4);
			}
			if (this.anInt362 == 2) {
				this.aClass1_Sub1_Sub2_Sub2Array7[this.anInt361 / 100 + 4].method388(this.aByte14, this.anInt359 - 8 - 4, this.anInt360 - 8 - 4);
				anInt340++;
				if (anInt340 > 57) {
					anInt340 = 0;
					this.aClass1_Sub1_Sub3_2.method462(100);
				}
			}
			if (this.anInt341 != -1) {
				this.method96(this.anInt286, 753, this.anInt341);
				this.method209(0, Class6.aClass6Array1[this.anInt341], 0, 0);
			}
			if (this.anInt317 != -1) {
				this.method96(this.anInt286, 753, this.anInt317);
				this.method209(0, Class6.aClass6Array1[this.anInt317], 0, 0);
			}
			this.method189();
			if (!this.aBoolean47) {
				this.method150();
				this.method113();
			} else if (this.anInt411 == 0) {
				this.method97();
			}
			if (this.anInt216 == 1) {
				this.aClass1_Sub1_Sub2_Sub2Array5[1].method388(this.aByte14, 472, 296);
			}
			if (this.anInt208 != 0) {
				@Pc(162) int local162 = this.anInt208 / 50;
				@Pc(166) int local166 = local162 / 60;
				@Pc(170) int local170 = local162 % 60;
				if (local170 < 10) {
					this.aClass1_Sub1_Sub2_Sub4_2.method446(4, "System update in: " + local166 + ":0" + local170, 16776960, 329);
				} else {
					this.aClass1_Sub1_Sub2_Sub4_2.method446(4, "System update in: " + local166 + ":" + local170, 16776960, 329);
				}
			}
		} catch (@Pc(212) RuntimeException local212) {
			signlink.reporterror("46752, " + 31037 + ", " + local212.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(B)V")
	private void method101() {
		try {
			@Pc(21) int local21;
			@Pc(49) int local49;
			@Pc(53) int local53;
			@Pc(62) int local62;
			@Pc(69) int local69;
			@Pc(132) int local132;
			@Pc(189) int local189;
			try {
				this.anInt272 = -1;
				this.aClass29_1.method508();
				this.aClass29_2.method508();
				Class1_Sub1_Sub2_Sub1.method342();
				this.method207();
				this.aClass37_1.method523();
				for (local21 = 0; local21 < 4; local21++) {
					this.aClass19Array1[local21].method417((byte) 5);
				}
				System.gc();
				@Pc(45) Class4 local45 = new Class4(104, this.anIntArrayArrayArray5, 104, -127, this.aByteArrayArrayArray7);
				local49 = this.aByteArrayArray1.length;
				Class4.aBoolean32 = Class37.aBoolean210;
				for (local53 = 0; local53 < local49; local53++) {
					local62 = this.anIntArray34[local53] >> 8;
					local69 = this.anIntArray34[local53] & 0xFF;
					if (local62 == 33 && local69 >= 71 && local69 <= 73) {
						Class4.aBoolean32 = false;
					}
				}
				if (Class4.aBoolean32) {
					this.aClass37_1.method524((byte) 4, this.anInt327);
				} else {
					this.aClass37_1.method524((byte) 4, 0);
				}
				this.aClass1_Sub1_Sub3_2.method462(120);
				@Pc(137) byte[] local137;
				for (local62 = 0; local62 < local49; local62++) {
					local69 = (this.anIntArray34[local62] >> 8) * 64 - this.anInt322;
					local132 = (this.anIntArray34[local62] & 0xFF) * 64 - this.anInt323;
					local137 = this.aByteArrayArray1[local62];
					if (local137 != null) {
						local45.method56((this.anInt266 - 6) * 8, local137, local132, (this.anInt267 - 6) * 8, local69);
					}
				}
				for (local69 = 0; local69 < local49; local69++) {
					local132 = (this.anIntArray34[local69] >> 8) * 64 - this.anInt322;
					local189 = (this.anIntArray34[local69] & 0xFF) * 64 - this.anInt323;
					@Pc(194) byte[] local194 = this.aByteArrayArray1[local69];
					if (local194 == null && this.anInt267 < 800) {
						local45.method55(local189, local132);
					}
				}
				this.aClass1_Sub1_Sub3_2.method462(120);
				@Pc(239) int local239;
				for (local132 = 0; local132 < local49; local132++) {
					local137 = this.aByteArrayArray2[local132];
					if (local137 != null) {
						local239 = (this.anIntArray34[local132] >> 8) * 64 - this.anInt322;
						@Pc(251) int local251 = (this.anIntArray34[local132] & 0xFF) * 64 - this.anInt323;
						local45.method59(local251, local137, this.aClass37_1, local239, this.aClass19Array1);
					}
				}
				this.aClass1_Sub1_Sub3_2.method462(120);
				local45.method61(this.aClass19Array1, this.aClass37_1);
				this.aClass35_14.method517(aBoolean59);
				this.aClass1_Sub1_Sub3_2.method462(120);
				for (local189 = 0; local189 < 104; local189++) {
					for (local239 = 0; local239 < 104; local239++) {
						this.method134(local189, local239);
					}
				}
				this.method171((byte) 4);
			} catch (@Pc(311) Exception local311) {
			}
			Class9.aClass40_4.method586();
			@Pc(325) int local325;
			if (aBoolean87 && signlink.aRandomAccessFile1 != null) {
				local21 = this.aClass44_Sub1_1.method631(anInt403, 0);
				for (local325 = 0; local325 < local21; local325++) {
					local49 = this.aClass44_Sub1_1.method636(local325, (byte) 9);
					if ((local49 & 0x79) == 0) {
						Class1_Sub1_Sub1_Sub5.method259(local325);
					}
				}
			}
			System.gc();
			Class1_Sub1_Sub2_Sub1.method343();
			this.aClass44_Sub1_1.method642();
			local21 = (this.anInt266 - 6) / 8 - 1;
			local325 = (this.anInt266 + 6) / 8 + 1;
			local49 = (this.anInt267 - 6) / 8 - 1;
			local53 = (this.anInt267 + 6) / 8 + 1;
			if (this.aBoolean81) {
				local21 = 49;
				local325 = 50;
				local49 = 49;
				local53 = 50;
			}
			for (local62 = local21; local62 <= local325; local62++) {
				for (local69 = local49; local69 <= local53; local69++) {
					if (local62 == local21 || local62 == local325 || local69 == local49 || local69 == local53) {
						local132 = this.aClass44_Sub1_1.method633(0, local62, local69);
						if (local132 != -1) {
							this.aClass44_Sub1_1.method643(3, local132);
						}
						local189 = this.aClass44_Sub1_1.method633(1, local62, local69);
						if (local189 != -1) {
							this.aClass44_Sub1_1.method643(3, local189);
						}
					}
				}
			}
		} catch (@Pc(470) RuntimeException local470) {
			signlink.reporterror("28641, " + 116 + ", " + local470.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(II)V")
	private void method102(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(3) boolean local3 = false;
			signlink.anInt943 = arg1;
		} catch (@Pc(7) RuntimeException local7) {
			signlink.reporterror("13201, " + arg0 + ", " + arg1 + ", " + local7.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(B)V")
	private void method103(@OriginalArg(0) byte arg0) {
		try {
			if (this.anInt249 == 0) {
				@Pc(8) int local8 = super.anInt200;
				@Pc(13) boolean local13 = false;
				if (this.anInt381 == 1 && super.anInt201 >= 516 && super.anInt202 >= 160 && super.anInt201 <= 765 && super.anInt202 <= 205) {
					local8 = 0;
				}
				@Pc(47) int local47;
				@Pc(50) int local50;
				@Pc(126) int local126;
				if (this.aBoolean47) {
					if (local8 != 1) {
						local47 = super.anInt195;
						local50 = super.anInt196;
						if (this.anInt411 == 0) {
							local47 -= 4;
							local50 -= 4;
						}
						if (this.anInt411 == 1) {
							local47 -= 553;
							local50 -= 205;
						}
						if (this.anInt411 == 2) {
							local47 -= 17;
							local50 -= 357;
						}
						if (local47 < this.anInt412 - 10 || local47 > this.anInt412 + this.anInt414 + 10 || local50 < this.anInt413 - 10 || local50 > this.anInt413 + this.anInt415 + 10) {
							this.aBoolean47 = false;
							if (this.anInt411 == 1) {
								this.aBoolean55 = true;
							}
							if (this.anInt411 == 2) {
								this.aBoolean73 = true;
							}
						}
					}
					if (local8 == 1) {
						local47 = this.anInt412;
						local50 = this.anInt413;
						local126 = this.anInt414;
						@Pc(129) int local129 = super.anInt201;
						@Pc(132) int local132 = super.anInt202;
						if (this.anInt411 == 0) {
							local129 -= 4;
							local132 -= 4;
						}
						if (this.anInt411 == 1) {
							local129 -= 553;
							local132 -= 205;
						}
						if (this.anInt411 == 2) {
							local129 -= 17;
							local132 -= 357;
						}
						@Pc(151) int local151 = -1;
						for (@Pc(153) int local153 = 0; local153 < this.anInt287; local153++) {
							@Pc(168) int local168 = local50 + (this.anInt287 - 1 - local153) * 15 + 31;
							if (local129 > local47 && local129 < local47 + local126 && local132 > local168 - 13 && local132 < local168 + 3) {
								local151 = local153;
							}
						}
						if (local151 != -1) {
							this.method142((byte) 6, local151);
						}
						this.aBoolean47 = false;
						if (this.anInt411 == 1) {
							this.aBoolean55 = true;
						}
						if (this.anInt411 == 2) {
							this.aBoolean73 = true;
							return;
						}
					}
				} else {
					if (local8 == 1 && this.anInt287 > 0) {
						local47 = this.anIntArray85[this.anInt287 - 1];
						if (local47 == 582 || local47 == 113 || local47 == 555 || local47 == 331 || local47 == 354 || local47 == 694 || local47 == 962 || local47 == 795 || local47 == 681 || local47 == 100 || local47 == 102 || local47 == 1328) {
							local50 = this.anIntArray83[this.anInt287 - 1];
							local126 = this.anIntArray84[this.anInt287 - 1];
							@Pc(288) Class6 local288 = Class6.aClass6Array1[local126];
							if (local288.aBoolean95 || local288.aBoolean98) {
								this.aBoolean76 = false;
								this.anInt410 = 0;
								this.anInt247 = local126;
								this.anInt248 = local50;
								this.anInt249 = 2;
								this.anInt250 = super.anInt201;
								this.anInt251 = super.anInt202;
								if (Class6.aClass6Array1[local126].anInt421 == this.anInt317) {
									this.anInt249 = 1;
								}
								if (Class6.aClass6Array1[local126].anInt421 == this.anInt303) {
									this.anInt249 = 3;
								}
								return;
							}
						}
					}
					if (local8 == 1 && (this.anInt319 == 1 || this.method147(this.anInt287 - 1)) && this.anInt287 > 2) {
						local8 = 2;
					}
					if (local8 == 1 && this.anInt287 > 0) {
						this.method142((byte) 6, this.anInt287 - 1);
					}
					if (local8 != 2 || this.anInt287 <= 0) {
						return;
					}
					this.method177();
				}
			}
		} catch (@Pc(383) RuntimeException local383) {
			signlink.reporterror("99065, " + arg0 + ", " + local383.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILjava/lang/String;)Z")
	private boolean method104(@OriginalArg(1) String arg0) {
		try {
			if (arg0 == null) {
				return false;
			}
			for (@Pc(7) int local7 = 0; local7 < this.anInt344; local7++) {
				if (arg0.equalsIgnoreCase(this.aStringArray2[local7])) {
					return true;
				}
			}
			return arg0.equalsIgnoreCase(aClass1_Sub1_Sub1_Sub1_Sub1_1.aString3);
		} catch (@Pc(41) RuntimeException local41) {
			signlink.reporterror("68692, " + -238 + ", " + arg0 + ", " + local41.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(I)V")
	@Override
	protected void method89() {
		try {
			if (!this.aBoolean68 && !this.aBoolean82 && !this.aBoolean49) {
				anInt207++;
				if (this.aBoolean51) {
					this.method204(this.anInt343);
				} else {
					this.method169();
				}
				this.method105();
			}
		} catch (@Pc(34) RuntimeException local34) {
			signlink.reporterror("54324, " + 0 + ", " + local34.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "h", descriptor = "(I)V")
	private void method105() {
		try {
			while (true) {
				@Pc(16) Class1_Sub1_Sub4 local16 = this.aClass44_Sub1_1.method640();
				if (local16 == null) {
					return;
				}
				if (local16.anInt770 == 0) {
					Class1_Sub1_Sub1_Sub5.method258(local16.anInt771, local16.aByteArray10);
					if ((this.aClass44_Sub1_1.method636(local16.anInt771, (byte) 9) & 0x62) != 0) {
						this.aBoolean55 = true;
						if (this.anInt303 != -1) {
							this.aBoolean73 = true;
						}
					}
				}
				if (local16.anInt770 == 1 && local16.aByteArray10 != null) {
					Class12.method301(local16.aByteArray10);
				}
				if (local16.anInt770 == 2 && local16.anInt771 == this.anInt377 && local16.aByteArray10 != null) {
					this.method158(this.aBoolean84, local16.aByteArray10);
				}
				if (local16.anInt770 == 3 && this.anInt350 == 1) {
					for (@Pc(87) int local87 = 0; local87 < this.aByteArrayArray1.length; local87++) {
						if (this.anIntArray35[local87] == local16.anInt771) {
							this.aByteArrayArray1[local87] = local16.aByteArray10;
							if (local16.aByteArray10 == null) {
								this.anIntArray35[local87] = -1;
							}
							break;
						}
						if (this.anIntArray36[local87] == local16.anInt771) {
							this.aByteArrayArray2[local87] = local16.aByteArray10;
							if (local16.aByteArray10 == null) {
								this.anIntArray36[local87] = -1;
							}
							break;
						}
					}
				}
				if (local16.anInt770 == 93 && this.aClass44_Sub1_1.method635(local16.anInt771)) {
					Class4.method58(new Class1_Sub1_Sub3(local16.aByteArray10, (byte) 1), this.aClass44_Sub1_1);
				}
			}
		} catch (@Pc(164) RuntimeException local164) {
			signlink.reporterror("94607, " + 0 + ", " + local164.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!d;B)Z")
	private boolean method106(@OriginalArg(0) Class6 arg0) {
		try {
			@Pc(4) int local4 = arg0.anInt424;
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
				this.aStringArray6[this.anInt287] = "Remove @whi@" + this.aStringArray2[local4];
				this.anIntArray85[this.anInt287] = 513;
				this.anInt287++;
				this.aStringArray6[this.anInt287] = "Message @whi@" + this.aStringArray2[local4];
				this.anIntArray85[this.anInt287] = 902;
				this.anInt287++;
				return true;
			} else if (local4 >= 401 && local4 <= 500) {
				this.aStringArray6[this.anInt287] = "Remove @whi@" + arg0.aString18;
				this.anIntArray85[this.anInt287] = 884;
				this.anInt287++;
				return true;
			} else {
				return false;
			}
		} catch (@Pc(134) RuntimeException local134) {
			signlink.reporterror("71763, " + arg0 + ", " + 15 + ", " + local134.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILclient!lb;I)V")
	private void method107(@OriginalArg(1) Class1_Sub1_Sub3 arg0, @OriginalArg(2) int arg1) {
		try {
			while (true) {
				if (arg0.anInt744 + 21 < arg1 * 8) {
					@Pc(12) int local12 = arg0.method484(14);
					if (local12 != 16383) {
						if (this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local12] == null) {
							this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local12] = new Class1_Sub1_Sub1_Sub1_Sub2();
						}
						@Pc(32) Class1_Sub1_Sub1_Sub1_Sub2 local32 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local12];
						this.anIntArray92[this.anInt416++] = local12;
						local32.anInt1030 = anInt207;
						local32.aClass13_2 = Class13.method321(arg0.method484(11));
						local32.anInt993 = local32.aClass13_2.aByte26;
						local32.anInt1033 = local32.aClass13_2.anInt567;
						local32.anInt996 = local32.aClass13_2.anInt554;
						local32.anInt997 = local32.aClass13_2.anInt555;
						local32.anInt998 = local32.aClass13_2.anInt556;
						local32.anInt999 = local32.aClass13_2.anInt557;
						local32.anInt994 = local32.aClass13_2.anInt553;
						@Pc(93) int local93 = arg0.method484(5);
						if (local93 > 15) {
							local93 -= 32;
						}
						@Pc(102) int local102 = arg0.method484(5);
						if (local102 > 15) {
							local102 -= 32;
						}
						@Pc(111) int local111 = arg0.method484(1);
						local32.method671(aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray269[0] + local93, local111 == 1, aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray270[0] + local102);
						@Pc(137) int local137 = arg0.method484(1);
						if (local137 == 1) {
							this.anIntArray77[this.anInt349++] = local12;
						}
						continue;
					}
				}
				arg0.method485(941);
				return;
			}
		} catch (@Pc(164) RuntimeException local164) {
			signlink.reporterror("3788, " + -196 + ", " + arg0 + ", " + arg1 + ", " + local164.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(BI)Ljava/lang/String;")
	private String method108(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1) {
		try {
			if (arg0 != this.aByte10) {
				this.method88();
			}
			return arg1 < 999999999 ? String.valueOf(arg1) : "*";
		} catch (@Pc(14) RuntimeException local14) {
			signlink.reporterror("99674, " + arg0 + ", " + arg1 + ", " + local14.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "i", descriptor = "(I)V")
	private void method109() {
		try {
			for (@Pc(3) int local3 = 0; local3 < this.anInt270; local3++) {
				if (this.anIntArray64[local3] <= 0) {
					@Pc(12) boolean local12 = false;
					try {
						if (this.anIntArray59[local3] != this.anInt406 || this.anIntArray31[local3] != this.anInt352) {
							@Pc(45) Class1_Sub1_Sub3 local45 = Class5.method78(this.anIntArray59[local3], this.anIntArray31[local3]);
							if (System.currentTimeMillis() + (long) (local45.anInt743 / 22) > this.aLong15 + (long) (this.anInt240 / 22)) {
								this.anInt240 = local45.anInt743;
								this.aLong15 = System.currentTimeMillis();
								if (this.method228(local45.aByteArray9, local45.anInt743)) {
									this.anInt406 = this.anIntArray59[local3];
									this.anInt352 = this.anIntArray31[local3];
								} else {
									local12 = true;
								}
							}
						} else if (!this.method128()) {
							local12 = true;
						}
					} catch (@Pc(95) Exception local95) {
					}
					if (local12 && this.anIntArray64[local3] != -5) {
						this.anIntArray64[local3] = -5;
					} else {
						this.anInt270--;
						for (@Pc(111) int local111 = local3; local111 < this.anInt270; local111++) {
							this.anIntArray59[local111] = this.anIntArray59[local111 + 1];
							this.anIntArray31[local111] = this.anIntArray31[local111 + 1];
							this.anIntArray64[local111] = this.anIntArray64[local111 + 1];
						}
						local3--;
					}
				} else {
					@Pc(163) int local163 = this.anIntArray64[local3]--;
				}
			}
			if (this.anInt269 > 0) {
				this.anInt269 -= 20;
				if (this.anInt269 < 0) {
					this.anInt269 = 0;
				}
				if (this.anInt269 == 0 && this.aBoolean70 && !aBoolean87) {
					this.anInt377 = this.anInt313;
					this.aBoolean84 = true;
					this.aClass44_Sub1_1.method638(2, this.anInt377);
					return;
				}
			}
		} catch (@Pc(214) RuntimeException local214) {
			signlink.reporterror("29857, " + 0 + ", " + local214.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(II)V")
	private void method110(@OriginalArg(0) int arg0) {
		try {
			@Pc(16) Class6 local16 = Class6.aClass6Array1[arg0];
			for (@Pc(18) int local18 = 0; local18 < local16.anIntArray97.length && local16.anIntArray97[local18] != -1; local18++) {
				@Pc(33) Class6 local33 = Class6.aClass6Array1[local16.anIntArray97[local18]];
				if (local33.anInt422 == 1) {
					this.method110(local33.anInt420);
				}
				local33.anInt418 = 0;
				local33.anInt419 = 0;
			}
		} catch (@Pc(56) RuntimeException local56) {
			signlink.reporterror("16646, " + arg0 + ", " + -147 + ", " + local56.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!y;II)V")
	private void method111(@OriginalArg(0) Class1_Sub1_Sub1_Sub1 arg0, @OriginalArg(2) int arg1) {
		try {
			this.method112(arg0.anInt990, arg0.anInt991, arg1);
		} catch (@Pc(15) RuntimeException local15) {
			signlink.reporterror("18394, " + arg0 + ", " + -213 + ", " + arg1 + ", " + local15.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIII)V")
	private void method112(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		try {
			if (arg0 >= 128 && arg1 >= 128 && arg0 <= 13056 && arg1 <= 13056) {
				@Pc(33) int local33 = this.method132(arg0, arg1, this.anInt327) - arg2;
				@Pc(38) int local38 = arg0 - this.anInt217;
				@Pc(43) int local43 = local33 - this.anInt218;
				@Pc(48) int local48 = arg1 - this.anInt219;
				@Pc(53) int local53 = Class1_Sub1_Sub1_Sub5.anIntArray150[this.anInt220];
				@Pc(58) int local58 = Class1_Sub1_Sub1_Sub5.anIntArray151[this.anInt220];
				@Pc(63) int local63 = Class1_Sub1_Sub1_Sub5.anIntArray150[this.anInt221];
				@Pc(68) int local68 = Class1_Sub1_Sub1_Sub5.anIntArray151[this.anInt221];
				@Pc(78) int local78 = local48 * local63 + local38 * local68 >> 16;
				@Pc(88) int local88 = local48 * local68 - local38 * local63 >> 16;
				@Pc(90) int local90 = local78;
				@Pc(100) int local100 = local43 * local58 - local88 * local53 >> 16;
				@Pc(110) int local110 = local43 * local53 + local88 * local58 >> 16;
				if (local110 >= 50) {
					this.anInt296 = Class1_Sub1_Sub2_Sub1.anInt589 + (local90 << 9) / local110;
					this.anInt297 = Class1_Sub1_Sub2_Sub1.anInt590 + (local100 << 9) / local110;
				} else {
					this.anInt296 = -1;
					this.anInt297 = -1;
				}
			} else {
				this.anInt296 = -1;
				this.anInt297 = -1;
			}
		} catch (@Pc(142) RuntimeException local142) {
			signlink.reporterror("96817, " + 361 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local142.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "j", descriptor = "(I)V")
	private void method113() {
		try {
			if (this.anInt287 >= 2 || this.anInt212 != 0 || this.anInt381 != 0) {
				@Pc(31) String local31;
				if (this.anInt212 == 1 && this.anInt287 < 2) {
					local31 = "Use " + this.aString5 + " with...";
				} else if (this.anInt381 == 1 && this.anInt287 < 2) {
					local31 = this.aString17 + "...";
				} else {
					local31 = this.aStringArray6[this.anInt287 - 1];
				}
				if (this.anInt287 > 2) {
					local31 = local31 + "@whi@ / " + (this.anInt287 - 2) + " more options";
				}
				this.aClass1_Sub1_Sub2_Sub4_3.method449(this.anInt275, 4, local31, 15, 16777215, anInt207 / 1000);
			}
		} catch (@Pc(101) RuntimeException local101) {
			signlink.reporterror("85338, " + -303 + ", " + local101.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ZZ)V")
	private void method114(@OriginalArg(0) boolean arg0) {
		try {
			for (@Pc(1) int local1 = 0; local1 < this.anInt416; local1++) {
				@Pc(11) Class1_Sub1_Sub1_Sub1_Sub2 local11 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[this.anIntArray92[local1]];
				@Pc(20) int local20 = (this.anIntArray92[local1] << 14) + 536870912;
				if (local11 != null && local11.method674() && local11.aClass13_2.aBoolean141 == arg0) {
					@Pc(36) int local36 = local11.anInt990 >> 7;
					@Pc(41) int local41 = local11.anInt991 >> 7;
					if (local36 >= 0 && local36 < 104 && local41 >= 0 && local41 < 104) {
						if (local11.anInt993 == 1 && (local11.anInt990 & 0x7F) == 64 && (local11.anInt991 & 0x7F) == 64) {
							if (this.anIntArrayArray4[local36][local41] == this.anInt234) {
								continue;
							}
							this.anIntArrayArray4[local36][local41] = this.anInt234;
						}
						this.aClass37_1.method534(this.method132(local11.anInt990, local11.anInt991, this.anInt327), local11, local11.anInt990, local20, local11.anInt991, (byte) 1, (local11.anInt993 - 1) * 64 + 60, local11.anInt992, this.anInt327, local11.aBoolean241);
					}
				}
			}
			this.aBoolean51 &= true;
		} catch (@Pc(131) RuntimeException local131) {
			signlink.reporterror("76225, " + arg0 + ", " + true + ", " + local131.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIBLclient!ib;)V")
	private void method115(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class1_Sub1_Sub2_Sub2 arg2) {
		try {
			if (this.aByte19 != -111) {
				this.aBoolean50 = !this.aBoolean50;
			}
			@Pc(19) int local19 = this.anInt386 + this.anInt391 & 0x7FF;
			@Pc(27) int local27 = arg1 * arg1 + arg0 * arg0;
			if (local27 <= 6400) {
				@Pc(35) int local35 = Class1_Sub1_Sub1_Sub5.anIntArray150[local19];
				@Pc(39) int local39 = Class1_Sub1_Sub1_Sub5.anIntArray151[local19];
				@Pc(48) int local48 = local35 * 256 / (this.anInt371 + 256);
				@Pc(57) int local57 = local39 * 256 / (this.anInt371 + 256);
				@Pc(67) int local67 = arg0 * local48 + arg1 * local57 >> 16;
				@Pc(77) int local77 = arg0 * local57 - arg1 * local48 >> 16;
				if (local27 > 2500) {
					arg2.method394(local67 + 94 + 4 - arg2.anInt651 / 2, this.aClass1_Sub1_Sub2_Sub3_12, 83 - local77 - arg2.anInt652 / 2 - 4);
				} else {
					arg2.method388(this.aByte14, local67 + 94 + 4 - arg2.anInt651 / 2, 83 - local77 - arg2.anInt652 / 2 - 4);
				}
			}
		} catch (@Pc(132) RuntimeException local132) {
			signlink.reporterror("93901, " + arg0 + ", " + arg1 + ", " + -111 + ", " + arg2 + ", " + local132.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(I)V")
	@Override
	protected void method90() {
		try {
			signlink.reporterror = false;
			try {
				if (this.aClass8_1 != null) {
					this.aClass8_1.method246();
				}
			} catch (@Pc(11) Exception local11) {
			}
			this.aClass8_1 = null;
			this.method160();
			if (this.aClass11_1 != null) {
				this.aClass11_1.aBoolean135 = false;
			}
			this.aClass11_1 = null;
			this.aClass44_Sub1_1.method630();
			this.aClass44_Sub1_1 = null;
			this.aClass1_Sub1_Sub3_2 = null;
			this.aClass1_Sub1_Sub3_3 = null;
			this.aClass1_Sub1_Sub3_4 = null;
			this.anIntArray34 = null;
			this.aByteArrayArray1 = null;
			this.aByteArrayArray2 = null;
			this.anIntArray35 = null;
			this.anIntArray36 = null;
			this.anIntArrayArrayArray5 = null;
			this.aByteArrayArrayArray7 = null;
			this.aClass37_1 = null;
			this.aClass19Array1 = null;
			this.anIntArrayArray3 = null;
			this.anIntArrayArray5 = null;
			this.anIntArray37 = null;
			this.anIntArray38 = null;
			this.aByteArray2 = null;
			this.aClass35_12 = null;
			this.aClass35_13 = null;
			this.aClass35_14 = null;
			this.aClass35_15 = null;
			this.aClass35_16 = null;
			this.aClass35_17 = null;
			this.aClass35_18 = null;
			this.aClass35_3 = null;
			this.aClass35_4 = null;
			this.aClass35_5 = null;
			this.aClass35_6 = null;
			this.aClass35_7 = null;
			this.aClass35_8 = null;
			this.aClass35_9 = null;
			this.aClass35_10 = null;
			this.aClass35_11 = null;
			this.aClass1_Sub1_Sub2_Sub3_11 = null;
			this.aClass1_Sub1_Sub2_Sub3_12 = null;
			this.aClass1_Sub1_Sub2_Sub3_13 = null;
			this.aClass1_Sub1_Sub2_Sub3_8 = null;
			this.aClass1_Sub1_Sub2_Sub3_9 = null;
			this.aClass1_Sub1_Sub2_Sub3_10 = null;
			this.aClass1_Sub1_Sub2_Sub3Array2 = null;
			this.aClass1_Sub1_Sub2_Sub3_1 = null;
			this.aClass1_Sub1_Sub2_Sub3_2 = null;
			this.aClass1_Sub1_Sub2_Sub3_3 = null;
			this.aClass1_Sub1_Sub2_Sub3_4 = null;
			this.aClass1_Sub1_Sub2_Sub3_5 = null;
			this.aClass1_Sub1_Sub2_Sub3_14 = null;
			this.aClass1_Sub1_Sub2_Sub3_15 = null;
			this.aClass1_Sub1_Sub2_Sub3_16 = null;
			this.aClass1_Sub1_Sub2_Sub3_17 = null;
			this.aClass1_Sub1_Sub2_Sub3_18 = null;
			this.aClass1_Sub1_Sub2_Sub2_8 = null;
			this.aClass1_Sub1_Sub2_Sub2Array3 = null;
			this.aClass1_Sub1_Sub2_Sub2Array5 = null;
			this.aClass1_Sub1_Sub2_Sub2Array7 = null;
			this.aClass1_Sub1_Sub2_Sub2_10 = null;
			this.aClass1_Sub1_Sub2_Sub2_11 = null;
			this.aClass1_Sub1_Sub2_Sub2_12 = null;
			this.aClass1_Sub1_Sub2_Sub2_13 = null;
			this.aClass1_Sub1_Sub2_Sub3Array3 = null;
			this.aClass1_Sub1_Sub2_Sub2Array4 = null;
			this.anIntArrayArray4 = null;
			this.aClass1_Sub1_Sub1_Sub1_Sub1Array1 = null;
			this.anIntArray76 = null;
			this.anIntArray77 = null;
			this.aClass1_Sub1_Sub3Array1 = null;
			this.anIntArray61 = null;
			this.aClass1_Sub1_Sub1_Sub1_Sub2Array1 = null;
			this.anIntArray92 = null;
			this.aClass29ArrayArrayArray1 = null;
			this.aClass29_3 = null;
			this.aClass29_2 = null;
			this.aClass29_1 = null;
			this.anIntArray83 = null;
			this.anIntArray84 = null;
			this.anIntArray85 = null;
			this.anIntArray86 = null;
			this.aStringArray6 = null;
			this.anIntArray73 = null;
			this.anIntArray56 = null;
			this.anIntArray57 = null;
			this.aClass1_Sub1_Sub2_Sub2Array6 = null;
			this.aClass1_Sub1_Sub2_Sub2_5 = null;
			this.aStringArray2 = null;
			this.aLongArray4 = null;
			this.anIntArray63 = null;
			this.aClass35_22 = null;
			this.aClass35_23 = null;
			this.aClass35_19 = null;
			this.aClass35_20 = null;
			this.aClass35_21 = null;
			this.aClass35_24 = null;
			this.aClass35_25 = null;
			this.aClass35_26 = null;
			this.aClass35_27 = null;
			this.method196();
			Class9.method286((byte) 1);
			Class13.method320((byte) 1);
			Class15.method357();
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
			Class1_Sub1_Sub2_Sub1.method339((byte) 1);
			Class37.method522((byte) 1);
			Class1_Sub1_Sub1_Sub5.method256((byte) 1);
			Class12.method302();
			System.gc();
		} catch (@Pc(369) RuntimeException local369) {
			signlink.reporterror("98368, " + 22257 + ", " + local369.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ZLclient!d;I)I")
	private int method116(@OriginalArg(1) Class6 arg0, @OriginalArg(2) int arg1) {
		try {
			this.aBoolean51 &= true;
			if (arg0.anIntArrayArray7 == null || arg1 >= arg0.anIntArrayArray7.length) {
				return -2;
			}
			try {
				@Pc(22) int[] local22 = arg0.anIntArrayArray7[arg1];
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
						local35 = this.anIntArray41[local22[local26++]];
					}
					if (local33 == 2) {
						local35 = this.anIntArray81[local22[local26++]];
					}
					if (local33 == 3) {
						local35 = this.anIntArray91[local22[local26++]];
					}
					@Pc(84) Class6 local84;
					@Pc(89) int local89;
					@Pc(102) int local102;
					if (local33 == 4) {
						local84 = Class6.aClass6Array1[local22[local26++]];
						local89 = local22[local26++];
						if (local89 >= 0 && local89 < Class15.anInt596 && (!Class15.method358(local89).aBoolean153 || aBoolean86)) {
							for (local102 = 0; local102 < local84.anIntArray93.length; local102++) {
								if (local84.anIntArray93[local102] == local89 + 1) {
									local35 += local84.anIntArray94[local102];
								}
							}
						}
					}
					if (local33 == 5) {
						local35 = this.anIntArray73[local22[local26++]];
					}
					if (local33 == 6) {
						local35 = anIntArray87[this.anIntArray81[local22[local26++]] - 1];
					}
					if (local33 == 7) {
						local35 = this.anIntArray73[local22[local26++]] * 100 / 46875;
					}
					if (local33 == 8) {
						local35 = aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt131;
					}
					@Pc(177) int local177;
					if (local33 == 9) {
						for (local177 = 0; local177 < Class30.anInt812; local177++) {
							if (Class30.aBooleanArray9[local177]) {
								local35 += this.anIntArray81[local177];
							}
						}
					}
					if (local33 == 10) {
						local84 = Class6.aClass6Array1[local22[local26++]];
						local89 = local22[local26++] + 1;
						if (local89 >= 0 && local89 < Class15.anInt596 && (!Class15.method358(local89).aBoolean153 || aBoolean86)) {
							for (local102 = 0; local102 < local84.anIntArray93.length; local102++) {
								if (local84.anIntArray93[local102] == local89) {
									local35 = 999999999;
									break;
								}
							}
						}
					}
					if (local33 == 11) {
						local35 = this.anInt226;
					}
					if (local33 == 12) {
						local35 = this.anInt265;
					}
					if (local33 == 13) {
						local177 = this.anIntArray73[local22[local26++]];
						local89 = local22[local26++];
						local35 = (local177 & 0x1 << local89) == 0 ? 0 : 1;
					}
					if (local33 == 14) {
						local177 = local22[local26++];
						@Pc(292) Class36 local292 = Class36.aClass36Array1[local177];
						local102 = local292.anInt844;
						@Pc(298) int local298 = local292.anInt845;
						@Pc(301) int local301 = local292.anInt846;
						@Pc(307) int local307 = anIntArray32[local301 - local298];
						local35 = this.anIntArray73[local102] >> local298 & local307;
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
						local35 = (aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt990 >> 7) + this.anInt322;
					}
					if (local33 == 19) {
						local35 = (aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt991 >> 7) + this.anInt323;
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
			signlink.reporterror("92864, " + true + ", " + arg0 + ", " + arg1 + ", " + local403.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(BLclient!d;)V")
	private void method117(@OriginalArg(1) Class6 arg0) {
		try {
			@Pc(4) int local4 = arg0.anInt424;
			if (this.aByte12 == -123) {
				@Pc(65) int local65;
				if (local4 >= 1 && local4 <= 100 || local4 >= 701 && local4 <= 800) {
					if (local4 == 1 && this.anInt345 == 0) {
						arg0.aString18 = "Loading friend list";
						arg0.anInt423 = 0;
					} else if (local4 == 1 && this.anInt345 == 1) {
						arg0.aString18 = "Connecting to friendserver";
						arg0.anInt423 = 0;
					} else if (local4 == 2 && this.anInt345 != 2) {
						arg0.aString18 = "Please wait...";
						arg0.anInt423 = 0;
					} else {
						local65 = this.anInt344;
						if (this.anInt345 != 2) {
							local65 = 0;
						}
						if (local4 > 700) {
							local4 -= 601;
						} else {
							local4--;
						}
						if (local4 >= local65) {
							arg0.aString18 = "";
							arg0.anInt423 = 0;
						} else {
							arg0.aString18 = this.aStringArray2[local4];
							arg0.anInt423 = 1;
						}
					}
				} else if (local4 >= 101 && local4 <= 200 || !(local4 < 801 || local4 > 900)) {
					local65 = this.anInt344;
					if (this.anInt345 != 2) {
						local65 = 0;
					}
					if (local4 > 800) {
						local4 -= 701;
					} else {
						local4 -= 101;
					}
					if (local4 >= local65) {
						arg0.aString18 = "";
						arg0.anInt423 = 0;
					} else {
						if (this.anIntArray63[local4] == 0) {
							arg0.aString18 = "@red@Offline";
						} else if (this.anIntArray63[local4] == anInt404) {
							arg0.aString18 = "@gre@World-" + (this.anIntArray63[local4] - 9);
						} else {
							arg0.aString18 = "@yel@World-" + (this.anIntArray63[local4] - 9);
						}
						arg0.anInt423 = 1;
					}
				} else if (local4 == 203) {
					local65 = this.anInt344;
					if (this.anInt345 != 2) {
						local65 = 0;
					}
					arg0.anInt430 = local65 * 15 + 20;
					if (arg0.anInt430 <= arg0.anInt426) {
						arg0.anInt430 = arg0.anInt426 + 1;
					}
				} else if (local4 >= 401 && local4 <= 500) {
					local4 -= 401;
					if (local4 >= this.anInt278) {
						arg0.aString18 = "";
						arg0.anInt423 = 0;
					} else {
						arg0.aString18 = Class48.method664(Class48.method661(this.aLongArray3[local4]));
						arg0.anInt423 = 1;
					}
				} else if (local4 == 503) {
					arg0.anInt430 = this.anInt278 * 15 + 20;
					if (arg0.anInt430 <= arg0.anInt426) {
						arg0.anInt430 = arg0.anInt426 + 1;
					}
				} else if (local4 == 327) {
					arg0.anInt446 = 150;
					arg0.anInt447 = (int) (Math.sin((double) anInt207 / 40.0D) * 256.0D) & 0x7FF;
					if (this.aBoolean60) {
						for (local65 = 0; local65 < 7; local65++) {
							@Pc(302) int local302 = this.anIntArray33[local65];
							if (local302 >= 0 && !Class23.aClass23Array1[local302].method491()) {
								return;
							}
						}
						this.aBoolean60 = false;
						@Pc(321) Class1_Sub1_Sub1_Sub5[] local321 = new Class1_Sub1_Sub1_Sub5[7];
						@Pc(323) int local323 = 0;
						for (@Pc(325) int local325 = 0; local325 < 7; local325++) {
							@Pc(332) int local332 = this.anIntArray33[local325];
							if (local332 >= 0) {
								local321[local323++] = Class23.aClass23Array1[local332].method492();
							}
						}
						@Pc(354) Class1_Sub1_Sub1_Sub5 local354 = new Class1_Sub1_Sub1_Sub5(local323, -643, local321);
						for (@Pc(356) int local356 = 0; local356 < 5; local356++) {
							if (this.anIntArray65[local356] != 0) {
								local354.method274(anIntArrayArray6[local356][0], anIntArrayArray6[local356][this.anIntArray65[local356]]);
								if (local356 == 1) {
									local354.method274(anIntArray78[0], anIntArray78[this.anIntArray65[local356]]);
								}
							}
						}
						local354.method267();
						local354.method268(Class27.aClass27Array1[aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt994].anIntArray222[0]);
						local354.method277(64, 850, -30, -50, -30, true);
						arg0.anInt439 = 5;
						arg0.anInt440 = 0;
						Class6.method234(local354);
					}
				} else if (local4 == 324) {
					if (this.aClass1_Sub1_Sub2_Sub2_6 == null) {
						this.aClass1_Sub1_Sub2_Sub2_6 = arg0.aClass1_Sub1_Sub2_Sub2_14;
						this.aClass1_Sub1_Sub2_Sub2_7 = arg0.aClass1_Sub1_Sub2_Sub2_15;
					}
					if (this.aBoolean63) {
						arg0.aClass1_Sub1_Sub2_Sub2_14 = this.aClass1_Sub1_Sub2_Sub2_7;
					} else {
						arg0.aClass1_Sub1_Sub2_Sub2_14 = this.aClass1_Sub1_Sub2_Sub2_6;
					}
				} else if (local4 == 325) {
					if (this.aClass1_Sub1_Sub2_Sub2_6 == null) {
						this.aClass1_Sub1_Sub2_Sub2_6 = arg0.aClass1_Sub1_Sub2_Sub2_14;
						this.aClass1_Sub1_Sub2_Sub2_7 = arg0.aClass1_Sub1_Sub2_Sub2_15;
					}
					if (this.aBoolean63) {
						arg0.aClass1_Sub1_Sub2_Sub2_14 = this.aClass1_Sub1_Sub2_Sub2_6;
					} else {
						arg0.aClass1_Sub1_Sub2_Sub2_14 = this.aClass1_Sub1_Sub2_Sub2_7;
					}
				} else if (local4 == 600) {
					arg0.aString18 = this.aString10;
					if (anInt207 % 20 < 10) {
						arg0.aString18 = arg0.aString18 + "|";
					} else {
						arg0.aString18 = arg0.aString18 + " ";
					}
				} else {
					if (local4 == 613) {
						if (this.anInt233 < 1) {
							arg0.aString18 = "";
						} else if (this.aBoolean74) {
							arg0.anInt435 = 16711680;
							arg0.aString18 = "Moderator option: Mute player for 48 hours: <ON>";
						} else {
							arg0.anInt435 = 16777215;
							arg0.aString18 = "Moderator option: Mute player for 48 hours: <OFF>";
						}
					}
					@Pc(562) String local562;
					if (local4 == 650 || local4 == 655) {
						if (this.anInt284 == 0) {
							arg0.aString18 = "";
						} else {
							if (this.anInt302 == 0) {
								local562 = "earlier today";
							} else if (this.anInt302 == 1) {
								local562 = "yesterday";
							} else {
								local562 = this.anInt302 + " days ago";
							}
							arg0.aString18 = "You last logged in " + local562 + " from: " + signlink.dns;
						}
					}
					if (local4 == 651) {
						if (this.anInt243 == 0) {
							arg0.aString18 = "0 unread messages";
							arg0.anInt435 = 16776960;
						}
						if (this.anInt243 == 1) {
							arg0.aString18 = "1 unread message";
							arg0.anInt435 = 65280;
						}
						if (this.anInt243 > 1) {
							arg0.aString18 = this.anInt243 + " unread messages";
							arg0.anInt435 = 65280;
						}
					}
					if (local4 == 652) {
						if (this.anInt312 == 201) {
							if (this.anInt339 == 1) {
								arg0.aString18 = "@yel@This is a non-members world: @whi@Since you are a member we";
							} else {
								arg0.aString18 = "";
							}
						} else if (this.anInt312 == 200) {
							arg0.aString18 = "You have not yet set any password recovery questions.";
						} else {
							if (this.anInt312 == 0) {
								local562 = "Earlier today";
							} else if (this.anInt312 == 1) {
								local562 = "Yesterday";
							} else {
								local562 = this.anInt312 + " days ago";
							}
							arg0.aString18 = local562 + " you changed your recovery questions";
						}
					}
					if (local4 == 653) {
						if (this.anInt312 == 201) {
							if (this.anInt339 == 1) {
								arg0.aString18 = "@whi@recommend you use a members world instead. You may use";
							} else {
								arg0.aString18 = "";
							}
						} else if (this.anInt312 == 200) {
							arg0.aString18 = "We strongly recommend you do so now to secure your account.";
						} else {
							arg0.aString18 = "If you do not remember making this change then cancel it immediately";
						}
					}
					if (local4 == 654) {
						if (this.anInt312 == 201) {
							if (this.anInt339 == 1) {
								arg0.aString18 = "@whi@this world but member benefits are unavailable whilst here.";
							} else {
								arg0.aString18 = "";
							}
						} else if (this.anInt312 == 200) {
							arg0.aString18 = "Do this from the 'account management' area on our front webpage";
						} else {
							arg0.aString18 = "Do this from the 'account management' area on our front webpage";
						}
					}
				}
			}
		} catch (@Pc(770) RuntimeException local770) {
			signlink.reporterror("32539, " + -123 + ", " + arg0 + ", " + local770.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIILclient!ab;Z)V")
	private void method118(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class1_Sub1_Sub1_Sub1_Sub1 arg3) {
		try {
			if (arg3 != aClass1_Sub1_Sub1_Sub1_Sub1_1 && this.anInt287 < 400) {
				@Pc(38) String local38;
				if (arg3.anInt132 == 0) {
					local38 = arg3.aString3 + method159(arg3.anInt131, aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt131) + " (level-" + arg3.anInt131 + ")";
				} else {
					local38 = arg3.aString3 + " (skill-" + arg3.anInt132 + ")";
				}
				@Pc(168) int local168;
				if (this.anInt212 == 1) {
					this.aStringArray6[this.anInt287] = "Use " + this.aString5 + " with @whi@" + local38;
					this.anIntArray85[this.anInt287] = 275;
					this.anIntArray86[this.anInt287] = arg1;
					this.anIntArray83[this.anInt287] = arg0;
					this.anIntArray84[this.anInt287] = arg2;
					this.anInt287++;
				} else if (this.anInt381 != 1) {
					for (local168 = 4; local168 >= 0; local168--) {
						if (this.aStringArray1[local168] != null) {
							this.aStringArray6[this.anInt287] = this.aStringArray1[local168] + " @whi@" + local38;
							@Pc(195) short local195 = 0;
							if (this.aStringArray1[local168].equalsIgnoreCase("attack")) {
								if (arg3.anInt131 > aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt131) {
									local195 = 2000;
								}
							} else if (this.aBooleanArray3[local168]) {
								local195 = 2000;
							}
							if (local168 == 0) {
								this.anIntArray85[this.anInt287] = local195 + 639;
							}
							if (local168 == 1) {
								this.anIntArray85[this.anInt287] = local195 + 499;
							}
							if (local168 == 2) {
								this.anIntArray85[this.anInt287] = local195 + 27;
							}
							if (local168 == 3) {
								this.anIntArray85[this.anInt287] = local195 + 387;
							}
							if (local168 == 4) {
								this.anIntArray85[this.anInt287] = local195 + 185;
							}
							this.anIntArray86[this.anInt287] = arg1;
							this.anIntArray83[this.anInt287] = arg0;
							this.anIntArray84[this.anInt287] = arg2;
							this.anInt287++;
						}
					}
				} else if ((this.anInt383 & 0x8) == 8) {
					this.aStringArray6[this.anInt287] = this.aString17 + " @whi@" + local38;
					this.anIntArray85[this.anInt287] = 131;
					this.anIntArray86[this.anInt287] = arg1;
					this.anIntArray83[this.anInt287] = arg0;
					this.anIntArray84[this.anInt287] = arg2;
					this.anInt287++;
				}
				for (local168 = 0; local168 < this.anInt287; local168++) {
					if (this.anIntArray85[local168] == 718) {
						this.aStringArray6[local168] = "Walk here @whi@" + local38;
						return;
					}
				}
			}
		} catch (@Pc(328) RuntimeException local328) {
			signlink.reporterror("21318, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + true + ", " + local328.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "k", descriptor = "(I)V")
	private void method119() {
		try {
			this.anInt234++;
			this.method187(true);
			this.method114(true);
			this.method187(false);
			this.method114(false);
			this.method137(this.aBoolean78);
			this.method152();
			@Pc(36) int local36;
			@Pc(75) int local75;
			if (!this.aBoolean65) {
				local36 = this.anInt385;
				if (this.anInt332 / 256 > local36) {
					local36 = this.anInt332 / 256;
				}
				if (this.aBooleanArray4[4] && this.anIntArray44[4] + 128 > local36) {
					local36 = this.anIntArray44[4] + 128;
				}
				local75 = this.anInt386 + this.anInt244 & 0x7FF;
				this.method99(this.anInt307, local36, this.method132(aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt990, aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt991, this.anInt327) - 50, this.anInt306, local75, local36 * 3 + 600);
			}
			if (this.aBoolean65) {
				local36 = this.method203();
			} else {
				local36 = this.method202();
			}
			local75 = this.anInt217;
			@Pc(119) int local119 = this.anInt218;
			@Pc(122) int local122 = this.anInt219;
			@Pc(125) int local125 = this.anInt220;
			@Pc(128) int local128 = this.anInt221;
			@Pc(177) int local177;
			for (@Pc(130) int local130 = 0; local130 < 5; local130++) {
				if (this.aBooleanArray4[local130]) {
					local177 = (int) (Math.random() * (double) (this.anIntArray58[local130] * 2 + 1) - (double) this.anIntArray58[local130] + Math.sin((double) this.anIntArray51[local130] * ((double) this.anIntArray39[local130] / 100.0D)) * (double) this.anIntArray44[local130]);
					if (local130 == 0) {
						this.anInt217 += local177;
					}
					if (local130 == 1) {
						this.anInt218 += local177;
					}
					if (local130 == 2) {
						this.anInt219 += local177;
					}
					if (local130 == 3) {
						this.anInt221 = this.anInt221 + local177 & 0x7FF;
					}
					if (local130 == 4) {
						this.anInt220 += local177;
						if (this.anInt220 < 128) {
							this.anInt220 = 128;
						}
						if (this.anInt220 > 383) {
							this.anInt220 = 383;
						}
					}
				}
			}
			local177 = Class1_Sub1_Sub2_Sub1.anInt593;
			Class1_Sub1_Sub1_Sub5.aBoolean117 = true;
			Class1_Sub1_Sub1_Sub5.anInt502 = 0;
			Class1_Sub1_Sub1_Sub5.anInt500 = super.anInt195 - 4;
			Class1_Sub1_Sub1_Sub5.anInt501 = super.anInt196 - 4;
			Class1_Sub1_Sub2.method434();
			this.aClass37_1.method562(this.anInt217, this.anInt219, this.anInt221, this.anInt218, local36, this.anInt220);
			this.aClass37_1.method537();
			this.method197();
			this.method208();
			this.method139(local177, 502);
			this.method100();
			this.aClass35_14.method518(4, super.aGraphics2, 4);
			this.anInt217 = local75;
			this.anInt218 = local119;
			this.anInt219 = local122;
			this.anInt220 = local125;
			this.anInt221 = local128;
			this.anInt393 += 0;
		} catch (@Pc(322) RuntimeException local322) {
			signlink.reporterror("55670, " + 0 + ", " + local322.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Z)V")
	private void method120(@OriginalArg(0) boolean arg0) {
		try {
			if (arg0) {
				this.anInt394 = -1;
			}
			if (super.anInt200 == 1) {
				if (super.anInt201 >= 6 && super.anInt201 <= 106 && super.anInt202 >= 467 && super.anInt202 <= 499) {
					this.anInt282 = (this.anInt282 + 1) % 4;
					this.aBoolean75 = true;
					this.aBoolean73 = true;
					this.aClass1_Sub1_Sub3_2.method462(154);
					this.aClass1_Sub1_Sub3_2.method463(this.anInt282);
					this.aClass1_Sub1_Sub3_2.method463(this.anInt285);
					this.aClass1_Sub1_Sub3_2.method463(this.anInt209);
				}
				if (super.anInt201 >= 135 && super.anInt201 <= 235 && super.anInt202 >= 467 && super.anInt202 <= 499) {
					this.anInt285 = (this.anInt285 + 1) % 3;
					this.aBoolean75 = true;
					this.aBoolean73 = true;
					this.aClass1_Sub1_Sub3_2.method462(154);
					this.aClass1_Sub1_Sub3_2.method463(this.anInt282);
					this.aClass1_Sub1_Sub3_2.method463(this.anInt285);
					this.aClass1_Sub1_Sub3_2.method463(this.anInt209);
				}
				if (super.anInt201 >= 273 && super.anInt201 <= 373 && super.anInt202 >= 467 && super.anInt202 <= 499) {
					this.anInt209 = (this.anInt209 + 1) % 3;
					this.aBoolean75 = true;
					this.aBoolean73 = true;
					this.aClass1_Sub1_Sub3_2.method462(154);
					this.aClass1_Sub1_Sub3_2.method463(this.anInt282);
					this.aClass1_Sub1_Sub3_2.method463(this.anInt285);
					this.aClass1_Sub1_Sub3_2.method463(this.anInt209);
				}
				if (super.anInt201 >= 412 && super.anInt201 <= 512 && super.anInt202 >= 467 && super.anInt202 <= 499) {
					this.method127();
					this.aString10 = "";
					this.aBoolean74 = false;
					for (@Pc(185) int local185 = 0; local185 < Class6.aClass6Array1.length; local185++) {
						if (Class6.aClass6Array1[local185] != null && Class6.aClass6Array1[local185].anInt424 == 600) {
							this.anInt334 = this.anInt317 = Class6.aClass6Array1[local185].anInt421;
							return;
						}
					}
					return;
				}
			}
		} catch (@Pc(214) RuntimeException local214) {
			signlink.reporterror("36900, " + arg0 + ", " + local214.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIIIIIZIIBI)Z")
	private boolean method121(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) byte arg10, @OriginalArg(11) int arg11) {
		try {
			@Pc(11) int local11;
			for (@Pc(7) int local7 = 0; local7 < 104; local7++) {
				for (local11 = 0; local11 < 104; local11++) {
					this.anIntArrayArray3[local7][local11] = 0;
					this.anIntArrayArray5[local7][local11] = 99999999;
				}
			}
			@Pc(40) boolean local40 = false;
			local11 = arg5;
			@Pc(50) int local50 = arg0;
			this.anIntArrayArray3[arg5][arg0] = 99;
			this.anIntArrayArray5[arg5][arg0] = 0;
			@Pc(66) byte local66 = 0;
			@Pc(68) int local68 = 0;
			this.anIntArray37[0] = arg5;
			@Pc(77) int local77 = local66 + 1;
			this.anIntArray38[0] = arg0;
			@Pc(81) boolean local81 = false;
			@Pc(85) int local85 = this.anIntArray37.length;
			@Pc(92) int[][] local92 = this.aClass19Array1[this.anInt327].anIntArrayArray18;
			@Pc(203) int local203;
			while (local68 != local77) {
				local11 = this.anIntArray37[local68];
				local50 = this.anIntArray38[local68];
				local68 = (local68 + 1) % local85;
				if (local11 == arg1 && local50 == arg9) {
					local81 = true;
					break;
				}
				if (arg6 != 0) {
					if ((arg6 < 5 || arg6 == 10) && this.aClass19Array1[this.anInt327].method426(local11, arg8, arg1, arg9, arg6 - 1, local50)) {
						local81 = true;
						break;
					}
					if (arg6 < 10 && this.aClass19Array1[this.anInt327].method427(arg1, arg9, local11, arg6 - 1, arg8, local50)) {
						local81 = true;
						break;
					}
				}
				if (arg2 != 0 && arg3 != 0 && this.aClass19Array1[this.anInt327].method428(arg1, arg2, arg4, arg9, local50, local11, arg3)) {
					local81 = true;
					break;
				}
				local203 = this.anIntArrayArray5[local11][local50] + 1;
				if (local11 > 0 && this.anIntArrayArray3[local11 - 1][local50] == 0 && (local92[local11 - 1][local50] & 0x280108) == 0) {
					this.anIntArray37[local77] = local11 - 1;
					this.anIntArray38[local77] = local50;
					local77 = (local77 + 1) % local85;
					this.anIntArrayArray3[local11 - 1][local50] = 2;
					this.anIntArrayArray5[local11 - 1][local50] = local203;
				}
				if (local11 < 103 && this.anIntArrayArray3[local11 + 1][local50] == 0 && (local92[local11 + 1][local50] & 0x280180) == 0) {
					this.anIntArray37[local77] = local11 + 1;
					this.anIntArray38[local77] = local50;
					local77 = (local77 + 1) % local85;
					this.anIntArrayArray3[local11 + 1][local50] = 8;
					this.anIntArrayArray5[local11 + 1][local50] = local203;
				}
				if (local50 > 0 && this.anIntArrayArray3[local11][local50 - 1] == 0 && (local92[local11][local50 - 1] & 0x280102) == 0) {
					this.anIntArray37[local77] = local11;
					this.anIntArray38[local77] = local50 - 1;
					local77 = (local77 + 1) % local85;
					this.anIntArrayArray3[local11][local50 - 1] = 1;
					this.anIntArrayArray5[local11][local50 - 1] = local203;
				}
				if (local50 < 103 && this.anIntArrayArray3[local11][local50 + 1] == 0 && (local92[local11][local50 + 1] & 0x280120) == 0) {
					this.anIntArray37[local77] = local11;
					this.anIntArray38[local77] = local50 + 1;
					local77 = (local77 + 1) % local85;
					this.anIntArrayArray3[local11][local50 + 1] = 4;
					this.anIntArrayArray5[local11][local50 + 1] = local203;
				}
				if (local11 > 0 && local50 > 0 && this.anIntArrayArray3[local11 - 1][local50 - 1] == 0 && (local92[local11 - 1][local50 - 1] & 0x28010E) == 0 && (local92[local11 - 1][local50] & 0x280108) == 0 && (local92[local11][local50 - 1] & 0x280102) == 0) {
					this.anIntArray37[local77] = local11 - 1;
					this.anIntArray38[local77] = local50 - 1;
					local77 = (local77 + 1) % local85;
					this.anIntArrayArray3[local11 - 1][local50 - 1] = 3;
					this.anIntArrayArray5[local11 - 1][local50 - 1] = local203;
				}
				if (local11 < 103 && local50 > 0 && this.anIntArrayArray3[local11 + 1][local50 - 1] == 0 && (local92[local11 + 1][local50 - 1] & 0x280183) == 0 && (local92[local11 + 1][local50] & 0x280180) == 0 && (local92[local11][local50 - 1] & 0x280102) == 0) {
					this.anIntArray37[local77] = local11 + 1;
					this.anIntArray38[local77] = local50 - 1;
					local77 = (local77 + 1) % local85;
					this.anIntArrayArray3[local11 + 1][local50 - 1] = 9;
					this.anIntArrayArray5[local11 + 1][local50 - 1] = local203;
				}
				if (local11 > 0 && local50 < 103 && this.anIntArrayArray3[local11 - 1][local50 + 1] == 0 && (local92[local11 - 1][local50 + 1] & 0x280138) == 0 && (local92[local11 - 1][local50] & 0x280108) == 0 && (local92[local11][local50 + 1] & 0x280120) == 0) {
					this.anIntArray37[local77] = local11 - 1;
					this.anIntArray38[local77] = local50 + 1;
					local77 = (local77 + 1) % local85;
					this.anIntArrayArray3[local11 - 1][local50 + 1] = 6;
					this.anIntArrayArray5[local11 - 1][local50 + 1] = local203;
				}
				if (local11 < 103 && local50 < 103 && this.anIntArrayArray3[local11 + 1][local50 + 1] == 0 && (local92[local11 + 1][local50 + 1] & 0x2801E0) == 0 && (local92[local11 + 1][local50] & 0x280180) == 0 && (local92[local11][local50 + 1] & 0x280120) == 0) {
					this.anIntArray37[local77] = local11 + 1;
					this.anIntArray38[local77] = local50 + 1;
					local77 = (local77 + 1) % local85;
					this.anIntArrayArray3[local11 + 1][local50 + 1] = 12;
					this.anIntArrayArray5[local11 + 1][local50 + 1] = local203;
				}
			}
			this.anInt300 = 0;
			@Pc(819) int local819;
			@Pc(825) int local825;
			@Pc(831) int local831;
			if (!local81) {
				if (arg7) {
					local203 = 100;
					for (local819 = 1; local819 < 2; local819++) {
						for (local825 = arg1 - local819; local825 <= arg1 + local819; local825++) {
							for (local831 = arg9 - local819; local831 <= arg9 + local819; local831++) {
								if (local825 >= 0 && local831 >= 0 && local825 < 104 && local831 < 104 && this.anIntArrayArray5[local825][local831] < local203) {
									local203 = this.anIntArrayArray5[local825][local831];
									local11 = local825;
									local50 = local831;
									this.anInt300 = 1;
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
			this.anIntArray37[0] = local11;
			local68 = local892 + 1;
			this.anIntArray38[0] = local50;
			local203 = local819 = this.anIntArrayArray3[local11][local50];
			while (local11 != arg5 || local50 != arg0) {
				if (local203 != local819) {
					local819 = local203;
					this.anIntArray37[local68] = local11;
					this.anIntArray38[local68++] = local50;
				}
				if ((local203 & 0x2) != 0) {
					local11++;
				} else if ((local203 & 0x8) != 0) {
					local11--;
				}
				if ((local203 & 0x1) != 0) {
					local50++;
				} else if ((local203 & 0x4) != 0) {
					local50--;
				}
				local203 = this.anIntArrayArray3[local11][local50];
			}
			if (local68 > 0) {
				local85 = local68;
				if (local68 > 25) {
					local85 = 25;
				}
				local68--;
				local825 = this.anIntArray37[local68];
				local831 = this.anIntArray38[local68];
				if (arg11 == 0) {
					this.aClass1_Sub1_Sub3_2.method462(207);
					this.aClass1_Sub1_Sub3_2.method463(local85 + local85 + 3);
				}
				if (arg11 == 1) {
					this.aClass1_Sub1_Sub3_2.method462(86);
					this.aClass1_Sub1_Sub3_2.method463(local85 + local85 + 3 + 14);
				}
				if (arg11 == 2) {
					this.aClass1_Sub1_Sub3_2.method462(138);
					this.aClass1_Sub1_Sub3_2.method463(local85 + local85 + 3);
				}
				if (super.anIntArray29[5] == 1) {
					this.aClass1_Sub1_Sub3_2.method463(1);
				} else {
					this.aClass1_Sub1_Sub3_2.method463(0);
				}
				this.aClass1_Sub1_Sub3_2.method464(local825 + this.anInt322);
				this.aClass1_Sub1_Sub3_2.method464(local831 + this.anInt323);
				this.anInt309 = this.anIntArray37[0];
				this.anInt310 = this.anIntArray38[0];
				for (@Pc(1080) int local1080 = 1; local1080 < local85; local1080++) {
					local68--;
					this.aClass1_Sub1_Sub3_2.method463(this.anIntArray37[local68] - local825);
					this.aClass1_Sub1_Sub3_2.method463(this.anIntArray38[local68] - local831);
				}
				return true;
			} else if (arg11 == 1) {
				return false;
			} else {
				return true;
			}
		} catch (@Pc(1115) RuntimeException local1115) {
			signlink.reporterror("86150, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + arg10 + ", " + arg11 + ", " + local1115.toString());
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
				return new URL("http://127.0.0.1:" + (anInt405 + 80));
			}
		} catch (@Pc(21) Exception local21) {
		}
		return super.getCodeBase();
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ZI)V")
	private void method122(@OriginalArg(1) int arg0) {
		try {
			@Pc(4) int local4 = Class39.aClass39Array1[arg0].anInt889;
			if (local4 != 0) {
				@Pc(12) int local12 = this.anIntArray73[arg0];
				if (local4 == 1) {
					if (local12 == 1) {
						Class1_Sub1_Sub2_Sub1.method348(0.9D);
					}
					if (local12 == 2) {
						Class1_Sub1_Sub2_Sub1.method348(0.8D);
					}
					if (local12 == 3) {
						Class1_Sub1_Sub2_Sub1.method348(0.7D);
					}
					if (local12 == 4) {
						Class1_Sub1_Sub2_Sub1.method348(0.6D);
					}
					Class15.aClass40_8.method586();
					this.aBoolean53 = true;
				}
				if (local4 == 3) {
					@Pc(60) boolean local60 = this.aBoolean70;
					if (local12 == 0) {
						this.method191(this.aBoolean70, 0);
						this.aBoolean70 = true;
					}
					if (local12 == 1) {
						this.method191(this.aBoolean70, -400);
						this.aBoolean70 = true;
					}
					if (local12 == 2) {
						this.method191(this.aBoolean70, -800);
						this.aBoolean70 = true;
					}
					if (local12 == 3) {
						this.method191(this.aBoolean70, -1200);
						this.aBoolean70 = true;
					}
					if (local12 == 4) {
						this.aBoolean70 = false;
					}
					if (this.aBoolean70 != local60 && !aBoolean87) {
						if (this.aBoolean70) {
							this.anInt377 = this.anInt313;
							this.aBoolean84 = true;
							this.aClass44_Sub1_1.method638(2, this.anInt377);
						} else {
							this.method160();
						}
						this.anInt269 = 0;
					}
				}
				if (local4 == 4) {
					if (local12 == 0) {
						this.aBoolean71 = true;
						this.method102(678, 0);
					}
					if (local12 == 1) {
						this.aBoolean71 = true;
						this.method102(678, -400);
					}
					if (local12 == 2) {
						this.aBoolean71 = true;
						this.method102(678, -800);
					}
					if (local12 == 3) {
						this.aBoolean71 = true;
						this.method102(678, -1200);
					}
					if (local12 == 4) {
						this.aBoolean71 = false;
					}
				}
				if (local4 == 5) {
					this.anInt319 = local12;
				}
				if (local4 == 6) {
					this.anInt326 = local12;
				}
				if (local4 == 8) {
					this.anInt333 = local12;
					this.aBoolean73 = true;
				}
				if (local4 == 9) {
					this.anInt242 = local12;
				}
			}
		} catch (@Pc(220) RuntimeException local220) {
			signlink.reporterror("71864, " + false + ", " + arg0 + ", " + local220.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIIII)V")
	private void method123(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		try {
			@Pc(8) int local8 = this.aClass37_1.method549(arg4, arg0, arg2);
			@Pc(26) int local26;
			@Pc(32) int local32;
			@Pc(36) int local36;
			@Pc(38) int local38;
			@Pc(60) int local60;
			@Pc(66) int local66;
			if (local8 != 0) {
				local26 = this.aClass37_1.method553(arg4, arg0, arg2, local8);
				local32 = local26 >> 6 & 0x3;
				local36 = local26 & 0x1F;
				local38 = arg1;
				if (local8 > 0) {
					local38 = arg3;
				}
				@Pc(46) int[] local46 = this.aClass1_Sub1_Sub2_Sub2_5.anIntArray205;
				local60 = arg0 * 4 + (103 - arg2) * 512 * 4 + 24624;
				local66 = local8 >> 14 & 0x7FFF;
				@Pc(69) Class9 local69 = Class9.method287(local66);
				if (local69.anInt514 == -1) {
					if (local36 == 0 || local36 == 2) {
						if (local32 == 0) {
							local46[local60] = local38;
							local46[local60 + 512] = local38;
							local46[local60 + 1024] = local38;
							local46[local60 + 1536] = local38;
						} else if (local32 == 1) {
							local46[local60] = local38;
							local46[local60 + 1] = local38;
							local46[local60 + 2] = local38;
							local46[local60 + 3] = local38;
						} else if (local32 == 2) {
							local46[local60 + 3] = local38;
							local46[local60 + 3 + 512] = local38;
							local46[local60 + 3 + 1024] = local38;
							local46[local60 + 3 + 1536] = local38;
						} else if (local32 == 3) {
							local46[local60 + 1536] = local38;
							local46[local60 + 1536 + 1] = local38;
							local46[local60 + 1536 + 2] = local38;
							local46[local60 + 1536 + 3] = local38;
						}
					}
					if (local36 == 3) {
						if (local32 == 0) {
							local46[local60] = local38;
						} else if (local32 == 1) {
							local46[local60 + 3] = local38;
						} else if (local32 == 2) {
							local46[local60 + 3 + 1536] = local38;
						} else if (local32 == 3) {
							local46[local60 + 1536] = local38;
						}
					}
					if (local36 == 2) {
						if (local32 == 3) {
							local46[local60] = local38;
							local46[local60 + 512] = local38;
							local46[local60 + 1024] = local38;
							local46[local60 + 1536] = local38;
						} else if (local32 == 0) {
							local46[local60] = local38;
							local46[local60 + 1] = local38;
							local46[local60 + 2] = local38;
							local46[local60 + 3] = local38;
						} else if (local32 == 1) {
							local46[local60 + 3] = local38;
							local46[local60 + 3 + 512] = local38;
							local46[local60 + 3 + 1024] = local38;
							local46[local60 + 3 + 1536] = local38;
						} else if (local32 == 2) {
							local46[local60 + 1536] = local38;
							local46[local60 + 1536 + 1] = local38;
							local46[local60 + 1536 + 2] = local38;
							local46[local60 + 1536 + 3] = local38;
						}
					}
				} else {
					@Pc(79) Class1_Sub1_Sub2_Sub3 local79 = this.aClass1_Sub1_Sub2_Sub3Array3[local69.anInt514];
					if (local79 != null) {
						@Pc(91) int local91 = (local69.anInt509 * 4 - local79.anInt674) / 2;
						@Pc(101) int local101 = (local69.anInt510 * 4 - local79.anInt675) / 2;
						local79.method415(this.aByte14, arg0 * 4 + local91 + 48, (104 - arg2 - local69.anInt510) * 4 + 48 + local101);
					}
				}
			}
			local8 = this.aClass37_1.method551(arg4, arg0, arg2);
			if (local8 != 0) {
				local26 = this.aClass37_1.method553(arg4, arg0, arg2, local8);
				local32 = local26 >> 6 & 0x3;
				local36 = local26 & 0x1F;
				local38 = local8 >> 14 & 0x7FFF;
				@Pc(456) Class9 local456 = Class9.method287(local38);
				@Pc(488) int local488;
				if (local456.anInt514 != -1) {
					@Pc(466) Class1_Sub1_Sub2_Sub3 local466 = this.aClass1_Sub1_Sub2_Sub3Array3[local456.anInt514];
					if (local466 != null) {
						local66 = (local456.anInt509 * 4 - local466.anInt674) / 2;
						local488 = (local456.anInt510 * 4 - local466.anInt675) / 2;
						local466.method415(this.aByte14, arg0 * 4 + local66 + 48, (104 - arg2 - local456.anInt510) * 4 + 48 + local488);
					}
				} else if (local36 == 9) {
					local60 = 15658734;
					if (local8 > 0) {
						local60 = 15597568;
					}
					@Pc(526) int[] local526 = this.aClass1_Sub1_Sub2_Sub2_5.anIntArray205;
					local488 = arg0 * 4 + (103 - arg2) * 512 * 4 + 24624;
					if (local32 == 0 || local32 == 2) {
						local526[local488 + 1536] = local60;
						local526[local488 + 1024 + 1] = local60;
						local526[local488 + 512 + 2] = local60;
						local526[local488 + 3] = local60;
					} else {
						local526[local488] = local60;
						local526[local488 + 512 + 1] = local60;
						local526[local488 + 1024 + 2] = local60;
						local526[local488 + 1536 + 3] = local60;
					}
				}
			}
			local8 = this.aClass37_1.method552(arg4, arg0, arg2);
			if (local8 != 0) {
				local26 = local8 >> 14 & 0x7FFF;
				@Pc(621) Class9 local621 = Class9.method287(local26);
				if (local621.anInt514 != -1) {
					@Pc(631) Class1_Sub1_Sub2_Sub3 local631 = this.aClass1_Sub1_Sub2_Sub3Array3[local621.anInt514];
					if (local631 != null) {
						local38 = (local621.anInt509 * 4 - local631.anInt674) / 2;
						@Pc(653) int local653 = (local621.anInt510 * 4 - local631.anInt675) / 2;
						local631.method415(this.aByte14, arg0 * 4 + local38 + 48, (104 - arg2 - local621.anInt510) * 4 + 48 + local653);
						return;
					}
				}
			}
		} catch (@Pc(678) RuntimeException local678) {
			signlink.reporterror("2119, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + 15485 + ", " + local678.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "l", descriptor = "(I)V")
	private void method124(@OriginalArg(0) int arg0) {
		try {
			@Pc(3) boolean local3 = false;
			if (aBoolean87 && this.anInt350 == 2 && Class4.anInt172 != this.anInt327) {
				this.aClass35_14.method517(aBoolean59);
				this.aClass1_Sub1_Sub2_Sub4_2.method443(257, 151, 0, "Loading - please wait.");
				this.aClass1_Sub1_Sub2_Sub4_2.method443(256, 150, 16777215, "Loading - please wait.");
				this.aClass35_14.method518(4, super.aGraphics2, 4);
				this.anInt350 = 1;
				this.aLong16 = System.currentTimeMillis();
			}
			if (this.anInt350 == 1) {
				@Pc(55) int local55 = this.method125((byte) 2);
				if (local55 != 0 && System.currentTimeMillis() - this.aLong16 > 360000L) {
					signlink.reporterror(this.aString14 + " glcfb " + this.aLong18 + "," + local55 + "," + aBoolean87 + "," + this.aClass45Array1[0] + "," + this.aClass44_Sub1_1.method639() + "," + this.anInt327 + "," + this.anInt266 + "," + this.anInt267);
					this.aLong16 = System.currentTimeMillis();
				}
			}
			if (this.anInt350 == 2 && this.anInt327 != this.anInt272) {
				this.anInt272 = this.anInt327;
				this.method161(this.anInt327);
			}
		} catch (@Pc(136) RuntimeException local136) {
			signlink.reporterror("32372, " + arg0 + ", " + local136.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(B)I")
	private int method125(@OriginalArg(0) byte arg0) {
		try {
			@Pc(6) boolean local6 = false;
			for (@Pc(14) int local14 = 0; local14 < this.aByteArrayArray1.length; local14++) {
				if (this.aByteArrayArray1[local14] == null && this.anIntArray35[local14] != -1) {
					return -1;
				}
				if (this.aByteArrayArray2[local14] == null && this.anIntArray36[local14] != -1) {
					return -2;
				}
			}
			@Pc(50) boolean local50 = true;
			for (@Pc(52) int local52 = 0; local52 < this.aByteArrayArray1.length; local52++) {
				@Pc(59) byte[] local59 = this.aByteArrayArray2[local52];
				if (local59 != null) {
					@Pc(73) int local73 = (this.anIntArray34[local52] >> 8) * 64 - this.anInt322;
					@Pc(85) int local85 = (this.anIntArray34[local52] & 0xFF) * 64 - this.anInt323;
					local50 &= Class4.method57(local59, local85, local73);
				}
			}
			if (!local50) {
				return -3;
			} else if (this.aBoolean88) {
				return -4;
			} else {
				this.anInt350 = 2;
				Class4.anInt172 = this.anInt327;
				this.method101();
				this.aClass1_Sub1_Sub3_2.method462(214);
				return 0;
			}
		} catch (@Pc(125) RuntimeException local125) {
			signlink.reporterror("94894, " + arg0 + ", " + local125.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIIZIII)V")
	private void method126(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		try {
			if (arg2 >= 1 && arg6 >= 1 && arg2 <= 102 && arg6 <= 102) {
				if (aBoolean87 && arg5 != this.anInt327) {
					return;
				}
				@Pc(29) int local29 = 0;
				if (arg1 == 0) {
					local29 = this.aClass37_1.method549(arg5, arg2, arg6);
				}
				if (arg1 == 1) {
					local29 = this.aClass37_1.method550(arg6, arg2, arg5, this.anInt298);
				}
				if (arg1 == 2) {
					local29 = this.aClass37_1.method551(arg5, arg2, arg6);
				}
				if (arg1 == 3) {
					local29 = this.aClass37_1.method552(arg5, arg2, arg6);
				}
				@Pc(86) int local86;
				if (local29 != 0) {
					local86 = this.aClass37_1.method553(arg5, arg2, arg6, local29);
					@Pc(92) int local92 = local29 >> 14 & 0x7FFF;
					@Pc(96) int local96 = local86 & 0x1F;
					@Pc(100) int local100 = local86 >> 6;
					@Pc(112) Class9 local112;
					if (arg1 == 0) {
						this.aClass37_1.method540(arg5, arg6, arg2);
						local112 = Class9.method287(local92);
						if (local112.aBoolean120) {
							this.aClass19Array1[arg5].method422(local96, local112.aBoolean121, local100, arg6, arg2);
						}
					}
					if (arg1 == 1) {
						this.aClass37_1.method541(arg6, arg5, arg2, this.aByte7);
					}
					if (arg1 == 2) {
						this.aClass37_1.method542(arg6, arg5, arg2);
						local112 = Class9.method287(local92);
						if (arg2 + local112.anInt509 > 103 || arg6 + local112.anInt509 > 103 || arg2 + local112.anInt510 > 103 || arg6 + local112.anInt510 > 103) {
							return;
						}
						if (local112.aBoolean120) {
							this.aClass19Array1[arg5].method423(local112.anInt509, arg2, arg6, local100, local112.aBoolean121, local112.anInt510);
						}
					}
					if (arg1 == 3) {
						this.aClass37_1.method543(arg2, arg5, arg6);
						local112 = Class9.method287(local92);
						if (local112.aBoolean120 && local112.aBoolean122) {
							this.aClass19Array1[arg5].method425(arg2, arg6);
						}
					}
				}
				if (arg4 >= 0) {
					local86 = arg5;
					if (arg5 < 3 && (this.aByteArrayArrayArray7[1][arg2][arg6] & 0x2) == 2) {
						local86 = arg5 + 1;
					}
					Class4.method72(this.aClass37_1, local86, arg5, this.aBoolean77, arg4, arg3, arg0, this.aClass19Array1[arg5], this.anIntArrayArrayArray5, arg6, arg2);
					return;
				}
			}
		} catch (@Pc(261) RuntimeException local261) {
			signlink.reporterror("18744, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + false + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + local261.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(Z)V")
	private void method127() {
		try {
			this.aClass1_Sub1_Sub3_2.method462(51);
			if (this.anInt390 != -1) {
				this.anInt390 = -1;
				this.aBoolean55 = true;
				this.aBoolean80 = false;
				this.aBoolean46 = true;
			}
			if (this.anInt303 != -1) {
				this.anInt303 = -1;
				this.aBoolean73 = true;
				this.aBoolean80 = false;
			}
			this.anInt317 = -1;
		} catch (@Pc(43) RuntimeException local43) {
			signlink.reporterror("35578, " + false + ", " + local43.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "m", descriptor = "(I)Z")
	private boolean method128() {
		try {
			return signlink.wavereplay();
		} catch (@Pc(9) RuntimeException local9) {
			signlink.reporterror("65440, " + 0 + ", " + local9.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "n", descriptor = "(I)V")
	private void method129() {
		try {
			if (this.anInt212 == 0 && this.anInt381 == 0) {
				this.aStringArray6[this.anInt287] = "Walk here";
				this.anIntArray85[this.anInt287] = 718;
				this.anIntArray83[this.anInt287] = super.anInt195;
				this.anIntArray84[this.anInt287] = super.anInt196;
				this.anInt287++;
			}
			@Pc(51) int local51 = -1;
			for (@Pc(53) int local53 = 0; local53 < Class1_Sub1_Sub1_Sub5.anInt502; local53++) {
				@Pc(59) int local59 = Class1_Sub1_Sub1_Sub5.anIntArray149[local53];
				@Pc(63) int local63 = local59 & 0x7F;
				@Pc(69) int local69 = local59 >> 7 & 0x7F;
				@Pc(75) int local75 = local59 >> 29 & 0x3;
				@Pc(81) int local81 = local59 >> 14 & 0x7FFF;
				if (local59 != local51) {
					local51 = local59;
					@Pc(219) int local219;
					if (local75 == 2 && this.aClass37_1.method553(this.anInt327, local63, local69, local59) >= 0) {
						@Pc(101) Class9 local101 = Class9.method287(local81);
						if (this.anInt212 == 1) {
							this.aStringArray6[this.anInt287] = "Use " + this.aString5 + " with @cya@" + local101.aString23;
							this.anIntArray85[this.anInt287] = 810;
							this.anIntArray86[this.anInt287] = local59;
							this.anIntArray83[this.anInt287] = local63;
							this.anIntArray84[this.anInt287] = local69;
							this.anInt287++;
						} else if (this.anInt381 != 1) {
							if (local101.aStringArray8 != null) {
								for (local219 = 4; local219 >= 0; local219--) {
									if (local101.aStringArray8[local219] != null) {
										this.aStringArray6[this.anInt287] = local101.aStringArray8[local219] + " @cya@" + local101.aString23;
										if (local219 == 0) {
											this.anIntArray85[this.anInt287] = 625;
										}
										if (local219 == 1) {
											this.anIntArray85[this.anInt287] = 721;
										}
										if (local219 == 2) {
											this.anIntArray85[this.anInt287] = 743;
										}
										if (local219 == 3) {
											this.anIntArray85[this.anInt287] = 357;
										}
										if (local219 == 4) {
											this.anIntArray85[this.anInt287] = 1071;
										}
										this.anIntArray86[this.anInt287] = local59;
										this.anIntArray83[this.anInt287] = local63;
										this.anIntArray84[this.anInt287] = local69;
										this.anInt287++;
									}
								}
							}
							this.aStringArray6[this.anInt287] = "Examine @cya@" + local101.aString23;
							this.anIntArray85[this.anInt287] = 1381;
							this.anIntArray86[this.anInt287] = local59;
							this.anIntArray83[this.anInt287] = local63;
							this.anIntArray84[this.anInt287] = local69;
							this.anInt287++;
						} else if ((this.anInt383 & 0x4) == 4) {
							this.aStringArray6[this.anInt287] = this.aString17 + " @cya@" + local101.aString23;
							this.anIntArray85[this.anInt287] = 899;
							this.anIntArray86[this.anInt287] = local59;
							this.anIntArray83[this.anInt287] = local63;
							this.anIntArray84[this.anInt287] = local69;
							this.anInt287++;
						}
					}
					@Pc(396) Class1_Sub1_Sub1_Sub1_Sub2 local396;
					@Pc(444) Class1_Sub1_Sub1_Sub1_Sub1 local444;
					@Pc(434) int local434;
					if (local75 == 1) {
						@Pc(367) Class1_Sub1_Sub1_Sub1_Sub2 local367 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local81];
						if (local367.aClass13_2.aByte26 == 1 && (local367.anInt990 & 0x7F) == 64 && (local367.anInt991 & 0x7F) == 64) {
							for (local219 = 0; local219 < this.anInt416; local219++) {
								local396 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[this.anIntArray92[local219]];
								if (local396 != null && local396 != local367 && local396.aClass13_2.aByte26 == 1 && local396.anInt990 == local367.anInt990 && local396.anInt991 == local367.anInt991) {
									this.method215(local63, local69, local396.aClass13_2, this.anIntArray92[local219]);
								}
							}
							for (local434 = 0; local434 < this.anInt348; local434++) {
								local444 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[this.anIntArray76[local434]];
								if (local444 != null && local444.anInt990 == local367.anInt990 && local444.anInt991 == local367.anInt991) {
									this.method118(local63, this.anIntArray76[local434], local69, local444);
								}
							}
						}
						this.method215(local63, local69, local367.aClass13_2, local81);
					}
					if (local75 == 0) {
						@Pc(486) Class1_Sub1_Sub1_Sub1_Sub1 local486 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local81];
						if ((local486.anInt990 & 0x7F) == 64 && (local486.anInt991 & 0x7F) == 64) {
							for (local219 = 0; local219 < this.anInt416; local219++) {
								local396 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[this.anIntArray92[local219]];
								if (local396 != null && local396.aClass13_2.aByte26 == 1 && local396.anInt990 == local486.anInt990 && local396.anInt991 == local486.anInt991) {
									this.method215(local63, local69, local396.aClass13_2, this.anIntArray92[local219]);
								}
							}
							for (local434 = 0; local434 < this.anInt348; local434++) {
								local444 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[this.anIntArray76[local434]];
								if (local444 != null && local444 != local486 && local444.anInt990 == local486.anInt990 && local444.anInt991 == local486.anInt991) {
									this.method118(local63, this.anIntArray76[local434], local69, local444);
								}
							}
						}
						this.method118(local63, local81, local69, local486);
					}
					if (local75 == 3) {
						@Pc(605) Class29 local605 = this.aClass29ArrayArrayArray1[this.anInt327][local63][local69];
						if (local605 != null) {
							for (@Pc(612) Class1_Sub1_Sub1_Sub3 local612 = (Class1_Sub1_Sub1_Sub3) local605.method505(); local612 != null; local612 = (Class1_Sub1_Sub1_Sub3) local605.method507()) {
								@Pc(618) Class15 local618 = Class15.method358(local612.anInt180);
								if (this.anInt212 == 1) {
									this.aStringArray6[this.anInt287] = "Use " + this.aString5 + " with @lre@" + local618.aString25;
									this.anIntArray85[this.anInt287] = 111;
									this.anIntArray86[this.anInt287] = local612.anInt180;
									this.anIntArray83[this.anInt287] = local63;
									this.anIntArray84[this.anInt287] = local69;
									this.anInt287++;
								} else if (this.anInt381 != 1) {
									for (@Pc(735) int local735 = 4; local735 >= 0; local735--) {
										if (local618.aStringArray10 != null && local618.aStringArray10[local735] != null) {
											this.aStringArray6[this.anInt287] = local618.aStringArray10[local735] + " @lre@" + local618.aString25;
											if (local735 == 0) {
												this.anIntArray85[this.anInt287] = 139;
											}
											if (local735 == 1) {
												this.anIntArray85[this.anInt287] = 778;
											}
											if (local735 == 2) {
												this.anIntArray85[this.anInt287] = 617;
											}
											if (local735 == 3) {
												this.anIntArray85[this.anInt287] = 224;
											}
											if (local735 == 4) {
												this.anIntArray85[this.anInt287] = 662;
											}
											this.anIntArray86[this.anInt287] = local612.anInt180;
											this.anIntArray83[this.anInt287] = local63;
											this.anIntArray84[this.anInt287] = local69;
											this.anInt287++;
										} else if (local735 == 2) {
											this.aStringArray6[this.anInt287] = "Take @lre@" + local618.aString25;
											this.anIntArray85[this.anInt287] = 617;
											this.anIntArray86[this.anInt287] = local612.anInt180;
											this.anIntArray83[this.anInt287] = local63;
											this.anIntArray84[this.anInt287] = local69;
											this.anInt287++;
										}
									}
									this.aStringArray6[this.anInt287] = "Examine @lre@" + local618.aString25;
									this.anIntArray85[this.anInt287] = 1152;
									this.anIntArray86[this.anInt287] = local612.anInt180;
									this.anIntArray83[this.anInt287] = local63;
									this.anIntArray84[this.anInt287] = local69;
									this.anInt287++;
								} else if ((this.anInt383 & 0x1) == 1) {
									this.aStringArray6[this.anInt287] = this.aString17 + " @lre@" + local618.aString25;
									this.anIntArray85[this.anInt287] = 370;
									this.anIntArray86[this.anInt287] = local612.anInt180;
									this.anIntArray83[this.anInt287] = local63;
									this.anIntArray84[this.anInt287] = local69;
									this.anInt287++;
								}
							}
						}
					}
				}
			}
		} catch (@Pc(942) RuntimeException local942) {
			signlink.reporterror("22597, " + 571 + ", " + local942.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;Z)V")
	private void method130(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) boolean arg2) {
		signlink.errorname = arg0;
		try {
			if (!arg2) {
				this.aString8 = "";
				this.aString9 = "Connecting to server...";
				this.method135(true);
			}
			this.aClass8_1 = new Class8(-158, this.method154(anInt405 + 43594), this);
			@Pc(30) long local30 = Class48.method660(arg0);
			@Pc(37) int local37 = (int) (local30 >> 16 & 0x1FL);
			this.aClass1_Sub1_Sub3_2.anInt743 = 0;
			this.aClass1_Sub1_Sub3_2.method463(14);
			this.aClass1_Sub1_Sub3_2.method463(local37);
			this.aClass8_1.method250(2, this.aClass1_Sub1_Sub3_2.aByteArray9);
			for (@Pc(60) int local60 = 0; local60 < 8; local60++) {
				this.aClass8_1.method247();
			}
			@Pc(74) int local74 = this.aClass8_1.method247();
			@Pc(223) int local223;
			@Pc(257) int local257;
			if (local74 == 0) {
				this.aClass8_1.method249(this.aClass1_Sub1_Sub3_4.aByteArray9, 0, 8);
				this.aClass1_Sub1_Sub3_4.anInt743 = 0;
				this.aLong18 = this.aClass1_Sub1_Sub3_4.method479();
				@Pc(97) int[] local97 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (this.aLong18 >> 32), (int) this.aLong18 };
				this.aClass1_Sub1_Sub3_2.anInt743 = 0;
				this.aClass1_Sub1_Sub3_2.method463(10);
				this.aClass1_Sub1_Sub3_2.method467(local97[0]);
				this.aClass1_Sub1_Sub3_2.method467(local97[1]);
				this.aClass1_Sub1_Sub3_2.method467(local97[2]);
				this.aClass1_Sub1_Sub3_2.method467(local97[3]);
				this.aClass1_Sub1_Sub3_2.method467(signlink.anInt935);
				this.aClass1_Sub1_Sub3_2.method470(arg0);
				this.aClass1_Sub1_Sub3_2.method470(arg1);
				this.aClass1_Sub1_Sub3_2.method488(aBigInteger1, aBigInteger2);
				this.aClass1_Sub1_Sub3_3.anInt743 = 0;
				if (arg2) {
					this.aClass1_Sub1_Sub3_3.method463(18);
				} else {
					this.aClass1_Sub1_Sub3_3.method463(16);
				}
				this.aClass1_Sub1_Sub3_3.method463(this.aClass1_Sub1_Sub3_2.anInt743 + 36 + 1 + 1 + 2);
				this.aClass1_Sub1_Sub3_3.method463(255);
				this.aClass1_Sub1_Sub3_3.method464(274);
				this.aClass1_Sub1_Sub3_3.method463(aBoolean87 ? 1 : 0);
				for (local223 = 0; local223 < 9; local223++) {
					this.aClass1_Sub1_Sub3_3.method467(this.anIntArray42[local223]);
				}
				this.aClass1_Sub1_Sub3_3.method471(this.aClass1_Sub1_Sub3_2.aByteArray9, this.aClass1_Sub1_Sub3_2.anInt743);
				this.aClass1_Sub1_Sub3_2.aClass46_2 = new Class46(true, local97);
				for (local257 = 0; local257 < 4; local257++) {
					local97[local257] += 50;
				}
				this.aClass46_1 = new Class46(true, local97);
				this.aClass8_1.method250(this.aClass1_Sub1_Sub3_3.anInt743, this.aClass1_Sub1_Sub3_3.aByteArray9);
				local74 = this.aClass8_1.method247();
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
					this.anInt233 = this.aClass8_1.method247();
					aBoolean79 = this.aClass8_1.method247() == 1;
					this.aLong17 = 0L;
					this.anInt289 = 0;
					this.aClass11_1.anInt534 = 0;
					super.aBoolean42 = true;
					this.aBoolean57 = true;
					this.aBoolean51 = true;
					this.aClass1_Sub1_Sub3_2.anInt743 = 0;
					this.aClass1_Sub1_Sub3_4.anInt743 = 0;
					this.anInt394 = -1;
					this.anInt356 = -1;
					this.anInt357 = -1;
					this.anInt358 = -1;
					this.anInt393 = 0;
					this.anInt395 = 0;
					this.anInt208 = 0;
					this.anInt397 = 0;
					this.anInt384 = 0;
					this.anInt287 = 0;
					this.aBoolean47 = false;
					super.anInt193 = 0;
					for (local387 = 0; local387 < 100; local387++) {
						this.aStringArray4[local387] = null;
					}
					this.anInt212 = 0;
					this.anInt381 = 0;
					this.anInt350 = 0;
					this.anInt270 = 0;
					this.anInt407 = (int) (Math.random() * 100.0D) - 50;
					this.anInt223 = (int) (Math.random() * 110.0D) - 55;
					this.anInt244 = (int) (Math.random() * 80.0D) - 40;
					this.anInt391 = (int) (Math.random() * 120.0D) - 60;
					this.anInt371 = (int) (Math.random() * 30.0D) - 20;
					this.anInt386 = (int) (Math.random() * 20.0D) - 10 & 0x7FF;
					this.anInt314 = 0;
					this.anInt272 = -1;
					this.anInt309 = 0;
					this.anInt310 = 0;
					this.anInt348 = 0;
					this.anInt416 = 0;
					for (local223 = 0; local223 < this.anInt346; local223++) {
						this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local223] = null;
						this.aClass1_Sub1_Sub3Array1[local223] = null;
					}
					for (local257 = 0; local257 < 16384; local257++) {
						this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local257] = null;
					}
					aClass1_Sub1_Sub1_Sub1_Sub1_1 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[this.anInt347] = new Class1_Sub1_Sub1_Sub1_Sub1();
					this.aClass29_2.method508();
					this.aClass29_1.method508();
					@Pc(532) int local532;
					@Pc(536) int local536;
					for (@Pc(528) int local528 = 0; local528 < 4; local528++) {
						for (local532 = 0; local532 < 104; local532++) {
							for (local536 = 0; local536 < 104; local536++) {
								this.aClass29ArrayArrayArray1[local528][local532][local536] = null;
							}
						}
					}
					this.aClass29_3 = new Class29(-822);
					this.anInt345 = 0;
					this.anInt344 = 0;
					this.anInt342 = -1;
					this.anInt303 = -1;
					this.anInt317 = -1;
					this.anInt390 = -1;
					this.anInt341 = -1;
					this.aBoolean80 = false;
					this.anInt304 = 3;
					this.aBoolean72 = false;
					this.aBoolean47 = false;
					this.aBoolean90 = false;
					this.aString7 = null;
					this.anInt216 = 0;
					this.anInt373 = -1;
					this.aBoolean63 = true;
					this.method188();
					for (local532 = 0; local532 < 5; local532++) {
						this.anIntArray65[local532] = 0;
					}
					for (local536 = 0; local536 < 5; local536++) {
						this.aStringArray1[local536] = null;
						this.aBooleanArray3[local536] = false;
					}
					anInt400 = 0;
					anInt283 = 0;
					anInt363 = 0;
					anInt252 = 0;
					anInt321 = 0;
					anInt364 = 0;
					anInt380 = 0;
					anInt241 = 0;
					anInt311 = 0;
					this.method174(70);
				} else if (local74 == 3) {
					this.aString8 = "";
					this.aString9 = "Invalid username or password.";
				} else if (local74 == 4) {
					this.aString8 = "Your account has been disabled.";
					this.aString9 = "Please check your message-centre for details.";
				} else if (local74 == 5) {
					this.aString8 = "Your account is already logged in.";
					this.aString9 = "Try again in 60 secs...";
				} else if (local74 == 6) {
					this.aString8 = "RuneScape has been updated!";
					this.aString9 = "Please reload this page.";
				} else if (local74 == 7) {
					this.aString8 = "This world is full.";
					this.aString9 = "Please use a different world.";
				} else if (local74 == 8) {
					this.aString8 = "Unable to connect.";
					this.aString9 = "Login server offline.";
				} else if (local74 == 9) {
					this.aString8 = "Login limit exceeded.";
					this.aString9 = "Too many connections from your address.";
				} else if (local74 == 10) {
					this.aString8 = "Unable to connect.";
					this.aString9 = "Bad session id.";
				} else if (local74 == 11) {
					this.aString9 = "Login server rejected session.";
					this.aString9 = "Please try again.";
				} else if (local74 == 12) {
					this.aString8 = "You need a members account to login to this world.";
					this.aString9 = "Please subscribe, or use a different world.";
				} else if (local74 == 13) {
					this.aString8 = "Could not complete login.";
					this.aString9 = "Please try using a different world.";
				} else if (local74 == 14) {
					this.aString8 = "The server is being updated.";
					this.aString9 = "Please wait 1 minute and try again.";
				} else if (local74 == 15) {
					this.aBoolean51 = true;
					this.aClass1_Sub1_Sub3_2.anInt743 = 0;
					this.aClass1_Sub1_Sub3_4.anInt743 = 0;
					this.anInt394 = -1;
					this.anInt356 = -1;
					this.anInt357 = -1;
					this.anInt358 = -1;
					this.anInt393 = 0;
					this.anInt395 = 0;
					this.anInt208 = 0;
					this.anInt287 = 0;
					this.aBoolean47 = false;
					this.aLong16 = System.currentTimeMillis();
				} else if (local74 == 16) {
					this.aString8 = "Login attempts exceeded.";
					this.aString9 = "Please wait 1 minute and try again.";
				} else if (local74 == 17) {
					this.aString8 = "You are standing in a members-only area.";
					this.aString9 = "To play on this world move to a free area first";
				} else if (local74 == 20) {
					this.aString8 = "Invalid loginserver requested";
					this.aString9 = "Please try using a different world.";
				} else if (local74 == 21) {
					for (local387 = this.aClass8_1.method247(); local387 >= 0; local387--) {
						this.aString8 = "You have only just left another world";
						this.aString9 = "Your profile will be transferred in: " + local387 + " seconds";
						this.method135(true);
						try {
							Thread.sleep(1000L);
						} catch (@Pc(897) Exception local897) {
						}
					}
					this.method130(arg0, arg1, arg2);
				} else if (local74 == -1) {
					this.aString8 = "No response from server";
					this.aString9 = "Please try using a different world.";
				} else {
					System.out.println("response:" + local74);
					this.aString8 = "Unexpected server response";
					this.aString9 = "Please try using a different world.";
				}
			}
		} catch (@Pc(933) IOException local933) {
			this.aString8 = "";
			this.aString9 = "Error connecting to server.";
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IILjava/lang/String;Ljava/lang/String;)V")
	private void method131(@OriginalArg(1) int arg0, @OriginalArg(2) String arg1, @OriginalArg(3) String arg2) {
		try {
			if (arg0 == 0 && this.anInt342 != -1) {
				this.aString7 = arg2;
				super.anInt200 = 0;
			}
			if (this.anInt303 == -1) {
				this.aBoolean73 = true;
			}
			for (@Pc(20) int local20 = 99; local20 > 0; local20--) {
				this.anIntArray49[local20] = this.anIntArray49[local20 - 1];
				this.aStringArray3[local20] = this.aStringArray3[local20 - 1];
				this.aStringArray4[local20] = this.aStringArray4[local20 - 1];
			}
			this.anIntArray49[0] = arg0;
			this.aStringArray3[0] = arg1;
			this.aStringArray4[0] = arg2;
		} catch (@Pc(78) RuntimeException local78) {
			signlink.reporterror("59199, " + -476 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local78.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(IIII)I")
	private int method132(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		try {
			@Pc(3) int local3 = arg0 >> 7;
			@Pc(7) int local7 = arg1 >> 7;
			if (local3 < 0 || local7 < 0 || local3 > 103 || local7 > 103) {
				return 0;
			}
			@Pc(21) int local21 = arg2;
			if (arg2 < 3 && (this.aByteArrayArrayArray7[1][local3][local7] & 0x2) == 2) {
				local21 = arg2 + 1;
			}
			@Pc(46) int local46 = arg0 & 0x7F;
			@Pc(50) int local50 = arg1 & 0x7F;
			@Pc(78) int local78 = this.anIntArrayArrayArray5[local21][local3][local7] * (128 - local46) + this.anIntArrayArrayArray5[local21][local3 + 1][local7] * local46 >> 7;
			@Pc(110) int local110 = this.anIntArrayArrayArray5[local21][local3][local7 + 1] * (128 - local46) + this.anIntArrayArrayArray5[local21][local3 + 1][local7 + 1] * local46 >> 7;
			return local78 * (128 - local50) + local110 * local50 >> 7;
		} catch (@Pc(123) RuntimeException local123) {
			signlink.reporterror("8082, " + arg0 + ", " + arg1 + ", " + 0 + ", " + arg2 + ", " + local123.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIII)Z")
	private boolean method133(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		try {
			@Pc(7) int local7 = arg3 >> 14 & 0x7FFF;
			@Pc(26) int local26 = this.aClass37_1.method553(this.anInt327, arg1, arg0, arg3);
			if (local26 == -1) {
				return false;
			}
			@Pc(35) int local35 = local26 & 0x1F;
			@Pc(41) int local41 = local26 >> 6 & 0x3;
			anInt353++;
			if (anInt353 > 1086) {
				anInt353 = 0;
				this.aClass1_Sub1_Sub3_2.method462(149);
				this.aClass1_Sub1_Sub3_2.method463(0);
				@Pc(63) int local63 = this.aClass1_Sub1_Sub3_2.anInt743;
				if ((int) (Math.random() * 2.0D) == 0) {
					this.aClass1_Sub1_Sub3_2.method464(16791);
				}
				this.aClass1_Sub1_Sub3_2.method463(254);
				this.aClass1_Sub1_Sub3_2.method464((int) (Math.random() * 65536.0D));
				this.aClass1_Sub1_Sub3_2.method464(16128);
				this.aClass1_Sub1_Sub3_2.method464(52610);
				this.aClass1_Sub1_Sub3_2.method464((int) (Math.random() * 65536.0D));
				this.aClass1_Sub1_Sub3_2.method464(55420);
				if ((int) (Math.random() * 2.0D) == 0) {
					this.aClass1_Sub1_Sub3_2.method464(35025);
				}
				this.aClass1_Sub1_Sub3_2.method464(46628);
				this.aClass1_Sub1_Sub3_2.method463((int) (Math.random() * 256.0D));
				this.aClass1_Sub1_Sub3_2.method472(this.aClass1_Sub1_Sub3_2.anInt743 - local63, this.anInt205);
			}
			if (local35 == 10 || local35 == 11 || local35 == 22) {
				@Pc(144) Class9 local144 = Class9.method287(local7);
				@Pc(152) int local152;
				@Pc(155) int local155;
				if (local41 == 0 || local41 == 2) {
					local152 = local144.anInt509;
					local155 = local144.anInt510;
				} else {
					local152 = local144.anInt510;
					local155 = local144.anInt509;
				}
				@Pc(166) int local166 = local144.anInt521;
				if (local41 != 0) {
					local166 = (local166 << local41 & 0xF) + (local166 >> 4 - local41);
				}
				this.method121(aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray270[0], arg1, local152, local155, local166, aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray269[0], 0, false, 0, arg0, (byte) 9, 2);
			} else {
				this.method121(aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray270[0], arg1, 0, 0, 0, aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray269[0], local35 + 1, false, local41, arg0, (byte) 9, 2);
			}
			this.anInt359 = super.anInt201;
			this.anInt360 = super.anInt202;
			this.anInt362 = 2;
			this.anInt361 = 0;
			this.aClass1_Sub1_Sub3_2.method462(arg2);
			this.aClass1_Sub1_Sub3_2.method464(arg1 + this.anInt322);
			this.aClass1_Sub1_Sub3_2.method464(arg0 + this.anInt323);
			this.aClass1_Sub1_Sub3_2.method464(local7);
			return true;
		} catch (@Pc(266) RuntimeException local266) {
			signlink.reporterror("25232, " + arg0 + ", " + 74 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local266.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(II)V")
	private void method134(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(9) Class29 local9 = this.aClass29ArrayArrayArray1[this.anInt327][arg0][arg1];
		if (local9 == null) {
			this.aClass37_1.method544(this.anInt327, arg0, arg1);
			return;
		}
		@Pc(21) int local21 = -99999999;
		@Pc(23) Class1_Sub1_Sub1_Sub3 local23 = null;
		@Pc(27) Class1_Sub1_Sub1_Sub3 local27;
		for (local27 = (Class1_Sub1_Sub1_Sub3) local9.method504(); local27 != null; local27 = (Class1_Sub1_Sub1_Sub3) local9.method506(this.aByte9)) {
			@Pc(32) Class15 local32 = Class15.method358(local27.anInt180);
			@Pc(35) int local35 = local32.anInt607;
			if (local32.aBoolean152) {
				local35 *= local27.anInt181 + 1;
			}
			if (local35 > local21) {
				local21 = local35;
				local23 = local27;
			}
		}
		local9.method502(local23);
		@Pc(66) Class1_Sub1_Sub1_Sub3 local66 = null;
		@Pc(68) Class1_Sub1_Sub1_Sub3 local68 = null;
		for (local27 = (Class1_Sub1_Sub1_Sub3) local9.method504(); local27 != null; local27 = (Class1_Sub1_Sub1_Sub3) local9.method506(this.aByte9)) {
			if (local27.anInt180 != local23.anInt180 && local66 == null) {
				local66 = local27;
			}
			if (local27.anInt180 != local23.anInt180 && local27.anInt180 != local66.anInt180 && local68 == null) {
				local68 = local27;
			}
		}
		@Pc(112) int local112 = arg0 + (arg1 << 7) + 1610612736;
		this.aClass37_1.method530(arg1, local112, this.anInt327, local66, local23, (byte) 5, arg0, this.method132(arg0 * 128 + 64, arg1 * 128 + 64, this.anInt327), local68);
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(ZZ)V")
	private void method135(@OriginalArg(0) boolean arg0) {
		try {
			this.method98(this.anInt228);
			this.aClass35_21.method517(aBoolean59);
			this.aClass1_Sub1_Sub2_Sub3_19.method415(this.aByte14, 0, 0);
			@Pc(56) byte local56;
			@Pc(68) int local68;
			if (this.anInt299 == 0) {
				this.aClass1_Sub1_Sub2_Sub4_1.method444(180, 180, this.aClass44_Sub1_1.aString30, 7711145, true);
				local56 = 80;
				this.aClass1_Sub1_Sub2_Sub4_3.method444(180, 80, "Welcome to RuneScape", 16776960, true);
				local68 = local56 + 30;
				this.aClass1_Sub1_Sub2_Sub3_20.method415(this.aByte14, 27, 100);
				this.aClass1_Sub1_Sub2_Sub4_3.method444(100, 125, "New User", 16777215, true);
				this.aClass1_Sub1_Sub2_Sub3_20.method415(this.aByte14, 187, 100);
				this.aClass1_Sub1_Sub2_Sub4_3.method444(260, 125, "Existing User", 16777215, true);
			}
			if (this.anInt299 == 2) {
				local56 = 60;
				if (this.aString8.length() > 0) {
					this.aClass1_Sub1_Sub2_Sub4_3.method444(180, 45, this.aString8, 16776960, true);
					this.aClass1_Sub1_Sub2_Sub4_3.method444(180, 60, this.aString9, 16776960, true);
					local68 = local56 + 30;
				} else {
					this.aClass1_Sub1_Sub2_Sub4_3.method444(180, 53, this.aString9, 16776960, true);
					local68 = local56 + 30;
				}
				this.aClass1_Sub1_Sub2_Sub4_3.method448("Username: " + this.aString14 + (this.anInt277 == 0 & anInt207 % 40 < 20 ? "@yel@|" : ""), this.anInt315, true, 90, 90, 16777215);
				local68 += 15;
				this.aClass1_Sub1_Sub2_Sub4_3.method448("Password: " + Class48.method666(this.aString15) + (this.anInt277 == 1 & anInt207 % 40 < 20 ? "@yel@|" : ""), this.anInt315, true, 105, 92, 16777215);
				local68 += 15;
				if (!arg0) {
					this.aClass1_Sub1_Sub2_Sub3_20.method415(this.aByte14, 27, 130);
					this.aClass1_Sub1_Sub2_Sub4_3.method444(100, 155, "Login", 16777215, true);
					this.aClass1_Sub1_Sub2_Sub3_20.method415(this.aByte14, 187, 130);
					this.aClass1_Sub1_Sub2_Sub4_3.method444(260, 155, "Cancel", 16777215, true);
				}
			}
			if (this.anInt299 == 3) {
				this.aClass1_Sub1_Sub2_Sub4_3.method444(180, 40, "Create a free account", 16776960, true);
				local56 = 65;
				this.aClass1_Sub1_Sub2_Sub4_3.method444(180, 65, "To create a new account you need to", 16777215, true);
				local68 = local56 + 15;
				this.aClass1_Sub1_Sub2_Sub4_3.method444(180, 80, "go back to the main RuneScape webpage", 16777215, true);
				local68 += 15;
				this.aClass1_Sub1_Sub2_Sub4_3.method444(180, 95, "and choose the red 'create account'", 16777215, true);
				local68 += 15;
				this.aClass1_Sub1_Sub2_Sub4_3.method444(180, 110, "button at the top right of that page.", 16777215, true);
				local68 += 15;
				this.aClass1_Sub1_Sub2_Sub3_20.method415(this.aByte14, 107, 130);
				this.aClass1_Sub1_Sub2_Sub4_3.method444(180, 155, "Cancel", 16777215, true);
			}
			this.aClass35_21.method518(202, super.aGraphics2, 171);
			if (this.aBoolean53) {
				this.aBoolean53 = false;
				this.aClass35_19.method518(128, super.aGraphics2, 0);
				this.aClass35_20.method518(202, super.aGraphics2, 371);
				this.aClass35_24.method518(0, super.aGraphics2, 265);
				this.aClass35_25.method518(562, super.aGraphics2, 265);
				this.aClass35_26.method518(128, super.aGraphics2, 171);
				this.aClass35_27.method518(562, super.aGraphics2, 171);
			}
		} catch (@Pc(508) RuntimeException local508) {
			signlink.reporterror("60455, " + arg0 + ", " + false + ", " + local508.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(Z)V")
	private void method137(@OriginalArg(0) boolean arg0) {
		try {
			for (@Pc(6) Class1_Sub1_Sub1_Sub4 local6 = (Class1_Sub1_Sub1_Sub4) this.aClass29_2.method504(); local6 != null; local6 = (Class1_Sub1_Sub1_Sub4) this.aClass29_2.method506(this.aByte9)) {
				if (local6.anInt453 != this.anInt327 || anInt207 > local6.anInt459) {
					local6.method667();
				} else if (anInt207 >= local6.anInt458) {
					if (local6.anInt462 > 0) {
						@Pc(36) Class1_Sub1_Sub1_Sub1_Sub2 local36 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local6.anInt462 - 1];
						if (local36 != null && local36.anInt990 >= 0 && local36.anInt990 < 13312 && local36.anInt991 >= 0 && local36.anInt991 < 13312) {
							local6.method240(anInt207, this.method132(local36.anInt990, local36.anInt991, local6.anInt453) - local6.anInt457, local36.anInt990, local36.anInt991);
						}
					}
					if (local6.anInt462 < 0) {
						@Pc(81) int local81 = -local6.anInt462 - 1;
						@Pc(87) Class1_Sub1_Sub1_Sub1_Sub1 local87;
						if (local81 == this.anInt276) {
							local87 = aClass1_Sub1_Sub1_Sub1_Sub1_1;
						} else {
							local87 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local81];
						}
						if (local87 != null && local87.anInt990 >= 0 && local87.anInt990 < 13312 && local87.anInt991 >= 0 && local87.anInt991 < 13312) {
							local6.method240(anInt207, this.method132(local87.anInt990, local87.anInt991, local6.anInt453) - local6.anInt457, local87.anInt990, local87.anInt991);
						}
					}
					local6.method241(this.anInt286);
					this.aClass37_1.method534((int) local6.aDouble3, local6, (int) local6.aDouble1, -1, (int) local6.aDouble2, (byte) 1, 60, local6.anInt463, this.anInt327, false);
				}
			}
			anInt295++;
			this.aBoolean51 &= arg0;
			if (anInt295 > 1174) {
				anInt295 = 0;
				this.aClass1_Sub1_Sub3_2.method462(12);
				this.aClass1_Sub1_Sub3_2.method463(0);
				@Pc(194) int local194 = this.aClass1_Sub1_Sub3_2.anInt743;
				if ((int) (Math.random() * 2.0D) == 0) {
					this.aClass1_Sub1_Sub3_2.method464(11499);
				}
				this.aClass1_Sub1_Sub3_2.method464(10548);
				if ((int) (Math.random() * 2.0D) == 0) {
					this.aClass1_Sub1_Sub3_2.method463(139);
				}
				if ((int) (Math.random() * 2.0D) == 0) {
					this.aClass1_Sub1_Sub3_2.method463(94);
				}
				this.aClass1_Sub1_Sub3_2.method464(51693);
				this.aClass1_Sub1_Sub3_2.method463(16);
				this.aClass1_Sub1_Sub3_2.method464(15036);
				if ((int) (Math.random() * 2.0D) == 0) {
					this.aClass1_Sub1_Sub3_2.method463(65);
				}
				this.aClass1_Sub1_Sub3_2.method463((int) (Math.random() * 256.0D));
				this.aClass1_Sub1_Sub3_2.method464(22990);
				this.aClass1_Sub1_Sub3_2.method472(this.aClass1_Sub1_Sub3_2.anInt743 - local194, this.anInt205);
			}
		} catch (@Pc(269) RuntimeException local269) {
			signlink.reporterror("74936, " + arg0 + ", " + local269.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIBII)V")
	private void method138(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		try {
			this.aClass1_Sub1_Sub2_Sub3_6.method415(this.aByte14, arg3, arg1);
			this.aClass1_Sub1_Sub2_Sub3_7.method415(this.aByte14, arg3, arg1 + arg4 - 16);
			Class1_Sub1_Sub2.method436(arg4 - 32, this.anInt365, 16, arg3, arg1 + 16);
			@Pc(37) int local37 = (arg4 - 32) * arg4 / arg2;
			if (local37 < 8) {
				local37 = 8;
			}
			@Pc(54) int local54 = (arg4 - local37 - 32) * arg0 / (arg2 - arg4);
			Class1_Sub1_Sub2.method436(local37, this.anInt301, 16, arg3, arg1 + local54 + 16);
			Class1_Sub1_Sub2.method441(this.anInt375, local37, arg3, 384, arg1 + local54 + 16);
			Class1_Sub1_Sub2.method441(this.anInt375, local37, arg3 + 1, 384, arg1 + local54 + 16);
			Class1_Sub1_Sub2.method439(16, this.anInt375, arg3, arg1 + local54 + 16);
			Class1_Sub1_Sub2.method439(16, this.anInt375, arg3, arg1 + local54 + 17);
			Class1_Sub1_Sub2.method441(this.anInt222, local37, arg3 + 15, 384, arg1 + local54 + 16);
			Class1_Sub1_Sub2.method441(this.anInt222, local37 - 1, arg3 + 14, 384, arg1 + local54 + 17);
			Class1_Sub1_Sub2.method439(16, this.anInt222, arg3, arg1 + local54 + local37 + 15);
			Class1_Sub1_Sub2.method439(15, this.anInt222, arg3 + 1, arg1 + 14 + local54 + local37);
		} catch (@Pc(177) RuntimeException local177) {
			signlink.reporterror("21935, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 123 + ", " + arg3 + ", " + arg4 + ", " + local177.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(II)V")
	private void method139(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(5) boolean local5 = false;
			if (!aBoolean87) {
				@Pc(16) Class1_Sub1_Sub2_Sub3 local16;
				@Pc(24) int local24;
				@Pc(32) int local32;
				@Pc(35) byte[] local35;
				@Pc(38) byte[] local38;
				@Pc(40) int local40;
				if (Class1_Sub1_Sub2_Sub1.anIntArray179[17] >= arg0) {
					local16 = Class1_Sub1_Sub2_Sub1.aClass1_Sub1_Sub2_Sub3Array5[17];
					local24 = local16.anInt674 * local16.anInt675 - 1;
					local32 = local16.anInt674 * this.anInt286 * 2;
					local35 = local16.aByteArray7;
					local38 = this.aByteArray2;
					for (local40 = 0; local40 <= local24; local40++) {
						local38[local40] = local35[local40 - local32 & local24];
					}
					local16.aByteArray7 = local38;
					this.aByteArray2 = local35;
					Class1_Sub1_Sub2_Sub1.method346(17);
				}
				if (Class1_Sub1_Sub2_Sub1.anIntArray179[24] >= arg0) {
					local16 = Class1_Sub1_Sub2_Sub1.aClass1_Sub1_Sub2_Sub3Array5[24];
					local24 = local16.anInt674 * local16.anInt675 - 1;
					local32 = local16.anInt674 * this.anInt286 * 2;
					local35 = local16.aByteArray7;
					local38 = this.aByteArray2;
					for (local40 = 0; local40 <= local24; local40++) {
						local38[local40] = local35[local40 - local32 & local24];
					}
					local16.aByteArray7 = local38;
					this.aByteArray2 = local35;
					Class1_Sub1_Sub2_Sub1.method346(24);
					return;
				}
			}
		} catch (@Pc(125) RuntimeException local125) {
			signlink.reporterror("16924, " + arg0 + ", " + arg1 + ", " + local125.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "o", descriptor = "(I)V")
	private void method140() {
		try {
			if (super.anInt200 == 1) {
				if (super.anInt201 >= 539 && super.anInt201 <= 573 && super.anInt202 >= 169 && super.anInt202 < 205 && this.anIntArray50[0] != -1) {
					this.aBoolean55 = true;
					this.anInt304 = 0;
					this.aBoolean46 = true;
				}
				if (super.anInt201 >= 569 && super.anInt201 <= 599 && super.anInt202 >= 168 && super.anInt202 < 205 && this.anIntArray50[1] != -1) {
					this.aBoolean55 = true;
					this.anInt304 = 1;
					this.aBoolean46 = true;
				}
				if (super.anInt201 >= 597 && super.anInt201 <= 627 && super.anInt202 >= 168 && super.anInt202 < 205 && this.anIntArray50[2] != -1) {
					this.aBoolean55 = true;
					this.anInt304 = 2;
					this.aBoolean46 = true;
				}
				if (super.anInt201 >= 625 && super.anInt201 <= 669 && super.anInt202 >= 168 && super.anInt202 < 203 && this.anIntArray50[3] != -1) {
					this.aBoolean55 = true;
					this.anInt304 = 3;
					this.aBoolean46 = true;
				}
				if (super.anInt201 >= 666 && super.anInt201 <= 696 && super.anInt202 >= 168 && super.anInt202 < 205 && this.anIntArray50[4] != -1) {
					this.aBoolean55 = true;
					this.anInt304 = 4;
					this.aBoolean46 = true;
				}
				if (super.anInt201 >= 694 && super.anInt201 <= 724 && super.anInt202 >= 168 && super.anInt202 < 205 && this.anIntArray50[5] != -1) {
					this.aBoolean55 = true;
					this.anInt304 = 5;
					this.aBoolean46 = true;
				}
				if (super.anInt201 >= 722 && super.anInt201 <= 756 && super.anInt202 >= 169 && super.anInt202 < 205 && this.anIntArray50[6] != -1) {
					this.aBoolean55 = true;
					this.anInt304 = 6;
					this.aBoolean46 = true;
				}
				if (super.anInt201 >= 540 && super.anInt201 <= 574 && super.anInt202 >= 466 && super.anInt202 < 502 && this.anIntArray50[7] != -1) {
					this.aBoolean55 = true;
					this.anInt304 = 7;
					this.aBoolean46 = true;
				}
				if (super.anInt201 >= 572 && super.anInt201 <= 602 && super.anInt202 >= 466 && super.anInt202 < 503 && this.anIntArray50[8] != -1) {
					this.aBoolean55 = true;
					this.anInt304 = 8;
					this.aBoolean46 = true;
				}
				if (super.anInt201 >= 599 && super.anInt201 <= 629 && super.anInt202 >= 466 && super.anInt202 < 503 && this.anIntArray50[9] != -1) {
					this.aBoolean55 = true;
					this.anInt304 = 9;
					this.aBoolean46 = true;
				}
				if (super.anInt201 >= 627 && super.anInt201 <= 671 && super.anInt202 >= 467 && super.anInt202 < 502 && this.anIntArray50[10] != -1) {
					this.aBoolean55 = true;
					this.anInt304 = 10;
					this.aBoolean46 = true;
				}
				if (super.anInt201 >= 669 && super.anInt201 <= 699 && super.anInt202 >= 466 && super.anInt202 < 503 && this.anIntArray50[11] != -1) {
					this.aBoolean55 = true;
					this.anInt304 = 11;
					this.aBoolean46 = true;
				}
				if (super.anInt201 >= 696 && super.anInt201 <= 726 && super.anInt202 >= 466 && super.anInt202 < 503 && this.anIntArray50[12] != -1) {
					this.aBoolean55 = true;
					this.anInt304 = 12;
					this.aBoolean46 = true;
				}
				if (super.anInt201 >= 724 && super.anInt201 <= 758 && super.anInt202 >= 466 && super.anInt202 < 502 && this.anIntArray50[13] != -1) {
					this.aBoolean55 = true;
					this.anInt304 = 13;
					this.aBoolean46 = true;
					return;
				}
			}
		} catch (@Pc(449) RuntimeException local449) {
			signlink.reporterror("29478, " + 25675 + ", " + local449.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "p", descriptor = "(I)V")
	private void method141() {
		try {
			@Pc(7) byte[] local7 = this.aClass47_1.method659("title.dat", null);
			@Pc(13) Class1_Sub1_Sub2_Sub2 local13 = new Class1_Sub1_Sub2_Sub2(local7, this);
			this.aClass35_22.method517(aBoolean59);
			local13.method386(0, 0);
			this.aClass35_23.method517(aBoolean59);
			local13.method386(0, -637);
			this.aClass35_19.method517(aBoolean59);
			local13.method386(0, -128);
			this.aClass35_20.method517(aBoolean59);
			local13.method386(-371, -202);
			this.aClass35_21.method517(aBoolean59);
			local13.method386(-171, -202);
			this.aClass35_24.method517(aBoolean59);
			local13.method386(-265, 0);
			this.aClass35_25.method517(aBoolean59);
			local13.method386(-265, -562);
			this.aClass35_26.method517(aBoolean59);
			local13.method386(-171, -128);
			this.aClass35_27.method517(aBoolean59);
			local13.method386(-171, -562);
			@Pc(98) int[] local98 = new int[local13.anInt647];
			for (@Pc(100) int local100 = 0; local100 < local13.anInt648; local100++) {
				for (@Pc(104) int local104 = 0; local104 < local13.anInt647; local104++) {
					local98[local104] = local13.anIntArray205[local13.anInt647 + local13.anInt647 * local100 - local104 - 1];
				}
				for (@Pc(130) int local130 = 0; local130 < local13.anInt647; local130++) {
					local13.anIntArray205[local130 + local13.anInt647 * local100] = local98[local130];
				}
			}
			this.aClass35_22.method517(aBoolean59);
			local13.method386(0, 382);
			this.aClass35_23.method517(aBoolean59);
			local13.method386(0, -255);
			this.aClass35_19.method517(aBoolean59);
			local13.method386(0, 254);
			this.aClass35_20.method517(aBoolean59);
			local13.method386(-371, 180);
			this.aClass35_21.method517(aBoolean59);
			local13.method386(-171, 180);
			this.aClass35_24.method517(aBoolean59);
			local13.method386(-265, 382);
			this.aClass35_25.method517(aBoolean59);
			local13.method386(-265, -180);
			this.aClass35_26.method517(aBoolean59);
			this.anInt393 += 0;
			local13.method386(-171, 254);
			this.aClass35_27.method517(aBoolean59);
			local13.method386(-171, -180);
			local13 = new Class1_Sub1_Sub2_Sub2(this.aClass47_1, "logo", 0);
			this.aClass35_19.method517(aBoolean59);
			local13.method388(this.aByte14, 382 - local13.anInt647 / 2 - 128, 18);
			System.gc();
		} catch (@Pc(275) RuntimeException local275) {
			signlink.reporterror("85918, " + 0 + ", " + local275.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(BI)V")
	private void method142(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1) {
		try {
			if (arg1 >= 0) {
				if (this.aBoolean72) {
					this.aBoolean72 = false;
					this.aBoolean73 = true;
				}
				@Pc(18) int local18 = this.anIntArray83[arg1];
				@Pc(23) int local23 = this.anIntArray84[arg1];
				@Pc(28) int local28 = this.anIntArray85[arg1];
				@Pc(33) int local33 = this.anIntArray86[arg1];
				if (this.aByte15 == 6) {
					@Pc(39) boolean local39 = false;
				} else {
					this.anInt343 = -128;
				}
				if (local28 >= 2000) {
					local28 -= 2000;
				}
				@Pc(56) Class1_Sub1_Sub1_Sub1_Sub2 local56;
				if (local28 == 829) {
					local56 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local33];
					if (local56 != null) {
						this.method121(aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray270[0], local56.anIntArray269[0], 1, 1, 0, aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray269[0], 0, false, 0, local56.anIntArray270[0], (byte) 9, 2);
						this.anInt359 = super.anInt201;
						this.anInt360 = super.anInt202;
						this.anInt362 = 2;
						this.anInt361 = 0;
						this.aClass1_Sub1_Sub3_2.method462(150);
						this.aClass1_Sub1_Sub3_2.method464(local33);
						this.aClass1_Sub1_Sub3_2.method464(this.anInt215);
						this.aClass1_Sub1_Sub3_2.method464(this.anInt213);
						this.aClass1_Sub1_Sub3_2.method464(this.anInt214);
					}
				}
				@Pc(135) int local135;
				@Pc(131) String local131;
				if (local28 == 524) {
					local131 = this.aStringArray6[arg1];
					local135 = local131.indexOf("@whi@");
					if (local135 != -1) {
						this.method127();
						this.aString10 = local131.substring(local135 + 5).trim();
						this.aBoolean74 = false;
						for (@Pc(154) int local154 = 0; local154 < Class6.aClass6Array1.length; local154++) {
							if (Class6.aClass6Array1[local154] != null && Class6.aClass6Array1[local154].anInt424 == 600) {
								this.anInt334 = this.anInt317 = Class6.aClass6Array1[local154].anInt421;
								break;
							}
						}
					}
				}
				@Pc(190) Class1_Sub1_Sub1_Sub1_Sub1 local190;
				if (local28 == 275) {
					local190 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local33];
					if (local190 != null) {
						this.method121(aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray270[0], local190.anIntArray269[0], 1, 1, 0, aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray269[0], 0, false, 0, local190.anIntArray270[0], (byte) 9, 2);
						this.anInt359 = super.anInt201;
						this.anInt360 = super.anInt202;
						this.anInt362 = 2;
						this.anInt361 = 0;
						this.aClass1_Sub1_Sub3_2.method462(36);
						this.aClass1_Sub1_Sub3_2.method464(local33);
						this.aClass1_Sub1_Sub3_2.method464(this.anInt215);
						this.aClass1_Sub1_Sub3_2.method464(this.anInt213);
						this.aClass1_Sub1_Sub3_2.method464(this.anInt214);
					}
				}
				if (local28 == 743) {
					anInt283++;
					if (anInt283 >= 124) {
						this.aClass1_Sub1_Sub3_2.method462(201);
						this.aClass1_Sub1_Sub3_2.method464(37954);
					}
					this.method133(local23, local18, 187, local33);
				}
				if (local28 == 718) {
					if (this.aBoolean47) {
						this.aClass37_1.method561(local18 - 4, local23 - 4, this.aByte13);
					} else {
						this.aClass37_1.method561(super.anInt201 - 4, super.anInt202 - 4, this.aByte13);
					}
				}
				if (local28 == 721) {
					anInt400 += local23;
					if (anInt400 >= 139) {
						this.aClass1_Sub1_Sub3_2.method462(219);
						this.aClass1_Sub1_Sub3_2.method467(0);
					}
					this.method133(local23, local18, 103, local33);
				}
				@Pc(375) long local375;
				if (local28 == 605 || local28 == 47 || local28 == 513 || local28 == 884) {
					local131 = this.aStringArray6[arg1];
					local135 = local131.indexOf("@whi@");
					if (local135 != -1) {
						local375 = Class48.method660(local131.substring(local135 + 5).trim());
						if (local28 == 605) {
							this.method184(199, local375);
						}
						if (local28 == 47) {
							this.method178(local375);
						}
						if (local28 == 513) {
							this.method144(local375);
						}
						if (local28 == 884) {
							this.method205(this.aBoolean61, local375);
						}
					}
				}
				if (local28 == 563) {
					this.aClass1_Sub1_Sub3_2.method462(135);
					this.aClass1_Sub1_Sub3_2.method464(local33);
					this.aClass1_Sub1_Sub3_2.method464(local18);
					this.aClass1_Sub1_Sub3_2.method464(local23);
					this.aClass1_Sub1_Sub3_2.method464(this.anInt382);
					this.anInt229 = 0;
					this.anInt230 = local23;
					this.anInt231 = local18;
					this.anInt232 = 2;
					if (Class6.aClass6Array1[local23].anInt421 == this.anInt317) {
						this.anInt232 = 1;
					}
					if (Class6.aClass6Array1[local23].anInt421 == this.anInt303) {
						this.anInt232 = 3;
					}
				}
				@Pc(477) Class6 local477;
				if (local28 == 435) {
					this.aClass1_Sub1_Sub3_2.method462(9);
					this.aClass1_Sub1_Sub3_2.method464(local23);
					local477 = Class6.aClass6Array1[local23];
					if (local477.anIntArrayArray7 != null && local477.anIntArrayArray7[0][0] == 5) {
						local135 = local477.anIntArrayArray7[0][1];
						this.anIntArray73[local135] = 1 - this.anIntArray73[local135];
						this.method122(local135);
						this.aBoolean55 = true;
					}
				}
				if (local28 == 810 && this.method133(local23, local18, 60, local33)) {
					this.aClass1_Sub1_Sub3_2.method464(this.anInt215);
					this.aClass1_Sub1_Sub3_2.method464(this.anInt213);
					this.aClass1_Sub1_Sub3_2.method464(this.anInt214);
				}
				if (local28 == 102) {
					this.anInt212 = 1;
					this.anInt213 = local18;
					this.anInt214 = local23;
					this.anInt215 = local33;
					this.aString5 = Class15.method358(local33).aString25;
					this.anInt381 = 0;
					this.aBoolean55 = true;
				} else {
					@Pc(571) Class15 local571;
					@Pc(598) String local598;
					if (local28 == 1328) {
						local571 = Class15.method358(local33);
						@Pc(575) Class6 local575 = Class6.aClass6Array1[local23];
						if (local575 != null && local575.anIntArray94[local18] >= 100000) {
							local598 = local575.anIntArray94[local18] + " x " + local571.aString25;
						} else if (local571.aByteArray6 == null) {
							local598 = "It's a " + local571.aString25 + ".";
						} else {
							local598 = new String(local571.aByteArray6);
						}
						this.method131(0, "", local598);
					}
					if (local28 == 639 || local28 == 499 || local28 == 27 || local28 == 387 || local28 == 185) {
						local190 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local33];
						if (local190 != null) {
							this.method121(aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray270[0], local190.anIntArray269[0], 1, 1, 0, aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray269[0], 0, false, 0, local190.anIntArray270[0], (byte) 9, 2);
							this.anInt359 = super.anInt201;
							this.anInt360 = super.anInt202;
							this.anInt362 = 2;
							this.anInt361 = 0;
							if (local28 == 387) {
								anInt321 += local33;
								if (anInt321 >= 66) {
									this.aClass1_Sub1_Sub3_2.method462(235);
									this.aClass1_Sub1_Sub3_2.method463(154);
								}
								this.aClass1_Sub1_Sub3_2.method462(98);
							}
							if (local28 == 185) {
								this.aClass1_Sub1_Sub3_2.method462(174);
							}
							if (local28 == 639) {
								anInt252++;
								if (anInt252 >= 52) {
									this.aClass1_Sub1_Sub3_2.method462(80);
									this.aClass1_Sub1_Sub3_2.method463(131);
								}
								this.aClass1_Sub1_Sub3_2.method462(109);
							}
							if (local28 == 27) {
								this.aClass1_Sub1_Sub3_2.method462(196);
							}
							if (local28 == 499) {
								this.aClass1_Sub1_Sub3_2.method462(166);
							}
							this.aClass1_Sub1_Sub3_2.method464(local33);
						}
					}
					if (local28 == 242 || local28 == 209 || local28 == 309 || local28 == 852 || local28 == 793) {
						local56 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local33];
						if (local56 != null) {
							this.method121(aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray270[0], local56.anIntArray269[0], 1, 1, 0, aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray269[0], 0, false, 0, local56.anIntArray270[0], (byte) 9, 2);
							this.anInt359 = super.anInt201;
							this.anInt360 = super.anInt202;
							this.anInt362 = 2;
							this.anInt361 = 0;
							if (local28 == 309) {
								this.aClass1_Sub1_Sub3_2.method462(223);
							}
							if (local28 == 242) {
								this.aClass1_Sub1_Sub3_2.method462(236);
							}
							if (local28 == 852) {
								this.aClass1_Sub1_Sub3_2.method462(147);
							}
							if (local28 == 793) {
								this.aClass1_Sub1_Sub3_2.method462(189);
							}
							if (local28 == 209) {
								this.aClass1_Sub1_Sub3_2.method462(233);
							}
							this.aClass1_Sub1_Sub3_2.method464(local33);
						}
					}
					if (local28 == 582 || local28 == 113 || local28 == 555 || local28 == 331 || local28 == 354) {
						if (local28 == 331) {
							this.aClass1_Sub1_Sub3_2.method462(179);
						}
						if (local28 == 113) {
							this.aClass1_Sub1_Sub3_2.method462(82);
						}
						if (local28 == 555) {
							this.aClass1_Sub1_Sub3_2.method462(239);
						}
						if (local28 == 354) {
							this.aClass1_Sub1_Sub3_2.method462(46);
						}
						if (local28 == 582) {
							if ((local33 & 0x3) == 0) {
								anInt364++;
							}
							if (anInt364 >= 133) {
								this.aClass1_Sub1_Sub3_2.method462(250);
								this.aClass1_Sub1_Sub3_2.method464(6118);
							}
							this.aClass1_Sub1_Sub3_2.method462(74);
						}
						this.aClass1_Sub1_Sub3_2.method464(local33);
						this.aClass1_Sub1_Sub3_2.method464(local18);
						this.aClass1_Sub1_Sub3_2.method464(local23);
						this.anInt229 = 0;
						this.anInt230 = local23;
						this.anInt231 = local18;
						this.anInt232 = 2;
						if (Class6.aClass6Array1[local23].anInt421 == this.anInt317) {
							this.anInt232 = 1;
						}
						if (Class6.aClass6Array1[local23].anInt421 == this.anInt303) {
							this.anInt232 = 3;
						}
					}
					if (local28 == 997 && !this.aBoolean80) {
						this.aClass1_Sub1_Sub3_2.method462(72);
						this.aClass1_Sub1_Sub3_2.method464(local23);
						this.aBoolean80 = true;
					}
					if (local28 == 1714) {
						local56 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local33];
						if (local56 != null) {
							if (local56.aClass13_2.aByteArray5 == null) {
								local598 = "It's a " + local56.aClass13_2.aString24 + ".";
							} else {
								local598 = new String(local56.aClass13_2.aByteArray5);
							}
							this.method131(0, "", local598);
						}
					}
					if (local28 == 240) {
						local56 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local33];
						if (local56 != null) {
							this.method121(aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray270[0], local56.anIntArray269[0], 1, 1, 0, aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray269[0], 0, false, 0, local56.anIntArray270[0], (byte) 9, 2);
							this.anInt359 = super.anInt201;
							this.anInt360 = super.anInt202;
							this.anInt362 = 2;
							this.anInt361 = 0;
							this.aClass1_Sub1_Sub3_2.method462(181);
							this.aClass1_Sub1_Sub3_2.method464(local33);
							this.aClass1_Sub1_Sub3_2.method464(this.anInt382);
						}
					}
					@Pc(1142) int local1142;
					if (local28 == 902) {
						local131 = this.aStringArray6[arg1];
						local135 = local131.indexOf("@whi@");
						if (local135 != -1) {
							local375 = Class48.method660(local131.substring(local135 + 5).trim());
							local1142 = -1;
							for (@Pc(1144) int local1144 = 0; local1144 < this.anInt344; local1144++) {
								if (this.aLongArray4[local1144] == local375) {
									local1142 = local1144;
									break;
								}
							}
							if (local1142 != -1 && this.anIntArray63[local1142] > 0) {
								this.aBoolean73 = true;
								this.aBoolean72 = false;
								this.aBoolean90 = true;
								this.aString11 = "";
								this.anInt320 = 3;
								this.aLong14 = this.aLongArray4[local1142];
								this.aString13 = "Enter message to send to " + this.aStringArray2[local1142];
							}
						}
					}
					@Pc(1224) String local1224;
					if (local28 == 1381) {
						@Pc(1212) int local1212 = local33 >> 14 & 0x7FFF;
						@Pc(1215) Class9 local1215 = Class9.method287(local1212);
						if (local1215.aByteArray4 == null) {
							local1224 = "It's a " + local1215.aString23 + ".";
						} else {
							local1224 = new String(local1215.aByteArray4);
						}
						this.method131(0, "", local1224);
					}
					if (local28 == 231) {
						local477 = Class6.aClass6Array1[local23];
						@Pc(1252) boolean local1252 = true;
						if (local477.anInt424 > 0) {
							local1252 = this.method195(local477, this.anInt378);
						}
						if (local1252) {
							this.aClass1_Sub1_Sub3_2.method462(9);
							this.aClass1_Sub1_Sub3_2.method464(local23);
						}
					}
					@Pc(1308) boolean local1308;
					if (local28 == 139 || local28 == 778 || local28 == 617 || local28 == 224 || local28 == 662) {
						local1308 = this.method121(aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray270[0], local18, 0, 0, 0, aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray269[0], 0, false, 0, local23, (byte) 9, 2);
						if (!local1308) {
							this.method121(aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray270[0], local18, 1, 1, 0, aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray269[0], 0, false, 0, local23, (byte) 9, 2);
						}
						this.anInt359 = super.anInt201;
						this.anInt360 = super.anInt202;
						this.anInt362 = 2;
						this.anInt361 = 0;
						if (local28 == 662) {
							anInt363 += this.anInt323;
							if (anInt363 >= 118) {
								this.aClass1_Sub1_Sub3_2.method462(41);
								this.aClass1_Sub1_Sub3_2.method467(0);
							}
							this.aClass1_Sub1_Sub3_2.method462(117);
						}
						if (local28 == 139) {
							if ((local18 & 0x3) == 0) {
								anInt380++;
							}
							if (anInt380 >= 123) {
								this.aClass1_Sub1_Sub3_2.method462(25);
								this.aClass1_Sub1_Sub3_2.method467(0);
							}
							this.aClass1_Sub1_Sub3_2.method462(247);
						}
						if (local28 == 224) {
							anInt241 += local23;
							if (anInt241 >= 75) {
								this.aClass1_Sub1_Sub3_2.method462(0);
								this.aClass1_Sub1_Sub3_2.method463(19);
							}
							this.aClass1_Sub1_Sub3_2.method462(62);
						}
						if (local28 == 617) {
							this.aClass1_Sub1_Sub3_2.method462(108);
						}
						if (local28 == 778) {
							this.aClass1_Sub1_Sub3_2.method462(169);
						}
						this.aClass1_Sub1_Sub3_2.method464(local18 + this.anInt322);
						this.aClass1_Sub1_Sub3_2.method464(local23 + this.anInt323);
						this.aClass1_Sub1_Sub3_2.method464(local33);
					}
					if (local28 == 1071) {
						this.method133(local23, local18, 127, local33);
					}
					if (local28 == 507 || local28 == 957) {
						local131 = this.aStringArray6[arg1];
						local135 = local131.indexOf("@whi@");
						if (local135 != -1) {
							local131 = local131.substring(local135 + 5).trim();
							local1224 = Class48.method664(Class48.method661(Class48.method660(local131)));
							@Pc(1501) boolean local1501 = false;
							for (local1142 = 0; local1142 < this.anInt348; local1142++) {
								@Pc(1513) Class1_Sub1_Sub1_Sub1_Sub1 local1513 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[this.anIntArray76[local1142]];
								if (local1513 != null && local1513.aString3 != null && local1513.aString3.equalsIgnoreCase(local1224)) {
									this.method121(aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray270[0], local1513.anIntArray269[0], 1, 1, 0, aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray269[0], 0, false, 0, local1513.anIntArray270[0], (byte) 9, 2);
									if (local28 == 507) {
										anInt321 += local33;
										if (anInt321 >= 66) {
											this.aClass1_Sub1_Sub3_2.method462(235);
											this.aClass1_Sub1_Sub3_2.method463(154);
										}
										this.aClass1_Sub1_Sub3_2.method462(98);
									}
									if (local28 == 957) {
										anInt252++;
										if (anInt252 >= 52) {
											this.aClass1_Sub1_Sub3_2.method462(80);
											this.aClass1_Sub1_Sub3_2.method463(131);
										}
										this.aClass1_Sub1_Sub3_2.method462(109);
									}
									this.aClass1_Sub1_Sub3_2.method464(this.anIntArray76[local1142]);
									local1501 = true;
									break;
								}
							}
							if (!local1501) {
								this.method131(0, "", "Unable to find " + local1224);
							}
						}
					}
					if (local28 == 131) {
						local190 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local33];
						if (local190 != null) {
							this.method121(aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray270[0], local190.anIntArray269[0], 1, 1, 0, aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray269[0], 0, false, 0, local190.anIntArray270[0], (byte) 9, 2);
							this.anInt359 = super.anInt201;
							this.anInt360 = super.anInt202;
							this.anInt362 = 2;
							this.anInt361 = 0;
							this.aClass1_Sub1_Sub3_2.method462(240);
							this.aClass1_Sub1_Sub3_2.method464(local33);
							this.aClass1_Sub1_Sub3_2.method464(this.anInt382);
						}
					}
					if (local28 == 398) {
						this.aClass1_Sub1_Sub3_2.method462(136);
						this.aClass1_Sub1_Sub3_2.method464(local33);
						this.aClass1_Sub1_Sub3_2.method464(local18);
						this.aClass1_Sub1_Sub3_2.method464(local23);
						this.aClass1_Sub1_Sub3_2.method464(this.anInt215);
						this.aClass1_Sub1_Sub3_2.method464(this.anInt213);
						this.aClass1_Sub1_Sub3_2.method464(this.anInt214);
						this.anInt229 = 0;
						this.anInt230 = local23;
						this.anInt231 = local18;
						this.anInt232 = 2;
						if (Class6.aClass6Array1[local23].anInt421 == this.anInt317) {
							this.anInt232 = 1;
						}
						if (Class6.aClass6Array1[local23].anInt421 == this.anInt303) {
							this.anInt232 = 3;
						}
					}
					if (local28 == 737) {
						this.method127();
					}
					if (local28 == 694 || local28 == 962 || local28 == 795 || local28 == 681 || local28 == 100) {
						if (local28 == 681) {
							anInt311++;
							if (anInt311 >= 116) {
								this.aClass1_Sub1_Sub3_2.method462(24);
								this.aClass1_Sub1_Sub3_2.method466(13018169);
							}
							this.aClass1_Sub1_Sub3_2.method462(216);
						}
						if (local28 == 100) {
							this.aClass1_Sub1_Sub3_2.method462(42);
						}
						if (local28 == 694) {
							this.aClass1_Sub1_Sub3_2.method462(185);
						}
						if (local28 == 962) {
							this.aClass1_Sub1_Sub3_2.method462(2);
						}
						if (local28 == 795) {
							this.aClass1_Sub1_Sub3_2.method462(123);
						}
						this.aClass1_Sub1_Sub3_2.method464(local33);
						this.aClass1_Sub1_Sub3_2.method464(local18);
						this.aClass1_Sub1_Sub3_2.method464(local23);
						this.anInt229 = 0;
						this.anInt230 = local23;
						this.anInt231 = local18;
						this.anInt232 = 2;
						if (Class6.aClass6Array1[local23].anInt421 == this.anInt317) {
							this.anInt232 = 1;
						}
						if (Class6.aClass6Array1[local23].anInt421 == this.anInt303) {
							this.anInt232 = 3;
						}
					}
					if (local28 == 357) {
						this.method133(local23, local18, 157, local33);
					}
					if (local28 == 1152) {
						local571 = Class15.method358(local33);
						if (local571.aByteArray6 == null) {
							local598 = "It's a " + local571.aString25 + ".";
						} else {
							local598 = new String(local571.aByteArray6);
						}
						this.method131(0, "", local598);
					}
					if (local28 == 370) {
						local1308 = this.method121(aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray270[0], local18, 0, 0, 0, aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray269[0], 0, false, 0, local23, (byte) 9, 2);
						if (!local1308) {
							this.method121(aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray270[0], local18, 1, 1, 0, aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray269[0], 0, false, 0, local23, (byte) 9, 2);
						}
						this.anInt359 = super.anInt201;
						this.anInt360 = super.anInt202;
						this.anInt362 = 2;
						this.anInt361 = 0;
						this.aClass1_Sub1_Sub3_2.method462(91);
						this.aClass1_Sub1_Sub3_2.method464(local18 + this.anInt322);
						this.aClass1_Sub1_Sub3_2.method464(local23 + this.anInt323);
						this.aClass1_Sub1_Sub3_2.method464(local33);
						this.aClass1_Sub1_Sub3_2.method464(this.anInt382);
					}
					if (local28 == 899 && this.method133(local23, local18, 213, local33)) {
						this.aClass1_Sub1_Sub3_2.method464(this.anInt382);
					}
					if (local28 == 625) {
						this.method133(local23, local18, 215, local33);
					}
					if (local28 == 111) {
						local1308 = this.method121(aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray270[0], local18, 0, 0, 0, aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray269[0], 0, false, 0, local23, (byte) 9, 2);
						if (!local1308) {
							this.method121(aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray270[0], local18, 1, 1, 0, aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray269[0], 0, false, 0, local23, (byte) 9, 2);
						}
						this.anInt359 = super.anInt201;
						this.anInt360 = super.anInt202;
						this.anInt362 = 2;
						this.anInt361 = 0;
						this.aClass1_Sub1_Sub3_2.method462(39);
						this.aClass1_Sub1_Sub3_2.method464(local18 + this.anInt322);
						this.aClass1_Sub1_Sub3_2.method464(local23 + this.anInt323);
						this.aClass1_Sub1_Sub3_2.method464(local33);
						this.aClass1_Sub1_Sub3_2.method464(this.anInt215);
						this.aClass1_Sub1_Sub3_2.method464(this.anInt213);
						this.aClass1_Sub1_Sub3_2.method464(this.anInt214);
					}
					if (local28 == 274) {
						local477 = Class6.aClass6Array1[local23];
						this.anInt381 = 1;
						this.anInt382 = local23;
						this.anInt383 = local477.anInt448;
						this.anInt212 = 0;
						this.aBoolean55 = true;
						local598 = local477.aString20;
						if (local598.indexOf(" ") != -1) {
							local598 = local598.substring(0, local598.indexOf(" "));
						}
						local1224 = local477.aString20;
						if (local1224.indexOf(" ") != -1) {
							local1224 = local1224.substring(local1224.indexOf(" ") + 1);
						}
						this.aString17 = local598 + " " + local477.aString21 + " " + local1224;
						if (this.anInt383 == 16) {
							this.aBoolean55 = true;
							this.anInt304 = 3;
							this.aBoolean46 = true;
						}
					} else {
						if (local28 == 225) {
							this.aClass1_Sub1_Sub3_2.method462(9);
							this.aClass1_Sub1_Sub3_2.method464(local23);
							local477 = Class6.aClass6Array1[local23];
							if (local477.anIntArrayArray7 != null && local477.anIntArrayArray7[0][0] == 5) {
								local135 = local477.anIntArrayArray7[0][1];
								if (this.anIntArray73[local135] != local477.anIntArray96[0]) {
									this.anIntArray73[local135] = local477.anIntArray96[0];
									this.method122(local135);
									this.aBoolean55 = true;
								}
							}
						}
						this.anInt212 = 0;
						this.anInt381 = 0;
						this.aBoolean55 = true;
					}
				}
			}
		} catch (@Pc(2295) RuntimeException local2295) {
			signlink.reporterror("91153, " + arg0 + ", " + arg1 + ", " + local2295.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;IBI)Lclient!xb;")
	private Class47 method143(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		try {
			@Pc(3) byte[] local3 = null;
			@Pc(5) int local5 = 5;
			try {
				if (this.aClass45Array1[0] != null) {
					local3 = this.aClass45Array1[0].method651((byte) 2, arg1);
				}
			} catch (@Pc(20) Exception local20) {
			}
			@Pc(34) int local34;
			if (local3 != null) {
				this.aCRC32_1.reset();
				this.aCRC32_1.update(local3);
				local34 = (int) this.aCRC32_1.getValue();
				if (local34 != arg3) {
					local3 = null;
				}
			}
			if (local3 != null) {
				return new Class47(0, local3);
			}
			local34 = 0;
			while (local3 == null) {
				@Pc(62) String local62 = "Unknown error";
				this.method95("Requesting " + arg0, arg4);
				@Pc(77) int local77;
				try {
					local77 = 0;
					@Pc(88) DataInputStream local88 = this.method166(arg2 + arg3);
					@Pc(91) byte[] local91 = new byte[6];
					local88.readFully(local91, 0, 6);
					@Pc(102) Class1_Sub1_Sub3 local102 = new Class1_Sub1_Sub3(local91, (byte) 1);
					local102.anInt743 = 3;
					@Pc(110) int local110 = local102.method477() + 6;
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
							this.method95("Loading " + arg0 + " - " + local175 + "%", arg4);
						}
						local77 = local175;
					}
					local88.close();
					try {
						if (this.aClass45Array1[0] != null) {
							this.aClass45Array1[0].method652(local3.length, arg1, local3, (byte) 8);
						}
					} catch (@Pc(220) Exception local220) {
						this.aClass45Array1[0] = null;
					}
					if (local3 != null) {
						this.aCRC32_1.reset();
						this.aCRC32_1.update(local3);
						local135 = (int) this.aCRC32_1.getValue();
						if (local135 != arg3) {
							local3 = null;
							local34++;
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
					for (local77 = local5; local77 > 0; local77--) {
						if (local34 >= 3) {
							this.method95("Game updated - please reload page", arg4);
							local77 = 10;
						} else {
							this.method95(local62 + " - Retrying in " + local77, arg4);
						}
						try {
							Thread.sleep(1000L);
						} catch (@Pc(327) Exception local327) {
						}
					}
					local5 *= 2;
					if (local5 > 60) {
						local5 = 60;
					}
					this.aBoolean69 = !this.aBoolean69;
				}
			}
			return new Class47(0, local3);
		} catch (@Pc(359) RuntimeException local359) {
			signlink.reporterror("89038, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + 46 + ", " + arg4 + ", " + local359.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IJ)V")
	private void method144(@OriginalArg(1) long arg0) {
		try {
			if (arg0 != 0L) {
				for (@Pc(11) int local11 = 0; local11 < this.anInt344; local11++) {
					if (this.aLongArray4[local11] == arg0) {
						this.anInt344--;
						this.aBoolean55 = true;
						for (@Pc(31) int local31 = local11; local31 < this.anInt344; local31++) {
							this.aStringArray2[local31] = this.aStringArray2[local31 + 1];
							this.anIntArray63[local31] = this.anIntArray63[local31 + 1];
							this.aLongArray4[local31] = this.aLongArray4[local31 + 1];
						}
						this.aClass1_Sub1_Sub3_2.method462(106);
						this.aClass1_Sub1_Sub3_2.method469(arg0);
						return;
					}
				}
			}
		} catch (@Pc(86) RuntimeException local86) {
			signlink.reporterror("93477, " + 0 + ", " + arg0 + ", " + local86.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "f", descriptor = "(B)V")
	private void method145() {
		try {
			this.aClass35_15.method517(aBoolean59);
			Class1_Sub1_Sub2_Sub1.anIntArray177 = this.anIntArray88;
			this.aClass1_Sub1_Sub2_Sub3_13.method415(this.aByte14, 0, 0);
			if (this.aBoolean90) {
				this.aClass1_Sub1_Sub2_Sub4_3.method443(239, 40, 0, this.aString13);
				this.aClass1_Sub1_Sub2_Sub4_3.method443(239, 60, 128, this.aString11 + "*");
			} else if (this.aBoolean72) {
				this.aClass1_Sub1_Sub2_Sub4_3.method443(239, 40, 0, "Enter amount:");
				this.aClass1_Sub1_Sub2_Sub4_3.method443(239, 60, 128, this.aString16 + "*");
			} else if (this.aString7 != null) {
				this.aClass1_Sub1_Sub2_Sub4_3.method443(239, 40, 0, this.aString7);
				this.aClass1_Sub1_Sub2_Sub4_3.method443(239, 60, 128, "Click to continue");
			} else if (this.anInt303 != -1) {
				this.method209(0, Class6.aClass6Array1[this.anInt303], 0, 0);
			} else if (this.anInt342 == -1) {
				@Pc(142) Class1_Sub1_Sub2_Sub4 local142 = this.aClass1_Sub1_Sub2_Sub4_2;
				@Pc(144) int local144 = 0;
				Class1_Sub1_Sub2.method433(77, 463, 0, 0);
				for (@Pc(152) int local152 = 0; local152 < 100; local152++) {
					if (this.aStringArray4[local152] != null) {
						@Pc(164) int local164 = this.anIntArray49[local152];
						@Pc(173) int local173 = this.anInt335 + 70 - local144 * 14;
						@Pc(178) String local178 = this.aStringArray3[local152];
						@Pc(180) byte local180 = 0;
						if (local178 != null && local178.startsWith("@cr1@")) {
							local178 = local178.substring(5);
							local180 = 1;
						}
						if (local178 != null && local178.startsWith("@cr2@")) {
							local178 = local178.substring(5);
							local180 = 2;
						}
						if (local164 == 0) {
							if (local173 > 0 && local173 < 110) {
								local142.method446(4, this.aStringArray4[local152], 0, local173);
							}
							local144++;
						}
						@Pc(250) int local250;
						if ((local164 == 1 || local164 == 2) && (local164 == 1 || this.anInt282 == 0 || this.anInt282 == 1 && this.method104(local178))) {
							if (local173 > 0 && local173 < 110) {
								local250 = 4;
								if (local180 == 1) {
									this.aClass1_Sub1_Sub2_Sub3Array1[0].method415(this.aByte14, 4, local173 - 12);
									local250 += 14;
								}
								if (local180 == 2) {
									this.aClass1_Sub1_Sub2_Sub3Array1[1].method415(this.aByte14, local250, local173 - 12);
									local250 += 14;
								}
								local142.method446(local250, local178 + ":", 0, local173);
								local250 += local142.method445(local178) + 8;
								local142.method446(local250, this.aStringArray4[local152], 255, local173);
							}
							local144++;
						}
						if ((local164 == 3 || local164 == 7) && this.anInt333 == 0 && (local164 == 7 || this.anInt285 == 0 || this.anInt285 == 1 && this.method104(local178))) {
							if (local173 > 0 && local173 < 110) {
								local142.method446(4, "From", 0, local173);
								local250 = local142.method445("From ") + 4;
								if (local180 == 1) {
									this.aClass1_Sub1_Sub2_Sub3Array1[0].method415(this.aByte14, local250, local173 - 12);
									local250 += 14;
								}
								if (local180 == 2) {
									this.aClass1_Sub1_Sub2_Sub3Array1[1].method415(this.aByte14, local250, local173 - 12);
									local250 += 14;
								}
								local142.method446(local250, local178 + ":", 0, local173);
								local250 += local142.method445(local178) + 8;
								local142.method446(local250, this.aStringArray4[local152], 8388608, local173);
							}
							local144++;
						}
						if (local164 == 4 && (this.anInt209 == 0 || this.anInt209 == 1 && this.method104(local178))) {
							if (local173 > 0 && local173 < 110) {
								local142.method446(4, local178 + " " + this.aStringArray4[local152], 8388736, local173);
							}
							local144++;
						}
						if (local164 == 5 && this.anInt333 == 0 && this.anInt285 < 2) {
							if (local173 > 0 && local173 < 110) {
								local142.method446(4, this.aStringArray4[local152], 8388608, local173);
							}
							local144++;
						}
						if (local164 == 6 && this.anInt333 == 0 && this.anInt285 < 2) {
							if (local173 > 0 && local173 < 110) {
								local142.method446(4, "To " + local178 + ":", 0, local173);
								local142.method446(local142.method445("To " + local178) + 12, this.aStringArray4[local152], 8388608, local173);
							}
							local144++;
						}
						if (local164 == 8 && (this.anInt209 == 0 || this.anInt209 == 1 && this.method104(local178))) {
							if (local173 > 0 && local173 < 110) {
								local142.method446(4, local178 + " " + this.aStringArray4[local152], 8270336, local173);
							}
							local144++;
						}
					}
				}
				Class1_Sub1_Sub2.method432();
				this.anInt271 = local144 * 14 + 7;
				if (this.anInt271 < 78) {
					this.anInt271 = 78;
				}
				this.method138(this.anInt271 - this.anInt335 - 77, 0, this.anInt271, 463, 77);
				@Pc(624) String local624;
				if (aClass1_Sub1_Sub1_Sub1_Sub1_1 == null || aClass1_Sub1_Sub1_Sub1_Sub1_1.aString3 == null) {
					local624 = Class48.method664(this.aString14);
				} else {
					local624 = aClass1_Sub1_Sub1_Sub1_Sub1_1.aString3;
				}
				local142.method446(4, local624 + ":", 0, 90);
				local142.method446(local142.method445(local624 + ": ") + 6, this.aString12 + "*", 255, 90);
				Class1_Sub1_Sub2.method439(479, 0, 0, 77);
			} else {
				this.method209(0, Class6.aClass6Array1[this.anInt342], 0, 0);
			}
			if (this.aBoolean47 && this.anInt411 == 2) {
				this.method97();
			}
			this.aClass35_15.method518(17, super.aGraphics2, 357);
			this.aClass35_14.method517(aBoolean59);
			Class1_Sub1_Sub2_Sub1.anIntArray177 = this.anIntArray90;
		} catch (@Pc(705) RuntimeException local705) {
			signlink.reporterror("81863, " + -29 + ", " + local705.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "()V")
	@Override
	protected void method88() {
		this.method95("Starting up", 20);
		if (signlink.sunjava) {
			super.anInt189 = 5;
		}
		if (aBoolean54) {
			this.aBoolean68 = true;
			return;
		}
		aBoolean54 = true;
		@Pc(21) boolean local21 = false;
		@Pc(25) String local25 = this.method175(879);
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
		if (local25.endsWith("127.0.0.1")) {
			local21 = true;
		}
		if (!local21) {
			this.aBoolean49 = true;
			return;
		}
		if (signlink.aRandomAccessFile1 != null) {
			for (@Pc(89) int local89 = 0; local89 < 5; local89++) {
				this.aClass45Array1[local89] = new Class45(signlink.aRandomAccessFile1, 29615, signlink.aRandomAccessFileArray1[local89], local89 + 1, 500000);
			}
		}
		try {
			this.method229();
			this.aClass47_1 = this.method143("title screen", 1, "title", this.anIntArray42[1], 25);
			this.aClass1_Sub1_Sub2_Sub4_1 = new Class1_Sub1_Sub2_Sub4(this.aClass47_1, false, "p11_full", (byte) 0);
			this.aClass1_Sub1_Sub2_Sub4_2 = new Class1_Sub1_Sub2_Sub4(this.aClass47_1, false, "p12_full", (byte) 0);
			this.aClass1_Sub1_Sub2_Sub4_3 = new Class1_Sub1_Sub2_Sub4(this.aClass47_1, false, "b12_full", (byte) 0);
			this.aClass1_Sub1_Sub2_Sub4_4 = new Class1_Sub1_Sub2_Sub4(this.aClass47_1, true, "q8_full", (byte) 0);
			this.method141();
			this.method173();
			@Pc(185) Class47 local185 = this.method143("config", 2, "config", this.anIntArray42[2], 30);
			@Pc(197) Class47 local197 = this.method143("interface", 3, "interface", this.anIntArray42[3], 35);
			@Pc(209) Class47 local209 = this.method143("2d graphics", 4, "media", this.anIntArray42[4], 40);
			@Pc(221) Class47 local221 = this.method143("textures", 6, "textures", this.anIntArray42[6], 45);
			@Pc(233) Class47 local233 = this.method143("chat system", 7, "wordenc", this.anIntArray42[7], 50);
			@Pc(245) Class47 local245 = this.method143("sound effects", 8, "sounds", this.anIntArray42[8], 55);
			this.aByteArrayArrayArray7 = new byte[4][104][104];
			this.anIntArrayArrayArray5 = new int[4][105][105];
			this.aClass37_1 = new Class37(4, 104, 104, this.anIntArrayArrayArray5, (byte) 6);
			for (@Pc(270) int local270 = 0; local270 < 4; local270++) {
				this.aClass19Array1[local270] = new Class19(104, 104, true);
			}
			this.aClass1_Sub1_Sub2_Sub2_5 = new Class1_Sub1_Sub2_Sub2(512, 512);
			@Pc(305) Class47 local305 = this.method143("update list", 5, "versionlist", this.anIntArray42[5], 60);
			this.method95("Connecting to update server", 60);
			this.aClass44_Sub1_1 = new Class44_Sub1();
			this.aClass44_Sub1_1.method629(local305, this);
			Class12.method300(this.aClass44_Sub1_1.method632());
			Class1_Sub1_Sub1_Sub5.method257(this.aClass44_Sub1_1.method631(anInt403, 0), this.aClass44_Sub1_1);
			if (!aBoolean87) {
				this.anInt377 = 0;
				try {
					this.anInt377 = Integer.parseInt(this.getParameter("music"));
				} catch (@Pc(346) Exception local346) {
				}
				this.aBoolean84 = true;
				this.aClass44_Sub1_1.method638(2, this.anInt377);
				while (this.aClass44_Sub1_1.method639() > 0) {
					this.method105();
					try {
						Thread.sleep(100L);
					} catch (@Pc(364) Exception local364) {
					}
					if (this.aClass44_Sub1_1.anInt954 > 3) {
						this.method214("ondemand");
						return;
					}
				}
			}
			this.method95("Requesting animations", 65);
			@Pc(388) int local388 = this.aClass44_Sub1_1.method631(anInt403, 1);
			for (@Pc(390) int local390 = 0; local390 < local388; local390++) {
				this.aClass44_Sub1_1.method638(1, local390);
			}
			@Pc(409) int local409;
			while (this.aClass44_Sub1_1.method639() > 0) {
				local409 = local388 - this.aClass44_Sub1_1.method639();
				if (local409 > 0) {
					this.method95("Loading animations - " + local409 * 100 / local388 + "%", 65);
				}
				this.method105();
				try {
					Thread.sleep(100L);
				} catch (@Pc(435) Exception local435) {
				}
				if (this.aClass44_Sub1_1.anInt954 > 3) {
					this.method214("ondemand");
					return;
				}
			}
			this.method95("Requesting models", 70);
			local388 = this.aClass44_Sub1_1.method631(anInt403, 0);
			@Pc(469) int local469;
			for (local409 = 0; local409 < local388; local409++) {
				local469 = this.aClass44_Sub1_1.method636(local409, (byte) 9);
				if ((local469 & 0x1) != 0) {
					this.aClass44_Sub1_1.method638(0, local409);
				}
			}
			local388 = this.aClass44_Sub1_1.method639();
			while (this.aClass44_Sub1_1.method639() > 0) {
				local469 = local388 - this.aClass44_Sub1_1.method639();
				if (local469 > 0) {
					this.method95("Loading models - " + local469 * 100 / local388 + "%", 70);
				}
				this.method105();
				try {
					Thread.sleep(100L);
				} catch (@Pc(520) Exception local520) {
				}
			}
			if (this.aClass45Array1[0] != null) {
				this.method95("Requesting maps", 75);
				this.aClass44_Sub1_1.method638(3, this.aClass44_Sub1_1.method633(0, 47, 48));
				this.aClass44_Sub1_1.method638(3, this.aClass44_Sub1_1.method633(1, 47, 48));
				this.aClass44_Sub1_1.method638(3, this.aClass44_Sub1_1.method633(0, 48, 48));
				this.aClass44_Sub1_1.method638(3, this.aClass44_Sub1_1.method633(1, 48, 48));
				this.aClass44_Sub1_1.method638(3, this.aClass44_Sub1_1.method633(0, 49, 48));
				this.aClass44_Sub1_1.method638(3, this.aClass44_Sub1_1.method633(1, 49, 48));
				this.aClass44_Sub1_1.method638(3, this.aClass44_Sub1_1.method633(0, 47, 47));
				this.aClass44_Sub1_1.method638(3, this.aClass44_Sub1_1.method633(1, 47, 47));
				this.aClass44_Sub1_1.method638(3, this.aClass44_Sub1_1.method633(0, 48, 47));
				this.aClass44_Sub1_1.method638(3, this.aClass44_Sub1_1.method633(1, 48, 47));
				this.aClass44_Sub1_1.method638(3, this.aClass44_Sub1_1.method633(0, 48, 148));
				this.aClass44_Sub1_1.method638(3, this.aClass44_Sub1_1.method633(1, 48, 148));
				local388 = this.aClass44_Sub1_1.method639();
				while (this.aClass44_Sub1_1.method639() > 0) {
					local469 = local388 - this.aClass44_Sub1_1.method639();
					if (local469 > 0) {
						this.method95("Loading maps - " + local469 * 100 / local388 + "%", 75);
					}
					this.method105();
					try {
						Thread.sleep(100L);
					} catch (@Pc(705) Exception local705) {
					}
				}
			}
			local388 = this.aClass44_Sub1_1.method631(anInt403, 0);
			@Pc(726) int local726;
			for (local469 = 0; local469 < local388; local469++) {
				local726 = this.aClass44_Sub1_1.method636(local469, (byte) 9);
				@Pc(728) byte local728 = 0;
				if ((local726 & 0x8) != 0) {
					local728 = 10;
				} else if ((local726 & 0x20) != 0) {
					local728 = 9;
				} else if ((local726 & 0x10) != 0) {
					local728 = 8;
				} else if ((local726 & 0x40) != 0) {
					local728 = 7;
				} else if ((local726 & 0x80) != 0) {
					local728 = 6;
				} else if ((local726 & 0x2) != 0) {
					local728 = 5;
				} else if ((local726 & 0x4) != 0) {
					local728 = 4;
				}
				if ((local726 & 0x1) != 0) {
					local728 = 3;
				}
				if (local728 != 0) {
					this.aClass44_Sub1_1.method641(local469, 0, local728);
				}
			}
			this.aClass44_Sub1_1.method634(aBoolean86);
			if (!aBoolean87) {
				local388 = this.aClass44_Sub1_1.method631(anInt403, 2);
				for (local726 = 1; local726 < local388; local726++) {
					if (this.aClass44_Sub1_1.method637(local726)) {
						this.aClass44_Sub1_1.method641(local726, 2, (byte) 1);
					}
				}
			}
			this.method95("Unpacking media", 80);
			this.aClass1_Sub1_Sub2_Sub3_11 = new Class1_Sub1_Sub2_Sub3(local209, "invback", 0);
			this.aClass1_Sub1_Sub2_Sub3_13 = new Class1_Sub1_Sub2_Sub3(local209, "chatback", 0);
			this.aClass1_Sub1_Sub2_Sub3_12 = new Class1_Sub1_Sub2_Sub3(local209, "mapback", 0);
			this.aClass1_Sub1_Sub2_Sub3_8 = new Class1_Sub1_Sub2_Sub3(local209, "backbase1", 0);
			this.aClass1_Sub1_Sub2_Sub3_9 = new Class1_Sub1_Sub2_Sub3(local209, "backbase2", 0);
			this.aClass1_Sub1_Sub2_Sub3_10 = new Class1_Sub1_Sub2_Sub3(local209, "backhmid1", 0);
			for (local726 = 0; local726 < 13; local726++) {
				this.aClass1_Sub1_Sub2_Sub3Array2[local726] = new Class1_Sub1_Sub2_Sub3(local209, "sideicons", local726);
			}
			this.aClass1_Sub1_Sub2_Sub2_8 = new Class1_Sub1_Sub2_Sub2(local209, "compass", 0);
			this.aClass1_Sub1_Sub2_Sub2_9 = new Class1_Sub1_Sub2_Sub2(local209, "mapedge", 0);
			this.aClass1_Sub1_Sub2_Sub2_9.method385((byte) 3);
			@Pc(928) int local928;
			try {
				for (local928 = 0; local928 < 100; local928++) {
					this.aClass1_Sub1_Sub2_Sub3Array3[local928] = new Class1_Sub1_Sub2_Sub3(local209, "mapscene", local928);
				}
			} catch (@Pc(946) Exception local946) {
			}
			try {
				for (local928 = 0; local928 < 100; local928++) {
					this.aClass1_Sub1_Sub2_Sub2Array4[local928] = new Class1_Sub1_Sub2_Sub2(local209, "mapfunction", local928);
				}
			} catch (@Pc(966) Exception local966) {
			}
			try {
				for (local928 = 0; local928 < 20; local928++) {
					this.aClass1_Sub1_Sub2_Sub2Array3[local928] = new Class1_Sub1_Sub2_Sub2(local209, "hitmarks", local928);
				}
			} catch (@Pc(986) Exception local986) {
			}
			try {
				for (local928 = 0; local928 < 20; local928++) {
					this.aClass1_Sub1_Sub2_Sub2Array5[local928] = new Class1_Sub1_Sub2_Sub2(local209, "headicons", local928);
				}
			} catch (@Pc(1006) Exception local1006) {
			}
			this.aClass1_Sub1_Sub2_Sub2_3 = new Class1_Sub1_Sub2_Sub2(local209, "mapmarker", 0);
			this.aClass1_Sub1_Sub2_Sub2_4 = new Class1_Sub1_Sub2_Sub2(local209, "mapmarker", 1);
			for (local928 = 0; local928 < 8; local928++) {
				this.aClass1_Sub1_Sub2_Sub2Array7[local928] = new Class1_Sub1_Sub2_Sub2(local209, "cross", local928);
			}
			this.aClass1_Sub1_Sub2_Sub2_10 = new Class1_Sub1_Sub2_Sub2(local209, "mapdots", 0);
			this.aClass1_Sub1_Sub2_Sub2_11 = new Class1_Sub1_Sub2_Sub2(local209, "mapdots", 1);
			this.aClass1_Sub1_Sub2_Sub2_12 = new Class1_Sub1_Sub2_Sub2(local209, "mapdots", 2);
			this.aClass1_Sub1_Sub2_Sub2_13 = new Class1_Sub1_Sub2_Sub2(local209, "mapdots", 3);
			this.aClass1_Sub1_Sub2_Sub3_6 = new Class1_Sub1_Sub2_Sub3(local209, "scrollbar", 0);
			this.aClass1_Sub1_Sub2_Sub3_7 = new Class1_Sub1_Sub2_Sub3(local209, "scrollbar", 1);
			this.aClass1_Sub1_Sub2_Sub3_1 = new Class1_Sub1_Sub2_Sub3(local209, "redstone1", 0);
			this.aClass1_Sub1_Sub2_Sub3_2 = new Class1_Sub1_Sub2_Sub3(local209, "redstone2", 0);
			this.aClass1_Sub1_Sub2_Sub3_3 = new Class1_Sub1_Sub2_Sub3(local209, "redstone3", 0);
			this.aClass1_Sub1_Sub2_Sub3_4 = new Class1_Sub1_Sub2_Sub3(local209, "redstone1", 0);
			this.aClass1_Sub1_Sub2_Sub3_4.method412();
			this.aClass1_Sub1_Sub2_Sub3_5 = new Class1_Sub1_Sub2_Sub3(local209, "redstone2", 0);
			this.aClass1_Sub1_Sub2_Sub3_5.method412();
			this.aClass1_Sub1_Sub2_Sub3_14 = new Class1_Sub1_Sub2_Sub3(local209, "redstone1", 0);
			this.aClass1_Sub1_Sub2_Sub3_14.method413();
			this.aClass1_Sub1_Sub2_Sub3_15 = new Class1_Sub1_Sub2_Sub3(local209, "redstone2", 0);
			this.aClass1_Sub1_Sub2_Sub3_15.method413();
			this.aClass1_Sub1_Sub2_Sub3_16 = new Class1_Sub1_Sub2_Sub3(local209, "redstone3", 0);
			this.aClass1_Sub1_Sub2_Sub3_16.method413();
			this.aClass1_Sub1_Sub2_Sub3_17 = new Class1_Sub1_Sub2_Sub3(local209, "redstone1", 0);
			this.aClass1_Sub1_Sub2_Sub3_17.method412();
			this.aClass1_Sub1_Sub2_Sub3_17.method413();
			this.aClass1_Sub1_Sub2_Sub3_18 = new Class1_Sub1_Sub2_Sub3(local209, "redstone2", 0);
			this.aClass1_Sub1_Sub2_Sub3_18.method412();
			this.aClass1_Sub1_Sub2_Sub3_18.method413();
			for (@Pc(1206) int local1206 = 0; local1206 < 2; local1206++) {
				this.aClass1_Sub1_Sub2_Sub3Array1[local1206] = new Class1_Sub1_Sub2_Sub3(local209, "mod_icons", local1206);
			}
			@Pc(1229) Class1_Sub1_Sub2_Sub2 local1229 = new Class1_Sub1_Sub2_Sub2(local209, "backleft1", 0);
			this.aClass35_3 = new Class35(local1229.anInt648, anInt273, local1229.anInt647, this.method93(aByte17));
			local1229.method386(0, 0);
			@Pc(1254) Class1_Sub1_Sub2_Sub2 local1254 = new Class1_Sub1_Sub2_Sub2(local209, "backleft2", 0);
			this.aClass35_4 = new Class35(local1254.anInt648, anInt273, local1254.anInt647, this.method93(aByte17));
			local1254.method386(0, 0);
			@Pc(1279) Class1_Sub1_Sub2_Sub2 local1279 = new Class1_Sub1_Sub2_Sub2(local209, "backright1", 0);
			this.aClass35_5 = new Class35(local1279.anInt648, anInt273, local1279.anInt647, this.method93(aByte17));
			local1279.method386(0, 0);
			@Pc(1304) Class1_Sub1_Sub2_Sub2 local1304 = new Class1_Sub1_Sub2_Sub2(local209, "backright2", 0);
			this.aClass35_6 = new Class35(local1304.anInt648, anInt273, local1304.anInt647, this.method93(aByte17));
			local1304.method386(0, 0);
			@Pc(1329) Class1_Sub1_Sub2_Sub2 local1329 = new Class1_Sub1_Sub2_Sub2(local209, "backtop1", 0);
			this.aClass35_7 = new Class35(local1329.anInt648, anInt273, local1329.anInt647, this.method93(aByte17));
			local1329.method386(0, 0);
			@Pc(1354) Class1_Sub1_Sub2_Sub2 local1354 = new Class1_Sub1_Sub2_Sub2(local209, "backvmid1", 0);
			this.aClass35_8 = new Class35(local1354.anInt648, anInt273, local1354.anInt647, this.method93(aByte17));
			local1354.method386(0, 0);
			@Pc(1379) Class1_Sub1_Sub2_Sub2 local1379 = new Class1_Sub1_Sub2_Sub2(local209, "backvmid2", 0);
			this.aClass35_9 = new Class35(local1379.anInt648, anInt273, local1379.anInt647, this.method93(aByte17));
			local1379.method386(0, 0);
			@Pc(1404) Class1_Sub1_Sub2_Sub2 local1404 = new Class1_Sub1_Sub2_Sub2(local209, "backvmid3", 0);
			this.aClass35_10 = new Class35(local1404.anInt648, anInt273, local1404.anInt647, this.method93(aByte17));
			local1404.method386(0, 0);
			@Pc(1429) Class1_Sub1_Sub2_Sub2 local1429 = new Class1_Sub1_Sub2_Sub2(local209, "backhmid2", 0);
			this.aClass35_11 = new Class35(local1429.anInt648, anInt273, local1429.anInt647, this.method93(aByte17));
			local1429.method386(0, 0);
			@Pc(1454) int local1454 = (int) (Math.random() * 21.0D) - 10;
			@Pc(1461) int local1461 = (int) (Math.random() * 21.0D) - 10;
			@Pc(1468) int local1468 = (int) (Math.random() * 21.0D) - 10;
			@Pc(1475) int local1475 = (int) (Math.random() * 41.0D) - 20;
			for (@Pc(1477) int local1477 = 0; local1477 < 100; local1477++) {
				if (this.aClass1_Sub1_Sub2_Sub2Array4[local1477] != null) {
					this.aClass1_Sub1_Sub2_Sub2Array4[local1477].method384(local1468 + local1475, local1454 + local1475, local1461 + local1475);
				}
				if (this.aClass1_Sub1_Sub2_Sub3Array3[local1477] != null) {
					this.aClass1_Sub1_Sub2_Sub3Array3[local1477].method414(local1468 + local1475, local1454 + local1475, local1461 + local1475);
				}
			}
			this.method95("Unpacking textures", 83);
			Class1_Sub1_Sub2_Sub1.method344(local221);
			Class1_Sub1_Sub2_Sub1.method348(0.8D);
			Class1_Sub1_Sub2_Sub1.method343();
			this.method95("Unpacking config", 86);
			Class27.method498(local185);
			Class9.method285(local185);
			Class21.method455(local185);
			Class15.method356(local185);
			Class13.method319(local185);
			Class23.method489(local185);
			Class33.method514(local185);
			Class39.method582(local185);
			Class36.method520(local185);
			Class15.aBoolean151 = aBoolean86;
			if (!aBoolean87) {
				this.method95("Unpacking sounds", 90);
				@Pc(1580) byte[] local1580 = local245.method659("sounds.dat", null);
				@Pc(1586) Class1_Sub1_Sub3 local1586 = new Class1_Sub1_Sub3(local1580, (byte) 1);
				Class5.method77(local1586);
			}
			this.method95("Unpacking interfaces", 95);
			@Pc(1617) Class1_Sub1_Sub2_Sub4[] local1617 = new Class1_Sub1_Sub2_Sub4[] { this.aClass1_Sub1_Sub2_Sub4_1, this.aClass1_Sub1_Sub2_Sub4_2, this.aClass1_Sub1_Sub2_Sub4_3, this.aClass1_Sub1_Sub2_Sub4_4 };
			Class6.method230(local197, local209, local1617);
			this.method95("Preparing game engine", 100);
			@Pc(1633) int local1633;
			@Pc(1635) int local1635;
			@Pc(1637) int local1637;
			for (@Pc(1629) int local1629 = 0; local1629 < 33; local1629++) {
				local1633 = 999;
				local1635 = 0;
				for (local1637 = 0; local1637 < 34; local1637++) {
					if (this.aClass1_Sub1_Sub2_Sub3_12.aByteArray7[local1637 + local1629 * this.aClass1_Sub1_Sub2_Sub3_12.anInt674] == 0) {
						if (local1633 == 999) {
							local1633 = local1637;
						}
					} else if (local1633 != 999) {
						local1635 = local1637;
						break;
					}
				}
				this.anIntArray40[local1629] = local1633;
				this.anIntArray60[local1629] = local1635 - local1633;
			}
			@Pc(1695) int local1695;
			for (local1633 = 5; local1633 < 156; local1633++) {
				local1635 = 999;
				local1637 = 0;
				for (local1695 = 25; local1695 < 172; local1695++) {
					if (this.aClass1_Sub1_Sub2_Sub3_12.aByteArray7[local1695 + local1633 * this.aClass1_Sub1_Sub2_Sub3_12.anInt674] == 0 && (local1695 > 34 || local1633 > 34)) {
						if (local1635 == 999) {
							local1635 = local1695;
						}
					} else if (local1635 != 999) {
						local1637 = local1695;
						break;
					}
				}
				this.anIntArray79[local1633 - 5] = local1635 - 25;
				this.anIntArray80[local1633 - 5] = local1637 - local1635;
			}
			Class1_Sub1_Sub2_Sub1.method341(479, 96);
			this.anIntArray88 = Class1_Sub1_Sub2_Sub1.anIntArray177;
			Class1_Sub1_Sub2_Sub1.method341(190, 261);
			this.anIntArray89 = Class1_Sub1_Sub2_Sub1.anIntArray177;
			Class1_Sub1_Sub2_Sub1.method341(512, 334);
			this.anIntArray90 = Class1_Sub1_Sub2_Sub1.anIntArray177;
			@Pc(1779) int[] local1779 = new int[9];
			for (local1637 = 0; local1637 < 9; local1637++) {
				local1695 = local1637 * 32 + 128 + 15;
				@Pc(1797) int local1797 = local1695 * 3 + 600;
				@Pc(1801) int local1801 = Class1_Sub1_Sub2_Sub1.anIntArray175[local1695];
				local1779[local1637] = local1797 * local1801 >> 16;
			}
			Class37.method559(local1779);
			Class42.method587(local233);
			this.aClass11_1 = new Class11(anInt398, this);
			this.method94(this.aClass11_1, 10);
		} catch (@Pc(1836) Exception local1836) {
			signlink.reporterror("loaderror " + this.aString6 + " " + this.anInt255);
			this.aBoolean82 = true;
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IILclient!d;IIIIZI)V")
	private void method146(@OriginalArg(1) int arg0, @OriginalArg(2) Class6 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) boolean arg6, @OriginalArg(8) int arg7) {
		try {
			if (this.aBoolean66) {
				this.anInt336 = 32;
			} else {
				this.anInt336 = 0;
			}
			this.aBoolean66 = false;
			if (arg5 >= arg4 && arg5 < arg4 + 16 && arg2 >= arg3 && arg2 < arg3 + 16) {
				arg1.anInt431 -= this.anInt291 * 4;
				if (arg6) {
					this.aBoolean55 = true;
					return;
				}
			} else if (arg5 >= arg4 && arg5 < arg4 + 16 && arg2 >= arg3 + arg0 - 16 && arg2 < arg3 + arg0) {
				arg1.anInt431 += this.anInt291 * 4;
				if (arg6) {
					this.aBoolean55 = true;
					return;
				}
			} else if (arg5 >= arg4 - this.anInt336 && arg5 < arg4 + this.anInt336 + 16 && arg2 >= arg3 + 16 && arg2 < arg3 + arg0 - 16 && this.anInt291 > 0) {
				@Pc(123) int local123 = (arg0 - 32) * arg0 / arg7;
				if (local123 < 8) {
					local123 = 8;
				}
				@Pc(138) int local138 = arg2 - arg3 - local123 / 2 - 16;
				@Pc(144) int local144 = arg0 - local123 - 32;
				arg1.anInt431 = (arg7 - arg0) * local138 / local144;
				if (arg6) {
					this.aBoolean55 = true;
				}
				this.aBoolean66 = true;
			} else {
				return;
			}
		} catch (@Pc(163) RuntimeException local163) {
			signlink.reporterror("44532, " + -782 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + local163.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IB)Z")
	private boolean method147(@OriginalArg(0) int arg0) {
		try {
			if (arg0 < 0) {
				return false;
			}
			@Pc(8) int local8 = this.anIntArray85[arg0];
			if (local8 >= 2000) {
				local8 -= 2000;
			}
			return local8 == 605;
		} catch (@Pc(28) RuntimeException local28) {
			signlink.reporterror("55424, " + arg0 + ", " + 9 + ", " + local28.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IILclient!lb;)V")
	private void method148(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class1_Sub1_Sub3 arg2) {
		try {
			@Pc(4) int local4 = arg0 + arg1;
			arg2.method483();
			@Pc(13) int local13 = arg2.method484(8);
			@Pc(19) int local19;
			if (local13 < this.anInt416) {
				for (local19 = local13; local19 < this.anInt416; local19++) {
					this.anIntArray61[this.anInt329++] = this.anIntArray92[local19];
				}
			}
			if (local13 > this.anInt416) {
				signlink.reporterror(this.aString14 + " Too many npcs");
				throw new RuntimeException("eek");
			}
			this.anInt416 = 0;
			for (local19 = 0; local19 < local13; local19++) {
				@Pc(71) int local71 = this.anIntArray92[local19];
				@Pc(76) Class1_Sub1_Sub1_Sub1_Sub2 local76 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local71];
				@Pc(81) int local81 = arg2.method484(1);
				if (local81 == 0) {
					this.anIntArray92[this.anInt416++] = local71;
					local76.anInt1030 = anInt207;
				} else {
					@Pc(104) int local104 = arg2.method484(2);
					if (local104 == 0) {
						this.anIntArray92[this.anInt416++] = local71;
						local76.anInt1030 = anInt207;
						this.anIntArray77[this.anInt349++] = local71;
					} else {
						@Pc(155) int local155;
						@Pc(165) int local165;
						if (local104 == 1) {
							this.anIntArray92[this.anInt416++] = local71;
							local76.anInt1030 = anInt207;
							local155 = arg2.method484(3);
							local76.method672(local155, false);
							local165 = arg2.method484(1);
							if (local165 == 1) {
								this.anIntArray77[this.anInt349++] = local71;
							}
						} else if (local104 == 2) {
							this.anIntArray92[this.anInt416++] = local71;
							local76.anInt1030 = anInt207;
							local155 = arg2.method484(3);
							local76.method672(local155, true);
							local165 = arg2.method484(3);
							local76.method672(local165, true);
							@Pc(223) int local223 = arg2.method484(1);
							if (local223 == 1) {
								this.anIntArray77[this.anInt349++] = local71;
							}
						} else if (local104 == 3) {
							this.anIntArray61[this.anInt329++] = local71;
						}
					}
				}
			}
		} catch (@Pc(260) RuntimeException local260) {
			signlink.reporterror("29725, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local260.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(IILclient!lb;)V")
	private void method149(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class1_Sub1_Sub3 arg2) {
		try {
			@Pc(5) boolean local5 = false;
			@Pc(14) int local14;
			@Pc(23) int local23;
			@Pc(30) int local30;
			@Pc(33) int local33;
			@Pc(37) int local37;
			@Pc(41) int local41;
			@Pc(46) int local46;
			@Pc(51) int local51;
			if (arg0 == 138 || arg0 == 173) {
				local14 = arg2.method473();
				local23 = this.anInt262 + (local14 >> 4 & 0x7);
				local30 = this.anInt263 + (local14 & 0x7);
				local33 = arg2.method473();
				local37 = local33 >> 2;
				local41 = local33 & 0x3;
				local46 = this.anIntArray52[local37];
				if (arg0 == 173) {
					local51 = -1;
				} else {
					local51 = arg2.method475();
				}
				if (local23 >= 0 && local30 >= 0 && local23 < 104 && local30 < 104) {
					this.method164(local30, -1, local51, this.anInt327, local41, local23, local46, local37, 0);
				}
			} else {
				@Pc(141) int local141;
				@Pc(153) int local153;
				@Pc(167) int local167;
				@Pc(179) int local179;
				if (arg0 == 48) {
					local14 = arg2.method473();
					local23 = this.anInt262 + (local14 >> 4 & 0x7);
					local30 = this.anInt263 + (local14 & 0x7);
					local33 = arg2.method473();
					local37 = local33 >> 2;
					local41 = local33 & 0x3;
					local46 = this.anIntArray52[local37];
					local51 = arg2.method475();
					if (local23 >= 0 && local30 >= 0 && local23 < 103 && local30 < 103) {
						local141 = this.anIntArrayArrayArray5[this.anInt327][local23][local30];
						local153 = this.anIntArrayArrayArray5[this.anInt327][local23 + 1][local30];
						local167 = this.anIntArrayArrayArray5[this.anInt327][local23 + 1][local30 + 1];
						local179 = this.anIntArrayArrayArray5[this.anInt327][local23][local30 + 1];
						if (local46 == 0) {
							@Pc(190) Class34 local190 = this.aClass37_1.method545(local30, this.anInt327, local23);
							if (local190 != null) {
								@Pc(199) int local199 = local190.anInt839 >> 14 & 0x7FFF;
								if (local37 == 2) {
									local190.aClass1_Sub1_Sub1_7 = new Class1_Sub1_Sub1_Sub2(2, local41 + 4, local51, local199, local167, this.anInt254, false, local153, local179, local141);
									local190.aClass1_Sub1_Sub1_8 = new Class1_Sub1_Sub1_Sub2(2, local41 + 1 & 0x3, local51, local199, local167, this.anInt254, false, local153, local179, local141);
								} else {
									local190.aClass1_Sub1_Sub1_7 = new Class1_Sub1_Sub1_Sub2(local37, local41, local51, local199, local167, this.anInt254, false, local153, local179, local141);
								}
							}
						}
						if (local46 == 1) {
							@Pc(270) Class14 local270 = this.aClass37_1.method546(local23, this.anInt327, local30);
							if (local270 != null) {
								local270.aClass1_Sub1_Sub1_1 = new Class1_Sub1_Sub1_Sub2(4, 0, local51, local270.anInt573 >> 14 & 0x7FFF, local167, this.anInt254, false, local153, local179, local141);
							}
						}
						if (local46 == 2) {
							@Pc(306) Class31 local306 = this.aClass37_1.method547(local23, this.anInt327, this.aBoolean48, local30);
							if (local37 == 11) {
								local37 = 10;
							}
							if (local306 != null) {
								local306.aClass1_Sub1_Sub1_6 = new Class1_Sub1_Sub1_Sub2(local37, local41, local51, local306.anInt824 >> 14 & 0x7FFF, local167, this.anInt254, false, local153, local179, local141);
							}
						}
						if (local46 == 3) {
							@Pc(346) Class18 local346 = this.aClass37_1.method548(local23, this.anInt327, local30);
							if (local346 != null) {
								local346.aClass1_Sub1_Sub1_2 = new Class1_Sub1_Sub1_Sub2(22, local41, local51, local346.anInt656 >> 14 & 0x7FFF, local167, this.anInt254, false, local153, local179, local141);
							}
						}
					}
				} else {
					@Pc(412) Class1_Sub1_Sub1_Sub3 local412;
					if (arg0 == 81) {
						local14 = arg2.method473();
						local23 = this.anInt262 + (local14 >> 4 & 0x7);
						local30 = this.anInt263 + (local14 & 0x7);
						local33 = arg2.method475();
						local37 = arg2.method475();
						if (local23 >= 0 && local30 >= 0 && local23 < 104 && local30 < 104) {
							local412 = new Class1_Sub1_Sub1_Sub3();
							local412.anInt180 = local33;
							local412.anInt181 = local37;
							if (this.aClass29ArrayArrayArray1[this.anInt327][local23][local30] == null) {
								this.aClass29ArrayArrayArray1[this.anInt327][local23][local30] = new Class29(-822);
							}
							this.aClass29ArrayArrayArray1[this.anInt327][local23][local30].method501(local412);
							this.method134(local23, local30);
						}
					} else if (arg0 == 52) {
						local14 = arg2.method473();
						local23 = this.anInt262 + (local14 >> 4 & 0x7);
						local30 = this.anInt263 + (local14 & 0x7);
						local33 = arg2.method475();
						if (local23 >= 0 && local30 >= 0 && local23 < 104 && local30 < 104) {
							@Pc(502) Class29 local502 = this.aClass29ArrayArrayArray1[this.anInt327][local23][local30];
							if (local502 != null) {
								for (local412 = (Class1_Sub1_Sub1_Sub3) local502.method504(); local412 != null; local412 = (Class1_Sub1_Sub1_Sub3) local502.method506(this.aByte9)) {
									if (local412.anInt180 == (local33 & 0x7FFF)) {
										local412.method667();
										break;
									}
								}
								if (local502.method504() == null) {
									this.aClass29ArrayArrayArray1[this.anInt327][local23][local30] = null;
								}
								this.method134(local23, local30);
							}
						}
					} else if (arg0 == 107) {
						local14 = arg2.method473();
						local23 = this.anInt262 + (local14 >> 4 & 0x7);
						local30 = this.anInt263 + (local14 & 0x7);
						local33 = local23 + arg2.method474();
						local37 = local30 + arg2.method474();
						local41 = arg2.method476();
						local46 = arg2.method475();
						local51 = arg2.method473() * 4;
						local141 = arg2.method473() * 4;
						local153 = arg2.method475();
						local167 = arg2.method475();
						local179 = arg2.method473();
						@Pc(606) int local606 = arg2.method473();
						if (local23 >= 0 && local30 >= 0 && local23 < 104 && local30 < 104 && local33 >= 0 && local37 >= 0 && local33 < 104 && local37 < 104) {
							local23 = local23 * 128 + 64;
							local30 = local30 * 128 + 64;
							local33 = local33 * 128 + 64;
							local37 = local37 * 128 + 64;
							@Pc(680) Class1_Sub1_Sub1_Sub4 local680 = new Class1_Sub1_Sub1_Sub4(local23, local606, local141, local167 + anInt207, local179, local153 + anInt207, this.anInt327, local46, this.aBoolean56, this.method132(local23, local30, this.anInt327) - local51, local41, local30);
							local680.method240(local153 + anInt207, this.method132(local33, local37, this.anInt327) - local141, local33, local37);
							this.aClass29_2.method501(local680);
						}
					} else if (arg0 == 85) {
						local14 = arg2.method473();
						local23 = this.anInt262 + (local14 >> 4 & 0x7);
						local30 = this.anInt263 + (local14 & 0x7);
						local33 = arg2.method475();
						local37 = arg2.method473();
						local41 = arg2.method475();
						if (local23 >= 0 && local30 >= 0 && local23 < 104 && local30 < 104) {
							local23 = local23 * 128 + 64;
							local30 = local30 * 128 + 64;
							@Pc(776) Class1_Sub1_Sub1_Sub6 local776 = new Class1_Sub1_Sub1_Sub6(local41, local30, local23, this.anInt327, 0, this.method132(local23, local30, this.anInt327) - local37, local33, anInt207);
							this.aClass29_1.method501(local776);
						}
					} else if (arg0 == 219) {
						local14 = arg2.method473();
						local23 = this.anInt262 + (local14 >> 4 & 0x7);
						local30 = this.anInt263 + (local14 & 0x7);
						local33 = arg2.method475();
						local37 = arg2.method475();
						local41 = arg2.method475();
						if (local23 >= 0 && local30 >= 0 && local23 < 104 && local30 < 104 && local41 != this.anInt276) {
							@Pc(830) Class1_Sub1_Sub1_Sub3 local830 = new Class1_Sub1_Sub1_Sub3();
							local830.anInt180 = local33;
							local830.anInt181 = local37;
							if (this.aClass29ArrayArrayArray1[this.anInt327][local23][local30] == null) {
								this.aClass29ArrayArrayArray1[this.anInt327][local23][local30] = new Class29(-822);
							}
							this.aClass29ArrayArrayArray1[this.anInt327][local23][local30].method501(local830);
							this.method134(local23, local30);
						}
					} else {
						if (arg0 == 176) {
							local14 = arg2.method473();
							local23 = this.anInt262 + (local14 >> 4 & 0x7);
							local30 = this.anInt263 + (local14 & 0x7);
							local33 = arg2.method473();
							local37 = local33 >> 2;
							local41 = local33 & 0x3;
							local46 = this.anIntArray52[local37];
							local51 = arg2.method475();
							local141 = arg2.method475();
							local153 = arg2.method475();
							local167 = arg2.method475();
							@Pc(928) byte local928 = arg2.method474();
							@Pc(931) byte local931 = arg2.method474();
							@Pc(934) byte local934 = arg2.method474();
							@Pc(937) byte local937 = arg2.method474();
							@Pc(943) Class1_Sub1_Sub1_Sub1_Sub1 local943;
							if (local167 == this.anInt276) {
								local943 = aClass1_Sub1_Sub1_Sub1_Sub1_1;
							} else {
								local943 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local167];
							}
							if (local943 != null) {
								@Pc(955) Class9 local955 = Class9.method287(local51);
								@Pc(965) int local965 = this.anIntArrayArrayArray5[this.anInt327][local23][local30];
								@Pc(977) int local977 = this.anIntArrayArrayArray5[this.anInt327][local23 + 1][local30];
								@Pc(991) int local991 = this.anIntArrayArrayArray5[this.anInt327][local23 + 1][local30 + 1];
								@Pc(1003) int local1003 = this.anIntArrayArrayArray5[this.anInt327][local23][local30 + 1];
								@Pc(1013) Class1_Sub1_Sub1_Sub5 local1013 = local955.method293(local37, local41, local965, local977, local991, local1003, -1);
								if (local1013 != null) {
									this.method164(local30, local153 + 1, -1, this.anInt327, 0, local23, local46, 0, local141 + 1);
									local943.anInt134 = local141 + anInt207;
									local943.anInt135 = local153 + anInt207;
									local943.aClass1_Sub1_Sub1_Sub5_1 = local1013;
									@Pc(1048) int local1048 = local955.anInt509;
									@Pc(1051) int local1051 = local955.anInt510;
									if (local41 == 1 || local41 == 3) {
										local1048 = local955.anInt510;
										local1051 = local955.anInt509;
									}
									local943.anInt136 = local23 * 128 + local1048 * 64;
									local943.anInt138 = local30 * 128 + local1051 * 64;
									local943.anInt137 = this.method132(local943.anInt136, local943.anInt138, this.anInt327);
									@Pc(1097) byte local1097;
									if (local928 > local934) {
										local1097 = local928;
										local928 = local934;
										local934 = local1097;
									}
									if (local931 > local937) {
										local1097 = local931;
										local931 = local937;
										local937 = local1097;
									}
									local943.anInt139 = local23 + local928;
									local943.anInt141 = local23 + local934;
									local943.anInt140 = local30 + local931;
									local943.anInt142 = local30 + local937;
								}
							}
						}
						if (arg0 == 95) {
							local14 = arg2.method473();
							local23 = this.anInt262 + (local14 >> 4 & 0x7);
							local30 = this.anInt263 + (local14 & 0x7);
							local33 = arg2.method475();
							local37 = arg2.method475();
							local41 = arg2.method475();
							if (local23 >= 0 && local30 >= 0 && local23 < 104 && local30 < 104) {
								@Pc(1181) Class29 local1181 = this.aClass29ArrayArrayArray1[this.anInt327][local23][local30];
								if (local1181 != null) {
									for (@Pc(1187) Class1_Sub1_Sub1_Sub3 local1187 = (Class1_Sub1_Sub1_Sub3) local1181.method504(); local1187 != null; local1187 = (Class1_Sub1_Sub1_Sub3) local1181.method506(this.aByte9)) {
										if (local1187.anInt180 == (local33 & 0x7FFF) && local1187.anInt181 == local37) {
											local1187.anInt181 = local41;
											break;
										}
									}
									this.method134(local23, local30);
								}
							}
						}
					}
				}
			}
		} catch (@Pc(1218) RuntimeException local1218) {
			signlink.reporterror("36344, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local1218.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "q", descriptor = "(I)V")
	private void method150() {
		try {
			if (this.anInt249 == 0) {
				this.aStringArray6[0] = "Cancel";
				this.anIntArray85[0] = 1106;
				this.anInt287 = 1;
				this.method165();
				this.anInt351 = 0;
				if (super.anInt195 > 4 && super.anInt196 > 4 && super.anInt195 < 516 && super.anInt196 < 338) {
					if (this.anInt317 == -1) {
						this.method129();
					} else {
						this.method151(super.anInt196, super.anInt195, 4, Class6.aClass6Array1[this.anInt317], 0, 4);
					}
				}
				if (this.anInt351 != this.anInt409) {
					this.anInt409 = this.anInt351;
				}
				this.anInt351 = 0;
				if (super.anInt195 > 553 && super.anInt196 > 205 && super.anInt195 < 743 && super.anInt196 < 466) {
					if (this.anInt390 != -1) {
						this.method151(super.anInt196, super.anInt195, 205, Class6.aClass6Array1[this.anInt390], 0, 553);
					} else if (this.anIntArray50[this.anInt304] != -1) {
						this.method151(super.anInt196, super.anInt195, 205, Class6.aClass6Array1[this.anIntArray50[this.anInt304]], 0, 553);
					}
				}
				if (this.anInt351 != this.anInt305) {
					this.aBoolean55 = true;
					this.anInt305 = this.anInt351;
				}
				this.anInt351 = 0;
				if (super.anInt195 > 17 && super.anInt196 > 357 && super.anInt195 < 496 && super.anInt196 < 453) {
					if (this.anInt303 != -1) {
						this.method151(super.anInt196, super.anInt195, 357, Class6.aClass6Array1[this.anInt303], 0, 17);
					} else if (super.anInt196 < 434 && super.anInt195 < 426) {
						this.method172(super.anInt195 - 17, super.anInt196 - 357);
					}
				}
				if (this.anInt303 != -1 && this.anInt351 != this.anInt330) {
					this.aBoolean73 = true;
					this.anInt330 = this.anInt351;
				}
				@Pc(232) boolean local232 = false;
				while (!local232) {
					local232 = true;
					for (@Pc(238) int local238 = 0; local238 < this.anInt287 - 1; local238++) {
						if (this.anIntArray85[local238] < 1000 && this.anIntArray85[local238 + 1] > 1000) {
							@Pc(259) String local259 = this.aStringArray6[local238];
							this.aStringArray6[local238] = this.aStringArray6[local238 + 1];
							this.aStringArray6[local238 + 1] = local259;
							@Pc(281) int local281 = this.anIntArray85[local238];
							this.anIntArray85[local238] = this.anIntArray85[local238 + 1];
							this.anIntArray85[local238 + 1] = local281;
							@Pc(303) int local303 = this.anIntArray83[local238];
							this.anIntArray83[local238] = this.anIntArray83[local238 + 1];
							this.anIntArray83[local238 + 1] = local303;
							@Pc(325) int local325 = this.anIntArray84[local238];
							this.anIntArray84[local238] = this.anIntArray84[local238 + 1];
							this.anIntArray84[local238 + 1] = local325;
							@Pc(347) int local347 = this.anIntArray86[local238];
							this.anIntArray86[local238] = this.anIntArray86[local238 + 1];
							this.anIntArray86[local238 + 1] = local347;
							local232 = false;
						}
					}
				}
			}
		} catch (@Pc(377) RuntimeException local377) {
			signlink.reporterror("61816, " + 4 + ", " + local377.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(I)V")
	@Override
	protected void method92(@OriginalArg(0) int arg0) {
		try {
			@Pc(3) boolean local3 = false;
			this.aBoolean53 = true;
		} catch (@Pc(8) RuntimeException local8) {
			signlink.reporterror("11220, " + arg0 + ", " + local8.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/String;II)V")
	@Override
	protected void method95(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		try {
			this.anInt255 = arg1;
			this.aString6 = arg0;
			this.method98(this.anInt228);
			if (this.aClass47_1 == null) {
				super.method95(arg0, arg1);
			} else {
				this.aClass35_21.method517(aBoolean59);
				this.aClass1_Sub1_Sub2_Sub4_3.method443(180, 54, 16777215, "RuneScape is loading - please wait...");
				Class1_Sub1_Sub2.method437(304, 9179409, 34, 28, 62);
				Class1_Sub1_Sub2.method437(302, 0, 32, 29, 63);
				Class1_Sub1_Sub2.method436(30, 9179409, arg1 * 3, 30, 64);
				Class1_Sub1_Sub2.method436(30, 0, 300 - arg1 * 3, arg1 * 3 + 30, 64);
				this.aClass1_Sub1_Sub2_Sub4_3.method443(180, 85, 16777215, arg0);
				this.aClass35_21.method518(202, super.aGraphics2, 171);
				if (this.aBoolean53) {
					this.aBoolean53 = false;
					if (!this.aBoolean52) {
						this.aClass35_22.method518(0, super.aGraphics2, 0);
						this.aClass35_23.method518(637, super.aGraphics2, 0);
					}
					this.aClass35_19.method518(128, super.aGraphics2, 0);
					this.aClass35_20.method518(202, super.aGraphics2, 371);
					this.aClass35_24.method518(0, super.aGraphics2, 265);
					this.aClass35_25.method518(562, super.aGraphics2, 265);
					this.aClass35_26.method518(128, super.aGraphics2, 171);
					this.aClass35_27.method518(562, super.aGraphics2, 171);
				}
			}
		} catch (@Pc(218) RuntimeException local218) {
			signlink.reporterror("8709, " + arg0 + ", " + arg1 + ", " + 7 + ", " + local218.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIILclient!d;III)V")
	private void method151(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class6 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		try {
			if (arg3.anInt422 == 0 && arg3.anIntArray97 != null && !arg3.aBoolean93 && (arg1 >= arg5 && arg0 >= arg2 && arg1 <= arg5 + arg3.anInt425 && arg0 <= arg2 + arg3.anInt426)) {
				@Pc(34) int local34 = arg3.anIntArray97.length;
				this.anInt393 += 0;
				for (@Pc(42) int local42 = 0; local42 < local34; local42++) {
					@Pc(51) int local51 = arg3.anIntArray98[local42] + arg5;
					@Pc(60) int local60 = arg3.anIntArray99[local42] + arg2 - arg4;
					@Pc(67) Class6 local67 = Class6.aClass6Array1[arg3.anIntArray97[local42]];
					@Pc(72) int local72 = local51 + local67.anInt427;
					@Pc(77) int local77 = local60 + local67.anInt428;
					if ((local67.anInt429 >= 0 || local67.anInt437 != 0) && arg1 >= local72 && arg0 >= local77 && arg1 < local72 + local67.anInt425 && arg0 < local77 + local67.anInt426) {
						if (local67.anInt429 >= 0) {
							this.anInt351 = local67.anInt429;
						} else {
							this.anInt351 = local67.anInt420;
						}
					}
					if (local67.anInt422 == 0) {
						this.method151(arg0, arg1, local77, local67, local67.anInt431, local72);
						if (local67.anInt430 > local67.anInt426) {
							this.method146(local67.anInt426, local67, arg0, local77, local72 + local67.anInt425, arg1, true, local67.anInt430);
						}
					} else {
						if (local67.anInt423 == 1 && arg1 >= local72 && arg0 >= local77 && arg1 < local72 + local67.anInt425 && arg0 < local77 + local67.anInt426) {
							@Pc(174) boolean local174 = false;
							if (local67.anInt424 != 0) {
								local174 = this.method106(local67);
							}
							if (!local174) {
								this.aStringArray6[this.anInt287] = local67.aString22;
								this.anIntArray85[this.anInt287] = 231;
								this.anIntArray84[this.anInt287] = local67.anInt420;
								this.anInt287++;
							}
						}
						if (local67.anInt423 == 2 && this.anInt381 == 0 && arg1 >= local72 && arg0 >= local77 && arg1 < local72 + local67.anInt425 && arg0 < local77 + local67.anInt426) {
							@Pc(238) String local238 = local67.aString20;
							if (local238.indexOf(" ") != -1) {
								local238 = local238.substring(0, local238.indexOf(" "));
							}
							this.aStringArray6[this.anInt287] = local238 + " @gre@" + local67.aString21;
							this.anIntArray85[this.anInt287] = 274;
							this.anIntArray84[this.anInt287] = local67.anInt420;
							this.anInt287++;
						}
						if (local67.anInt423 == 3 && arg1 >= local72 && arg0 >= local77 && arg1 < local72 + local67.anInt425 && arg0 < local77 + local67.anInt426) {
							this.aStringArray6[this.anInt287] = "Close";
							this.anIntArray85[this.anInt287] = 737;
							this.anIntArray84[this.anInt287] = local67.anInt420;
							this.anInt287++;
						}
						if (local67.anInt423 == 4 && arg1 >= local72 && arg0 >= local77 && arg1 < local72 + local67.anInt425 && arg0 < local77 + local67.anInt426) {
							this.aStringArray6[this.anInt287] = local67.aString22;
							this.anIntArray85[this.anInt287] = 435;
							this.anIntArray84[this.anInt287] = local67.anInt420;
							this.anInt287++;
						}
						if (local67.anInt423 == 5 && arg1 >= local72 && arg0 >= local77 && arg1 < local72 + local67.anInt425 && arg0 < local77 + local67.anInt426) {
							this.aStringArray6[this.anInt287] = local67.aString22;
							this.anIntArray85[this.anInt287] = 225;
							this.anIntArray84[this.anInt287] = local67.anInt420;
							this.anInt287++;
						}
						if (local67.anInt423 == 6 && !this.aBoolean80 && arg1 >= local72 && arg0 >= local77 && arg1 < local72 + local67.anInt425 && arg0 < local77 + local67.anInt426) {
							this.aStringArray6[this.anInt287] = local67.aString22;
							this.anIntArray85[this.anInt287] = 997;
							this.anIntArray84[this.anInt287] = local67.anInt420;
							this.anInt287++;
						}
						if (local67.anInt422 == 2) {
							@Pc(486) int local486 = 0;
							for (@Pc(488) int local488 = 0; local488 < local67.anInt426; local488++) {
								for (@Pc(492) int local492 = 0; local492 < local67.anInt425; local492++) {
									@Pc(503) int local503 = local72 + local492 * (local67.anInt433 + 32);
									@Pc(512) int local512 = local77 + local488 * (local67.anInt434 + 32);
									if (local486 < 20) {
										local503 += local67.anIntArray100[local486];
										local512 += local67.anIntArray101[local486];
									}
									if (arg1 >= local503 && arg0 >= local512 && arg1 < local503 + 32 && arg0 < local512 + 32) {
										this.anInt279 = local486;
										this.anInt280 = local67.anInt420;
										if (local67.anIntArray93[local486] > 0) {
											@Pc(565) Class15 local565 = Class15.method358(local67.anIntArray93[local486] - 1);
											if (this.anInt212 == 1 && local67.aBoolean96) {
												if (local67.anInt420 != this.anInt214 || local486 != this.anInt213) {
													this.aStringArray6[this.anInt287] = "Use " + this.aString5 + " with @lre@" + local565.aString25;
													this.anIntArray85[this.anInt287] = 398;
													this.anIntArray86[this.anInt287] = local565.anInt598;
													this.anIntArray83[this.anInt287] = local486;
													this.anIntArray84[this.anInt287] = local67.anInt420;
													this.anInt287++;
												}
											} else if (this.anInt381 != 1 || !local67.aBoolean96) {
												@Pc(702) int local702;
												if (local67.aBoolean96) {
													for (local702 = 4; local702 >= 3; local702--) {
														if (local565.aStringArray11 != null && local565.aStringArray11[local702] != null) {
															this.aStringArray6[this.anInt287] = local565.aStringArray11[local702] + " @lre@" + local565.aString25;
															if (local702 == 3) {
																this.anIntArray85[this.anInt287] = 681;
															}
															if (local702 == 4) {
																this.anIntArray85[this.anInt287] = 100;
															}
															this.anIntArray86[this.anInt287] = local565.anInt598;
															this.anIntArray83[this.anInt287] = local486;
															this.anIntArray84[this.anInt287] = local67.anInt420;
															this.anInt287++;
														} else if (local702 == 4) {
															this.aStringArray6[this.anInt287] = "Drop @lre@" + local565.aString25;
															this.anIntArray85[this.anInt287] = 100;
															this.anIntArray86[this.anInt287] = local565.anInt598;
															this.anIntArray83[this.anInt287] = local486;
															this.anIntArray84[this.anInt287] = local67.anInt420;
															this.anInt287++;
														}
													}
												}
												if (local67.aBoolean97) {
													this.aStringArray6[this.anInt287] = "Use @lre@" + local565.aString25;
													this.anIntArray85[this.anInt287] = 102;
													this.anIntArray86[this.anInt287] = local565.anInt598;
													this.anIntArray83[this.anInt287] = local486;
													this.anIntArray84[this.anInt287] = local67.anInt420;
													this.anInt287++;
												}
												if (local67.aBoolean96 && local565.aStringArray11 != null) {
													for (local702 = 2; local702 >= 0; local702--) {
														if (local565.aStringArray11[local702] != null) {
															this.aStringArray6[this.anInt287] = local565.aStringArray11[local702] + " @lre@" + local565.aString25;
															if (local702 == 0) {
																this.anIntArray85[this.anInt287] = 694;
															}
															if (local702 == 1) {
																this.anIntArray85[this.anInt287] = 962;
															}
															if (local702 == 2) {
																this.anIntArray85[this.anInt287] = 795;
															}
															this.anIntArray86[this.anInt287] = local565.anInt598;
															this.anIntArray83[this.anInt287] = local486;
															this.anIntArray84[this.anInt287] = local67.anInt420;
															this.anInt287++;
														}
													}
												}
												if (local67.aStringArray7 != null) {
													for (local702 = 4; local702 >= 0; local702--) {
														if (local67.aStringArray7[local702] != null) {
															this.aStringArray6[this.anInt287] = local67.aStringArray7[local702] + " @lre@" + local565.aString25;
															if (local702 == 0) {
																this.anIntArray85[this.anInt287] = 582;
															}
															if (local702 == 1) {
																this.anIntArray85[this.anInt287] = 113;
															}
															if (local702 == 2) {
																this.anIntArray85[this.anInt287] = 555;
															}
															if (local702 == 3) {
																this.anIntArray85[this.anInt287] = 331;
															}
															if (local702 == 4) {
																this.anIntArray85[this.anInt287] = 354;
															}
															this.anIntArray86[this.anInt287] = local565.anInt598;
															this.anIntArray83[this.anInt287] = local486;
															this.anIntArray84[this.anInt287] = local67.anInt420;
															this.anInt287++;
														}
													}
												}
												this.aStringArray6[this.anInt287] = "Examine @lre@" + local565.aString25;
												this.anIntArray85[this.anInt287] = 1328;
												this.anIntArray86[this.anInt287] = local565.anInt598;
												this.anIntArray83[this.anInt287] = local486;
												this.anIntArray84[this.anInt287] = local67.anInt420;
												this.anInt287++;
											} else if ((this.anInt383 & 0x10) == 16) {
												this.aStringArray6[this.anInt287] = this.aString17 + " @lre@" + local565.aString25;
												this.anIntArray85[this.anInt287] = 563;
												this.anIntArray86[this.anInt287] = local565.anInt598;
												this.anIntArray83[this.anInt287] = local486;
												this.anIntArray84[this.anInt287] = local67.anInt420;
												this.anInt287++;
											}
										}
									}
									local486++;
								}
							}
						}
					}
				}
			}
		} catch (@Pc(1132) RuntimeException local1132) {
			signlink.reporterror("12191, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + 0 + ", " + arg4 + ", " + arg5 + ", " + local1132.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "f", descriptor = "(Z)V")
	private void method152() {
		try {
			for (@Pc(16) Class1_Sub1_Sub1_Sub6 local16 = (Class1_Sub1_Sub1_Sub6) this.aClass29_1.method504(); local16 != null; local16 = (Class1_Sub1_Sub1_Sub6) this.aClass29_1.method506(this.aByte9)) {
				if (local16.anInt528 != this.anInt327 || local16.aBoolean133) {
					local16.method667();
				} else if (anInt207 >= local16.anInt527) {
					local16.method299(this.anInt286);
					if (local16.aBoolean133) {
						local16.method667();
					} else {
						this.aClass37_1.method534(local16.anInt531, local16, local16.anInt529, -1, local16.anInt530, (byte) 1, 60, 0, local16.anInt528, false);
					}
				}
			}
		} catch (@Pc(75) RuntimeException local75) {
			signlink.reporterror("24443, " + false + ", " + local75.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "r", descriptor = "(I)V")
	private void method153() {
		try {
			if (this.anInt397 > 0) {
				this.method162();
			} else {
				this.aClass35_14.method517(aBoolean59);
				this.aClass1_Sub1_Sub2_Sub4_2.method443(257, 144, 0, "Connection lost");
				this.aClass1_Sub1_Sub2_Sub4_2.method443(256, 143, 16777215, "Connection lost");
				this.anInt393 += 0;
				this.aClass1_Sub1_Sub2_Sub4_2.method443(257, 159, 0, "Please wait - attempting to reestablish");
				this.aClass1_Sub1_Sub2_Sub4_2.method443(256, 158, 16777215, "Please wait - attempting to reestablish");
				this.aClass35_14.method518(4, super.aGraphics2, 4);
				this.anInt314 = 0;
				this.anInt309 = 0;
				@Pc(65) Class8 local65 = this.aClass8_1;
				this.aBoolean51 = false;
				this.method130(this.aString14, this.aString15, true);
				if (!this.aBoolean51) {
					this.method162();
				}
				try {
					local65.method246();
				} catch (@Pc(85) Exception local85) {
				}
			}
		} catch (@Pc(87) RuntimeException local87) {
			signlink.reporterror("73592, " + 0 + ", " + local87.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "s", descriptor = "(I)Ljava/net/Socket;")
	public Socket method154(@OriginalArg(0) int arg0) throws IOException {
		return signlink.mainapp == null ? new Socket(InetAddress.getByName(this.getCodeBase().getHost()), arg0) : signlink.opensocket(arg0);
	}

	@OriginalMember(owner = "client!client", name = "run", descriptor = "()V")
	@Override
	public void run() {
		if (this.aBoolean83) {
			this.method167();
		} else {
			super.run();
		}
	}

	@OriginalMember(owner = "client!client", name = "u", descriptor = "(I)V")
	private void method156() {
		try {
			if (this.anInt333 != 0) {
				@Pc(6) Class1_Sub1_Sub2_Sub4 local6 = this.aClass1_Sub1_Sub2_Sub4_2;
				@Pc(12) int local12 = 0;
				if (this.anInt208 != 0) {
					local12 = 1;
				}
				for (@Pc(19) int local19 = 0; local19 < 100; local19++) {
					if (this.aStringArray4[local19] != null) {
						@Pc(31) int local31 = this.anIntArray49[local19];
						@Pc(36) String local36 = this.aStringArray3[local19];
						@Pc(38) byte local38 = 0;
						if (local36 != null && local36.startsWith("@cr1@")) {
							local36 = local36.substring(5);
							local38 = 1;
						}
						if (local36 != null && local36.startsWith("@cr2@")) {
							local36 = local36.substring(5);
							local38 = 2;
						}
						@Pc(89) int local89;
						if ((local31 == 3 || local31 == 7) && (local31 == 7 || this.anInt285 == 0 || this.anInt285 == 1 && this.method104(local36))) {
							local89 = 329 - local12 * 13;
							local6.method446(4, "From", 0, local89);
							local6.method446(4, "From", 65535, local89 - 1);
							@Pc(114) int local114 = local6.method445("From ") + 4;
							if (local38 == 1) {
								this.aClass1_Sub1_Sub2_Sub3Array1[0].method415(this.aByte14, local114, local89 - 12);
								local114 += 14;
							}
							if (local38 == 2) {
								this.aClass1_Sub1_Sub2_Sub3Array1[1].method415(this.aByte14, local114, local89 - 12);
								local114 += 14;
							}
							local6.method446(local114, local36 + ": " + this.aStringArray4[local19], 0, local89);
							local6.method446(local114, local36 + ": " + this.aStringArray4[local19], 65535, local89 - 1);
							local12++;
							if (local12 >= 5) {
								return;
							}
						}
						if (local31 == 5 && this.anInt285 < 2) {
							local89 = 329 - local12 * 13;
							local6.method446(4, this.aStringArray4[local19], 0, local89);
							local6.method446(4, this.aStringArray4[local19], 65535, local89 - 1);
							local12++;
							if (local12 >= 5) {
								return;
							}
						}
						if (local31 == 6 && this.anInt285 < 2) {
							local89 = 329 - local12 * 13;
							local6.method446(4, "To " + local36 + ": " + this.aStringArray4[local19], 0, local89);
							local6.method446(4, "To " + local36 + ": " + this.aStringArray4[local19], 65535, local89 - 1);
							local12++;
							if (local12 >= 5) {
								return;
							}
						}
					}
				}
			}
		} catch (@Pc(295) RuntimeException local295) {
			signlink.reporterror("22181, " + 3 + ", " + local295.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!lb;II)V")
	private void method157(@OriginalArg(0) Class1_Sub1_Sub3 arg0, @OriginalArg(2) int arg1) {
		try {
			for (@Pc(1) int local1 = 0; local1 < this.anInt349; local1++) {
				@Pc(8) int local8 = this.anIntArray77[local1];
				@Pc(13) Class1_Sub1_Sub1_Sub1_Sub1 local13 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local8];
				@Pc(16) int local16 = arg0.method473();
				if ((local16 & 0x80) == 128) {
					local16 += arg0.method473() << 8;
				}
				this.method183(local16, local8, local13, arg0);
			}
		} catch (@Pc(49) RuntimeException local49) {
			signlink.reporterror("73772, " + arg0 + ", " + -45473 + ", " + arg1 + ", " + local49.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Z[BI)V")
	private void method158(@OriginalArg(0) boolean arg0, @OriginalArg(1) byte[] arg1) {
		try {
			signlink.anInt941 = arg0 ? 1 : 0;
			signlink.midisave(arg1, arg1.length);
		} catch (@Pc(14) RuntimeException local14) {
			signlink.reporterror("68029, " + arg0 + ", " + arg1 + ", " + 7 + ", " + local14.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "v", descriptor = "(I)V")
	private void method160() {
		try {
			signlink.anInt941 = 0;
			signlink.midi = "stop";
		} catch (@Pc(13) RuntimeException local13) {
			signlink.reporterror("16998, " + 33993 + ", " + local13.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IZ)V")
	private void method161(@OriginalArg(0) int arg0) {
		try {
			@Pc(11) int[] local11 = this.aClass1_Sub1_Sub2_Sub2_5.anIntArray205;
			@Pc(14) int local14 = local11.length;
			for (@Pc(16) int local16 = 0; local16 < local14; local16++) {
				local11[local16] = 0;
			}
			@Pc(40) int local40;
			@Pc(42) int local42;
			for (@Pc(28) int local28 = 1; local28 < 103; local28++) {
				local40 = (103 - local28) * 512 * 4 + 24628;
				for (local42 = 1; local42 < 103; local42++) {
					if ((this.aByteArrayArrayArray7[arg0][local42][local28] & 0x18) == 0) {
						this.aClass37_1.method558(local11, local40, arg0, local42, local28);
					}
					if (arg0 < 3 && (this.aByteArrayArrayArray7[arg0 + 1][local42][local28] & 0x8) != 0) {
						this.aClass37_1.method558(local11, local40, arg0 + 1, local42, local28);
					}
					local40 += 4;
				}
			}
			local40 = ((int) (Math.random() * 20.0D) + 238 - 10 << 16) + ((int) (Math.random() * 20.0D) + 238 - 10 << 8) + (int) (Math.random() * 20.0D) + 238 - 10;
			local42 = (int) (Math.random() * 20.0D) + 238 - 10 << 16;
			this.aClass1_Sub1_Sub2_Sub2_5.method383(aBoolean59);
			@Pc(152) int local152;
			for (@Pc(148) int local148 = 1; local148 < 103; local148++) {
				for (local152 = 1; local152 < 103; local152++) {
					if ((this.aByteArrayArrayArray7[arg0][local152][local148] & 0x18) == 0) {
						this.method123(local152, local40, local148, local42, arg0);
					}
					if (arg0 < 3 && (this.aByteArrayArrayArray7[arg0 + 1][local152][local148] & 0x8) != 0) {
						this.method123(local152, local40, local148, local42, arg0 + 1);
					}
				}
			}
			this.aClass35_14.method517(aBoolean59);
			this.anInt290 = 0;
			for (local152 = 0; local152 < 104; local152++) {
				for (@Pc(220) int local220 = 0; local220 < 104; local220++) {
					@Pc(230) int local230 = this.aClass37_1.method552(this.anInt327, local152, local220);
					if (local230 != 0) {
						local230 = local230 >> 14 & 0x7FFF;
						@Pc(242) int local242 = Class9.method287(local230).anInt513;
						if (local242 >= 0) {
							@Pc(246) int local246 = local152;
							@Pc(248) int local248 = local220;
							if (local242 != 22 && local242 != 29 && local242 != 34 && local242 != 36 && local242 != 46 && local242 != 47 && local242 != 48) {
								@Pc(280) int[][] local280 = this.aClass19Array1[this.anInt327].anIntArrayArray18;
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
							this.aClass1_Sub1_Sub2_Sub2Array6[this.anInt290] = this.aClass1_Sub1_Sub2_Sub2Array4[local242];
							this.anIntArray56[this.anInt290] = local246;
							this.anIntArray57[this.anInt290] = local248;
							this.anInt290++;
						}
					}
				}
			}
			anInt294++;
			if (anInt294 > 112) {
				anInt294 = 0;
				this.aClass1_Sub1_Sub3_2.method462(52);
				this.aClass1_Sub1_Sub3_2.method463(50);
			}
		} catch (@Pc(437) RuntimeException local437) {
			signlink.reporterror("6305, " + arg0 + ", " + false + ", " + local437.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "g", descriptor = "(Z)V")
	private void method162() {
		try {
			try {
				if (this.aClass8_1 != null) {
					this.aClass8_1.method246();
				}
			} catch (@Pc(7) Exception local7) {
			}
			this.aClass8_1 = null;
			this.aBoolean51 = false;
			this.anInt299 = 0;
			this.aString14 = "";
			this.aString15 = "";
			this.method207();
			this.aClass37_1.method523();
			for (@Pc(34) int local34 = 0; local34 < 4; local34++) {
				this.aClass19Array1[local34].method417((byte) 5);
			}
			System.gc();
			this.method160();
			this.anInt313 = -1;
			this.anInt377 = -1;
			this.anInt269 = 0;
		} catch (@Pc(61) RuntimeException local61) {
			signlink.reporterror("52457, " + false + ", " + local61.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILclient!nb;)V")
	private void method163(@OriginalArg(1) Class1_Sub2 arg0) {
		try {
			@Pc(1) int local1 = 0;
			@Pc(3) int local3 = -1;
			@Pc(5) int local5 = 0;
			@Pc(7) int local7 = 0;
			if (arg0.anInt783 == 0) {
				local1 = this.aClass37_1.method549(arg0.anInt782, arg0.anInt784, arg0.anInt785);
			}
			if (arg0.anInt783 == 1) {
				local1 = this.aClass37_1.method550(arg0.anInt785, arg0.anInt784, arg0.anInt782, this.anInt298);
			}
			if (arg0.anInt783 == 2) {
				local1 = this.aClass37_1.method551(arg0.anInt782, arg0.anInt784, arg0.anInt785);
			}
			if (arg0.anInt783 == 3) {
				local1 = this.aClass37_1.method552(arg0.anInt782, arg0.anInt784, arg0.anInt785);
			}
			if (local1 != 0) {
				@Pc(77) int local77 = this.aClass37_1.method553(arg0.anInt782, arg0.anInt784, arg0.anInt785, local1);
				local3 = local1 >> 14 & 0x7FFF;
				local5 = local77 & 0x1F;
				local7 = local77 >> 6;
			}
			arg0.anInt786 = local3;
			arg0.anInt788 = local5;
			arg0.anInt787 = local7;
		} catch (@Pc(107) RuntimeException local107) {
			signlink.reporterror("92993, " + -452 + ", " + arg0 + ", " + local107.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/Runnable;I)V")
	@Override
	public void method94(@OriginalArg(0) Runnable arg0, @OriginalArg(1) int arg1) {
		if (arg1 > 10) {
			arg1 = 10;
		}
		if (signlink.mainapp == null) {
			super.method94(arg0, arg1);
		} else {
			signlink.startthread(arg0, arg1);
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIIIIIIII)V")
	private void method164(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		try {
			@Pc(1) Class1_Sub2 local1 = null;
			for (@Pc(17) Class1_Sub2 local17 = (Class1_Sub2) this.aClass29_3.method504(); local17 != null; local17 = (Class1_Sub2) this.aClass29_3.method506(this.aByte9)) {
				if (local17.anInt782 == arg3 && local17.anInt784 == arg5 && local17.anInt785 == arg0 && local17.anInt783 == arg6) {
					local1 = local17;
					break;
				}
			}
			if (local1 == null) {
				local1 = new Class1_Sub2();
				local1.anInt782 = arg3;
				local1.anInt783 = arg6;
				local1.anInt784 = arg5;
				local1.anInt785 = arg0;
				this.method163(local1);
				this.aClass29_3.method501(local1);
			}
			local1.anInt789 = arg2;
			local1.anInt791 = arg7;
			local1.anInt790 = arg4;
			local1.anInt792 = arg8;
			local1.anInt793 = arg1;
		} catch (@Pc(90) RuntimeException local90) {
			signlink.reporterror("91943, " + arg0 + ", " + 4823 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + local90.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "h", descriptor = "(Z)V")
	private void method165() {
		try {
			if (this.anInt333 != 0) {
				@Pc(7) int local7 = 0;
				if (this.anInt208 != 0) {
					local7 = 1;
				}
				for (@Pc(14) int local14 = 0; local14 < 100; local14++) {
					if (this.aStringArray4[local14] != null) {
						@Pc(26) int local26 = this.anIntArray49[local14];
						@Pc(31) String local31 = this.aStringArray3[local14];
						if (local31 != null && local31.startsWith("@cr1@")) {
							local31 = local31.substring(5);
						}
						if (local31 != null && local31.startsWith("@cr2@")) {
							local31 = local31.substring(5);
						}
						if ((local26 == 3 || local26 == 7) && (local26 == 7 || this.anInt285 == 0 || this.anInt285 == 1 && this.method104(local31))) {
							@Pc(84) int local84 = 329 - local7 * 13;
							if (super.anInt195 > 4 && super.anInt196 - 4 > local84 - 10 && super.anInt196 - 4 <= local84 + 3) {
								@Pc(123) int local123 = this.aClass1_Sub1_Sub2_Sub4_2.method445("From:  " + local31 + this.aStringArray4[local14]) + 25;
								if (local123 > 450) {
									local123 = 450;
								}
								if (super.anInt195 < local123 + 4) {
									if (this.anInt233 >= 1) {
										this.aStringArray6[this.anInt287] = "Report abuse @whi@" + local31;
										this.anIntArray85[this.anInt287] = 2524;
										this.anInt287++;
									}
									this.aStringArray6[this.anInt287] = "Add ignore @whi@" + local31;
									this.anIntArray85[this.anInt287] = 2047;
									this.anInt287++;
									this.aStringArray6[this.anInt287] = "Add friend @whi@" + local31;
									this.anIntArray85[this.anInt287] = 2605;
									this.anInt287++;
								}
							}
							local7++;
							if (local7 >= 5) {
								return;
							}
						}
						if ((local26 == 5 || local26 == 6) && this.anInt285 < 2) {
							local7++;
							if (local7 >= 5) {
								return;
							}
						}
					}
				}
			}
		} catch (@Pc(245) RuntimeException local245) {
			signlink.reporterror("38695, " + false + ", " + local245.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/String;)Ljava/io/DataInputStream;")
	private DataInputStream method166(@OriginalArg(0) String arg0) throws IOException {
		if (this.aBoolean69) {
			if (this.aSocket1 != null) {
				try {
					this.aSocket1.close();
				} catch (@Pc(26) Exception local26) {
				}
				this.aSocket1 = null;
			}
			this.aSocket1 = this.method154(43595);
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

	@OriginalMember(owner = "client!client", name = "w", descriptor = "(I)V")
	private void method167() {
		try {
			this.aBoolean62 = true;
			try {
				@Pc(9) long local9 = System.currentTimeMillis();
				@Pc(11) int local11 = 0;
				@Pc(13) int local13 = 20;
				while (this.aBoolean52) {
					this.anInt281++;
					this.method168();
					this.method168();
					this.method210();
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
			this.aBoolean62 = false;
		} catch (@Pc(74) RuntimeException local74) {
			signlink.reporterror("4965, " + -568 + ", " + local74.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "g", descriptor = "(B)V")
	private void method168() {
		try {
			if (this.aByte11 != 9) {
				for (@Pc(7) int local7 = 1; local7 > 0; local7++) {
				}
			}
			@Pc(23) int local23;
			for (@Pc(16) int local16 = 10; local16 < 117; local16++) {
				local23 = (int) (Math.random() * 100.0D);
				if (local23 < 50) {
					this.anIntArray53[local16 + 32512] = 255;
				}
			}
			@Pc(52) int local52;
			@Pc(59) int local59;
			@Pc(65) int local65;
			for (local23 = 0; local23 < 100; local23++) {
				local52 = (int) (Math.random() * 124.0D) + 2;
				local59 = (int) (Math.random() * 128.0D) + 128;
				local65 = local52 + (local59 << 7);
				this.anIntArray53[local65] = 192;
			}
			for (local52 = 1; local52 < 255; local52++) {
				for (local59 = 1; local59 < 127; local59++) {
					local65 = local59 + (local52 << 7);
					this.anIntArray54[local65] = (this.anIntArray53[local65 - 1] + this.anIntArray53[local65 + 1] + this.anIntArray53[local65 - 128] + this.anIntArray53[local65 + 128]) / 4;
				}
			}
			this.anInt328 += 128;
			if (this.anInt328 > this.anIntArray74.length) {
				this.anInt328 -= this.anIntArray74.length;
				local59 = (int) (Math.random() * 12.0D);
				this.method182(this.aClass1_Sub1_Sub2_Sub3Array4[local59]);
			}
			@Pc(177) int local177;
			for (local59 = 1; local59 < 255; local59++) {
				for (local65 = 1; local65 < 127; local65++) {
					local177 = local65 + (local59 << 7);
					@Pc(200) int local200 = this.anIntArray54[local177 + 128] - this.anIntArray74[local177 + this.anInt328 & this.anIntArray74.length - 1] / 5;
					if (local200 < 0) {
						local200 = 0;
					}
					this.anIntArray53[local177] = local200;
				}
			}
			for (local65 = 0; local65 < 255; local65++) {
				this.anIntArray43[local65] = this.anIntArray43[local65 + 1];
			}
			this.anIntArray43[255] = (int) (Math.sin((double) anInt207 / 14.0D) * 16.0D + Math.sin((double) anInt207 / 15.0D) * 14.0D + Math.sin((double) anInt207 / 16.0D) * 12.0D);
			if (this.anInt292 > 0) {
				this.anInt292 -= 4;
			}
			if (this.anInt293 > 0) {
				this.anInt293 -= 4;
			}
			if (this.anInt292 == 0 && this.anInt293 == 0) {
				local177 = (int) (Math.random() * 2000.0D);
				if (local177 == 0) {
					this.anInt292 = 1024;
				}
				if (local177 == 1) {
					this.anInt293 = 1024;
					return;
				}
			}
		} catch (@Pc(311) RuntimeException local311) {
			signlink.reporterror("88238, " + 9 + ", " + local311.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
	@Override
	public AppletContext getAppletContext() {
		return signlink.mainapp == null ? super.getAppletContext() : signlink.mainapp.getAppletContext();
	}

	@OriginalMember(owner = "client!client", name = "x", descriptor = "(I)V")
	private void method169() {
		try {
			@Pc(19) int local19;
			@Pc(26) int local26;
			if (this.anInt299 == 0) {
				local19 = super.anInt191 / 2 - 80;
				local26 = super.anInt192 / 2 + 20;
				local26 += 20;
				if (super.anInt200 == 1 && super.anInt201 >= local19 - 75 && super.anInt201 <= local19 + 75 && super.anInt202 >= local26 - 20 && super.anInt202 <= local26 + 20) {
					this.anInt299 = 3;
					this.anInt277 = 0;
				}
				local19 = super.anInt191 / 2 + 80;
				if (super.anInt200 == 1 && super.anInt201 >= local19 - 75 && super.anInt201 <= local19 + 75 && super.anInt202 >= local26 - 20 && super.anInt202 <= local26 + 20) {
					this.aString8 = "";
					this.aString9 = "Enter your username & password.";
					this.anInt299 = 2;
					this.anInt277 = 0;
				}
			} else if (this.anInt299 == 2) {
				local19 = super.anInt192 / 2 - 40;
				local19 += 30;
				local19 += 25;
				if (super.anInt200 == 1 && super.anInt202 >= local19 - 15 && super.anInt202 < local19) {
					this.anInt277 = 0;
				}
				local19 += 15;
				if (super.anInt200 == 1 && super.anInt202 >= local19 - 15 && super.anInt202 < local19) {
					this.anInt277 = 1;
				}
				local19 += 15;
				local26 = super.anInt191 / 2 - 80;
				@Pc(172) int local172 = super.anInt192 / 2 + 50;
				@Pc(173) int local173 = local172 + 20;
				if (super.anInt200 == 1 && super.anInt201 >= local26 - 75 && super.anInt201 <= local26 + 75 && super.anInt202 >= local173 - 20 && super.anInt202 <= local173 + 20) {
					this.method130(this.aString14, this.aString15, false);
					if (this.aBoolean51) {
						return;
					}
				}
				local26 = super.anInt191 / 2 + 80;
				if (super.anInt200 == 1 && super.anInt201 >= local26 - 75 && super.anInt201 <= local26 + 75 && super.anInt202 >= local173 - 20 && super.anInt202 <= local173 + 20) {
					this.anInt299 = 0;
					this.aString14 = "";
					this.aString15 = "";
				}
				while (true) {
					while (true) {
						@Pc(260) int local260 = this.method87();
						if (local260 == -1) {
							return;
						}
						@Pc(265) boolean local265 = false;
						for (@Pc(267) int local267 = 0; local267 < aString4.length(); local267++) {
							if (local260 == aString4.charAt(local267)) {
								local265 = true;
								break;
							}
						}
						if (this.anInt277 == 0) {
							if (local260 == 8 && this.aString14.length() > 0) {
								this.aString14 = this.aString14.substring(0, this.aString14.length() - 1);
							}
							if (local260 == 9 || local260 == 10 || local260 == 13) {
								this.anInt277 = 1;
							}
							if (local265) {
								this.aString14 = this.aString14 + (char) local260;
							}
							if (this.aString14.length() > 12) {
								this.aString14 = this.aString14.substring(0, 12);
							}
						} else if (this.anInt277 == 1) {
							if (local260 == 8 && this.aString15.length() > 0) {
								this.aString15 = this.aString15.substring(0, this.aString15.length() - 1);
							}
							if (local260 == 9 || local260 == 10 || local260 == 13) {
								this.anInt277 = 0;
							}
							if (local265) {
								this.aString15 = this.aString15 + (char) local260;
							}
							if (this.aString15.length() > 20) {
								this.aString15 = this.aString15.substring(0, 20);
							}
						}
					}
				}
			} else if (this.anInt299 == 3) {
				local19 = super.anInt191 / 2;
				local26 = super.anInt192 / 2 + 50;
				@Pc(424) int local424 = local26 + 20;
				if (super.anInt200 == 1 && super.anInt201 >= local19 - 75 && super.anInt201 <= local19 + 75 && super.anInt202 >= local424 - 20 && super.anInt202 <= local424 + 20) {
					this.anInt299 = 0;
					return;
				}
			}
		} catch (@Pc(457) RuntimeException local457) {
			signlink.reporterror("31563, " + 3 + ", " + local457.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIILclient!ib;)V")
	private void method170(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class1_Sub1_Sub2_Sub2 arg2) {
		try {
			@Pc(20) int local20 = arg0 * arg0 + arg1 * arg1;
			if (local20 > 4225 && local20 < 90000) {
				@Pc(34) int local34 = this.anInt386 + this.anInt391 & 0x7FF;
				@Pc(38) int local38 = Class1_Sub1_Sub1_Sub5.anIntArray150[local34];
				@Pc(42) int local42 = Class1_Sub1_Sub1_Sub5.anIntArray151[local34];
				@Pc(51) int local51 = local38 * 256 / (this.anInt371 + 256);
				@Pc(60) int local60 = local42 * 256 / (this.anInt371 + 256);
				@Pc(70) int local70 = arg1 * local51 + arg0 * local60 >> 16;
				@Pc(80) int local80 = arg1 * local60 - arg0 * local51 >> 16;
				@Pc(86) double local86 = Math.atan2((double) local70, (double) local80);
				@Pc(92) int local92 = (int) (Math.sin(local86) * 63.0D);
				@Pc(98) int local98 = (int) (Math.cos(local86) * 57.0D);
				this.aClass1_Sub1_Sub2_Sub2_9.method393(local92 + 94 + 4 - 10, 83 - local98 - 20, local86);
			} else {
				this.method115(arg1, arg0, arg2);
			}
		} catch (@Pc(129) RuntimeException local129) {
			signlink.reporterror("45184, " + arg0 + ", " + arg1 + ", " + 4 + ", " + arg2 + ", " + local129.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "h", descriptor = "(B)V")
	private void method171(@OriginalArg(0) byte arg0) {
		try {
			@Pc(6) boolean local6 = false;
			for (@Pc(20) Class1_Sub2 local20 = (Class1_Sub2) this.aClass29_3.method504(); local20 != null; local20 = (Class1_Sub2) this.aClass29_3.method506(this.aByte9)) {
				if (local20.anInt793 == -1) {
					local20.anInt792 = 0;
					this.method163(local20);
				} else {
					local20.method667();
				}
			}
		} catch (@Pc(48) RuntimeException local48) {
			signlink.reporterror("99864, " + arg0 + ", " + local48.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
	@Override
	public String getParameter(@OriginalArg(0) String arg0) {
		return signlink.mainapp == null ? super.getParameter(arg0) : signlink.mainapp.getParameter(arg0);
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IZI)V")
	private void method172(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		try {
			@Pc(1) int local1 = 0;
			for (@Pc(3) int local3 = 0; local3 < 100; local3++) {
				if (this.aStringArray4[local3] != null) {
					@Pc(15) int local15 = this.anIntArray49[local3];
					@Pc(26) int local26 = this.anInt335 + 70 + 4 - local1 * 14;
					if (local26 < -20) {
						break;
					}
					@Pc(34) String local34 = this.aStringArray3[local3];
					if (local34 != null && local34.startsWith("@cr1@")) {
						local34 = local34.substring(5);
					}
					if (local34 != null && local34.startsWith("@cr2@")) {
						local34 = local34.substring(5);
					}
					if (local15 == 0) {
						local1++;
					}
					if ((local15 == 1 || local15 == 2) && (local15 == 1 || this.anInt282 == 0 || this.anInt282 == 1 && this.method104(local34))) {
						if (arg1 > local26 - 14 && arg1 <= local26 && !local34.equals(aClass1_Sub1_Sub1_Sub1_Sub1_1.aString3)) {
							if (this.anInt233 >= 1) {
								this.aStringArray6[this.anInt287] = "Report abuse @whi@" + local34;
								this.anIntArray85[this.anInt287] = 524;
								this.anInt287++;
							}
							this.aStringArray6[this.anInt287] = "Add ignore @whi@" + local34;
							this.anIntArray85[this.anInt287] = 47;
							this.anInt287++;
							this.aStringArray6[this.anInt287] = "Add friend @whi@" + local34;
							this.anIntArray85[this.anInt287] = 605;
							this.anInt287++;
						}
						local1++;
					}
					if ((local15 == 3 || local15 == 7) && this.anInt333 == 0 && (local15 == 7 || this.anInt285 == 0 || this.anInt285 == 1 && this.method104(local34))) {
						if (arg1 > local26 - 14 && arg1 <= local26) {
							if (this.anInt233 >= 1) {
								this.aStringArray6[this.anInt287] = "Report abuse @whi@" + local34;
								this.anIntArray85[this.anInt287] = 524;
								this.anInt287++;
							}
							this.aStringArray6[this.anInt287] = "Add ignore @whi@" + local34;
							this.anIntArray85[this.anInt287] = 47;
							this.anInt287++;
							this.aStringArray6[this.anInt287] = "Add friend @whi@" + local34;
							this.anIntArray85[this.anInt287] = 605;
							this.anInt287++;
						}
						local1++;
					}
					if (local15 == 4 && (this.anInt209 == 0 || this.anInt209 == 1 && this.method104(local34))) {
						if (arg1 > local26 - 14 && arg1 <= local26) {
							this.aStringArray6[this.anInt287] = "Accept trade @whi@" + local34;
							this.anIntArray85[this.anInt287] = 507;
							this.anInt287++;
						}
						local1++;
					}
					if ((local15 == 5 || local15 == 6) && this.anInt333 == 0 && this.anInt285 < 2) {
						local1++;
					}
					if (local15 == 8 && (this.anInt209 == 0 || this.anInt209 == 1 && this.method104(local34))) {
						if (arg1 > local26 - 14 && arg1 <= local26) {
							this.aStringArray6[this.anInt287] = "Accept duel @whi@" + local34;
							this.anIntArray85[this.anInt287] = 957;
							this.anInt287++;
						}
						local1++;
					}
				}
			}
		} catch (@Pc(404) RuntimeException local404) {
			signlink.reporterror("55144, " + arg0 + ", " + true + ", " + arg1 + ", " + local404.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "y", descriptor = "(I)V")
	private void method173() {
		try {
			this.aClass1_Sub1_Sub2_Sub3_19 = new Class1_Sub1_Sub2_Sub3(this.aClass47_1, "titlebox", 0);
			this.aClass1_Sub1_Sub2_Sub3_20 = new Class1_Sub1_Sub2_Sub3(this.aClass47_1, "titlebutton", 0);
			this.aClass1_Sub1_Sub2_Sub3Array4 = new Class1_Sub1_Sub2_Sub3[12];
			@Pc(25) int local25 = 0;
			try {
				local25 = Integer.parseInt(this.getParameter("fl_icon"));
			} catch (@Pc(32) Exception local32) {
			}
			@Pc(36) int local36;
			if (local25 == 0) {
				for (local36 = 0; local36 < 12; local36++) {
					this.aClass1_Sub1_Sub2_Sub3Array4[local36] = new Class1_Sub1_Sub2_Sub3(this.aClass47_1, "runes", local36);
				}
			} else {
				for (local36 = 0; local36 < 12; local36++) {
					this.aClass1_Sub1_Sub2_Sub3Array4[local36] = new Class1_Sub1_Sub2_Sub3(this.aClass47_1, "runes", (local36 & 0x3) + 12);
				}
			}
			this.aClass1_Sub1_Sub2_Sub2_1 = new Class1_Sub1_Sub2_Sub2(128, 265);
			this.aClass1_Sub1_Sub2_Sub2_2 = new Class1_Sub1_Sub2_Sub2(128, 265);
			for (local36 = 0; local36 < 33920; local36++) {
				this.aClass1_Sub1_Sub2_Sub2_1.anIntArray205[local36] = this.aClass35_22.anIntArray228[local36];
			}
			for (@Pc(120) int local120 = 0; local120 < 33920; local120++) {
				this.aClass1_Sub1_Sub2_Sub2_2.anIntArray205[local120] = this.aClass35_23.anIntArray228[local120];
			}
			this.anIntArray46 = new int[256];
			for (@Pc(142) int local142 = 0; local142 < 64; local142++) {
				this.anIntArray46[local142] = local142 * 262144;
			}
			for (@Pc(157) int local157 = 0; local157 < 64; local157++) {
				this.anIntArray46[local157 + 64] = local157 * 1024 + 16711680;
			}
			for (@Pc(176) int local176 = 0; local176 < 64; local176++) {
				this.anIntArray46[local176 + 128] = local176 * 4 + 16776960;
			}
			for (@Pc(195) int local195 = 0; local195 < 64; local195++) {
				this.anIntArray46[local195 + 192] = 16777215;
			}
			this.anIntArray47 = new int[256];
			for (@Pc(214) int local214 = 0; local214 < 64; local214++) {
				this.anIntArray47[local214] = local214 * 1024;
			}
			for (@Pc(229) int local229 = 0; local229 < 64; local229++) {
				this.anIntArray47[local229 + 64] = local229 * 4 + 65280;
			}
			for (@Pc(248) int local248 = 0; local248 < 64; local248++) {
				this.anIntArray47[local248 + 128] = local248 * 262144 + 65535;
			}
			for (@Pc(267) int local267 = 0; local267 < 64; local267++) {
				this.anIntArray47[local267 + 192] = 16777215;
			}
			this.anIntArray48 = new int[256];
			for (@Pc(286) int local286 = 0; local286 < 64; local286++) {
				this.anIntArray48[local286] = local286 * 4;
			}
			for (@Pc(301) int local301 = 0; local301 < 64; local301++) {
				this.anIntArray48[local301 + 64] = local301 * 262144 + 255;
			}
			for (@Pc(320) int local320 = 0; local320 < 64; local320++) {
				this.anIntArray48[local320 + 128] = local320 * 1024 + 16711935;
			}
			for (@Pc(339) int local339 = 0; local339 < 64; local339++) {
				this.anIntArray48[local339 + 192] = 16777215;
			}
			this.anIntArray45 = new int[256];
			this.anIntArray74 = new int[32768];
			this.anIntArray75 = new int[32768];
			this.method182(null);
			this.anIntArray53 = new int[32768];
			this.anIntArray54 = new int[32768];
			this.method95("Connecting to fileserver", 10);
			if (!this.aBoolean52) {
				this.aBoolean83 = true;
				this.aBoolean52 = true;
				this.method94(this, 2);
			}
		} catch (@Pc(396) RuntimeException local396) {
			signlink.reporterror("15306, " + 4 + ", " + local396.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "z", descriptor = "(I)V")
	private void method174(@OriginalArg(0) int arg0) {
		try {
			if (this.aClass35_15 == null) {
				this.method196();
				super.aClass35_2 = null;
				this.aClass35_19 = null;
				this.aClass35_20 = null;
				this.aClass35_21 = null;
				this.aClass35_22 = null;
				this.aClass35_23 = null;
				@Pc(28) boolean local28 = false;
				this.aClass35_24 = null;
				this.aClass35_25 = null;
				this.aClass35_26 = null;
				this.aClass35_27 = null;
				this.aClass35_15 = new Class35(96, anInt273, 479, this.method93(aByte17));
				this.aClass35_13 = new Class35(156, anInt273, 172, this.method93(aByte17));
				Class1_Sub1_Sub2.method434();
				this.aClass1_Sub1_Sub2_Sub3_12.method415(this.aByte14, 0, 0);
				this.aClass35_12 = new Class35(261, anInt273, 190, this.method93(aByte17));
				this.aClass35_14 = new Class35(334, anInt273, 512, this.method93(aByte17));
				Class1_Sub1_Sub2.method434();
				this.aClass35_16 = new Class35(50, anInt273, 496, this.method93(aByte17));
				this.aClass35_17 = new Class35(37, anInt273, 269, this.method93(aByte17));
				this.aClass35_18 = new Class35(45, anInt273, 249, this.method93(aByte17));
				this.aBoolean53 = true;
			}
		} catch (@Pc(133) RuntimeException local133) {
			signlink.reporterror("44370, " + arg0 + ", " + local133.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "A", descriptor = "(I)Ljava/lang/String;")
	private String method175(@OriginalArg(0) int arg0) {
		try {
			@Pc(3) boolean local3 = false;
			if (signlink.mainapp == null) {
				return super.aFrame_Sub1_2 == null ? super.getDocumentBase().getHost().toLowerCase() : "runescape.com";
			} else {
				return signlink.mainapp.getDocumentBase().getHost().toLowerCase();
			}
		} catch (@Pc(21) RuntimeException local21) {
			signlink.reporterror("66853, " + arg0 + ", " + local21.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(ILclient!lb;I)V")
	private void method176(@OriginalArg(1) Class1_Sub1_Sub3 arg0, @OriginalArg(2) int arg1) {
		try {
			@Pc(6) int local6 = arg0.method484(8);
			@Pc(10) int local10 = arg1 + 0;
			@Pc(16) int local16;
			if (local6 < this.anInt348) {
				for (local16 = local6; local16 < this.anInt348; local16++) {
					this.anIntArray61[this.anInt329++] = this.anIntArray76[local16];
				}
			}
			if (local6 > this.anInt348) {
				signlink.reporterror(this.aString14 + " Too many players");
				throw new RuntimeException("eek");
			}
			this.anInt348 = 0;
			for (local16 = 0; local16 < local6; local16++) {
				@Pc(68) int local68 = this.anIntArray76[local16];
				@Pc(73) Class1_Sub1_Sub1_Sub1_Sub1 local73 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local68];
				@Pc(78) int local78 = arg0.method484(1);
				if (local78 == 0) {
					this.anIntArray76[this.anInt348++] = local68;
					local73.anInt1030 = anInt207;
				} else {
					@Pc(101) int local101 = arg0.method484(2);
					if (local101 == 0) {
						this.anIntArray76[this.anInt348++] = local68;
						local73.anInt1030 = anInt207;
						this.anIntArray77[this.anInt349++] = local68;
					} else {
						@Pc(152) int local152;
						@Pc(162) int local162;
						if (local101 == 1) {
							this.anIntArray76[this.anInt348++] = local68;
							local73.anInt1030 = anInt207;
							local152 = arg0.method484(3);
							local73.method672(local152, false);
							local162 = arg0.method484(1);
							if (local162 == 1) {
								this.anIntArray77[this.anInt349++] = local68;
							}
						} else if (local101 == 2) {
							this.anIntArray76[this.anInt348++] = local68;
							local73.anInt1030 = anInt207;
							local152 = arg0.method484(3);
							local73.method672(local152, true);
							local162 = arg0.method484(3);
							local73.method672(local162, true);
							@Pc(220) int local220 = arg0.method484(1);
							if (local220 == 1) {
								this.anIntArray77[this.anInt349++] = local68;
							}
						} else if (local101 == 3) {
							this.anIntArray61[this.anInt329++] = local68;
						}
					}
				}
			}
		} catch (@Pc(257) RuntimeException local257) {
			signlink.reporterror("65852, " + 0 + ", " + arg0 + ", " + arg1 + ", " + local257.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "B", descriptor = "(I)V")
	private void method177() {
		try {
			@Pc(7) int local7 = this.aClass1_Sub1_Sub2_Sub4_3.method445("Choose Option");
			@Pc(20) int local20;
			for (@Pc(9) int local9 = 0; local9 < this.anInt287; local9++) {
				local20 = this.aClass1_Sub1_Sub2_Sub4_3.method445(this.aStringArray6[local9]);
				if (local20 > local7) {
					local7 = local20;
				}
			}
			local7 += 8;
			this.anInt393 += 0;
			local20 = this.anInt287 * 15 + 21;
			@Pc(69) int local69;
			@Pc(87) int local87;
			if (super.anInt201 > 4 && super.anInt202 > 4 && super.anInt201 < 516 && super.anInt202 < 338) {
				local69 = super.anInt201 - local7 / 2 - 4;
				if (local69 + local7 > 512) {
					local69 = 512 - local7;
				}
				if (local69 < 0) {
					local69 = 0;
				}
				local87 = super.anInt202 - 4;
				if (local87 + local20 > 334) {
					local87 = 334 - local20;
				}
				if (local87 < 0) {
					local87 = 0;
				}
				this.aBoolean47 = true;
				this.anInt411 = 0;
				this.anInt412 = local69;
				this.anInt413 = local87;
				this.anInt414 = local7;
				this.anInt415 = this.anInt287 * 15 + 22;
			}
			if (super.anInt201 > 553 && super.anInt202 > 205 && super.anInt201 < 743 && super.anInt202 < 466) {
				local69 = super.anInt201 - local7 / 2 - 553;
				if (local69 < 0) {
					local69 = 0;
				} else if (local69 + local7 > 190) {
					local69 = 190 - local7;
				}
				local87 = super.anInt202 - 205;
				if (local87 < 0) {
					local87 = 0;
				} else if (local87 + local20 > 261) {
					local87 = 261 - local20;
				}
				this.aBoolean47 = true;
				this.anInt411 = 1;
				this.anInt412 = local69;
				this.anInt413 = local87;
				this.anInt414 = local7;
				this.anInt415 = this.anInt287 * 15 + 22;
			}
			if (super.anInt201 > 17 && super.anInt202 > 357 && super.anInt201 < 496 && super.anInt202 < 453) {
				local69 = super.anInt201 - local7 / 2 - 17;
				if (local69 < 0) {
					local69 = 0;
				} else if (local69 + local7 > 479) {
					local69 = 479 - local7;
				}
				local87 = super.anInt202 - 357;
				if (local87 < 0) {
					local87 = 0;
				} else if (local87 + local20 > 96) {
					local87 = 96 - local20;
				}
				this.aBoolean47 = true;
				this.anInt411 = 2;
				this.anInt412 = local69;
				this.anInt413 = local87;
				this.anInt414 = local7;
				this.anInt415 = this.anInt287 * 15 + 22;
			}
		} catch (@Pc(291) RuntimeException local291) {
			signlink.reporterror("93761, " + 0 + ", " + local291.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(JZ)V")
	private void method178(@OriginalArg(0) long arg0) {
		try {
			if (arg0 != 0L) {
				if (this.anInt278 >= 100) {
					this.method131(0, "", "Your ignore list is full. Max of 100 hit");
				} else {
					@Pc(23) String local23 = Class48.method664(Class48.method661(arg0));
					for (@Pc(35) int local35 = 0; local35 < this.anInt278; local35++) {
						if (this.aLongArray3[local35] == arg0) {
							this.method131(0, "", local23 + " is already on your ignore list");
							return;
						}
					}
					for (@Pc(65) int local65 = 0; local65 < this.anInt344; local65++) {
						if (this.aLongArray4[local65] == arg0) {
							this.method131(0, "", "Please remove " + local23 + " from your friend list first");
							return;
						}
					}
					this.aLongArray3[this.anInt278++] = arg0;
					this.aBoolean55 = true;
					this.aClass1_Sub1_Sub3_2.method462(255);
					this.aClass1_Sub1_Sub3_2.method469(arg0);
				}
			}
		} catch (@Pc(120) RuntimeException local120) {
			signlink.reporterror("75400, " + arg0 + ", " + false + ", " + local120.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "init", descriptor = "()V")
	@Override
	public void init() {
		anInt404 = Integer.parseInt(this.getParameter("nodeid"));
		anInt405 = Integer.parseInt(this.getParameter("portoff"));
		@Pc(15) String local15 = this.getParameter("lowmem");
		if (local15 != null && local15.equals("1")) {
			method136();
		} else {
			method155();
		}
		@Pc(31) String local31 = this.getParameter("free");
		if (local31 != null && local31.equals("1")) {
			aBoolean86 = false;
		} else {
			aBoolean86 = true;
		}
		this.method84();
	}

	@OriginalMember(owner = "client!client", name = "i", descriptor = "(Z)V")
	private void method180() {
		try {
			this.aClass35_12.method517(aBoolean59);
			Class1_Sub1_Sub2_Sub1.anIntArray177 = this.anIntArray89;
			this.aClass1_Sub1_Sub2_Sub3_11.method415(this.aByte14, 0, 0);
			if (this.anInt390 != -1) {
				this.method209(0, Class6.aClass6Array1[this.anInt390], 0, 0);
			} else if (this.anIntArray50[this.anInt304] != -1) {
				this.method209(0, Class6.aClass6Array1[this.anIntArray50[this.anInt304]], 0, 0);
			}
			if (this.aBoolean47 && this.anInt411 == 1) {
				this.method97();
			}
			this.aClass35_12.method518(553, super.aGraphics2, 205);
			this.aClass35_14.method517(aBoolean59);
			Class1_Sub1_Sub2_Sub1.anIntArray177 = this.anIntArray90;
		} catch (@Pc(87) RuntimeException local87) {
			signlink.reporterror("60902, " + true + ", " + local87.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IBLclient!lb;)V")
	private void method181(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub1_Sub3 arg1) {
		try {
			for (@Pc(3) int local3 = 0; local3 < this.anInt349; local3++) {
				@Pc(10) int local10 = this.anIntArray77[local3];
				@Pc(15) Class1_Sub1_Sub1_Sub1_Sub2 local15 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local10];
				@Pc(18) int local18 = arg1.method473();
				@Pc(26) int local26;
				@Pc(29) int local29;
				if ((local18 & 0x1) == 1) {
					local26 = arg1.method473();
					local29 = arg1.method473();
					local15.method675(anInt207, local26, local29);
					local15.anInt1004 = anInt207 + 300;
					local15.anInt1005 = arg1.method473();
					local15.anInt1006 = arg1.method473();
				}
				if ((local18 & 0x2) == 2) {
					local26 = arg1.method475();
					if (local26 == 65535) {
						local26 = -1;
					}
					if (local26 == local15.anInt1013) {
						local15.anInt1017 = 0;
					}
					local29 = arg1.method473();
					if (local26 == local15.anInt1013 && local26 != -1) {
						@Pc(83) int local83 = Class27.aClass27Array1[local26].anInt803;
						if (local83 == 1) {
							local15.anInt1014 = 0;
							local15.anInt1015 = 0;
							local15.anInt1016 = local29;
							local15.anInt1017 = 0;
						}
						if (local83 == 2) {
							local15.anInt1017 = 0;
						}
					} else if (local26 == -1 || local15.anInt1013 == -1 || Class27.aClass27Array1[local26].anInt797 >= Class27.aClass27Array1[local15.anInt1013].anInt797) {
						local15.anInt1013 = local26;
						local15.anInt1014 = 0;
						local15.anInt1015 = 0;
						local15.anInt1016 = local29;
						local15.anInt1017 = 0;
						local15.anInt1036 = local15.anInt1034;
					}
				}
				if ((local18 & 0x4) == 4) {
					local15.anInt1007 = arg1.method475();
					if (local15.anInt1007 == 65535) {
						local15.anInt1007 = -1;
					}
				}
				if ((local18 & 0x8) == 8) {
					local15.aString31 = arg1.method480();
					local15.anInt1001 = 100;
				}
				if ((local18 & 0x10) == 16) {
					local26 = arg1.method473();
					local29 = arg1.method473();
					local15.method675(anInt207, local26, local29);
					local15.anInt1004 = anInt207 + 300;
					local15.anInt1005 = arg1.method473();
					local15.anInt1006 = arg1.method473();
				}
				if ((local18 & 0x20) == 32) {
					local15.aClass13_2 = Class13.method321(arg1.method475());
					local15.anInt993 = local15.aClass13_2.aByte26;
					local15.anInt1033 = local15.aClass13_2.anInt567;
					local15.anInt996 = local15.aClass13_2.anInt554;
					local15.anInt997 = local15.aClass13_2.anInt555;
					local15.anInt998 = local15.aClass13_2.anInt556;
					local15.anInt999 = local15.aClass13_2.anInt557;
					local15.anInt994 = local15.aClass13_2.anInt553;
				}
				if ((local18 & 0x40) == 64) {
					local15.anInt1018 = arg1.method475();
					local26 = arg1.method478();
					local15.anInt1022 = local26 >> 16;
					local15.anInt1021 = anInt207 + (local26 & 0xFFFF);
					local15.anInt1019 = 0;
					local15.anInt1020 = 0;
					if (local15.anInt1021 > anInt207) {
						local15.anInt1019 = -1;
					}
					if (local15.anInt1018 == 65535) {
						local15.anInt1018 = -1;
					}
				}
				if ((local18 & 0x80) == 128) {
					local15.anInt1008 = arg1.method475();
					local15.anInt1009 = arg1.method475();
				}
			}
		} catch (@Pc(315) RuntimeException local315) {
			signlink.reporterror("928, " + arg0 + ", " + 4 + ", " + arg1 + ", " + local315.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILclient!jb;)V")
	private void method182(@OriginalArg(1) Class1_Sub1_Sub2_Sub3 arg0) {
		try {
			for (@Pc(12) int local12 = 0; local12 < this.anIntArray74.length; local12++) {
				this.anIntArray74[local12] = 0;
			}
			@Pc(37) int local37;
			for (@Pc(27) int local27 = 0; local27 < 5000; local27++) {
				local37 = (int) (Math.random() * 128.0D * (double) 256);
				this.anIntArray74[local37] = (int) (Math.random() * 256.0D);
			}
			@Pc(55) int local55;
			@Pc(59) int local59;
			@Pc(67) int local67;
			for (local37 = 0; local37 < 20; local37++) {
				for (local55 = 1; local55 < 255; local55++) {
					for (local59 = 1; local59 < 127; local59++) {
						local67 = local59 + (local55 << 7);
						this.anIntArray75[local67] = (this.anIntArray74[local67 - 1] + this.anIntArray74[local67 + 1] + this.anIntArray74[local67 - 128] + this.anIntArray74[local67 + 128]) / 4;
					}
				}
				@Pc(113) int[] local113 = this.anIntArray74;
				this.anIntArray74 = this.anIntArray75;
				this.anIntArray75 = local113;
			}
			if (arg0 != null) {
				local55 = 0;
				for (local59 = 0; local59 < arg0.anInt675; local59++) {
					for (local67 = 0; local67 < arg0.anInt674; local67++) {
						if (arg0.aByteArray7[local55++] != 0) {
							@Pc(149) int local149 = local67 + arg0.anInt676 + 16;
							@Pc(156) int local156 = local59 + arg0.anInt677 + 16;
							@Pc(162) int local162 = local149 + (local156 << 7);
							this.anIntArray74[local162] = 0;
						}
					}
				}
			}
		} catch (@Pc(179) RuntimeException local179) {
			signlink.reporterror("8954, " + 512 + ", " + arg0 + ", " + local179.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIBLclient!ab;Lclient!lb;)V")
	private void method183(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class1_Sub1_Sub1_Sub1_Sub1 arg2, @OriginalArg(4) Class1_Sub1_Sub3 arg3) {
		try {
			if (this.aByte6 == 3) {
				@Pc(14) int local14;
				if ((arg0 & 0x1) == 1) {
					local14 = arg3.method473();
					@Pc(17) byte[] local17 = new byte[local14];
					@Pc(23) Class1_Sub1_Sub3 local23 = new Class1_Sub1_Sub3(local17, (byte) 1);
					arg3.method482(local14, local17);
					this.aClass1_Sub1_Sub3Array1[arg1] = local23;
					arg2.method39(local23, this.anInt206);
				}
				@Pc(62) int local62;
				@Pc(74) int local74;
				if ((arg0 & 0x2) == 2) {
					local14 = arg3.method475();
					if (local14 == 65535) {
						local14 = -1;
					}
					if (local14 == arg2.anInt1013) {
						arg2.anInt1017 = 0;
					}
					local62 = arg3.method473();
					if (local14 == arg2.anInt1013 && local14 != -1) {
						local74 = Class27.aClass27Array1[local14].anInt803;
						if (local74 == 1) {
							arg2.anInt1014 = 0;
							arg2.anInt1015 = 0;
							arg2.anInt1016 = local62;
							arg2.anInt1017 = 0;
						}
						if (local74 == 2) {
							arg2.anInt1017 = 0;
						}
					} else if (local14 == -1 || arg2.anInt1013 == -1 || Class27.aClass27Array1[local14].anInt797 >= Class27.aClass27Array1[arg2.anInt1013].anInt797) {
						arg2.anInt1013 = local14;
						arg2.anInt1014 = 0;
						arg2.anInt1015 = 0;
						arg2.anInt1016 = local62;
						arg2.anInt1017 = 0;
						arg2.anInt1036 = arg2.anInt1034;
					}
				}
				if ((arg0 & 0x4) == 4) {
					arg2.anInt1007 = arg3.method475();
					if (arg2.anInt1007 == 65535) {
						arg2.anInt1007 = -1;
					}
				}
				if ((arg0 & 0x8) == 8) {
					arg2.aString31 = arg3.method480();
					arg2.anInt1002 = 0;
					arg2.anInt1003 = 0;
					arg2.anInt1001 = 150;
					this.method131(2, arg2.aString3, arg2.aString31);
				}
				if ((arg0 & 0x10) == 16) {
					local14 = arg3.method473();
					local62 = arg3.method473();
					arg2.method675(anInt207, local14, local62);
					arg2.anInt1004 = anInt207 + 300;
					arg2.anInt1005 = arg3.method473();
					arg2.anInt1006 = arg3.method473();
				}
				if ((arg0 & 0x20) == 32) {
					arg2.anInt1008 = arg3.method475();
					arg2.anInt1009 = arg3.method475();
				}
				if ((arg0 & 0x40) == 64) {
					local14 = arg3.method475();
					local62 = arg3.method473();
					local74 = arg3.method473();
					@Pc(235) int local235 = arg3.anInt743;
					if (arg2.aString3 != null && arg2.aBoolean23) {
						@Pc(245) long local245 = Class48.method660(arg2.aString3);
						@Pc(247) boolean local247 = false;
						if (local62 <= 1) {
							for (@Pc(252) int local252 = 0; local252 < this.anInt278; local252++) {
								if (this.aLongArray3[local252] == local245) {
									local247 = true;
									break;
								}
							}
						}
						if (!local247 && this.anInt246 == 0) {
							try {
								@Pc(280) String local280 = Class49.method677((byte) 8, local74, arg3);
								@Pc(284) String local284 = Class42.method597(local280);
								arg2.aString31 = local284;
								arg2.anInt1002 = local14 >> 8;
								arg2.anInt1003 = local14 & 0xFF;
								arg2.anInt1001 = 150;
								if (local62 == 2 || local62 == 3) {
									this.method131(1, "@cr2@" + arg2.aString3, local284);
								} else if (local62 == 1) {
									this.method131(1, "@cr1@" + arg2.aString3, local284);
								} else {
									this.method131(2, arg2.aString3, local284);
								}
							} catch (@Pc(348) Exception local348) {
								signlink.reporterror("cde2");
							}
						}
					}
					arg3.anInt743 = local235 + local74;
				}
				if ((arg0 & 0x100) == 256) {
					arg2.anInt1018 = arg3.method475();
					local14 = arg3.method478();
					arg2.anInt1022 = local14 >> 16;
					arg2.anInt1021 = anInt207 + (local14 & 0xFFFF);
					arg2.anInt1019 = 0;
					arg2.anInt1020 = 0;
					if (arg2.anInt1021 > anInt207) {
						arg2.anInt1019 = -1;
					}
					if (arg2.anInt1018 == 65535) {
						arg2.anInt1018 = -1;
					}
				}
				if ((arg0 & 0x200) == 512) {
					arg2.anInt1023 = arg3.method473();
					arg2.anInt1025 = arg3.method473();
					arg2.anInt1024 = arg3.method473();
					arg2.anInt1026 = arg3.method473();
					arg2.anInt1027 = arg3.method475() + anInt207;
					arg2.anInt1028 = arg3.method475() + anInt207;
					arg2.anInt1029 = arg3.method473();
					arg2.method673();
				}
				if ((arg0 & 0x400) == 1024) {
					local14 = arg3.method473();
					local62 = arg3.method473();
					arg2.method675(anInt207, local14, local62);
					arg2.anInt1004 = anInt207 + 300;
					arg2.anInt1005 = arg3.method473();
					arg2.anInt1006 = arg3.method473();
				}
			}
		} catch (@Pc(472) RuntimeException local472) {
			signlink.reporterror("70312, " + arg0 + ", " + arg1 + ", " + 3 + ", " + arg2 + ", " + arg3 + ", " + local472.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(IJ)V")
	private void method184(@OriginalArg(0) int arg0, @OriginalArg(1) long arg1) {
		try {
			if (arg1 != 0L) {
				if (this.anInt344 >= 100 && this.anInt211 != 1) {
					this.method131(0, "", "Your friendlist is full. Max of 100 for free users, and 200 for members");
				} else if (this.anInt344 >= 200) {
					this.method131(0, "", "Your friendlist is full. Max of 100 for free users, and 200 for members");
				} else {
					@Pc(38) String local38 = Class48.method664(Class48.method661(arg1));
					for (@Pc(40) int local40 = 0; local40 < this.anInt344; local40++) {
						if (this.aLongArray4[local40] == arg1) {
							this.method131(0, "", local38 + " is already on your friend list");
							return;
						}
					}
					@Pc(72) boolean local72 = false;
					for (@Pc(74) int local74 = 0; local74 < this.anInt278; local74++) {
						if (this.aLongArray3[local74] == arg1) {
							this.method131(0, "", "Please remove " + local38 + " from your ignore list first");
							return;
						}
					}
					if (!local38.equals(aClass1_Sub1_Sub1_Sub1_Sub1_1.aString3)) {
						this.aStringArray2[this.anInt344] = local38;
						this.aLongArray4[this.anInt344] = arg1;
						this.anIntArray63[this.anInt344] = 0;
						this.anInt344++;
						this.aBoolean55 = true;
						this.aClass1_Sub1_Sub3_2.method462(13);
						this.aClass1_Sub1_Sub3_2.method469(arg1);
					}
				}
			}
		} catch (@Pc(148) RuntimeException local148) {
			signlink.reporterror("75126, " + arg0 + ", " + arg1 + ", " + local148.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Z)V")
	@Override
	protected void method91() {
		try {
			if (this.aBoolean68 || this.aBoolean82 || this.aBoolean49) {
				this.method190();
			} else {
				anInt227++;
				if (this.aBoolean51) {
					this.method224();
				} else {
					this.method135(false);
				}
				this.anInt291 = 0;
			}
		} catch (@Pc(44) RuntimeException local44) {
			signlink.reporterror("99413, " + true + ", " + local44.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "i", descriptor = "(B)V")
	private void method185(@OriginalArg(0) byte arg0) {
		try {
			this.aClass35_13.method517(aBoolean59);
			@Pc(18) int local18;
			@Pc(20) int local20;
			if (this.anInt314 == 2) {
				@Pc(13) byte[] local13 = this.aClass1_Sub1_Sub2_Sub3_12.aByteArray7;
				@Pc(15) int[] local15 = Class1_Sub1_Sub2.anIntArray210;
				local18 = local13.length;
				for (local20 = 0; local20 < local18; local20++) {
					if (local13[local20] == 0) {
						local15[local20] = 0;
					}
				}
				this.aClass1_Sub1_Sub2_Sub2_8.method392(256, 25, 33, 33, 0, this.anIntArray60, 25, this.anIntArray40, this.anInt386, 0);
				this.aClass35_14.method517(aBoolean59);
			} else {
				@Pc(64) int local64 = this.anInt386 + this.anInt391 & 0x7FF;
				@Pc(71) int local71 = aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt990 / 32 + 48;
				local18 = 464 - aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt991 / 32;
				this.aClass1_Sub1_Sub2_Sub2_5.method392(this.anInt371 + 256, local71, 146, 151, 25, this.anIntArray80, local18, this.anIntArray79, local64, 5);
				if (this.aByte5 == 5) {
					@Pc(103) boolean local103 = false;
					this.aClass1_Sub1_Sub2_Sub2_8.method392(256, 25, 33, 33, 0, this.anIntArray60, 25, this.anIntArray40, this.anInt386, 0);
					for (local20 = 0; local20 < this.anInt290; local20++) {
						local71 = this.anIntArray56[local20] * 4 + 2 - aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt990 / 32;
						local18 = this.anIntArray57[local20] * 4 + 2 - aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt991 / 32;
						this.method115(local18, local71, this.aClass1_Sub1_Sub2_Sub2Array6[local20]);
					}
					@Pc(175) int local175;
					for (@Pc(171) int local171 = 0; local171 < 104; local171++) {
						for (local175 = 0; local175 < 104; local175++) {
							@Pc(187) Class29 local187 = this.aClass29ArrayArrayArray1[this.anInt327][local171][local175];
							if (local187 != null) {
								local71 = local171 * 4 + 2 - aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt990 / 32;
								local18 = local175 * 4 + 2 - aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt991 / 32;
								this.method115(local18, local71, this.aClass1_Sub1_Sub2_Sub2_10);
							}
						}
					}
					for (local175 = 0; local175 < this.anInt416; local175++) {
						@Pc(238) Class1_Sub1_Sub1_Sub1_Sub2 local238 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[this.anIntArray92[local175]];
						if (local238 != null && local238.method674() && local238.aClass13_2.aBoolean140) {
							local71 = local238.anInt990 / 32 - aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt990 / 32;
							local18 = local238.anInt991 / 32 - aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt991 / 32;
							this.method115(local18, local71, this.aClass1_Sub1_Sub2_Sub2_11);
						}
					}
					@Pc(292) Class1_Sub1_Sub1_Sub1_Sub1 local292;
					for (@Pc(282) int local282 = 0; local282 < this.anInt348; local282++) {
						local292 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[this.anIntArray76[local282]];
						if (local292 != null && local292.method674()) {
							local71 = local292.anInt990 / 32 - aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt990 / 32;
							local18 = local292.anInt991 / 32 - aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt991 / 32;
							@Pc(320) boolean local320 = false;
							@Pc(324) long local324 = Class48.method660(local292.aString3);
							for (@Pc(326) int local326 = 0; local326 < this.anInt344; local326++) {
								if (local324 == this.aLongArray4[local326] && this.anIntArray63[local326] != 0) {
									local320 = true;
									break;
								}
							}
							if (local320) {
								this.method115(local18, local71, this.aClass1_Sub1_Sub2_Sub2_13);
							} else {
								this.method115(local18, local71, this.aClass1_Sub1_Sub2_Sub2_12);
							}
						}
					}
					if (this.anInt384 != 0 && anInt207 % 20 < 10) {
						if (this.anInt384 == 1 && this.anInt264 >= 0 && this.anInt264 < this.aClass1_Sub1_Sub1_Sub1_Sub2Array1.length) {
							@Pc(399) Class1_Sub1_Sub1_Sub1_Sub2 local399 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[this.anInt264];
							if (local399 != null) {
								local71 = local399.anInt990 / 32 - aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt990 / 32;
								local18 = local399.anInt991 / 32 - aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt991 / 32;
								this.method170(local71, local18, this.aClass1_Sub1_Sub2_Sub2_4);
							}
						}
						if (this.anInt384 == 2) {
							local71 = (this.anInt366 - this.anInt322) * 4 + 2 - aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt990 / 32;
							local18 = (this.anInt367 - this.anInt323) * 4 + 2 - aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt991 / 32;
							this.method170(local71, local18, this.aClass1_Sub1_Sub2_Sub2_4);
						}
						if (this.anInt384 == 10 && this.anInt376 >= 0 && this.anInt376 < this.aClass1_Sub1_Sub1_Sub1_Sub1Array1.length) {
							local292 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[this.anInt376];
							if (local292 != null) {
								local71 = local292.anInt990 / 32 - aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt990 / 32;
								local18 = local292.anInt991 / 32 - aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt991 / 32;
								this.method170(local71, local18, this.aClass1_Sub1_Sub2_Sub2_4);
							}
						}
					}
					if (this.anInt309 != 0) {
						local71 = this.anInt309 * 4 + 2 - aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt990 / 32;
						local18 = this.anInt310 * 4 + 2 - aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt991 / 32;
						this.method115(local18, local71, this.aClass1_Sub1_Sub2_Sub2_3);
					}
					Class1_Sub1_Sub2.method436(3, 16777215, 3, 97, 78);
					this.aClass35_14.method517(aBoolean59);
				}
			}
		} catch (@Pc(564) RuntimeException local564) {
			signlink.reporterror("787, " + arg0 + ", " + local564.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "j", descriptor = "(Z)V")
	private void method186() {
		try {
			for (@Pc(3) int local3 = -1; local3 < this.anInt348; local3++) {
				@Pc(11) int local11;
				if (local3 == -1) {
					local11 = this.anInt347;
				} else {
					local11 = this.anIntArray76[local3];
				}
				@Pc(23) Class1_Sub1_Sub1_Sub1_Sub1 local23 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local11];
				if (local23 != null) {
					this.method218(local23, 1);
				}
			}
			this.aBoolean51 &= true;
		} catch (@Pc(43) RuntimeException local43) {
			signlink.reporterror("50831, " + true + ", " + local43.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(IZ)V")
	private void method187(@OriginalArg(1) boolean arg0) {
		try {
			if (aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt990 >> 7 == this.anInt309 && aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt991 >> 7 == this.anInt310) {
				this.anInt309 = 0;
				anInt288++;
				if (anInt288 > 122) {
					anInt288 = 0;
					this.aClass1_Sub1_Sub3_2.method462(188);
					this.aClass1_Sub1_Sub3_2.method463(62);
				}
			}
			@Pc(39) int local39 = this.anInt348;
			if (arg0) {
				local39 = 1;
			}
			for (@Pc(48) int local48 = 0; local48 < local39; local48++) {
				@Pc(54) Class1_Sub1_Sub1_Sub1_Sub1 local54;
				@Pc(59) int local59;
				if (arg0) {
					local54 = aClass1_Sub1_Sub1_Sub1_Sub1_1;
					local59 = this.anInt347 << 14;
				} else {
					local54 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[this.anIntArray76[local48]];
					local59 = this.anIntArray76[local48] << 14;
				}
				if (local54 != null && local54.method674()) {
					local54.aBoolean24 = false;
					if ((aBoolean87 && this.anInt348 > 50 || this.anInt348 > 200) && !arg0 && local54.anInt1010 == local54.anInt994) {
						local54.aBoolean24 = true;
					}
					@Pc(110) int local110 = local54.anInt990 >> 7;
					@Pc(115) int local115 = local54.anInt991 >> 7;
					if (local110 >= 0 && local110 < 104 && local115 >= 0 && local115 < 104) {
						if (local54.aClass1_Sub1_Sub1_Sub5_1 == null || anInt207 < local54.anInt134 || anInt207 >= local54.anInt135) {
							if ((local54.anInt990 & 0x7F) == 64 && (local54.anInt991 & 0x7F) == 64) {
								if (this.anIntArrayArray4[local110][local115] == this.anInt234) {
									continue;
								}
								this.anIntArrayArray4[local110][local115] = this.anInt234;
							}
							local54.anInt133 = this.method132(local54.anInt990, local54.anInt991, this.anInt327);
							this.aClass37_1.method534(local54.anInt133, local54, local54.anInt990, local59, local54.anInt991, (byte) 1, 60, local54.anInt992, this.anInt327, local54.aBoolean241);
						} else {
							local54.aBoolean24 = false;
							local54.anInt133 = this.method132(local54.anInt990, local54.anInt991, this.anInt327);
							this.aClass37_1.method535(local54.anInt142, local54.anInt992, local54.anInt141, local54.anInt133, local54.anInt139, local54.anInt990, this.anInt327, local54, local54.anInt991, local54.anInt140, local59);
						}
					}
				}
			}
		} catch (@Pc(244) RuntimeException local244) {
			signlink.reporterror("56012, " + 0 + ", " + arg0 + ", " + local244.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "C", descriptor = "(I)V")
	private void method188() {
		try {
			this.aBoolean60 = true;
			for (@Pc(13) int local13 = 0; local13 < 7; local13++) {
				this.anIntArray33[local13] = -1;
				for (@Pc(22) int local22 = 0; local22 < Class23.anInt749; local22++) {
					if (!Class23.aClass23Array1[local22].aBoolean187 && Class23.aClass23Array1[local22].anInt750 == local13 + (this.aBoolean63 ? 0 : 7)) {
						this.anIntArray33[local13] = local22;
						break;
					}
				}
			}
		} catch (@Pc(59) RuntimeException local59) {
			signlink.reporterror("70490, " + 814 + ", " + local59.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "D", descriptor = "(I)V")
	private void method189() {
		try {
			this.anInt246 = 0;
			@Pc(10) int local10 = (aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt990 >> 7) + this.anInt322;
			@Pc(18) int local18 = (aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt991 >> 7) + this.anInt323;
			if (local10 >= 3053 && local10 <= 3156 && local18 >= 3056 && local18 <= 3136) {
				this.anInt246 = 1;
			}
			if (local10 >= 3072 && local10 <= 3118 && local18 >= 9492 && local18 <= 9535) {
				this.anInt246 = 1;
			}
			if (this.anInt246 == 1 && local10 >= 3139 && local10 <= 3199 && local18 >= 3008 && local18 <= 3062) {
				this.anInt246 = 0;
			}
		} catch (@Pc(76) RuntimeException local76) {
			signlink.reporterror("1811, " + 940 + ", " + local76.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "E", descriptor = "(I)V")
	private void method190() {
		try {
			@Pc(11) Graphics local11 = this.method93(aByte17).getGraphics();
			local11.setColor(Color.black);
			local11.fillRect(0, 0, 765, 503);
			this.method86();
			@Pc(43) byte local43;
			@Pc(49) int local49;
			if (this.aBoolean82) {
				this.aBoolean52 = false;
				local11.setFont(new Font("Helvetica", 1, 16));
				local11.setColor(Color.yellow);
				local43 = 35;
				local11.drawString("Sorry, an error has occured whilst loading RuneScape", 30, 35);
				local49 = local43 + 50;
				local11.setColor(Color.white);
				local11.drawString("To fix this try the following (in order):", 30, 85);
				@Pc(58) int local58 = local49 + 50;
				local11.setColor(Color.white);
				local11.setFont(new Font("Helvetica", 1, 12));
				local11.drawString("1: Try closing ALL open web-browser windows, and reloading", 30, 135);
				@Pc(75) int local75 = local58 + 30;
				local11.drawString("2: Try clearing your web-browsers cache from tools->internet options", 30, 165);
				@Pc(81) int local81 = local75 + 30;
				local11.drawString("3: Try using a different game-world", 30, 195);
				@Pc(87) int local87 = local81 + 30;
				local11.drawString("4: Try rebooting your computer", 30, 225);
				@Pc(93) int local93 = local87 + 30;
				local11.drawString("5: Try selecting a different version of Java from the play-game menu", 30, 255);
			}
			if (this.aBoolean49) {
				this.aBoolean52 = false;
				local11.setFont(new Font("Helvetica", 1, 20));
				local11.setColor(Color.white);
				local11.drawString("Error - unable to load game!", 50, 50);
				local11.drawString("To play RuneScape make sure you play from", 50, 100);
				local11.drawString("http://www.runescape.com", 50, 150);
			}
			if (this.aBoolean68) {
				this.aBoolean52 = false;
				local11.setColor(Color.yellow);
				local43 = 35;
				local11.drawString("Error a copy of RuneScape already appears to be loaded", 30, 35);
				local49 = local43 + 50;
				local11.setColor(Color.white);
				local11.drawString("To fix this try the following (in order):", 30, 85);
				local49 += 50;
				local11.setColor(Color.white);
				local11.setFont(new Font("Helvetica", 1, 12));
				local11.drawString("1: Try closing ALL open web-browser windows, and reloading", 30, 135);
				local49 += 30;
				local11.drawString("2: Try rebooting your computer, and reloading", 30, 165);
				local49 += 30;
			}
		} catch (@Pc(181) RuntimeException local181) {
			signlink.reporterror("50758, " + 15447 + ", " + local181.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(IZI)V")
	private void method191(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1) {
		try {
			this.anInt393 += 0;
			signlink.anInt940 = arg1;
			if (arg0) {
				signlink.midi = "voladjust";
			}
		} catch (@Pc(13) RuntimeException local13) {
			signlink.reporterror("76771, " + 0 + ", " + arg0 + ", " + arg1 + ", " + local13.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(IBLclient!lb;)V")
	private void method193(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub1_Sub3 arg1) {
		try {
			this.anInt329 = 0;
			this.anInt349 = 0;
			this.method201(arg1, arg0);
			this.method176(arg1, arg0);
			this.method227(arg1, arg0, this.anInt210);
			this.method157(arg1, arg0);
			if (this.aByte16 == -44) {
				@Pc(42) int local42;
				for (@Pc(35) int local35 = 0; local35 < this.anInt329; local35++) {
					local42 = this.anIntArray61[local35];
					if (this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local42].anInt1030 != anInt207) {
						this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local42] = null;
					}
				}
				if (arg1.anInt743 != arg0) {
					signlink.reporterror("Error packet size mismatch in getplayer pos:" + arg1.anInt743 + " psize:" + arg0);
					throw new RuntimeException("eek");
				}
				for (local42 = 0; local42 < this.anInt348; local42++) {
					if (this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[this.anIntArray76[local42]] == null) {
						signlink.reporterror(this.aString14 + " null entry in pl list - pos:" + local42 + " size:" + this.anInt348);
						throw new RuntimeException("eek");
					}
				}
			}
		} catch (@Pc(122) RuntimeException local122) {
			signlink.reporterror("11944, " + arg0 + ", " + -44 + ", " + arg1 + ", " + local122.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "F", descriptor = "(I)Z")
	private boolean method194() {
		try {
			if (this.aClass8_1 == null) {
				return false;
			}
			@Pc(1196) String local1196;
			@Pc(257) int local257;
			try {
				@Pc(16) int local16 = this.aClass8_1.method248();
				if (local16 == 0) {
					return false;
				}
				if (this.anInt394 == -1) {
					this.aClass8_1.method249(this.aClass1_Sub1_Sub3_4.aByteArray9, 0, 1);
					this.anInt394 = this.aClass1_Sub1_Sub3_4.aByteArray9[0] & 0xFF;
					if (this.aClass46_1 != null) {
						this.anInt394 = this.anInt394 - this.aClass46_1.method655() & 0xFF;
					}
					this.anInt393 = Class17.anIntArray207[this.anInt394];
					local16--;
				}
				if (this.anInt393 == -1) {
					if (local16 <= 0) {
						return false;
					}
					this.aClass8_1.method249(this.aClass1_Sub1_Sub3_4.aByteArray9, 0, 1);
					this.anInt393 = this.aClass1_Sub1_Sub3_4.aByteArray9[0] & 0xFF;
					local16--;
				}
				if (this.anInt393 == -2) {
					if (local16 <= 1) {
						return false;
					}
					this.aClass8_1.method249(this.aClass1_Sub1_Sub3_4.aByteArray9, 0, 2);
					this.aClass1_Sub1_Sub3_4.anInt743 = 0;
					this.anInt393 = this.aClass1_Sub1_Sub3_4.method475();
					local16 -= 2;
				}
				if (local16 < this.anInt393) {
					return false;
				}
				this.aClass1_Sub1_Sub3_4.anInt743 = 0;
				this.aClass8_1.method249(this.aClass1_Sub1_Sub3_4.aByteArray9, 0, this.anInt393);
				this.anInt395 = 0;
				this.anInt358 = this.anInt357;
				this.anInt357 = this.anInt356;
				this.anInt356 = this.anInt394;
				if (this.anInt394 == 207) {
					this.anInt216 = this.aClass1_Sub1_Sub3_4.method473();
					this.anInt394 = -1;
					return true;
				}
				if (this.anInt394 == 241) {
					this.anInt304 = this.aClass1_Sub1_Sub3_4.method473();
					this.aBoolean55 = true;
					this.aBoolean46 = true;
					this.anInt394 = -1;
					return true;
				}
				@Pc(194) int local194;
				if (this.anInt394 == 203) {
					local194 = this.aClass1_Sub1_Sub3_4.method475();
					@Pc(198) byte local198 = this.aClass1_Sub1_Sub3_4.method474();
					this.anIntArray82[local194] = local198;
					if (this.anIntArray73[local194] != local198) {
						this.anIntArray73[local194] = local198;
						this.method122(local194);
						this.aBoolean55 = true;
						if (this.anInt342 != -1) {
							this.aBoolean73 = true;
						}
					}
					this.anInt394 = -1;
					return true;
				}
				if (this.anInt394 == 115) {
					this.anInt309 = 0;
					this.anInt394 = -1;
					return true;
				}
				@Pc(261) int local261;
				@Pc(265) int local265;
				if (this.anInt394 == 64) {
					local194 = this.aClass1_Sub1_Sub3_4.method473();
					local257 = this.aClass1_Sub1_Sub3_4.method473();
					local261 = this.aClass1_Sub1_Sub3_4.method473();
					local265 = this.aClass1_Sub1_Sub3_4.method473();
					this.aBooleanArray4[local194] = true;
					this.anIntArray58[local194] = local257;
					this.anIntArray44[local194] = local261;
					this.anIntArray39[local194] = local265;
					this.anIntArray51[local194] = 0;
					this.anInt394 = -1;
					return true;
				}
				if (this.anInt394 == 95 || this.anInt394 == 176 || this.anInt394 == 219 || this.anInt394 == 85 || this.anInt394 == 107 || this.anInt394 == 52 || this.anInt394 == 81 || this.anInt394 == 48 || this.anInt394 == 173 || this.anInt394 == 138) {
					this.method149(this.anInt394, 220, this.aClass1_Sub1_Sub3_4);
					this.anInt394 = -1;
					return true;
				}
				if (this.anInt394 == 211) {
					local194 = this.aClass1_Sub1_Sub3_4.method475();
					this.method110(local194);
					if (this.anInt390 != -1) {
						this.anInt390 = -1;
						this.aBoolean55 = true;
						this.aBoolean46 = true;
					}
					if (this.anInt303 != -1) {
						this.anInt303 = -1;
						this.aBoolean73 = true;
					}
					if (this.aBoolean72) {
						this.aBoolean72 = false;
						this.aBoolean73 = true;
					}
					this.anInt317 = local194;
					this.aBoolean80 = false;
					this.anInt394 = -1;
					return true;
				}
				if (this.anInt394 == 192) {
					local194 = this.aClass1_Sub1_Sub3_4.method475();
					Class6.aClass6Array1[local194].anInt439 = 3;
					Class6.aClass6Array1[local194].anInt440 = (aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray14[0] << 24) + (aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray14[4] << 18) + (aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray13[0] << 12) + (aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray13[8] << 6) + aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray13[11];
					this.anInt394 = -1;
					return true;
				}
				if (this.anInt394 == 210) {
					this.aBoolean90 = false;
					this.aBoolean72 = true;
					this.aString16 = "";
					this.aBoolean73 = true;
					this.anInt394 = -1;
					return true;
				}
				if (this.anInt394 == 130) {
					local194 = this.aClass1_Sub1_Sub3_4.method476();
					this.anInt342 = local194;
					this.aBoolean73 = true;
					this.anInt394 = -1;
					return true;
				}
				if (this.anInt394 == 167) {
					this.method193(this.anInt393, this.aClass1_Sub1_Sub3_4);
					this.aBoolean88 = false;
					this.anInt394 = -1;
					return true;
				}
				if (this.anInt394 == 34) {
					local194 = this.aClass1_Sub1_Sub3_4.method475();
					local257 = this.aClass1_Sub1_Sub3_4.method473();
					local261 = this.aClass1_Sub1_Sub3_4.method475();
					if (this.aBoolean71 && !aBoolean87 && this.anInt270 < 50) {
						this.anIntArray59[this.anInt270] = local194;
						this.anIntArray31[this.anInt270] = local257;
						this.anIntArray64[this.anInt270] = local261 + Class5.anIntArray28[local194];
						this.anInt270++;
					}
					this.anInt394 = -1;
					return true;
				}
				if (this.anInt394 == 91) {
					this.anInt284 = this.aClass1_Sub1_Sub3_4.method478();
					this.anInt302 = this.aClass1_Sub1_Sub3_4.method475();
					this.anInt312 = this.aClass1_Sub1_Sub3_4.method473();
					this.anInt243 = this.aClass1_Sub1_Sub3_4.method475();
					this.anInt339 = this.aClass1_Sub1_Sub3_4.method473();
					if (this.anInt284 != 0 && this.anInt317 == -1) {
						signlink.dnslookup(Class48.method663(this.anInt284));
						this.method127();
						@Pc(619) short local619 = 650;
						if (this.anInt312 != 201 || this.anInt339 == 1) {
							local619 = 655;
						}
						this.aString10 = "";
						this.aBoolean74 = false;
						for (local257 = 0; local257 < Class6.aClass6Array1.length; local257++) {
							if (Class6.aClass6Array1[local257] != null && Class6.aClass6Array1[local257].anInt424 == local619) {
								this.anInt317 = Class6.aClass6Array1[local257].anInt421;
								break;
							}
						}
					}
					this.anInt394 = -1;
					return true;
				}
				if (this.anInt394 == 88) {
					this.method162();
					this.anInt394 = -1;
					return false;
				}
				@Pc(695) Class6 local695;
				if (this.anInt394 == 134) {
					local194 = this.aClass1_Sub1_Sub3_4.method475();
					local257 = this.aClass1_Sub1_Sub3_4.method476();
					local695 = Class6.aClass6Array1[local194];
					local695.anInt443 = local257;
					if (local257 == -1) {
						local695.anInt418 = 0;
						local695.anInt419 = 0;
					}
					this.anInt394 = -1;
					return true;
				}
				if (this.anInt394 == 156) {
					this.anInt384 = this.aClass1_Sub1_Sub3_4.method473();
					if (this.anInt384 == 1) {
						this.anInt264 = this.aClass1_Sub1_Sub3_4.method475();
					}
					if (this.anInt384 >= 2 && this.anInt384 <= 6) {
						if (this.anInt384 == 2) {
							this.anInt369 = 64;
							this.anInt370 = 64;
						}
						if (this.anInt384 == 3) {
							this.anInt369 = 0;
							this.anInt370 = 64;
						}
						if (this.anInt384 == 4) {
							this.anInt369 = 128;
							this.anInt370 = 64;
						}
						if (this.anInt384 == 5) {
							this.anInt369 = 64;
							this.anInt370 = 0;
						}
						if (this.anInt384 == 6) {
							this.anInt369 = 64;
							this.anInt370 = 128;
						}
						this.anInt384 = 2;
						this.anInt366 = this.aClass1_Sub1_Sub3_4.method475();
						this.anInt367 = this.aClass1_Sub1_Sub3_4.method475();
						this.anInt368 = this.aClass1_Sub1_Sub3_4.method473();
					}
					if (this.anInt384 == 10) {
						this.anInt376 = this.aClass1_Sub1_Sub3_4.method475();
					}
					this.anInt394 = -1;
					return true;
				}
				if (this.anInt394 == 67) {
					if (this.anInt304 == 12) {
						this.aBoolean55 = true;
					}
					this.anInt265 = this.aClass1_Sub1_Sub3_4.method476();
					this.anInt394 = -1;
					return true;
				}
				if (this.anInt394 == 3) {
					this.anInt278 = this.anInt393 / 8;
					for (local194 = 0; local194 < this.anInt278; local194++) {
						this.aLongArray3[local194] = this.aClass1_Sub1_Sub3_4.method479();
					}
					this.anInt394 = -1;
					return true;
				}
				if (this.anInt394 == 142) {
					local194 = this.aClass1_Sub1_Sub3_4.method475();
					local257 = this.aClass1_Sub1_Sub3_4.method475();
					Class6.aClass6Array1[local194].anInt439 = 2;
					Class6.aClass6Array1[local194].anInt440 = local257;
					this.anInt394 = -1;
					return true;
				}
				if (this.anInt394 == 215) {
					local194 = this.aClass1_Sub1_Sub3_4.method475();
					local257 = this.aClass1_Sub1_Sub3_4.method473();
					if (local194 == 65535) {
						local194 = -1;
					}
					this.anIntArray50[local257] = local194;
					this.aBoolean55 = true;
					this.aBoolean46 = true;
					this.anInt394 = -1;
					return true;
				}
				if (this.anInt394 == 153) {
					this.anInt262 = this.aClass1_Sub1_Sub3_4.method473();
					this.anInt263 = this.aClass1_Sub1_Sub3_4.method473();
					for (local194 = this.anInt262; local194 < this.anInt262 + 8; local194++) {
						for (local257 = this.anInt263; local257 < this.anInt263 + 8; local257++) {
							if (this.aClass29ArrayArrayArray1[this.anInt327][local194][local257] != null) {
								this.aClass29ArrayArrayArray1[this.anInt327][local194][local257] = null;
								this.method134(local194, local257);
							}
						}
					}
					for (@Pc(1000) Class1_Sub2 local1000 = (Class1_Sub2) this.aClass29_3.method504(); local1000 != null; local1000 = (Class1_Sub2) this.aClass29_3.method506(this.aByte9)) {
						if (local1000.anInt784 >= this.anInt262 && local1000.anInt784 < this.anInt262 + 8 && local1000.anInt785 >= this.anInt263 && local1000.anInt785 < this.anInt263 + 8 && local1000.anInt782 == this.anInt327) {
							local1000.anInt793 = 0;
						}
					}
					this.anInt394 = -1;
					return true;
				}
				if (this.anInt394 == 114) {
					this.anInt282 = this.aClass1_Sub1_Sub3_4.method473();
					this.anInt285 = this.aClass1_Sub1_Sub3_4.method473();
					this.anInt209 = this.aClass1_Sub1_Sub3_4.method473();
					this.aBoolean75 = true;
					this.aBoolean73 = true;
					this.anInt394 = -1;
					return true;
				}
				if (this.anInt394 == 158) {
					local194 = this.aClass1_Sub1_Sub3_4.method475();
					local257 = this.aClass1_Sub1_Sub3_4.method475();
					if (this.anInt303 != -1) {
						this.anInt303 = -1;
						this.aBoolean73 = true;
					}
					if (this.aBoolean72) {
						this.aBoolean72 = false;
						this.aBoolean73 = true;
					}
					this.anInt317 = local194;
					this.anInt390 = local257;
					this.aBoolean55 = true;
					this.aBoolean46 = true;
					this.aBoolean80 = false;
					this.anInt394 = -1;
					return true;
				}
				if (this.anInt394 == 240) {
					local194 = this.aClass1_Sub1_Sub3_4.method476();
					if (local194 >= 0) {
						this.method110(local194);
					}
					this.anInt341 = local194;
					this.anInt394 = -1;
					return true;
				}
				if (this.anInt394 == 195) {
					this.anInt262 = this.aClass1_Sub1_Sub3_4.method473();
					this.anInt263 = this.aClass1_Sub1_Sub3_4.method473();
					while (this.aClass1_Sub1_Sub3_4.anInt743 < this.anInt393) {
						local194 = this.aClass1_Sub1_Sub3_4.method473();
						this.method149(local194, 220, this.aClass1_Sub1_Sub3_4);
					}
					this.anInt394 = -1;
					return true;
				}
				@Pc(1212) boolean local1212;
				@Pc(1214) int local1214;
				@Pc(1207) String local1207;
				if (this.anInt394 == 161) {
					local1196 = this.aClass1_Sub1_Sub3_4.method480();
					@Pc(1210) long local1210;
					if (local1196.endsWith(":tradereq:")) {
						local1207 = local1196.substring(0, local1196.indexOf(":"));
						local1210 = Class48.method660(local1207);
						local1212 = false;
						for (local1214 = 0; local1214 < this.anInt278; local1214++) {
							if (this.aLongArray3[local1214] == local1210) {
								local1212 = true;
								break;
							}
						}
						if (!local1212 && this.anInt246 == 0) {
							this.method131(4, local1207, "wishes to trade with you.");
						}
					} else if (local1196.endsWith(":duelreq:")) {
						local1207 = local1196.substring(0, local1196.indexOf(":"));
						local1210 = Class48.method660(local1207);
						local1212 = false;
						for (local1214 = 0; local1214 < this.anInt278; local1214++) {
							if (this.aLongArray3[local1214] == local1210) {
								local1212 = true;
								break;
							}
						}
						if (!local1212 && this.anInt246 == 0) {
							this.method131(8, local1207, "wishes to duel with you.");
						}
					} else {
						this.method131(0, "", local1196);
					}
					this.anInt394 = -1;
					return true;
				}
				if (this.anInt394 == 101) {
					this.aBoolean65 = false;
					for (local194 = 0; local194 < 5; local194++) {
						this.aBooleanArray4[local194] = false;
					}
					this.anInt394 = -1;
					return true;
				}
				if (this.anInt394 == 16) {
					local194 = this.aClass1_Sub1_Sub3_4.method475();
					this.method110(local194);
					if (this.anInt303 != -1) {
						this.anInt303 = -1;
						this.aBoolean73 = true;
					}
					if (this.aBoolean72) {
						this.aBoolean72 = false;
						this.aBoolean73 = true;
					}
					this.anInt390 = local194;
					this.aBoolean55 = true;
					this.aBoolean46 = true;
					this.anInt317 = -1;
					this.aBoolean80 = false;
					this.anInt394 = -1;
					return true;
				}
				if (this.anInt394 == 44) {
					local194 = this.aClass1_Sub1_Sub3_4.method475();
					local1207 = this.aClass1_Sub1_Sub3_4.method480();
					Class6.aClass6Array1[local194].aString18 = local1207;
					if (Class6.aClass6Array1[local194].anInt421 == this.anIntArray50[this.anInt304]) {
						this.aBoolean55 = true;
					}
					this.anInt394 = -1;
					return true;
				}
				if (this.anInt394 == 245) {
					local194 = this.aClass1_Sub1_Sub3_4.method475();
					local257 = this.aClass1_Sub1_Sub3_4.method478();
					this.anIntArray82[local194] = local257;
					if (this.anIntArray73[local194] != local257) {
						this.anIntArray73[local194] = local257;
						this.method122(local194);
						this.aBoolean55 = true;
						if (this.anInt342 != -1) {
							this.aBoolean73 = true;
						}
					}
					this.anInt394 = -1;
					return true;
				}
				if (this.anInt394 == 166) {
					local194 = this.aClass1_Sub1_Sub3_4.method475();
					this.method110(local194);
					if (this.anInt390 != -1) {
						this.anInt390 = -1;
						this.aBoolean55 = true;
						this.aBoolean46 = true;
					}
					this.anInt303 = local194;
					this.aBoolean73 = true;
					this.anInt317 = -1;
					this.aBoolean80 = false;
					this.anInt394 = -1;
					return true;
				}
				if (this.anInt394 == 28) {
					local194 = this.aClass1_Sub1_Sub3_4.method475();
					local257 = this.aClass1_Sub1_Sub3_4.method475();
					local261 = this.aClass1_Sub1_Sub3_4.method475();
					@Pc(1524) Class15 local1524 = Class15.method358(local257);
					Class6.aClass6Array1[local194].anInt439 = 4;
					Class6.aClass6Array1[local194].anInt440 = local257;
					Class6.aClass6Array1[local194].anInt446 = local1524.anInt601;
					Class6.aClass6Array1[local194].anInt447 = local1524.anInt602;
					Class6.aClass6Array1[local194].anInt445 = local1524.anInt600 * 100 / local261;
					this.anInt394 = -1;
					return true;
				}
				if (this.anInt394 == 54) {
					local194 = this.aClass1_Sub1_Sub3_4.method475();
					local257 = this.aClass1_Sub1_Sub3_4.method475();
					local695 = Class6.aClass6Array1[local194];
					if (local695 != null && local695.anInt422 == 0) {
						if (local257 < 0) {
							local257 = 0;
						}
						if (local257 > local695.anInt430 - local695.anInt426) {
							local257 = local695.anInt430 - local695.anInt426;
						}
						local695.anInt431 = local257;
					}
					this.anInt394 = -1;
					return true;
				}
				if (this.anInt394 == 47) {
					for (local194 = 0; local194 < this.aClass1_Sub1_Sub1_Sub1_Sub1Array1.length; local194++) {
						if (this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local194] != null) {
							this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local194].anInt1013 = -1;
						}
					}
					for (local257 = 0; local257 < this.aClass1_Sub1_Sub1_Sub1_Sub2Array1.length; local257++) {
						if (this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local257] != null) {
							this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local257].anInt1013 = -1;
						}
					}
					this.anInt394 = -1;
					return true;
				}
				if (this.anInt394 == 194) {
					this.anInt314 = this.aClass1_Sub1_Sub3_4.method473();
					this.anInt394 = -1;
					return true;
				}
				if (this.anInt394 == 90) {
					this.anInt373 = this.aClass1_Sub1_Sub3_4.method473();
					if (this.anInt373 == this.anInt304) {
						if (this.anInt373 == 3) {
							this.anInt304 = 1;
						} else {
							this.anInt304 = 3;
						}
						this.aBoolean55 = true;
					}
					this.anInt394 = -1;
					return true;
				}
				if (this.anInt394 == 89) {
					this.anInt208 = this.aClass1_Sub1_Sub3_4.method475() * 30;
					this.anInt394 = -1;
					return true;
				}
				if (this.anInt394 == 190) {
					for (local194 = 0; local194 < this.anIntArray73.length; local194++) {
						if (this.anIntArray73[local194] != this.anIntArray82[local194]) {
							this.anIntArray73[local194] = this.anIntArray82[local194];
							this.method122(local194);
							this.aBoolean55 = true;
						}
					}
					this.anInt394 = -1;
					return true;
				}
				if (this.anInt394 == 83) {
					if (this.anInt304 == 12) {
						this.aBoolean55 = true;
					}
					this.anInt226 = this.aClass1_Sub1_Sub3_4.method473();
					this.anInt394 = -1;
					return true;
				}
				@Pc(2045) int local2045;
				@Pc(2066) int local2066;
				@Pc(1928) int local1928;
				if (this.anInt394 == 231) {
					local194 = this.aClass1_Sub1_Sub3_4.method475();
					local257 = this.aClass1_Sub1_Sub3_4.method475();
					if (this.anInt266 == local194 && this.anInt267 == local257 && this.anInt350 == 2) {
						this.anInt394 = -1;
						return true;
					}
					this.anInt266 = local194;
					this.anInt267 = local257;
					this.anInt322 = (this.anInt266 - 6) * 8;
					this.anInt323 = (this.anInt267 - 6) * 8;
					this.aBoolean81 = false;
					if ((this.anInt266 / 8 == 48 || this.anInt266 / 8 == 49) && this.anInt267 / 8 == 48) {
						this.aBoolean81 = true;
					}
					if (this.anInt266 / 8 == 48 && this.anInt267 / 8 == 148) {
						this.aBoolean81 = true;
					}
					this.anInt350 = 1;
					this.aLong16 = System.currentTimeMillis();
					this.aClass35_14.method517(aBoolean59);
					this.aClass1_Sub1_Sub2_Sub4_2.method443(257, 151, 0, "Loading - please wait.");
					this.aClass1_Sub1_Sub2_Sub4_2.method443(256, 150, 16777215, "Loading - please wait.");
					this.aClass35_14.method518(4, super.aGraphics2, 4);
					local261 = 0;
					for (local265 = (this.anInt266 - 6) / 8; local265 <= (this.anInt266 + 6) / 8; local265++) {
						for (local1928 = (this.anInt267 - 6) / 8; local1928 <= (this.anInt267 + 6) / 8; local1928++) {
							local261++;
						}
					}
					this.aByteArrayArray1 = new byte[local261][];
					this.aByteArrayArray2 = new byte[local261][];
					this.anIntArray34 = new int[local261];
					this.anIntArray35 = new int[local261];
					this.anIntArray36 = new int[local261];
					local261 = 0;
					for (local1928 = (this.anInt266 - 6) / 8; local1928 <= (this.anInt266 + 6) / 8; local1928++) {
						for (local1214 = (this.anInt267 - 6) / 8; local1214 <= (this.anInt267 + 6) / 8; local1214++) {
							this.anIntArray34[local261] = (local1928 << 8) + local1214;
							if (this.aBoolean81 && (local1214 == 49 || local1214 == 149 || local1214 == 147 || local1928 == 50 || local1928 == 49 && local1214 == 47)) {
								this.anIntArray35[local261] = -1;
								this.anIntArray36[local261] = -1;
								local261++;
							} else {
								local2045 = this.anIntArray35[local261] = this.aClass44_Sub1_1.method633(0, local1928, local1214);
								if (local2045 != -1) {
									this.aClass44_Sub1_1.method638(3, local2045);
								}
								local2066 = this.anIntArray36[local261] = this.aClass44_Sub1_1.method633(1, local1928, local1214);
								if (local2066 != -1) {
									this.aClass44_Sub1_1.method638(3, local2066);
								}
								local261++;
							}
						}
					}
					local1214 = this.anInt322 - this.anInt324;
					local2045 = this.anInt323 - this.anInt325;
					this.anInt324 = this.anInt322;
					this.anInt325 = this.anInt323;
					for (local2066 = 0; local2066 < 16384; local2066++) {
						@Pc(2122) Class1_Sub1_Sub1_Sub1_Sub2 local2122 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local2066];
						if (local2122 != null) {
							for (@Pc(2126) int local2126 = 0; local2126 < 10; local2126++) {
								local2122.anIntArray269[local2126] -= local1214;
								local2122.anIntArray270[local2126] -= local2045;
							}
							local2122.anInt990 -= local1214 * 128;
							local2122.anInt991 -= local2045 * 128;
						}
					}
					for (@Pc(2170) int local2170 = 0; local2170 < this.anInt346; local2170++) {
						@Pc(2177) Class1_Sub1_Sub1_Sub1_Sub1 local2177 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local2170];
						if (local2177 != null) {
							for (@Pc(2181) int local2181 = 0; local2181 < 10; local2181++) {
								local2177.anIntArray269[local2181] -= local1214;
								local2177.anIntArray270[local2181] -= local2045;
							}
							local2177.anInt990 -= local1214 * 128;
							local2177.anInt991 -= local2045 * 128;
						}
					}
					this.aBoolean88 = true;
					@Pc(2229) byte local2229 = 0;
					@Pc(2231) byte local2231 = 104;
					@Pc(2233) byte local2233 = 1;
					if (local1214 < 0) {
						local2229 = 103;
						local2231 = -1;
						local2233 = -1;
					}
					@Pc(2243) byte local2243 = 0;
					@Pc(2245) byte local2245 = 104;
					@Pc(2247) byte local2247 = 1;
					if (local2045 < 0) {
						local2243 = 103;
						local2245 = -1;
						local2247 = -1;
					}
					for (@Pc(2257) int local2257 = local2229; local2257 != local2231; local2257 += local2233) {
						for (@Pc(2261) int local2261 = local2243; local2261 != local2245; local2261 += local2247) {
							@Pc(2267) int local2267 = local2257 + local1214;
							@Pc(2271) int local2271 = local2261 + local2045;
							for (@Pc(2273) int local2273 = 0; local2273 < 4; local2273++) {
								if (local2267 >= 0 && local2271 >= 0 && local2267 < 104 && local2271 < 104) {
									this.aClass29ArrayArrayArray1[local2273][local2257][local2261] = this.aClass29ArrayArrayArray1[local2273][local2267][local2271];
								} else {
									this.aClass29ArrayArrayArray1[local2273][local2257][local2261] = null;
								}
							}
						}
					}
					for (@Pc(2335) Class1_Sub2 local2335 = (Class1_Sub2) this.aClass29_3.method504(); local2335 != null; local2335 = (Class1_Sub2) this.aClass29_3.method506(this.aByte9)) {
						local2335.anInt784 -= local1214;
						local2335.anInt785 -= local2045;
						if (local2335.anInt784 < 0 || local2335.anInt785 < 0 || local2335.anInt784 >= 104 || local2335.anInt785 >= 104) {
							local2335.method667();
						}
					}
					if (this.anInt309 != 0) {
						this.anInt309 -= local1214;
						this.anInt310 -= local2045;
					}
					this.aBoolean65 = false;
					this.anInt394 = -1;
					return true;
				}
				if (this.anInt394 == 171) {
					if (this.anInt390 != -1) {
						this.anInt390 = -1;
						this.aBoolean55 = true;
						this.aBoolean46 = true;
					}
					if (this.anInt303 != -1) {
						this.anInt303 = -1;
						this.aBoolean73 = true;
					}
					if (this.aBoolean72) {
						this.aBoolean72 = false;
						this.aBoolean73 = true;
					}
					this.anInt317 = -1;
					this.aBoolean80 = false;
					this.anInt394 = -1;
					return true;
				}
				@Pc(2453) long local2453;
				if (this.anInt394 == 247) {
					local2453 = this.aClass1_Sub1_Sub3_4.method479();
					local261 = this.aClass1_Sub1_Sub3_4.method473();
					@Pc(2463) String local2463 = Class48.method664(Class48.method661(local2453));
					for (local1928 = 0; local1928 < this.anInt344; local1928++) {
						if (local2453 == this.aLongArray4[local1928]) {
							if (this.anIntArray63[local1928] != local261) {
								this.anIntArray63[local1928] = local261;
								this.aBoolean55 = true;
								if (local261 > 0) {
									this.method131(5, "", local2463 + " has logged in.");
								}
								if (local261 == 0) {
									this.method131(5, "", local2463 + " has logged out.");
								}
							}
							local2463 = null;
							break;
						}
					}
					if (local2463 != null && this.anInt344 < 200) {
						this.aLongArray4[this.anInt344] = local2453;
						this.aStringArray2[this.anInt344] = local2463;
						this.anIntArray63[this.anInt344] = local261;
						this.anInt344++;
						this.aBoolean55 = true;
					}
					@Pc(2561) boolean local2561 = false;
					while (!local2561) {
						local2561 = true;
						for (local2045 = 0; local2045 < this.anInt344 - 1; local2045++) {
							if (this.anIntArray63[local2045] != anInt404 && this.anIntArray63[local2045 + 1] == anInt404 || this.anIntArray63[local2045] == 0 && this.anIntArray63[local2045 + 1] != 0) {
								local2066 = this.anIntArray63[local2045];
								this.anIntArray63[local2045] = this.anIntArray63[local2045 + 1];
								this.anIntArray63[local2045 + 1] = local2066;
								@Pc(2622) String local2622 = this.aStringArray2[local2045];
								this.aStringArray2[local2045] = this.aStringArray2[local2045 + 1];
								this.aStringArray2[local2045 + 1] = local2622;
								@Pc(2644) long local2644 = this.aLongArray4[local2045];
								this.aLongArray4[local2045] = this.aLongArray4[local2045 + 1];
								this.aLongArray4[local2045 + 1] = local2644;
								this.aBoolean55 = true;
								local2561 = false;
							}
						}
					}
					this.anInt394 = -1;
					return true;
				}
				if (this.anInt394 == 10) {
					local194 = this.aClass1_Sub1_Sub3_4.method475();
					@Pc(2697) boolean local2697 = this.aClass1_Sub1_Sub3_4.method473() == 1;
					Class6.aClass6Array1[local194].aBoolean93 = local2697;
					this.anInt394 = -1;
					return true;
				}
				if (this.anInt394 == 105) {
					this.aBoolean55 = true;
					local194 = this.aClass1_Sub1_Sub3_4.method473();
					local257 = this.aClass1_Sub1_Sub3_4.method478();
					local261 = this.aClass1_Sub1_Sub3_4.method473();
					this.anIntArray91[local194] = local257;
					this.anIntArray41[local194] = local261;
					this.anIntArray81[local194] = 1;
					for (local265 = 0; local265 < 98; local265++) {
						if (local257 >= anIntArray87[local265]) {
							this.anIntArray81[local194] = local265 + 2;
						}
					}
					this.anInt394 = -1;
					return true;
				}
				if (this.anInt394 == 23) {
					local194 = this.aClass1_Sub1_Sub3_4.method475();
					if (local194 == 65535) {
						local194 = -1;
					}
					if (local194 != this.anInt313 && this.aBoolean70 && !aBoolean87 && this.anInt269 == 0) {
						this.anInt377 = local194;
						this.aBoolean84 = true;
						this.aClass44_Sub1_1.method638(2, this.anInt377);
					}
					this.anInt313 = local194;
					this.anInt394 = -1;
					return true;
				}
				if (this.anInt394 == 15) {
					local194 = this.aClass1_Sub1_Sub3_4.method475();
					local257 = this.aClass1_Sub1_Sub3_4.method475();
					if (this.aBoolean70 && !aBoolean87) {
						this.anInt377 = local194;
						this.aBoolean84 = false;
						this.aClass44_Sub1_1.method638(2, this.anInt377);
						this.anInt269 = local257;
					}
					this.anInt394 = -1;
					return true;
				}
				if (this.anInt394 == 200) {
					this.aBoolean65 = true;
					this.anInt235 = this.aClass1_Sub1_Sub3_4.method473();
					this.anInt236 = this.aClass1_Sub1_Sub3_4.method473();
					this.anInt237 = this.aClass1_Sub1_Sub3_4.method475();
					this.anInt238 = this.aClass1_Sub1_Sub3_4.method473();
					this.anInt239 = this.aClass1_Sub1_Sub3_4.method473();
					if (this.anInt239 >= 100) {
						this.anInt217 = this.anInt235 * 128 + 64;
						this.anInt219 = this.anInt236 * 128 + 64;
						this.anInt218 = this.method132(this.anInt217, this.anInt219, this.anInt327) - this.anInt237;
					}
					this.anInt394 = -1;
					return true;
				}
				@Pc(2934) Class6 local2934;
				if (this.anInt394 == 172) {
					this.aBoolean55 = true;
					local194 = this.aClass1_Sub1_Sub3_4.method475();
					local2934 = Class6.aClass6Array1[local194];
					while (this.aClass1_Sub1_Sub3_4.anInt743 < this.anInt393) {
						local261 = this.aClass1_Sub1_Sub3_4.method473();
						local265 = this.aClass1_Sub1_Sub3_4.method475();
						local1928 = this.aClass1_Sub1_Sub3_4.method473();
						if (local1928 == 255) {
							local1928 = this.aClass1_Sub1_Sub3_4.method478();
						}
						if (local261 >= 0 && local261 < local2934.anIntArray93.length) {
							local2934.anIntArray93[local261] = local265;
							local2934.anIntArray94[local261] = local1928;
						}
					}
					this.anInt394 = -1;
					return true;
				}
				if (this.anInt394 == 17) {
					local194 = this.aClass1_Sub1_Sub3_4.method473();
					local257 = this.aClass1_Sub1_Sub3_4.method473();
					@Pc(2999) String local2999 = this.aClass1_Sub1_Sub3_4.method480();
					if (local194 >= 1 && local194 <= 5) {
						if (local2999.equalsIgnoreCase("null")) {
							local2999 = null;
						}
						this.aStringArray1[local194 - 1] = local2999;
						this.aBooleanArray3[local194 - 1] = local257 == 0;
					}
					this.anInt394 = -1;
					return true;
				}
				if (this.anInt394 == 32) {
					this.anInt262 = this.aClass1_Sub1_Sub3_4.method473();
					this.anInt263 = this.aClass1_Sub1_Sub3_4.method473();
					this.anInt394 = -1;
					return true;
				}
				if (this.anInt394 == 106) {
					this.aBoolean55 = true;
					local194 = this.aClass1_Sub1_Sub3_4.method475();
					local2934 = Class6.aClass6Array1[local194];
					local261 = this.aClass1_Sub1_Sub3_4.method473();
					for (local265 = 0; local265 < local261; local265++) {
						local2934.anIntArray93[local265] = this.aClass1_Sub1_Sub3_4.method475();
						local1928 = this.aClass1_Sub1_Sub3_4.method473();
						if (local1928 == 255) {
							local1928 = this.aClass1_Sub1_Sub3_4.method478();
						}
						local2934.anIntArray94[local265] = local1928;
					}
					for (local1928 = local261; local1928 < local2934.anIntArray93.length; local1928++) {
						local2934.anIntArray93[local1928] = 0;
						local2934.anIntArray94[local1928] = 0;
					}
					this.anInt394 = -1;
					return true;
				}
				if (this.anInt394 == 133) {
					this.anInt276 = this.aClass1_Sub1_Sub3_4.method475();
					this.anInt211 = this.aClass1_Sub1_Sub3_4.method473();
					this.anInt394 = -1;
					return true;
				}
				if (this.anInt394 == 129) {
					local194 = this.aClass1_Sub1_Sub3_4.method475();
					local257 = this.aClass1_Sub1_Sub3_4.method475();
					Class6.aClass6Array1[local194].anInt439 = 1;
					Class6.aClass6Array1[local194].anInt440 = local257;
					this.anInt394 = -1;
					return true;
				}
				if (this.anInt394 == 233) {
					this.aBoolean65 = true;
					this.anInt256 = this.aClass1_Sub1_Sub3_4.method473();
					this.anInt257 = this.aClass1_Sub1_Sub3_4.method473();
					this.anInt258 = this.aClass1_Sub1_Sub3_4.method475();
					this.anInt259 = this.aClass1_Sub1_Sub3_4.method473();
					this.anInt260 = this.aClass1_Sub1_Sub3_4.method473();
					if (this.anInt260 >= 100) {
						local194 = this.anInt256 * 128 + 64;
						local257 = this.anInt257 * 128 + 64;
						local261 = this.method132(local194, local257, this.anInt327) - this.anInt258;
						local265 = local194 - this.anInt217;
						local1928 = local261 - this.anInt218;
						local1214 = local257 - this.anInt219;
						local2045 = (int) Math.sqrt((double) (local265 * local265 + local1214 * local1214));
						this.anInt220 = (int) (Math.atan2((double) local1928, (double) local2045) * 325.949D) & 0x7FF;
						this.anInt221 = (int) (Math.atan2((double) local265, (double) local1214) * -325.949D) & 0x7FF;
						if (this.anInt220 < 128) {
							this.anInt220 = 128;
						}
						if (this.anInt220 > 383) {
							this.anInt220 = 383;
						}
					}
					this.anInt394 = -1;
					return true;
				}
				if (this.anInt394 == 227) {
					local194 = this.aClass1_Sub1_Sub3_4.method475();
					local2934 = Class6.aClass6Array1[local194];
					for (local261 = 0; local261 < local2934.anIntArray93.length; local261++) {
						local2934.anIntArray93[local261] = -1;
						local2934.anIntArray93[local261] = 0;
					}
					this.anInt394 = -1;
					return true;
				}
				if (this.anInt394 == 77) {
					local194 = this.aClass1_Sub1_Sub3_4.method475();
					local257 = this.aClass1_Sub1_Sub3_4.method476();
					local261 = this.aClass1_Sub1_Sub3_4.method476();
					@Pc(3361) Class6 local3361 = Class6.aClass6Array1[local194];
					local3361.anInt427 = local257;
					local3361.anInt428 = local261;
					this.anInt394 = -1;
					return true;
				}
				if (this.anInt394 == 185) {
					this.anInt345 = this.aClass1_Sub1_Sub3_4.method473();
					this.aBoolean55 = true;
					this.anInt394 = -1;
					return true;
				}
				if (this.anInt394 == 197) {
					this.method225(this.anInt393, this.aClass1_Sub1_Sub3_4);
					this.anInt394 = -1;
					return true;
				}
				if (this.anInt394 == 183) {
					local194 = this.aClass1_Sub1_Sub3_4.method475();
					local257 = this.aClass1_Sub1_Sub3_4.method475();
					local261 = local257 >> 10 & 0x1F;
					local265 = local257 >> 5 & 0x1F;
					local1928 = local257 & 0x1F;
					Class6.aClass6Array1[local194].anInt435 = (local261 << 19) + (local265 << 11) + (local1928 << 3);
					this.anInt394 = -1;
					return true;
				}
				if (this.anInt394 == 235) {
					local2453 = this.aClass1_Sub1_Sub3_4.method479();
					local261 = this.aClass1_Sub1_Sub3_4.method478();
					local265 = this.aClass1_Sub1_Sub3_4.method473();
					local1212 = false;
					for (local1214 = 0; local1214 < 100; local1214++) {
						if (this.anIntArray62[local1214] == local261) {
							local1212 = true;
							break;
						}
					}
					if (local265 <= 1) {
						for (local2045 = 0; local2045 < this.anInt278; local2045++) {
							if (this.aLongArray3[local2045] == local2453) {
								local1212 = true;
								break;
							}
						}
					}
					if (!local1212 && this.anInt246 == 0) {
						try {
							this.anIntArray62[this.anInt379] = local261;
							this.anInt379 = (this.anInt379 + 1) % 100;
							@Pc(3541) String local3541 = Class49.method677((byte) 8, this.anInt393 - 13, this.aClass1_Sub1_Sub3_4);
							@Pc(3545) String local3545 = Class42.method597(local3541);
							if (local265 == 2 || local265 == 3) {
								this.method131(7, "@cr2@" + Class48.method664(Class48.method661(local2453)), local3545);
							} else if (local265 == 1) {
								this.method131(7, "@cr1@" + Class48.method664(Class48.method661(local2453)), local3545);
							} else {
								this.method131(3, Class48.method664(Class48.method661(local2453)), local3545);
							}
						} catch (@Pc(3602) Exception local3602) {
							signlink.reporterror("cde1");
						}
					}
					this.anInt394 = -1;
					return true;
				}
				signlink.reporterror("T1 - " + this.anInt394 + "," + this.anInt393 + " - " + this.anInt357 + "," + this.anInt358);
				this.method162();
			} catch (@Pc(3639) IOException local3639) {
				this.method153();
			} catch (@Pc(3644) Exception local3644) {
				local1196 = "T2 - " + this.anInt394 + "," + this.anInt357 + "," + this.anInt358 + " - " + this.anInt393 + "," + (this.anInt322 + aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray269[0]) + "," + (this.anInt323 + aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray270[0]) + " - ";
				for (local257 = 0; local257 < this.anInt393 && local257 < 50; local257++) {
					local1196 = local1196 + this.aClass1_Sub1_Sub3_4.aByteArray9[local257] + ",";
				}
				signlink.reporterror(local1196);
				this.method162();
			}
			return true;
		} catch (@Pc(3725) RuntimeException local3725) {
			signlink.reporterror("68015, " + 0 + ", " + local3725.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!d;I)Z")
	private boolean method195(@OriginalArg(0) Class6 arg0, @OriginalArg(1) int arg1) {
		try {
			if (arg1 != 0) {
				throw new NullPointerException();
			}
			@Pc(10) int local10 = arg0.anInt424;
			if (this.anInt345 == 2) {
				if (local10 == 201) {
					this.aBoolean73 = true;
					this.aBoolean72 = false;
					this.aBoolean90 = true;
					this.aString11 = "";
					this.anInt320 = 1;
					this.aString13 = "Enter name of friend to add to list";
				}
				if (local10 == 202) {
					this.aBoolean73 = true;
					this.aBoolean72 = false;
					this.aBoolean90 = true;
					this.aString11 = "";
					this.anInt320 = 2;
					this.aString13 = "Enter name of friend to delete from list";
				}
			}
			if (local10 == 205) {
				this.anInt397 = 250;
				return true;
			}
			if (local10 == 501) {
				this.aBoolean73 = true;
				this.aBoolean72 = false;
				this.aBoolean90 = true;
				this.aString11 = "";
				this.anInt320 = 4;
				this.aString13 = "Enter name of player to add to list";
			}
			if (local10 == 502) {
				this.aBoolean73 = true;
				this.aBoolean72 = false;
				this.aBoolean90 = true;
				this.aString11 = "";
				this.anInt320 = 5;
				this.aString13 = "Enter name of player to delete from list";
			}
			@Pc(118) int local118;
			@Pc(122) int local122;
			@Pc(127) int local127;
			if (local10 >= 300 && local10 <= 313) {
				local118 = (local10 - 300) / 2;
				local122 = local10 & 0x1;
				local127 = this.anIntArray33[local118];
				if (local127 != -1) {
					while (true) {
						if (local122 == 0) {
							local127--;
							if (local127 < 0) {
								local127 = Class23.anInt749 - 1;
							}
						}
						if (local122 == 1) {
							local127++;
							if (local127 >= Class23.anInt749) {
								local127 = 0;
							}
						}
						if (!Class23.aClass23Array1[local127].aBoolean187 && Class23.aClass23Array1[local127].anInt750 == local118 + (this.aBoolean63 ? 0 : 7)) {
							this.anIntArray33[local118] = local127;
							this.aBoolean60 = true;
							break;
						}
					}
				}
			}
			if (local10 >= 314 && local10 <= 323) {
				local118 = (local10 - 314) / 2;
				local122 = local10 & 0x1;
				local127 = this.anIntArray65[local118];
				if (local122 == 0) {
					local127--;
					if (local127 < 0) {
						local127 = anIntArrayArray6[local118].length - 1;
					}
				}
				if (local122 == 1) {
					local127++;
					if (local127 >= anIntArrayArray6[local118].length) {
						local127 = 0;
					}
				}
				this.anIntArray65[local118] = local127;
				this.aBoolean60 = true;
			}
			if (local10 == 324 && !this.aBoolean63) {
				this.aBoolean63 = true;
				this.method188();
			}
			if (local10 == 325 && this.aBoolean63) {
				this.aBoolean63 = false;
				this.method188();
			}
			if (local10 == 326) {
				this.aClass1_Sub1_Sub3_2.method462(125);
				this.aClass1_Sub1_Sub3_2.method463(this.aBoolean63 ? 0 : 1);
				for (local118 = 0; local118 < 7; local118++) {
					this.aClass1_Sub1_Sub3_2.method463(this.anIntArray33[local118]);
				}
				for (local122 = 0; local122 < 5; local122++) {
					this.aClass1_Sub1_Sub3_2.method463(this.anIntArray65[local122]);
				}
				return true;
			}
			if (local10 == 613) {
				this.aBoolean74 = !this.aBoolean74;
			}
			if (local10 >= 601 && local10 <= 612) {
				this.method127();
				if (this.aString10.length() > 0) {
					this.aClass1_Sub1_Sub3_2.method462(137);
					this.aClass1_Sub1_Sub3_2.method469(Class48.method660(this.aString10));
					this.aClass1_Sub1_Sub3_2.method463(local10 - 601);
					this.aClass1_Sub1_Sub3_2.method463(this.aBoolean74 ? 1 : 0);
				}
			}
			return false;
		} catch (@Pc(355) RuntimeException local355) {
			signlink.reporterror("81144, " + arg0 + ", " + arg1 + ", " + local355.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "G", descriptor = "(I)V")
	private void method196() {
		try {
			this.aBoolean52 = false;
			while (this.aBoolean62) {
				this.aBoolean52 = false;
				try {
					Thread.sleep(50L);
				} catch (@Pc(11) Exception local11) {
				}
			}
			this.aClass1_Sub1_Sub2_Sub3_19 = null;
			this.aClass1_Sub1_Sub2_Sub3_20 = null;
			this.aClass1_Sub1_Sub2_Sub3Array4 = null;
			this.anIntArray45 = null;
			this.anIntArray46 = null;
			this.anIntArray47 = null;
			this.anIntArray48 = null;
			this.anIntArray74 = null;
			this.anInt393 += 0;
			this.anIntArray75 = null;
			this.anIntArray53 = null;
			this.anIntArray54 = null;
			this.aClass1_Sub1_Sub2_Sub2_1 = null;
			this.aClass1_Sub1_Sub2_Sub2_2 = null;
		} catch (@Pc(62) RuntimeException local62) {
			signlink.reporterror("22511, " + 0 + ", " + local62.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "H", descriptor = "(I)V")
	private void method197() {
		try {
			this.anInt337 = 0;
			@Pc(53) int local53;
			@Pc(73) int local73;
			for (@Pc(6) int local6 = -1; local6 < this.anInt348 + this.anInt416; local6++) {
				@Pc(13) Class1_Sub1_Sub1_Sub1 local13;
				if (local6 == -1) {
					local13 = aClass1_Sub1_Sub1_Sub1_Sub1_1;
				} else if (local6 < this.anInt348) {
					local13 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[this.anIntArray76[local6]];
				} else {
					local13 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[this.anIntArray92[local6 - this.anInt348]];
				}
				if (local13 != null && local13.method674()) {
					if (local6 >= this.anInt348) {
						@Pc(148) Class13 local148 = ((Class1_Sub1_Sub1_Sub1_Sub2) local13).aClass13_2;
						if (local148.anInt566 >= 0 && local148.anInt566 < this.aClass1_Sub1_Sub2_Sub2Array5.length) {
							this.method111(local13, local13.anInt1031 + 15);
							if (this.anInt296 > -1) {
								this.aClass1_Sub1_Sub2_Sub2Array5[local148.anInt566].method388(this.aByte14, this.anInt296 - 12, this.anInt297 - 30);
							}
						}
						if (this.anInt384 == 1 && this.anInt264 == this.anIntArray92[local6 - this.anInt348] && anInt207 % 20 < 10) {
							this.method111(local13, local13.anInt1031 + 15);
							if (this.anInt296 > -1) {
								this.aClass1_Sub1_Sub2_Sub2Array5[2].method388(this.aByte14, this.anInt296 - 12, this.anInt297 - 28);
							}
						}
					} else {
						local53 = 30;
						@Pc(56) Class1_Sub1_Sub1_Sub1_Sub1 local56 = (Class1_Sub1_Sub1_Sub1_Sub1) local13;
						if (local56.anInt130 != 0) {
							this.method111(local13, local13.anInt1031 + 15);
							if (this.anInt296 > -1) {
								for (local73 = 0; local73 < 8; local73++) {
									if ((local56.anInt130 & 0x1 << local73) != 0) {
										this.aClass1_Sub1_Sub2_Sub2Array5[local73].method388(this.aByte14, this.anInt296 - 12, this.anInt297 - local53);
										local53 -= 25;
									}
								}
							}
						}
						if (local6 >= 0 && this.anInt384 == 10 && this.anInt376 == this.anIntArray76[local6]) {
							this.method111(local13, local13.anInt1031 + 15);
							if (this.anInt296 > -1) {
								this.aClass1_Sub1_Sub2_Sub2Array5[7].method388(this.aByte14, this.anInt296 - 12, this.anInt297 - local53);
							}
						}
					}
					if (local13.aString31 != null && (local6 >= this.anInt348 || this.anInt282 == 0 || this.anInt282 == 3 || this.anInt282 == 1 && this.method104(((Class1_Sub1_Sub1_Sub1_Sub1) local13).aString3))) {
						this.method111(local13, local13.anInt1031);
						if (this.anInt296 > -1 && this.anInt337 < this.anInt338) {
							this.anIntArray69[this.anInt337] = this.aClass1_Sub1_Sub2_Sub4_3.method445(local13.aString31) / 2;
							this.anIntArray68[this.anInt337] = this.aClass1_Sub1_Sub2_Sub4_3.anInt710;
							this.anIntArray66[this.anInt337] = this.anInt296;
							this.anIntArray67[this.anInt337] = this.anInt297;
							this.anIntArray70[this.anInt337] = local13.anInt1002;
							this.anIntArray71[this.anInt337] = local13.anInt1003;
							this.anIntArray72[this.anInt337] = local13.anInt1001;
							this.aStringArray5[this.anInt337++] = local13.aString31;
							if (this.anInt326 == 0 && local13.anInt1003 == 1) {
								this.anIntArray68[this.anInt337] += 10;
								this.anIntArray67[this.anInt337] += 5;
							}
							if (this.anInt326 == 0 && local13.anInt1003 == 2) {
								this.anIntArray69[this.anInt337] = 60;
							}
						}
					}
					if (local13.anInt1004 > anInt207) {
						this.method111(local13, local13.anInt1031 + 15);
						if (this.anInt296 > -1) {
							local53 = local13.anInt1005 * 30 / local13.anInt1006;
							if (local53 > 30) {
								local53 = 30;
							}
							Class1_Sub1_Sub2.method436(5, 65280, local53, this.anInt296 - 15, this.anInt297 - 3);
							Class1_Sub1_Sub2.method436(5, 16711680, 30 - local53, this.anInt296 - 15 + local53, this.anInt297 - 3);
						}
					}
					for (local53 = 0; local53 < 4; local53++) {
						if (local13.anIntArray268[local53] > anInt207) {
							this.method111(local13, local13.anInt1031 / 2);
							if (this.anInt296 > -1) {
								if (local53 == 1) {
									this.anInt297 -= 20;
								}
								if (local53 == 2) {
									this.anInt296 -= 15;
									this.anInt297 -= 10;
								}
								if (local53 == 3) {
									this.anInt296 += 15;
									this.anInt297 -= 10;
								}
								this.aClass1_Sub1_Sub2_Sub2Array3[local13.anIntArray267[local53]].method388(this.aByte14, this.anInt296 - 12, this.anInt297 - 12);
								this.aClass1_Sub1_Sub2_Sub4_1.method443(this.anInt296, this.anInt297 + 4, 0, String.valueOf(local13.anIntArray266[local53]));
								this.aClass1_Sub1_Sub2_Sub4_1.method443(this.anInt296 - 1, this.anInt297 + 3, 16777215, String.valueOf(local13.anIntArray266[local53]));
							}
						}
					}
				}
			}
			for (@Pc(563) int local563 = 0; local563 < this.anInt337; local563++) {
				local53 = this.anIntArray66[local563];
				@Pc(575) int local575 = this.anIntArray67[local563];
				local73 = this.anIntArray69[local563];
				@Pc(585) int local585 = this.anIntArray68[local563];
				@Pc(587) boolean local587 = true;
				while (local587) {
					local587 = false;
					for (@Pc(593) int local593 = 0; local593 < local563; local593++) {
						if (local575 + 2 > this.anIntArray67[local593] - this.anIntArray68[local593] && local575 - local585 < this.anIntArray67[local593] + 2 && local53 - local73 < this.anIntArray66[local593] + this.anIntArray69[local593] && local53 + local73 > this.anIntArray66[local593] - this.anIntArray69[local593] && this.anIntArray67[local593] - this.anIntArray68[local593] < local575) {
							local575 = this.anIntArray67[local593] - this.anIntArray68[local593];
							local587 = true;
						}
					}
				}
				this.anInt296 = this.anIntArray66[local563];
				this.anInt297 = this.anIntArray67[local563] = local575;
				@Pc(692) String local692 = this.aStringArray5[local563];
				if (this.anInt326 == 0) {
					@Pc(697) int local697 = 16776960;
					if (this.anIntArray70[local563] < 6) {
						local697 = this.anIntArray55[this.anIntArray70[local563]];
					}
					if (this.anIntArray70[local563] == 6) {
						local697 = this.anInt234 % 20 < 10 ? 16711680 : 16776960;
					}
					if (this.anIntArray70[local563] == 7) {
						local697 = this.anInt234 % 20 < 10 ? 255 : 65535;
					}
					if (this.anIntArray70[local563] == 8) {
						local697 = this.anInt234 % 20 < 10 ? 45056 : 8454016;
					}
					@Pc(772) int local772;
					if (this.anIntArray70[local563] == 9) {
						local772 = 150 - this.anIntArray72[local563];
						if (local772 < 50) {
							local697 = local772 * 1280 + 16711680;
						} else if (local772 < 100) {
							local697 = 16776960 - (local772 - 50) * 327680;
						} else if (local772 < 150) {
							local697 = (local772 - 100) * 5 + 65280;
						}
					}
					if (this.anIntArray70[local563] == 10) {
						local772 = 150 - this.anIntArray72[local563];
						if (local772 < 50) {
							local697 = local772 * 5 + 16711680;
						} else if (local772 < 100) {
							local697 = 16711935 - (local772 - 50) * 327680;
						} else if (local772 < 150) {
							local697 = (local772 - 100) * 327680 + 255 - (local772 - 100) * 5;
						}
					}
					if (this.anIntArray70[local563] == 11) {
						local772 = 150 - this.anIntArray72[local563];
						if (local772 < 50) {
							local697 = 16777215 - local772 * 327685;
						} else if (local772 < 100) {
							local697 = (local772 - 50) * 327685 + 65280;
						} else if (local772 < 150) {
							local697 = 16777215 - (local772 - 100) * 327680;
						}
					}
					if (this.anIntArray71[local563] == 0) {
						this.aClass1_Sub1_Sub2_Sub4_3.method443(this.anInt296, this.anInt297 + 1, 0, local692);
						this.aClass1_Sub1_Sub2_Sub4_3.method443(this.anInt296, this.anInt297, local697, local692);
					}
					if (this.anIntArray71[local563] == 1) {
						this.aClass1_Sub1_Sub2_Sub4_3.method447(local692, this.anInt297 + 1, this.anInt296, 0, this.anInt234);
						this.aClass1_Sub1_Sub2_Sub4_3.method447(local692, this.anInt297, this.anInt296, local697, this.anInt234);
					}
					if (this.anIntArray71[local563] == 2) {
						local772 = this.aClass1_Sub1_Sub2_Sub4_3.method445(local692);
						@Pc(993) int local993 = (150 - this.anIntArray72[local563]) * (local772 + 100) / 150;
						Class1_Sub1_Sub2.method433(334, this.anInt296 + 50, this.anInt296 - 50, 0);
						this.aClass1_Sub1_Sub2_Sub4_3.method446(this.anInt296 + 50 - local993, local692, 0, this.anInt297 + 1);
						this.aClass1_Sub1_Sub2_Sub4_3.method446(this.anInt296 + 50 - local993, local692, local697, this.anInt297);
						Class1_Sub1_Sub2.method432();
					}
				} else {
					this.aClass1_Sub1_Sub2_Sub4_3.method443(this.anInt296, this.anInt297 + 1, 0, local692);
					this.aClass1_Sub1_Sub2_Sub4_3.method443(this.anInt296, this.anInt297, 16776960, local692);
				}
			}
		} catch (@Pc(1070) RuntimeException local1070) {
			signlink.reporterror("404, " + 0 + ", " + local1070.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "I", descriptor = "(I)V")
	private void method198() {
		try {
			@Pc(6) int local6 = this.anInt235 * 128 + 64;
			@Pc(13) int local13 = this.anInt236 * 128 + 64;
			@Pc(24) int local24 = this.method132(local6, local13, this.anInt327) - this.anInt237;
			if (this.anInt217 < local6) {
				this.anInt217 += this.anInt238 + (local6 - this.anInt217) * this.anInt239 / 1000;
				if (this.anInt217 > local6) {
					this.anInt217 = local6;
				}
			}
			if (this.anInt217 > local6) {
				this.anInt217 -= this.anInt238 + (this.anInt217 - local6) * this.anInt239 / 1000;
				if (this.anInt217 < local6) {
					this.anInt217 = local6;
				}
			}
			if (this.anInt218 < local24) {
				this.anInt218 += this.anInt238 + (local24 - this.anInt218) * this.anInt239 / 1000;
				if (this.anInt218 > local24) {
					this.anInt218 = local24;
				}
			}
			if (this.anInt218 > local24) {
				this.anInt218 -= this.anInt238 + (this.anInt218 - local24) * this.anInt239 / 1000;
				if (this.anInt218 < local24) {
					this.anInt218 = local24;
				}
			}
			if (this.anInt219 < local13) {
				this.anInt219 += this.anInt238 + (local13 - this.anInt219) * this.anInt239 / 1000;
				if (this.anInt219 > local13) {
					this.anInt219 = local13;
				}
			}
			if (this.anInt219 > local13) {
				this.anInt219 -= this.anInt238 + (this.anInt219 - local13) * this.anInt239 / 1000;
				if (this.anInt219 < local13) {
					this.anInt219 = local13;
				}
			}
			local6 = this.anInt256 * 128 + 64;
			local13 = this.anInt257 * 128 + 64;
			local24 = this.method132(local6, local13, this.anInt327) - this.anInt258;
			@Pc(230) int local230 = local6 - this.anInt217;
			@Pc(235) int local235 = local24 - this.anInt218;
			@Pc(240) int local240 = local13 - this.anInt219;
			@Pc(251) int local251 = (int) Math.sqrt((double) (local230 * local230 + local240 * local240));
			@Pc(262) int local262 = (int) (Math.atan2((double) local235, (double) local251) * 325.949D) & 0x7FF;
			@Pc(273) int local273 = (int) (Math.atan2((double) local230, (double) local240) * -325.949D) & 0x7FF;
			if (local262 < 128) {
				local262 = 128;
			}
			if (local262 > 383) {
				local262 = 383;
			}
			if (this.anInt220 < local262) {
				this.anInt220 += this.anInt259 + (local262 - this.anInt220) * this.anInt260 / 1000;
				if (this.anInt220 > local262) {
					this.anInt220 = local262;
				}
			}
			if (this.anInt220 > local262) {
				this.anInt220 -= this.anInt259 + (this.anInt220 - local262) * this.anInt260 / 1000;
				if (this.anInt220 < local262) {
					this.anInt220 = local262;
				}
			}
			@Pc(344) int local344 = local273 - this.anInt221;
			if (local344 > 1024) {
				local344 -= 2048;
			}
			if (local344 < -1024) {
				local344 += 2048;
			}
			if (local344 > 0) {
				this.anInt221 += this.anInt259 + local344 * this.anInt260 / 1000;
				this.anInt221 &= 0x7FF;
			}
			if (local344 < 0) {
				this.anInt221 -= this.anInt259 + -local344 * this.anInt260 / 1000;
				this.anInt221 &= 0x7FF;
			}
			@Pc(402) int local402 = local273 - this.anInt221;
			if (local402 > 1024) {
				local402 -= 2048;
			}
			if (local402 < -1024) {
				local402 += 2048;
			}
			if (local402 < 0 && local344 > 0 || local402 > 0 && local344 < 0) {
				this.anInt221 = local273;
			}
		} catch (@Pc(423) RuntimeException local423) {
			signlink.reporterror("90079, " + -630 + ", " + local423.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "J", descriptor = "(I)V")
	private void method199() {
		try {
			@Pc(11) int local11;
			for (@Pc(3) int local3 = -1; local3 < this.anInt348; local3++) {
				if (local3 == -1) {
					local11 = this.anInt347;
				} else {
					local11 = this.anIntArray76[local3];
				}
				@Pc(23) Class1_Sub1_Sub1_Sub1_Sub1 local23 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local11];
				if (local23 != null && local23.anInt1001 > 0) {
					local23.anInt1001--;
					if (local23.anInt1001 == 0) {
						local23.aString31 = null;
					}
				}
			}
			for (local11 = 0; local11 < this.anInt416; local11++) {
				@Pc(54) int local54 = this.anIntArray92[local11];
				@Pc(59) Class1_Sub1_Sub1_Sub1_Sub2 local59 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local54];
				if (local59 != null && local59.anInt1001 > 0) {
					local59.anInt1001--;
					if (local59.anInt1001 == 0) {
						local59.aString31 = null;
					}
				}
			}
		} catch (@Pc(89) RuntimeException local89) {
			signlink.reporterror("27690, " + 46415 + ", " + local89.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "k", descriptor = "(Z)V")
	private void method200() {
		try {
			System.out.println("============");
			System.out.println("flame-cycle:" + this.anInt281);
			if (this.aClass44_Sub1_1 != null) {
				System.out.println("Od-cycle:" + this.aClass44_Sub1_1.anInt959);
			}
			System.out.println("loop-cycle:" + anInt207);
			System.out.println("draw-cycle:" + anInt227);
			System.out.println("ptype:" + this.anInt394);
			System.out.println("psize:" + this.anInt393);
			if (this.aClass8_1 != null) {
				this.aClass8_1.method251();
			}
			super.aBoolean40 = true;
		} catch (@Pc(80) RuntimeException local80) {
			signlink.reporterror("1965, " + true + ", " + local80.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(B)Ljava/awt/Component;")
	@Override
	protected Component method93(@OriginalArg(0) byte arg0) {
		try {
			if (arg0 == 7) {
				@Pc(4) boolean local4 = false;
			} else {
				this.anInt254 = -291;
			}
			if (signlink.mainapp == null) {
				return super.aFrame_Sub1_2 == null ? this : super.aFrame_Sub1_2;
			} else {
				return signlink.mainapp;
			}
		} catch (@Pc(22) RuntimeException local22) {
			signlink.reporterror("22916, " + arg0 + ", " + local22.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!lb;IB)V")
	private void method201(@OriginalArg(0) Class1_Sub1_Sub3 arg0, @OriginalArg(1) int arg1) {
		try {
			arg0.method483();
			@Pc(7) int local7 = arg0.method484(1);
			if (local7 != 0) {
				@Pc(21) int local21 = arg0.method484(2);
				if (local21 == 0) {
					this.anIntArray77[this.anInt349++] = this.anInt347;
				} else {
					@Pc(44) int local44;
					@Pc(54) int local54;
					if (local21 == 1) {
						local44 = arg0.method484(3);
						aClass1_Sub1_Sub1_Sub1_Sub1_1.method672(local44, false);
						local54 = arg0.method484(1);
						if (local54 == 1) {
							this.anIntArray77[this.anInt349++] = this.anInt347;
						}
					} else {
						@Pc(98) int local98;
						if (local21 == 2) {
							local44 = arg0.method484(3);
							aClass1_Sub1_Sub1_Sub1_Sub1_1.method672(local44, true);
							local54 = arg0.method484(3);
							aClass1_Sub1_Sub1_Sub1_Sub1_1.method672(local54, true);
							local98 = arg0.method484(1);
							if (local98 == 1) {
								this.anIntArray77[this.anInt349++] = this.anInt347;
							}
						} else if (local21 == 3) {
							this.anInt327 = arg0.method484(2);
							local44 = arg0.method484(7);
							local54 = arg0.method484(7);
							local98 = arg0.method484(1);
							aClass1_Sub1_Sub1_Sub1_Sub1_1.method671(local44, local98 == 1, local54);
							@Pc(154) int local154 = arg0.method484(1);
							if (local154 == 1) {
								this.anIntArray77[this.anInt349++] = this.anInt347;
							}
						}
					}
				}
			}
		} catch (@Pc(171) RuntimeException local171) {
			signlink.reporterror("75741, " + arg0 + ", " + arg1 + ", " + -85 + ", " + local171.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "K", descriptor = "(I)I")
	private int method202() {
		try {
			@Pc(10) int local10 = 3;
			if (this.anInt220 < 310) {
				@Pc(19) int local19 = this.anInt217 >> 7;
				@Pc(24) int local24 = this.anInt219 >> 7;
				@Pc(29) int local29 = aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt990 >> 7;
				@Pc(34) int local34 = aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt991 >> 7;
				if ((this.aByteArrayArrayArray7[this.anInt327][local19][local24] & 0x4) != 0) {
					local10 = this.anInt327;
				}
				@Pc(56) int local56;
				if (local29 > local19) {
					local56 = local29 - local19;
				} else {
					local56 = local19 - local29;
				}
				@Pc(69) int local69;
				if (local34 > local24) {
					local69 = local34 - local24;
				} else {
					local69 = local24 - local34;
				}
				@Pc(84) int local84;
				@Pc(86) int local86;
				if (local56 > local69) {
					local84 = local69 * 65536 / local56;
					local86 = 32768;
					while (local19 != local29) {
						if (local19 < local29) {
							local19++;
						} else if (local19 > local29) {
							local19--;
						}
						if ((this.aByteArrayArrayArray7[this.anInt327][local19][local24] & 0x4) != 0) {
							local10 = this.anInt327;
						}
						local86 += local84;
						if (local86 >= 65536) {
							local86 -= 65536;
							if (local24 < local34) {
								local24++;
							} else if (local24 > local34) {
								local24--;
							}
							if ((this.aByteArrayArrayArray7[this.anInt327][local19][local24] & 0x4) != 0) {
								local10 = this.anInt327;
							}
						}
					}
				} else {
					local84 = local56 * 65536 / local69;
					local86 = 32768;
					while (local24 != local34) {
						if (local24 < local34) {
							local24++;
						} else if (local24 > local34) {
							local24--;
						}
						if ((this.aByteArrayArrayArray7[this.anInt327][local19][local24] & 0x4) != 0) {
							local10 = this.anInt327;
						}
						local86 += local84;
						if (local86 >= 65536) {
							local86 -= 65536;
							if (local19 < local29) {
								local19++;
							} else if (local19 > local29) {
								local19--;
							}
							if ((this.aByteArrayArrayArray7[this.anInt327][local19][local24] & 0x4) != 0) {
								local10 = this.anInt327;
							}
						}
					}
				}
			}
			if ((this.aByteArrayArrayArray7[this.anInt327][aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt990 >> 7][aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt991 >> 7] & 0x4) != 0) {
				local10 = this.anInt327;
			}
			return local10;
		} catch (@Pc(252) RuntimeException local252) {
			signlink.reporterror("63505, " + -253 + ", " + local252.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "L", descriptor = "(I)I")
	private int method203() {
		try {
			@Pc(9) int local9 = this.method132(this.anInt217, this.anInt219, this.anInt327);
			this.anInt393 += 0;
			return local9 - this.anInt218 >= 800 || (this.aByteArrayArrayArray7[this.anInt327][this.anInt217 >> 7][this.anInt219 >> 7] & 0x4) == 0 ? 3 : this.anInt327;
		} catch (@Pc(45) RuntimeException local45) {
			signlink.reporterror("80487, " + 0 + ", " + local45.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "M", descriptor = "(I)V")
	private void method204(@OriginalArg(0) int arg0) {
		try {
			if (this.anInt208 > 1) {
				this.anInt208--;
			}
			if (this.anInt397 > 0) {
				this.anInt397--;
			}
			for (@Pc(22) int local22 = 0; local22 < 5 && this.method194(); local22++) {
			}
			if (this.aBoolean51) {
				@Pc(41) Object local41 = this.aClass11_1.anObject1;
				@Pc(66) int local66;
				@Pc(68) int local68;
				@Pc(70) int local70;
				@Pc(103) int local103;
				synchronized (this.aClass11_1.anObject1) {
					if (!aBoolean79) {
						this.aClass11_1.anInt534 = 0;
					} else if (super.anInt200 != 0 || this.aClass11_1.anInt534 >= 40) {
						this.aClass1_Sub1_Sub3_2.method462(222);
						this.aClass1_Sub1_Sub3_2.method463(0);
						local66 = this.aClass1_Sub1_Sub3_2.anInt743;
						local68 = 0;
						@Pc(86) int local86;
						for (local70 = 0; local70 < this.aClass11_1.anInt534 && local66 - this.aClass1_Sub1_Sub3_2.anInt743 < 240; local70++) {
							local68++;
							local86 = this.aClass11_1.anIntArray161[local70];
							if (local86 < 0) {
								local86 = 0;
							} else if (local86 > 502) {
								local86 = 502;
							}
							local103 = this.aClass11_1.anIntArray160[local70];
							if (local103 < 0) {
								local103 = 0;
							} else if (local103 > 764) {
								local103 = 764;
							}
							@Pc(120) int local120 = local86 * 765 + local103;
							if (this.aClass11_1.anIntArray161[local70] == -1 && this.aClass11_1.anIntArray160[local70] == -1) {
								local103 = -1;
								local86 = -1;
								local120 = 524287;
							}
							if (local103 != this.anInt401 || local86 != this.anInt402) {
								@Pc(165) int local165 = local103 - this.anInt401;
								this.anInt401 = local103;
								@Pc(173) int local173 = local86 - this.anInt402;
								this.anInt402 = local86;
								if (this.anInt289 < 8 && local165 >= -32 && local165 <= 31 && local173 >= -32 && local173 <= 31) {
									local165 += 32;
									local173 += 32;
									this.aClass1_Sub1_Sub3_2.method464((this.anInt289 << 12) + (local165 << 6) + local173);
									this.anInt289 = 0;
								} else if (this.anInt289 < 8) {
									this.aClass1_Sub1_Sub3_2.method466((this.anInt289 << 19) + local120 + 8388608);
									this.anInt289 = 0;
								} else {
									this.aClass1_Sub1_Sub3_2.method467((this.anInt289 << 19) + local120 - 1073741824);
									this.anInt289 = 0;
								}
							} else if (this.anInt289 < 2047) {
								this.anInt289++;
							}
						}
						this.aClass1_Sub1_Sub3_2.method472(this.aClass1_Sub1_Sub3_2.anInt743 - local66, this.anInt205);
						if (local68 >= this.aClass11_1.anInt534) {
							this.aClass11_1.anInt534 = 0;
						} else {
							this.aClass11_1.anInt534 -= local68;
							for (local86 = 0; local86 < this.aClass11_1.anInt534; local86++) {
								this.aClass11_1.anIntArray160[local86] = this.aClass11_1.anIntArray160[local86 + local68];
								this.aClass11_1.anIntArray161[local86] = this.aClass11_1.anIntArray161[local86 + local68];
							}
						}
					}
				}
				if (super.anInt200 != 0) {
					@Pc(337) long local337 = (super.aLong13 - this.aLong17) / 50L;
					if (local337 > 4095L) {
						local337 = 4095L;
					}
					this.aLong17 = super.aLong13;
					local66 = super.anInt202;
					if (local66 < 0) {
						local66 = 0;
					} else if (local66 > 502) {
						local66 = 502;
					}
					local68 = super.anInt201;
					if (local68 < 0) {
						local68 = 0;
					} else if (local68 > 764) {
						local68 = 764;
					}
					local70 = local66 * 765 + local68;
					@Pc(383) byte local383 = 0;
					if (super.anInt200 == 2) {
						local383 = 1;
					}
					local103 = (int) local337;
					this.aClass1_Sub1_Sub3_2.method462(20);
					this.aClass1_Sub1_Sub3_2.method467((local103 << 20) + (local383 << 19) + local70);
				}
				if (this.anInt308 > 0) {
					this.anInt308--;
				}
				if (super.anIntArray29[1] == 1 || super.anIntArray29[2] == 1 || super.anIntArray29[3] == 1 || super.anIntArray29[4] == 1) {
					this.aBoolean67 = true;
				}
				if (this.aBoolean67 && this.anInt308 <= 0) {
					this.anInt308 = 20;
					this.aBoolean67 = false;
					this.aClass1_Sub1_Sub3_2.method462(53);
					this.aClass1_Sub1_Sub3_2.method464(this.anInt385);
					this.aClass1_Sub1_Sub3_2.method464(this.anInt386);
				}
				if (super.aBoolean42 && !this.aBoolean57) {
					this.aBoolean57 = true;
					this.aClass1_Sub1_Sub3_2.method462(73);
					this.aClass1_Sub1_Sub3_2.method463(1);
				}
				if (!super.aBoolean42 && this.aBoolean57) {
					this.aBoolean57 = false;
					this.aClass1_Sub1_Sub3_2.method462(73);
					this.aClass1_Sub1_Sub3_2.method463(0);
				}
				this.method124(503);
				this.method226();
				this.method109();
				this.anInt395++;
				if (this.anInt395 > 750) {
					this.method153();
				}
				this.method186();
				this.method217();
				this.method199();
				this.anInt286++;
				if (this.anInt362 != 0) {
					this.anInt361 += 20;
					if (this.anInt361 >= 400) {
						this.anInt362 = 0;
					}
				}
				if (this.anInt232 != 0) {
					this.anInt229++;
					if (this.anInt229 >= 15) {
						if (this.anInt232 == 2) {
							this.aBoolean55 = true;
						}
						if (this.anInt232 == 3) {
							this.aBoolean73 = true;
						}
						this.anInt232 = 0;
					}
				}
				if (this.anInt249 != 0) {
					this.anInt410++;
					if (super.anInt195 > this.anInt250 + 5 || super.anInt195 < this.anInt250 - 5 || super.anInt196 > this.anInt251 + 5 || super.anInt196 < this.anInt251 - 5) {
						this.aBoolean76 = true;
					}
					if (super.anInt194 == 0) {
						if (this.anInt249 == 2) {
							this.aBoolean55 = true;
						}
						if (this.anInt249 == 3) {
							this.aBoolean73 = true;
						}
						this.anInt249 = 0;
						if (this.aBoolean76 && this.anInt410 >= 5) {
							this.anInt280 = -1;
							this.method150();
							if (this.anInt280 == this.anInt247 && this.anInt279 != this.anInt248) {
								@Pc(683) Class6 local683 = Class6.aClass6Array1[this.anInt247];
								@Pc(685) byte local685 = 0;
								if (this.anInt242 == 1 && local683.anInt424 == 206) {
									local685 = 1;
								}
								if (local683.anIntArray93[this.anInt279] <= 0) {
									local685 = 0;
								}
								if (local683.aBoolean98) {
									local66 = this.anInt248;
									local68 = this.anInt279;
									local683.anIntArray93[local68] = local683.anIntArray93[local66];
									local683.anIntArray94[local68] = local683.anIntArray94[local66];
									local683.anIntArray93[local66] = -1;
									local683.anIntArray94[local66] = 0;
								} else if (local685 == 1) {
									local66 = this.anInt248;
									local68 = this.anInt279;
									while (local66 != local68) {
										if (local66 > local68) {
											local683.method231(local66, local66 - 1, 865);
											local66--;
										} else if (local66 < local68) {
											local683.method231(local66, local66 + 1, 865);
											local66++;
										}
									}
								} else {
									local683.method231(this.anInt248, this.anInt279, 865);
								}
								this.aClass1_Sub1_Sub3_2.method462(93);
								this.aClass1_Sub1_Sub3_2.method464(this.anInt247);
								this.aClass1_Sub1_Sub3_2.method464(this.anInt248);
								this.aClass1_Sub1_Sub3_2.method464(this.anInt279);
								this.aClass1_Sub1_Sub3_2.method463(local685);
							}
						} else if ((this.anInt319 == 1 || this.method147(this.anInt287 - 1)) && this.anInt287 > 2) {
							this.method177();
						} else if (this.anInt287 > 0) {
							this.method142((byte) 6, this.anInt287 - 1);
						}
						this.anInt229 = 10;
						super.anInt200 = 0;
					}
				}
				anInt399++;
				if (anInt399 > 62) {
					anInt399 = 0;
					this.aClass1_Sub1_Sub3_2.method462(89);
				}
				@Pc(869) int local869;
				@Pc(871) int local871;
				if (Class37.anInt873 != -1) {
					local869 = Class37.anInt873;
					local871 = Class37.anInt874;
					@Pc(892) boolean local892 = this.method121(aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray270[0], local869, 0, 0, 0, aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray269[0], 0, true, 0, local871, (byte) 9, 0);
					Class37.anInt873 = -1;
					if (local892) {
						this.anInt359 = super.anInt201;
						this.anInt360 = super.anInt202;
						this.anInt362 = 1;
						this.anInt361 = 0;
					}
				}
				if (super.anInt200 == 1 && this.aString7 != null) {
					this.aString7 = null;
					this.aBoolean73 = true;
					super.anInt200 = 0;
				}
				this.method103((byte) 1);
				this.method212();
				this.method140();
				this.method120(this.aBoolean64);
				if (super.anInt194 == 1 || super.anInt200 == 1) {
					this.anInt291++;
				}
				if (this.anInt350 == 2) {
					this.method211();
				}
				if (this.anInt350 == 2 && this.aBoolean65) {
					this.method198();
				}
				for (local869 = 0; local869 < 5; local869++) {
					@Pc(979) int local979 = this.anIntArray51[local869]++;
				}
				this.method213();
				super.anInt193++;
				if (super.anInt193 > 4500) {
					this.anInt397 = 250;
					super.anInt193 -= 500;
					this.aClass1_Sub1_Sub3_2.method462(209);
				}
				this.anInt225++;
				if (arg0 < 5 || arg0 > 5) {
					this.anInt394 = this.aClass1_Sub1_Sub3_4.method473();
				}
				if (this.anInt225 > 500) {
					this.anInt225 = 0;
					local871 = (int) (Math.random() * 8.0D);
					if ((local871 & 0x1) == 1) {
						this.anInt407 += this.anInt408;
					}
					if ((local871 & 0x2) == 2) {
						this.anInt223 += this.anInt224;
					}
					if ((local871 & 0x4) == 4) {
						this.anInt244 += this.anInt245;
					}
				}
				if (this.anInt407 < -50) {
					this.anInt408 = 2;
				}
				if (this.anInt407 > 50) {
					this.anInt408 = -2;
				}
				if (this.anInt223 < -55) {
					this.anInt224 = 2;
				}
				if (this.anInt223 > 55) {
					this.anInt224 = -2;
				}
				if (this.anInt244 < -40) {
					this.anInt245 = 1;
				}
				if (this.anInt244 > 40) {
					this.anInt245 = -1;
				}
				this.anInt261++;
				if (this.anInt261 > 500) {
					this.anInt261 = 0;
					local871 = (int) (Math.random() * 8.0D);
					if ((local871 & 0x1) == 1) {
						this.anInt391 += this.anInt392;
					}
					if ((local871 & 0x2) == 2) {
						this.anInt371 += this.anInt372;
					}
				}
				if (this.anInt391 < -60) {
					this.anInt392 = 2;
				}
				if (this.anInt391 > 60) {
					this.anInt392 = -2;
				}
				if (this.anInt371 < -20) {
					this.anInt372 = 1;
				}
				if (this.anInt371 > 10) {
					this.anInt372 = -1;
				}
				this.anInt396++;
				if (this.anInt396 > 50) {
					this.aClass1_Sub1_Sub3_2.method462(120);
				}
				try {
					if (this.aClass8_1 != null && this.aClass1_Sub1_Sub3_2.anInt743 > 0) {
						this.aClass8_1.method250(this.aClass1_Sub1_Sub3_2.anInt743, this.aClass1_Sub1_Sub3_2.aByteArray9);
						this.aClass1_Sub1_Sub3_2.anInt743 = 0;
						this.anInt396 = 0;
					}
				} catch (@Pc(1232) IOException local1232) {
					this.method153();
				} catch (@Pc(1237) Exception local1237) {
					this.method162();
				}
			}
		} catch (@Pc(1242) RuntimeException local1242) {
			signlink.reporterror("15896, " + arg0 + ", " + local1242.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ZJ)V")
	private void method205(@OriginalArg(0) boolean arg0, @OriginalArg(1) long arg1) {
		try {
			if (arg0) {
				this.anInt394 = this.aClass1_Sub1_Sub3_4.method473();
			}
			if (arg1 != 0L) {
				for (@Pc(15) int local15 = 0; local15 < this.anInt278; local15++) {
					if (this.aLongArray3[local15] == arg1) {
						this.anInt278--;
						this.aBoolean55 = true;
						for (@Pc(35) int local35 = local15; local35 < this.anInt278; local35++) {
							this.aLongArray3[local35] = this.aLongArray3[local35 + 1];
						}
						this.aClass1_Sub1_Sub3_2.method462(101);
						this.aClass1_Sub1_Sub3_2.method469(arg1);
						return;
					}
				}
			}
		} catch (@Pc(70) RuntimeException local70) {
			signlink.reporterror("59118, " + arg0 + ", " + arg1 + ", " + local70.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(IIII)I")
	private int method206(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		try {
			@Pc(7) int local7 = 256 - arg1;
			return ((arg0 & 0xFF00FF) * local7 + (arg2 & 0xFF00FF) * arg1 & 0xFF00FF00) + ((arg0 & 0xFF00) * local7 + (arg2 & 0xFF00) * arg1 & 0xFF0000) >> 8;
		} catch (@Pc(38) RuntimeException local38) {
			signlink.reporterror("34001, " + arg0 + ", " + arg1 + ", " + 264 + ", " + arg2 + ", " + local38.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "N", descriptor = "(I)V")
	private void method207() {
		try {
			Class9.aClass40_4.method586();
			Class9.aClass40_5.method586();
			Class13.aClass40_6.method586();
			Class15.aClass40_7.method586();
			Class15.aClass40_8.method586();
			Class1_Sub1_Sub1_Sub1_Sub1.aClass40_1.method586();
			Class33.aClass40_9.method586();
		} catch (@Pc(25) RuntimeException local25) {
			signlink.reporterror("91388, " + -501 + ", " + local25.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "O", descriptor = "(I)V")
	private void method208() {
		try {
			if (this.anInt384 == 2) {
				this.method112((this.anInt366 - this.anInt322 << 7) + this.anInt369, (this.anInt367 - this.anInt323 << 7) + this.anInt370, this.anInt368 * 2);
				if (this.anInt296 > -1 && anInt207 % 20 < 10) {
					this.aClass1_Sub1_Sub2_Sub2Array5[2].method388(this.aByte14, this.anInt296 - 12, this.anInt297 - 28);
				}
			}
		} catch (@Pc(65) RuntimeException local65) {
			signlink.reporterror("39842, " + 6905 + ", " + local65.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILclient!d;IIB)V")
	private void method209(@OriginalArg(0) int arg0, @OriginalArg(1) Class6 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		try {
			if (arg1.anInt422 == 0 && arg1.anIntArray97 != null && (!arg1.aBoolean93 || this.anInt409 == arg1.anInt420 || this.anInt305 == arg1.anInt420 || this.anInt330 == arg1.anInt420)) {
				@Pc(29) int local29 = Class1_Sub1_Sub2.anInt700;
				@Pc(31) int local31 = Class1_Sub1_Sub2.anInt698;
				@Pc(33) int local33 = Class1_Sub1_Sub2.anInt701;
				@Pc(35) int local35 = Class1_Sub1_Sub2.anInt699;
				Class1_Sub1_Sub2.method433(arg2 + arg1.anInt426, arg0 + arg1.anInt425, arg0, arg2);
				@Pc(51) int local51 = arg1.anIntArray97.length;
				for (@Pc(53) int local53 = 0; local53 < local51; local53++) {
					@Pc(62) int local62 = arg1.anIntArray98[local53] + arg0;
					@Pc(71) int local71 = arg1.anIntArray99[local53] + arg2 - arg3;
					@Pc(78) Class6 local78 = Class6.aClass6Array1[arg1.anIntArray97[local53]];
					@Pc(83) int local83 = local62 + local78.anInt427;
					@Pc(88) int local88 = local71 + local78.anInt428;
					if (local78.anInt424 > 0) {
						this.method117(local78);
					}
					if (local78.anInt422 == 0) {
						if (local78.anInt431 > local78.anInt430 - local78.anInt426) {
							local78.anInt431 = local78.anInt430 - local78.anInt426;
						}
						if (local78.anInt431 < 0) {
							local78.anInt431 = 0;
						}
						this.method209(local83, local78, local88, local78.anInt431);
						if (local78.anInt430 > local78.anInt426) {
							this.method138(local78.anInt431, local88, local78.anInt430, local83 + local78.anInt425, local78.anInt426);
						}
					} else if (local78.anInt422 != 1) {
						@Pc(160) int local160;
						@Pc(164) int local164;
						@Pc(175) int local175;
						@Pc(210) int local210;
						@Pc(217) int local217;
						@Pc(158) int local158;
						@Pc(208) int local208;
						if (local78.anInt422 == 2) {
							local158 = 0;
							for (local160 = 0; local160 < local78.anInt426; local160++) {
								for (local164 = 0; local164 < local78.anInt425; local164++) {
									local175 = local83 + local164 * (local78.anInt433 + 32);
									@Pc(184) int local184 = local88 + local160 * (local78.anInt434 + 32);
									if (local158 < 20) {
										local175 += local78.anIntArray100[local158];
										local184 += local78.anIntArray101[local158];
									}
									if (local78.anIntArray93[local158] > 0) {
										local208 = 0;
										local210 = 0;
										local217 = local78.anIntArray93[local158] - 1;
										if (local175 > Class1_Sub1_Sub2.anInt700 - 32 && local175 < Class1_Sub1_Sub2.anInt701 && local184 > Class1_Sub1_Sub2.anInt698 - 32 && local184 < Class1_Sub1_Sub2.anInt699 || this.anInt249 != 0 && this.anInt248 == local158) {
											@Pc(242) int local242 = 0;
											if (this.anInt212 == 1 && this.anInt213 == local158 && this.anInt214 == local78.anInt420) {
												local242 = 16777215;
											}
											@Pc(266) Class1_Sub1_Sub2_Sub2 local266 = Class15.method364(local217, local242, local78.anIntArray94[local158]);
											if (local266 != null) {
												@Pc(345) int local345;
												if (this.anInt249 != 0 && this.anInt248 == local158 && this.anInt247 == local78.anInt420) {
													local208 = super.anInt195 - this.anInt250;
													local210 = super.anInt196 - this.anInt251;
													if (local208 < 5 && local208 > -5) {
														local208 = 0;
													}
													if (local210 < 5 && local210 > -5) {
														local210 = 0;
													}
													if (this.anInt410 < 5) {
														local208 = 0;
														local210 = 0;
													}
													local266.method390(local184 + local210, local175 + local208);
													if (local184 + local210 < Class1_Sub1_Sub2.anInt698 && arg1.anInt431 > 0) {
														local345 = this.anInt286 * (Class1_Sub1_Sub2.anInt698 - local184 - local210) / 3;
														if (local345 > this.anInt286 * 10) {
															local345 = this.anInt286 * 10;
														}
														if (local345 > arg1.anInt431) {
															local345 = arg1.anInt431;
														}
														arg1.anInt431 -= local345;
														this.anInt251 += local345;
													}
													if (local184 + local210 + 32 > Class1_Sub1_Sub2.anInt699 && arg1.anInt431 < arg1.anInt430 - arg1.anInt426) {
														local345 = this.anInt286 * (local184 + local210 + 32 - Class1_Sub1_Sub2.anInt699) / 3;
														if (local345 > this.anInt286 * 10) {
															local345 = this.anInt286 * 10;
														}
														if (local345 > arg1.anInt430 - arg1.anInt426 - arg1.anInt431) {
															local345 = arg1.anInt430 - arg1.anInt426 - arg1.anInt431;
														}
														arg1.anInt431 += local345;
														this.anInt251 -= local345;
													}
												} else if (this.anInt232 != 0 && this.anInt231 == local158 && this.anInt230 == local78.anInt420) {
													local266.method390(local184, local175);
												} else {
													local266.method388(this.aByte14, local175, local184);
												}
												if (local266.anInt651 == 33 || local78.anIntArray94[local158] != 1) {
													local345 = local78.anIntArray94[local158];
													this.aClass1_Sub1_Sub2_Sub4_1.method446(local175 + local208 + 1, method192(local345), 0, local184 + local210 + 10);
													this.aClass1_Sub1_Sub2_Sub4_1.method446(local175 + local208, method192(local345), 16776960, local184 + local210 + 9);
												}
											}
										}
									} else if (local78.aClass1_Sub1_Sub2_Sub2Array8 != null && local158 < 20) {
										@Pc(535) Class1_Sub1_Sub2_Sub2 local535 = local78.aClass1_Sub1_Sub2_Sub2Array8[local158];
										if (local535 != null) {
											local535.method388(this.aByte14, local175, local184);
										}
									}
									local158++;
								}
							}
						} else if (local78.anInt422 == 3) {
							@Pc(562) boolean local562 = false;
							if (this.anInt330 == local78.anInt420 || this.anInt305 == local78.anInt420 || this.anInt409 == local78.anInt420) {
								local562 = true;
							}
							if (this.method216(local78)) {
								local158 = local78.anInt436;
								if (local562 && local78.anInt438 != 0) {
									local158 = local78.anInt438;
								}
							} else {
								local158 = local78.anInt435;
								if (local562 && local78.anInt437 != 0) {
									local158 = local78.anInt437;
								}
							}
							if (local78.aByte20 == 0) {
								if (local78.aBoolean99) {
									Class1_Sub1_Sub2.method436(local78.anInt426, local158, local78.anInt425, local83, local88);
								} else {
									Class1_Sub1_Sub2.method437(local78.anInt425, local158, local78.anInt426, local83, local88);
								}
							} else if (local78.aBoolean99) {
								Class1_Sub1_Sub2.method435(local78.anInt425, local78.anInt426, local88, local158, local83, 256 - (local78.aByte20 & 0xFF));
							} else {
								Class1_Sub1_Sub2.method438(local78.anInt425, local88, local83, local158, local78.anInt426, 256 - (local78.aByte20 & 0xFF));
							}
						} else {
							@Pc(680) Class1_Sub1_Sub2_Sub4 local680;
							if (local78.anInt422 == 4) {
								local680 = local78.aClass1_Sub1_Sub2_Sub4_5;
								@Pc(683) String local683 = local78.aString18;
								@Pc(685) boolean local685 = false;
								if (this.anInt330 == local78.anInt420 || this.anInt305 == local78.anInt420 || this.anInt409 == local78.anInt420) {
									local685 = true;
								}
								if (this.method216(local78)) {
									local160 = local78.anInt436;
									if (local685 && local78.anInt438 != 0) {
										local160 = local78.anInt438;
									}
									if (local78.aString19.length() > 0) {
										local683 = local78.aString19;
									}
								} else {
									local160 = local78.anInt435;
									if (local685 && local78.anInt437 != 0) {
										local160 = local78.anInt437;
									}
								}
								if (local78.anInt423 == 6 && this.aBoolean80) {
									local683 = "Please wait...";
									local160 = local78.anInt435;
								}
								if (Class1_Sub1_Sub2.anInt696 == 479) {
									if (local160 == 16776960) {
										local160 = 255;
									}
									if (local160 == 49152) {
										local160 = 16777215;
									}
								}
								local208 = local88 + local680.anInt710;
								while (local683.length() > 0) {
									if (local683.indexOf("%") != -1) {
										label347: while (true) {
											local210 = local683.indexOf("%1");
											if (local210 == -1) {
												while (true) {
													local210 = local683.indexOf("%2");
													if (local210 == -1) {
														while (true) {
															local210 = local683.indexOf("%3");
															if (local210 == -1) {
																while (true) {
																	local210 = local683.indexOf("%4");
																	if (local210 == -1) {
																		while (true) {
																			local210 = local683.indexOf("%5");
																			if (local210 == -1) {
																				break label347;
																			}
																			local683 = local683.substring(0, local210) + this.method108(this.aByte18, this.method116(local78, 4)) + local683.substring(local210 + 2);
																		}
																	}
																	local683 = local683.substring(0, local210) + this.method108(this.aByte18, this.method116(local78, 3)) + local683.substring(local210 + 2);
																}
															}
															local683 = local683.substring(0, local210) + this.method108(this.aByte18, this.method116(local78, 2)) + local683.substring(local210 + 2);
														}
													}
													local683 = local683.substring(0, local210) + this.method108(this.aByte18, this.method116(local78, 1)) + local683.substring(local210 + 2);
												}
											}
											local683 = local683.substring(0, local210) + this.method108(this.aByte18, this.method116(local78, 0)) + local683.substring(local210 + 2);
										}
									}
									local210 = local683.indexOf("\\n");
									@Pc(962) String local962;
									if (local210 == -1) {
										local962 = local683;
										local683 = "";
									} else {
										local962 = local683.substring(0, local210);
										local683 = local683.substring(local210 + 2);
									}
									if (local78.aBoolean100) {
										local680.method444(local83 + local78.anInt425 / 2, local208, local962, local160, local78.aBoolean101);
									} else {
										local680.method448(local962, this.anInt315, local78.aBoolean101, local208, local83, local160);
									}
									local208 += local680.anInt710;
								}
							} else if (local78.anInt422 == 5) {
								@Pc(1025) Class1_Sub1_Sub2_Sub2 local1025;
								if (this.method216(local78)) {
									local1025 = local78.aClass1_Sub1_Sub2_Sub2_15;
								} else {
									local1025 = local78.aClass1_Sub1_Sub2_Sub2_14;
								}
								if (local1025 != null) {
									local1025.method388(this.aByte14, local83, local88);
								}
							} else if (local78.anInt422 == 6) {
								local158 = Class1_Sub1_Sub2_Sub1.anInt589;
								local160 = Class1_Sub1_Sub2_Sub1.anInt590;
								Class1_Sub1_Sub2_Sub1.anInt589 = local83 + local78.anInt425 / 2;
								Class1_Sub1_Sub2_Sub1.anInt590 = local88 + local78.anInt426 / 2;
								local164 = Class1_Sub1_Sub2_Sub1.anIntArray175[local78.anInt446] * local78.anInt445 >> 16;
								local175 = Class1_Sub1_Sub2_Sub1.anIntArray176[local78.anInt446] * local78.anInt445 >> 16;
								@Pc(1087) boolean local1087 = this.method216(local78);
								if (local1087) {
									local208 = local78.anInt444;
								} else {
									local208 = local78.anInt443;
								}
								@Pc(1107) Class1_Sub1_Sub1_Sub5 local1107;
								if (local208 == -1) {
									local1107 = local78.method232(-1, -1, local1087);
								} else {
									@Pc(1113) Class27 local1113 = Class27.aClass27Array1[local208];
									local1107 = local78.method232(local1113.anIntArray222[local78.anInt418], local1113.anIntArray223[local78.anInt418], local1087);
								}
								if (local1107 != null) {
									local1107.method280(local78.anInt447, 0, local78.anInt446, 0, local164, local175);
								}
								Class1_Sub1_Sub2_Sub1.anInt589 = local158;
								Class1_Sub1_Sub2_Sub1.anInt590 = local160;
							} else if (local78.anInt422 == 7) {
								local680 = local78.aClass1_Sub1_Sub2_Sub4_5;
								local160 = 0;
								for (local164 = 0; local164 < local78.anInt426; local164++) {
									for (local175 = 0; local175 < local78.anInt425; local175++) {
										if (local78.anIntArray93[local160] > 0) {
											@Pc(1177) Class15 local1177 = Class15.method358(local78.anIntArray93[local160] - 1);
											@Pc(1180) String local1180 = local1177.aString25;
											if (local1177.aBoolean152 || local78.anIntArray94[local160] != 1) {
												local1180 = local1180 + " x" + method179(local78.anIntArray94[local160], this.aBoolean89);
											}
											local210 = local83 + local175 * (local78.anInt433 + 115);
											local217 = local88 + local164 * (local78.anInt434 + 12);
											if (local78.aBoolean100) {
												local680.method444(local210 + local78.anInt425 / 2, local217, local1180, local78.anInt435, local78.aBoolean101);
											} else {
												local680.method448(local1180, this.anInt315, local78.aBoolean101, local217, local210, local78.anInt435);
											}
										}
										local160++;
									}
								}
							}
						}
					}
				}
				Class1_Sub1_Sub2.method433(local35, local33, local29, local31);
			}
		} catch (@Pc(1287) RuntimeException local1287) {
			signlink.reporterror("13951, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + 0 + ", " + local1287.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "P", descriptor = "(I)V")
	private void method210() {
		try {
			@Pc(19) int local19;
			if (this.anInt292 > 0) {
				for (local19 = 0; local19 < 256; local19++) {
					if (this.anInt292 > 768) {
						this.anIntArray45[local19] = this.method206(this.anIntArray46[local19], 1024 - this.anInt292, this.anIntArray47[local19]);
					} else if (this.anInt292 > 256) {
						this.anIntArray45[local19] = this.anIntArray47[local19];
					} else {
						this.anIntArray45[local19] = this.method206(this.anIntArray47[local19], 256 - this.anInt292, this.anIntArray46[local19]);
					}
				}
			} else if (this.anInt293 > 0) {
				for (local19 = 0; local19 < 256; local19++) {
					if (this.anInt293 > 768) {
						this.anIntArray45[local19] = this.method206(this.anIntArray46[local19], 1024 - this.anInt293, this.anIntArray48[local19]);
					} else if (this.anInt293 > 256) {
						this.anIntArray45[local19] = this.anIntArray48[local19];
					} else {
						this.anIntArray45[local19] = this.method206(this.anIntArray48[local19], 256 - this.anInt293, this.anIntArray46[local19]);
					}
				}
			} else {
				for (local19 = 0; local19 < 256; local19++) {
					this.anIntArray45[local19] = this.anIntArray46[local19];
				}
			}
			for (local19 = 0; local19 < 33920; local19++) {
				this.aClass35_22.anIntArray228[local19] = this.aClass1_Sub1_Sub2_Sub2_1.anIntArray205[local19];
			}
			@Pc(192) int local192 = 0;
			@Pc(194) int local194 = 1152;
			@Pc(209) int local209;
			@Pc(213) int local213;
			@Pc(223) int local223;
			@Pc(231) int local231;
			@Pc(235) int local235;
			@Pc(239) int local239;
			@Pc(250) int local250;
			for (@Pc(196) int local196 = 1; local196 < 255; local196++) {
				local209 = this.anIntArray43[local196] * (256 - local196) / 256;
				local213 = local209 + 22;
				if (local213 < 0) {
					local213 = 0;
				}
				local192 += local213;
				for (local223 = local213; local223 < 128; local223++) {
					local231 = this.anIntArray53[local192++];
					if (local231 == 0) {
						local194++;
					} else {
						local235 = local231;
						local239 = 256 - local231;
						local231 = this.anIntArray45[local231];
						local250 = this.aClass35_22.anIntArray228[local194];
						this.aClass35_22.anIntArray228[local194++] = ((local231 & 0xFF00FF) * local235 + (local250 & 0xFF00FF) * local239 & 0xFF00FF00) + ((local231 & 0xFF00) * local235 + (local250 & 0xFF00) * local239 & 0xFF0000) >> 8;
					}
				}
				local194 += local213;
			}
			this.aClass35_22.method518(0, super.aGraphics2, 0);
			for (local209 = 0; local209 < 33920; local209++) {
				this.aClass35_23.anIntArray228[local209] = this.aClass1_Sub1_Sub2_Sub2_2.anIntArray205[local209];
			}
			local192 = 0;
			local194 = 1176;
			for (local213 = 1; local213 < 255; local213++) {
				local223 = this.anIntArray43[local213] * (256 - local213) / 256;
				local231 = 103 - local223;
				local194 += local223;
				for (local235 = 0; local235 < local231; local235++) {
					local239 = this.anIntArray53[local192++];
					if (local239 == 0) {
						local194++;
					} else {
						local250 = local239;
						@Pc(373) int local373 = 256 - local239;
						local239 = this.anIntArray45[local239];
						@Pc(384) int local384 = this.aClass35_23.anIntArray228[local194];
						this.aClass35_23.anIntArray228[local194++] = ((local239 & 0xFF00FF) * local250 + (local384 & 0xFF00FF) * local373 & 0xFF00FF00) + ((local239 & 0xFF00) * local250 + (local384 & 0xFF00) * local373 & 0xFF0000) >> 8;
					}
				}
				local192 += 128 - local231;
				local194 += 128 - local231 - local223;
			}
			this.aClass35_23.method518(637, super.aGraphics2, 0);
		} catch (@Pc(456) RuntimeException local456) {
			signlink.reporterror("77895, " + 35604 + ", " + local456.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "l", descriptor = "(Z)V")
	private void method211() {
		try {
			this.aBoolean51 &= true;
			try {
				@Pc(13) int local13 = aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt990 + this.anInt407;
				@Pc(19) int local19 = aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt991 + this.anInt223;
				if (this.anInt306 - local13 < -500 || this.anInt306 - local13 > 500 || this.anInt307 - local19 < -500 || this.anInt307 - local19 > 500) {
					this.anInt306 = local13;
					this.anInt307 = local19;
				}
				if (this.anInt306 != local13) {
					this.anInt306 += (local13 - this.anInt306) / 16;
				}
				if (this.anInt307 != local19) {
					this.anInt307 += (local19 - this.anInt307) / 16;
				}
				if (super.anIntArray29[1] == 1) {
					this.anInt387 += (-this.anInt387 - 24) / 2;
				} else if (super.anIntArray29[2] == 1) {
					this.anInt387 += (24 - this.anInt387) / 2;
				} else {
					this.anInt387 /= 2;
				}
				if (super.anIntArray29[3] == 1) {
					this.anInt388 += (12 - this.anInt388) / 2;
				} else if (super.anIntArray29[4] == 1) {
					this.anInt388 += (-this.anInt388 - 12) / 2;
				} else {
					this.anInt388 /= 2;
				}
				this.anInt386 = this.anInt386 + this.anInt387 / 2 & 0x7FF;
				this.anInt385 += this.anInt388 / 2;
				if (this.anInt385 < 128) {
					this.anInt385 = 128;
				}
				if (this.anInt385 > 383) {
					this.anInt385 = 383;
				}
				@Pc(206) int local206 = this.anInt306 >> 7;
				@Pc(211) int local211 = this.anInt307 >> 7;
				@Pc(221) int local221 = this.method132(this.anInt306, this.anInt307, this.anInt327);
				@Pc(223) int local223 = 0;
				@Pc(239) int local239;
				if (local206 > 3 && local211 > 3 && local206 < 100 && local211 < 100) {
					for (local239 = local206 - 4; local239 <= local206 + 4; local239++) {
						for (@Pc(245) int local245 = local211 - 4; local245 <= local211 + 4; local245++) {
							@Pc(250) int local250 = this.anInt327;
							if (local250 < 3 && (this.aByteArrayArrayArray7[1][local239][local245] & 0x2) == 2) {
								local250++;
							}
							@Pc(277) int local277 = local221 - this.anIntArrayArrayArray5[local250][local239][local245];
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
				if (local239 > this.anInt332) {
					this.anInt332 += (local239 - this.anInt332) / 24;
				} else if (local239 < this.anInt332) {
					this.anInt332 += (local239 - this.anInt332) / 80;
				}
			} catch (@Pc(341) Exception local341) {
				signlink.reporterror("glfc_ex " + aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt990 + "," + aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt991 + "," + this.anInt306 + "," + this.anInt307 + "," + this.anInt266 + "," + this.anInt267 + "," + this.anInt322 + "," + this.anInt323);
				throw new RuntimeException("eek");
			}
		} catch (@Pc(391) RuntimeException local391) {
			signlink.reporterror("6574, " + true + ", " + local391.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "Q", descriptor = "(I)V")
	private void method212() {
		try {
			if (this.anInt374 != -48671) {
				this.method88();
			}
			if (this.anInt314 == 0 && super.anInt200 == 1) {
				@Pc(20) int local20 = super.anInt201 - 25 - 550;
				@Pc(27) int local27 = super.anInt202 - 5 - 4;
				if (local20 >= 0 && local27 >= 0 && local20 < 146 && local27 < 151) {
					local20 -= 73;
					local27 -= 75;
					@Pc(47) int local47 = this.anInt386 + this.anInt391 & 0x7FF;
					@Pc(51) int local51 = Class1_Sub1_Sub2_Sub1.anIntArray175[local47];
					@Pc(55) int local55 = Class1_Sub1_Sub2_Sub1.anIntArray176[local47];
					@Pc(64) int local64 = local51 * (this.anInt371 + 256) >> 8;
					@Pc(73) int local73 = local55 * (this.anInt371 + 256) >> 8;
					@Pc(83) int local83 = local27 * local64 + local20 * local73 >> 11;
					@Pc(93) int local93 = local27 * local73 - local20 * local64 >> 11;
					@Pc(100) int local100 = aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt990 + local83 >> 7;
					@Pc(107) int local107 = aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt991 - local93 >> 7;
					@Pc(128) boolean local128 = this.method121(aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray270[0], local100, 0, 0, 0, aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray269[0], 0, true, 0, local107, (byte) 9, 1);
					if (local128) {
						this.aClass1_Sub1_Sub3_2.method463(local20);
						this.aClass1_Sub1_Sub3_2.method463(local27);
						this.aClass1_Sub1_Sub3_2.method464(this.anInt386);
						this.aClass1_Sub1_Sub3_2.method463(57);
						this.aClass1_Sub1_Sub3_2.method463(this.anInt391);
						this.aClass1_Sub1_Sub3_2.method463(this.anInt371);
						this.aClass1_Sub1_Sub3_2.method463(89);
						this.aClass1_Sub1_Sub3_2.method464(aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt990);
						this.aClass1_Sub1_Sub3_2.method464(aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt991);
						this.aClass1_Sub1_Sub3_2.method463(this.anInt300);
						this.aClass1_Sub1_Sub3_2.method463(63);
						return;
					}
				}
			}
		} catch (@Pc(182) RuntimeException local182) {
			signlink.reporterror("37839, " + -48671 + ", " + local182.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "j", descriptor = "(B)V")
	private void method213() {
		try {
			anInt318++;
			if (anInt318 > 192) {
				anInt318 = 0;
				this.aClass1_Sub1_Sub3_2.method462(230);
				this.aClass1_Sub1_Sub3_2.method463(232);
			}
			while (true) {
				@Pc(34) int local34;
				do {
					while (true) {
						local34 = this.method87();
						if (local34 == -1) {
							return;
						}
						if (this.anInt317 != -1 && this.anInt317 == this.anInt334) {
							if (local34 == 8 && this.aString10.length() > 0) {
								this.aString10 = this.aString10.substring(0, this.aString10.length() - 1);
							}
							break;
						}
						@Pc(214) int local214;
						if (this.aBoolean90) {
							if (local34 >= 32 && local34 <= 122 && this.aString11.length() < 80) {
								this.aString11 = this.aString11 + (char) local34;
								this.aBoolean73 = true;
							}
							if (local34 == 8 && this.aString11.length() > 0) {
								this.aString11 = this.aString11.substring(0, this.aString11.length() - 1);
								this.aBoolean73 = true;
							}
							if (local34 == 13 || local34 == 10) {
								this.aBoolean90 = false;
								this.aBoolean73 = true;
								@Pc(174) long local174;
								if (this.anInt320 == 1) {
									local174 = Class48.method660(this.aString11);
									this.method184(199, local174);
								}
								if (this.anInt320 == 2 && this.anInt344 > 0) {
									local174 = Class48.method660(this.aString11);
									this.method144(local174);
								}
								if (this.anInt320 == 3 && this.aString11.length() > 0) {
									this.aClass1_Sub1_Sub3_2.method462(139);
									this.aClass1_Sub1_Sub3_2.method463(0);
									local214 = this.aClass1_Sub1_Sub3_2.anInt743;
									this.aClass1_Sub1_Sub3_2.method469(this.aLong14);
									Class49.method678(this.aString11, this.aClass1_Sub1_Sub3_2);
									this.aClass1_Sub1_Sub3_2.method472(this.aClass1_Sub1_Sub3_2.anInt743 - local214, this.anInt205);
									this.aString11 = Class48.method665(this.aString11);
									this.aString11 = Class42.method597(this.aString11);
									this.method131(6, Class48.method664(Class48.method661(this.aLong14)), this.aString11);
									if (this.anInt285 == 2) {
										this.anInt285 = 1;
										this.aBoolean75 = true;
										this.aClass1_Sub1_Sub3_2.method462(154);
										this.aClass1_Sub1_Sub3_2.method463(this.anInt282);
										this.aClass1_Sub1_Sub3_2.method463(this.anInt285);
										this.aClass1_Sub1_Sub3_2.method463(this.anInt209);
									}
								}
								if (this.anInt320 == 4 && this.anInt278 < 100) {
									local174 = Class48.method660(this.aString11);
									this.method178(local174);
								}
								if (this.anInt320 == 5 && this.anInt278 > 0) {
									local174 = Class48.method660(this.aString11);
									this.method205(this.aBoolean61, local174);
								}
							}
						} else if (this.aBoolean72) {
							if (local34 >= 48 && local34 <= 57 && this.aString16.length() < 10) {
								this.aString16 = this.aString16 + (char) local34;
								this.aBoolean73 = true;
							}
							if (local34 == 8 && this.aString16.length() > 0) {
								this.aString16 = this.aString16.substring(0, this.aString16.length() - 1);
								this.aBoolean73 = true;
							}
							if (local34 == 13 || local34 == 10) {
								if (this.aString16.length() > 0) {
									local214 = 0;
									try {
										local214 = Integer.parseInt(this.aString16);
									} catch (@Pc(392) Exception local392) {
									}
									this.aClass1_Sub1_Sub3_2.method462(102);
									this.aClass1_Sub1_Sub3_2.method467(local214);
								}
								this.aBoolean72 = false;
								this.aBoolean73 = true;
							}
						} else if (this.anInt303 == -1) {
							if (local34 >= 32 && local34 <= 122 && this.aString12.length() < 80) {
								this.aString12 = this.aString12 + (char) local34;
								this.aBoolean73 = true;
							}
							if (local34 == 8 && this.aString12.length() > 0) {
								this.aString12 = this.aString12.substring(0, this.aString12.length() - 1);
								this.aBoolean73 = true;
							}
							if ((local34 == 13 || local34 == 10) && this.aString12.length() > 0) {
								if (this.anInt233 == 2) {
									if (this.aString12.equals("::clientdrop")) {
										this.method153();
									}
									if (this.aString12.equals("::lag")) {
										this.method200();
									}
									if (this.aString12.equals("::prefetchmusic")) {
										for (local214 = 0; local214 < this.aClass44_Sub1_1.method631(anInt403, 2); local214++) {
											this.aClass44_Sub1_1.method641(local214, 2, (byte) 1);
										}
									}
								}
								if (this.aString12.startsWith("::")) {
									this.aClass1_Sub1_Sub3_2.method462(224);
									this.aClass1_Sub1_Sub3_2.method463(this.aString12.length() - 1);
									this.aClass1_Sub1_Sub3_2.method470(this.aString12.substring(2));
								} else {
									@Pc(543) byte local543 = 0;
									if (this.aString12.startsWith("yellow:")) {
										local543 = 0;
										this.aString12 = this.aString12.substring(7);
									}
									if (this.aString12.startsWith("red:")) {
										local543 = 1;
										this.aString12 = this.aString12.substring(4);
									}
									if (this.aString12.startsWith("green:")) {
										local543 = 2;
										this.aString12 = this.aString12.substring(6);
									}
									if (this.aString12.startsWith("cyan:")) {
										local543 = 3;
										this.aString12 = this.aString12.substring(5);
									}
									if (this.aString12.startsWith("purple:")) {
										local543 = 4;
										this.aString12 = this.aString12.substring(7);
									}
									if (this.aString12.startsWith("white:")) {
										local543 = 5;
										this.aString12 = this.aString12.substring(6);
									}
									if (this.aString12.startsWith("flash1:")) {
										local543 = 6;
										this.aString12 = this.aString12.substring(7);
									}
									if (this.aString12.startsWith("flash2:")) {
										local543 = 7;
										this.aString12 = this.aString12.substring(7);
									}
									if (this.aString12.startsWith("flash3:")) {
										local543 = 8;
										this.aString12 = this.aString12.substring(7);
									}
									if (this.aString12.startsWith("glow1:")) {
										local543 = 9;
										this.aString12 = this.aString12.substring(6);
									}
									if (this.aString12.startsWith("glow2:")) {
										local543 = 10;
										this.aString12 = this.aString12.substring(6);
									}
									if (this.aString12.startsWith("glow3:")) {
										local543 = 11;
										this.aString12 = this.aString12.substring(6);
									}
									@Pc(701) byte local701 = 0;
									if (this.aString12.startsWith("wave:")) {
										local701 = 1;
										this.aString12 = this.aString12.substring(5);
									}
									if (this.aString12.startsWith("scroll:")) {
										local701 = 2;
										this.aString12 = this.aString12.substring(7);
									}
									this.aClass1_Sub1_Sub3_2.method462(253);
									this.aClass1_Sub1_Sub3_2.method463(0);
									@Pc(740) int local740 = this.aClass1_Sub1_Sub3_2.anInt743;
									this.aClass1_Sub1_Sub3_2.method463(local543);
									this.aClass1_Sub1_Sub3_2.method463(local701);
									Class49.method678(this.aString12, this.aClass1_Sub1_Sub3_2);
									this.aClass1_Sub1_Sub3_2.method472(this.aClass1_Sub1_Sub3_2.anInt743 - local740, this.anInt205);
									this.aString12 = Class48.method665(this.aString12);
									this.aString12 = Class42.method597(this.aString12);
									aClass1_Sub1_Sub1_Sub1_Sub1_1.aString31 = this.aString12;
									aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt1002 = local543;
									aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt1003 = local701;
									aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt1001 = 150;
									if (this.anInt233 == 2) {
										this.method131(2, "@cr2@" + aClass1_Sub1_Sub1_Sub1_Sub1_1.aString3, aClass1_Sub1_Sub1_Sub1_Sub1_1.aString31);
									} else if (this.anInt233 == 1) {
										this.method131(2, "@cr1@" + aClass1_Sub1_Sub1_Sub1_Sub1_1.aString3, aClass1_Sub1_Sub1_Sub1_Sub1_1.aString31);
									} else {
										this.method131(2, aClass1_Sub1_Sub1_Sub1_Sub1_1.aString3, aClass1_Sub1_Sub1_Sub1_Sub1_1.aString31);
									}
									if (this.anInt282 == 2) {
										this.anInt282 = 3;
										this.aBoolean75 = true;
										this.aClass1_Sub1_Sub3_2.method462(154);
										this.aClass1_Sub1_Sub3_2.method463(this.anInt282);
										this.aClass1_Sub1_Sub3_2.method463(this.anInt285);
										this.aClass1_Sub1_Sub3_2.method463(this.anInt209);
									}
								}
								this.aString12 = "";
								this.aBoolean73 = true;
							}
						}
					}
				} while ((local34 < 97 || local34 > 122) && (local34 < 65 || local34 > 90) && (local34 < 48 || local34 > 57) && local34 != 32);
				if (this.aString10.length() < 12) {
					this.aString10 = this.aString10 + (char) local34;
				}
			}
		} catch (@Pc(877) RuntimeException local877) {
			signlink.reporterror("50397, " + -39 + ", " + local877.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Ljava/lang/String;)V")
	private void method214(@OriginalArg(0) String arg0) {
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

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIILclient!gc;I)V")
	private void method215(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class13 arg2, @OriginalArg(4) int arg3) {
		try {
			if (this.anInt287 < 400) {
				@Pc(9) String local9 = arg2.aString24;
				if (arg2.anInt561 != 0) {
					local9 = local9 + method159(arg2.anInt561, aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt131) + " (level-" + arg2.anInt561 + ")";
				}
				if (this.anInt212 == 1) {
					this.aStringArray6[this.anInt287] = "Use " + this.aString5 + " with @yel@" + local9;
					this.anIntArray85[this.anInt287] = 829;
					this.anIntArray86[this.anInt287] = arg3;
					this.anIntArray83[this.anInt287] = arg0;
					this.anIntArray84[this.anInt287] = arg1;
					this.anInt287++;
				} else if (this.anInt381 != 1) {
					@Pc(155) int local155;
					if (arg2.aStringArray9 != null) {
						for (local155 = 4; local155 >= 0; local155--) {
							if (arg2.aStringArray9[local155] != null && !arg2.aStringArray9[local155].equalsIgnoreCase("attack")) {
								this.aStringArray6[this.anInt287] = arg2.aStringArray9[local155] + " @yel@" + local9;
								if (local155 == 0) {
									this.anIntArray85[this.anInt287] = 242;
								}
								if (local155 == 1) {
									this.anIntArray85[this.anInt287] = 209;
								}
								if (local155 == 2) {
									this.anIntArray85[this.anInt287] = 309;
								}
								if (local155 == 3) {
									this.anIntArray85[this.anInt287] = 852;
								}
								if (local155 == 4) {
									this.anIntArray85[this.anInt287] = 793;
								}
								this.anIntArray86[this.anInt287] = arg3;
								this.anIntArray83[this.anInt287] = arg0;
								this.anIntArray84[this.anInt287] = arg1;
								this.anInt287++;
							}
						}
					}
					if (arg2.aStringArray9 != null) {
						for (local155 = 4; local155 >= 0; local155--) {
							if (arg2.aStringArray9[local155] != null && arg2.aStringArray9[local155].equalsIgnoreCase("attack")) {
								@Pc(279) short local279 = 0;
								if (arg2.anInt561 > aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt131) {
									local279 = 2000;
								}
								this.aStringArray6[this.anInt287] = arg2.aStringArray9[local155] + " @yel@" + local9;
								if (local155 == 0) {
									this.anIntArray85[this.anInt287] = local279 + 242;
								}
								if (local155 == 1) {
									this.anIntArray85[this.anInt287] = local279 + 209;
								}
								if (local155 == 2) {
									this.anIntArray85[this.anInt287] = local279 + 309;
								}
								if (local155 == 3) {
									this.anIntArray85[this.anInt287] = local279 + 852;
								}
								if (local155 == 4) {
									this.anIntArray85[this.anInt287] = local279 + 793;
								}
								this.anIntArray86[this.anInt287] = arg3;
								this.anIntArray83[this.anInt287] = arg0;
								this.anIntArray84[this.anInt287] = arg1;
								this.anInt287++;
							}
						}
					}
					this.aStringArray6[this.anInt287] = "Examine @yel@" + local9;
					this.anIntArray85[this.anInt287] = 1714;
					this.anIntArray86[this.anInt287] = arg3;
					this.anIntArray83[this.anInt287] = arg0;
					this.anIntArray84[this.anInt287] = arg1;
					this.anInt287++;
				} else if ((this.anInt383 & 0x2) == 2) {
					this.aStringArray6[this.anInt287] = this.aString17 + " @yel@" + local9;
					this.anIntArray85[this.anInt287] = 240;
					this.anIntArray86[this.anInt287] = arg3;
					this.anIntArray83[this.anInt287] = arg0;
					this.anIntArray84[this.anInt287] = arg1;
					this.anInt287++;
					return;
				}
			}
		} catch (@Pc(429) RuntimeException local429) {
			signlink.reporterror("86459, " + 0 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local429.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Lclient!d;I)Z")
	private boolean method216(@OriginalArg(0) Class6 arg0) {
		try {
			if (arg0.anIntArray95 == null) {
				return false;
			}
			for (@Pc(8) int local8 = 0; local8 < arg0.anIntArray95.length; local8++) {
				@Pc(16) int local16 = this.method116(arg0, local8);
				@Pc(21) int local21 = arg0.anIntArray96[local8];
				if (arg0.anIntArray95[local8] == 2) {
					if (local16 >= local21) {
						return false;
					}
				} else if (arg0.anIntArray95[local8] == 3) {
					if (local16 <= local21) {
						return false;
					}
				} else if (arg0.anIntArray95[local8] == 4) {
					if (local16 == local21) {
						return false;
					}
				} else if (local16 != local21) {
					return false;
				}
			}
			return true;
		} catch (@Pc(77) RuntimeException local77) {
			signlink.reporterror("6842, " + arg0 + ", " + 717 + ", " + local77.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "k", descriptor = "(B)V")
	private void method217() {
		try {
			for (@Pc(1) int local1 = 0; local1 < this.anInt416; local1++) {
				@Pc(8) int local8 = this.anIntArray92[local1];
				@Pc(13) Class1_Sub1_Sub1_Sub1_Sub2 local13 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local8];
				if (local13 != null) {
					this.method218(local13, local13.aClass13_2.aByte26);
				}
			}
		} catch (@Pc(35) RuntimeException local35) {
			signlink.reporterror("97194, " + -34 + ", " + local35.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Lclient!y;II)V")
	private void method218(@OriginalArg(0) Class1_Sub1_Sub1_Sub1 arg0, @OriginalArg(2) int arg1) {
		try {
			if (arg0.anInt990 < 128 || arg0.anInt991 < 128 || arg0.anInt990 >= 13184 || arg0.anInt991 >= 13184) {
				arg0.anInt1013 = -1;
				arg0.anInt1018 = -1;
				arg0.anInt1027 = 0;
				arg0.anInt1028 = 0;
				arg0.anInt990 = arg0.anIntArray269[0] * 128 + arg0.anInt993 * 64;
				arg0.anInt991 = arg0.anIntArray270[0] * 128 + arg0.anInt993 * 64;
				arg0.method673();
			}
			if (arg0 == aClass1_Sub1_Sub1_Sub1_Sub1_1 && (arg0.anInt990 < 1536 || arg0.anInt991 < 1536 || arg0.anInt990 >= 11776 || arg0.anInt991 >= 11776)) {
				arg0.anInt1013 = -1;
				arg0.anInt1018 = -1;
				arg0.anInt1027 = 0;
				arg0.anInt1028 = 0;
				arg0.anInt990 = arg0.anIntArray269[0] * 128 + arg0.anInt993 * 64;
				arg0.anInt991 = arg0.anIntArray270[0] * 128 + arg0.anInt993 * 64;
				arg0.method673();
			}
			if (arg0.anInt1027 > anInt207) {
				this.method219(arg0, 896);
			} else if (arg0.anInt1028 >= anInt207) {
				this.method220(arg0, this.anInt354);
			} else {
				this.method221(arg0);
			}
			this.method222(arg0);
			this.method223(arg0);
		} catch (@Pc(157) RuntimeException local157) {
			signlink.reporterror("92724, " + arg0 + ", " + 0 + ", " + arg1 + ", " + local157.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!y;I)V")
	private void method219(@OriginalArg(0) Class1_Sub1_Sub1_Sub1 arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(4) int local4 = arg0.anInt1027 - anInt207;
			@Pc(8) boolean local8 = false;
			@Pc(18) int local18 = arg0.anInt1023 * 128 + arg0.anInt993 * 64;
			@Pc(28) int local28 = arg0.anInt1025 * 128 + arg0.anInt993 * 64;
			arg0.anInt990 += (local18 - arg0.anInt990) / local4;
			arg0.anInt991 += (local28 - arg0.anInt991) / local4;
			arg0.anInt1035 = 0;
			if (arg0.anInt1029 == 0) {
				arg0.anInt1032 = 1024;
			}
			if (arg0.anInt1029 == 1) {
				arg0.anInt1032 = 1536;
			}
			if (arg0.anInt1029 == 2) {
				arg0.anInt1032 = 0;
			}
			if (arg0.anInt1029 == 3) {
				arg0.anInt1032 = 512;
			}
		} catch (@Pc(82) RuntimeException local82) {
			signlink.reporterror("16436, " + arg0 + ", " + arg1 + ", " + local82.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Lclient!y;I)V")
	private void method220(@OriginalArg(0) Class1_Sub1_Sub1_Sub1 arg0, @OriginalArg(1) int arg1) {
		try {
			this.anInt393 += arg1;
			if (arg0.anInt1028 == anInt207 || arg0.anInt1013 == -1 || arg0.anInt1016 != 0 || arg0.anInt1015 + 1 > Class27.aClass27Array1[arg0.anInt1013].method499(arg0.anInt1014)) {
				@Pc(35) int local35 = arg0.anInt1028 - arg0.anInt1027;
				@Pc(40) int local40 = anInt207 - arg0.anInt1027;
				@Pc(50) int local50 = arg0.anInt1023 * 128 + arg0.anInt993 * 64;
				@Pc(60) int local60 = arg0.anInt1025 * 128 + arg0.anInt993 * 64;
				@Pc(70) int local70 = arg0.anInt1024 * 128 + arg0.anInt993 * 64;
				@Pc(80) int local80 = arg0.anInt1026 * 128 + arg0.anInt993 * 64;
				arg0.anInt990 = (local50 * (local35 - local40) + local70 * local40) / local35;
				arg0.anInt991 = (local60 * (local35 - local40) + local80 * local40) / local35;
			}
			arg0.anInt1035 = 0;
			if (arg0.anInt1029 == 0) {
				arg0.anInt1032 = 1024;
			}
			if (arg0.anInt1029 == 1) {
				arg0.anInt1032 = 1536;
			}
			if (arg0.anInt1029 == 2) {
				arg0.anInt1032 = 0;
			}
			if (arg0.anInt1029 == 3) {
				arg0.anInt1032 = 512;
			}
			arg0.anInt992 = arg0.anInt1032;
		} catch (@Pc(142) RuntimeException local142) {
			signlink.reporterror("58495, " + arg0 + ", " + arg1 + ", " + local142.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILclient!y;)V")
	private void method221(@OriginalArg(1) Class1_Sub1_Sub1_Sub1 arg0) {
		try {
			arg0.anInt1010 = arg0.anInt994;
			if (arg0.anInt1034 == 0) {
				arg0.anInt1035 = 0;
			} else {
				if (arg0.anInt1013 != -1 && arg0.anInt1016 == 0) {
					@Pc(24) Class27 local24 = Class27.aClass27Array1[arg0.anInt1013];
					if (arg0.anInt1036 > 0 && local24.anInt801 == 0) {
						arg0.anInt1035++;
						return;
					}
					if (arg0.anInt1036 <= 0 && local24.anInt802 == 0) {
						arg0.anInt1035++;
						return;
					}
				}
				@Pc(53) int local53 = arg0.anInt990;
				@Pc(56) int local56 = arg0.anInt991;
				@Pc(71) int local71 = arg0.anIntArray269[arg0.anInt1034 - 1] * 128 + arg0.anInt993 * 64;
				@Pc(86) int local86 = arg0.anIntArray270[arg0.anInt1034 - 1] * 128 + arg0.anInt993 * 64;
				if (local71 - local53 <= 256 && local71 - local53 >= -256 && local86 - local56 <= 256 && local86 - local56 >= -256) {
					if (local53 < local71) {
						if (local56 < local86) {
							arg0.anInt1032 = 1280;
						} else if (local56 > local86) {
							arg0.anInt1032 = 1792;
						} else {
							arg0.anInt1032 = 1536;
						}
					} else if (local53 > local71) {
						if (local56 < local86) {
							arg0.anInt1032 = 768;
						} else if (local56 > local86) {
							arg0.anInt1032 = 256;
						} else {
							arg0.anInt1032 = 512;
						}
					} else if (local56 < local86) {
						arg0.anInt1032 = 1024;
					} else {
						arg0.anInt1032 = 0;
					}
					@Pc(180) int local180 = arg0.anInt1032 - arg0.anInt992 & 0x7FF;
					if (local180 > 1024) {
						local180 -= 2048;
					}
					@Pc(187) int local187 = arg0.anInt997;
					if (local180 >= -256 && local180 <= 256) {
						local187 = arg0.anInt996;
					} else if (local180 >= 256 && local180 < 768) {
						local187 = arg0.anInt999;
					} else if (local180 >= -768 && local180 <= -256) {
						local187 = arg0.anInt998;
					}
					if (local187 == -1) {
						local187 = arg0.anInt996;
					}
					arg0.anInt1010 = local187;
					@Pc(232) int local232 = 4;
					if (arg0.anInt992 != arg0.anInt1032 && arg0.anInt1007 == -1 && arg0.anInt1033 != 0) {
						local232 = 2;
					}
					if (arg0.anInt1034 > 2) {
						local232 = 6;
					}
					if (arg0.anInt1034 > 3) {
						local232 = 8;
					}
					if (arg0.anInt1035 > 0 && arg0.anInt1034 > 1) {
						local232 = 8;
						arg0.anInt1035--;
					}
					if (arg0.aBooleanArray12[arg0.anInt1034 - 1]) {
						local232 <<= 0x1;
					}
					if (local232 >= 8 && arg0.anInt1010 == arg0.anInt996 && arg0.anInt1000 != -1) {
						arg0.anInt1010 = arg0.anInt1000;
					}
					if (local53 < local71) {
						arg0.anInt990 += local232;
						if (arg0.anInt990 > local71) {
							arg0.anInt990 = local71;
						}
					} else if (local53 > local71) {
						arg0.anInt990 -= local232;
						if (arg0.anInt990 < local71) {
							arg0.anInt990 = local71;
						}
					}
					if (local56 < local86) {
						arg0.anInt991 += local232;
						if (arg0.anInt991 > local86) {
							arg0.anInt991 = local86;
						}
					} else if (local56 > local86) {
						arg0.anInt991 -= local232;
						if (arg0.anInt991 < local86) {
							arg0.anInt991 = local86;
						}
					}
					if (arg0.anInt990 == local71 && arg0.anInt991 == local86) {
						arg0.anInt1034--;
						if (arg0.anInt1036 > 0) {
							arg0.anInt1036--;
							return;
						}
					}
				} else {
					arg0.anInt990 = local71;
					arg0.anInt991 = local86;
				}
			}
		} catch (@Pc(394) RuntimeException local394) {
			signlink.reporterror("44237, " + 0 + ", " + arg0 + ", " + local394.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(Lclient!y;I)V")
	private void method222(@OriginalArg(0) Class1_Sub1_Sub1_Sub1 arg0) {
		try {
			if (arg0.anInt1033 != 0) {
				@Pc(35) int local35;
				@Pc(41) int local41;
				if (arg0.anInt1007 != -1 && arg0.anInt1007 < 32768) {
					@Pc(27) Class1_Sub1_Sub1_Sub1_Sub2 local27 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[arg0.anInt1007];
					if (local27 != null) {
						local35 = arg0.anInt990 - local27.anInt990;
						local41 = arg0.anInt991 - local27.anInt991;
						if (local35 != 0 || local41 != 0) {
							arg0.anInt1032 = (int) (Math.atan2((double) local35, (double) local41) * 325.949D) & 0x7FF;
						}
					}
				}
				@Pc(66) int local66;
				if (arg0.anInt1007 >= 32768) {
					local66 = arg0.anInt1007 - 32768;
					if (local66 == this.anInt276) {
						local66 = this.anInt347;
					}
					@Pc(78) Class1_Sub1_Sub1_Sub1_Sub1 local78 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local66];
					if (local78 != null) {
						local41 = arg0.anInt990 - local78.anInt990;
						@Pc(92) int local92 = arg0.anInt991 - local78.anInt991;
						if (local41 != 0 || local92 != 0) {
							arg0.anInt1032 = (int) (Math.atan2((double) local41, (double) local92) * 325.949D) & 0x7FF;
						}
					}
				}
				if ((arg0.anInt1008 != 0 || arg0.anInt1009 != 0) && (arg0.anInt1034 == 0 || arg0.anInt1035 > 0)) {
					local66 = arg0.anInt990 - (arg0.anInt1008 - this.anInt322 - this.anInt322) * 64;
					local35 = arg0.anInt991 - (arg0.anInt1009 - this.anInt323 - this.anInt323) * 64;
					if (local66 != 0 || local35 != 0) {
						arg0.anInt1032 = (int) (Math.atan2((double) local66, (double) local35) * 325.949D) & 0x7FF;
					}
					arg0.anInt1008 = 0;
					arg0.anInt1009 = 0;
				}
				local66 = arg0.anInt1032 - arg0.anInt992 & 0x7FF;
				if (local66 != 0) {
					if (local66 < arg0.anInt1033 || local66 > 2048 - arg0.anInt1033) {
						arg0.anInt992 = arg0.anInt1032;
					} else if (local66 > 1024) {
						arg0.anInt992 -= arg0.anInt1033;
					} else {
						arg0.anInt992 += arg0.anInt1033;
					}
					arg0.anInt992 &= 0x7FF;
					if (arg0.anInt1010 == arg0.anInt994 && arg0.anInt992 != arg0.anInt1032) {
						if (arg0.anInt995 != -1) {
							arg0.anInt1010 = arg0.anInt995;
							return;
						}
						arg0.anInt1010 = arg0.anInt996;
						return;
					}
				}
			}
		} catch (@Pc(246) RuntimeException local246) {
			signlink.reporterror("81500, " + arg0 + ", " + -1672 + ", " + local246.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(Lclient!y;I)V")
	private void method223(@OriginalArg(0) Class1_Sub1_Sub1_Sub1 arg0) {
		try {
			arg0.aBoolean241 = false;
			@Pc(21) Class27 local21;
			if (arg0.anInt1010 != -1) {
				local21 = Class27.aClass27Array1[arg0.anInt1010];
				arg0.anInt1012++;
				if (arg0.anInt1011 < local21.anInt795 && arg0.anInt1012 > local21.method499(arg0.anInt1011)) {
					arg0.anInt1012 = 0;
					arg0.anInt1011++;
				}
				if (arg0.anInt1011 >= local21.anInt795) {
					arg0.anInt1012 = 0;
					arg0.anInt1011 = 0;
				}
			}
			if (arg0.anInt1018 != -1 && anInt207 >= arg0.anInt1021) {
				if (arg0.anInt1019 < 0) {
					arg0.anInt1019 = 0;
				}
				local21 = Class33.aClass33Array1[arg0.anInt1018].aClass27_2;
				arg0.anInt1020++;
				while (arg0.anInt1019 < local21.anInt795 && arg0.anInt1020 > local21.method499(arg0.anInt1019)) {
					arg0.anInt1020 -= local21.method499(arg0.anInt1019);
					arg0.anInt1019++;
				}
				if (arg0.anInt1019 >= local21.anInt795 && (arg0.anInt1019 < 0 || arg0.anInt1019 >= local21.anInt795)) {
					arg0.anInt1018 = -1;
				}
			}
			if (arg0.anInt1013 != -1 && arg0.anInt1016 <= 1) {
				local21 = Class27.aClass27Array1[arg0.anInt1013];
				if (local21.anInt801 == 1 && arg0.anInt1036 > 0 && arg0.anInt1027 <= anInt207 && arg0.anInt1028 < anInt207) {
					arg0.anInt1016 = 1;
					return;
				}
			}
			if (arg0.anInt1013 != -1 && arg0.anInt1016 == 0) {
				local21 = Class27.aClass27Array1[arg0.anInt1013];
				arg0.anInt1015++;
				while (arg0.anInt1014 < local21.anInt795 && arg0.anInt1015 > local21.method499(arg0.anInt1014)) {
					arg0.anInt1015 -= local21.method499(arg0.anInt1014);
					arg0.anInt1014++;
				}
				if (arg0.anInt1014 >= local21.anInt795) {
					arg0.anInt1014 -= local21.anInt796;
					arg0.anInt1017++;
					if (arg0.anInt1017 >= local21.anInt800) {
						arg0.anInt1013 = -1;
					}
					if (arg0.anInt1014 < 0 || arg0.anInt1014 >= local21.anInt795) {
						arg0.anInt1013 = -1;
					}
				}
				arg0.aBoolean241 = local21.aBoolean199;
			}
			if (arg0.anInt1016 > 0) {
				arg0.anInt1016--;
			}
		} catch (@Pc(266) RuntimeException local266) {
			signlink.reporterror("6788, " + arg0 + ", " + 3186 + ", " + local266.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "R", descriptor = "(I)V")
	private void method224() {
		try {
			if (this.aBoolean53) {
				this.aBoolean53 = false;
				this.aClass35_3.method518(0, super.aGraphics2, 4);
				this.aClass35_4.method518(0, super.aGraphics2, 357);
				this.aClass35_5.method518(722, super.aGraphics2, 4);
				this.aClass35_6.method518(743, super.aGraphics2, 205);
				this.aClass35_7.method518(0, super.aGraphics2, 0);
				this.aClass35_8.method518(516, super.aGraphics2, 4);
				this.aClass35_9.method518(516, super.aGraphics2, 205);
				this.aClass35_10.method518(496, super.aGraphics2, 357);
				this.aClass35_11.method518(0, super.aGraphics2, 338);
				this.aBoolean55 = true;
				this.aBoolean73 = true;
				this.aBoolean46 = true;
				this.aBoolean75 = true;
				if (this.anInt350 != 2) {
					this.aClass35_14.method518(4, super.aGraphics2, 4);
					this.aClass35_13.method518(550, super.aGraphics2, 4);
				}
			}
			if (this.anInt350 == 2) {
				this.method119();
			}
			if (this.aBoolean47 && this.anInt411 == 1) {
				this.aBoolean55 = true;
			}
			@Pc(144) boolean local144;
			if (this.anInt390 != -1) {
				local144 = this.method96(this.anInt286, 753, this.anInt390);
				if (local144) {
					this.aBoolean55 = true;
				}
			}
			if (this.anInt232 == 2) {
				this.aBoolean55 = true;
			}
			if (this.anInt249 == 2) {
				this.aBoolean55 = true;
			}
			if (this.aBoolean55) {
				this.method180();
				this.aBoolean55 = false;
			}
			if (this.anInt303 == -1) {
				this.aClass6_1.anInt431 = this.anInt271 - this.anInt335 - 77;
				if (super.anInt195 > 448 && super.anInt195 < 560 && super.anInt196 > 332) {
					this.method146(77, this.aClass6_1, super.anInt196 - 357, 0, 463, super.anInt195 - 17, false, this.anInt271);
				}
				@Pc(226) int local226 = this.anInt271 - this.aClass6_1.anInt431 - 77;
				if (local226 < 0) {
					local226 = 0;
				}
				if (local226 > this.anInt271 - 77) {
					local226 = this.anInt271 - 77;
				}
				if (this.anInt335 != local226) {
					this.anInt335 = local226;
					this.aBoolean73 = true;
				}
			}
			if (this.anInt303 != -1) {
				local144 = this.method96(this.anInt286, 753, this.anInt303);
				if (local144) {
					this.aBoolean73 = true;
				}
			}
			if (this.anInt232 == 3) {
				this.aBoolean73 = true;
			}
			if (this.anInt249 == 3) {
				this.aBoolean73 = true;
			}
			if (this.aString7 != null) {
				this.aBoolean73 = true;
			}
			if (this.aBoolean47 && this.anInt411 == 2) {
				this.aBoolean73 = true;
			}
			if (this.aBoolean73) {
				this.method145();
				this.aBoolean73 = false;
			}
			if (this.anInt350 == 2) {
				this.method185((byte) 5);
				this.aClass35_13.method518(550, super.aGraphics2, 4);
			}
			if (this.anInt373 != -1) {
				this.aBoolean46 = true;
			}
			if (this.aBoolean46) {
				if (this.anInt373 != -1 && this.anInt373 == this.anInt304) {
					this.anInt373 = -1;
					this.aClass1_Sub1_Sub3_2.method462(94);
					this.aClass1_Sub1_Sub3_2.method463(this.anInt304);
				}
				this.aBoolean46 = false;
				this.aClass35_18.method517(aBoolean59);
				this.aClass1_Sub1_Sub2_Sub3_10.method415(this.aByte14, 0, 0);
				if (this.anInt390 == -1) {
					if (this.anIntArray50[this.anInt304] != -1) {
						if (this.anInt304 == 0) {
							this.aClass1_Sub1_Sub2_Sub3_1.method415(this.aByte14, 22, 10);
						}
						if (this.anInt304 == 1) {
							this.aClass1_Sub1_Sub2_Sub3_2.method415(this.aByte14, 54, 8);
						}
						if (this.anInt304 == 2) {
							this.aClass1_Sub1_Sub2_Sub3_2.method415(this.aByte14, 82, 8);
						}
						if (this.anInt304 == 3) {
							this.aClass1_Sub1_Sub2_Sub3_3.method415(this.aByte14, 110, 8);
						}
						if (this.anInt304 == 4) {
							this.aClass1_Sub1_Sub2_Sub3_5.method415(this.aByte14, 153, 8);
						}
						if (this.anInt304 == 5) {
							this.aClass1_Sub1_Sub2_Sub3_5.method415(this.aByte14, 181, 8);
						}
						if (this.anInt304 == 6) {
							this.aClass1_Sub1_Sub2_Sub3_4.method415(this.aByte14, 209, 9);
						}
					}
					if (this.anIntArray50[0] != -1 && (this.anInt373 != 0 || anInt207 % 20 < 10)) {
						this.aClass1_Sub1_Sub2_Sub3Array2[0].method415(this.aByte14, 29, 13);
					}
					if (this.anIntArray50[1] != -1 && (this.anInt373 != 1 || anInt207 % 20 < 10)) {
						this.aClass1_Sub1_Sub2_Sub3Array2[1].method415(this.aByte14, 53, 11);
					}
					if (this.anIntArray50[2] != -1 && (this.anInt373 != 2 || anInt207 % 20 < 10)) {
						this.aClass1_Sub1_Sub2_Sub3Array2[2].method415(this.aByte14, 82, 11);
					}
					if (this.anIntArray50[3] != -1 && (this.anInt373 != 3 || anInt207 % 20 < 10)) {
						this.aClass1_Sub1_Sub2_Sub3Array2[3].method415(this.aByte14, 115, 12);
					}
					if (this.anIntArray50[4] != -1 && (this.anInt373 != 4 || anInt207 % 20 < 10)) {
						this.aClass1_Sub1_Sub2_Sub3Array2[4].method415(this.aByte14, 153, 13);
					}
					if (this.anIntArray50[5] != -1 && (this.anInt373 != 5 || anInt207 % 20 < 10)) {
						this.aClass1_Sub1_Sub2_Sub3Array2[5].method415(this.aByte14, 180, 11);
					}
					if (this.anIntArray50[6] != -1 && (this.anInt373 != 6 || anInt207 % 20 < 10)) {
						this.aClass1_Sub1_Sub2_Sub3Array2[6].method415(this.aByte14, 208, 13);
					}
				}
				this.aClass35_18.method518(516, super.aGraphics2, 160);
				this.aClass35_17.method517(aBoolean59);
				this.aClass1_Sub1_Sub2_Sub3_9.method415(this.aByte14, 0, 0);
				if (this.anInt390 == -1) {
					if (this.anIntArray50[this.anInt304] != -1) {
						if (this.anInt304 == 7) {
							this.aClass1_Sub1_Sub2_Sub3_14.method415(this.aByte14, 42, 0);
						}
						if (this.anInt304 == 8) {
							this.aClass1_Sub1_Sub2_Sub3_15.method415(this.aByte14, 74, 0);
						}
						if (this.anInt304 == 9) {
							this.aClass1_Sub1_Sub2_Sub3_15.method415(this.aByte14, 102, 0);
						}
						if (this.anInt304 == 10) {
							this.aClass1_Sub1_Sub2_Sub3_16.method415(this.aByte14, 130, 1);
						}
						if (this.anInt304 == 11) {
							this.aClass1_Sub1_Sub2_Sub3_18.method415(this.aByte14, 173, 0);
						}
						if (this.anInt304 == 12) {
							this.aClass1_Sub1_Sub2_Sub3_18.method415(this.aByte14, 201, 0);
						}
						if (this.anInt304 == 13) {
							this.aClass1_Sub1_Sub2_Sub3_17.method415(this.aByte14, 229, 0);
						}
					}
					if (this.anIntArray50[8] != -1 && (this.anInt373 != 8 || anInt207 % 20 < 10)) {
						this.aClass1_Sub1_Sub2_Sub3Array2[7].method415(this.aByte14, 74, 2);
					}
					if (this.anIntArray50[9] != -1 && (this.anInt373 != 9 || anInt207 % 20 < 10)) {
						this.aClass1_Sub1_Sub2_Sub3Array2[8].method415(this.aByte14, 102, 3);
					}
					if (this.anIntArray50[10] != -1 && (this.anInt373 != 10 || anInt207 % 20 < 10)) {
						this.aClass1_Sub1_Sub2_Sub3Array2[9].method415(this.aByte14, 137, 4);
					}
					if (this.anIntArray50[11] != -1 && (this.anInt373 != 11 || anInt207 % 20 < 10)) {
						this.aClass1_Sub1_Sub2_Sub3Array2[10].method415(this.aByte14, 174, 2);
					}
					if (this.anIntArray50[12] != -1 && (this.anInt373 != 12 || anInt207 % 20 < 10)) {
						this.aClass1_Sub1_Sub2_Sub3Array2[11].method415(this.aByte14, 201, 2);
					}
					if (this.anIntArray50[13] != -1 && (this.anInt373 != 13 || anInt207 % 20 < 10)) {
						this.aClass1_Sub1_Sub2_Sub3Array2[12].method415(this.aByte14, 226, 2);
					}
				}
				this.aClass35_17.method518(496, super.aGraphics2, 466);
				this.aClass35_14.method517(aBoolean59);
			}
			if (this.aBoolean75) {
				this.aBoolean75 = false;
				this.aClass35_16.method517(aBoolean59);
				this.aClass1_Sub1_Sub2_Sub3_8.method415(this.aByte14, 0, 0);
				this.aClass1_Sub1_Sub2_Sub4_2.method444(55, 28, "Public chat", 16777215, true);
				if (this.anInt282 == 0) {
					this.aClass1_Sub1_Sub2_Sub4_2.method444(55, 41, "On", 65280, true);
				}
				if (this.anInt282 == 1) {
					this.aClass1_Sub1_Sub2_Sub4_2.method444(55, 41, "Friends", 16776960, true);
				}
				if (this.anInt282 == 2) {
					this.aClass1_Sub1_Sub2_Sub4_2.method444(55, 41, "Off", 16711680, true);
				}
				if (this.anInt282 == 3) {
					this.aClass1_Sub1_Sub2_Sub4_2.method444(55, 41, "Hide", 65535, true);
				}
				this.aClass1_Sub1_Sub2_Sub4_2.method444(184, 28, "Private chat", 16777215, true);
				if (this.anInt285 == 0) {
					this.aClass1_Sub1_Sub2_Sub4_2.method444(184, 41, "On", 65280, true);
				}
				if (this.anInt285 == 1) {
					this.aClass1_Sub1_Sub2_Sub4_2.method444(184, 41, "Friends", 16776960, true);
				}
				if (this.anInt285 == 2) {
					this.aClass1_Sub1_Sub2_Sub4_2.method444(184, 41, "Off", 16711680, true);
				}
				this.aClass1_Sub1_Sub2_Sub4_2.method444(324, 28, "Trade/duel", 16777215, true);
				if (this.anInt209 == 0) {
					this.aClass1_Sub1_Sub2_Sub4_2.method444(324, 41, "On", 65280, true);
				}
				if (this.anInt209 == 1) {
					this.aClass1_Sub1_Sub2_Sub4_2.method444(324, 41, "Friends", 16776960, true);
				}
				if (this.anInt209 == 2) {
					this.aClass1_Sub1_Sub2_Sub4_2.method444(324, 41, "Off", 16711680, true);
				}
				this.aClass1_Sub1_Sub2_Sub4_2.method444(458, 33, "Report abuse", 16777215, true);
				this.aClass35_16.method518(0, super.aGraphics2, 453);
				this.aClass35_14.method517(aBoolean59);
			}
			this.anInt286 = 0;
		} catch (@Pc(1082) RuntimeException local1082) {
			signlink.reporterror("90754, " + 41329 + ", " + local1082.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(IILclient!lb;)V")
	private void method225(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub1_Sub3 arg1) {
		try {
			this.anInt329 = 0;
			this.anInt349 = 0;
			@Pc(11) int local11 = arg0 + 0;
			this.method148(local11, this.anInt268, arg1);
			this.method107(arg1, local11);
			this.method181(local11, arg1);
			@Pc(36) int local36;
			for (@Pc(29) int local29 = 0; local29 < this.anInt329; local29++) {
				local36 = this.anIntArray61[local29];
				if (this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local36].anInt1030 != anInt207) {
					this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local36].aClass13_2 = null;
					this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local36] = null;
				}
			}
			if (arg1.anInt743 != local11) {
				signlink.reporterror(this.aString14 + " size mismatch in getnpcpos - pos:" + arg1.anInt743 + " psize:" + local11);
				throw new RuntimeException("eek");
			}
			for (local36 = 0; local36 < this.anInt416; local36++) {
				if (this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[this.anIntArray92[local36]] == null) {
					signlink.reporterror(this.aString14 + " null entry in npc list - pos:" + local36 + " size:" + this.anInt416);
					throw new RuntimeException("eek");
				}
			}
		} catch (@Pc(126) RuntimeException local126) {
			signlink.reporterror("43628, " + 0 + ", " + arg0 + ", " + arg1 + ", " + local126.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "S", descriptor = "(I)V")
	private void method226() {
		try {
			if (this.anInt350 == 2) {
				for (@Pc(16) Class1_Sub2 local16 = (Class1_Sub2) this.aClass29_3.method504(); local16 != null; local16 = (Class1_Sub2) this.aClass29_3.method506(this.aByte9)) {
					if (local16.anInt793 > 0) {
						local16.anInt793--;
					}
					if (local16.anInt793 != 0) {
						if (local16.anInt792 > 0) {
							local16.anInt792--;
						}
						if (local16.anInt792 == 0 && local16.anInt784 >= 1 && local16.anInt785 >= 1 && local16.anInt784 <= 102 && local16.anInt785 <= 102 && (local16.anInt789 < 0 || Class4.method71(local16.anInt789, local16.anInt791))) {
							this.method126(local16.anInt790, local16.anInt783, local16.anInt784, local16.anInt791, local16.anInt789, local16.anInt782, local16.anInt785);
							local16.anInt792 = -1;
							if (local16.anInt789 == local16.anInt786 && local16.anInt786 == -1) {
								local16.method667();
							} else if (local16.anInt789 == local16.anInt786 && local16.anInt790 == local16.anInt787 && local16.anInt791 == local16.anInt788) {
								local16.method667();
							}
						}
					} else if (local16.anInt786 < 0 || Class4.method71(local16.anInt786, local16.anInt788)) {
						this.method126(local16.anInt787, local16.anInt783, local16.anInt784, local16.anInt788, local16.anInt786, local16.anInt782, local16.anInt785);
						local16.method667();
					}
				}
			}
		} catch (@Pc(160) RuntimeException local160) {
			signlink.reporterror("51955, " + 42825 + ", " + local160.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Lclient!lb;II)V")
	private void method227(@OriginalArg(0) Class1_Sub1_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		try {
			while (true) {
				if (arg0.anInt744 + 10 < arg1 * 8) {
					@Pc(12) int local12 = arg0.method484(11);
					if (local12 != 2047) {
						if (this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local12] == null) {
							this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local12] = new Class1_Sub1_Sub1_Sub1_Sub1();
							if (this.aClass1_Sub1_Sub3Array1[local12] != null) {
								this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local12].method39(this.aClass1_Sub1_Sub3Array1[local12], this.anInt206);
							}
						}
						this.anIntArray76[this.anInt348++] = local12;
						@Pc(59) Class1_Sub1_Sub1_Sub1_Sub1 local59 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local12];
						local59.anInt1030 = anInt207;
						@Pc(67) int local67 = arg0.method484(5);
						if (local67 > 15) {
							local67 -= 32;
						}
						@Pc(76) int local76 = arg0.method484(5);
						if (local76 > 15) {
							local76 -= 32;
						}
						@Pc(85) int local85 = arg0.method484(1);
						local59.method671(aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray269[0] + local67, local85 == 1, aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray270[0] + local76);
						@Pc(111) int local111 = arg0.method484(1);
						if (local111 == 1) {
							this.anIntArray77[this.anInt349++] = local12;
						}
						continue;
					}
				}
				arg0.method485(941);
				@Pc(134) int local134 = 7 / arg2;
				return;
			}
		} catch (@Pc(136) RuntimeException local136) {
			signlink.reporterror("84591, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local136.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "([BIB)Z")
	private boolean method228(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		try {
			return arg0 == null ? true : signlink.wavesave(arg0, arg1);
		} catch (@Pc(16) RuntimeException local16) {
			signlink.reporterror("73036, " + arg0 + ", " + arg1 + ", " + 9 + ", " + local16.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "T", descriptor = "(I)V")
	private void method229() {
		try {
			@Pc(3) int local3 = 5;
			this.anIntArray42[8] = 0;
			this.anInt393 += 0;
			@Pc(16) int local16 = 0;
			while (this.anIntArray42[8] == 0) {
				@Pc(20) String local20 = "Unknown problem";
				this.method95("Connecting to web server", 20);
				try {
					@Pc(42) DataInputStream local42 = this.method166("crc" + (int) (Math.random() * 9.9999999E7D) + "-" + 274);
					@Pc(49) Class1_Sub1_Sub3 local49 = new Class1_Sub1_Sub3(new byte[40], (byte) 1);
					local42.readFully(local49.aByteArray9, 0, 40);
					local42.close();
					for (@Pc(59) int local59 = 0; local59 < 9; local59++) {
						this.anIntArray42[local59] = local49.method478();
					}
					@Pc(74) int local74 = local49.method478();
					@Pc(76) int local76 = 1234;
					for (@Pc(78) int local78 = 0; local78 < 9; local78++) {
						local76 = (local76 << 1) + this.anIntArray42[local78];
					}
					if (local74 != local76) {
						local20 = "checksum problem";
						this.anIntArray42[8] = 0;
					}
				} catch (@Pc(105) EOFException local105) {
					local20 = "EOF problem";
					this.anIntArray42[8] = 0;
				} catch (@Pc(114) IOException local114) {
					local20 = "connection problem";
					this.anIntArray42[8] = 0;
				} catch (@Pc(123) Exception local123) {
					local20 = "logic problem";
					this.anIntArray42[8] = 0;
					if (!signlink.reporterror) {
						return;
					}
				}
				if (this.anIntArray42[8] == 0) {
					local16++;
					for (@Pc(141) int local141 = local3; local141 > 0; local141--) {
						if (local16 >= 10) {
							this.method95("Game updated - please reload page", 10);
							local141 = 10;
						} else {
							this.method95(local20 + " - Will retry in " + local141 + " secs.", 10);
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
					this.aBoolean69 = !this.aBoolean69;
				}
			}
		} catch (@Pc(203) RuntimeException local203) {
			signlink.reporterror("91972, " + 0 + ", " + local203.toString());
			throw new RuntimeException();
		}
	}
}
