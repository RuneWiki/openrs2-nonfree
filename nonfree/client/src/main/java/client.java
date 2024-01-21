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

	@OriginalMember(owner = "client!client", name = "M", descriptor = "I")
	private static int anInt207;

	@OriginalMember(owner = "client!client", name = "qb", descriptor = "Lclient!ab;")
	public static Class1_Sub1_Sub1_Sub1_Sub1 aClass1_Sub1_Sub1_Sub1_Sub1_1;

	@OriginalMember(owner = "client!client", name = "xb", descriptor = "I")
	private static int anInt222;

	@OriginalMember(owner = "client!client", name = "bc", descriptor = "I")
	public static int anInt236;

	@OriginalMember(owner = "client!client", name = "Nc", descriptor = "I")
	private static int anInt254;

	@OriginalMember(owner = "client!client", name = "Uc", descriptor = "I")
	private static int anInt259;

	@OriginalMember(owner = "client!client", name = "kd", descriptor = "Z")
	private static boolean aBoolean58;

	@OriginalMember(owner = "client!client", name = "ud", descriptor = "I")
	private static int anInt276;

	@OriginalMember(owner = "client!client", name = "zd", descriptor = "I")
	private static int anInt279;

	@OriginalMember(owner = "client!client", name = "Ld", descriptor = "Z")
	private static boolean aBoolean64;

	@OriginalMember(owner = "client!client", name = "Nd", descriptor = "I")
	public static int anInt283;

	@OriginalMember(owner = "client!client", name = "Pd", descriptor = "Z")
	private static boolean aBoolean66;

	@OriginalMember(owner = "client!client", name = "Rd", descriptor = "I")
	private static int anInt284;

	@OriginalMember(owner = "client!client", name = "Zd", descriptor = "I")
	private static int anInt286;

	@OriginalMember(owner = "client!client", name = "ie", descriptor = "I")
	private static int anInt294;

	@OriginalMember(owner = "client!client", name = "Oe", descriptor = "I")
	private static int anInt305;

	@OriginalMember(owner = "client!client", name = "Of", descriptor = "Z")
	private static boolean aBoolean76;

	@OriginalMember(owner = "client!client", name = "Ug", descriptor = "Z")
	private static boolean aBoolean81;

	@OriginalMember(owner = "client!client", name = "Zg", descriptor = "I")
	private static int anInt354;

	@OriginalMember(owner = "client!client", name = "kh", descriptor = "I")
	private static int anInt355;

	@OriginalMember(owner = "client!client", name = "rh", descriptor = "I")
	private static int anInt359;

	@OriginalMember(owner = "client!client", name = "Sh", descriptor = "I")
	private static int anInt369;

	@OriginalMember(owner = "client!client", name = "xi", descriptor = "Z")
	private static boolean aBoolean91;

	@OriginalMember(owner = "client!client", name = "zi", descriptor = "I")
	private static int anInt393;

	@OriginalMember(owner = "client!client", name = "Yi", descriptor = "Z")
	private static boolean aBoolean96;

	@OriginalMember(owner = "client!client", name = "Fj", descriptor = "I")
	private static int anInt411;

	@OriginalMember(owner = "client!client", name = "Hj", descriptor = "I")
	private static int anInt412;

	@OriginalMember(owner = "client!client", name = "mb", descriptor = "Ljava/math/BigInteger;")
	private static BigInteger aBigInteger1 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");

	@OriginalMember(owner = "client!client", name = "Db", descriptor = "Z")
	private static boolean aBoolean47 = true;

	@OriginalMember(owner = "client!client", name = "Md", descriptor = "I")
	private static int anInt282 = 10;

	@OriginalMember(owner = "client!client", name = "Od", descriptor = "Z")
	private static boolean aBoolean65 = true;

	@OriginalMember(owner = "client!client", name = "Be", descriptor = "Ljava/lang/String;")
	private static String aString12 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";

	@OriginalMember(owner = "client!client", name = "Ve", descriptor = "[I")
	public static final int[] anIntArray63 = new int[] { 9104, 10275, 7595, 3610, 7975, 8526, 918, 38802, 24466, 10145, 58654, 5027, 1457, 16565, 34991, 25486 };

	@OriginalMember(owner = "client!client", name = "rf", descriptor = "[[I")
	public static final int[][] anIntArrayArray4 = new int[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, 33697, 22433, 2983, 54193 }, { 8741, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003, 25239 }, { 25238, 8742, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };

	@OriginalMember(owner = "client!client", name = "qh", descriptor = "[I")
	private static int[] anIntArray76 = new int[99];

	@OriginalMember(owner = "client!client", name = "Rh", descriptor = "I")
	private static int anInt368;

	@OriginalMember(owner = "client!client", name = "gi", descriptor = "Ljava/math/BigInteger;")
	private static BigInteger aBigInteger2;

	@OriginalMember(owner = "client!client", name = "lj", descriptor = "[I")
	public static int[] anIntArray88;

	@OriginalMember(owner = "client!client", name = "Ej", descriptor = "Z")
	private static boolean aBoolean101;

	@OriginalMember(owner = "client!client", name = "O", descriptor = "I")
	private int anInt208;

	@OriginalMember(owner = "client!client", name = "T", descriptor = "I")
	private int anInt210;

	@OriginalMember(owner = "client!client", name = "U", descriptor = "I")
	private int anInt211;

	@OriginalMember(owner = "client!client", name = "V", descriptor = "I")
	private int anInt212;

	@OriginalMember(owner = "client!client", name = "Y", descriptor = "I")
	private int anInt213;

	@OriginalMember(owner = "client!client", name = "Z", descriptor = "I")
	private int anInt214;

	@OriginalMember(owner = "client!client", name = "ab", descriptor = "I")
	private int anInt215;

	@OriginalMember(owner = "client!client", name = "bb", descriptor = "I")
	private int anInt216;

	@OriginalMember(owner = "client!client", name = "eb", descriptor = "Ljava/lang/String;")
	private String aString4;

	@OriginalMember(owner = "client!client", name = "gb", descriptor = "J")
	private long aLong14;

	@OriginalMember(owner = "client!client", name = "jb", descriptor = "[I")
	private int[] anIntArray35;

	@OriginalMember(owner = "client!client", name = "kb", descriptor = "[I")
	private int[] anIntArray36;

	@OriginalMember(owner = "client!client", name = "lb", descriptor = "[I")
	private int[] anIntArray37;

	@OriginalMember(owner = "client!client", name = "nb", descriptor = "Lclient!qb;")
	private Class35 aClass35_3;

	@OriginalMember(owner = "client!client", name = "ob", descriptor = "Lclient!qb;")
	private Class35 aClass35_4;

	@OriginalMember(owner = "client!client", name = "pb", descriptor = "Lclient!qb;")
	private Class35 aClass35_5;

	@OriginalMember(owner = "client!client", name = "rb", descriptor = "I")
	private int anInt218;

	@OriginalMember(owner = "client!client", name = "wb", descriptor = "I")
	private int anInt221;

	@OriginalMember(owner = "client!client", name = "yb", descriptor = "I")
	private int anInt223;

	@OriginalMember(owner = "client!client", name = "Ab", descriptor = "I")
	private int anInt225;

	@OriginalMember(owner = "client!client", name = "Bb", descriptor = "I")
	private int anInt226;

	@OriginalMember(owner = "client!client", name = "Cb", descriptor = "I")
	private int anInt227;

	@OriginalMember(owner = "client!client", name = "Lb", descriptor = "I")
	private int anInt229;

	@OriginalMember(owner = "client!client", name = "Nb", descriptor = "I")
	private int anInt230;

	@OriginalMember(owner = "client!client", name = "Ob", descriptor = "I")
	private int anInt231;

	@OriginalMember(owner = "client!client", name = "Pb", descriptor = "I")
	private int anInt232;

	@OriginalMember(owner = "client!client", name = "Qb", descriptor = "I")
	private int anInt233;

	@OriginalMember(owner = "client!client", name = "Rb", descriptor = "I")
	private int anInt234;

	@OriginalMember(owner = "client!client", name = "Sb", descriptor = "I")
	private int anInt235;

	@OriginalMember(owner = "client!client", name = "cc", descriptor = "I")
	private int anInt237;

	@OriginalMember(owner = "client!client", name = "dc", descriptor = "I")
	private int anInt238;

	@OriginalMember(owner = "client!client", name = "hc", descriptor = "I")
	private int anInt240;

	@OriginalMember(owner = "client!client", name = "ic", descriptor = "[[[B")
	private byte[][][] aByteArrayArrayArray7;

	@OriginalMember(owner = "client!client", name = "lc", descriptor = "I")
	private int anInt242;

	@OriginalMember(owner = "client!client", name = "oc", descriptor = "I")
	private int anInt243;

	@OriginalMember(owner = "client!client", name = "yc", descriptor = "Lclient!ib;")
	private Class1_Sub1_Sub2_Sub2 aClass1_Sub1_Sub2_Sub2_1;

	@OriginalMember(owner = "client!client", name = "Ac", descriptor = "I")
	private int anInt245;

	@OriginalMember(owner = "client!client", name = "Ec", descriptor = "I")
	private int anInt248;

	@OriginalMember(owner = "client!client", name = "Fc", descriptor = "I")
	private int anInt249;

	@OriginalMember(owner = "client!client", name = "Gc", descriptor = "I")
	private int anInt250;

	@OriginalMember(owner = "client!client", name = "Hc", descriptor = "I")
	private int anInt251;

	@OriginalMember(owner = "client!client", name = "Ic", descriptor = "I")
	private int anInt252;

	@OriginalMember(owner = "client!client", name = "Lc", descriptor = "I")
	private int anInt253;

	@OriginalMember(owner = "client!client", name = "Oc", descriptor = "I")
	private int anInt255;

	@OriginalMember(owner = "client!client", name = "Pc", descriptor = "I")
	private int anInt256;

	@OriginalMember(owner = "client!client", name = "Qc", descriptor = "I")
	private int anInt257;

	@OriginalMember(owner = "client!client", name = "Rc", descriptor = "I")
	private int anInt258;

	@OriginalMember(owner = "client!client", name = "Sc", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray5;

	@OriginalMember(owner = "client!client", name = "Vc", descriptor = "I")
	private int anInt260;

	@OriginalMember(owner = "client!client", name = "Wc", descriptor = "I")
	private int anInt261;

	@OriginalMember(owner = "client!client", name = "Xc", descriptor = "I")
	private int anInt262;

	@OriginalMember(owner = "client!client", name = "Yc", descriptor = "Ljava/lang/String;")
	private String aString7;

	@OriginalMember(owner = "client!client", name = "Zc", descriptor = "I")
	private int anInt263;

	@OriginalMember(owner = "client!client", name = "ad", descriptor = "I")
	private int anInt264;

	@OriginalMember(owner = "client!client", name = "ed", descriptor = "I")
	private int anInt266;

	@OriginalMember(owner = "client!client", name = "fd", descriptor = "I")
	private int anInt267;

	@OriginalMember(owner = "client!client", name = "gd", descriptor = "I")
	private int anInt268;

	@OriginalMember(owner = "client!client", name = "hd", descriptor = "I")
	private int anInt269;

	@OriginalMember(owner = "client!client", name = "id", descriptor = "I")
	private int anInt270;

	@OriginalMember(owner = "client!client", name = "od", descriptor = "I")
	private int anInt273;

	@OriginalMember(owner = "client!client", name = "qd", descriptor = "I")
	private int anInt274;

	@OriginalMember(owner = "client!client", name = "vd", descriptor = "Lclient!wb;")
	private Class46 aClass46_1;

	@OriginalMember(owner = "client!client", name = "wd", descriptor = "I")
	private int anInt277;

	@OriginalMember(owner = "client!client", name = "xd", descriptor = "I")
	private int anInt278;

	@OriginalMember(owner = "client!client", name = "Bd", descriptor = "J")
	private long aLong15;

	@OriginalMember(owner = "client!client", name = "Cd", descriptor = "Lclient!jb;")
	private Class1_Sub1_Sub2_Sub3 aClass1_Sub1_Sub2_Sub3_1;

	@OriginalMember(owner = "client!client", name = "Dd", descriptor = "Lclient!jb;")
	private Class1_Sub1_Sub2_Sub3 aClass1_Sub1_Sub2_Sub3_2;

	@OriginalMember(owner = "client!client", name = "Ed", descriptor = "Lclient!jb;")
	private Class1_Sub1_Sub2_Sub3 aClass1_Sub1_Sub2_Sub3_3;

	@OriginalMember(owner = "client!client", name = "Fd", descriptor = "I")
	private int anInt280;

	@OriginalMember(owner = "client!client", name = "Gd", descriptor = "I")
	private int anInt281;

	@OriginalMember(owner = "client!client", name = "Sd", descriptor = "I")
	private int anInt285;

	@OriginalMember(owner = "client!client", name = "Td", descriptor = "Lclient!ib;")
	private Class1_Sub1_Sub2_Sub2 aClass1_Sub1_Sub2_Sub2_2;

	@OriginalMember(owner = "client!client", name = "Ud", descriptor = "Lclient!ib;")
	private Class1_Sub1_Sub2_Sub2 aClass1_Sub1_Sub2_Sub2_3;

	@OriginalMember(owner = "client!client", name = "Vd", descriptor = "Lclient!ib;")
	private Class1_Sub1_Sub2_Sub2 aClass1_Sub1_Sub2_Sub2_4;

	@OriginalMember(owner = "client!client", name = "Wd", descriptor = "Lclient!ib;")
	private Class1_Sub1_Sub2_Sub2 aClass1_Sub1_Sub2_Sub2_5;

	@OriginalMember(owner = "client!client", name = "ce", descriptor = "I")
	private int anInt289;

	@OriginalMember(owner = "client!client", name = "de", descriptor = "I")
	private int anInt290;

	@OriginalMember(owner = "client!client", name = "ee", descriptor = "I")
	private int anInt291;

	@OriginalMember(owner = "client!client", name = "fe", descriptor = "I")
	private int anInt292;

	@OriginalMember(owner = "client!client", name = "ge", descriptor = "Ljava/lang/String;")
	private String aString9;

	@OriginalMember(owner = "client!client", name = "he", descriptor = "I")
	private int anInt293;

	@OriginalMember(owner = "client!client", name = "me", descriptor = "J")
	private long aLong16;

	@OriginalMember(owner = "client!client", name = "ne", descriptor = "I")
	private int anInt296;

	@OriginalMember(owner = "client!client", name = "qe", descriptor = "I")
	private int anInt299;

	@OriginalMember(owner = "client!client", name = "re", descriptor = "I")
	private int anInt300;

	@OriginalMember(owner = "client!client", name = "se", descriptor = "I")
	private int anInt301;

	@OriginalMember(owner = "client!client", name = "te", descriptor = "I")
	private int anInt302;

	@OriginalMember(owner = "client!client", name = "ue", descriptor = "I")
	private int anInt303;

	@OriginalMember(owner = "client!client", name = "ve", descriptor = "Lclient!ub;")
	private Class44_Sub1 aClass44_Sub1_1;

	@OriginalMember(owner = "client!client", name = "ye", descriptor = "[I")
	private int[] anIntArray56;

	@OriginalMember(owner = "client!client", name = "ze", descriptor = "[I")
	private int[] anIntArray57;

	@OriginalMember(owner = "client!client", name = "Ae", descriptor = "[I")
	private int[] anIntArray58;

	@OriginalMember(owner = "client!client", name = "De", descriptor = "[I")
	private int[] anIntArray59;

	@OriginalMember(owner = "client!client", name = "Ee", descriptor = "[I")
	private int[] anIntArray60;

	@OriginalMember(owner = "client!client", name = "Fe", descriptor = "Lclient!qb;")
	private Class35 aClass35_6;

	@OriginalMember(owner = "client!client", name = "Ge", descriptor = "Lclient!qb;")
	private Class35 aClass35_7;

	@OriginalMember(owner = "client!client", name = "He", descriptor = "Lclient!qb;")
	private Class35 aClass35_8;

	@OriginalMember(owner = "client!client", name = "Ie", descriptor = "Lclient!qb;")
	private Class35 aClass35_9;

	@OriginalMember(owner = "client!client", name = "Je", descriptor = "Lclient!jb;")
	private Class1_Sub1_Sub2_Sub3 aClass1_Sub1_Sub2_Sub3_4;

	@OriginalMember(owner = "client!client", name = "Ke", descriptor = "Lclient!jb;")
	private Class1_Sub1_Sub2_Sub3 aClass1_Sub1_Sub2_Sub3_5;

	@OriginalMember(owner = "client!client", name = "Le", descriptor = "Lclient!jb;")
	private Class1_Sub1_Sub2_Sub3 aClass1_Sub1_Sub2_Sub3_6;

	@OriginalMember(owner = "client!client", name = "Me", descriptor = "I")
	private int anInt304;

	@OriginalMember(owner = "client!client", name = "Qe", descriptor = "I")
	private int anInt307;

	@OriginalMember(owner = "client!client", name = "Re", descriptor = "J")
	private long aLong17;

	@OriginalMember(owner = "client!client", name = "Xe", descriptor = "I")
	private int anInt308;

	@OriginalMember(owner = "client!client", name = "Ye", descriptor = "I")
	private int anInt309;

	@OriginalMember(owner = "client!client", name = "af", descriptor = "I")
	private int anInt311;

	@OriginalMember(owner = "client!client", name = "bf", descriptor = "I")
	private int anInt312;

	@OriginalMember(owner = "client!client", name = "cf", descriptor = "I")
	private int anInt313;

	@OriginalMember(owner = "client!client", name = "df", descriptor = "I")
	private int anInt314;

	@OriginalMember(owner = "client!client", name = "ef", descriptor = "I")
	private int anInt315;

	@OriginalMember(owner = "client!client", name = "ff", descriptor = "I")
	private int anInt316;

	@OriginalMember(owner = "client!client", name = "gf", descriptor = "I")
	private int anInt317;

	@OriginalMember(owner = "client!client", name = "jf", descriptor = "I")
	private int anInt319;

	@OriginalMember(owner = "client!client", name = "kf", descriptor = "Lclient!jb;")
	private Class1_Sub1_Sub2_Sub3 aClass1_Sub1_Sub2_Sub3_7;

	@OriginalMember(owner = "client!client", name = "lf", descriptor = "Lclient!jb;")
	private Class1_Sub1_Sub2_Sub3 aClass1_Sub1_Sub2_Sub3_8;

	@OriginalMember(owner = "client!client", name = "mf", descriptor = "Lclient!jb;")
	private Class1_Sub1_Sub2_Sub3 aClass1_Sub1_Sub2_Sub3_9;

	@OriginalMember(owner = "client!client", name = "nf", descriptor = "Lclient!jb;")
	private Class1_Sub1_Sub2_Sub3 aClass1_Sub1_Sub2_Sub3_10;

	@OriginalMember(owner = "client!client", name = "of", descriptor = "Lclient!jb;")
	private Class1_Sub1_Sub2_Sub3 aClass1_Sub1_Sub2_Sub3_11;

	@OriginalMember(owner = "client!client", name = "sf", descriptor = "[[B")
	private byte[][] aByteArrayArray1;

	@OriginalMember(owner = "client!client", name = "vf", descriptor = "I")
	private int anInt321;

	@OriginalMember(owner = "client!client", name = "wf", descriptor = "I")
	private int anInt322;

	@OriginalMember(owner = "client!client", name = "xf", descriptor = "I")
	private int anInt323;

	@OriginalMember(owner = "client!client", name = "yf", descriptor = "Ljava/net/Socket;")
	private Socket aSocket1;

	@OriginalMember(owner = "client!client", name = "zf", descriptor = "I")
	private int anInt324;

	@OriginalMember(owner = "client!client", name = "Ef", descriptor = "Lclient!xb;")
	private Class47 aClass47_1;

	@OriginalMember(owner = "client!client", name = "Ff", descriptor = "Lclient!e;")
	private Class8 aClass8_1;

	@OriginalMember(owner = "client!client", name = "Gf", descriptor = "I")
	private int anInt325;

	@OriginalMember(owner = "client!client", name = "If", descriptor = "I")
	private int anInt326;

	@OriginalMember(owner = "client!client", name = "Kf", descriptor = "I")
	private int anInt328;

	@OriginalMember(owner = "client!client", name = "Lf", descriptor = "I")
	private int anInt329;

	@OriginalMember(owner = "client!client", name = "Mf", descriptor = "I")
	private int anInt330;

	@OriginalMember(owner = "client!client", name = "Nf", descriptor = "I")
	private int anInt331;

	@OriginalMember(owner = "client!client", name = "Pf", descriptor = "Lclient!kb;")
	private Class1_Sub1_Sub2_Sub4 aClass1_Sub1_Sub2_Sub4_1;

	@OriginalMember(owner = "client!client", name = "Qf", descriptor = "Lclient!kb;")
	private Class1_Sub1_Sub2_Sub4 aClass1_Sub1_Sub2_Sub4_2;

	@OriginalMember(owner = "client!client", name = "Rf", descriptor = "Lclient!kb;")
	private Class1_Sub1_Sub2_Sub4 aClass1_Sub1_Sub2_Sub4_3;

	@OriginalMember(owner = "client!client", name = "Sf", descriptor = "Lclient!kb;")
	private Class1_Sub1_Sub2_Sub4 aClass1_Sub1_Sub2_Sub4_4;

	@OriginalMember(owner = "client!client", name = "Tf", descriptor = "I")
	private int anInt332;

	@OriginalMember(owner = "client!client", name = "Vf", descriptor = "I")
	private int anInt334;

	@OriginalMember(owner = "client!client", name = "Wf", descriptor = "I")
	private int anInt335;

	@OriginalMember(owner = "client!client", name = "ag", descriptor = "I")
	private int anInt336;

	@OriginalMember(owner = "client!client", name = "cg", descriptor = "I")
	private int anInt338;

	@OriginalMember(owner = "client!client", name = "eg", descriptor = "I")
	private int anInt339;

	@OriginalMember(owner = "client!client", name = "fg", descriptor = "I")
	private int anInt340;

	@OriginalMember(owner = "client!client", name = "gg", descriptor = "I")
	private int anInt341;

	@OriginalMember(owner = "client!client", name = "hg", descriptor = "I")
	private int anInt342;

	@OriginalMember(owner = "client!client", name = "ig", descriptor = "I")
	private int anInt343;

	@OriginalMember(owner = "client!client", name = "kg", descriptor = "Lclient!ib;")
	private Class1_Sub1_Sub2_Sub2 aClass1_Sub1_Sub2_Sub2_6;

	@OriginalMember(owner = "client!client", name = "lg", descriptor = "Lclient!ib;")
	private Class1_Sub1_Sub2_Sub2 aClass1_Sub1_Sub2_Sub2_7;

	@OriginalMember(owner = "client!client", name = "mg", descriptor = "I")
	private int anInt344;

	@OriginalMember(owner = "client!client", name = "og", descriptor = "I")
	private int anInt346;

	@OriginalMember(owner = "client!client", name = "pg", descriptor = "I")
	private int anInt347;

	@OriginalMember(owner = "client!client", name = "qg", descriptor = "I")
	private int anInt348;

	@OriginalMember(owner = "client!client", name = "rg", descriptor = "I")
	private int anInt349;

	@OriginalMember(owner = "client!client", name = "sg", descriptor = "I")
	private int anInt350;

	@OriginalMember(owner = "client!client", name = "ug", descriptor = "[I")
	private int[] anIntArray67;

	@OriginalMember(owner = "client!client", name = "vg", descriptor = "[I")
	private int[] anIntArray68;

	@OriginalMember(owner = "client!client", name = "Bg", descriptor = "I")
	private int anInt351;

	@OriginalMember(owner = "client!client", name = "Cg", descriptor = "Lclient!fc;")
	private Class11 aClass11_1;

	@OriginalMember(owner = "client!client", name = "Ig", descriptor = "I")
	private int anInt353;

	@OriginalMember(owner = "client!client", name = "Jg", descriptor = "Lclient!qb;")
	private Class35 aClass35_10;

	@OriginalMember(owner = "client!client", name = "Kg", descriptor = "Lclient!qb;")
	private Class35 aClass35_11;

	@OriginalMember(owner = "client!client", name = "Lg", descriptor = "Lclient!qb;")
	private Class35 aClass35_12;

	@OriginalMember(owner = "client!client", name = "Mg", descriptor = "Lclient!qb;")
	private Class35 aClass35_13;

	@OriginalMember(owner = "client!client", name = "Ng", descriptor = "Lclient!qb;")
	private Class35 aClass35_14;

	@OriginalMember(owner = "client!client", name = "Og", descriptor = "Lclient!qb;")
	private Class35 aClass35_15;

	@OriginalMember(owner = "client!client", name = "Pg", descriptor = "Lclient!qb;")
	private Class35 aClass35_16;

	@OriginalMember(owner = "client!client", name = "Qg", descriptor = "Lclient!qb;")
	private Class35 aClass35_17;

	@OriginalMember(owner = "client!client", name = "Rg", descriptor = "Lclient!qb;")
	private Class35 aClass35_18;

	@OriginalMember(owner = "client!client", name = "Vg", descriptor = "Lclient!jb;")
	private Class1_Sub1_Sub2_Sub3 aClass1_Sub1_Sub2_Sub3_12;

	@OriginalMember(owner = "client!client", name = "Wg", descriptor = "Lclient!jb;")
	private Class1_Sub1_Sub2_Sub3 aClass1_Sub1_Sub2_Sub3_13;

	@OriginalMember(owner = "client!client", name = "eh", descriptor = "Lclient!ib;")
	private Class1_Sub1_Sub2_Sub2 aClass1_Sub1_Sub2_Sub2_8;

	@OriginalMember(owner = "client!client", name = "fh", descriptor = "Lclient!ib;")
	private Class1_Sub1_Sub2_Sub2 aClass1_Sub1_Sub2_Sub2_9;

	@OriginalMember(owner = "client!client", name = "lh", descriptor = "Lclient!r;")
	private Class37 aClass37_1;

	@OriginalMember(owner = "client!client", name = "mh", descriptor = "Lclient!ib;")
	private Class1_Sub1_Sub2_Sub2 aClass1_Sub1_Sub2_Sub2_10;

	@OriginalMember(owner = "client!client", name = "nh", descriptor = "I")
	private int anInt356;

	@OriginalMember(owner = "client!client", name = "sh", descriptor = "I")
	private int anInt360;

	@OriginalMember(owner = "client!client", name = "wh", descriptor = "I")
	private int anInt361;

	@OriginalMember(owner = "client!client", name = "xh", descriptor = "I")
	private int anInt362;

	@OriginalMember(owner = "client!client", name = "Gh", descriptor = "I")
	private int anInt365;

	@OriginalMember(owner = "client!client", name = "Ih", descriptor = "[[B")
	private byte[][] aByteArrayArray2;

	@OriginalMember(owner = "client!client", name = "Nh", descriptor = "Lclient!jb;")
	private Class1_Sub1_Sub2_Sub3 aClass1_Sub1_Sub2_Sub3_14;

	@OriginalMember(owner = "client!client", name = "Oh", descriptor = "Lclient!jb;")
	private Class1_Sub1_Sub2_Sub3 aClass1_Sub1_Sub2_Sub3_15;

	@OriginalMember(owner = "client!client", name = "Qh", descriptor = "Ljava/lang/String;")
	private String aString15;

	@OriginalMember(owner = "client!client", name = "Th", descriptor = "I")
	private int anInt370;

	@OriginalMember(owner = "client!client", name = "Uh", descriptor = "I")
	private int anInt371;

	@OriginalMember(owner = "client!client", name = "Vh", descriptor = "Lclient!ib;")
	private Class1_Sub1_Sub2_Sub2 aClass1_Sub1_Sub2_Sub2_11;

	@OriginalMember(owner = "client!client", name = "Wh", descriptor = "I")
	private int anInt372;

	@OriginalMember(owner = "client!client", name = "Yh", descriptor = "I")
	private int anInt373;

	@OriginalMember(owner = "client!client", name = "Zh", descriptor = "I")
	private int anInt374;

	@OriginalMember(owner = "client!client", name = "ai", descriptor = "I")
	private int anInt375;

	@OriginalMember(owner = "client!client", name = "bi", descriptor = "I")
	private int anInt376;

	@OriginalMember(owner = "client!client", name = "fi", descriptor = "I")
	private int anInt377;

	@OriginalMember(owner = "client!client", name = "ji", descriptor = "I")
	private int anInt379;

	@OriginalMember(owner = "client!client", name = "ki", descriptor = "I")
	private int anInt380;

	@OriginalMember(owner = "client!client", name = "li", descriptor = "I")
	private int anInt381;

	@OriginalMember(owner = "client!client", name = "mi", descriptor = "I")
	private int anInt382;

	@OriginalMember(owner = "client!client", name = "ni", descriptor = "I")
	private int anInt383;

	@OriginalMember(owner = "client!client", name = "pi", descriptor = "I")
	private int anInt385;

	@OriginalMember(owner = "client!client", name = "qi", descriptor = "I")
	private int anInt386;

	@OriginalMember(owner = "client!client", name = "ri", descriptor = "I")
	private int anInt387;

	@OriginalMember(owner = "client!client", name = "si", descriptor = "I")
	private int anInt388;

	@OriginalMember(owner = "client!client", name = "ti", descriptor = "I")
	private int anInt389;

	@OriginalMember(owner = "client!client", name = "ui", descriptor = "I")
	private int anInt390;

	@OriginalMember(owner = "client!client", name = "vi", descriptor = "I")
	private int anInt391;

	@OriginalMember(owner = "client!client", name = "wi", descriptor = "I")
	private int anInt392;

	@OriginalMember(owner = "client!client", name = "Fi", descriptor = "I")
	private int anInt394;

	@OriginalMember(owner = "client!client", name = "Gi", descriptor = "I")
	private int anInt395;

	@OriginalMember(owner = "client!client", name = "Mi", descriptor = "I")
	private int anInt399;

	@OriginalMember(owner = "client!client", name = "Ni", descriptor = "I")
	private int anInt400;

	@OriginalMember(owner = "client!client", name = "Oi", descriptor = "I")
	private int anInt401;

	@OriginalMember(owner = "client!client", name = "Ri", descriptor = "Lclient!ib;")
	private Class1_Sub1_Sub2_Sub2 aClass1_Sub1_Sub2_Sub2_12;

	@OriginalMember(owner = "client!client", name = "Si", descriptor = "Lclient!ib;")
	private Class1_Sub1_Sub2_Sub2 aClass1_Sub1_Sub2_Sub2_13;

	@OriginalMember(owner = "client!client", name = "Ti", descriptor = "Lclient!jb;")
	private Class1_Sub1_Sub2_Sub3 aClass1_Sub1_Sub2_Sub3_16;

	@OriginalMember(owner = "client!client", name = "Ui", descriptor = "Lclient!jb;")
	private Class1_Sub1_Sub2_Sub3 aClass1_Sub1_Sub2_Sub3_17;

	@OriginalMember(owner = "client!client", name = "Vi", descriptor = "Lclient!jb;")
	private Class1_Sub1_Sub2_Sub3 aClass1_Sub1_Sub2_Sub3_18;

	@OriginalMember(owner = "client!client", name = "Wi", descriptor = "Lclient!jb;")
	private Class1_Sub1_Sub2_Sub3 aClass1_Sub1_Sub2_Sub3_19;

	@OriginalMember(owner = "client!client", name = "Xi", descriptor = "Lclient!jb;")
	private Class1_Sub1_Sub2_Sub3 aClass1_Sub1_Sub2_Sub3_20;

	@OriginalMember(owner = "client!client", name = "Zi", descriptor = "Lclient!qb;")
	private Class35 aClass35_19;

	@OriginalMember(owner = "client!client", name = "aj", descriptor = "Lclient!qb;")
	private Class35 aClass35_20;

	@OriginalMember(owner = "client!client", name = "bj", descriptor = "Lclient!qb;")
	private Class35 aClass35_21;

	@OriginalMember(owner = "client!client", name = "cj", descriptor = "Lclient!qb;")
	private Class35 aClass35_22;

	@OriginalMember(owner = "client!client", name = "dj", descriptor = "Lclient!qb;")
	private Class35 aClass35_23;

	@OriginalMember(owner = "client!client", name = "ej", descriptor = "Lclient!qb;")
	private Class35 aClass35_24;

	@OriginalMember(owner = "client!client", name = "fj", descriptor = "Lclient!qb;")
	private Class35 aClass35_25;

	@OriginalMember(owner = "client!client", name = "gj", descriptor = "Lclient!qb;")
	private Class35 aClass35_26;

	@OriginalMember(owner = "client!client", name = "hj", descriptor = "Lclient!qb;")
	private Class35 aClass35_27;

	@OriginalMember(owner = "client!client", name = "jj", descriptor = "I")
	private int anInt403;

	@OriginalMember(owner = "client!client", name = "mj", descriptor = "I")
	private int anInt404;

	@OriginalMember(owner = "client!client", name = "pj", descriptor = "I")
	private int anInt405;

	@OriginalMember(owner = "client!client", name = "qj", descriptor = "J")
	private long aLong18;

	@OriginalMember(owner = "client!client", name = "rj", descriptor = "[I")
	private int[] anIntArray89;

	@OriginalMember(owner = "client!client", name = "sj", descriptor = "[I")
	private int[] anIntArray90;

	@OriginalMember(owner = "client!client", name = "tj", descriptor = "[I")
	private int[] anIntArray91;

	@OriginalMember(owner = "client!client", name = "uj", descriptor = "[I")
	private int[] anIntArray92;

	@OriginalMember(owner = "client!client", name = "wj", descriptor = "[Lclient!jb;")
	private Class1_Sub1_Sub2_Sub3[] aClass1_Sub1_Sub2_Sub3Array4;

	@OriginalMember(owner = "client!client", name = "zj", descriptor = "I")
	private int anInt406;

	@OriginalMember(owner = "client!client", name = "Aj", descriptor = "I")
	private int anInt407;

	@OriginalMember(owner = "client!client", name = "Bj", descriptor = "I")
	private int anInt408;

	@OriginalMember(owner = "client!client", name = "Cj", descriptor = "I")
	private int anInt409;

	@OriginalMember(owner = "client!client", name = "Dj", descriptor = "I")
	private int anInt410;

	@OriginalMember(owner = "client!client", name = "K", descriptor = "I")
	private int anInt205 = -1;

	@OriginalMember(owner = "client!client", name = "L", descriptor = "I")
	private int anInt206 = -6835;

	@OriginalMember(owner = "client!client", name = "N", descriptor = "[I")
	private int[] anIntArray32 = new int[50];

	@OriginalMember(owner = "client!client", name = "P", descriptor = "I")
	private int anInt209 = -1;

	@OriginalMember(owner = "client!client", name = "Q", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray1 = new String[5];

	@OriginalMember(owner = "client!client", name = "R", descriptor = "[Z")
	private boolean[] aBooleanArray3 = new boolean[5];

	@OriginalMember(owner = "client!client", name = "S", descriptor = "B")
	private byte aByte5 = 69;

	@OriginalMember(owner = "client!client", name = "W", descriptor = "[I")
	private int[] anIntArray33 = new int[1000];

	@OriginalMember(owner = "client!client", name = "X", descriptor = "[I")
	private int[] anIntArray34 = new int[1000];

	@OriginalMember(owner = "client!client", name = "cb", descriptor = "[Lclient!ib;")
	private Class1_Sub1_Sub2_Sub2[] aClass1_Sub1_Sub2_Sub2Array3 = new Class1_Sub1_Sub2_Sub2[8];

	@OriginalMember(owner = "client!client", name = "db", descriptor = "Lclient!lb;")
	private Class1_Sub1_Sub3 aClass1_Sub1_Sub3_2 = Class1_Sub1_Sub3.method468();

	@OriginalMember(owner = "client!client", name = "fb", descriptor = "B")
	private byte aByte6 = 5;

	@OriginalMember(owner = "client!client", name = "hb", descriptor = "Lclient!ob;")
	private Class29 aClass29_1 = new Class29(-794);

	@OriginalMember(owner = "client!client", name = "ib", descriptor = "I")
	private int anInt217 = -906;

	@OriginalMember(owner = "client!client", name = "sb", descriptor = "I")
	private int anInt219 = 1;

	@OriginalMember(owner = "client!client", name = "tb", descriptor = "[I")
	private int[] anIntArray38 = new int[50];

	@OriginalMember(owner = "client!client", name = "ub", descriptor = "B")
	private byte aByte7 = 66;

	@OriginalMember(owner = "client!client", name = "vb", descriptor = "I")
	private int anInt220 = -1;

	@OriginalMember(owner = "client!client", name = "zb", descriptor = "I")
	private int anInt224 = 128;

	@OriginalMember(owner = "client!client", name = "Eb", descriptor = "Z")
	public boolean aBoolean48 = false;

	@OriginalMember(owner = "client!client", name = "Fb", descriptor = "I")
	private int anInt228 = 5;

	@OriginalMember(owner = "client!client", name = "Gb", descriptor = "[I")
	private final int[] anIntArray39 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

	@OriginalMember(owner = "client!client", name = "Hb", descriptor = "Z")
	private boolean aBoolean49 = false;

	@OriginalMember(owner = "client!client", name = "Ib", descriptor = "[I")
	private int[] anIntArray40 = new int[100];

	@OriginalMember(owner = "client!client", name = "Jb", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray2 = new String[100];

	@OriginalMember(owner = "client!client", name = "Kb", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray3 = new String[100];

	@OriginalMember(owner = "client!client", name = "Mb", descriptor = "Z")
	private boolean aBoolean50 = false;

	@OriginalMember(owner = "client!client", name = "Tb", descriptor = "Z")
	private boolean aBoolean51 = true;

	@OriginalMember(owner = "client!client", name = "Ub", descriptor = "[Lclient!ib;")
	private Class1_Sub1_Sub2_Sub2[] aClass1_Sub1_Sub2_Sub2Array4 = new Class1_Sub1_Sub2_Sub2[1000];

	@OriginalMember(owner = "client!client", name = "Vb", descriptor = "[I")
	private int[] anIntArray41 = new int[33];

	@OriginalMember(owner = "client!client", name = "Wb", descriptor = "B")
	private byte aByte8 = 1;

	@OriginalMember(owner = "client!client", name = "Xb", descriptor = "Ljava/lang/String;")
	private String aString5 = "";

	@OriginalMember(owner = "client!client", name = "Yb", descriptor = "Ljava/lang/String;")
	private String aString6 = "";

	@OriginalMember(owner = "client!client", name = "Zb", descriptor = "B")
	private byte aByte9 = 107;

	@OriginalMember(owner = "client!client", name = "ac", descriptor = "[Z")
	private boolean[] aBooleanArray4 = new boolean[5];

	@OriginalMember(owner = "client!client", name = "ec", descriptor = "Z")
	private boolean aBoolean52 = true;

	@OriginalMember(owner = "client!client", name = "fc", descriptor = "I")
	private int anInt239 = 26816;

	@OriginalMember(owner = "client!client", name = "gc", descriptor = "[Lclient!vb;")
	public Class45[] aClass45Array1 = new Class45[5];

	@OriginalMember(owner = "client!client", name = "jc", descriptor = "I")
	private int anInt241 = 3;

	@OriginalMember(owner = "client!client", name = "kc", descriptor = "[Lclient!z;")
	private Class1_Sub1_Sub1_Sub1_Sub2[] aClass1_Sub1_Sub1_Sub1_Sub2Array1 = new Class1_Sub1_Sub1_Sub1_Sub2[16384];

	@OriginalMember(owner = "client!client", name = "mc", descriptor = "[I")
	private int[] anIntArray42 = new int[16384];

	@OriginalMember(owner = "client!client", name = "nc", descriptor = "Z")
	private boolean aBoolean53 = false;

	@OriginalMember(owner = "client!client", name = "pc", descriptor = "I")
	private int anInt244 = 50;

	@OriginalMember(owner = "client!client", name = "qc", descriptor = "[I")
	private int[] anIntArray43 = new int[this.anInt244];

	@OriginalMember(owner = "client!client", name = "rc", descriptor = "[I")
	private int[] anIntArray44 = new int[this.anInt244];

	@OriginalMember(owner = "client!client", name = "sc", descriptor = "[I")
	private int[] anIntArray45 = new int[this.anInt244];

	@OriginalMember(owner = "client!client", name = "tc", descriptor = "[I")
	private int[] anIntArray46 = new int[this.anInt244];

	@OriginalMember(owner = "client!client", name = "uc", descriptor = "[I")
	private int[] anIntArray47 = new int[this.anInt244];

	@OriginalMember(owner = "client!client", name = "vc", descriptor = "[I")
	private int[] anIntArray48 = new int[this.anInt244];

	@OriginalMember(owner = "client!client", name = "wc", descriptor = "[I")
	private int[] anIntArray49 = new int[this.anInt244];

	@OriginalMember(owner = "client!client", name = "xc", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray4 = new String[this.anInt244];

	@OriginalMember(owner = "client!client", name = "zc", descriptor = "Z")
	private boolean aBoolean54 = false;

	@OriginalMember(owner = "client!client", name = "Bc", descriptor = "Z")
	private boolean aBoolean55 = false;

	@OriginalMember(owner = "client!client", name = "Cc", descriptor = "I")
	private int anInt246 = 16935;

	@OriginalMember(owner = "client!client", name = "Dc", descriptor = "I")
	private int anInt247 = -1;

	@OriginalMember(owner = "client!client", name = "Jc", descriptor = "[I")
	private int[] anIntArray50 = new int[4000];

	@OriginalMember(owner = "client!client", name = "Kc", descriptor = "[I")
	private int[] anIntArray51 = new int[4000];

	@OriginalMember(owner = "client!client", name = "Mc", descriptor = "[[[Lclient!ob;")
	private Class29[][][] aClass29ArrayArrayArray1 = new Class29[4][104][104];

	@OriginalMember(owner = "client!client", name = "Tc", descriptor = "[I")
	private int[] anIntArray52 = new int[Class30.anInt802];

	@OriginalMember(owner = "client!client", name = "bd", descriptor = "I")
	private int anInt265 = 2;

	@OriginalMember(owner = "client!client", name = "cd", descriptor = "Z")
	private boolean aBoolean56 = true;

	@OriginalMember(owner = "client!client", name = "dd", descriptor = "Z")
	private boolean aBoolean57 = false;

	@OriginalMember(owner = "client!client", name = "jd", descriptor = "[J")
	private long[] aLongArray3 = new long[200];

	@OriginalMember(owner = "client!client", name = "ld", descriptor = "I")
	private int anInt271 = 2048;

	@OriginalMember(owner = "client!client", name = "md", descriptor = "I")
	private int anInt272 = 2047;

	@OriginalMember(owner = "client!client", name = "nd", descriptor = "[Lclient!ab;")
	private Class1_Sub1_Sub1_Sub1_Sub1[] aClass1_Sub1_Sub1_Sub1_Sub1Array1 = new Class1_Sub1_Sub1_Sub1_Sub1[this.anInt271];

	@OriginalMember(owner = "client!client", name = "pd", descriptor = "[I")
	private int[] anIntArray53 = new int[this.anInt271];

	@OriginalMember(owner = "client!client", name = "rd", descriptor = "[I")
	private int[] anIntArray54 = new int[this.anInt271];

	@OriginalMember(owner = "client!client", name = "sd", descriptor = "[Lclient!lb;")
	private Class1_Sub1_Sub3[] aClass1_Sub1_Sub3Array1 = new Class1_Sub1_Sub3[this.anInt271];

	@OriginalMember(owner = "client!client", name = "td", descriptor = "I")
	private int anInt275 = -1;

	@OriginalMember(owner = "client!client", name = "yd", descriptor = "Z")
	private boolean aBoolean59 = false;

	@OriginalMember(owner = "client!client", name = "Ad", descriptor = "Z")
	private boolean aBoolean60 = false;

	@OriginalMember(owner = "client!client", name = "Hd", descriptor = "Z")
	private boolean aBoolean61 = false;

	@OriginalMember(owner = "client!client", name = "Id", descriptor = "Z")
	private boolean aBoolean62 = false;

	@OriginalMember(owner = "client!client", name = "Jd", descriptor = "Lclient!lb;")
	private Class1_Sub1_Sub3 aClass1_Sub1_Sub3_3 = Class1_Sub1_Sub3.method468();

	@OriginalMember(owner = "client!client", name = "Kd", descriptor = "Z")
	private boolean aBoolean63 = true;

	@OriginalMember(owner = "client!client", name = "Qd", descriptor = "[I")
	private int[] anIntArray55 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

	@OriginalMember(owner = "client!client", name = "Xd", descriptor = "Z")
	private boolean aBoolean67 = false;

	@OriginalMember(owner = "client!client", name = "Yd", descriptor = "Ljava/lang/String;")
	private String aString8 = "";

	@OriginalMember(owner = "client!client", name = "ae", descriptor = "I")
	private int anInt287 = -1;

	@OriginalMember(owner = "client!client", name = "be", descriptor = "I")
	private int anInt288 = -1;

	@OriginalMember(owner = "client!client", name = "je", descriptor = "I")
	private int anInt295 = -521;

	@OriginalMember(owner = "client!client", name = "ke", descriptor = "Ljava/lang/String;")
	private String aString10 = "";

	@OriginalMember(owner = "client!client", name = "le", descriptor = "Ljava/lang/String;")
	private String aString11 = "";

	@OriginalMember(owner = "client!client", name = "oe", descriptor = "I")
	private int anInt297 = 2;

	@OriginalMember(owner = "client!client", name = "pe", descriptor = "I")
	private int anInt298 = -540;

	@OriginalMember(owner = "client!client", name = "we", descriptor = "B")
	private byte aByte10 = 1;

	@OriginalMember(owner = "client!client", name = "xe", descriptor = "Ljava/util/zip/CRC32;")
	private CRC32 aCRC32_1 = new CRC32();

	@OriginalMember(owner = "client!client", name = "Ce", descriptor = "Z")
	private boolean aBoolean68 = false;

	@OriginalMember(owner = "client!client", name = "Ne", descriptor = "Z")
	private boolean aBoolean69 = false;

	@OriginalMember(owner = "client!client", name = "Se", descriptor = "[I")
	private int[] anIntArray61 = new int[9];

	@OriginalMember(owner = "client!client", name = "Te", descriptor = "[I")
	private int[] anIntArray62 = new int[5];

	@OriginalMember(owner = "client!client", name = "Ue", descriptor = "[[I")
	private int[][] anIntArrayArray3 = new int[104][104];

	@OriginalMember(owner = "client!client", name = "We", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray5 = new String[200];

	@OriginalMember(owner = "client!client", name = "Ze", descriptor = "I")
	private int anInt310 = 9;

	@OriginalMember(owner = "client!client", name = "hf", descriptor = "I")
	private int anInt318 = 7759444;

	@OriginalMember(owner = "client!client", name = "pf", descriptor = "I")
	private int anInt320 = 417;

	@OriginalMember(owner = "client!client", name = "qf", descriptor = "[I")
	private int[] anIntArray64 = new int[151];

	@OriginalMember(owner = "client!client", name = "tf", descriptor = "[Lclient!jb;")
	private Class1_Sub1_Sub2_Sub3[] aClass1_Sub1_Sub2_Sub3Array1 = new Class1_Sub1_Sub2_Sub3[13];

	@OriginalMember(owner = "client!client", name = "uf", descriptor = "Z")
	private boolean aBoolean70 = true;

	@OriginalMember(owner = "client!client", name = "Af", descriptor = "Z")
	private boolean aBoolean71 = false;

	@OriginalMember(owner = "client!client", name = "Bf", descriptor = "Z")
	private boolean aBoolean72 = false;

	@OriginalMember(owner = "client!client", name = "Cf", descriptor = "Z")
	private boolean aBoolean73 = false;

	@OriginalMember(owner = "client!client", name = "Df", descriptor = "Z")
	private boolean aBoolean74 = true;

	@OriginalMember(owner = "client!client", name = "Hf", descriptor = "Z")
	private boolean aBoolean75 = false;

	@OriginalMember(owner = "client!client", name = "Jf", descriptor = "I")
	private int anInt327 = -1;

	@OriginalMember(owner = "client!client", name = "Uf", descriptor = "I")
	private int anInt333 = -1;

	@OriginalMember(owner = "client!client", name = "Xf", descriptor = "Lclient!ob;")
	private Class29 aClass29_2 = new Class29(-794);

	@OriginalMember(owner = "client!client", name = "Yf", descriptor = "[I")
	private int[] anIntArray65 = new int[7];

	@OriginalMember(owner = "client!client", name = "Zf", descriptor = "Ljava/lang/String;")
	private String aString13 = "";

	@OriginalMember(owner = "client!client", name = "bg", descriptor = "I")
	private int anInt337 = 2;

	@OriginalMember(owner = "client!client", name = "dg", descriptor = "[I")
	private int[] anIntArray66 = new int[1000];

	@OriginalMember(owner = "client!client", name = "jg", descriptor = "Z")
	private boolean aBoolean77 = false;

	@OriginalMember(owner = "client!client", name = "ng", descriptor = "I")
	private int anInt345 = -1;

	@OriginalMember(owner = "client!client", name = "tg", descriptor = "Z")
	private boolean aBoolean78 = false;

	@OriginalMember(owner = "client!client", name = "wg", descriptor = "[Lclient!ib;")
	private Class1_Sub1_Sub2_Sub2[] aClass1_Sub1_Sub2_Sub2Array5 = new Class1_Sub1_Sub2_Sub2[20];

	@OriginalMember(owner = "client!client", name = "xg", descriptor = "[I")
	private int[] anIntArray69 = new int[2000];

	@OriginalMember(owner = "client!client", name = "yg", descriptor = "Z")
	private boolean aBoolean79 = true;

	@OriginalMember(owner = "client!client", name = "zg", descriptor = "Ljava/lang/String;")
	private String aString14 = "";

	@OriginalMember(owner = "client!client", name = "Ag", descriptor = "[I")
	private int[] anIntArray70 = new int[5];

	@OriginalMember(owner = "client!client", name = "Dg", descriptor = "[I")
	private int[] anIntArray71 = new int[5];

	@OriginalMember(owner = "client!client", name = "Eg", descriptor = "[J")
	private long[] aLongArray4 = new long[100];

	@OriginalMember(owner = "client!client", name = "Fg", descriptor = "[I")
	private int[] anIntArray72 = new int[5];

	@OriginalMember(owner = "client!client", name = "Gg", descriptor = "Lclient!d;")
	private Class6 aClass6_1 = new Class6();

	@OriginalMember(owner = "client!client", name = "Hg", descriptor = "I")
	private int anInt352 = -13424;

	@OriginalMember(owner = "client!client", name = "Sg", descriptor = "Z")
	private boolean aBoolean80 = false;

	@OriginalMember(owner = "client!client", name = "Tg", descriptor = "[Lclient!jb;")
	private Class1_Sub1_Sub2_Sub3[] aClass1_Sub1_Sub2_Sub3Array2 = new Class1_Sub1_Sub2_Sub3[100];

	@OriginalMember(owner = "client!client", name = "Xg", descriptor = "Z")
	private boolean aBoolean82 = false;

	@OriginalMember(owner = "client!client", name = "Yg", descriptor = "[I")
	public int[] anIntArray73 = new int[2000];

	@OriginalMember(owner = "client!client", name = "ah", descriptor = "[I")
	private int[] anIntArray74 = new int[Class30.anInt802];

	@OriginalMember(owner = "client!client", name = "bh", descriptor = "Z")
	private boolean aBoolean83 = false;

	@OriginalMember(owner = "client!client", name = "ch", descriptor = "[Lclient!jb;")
	private Class1_Sub1_Sub2_Sub3[] aClass1_Sub1_Sub2_Sub3Array3 = new Class1_Sub1_Sub2_Sub3[2];

	@OriginalMember(owner = "client!client", name = "dh", descriptor = "Z")
	private boolean aBoolean84 = true;

	@OriginalMember(owner = "client!client", name = "gh", descriptor = "Z")
	private boolean aBoolean85 = true;

	@OriginalMember(owner = "client!client", name = "hh", descriptor = "[I")
	private int[] anIntArray75 = new int[256];

	@OriginalMember(owner = "client!client", name = "ih", descriptor = "Z")
	private boolean aBoolean86 = true;

	@OriginalMember(owner = "client!client", name = "jh", descriptor = "[B")
	private byte[] aByteArray2 = new byte[16384];

	@OriginalMember(owner = "client!client", name = "oh", descriptor = "I")
	private int anInt357 = 2301979;

	@OriginalMember(owner = "client!client", name = "ph", descriptor = "I")
	private int anInt358 = -606;

	@OriginalMember(owner = "client!client", name = "th", descriptor = "Z")
	private boolean aBoolean87 = true;

	@OriginalMember(owner = "client!client", name = "uh", descriptor = "Z")
	private boolean aBoolean88 = false;

	@OriginalMember(owner = "client!client", name = "vh", descriptor = "[I")
	private int[] anIntArray77 = new int[33];

	@OriginalMember(owner = "client!client", name = "yh", descriptor = "I")
	private int anInt363 = 1;

	@OriginalMember(owner = "client!client", name = "zh", descriptor = "I")
	private int anInt364 = -1;

	@OriginalMember(owner = "client!client", name = "Ah", descriptor = "[I")
	private int[] anIntArray78 = new int[500];

	@OriginalMember(owner = "client!client", name = "Bh", descriptor = "[I")
	private int[] anIntArray79 = new int[500];

	@OriginalMember(owner = "client!client", name = "Ch", descriptor = "[I")
	private int[] anIntArray80 = new int[500];

	@OriginalMember(owner = "client!client", name = "Dh", descriptor = "[I")
	private int[] anIntArray81 = new int[500];

	@OriginalMember(owner = "client!client", name = "Eh", descriptor = "[I")
	private int[] anIntArray82 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

	@OriginalMember(owner = "client!client", name = "Fh", descriptor = "[Lclient!ib;")
	private Class1_Sub1_Sub2_Sub2[] aClass1_Sub1_Sub2_Sub2Array6 = new Class1_Sub1_Sub2_Sub2[20];

	@OriginalMember(owner = "client!client", name = "Hh", descriptor = "I")
	private int anInt366 = -1;

	@OriginalMember(owner = "client!client", name = "Jh", descriptor = "[I")
	private int[] anIntArray83 = new int[5];

	@OriginalMember(owner = "client!client", name = "Kh", descriptor = "I")
	private final int anInt367 = 100;

	@OriginalMember(owner = "client!client", name = "Lh", descriptor = "[I")
	private int[] anIntArray84 = new int[100];

	@OriginalMember(owner = "client!client", name = "Mh", descriptor = "Lclient!lb;")
	private Class1_Sub1_Sub3 aClass1_Sub1_Sub3_4 = Class1_Sub1_Sub3.method468();

	@OriginalMember(owner = "client!client", name = "Ph", descriptor = "Lclient!ob;")
	private Class29 aClass29_3 = new Class29(-794);

	@OriginalMember(owner = "client!client", name = "Xh", descriptor = "B")
	private byte aByte11 = 8;

	@OriginalMember(owner = "client!client", name = "ci", descriptor = "[[I")
	private int[][] anIntArrayArray5 = new int[104][104];

	@OriginalMember(owner = "client!client", name = "di", descriptor = "[[I")
	private int[][] anIntArrayArray6 = new int[104][104];

	@OriginalMember(owner = "client!client", name = "ei", descriptor = "Z")
	private boolean aBoolean89 = true;

	@OriginalMember(owner = "client!client", name = "hi", descriptor = "Z")
	private boolean aBoolean90 = false;

	@OriginalMember(owner = "client!client", name = "ii", descriptor = "I")
	private int anInt378 = -9666;

	@OriginalMember(owner = "client!client", name = "oi", descriptor = "I")
	private int anInt384 = 78;

	@OriginalMember(owner = "client!client", name = "yi", descriptor = "Z")
	private boolean aBoolean92 = false;

	@OriginalMember(owner = "client!client", name = "Ai", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray6 = new String[500];

	@OriginalMember(owner = "client!client", name = "Bi", descriptor = "[I")
	private int[] anIntArray85 = new int[200];

	@OriginalMember(owner = "client!client", name = "Ci", descriptor = "Ljava/lang/String;")
	private String aString16 = "";

	@OriginalMember(owner = "client!client", name = "Di", descriptor = "[I")
	private int[] anIntArray86 = new int[151];

	@OriginalMember(owner = "client!client", name = "Ei", descriptor = "Z")
	private boolean aBoolean93 = false;

	@OriginalMember(owner = "client!client", name = "Hi", descriptor = "I")
	private int anInt396 = 3353893;

	@OriginalMember(owner = "client!client", name = "Ii", descriptor = "I")
	private int anInt397 = -1;

	@OriginalMember(owner = "client!client", name = "Ji", descriptor = "Z")
	private boolean aBoolean94 = false;

	@OriginalMember(owner = "client!client", name = "Ki", descriptor = "I")
	private int anInt398 = -1;

	@OriginalMember(owner = "client!client", name = "Li", descriptor = "[Lclient!jc;")
	private Class19[] aClass19Array1 = new Class19[4];

	@OriginalMember(owner = "client!client", name = "Pi", descriptor = "Z")
	private boolean aBoolean95 = false;

	@OriginalMember(owner = "client!client", name = "Qi", descriptor = "[I")
	private int[] anIntArray87 = new int[50];

	@OriginalMember(owner = "client!client", name = "ij", descriptor = "I")
	private int anInt402 = 5063219;

	@OriginalMember(owner = "client!client", name = "kj", descriptor = "Z")
	private boolean aBoolean97 = true;

	@OriginalMember(owner = "client!client", name = "nj", descriptor = "Z")
	private boolean aBoolean98 = false;

	@OriginalMember(owner = "client!client", name = "oj", descriptor = "[Lclient!ib;")
	private Class1_Sub1_Sub2_Sub2[] aClass1_Sub1_Sub2_Sub2Array7 = new Class1_Sub1_Sub2_Sub2[100];

	@OriginalMember(owner = "client!client", name = "vj", descriptor = "Z")
	private boolean aBoolean99 = false;

	@OriginalMember(owner = "client!client", name = "xj", descriptor = "Ljava/lang/String;")
	private String aString17 = "";

	@OriginalMember(owner = "client!client", name = "yj", descriptor = "Z")
	private boolean aBoolean100 = false;

	@OriginalMember(owner = "client!client", name = "Gj", descriptor = "B")
	private byte aByte12 = 6;

	@OriginalMember(owner = "client!client", name = "Ij", descriptor = "[I")
	private int[] anIntArray93 = new int[Class30.anInt802];

	static {
		@Pc(344) int local344 = 0;
		@Pc(346) int local346;
		for (local346 = 0; local346 < 99; local346++) {
			@Pc(351) int local351 = local346 + 1;
			@Pc(364) int local364 = (int) ((double) local351 + Math.pow(2.0D, (double) local351 / 7.0D) * 300.0D);
			local344 += local364;
			anIntArray76[local346] = local344 / 4;
		}
		anInt368 = -14830;
		aBigInteger2 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");
		anIntArray88 = new int[32];
		local344 = 2;
		for (local346 = 0; local346 < 32; local346++) {
			anIntArray88[local346] = local344 - 1;
			local344 += local344;
		}
		aBoolean101 = true;
	}

	@OriginalMember(owner = "client!client", name = "l", descriptor = "(I)V")
	private static void method104() {
		try {
			Class37.aBoolean227 = true;
			Class1_Sub1_Sub2_Sub1.aBoolean160 = true;
			aBoolean66 = true;
			Class4.aBoolean35 = true;
		} catch (@Pc(21) RuntimeException local21) {
			signlink.reporterror("21278, " + 7 + ", " + local21.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(III)Ljava/lang/String;")
	private static String method132(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
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
			signlink.reporterror("66497, " + arg0 + ", " + -370 + ", " + arg1 + ", " + local52.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "q", descriptor = "(I)V")
	private static void method133() {
		try {
			Class37.aBoolean227 = false;
			Class1_Sub1_Sub2_Sub1.aBoolean160 = false;
			aBoolean66 = false;
			Class4.aBoolean35 = false;
		} catch (@Pc(18) RuntimeException local18) {
			signlink.reporterror("84384, " + 0 + ", " + local18.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(BI)Ljava/lang/String;")
	private static String method145(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(4) String local4 = String.valueOf(arg1);
			for (@Pc(9) int local9 = local4.length() - 3; local9 > 0; local9 -= 3) {
				local4 = local4.substring(0, local9) + "," + local4.substring(local9);
			}
			@Pc(35) boolean local35 = false;
			if (local4.length() > 8) {
				local4 = "@gre@" + local4.substring(0, local4.length() - 8) + " million @whi@(" + local4 + ")";
			} else if (local4.length() > 4) {
				local4 = "@cya@" + local4.substring(0, local4.length() - 4) + "K @whi@(" + local4 + ")";
			}
			return " " + local4;
		} catch (@Pc(100) RuntimeException local100) {
			signlink.reporterror("7886, " + arg0 + ", " + arg1 + ", " + local100.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ZI)Ljava/lang/String;")
	private static String method151(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1) {
		try {
			if (arg0) {
				throw new NullPointerException();
			} else if (arg1 < 100000) {
				return String.valueOf(arg1);
			} else if (arg1 < 10000000) {
				return arg1 / 1000 + "K";
			} else {
				return arg1 / 1000000 + "M";
			}
		} catch (@Pc(37) RuntimeException local37) {
			signlink.reporterror("35348, " + arg0 + ", " + arg1 + ", " + local37.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "main", descriptor = "([Ljava/lang/String;)V")
	public static void main(@OriginalArg(0) String[] arg0) {
		try {
			System.out.println("RS2 user client - release #" + 295);
			if (arg0.length == 5) {
				anInt282 = Integer.parseInt(arg0[0]);
				anInt283 = Integer.parseInt(arg0[1]);
				if (arg0[2].equals("lowmem")) {
					method104();
				} else if (arg0[2].equals("highmem")) {
					method133();
				} else {
					System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
					return;
				}
				if (arg0[3].equals("free")) {
					aBoolean65 = false;
				} else if (arg0[3].equals("members")) {
					aBoolean65 = true;
				} else {
					System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
					return;
				}
				signlink.anInt927 = Integer.parseInt(arg0[4]);
				signlink.startpriv(InetAddress.getLocalHost());
				@Pc(87) client local87 = new client();
				local87.method84();
			} else {
				System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
			}
		} catch (@Pc(94) Exception local94) {
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(B)V")
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
			this.method200();
			if (this.aClass11_1 != null) {
				this.aClass11_1.aBoolean146 = false;
			}
			this.aClass11_1 = null;
			this.aClass44_Sub1_1.method637();
			this.aClass44_Sub1_1 = null;
			this.aClass1_Sub1_Sub3_2 = null;
			this.aClass1_Sub1_Sub3_3 = null;
			this.aClass1_Sub1_Sub3_4 = null;
			this.anIntArray35 = null;
			this.aByteArrayArray2 = null;
			this.aByteArrayArray1 = null;
			this.anIntArray36 = null;
			this.anIntArray37 = null;
			this.anIntArrayArrayArray5 = null;
			this.aByteArrayArrayArray7 = null;
			this.aClass37_1 = null;
			this.aClass19Array1 = null;
			this.anIntArrayArray5 = null;
			this.anIntArrayArray3 = null;
			this.anIntArray50 = null;
			this.anIntArray51 = null;
			this.aByteArray2 = null;
			this.aClass35_6 = null;
			this.aClass35_7 = null;
			this.aClass35_8 = null;
			this.aClass35_9 = null;
			this.aClass35_3 = null;
			this.aClass35_4 = null;
			this.aClass35_5 = null;
			this.aClass35_10 = null;
			this.aClass35_11 = null;
			this.aClass35_12 = null;
			this.aClass35_13 = null;
			this.aClass35_14 = null;
			this.aClass35_15 = null;
			this.aClass35_16 = null;
			this.aClass35_17 = null;
			this.aClass35_18 = null;
			this.aClass1_Sub1_Sub2_Sub3_1 = null;
			this.aClass1_Sub1_Sub2_Sub3_2 = null;
			this.aClass1_Sub1_Sub2_Sub3_3 = null;
			this.aClass1_Sub1_Sub2_Sub3_4 = null;
			this.aClass1_Sub1_Sub2_Sub3_5 = null;
			this.aClass1_Sub1_Sub2_Sub3_6 = null;
			this.aClass1_Sub1_Sub2_Sub3Array1 = null;
			this.aClass1_Sub1_Sub2_Sub3_7 = null;
			this.aClass1_Sub1_Sub2_Sub3_8 = null;
			this.aClass1_Sub1_Sub2_Sub3_9 = null;
			this.aClass1_Sub1_Sub2_Sub3_10 = null;
			this.aClass1_Sub1_Sub2_Sub3_11 = null;
			this.aClass1_Sub1_Sub2_Sub3_16 = null;
			this.aClass1_Sub1_Sub2_Sub3_17 = null;
			this.aClass1_Sub1_Sub2_Sub3_18 = null;
			this.aClass1_Sub1_Sub2_Sub3_19 = null;
			this.aClass1_Sub1_Sub2_Sub3_20 = null;
			this.aClass1_Sub1_Sub2_Sub2_10 = null;
			this.aClass1_Sub1_Sub2_Sub2Array6 = null;
			this.aClass1_Sub1_Sub2_Sub2Array5 = null;
			this.aClass1_Sub1_Sub2_Sub2Array3 = null;
			this.aClass1_Sub1_Sub2_Sub2_2 = null;
			this.aClass1_Sub1_Sub2_Sub2_3 = null;
			this.aClass1_Sub1_Sub2_Sub2_4 = null;
			this.aClass1_Sub1_Sub2_Sub2_5 = null;
			this.aClass1_Sub1_Sub2_Sub3Array2 = null;
			this.aClass1_Sub1_Sub2_Sub2Array7 = null;
			this.anIntArrayArray6 = null;
			this.aClass1_Sub1_Sub1_Sub1_Sub1Array1 = null;
			this.anIntArray53 = null;
			this.anIntArray54 = null;
			this.aClass1_Sub1_Sub3Array1 = null;
			this.anIntArray66 = null;
			this.aClass1_Sub1_Sub1_Sub1_Sub2Array1 = null;
			this.anIntArray42 = null;
			this.aClass29ArrayArrayArray1 = null;
			this.aClass29_3 = null;
			this.aClass29_2 = null;
			this.aClass29_1 = null;
			this.anIntArray78 = null;
			this.anIntArray79 = null;
			this.anIntArray80 = null;
			this.anIntArray81 = null;
			this.aStringArray6 = null;
			this.anIntArray73 = null;
			this.anIntArray33 = null;
			this.anIntArray34 = null;
			this.aClass1_Sub1_Sub2_Sub2Array4 = null;
			this.aClass1_Sub1_Sub2_Sub2_11 = null;
			this.aStringArray5 = null;
			this.aLongArray3 = null;
			this.anIntArray85 = null;
			this.aClass35_22 = null;
			this.aClass35_23 = null;
			this.aClass35_19 = null;
			this.aClass35_20 = null;
			this.aClass35_21 = null;
			this.aClass35_24 = null;
			this.aClass35_25 = null;
			this.aClass35_26 = null;
			this.aClass35_27 = null;
			this.method110();
			Class9.method287();
			Class13.method322((byte) 4);
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
			Class1_Sub1_Sub2_Sub1.method342((byte) 4);
			Class37.method529();
			Class1_Sub1_Sub1_Sub5.method257();
			Class12.method304();
			System.gc();
		} catch (@Pc(358) RuntimeException local358) {
			signlink.reporterror("53285, " + -2 + ", " + local358.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(I)V")
	private void method97() {
		try {
			if (aBoolean66 && this.anInt395 == 2 && Class4.anInt172 != this.anInt334) {
				this.aClass35_8.method524();
				this.aClass1_Sub1_Sub2_Sub4_2.method447(257, 0, "Loading - please wait.", 151);
				this.aClass1_Sub1_Sub2_Sub4_2.method447(256, 16777215, "Loading - please wait.", 150);
				this.aClass35_8.method525(4, 4, super.aGraphics2);
				this.anInt395 = 1;
				this.aLong16 = System.currentTimeMillis();
			}
			if (this.anInt395 == 1) {
				@Pc(59) int local59 = this.method98();
				if (local59 != 0 && System.currentTimeMillis() - this.aLong16 > 360000L) {
					signlink.reporterror(this.aString10 + " glcfb " + this.aLong17 + "," + local59 + "," + aBoolean66 + "," + this.aClass45Array1[0] + "," + this.aClass44_Sub1_1.method646() + "," + this.anInt334 + "," + this.anInt339 + "," + this.anInt340);
					this.aLong16 = System.currentTimeMillis();
				}
			}
			if (this.anInt395 == 2 && this.anInt334 != this.anInt345) {
				this.anInt345 = this.anInt334;
				this.method195(this.anInt334);
			}
		} catch (@Pc(140) RuntimeException local140) {
			signlink.reporterror("36511, " + 3 + ", " + local140.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "f", descriptor = "(I)I")
	private int method98() {
		try {
			for (@Pc(3) int local3 = 0; local3 < this.aByteArrayArray2.length; local3++) {
				if (this.aByteArrayArray2[local3] == null && this.anIntArray36[local3] != -1) {
					return -1;
				}
				if (this.aByteArrayArray1[local3] == null && this.anIntArray37[local3] != -1) {
					return -2;
				}
			}
			@Pc(39) boolean local39 = true;
			for (@Pc(41) int local41 = 0; local41 < this.aByteArrayArray2.length; local41++) {
				@Pc(48) byte[] local48 = this.aByteArrayArray1[local41];
				if (local48 != null) {
					@Pc(62) int local62 = (this.anIntArray35[local41] >> 8) * 64 - this.anInt213;
					@Pc(74) int local74 = (this.anIntArray35[local41] & 0xFF) * 64 - this.anInt214;
					local39 &= Class4.method58(local74, local62, local48);
				}
			}
			if (!local39) {
				return -3;
			} else if (this.aBoolean71) {
				return -4;
			} else {
				this.anInt395 = 2;
				Class4.anInt172 = this.anInt334;
				this.method126(this.anInt358);
				this.aClass1_Sub1_Sub3_2.method469(218, 837);
				return 0;
			}
		} catch (@Pc(123) RuntimeException local123) {
			signlink.reporterror("41481, " + -467 + ", " + local123.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "g", descriptor = "(I)V")
	private void method99() {
		try {
			Class9.aClass40_4.method593();
			Class9.aClass40_5.method593();
			Class13.aClass40_6.method593();
			Class15.aClass40_7.method593();
			Class15.aClass40_8.method593();
			Class1_Sub1_Sub1_Sub1_Sub1.aClass40_1.method593();
			Class33.aClass40_9.method593();
		} catch (@Pc(24) RuntimeException local24) {
			signlink.reporterror("3946, " + 0 + ", " + local24.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "h", descriptor = "(I)V")
	private void method100() {
		try {
			System.out.println("============");
			System.out.println("flame-cycle:" + this.anInt403);
			if (this.aClass44_Sub1_1 != null) {
				System.out.println("Od-cycle:" + this.aClass44_Sub1_1.anInt951);
			}
			System.out.println("loop-cycle:" + anInt236);
			System.out.println("draw-cycle:" + anInt276);
			System.out.println("ptype:" + this.anInt249);
			System.out.println("psize:" + this.anInt248);
			if (this.aClass8_1 != null) {
				this.aClass8_1.method252();
			}
			super.aBoolean44 = true;
		} catch (@Pc(83) RuntimeException local83) {
			signlink.reporterror("66574, " + -56 + ", " + local83.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(I)Ljava/awt/Component;")
	@Override
	protected Component method94() {
		try {
			if (signlink.mainapp == null) {
				return super.aFrame_Sub1_2 == null ? this : super.aFrame_Sub1_2;
			} else {
				return signlink.mainapp;
			}
		} catch (@Pc(18) RuntimeException local18) {
			signlink.reporterror("18241, " + 0 + ", " + local18.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "i", descriptor = "(I)Ljava/lang/String;")
	private String method101() {
		try {
			this.anInt248 += 0;
			if (signlink.mainapp == null) {
				return super.aFrame_Sub1_2 == null ? super.getDocumentBase().getHost().toLowerCase() : "runescape.com";
			} else {
				return signlink.mainapp.getDocumentBase().getHost().toLowerCase();
			}
		} catch (@Pc(23) RuntimeException local23) {
			signlink.reporterror("42172, " + 0 + ", " + local23.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "j", descriptor = "(I)V")
	private void method102() {
		try {
			if (this.anInt335 != 0) {
				@Pc(10) Class1_Sub1_Sub2_Sub4 local10 = this.aClass1_Sub1_Sub2_Sub4_2;
				@Pc(12) int local12 = 0;
				if (this.anInt385 != 0) {
					local12 = 1;
				}
				for (@Pc(19) int local19 = 0; local19 < 100; local19++) {
					if (this.aStringArray3[local19] != null) {
						@Pc(31) int local31 = this.anIntArray40[local19];
						@Pc(36) String local36 = this.aStringArray2[local19];
						@Pc(38) byte local38 = 0;
						if (local36 != null && local36.startsWith("@cr1@")) {
							local36 = local36.substring(5);
							local38 = 1;
						}
						if (local36 != null && local36.startsWith("@cr2@")) {
							local36 = local36.substring(5);
							local38 = 2;
						}
						@Pc(90) int local90;
						if ((local31 == 3 || local31 == 7) && (local31 == 7 || this.anInt353 == 0 || this.anInt353 == 1 && this.method185(this.anInt325, local36))) {
							local90 = 329 - local12 * 13;
							local10.method451(local90, 0, 4, "From");
							local10.method451(local90 - 1, 65535, 4, "From");
							@Pc(115) int local115 = local10.method449("From ") + 4;
							if (local38 == 1) {
								this.aClass1_Sub1_Sub2_Sub3Array3[0].method418(local115, local90 - 12);
								local115 += 14;
							}
							if (local38 == 2) {
								this.aClass1_Sub1_Sub2_Sub3Array3[1].method418(local115, local90 - 12);
								local115 += 14;
							}
							local10.method451(local90, 0, local115, local36 + ": " + this.aStringArray3[local19]);
							local10.method451(local90 - 1, 65535, local115, local36 + ": " + this.aStringArray3[local19]);
							local12++;
							if (local12 >= 5) {
								return;
							}
						}
						if (local31 == 5 && this.anInt353 < 2) {
							local90 = 329 - local12 * 13;
							local10.method451(local90, 0, 4, this.aStringArray3[local19]);
							local10.method451(local90 - 1, 65535, 4, this.aStringArray3[local19]);
							local12++;
							if (local12 >= 5) {
								return;
							}
						}
						if (local31 == 6 && this.anInt353 < 2) {
							local90 = 329 - local12 * 13;
							local10.method451(local90, 0, 4, "To " + local36 + ": " + this.aStringArray3[local19]);
							local10.method451(local90 - 1, 65535, 4, "To " + local36 + ": " + this.aStringArray3[local19]);
							local12++;
							if (local12 >= 5) {
								return;
							}
						}
					}
				}
			}
		} catch (@Pc(294) RuntimeException local294) {
			signlink.reporterror("95267, " + 48999 + ", " + local294.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILjava/lang/String;Z)V")
	@Override
	protected void method96(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		try {
			this.anInt245 = arg0;
			this.aString15 = arg1;
			this.method215();
			if (this.aClass47_1 == null) {
				super.method96(arg0, arg1);
			} else {
				this.aClass35_21.method524();
				this.aClass1_Sub1_Sub2_Sub4_3.method447(180, 16777215, "RuneScape is loading - please wait...", 54);
				Class1_Sub1_Sub2.method440(34, 62, 9179409, 304, 28);
				Class1_Sub1_Sub2.method440(32, 63, 0, 302, 29);
				Class1_Sub1_Sub2.method439(9179409, 30, arg0 * 3, 30, 64, this.aByte7);
				Class1_Sub1_Sub2.method439(0, 30, 300 - arg0 * 3, arg0 * 3 + 30, 64, this.aByte7);
				this.aClass1_Sub1_Sub2_Sub4_3.method447(180, 16777215, arg1, 85);
				this.aClass35_21.method525(171, 202, super.aGraphics2);
				if (this.aBoolean98) {
					this.aBoolean98 = false;
					if (!this.aBoolean62) {
						this.aClass35_22.method525(0, 0, super.aGraphics2);
						this.aClass35_23.method525(0, 637, super.aGraphics2);
					}
					this.aClass35_19.method525(0, 128, super.aGraphics2);
					this.aClass35_20.method525(371, 202, super.aGraphics2);
					this.aClass35_24.method525(265, 0, super.aGraphics2);
					this.aClass35_25.method525(265, 562, super.aGraphics2);
					this.aClass35_26.method525(171, 128, super.aGraphics2);
					this.aClass35_27.method525(171, 562, super.aGraphics2);
				}
			}
		} catch (@Pc(218) RuntimeException local218) {
			signlink.reporterror("35995, " + arg0 + ", " + arg1 + ", " + true + ", " + local218.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "k", descriptor = "(I)V")
	private void method103() {
		try {
			if (this.anInt289 == 0 && this.anInt260 == 0) {
				this.aStringArray6[this.anInt332] = "Walk here";
				this.anIntArray80[this.anInt332] = 718;
				this.anIntArray78[this.anInt332] = super.anInt194;
				this.anIntArray79[this.anInt332] = super.anInt195;
				this.anInt332++;
			}
			@Pc(41) int local41 = -1;
			for (@Pc(43) int local43 = 0; local43 < Class1_Sub1_Sub1_Sub5.anInt496; local43++) {
				@Pc(49) int local49 = Class1_Sub1_Sub1_Sub5.anIntArray150[local43];
				@Pc(53) int local53 = local49 & 0x7F;
				@Pc(59) int local59 = local49 >> 7 & 0x7F;
				@Pc(65) int local65 = local49 >> 29 & 0x3;
				@Pc(71) int local71 = local49 >> 14 & 0x7FFF;
				if (local49 != local41) {
					local41 = local49;
					@Pc(218) int local218;
					if (local65 == 2 && this.aClass37_1.method560(this.anInt334, local53, local59, local49) >= 0) {
						@Pc(91) Class9 local91 = Class9.method288(local71);
						if (local91.anIntArray160 != null) {
							local91 = local91.method296();
						}
						if (local91 == null) {
							continue;
						}
						if (this.anInt289 == 1) {
							this.aStringArray6[this.anInt332] = "Use " + this.aString9 + " with @cya@" + local91.aString23;
							this.anIntArray80[this.anInt332] = 810;
							this.anIntArray81[this.anInt332] = local49;
							this.anIntArray78[this.anInt332] = local53;
							this.anIntArray79[this.anInt332] = local59;
							this.anInt332++;
						} else if (this.anInt260 != 1) {
							if (local91.aStringArray8 != null) {
								for (local218 = 4; local218 >= 0; local218--) {
									if (local91.aStringArray8[local218] != null) {
										this.aStringArray6[this.anInt332] = local91.aStringArray8[local218] + " @cya@" + local91.aString23;
										if (local218 == 0) {
											this.anIntArray80[this.anInt332] = 625;
										}
										if (local218 == 1) {
											this.anIntArray80[this.anInt332] = 721;
										}
										if (local218 == 2) {
											this.anIntArray80[this.anInt332] = 743;
										}
										if (local218 == 3) {
											this.anIntArray80[this.anInt332] = 357;
										}
										if (local218 == 4) {
											this.anIntArray80[this.anInt332] = 1071;
										}
										this.anIntArray81[this.anInt332] = local49;
										this.anIntArray78[this.anInt332] = local53;
										this.anIntArray79[this.anInt332] = local59;
										this.anInt332++;
									}
								}
							}
							this.aStringArray6[this.anInt332] = "Examine @cya@" + local91.aString23;
							this.anIntArray80[this.anInt332] = 1381;
							this.anIntArray81[this.anInt332] = local91.anInt501 << 14;
							this.anIntArray78[this.anInt332] = local53;
							this.anIntArray79[this.anInt332] = local59;
							this.anInt332++;
						} else if ((this.anInt262 & 0x4) == 4) {
							this.aStringArray6[this.anInt332] = this.aString7 + " @cya@" + local91.aString23;
							this.anIntArray80[this.anInt332] = 899;
							this.anIntArray81[this.anInt332] = local49;
							this.anIntArray78[this.anInt332] = local53;
							this.anIntArray79[this.anInt332] = local59;
							this.anInt332++;
						}
					}
					@Pc(398) Class1_Sub1_Sub1_Sub1_Sub2 local398;
					@Pc(447) Class1_Sub1_Sub1_Sub1_Sub1 local447;
					@Pc(437) int local437;
					if (local65 == 1) {
						@Pc(369) Class1_Sub1_Sub1_Sub1_Sub2 local369 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local71];
						if (local369.aClass13_2.aByte20 == 1 && (local369.anInt982 & 0x7F) == 64 && (local369.anInt983 & 0x7F) == 64) {
							for (local218 = 0; local218 < this.anInt242; local218++) {
								local398 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[this.anIntArray42[local218]];
								if (local398 != null && local398 != local369 && local398.aClass13_2.aByte20 == 1 && local398.anInt982 == local369.anInt982 && local398.anInt983 == local369.anInt983) {
									this.method169(local398.aClass13_2, this.anIntArray42[local218], local59, this.aBoolean63, local53);
								}
							}
							for (local437 = 0; local437 < this.anInt273; local437++) {
								local447 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[this.anIntArray53[local437]];
								if (local447 != null && local447.anInt982 == local369.anInt982 && local447.anInt983 == local369.anInt983) {
									this.method230(local59, local53, this.anIntArray53[local437], local447);
								}
							}
						}
						this.method169(local369.aClass13_2, local71, local59, this.aBoolean63, local53);
					}
					if (local65 == 0) {
						@Pc(490) Class1_Sub1_Sub1_Sub1_Sub1 local490 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local71];
						if ((local490.anInt982 & 0x7F) == 64 && (local490.anInt983 & 0x7F) == 64) {
							for (local218 = 0; local218 < this.anInt242; local218++) {
								local398 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[this.anIntArray42[local218]];
								if (local398 != null && local398.aClass13_2.aByte20 == 1 && local398.anInt982 == local490.anInt982 && local398.anInt983 == local490.anInt983) {
									this.method169(local398.aClass13_2, this.anIntArray42[local218], local59, this.aBoolean63, local53);
								}
							}
							for (local437 = 0; local437 < this.anInt273; local437++) {
								local447 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[this.anIntArray53[local437]];
								if (local447 != null && local447 != local490 && local447.anInt982 == local490.anInt982 && local447.anInt983 == local490.anInt983) {
									this.method230(local59, local53, this.anIntArray53[local437], local447);
								}
							}
						}
						this.method230(local59, local53, local71, local490);
					}
					if (local65 == 3) {
						@Pc(610) Class29 local610 = this.aClass29ArrayArrayArray1[this.anInt334][local53][local59];
						if (local610 != null) {
							for (@Pc(617) Class1_Sub1_Sub1_Sub3 local617 = (Class1_Sub1_Sub1_Sub3) local610.method512(); local617 != null; local617 = (Class1_Sub1_Sub1_Sub3) local610.method514(320)) {
								@Pc(623) Class15 local623 = Class15.method361(local617.anInt179);
								if (this.anInt289 == 1) {
									this.aStringArray6[this.anInt332] = "Use " + this.aString9 + " with @lre@" + local623.aString25;
									this.anIntArray80[this.anInt332] = 111;
									this.anIntArray81[this.anInt332] = local617.anInt179;
									this.anIntArray78[this.anInt332] = local53;
									this.anIntArray79[this.anInt332] = local59;
									this.anInt332++;
								} else if (this.anInt260 != 1) {
									for (@Pc(740) int local740 = 4; local740 >= 0; local740--) {
										if (local623.aStringArray10 != null && local623.aStringArray10[local740] != null) {
											this.aStringArray6[this.anInt332] = local623.aStringArray10[local740] + " @lre@" + local623.aString25;
											if (local740 == 0) {
												this.anIntArray80[this.anInt332] = 139;
											}
											if (local740 == 1) {
												this.anIntArray80[this.anInt332] = 778;
											}
											if (local740 == 2) {
												this.anIntArray80[this.anInt332] = 617;
											}
											if (local740 == 3) {
												this.anIntArray80[this.anInt332] = 224;
											}
											if (local740 == 4) {
												this.anIntArray80[this.anInt332] = 662;
											}
											this.anIntArray81[this.anInt332] = local617.anInt179;
											this.anIntArray78[this.anInt332] = local53;
											this.anIntArray79[this.anInt332] = local59;
											this.anInt332++;
										} else if (local740 == 2) {
											this.aStringArray6[this.anInt332] = "Take @lre@" + local623.aString25;
											this.anIntArray80[this.anInt332] = 617;
											this.anIntArray81[this.anInt332] = local617.anInt179;
											this.anIntArray78[this.anInt332] = local53;
											this.anIntArray79[this.anInt332] = local59;
											this.anInt332++;
										}
									}
									this.aStringArray6[this.anInt332] = "Examine @lre@" + local623.aString25;
									this.anIntArray80[this.anInt332] = 1152;
									this.anIntArray81[this.anInt332] = local617.anInt179;
									this.anIntArray78[this.anInt332] = local53;
									this.anIntArray79[this.anInt332] = local59;
									this.anInt332++;
								} else if ((this.anInt262 & 0x1) == 1) {
									this.aStringArray6[this.anInt332] = this.aString7 + " @lre@" + local623.aString25;
									this.anIntArray80[this.anInt332] = 370;
									this.anIntArray81[this.anInt332] = local617.anInt179;
									this.anIntArray78[this.anInt332] = local53;
									this.anIntArray79[this.anInt332] = local59;
									this.anInt332++;
								}
							}
						}
					}
				}
			}
		} catch (@Pc(953) RuntimeException local953) {
			signlink.reporterror("65663, " + -38604 + ", " + local953.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "run", descriptor = "()V")
	@Override
	public void run() {
		if (this.aBoolean53) {
			this.method148();
		} else {
			super.run();
		}
	}

	@OriginalMember(owner = "client!client", name = "m", descriptor = "(I)V")
	private void method105() {
		try {
			if (this.anInt395 == 2) {
				for (@Pc(16) Class1_Sub2 local16 = (Class1_Sub2) this.aClass29_3.method511(); local16 != null; local16 = (Class1_Sub2) this.aClass29_3.method513()) {
					if (local16.anInt782 > 0) {
						local16.anInt782--;
					}
					if (local16.anInt782 != 0) {
						if (local16.anInt781 > 0) {
							local16.anInt781--;
						}
						if (local16.anInt781 == 0 && local16.anInt773 >= 1 && local16.anInt774 >= 1 && local16.anInt773 <= 102 && local16.anInt774 <= 102 && (local16.anInt778 < 0 || Class4.method72(local16.anInt780, local16.anInt778))) {
							this.method129(local16.anInt772, local16.anInt780, local16.anInt774, local16.anInt779, local16.anInt778, local16.anInt771, local16.anInt773);
							local16.anInt781 = -1;
							if (local16.anInt778 == local16.anInt775 && local16.anInt775 == -1) {
								local16.method673();
							} else if (local16.anInt778 == local16.anInt775 && local16.anInt779 == local16.anInt776 && local16.anInt780 == local16.anInt777) {
								local16.method673();
							}
						}
					} else if (local16.anInt775 < 0 || Class4.method72(local16.anInt777, local16.anInt775)) {
						this.method129(local16.anInt772, local16.anInt777, local16.anInt774, local16.anInt776, local16.anInt775, local16.anInt771, local16.anInt773);
						local16.method673();
					}
				}
			}
		} catch (@Pc(159) RuntimeException local159) {
			signlink.reporterror("33476, " + -867 + ", " + local159.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Z)V")
	private void method106() {
		try {
			@Pc(4) Graphics local4 = this.method94().getGraphics();
			local4.setColor(Color.black);
			local4.fillRect(0, 0, 765, 503);
			this.method87();
			@Pc(39) byte local39;
			@Pc(45) int local45;
			if (this.aBoolean72) {
				this.aBoolean62 = false;
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
			if (this.aBoolean59) {
				this.aBoolean62 = false;
				local4.setFont(new Font("Helvetica", 1, 20));
				local4.setColor(Color.white);
				local4.drawString("Error - unable to load game!", 50, 50);
				local4.drawString("To play RuneScape make sure you play from", 50, 100);
				local4.drawString("http://www.runescape.com", 50, 150);
			}
			if (this.aBoolean94) {
				this.aBoolean62 = false;
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
		} catch (@Pc(177) RuntimeException local177) {
			signlink.reporterror("12184, " + true + ", " + local177.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "n", descriptor = "(I)V")
	private void method107() {
		try {
			for (@Pc(6) Class1_Sub1_Sub1_Sub4 local6 = (Class1_Sub1_Sub1_Sub4) this.aClass29_2.method511(); local6 != null; local6 = (Class1_Sub1_Sub1_Sub4) this.aClass29_2.method513()) {
				if (local6.anInt451 != this.anInt334 || anInt236 > local6.anInt457) {
					local6.method673();
				} else if (anInt236 >= local6.anInt456) {
					if (local6.anInt460 > 0) {
						@Pc(46) Class1_Sub1_Sub1_Sub1_Sub2 local46 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local6.anInt460 - 1];
						if (local46 != null && local46.anInt982 >= 0 && local46.anInt982 < 13312 && local46.anInt983 >= 0 && local46.anInt983 < 13312) {
							local6.method241(anInt236, this.method178(local46.anInt982, local46.anInt983, local6.anInt451) - local6.anInt455, local46.anInt983, local46.anInt982);
						}
					}
					if (local6.anInt460 < 0) {
						@Pc(91) int local91 = -local6.anInt460 - 1;
						@Pc(97) Class1_Sub1_Sub1_Sub1_Sub1 local97;
						if (local91 == this.anInt247) {
							local97 = aClass1_Sub1_Sub1_Sub1_Sub1_1;
						} else {
							local97 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local91];
						}
						if (local97 != null && local97.anInt982 >= 0 && local97.anInt982 < 13312 && local97.anInt983 >= 0 && local97.anInt983 < 13312) {
							local6.method241(anInt236, this.method178(local97.anInt982, local97.anInt983, local6.anInt451) - local6.anInt455, local97.anInt983, local97.anInt982);
						}
					}
					local6.method242(this.anInt323);
					this.aClass37_1.method541(false, this.anInt334, (int) local6.aDouble2, 60, -1, local6, (int) local6.aDouble3, local6.anInt461, (int) local6.aDouble1);
				}
			}
			anInt259++;
			if (anInt259 > 1174) {
				anInt259 = 0;
				this.aClass1_Sub1_Sub3_2.method469(63, 837);
				this.aClass1_Sub1_Sub3_2.method470(0);
				@Pc(197) int local197 = this.aClass1_Sub1_Sub3_2.anInt733;
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
				this.aClass1_Sub1_Sub3_2.method479(this.aClass1_Sub1_Sub3_2.anInt733 - local197);
			}
		} catch (@Pc(271) RuntimeException local271) {
			signlink.reporterror("20014, " + 8 + ", " + local271.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;II)V")
	private void method108(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2) {
		try {
			if (arg2 == 0 && this.anInt333 != -1) {
				this.aString4 = arg1;
				super.anInt199 = 0;
			}
			if (this.anInt209 == -1) {
				this.aBoolean99 = true;
			}
			for (@Pc(20) int local20 = 99; local20 > 0; local20--) {
				this.anIntArray40[local20] = this.anIntArray40[local20 - 1];
				this.aStringArray2[local20] = this.aStringArray2[local20 - 1];
				this.aStringArray3[local20] = this.aStringArray3[local20 - 1];
			}
			this.anIntArray40[0] = arg2;
			this.aStringArray2[0] = arg0;
			this.aStringArray3[0] = arg1;
		} catch (@Pc(79) RuntimeException local79) {
			signlink.reporterror("99148, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 811 + ", " + local79.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Z)V")
	@Override
	protected void method92() {
		try {
			if (this.aBoolean94 || this.aBoolean72 || this.aBoolean59) {
				this.method106();
			} else {
				anInt276++;
				this.aBoolean48 &= true;
				if (this.aBoolean48) {
					this.method118();
				} else {
					this.method125(false);
				}
				this.anInt394 = 0;
			}
		} catch (@Pc(39) RuntimeException local39) {
			signlink.reporterror("34396, " + true + ", " + local39.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!d;I)V")
	private void method109(@OriginalArg(0) Class6 arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(4) int local4 = arg0.anInt422;
			@Pc(8) boolean local8 = false;
			@Pc(64) int local64;
			if ((local4 < 1 || local4 > 100) && (local4 < 701 || local4 > 800)) {
				if (local4 >= 101 && local4 <= 200 || local4 >= 801 && local4 <= 900) {
					local64 = this.anInt232;
					if (this.anInt233 != 2) {
						local64 = 0;
					}
					if (local4 > 800) {
						local4 -= 701;
					} else {
						local4 -= 101;
					}
					if (local4 >= local64) {
						arg0.aString18 = "";
						arg0.anInt421 = 0;
					} else {
						if (this.anIntArray85[local4] == 0) {
							arg0.aString18 = "@red@Offline";
						} else if (this.anIntArray85[local4] == anInt282) {
							arg0.aString18 = "@gre@World-" + (this.anIntArray85[local4] - 9);
						} else {
							arg0.aString18 = "@yel@World-" + (this.anIntArray85[local4] - 9);
						}
						arg0.anInt421 = 1;
					}
				} else if (local4 == 203) {
					local64 = this.anInt232;
					if (this.anInt233 != 2) {
						local64 = 0;
					}
					arg0.anInt428 = local64 * 15 + 20;
					if (arg0.anInt428 <= arg0.anInt424) {
						arg0.anInt428 = arg0.anInt424 + 1;
					}
				} else if (local4 >= 401 && local4 <= 500) {
					local4 -= 401;
					if (local4 == 0 && this.anInt233 == 0) {
						arg0.aString18 = "Loading ignore list";
						arg0.anInt421 = 0;
					} else if (local4 == 1 && this.anInt233 == 0) {
						arg0.aString18 = "Please wait...";
						arg0.anInt421 = 0;
					} else {
						local64 = this.anInt361;
						if (this.anInt233 == 0) {
							local64 = 0;
						}
						if (local4 >= local64) {
							arg0.aString18 = "";
							arg0.anInt421 = 0;
						} else {
							arg0.aString18 = Class48.method671(Class48.method668(this.aLongArray4[local4]));
							arg0.anInt421 = 1;
						}
					}
				} else if (local4 == 503) {
					arg0.anInt428 = this.anInt361 * 15 + 20;
					if (arg0.anInt428 <= arg0.anInt424) {
						arg0.anInt428 = arg0.anInt424 + 1;
					}
				} else if (local4 == 327) {
					arg0.anInt444 = 150;
					arg0.anInt445 = (int) (Math.sin((double) anInt236 / 40.0D) * 256.0D) & 0x7FF;
					if (this.aBoolean78) {
						for (local64 = 0; local64 < 7; local64++) {
							@Pc(333) int local333 = this.anIntArray65[local64];
							if (local333 >= 0 && !Class23.aClass23Array1[local333].method498()) {
								return;
							}
						}
						this.aBoolean78 = false;
						@Pc(352) Class1_Sub1_Sub1_Sub5[] local352 = new Class1_Sub1_Sub1_Sub5[7];
						@Pc(354) int local354 = 0;
						for (@Pc(356) int local356 = 0; local356 < 7; local356++) {
							@Pc(363) int local363 = this.anIntArray65[local356];
							if (local363 >= 0) {
								local352[local354++] = Class23.aClass23Array1[local363].method499((byte) 3);
							}
						}
						@Pc(386) Class1_Sub1_Sub1_Sub5 local386 = new Class1_Sub1_Sub1_Sub5(local352, this.anInt246, local354);
						for (@Pc(388) int local388 = 0; local388 < 5; local388++) {
							if (this.anIntArray71[local388] != 0) {
								local386.method275(anIntArrayArray4[local388][0], anIntArrayArray4[local388][this.anIntArray71[local388]]);
								if (local388 == 1) {
									local386.method275(anIntArray63[0], anIntArray63[this.anIntArray71[local388]]);
								}
							}
						}
						local386.method268();
						local386.method269(Class27.aClass27Array1[aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt986].anIntArray225[0]);
						local386.method278(64, 850, -30, -50, -30, true);
						arg0.anInt437 = 5;
						arg0.anInt438 = 0;
						Class6.method235(local386);
					}
				} else if (local4 == 324) {
					if (this.aClass1_Sub1_Sub2_Sub2_12 == null) {
						this.aClass1_Sub1_Sub2_Sub2_12 = arg0.aClass1_Sub1_Sub2_Sub2_14;
						this.aClass1_Sub1_Sub2_Sub2_13 = arg0.aClass1_Sub1_Sub2_Sub2_15;
					}
					if (this.aBoolean85) {
						arg0.aClass1_Sub1_Sub2_Sub2_14 = this.aClass1_Sub1_Sub2_Sub2_13;
					} else {
						arg0.aClass1_Sub1_Sub2_Sub2_14 = this.aClass1_Sub1_Sub2_Sub2_12;
					}
				} else if (local4 == 325) {
					if (this.aClass1_Sub1_Sub2_Sub2_12 == null) {
						this.aClass1_Sub1_Sub2_Sub2_12 = arg0.aClass1_Sub1_Sub2_Sub2_14;
						this.aClass1_Sub1_Sub2_Sub2_13 = arg0.aClass1_Sub1_Sub2_Sub2_15;
					}
					if (this.aBoolean85) {
						arg0.aClass1_Sub1_Sub2_Sub2_14 = this.aClass1_Sub1_Sub2_Sub2_12;
					} else {
						arg0.aClass1_Sub1_Sub2_Sub2_14 = this.aClass1_Sub1_Sub2_Sub2_13;
					}
				} else if (local4 == 600) {
					arg0.aString18 = this.aString17;
					if (anInt236 % 20 < 10) {
						arg0.aString18 = arg0.aString18 + "|";
					} else {
						arg0.aString18 = arg0.aString18 + " ";
					}
				} else {
					if (local4 == 613) {
						if (this.anInt285 < 1) {
							arg0.aString18 = "";
						} else if (this.aBoolean49) {
							arg0.anInt433 = 16711680;
							arg0.aString18 = "Moderator option: Mute player for 48 hours: <ON>";
						} else {
							arg0.anInt433 = 16777215;
							arg0.aString18 = "Moderator option: Mute player for 48 hours: <OFF>";
						}
					}
					@Pc(594) String local594;
					if (local4 == 650 || local4 == 655) {
						if (this.anInt344 == 0) {
							arg0.aString18 = "";
						} else {
							if (this.anInt319 == 0) {
								local594 = "earlier today";
							} else if (this.anInt319 == 1) {
								local594 = "yesterday";
							} else {
								local594 = this.anInt319 + " days ago";
							}
							arg0.aString18 = "You last logged in " + local594 + " from: " + signlink.dns;
						}
					}
					if (local4 == 651) {
						if (this.anInt365 == 0) {
							arg0.aString18 = "0 unread messages";
							arg0.anInt433 = 16776960;
						}
						if (this.anInt365 == 1) {
							arg0.aString18 = "1 unread message";
							arg0.anInt433 = 65280;
						}
						if (this.anInt365 > 1) {
							arg0.aString18 = this.anInt365 + " unread messages";
							arg0.anInt433 = 65280;
						}
					}
					if (local4 == 652) {
						if (this.anInt409 == 201) {
							if (this.anInt258 == 1) {
								arg0.aString18 = "@yel@This is a non-members world: @whi@Since you are a member we";
							} else {
								arg0.aString18 = "";
							}
						} else if (this.anInt409 == 200) {
							arg0.aString18 = "You have not yet set any password recovery questions.";
						} else {
							if (this.anInt409 == 0) {
								local594 = "Earlier today";
							} else if (this.anInt409 == 1) {
								local594 = "Yesterday";
							} else {
								local594 = this.anInt409 + " days ago";
							}
							arg0.aString18 = local594 + " you changed your recovery questions";
						}
					}
					if (local4 == 653) {
						if (this.anInt409 == 201) {
							if (this.anInt258 == 1) {
								arg0.aString18 = "@whi@recommend you use a members world instead. You may use";
							} else {
								arg0.aString18 = "";
							}
						} else if (this.anInt409 == 200) {
							arg0.aString18 = "We strongly recommend you do so now to secure your account.";
						} else {
							arg0.aString18 = "If you do not remember making this change then cancel it immediately";
						}
					}
					if (local4 == 654) {
						if (this.anInt409 == 201) {
							if (this.anInt258 == 1) {
								arg0.aString18 = "@whi@this world but member benefits are unavailable whilst here.";
							} else {
								arg0.aString18 = "";
							}
						} else if (this.anInt409 == 200) {
							arg0.aString18 = "Do this from the 'account management' area on our front webpage";
						} else {
							arg0.aString18 = "Do this from the 'account management' area on our front webpage";
						}
					}
				}
			} else if (local4 == 1 && this.anInt233 == 0) {
				arg0.aString18 = "Loading friend list";
				arg0.anInt421 = 0;
			} else if (local4 == 1 && this.anInt233 == 1) {
				arg0.aString18 = "Connecting to friendserver";
				arg0.anInt421 = 0;
			} else if (local4 == 2 && this.anInt233 != 2) {
				arg0.aString18 = "Please wait...";
				arg0.anInt421 = 0;
			} else {
				local64 = this.anInt232;
				if (this.anInt233 != 2) {
					local64 = 0;
				}
				if (local4 > 700) {
					local4 -= 601;
				} else {
					local4--;
				}
				if (local4 >= local64) {
					arg0.aString18 = "";
					arg0.anInt421 = 0;
				} else {
					arg0.aString18 = this.aStringArray5[local4];
					arg0.anInt421 = 1;
				}
			}
		} catch (@Pc(802) RuntimeException local802) {
			signlink.reporterror("36795, " + arg0 + ", " + arg1 + ", " + local802.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "o", descriptor = "(I)V")
	private void method110() {
		try {
			this.aBoolean62 = false;
			while (this.aBoolean68) {
				this.aBoolean62 = false;
				try {
					Thread.sleep(50L);
				} catch (@Pc(13) Exception local13) {
				}
			}
			this.aClass1_Sub1_Sub2_Sub3_12 = null;
			this.aClass1_Sub1_Sub2_Sub3_13 = null;
			this.aClass1_Sub1_Sub2_Sub3Array4 = null;
			this.anIntArray89 = null;
			this.anIntArray90 = null;
			this.anIntArray91 = null;
			this.anIntArray92 = null;
			this.anIntArray67 = null;
			this.anIntArray68 = null;
			this.anIntArray59 = null;
			this.anIntArray60 = null;
			this.aClass1_Sub1_Sub2_Sub2_8 = null;
			this.aClass1_Sub1_Sub2_Sub2_9 = null;
		} catch (@Pc(67) RuntimeException local67) {
			signlink.reporterror("9598, " + -630 + ", " + local67.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(Z)V")
	private void method111() {
		try {
			for (@Pc(4) int local4 = 0; local4 < this.anInt242; local4++) {
				@Pc(11) int local11 = this.anIntArray42[local4];
				@Pc(16) Class1_Sub1_Sub1_Sub1_Sub2 local16 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local11];
				if (local16 != null) {
					this.method112(local16.aClass13_2.aByte20, local16);
				}
			}
		} catch (@Pc(32) RuntimeException local32) {
			signlink.reporterror("6350, " + true + ", " + local32.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IILclient!y;)V")
	private void method112(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub1_Sub1_Sub1 arg1) {
		try {
			if (arg1.anInt982 < 128 || arg1.anInt983 < 128 || arg1.anInt982 >= 13184 || arg1.anInt983 >= 13184) {
				arg1.anInt1005 = -1;
				arg1.anInt1010 = -1;
				arg1.anInt1019 = 0;
				arg1.anInt1020 = 0;
				arg1.anInt982 = arg1.anIntArray272[0] * 128 + arg1.anInt985 * 64;
				arg1.anInt983 = arg1.anIntArray273[0] * 128 + arg1.anInt985 * 64;
				arg1.method679();
			}
			if (arg1 == aClass1_Sub1_Sub1_Sub1_Sub1_1 && (arg1.anInt982 < 1536 || arg1.anInt983 < 1536 || arg1.anInt982 >= 11776 || arg1.anInt983 >= 11776)) {
				arg1.anInt1005 = -1;
				arg1.anInt1010 = -1;
				arg1.anInt1019 = 0;
				arg1.anInt1020 = 0;
				arg1.anInt982 = arg1.anIntArray272[0] * 128 + arg1.anInt985 * 64;
				arg1.anInt983 = arg1.anIntArray273[0] * 128 + arg1.anInt985 * 64;
				arg1.method679();
			}
			if (arg1.anInt1019 > anInt236) {
				this.method113(arg1);
			} else if (arg1.anInt1020 >= anInt236) {
				this.method114(arg1);
			} else {
				this.method115(arg1, 113);
			}
			this.method116(arg1);
			this.method117(arg1);
		} catch (@Pc(158) RuntimeException local158) {
			signlink.reporterror("81137, " + -43008 + ", " + arg0 + ", " + arg1 + ", " + local158.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILclient!y;)V")
	private void method113(@OriginalArg(1) Class1_Sub1_Sub1_Sub1 arg0) {
		try {
			@Pc(4) int local4 = arg0.anInt1019 - anInt236;
			@Pc(14) int local14 = arg0.anInt1015 * 128 + arg0.anInt985 * 64;
			@Pc(24) int local24 = arg0.anInt1017 * 128 + arg0.anInt985 * 64;
			arg0.anInt982 += (local14 - arg0.anInt982) / local4;
			arg0.anInt983 += (local24 - arg0.anInt983) / local4;
			this.anInt248 += 0;
			arg0.anInt1027 = 0;
			if (arg0.anInt1021 == 0) {
				arg0.anInt1024 = 1024;
			}
			if (arg0.anInt1021 == 1) {
				arg0.anInt1024 = 1536;
			}
			if (arg0.anInt1021 == 2) {
				arg0.anInt1024 = 0;
			}
			if (arg0.anInt1021 == 3) {
				arg0.anInt1024 = 512;
			}
		} catch (@Pc(84) RuntimeException local84) {
			signlink.reporterror("11588, " + 0 + ", " + arg0 + ", " + local84.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(ILclient!y;)V")
	private void method114(@OriginalArg(1) Class1_Sub1_Sub1_Sub1 arg0) {
		try {
			if (arg0.anInt1020 == anInt236 || arg0.anInt1005 == -1 || arg0.anInt1008 != 0 || arg0.anInt1007 + 1 > Class27.aClass27Array1[arg0.anInt1005].method506(arg0.anInt1006)) {
				@Pc(38) int local38 = arg0.anInt1020 - arg0.anInt1019;
				@Pc(43) int local43 = anInt236 - arg0.anInt1019;
				@Pc(53) int local53 = arg0.anInt1015 * 128 + arg0.anInt985 * 64;
				@Pc(63) int local63 = arg0.anInt1017 * 128 + arg0.anInt985 * 64;
				@Pc(73) int local73 = arg0.anInt1016 * 128 + arg0.anInt985 * 64;
				@Pc(83) int local83 = arg0.anInt1018 * 128 + arg0.anInt985 * 64;
				arg0.anInt982 = (local53 * (local38 - local43) + local73 * local43) / local38;
				arg0.anInt983 = (local63 * (local38 - local43) + local83 * local43) / local38;
			}
			arg0.anInt1027 = 0;
			if (arg0.anInt1021 == 0) {
				arg0.anInt1024 = 1024;
			}
			if (arg0.anInt1021 == 1) {
				arg0.anInt1024 = 1536;
			}
			if (arg0.anInt1021 == 2) {
				arg0.anInt1024 = 0;
			}
			if (arg0.anInt1021 == 3) {
				arg0.anInt1024 = 512;
			}
			arg0.anInt984 = arg0.anInt1024;
		} catch (@Pc(145) RuntimeException local145) {
			signlink.reporterror("16413, " + 7 + ", " + arg0 + ", " + local145.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!y;I)V")
	private void method115(@OriginalArg(0) Class1_Sub1_Sub1_Sub1 arg0, @OriginalArg(1) int arg1) {
		try {
			arg0.anInt1002 = arg0.anInt986;
			if (arg0.anInt1026 == 0) {
				arg0.anInt1027 = 0;
			} else {
				if (arg0.anInt1005 != -1 && arg0.anInt1008 == 0) {
					@Pc(24) Class27 local24 = Class27.aClass27Array1[arg0.anInt1005];
					if (arg0.anInt1028 > 0 && local24.anInt791 == 0) {
						arg0.anInt1027++;
						return;
					}
					if (arg0.anInt1028 <= 0 && local24.anInt792 == 0) {
						arg0.anInt1027++;
						return;
					}
				}
				@Pc(53) int local53 = arg0.anInt982;
				@Pc(56) int local56 = arg0.anInt983;
				@Pc(71) int local71 = arg0.anIntArray272[arg0.anInt1026 - 1] * 128 + arg0.anInt985 * 64;
				@Pc(86) int local86 = arg0.anIntArray273[arg0.anInt1026 - 1] * 128 + arg0.anInt985 * 64;
				if (local71 - local53 <= 256 && local71 - local53 >= -256 && local86 - local56 <= 256 && local86 - local56 >= -256) {
					if (local53 < local71) {
						if (local56 < local86) {
							arg0.anInt1024 = 1280;
						} else if (local56 > local86) {
							arg0.anInt1024 = 1792;
						} else {
							arg0.anInt1024 = 1536;
						}
					} else if (local53 > local71) {
						if (local56 < local86) {
							arg0.anInt1024 = 768;
						} else if (local56 > local86) {
							arg0.anInt1024 = 256;
						} else {
							arg0.anInt1024 = 512;
						}
					} else if (local56 < local86) {
						arg0.anInt1024 = 1024;
					} else {
						arg0.anInt1024 = 0;
					}
					@Pc(180) int local180 = arg0.anInt1024 - arg0.anInt984 & 0x7FF;
					if (local180 > 1024) {
						local180 -= 2048;
					}
					@Pc(187) int local187 = arg0.anInt989;
					if (local180 >= -256 && local180 <= 256) {
						local187 = arg0.anInt988;
					} else if (local180 >= 256 && local180 < 768) {
						local187 = arg0.anInt991;
					} else if (local180 >= -768 && local180 <= -256) {
						local187 = arg0.anInt990;
					}
					if (local187 == -1) {
						local187 = arg0.anInt988;
					}
					arg0.anInt1002 = local187;
					@Pc(231) boolean local231 = false;
					@Pc(233) int local233 = 4;
					if (arg0.anInt984 != arg0.anInt1024 && arg0.anInt999 == -1 && arg0.anInt1025 != 0) {
						local233 = 2;
					}
					if (arg0.anInt1026 > 2) {
						local233 = 6;
					}
					if (arg0.anInt1026 > 3) {
						local233 = 8;
					}
					if (arg0.anInt1027 > 0 && arg0.anInt1026 > 1) {
						local233 = 8;
						arg0.anInt1027--;
					}
					if (arg0.aBooleanArray12[arg0.anInt1026 - 1]) {
						local233 <<= 0x1;
					}
					if (local233 >= 8 && arg0.anInt1002 == arg0.anInt988 && arg0.anInt992 != -1) {
						arg0.anInt1002 = arg0.anInt992;
					}
					if (local53 < local71) {
						arg0.anInt982 += local233;
						if (arg0.anInt982 > local71) {
							arg0.anInt982 = local71;
						}
					} else if (local53 > local71) {
						arg0.anInt982 -= local233;
						if (arg0.anInt982 < local71) {
							arg0.anInt982 = local71;
						}
					}
					if (local56 < local86) {
						arg0.anInt983 += local233;
						if (arg0.anInt983 > local86) {
							arg0.anInt983 = local86;
						}
					} else if (local56 > local86) {
						arg0.anInt983 -= local233;
						if (arg0.anInt983 < local86) {
							arg0.anInt983 = local86;
						}
					}
					if (arg0.anInt982 == local71 && arg0.anInt983 == local86) {
						arg0.anInt1026--;
						if (arg0.anInt1028 > 0) {
							arg0.anInt1028--;
							return;
						}
					}
				} else {
					arg0.anInt982 = local71;
					arg0.anInt983 = local86;
				}
			}
		} catch (@Pc(395) RuntimeException local395) {
			signlink.reporterror("51625, " + arg0 + ", " + arg1 + ", " + local395.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Lclient!y;I)V")
	private void method116(@OriginalArg(0) Class1_Sub1_Sub1_Sub1 arg0) {
		try {
			if (arg0.anInt1025 != 0) {
				@Pc(34) int local34;
				@Pc(40) int local40;
				if (arg0.anInt999 != -1 && arg0.anInt999 < 32768) {
					@Pc(26) Class1_Sub1_Sub1_Sub1_Sub2 local26 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[arg0.anInt999];
					if (local26 != null) {
						local34 = arg0.anInt982 - local26.anInt982;
						local40 = arg0.anInt983 - local26.anInt983;
						if (local34 != 0 || local40 != 0) {
							arg0.anInt1024 = (int) (Math.atan2((double) local34, (double) local40) * 325.949D) & 0x7FF;
						}
					}
				}
				@Pc(65) int local65;
				if (arg0.anInt999 >= 32768) {
					local65 = arg0.anInt999 - 32768;
					if (local65 == this.anInt247) {
						local65 = this.anInt272;
					}
					@Pc(77) Class1_Sub1_Sub1_Sub1_Sub1 local77 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local65];
					if (local77 != null) {
						local40 = arg0.anInt982 - local77.anInt982;
						@Pc(91) int local91 = arg0.anInt983 - local77.anInt983;
						if (local40 != 0 || local91 != 0) {
							arg0.anInt1024 = (int) (Math.atan2((double) local40, (double) local91) * 325.949D) & 0x7FF;
						}
					}
				}
				if ((arg0.anInt1000 != 0 || arg0.anInt1001 != 0) && (arg0.anInt1026 == 0 || arg0.anInt1027 > 0)) {
					local65 = arg0.anInt982 - (arg0.anInt1000 - this.anInt213 - this.anInt213) * 64;
					local34 = arg0.anInt983 - (arg0.anInt1001 - this.anInt214 - this.anInt214) * 64;
					if (local65 != 0 || local34 != 0) {
						arg0.anInt1024 = (int) (Math.atan2((double) local65, (double) local34) * 325.949D) & 0x7FF;
					}
					arg0.anInt1000 = 0;
					arg0.anInt1001 = 0;
				}
				local65 = arg0.anInt1024 - arg0.anInt984 & 0x7FF;
				if (local65 != 0) {
					if (local65 < arg0.anInt1025 || local65 > 2048 - arg0.anInt1025) {
						arg0.anInt984 = arg0.anInt1024;
					} else if (local65 > 1024) {
						arg0.anInt984 -= arg0.anInt1025;
					} else {
						arg0.anInt984 += arg0.anInt1025;
					}
					arg0.anInt984 &= 0x7FF;
					if (arg0.anInt1002 == arg0.anInt986 && arg0.anInt984 != arg0.anInt1024) {
						if (arg0.anInt987 != -1) {
							arg0.anInt1002 = arg0.anInt987;
							return;
						}
						arg0.anInt1002 = arg0.anInt988;
						return;
					}
				}
			}
		} catch (@Pc(245) RuntimeException local245) {
			signlink.reporterror("74365, " + arg0 + ", " + 11971 + ", " + local245.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(BLclient!y;)V")
	private void method117(@OriginalArg(1) Class1_Sub1_Sub1_Sub1 arg0) {
		try {
			arg0.aBoolean264 = false;
			@Pc(19) Class27 local19;
			if (arg0.anInt1002 != -1) {
				local19 = Class27.aClass27Array1[arg0.anInt1002];
				arg0.anInt1004++;
				if (arg0.anInt1003 < local19.anInt785 && arg0.anInt1004 > local19.method506(arg0.anInt1003)) {
					arg0.anInt1004 = 0;
					arg0.anInt1003++;
				}
				if (arg0.anInt1003 >= local19.anInt785) {
					arg0.anInt1004 = 0;
					arg0.anInt1003 = 0;
				}
			}
			if (arg0.anInt1010 != -1 && anInt236 >= arg0.anInt1013) {
				if (arg0.anInt1011 < 0) {
					arg0.anInt1011 = 0;
				}
				local19 = Class33.aClass33Array1[arg0.anInt1010].aClass27_2;
				arg0.anInt1012++;
				while (arg0.anInt1011 < local19.anInt785 && arg0.anInt1012 > local19.method506(arg0.anInt1011)) {
					arg0.anInt1012 -= local19.method506(arg0.anInt1011);
					arg0.anInt1011++;
				}
				if (arg0.anInt1011 >= local19.anInt785 && (arg0.anInt1011 < 0 || arg0.anInt1011 >= local19.anInt785)) {
					arg0.anInt1010 = -1;
				}
			}
			if (arg0.anInt1005 != -1 && arg0.anInt1008 <= 1) {
				local19 = Class27.aClass27Array1[arg0.anInt1005];
				if (local19.anInt791 == 1 && arg0.anInt1028 > 0 && arg0.anInt1019 <= anInt236 && arg0.anInt1020 < anInt236) {
					arg0.anInt1008 = 1;
					return;
				}
			}
			if (arg0.anInt1005 != -1 && arg0.anInt1008 == 0) {
				local19 = Class27.aClass27Array1[arg0.anInt1005];
				arg0.anInt1007++;
				while (arg0.anInt1006 < local19.anInt785 && arg0.anInt1007 > local19.method506(arg0.anInt1006)) {
					arg0.anInt1007 -= local19.method506(arg0.anInt1006);
					arg0.anInt1006++;
				}
				if (arg0.anInt1006 >= local19.anInt785) {
					arg0.anInt1006 -= local19.anInt786;
					arg0.anInt1009++;
					if (arg0.anInt1009 >= local19.anInt790) {
						arg0.anInt1005 = -1;
					}
					if (arg0.anInt1006 < 0 || arg0.anInt1006 >= local19.anInt785) {
						arg0.anInt1005 = -1;
					}
				}
				arg0.aBoolean264 = local19.aBoolean217;
			}
			if (arg0.anInt1008 > 0) {
				arg0.anInt1008--;
			}
		} catch (@Pc(264) RuntimeException local264) {
			signlink.reporterror("91708, " + 104 + ", " + arg0 + ", " + local264.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(B)V")
	private void method118() {
		try {
			if (this.aBoolean98) {
				this.aBoolean98 = false;
				this.aClass35_10.method525(4, 0, super.aGraphics2);
				this.aClass35_11.method525(357, 0, super.aGraphics2);
				this.aClass35_12.method525(4, 722, super.aGraphics2);
				this.aClass35_13.method525(205, 743, super.aGraphics2);
				this.aClass35_14.method525(0, 0, super.aGraphics2);
				this.aClass35_15.method525(4, 516, super.aGraphics2);
				this.aClass35_16.method525(205, 516, super.aGraphics2);
				this.aClass35_17.method525(357, 496, super.aGraphics2);
				this.aClass35_18.method525(338, 0, super.aGraphics2);
				this.aBoolean92 = true;
				this.aBoolean99 = true;
				this.aBoolean60 = true;
				this.aBoolean83 = true;
				if (this.anInt395 != 2) {
					this.aClass35_8.method525(4, 4, super.aGraphics2);
					this.aClass35_7.method525(4, 550, super.aGraphics2);
				}
			}
			if (this.anInt395 == 2) {
				this.method204();
			}
			if (this.aBoolean88 && this.anInt313 == 1) {
				this.aBoolean92 = true;
			}
			@Pc(138) boolean local138;
			if (this.anInt327 != -1) {
				local138 = this.method225(this.anInt323, this.anInt327);
				if (local138) {
					this.aBoolean92 = true;
				}
			}
			if (this.anInt376 == 2) {
				this.aBoolean92 = true;
			}
			if (this.anInt390 == 2) {
				this.aBoolean92 = true;
			}
			if (this.aBoolean92) {
				this.method202();
				this.aBoolean92 = false;
			}
			if (this.anInt209 == -1) {
				this.aClass6_1.anInt429 = this.anInt384 - this.anInt304 - 77;
				if (super.anInt194 > 448 && super.anInt194 < 560 && super.anInt195 > 332) {
					this.method141(this.anInt384, 0, super.anInt195 - 357, super.anInt194 - 17, 77, this.anInt307, this.aClass6_1, false, 463);
				}
				@Pc(221) int local221 = this.anInt384 - this.aClass6_1.anInt429 - 77;
				if (local221 < 0) {
					local221 = 0;
				}
				if (local221 > this.anInt384 - 77) {
					local221 = this.anInt384 - 77;
				}
				if (this.anInt304 != local221) {
					this.anInt304 = local221;
					this.aBoolean99 = true;
				}
			}
			if (this.anInt209 != -1) {
				local138 = this.method225(this.anInt323, this.anInt209);
				if (local138) {
					this.aBoolean99 = true;
				}
			}
			if (this.anInt376 == 3) {
				this.aBoolean99 = true;
			}
			if (this.anInt390 == 3) {
				this.aBoolean99 = true;
			}
			if (this.aString4 != null) {
				this.aBoolean99 = true;
			}
			if (this.aBoolean88 && this.anInt313 == 2) {
				this.aBoolean99 = true;
			}
			if (this.aBoolean99) {
				this.method218();
				this.aBoolean99 = false;
			}
			if (this.anInt395 == 2) {
				this.method168();
				this.aClass35_7.method525(4, 550, super.aGraphics2);
			}
			if (this.anInt397 != -1) {
				this.aBoolean60 = true;
			}
			if (this.aBoolean60) {
				if (this.anInt397 != -1 && this.anInt397 == this.anInt241) {
					this.anInt397 = -1;
					this.aClass1_Sub1_Sub3_2.method469(53, 837);
					this.aClass1_Sub1_Sub3_2.method470(this.anInt241);
				}
				this.aBoolean60 = false;
				this.aClass35_5.method524();
				this.aClass1_Sub1_Sub2_Sub3_6.method418(0, 0);
				if (this.anInt327 == -1) {
					if (this.anIntArray55[this.anInt241] != -1) {
						if (this.anInt241 == 0) {
							this.aClass1_Sub1_Sub2_Sub3_7.method418(22, 10);
						}
						if (this.anInt241 == 1) {
							this.aClass1_Sub1_Sub2_Sub3_8.method418(54, 8);
						}
						if (this.anInt241 == 2) {
							this.aClass1_Sub1_Sub2_Sub3_8.method418(82, 8);
						}
						if (this.anInt241 == 3) {
							this.aClass1_Sub1_Sub2_Sub3_9.method418(110, 8);
						}
						if (this.anInt241 == 4) {
							this.aClass1_Sub1_Sub2_Sub3_11.method418(153, 8);
						}
						if (this.anInt241 == 5) {
							this.aClass1_Sub1_Sub2_Sub3_11.method418(181, 8);
						}
						if (this.anInt241 == 6) {
							this.aClass1_Sub1_Sub2_Sub3_10.method418(209, 9);
						}
					}
					if (this.anIntArray55[0] != -1 && (this.anInt397 != 0 || anInt236 % 20 < 10)) {
						this.aClass1_Sub1_Sub2_Sub3Array1[0].method418(29, 13);
					}
					if (this.anIntArray55[1] != -1 && (this.anInt397 != 1 || anInt236 % 20 < 10)) {
						this.aClass1_Sub1_Sub2_Sub3Array1[1].method418(53, 11);
					}
					if (this.anIntArray55[2] != -1 && (this.anInt397 != 2 || anInt236 % 20 < 10)) {
						this.aClass1_Sub1_Sub2_Sub3Array1[2].method418(82, 11);
					}
					if (this.anIntArray55[3] != -1 && (this.anInt397 != 3 || anInt236 % 20 < 10)) {
						this.aClass1_Sub1_Sub2_Sub3Array1[3].method418(115, 12);
					}
					if (this.anIntArray55[4] != -1 && (this.anInt397 != 4 || anInt236 % 20 < 10)) {
						this.aClass1_Sub1_Sub2_Sub3Array1[4].method418(153, 13);
					}
					if (this.anIntArray55[5] != -1 && (this.anInt397 != 5 || anInt236 % 20 < 10)) {
						this.aClass1_Sub1_Sub2_Sub3Array1[5].method418(180, 11);
					}
					if (this.anIntArray55[6] != -1 && (this.anInt397 != 6 || anInt236 % 20 < 10)) {
						this.aClass1_Sub1_Sub2_Sub3Array1[6].method418(208, 13);
					}
				}
				this.aClass35_5.method525(160, 516, super.aGraphics2);
				this.aClass35_4.method524();
				this.aClass1_Sub1_Sub2_Sub3_5.method418(0, 0);
				if (this.anInt327 == -1) {
					if (this.anIntArray55[this.anInt241] != -1) {
						if (this.anInt241 == 7) {
							this.aClass1_Sub1_Sub2_Sub3_16.method418(42, 0);
						}
						if (this.anInt241 == 8) {
							this.aClass1_Sub1_Sub2_Sub3_17.method418(74, 0);
						}
						if (this.anInt241 == 9) {
							this.aClass1_Sub1_Sub2_Sub3_17.method418(102, 0);
						}
						if (this.anInt241 == 10) {
							this.aClass1_Sub1_Sub2_Sub3_18.method418(130, 1);
						}
						if (this.anInt241 == 11) {
							this.aClass1_Sub1_Sub2_Sub3_20.method418(173, 0);
						}
						if (this.anInt241 == 12) {
							this.aClass1_Sub1_Sub2_Sub3_20.method418(201, 0);
						}
						if (this.anInt241 == 13) {
							this.aClass1_Sub1_Sub2_Sub3_19.method418(229, 0);
						}
					}
					if (this.anIntArray55[8] != -1 && (this.anInt397 != 8 || anInt236 % 20 < 10)) {
						this.aClass1_Sub1_Sub2_Sub3Array1[7].method418(74, 2);
					}
					if (this.anIntArray55[9] != -1 && (this.anInt397 != 9 || anInt236 % 20 < 10)) {
						this.aClass1_Sub1_Sub2_Sub3Array1[8].method418(102, 3);
					}
					if (this.anIntArray55[10] != -1 && (this.anInt397 != 10 || anInt236 % 20 < 10)) {
						this.aClass1_Sub1_Sub2_Sub3Array1[9].method418(137, 4);
					}
					if (this.anIntArray55[11] != -1 && (this.anInt397 != 11 || anInt236 % 20 < 10)) {
						this.aClass1_Sub1_Sub2_Sub3Array1[10].method418(174, 2);
					}
					if (this.anIntArray55[12] != -1 && (this.anInt397 != 12 || anInt236 % 20 < 10)) {
						this.aClass1_Sub1_Sub2_Sub3Array1[11].method418(201, 2);
					}
					if (this.anIntArray55[13] != -1 && (this.anInt397 != 13 || anInt236 % 20 < 10)) {
						this.aClass1_Sub1_Sub2_Sub3Array1[12].method418(226, 2);
					}
				}
				this.aClass35_4.method525(466, 496, super.aGraphics2);
				this.aClass35_8.method524();
			}
			if (this.aBoolean83) {
				this.aBoolean83 = false;
				this.aClass35_3.method524();
				this.aClass1_Sub1_Sub2_Sub3_4.method418(0, 0);
				this.aClass1_Sub1_Sub2_Sub4_2.method448(55, true, 16777215, "Public chat", 28);
				if (this.anInt210 == 0) {
					this.aClass1_Sub1_Sub2_Sub4_2.method448(55, true, 65280, "On", 41);
				}
				if (this.anInt210 == 1) {
					this.aClass1_Sub1_Sub2_Sub4_2.method448(55, true, 16776960, "Friends", 41);
				}
				if (this.anInt210 == 2) {
					this.aClass1_Sub1_Sub2_Sub4_2.method448(55, true, 16711680, "Off", 41);
				}
				if (this.anInt210 == 3) {
					this.aClass1_Sub1_Sub2_Sub4_2.method448(55, true, 65535, "Hide", 41);
				}
				this.aClass1_Sub1_Sub2_Sub4_2.method448(184, true, 16777215, "Private chat", 28);
				if (this.anInt353 == 0) {
					this.aClass1_Sub1_Sub2_Sub4_2.method448(184, true, 65280, "On", 41);
				}
				if (this.anInt353 == 1) {
					this.aClass1_Sub1_Sub2_Sub4_2.method448(184, true, 16776960, "Friends", 41);
				}
				if (this.anInt353 == 2) {
					this.aClass1_Sub1_Sub2_Sub4_2.method448(184, true, 16711680, "Off", 41);
				}
				this.aClass1_Sub1_Sub2_Sub4_2.method448(324, true, 16777215, "Trade/compete", 28);
				if (this.anInt293 == 0) {
					this.aClass1_Sub1_Sub2_Sub4_2.method448(324, true, 65280, "On", 41);
				}
				if (this.anInt293 == 1) {
					this.aClass1_Sub1_Sub2_Sub4_2.method448(324, true, 16776960, "Friends", 41);
				}
				if (this.anInt293 == 2) {
					this.aClass1_Sub1_Sub2_Sub4_2.method448(324, true, 16711680, "Off", 41);
				}
				this.aClass1_Sub1_Sub2_Sub4_2.method448(458, true, 16777215, "Report abuse", 33);
				this.aClass35_3.method525(453, 0, super.aGraphics2);
				this.aClass35_8.method524();
			}
			this.anInt323 = 0;
		} catch (@Pc(1054) RuntimeException local1054) {
			signlink.reporterror("91012, " + 1 + ", " + local1054.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(Z)V")
	private void method119() {
		try {
			for (@Pc(6) Class1_Sub1_Sub1_Sub6 local6 = (Class1_Sub1_Sub1_Sub6) this.aClass29_1.method511(); local6 != null; local6 = (Class1_Sub1_Sub1_Sub6) this.aClass29_1.method513()) {
				if (local6.anInt522 != this.anInt334 || local6.aBoolean145) {
					local6.method673();
				} else if (anInt236 >= local6.anInt521) {
					local6.method301(this.anInt323);
					if (local6.aBoolean145) {
						local6.method673();
					} else {
						this.aClass37_1.method541(false, local6.anInt522, local6.anInt524, 60, -1, local6, local6.anInt525, 0, local6.anInt523);
					}
				}
			}
		} catch (@Pc(74) RuntimeException local74) {
			signlink.reporterror("71206, " + false + ", " + local74.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(Z)V")
	private void method120() {
		try {
			if (this.anInt252 > 0) {
				this.method222(this.aByte11);
			} else {
				this.aClass35_8.method524();
				this.aClass1_Sub1_Sub2_Sub4_2.method447(257, 0, "Connection lost", 144);
				this.aClass1_Sub1_Sub2_Sub4_2.method447(256, 16777215, "Connection lost", 143);
				this.aClass1_Sub1_Sub2_Sub4_2.method447(257, 0, "Please wait - attempting to reestablish", 159);
				this.aClass1_Sub1_Sub2_Sub4_2.method447(256, 16777215, "Please wait - attempting to reestablish", 158);
				this.aClass35_8.method525(4, 4, super.aGraphics2);
				this.anInt229 = 0;
				this.anInt370 = 0;
				@Pc(68) Class8 local68 = this.aClass8_1;
				this.aBoolean48 = false;
				this.method158(this.aString10, this.aString11, true);
				if (!this.aBoolean48) {
					this.method222(this.aByte11);
				}
				try {
					local68.method247();
				} catch (@Pc(89) Exception local89) {
				}
			}
		} catch (@Pc(91) RuntimeException local91) {
			signlink.reporterror("52865, " + false + ", " + local91.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILclient!nb;)V")
	private void method121(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub2 arg1) {
		try {
			@Pc(1) int local1 = 0;
			@Pc(3) int local3 = -1;
			@Pc(5) int local5 = 0;
			@Pc(7) int local7 = 0;
			if (arg1.anInt772 == 0) {
				local1 = this.aClass37_1.method556(arg1.anInt771, arg1.anInt773, arg1.anInt774);
			}
			if (arg1.anInt772 == 1) {
				local1 = this.aClass37_1.method557(arg1.anInt773, arg1.anInt774, arg1.anInt771);
			}
			if (arg1.anInt772 == 2) {
				local1 = this.aClass37_1.method558(arg1.anInt771, arg1.anInt773, arg1.anInt774);
			}
			if (arg1.anInt772 == 3) {
				local1 = this.aClass37_1.method559(arg1.anInt771, arg1.anInt773, arg1.anInt774);
			}
			@Pc(76) int local76;
			if (local1 != 0) {
				local76 = this.aClass37_1.method560(arg1.anInt771, arg1.anInt773, arg1.anInt774, local1);
				local3 = local1 >> 14 & 0x7FFF;
				local5 = local76 & 0x1F;
				local7 = local76 >> 6;
			}
			arg1.anInt775 = local3;
			arg1.anInt777 = local5;
			if (arg0 != 26816) {
				for (local76 = 1; local76 > 0; local76++) {
				}
			}
			arg1.anInt776 = local7;
		} catch (@Pc(111) RuntimeException local111) {
			signlink.reporterror("91015, " + arg0 + ", " + arg1 + ", " + local111.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIILjava/lang/String;Ljava/lang/String;I)Lclient!xb;")
	private Class47 method122(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) String arg2, @OriginalArg(4) String arg3, @OriginalArg(5) int arg4) {
		try {
			@Pc(3) byte[] local3 = null;
			@Pc(5) int local5 = 5;
			try {
				if (this.aClass45Array1[0] != null) {
					local3 = this.aClass45Array1[0].method658(arg4);
				}
			} catch (@Pc(20) Exception local20) {
			}
			@Pc(34) int local34;
			if (local3 != null) {
				this.aCRC32_1.reset();
				this.aCRC32_1.update(local3);
				local34 = (int) this.aCRC32_1.getValue();
				if (local34 != arg1) {
					local3 = null;
				}
			}
			if (local3 != null) {
				return new Class47(local3, 44340);
			}
			local34 = 0;
			while (local3 == null) {
				@Pc(63) String local63 = "Unknown error";
				this.method96(arg0, "Requesting " + arg3);
				@Pc(78) int local78;
				try {
					local78 = 0;
					@Pc(89) DataInputStream local89 = this.method131(arg2 + arg1);
					@Pc(92) byte[] local92 = new byte[6];
					local89.readFully(local92, 0, 6);
					@Pc(103) Class1_Sub1_Sub3 local103 = new Class1_Sub1_Sub3(local92, aBoolean64);
					local103.anInt733 = 3;
					@Pc(111) int local111 = local103.method484() + 6;
					@Pc(113) int local113 = 6;
					local3 = new byte[local111];
					for (@Pc(118) int local118 = 0; local118 < 6; local118++) {
						local3[local118] = local92[local118];
					}
					@Pc(136) int local136;
					while (local113 < local111) {
						local136 = local111 - local113;
						if (local136 > 1000) {
							local136 = 1000;
						}
						@Pc(147) int local147 = local89.read(local3, local113, local136);
						if (local147 < 0) {
							(new StringBuffer("Length error: ")).append(local113).append("/").append(local111).toString();
							throw new IOException("EOF");
						}
						local113 += local147;
						@Pc(176) int local176 = local113 * 100 / local111;
						if (local176 != local78) {
							this.method96(arg0, "Loading " + arg3 + " - " + local176 + "%");
						}
						local78 = local176;
					}
					local89.close();
					try {
						if (this.aClass45Array1[0] != null) {
							this.aClass45Array1[0].method659(local3.length, arg4, local3);
						}
					} catch (@Pc(221) Exception local221) {
						this.aClass45Array1[0] = null;
					}
					if (local3 != null) {
						this.aCRC32_1.reset();
						this.aCRC32_1.update(local3);
						local136 = (int) this.aCRC32_1.getValue();
						if (local136 != arg1) {
							local3 = null;
							local34++;
							local63 = "Checksum error: " + local136;
						}
					}
				} catch (@Pc(256) IOException local256) {
					if (local63.equals("Unknown error")) {
						local63 = "Connection error";
					}
					local3 = null;
				} catch (@Pc(266) NullPointerException local266) {
					local63 = "Null error";
					local3 = null;
					if (!signlink.reporterror) {
						return null;
					}
				} catch (@Pc(275) ArrayIndexOutOfBoundsException local275) {
					local63 = "Bounds error";
					local3 = null;
					if (!signlink.reporterror) {
						return null;
					}
				} catch (@Pc(284) Exception local284) {
					local63 = "Unexpected error";
					local3 = null;
					if (!signlink.reporterror) {
						return null;
					}
				}
				if (local3 == null) {
					for (local78 = local5; local78 > 0; local78--) {
						if (local34 >= 3) {
							this.method96(arg0, "Game updated - please reload page");
							local78 = 10;
						} else {
							this.method96(arg0, local63 + " - Retrying in " + local78);
						}
						try {
							Thread.sleep(1000L);
						} catch (@Pc(328) Exception local328) {
						}
					}
					local5 *= 2;
					if (local5 > 60) {
						local5 = 60;
					}
					this.aBoolean75 = !this.aBoolean75;
				}
			}
			return new Class47(local3, 44340);
		} catch (@Pc(360) RuntimeException local360) {
			signlink.reporterror("54814, " + arg0 + ", " + -963 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local360.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IILclient!lb;)V")
	private void method123(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class1_Sub1_Sub3 arg2) {
		try {
			while (true) {
				if (arg2.anInt734 + 21 < arg0 * 8) {
					@Pc(12) int local12 = arg2.method491(14);
					if (local12 != 16383) {
						if (this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local12] == null) {
							this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local12] = new Class1_Sub1_Sub1_Sub1_Sub2();
						}
						@Pc(32) Class1_Sub1_Sub1_Sub1_Sub2 local32 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local12];
						this.anIntArray42[this.anInt242++] = local12;
						local32.anInt1022 = anInt236;
						local32.aClass13_2 = Class13.method323(arg2.method491(12));
						local32.anInt985 = local32.aClass13_2.aByte20;
						local32.anInt1025 = local32.aClass13_2.anInt561;
						local32.anInt988 = local32.aClass13_2.anInt548;
						local32.anInt989 = local32.aClass13_2.anInt549;
						local32.anInt990 = local32.aClass13_2.anInt550;
						local32.anInt991 = local32.aClass13_2.anInt551;
						local32.anInt986 = local32.aClass13_2.anInt547;
						@Pc(93) int local93 = arg2.method491(5);
						if (local93 > 15) {
							local93 -= 32;
						}
						@Pc(102) int local102 = arg2.method491(5);
						if (local102 > 15) {
							local102 -= 32;
						}
						@Pc(111) int local111 = arg2.method491(1);
						local32.method677(aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray272[0] + local93, local111 == 1, aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray273[0] + local102);
						@Pc(137) int local137 = arg2.method491(1);
						if (local137 == 1) {
							this.anIntArray54[this.anInt274++] = local12;
						}
						continue;
					}
				}
				arg2.method492();
				@Pc(160) boolean local160 = false;
				return;
			}
		} catch (@Pc(162) RuntimeException local162) {
			signlink.reporterror("69801, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local162.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(B)V")
	private void method124() {
		try {
			if (super.anInt199 == 1) {
				if (super.anInt200 >= 6 && super.anInt200 <= 106 && super.anInt201 >= 467 && super.anInt201 <= 499) {
					this.anInt210 = (this.anInt210 + 1) % 4;
					this.aBoolean83 = true;
					this.aBoolean99 = true;
					this.aClass1_Sub1_Sub3_2.method469(158, 837);
					this.aClass1_Sub1_Sub3_2.method470(this.anInt210);
					this.aClass1_Sub1_Sub3_2.method470(this.anInt353);
					this.aClass1_Sub1_Sub3_2.method470(this.anInt293);
				}
				if (super.anInt200 >= 135 && super.anInt200 <= 235 && super.anInt201 >= 467 && super.anInt201 <= 499) {
					this.anInt353 = (this.anInt353 + 1) % 3;
					this.aBoolean83 = true;
					this.aBoolean99 = true;
					this.aClass1_Sub1_Sub3_2.method469(158, 837);
					this.aClass1_Sub1_Sub3_2.method470(this.anInt210);
					this.aClass1_Sub1_Sub3_2.method470(this.anInt353);
					this.aClass1_Sub1_Sub3_2.method470(this.anInt293);
				}
				if (super.anInt200 >= 273 && super.anInt200 <= 373 && super.anInt201 >= 467 && super.anInt201 <= 499) {
					this.anInt293 = (this.anInt293 + 1) % 3;
					this.aBoolean83 = true;
					this.aBoolean99 = true;
					this.aClass1_Sub1_Sub3_2.method469(158, 837);
					this.aClass1_Sub1_Sub3_2.method470(this.anInt210);
					this.aClass1_Sub1_Sub3_2.method470(this.anInt353);
					this.aClass1_Sub1_Sub3_2.method470(this.anInt293);
				}
				if (super.anInt200 >= 412 && super.anInt200 <= 512 && super.anInt201 >= 467 && super.anInt201 <= 499) {
					if (this.anInt220 == -1) {
						this.method150();
						this.aString17 = "";
						this.aBoolean49 = false;
						for (@Pc(192) int local192 = 0; local192 < Class6.aClass6Array1.length; local192++) {
							if (Class6.aClass6Array1[local192] != null && Class6.aClass6Array1[local192].anInt422 == 600) {
								this.anInt275 = this.anInt220 = Class6.aClass6Array1[local192].anInt419;
								return;
							}
						}
						return;
					}
					this.method108("", "Please close the interface you have open before using 'report abuse'", 0);
					return;
				}
			}
		} catch (@Pc(228) RuntimeException local228) {
			signlink.reporterror("71941, " + 5 + ", " + local228.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(IZ)V")
	private void method125(@OriginalArg(1) boolean arg0) {
		try {
			this.method215();
			this.aClass35_21.method524();
			this.aClass1_Sub1_Sub2_Sub3_12.method418(0, 0);
			@Pc(50) byte local50;
			@Pc(62) int local62;
			if (this.anInt324 == 0) {
				this.aClass1_Sub1_Sub2_Sub4_1.method448(180, true, 7711145, this.aClass44_Sub1_1.aString30, 180);
				local50 = 80;
				this.aClass1_Sub1_Sub2_Sub4_3.method448(180, true, 16776960, "Welcome to RuneScape", 80);
				local62 = local50 + 30;
				this.aClass1_Sub1_Sub2_Sub3_13.method418(27, 100);
				this.aClass1_Sub1_Sub2_Sub4_3.method448(100, true, 16777215, "New User", 125);
				this.aClass1_Sub1_Sub2_Sub3_13.method418(187, 100);
				this.aClass1_Sub1_Sub2_Sub4_3.method448(260, true, 16777215, "Existing User", 125);
			}
			if (this.anInt324 == 2) {
				local50 = 60;
				if (this.aString5.length() > 0) {
					this.aClass1_Sub1_Sub2_Sub4_3.method448(180, true, 16776960, this.aString5, 45);
					this.aClass1_Sub1_Sub2_Sub4_3.method448(180, true, 16776960, this.aString6, 60);
					local62 = local50 + 30;
				} else {
					this.aClass1_Sub1_Sub2_Sub4_3.method448(180, true, 16776960, this.aString6, 53);
					local62 = local50 + 30;
				}
				this.aClass1_Sub1_Sub2_Sub4_3.method455(16777215, 90, true, 90, "Username: " + this.aString10 + (this.anInt257 == 0 & anInt236 % 40 < 20 ? "@yel@|" : ""));
				local62 += 15;
				this.aClass1_Sub1_Sub2_Sub4_3.method455(16777215, 92, true, 105, "Password: " + Class48.method672((byte) 1, this.aString11) + (this.anInt257 == 1 & anInt236 % 40 < 20 ? "@yel@|" : ""));
				local62 += 15;
				if (!arg0) {
					this.aClass1_Sub1_Sub2_Sub3_13.method418(27, 130);
					this.aClass1_Sub1_Sub2_Sub4_3.method448(100, true, 16777215, "Login", 155);
					this.aClass1_Sub1_Sub2_Sub3_13.method418(187, 130);
					this.aClass1_Sub1_Sub2_Sub4_3.method448(260, true, 16777215, "Cancel", 155);
				}
			}
			if (this.anInt324 == 3) {
				this.aClass1_Sub1_Sub2_Sub4_3.method448(180, true, 16776960, "Create a free account", 40);
				local50 = 65;
				this.aClass1_Sub1_Sub2_Sub4_3.method448(180, true, 16777215, "To create a new account you need to", 65);
				local62 = local50 + 15;
				this.aClass1_Sub1_Sub2_Sub4_3.method448(180, true, 16777215, "go back to the main RuneScape webpage", 80);
				local62 += 15;
				this.aClass1_Sub1_Sub2_Sub4_3.method448(180, true, 16777215, "and choose the red 'create account'", 95);
				local62 += 15;
				this.aClass1_Sub1_Sub2_Sub4_3.method448(180, true, 16777215, "button at the top right of that page.", 110);
				local62 += 15;
				this.aClass1_Sub1_Sub2_Sub3_13.method418(107, 130);
				this.aClass1_Sub1_Sub2_Sub4_3.method448(180, true, 16777215, "Cancel", 155);
			}
			this.aClass35_21.method525(171, 202, super.aGraphics2);
			if (this.aBoolean98) {
				this.aBoolean98 = false;
				this.aClass35_19.method525(0, 128, super.aGraphics2);
				this.aClass35_20.method525(371, 202, super.aGraphics2);
				this.aClass35_24.method525(265, 0, super.aGraphics2);
				this.aClass35_25.method525(265, 562, super.aGraphics2);
				this.aClass35_26.method525(171, 128, super.aGraphics2);
				this.aClass35_27.method525(171, 562, super.aGraphics2);
			}
		} catch (@Pc(495) RuntimeException local495) {
			signlink.reporterror("48753, " + -545 + ", " + arg0 + ", " + local495.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "p", descriptor = "(I)V")
	private void method126(@OriginalArg(0) int arg0) {
		try {
			@Pc(21) int local21;
			@Pc(49) int local49;
			@Pc(53) int local53;
			@Pc(62) int local62;
			@Pc(69) int local69;
			@Pc(132) int local132;
			@Pc(189) int local189;
			try {
				this.anInt345 = -1;
				this.aClass29_1.method515();
				this.aClass29_2.method515();
				Class1_Sub1_Sub2_Sub1.method345();
				this.method99();
				this.aClass37_1.method530(712);
				for (local21 = 0; local21 < 4; local21++) {
					this.aClass19Array1[local21].method420();
				}
				System.gc();
				@Pc(45) Class4 local45 = new Class4(this.aByteArrayArrayArray7, true, 104, 104, this.anIntArrayArrayArray5);
				local49 = this.aByteArrayArray2.length;
				Class4.aBoolean35 = Class37.aBoolean227;
				for (local53 = 0; local53 < local49; local53++) {
					local62 = this.anIntArray35[local53] >> 8;
					local69 = this.anIntArray35[local53] & 0xFF;
					if (local62 == 33 && local69 >= 71 && local69 <= 73) {
						Class4.aBoolean35 = false;
					}
				}
				if (Class4.aBoolean35) {
					this.aClass37_1.method531(this.anInt334);
				} else {
					this.aClass37_1.method531(0);
				}
				this.aClass1_Sub1_Sub3_2.method469(146, 837);
				@Pc(137) byte[] local137;
				for (local62 = 0; local62 < local49; local62++) {
					local69 = (this.anIntArray35[local62] >> 8) * 64 - this.anInt213;
					local132 = (this.anIntArray35[local62] & 0xFF) * 64 - this.anInt214;
					local137 = this.aByteArrayArray2[local62];
					if (local137 != null) {
						local45.method57(local137, local132, (this.anInt340 - 6) * 8, (this.anInt339 - 6) * 8, local69);
					}
				}
				for (local69 = 0; local69 < local49; local69++) {
					local132 = (this.anIntArray35[local69] >> 8) * 64 - this.anInt213;
					local189 = (this.anIntArray35[local69] & 0xFF) * 64 - this.anInt214;
					@Pc(194) byte[] local194 = this.aByteArrayArray2[local69];
					if (local194 == null && this.anInt340 < 800) {
						local45.method56(local132, this.aBoolean80, local189);
					}
				}
				this.aClass1_Sub1_Sub3_2.method469(146, 837);
				@Pc(240) int local240;
				for (local132 = 0; local132 < local49; local132++) {
					local137 = this.aByteArrayArray1[local132];
					if (local137 != null) {
						local240 = (this.anIntArray35[local132] >> 8) * 64 - this.anInt213;
						@Pc(252) int local252 = (this.anIntArray35[local132] & 0xFF) * 64 - this.anInt214;
						local45.method60(this.aClass37_1, local137, local240, local252, this.aClass19Array1);
					}
				}
				this.aClass1_Sub1_Sub3_2.method469(146, 837);
				local45.method62(this.aClass19Array1, this.aClass37_1);
				this.aClass35_8.method524();
				this.aClass1_Sub1_Sub3_2.method469(146, 837);
				for (local189 = 0; local189 < 104; local189++) {
					for (local240 = 0; local240 < 104; local240++) {
						this.method179(local189, local240);
					}
				}
				this.method199();
			} catch (@Pc(312) Exception local312) {
			}
			Class9.aClass40_4.method593();
			@Pc(326) int local326;
			if (aBoolean66 && signlink.aRandomAccessFile1 != null) {
				local21 = this.aClass44_Sub1_1.method638(0);
				for (local326 = 0; local326 < local21; local326++) {
					local49 = this.aClass44_Sub1_1.method643(local326);
					if ((local49 & 0x79) == 0) {
						Class1_Sub1_Sub1_Sub5.method260(local326);
					}
				}
			}
			System.gc();
			Class1_Sub1_Sub2_Sub1.method346();
			this.aClass44_Sub1_1.method649();
			local21 = (this.anInt339 - 6) / 8 - 1;
			local326 = (this.anInt339 + 6) / 8 + 1;
			local49 = (this.anInt340 - 6) / 8 - 1;
			local53 = (this.anInt340 + 6) / 8 + 1;
			if (arg0 >= 0) {
				for (local62 = 1; local62 > 0; local62++) {
				}
			}
			if (this.aBoolean82) {
				local21 = 49;
				local326 = 50;
				local49 = 49;
				local53 = 50;
			}
			for (local62 = local21; local62 <= local326; local62++) {
				for (local69 = local49; local69 <= local53; local69++) {
					if (local62 == local21 || local62 == local326 || local69 == local49 || local69 == local53) {
						local132 = this.aClass44_Sub1_1.method640(0, local69, local62);
						if (local132 != -1) {
							this.aClass44_Sub1_1.method650(local132, 3);
						}
						local189 = this.aClass44_Sub1_1.method640(1, local69, local62);
						if (local189 != -1) {
							this.aClass44_Sub1_1.method650(local189, 3);
						}
					}
				}
			}
		} catch (@Pc(473) RuntimeException local473) {
			signlink.reporterror("53297, " + arg0 + ", " + local473.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(JB)V")
	private void method127(@OriginalArg(0) long arg0) {
		try {
			if (arg0 != 0L) {
				for (@Pc(13) int local13 = 0; local13 < this.anInt361; local13++) {
					if (this.aLongArray4[local13] == arg0) {
						this.anInt361--;
						this.aBoolean92 = true;
						for (@Pc(33) int local33 = local13; local33 < this.anInt361; local33++) {
							this.aLongArray4[local33] = this.aLongArray4[local33 + 1];
						}
						this.aClass1_Sub1_Sub3_2.method469(228, 837);
						this.aClass1_Sub1_Sub3_2.method476(this.aByte5, arg0);
						return;
					}
				}
			}
		} catch (@Pc(69) RuntimeException local69) {
			signlink.reporterror("49104, " + arg0 + ", " + 121 + ", " + local69.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIIIII)V")
	private void method128(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		try {
			@Pc(5) int local5 = 2048 - arg6 & 0x7FF;
			@Pc(11) int local11 = 2048 - arg0 & 0x7FF;
			if (arg2 == -9666) {
				@Pc(17) int local17 = 0;
				@Pc(19) int local19 = 0;
				@Pc(21) int local21 = arg1;
				@Pc(27) int local27;
				@Pc(31) int local31;
				@Pc(41) int local41;
				if (local5 != 0) {
					local27 = Class1_Sub1_Sub1_Sub5.anIntArray151[local5];
					local31 = Class1_Sub1_Sub1_Sub5.anIntArray152[local5];
					local41 = local31 * 0 - arg1 * local27 >> 16;
					local21 = local27 * 0 + arg1 * local31 >> 16;
					local19 = local41;
				}
				if (local11 != 0) {
					local27 = Class1_Sub1_Sub1_Sub5.anIntArray151[local11];
					local31 = Class1_Sub1_Sub1_Sub5.anIntArray152[local11];
					local41 = local21 * local27 + local31 * 0 >> 16;
					local21 = local21 * local31 - local27 * 0 >> 16;
					local17 = local41;
				}
				this.anInt266 = arg3 - local17;
				this.anInt267 = arg5 - local19;
				this.anInt268 = arg4 - local21;
				this.anInt269 = arg6;
				this.anInt270 = arg0;
			}
		} catch (@Pc(108) RuntimeException local108) {
			signlink.reporterror("35131, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + local108.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIIIIII)V")
	private void method129(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		try {
			if (arg6 >= 1 && arg2 >= 1 && arg6 <= 102 && arg2 <= 102) {
				if (aBoolean66 && arg5 != this.anInt334) {
					return;
				}
				@Pc(26) int local26 = 0;
				if (arg0 == 0) {
					local26 = this.aClass37_1.method556(arg5, arg6, arg2);
				}
				if (arg0 == 1) {
					local26 = this.aClass37_1.method557(arg6, arg2, arg5);
				}
				if (arg0 == 2) {
					local26 = this.aClass37_1.method558(arg5, arg6, arg2);
				}
				if (arg0 == 3) {
					local26 = this.aClass37_1.method559(arg5, arg6, arg2);
				}
				@Pc(82) int local82;
				if (local26 != 0) {
					local82 = this.aClass37_1.method560(arg5, arg6, arg2, local26);
					@Pc(88) int local88 = local26 >> 14 & 0x7FFF;
					@Pc(92) int local92 = local82 & 0x1F;
					@Pc(96) int local96 = local82 >> 6;
					@Pc(108) Class9 local108;
					if (arg0 == 0) {
						this.aClass37_1.method547(arg6, arg2, arg5);
						local108 = Class9.method288(local88);
						if (local108.aBoolean131) {
							this.aClass19Array1[arg5].method425(arg6, arg2, local92, local96, local108.aBoolean132, (byte) 8);
						}
					}
					if (arg0 == 1) {
						this.aClass37_1.method548(arg2, arg6, arg5);
					}
					if (arg0 == 2) {
						this.aClass37_1.method549(arg2, arg5, arg6);
						local108 = Class9.method288(local88);
						if (arg6 + local108.anInt502 > 103 || arg2 + local108.anInt502 > 103 || arg6 + local108.anInt503 > 103 || arg2 + local108.anInt503 > 103) {
							return;
						}
						if (local108.aBoolean131) {
							this.aClass19Array1[arg5].method426(local108.anInt502, local108.anInt503, arg2, local96, local108.aBoolean132, arg6);
						}
					}
					if (arg0 == 3) {
						this.aClass37_1.method550(arg2, arg6, arg5);
						local108 = Class9.method288(local88);
						if (local108.aBoolean131 && local108.aBoolean133) {
							this.aClass19Array1[arg5].method428(arg2, arg6);
						}
					}
				}
				if (arg4 >= 0) {
					local82 = arg5;
					if (arg5 < 3 && (this.aByteArrayArrayArray7[1][arg6][arg2] & 0x2) == 2) {
						local82 = arg5 + 1;
					}
					Class4.method73(local82, arg5, this.anIntArrayArrayArray5, arg1, this.aClass19Array1[arg5], arg6, arg3, this.aClass37_1, arg4, arg2);
					return;
				}
			}
		} catch (@Pc(255) RuntimeException local255) {
			signlink.reporterror("52183, " + arg0 + ", " + arg1 + ", " + -5266 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + local255.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "f", descriptor = "(Z)V")
	private void method130() {
		try {
			if (this.anInt390 == 0) {
				@Pc(6) int local6 = super.anInt199;
				if (this.anInt260 == 1 && super.anInt200 >= 516 && super.anInt201 >= 160 && super.anInt200 <= 765 && super.anInt201 <= 205) {
					local6 = 0;
				}
				@Pc(40) int local40;
				@Pc(43) int local43;
				@Pc(119) int local119;
				if (this.aBoolean88) {
					if (local6 != 1) {
						local40 = super.anInt194;
						local43 = super.anInt195;
						if (this.anInt313 == 0) {
							local40 -= 4;
							local43 -= 4;
						}
						if (this.anInt313 == 1) {
							local40 -= 553;
							local43 -= 205;
						}
						if (this.anInt313 == 2) {
							local40 -= 17;
							local43 -= 357;
						}
						if (local40 < this.anInt314 - 10 || local40 > this.anInt314 + this.anInt316 + 10 || local43 < this.anInt315 - 10 || local43 > this.anInt315 + this.anInt317 + 10) {
							this.aBoolean88 = false;
							if (this.anInt313 == 1) {
								this.aBoolean92 = true;
							}
							if (this.anInt313 == 2) {
								this.aBoolean99 = true;
							}
						}
					}
					if (local6 == 1) {
						local40 = this.anInt314;
						local43 = this.anInt315;
						local119 = this.anInt316;
						@Pc(122) int local122 = super.anInt200;
						@Pc(125) int local125 = super.anInt201;
						if (this.anInt313 == 0) {
							local122 -= 4;
							local125 -= 4;
						}
						if (this.anInt313 == 1) {
							local122 -= 553;
							local125 -= 205;
						}
						if (this.anInt313 == 2) {
							local122 -= 17;
							local125 -= 357;
						}
						@Pc(144) int local144 = -1;
						for (@Pc(146) int local146 = 0; local146 < this.anInt332; local146++) {
							@Pc(161) int local161 = local43 + (this.anInt332 - 1 - local146) * 15 + 31;
							if (local122 > local40 && local122 < local40 + local119 && local125 > local161 - 13 && local125 < local161 + 3) {
								local144 = local146;
							}
						}
						if (local144 != -1) {
							this.method211(local144);
						}
						this.aBoolean88 = false;
						if (this.anInt313 == 1) {
							this.aBoolean92 = true;
						}
						if (this.anInt313 == 2) {
							this.aBoolean99 = true;
							return;
						}
					}
				} else {
					if (local6 == 1 && this.anInt332 > 0) {
						local40 = this.anIntArray80[this.anInt332 - 1];
						if (local40 == 582 || local40 == 113 || local40 == 555 || local40 == 331 || local40 == 354 || local40 == 694 || local40 == 962 || local40 == 795 || local40 == 681 || local40 == 100 || local40 == 102 || local40 == 1328) {
							local43 = this.anIntArray78[this.anInt332 - 1];
							local119 = this.anIntArray79[this.anInt332 - 1];
							@Pc(281) Class6 local281 = Class6.aClass6Array1[local119];
							if (local281.aBoolean106 || local281.aBoolean109) {
								this.aBoolean90 = false;
								this.anInt223 = 0;
								this.anInt388 = local119;
								this.anInt389 = local43;
								this.anInt390 = 2;
								this.anInt391 = super.anInt200;
								this.anInt392 = super.anInt201;
								if (Class6.aClass6Array1[local119].anInt419 == this.anInt220) {
									this.anInt390 = 1;
								}
								if (Class6.aClass6Array1[local119].anInt419 == this.anInt209) {
									this.anInt390 = 3;
								}
								return;
							}
						}
					}
					if (local6 == 1 && (this.anInt280 == 1 || this.method170(this.anInt332 - 1)) && this.anInt332 > 2) {
						local6 = 2;
					}
					if (local6 == 1 && this.anInt332 > 0) {
						this.method211(this.anInt332 - 1);
					}
					if (local6 != 2 || this.anInt332 <= 0) {
						return;
					}
					this.method181();
				}
			}
		} catch (@Pc(376) RuntimeException local376) {
			signlink.reporterror("91170, " + true + ", " + local376.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/String;)Ljava/io/DataInputStream;")
	private DataInputStream method131(@OriginalArg(0) String arg0) throws IOException {
		if (this.aBoolean75) {
			if (this.aSocket1 != null) {
				try {
					this.aSocket1.close();
				} catch (@Pc(26) Exception local26) {
				}
				this.aSocket1 = null;
			}
			this.aSocket1 = this.method153(43595);
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

	@OriginalMember(owner = "client!client", name = "a", descriptor = "()V")
	@Override
	protected void method89() {
		this.method96(20, "Starting up");
		if (signlink.sunjava) {
			super.anInt188 = 5;
		}
		if (aBoolean76) {
			this.aBoolean94 = true;
			return;
		}
		aBoolean76 = true;
		@Pc(21) boolean local21 = false;
		@Pc(25) String local25 = this.method101();
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
			this.aBoolean59 = true;
			return;
		}
		if (signlink.aRandomAccessFile1 != null) {
			for (@Pc(95) int local95 = 0; local95 < 5; local95++) {
				this.aClass45Array1[local95] = new Class45(signlink.aRandomAccessFile1, 500000, local95 + 1, signlink.aRandomAccessFileArray1[local95], -16770);
			}
		}
		try {
			this.method149();
			this.aClass47_1 = this.method122(25, this.anIntArray61[1], "title", "title screen", 1);
			this.aClass1_Sub1_Sub2_Sub4_1 = new Class1_Sub1_Sub2_Sub4(false, "p11_full", this.aClass47_1, 4);
			this.aClass1_Sub1_Sub2_Sub4_2 = new Class1_Sub1_Sub2_Sub4(false, "p12_full", this.aClass47_1, 4);
			this.aClass1_Sub1_Sub2_Sub4_3 = new Class1_Sub1_Sub2_Sub4(false, "b12_full", this.aClass47_1, 4);
			this.aClass1_Sub1_Sub2_Sub4_4 = new Class1_Sub1_Sub2_Sub4(true, "q8_full", this.aClass47_1, 4);
			this.method139();
			this.method162();
			@Pc(191) Class47 local191 = this.method122(30, this.anIntArray61[2], "config", "config", 2);
			@Pc(203) Class47 local203 = this.method122(35, this.anIntArray61[3], "interface", "interface", 3);
			@Pc(215) Class47 local215 = this.method122(40, this.anIntArray61[4], "media", "2d graphics", 4);
			@Pc(227) Class47 local227 = this.method122(45, this.anIntArray61[6], "textures", "textures", 6);
			@Pc(239) Class47 local239 = this.method122(50, this.anIntArray61[7], "wordenc", "chat system", 7);
			@Pc(251) Class47 local251 = this.method122(55, this.anIntArray61[8], "sounds", "sound effects", 8);
			this.aByteArrayArrayArray7 = new byte[4][104][104];
			this.anIntArrayArrayArray5 = new int[4][105][105];
			this.aClass37_1 = new Class37(this.anIntArrayArrayArray5, 104, false, 104, 4);
			for (@Pc(276) int local276 = 0; local276 < 4; local276++) {
				this.aClass19Array1[local276] = new Class19(1, 104, 104);
			}
			this.aClass1_Sub1_Sub2_Sub2_11 = new Class1_Sub1_Sub2_Sub2(512, 512);
			@Pc(311) Class47 local311 = this.method122(60, this.anIntArray61[5], "versionlist", "update list", 5);
			this.method96(60, "Connecting to update server");
			this.aClass44_Sub1_1 = new Class44_Sub1();
			this.aClass44_Sub1_1.method636(local311, this);
			Class12.method302(this.aClass44_Sub1_1.method639());
			Class1_Sub1_Sub1_Sub5.method258(this.aClass44_Sub1_1.method638(0), this.aClass44_Sub1_1);
			if (!aBoolean66) {
				this.anInt360 = 0;
				try {
					this.anInt360 = Integer.parseInt(this.getParameter("music"));
				} catch (@Pc(352) Exception local352) {
				}
				this.aBoolean87 = true;
				this.aClass44_Sub1_1.method645(2, this.anInt360);
				while (this.aClass44_Sub1_1.method646() > 0) {
					this.method165();
					try {
						Thread.sleep(100L);
					} catch (@Pc(370) Exception local370) {
					}
					if (this.aClass44_Sub1_1.anInt946 > 3) {
						this.method172("ondemand");
						return;
					}
				}
			}
			this.method96(65, "Requesting animations");
			@Pc(394) int local394 = this.aClass44_Sub1_1.method638(1);
			for (@Pc(396) int local396 = 0; local396 < local394; local396++) {
				this.aClass44_Sub1_1.method645(1, local396);
			}
			@Pc(415) int local415;
			while (this.aClass44_Sub1_1.method646() > 0) {
				local415 = local394 - this.aClass44_Sub1_1.method646();
				if (local415 > 0) {
					this.method96(65, "Loading animations - " + local415 * 100 / local394 + "%");
				}
				this.method165();
				try {
					Thread.sleep(100L);
				} catch (@Pc(441) Exception local441) {
				}
				if (this.aClass44_Sub1_1.anInt946 > 3) {
					this.method172("ondemand");
					return;
				}
			}
			this.method96(70, "Requesting models");
			local394 = this.aClass44_Sub1_1.method638(0);
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
					this.method96(70, "Loading models - " + local475 * 100 / local394 + "%");
				}
				this.method165();
				try {
					Thread.sleep(100L);
				} catch (@Pc(526) Exception local526) {
				}
			}
			if (this.aClass45Array1[0] != null) {
				this.method96(75, "Requesting maps");
				this.aClass44_Sub1_1.method645(3, this.aClass44_Sub1_1.method640(0, 48, 47));
				this.aClass44_Sub1_1.method645(3, this.aClass44_Sub1_1.method640(1, 48, 47));
				this.aClass44_Sub1_1.method645(3, this.aClass44_Sub1_1.method640(0, 48, 48));
				this.aClass44_Sub1_1.method645(3, this.aClass44_Sub1_1.method640(1, 48, 48));
				this.aClass44_Sub1_1.method645(3, this.aClass44_Sub1_1.method640(0, 48, 49));
				this.aClass44_Sub1_1.method645(3, this.aClass44_Sub1_1.method640(1, 48, 49));
				this.aClass44_Sub1_1.method645(3, this.aClass44_Sub1_1.method640(0, 47, 47));
				this.aClass44_Sub1_1.method645(3, this.aClass44_Sub1_1.method640(1, 47, 47));
				this.aClass44_Sub1_1.method645(3, this.aClass44_Sub1_1.method640(0, 47, 48));
				this.aClass44_Sub1_1.method645(3, this.aClass44_Sub1_1.method640(1, 47, 48));
				this.aClass44_Sub1_1.method645(3, this.aClass44_Sub1_1.method640(0, 148, 48));
				this.aClass44_Sub1_1.method645(3, this.aClass44_Sub1_1.method640(1, 148, 48));
				local394 = this.aClass44_Sub1_1.method646();
				while (this.aClass44_Sub1_1.method646() > 0) {
					local475 = local394 - this.aClass44_Sub1_1.method646();
					if (local475 > 0) {
						this.method96(75, "Loading maps - " + local475 * 100 / local394 + "%");
					}
					this.method165();
					try {
						Thread.sleep(100L);
					} catch (@Pc(711) Exception local711) {
					}
				}
			}
			local394 = this.aClass44_Sub1_1.method638(0);
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
					this.aClass44_Sub1_1.method648(349, local734, 0, local475);
				}
			}
			this.aClass44_Sub1_1.method641(aBoolean65);
			if (!aBoolean66) {
				local394 = this.aClass44_Sub1_1.method638(2);
				for (local732 = 1; local732 < local394; local732++) {
					if (this.aClass44_Sub1_1.method644(aBoolean91, local732)) {
						this.aClass44_Sub1_1.method648(349, (byte) 1, 2, local732);
					}
				}
			}
			this.method96(80, "Unpacking media");
			this.aClass1_Sub1_Sub2_Sub3_1 = new Class1_Sub1_Sub2_Sub3(local215, "invback", 0);
			this.aClass1_Sub1_Sub2_Sub3_3 = new Class1_Sub1_Sub2_Sub3(local215, "chatback", 0);
			this.aClass1_Sub1_Sub2_Sub3_2 = new Class1_Sub1_Sub2_Sub3(local215, "mapback", 0);
			this.aClass1_Sub1_Sub2_Sub3_4 = new Class1_Sub1_Sub2_Sub3(local215, "backbase1", 0);
			this.aClass1_Sub1_Sub2_Sub3_5 = new Class1_Sub1_Sub2_Sub3(local215, "backbase2", 0);
			this.aClass1_Sub1_Sub2_Sub3_6 = new Class1_Sub1_Sub2_Sub3(local215, "backhmid1", 0);
			for (local732 = 0; local732 < 13; local732++) {
				this.aClass1_Sub1_Sub2_Sub3Array1[local732] = new Class1_Sub1_Sub2_Sub3(local215, "sideicons", local732);
			}
			this.aClass1_Sub1_Sub2_Sub2_10 = new Class1_Sub1_Sub2_Sub2(local215, "compass", 0);
			this.aClass1_Sub1_Sub2_Sub2_1 = new Class1_Sub1_Sub2_Sub2(local215, "mapedge", 0);
			this.aClass1_Sub1_Sub2_Sub2_1.method388();
			@Pc(934) int local934;
			try {
				for (local934 = 0; local934 < 100; local934++) {
					this.aClass1_Sub1_Sub2_Sub3Array2[local934] = new Class1_Sub1_Sub2_Sub3(local215, "mapscene", local934);
				}
			} catch (@Pc(952) Exception local952) {
			}
			try {
				for (local934 = 0; local934 < 100; local934++) {
					this.aClass1_Sub1_Sub2_Sub2Array7[local934] = new Class1_Sub1_Sub2_Sub2(local215, "mapfunction", local934);
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
					this.aClass1_Sub1_Sub2_Sub2Array5[local934] = new Class1_Sub1_Sub2_Sub2(local215, "headicons", local934);
				}
			} catch (@Pc(1012) Exception local1012) {
			}
			this.aClass1_Sub1_Sub2_Sub2_6 = new Class1_Sub1_Sub2_Sub2(local215, "mapmarker", 0);
			this.aClass1_Sub1_Sub2_Sub2_7 = new Class1_Sub1_Sub2_Sub2(local215, "mapmarker", 1);
			for (local934 = 0; local934 < 8; local934++) {
				this.aClass1_Sub1_Sub2_Sub2Array3[local934] = new Class1_Sub1_Sub2_Sub2(local215, "cross", local934);
			}
			this.aClass1_Sub1_Sub2_Sub2_2 = new Class1_Sub1_Sub2_Sub2(local215, "mapdots", 0);
			this.aClass1_Sub1_Sub2_Sub2_3 = new Class1_Sub1_Sub2_Sub2(local215, "mapdots", 1);
			this.aClass1_Sub1_Sub2_Sub2_4 = new Class1_Sub1_Sub2_Sub2(local215, "mapdots", 2);
			this.aClass1_Sub1_Sub2_Sub2_5 = new Class1_Sub1_Sub2_Sub2(local215, "mapdots", 3);
			this.aClass1_Sub1_Sub2_Sub3_14 = new Class1_Sub1_Sub2_Sub3(local215, "scrollbar", 0);
			this.aClass1_Sub1_Sub2_Sub3_15 = new Class1_Sub1_Sub2_Sub3(local215, "scrollbar", 1);
			this.aClass1_Sub1_Sub2_Sub3_7 = new Class1_Sub1_Sub2_Sub3(local215, "redstone1", 0);
			this.aClass1_Sub1_Sub2_Sub3_8 = new Class1_Sub1_Sub2_Sub3(local215, "redstone2", 0);
			this.aClass1_Sub1_Sub2_Sub3_9 = new Class1_Sub1_Sub2_Sub3(local215, "redstone3", 0);
			this.aClass1_Sub1_Sub2_Sub3_10 = new Class1_Sub1_Sub2_Sub3(local215, "redstone1", 0);
			this.aClass1_Sub1_Sub2_Sub3_10.method415();
			this.aClass1_Sub1_Sub2_Sub3_11 = new Class1_Sub1_Sub2_Sub3(local215, "redstone2", 0);
			this.aClass1_Sub1_Sub2_Sub3_11.method415();
			this.aClass1_Sub1_Sub2_Sub3_16 = new Class1_Sub1_Sub2_Sub3(local215, "redstone1", 0);
			this.aClass1_Sub1_Sub2_Sub3_16.method416();
			this.aClass1_Sub1_Sub2_Sub3_17 = new Class1_Sub1_Sub2_Sub3(local215, "redstone2", 0);
			this.aClass1_Sub1_Sub2_Sub3_17.method416();
			this.aClass1_Sub1_Sub2_Sub3_18 = new Class1_Sub1_Sub2_Sub3(local215, "redstone3", 0);
			this.aClass1_Sub1_Sub2_Sub3_18.method416();
			this.aClass1_Sub1_Sub2_Sub3_19 = new Class1_Sub1_Sub2_Sub3(local215, "redstone1", 0);
			this.aClass1_Sub1_Sub2_Sub3_19.method415();
			this.aClass1_Sub1_Sub2_Sub3_19.method416();
			this.aClass1_Sub1_Sub2_Sub3_20 = new Class1_Sub1_Sub2_Sub3(local215, "redstone2", 0);
			this.aClass1_Sub1_Sub2_Sub3_20.method415();
			this.aClass1_Sub1_Sub2_Sub3_20.method416();
			for (@Pc(1212) int local1212 = 0; local1212 < 2; local1212++) {
				this.aClass1_Sub1_Sub2_Sub3Array3[local1212] = new Class1_Sub1_Sub2_Sub3(local215, "mod_icons", local1212);
			}
			@Pc(1235) Class1_Sub1_Sub2_Sub2 local1235 = new Class1_Sub1_Sub2_Sub2(local215, "backleft1", 0);
			this.aClass35_10 = new Class35(this.method94(), local1235.anInt642, local1235.anInt643, -707);
			local1235.method389(aBoolean101, 0, 0);
			@Pc(1260) Class1_Sub1_Sub2_Sub2 local1260 = new Class1_Sub1_Sub2_Sub2(local215, "backleft2", 0);
			this.aClass35_11 = new Class35(this.method94(), local1260.anInt642, local1260.anInt643, -707);
			local1260.method389(aBoolean101, 0, 0);
			@Pc(1285) Class1_Sub1_Sub2_Sub2 local1285 = new Class1_Sub1_Sub2_Sub2(local215, "backright1", 0);
			this.aClass35_12 = new Class35(this.method94(), local1285.anInt642, local1285.anInt643, -707);
			local1285.method389(aBoolean101, 0, 0);
			@Pc(1310) Class1_Sub1_Sub2_Sub2 local1310 = new Class1_Sub1_Sub2_Sub2(local215, "backright2", 0);
			this.aClass35_13 = new Class35(this.method94(), local1310.anInt642, local1310.anInt643, -707);
			local1310.method389(aBoolean101, 0, 0);
			@Pc(1335) Class1_Sub1_Sub2_Sub2 local1335 = new Class1_Sub1_Sub2_Sub2(local215, "backtop1", 0);
			this.aClass35_14 = new Class35(this.method94(), local1335.anInt642, local1335.anInt643, -707);
			local1335.method389(aBoolean101, 0, 0);
			@Pc(1360) Class1_Sub1_Sub2_Sub2 local1360 = new Class1_Sub1_Sub2_Sub2(local215, "backvmid1", 0);
			this.aClass35_15 = new Class35(this.method94(), local1360.anInt642, local1360.anInt643, -707);
			local1360.method389(aBoolean101, 0, 0);
			@Pc(1385) Class1_Sub1_Sub2_Sub2 local1385 = new Class1_Sub1_Sub2_Sub2(local215, "backvmid2", 0);
			this.aClass35_16 = new Class35(this.method94(), local1385.anInt642, local1385.anInt643, -707);
			local1385.method389(aBoolean101, 0, 0);
			@Pc(1410) Class1_Sub1_Sub2_Sub2 local1410 = new Class1_Sub1_Sub2_Sub2(local215, "backvmid3", 0);
			this.aClass35_17 = new Class35(this.method94(), local1410.anInt642, local1410.anInt643, -707);
			local1410.method389(aBoolean101, 0, 0);
			@Pc(1435) Class1_Sub1_Sub2_Sub2 local1435 = new Class1_Sub1_Sub2_Sub2(local215, "backhmid2", 0);
			this.aClass35_18 = new Class35(this.method94(), local1435.anInt642, local1435.anInt643, -707);
			local1435.method389(aBoolean101, 0, 0);
			@Pc(1460) int local1460 = (int) (Math.random() * 21.0D) - 10;
			@Pc(1467) int local1467 = (int) (Math.random() * 21.0D) - 10;
			@Pc(1474) int local1474 = (int) (Math.random() * 21.0D) - 10;
			@Pc(1481) int local1481 = (int) (Math.random() * 41.0D) - 20;
			for (@Pc(1483) int local1483 = 0; local1483 < 100; local1483++) {
				if (this.aClass1_Sub1_Sub2_Sub2Array7[local1483] != null) {
					this.aClass1_Sub1_Sub2_Sub2Array7[local1483].method387(local1474 + local1481, local1467 + local1481, local1460 + local1481);
				}
				if (this.aClass1_Sub1_Sub2_Sub3Array2[local1483] != null) {
					this.aClass1_Sub1_Sub2_Sub3Array2[local1483].method417((byte) 3, local1474 + local1481, local1467 + local1481, local1460 + local1481);
				}
			}
			this.method96(83, "Unpacking textures");
			Class1_Sub1_Sub2_Sub1.method347(local227);
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
			Class15.aBoolean167 = aBoolean65;
			if (!aBoolean66) {
				this.method96(90, "Unpacking sounds");
				@Pc(1586) byte[] local1586 = local251.method666("sounds.dat", null);
				@Pc(1592) Class1_Sub1_Sub3 local1592 = new Class1_Sub1_Sub3(local1586, aBoolean64);
				Class5.method78(local1592);
			}
			this.method96(95, "Unpacking interfaces");
			@Pc(1623) Class1_Sub1_Sub2_Sub4[] local1623 = new Class1_Sub1_Sub2_Sub4[] { this.aClass1_Sub1_Sub2_Sub4_1, this.aClass1_Sub1_Sub2_Sub4_2, this.aClass1_Sub1_Sub2_Sub4_3, this.aClass1_Sub1_Sub2_Sub4_4 };
			Class6.method231(local203, anInt368, local1623, local215);
			this.method96(100, "Preparing game engine");
			@Pc(1639) int local1639;
			@Pc(1641) int local1641;
			@Pc(1643) int local1643;
			for (@Pc(1635) int local1635 = 0; local1635 < 33; local1635++) {
				local1639 = 999;
				local1641 = 0;
				for (local1643 = 0; local1643 < 34; local1643++) {
					if (this.aClass1_Sub1_Sub2_Sub3_2.aByteArray7[local1643 + local1635 * this.aClass1_Sub1_Sub2_Sub3_2.anInt667] == 0) {
						if (local1639 == 999) {
							local1639 = local1643;
						}
					} else if (local1639 != 999) {
						local1641 = local1643;
						break;
					}
				}
				this.anIntArray77[local1635] = local1639;
				this.anIntArray41[local1635] = local1641 - local1639;
			}
			@Pc(1701) int local1701;
			for (local1639 = 5; local1639 < 156; local1639++) {
				local1641 = 999;
				local1643 = 0;
				for (local1701 = 25; local1701 < 172; local1701++) {
					if (this.aClass1_Sub1_Sub2_Sub3_2.aByteArray7[local1701 + local1639 * this.aClass1_Sub1_Sub2_Sub3_2.anInt667] == 0 && (local1701 > 34 || local1639 > 34)) {
						if (local1641 == 999) {
							local1641 = local1701;
						}
					} else if (local1641 != 999) {
						local1643 = local1701;
						break;
					}
				}
				this.anIntArray64[local1639 - 5] = local1641 - 25;
				this.anIntArray86[local1639 - 5] = local1643 - local1641;
			}
			Class1_Sub1_Sub2_Sub1.method344(479, 96);
			this.anIntArray56 = Class1_Sub1_Sub2_Sub1.anIntArray180;
			Class1_Sub1_Sub2_Sub1.method344(190, 261);
			this.anIntArray57 = Class1_Sub1_Sub2_Sub1.anIntArray180;
			Class1_Sub1_Sub2_Sub1.method344(512, 334);
			this.anIntArray58 = Class1_Sub1_Sub2_Sub1.anIntArray180;
			@Pc(1785) int[] local1785 = new int[9];
			for (local1643 = 0; local1643 < 9; local1643++) {
				local1701 = local1643 * 32 + 128 + 15;
				@Pc(1803) int local1803 = local1701 * 3 + 600;
				@Pc(1807) int local1807 = Class1_Sub1_Sub2_Sub1.anIntArray178[local1701];
				local1785[local1643] = local1803 * local1807 >> 16;
			}
			Class37.method566(local1785);
			Class42.method594(local239);
			this.aClass11_1 = new Class11(-648, this);
			this.method95(this.aClass11_1, 10);
			Class1_Sub1_Sub1_Sub2.aClient1 = this;
			Class9.aClient2 = this;
			Class13.aClient4 = this;
		} catch (@Pc(1848) Exception local1848) {
			signlink.reporterror("loaderror " + this.aString15 + " " + this.anInt245);
			this.aBoolean72 = true;
		}
	}

	@OriginalMember(owner = "client!client", name = "r", descriptor = "(I)V")
	private void method134(@OriginalArg(0) int arg0) {
		try {
			@Pc(5) boolean local5 = false;
			@Pc(15) int local15;
			for (@Pc(7) int local7 = -1; local7 < this.anInt273; local7++) {
				if (local7 == -1) {
					local15 = this.anInt272;
				} else {
					local15 = this.anIntArray53[local7];
				}
				@Pc(27) Class1_Sub1_Sub1_Sub1_Sub1 local27 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local15];
				if (local27 != null && local27.anInt993 > 0) {
					local27.anInt993--;
					if (local27.anInt993 == 0) {
						local27.aString31 = null;
					}
				}
			}
			for (local15 = 0; local15 < this.anInt242; local15++) {
				@Pc(58) int local58 = this.anIntArray42[local15];
				@Pc(63) Class1_Sub1_Sub1_Sub1_Sub2 local63 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local58];
				if (local63 != null && local63.anInt993 > 0) {
					local63.anInt993--;
					if (local63.anInt993 == 0) {
						local63.aString31 = null;
					}
				}
			}
		} catch (@Pc(87) RuntimeException local87) {
			signlink.reporterror("24731, " + arg0 + ", " + local87.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILclient!d;III)V")
	private void method135(@OriginalArg(0) int arg0, @OriginalArg(1) Class6 arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		try {
			if (arg1.anInt420 == 0 && arg1.anIntArray98 != null && (!arg1.aBoolean104 || this.anInt263 == arg1.anInt418 || this.anInt277 == arg1.anInt418 || this.anInt231 == arg1.anInt418)) {
				@Pc(29) int local29 = Class1_Sub1_Sub2.anInt691;
				@Pc(31) int local31 = Class1_Sub1_Sub2.anInt689;
				@Pc(33) int local33 = Class1_Sub1_Sub2.anInt692;
				@Pc(35) int local35 = Class1_Sub1_Sub2.anInt690;
				Class1_Sub1_Sub2.method436(arg0 + arg1.anInt424, arg2 + arg1.anInt423, arg2, arg0);
				@Pc(55) int local55 = arg1.anIntArray98.length;
				for (@Pc(57) int local57 = 0; local57 < local55; local57++) {
					@Pc(66) int local66 = arg1.anIntArray99[local57] + arg2;
					@Pc(75) int local75 = arg1.anIntArray100[local57] + arg0 - arg3;
					@Pc(82) Class6 local82 = Class6.aClass6Array1[arg1.anIntArray98[local57]];
					@Pc(87) int local87 = local66 + local82.anInt425;
					@Pc(92) int local92 = local75 + local82.anInt426;
					if (local82.anInt422 > 0) {
						this.method109(local82, 125);
					}
					if (local82.anInt420 == 0) {
						if (local82.anInt429 > local82.anInt428 - local82.anInt424) {
							local82.anInt429 = local82.anInt428 - local82.anInt424;
						}
						if (local82.anInt429 < 0) {
							local82.anInt429 = 0;
						}
						this.method135(local92, local82, local87, local82.anInt429);
						if (local82.anInt428 > local82.anInt424) {
							this.method176(local82.anInt424, local92, local82.anInt428, this.aBoolean86, local87 + local82.anInt423, local82.anInt429);
						}
					} else if (local82.anInt420 != 1) {
						@Pc(165) int local165;
						@Pc(169) int local169;
						@Pc(180) int local180;
						@Pc(215) int local215;
						@Pc(222) int local222;
						@Pc(163) int local163;
						@Pc(213) int local213;
						if (local82.anInt420 == 2) {
							local163 = 0;
							for (local165 = 0; local165 < local82.anInt424; local165++) {
								for (local169 = 0; local169 < local82.anInt423; local169++) {
									local180 = local87 + local169 * (local82.anInt431 + 32);
									@Pc(189) int local189 = local92 + local165 * (local82.anInt432 + 32);
									if (local163 < 20) {
										local180 += local82.anIntArray101[local163];
										local189 += local82.anIntArray102[local163];
									}
									if (local82.anIntArray94[local163] > 0) {
										local213 = 0;
										local215 = 0;
										local222 = local82.anIntArray94[local163] - 1;
										if (local180 > Class1_Sub1_Sub2.anInt691 - 32 && local180 < Class1_Sub1_Sub2.anInt692 && local189 > Class1_Sub1_Sub2.anInt689 - 32 && local189 < Class1_Sub1_Sub2.anInt690 || this.anInt390 != 0 && this.anInt389 == local163) {
											@Pc(247) int local247 = 0;
											if (this.anInt289 == 1 && this.anInt290 == local163 && this.anInt291 == local82.anInt418) {
												local247 = 16777215;
											}
											@Pc(271) Class1_Sub1_Sub2_Sub2 local271 = Class15.method367(local222, local82.anIntArray95[local163], local247);
											if (local271 != null) {
												@Pc(350) int local350;
												if (this.anInt390 != 0 && this.anInt389 == local163 && this.anInt388 == local82.anInt418) {
													local213 = super.anInt194 - this.anInt391;
													local215 = super.anInt195 - this.anInt392;
													if (local213 < 5 && local213 > -5) {
														local213 = 0;
													}
													if (local215 < 5 && local215 > -5) {
														local215 = 0;
													}
													if (this.anInt223 < 5) {
														local213 = 0;
														local215 = 0;
													}
													local271.method393(local189 + local215, local180 + local213);
													if (local189 + local215 < Class1_Sub1_Sub2.anInt689 && arg1.anInt429 > 0) {
														local350 = this.anInt323 * (Class1_Sub1_Sub2.anInt689 - local189 - local215) / 3;
														if (local350 > this.anInt323 * 10) {
															local350 = this.anInt323 * 10;
														}
														if (local350 > arg1.anInt429) {
															local350 = arg1.anInt429;
														}
														arg1.anInt429 -= local350;
														this.anInt392 += local350;
													}
													if (local189 + local215 + 32 > Class1_Sub1_Sub2.anInt690 && arg1.anInt429 < arg1.anInt428 - arg1.anInt424) {
														local350 = this.anInt323 * (local189 + local215 + 32 - Class1_Sub1_Sub2.anInt690) / 3;
														if (local350 > this.anInt323 * 10) {
															local350 = this.anInt323 * 10;
														}
														if (local350 > arg1.anInt428 - arg1.anInt424 - arg1.anInt429) {
															local350 = arg1.anInt428 - arg1.anInt424 - arg1.anInt429;
														}
														arg1.anInt429 += local350;
														this.anInt392 -= local350;
													}
												} else if (this.anInt376 != 0 && this.anInt375 == local163 && this.anInt374 == local82.anInt418) {
													local271.method393(local189, local180);
												} else {
													local271.method391(local180, local189);
												}
												if (local271.anInt646 == 33 || local82.anIntArray95[local163] != 1) {
													local350 = local82.anIntArray95[local163];
													this.aClass1_Sub1_Sub2_Sub4_1.method451(local189 + local215 + 10, 0, local180 + local213 + 1, method151(this.aBoolean67, local350));
													this.aClass1_Sub1_Sub2_Sub4_1.method451(local189 + local215 + 9, 16776960, local180 + local213, method151(this.aBoolean67, local350));
												}
											}
										}
									} else if (local82.aClass1_Sub1_Sub2_Sub2Array8 != null && local163 < 20) {
										@Pc(541) Class1_Sub1_Sub2_Sub2 local541 = local82.aClass1_Sub1_Sub2_Sub2Array8[local163];
										if (local541 != null) {
											local541.method391(local180, local189);
										}
									}
									local163++;
								}
							}
						} else if (local82.anInt420 == 3) {
							@Pc(567) boolean local567 = false;
							if (this.anInt231 == local82.anInt418 || this.anInt277 == local82.anInt418 || this.anInt263 == local82.anInt418) {
								local567 = true;
							}
							if (this.method173(local82)) {
								local163 = local82.anInt434;
								if (local567 && local82.anInt436 != 0) {
									local163 = local82.anInt436;
								}
							} else {
								local163 = local82.anInt433;
								if (local567 && local82.anInt435 != 0) {
									local163 = local82.anInt435;
								}
							}
							if (local82.aByte13 == 0) {
								if (local82.aBoolean110) {
									Class1_Sub1_Sub2.method439(local163, local82.anInt424, local82.anInt423, local87, local92, this.aByte7);
								} else {
									Class1_Sub1_Sub2.method440(local82.anInt424, local92, local163, local82.anInt423, local87);
								}
							} else if (local82.aBoolean110) {
								Class1_Sub1_Sub2.method438(local163, local82.anInt424, local82.anInt423, 755, local87, local92, 256 - (local82.aByte13 & 0xFF));
							} else {
								Class1_Sub1_Sub2.method441(local82.anInt423, local82.anInt424, local163, local92, 256 - (local82.aByte13 & 0xFF), local87);
							}
						} else {
							@Pc(686) Class1_Sub1_Sub2_Sub4 local686;
							if (local82.anInt420 == 4) {
								local686 = local82.aClass1_Sub1_Sub2_Sub4_5;
								@Pc(689) String local689 = local82.aString18;
								@Pc(691) boolean local691 = false;
								if (this.anInt231 == local82.anInt418 || this.anInt277 == local82.anInt418 || this.anInt263 == local82.anInt418) {
									local691 = true;
								}
								if (this.method173(local82)) {
									local165 = local82.anInt434;
									if (local691 && local82.anInt436 != 0) {
										local165 = local82.anInt436;
									}
									if (local82.aString19.length() > 0) {
										local689 = local82.aString19;
									}
								} else {
									local165 = local82.anInt433;
									if (local691 && local82.anInt435 != 0) {
										local165 = local82.anInt435;
									}
								}
								if (local82.anInt421 == 6 && this.aBoolean73) {
									local689 = "Please wait...";
									local165 = local82.anInt433;
								}
								if (Class1_Sub1_Sub2.anInt687 == 479) {
									if (local165 == 16776960) {
										local165 = 255;
									}
									if (local165 == 49152) {
										local165 = 16777215;
									}
								}
								local213 = local92 + local686.anInt699;
								while (local689.length() > 0) {
									if (local689.indexOf("%") != -1) {
										label348: while (true) {
											local215 = local689.indexOf("%1");
											if (local215 == -1) {
												while (true) {
													local215 = local689.indexOf("%2");
													if (local215 == -1) {
														while (true) {
															local215 = local689.indexOf("%3");
															if (local215 == -1) {
																while (true) {
																	local215 = local689.indexOf("%4");
																	if (local215 == -1) {
																		while (true) {
																			local215 = local689.indexOf("%5");
																			if (local215 == -1) {
																				break label348;
																			}
																			local689 = local689.substring(0, local215) + this.method203(this.method142(this.aByte8, local82, 4)) + local689.substring(local215 + 2);
																		}
																	}
																	local689 = local689.substring(0, local215) + this.method203(this.method142(this.aByte8, local82, 3)) + local689.substring(local215 + 2);
																}
															}
															local689 = local689.substring(0, local215) + this.method203(this.method142(this.aByte8, local82, 2)) + local689.substring(local215 + 2);
														}
													}
													local689 = local689.substring(0, local215) + this.method203(this.method142(this.aByte8, local82, 1)) + local689.substring(local215 + 2);
												}
											}
											local689 = local689.substring(0, local215) + this.method203(this.method142(this.aByte8, local82, 0)) + local689.substring(local215 + 2);
										}
									}
									local215 = local689.indexOf("\\n");
									@Pc(968) String local968;
									if (local215 == -1) {
										local968 = local689;
										local689 = "";
									} else {
										local968 = local689.substring(0, local215);
										local689 = local689.substring(local215 + 2);
									}
									if (local82.aBoolean111) {
										local686.method448(local87 + local82.anInt423 / 2, local82.aBoolean112, local165, local968, local213);
									} else {
										local686.method455(local165, local87, local82.aBoolean112, local213, local968);
									}
									local213 += local686.anInt699;
								}
							} else if (local82.anInt420 == 5) {
								@Pc(1030) Class1_Sub1_Sub2_Sub2 local1030;
								if (this.method173(local82)) {
									local1030 = local82.aClass1_Sub1_Sub2_Sub2_15;
								} else {
									local1030 = local82.aClass1_Sub1_Sub2_Sub2_14;
								}
								if (local1030 != null) {
									local1030.method391(local87, local92);
								}
							} else if (local82.anInt420 == 6) {
								local163 = Class1_Sub1_Sub2_Sub1.anInt584;
								local165 = Class1_Sub1_Sub2_Sub1.anInt585;
								Class1_Sub1_Sub2_Sub1.anInt584 = local87 + local82.anInt423 / 2;
								Class1_Sub1_Sub2_Sub1.anInt585 = local92 + local82.anInt424 / 2;
								local169 = Class1_Sub1_Sub2_Sub1.anIntArray178[local82.anInt444] * local82.anInt443 >> 16;
								local180 = Class1_Sub1_Sub2_Sub1.anIntArray179[local82.anInt444] * local82.anInt443 >> 16;
								@Pc(1091) boolean local1091 = this.method173(local82);
								if (local1091) {
									local213 = local82.anInt442;
								} else {
									local213 = local82.anInt441;
								}
								@Pc(1111) Class1_Sub1_Sub1_Sub5 local1111;
								if (local213 == -1) {
									local1111 = local82.method233(-1, -1, local1091);
								} else {
									@Pc(1117) Class27 local1117 = Class27.aClass27Array1[local213];
									local1111 = local82.method233(local1117.anIntArray226[local82.anInt416], local1117.anIntArray225[local82.anInt416], local1091);
								}
								if (local1111 != null) {
									local1111.method281(local82.anInt445, 0, local82.anInt444, 0, local169, local180);
								}
								Class1_Sub1_Sub2_Sub1.anInt584 = local163;
								Class1_Sub1_Sub2_Sub1.anInt585 = local165;
							} else if (local82.anInt420 == 7) {
								local686 = local82.aClass1_Sub1_Sub2_Sub4_5;
								local165 = 0;
								for (local169 = 0; local169 < local82.anInt424; local169++) {
									for (local180 = 0; local180 < local82.anInt423; local180++) {
										if (local82.anIntArray94[local165] > 0) {
											@Pc(1181) Class15 local1181 = Class15.method361(local82.anIntArray94[local165] - 1);
											@Pc(1184) String local1184 = local1181.aString25;
											if (local1181.aBoolean168 || local82.anIntArray95[local165] != 1) {
												local1184 = local1184 + " x" + method145((byte) 5, local82.anIntArray95[local165]);
											}
											local215 = local87 + local180 * (local82.anInt431 + 115);
											local222 = local92 + local169 * (local82.anInt432 + 12);
											if (local82.aBoolean111) {
												local686.method448(local215 + local82.anInt423 / 2, local82.aBoolean112, local82.anInt433, local1184, local222);
											} else {
												local686.method455(local82.anInt433, local215, local82.aBoolean112, local222, local1184);
											}
										}
										local165++;
									}
								}
							}
						}
					}
				}
				Class1_Sub1_Sub2.method436(local35, local33, local29, local31);
			}
		} catch (@Pc(1280) RuntimeException local1280) {
			signlink.reporterror("11616, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + -28 + ", " + arg3 + ", " + local1280.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "s", descriptor = "(I)V")
	private void method136(@OriginalArg(0) int arg0) {
		try {
			anInt393++;
			this.anInt248 += arg0;
			if (anInt393 > 192) {
				anInt393 = 0;
				this.aClass1_Sub1_Sub3_2.method469(57, 837);
				this.aClass1_Sub1_Sub3_2.method470(232);
			}
			while (true) {
				@Pc(29) int local29;
				do {
					while (true) {
						local29 = this.method88();
						if (local29 == -1) {
							return;
						}
						if (this.anInt220 != -1 && this.anInt220 == this.anInt275) {
							if (local29 == 8 && this.aString17.length() > 0) {
								this.aString17 = this.aString17.substring(0, this.aString17.length() - 1);
							}
							break;
						}
						@Pc(210) int local210;
						if (this.aBoolean77) {
							if (local29 >= 32 && local29 <= 122 && this.aString13.length() < 80) {
								this.aString13 = this.aString13 + (char) local29;
								this.aBoolean99 = true;
							}
							if (local29 == 8 && this.aString13.length() > 0) {
								this.aString13 = this.aString13.substring(0, this.aString13.length() - 1);
								this.aBoolean99 = true;
							}
							if (local29 == 13 || local29 == 10) {
								this.aBoolean77 = false;
								this.aBoolean99 = true;
								@Pc(169) long local169;
								if (this.anInt356 == 1) {
									local169 = Class48.method667(this.aString13);
									this.method217(local169);
								}
								if (this.anInt356 == 2 && this.anInt232 > 0) {
									local169 = Class48.method667(this.aString13);
									this.method189(this.aBoolean69, local169);
								}
								if (this.anInt356 == 3 && this.aString13.length() > 0) {
									this.aClass1_Sub1_Sub3_2.method469(236, 837);
									this.aClass1_Sub1_Sub3_2.method470(0);
									local210 = this.aClass1_Sub1_Sub3_2.anInt733;
									this.aClass1_Sub1_Sub3_2.method476(this.aByte5, this.aLong18);
									Class49.method684(this.aClass1_Sub1_Sub3_2, this.aString13);
									this.aClass1_Sub1_Sub3_2.method479(this.aClass1_Sub1_Sub3_2.anInt733 - local210);
									this.aString13 = Class49.method685(this.aString13);
									this.aString13 = Class42.method604(this.aString13);
									this.method108(Class48.method671(Class48.method668(this.aLong18)), this.aString13, 6);
									if (this.anInt353 == 2) {
										this.anInt353 = 1;
										this.aBoolean83 = true;
										this.aClass1_Sub1_Sub3_2.method469(158, 837);
										this.aClass1_Sub1_Sub3_2.method470(this.anInt210);
										this.aClass1_Sub1_Sub3_2.method470(this.anInt353);
										this.aClass1_Sub1_Sub3_2.method470(this.anInt293);
									}
								}
								if (this.anInt356 == 4 && this.anInt361 < 100) {
									local169 = Class48.method667(this.aString13);
									this.method216(local169);
								}
								if (this.anInt356 == 5 && this.anInt361 > 0) {
									local169 = Class48.method667(this.aString13);
									this.method127(local169);
								}
							}
						} else if (this.aBoolean50) {
							if (local29 >= 48 && local29 <= 57 && this.aString14.length() < 10) {
								this.aString14 = this.aString14 + (char) local29;
								this.aBoolean99 = true;
							}
							if (local29 == 8 && this.aString14.length() > 0) {
								this.aString14 = this.aString14.substring(0, this.aString14.length() - 1);
								this.aBoolean99 = true;
							}
							if (local29 == 13 || local29 == 10) {
								if (this.aString14.length() > 0) {
									local210 = 0;
									try {
										local210 = Integer.parseInt(this.aString14);
									} catch (@Pc(387) Exception local387) {
									}
									this.aClass1_Sub1_Sub3_2.method469(12, 837);
									this.aClass1_Sub1_Sub3_2.method474(local210);
								}
								this.aBoolean50 = false;
								this.aBoolean99 = true;
							}
						} else if (this.anInt209 == -1) {
							if (local29 >= 32 && local29 <= 122 && this.aString8.length() < 80) {
								this.aString8 = this.aString8 + (char) local29;
								this.aBoolean99 = true;
							}
							if (local29 == 8 && this.aString8.length() > 0) {
								this.aString8 = this.aString8.substring(0, this.aString8.length() - 1);
								this.aBoolean99 = true;
							}
							if ((local29 == 13 || local29 == 10) && this.aString8.length() > 0) {
								if (this.anInt285 == 2) {
									if (this.aString8.equals("::clientdrop")) {
										this.method120();
									}
									if (this.aString8.equals("::lag")) {
										this.method100();
									}
									if (this.aString8.equals("::prefetchmusic")) {
										for (local210 = 0; local210 < this.aClass44_Sub1_1.method638(2); local210++) {
											this.aClass44_Sub1_1.method648(349, (byte) 1, 2, local210);
										}
									}
									if (this.aString8.equals("::fpson")) {
										aBoolean96 = true;
									}
									if (this.aString8.equals("::fpsoff")) {
										aBoolean96 = false;
									}
								}
								if (this.aString8.startsWith("::")) {
									this.aClass1_Sub1_Sub3_2.method469(95, 837);
									this.aClass1_Sub1_Sub3_2.method470(this.aString8.length() - 1);
									this.aClass1_Sub1_Sub3_2.method477(this.aString8.substring(2));
								} else {
									@Pc(554) String local554 = this.aString8.toLowerCase();
									@Pc(556) byte local556 = 0;
									if (local554.startsWith("yellow:")) {
										local556 = 0;
										this.aString8 = this.aString8.substring(7);
									} else if (local554.startsWith("red:")) {
										local556 = 1;
										this.aString8 = this.aString8.substring(4);
									} else if (local554.startsWith("green:")) {
										local556 = 2;
										this.aString8 = this.aString8.substring(6);
									} else if (local554.startsWith("cyan:")) {
										local556 = 3;
										this.aString8 = this.aString8.substring(5);
									} else if (local554.startsWith("purple:")) {
										local556 = 4;
										this.aString8 = this.aString8.substring(7);
									} else if (local554.startsWith("white:")) {
										local556 = 5;
										this.aString8 = this.aString8.substring(6);
									} else if (local554.startsWith("flash1:")) {
										local556 = 6;
										this.aString8 = this.aString8.substring(7);
									} else if (local554.startsWith("flash2:")) {
										local556 = 7;
										this.aString8 = this.aString8.substring(7);
									} else if (local554.startsWith("flash3:")) {
										local556 = 8;
										this.aString8 = this.aString8.substring(7);
									} else if (local554.startsWith("glow1:")) {
										local556 = 9;
										this.aString8 = this.aString8.substring(6);
									} else if (local554.startsWith("glow2:")) {
										local556 = 10;
										this.aString8 = this.aString8.substring(6);
									} else if (local554.startsWith("glow3:")) {
										local556 = 11;
										this.aString8 = this.aString8.substring(6);
									}
									local554 = this.aString8.toLowerCase();
									@Pc(728) byte local728 = 0;
									if (local554.startsWith("wave:")) {
										local728 = 1;
										this.aString8 = this.aString8.substring(5);
									} else if (local554.startsWith("wave2:")) {
										local728 = 2;
										this.aString8 = this.aString8.substring(6);
									} else if (local554.startsWith("shake:")) {
										local728 = 3;
										this.aString8 = this.aString8.substring(6);
									} else if (local554.startsWith("scroll:")) {
										local728 = 4;
										this.aString8 = this.aString8.substring(7);
									} else if (local554.startsWith("slide:")) {
										local728 = 5;
										this.aString8 = this.aString8.substring(6);
									}
									this.aClass1_Sub1_Sub3_2.method469(29, 837);
									this.aClass1_Sub1_Sub3_2.method470(0);
									@Pc(809) int local809 = this.aClass1_Sub1_Sub3_2.anInt733;
									this.aClass1_Sub1_Sub3_2.method470(local556);
									this.aClass1_Sub1_Sub3_2.method470(local728);
									Class49.method684(this.aClass1_Sub1_Sub3_2, this.aString8);
									this.aClass1_Sub1_Sub3_2.method479(this.aClass1_Sub1_Sub3_2.anInt733 - local809);
									this.aString8 = Class49.method685(this.aString8);
									this.aString8 = Class42.method604(this.aString8);
									aClass1_Sub1_Sub1_Sub1_Sub1_1.aString31 = this.aString8;
									aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt994 = local556;
									aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt995 = local728;
									aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt993 = 150;
									if (this.anInt285 == 2) {
										this.method108("@cr2@" + aClass1_Sub1_Sub1_Sub1_Sub1_1.aString3, aClass1_Sub1_Sub1_Sub1_Sub1_1.aString31, 2);
									} else if (this.anInt285 == 1) {
										this.method108("@cr1@" + aClass1_Sub1_Sub1_Sub1_Sub1_1.aString3, aClass1_Sub1_Sub1_Sub1_Sub1_1.aString31, 2);
									} else {
										this.method108(aClass1_Sub1_Sub1_Sub1_Sub1_1.aString3, aClass1_Sub1_Sub1_Sub1_Sub1_1.aString31, 2);
									}
									if (this.anInt210 == 2) {
										this.anInt210 = 3;
										this.aBoolean83 = true;
										this.aClass1_Sub1_Sub3_2.method469(158, 837);
										this.aClass1_Sub1_Sub3_2.method470(this.anInt210);
										this.aClass1_Sub1_Sub3_2.method470(this.anInt353);
										this.aClass1_Sub1_Sub3_2.method470(this.anInt293);
									}
								}
								this.aString8 = "";
								this.aBoolean99 = true;
							}
						}
					}
				} while ((local29 < 97 || local29 > 122) && (local29 < 65 || local29 > 90) && (local29 < 48 || local29 > 57) && local29 != 32);
				if (this.aString17.length() < 12) {
					this.aString17 = this.aString17 + (char) local29;
				}
			}
		} catch (@Pc(945) RuntimeException local945) {
			signlink.reporterror("62423, " + arg0 + ", " + local945.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!lb;ZI)V")
	private void method137(@OriginalArg(0) Class1_Sub1_Sub3 arg0, @OriginalArg(2) int arg1) {
		try {
			@Pc(6) int local6 = arg0.method491(8);
			@Pc(12) int local12;
			if (local6 < this.anInt273) {
				for (local12 = local6; local12 < this.anInt273; local12++) {
					this.anIntArray66[this.anInt338++] = this.anIntArray53[local12];
				}
			}
			if (local6 > this.anInt273) {
				signlink.reporterror(this.aString10 + " Too many players");
				throw new RuntimeException("eek");
			}
			this.anInt273 = 0;
			for (local12 = 0; local12 < local6; local12++) {
				@Pc(64) int local64 = this.anIntArray53[local12];
				@Pc(69) Class1_Sub1_Sub1_Sub1_Sub1 local69 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local64];
				@Pc(74) int local74 = arg0.method491(1);
				if (local74 == 0) {
					this.anIntArray53[this.anInt273++] = local64;
					local69.anInt1022 = anInt236;
				} else {
					@Pc(97) int local97 = arg0.method491(2);
					if (local97 == 0) {
						this.anIntArray53[this.anInt273++] = local64;
						local69.anInt1022 = anInt236;
						this.anIntArray54[this.anInt274++] = local64;
					} else {
						@Pc(148) int local148;
						@Pc(158) int local158;
						if (local97 == 1) {
							this.anIntArray53[this.anInt273++] = local64;
							local69.anInt1022 = anInt236;
							local148 = arg0.method491(3);
							local69.method678(local148, false);
							local158 = arg0.method491(1);
							if (local158 == 1) {
								this.anIntArray54[this.anInt274++] = local64;
							}
						} else if (local97 == 2) {
							this.anIntArray53[this.anInt273++] = local64;
							local69.anInt1022 = anInt236;
							local148 = arg0.method491(3);
							local69.method678(local148, true);
							local158 = arg0.method491(3);
							local69.method678(local158, true);
							@Pc(216) int local216 = arg0.method491(1);
							if (local216 == 1) {
								this.anIntArray54[this.anInt274++] = local64;
							}
						} else if (local97 == 3) {
							this.anIntArray66[this.anInt338++] = local64;
						}
					}
				}
			}
			this.aBoolean48 &= true;
		} catch (@Pc(259) RuntimeException local259) {
			signlink.reporterror("86916, " + arg0 + ", " + true + ", " + arg1 + ", " + local259.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "g", descriptor = "(Z)V")
	private void method138(@OriginalArg(0) boolean arg0) {
		try {
			this.anInt243 = 0;
			@Pc(8) int local8;
			if (arg0) {
				for (local8 = 1; local8 > 0; local8++) {
				}
			}
			@Pc(100) int local100;
			@Pc(80) int local80;
			for (local8 = -1; local8 < this.anInt273 + this.anInt242; local8++) {
				@Pc(22) Class1_Sub1_Sub1_Sub1 local22;
				if (local8 == -1) {
					local22 = aClass1_Sub1_Sub1_Sub1_Sub1_1;
				} else if (local8 < this.anInt273) {
					local22 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[this.anIntArray53[local8]];
				} else {
					local22 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[this.anIntArray42[local8 - this.anInt273]];
				}
				if (local22 != null && local22.method680(this.aBoolean93)) {
					@Pc(64) Class13 local64;
					if (local22 instanceof Class1_Sub1_Sub1_Sub1_Sub2) {
						local64 = ((Class1_Sub1_Sub1_Sub1_Sub2) local22).aClass13_2;
						if (local64.anIntArray174 != null) {
							local64 = local64.method327();
						}
						if (local64 == null) {
							continue;
						}
					}
					if (local8 >= this.anInt273) {
						local64 = ((Class1_Sub1_Sub1_Sub1_Sub2) local22).aClass13_2;
						if (local64.anInt560 >= 0 && local64.anInt560 < this.aClass1_Sub1_Sub2_Sub2Array5.length) {
							this.method206(local22.anInt1023 + 15, local22);
							if (this.anInt287 > -1) {
								this.aClass1_Sub1_Sub2_Sub2Array5[local64.anInt560].method391(this.anInt287 - 12, this.anInt288 - 30);
							}
						}
						if (this.anInt326 == 1 && this.anInt211 == this.anIntArray42[local8 - this.anInt273] && anInt236 % 20 < 10) {
							this.method206(local22.anInt1023 + 15, local22);
							if (this.anInt287 > -1) {
								this.aClass1_Sub1_Sub2_Sub2Array5[2].method391(this.anInt287 - 12, this.anInt288 - 28);
							}
						}
					} else {
						local80 = 30;
						@Pc(83) Class1_Sub1_Sub1_Sub1_Sub1 local83 = (Class1_Sub1_Sub1_Sub1_Sub1) local22;
						if (local83.anInt127 != 0) {
							this.method206(local22.anInt1023 + 15, local22);
							if (this.anInt287 > -1) {
								for (local100 = 0; local100 < 8; local100++) {
									if ((local83.anInt127 & 0x1 << local100) != 0) {
										this.aClass1_Sub1_Sub2_Sub2Array5[local100].method391(this.anInt287 - 12, this.anInt288 - local80);
										local80 -= 25;
									}
								}
							}
						}
						if (local8 >= 0 && this.anInt326 == 10 && this.anInt410 == this.anIntArray53[local8]) {
							this.method206(local22.anInt1023 + 15, local22);
							if (this.anInt287 > -1) {
								this.aClass1_Sub1_Sub2_Sub2Array5[7].method391(this.anInt287 - 12, this.anInt288 - local80);
							}
						}
					}
					if (local22.aString31 != null && (local8 >= this.anInt273 || this.anInt210 == 0 || this.anInt210 == 3 || this.anInt210 == 1 && this.method185(this.anInt325, ((Class1_Sub1_Sub1_Sub1_Sub1) local22).aString3))) {
						this.method206(local22.anInt1023, local22);
						if (this.anInt287 > -1 && this.anInt243 < this.anInt244) {
							this.anIntArray46[this.anInt243] = this.aClass1_Sub1_Sub2_Sub4_3.method450(local22.aString31) / 2;
							this.anIntArray45[this.anInt243] = this.aClass1_Sub1_Sub2_Sub4_3.anInt699;
							this.anIntArray43[this.anInt243] = this.anInt287;
							this.anIntArray44[this.anInt243] = this.anInt288;
							this.anIntArray47[this.anInt243] = local22.anInt994;
							this.anIntArray48[this.anInt243] = local22.anInt995;
							this.anIntArray49[this.anInt243] = local22.anInt993;
							this.aStringArray4[this.anInt243++] = local22.aString31;
							if (this.anInt234 == 0 && local22.anInt995 >= 1 && local22.anInt995 <= 3) {
								this.anIntArray45[this.anInt243] += 10;
								this.anIntArray44[this.anInt243] += 5;
							}
							if (this.anInt234 == 0 && local22.anInt995 == 4) {
								this.anIntArray46[this.anInt243] = 60;
							}
							if (this.anInt234 == 0 && local22.anInt995 == 5) {
								this.anIntArray45[this.anInt243] += 5;
							}
						}
					}
					if (local22.anInt996 > anInt236) {
						this.method206(local22.anInt1023 + 15, local22);
						if (this.anInt287 > -1) {
							local80 = local22.anInt997 * 30 / local22.anInt998;
							if (local80 > 30) {
								local80 = 30;
							}
							Class1_Sub1_Sub2.method439(65280, 5, local80, this.anInt287 - 15, this.anInt288 - 3, this.aByte7);
							Class1_Sub1_Sub2.method439(16711680, 5, 30 - local80, this.anInt287 - 15 + local80, this.anInt288 - 3, this.aByte7);
						}
					}
					for (local80 = 0; local80 < 4; local80++) {
						if (local22.anIntArray271[local80] > anInt236) {
							this.method206(local22.anInt1023 / 2, local22);
							if (this.anInt287 > -1) {
								if (local80 == 1) {
									this.anInt288 -= 20;
								}
								if (local80 == 2) {
									this.anInt287 -= 15;
									this.anInt288 -= 10;
								}
								if (local80 == 3) {
									this.anInt287 += 15;
									this.anInt288 -= 10;
								}
								this.aClass1_Sub1_Sub2_Sub2Array6[local22.anIntArray270[local80]].method391(this.anInt287 - 12, this.anInt288 - 12);
								this.aClass1_Sub1_Sub2_Sub4_1.method447(this.anInt287, 0, String.valueOf(local22.anIntArray269[local80]), this.anInt288 + 4);
								this.aClass1_Sub1_Sub2_Sub4_1.method447(this.anInt287 - 1, 16777215, String.valueOf(local22.anIntArray269[local80]), this.anInt288 + 3);
							}
						}
					}
				}
			}
			for (@Pc(608) int local608 = 0; local608 < this.anInt243; local608++) {
				local80 = this.anIntArray43[local608];
				@Pc(620) int local620 = this.anIntArray44[local608];
				local100 = this.anIntArray46[local608];
				@Pc(630) int local630 = this.anIntArray45[local608];
				@Pc(632) boolean local632 = true;
				while (local632) {
					local632 = false;
					for (@Pc(638) int local638 = 0; local638 < local608; local638++) {
						if (local620 + 2 > this.anIntArray44[local638] - this.anIntArray45[local638] && local620 - local630 < this.anIntArray44[local638] + 2 && local80 - local100 < this.anIntArray43[local638] + this.anIntArray46[local638] && local80 + local100 > this.anIntArray43[local638] - this.anIntArray46[local638] && this.anIntArray44[local638] - this.anIntArray45[local638] < local620) {
							local620 = this.anIntArray44[local638] - this.anIntArray45[local638];
							local632 = true;
						}
					}
				}
				this.anInt287 = this.anIntArray43[local608];
				this.anInt288 = this.anIntArray44[local608] = local620;
				@Pc(737) String local737 = this.aStringArray4[local608];
				if (this.anInt234 == 0) {
					@Pc(742) int local742 = 16776960;
					if (this.anIntArray47[local608] < 6) {
						local742 = this.anIntArray82[this.anIntArray47[local608]];
					}
					if (this.anIntArray47[local608] == 6) {
						local742 = this.anInt405 % 20 < 10 ? 16711680 : 16776960;
					}
					if (this.anIntArray47[local608] == 7) {
						local742 = this.anInt405 % 20 < 10 ? 255 : 65535;
					}
					if (this.anIntArray47[local608] == 8) {
						local742 = this.anInt405 % 20 < 10 ? 45056 : 8454016;
					}
					@Pc(817) int local817;
					if (this.anIntArray47[local608] == 9) {
						local817 = 150 - this.anIntArray49[local608];
						if (local817 < 50) {
							local742 = local817 * 1280 + 16711680;
						} else if (local817 < 100) {
							local742 = 16776960 - (local817 - 50) * 327680;
						} else if (local817 < 150) {
							local742 = (local817 - 100) * 5 + 65280;
						}
					}
					if (this.anIntArray47[local608] == 10) {
						local817 = 150 - this.anIntArray49[local608];
						if (local817 < 50) {
							local742 = local817 * 5 + 16711680;
						} else if (local817 < 100) {
							local742 = 16711935 - (local817 - 50) * 327680;
						} else if (local817 < 150) {
							local742 = (local817 - 100) * 327680 + 255 - (local817 - 100) * 5;
						}
					}
					if (this.anIntArray47[local608] == 11) {
						local817 = 150 - this.anIntArray49[local608];
						if (local817 < 50) {
							local742 = 16777215 - local817 * 327685;
						} else if (local817 < 100) {
							local742 = (local817 - 50) * 327685 + 65280;
						} else if (local817 < 150) {
							local742 = 16777215 - (local817 - 100) * 327680;
						}
					}
					if (this.anIntArray48[local608] == 0) {
						this.aClass1_Sub1_Sub2_Sub4_3.method447(this.anInt287, 0, local737, this.anInt288 + 1);
						this.aClass1_Sub1_Sub2_Sub4_3.method447(this.anInt287, local742, local737, this.anInt288);
					}
					if (this.anIntArray48[local608] == 1) {
						this.aClass1_Sub1_Sub2_Sub4_3.method452(this.anInt405, 0, this.anInt287, this.anInt288 + 1, local737);
						this.aClass1_Sub1_Sub2_Sub4_3.method452(this.anInt405, local742, this.anInt287, this.anInt288, local737);
					}
					if (this.anIntArray48[local608] == 2) {
						this.aClass1_Sub1_Sub2_Sub4_3.method453(this.anInt288 + 1, local737, this.anInt287, this.anInt405, 0);
						this.aClass1_Sub1_Sub2_Sub4_3.method453(this.anInt288, local737, this.anInt287, this.anInt405, local742);
					}
					if (this.anIntArray48[local608] == 3) {
						this.aClass1_Sub1_Sub2_Sub4_3.method454(150 - this.anIntArray49[local608], this.anInt405, local737, 0, this.anInt288 + 1, this.anInt287);
						this.aClass1_Sub1_Sub2_Sub4_3.method454(150 - this.anIntArray49[local608], this.anInt405, local737, local742, this.anInt288, this.anInt287);
					}
					@Pc(1114) int local1114;
					if (this.anIntArray48[local608] == 4) {
						local817 = this.aClass1_Sub1_Sub2_Sub4_3.method450(local737);
						local1114 = (150 - this.anIntArray49[local608]) * (local817 + 100) / 150;
						Class1_Sub1_Sub2.method436(334, this.anInt287 + 50, this.anInt287 - 50, 0);
						this.aClass1_Sub1_Sub2_Sub4_3.method451(this.anInt288 + 1, 0, this.anInt287 + 50 - local1114, local737);
						this.aClass1_Sub1_Sub2_Sub4_3.method451(this.anInt288, local742, this.anInt287 + 50 - local1114, local737);
						Class1_Sub1_Sub2.method435((byte) 3);
					}
					if (this.anIntArray48[local608] == 5) {
						local817 = 150 - this.anIntArray49[local608];
						local1114 = 0;
						if (local817 < 25) {
							local1114 = local817 - 25;
						} else if (local817 > 125) {
							local1114 = local817 - 125;
						}
						Class1_Sub1_Sub2.method436(this.anInt288 + 5, 512, 0, this.anInt288 - this.aClass1_Sub1_Sub2_Sub4_3.anInt699 - 1);
						this.aClass1_Sub1_Sub2_Sub4_3.method447(this.anInt287, 0, local737, this.anInt288 + local1114 + 1);
						this.aClass1_Sub1_Sub2_Sub4_3.method447(this.anInt287, local742, local737, this.anInt288 + local1114);
						Class1_Sub1_Sub2.method435((byte) 3);
					}
				} else {
					this.aClass1_Sub1_Sub2_Sub4_3.method447(this.anInt287, 0, local737, this.anInt288 + 1);
					this.aClass1_Sub1_Sub2_Sub4_3.method447(this.anInt287, 16776960, local737, this.anInt288);
				}
			}
		} catch (@Pc(1264) RuntimeException local1264) {
			signlink.reporterror("57555, " + arg0 + ", " + local1264.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "t", descriptor = "(I)V")
	private void method139() {
		try {
			@Pc(7) byte[] local7 = this.aClass47_1.method666("title.dat", null);
			@Pc(13) Class1_Sub1_Sub2_Sub2 local13 = new Class1_Sub1_Sub2_Sub2(local7, this);
			this.aClass35_22.method524();
			local13.method389(aBoolean101, 0, 0);
			this.aClass35_23.method524();
			local13.method389(aBoolean101, -637, 0);
			this.aClass35_19.method524();
			local13.method389(aBoolean101, -128, 0);
			this.aClass35_20.method524();
			local13.method389(aBoolean101, -202, -371);
			this.aClass35_21.method524();
			local13.method389(aBoolean101, -202, -171);
			this.aClass35_24.method524();
			local13.method389(aBoolean101, 0, -265);
			this.aClass35_25.method524();
			local13.method389(aBoolean101, -562, -265);
			this.aClass35_26.method524();
			local13.method389(aBoolean101, -128, -171);
			this.aClass35_27.method524();
			local13.method389(aBoolean101, -562, -171);
			@Pc(98) int[] local98 = new int[local13.anInt642];
			for (@Pc(100) int local100 = 0; local100 < local13.anInt643; local100++) {
				for (@Pc(104) int local104 = 0; local104 < local13.anInt642; local104++) {
					local98[local104] = local13.anIntArray208[local13.anInt642 + local13.anInt642 * local100 - local104 - 1];
				}
				for (@Pc(130) int local130 = 0; local130 < local13.anInt642; local130++) {
					local13.anIntArray208[local130 + local13.anInt642 * local100] = local98[local130];
				}
			}
			this.aClass35_22.method524();
			local13.method389(aBoolean101, 382, 0);
			this.aClass35_23.method524();
			local13.method389(aBoolean101, -255, 0);
			this.aClass35_19.method524();
			local13.method389(aBoolean101, 254, 0);
			this.aClass35_20.method524();
			local13.method389(aBoolean101, 180, -371);
			this.aClass35_21.method524();
			local13.method389(aBoolean101, 180, -171);
			this.aClass35_24.method524();
			local13.method389(aBoolean101, 382, -265);
			this.aClass35_25.method524();
			local13.method389(aBoolean101, -180, -265);
			this.aClass35_26.method524();
			local13.method389(aBoolean101, 254, -171);
			this.aClass35_27.method524();
			local13.method389(aBoolean101, -180, -171);
			local13 = new Class1_Sub1_Sub2_Sub2(this.aClass47_1, "logo", 0);
			this.aClass35_19.method524();
			local13.method391(382 - local13.anInt642 / 2 - 128, 18);
			System.gc();
		} catch (@Pc(276) RuntimeException local276) {
			signlink.reporterror("94477, " + 191 + ", " + local276.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IBLclient!lb;)V")
	private void method140(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub1_Sub3 arg1) {
		try {
			this.anInt338 = 0;
			this.anInt274 = 0;
			this.method205(arg1, arg0);
			this.method137(arg1, arg0);
			this.method196(arg0, arg1);
			this.method209(arg0, arg1);
			@Pc(40) int local40;
			for (@Pc(33) int local33 = 0; local33 < this.anInt338; local33++) {
				local40 = this.anIntArray66[local33];
				if (this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local40].anInt1022 != anInt236) {
					this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local40] = null;
				}
			}
			if (arg1.anInt733 != arg0) {
				signlink.reporterror("Error packet size mismatch in getplayer pos:" + arg1.anInt733 + " psize:" + arg0);
				throw new RuntimeException("eek");
			}
			for (local40 = 0; local40 < this.anInt273; local40++) {
				if (this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[this.anIntArray53[local40]] == null) {
					signlink.reporterror(this.aString10 + " null entry in pl list - pos:" + local40 + " size:" + this.anInt273);
					throw new RuntimeException("eek");
				}
			}
		} catch (@Pc(120) RuntimeException local120) {
			signlink.reporterror("95532, " + arg0 + ", " + -14 + ", " + arg1 + ", " + local120.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIIIILclient!d;ZI)V")
	private void method141(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class6 arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8) {
		try {
			if (this.aBoolean57) {
				this.anInt278 = 32;
			} else {
				this.anInt278 = 0;
			}
			this.aBoolean57 = false;
			this.anInt248 += arg5;
			if (arg3 >= arg8 && arg3 < arg8 + 16 && arg2 >= arg1 && arg2 < arg1 + 16) {
				arg6.anInt429 -= this.anInt394 * 4;
				if (arg7) {
					this.aBoolean92 = true;
					return;
				}
			} else if (arg3 >= arg8 && arg3 < arg8 + 16 && arg2 >= arg1 + arg4 - 16 && arg2 < arg1 + arg4) {
				arg6.anInt429 += this.anInt394 * 4;
				if (arg7) {
					this.aBoolean92 = true;
					return;
				}
			} else if (arg3 >= arg8 - this.anInt278 && arg3 < arg8 + this.anInt278 + 16 && arg2 >= arg1 + 16 && arg2 < arg1 + arg4 - 16 && this.anInt394 > 0) {
				@Pc(122) int local122 = (arg4 - 32) * arg4 / arg0;
				if (local122 < 8) {
					local122 = 8;
				}
				@Pc(137) int local137 = arg2 - arg1 - local122 / 2 - 16;
				@Pc(143) int local143 = arg4 - local122 - 32;
				arg6.anInt429 = (arg0 - arg4) * local137 / local143;
				if (arg7) {
					this.aBoolean92 = true;
				}
				this.aBoolean57 = true;
			} else {
				return;
			}
		} catch (@Pc(162) RuntimeException local162) {
			signlink.reporterror("41843, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + local162.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(BLclient!d;I)I")
	private int method142(@OriginalArg(0) byte arg0, @OriginalArg(1) Class6 arg1, @OriginalArg(2) int arg2) {
		try {
			if (arg0 == 1) {
				@Pc(6) boolean local6 = false;
			} else {
				this.anInt378 = 448;
			}
			if (arg1.anIntArrayArray7 == null || arg2 >= arg1.anIntArrayArray7.length) {
				return -2;
			}
			try {
				@Pc(26) int[] local26 = arg1.anIntArrayArray7[arg2];
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
						local39 = this.anIntArray74[local26[local30++]];
					}
					if (local37 == 2) {
						local39 = this.anIntArray93[local26[local30++]];
					}
					if (local37 == 3) {
						local39 = this.anIntArray52[local26[local30++]];
					}
					@Pc(88) Class6 local88;
					@Pc(93) int local93;
					@Pc(106) int local106;
					if (local37 == 4) {
						local88 = Class6.aClass6Array1[local26[local30++]];
						local93 = local26[local30++];
						if (local93 >= 0 && local93 < Class15.anInt591 && (!Class15.method361(local93).aBoolean169 || aBoolean65)) {
							for (local106 = 0; local106 < local88.anIntArray94.length; local106++) {
								if (local88.anIntArray94[local106] == local93 + 1) {
									local39 += local88.anIntArray95[local106];
								}
							}
						}
					}
					if (local37 == 5) {
						local39 = this.anIntArray73[local26[local30++]];
					}
					if (local37 == 6) {
						local39 = anIntArray76[this.anIntArray93[local26[local30++]] - 1];
					}
					if (local37 == 7) {
						local39 = this.anIntArray73[local26[local30++]] * 100 / 46875;
					}
					if (local37 == 8) {
						local39 = aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt128;
					}
					@Pc(181) int local181;
					if (local37 == 9) {
						for (local181 = 0; local181 < Class30.anInt802; local181++) {
							if (Class30.aBooleanArray9[local181]) {
								local39 += this.anIntArray93[local181];
							}
						}
					}
					if (local37 == 10) {
						local88 = Class6.aClass6Array1[local26[local30++]];
						local93 = local26[local30++] + 1;
						if (local93 >= 0 && local93 < Class15.anInt591 && (!Class15.method361(local93).aBoolean169 || aBoolean65)) {
							for (local106 = 0; local106 < local88.anIntArray94.length; local106++) {
								if (local88.anIntArray94[local106] == local93) {
									local39 = 999999999;
									break;
								}
							}
						}
					}
					if (local37 == 11) {
						local39 = this.anInt240;
					}
					if (local37 == 12) {
						local39 = this.anInt372;
					}
					if (local37 == 13) {
						local181 = this.anIntArray73[local26[local30++]];
						local93 = local26[local30++];
						local39 = (local181 & 0x1 << local93) == 0 ? 0 : 1;
					}
					if (local37 == 14) {
						local181 = local26[local30++];
						@Pc(296) Class36 local296 = Class36.aClass36Array1[local181];
						local106 = local296.anInt834;
						@Pc(302) int local302 = local296.anInt835;
						@Pc(305) int local305 = local296.anInt836;
						@Pc(311) int local311 = anIntArray88[local305 - local302];
						local39 = this.anIntArray73[local106] >> local302 & local311;
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
						local39 = (aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt982 >> 7) + this.anInt213;
					}
					if (local37 == 19) {
						local39 = (aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt983 >> 7) + this.anInt214;
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
			signlink.reporterror("77588, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local407.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIIIIIZII)V")
	private void method143(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		try {
			@Pc(1) Class1_Sub2 local1 = null;
			for (@Pc(6) Class1_Sub2 local6 = (Class1_Sub2) this.aClass29_3.method511(); local6 != null; local6 = (Class1_Sub2) this.aClass29_3.method513()) {
				if (local6.anInt771 == arg4 && local6.anInt773 == arg3 && local6.anInt774 == arg2 && local6.anInt772 == arg0) {
					local1 = local6;
					break;
				}
			}
			if (local1 == null) {
				local1 = new Class1_Sub2();
				local1.anInt771 = arg4;
				local1.anInt772 = arg0;
				local1.anInt773 = arg3;
				local1.anInt774 = arg2;
				this.method121(this.anInt239, local1);
				this.aClass29_3.method508(local1);
			}
			local1.anInt778 = arg5;
			local1.anInt780 = arg1;
			local1.anInt779 = arg7;
			local1.anInt781 = arg6;
			local1.anInt782 = arg8;
		} catch (@Pc(84) RuntimeException local84) {
			signlink.reporterror("39718, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + true + ", " + arg7 + ", " + arg8 + ", " + local84.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(B)V")
	@Override
	protected void method93(@OriginalArg(0) byte arg0) {
		try {
			if (arg0 == 12) {
				this.aBoolean98 = true;
			}
		} catch (@Pc(8) RuntimeException local8) {
			signlink.reporterror("72630, " + arg0 + ", " + local8.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(BILclient!lb;)V")
	private void method144(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub1_Sub3 arg1) {
		try {
			for (@Pc(3) int local3 = 0; local3 < this.anInt274; local3++) {
				@Pc(10) int local10 = this.anIntArray54[local3];
				@Pc(15) Class1_Sub1_Sub1_Sub1_Sub2 local15 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local10];
				@Pc(18) int local18 = arg1.method480();
				@Pc(26) int local26;
				@Pc(29) int local29;
				if ((local18 & 0x1) == 1) {
					local26 = arg1.method480();
					local29 = arg1.method480();
					local15.method681(local26, local29, anInt236);
					local15.anInt996 = anInt236 + 300;
					local15.anInt997 = arg1.method480();
					local15.anInt998 = arg1.method480();
				}
				if ((local18 & 0x2) == 2) {
					local26 = arg1.method482();
					if (local26 == 65535) {
						local26 = -1;
					}
					if (local26 == local15.anInt1005) {
						local15.anInt1009 = 0;
					}
					local29 = arg1.method480();
					if (local26 == local15.anInt1005 && local26 != -1) {
						@Pc(83) int local83 = Class27.aClass27Array1[local26].anInt793;
						if (local83 == 1) {
							local15.anInt1006 = 0;
							local15.anInt1007 = 0;
							local15.anInt1008 = local29;
							local15.anInt1009 = 0;
						}
						if (local83 == 2) {
							local15.anInt1009 = 0;
						}
					} else if (local26 == -1 || local15.anInt1005 == -1 || Class27.aClass27Array1[local26].anInt787 >= Class27.aClass27Array1[local15.anInt1005].anInt787) {
						local15.anInt1005 = local26;
						local15.anInt1006 = 0;
						local15.anInt1007 = 0;
						local15.anInt1008 = local29;
						local15.anInt1009 = 0;
						local15.anInt1028 = local15.anInt1026;
					}
				}
				if ((local18 & 0x4) == 4) {
					local15.anInt999 = arg1.method482();
					if (local15.anInt999 == 65535) {
						local15.anInt999 = -1;
					}
				}
				if ((local18 & 0x8) == 8) {
					local15.aString31 = arg1.method487();
					local15.anInt993 = 100;
				}
				if ((local18 & 0x10) == 16) {
					local26 = arg1.method480();
					local29 = arg1.method480();
					local15.method681(local26, local29, anInt236);
					local15.anInt996 = anInt236 + 300;
					local15.anInt997 = arg1.method480();
					local15.anInt998 = arg1.method480();
				}
				if ((local18 & 0x20) == 32) {
					local15.aClass13_2 = Class13.method323(arg1.method482());
					local15.anInt985 = local15.aClass13_2.aByte20;
					local15.anInt1025 = local15.aClass13_2.anInt561;
					local15.anInt988 = local15.aClass13_2.anInt548;
					local15.anInt989 = local15.aClass13_2.anInt549;
					local15.anInt990 = local15.aClass13_2.anInt550;
					local15.anInt991 = local15.aClass13_2.anInt551;
					local15.anInt986 = local15.aClass13_2.anInt547;
				}
				if ((local18 & 0x40) == 64) {
					local15.anInt1010 = arg1.method482();
					local26 = arg1.method485();
					local15.anInt1014 = local26 >> 16;
					local15.anInt1013 = anInt236 + (local26 & 0xFFFF);
					local15.anInt1011 = 0;
					local15.anInt1012 = 0;
					if (local15.anInt1013 > anInt236) {
						local15.anInt1011 = -1;
					}
					if (local15.anInt1010 == 65535) {
						local15.anInt1010 = -1;
					}
				}
				if ((local18 & 0x80) == 128) {
					local15.anInt1000 = arg1.method482();
					local15.anInt1001 = arg1.method482();
				}
			}
		} catch (@Pc(316) RuntimeException local316) {
			signlink.reporterror("64750, " + 9 + ", " + arg0 + ", " + arg1 + ", " + local316.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(BLclient!lb;I)V")
	private void method146(@OriginalArg(1) Class1_Sub1_Sub3 arg0, @OriginalArg(2) int arg1) {
		try {
			@Pc(15) int local15;
			@Pc(24) int local24;
			@Pc(31) int local31;
			@Pc(34) int local34;
			@Pc(38) int local38;
			@Pc(42) int local42;
			@Pc(47) int local47;
			@Pc(52) int local52;
			if (arg1 == 99 || arg1 == 131) {
				local15 = arg0.method480();
				local24 = this.anInt311 + (local15 >> 4 & 0x7);
				local31 = this.anInt312 + (local15 & 0x7);
				local34 = arg0.method480();
				local38 = local34 >> 2;
				local42 = local34 & 0x3;
				local47 = this.anIntArray39[local38];
				if (arg1 == 131) {
					local52 = -1;
				} else {
					local52 = arg0.method482();
				}
				if (local24 >= 0 && local31 >= 0 && local24 < 104 && local31 < 104) {
					this.method143(local47, local38, local31, local24, this.anInt334, local52, 0, local42, -1);
				}
			} else {
				@Pc(142) int local142;
				@Pc(154) int local154;
				@Pc(168) int local168;
				@Pc(180) int local180;
				if (arg1 == 82) {
					local15 = arg0.method480();
					local24 = this.anInt311 + (local15 >> 4 & 0x7);
					local31 = this.anInt312 + (local15 & 0x7);
					local34 = arg0.method480();
					local38 = local34 >> 2;
					local42 = local34 & 0x3;
					local47 = this.anIntArray39[local38];
					local52 = arg0.method482();
					if (local24 >= 0 && local31 >= 0 && local24 < 103 && local31 < 103) {
						local142 = this.anIntArrayArrayArray5[this.anInt334][local24][local31];
						local154 = this.anIntArrayArrayArray5[this.anInt334][local24 + 1][local31];
						local168 = this.anIntArrayArrayArray5[this.anInt334][local24 + 1][local31 + 1];
						local180 = this.anIntArrayArrayArray5[this.anInt334][local24][local31 + 1];
						if (local47 == 0) {
							@Pc(191) Class34 local191 = this.aClass37_1.method552(local31, this.anInt334, local24);
							if (local191 != null) {
								@Pc(200) int local200 = local191.anInt830 >> 14 & 0x7FFF;
								if (local38 == 2) {
									local191.aClass1_Sub1_Sub1_7 = new Class1_Sub1_Sub1_Sub2(-7033, local200, local142, false, local180, local52, 2, local168, local42 + 4, local154);
									local191.aClass1_Sub1_Sub1_8 = new Class1_Sub1_Sub1_Sub2(-7033, local200, local142, false, local180, local52, 2, local168, local42 + 1 & 0x3, local154);
								} else {
									local191.aClass1_Sub1_Sub1_7 = new Class1_Sub1_Sub1_Sub2(-7033, local200, local142, false, local180, local52, local38, local168, local42, local154);
								}
							}
						}
						if (local47 == 1) {
							@Pc(268) Class14 local268 = this.aClass37_1.method553(local31, this.anInt334, local24);
							if (local268 != null) {
								local268.aClass1_Sub1_Sub1_1 = new Class1_Sub1_Sub1_Sub2(-7033, local268.anInt569 >> 14 & 0x7FFF, local142, false, local180, local52, 4, local168, 0, local154);
							}
						}
						if (local47 == 2) {
							@Pc(302) Class31 local302 = this.aClass37_1.method554(local31, this.anInt334, local24);
							if (local38 == 11) {
								local38 = 10;
							}
							if (local302 != null) {
								local302.aClass1_Sub1_Sub1_6 = new Class1_Sub1_Sub1_Sub2(-7033, local302.anInt814 >> 14 & 0x7FFF, local142, false, local180, local52, local38, local168, local42, local154);
							}
						}
						if (local47 == 3) {
							@Pc(341) Class18 local341 = this.aClass37_1.method555(this.anInt334, local24, 27, local31);
							if (local341 != null) {
								local341.aClass1_Sub1_Sub1_2 = new Class1_Sub1_Sub1_Sub2(-7033, local341.anInt651 >> 14 & 0x7FFF, local142, false, local180, local52, 22, local168, local42, local154);
							}
						}
					}
				} else {
					@Pc(406) Class1_Sub1_Sub1_Sub3 local406;
					if (arg1 == 42) {
						local15 = arg0.method480();
						local24 = this.anInt311 + (local15 >> 4 & 0x7);
						local31 = this.anInt312 + (local15 & 0x7);
						local34 = arg0.method482();
						local38 = arg0.method482();
						if (local24 >= 0 && local31 >= 0 && local24 < 104 && local31 < 104) {
							local406 = new Class1_Sub1_Sub1_Sub3();
							local406.anInt179 = local34;
							local406.anInt180 = local38;
							if (this.aClass29ArrayArrayArray1[this.anInt334][local24][local31] == null) {
								this.aClass29ArrayArrayArray1[this.anInt334][local24][local31] = new Class29(-794);
							}
							this.aClass29ArrayArrayArray1[this.anInt334][local24][local31].method508(local406);
							this.method179(local24, local31);
						}
					} else if (arg1 == 139) {
						local15 = arg0.method480();
						local24 = this.anInt311 + (local15 >> 4 & 0x7);
						local31 = this.anInt312 + (local15 & 0x7);
						local34 = arg0.method482();
						if (local24 >= 0 && local31 >= 0 && local24 < 104 && local31 < 104) {
							@Pc(496) Class29 local496 = this.aClass29ArrayArrayArray1[this.anInt334][local24][local31];
							if (local496 != null) {
								for (local406 = (Class1_Sub1_Sub1_Sub3) local496.method511(); local406 != null; local406 = (Class1_Sub1_Sub1_Sub3) local496.method513()) {
									if (local406.anInt179 == (local34 & 0x7FFF)) {
										local406.method673();
										break;
									}
								}
								if (local496.method511() == null) {
									this.aClass29ArrayArrayArray1[this.anInt334][local24][local31] = null;
								}
								this.method179(local24, local31);
							}
						}
					} else if (arg1 == 164) {
						local15 = arg0.method480();
						local24 = this.anInt311 + (local15 >> 4 & 0x7);
						local31 = this.anInt312 + (local15 & 0x7);
						local34 = local24 + arg0.method481();
						local38 = local31 + arg0.method481();
						local42 = arg0.method483();
						local47 = arg0.method482();
						local52 = arg0.method480() * 4;
						local142 = arg0.method480() * 4;
						local154 = arg0.method482();
						local168 = arg0.method482();
						local180 = arg0.method480();
						@Pc(599) int local599 = arg0.method480();
						if (local24 >= 0 && local31 >= 0 && local24 < 104 && local31 < 104 && local34 >= 0 && local38 >= 0 && local34 < 104 && local38 < 104 && local47 != 65535) {
							local24 = local24 * 128 + 64;
							local31 = local31 * 128 + 64;
							local34 = local34 * 128 + 64;
							local38 = local38 * 128 + 64;
							@Pc(675) Class1_Sub1_Sub1_Sub4 local675 = new Class1_Sub1_Sub1_Sub4(this.method178(local24, local31, this.anInt334) - local52, 1, local599, local180, local42, local24, this.anInt334, local47, local142, local31, local168 + anInt236, local154 + anInt236);
							local675.method241(local154 + anInt236, this.method178(local34, local38, this.anInt334) - local142, local38, local34);
							this.aClass29_2.method508(local675);
						}
					} else if (arg1 == 127) {
						local15 = arg0.method480();
						local24 = this.anInt311 + (local15 >> 4 & 0x7);
						local31 = this.anInt312 + (local15 & 0x7);
						local34 = arg0.method482();
						local38 = arg0.method480();
						local42 = arg0.method482();
						if (local24 >= 0 && local31 >= 0 && local24 < 104 && local31 < 104) {
							local24 = local24 * 128 + 64;
							local31 = local31 * 128 + 64;
							@Pc(771) Class1_Sub1_Sub1_Sub6 local771 = new Class1_Sub1_Sub1_Sub6(this.method178(local24, local31, this.anInt334) - local38, local31, anInt236, 0, local42, this.anInt334, local24, local34);
							this.aClass29_1.method508(local771);
						}
					} else if (arg1 == 138) {
						local15 = arg0.method480();
						local24 = this.anInt311 + (local15 >> 4 & 0x7);
						local31 = this.anInt312 + (local15 & 0x7);
						local34 = arg0.method482();
						local38 = arg0.method482();
						local42 = arg0.method482();
						if (local24 >= 0 && local31 >= 0 && local24 < 104 && local31 < 104 && local42 != this.anInt247) {
							@Pc(825) Class1_Sub1_Sub1_Sub3 local825 = new Class1_Sub1_Sub1_Sub3();
							local825.anInt179 = local34;
							local825.anInt180 = local38;
							if (this.aClass29ArrayArrayArray1[this.anInt334][local24][local31] == null) {
								this.aClass29ArrayArrayArray1[this.anInt334][local24][local31] = new Class29(-794);
							}
							this.aClass29ArrayArrayArray1[this.anInt334][local24][local31].method508(local825);
							this.method179(local24, local31);
						}
					} else {
						if (arg1 == 91) {
							local15 = arg0.method480();
							local24 = this.anInt311 + (local15 >> 4 & 0x7);
							local31 = this.anInt312 + (local15 & 0x7);
							local34 = arg0.method480();
							local38 = local34 >> 2;
							local42 = local34 & 0x3;
							local47 = this.anIntArray39[local38];
							local52 = arg0.method482();
							local142 = arg0.method482();
							local154 = arg0.method482();
							local168 = arg0.method482();
							@Pc(923) byte local923 = arg0.method481();
							@Pc(926) byte local926 = arg0.method481();
							@Pc(929) byte local929 = arg0.method481();
							@Pc(932) byte local932 = arg0.method481();
							@Pc(938) Class1_Sub1_Sub1_Sub1_Sub1 local938;
							if (local168 == this.anInt247) {
								local938 = aClass1_Sub1_Sub1_Sub1_Sub1_1;
							} else {
								local938 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local168];
							}
							if (local938 != null) {
								@Pc(950) Class9 local950 = Class9.method288(local52);
								@Pc(960) int local960 = this.anIntArrayArrayArray5[this.anInt334][local24][local31];
								@Pc(972) int local972 = this.anIntArrayArrayArray5[this.anInt334][local24 + 1][local31];
								@Pc(986) int local986 = this.anIntArrayArrayArray5[this.anInt334][local24 + 1][local31 + 1];
								@Pc(998) int local998 = this.anIntArrayArrayArray5[this.anInt334][local24][local31 + 1];
								@Pc(1008) Class1_Sub1_Sub1_Sub5 local1008 = local950.method294(local38, local42, local960, local972, local986, local998, -1);
								if (local1008 != null) {
									this.method143(local47, 0, local31, local24, this.anInt334, -1, local142 + 1, 0, local154 + 1);
									local938.anInt131 = local142 + anInt236;
									local938.anInt132 = local154 + anInt236;
									local938.aClass1_Sub1_Sub1_Sub5_1 = local1008;
									@Pc(1043) int local1043 = local950.anInt502;
									@Pc(1046) int local1046 = local950.anInt503;
									if (local42 == 1 || local42 == 3) {
										local1043 = local950.anInt503;
										local1046 = local950.anInt502;
									}
									local938.anInt133 = local24 * 128 + local1043 * 64;
									local938.anInt135 = local31 * 128 + local1046 * 64;
									local938.anInt134 = this.method178(local938.anInt133, local938.anInt135, this.anInt334);
									@Pc(1092) byte local1092;
									if (local923 > local929) {
										local1092 = local923;
										local923 = local929;
										local929 = local1092;
									}
									if (local926 > local932) {
										local1092 = local926;
										local926 = local932;
										local932 = local1092;
									}
									local938.anInt136 = local24 + local923;
									local938.anInt138 = local24 + local929;
									local938.anInt137 = local31 + local926;
									local938.anInt139 = local31 + local932;
								}
							}
						}
						if (arg1 == 193) {
							local15 = arg0.method480();
							local24 = this.anInt311 + (local15 >> 4 & 0x7);
							local31 = this.anInt312 + (local15 & 0x7);
							local34 = arg0.method482();
							local38 = arg0.method482();
							local42 = arg0.method482();
							if (local24 >= 0 && local31 >= 0 && local24 < 104 && local31 < 104) {
								@Pc(1176) Class29 local1176 = this.aClass29ArrayArrayArray1[this.anInt334][local24][local31];
								if (local1176 != null) {
									for (@Pc(1182) Class1_Sub1_Sub1_Sub3 local1182 = (Class1_Sub1_Sub1_Sub3) local1176.method511(); local1182 != null; local1182 = (Class1_Sub1_Sub1_Sub3) local1176.method513()) {
										if (local1182.anInt179 == (local34 & 0x7FFF) && local1182.anInt180 == local38) {
											local1182.anInt180 = local42;
											break;
										}
									}
									this.method179(local24, local31);
								}
							}
						} else if (arg1 == 196) {
							local15 = arg0.method480();
							local24 = this.anInt311 + (local15 >> 4 & 0x7);
							local31 = this.anInt312 + (local15 & 0x7);
							local34 = arg0.method482();
							local38 = arg0.method480();
							local42 = local38 >> 4 & 0xF;
							local47 = local38 & 0x7;
							if (aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray272[0] >= local24 - local42 && aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray272[0] <= local24 + local42 && aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray273[0] >= local31 - local42 && aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray273[0] <= local31 + local42 && this.aBoolean70 && !aBoolean66 && this.anInt351 < 50) {
								this.anIntArray87[this.anInt351] = local34;
								this.anIntArray38[this.anInt351] = local47;
								this.anIntArray32[this.anInt351] = Class5.anIntArray29[local34];
								this.anInt351++;
								return;
							}
						}
					}
				}
			}
		} catch (@Pc(1318) RuntimeException local1318) {
			signlink.reporterror("20410, " + -96 + ", " + arg0 + ", " + arg1 + ", " + local1318.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "u", descriptor = "(I)V")
	private void method147() {
		try {
			@Pc(21) int local21;
			for (@Pc(14) int local14 = 10; local14 < 117; local14++) {
				local21 = (int) (Math.random() * 100.0D);
				if (local21 < 50) {
					this.anIntArray59[local14 + 32512] = 255;
				}
			}
			@Pc(50) int local50;
			@Pc(57) int local57;
			@Pc(63) int local63;
			for (local21 = 0; local21 < 100; local21++) {
				local50 = (int) (Math.random() * 124.0D) + 2;
				local57 = (int) (Math.random() * 128.0D) + 128;
				local63 = local50 + (local57 << 7);
				this.anIntArray59[local63] = 192;
			}
			for (local50 = 1; local50 < 255; local50++) {
				for (local57 = 1; local57 < 127; local57++) {
					local63 = local57 + (local50 << 7);
					this.anIntArray60[local63] = (this.anIntArray59[local63 - 1] + this.anIntArray59[local63 + 1] + this.anIntArray59[local63 - 128] + this.anIntArray59[local63 + 128]) / 4;
				}
			}
			this.anInt308 += 128;
			if (this.anInt308 > this.anIntArray67.length) {
				this.anInt308 -= this.anIntArray67.length;
				local57 = (int) (Math.random() * 12.0D);
				this.method192(this.aClass1_Sub1_Sub2_Sub3Array4[local57]);
			}
			@Pc(175) int local175;
			for (local57 = 1; local57 < 255; local57++) {
				for (local63 = 1; local63 < 127; local63++) {
					local175 = local63 + (local57 << 7);
					@Pc(198) int local198 = this.anIntArray60[local175 + 128] - this.anIntArray67[local175 + this.anInt308 & this.anIntArray67.length - 1] / 5;
					if (local198 < 0) {
						local198 = 0;
					}
					this.anIntArray59[local175] = local198;
				}
			}
			for (local63 = 0; local63 < 255; local63++) {
				this.anIntArray75[local63] = this.anIntArray75[local63 + 1];
			}
			this.anIntArray75[255] = (int) (Math.sin((double) anInt236 / 14.0D) * 16.0D + Math.sin((double) anInt236 / 15.0D) * 14.0D + Math.sin((double) anInt236 / 16.0D) * 12.0D);
			if (this.anInt237 > 0) {
				this.anInt237 -= 4;
			}
			if (this.anInt238 > 0) {
				this.anInt238 -= 4;
			}
			if (this.anInt237 == 0 && this.anInt238 == 0) {
				local175 = (int) (Math.random() * 2000.0D);
				if (local175 == 0) {
					this.anInt237 = 1024;
				}
				if (local175 == 1) {
					this.anInt238 = 1024;
					return;
				}
			}
		} catch (@Pc(309) RuntimeException local309) {
			signlink.reporterror("69063, " + 0 + ", " + local309.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "v", descriptor = "(I)V")
	private void method148() {
		try {
			this.aBoolean68 = true;
			try {
				@Pc(15) long local15 = System.currentTimeMillis();
				@Pc(17) int local17 = 0;
				@Pc(19) int local19 = 20;
				while (this.aBoolean62) {
					this.anInt403++;
					this.method147();
					this.method147();
					this.method157();
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
			this.aBoolean68 = false;
		} catch (@Pc(80) RuntimeException local80) {
			signlink.reporterror("34240, " + 842 + ", " + local80.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "h", descriptor = "(Z)V")
	private void method149() {
		try {
			@Pc(10) int local10 = 5;
			this.anIntArray61[8] = 0;
			@Pc(17) int local17 = 0;
			while (this.anIntArray61[8] == 0) {
				@Pc(21) String local21 = "Unknown problem";
				this.method96(20, "Connecting to web server");
				try {
					@Pc(43) DataInputStream local43 = this.method131("crc" + (int) (Math.random() * 9.9999999E7D) + "-" + 295);
					@Pc(50) Class1_Sub1_Sub3 local50 = new Class1_Sub1_Sub3(new byte[40], aBoolean64);
					local43.readFully(local50.aByteArray9, 0, 40);
					local43.close();
					for (@Pc(60) int local60 = 0; local60 < 9; local60++) {
						this.anIntArray61[local60] = local50.method485();
					}
					@Pc(75) int local75 = local50.method485();
					@Pc(77) int local77 = 1234;
					for (@Pc(79) int local79 = 0; local79 < 9; local79++) {
						local77 = (local77 << 1) + this.anIntArray61[local79];
					}
					if (local75 != local77) {
						local21 = "checksum problem";
						this.anIntArray61[8] = 0;
					}
				} catch (@Pc(106) EOFException local106) {
					local21 = "EOF problem";
					this.anIntArray61[8] = 0;
				} catch (@Pc(115) IOException local115) {
					local21 = "connection problem";
					this.anIntArray61[8] = 0;
				} catch (@Pc(124) Exception local124) {
					local21 = "logic problem";
					this.anIntArray61[8] = 0;
					if (!signlink.reporterror) {
						return;
					}
				}
				if (this.anIntArray61[8] == 0) {
					local17++;
					for (@Pc(142) int local142 = local10; local142 > 0; local142--) {
						if (local17 >= 10) {
							this.method96(10, "Game updated - please reload page");
							local142 = 10;
						} else {
							this.method96(10, local21 + " - Will retry in " + local142 + " secs.");
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
					this.aBoolean75 = !this.aBoolean75;
				}
			}
		} catch (@Pc(204) RuntimeException local204) {
			signlink.reporterror("90577, " + false + ", " + local204.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "i", descriptor = "(Z)V")
	private void method150() {
		try {
			this.aClass1_Sub1_Sub3_2.method469(84, 837);
			if (this.anInt327 != -1) {
				this.anInt327 = -1;
				this.aBoolean92 = true;
				this.aBoolean73 = false;
				this.aBoolean60 = true;
			}
			if (this.anInt209 != -1) {
				this.anInt209 = -1;
				this.aBoolean99 = true;
				this.aBoolean73 = false;
			}
			this.anInt220 = -1;
		} catch (@Pc(44) RuntimeException local44) {
			signlink.reporterror("40851, " + true + ", " + local44.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "w", descriptor = "(I)Z")
	private boolean method152() {
		try {
			this.anInt248 += 0;
			return signlink.wavereplay();
		} catch (@Pc(8) RuntimeException local8) {
			signlink.reporterror("37334, " + 0 + ", " + local8.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "x", descriptor = "(I)Ljava/net/Socket;")
	public Socket method153(@OriginalArg(0) int arg0) throws IOException {
		return signlink.mainapp == null ? new Socket(InetAddress.getByName(this.getCodeBase().getHost()), arg0) : signlink.opensocket(arg0);
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIIZIIIIIZI)Z")
	private boolean method154(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) boolean arg9, @OriginalArg(11) int arg10) {
		try {
			@Pc(11) int local11;
			for (@Pc(7) int local7 = 0; local7 < 104; local7++) {
				for (local11 = 0; local11 < 104; local11++) {
					this.anIntArrayArray5[local7][local11] = 0;
					this.anIntArrayArray3[local7][local11] = 99999999;
				}
			}
			local11 = arg6;
			@Pc(39) int local39 = arg8;
			this.anIntArrayArray5[arg6][arg8] = 99;
			this.anIntArrayArray3[arg6][arg8] = 0;
			@Pc(55) byte local55 = 0;
			@Pc(57) int local57 = 0;
			this.anIntArray50[0] = arg6;
			@Pc(66) int local66 = local55 + 1;
			this.anIntArray51[0] = arg8;
			@Pc(70) boolean local70 = false;
			@Pc(74) int local74 = this.anIntArray50.length;
			@Pc(81) int[][] local81 = this.aClass19Array1[this.anInt334].anIntArrayArray18;
			this.aBoolean48 &= true;
			@Pc(198) int local198;
			while (local57 != local66) {
				local11 = this.anIntArray50[local57];
				local39 = this.anIntArray51[local57];
				local57 = (local57 + 1) % local74;
				if (local11 == arg1 && local39 == arg2) {
					local70 = true;
					break;
				}
				if (arg4 != 0) {
					if ((arg4 < 5 || arg4 == 10) && this.aClass19Array1[this.anInt334].method429(arg2, local39, local11, arg4 - 1, arg1, arg7)) {
						local70 = true;
						break;
					}
					if (arg4 < 10 && this.aClass19Array1[this.anInt334].method430(local11, arg7, arg4 - 1, arg2, local39, arg1)) {
						local70 = true;
						break;
					}
				}
				if (arg3 != 0 && arg5 != 0 && this.aClass19Array1[this.anInt334].method431(local39, arg5, local11, arg1, arg3, arg10, arg2)) {
					local70 = true;
					break;
				}
				local198 = this.anIntArrayArray3[local11][local39] + 1;
				if (local11 > 0 && this.anIntArrayArray5[local11 - 1][local39] == 0 && (local81[local11 - 1][local39] & 0x280108) == 0) {
					this.anIntArray50[local66] = local11 - 1;
					this.anIntArray51[local66] = local39;
					local66 = (local66 + 1) % local74;
					this.anIntArrayArray5[local11 - 1][local39] = 2;
					this.anIntArrayArray3[local11 - 1][local39] = local198;
				}
				if (local11 < 103 && this.anIntArrayArray5[local11 + 1][local39] == 0 && (local81[local11 + 1][local39] & 0x280180) == 0) {
					this.anIntArray50[local66] = local11 + 1;
					this.anIntArray51[local66] = local39;
					local66 = (local66 + 1) % local74;
					this.anIntArrayArray5[local11 + 1][local39] = 8;
					this.anIntArrayArray3[local11 + 1][local39] = local198;
				}
				if (local39 > 0 && this.anIntArrayArray5[local11][local39 - 1] == 0 && (local81[local11][local39 - 1] & 0x280102) == 0) {
					this.anIntArray50[local66] = local11;
					this.anIntArray51[local66] = local39 - 1;
					local66 = (local66 + 1) % local74;
					this.anIntArrayArray5[local11][local39 - 1] = 1;
					this.anIntArrayArray3[local11][local39 - 1] = local198;
				}
				if (local39 < 103 && this.anIntArrayArray5[local11][local39 + 1] == 0 && (local81[local11][local39 + 1] & 0x280120) == 0) {
					this.anIntArray50[local66] = local11;
					this.anIntArray51[local66] = local39 + 1;
					local66 = (local66 + 1) % local74;
					this.anIntArrayArray5[local11][local39 + 1] = 4;
					this.anIntArrayArray3[local11][local39 + 1] = local198;
				}
				if (local11 > 0 && local39 > 0 && this.anIntArrayArray5[local11 - 1][local39 - 1] == 0 && (local81[local11 - 1][local39 - 1] & 0x28010E) == 0 && (local81[local11 - 1][local39] & 0x280108) == 0 && (local81[local11][local39 - 1] & 0x280102) == 0) {
					this.anIntArray50[local66] = local11 - 1;
					this.anIntArray51[local66] = local39 - 1;
					local66 = (local66 + 1) % local74;
					this.anIntArrayArray5[local11 - 1][local39 - 1] = 3;
					this.anIntArrayArray3[local11 - 1][local39 - 1] = local198;
				}
				if (local11 < 103 && local39 > 0 && this.anIntArrayArray5[local11 + 1][local39 - 1] == 0 && (local81[local11 + 1][local39 - 1] & 0x280183) == 0 && (local81[local11 + 1][local39] & 0x280180) == 0 && (local81[local11][local39 - 1] & 0x280102) == 0) {
					this.anIntArray50[local66] = local11 + 1;
					this.anIntArray51[local66] = local39 - 1;
					local66 = (local66 + 1) % local74;
					this.anIntArrayArray5[local11 + 1][local39 - 1] = 9;
					this.anIntArrayArray3[local11 + 1][local39 - 1] = local198;
				}
				if (local11 > 0 && local39 < 103 && this.anIntArrayArray5[local11 - 1][local39 + 1] == 0 && (local81[local11 - 1][local39 + 1] & 0x280138) == 0 && (local81[local11 - 1][local39] & 0x280108) == 0 && (local81[local11][local39 + 1] & 0x280120) == 0) {
					this.anIntArray50[local66] = local11 - 1;
					this.anIntArray51[local66] = local39 + 1;
					local66 = (local66 + 1) % local74;
					this.anIntArrayArray5[local11 - 1][local39 + 1] = 6;
					this.anIntArrayArray3[local11 - 1][local39 + 1] = local198;
				}
				if (local11 < 103 && local39 < 103 && this.anIntArrayArray5[local11 + 1][local39 + 1] == 0 && (local81[local11 + 1][local39 + 1] & 0x2801E0) == 0 && (local81[local11 + 1][local39] & 0x280180) == 0 && (local81[local11][local39 + 1] & 0x280120) == 0) {
					this.anIntArray50[local66] = local11 + 1;
					this.anIntArray51[local66] = local39 + 1;
					local66 = (local66 + 1) % local74;
					this.anIntArrayArray5[local11 + 1][local39 + 1] = 12;
					this.anIntArrayArray3[local11 + 1][local39 + 1] = local198;
				}
			}
			this.anInt387 = 0;
			@Pc(814) int local814;
			@Pc(820) int local820;
			@Pc(826) int local826;
			if (!local70) {
				if (arg9) {
					local198 = 100;
					for (local814 = 1; local814 < 2; local814++) {
						for (local820 = arg1 - local814; local820 <= arg1 + local814; local820++) {
							for (local826 = arg2 - local814; local826 <= arg2 + local814; local826++) {
								if (local820 >= 0 && local826 >= 0 && local820 < 104 && local826 < 104 && this.anIntArrayArray3[local820][local826] < local198) {
									local198 = this.anIntArrayArray3[local820][local826];
									local11 = local820;
									local39 = local826;
									this.anInt387 = 1;
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
			@Pc(887) byte local887 = 0;
			this.anIntArray50[0] = local11;
			local57 = local887 + 1;
			this.anIntArray51[0] = local39;
			local198 = local814 = this.anIntArrayArray5[local11][local39];
			while (local11 != arg6 || local39 != arg8) {
				if (local198 != local814) {
					local814 = local198;
					this.anIntArray50[local57] = local11;
					this.anIntArray51[local57++] = local39;
				}
				if ((local198 & 0x2) != 0) {
					local11++;
				} else if ((local198 & 0x8) != 0) {
					local11--;
				}
				if ((local198 & 0x1) != 0) {
					local39++;
				} else if ((local198 & 0x4) != 0) {
					local39--;
				}
				local198 = this.anIntArrayArray5[local11][local39];
			}
			if (local57 > 0) {
				local74 = local57;
				if (local57 > 25) {
					local74 = 25;
				}
				local57--;
				local820 = this.anIntArray50[local57];
				local826 = this.anIntArray51[local57];
				if (arg0 == 0) {
					this.aClass1_Sub1_Sub3_2.method469(201, 837);
					this.aClass1_Sub1_Sub3_2.method470(local74 + local74 + 3);
				}
				if (arg0 == 1) {
					this.aClass1_Sub1_Sub3_2.method469(77, 837);
					this.aClass1_Sub1_Sub3_2.method470(local74 + local74 + 3 + 14);
				}
				if (arg0 == 2) {
					this.aClass1_Sub1_Sub3_2.method469(41, 837);
					this.aClass1_Sub1_Sub3_2.method470(local74 + local74 + 3);
				}
				if (super.anIntArray30[5] == 1) {
					this.aClass1_Sub1_Sub3_2.method470(1);
				} else {
					this.aClass1_Sub1_Sub3_2.method470(0);
				}
				this.aClass1_Sub1_Sub3_2.method471(local820 + this.anInt213);
				this.aClass1_Sub1_Sub3_2.method471(local826 + this.anInt214);
				this.anInt370 = this.anIntArray50[0];
				this.anInt371 = this.anIntArray51[0];
				for (@Pc(1075) int local1075 = 1; local1075 < local74; local1075++) {
					local57--;
					this.aClass1_Sub1_Sub3_2.method470(this.anIntArray50[local57] - local820);
					this.aClass1_Sub1_Sub3_2.method470(this.anIntArray51[local57] - local826);
				}
				return true;
			} else if (arg0 == 1) {
				return false;
			} else {
				return true;
			}
		} catch (@Pc(1110) RuntimeException local1110) {
			signlink.reporterror("70606, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + true + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + arg10 + ", " + local1110.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Lclient!d;I)Z")
	private boolean method155(@OriginalArg(0) Class6 arg0) {
		try {
			@Pc(4) int local4 = arg0.anInt422;
			if (this.anInt233 == 2) {
				if (local4 == 201) {
					this.aBoolean99 = true;
					this.aBoolean50 = false;
					this.aBoolean77 = true;
					this.aString13 = "";
					this.anInt356 = 1;
					this.aString16 = "Enter name of friend to add to list";
				}
				if (local4 == 202) {
					this.aBoolean99 = true;
					this.aBoolean50 = false;
					this.aBoolean77 = true;
					this.aString13 = "";
					this.anInt356 = 2;
					this.aString16 = "Enter name of friend to delete from list";
				}
			}
			if (local4 == 205) {
				this.anInt252 = 250;
				return true;
			}
			if (local4 == 501) {
				this.aBoolean99 = true;
				this.aBoolean50 = false;
				this.aBoolean77 = true;
				this.aString13 = "";
				this.anInt356 = 4;
				this.aString16 = "Enter name of player to add to list";
			}
			if (local4 == 502) {
				this.aBoolean99 = true;
				this.aBoolean50 = false;
				this.aBoolean77 = true;
				this.aString13 = "";
				this.anInt356 = 5;
				this.aString16 = "Enter name of player to delete from list";
			}
			@Pc(117) int local117;
			@Pc(121) int local121;
			@Pc(126) int local126;
			if (local4 >= 300 && local4 <= 313) {
				local117 = (local4 - 300) / 2;
				local121 = local4 & 0x1;
				local126 = this.anIntArray65[local117];
				if (local126 != -1) {
					while (true) {
						if (local121 == 0) {
							local126--;
							if (local126 < 0) {
								local126 = Class23.anInt740 - 1;
							}
						}
						if (local121 == 1) {
							local126++;
							if (local126 >= Class23.anInt740) {
								local126 = 0;
							}
						}
						if (!Class23.aClass23Array1[local126].aBoolean204 && Class23.aClass23Array1[local126].anInt741 == local117 + (this.aBoolean85 ? 0 : 7)) {
							this.anIntArray65[local117] = local126;
							this.aBoolean78 = true;
							break;
						}
					}
				}
			}
			if (local4 >= 314 && local4 <= 323) {
				local117 = (local4 - 314) / 2;
				local121 = local4 & 0x1;
				local126 = this.anIntArray71[local117];
				if (local121 == 0) {
					local126--;
					if (local126 < 0) {
						local126 = anIntArrayArray4[local117].length - 1;
					}
				}
				if (local121 == 1) {
					local126++;
					if (local126 >= anIntArrayArray4[local117].length) {
						local126 = 0;
					}
				}
				this.anIntArray71[local117] = local126;
				this.aBoolean78 = true;
			}
			if (local4 == 324 && !this.aBoolean85) {
				this.aBoolean85 = true;
				this.method214();
			}
			if (local4 == 325 && this.aBoolean85) {
				this.aBoolean85 = false;
				this.method214();
			}
			if (local4 == 326) {
				this.aClass1_Sub1_Sub3_2.method469(169, 837);
				this.aClass1_Sub1_Sub3_2.method470(this.aBoolean85 ? 0 : 1);
				for (local117 = 0; local117 < 7; local117++) {
					this.aClass1_Sub1_Sub3_2.method470(this.anIntArray65[local117]);
				}
				for (local121 = 0; local121 < 5; local121++) {
					this.aClass1_Sub1_Sub3_2.method470(this.anIntArray71[local121]);
				}
				return true;
			}
			if (local4 == 613) {
				this.aBoolean49 = !this.aBoolean49;
			}
			if (local4 >= 601 && local4 <= 612) {
				this.method150();
				if (this.aString17.length() > 0) {
					this.aClass1_Sub1_Sub3_2.method469(91, 837);
					this.aClass1_Sub1_Sub3_2.method476(this.aByte5, Class48.method667(this.aString17));
					this.aClass1_Sub1_Sub3_2.method470(local4 - 601);
					this.aClass1_Sub1_Sub3_2.method470(this.aBoolean49 ? 1 : 0);
				}
			}
			return false;
		} catch (@Pc(355) RuntimeException local355) {
			signlink.reporterror("55998, " + arg0 + ", " + 0 + ", " + local355.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "j", descriptor = "(Z)V")
	private void method156(@OriginalArg(0) boolean arg0) {
		try {
			this.aBoolean48 &= arg0;
			if (this.anInt229 == 0 && super.anInt199 == 1) {
				@Pc(20) int local20 = super.anInt200 - 25 - 550;
				@Pc(27) int local27 = super.anInt201 - 5 - 4;
				if (local20 >= 0 && local27 >= 0 && local20 < 146 && local27 < 151) {
					local20 -= 73;
					local27 -= 75;
					@Pc(47) int local47 = this.anInt225 + this.anInt264 & 0x7FF;
					@Pc(51) int local51 = Class1_Sub1_Sub2_Sub1.anIntArray178[local47];
					@Pc(55) int local55 = Class1_Sub1_Sub2_Sub1.anIntArray179[local47];
					@Pc(64) int local64 = local51 * (this.anInt362 + 256) >> 8;
					@Pc(73) int local73 = local55 * (this.anInt362 + 256) >> 8;
					@Pc(83) int local83 = local27 * local64 + local20 * local73 >> 11;
					@Pc(93) int local93 = local27 * local73 - local20 * local64 >> 11;
					@Pc(100) int local100 = aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt982 + local83 >> 7;
					@Pc(107) int local107 = aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt983 - local93 >> 7;
					@Pc(128) boolean local128 = this.method154(1, local100, local107, 0, 0, 0, aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray272[0], 0, aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray273[0], true, 0);
					if (local128) {
						this.aClass1_Sub1_Sub3_2.method470(local20);
						this.aClass1_Sub1_Sub3_2.method470(local27);
						this.aClass1_Sub1_Sub3_2.method471(this.anInt225);
						this.aClass1_Sub1_Sub3_2.method470(57);
						this.aClass1_Sub1_Sub3_2.method470(this.anInt264);
						this.aClass1_Sub1_Sub3_2.method470(this.anInt362);
						this.aClass1_Sub1_Sub3_2.method470(89);
						this.aClass1_Sub1_Sub3_2.method471(aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt982);
						this.aClass1_Sub1_Sub3_2.method471(aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt983);
						this.aClass1_Sub1_Sub3_2.method470(this.anInt387);
						this.aClass1_Sub1_Sub3_2.method470(63);
						return;
					}
				}
			}
		} catch (@Pc(182) RuntimeException local182) {
			signlink.reporterror("1655, " + arg0 + ", " + local182.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "y", descriptor = "(I)V")
	private void method157() {
		try {
			@Pc(8) int local8;
			if (this.anInt237 > 0) {
				for (local8 = 0; local8 < 256; local8++) {
					if (this.anInt237 > 768) {
						this.anIntArray89[local8] = this.method198(this.anIntArray91[local8], 1024 - this.anInt237, 908, this.anIntArray90[local8]);
					} else if (this.anInt237 > 256) {
						this.anIntArray89[local8] = this.anIntArray91[local8];
					} else {
						this.anIntArray89[local8] = this.method198(this.anIntArray90[local8], 256 - this.anInt237, 908, this.anIntArray91[local8]);
					}
				}
			} else if (this.anInt238 > 0) {
				for (local8 = 0; local8 < 256; local8++) {
					if (this.anInt238 > 768) {
						this.anIntArray89[local8] = this.method198(this.anIntArray92[local8], 1024 - this.anInt238, 908, this.anIntArray90[local8]);
					} else if (this.anInt238 > 256) {
						this.anIntArray89[local8] = this.anIntArray92[local8];
					} else {
						this.anIntArray89[local8] = this.method198(this.anIntArray90[local8], 256 - this.anInt238, 908, this.anIntArray92[local8]);
					}
				}
			} else {
				for (local8 = 0; local8 < 256; local8++) {
					this.anIntArray89[local8] = this.anIntArray90[local8];
				}
			}
			for (local8 = 0; local8 < 33920; local8++) {
				this.aClass35_22.anIntArray231[local8] = this.aClass1_Sub1_Sub2_Sub2_8.anIntArray208[local8];
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
				local198 = this.anIntArray75[local185] * (256 - local185) / 256;
				local202 = local198 + 22;
				if (local202 < 0) {
					local202 = 0;
				}
				local181 += local202;
				for (local212 = local202; local212 < 128; local212++) {
					local220 = this.anIntArray59[local181++];
					if (local220 == 0) {
						local183++;
					} else {
						local224 = local220;
						local228 = 256 - local220;
						local220 = this.anIntArray89[local220];
						local239 = this.aClass35_22.anIntArray231[local183];
						this.aClass35_22.anIntArray231[local183++] = ((local220 & 0xFF00FF) * local224 + (local239 & 0xFF00FF) * local228 & 0xFF00FF00) + ((local220 & 0xFF00) * local224 + (local239 & 0xFF00) * local228 & 0xFF0000) >> 8;
					}
				}
				local183 += local202;
			}
			this.aClass35_22.method525(0, 0, super.aGraphics2);
			for (local198 = 0; local198 < 33920; local198++) {
				this.aClass35_23.anIntArray231[local198] = this.aClass1_Sub1_Sub2_Sub2_9.anIntArray208[local198];
			}
			local181 = 0;
			local183 = 1176;
			for (local202 = 1; local202 < 255; local202++) {
				local212 = this.anIntArray75[local202] * (256 - local202) / 256;
				local220 = 103 - local212;
				local183 += local212;
				for (local224 = 0; local224 < local220; local224++) {
					local228 = this.anIntArray59[local181++];
					if (local228 == 0) {
						local183++;
					} else {
						local239 = local228;
						@Pc(368) int local368 = 256 - local228;
						local228 = this.anIntArray89[local228];
						@Pc(379) int local379 = this.aClass35_23.anIntArray231[local183];
						this.aClass35_23.anIntArray231[local183++] = ((local228 & 0xFF00FF) * local239 + (local379 & 0xFF00FF) * local368 & 0xFF00FF00) + ((local228 & 0xFF00) * local239 + (local379 & 0xFF00) * local368 & 0xFF0000) >> 8;
					}
				}
				local181 += 128 - local220;
				local183 += 128 - local220 - local212;
			}
			this.aClass35_23.method525(0, 637, super.aGraphics2);
		} catch (@Pc(451) RuntimeException local451) {
			signlink.reporterror("58564, " + -616 + ", " + local451.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;Z)V")
	private void method158(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) boolean arg2) {
		signlink.errorname = arg0;
		try {
			if (!arg2) {
				this.aString5 = "";
				this.aString6 = "Connecting to server...";
				this.method125(true);
			}
			this.aClass8_1 = new Class8((byte) -9, this, this.method153(anInt283 + 43594));
			@Pc(30) long local30 = Class48.method667(arg0);
			@Pc(37) int local37 = (int) (local30 >> 16 & 0x1FL);
			this.aClass1_Sub1_Sub3_2.anInt733 = 0;
			this.aClass1_Sub1_Sub3_2.method470(14);
			this.aClass1_Sub1_Sub3_2.method470(local37);
			this.aClass8_1.method251(2, this.aClass1_Sub1_Sub3_2.aByteArray9, 459);
			for (@Pc(60) int local60 = 0; local60 < 8; local60++) {
				this.aClass8_1.method248();
			}
			@Pc(74) int local74 = this.aClass8_1.method248();
			@Pc(223) int local223;
			@Pc(257) int local257;
			if (local74 == 0) {
				this.aClass8_1.method250(this.aClass1_Sub1_Sub3_4.aByteArray9, 0, 8);
				this.aClass1_Sub1_Sub3_4.anInt733 = 0;
				this.aLong17 = this.aClass1_Sub1_Sub3_4.method486();
				@Pc(97) int[] local97 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (this.aLong17 >> 32), (int) this.aLong17 };
				this.aClass1_Sub1_Sub3_2.anInt733 = 0;
				this.aClass1_Sub1_Sub3_2.method470(10);
				this.aClass1_Sub1_Sub3_2.method474(local97[0]);
				this.aClass1_Sub1_Sub3_2.method474(local97[1]);
				this.aClass1_Sub1_Sub3_2.method474(local97[2]);
				this.aClass1_Sub1_Sub3_2.method474(local97[3]);
				this.aClass1_Sub1_Sub3_2.method474(signlink.anInt926);
				this.aClass1_Sub1_Sub3_2.method477(arg0);
				this.aClass1_Sub1_Sub3_2.method477(arg1);
				this.aClass1_Sub1_Sub3_2.method495(aBigInteger1, aBigInteger2);
				this.aClass1_Sub1_Sub3_3.anInt733 = 0;
				if (arg2) {
					this.aClass1_Sub1_Sub3_3.method470(18);
				} else {
					this.aClass1_Sub1_Sub3_3.method470(16);
				}
				this.aClass1_Sub1_Sub3_3.method470(this.aClass1_Sub1_Sub3_2.anInt733 + 36 + 1 + 1 + 2);
				this.aClass1_Sub1_Sub3_3.method470(255);
				this.aClass1_Sub1_Sub3_3.method471(295);
				this.aClass1_Sub1_Sub3_3.method470(aBoolean66 ? 1 : 0);
				for (local223 = 0; local223 < 9; local223++) {
					this.aClass1_Sub1_Sub3_3.method474(this.anIntArray61[local223]);
				}
				this.aClass1_Sub1_Sub3_3.method478(this.aClass1_Sub1_Sub3_2.anInt733, this.aClass1_Sub1_Sub3_2.aByteArray9);
				this.aClass1_Sub1_Sub3_2.aClass46_2 = new Class46(true, local97);
				for (local257 = 0; local257 < 4; local257++) {
					local97[local257] += 50;
				}
				this.aClass46_1 = new Class46(true, local97);
				this.aClass8_1.method251(this.aClass1_Sub1_Sub3_3.anInt733, this.aClass1_Sub1_Sub3_3.aByteArray9, 459);
				local74 = this.aClass8_1.method248();
			}
			if (local74 == 1) {
				try {
					Thread.sleep(2000L);
				} catch (@Pc(299) Exception local299) {
				}
				this.method158(arg0, arg1, arg2);
			} else {
				@Pc(387) int local387;
				if (local74 == 2) {
					this.anInt285 = this.aClass8_1.method248();
					aBoolean58 = this.aClass8_1.method248() == 1;
					this.aLong14 = 0L;
					this.anInt309 = 0;
					this.aClass11_1.anInt528 = 0;
					super.aBoolean46 = true;
					this.aBoolean52 = true;
					this.aBoolean48 = true;
					this.aClass1_Sub1_Sub3_2.anInt733 = 0;
					this.aClass1_Sub1_Sub3_4.anInt733 = 0;
					this.anInt249 = -1;
					this.anInt406 = -1;
					this.anInt407 = -1;
					this.anInt408 = -1;
					this.anInt248 = 0;
					this.anInt250 = 0;
					this.anInt385 = 0;
					this.anInt252 = 0;
					this.anInt326 = 0;
					this.anInt332 = 0;
					this.aBoolean88 = false;
					super.anInt192 = 0;
					for (local387 = 0; local387 < 100; local387++) {
						this.aStringArray3[local387] = null;
					}
					this.anInt289 = 0;
					this.anInt260 = 0;
					this.anInt395 = 0;
					this.anInt351 = 0;
					this.anInt336 = (int) (Math.random() * 100.0D) - 50;
					this.anInt296 = (int) (Math.random() * 110.0D) - 55;
					this.anInt218 = (int) (Math.random() * 80.0D) - 40;
					this.anInt264 = (int) (Math.random() * 120.0D) - 60;
					this.anInt362 = (int) (Math.random() * 30.0D) - 20;
					this.anInt225 = (int) (Math.random() * 20.0D) - 10 & 0x7FF;
					this.anInt229 = 0;
					this.anInt345 = -1;
					this.anInt370 = 0;
					this.anInt371 = 0;
					this.anInt273 = 0;
					this.anInt242 = 0;
					for (local223 = 0; local223 < this.anInt271; local223++) {
						this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local223] = null;
						this.aClass1_Sub1_Sub3Array1[local223] = null;
					}
					for (local257 = 0; local257 < 16384; local257++) {
						this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local257] = null;
					}
					aClass1_Sub1_Sub1_Sub1_Sub1_1 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[this.anInt272] = new Class1_Sub1_Sub1_Sub1_Sub1();
					this.aClass29_2.method515();
					this.aClass29_1.method515();
					@Pc(532) int local532;
					@Pc(536) int local536;
					for (@Pc(528) int local528 = 0; local528 < 4; local528++) {
						for (local532 = 0; local532 < 104; local532++) {
							for (local536 = 0; local536 < 104; local536++) {
								this.aClass29ArrayArrayArray1[local528][local532][local536] = null;
							}
						}
					}
					this.aClass29_3 = new Class29(-794);
					this.anInt233 = 0;
					this.anInt232 = 0;
					this.anInt333 = -1;
					this.anInt209 = -1;
					this.anInt220 = -1;
					this.anInt327 = -1;
					this.anInt398 = -1;
					this.aBoolean73 = false;
					this.anInt241 = 3;
					this.aBoolean50 = false;
					this.aBoolean88 = false;
					this.aBoolean77 = false;
					this.aString4 = null;
					this.anInt386 = 0;
					this.anInt397 = -1;
					this.aBoolean85 = true;
					this.method214();
					for (local532 = 0; local532 < 5; local532++) {
						this.anIntArray71[local532] = 0;
					}
					for (local536 = 0; local536 < 5; local536++) {
						this.aStringArray1[local536] = null;
						this.aBooleanArray3[local536] = false;
					}
					anInt286 = 0;
					anInt294 = 0;
					anInt369 = 0;
					anInt354 = 0;
					anInt279 = 0;
					anInt207 = 0;
					anInt412 = 0;
					anInt411 = 0;
					anInt355 = 0;
					this.method224((byte) 6);
				} else if (local74 == 3) {
					this.aString5 = "";
					this.aString6 = "Invalid username or password.";
				} else if (local74 == 4) {
					this.aString5 = "Your account has been disabled.";
					this.aString6 = "Please check your message-centre for details.";
				} else if (local74 == 5) {
					this.aString5 = "Your account is already logged in.";
					this.aString6 = "Try again in 60 secs...";
				} else if (local74 == 6) {
					this.aString5 = "RuneScape has been updated!";
					this.aString6 = "Please reload this page.";
				} else if (local74 == 7) {
					this.aString5 = "This world is full.";
					this.aString6 = "Please use a different world.";
				} else if (local74 == 8) {
					this.aString5 = "Unable to connect.";
					this.aString6 = "Login server offline.";
				} else if (local74 == 9) {
					this.aString5 = "Login limit exceeded.";
					this.aString6 = "Too many connections from your address.";
				} else if (local74 == 10) {
					this.aString5 = "Unable to connect.";
					this.aString6 = "Bad session id.";
				} else if (local74 == 11) {
					this.aString6 = "Login server rejected session.";
					this.aString6 = "Please try again.";
				} else if (local74 == 12) {
					this.aString5 = "You need a members account to login to this world.";
					this.aString6 = "Please subscribe, or use a different world.";
				} else if (local74 == 13) {
					this.aString5 = "Could not complete login.";
					this.aString6 = "Please try using a different world.";
				} else if (local74 == 14) {
					this.aString5 = "The server is being updated.";
					this.aString6 = "Please wait 1 minute and try again.";
				} else if (local74 == 15) {
					this.aBoolean48 = true;
					this.aClass1_Sub1_Sub3_2.anInt733 = 0;
					this.aClass1_Sub1_Sub3_4.anInt733 = 0;
					this.anInt249 = -1;
					this.anInt406 = -1;
					this.anInt407 = -1;
					this.anInt408 = -1;
					this.anInt248 = 0;
					this.anInt250 = 0;
					this.anInt385 = 0;
					this.anInt332 = 0;
					this.aBoolean88 = false;
					this.aLong16 = System.currentTimeMillis();
				} else if (local74 == 16) {
					this.aString5 = "Login attempts exceeded.";
					this.aString6 = "Please wait 1 minute and try again.";
				} else if (local74 == 17) {
					this.aString5 = "You are standing in a members-only area.";
					this.aString6 = "To play on this world move to a free area first";
				} else if (local74 == 20) {
					this.aString5 = "Invalid loginserver requested";
					this.aString6 = "Please try using a different world.";
				} else if (local74 == 21) {
					for (local387 = this.aClass8_1.method248(); local387 >= 0; local387--) {
						this.aString5 = "You have only just left another world";
						this.aString6 = "Your profile will be transferred in: " + local387 + " seconds";
						this.method125(true);
						try {
							Thread.sleep(1000L);
						} catch (@Pc(897) Exception local897) {
						}
					}
					this.method158(arg0, arg1, arg2);
				} else if (local74 == -1) {
					this.aString5 = "No response from server";
					this.aString6 = "Please try using a different world.";
				} else {
					System.out.println("response:" + local74);
					this.aString5 = "Unexpected server response";
					this.aString6 = "Please try using a different world.";
				}
			}
		} catch (@Pc(933) IOException local933) {
			this.aString5 = "";
			this.aString6 = "Error connecting to server.";
		}
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(B)V")
	private void method159() {
		try {
			if (this.anInt326 == 2) {
				this.method207(this.anInt381 * 2, (this.anInt380 - this.anInt214 << 7) + this.anInt383, (this.anInt379 - this.anInt213 << 7) + this.anInt382);
				if (this.anInt287 > -1 && anInt236 % 20 < 10) {
					this.aClass1_Sub1_Sub2_Sub2Array5[2].method391(this.anInt287 - 12, this.anInt288 - 28);
				}
			}
		} catch (@Pc(66) RuntimeException local66) {
			signlink.reporterror("63443, " + 46 + ", " + local66.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "z", descriptor = "(I)V")
	private void method160() {
		try {
			if (this.anInt335 != 0) {
				@Pc(5) int local5 = 0;
				if (this.anInt385 != 0) {
					local5 = 1;
				}
				for (@Pc(16) int local16 = 0; local16 < 100; local16++) {
					if (this.aStringArray3[local16] != null) {
						@Pc(28) int local28 = this.anIntArray40[local16];
						@Pc(33) String local33 = this.aStringArray2[local16];
						if (local33 != null && local33.startsWith("@cr1@")) {
							local33 = local33.substring(5);
						}
						if (local33 != null && local33.startsWith("@cr2@")) {
							local33 = local33.substring(5);
						}
						if ((local28 == 3 || local28 == 7) && (local28 == 7 || this.anInt353 == 0 || this.anInt353 == 1 && this.method185(this.anInt325, local33))) {
							@Pc(87) int local87 = 329 - local5 * 13;
							if (super.anInt194 > 4 && super.anInt195 - 4 > local87 - 10 && super.anInt195 - 4 <= local87 + 3) {
								@Pc(126) int local126 = this.aClass1_Sub1_Sub2_Sub4_2.method449("From:  " + local33 + this.aStringArray3[local16]) + 25;
								if (local126 > 450) {
									local126 = 450;
								}
								if (super.anInt194 < local126 + 4) {
									if (this.anInt285 >= 1) {
										this.aStringArray6[this.anInt332] = "Report abuse @whi@" + local33;
										this.anIntArray80[this.anInt332] = 2524;
										this.anInt332++;
									}
									this.aStringArray6[this.anInt332] = "Add ignore @whi@" + local33;
									this.anIntArray80[this.anInt332] = 2047;
									this.anInt332++;
									this.aStringArray6[this.anInt332] = "Add friend @whi@" + local33;
									this.anIntArray80[this.anInt332] = 2605;
									this.anInt332++;
								}
							}
							local5++;
							if (local5 >= 5) {
								return;
							}
						}
						if ((local28 == 5 || local28 == 6) && this.anInt353 < 2) {
							local5++;
							if (local5 >= 5) {
								return;
							}
						}
					}
				}
			}
		} catch (@Pc(239) RuntimeException local239) {
			signlink.reporterror("17826, " + 31570 + ", " + local239.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(II[B)Z")
	private boolean method161(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1) {
		try {
			return arg1 == null ? true : signlink.wavesave(arg1, arg0);
		} catch (@Pc(18) RuntimeException local18) {
			signlink.reporterror("52563, " + arg0 + ", " + 875 + ", " + arg1 + ", " + local18.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "A", descriptor = "(I)V")
	private void method162() {
		try {
			this.aClass1_Sub1_Sub2_Sub3_12 = new Class1_Sub1_Sub2_Sub3(this.aClass47_1, "titlebox", 0);
			this.anInt248 += 0;
			this.aClass1_Sub1_Sub2_Sub3_13 = new Class1_Sub1_Sub2_Sub3(this.aClass47_1, "titlebutton", 0);
			this.aClass1_Sub1_Sub2_Sub3Array4 = new Class1_Sub1_Sub2_Sub3[12];
			@Pc(31) int local31 = 0;
			try {
				local31 = Integer.parseInt(this.getParameter("fl_icon"));
			} catch (@Pc(38) Exception local38) {
			}
			@Pc(42) int local42;
			if (local31 == 0) {
				for (local42 = 0; local42 < 12; local42++) {
					this.aClass1_Sub1_Sub2_Sub3Array4[local42] = new Class1_Sub1_Sub2_Sub3(this.aClass47_1, "runes", local42);
				}
			} else {
				for (local42 = 0; local42 < 12; local42++) {
					this.aClass1_Sub1_Sub2_Sub3Array4[local42] = new Class1_Sub1_Sub2_Sub3(this.aClass47_1, "runes", (local42 & 0x3) + 12);
				}
			}
			this.aClass1_Sub1_Sub2_Sub2_8 = new Class1_Sub1_Sub2_Sub2(128, 265);
			this.aClass1_Sub1_Sub2_Sub2_9 = new Class1_Sub1_Sub2_Sub2(128, 265);
			for (local42 = 0; local42 < 33920; local42++) {
				this.aClass1_Sub1_Sub2_Sub2_8.anIntArray208[local42] = this.aClass35_22.anIntArray231[local42];
			}
			for (@Pc(118) int local118 = 0; local118 < 33920; local118++) {
				this.aClass1_Sub1_Sub2_Sub2_9.anIntArray208[local118] = this.aClass35_23.anIntArray231[local118];
			}
			this.anIntArray90 = new int[256];
			for (@Pc(140) int local140 = 0; local140 < 64; local140++) {
				this.anIntArray90[local140] = local140 * 262144;
			}
			for (@Pc(155) int local155 = 0; local155 < 64; local155++) {
				this.anIntArray90[local155 + 64] = local155 * 1024 + 16711680;
			}
			for (@Pc(174) int local174 = 0; local174 < 64; local174++) {
				this.anIntArray90[local174 + 128] = local174 * 4 + 16776960;
			}
			for (@Pc(193) int local193 = 0; local193 < 64; local193++) {
				this.anIntArray90[local193 + 192] = 16777215;
			}
			this.anIntArray91 = new int[256];
			for (@Pc(212) int local212 = 0; local212 < 64; local212++) {
				this.anIntArray91[local212] = local212 * 1024;
			}
			for (@Pc(227) int local227 = 0; local227 < 64; local227++) {
				this.anIntArray91[local227 + 64] = local227 * 4 + 65280;
			}
			for (@Pc(246) int local246 = 0; local246 < 64; local246++) {
				this.anIntArray91[local246 + 128] = local246 * 262144 + 65535;
			}
			for (@Pc(265) int local265 = 0; local265 < 64; local265++) {
				this.anIntArray91[local265 + 192] = 16777215;
			}
			this.anIntArray92 = new int[256];
			for (@Pc(284) int local284 = 0; local284 < 64; local284++) {
				this.anIntArray92[local284] = local284 * 4;
			}
			for (@Pc(299) int local299 = 0; local299 < 64; local299++) {
				this.anIntArray92[local299 + 64] = local299 * 262144 + 255;
			}
			for (@Pc(318) int local318 = 0; local318 < 64; local318++) {
				this.anIntArray92[local318 + 128] = local318 * 1024 + 16711935;
			}
			for (@Pc(337) int local337 = 0; local337 < 64; local337++) {
				this.anIntArray92[local337 + 192] = 16777215;
			}
			this.anIntArray89 = new int[256];
			this.anIntArray67 = new int[32768];
			this.anIntArray68 = new int[32768];
			this.method192(null);
			this.anIntArray59 = new int[32768];
			this.anIntArray60 = new int[32768];
			this.method96(10, "Connecting to fileserver");
			if (!this.aBoolean62) {
				this.aBoolean53 = true;
				this.aBoolean62 = true;
				this.method95(this, 2);
			}
		} catch (@Pc(394) RuntimeException local394) {
			signlink.reporterror("63479, " + 0 + ", " + local394.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(II)V")
	private void method163(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			if (arg1 > 0) {
				@Pc(6) Class6 local6 = Class6.aClass6Array1[arg0];
				for (@Pc(8) int local8 = 0; local8 < local6.anIntArray98.length && local6.anIntArray98[local8] != -1; local8++) {
					@Pc(23) Class6 local23 = Class6.aClass6Array1[local6.anIntArray98[local8]];
					if (local23.anInt420 == 1) {
						this.method163(local23.anInt418, this.anInt320);
					}
					local23.anInt416 = 0;
					local23.anInt417 = 0;
				}
			}
		} catch (@Pc(47) RuntimeException local47) {
			signlink.reporterror("35002, " + arg0 + ", " + arg1 + ", " + local47.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "B", descriptor = "(I)V")
	private void method164(@OriginalArg(0) int arg0) {
		try {
			if (arg0 == this.anInt352) {
				for (@Pc(8) int local8 = -1; local8 < this.anInt273; local8++) {
					@Pc(16) int local16;
					if (local8 == -1) {
						local16 = this.anInt272;
					} else {
						local16 = this.anIntArray53[local8];
					}
					@Pc(28) Class1_Sub1_Sub1_Sub1_Sub1 local28 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local16];
					if (local28 != null) {
						this.method112(1, local28);
					}
				}
			}
		} catch (@Pc(42) RuntimeException local42) {
			signlink.reporterror("53460, " + arg0 + ", " + local42.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "f", descriptor = "(B)V")
	private void method165() {
		try {
			while (true) {
				@Pc(12) Class1_Sub1_Sub4 local12 = this.aClass44_Sub1_1.method647();
				if (local12 == null) {
					return;
				}
				if (local12.anInt761 == 0) {
					Class1_Sub1_Sub1_Sub5.method259(local12.anInt762, local12.aByteArray10);
					if ((this.aClass44_Sub1_1.method643(local12.anInt762) & 0x62) != 0) {
						this.aBoolean92 = true;
						if (this.anInt209 != -1) {
							this.aBoolean99 = true;
						}
					}
				}
				if (local12.anInt761 == 1 && local12.aByteArray10 != null) {
					Class12.method303(255, local12.aByteArray10);
				}
				if (local12.anInt761 == 2 && local12.anInt762 == this.anInt360 && local12.aByteArray10 != null) {
					this.method184(this.aBoolean87, local12.aByteArray10);
				}
				if (local12.anInt761 == 3 && this.anInt395 == 1) {
					for (@Pc(83) int local83 = 0; local83 < this.aByteArrayArray2.length; local83++) {
						if (this.anIntArray36[local83] == local12.anInt762) {
							this.aByteArrayArray2[local83] = local12.aByteArray10;
							if (local12.aByteArray10 == null) {
								this.anIntArray36[local83] = -1;
							}
							break;
						}
						if (this.anIntArray37[local83] == local12.anInt762) {
							this.aByteArrayArray1[local83] = local12.aByteArray10;
							if (local12.aByteArray10 == null) {
								this.anIntArray37[local83] = -1;
							}
							break;
						}
					}
				}
				if (local12.anInt761 == 93 && this.aClass44_Sub1_1.method642(local12.anInt762)) {
					Class4.method59(this.aClass44_Sub1_1, new Class1_Sub1_Sub3(local12.aByteArray10, aBoolean64));
				}
			}
		} catch (@Pc(160) RuntimeException local160) {
			signlink.reporterror("65446, " + -126 + ", " + local160.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
	@Override
	public String getParameter(@OriginalArg(0) String arg0) {
		return signlink.mainapp == null ? super.getParameter(arg0) : signlink.mainapp.getParameter(arg0);
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(II)V")
	private void method166(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(4) int local4 = Class39.aClass39Array1[arg0].anInt882;
			@Pc(8) boolean local8 = false;
			if (local4 != 0) {
				@Pc(16) int local16 = this.anIntArray73[arg0];
				if (local4 == 1) {
					if (local16 == 1) {
						Class1_Sub1_Sub2_Sub1.method351(0.9D);
					}
					if (local16 == 2) {
						Class1_Sub1_Sub2_Sub1.method351(0.8D);
					}
					if (local16 == 3) {
						Class1_Sub1_Sub2_Sub1.method351(0.7D);
					}
					if (local16 == 4) {
						Class1_Sub1_Sub2_Sub1.method351(0.6D);
					}
					Class15.aClass40_8.method593();
					this.aBoolean98 = true;
				}
				if (local4 == 3) {
					@Pc(54) boolean local54 = this.aBoolean56;
					if (local16 == 0) {
						this.method210(this.aBoolean56, 0);
						this.aBoolean56 = true;
					}
					if (local16 == 1) {
						this.method210(this.aBoolean56, -400);
						this.aBoolean56 = true;
					}
					if (local16 == 2) {
						this.method210(this.aBoolean56, -800);
						this.aBoolean56 = true;
					}
					if (local16 == 3) {
						this.method210(this.aBoolean56, -1200);
						this.aBoolean56 = true;
					}
					if (local16 == 4) {
						this.aBoolean56 = false;
					}
					if (this.aBoolean56 != local54 && !aBoolean66) {
						if (this.aBoolean56) {
							this.anInt360 = this.anInt364;
							this.aBoolean87 = true;
							this.aClass44_Sub1_1.method645(2, this.anInt360);
						} else {
							this.method200();
						}
						this.anInt343 = 0;
					}
				}
				if (local4 == 4) {
					if (local16 == 0) {
						this.aBoolean70 = true;
						this.method227((byte) 2, 0);
					}
					if (local16 == 1) {
						this.aBoolean70 = true;
						this.method227((byte) 2, -400);
					}
					if (local16 == 2) {
						this.aBoolean70 = true;
						this.method227((byte) 2, -800);
					}
					if (local16 == 3) {
						this.aBoolean70 = true;
						this.method227((byte) 2, -1200);
					}
					if (local16 == 4) {
						this.aBoolean70 = false;
					}
				}
				if (local4 == 5) {
					this.anInt280 = local16;
				}
				if (local4 == 6) {
					this.anInt234 = local16;
				}
				if (local4 == 8) {
					this.anInt335 = local16;
					this.aBoolean99 = true;
				}
				if (local4 == 9) {
					this.anInt281 = local16;
				}
			}
		} catch (@Pc(214) RuntimeException local214) {
			signlink.reporterror("10515, " + arg0 + ", " + arg1 + ", " + local214.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "C", descriptor = "(I)V")
	private void method167() {
		try {
			for (@Pc(3) int local3 = 0; local3 < this.anInt351; local3++) {
				if (this.anIntArray32[local3] <= 0) {
					@Pc(12) boolean local12 = false;
					try {
						if (this.anIntArray87[local3] != this.anInt366 || this.anIntArray38[local3] != this.anInt205) {
							@Pc(45) Class1_Sub1_Sub3 local45 = Class5.method79(this.anIntArray38[local3], this.anIntArray87[local3]);
							if (System.currentTimeMillis() + (long) (local45.anInt733 / 22) > this.aLong15 + (long) (this.anInt322 / 22)) {
								this.anInt322 = local45.anInt733;
								this.aLong15 = System.currentTimeMillis();
								if (this.method161(local45.anInt733, local45.aByteArray9)) {
									this.anInt366 = this.anIntArray87[local3];
									this.anInt205 = this.anIntArray38[local3];
								} else {
									local12 = true;
								}
							}
						} else if (!this.method152()) {
							local12 = true;
						}
					} catch (@Pc(95) Exception local95) {
					}
					if (local12 && this.anIntArray32[local3] != -5) {
						this.anIntArray32[local3] = -5;
					} else {
						this.anInt351--;
						for (@Pc(111) int local111 = local3; local111 < this.anInt351; local111++) {
							this.anIntArray87[local111] = this.anIntArray87[local111 + 1];
							this.anIntArray38[local111] = this.anIntArray38[local111 + 1];
							this.anIntArray32[local111] = this.anIntArray32[local111 + 1];
						}
						local3--;
					}
				} else {
					@Pc(163) int local163 = this.anIntArray32[local3]--;
				}
			}
			if (this.anInt343 > 0) {
				this.anInt343 -= 20;
				if (this.anInt343 < 0) {
					this.anInt343 = 0;
				}
				if (this.anInt343 == 0 && this.aBoolean56 && !aBoolean66) {
					this.anInt360 = this.anInt364;
					this.aBoolean87 = true;
					this.aClass44_Sub1_1.method645(2, this.anInt360);
					return;
				}
			}
		} catch (@Pc(213) RuntimeException local213) {
			signlink.reporterror("48421, " + 34790 + ", " + local213.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "k", descriptor = "(Z)V")
	private void method168() {
		try {
			this.aClass35_7.method524();
			@Pc(18) int local18;
			@Pc(20) int local20;
			if (this.anInt229 == 2) {
				@Pc(13) byte[] local13 = this.aClass1_Sub1_Sub2_Sub3_2.aByteArray7;
				@Pc(15) int[] local15 = Class1_Sub1_Sub2.anIntArray213;
				local18 = local13.length;
				for (local20 = 0; local20 < local18; local20++) {
					if (local13[local20] == 0) {
						local15[local20] = 0;
					}
				}
				this.aClass1_Sub1_Sub2_Sub2_10.method395(33, 25, 256, 33, 25, this.anIntArray41, 0, 0, this.anIntArray77, this.anInt225);
				this.aClass35_8.method524();
			} else {
				@Pc(64) int local64 = this.anInt225 + this.anInt264 & 0x7FF;
				@Pc(71) int local71 = aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt982 / 32 + 48;
				local18 = 464 - aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt983 / 32;
				this.aClass1_Sub1_Sub2_Sub2_11.method395(146, local18, this.anInt362 + 256, 151, local71, this.anIntArray86, 25, 5, this.anIntArray64, local64);
				this.aClass1_Sub1_Sub2_Sub2_10.method395(33, 25, 256, 33, 25, this.anIntArray41, 0, 0, this.anIntArray77, this.anInt225);
				for (local20 = 0; local20 < this.anInt212; local20++) {
					local71 = this.anIntArray33[local20] * 4 + 2 - aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt982 / 32;
					local18 = this.anIntArray34[local20] * 4 + 2 - aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt983 / 32;
					this.method188(local71, this.aClass1_Sub1_Sub2_Sub2Array4[local20], 83, local18);
				}
				@Pc(173) int local173;
				for (@Pc(169) int local169 = 0; local169 < 104; local169++) {
					for (local173 = 0; local173 < 104; local173++) {
						@Pc(185) Class29 local185 = this.aClass29ArrayArrayArray1[this.anInt334][local169][local173];
						if (local185 != null) {
							local71 = local169 * 4 + 2 - aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt982 / 32;
							local18 = local173 * 4 + 2 - aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt983 / 32;
							this.method188(local71, this.aClass1_Sub1_Sub2_Sub2_2, 83, local18);
						}
					}
				}
				for (local173 = 0; local173 < this.anInt242; local173++) {
					@Pc(236) Class1_Sub1_Sub1_Sub1_Sub2 local236 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[this.anIntArray42[local173]];
					if (local236 != null && local236.method680(this.aBoolean93)) {
						@Pc(246) Class13 local246 = local236.aClass13_2;
						if (local246.anIntArray174 != null) {
							local246 = local246.method327();
						}
						if (local246 != null && local246.aBoolean153) {
							local71 = local236.anInt982 / 32 - aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt982 / 32;
							local18 = local236.anInt983 / 32 - aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt983 / 32;
							this.method188(local71, this.aClass1_Sub1_Sub2_Sub2_3, 83, local18);
						}
					}
				}
				@Pc(302) Class1_Sub1_Sub1_Sub1_Sub1 local302;
				for (@Pc(292) int local292 = 0; local292 < this.anInt273; local292++) {
					local302 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[this.anIntArray53[local292]];
					if (local302 != null && local302.method680(this.aBoolean93)) {
						local71 = local302.anInt982 / 32 - aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt982 / 32;
						local18 = local302.anInt983 / 32 - aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt983 / 32;
						@Pc(331) boolean local331 = false;
						@Pc(335) long local335 = Class48.method667(local302.aString3);
						for (@Pc(337) int local337 = 0; local337 < this.anInt232; local337++) {
							if (local335 == this.aLongArray3[local337] && this.anIntArray85[local337] != 0) {
								local331 = true;
								break;
							}
						}
						if (aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt140 != 0 && local302.anInt140 != 0) {
							if (aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt140 == local302.anInt140) {
								local331 = true;
							} else {
								local331 = false;
							}
						}
						if (local331) {
							this.method188(local71, this.aClass1_Sub1_Sub2_Sub2_5, 83, local18);
						} else {
							this.method188(local71, this.aClass1_Sub1_Sub2_Sub2_4, 83, local18);
						}
					}
				}
				if (this.anInt326 != 0 && anInt236 % 20 < 10) {
					if (this.anInt326 == 1 && this.anInt211 >= 0 && this.anInt211 < this.aClass1_Sub1_Sub1_Sub1_Sub2Array1.length) {
						@Pc(427) Class1_Sub1_Sub1_Sub1_Sub2 local427 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[this.anInt211];
						if (local427 != null) {
							local71 = local427.anInt982 / 32 - aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt982 / 32;
							local18 = local427.anInt983 / 32 - aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt983 / 32;
							this.method191(this.aClass1_Sub1_Sub2_Sub2_7, local18, local71);
						}
					}
					if (this.anInt326 == 2) {
						local71 = (this.anInt379 - this.anInt213) * 4 + 2 - aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt982 / 32;
						local18 = (this.anInt380 - this.anInt214) * 4 + 2 - aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt983 / 32;
						this.method191(this.aClass1_Sub1_Sub2_Sub2_7, local18, local71);
					}
					if (this.anInt326 == 10 && this.anInt410 >= 0 && this.anInt410 < this.aClass1_Sub1_Sub1_Sub1_Sub1Array1.length) {
						local302 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[this.anInt410];
						if (local302 != null) {
							local71 = local302.anInt982 / 32 - aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt982 / 32;
							local18 = local302.anInt983 / 32 - aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt983 / 32;
							this.method191(this.aClass1_Sub1_Sub2_Sub2_7, local18, local71);
						}
					}
				}
				if (this.anInt370 != 0) {
					local71 = this.anInt370 * 4 + 2 - aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt982 / 32;
					local18 = this.anInt371 * 4 + 2 - aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt983 / 32;
					this.method188(local71, this.aClass1_Sub1_Sub2_Sub2_6, 83, local18);
				}
				Class1_Sub1_Sub2.method439(16777215, 3, 3, 97, 78, this.aByte7);
				this.aClass35_8.method524();
			}
		} catch (@Pc(593) RuntimeException local593) {
			signlink.reporterror("97268, " + false + ", " + local593.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!gc;IIZI)V")
	private void method169(@OriginalArg(0) Class13 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4) {
		try {
			if (!arg3) {
				aBoolean64 = !aBoolean64;
			}
			if (this.anInt332 < 400) {
				if (arg0.anIntArray174 != null) {
					arg0 = arg0.method327();
				}
				if (arg0 != null) {
					@Pc(27) String local27 = arg0.aString24;
					if (arg0.anInt555 != 0) {
						local27 = local27 + method132(aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt128, arg0.anInt555) + " (level-" + arg0.anInt555 + ")";
					}
					if (this.anInt289 == 1) {
						this.aStringArray6[this.anInt332] = "Use " + this.aString9 + " with @yel@" + local27;
						this.anIntArray80[this.anInt332] = 829;
						this.anIntArray81[this.anInt332] = arg1;
						this.anIntArray78[this.anInt332] = arg4;
						this.anIntArray79[this.anInt332] = arg2;
						this.anInt332++;
					} else if (this.anInt260 != 1) {
						@Pc(165) int local165;
						if (arg0.aStringArray9 != null) {
							for (local165 = 4; local165 >= 0; local165--) {
								if (arg0.aStringArray9[local165] != null && !arg0.aStringArray9[local165].equalsIgnoreCase("attack")) {
									this.aStringArray6[this.anInt332] = arg0.aStringArray9[local165] + " @yel@" + local27;
									if (local165 == 0) {
										this.anIntArray80[this.anInt332] = 242;
									}
									if (local165 == 1) {
										this.anIntArray80[this.anInt332] = 209;
									}
									if (local165 == 2) {
										this.anIntArray80[this.anInt332] = 309;
									}
									if (local165 == 3) {
										this.anIntArray80[this.anInt332] = 852;
									}
									if (local165 == 4) {
										this.anIntArray80[this.anInt332] = 793;
									}
									this.anIntArray81[this.anInt332] = arg1;
									this.anIntArray78[this.anInt332] = arg4;
									this.anIntArray79[this.anInt332] = arg2;
									this.anInt332++;
								}
							}
						}
						if (arg0.aStringArray9 != null) {
							for (local165 = 4; local165 >= 0; local165--) {
								if (arg0.aStringArray9[local165] != null && arg0.aStringArray9[local165].equalsIgnoreCase("attack")) {
									@Pc(289) short local289 = 0;
									if (arg0.anInt555 > aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt128) {
										local289 = 2000;
									}
									this.aStringArray6[this.anInt332] = arg0.aStringArray9[local165] + " @yel@" + local27;
									if (local165 == 0) {
										this.anIntArray80[this.anInt332] = local289 + 242;
									}
									if (local165 == 1) {
										this.anIntArray80[this.anInt332] = local289 + 209;
									}
									if (local165 == 2) {
										this.anIntArray80[this.anInt332] = local289 + 309;
									}
									if (local165 == 3) {
										this.anIntArray80[this.anInt332] = local289 + 852;
									}
									if (local165 == 4) {
										this.anIntArray80[this.anInt332] = local289 + 793;
									}
									this.anIntArray81[this.anInt332] = arg1;
									this.anIntArray78[this.anInt332] = arg4;
									this.anIntArray79[this.anInt332] = arg2;
									this.anInt332++;
								}
							}
						}
						this.aStringArray6[this.anInt332] = "Examine @yel@" + local27;
						this.anIntArray80[this.anInt332] = 1714;
						this.anIntArray81[this.anInt332] = arg1;
						this.anIntArray78[this.anInt332] = arg4;
						this.anIntArray79[this.anInt332] = arg2;
						this.anInt332++;
					} else if ((this.anInt262 & 0x2) == 2) {
						this.aStringArray6[this.anInt332] = this.aString7 + " @yel@" + local27;
						this.anIntArray80[this.anInt332] = 240;
						this.anIntArray81[this.anInt332] = arg1;
						this.anIntArray78[this.anInt332] = arg4;
						this.anIntArray79[this.anInt332] = arg2;
						this.anInt332++;
						return;
					}
				}
			}
		} catch (@Pc(439) RuntimeException local439) {
			signlink.reporterror("82468, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local439.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(II)Z")
	private boolean method170(@OriginalArg(0) int arg0) {
		try {
			if (arg0 < 0) {
				return false;
			}
			@Pc(8) int local8 = this.anIntArray80[arg0];
			if (local8 >= 2000) {
				local8 -= 2000;
			}
			return local8 == 605;
		} catch (@Pc(27) RuntimeException local27) {
			signlink.reporterror("87633, " + arg0 + ", " + -540 + ", " + local27.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "D", descriptor = "(I)V")
	private void method171() {
		try {
			@Pc(9) int local9 = this.anInt314;
			@Pc(12) int local12 = this.anInt315;
			@Pc(15) int local15 = this.anInt316;
			@Pc(18) int local18 = this.anInt317;
			Class1_Sub1_Sub2.method439(6116423, local18, local15, local9, local12, this.aByte7);
			Class1_Sub1_Sub2.method439(0, 16, local15 - 2, local9 + 1, local12 + 1, this.aByte7);
			Class1_Sub1_Sub2.method440(local18 - 19, local12 + 18, 0, local15 - 2, local9 + 1);
			this.aClass1_Sub1_Sub2_Sub4_3.method451(local12 + 14, 6116423, local9 + 3, "Choose Option");
			@Pc(72) int local72 = super.anInt194;
			@Pc(75) int local75 = super.anInt195;
			if (this.anInt313 == 0) {
				local72 -= 4;
				local75 -= 4;
			}
			if (this.anInt313 == 1) {
				local72 -= 553;
				local75 -= 205;
			}
			if (this.anInt313 == 2) {
				local72 -= 17;
				local75 -= 357;
			}
			for (@Pc(94) int local94 = 0; local94 < this.anInt332; local94++) {
				@Pc(109) int local109 = local12 + (this.anInt332 - 1 - local94) * 15 + 31;
				@Pc(111) int local111 = 16777215;
				if (local72 > local9 && local72 < local9 + local15 && local75 > local109 - 13 && local75 < local109 + 3) {
					local111 = 16776960;
				}
				this.aClass1_Sub1_Sub2_Sub4_3.method455(local111, local9 + 3, true, local109, this.aStringArray6[local94]);
			}
		} catch (@Pc(152) RuntimeException local152) {
			signlink.reporterror("87331, " + -567 + ", " + local152.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(I)V")
	@Override
	protected void method90(@OriginalArg(0) int arg0) {
		try {
			if (!this.aBoolean94 && !this.aBoolean72 && !this.aBoolean59) {
				anInt236++;
				if (this.aBoolean48) {
					this.method208((byte) 5);
				} else {
					this.method201();
				}
				this.method165();
				@Pc(31) boolean local31 = false;
			}
		} catch (@Pc(33) RuntimeException local33) {
			signlink.reporterror("55231, " + arg0 + ", " + local33.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Ljava/lang/String;)V")
	private void method172(@OriginalArg(0) String arg0) {
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

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILclient!d;)Z")
	private boolean method173(@OriginalArg(1) Class6 arg0) {
		try {
			if (arg0.anIntArray96 == null) {
				return false;
			}
			for (@Pc(6) int local6 = 0; local6 < arg0.anIntArray96.length; local6++) {
				@Pc(15) int local15 = this.method142(this.aByte8, arg0, local6);
				@Pc(20) int local20 = arg0.anIntArray97[local6];
				if (arg0.anIntArray96[local6] == 2) {
					if (local15 >= local20) {
						return false;
					}
				} else if (arg0.anIntArray96[local6] == 3) {
					if (local15 <= local20) {
						return false;
					}
				} else if (arg0.anIntArray96[local6] == 4) {
					if (local15 == local20) {
						return false;
					}
				} else if (local15 != local20) {
					return false;
				}
			}
			return true;
		} catch (@Pc(75) RuntimeException local75) {
			signlink.reporterror("51756, " + 0 + ", " + arg0 + ", " + local75.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(III)V")
	private void method174(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		try {
			@Pc(1) int local1 = 0;
			@Pc(5) boolean local5 = false;
			for (@Pc(7) int local7 = 0; local7 < 100; local7++) {
				if (this.aStringArray3[local7] != null) {
					@Pc(19) int local19 = this.anIntArray40[local7];
					@Pc(30) int local30 = this.anInt304 + 70 + 4 - local1 * 14;
					if (local30 < -20) {
						break;
					}
					@Pc(38) String local38 = this.aStringArray2[local7];
					if (local38 != null && local38.startsWith("@cr1@")) {
						local38 = local38.substring(5);
					}
					if (local38 != null && local38.startsWith("@cr2@")) {
						local38 = local38.substring(5);
					}
					if (local19 == 0) {
						local1++;
					}
					if ((local19 == 1 || local19 == 2) && (local19 == 1 || this.anInt210 == 0 || this.anInt210 == 1 && this.method185(this.anInt325, local38))) {
						if (arg2 > local30 - 14 && arg2 <= local30 && !local38.equals(aClass1_Sub1_Sub1_Sub1_Sub1_1.aString3)) {
							if (this.anInt285 >= 1) {
								this.aStringArray6[this.anInt332] = "Report abuse @whi@" + local38;
								this.anIntArray80[this.anInt332] = 524;
								this.anInt332++;
							}
							this.aStringArray6[this.anInt332] = "Add ignore @whi@" + local38;
							this.anIntArray80[this.anInt332] = 47;
							this.anInt332++;
							this.aStringArray6[this.anInt332] = "Add friend @whi@" + local38;
							this.anIntArray80[this.anInt332] = 605;
							this.anInt332++;
						}
						local1++;
					}
					if ((local19 == 3 || local19 == 7) && this.anInt335 == 0 && (local19 == 7 || this.anInt353 == 0 || this.anInt353 == 1 && this.method185(this.anInt325, local38))) {
						if (arg2 > local30 - 14 && arg2 <= local30) {
							if (this.anInt285 >= 1) {
								this.aStringArray6[this.anInt332] = "Report abuse @whi@" + local38;
								this.anIntArray80[this.anInt332] = 524;
								this.anInt332++;
							}
							this.aStringArray6[this.anInt332] = "Add ignore @whi@" + local38;
							this.anIntArray80[this.anInt332] = 47;
							this.anInt332++;
							this.aStringArray6[this.anInt332] = "Add friend @whi@" + local38;
							this.anIntArray80[this.anInt332] = 605;
							this.anInt332++;
						}
						local1++;
					}
					if (local19 == 4 && (this.anInt293 == 0 || this.anInt293 == 1 && this.method185(this.anInt325, local38))) {
						if (arg2 > local30 - 14 && arg2 <= local30) {
							this.aStringArray6[this.anInt332] = "Accept trade @whi@" + local38;
							this.anIntArray80[this.anInt332] = 507;
							this.anInt332++;
						}
						local1++;
					}
					if ((local19 == 5 || local19 == 6) && this.anInt335 == 0 && this.anInt353 < 2) {
						local1++;
					}
					if (local19 == 8 && (this.anInt293 == 0 || this.anInt293 == 1 && this.method185(this.anInt325, local38))) {
						if (arg2 > local30 - 14 && arg2 <= local30) {
							this.aStringArray6[this.anInt332] = "Accept challenge @whi@" + local38;
							this.anIntArray80[this.anInt332] = 957;
							this.anInt332++;
						}
						local1++;
					}
				}
			}
		} catch (@Pc(407) RuntimeException local407) {
			signlink.reporterror("85166, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local407.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "l", descriptor = "(Z)Z")
	private boolean method175(@OriginalArg(0) boolean arg0) {
		try {
			this.aBoolean48 &= arg0;
			if (this.aClass8_1 == null) {
				return false;
			}
			@Pc(1783) String local1783;
			@Pc(284) int local284;
			try {
				@Pc(16) int local16 = this.aClass8_1.method249();
				if (local16 == 0) {
					return false;
				}
				if (this.anInt249 == -1) {
					this.aClass8_1.method250(this.aClass1_Sub1_Sub3_4.aByteArray9, 0, 1);
					this.anInt249 = this.aClass1_Sub1_Sub3_4.aByteArray9[0] & 0xFF;
					if (this.aClass46_1 != null) {
						this.anInt249 = this.anInt249 - this.aClass46_1.method662() & 0xFF;
					}
					this.anInt248 = Class17.anIntArray210[this.anInt249];
					local16--;
				}
				if (this.anInt248 == -1) {
					if (local16 <= 0) {
						return false;
					}
					this.aClass8_1.method250(this.aClass1_Sub1_Sub3_4.aByteArray9, 0, 1);
					this.anInt248 = this.aClass1_Sub1_Sub3_4.aByteArray9[0] & 0xFF;
					local16--;
				}
				if (this.anInt248 == -2) {
					if (local16 <= 1) {
						return false;
					}
					this.aClass8_1.method250(this.aClass1_Sub1_Sub3_4.aByteArray9, 0, 2);
					this.aClass1_Sub1_Sub3_4.anInt733 = 0;
					this.anInt248 = this.aClass1_Sub1_Sub3_4.method482();
					local16 -= 2;
				}
				if (local16 < this.anInt248) {
					return false;
				}
				this.aClass1_Sub1_Sub3_4.anInt733 = 0;
				this.aClass8_1.method250(this.aClass1_Sub1_Sub3_4.aByteArray9, 0, this.anInt248);
				this.anInt250 = 0;
				this.anInt408 = this.anInt407;
				this.anInt407 = this.anInt406;
				this.anInt406 = this.anInt249;
				if (this.anInt249 == 89) {
					this.aBoolean100 = true;
					this.anInt299 = this.aClass1_Sub1_Sub3_4.method480();
					this.anInt300 = this.aClass1_Sub1_Sub3_4.method480();
					this.anInt301 = this.aClass1_Sub1_Sub3_4.method482();
					this.anInt302 = this.aClass1_Sub1_Sub3_4.method480();
					this.anInt303 = this.aClass1_Sub1_Sub3_4.method480();
					if (this.anInt303 >= 100) {
						this.anInt266 = this.anInt299 * 128 + 64;
						this.anInt268 = this.anInt300 * 128 + 64;
						this.anInt267 = this.method178(this.anInt266, this.anInt268, this.anInt334) - this.anInt301;
					}
					this.anInt249 = -1;
					return true;
				}
				if (this.anInt249 == 20) {
					this.anInt210 = this.aClass1_Sub1_Sub3_4.method480();
					this.anInt353 = this.aClass1_Sub1_Sub3_4.method480();
					this.anInt293 = this.aClass1_Sub1_Sub3_4.method480();
					this.aBoolean83 = true;
					this.aBoolean99 = true;
					this.anInt249 = -1;
					return true;
				}
				if (this.anInt249 == 140) {
					this.method140(this.anInt248, this.aClass1_Sub1_Sub3_4);
					this.aBoolean71 = false;
					this.anInt249 = -1;
					return true;
				}
				@Pc(280) int local280;
				if (this.anInt249 == 38) {
					local280 = this.aClass1_Sub1_Sub3_4.method482();
					local284 = this.aClass1_Sub1_Sub3_4.method482();
					Class6.aClass6Array1[local280].anInt437 = 1;
					Class6.aClass6Array1[local280].anInt438 = local284;
					this.anInt249 = -1;
					return true;
				}
				if (this.anInt249 == 90) {
					local280 = this.aClass1_Sub1_Sub3_4.method482();
					if (local280 == 65535) {
						local280 = -1;
					}
					if (local280 != this.anInt364 && this.aBoolean56 && !aBoolean66 && this.anInt343 == 0) {
						this.anInt360 = local280;
						this.aBoolean87 = true;
						this.aClass44_Sub1_1.method645(2, this.anInt360);
					}
					this.anInt364 = local280;
					this.anInt249 = -1;
					return true;
				}
				if (this.anInt249 == 84) {
					local280 = this.aClass1_Sub1_Sub3_4.method482();
					local284 = this.aClass1_Sub1_Sub3_4.method482();
					if (this.aBoolean56 && !aBoolean66) {
						this.anInt360 = local280;
						this.aBoolean87 = false;
						this.aClass44_Sub1_1.method645(2, this.anInt360);
						this.anInt343 = local284;
					}
					this.anInt249 = -1;
					return true;
				}
				@Pc(442) int local442;
				@Pc(447) int local447;
				@Pc(452) int local452;
				@Pc(457) int local457;
				@Pc(468) int local468;
				if (this.anInt249 == 10) {
					this.aBoolean100 = true;
					this.anInt346 = this.aClass1_Sub1_Sub3_4.method480();
					this.anInt347 = this.aClass1_Sub1_Sub3_4.method480();
					this.anInt348 = this.aClass1_Sub1_Sub3_4.method482();
					this.anInt349 = this.aClass1_Sub1_Sub3_4.method480();
					this.anInt350 = this.aClass1_Sub1_Sub3_4.method480();
					if (this.anInt350 >= 100) {
						local280 = this.anInt346 * 128 + 64;
						local284 = this.anInt347 * 128 + 64;
						local442 = this.method178(local280, local284, this.anInt334) - this.anInt348;
						local447 = local280 - this.anInt266;
						local452 = local442 - this.anInt267;
						local457 = local284 - this.anInt268;
						local468 = (int) Math.sqrt((double) (local447 * local447 + local457 * local457));
						this.anInt269 = (int) (Math.atan2((double) local452, (double) local468) * 325.949D) & 0x7FF;
						this.anInt270 = (int) (Math.atan2((double) local447, (double) local457) * -325.949D) & 0x7FF;
						if (this.anInt269 < 128) {
							this.anInt269 = 128;
						}
						if (this.anInt269 > 383) {
							this.anInt269 = 383;
						}
					}
					this.anInt249 = -1;
					return true;
				}
				if (this.anInt249 == 29) {
					local280 = this.aClass1_Sub1_Sub3_4.method483();
					this.anInt333 = local280;
					this.aBoolean99 = true;
					this.anInt249 = -1;
					return true;
				}
				@Pc(686) int local686;
				@Pc(539) long local539;
				if (this.anInt249 == 106) {
					local539 = this.aClass1_Sub1_Sub3_4.method486();
					local442 = this.aClass1_Sub1_Sub3_4.method480();
					@Pc(549) String local549 = Class48.method671(Class48.method668(local539));
					for (local452 = 0; local452 < this.anInt232; local452++) {
						if (local539 == this.aLongArray3[local452]) {
							if (this.anIntArray85[local452] != local442) {
								this.anIntArray85[local452] = local442;
								this.aBoolean92 = true;
								if (local442 > 0) {
									this.method108("", local549 + " has logged in.", 5);
								}
								if (local442 == 0) {
									this.method108("", local549 + " has logged out.", 5);
								}
							}
							local549 = null;
							break;
						}
					}
					if (local549 != null && this.anInt232 < 200) {
						this.aLongArray3[this.anInt232] = local539;
						this.aStringArray5[this.anInt232] = local549;
						this.anIntArray85[this.anInt232] = local442;
						this.anInt232++;
						this.aBoolean92 = true;
					}
					@Pc(647) boolean local647 = false;
					while (!local647) {
						local647 = true;
						for (local468 = 0; local468 < this.anInt232 - 1; local468++) {
							if (this.anIntArray85[local468] != anInt282 && this.anIntArray85[local468 + 1] == anInt282 || this.anIntArray85[local468] == 0 && this.anIntArray85[local468 + 1] != 0) {
								local686 = this.anIntArray85[local468];
								this.anIntArray85[local468] = this.anIntArray85[local468 + 1];
								this.anIntArray85[local468 + 1] = local686;
								@Pc(708) String local708 = this.aStringArray5[local468];
								this.aStringArray5[local468] = this.aStringArray5[local468 + 1];
								this.aStringArray5[local468 + 1] = local708;
								@Pc(730) long local730 = this.aLongArray3[local468];
								this.aLongArray3[local468] = this.aLongArray3[local468 + 1];
								this.aLongArray3[local468 + 1] = local730;
								this.aBoolean92 = true;
								local647 = false;
							}
						}
					}
					this.anInt249 = -1;
					return true;
				}
				if (this.anInt249 == 108) {
					local280 = this.aClass1_Sub1_Sub3_4.method482();
					Class6.aClass6Array1[local280].anInt437 = 3;
					if (aClass1_Sub1_Sub1_Sub1_Sub1_1.aClass13_1 == null) {
						Class6.aClass6Array1[local280].anInt438 = (aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray14[0] << 25) + (aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray14[4] << 20) + (aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray13[0] << 15) + (aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray13[8] << 10) + (aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray13[11] << 5) + aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray13[1];
					} else {
						Class6.aClass6Array1[local280].anInt438 = (int) (aClass1_Sub1_Sub1_Sub1_Sub1_1.aClass13_1.aLong23 + 305419896L);
					}
					this.anInt249 = -1;
					return true;
				}
				@Pc(854) String local854;
				if (this.anInt249 == 13) {
					local280 = this.aClass1_Sub1_Sub3_4.method482();
					local854 = this.aClass1_Sub1_Sub3_4.method487();
					Class6.aClass6Array1[local280].aString18 = local854;
					if (Class6.aClass6Array1[local280].anInt419 == this.anIntArray55[this.anInt241]) {
						this.aBoolean92 = true;
					}
					this.anInt249 = -1;
					return true;
				}
				if (this.anInt249 == 79) {
					this.anInt233 = this.aClass1_Sub1_Sub3_4.method480();
					this.aBoolean92 = true;
					this.anInt249 = -1;
					return true;
				}
				@Pc(910) Class6 local910;
				if (this.anInt249 == 163) {
					local280 = this.aClass1_Sub1_Sub3_4.method482();
					local284 = this.aClass1_Sub1_Sub3_4.method482();
					local910 = Class6.aClass6Array1[local280];
					if (local910 != null && local910.anInt420 == 0) {
						if (local284 < 0) {
							local284 = 0;
						}
						if (local284 > local910.anInt428 - local910.anInt424) {
							local284 = local910.anInt428 - local910.anInt424;
						}
						local910.anInt429 = local284;
					}
					this.anInt249 = -1;
					return true;
				}
				if (this.anInt249 == 195) {
					this.anInt370 = 0;
					this.anInt249 = -1;
					return true;
				}
				if (this.anInt249 == 50) {
					this.anInt241 = this.aClass1_Sub1_Sub3_4.method480();
					this.aBoolean92 = true;
					this.aBoolean60 = true;
					this.anInt249 = -1;
					return true;
				}
				if (this.anInt249 == 191) {
					local280 = this.aClass1_Sub1_Sub3_4.method482();
					this.method163(local280, this.anInt320);
					if (this.anInt327 != -1) {
						this.anInt327 = -1;
						this.aBoolean92 = true;
						this.aBoolean60 = true;
					}
					if (this.anInt209 != -1) {
						this.anInt209 = -1;
						this.aBoolean99 = true;
					}
					if (this.aBoolean50) {
						this.aBoolean50 = false;
						this.aBoolean99 = true;
					}
					this.anInt220 = local280;
					this.aBoolean73 = false;
					this.anInt249 = -1;
					return true;
				}
				if (this.anInt249 == 53) {
					local280 = this.aClass1_Sub1_Sub3_4.method480();
					local284 = this.aClass1_Sub1_Sub3_4.method480();
					@Pc(1044) String local1044 = this.aClass1_Sub1_Sub3_4.method487();
					if (local280 >= 1 && local280 <= 5) {
						if (local1044.equalsIgnoreCase("null")) {
							local1044 = null;
						}
						this.aStringArray1[local280 - 1] = local1044;
						this.aBooleanArray3[local280 - 1] = local284 == 0;
					}
					this.anInt249 = -1;
					return true;
				}
				if (this.anInt249 == 171) {
					this.anInt397 = this.aClass1_Sub1_Sub3_4.method480();
					if (this.anInt397 == this.anInt241) {
						if (this.anInt397 == 3) {
							this.anInt241 = 1;
						} else {
							this.anInt241 = 3;
						}
						this.aBoolean92 = true;
					}
					this.anInt249 = -1;
					return true;
				}
				if (this.anInt249 == 40) {
					local280 = this.aClass1_Sub1_Sub3_4.method482();
					local284 = this.aClass1_Sub1_Sub3_4.method482();
					if (this.anInt339 == local280 && this.anInt340 == local284 && this.anInt395 == 2) {
						this.anInt249 = -1;
						return true;
					}
					this.anInt339 = local280;
					this.anInt340 = local284;
					this.anInt213 = (this.anInt339 - 6) * 8;
					this.anInt214 = (this.anInt340 - 6) * 8;
					this.aBoolean82 = false;
					if ((this.anInt339 / 8 == 48 || this.anInt339 / 8 == 49) && this.anInt340 / 8 == 48) {
						this.aBoolean82 = true;
					}
					if (this.anInt339 / 8 == 48 && this.anInt340 / 8 == 148) {
						this.aBoolean82 = true;
					}
					this.anInt395 = 1;
					this.aLong16 = System.currentTimeMillis();
					this.aClass35_8.method524();
					this.aClass1_Sub1_Sub2_Sub4_2.method447(257, 0, "Loading - please wait.", 151);
					this.aClass1_Sub1_Sub2_Sub4_2.method447(256, 16777215, "Loading - please wait.", 150);
					this.aClass35_8.method525(4, 4, super.aGraphics2);
					local442 = 0;
					for (local447 = (this.anInt339 - 6) / 8; local447 <= (this.anInt339 + 6) / 8; local447++) {
						for (local452 = (this.anInt340 - 6) / 8; local452 <= (this.anInt340 + 6) / 8; local452++) {
							local442++;
						}
					}
					this.aByteArrayArray2 = new byte[local442][];
					this.aByteArrayArray1 = new byte[local442][];
					this.anIntArray35 = new int[local442];
					this.anIntArray36 = new int[local442];
					this.anIntArray37 = new int[local442];
					local442 = 0;
					for (local452 = (this.anInt339 - 6) / 8; local452 <= (this.anInt339 + 6) / 8; local452++) {
						for (local457 = (this.anInt340 - 6) / 8; local457 <= (this.anInt340 + 6) / 8; local457++) {
							this.anIntArray35[local442] = (local452 << 8) + local457;
							if (this.aBoolean82 && (local457 == 49 || local457 == 149 || local457 == 147 || local452 == 50 || local452 == 49 && local457 == 47)) {
								this.anIntArray36[local442] = -1;
								this.anIntArray37[local442] = -1;
								local442++;
							} else {
								local468 = this.anIntArray36[local442] = this.aClass44_Sub1_1.method640(0, local457, local452);
								if (local468 != -1) {
									this.aClass44_Sub1_1.method645(3, local468);
								}
								local686 = this.anIntArray37[local442] = this.aClass44_Sub1_1.method640(1, local457, local452);
								if (local686 != -1) {
									this.aClass44_Sub1_1.method645(3, local686);
								}
								local442++;
							}
						}
					}
					local457 = this.anInt213 - this.anInt215;
					local468 = this.anInt214 - this.anInt216;
					this.anInt215 = this.anInt213;
					this.anInt216 = this.anInt214;
					for (local686 = 0; local686 < 16384; local686++) {
						@Pc(1449) Class1_Sub1_Sub1_Sub1_Sub2 local1449 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local686];
						if (local1449 != null) {
							for (@Pc(1453) int local1453 = 0; local1453 < 10; local1453++) {
								local1449.anIntArray272[local1453] -= local457;
								local1449.anIntArray273[local1453] -= local468;
							}
							local1449.anInt982 -= local457 * 128;
							local1449.anInt983 -= local468 * 128;
						}
					}
					for (@Pc(1497) int local1497 = 0; local1497 < this.anInt271; local1497++) {
						@Pc(1504) Class1_Sub1_Sub1_Sub1_Sub1 local1504 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local1497];
						if (local1504 != null) {
							for (@Pc(1508) int local1508 = 0; local1508 < 10; local1508++) {
								local1504.anIntArray272[local1508] -= local457;
								local1504.anIntArray273[local1508] -= local468;
							}
							local1504.anInt982 -= local457 * 128;
							local1504.anInt983 -= local468 * 128;
						}
					}
					this.aBoolean71 = true;
					@Pc(1556) byte local1556 = 0;
					@Pc(1558) byte local1558 = 104;
					@Pc(1560) byte local1560 = 1;
					if (local457 < 0) {
						local1556 = 103;
						local1558 = -1;
						local1560 = -1;
					}
					@Pc(1570) byte local1570 = 0;
					@Pc(1572) byte local1572 = 104;
					@Pc(1574) byte local1574 = 1;
					if (local468 < 0) {
						local1570 = 103;
						local1572 = -1;
						local1574 = -1;
					}
					for (@Pc(1584) int local1584 = local1556; local1584 != local1558; local1584 += local1560) {
						for (@Pc(1588) int local1588 = local1570; local1588 != local1572; local1588 += local1574) {
							@Pc(1594) int local1594 = local1584 + local457;
							@Pc(1598) int local1598 = local1588 + local468;
							for (@Pc(1600) int local1600 = 0; local1600 < 4; local1600++) {
								if (local1594 >= 0 && local1598 >= 0 && local1594 < 104 && local1598 < 104) {
									this.aClass29ArrayArrayArray1[local1600][local1584][local1588] = this.aClass29ArrayArrayArray1[local1600][local1594][local1598];
								} else {
									this.aClass29ArrayArrayArray1[local1600][local1584][local1588] = null;
								}
							}
						}
					}
					for (@Pc(1662) Class1_Sub2 local1662 = (Class1_Sub2) this.aClass29_3.method511(); local1662 != null; local1662 = (Class1_Sub2) this.aClass29_3.method513()) {
						local1662.anInt773 -= local457;
						local1662.anInt774 -= local468;
						if (local1662.anInt773 < 0 || local1662.anInt774 < 0 || local1662.anInt773 >= 104 || local1662.anInt774 >= 104) {
							local1662.method673();
						}
					}
					if (this.anInt370 != 0) {
						this.anInt370 -= local457;
						this.anInt371 -= local468;
					}
					this.aBoolean100 = false;
					this.anInt249 = -1;
					return true;
				}
				if (this.anInt249 == 87) {
					local280 = this.aClass1_Sub1_Sub3_4.method482();
					this.method163(local280, this.anInt320);
					if (this.anInt209 != -1) {
						this.anInt209 = -1;
						this.aBoolean99 = true;
					}
					if (this.aBoolean50) {
						this.aBoolean50 = false;
						this.aBoolean99 = true;
					}
					this.anInt327 = local280;
					this.aBoolean92 = true;
					this.aBoolean60 = true;
					this.anInt220 = -1;
					this.aBoolean73 = false;
					this.anInt249 = -1;
					return true;
				}
				@Pc(1799) boolean local1799;
				@Pc(1934) String local1934;
				if (this.anInt249 == 59) {
					local1783 = this.aClass1_Sub1_Sub3_4.method487();
					@Pc(1797) long local1797;
					if (local1783.endsWith(":tradereq:")) {
						local854 = local1783.substring(0, local1783.indexOf(":"));
						local1797 = Class48.method667(local854);
						local1799 = false;
						for (local457 = 0; local457 < this.anInt361; local457++) {
							if (this.aLongArray4[local457] == local1797) {
								local1799 = true;
								break;
							}
						}
						if (!local1799 && this.anInt208 == 0) {
							this.method108(local854, "wishes to trade with you.", 4);
						}
					} else if (local1783.endsWith(":duelreq:")) {
						local854 = local1783.substring(0, local1783.indexOf(":"));
						local1797 = Class48.method667(local854);
						local1799 = false;
						for (local457 = 0; local457 < this.anInt361; local457++) {
							if (this.aLongArray4[local457] == local1797) {
								local1799 = true;
								break;
							}
						}
						if (!local1799 && this.anInt208 == 0) {
							this.method108(local854, "wishes to duel with you.", 8);
						}
					} else if (local1783.endsWith(":chalreq:")) {
						local854 = local1783.substring(0, local1783.indexOf(":"));
						local1797 = Class48.method667(local854);
						local1799 = false;
						for (local457 = 0; local457 < this.anInt361; local457++) {
							if (this.aLongArray4[local457] == local1797) {
								local1799 = true;
								break;
							}
						}
						if (!local1799 && this.anInt208 == 0) {
							local1934 = local1783.substring(local1783.indexOf(":") + 1, local1783.length() - 9);
							this.method108(local854, local1934, 8);
						}
					} else {
						this.method108("", local1783, 0);
					}
					this.anInt249 = -1;
					return true;
				}
				if (this.anInt249 == 77) {
					this.anInt361 = this.anInt248 / 8;
					for (local280 = 0; local280 < this.anInt361; local280++) {
						this.aLongArray4[local280] = this.aClass1_Sub1_Sub3_4.method486();
					}
					this.anInt249 = -1;
					return true;
				}
				if (this.anInt249 == 213) {
					this.anInt326 = this.aClass1_Sub1_Sub3_4.method480();
					if (this.anInt326 == 1) {
						this.anInt211 = this.aClass1_Sub1_Sub3_4.method482();
					}
					if (this.anInt326 >= 2 && this.anInt326 <= 6) {
						if (this.anInt326 == 2) {
							this.anInt382 = 64;
							this.anInt383 = 64;
						}
						if (this.anInt326 == 3) {
							this.anInt382 = 0;
							this.anInt383 = 64;
						}
						if (this.anInt326 == 4) {
							this.anInt382 = 128;
							this.anInt383 = 64;
						}
						if (this.anInt326 == 5) {
							this.anInt382 = 64;
							this.anInt383 = 0;
						}
						if (this.anInt326 == 6) {
							this.anInt382 = 64;
							this.anInt383 = 128;
						}
						this.anInt326 = 2;
						this.anInt379 = this.aClass1_Sub1_Sub3_4.method482();
						this.anInt380 = this.aClass1_Sub1_Sub3_4.method482();
						this.anInt381 = this.aClass1_Sub1_Sub3_4.method480();
					}
					if (this.anInt326 == 10) {
						this.anInt410 = this.aClass1_Sub1_Sub3_4.method482();
					}
					this.anInt249 = -1;
					return true;
				}
				if (this.anInt249 == 237) {
					local280 = this.aClass1_Sub1_Sub3_4.method482();
					local284 = this.aClass1_Sub1_Sub3_4.method482();
					local442 = local284 >> 10 & 0x1F;
					local447 = local284 >> 5 & 0x1F;
					local452 = local284 & 0x1F;
					Class6.aClass6Array1[local280].anInt433 = (local442 << 19) + (local447 << 11) + (local452 << 3);
					this.anInt249 = -1;
					return true;
				}
				if (this.anInt249 == 65) {
					this.anInt311 = this.aClass1_Sub1_Sub3_4.method480();
					this.anInt312 = this.aClass1_Sub1_Sub3_4.method480();
					this.anInt249 = -1;
					return true;
				}
				if (this.anInt249 == 194) {
					this.anInt386 = this.aClass1_Sub1_Sub3_4.method480();
					this.anInt249 = -1;
					return true;
				}
				if (this.anInt249 == 220) {
					local280 = this.aClass1_Sub1_Sub3_4.method482();
					local284 = this.aClass1_Sub1_Sub3_4.method482();
					Class6.aClass6Array1[local280].anInt437 = 2;
					Class6.aClass6Array1[local280].anInt438 = local284;
					this.anInt249 = -1;
					return true;
				}
				if (this.anInt249 == 165) {
					if (this.anInt327 != -1) {
						this.anInt327 = -1;
						this.aBoolean92 = true;
						this.aBoolean60 = true;
					}
					if (this.anInt209 != -1) {
						this.anInt209 = -1;
						this.aBoolean99 = true;
					}
					if (this.aBoolean50) {
						this.aBoolean50 = false;
						this.aBoolean99 = true;
					}
					this.anInt220 = -1;
					this.aBoolean73 = false;
					this.anInt249 = -1;
					return true;
				}
				if (this.anInt249 == 133) {
					local280 = this.aClass1_Sub1_Sub3_4.method482();
					local284 = this.aClass1_Sub1_Sub3_4.method483();
					local910 = Class6.aClass6Array1[local280];
					local910.anInt441 = local284;
					if (local284 == -1) {
						local910.anInt416 = 0;
						local910.anInt417 = 0;
					}
					this.anInt249 = -1;
					return true;
				}
				if (this.anInt249 == 14) {
					if (this.anInt241 == 12) {
						this.aBoolean92 = true;
					}
					this.anInt372 = this.aClass1_Sub1_Sub3_4.method483();
					this.anInt249 = -1;
					return true;
				}
				if (this.anInt249 == 67) {
					this.method190(this.aClass1_Sub1_Sub3_4, this.anInt248);
					this.anInt249 = -1;
					return true;
				}
				if (this.anInt249 == 22) {
					local280 = this.aClass1_Sub1_Sub3_4.method482();
					local284 = this.aClass1_Sub1_Sub3_4.method483();
					local442 = this.aClass1_Sub1_Sub3_4.method483();
					@Pc(2338) Class6 local2338 = Class6.aClass6Array1[local280];
					local2338.anInt425 = local284;
					local2338.anInt426 = local442;
					this.anInt249 = -1;
					return true;
				}
				if (this.anInt249 == 103) {
					local280 = this.aClass1_Sub1_Sub3_4.method483();
					if (local280 >= 0) {
						this.method163(local280, this.anInt320);
					}
					this.anInt398 = local280;
					this.anInt249 = -1;
					return true;
				}
				if (this.anInt249 == 115) {
					local280 = this.aClass1_Sub1_Sub3_4.method482();
					local284 = this.aClass1_Sub1_Sub3_4.method482();
					local442 = this.aClass1_Sub1_Sub3_4.method482();
					if (local284 == 65535) {
						Class6.aClass6Array1[local280].anInt437 = 0;
						this.anInt249 = -1;
						return true;
					}
					@Pc(2404) Class15 local2404 = Class15.method361(local284);
					Class6.aClass6Array1[local280].anInt437 = 4;
					Class6.aClass6Array1[local280].anInt438 = local284;
					Class6.aClass6Array1[local280].anInt444 = local2404.anInt596;
					Class6.aClass6Array1[local280].anInt445 = local2404.anInt597;
					Class6.aClass6Array1[local280].anInt443 = local2404.anInt595 * 100 / local442;
					this.anInt249 = -1;
					return true;
				}
				if (this.anInt249 == 110) {
					local280 = this.aClass1_Sub1_Sub3_4.method482();
					this.method163(local280, this.anInt320);
					if (this.anInt327 != -1) {
						this.anInt327 = -1;
						this.aBoolean92 = true;
						this.aBoolean60 = true;
					}
					this.anInt209 = local280;
					this.aBoolean99 = true;
					this.anInt220 = -1;
					this.aBoolean73 = false;
					this.anInt249 = -1;
					return true;
				}
				if (this.anInt249 == 196 || this.anInt249 == 193 || this.anInt249 == 91 || this.anInt249 == 138 || this.anInt249 == 127 || this.anInt249 == 164 || this.anInt249 == 139 || this.anInt249 == 42 || this.anInt249 == 82 || this.anInt249 == 131 || this.anInt249 == 99) {
					this.method146(this.aClass1_Sub1_Sub3_4, this.anInt249);
					this.anInt249 = -1;
					return true;
				}
				if (this.anInt249 == 219) {
					this.aBoolean100 = false;
					for (local280 = 0; local280 < 5; local280++) {
						this.aBooleanArray4[local280] = false;
					}
					this.anInt249 = -1;
					return true;
				}
				if (this.anInt249 == 247) {
					local280 = this.aClass1_Sub1_Sub3_4.method482();
					local284 = this.aClass1_Sub1_Sub3_4.method480();
					if (local280 == 65535) {
						local280 = -1;
					}
					this.anIntArray55[local284] = local280;
					this.aBoolean92 = true;
					this.aBoolean60 = true;
					this.anInt249 = -1;
					return true;
				}
				if (this.anInt249 == 214) {
					local280 = this.aClass1_Sub1_Sub3_4.method482();
					local284 = this.aClass1_Sub1_Sub3_4.method485();
					this.anIntArray69[local280] = local284;
					if (this.anIntArray73[local280] != local284) {
						this.anIntArray73[local280] = local284;
						this.method166(local280, 179);
						this.aBoolean92 = true;
						if (this.anInt333 != -1) {
							this.aBoolean99 = true;
						}
					}
					this.anInt249 = -1;
					return true;
				}
				if (this.anInt249 == 85) {
					this.anInt247 = this.aClass1_Sub1_Sub3_4.method482();
					this.anInt321 = this.aClass1_Sub1_Sub3_4.method480();
					this.anInt249 = -1;
					return true;
				}
				if (this.anInt249 == 24) {
					if (this.anInt241 == 12) {
						this.aBoolean92 = true;
					}
					this.anInt240 = this.aClass1_Sub1_Sub3_4.method480();
					this.anInt249 = -1;
					return true;
				}
				if (this.anInt249 == 125) {
					this.anInt311 = this.aClass1_Sub1_Sub3_4.method480();
					this.anInt312 = this.aClass1_Sub1_Sub3_4.method480();
					for (local280 = this.anInt311; local280 < this.anInt311 + 8; local280++) {
						for (local284 = this.anInt312; local284 < this.anInt312 + 8; local284++) {
							if (this.aClass29ArrayArrayArray1[this.anInt334][local280][local284] != null) {
								this.aClass29ArrayArrayArray1[this.anInt334][local280][local284] = null;
								this.method179(local280, local284);
							}
						}
					}
					for (@Pc(2752) Class1_Sub2 local2752 = (Class1_Sub2) this.aClass29_3.method511(); local2752 != null; local2752 = (Class1_Sub2) this.aClass29_3.method513()) {
						if (local2752.anInt773 >= this.anInt311 && local2752.anInt773 < this.anInt311 + 8 && local2752.anInt774 >= this.anInt312 && local2752.anInt774 < this.anInt312 + 8 && local2752.anInt771 == this.anInt334) {
							local2752.anInt782 = 0;
						}
					}
					this.anInt249 = -1;
					return true;
				}
				if (this.anInt249 == 142) {
					this.anInt311 = this.aClass1_Sub1_Sub3_4.method480();
					this.anInt312 = this.aClass1_Sub1_Sub3_4.method480();
					while (this.aClass1_Sub1_Sub3_4.anInt733 < this.anInt248) {
						local280 = this.aClass1_Sub1_Sub3_4.method480();
						this.method146(this.aClass1_Sub1_Sub3_4, local280);
					}
					this.anInt249 = -1;
					return true;
				}
				if (this.anInt249 == 224) {
					this.method222(this.aByte11);
					this.anInt249 = -1;
					return false;
				}
				if (this.anInt249 == 1) {
					this.anInt385 = this.aClass1_Sub1_Sub3_4.method482() * 30;
					this.anInt249 = -1;
					return true;
				}
				if (this.anInt249 == 68) {
					this.anInt344 = this.aClass1_Sub1_Sub3_4.method485();
					this.anInt319 = this.aClass1_Sub1_Sub3_4.method482();
					this.anInt409 = this.aClass1_Sub1_Sub3_4.method480();
					this.anInt365 = this.aClass1_Sub1_Sub3_4.method482();
					this.anInt258 = this.aClass1_Sub1_Sub3_4.method480();
					if (this.anInt344 != 0 && this.anInt220 == -1) {
						signlink.dnslookup(Class48.method670(this.aByte6, this.anInt344));
						this.method150();
						@Pc(2912) short local2912 = 650;
						if (this.anInt409 != 201 || this.anInt258 == 1) {
							local2912 = 655;
						}
						this.aString17 = "";
						this.aBoolean49 = false;
						for (local284 = 0; local284 < Class6.aClass6Array1.length; local284++) {
							if (Class6.aClass6Array1[local284] != null && Class6.aClass6Array1[local284].anInt422 == local2912) {
								this.anInt220 = Class6.aClass6Array1[local284].anInt419;
								break;
							}
						}
					}
					this.anInt249 = -1;
					return true;
				}
				if (this.anInt249 == 111) {
					local280 = this.aClass1_Sub1_Sub3_4.method482();
					local284 = this.aClass1_Sub1_Sub3_4.method482();
					if (this.anInt209 != -1) {
						this.anInt209 = -1;
						this.aBoolean99 = true;
					}
					if (this.aBoolean50) {
						this.aBoolean50 = false;
						this.aBoolean99 = true;
					}
					this.anInt220 = local280;
					this.anInt327 = local284;
					this.aBoolean92 = true;
					this.aBoolean60 = true;
					this.aBoolean73 = false;
					this.anInt249 = -1;
					return true;
				}
				if (this.anInt249 == 7) {
					this.aBoolean77 = false;
					this.aBoolean50 = true;
					this.aString14 = "";
					this.aBoolean99 = true;
					this.anInt249 = -1;
					return true;
				}
				@Pc(3047) Class6 local3047;
				if (this.anInt249 == 232) {
					this.aBoolean92 = true;
					local280 = this.aClass1_Sub1_Sub3_4.method482();
					local3047 = Class6.aClass6Array1[local280];
					local442 = this.aClass1_Sub1_Sub3_4.method482();
					for (local447 = 0; local447 < local442; local447++) {
						local3047.anIntArray94[local447] = this.aClass1_Sub1_Sub3_4.method482();
						local452 = this.aClass1_Sub1_Sub3_4.method480();
						if (local452 == 255) {
							local452 = this.aClass1_Sub1_Sub3_4.method485();
						}
						local3047.anIntArray95[local447] = local452;
					}
					for (local452 = local442; local452 < local3047.anIntArray94.length; local452++) {
						local3047.anIntArray94[local452] = 0;
						local3047.anIntArray95[local452] = 0;
					}
					this.anInt249 = -1;
					return true;
				}
				if (this.anInt249 == 74) {
					local539 = this.aClass1_Sub1_Sub3_4.method486();
					local442 = this.aClass1_Sub1_Sub3_4.method485();
					local447 = this.aClass1_Sub1_Sub3_4.method480();
					local1799 = false;
					for (local457 = 0; local457 < 100; local457++) {
						if (this.anIntArray84[local457] == local442) {
							local1799 = true;
							break;
						}
					}
					if (local447 <= 1) {
						for (local468 = 0; local468 < this.anInt361; local468++) {
							if (this.aLongArray4[local468] == local539) {
								local1799 = true;
								break;
							}
						}
					}
					if (!local1799 && this.anInt208 == 0) {
						try {
							this.anIntArray84[this.anInt253] = local442;
							this.anInt253 = (this.anInt253 + 1) % 100;
							local1934 = Class49.method683(this.aClass1_Sub1_Sub3_4, this.anInt248 - 13);
							@Pc(3199) String local3199 = Class42.method604(local1934);
							if (local447 == 2 || local447 == 3) {
								this.method108("@cr2@" + Class48.method671(Class48.method668(local539)), local3199, 7);
							} else if (local447 == 1) {
								this.method108("@cr1@" + Class48.method671(Class48.method668(local539)), local3199, 7);
							} else {
								this.method108(Class48.method671(Class48.method668(local539)), local3199, 3);
							}
						} catch (@Pc(3256) Exception local3256) {
							signlink.reporterror("cde1");
						}
					}
					this.anInt249 = -1;
					return true;
				}
				if (this.anInt249 == 154) {
					local280 = this.aClass1_Sub1_Sub3_4.method482();
					local284 = this.aClass1_Sub1_Sub3_4.method480();
					local442 = this.aClass1_Sub1_Sub3_4.method482();
					if (this.aBoolean70 && !aBoolean66 && this.anInt351 < 50) {
						this.anIntArray87[this.anInt351] = local280;
						this.anIntArray38[this.anInt351] = local284;
						this.anIntArray32[this.anInt351] = local442 + Class5.anIntArray29[local280];
						this.anInt351++;
					}
					this.anInt249 = -1;
					return true;
				}
				if (this.anInt249 == 246) {
					local280 = this.aClass1_Sub1_Sub3_4.method480();
					local284 = this.aClass1_Sub1_Sub3_4.method480();
					local442 = this.aClass1_Sub1_Sub3_4.method480();
					local447 = this.aClass1_Sub1_Sub3_4.method480();
					this.aBooleanArray4[local280] = true;
					this.anIntArray62[local280] = local284;
					this.anIntArray72[local280] = local442;
					this.anIntArray70[local280] = local447;
					this.anIntArray83[local280] = 0;
					this.anInt249 = -1;
					return true;
				}
				if (this.anInt249 == 81) {
					this.aBoolean92 = true;
					local280 = this.aClass1_Sub1_Sub3_4.method482();
					local3047 = Class6.aClass6Array1[local280];
					while (this.aClass1_Sub1_Sub3_4.anInt733 < this.anInt248) {
						local442 = this.aClass1_Sub1_Sub3_4.method494();
						local447 = this.aClass1_Sub1_Sub3_4.method482();
						local452 = this.aClass1_Sub1_Sub3_4.method480();
						if (local452 == 255) {
							local452 = this.aClass1_Sub1_Sub3_4.method485();
						}
						if (local442 >= 0 && local442 < local3047.anIntArray94.length) {
							local3047.anIntArray94[local442] = local447;
							local3047.anIntArray95[local442] = local452;
						}
					}
					this.anInt249 = -1;
					return true;
				}
				if (this.anInt249 == 23) {
					local280 = this.aClass1_Sub1_Sub3_4.method482();
					@Pc(3453) boolean local3453 = this.aClass1_Sub1_Sub3_4.method480() == 1;
					Class6.aClass6Array1[local280].aBoolean104 = local3453;
					this.anInt249 = -1;
					return true;
				}
				if (this.anInt249 == 3) {
					this.aBoolean92 = true;
					local280 = this.aClass1_Sub1_Sub3_4.method480();
					local284 = this.aClass1_Sub1_Sub3_4.method485();
					local442 = this.aClass1_Sub1_Sub3_4.method480();
					this.anIntArray52[local280] = local284;
					this.anIntArray74[local280] = local442;
					this.anIntArray93[local280] = 1;
					for (local447 = 0; local447 < 98; local447++) {
						if (local284 >= anIntArray76[local447]) {
							this.anIntArray93[local280] = local447 + 2;
						}
					}
					this.anInt249 = -1;
					return true;
				}
				if (this.anInt249 == 159) {
					for (local280 = 0; local280 < this.anIntArray73.length; local280++) {
						if (this.anIntArray73[local280] != this.anIntArray69[local280]) {
							this.anIntArray73[local280] = this.anIntArray69[local280];
							this.method166(local280, 179);
							this.aBoolean92 = true;
						}
					}
					this.anInt249 = -1;
					return true;
				}
				if (this.anInt249 == 182) {
					local280 = this.aClass1_Sub1_Sub3_4.method482();
					@Pc(3577) byte local3577 = this.aClass1_Sub1_Sub3_4.method481();
					this.anIntArray69[local280] = local3577;
					if (this.anIntArray73[local280] != local3577) {
						this.anIntArray73[local280] = local3577;
						this.method166(local280, 179);
						this.aBoolean92 = true;
						if (this.anInt333 != -1) {
							this.aBoolean99 = true;
						}
					}
					this.anInt249 = -1;
					return true;
				}
				if (this.anInt249 == 151) {
					for (local280 = 0; local280 < this.aClass1_Sub1_Sub1_Sub1_Sub1Array1.length; local280++) {
						if (this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local280] != null) {
							this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local280].anInt1005 = -1;
						}
					}
					for (local284 = 0; local284 < this.aClass1_Sub1_Sub1_Sub1_Sub2Array1.length; local284++) {
						if (this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local284] != null) {
							this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local284].anInt1005 = -1;
						}
					}
					this.anInt249 = -1;
					return true;
				}
				if (this.anInt249 == 153) {
					this.anInt229 = this.aClass1_Sub1_Sub3_4.method480();
					this.anInt249 = -1;
					return true;
				}
				if (this.anInt249 == 126) {
					local280 = this.aClass1_Sub1_Sub3_4.method482();
					local3047 = Class6.aClass6Array1[local280];
					for (local442 = 0; local442 < local3047.anIntArray94.length; local442++) {
						local3047.anIntArray94[local442] = -1;
						local3047.anIntArray94[local442] = 0;
					}
					this.anInt249 = -1;
					return true;
				}
				signlink.reporterror("T1 - " + this.anInt249 + "," + this.anInt248 + " - " + this.anInt407 + "," + this.anInt408);
				this.method222(this.aByte11);
			} catch (@Pc(3744) IOException local3744) {
				this.method120();
			} catch (@Pc(3749) Exception local3749) {
				local1783 = "T2 - " + this.anInt249 + "," + this.anInt407 + "," + this.anInt408 + " - " + this.anInt248 + "," + (this.anInt213 + aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray272[0]) + "," + (this.anInt214 + aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray273[0]) + " - ";
				for (local284 = 0; local284 < this.anInt248 && local284 < 50; local284++) {
					local1783 = local1783 + this.aClass1_Sub1_Sub3_4.aByteArray9[local284] + ",";
				}
				signlink.reporterror(local1783);
				this.method222(this.aByte11);
			}
			return true;
		} catch (@Pc(3831) RuntimeException local3831) {
			signlink.reporterror("92477, " + arg0 + ", " + local3831.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIZII)V")
	private void method176(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		try {
			this.aClass1_Sub1_Sub2_Sub3_14.method418(arg4, arg1);
			this.aClass1_Sub1_Sub2_Sub3_15.method418(arg4, arg1 + arg0 - 16);
			Class1_Sub1_Sub2.method439(this.anInt357, arg0 - 32, 16, arg4, arg1 + 16, this.aByte7);
			@Pc(36) int local36 = (arg0 - 32) * arg0 / arg2;
			if (local36 < 8) {
				local36 = 8;
			}
			@Pc(53) int local53 = (arg0 - local36 - 32) * arg5 / (arg2 - arg0);
			Class1_Sub1_Sub2.method439(this.anInt402, local36, 16, arg4, arg1 + local53 + 16, this.aByte7);
			Class1_Sub1_Sub2.method444(arg4, arg1 + local53 + 16, this.anInt318, local36);
			Class1_Sub1_Sub2.method444(arg4 + 1, arg1 + 16 + local53, this.anInt318, local36);
			Class1_Sub1_Sub2.method442(arg4, this.anInt318, arg1 + local53 + 16, 16);
			Class1_Sub1_Sub2.method442(arg4, this.anInt318, arg1 + local53 + 17, 16);
			Class1_Sub1_Sub2.method444(arg4 + 15, arg1 + 16 + local53, this.anInt396, local36);
			Class1_Sub1_Sub2.method444(arg4 + 14, arg1 + 17 + local53, this.anInt396, local36 - 1);
			this.aBoolean48 &= arg3;
			Class1_Sub1_Sub2.method442(arg4, this.anInt396, arg1 + local53 + local36 + 15, 16);
			Class1_Sub1_Sub2.method442(arg4 + 1, this.anInt396, arg1 + local53 + local36 + 14, 15);
		} catch (@Pc(176) RuntimeException local176) {
			signlink.reporterror("15621, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local176.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "E", descriptor = "(I)V")
	private void method177() {
		try {
			if (this.anInt332 >= 2 || this.anInt289 != 0 || this.anInt260 != 0) {
				@Pc(31) String local31;
				if (this.anInt289 == 1 && this.anInt332 < 2) {
					local31 = "Use " + this.aString9 + " with...";
				} else if (this.anInt260 == 1 && this.anInt332 < 2) {
					local31 = this.aString7 + "...";
				} else {
					local31 = this.aStringArray6[this.anInt332 - 1];
				}
				if (this.anInt332 > 2) {
					local31 = local31 + "@whi@ / " + (this.anInt332 - 2) + " more options";
				}
				this.aClass1_Sub1_Sub2_Sub4_3.method456(this.anInt310, 4, 16777215, local31, anInt236 / 1000, 15);
			}
		} catch (@Pc(102) RuntimeException local102) {
			signlink.reporterror("25561, " + 7 + ", " + local102.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIBI)I")
	private int method178(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
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
			@Pc(41) int local41 = arg0 & 0x7F;
			@Pc(45) int local45 = arg1 & 0x7F;
			@Pc(73) int local73 = this.anIntArrayArrayArray5[local21][local3][local7] * (128 - local41) + this.anIntArrayArrayArray5[local21][local3 + 1][local7] * local41 >> 7;
			@Pc(105) int local105 = this.anIntArrayArrayArray5[local21][local3][local7 + 1] * (128 - local41) + this.anIntArrayArrayArray5[local21][local3 + 1][local7 + 1] * local41 >> 7;
			return local73 * (128 - local45) + local105 * local45 >> 7;
		} catch (@Pc(123) RuntimeException local123) {
			signlink.reporterror("97548, " + arg0 + ", " + arg1 + ", " + 51 + ", " + arg2 + ", " + local123.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(II)V")
	private void method179(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(9) Class29 local9 = this.aClass29ArrayArrayArray1[this.anInt334][arg0][arg1];
		if (local9 == null) {
			this.aClass37_1.method551(this.anInt334, arg0, arg1);
			return;
		}
		@Pc(21) int local21 = -99999999;
		@Pc(23) Class1_Sub1_Sub1_Sub3 local23 = null;
		@Pc(27) Class1_Sub1_Sub1_Sub3 local27;
		for (local27 = (Class1_Sub1_Sub1_Sub3) local9.method511(); local27 != null; local27 = (Class1_Sub1_Sub1_Sub3) local9.method513()) {
			@Pc(32) Class15 local32 = Class15.method361(local27.anInt179);
			@Pc(35) int local35 = local32.anInt602;
			if (local32.aBoolean168) {
				local35 *= local27.anInt180 + 1;
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
			if (local27.anInt179 != local23.anInt179 && local65 == null) {
				local65 = local27;
			}
			if (local27.anInt179 != local23.anInt179 && local27.anInt179 != local65.anInt179 && local67 == null) {
				local67 = local27;
			}
		}
		@Pc(110) int local110 = arg0 + (arg1 << 7) + 1610612736;
		this.aClass37_1.method537(local23, arg1, this.method178(arg0 * 128 + 64, arg1 * 128 + 64, this.anInt334), local67, local65, this.anInt334, local110, arg0);
	}

	@OriginalMember(owner = "client!client", name = "F", descriptor = "(I)V")
	private void method180() {
		try {
			@Pc(6) int local6 = this.anInt299 * 128 + 64;
			@Pc(13) int local13 = this.anInt300 * 128 + 64;
			@Pc(24) int local24 = this.method178(local6, local13, this.anInt334) - this.anInt301;
			this.anInt248 += 0;
			if (this.anInt266 < local6) {
				this.anInt266 += this.anInt302 + (local6 - this.anInt266) * this.anInt303 / 1000;
				if (this.anInt266 > local6) {
					this.anInt266 = local6;
				}
			}
			if (this.anInt266 > local6) {
				this.anInt266 -= this.anInt302 + (this.anInt266 - local6) * this.anInt303 / 1000;
				if (this.anInt266 < local6) {
					this.anInt266 = local6;
				}
			}
			if (this.anInt267 < local24) {
				this.anInt267 += this.anInt302 + (local24 - this.anInt267) * this.anInt303 / 1000;
				if (this.anInt267 > local24) {
					this.anInt267 = local24;
				}
			}
			if (this.anInt267 > local24) {
				this.anInt267 -= this.anInt302 + (this.anInt267 - local24) * this.anInt303 / 1000;
				if (this.anInt267 < local24) {
					this.anInt267 = local24;
				}
			}
			if (this.anInt268 < local13) {
				this.anInt268 += this.anInt302 + (local13 - this.anInt268) * this.anInt303 / 1000;
				if (this.anInt268 > local13) {
					this.anInt268 = local13;
				}
			}
			if (this.anInt268 > local13) {
				this.anInt268 -= this.anInt302 + (this.anInt268 - local13) * this.anInt303 / 1000;
				if (this.anInt268 < local13) {
					this.anInt268 = local13;
				}
			}
			local6 = this.anInt346 * 128 + 64;
			local13 = this.anInt347 * 128 + 64;
			local24 = this.method178(local6, local13, this.anInt334) - this.anInt348;
			@Pc(228) int local228 = local6 - this.anInt266;
			@Pc(233) int local233 = local24 - this.anInt267;
			@Pc(238) int local238 = local13 - this.anInt268;
			@Pc(249) int local249 = (int) Math.sqrt((double) (local228 * local228 + local238 * local238));
			@Pc(260) int local260 = (int) (Math.atan2((double) local233, (double) local249) * 325.949D) & 0x7FF;
			@Pc(271) int local271 = (int) (Math.atan2((double) local228, (double) local238) * -325.949D) & 0x7FF;
			if (local260 < 128) {
				local260 = 128;
			}
			if (local260 > 383) {
				local260 = 383;
			}
			if (this.anInt269 < local260) {
				this.anInt269 += this.anInt349 + (local260 - this.anInt269) * this.anInt350 / 1000;
				if (this.anInt269 > local260) {
					this.anInt269 = local260;
				}
			}
			if (this.anInt269 > local260) {
				this.anInt269 -= this.anInt349 + (this.anInt269 - local260) * this.anInt350 / 1000;
				if (this.anInt269 < local260) {
					this.anInt269 = local260;
				}
			}
			@Pc(342) int local342 = local271 - this.anInt270;
			if (local342 > 1024) {
				local342 -= 2048;
			}
			if (local342 < -1024) {
				local342 += 2048;
			}
			if (local342 > 0) {
				this.anInt270 += this.anInt349 + local342 * this.anInt350 / 1000;
				this.anInt270 &= 0x7FF;
			}
			if (local342 < 0) {
				this.anInt270 -= this.anInt349 + -local342 * this.anInt350 / 1000;
				this.anInt270 &= 0x7FF;
			}
			@Pc(400) int local400 = local271 - this.anInt270;
			if (local400 > 1024) {
				local400 -= 2048;
			}
			if (local400 < -1024) {
				local400 += 2048;
			}
			if (local400 < 0 && local342 > 0 || local400 > 0 && local342 < 0) {
				this.anInt270 = local271;
			}
		} catch (@Pc(421) RuntimeException local421) {
			signlink.reporterror("87321, " + 0 + ", " + local421.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "m", descriptor = "(Z)V")
	private void method181() {
		try {
			@Pc(7) int local7 = this.aClass1_Sub1_Sub2_Sub4_3.method449("Choose Option");
			@Pc(20) int local20;
			for (@Pc(9) int local9 = 0; local9 < this.anInt332; local9++) {
				local20 = this.aClass1_Sub1_Sub2_Sub4_3.method449(this.aStringArray6[local9]);
				if (local20 > local7) {
					local7 = local20;
				}
			}
			local7 += 8;
			local20 = this.anInt332 * 15 + 21;
			@Pc(68) int local68;
			@Pc(86) int local86;
			if (super.anInt200 > 4 && super.anInt201 > 4 && super.anInt200 < 516 && super.anInt201 < 338) {
				local68 = super.anInt200 - local7 / 2 - 4;
				if (local68 + local7 > 512) {
					local68 = 512 - local7;
				}
				if (local68 < 0) {
					local68 = 0;
				}
				local86 = super.anInt201 - 4;
				if (local86 + local20 > 334) {
					local86 = 334 - local20;
				}
				if (local86 < 0) {
					local86 = 0;
				}
				this.aBoolean88 = true;
				this.anInt313 = 0;
				this.anInt314 = local68;
				this.anInt315 = local86;
				this.anInt316 = local7;
				this.anInt317 = this.anInt332 * 15 + 22;
			}
			if (super.anInt200 > 553 && super.anInt201 > 205 && super.anInt200 < 743 && super.anInt201 < 466) {
				local68 = super.anInt200 - local7 / 2 - 553;
				if (local68 < 0) {
					local68 = 0;
				} else if (local68 + local7 > 190) {
					local68 = 190 - local7;
				}
				local86 = super.anInt201 - 205;
				if (local86 < 0) {
					local86 = 0;
				} else if (local86 + local20 > 261) {
					local86 = 261 - local20;
				}
				this.aBoolean88 = true;
				this.anInt313 = 1;
				this.anInt314 = local68;
				this.anInt315 = local86;
				this.anInt316 = local7;
				this.anInt317 = this.anInt332 * 15 + 22;
			}
			if (super.anInt200 > 17 && super.anInt201 > 357 && super.anInt200 < 496 && super.anInt201 < 453) {
				local68 = super.anInt200 - local7 / 2 - 17;
				if (local68 < 0) {
					local68 = 0;
				} else if (local68 + local7 > 479) {
					local68 = 479 - local7;
				}
				local86 = super.anInt201 - 357;
				if (local86 < 0) {
					local86 = 0;
				} else if (local86 + local20 > 96) {
					local86 = 96 - local20;
				}
				this.aBoolean88 = true;
				this.anInt313 = 2;
				this.anInt314 = local68;
				this.anInt315 = local86;
				this.anInt316 = local7;
				this.anInt317 = this.anInt332 * 15 + 22;
			}
		} catch (@Pc(290) RuntimeException local290) {
			signlink.reporterror("87254, " + false + ", " + local290.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!lb;IB)V")
	private void method182(@OriginalArg(0) Class1_Sub1_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte arg2) {
		try {
			arg0.method490();
			@Pc(9) int local9 = arg0.method491(8);
			@Pc(14) boolean local14 = false;
			@Pc(24) int local24;
			if (local9 < this.anInt242) {
				for (local24 = local9; local24 < this.anInt242; local24++) {
					this.anIntArray66[this.anInt338++] = this.anIntArray42[local24];
				}
			}
			if (local9 > this.anInt242) {
				signlink.reporterror(this.aString10 + " Too many npcs");
				throw new RuntimeException("eek");
			}
			this.anInt242 = 0;
			for (local24 = 0; local24 < local9; local24++) {
				@Pc(76) int local76 = this.anIntArray42[local24];
				@Pc(81) Class1_Sub1_Sub1_Sub1_Sub2 local81 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local76];
				@Pc(86) int local86 = arg0.method491(1);
				if (local86 == 0) {
					this.anIntArray42[this.anInt242++] = local76;
					local81.anInt1022 = anInt236;
				} else {
					@Pc(109) int local109 = arg0.method491(2);
					if (local109 == 0) {
						this.anIntArray42[this.anInt242++] = local76;
						local81.anInt1022 = anInt236;
						this.anIntArray54[this.anInt274++] = local76;
					} else {
						@Pc(160) int local160;
						@Pc(170) int local170;
						if (local109 == 1) {
							this.anIntArray42[this.anInt242++] = local76;
							local81.anInt1022 = anInt236;
							local160 = arg0.method491(3);
							local81.method678(local160, false);
							local170 = arg0.method491(1);
							if (local170 == 1) {
								this.anIntArray54[this.anInt274++] = local76;
							}
						} else if (local109 == 2) {
							this.anIntArray42[this.anInt242++] = local76;
							local81.anInt1022 = anInt236;
							local160 = arg0.method491(3);
							local81.method678(local160, true);
							local170 = arg0.method491(3);
							local81.method678(local170, true);
							@Pc(228) int local228 = arg0.method491(1);
							if (local228 == 1) {
								this.anIntArray54[this.anInt274++] = local76;
							}
						} else if (local109 == 3) {
							this.anIntArray66[this.anInt338++] = local76;
						}
					}
				}
			}
		} catch (@Pc(265) RuntimeException local265) {
			signlink.reporterror("54985, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local265.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(BIIIII)V")
	private void method183(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		try {
			@Pc(8) int local8 = this.aClass37_1.method556(arg2, arg3, arg1);
			@Pc(29) int local29;
			@Pc(35) int local35;
			@Pc(39) int local39;
			@Pc(41) int local41;
			@Pc(63) int local63;
			@Pc(69) int local69;
			if (local8 != 0) {
				local29 = this.aClass37_1.method560(arg2, arg3, arg1, local8);
				local35 = local29 >> 6 & 0x3;
				local39 = local29 & 0x1F;
				local41 = arg0;
				if (local8 > 0) {
					local41 = arg4;
				}
				@Pc(49) int[] local49 = this.aClass1_Sub1_Sub2_Sub2_11.anIntArray208;
				local63 = arg3 * 4 + (103 - arg1) * 512 * 4 + 24624;
				local69 = local8 >> 14 & 0x7FFF;
				@Pc(72) Class9 local72 = Class9.method288(local69);
				if (local72.anInt507 == -1) {
					if (local39 == 0 || local39 == 2) {
						if (local35 == 0) {
							local49[local63] = local41;
							local49[local63 + 512] = local41;
							local49[local63 + 1024] = local41;
							local49[local63 + 1536] = local41;
						} else if (local35 == 1) {
							local49[local63] = local41;
							local49[local63 + 1] = local41;
							local49[local63 + 2] = local41;
							local49[local63 + 3] = local41;
						} else if (local35 == 2) {
							local49[local63 + 3] = local41;
							local49[local63 + 3 + 512] = local41;
							local49[local63 + 3 + 1024] = local41;
							local49[local63 + 3 + 1536] = local41;
						} else if (local35 == 3) {
							local49[local63 + 1536] = local41;
							local49[local63 + 1536 + 1] = local41;
							local49[local63 + 1536 + 2] = local41;
							local49[local63 + 1536 + 3] = local41;
						}
					}
					if (local39 == 3) {
						if (local35 == 0) {
							local49[local63] = local41;
						} else if (local35 == 1) {
							local49[local63 + 3] = local41;
						} else if (local35 == 2) {
							local49[local63 + 3 + 1536] = local41;
						} else if (local35 == 3) {
							local49[local63 + 1536] = local41;
						}
					}
					if (local39 == 2) {
						if (local35 == 3) {
							local49[local63] = local41;
							local49[local63 + 512] = local41;
							local49[local63 + 1024] = local41;
							local49[local63 + 1536] = local41;
						} else if (local35 == 0) {
							local49[local63] = local41;
							local49[local63 + 1] = local41;
							local49[local63 + 2] = local41;
							local49[local63 + 3] = local41;
						} else if (local35 == 1) {
							local49[local63 + 3] = local41;
							local49[local63 + 3 + 512] = local41;
							local49[local63 + 3 + 1024] = local41;
							local49[local63 + 3 + 1536] = local41;
						} else if (local35 == 2) {
							local49[local63 + 1536] = local41;
							local49[local63 + 1536 + 1] = local41;
							local49[local63 + 1536 + 2] = local41;
							local49[local63 + 1536 + 3] = local41;
						}
					}
				} else {
					@Pc(82) Class1_Sub1_Sub2_Sub3 local82 = this.aClass1_Sub1_Sub2_Sub3Array2[local72.anInt507];
					if (local82 != null) {
						@Pc(94) int local94 = (local72.anInt502 * 4 - local82.anInt667) / 2;
						@Pc(104) int local104 = (local72.anInt503 * 4 - local82.anInt668) / 2;
						local82.method418(arg3 * 4 + local94 + 48, (104 - arg1 - local72.anInt503) * 4 + 48 + local104);
					}
				}
			}
			local8 = this.aClass37_1.method558(arg2, arg3, arg1);
			if (local8 != 0) {
				local29 = this.aClass37_1.method560(arg2, arg3, arg1, local8);
				local35 = local29 >> 6 & 0x3;
				local39 = local29 & 0x1F;
				local41 = local8 >> 14 & 0x7FFF;
				@Pc(458) Class9 local458 = Class9.method288(local41);
				@Pc(490) int local490;
				if (local458.anInt507 != -1) {
					@Pc(468) Class1_Sub1_Sub2_Sub3 local468 = this.aClass1_Sub1_Sub2_Sub3Array2[local458.anInt507];
					if (local468 != null) {
						local69 = (local458.anInt502 * 4 - local468.anInt667) / 2;
						local490 = (local458.anInt503 * 4 - local468.anInt668) / 2;
						local468.method418(arg3 * 4 + local69 + 48, (104 - arg1 - local458.anInt503) * 4 + 48 + local490);
					}
				} else if (local39 == 9) {
					local63 = 15658734;
					if (local8 > 0) {
						local63 = 15597568;
					}
					@Pc(527) int[] local527 = this.aClass1_Sub1_Sub2_Sub2_11.anIntArray208;
					local490 = arg3 * 4 + (103 - arg1) * 512 * 4 + 24624;
					if (local35 == 0 || local35 == 2) {
						local527[local490 + 1536] = local63;
						local527[local490 + 1024 + 1] = local63;
						local527[local490 + 512 + 2] = local63;
						local527[local490 + 3] = local63;
					} else {
						local527[local490] = local63;
						local527[local490 + 512 + 1] = local63;
						local527[local490 + 1024 + 2] = local63;
						local527[local490 + 1536 + 3] = local63;
					}
				}
			}
			local8 = this.aClass37_1.method559(arg2, arg3, arg1);
			if (local8 != 0) {
				local29 = local8 >> 14 & 0x7FFF;
				@Pc(622) Class9 local622 = Class9.method288(local29);
				if (local622.anInt507 != -1) {
					@Pc(632) Class1_Sub1_Sub2_Sub3 local632 = this.aClass1_Sub1_Sub2_Sub3Array2[local622.anInt507];
					if (local632 != null) {
						local41 = (local622.anInt502 * 4 - local632.anInt667) / 2;
						@Pc(654) int local654 = (local622.anInt503 * 4 - local632.anInt668) / 2;
						local632.method418(arg3 * 4 + local41 + 48, (104 - arg1 - local622.anInt503) * 4 + 48 + local654);
						return;
					}
				}
			}
		} catch (@Pc(678) RuntimeException local678) {
			signlink.reporterror("70250, " + -39 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local678.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Z[BI)V")
	private void method184(@OriginalArg(0) boolean arg0, @OriginalArg(1) byte[] arg1) {
		try {
			signlink.anInt932 = arg0 ? 1 : 0;
			signlink.midisave(arg1, arg1.length);
		} catch (@Pc(14) RuntimeException local14) {
			signlink.reporterror("35367, " + arg0 + ", " + arg1 + ", " + 399 + ", " + local14.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILjava/lang/String;)Z")
	private boolean method185(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		try {
			if (arg0 != 0) {
				this.anInt206 = this.aClass46_1.method662();
			}
			if (arg1 == null) {
				return false;
			}
			for (@Pc(12) int local12 = 0; local12 < this.anInt232; local12++) {
				if (arg1.equalsIgnoreCase(this.aStringArray5[local12])) {
					return true;
				}
			}
			return arg1.equalsIgnoreCase(aClass1_Sub1_Sub1_Sub1_Sub1_1.aString3);
		} catch (@Pc(38) RuntimeException local38) {
			signlink.reporterror("85109, " + arg0 + ", " + arg1 + ", " + local38.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!lb;ZIILclient!ab;)V")
	private void method186(@OriginalArg(0) Class1_Sub1_Sub3 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class1_Sub1_Sub1_Sub1_Sub1 arg3) {
		try {
			@Pc(13) int local13;
			if ((arg2 & 0x1) == 1) {
				local13 = arg0.method480();
				@Pc(16) byte[] local16 = new byte[local13];
				@Pc(22) Class1_Sub1_Sub3 local22 = new Class1_Sub1_Sub3(local16, aBoolean64);
				arg0.method489(local16, local13);
				this.aClass1_Sub1_Sub3Array1[arg1] = local22;
				arg3.method39(local22);
			}
			@Pc(60) int local60;
			@Pc(72) int local72;
			if ((arg2 & 0x2) == 2) {
				local13 = arg0.method482();
				if (local13 == 65535) {
					local13 = -1;
				}
				if (local13 == arg3.anInt1005) {
					arg3.anInt1009 = 0;
				}
				local60 = arg0.method480();
				if (local13 == arg3.anInt1005 && local13 != -1) {
					local72 = Class27.aClass27Array1[local13].anInt793;
					if (local72 == 1) {
						arg3.anInt1006 = 0;
						arg3.anInt1007 = 0;
						arg3.anInt1008 = local60;
						arg3.anInt1009 = 0;
					}
					if (local72 == 2) {
						arg3.anInt1009 = 0;
					}
				} else if (local13 == -1 || arg3.anInt1005 == -1 || Class27.aClass27Array1[local13].anInt787 >= Class27.aClass27Array1[arg3.anInt1005].anInt787) {
					arg3.anInt1005 = local13;
					arg3.anInt1006 = 0;
					arg3.anInt1007 = 0;
					arg3.anInt1008 = local60;
					arg3.anInt1009 = 0;
					arg3.anInt1028 = arg3.anInt1026;
				}
			}
			if ((arg2 & 0x4) == 4) {
				arg3.anInt999 = arg0.method482();
				if (arg3.anInt999 == 65535) {
					arg3.anInt999 = -1;
				}
			}
			if ((arg2 & 0x8) == 8) {
				arg3.aString31 = arg0.method487();
				if (arg3.aString31.charAt(0) == '~') {
					arg3.aString31 = arg3.aString31.substring(1);
					this.method108(arg3.aString3, arg3.aString31, 2);
				} else if (arg3 == aClass1_Sub1_Sub1_Sub1_Sub1_1) {
					this.method108(arg3.aString3, arg3.aString31, 2);
				}
				arg3.anInt994 = 0;
				arg3.anInt995 = 0;
				arg3.anInt993 = 150;
			}
			if ((arg2 & 0x10) == 16) {
				local13 = arg0.method480();
				local60 = arg0.method480();
				arg3.method681(local13, local60, anInt236);
				arg3.anInt996 = anInt236 + 300;
				arg3.anInt997 = arg0.method480();
				arg3.anInt998 = arg0.method480();
			}
			if ((arg2 & 0x20) == 32) {
				arg3.anInt1000 = arg0.method482();
				arg3.anInt1001 = arg0.method482();
			}
			if ((arg2 & 0x40) == 64) {
				local13 = arg0.method482();
				local60 = arg0.method480();
				local72 = arg0.method480();
				@Pc(258) int local258 = arg0.anInt733;
				if (arg3.aString3 != null && arg3.aBoolean24) {
					@Pc(268) long local268 = Class48.method667(arg3.aString3);
					@Pc(270) boolean local270 = false;
					if (local60 <= 1) {
						for (@Pc(275) int local275 = 0; local275 < this.anInt361; local275++) {
							if (this.aLongArray4[local275] == local268) {
								local270 = true;
								break;
							}
						}
					}
					if (!local270 && this.anInt208 == 0) {
						try {
							@Pc(303) String local303 = Class49.method683(arg0, local72);
							@Pc(307) String local307 = Class42.method604(local303);
							arg3.aString31 = local307;
							arg3.anInt994 = local13 >> 8;
							arg3.anInt995 = local13 & 0xFF;
							arg3.anInt993 = 150;
							if (local60 == 2 || local60 == 3) {
								this.method108("@cr2@" + arg3.aString3, local307, 1);
							} else if (local60 == 1) {
								this.method108("@cr1@" + arg3.aString3, local307, 1);
							} else {
								this.method108(arg3.aString3, local307, 2);
							}
						} catch (@Pc(371) Exception local371) {
							signlink.reporterror("cde2");
						}
					}
				}
				arg0.anInt733 = local258 + local72;
			}
			if ((arg2 & 0x100) == 256) {
				arg3.anInt1010 = arg0.method482();
				local13 = arg0.method485();
				arg3.anInt1014 = local13 >> 16;
				arg3.anInt1013 = anInt236 + (local13 & 0xFFFF);
				arg3.anInt1011 = 0;
				arg3.anInt1012 = 0;
				if (arg3.anInt1013 > anInt236) {
					arg3.anInt1011 = -1;
				}
				if (arg3.anInt1010 == 65535) {
					arg3.anInt1010 = -1;
				}
			}
			if ((arg2 & 0x200) == 512) {
				arg3.anInt1015 = arg0.method480();
				arg3.anInt1017 = arg0.method480();
				arg3.anInt1016 = arg0.method480();
				arg3.anInt1018 = arg0.method480();
				arg3.anInt1019 = arg0.method482() + anInt236;
				arg3.anInt1020 = arg0.method482() + anInt236;
				arg3.anInt1021 = arg0.method480();
				arg3.method679();
			}
			if ((arg2 & 0x400) == 1024) {
				local13 = arg0.method480();
				local60 = arg0.method480();
				arg3.method681(local13, local60, anInt236);
				arg3.anInt996 = anInt236 + 300;
				arg3.anInt997 = arg0.method480();
				arg3.anInt998 = arg0.method480();
			}
		} catch (@Pc(495) RuntimeException local495) {
			signlink.reporterror("55656, " + arg0 + ", " + false + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local495.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "G", descriptor = "(I)V")
	private void method187() {
		try {
			this.method102();
			if (this.anInt331 == 1) {
				this.aClass1_Sub1_Sub2_Sub2Array3[this.anInt330 / 100].method391(this.anInt328 - 8 - 4, this.anInt329 - 8 - 4);
			}
			if (this.anInt331 == 2) {
				this.aClass1_Sub1_Sub2_Sub2Array3[this.anInt330 / 100 + 4].method391(this.anInt328 - 8 - 4, this.anInt329 - 8 - 4);
				anInt359++;
				if (anInt359 > 57) {
					anInt359 = 0;
					this.aClass1_Sub1_Sub3_2.method469(254, 837);
				}
			}
			if (this.anInt398 != -1) {
				this.method225(this.anInt323, this.anInt398);
				this.method135(0, Class6.aClass6Array1[this.anInt398], 0, 0);
			}
			if (this.anInt220 != -1) {
				this.method225(this.anInt323, this.anInt220);
				this.method135(0, Class6.aClass6Array1[this.anInt220], 0, 0);
			}
			this.method213();
			if (!this.aBoolean88) {
				this.method212(this.aBoolean89);
				this.method177();
			} else if (this.anInt313 == 0) {
				this.method171();
			}
			if (this.anInt386 == 1) {
				this.aClass1_Sub1_Sub2_Sub2Array5[1].method391(472, 296);
			}
			@Pc(182) int local182;
			if (aBoolean96) {
				@Pc(158) byte local158 = 20;
				@Pc(160) int local160 = 16776960;
				if (super.anInt189 < 15) {
					local160 = 16711680;
				}
				this.aClass1_Sub1_Sub2_Sub4_2.method446(20, local160, "Fps:" + super.anInt189);
				local182 = local158 + 15;
				@Pc(184) Runtime local184 = Runtime.getRuntime();
				@Pc(193) int local193 = (int) ((local184.totalMemory() - local184.freeMemory()) / 1024L);
				if (local193 > 33554432 && aBoolean66) {
				}
				this.aClass1_Sub1_Sub2_Sub4_2.method446(35, 16776960, "Mem:" + local193 + "k");
				local182 += 15;
			}
			if (this.anInt385 != 0) {
				@Pc(227) int local227 = this.anInt385 / 50;
				local182 = local227 / 60;
				@Pc(235) int local235 = local227 % 60;
				if (local235 < 10) {
					this.aClass1_Sub1_Sub2_Sub4_2.method451(329, 16776960, 4, "System update in: " + local182 + ":0" + local235);
				} else {
					this.aClass1_Sub1_Sub2_Sub4_2.method451(329, 16776960, 4, "System update in: " + local182 + ":" + local235);
				}
			}
		} catch (@Pc(277) RuntimeException local277) {
			signlink.reporterror("75927, " + -906 + ", " + local277.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILclient!ib;II)V")
	private void method188(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub1_Sub2_Sub2 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		try {
			@Pc(7) int local7 = this.anInt225 + this.anInt264 & 0x7FF;
			@Pc(15) int local15 = arg0 * arg0 + arg3 * arg3;
			if (local15 <= 6400) {
				@Pc(23) int local23 = Class1_Sub1_Sub1_Sub5.anIntArray151[local7];
				@Pc(27) int local27 = Class1_Sub1_Sub1_Sub5.anIntArray152[local7];
				@Pc(36) int local36 = local23 * 256 / (this.anInt362 + 256);
				@Pc(45) int local45 = local27 * 256 / (this.anInt362 + 256);
				@Pc(55) int local55 = arg3 * local36 + arg0 * local45 >> 16;
				@Pc(65) int local65 = arg3 * local45 - arg0 * local36 >> 16;
				@Pc(69) boolean local69 = false;
				if (local15 > 2500) {
					arg1.method397(local55 + 94 + 4 - arg1.anInt646 / 2, 83 - local65 - arg1.anInt647 / 2 - 4, this.aClass1_Sub1_Sub2_Sub3_2);
				} else {
					arg1.method391(local55 + 94 + 4 - arg1.anInt646 / 2, 83 - local65 - arg1.anInt647 / 2 - 4);
				}
			}
		} catch (@Pc(123) RuntimeException local123) {
			signlink.reporterror("11355, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local123.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ZJ)V")
	private void method189(@OriginalArg(0) boolean arg0, @OriginalArg(1) long arg1) {
		try {
			if (!arg0 && arg1 != 0L) {
				for (@Pc(11) int local11 = 0; local11 < this.anInt232; local11++) {
					if (this.aLongArray3[local11] == arg1) {
						this.anInt232--;
						this.aBoolean92 = true;
						for (@Pc(31) int local31 = local11; local31 < this.anInt232; local31++) {
							this.aStringArray5[local31] = this.aStringArray5[local31 + 1];
							this.anIntArray85[local31] = this.anIntArray85[local31 + 1];
							this.aLongArray3[local31] = this.aLongArray3[local31 + 1];
						}
						this.aClass1_Sub1_Sub3_2.method469(214, 837);
						this.aClass1_Sub1_Sub3_2.method476(this.aByte5, arg1);
						return;
					}
				}
			}
		} catch (@Pc(87) RuntimeException local87) {
			signlink.reporterror("5063, " + arg0 + ", " + arg1 + ", " + local87.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ZLclient!lb;I)V")
	private void method190(@OriginalArg(1) Class1_Sub1_Sub3 arg0, @OriginalArg(2) int arg1) {
		try {
			this.anInt338 = 0;
			this.anInt274 = 0;
			this.method182(arg0, arg1, (byte) 6);
			this.method123(arg1, 491, arg0);
			this.method144(arg1, arg0);
			@Pc(40) int local40;
			for (@Pc(33) int local33 = 0; local33 < this.anInt338; local33++) {
				local40 = this.anIntArray66[local33];
				if (this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local40].anInt1022 != anInt236) {
					this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local40].aClass13_2 = null;
					this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local40] = null;
				}
			}
			if (arg0.anInt733 != arg1) {
				signlink.reporterror(this.aString10 + " size mismatch in getnpcpos - pos:" + arg0.anInt733 + " psize:" + arg1);
				throw new RuntimeException("eek");
			}
			for (local40 = 0; local40 < this.anInt242; local40++) {
				if (this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[this.anIntArray42[local40]] == null) {
					signlink.reporterror(this.aString10 + " null entry in npc list - pos:" + local40 + " size:" + this.anInt242);
					throw new RuntimeException("eek");
				}
			}
		} catch (@Pc(130) RuntimeException local130) {
			signlink.reporterror("58489, " + true + ", " + arg0 + ", " + arg1 + ", " + local130.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!ib;III)V")
	private void method191(@OriginalArg(0) Class1_Sub1_Sub2_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		try {
			@Pc(15) int local15 = arg2 * arg2 + arg1 * arg1;
			if (local15 > 4225 && local15 < 90000) {
				@Pc(29) int local29 = this.anInt225 + this.anInt264 & 0x7FF;
				@Pc(33) int local33 = Class1_Sub1_Sub1_Sub5.anIntArray151[local29];
				@Pc(37) int local37 = Class1_Sub1_Sub1_Sub5.anIntArray152[local29];
				@Pc(46) int local46 = local33 * 256 / (this.anInt362 + 256);
				@Pc(55) int local55 = local37 * 256 / (this.anInt362 + 256);
				@Pc(65) int local65 = arg1 * local46 + arg2 * local55 >> 16;
				@Pc(75) int local75 = arg1 * local55 - arg2 * local46 >> 16;
				@Pc(81) double local81 = Math.atan2((double) local65, (double) local75);
				@Pc(87) int local87 = (int) (Math.sin(local81) * 63.0D);
				@Pc(93) int local93 = (int) (Math.cos(local81) * 57.0D);
				this.aClass1_Sub1_Sub2_Sub2_1.method396(local81, local87 + 94 + 4 - 10, 83 - local93 - 20);
			} else {
				this.method188(arg2, arg0, 83, arg1);
			}
		} catch (@Pc(124) RuntimeException local124) {
			signlink.reporterror("81609, " + arg0 + ", " + arg1 + ", " + 0 + ", " + arg2 + ", " + local124.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILclient!jb;)V")
	private void method192(@OriginalArg(1) Class1_Sub1_Sub2_Sub3 arg0) {
		try {
			for (@Pc(5) int local5 = 0; local5 < this.anIntArray67.length; local5++) {
				this.anIntArray67[local5] = 0;
			}
			@Pc(30) int local30;
			for (@Pc(20) int local20 = 0; local20 < 5000; local20++) {
				local30 = (int) (Math.random() * 128.0D * (double) 256);
				this.anIntArray67[local30] = (int) (Math.random() * 256.0D);
			}
			@Pc(57) int local57;
			@Pc(61) int local61;
			@Pc(69) int local69;
			for (local30 = 0; local30 < 20; local30++) {
				for (local57 = 1; local57 < 255; local57++) {
					for (local61 = 1; local61 < 127; local61++) {
						local69 = local61 + (local57 << 7);
						this.anIntArray68[local69] = (this.anIntArray67[local69 - 1] + this.anIntArray67[local69 + 1] + this.anIntArray67[local69 - 128] + this.anIntArray67[local69 + 128]) / 4;
					}
				}
				@Pc(115) int[] local115 = this.anIntArray67;
				this.anIntArray67 = this.anIntArray68;
				this.anIntArray68 = local115;
			}
			if (arg0 != null) {
				local57 = 0;
				for (local61 = 0; local61 < arg0.anInt668; local61++) {
					for (local69 = 0; local69 < arg0.anInt667; local69++) {
						if (arg0.aByteArray7[local57++] != 0) {
							@Pc(151) int local151 = local69 + arg0.anInt669 + 16;
							@Pc(158) int local158 = local61 + arg0.anInt670 + 16;
							@Pc(164) int local164 = local151 + (local158 << 7);
							this.anIntArray67[local164] = 0;
						}
					}
				}
			}
		} catch (@Pc(181) RuntimeException local181) {
			signlink.reporterror("33268, " + -298 + ", " + arg0 + ", " + local181.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "g", descriptor = "(B)I")
	private int method193(@OriginalArg(0) byte arg0) {
		try {
			@Pc(3) int local3 = 3;
			@Pc(8) boolean local8 = false;
			if (this.anInt269 < 310) {
				@Pc(27) int local27 = this.anInt266 >> 7;
				@Pc(32) int local32 = this.anInt268 >> 7;
				@Pc(37) int local37 = aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt982 >> 7;
				@Pc(42) int local42 = aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt983 >> 7;
				if ((this.aByteArrayArrayArray7[this.anInt334][local27][local32] & 0x4) != 0) {
					local3 = this.anInt334;
				}
				@Pc(64) int local64;
				if (local37 > local27) {
					local64 = local37 - local27;
				} else {
					local64 = local27 - local37;
				}
				@Pc(77) int local77;
				if (local42 > local32) {
					local77 = local42 - local32;
				} else {
					local77 = local32 - local42;
				}
				@Pc(92) int local92;
				@Pc(94) int local94;
				if (local64 > local77) {
					local92 = local77 * 65536 / local64;
					local94 = 32768;
					while (local27 != local37) {
						if (local27 < local37) {
							local27++;
						} else if (local27 > local37) {
							local27--;
						}
						if ((this.aByteArrayArrayArray7[this.anInt334][local27][local32] & 0x4) != 0) {
							local3 = this.anInt334;
						}
						local94 += local92;
						if (local94 >= 65536) {
							local94 -= 65536;
							if (local32 < local42) {
								local32++;
							} else if (local32 > local42) {
								local32--;
							}
							if ((this.aByteArrayArrayArray7[this.anInt334][local27][local32] & 0x4) != 0) {
								local3 = this.anInt334;
							}
						}
					}
				} else {
					local92 = local64 * 65536 / local77;
					local94 = 32768;
					while (local32 != local42) {
						if (local32 < local42) {
							local32++;
						} else if (local32 > local42) {
							local32--;
						}
						if ((this.aByteArrayArrayArray7[this.anInt334][local27][local32] & 0x4) != 0) {
							local3 = this.anInt334;
						}
						local94 += local92;
						if (local94 >= 65536) {
							local94 -= 65536;
							if (local27 < local37) {
								local27++;
							} else if (local27 > local37) {
								local27--;
							}
							if ((this.aByteArrayArrayArray7[this.anInt334][local27][local32] & 0x4) != 0) {
								local3 = this.anInt334;
							}
						}
					}
				}
			}
			if ((this.aByteArrayArrayArray7[this.anInt334][aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt982 >> 7][aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt983 >> 7] & 0x4) != 0) {
				local3 = this.anInt334;
			}
			return local3;
		} catch (@Pc(260) RuntimeException local260) {
			signlink.reporterror("16063, " + arg0 + ", " + local260.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "H", descriptor = "(I)I")
	private int method194() {
		try {
			@Pc(9) int local9 = this.method178(this.anInt266, this.anInt268, this.anInt334);
			return local9 - this.anInt267 >= 800 || (this.aByteArrayArrayArray7[this.anInt334][this.anInt266 >> 7][this.anInt268 >> 7] & 0x4) == 0 ? 3 : this.anInt334;
		} catch (@Pc(47) RuntimeException local47) {
			signlink.reporterror("19671, " + -521 + ", " + local47.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(ZI)V")
	private void method195(@OriginalArg(1) int arg0) {
		try {
			@Pc(5) int[] local5 = this.aClass1_Sub1_Sub2_Sub2_11.anIntArray208;
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
						this.aClass37_1.method565(local5, local34, arg0, local36, local22);
					}
					if (arg0 < 3 && (this.aByteArrayArrayArray7[arg0 + 1][local36][local22] & 0x8) != 0) {
						this.aClass37_1.method565(local5, local34, arg0 + 1, local36, local22);
					}
					local34 += 4;
				}
			}
			local34 = ((int) (Math.random() * 20.0D) + 238 - 10 << 16) + ((int) (Math.random() * 20.0D) + 238 - 10 << 8) + (int) (Math.random() * 20.0D) + 238 - 10;
			local36 = (int) (Math.random() * 20.0D) + 238 - 10 << 16;
			this.aClass1_Sub1_Sub2_Sub2_11.method386();
			@Pc(146) int local146;
			for (@Pc(142) int local142 = 1; local142 < 103; local142++) {
				for (local146 = 1; local146 < 103; local146++) {
					if ((this.aByteArrayArrayArray7[arg0][local146][local142] & 0x18) == 0) {
						this.method183(local34, local142, arg0, local146, local36);
					}
					if (arg0 < 3 && (this.aByteArrayArrayArray7[arg0 + 1][local146][local142] & 0x8) != 0) {
						this.method183(local34, local142, arg0 + 1, local146, local36);
					}
				}
			}
			this.aClass35_8.method524();
			this.anInt212 = 0;
			for (local146 = 0; local146 < 104; local146++) {
				for (@Pc(217) int local217 = 0; local217 < 104; local217++) {
					@Pc(227) int local227 = this.aClass37_1.method559(this.anInt334, local146, local217);
					if (local227 != 0) {
						local227 = local227 >> 14 & 0x7FFF;
						@Pc(239) int local239 = Class9.method288(local227).anInt506;
						if (local239 >= 0) {
							@Pc(243) int local243 = local146;
							@Pc(245) int local245 = local217;
							if (local239 != 22 && local239 != 29 && local239 != 34 && local239 != 36 && local239 != 46 && local239 != 47 && local239 != 48) {
								@Pc(277) int[][] local277 = this.aClass19Array1[this.anInt334].anIntArrayArray18;
								for (@Pc(279) int local279 = 0; local279 < 10; local279++) {
									@Pc(286) int local286 = (int) (Math.random() * 4.0D);
									if (local286 == 0 && local243 > 0 && local243 > local146 - 3 && (local277[local243 - 1][local245] & 0x280108) == 0) {
										local243--;
									}
									if (local286 == 1 && local243 < 103 && local243 < local146 + 3 && (local277[local243 + 1][local245] & 0x280180) == 0) {
										local243++;
									}
									if (local286 == 2 && local245 > 0 && local245 > local217 - 3 && (local277[local243][local245 - 1] & 0x280102) == 0) {
										local245--;
									}
									if (local286 == 3 && local245 < 103 && local245 < local217 + 3 && (local277[local243][local245 + 1] & 0x280120) == 0) {
										local245++;
									}
								}
							}
							this.aClass1_Sub1_Sub2_Sub2Array4[this.anInt212] = this.aClass1_Sub1_Sub2_Sub2Array7[local239];
							this.anIntArray33[this.anInt212] = local243;
							this.anIntArray34[this.anInt212] = local245;
							this.anInt212++;
						}
					}
				}
			}
			anInt254++;
			if (anInt254 > 112) {
				anInt254 = 0;
				this.aClass1_Sub1_Sub3_2.method469(39, 837);
				this.aClass1_Sub1_Sub3_2.method470(50);
			}
		} catch (@Pc(434) RuntimeException local434) {
			signlink.reporterror("40742, " + false + ", " + arg0 + ", " + local434.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IZLclient!lb;)V")
	private void method196(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub1_Sub3 arg1) {
		try {
			while (true) {
				if (arg1.anInt734 + 10 < arg0 * 8) {
					@Pc(22) int local22 = arg1.method491(11);
					if (local22 != 2047) {
						if (this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local22] == null) {
							this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local22] = new Class1_Sub1_Sub1_Sub1_Sub1();
							if (this.aClass1_Sub1_Sub3Array1[local22] != null) {
								this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local22].method39(this.aClass1_Sub1_Sub3Array1[local22]);
							}
						}
						this.anIntArray53[this.anInt273++] = local22;
						@Pc(68) Class1_Sub1_Sub1_Sub1_Sub1 local68 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local22];
						local68.anInt1022 = anInt236;
						@Pc(76) int local76 = arg1.method491(5);
						if (local76 > 15) {
							local76 -= 32;
						}
						@Pc(85) int local85 = arg1.method491(5);
						if (local85 > 15) {
							local85 -= 32;
						}
						@Pc(94) int local94 = arg1.method491(1);
						local68.method677(aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray272[0] + local76, local94 == 1, aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray273[0] + local85);
						@Pc(120) int local120 = arg1.method491(1);
						if (local120 == 1) {
							this.anIntArray54[this.anInt274++] = local22;
						}
						continue;
					}
				}
				arg1.method492();
				return;
			}
		} catch (@Pc(141) RuntimeException local141) {
			signlink.reporterror("91385, " + arg0 + ", " + true + ", " + arg1 + ", " + local141.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "h", descriptor = "(B)V")
	private void method197(@OriginalArg(0) byte arg0) {
		try {
			if (arg0 != this.aByte9) {
				this.anInt249 = this.aClass1_Sub1_Sub3_4.method480();
			}
			try {
				@Pc(16) int local16 = aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt982 + this.anInt336;
				@Pc(22) int local22 = aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt983 + this.anInt296;
				if (this.anInt399 - local16 < -500 || this.anInt399 - local16 > 500 || this.anInt400 - local22 < -500 || this.anInt400 - local22 > 500) {
					this.anInt399 = local16;
					this.anInt400 = local22;
				}
				if (this.anInt399 != local16) {
					this.anInt399 += (local16 - this.anInt399) / 16;
				}
				if (this.anInt400 != local22) {
					this.anInt400 += (local22 - this.anInt400) / 16;
				}
				if (super.anIntArray30[1] == 1) {
					this.anInt226 += (-this.anInt226 - 24) / 2;
				} else if (super.anIntArray30[2] == 1) {
					this.anInt226 += (24 - this.anInt226) / 2;
				} else {
					this.anInt226 /= 2;
				}
				if (super.anIntArray30[3] == 1) {
					this.anInt227 += (12 - this.anInt227) / 2;
				} else if (super.anIntArray30[4] == 1) {
					this.anInt227 += (-this.anInt227 - 12) / 2;
				} else {
					this.anInt227 /= 2;
				}
				this.anInt225 = this.anInt225 + this.anInt226 / 2 & 0x7FF;
				this.anInt224 += this.anInt227 / 2;
				if (this.anInt224 < 128) {
					this.anInt224 = 128;
				}
				if (this.anInt224 > 383) {
					this.anInt224 = 383;
				}
				@Pc(209) int local209 = this.anInt399 >> 7;
				@Pc(214) int local214 = this.anInt400 >> 7;
				@Pc(224) int local224 = this.method178(this.anInt399, this.anInt400, this.anInt334);
				@Pc(226) int local226 = 0;
				@Pc(242) int local242;
				if (local209 > 3 && local214 > 3 && local209 < 100 && local214 < 100) {
					for (local242 = local209 - 4; local242 <= local209 + 4; local242++) {
						for (@Pc(248) int local248 = local214 - 4; local248 <= local214 + 4; local248++) {
							@Pc(253) int local253 = this.anInt334;
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
				if (local242 > this.anInt235) {
					this.anInt235 += (local242 - this.anInt235) / 24;
				} else if (local242 < this.anInt235) {
					this.anInt235 += (local242 - this.anInt235) / 80;
				}
			} catch (@Pc(344) Exception local344) {
				signlink.reporterror("glfc_ex " + aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt982 + "," + aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt983 + "," + this.anInt399 + "," + this.anInt400 + "," + this.anInt339 + "," + this.anInt340 + "," + this.anInt213 + "," + this.anInt214);
				throw new RuntimeException("eek");
			}
		} catch (@Pc(394) RuntimeException local394) {
			signlink.reporterror("46544, " + arg0 + ", " + local394.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIII)I")
	private int method198(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		try {
			@Pc(3) int local3 = 256 - arg1;
			@Pc(7) boolean local7 = false;
			return ((arg3 & 0xFF00FF) * local3 + (arg0 & 0xFF00FF) * arg1 & 0xFF00FF00) + ((arg3 & 0xFF00) * local3 + (arg0 & 0xFF00) * arg1 & 0xFF0000) >> 8;
		} catch (@Pc(38) RuntimeException local38) {
			signlink.reporterror("73529, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local38.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "n", descriptor = "(Z)V")
	private void method199() {
		try {
			for (@Pc(9) Class1_Sub2 local9 = (Class1_Sub2) this.aClass29_3.method511(); local9 != null; local9 = (Class1_Sub2) this.aClass29_3.method513()) {
				if (local9.anInt782 == -1) {
					local9.anInt781 = 0;
					this.method121(this.anInt239, local9);
				} else {
					local9.method673();
				}
			}
		} catch (@Pc(37) RuntimeException local37) {
			signlink.reporterror("22315, " + false + ", " + local37.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "i", descriptor = "(B)V")
	private void method200() {
		try {
			signlink.anInt932 = 0;
			signlink.midi = "stop";
		} catch (@Pc(13) RuntimeException local13) {
			signlink.reporterror("77728, " + -111 + ", " + local13.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "j", descriptor = "(B)V")
	private void method201() {
		try {
			@Pc(17) int local17;
			@Pc(24) int local24;
			if (this.anInt324 == 0) {
				local17 = super.anInt190 / 2 - 80;
				local24 = super.anInt191 / 2 + 20;
				local24 += 20;
				if (super.anInt199 == 1 && super.anInt200 >= local17 - 75 && super.anInt200 <= local17 + 75 && super.anInt201 >= local24 - 20 && super.anInt201 <= local24 + 20) {
					this.anInt324 = 3;
					this.anInt257 = 0;
				}
				local17 = super.anInt190 / 2 + 80;
				if (super.anInt199 == 1 && super.anInt200 >= local17 - 75 && super.anInt200 <= local17 + 75 && super.anInt201 >= local24 - 20 && super.anInt201 <= local24 + 20) {
					this.aString5 = "";
					this.aString6 = "Enter your username & password.";
					this.anInt324 = 2;
					this.anInt257 = 0;
				}
			} else if (this.anInt324 == 2) {
				local17 = super.anInt191 / 2 - 40;
				local17 += 30;
				local17 += 25;
				if (super.anInt199 == 1 && super.anInt201 >= local17 - 15 && super.anInt201 < local17) {
					this.anInt257 = 0;
				}
				local17 += 15;
				if (super.anInt199 == 1 && super.anInt201 >= local17 - 15 && super.anInt201 < local17) {
					this.anInt257 = 1;
				}
				local17 += 15;
				local24 = super.anInt190 / 2 - 80;
				@Pc(170) int local170 = super.anInt191 / 2 + 50;
				@Pc(171) int local171 = local170 + 20;
				if (super.anInt199 == 1 && super.anInt200 >= local24 - 75 && super.anInt200 <= local24 + 75 && super.anInt201 >= local171 - 20 && super.anInt201 <= local171 + 20) {
					this.method158(this.aString10, this.aString11, false);
					if (this.aBoolean48) {
						return;
					}
				}
				local24 = super.anInt190 / 2 + 80;
				if (super.anInt199 == 1 && super.anInt200 >= local24 - 75 && super.anInt200 <= local24 + 75 && super.anInt201 >= local171 - 20 && super.anInt201 <= local171 + 20) {
					this.anInt324 = 0;
					this.aString10 = "";
					this.aString11 = "";
				}
				while (true) {
					while (true) {
						@Pc(258) int local258 = this.method88();
						if (local258 == -1) {
							return;
						}
						@Pc(263) boolean local263 = false;
						for (@Pc(265) int local265 = 0; local265 < aString12.length(); local265++) {
							if (local258 == aString12.charAt(local265)) {
								local263 = true;
								break;
							}
						}
						if (this.anInt257 == 0) {
							if (local258 == 8 && this.aString10.length() > 0) {
								this.aString10 = this.aString10.substring(0, this.aString10.length() - 1);
							}
							if (local258 == 9 || local258 == 10 || local258 == 13) {
								this.anInt257 = 1;
							}
							if (local263) {
								this.aString10 = this.aString10 + (char) local258;
							}
							if (this.aString10.length() > 12) {
								this.aString10 = this.aString10.substring(0, 12);
							}
						} else if (this.anInt257 == 1) {
							if (local258 == 8 && this.aString11.length() > 0) {
								this.aString11 = this.aString11.substring(0, this.aString11.length() - 1);
							}
							if (local258 == 9 || local258 == 10 || local258 == 13) {
								this.anInt257 = 0;
							}
							if (local263) {
								this.aString11 = this.aString11 + (char) local258;
							}
							if (this.aString11.length() > 20) {
								this.aString11 = this.aString11.substring(0, 20);
							}
						}
					}
				}
			} else if (this.anInt324 == 3) {
				local17 = super.anInt190 / 2;
				local24 = super.anInt191 / 2 + 50;
				@Pc(422) int local422 = local24 + 20;
				if (super.anInt199 == 1 && super.anInt200 >= local17 - 75 && super.anInt200 <= local17 + 75 && super.anInt201 >= local422 - 20 && super.anInt201 <= local422 + 20) {
					this.anInt324 = 0;
					return;
				}
			}
		} catch (@Pc(455) RuntimeException local455) {
			signlink.reporterror("90690, " + 5 + ", " + local455.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "k", descriptor = "(B)V")
	private void method202() {
		try {
			this.aClass35_6.method524();
			Class1_Sub1_Sub2_Sub1.anIntArray180 = this.anIntArray57;
			this.aClass1_Sub1_Sub2_Sub3_1.method418(0, 0);
			if (this.anInt327 != -1) {
				this.method135(0, Class6.aClass6Array1[this.anInt327], 0, 0);
			} else if (this.anIntArray55[this.anInt241] != -1) {
				this.method135(0, Class6.aClass6Array1[this.anIntArray55[this.anInt241]], 0, 0);
			}
			if (this.aBoolean88 && this.anInt313 == 1) {
				this.method171();
			}
			this.aClass35_6.method525(205, 553, super.aGraphics2);
			this.aClass35_8.method524();
			Class1_Sub1_Sub2_Sub1.anIntArray180 = this.anIntArray58;
		} catch (@Pc(83) RuntimeException local83) {
			signlink.reporterror("38159, " + 3 + ", " + local83.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(II)Ljava/lang/String;")
	private String method203(@OriginalArg(1) int arg0) {
		try {
			return arg0 < 999999999 ? String.valueOf(arg0) : "*";
		} catch (@Pc(14) RuntimeException local14) {
			signlink.reporterror("41599, " + 28242 + ", " + arg0 + ", " + local14.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "I", descriptor = "(I)V")
	private void method204() {
		try {
			this.anInt405++;
			this.method223(true);
			this.method228(true);
			this.method223(false);
			this.method228(false);
			this.method107();
			this.method119();
			@Pc(42) int local42;
			@Pc(81) int local81;
			if (!this.aBoolean100) {
				local42 = this.anInt224;
				if (this.anInt235 / 256 > local42) {
					local42 = this.anInt235 / 256;
				}
				if (this.aBooleanArray4[4] && this.anIntArray72[4] + 128 > local42) {
					local42 = this.anIntArray72[4] + 128;
				}
				local81 = this.anInt225 + this.anInt218 & 0x7FF;
				this.method128(local81, local42 * 3 + 600, this.anInt378, this.anInt399, this.anInt400, this.method178(aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt982, aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt983, this.anInt334) - 50, local42);
			}
			if (this.aBoolean100) {
				local42 = this.method194();
			} else {
				local42 = this.method193((byte) 5);
			}
			local81 = this.anInt266;
			@Pc(126) int local126 = this.anInt267;
			@Pc(129) int local129 = this.anInt268;
			@Pc(132) int local132 = this.anInt269;
			@Pc(135) int local135 = this.anInt270;
			@Pc(184) int local184;
			for (@Pc(137) int local137 = 0; local137 < 5; local137++) {
				if (this.aBooleanArray4[local137]) {
					local184 = (int) (Math.random() * (double) (this.anIntArray62[local137] * 2 + 1) - (double) this.anIntArray62[local137] + Math.sin((double) this.anIntArray83[local137] * ((double) this.anIntArray70[local137] / 100.0D)) * (double) this.anIntArray72[local137]);
					if (local137 == 0) {
						this.anInt266 += local184;
					}
					if (local137 == 1) {
						this.anInt267 += local184;
					}
					if (local137 == 2) {
						this.anInt268 += local184;
					}
					if (local137 == 3) {
						this.anInt270 = this.anInt270 + local184 & 0x7FF;
					}
					if (local137 == 4) {
						this.anInt269 += local184;
						if (this.anInt269 < 128) {
							this.anInt269 = 128;
						}
						if (this.anInt269 > 383) {
							this.anInt269 = 383;
						}
					}
				}
			}
			local184 = Class1_Sub1_Sub2_Sub1.anInt588;
			Class1_Sub1_Sub1_Sub5.aBoolean129 = true;
			Class1_Sub1_Sub1_Sub5.anInt496 = 0;
			Class1_Sub1_Sub1_Sub5.anInt494 = super.anInt194 - 4;
			Class1_Sub1_Sub1_Sub5.anInt495 = super.anInt195 - 4;
			Class1_Sub1_Sub2.method437();
			this.aClass37_1.method569(this.anInt266, this.anInt269, this.anInt268, local42, this.anInt270, this.anInt228, this.anInt267);
			this.aClass37_1.method544();
			this.method138(this.aBoolean55);
			this.method159();
			this.method229(local184);
			this.method187();
			this.aClass35_8.method525(4, 4, super.aGraphics2);
			this.anInt266 = local81;
			this.anInt267 = local126;
			this.anInt268 = local129;
			this.anInt269 = local132;
			this.anInt270 = local135;
		} catch (@Pc(325) RuntimeException local325) {
			signlink.reporterror("64438, " + 0 + ", " + local325.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!lb;BI)V")
	private void method205(@OriginalArg(0) Class1_Sub1_Sub3 arg0, @OriginalArg(2) int arg1) {
		try {
			arg0.method490();
			@Pc(13) int local13 = arg0.method491(1);
			if (local13 != 0) {
				@Pc(21) int local21 = arg0.method491(2);
				if (local21 == 0) {
					this.anIntArray54[this.anInt274++] = this.anInt272;
				} else {
					@Pc(44) int local44;
					@Pc(54) int local54;
					if (local21 == 1) {
						local44 = arg0.method491(3);
						aClass1_Sub1_Sub1_Sub1_Sub1_1.method678(local44, false);
						local54 = arg0.method491(1);
						if (local54 == 1) {
							this.anIntArray54[this.anInt274++] = this.anInt272;
						}
					} else {
						@Pc(98) int local98;
						if (local21 == 2) {
							local44 = arg0.method491(3);
							aClass1_Sub1_Sub1_Sub1_Sub1_1.method678(local44, true);
							local54 = arg0.method491(3);
							aClass1_Sub1_Sub1_Sub1_Sub1_1.method678(local54, true);
							local98 = arg0.method491(1);
							if (local98 == 1) {
								this.anIntArray54[this.anInt274++] = this.anInt272;
							}
						} else if (local21 == 3) {
							this.anInt334 = arg0.method491(2);
							local44 = arg0.method491(7);
							local54 = arg0.method491(7);
							local98 = arg0.method491(1);
							aClass1_Sub1_Sub1_Sub1_Sub1_1.method677(local44, local98 == 1, local54);
							@Pc(154) int local154 = arg0.method491(1);
							if (local154 == 1) {
								this.anIntArray54[this.anInt274++] = this.anInt272;
							}
						}
					}
				}
			}
		} catch (@Pc(171) RuntimeException local171) {
			signlink.reporterror("88717, " + arg0 + ", " + -50 + ", " + arg1 + ", " + local171.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILclient!y;B)V")
	private void method206(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub1_Sub1_Sub1 arg1) {
		try {
			this.method207(arg0, arg1.anInt983, arg1.anInt982);
		} catch (@Pc(12) RuntimeException local12) {
			signlink.reporterror("85509, " + arg0 + ", " + arg1 + ", " + -102 + ", " + local12.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ZIII)V")
	private void method207(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		try {
			if (arg2 >= 128 && arg1 >= 128 && arg2 <= 13056 && arg1 <= 13056) {
				@Pc(28) int local28 = this.method178(arg2, arg1, this.anInt334) - arg0;
				@Pc(33) int local33 = arg2 - this.anInt266;
				@Pc(38) int local38 = local28 - this.anInt267;
				this.aBoolean48 &= true;
				@Pc(49) int local49 = arg1 - this.anInt268;
				@Pc(54) int local54 = Class1_Sub1_Sub1_Sub5.anIntArray151[this.anInt269];
				@Pc(59) int local59 = Class1_Sub1_Sub1_Sub5.anIntArray152[this.anInt269];
				@Pc(64) int local64 = Class1_Sub1_Sub1_Sub5.anIntArray151[this.anInt270];
				@Pc(69) int local69 = Class1_Sub1_Sub1_Sub5.anIntArray152[this.anInt270];
				@Pc(79) int local79 = local49 * local64 + local33 * local69 >> 16;
				@Pc(89) int local89 = local49 * local69 - local33 * local64 >> 16;
				@Pc(91) int local91 = local79;
				@Pc(101) int local101 = local38 * local59 - local89 * local54 >> 16;
				@Pc(111) int local111 = local38 * local54 + local89 * local59 >> 16;
				if (local111 >= 50) {
					this.anInt287 = Class1_Sub1_Sub2_Sub1.anInt584 + (local91 << 9) / local111;
					this.anInt288 = Class1_Sub1_Sub2_Sub1.anInt585 + (local101 << 9) / local111;
				} else {
					this.anInt287 = -1;
					this.anInt288 = -1;
				}
			} else {
				this.anInt287 = -1;
				this.anInt288 = -1;
			}
		} catch (@Pc(143) RuntimeException local143) {
			signlink.reporterror("3168, " + true + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local143.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "l", descriptor = "(B)V")
	private void method208(@OriginalArg(0) byte arg0) {
		try {
			if (this.anInt385 > 1) {
				this.anInt385--;
			}
			if (this.anInt252 > 0) {
				this.anInt252--;
			}
			for (@Pc(22) int local22 = 0; local22 < 5 && this.method175(this.aBoolean97); local22++) {
			}
			if (this.aBoolean48) {
				@Pc(42) Object local42 = this.aClass11_1.anObject1;
				@Pc(67) int local67;
				@Pc(69) int local69;
				@Pc(71) int local71;
				@Pc(104) int local104;
				synchronized (this.aClass11_1.anObject1) {
					if (!aBoolean58) {
						this.aClass11_1.anInt528 = 0;
					} else if (super.anInt199 != 0 || this.aClass11_1.anInt528 >= 40) {
						this.aClass1_Sub1_Sub3_2.method469(1, 837);
						this.aClass1_Sub1_Sub3_2.method470(0);
						local67 = this.aClass1_Sub1_Sub3_2.anInt733;
						local69 = 0;
						@Pc(87) int local87;
						for (local71 = 0; local71 < this.aClass11_1.anInt528 && local67 - this.aClass1_Sub1_Sub3_2.anInt733 < 240; local71++) {
							local69++;
							local87 = this.aClass11_1.anIntArray163[local71];
							if (local87 < 0) {
								local87 = 0;
							} else if (local87 > 502) {
								local87 = 502;
							}
							local104 = this.aClass11_1.anIntArray162[local71];
							if (local104 < 0) {
								local104 = 0;
							} else if (local104 > 764) {
								local104 = 764;
							}
							@Pc(121) int local121 = local87 * 765 + local104;
							if (this.aClass11_1.anIntArray163[local71] == -1 && this.aClass11_1.anIntArray162[local71] == -1) {
								local104 = -1;
								local87 = -1;
								local121 = 524287;
							}
							if (local104 != this.anInt341 || local87 != this.anInt342) {
								@Pc(166) int local166 = local104 - this.anInt341;
								this.anInt341 = local104;
								@Pc(174) int local174 = local87 - this.anInt342;
								this.anInt342 = local87;
								if (this.anInt309 < 8 && local166 >= -32 && local166 <= 31 && local174 >= -32 && local174 <= 31) {
									local166 += 32;
									local174 += 32;
									this.aClass1_Sub1_Sub3_2.method471((this.anInt309 << 12) + (local166 << 6) + local174);
									this.anInt309 = 0;
								} else if (this.anInt309 < 8) {
									this.aClass1_Sub1_Sub3_2.method473((this.anInt309 << 19) + local121 + 8388608);
									this.anInt309 = 0;
								} else {
									this.aClass1_Sub1_Sub3_2.method474((this.anInt309 << 19) + local121 - 1073741824);
									this.anInt309 = 0;
								}
							} else if (this.anInt309 < 2047) {
								this.anInt309++;
							}
						}
						this.aClass1_Sub1_Sub3_2.method479(this.aClass1_Sub1_Sub3_2.anInt733 - local67);
						if (local69 >= this.aClass11_1.anInt528) {
							this.aClass11_1.anInt528 = 0;
						} else {
							this.aClass11_1.anInt528 -= local69;
							for (local87 = 0; local87 < this.aClass11_1.anInt528; local87++) {
								this.aClass11_1.anIntArray162[local87] = this.aClass11_1.anIntArray162[local87 + local69];
								this.aClass11_1.anIntArray163[local87] = this.aClass11_1.anIntArray163[local87 + local69];
							}
						}
					}
				}
				if (super.anInt199 != 0) {
					@Pc(337) long local337 = (super.aLong13 - this.aLong14) / 50L;
					if (local337 > 4095L) {
						local337 = 4095L;
					}
					this.aLong14 = super.aLong13;
					local67 = super.anInt201;
					if (local67 < 0) {
						local67 = 0;
					} else if (local67 > 502) {
						local67 = 502;
					}
					local69 = super.anInt200;
					if (local69 < 0) {
						local69 = 0;
					} else if (local69 > 764) {
						local69 = 764;
					}
					local71 = local67 * 765 + local69;
					@Pc(383) byte local383 = 0;
					if (super.anInt199 == 2) {
						local383 = 1;
					}
					local104 = (int) local337;
					this.aClass1_Sub1_Sub3_2.method469(131, 837);
					this.aClass1_Sub1_Sub3_2.method474((local104 << 20) + (local383 << 19) + local71);
				}
				if (this.anInt401 > 0) {
					this.anInt401--;
				}
				if (super.anIntArray30[1] == 1 || super.anIntArray30[2] == 1 || super.anIntArray30[3] == 1 || super.anIntArray30[4] == 1) {
					this.aBoolean95 = true;
				}
				if (this.aBoolean95 && this.anInt401 <= 0) {
					this.anInt401 = 20;
					this.aBoolean95 = false;
					this.aClass1_Sub1_Sub3_2.method469(65, 837);
					this.aClass1_Sub1_Sub3_2.method471(this.anInt224);
					this.aClass1_Sub1_Sub3_2.method471(this.anInt225);
				}
				if (super.aBoolean46 && !this.aBoolean52) {
					this.aBoolean52 = true;
					this.aClass1_Sub1_Sub3_2.method469(60, 837);
					this.aClass1_Sub1_Sub3_2.method470(1);
				}
				if (!super.aBoolean46 && this.aBoolean52) {
					this.aBoolean52 = false;
					this.aClass1_Sub1_Sub3_2.method469(60, 837);
					this.aClass1_Sub1_Sub3_2.method470(0);
				}
				this.method97();
				this.method105();
				this.method167();
				this.anInt250++;
				if (this.anInt250 > 750) {
					this.method120();
				}
				this.method164(this.anInt352);
				this.method111();
				this.method134(747);
				this.anInt323++;
				if (this.anInt331 != 0) {
					this.anInt330 += 20;
					if (this.anInt330 >= 400) {
						this.anInt331 = 0;
					}
				}
				if (this.anInt376 != 0) {
					this.anInt373++;
					if (this.anInt373 >= 15) {
						if (this.anInt376 == 2) {
							this.aBoolean92 = true;
						}
						if (this.anInt376 == 3) {
							this.aBoolean99 = true;
						}
						this.anInt376 = 0;
					}
				}
				if (this.anInt390 != 0) {
					this.anInt223++;
					if (super.anInt194 > this.anInt391 + 5 || super.anInt194 < this.anInt391 - 5 || super.anInt195 > this.anInt392 + 5 || super.anInt195 < this.anInt392 - 5) {
						this.aBoolean90 = true;
					}
					if (super.anInt193 == 0) {
						if (this.anInt390 == 2) {
							this.aBoolean92 = true;
						}
						if (this.anInt390 == 3) {
							this.aBoolean99 = true;
						}
						this.anInt390 = 0;
						if (this.aBoolean90 && this.anInt223 >= 5) {
							this.anInt256 = -1;
							this.method212(this.aBoolean89);
							if (this.anInt256 == this.anInt388 && this.anInt255 != this.anInt389) {
								@Pc(685) Class6 local685 = Class6.aClass6Array1[this.anInt388];
								@Pc(687) byte local687 = 0;
								if (this.anInt281 == 1 && local685.anInt422 == 206) {
									local687 = 1;
								}
								if (local685.anIntArray94[this.anInt255] <= 0) {
									local687 = 0;
								}
								if (local685.aBoolean109) {
									local67 = this.anInt389;
									local69 = this.anInt255;
									local685.anIntArray94[local69] = local685.anIntArray94[local67];
									local685.anIntArray95[local69] = local685.anIntArray95[local67];
									local685.anIntArray94[local67] = -1;
									local685.anIntArray95[local67] = 0;
								} else if (local687 == 1) {
									local67 = this.anInt389;
									local69 = this.anInt255;
									while (local67 != local69) {
										if (local67 > local69) {
											local685.method232(local67, 244, local67 - 1);
											local67--;
										} else if (local67 < local69) {
											local685.method232(local67, 244, local67 + 1);
											local67++;
										}
									}
								} else {
									local685.method232(this.anInt389, 244, this.anInt255);
								}
								this.aClass1_Sub1_Sub3_2.method469(28, 837);
								this.aClass1_Sub1_Sub3_2.method471(this.anInt388);
								this.aClass1_Sub1_Sub3_2.method471(this.anInt389);
								this.aClass1_Sub1_Sub3_2.method471(this.anInt255);
								this.aClass1_Sub1_Sub3_2.method470(local687);
							}
						} else if ((this.anInt280 == 1 || this.method170(this.anInt332 - 1)) && this.anInt332 > 2) {
							this.method181();
						} else if (this.anInt332 > 0) {
							this.method211(this.anInt332 - 1);
						}
						this.anInt373 = 10;
						super.anInt199 = 0;
					}
				}
				anInt284++;
				if (anInt284 > 62) {
					anInt284 = 0;
					this.aClass1_Sub1_Sub3_2.method469(153, 837);
				}
				@Pc(871) int local871;
				@Pc(873) int local873;
				if (Class37.anInt867 != -1) {
					local871 = Class37.anInt867;
					local873 = Class37.anInt868;
					@Pc(894) boolean local894 = this.method154(0, local871, local873, 0, 0, 0, aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray272[0], 0, aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray273[0], true, 0);
					Class37.anInt867 = -1;
					if (local894) {
						this.anInt328 = super.anInt200;
						this.anInt329 = super.anInt201;
						this.anInt331 = 1;
						this.anInt330 = 0;
					}
				}
				if (super.anInt199 == 1 && this.aString4 != null) {
					this.aString4 = null;
					this.aBoolean99 = true;
					super.anInt199 = 0;
				}
				this.method130();
				this.method156(this.aBoolean79);
				this.method220(this.anInt206);
				this.method124();
				if (super.anInt193 == 1 || super.anInt199 == 1) {
					this.anInt394++;
				}
				if (this.anInt395 == 2) {
					this.method197(this.aByte9);
				}
				if (this.anInt395 == 2 && this.aBoolean100) {
					this.method180();
				}
				for (local871 = 0; local871 < 5; local871++) {
					@Pc(983) int local983 = this.anIntArray83[local871]++;
				}
				this.method136(this.anInt221);
				super.anInt192++;
				if (super.anInt192 > 4500) {
					this.anInt252 = 250;
					super.anInt192 -= 500;
					this.aClass1_Sub1_Sub3_2.method469(36, 837);
				}
				this.anInt230++;
				if (this.anInt230 > 500) {
					this.anInt230 = 0;
					local873 = (int) (Math.random() * 8.0D);
					if ((local873 & 0x1) == 1) {
						this.anInt336 += this.anInt337;
					}
					if ((local873 & 0x2) == 2) {
						this.anInt296 += this.anInt297;
					}
					if ((local873 & 0x4) == 4) {
						this.anInt218 += this.anInt219;
					}
				}
				if (this.anInt336 < -50) {
					this.anInt337 = 2;
				}
				if (this.anInt336 > 50) {
					this.anInt337 = -2;
				}
				if (this.anInt296 < -55) {
					this.anInt297 = 2;
				}
				if (this.anInt296 > 55) {
					this.anInt297 = -2;
				}
				if (this.anInt218 < -40) {
					this.anInt219 = 1;
				}
				if (this.anInt218 > 40) {
					this.anInt219 = -1;
				}
				this.anInt404++;
				@Pc(1125) boolean local1125 = false;
				if (this.anInt404 > 500) {
					this.anInt404 = 0;
					local873 = (int) (Math.random() * 8.0D);
					if ((local873 & 0x1) == 1) {
						this.anInt264 += this.anInt265;
					}
					if ((local873 & 0x2) == 2) {
						this.anInt362 += this.anInt363;
					}
				}
				if (this.anInt264 < -60) {
					this.anInt265 = 2;
				}
				if (this.anInt264 > 60) {
					this.anInt265 = -2;
				}
				if (this.anInt362 < -20) {
					this.anInt363 = 1;
				}
				if (this.anInt362 > 10) {
					this.anInt363 = -1;
				}
				this.anInt251++;
				if (this.anInt251 > 50) {
					this.aClass1_Sub1_Sub3_2.method469(146, 837);
				}
				try {
					if (this.aClass8_1 != null && this.aClass1_Sub1_Sub3_2.anInt733 > 0) {
						this.aClass8_1.method251(this.aClass1_Sub1_Sub3_2.anInt733, this.aClass1_Sub1_Sub3_2.aByteArray9, 459);
						this.aClass1_Sub1_Sub3_2.anInt733 = 0;
						this.anInt251 = 0;
					}
				} catch (@Pc(1234) IOException local1234) {
					this.method120();
				} catch (@Pc(1239) Exception local1239) {
					this.method222(this.aByte11);
				}
			}
		} catch (@Pc(1245) RuntimeException local1245) {
			signlink.reporterror("30798, " + arg0 + ", " + local1245.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(IBLclient!lb;)V")
	private void method209(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub1_Sub3 arg1) {
		try {
			for (@Pc(1) int local1 = 0; local1 < this.anInt274; local1++) {
				@Pc(8) int local8 = this.anIntArray54[local1];
				@Pc(13) Class1_Sub1_Sub1_Sub1_Sub1 local13 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local8];
				@Pc(16) int local16 = arg1.method480();
				if ((local16 & 0x80) == 128) {
					local16 += arg1.method480() << 8;
				}
				this.method186(arg1, local8, local16, local13);
			}
		} catch (@Pc(48) RuntimeException local48) {
			signlink.reporterror("45284, " + arg0 + ", " + 107 + ", " + arg1 + ", " + local48.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
	@Override
	public AppletContext getAppletContext() {
		return signlink.mainapp == null ? super.getAppletContext() : signlink.mainapp.getAppletContext();
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ZBI)V")
	private void method210(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1) {
		try {
			signlink.anInt931 = arg1;
			if (arg0) {
				signlink.midi = "voladjust";
			}
		} catch (@Pc(17) RuntimeException local17) {
			signlink.reporterror("99496, " + arg0 + ", " + -78 + ", " + arg1 + ", " + local17.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "f", descriptor = "(II)V")
	private void method211(@OriginalArg(1) int arg0) {
		try {
			if (arg0 >= 0) {
				if (this.aBoolean50) {
					this.aBoolean50 = false;
					this.aBoolean99 = true;
				}
				@Pc(27) int local27 = this.anIntArray78[arg0];
				@Pc(32) int local32 = this.anIntArray79[arg0];
				@Pc(37) int local37 = this.anIntArray80[arg0];
				@Pc(42) int local42 = this.anIntArray81[arg0];
				if (local37 >= 2000) {
					local37 -= 2000;
				}
				if (local37 == 899 && this.method226(156, local42, local32, local27)) {
					this.aClass1_Sub1_Sub3_2.method471(this.anInt261);
				}
				if (local37 == 582 || local37 == 113 || local37 == 555 || local37 == 331 || local37 == 354) {
					if (local37 == 113) {
						this.aClass1_Sub1_Sub3_2.method469(105, 837);
					}
					if (local37 == 555) {
						this.aClass1_Sub1_Sub3_2.method469(86, 837);
					}
					if (local37 == 354) {
						this.aClass1_Sub1_Sub3_2.method469(255, 837);
					}
					if (local37 == 582) {
						if ((local42 & 0x3) == 0) {
							anInt207++;
						}
						if (anInt207 >= 133) {
							this.aClass1_Sub1_Sub3_2.method469(134, 837);
							this.aClass1_Sub1_Sub3_2.method471(6118);
						}
						this.aClass1_Sub1_Sub3_2.method469(202, 837);
					}
					if (local37 == 331) {
						this.aClass1_Sub1_Sub3_2.method469(112, 837);
					}
					this.aClass1_Sub1_Sub3_2.method471(local42);
					this.aClass1_Sub1_Sub3_2.method471(local27);
					this.aClass1_Sub1_Sub3_2.method471(local32);
					this.anInt373 = 0;
					this.anInt374 = local32;
					this.anInt375 = local27;
					this.anInt376 = 2;
					if (Class6.aClass6Array1[local32].anInt419 == this.anInt220) {
						this.anInt376 = 1;
					}
					if (Class6.aClass6Array1[local32].anInt419 == this.anInt209) {
						this.anInt376 = 3;
					}
				}
				if (local37 == 625) {
					this.method226(85, local42, local32, local27);
				}
				@Pc(198) Class15 local198;
				@Pc(225) String local225;
				if (local37 == 1328) {
					local198 = Class15.method361(local42);
					@Pc(202) Class6 local202 = Class6.aClass6Array1[local32];
					if (local202 != null && local202.anIntArray95[local27] >= 100000) {
						local225 = local202.anIntArray95[local27] + " x " + local198.aString25;
					} else if (local198.aByteArray6 == null) {
						local225 = "It's a " + local198.aString25 + ".";
					} else {
						local225 = new String(local198.aByteArray6);
					}
					this.method108("", local225, 0);
				}
				@Pc(263) Class1_Sub1_Sub1_Sub1_Sub2 local263;
				if (local37 == 829) {
					local263 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local42];
					if (local263 != null) {
						this.method154(2, local263.anIntArray272[0], local263.anIntArray273[0], 1, 0, 1, aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray272[0], 0, aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray273[0], false, 0);
						this.anInt328 = super.anInt200;
						this.anInt329 = super.anInt201;
						this.anInt331 = 2;
						this.anInt330 = 0;
						this.aClass1_Sub1_Sub3_2.method469(120, 837);
						this.aClass1_Sub1_Sub3_2.method471(local42);
						this.aClass1_Sub1_Sub3_2.method471(this.anInt292);
						this.aClass1_Sub1_Sub3_2.method471(this.anInt290);
						this.aClass1_Sub1_Sub3_2.method471(this.anInt291);
					}
				}
				if (local37 == 242 || local37 == 209 || local37 == 309 || local37 == 852 || local37 == 793) {
					local263 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local42];
					if (local263 != null) {
						this.method154(2, local263.anIntArray272[0], local263.anIntArray273[0], 1, 0, 1, aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray272[0], 0, aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray273[0], false, 0);
						this.anInt328 = super.anInt200;
						this.anInt329 = super.anInt201;
						this.anInt331 = 2;
						this.anInt330 = 0;
						if (local37 == 852) {
							this.aClass1_Sub1_Sub3_2.method469(50, 837);
						}
						if (local37 == 793) {
							this.aClass1_Sub1_Sub3_2.method469(196, 837);
						}
						if (local37 == 242) {
							this.aClass1_Sub1_Sub3_2.method469(138, 837);
						}
						if (local37 == 209) {
							this.aClass1_Sub1_Sub3_2.method469(64, 837);
						}
						if (local37 == 309) {
							this.aClass1_Sub1_Sub3_2.method469(99, 837);
						}
						this.aClass1_Sub1_Sub3_2.method471(local42);
					}
				}
				@Pc(453) Class6 local453;
				@Pc(471) int local471;
				if (local37 == 435) {
					this.aClass1_Sub1_Sub3_2.method469(107, 837);
					this.aClass1_Sub1_Sub3_2.method471(local32);
					local453 = Class6.aClass6Array1[local32];
					if (local453.anIntArrayArray7 != null && local453.anIntArrayArray7[0][0] == 5) {
						local471 = local453.anIntArrayArray7[0][1];
						this.anIntArray73[local471] = 1 - this.anIntArray73[local471];
						this.method166(local471, 179);
						this.aBoolean92 = true;
					}
				}
				if (local37 == 231) {
					local453 = Class6.aClass6Array1[local32];
					@Pc(497) boolean local497 = true;
					if (local453.anInt422 > 0) {
						local497 = this.method155(local453);
					}
					if (local497) {
						this.aClass1_Sub1_Sub3_2.method469(107, 837);
						this.aClass1_Sub1_Sub3_2.method471(local32);
					}
				}
				if (local37 == 810 && this.method226(111, local42, local32, local27)) {
					this.aClass1_Sub1_Sub3_2.method471(this.anInt292);
					this.aClass1_Sub1_Sub3_2.method471(this.anInt290);
					this.aClass1_Sub1_Sub3_2.method471(this.anInt291);
				}
				@Pc(562) Class1_Sub1_Sub1_Sub1_Sub1 local562;
				if (local37 == 639 || local37 == 499 || local37 == 27 || local37 == 387 || local37 == 185) {
					local562 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local42];
					if (local562 != null) {
						this.method154(2, local562.anIntArray272[0], local562.anIntArray273[0], 1, 0, 1, aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray272[0], 0, aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray273[0], false, 0);
						this.anInt328 = super.anInt200;
						this.anInt329 = super.anInt201;
						this.anInt331 = 2;
						this.anInt330 = 0;
						if (local37 == 185) {
							this.aClass1_Sub1_Sub3_2.method469(89, 837);
						}
						if (local37 == 27) {
							this.aClass1_Sub1_Sub3_2.method469(123, 837);
						}
						if (local37 == 639) {
							anInt354++;
							if (anInt354 >= 52) {
								this.aClass1_Sub1_Sub3_2.method469(210, 837);
								this.aClass1_Sub1_Sub3_2.method470(131);
							}
							this.aClass1_Sub1_Sub3_2.method469(38, 837);
						}
						if (local37 == 499) {
							this.aClass1_Sub1_Sub3_2.method469(124, 837);
						}
						if (local37 == 387) {
							anInt279 += local42;
							if (anInt279 >= 66) {
								this.aClass1_Sub1_Sub3_2.method469(246, 837);
								this.aClass1_Sub1_Sub3_2.method470(154);
							}
							this.aClass1_Sub1_Sub3_2.method469(171, 837);
						}
						this.aClass1_Sub1_Sub3_2.method471(local42);
					}
				}
				@Pc(702) String local702;
				if (local37 == 1381) {
					@Pc(690) int local690 = local42 >> 14 & 0x7FFF;
					@Pc(693) Class9 local693 = Class9.method288(local690);
					if (local693.aByteArray4 == null) {
						local702 = "It's a " + local693.aString23 + ".";
					} else {
						local702 = new String(local693.aByteArray4);
					}
					this.method108("", local702, 0);
				}
				@Pc(738) String local738;
				@Pc(753) long local753;
				if (local37 == 605 || local37 == 47 || local37 == 513 || local37 == 884) {
					local738 = this.aStringArray6[arg0];
					local471 = local738.indexOf("@whi@");
					if (local471 != -1) {
						local753 = Class48.method667(local738.substring(local471 + 5).trim());
						if (local37 == 605) {
							this.method217(local753);
						}
						if (local37 == 47) {
							this.method216(local753);
						}
						if (local37 == 513) {
							this.method189(this.aBoolean69, local753);
						}
						if (local37 == 884) {
							this.method127(local753);
						}
					}
				}
				if (local37 == 274) {
					local453 = Class6.aClass6Array1[local32];
					this.anInt260 = 1;
					this.anInt261 = local32;
					this.anInt262 = local453.anInt446;
					this.anInt289 = 0;
					this.aBoolean92 = true;
					local225 = local453.aString20;
					if (local225.indexOf(" ") != -1) {
						local225 = local225.substring(0, local225.indexOf(" "));
					}
					local702 = local453.aString20;
					if (local702.indexOf(" ") != -1) {
						local702 = local702.substring(local702.indexOf(" ") + 1);
					}
					this.aString7 = local225 + " " + local453.aString21 + " " + local702;
					if (this.anInt262 == 16) {
						this.aBoolean92 = true;
						this.anInt241 = 3;
						this.aBoolean60 = true;
					}
				} else {
					if (local37 == 1152) {
						local198 = Class15.method361(local42);
						if (local198.aByteArray6 == null) {
							local225 = "It's a " + local198.aString25 + ".";
						} else {
							local225 = new String(local198.aByteArray6);
						}
						this.method108("", local225, 0);
					}
					if (local37 == 1714) {
						local263 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local42];
						if (local263 != null) {
							@Pc(914) Class13 local914 = local263.aClass13_2;
							if (local914.anIntArray174 != null) {
								local914 = local914.method327();
							}
							if (local914 != null) {
								if (local914.aByteArray5 == null) {
									local702 = "It's a " + local914.aString24 + ".";
								} else {
									local702 = new String(local914.aByteArray5);
								}
								this.method108("", local702, 0);
							}
						}
					}
					if (local37 == 743) {
						anInt294++;
						if (anInt294 >= 124) {
							this.aClass1_Sub1_Sub3_2.method469(129, 837);
							this.aClass1_Sub1_Sub3_2.method471(37954);
						}
						this.method226(250, local42, local32, local27);
					}
					if (local37 == 737) {
						this.method150();
					}
					if (local37 == 240) {
						local263 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local42];
						if (local263 != null) {
							this.method154(2, local263.anIntArray272[0], local263.anIntArray273[0], 1, 0, 1, aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray272[0], 0, aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray273[0], false, 0);
							this.anInt328 = super.anInt200;
							this.anInt329 = super.anInt201;
							this.anInt331 = 2;
							this.anInt330 = 0;
							this.aClass1_Sub1_Sub3_2.method469(58, 837);
							this.aClass1_Sub1_Sub3_2.method471(local42);
							this.aClass1_Sub1_Sub3_2.method471(this.anInt261);
						}
					}
					if (local37 == 102) {
						this.anInt289 = 1;
						this.anInt290 = local27;
						this.anInt291 = local32;
						this.anInt292 = local42;
						this.aString9 = Class15.method361(local42).aString25;
						this.anInt260 = 0;
						this.aBoolean92 = true;
					} else {
						if (local37 == 357) {
							this.method226(172, local42, local32, local27);
						}
						if (local37 == 1071) {
							this.method226(165, local42, local32, local27);
						}
						if (local37 == 225) {
							this.aClass1_Sub1_Sub3_2.method469(107, 837);
							this.aClass1_Sub1_Sub3_2.method471(local32);
							local453 = Class6.aClass6Array1[local32];
							if (local453.anIntArrayArray7 != null && local453.anIntArrayArray7[0][0] == 5) {
								local471 = local453.anIntArrayArray7[0][1];
								if (this.anIntArray73[local471] != local453.anIntArray97[0]) {
									this.anIntArray73[local471] = local453.anIntArray97[0];
									this.method166(local471, 179);
									this.aBoolean92 = true;
								}
							}
						}
						if (local37 == 275) {
							local562 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local42];
							if (local562 != null) {
								this.method154(2, local562.anIntArray272[0], local562.anIntArray273[0], 1, 0, 1, aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray272[0], 0, aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray273[0], false, 0);
								this.anInt328 = super.anInt200;
								this.anInt329 = super.anInt201;
								this.anInt331 = 2;
								this.anInt330 = 0;
								this.aClass1_Sub1_Sub3_2.method469(15, 837);
								this.aClass1_Sub1_Sub3_2.method471(local42);
								this.aClass1_Sub1_Sub3_2.method471(this.anInt292);
								this.aClass1_Sub1_Sub3_2.method471(this.anInt290);
								this.aClass1_Sub1_Sub3_2.method471(this.anInt291);
							}
						}
						@Pc(1267) boolean local1267;
						if (local37 == 139 || local37 == 778 || local37 == 617 || local37 == 224 || local37 == 662) {
							local1267 = this.method154(2, local27, local32, 0, 0, 0, aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray272[0], 0, aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray273[0], false, 0);
							if (!local1267) {
								this.method154(2, local27, local32, 1, 0, 1, aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray272[0], 0, aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray273[0], false, 0);
							}
							this.anInt328 = super.anInt200;
							this.anInt329 = super.anInt201;
							this.anInt331 = 2;
							this.anInt330 = 0;
							if (local37 == 778) {
								this.aClass1_Sub1_Sub3_2.method469(52, 837);
							}
							if (local37 == 139) {
								if ((local27 & 0x3) == 0) {
									anInt412++;
								}
								if (anInt412 >= 123) {
									this.aClass1_Sub1_Sub3_2.method469(20, 837);
									this.aClass1_Sub1_Sub3_2.method474(0);
								}
								this.aClass1_Sub1_Sub3_2.method469(122, 837);
							}
							if (local37 == 662) {
								anInt369 += this.anInt214;
								if (anInt369 >= 118) {
									this.aClass1_Sub1_Sub3_2.method469(100, 837);
									this.aClass1_Sub1_Sub3_2.method474(0);
								}
								this.aClass1_Sub1_Sub3_2.method469(222, 837);
							}
							if (local37 == 224) {
								anInt411 += local32;
								if (anInt411 >= 75) {
									this.aClass1_Sub1_Sub3_2.method469(198, 837);
									this.aClass1_Sub1_Sub3_2.method470(19);
								}
								this.aClass1_Sub1_Sub3_2.method469(251, 837);
							}
							if (local37 == 617) {
								this.aClass1_Sub1_Sub3_2.method469(170, 837);
							}
							this.aClass1_Sub1_Sub3_2.method471(local27 + this.anInt213);
							this.aClass1_Sub1_Sub3_2.method471(local32 + this.anInt214);
							this.aClass1_Sub1_Sub3_2.method471(local42);
						}
						if (local37 == 131) {
							local562 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local42];
							if (local562 != null) {
								this.method154(2, local562.anIntArray272[0], local562.anIntArray273[0], 1, 0, 1, aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray272[0], 0, aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray273[0], false, 0);
								this.anInt328 = super.anInt200;
								this.anInt329 = super.anInt201;
								this.anInt331 = 2;
								this.anInt330 = 0;
								this.aClass1_Sub1_Sub3_2.method469(189, 837);
								this.aClass1_Sub1_Sub3_2.method471(local42);
								this.aClass1_Sub1_Sub3_2.method471(this.anInt261);
							}
						}
						if (local37 == 563) {
							this.aClass1_Sub1_Sub3_2.method469(47, 837);
							this.aClass1_Sub1_Sub3_2.method471(local42);
							this.aClass1_Sub1_Sub3_2.method471(local27);
							this.aClass1_Sub1_Sub3_2.method471(local32);
							this.aClass1_Sub1_Sub3_2.method471(this.anInt261);
							this.anInt373 = 0;
							this.anInt374 = local32;
							this.anInt375 = local27;
							this.anInt376 = 2;
							if (Class6.aClass6Array1[local32].anInt419 == this.anInt220) {
								this.anInt376 = 1;
							}
							if (Class6.aClass6Array1[local32].anInt419 == this.anInt209) {
								this.anInt376 = 3;
							}
						}
						if (local37 == 370) {
							local1267 = this.method154(2, local27, local32, 0, 0, 0, aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray272[0], 0, aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray273[0], false, 0);
							if (!local1267) {
								this.method154(2, local27, local32, 1, 0, 1, aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray272[0], 0, aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray273[0], false, 0);
							}
							this.anInt328 = super.anInt200;
							this.anInt329 = super.anInt201;
							this.anInt331 = 2;
							this.anInt330 = 0;
							this.aClass1_Sub1_Sub3_2.method469(46, 837);
							this.aClass1_Sub1_Sub3_2.method471(local27 + this.anInt213);
							this.aClass1_Sub1_Sub3_2.method471(local32 + this.anInt214);
							this.aClass1_Sub1_Sub3_2.method471(local42);
							this.aClass1_Sub1_Sub3_2.method471(this.anInt261);
						}
						@Pc(1651) int local1651;
						if (local37 == 902) {
							local738 = this.aStringArray6[arg0];
							local471 = local738.indexOf("@whi@");
							if (local471 != -1) {
								local753 = Class48.method667(local738.substring(local471 + 5).trim());
								local1651 = -1;
								for (@Pc(1653) int local1653 = 0; local1653 < this.anInt232; local1653++) {
									if (this.aLongArray3[local1653] == local753) {
										local1651 = local1653;
										break;
									}
								}
								if (local1651 != -1 && this.anIntArray85[local1651] > 0) {
									this.aBoolean99 = true;
									this.aBoolean50 = false;
									this.aBoolean77 = true;
									this.aString13 = "";
									this.anInt356 = 3;
									this.aLong18 = this.aLongArray3[local1651];
									this.aString16 = "Enter message to send to " + this.aStringArray5[local1651];
								}
							}
						}
						if (local37 == 721) {
							anInt286 += local32;
							if (anInt286 >= 139) {
								this.aClass1_Sub1_Sub3_2.method469(73, 837);
								this.aClass1_Sub1_Sub3_2.method474(0);
							}
							this.method226(187, local42, local32, local27);
						}
						if (local37 == 524) {
							local738 = this.aStringArray6[arg0];
							local471 = local738.indexOf("@whi@");
							if (local471 != -1) {
								if (this.anInt220 == -1) {
									this.method150();
									this.aString17 = local738.substring(local471 + 5).trim();
									this.aBoolean49 = false;
									for (@Pc(1774) int local1774 = 0; local1774 < Class6.aClass6Array1.length; local1774++) {
										if (Class6.aClass6Array1[local1774] != null && Class6.aClass6Array1[local1774].anInt422 == 600) {
											this.anInt275 = this.anInt220 = Class6.aClass6Array1[local1774].anInt419;
											break;
										}
									}
								} else {
									this.method108("", "Please close the interface you have open before using 'report abuse'", 0);
								}
							}
						}
						if (local37 == 718) {
							if (this.aBoolean88) {
								this.aClass37_1.method568(this.aByte10, local27 - 4, local32 - 4);
							} else {
								this.aClass37_1.method568(this.aByte10, super.anInt200 - 4, super.anInt201 - 4);
							}
						}
						if (local37 == 398) {
							this.aClass1_Sub1_Sub3_2.method469(93, 837);
							this.aClass1_Sub1_Sub3_2.method471(local42);
							this.aClass1_Sub1_Sub3_2.method471(local27);
							this.aClass1_Sub1_Sub3_2.method471(local32);
							this.aClass1_Sub1_Sub3_2.method471(this.anInt292);
							this.aClass1_Sub1_Sub3_2.method471(this.anInt290);
							this.aClass1_Sub1_Sub3_2.method471(this.anInt291);
							this.anInt373 = 0;
							this.anInt374 = local32;
							this.anInt375 = local27;
							this.anInt376 = 2;
							if (Class6.aClass6Array1[local32].anInt419 == this.anInt220) {
								this.anInt376 = 1;
							}
							if (Class6.aClass6Array1[local32].anInt419 == this.anInt209) {
								this.anInt376 = 3;
							}
						}
						if (local37 == 694 || local37 == 962 || local37 == 795 || local37 == 681 || local37 == 100) {
							if (local37 == 681) {
								anInt355++;
								if (anInt355 >= 116) {
									this.aClass1_Sub1_Sub3_2.method469(252, 837);
									this.aClass1_Sub1_Sub3_2.method473(13018169);
								}
								this.aClass1_Sub1_Sub3_2.method469(76, 837);
							}
							if (local37 == 694) {
								this.aClass1_Sub1_Sub3_2.method469(88, 837);
							}
							if (local37 == 962) {
								this.aClass1_Sub1_Sub3_2.method469(149, 837);
							}
							if (local37 == 100) {
								this.aClass1_Sub1_Sub3_2.method469(215, 837);
							}
							if (local37 == 795) {
								this.aClass1_Sub1_Sub3_2.method469(219, 837);
							}
							this.aClass1_Sub1_Sub3_2.method471(local42);
							this.aClass1_Sub1_Sub3_2.method471(local27);
							this.aClass1_Sub1_Sub3_2.method471(local32);
							this.anInt373 = 0;
							this.anInt374 = local32;
							this.anInt375 = local27;
							this.anInt376 = 2;
							if (Class6.aClass6Array1[local32].anInt419 == this.anInt220) {
								this.anInt376 = 1;
							}
							if (Class6.aClass6Array1[local32].anInt419 == this.anInt209) {
								this.anInt376 = 3;
							}
						}
						if (local37 == 507 || local37 == 957) {
							local738 = this.aStringArray6[arg0];
							local471 = local738.indexOf("@whi@");
							if (local471 != -1) {
								local738 = local738.substring(local471 + 5).trim();
								local702 = Class48.method671(Class48.method668(Class48.method667(local738)));
								@Pc(2058) boolean local2058 = false;
								for (local1651 = 0; local1651 < this.anInt273; local1651++) {
									@Pc(2070) Class1_Sub1_Sub1_Sub1_Sub1 local2070 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[this.anIntArray53[local1651]];
									if (local2070 != null && local2070.aString3 != null && local2070.aString3.equalsIgnoreCase(local702)) {
										this.method154(2, local2070.anIntArray272[0], local2070.anIntArray273[0], 1, 0, 1, aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray272[0], 0, aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray273[0], false, 0);
										if (local37 == 507) {
											anInt279 += local42;
											if (anInt279 >= 66) {
												this.aClass1_Sub1_Sub3_2.method469(246, 837);
												this.aClass1_Sub1_Sub3_2.method470(154);
											}
											this.aClass1_Sub1_Sub3_2.method469(171, 837);
										}
										if (local37 == 957) {
											anInt354++;
											if (anInt354 >= 52) {
												this.aClass1_Sub1_Sub3_2.method469(210, 837);
												this.aClass1_Sub1_Sub3_2.method470(131);
											}
											this.aClass1_Sub1_Sub3_2.method469(38, 837);
										}
										this.aClass1_Sub1_Sub3_2.method471(this.anIntArray53[local1651]);
										local2058 = true;
										break;
									}
								}
								if (!local2058) {
									this.method108("", "Unable to find " + local702, 0);
								}
							}
						}
						if (local37 == 111) {
							local1267 = this.method154(2, local27, local32, 0, 0, 0, aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray272[0], 0, aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray273[0], false, 0);
							if (!local1267) {
								this.method154(2, local27, local32, 1, 0, 1, aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray272[0], 0, aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray273[0], false, 0);
							}
							this.anInt328 = super.anInt200;
							this.anInt329 = super.anInt201;
							this.anInt331 = 2;
							this.anInt330 = 0;
							this.aClass1_Sub1_Sub3_2.method469(59, 837);
							this.aClass1_Sub1_Sub3_2.method471(local27 + this.anInt213);
							this.aClass1_Sub1_Sub3_2.method471(local32 + this.anInt214);
							this.aClass1_Sub1_Sub3_2.method471(local42);
							this.aClass1_Sub1_Sub3_2.method471(this.anInt292);
							this.aClass1_Sub1_Sub3_2.method471(this.anInt290);
							this.aClass1_Sub1_Sub3_2.method471(this.anInt291);
						}
						if (local37 == 997 && !this.aBoolean73) {
							this.aClass1_Sub1_Sub3_2.method469(27, 837);
							this.aClass1_Sub1_Sub3_2.method471(local32);
							this.aBoolean73 = true;
						}
						this.anInt289 = 0;
						this.anInt260 = 0;
						this.aBoolean92 = true;
					}
				}
			}
		} catch (@Pc(2313) RuntimeException local2313) {
			signlink.reporterror("10224, " + -117 + ", " + arg0 + ", " + local2313.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "o", descriptor = "(Z)V")
	private void method212(@OriginalArg(0) boolean arg0) {
		try {
			if (this.anInt390 == 0) {
				this.aStringArray6[0] = "Cancel";
				if (!arg0) {
					this.method89();
				}
				this.anIntArray80[0] = 1106;
				this.anInt332 = 1;
				this.method160();
				this.anInt377 = 0;
				if (super.anInt194 > 4 && super.anInt195 > 4 && super.anInt194 < 516 && super.anInt195 < 338) {
					if (this.anInt220 == -1) {
						this.method103();
					} else {
						this.method221(0, 4, Class6.aClass6Array1[this.anInt220], super.anInt194, 4, super.anInt195);
					}
				}
				if (this.anInt377 != this.anInt263) {
					this.anInt263 = this.anInt377;
				}
				this.anInt377 = 0;
				if (super.anInt194 > 553 && super.anInt195 > 205 && super.anInt194 < 743 && super.anInt195 < 466) {
					if (this.anInt327 != -1) {
						this.method221(0, 553, Class6.aClass6Array1[this.anInt327], super.anInt194, 205, super.anInt195);
					} else if (this.anIntArray55[this.anInt241] != -1) {
						this.method221(0, 553, Class6.aClass6Array1[this.anIntArray55[this.anInt241]], super.anInt194, 205, super.anInt195);
					}
				}
				if (this.anInt377 != this.anInt277) {
					this.aBoolean92 = true;
					this.anInt277 = this.anInt377;
				}
				this.anInt377 = 0;
				if (super.anInt194 > 17 && super.anInt195 > 357 && super.anInt194 < 496 && super.anInt195 < 453) {
					if (this.anInt209 != -1) {
						this.method221(0, 17, Class6.aClass6Array1[this.anInt209], super.anInt194, 357, super.anInt195);
					} else if (super.anInt195 < 434 && super.anInt194 < 426) {
						this.method174(super.anInt194 - 17, 571, super.anInt195 - 357);
					}
				}
				if (this.anInt209 != -1 && this.anInt377 != this.anInt231) {
					this.aBoolean99 = true;
					this.anInt231 = this.anInt377;
				}
				@Pc(227) boolean local227 = false;
				while (!local227) {
					local227 = true;
					for (@Pc(233) int local233 = 0; local233 < this.anInt332 - 1; local233++) {
						if (this.anIntArray80[local233] < 1000 && this.anIntArray80[local233 + 1] > 1000) {
							@Pc(254) String local254 = this.aStringArray6[local233];
							this.aStringArray6[local233] = this.aStringArray6[local233 + 1];
							this.aStringArray6[local233 + 1] = local254;
							@Pc(276) int local276 = this.anIntArray80[local233];
							this.anIntArray80[local233] = this.anIntArray80[local233 + 1];
							this.anIntArray80[local233 + 1] = local276;
							@Pc(298) int local298 = this.anIntArray78[local233];
							this.anIntArray78[local233] = this.anIntArray78[local233 + 1];
							this.anIntArray78[local233 + 1] = local298;
							@Pc(320) int local320 = this.anIntArray79[local233];
							this.anIntArray79[local233] = this.anIntArray79[local233 + 1];
							this.anIntArray79[local233 + 1] = local320;
							@Pc(342) int local342 = this.anIntArray81[local233];
							this.anIntArray81[local233] = this.anIntArray81[local233 + 1];
							this.anIntArray81[local233 + 1] = local342;
							local227 = false;
						}
					}
				}
			}
		} catch (@Pc(372) RuntimeException local372) {
			signlink.reporterror("28391, " + arg0 + ", " + local372.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "p", descriptor = "(Z)V")
	private void method213() {
		try {
			this.anInt208 = 0;
			@Pc(15) int local15 = (aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt982 >> 7) + this.anInt213;
			@Pc(23) int local23 = (aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt983 >> 7) + this.anInt214;
			if (local15 >= 3053 && local15 <= 3156 && local23 >= 3056 && local23 <= 3136) {
				this.anInt208 = 1;
			}
			if (local15 >= 3072 && local15 <= 3118 && local23 >= 9492 && local23 <= 9535) {
				this.anInt208 = 1;
			}
			if (this.anInt208 == 1 && local15 >= 3139 && local15 <= 3199 && local23 >= 3008 && local23 <= 3062) {
				this.anInt208 = 0;
			}
		} catch (@Pc(74) RuntimeException local74) {
			signlink.reporterror("81923, " + false + ", " + local74.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "m", descriptor = "(B)V")
	private void method214() {
		try {
			this.aBoolean78 = true;
			for (@Pc(12) int local12 = 0; local12 < 7; local12++) {
				this.anIntArray65[local12] = -1;
				for (@Pc(21) int local21 = 0; local21 < Class23.anInt740; local21++) {
					if (!Class23.aClass23Array1[local21].aBoolean204 && Class23.aClass23Array1[local21].anInt741 == local12 + (this.aBoolean85 ? 0 : 7)) {
						this.anIntArray65[local12] = local21;
						break;
					}
				}
			}
		} catch (@Pc(58) RuntimeException local58) {
			signlink.reporterror("83346, " + 3 + ", " + local58.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "J", descriptor = "(I)V")
	private void method215() {
		try {
			if (this.aClass35_19 == null) {
				super.aClass35_2 = null;
				this.aClass35_9 = null;
				this.aClass35_7 = null;
				this.aClass35_6 = null;
				this.aClass35_8 = null;
				this.aClass35_3 = null;
				this.aClass35_4 = null;
				this.aClass35_5 = null;
				this.aClass35_22 = new Class35(this.method94(), 128, 265, -707);
				Class1_Sub1_Sub2.method437();
				this.aClass35_23 = new Class35(this.method94(), 128, 265, -707);
				Class1_Sub1_Sub2.method437();
				this.aClass35_19 = new Class35(this.method94(), 509, 171, -707);
				Class1_Sub1_Sub2.method437();
				this.aClass35_20 = new Class35(this.method94(), 360, 132, -707);
				Class1_Sub1_Sub2.method437();
				this.aClass35_21 = new Class35(this.method94(), 360, 200, -707);
				Class1_Sub1_Sub2.method437();
				this.aClass35_24 = new Class35(this.method94(), 202, 238, -707);
				Class1_Sub1_Sub2.method437();
				this.aClass35_25 = new Class35(this.method94(), 203, 238, -707);
				Class1_Sub1_Sub2.method437();
				this.aClass35_26 = new Class35(this.method94(), 74, 94, -707);
				Class1_Sub1_Sub2.method437();
				this.aClass35_27 = new Class35(this.method94(), 75, 94, -707);
				Class1_Sub1_Sub2.method437();
				if (this.aClass47_1 != null) {
					this.method139();
					this.method162();
				}
				this.aBoolean98 = true;
			}
		} catch (@Pc(165) RuntimeException local165) {
			signlink.reporterror("67173, " + -23747 + ", " + local165.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(JI)V")
	private void method216(@OriginalArg(0) long arg0) {
		try {
			if (arg0 != 0L) {
				if (this.anInt361 >= 100) {
					this.method108("", "Your ignore list is full. Max of 100 hit", 0);
				} else {
					@Pc(33) String local33 = Class48.method671(Class48.method668(arg0));
					for (@Pc(35) int local35 = 0; local35 < this.anInt361; local35++) {
						if (this.aLongArray4[local35] == arg0) {
							this.method108("", local33 + " is already on your ignore list", 0);
							return;
						}
					}
					for (@Pc(65) int local65 = 0; local65 < this.anInt232; local65++) {
						if (this.aLongArray3[local65] == arg0) {
							this.method108("", "Please remove " + local33 + " from your friend list first", 0);
							return;
						}
					}
					this.aLongArray4[this.anInt361++] = arg0;
					this.aBoolean92 = true;
					this.aClass1_Sub1_Sub3_2.method469(32, 837);
					this.aClass1_Sub1_Sub3_2.method476(this.aByte5, arg0);
				}
			}
		} catch (@Pc(121) RuntimeException local121) {
			signlink.reporterror("1894, " + arg0 + ", " + 9 + ", " + local121.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IJ)V")
	private void method217(@OriginalArg(1) long arg0) {
		try {
			if (arg0 != 0L) {
				if (this.anInt232 >= 100 && this.anInt321 != 1) {
					this.method108("", "Your friendlist is full. Max of 100 for free users, and 200 for members", 0);
				} else if (this.anInt232 >= 200) {
					this.method108("", "Your friendlist is full. Max of 100 for free users, and 200 for members", 0);
				} else {
					@Pc(38) String local38 = Class48.method671(Class48.method668(arg0));
					for (@Pc(40) int local40 = 0; local40 < this.anInt232; local40++) {
						if (this.aLongArray3[local40] == arg0) {
							this.method108("", local38 + " is already on your friend list", 0);
							return;
						}
					}
					for (@Pc(70) int local70 = 0; local70 < this.anInt361; local70++) {
						if (this.aLongArray4[local70] == arg0) {
							this.method108("", "Please remove " + local38 + " from your ignore list first", 0);
							return;
						}
					}
					if (!local38.equals(aClass1_Sub1_Sub1_Sub1_Sub1_1.aString3)) {
						this.aStringArray5[this.anInt232] = local38;
						this.aLongArray3[this.anInt232] = arg0;
						this.anIntArray85[this.anInt232] = 0;
						this.anInt232++;
						this.aBoolean92 = true;
						this.aClass1_Sub1_Sub3_2.method469(176, 837);
						this.aClass1_Sub1_Sub3_2.method476(this.aByte5, arg0);
					}
				}
			}
		} catch (@Pc(154) RuntimeException local154) {
			signlink.reporterror("46290, " + 6 + ", " + arg0 + ", " + local154.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "init", descriptor = "()V")
	@Override
	public void init() {
		anInt282 = Integer.parseInt(this.getParameter("nodeid"));
		anInt283 = Integer.parseInt(this.getParameter("portoff"));
		@Pc(15) String local15 = this.getParameter("lowmem");
		if (local15 != null && local15.equals("1")) {
			method104();
		} else {
			method133();
		}
		@Pc(31) String local31 = this.getParameter("free");
		if (local31 != null && local31.equals("1")) {
			aBoolean65 = false;
		} else {
			aBoolean65 = true;
		}
		this.method85();
	}

	@OriginalMember(owner = "client!client", name = "K", descriptor = "(I)V")
	private void method218() {
		try {
			this.aClass35_9.method524();
			Class1_Sub1_Sub2_Sub1.anIntArray180 = this.anIntArray56;
			this.aClass1_Sub1_Sub2_Sub3_3.method418(0, 0);
			if (this.aBoolean77) {
				this.aClass1_Sub1_Sub2_Sub4_3.method447(239, 0, this.aString16, 40);
				this.aClass1_Sub1_Sub2_Sub4_3.method447(239, 128, this.aString13 + "*", 60);
			} else if (this.aBoolean50) {
				this.aClass1_Sub1_Sub2_Sub4_3.method447(239, 0, "Enter amount:", 40);
				this.aClass1_Sub1_Sub2_Sub4_3.method447(239, 128, this.aString14 + "*", 60);
			} else if (this.aString4 != null) {
				this.aClass1_Sub1_Sub2_Sub4_3.method447(239, 0, this.aString4, 40);
				this.aClass1_Sub1_Sub2_Sub4_3.method447(239, 128, "Click to continue", 60);
			} else if (this.anInt209 != -1) {
				this.method135(0, Class6.aClass6Array1[this.anInt209], 0, 0);
			} else if (this.anInt333 == -1) {
				@Pc(130) Class1_Sub1_Sub2_Sub4 local130 = this.aClass1_Sub1_Sub2_Sub4_2;
				@Pc(132) int local132 = 0;
				Class1_Sub1_Sub2.method436(77, 463, 0, 0);
				for (@Pc(140) int local140 = 0; local140 < 100; local140++) {
					if (this.aStringArray3[local140] != null) {
						@Pc(152) int local152 = this.anIntArray40[local140];
						@Pc(161) int local161 = this.anInt304 + 70 - local132 * 14;
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
								local130.method451(local161, 0, 4, this.aStringArray3[local140]);
							}
							local132++;
						}
						@Pc(239) int local239;
						if ((local152 == 1 || local152 == 2) && (local152 == 1 || this.anInt210 == 0 || this.anInt210 == 1 && this.method185(this.anInt325, local166))) {
							if (local161 > 0 && local161 < 110) {
								local239 = 4;
								if (local168 == 1) {
									this.aClass1_Sub1_Sub2_Sub3Array3[0].method418(4, local161 - 12);
									local239 += 14;
								}
								if (local168 == 2) {
									this.aClass1_Sub1_Sub2_Sub3Array3[1].method418(local239, local161 - 12);
									local239 += 14;
								}
								local130.method451(local161, 0, local239, local166 + ":");
								local239 += local130.method449(local166) + 8;
								local130.method451(local161, 255, local239, this.aStringArray3[local140]);
							}
							local132++;
						}
						if ((local152 == 3 || local152 == 7) && this.anInt335 == 0 && (local152 == 7 || this.anInt353 == 0 || this.anInt353 == 1 && this.method185(this.anInt325, local166))) {
							if (local161 > 0 && local161 < 110) {
								local130.method451(local161, 0, 4, "From");
								local239 = local130.method449("From ") + 4;
								if (local168 == 1) {
									this.aClass1_Sub1_Sub2_Sub3Array3[0].method418(local239, local161 - 12);
									local239 += 14;
								}
								if (local168 == 2) {
									this.aClass1_Sub1_Sub2_Sub3Array3[1].method418(local239, local161 - 12);
									local239 += 14;
								}
								local130.method451(local161, 0, local239, local166 + ":");
								local239 += local130.method449(local166) + 8;
								local130.method451(local161, 8388608, local239, this.aStringArray3[local140]);
							}
							local132++;
						}
						if (local152 == 4 && (this.anInt293 == 0 || this.anInt293 == 1 && this.method185(this.anInt325, local166))) {
							if (local161 > 0 && local161 < 110) {
								local130.method451(local161, 8388736, 4, local166 + " " + this.aStringArray3[local140]);
							}
							local132++;
						}
						if (local152 == 5 && this.anInt335 == 0 && this.anInt353 < 2) {
							if (local161 > 0 && local161 < 110) {
								local130.method451(local161, 8388608, 4, this.aStringArray3[local140]);
							}
							local132++;
						}
						if (local152 == 6 && this.anInt335 == 0 && this.anInt353 < 2) {
							if (local161 > 0 && local161 < 110) {
								local130.method451(local161, 0, 4, "To " + local166 + ":");
								local130.method451(local161, 8388608, local130.method449("To " + local166) + 12, this.aStringArray3[local140]);
							}
							local132++;
						}
						if (local152 == 8 && (this.anInt293 == 0 || this.anInt293 == 1 && this.method185(this.anInt325, local166))) {
							if (local161 > 0 && local161 < 110) {
								local130.method451(local161, 8270336, 4, local166 + " " + this.aStringArray3[local140]);
							}
							local132++;
						}
					}
				}
				Class1_Sub1_Sub2.method435((byte) 3);
				this.anInt384 = local132 * 14 + 7;
				if (this.anInt384 < 78) {
					this.anInt384 = 78;
				}
				this.method176(77, 0, this.anInt384, this.aBoolean86, 463, this.anInt384 - this.anInt304 - 77);
				@Pc(613) String local613;
				if (aClass1_Sub1_Sub1_Sub1_Sub1_1 == null || aClass1_Sub1_Sub1_Sub1_Sub1_1.aString3 == null) {
					local613 = Class48.method671(this.aString10);
				} else {
					local613 = aClass1_Sub1_Sub1_Sub1_Sub1_1.aString3;
				}
				local130.method451(90, 0, 4, local613 + ":");
				local130.method451(90, 255, local130.method449(local613 + ": ") + 6, this.aString8 + "*");
				Class1_Sub1_Sub2.method442(0, 0, 77, 479);
			} else {
				this.method135(0, Class6.aClass6Array1[this.anInt333], 0, 0);
			}
			if (this.aBoolean88 && this.anInt313 == 2) {
				this.method171();
			}
			this.aClass35_9.method525(357, 17, super.aGraphics2);
			this.aClass35_8.method524();
			this.anInt248 += 0;
			Class1_Sub1_Sub2_Sub1.anIntArray180 = this.anIntArray58;
		} catch (@Pc(700) RuntimeException local700) {
			signlink.reporterror("38570, " + 0 + ", " + local700.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(Lclient!d;I)Z")
	private boolean method219(@OriginalArg(0) Class6 arg0) {
		try {
			@Pc(4) int local4 = arg0.anInt422;
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
				this.aStringArray6[this.anInt332] = "Remove @whi@" + this.aStringArray5[local4];
				this.anIntArray80[this.anInt332] = 513;
				this.anInt332++;
				this.aStringArray6[this.anInt332] = "Message @whi@" + this.aStringArray5[local4];
				this.anIntArray80[this.anInt332] = 902;
				this.anInt332++;
				return true;
			} else if (local4 >= 401 && local4 <= 500) {
				this.aStringArray6[this.anInt332] = "Remove @whi@" + arg0.aString18;
				this.anIntArray80[this.anInt332] = 884;
				this.anInt332++;
				return true;
			} else {
				return false;
			}
		} catch (@Pc(136) RuntimeException local136) {
			signlink.reporterror("82834, " + arg0 + ", " + -246 + ", " + local136.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "L", descriptor = "(I)V")
	private void method220(@OriginalArg(0) int arg0) {
		try {
			if (arg0 == -6835 && super.anInt199 == 1) {
				if (super.anInt200 >= 539 && super.anInt200 <= 573 && super.anInt201 >= 169 && super.anInt201 < 205 && this.anIntArray55[0] != -1) {
					this.aBoolean92 = true;
					this.anInt241 = 0;
					this.aBoolean60 = true;
				}
				if (super.anInt200 >= 569 && super.anInt200 <= 599 && super.anInt201 >= 168 && super.anInt201 < 205 && this.anIntArray55[1] != -1) {
					this.aBoolean92 = true;
					this.anInt241 = 1;
					this.aBoolean60 = true;
				}
				if (super.anInt200 >= 597 && super.anInt200 <= 627 && super.anInt201 >= 168 && super.anInt201 < 205 && this.anIntArray55[2] != -1) {
					this.aBoolean92 = true;
					this.anInt241 = 2;
					this.aBoolean60 = true;
				}
				if (super.anInt200 >= 625 && super.anInt200 <= 669 && super.anInt201 >= 168 && super.anInt201 < 203 && this.anIntArray55[3] != -1) {
					this.aBoolean92 = true;
					this.anInt241 = 3;
					this.aBoolean60 = true;
				}
				if (super.anInt200 >= 666 && super.anInt200 <= 696 && super.anInt201 >= 168 && super.anInt201 < 205 && this.anIntArray55[4] != -1) {
					this.aBoolean92 = true;
					this.anInt241 = 4;
					this.aBoolean60 = true;
				}
				if (super.anInt200 >= 694 && super.anInt200 <= 724 && super.anInt201 >= 168 && super.anInt201 < 205 && this.anIntArray55[5] != -1) {
					this.aBoolean92 = true;
					this.anInt241 = 5;
					this.aBoolean60 = true;
				}
				if (super.anInt200 >= 722 && super.anInt200 <= 756 && super.anInt201 >= 169 && super.anInt201 < 205 && this.anIntArray55[6] != -1) {
					this.aBoolean92 = true;
					this.anInt241 = 6;
					this.aBoolean60 = true;
				}
				if (super.anInt200 >= 540 && super.anInt200 <= 574 && super.anInt201 >= 466 && super.anInt201 < 502 && this.anIntArray55[7] != -1) {
					this.aBoolean92 = true;
					this.anInt241 = 7;
					this.aBoolean60 = true;
				}
				if (super.anInt200 >= 572 && super.anInt200 <= 602 && super.anInt201 >= 466 && super.anInt201 < 503 && this.anIntArray55[8] != -1) {
					this.aBoolean92 = true;
					this.anInt241 = 8;
					this.aBoolean60 = true;
				}
				if (super.anInt200 >= 599 && super.anInt200 <= 629 && super.anInt201 >= 466 && super.anInt201 < 503 && this.anIntArray55[9] != -1) {
					this.aBoolean92 = true;
					this.anInt241 = 9;
					this.aBoolean60 = true;
				}
				if (super.anInt200 >= 627 && super.anInt200 <= 671 && super.anInt201 >= 467 && super.anInt201 < 502 && this.anIntArray55[10] != -1) {
					this.aBoolean92 = true;
					this.anInt241 = 10;
					this.aBoolean60 = true;
				}
				if (super.anInt200 >= 669 && super.anInt200 <= 699 && super.anInt201 >= 466 && super.anInt201 < 503 && this.anIntArray55[11] != -1) {
					this.aBoolean92 = true;
					this.anInt241 = 11;
					this.aBoolean60 = true;
				}
				if (super.anInt200 >= 696 && super.anInt200 <= 726 && super.anInt201 >= 466 && super.anInt201 < 503 && this.anIntArray55[12] != -1) {
					this.aBoolean92 = true;
					this.anInt241 = 12;
					this.aBoolean60 = true;
				}
				if (super.anInt200 >= 724 && super.anInt200 <= 758 && super.anInt201 >= 466 && super.anInt201 < 502 && this.anIntArray55[13] != -1) {
					this.aBoolean92 = true;
					this.anInt241 = 13;
					this.aBoolean60 = true;
					return;
				}
			}
		} catch (@Pc(443) RuntimeException local443) {
			signlink.reporterror("41885, " + arg0 + ", " + local443.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIILclient!d;III)V")
	private void method221(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class6 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		try {
			if (arg2.anInt420 == 0 && arg2.anIntArray98 != null && !arg2.aBoolean104 && (arg3 >= arg1 && arg5 >= arg4 && arg3 <= arg1 + arg2.anInt423 && arg5 <= arg4 + arg2.anInt424)) {
				@Pc(45) int local45 = arg2.anIntArray98.length;
				for (@Pc(47) int local47 = 0; local47 < local45; local47++) {
					@Pc(56) int local56 = arg2.anIntArray99[local47] + arg1;
					@Pc(65) int local65 = arg2.anIntArray100[local47] + arg4 - arg0;
					@Pc(72) Class6 local72 = Class6.aClass6Array1[arg2.anIntArray98[local47]];
					@Pc(77) int local77 = local56 + local72.anInt425;
					@Pc(82) int local82 = local65 + local72.anInt426;
					if ((local72.anInt427 >= 0 || local72.anInt435 != 0) && arg3 >= local77 && arg5 >= local82 && arg3 < local77 + local72.anInt423 && arg5 < local82 + local72.anInt424) {
						if (local72.anInt427 >= 0) {
							this.anInt377 = local72.anInt427;
						} else {
							this.anInt377 = local72.anInt418;
						}
					}
					if (local72.anInt420 == 0) {
						this.method221(local72.anInt429, local77, local72, arg3, local82, arg5);
						if (local72.anInt428 > local72.anInt424) {
							this.method141(local72.anInt428, local82, arg5, arg3, local72.anInt424, this.anInt307, local72, true, local77 + local72.anInt423);
						}
					} else {
						if (local72.anInt421 == 1 && arg3 >= local77 && arg5 >= local82 && arg3 < local77 + local72.anInt423 && arg5 < local82 + local72.anInt424) {
							@Pc(180) boolean local180 = false;
							if (local72.anInt422 != 0) {
								local180 = this.method219(local72);
							}
							if (!local180) {
								this.aStringArray6[this.anInt332] = local72.aString22;
								this.anIntArray80[this.anInt332] = 231;
								this.anIntArray79[this.anInt332] = local72.anInt418;
								this.anInt332++;
							}
						}
						if (local72.anInt421 == 2 && this.anInt260 == 0 && arg3 >= local77 && arg5 >= local82 && arg3 < local77 + local72.anInt423 && arg5 < local82 + local72.anInt424) {
							@Pc(244) String local244 = local72.aString20;
							if (local244.indexOf(" ") != -1) {
								local244 = local244.substring(0, local244.indexOf(" "));
							}
							this.aStringArray6[this.anInt332] = local244 + " @gre@" + local72.aString21;
							this.anIntArray80[this.anInt332] = 274;
							this.anIntArray79[this.anInt332] = local72.anInt418;
							this.anInt332++;
						}
						if (local72.anInt421 == 3 && arg3 >= local77 && arg5 >= local82 && arg3 < local77 + local72.anInt423 && arg5 < local82 + local72.anInt424) {
							this.aStringArray6[this.anInt332] = "Close";
							this.anIntArray80[this.anInt332] = 737;
							this.anIntArray79[this.anInt332] = local72.anInt418;
							this.anInt332++;
						}
						if (local72.anInt421 == 4 && arg3 >= local77 && arg5 >= local82 && arg3 < local77 + local72.anInt423 && arg5 < local82 + local72.anInt424) {
							this.aStringArray6[this.anInt332] = local72.aString22;
							this.anIntArray80[this.anInt332] = 435;
							this.anIntArray79[this.anInt332] = local72.anInt418;
							this.anInt332++;
						}
						if (local72.anInt421 == 5 && arg3 >= local77 && arg5 >= local82 && arg3 < local77 + local72.anInt423 && arg5 < local82 + local72.anInt424) {
							this.aStringArray6[this.anInt332] = local72.aString22;
							this.anIntArray80[this.anInt332] = 225;
							this.anIntArray79[this.anInt332] = local72.anInt418;
							this.anInt332++;
						}
						if (local72.anInt421 == 6 && !this.aBoolean73 && arg3 >= local77 && arg5 >= local82 && arg3 < local77 + local72.anInt423 && arg5 < local82 + local72.anInt424) {
							this.aStringArray6[this.anInt332] = local72.aString22;
							this.anIntArray80[this.anInt332] = 997;
							this.anIntArray79[this.anInt332] = local72.anInt418;
							this.anInt332++;
						}
						if (local72.anInt420 == 2) {
							@Pc(492) int local492 = 0;
							for (@Pc(494) int local494 = 0; local494 < local72.anInt424; local494++) {
								for (@Pc(498) int local498 = 0; local498 < local72.anInt423; local498++) {
									@Pc(509) int local509 = local77 + local498 * (local72.anInt431 + 32);
									@Pc(518) int local518 = local82 + local494 * (local72.anInt432 + 32);
									if (local492 < 20) {
										local509 += local72.anIntArray101[local492];
										local518 += local72.anIntArray102[local492];
									}
									if (arg3 >= local509 && arg5 >= local518 && arg3 < local509 + 32 && arg5 < local518 + 32) {
										this.anInt255 = local492;
										this.anInt256 = local72.anInt418;
										if (local72.anIntArray94[local492] > 0) {
											@Pc(571) Class15 local571 = Class15.method361(local72.anIntArray94[local492] - 1);
											if (this.anInt289 == 1 && local72.aBoolean107) {
												if (local72.anInt418 != this.anInt291 || local492 != this.anInt290) {
													this.aStringArray6[this.anInt332] = "Use " + this.aString9 + " with @lre@" + local571.aString25;
													this.anIntArray80[this.anInt332] = 398;
													this.anIntArray81[this.anInt332] = local571.anInt593;
													this.anIntArray78[this.anInt332] = local492;
													this.anIntArray79[this.anInt332] = local72.anInt418;
													this.anInt332++;
												}
											} else if (this.anInt260 != 1 || !local72.aBoolean107) {
												@Pc(708) int local708;
												if (local72.aBoolean107) {
													for (local708 = 4; local708 >= 3; local708--) {
														if (local571.aStringArray11 != null && local571.aStringArray11[local708] != null) {
															this.aStringArray6[this.anInt332] = local571.aStringArray11[local708] + " @lre@" + local571.aString25;
															if (local708 == 3) {
																this.anIntArray80[this.anInt332] = 681;
															}
															if (local708 == 4) {
																this.anIntArray80[this.anInt332] = 100;
															}
															this.anIntArray81[this.anInt332] = local571.anInt593;
															this.anIntArray78[this.anInt332] = local492;
															this.anIntArray79[this.anInt332] = local72.anInt418;
															this.anInt332++;
														} else if (local708 == 4) {
															this.aStringArray6[this.anInt332] = "Drop @lre@" + local571.aString25;
															this.anIntArray80[this.anInt332] = 100;
															this.anIntArray81[this.anInt332] = local571.anInt593;
															this.anIntArray78[this.anInt332] = local492;
															this.anIntArray79[this.anInt332] = local72.anInt418;
															this.anInt332++;
														}
													}
												}
												if (local72.aBoolean108) {
													this.aStringArray6[this.anInt332] = "Use @lre@" + local571.aString25;
													this.anIntArray80[this.anInt332] = 102;
													this.anIntArray81[this.anInt332] = local571.anInt593;
													this.anIntArray78[this.anInt332] = local492;
													this.anIntArray79[this.anInt332] = local72.anInt418;
													this.anInt332++;
												}
												if (local72.aBoolean107 && local571.aStringArray11 != null) {
													for (local708 = 2; local708 >= 0; local708--) {
														if (local571.aStringArray11[local708] != null) {
															this.aStringArray6[this.anInt332] = local571.aStringArray11[local708] + " @lre@" + local571.aString25;
															if (local708 == 0) {
																this.anIntArray80[this.anInt332] = 694;
															}
															if (local708 == 1) {
																this.anIntArray80[this.anInt332] = 962;
															}
															if (local708 == 2) {
																this.anIntArray80[this.anInt332] = 795;
															}
															this.anIntArray81[this.anInt332] = local571.anInt593;
															this.anIntArray78[this.anInt332] = local492;
															this.anIntArray79[this.anInt332] = local72.anInt418;
															this.anInt332++;
														}
													}
												}
												if (local72.aStringArray7 != null) {
													for (local708 = 4; local708 >= 0; local708--) {
														if (local72.aStringArray7[local708] != null) {
															this.aStringArray6[this.anInt332] = local72.aStringArray7[local708] + " @lre@" + local571.aString25;
															if (local708 == 0) {
																this.anIntArray80[this.anInt332] = 582;
															}
															if (local708 == 1) {
																this.anIntArray80[this.anInt332] = 113;
															}
															if (local708 == 2) {
																this.anIntArray80[this.anInt332] = 555;
															}
															if (local708 == 3) {
																this.anIntArray80[this.anInt332] = 331;
															}
															if (local708 == 4) {
																this.anIntArray80[this.anInt332] = 354;
															}
															this.anIntArray81[this.anInt332] = local571.anInt593;
															this.anIntArray78[this.anInt332] = local492;
															this.anIntArray79[this.anInt332] = local72.anInt418;
															this.anInt332++;
														}
													}
												}
												this.aStringArray6[this.anInt332] = "Examine @lre@" + local571.aString25;
												this.anIntArray80[this.anInt332] = 1328;
												this.anIntArray81[this.anInt332] = local571.anInt593;
												this.anIntArray78[this.anInt332] = local492;
												this.anIntArray79[this.anInt332] = local72.anInt418;
												this.anInt332++;
											} else if ((this.anInt262 & 0x10) == 16) {
												this.aStringArray6[this.anInt332] = this.aString7 + " @lre@" + local571.aString25;
												this.anIntArray80[this.anInt332] = 563;
												this.anIntArray81[this.anInt332] = local571.anInt593;
												this.anIntArray78[this.anInt332] = local492;
												this.anIntArray79[this.anInt332] = local72.anInt418;
												this.anInt332++;
											}
										}
									}
									local492++;
								}
							}
						}
					}
				}
			}
		} catch (@Pc(1138) RuntimeException local1138) {
			signlink.reporterror("84240, " + arg0 + ", " + arg1 + ", " + 5973 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local1138.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "n", descriptor = "(B)V")
	private void method222(@OriginalArg(0) byte arg0) {
		try {
			try {
				if (this.aClass8_1 != null) {
					this.aClass8_1.method247();
				}
			} catch (@Pc(7) Exception local7) {
			}
			this.aClass8_1 = null;
			this.aBoolean48 = false;
			this.anInt324 = 0;
			this.aString10 = "";
			if (arg0 != 8) {
				this.anInt249 = this.aClass1_Sub1_Sub3_4.method480();
			}
			this.aString11 = "";
			this.method99();
			this.aClass37_1.method530(712);
			for (@Pc(39) int local39 = 0; local39 < 4; local39++) {
				this.aClass19Array1[local39].method420();
			}
			System.gc();
			this.method200();
			this.anInt364 = -1;
			this.anInt360 = -1;
			this.anInt343 = 0;
		} catch (@Pc(66) RuntimeException local66) {
			signlink.reporterror("61450, " + arg0 + ", " + local66.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(ZI)V")
	private void method223(@OriginalArg(0) boolean arg0) {
		try {
			if (aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt982 >> 7 == this.anInt370 && aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt983 >> 7 == this.anInt371) {
				this.anInt370 = 0;
				anInt305++;
				if (anInt305 > 122) {
					anInt305 = 0;
					this.aClass1_Sub1_Sub3_2.method469(174, 837);
					this.aClass1_Sub1_Sub3_2.method470(62);
				}
			}
			@Pc(39) int local39 = this.anInt273;
			if (arg0) {
				local39 = 1;
			}
			for (@Pc(53) int local53 = 0; local53 < local39; local53++) {
				@Pc(59) Class1_Sub1_Sub1_Sub1_Sub1 local59;
				@Pc(64) int local64;
				if (arg0) {
					local59 = aClass1_Sub1_Sub1_Sub1_Sub1_1;
					local64 = this.anInt272 << 14;
				} else {
					local59 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[this.anIntArray53[local53]];
					local64 = this.anIntArray53[local53] << 14;
				}
				if (local59 != null && local59.method680(this.aBoolean93)) {
					local59.aBoolean25 = false;
					if ((aBoolean66 && this.anInt273 > 50 || this.anInt273 > 200) && !arg0 && local59.anInt1002 == local59.anInt986) {
						local59.aBoolean25 = true;
					}
					@Pc(116) int local116 = local59.anInt982 >> 7;
					@Pc(121) int local121 = local59.anInt983 >> 7;
					if (local116 >= 0 && local116 < 104 && local121 >= 0 && local121 < 104) {
						if (local59.aClass1_Sub1_Sub1_Sub5_1 == null || anInt236 < local59.anInt131 || anInt236 >= local59.anInt132) {
							if ((local59.anInt982 & 0x7F) == 64 && (local59.anInt983 & 0x7F) == 64) {
								if (this.anIntArrayArray6[local116][local121] == this.anInt405) {
									continue;
								}
								this.anIntArrayArray6[local116][local121] = this.anInt405;
							}
							local59.anInt130 = this.method178(local59.anInt982, local59.anInt983, this.anInt334);
							this.aClass37_1.method541(local59.aBoolean264, this.anInt334, local59.anInt983, 60, local64, local59, local59.anInt130, local59.anInt984, local59.anInt982);
						} else {
							local59.aBoolean25 = false;
							local59.anInt130 = this.method178(local59.anInt982, local59.anInt983, this.anInt334);
							this.aClass37_1.method542(local64, local59, local59.anInt138, this.anInt334, local59.anInt130, local59.anInt137, local59.anInt983, local59.anInt139, local59.anInt982, local59.anInt984, local59.anInt136);
						}
					}
				}
			}
		} catch (@Pc(250) RuntimeException local250) {
			signlink.reporterror("89258, " + arg0 + ", " + -18210 + ", " + local250.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "o", descriptor = "(B)V")
	private void method224(@OriginalArg(0) byte arg0) {
		try {
			if (this.aClass35_9 == null) {
				this.method110();
				super.aClass35_2 = null;
				this.aClass35_19 = null;
				this.aClass35_20 = null;
				this.aClass35_21 = null;
				this.aClass35_22 = null;
				this.aClass35_23 = null;
				this.aClass35_24 = null;
				this.aClass35_25 = null;
				this.aClass35_26 = null;
				@Pc(38) boolean local38 = false;
				this.aClass35_27 = null;
				this.aClass35_9 = new Class35(this.method94(), 479, 96, -707);
				this.aClass35_7 = new Class35(this.method94(), 172, 156, -707);
				Class1_Sub1_Sub2.method437();
				this.aClass1_Sub1_Sub2_Sub3_2.method418(0, 0);
				this.aClass35_6 = new Class35(this.method94(), 190, 261, -707);
				this.aClass35_8 = new Class35(this.method94(), 512, 334, -707);
				Class1_Sub1_Sub2.method437();
				this.aClass35_3 = new Class35(this.method94(), 496, 50, -707);
				this.aClass35_4 = new Class35(this.method94(), 269, 37, -707);
				this.aClass35_5 = new Class35(this.method94(), 249, 45, -707);
				this.aBoolean98 = true;
			}
		} catch (@Pc(139) RuntimeException local139) {
			signlink.reporterror("95398, " + arg0 + ", " + local139.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(III)Z")
	private boolean method225(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		try {
			@Pc(10) boolean local10 = false;
			@Pc(14) Class6 local14 = Class6.aClass6Array1[arg1];
			for (@Pc(16) int local16 = 0; local16 < local14.anIntArray98.length && local14.anIntArray98[local16] != -1; local16++) {
				@Pc(31) Class6 local31 = Class6.aClass6Array1[local14.anIntArray98[local16]];
				if (local31.anInt420 == 1) {
					local10 |= this.method225(arg0, local31.anInt418);
				}
				if (local31.anInt420 == 6 && (local31.anInt441 != -1 || local31.anInt442 != -1)) {
					@Pc(61) boolean local61 = this.method173(local31);
					@Pc(66) int local66;
					if (local61) {
						local66 = local31.anInt442;
					} else {
						local66 = local31.anInt441;
					}
					if (local66 != -1) {
						@Pc(78) Class27 local78 = Class27.aClass27Array1[local66];
						local31.anInt417 += arg0;
						while (local31.anInt417 > local78.method506(local31.anInt416)) {
							local31.anInt417 -= local78.method506(local31.anInt416) + 1;
							local31.anInt416++;
							if (local31.anInt416 >= local78.anInt785) {
								local31.anInt416 -= local78.anInt786;
								if (local31.anInt416 < 0 || local31.anInt416 >= local78.anInt785) {
									local31.anInt416 = 0;
								}
							}
							local10 = true;
						}
					}
				}
			}
			return local10;
		} catch (@Pc(146) RuntimeException local146) {
			signlink.reporterror("46759, " + 1 + ", " + arg0 + ", " + arg1 + ", " + local146.toString());
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
				return new URL("http://127.0.0.1:" + (anInt283 + 80));
			}
		} catch (@Pc(21) Exception local21) {
		}
		return super.getCodeBase();
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IBIII)Z")
	private boolean method226(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		try {
			@Pc(7) int local7 = arg1 >> 14 & 0x7FFF;
			@Pc(16) int local16 = this.aClass37_1.method560(this.anInt334, arg3, arg2, arg1);
			if (this.aByte12 != 6) {
				this.aClass1_Sub1_Sub3_2.method470(88);
			}
			if (local16 == -1) {
				return false;
			}
			@Pc(33) int local33 = local16 & 0x1F;
			@Pc(39) int local39 = local16 >> 6 & 0x3;
			anInt222++;
			if (anInt222 > 1086) {
				anInt222 = 0;
				this.aClass1_Sub1_Sub3_2.method469(162, 837);
				this.aClass1_Sub1_Sub3_2.method470(0);
				@Pc(61) int local61 = this.aClass1_Sub1_Sub3_2.anInt733;
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
				this.aClass1_Sub1_Sub3_2.method479(this.aClass1_Sub1_Sub3_2.anInt733 - local61);
			}
			if (local33 == 10 || local33 == 11 || local33 == 22) {
				@Pc(141) Class9 local141 = Class9.method288(local7);
				@Pc(149) int local149;
				@Pc(152) int local152;
				if (local39 == 0 || local39 == 2) {
					local149 = local141.anInt502;
					local152 = local141.anInt503;
				} else {
					local149 = local141.anInt503;
					local152 = local141.anInt502;
				}
				@Pc(163) int local163 = local141.anInt514;
				if (local39 != 0) {
					local163 = (local163 << local39 & 0xF) + (local163 >> 4 - local39);
				}
				this.method154(2, arg3, arg2, local149, 0, local152, aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray272[0], 0, aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray273[0], false, local163);
			} else {
				this.method154(2, arg3, arg2, 0, local33 + 1, 0, aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray272[0], local39, aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray273[0], false, 0);
			}
			this.anInt328 = super.anInt200;
			this.anInt329 = super.anInt201;
			this.anInt331 = 2;
			this.anInt330 = 0;
			this.aClass1_Sub1_Sub3_2.method469(arg0, 837);
			this.aClass1_Sub1_Sub3_2.method471(arg3 + this.anInt213);
			this.aClass1_Sub1_Sub3_2.method471(arg2 + this.anInt214);
			this.aClass1_Sub1_Sub3_2.method471(local7);
			return true;
		} catch (@Pc(263) RuntimeException local263) {
			signlink.reporterror("9253, " + arg0 + ", " + 6 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local263.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(BI)V")
	private void method227(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(4) boolean local4 = false;
			signlink.anInt934 = arg1;
		} catch (@Pc(18) RuntimeException local18) {
			signlink.reporterror("75160, " + arg0 + ", " + arg1 + ", " + local18.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(IZ)V")
	private void method228(@OriginalArg(1) boolean arg0) {
		try {
			for (@Pc(6) int local6 = 0; local6 < this.anInt242; local6++) {
				@Pc(16) Class1_Sub1_Sub1_Sub1_Sub2 local16 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[this.anIntArray42[local6]];
				@Pc(25) int local25 = (this.anIntArray42[local6] << 14) + 536870912;
				if (local16 != null && local16.method680(this.aBoolean93) && local16.aClass13_2.aBoolean154 == arg0) {
					@Pc(42) int local42 = local16.anInt982 >> 7;
					@Pc(47) int local47 = local16.anInt983 >> 7;
					if (local42 >= 0 && local42 < 104 && local47 >= 0 && local47 < 104) {
						if (local16.anInt985 == 1 && (local16.anInt982 & 0x7F) == 64 && (local16.anInt983 & 0x7F) == 64) {
							if (this.anIntArrayArray6[local42][local47] == this.anInt405) {
								continue;
							}
							this.anIntArrayArray6[local42][local47] = this.anInt405;
						}
						this.aClass37_1.method541(local16.aBoolean264, this.anInt334, local16.anInt983, (local16.anInt985 - 1) * 64 + 60, local25, local16, this.method178(local16.anInt982, local16.anInt983, this.anInt334), local16.anInt984, local16.anInt982);
					}
				}
			}
		} catch (@Pc(131) RuntimeException local131) {
			signlink.reporterror("43668, " + 298 + ", " + arg0 + ", " + local131.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(ZI)V")
	private void method229(@OriginalArg(1) int arg0) {
		try {
			if (!aBoolean66) {
				@Pc(15) Class1_Sub1_Sub2_Sub3 local15;
				@Pc(23) int local23;
				@Pc(31) int local31;
				@Pc(34) byte[] local34;
				@Pc(37) byte[] local37;
				@Pc(39) int local39;
				if (Class1_Sub1_Sub2_Sub1.anIntArray182[17] >= arg0) {
					local15 = Class1_Sub1_Sub2_Sub1.aClass1_Sub1_Sub2_Sub3Array5[17];
					local23 = local15.anInt667 * local15.anInt668 - 1;
					local31 = local15.anInt667 * this.anInt323 * 2;
					local34 = local15.aByteArray7;
					local37 = this.aByteArray2;
					for (local39 = 0; local39 <= local23; local39++) {
						local37[local39] = local34[local39 - local31 & local23];
					}
					local15.aByteArray7 = local37;
					this.aByteArray2 = local34;
					Class1_Sub1_Sub2_Sub1.method349(17);
				}
				if (Class1_Sub1_Sub2_Sub1.anIntArray182[24] >= arg0) {
					local15 = Class1_Sub1_Sub2_Sub1.aClass1_Sub1_Sub2_Sub3Array5[24];
					local23 = local15.anInt667 * local15.anInt668 - 1;
					local31 = local15.anInt667 * this.anInt323 * 2;
					local34 = local15.aByteArray7;
					local37 = this.aByteArray2;
					for (local39 = 0; local39 <= local23; local39++) {
						local37[local39] = local34[local39 - local31 & local23];
					}
					local15.aByteArray7 = local37;
					this.aByteArray2 = local34;
					Class1_Sub1_Sub2_Sub1.method349(24);
					return;
				}
			}
		} catch (@Pc(124) RuntimeException local124) {
			signlink.reporterror("30047, " + false + ", " + arg0 + ", " + local124.toString());
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

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(BIIILclient!ab;)V")
	private void method230(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class1_Sub1_Sub1_Sub1_Sub1 arg3) {
		try {
			if (arg3 != aClass1_Sub1_Sub1_Sub1_Sub1_1 && this.anInt332 < 400) {
				@Pc(40) String local40;
				if (arg3.anInt129 == 0) {
					local40 = arg3.aString3 + method132(aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt128, arg3.anInt128) + " (level-" + arg3.anInt128 + ")";
				} else {
					local40 = arg3.aString3 + " (skill-" + arg3.anInt129 + ")";
				}
				@Pc(170) int local170;
				if (this.anInt289 == 1) {
					this.aStringArray6[this.anInt332] = "Use " + this.aString9 + " with @whi@" + local40;
					this.anIntArray80[this.anInt332] = 275;
					this.anIntArray81[this.anInt332] = arg2;
					this.anIntArray78[this.anInt332] = arg1;
					this.anIntArray79[this.anInt332] = arg0;
					this.anInt332++;
				} else if (this.anInt260 != 1) {
					for (local170 = 4; local170 >= 0; local170--) {
						if (this.aStringArray1[local170] != null) {
							this.aStringArray6[this.anInt332] = this.aStringArray1[local170] + " @whi@" + local40;
							@Pc(197) short local197 = 0;
							if (this.aStringArray1[local170].equalsIgnoreCase("attack")) {
								if (arg3.anInt128 > aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt128) {
									local197 = 2000;
								}
								if (aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt140 != 0 && arg3.anInt140 != 0) {
									if (aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt140 == arg3.anInt140) {
										local197 = 2000;
									} else {
										local197 = 0;
									}
								}
							} else if (this.aBooleanArray3[local170]) {
								local197 = 2000;
							}
							if (local170 == 0) {
								this.anIntArray80[this.anInt332] = local197 + 639;
							}
							if (local170 == 1) {
								this.anIntArray80[this.anInt332] = local197 + 499;
							}
							if (local170 == 2) {
								this.anIntArray80[this.anInt332] = local197 + 27;
							}
							if (local170 == 3) {
								this.anIntArray80[this.anInt332] = local197 + 387;
							}
							if (local170 == 4) {
								this.anIntArray80[this.anInt332] = local197 + 185;
							}
							this.anIntArray81[this.anInt332] = arg2;
							this.anIntArray78[this.anInt332] = arg1;
							this.anIntArray79[this.anInt332] = arg0;
							this.anInt332++;
						}
					}
				} else if ((this.anInt262 & 0x8) == 8) {
					this.aStringArray6[this.anInt332] = this.aString7 + " @whi@" + local40;
					this.anIntArray80[this.anInt332] = 131;
					this.anIntArray81[this.anInt332] = arg2;
					this.anIntArray78[this.anInt332] = arg1;
					this.anIntArray79[this.anInt332] = arg0;
					this.anInt332++;
				}
				for (local170 = 0; local170 < this.anInt332; local170++) {
					if (this.anIntArray80[local170] == 718) {
						this.aStringArray6[local170] = "Walk here @whi@" + local40;
						return;
					}
				}
			}
		} catch (@Pc(347) RuntimeException local347) {
			signlink.reporterror("78926, " + -95 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local347.toString());
			throw new RuntimeException();
		}
	}
}
