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

	@OriginalMember(owner = "client!client", name = "O", descriptor = "I")
	private static int anInt194;

	@OriginalMember(owner = "client!client", name = "R", descriptor = "I")
	private static int anInt196;

	@OriginalMember(owner = "client!client", name = "V", descriptor = "Lclient!ab;")
	public static Class1_Sub1_Sub1_Sub1_Sub1 aClass1_Sub1_Sub1_Sub1_Sub1_1;

	@OriginalMember(owner = "client!client", name = "ab", descriptor = "I")
	private static int anInt199;

	@OriginalMember(owner = "client!client", name = "Hb", descriptor = "Z")
	private static boolean aBoolean56;

	@OriginalMember(owner = "client!client", name = "Nb", descriptor = "I")
	private static int anInt218;

	@OriginalMember(owner = "client!client", name = "wc", descriptor = "I")
	public static int anInt239;

	@OriginalMember(owner = "client!client", name = "Wc", descriptor = "I")
	private static int anInt250;

	@OriginalMember(owner = "client!client", name = "Yc", descriptor = "Z")
	private static boolean aBoolean63;

	@OriginalMember(owner = "client!client", name = "ed", descriptor = "I")
	private static int anInt257;

	@OriginalMember(owner = "client!client", name = "rd", descriptor = "Z")
	private static boolean aBoolean64;

	@OriginalMember(owner = "client!client", name = "xe", descriptor = "I")
	private static int anInt286;

	@OriginalMember(owner = "client!client", name = "Ce", descriptor = "Z")
	private static boolean aBoolean70;

	@OriginalMember(owner = "client!client", name = "Ge", descriptor = "I")
	public static int anInt292;

	@OriginalMember(owner = "client!client", name = "Ie", descriptor = "Z")
	private static boolean aBoolean72;

	@OriginalMember(owner = "client!client", name = "af", descriptor = "I")
	private static int anInt302;

	@OriginalMember(owner = "client!client", name = "jf", descriptor = "I")
	private static int anInt306;

	@OriginalMember(owner = "client!client", name = "Of", descriptor = "I")
	private static int anInt320;

	@OriginalMember(owner = "client!client", name = "eh", descriptor = "I")
	private static int anInt348;

	@OriginalMember(owner = "client!client", name = "Ah", descriptor = "I")
	private static int anInt358;

	@OriginalMember(owner = "client!client", name = "ni", descriptor = "I")
	private static int anInt381;

	@OriginalMember(owner = "client!client", name = "vi", descriptor = "I")
	private static int anInt384;

	@OriginalMember(owner = "client!client", name = "Bi", descriptor = "I")
	private static int anInt385;

	@OriginalMember(owner = "client!client", name = "Ui", descriptor = "I")
	private static int anInt396;

	@OriginalMember(owner = "client!client", name = "Vi", descriptor = "I")
	private static int anInt397;

	@OriginalMember(owner = "client!client", name = "J", descriptor = "[[I")
	public static final int[][] anIntArrayArray3 = new int[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, 33697, 22433, 2983, 54193 }, { 8741, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003, 25239 }, { 25238, 8742, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };

	@OriginalMember(owner = "client!client", name = "kc", descriptor = "Z")
	private static boolean aBoolean60 = true;

	@OriginalMember(owner = "client!client", name = "Kd", descriptor = "Ljava/math/BigInteger;")
	private static BigInteger aBigInteger1 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");

	@OriginalMember(owner = "client!client", name = "le", descriptor = "Z")
	private static boolean aBoolean68 = true;

	@OriginalMember(owner = "client!client", name = "De", descriptor = "[I")
	public static int[] anIntArray57 = new int[32];

	@OriginalMember(owner = "client!client", name = "Fe", descriptor = "I")
	private static int anInt291;

	@OriginalMember(owner = "client!client", name = "He", descriptor = "Z")
	private static boolean aBoolean71;

	@OriginalMember(owner = "client!client", name = "Je", descriptor = "[I")
	private static int[] anIntArray58;

	@OriginalMember(owner = "client!client", name = "kg", descriptor = "[I")
	public static final int[] anIntArray67;

	@OriginalMember(owner = "client!client", name = "ki", descriptor = "I")
	private static int anInt380;

	@OriginalMember(owner = "client!client", name = "oi", descriptor = "Ljava/math/BigInteger;")
	private static BigInteger aBigInteger2;

	@OriginalMember(owner = "client!client", name = "Ii", descriptor = "Ljava/lang/String;")
	private static String aString17;

	@OriginalMember(owner = "client!client", name = "hj", descriptor = "B")
	private static byte aByte9;

	@OriginalMember(owner = "client!client", name = "I", descriptor = "I")
	private int anInt193;

	@OriginalMember(owner = "client!client", name = "P", descriptor = "I")
	private int anInt195;

	@OriginalMember(owner = "client!client", name = "S", descriptor = "[I")
	private int[] anIntArray36;

	@OriginalMember(owner = "client!client", name = "T", descriptor = "[I")
	private int[] anIntArray37;

	@OriginalMember(owner = "client!client", name = "U", descriptor = "[I")
	private int[] anIntArray38;

	@OriginalMember(owner = "client!client", name = "X", descriptor = "Lclient!xb;")
	private Class47 aClass47_1;

	@OriginalMember(owner = "client!client", name = "bb", descriptor = "[[B")
	private byte[][] aByteArrayArray1;

	@OriginalMember(owner = "client!client", name = "cb", descriptor = "I")
	private int anInt200;

	@OriginalMember(owner = "client!client", name = "db", descriptor = "[I")
	private int[] anIntArray39;

	@OriginalMember(owner = "client!client", name = "eb", descriptor = "[I")
	private int[] anIntArray40;

	@OriginalMember(owner = "client!client", name = "fb", descriptor = "[I")
	private int[] anIntArray41;

	@OriginalMember(owner = "client!client", name = "gb", descriptor = "[I")
	private int[] anIntArray42;

	@OriginalMember(owner = "client!client", name = "hb", descriptor = "I")
	private int anInt201;

	@OriginalMember(owner = "client!client", name = "ib", descriptor = "I")
	private int anInt202;

	@OriginalMember(owner = "client!client", name = "jb", descriptor = "Lclient!ib;")
	private Class1_Sub1_Sub2_Sub2 aClass1_Sub1_Sub2_Sub2_1;

	@OriginalMember(owner = "client!client", name = "kb", descriptor = "I")
	private int anInt203;

	@OriginalMember(owner = "client!client", name = "lb", descriptor = "I")
	private int anInt204;

	@OriginalMember(owner = "client!client", name = "mb", descriptor = "I")
	private int anInt205;

	@OriginalMember(owner = "client!client", name = "nb", descriptor = "I")
	private int anInt206;

	@OriginalMember(owner = "client!client", name = "ob", descriptor = "I")
	private int anInt207;

	@OriginalMember(owner = "client!client", name = "zb", descriptor = "Lclient!ib;")
	private Class1_Sub1_Sub2_Sub2 aClass1_Sub1_Sub2_Sub2_2;

	@OriginalMember(owner = "client!client", name = "Ab", descriptor = "Lclient!ib;")
	private Class1_Sub1_Sub2_Sub2 aClass1_Sub1_Sub2_Sub2_3;

	@OriginalMember(owner = "client!client", name = "Bb", descriptor = "Lclient!ib;")
	private Class1_Sub1_Sub2_Sub2 aClass1_Sub1_Sub2_Sub2_4;

	@OriginalMember(owner = "client!client", name = "Cb", descriptor = "Lclient!ib;")
	private Class1_Sub1_Sub2_Sub2 aClass1_Sub1_Sub2_Sub2_5;

	@OriginalMember(owner = "client!client", name = "Db", descriptor = "I")
	private int anInt211;

	@OriginalMember(owner = "client!client", name = "Gb", descriptor = "I")
	private int anInt212;

	@OriginalMember(owner = "client!client", name = "Ib", descriptor = "I")
	private int anInt213;

	@OriginalMember(owner = "client!client", name = "Jb", descriptor = "I")
	private int anInt214;

	@OriginalMember(owner = "client!client", name = "Kb", descriptor = "I")
	private int anInt215;

	@OriginalMember(owner = "client!client", name = "Lb", descriptor = "I")
	private int anInt216;

	@OriginalMember(owner = "client!client", name = "Mb", descriptor = "I")
	private int anInt217;

	@OriginalMember(owner = "client!client", name = "Pb", descriptor = "I")
	private int anInt219;

	@OriginalMember(owner = "client!client", name = "Sb", descriptor = "I")
	private int anInt220;

	@OriginalMember(owner = "client!client", name = "Wb", descriptor = "I")
	private int anInt222;

	@OriginalMember(owner = "client!client", name = "Xb", descriptor = "I")
	private int anInt223;

	@OriginalMember(owner = "client!client", name = "Yb", descriptor = "I")
	private int anInt224;

	@OriginalMember(owner = "client!client", name = "Zb", descriptor = "I")
	private int anInt225;

	@OriginalMember(owner = "client!client", name = "ac", descriptor = "I")
	private int anInt226;

	@OriginalMember(owner = "client!client", name = "bc", descriptor = "Lclient!wb;")
	private Class46 aClass46_1;

	@OriginalMember(owner = "client!client", name = "cc", descriptor = "J")
	private long aLong14;

	@OriginalMember(owner = "client!client", name = "dc", descriptor = "I")
	private int anInt227;

	@OriginalMember(owner = "client!client", name = "gc", descriptor = "Ljava/lang/String;")
	private String aString5;

	@OriginalMember(owner = "client!client", name = "hc", descriptor = "I")
	private int anInt229;

	@OriginalMember(owner = "client!client", name = "jc", descriptor = "I")
	private int anInt230;

	@OriginalMember(owner = "client!client", name = "nc", descriptor = "I")
	private int anInt231;

	@OriginalMember(owner = "client!client", name = "oc", descriptor = "I")
	private int anInt232;

	@OriginalMember(owner = "client!client", name = "pc", descriptor = "I")
	private int anInt233;

	@OriginalMember(owner = "client!client", name = "qc", descriptor = "I")
	private int anInt234;

	@OriginalMember(owner = "client!client", name = "rc", descriptor = "I")
	private int anInt235;

	@OriginalMember(owner = "client!client", name = "sc", descriptor = "I")
	private int anInt236;

	@OriginalMember(owner = "client!client", name = "vc", descriptor = "I")
	private int anInt238;

	@OriginalMember(owner = "client!client", name = "Ac", descriptor = "I")
	private int anInt242;

	@OriginalMember(owner = "client!client", name = "Cc", descriptor = "I")
	private int anInt243;

	@OriginalMember(owner = "client!client", name = "Gc", descriptor = "[[B")
	private byte[][] aByteArrayArray2;

	@OriginalMember(owner = "client!client", name = "Jc", descriptor = "Lclient!ib;")
	private Class1_Sub1_Sub2_Sub2 aClass1_Sub1_Sub2_Sub2_6;

	@OriginalMember(owner = "client!client", name = "Kc", descriptor = "Lclient!ib;")
	private Class1_Sub1_Sub2_Sub2 aClass1_Sub1_Sub2_Sub2_7;

	@OriginalMember(owner = "client!client", name = "Mc", descriptor = "Lclient!ib;")
	private Class1_Sub1_Sub2_Sub2 aClass1_Sub1_Sub2_Sub2_8;

	@OriginalMember(owner = "client!client", name = "Nc", descriptor = "I")
	private int anInt246;

	@OriginalMember(owner = "client!client", name = "Oc", descriptor = "I")
	private int anInt247;

	@OriginalMember(owner = "client!client", name = "Qc", descriptor = "I")
	private int anInt249;

	@OriginalMember(owner = "client!client", name = "Rc", descriptor = "Lclient!qb;")
	private Class35 aClass35_3;

	@OriginalMember(owner = "client!client", name = "Sc", descriptor = "Lclient!qb;")
	private Class35 aClass35_4;

	@OriginalMember(owner = "client!client", name = "Tc", descriptor = "Lclient!qb;")
	private Class35 aClass35_5;

	@OriginalMember(owner = "client!client", name = "Uc", descriptor = "Lclient!qb;")
	private Class35 aClass35_6;

	@OriginalMember(owner = "client!client", name = "Zc", descriptor = "I")
	private int anInt252;

	@OriginalMember(owner = "client!client", name = "ad", descriptor = "I")
	private int anInt253;

	@OriginalMember(owner = "client!client", name = "bd", descriptor = "I")
	private int anInt254;

	@OriginalMember(owner = "client!client", name = "cd", descriptor = "I")
	private int anInt255;

	@OriginalMember(owner = "client!client", name = "dd", descriptor = "I")
	private int anInt256;

	@OriginalMember(owner = "client!client", name = "fd", descriptor = "I")
	private int anInt258;

	@OriginalMember(owner = "client!client", name = "hd", descriptor = "I")
	private int anInt260;

	@OriginalMember(owner = "client!client", name = "id", descriptor = "I")
	private int anInt261;

	@OriginalMember(owner = "client!client", name = "md", descriptor = "Lclient!r;")
	private Class37 aClass37_1;

	@OriginalMember(owner = "client!client", name = "nd", descriptor = "I")
	private int anInt264;

	@OriginalMember(owner = "client!client", name = "sd", descriptor = "I")
	private int anInt265;

	@OriginalMember(owner = "client!client", name = "ud", descriptor = "I")
	private int anInt267;

	@OriginalMember(owner = "client!client", name = "wd", descriptor = "Lclient!jb;")
	private Class1_Sub1_Sub2_Sub3 aClass1_Sub1_Sub2_Sub3_1;

	@OriginalMember(owner = "client!client", name = "xd", descriptor = "Lclient!jb;")
	private Class1_Sub1_Sub2_Sub3 aClass1_Sub1_Sub2_Sub3_2;

	@OriginalMember(owner = "client!client", name = "yd", descriptor = "Lclient!jb;")
	private Class1_Sub1_Sub2_Sub3 aClass1_Sub1_Sub2_Sub3_3;

	@OriginalMember(owner = "client!client", name = "zd", descriptor = "I")
	private int anInt268;

	@OriginalMember(owner = "client!client", name = "Ad", descriptor = "I")
	private int anInt269;

	@OriginalMember(owner = "client!client", name = "Bd", descriptor = "Lclient!qb;")
	private Class35 aClass35_7;

	@OriginalMember(owner = "client!client", name = "Cd", descriptor = "Lclient!qb;")
	private Class35 aClass35_8;

	@OriginalMember(owner = "client!client", name = "Dd", descriptor = "Lclient!qb;")
	private Class35 aClass35_9;

	@OriginalMember(owner = "client!client", name = "Ed", descriptor = "Lclient!qb;")
	private Class35 aClass35_10;

	@OriginalMember(owner = "client!client", name = "Fd", descriptor = "Lclient!qb;")
	private Class35 aClass35_11;

	@OriginalMember(owner = "client!client", name = "Gd", descriptor = "Lclient!qb;")
	private Class35 aClass35_12;

	@OriginalMember(owner = "client!client", name = "Hd", descriptor = "Lclient!qb;")
	private Class35 aClass35_13;

	@OriginalMember(owner = "client!client", name = "Id", descriptor = "Lclient!qb;")
	private Class35 aClass35_14;

	@OriginalMember(owner = "client!client", name = "Jd", descriptor = "Lclient!qb;")
	private Class35 aClass35_15;

	@OriginalMember(owner = "client!client", name = "Nd", descriptor = "Lclient!ub;")
	private Class44_Sub1 aClass44_Sub1_1;

	@OriginalMember(owner = "client!client", name = "Pd", descriptor = "[I")
	private int[] anIntArray51;

	@OriginalMember(owner = "client!client", name = "Qd", descriptor = "[I")
	private int[] anIntArray52;

	@OriginalMember(owner = "client!client", name = "Rd", descriptor = "I")
	private int anInt271;

	@OriginalMember(owner = "client!client", name = "Td", descriptor = "I")
	private int anInt272;

	@OriginalMember(owner = "client!client", name = "Xd", descriptor = "I")
	private int anInt273;

	@OriginalMember(owner = "client!client", name = "ae", descriptor = "Lclient!kb;")
	private Class1_Sub1_Sub2_Sub4 aClass1_Sub1_Sub2_Sub4_1;

	@OriginalMember(owner = "client!client", name = "be", descriptor = "Lclient!kb;")
	private Class1_Sub1_Sub2_Sub4 aClass1_Sub1_Sub2_Sub4_2;

	@OriginalMember(owner = "client!client", name = "ce", descriptor = "Lclient!kb;")
	private Class1_Sub1_Sub2_Sub4 aClass1_Sub1_Sub2_Sub4_3;

	@OriginalMember(owner = "client!client", name = "de", descriptor = "Lclient!kb;")
	private Class1_Sub1_Sub2_Sub4 aClass1_Sub1_Sub2_Sub4_4;

	@OriginalMember(owner = "client!client", name = "ee", descriptor = "I")
	private int anInt275;

	@OriginalMember(owner = "client!client", name = "fe", descriptor = "I")
	private int anInt276;

	@OriginalMember(owner = "client!client", name = "ge", descriptor = "I")
	private int anInt277;

	@OriginalMember(owner = "client!client", name = "he", descriptor = "I")
	private int anInt278;

	@OriginalMember(owner = "client!client", name = "ie", descriptor = "J")
	private long aLong15;

	@OriginalMember(owner = "client!client", name = "je", descriptor = "I")
	private int anInt279;

	@OriginalMember(owner = "client!client", name = "ke", descriptor = "I")
	private int anInt280;

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

	@OriginalMember(owner = "client!client", name = "te", descriptor = "I")
	private int anInt285;

	@OriginalMember(owner = "client!client", name = "ye", descriptor = "I")
	private int anInt287;

	@OriginalMember(owner = "client!client", name = "Be", descriptor = "I")
	private int anInt290;

	@OriginalMember(owner = "client!client", name = "Ke", descriptor = "I")
	private int anInt293;

	@OriginalMember(owner = "client!client", name = "Ne", descriptor = "I")
	private int anInt294;

	@OriginalMember(owner = "client!client", name = "Pe", descriptor = "[Lclient!jb;")
	private Class1_Sub1_Sub2_Sub3[] aClass1_Sub1_Sub2_Sub3Array2;

	@OriginalMember(owner = "client!client", name = "Qe", descriptor = "I")
	private int anInt295;

	@OriginalMember(owner = "client!client", name = "Re", descriptor = "I")
	private int anInt296;

	@OriginalMember(owner = "client!client", name = "Te", descriptor = "I")
	private int anInt297;

	@OriginalMember(owner = "client!client", name = "Ue", descriptor = "I")
	private int anInt298;

	@OriginalMember(owner = "client!client", name = "Ve", descriptor = "I")
	private int anInt299;

	@OriginalMember(owner = "client!client", name = "We", descriptor = "Ljava/lang/String;")
	private String aString9;

	@OriginalMember(owner = "client!client", name = "bf", descriptor = "I")
	private int anInt303;

	@OriginalMember(owner = "client!client", name = "cf", descriptor = "I")
	private int anInt304;

	@OriginalMember(owner = "client!client", name = "df", descriptor = "Lclient!jb;")
	private Class1_Sub1_Sub2_Sub3 aClass1_Sub1_Sub2_Sub3_4;

	@OriginalMember(owner = "client!client", name = "ef", descriptor = "Lclient!jb;")
	private Class1_Sub1_Sub2_Sub3 aClass1_Sub1_Sub2_Sub3_5;

	@OriginalMember(owner = "client!client", name = "ff", descriptor = "Lclient!jb;")
	private Class1_Sub1_Sub2_Sub3 aClass1_Sub1_Sub2_Sub3_6;

	@OriginalMember(owner = "client!client", name = "gf", descriptor = "I")
	private int anInt305;

	@OriginalMember(owner = "client!client", name = "hf", descriptor = "J")
	private long aLong16;

	@OriginalMember(owner = "client!client", name = "kf", descriptor = "J")
	private long aLong17;

	@OriginalMember(owner = "client!client", name = "lf", descriptor = "I")
	private int anInt307;

	@OriginalMember(owner = "client!client", name = "qf", descriptor = "I")
	private int anInt308;

	@OriginalMember(owner = "client!client", name = "sf", descriptor = "I")
	private int anInt309;

	@OriginalMember(owner = "client!client", name = "tf", descriptor = "I")
	private int anInt310;

	@OriginalMember(owner = "client!client", name = "vf", descriptor = "I")
	private int anInt312;

	@OriginalMember(owner = "client!client", name = "wf", descriptor = "I")
	private int anInt313;

	@OriginalMember(owner = "client!client", name = "Ef", descriptor = "Lclient!ib;")
	private Class1_Sub1_Sub2_Sub2 aClass1_Sub1_Sub2_Sub2_9;

	@OriginalMember(owner = "client!client", name = "Ff", descriptor = "Lclient!ib;")
	private Class1_Sub1_Sub2_Sub2 aClass1_Sub1_Sub2_Sub2_10;

	@OriginalMember(owner = "client!client", name = "Gf", descriptor = "I")
	private int anInt316;

	@OriginalMember(owner = "client!client", name = "If", descriptor = "I")
	private int anInt318;

	@OriginalMember(owner = "client!client", name = "Mf", descriptor = "I")
	private int anInt319;

	@OriginalMember(owner = "client!client", name = "Qf", descriptor = "[[[B")
	private byte[][][] aByteArrayArrayArray7;

	@OriginalMember(owner = "client!client", name = "Uf", descriptor = "I")
	private int anInt322;

	@OriginalMember(owner = "client!client", name = "Vf", descriptor = "I")
	private int anInt323;

	@OriginalMember(owner = "client!client", name = "Xf", descriptor = "I")
	private int anInt325;

	@OriginalMember(owner = "client!client", name = "bg", descriptor = "Lclient!ib;")
	private Class1_Sub1_Sub2_Sub2 aClass1_Sub1_Sub2_Sub2_11;

	@OriginalMember(owner = "client!client", name = "dg", descriptor = "I")
	private int anInt326;

	@OriginalMember(owner = "client!client", name = "eg", descriptor = "J")
	private long aLong18;

	@OriginalMember(owner = "client!client", name = "fg", descriptor = "I")
	private int anInt327;

	@OriginalMember(owner = "client!client", name = "jg", descriptor = "Lclient!fc;")
	private Class11 aClass11_1;

	@OriginalMember(owner = "client!client", name = "lg", descriptor = "I")
	private int anInt328;

	@OriginalMember(owner = "client!client", name = "og", descriptor = "I")
	private int anInt329;

	@OriginalMember(owner = "client!client", name = "pg", descriptor = "I")
	private int anInt330;

	@OriginalMember(owner = "client!client", name = "qg", descriptor = "I")
	private int anInt331;

	@OriginalMember(owner = "client!client", name = "rg", descriptor = "I")
	private int anInt332;

	@OriginalMember(owner = "client!client", name = "ug", descriptor = "I")
	private int anInt335;

	@OriginalMember(owner = "client!client", name = "xg", descriptor = "I")
	private int anInt336;

	@OriginalMember(owner = "client!client", name = "Bg", descriptor = "I")
	private int anInt338;

	@OriginalMember(owner = "client!client", name = "Dg", descriptor = "Ljava/net/Socket;")
	private Socket aSocket1;

	@OriginalMember(owner = "client!client", name = "Eg", descriptor = "I")
	private int anInt339;

	@OriginalMember(owner = "client!client", name = "Fg", descriptor = "I")
	private int anInt340;

	@OriginalMember(owner = "client!client", name = "Jg", descriptor = "I")
	private int anInt342;

	@OriginalMember(owner = "client!client", name = "Kg", descriptor = "I")
	private int anInt343;

	@OriginalMember(owner = "client!client", name = "Vg", descriptor = "I")
	private int anInt345;

	@OriginalMember(owner = "client!client", name = "Wg", descriptor = "I")
	private int anInt346;

	@OriginalMember(owner = "client!client", name = "Xg", descriptor = "I")
	private int anInt347;

	@OriginalMember(owner = "client!client", name = "Yg", descriptor = "Lclient!ib;")
	private Class1_Sub1_Sub2_Sub2 aClass1_Sub1_Sub2_Sub2_12;

	@OriginalMember(owner = "client!client", name = "Zg", descriptor = "Lclient!ib;")
	private Class1_Sub1_Sub2_Sub2 aClass1_Sub1_Sub2_Sub2_13;

	@OriginalMember(owner = "client!client", name = "ah", descriptor = "Lclient!jb;")
	private Class1_Sub1_Sub2_Sub3 aClass1_Sub1_Sub2_Sub3_7;

	@OriginalMember(owner = "client!client", name = "bh", descriptor = "Lclient!jb;")
	private Class1_Sub1_Sub2_Sub3 aClass1_Sub1_Sub2_Sub3_8;

	@OriginalMember(owner = "client!client", name = "fh", descriptor = "I")
	private int anInt349;

	@OriginalMember(owner = "client!client", name = "gh", descriptor = "I")
	private int anInt350;

	@OriginalMember(owner = "client!client", name = "hh", descriptor = "I")
	private int anInt351;

	@OriginalMember(owner = "client!client", name = "mh", descriptor = "[I")
	private int[] anIntArray82;

	@OriginalMember(owner = "client!client", name = "nh", descriptor = "[I")
	private int[] anIntArray83;

	@OriginalMember(owner = "client!client", name = "oh", descriptor = "[I")
	private int[] anIntArray84;

	@OriginalMember(owner = "client!client", name = "uh", descriptor = "I")
	private int anInt353;

	@OriginalMember(owner = "client!client", name = "wh", descriptor = "I")
	private int anInt354;

	@OriginalMember(owner = "client!client", name = "xh", descriptor = "I")
	private int anInt355;

	@OriginalMember(owner = "client!client", name = "yh", descriptor = "I")
	private int anInt356;

	@OriginalMember(owner = "client!client", name = "zh", descriptor = "I")
	private int anInt357;

	@OriginalMember(owner = "client!client", name = "Bh", descriptor = "I")
	private int anInt359;

	@OriginalMember(owner = "client!client", name = "Ch", descriptor = "I")
	private int anInt360;

	@OriginalMember(owner = "client!client", name = "Dh", descriptor = "I")
	private int anInt361;

	@OriginalMember(owner = "client!client", name = "Eh", descriptor = "I")
	private int anInt362;

	@OriginalMember(owner = "client!client", name = "Gh", descriptor = "[I")
	private int[] anIntArray87;

	@OriginalMember(owner = "client!client", name = "Hh", descriptor = "[I")
	private int[] anIntArray88;

	@OriginalMember(owner = "client!client", name = "Ih", descriptor = "I")
	private int anInt363;

	@OriginalMember(owner = "client!client", name = "Jh", descriptor = "I")
	private int anInt364;

	@OriginalMember(owner = "client!client", name = "Kh", descriptor = "I")
	private int anInt365;

	@OriginalMember(owner = "client!client", name = "Lh", descriptor = "I")
	private int anInt366;

	@OriginalMember(owner = "client!client", name = "Mh", descriptor = "I")
	private int anInt367;

	@OriginalMember(owner = "client!client", name = "Nh", descriptor = "Lclient!jb;")
	private Class1_Sub1_Sub2_Sub3 aClass1_Sub1_Sub2_Sub3_9;

	@OriginalMember(owner = "client!client", name = "Oh", descriptor = "Lclient!jb;")
	private Class1_Sub1_Sub2_Sub3 aClass1_Sub1_Sub2_Sub3_10;

	@OriginalMember(owner = "client!client", name = "Ph", descriptor = "Lclient!jb;")
	private Class1_Sub1_Sub2_Sub3 aClass1_Sub1_Sub2_Sub3_11;

	@OriginalMember(owner = "client!client", name = "Qh", descriptor = "Lclient!jb;")
	private Class1_Sub1_Sub2_Sub3 aClass1_Sub1_Sub2_Sub3_12;

	@OriginalMember(owner = "client!client", name = "Rh", descriptor = "Lclient!jb;")
	private Class1_Sub1_Sub2_Sub3 aClass1_Sub1_Sub2_Sub3_13;

	@OriginalMember(owner = "client!client", name = "Th", descriptor = "I")
	private int anInt368;

	@OriginalMember(owner = "client!client", name = "Wh", descriptor = "I")
	private int anInt370;

	@OriginalMember(owner = "client!client", name = "Xh", descriptor = "I")
	private int anInt371;

	@OriginalMember(owner = "client!client", name = "Yh", descriptor = "I")
	private int anInt372;

	@OriginalMember(owner = "client!client", name = "Zh", descriptor = "I")
	private int anInt373;

	@OriginalMember(owner = "client!client", name = "ai", descriptor = "I")
	private int anInt374;

	@OriginalMember(owner = "client!client", name = "di", descriptor = "Lclient!jb;")
	private Class1_Sub1_Sub2_Sub3 aClass1_Sub1_Sub2_Sub3_14;

	@OriginalMember(owner = "client!client", name = "ei", descriptor = "Lclient!jb;")
	private Class1_Sub1_Sub2_Sub3 aClass1_Sub1_Sub2_Sub3_15;

	@OriginalMember(owner = "client!client", name = "fi", descriptor = "I")
	private int anInt375;

	@OriginalMember(owner = "client!client", name = "gi", descriptor = "I")
	private int anInt376;

	@OriginalMember(owner = "client!client", name = "hi", descriptor = "I")
	private int anInt377;

	@OriginalMember(owner = "client!client", name = "ii", descriptor = "I")
	private int anInt378;

	@OriginalMember(owner = "client!client", name = "ji", descriptor = "I")
	private int anInt379;

	@OriginalMember(owner = "client!client", name = "mi", descriptor = "Lclient!e;")
	private Class8 aClass8_1;

	@OriginalMember(owner = "client!client", name = "pi", descriptor = "I")
	private int anInt382;

	@OriginalMember(owner = "client!client", name = "ri", descriptor = "I")
	private int anInt383;

	@OriginalMember(owner = "client!client", name = "wi", descriptor = "Ljava/lang/String;")
	private String aString15;

	@OriginalMember(owner = "client!client", name = "xi", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray5;

	@OriginalMember(owner = "client!client", name = "Di", descriptor = "Lclient!qb;")
	private Class35 aClass35_16;

	@OriginalMember(owner = "client!client", name = "Ei", descriptor = "Lclient!qb;")
	private Class35 aClass35_17;

	@OriginalMember(owner = "client!client", name = "Fi", descriptor = "Lclient!qb;")
	private Class35 aClass35_18;

	@OriginalMember(owner = "client!client", name = "Ji", descriptor = "I")
	private int anInt388;

	@OriginalMember(owner = "client!client", name = "Ki", descriptor = "I")
	private int anInt389;

	@OriginalMember(owner = "client!client", name = "Mi", descriptor = "I")
	private int anInt391;

	@OriginalMember(owner = "client!client", name = "Ni", descriptor = "I")
	private int anInt392;

	@OriginalMember(owner = "client!client", name = "Oi", descriptor = "I")
	private int anInt393;

	@OriginalMember(owner = "client!client", name = "Si", descriptor = "I")
	private int anInt395;

	@OriginalMember(owner = "client!client", name = "Wi", descriptor = "Lclient!qb;")
	private Class35 aClass35_19;

	@OriginalMember(owner = "client!client", name = "Xi", descriptor = "Lclient!qb;")
	private Class35 aClass35_20;

	@OriginalMember(owner = "client!client", name = "Yi", descriptor = "Lclient!qb;")
	private Class35 aClass35_21;

	@OriginalMember(owner = "client!client", name = "Zi", descriptor = "Lclient!qb;")
	private Class35 aClass35_22;

	@OriginalMember(owner = "client!client", name = "aj", descriptor = "Lclient!qb;")
	private Class35 aClass35_23;

	@OriginalMember(owner = "client!client", name = "bj", descriptor = "Lclient!qb;")
	private Class35 aClass35_24;

	@OriginalMember(owner = "client!client", name = "cj", descriptor = "Lclient!qb;")
	private Class35 aClass35_25;

	@OriginalMember(owner = "client!client", name = "dj", descriptor = "Lclient!qb;")
	private Class35 aClass35_26;

	@OriginalMember(owner = "client!client", name = "ej", descriptor = "Lclient!qb;")
	private Class35 aClass35_27;

	@OriginalMember(owner = "client!client", name = "kj", descriptor = "Lclient!jb;")
	private Class1_Sub1_Sub2_Sub3 aClass1_Sub1_Sub2_Sub3_16;

	@OriginalMember(owner = "client!client", name = "lj", descriptor = "Lclient!jb;")
	private Class1_Sub1_Sub2_Sub3 aClass1_Sub1_Sub2_Sub3_17;

	@OriginalMember(owner = "client!client", name = "mj", descriptor = "Lclient!jb;")
	private Class1_Sub1_Sub2_Sub3 aClass1_Sub1_Sub2_Sub3_18;

	@OriginalMember(owner = "client!client", name = "nj", descriptor = "Lclient!jb;")
	private Class1_Sub1_Sub2_Sub3 aClass1_Sub1_Sub2_Sub3_19;

	@OriginalMember(owner = "client!client", name = "oj", descriptor = "Lclient!jb;")
	private Class1_Sub1_Sub2_Sub3 aClass1_Sub1_Sub2_Sub3_20;

	@OriginalMember(owner = "client!client", name = "pj", descriptor = "I")
	private int anInt398;

	@OriginalMember(owner = "client!client", name = "qj", descriptor = "I")
	private int anInt399;

	@OriginalMember(owner = "client!client", name = "K", descriptor = "[I")
	private int[] anIntArray32 = new int[500];

	@OriginalMember(owner = "client!client", name = "L", descriptor = "[I")
	private int[] anIntArray33 = new int[500];

	@OriginalMember(owner = "client!client", name = "M", descriptor = "[I")
	private int[] anIntArray34 = new int[500];

	@OriginalMember(owner = "client!client", name = "N", descriptor = "[I")
	private int[] anIntArray35 = new int[500];

	@OriginalMember(owner = "client!client", name = "Q", descriptor = "[J")
	private long[] aLongArray3 = new long[200];

	@OriginalMember(owner = "client!client", name = "W", descriptor = "I")
	private int anInt197 = -1;

	@OriginalMember(owner = "client!client", name = "Y", descriptor = "Ljava/util/zip/CRC32;")
	private CRC32 aCRC32_1 = new CRC32();

	@OriginalMember(owner = "client!client", name = "Z", descriptor = "I")
	private int anInt198 = 1;

	@OriginalMember(owner = "client!client", name = "pb", descriptor = "[[I")
	private int[][] anIntArrayArray4 = new int[104][104];

	@OriginalMember(owner = "client!client", name = "qb", descriptor = "[Lclient!ib;")
	private Class1_Sub1_Sub2_Sub2[] aClass1_Sub1_Sub2_Sub2Array3 = new Class1_Sub1_Sub2_Sub2[8];

	@OriginalMember(owner = "client!client", name = "rb", descriptor = "I")
	private int anInt208 = -1;

	@OriginalMember(owner = "client!client", name = "sb", descriptor = "Z")
	private boolean aBoolean52 = false;

	@OriginalMember(owner = "client!client", name = "tb", descriptor = "Z")
	private boolean aBoolean53 = false;

	@OriginalMember(owner = "client!client", name = "ub", descriptor = "I")
	private int anInt209 = 3353893;

	@OriginalMember(owner = "client!client", name = "vb", descriptor = "B")
	private byte aByte3 = -6;

	@OriginalMember(owner = "client!client", name = "wb", descriptor = "I")
	private int anInt210 = 465;

	@OriginalMember(owner = "client!client", name = "xb", descriptor = "[I")
	private int[] anIntArray43 = new int[50];

	@OriginalMember(owner = "client!client", name = "yb", descriptor = "Z")
	private boolean aBoolean54 = false;

	@OriginalMember(owner = "client!client", name = "Eb", descriptor = "[Lclient!jb;")
	private Class1_Sub1_Sub2_Sub3[] aClass1_Sub1_Sub2_Sub3Array1 = new Class1_Sub1_Sub2_Sub3[13];

	@OriginalMember(owner = "client!client", name = "Fb", descriptor = "Z")
	private boolean aBoolean55 = false;

	@OriginalMember(owner = "client!client", name = "Ob", descriptor = "Z")
	private boolean aBoolean57 = false;

	@OriginalMember(owner = "client!client", name = "Qb", descriptor = "Z")
	private boolean aBoolean58 = true;

	@OriginalMember(owner = "client!client", name = "Rb", descriptor = "[Lclient!vb;")
	public Class45[] aClass45Array1 = new Class45[5];

	@OriginalMember(owner = "client!client", name = "Tb", descriptor = "Ljava/lang/String;")
	private String aString4 = "";

	@OriginalMember(owner = "client!client", name = "Ub", descriptor = "I")
	private int anInt221 = -1;

	@OriginalMember(owner = "client!client", name = "Vb", descriptor = "[I")
	private int[] anIntArray44 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

	@OriginalMember(owner = "client!client", name = "ec", descriptor = "I")
	private int anInt228 = -1;

	@OriginalMember(owner = "client!client", name = "fc", descriptor = "Z")
	private boolean aBoolean59 = false;

	@OriginalMember(owner = "client!client", name = "ic", descriptor = "[I")
	private int[] anIntArray45 = new int[5];

	@OriginalMember(owner = "client!client", name = "lc", descriptor = "B")
	private byte aByte4 = 1;

	@OriginalMember(owner = "client!client", name = "mc", descriptor = "Z")
	private boolean aBoolean61 = false;

	@OriginalMember(owner = "client!client", name = "tc", descriptor = "I")
	private int anInt237 = 1;

	@OriginalMember(owner = "client!client", name = "uc", descriptor = "B")
	private byte aByte5 = 106;

	@OriginalMember(owner = "client!client", name = "xc", descriptor = "I")
	private int anInt240 = 2048;

	@OriginalMember(owner = "client!client", name = "yc", descriptor = "I")
	private int anInt241 = 2047;

	@OriginalMember(owner = "client!client", name = "zc", descriptor = "[Lclient!ab;")
	private Class1_Sub1_Sub1_Sub1_Sub1[] aClass1_Sub1_Sub1_Sub1_Sub1Array1 = new Class1_Sub1_Sub1_Sub1_Sub1[this.anInt240];

	@OriginalMember(owner = "client!client", name = "Bc", descriptor = "[I")
	private int[] anIntArray46 = new int[this.anInt240];

	@OriginalMember(owner = "client!client", name = "Dc", descriptor = "[I")
	private int[] anIntArray47 = new int[this.anInt240];

	@OriginalMember(owner = "client!client", name = "Ec", descriptor = "[Lclient!lb;")
	private Class1_Sub1_Sub3[] aClass1_Sub1_Sub3Array1 = new Class1_Sub1_Sub3[this.anInt240];

	@OriginalMember(owner = "client!client", name = "Fc", descriptor = "I")
	private int anInt244 = -1;

	@OriginalMember(owner = "client!client", name = "Hc", descriptor = "Ljava/lang/String;")
	private String aString6 = "";

	@OriginalMember(owner = "client!client", name = "Ic", descriptor = "[[I")
	private int[][] anIntArrayArray5 = new int[104][104];

	@OriginalMember(owner = "client!client", name = "Lc", descriptor = "I")
	private int anInt245 = -1;

	@OriginalMember(owner = "client!client", name = "Pc", descriptor = "I")
	private int anInt248 = 2;

	@OriginalMember(owner = "client!client", name = "Vc", descriptor = "Z")
	private boolean aBoolean62 = false;

	@OriginalMember(owner = "client!client", name = "Xc", descriptor = "I")
	private int anInt251 = 637;

	@OriginalMember(owner = "client!client", name = "gd", descriptor = "I")
	private int anInt259 = 2;

	@OriginalMember(owner = "client!client", name = "jd", descriptor = "I")
	private int anInt262 = 1;

	@OriginalMember(owner = "client!client", name = "kd", descriptor = "I")
	private int anInt263 = -1;

	@OriginalMember(owner = "client!client", name = "ld", descriptor = "[I")
	private int[] anIntArray48 = new int[200];

	@OriginalMember(owner = "client!client", name = "od", descriptor = "[I")
	private int[] anIntArray49 = new int[50];

	@OriginalMember(owner = "client!client", name = "pd", descriptor = "[Z")
	private boolean[] aBooleanArray3 = new boolean[5];

	@OriginalMember(owner = "client!client", name = "qd", descriptor = "[I")
	private int[] anIntArray50 = new int[50];

	@OriginalMember(owner = "client!client", name = "td", descriptor = "I")
	private int anInt266 = 77;

	@OriginalMember(owner = "client!client", name = "vd", descriptor = "Z")
	private boolean aBoolean65 = false;

	@OriginalMember(owner = "client!client", name = "Ld", descriptor = "I")
	private int anInt270 = 3;

	@OriginalMember(owner = "client!client", name = "Md", descriptor = "[Lclient!jc;")
	private Class19[] aClass19Array1 = new Class19[4];

	@OriginalMember(owner = "client!client", name = "Od", descriptor = "Z")
	private boolean aBoolean66 = false;

	@OriginalMember(owner = "client!client", name = "Sd", descriptor = "[I")
	private int[] anIntArray53 = new int[1000];

	@OriginalMember(owner = "client!client", name = "Ud", descriptor = "Z")
	private boolean aBoolean67 = false;

	@OriginalMember(owner = "client!client", name = "Vd", descriptor = "Lclient!ob;")
	private Class29 aClass29_1 = new Class29(-16188);

	@OriginalMember(owner = "client!client", name = "Wd", descriptor = "Ljava/lang/String;")
	private String aString7 = "";

	@OriginalMember(owner = "client!client", name = "Yd", descriptor = "I")
	private int anInt274 = -635;

	@OriginalMember(owner = "client!client", name = "Zd", descriptor = "[I")
	private int[] anIntArray54 = new int[7];

	@OriginalMember(owner = "client!client", name = "me", descriptor = "[I")
	private int[] anIntArray55 = new int[5];

	@OriginalMember(owner = "client!client", name = "ne", descriptor = "Lclient!ob;")
	private Class29 aClass29_2 = new Class29(-16188);

	@OriginalMember(owner = "client!client", name = "ue", descriptor = "[I")
	public int[] anIntArray56 = new int[2000];

	@OriginalMember(owner = "client!client", name = "ve", descriptor = "B")
	private byte aByte6 = 4;

	@OriginalMember(owner = "client!client", name = "we", descriptor = "Z")
	private boolean aBoolean69 = false;

	@OriginalMember(owner = "client!client", name = "ze", descriptor = "I")
	private int anInt288 = 3109;

	@OriginalMember(owner = "client!client", name = "Ae", descriptor = "I")
	private int anInt289 = 455;

	@OriginalMember(owner = "client!client", name = "Ee", descriptor = "[B")
	private byte[] aByteArray2 = new byte[16384];

	@OriginalMember(owner = "client!client", name = "Le", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray1 = new String[500];

	@OriginalMember(owner = "client!client", name = "Me", descriptor = "Lclient!lb;")
	private Class1_Sub1_Sub3 aClass1_Sub1_Sub3_2 = Class1_Sub1_Sub3.method468();

	@OriginalMember(owner = "client!client", name = "Oe", descriptor = "[I")
	private int[] anIntArray59 = new int[5];

	@OriginalMember(owner = "client!client", name = "Se", descriptor = "Z")
	private boolean aBoolean73 = false;

	@OriginalMember(owner = "client!client", name = "Xe", descriptor = "I")
	private int anInt300 = -798;

	@OriginalMember(owner = "client!client", name = "Ye", descriptor = "I")
	private int anInt301 = 5063219;

	@OriginalMember(owner = "client!client", name = "Ze", descriptor = "Z")
	private boolean aBoolean74 = false;

	@OriginalMember(owner = "client!client", name = "mf", descriptor = "Lclient!d;")
	private Class6 aClass6_1 = new Class6();

	@OriginalMember(owner = "client!client", name = "nf", descriptor = "[I")
	private int[] anIntArray60 = new int[151];

	@OriginalMember(owner = "client!client", name = "of", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray2 = new String[200];

	@OriginalMember(owner = "client!client", name = "pf", descriptor = "[I")
	private int[] anIntArray61 = new int[5];

	@OriginalMember(owner = "client!client", name = "rf", descriptor = "Z")
	private boolean aBoolean75 = true;

	@OriginalMember(owner = "client!client", name = "uf", descriptor = "I")
	private int anInt311 = 2;

	@OriginalMember(owner = "client!client", name = "xf", descriptor = "Ljava/lang/String;")
	private String aString10 = "";

	@OriginalMember(owner = "client!client", name = "yf", descriptor = "Ljava/lang/String;")
	private String aString11 = "";

	@OriginalMember(owner = "client!client", name = "zf", descriptor = "I")
	private int anInt314 = -1;

	@OriginalMember(owner = "client!client", name = "Bf", descriptor = "Ljava/lang/String;")
	private String aString12 = "";

	@OriginalMember(owner = "client!client", name = "Cf", descriptor = "Ljava/lang/String;")
	private String aString13 = "";

	@OriginalMember(owner = "client!client", name = "Df", descriptor = "Z")
	private boolean aBoolean76 = false;

	@OriginalMember(owner = "client!client", name = "Hf", descriptor = "I")
	private int anInt317 = -1;

	@OriginalMember(owner = "client!client", name = "Jf", descriptor = "Z")
	private boolean aBoolean77 = false;

	@OriginalMember(owner = "client!client", name = "Kf", descriptor = "Z")
	private boolean aBoolean78 = true;

	@OriginalMember(owner = "client!client", name = "Lf", descriptor = "[I")
	private int[] anIntArray62 = new int[2000];

	@OriginalMember(owner = "client!client", name = "Nf", descriptor = "[J")
	private long[] aLongArray4 = new long[100];

	@OriginalMember(owner = "client!client", name = "Pf", descriptor = "I")
	private int anInt321 = 2301979;

	@OriginalMember(owner = "client!client", name = "Rf", descriptor = "Z")
	private boolean aBoolean79 = false;

	@OriginalMember(owner = "client!client", name = "Sf", descriptor = "[I")
	private int[] anIntArray63 = new int[151];

	@OriginalMember(owner = "client!client", name = "Tf", descriptor = "[[I")
	private int[][] anIntArrayArray6 = new int[104][104];

	@OriginalMember(owner = "client!client", name = "Wf", descriptor = "I")
	private int anInt324 = -1;

	@OriginalMember(owner = "client!client", name = "Yf", descriptor = "[I")
	private int[] anIntArray64 = new int[5];

	@OriginalMember(owner = "client!client", name = "Zf", descriptor = "Z")
	private boolean aBoolean80 = false;

	@OriginalMember(owner = "client!client", name = "ag", descriptor = "[Lclient!ib;")
	private Class1_Sub1_Sub2_Sub2[] aClass1_Sub1_Sub2_Sub2Array4 = new Class1_Sub1_Sub2_Sub2[20];

	@OriginalMember(owner = "client!client", name = "cg", descriptor = "[I")
	private int[] anIntArray65 = new int[256];

	@OriginalMember(owner = "client!client", name = "gg", descriptor = "[I")
	private int[] anIntArray66 = new int[100];

	@OriginalMember(owner = "client!client", name = "hg", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray3 = new String[100];

	@OriginalMember(owner = "client!client", name = "ig", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray4 = new String[100];

	@OriginalMember(owner = "client!client", name = "mg", descriptor = "[Lclient!jb;")
	private Class1_Sub1_Sub2_Sub3[] aClass1_Sub1_Sub2_Sub3Array3 = new Class1_Sub1_Sub2_Sub3[100];

	@OriginalMember(owner = "client!client", name = "ng", descriptor = "[I")
	private int[] anIntArray68 = new int[Class30.anInt787];

	@OriginalMember(owner = "client!client", name = "sg", descriptor = "I")
	private int anInt333 = -1;

	@OriginalMember(owner = "client!client", name = "tg", descriptor = "I")
	private int anInt334 = 722;

	@OriginalMember(owner = "client!client", name = "vg", descriptor = "[I")
	private int[] anIntArray69 = new int[1000];

	@OriginalMember(owner = "client!client", name = "wg", descriptor = "[I")
	private int[] anIntArray70 = new int[1000];

	@OriginalMember(owner = "client!client", name = "yg", descriptor = "Z")
	private boolean aBoolean81 = false;

	@OriginalMember(owner = "client!client", name = "zg", descriptor = "I")
	private final int anInt337 = 100;

	@OriginalMember(owner = "client!client", name = "Ag", descriptor = "[I")
	private int[] anIntArray71 = new int[100];

	@OriginalMember(owner = "client!client", name = "Cg", descriptor = "[I")
	private int[] anIntArray72 = new int[33];

	@OriginalMember(owner = "client!client", name = "Gg", descriptor = "Z")
	private boolean aBoolean82 = false;

	@OriginalMember(owner = "client!client", name = "Hg", descriptor = "[[[Lclient!ob;")
	private Class29[][][] aClass29ArrayArrayArray1 = new Class29[4][104][104];

	@OriginalMember(owner = "client!client", name = "Ig", descriptor = "I")
	private int anInt341 = 650;

	@OriginalMember(owner = "client!client", name = "Lg", descriptor = "I")
	private int anInt344 = 50;

	@OriginalMember(owner = "client!client", name = "Mg", descriptor = "[I")
	private int[] anIntArray73 = new int[this.anInt344];

	@OriginalMember(owner = "client!client", name = "Ng", descriptor = "[I")
	private int[] anIntArray74 = new int[this.anInt344];

	@OriginalMember(owner = "client!client", name = "Og", descriptor = "[I")
	private int[] anIntArray75 = new int[this.anInt344];

	@OriginalMember(owner = "client!client", name = "Pg", descriptor = "[I")
	private int[] anIntArray76 = new int[this.anInt344];

	@OriginalMember(owner = "client!client", name = "Qg", descriptor = "[I")
	private int[] anIntArray77 = new int[this.anInt344];

	@OriginalMember(owner = "client!client", name = "Rg", descriptor = "[I")
	private int[] anIntArray78 = new int[this.anInt344];

	@OriginalMember(owner = "client!client", name = "Sg", descriptor = "[I")
	private int[] anIntArray79 = new int[this.anInt344];

	@OriginalMember(owner = "client!client", name = "Tg", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray5 = new String[this.anInt344];

	@OriginalMember(owner = "client!client", name = "Ug", descriptor = "[I")
	private int[] anIntArray80 = new int[33];

	@OriginalMember(owner = "client!client", name = "ch", descriptor = "[I")
	private int[] anIntArray81 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

	@OriginalMember(owner = "client!client", name = "dh", descriptor = "[Lclient!ib;")
	private Class1_Sub1_Sub2_Sub2[] aClass1_Sub1_Sub2_Sub2Array5 = new Class1_Sub1_Sub2_Sub2[1000];

	@OriginalMember(owner = "client!client", name = "ih", descriptor = "Z")
	private boolean aBoolean83 = false;

	@OriginalMember(owner = "client!client", name = "jh", descriptor = "Z")
	private boolean aBoolean84 = true;

	@OriginalMember(owner = "client!client", name = "kh", descriptor = "Z")
	private boolean aBoolean85 = false;

	@OriginalMember(owner = "client!client", name = "lh", descriptor = "I")
	private int anInt352 = -1;

	@OriginalMember(owner = "client!client", name = "ph", descriptor = "[I")
	private int[] anIntArray85 = new int[9];

	@OriginalMember(owner = "client!client", name = "qh", descriptor = "B")
	private byte aByte7 = 9;

	@OriginalMember(owner = "client!client", name = "rh", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray6 = new String[5];

	@OriginalMember(owner = "client!client", name = "sh", descriptor = "[Z")
	private boolean[] aBooleanArray4 = new boolean[5];

	@OriginalMember(owner = "client!client", name = "th", descriptor = "[I")
	private final int[] anIntArray86 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

	@OriginalMember(owner = "client!client", name = "vh", descriptor = "Ljava/lang/String;")
	private String aString14 = "";

	@OriginalMember(owner = "client!client", name = "Fh", descriptor = "Z")
	private boolean aBoolean86 = false;

	@OriginalMember(owner = "client!client", name = "Sh", descriptor = "[I")
	private int[] anIntArray89 = new int[Class30.anInt787];

	@OriginalMember(owner = "client!client", name = "Uh", descriptor = "Z")
	private boolean aBoolean87 = false;

	@OriginalMember(owner = "client!client", name = "Vh", descriptor = "I")
	private int anInt369 = 78;

	@OriginalMember(owner = "client!client", name = "bi", descriptor = "Z")
	private boolean aBoolean88 = false;

	@OriginalMember(owner = "client!client", name = "ci", descriptor = "[I")
	private int[] anIntArray90 = new int[Class30.anInt787];

	@OriginalMember(owner = "client!client", name = "li", descriptor = "Lclient!lb;")
	private Class1_Sub1_Sub3 aClass1_Sub1_Sub3_3 = Class1_Sub1_Sub3.method468();

	@OriginalMember(owner = "client!client", name = "qi", descriptor = "Z")
	public boolean aBoolean89 = false;

	@OriginalMember(owner = "client!client", name = "si", descriptor = "Lclient!ob;")
	private Class29 aClass29_3 = new Class29(-16188);

	@OriginalMember(owner = "client!client", name = "ti", descriptor = "[Lclient!ib;")
	private Class1_Sub1_Sub2_Sub2[] aClass1_Sub1_Sub2_Sub2Array6 = new Class1_Sub1_Sub2_Sub2[20];

	@OriginalMember(owner = "client!client", name = "ui", descriptor = "B")
	private byte aByte8 = 4;

	@OriginalMember(owner = "client!client", name = "yi", descriptor = "Z")
	private boolean aBoolean90 = true;

	@OriginalMember(owner = "client!client", name = "zi", descriptor = "Z")
	private boolean aBoolean91 = true;

	@OriginalMember(owner = "client!client", name = "Ai", descriptor = "Ljava/lang/String;")
	private String aString16 = "";

	@OriginalMember(owner = "client!client", name = "Ci", descriptor = "Lclient!lb;")
	private Class1_Sub1_Sub3 aClass1_Sub1_Sub3_4 = Class1_Sub1_Sub3.method468();

	@OriginalMember(owner = "client!client", name = "Gi", descriptor = "I")
	private int anInt386 = -1;

	@OriginalMember(owner = "client!client", name = "Hi", descriptor = "I")
	private int anInt387 = -1;

	@OriginalMember(owner = "client!client", name = "Li", descriptor = "I")
	private int anInt390 = 128;

	@OriginalMember(owner = "client!client", name = "Pi", descriptor = "Z")
	private boolean aBoolean92 = true;

	@OriginalMember(owner = "client!client", name = "Qi", descriptor = "I")
	private int anInt394 = 7759444;

	@OriginalMember(owner = "client!client", name = "Ri", descriptor = "[Lclient!z;")
	private Class1_Sub1_Sub1_Sub1_Sub2[] aClass1_Sub1_Sub1_Sub1_Sub2Array1 = new Class1_Sub1_Sub1_Sub1_Sub2[16384];

	@OriginalMember(owner = "client!client", name = "Ti", descriptor = "[I")
	private int[] anIntArray91 = new int[16384];

	@OriginalMember(owner = "client!client", name = "fj", descriptor = "Z")
	private boolean aBoolean93 = false;

	@OriginalMember(owner = "client!client", name = "gj", descriptor = "[Lclient!jb;")
	private Class1_Sub1_Sub2_Sub3[] aClass1_Sub1_Sub2_Sub3Array4 = new Class1_Sub1_Sub2_Sub3[2];

	@OriginalMember(owner = "client!client", name = "ij", descriptor = "Z")
	private boolean aBoolean94 = false;

	@OriginalMember(owner = "client!client", name = "jj", descriptor = "[Lclient!ib;")
	private Class1_Sub1_Sub2_Sub2[] aClass1_Sub1_Sub2_Sub2Array7 = new Class1_Sub1_Sub2_Sub2[100];

	@OriginalMember(owner = "client!client", name = "rj", descriptor = "I")
	private int anInt400 = 4;

	@OriginalMember(owner = "client!client", name = "sj", descriptor = "[I")
	private int[] anIntArray92 = new int[4000];

	@OriginalMember(owner = "client!client", name = "tj", descriptor = "[I")
	private int[] anIntArray93 = new int[4000];

	static {
		@Pc(273) int local273 = 2;
		@Pc(275) int local275;
		for (local275 = 0; local275 < 32; local275++) {
			anIntArray57[local275] = local273 - 1;
			local273 += local273;
		}
		anInt291 = 10;
		aBoolean71 = true;
		anIntArray58 = new int[99];
		local273 = 0;
		for (local275 = 0; local275 < 99; local275++) {
			@Pc(306) int local306 = local275 + 1;
			@Pc(319) int local319 = (int) ((double) local306 + Math.pow(2.0D, (double) local306 / 7.0D) * 300.0D);
			local273 += local319;
			anIntArray58[local275] = local273 / 4;
		}
		anIntArray67 = new int[] { 9104, 10275, 7595, 3610, 7975, 8526, 918, 38802, 24466, 10145, 58654, 5027, 1457, 16565, 34991, 25486 };
		anInt380 = -8322;
		aBigInteger2 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");
		aString17 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";
		aByte9 = 3;
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(II)Ljava/lang/String;")
	private static String method119(@OriginalArg(0) int arg0) {
		try {
			if (arg0 < 100000) {
				return String.valueOf(arg0);
			} else if (arg0 < 10000000) {
				return arg0 / 1000 + "K";
			} else {
				return arg0 / 1000000 + "M";
			}
		} catch (@Pc(41) RuntimeException local41) {
			signlink.reporterror("8647, " + arg0 + ", " + 3 + ", " + local41.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(Z)V")
	private static void method121() {
		try {
			Class37.aBoolean228 = true;
			Class1_Sub1_Sub2_Sub1.aBoolean158 = true;
			aBoolean72 = true;
			Class4.aBoolean41 = true;
		} catch (@Pc(12) RuntimeException local12) {
			signlink.reporterror("72693, " + true + ", " + local12.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(III)Ljava/lang/String;")
	private static String method132(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		try {
			@Pc(11) int local11 = arg1 - arg0;
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
			signlink.reporterror("19694, " + arg0 + ", " + 0 + ", " + arg1 + ", " + local52.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "main", descriptor = "([Ljava/lang/String;)V")
	public static void main(@OriginalArg(0) String[] arg0) {
		try {
			System.out.println("RS2 user client - release #" + 298);
			if (arg0.length == 5) {
				anInt291 = Integer.parseInt(arg0[0]);
				anInt292 = Integer.parseInt(arg0[1]);
				if (arg0[2].equals("lowmem")) {
					method121();
				} else if (arg0[2].equals("highmem")) {
					method217();
				} else {
					System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
					return;
				}
				if (arg0[3].equals("free")) {
					aBoolean71 = false;
				} else if (arg0[3].equals("members")) {
					aBoolean71 = true;
				} else {
					System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
					return;
				}
				signlink.anInt912 = Integer.parseInt(arg0[4]);
				signlink.startpriv(InetAddress.getLocalHost());
				@Pc(87) client local87 = new client();
				local87.method84((byte) 2);
			} else {
				System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
			}
		} catch (@Pc(94) Exception local94) {
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(IZ)Ljava/lang/String;")
	private static String method192(@OriginalArg(0) int arg0) {
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
		} catch (@Pc(98) RuntimeException local98) {
			signlink.reporterror("3208, " + arg0 + ", " + false + ", " + local98.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "q", descriptor = "(Z)V")
	private static void method217() {
		try {
			Class37.aBoolean228 = false;
			Class1_Sub1_Sub2_Sub1.aBoolean158 = false;
			aBoolean72 = false;
			Class4.aBoolean41 = false;
		} catch (@Pc(17) RuntimeException local17) {
			signlink.reporterror("90250, " + true + ", " + local17.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(I)V")
	private void method97() {
		try {
			for (@Pc(8) int local8 = -1; local8 < this.anInt242; local8++) {
				@Pc(16) int local16;
				if (local8 == -1) {
					local16 = this.anInt241;
				} else {
					local16 = this.anIntArray46[local8];
				}
				@Pc(28) Class1_Sub1_Sub1_Sub1_Sub1 local28 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local16];
				if (local28 != null) {
					this.method198(local28, 1);
				}
			}
		} catch (@Pc(42) RuntimeException local42) {
			signlink.reporterror("74971, " + 0 + ", " + local42.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIIIII)V")
	private void method98(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		try {
			@Pc(5) int local5 = 2048 - arg5 & 0x7FF;
			@Pc(11) int local11 = 2048 - arg1 & 0x7FF;
			@Pc(13) int local13 = 0;
			@Pc(15) int local15 = 0;
			@Pc(17) int local17 = arg2;
			@Pc(26) int local26;
			@Pc(30) int local30;
			@Pc(40) int local40;
			if (local5 != 0) {
				local26 = Class1_Sub1_Sub1_Sub5.anIntArray151[local5];
				local30 = Class1_Sub1_Sub1_Sub5.anIntArray152[local5];
				local40 = local30 * 0 - arg2 * local26 >> 16;
				local17 = local26 * 0 + arg2 * local30 >> 16;
				local15 = local40;
			}
			if (local11 != 0) {
				local26 = Class1_Sub1_Sub1_Sub5.anIntArray151[local11];
				local30 = Class1_Sub1_Sub1_Sub5.anIntArray152[local11];
				local40 = local17 * local26 + local30 * 0 >> 16;
				local17 = local17 * local30 - local26 * 0 >> 16;
				local13 = local40;
			}
			this.anInt375 = arg0 - local13;
			this.anInt376 = arg4 - local15;
			this.anInt377 = arg3 - local17;
			this.anInt378 = arg5;
			this.anInt379 = arg1;
		} catch (@Pc(107) RuntimeException local107) {
			signlink.reporterror("84988, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + 0 + ", " + local107.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "f", descriptor = "(I)Z")
	private boolean method99() {
		try {
			if (this.aClass8_1 == null) {
				return false;
			}
			@Pc(2875) String local2875;
			@Pc(218) int local218;
			try {
				@Pc(15) int local15 = this.aClass8_1.method249();
				if (local15 == 0) {
					return false;
				}
				if (this.anInt223 == -1) {
					this.aClass8_1.method250(this.aClass1_Sub1_Sub3_4.aByteArray9, 0, 1);
					this.anInt223 = this.aClass1_Sub1_Sub3_4.aByteArray9[0] & 0xFF;
					if (this.aClass46_1 != null) {
						this.anInt223 = this.anInt223 - this.aClass46_1.method662() & 0xFF;
					}
					this.anInt222 = Class17.anIntArray210[this.anInt223];
					local15--;
				}
				if (this.anInt222 == -1) {
					if (local15 <= 0) {
						return false;
					}
					this.aClass8_1.method250(this.aClass1_Sub1_Sub3_4.aByteArray9, 0, 1);
					this.anInt222 = this.aClass1_Sub1_Sub3_4.aByteArray9[0] & 0xFF;
					local15--;
				}
				if (this.anInt222 == -2) {
					if (local15 <= 1) {
						return false;
					}
					this.aClass8_1.method250(this.aClass1_Sub1_Sub3_4.aByteArray9, 0, 2);
					this.aClass1_Sub1_Sub3_4.anInt720 = 0;
					this.anInt222 = this.aClass1_Sub1_Sub3_4.method482();
					local15 -= 2;
				}
				if (local15 < this.anInt222) {
					return false;
				}
				this.aClass1_Sub1_Sub3_4.anInt720 = 0;
				this.aClass8_1.method250(this.aClass1_Sub1_Sub3_4.aByteArray9, 0, this.anInt222);
				this.anInt224 = 0;
				this.anInt347 = this.anInt346;
				this.anInt346 = this.anInt345;
				this.anInt345 = this.anInt223;
				@Pc(159) int local159;
				if (this.anInt223 == 236) {
					local159 = this.aClass1_Sub1_Sub3_4.method482();
					this.method205(local159);
					if (this.anInt245 != -1) {
						this.anInt245 = -1;
						this.aBoolean73 = true;
						this.aBoolean80 = true;
					}
					if (this.anInt197 != -1) {
						this.anInt197 = -1;
						this.aBoolean88 = true;
					}
					if (this.aBoolean79) {
						this.aBoolean79 = false;
						this.aBoolean88 = true;
					}
					this.anInt324 = local159;
					this.aBoolean94 = false;
					this.anInt223 = -1;
					return true;
				}
				@Pc(222) int local222;
				@Pc(226) int local226;
				if (this.anInt223 == 92) {
					local159 = this.aClass1_Sub1_Sub3_4.method480();
					local218 = this.aClass1_Sub1_Sub3_4.method480();
					local222 = this.aClass1_Sub1_Sub3_4.method480();
					local226 = this.aClass1_Sub1_Sub3_4.method480();
					this.aBooleanArray3[local159] = true;
					this.anIntArray61[local159] = local218;
					this.anIntArray64[local159] = local222;
					this.anIntArray55[local159] = local226;
					this.anIntArray45[local159] = 0;
					this.anInt223 = -1;
					return true;
				}
				if (this.anInt223 == 213) {
					local159 = this.aClass1_Sub1_Sub3_4.method482();
					@Pc(268) byte local268 = this.aClass1_Sub1_Sub3_4.method481();
					this.anIntArray62[local159] = local268;
					if (this.anIntArray56[local159] != local268) {
						this.anIntArray56[local159] = local268;
						this.method142(local159);
						this.aBoolean73 = true;
						if (this.anInt314 != -1) {
							this.aBoolean88 = true;
						}
					}
					this.anInt223 = -1;
					return true;
				}
				if (this.anInt223 == 131) {
					this.anInt211 = this.aClass1_Sub1_Sub3_4.method480();
					this.anInt223 = -1;
					return true;
				}
				if (this.anInt223 == 81) {
					local159 = this.aClass1_Sub1_Sub3_4.method482();
					local218 = this.aClass1_Sub1_Sub3_4.method482();
					local222 = this.aClass1_Sub1_Sub3_4.method482();
					local226 = this.aClass1_Sub1_Sub3_4.method482();
					Class6.aClass6Array1[local159].anInt430 = local218;
					Class6.aClass6Array1[local159].anInt431 = local222;
					Class6.aClass6Array1[local159].anInt429 = local226;
					this.anInt223 = -1;
					return true;
				}
				@Pc(500) int local500;
				@Pc(559) int local559;
				@Pc(638) int local638;
				@Pc(617) int local617;
				if (this.anInt223 == 170) {
					local159 = this.aClass1_Sub1_Sub3_4.method482();
					local218 = this.aClass1_Sub1_Sub3_4.method482();
					if (this.anInt268 == local159 && this.anInt269 == local218 && this.anInt273 == 2) {
						this.anInt223 = -1;
						return true;
					}
					this.anInt268 = local159;
					this.anInt269 = local218;
					this.anInt354 = (this.anInt268 - 6) * 8;
					this.anInt355 = (this.anInt269 - 6) * 8;
					this.aBoolean74 = false;
					if ((this.anInt268 / 8 == 48 || this.anInt268 / 8 == 49) && this.anInt269 / 8 == 48) {
						this.aBoolean74 = true;
					}
					if (this.anInt268 / 8 == 48 && this.anInt269 / 8 == 148) {
						this.aBoolean74 = true;
					}
					this.anInt273 = 1;
					this.aLong16 = System.currentTimeMillis();
					this.aClass35_5.method524(this.anInt198);
					this.aClass1_Sub1_Sub2_Sub4_2.method447("Loading - please wait.", 151, 0, 257);
					this.aClass1_Sub1_Sub2_Sub4_2.method447("Loading - please wait.", 150, 16777215, 256);
					this.aClass35_5.method525(4, super.aGraphics2, 4);
					local222 = 0;
					for (local226 = (this.anInt268 - 6) / 8; local226 <= (this.anInt268 + 6) / 8; local226++) {
						for (local500 = (this.anInt269 - 6) / 8; local500 <= (this.anInt269 + 6) / 8; local500++) {
							local222++;
						}
					}
					this.aByteArrayArray2 = new byte[local222][];
					this.aByteArrayArray1 = new byte[local222][];
					this.anIntArray36 = new int[local222];
					this.anIntArray37 = new int[local222];
					this.anIntArray38 = new int[local222];
					local222 = 0;
					for (local500 = (this.anInt268 - 6) / 8; local500 <= (this.anInt268 + 6) / 8; local500++) {
						for (local559 = (this.anInt269 - 6) / 8; local559 <= (this.anInt269 + 6) / 8; local559++) {
							this.anIntArray36[local222] = (local500 << 8) + local559;
							if (this.aBoolean74 && (local559 == 49 || local559 == 149 || local559 == 147 || local500 == 50 || local500 == 49 && local559 == 47)) {
								this.anIntArray37[local222] = -1;
								this.anIntArray38[local222] = -1;
								local222++;
							} else {
								local617 = this.anIntArray37[local222] = this.aClass44_Sub1_1.method640(0, local559, local500);
								if (local617 != -1) {
									this.aClass44_Sub1_1.method645(3, local617);
								}
								local638 = this.anIntArray38[local222] = this.aClass44_Sub1_1.method640(1, local559, local500);
								if (local638 != -1) {
									this.aClass44_Sub1_1.method645(3, local638);
								}
								local222++;
							}
						}
					}
					local559 = this.anInt354 - this.anInt356;
					local617 = this.anInt355 - this.anInt357;
					this.anInt356 = this.anInt354;
					this.anInt357 = this.anInt355;
					for (local638 = 0; local638 < 16384; local638++) {
						@Pc(694) Class1_Sub1_Sub1_Sub1_Sub2 local694 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local638];
						if (local694 != null) {
							for (@Pc(698) int local698 = 0; local698 < 10; local698++) {
								local694.anIntArray272[local698] -= local559;
								local694.anIntArray273[local698] -= local617;
							}
							local694.anInt962 -= local559 * 128;
							local694.anInt963 -= local617 * 128;
						}
					}
					for (@Pc(742) int local742 = 0; local742 < this.anInt240; local742++) {
						@Pc(749) Class1_Sub1_Sub1_Sub1_Sub1 local749 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local742];
						if (local749 != null) {
							for (@Pc(753) int local753 = 0; local753 < 10; local753++) {
								local749.anIntArray272[local753] -= local559;
								local749.anIntArray273[local753] -= local617;
							}
							local749.anInt962 -= local559 * 128;
							local749.anInt963 -= local617 * 128;
						}
					}
					this.aBoolean66 = true;
					@Pc(801) byte local801 = 0;
					@Pc(803) byte local803 = 104;
					@Pc(805) byte local805 = 1;
					if (local559 < 0) {
						local801 = 103;
						local803 = -1;
						local805 = -1;
					}
					@Pc(815) byte local815 = 0;
					@Pc(817) byte local817 = 104;
					@Pc(819) byte local819 = 1;
					if (local617 < 0) {
						local815 = 103;
						local817 = -1;
						local819 = -1;
					}
					for (@Pc(829) int local829 = local801; local829 != local803; local829 += local805) {
						for (@Pc(833) int local833 = local815; local833 != local817; local833 += local819) {
							@Pc(839) int local839 = local829 + local559;
							@Pc(843) int local843 = local833 + local617;
							for (@Pc(845) int local845 = 0; local845 < 4; local845++) {
								if (local839 >= 0 && local843 >= 0 && local839 < 104 && local843 < 104) {
									this.aClass29ArrayArrayArray1[local845][local829][local833] = this.aClass29ArrayArrayArray1[local845][local839][local843];
								} else {
									this.aClass29ArrayArrayArray1[local845][local829][local833] = null;
								}
							}
						}
					}
					for (@Pc(907) Class1_Sub2 local907 = (Class1_Sub2) this.aClass29_1.method511(); local907 != null; local907 = (Class1_Sub2) this.aClass29_1.method513()) {
						local907.anInt760 -= local559;
						local907.anInt761 -= local617;
						if (local907.anInt760 < 0 || local907.anInt761 < 0 || local907.anInt760 >= 104 || local907.anInt761 >= 104) {
							local907.method673();
						}
					}
					if (this.anInt201 != 0) {
						this.anInt201 -= local559;
						this.anInt202 -= local617;
					}
					this.aBoolean52 = false;
					this.anInt223 = -1;
					return true;
				}
				if (this.anInt223 == 214) {
					local159 = this.aClass1_Sub1_Sub3_4.method482();
					local218 = this.aClass1_Sub1_Sub3_4.method482();
					local222 = local218 >> 10 & 0x1F;
					local226 = local218 >> 5 & 0x1F;
					local500 = local218 & 0x1F;
					Class6.aClass6Array1[local159].anInt419 = (local222 << 19) + (local226 << 11) + (local500 << 3);
					this.anInt223 = -1;
					return true;
				}
				if (this.anInt223 == 206) {
					this.anInt230 = this.aClass1_Sub1_Sub3_4.method480();
					this.anInt264 = this.aClass1_Sub1_Sub3_4.method480();
					this.anInt193 = this.aClass1_Sub1_Sub3_4.method480();
					this.aBoolean53 = true;
					this.aBoolean88 = true;
					this.anInt223 = -1;
					return true;
				}
				if (this.anInt223 == 51) {
					local159 = this.aClass1_Sub1_Sub3_4.method482();
					@Pc(1063) boolean local1063 = this.aClass1_Sub1_Sub3_4.method480() == 1;
					Class6.aClass6Array1[local159].aBoolean97 = local1063;
					this.anInt223 = -1;
					return true;
				}
				if (this.anInt223 == 83) {
					this.anInt201 = 0;
					this.anInt223 = -1;
					return true;
				}
				if (this.anInt223 == 45) {
					local159 = this.aClass1_Sub1_Sub3_4.method482();
					local218 = this.aClass1_Sub1_Sub3_4.method480();
					local222 = this.aClass1_Sub1_Sub3_4.method482();
					if (this.aBoolean91 && !aBoolean72 && this.anInt287 < 50) {
						this.anIntArray50[this.anInt287] = local159;
						this.anIntArray43[this.anInt287] = local218;
						this.anIntArray49[this.anInt287] = local222 + Class5.anIntArray29[local159];
						this.anInt287++;
					}
					this.anInt223 = -1;
					return true;
				}
				if (this.anInt223 == 151) {
					this.aBoolean73 = true;
					local159 = this.aClass1_Sub1_Sub3_4.method480();
					local218 = this.aClass1_Sub1_Sub3_4.method485();
					local222 = this.aClass1_Sub1_Sub3_4.method480();
					this.anIntArray68[local159] = local218;
					this.anIntArray89[local159] = local222;
					this.anIntArray90[local159] = 1;
					for (local226 = 0; local226 < 98; local226++) {
						if (local218 >= anIntArray58[local226]) {
							this.anIntArray90[local159] = local226 + 2;
						}
					}
					this.anInt223 = -1;
					return true;
				}
				if (this.anInt223 == 222 || this.anInt223 == 253 || this.anInt223 == 191 || this.anInt223 == 137 || this.anInt223 == 193 || this.anInt223 == 30 || this.anInt223 == 53 || this.anInt223 == 147 || this.anInt223 == 2 || this.anInt223 == 211 || this.anInt223 == 136) {
					this.method214(this.aClass1_Sub1_Sub3_4, this.anInt223);
					this.anInt223 = -1;
					return true;
				}
				if (this.anInt223 == 98) {
					local159 = this.aClass1_Sub1_Sub3_4.method480();
					local218 = this.aClass1_Sub1_Sub3_4.method480();
					@Pc(1274) String local1274 = this.aClass1_Sub1_Sub3_4.method487();
					if (local159 >= 1 && local159 <= 5) {
						if (local1274.equalsIgnoreCase("null")) {
							local1274 = null;
						}
						this.aStringArray6[local159 - 1] = local1274;
						this.aBooleanArray4[local159 - 1] = local218 == 0;
					}
					this.anInt223 = -1;
					return true;
				}
				if (this.anInt223 == 44) {
					this.anInt303 = this.aClass1_Sub1_Sub3_4.method480();
					this.anInt304 = this.aClass1_Sub1_Sub3_4.method480();
					for (local159 = this.anInt303; local159 < this.anInt303 + 8; local159++) {
						for (local218 = this.anInt304; local218 < this.anInt304 + 8; local218++) {
							if (this.aClass29ArrayArrayArray1[this.anInt229][local159][local218] != null) {
								this.aClass29ArrayArrayArray1[this.anInt229][local159][local218] = null;
								this.method144(local159, local218);
							}
						}
					}
					for (@Pc(1376) Class1_Sub2 local1376 = (Class1_Sub2) this.aClass29_1.method511(); local1376 != null; local1376 = (Class1_Sub2) this.aClass29_1.method513()) {
						if (local1376.anInt760 >= this.anInt303 && local1376.anInt760 < this.anInt303 + 8 && local1376.anInt761 >= this.anInt304 && local1376.anInt761 < this.anInt304 + 8 && local1376.anInt758 == this.anInt229) {
							local1376.anInt769 = 0;
						}
					}
					this.anInt223 = -1;
					return true;
				}
				if (this.anInt223 == 181) {
					this.anInt244 = this.aClass1_Sub1_Sub3_4.method480();
					if (this.anInt244 == this.anInt270) {
						if (this.anInt244 == 3) {
							this.anInt270 = 1;
						} else {
							this.anInt270 = 3;
						}
						this.aBoolean73 = true;
					}
					this.anInt223 = -1;
					return true;
				}
				if (this.anInt223 == 237) {
					local159 = this.aClass1_Sub1_Sub3_4.method482();
					this.method205(local159);
					if (this.anInt197 != -1) {
						this.anInt197 = -1;
						this.aBoolean88 = true;
					}
					if (this.aBoolean79) {
						this.aBoolean79 = false;
						this.aBoolean88 = true;
					}
					this.anInt245 = local159;
					this.aBoolean73 = true;
					this.aBoolean80 = true;
					this.anInt324 = -1;
					this.aBoolean94 = false;
					this.anInt223 = -1;
					return true;
				}
				@Pc(1524) Class6 local1524;
				if (this.anInt223 == 186) {
					local159 = this.aClass1_Sub1_Sub3_4.method482();
					local218 = this.aClass1_Sub1_Sub3_4.method483();
					local1524 = Class6.aClass6Array1[local159];
					local1524.anInt427 = local218;
					if (local218 == -1) {
						local1524.anInt402 = 0;
						local1524.anInt403 = 0;
					}
					this.anInt223 = -1;
					return true;
				}
				if (this.anInt223 == 27) {
					if (this.anInt270 == 12) {
						this.aBoolean73 = true;
					}
					this.anInt265 = this.aClass1_Sub1_Sub3_4.method480();
					this.anInt223 = -1;
					return true;
				}
				if (this.anInt223 == 141) {
					local159 = this.aClass1_Sub1_Sub3_4.method482();
					local218 = this.aClass1_Sub1_Sub3_4.method480();
					if (local159 == 65535) {
						local159 = -1;
					}
					this.anIntArray81[local218] = local159;
					this.aBoolean73 = true;
					this.aBoolean80 = true;
					this.anInt223 = -1;
					return true;
				}
				if (this.anInt223 == 228) {
					this.anInt277 = this.aClass1_Sub1_Sub3_4.method482() * 30;
					this.anInt223 = -1;
					return true;
				}
				if (this.anInt223 == 185) {
					local159 = this.aClass1_Sub1_Sub3_4.method482();
					local218 = this.aClass1_Sub1_Sub3_4.method482();
					Class6.aClass6Array1[local159].anInt423 = 1;
					Class6.aClass6Array1[local159].anInt424 = local218;
					this.anInt223 = -1;
					return true;
				}
				@Pc(1647) long local1647;
				if (this.anInt223 == 149) {
					local1647 = this.aClass1_Sub1_Sub3_4.method486();
					local222 = this.aClass1_Sub1_Sub3_4.method480();
					@Pc(1657) String local1657 = Class48.method671(Class48.method668(local1647));
					for (local500 = 0; local500 < this.anInt350; local500++) {
						if (local1647 == this.aLongArray3[local500]) {
							if (this.anIntArray48[local500] != local222) {
								this.anIntArray48[local500] = local222;
								this.aBoolean73 = true;
								if (local222 > 0) {
									this.method221(local1657 + " has logged in.", 5, "");
								}
								if (local222 == 0) {
									this.method221(local1657 + " has logged out.", 5, "");
								}
							}
							local1657 = null;
							break;
						}
					}
					if (local1657 != null && this.anInt350 < 200) {
						this.aLongArray3[this.anInt350] = local1647;
						this.aStringArray2[this.anInt350] = local1657;
						this.anIntArray48[this.anInt350] = local222;
						this.anInt350++;
						this.aBoolean73 = true;
					}
					@Pc(1755) boolean local1755 = false;
					while (!local1755) {
						local1755 = true;
						for (local617 = 0; local617 < this.anInt350 - 1; local617++) {
							if (this.anIntArray48[local617] != anInt291 && this.anIntArray48[local617 + 1] == anInt291 || this.anIntArray48[local617] == 0 && this.anIntArray48[local617 + 1] != 0) {
								local638 = this.anIntArray48[local617];
								this.anIntArray48[local617] = this.anIntArray48[local617 + 1];
								this.anIntArray48[local617 + 1] = local638;
								@Pc(1816) String local1816 = this.aStringArray2[local617];
								this.aStringArray2[local617] = this.aStringArray2[local617 + 1];
								this.aStringArray2[local617 + 1] = local1816;
								@Pc(1838) long local1838 = this.aLongArray3[local617];
								this.aLongArray3[local617] = this.aLongArray3[local617 + 1];
								this.aLongArray3[local617 + 1] = local1838;
								this.aBoolean73 = true;
								local1755 = false;
							}
						}
					}
					this.anInt223 = -1;
					return true;
				}
				if (this.anInt223 == 55) {
					this.anInt285 = this.aClass1_Sub1_Sub3_4.method480();
					if (this.anInt285 == 1) {
						this.anInt246 = this.aClass1_Sub1_Sub3_4.method482();
					}
					if (this.anInt285 >= 2 && this.anInt285 <= 6) {
						if (this.anInt285 == 2) {
							this.anInt206 = 64;
							this.anInt207 = 64;
						}
						if (this.anInt285 == 3) {
							this.anInt206 = 0;
							this.anInt207 = 64;
						}
						if (this.anInt285 == 4) {
							this.anInt206 = 128;
							this.anInt207 = 64;
						}
						if (this.anInt285 == 5) {
							this.anInt206 = 64;
							this.anInt207 = 0;
						}
						if (this.anInt285 == 6) {
							this.anInt206 = 64;
							this.anInt207 = 128;
						}
						this.anInt285 = 2;
						this.anInt203 = this.aClass1_Sub1_Sub3_4.method482();
						this.anInt204 = this.aClass1_Sub1_Sub3_4.method482();
						this.anInt205 = this.aClass1_Sub1_Sub3_4.method480();
					}
					if (this.anInt285 == 10) {
						this.anInt305 = this.aClass1_Sub1_Sub3_4.method482();
					}
					this.anInt223 = -1;
					return true;
				}
				if (this.anInt223 == 138) {
					this.aBoolean52 = false;
					for (local159 = 0; local159 < 5; local159++) {
						this.aBooleanArray3[local159] = false;
					}
					this.anInt223 = -1;
					return true;
				}
				if (this.anInt223 == 241) {
					this.aBoolean52 = true;
					this.anInt363 = this.aClass1_Sub1_Sub3_4.method480();
					this.anInt364 = this.aClass1_Sub1_Sub3_4.method480();
					this.anInt365 = this.aClass1_Sub1_Sub3_4.method482();
					this.anInt366 = this.aClass1_Sub1_Sub3_4.method480();
					this.anInt367 = this.aClass1_Sub1_Sub3_4.method480();
					if (this.anInt367 >= 100) {
						local159 = this.anInt363 * 128 + 64;
						local218 = this.anInt364 * 128 + 64;
						local222 = this.method219(this.anInt229, local218, local159) - this.anInt365;
						local226 = local159 - this.anInt375;
						local500 = local222 - this.anInt376;
						local559 = local218 - this.anInt377;
						local617 = (int) Math.sqrt((double) (local226 * local226 + local559 * local559));
						this.anInt378 = (int) (Math.atan2((double) local500, (double) local617) * 325.949D) & 0x7FF;
						this.anInt379 = (int) (Math.atan2((double) local226, (double) local559) * -325.949D) & 0x7FF;
						if (this.anInt378 < 128) {
							this.anInt378 = 128;
						}
						if (this.anInt378 > 383) {
							this.anInt378 = 383;
						}
					}
					this.anInt223 = -1;
					return true;
				}
				@Pc(2226) String local2226;
				@Pc(2156) boolean local2156;
				if (this.anInt223 == 224) {
					local1647 = this.aClass1_Sub1_Sub3_4.method486();
					local222 = this.aClass1_Sub1_Sub3_4.method485();
					local226 = this.aClass1_Sub1_Sub3_4.method480();
					local2156 = false;
					for (local559 = 0; local559 < 100; local559++) {
						if (this.anIntArray71[local559] == local222) {
							local2156 = true;
							break;
						}
					}
					if (local226 <= 1) {
						for (local617 = 0; local617 < this.anInt290; local617++) {
							if (this.aLongArray4[local617] == local1647) {
								local2156 = true;
								break;
							}
						}
					}
					if (!local2156 && this.anInt278 == 0) {
						try {
							this.anIntArray71[this.anInt309] = local222;
							this.anInt309 = (this.anInt309 + 1) % 100;
							local2226 = Class49.method683(this.anInt222 - 13, this.anInt293, this.aClass1_Sub1_Sub3_4);
							local2226 = Class42.method604(local2226);
							if (local226 == 2 || local226 == 3) {
								this.method221(local2226, 7, "@cr2@" + Class48.method671(Class48.method668(local1647)));
							} else if (local226 == 1) {
								this.method221(local2226, 7, "@cr1@" + Class48.method671(Class48.method668(local1647)));
							} else {
								this.method221(local2226, 3, Class48.method671(Class48.method668(local1647)));
							}
						} catch (@Pc(2287) Exception local2287) {
							signlink.reporterror("cde1");
						}
					}
					this.anInt223 = -1;
					return true;
				}
				if (this.anInt223 == 119) {
					this.anInt342 = this.aClass1_Sub1_Sub3_4.method485();
					this.anInt336 = this.aClass1_Sub1_Sub3_4.method482();
					this.anInt200 = this.aClass1_Sub1_Sub3_4.method480();
					this.anInt279 = this.aClass1_Sub1_Sub3_4.method482();
					this.anInt307 = this.aClass1_Sub1_Sub3_4.method480();
					if (this.anInt342 != 0 && this.anInt324 == -1) {
						signlink.dnslookup(Class48.method670(this.anInt342));
						this.method129();
						@Pc(2341) short local2341 = 650;
						if (this.anInt200 != 201 || this.anInt307 == 1) {
							local2341 = 655;
						}
						this.aString7 = "";
						this.aBoolean76 = false;
						for (local218 = 0; local218 < Class6.aClass6Array1.length; local218++) {
							if (Class6.aClass6Array1[local218] != null && Class6.aClass6Array1[local218].anInt408 == local2341) {
								this.anInt324 = Class6.aClass6Array1[local218].anInt405;
								break;
							}
						}
					}
					this.anInt223 = -1;
					return true;
				}
				if (this.anInt223 == 19) {
					this.anInt212 = this.aClass1_Sub1_Sub3_4.method480();
					this.anInt223 = -1;
					return true;
				}
				if (this.anInt223 == 94) {
					local159 = this.aClass1_Sub1_Sub3_4.method482();
					Class6.aClass6Array1[local159].anInt423 = 3;
					if (aClass1_Sub1_Sub1_Sub1_Sub1_1.aClass13_1 == null) {
						Class6.aClass6Array1[local159].anInt424 = (aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray14[0] << 25) + (aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray14[4] << 20) + (aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray13[0] << 15) + (aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray13[8] << 10) + (aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray13[11] << 5) + aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray13[1];
					} else {
						Class6.aClass6Array1[local159].anInt424 = (int) (aClass1_Sub1_Sub1_Sub1_Sub1_1.aClass13_1.aLong23 + 305419896L);
					}
					this.anInt223 = -1;
					return true;
				}
				if (this.anInt223 == 245) {
					local159 = this.aClass1_Sub1_Sub3_4.method482();
					local218 = this.aClass1_Sub1_Sub3_4.method482();
					if (this.anInt197 != -1) {
						this.anInt197 = -1;
						this.aBoolean88 = true;
					}
					if (this.aBoolean79) {
						this.aBoolean79 = false;
						this.aBoolean88 = true;
					}
					this.anInt324 = local159;
					this.anInt245 = local218;
					this.aBoolean73 = true;
					this.aBoolean80 = true;
					this.aBoolean94 = false;
					this.anInt223 = -1;
					return true;
				}
				if (this.anInt223 == 156) {
					if (this.anInt270 == 12) {
						this.aBoolean73 = true;
					}
					this.anInt312 = this.aClass1_Sub1_Sub3_4.method483();
					this.anInt223 = -1;
					return true;
				}
				@Pc(2566) Class6 local2566;
				if (this.anInt223 == 13) {
					this.aBoolean73 = true;
					local159 = this.aClass1_Sub1_Sub3_4.method482();
					local2566 = Class6.aClass6Array1[local159];
					while (this.aClass1_Sub1_Sub3_4.anInt720 < this.anInt222) {
						local222 = this.aClass1_Sub1_Sub3_4.method494();
						local226 = this.aClass1_Sub1_Sub3_4.method482();
						local500 = this.aClass1_Sub1_Sub3_4.method480();
						if (local500 == 255) {
							local500 = this.aClass1_Sub1_Sub3_4.method485();
						}
						if (local222 >= 0 && local222 < local2566.anIntArray94.length) {
							local2566.anIntArray94[local222] = local226;
							local2566.anIntArray95[local222] = local500;
						}
					}
					this.anInt223 = -1;
					return true;
				}
				if (this.anInt223 == 75) {
					this.method230();
					this.anInt223 = -1;
					return false;
				}
				if (this.anInt223 == 118) {
					this.anInt351 = this.aClass1_Sub1_Sub3_4.method480();
					this.aBoolean73 = true;
					this.anInt223 = -1;
					return true;
				}
				if (this.anInt223 == 226) {
					for (local159 = 0; local159 < this.anIntArray56.length; local159++) {
						if (this.anIntArray56[local159] != this.anIntArray62[local159]) {
							this.anIntArray56[local159] = this.anIntArray62[local159];
							this.method142(local159);
							this.aBoolean73 = true;
						}
					}
					this.anInt223 = -1;
					return true;
				}
				if (this.anInt223 == 115) {
					this.aBoolean52 = true;
					this.anInt213 = this.aClass1_Sub1_Sub3_4.method480();
					this.anInt214 = this.aClass1_Sub1_Sub3_4.method480();
					this.anInt215 = this.aClass1_Sub1_Sub3_4.method482();
					this.anInt216 = this.aClass1_Sub1_Sub3_4.method480();
					this.anInt217 = this.aClass1_Sub1_Sub3_4.method480();
					if (this.anInt217 >= 100) {
						this.anInt375 = this.anInt213 * 128 + 64;
						this.anInt377 = this.anInt214 * 128 + 64;
						this.anInt376 = this.method219(this.anInt229, this.anInt377, this.anInt375) - this.anInt215;
					}
					this.anInt223 = -1;
					return true;
				}
				@Pc(2770) String local2770;
				if (this.anInt223 == 169) {
					local159 = this.aClass1_Sub1_Sub3_4.method482();
					local2770 = this.aClass1_Sub1_Sub3_4.method487();
					Class6.aClass6Array1[local159].aString18 = local2770;
					if (Class6.aClass6Array1[local159].anInt405 == this.anIntArray81[this.anInt270]) {
						this.aBoolean73 = true;
					}
					this.anInt223 = -1;
					return true;
				}
				if (this.anInt223 == 145) {
					local159 = this.aClass1_Sub1_Sub3_4.method482();
					local218 = this.aClass1_Sub1_Sub3_4.method485();
					this.anIntArray62[local159] = local218;
					if (this.anIntArray56[local159] != local218) {
						this.anIntArray56[local159] = local218;
						this.method142(local159);
						this.aBoolean73 = true;
						if (this.anInt314 != -1) {
							this.aBoolean88 = true;
						}
					}
					this.anInt223 = -1;
					return true;
				}
				if (this.anInt223 == 7) {
					local159 = this.aClass1_Sub1_Sub3_4.method482();
					local218 = this.aClass1_Sub1_Sub3_4.method482();
					Class6.aClass6Array1[local159].anInt423 = 2;
					Class6.aClass6Array1[local159].anInt424 = local218;
					this.anInt223 = -1;
					return true;
				}
				if (this.anInt223 == 238) {
					local2875 = this.aClass1_Sub1_Sub3_4.method487();
					@Pc(2889) long local2889;
					if (local2875.endsWith(":tradereq:")) {
						local2770 = local2875.substring(0, local2875.indexOf(":"));
						local2889 = Class48.method667(local2770);
						local2156 = false;
						for (local559 = 0; local559 < this.anInt290; local559++) {
							if (this.aLongArray4[local559] == local2889) {
								local2156 = true;
								break;
							}
						}
						if (!local2156 && this.anInt278 == 0) {
							this.method221("wishes to trade with you.", 4, local2770);
						}
					} else if (local2875.endsWith(":duelreq:")) {
						local2770 = local2875.substring(0, local2875.indexOf(":"));
						local2889 = Class48.method667(local2770);
						local2156 = false;
						for (local559 = 0; local559 < this.anInt290; local559++) {
							if (this.aLongArray4[local559] == local2889) {
								local2156 = true;
								break;
							}
						}
						if (!local2156 && this.anInt278 == 0) {
							this.method221("wishes to duel with you.", 8, local2770);
						}
					} else if (local2875.endsWith(":chalreq:")) {
						local2770 = local2875.substring(0, local2875.indexOf(":"));
						local2889 = Class48.method667(local2770);
						local2156 = false;
						for (local559 = 0; local559 < this.anInt290; local559++) {
							if (this.aLongArray4[local559] == local2889) {
								local2156 = true;
								break;
							}
						}
						if (!local2156 && this.anInt278 == 0) {
							local2226 = local2875.substring(local2875.indexOf(":") + 1, local2875.length() - 9);
							this.method221(local2226, 8, local2770);
						}
					} else {
						this.method221(local2875, 0, "");
					}
					this.anInt223 = -1;
					return true;
				}
				if (this.anInt223 == 9) {
					local159 = this.aClass1_Sub1_Sub3_4.method483();
					this.anInt314 = local159;
					this.aBoolean88 = true;
					this.anInt223 = -1;
					return true;
				}
				if (this.anInt223 == 153) {
					local159 = this.aClass1_Sub1_Sub3_4.method482();
					local218 = this.aClass1_Sub1_Sub3_4.method482();
					local222 = this.aClass1_Sub1_Sub3_4.method482();
					if (local218 == 65535) {
						Class6.aClass6Array1[local159].anInt423 = 0;
						this.anInt223 = -1;
						return true;
					}
					@Pc(3096) Class15 local3096 = Class15.method361(local218);
					Class6.aClass6Array1[local159].anInt423 = 4;
					Class6.aClass6Array1[local159].anInt424 = local218;
					Class6.aClass6Array1[local159].anInt430 = local3096.anInt577;
					Class6.aClass6Array1[local159].anInt431 = local3096.anInt578;
					Class6.aClass6Array1[local159].anInt429 = local3096.anInt576 * 100 / local222;
					this.anInt223 = -1;
					return true;
				}
				if (this.anInt223 == 22) {
					this.anInt303 = this.aClass1_Sub1_Sub3_4.method480();
					this.anInt304 = this.aClass1_Sub1_Sub3_4.method480();
					this.anInt223 = -1;
					return true;
				}
				if (this.anInt223 == 196) {
					this.method102(this.anInt222, this.aClass1_Sub1_Sub3_4);
					this.aBoolean66 = false;
					this.anInt223 = -1;
					return true;
				}
				if (this.anInt223 == 62) {
					this.aBoolean69 = false;
					this.aBoolean79 = true;
					this.aString6 = "";
					this.aBoolean88 = true;
					this.anInt223 = -1;
					return true;
				}
				if (this.anInt223 == 33) {
					this.anInt208 = this.aClass1_Sub1_Sub3_4.method482();
					this.anInt327 = this.aClass1_Sub1_Sub3_4.method480();
					this.anInt223 = -1;
					return true;
				}
				if (this.anInt223 == 108) {
					this.anInt303 = this.aClass1_Sub1_Sub3_4.method480();
					this.anInt304 = this.aClass1_Sub1_Sub3_4.method480();
					while (this.aClass1_Sub1_Sub3_4.anInt720 < this.anInt222) {
						local159 = this.aClass1_Sub1_Sub3_4.method480();
						this.method214(this.aClass1_Sub1_Sub3_4, local159);
					}
					this.anInt223 = -1;
					return true;
				}
				if (this.anInt223 == 188) {
					this.aBoolean73 = true;
					local159 = this.aClass1_Sub1_Sub3_4.method482();
					local2566 = Class6.aClass6Array1[local159];
					local222 = this.aClass1_Sub1_Sub3_4.method482();
					for (local226 = 0; local226 < local222; local226++) {
						local2566.anIntArray94[local226] = this.aClass1_Sub1_Sub3_4.method482();
						local500 = this.aClass1_Sub1_Sub3_4.method480();
						if (local500 == 255) {
							local500 = this.aClass1_Sub1_Sub3_4.method485();
						}
						local2566.anIntArray95[local226] = local500;
					}
					for (local500 = local222; local500 < local2566.anIntArray94.length; local500++) {
						local2566.anIntArray94[local500] = 0;
						local2566.anIntArray95[local500] = 0;
					}
					this.anInt223 = -1;
					return true;
				}
				if (this.anInt223 == 38) {
					local159 = this.aClass1_Sub1_Sub3_4.method482();
					if (local159 == 65535) {
						local159 = -1;
					}
					if (local159 != this.anInt317 && this.aBoolean90 && !aBoolean72 && this.anInt238 == 0) {
						this.anInt308 = local159;
						this.aBoolean75 = true;
						this.aClass44_Sub1_1.method645(2, this.anInt308);
					}
					this.anInt317 = local159;
					this.anInt223 = -1;
					return true;
				}
				if (this.anInt223 == 183) {
					local159 = this.aClass1_Sub1_Sub3_4.method482();
					local218 = this.aClass1_Sub1_Sub3_4.method482();
					if (this.aBoolean90 && !aBoolean72) {
						this.anInt308 = local159;
						this.aBoolean75 = false;
						this.aClass44_Sub1_1.method645(2, this.anInt308);
						this.anInt238 = local218;
					}
					this.anInt223 = -1;
					return true;
				}
				if (this.anInt223 == 204) {
					local159 = this.aClass1_Sub1_Sub3_4.method482();
					local2566 = Class6.aClass6Array1[local159];
					for (local222 = 0; local222 < local2566.anIntArray94.length; local222++) {
						local2566.anIntArray94[local222] = -1;
						local2566.anIntArray94[local222] = 0;
					}
					this.anInt223 = -1;
					return true;
				}
				if (this.anInt223 == 111) {
					for (local159 = 0; local159 < this.aClass1_Sub1_Sub1_Sub1_Sub1Array1.length; local159++) {
						if (this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local159] != null) {
							this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local159].anInt985 = -1;
						}
					}
					for (local218 = 0; local218 < this.aClass1_Sub1_Sub1_Sub1_Sub2Array1.length; local218++) {
						if (this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local218] != null) {
							this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local218].anInt985 = -1;
						}
					}
					this.anInt223 = -1;
					return true;
				}
				if (this.anInt223 == 246) {
					local159 = this.aClass1_Sub1_Sub3_4.method483();
					if (local159 >= 0) {
						this.method205(local159);
					}
					this.anInt333 = local159;
					this.anInt223 = -1;
					return true;
				}
				if (this.anInt223 == 3) {
					this.anInt270 = this.aClass1_Sub1_Sub3_4.method480();
					this.aBoolean73 = true;
					this.aBoolean80 = true;
					this.anInt223 = -1;
					return true;
				}
				if (this.anInt223 == 105) {
					this.anInt290 = this.anInt222 / 8;
					for (local159 = 0; local159 < this.anInt290; local159++) {
						this.aLongArray4[local159] = this.aClass1_Sub1_Sub3_4.method486();
					}
					this.anInt223 = -1;
					return true;
				}
				if (this.anInt223 == 77) {
					local159 = this.aClass1_Sub1_Sub3_4.method482();
					this.method205(local159);
					if (this.anInt245 != -1) {
						this.anInt245 = -1;
						this.aBoolean73 = true;
						this.aBoolean80 = true;
					}
					this.anInt197 = local159;
					this.aBoolean88 = true;
					this.anInt324 = -1;
					this.aBoolean94 = false;
					this.anInt223 = -1;
					return true;
				}
				if (this.anInt223 == 195) {
					this.method184(this.aClass1_Sub1_Sub3_4, this.anInt222);
					this.anInt223 = -1;
					return true;
				}
				if (this.anInt223 == 212) {
					if (this.anInt245 != -1) {
						this.anInt245 = -1;
						this.aBoolean73 = true;
						this.aBoolean80 = true;
					}
					if (this.anInt197 != -1) {
						this.anInt197 = -1;
						this.aBoolean88 = true;
					}
					if (this.aBoolean79) {
						this.aBoolean79 = false;
						this.aBoolean88 = true;
					}
					this.anInt324 = -1;
					this.aBoolean94 = false;
					this.anInt223 = -1;
					return true;
				}
				if (this.anInt223 == 130) {
					local159 = this.aClass1_Sub1_Sub3_4.method482();
					local218 = this.aClass1_Sub1_Sub3_4.method483();
					local222 = this.aClass1_Sub1_Sub3_4.method483();
					@Pc(3692) Class6 local3692 = Class6.aClass6Array1[local159];
					local3692.anInt411 = local218;
					local3692.anInt412 = local222;
					this.anInt223 = -1;
					return true;
				}
				if (this.anInt223 == 85) {
					local159 = this.aClass1_Sub1_Sub3_4.method482();
					local218 = this.aClass1_Sub1_Sub3_4.method482();
					local1524 = Class6.aClass6Array1[local159];
					if (local1524 != null && local1524.anInt406 == 0) {
						if (local218 < 0) {
							local218 = 0;
						}
						if (local218 > local1524.anInt414 - local1524.anInt410) {
							local218 = local1524.anInt414 - local1524.anInt410;
						}
						local1524.anInt415 = local218;
					}
					this.anInt223 = -1;
					return true;
				}
				signlink.reporterror("T1 - " + this.anInt223 + "," + this.anInt222 + " - " + this.anInt346 + "," + this.anInt347);
				this.method230();
			} catch (@Pc(3778) IOException local3778) {
				this.method113();
			} catch (@Pc(3783) Exception local3783) {
				local2875 = "T2 - " + this.anInt223 + "," + this.anInt346 + "," + this.anInt347 + " - " + this.anInt222 + "," + (this.anInt354 + aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray272[0]) + "," + (this.anInt355 + aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray273[0]) + " - ";
				for (local218 = 0; local218 < this.anInt222 && local218 < 50; local218++) {
					local2875 = local2875 + this.aClass1_Sub1_Sub3_4.aByteArray9[local218] + ",";
				}
				signlink.reporterror(local2875);
				this.method230();
			}
			return true;
		} catch (@Pc(3864) RuntimeException local3864) {
			signlink.reporterror("66491, " + 0 + ", " + local3864.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(II)V")
	private void method100(@OriginalArg(1) int arg0) {
		try {
			@Pc(5) int[] local5 = this.aClass1_Sub1_Sub2_Sub2_1.anIntArray208;
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
			this.aClass1_Sub1_Sub2_Sub2_1.method386(this.anInt198);
			@Pc(147) int local147;
			for (@Pc(143) int local143 = 1; local143 < 103; local143++) {
				for (local147 = 1; local147 < 103; local147++) {
					if ((this.aByteArrayArrayArray7[arg0][local147][local143] & 0x18) == 0) {
						this.method176(local143, local147, arg0, local36, local34);
					}
					if (arg0 < 3 && (this.aByteArrayArrayArray7[arg0 + 1][local147][local143] & 0x8) != 0) {
						this.method176(local143, local147, arg0 + 1, local36, local34);
					}
				}
			}
			this.aClass35_5.method524(this.anInt198);
			this.anInt335 = 0;
			for (local147 = 0; local147 < 104; local147++) {
				for (@Pc(222) int local222 = 0; local222 < 104; local222++) {
					@Pc(232) int local232 = this.aClass37_1.method559(this.anInt229, local147, local222);
					if (local232 != 0) {
						local232 = local232 >> 14 & 0x7FFF;
						@Pc(244) int local244 = Class9.method288(local232).anInt485;
						if (local244 >= 0) {
							@Pc(248) int local248 = local147;
							@Pc(250) int local250 = local222;
							if (local244 != 22 && local244 != 29 && local244 != 34 && local244 != 36 && local244 != 46 && local244 != 47 && local244 != 48) {
								@Pc(282) int[][] local282 = this.aClass19Array1[this.anInt229].anIntArrayArray18;
								for (@Pc(284) int local284 = 0; local284 < 10; local284++) {
									@Pc(291) int local291 = (int) (Math.random() * 4.0D);
									if (local291 == 0 && local248 > 0 && local248 > local147 - 3 && (local282[local248 - 1][local250] & 0x280108) == 0) {
										local248--;
									}
									if (local291 == 1 && local248 < 103 && local248 < local147 + 3 && (local282[local248 + 1][local250] & 0x280180) == 0) {
										local248++;
									}
									if (local291 == 2 && local250 > 0 && local250 > local222 - 3 && (local282[local248][local250 - 1] & 0x280102) == 0) {
										local250--;
									}
									if (local291 == 3 && local250 < 103 && local250 < local222 + 3 && (local282[local248][local250 + 1] & 0x280120) == 0) {
										local250++;
									}
								}
							}
							this.aClass1_Sub1_Sub2_Sub2Array5[this.anInt335] = this.aClass1_Sub1_Sub2_Sub2Array7[local244];
							this.anIntArray69[this.anInt335] = local248;
							this.anIntArray70[this.anInt335] = local250;
							this.anInt335++;
						}
					}
				}
			}
			anInt286++;
			if (anInt286 > 112) {
				anInt286 = 0;
				this.aClass1_Sub1_Sub3_3.method469(164);
				this.aClass1_Sub1_Sub3_3.method470(50);
			}
		} catch (@Pc(439) RuntimeException local439) {
			signlink.reporterror("90274, " + 2 + ", " + arg0 + ", " + local439.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(II)Ljava/lang/String;")
	private String method101(@OriginalArg(1) int arg0) {
		try {
			return arg0 < 999999999 ? String.valueOf(arg0) : "*";
		} catch (@Pc(15) RuntimeException local15) {
			signlink.reporterror("60846, " + -711 + ", " + arg0 + ", " + local15.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IILclient!lb;)V")
	private void method102(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub1_Sub3 arg1) {
		try {
			this.anInt271 = 0;
			this.anInt243 = 0;
			this.method127(332, arg1, arg0);
			this.method125(arg1, arg0);
			this.method212(arg0, arg1);
			@Pc(26) int local26 = arg0 + 0;
			this.method137(arg1, (byte) 2, local26);
			@Pc(40) int local40;
			for (@Pc(33) int local33 = 0; local33 < this.anInt271; local33++) {
				local40 = this.anIntArray53[local33];
				if (this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local40].anInt1002 != anInt239) {
					this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local40] = null;
				}
			}
			if (arg1.anInt720 != local26) {
				signlink.reporterror("Error packet size mismatch in getplayer pos:" + arg1.anInt720 + " psize:" + local26);
				throw new RuntimeException("eek");
			}
			for (local40 = 0; local40 < this.anInt242; local40++) {
				if (this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[this.anIntArray46[local40]] == null) {
					signlink.reporterror(this.aString12 + " null entry in pl list - pos:" + local40 + " size:" + this.anInt242);
					throw new RuntimeException("eek");
				}
			}
		} catch (@Pc(120) RuntimeException local120) {
			signlink.reporterror("86834, " + 0 + ", " + arg0 + ", " + arg1 + ", " + local120.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/String;)V")
	private void method103(@OriginalArg(0) String arg0) {
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

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(B)V")
	private void method104() {
		try {
			for (@Pc(6) Class1_Sub1_Sub1_Sub4 local6 = (Class1_Sub1_Sub1_Sub4) this.aClass29_3.method511(); local6 != null; local6 = (Class1_Sub1_Sub1_Sub4) this.aClass29_3.method513()) {
				if (local6.anInt434 != this.anInt229 || anInt239 > local6.anInt440) {
					local6.method673();
				} else if (anInt239 >= local6.anInt439) {
					if (local6.anInt443 > 0) {
						@Pc(36) Class1_Sub1_Sub1_Sub1_Sub2 local36 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local6.anInt443 - 1];
						if (local36 != null && local36.anInt962 >= 0 && local36.anInt962 < 13312 && local36.anInt963 >= 0 && local36.anInt963 < 13312) {
							local6.method241(anInt239, this.method219(local6.anInt434, local36.anInt963, local36.anInt962) - local6.anInt438, local36.anInt963, local36.anInt962);
						}
					}
					if (local6.anInt443 < 0) {
						@Pc(81) int local81 = -local6.anInt443 - 1;
						@Pc(87) Class1_Sub1_Sub1_Sub1_Sub1 local87;
						if (local81 == this.anInt208) {
							local87 = aClass1_Sub1_Sub1_Sub1_Sub1_1;
						} else {
							local87 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local81];
						}
						if (local87 != null && local87.anInt962 >= 0 && local87.anInt962 < 13312 && local87.anInt963 >= 0 && local87.anInt963 < 13312) {
							local6.method241(anInt239, this.method219(local6.anInt434, local87.anInt963, local87.anInt962) - local6.anInt438, local87.anInt963, local87.anInt962);
						}
					}
					local6.method242(this.anInt338);
					this.aClass37_1.method541(local6, (int) local6.aDouble2, local6.anInt444, -1, (int) local6.aDouble1, this.anInt229, 60, (int) local6.aDouble3, false);
				}
			}
			anInt384++;
			if (anInt384 > 1174) {
				anInt384 = 0;
				this.aClass1_Sub1_Sub3_3.method469(90);
				this.aClass1_Sub1_Sub3_3.method470(0);
				@Pc(196) int local196 = this.aClass1_Sub1_Sub3_3.anInt720;
				if ((int) (Math.random() * 2.0D) == 0) {
					this.aClass1_Sub1_Sub3_3.method471(11499);
				}
				this.aClass1_Sub1_Sub3_3.method471(10548);
				if ((int) (Math.random() * 2.0D) == 0) {
					this.aClass1_Sub1_Sub3_3.method470(139);
				}
				if ((int) (Math.random() * 2.0D) == 0) {
					this.aClass1_Sub1_Sub3_3.method470(94);
				}
				this.aClass1_Sub1_Sub3_3.method471(51693);
				this.aClass1_Sub1_Sub3_3.method470(16);
				this.aClass1_Sub1_Sub3_3.method471(15036);
				if ((int) (Math.random() * 2.0D) == 0) {
					this.aClass1_Sub1_Sub3_3.method470(65);
				}
				this.aClass1_Sub1_Sub3_3.method470((int) (Math.random() * 256.0D));
				this.aClass1_Sub1_Sub3_3.method471(22990);
				this.aClass1_Sub1_Sub3_3.method479(this.aClass1_Sub1_Sub3_3.anInt720 - local196);
			}
		} catch (@Pc(270) RuntimeException local270) {
			signlink.reporterror("23603, " + 75 + ", " + local270.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!d;Z)Z")
	private boolean method105(@OriginalArg(0) Class6 arg0) {
		try {
			this.aBoolean89 &= true;
			@Pc(10) int local10 = arg0.anInt408;
			if (this.anInt351 == 2) {
				if (local10 == 201) {
					this.aBoolean88 = true;
					this.aBoolean79 = false;
					this.aBoolean69 = true;
					this.aString16 = "";
					this.anInt328 = 1;
					this.aString14 = "Enter name of friend to add to list";
				}
				if (local10 == 202) {
					this.aBoolean88 = true;
					this.aBoolean79 = false;
					this.aBoolean69 = true;
					this.aString16 = "";
					this.anInt328 = 2;
					this.aString14 = "Enter name of friend to delete from list";
				}
			}
			if (local10 == 205) {
				this.anInt226 = 250;
				return true;
			}
			if (local10 == 501) {
				this.aBoolean88 = true;
				this.aBoolean79 = false;
				this.aBoolean69 = true;
				this.aString16 = "";
				this.anInt328 = 4;
				this.aString14 = "Enter name of player to add to list";
			}
			if (local10 == 502) {
				this.aBoolean88 = true;
				this.aBoolean79 = false;
				this.aBoolean69 = true;
				this.aString16 = "";
				this.anInt328 = 5;
				this.aString14 = "Enter name of player to delete from list";
			}
			@Pc(118) int local118;
			@Pc(122) int local122;
			@Pc(127) int local127;
			if (local10 >= 300 && local10 <= 313) {
				local118 = (local10 - 300) / 2;
				local122 = local10 & 0x1;
				local127 = this.anIntArray54[local118];
				if (local127 != -1) {
					while (true) {
						if (local122 == 0) {
							local127--;
							if (local127 < 0) {
								local127 = Class23.anInt729 - 1;
							}
						}
						if (local122 == 1) {
							local127++;
							if (local127 >= Class23.anInt729) {
								local127 = 0;
							}
						}
						if (!Class23.aClass23Array1[local127].aBoolean202 && Class23.aClass23Array1[local127].anInt730 == local118 + (this.aBoolean58 ? 0 : 7)) {
							this.anIntArray54[local118] = local127;
							this.aBoolean83 = true;
							break;
						}
					}
				}
			}
			if (local10 >= 314 && local10 <= 323) {
				local118 = (local10 - 314) / 2;
				local122 = local10 & 0x1;
				local127 = this.anIntArray59[local118];
				if (local122 == 0) {
					local127--;
					if (local127 < 0) {
						local127 = anIntArrayArray3[local118].length - 1;
					}
				}
				if (local122 == 1) {
					local127++;
					if (local127 >= anIntArrayArray3[local118].length) {
						local127 = 0;
					}
				}
				this.anIntArray59[local118] = local127;
				this.aBoolean83 = true;
			}
			if (local10 == 324 && !this.aBoolean58) {
				this.aBoolean58 = true;
				this.method228(this.aByte5);
			}
			if (local10 == 325 && this.aBoolean58) {
				this.aBoolean58 = false;
				this.method228(this.aByte5);
			}
			if (local10 == 326) {
				this.aClass1_Sub1_Sub3_3.method469(145);
				this.aClass1_Sub1_Sub3_3.method470(this.aBoolean58 ? 0 : 1);
				for (local118 = 0; local118 < 7; local118++) {
					this.aClass1_Sub1_Sub3_3.method470(this.anIntArray54[local118]);
				}
				for (local122 = 0; local122 < 5; local122++) {
					this.aClass1_Sub1_Sub3_3.method470(this.anIntArray59[local122]);
				}
				return true;
			}
			if (local10 == 613) {
				this.aBoolean76 = !this.aBoolean76;
			}
			if (local10 >= 601 && local10 <= 612) {
				this.method129();
				if (this.aString7.length() > 0) {
					this.aClass1_Sub1_Sub3_3.method469(85);
					this.aClass1_Sub1_Sub3_3.method476(Class48.method667(this.aString7), (byte) 3);
					this.aClass1_Sub1_Sub3_3.method470(local10 - 601);
					this.aClass1_Sub1_Sub3_3.method470(this.aBoolean76 ? 1 : 0);
				}
			}
			return false;
		} catch (@Pc(357) RuntimeException local357) {
			signlink.reporterror("5245, " + arg0 + ", " + true + ", " + local357.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
	@Override
	public AppletContext getAppletContext() {
		return signlink.mainapp == null ? super.getAppletContext() : signlink.mainapp.getAppletContext();
	}

	@OriginalMember(owner = "client!client", name = "g", descriptor = "(I)V")
	private void method106() {
		try {
			if (super.anInt187 == 1) {
				if (super.anInt188 >= 6 && super.anInt188 <= 106 && super.anInt189 >= 467 && super.anInt189 <= 499) {
					this.anInt230 = (this.anInt230 + 1) % 4;
					this.aBoolean53 = true;
					this.aBoolean88 = true;
					this.aClass1_Sub1_Sub3_3.method469(242);
					this.aClass1_Sub1_Sub3_3.method470(this.anInt230);
					this.aClass1_Sub1_Sub3_3.method470(this.anInt264);
					this.aClass1_Sub1_Sub3_3.method470(this.anInt193);
				}
				if (super.anInt188 >= 135 && super.anInt188 <= 235 && super.anInt189 >= 467 && super.anInt189 <= 499) {
					this.anInt264 = (this.anInt264 + 1) % 3;
					this.aBoolean53 = true;
					this.aBoolean88 = true;
					this.aClass1_Sub1_Sub3_3.method469(242);
					this.aClass1_Sub1_Sub3_3.method470(this.anInt230);
					this.aClass1_Sub1_Sub3_3.method470(this.anInt264);
					this.aClass1_Sub1_Sub3_3.method470(this.anInt193);
				}
				if (super.anInt188 >= 273 && super.anInt188 <= 373 && super.anInt189 >= 467 && super.anInt189 <= 499) {
					this.anInt193 = (this.anInt193 + 1) % 3;
					this.aBoolean53 = true;
					this.aBoolean88 = true;
					this.aClass1_Sub1_Sub3_3.method469(242);
					this.aClass1_Sub1_Sub3_3.method470(this.anInt230);
					this.aClass1_Sub1_Sub3_3.method470(this.anInt264);
					this.aClass1_Sub1_Sub3_3.method470(this.anInt193);
				}
				if (super.anInt188 >= 412 && super.anInt188 <= 512 && super.anInt189 >= 467 && super.anInt189 <= 499) {
					if (this.anInt324 == -1) {
						this.method129();
						this.aString7 = "";
						this.aBoolean76 = false;
						for (@Pc(193) int local193 = 0; local193 < Class6.aClass6Array1.length; local193++) {
							if (Class6.aClass6Array1[local193] != null && Class6.aClass6Array1[local193].anInt408 == 600) {
								this.anInt221 = this.anInt324 = Class6.aClass6Array1[local193].anInt405;
								return;
							}
						}
						return;
					}
					this.method221("Please close the interface you have open before using 'report abuse'", 0, "");
					return;
				}
			}
		} catch (@Pc(229) RuntimeException local229) {
			signlink.reporterror("33844, " + 1 + ", " + local229.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILclient!lb;ILclient!ab;I)V")
	private void method107(@OriginalArg(1) Class1_Sub1_Sub3 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class1_Sub1_Sub1_Sub1_Sub1 arg2, @OriginalArg(4) int arg3) {
		try {
			@Pc(17) int local17;
			if ((arg3 & 0x1) == 1) {
				local17 = arg0.method480();
				@Pc(20) byte[] local20 = new byte[local17];
				@Pc(26) Class1_Sub1_Sub3 local26 = new Class1_Sub1_Sub3(local20, (byte) -93);
				arg0.method489(local20, local17);
				this.aClass1_Sub1_Sub3Array1[arg1] = local26;
				arg2.method39(local26);
			}
			@Pc(64) int local64;
			@Pc(76) int local76;
			if ((arg3 & 0x2) == 2) {
				local17 = arg0.method482();
				if (local17 == 65535) {
					local17 = -1;
				}
				if (local17 == arg2.anInt985) {
					arg2.anInt989 = 0;
				}
				local64 = arg0.method480();
				if (local17 == arg2.anInt985 && local17 != -1) {
					local76 = Class27.aClass27Array1[local17].anInt779;
					if (local76 == 1) {
						arg2.anInt986 = 0;
						arg2.anInt987 = 0;
						arg2.anInt988 = local64;
						arg2.anInt989 = 0;
					}
					if (local76 == 2) {
						arg2.anInt989 = 0;
					}
				} else if (local17 == -1 || arg2.anInt985 == -1 || Class27.aClass27Array1[local17].anInt773 >= Class27.aClass27Array1[arg2.anInt985].anInt773) {
					arg2.anInt985 = local17;
					arg2.anInt986 = 0;
					arg2.anInt987 = 0;
					arg2.anInt988 = local64;
					arg2.anInt989 = 0;
					arg2.anInt1008 = arg2.anInt1006;
				}
			}
			if ((arg3 & 0x4) == 4) {
				arg2.anInt979 = arg0.method482();
				if (arg2.anInt979 == 65535) {
					arg2.anInt979 = -1;
				}
			}
			if ((arg3 & 0x8) == 8) {
				arg2.aString31 = arg0.method487();
				if (arg2.aString31.charAt(0) == '~') {
					arg2.aString31 = arg2.aString31.substring(1);
					this.method221(arg2.aString31, 2, arg2.aString3);
				} else if (arg2 == aClass1_Sub1_Sub1_Sub1_Sub1_1) {
					this.method221(arg2.aString31, 2, arg2.aString3);
				}
				arg2.anInt974 = 0;
				arg2.anInt975 = 0;
				arg2.anInt973 = 150;
			}
			if ((arg3 & 0x10) == 16) {
				local17 = arg0.method480();
				local64 = arg0.method480();
				arg2.method681(local17, anInt239, local64);
				arg2.anInt976 = anInt239 + 300;
				arg2.anInt977 = arg0.method480();
				arg2.anInt978 = arg0.method480();
			}
			if ((arg3 & 0x20) == 32) {
				arg2.anInt980 = arg0.method482();
				arg2.anInt981 = arg0.method482();
			}
			if ((arg3 & 0x40) == 64) {
				local17 = arg0.method482();
				local64 = arg0.method480();
				local76 = arg0.method480();
				@Pc(262) int local262 = arg0.anInt720;
				if (arg2.aString3 != null && arg2.aBoolean31) {
					@Pc(272) long local272 = Class48.method667(arg2.aString3);
					@Pc(274) boolean local274 = false;
					if (local64 <= 1) {
						for (@Pc(279) int local279 = 0; local279 < this.anInt290; local279++) {
							if (this.aLongArray4[local279] == local272) {
								local274 = true;
								break;
							}
						}
					}
					if (!local274 && this.anInt278 == 0) {
						try {
							@Pc(308) String local308 = Class49.method683(local76, this.anInt293, arg0);
							@Pc(312) String local312 = Class42.method604(local308);
							arg2.aString31 = local312;
							arg2.anInt974 = local17 >> 8;
							arg2.anInt975 = local17 & 0xFF;
							arg2.anInt973 = 150;
							if (local64 == 2 || local64 == 3) {
								this.method221(local312, 1, "@cr2@" + arg2.aString3);
							} else if (local64 == 1) {
								this.method221(local312, 1, "@cr1@" + arg2.aString3);
							} else {
								this.method221(local312, 2, arg2.aString3);
							}
						} catch (@Pc(376) Exception local376) {
							signlink.reporterror("cde2");
						}
					}
				}
				arg0.anInt720 = local262 + local76;
			}
			if ((arg3 & 0x100) == 256) {
				arg2.anInt990 = arg0.method482();
				local17 = arg0.method485();
				arg2.anInt994 = local17 >> 16;
				arg2.anInt993 = anInt239 + (local17 & 0xFFFF);
				arg2.anInt991 = 0;
				arg2.anInt992 = 0;
				if (arg2.anInt993 > anInt239) {
					arg2.anInt991 = -1;
				}
				if (arg2.anInt990 == 65535) {
					arg2.anInt990 = -1;
				}
			}
			if ((arg3 & 0x200) == 512) {
				arg2.anInt995 = arg0.method480();
				arg2.anInt997 = arg0.method480();
				arg2.anInt996 = arg0.method480();
				arg2.anInt998 = arg0.method480();
				arg2.anInt999 = arg0.method482() + anInt239;
				arg2.anInt1000 = arg0.method482() + anInt239;
				arg2.anInt1001 = arg0.method480();
				arg2.method679();
			}
			if ((arg3 & 0x400) == 1024) {
				local17 = arg0.method480();
				local64 = arg0.method480();
				arg2.method681(local17, anInt239, local64);
				arg2.anInt976 = anInt239 + 300;
				arg2.anInt977 = arg0.method480();
				arg2.anInt978 = arg0.method480();
			}
		} catch (@Pc(500) RuntimeException local500) {
			signlink.reporterror("71138, " + -26 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local500.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILclient!ib;II)V")
	private void method108(@OriginalArg(1) Class1_Sub1_Sub2_Sub2 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		try {
			@Pc(7) int local7 = this.anInt391 + this.anInt310 & 0x7FF;
			this.anInt222 += 0;
			@Pc(21) int local21 = arg2 * arg2 + arg1 * arg1;
			if (local21 <= 6400) {
				@Pc(29) int local29 = Class1_Sub1_Sub1_Sub5.anIntArray151[local7];
				@Pc(33) int local33 = Class1_Sub1_Sub1_Sub5.anIntArray152[local7];
				@Pc(42) int local42 = local29 * 256 / (this.anInt261 + 256);
				@Pc(51) int local51 = local33 * 256 / (this.anInt261 + 256);
				@Pc(61) int local61 = arg1 * local42 + arg2 * local51 >> 16;
				@Pc(71) int local71 = arg1 * local51 - arg2 * local42 >> 16;
				if (local21 > 2500) {
					arg0.method397(local61 + 94 + 4 - arg0.anInt631 / 2, 83 - local71 - arg0.anInt632 / 2 - 4, this.aClass1_Sub1_Sub2_Sub3_2);
				} else {
					arg0.method391(local61 + 94 + 4 - arg0.anInt631 / 2, 83 - local71 - arg0.anInt632 / 2 - 4);
				}
			}
		} catch (@Pc(125) RuntimeException local125) {
			signlink.reporterror("21956, " + 0 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local125.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!d;I)Z")
	private boolean method109(@OriginalArg(0) Class6 arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(4) int local4 = arg0.anInt408;
			@Pc(8) boolean local8 = false;
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
				this.aStringArray1[this.anInt353] = "Remove @whi@" + this.aStringArray2[local4];
				this.anIntArray34[this.anInt353] = 513;
				this.anInt353++;
				this.aStringArray1[this.anInt353] = "Message @whi@" + this.aStringArray2[local4];
				this.anIntArray34[this.anInt353] = 902;
				this.anInt353++;
				return true;
			} else if (local4 >= 401 && local4 <= 500) {
				this.aStringArray1[this.anInt353] = "Remove @whi@" + arg0.aString18;
				this.anIntArray34[this.anInt353] = 884;
				this.anInt353++;
				return true;
			} else {
				return false;
			}
		} catch (@Pc(131) RuntimeException local131) {
			signlink.reporterror("16198, " + arg0 + ", " + arg1 + ", " + local131.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!ib;IIZ)V")
	private void method110(@OriginalArg(0) Class1_Sub1_Sub2_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		try {
			@Pc(12) int local12 = arg1 * arg1 + arg2 * arg2;
			if (local12 > 4225 && local12 < 90000) {
				@Pc(26) int local26 = this.anInt391 + this.anInt310 & 0x7FF;
				@Pc(30) int local30 = Class1_Sub1_Sub1_Sub5.anIntArray151[local26];
				@Pc(34) int local34 = Class1_Sub1_Sub1_Sub5.anIntArray152[local26];
				@Pc(43) int local43 = local30 * 256 / (this.anInt261 + 256);
				@Pc(52) int local52 = local34 * 256 / (this.anInt261 + 256);
				@Pc(62) int local62 = arg2 * local43 + arg1 * local52 >> 16;
				@Pc(72) int local72 = arg2 * local52 - arg1 * local43 >> 16;
				@Pc(78) double local78 = Math.atan2((double) local62, (double) local72);
				@Pc(84) int local84 = (int) (Math.sin(local78) * 63.0D);
				@Pc(90) int local90 = (int) (Math.cos(local78) * 57.0D);
				this.aClass1_Sub1_Sub2_Sub2_8.method396(local78, local84 + 94 + 4 - 10, 83 - local90 - 20);
			} else {
				this.method108(arg0, arg2, arg1);
			}
		} catch (@Pc(121) RuntimeException local121) {
			signlink.reporterror("32223, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + false + ", " + local121.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "h", descriptor = "(I)V")
	private void method111() {
		try {
			if (this.anInt359 != 0) {
				@Pc(10) Class1_Sub1_Sub2_Sub4 local10 = this.aClass1_Sub1_Sub2_Sub4_2;
				@Pc(12) int local12 = 0;
				if (this.anInt277 != 0) {
					local12 = 1;
				}
				for (@Pc(19) int local19 = 0; local19 < 100; local19++) {
					if (this.aStringArray4[local19] != null) {
						@Pc(31) int local31 = this.anIntArray66[local19];
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
						if ((local31 == 3 || local31 == 7) && (local31 == 7 || this.anInt264 == 0 || this.anInt264 == 1 && this.method225(local36))) {
							local89 = 329 - local12 * 13;
							local10.method451("From", local89, 4, 0);
							local10.method451("From", local89 - 1, 4, 65535);
							@Pc(114) int local114 = local10.method449("From ") + 4;
							if (local38 == 1) {
								this.aClass1_Sub1_Sub2_Sub3Array4[0].method418(local114, local89 - 12);
								local114 += 14;
							}
							if (local38 == 2) {
								this.aClass1_Sub1_Sub2_Sub3Array4[1].method418(local114, local89 - 12);
								local114 += 14;
							}
							local10.method451(local36 + ": " + this.aStringArray4[local19], local89, local114, 0);
							local10.method451(local36 + ": " + this.aStringArray4[local19], local89 - 1, local114, 65535);
							local12++;
							if (local12 >= 5) {
								return;
							}
						}
						if (local31 == 5 && this.anInt264 < 2) {
							local89 = 329 - local12 * 13;
							local10.method451(this.aStringArray4[local19], local89, 4, 0);
							local10.method451(this.aStringArray4[local19], local89 - 1, 4, 65535);
							local12++;
							if (local12 >= 5) {
								return;
							}
						}
						if (local31 == 6 && this.anInt264 < 2) {
							local89 = 329 - local12 * 13;
							local10.method451("To " + local36 + ": " + this.aStringArray4[local19], local89, 4, 0);
							local10.method451("To " + local36 + ": " + this.aStringArray4[local19], local89 - 1, 4, 65535);
							local12++;
							if (local12 >= 5) {
								return;
							}
						}
					}
				}
			}
		} catch (@Pc(293) RuntimeException local293) {
			signlink.reporterror("79270, " + -7957 + ", " + local293.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(Z)V")
	private void method112() {
		try {
			if (this.anInt233 == 0) {
				this.aStringArray1[0] = "Cancel";
				this.anIntArray34[0] = 1106;
				this.anInt353 = 1;
				this.method152();
				this.anInt195 = 0;
				if (super.anInt182 > 4 && super.anInt183 > 4 && super.anInt182 < 516 && super.anInt183 < 338) {
					if (this.anInt324 == -1) {
						this.method128();
					} else {
						this.method162(4, Class6.aClass6Array1[this.anInt324], super.anInt183, 0, 4, super.anInt182);
					}
				}
				if (this.anInt195 != this.anInt326) {
					this.anInt326 = this.anInt195;
				}
				this.anInt195 = 0;
				if (super.anInt182 > 553 && super.anInt183 > 205 && super.anInt182 < 743 && super.anInt183 < 466) {
					if (this.anInt245 != -1) {
						this.method162(553, Class6.aClass6Array1[this.anInt245], super.anInt183, 0, 205, super.anInt182);
					} else if (this.anIntArray81[this.anInt270] != -1) {
						this.method162(553, Class6.aClass6Array1[this.anIntArray81[this.anInt270]], super.anInt183, 0, 205, super.anInt182);
					}
				}
				if (this.anInt195 != this.anInt272) {
					this.aBoolean73 = true;
					this.anInt272 = this.anInt195;
				}
				this.anInt195 = 0;
				if (super.anInt182 > 17 && super.anInt183 > 357 && super.anInt182 < 496 && super.anInt183 < 453) {
					if (this.anInt197 != -1) {
						this.method162(17, Class6.aClass6Array1[this.anInt197], super.anInt183, 0, 357, super.anInt182);
					} else if (super.anInt183 < 434 && super.anInt182 < 426) {
						this.method120(super.anInt183 - 357, super.anInt182 - 17);
					}
				}
				if (this.anInt197 != -1 && this.anInt195 != this.anInt388) {
					this.aBoolean88 = true;
					this.anInt388 = this.anInt195;
				}
				@Pc(229) boolean local229 = false;
				while (!local229) {
					local229 = true;
					for (@Pc(235) int local235 = 0; local235 < this.anInt353 - 1; local235++) {
						if (this.anIntArray34[local235] < 1000 && this.anIntArray34[local235 + 1] > 1000) {
							@Pc(256) String local256 = this.aStringArray1[local235];
							this.aStringArray1[local235] = this.aStringArray1[local235 + 1];
							this.aStringArray1[local235 + 1] = local256;
							@Pc(278) int local278 = this.anIntArray34[local235];
							this.anIntArray34[local235] = this.anIntArray34[local235 + 1];
							this.anIntArray34[local235 + 1] = local278;
							@Pc(300) int local300 = this.anIntArray32[local235];
							this.anIntArray32[local235] = this.anIntArray32[local235 + 1];
							this.anIntArray32[local235 + 1] = local300;
							@Pc(322) int local322 = this.anIntArray33[local235];
							this.anIntArray33[local235] = this.anIntArray33[local235 + 1];
							this.anIntArray33[local235 + 1] = local322;
							@Pc(344) int local344 = this.anIntArray35[local235];
							this.anIntArray35[local235] = this.anIntArray35[local235 + 1];
							this.anIntArray35[local235 + 1] = local344;
							local229 = false;
						}
					}
				}
			}
		} catch (@Pc(374) RuntimeException local374) {
			signlink.reporterror("23054, " + false + ", " + local374.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "init", descriptor = "()V")
	@Override
	public void init() {
		anInt291 = Integer.parseInt(this.getParameter("nodeid"));
		anInt292 = Integer.parseInt(this.getParameter("portoff"));
		@Pc(15) String local15 = this.getParameter("lowmem");
		if (local15 != null && local15.equals("1")) {
			method121();
		} else {
			method217();
		}
		@Pc(31) String local31 = this.getParameter("free");
		if (local31 != null && local31.equals("1")) {
			aBoolean71 = false;
		} else {
			aBoolean71 = true;
		}
		this.method85(aBoolean68);
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(B)V")
	private void method113() {
		try {
			if (this.anInt226 > 0) {
				this.method230();
			} else {
				this.aClass35_5.method524(this.anInt198);
				this.aClass1_Sub1_Sub2_Sub4_2.method447("Connection lost", 144, 0, 257);
				this.aClass1_Sub1_Sub2_Sub4_2.method447("Connection lost", 143, 16777215, 256);
				this.aClass1_Sub1_Sub2_Sub4_2.method447("Please wait - attempting to reestablish", 159, 0, 257);
				this.aClass1_Sub1_Sub2_Sub4_2.method447("Please wait - attempting to reestablish", 158, 16777215, 256);
				this.aClass35_5.method525(4, super.aGraphics2, 4);
				this.anInt211 = 0;
				this.anInt201 = 0;
				@Pc(66) Class8 local66 = this.aClass8_1;
				this.aBoolean89 = false;
				this.anInt374 = 0;
				this.method140(this.aString12, this.aString13, true);
				if (!this.aBoolean89) {
					this.method230();
				}
				try {
					local66.method247();
				} catch (@Pc(89) Exception local89) {
				}
			}
		} catch (@Pc(91) RuntimeException local91) {
			signlink.reporterror("34933, " + 1 + ", " + local91.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIIII)V")
	private void method114(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		try {
			this.aClass1_Sub1_Sub2_Sub3_7.method418(arg1, arg4);
			this.aClass1_Sub1_Sub2_Sub3_8.method418(arg1, arg4 + arg2 - 16);
			Class1_Sub1_Sub2.method439(this.anInt321, arg2 - 32, arg4 + 16, 16, (byte) 5, arg1);
			@Pc(35) int local35 = (arg2 - 32) * arg2 / arg0;
			if (local35 < 8) {
				local35 = 8;
			}
			@Pc(52) int local52 = (arg2 - local35 - 32) * arg3 / (arg0 - arg2);
			Class1_Sub1_Sub2.method439(this.anInt301, local35, arg4 + local52 + 16, 16, (byte) 5, arg1);
			Class1_Sub1_Sub2.method444(arg4 + local52 + 16, this.anInt394, arg1, local35);
			Class1_Sub1_Sub2.method444(arg4 + local52 + 16, this.anInt394, arg1 + 1, local35);
			Class1_Sub1_Sub2.method442(this.anInt394, arg4 + local52 + 16, 16, arg1);
			Class1_Sub1_Sub2.method442(this.anInt394, arg4 + local52 + 17, 16, arg1);
			Class1_Sub1_Sub2.method444(arg4 + local52 + 16, this.anInt209, arg1 + 15, local35);
			Class1_Sub1_Sub2.method444(arg4 + local52 + 17, this.anInt209, arg1 + 14, local35 - 1);
			Class1_Sub1_Sub2.method442(this.anInt209, arg4 + local52 + local35 + 15, 16, arg1);
			Class1_Sub1_Sub2.method442(this.anInt209, arg4 + local52 + local35 + 14, 15, arg1 + 1);
		} catch (@Pc(173) RuntimeException local173) {
			signlink.reporterror("12731, " + arg0 + ", " + -784 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local173.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IBLjava/lang/String;)V")
	@Override
	protected void method96(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) String arg2) {
		try {
			this.anInt294 = arg0;
			this.aString15 = arg2;
			this.method117((byte) 3);
			if (this.aClass47_1 == null) {
				super.method96(arg0, (byte) 1, arg2);
			} else {
				this.aClass35_21.method524(this.anInt198);
				this.aClass1_Sub1_Sub2_Sub4_3.method447("RuneScape is loading - please wait...", 54, 16777215, 180);
				Class1_Sub1_Sub2.method440(28, 62, 34, 9179409, 304);
				Class1_Sub1_Sub2.method440(29, 63, 32, 0, 302);
				Class1_Sub1_Sub2.method439(9179409, 30, 64, arg0 * 3, (byte) 5, 30);
				Class1_Sub1_Sub2.method439(0, 30, 64, 300 - arg0 * 3, (byte) 5, arg0 * 3 + 30);
				this.aClass1_Sub1_Sub2_Sub4_3.method447(arg2, 85, 16777215, 180);
				this.aClass35_21.method525(202, super.aGraphics2, 171);
				if (this.aBoolean65) {
					this.aBoolean65 = false;
					if (!this.aBoolean81) {
						this.aClass35_22.method525(0, super.aGraphics2, 0);
						this.aClass35_23.method525(637, super.aGraphics2, 0);
					}
					this.aClass35_19.method525(128, super.aGraphics2, 0);
					this.aClass35_20.method525(202, super.aGraphics2, 371);
					this.aClass35_24.method525(0, super.aGraphics2, 265);
					this.aClass35_25.method525(562, super.aGraphics2, 265);
					this.aClass35_26.method525(128, super.aGraphics2, 171);
					this.aClass35_27.method525(562, super.aGraphics2, 171);
				}
			}
		} catch (@Pc(220) RuntimeException local220) {
			signlink.reporterror("75402, " + arg0 + ", " + 1 + ", " + arg2 + ", " + local220.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "i", descriptor = "(I)V")
	private void method115() {
		try {
			for (@Pc(9) int local9 = 0; local9 < this.anInt287; local9++) {
				if (this.anIntArray49[local9] <= 0) {
					@Pc(18) boolean local18 = false;
					try {
						if (this.anIntArray50[local9] != this.anInt228 || this.anIntArray43[local9] != this.anInt263) {
							@Pc(51) Class1_Sub1_Sub3 local51 = Class5.method79(this.anIntArray43[local9], this.anIntArray50[local9]);
							if (System.currentTimeMillis() + (long) (local51.anInt720 / 22) > this.aLong14 + (long) (this.anInt280 / 22)) {
								this.anInt280 = local51.anInt720;
								this.aLong14 = System.currentTimeMillis();
								if (this.method191(local51.aByteArray9, local51.anInt720)) {
									this.anInt228 = this.anIntArray50[local9];
									this.anInt263 = this.anIntArray43[local9];
								} else {
									local18 = true;
								}
							}
						} else if (!this.method131()) {
							local18 = true;
						}
					} catch (@Pc(101) Exception local101) {
					}
					if (local18 && this.anIntArray49[local9] != -5) {
						this.anIntArray49[local9] = -5;
					} else {
						this.anInt287--;
						for (@Pc(117) int local117 = local9; local117 < this.anInt287; local117++) {
							this.anIntArray50[local117] = this.anIntArray50[local117 + 1];
							this.anIntArray43[local117] = this.anIntArray43[local117 + 1];
							this.anIntArray49[local117] = this.anIntArray49[local117 + 1];
						}
						local9--;
					}
				} else {
					@Pc(169) int local169 = this.anIntArray49[local9]--;
				}
			}
			if (this.anInt238 > 0) {
				this.anInt238 -= 20;
				if (this.anInt238 < 0) {
					this.anInt238 = 0;
				}
				if (this.anInt238 == 0 && this.aBoolean90 && !aBoolean72) {
					this.anInt308 = this.anInt317;
					this.aBoolean75 = true;
					this.aClass44_Sub1_1.method645(2, this.anInt308);
					return;
				}
			}
		} catch (@Pc(215) RuntimeException local215) {
			signlink.reporterror("27751, " + 3 + ", " + local215.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(Z)V")
	private void method116() {
		try {
			@Pc(6) int local6 = 5;
			this.anIntArray85[8] = 0;
			@Pc(13) int local13 = 0;
			while (this.anIntArray85[8] == 0) {
				@Pc(17) String local17 = "Unknown problem";
				this.method96(20, (byte) 1, "Connecting to web server");
				try {
					@Pc(39) DataInputStream local39 = this.method163("crc" + (int) (Math.random() * 9.9999999E7D) + "-" + 298);
					@Pc(46) Class1_Sub1_Sub3 local46 = new Class1_Sub1_Sub3(new byte[40], (byte) -93);
					local39.readFully(local46.aByteArray9, 0, 40);
					local39.close();
					for (@Pc(56) int local56 = 0; local56 < 9; local56++) {
						this.anIntArray85[local56] = local46.method485();
					}
					@Pc(71) int local71 = local46.method485();
					@Pc(73) int local73 = 1234;
					for (@Pc(75) int local75 = 0; local75 < 9; local75++) {
						local73 = (local73 << 1) + this.anIntArray85[local75];
					}
					if (local71 != local73) {
						local17 = "checksum problem";
						this.anIntArray85[8] = 0;
					}
				} catch (@Pc(102) EOFException local102) {
					local17 = "EOF problem";
					this.anIntArray85[8] = 0;
				} catch (@Pc(111) IOException local111) {
					local17 = "connection problem";
					this.anIntArray85[8] = 0;
				} catch (@Pc(120) Exception local120) {
					local17 = "logic problem";
					this.anIntArray85[8] = 0;
					if (!signlink.reporterror) {
						return;
					}
				}
				if (this.anIntArray85[8] == 0) {
					local13++;
					for (@Pc(138) int local138 = local6; local138 > 0; local138--) {
						if (local13 >= 10) {
							this.method96(10, (byte) 1, "Game updated - please reload page");
							local138 = 10;
						} else {
							this.method96(10, (byte) 1, local17 + " - Will retry in " + local138 + " secs.");
						}
						try {
							Thread.sleep(1000L);
						} catch (@Pc(172) Exception local172) {
						}
					}
					local6 *= 2;
					if (local6 > 60) {
						local6 = 60;
					}
					this.aBoolean85 = !this.aBoolean85;
				}
			}
		} catch (@Pc(200) RuntimeException local200) {
			signlink.reporterror("46349, " + false + ", " + local200.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(B)V")
	private void method117(@OriginalArg(0) byte arg0) {
		try {
			if (this.aClass35_19 == null) {
				super.aClass35_2 = null;
				this.aClass35_6 = null;
				this.aClass35_4 = null;
				this.aClass35_3 = null;
				this.aClass35_5 = null;
				this.aClass35_16 = null;
				this.aClass35_17 = null;
				this.aClass35_18 = null;
				this.aClass35_22 = new Class35(this.method94(), 0, 265, 128);
				Class1_Sub1_Sub2.method437();
				@Pc(45) boolean local45 = false;
				this.aClass35_23 = new Class35(this.method94(), 0, 265, 128);
				Class1_Sub1_Sub2.method437();
				this.aClass35_19 = new Class35(this.method94(), 0, 171, 509);
				Class1_Sub1_Sub2.method437();
				this.aClass35_20 = new Class35(this.method94(), 0, 132, 360);
				Class1_Sub1_Sub2.method437();
				this.aClass35_21 = new Class35(this.method94(), 0, 200, 360);
				Class1_Sub1_Sub2.method437();
				this.aClass35_24 = new Class35(this.method94(), 0, 238, 202);
				Class1_Sub1_Sub2.method437();
				this.aClass35_25 = new Class35(this.method94(), 0, 238, 203);
				Class1_Sub1_Sub2.method437();
				this.aClass35_26 = new Class35(this.method94(), 0, 94, 74);
				Class1_Sub1_Sub2.method437();
				this.aClass35_27 = new Class35(this.method94(), 0, 94, 75);
				Class1_Sub1_Sub2.method437();
				if (this.aClass47_1 != null) {
					this.method180();
					this.method187(anInt380);
				}
				this.aBoolean65 = true;
			}
		} catch (@Pc(168) RuntimeException local168) {
			signlink.reporterror("38583, " + arg0 + ", " + local168.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "j", descriptor = "(I)V")
	private void method118() {
		try {
			if (this.anInt211 == 0 && super.anInt187 == 1) {
				@Pc(22) int local22 = super.anInt188 - 25 - 550;
				@Pc(29) int local29 = super.anInt189 - 5 - 4;
				if (local22 >= 0 && local29 >= 0 && local22 < 146 && local29 < 151) {
					local22 -= 73;
					local29 -= 75;
					@Pc(49) int local49 = this.anInt391 + this.anInt310 & 0x7FF;
					@Pc(53) int local53 = Class1_Sub1_Sub2_Sub1.anIntArray178[local49];
					@Pc(57) int local57 = Class1_Sub1_Sub2_Sub1.anIntArray179[local49];
					@Pc(66) int local66 = local53 * (this.anInt261 + 256) >> 8;
					@Pc(75) int local75 = local57 * (this.anInt261 + 256) >> 8;
					@Pc(85) int local85 = local29 * local66 + local22 * local75 >> 11;
					@Pc(95) int local95 = local29 * local75 - local22 * local66 >> 11;
					@Pc(102) int local102 = aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt962 + local85 >> 7;
					@Pc(109) int local109 = aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt963 - local95 >> 7;
					@Pc(130) boolean local130 = this.method156(aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray273[0], aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray272[0], 0, local102, local109, 0, true, 0, 0, (byte) 4, 1, 0);
					if (local130) {
						this.aClass1_Sub1_Sub3_3.method470(local22);
						this.aClass1_Sub1_Sub3_3.method470(local29);
						this.aClass1_Sub1_Sub3_3.method471(this.anInt391);
						this.aClass1_Sub1_Sub3_3.method470(57);
						this.aClass1_Sub1_Sub3_3.method470(this.anInt310);
						this.aClass1_Sub1_Sub3_3.method470(this.anInt261);
						this.aClass1_Sub1_Sub3_3.method470(89);
						this.aClass1_Sub1_Sub3_3.method471(aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt962);
						this.aClass1_Sub1_Sub3_3.method471(aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt963);
						this.aClass1_Sub1_Sub3_3.method470(this.anInt368);
						this.aClass1_Sub1_Sub3_3.method470(63);
						return;
					}
				}
			}
		} catch (@Pc(184) RuntimeException local184) {
			signlink.reporterror("16624, " + 25451 + ", " + local184.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(III)V")
	private void method120(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(1) int local1 = 0;
			this.anInt222 += 0;
			for (@Pc(9) int local9 = 0; local9 < 100; local9++) {
				if (this.aStringArray4[local9] != null) {
					@Pc(21) int local21 = this.anIntArray66[local9];
					@Pc(32) int local32 = this.anInt295 + 70 + 4 - local1 * 14;
					if (local32 < -20) {
						break;
					}
					@Pc(40) String local40 = this.aStringArray3[local9];
					if (local40 != null && local40.startsWith("@cr1@")) {
						local40 = local40.substring(5);
					}
					if (local40 != null && local40.startsWith("@cr2@")) {
						local40 = local40.substring(5);
					}
					if (local21 == 0) {
						local1++;
					}
					if ((local21 == 1 || local21 == 2) && (local21 == 1 || this.anInt230 == 0 || this.anInt230 == 1 && this.method225(local40))) {
						if (arg0 > local32 - 14 && arg0 <= local32 && !local40.equals(aClass1_Sub1_Sub1_Sub1_Sub1_1.aString3)) {
							if (this.anInt316 >= 1) {
								this.aStringArray1[this.anInt353] = "Report abuse @whi@" + local40;
								this.anIntArray34[this.anInt353] = 524;
								this.anInt353++;
							}
							this.aStringArray1[this.anInt353] = "Add ignore @whi@" + local40;
							this.anIntArray34[this.anInt353] = 47;
							this.anInt353++;
							this.aStringArray1[this.anInt353] = "Add friend @whi@" + local40;
							this.anIntArray34[this.anInt353] = 605;
							this.anInt353++;
						}
						local1++;
					}
					if ((local21 == 3 || local21 == 7) && this.anInt359 == 0 && (local21 == 7 || this.anInt264 == 0 || this.anInt264 == 1 && this.method225(local40))) {
						if (arg0 > local32 - 14 && arg0 <= local32) {
							if (this.anInt316 >= 1) {
								this.aStringArray1[this.anInt353] = "Report abuse @whi@" + local40;
								this.anIntArray34[this.anInt353] = 524;
								this.anInt353++;
							}
							this.aStringArray1[this.anInt353] = "Add ignore @whi@" + local40;
							this.anIntArray34[this.anInt353] = 47;
							this.anInt353++;
							this.aStringArray1[this.anInt353] = "Add friend @whi@" + local40;
							this.anIntArray34[this.anInt353] = 605;
							this.anInt353++;
						}
						local1++;
					}
					if (local21 == 4 && (this.anInt193 == 0 || this.anInt193 == 1 && this.method225(local40))) {
						if (arg0 > local32 - 14 && arg0 <= local32) {
							this.aStringArray1[this.anInt353] = "Accept trade @whi@" + local40;
							this.anIntArray34[this.anInt353] = 507;
							this.anInt353++;
						}
						local1++;
					}
					if ((local21 == 5 || local21 == 6) && this.anInt359 == 0 && this.anInt264 < 2) {
						local1++;
					}
					if (local21 == 8 && (this.anInt193 == 0 || this.anInt193 == 1 && this.method225(local40))) {
						if (arg0 > local32 - 14 && arg0 <= local32) {
							this.aStringArray1[this.anInt353] = "Accept challenge @whi@" + local40;
							this.anIntArray34[this.anInt353] = 957;
							this.anInt353++;
						}
						local1++;
					}
				}
			}
		} catch (@Pc(405) RuntimeException local405) {
			signlink.reporterror("34450, " + arg0 + ", " + arg1 + ", " + 0 + ", " + local405.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "k", descriptor = "(I)V")
	private void method122() {
		try {
			if (this.anInt233 == 0) {
				@Pc(15) int local15 = super.anInt187;
				if (this.anInt297 == 1 && super.anInt188 >= 516 && super.anInt189 >= 160 && super.anInt188 <= 765 && super.anInt189 <= 205) {
					local15 = 0;
				}
				@Pc(46) int local46;
				@Pc(49) int local49;
				@Pc(125) int local125;
				if (this.aBoolean87) {
					if (local15 != 1) {
						local46 = super.anInt182;
						local49 = super.anInt183;
						if (this.anInt252 == 0) {
							local46 -= 4;
							local49 -= 4;
						}
						if (this.anInt252 == 1) {
							local46 -= 553;
							local49 -= 205;
						}
						if (this.anInt252 == 2) {
							local46 -= 17;
							local49 -= 357;
						}
						if (local46 < this.anInt253 - 10 || local46 > this.anInt253 + this.anInt255 + 10 || local49 < this.anInt254 - 10 || local49 > this.anInt254 + this.anInt256 + 10) {
							this.aBoolean87 = false;
							if (this.anInt252 == 1) {
								this.aBoolean73 = true;
							}
							if (this.anInt252 == 2) {
								this.aBoolean88 = true;
							}
						}
					}
					if (local15 == 1) {
						local46 = this.anInt253;
						local49 = this.anInt254;
						local125 = this.anInt255;
						@Pc(128) int local128 = super.anInt188;
						@Pc(131) int local131 = super.anInt189;
						if (this.anInt252 == 0) {
							local128 -= 4;
							local131 -= 4;
						}
						if (this.anInt252 == 1) {
							local128 -= 553;
							local131 -= 205;
						}
						if (this.anInt252 == 2) {
							local128 -= 17;
							local131 -= 357;
						}
						@Pc(150) int local150 = -1;
						for (@Pc(152) int local152 = 0; local152 < this.anInt353; local152++) {
							@Pc(167) int local167 = local49 + (this.anInt353 - 1 - local152) * 15 + 31;
							if (local128 > local46 && local128 < local46 + local125 && local131 > local167 - 13 && local131 < local167 + 3) {
								local150 = local152;
							}
						}
						if (local150 != -1) {
							this.method223(local150);
						}
						this.aBoolean87 = false;
						if (this.anInt252 == 1) {
							this.aBoolean73 = true;
						}
						if (this.anInt252 == 2) {
							this.aBoolean88 = true;
							return;
						}
					}
				} else {
					if (local15 == 1 && this.anInt353 > 0) {
						local46 = this.anIntArray34[this.anInt353 - 1];
						if (local46 == 582 || local46 == 113 || local46 == 555 || local46 == 331 || local46 == 354 || local46 == 694 || local46 == 962 || local46 == 795 || local46 == 681 || local46 == 100 || local46 == 102 || local46 == 1328) {
							local49 = this.anIntArray32[this.anInt353 - 1];
							local125 = this.anIntArray33[this.anInt353 - 1];
							@Pc(287) Class6 local287 = Class6.aClass6Array1[local125];
							if (local287.aBoolean99 || local287.aBoolean102) {
								this.aBoolean61 = false;
								this.anInt220 = 0;
								this.anInt231 = local125;
								this.anInt232 = local49;
								this.anInt233 = 2;
								this.anInt234 = super.anInt188;
								this.anInt235 = super.anInt189;
								if (Class6.aClass6Array1[local125].anInt405 == this.anInt324) {
									this.anInt233 = 1;
								}
								if (Class6.aClass6Array1[local125].anInt405 == this.anInt197) {
									this.anInt233 = 3;
								}
								return;
							}
						}
					}
					if (local15 == 1 && (this.anInt219 == 1 || this.method164(this.anInt353 - 1)) && this.anInt353 > 2) {
						local15 = 2;
					}
					if (local15 == 1 && this.anInt353 > 0) {
						this.method223(this.anInt353 - 1);
					}
					if (local15 != 2 || this.anInt353 <= 0) {
						return;
					}
					this.method148();
				}
			}
		} catch (@Pc(382) RuntimeException local382) {
			signlink.reporterror("64425, " + 5 + ", " + local382.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ZJ)V")
	private void method123(@OriginalArg(1) long arg0) {
		try {
			if (arg0 != 0L) {
				if (this.anInt350 >= 100 && this.anInt327 != 1) {
					this.method221("Your friendlist is full. Max of 100 for free users, and 200 for members", 0, "");
				} else if (this.anInt350 >= 200) {
					this.method221("Your friendlist is full. Max of 100 for free users, and 200 for members", 0, "");
				} else {
					@Pc(43) String local43 = Class48.method671(Class48.method668(arg0));
					for (@Pc(45) int local45 = 0; local45 < this.anInt350; local45++) {
						if (this.aLongArray3[local45] == arg0) {
							this.method221(local43 + " is already on your friend list", 0, "");
							return;
						}
					}
					for (@Pc(75) int local75 = 0; local75 < this.anInt290; local75++) {
						if (this.aLongArray4[local75] == arg0) {
							this.method221("Please remove " + local43 + " from your ignore list first", 0, "");
							return;
						}
					}
					if (!local43.equals(aClass1_Sub1_Sub1_Sub1_Sub1_1.aString3)) {
						this.aStringArray2[this.anInt350] = local43;
						this.aLongArray3[this.anInt350] = arg0;
						this.anIntArray48[this.anInt350] = 0;
						this.anInt350++;
						this.aBoolean73 = true;
						this.aClass1_Sub1_Sub3_3.method469(221);
						this.aClass1_Sub1_Sub3_3.method476(arg0, (byte) 3);
					}
				}
			}
		} catch (@Pc(149) RuntimeException local149) {
			signlink.reporterror("2691, " + false + ", " + arg0 + ", " + local149.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(B)V")
	private void method124() {
		try {
			this.aClass35_6.method524(this.anInt198);
			Class1_Sub1_Sub2_Sub1.anIntArray180 = this.anIntArray82;
			this.aClass1_Sub1_Sub2_Sub3_3.method418(0, 0);
			if (this.aBoolean69) {
				this.aClass1_Sub1_Sub2_Sub4_3.method447(this.aString14, 40, 0, 239);
				this.aClass1_Sub1_Sub2_Sub4_3.method447(this.aString16 + "*", 60, 128, 239);
			} else if (this.aBoolean79) {
				this.aClass1_Sub1_Sub2_Sub4_3.method447("Enter amount:", 40, 0, 239);
				this.aClass1_Sub1_Sub2_Sub4_3.method447(this.aString6 + "*", 60, 128, 239);
			} else if (this.aString5 != null) {
				this.aClass1_Sub1_Sub2_Sub4_3.method447(this.aString5, 40, 0, 239);
				this.aClass1_Sub1_Sub2_Sub4_3.method447("Click to continue", 60, 128, 239);
			} else if (this.anInt197 != -1) {
				this.method190(0, 0, Class6.aClass6Array1[this.anInt197], 0);
			} else if (this.anInt314 == -1) {
				@Pc(137) Class1_Sub1_Sub2_Sub4 local137 = this.aClass1_Sub1_Sub2_Sub4_2;
				@Pc(139) int local139 = 0;
				Class1_Sub1_Sub2.method436(0, 0, 463, 77);
				for (@Pc(147) int local147 = 0; local147 < 100; local147++) {
					if (this.aStringArray4[local147] != null) {
						@Pc(159) int local159 = this.anIntArray66[local147];
						@Pc(168) int local168 = this.anInt295 + 70 - local139 * 14;
						@Pc(173) String local173 = this.aStringArray3[local147];
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
								local137.method451(this.aStringArray4[local147], local168, 4, 0);
							}
							local139++;
						}
						@Pc(245) int local245;
						if ((local159 == 1 || local159 == 2) && (local159 == 1 || this.anInt230 == 0 || this.anInt230 == 1 && this.method225(local173))) {
							if (local168 > 0 && local168 < 110) {
								local245 = 4;
								if (local175 == 1) {
									this.aClass1_Sub1_Sub2_Sub3Array4[0].method418(4, local168 - 12);
									local245 += 14;
								}
								if (local175 == 2) {
									this.aClass1_Sub1_Sub2_Sub3Array4[1].method418(local245, local168 - 12);
									local245 += 14;
								}
								local137.method451(local173 + ":", local168, local245, 0);
								local245 += local137.method449(local173) + 8;
								local137.method451(this.aStringArray4[local147], local168, local245, 255);
							}
							local139++;
						}
						if ((local159 == 3 || local159 == 7) && this.anInt359 == 0 && (local159 == 7 || this.anInt264 == 0 || this.anInt264 == 1 && this.method225(local173))) {
							if (local168 > 0 && local168 < 110) {
								local137.method451("From", local168, 4, 0);
								local245 = local137.method449("From ") + 4;
								if (local175 == 1) {
									this.aClass1_Sub1_Sub2_Sub3Array4[0].method418(local245, local168 - 12);
									local245 += 14;
								}
								if (local175 == 2) {
									this.aClass1_Sub1_Sub2_Sub3Array4[1].method418(local245, local168 - 12);
									local245 += 14;
								}
								local137.method451(local173 + ":", local168, local245, 0);
								local245 += local137.method449(local173) + 8;
								local137.method451(this.aStringArray4[local147], local168, local245, 8388608);
							}
							local139++;
						}
						if (local159 == 4 && (this.anInt193 == 0 || this.anInt193 == 1 && this.method225(local173))) {
							if (local168 > 0 && local168 < 110) {
								local137.method451(local173 + " " + this.aStringArray4[local147], local168, 4, 8388736);
							}
							local139++;
						}
						if (local159 == 5 && this.anInt359 == 0 && this.anInt264 < 2) {
							if (local168 > 0 && local168 < 110) {
								local137.method451(this.aStringArray4[local147], local168, 4, 8388608);
							}
							local139++;
						}
						if (local159 == 6 && this.anInt359 == 0 && this.anInt264 < 2) {
							if (local168 > 0 && local168 < 110) {
								local137.method451("To " + local173 + ":", local168, 4, 0);
								local137.method451(this.aStringArray4[local147], local168, local137.method449("To " + local173) + 12, 8388608);
							}
							local139++;
						}
						if (local159 == 8 && (this.anInt193 == 0 || this.anInt193 == 1 && this.method225(local173))) {
							if (local168 > 0 && local168 < 110) {
								local137.method451(local173 + " " + this.aStringArray4[local147], local168, 4, 8270336);
							}
							local139++;
						}
					}
				}
				Class1_Sub1_Sub2.method435();
				this.anInt369 = local139 * 14 + 7;
				if (this.anInt369 < 78) {
					this.anInt369 = 78;
				}
				this.method114(this.anInt369, 463, 77, this.anInt369 - this.anInt295 - 77, 0);
				@Pc(615) String local615;
				if (aClass1_Sub1_Sub1_Sub1_Sub1_1 == null || aClass1_Sub1_Sub1_Sub1_Sub1_1.aString3 == null) {
					local615 = Class48.method671(this.aString12);
				} else {
					local615 = aClass1_Sub1_Sub1_Sub1_Sub1_1.aString3;
				}
				local137.method451(local615 + ":", 90, 4, 0);
				local137.method451(this.aString4 + "*", 90, local137.method449(local615 + ": ") + 6, 255);
				Class1_Sub1_Sub2.method442(0, 77, 479, 0);
			} else {
				this.method190(0, 0, Class6.aClass6Array1[this.anInt314], 0);
			}
			if (this.aBoolean87 && this.anInt252 == 2) {
				this.method174();
			}
			this.aClass35_6.method525(17, super.aGraphics2, 357);
			this.aClass35_5.method524(this.anInt198);
			Class1_Sub1_Sub2_Sub1.anIntArray180 = this.anIntArray84;
		} catch (@Pc(697) RuntimeException local697) {
			signlink.reporterror("749, " + 40 + ", " + local697.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!lb;II)V")
	private void method125(@OriginalArg(0) Class1_Sub1_Sub3 arg0, @OriginalArg(2) int arg1) {
		try {
			@Pc(12) int local12 = arg0.method491(8);
			@Pc(18) int local18;
			if (local12 < this.anInt242) {
				for (local18 = local12; local18 < this.anInt242; local18++) {
					this.anIntArray53[this.anInt271++] = this.anIntArray46[local18];
				}
			}
			if (local12 > this.anInt242) {
				signlink.reporterror(this.aString12 + " Too many players");
				throw new RuntimeException("eek");
			}
			this.anInt242 = 0;
			for (local18 = 0; local18 < local12; local18++) {
				@Pc(70) int local70 = this.anIntArray46[local18];
				@Pc(75) Class1_Sub1_Sub1_Sub1_Sub1 local75 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local70];
				@Pc(80) int local80 = arg0.method491(1);
				if (local80 == 0) {
					this.anIntArray46[this.anInt242++] = local70;
					local75.anInt1002 = anInt239;
				} else {
					@Pc(103) int local103 = arg0.method491(2);
					if (local103 == 0) {
						this.anIntArray46[this.anInt242++] = local70;
						local75.anInt1002 = anInt239;
						this.anIntArray47[this.anInt243++] = local70;
					} else {
						@Pc(154) int local154;
						@Pc(164) int local164;
						if (local103 == 1) {
							this.anIntArray46[this.anInt242++] = local70;
							local75.anInt1002 = anInt239;
							local154 = arg0.method491(3);
							local75.method678(local154, false);
							local164 = arg0.method491(1);
							if (local164 == 1) {
								this.anIntArray47[this.anInt243++] = local70;
							}
						} else if (local103 == 2) {
							this.anIntArray46[this.anInt242++] = local70;
							local75.anInt1002 = anInt239;
							local154 = arg0.method491(3);
							local75.method678(local154, true);
							local164 = arg0.method491(3);
							local75.method678(local164, true);
							@Pc(222) int local222 = arg0.method491(1);
							if (local222 == 1) {
								this.anIntArray47[this.anInt243++] = local70;
							}
						} else if (local103 == 3) {
							this.anIntArray53[this.anInt271++] = local70;
						}
					}
				}
			}
		} catch (@Pc(259) RuntimeException local259) {
			signlink.reporterror("94729, " + arg0 + ", " + -41890 + ", " + arg1 + ", " + local259.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILclient!lb;I)V")
	private void method126(@OriginalArg(1) Class1_Sub1_Sub3 arg0, @OriginalArg(2) int arg1) {
		try {
			while (true) {
				if (arg0.anInt721 + 21 < arg1 * 8) {
					@Pc(14) int local14 = arg0.method491(14);
					if (local14 != 16383) {
						if (this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local14] == null) {
							this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local14] = new Class1_Sub1_Sub1_Sub1_Sub2();
						}
						@Pc(34) Class1_Sub1_Sub1_Sub1_Sub2 local34 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local14];
						this.anIntArray91[this.anInt395++] = local14;
						local34.anInt1002 = anInt239;
						local34.aClass13_2 = Class13.method323(arg0.method491(12));
						local34.anInt965 = local34.aClass13_2.aByte18;
						local34.anInt1005 = local34.aClass13_2.anInt541;
						local34.anInt968 = local34.aClass13_2.anInt528;
						local34.anInt969 = local34.aClass13_2.anInt529;
						local34.anInt970 = local34.aClass13_2.anInt530;
						local34.anInt971 = local34.aClass13_2.anInt531;
						local34.anInt966 = local34.aClass13_2.anInt527;
						@Pc(95) int local95 = arg0.method491(5);
						if (local95 > 15) {
							local95 -= 32;
						}
						@Pc(104) int local104 = arg0.method491(5);
						if (local104 > 15) {
							local104 -= 32;
						}
						@Pc(113) int local113 = arg0.method491(1);
						local34.method677(aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray272[0] + local95, local113 == 1, aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray273[0] + local104);
						@Pc(139) int local139 = arg0.method491(1);
						if (local139 == 1) {
							this.anIntArray47[this.anInt243++] = local14;
						}
						continue;
					}
				}
				arg0.method492();
				return;
			}
		} catch (@Pc(170) RuntimeException local170) {
			signlink.reporterror("22298, " + 30846 + ", " + arg0 + ", " + arg1 + ", " + local170.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "()V")
	@Override
	protected void method89() {
		this.method96(20, (byte) 1, "Starting up");
		if (signlink.sunjava) {
			super.anInt176 = 5;
		}
		if (aBoolean63) {
			this.aBoolean62 = true;
			return;
		}
		aBoolean63 = true;
		@Pc(21) boolean local21 = false;
		@Pc(25) String local25 = this.method215();
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
			this.aBoolean54 = true;
			return;
		}
		if (signlink.aRandomAccessFile1 != null) {
			for (@Pc(95) int local95 = 0; local95 < 5; local95++) {
				this.aClass45Array1[local95] = new Class45(signlink.aRandomAccessFileArray1[local95], local95 + 1, 7, 500000, signlink.aRandomAccessFile1);
			}
		}
		try {
			this.method116();
			this.aClass47_1 = this.method195(this.anIntArray85[1], 1, "title screen", "title", 25);
			this.aClass1_Sub1_Sub2_Sub4_1 = new Class1_Sub1_Sub2_Sub4(false, "p11_full", this.aClass47_1, 98);
			this.aClass1_Sub1_Sub2_Sub4_2 = new Class1_Sub1_Sub2_Sub4(false, "p12_full", this.aClass47_1, 98);
			this.aClass1_Sub1_Sub2_Sub4_3 = new Class1_Sub1_Sub2_Sub4(false, "b12_full", this.aClass47_1, 98);
			this.aClass1_Sub1_Sub2_Sub4_4 = new Class1_Sub1_Sub2_Sub4(true, "q8_full", this.aClass47_1, 98);
			this.method180();
			this.method187(anInt380);
			@Pc(191) Class47 local191 = this.method195(this.anIntArray85[2], 2, "config", "config", 30);
			@Pc(203) Class47 local203 = this.method195(this.anIntArray85[3], 3, "interface", "interface", 35);
			@Pc(215) Class47 local215 = this.method195(this.anIntArray85[4], 4, "2d graphics", "media", 40);
			@Pc(227) Class47 local227 = this.method195(this.anIntArray85[6], 6, "textures", "textures", 45);
			@Pc(239) Class47 local239 = this.method195(this.anIntArray85[7], 7, "chat system", "wordenc", 50);
			@Pc(251) Class47 local251 = this.method195(this.anIntArray85[8], 8, "sound effects", "sounds", 55);
			this.aByteArrayArrayArray7 = new byte[4][104][104];
			this.anIntArrayArrayArray5 = new int[4][105][105];
			this.aClass37_1 = new Class37(4, 104, 104, this.anIntArrayArrayArray5, 4);
			for (@Pc(276) int local276 = 0; local276 < 4; local276++) {
				this.aClass19Array1[local276] = new Class19(104, aByte9, 104);
			}
			this.aClass1_Sub1_Sub2_Sub2_1 = new Class1_Sub1_Sub2_Sub2(512, 512);
			@Pc(311) Class47 local311 = this.method195(this.anIntArray85[5], 5, "update list", "versionlist", 60);
			this.method96(60, (byte) 1, "Connecting to update server");
			this.aClass44_Sub1_1 = new Class44_Sub1();
			this.aClass44_Sub1_1.method636(local311, this);
			Class12.method302(this.aClass44_Sub1_1.method639());
			Class1_Sub1_Sub1_Sub5.method258(this.aClass44_Sub1_1.method638(0), this.aClass44_Sub1_1);
			if (!aBoolean72) {
				this.anInt308 = 0;
				try {
					this.anInt308 = Integer.parseInt(this.getParameter("music"));
				} catch (@Pc(352) Exception local352) {
				}
				this.aBoolean75 = true;
				this.aClass44_Sub1_1.method645(2, this.anInt308);
				while (this.aClass44_Sub1_1.method646() > 0) {
					this.method166();
					try {
						Thread.sleep(100L);
					} catch (@Pc(370) Exception local370) {
					}
					if (this.aClass44_Sub1_1.anInt932 > 3) {
						this.method103("ondemand");
						return;
					}
				}
			}
			this.method96(65, (byte) 1, "Requesting animations");
			@Pc(394) int local394 = this.aClass44_Sub1_1.method638(1);
			for (@Pc(396) int local396 = 0; local396 < local394; local396++) {
				this.aClass44_Sub1_1.method645(1, local396);
			}
			@Pc(415) int local415;
			while (this.aClass44_Sub1_1.method646() > 0) {
				local415 = local394 - this.aClass44_Sub1_1.method646();
				if (local415 > 0) {
					this.method96(65, (byte) 1, "Loading animations - " + local415 * 100 / local394 + "%");
				}
				this.method166();
				try {
					Thread.sleep(100L);
				} catch (@Pc(441) Exception local441) {
				}
				if (this.aClass44_Sub1_1.anInt932 > 3) {
					this.method103("ondemand");
					return;
				}
			}
			this.method96(70, (byte) 1, "Requesting models");
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
					this.method96(70, (byte) 1, "Loading models - " + local475 * 100 / local394 + "%");
				}
				this.method166();
				try {
					Thread.sleep(100L);
				} catch (@Pc(526) Exception local526) {
				}
			}
			if (this.aClass45Array1[0] != null) {
				this.method96(75, (byte) 1, "Requesting maps");
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
						this.method96(75, (byte) 1, "Loading maps - " + local475 * 100 / local394 + "%");
					}
					this.method166();
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
					this.aClass44_Sub1_1.method648(local734, 0, aBoolean60, local475);
				}
			}
			this.aClass44_Sub1_1.method641(aBoolean71);
			if (!aBoolean72) {
				local394 = this.aClass44_Sub1_1.method638(2);
				for (local732 = 1; local732 < local394; local732++) {
					if (this.aClass44_Sub1_1.method644(local732)) {
						this.aClass44_Sub1_1.method648((byte) 1, 2, aBoolean60, local732);
					}
				}
			}
			this.method96(80, (byte) 1, "Unpacking media");
			this.aClass1_Sub1_Sub2_Sub3_1 = new Class1_Sub1_Sub2_Sub3(local215, "invback", 0);
			this.aClass1_Sub1_Sub2_Sub3_3 = new Class1_Sub1_Sub2_Sub3(local215, "chatback", 0);
			this.aClass1_Sub1_Sub2_Sub3_2 = new Class1_Sub1_Sub2_Sub3(local215, "mapback", 0);
			this.aClass1_Sub1_Sub2_Sub3_4 = new Class1_Sub1_Sub2_Sub3(local215, "backbase1", 0);
			this.aClass1_Sub1_Sub2_Sub3_5 = new Class1_Sub1_Sub2_Sub3(local215, "backbase2", 0);
			this.aClass1_Sub1_Sub2_Sub3_6 = new Class1_Sub1_Sub2_Sub3(local215, "backhmid1", 0);
			for (local732 = 0; local732 < 13; local732++) {
				this.aClass1_Sub1_Sub2_Sub3Array1[local732] = new Class1_Sub1_Sub2_Sub3(local215, "sideicons", local732);
			}
			this.aClass1_Sub1_Sub2_Sub2_11 = new Class1_Sub1_Sub2_Sub2(local215, "compass", 0);
			this.aClass1_Sub1_Sub2_Sub2_8 = new Class1_Sub1_Sub2_Sub2(local215, "mapedge", 0);
			this.aClass1_Sub1_Sub2_Sub2_8.method388();
			@Pc(934) int local934;
			try {
				for (local934 = 0; local934 < 100; local934++) {
					this.aClass1_Sub1_Sub2_Sub3Array3[local934] = new Class1_Sub1_Sub2_Sub3(local215, "mapscene", local934);
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
					this.aClass1_Sub1_Sub2_Sub2Array4[local934] = new Class1_Sub1_Sub2_Sub2(local215, "headicons", local934);
				}
			} catch (@Pc(1012) Exception local1012) {
			}
			this.aClass1_Sub1_Sub2_Sub2_12 = new Class1_Sub1_Sub2_Sub2(local215, "mapmarker", 0);
			this.aClass1_Sub1_Sub2_Sub2_13 = new Class1_Sub1_Sub2_Sub2(local215, "mapmarker", 1);
			for (local934 = 0; local934 < 8; local934++) {
				this.aClass1_Sub1_Sub2_Sub2Array3[local934] = new Class1_Sub1_Sub2_Sub2(local215, "cross", local934);
			}
			this.aClass1_Sub1_Sub2_Sub2_2 = new Class1_Sub1_Sub2_Sub2(local215, "mapdots", 0);
			this.aClass1_Sub1_Sub2_Sub2_3 = new Class1_Sub1_Sub2_Sub2(local215, "mapdots", 1);
			this.aClass1_Sub1_Sub2_Sub2_4 = new Class1_Sub1_Sub2_Sub2(local215, "mapdots", 2);
			this.aClass1_Sub1_Sub2_Sub2_5 = new Class1_Sub1_Sub2_Sub2(local215, "mapdots", 3);
			this.aClass1_Sub1_Sub2_Sub3_7 = new Class1_Sub1_Sub2_Sub3(local215, "scrollbar", 0);
			this.aClass1_Sub1_Sub2_Sub3_8 = new Class1_Sub1_Sub2_Sub3(local215, "scrollbar", 1);
			this.aClass1_Sub1_Sub2_Sub3_16 = new Class1_Sub1_Sub2_Sub3(local215, "redstone1", 0);
			this.aClass1_Sub1_Sub2_Sub3_17 = new Class1_Sub1_Sub2_Sub3(local215, "redstone2", 0);
			this.aClass1_Sub1_Sub2_Sub3_18 = new Class1_Sub1_Sub2_Sub3(local215, "redstone3", 0);
			this.aClass1_Sub1_Sub2_Sub3_19 = new Class1_Sub1_Sub2_Sub3(local215, "redstone1", 0);
			this.aClass1_Sub1_Sub2_Sub3_19.method415();
			this.aClass1_Sub1_Sub2_Sub3_20 = new Class1_Sub1_Sub2_Sub3(local215, "redstone2", 0);
			this.aClass1_Sub1_Sub2_Sub3_20.method415();
			this.aClass1_Sub1_Sub2_Sub3_9 = new Class1_Sub1_Sub2_Sub3(local215, "redstone1", 0);
			this.aClass1_Sub1_Sub2_Sub3_9.method416();
			this.aClass1_Sub1_Sub2_Sub3_10 = new Class1_Sub1_Sub2_Sub3(local215, "redstone2", 0);
			this.aClass1_Sub1_Sub2_Sub3_10.method416();
			this.aClass1_Sub1_Sub2_Sub3_11 = new Class1_Sub1_Sub2_Sub3(local215, "redstone3", 0);
			this.aClass1_Sub1_Sub2_Sub3_11.method416();
			this.aClass1_Sub1_Sub2_Sub3_12 = new Class1_Sub1_Sub2_Sub3(local215, "redstone1", 0);
			this.aClass1_Sub1_Sub2_Sub3_12.method415();
			this.aClass1_Sub1_Sub2_Sub3_12.method416();
			this.aClass1_Sub1_Sub2_Sub3_13 = new Class1_Sub1_Sub2_Sub3(local215, "redstone2", 0);
			this.aClass1_Sub1_Sub2_Sub3_13.method415();
			this.aClass1_Sub1_Sub2_Sub3_13.method416();
			for (@Pc(1212) int local1212 = 0; local1212 < 2; local1212++) {
				this.aClass1_Sub1_Sub2_Sub3Array4[local1212] = new Class1_Sub1_Sub2_Sub3(local215, "mod_icons", local1212);
			}
			@Pc(1235) Class1_Sub1_Sub2_Sub2 local1235 = new Class1_Sub1_Sub2_Sub2(local215, "backleft1", 0);
			this.aClass35_7 = new Class35(this.method94(), 0, local1235.anInt628, local1235.anInt627);
			local1235.method389(0, 0);
			@Pc(1260) Class1_Sub1_Sub2_Sub2 local1260 = new Class1_Sub1_Sub2_Sub2(local215, "backleft2", 0);
			this.aClass35_8 = new Class35(this.method94(), 0, local1260.anInt628, local1260.anInt627);
			local1260.method389(0, 0);
			@Pc(1285) Class1_Sub1_Sub2_Sub2 local1285 = new Class1_Sub1_Sub2_Sub2(local215, "backright1", 0);
			this.aClass35_9 = new Class35(this.method94(), 0, local1285.anInt628, local1285.anInt627);
			local1285.method389(0, 0);
			@Pc(1310) Class1_Sub1_Sub2_Sub2 local1310 = new Class1_Sub1_Sub2_Sub2(local215, "backright2", 0);
			this.aClass35_10 = new Class35(this.method94(), 0, local1310.anInt628, local1310.anInt627);
			local1310.method389(0, 0);
			@Pc(1335) Class1_Sub1_Sub2_Sub2 local1335 = new Class1_Sub1_Sub2_Sub2(local215, "backtop1", 0);
			this.aClass35_11 = new Class35(this.method94(), 0, local1335.anInt628, local1335.anInt627);
			local1335.method389(0, 0);
			@Pc(1360) Class1_Sub1_Sub2_Sub2 local1360 = new Class1_Sub1_Sub2_Sub2(local215, "backvmid1", 0);
			this.aClass35_12 = new Class35(this.method94(), 0, local1360.anInt628, local1360.anInt627);
			local1360.method389(0, 0);
			@Pc(1385) Class1_Sub1_Sub2_Sub2 local1385 = new Class1_Sub1_Sub2_Sub2(local215, "backvmid2", 0);
			this.aClass35_13 = new Class35(this.method94(), 0, local1385.anInt628, local1385.anInt627);
			local1385.method389(0, 0);
			@Pc(1410) Class1_Sub1_Sub2_Sub2 local1410 = new Class1_Sub1_Sub2_Sub2(local215, "backvmid3", 0);
			this.aClass35_14 = new Class35(this.method94(), 0, local1410.anInt628, local1410.anInt627);
			local1410.method389(0, 0);
			@Pc(1435) Class1_Sub1_Sub2_Sub2 local1435 = new Class1_Sub1_Sub2_Sub2(local215, "backhmid2", 0);
			this.aClass35_15 = new Class35(this.method94(), 0, local1435.anInt628, local1435.anInt627);
			local1435.method389(0, 0);
			@Pc(1460) int local1460 = (int) (Math.random() * 21.0D) - 10;
			@Pc(1467) int local1467 = (int) (Math.random() * 21.0D) - 10;
			@Pc(1474) int local1474 = (int) (Math.random() * 21.0D) - 10;
			@Pc(1481) int local1481 = (int) (Math.random() * 41.0D) - 20;
			for (@Pc(1483) int local1483 = 0; local1483 < 100; local1483++) {
				if (this.aClass1_Sub1_Sub2_Sub2Array7[local1483] != null) {
					this.aClass1_Sub1_Sub2_Sub2Array7[local1483].method387(local1467 + local1481, local1474 + local1481, local1460 + local1481);
				}
				if (this.aClass1_Sub1_Sub2_Sub3Array3[local1483] != null) {
					this.aClass1_Sub1_Sub2_Sub3Array3[local1483].method417(local1467 + local1481, local1474 + local1481, local1460 + local1481);
				}
			}
			this.method96(83, (byte) 1, "Unpacking textures");
			Class1_Sub1_Sub2_Sub1.method347(local227, (byte) 3);
			Class1_Sub1_Sub2_Sub1.method351(0.8D);
			Class1_Sub1_Sub2_Sub1.method346(899);
			this.method96(86, (byte) 1, "Unpacking config");
			Class27.method505(local191);
			Class9.method286(local191);
			Class21.method462(local191);
			Class15.method359(local191);
			Class13.method321(local191);
			Class23.method496(local191);
			Class33.method521(local191);
			Class39.method589(local191);
			Class36.method527(local191);
			Class15.aBoolean163 = aBoolean71;
			if (!aBoolean72) {
				this.method96(90, (byte) 1, "Unpacking sounds");
				@Pc(1586) byte[] local1586 = local251.method666("sounds.dat", null);
				@Pc(1592) Class1_Sub1_Sub3 local1592 = new Class1_Sub1_Sub3(local1586, (byte) -93);
				Class5.method78(local1592);
			}
			this.method96(95, (byte) 1, "Unpacking interfaces");
			@Pc(1623) Class1_Sub1_Sub2_Sub4[] local1623 = new Class1_Sub1_Sub2_Sub4[] { this.aClass1_Sub1_Sub2_Sub4_1, this.aClass1_Sub1_Sub2_Sub4_2, this.aClass1_Sub1_Sub2_Sub4_3, this.aClass1_Sub1_Sub2_Sub4_4 };
			Class6.method231(local203, local215, local1623);
			this.method96(100, (byte) 1, "Preparing game engine");
			@Pc(1639) int local1639;
			@Pc(1641) int local1641;
			@Pc(1643) int local1643;
			for (@Pc(1635) int local1635 = 0; local1635 < 33; local1635++) {
				local1639 = 999;
				local1641 = 0;
				for (local1643 = 0; local1643 < 34; local1643++) {
					if (this.aClass1_Sub1_Sub2_Sub3_2.aByteArray7[local1643 + local1635 * this.aClass1_Sub1_Sub2_Sub3_2.anInt653] == 0) {
						if (local1639 == 999) {
							local1639 = local1643;
						}
					} else if (local1639 != 999) {
						local1641 = local1643;
						break;
					}
				}
				this.anIntArray72[local1635] = local1639;
				this.anIntArray80[local1635] = local1641 - local1639;
			}
			@Pc(1701) int local1701;
			for (local1639 = 5; local1639 < 156; local1639++) {
				local1641 = 999;
				local1643 = 0;
				for (local1701 = 25; local1701 < 172; local1701++) {
					if (this.aClass1_Sub1_Sub2_Sub3_2.aByteArray7[local1701 + local1639 * this.aClass1_Sub1_Sub2_Sub3_2.anInt653] == 0 && (local1701 > 34 || local1639 > 34)) {
						if (local1641 == 999) {
							local1641 = local1701;
						}
					} else if (local1641 != 999) {
						local1643 = local1701;
						break;
					}
				}
				this.anIntArray60[local1639 - 5] = local1641 - 25;
				this.anIntArray63[local1639 - 5] = local1643 - local1641;
			}
			Class1_Sub1_Sub2_Sub1.method344(96, 479, (byte) 6);
			this.anIntArray82 = Class1_Sub1_Sub2_Sub1.anIntArray180;
			Class1_Sub1_Sub2_Sub1.method344(261, 190, (byte) 6);
			this.anIntArray83 = Class1_Sub1_Sub2_Sub1.anIntArray180;
			Class1_Sub1_Sub2_Sub1.method344(334, 512, (byte) 6);
			this.anIntArray84 = Class1_Sub1_Sub2_Sub1.anIntArray180;
			@Pc(1785) int[] local1785 = new int[9];
			for (local1643 = 0; local1643 < 9; local1643++) {
				local1701 = local1643 * 32 + 128 + 15;
				@Pc(1803) int local1803 = local1701 * 3 + 600;
				@Pc(1807) int local1807 = Class1_Sub1_Sub2_Sub1.anIntArray178[local1701];
				local1785[local1643] = local1803 * local1807 >> 16;
			}
			Class37.method566(local1785);
			Class42.method594(local239);
			this.aClass11_1 = new Class11(7, this);
			this.method95(this.aClass11_1, 10);
			Class1_Sub1_Sub1_Sub2.aClient1 = this;
			Class9.aClient2 = this;
			Class13.aClient4 = this;
		} catch (@Pc(1848) Exception local1848) {
			signlink.reporterror("loaderror " + this.aString15 + " " + this.anInt294);
			this.aBoolean67 = true;
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(ILclient!lb;I)V")
	private void method127(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub1_Sub3 arg1, @OriginalArg(2) int arg2) {
		try {
			@Pc(3) boolean local3 = false;
			arg1.method490();
			@Pc(11) int local11 = arg1.method491(1);
			if (local11 != 0) {
				@Pc(19) int local19 = arg1.method491(2);
				if (local19 == 0) {
					this.anIntArray47[this.anInt243++] = this.anInt241;
				} else {
					@Pc(42) int local42;
					@Pc(52) int local52;
					if (local19 == 1) {
						local42 = arg1.method491(3);
						aClass1_Sub1_Sub1_Sub1_Sub1_1.method678(local42, false);
						local52 = arg1.method491(1);
						if (local52 == 1) {
							this.anIntArray47[this.anInt243++] = this.anInt241;
						}
					} else {
						@Pc(96) int local96;
						if (local19 == 2) {
							local42 = arg1.method491(3);
							aClass1_Sub1_Sub1_Sub1_Sub1_1.method678(local42, true);
							local52 = arg1.method491(3);
							aClass1_Sub1_Sub1_Sub1_Sub1_1.method678(local52, true);
							local96 = arg1.method491(1);
							if (local96 == 1) {
								this.anIntArray47[this.anInt243++] = this.anInt241;
							}
						} else if (local19 == 3) {
							this.anInt229 = arg1.method491(2);
							local42 = arg1.method491(7);
							local52 = arg1.method491(7);
							local96 = arg1.method491(1);
							aClass1_Sub1_Sub1_Sub1_Sub1_1.method677(local42, local96 == 1, local52);
							@Pc(152) int local152 = arg1.method491(1);
							if (local152 == 1) {
								this.anIntArray47[this.anInt243++] = this.anInt241;
							}
						}
					}
				}
			}
		} catch (@Pc(169) RuntimeException local169) {
			signlink.reporterror("25525, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local169.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "f", descriptor = "(B)V")
	private void method128() {
		try {
			if (this.anInt281 == 0 && this.anInt297 == 0) {
				this.aStringArray1[this.anInt353] = "Walk here";
				this.anIntArray34[this.anInt353] = 718;
				this.anIntArray32[this.anInt353] = super.anInt182;
				this.anIntArray33[this.anInt353] = super.anInt183;
				this.anInt353++;
			}
			@Pc(41) int local41 = -1;
			for (@Pc(49) int local49 = 0; local49 < Class1_Sub1_Sub1_Sub5.anInt477; local49++) {
				@Pc(55) int local55 = Class1_Sub1_Sub1_Sub5.anIntArray150[local49];
				@Pc(59) int local59 = local55 & 0x7F;
				@Pc(65) int local65 = local55 >> 7 & 0x7F;
				@Pc(71) int local71 = local55 >> 29 & 0x3;
				@Pc(77) int local77 = local55 >> 14 & 0x7FFF;
				if (local55 != local41) {
					local41 = local55;
					@Pc(224) int local224;
					if (local71 == 2 && this.aClass37_1.method560(this.anInt229, local59, local65, local55) >= 0) {
						@Pc(97) Class9 local97 = Class9.method288(local77);
						if (local97.anIntArray160 != null) {
							local97 = local97.method296();
						}
						if (local97 == null) {
							continue;
						}
						if (this.anInt281 == 1) {
							this.aStringArray1[this.anInt353] = "Use " + this.aString8 + " with @cya@" + local97.aString23;
							this.anIntArray34[this.anInt353] = 810;
							this.anIntArray35[this.anInt353] = local55;
							this.anIntArray32[this.anInt353] = local59;
							this.anIntArray33[this.anInt353] = local65;
							this.anInt353++;
						} else if (this.anInt297 != 1) {
							if (local97.aStringArray8 != null) {
								for (local224 = 4; local224 >= 0; local224--) {
									if (local97.aStringArray8[local224] != null) {
										this.aStringArray1[this.anInt353] = local97.aStringArray8[local224] + " @cya@" + local97.aString23;
										if (local224 == 0) {
											this.anIntArray34[this.anInt353] = 625;
										}
										if (local224 == 1) {
											this.anIntArray34[this.anInt353] = 721;
										}
										if (local224 == 2) {
											this.anIntArray34[this.anInt353] = 743;
										}
										if (local224 == 3) {
											this.anIntArray34[this.anInt353] = 357;
										}
										if (local224 == 4) {
											this.anIntArray34[this.anInt353] = 1071;
										}
										this.anIntArray35[this.anInt353] = local55;
										this.anIntArray32[this.anInt353] = local59;
										this.anIntArray33[this.anInt353] = local65;
										this.anInt353++;
									}
								}
							}
							this.aStringArray1[this.anInt353] = "Examine @cya@" + local97.aString23;
							this.anIntArray34[this.anInt353] = 1381;
							this.anIntArray35[this.anInt353] = local97.anInt480 << 14;
							this.anIntArray32[this.anInt353] = local59;
							this.anIntArray33[this.anInt353] = local65;
							this.anInt353++;
						} else if ((this.anInt299 & 0x4) == 4) {
							this.aStringArray1[this.anInt353] = this.aString9 + " @cya@" + local97.aString23;
							this.anIntArray34[this.anInt353] = 899;
							this.anIntArray35[this.anInt353] = local55;
							this.anIntArray32[this.anInt353] = local59;
							this.anIntArray33[this.anInt353] = local65;
							this.anInt353++;
						}
					}
					@Pc(404) Class1_Sub1_Sub1_Sub1_Sub2 local404;
					@Pc(452) Class1_Sub1_Sub1_Sub1_Sub1 local452;
					@Pc(442) int local442;
					if (local71 == 1) {
						@Pc(375) Class1_Sub1_Sub1_Sub1_Sub2 local375 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local77];
						if (local375.aClass13_2.aByte18 == 1 && (local375.anInt962 & 0x7F) == 64 && (local375.anInt963 & 0x7F) == 64) {
							for (local224 = 0; local224 < this.anInt395; local224++) {
								local404 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[this.anIntArray91[local224]];
								if (local404 != null && local404 != local375 && local404.aClass13_2.aByte18 == 1 && local404.anInt962 == local375.anInt962 && local404.anInt963 == local375.anInt963) {
									this.method194(local404.aClass13_2, this.anIntArray91[local224], local59, local65);
								}
							}
							for (local442 = 0; local442 < this.anInt242; local442++) {
								local452 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[this.anIntArray46[local442]];
								if (local452 != null && local452.anInt962 == local375.anInt962 && local452.anInt963 == local375.anInt963) {
									this.method183(local65, local59, local452, this.anIntArray46[local442]);
								}
							}
						}
						this.method194(local375.aClass13_2, local77, local59, local65);
					}
					if (local71 == 0) {
						@Pc(494) Class1_Sub1_Sub1_Sub1_Sub1 local494 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local77];
						if ((local494.anInt962 & 0x7F) == 64 && (local494.anInt963 & 0x7F) == 64) {
							for (local224 = 0; local224 < this.anInt395; local224++) {
								local404 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[this.anIntArray91[local224]];
								if (local404 != null && local404.aClass13_2.aByte18 == 1 && local404.anInt962 == local494.anInt962 && local404.anInt963 == local494.anInt963) {
									this.method194(local404.aClass13_2, this.anIntArray91[local224], local59, local65);
								}
							}
							for (local442 = 0; local442 < this.anInt242; local442++) {
								local452 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[this.anIntArray46[local442]];
								if (local452 != null && local452 != local494 && local452.anInt962 == local494.anInt962 && local452.anInt963 == local494.anInt963) {
									this.method183(local65, local59, local452, this.anIntArray46[local442]);
								}
							}
						}
						this.method183(local65, local59, local494, local77);
					}
					if (local71 == 3) {
						@Pc(613) Class29 local613 = this.aClass29ArrayArrayArray1[this.anInt229][local59][local65];
						if (local613 != null) {
							for (@Pc(620) Class1_Sub1_Sub1_Sub3 local620 = (Class1_Sub1_Sub1_Sub3) local613.method512(); local620 != null; local620 = (Class1_Sub1_Sub1_Sub3) local613.method514()) {
								@Pc(626) Class15 local626 = Class15.method361(local620.anInt168);
								if (this.anInt281 == 1) {
									this.aStringArray1[this.anInt353] = "Use " + this.aString8 + " with @lre@" + local626.aString25;
									this.anIntArray34[this.anInt353] = 111;
									this.anIntArray35[this.anInt353] = local620.anInt168;
									this.anIntArray32[this.anInt353] = local59;
									this.anIntArray33[this.anInt353] = local65;
									this.anInt353++;
								} else if (this.anInt297 != 1) {
									for (@Pc(743) int local743 = 4; local743 >= 0; local743--) {
										if (local626.aStringArray10 != null && local626.aStringArray10[local743] != null) {
											this.aStringArray1[this.anInt353] = local626.aStringArray10[local743] + " @lre@" + local626.aString25;
											if (local743 == 0) {
												this.anIntArray34[this.anInt353] = 139;
											}
											if (local743 == 1) {
												this.anIntArray34[this.anInt353] = 778;
											}
											if (local743 == 2) {
												this.anIntArray34[this.anInt353] = 617;
											}
											if (local743 == 3) {
												this.anIntArray34[this.anInt353] = 224;
											}
											if (local743 == 4) {
												this.anIntArray34[this.anInt353] = 662;
											}
											this.anIntArray35[this.anInt353] = local620.anInt168;
											this.anIntArray32[this.anInt353] = local59;
											this.anIntArray33[this.anInt353] = local65;
											this.anInt353++;
										} else if (local743 == 2) {
											this.aStringArray1[this.anInt353] = "Take @lre@" + local626.aString25;
											this.anIntArray34[this.anInt353] = 617;
											this.anIntArray35[this.anInt353] = local620.anInt168;
											this.anIntArray32[this.anInt353] = local59;
											this.anIntArray33[this.anInt353] = local65;
											this.anInt353++;
										}
									}
									this.aStringArray1[this.anInt353] = "Examine @lre@" + local626.aString25;
									this.anIntArray34[this.anInt353] = 1152;
									this.anIntArray35[this.anInt353] = local620.anInt168;
									this.anIntArray32[this.anInt353] = local59;
									this.anIntArray33[this.anInt353] = local65;
									this.anInt353++;
								} else if ((this.anInt299 & 0x1) == 1) {
									this.aStringArray1[this.anInt353] = this.aString9 + " @lre@" + local626.aString25;
									this.anIntArray34[this.anInt353] = 370;
									this.anIntArray35[this.anInt353] = local620.anInt168;
									this.anIntArray32[this.anInt353] = local59;
									this.anIntArray33[this.anInt353] = local65;
									this.anInt353++;
								}
							}
						}
					}
				}
			}
		} catch (@Pc(950) RuntimeException local950) {
			signlink.reporterror("60729, " + -31 + ", " + local950.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "l", descriptor = "(I)V")
	private void method129() {
		try {
			this.aClass1_Sub1_Sub3_3.method469(165);
			if (this.anInt245 != -1) {
				this.anInt245 = -1;
				this.aBoolean73 = true;
				this.aBoolean94 = false;
				this.aBoolean80 = true;
			}
			if (this.anInt197 != -1) {
				this.anInt197 = -1;
				this.aBoolean88 = true;
				this.aBoolean94 = false;
			}
			this.anInt324 = -1;
		} catch (@Pc(43) RuntimeException local43) {
			signlink.reporterror("61231, " + -453 + ", " + local43.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "m", descriptor = "(I)V")
	private void method130() {
		try {
			this.aClass35_4.method524(this.anInt198);
			@Pc(19) int local19;
			@Pc(21) int local21;
			if (this.anInt211 == 2) {
				@Pc(14) byte[] local14 = this.aClass1_Sub1_Sub2_Sub3_2.aByteArray7;
				@Pc(16) int[] local16 = Class1_Sub1_Sub2.anIntArray213;
				local19 = local14.length;
				for (local21 = 0; local21 < local19; local21++) {
					if (local14[local21] == 0) {
						local16[local21] = 0;
					}
				}
				this.aClass1_Sub1_Sub2_Sub2_11.method395(0, 0, 33, this.anIntArray80, this.anIntArray72, 33, 256, this.anInt391, 25, 25);
				this.aClass35_5.method524(this.anInt198);
			} else {
				@Pc(66) int local66 = this.anInt391 + this.anInt310 & 0x7FF;
				@Pc(73) int local73 = aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt962 / 32 + 48;
				local19 = 464 - aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt963 / 32;
				this.aClass1_Sub1_Sub2_Sub2_1.method395(5, 25, 151, this.anIntArray63, this.anIntArray60, 146, this.anInt261 + 256, local66, local19, local73);
				this.aClass1_Sub1_Sub2_Sub2_11.method395(0, 0, 33, this.anIntArray80, this.anIntArray72, 33, 256, this.anInt391, 25, 25);
				for (local21 = 0; local21 < this.anInt335; local21++) {
					local73 = this.anIntArray69[local21] * 4 + 2 - aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt962 / 32;
					local19 = this.anIntArray70[local21] * 4 + 2 - aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt963 / 32;
					this.method108(this.aClass1_Sub1_Sub2_Sub2Array5[local21], local19, local73);
				}
				@Pc(168) int local168;
				for (@Pc(164) int local164 = 0; local164 < 104; local164++) {
					for (local168 = 0; local168 < 104; local168++) {
						@Pc(180) Class29 local180 = this.aClass29ArrayArrayArray1[this.anInt229][local164][local168];
						if (local180 != null) {
							local73 = local164 * 4 + 2 - aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt962 / 32;
							local19 = local168 * 4 + 2 - aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt963 / 32;
							this.method108(this.aClass1_Sub1_Sub2_Sub2_2, local19, local73);
						}
					}
				}
				for (local168 = 0; local168 < this.anInt395; local168++) {
					@Pc(231) Class1_Sub1_Sub1_Sub1_Sub2 local231 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[this.anIntArray91[local168]];
					if (local231 != null && local231.method680()) {
						@Pc(240) Class13 local240 = local231.aClass13_2;
						if (local240.anIntArray174 != null) {
							local240 = local240.method327();
						}
						if (local240 != null && local240.aBoolean150) {
							local73 = local231.anInt962 / 32 - aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt962 / 32;
							local19 = local231.anInt963 / 32 - aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt963 / 32;
							this.method108(this.aClass1_Sub1_Sub2_Sub2_3, local19, local73);
						}
					}
				}
				@Pc(296) Class1_Sub1_Sub1_Sub1_Sub1 local296;
				for (@Pc(286) int local286 = 0; local286 < this.anInt242; local286++) {
					local296 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[this.anIntArray46[local286]];
					if (local296 != null && local296.method680()) {
						local73 = local296.anInt962 / 32 - aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt962 / 32;
						local19 = local296.anInt963 / 32 - aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt963 / 32;
						@Pc(324) boolean local324 = false;
						@Pc(328) long local328 = Class48.method667(local296.aString3);
						for (@Pc(330) int local330 = 0; local330 < this.anInt350; local330++) {
							if (local328 == this.aLongArray3[local330] && this.anIntArray48[local330] != 0) {
								local324 = true;
								break;
							}
						}
						if (aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt133 != 0 && local296.anInt133 != 0) {
							if (aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt133 == local296.anInt133) {
								local324 = true;
							} else {
								local324 = false;
							}
						}
						if (local324) {
							this.method108(this.aClass1_Sub1_Sub2_Sub2_5, local19, local73);
						} else {
							this.method108(this.aClass1_Sub1_Sub2_Sub2_4, local19, local73);
						}
					}
				}
				if (this.anInt285 != 0 && anInt239 % 20 < 10) {
					if (this.anInt285 == 1 && this.anInt246 >= 0 && this.anInt246 < this.aClass1_Sub1_Sub1_Sub1_Sub2Array1.length) {
						@Pc(420) Class1_Sub1_Sub1_Sub1_Sub2 local420 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[this.anInt246];
						if (local420 != null) {
							local73 = local420.anInt962 / 32 - aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt962 / 32;
							local19 = local420.anInt963 / 32 - aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt963 / 32;
							this.method110(this.aClass1_Sub1_Sub2_Sub2_13, local73, local19);
						}
					}
					if (this.anInt285 == 2) {
						local73 = (this.anInt203 - this.anInt354) * 4 + 2 - aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt962 / 32;
						local19 = (this.anInt204 - this.anInt355) * 4 + 2 - aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt963 / 32;
						this.method110(this.aClass1_Sub1_Sub2_Sub2_13, local73, local19);
					}
					if (this.anInt285 == 10 && this.anInt305 >= 0 && this.anInt305 < this.aClass1_Sub1_Sub1_Sub1_Sub1Array1.length) {
						local296 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[this.anInt305];
						if (local296 != null) {
							local73 = local296.anInt962 / 32 - aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt962 / 32;
							local19 = local296.anInt963 / 32 - aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt963 / 32;
							this.method110(this.aClass1_Sub1_Sub2_Sub2_13, local73, local19);
						}
					}
				}
				if (this.anInt201 != 0) {
					local73 = this.anInt201 * 4 + 2 - aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt962 / 32;
					local19 = this.anInt202 * 4 + 2 - aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt963 / 32;
					this.method108(this.aClass1_Sub1_Sub2_Sub2_12, local19, local73);
				}
				Class1_Sub1_Sub2.method439(16777215, 3, 78, 3, (byte) 5, 97);
				this.aClass35_5.method524(this.anInt198);
			}
		} catch (@Pc(591) RuntimeException local591) {
			signlink.reporterror("79115, " + 0 + ", " + local591.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "g", descriptor = "(B)Z")
	private boolean method131() {
		try {
			return signlink.wavereplay();
		} catch (@Pc(13) RuntimeException local13) {
			signlink.reporterror("41548, " + 7 + ", " + local13.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "f", descriptor = "(Z)V")
	private void method133() {
		try {
			this.anInt278 = 0;
			@Pc(19) int local19 = (aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt962 >> 7) + this.anInt354;
			@Pc(27) int local27 = (aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt963 >> 7) + this.anInt355;
			if (local19 >= 3053 && local19 <= 3156 && local27 >= 3056 && local27 <= 3136) {
				this.anInt278 = 1;
			}
			if (local19 >= 3072 && local19 <= 3118 && local27 >= 9492 && local27 <= 9535) {
				this.anInt278 = 1;
			}
			if (this.anInt278 == 1 && local19 >= 3139 && local19 <= 3199 && local27 >= 3008 && local27 <= 3062) {
				this.anInt278 = 0;
			}
		} catch (@Pc(78) RuntimeException local78) {
			signlink.reporterror("53560, " + false + ", " + local78.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "h", descriptor = "(B)V")
	private void method134() {
		try {
			if (this.aClass35_6 == null) {
				this.method155();
				super.aClass35_2 = null;
				this.aClass35_19 = null;
				this.aClass35_20 = null;
				this.aClass35_21 = null;
				this.aClass35_22 = null;
				this.aClass35_23 = null;
				this.aClass35_24 = null;
				this.aClass35_25 = null;
				this.aClass35_26 = null;
				this.aClass35_27 = null;
				this.aClass35_6 = new Class35(this.method94(), 0, 96, 479);
				this.aClass35_4 = new Class35(this.method94(), 0, 156, 172);
				Class1_Sub1_Sub2.method437();
				this.aClass1_Sub1_Sub2_Sub3_2.method418(0, 0);
				this.aClass35_3 = new Class35(this.method94(), 0, 261, 190);
				this.aClass35_5 = new Class35(this.method94(), 0, 334, 512);
				Class1_Sub1_Sub2.method437();
				this.aClass35_16 = new Class35(this.method94(), 0, 50, 496);
				this.aClass35_17 = new Class35(this.method94(), 0, 37, 269);
				this.aClass35_18 = new Class35(this.method94(), 0, 45, 249);
				this.aBoolean65 = true;
			}
		} catch (@Pc(134) RuntimeException local134) {
			signlink.reporterror("74672, " + -125 + ", " + local134.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "g", descriptor = "(Z)V")
	private void method135() {
		try {
			this.aBoolean89 &= true;
			if (aBoolean72 && this.anInt273 == 2 && Class4.anInt162 != this.anInt229) {
				this.aClass35_5.method524(this.anInt198);
				this.aClass1_Sub1_Sub2_Sub4_2.method447("Loading - please wait.", 151, 0, 257);
				this.aClass1_Sub1_Sub2_Sub4_2.method447("Loading - please wait.", 150, 16777215, 256);
				this.aClass35_5.method525(4, super.aGraphics2, 4);
				this.anInt273 = 1;
				this.aLong16 = System.currentTimeMillis();
			}
			if (this.anInt273 == 1) {
				@Pc(58) int local58 = this.method136();
				if (local58 != 0 && System.currentTimeMillis() - this.aLong16 > 360000L) {
					signlink.reporterror(this.aString12 + " glcfb " + this.aLong15 + "," + local58 + "," + aBoolean72 + "," + this.aClass45Array1[0] + "," + this.aClass44_Sub1_1.method646() + "," + this.anInt229 + "," + this.anInt268 + "," + this.anInt269);
					this.aLong16 = System.currentTimeMillis();
				}
			}
			if (this.anInt273 == 2 && this.anInt229 != this.anInt352) {
				this.anInt352 = this.anInt229;
				this.method100(this.anInt229);
			}
		} catch (@Pc(139) RuntimeException local139) {
			signlink.reporterror("29986, " + true + ", " + local139.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "h", descriptor = "(Z)I")
	private int method136() {
		try {
			for (@Pc(3) int local3 = 0; local3 < this.aByteArrayArray2.length; local3++) {
				if (this.aByteArrayArray2[local3] == null && this.anIntArray37[local3] != -1) {
					return -1;
				}
				if (this.aByteArrayArray1[local3] == null && this.anIntArray38[local3] != -1) {
					return -2;
				}
			}
			@Pc(39) boolean local39 = true;
			for (@Pc(41) int local41 = 0; local41 < this.aByteArrayArray2.length; local41++) {
				@Pc(48) byte[] local48 = this.aByteArrayArray1[local41];
				if (local48 != null) {
					@Pc(62) int local62 = (this.anIntArray36[local41] >> 8) * 64 - this.anInt354;
					@Pc(74) int local74 = (this.anIntArray36[local41] & 0xFF) * 64 - this.anInt355;
					local39 &= Class4.method58(local62, local74, local48);
				}
			}
			if (!local39) {
				return -3;
			} else if (this.aBoolean66) {
				return -4;
			} else {
				this.anInt273 = 2;
				Class4.anInt162 = this.anInt229;
				this.method173(this.anInt341);
				this.aClass1_Sub1_Sub3_3.method469(81);
				return 0;
			}
		} catch (@Pc(121) RuntimeException local121) {
			signlink.reporterror("82673, " + true + ", " + local121.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!lb;BI)V")
	private void method137(@OriginalArg(0) Class1_Sub1_Sub3 arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) int arg2) {
		try {
			@Pc(6) boolean local6 = false;
			for (@Pc(17) int local17 = 0; local17 < this.anInt243; local17++) {
				@Pc(24) int local24 = this.anIntArray47[local17];
				@Pc(29) Class1_Sub1_Sub1_Sub1_Sub1 local29 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local24];
				@Pc(32) int local32 = arg0.method480();
				if ((local32 & 0x80) == 128) {
					local32 += arg0.method480() << 8;
				}
				this.method107(arg0, local24, local29, local32);
			}
		} catch (@Pc(58) RuntimeException local58) {
			signlink.reporterror("2164, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local58.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "i", descriptor = "(B)V")
	private void method138() {
		try {
			if (this.anInt353 >= 2 || this.anInt281 != 0 || this.anInt297 != 0) {
				@Pc(40) String local40;
				if (this.anInt281 == 1 && this.anInt353 < 2) {
					local40 = "Use " + this.aString8 + " with...";
				} else if (this.anInt297 == 1 && this.anInt353 < 2) {
					local40 = this.aString9 + "...";
				} else {
					local40 = this.aStringArray1[this.anInt353 - 1];
				}
				if (this.anInt353 > 2) {
					local40 = local40 + "@whi@ / " + (this.anInt353 - 2) + " more options";
				}
				this.aClass1_Sub1_Sub2_Sub4_3.method456(15, 16777215, anInt239 / 1000, local40, 4);
			}
		} catch (@Pc(104) RuntimeException local104) {
			signlink.reporterror("4430, " + 0 + ", " + local104.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "n", descriptor = "(I)V")
	private void method139() {
		try {
			@Pc(12) int local12;
			for (@Pc(5) int local5 = 10; local5 < 117; local5++) {
				local12 = (int) (Math.random() * 100.0D);
				if (local12 < 50) {
					this.anIntArray51[local5 + 32512] = 255;
				}
			}
			this.anInt222 += 0;
			@Pc(47) int local47;
			@Pc(54) int local54;
			@Pc(60) int local60;
			for (local12 = 0; local12 < 100; local12++) {
				local47 = (int) (Math.random() * 124.0D) + 2;
				local54 = (int) (Math.random() * 128.0D) + 128;
				local60 = local47 + (local54 << 7);
				this.anIntArray51[local60] = 192;
			}
			for (local47 = 1; local47 < 255; local47++) {
				for (local54 = 1; local54 < 127; local54++) {
					local60 = local54 + (local47 << 7);
					this.anIntArray52[local60] = (this.anIntArray51[local60 - 1] + this.anIntArray51[local60 + 1] + this.anIntArray51[local60 - 128] + this.anIntArray51[local60 + 128]) / 4;
				}
			}
			this.anInt340 += 128;
			if (this.anInt340 > this.anIntArray87.length) {
				this.anInt340 -= this.anIntArray87.length;
				local54 = (int) (Math.random() * 12.0D);
				this.method149(this.aClass1_Sub1_Sub2_Sub3Array2[local54]);
			}
			@Pc(172) int local172;
			for (local54 = 1; local54 < 255; local54++) {
				for (local60 = 1; local60 < 127; local60++) {
					local172 = local60 + (local54 << 7);
					@Pc(195) int local195 = this.anIntArray52[local172 + 128] - this.anIntArray87[local172 + this.anInt340 & this.anIntArray87.length - 1] / 5;
					if (local195 < 0) {
						local195 = 0;
					}
					this.anIntArray51[local172] = local195;
				}
			}
			for (local60 = 0; local60 < 255; local60++) {
				this.anIntArray65[local60] = this.anIntArray65[local60 + 1];
			}
			this.anIntArray65[255] = (int) (Math.sin((double) anInt239 / 14.0D) * 16.0D + Math.sin((double) anInt239 / 15.0D) * 14.0D + Math.sin((double) anInt239 / 16.0D) * 12.0D);
			if (this.anInt275 > 0) {
				this.anInt275 -= 4;
			}
			if (this.anInt276 > 0) {
				this.anInt276 -= 4;
			}
			if (this.anInt275 == 0 && this.anInt276 == 0) {
				local172 = (int) (Math.random() * 2000.0D);
				if (local172 == 0) {
					this.anInt275 = 1024;
				}
				if (local172 == 1) {
					this.anInt276 = 1024;
					return;
				}
			}
		} catch (@Pc(306) RuntimeException local306) {
			signlink.reporterror("65840, " + 0 + ", " + local306.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(B)V")
	@Override
	protected void method92() {
		try {
			if (this.aBoolean62 || this.aBoolean67 || this.aBoolean54) {
				this.method206();
			} else {
				anInt358++;
				if (this.aBoolean89) {
					this.method204();
				} else {
					this.method158((byte) 9, false);
				}
				this.anInt260 = 0;
			}
		} catch (@Pc(39) RuntimeException local39) {
			signlink.reporterror("21403, " + 9 + ", " + local39.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;Z)V")
	private void method140(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) boolean arg2) {
		signlink.errorname = arg0;
		try {
			if (!arg2) {
				this.aString10 = "";
				this.aString11 = "Connecting to server...";
				this.method158((byte) 9, true);
			}
			this.aClass8_1 = new Class8((byte) -52, this.method186(anInt292 + 43594), this);
			@Pc(30) long local30 = Class48.method667(arg0);
			@Pc(37) int local37 = (int) (local30 >> 16 & 0x1FL);
			this.aClass1_Sub1_Sub3_3.anInt720 = 0;
			this.aClass1_Sub1_Sub3_3.method470(14);
			this.aClass1_Sub1_Sub3_3.method470(local37);
			this.aClass8_1.method251(2, this.aClass1_Sub1_Sub3_3.aByteArray9);
			for (@Pc(60) int local60 = 0; local60 < 8; local60++) {
				this.aClass8_1.method248();
			}
			@Pc(74) int local74 = this.aClass8_1.method248();
			@Pc(76) int local76 = local74;
			@Pc(225) int local225;
			@Pc(259) int local259;
			if (local74 == 0) {
				this.aClass8_1.method250(this.aClass1_Sub1_Sub3_4.aByteArray9, 0, 8);
				this.aClass1_Sub1_Sub3_4.anInt720 = 0;
				this.aLong15 = this.aClass1_Sub1_Sub3_4.method486();
				@Pc(99) int[] local99 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (this.aLong15 >> 32), (int) this.aLong15 };
				this.aClass1_Sub1_Sub3_3.anInt720 = 0;
				this.aClass1_Sub1_Sub3_3.method470(10);
				this.aClass1_Sub1_Sub3_3.method474(local99[0]);
				this.aClass1_Sub1_Sub3_3.method474(local99[1]);
				this.aClass1_Sub1_Sub3_3.method474(local99[2]);
				this.aClass1_Sub1_Sub3_3.method474(local99[3]);
				this.aClass1_Sub1_Sub3_3.method474(signlink.anInt911);
				this.aClass1_Sub1_Sub3_3.method477(arg0);
				this.aClass1_Sub1_Sub3_3.method477(arg1);
				this.aClass1_Sub1_Sub3_3.method495(aBigInteger2, aBigInteger1);
				this.aClass1_Sub1_Sub3_2.anInt720 = 0;
				if (arg2) {
					this.aClass1_Sub1_Sub3_2.method470(18);
				} else {
					this.aClass1_Sub1_Sub3_2.method470(16);
				}
				this.aClass1_Sub1_Sub3_2.method470(this.aClass1_Sub1_Sub3_3.anInt720 + 36 + 1 + 1 + 2);
				this.aClass1_Sub1_Sub3_2.method470(255);
				this.aClass1_Sub1_Sub3_2.method471(298);
				this.aClass1_Sub1_Sub3_2.method470(aBoolean72 ? 1 : 0);
				for (local225 = 0; local225 < 9; local225++) {
					this.aClass1_Sub1_Sub3_2.method474(this.anIntArray85[local225]);
				}
				this.aClass1_Sub1_Sub3_2.method478(this.aClass1_Sub1_Sub3_3.aByteArray9, this.aClass1_Sub1_Sub3_3.anInt720);
				this.aClass1_Sub1_Sub3_3.aClass46_2 = new Class46(local99, 668);
				for (local259 = 0; local259 < 4; local259++) {
					local99[local259] += 50;
				}
				this.aClass46_1 = new Class46(local99, 668);
				this.aClass8_1.method251(this.aClass1_Sub1_Sub3_2.anInt720, this.aClass1_Sub1_Sub3_2.aByteArray9);
				local74 = this.aClass8_1.method248();
			}
			if (local74 == 1) {
				try {
					Thread.sleep(2000L);
				} catch (@Pc(301) Exception local301) {
				}
				this.method140(arg0, arg1, arg2);
			} else {
				@Pc(389) int local389;
				if (local74 == 2) {
					this.anInt316 = this.aClass8_1.method248();
					aBoolean64 = this.aClass8_1.method248() == 1;
					this.aLong18 = 0L;
					this.anInt389 = 0;
					this.aClass11_1.anInt507 = 0;
					super.aBoolean51 = true;
					this.aBoolean92 = true;
					this.aBoolean89 = true;
					this.aClass1_Sub1_Sub3_3.anInt720 = 0;
					this.aClass1_Sub1_Sub3_4.anInt720 = 0;
					this.anInt223 = -1;
					this.anInt345 = -1;
					this.anInt346 = -1;
					this.anInt347 = -1;
					this.anInt222 = 0;
					this.anInt224 = 0;
					this.anInt277 = 0;
					this.anInt226 = 0;
					this.anInt285 = 0;
					this.anInt353 = 0;
					this.aBoolean87 = false;
					super.anInt180 = 0;
					for (local389 = 0; local389 < 100; local389++) {
						this.aStringArray4[local389] = null;
					}
					this.anInt281 = 0;
					this.anInt297 = 0;
					this.anInt273 = 0;
					this.anInt287 = 0;
					this.anInt247 = (int) (Math.random() * 100.0D) - 50;
					this.anInt258 = (int) (Math.random() * 110.0D) - 55;
					this.anInt236 = (int) (Math.random() * 80.0D) - 40;
					this.anInt310 = (int) (Math.random() * 120.0D) - 60;
					this.anInt261 = (int) (Math.random() * 30.0D) - 20;
					this.anInt391 = (int) (Math.random() * 20.0D) - 10 & 0x7FF;
					this.anInt211 = 0;
					this.anInt352 = -1;
					this.anInt201 = 0;
					this.anInt202 = 0;
					this.anInt242 = 0;
					this.anInt395 = 0;
					for (local225 = 0; local225 < this.anInt240; local225++) {
						this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local225] = null;
						this.aClass1_Sub1_Sub3Array1[local225] = null;
					}
					for (local259 = 0; local259 < 16384; local259++) {
						this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local259] = null;
					}
					aClass1_Sub1_Sub1_Sub1_Sub1_1 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[this.anInt241] = new Class1_Sub1_Sub1_Sub1_Sub1();
					this.aClass29_3.method515();
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
					this.aClass29_1 = new Class29(-16188);
					this.anInt351 = 0;
					this.anInt350 = 0;
					this.anInt314 = -1;
					this.anInt197 = -1;
					this.anInt324 = -1;
					this.anInt245 = -1;
					this.anInt333 = -1;
					this.aBoolean94 = false;
					this.anInt270 = 3;
					this.aBoolean79 = false;
					this.aBoolean87 = false;
					this.aBoolean69 = false;
					this.aString5 = null;
					this.anInt212 = 0;
					this.anInt244 = -1;
					this.aBoolean58 = true;
					this.method228(this.aByte5);
					for (local534 = 0; local534 < 5; local534++) {
						this.anIntArray59[local534] = 0;
					}
					for (local538 = 0; local538 < 5; local538++) {
						this.aStringArray6[local538] = null;
						this.aBooleanArray4[local538] = false;
					}
					anInt194 = 0;
					anInt396 = 0;
					anInt302 = 0;
					anInt257 = 0;
					anInt250 = 0;
					anInt306 = 0;
					anInt218 = 0;
					anInt348 = 0;
					anInt320 = 0;
					this.method134();
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
					this.aBoolean89 = true;
					this.aClass1_Sub1_Sub3_3.anInt720 = 0;
					this.aClass1_Sub1_Sub3_4.anInt720 = 0;
					this.anInt223 = -1;
					this.anInt345 = -1;
					this.anInt346 = -1;
					this.anInt347 = -1;
					this.anInt222 = 0;
					this.anInt224 = 0;
					this.anInt277 = 0;
					this.anInt353 = 0;
					this.aBoolean87 = false;
					this.aLong16 = System.currentTimeMillis();
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
					for (local389 = this.aClass8_1.method248(); local389 >= 0; local389--) {
						this.aString10 = "You have only just left another world";
						this.aString11 = "Your profile will be transferred in: " + local389 + " seconds";
						this.method158((byte) 9, true);
						try {
							Thread.sleep(1000L);
						} catch (@Pc(900) Exception local900) {
						}
					}
					this.method140(arg0, arg1, arg2);
				} else if (local74 != -1) {
					System.out.println("response:" + local74);
					this.aString10 = "Unexpected server response";
					this.aString11 = "Please try using a different world.";
				} else if (local76 != 0) {
					this.aString10 = "No response from server";
					this.aString11 = "Please try using a different world.";
				} else if (this.anInt374 < 2) {
					try {
						Thread.sleep(2000L);
					} catch (@Pc(922) Exception local922) {
					}
					this.anInt374++;
					this.method140(arg0, arg1, arg2);
				} else {
					this.aString10 = "No response from loginserver";
					this.aString11 = "Please wait 1 minute and try again.";
				}
			}
		} catch (@Pc(965) IOException local965) {
			this.aString10 = "";
			this.aString11 = "Error connecting to server.";
		}
	}

	@OriginalMember(owner = "client!client", name = "o", descriptor = "(I)V")
	private void method141() {
		try {
			@Pc(6) int local6 = this.anInt213 * 128 + 64;
			@Pc(13) int local13 = this.anInt214 * 128 + 64;
			@Pc(24) int local24 = this.method219(this.anInt229, local13, local6) - this.anInt215;
			if (this.anInt375 < local6) {
				this.anInt375 += this.anInt216 + (local6 - this.anInt375) * this.anInt217 / 1000;
				if (this.anInt375 > local6) {
					this.anInt375 = local6;
				}
			}
			if (this.anInt375 > local6) {
				this.anInt375 -= this.anInt216 + (this.anInt375 - local6) * this.anInt217 / 1000;
				if (this.anInt375 < local6) {
					this.anInt375 = local6;
				}
			}
			if (this.anInt376 < local24) {
				this.anInt376 += this.anInt216 + (local24 - this.anInt376) * this.anInt217 / 1000;
				if (this.anInt376 > local24) {
					this.anInt376 = local24;
				}
			}
			if (this.anInt376 > local24) {
				this.anInt376 -= this.anInt216 + (this.anInt376 - local24) * this.anInt217 / 1000;
				if (this.anInt376 < local24) {
					this.anInt376 = local24;
				}
			}
			if (this.anInt377 < local13) {
				this.anInt377 += this.anInt216 + (local13 - this.anInt377) * this.anInt217 / 1000;
				if (this.anInt377 > local13) {
					this.anInt377 = local13;
				}
			}
			if (this.anInt377 > local13) {
				this.anInt377 -= this.anInt216 + (this.anInt377 - local13) * this.anInt217 / 1000;
				if (this.anInt377 < local13) {
					this.anInt377 = local13;
				}
			}
			local6 = this.anInt363 * 128 + 64;
			local13 = this.anInt364 * 128 + 64;
			local24 = this.method219(this.anInt229, local13, local6) - this.anInt365;
			@Pc(225) int local225 = local6 - this.anInt375;
			@Pc(230) int local230 = local24 - this.anInt376;
			@Pc(235) int local235 = local13 - this.anInt377;
			@Pc(246) int local246 = (int) Math.sqrt((double) (local225 * local225 + local235 * local235));
			@Pc(257) int local257 = (int) (Math.atan2((double) local230, (double) local246) * 325.949D) & 0x7FF;
			@Pc(268) int local268 = (int) (Math.atan2((double) local225, (double) local235) * -325.949D) & 0x7FF;
			if (local257 < 128) {
				local257 = 128;
			}
			if (local257 > 383) {
				local257 = 383;
			}
			if (this.anInt378 < local257) {
				this.anInt378 += this.anInt366 + (local257 - this.anInt378) * this.anInt367 / 1000;
				if (this.anInt378 > local257) {
					this.anInt378 = local257;
				}
			}
			if (this.anInt378 > local257) {
				this.anInt378 -= this.anInt366 + (this.anInt378 - local257) * this.anInt367 / 1000;
				if (this.anInt378 < local257) {
					this.anInt378 = local257;
				}
			}
			@Pc(339) int local339 = local268 - this.anInt379;
			if (local339 > 1024) {
				local339 -= 2048;
			}
			if (local339 < -1024) {
				local339 += 2048;
			}
			if (local339 > 0) {
				this.anInt379 += this.anInt366 + local339 * this.anInt367 / 1000;
				this.anInt379 &= 0x7FF;
			}
			if (local339 < 0) {
				this.anInt379 -= this.anInt366 + -local339 * this.anInt367 / 1000;
				this.anInt379 &= 0x7FF;
			}
			@Pc(397) int local397 = local268 - this.anInt379;
			if (local397 > 1024) {
				local397 -= 2048;
			}
			if (local397 < -1024) {
				local397 += 2048;
			}
			if (local397 < 0 && local339 > 0 || local397 > 0 && local339 < 0) {
				this.anInt379 = local268;
			}
		} catch (@Pc(418) RuntimeException local418) {
			signlink.reporterror("38129, " + -267 + ", " + local418.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IZ)V")
	private void method142(@OriginalArg(0) int arg0) {
		try {
			@Pc(4) int local4 = Class39.aClass39Array1[arg0].anInt869;
			if (local4 != 0) {
				@Pc(18) int local18 = this.anIntArray56[arg0];
				if (local4 == 1) {
					if (local18 == 1) {
						Class1_Sub1_Sub2_Sub1.method351(0.9D);
					}
					if (local18 == 2) {
						Class1_Sub1_Sub2_Sub1.method351(0.8D);
					}
					if (local18 == 3) {
						Class1_Sub1_Sub2_Sub1.method351(0.7D);
					}
					if (local18 == 4) {
						Class1_Sub1_Sub2_Sub1.method351(0.6D);
					}
					Class15.aClass40_8.method593();
					this.aBoolean65 = true;
				}
				if (local4 == 3) {
					@Pc(56) boolean local56 = this.aBoolean90;
					if (local18 == 0) {
						this.method143(this.aBoolean90, 0);
						this.aBoolean90 = true;
					}
					if (local18 == 1) {
						this.method143(this.aBoolean90, -400);
						this.aBoolean90 = true;
					}
					if (local18 == 2) {
						this.method143(this.aBoolean90, -800);
						this.aBoolean90 = true;
					}
					if (local18 == 3) {
						this.method143(this.aBoolean90, -1200);
						this.aBoolean90 = true;
					}
					if (local18 == 4) {
						this.aBoolean90 = false;
					}
					if (this.aBoolean90 != local56 && !aBoolean72) {
						if (this.aBoolean90) {
							this.anInt308 = this.anInt317;
							this.aBoolean75 = true;
							this.aClass44_Sub1_1.method645(2, this.anInt308);
						} else {
							this.method189();
						}
						this.anInt238 = 0;
					}
				}
				if (local4 == 4) {
					if (local18 == 0) {
						this.aBoolean91 = true;
						this.method169(0);
					}
					if (local18 == 1) {
						this.aBoolean91 = true;
						this.method169(-400);
					}
					if (local18 == 2) {
						this.aBoolean91 = true;
						this.method169(-800);
					}
					if (local18 == 3) {
						this.aBoolean91 = true;
						this.method169(-1200);
					}
					if (local18 == 4) {
						this.aBoolean91 = false;
					}
				}
				if (local4 == 5) {
					this.anInt219 = local18;
				}
				if (local4 == 6) {
					this.anInt349 = local18;
				}
				if (local4 == 8) {
					this.anInt359 = local18;
					this.aBoolean88 = true;
				}
				if (local4 == 9) {
					this.anInt249 = local18;
				}
			}
		} catch (@Pc(216) RuntimeException local216) {
			signlink.reporterror("72431, " + arg0 + ", " + true + ", " + local216.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IZI)V")
	private void method143(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1) {
		try {
			signlink.anInt916 = arg1;
			if (arg0) {
				signlink.midi = "voladjust";
			}
		} catch (@Pc(18) RuntimeException local18) {
			signlink.reporterror("93567, " + -34188 + ", " + arg0 + ", " + arg1 + ", " + local18.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(II)V")
	private void method144(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(9) Class29 local9 = this.aClass29ArrayArrayArray1[this.anInt229][arg0][arg1];
		if (local9 == null) {
			this.aClass37_1.method551(this.anInt229, arg0, arg1);
			return;
		}
		@Pc(21) int local21 = -99999999;
		@Pc(23) Class1_Sub1_Sub1_Sub3 local23 = null;
		@Pc(27) Class1_Sub1_Sub1_Sub3 local27;
		for (local27 = (Class1_Sub1_Sub1_Sub3) local9.method511(); local27 != null; local27 = (Class1_Sub1_Sub1_Sub3) local9.method513()) {
			@Pc(32) Class15 local32 = Class15.method361(local27.anInt168);
			@Pc(35) int local35 = local32.anInt583;
			if (local32.aBoolean164) {
				local35 *= local27.anInt169 + 1;
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
			if (local27.anInt168 != local23.anInt168 && local65 == null) {
				local65 = local27;
			}
			if (local27.anInt168 != local23.anInt168 && local27.anInt168 != local65.anInt168 && local67 == null) {
				local67 = local27;
			}
		}
		@Pc(110) int local110 = arg0 + (arg1 << 7) + 1610612736;
		this.aClass37_1.method537(local110, this.method219(this.anInt229, arg1 * 128 + 64, arg0 * 128 + 64), this.anInt229, arg0, (byte) 3, arg1, local65, local23, local67);
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(ZJ)V")
	private void method145(@OriginalArg(1) long arg0) {
		try {
			this.aBoolean89 &= true;
			if (arg0 != 0L) {
				for (@Pc(14) int local14 = 0; local14 < this.anInt350; local14++) {
					if (this.aLongArray3[local14] == arg0) {
						this.anInt350--;
						this.aBoolean73 = true;
						for (@Pc(34) int local34 = local14; local34 < this.anInt350; local34++) {
							this.aStringArray2[local34] = this.aStringArray2[local34 + 1];
							this.anIntArray48[local34] = this.anIntArray48[local34 + 1];
							this.aLongArray3[local34] = this.aLongArray3[local34 + 1];
						}
						this.aClass1_Sub1_Sub3_3.method469(160);
						this.aClass1_Sub1_Sub3_3.method476(arg0, (byte) 3);
						return;
					}
				}
			}
		} catch (@Pc(89) RuntimeException local89) {
			signlink.reporterror("1848, " + true + ", " + arg0 + ", " + local89.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "p", descriptor = "(I)I")
	private int method146() {
		try {
			@Pc(3) int local3 = 3;
			if (this.anInt378 < 310) {
				@Pc(19) int local19 = this.anInt375 >> 7;
				@Pc(24) int local24 = this.anInt377 >> 7;
				@Pc(29) int local29 = aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt962 >> 7;
				@Pc(34) int local34 = aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt963 >> 7;
				if ((this.aByteArrayArrayArray7[this.anInt229][local19][local24] & 0x4) != 0) {
					local3 = this.anInt229;
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
						if ((this.aByteArrayArrayArray7[this.anInt229][local19][local24] & 0x4) != 0) {
							local3 = this.anInt229;
						}
						local86 += local84;
						if (local86 >= 65536) {
							local86 -= 65536;
							if (local24 < local34) {
								local24++;
							} else if (local24 > local34) {
								local24--;
							}
							if ((this.aByteArrayArrayArray7[this.anInt229][local19][local24] & 0x4) != 0) {
								local3 = this.anInt229;
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
						if ((this.aByteArrayArrayArray7[this.anInt229][local19][local24] & 0x4) != 0) {
							local3 = this.anInt229;
						}
						local86 += local84;
						if (local86 >= 65536) {
							local86 -= 65536;
							if (local19 < local29) {
								local19++;
							} else if (local19 > local29) {
								local19--;
							}
							if ((this.aByteArrayArrayArray7[this.anInt229][local19][local24] & 0x4) != 0) {
								local3 = this.anInt229;
							}
						}
					}
				}
			}
			if ((this.aByteArrayArrayArray7[this.anInt229][aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt962 >> 7][aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt963 >> 7] & 0x4) != 0) {
				local3 = this.anInt229;
			}
			return local3;
		} catch (@Pc(252) RuntimeException local252) {
			signlink.reporterror("31144, " + -817 + ", " + local252.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "q", descriptor = "(I)I")
	private int method147() {
		try {
			@Pc(9) int local9 = this.method219(this.anInt229, this.anInt377, this.anInt375);
			this.anInt222 += 0;
			return local9 - this.anInt376 >= 800 || (this.aByteArrayArrayArray7[this.anInt229][this.anInt375 >> 7][this.anInt377 >> 7] & 0x4) == 0 ? 3 : this.anInt229;
		} catch (@Pc(45) RuntimeException local45) {
			signlink.reporterror("76202, " + 0 + ", " + local45.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "run", descriptor = "()V")
	@Override
	public void run() {
		if (this.aBoolean93) {
			this.method188();
		} else {
			super.run();
		}
	}

	@OriginalMember(owner = "client!client", name = "j", descriptor = "(B)V")
	private void method148() {
		try {
			@Pc(7) int local7 = this.aClass1_Sub1_Sub2_Sub4_3.method449("Choose Option");
			@Pc(26) int local26;
			for (@Pc(15) int local15 = 0; local15 < this.anInt353; local15++) {
				local26 = this.aClass1_Sub1_Sub2_Sub4_3.method449(this.aStringArray1[local15]);
				if (local26 > local7) {
					local7 = local26;
				}
			}
			local7 += 8;
			local26 = this.anInt353 * 15 + 21;
			@Pc(69) int local69;
			@Pc(87) int local87;
			if (super.anInt188 > 4 && super.anInt189 > 4 && super.anInt188 < 516 && super.anInt189 < 338) {
				local69 = super.anInt188 - local7 / 2 - 4;
				if (local69 + local7 > 512) {
					local69 = 512 - local7;
				}
				if (local69 < 0) {
					local69 = 0;
				}
				local87 = super.anInt189 - 4;
				if (local87 + local26 > 334) {
					local87 = 334 - local26;
				}
				if (local87 < 0) {
					local87 = 0;
				}
				this.aBoolean87 = true;
				this.anInt252 = 0;
				this.anInt253 = local69;
				this.anInt254 = local87;
				this.anInt255 = local7;
				this.anInt256 = this.anInt353 * 15 + 22;
			}
			if (super.anInt188 > 553 && super.anInt189 > 205 && super.anInt188 < 743 && super.anInt189 < 466) {
				local69 = super.anInt188 - local7 / 2 - 553;
				if (local69 < 0) {
					local69 = 0;
				} else if (local69 + local7 > 190) {
					local69 = 190 - local7;
				}
				local87 = super.anInt189 - 205;
				if (local87 < 0) {
					local87 = 0;
				} else if (local87 + local26 > 261) {
					local87 = 261 - local26;
				}
				this.aBoolean87 = true;
				this.anInt252 = 1;
				this.anInt253 = local69;
				this.anInt254 = local87;
				this.anInt255 = local7;
				this.anInt256 = this.anInt353 * 15 + 22;
			}
			if (super.anInt188 > 17 && super.anInt189 > 357 && super.anInt188 < 496 && super.anInt189 < 453) {
				local69 = super.anInt188 - local7 / 2 - 17;
				if (local69 < 0) {
					local69 = 0;
				} else if (local69 + local7 > 479) {
					local69 = 479 - local7;
				}
				local87 = super.anInt189 - 357;
				if (local87 < 0) {
					local87 = 0;
				} else if (local87 + local26 > 96) {
					local87 = 96 - local26;
				}
				this.aBoolean87 = true;
				this.anInt252 = 2;
				this.anInt253 = local69;
				this.anInt254 = local87;
				this.anInt255 = local7;
				this.anInt256 = this.anInt353 * 15 + 22;
			}
		} catch (@Pc(291) RuntimeException local291) {
			signlink.reporterror("1255, " + 9 + ", " + local291.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILclient!jb;)V")
	private void method149(@OriginalArg(1) Class1_Sub1_Sub2_Sub3 arg0) {
		try {
			for (@Pc(5) int local5 = 0; local5 < this.anIntArray87.length; local5++) {
				this.anIntArray87[local5] = 0;
			}
			@Pc(30) int local30;
			for (@Pc(20) int local20 = 0; local20 < 5000; local20++) {
				local30 = (int) (Math.random() * 128.0D * (double) 256);
				this.anIntArray87[local30] = (int) (Math.random() * 256.0D);
			}
			@Pc(55) int local55;
			@Pc(59) int local59;
			@Pc(67) int local67;
			for (local30 = 0; local30 < 20; local30++) {
				for (local55 = 1; local55 < 255; local55++) {
					for (local59 = 1; local59 < 127; local59++) {
						local67 = local59 + (local55 << 7);
						this.anIntArray88[local67] = (this.anIntArray87[local67 - 1] + this.anIntArray87[local67 + 1] + this.anIntArray87[local67 - 128] + this.anIntArray87[local67 + 128]) / 4;
					}
				}
				@Pc(113) int[] local113 = this.anIntArray87;
				this.anIntArray87 = this.anIntArray88;
				this.anIntArray88 = local113;
			}
			if (arg0 != null) {
				local55 = 0;
				for (local59 = 0; local59 < arg0.anInt654; local59++) {
					for (local67 = 0; local67 < arg0.anInt653; local67++) {
						if (arg0.aByteArray7[local55++] != 0) {
							@Pc(149) int local149 = local67 + arg0.anInt655 + 16;
							@Pc(156) int local156 = local59 + arg0.anInt656 + 16;
							@Pc(162) int local162 = local149 + (local156 << 7);
							this.anIntArray87[local162] = 0;
						}
					}
				}
			}
		} catch (@Pc(179) RuntimeException local179) {
			signlink.reporterror("17905, " + 16169 + ", " + arg0 + ", " + local179.toString());
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

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ZILclient!y;)V")
	private void method150(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub1_Sub1_Sub1 arg1) {
		try {
			this.aBoolean89 &= true;
			this.method151(arg1.anInt962, arg0, arg1.anInt963);
		} catch (@Pc(15) RuntimeException local15) {
			signlink.reporterror("61667, " + true + ", " + arg0 + ", " + arg1 + ", " + local15.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIII)V")
	private void method151(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		try {
			if (arg0 >= 128 && arg2 >= 128 && arg0 <= 13056 && arg2 <= 13056) {
				@Pc(28) int local28 = this.method219(this.anInt229, arg2, arg0) - arg1;
				@Pc(33) int local33 = arg0 - this.anInt375;
				@Pc(46) int local46 = local28 - this.anInt376;
				@Pc(51) int local51 = arg2 - this.anInt377;
				@Pc(56) int local56 = Class1_Sub1_Sub1_Sub5.anIntArray151[this.anInt378];
				@Pc(61) int local61 = Class1_Sub1_Sub1_Sub5.anIntArray152[this.anInt378];
				@Pc(66) int local66 = Class1_Sub1_Sub1_Sub5.anIntArray151[this.anInt379];
				@Pc(71) int local71 = Class1_Sub1_Sub1_Sub5.anIntArray152[this.anInt379];
				@Pc(81) int local81 = local51 * local66 + local33 * local71 >> 16;
				@Pc(91) int local91 = local51 * local71 - local33 * local66 >> 16;
				@Pc(93) int local93 = local81;
				@Pc(103) int local103 = local46 * local61 - local91 * local56 >> 16;
				@Pc(113) int local113 = local46 * local56 + local91 * local61 >> 16;
				if (local113 >= 50) {
					this.anInt386 = Class1_Sub1_Sub2_Sub1.anInt566 + (local93 << 9) / local113;
					this.anInt387 = Class1_Sub1_Sub2_Sub1.anInt567 + (local103 << 9) / local113;
				} else {
					this.anInt386 = -1;
					this.anInt387 = -1;
				}
			} else {
				this.anInt386 = -1;
				this.anInt387 = -1;
			}
		} catch (@Pc(145) RuntimeException local145) {
			signlink.reporterror("49601, " + 902 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local145.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "r", descriptor = "(I)V")
	private void method152() {
		try {
			if (this.anInt359 != 0) {
				@Pc(11) int local11 = 0;
				if (this.anInt277 != 0) {
					local11 = 1;
				}
				for (@Pc(18) int local18 = 0; local18 < 100; local18++) {
					if (this.aStringArray4[local18] != null) {
						@Pc(30) int local30 = this.anIntArray66[local18];
						@Pc(35) String local35 = this.aStringArray3[local18];
						if (local35 != null && local35.startsWith("@cr1@")) {
							local35 = local35.substring(5);
						}
						if (local35 != null && local35.startsWith("@cr2@")) {
							local35 = local35.substring(5);
						}
						if ((local30 == 3 || local30 == 7) && (local30 == 7 || this.anInt264 == 0 || this.anInt264 == 1 && this.method225(local35))) {
							@Pc(88) int local88 = 329 - local11 * 13;
							if (super.anInt182 > 4 && super.anInt183 - 4 > local88 - 10 && super.anInt183 - 4 <= local88 + 3) {
								@Pc(127) int local127 = this.aClass1_Sub1_Sub2_Sub4_2.method449("From:  " + local35 + this.aStringArray4[local18]) + 25;
								if (local127 > 450) {
									local127 = 450;
								}
								if (super.anInt182 < local127 + 4) {
									if (this.anInt316 >= 1) {
										this.aStringArray1[this.anInt353] = "Report abuse @whi@" + local35;
										this.anIntArray34[this.anInt353] = 2524;
										this.anInt353++;
									}
									this.aStringArray1[this.anInt353] = "Add ignore @whi@" + local35;
									this.anIntArray34[this.anInt353] = 2047;
									this.anInt353++;
									this.aStringArray1[this.anInt353] = "Add friend @whi@" + local35;
									this.anIntArray34[this.anInt353] = 2605;
									this.anInt353++;
								}
							}
							local11++;
							if (local11 >= 5) {
								return;
							}
						}
						if ((local30 == 5 || local30 == 6) && this.anInt264 < 2) {
							local11++;
							if (local11 >= 5) {
								return;
							}
						}
					}
				}
			}
		} catch (@Pc(240) RuntimeException local240) {
			signlink.reporterror("40034, " + 205 + ", " + local240.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "i", descriptor = "(Z)V")
	private void method153() {
		try {
			this.method111();
			if (this.anInt373 == 1) {
				this.aClass1_Sub1_Sub2_Sub2Array3[this.anInt372 / 100].method391(this.anInt370 - 8 - 4, this.anInt371 - 8 - 4);
			}
			if (this.anInt373 == 2) {
				this.aClass1_Sub1_Sub2_Sub2Array3[this.anInt372 / 100 + 4].method391(this.anInt370 - 8 - 4, this.anInt371 - 8 - 4);
				anInt199++;
				if (anInt199 > 57) {
					anInt199 = 0;
					this.aClass1_Sub1_Sub3_3.method469(34);
				}
			}
			if (this.anInt333 != -1) {
				this.method220(this.anInt338, this.anInt333);
				this.method190(0, 0, Class6.aClass6Array1[this.anInt333], 0);
			}
			if (this.anInt324 != -1) {
				this.method220(this.anInt338, this.anInt324);
				this.method190(0, 0, Class6.aClass6Array1[this.anInt324], 0);
			}
			this.method133();
			if (!this.aBoolean87) {
				this.method112();
				this.method138();
			} else if (this.anInt252 == 0) {
				this.method174();
			}
			if (this.anInt212 == 1) {
				this.aClass1_Sub1_Sub2_Sub2Array4[1].method391(472, 296);
			}
			@Pc(179) int local179;
			if (aBoolean70) {
				@Pc(155) byte local155 = 20;
				@Pc(157) int local157 = 16776960;
				if (super.anInt177 < 15) {
					local157 = 16711680;
				}
				this.aClass1_Sub1_Sub2_Sub4_2.method446("Fps:" + super.anInt177, 20, local157);
				local179 = local155 + 15;
				@Pc(181) Runtime local181 = Runtime.getRuntime();
				@Pc(190) int local190 = (int) ((local181.totalMemory() - local181.freeMemory()) / 1024L);
				if (local190 > 33554432 && aBoolean72) {
				}
				this.aClass1_Sub1_Sub2_Sub4_2.method446("Mem:" + local190 + "k", 35, 16776960);
				local179 += 15;
			}
			if (this.anInt277 != 0) {
				@Pc(224) int local224 = this.anInt277 / 50;
				local179 = local224 / 60;
				@Pc(232) int local232 = local224 % 60;
				if (local232 < 10) {
					this.aClass1_Sub1_Sub2_Sub4_2.method451("System update in: " + local179 + ":0" + local232, 329, 4, 16776960);
				} else {
					this.aClass1_Sub1_Sub2_Sub4_2.method451("System update in: " + local179 + ":" + local232, 329, 4, 16776960);
				}
			}
		} catch (@Pc(274) RuntimeException local274) {
			signlink.reporterror("41190, " + true + ", " + local274.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ZIII)I")
	private int method154(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		try {
			@Pc(9) int local9 = 256 - arg0;
			return ((arg2 & 0xFF00FF) * local9 + (arg1 & 0xFF00FF) * arg0 & 0xFF00FF00) + ((arg2 & 0xFF00) * local9 + (arg1 & 0xFF00) * arg0 & 0xFF0000) >> 8;
		} catch (@Pc(40) RuntimeException local40) {
			signlink.reporterror("34368, " + false + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local40.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "s", descriptor = "(I)V")
	private void method155() {
		try {
			this.aBoolean81 = false;
			while (this.aBoolean77) {
				this.aBoolean81 = false;
				try {
					Thread.sleep(50L);
				} catch (@Pc(11) Exception local11) {
				}
			}
			this.aClass1_Sub1_Sub2_Sub3_14 = null;
			this.aClass1_Sub1_Sub2_Sub3_15 = null;
			this.aClass1_Sub1_Sub2_Sub3Array2 = null;
			this.anIntArray39 = null;
			this.anIntArray40 = null;
			this.anIntArray41 = null;
			this.anIntArray42 = null;
			this.anIntArray87 = null;
			this.anIntArray88 = null;
			this.anIntArray51 = null;
			this.anIntArray52 = null;
			this.aClass1_Sub1_Sub2_Sub2_9 = null;
			this.aClass1_Sub1_Sub2_Sub2_10 = null;
		} catch (@Pc(65) RuntimeException local65) {
			signlink.reporterror("34837, " + 0 + ", " + local65.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIIIIZIIBII)Z")
	private boolean method156(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) byte arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11) {
		try {
			@Pc(11) int local11;
			for (@Pc(7) int local7 = 0; local7 < 104; local7++) {
				for (local11 = 0; local11 < 104; local11++) {
					this.anIntArrayArray5[local7][local11] = 0;
					this.anIntArrayArray4[local7][local11] = 99999999;
				}
			}
			local11 = arg1;
			@Pc(39) int local39 = arg0;
			this.anIntArrayArray5[arg1][arg0] = 99;
			this.anIntArrayArray4[arg1][arg0] = 0;
			@Pc(55) byte local55 = 0;
			@Pc(57) int local57 = 0;
			this.anIntArray92[0] = arg1;
			@Pc(66) int local66 = local55 + 1;
			this.anIntArray93[0] = arg0;
			@Pc(70) boolean local70 = false;
			@Pc(74) int local74 = this.anIntArray92.length;
			@Pc(81) int[][] local81 = this.aClass19Array1[this.anInt229].anIntArrayArray18;
			if (this.aByte6 == 4) {
				@Pc(87) boolean local87 = false;
			} else {
				anInt380 = this.aClass46_1.method662();
			}
			@Pc(205) int local205;
			while (local57 != local66) {
				local11 = this.anIntArray92[local57];
				local39 = this.anIntArray93[local57];
				local57 = (local57 + 1) % local74;
				if (local11 == arg3 && local39 == arg4) {
					local70 = true;
					break;
				}
				if (arg5 != 0) {
					if ((arg5 < 5 || arg5 == 10) && this.aClass19Array1[this.anInt229].method429(local39, arg5 - 1, local11, arg11, arg4, arg3)) {
						local70 = true;
						break;
					}
					if (arg5 < 10 && this.aClass19Array1[this.anInt229].method430(local39, arg5 - 1, arg3, arg11, arg4, local11)) {
						local70 = true;
						break;
					}
				}
				if (arg8 != 0 && arg7 != 0 && this.aClass19Array1[this.anInt229].method431(arg2, this.anInt251, arg3, arg4, local11, arg7, arg8, local39)) {
					local70 = true;
					break;
				}
				local205 = this.anIntArrayArray4[local11][local39] + 1;
				if (local11 > 0 && this.anIntArrayArray5[local11 - 1][local39] == 0 && (local81[local11 - 1][local39] & 0x280108) == 0) {
					this.anIntArray92[local66] = local11 - 1;
					this.anIntArray93[local66] = local39;
					local66 = (local66 + 1) % local74;
					this.anIntArrayArray5[local11 - 1][local39] = 2;
					this.anIntArrayArray4[local11 - 1][local39] = local205;
				}
				if (local11 < 103 && this.anIntArrayArray5[local11 + 1][local39] == 0 && (local81[local11 + 1][local39] & 0x280180) == 0) {
					this.anIntArray92[local66] = local11 + 1;
					this.anIntArray93[local66] = local39;
					local66 = (local66 + 1) % local74;
					this.anIntArrayArray5[local11 + 1][local39] = 8;
					this.anIntArrayArray4[local11 + 1][local39] = local205;
				}
				if (local39 > 0 && this.anIntArrayArray5[local11][local39 - 1] == 0 && (local81[local11][local39 - 1] & 0x280102) == 0) {
					this.anIntArray92[local66] = local11;
					this.anIntArray93[local66] = local39 - 1;
					local66 = (local66 + 1) % local74;
					this.anIntArrayArray5[local11][local39 - 1] = 1;
					this.anIntArrayArray4[local11][local39 - 1] = local205;
				}
				if (local39 < 103 && this.anIntArrayArray5[local11][local39 + 1] == 0 && (local81[local11][local39 + 1] & 0x280120) == 0) {
					this.anIntArray92[local66] = local11;
					this.anIntArray93[local66] = local39 + 1;
					local66 = (local66 + 1) % local74;
					this.anIntArrayArray5[local11][local39 + 1] = 4;
					this.anIntArrayArray4[local11][local39 + 1] = local205;
				}
				if (local11 > 0 && local39 > 0 && this.anIntArrayArray5[local11 - 1][local39 - 1] == 0 && (local81[local11 - 1][local39 - 1] & 0x28010E) == 0 && (local81[local11 - 1][local39] & 0x280108) == 0 && (local81[local11][local39 - 1] & 0x280102) == 0) {
					this.anIntArray92[local66] = local11 - 1;
					this.anIntArray93[local66] = local39 - 1;
					local66 = (local66 + 1) % local74;
					this.anIntArrayArray5[local11 - 1][local39 - 1] = 3;
					this.anIntArrayArray4[local11 - 1][local39 - 1] = local205;
				}
				if (local11 < 103 && local39 > 0 && this.anIntArrayArray5[local11 + 1][local39 - 1] == 0 && (local81[local11 + 1][local39 - 1] & 0x280183) == 0 && (local81[local11 + 1][local39] & 0x280180) == 0 && (local81[local11][local39 - 1] & 0x280102) == 0) {
					this.anIntArray92[local66] = local11 + 1;
					this.anIntArray93[local66] = local39 - 1;
					local66 = (local66 + 1) % local74;
					this.anIntArrayArray5[local11 + 1][local39 - 1] = 9;
					this.anIntArrayArray4[local11 + 1][local39 - 1] = local205;
				}
				if (local11 > 0 && local39 < 103 && this.anIntArrayArray5[local11 - 1][local39 + 1] == 0 && (local81[local11 - 1][local39 + 1] & 0x280138) == 0 && (local81[local11 - 1][local39] & 0x280108) == 0 && (local81[local11][local39 + 1] & 0x280120) == 0) {
					this.anIntArray92[local66] = local11 - 1;
					this.anIntArray93[local66] = local39 + 1;
					local66 = (local66 + 1) % local74;
					this.anIntArrayArray5[local11 - 1][local39 + 1] = 6;
					this.anIntArrayArray4[local11 - 1][local39 + 1] = local205;
				}
				if (local11 < 103 && local39 < 103 && this.anIntArrayArray5[local11 + 1][local39 + 1] == 0 && (local81[local11 + 1][local39 + 1] & 0x2801E0) == 0 && (local81[local11 + 1][local39] & 0x280180) == 0 && (local81[local11][local39 + 1] & 0x280120) == 0) {
					this.anIntArray92[local66] = local11 + 1;
					this.anIntArray93[local66] = local39 + 1;
					local66 = (local66 + 1) % local74;
					this.anIntArrayArray5[local11 + 1][local39 + 1] = 12;
					this.anIntArrayArray4[local11 + 1][local39 + 1] = local205;
				}
			}
			this.anInt368 = 0;
			@Pc(821) int local821;
			@Pc(827) int local827;
			@Pc(833) int local833;
			if (!local70) {
				if (arg6) {
					local205 = 100;
					for (local821 = 1; local821 < 2; local821++) {
						for (local827 = arg3 - local821; local827 <= arg3 + local821; local827++) {
							for (local833 = arg4 - local821; local833 <= arg4 + local821; local833++) {
								if (local827 >= 0 && local833 >= 0 && local827 < 104 && local833 < 104 && this.anIntArrayArray4[local827][local833] < local205) {
									local205 = this.anIntArrayArray4[local827][local833];
									local11 = local827;
									local39 = local833;
									this.anInt368 = 1;
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
			@Pc(894) byte local894 = 0;
			this.anIntArray92[0] = local11;
			local57 = local894 + 1;
			this.anIntArray93[0] = local39;
			local205 = local821 = this.anIntArrayArray5[local11][local39];
			while (local11 != arg1 || local39 != arg0) {
				if (local205 != local821) {
					local821 = local205;
					this.anIntArray92[local57] = local11;
					this.anIntArray93[local57++] = local39;
				}
				if ((local205 & 0x2) != 0) {
					local11++;
				} else if ((local205 & 0x8) != 0) {
					local11--;
				}
				if ((local205 & 0x1) != 0) {
					local39++;
				} else if ((local205 & 0x4) != 0) {
					local39--;
				}
				local205 = this.anIntArrayArray5[local11][local39];
			}
			if (local57 > 0) {
				local74 = local57;
				if (local57 > 25) {
					local74 = 25;
				}
				local57--;
				local827 = this.anIntArray92[local57];
				local833 = this.anIntArray93[local57];
				if (arg10 == 0) {
					this.aClass1_Sub1_Sub3_3.method469(141);
					this.aClass1_Sub1_Sub3_3.method470(local74 + local74 + 3);
				}
				if (arg10 == 1) {
					this.aClass1_Sub1_Sub3_3.method469(196);
					this.aClass1_Sub1_Sub3_3.method470(local74 + local74 + 3 + 14);
				}
				if (arg10 == 2) {
					this.aClass1_Sub1_Sub3_3.method469(70);
					this.aClass1_Sub1_Sub3_3.method470(local74 + local74 + 3);
				}
				if (super.anIntArray30[5] == 1) {
					this.aClass1_Sub1_Sub3_3.method470(1);
				} else {
					this.aClass1_Sub1_Sub3_3.method470(0);
				}
				this.aClass1_Sub1_Sub3_3.method471(local827 + this.anInt354);
				this.aClass1_Sub1_Sub3_3.method471(local833 + this.anInt355);
				this.anInt201 = this.anIntArray92[0];
				this.anInt202 = this.anIntArray93[0];
				for (@Pc(1082) int local1082 = 1; local1082 < local74; local1082++) {
					local57--;
					this.aClass1_Sub1_Sub3_3.method470(this.anIntArray92[local57] - local827);
					this.aClass1_Sub1_Sub3_3.method470(this.anIntArray93[local57] - local833);
				}
				return true;
			} else if (arg10 == 1) {
				return false;
			} else {
				return true;
			}
		} catch (@Pc(1117) RuntimeException local1117) {
			signlink.reporterror("71067, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + arg10 + ", " + arg11 + ", " + local1117.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(IZ)V")
	private void method157(@OriginalArg(1) boolean arg0) {
		try {
			for (@Pc(9) int local9 = 0; local9 < this.anInt395; local9++) {
				@Pc(19) Class1_Sub1_Sub1_Sub1_Sub2 local19 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[this.anIntArray91[local9]];
				@Pc(28) int local28 = (this.anIntArray91[local9] << 14) + 536870912;
				if (local19 != null && local19.method680() && local19.aClass13_2.aBoolean151 == arg0) {
					@Pc(44) int local44 = local19.anInt962 >> 7;
					@Pc(49) int local49 = local19.anInt963 >> 7;
					if (local44 >= 0 && local44 < 104 && local49 >= 0 && local49 < 104) {
						if (local19.anInt965 == 1 && (local19.anInt962 & 0x7F) == 64 && (local19.anInt963 & 0x7F) == 64) {
							if (this.anIntArrayArray6[local44][local49] == this.anInt325) {
								continue;
							}
							this.anIntArrayArray6[local44][local49] = this.anInt325;
						}
						this.aClass37_1.method541(local19, local19.anInt963, local19.anInt964, local28, local19.anInt962, this.anInt229, (local19.anInt965 - 1) * 64 + 60, this.method219(this.anInt229, local19.anInt963, local19.anInt962), local19.aBoolean266);
					}
				}
			}
		} catch (@Pc(133) RuntimeException local133) {
			signlink.reporterror("82626, " + 45400 + ", " + arg0 + ", " + local133.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(BZ)V")
	private void method158(@OriginalArg(0) byte arg0, @OriginalArg(1) boolean arg1) {
		try {
			this.method117((byte) 3);
			this.aClass35_21.method524(this.anInt198);
			this.aClass1_Sub1_Sub2_Sub3_14.method418(0, 0);
			@Pc(47) byte local47;
			@Pc(59) int local59;
			if (this.anInt339 == 0) {
				this.aClass1_Sub1_Sub2_Sub4_1.method448(true, 7711145, this.aClass44_Sub1_1.aString30, 180, 180);
				local47 = 80;
				this.aClass1_Sub1_Sub2_Sub4_3.method448(true, 16776960, "Welcome to RuneScape", 180, 80);
				local59 = local47 + 30;
				this.aClass1_Sub1_Sub2_Sub3_15.method418(27, 100);
				this.aClass1_Sub1_Sub2_Sub4_3.method448(true, 16777215, "New User", 100, 125);
				this.aClass1_Sub1_Sub2_Sub3_15.method418(187, 100);
				this.aClass1_Sub1_Sub2_Sub4_3.method448(true, 16777215, "Existing User", 260, 125);
			}
			if (this.anInt339 == 2) {
				local47 = 60;
				if (this.aString10.length() > 0) {
					this.aClass1_Sub1_Sub2_Sub4_3.method448(true, 16776960, this.aString10, 180, 45);
					this.aClass1_Sub1_Sub2_Sub4_3.method448(true, 16776960, this.aString11, 180, 60);
					local59 = local47 + 30;
				} else {
					this.aClass1_Sub1_Sub2_Sub4_3.method448(true, 16776960, this.aString11, 180, 53);
					local59 = local47 + 30;
				}
				this.aClass1_Sub1_Sub2_Sub4_3.method455(90, 90, "Username: " + this.aString12 + (this.anInt227 == 0 & anInt239 % 40 < 20 ? "@yel@|" : ""), 16777215, true);
				local59 += 15;
				this.aClass1_Sub1_Sub2_Sub4_3.method455(105, 92, "Password: " + Class48.method672(this.aString13) + (this.anInt227 == 1 & anInt239 % 40 < 20 ? "@yel@|" : ""), 16777215, true);
				local59 += 15;
				if (!arg1) {
					this.aClass1_Sub1_Sub2_Sub3_15.method418(27, 130);
					this.aClass1_Sub1_Sub2_Sub4_3.method448(true, 16777215, "Login", 100, 155);
					this.aClass1_Sub1_Sub2_Sub3_15.method418(187, 130);
					this.aClass1_Sub1_Sub2_Sub4_3.method448(true, 16777215, "Cancel", 260, 155);
				}
			}
			if (this.anInt339 == 3) {
				this.aClass1_Sub1_Sub2_Sub4_3.method448(true, 16776960, "Create a free account", 180, 40);
				local47 = 65;
				this.aClass1_Sub1_Sub2_Sub4_3.method448(true, 16777215, "To create a new account you need to", 180, 65);
				local59 = local47 + 15;
				this.aClass1_Sub1_Sub2_Sub4_3.method448(true, 16777215, "go back to the main RuneScape webpage", 180, 80);
				local59 += 15;
				this.aClass1_Sub1_Sub2_Sub4_3.method448(true, 16777215, "and choose the red 'create account'", 180, 95);
				local59 += 15;
				this.aClass1_Sub1_Sub2_Sub4_3.method448(true, 16777215, "button at the top right of that page.", 180, 110);
				local59 += 15;
				this.aClass1_Sub1_Sub2_Sub3_15.method418(107, 130);
				this.aClass1_Sub1_Sub2_Sub4_3.method448(true, 16777215, "Cancel", 180, 155);
			}
			this.aClass35_21.method525(202, super.aGraphics2, 171);
			@Pc(441) boolean local441 = false;
			if (this.aBoolean65) {
				this.aBoolean65 = false;
				this.aClass35_19.method525(128, super.aGraphics2, 0);
				this.aClass35_20.method525(202, super.aGraphics2, 371);
				this.aClass35_24.method525(0, super.aGraphics2, 265);
				this.aClass35_25.method525(562, super.aGraphics2, 265);
				this.aClass35_26.method525(128, super.aGraphics2, 171);
				this.aClass35_27.method525(562, super.aGraphics2, 171);
			}
		} catch (@Pc(501) RuntimeException local501) {
			signlink.reporterror("97390, " + arg0 + ", " + arg1 + ", " + local501.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "k", descriptor = "(B)V")
	private void method159() {
		try {
			@Pc(11) int local11;
			for (@Pc(3) int local3 = -1; local3 < this.anInt242; local3++) {
				if (local3 == -1) {
					local11 = this.anInt241;
				} else {
					local11 = this.anIntArray46[local3];
				}
				@Pc(23) Class1_Sub1_Sub1_Sub1_Sub1 local23 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local11];
				if (local23 != null && local23.anInt973 > 0) {
					local23.anInt973--;
					if (local23.anInt973 == 0) {
						local23.aString31 = null;
					}
				}
			}
			for (local11 = 0; local11 < this.anInt395; local11++) {
				@Pc(62) int local62 = this.anIntArray91[local11];
				@Pc(67) Class1_Sub1_Sub1_Sub1_Sub2 local67 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local62];
				if (local67 != null && local67.anInt973 > 0) {
					local67.anInt973--;
					if (local67.anInt973 == 0) {
						local67.aString31 = null;
					}
				}
			}
		} catch (@Pc(91) RuntimeException local91) {
			signlink.reporterror("49647, " + 24 + ", " + local91.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "l", descriptor = "(B)V")
	private void method160() {
		try {
			anInt397++;
			if (anInt397 > 192) {
				anInt397 = 0;
				this.aClass1_Sub1_Sub3_3.method469(24);
				this.aClass1_Sub1_Sub3_3.method470(232);
			}
			while (true) {
				@Pc(32) int local32;
				do {
					while (true) {
						local32 = this.method88(234);
						if (local32 == -1) {
							return;
						}
						if (this.anInt324 != -1 && this.anInt324 == this.anInt221) {
							if (local32 == 8 && this.aString7.length() > 0) {
								this.aString7 = this.aString7.substring(0, this.aString7.length() - 1);
							}
							break;
						}
						@Pc(212) int local212;
						if (this.aBoolean69) {
							if (local32 >= 32 && local32 <= 122 && this.aString16.length() < 80) {
								this.aString16 = this.aString16 + (char) local32;
								this.aBoolean88 = true;
							}
							if (local32 == 8 && this.aString16.length() > 0) {
								this.aString16 = this.aString16.substring(0, this.aString16.length() - 1);
								this.aBoolean88 = true;
							}
							if (local32 == 13 || local32 == 10) {
								this.aBoolean69 = false;
								this.aBoolean88 = true;
								@Pc(172) long local172;
								if (this.anInt328 == 1) {
									local172 = Class48.method667(this.aString16);
									this.method123(local172);
								}
								if (this.anInt328 == 2 && this.anInt350 > 0) {
									local172 = Class48.method667(this.aString16);
									this.method145(local172);
								}
								if (this.anInt328 == 3 && this.aString16.length() > 0) {
									this.aClass1_Sub1_Sub3_3.method469(47);
									this.aClass1_Sub1_Sub3_3.method470(0);
									local212 = this.aClass1_Sub1_Sub3_3.anInt720;
									this.aClass1_Sub1_Sub3_3.method476(this.aLong17, (byte) 3);
									Class49.method684(this.aString16, this.aClass1_Sub1_Sub3_3, this.anInt288);
									this.aClass1_Sub1_Sub3_3.method479(this.aClass1_Sub1_Sub3_3.anInt720 - local212);
									this.aString16 = Class49.method685(this.aString16);
									this.aString16 = Class42.method604(this.aString16);
									this.method221(this.aString16, 6, Class48.method671(Class48.method668(this.aLong17)));
									if (this.anInt264 == 2) {
										this.anInt264 = 1;
										this.aBoolean53 = true;
										this.aClass1_Sub1_Sub3_3.method469(242);
										this.aClass1_Sub1_Sub3_3.method470(this.anInt230);
										this.aClass1_Sub1_Sub3_3.method470(this.anInt264);
										this.aClass1_Sub1_Sub3_3.method470(this.anInt193);
									}
								}
								if (this.anInt328 == 4 && this.anInt290 < 100) {
									local172 = Class48.method667(this.aString16);
									this.method211(local172);
								}
								if (this.anInt328 == 5 && this.anInt290 > 0) {
									local172 = Class48.method667(this.aString16);
									this.method210(local172);
								}
							}
						} else if (this.aBoolean79) {
							if (local32 >= 48 && local32 <= 57 && this.aString6.length() < 10) {
								this.aString6 = this.aString6 + (char) local32;
								this.aBoolean88 = true;
							}
							if (local32 == 8 && this.aString6.length() > 0) {
								this.aString6 = this.aString6.substring(0, this.aString6.length() - 1);
								this.aBoolean88 = true;
							}
							if (local32 == 13 || local32 == 10) {
								if (this.aString6.length() > 0) {
									local212 = 0;
									try {
										local212 = Integer.parseInt(this.aString6);
									} catch (@Pc(389) Exception local389) {
									}
									this.aClass1_Sub1_Sub3_3.method469(236);
									this.aClass1_Sub1_Sub3_3.method474(local212);
								}
								this.aBoolean79 = false;
								this.aBoolean88 = true;
							}
						} else if (this.anInt197 == -1) {
							if (local32 >= 32 && local32 <= 122 && this.aString4.length() < 80) {
								this.aString4 = this.aString4 + (char) local32;
								this.aBoolean88 = true;
							}
							if (local32 == 8 && this.aString4.length() > 0) {
								this.aString4 = this.aString4.substring(0, this.aString4.length() - 1);
								this.aBoolean88 = true;
							}
							if ((local32 == 13 || local32 == 10) && this.aString4.length() > 0) {
								if (this.anInt316 == 2) {
									if (this.aString4.equals("::clientdrop")) {
										this.method113();
									}
									if (this.aString4.equals("::lag")) {
										this.method213((byte) 4);
									}
									if (this.aString4.equals("::prefetchmusic")) {
										for (local212 = 0; local212 < this.aClass44_Sub1_1.method638(2); local212++) {
											this.aClass44_Sub1_1.method648((byte) 1, 2, aBoolean60, local212);
										}
									}
									if (this.aString4.equals("::fpson")) {
										aBoolean70 = true;
									}
									if (this.aString4.equals("::fpsoff")) {
										aBoolean70 = false;
									}
								}
								if (this.aString4.startsWith("::")) {
									this.aClass1_Sub1_Sub3_3.method469(248);
									this.aClass1_Sub1_Sub3_3.method470(this.aString4.length() - 1);
									this.aClass1_Sub1_Sub3_3.method477(this.aString4.substring(2));
								} else {
									@Pc(556) String local556 = this.aString4.toLowerCase();
									@Pc(558) byte local558 = 0;
									if (local556.startsWith("yellow:")) {
										local558 = 0;
										this.aString4 = this.aString4.substring(7);
									} else if (local556.startsWith("red:")) {
										local558 = 1;
										this.aString4 = this.aString4.substring(4);
									} else if (local556.startsWith("green:")) {
										local558 = 2;
										this.aString4 = this.aString4.substring(6);
									} else if (local556.startsWith("cyan:")) {
										local558 = 3;
										this.aString4 = this.aString4.substring(5);
									} else if (local556.startsWith("purple:")) {
										local558 = 4;
										this.aString4 = this.aString4.substring(7);
									} else if (local556.startsWith("white:")) {
										local558 = 5;
										this.aString4 = this.aString4.substring(6);
									} else if (local556.startsWith("flash1:")) {
										local558 = 6;
										this.aString4 = this.aString4.substring(7);
									} else if (local556.startsWith("flash2:")) {
										local558 = 7;
										this.aString4 = this.aString4.substring(7);
									} else if (local556.startsWith("flash3:")) {
										local558 = 8;
										this.aString4 = this.aString4.substring(7);
									} else if (local556.startsWith("glow1:")) {
										local558 = 9;
										this.aString4 = this.aString4.substring(6);
									} else if (local556.startsWith("glow2:")) {
										local558 = 10;
										this.aString4 = this.aString4.substring(6);
									} else if (local556.startsWith("glow3:")) {
										local558 = 11;
										this.aString4 = this.aString4.substring(6);
									}
									local556 = this.aString4.toLowerCase();
									@Pc(730) byte local730 = 0;
									if (local556.startsWith("wave:")) {
										local730 = 1;
										this.aString4 = this.aString4.substring(5);
									} else if (local556.startsWith("wave2:")) {
										local730 = 2;
										this.aString4 = this.aString4.substring(6);
									} else if (local556.startsWith("shake:")) {
										local730 = 3;
										this.aString4 = this.aString4.substring(6);
									} else if (local556.startsWith("scroll:")) {
										local730 = 4;
										this.aString4 = this.aString4.substring(7);
									} else if (local556.startsWith("slide:")) {
										local730 = 5;
										this.aString4 = this.aString4.substring(6);
									}
									this.aClass1_Sub1_Sub3_3.method469(37);
									this.aClass1_Sub1_Sub3_3.method470(0);
									@Pc(811) int local811 = this.aClass1_Sub1_Sub3_3.anInt720;
									this.aClass1_Sub1_Sub3_3.method470(local558);
									this.aClass1_Sub1_Sub3_3.method470(local730);
									Class49.method684(this.aString4, this.aClass1_Sub1_Sub3_3, this.anInt288);
									this.aClass1_Sub1_Sub3_3.method479(this.aClass1_Sub1_Sub3_3.anInt720 - local811);
									this.aString4 = Class49.method685(this.aString4);
									this.aString4 = Class42.method604(this.aString4);
									aClass1_Sub1_Sub1_Sub1_Sub1_1.aString31 = this.aString4;
									aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt974 = local558;
									aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt975 = local730;
									aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt973 = 150;
									if (this.anInt316 == 2) {
										this.method221(aClass1_Sub1_Sub1_Sub1_Sub1_1.aString31, 2, "@cr2@" + aClass1_Sub1_Sub1_Sub1_Sub1_1.aString3);
									} else if (this.anInt316 == 1) {
										this.method221(aClass1_Sub1_Sub1_Sub1_Sub1_1.aString31, 2, "@cr1@" + aClass1_Sub1_Sub1_Sub1_Sub1_1.aString3);
									} else {
										this.method221(aClass1_Sub1_Sub1_Sub1_Sub1_1.aString31, 2, aClass1_Sub1_Sub1_Sub1_Sub1_1.aString3);
									}
									if (this.anInt230 == 2) {
										this.anInt230 = 3;
										this.aBoolean53 = true;
										this.aClass1_Sub1_Sub3_3.method469(242);
										this.aClass1_Sub1_Sub3_3.method470(this.anInt230);
										this.aClass1_Sub1_Sub3_3.method470(this.anInt264);
										this.aClass1_Sub1_Sub3_3.method470(this.anInt193);
									}
								}
								this.aString4 = "";
								this.aBoolean88 = true;
							}
						}
					}
				} while ((local32 < 97 || local32 > 122) && (local32 < 65 || local32 > 90) && (local32 < 48 || local32 > 57) && local32 != 32);
				if (this.aString7.length() < 12) {
					this.aString7 = this.aString7 + (char) local32;
				}
			}
		} catch (@Pc(948) RuntimeException local948) {
			signlink.reporterror("39767, " + 52 + ", " + local948.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "j", descriptor = "(Z)V")
	private void method161() {
		try {
			this.anInt343 = 0;
			@Pc(90) int local90;
			@Pc(70) int local70;
			for (@Pc(6) int local6 = -1; local6 < this.anInt242 + this.anInt395; local6++) {
				@Pc(13) Class1_Sub1_Sub1_Sub1 local13;
				if (local6 == -1) {
					local13 = aClass1_Sub1_Sub1_Sub1_Sub1_1;
				} else if (local6 < this.anInt242) {
					local13 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[this.anIntArray46[local6]];
				} else {
					local13 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[this.anIntArray91[local6 - this.anInt242]];
				}
				if (local13 != null && local13.method680()) {
					@Pc(54) Class13 local54;
					if (local13 instanceof Class1_Sub1_Sub1_Sub1_Sub2) {
						local54 = ((Class1_Sub1_Sub1_Sub1_Sub2) local13).aClass13_2;
						if (local54.anIntArray174 != null) {
							local54 = local54.method327();
						}
						if (local54 == null) {
							continue;
						}
					}
					if (local6 >= this.anInt242) {
						local54 = ((Class1_Sub1_Sub1_Sub1_Sub2) local13).aClass13_2;
						if (local54.anInt540 >= 0 && local54.anInt540 < this.aClass1_Sub1_Sub2_Sub2Array4.length) {
							this.method150(local13.anInt1003 + 15, local13);
							if (this.anInt386 > -1) {
								this.aClass1_Sub1_Sub2_Sub2Array4[local54.anInt540].method391(this.anInt386 - 12, this.anInt387 - 30);
							}
						}
						if (this.anInt285 == 1 && this.anInt246 == this.anIntArray91[local6 - this.anInt242] && anInt239 % 20 < 10) {
							this.method150(local13.anInt1003 + 15, local13);
							if (this.anInt386 > -1) {
								this.aClass1_Sub1_Sub2_Sub2Array4[2].method391(this.anInt386 - 12, this.anInt387 - 28);
							}
						}
					} else {
						local70 = 30;
						@Pc(73) Class1_Sub1_Sub1_Sub1_Sub1 local73 = (Class1_Sub1_Sub1_Sub1_Sub1) local13;
						if (local73.anInt120 != 0) {
							this.method150(local13.anInt1003 + 15, local13);
							if (this.anInt386 > -1) {
								for (local90 = 0; local90 < 8; local90++) {
									if ((local73.anInt120 & 0x1 << local90) != 0) {
										this.aClass1_Sub1_Sub2_Sub2Array4[local90].method391(this.anInt386 - 12, this.anInt387 - local70);
										local70 -= 25;
									}
								}
							}
						}
						if (local6 >= 0 && this.anInt285 == 10 && this.anInt305 == this.anIntArray46[local6]) {
							this.method150(local13.anInt1003 + 15, local13);
							if (this.anInt386 > -1) {
								this.aClass1_Sub1_Sub2_Sub2Array4[7].method391(this.anInt386 - 12, this.anInt387 - local70);
							}
						}
					}
					if (local13.aString31 != null && (local6 >= this.anInt242 || this.anInt230 == 0 || this.anInt230 == 3 || this.anInt230 == 1 && this.method225(((Class1_Sub1_Sub1_Sub1_Sub1) local13).aString3))) {
						this.method150(local13.anInt1003, local13);
						if (this.anInt386 > -1 && this.anInt343 < this.anInt344) {
							this.anIntArray76[this.anInt343] = this.aClass1_Sub1_Sub2_Sub4_3.method450(local13.aString31) / 2;
							this.anIntArray75[this.anInt343] = this.aClass1_Sub1_Sub2_Sub4_3.anInt687;
							this.anIntArray73[this.anInt343] = this.anInt386;
							this.anIntArray74[this.anInt343] = this.anInt387;
							this.anIntArray77[this.anInt343] = local13.anInt974;
							this.anIntArray78[this.anInt343] = local13.anInt975;
							this.anIntArray79[this.anInt343] = local13.anInt973;
							this.aStringArray5[this.anInt343++] = local13.aString31;
							if (this.anInt349 == 0 && local13.anInt975 >= 1 && local13.anInt975 <= 3) {
								this.anIntArray75[this.anInt343] += 10;
								this.anIntArray74[this.anInt343] += 5;
							}
							if (this.anInt349 == 0 && local13.anInt975 == 4) {
								this.anIntArray76[this.anInt343] = 60;
							}
							if (this.anInt349 == 0 && local13.anInt975 == 5) {
								this.anIntArray75[this.anInt343] += 5;
							}
						}
					}
					if (local13.anInt976 > anInt239) {
						this.method150(local13.anInt1003 + 15, local13);
						if (this.anInt386 > -1) {
							local70 = local13.anInt977 * 30 / local13.anInt978;
							if (local70 > 30) {
								local70 = 30;
							}
							Class1_Sub1_Sub2.method439(65280, 5, this.anInt387 - 3, local70, (byte) 5, this.anInt386 - 15);
							Class1_Sub1_Sub2.method439(16711680, 5, this.anInt387 - 3, 30 - local70, (byte) 5, this.anInt386 + local70 - 15);
						}
					}
					for (local70 = 0; local70 < 4; local70++) {
						if (local13.anIntArray271[local70] > anInt239) {
							this.method150(local13.anInt1003 / 2, local13);
							if (this.anInt386 > -1) {
								if (local70 == 1) {
									this.anInt387 -= 20;
								}
								if (local70 == 2) {
									this.anInt386 -= 15;
									this.anInt387 -= 10;
								}
								if (local70 == 3) {
									this.anInt386 += 15;
									this.anInt387 -= 10;
								}
								this.aClass1_Sub1_Sub2_Sub2Array6[local13.anIntArray270[local70]].method391(this.anInt386 - 12, this.anInt387 - 12);
								this.aClass1_Sub1_Sub2_Sub4_1.method447(String.valueOf(local13.anIntArray269[local70]), this.anInt387 + 4, 0, this.anInt386);
								this.aClass1_Sub1_Sub2_Sub4_1.method447(String.valueOf(local13.anIntArray269[local70]), this.anInt387 + 3, 16777215, this.anInt386 - 1);
							}
						}
					}
				}
			}
			for (@Pc(601) int local601 = 0; local601 < this.anInt343; local601++) {
				local70 = this.anIntArray73[local601];
				@Pc(613) int local613 = this.anIntArray74[local601];
				local90 = this.anIntArray76[local601];
				@Pc(623) int local623 = this.anIntArray75[local601];
				@Pc(625) boolean local625 = true;
				while (local625) {
					local625 = false;
					for (@Pc(631) int local631 = 0; local631 < local601; local631++) {
						if (local613 + 2 > this.anIntArray74[local631] - this.anIntArray75[local631] && local613 - local623 < this.anIntArray74[local631] + 2 && local70 - local90 < this.anIntArray73[local631] + this.anIntArray76[local631] && local70 + local90 > this.anIntArray73[local631] - this.anIntArray76[local631] && this.anIntArray74[local631] - this.anIntArray75[local631] < local613) {
							local613 = this.anIntArray74[local631] - this.anIntArray75[local631];
							local625 = true;
						}
					}
				}
				this.anInt386 = this.anIntArray73[local601];
				this.anInt387 = this.anIntArray74[local601] = local613;
				@Pc(730) String local730 = this.aStringArray5[local601];
				if (this.anInt349 == 0) {
					@Pc(735) int local735 = 16776960;
					if (this.anIntArray77[local601] < 6) {
						local735 = this.anIntArray44[this.anIntArray77[local601]];
					}
					if (this.anIntArray77[local601] == 6) {
						local735 = this.anInt325 % 20 < 10 ? 16711680 : 16776960;
					}
					if (this.anIntArray77[local601] == 7) {
						local735 = this.anInt325 % 20 < 10 ? 255 : 65535;
					}
					if (this.anIntArray77[local601] == 8) {
						local735 = this.anInt325 % 20 < 10 ? 45056 : 8454016;
					}
					@Pc(810) int local810;
					if (this.anIntArray77[local601] == 9) {
						local810 = 150 - this.anIntArray79[local601];
						if (local810 < 50) {
							local735 = local810 * 1280 + 16711680;
						} else if (local810 < 100) {
							local735 = 16776960 - (local810 - 50) * 327680;
						} else if (local810 < 150) {
							local735 = (local810 - 100) * 5 + 65280;
						}
					}
					if (this.anIntArray77[local601] == 10) {
						local810 = 150 - this.anIntArray79[local601];
						if (local810 < 50) {
							local735 = local810 * 5 + 16711680;
						} else if (local810 < 100) {
							local735 = 16711935 - (local810 - 50) * 327680;
						} else if (local810 < 150) {
							local735 = (local810 - 100) * 327680 + 255 - (local810 - 100) * 5;
						}
					}
					if (this.anIntArray77[local601] == 11) {
						local810 = 150 - this.anIntArray79[local601];
						if (local810 < 50) {
							local735 = 16777215 - local810 * 327685;
						} else if (local810 < 100) {
							local735 = (local810 - 50) * 327685 + 65280;
						} else if (local810 < 150) {
							local735 = 16777215 - (local810 - 100) * 327680;
						}
					}
					if (this.anIntArray78[local601] == 0) {
						this.aClass1_Sub1_Sub2_Sub4_3.method447(local730, this.anInt387 + 1, 0, this.anInt386);
						this.aClass1_Sub1_Sub2_Sub4_3.method447(local730, this.anInt387, local735, this.anInt386);
					}
					if (this.anIntArray78[local601] == 1) {
						this.aClass1_Sub1_Sub2_Sub4_3.method452(0, this.anInt325, this.anInt386, local730, this.anInt387 + 1);
						this.aClass1_Sub1_Sub2_Sub4_3.method452(local735, this.anInt325, this.anInt386, local730, this.anInt387);
					}
					if (this.anIntArray78[local601] == 2) {
						this.aClass1_Sub1_Sub2_Sub4_3.method453(local730, 0, this.anInt386, this.anInt325, this.anInt387 + 1);
						this.aClass1_Sub1_Sub2_Sub4_3.method453(local730, local735, this.anInt386, this.anInt325, this.anInt387);
					}
					if (this.anIntArray78[local601] == 3) {
						this.aClass1_Sub1_Sub2_Sub4_3.method454(0, local730, this.anInt387 + 1, 150 - this.anIntArray79[local601], this.anInt325, this.anInt386);
						this.aClass1_Sub1_Sub2_Sub4_3.method454(local735, local730, this.anInt387, 150 - this.anIntArray79[local601], this.anInt325, this.anInt386);
					}
					@Pc(1107) int local1107;
					if (this.anIntArray78[local601] == 4) {
						local810 = this.aClass1_Sub1_Sub2_Sub4_3.method450(local730);
						local1107 = (150 - this.anIntArray79[local601]) * (local810 + 100) / 150;
						Class1_Sub1_Sub2.method436(this.anInt386 - 50, 0, this.anInt386 + 50, 334);
						this.aClass1_Sub1_Sub2_Sub4_3.method451(local730, this.anInt387 + 1, this.anInt386 + 50 - local1107, 0);
						this.aClass1_Sub1_Sub2_Sub4_3.method451(local730, this.anInt387, this.anInt386 + 50 - local1107, local735);
						Class1_Sub1_Sub2.method435();
					}
					if (this.anIntArray78[local601] == 5) {
						local810 = 150 - this.anIntArray79[local601];
						local1107 = 0;
						if (local810 < 25) {
							local1107 = local810 - 25;
						} else if (local810 > 125) {
							local1107 = local810 - 125;
						}
						Class1_Sub1_Sub2.method436(0, this.anInt387 - this.aClass1_Sub1_Sub2_Sub4_3.anInt687 - 1, 512, this.anInt387 + 5);
						this.aClass1_Sub1_Sub2_Sub4_3.method447(local730, this.anInt387 + local1107 + 1, 0, this.anInt386);
						this.aClass1_Sub1_Sub2_Sub4_3.method447(local730, this.anInt387 + local1107, local735, this.anInt386);
						Class1_Sub1_Sub2.method435();
					}
				} else {
					this.aClass1_Sub1_Sub2_Sub4_3.method447(local730, this.anInt387 + 1, 0, this.anInt386);
					this.aClass1_Sub1_Sub2_Sub4_3.method447(local730, this.anInt387, 16776960, this.anInt386);
				}
			}
		} catch (@Pc(1257) RuntimeException local1257) {
			signlink.reporterror("48968, " + false + ", " + local1257.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IILclient!d;IIII)V")
	private void method162(@OriginalArg(0) int arg0, @OriginalArg(2) Class6 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		try {
			if (arg1.anInt406 == 0 && arg1.anIntArray98 != null && !arg1.aBoolean97 && (arg5 >= arg0 && arg2 >= arg4 && arg5 <= arg0 + arg1.anInt409 && arg2 <= arg4 + arg1.anInt410)) {
				@Pc(41) int local41 = arg1.anIntArray98.length;
				for (@Pc(43) int local43 = 0; local43 < local41; local43++) {
					@Pc(52) int local52 = arg1.anIntArray99[local43] + arg0;
					@Pc(61) int local61 = arg1.anIntArray100[local43] + arg4 - arg3;
					@Pc(68) Class6 local68 = Class6.aClass6Array1[arg1.anIntArray98[local43]];
					@Pc(73) int local73 = local52 + local68.anInt411;
					@Pc(78) int local78 = local61 + local68.anInt412;
					if ((local68.anInt413 >= 0 || local68.anInt421 != 0) && arg5 >= local73 && arg2 >= local78 && arg5 < local73 + local68.anInt409 && arg2 < local78 + local68.anInt410) {
						if (local68.anInt413 >= 0) {
							this.anInt195 = local68.anInt413;
						} else {
							this.anInt195 = local68.anInt404;
						}
					}
					if (local68.anInt406 == 0) {
						this.method162(local73, local68, arg2, local68.anInt415, local78, arg5);
						if (local68.anInt414 > local68.anInt410) {
							this.method208(local78, local68, local68.anInt414, local68.anInt410, true, arg2, arg5, local73 + local68.anInt409);
						}
					} else {
						if (local68.anInt407 == 1 && arg5 >= local73 && arg2 >= local78 && arg5 < local73 + local68.anInt409 && arg2 < local78 + local68.anInt410) {
							@Pc(175) boolean local175 = false;
							if (local68.anInt408 != 0) {
								local175 = this.method109(local68, 465);
							}
							if (!local175) {
								this.aStringArray1[this.anInt353] = local68.aString22;
								this.anIntArray34[this.anInt353] = 231;
								this.anIntArray33[this.anInt353] = local68.anInt404;
								this.anInt353++;
							}
						}
						if (local68.anInt407 == 2 && this.anInt297 == 0 && arg5 >= local73 && arg2 >= local78 && arg5 < local73 + local68.anInt409 && arg2 < local78 + local68.anInt410) {
							@Pc(239) String local239 = local68.aString20;
							if (local239.indexOf(" ") != -1) {
								local239 = local239.substring(0, local239.indexOf(" "));
							}
							this.aStringArray1[this.anInt353] = local239 + " @gre@" + local68.aString21;
							this.anIntArray34[this.anInt353] = 274;
							this.anIntArray33[this.anInt353] = local68.anInt404;
							this.anInt353++;
						}
						if (local68.anInt407 == 3 && arg5 >= local73 && arg2 >= local78 && arg5 < local73 + local68.anInt409 && arg2 < local78 + local68.anInt410) {
							this.aStringArray1[this.anInt353] = "Close";
							this.anIntArray34[this.anInt353] = 737;
							this.anIntArray33[this.anInt353] = local68.anInt404;
							this.anInt353++;
						}
						if (local68.anInt407 == 4 && arg5 >= local73 && arg2 >= local78 && arg5 < local73 + local68.anInt409 && arg2 < local78 + local68.anInt410) {
							this.aStringArray1[this.anInt353] = local68.aString22;
							this.anIntArray34[this.anInt353] = 435;
							this.anIntArray33[this.anInt353] = local68.anInt404;
							this.anInt353++;
						}
						if (local68.anInt407 == 5 && arg5 >= local73 && arg2 >= local78 && arg5 < local73 + local68.anInt409 && arg2 < local78 + local68.anInt410) {
							this.aStringArray1[this.anInt353] = local68.aString22;
							this.anIntArray34[this.anInt353] = 225;
							this.anIntArray33[this.anInt353] = local68.anInt404;
							this.anInt353++;
						}
						if (local68.anInt407 == 6 && !this.aBoolean94 && arg5 >= local73 && arg2 >= local78 && arg5 < local73 + local68.anInt409 && arg2 < local78 + local68.anInt410) {
							this.aStringArray1[this.anInt353] = local68.aString22;
							this.anIntArray34[this.anInt353] = 997;
							this.anIntArray33[this.anInt353] = local68.anInt404;
							this.anInt353++;
						}
						if (local68.anInt406 == 2) {
							@Pc(487) int local487 = 0;
							for (@Pc(489) int local489 = 0; local489 < local68.anInt410; local489++) {
								for (@Pc(493) int local493 = 0; local493 < local68.anInt409; local493++) {
									@Pc(504) int local504 = local73 + local493 * (local68.anInt417 + 32);
									@Pc(513) int local513 = local78 + local489 * (local68.anInt418 + 32);
									if (local487 < 20) {
										local504 += local68.anIntArray101[local487];
										local513 += local68.anIntArray102[local487];
									}
									if (arg5 >= local504 && arg2 >= local513 && arg5 < local504 + 32 && arg2 < local513 + 32) {
										this.anInt322 = local487;
										this.anInt323 = local68.anInt404;
										if (local68.anIntArray94[local487] > 0) {
											@Pc(566) Class15 local566 = Class15.method361(local68.anIntArray94[local487] - 1);
											if (this.anInt281 == 1 && local68.aBoolean100) {
												if (local68.anInt404 != this.anInt283 || local487 != this.anInt282) {
													this.aStringArray1[this.anInt353] = "Use " + this.aString8 + " with @lre@" + local566.aString25;
													this.anIntArray34[this.anInt353] = 398;
													this.anIntArray35[this.anInt353] = local566.anInt574;
													this.anIntArray32[this.anInt353] = local487;
													this.anIntArray33[this.anInt353] = local68.anInt404;
													this.anInt353++;
												}
											} else if (this.anInt297 != 1 || !local68.aBoolean100) {
												@Pc(703) int local703;
												if (local68.aBoolean100) {
													for (local703 = 4; local703 >= 3; local703--) {
														if (local566.aStringArray11 != null && local566.aStringArray11[local703] != null) {
															this.aStringArray1[this.anInt353] = local566.aStringArray11[local703] + " @lre@" + local566.aString25;
															if (local703 == 3) {
																this.anIntArray34[this.anInt353] = 681;
															}
															if (local703 == 4) {
																this.anIntArray34[this.anInt353] = 100;
															}
															this.anIntArray35[this.anInt353] = local566.anInt574;
															this.anIntArray32[this.anInt353] = local487;
															this.anIntArray33[this.anInt353] = local68.anInt404;
															this.anInt353++;
														} else if (local703 == 4) {
															this.aStringArray1[this.anInt353] = "Drop @lre@" + local566.aString25;
															this.anIntArray34[this.anInt353] = 100;
															this.anIntArray35[this.anInt353] = local566.anInt574;
															this.anIntArray32[this.anInt353] = local487;
															this.anIntArray33[this.anInt353] = local68.anInt404;
															this.anInt353++;
														}
													}
												}
												if (local68.aBoolean101) {
													this.aStringArray1[this.anInt353] = "Use @lre@" + local566.aString25;
													this.anIntArray34[this.anInt353] = 102;
													this.anIntArray35[this.anInt353] = local566.anInt574;
													this.anIntArray32[this.anInt353] = local487;
													this.anIntArray33[this.anInt353] = local68.anInt404;
													this.anInt353++;
												}
												if (local68.aBoolean100 && local566.aStringArray11 != null) {
													for (local703 = 2; local703 >= 0; local703--) {
														if (local566.aStringArray11[local703] != null) {
															this.aStringArray1[this.anInt353] = local566.aStringArray11[local703] + " @lre@" + local566.aString25;
															if (local703 == 0) {
																this.anIntArray34[this.anInt353] = 694;
															}
															if (local703 == 1) {
																this.anIntArray34[this.anInt353] = 962;
															}
															if (local703 == 2) {
																this.anIntArray34[this.anInt353] = 795;
															}
															this.anIntArray35[this.anInt353] = local566.anInt574;
															this.anIntArray32[this.anInt353] = local487;
															this.anIntArray33[this.anInt353] = local68.anInt404;
															this.anInt353++;
														}
													}
												}
												if (local68.aStringArray7 != null) {
													for (local703 = 4; local703 >= 0; local703--) {
														if (local68.aStringArray7[local703] != null) {
															this.aStringArray1[this.anInt353] = local68.aStringArray7[local703] + " @lre@" + local566.aString25;
															if (local703 == 0) {
																this.anIntArray34[this.anInt353] = 582;
															}
															if (local703 == 1) {
																this.anIntArray34[this.anInt353] = 113;
															}
															if (local703 == 2) {
																this.anIntArray34[this.anInt353] = 555;
															}
															if (local703 == 3) {
																this.anIntArray34[this.anInt353] = 331;
															}
															if (local703 == 4) {
																this.anIntArray34[this.anInt353] = 354;
															}
															this.anIntArray35[this.anInt353] = local566.anInt574;
															this.anIntArray32[this.anInt353] = local487;
															this.anIntArray33[this.anInt353] = local68.anInt404;
															this.anInt353++;
														}
													}
												}
												this.aStringArray1[this.anInt353] = "Examine @lre@" + local566.aString25;
												this.anIntArray34[this.anInt353] = 1328;
												this.anIntArray35[this.anInt353] = local566.anInt574;
												this.anIntArray32[this.anInt353] = local487;
												this.anIntArray33[this.anInt353] = local68.anInt404;
												this.anInt353++;
											} else if ((this.anInt299 & 0x10) == 16) {
												this.aStringArray1[this.anInt353] = this.aString9 + " @lre@" + local566.aString25;
												this.anIntArray34[this.anInt353] = 563;
												this.anIntArray35[this.anInt353] = local566.anInt574;
												this.anIntArray32[this.anInt353] = local487;
												this.anIntArray33[this.anInt353] = local68.anInt404;
												this.anInt353++;
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
			signlink.reporterror("60296, " + arg0 + ", " + -3 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local1133.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Ljava/lang/String;)Ljava/io/DataInputStream;")
	private DataInputStream method163(@OriginalArg(0) String arg0) throws IOException {
		if (this.aBoolean85) {
			if (this.aSocket1 != null) {
				try {
					this.aSocket1.close();
				} catch (@Pc(26) Exception local26) {
				}
				this.aSocket1 = null;
			}
			this.aSocket1 = this.method186(43595);
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

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ZI)Z")
	private boolean method164(@OriginalArg(1) int arg0) {
		try {
			if (arg0 < 0) {
				return false;
			}
			@Pc(8) int local8 = this.anIntArray34[arg0];
			if (local8 >= 2000) {
				local8 -= 2000;
			}
			return local8 == 605;
		} catch (@Pc(25) RuntimeException local25) {
			signlink.reporterror("75383, " + false + ", " + arg0 + ", " + local25.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(IILclient!lb;)V")
	private void method165(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub1_Sub3 arg1) {
		try {
			for (@Pc(11) int local11 = 0; local11 < this.anInt243; local11++) {
				@Pc(18) int local18 = this.anIntArray47[local11];
				@Pc(23) Class1_Sub1_Sub1_Sub1_Sub2 local23 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local18];
				@Pc(26) int local26 = arg1.method480();
				@Pc(34) int local34;
				@Pc(37) int local37;
				if ((local26 & 0x1) == 1) {
					local34 = arg1.method480();
					local37 = arg1.method480();
					local23.method681(local34, anInt239, local37);
					local23.anInt976 = anInt239 + 300;
					local23.anInt977 = arg1.method480();
					local23.anInt978 = arg1.method480();
				}
				if ((local26 & 0x2) == 2) {
					local34 = arg1.method482();
					if (local34 == 65535) {
						local34 = -1;
					}
					if (local34 == local23.anInt985) {
						local23.anInt989 = 0;
					}
					local37 = arg1.method480();
					if (local34 == local23.anInt985 && local34 != -1) {
						@Pc(91) int local91 = Class27.aClass27Array1[local34].anInt779;
						if (local91 == 1) {
							local23.anInt986 = 0;
							local23.anInt987 = 0;
							local23.anInt988 = local37;
							local23.anInt989 = 0;
						}
						if (local91 == 2) {
							local23.anInt989 = 0;
						}
					} else if (local34 == -1 || local23.anInt985 == -1 || Class27.aClass27Array1[local34].anInt773 >= Class27.aClass27Array1[local23.anInt985].anInt773) {
						local23.anInt985 = local34;
						local23.anInt986 = 0;
						local23.anInt987 = 0;
						local23.anInt988 = local37;
						local23.anInt989 = 0;
						local23.anInt1008 = local23.anInt1006;
					}
				}
				if ((local26 & 0x4) == 4) {
					local23.anInt979 = arg1.method482();
					if (local23.anInt979 == 65535) {
						local23.anInt979 = -1;
					}
				}
				if ((local26 & 0x8) == 8) {
					local23.aString31 = arg1.method487();
					local23.anInt973 = 100;
				}
				if ((local26 & 0x10) == 16) {
					local34 = arg1.method480();
					local37 = arg1.method480();
					local23.method681(local34, anInt239, local37);
					local23.anInt976 = anInt239 + 300;
					local23.anInt977 = arg1.method480();
					local23.anInt978 = arg1.method480();
				}
				if ((local26 & 0x20) == 32) {
					local23.aClass13_2 = Class13.method323(arg1.method482());
					local23.anInt965 = local23.aClass13_2.aByte18;
					local23.anInt1005 = local23.aClass13_2.anInt541;
					local23.anInt968 = local23.aClass13_2.anInt528;
					local23.anInt969 = local23.aClass13_2.anInt529;
					local23.anInt970 = local23.aClass13_2.anInt530;
					local23.anInt971 = local23.aClass13_2.anInt531;
					local23.anInt966 = local23.aClass13_2.anInt527;
				}
				if ((local26 & 0x40) == 64) {
					local23.anInt990 = arg1.method482();
					local34 = arg1.method485();
					local23.anInt994 = local34 >> 16;
					local23.anInt993 = anInt239 + (local34 & 0xFFFF);
					local23.anInt991 = 0;
					local23.anInt992 = 0;
					if (local23.anInt993 > anInt239) {
						local23.anInt991 = -1;
					}
					if (local23.anInt990 == 65535) {
						local23.anInt990 = -1;
					}
				}
				if ((local26 & 0x80) == 128) {
					local23.anInt980 = arg1.method482();
					local23.anInt981 = arg1.method482();
				}
			}
		} catch (@Pc(317) RuntimeException local317) {
			signlink.reporterror("68925, " + arg0 + ", " + -27674 + ", " + arg1 + ", " + local317.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "k", descriptor = "(Z)V")
	private void method166() {
		try {
			while (true) {
				@Pc(8) Class1_Sub1_Sub4 local8 = this.aClass44_Sub1_1.method647();
				if (local8 == null) {
					return;
				}
				if (local8.anInt749 == 0) {
					Class1_Sub1_Sub1_Sub5.method259(local8.aByteArray10, local8.anInt750);
					if ((this.aClass44_Sub1_1.method643(local8.anInt750) & 0x62) != 0) {
						this.aBoolean73 = true;
						if (this.anInt197 != -1) {
							this.aBoolean88 = true;
						}
					}
				}
				if (local8.anInt749 == 1 && local8.aByteArray10 != null) {
					Class12.method303(local8.aByteArray10);
				}
				if (local8.anInt749 == 2 && local8.anInt750 == this.anInt308 && local8.aByteArray10 != null) {
					this.method178(this.aBoolean75, 455, local8.aByteArray10);
				}
				if (local8.anInt749 == 3 && this.anInt273 == 1) {
					for (@Pc(79) int local79 = 0; local79 < this.aByteArrayArray2.length; local79++) {
						if (this.anIntArray37[local79] == local8.anInt750) {
							this.aByteArrayArray2[local79] = local8.aByteArray10;
							if (local8.aByteArray10 == null) {
								this.anIntArray37[local79] = -1;
							}
							break;
						}
						if (this.anIntArray38[local79] == local8.anInt750) {
							this.aByteArrayArray1[local79] = local8.aByteArray10;
							if (local8.aByteArray10 == null) {
								this.anIntArray38[local79] = -1;
							}
							break;
						}
					}
				}
				if (local8.anInt749 == 93 && this.aClass44_Sub1_1.method642(local8.anInt750)) {
					Class4.method59(this.aClass44_Sub1_1, 326, new Class1_Sub1_Sub3(local8.aByteArray10, (byte) -93));
				}
			}
		} catch (@Pc(156) RuntimeException local156) {
			signlink.reporterror("39874, " + false + ", " + local156.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ZZ)V")
	private void method167(@OriginalArg(0) boolean arg0) {
		try {
			if (aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt962 >> 7 == this.anInt201 && aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt963 >> 7 == this.anInt202) {
				this.anInt201 = 0;
				anInt196++;
				if (anInt196 > 122) {
					anInt196 = 0;
					this.aClass1_Sub1_Sub3_3.method469(110);
					this.aClass1_Sub1_Sub3_3.method470(62);
				}
			}
			@Pc(43) int local43 = this.anInt242;
			if (arg0) {
				local43 = 1;
			}
			for (@Pc(49) int local49 = 0; local49 < local43; local49++) {
				@Pc(55) Class1_Sub1_Sub1_Sub1_Sub1 local55;
				@Pc(60) int local60;
				if (arg0) {
					local55 = aClass1_Sub1_Sub1_Sub1_Sub1_1;
					local60 = this.anInt241 << 14;
				} else {
					local55 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[this.anIntArray46[local49]];
					local60 = this.anIntArray46[local49] << 14;
				}
				if (local55 != null && local55.method680()) {
					local55.aBoolean32 = false;
					if ((aBoolean72 && this.anInt242 > 50 || this.anInt242 > 200) && !arg0 && local55.anInt982 == local55.anInt966) {
						local55.aBoolean32 = true;
					}
					@Pc(111) int local111 = local55.anInt962 >> 7;
					@Pc(116) int local116 = local55.anInt963 >> 7;
					if (local111 >= 0 && local111 < 104 && local116 >= 0 && local116 < 104) {
						if (local55.aClass1_Sub1_Sub1_Sub5_1 == null || anInt239 < local55.anInt124 || anInt239 >= local55.anInt125) {
							if ((local55.anInt962 & 0x7F) == 64 && (local55.anInt963 & 0x7F) == 64) {
								if (this.anIntArrayArray6[local111][local116] == this.anInt325) {
									continue;
								}
								this.anIntArrayArray6[local111][local116] = this.anInt325;
							}
							local55.anInt123 = this.method219(this.anInt229, local55.anInt963, local55.anInt962);
							this.aClass37_1.method541(local55, local55.anInt963, local55.anInt964, local60, local55.anInt962, this.anInt229, 60, local55.anInt123, local55.aBoolean266);
						} else {
							local55.aBoolean32 = false;
							local55.anInt123 = this.method219(this.anInt229, local55.anInt963, local55.anInt962);
							this.aClass37_1.method542(local55.anInt963, local55.anInt962, local55.anInt130, local55.anInt123, local55.anInt131, local55.anInt129, local55.anInt132, this.anInt229, local55, local60, local55.anInt964);
						}
					}
				}
			}
		} catch (@Pc(245) RuntimeException local245) {
			signlink.reporterror("85625, " + arg0 + ", " + true + ", " + local245.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIII)Z")
	private boolean method168(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		try {
			@Pc(7) int local7 = arg2 >> 14 & 0x7FFF;
			@Pc(16) int local16 = this.aClass37_1.method560(this.anInt229, arg1, arg3, arg2);
			if (local16 == -1) {
				return false;
			}
			@Pc(25) int local25 = local16 & 0x1F;
			@Pc(31) int local31 = local16 >> 6 & 0x3;
			anInt381++;
			if (anInt381 > 1086) {
				anInt381 = 0;
				this.aClass1_Sub1_Sub3_3.method469(170);
				this.aClass1_Sub1_Sub3_3.method470(0);
				@Pc(53) int local53 = this.aClass1_Sub1_Sub3_3.anInt720;
				if ((int) (Math.random() * 2.0D) == 0) {
					this.aClass1_Sub1_Sub3_3.method471(16791);
				}
				this.aClass1_Sub1_Sub3_3.method470(254);
				this.aClass1_Sub1_Sub3_3.method471((int) (Math.random() * 65536.0D));
				this.aClass1_Sub1_Sub3_3.method471(16128);
				this.aClass1_Sub1_Sub3_3.method471(52610);
				this.aClass1_Sub1_Sub3_3.method471((int) (Math.random() * 65536.0D));
				this.aClass1_Sub1_Sub3_3.method471(55420);
				if ((int) (Math.random() * 2.0D) == 0) {
					this.aClass1_Sub1_Sub3_3.method471(35025);
				}
				this.aClass1_Sub1_Sub3_3.method471(46628);
				this.aClass1_Sub1_Sub3_3.method470((int) (Math.random() * 256.0D));
				this.aClass1_Sub1_Sub3_3.method479(this.aClass1_Sub1_Sub3_3.anInt720 - local53);
			}
			if (local25 == 10 || local25 == 11 || local25 == 22) {
				@Pc(133) Class9 local133 = Class9.method288(local7);
				@Pc(141) int local141;
				@Pc(144) int local144;
				if (local31 == 0 || local31 == 2) {
					local141 = local133.anInt481;
					local144 = local133.anInt482;
				} else {
					local141 = local133.anInt482;
					local144 = local133.anInt481;
				}
				@Pc(155) int local155 = local133.anInt493;
				if (local31 != 0) {
					local155 = (local155 << local31 & 0xF) + (local155 >> 4 - local31);
				}
				this.method156(aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray273[0], aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray272[0], local155, arg1, arg3, 0, false, local144, local141, (byte) 4, 2, 0);
			} else {
				this.method156(aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray273[0], aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray272[0], 0, arg1, arg3, local25 + 1, false, 0, 0, (byte) 4, 2, local31);
			}
			this.anInt370 = super.anInt188;
			this.anInt371 = super.anInt189;
			this.anInt373 = 2;
			this.anInt372 = 0;
			this.aClass1_Sub1_Sub3_3.method469(arg0);
			this.aClass1_Sub1_Sub3_3.method471(arg1 + this.anInt354);
			this.aClass1_Sub1_Sub3_3.method471(arg3 + this.anInt355);
			if (arg4 >= 0) {
				this.aClass1_Sub1_Sub3_3.method470(164);
			}
			this.aClass1_Sub1_Sub3_3.method471(local7);
			return true;
		} catch (@Pc(261) RuntimeException local261) {
			signlink.reporterror("61078, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local261.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "f", descriptor = "(II)V")
	private void method169(@OriginalArg(0) int arg0) {
		try {
			signlink.anInt919 = arg0;
		} catch (@Pc(8) RuntimeException local8) {
			signlink.reporterror("55466, " + arg0 + ", " + 0 + ", " + local8.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "l", descriptor = "(Z)V")
	private void method170() {
		try {
			for (@Pc(15) Class1_Sub2 local15 = (Class1_Sub2) this.aClass29_1.method511(); local15 != null; local15 = (Class1_Sub2) this.aClass29_1.method513()) {
				if (local15.anInt769 == -1) {
					local15.anInt768 = 0;
					this.method171(local15);
				} else {
					local15.method673();
				}
			}
		} catch (@Pc(42) RuntimeException local42) {
			signlink.reporterror("78703, " + true + ", " + local42.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ZLclient!nb;)V")
	private void method171(@OriginalArg(1) Class1_Sub2 arg0) {
		try {
			@Pc(1) int local1 = 0;
			@Pc(3) int local3 = -1;
			@Pc(5) int local5 = 0;
			@Pc(7) int local7 = 0;
			if (arg0.anInt759 == 0) {
				local1 = this.aClass37_1.method556(arg0.anInt758, arg0.anInt760, arg0.anInt761);
			}
			if (arg0.anInt759 == 1) {
				local1 = this.aClass37_1.method557(arg0.anInt760, arg0.anInt761, arg0.anInt758);
			}
			if (arg0.anInt759 == 2) {
				local1 = this.aClass37_1.method558(arg0.anInt758, arg0.anInt760, arg0.anInt761);
			}
			if (arg0.anInt759 == 3) {
				local1 = this.aClass37_1.method559(arg0.anInt758, arg0.anInt760, arg0.anInt761);
			}
			if (local1 != 0) {
				@Pc(84) int local84 = this.aClass37_1.method560(arg0.anInt758, arg0.anInt760, arg0.anInt761, local1);
				local3 = local1 >> 14 & 0x7FFF;
				local5 = local84 & 0x1F;
				local7 = local84 >> 6;
			}
			arg0.anInt762 = local3;
			arg0.anInt764 = local5;
			arg0.anInt763 = local7;
		} catch (@Pc(109) RuntimeException local109) {
			signlink.reporterror("43190, " + false + ", " + arg0 + ", " + local109.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "m", descriptor = "(Z)V")
	private void method172() {
		try {
			@Pc(14) int local14;
			@Pc(21) int local21;
			if (this.anInt339 == 0) {
				local14 = super.anInt178 / 2 - 80;
				local21 = super.anInt179 / 2 + 20;
				local21 += 20;
				if (super.anInt187 == 1 && super.anInt188 >= local14 - 75 && super.anInt188 <= local14 + 75 && super.anInt189 >= local21 - 20 && super.anInt189 <= local21 + 20) {
					this.anInt339 = 3;
					this.anInt227 = 0;
				}
				local14 = super.anInt178 / 2 + 80;
				if (super.anInt187 == 1 && super.anInt188 >= local14 - 75 && super.anInt188 <= local14 + 75 && super.anInt189 >= local21 - 20 && super.anInt189 <= local21 + 20) {
					this.aString10 = "";
					this.aString11 = "Enter your username & password.";
					this.anInt339 = 2;
					this.anInt227 = 0;
				}
			} else if (this.anInt339 == 2) {
				local14 = super.anInt179 / 2 - 40;
				local14 += 30;
				local14 += 25;
				if (super.anInt187 == 1 && super.anInt189 >= local14 - 15 && super.anInt189 < local14) {
					this.anInt227 = 0;
				}
				local14 += 15;
				if (super.anInt187 == 1 && super.anInt189 >= local14 - 15 && super.anInt189 < local14) {
					this.anInt227 = 1;
				}
				local14 += 15;
				local21 = super.anInt178 / 2 - 80;
				@Pc(167) int local167 = super.anInt179 / 2 + 50;
				@Pc(168) int local168 = local167 + 20;
				if (super.anInt187 == 1 && super.anInt188 >= local21 - 75 && super.anInt188 <= local21 + 75 && super.anInt189 >= local168 - 20 && super.anInt189 <= local168 + 20) {
					this.anInt374 = 0;
					this.method140(this.aString12, this.aString13, false);
					if (this.aBoolean89) {
						return;
					}
				}
				local21 = super.anInt178 / 2 + 80;
				if (super.anInt187 == 1 && super.anInt188 >= local21 - 75 && super.anInt188 <= local21 + 75 && super.anInt189 >= local168 - 20 && super.anInt189 <= local168 + 20) {
					this.anInt339 = 0;
					this.aString12 = "";
					this.aString13 = "";
				}
				while (true) {
					while (true) {
						@Pc(258) int local258 = this.method88(234);
						if (local258 == -1) {
							return;
						}
						@Pc(263) boolean local263 = false;
						for (@Pc(265) int local265 = 0; local265 < aString17.length(); local265++) {
							if (local258 == aString17.charAt(local265)) {
								local263 = true;
								break;
							}
						}
						if (this.anInt227 == 0) {
							if (local258 == 8 && this.aString12.length() > 0) {
								this.aString12 = this.aString12.substring(0, this.aString12.length() - 1);
							}
							if (local258 == 9 || local258 == 10 || local258 == 13) {
								this.anInt227 = 1;
							}
							if (local263) {
								this.aString12 = this.aString12 + (char) local258;
							}
							if (this.aString12.length() > 12) {
								this.aString12 = this.aString12.substring(0, 12);
							}
						} else if (this.anInt227 == 1) {
							if (local258 == 8 && this.aString13.length() > 0) {
								this.aString13 = this.aString13.substring(0, this.aString13.length() - 1);
							}
							if (local258 == 9 || local258 == 10 || local258 == 13) {
								this.anInt227 = 0;
							}
							if (local263) {
								this.aString13 = this.aString13 + (char) local258;
							}
							if (this.aString13.length() > 20) {
								this.aString13 = this.aString13.substring(0, 20);
							}
						}
					}
				}
			} else if (this.anInt339 == 3) {
				local14 = super.anInt178 / 2;
				local21 = super.anInt179 / 2 + 50;
				@Pc(422) int local422 = local21 + 20;
				if (super.anInt187 == 1 && super.anInt188 >= local14 - 75 && super.anInt188 <= local14 + 75 && super.anInt189 >= local422 - 20 && super.anInt189 <= local422 + 20) {
					this.anInt339 = 0;
					return;
				}
			}
		} catch (@Pc(455) RuntimeException local455) {
			signlink.reporterror("52001, " + false + ", " + local455.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "t", descriptor = "(I)V")
	private void method173(@OriginalArg(0) int arg0) {
		try {
			@Pc(21) int local21;
			@Pc(49) int local49;
			@Pc(53) int local53;
			@Pc(62) int local62;
			@Pc(69) int local69;
			@Pc(132) int local132;
			@Pc(189) int local189;
			try {
				this.anInt352 = -1;
				this.aClass29_2.method515();
				this.aClass29_3.method515();
				Class1_Sub1_Sub2_Sub1.method345();
				this.method182();
				this.aClass37_1.method530();
				for (local21 = 0; local21 < 4; local21++) {
					this.aClass19Array1[local21].method420();
				}
				System.gc();
				@Pc(45) Class4 local45 = new Class4(104, this.anIntArrayArrayArray5, 104, this.aByteArrayArrayArray7, 0);
				local49 = this.aByteArrayArray2.length;
				Class4.aBoolean41 = Class37.aBoolean228;
				for (local53 = 0; local53 < local49; local53++) {
					local62 = this.anIntArray36[local53] >> 8;
					local69 = this.anIntArray36[local53] & 0xFF;
					if (local62 == 33 && local69 >= 71 && local69 <= 73) {
						Class4.aBoolean41 = false;
					}
				}
				if (Class4.aBoolean41) {
					this.aClass37_1.method531(this.anInt229, (byte) 4);
				} else {
					this.aClass37_1.method531(0, (byte) 4);
				}
				this.aClass1_Sub1_Sub3_3.method469(115);
				@Pc(137) byte[] local137;
				for (local62 = 0; local62 < local49; local62++) {
					local69 = (this.anIntArray36[local62] >> 8) * 64 - this.anInt354;
					local132 = (this.anIntArray36[local62] & 0xFF) * 64 - this.anInt355;
					local137 = this.aByteArrayArray2[local62];
					if (local137 != null) {
						local45.method57(local132, (this.anInt269 - 6) * 8, (this.anInt268 - 6) * 8, 455, local137, local69);
					}
				}
				for (local69 = 0; local69 < local49; local69++) {
					local132 = (this.anIntArray36[local69] >> 8) * 64 - this.anInt354;
					local189 = (this.anIntArray36[local69] & 0xFF) * 64 - this.anInt355;
					@Pc(194) byte[] local194 = this.aByteArrayArray2[local69];
					if (local194 == null && this.anInt269 < 800) {
						local45.method56(local132, local189);
					}
				}
				this.aClass1_Sub1_Sub3_3.method469(115);
				@Pc(239) int local239;
				for (local132 = 0; local132 < local49; local132++) {
					local137 = this.aByteArrayArray1[local132];
					if (local137 != null) {
						local239 = (this.anIntArray36[local132] >> 8) * 64 - this.anInt354;
						@Pc(251) int local251 = (this.anIntArray36[local132] & 0xFF) * 64 - this.anInt355;
						local45.method60(this.aClass19Array1, local137, local251, this.aClass37_1, local239);
					}
				}
				this.aClass1_Sub1_Sub3_3.method469(115);
				local45.method62(this.aClass37_1, this.aClass19Array1);
				this.aClass35_5.method524(this.anInt198);
				this.aClass1_Sub1_Sub3_3.method469(115);
				for (local189 = 0; local189 < 104; local189++) {
					for (local239 = 0; local239 < 104; local239++) {
						this.method144(local189, local239);
					}
				}
				this.method170();
			} catch (@Pc(312) Exception local312) {
			}
			Class9.aClass40_4.method593();
			@Pc(326) int local326;
			if (aBoolean72 && signlink.aRandomAccessFile1 != null) {
				local21 = this.aClass44_Sub1_1.method638(0);
				for (local326 = 0; local326 < local21; local326++) {
					local49 = this.aClass44_Sub1_1.method643(local326);
					if ((local49 & 0x79) == 0) {
						Class1_Sub1_Sub1_Sub5.method260(local326);
					}
				}
			}
			System.gc();
			Class1_Sub1_Sub2_Sub1.method346(899);
			this.aClass44_Sub1_1.method649();
			@Pc(357) int local357 = 38 / arg0;
			local21 = (this.anInt268 - 6) / 8 - 1;
			local326 = (this.anInt268 + 6) / 8 + 1;
			local49 = (this.anInt269 - 6) / 8 - 1;
			local53 = (this.anInt269 + 6) / 8 + 1;
			if (this.aBoolean74) {
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
		} catch (@Pc(468) RuntimeException local468) {
			signlink.reporterror("57209, " + arg0 + ", " + local468.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "n", descriptor = "(Z)V")
	private void method174() {
		try {
			@Pc(2) int local2 = this.anInt253;
			@Pc(5) int local5 = this.anInt254;
			@Pc(8) int local8 = this.anInt255;
			@Pc(11) int local11 = this.anInt256;
			Class1_Sub1_Sub2.method439(6116423, local11, local5, local8, (byte) 5, local2);
			Class1_Sub1_Sub2.method439(0, 16, local5 + 1, local8 - 2, (byte) 5, local2 + 1);
			Class1_Sub1_Sub2.method440(local2 + 1, local5 + 18, local11 - 19, 0, local8 - 2);
			this.aBoolean89 &= true;
			this.aClass1_Sub1_Sub2_Sub4_3.method451("Choose Option", local5 + 14, local2 + 3, 6116423);
			@Pc(69) int local69 = super.anInt182;
			@Pc(72) int local72 = super.anInt183;
			if (this.anInt252 == 0) {
				local69 -= 4;
				local72 -= 4;
			}
			if (this.anInt252 == 1) {
				local69 -= 553;
				local72 -= 205;
			}
			if (this.anInt252 == 2) {
				local69 -= 17;
				local72 -= 357;
			}
			for (@Pc(91) int local91 = 0; local91 < this.anInt353; local91++) {
				@Pc(106) int local106 = local5 + (this.anInt353 - 1 - local91) * 15 + 31;
				@Pc(108) int local108 = 16777215;
				if (local69 > local2 && local69 < local2 + local8 && local72 > local106 - 13 && local72 < local106 + 3) {
					local108 = 16776960;
				}
				this.aClass1_Sub1_Sub2_Sub4_3.method455(local106, local2 + 3, this.aStringArray1[local91], local108, true);
			}
		} catch (@Pc(149) RuntimeException local149) {
			signlink.reporterror("37822, " + true + ", " + local149.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIIZIII)V")
	private void method175(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		try {
			this.aBoolean89 &= true;
			if (arg1 >= 1 && arg3 >= 1 && arg1 <= 102 && arg3 <= 102) {
				if (aBoolean72 && arg2 != this.anInt229) {
					return;
				}
				@Pc(26) int local26 = 0;
				if (arg6 == 0) {
					local26 = this.aClass37_1.method556(arg2, arg1, arg3);
				}
				if (arg6 == 1) {
					local26 = this.aClass37_1.method557(arg1, arg3, arg2);
				}
				if (arg6 == 2) {
					local26 = this.aClass37_1.method558(arg2, arg1, arg3);
				}
				if (arg6 == 3) {
					local26 = this.aClass37_1.method559(arg2, arg1, arg3);
				}
				@Pc(82) int local82;
				if (local26 != 0) {
					local82 = this.aClass37_1.method560(arg2, arg1, arg3, local26);
					@Pc(88) int local88 = local26 >> 14 & 0x7FFF;
					@Pc(92) int local92 = local82 & 0x1F;
					@Pc(96) int local96 = local82 >> 6;
					@Pc(108) Class9 local108;
					if (arg6 == 0) {
						this.aClass37_1.method547(arg2, arg3, arg1);
						local108 = Class9.method288(local88);
						if (local108.aBoolean125) {
							this.aClass19Array1[arg2].method425(arg3, arg1, local108.aBoolean126, local96, local92);
						}
					}
					if (arg6 == 1) {
						this.aClass37_1.method548(arg2, arg1, arg3);
					}
					if (arg6 == 2) {
						this.aClass37_1.method549(arg1, arg2, arg3);
						local108 = Class9.method288(local88);
						if (arg1 + local108.anInt481 > 103 || arg3 + local108.anInt481 > 103 || arg1 + local108.anInt482 > 103 || arg3 + local108.anInt482 > 103) {
							return;
						}
						if (local108.aBoolean125) {
							this.aClass19Array1[arg2].method426(local96, arg1, local108.anInt481, local108.anInt482, local108.aBoolean126, arg3);
						}
					}
					if (arg6 == 3) {
						this.aClass37_1.method550(arg3, arg2, arg1);
						local108 = Class9.method288(local88);
						if (local108.aBoolean125 && local108.aBoolean127) {
							this.aClass19Array1[arg2].method428(arg3, arg1);
						}
					}
				}
				if (arg5 >= 0) {
					local82 = arg2;
					if (arg2 < 3 && (this.aByteArrayArrayArray7[1][arg1][arg3] & 0x2) == 2) {
						local82 = arg2 + 1;
					}
					Class4.method73(arg0, arg2, this.aClass37_1, arg3, this.aClass19Array1[arg2], arg4, this.anIntArrayArrayArray5, arg1, local82, arg5);
					return;
				}
			}
		} catch (@Pc(255) RuntimeException local255) {
			signlink.reporterror("67018, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + true + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + local255.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIZII)V")
	private void method176(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		try {
			this.aBoolean89 &= true;
			@Pc(14) int local14 = this.aClass37_1.method556(arg2, arg1, arg0);
			@Pc(24) int local24;
			@Pc(30) int local30;
			@Pc(34) int local34;
			@Pc(36) int local36;
			@Pc(58) int local58;
			@Pc(64) int local64;
			if (local14 != 0) {
				local24 = this.aClass37_1.method560(arg2, arg1, arg0, local14);
				local30 = local24 >> 6 & 0x3;
				local34 = local24 & 0x1F;
				local36 = arg4;
				if (local14 > 0) {
					local36 = arg3;
				}
				@Pc(44) int[] local44 = this.aClass1_Sub1_Sub2_Sub2_1.anIntArray208;
				local58 = arg1 * 4 + (103 - arg0) * 512 * 4 + 24624;
				local64 = local14 >> 14 & 0x7FFF;
				@Pc(67) Class9 local67 = Class9.method288(local64);
				if (local67.anInt486 == -1) {
					if (local34 == 0 || local34 == 2) {
						if (local30 == 0) {
							local44[local58] = local36;
							local44[local58 + 512] = local36;
							local44[local58 + 1024] = local36;
							local44[local58 + 1536] = local36;
						} else if (local30 == 1) {
							local44[local58] = local36;
							local44[local58 + 1] = local36;
							local44[local58 + 2] = local36;
							local44[local58 + 3] = local36;
						} else if (local30 == 2) {
							local44[local58 + 3] = local36;
							local44[local58 + 3 + 512] = local36;
							local44[local58 + 3 + 1024] = local36;
							local44[local58 + 3 + 1536] = local36;
						} else if (local30 == 3) {
							local44[local58 + 1536] = local36;
							local44[local58 + 1536 + 1] = local36;
							local44[local58 + 1536 + 2] = local36;
							local44[local58 + 1536 + 3] = local36;
						}
					}
					if (local34 == 3) {
						if (local30 == 0) {
							local44[local58] = local36;
						} else if (local30 == 1) {
							local44[local58 + 3] = local36;
						} else if (local30 == 2) {
							local44[local58 + 3 + 1536] = local36;
						} else if (local30 == 3) {
							local44[local58 + 1536] = local36;
						}
					}
					if (local34 == 2) {
						if (local30 == 3) {
							local44[local58] = local36;
							local44[local58 + 512] = local36;
							local44[local58 + 1024] = local36;
							local44[local58 + 1536] = local36;
						} else if (local30 == 0) {
							local44[local58] = local36;
							local44[local58 + 1] = local36;
							local44[local58 + 2] = local36;
							local44[local58 + 3] = local36;
						} else if (local30 == 1) {
							local44[local58 + 3] = local36;
							local44[local58 + 3 + 512] = local36;
							local44[local58 + 3 + 1024] = local36;
							local44[local58 + 3 + 1536] = local36;
						} else if (local30 == 2) {
							local44[local58 + 1536] = local36;
							local44[local58 + 1536 + 1] = local36;
							local44[local58 + 1536 + 2] = local36;
							local44[local58 + 1536 + 3] = local36;
						}
					}
				} else {
					@Pc(77) Class1_Sub1_Sub2_Sub3 local77 = this.aClass1_Sub1_Sub2_Sub3Array3[local67.anInt486];
					if (local77 != null) {
						@Pc(89) int local89 = (local67.anInt481 * 4 - local77.anInt653) / 2;
						@Pc(99) int local99 = (local67.anInt482 * 4 - local77.anInt654) / 2;
						local77.method418(arg1 * 4 + local89 + 48, (104 - arg0 - local67.anInt482) * 4 + 48 + local99);
					}
				}
			}
			local14 = this.aClass37_1.method558(arg2, arg1, arg0);
			if (local14 != 0) {
				local24 = this.aClass37_1.method560(arg2, arg1, arg0, local14);
				local30 = local24 >> 6 & 0x3;
				local34 = local24 & 0x1F;
				local36 = local14 >> 14 & 0x7FFF;
				@Pc(453) Class9 local453 = Class9.method288(local36);
				@Pc(485) int local485;
				if (local453.anInt486 != -1) {
					@Pc(463) Class1_Sub1_Sub2_Sub3 local463 = this.aClass1_Sub1_Sub2_Sub3Array3[local453.anInt486];
					if (local463 != null) {
						local64 = (local453.anInt481 * 4 - local463.anInt653) / 2;
						local485 = (local453.anInt482 * 4 - local463.anInt654) / 2;
						local463.method418(arg1 * 4 + local64 + 48, (104 - arg0 - local453.anInt482) * 4 + 48 + local485);
					}
				} else if (local34 == 9) {
					local58 = 15658734;
					if (local14 > 0) {
						local58 = 15597568;
					}
					@Pc(522) int[] local522 = this.aClass1_Sub1_Sub2_Sub2_1.anIntArray208;
					local485 = arg1 * 4 + (103 - arg0) * 512 * 4 + 24624;
					if (local30 == 0 || local30 == 2) {
						local522[local485 + 1536] = local58;
						local522[local485 + 1024 + 1] = local58;
						local522[local485 + 512 + 2] = local58;
						local522[local485 + 3] = local58;
					} else {
						local522[local485] = local58;
						local522[local485 + 512 + 1] = local58;
						local522[local485 + 1024 + 2] = local58;
						local522[local485 + 1536 + 3] = local58;
					}
				}
			}
			local14 = this.aClass37_1.method559(arg2, arg1, arg0);
			if (local14 != 0) {
				local24 = local14 >> 14 & 0x7FFF;
				@Pc(617) Class9 local617 = Class9.method288(local24);
				if (local617.anInt486 != -1) {
					@Pc(627) Class1_Sub1_Sub2_Sub3 local627 = this.aClass1_Sub1_Sub2_Sub3Array3[local617.anInt486];
					if (local627 != null) {
						local36 = (local617.anInt481 * 4 - local627.anInt653) / 2;
						@Pc(649) int local649 = (local617.anInt482 * 4 - local627.anInt654) / 2;
						local627.method418(arg1 * 4 + local36 + 48, (104 - arg0 - local617.anInt482) * 4 + 48 + local649);
						return;
					}
				}
			}
		} catch (@Pc(673) RuntimeException local673) {
			signlink.reporterror("43008, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + true + ", " + arg3 + ", " + arg4 + ", " + local673.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "u", descriptor = "(I)V")
	private void method177() {
		try {
			try {
				@Pc(15) int local15 = aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt962 + this.anInt247;
				@Pc(21) int local21 = aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt963 + this.anInt258;
				if (this.anInt360 - local15 < -500 || this.anInt360 - local15 > 500 || this.anInt361 - local21 < -500 || this.anInt361 - local21 > 500) {
					this.anInt360 = local15;
					this.anInt361 = local21;
				}
				if (this.anInt360 != local15) {
					this.anInt360 += (local15 - this.anInt360) / 16;
				}
				if (this.anInt361 != local21) {
					this.anInt361 += (local21 - this.anInt361) / 16;
				}
				if (super.anIntArray30[1] == 1) {
					this.anInt392 += (-this.anInt392 - 24) / 2;
				} else if (super.anIntArray30[2] == 1) {
					this.anInt392 += (24 - this.anInt392) / 2;
				} else {
					this.anInt392 /= 2;
				}
				if (super.anIntArray30[3] == 1) {
					this.anInt393 += (12 - this.anInt393) / 2;
				} else if (super.anIntArray30[4] == 1) {
					this.anInt393 += (-this.anInt393 - 12) / 2;
				} else {
					this.anInt393 /= 2;
				}
				this.anInt391 = this.anInt391 + this.anInt392 / 2 & 0x7FF;
				this.anInt390 += this.anInt393 / 2;
				if (this.anInt390 < 128) {
					this.anInt390 = 128;
				}
				if (this.anInt390 > 383) {
					this.anInt390 = 383;
				}
				@Pc(208) int local208 = this.anInt360 >> 7;
				@Pc(213) int local213 = this.anInt361 >> 7;
				@Pc(223) int local223 = this.method219(this.anInt229, this.anInt361, this.anInt360);
				@Pc(225) int local225 = 0;
				@Pc(241) int local241;
				if (local208 > 3 && local213 > 3 && local208 < 100 && local213 < 100) {
					for (local241 = local208 - 4; local241 <= local208 + 4; local241++) {
						for (@Pc(247) int local247 = local213 - 4; local247 <= local213 + 4; local247++) {
							@Pc(252) int local252 = this.anInt229;
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
				if (local241 > this.anInt319) {
					this.anInt319 += (local241 - this.anInt319) / 24;
				} else if (local241 < this.anInt319) {
					this.anInt319 += (local241 - this.anInt319) / 80;
				}
			} catch (@Pc(343) Exception local343) {
				signlink.reporterror("glfc_ex " + aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt962 + "," + aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt963 + "," + this.anInt360 + "," + this.anInt361 + "," + this.anInt268 + "," + this.anInt269 + "," + this.anInt354 + "," + this.anInt355);
				throw new RuntimeException("eek");
			}
		} catch (@Pc(393) RuntimeException local393) {
			signlink.reporterror("82755, " + -798 + ", " + local393.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ZI[B)V")
	private void method178(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2) {
		try {
			@Pc(3) boolean local3 = false;
			signlink.anInt917 = arg0 ? 1 : 0;
			signlink.midisave(arg2, arg2.length);
		} catch (@Pc(15) RuntimeException local15) {
			signlink.reporterror("56418, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local15.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "o", descriptor = "(Z)V")
	private void method179() {
		try {
			for (@Pc(12) Class1_Sub1_Sub1_Sub6 local12 = (Class1_Sub1_Sub1_Sub6) this.aClass29_2.method511(); local12 != null; local12 = (Class1_Sub1_Sub1_Sub6) this.aClass29_2.method513()) {
				if (local12.anInt501 != this.anInt229 || local12.aBoolean139) {
					local12.method673();
				} else if (anInt239 >= local12.anInt500) {
					local12.method301(this.anInt338);
					if (local12.aBoolean139) {
						local12.method673();
					} else {
						this.aClass37_1.method541(local12, local12.anInt503, 0, -1, local12.anInt502, local12.anInt501, 60, local12.anInt504, false);
					}
				}
			}
		} catch (@Pc(70) RuntimeException local70) {
			signlink.reporterror("33375, " + true + ", " + local70.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "v", descriptor = "(I)V")
	private void method180() {
		try {
			@Pc(7) byte[] local7 = this.aClass47_1.method666("title.dat", null);
			@Pc(13) Class1_Sub1_Sub2_Sub2 local13 = new Class1_Sub1_Sub2_Sub2(local7, this);
			this.aClass35_22.method524(this.anInt198);
			local13.method389(0, 0);
			this.aClass35_23.method524(this.anInt198);
			local13.method389(-637, 0);
			this.aClass35_19.method524(this.anInt198);
			local13.method389(-128, 0);
			this.aClass35_20.method524(this.anInt198);
			local13.method389(-202, -371);
			this.aClass35_21.method524(this.anInt198);
			local13.method389(-202, -171);
			this.aClass35_24.method524(this.anInt198);
			local13.method389(0, -265);
			this.aClass35_25.method524(this.anInt198);
			local13.method389(-562, -265);
			this.aClass35_26.method524(this.anInt198);
			local13.method389(-128, -171);
			this.aClass35_27.method524(this.anInt198);
			local13.method389(-562, -171);
			@Pc(107) int[] local107 = new int[local13.anInt627];
			for (@Pc(109) int local109 = 0; local109 < local13.anInt628; local109++) {
				for (@Pc(113) int local113 = 0; local113 < local13.anInt627; local113++) {
					local107[local113] = local13.anIntArray208[local13.anInt627 + local13.anInt627 * local109 - local113 - 1];
				}
				for (@Pc(139) int local139 = 0; local139 < local13.anInt627; local139++) {
					local13.anIntArray208[local139 + local13.anInt627 * local109] = local107[local139];
				}
			}
			this.aClass35_22.method524(this.anInt198);
			local13.method389(382, 0);
			this.aClass35_23.method524(this.anInt198);
			local13.method389(-255, 0);
			this.aClass35_19.method524(this.anInt198);
			local13.method389(254, 0);
			this.aClass35_20.method524(this.anInt198);
			local13.method389(180, -371);
			this.aClass35_21.method524(this.anInt198);
			local13.method389(180, -171);
			this.aClass35_24.method524(this.anInt198);
			local13.method389(382, -265);
			this.aClass35_25.method524(this.anInt198);
			local13.method389(-180, -265);
			this.aClass35_26.method524(this.anInt198);
			local13.method389(254, -171);
			this.aClass35_27.method524(this.anInt198);
			local13.method389(-180, -171);
			local13 = new Class1_Sub1_Sub2_Sub2(this.aClass47_1, "logo", 0);
			this.aClass35_19.method524(this.anInt198);
			local13.method391(382 - local13.anInt627 / 2 - 128, 18);
			System.gc();
		} catch (@Pc(296) RuntimeException local296) {
			signlink.reporterror("37732, " + -323 + ", " + local296.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!d;BI)I")
	private int method181(@OriginalArg(0) Class6 arg0, @OriginalArg(2) int arg1) {
		try {
			if (arg0.anIntArrayArray7 == null || arg1 >= arg0.anIntArrayArray7.length) {
				return -2;
			}
			try {
				@Pc(24) int[] local24 = arg0.anIntArrayArray7[arg1];
				@Pc(26) int local26 = 0;
				@Pc(28) int local28 = 0;
				@Pc(30) byte local30 = 0;
				while (true) {
					@Pc(35) int local35 = local24[local28++];
					@Pc(37) int local37 = 0;
					@Pc(39) byte local39 = 0;
					if (local35 == 0) {
						return local26;
					}
					if (local35 == 1) {
						local37 = this.anIntArray89[local24[local28++]];
					}
					if (local35 == 2) {
						local37 = this.anIntArray90[local24[local28++]];
					}
					if (local35 == 3) {
						local37 = this.anIntArray68[local24[local28++]];
					}
					@Pc(86) Class6 local86;
					@Pc(91) int local91;
					@Pc(104) int local104;
					if (local35 == 4) {
						local86 = Class6.aClass6Array1[local24[local28++]];
						local91 = local24[local28++];
						if (local91 >= 0 && local91 < Class15.anInt572 && (!Class15.method361(local91).aBoolean165 || aBoolean71)) {
							for (local104 = 0; local104 < local86.anIntArray94.length; local104++) {
								if (local86.anIntArray94[local104] == local91 + 1) {
									local37 += local86.anIntArray95[local104];
								}
							}
						}
					}
					if (local35 == 5) {
						local37 = this.anIntArray56[local24[local28++]];
					}
					if (local35 == 6) {
						local37 = anIntArray58[this.anIntArray90[local24[local28++]] - 1];
					}
					if (local35 == 7) {
						local37 = this.anIntArray56[local24[local28++]] * 100 / 46875;
					}
					if (local35 == 8) {
						local37 = aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt121;
					}
					@Pc(179) int local179;
					if (local35 == 9) {
						for (local179 = 0; local179 < Class30.anInt787; local179++) {
							if (Class30.aBooleanArray9[local179]) {
								local37 += this.anIntArray90[local179];
							}
						}
					}
					if (local35 == 10) {
						local86 = Class6.aClass6Array1[local24[local28++]];
						local91 = local24[local28++] + 1;
						if (local91 >= 0 && local91 < Class15.anInt572 && (!Class15.method361(local91).aBoolean165 || aBoolean71)) {
							for (local104 = 0; local104 < local86.anIntArray94.length; local104++) {
								if (local86.anIntArray94[local104] == local91) {
									local37 = 999999999;
									break;
								}
							}
						}
					}
					if (local35 == 11) {
						local37 = this.anInt265;
					}
					if (local35 == 12) {
						local37 = this.anInt312;
					}
					if (local35 == 13) {
						local179 = this.anIntArray56[local24[local28++]];
						local91 = local24[local28++];
						local37 = (local179 & 0x1 << local91) == 0 ? 0 : 1;
					}
					if (local35 == 14) {
						local179 = local24[local28++];
						@Pc(294) Class36 local294 = Class36.aClass36Array1[local179];
						local104 = local294.anInt822;
						@Pc(300) int local300 = local294.anInt823;
						@Pc(303) int local303 = local294.anInt824;
						@Pc(309) int local309 = anIntArray57[local303 - local300];
						local37 = this.anIntArray56[local104] >> local300 & local309;
					}
					if (local35 == 15) {
						local39 = 1;
					}
					if (local35 == 16) {
						local39 = 2;
					}
					if (local35 == 17) {
						local39 = 3;
					}
					if (local35 == 18) {
						local37 = (aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt962 >> 7) + this.anInt354;
					}
					if (local35 == 19) {
						local37 = (aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt963 >> 7) + this.anInt355;
					}
					if (local35 == 20) {
						local37 = local24[local28++];
					}
					if (local39 == 0) {
						if (local30 == 0) {
							local26 += local37;
						}
						if (local30 == 1) {
							local26 -= local37;
						}
						if (local30 == 2 && local37 != 0) {
							local26 /= local37;
						}
						if (local30 == 3) {
							local26 *= local37;
						}
						local30 = 0;
					} else {
						local30 = local39;
					}
				}
			} catch (@Pc(402) Exception local402) {
				return -1;
			}
		} catch (@Pc(405) RuntimeException local405) {
			signlink.reporterror("56748, " + arg0 + ", " + -51 + ", " + arg1 + ", " + local405.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "w", descriptor = "(I)V")
	private void method182() {
		try {
			Class9.aClass40_4.method593();
			Class9.aClass40_5.method593();
			Class13.aClass40_6.method593();
			Class15.aClass40_7.method593();
			Class15.aClass40_8.method593();
			Class1_Sub1_Sub1_Sub1_Sub1.aClass40_1.method593();
			Class33.aClass40_9.method593();
		} catch (@Pc(22) RuntimeException local22) {
			signlink.reporterror("46878, " + 0 + ", " + local22.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(I)V")
	@Override
	protected void method93() {
		try {
			this.aBoolean65 = true;
		} catch (@Pc(8) RuntimeException local8) {
			signlink.reporterror("17252, " + 35628 + ", " + local8.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IILclient!ab;IZ)V")
	private void method183(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class1_Sub1_Sub1_Sub1_Sub1 arg2, @OriginalArg(3) int arg3) {
		try {
			if (arg2 != aClass1_Sub1_Sub1_Sub1_Sub1_1 && this.anInt353 < 400) {
				@Pc(35) String local35;
				if (arg2.anInt122 == 0) {
					local35 = arg2.aString3 + method132(arg2.anInt121, aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt121) + " (level-" + arg2.anInt121 + ")";
				} else {
					local35 = arg2.aString3 + " (skill-" + arg2.anInt122 + ")";
				}
				@Pc(165) int local165;
				if (this.anInt281 == 1) {
					this.aStringArray1[this.anInt353] = "Use " + this.aString8 + " with @whi@" + local35;
					this.anIntArray34[this.anInt353] = 275;
					this.anIntArray35[this.anInt353] = arg3;
					this.anIntArray32[this.anInt353] = arg1;
					this.anIntArray33[this.anInt353] = arg0;
					this.anInt353++;
				} else if (this.anInt297 != 1) {
					for (local165 = 4; local165 >= 0; local165--) {
						if (this.aStringArray6[local165] != null) {
							this.aStringArray1[this.anInt353] = this.aStringArray6[local165] + " @whi@" + local35;
							@Pc(192) short local192 = 0;
							if (this.aStringArray6[local165].equalsIgnoreCase("attack")) {
								if (arg2.anInt121 > aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt121) {
									local192 = 2000;
								}
								if (aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt133 != 0 && arg2.anInt133 != 0) {
									if (aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt133 == arg2.anInt133) {
										local192 = 2000;
									} else {
										local192 = 0;
									}
								}
							} else if (this.aBooleanArray4[local165]) {
								local192 = 2000;
							}
							if (local165 == 0) {
								this.anIntArray34[this.anInt353] = local192 + 639;
							}
							if (local165 == 1) {
								this.anIntArray34[this.anInt353] = local192 + 499;
							}
							if (local165 == 2) {
								this.anIntArray34[this.anInt353] = local192 + 27;
							}
							if (local165 == 3) {
								this.anIntArray34[this.anInt353] = local192 + 387;
							}
							if (local165 == 4) {
								this.anIntArray34[this.anInt353] = local192 + 185;
							}
							this.anIntArray35[this.anInt353] = arg3;
							this.anIntArray32[this.anInt353] = arg1;
							this.anIntArray33[this.anInt353] = arg0;
							this.anInt353++;
						}
					}
				} else if ((this.anInt299 & 0x8) == 8) {
					this.aStringArray1[this.anInt353] = this.aString9 + " @whi@" + local35;
					this.anIntArray34[this.anInt353] = 131;
					this.anIntArray35[this.anInt353] = arg3;
					this.anIntArray32[this.anInt353] = arg1;
					this.anIntArray33[this.anInt353] = arg0;
					this.anInt353++;
				}
				for (local165 = 0; local165 < this.anInt353; local165++) {
					if (this.anIntArray34[local165] == 718) {
						this.aStringArray1[local165] = "Walk here @whi@" + local35;
						break;
					}
				}
			}
		} catch (@Pc(347) RuntimeException local347) {
			signlink.reporterror("80105, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + false + ", " + local347.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Lclient!lb;II)V")
	private void method184(@OriginalArg(0) Class1_Sub1_Sub3 arg0, @OriginalArg(1) int arg1) {
		try {
			this.anInt271 = 0;
			this.anInt243 = 0;
			this.method224(arg1, 816, arg0);
			this.method126(arg0, arg1);
			this.method165(arg1, arg0);
			@Pc(38) int local38;
			for (@Pc(31) int local31 = 0; local31 < this.anInt271; local31++) {
				local38 = this.anIntArray53[local31];
				if (this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local38].anInt1002 != anInt239) {
					this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local38].aClass13_2 = null;
					this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local38] = null;
				}
			}
			if (arg0.anInt720 != arg1) {
				signlink.reporterror(this.aString12 + " size mismatch in getnpcpos - pos:" + arg0.anInt720 + " psize:" + arg1);
				throw new RuntimeException("eek");
			}
			for (local38 = 0; local38 < this.anInt395; local38++) {
				if (this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[this.anIntArray91[local38]] == null) {
					signlink.reporterror(this.aString12 + " null entry in npc list - pos:" + local38 + " size:" + this.anInt395);
					throw new RuntimeException("eek");
				}
			}
		} catch (@Pc(128) RuntimeException local128) {
			signlink.reporterror("51272, " + arg0 + ", " + arg1 + ", " + 0 + ", " + local128.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Lclient!d;Z)Z")
	private boolean method185(@OriginalArg(0) Class6 arg0) {
		try {
			this.aBoolean89 &= true;
			if (arg0.anIntArray96 == null) {
				return false;
			}
			for (@Pc(12) int local12 = 0; local12 < arg0.anIntArray96.length; local12++) {
				@Pc(20) int local20 = this.method181(arg0, local12);
				@Pc(25) int local25 = arg0.anIntArray97[local12];
				if (arg0.anIntArray96[local12] == 2) {
					if (local20 >= local25) {
						return false;
					}
				} else if (arg0.anIntArray96[local12] == 3) {
					if (local20 <= local25) {
						return false;
					}
				} else if (arg0.anIntArray96[local12] == 4) {
					if (local20 == local25) {
						return false;
					}
				} else if (local20 != local25) {
					return false;
				}
			}
			return true;
		} catch (@Pc(72) RuntimeException local72) {
			signlink.reporterror("27609, " + arg0 + ", " + true + ", " + local72.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "x", descriptor = "(I)Ljava/net/Socket;")
	public Socket method186(@OriginalArg(0) int arg0) throws IOException {
		return signlink.mainapp == null ? new Socket(InetAddress.getByName(this.getCodeBase().getHost()), arg0) : signlink.opensocket(arg0);
	}

	@OriginalMember(owner = "client!client", name = "y", descriptor = "(I)V")
	private void method187(@OriginalArg(0) int arg0) {
		try {
			this.aClass1_Sub1_Sub2_Sub3_14 = new Class1_Sub1_Sub2_Sub3(this.aClass47_1, "titlebox", 0);
			this.aClass1_Sub1_Sub2_Sub3_15 = new Class1_Sub1_Sub2_Sub3(this.aClass47_1, "titlebutton", 0);
			this.aClass1_Sub1_Sub2_Sub3Array2 = new Class1_Sub1_Sub2_Sub3[12];
			@Pc(25) int local25 = 0;
			if (arg0 != -8322) {
				anInt380 = -399;
			}
			try {
				local25 = Integer.parseInt(this.getParameter("fl_icon"));
			} catch (@Pc(37) Exception local37) {
			}
			@Pc(41) int local41;
			if (local25 == 0) {
				for (local41 = 0; local41 < 12; local41++) {
					this.aClass1_Sub1_Sub2_Sub3Array2[local41] = new Class1_Sub1_Sub2_Sub3(this.aClass47_1, "runes", local41);
				}
			} else {
				for (local41 = 0; local41 < 12; local41++) {
					this.aClass1_Sub1_Sub2_Sub3Array2[local41] = new Class1_Sub1_Sub2_Sub3(this.aClass47_1, "runes", (local41 & 0x3) + 12);
				}
			}
			this.aClass1_Sub1_Sub2_Sub2_9 = new Class1_Sub1_Sub2_Sub2(128, 265);
			this.aClass1_Sub1_Sub2_Sub2_10 = new Class1_Sub1_Sub2_Sub2(128, 265);
			for (local41 = 0; local41 < 33920; local41++) {
				this.aClass1_Sub1_Sub2_Sub2_9.anIntArray208[local41] = this.aClass35_22.anIntArray231[local41];
			}
			for (@Pc(117) int local117 = 0; local117 < 33920; local117++) {
				this.aClass1_Sub1_Sub2_Sub2_10.anIntArray208[local117] = this.aClass35_23.anIntArray231[local117];
			}
			this.anIntArray40 = new int[256];
			for (@Pc(139) int local139 = 0; local139 < 64; local139++) {
				this.anIntArray40[local139] = local139 * 262144;
			}
			for (@Pc(154) int local154 = 0; local154 < 64; local154++) {
				this.anIntArray40[local154 + 64] = local154 * 1024 + 16711680;
			}
			for (@Pc(173) int local173 = 0; local173 < 64; local173++) {
				this.anIntArray40[local173 + 128] = local173 * 4 + 16776960;
			}
			for (@Pc(192) int local192 = 0; local192 < 64; local192++) {
				this.anIntArray40[local192 + 192] = 16777215;
			}
			this.anIntArray41 = new int[256];
			for (@Pc(211) int local211 = 0; local211 < 64; local211++) {
				this.anIntArray41[local211] = local211 * 1024;
			}
			for (@Pc(226) int local226 = 0; local226 < 64; local226++) {
				this.anIntArray41[local226 + 64] = local226 * 4 + 65280;
			}
			for (@Pc(245) int local245 = 0; local245 < 64; local245++) {
				this.anIntArray41[local245 + 128] = local245 * 262144 + 65535;
			}
			for (@Pc(264) int local264 = 0; local264 < 64; local264++) {
				this.anIntArray41[local264 + 192] = 16777215;
			}
			this.anIntArray42 = new int[256];
			for (@Pc(283) int local283 = 0; local283 < 64; local283++) {
				this.anIntArray42[local283] = local283 * 4;
			}
			for (@Pc(298) int local298 = 0; local298 < 64; local298++) {
				this.anIntArray42[local298 + 64] = local298 * 262144 + 255;
			}
			for (@Pc(317) int local317 = 0; local317 < 64; local317++) {
				this.anIntArray42[local317 + 128] = local317 * 1024 + 16711935;
			}
			for (@Pc(336) int local336 = 0; local336 < 64; local336++) {
				this.anIntArray42[local336 + 192] = 16777215;
			}
			this.anIntArray39 = new int[256];
			this.anIntArray87 = new int[32768];
			this.anIntArray88 = new int[32768];
			this.method149(null);
			this.anIntArray51 = new int[32768];
			this.anIntArray52 = new int[32768];
			this.method96(10, (byte) 1, "Connecting to fileserver");
			if (!this.aBoolean81) {
				this.aBoolean93 = true;
				this.aBoolean81 = true;
				this.method95(this, 2);
			}
		} catch (@Pc(393) RuntimeException local393) {
			signlink.reporterror("76365, " + arg0 + ", " + local393.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "z", descriptor = "(I)V")
	private void method188() {
		try {
			this.aBoolean77 = true;
			try {
				@Pc(6) long local6 = System.currentTimeMillis();
				@Pc(8) int local8 = 0;
				@Pc(10) int local10 = 20;
				while (this.aBoolean81) {
					this.anInt383++;
					this.method139();
					this.method139();
					this.method218(this.anInt400);
					local8++;
					if (local8 > 10) {
						@Pc(34) long local34 = System.currentTimeMillis();
						@Pc(43) int local43 = (int) (local34 - local6) / 10 - local10;
						local10 = 40 - local43;
						if (local10 < 5) {
							local10 = 5;
						}
						local8 = 0;
						local6 = local34;
					}
					try {
						Thread.sleep((long) local10);
					} catch (@Pc(61) Exception local61) {
					}
				}
			} catch (@Pc(67) Exception local67) {
			}
			this.aBoolean77 = false;
		} catch (@Pc(81) RuntimeException local81) {
			signlink.reporterror("74241, " + -797 + ", " + local81.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
	@Override
	public String getParameter(@OriginalArg(0) String arg0) {
		return signlink.mainapp == null ? super.getParameter(arg0) : signlink.mainapp.getParameter(arg0);
	}

	@OriginalMember(owner = "client!client", name = "A", descriptor = "(I)V")
	private void method189() {
		try {
			signlink.anInt917 = 0;
			signlink.midi = "stop";
		} catch (@Pc(10) RuntimeException local10) {
			signlink.reporterror("43693, " + -585 + ", " + local10.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IILclient!d;IZ)V")
	private void method190(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class6 arg2, @OriginalArg(3) int arg3) {
		try {
			if (arg2.anInt406 == 0 && arg2.anIntArray98 != null && (!arg2.aBoolean97 || this.anInt326 == arg2.anInt404 || this.anInt272 == arg2.anInt404 || this.anInt388 == arg2.anInt404)) {
				@Pc(29) int local29 = Class1_Sub1_Sub2.anInt679;
				@Pc(31) int local31 = Class1_Sub1_Sub2.anInt677;
				@Pc(33) int local33 = Class1_Sub1_Sub2.anInt680;
				@Pc(35) int local35 = Class1_Sub1_Sub2.anInt678;
				Class1_Sub1_Sub2.method436(arg1, arg3, arg1 + arg2.anInt409, arg3 + arg2.anInt410);
				@Pc(51) int local51 = arg2.anIntArray98.length;
				for (@Pc(56) int local56 = 0; local56 < local51; local56++) {
					@Pc(65) int local65 = arg2.anIntArray99[local56] + arg1;
					@Pc(74) int local74 = arg2.anIntArray100[local56] + arg3 - arg0;
					@Pc(81) Class6 local81 = Class6.aClass6Array1[arg2.anIntArray98[local56]];
					@Pc(86) int local86 = local65 + local81.anInt411;
					@Pc(91) int local91 = local74 + local81.anInt412;
					if (local81.anInt408 > 0) {
						this.method222(local81);
					}
					if (local81.anInt406 == 0) {
						if (local81.anInt415 > local81.anInt414 - local81.anInt410) {
							local81.anInt415 = local81.anInt414 - local81.anInt410;
						}
						if (local81.anInt415 < 0) {
							local81.anInt415 = 0;
						}
						this.method190(local81.anInt415, local86, local81, local91);
						if (local81.anInt414 > local81.anInt410) {
							this.method114(local81.anInt414, local86 + local81.anInt409, local81.anInt410, local81.anInt415, local91);
						}
					} else if (local81.anInt406 != 1) {
						@Pc(163) int local163;
						@Pc(167) int local167;
						@Pc(178) int local178;
						@Pc(213) int local213;
						@Pc(220) int local220;
						@Pc(161) int local161;
						@Pc(211) int local211;
						if (local81.anInt406 == 2) {
							local161 = 0;
							for (local163 = 0; local163 < local81.anInt410; local163++) {
								for (local167 = 0; local167 < local81.anInt409; local167++) {
									local178 = local86 + local167 * (local81.anInt417 + 32);
									@Pc(187) int local187 = local91 + local163 * (local81.anInt418 + 32);
									if (local161 < 20) {
										local178 += local81.anIntArray101[local161];
										local187 += local81.anIntArray102[local161];
									}
									if (local81.anIntArray94[local161] > 0) {
										local211 = 0;
										local213 = 0;
										local220 = local81.anIntArray94[local161] - 1;
										if (local178 > Class1_Sub1_Sub2.anInt679 - 32 && local178 < Class1_Sub1_Sub2.anInt680 && local187 > Class1_Sub1_Sub2.anInt677 - 32 && local187 < Class1_Sub1_Sub2.anInt678 || this.anInt233 != 0 && this.anInt232 == local161) {
											@Pc(245) int local245 = 0;
											if (this.anInt281 == 1 && this.anInt282 == local161 && this.anInt283 == local81.anInt404) {
												local245 = 16777215;
											}
											@Pc(269) Class1_Sub1_Sub2_Sub2 local269 = Class15.method367((byte) 9, local245, local220, local81.anIntArray95[local161]);
											if (local269 != null) {
												@Pc(348) int local348;
												if (this.anInt233 != 0 && this.anInt232 == local161 && this.anInt231 == local81.anInt404) {
													local211 = super.anInt182 - this.anInt234;
													local213 = super.anInt183 - this.anInt235;
													if (local211 < 5 && local211 > -5) {
														local211 = 0;
													}
													if (local213 < 5 && local213 > -5) {
														local213 = 0;
													}
													if (this.anInt220 < 5) {
														local211 = 0;
														local213 = 0;
													}
													local269.method393(local187 + local213, local178 + local211);
													if (local187 + local213 < Class1_Sub1_Sub2.anInt677 && arg2.anInt415 > 0) {
														local348 = this.anInt338 * (Class1_Sub1_Sub2.anInt677 - local187 - local213) / 3;
														if (local348 > this.anInt338 * 10) {
															local348 = this.anInt338 * 10;
														}
														if (local348 > arg2.anInt415) {
															local348 = arg2.anInt415;
														}
														arg2.anInt415 -= local348;
														this.anInt235 += local348;
													}
													if (local187 + local213 + 32 > Class1_Sub1_Sub2.anInt678 && arg2.anInt415 < arg2.anInt414 - arg2.anInt410) {
														local348 = this.anInt338 * (local187 + local213 + 32 - Class1_Sub1_Sub2.anInt678) / 3;
														if (local348 > this.anInt338 * 10) {
															local348 = this.anInt338 * 10;
														}
														if (local348 > arg2.anInt414 - arg2.anInt410 - arg2.anInt415) {
															local348 = arg2.anInt414 - arg2.anInt410 - arg2.anInt415;
														}
														arg2.anInt415 += local348;
														this.anInt235 -= local348;
													}
												} else if (this.anInt332 != 0 && this.anInt331 == local161 && this.anInt330 == local81.anInt404) {
													local269.method393(local187, local178);
												} else {
													local269.method391(local178, local187);
												}
												if (local269.anInt631 == 33 || local81.anIntArray95[local161] != 1) {
													local348 = local81.anIntArray95[local161];
													this.aClass1_Sub1_Sub2_Sub4_1.method451(method119(local348), local187 + local213 + 10, local178 + 1 + local211, 0);
													this.aClass1_Sub1_Sub2_Sub4_1.method451(method119(local348), local187 + local213 + 9, local178 + local211, 16776960);
												}
											}
										}
									} else if (local81.aClass1_Sub1_Sub2_Sub2Array8 != null && local161 < 20) {
										@Pc(537) Class1_Sub1_Sub2_Sub2 local537 = local81.aClass1_Sub1_Sub2_Sub2Array8[local161];
										if (local537 != null) {
											local537.method391(local178, local187);
										}
									}
									local161++;
								}
							}
						} else if (local81.anInt406 == 3) {
							@Pc(563) boolean local563 = false;
							if (this.anInt388 == local81.anInt404 || this.anInt272 == local81.anInt404 || this.anInt326 == local81.anInt404) {
								local563 = true;
							}
							if (this.method185(local81)) {
								local161 = local81.anInt420;
								if (local563 && local81.anInt422 != 0) {
									local161 = local81.anInt422;
								}
							} else {
								local161 = local81.anInt419;
								if (local563 && local81.anInt421 != 0) {
									local161 = local81.anInt421;
								}
							}
							if (local81.aByte10 == 0) {
								if (local81.aBoolean103) {
									Class1_Sub1_Sub2.method439(local161, local81.anInt410, local91, local81.anInt409, (byte) 5, local86);
								} else {
									Class1_Sub1_Sub2.method440(local86, local91, local81.anInt410, local161, local81.anInt409);
								}
							} else if (local81.aBoolean103) {
								Class1_Sub1_Sub2.method438(local81.anInt410, local81.anInt409, 256 - (local81.aByte10 & 0xFF), local161, local86, local91);
							} else {
								Class1_Sub1_Sub2.method441(local91, 256 - (local81.aByte10 & 0xFF), local81.anInt410, local81.anInt409, local161, local86);
							}
						} else {
							@Pc(681) Class1_Sub1_Sub2_Sub4 local681;
							if (local81.anInt406 == 4) {
								local681 = local81.aClass1_Sub1_Sub2_Sub4_5;
								@Pc(684) String local684 = local81.aString18;
								@Pc(686) boolean local686 = false;
								if (this.anInt388 == local81.anInt404 || this.anInt272 == local81.anInt404 || this.anInt326 == local81.anInt404) {
									local686 = true;
								}
								if (this.method185(local81)) {
									local163 = local81.anInt420;
									if (local686 && local81.anInt422 != 0) {
										local163 = local81.anInt422;
									}
									if (local81.aString19.length() > 0) {
										local684 = local81.aString19;
									}
								} else {
									local163 = local81.anInt419;
									if (local686 && local81.anInt421 != 0) {
										local163 = local81.anInt421;
									}
								}
								if (local81.anInt407 == 6 && this.aBoolean94) {
									local684 = "Please wait...";
									local163 = local81.anInt419;
								}
								if (Class1_Sub1_Sub2.anInt675 == 479) {
									if (local163 == 16776960) {
										local163 = 255;
									}
									if (local163 == 49152) {
										local163 = 16777215;
									}
								}
								local211 = local91 + local681.anInt687;
								while (local684.length() > 0) {
									if (local684.indexOf("%") != -1) {
										label348: while (true) {
											local213 = local684.indexOf("%1");
											if (local213 == -1) {
												while (true) {
													local213 = local684.indexOf("%2");
													if (local213 == -1) {
														while (true) {
															local213 = local684.indexOf("%3");
															if (local213 == -1) {
																while (true) {
																	local213 = local684.indexOf("%4");
																	if (local213 == -1) {
																		while (true) {
																			local213 = local684.indexOf("%5");
																			if (local213 == -1) {
																				break label348;
																			}
																			local684 = local684.substring(0, local213) + this.method101(this.method181(local81, 4)) + local684.substring(local213 + 2);
																		}
																	}
																	local684 = local684.substring(0, local213) + this.method101(this.method181(local81, 3)) + local684.substring(local213 + 2);
																}
															}
															local684 = local684.substring(0, local213) + this.method101(this.method181(local81, 2)) + local684.substring(local213 + 2);
														}
													}
													local684 = local684.substring(0, local213) + this.method101(this.method181(local81, 1)) + local684.substring(local213 + 2);
												}
											}
											local684 = local684.substring(0, local213) + this.method101(this.method181(local81, 0)) + local684.substring(local213 + 2);
										}
									}
									local213 = local684.indexOf("\\n");
									@Pc(958) String local958;
									if (local213 == -1) {
										local958 = local684;
										local684 = "";
									} else {
										local958 = local684.substring(0, local213);
										local684 = local684.substring(local213 + 2);
									}
									if (local81.aBoolean104) {
										local681.method448(local81.aBoolean105, local163, local958, local86 + local81.anInt409 / 2, local211);
									} else {
										local681.method455(local211, local86, local958, local163, local81.aBoolean105);
									}
									local211 += local681.anInt687;
								}
							} else if (local81.anInt406 == 5) {
								@Pc(1020) Class1_Sub1_Sub2_Sub2 local1020;
								if (this.method185(local81)) {
									local1020 = local81.aClass1_Sub1_Sub2_Sub2_15;
								} else {
									local1020 = local81.aClass1_Sub1_Sub2_Sub2_14;
								}
								if (local1020 != null) {
									local1020.method391(local86, local91);
								}
							} else if (local81.anInt406 == 6) {
								local161 = Class1_Sub1_Sub2_Sub1.anInt566;
								local163 = Class1_Sub1_Sub2_Sub1.anInt567;
								Class1_Sub1_Sub2_Sub1.anInt566 = local86 + local81.anInt409 / 2;
								Class1_Sub1_Sub2_Sub1.anInt567 = local91 + local81.anInt410 / 2;
								local167 = Class1_Sub1_Sub2_Sub1.anIntArray178[local81.anInt430] * local81.anInt429 >> 16;
								local178 = Class1_Sub1_Sub2_Sub1.anIntArray179[local81.anInt430] * local81.anInt429 >> 16;
								@Pc(1081) boolean local1081 = this.method185(local81);
								if (local1081) {
									local211 = local81.anInt428;
								} else {
									local211 = local81.anInt427;
								}
								@Pc(1101) Class1_Sub1_Sub1_Sub5 local1101;
								if (local211 == -1) {
									local1101 = local81.method233(-1, -1, local1081);
								} else {
									@Pc(1107) Class27 local1107 = Class27.aClass27Array1[local211];
									local1101 = local81.method233(local1107.anIntArray226[local81.anInt402], local1107.anIntArray225[local81.anInt402], local1081);
								}
								if (local1101 != null) {
									local1101.method281(local81.anInt431, 0, local81.anInt430, 0, local167, local178);
								}
								Class1_Sub1_Sub2_Sub1.anInt566 = local161;
								Class1_Sub1_Sub2_Sub1.anInt567 = local163;
							} else if (local81.anInt406 == 7) {
								local681 = local81.aClass1_Sub1_Sub2_Sub4_5;
								local163 = 0;
								for (local167 = 0; local167 < local81.anInt410; local167++) {
									for (local178 = 0; local178 < local81.anInt409; local178++) {
										if (local81.anIntArray94[local163] > 0) {
											@Pc(1171) Class15 local1171 = Class15.method361(local81.anIntArray94[local163] - 1);
											@Pc(1174) String local1174 = local1171.aString25;
											if (local1171.aBoolean164 || local81.anIntArray95[local163] != 1) {
												local1174 = local1174 + " x" + method192(local81.anIntArray95[local163]);
											}
											local213 = local86 + local178 * (local81.anInt417 + 115);
											local220 = local91 + local167 * (local81.anInt418 + 12);
											if (local81.aBoolean104) {
												local681.method448(local81.aBoolean105, local81.anInt419, local1174, local213 + local81.anInt409 / 2, local220);
											} else {
												local681.method455(local220, local213, local1174, local81.anInt419, local81.aBoolean105);
											}
										}
										local163++;
									}
								}
							}
						}
					}
				}
				Class1_Sub1_Sub2.method436(local29, local31, local33, local35);
			}
		} catch (@Pc(1270) RuntimeException local1270) {
			signlink.reporterror("44790, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + true + ", " + local1270.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Z)V")
	@Override
	protected void method90() {
		try {
			if (!this.aBoolean62 && !this.aBoolean67 && !this.aBoolean54) {
				anInt239++;
				if (this.aBoolean89) {
					this.method193();
				} else {
					this.method172();
				}
				this.method166();
			}
		} catch (@Pc(40) RuntimeException local40) {
			signlink.reporterror("39721, " + true + ", " + local40.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "([BII)Z")
	private boolean method191(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		try {
			this.anInt222 += 0;
			return arg0 == null ? true : signlink.wavesave(arg0, arg1);
		} catch (@Pc(14) RuntimeException local14) {
			signlink.reporterror("69901, " + arg0 + ", " + arg1 + ", " + 0 + ", " + local14.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "p", descriptor = "(Z)V")
	private void method193() {
		try {
			if (this.anInt277 > 1) {
				this.anInt277--;
			}
			if (this.anInt226 > 0) {
				this.anInt226--;
			}
			for (@Pc(22) int local22 = 0; local22 < 5 && this.method99(); local22++) {
			}
			if (this.aBoolean89) {
				@Pc(41) Object local41 = this.aClass11_1.anObject1;
				@Pc(66) int local66;
				@Pc(68) int local68;
				@Pc(70) int local70;
				@Pc(103) int local103;
				synchronized (this.aClass11_1.anObject1) {
					if (!aBoolean64) {
						this.aClass11_1.anInt507 = 0;
					} else if (super.anInt187 != 0 || this.aClass11_1.anInt507 >= 40) {
						this.aClass1_Sub1_Sub3_3.method469(151);
						this.aClass1_Sub1_Sub3_3.method470(0);
						local66 = this.aClass1_Sub1_Sub3_3.anInt720;
						local68 = 0;
						@Pc(86) int local86;
						for (local70 = 0; local70 < this.aClass11_1.anInt507 && local66 - this.aClass1_Sub1_Sub3_3.anInt720 < 240; local70++) {
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
							if (local103 != this.anInt398 || local86 != this.anInt399) {
								@Pc(165) int local165 = local103 - this.anInt398;
								this.anInt398 = local103;
								@Pc(173) int local173 = local86 - this.anInt399;
								this.anInt399 = local86;
								if (this.anInt389 < 8 && local165 >= -32 && local165 <= 31 && local173 >= -32 && local173 <= 31) {
									local165 += 32;
									local173 += 32;
									this.aClass1_Sub1_Sub3_3.method471((this.anInt389 << 12) + (local165 << 6) + local173);
									this.anInt389 = 0;
								} else if (this.anInt389 < 8) {
									this.aClass1_Sub1_Sub3_3.method473((this.anInt389 << 19) + local120 + 8388608);
									this.anInt389 = 0;
								} else {
									this.aClass1_Sub1_Sub3_3.method474((this.anInt389 << 19) + local120 - 1073741824);
									this.anInt389 = 0;
								}
							} else if (this.anInt389 < 2047) {
								this.anInt389++;
							}
						}
						this.aClass1_Sub1_Sub3_3.method479(this.aClass1_Sub1_Sub3_3.anInt720 - local66);
						if (local68 >= this.aClass11_1.anInt507) {
							this.aClass11_1.anInt507 = 0;
						} else {
							this.aClass11_1.anInt507 -= local68;
							for (local86 = 0; local86 < this.aClass11_1.anInt507; local86++) {
								this.aClass11_1.anIntArray162[local86] = this.aClass11_1.anIntArray162[local86 + local68];
								this.aClass11_1.anIntArray163[local86] = this.aClass11_1.anIntArray163[local86 + local68];
							}
						}
					}
				}
				if (super.anInt187 != 0) {
					@Pc(336) long local336 = (super.aLong13 - this.aLong18) / 50L;
					if (local336 > 4095L) {
						local336 = 4095L;
					}
					this.aLong18 = super.aLong13;
					local66 = super.anInt189;
					if (local66 < 0) {
						local66 = 0;
					} else if (local66 > 502) {
						local66 = 502;
					}
					local68 = super.anInt188;
					if (local68 < 0) {
						local68 = 0;
					} else if (local68 > 764) {
						local68 = 764;
					}
					local70 = local66 * 765 + local68;
					@Pc(382) byte local382 = 0;
					if (super.anInt187 == 2) {
						local382 = 1;
					}
					local103 = (int) local336;
					this.aClass1_Sub1_Sub3_3.method469(240);
					this.aClass1_Sub1_Sub3_3.method474((local103 << 20) + (local382 << 19) + local70);
				}
				if (this.anInt362 > 0) {
					this.anInt362--;
				}
				if (super.anIntArray30[1] == 1 || super.anIntArray30[2] == 1 || super.anIntArray30[3] == 1 || super.anIntArray30[4] == 1) {
					this.aBoolean86 = true;
				}
				if (this.aBoolean86 && this.anInt362 <= 0) {
					this.anInt362 = 20;
					this.aBoolean86 = false;
					this.aClass1_Sub1_Sub3_3.method469(169);
					this.aClass1_Sub1_Sub3_3.method471(this.anInt390);
					this.aClass1_Sub1_Sub3_3.method471(this.anInt391);
				}
				if (super.aBoolean51 && !this.aBoolean92) {
					this.aBoolean92 = true;
					this.aClass1_Sub1_Sub3_3.method469(247);
					this.aClass1_Sub1_Sub3_3.method470(1);
				}
				if (!super.aBoolean51 && this.aBoolean92) {
					this.aBoolean92 = false;
					this.aClass1_Sub1_Sub3_3.method469(247);
					this.aClass1_Sub1_Sub3_3.method470(0);
				}
				this.method135();
				this.method209();
				this.method115();
				this.anInt224++;
				if (this.anInt224 > 750) {
					this.method113();
				}
				this.method97();
				this.method197();
				this.method159();
				this.anInt338++;
				if (this.anInt373 != 0) {
					this.anInt372 += 20;
					if (this.anInt372 >= 400) {
						this.anInt373 = 0;
					}
				}
				if (this.anInt332 != 0) {
					this.anInt329++;
					if (this.anInt329 >= 15) {
						if (this.anInt332 == 2) {
							this.aBoolean73 = true;
						}
						if (this.anInt332 == 3) {
							this.aBoolean88 = true;
						}
						this.anInt332 = 0;
					}
				}
				if (this.anInt233 != 0) {
					this.anInt220++;
					if (super.anInt182 > this.anInt234 + 5 || super.anInt182 < this.anInt234 - 5 || super.anInt183 > this.anInt235 + 5 || super.anInt183 < this.anInt235 - 5) {
						this.aBoolean61 = true;
					}
					if (super.anInt181 == 0) {
						if (this.anInt233 == 2) {
							this.aBoolean73 = true;
						}
						if (this.anInt233 == 3) {
							this.aBoolean88 = true;
						}
						this.anInt233 = 0;
						if (this.aBoolean61 && this.anInt220 >= 5) {
							this.anInt323 = -1;
							this.method112();
							if (this.anInt323 == this.anInt231 && this.anInt322 != this.anInt232) {
								@Pc(682) Class6 local682 = Class6.aClass6Array1[this.anInt231];
								@Pc(684) byte local684 = 0;
								if (this.anInt249 == 1 && local682.anInt408 == 206) {
									local684 = 1;
								}
								if (local682.anIntArray94[this.anInt322] <= 0) {
									local684 = 0;
								}
								if (local682.aBoolean102) {
									local66 = this.anInt232;
									local68 = this.anInt322;
									local682.anIntArray94[local68] = local682.anIntArray94[local66];
									local682.anIntArray95[local68] = local682.anIntArray95[local66];
									local682.anIntArray94[local66] = -1;
									local682.anIntArray95[local66] = 0;
								} else if (local684 == 1) {
									local66 = this.anInt232;
									local68 = this.anInt322;
									while (local66 != local68) {
										if (local66 > local68) {
											local682.method232(local66 - 1, local66, this.aByte3);
											local66--;
										} else if (local66 < local68) {
											local682.method232(local66 + 1, local66, this.aByte3);
											local66++;
										}
									}
								} else {
									local682.method232(this.anInt322, this.anInt232, this.aByte3);
								}
								this.aClass1_Sub1_Sub3_3.method469(38);
								this.aClass1_Sub1_Sub3_3.method471(this.anInt231);
								this.aClass1_Sub1_Sub3_3.method471(this.anInt232);
								this.aClass1_Sub1_Sub3_3.method471(this.anInt322);
								this.aClass1_Sub1_Sub3_3.method470(local684);
							}
						} else if ((this.anInt219 == 1 || this.method164(this.anInt353 - 1)) && this.anInt353 > 2) {
							this.method148();
						} else if (this.anInt353 > 0) {
							this.method223(this.anInt353 - 1);
						}
						this.anInt329 = 10;
						super.anInt187 = 0;
					}
				}
				anInt385++;
				if (anInt385 > 62) {
					anInt385 = 0;
					this.aClass1_Sub1_Sub3_3.method469(6);
				}
				@Pc(871) int local871;
				@Pc(873) int local873;
				if (Class37.anInt854 != -1) {
					local871 = Class37.anInt854;
					local873 = Class37.anInt855;
					@Pc(894) boolean local894 = this.method156(aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray273[0], aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray272[0], 0, local871, local873, 0, true, 0, 0, (byte) 4, 0, 0);
					Class37.anInt854 = -1;
					if (local894) {
						this.anInt370 = super.anInt188;
						this.anInt371 = super.anInt189;
						this.anInt373 = 1;
						this.anInt372 = 0;
					}
				}
				if (super.anInt187 == 1 && this.aString5 != null) {
					this.aString5 = null;
					this.aBoolean88 = true;
					super.anInt187 = 0;
				}
				this.method122();
				this.method118();
				this.method196((byte) 2);
				this.method106();
				if (super.anInt181 == 1 || super.anInt187 == 1) {
					this.anInt260++;
				}
				if (this.anInt273 == 2) {
					this.method177();
				}
				if (this.anInt273 == 2 && this.aBoolean52) {
					this.method141();
				}
				for (local871 = 0; local871 < 5; local871++) {
					@Pc(984) int local984 = this.anIntArray45[local871]++;
				}
				this.method160();
				super.anInt180++;
				if (super.anInt180 > 4500) {
					this.anInt226 = 250;
					super.anInt180 -= 500;
					this.aClass1_Sub1_Sub3_3.method469(80);
				}
				this.anInt296++;
				if (this.anInt296 > 500) {
					this.anInt296 = 0;
					local873 = (int) (Math.random() * 8.0D);
					if ((local873 & 0x1) == 1) {
						this.anInt247 += this.anInt248;
					}
					if ((local873 & 0x2) == 2) {
						this.anInt258 += this.anInt259;
					}
					if ((local873 & 0x4) == 4) {
						this.anInt236 += this.anInt237;
					}
				}
				if (this.anInt247 < -50) {
					this.anInt248 = 2;
				}
				if (this.anInt247 > 50) {
					this.anInt248 = -2;
				}
				if (this.anInt258 < -55) {
					this.anInt259 = 2;
				}
				if (this.anInt258 > 55) {
					this.anInt259 = -2;
				}
				if (this.anInt236 < -40) {
					this.anInt237 = 1;
				}
				if (this.anInt236 > 40) {
					this.anInt237 = -1;
				}
				this.anInt267++;
				if (this.anInt267 > 500) {
					this.anInt267 = 0;
					local873 = (int) (Math.random() * 8.0D);
					if ((local873 & 0x1) == 1) {
						this.anInt310 += this.anInt311;
					}
					if ((local873 & 0x2) == 2) {
						this.anInt261 += this.anInt262;
					}
				}
				if (this.anInt310 < -60) {
					this.anInt311 = 2;
				}
				if (this.anInt310 > 60) {
					this.anInt311 = -2;
				}
				if (this.anInt261 < -20) {
					this.anInt262 = 1;
				}
				if (this.anInt261 > 10) {
					this.anInt262 = -1;
				}
				this.anInt225++;
				if (this.anInt225 > 50) {
					this.aClass1_Sub1_Sub3_3.method469(115);
				}
				try {
					if (this.aClass8_1 != null && this.aClass1_Sub1_Sub3_3.anInt720 > 0) {
						this.aClass8_1.method251(this.aClass1_Sub1_Sub3_3.anInt720, this.aClass1_Sub1_Sub3_3.aByteArray9);
						this.aClass1_Sub1_Sub3_3.anInt720 = 0;
						this.anInt225 = 0;
					}
				} catch (@Pc(1226) IOException local1226) {
					this.method113();
				} catch (@Pc(1231) Exception local1231) {
					this.method230();
				}
			}
		} catch (@Pc(1236) RuntimeException local1236) {
			signlink.reporterror("68424, " + true + ", " + local1236.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!gc;IIII)V")
	private void method194(@OriginalArg(0) Class13 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		try {
			if (this.anInt353 < 400) {
				if (arg0.anIntArray174 != null) {
					arg0 = arg0.method327();
				}
				if (arg0 != null) {
					@Pc(19) String local19 = arg0.aString24;
					if (arg0.anInt535 != 0) {
						local19 = local19 + method132(arg0.anInt535, aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt121) + " (level-" + arg0.anInt535 + ")";
					}
					if (this.anInt281 == 1) {
						this.aStringArray1[this.anInt353] = "Use " + this.aString8 + " with @yel@" + local19;
						this.anIntArray34[this.anInt353] = 829;
						this.anIntArray35[this.anInt353] = arg1;
						this.anIntArray32[this.anInt353] = arg2;
						this.anIntArray33[this.anInt353] = arg3;
						this.anInt353++;
					} else if (this.anInt297 != 1) {
						@Pc(162) int local162;
						if (arg0.aStringArray9 != null) {
							for (local162 = 4; local162 >= 0; local162--) {
								if (arg0.aStringArray9[local162] != null && !arg0.aStringArray9[local162].equalsIgnoreCase("attack")) {
									this.aStringArray1[this.anInt353] = arg0.aStringArray9[local162] + " @yel@" + local19;
									if (local162 == 0) {
										this.anIntArray34[this.anInt353] = 242;
									}
									if (local162 == 1) {
										this.anIntArray34[this.anInt353] = 209;
									}
									if (local162 == 2) {
										this.anIntArray34[this.anInt353] = 309;
									}
									if (local162 == 3) {
										this.anIntArray34[this.anInt353] = 852;
									}
									if (local162 == 4) {
										this.anIntArray34[this.anInt353] = 793;
									}
									this.anIntArray35[this.anInt353] = arg1;
									this.anIntArray32[this.anInt353] = arg2;
									this.anIntArray33[this.anInt353] = arg3;
									this.anInt353++;
								}
							}
						}
						if (arg0.aStringArray9 != null) {
							for (local162 = 4; local162 >= 0; local162--) {
								if (arg0.aStringArray9[local162] != null && arg0.aStringArray9[local162].equalsIgnoreCase("attack")) {
									@Pc(286) short local286 = 0;
									if (arg0.anInt535 > aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt121) {
										local286 = 2000;
									}
									this.aStringArray1[this.anInt353] = arg0.aStringArray9[local162] + " @yel@" + local19;
									if (local162 == 0) {
										this.anIntArray34[this.anInt353] = local286 + 242;
									}
									if (local162 == 1) {
										this.anIntArray34[this.anInt353] = local286 + 209;
									}
									if (local162 == 2) {
										this.anIntArray34[this.anInt353] = local286 + 309;
									}
									if (local162 == 3) {
										this.anIntArray34[this.anInt353] = local286 + 852;
									}
									if (local162 == 4) {
										this.anIntArray34[this.anInt353] = local286 + 793;
									}
									this.anIntArray35[this.anInt353] = arg1;
									this.anIntArray32[this.anInt353] = arg2;
									this.anIntArray33[this.anInt353] = arg3;
									this.anInt353++;
								}
							}
						}
						this.aStringArray1[this.anInt353] = "Examine @yel@" + local19;
						this.anIntArray34[this.anInt353] = 1714;
						this.anIntArray35[this.anInt353] = arg1;
						this.anIntArray32[this.anInt353] = arg2;
						this.anIntArray33[this.anInt353] = arg3;
						this.anInt353++;
					} else if ((this.anInt299 & 0x2) == 2) {
						this.aStringArray1[this.anInt353] = this.aString9 + " @yel@" + local19;
						this.anIntArray34[this.anInt353] = 240;
						this.anIntArray35[this.anInt353] = arg1;
						this.anIntArray32[this.anInt353] = arg2;
						this.anIntArray33[this.anInt353] = arg3;
						this.anInt353++;
						return;
					}
				}
			}
		} catch (@Pc(436) RuntimeException local436) {
			signlink.reporterror("50737, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + -769 + ", " + local436.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IBILjava/lang/String;Ljava/lang/String;I)Lclient!xb;")
	private Class47 method195(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) String arg2, @OriginalArg(4) String arg3, @OriginalArg(5) int arg4) {
		try {
			@Pc(3) byte[] local3 = null;
			@Pc(12) int local12 = 5;
			try {
				if (this.aClass45Array1[0] != null) {
					local3 = this.aClass45Array1[0].method658(arg1);
				}
			} catch (@Pc(27) Exception local27) {
			}
			@Pc(41) int local41;
			if (local3 != null) {
				this.aCRC32_1.reset();
				this.aCRC32_1.update(local3);
				local41 = (int) this.aCRC32_1.getValue();
				if (local41 != arg0) {
					local3 = null;
				}
			}
			if (local3 != null) {
				return new Class47(false, local3);
			}
			local41 = 0;
			while (local3 == null) {
				@Pc(62) String local62 = "Unknown error";
				this.method96(arg4, (byte) 1, "Requesting " + arg2);
				@Pc(77) int local77;
				try {
					local77 = 0;
					@Pc(88) DataInputStream local88 = this.method163(arg3 + arg0);
					@Pc(91) byte[] local91 = new byte[6];
					local88.readFully(local91, 0, 6);
					@Pc(102) Class1_Sub1_Sub3 local102 = new Class1_Sub1_Sub3(local91, (byte) -93);
					local102.anInt720 = 3;
					@Pc(110) int local110 = local102.method484() + 6;
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
							this.method96(arg4, (byte) 1, "Loading " + arg2 + " - " + local175 + "%");
						}
						local77 = local175;
					}
					local88.close();
					try {
						if (this.aClass45Array1[0] != null) {
							this.aClass45Array1[0].method659(local3, arg1, local3.length);
						}
					} catch (@Pc(220) Exception local220) {
						this.aClass45Array1[0] = null;
					}
					if (local3 != null) {
						this.aCRC32_1.reset();
						this.aCRC32_1.update(local3);
						local135 = (int) this.aCRC32_1.getValue();
						if (local135 != arg0) {
							local3 = null;
							local41++;
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
					for (local77 = local12; local77 > 0; local77--) {
						if (local41 >= 3) {
							this.method96(arg4, (byte) 1, "Game updated - please reload page");
							local77 = 10;
						} else {
							this.method96(arg4, (byte) 1, local62 + " - Retrying in " + local77);
						}
						try {
							Thread.sleep(1000L);
						} catch (@Pc(327) Exception local327) {
						}
					}
					local12 *= 2;
					if (local12 > 60) {
						local12 = 60;
					}
					this.aBoolean85 = !this.aBoolean85;
				}
			}
			return new Class47(false, local3);
		} catch (@Pc(359) RuntimeException local359) {
			signlink.reporterror("15378, " + arg0 + ", " + -56 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local359.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "m", descriptor = "(B)V")
	private void method196(@OriginalArg(0) byte arg0) {
		try {
			@Pc(4) boolean local4 = false;
			if (super.anInt187 == 1) {
				if (super.anInt188 >= 539 && super.anInt188 <= 573 && super.anInt189 >= 169 && super.anInt189 < 205 && this.anIntArray81[0] != -1) {
					this.aBoolean73 = true;
					this.anInt270 = 0;
					this.aBoolean80 = true;
				}
				if (super.anInt188 >= 569 && super.anInt188 <= 599 && super.anInt189 >= 168 && super.anInt189 < 205 && this.anIntArray81[1] != -1) {
					this.aBoolean73 = true;
					this.anInt270 = 1;
					this.aBoolean80 = true;
				}
				if (super.anInt188 >= 597 && super.anInt188 <= 627 && super.anInt189 >= 168 && super.anInt189 < 205 && this.anIntArray81[2] != -1) {
					this.aBoolean73 = true;
					this.anInt270 = 2;
					this.aBoolean80 = true;
				}
				if (super.anInt188 >= 625 && super.anInt188 <= 669 && super.anInt189 >= 168 && super.anInt189 < 203 && this.anIntArray81[3] != -1) {
					this.aBoolean73 = true;
					this.anInt270 = 3;
					this.aBoolean80 = true;
				}
				if (super.anInt188 >= 666 && super.anInt188 <= 696 && super.anInt189 >= 168 && super.anInt189 < 205 && this.anIntArray81[4] != -1) {
					this.aBoolean73 = true;
					this.anInt270 = 4;
					this.aBoolean80 = true;
				}
				if (super.anInt188 >= 694 && super.anInt188 <= 724 && super.anInt189 >= 168 && super.anInt189 < 205 && this.anIntArray81[5] != -1) {
					this.aBoolean73 = true;
					this.anInt270 = 5;
					this.aBoolean80 = true;
				}
				if (super.anInt188 >= 722 && super.anInt188 <= 756 && super.anInt189 >= 169 && super.anInt189 < 205 && this.anIntArray81[6] != -1) {
					this.aBoolean73 = true;
					this.anInt270 = 6;
					this.aBoolean80 = true;
				}
				if (super.anInt188 >= 540 && super.anInt188 <= 574 && super.anInt189 >= 466 && super.anInt189 < 502 && this.anIntArray81[7] != -1) {
					this.aBoolean73 = true;
					this.anInt270 = 7;
					this.aBoolean80 = true;
				}
				if (super.anInt188 >= 572 && super.anInt188 <= 602 && super.anInt189 >= 466 && super.anInt189 < 503 && this.anIntArray81[8] != -1) {
					this.aBoolean73 = true;
					this.anInt270 = 8;
					this.aBoolean80 = true;
				}
				if (super.anInt188 >= 599 && super.anInt188 <= 629 && super.anInt189 >= 466 && super.anInt189 < 503 && this.anIntArray81[9] != -1) {
					this.aBoolean73 = true;
					this.anInt270 = 9;
					this.aBoolean80 = true;
				}
				if (super.anInt188 >= 627 && super.anInt188 <= 671 && super.anInt189 >= 467 && super.anInt189 < 502 && this.anIntArray81[10] != -1) {
					this.aBoolean73 = true;
					this.anInt270 = 10;
					this.aBoolean80 = true;
				}
				if (super.anInt188 >= 669 && super.anInt188 <= 699 && super.anInt189 >= 466 && super.anInt189 < 503 && this.anIntArray81[11] != -1) {
					this.aBoolean73 = true;
					this.anInt270 = 11;
					this.aBoolean80 = true;
				}
				if (super.anInt188 >= 696 && super.anInt188 <= 726 && super.anInt189 >= 466 && super.anInt189 < 503 && this.anIntArray81[12] != -1) {
					this.aBoolean73 = true;
					this.anInt270 = 12;
					this.aBoolean80 = true;
				}
				if (super.anInt188 >= 724 && super.anInt188 <= 758 && super.anInt189 >= 466 && super.anInt189 < 502 && this.anIntArray81[13] != -1) {
					this.aBoolean73 = true;
					this.anInt270 = 13;
					this.aBoolean80 = true;
					return;
				}
			}
		} catch (@Pc(447) RuntimeException local447) {
			signlink.reporterror("7485, " + arg0 + ", " + local447.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "B", descriptor = "(I)V")
	private void method197() {
		try {
			for (@Pc(1) int local1 = 0; local1 < this.anInt395; local1++) {
				@Pc(8) int local8 = this.anIntArray91[local1];
				@Pc(13) Class1_Sub1_Sub1_Sub1_Sub2 local13 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local8];
				if (local13 != null) {
					this.method198(local13, local13.aClass13_2.aByte18);
				}
			}
		} catch (@Pc(37) RuntimeException local37) {
			signlink.reporterror("13827, " + 49698 + ", " + local37.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILclient!y;I)V")
	private void method198(@OriginalArg(1) Class1_Sub1_Sub1_Sub1 arg0, @OriginalArg(2) int arg1) {
		try {
			this.anInt222 += 0;
			if (arg0.anInt962 < 128 || arg0.anInt963 < 128 || arg0.anInt962 >= 13184 || arg0.anInt963 >= 13184) {
				arg0.anInt985 = -1;
				arg0.anInt990 = -1;
				arg0.anInt999 = 0;
				arg0.anInt1000 = 0;
				arg0.anInt962 = arg0.anIntArray272[0] * 128 + arg0.anInt965 * 64;
				arg0.anInt963 = arg0.anIntArray273[0] * 128 + arg0.anInt965 * 64;
				arg0.method679();
			}
			if (arg0 == aClass1_Sub1_Sub1_Sub1_Sub1_1 && (arg0.anInt962 < 1536 || arg0.anInt963 < 1536 || arg0.anInt962 >= 11776 || arg0.anInt963 >= 11776)) {
				arg0.anInt985 = -1;
				arg0.anInt990 = -1;
				arg0.anInt999 = 0;
				arg0.anInt1000 = 0;
				arg0.anInt962 = arg0.anIntArray272[0] * 128 + arg0.anInt965 * 64;
				arg0.anInt963 = arg0.anIntArray273[0] * 128 + arg0.anInt965 * 64;
				arg0.method679();
			}
			if (arg0.anInt999 > anInt239) {
				this.method199(arg0);
			} else if (arg0.anInt1000 >= anInt239) {
				this.method200(arg0);
			} else {
				this.method201(arg0, 180);
			}
			this.method202(arg0, this.aBoolean82);
			this.method203(arg0);
		} catch (@Pc(159) RuntimeException local159) {
			signlink.reporterror("74989, " + 0 + ", " + arg0 + ", " + arg1 + ", " + local159.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!y;I)V")
	private void method199(@OriginalArg(0) Class1_Sub1_Sub1_Sub1 arg0) {
		try {
			@Pc(4) int local4 = arg0.anInt999 - anInt239;
			@Pc(23) int local23 = arg0.anInt995 * 128 + arg0.anInt965 * 64;
			@Pc(33) int local33 = arg0.anInt997 * 128 + arg0.anInt965 * 64;
			arg0.anInt962 += (local23 - arg0.anInt962) / local4;
			arg0.anInt963 += (local33 - arg0.anInt963) / local4;
			arg0.anInt1007 = 0;
			if (arg0.anInt1001 == 0) {
				arg0.anInt1004 = 1024;
			}
			if (arg0.anInt1001 == 1) {
				arg0.anInt1004 = 1536;
			}
			if (arg0.anInt1001 == 2) {
				arg0.anInt1004 = 0;
			}
			if (arg0.anInt1001 == 3) {
				arg0.anInt1004 = 512;
			}
		} catch (@Pc(87) RuntimeException local87) {
			signlink.reporterror("52254, " + arg0 + ", " + -718 + ", " + local87.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!y;B)V")
	private void method200(@OriginalArg(0) Class1_Sub1_Sub1_Sub1 arg0) {
		try {
			if (arg0.anInt1000 == anInt239 || arg0.anInt985 == -1 || arg0.anInt988 != 0 || arg0.anInt987 + 1 > Class27.aClass27Array1[arg0.anInt985].method506(arg0.anInt986)) {
				@Pc(29) int local29 = arg0.anInt1000 - arg0.anInt999;
				@Pc(34) int local34 = anInt239 - arg0.anInt999;
				@Pc(44) int local44 = arg0.anInt995 * 128 + arg0.anInt965 * 64;
				@Pc(54) int local54 = arg0.anInt997 * 128 + arg0.anInt965 * 64;
				@Pc(64) int local64 = arg0.anInt996 * 128 + arg0.anInt965 * 64;
				@Pc(74) int local74 = arg0.anInt998 * 128 + arg0.anInt965 * 64;
				arg0.anInt962 = (local44 * (local29 - local34) + local64 * local34) / local29;
				arg0.anInt963 = (local54 * (local29 - local34) + local74 * local34) / local29;
			}
			arg0.anInt1007 = 0;
			if (arg0.anInt1001 == 0) {
				arg0.anInt1004 = 1024;
			}
			if (arg0.anInt1001 == 1) {
				arg0.anInt1004 = 1536;
			}
			if (arg0.anInt1001 == 2) {
				arg0.anInt1004 = 0;
			}
			if (arg0.anInt1001 == 3) {
				arg0.anInt1004 = 512;
			}
			arg0.anInt964 = arg0.anInt1004;
		} catch (@Pc(140) RuntimeException local140) {
			signlink.reporterror("32238, " + arg0 + ", " + 39 + ", " + local140.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Lclient!y;I)V")
	private void method201(@OriginalArg(0) Class1_Sub1_Sub1_Sub1 arg0, @OriginalArg(1) int arg1) {
		try {
			arg0.anInt982 = arg0.anInt966;
			if (arg0.anInt1006 == 0) {
				arg0.anInt1007 = 0;
			} else {
				if (arg0.anInt985 != -1 && arg0.anInt988 == 0) {
					@Pc(24) Class27 local24 = Class27.aClass27Array1[arg0.anInt985];
					if (arg0.anInt1008 > 0 && local24.anInt777 == 0) {
						arg0.anInt1007++;
						return;
					}
					if (arg0.anInt1008 <= 0 && local24.anInt778 == 0) {
						arg0.anInt1007++;
						return;
					}
				}
				@Pc(53) int local53 = arg0.anInt962;
				@Pc(56) int local56 = arg0.anInt963;
				@Pc(71) int local71 = arg0.anIntArray272[arg0.anInt1006 - 1] * 128 + arg0.anInt965 * 64;
				@Pc(86) int local86 = arg0.anIntArray273[arg0.anInt1006 - 1] * 128 + arg0.anInt965 * 64;
				if (local71 - local53 <= 256 && local71 - local53 >= -256 && local86 - local56 <= 256 && local86 - local56 >= -256) {
					if (local53 < local71) {
						if (local56 < local86) {
							arg0.anInt1004 = 1280;
						} else if (local56 > local86) {
							arg0.anInt1004 = 1792;
						} else {
							arg0.anInt1004 = 1536;
						}
					} else if (local53 > local71) {
						if (local56 < local86) {
							arg0.anInt1004 = 768;
						} else if (local56 > local86) {
							arg0.anInt1004 = 256;
						} else {
							arg0.anInt1004 = 512;
						}
					} else if (local56 < local86) {
						arg0.anInt1004 = 1024;
					} else {
						arg0.anInt1004 = 0;
					}
					@Pc(180) int local180 = arg0.anInt1004 - arg0.anInt964 & 0x7FF;
					if (local180 > 1024) {
						local180 -= 2048;
					}
					@Pc(187) int local187 = arg0.anInt969;
					if (local180 >= -256 && local180 <= 256) {
						local187 = arg0.anInt968;
					} else if (local180 >= 256 && local180 < 768) {
						local187 = arg0.anInt971;
					} else if (local180 >= -768 && local180 <= -256) {
						local187 = arg0.anInt970;
					}
					if (local187 == -1) {
						local187 = arg0.anInt968;
					}
					arg0.anInt982 = local187;
					@Pc(229) int local229 = 4;
					@Pc(233) boolean local233 = false;
					if (arg0.anInt964 != arg0.anInt1004 && arg0.anInt979 == -1 && arg0.anInt1005 != 0) {
						local229 = 2;
					}
					if (arg0.anInt1006 > 2) {
						local229 = 6;
					}
					if (arg0.anInt1006 > 3) {
						local229 = 8;
					}
					if (arg0.anInt1007 > 0 && arg0.anInt1006 > 1) {
						local229 = 8;
						arg0.anInt1007--;
					}
					if (arg0.aBooleanArray12[arg0.anInt1006 - 1]) {
						local229 <<= 0x1;
					}
					if (local229 >= 8 && arg0.anInt982 == arg0.anInt968 && arg0.anInt972 != -1) {
						arg0.anInt982 = arg0.anInt972;
					}
					if (local53 < local71) {
						arg0.anInt962 += local229;
						if (arg0.anInt962 > local71) {
							arg0.anInt962 = local71;
						}
					} else if (local53 > local71) {
						arg0.anInt962 -= local229;
						if (arg0.anInt962 < local71) {
							arg0.anInt962 = local71;
						}
					}
					if (local56 < local86) {
						arg0.anInt963 += local229;
						if (arg0.anInt963 > local86) {
							arg0.anInt963 = local86;
						}
					} else if (local56 > local86) {
						arg0.anInt963 -= local229;
						if (arg0.anInt963 < local86) {
							arg0.anInt963 = local86;
						}
					}
					if (arg0.anInt962 == local71 && arg0.anInt963 == local86) {
						arg0.anInt1006--;
						if (arg0.anInt1008 > 0) {
							arg0.anInt1008--;
							return;
						}
					}
				} else {
					arg0.anInt962 = local71;
					arg0.anInt963 = local86;
				}
			}
		} catch (@Pc(395) RuntimeException local395) {
			signlink.reporterror("20899, " + arg0 + ", " + arg1 + ", " + local395.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!y;Z)V")
	private void method202(@OriginalArg(0) Class1_Sub1_Sub1_Sub1 arg0, @OriginalArg(1) boolean arg1) {
		try {
			if (arg1) {
				this.anInt288 = -223;
			}
			if (arg0.anInt1005 != 0) {
				@Pc(32) int local32;
				@Pc(38) int local38;
				if (arg0.anInt979 != -1 && arg0.anInt979 < 32768) {
					@Pc(24) Class1_Sub1_Sub1_Sub1_Sub2 local24 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[arg0.anInt979];
					if (local24 != null) {
						local32 = arg0.anInt962 - local24.anInt962;
						local38 = arg0.anInt963 - local24.anInt963;
						if (local32 != 0 || local38 != 0) {
							arg0.anInt1004 = (int) (Math.atan2((double) local32, (double) local38) * 325.949D) & 0x7FF;
						}
					}
				}
				@Pc(63) int local63;
				if (arg0.anInt979 >= 32768) {
					local63 = arg0.anInt979 - 32768;
					if (local63 == this.anInt208) {
						local63 = this.anInt241;
					}
					@Pc(75) Class1_Sub1_Sub1_Sub1_Sub1 local75 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local63];
					if (local75 != null) {
						local38 = arg0.anInt962 - local75.anInt962;
						@Pc(89) int local89 = arg0.anInt963 - local75.anInt963;
						if (local38 != 0 || local89 != 0) {
							arg0.anInt1004 = (int) (Math.atan2((double) local38, (double) local89) * 325.949D) & 0x7FF;
						}
					}
				}
				if ((arg0.anInt980 != 0 || arg0.anInt981 != 0) && (arg0.anInt1006 == 0 || arg0.anInt1007 > 0)) {
					local63 = arg0.anInt962 - (arg0.anInt980 - this.anInt354 - this.anInt354) * 64;
					local32 = arg0.anInt963 - (arg0.anInt981 - this.anInt355 - this.anInt355) * 64;
					if (local63 != 0 || local32 != 0) {
						arg0.anInt1004 = (int) (Math.atan2((double) local63, (double) local32) * 325.949D) & 0x7FF;
					}
					arg0.anInt980 = 0;
					arg0.anInt981 = 0;
				}
				local63 = arg0.anInt1004 - arg0.anInt964 & 0x7FF;
				if (local63 != 0) {
					if (local63 < arg0.anInt1005 || local63 > 2048 - arg0.anInt1005) {
						arg0.anInt964 = arg0.anInt1004;
					} else if (local63 > 1024) {
						arg0.anInt964 -= arg0.anInt1005;
					} else {
						arg0.anInt964 += arg0.anInt1005;
					}
					arg0.anInt964 &= 0x7FF;
					if (arg0.anInt982 == arg0.anInt966 && arg0.anInt964 != arg0.anInt1004) {
						if (arg0.anInt967 != -1) {
							arg0.anInt982 = arg0.anInt967;
							return;
						}
						arg0.anInt982 = arg0.anInt968;
						return;
					}
				}
			}
		} catch (@Pc(243) RuntimeException local243) {
			signlink.reporterror("62460, " + arg0 + ", " + arg1 + ", " + local243.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Lclient!y;Z)V")
	private void method203(@OriginalArg(0) Class1_Sub1_Sub1_Sub1 arg0) {
		try {
			this.aBoolean89 &= true;
			arg0.aBoolean266 = false;
			@Pc(19) Class27 local19;
			if (arg0.anInt982 != -1) {
				local19 = Class27.aClass27Array1[arg0.anInt982];
				arg0.anInt984++;
				if (arg0.anInt983 < local19.anInt771 && arg0.anInt984 > local19.method506(arg0.anInt983)) {
					arg0.anInt984 = 0;
					arg0.anInt983++;
				}
				if (arg0.anInt983 >= local19.anInt771) {
					arg0.anInt984 = 0;
					arg0.anInt983 = 0;
				}
			}
			if (arg0.anInt990 != -1 && anInt239 >= arg0.anInt993) {
				if (arg0.anInt991 < 0) {
					arg0.anInt991 = 0;
				}
				local19 = Class33.aClass33Array1[arg0.anInt990].aClass27_2;
				arg0.anInt992++;
				while (arg0.anInt991 < local19.anInt771 && arg0.anInt992 > local19.method506(arg0.anInt991)) {
					arg0.anInt992 -= local19.method506(arg0.anInt991);
					arg0.anInt991++;
				}
				if (arg0.anInt991 >= local19.anInt771 && (arg0.anInt991 < 0 || arg0.anInt991 >= local19.anInt771)) {
					arg0.anInt990 = -1;
				}
			}
			if (arg0.anInt985 != -1 && arg0.anInt988 <= 1) {
				local19 = Class27.aClass27Array1[arg0.anInt985];
				if (local19.anInt777 == 1 && arg0.anInt1008 > 0 && arg0.anInt999 <= anInt239 && arg0.anInt1000 < anInt239) {
					arg0.anInt988 = 1;
					return;
				}
			}
			if (arg0.anInt985 != -1 && arg0.anInt988 == 0) {
				local19 = Class27.aClass27Array1[arg0.anInt985];
				arg0.anInt987++;
				while (arg0.anInt986 < local19.anInt771 && arg0.anInt987 > local19.method506(arg0.anInt986)) {
					arg0.anInt987 -= local19.method506(arg0.anInt986);
					arg0.anInt986++;
				}
				if (arg0.anInt986 >= local19.anInt771) {
					arg0.anInt986 -= local19.anInt772;
					arg0.anInt989++;
					if (arg0.anInt989 >= local19.anInt776) {
						arg0.anInt985 = -1;
					}
					if (arg0.anInt986 < 0 || arg0.anInt986 >= local19.anInt771) {
						arg0.anInt985 = -1;
					}
				}
				arg0.aBoolean266 = local19.aBoolean218;
			}
			if (arg0.anInt988 > 0) {
				arg0.anInt988--;
			}
		} catch (@Pc(264) RuntimeException local264) {
			signlink.reporterror("70695, " + arg0 + ", " + true + ", " + local264.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "C", descriptor = "(I)V")
	private void method204() {
		try {
			if (this.aBoolean65) {
				this.aBoolean65 = false;
				this.aClass35_7.method525(0, super.aGraphics2, 4);
				this.aClass35_8.method525(0, super.aGraphics2, 357);
				this.aClass35_9.method525(722, super.aGraphics2, 4);
				this.aClass35_10.method525(743, super.aGraphics2, 205);
				this.aClass35_11.method525(0, super.aGraphics2, 0);
				this.aClass35_12.method525(516, super.aGraphics2, 4);
				this.aClass35_13.method525(516, super.aGraphics2, 205);
				this.aClass35_14.method525(496, super.aGraphics2, 357);
				this.aClass35_15.method525(0, super.aGraphics2, 338);
				this.aBoolean73 = true;
				this.aBoolean88 = true;
				this.aBoolean80 = true;
				this.aBoolean53 = true;
				if (this.anInt273 != 2) {
					this.aClass35_5.method525(4, super.aGraphics2, 4);
					this.aClass35_4.method525(550, super.aGraphics2, 4);
				}
			}
			if (this.anInt273 == 2) {
				this.method216();
			}
			if (this.aBoolean87 && this.anInt252 == 1) {
				this.aBoolean73 = true;
			}
			@Pc(145) boolean local145;
			if (this.anInt245 != -1) {
				local145 = this.method220(this.anInt338, this.anInt245);
				if (local145) {
					this.aBoolean73 = true;
				}
			}
			if (this.anInt332 == 2) {
				this.aBoolean73 = true;
			}
			if (this.anInt233 == 2) {
				this.aBoolean73 = true;
			}
			if (this.aBoolean73) {
				this.method229(586);
				this.aBoolean73 = false;
			}
			if (this.anInt197 == -1) {
				this.aClass6_1.anInt415 = this.anInt369 - this.anInt295 - 77;
				if (super.anInt182 > 448 && super.anInt182 < 560 && super.anInt183 > 332) {
					this.method208(0, this.aClass6_1, this.anInt369, 77, false, super.anInt183 - 357, super.anInt182 - 17, 463);
				}
				@Pc(227) int local227 = this.anInt369 - this.aClass6_1.anInt415 - 77;
				if (local227 < 0) {
					local227 = 0;
				}
				if (local227 > this.anInt369 - 77) {
					local227 = this.anInt369 - 77;
				}
				if (this.anInt295 != local227) {
					this.anInt295 = local227;
					this.aBoolean88 = true;
				}
			}
			if (this.anInt197 != -1) {
				local145 = this.method220(this.anInt338, this.anInt197);
				if (local145) {
					this.aBoolean88 = true;
				}
			}
			if (this.anInt332 == 3) {
				this.aBoolean88 = true;
			}
			if (this.anInt233 == 3) {
				this.aBoolean88 = true;
			}
			if (this.aString5 != null) {
				this.aBoolean88 = true;
			}
			if (this.aBoolean87 && this.anInt252 == 2) {
				this.aBoolean88 = true;
			}
			if (this.aBoolean88) {
				this.method124();
				this.aBoolean88 = false;
			}
			if (this.anInt273 == 2) {
				this.method130();
				this.aClass35_4.method525(550, super.aGraphics2, 4);
			}
			if (this.anInt244 != -1) {
				this.aBoolean80 = true;
			}
			if (this.aBoolean80) {
				if (this.anInt244 != -1 && this.anInt244 == this.anInt270) {
					this.anInt244 = -1;
					this.aClass1_Sub1_Sub3_3.method469(36);
					this.aClass1_Sub1_Sub3_3.method470(this.anInt270);
				}
				this.aBoolean80 = false;
				this.aClass35_18.method524(this.anInt198);
				this.aClass1_Sub1_Sub2_Sub3_6.method418(0, 0);
				if (this.anInt245 == -1) {
					if (this.anIntArray81[this.anInt270] != -1) {
						if (this.anInt270 == 0) {
							this.aClass1_Sub1_Sub2_Sub3_16.method418(22, 10);
						}
						if (this.anInt270 == 1) {
							this.aClass1_Sub1_Sub2_Sub3_17.method418(54, 8);
						}
						if (this.anInt270 == 2) {
							this.aClass1_Sub1_Sub2_Sub3_17.method418(82, 8);
						}
						if (this.anInt270 == 3) {
							this.aClass1_Sub1_Sub2_Sub3_18.method418(110, 8);
						}
						if (this.anInt270 == 4) {
							this.aClass1_Sub1_Sub2_Sub3_20.method418(153, 8);
						}
						if (this.anInt270 == 5) {
							this.aClass1_Sub1_Sub2_Sub3_20.method418(181, 8);
						}
						if (this.anInt270 == 6) {
							this.aClass1_Sub1_Sub2_Sub3_19.method418(209, 9);
						}
					}
					if (this.anIntArray81[0] != -1 && (this.anInt244 != 0 || anInt239 % 20 < 10)) {
						this.aClass1_Sub1_Sub2_Sub3Array1[0].method418(29, 13);
					}
					if (this.anIntArray81[1] != -1 && (this.anInt244 != 1 || anInt239 % 20 < 10)) {
						this.aClass1_Sub1_Sub2_Sub3Array1[1].method418(53, 11);
					}
					if (this.anIntArray81[2] != -1 && (this.anInt244 != 2 || anInt239 % 20 < 10)) {
						this.aClass1_Sub1_Sub2_Sub3Array1[2].method418(82, 11);
					}
					if (this.anIntArray81[3] != -1 && (this.anInt244 != 3 || anInt239 % 20 < 10)) {
						this.aClass1_Sub1_Sub2_Sub3Array1[3].method418(115, 12);
					}
					if (this.anIntArray81[4] != -1 && (this.anInt244 != 4 || anInt239 % 20 < 10)) {
						this.aClass1_Sub1_Sub2_Sub3Array1[4].method418(153, 13);
					}
					if (this.anIntArray81[5] != -1 && (this.anInt244 != 5 || anInt239 % 20 < 10)) {
						this.aClass1_Sub1_Sub2_Sub3Array1[5].method418(180, 11);
					}
					if (this.anIntArray81[6] != -1 && (this.anInt244 != 6 || anInt239 % 20 < 10)) {
						this.aClass1_Sub1_Sub2_Sub3Array1[6].method418(208, 13);
					}
				}
				this.aClass35_18.method525(516, super.aGraphics2, 160);
				this.aClass35_17.method524(this.anInt198);
				this.aClass1_Sub1_Sub2_Sub3_5.method418(0, 0);
				if (this.anInt245 == -1) {
					if (this.anIntArray81[this.anInt270] != -1) {
						if (this.anInt270 == 7) {
							this.aClass1_Sub1_Sub2_Sub3_9.method418(42, 0);
						}
						if (this.anInt270 == 8) {
							this.aClass1_Sub1_Sub2_Sub3_10.method418(74, 0);
						}
						if (this.anInt270 == 9) {
							this.aClass1_Sub1_Sub2_Sub3_10.method418(102, 0);
						}
						if (this.anInt270 == 10) {
							this.aClass1_Sub1_Sub2_Sub3_11.method418(130, 1);
						}
						if (this.anInt270 == 11) {
							this.aClass1_Sub1_Sub2_Sub3_13.method418(173, 0);
						}
						if (this.anInt270 == 12) {
							this.aClass1_Sub1_Sub2_Sub3_13.method418(201, 0);
						}
						if (this.anInt270 == 13) {
							this.aClass1_Sub1_Sub2_Sub3_12.method418(229, 0);
						}
					}
					if (this.anIntArray81[8] != -1 && (this.anInt244 != 8 || anInt239 % 20 < 10)) {
						this.aClass1_Sub1_Sub2_Sub3Array1[7].method418(74, 2);
					}
					if (this.anIntArray81[9] != -1 && (this.anInt244 != 9 || anInt239 % 20 < 10)) {
						this.aClass1_Sub1_Sub2_Sub3Array1[8].method418(102, 3);
					}
					if (this.anIntArray81[10] != -1 && (this.anInt244 != 10 || anInt239 % 20 < 10)) {
						this.aClass1_Sub1_Sub2_Sub3Array1[9].method418(137, 4);
					}
					if (this.anIntArray81[11] != -1 && (this.anInt244 != 11 || anInt239 % 20 < 10)) {
						this.aClass1_Sub1_Sub2_Sub3Array1[10].method418(174, 2);
					}
					if (this.anIntArray81[12] != -1 && (this.anInt244 != 12 || anInt239 % 20 < 10)) {
						this.aClass1_Sub1_Sub2_Sub3Array1[11].method418(201, 2);
					}
					if (this.anIntArray81[13] != -1 && (this.anInt244 != 13 || anInt239 % 20 < 10)) {
						this.aClass1_Sub1_Sub2_Sub3Array1[12].method418(226, 2);
					}
				}
				this.aClass35_17.method525(496, super.aGraphics2, 466);
				this.aClass35_5.method524(this.anInt198);
			}
			if (this.aBoolean53) {
				this.aBoolean53 = false;
				this.aClass35_16.method524(this.anInt198);
				this.aClass1_Sub1_Sub2_Sub3_4.method418(0, 0);
				this.aClass1_Sub1_Sub2_Sub4_2.method448(true, 16777215, "Public chat", 55, 28);
				if (this.anInt230 == 0) {
					this.aClass1_Sub1_Sub2_Sub4_2.method448(true, 65280, "On", 55, 41);
				}
				if (this.anInt230 == 1) {
					this.aClass1_Sub1_Sub2_Sub4_2.method448(true, 16776960, "Friends", 55, 41);
				}
				if (this.anInt230 == 2) {
					this.aClass1_Sub1_Sub2_Sub4_2.method448(true, 16711680, "Off", 55, 41);
				}
				if (this.anInt230 == 3) {
					this.aClass1_Sub1_Sub2_Sub4_2.method448(true, 65535, "Hide", 55, 41);
				}
				this.aClass1_Sub1_Sub2_Sub4_2.method448(true, 16777215, "Private chat", 184, 28);
				if (this.anInt264 == 0) {
					this.aClass1_Sub1_Sub2_Sub4_2.method448(true, 65280, "On", 184, 41);
				}
				if (this.anInt264 == 1) {
					this.aClass1_Sub1_Sub2_Sub4_2.method448(true, 16776960, "Friends", 184, 41);
				}
				if (this.anInt264 == 2) {
					this.aClass1_Sub1_Sub2_Sub4_2.method448(true, 16711680, "Off", 184, 41);
				}
				this.aClass1_Sub1_Sub2_Sub4_2.method448(true, 16777215, "Trade/compete", 324, 28);
				if (this.anInt193 == 0) {
					this.aClass1_Sub1_Sub2_Sub4_2.method448(true, 65280, "On", 324, 41);
				}
				if (this.anInt193 == 1) {
					this.aClass1_Sub1_Sub2_Sub4_2.method448(true, 16776960, "Friends", 324, 41);
				}
				if (this.anInt193 == 2) {
					this.aClass1_Sub1_Sub2_Sub4_2.method448(true, 16711680, "Off", 324, 41);
				}
				this.aClass1_Sub1_Sub2_Sub4_2.method448(true, 16777215, "Report abuse", 458, 33);
				this.aClass35_16.method525(0, super.aGraphics2, 453);
				this.aClass35_5.method524(this.anInt198);
			}
			this.anInt338 = 0;
		} catch (@Pc(1058) RuntimeException local1058) {
			signlink.reporterror("93644, " + -24615 + ", " + local1058.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(IZ)V")
	private void method205(@OriginalArg(0) int arg0) {
		try {
			@Pc(3) Class6 local3 = Class6.aClass6Array1[arg0];
			for (@Pc(5) int local5 = 0; local5 < local3.anIntArray98.length && local3.anIntArray98[local5] != -1; local5++) {
				@Pc(20) Class6 local20 = Class6.aClass6Array1[local3.anIntArray98[local5]];
				if (local20.anInt406 == 1) {
					this.method205(local20.anInt404);
				}
				local20.anInt402 = 0;
				local20.anInt403 = 0;
			}
		} catch (@Pc(47) RuntimeException local47) {
			signlink.reporterror("69655, " + arg0 + ", " + false + ", " + local47.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "n", descriptor = "(B)V")
	private void method206() {
		try {
			@Pc(4) Graphics local4 = this.method94().getGraphics();
			local4.setColor(Color.black);
			if (this.aByte8 != 4) {
				this.anInt223 = -1;
			}
			local4.fillRect(0, 0, 765, 503);
			this.method87();
			@Pc(43) byte local43;
			@Pc(49) int local49;
			if (this.aBoolean67) {
				this.aBoolean81 = false;
				local4.setFont(new Font("Helvetica", 1, 16));
				local4.setColor(Color.yellow);
				local43 = 35;
				local4.drawString("Sorry, an error has occured whilst loading RuneScape", 30, 35);
				local49 = local43 + 50;
				local4.setColor(Color.white);
				local4.drawString("To fix this try the following (in order):", 30, 85);
				@Pc(58) int local58 = local49 + 50;
				local4.setColor(Color.white);
				local4.setFont(new Font("Helvetica", 1, 12));
				local4.drawString("1: Try closing ALL open web-browser windows, and reloading", 30, 135);
				@Pc(75) int local75 = local58 + 30;
				local4.drawString("2: Try clearing your web-browsers cache from tools->internet options", 30, 165);
				@Pc(81) int local81 = local75 + 30;
				local4.drawString("3: Try using a different game-world", 30, 195);
				@Pc(87) int local87 = local81 + 30;
				local4.drawString("4: Try rebooting your computer", 30, 225);
				@Pc(93) int local93 = local87 + 30;
				local4.drawString("5: Try selecting a different version of Java from the play-game menu", 30, 255);
			}
			if (this.aBoolean54) {
				this.aBoolean81 = false;
				local4.setFont(new Font("Helvetica", 1, 20));
				local4.setColor(Color.white);
				local4.drawString("Error - unable to load game!", 50, 50);
				local4.drawString("To play RuneScape make sure you play from", 50, 100);
				local4.drawString("http://www.runescape.com", 50, 150);
			}
			if (this.aBoolean62) {
				this.aBoolean81 = false;
				local4.setColor(Color.yellow);
				local43 = 35;
				local4.drawString("Error a copy of RuneScape already appears to be loaded", 30, 35);
				local49 = local43 + 50;
				local4.setColor(Color.white);
				local4.drawString("To fix this try the following (in order):", 30, 85);
				local49 += 50;
				local4.setColor(Color.white);
				local4.setFont(new Font("Helvetica", 1, 12));
				local4.drawString("1: Try closing ALL open web-browser windows, and reloading", 30, 135);
				local49 += 30;
				local4.drawString("2: Try rebooting your computer, and reloading", 30, 165);
				local49 += 30;
			}
		} catch (@Pc(181) RuntimeException local181) {
			signlink.reporterror("33085, " + 4 + ", " + local181.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "g", descriptor = "(II)V")
	private void method207(@OriginalArg(0) int arg0) {
		try {
			this.anInt222 += 0;
			if (!aBoolean72) {
				@Pc(18) Class1_Sub1_Sub2_Sub3 local18;
				@Pc(26) int local26;
				@Pc(34) int local34;
				@Pc(37) byte[] local37;
				@Pc(40) byte[] local40;
				@Pc(42) int local42;
				if (Class1_Sub1_Sub2_Sub1.anIntArray182[17] >= arg0) {
					local18 = Class1_Sub1_Sub2_Sub1.aClass1_Sub1_Sub2_Sub3Array5[17];
					local26 = local18.anInt653 * local18.anInt654 - 1;
					local34 = local18.anInt653 * this.anInt338 * 2;
					local37 = local18.aByteArray7;
					local40 = this.aByteArray2;
					for (local42 = 0; local42 <= local26; local42++) {
						local40[local42] = local37[local42 - local34 & local26];
					}
					local18.aByteArray7 = local40;
					this.aByteArray2 = local37;
					Class1_Sub1_Sub2_Sub1.method349(17);
				}
				if (Class1_Sub1_Sub2_Sub1.anIntArray182[24] >= arg0) {
					local18 = Class1_Sub1_Sub2_Sub1.aClass1_Sub1_Sub2_Sub3Array5[24];
					local26 = local18.anInt653 * local18.anInt654 - 1;
					local34 = local18.anInt653 * this.anInt338 * 2;
					local37 = local18.aByteArray7;
					local40 = this.aByteArray2;
					for (local42 = 0; local42 <= local26; local42++) {
						local40[local42] = local37[local42 - local34 & local26];
					}
					local18.aByteArray7 = local40;
					this.aByteArray2 = local37;
					Class1_Sub1_Sub2_Sub1.method349(24);
				}
				if (Class1_Sub1_Sub2_Sub1.anIntArray182[34] >= arg0) {
					local18 = Class1_Sub1_Sub2_Sub1.aClass1_Sub1_Sub2_Sub3Array5[34];
					local26 = local18.anInt653 * local18.anInt654 - 1;
					local34 = local18.anInt653 * this.anInt338 * 2;
					local37 = local18.aByteArray7;
					local40 = this.aByteArray2;
					for (local42 = 0; local42 <= local26; local42++) {
						local40[local42] = local37[local42 - local34 & local26];
					}
					local18.aByteArray7 = local40;
					this.aByteArray2 = local37;
					Class1_Sub1_Sub2_Sub1.method349(34);
					return;
				}
			}
		} catch (@Pc(185) RuntimeException local185) {
			signlink.reporterror("25759, " + arg0 + ", " + 0 + ", " + local185.toString());
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
				return new URL("http://127.0.0.1:" + (anInt292 + 80));
			}
		} catch (@Pc(21) Exception local21) {
		}
		return super.getCodeBase();
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IILclient!d;IIZIII)V")
	private void method208(@OriginalArg(1) int arg0, @OriginalArg(2) Class6 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		try {
			if (this.aBoolean59) {
				this.anInt382 = 32;
			} else {
				this.anInt382 = 0;
			}
			this.aBoolean59 = false;
			if (arg6 >= arg7 && arg6 < arg7 + 16 && arg5 >= arg0 && arg5 < arg0 + 16) {
				arg1.anInt415 -= this.anInt260 * 4;
				if (arg4) {
					this.aBoolean73 = true;
					return;
				}
			} else if (arg6 >= arg7 && arg6 < arg7 + 16 && arg5 >= arg0 + arg3 - 16 && arg5 < arg0 + arg3) {
				arg1.anInt415 += this.anInt260 * 4;
				if (arg4) {
					this.aBoolean73 = true;
					return;
				}
			} else if (arg6 >= arg7 - this.anInt382 && arg6 < arg7 + this.anInt382 + 16 && arg5 >= arg0 + 16 && arg5 < arg0 + arg3 - 16 && this.anInt260 > 0) {
				@Pc(127) int local127 = (arg3 - 32) * arg3 / arg2;
				if (local127 < 8) {
					local127 = 8;
				}
				@Pc(142) int local142 = arg5 - arg0 - local127 / 2 - 16;
				@Pc(148) int local148 = arg3 - local127 - 32;
				arg1.anInt415 = (arg2 - arg3) * local142 / local148;
				if (arg4) {
					this.aBoolean73 = true;
				}
				this.aBoolean59 = true;
			} else {
				return;
			}
		} catch (@Pc(167) RuntimeException local167) {
			signlink.reporterror("3062, " + -528 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + local167.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "D", descriptor = "(I)V")
	private void method209() {
		try {
			if (this.anInt273 == 2) {
				for (@Pc(20) Class1_Sub2 local20 = (Class1_Sub2) this.aClass29_1.method511(); local20 != null; local20 = (Class1_Sub2) this.aClass29_1.method513()) {
					if (local20.anInt769 > 0) {
						local20.anInt769--;
					}
					if (local20.anInt769 != 0) {
						if (local20.anInt768 > 0) {
							local20.anInt768--;
						}
						if (local20.anInt768 == 0 && local20.anInt760 >= 1 && local20.anInt761 >= 1 && local20.anInt760 <= 102 && local20.anInt761 <= 102 && (local20.anInt765 < 0 || Class4.method72(local20.anInt765, local20.anInt767))) {
							this.method175(local20.anInt766, local20.anInt760, local20.anInt758, local20.anInt761, local20.anInt767, local20.anInt765, local20.anInt759);
							local20.anInt768 = -1;
							if (local20.anInt765 == local20.anInt762 && local20.anInt762 == -1) {
								local20.method673();
							} else if (local20.anInt765 == local20.anInt762 && local20.anInt766 == local20.anInt763 && local20.anInt767 == local20.anInt764) {
								local20.method673();
							}
						}
					} else if (local20.anInt762 < 0 || Class4.method72(local20.anInt762, local20.anInt764)) {
						this.method175(local20.anInt763, local20.anInt760, local20.anInt758, local20.anInt761, local20.anInt764, local20.anInt762, local20.anInt759);
						local20.method673();
					}
				}
			}
		} catch (@Pc(163) RuntimeException local163) {
			signlink.reporterror("31899, " + -6949 + ", " + local163.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(ZJ)V")
	private void method210(@OriginalArg(1) long arg0) {
		try {
			if (arg0 != 0L) {
				for (@Pc(8) int local8 = 0; local8 < this.anInt290; local8++) {
					if (this.aLongArray4[local8] == arg0) {
						this.anInt290--;
						this.aBoolean73 = true;
						for (@Pc(28) int local28 = local8; local28 < this.anInt290; local28++) {
							this.aLongArray4[local28] = this.aLongArray4[local28 + 1];
						}
						this.aClass1_Sub1_Sub3_3.method469(104);
						this.aClass1_Sub1_Sub3_3.method476(arg0, (byte) 3);
						break;
					}
				}
				this.aBoolean89 &= true;
			}
		} catch (@Pc(70) RuntimeException local70) {
			signlink.reporterror("37994, " + true + ", " + arg0 + ", " + local70.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(ZJ)V")
	private void method211(@OriginalArg(1) long arg0) {
		try {
			if (arg0 != 0L) {
				if (this.anInt290 >= 100) {
					this.method221("Your ignore list is full. Max of 100 hit", 0, "");
				} else {
					@Pc(23) String local23 = Class48.method671(Class48.method668(arg0));
					for (@Pc(30) int local30 = 0; local30 < this.anInt290; local30++) {
						if (this.aLongArray4[local30] == arg0) {
							this.method221(local23 + " is already on your ignore list", 0, "");
							return;
						}
					}
					for (@Pc(60) int local60 = 0; local60 < this.anInt350; local60++) {
						if (this.aLongArray3[local60] == arg0) {
							this.method221("Please remove " + local23 + " from your friend list first", 0, "");
							return;
						}
					}
					this.aLongArray4[this.anInt290++] = arg0;
					this.aBoolean73 = true;
					this.aClass1_Sub1_Sub3_3.method469(158);
					this.aClass1_Sub1_Sub3_3.method476(arg0, (byte) 3);
				}
			}
		} catch (@Pc(115) RuntimeException local115) {
			signlink.reporterror("3321, " + true + ", " + arg0 + ", " + local115.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(IILclient!lb;)V")
	private void method212(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub1_Sub3 arg1) {
		try {
			while (true) {
				if (arg1.anInt721 + 10 < arg0 * 8) {
					@Pc(21) int local21 = arg1.method491(11);
					if (local21 != 2047) {
						if (this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local21] == null) {
							this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local21] = new Class1_Sub1_Sub1_Sub1_Sub1();
							if (this.aClass1_Sub1_Sub3Array1[local21] != null) {
								this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local21].method39(this.aClass1_Sub1_Sub3Array1[local21]);
							}
						}
						this.anIntArray46[this.anInt242++] = local21;
						@Pc(67) Class1_Sub1_Sub1_Sub1_Sub1 local67 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local21];
						local67.anInt1002 = anInt239;
						@Pc(75) int local75 = arg1.method491(5);
						if (local75 > 15) {
							local75 -= 32;
						}
						@Pc(84) int local84 = arg1.method491(5);
						if (local84 > 15) {
							local84 -= 32;
						}
						@Pc(93) int local93 = arg1.method491(1);
						local67.method677(aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray272[0] + local75, local93 == 1, aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray273[0] + local84);
						@Pc(119) int local119 = arg1.method491(1);
						if (local119 == 1) {
							this.anIntArray47[this.anInt243++] = local21;
						}
						continue;
					}
				}
				arg1.method492();
				return;
			}
		} catch (@Pc(140) RuntimeException local140) {
			signlink.reporterror("68185, " + -576 + ", " + arg0 + ", " + arg1 + ", " + local140.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "o", descriptor = "(B)V")
	private void method213(@OriginalArg(0) byte arg0) {
		try {
			System.out.println("============");
			System.out.println("flame-cycle:" + this.anInt383);
			if (this.aClass44_Sub1_1 != null) {
				System.out.println("Od-cycle:" + this.aClass44_Sub1_1.anInt937);
			}
			System.out.println("loop-cycle:" + anInt239);
			System.out.println("draw-cycle:" + anInt358);
			System.out.println("ptype:" + this.anInt223);
			System.out.println("psize:" + this.anInt222);
			@Pc(69) boolean local69 = false;
			if (this.aClass8_1 != null) {
				this.aClass8_1.method252((byte) 4);
			}
			super.aBoolean49 = true;
		} catch (@Pc(86) RuntimeException local86) {
			signlink.reporterror("5260, " + arg0 + ", " + local86.toString());
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
		} catch (@Pc(21) RuntimeException local21) {
			signlink.reporterror("20285, " + -290 + ", " + local21.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(Lclient!lb;II)V")
	private void method214(@OriginalArg(0) Class1_Sub1_Sub3 arg0, @OriginalArg(2) int arg1) {
		try {
			@Pc(15) int local15;
			@Pc(24) int local24;
			@Pc(31) int local31;
			@Pc(34) int local34;
			@Pc(38) int local38;
			@Pc(42) int local42;
			@Pc(47) int local47;
			@Pc(52) int local52;
			if (arg1 == 136 || arg1 == 211) {
				local15 = arg0.method480();
				local24 = this.anInt303 + (local15 >> 4 & 0x7);
				local31 = this.anInt304 + (local15 & 0x7);
				local34 = arg0.method480();
				local38 = local34 >> 2;
				local42 = local34 & 0x3;
				local47 = this.anIntArray86[local38];
				if (arg1 == 211) {
					local52 = -1;
				} else {
					local52 = arg0.method482();
				}
				if (local24 >= 0 && local31 >= 0 && local24 < 104 && local31 < 104) {
					this.method227(local31, local52, -1, 0, local24, local38, local47, this.anInt229, local42);
				}
			} else {
				@Pc(142) int local142;
				@Pc(154) int local154;
				@Pc(168) int local168;
				@Pc(180) int local180;
				if (arg1 == 2) {
					local15 = arg0.method480();
					local24 = this.anInt303 + (local15 >> 4 & 0x7);
					local31 = this.anInt304 + (local15 & 0x7);
					local34 = arg0.method480();
					local38 = local34 >> 2;
					local42 = local34 & 0x3;
					local47 = this.anIntArray86[local38];
					local52 = arg0.method482();
					if (local24 >= 0 && local31 >= 0 && local24 < 103 && local31 < 103) {
						local142 = this.anIntArrayArrayArray5[this.anInt229][local24][local31];
						local154 = this.anIntArrayArrayArray5[this.anInt229][local24 + 1][local31];
						local168 = this.anIntArrayArrayArray5[this.anInt229][local24 + 1][local31 + 1];
						local180 = this.anIntArrayArrayArray5[this.anInt229][local24][local31 + 1];
						if (local47 == 0) {
							@Pc(191) Class34 local191 = this.aClass37_1.method552(this.anInt229, local31, local24);
							if (local191 != null) {
								@Pc(200) int local200 = local191.anInt816 >> 14 & 0x7FFF;
								if (local38 == 2) {
									local191.aClass1_Sub1_Sub1_7 = new Class1_Sub1_Sub1_Sub2(local52, false, 2, local42 + 4, local154, (byte) 86, local200, local168, local142, local180);
									local191.aClass1_Sub1_Sub1_8 = new Class1_Sub1_Sub1_Sub2(local52, false, 2, local42 + 1 & 0x3, local154, (byte) 86, local200, local168, local142, local180);
								} else {
									local191.aClass1_Sub1_Sub1_7 = new Class1_Sub1_Sub1_Sub2(local52, false, local38, local42, local154, (byte) 86, local200, local168, local142, local180);
								}
							}
						}
						if (local47 == 1) {
							@Pc(268) Class14 local268 = this.aClass37_1.method553(local24, this.anInt229, local31);
							if (local268 != null) {
								local268.aClass1_Sub1_Sub1_1 = new Class1_Sub1_Sub1_Sub2(local52, false, 4, 0, local154, (byte) 86, local268.anInt549 >> 14 & 0x7FFF, local168, local142, local180);
							}
						}
						if (local47 == 2) {
							@Pc(302) Class31 local302 = this.aClass37_1.method554(local31, this.anInt229, local24);
							if (local38 == 11) {
								local38 = 10;
							}
							if (local302 != null) {
								local302.aClass1_Sub1_Sub1_6 = new Class1_Sub1_Sub1_Sub2(local52, false, local38, local42, local154, (byte) 86, local302.anInt799 >> 14 & 0x7FFF, local168, local142, local180);
							}
						}
						if (local47 == 3) {
							@Pc(341) Class18 local341 = this.aClass37_1.method555(local31, local24, this.anInt229);
							if (local341 != null) {
								local341.aClass1_Sub1_Sub1_2 = new Class1_Sub1_Sub1_Sub2(local52, false, 22, local42, local154, (byte) 86, local341.anInt636 >> 14 & 0x7FFF, local168, local142, local180);
							}
						}
					}
				} else {
					@Pc(406) Class1_Sub1_Sub1_Sub3 local406;
					if (arg1 == 147) {
						local15 = arg0.method480();
						local24 = this.anInt303 + (local15 >> 4 & 0x7);
						local31 = this.anInt304 + (local15 & 0x7);
						local34 = arg0.method482();
						local38 = arg0.method482();
						if (local24 >= 0 && local31 >= 0 && local24 < 104 && local31 < 104) {
							local406 = new Class1_Sub1_Sub1_Sub3();
							local406.anInt168 = local34;
							local406.anInt169 = local38;
							if (this.aClass29ArrayArrayArray1[this.anInt229][local24][local31] == null) {
								this.aClass29ArrayArrayArray1[this.anInt229][local24][local31] = new Class29(-16188);
							}
							this.aClass29ArrayArrayArray1[this.anInt229][local24][local31].method508(local406);
							this.method144(local24, local31);
						}
					} else if (arg1 == 53) {
						local15 = arg0.method480();
						local24 = this.anInt303 + (local15 >> 4 & 0x7);
						local31 = this.anInt304 + (local15 & 0x7);
						local34 = arg0.method482();
						if (local24 >= 0 && local31 >= 0 && local24 < 104 && local31 < 104) {
							@Pc(496) Class29 local496 = this.aClass29ArrayArrayArray1[this.anInt229][local24][local31];
							if (local496 != null) {
								for (local406 = (Class1_Sub1_Sub1_Sub3) local496.method511(); local406 != null; local406 = (Class1_Sub1_Sub1_Sub3) local496.method513()) {
									if (local406.anInt168 == (local34 & 0x7FFF)) {
										local406.method673();
										break;
									}
								}
								if (local496.method511() == null) {
									this.aClass29ArrayArrayArray1[this.anInt229][local24][local31] = null;
								}
								this.method144(local24, local31);
							}
						}
					} else if (arg1 == 30) {
						local15 = arg0.method480();
						local24 = this.anInt303 + (local15 >> 4 & 0x7);
						local31 = this.anInt304 + (local15 & 0x7);
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
							@Pc(675) Class1_Sub1_Sub1_Sub4 local675 = new Class1_Sub1_Sub1_Sub4(local24, local42, this.method219(this.anInt229, local31, local24) - local52, local31, 0, local142, local47, local168 + anInt239, local599, local154 + anInt239, this.anInt229, local180);
							local675.method241(local154 + anInt239, this.method219(this.anInt229, local38, local34) - local142, local38, local34);
							this.aClass29_3.method508(local675);
						}
					} else if (arg1 == 193) {
						local15 = arg0.method480();
						local24 = this.anInt303 + (local15 >> 4 & 0x7);
						local31 = this.anInt304 + (local15 & 0x7);
						local34 = arg0.method482();
						local38 = arg0.method480();
						local42 = arg0.method482();
						if (local24 >= 0 && local31 >= 0 && local24 < 104 && local31 < 104) {
							local24 = local24 * 128 + 64;
							local31 = local31 * 128 + 64;
							@Pc(771) Class1_Sub1_Sub1_Sub6 local771 = new Class1_Sub1_Sub1_Sub6(local42, this.anInt229, local24, local34, -74, this.method219(this.anInt229, local31, local24) - local38, anInt239, local31);
							this.aClass29_2.method508(local771);
						}
					} else if (arg1 == 137) {
						local15 = arg0.method480();
						local24 = this.anInt303 + (local15 >> 4 & 0x7);
						local31 = this.anInt304 + (local15 & 0x7);
						local34 = arg0.method482();
						local38 = arg0.method482();
						local42 = arg0.method482();
						if (local24 >= 0 && local31 >= 0 && local24 < 104 && local31 < 104 && local42 != this.anInt208) {
							@Pc(825) Class1_Sub1_Sub1_Sub3 local825 = new Class1_Sub1_Sub1_Sub3();
							local825.anInt168 = local34;
							local825.anInt169 = local38;
							if (this.aClass29ArrayArrayArray1[this.anInt229][local24][local31] == null) {
								this.aClass29ArrayArrayArray1[this.anInt229][local24][local31] = new Class29(-16188);
							}
							this.aClass29ArrayArrayArray1[this.anInt229][local24][local31].method508(local825);
							this.method144(local24, local31);
						}
					} else {
						if (arg1 == 191) {
							local15 = arg0.method480();
							local24 = this.anInt303 + (local15 >> 4 & 0x7);
							local31 = this.anInt304 + (local15 & 0x7);
							local34 = arg0.method480();
							local38 = local34 >> 2;
							local42 = local34 & 0x3;
							local47 = this.anIntArray86[local38];
							local52 = arg0.method482();
							local142 = arg0.method482();
							local154 = arg0.method482();
							local168 = arg0.method482();
							@Pc(923) byte local923 = arg0.method481();
							@Pc(926) byte local926 = arg0.method481();
							@Pc(929) byte local929 = arg0.method481();
							@Pc(932) byte local932 = arg0.method481();
							@Pc(938) Class1_Sub1_Sub1_Sub1_Sub1 local938;
							if (local168 == this.anInt208) {
								local938 = aClass1_Sub1_Sub1_Sub1_Sub1_1;
							} else {
								local938 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local168];
							}
							if (local938 != null) {
								@Pc(950) Class9 local950 = Class9.method288(local52);
								@Pc(960) int local960 = this.anIntArrayArrayArray5[this.anInt229][local24][local31];
								@Pc(972) int local972 = this.anIntArrayArrayArray5[this.anInt229][local24 + 1][local31];
								@Pc(986) int local986 = this.anIntArrayArrayArray5[this.anInt229][local24 + 1][local31 + 1];
								@Pc(998) int local998 = this.anIntArrayArrayArray5[this.anInt229][local24][local31 + 1];
								@Pc(1008) Class1_Sub1_Sub1_Sub5 local1008 = local950.method294(local38, local42, local960, local972, local986, local998, -1);
								if (local1008 != null) {
									this.method227(local31, -1, local154 + 1, local142 + 1, local24, 0, local47, this.anInt229, 0);
									local938.anInt124 = local142 + anInt239;
									local938.anInt125 = local154 + anInt239;
									local938.aClass1_Sub1_Sub1_Sub5_1 = local1008;
									@Pc(1043) int local1043 = local950.anInt481;
									@Pc(1046) int local1046 = local950.anInt482;
									if (local42 == 1 || local42 == 3) {
										local1043 = local950.anInt482;
										local1046 = local950.anInt481;
									}
									local938.anInt126 = local24 * 128 + local1043 * 64;
									local938.anInt128 = local31 * 128 + local1046 * 64;
									local938.anInt127 = this.method219(this.anInt229, local938.anInt128, local938.anInt126);
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
									local938.anInt129 = local24 + local923;
									local938.anInt131 = local24 + local929;
									local938.anInt130 = local31 + local926;
									local938.anInt132 = local31 + local932;
								}
							}
						}
						if (arg1 == 253) {
							local15 = arg0.method480();
							local24 = this.anInt303 + (local15 >> 4 & 0x7);
							local31 = this.anInt304 + (local15 & 0x7);
							local34 = arg0.method482();
							local38 = arg0.method482();
							local42 = arg0.method482();
							if (local24 >= 0 && local31 >= 0 && local24 < 104 && local31 < 104) {
								@Pc(1176) Class29 local1176 = this.aClass29ArrayArrayArray1[this.anInt229][local24][local31];
								if (local1176 != null) {
									for (@Pc(1182) Class1_Sub1_Sub1_Sub3 local1182 = (Class1_Sub1_Sub1_Sub3) local1176.method511(); local1182 != null; local1182 = (Class1_Sub1_Sub1_Sub3) local1176.method513()) {
										if (local1182.anInt168 == (local34 & 0x7FFF) && local1182.anInt169 == local38) {
											local1182.anInt169 = local42;
											break;
										}
									}
									this.method144(local24, local31);
								}
							}
						} else if (arg1 == 222) {
							local15 = arg0.method480();
							local24 = this.anInt303 + (local15 >> 4 & 0x7);
							local31 = this.anInt304 + (local15 & 0x7);
							local34 = arg0.method482();
							local38 = arg0.method480();
							local42 = local38 >> 4 & 0xF;
							local47 = local38 & 0x7;
							if (aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray272[0] >= local24 - local42 && aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray272[0] <= local24 + local42 && aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray273[0] >= local31 - local42 && aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray273[0] <= local31 + local42 && this.aBoolean91 && !aBoolean72 && this.anInt287 < 50) {
								this.anIntArray50[this.anInt287] = local34;
								this.anIntArray43[this.anInt287] = local47;
								this.anIntArray49[this.anInt287] = Class5.anIntArray29[local34];
								this.anInt287++;
								return;
							}
						}
					}
				}
			}
		} catch (@Pc(1318) RuntimeException local1318) {
			signlink.reporterror("48061, " + arg0 + ", " + -978 + ", " + arg1 + ", " + local1318.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "E", descriptor = "(I)Ljava/lang/String;")
	private String method215() {
		try {
			if (signlink.mainapp == null) {
				return super.aFrame_Sub1_2 == null ? super.getDocumentBase().getHost().toLowerCase() : "runescape.com";
			} else {
				return signlink.mainapp.getDocumentBase().getHost().toLowerCase();
			}
		} catch (@Pc(24) RuntimeException local24) {
			signlink.reporterror("12883, " + 566 + ", " + local24.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "F", descriptor = "(I)V")
	private void method216() {
		try {
			this.anInt325++;
			this.method167(true);
			this.method157(true);
			this.method167(false);
			this.method157(false);
			this.method104();
			this.method179();
			@Pc(43) int local43;
			@Pc(82) int local82;
			if (!this.aBoolean52) {
				local43 = this.anInt390;
				if (this.anInt319 / 256 > local43) {
					local43 = this.anInt319 / 256;
				}
				if (this.aBooleanArray3[4] && this.anIntArray64[4] + 128 > local43) {
					local43 = this.anIntArray64[4] + 128;
				}
				local82 = this.anInt391 + this.anInt236 & 0x7FF;
				this.method98(this.anInt360, local82, local43 * 3 + 600, this.anInt361, this.method219(this.anInt229, aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt963, aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt962) - 50, local43);
			}
			if (this.aBoolean52) {
				local43 = this.method147();
			} else {
				local43 = this.method146();
			}
			local82 = this.anInt375;
			@Pc(126) int local126 = this.anInt376;
			@Pc(129) int local129 = this.anInt377;
			@Pc(132) int local132 = this.anInt378;
			@Pc(135) int local135 = this.anInt379;
			@Pc(184) int local184;
			for (@Pc(137) int local137 = 0; local137 < 5; local137++) {
				if (this.aBooleanArray3[local137]) {
					local184 = (int) (Math.random() * (double) (this.anIntArray61[local137] * 2 + 1) - (double) this.anIntArray61[local137] + Math.sin((double) this.anIntArray45[local137] * ((double) this.anIntArray55[local137] / 100.0D)) * (double) this.anIntArray64[local137]);
					if (local137 == 0) {
						this.anInt375 += local184;
					}
					if (local137 == 1) {
						this.anInt376 += local184;
					}
					if (local137 == 2) {
						this.anInt377 += local184;
					}
					if (local137 == 3) {
						this.anInt379 = this.anInt379 + local184 & 0x7FF;
					}
					if (local137 == 4) {
						this.anInt378 += local184;
						if (this.anInt378 < 128) {
							this.anInt378 = 128;
						}
						if (this.anInt378 > 383) {
							this.anInt378 = 383;
						}
					}
				}
			}
			local184 = Class1_Sub1_Sub2_Sub1.anInt570;
			Class1_Sub1_Sub1_Sub5.aBoolean124 = true;
			Class1_Sub1_Sub1_Sub5.anInt477 = 0;
			Class1_Sub1_Sub1_Sub5.anInt475 = super.anInt182 - 4;
			Class1_Sub1_Sub1_Sub5.anInt476 = super.anInt183 - 4;
			Class1_Sub1_Sub2.method437();
			this.aClass37_1.method569(local43, this.anInt378, this.anInt377, this.anInt379, this.anInt375, this.anInt376);
			this.aClass37_1.method544();
			this.method161();
			this.method226();
			this.method207(local184);
			this.method153();
			this.aClass35_5.method525(4, super.aGraphics2, 4);
			this.anInt375 = local82;
			this.anInt376 = local126;
			this.anInt377 = local129;
			this.anInt378 = local132;
			this.anInt379 = local135;
		} catch (@Pc(323) RuntimeException local323) {
			signlink.reporterror("48185, " + -754 + ", " + local323.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "G", descriptor = "(I)V")
	private void method218(@OriginalArg(0) int arg0) {
		try {
			@Pc(8) int local8;
			if (this.anInt275 > 0) {
				for (local8 = 0; local8 < 256; local8++) {
					if (this.anInt275 > 768) {
						this.anIntArray39[local8] = this.method154(1024 - this.anInt275, this.anIntArray41[local8], this.anIntArray40[local8]);
					} else if (this.anInt275 > 256) {
						this.anIntArray39[local8] = this.anIntArray41[local8];
					} else {
						this.anIntArray39[local8] = this.method154(256 - this.anInt275, this.anIntArray40[local8], this.anIntArray41[local8]);
					}
				}
			} else if (this.anInt276 > 0) {
				for (local8 = 0; local8 < 256; local8++) {
					if (this.anInt276 > 768) {
						this.anIntArray39[local8] = this.method154(1024 - this.anInt276, this.anIntArray42[local8], this.anIntArray40[local8]);
					} else if (this.anInt276 > 256) {
						this.anIntArray39[local8] = this.anIntArray42[local8];
					} else {
						this.anIntArray39[local8] = this.method154(256 - this.anInt276, this.anIntArray40[local8], this.anIntArray42[local8]);
					}
				}
			} else {
				for (local8 = 0; local8 < 256; local8++) {
					this.anIntArray39[local8] = this.anIntArray40[local8];
				}
			}
			for (local8 = 0; local8 < 33920; local8++) {
				this.aClass35_22.anIntArray231[local8] = this.aClass1_Sub1_Sub2_Sub2_9.anIntArray208[local8];
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
				local198 = this.anIntArray65[local185] * (256 - local185) / 256;
				local202 = local198 + 22;
				if (local202 < 0) {
					local202 = 0;
				}
				local181 += local202;
				for (local212 = local202; local212 < 128; local212++) {
					local220 = this.anIntArray51[local181++];
					if (local220 == 0) {
						local183++;
					} else {
						local224 = local220;
						local228 = 256 - local220;
						local220 = this.anIntArray39[local220];
						local239 = this.aClass35_22.anIntArray231[local183];
						this.aClass35_22.anIntArray231[local183++] = ((local220 & 0xFF00FF) * local224 + (local239 & 0xFF00FF) * local228 & 0xFF00FF00) + ((local220 & 0xFF00) * local224 + (local239 & 0xFF00) * local228 & 0xFF0000) >> 8;
					}
				}
				local183 += local202;
			}
			if (arg0 != 4) {
				aBoolean60 = !aBoolean60;
			}
			this.aClass35_22.method525(0, super.aGraphics2, 0);
			for (local198 = 0; local198 < 33920; local198++) {
				this.aClass35_23.anIntArray231[local198] = this.aClass1_Sub1_Sub2_Sub2_10.anIntArray208[local198];
			}
			local181 = 0;
			local183 = 1176;
			for (local202 = 1; local202 < 255; local202++) {
				local212 = this.anIntArray65[local202] * (256 - local202) / 256;
				local220 = 103 - local212;
				local183 += local212;
				for (local224 = 0; local224 < local220; local224++) {
					local228 = this.anIntArray51[local181++];
					if (local228 == 0) {
						local183++;
					} else {
						local239 = local228;
						@Pc(371) int local371 = 256 - local228;
						local228 = this.anIntArray39[local228];
						@Pc(382) int local382 = this.aClass35_23.anIntArray231[local183];
						this.aClass35_23.anIntArray231[local183++] = ((local228 & 0xFF00FF) * local239 + (local382 & 0xFF00FF) * local371 & 0xFF00FF00) + ((local228 & 0xFF00) * local239 + (local382 & 0xFF00) * local371 & 0xFF0000) >> 8;
					}
				}
				local181 += 128 - local220;
				local183 += 128 - local220 - local212;
			}
			this.aClass35_23.method525(637, super.aGraphics2, 0);
		} catch (@Pc(454) RuntimeException local454) {
			signlink.reporterror("20291, " + arg0 + ", " + local454.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IZII)I")
	private int method219(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		try {
			@Pc(3) int local3 = arg2 >> 7;
			@Pc(7) int local7 = arg1 >> 7;
			if (local3 < 0 || local7 < 0 || local3 > 103 || local7 > 103) {
				return 0;
			}
			@Pc(21) int local21 = arg0;
			if (arg0 < 3 && (this.aByteArrayArrayArray7[1][local3][local7] & 0x2) == 2) {
				local21 = arg0 + 1;
			}
			@Pc(41) int local41 = arg2 & 0x7F;
			@Pc(45) int local45 = arg1 & 0x7F;
			@Pc(73) int local73 = this.anIntArrayArrayArray5[local21][local3][local7] * (128 - local41) + this.anIntArrayArrayArray5[local21][local3 + 1][local7] * local41 >> 7;
			this.aBoolean89 &= true;
			@Pc(111) int local111 = this.anIntArrayArrayArray5[local21][local3][local7 + 1] * (128 - local41) + this.anIntArrayArrayArray5[local21][local3 + 1][local7 + 1] * local41 >> 7;
			return local73 * (128 - local45) + local111 * local45 >> 7;
		} catch (@Pc(124) RuntimeException local124) {
			signlink.reporterror("52102, " + arg0 + ", " + true + ", " + arg1 + ", " + arg2 + ", " + local124.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIB)Z")
	private boolean method220(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(3) boolean local3 = false;
			@Pc(14) Class6 local14 = Class6.aClass6Array1[arg1];
			for (@Pc(16) int local16 = 0; local16 < local14.anIntArray98.length && local14.anIntArray98[local16] != -1; local16++) {
				@Pc(31) Class6 local31 = Class6.aClass6Array1[local14.anIntArray98[local16]];
				if (local31.anInt406 == 1) {
					local3 |= this.method220(arg0, local31.anInt404);
				}
				if (local31.anInt406 == 6 && (local31.anInt427 != -1 || local31.anInt428 != -1)) {
					@Pc(61) boolean local61 = this.method185(local31);
					@Pc(66) int local66;
					if (local61) {
						local66 = local31.anInt428;
					} else {
						local66 = local31.anInt427;
					}
					if (local66 != -1) {
						@Pc(78) Class27 local78 = Class27.aClass27Array1[local66];
						local31.anInt403 += arg0;
						while (local31.anInt403 > local78.method506(local31.anInt402)) {
							local31.anInt403 -= local78.method506(local31.anInt402) + 1;
							local31.anInt402++;
							if (local31.anInt402 >= local78.anInt771) {
								local31.anInt402 -= local78.anInt772;
								if (local31.anInt402 < 0 || local31.anInt402 >= local78.anInt771) {
									local31.anInt402 = 0;
								}
							}
							local3 = true;
						}
					}
				}
			}
			return local3;
		} catch (@Pc(146) RuntimeException local146) {
			signlink.reporterror("3696, " + arg0 + ", " + arg1 + ", " + 3 + ", " + local146.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/String;IZLjava/lang/String;)V")
	private void method221(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(3) String arg2) {
		try {
			if (arg1 == 0 && this.anInt314 != -1) {
				this.aString5 = arg0;
				super.anInt187 = 0;
			}
			if (this.anInt197 == -1) {
				this.aBoolean88 = true;
			}
			for (@Pc(20) int local20 = 99; local20 > 0; local20--) {
				this.anIntArray66[local20] = this.anIntArray66[local20 - 1];
				this.aStringArray3[local20] = this.aStringArray3[local20 - 1];
				this.aStringArray4[local20] = this.aStringArray4[local20 - 1];
			}
			this.anIntArray66[0] = arg1;
			this.aStringArray3[0] = arg2;
			this.aStringArray4[0] = arg0;
		} catch (@Pc(77) RuntimeException local77) {
			signlink.reporterror("84581, " + arg0 + ", " + arg1 + ", " + false + ", " + arg2 + ", " + local77.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(Lclient!d;Z)V")
	private void method222(@OriginalArg(0) Class6 arg0) {
		try {
			@Pc(4) int local4 = arg0.anInt408;
			@Pc(67) int local67;
			if ((local4 < 1 || local4 > 100) && (local4 < 701 || local4 > 800)) {
				if (local4 >= 101 && local4 <= 200 || local4 >= 801 && local4 <= 900) {
					local67 = this.anInt350;
					if (this.anInt351 != 2) {
						local67 = 0;
					}
					if (local4 > 800) {
						local4 -= 701;
					} else {
						local4 -= 101;
					}
					if (local4 >= local67) {
						arg0.aString18 = "";
						arg0.anInt407 = 0;
					} else {
						if (this.anIntArray48[local4] == 0) {
							arg0.aString18 = "@red@Offline";
						} else if (this.anIntArray48[local4] == anInt291) {
							arg0.aString18 = "@gre@World-" + (this.anIntArray48[local4] - 9);
						} else {
							arg0.aString18 = "@yel@World-" + (this.anIntArray48[local4] - 9);
						}
						arg0.anInt407 = 1;
					}
				} else if (local4 == 203) {
					local67 = this.anInt350;
					if (this.anInt351 != 2) {
						local67 = 0;
					}
					arg0.anInt414 = local67 * 15 + 20;
					if (arg0.anInt414 <= arg0.anInt410) {
						arg0.anInt414 = arg0.anInt410 + 1;
					}
				} else if (local4 >= 401 && local4 <= 500) {
					local4 -= 401;
					if (local4 == 0 && this.anInt351 == 0) {
						arg0.aString18 = "Loading ignore list";
						arg0.anInt407 = 0;
					} else if (local4 == 1 && this.anInt351 == 0) {
						arg0.aString18 = "Please wait...";
						arg0.anInt407 = 0;
					} else {
						local67 = this.anInt290;
						if (this.anInt351 == 0) {
							local67 = 0;
						}
						if (local4 >= local67) {
							arg0.aString18 = "";
							arg0.anInt407 = 0;
						} else {
							arg0.aString18 = Class48.method671(Class48.method668(this.aLongArray4[local4]));
							arg0.anInt407 = 1;
						}
					}
				} else if (local4 == 503) {
					arg0.anInt414 = this.anInt290 * 15 + 20;
					if (arg0.anInt414 <= arg0.anInt410) {
						arg0.anInt414 = arg0.anInt410 + 1;
					}
				} else if (local4 == 327) {
					arg0.anInt430 = 150;
					arg0.anInt431 = (int) (Math.sin((double) anInt239 / 40.0D) * 256.0D) & 0x7FF;
					if (this.aBoolean83) {
						for (local67 = 0; local67 < 7; local67++) {
							@Pc(336) int local336 = this.anIntArray54[local67];
							if (local336 >= 0 && !Class23.aClass23Array1[local336].method498(this.anInt266)) {
								return;
							}
						}
						this.aBoolean83 = false;
						@Pc(356) Class1_Sub1_Sub1_Sub5[] local356 = new Class1_Sub1_Sub1_Sub5[7];
						@Pc(358) int local358 = 0;
						for (@Pc(360) int local360 = 0; local360 < 7; local360++) {
							@Pc(367) int local367 = this.anIntArray54[local360];
							if (local367 >= 0) {
								local356[local358++] = Class23.aClass23Array1[local367].method499(this.aByte4);
							}
						}
						@Pc(390) Class1_Sub1_Sub1_Sub5 local390 = new Class1_Sub1_Sub1_Sub5(local356, local358, false);
						for (@Pc(392) int local392 = 0; local392 < 5; local392++) {
							if (this.anIntArray59[local392] != 0) {
								local390.method275(anIntArrayArray3[local392][0], anIntArrayArray3[local392][this.anIntArray59[local392]]);
								if (local392 == 1) {
									local390.method275(anIntArray67[0], anIntArray67[this.anIntArray59[local392]]);
								}
							}
						}
						local390.method268();
						local390.method269(Class27.aClass27Array1[aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt966].anIntArray225[0]);
						local390.method278(64, 850, -30, -50, -30, true);
						arg0.anInt423 = 5;
						arg0.anInt424 = 0;
						Class6.method235(local390);
					}
				} else if (local4 == 324) {
					if (this.aClass1_Sub1_Sub2_Sub2_6 == null) {
						this.aClass1_Sub1_Sub2_Sub2_6 = arg0.aClass1_Sub1_Sub2_Sub2_14;
						this.aClass1_Sub1_Sub2_Sub2_7 = arg0.aClass1_Sub1_Sub2_Sub2_15;
					}
					if (this.aBoolean58) {
						arg0.aClass1_Sub1_Sub2_Sub2_14 = this.aClass1_Sub1_Sub2_Sub2_7;
					} else {
						arg0.aClass1_Sub1_Sub2_Sub2_14 = this.aClass1_Sub1_Sub2_Sub2_6;
					}
				} else if (local4 == 325) {
					if (this.aClass1_Sub1_Sub2_Sub2_6 == null) {
						this.aClass1_Sub1_Sub2_Sub2_6 = arg0.aClass1_Sub1_Sub2_Sub2_14;
						this.aClass1_Sub1_Sub2_Sub2_7 = arg0.aClass1_Sub1_Sub2_Sub2_15;
					}
					if (this.aBoolean58) {
						arg0.aClass1_Sub1_Sub2_Sub2_14 = this.aClass1_Sub1_Sub2_Sub2_6;
					} else {
						arg0.aClass1_Sub1_Sub2_Sub2_14 = this.aClass1_Sub1_Sub2_Sub2_7;
					}
				} else if (local4 == 600) {
					arg0.aString18 = this.aString7;
					if (anInt239 % 20 < 10) {
						arg0.aString18 = arg0.aString18 + "|";
					} else {
						arg0.aString18 = arg0.aString18 + " ";
					}
				} else {
					if (local4 == 613) {
						if (this.anInt316 < 1) {
							arg0.aString18 = "";
						} else if (this.aBoolean76) {
							arg0.anInt419 = 16711680;
							arg0.aString18 = "Moderator option: Mute player for 48 hours: <ON>";
						} else {
							arg0.anInt419 = 16777215;
							arg0.aString18 = "Moderator option: Mute player for 48 hours: <OFF>";
						}
					}
					@Pc(598) String local598;
					if (local4 == 650 || local4 == 655) {
						if (this.anInt342 == 0) {
							arg0.aString18 = "";
						} else {
							if (this.anInt336 == 0) {
								local598 = "earlier today";
							} else if (this.anInt336 == 1) {
								local598 = "yesterday";
							} else {
								local598 = this.anInt336 + " days ago";
							}
							arg0.aString18 = "You last logged in " + local598 + " from: " + signlink.dns;
						}
					}
					if (local4 == 651) {
						if (this.anInt279 == 0) {
							arg0.aString18 = "0 unread messages";
							arg0.anInt419 = 16776960;
						}
						if (this.anInt279 == 1) {
							arg0.aString18 = "1 unread message";
							arg0.anInt419 = 65280;
						}
						if (this.anInt279 > 1) {
							arg0.aString18 = this.anInt279 + " unread messages";
							arg0.anInt419 = 65280;
						}
					}
					if (local4 == 652) {
						if (this.anInt200 == 201) {
							if (this.anInt307 == 1) {
								arg0.aString18 = "@yel@This is a non-members world: @whi@Since you are a member we";
							} else {
								arg0.aString18 = "";
							}
						} else if (this.anInt200 == 200) {
							arg0.aString18 = "You have not yet set any password recovery questions.";
						} else {
							if (this.anInt200 == 0) {
								local598 = "Earlier today";
							} else if (this.anInt200 == 1) {
								local598 = "Yesterday";
							} else {
								local598 = this.anInt200 + " days ago";
							}
							arg0.aString18 = local598 + " you changed your recovery questions";
						}
					}
					if (local4 == 653) {
						if (this.anInt200 == 201) {
							if (this.anInt307 == 1) {
								arg0.aString18 = "@whi@recommend you use a members world instead. You may use";
							} else {
								arg0.aString18 = "";
							}
						} else if (this.anInt200 == 200) {
							arg0.aString18 = "We strongly recommend you do so now to secure your account.";
						} else {
							arg0.aString18 = "If you do not remember making this change then cancel it immediately";
						}
					}
					if (local4 == 654) {
						if (this.anInt200 == 201) {
							if (this.anInt307 == 1) {
								arg0.aString18 = "@whi@this world but member benefits are unavailable whilst here.";
							} else {
								arg0.aString18 = "";
							}
						} else if (this.anInt200 == 200) {
							arg0.aString18 = "Do this from the 'account management' area on our front webpage";
						} else {
							arg0.aString18 = "Do this from the 'account management' area on our front webpage";
						}
					}
				}
			} else if (local4 == 1 && this.anInt351 == 0) {
				arg0.aString18 = "Loading friend list";
				arg0.anInt407 = 0;
			} else if (local4 == 1 && this.anInt351 == 1) {
				arg0.aString18 = "Connecting to friendserver";
				arg0.anInt407 = 0;
			} else if (local4 == 2 && this.anInt351 != 2) {
				arg0.aString18 = "Please wait...";
				arg0.anInt407 = 0;
			} else {
				local67 = this.anInt350;
				if (this.anInt351 != 2) {
					local67 = 0;
				}
				if (local4 > 700) {
					local4 -= 601;
				} else {
					local4--;
				}
				if (local4 >= local67) {
					arg0.aString18 = "";
					arg0.anInt407 = 0;
				} else {
					arg0.aString18 = this.aStringArray2[local4];
					arg0.anInt407 = 1;
				}
			}
		} catch (@Pc(806) RuntimeException local806) {
			signlink.reporterror("79093, " + arg0 + ", " + false + ", " + local806.toString());
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
			} catch (@Pc(11) Exception local11) {
			}
			this.aClass8_1 = null;
			this.method189();
			if (this.aClass11_1 != null) {
				this.aClass11_1.aBoolean140 = false;
			}
			this.aClass11_1 = null;
			this.aClass44_Sub1_1.method637();
			this.aClass44_Sub1_1 = null;
			this.aClass1_Sub1_Sub3_3 = null;
			this.aClass1_Sub1_Sub3_2 = null;
			this.aClass1_Sub1_Sub3_4 = null;
			this.anIntArray36 = null;
			this.aByteArrayArray2 = null;
			this.aByteArrayArray1 = null;
			this.anIntArray37 = null;
			this.anIntArray38 = null;
			this.anIntArrayArrayArray5 = null;
			this.aByteArrayArrayArray7 = null;
			this.aClass37_1 = null;
			this.aClass19Array1 = null;
			this.anIntArrayArray5 = null;
			this.anIntArrayArray4 = null;
			this.anIntArray92 = null;
			this.anIntArray93 = null;
			this.aByteArray2 = null;
			this.aClass35_3 = null;
			this.aClass35_4 = null;
			this.aClass35_5 = null;
			this.aClass35_6 = null;
			this.aClass35_16 = null;
			this.aClass35_17 = null;
			this.aClass35_18 = null;
			this.aClass35_7 = null;
			this.aClass35_8 = null;
			this.aClass35_9 = null;
			this.aClass35_10 = null;
			this.aClass35_11 = null;
			this.aClass35_12 = null;
			this.aClass35_13 = null;
			this.aClass35_14 = null;
			this.aClass35_15 = null;
			this.aClass1_Sub1_Sub2_Sub3_1 = null;
			this.aClass1_Sub1_Sub2_Sub3_2 = null;
			this.aClass1_Sub1_Sub2_Sub3_3 = null;
			this.aClass1_Sub1_Sub2_Sub3_4 = null;
			this.aClass1_Sub1_Sub2_Sub3_5 = null;
			this.aClass1_Sub1_Sub2_Sub3_6 = null;
			this.aClass1_Sub1_Sub2_Sub3Array1 = null;
			this.aClass1_Sub1_Sub2_Sub3_16 = null;
			this.aClass1_Sub1_Sub2_Sub3_17 = null;
			this.aClass1_Sub1_Sub2_Sub3_18 = null;
			this.aClass1_Sub1_Sub2_Sub3_19 = null;
			this.aClass1_Sub1_Sub2_Sub3_20 = null;
			this.aClass1_Sub1_Sub2_Sub3_9 = null;
			this.aClass1_Sub1_Sub2_Sub3_10 = null;
			this.aClass1_Sub1_Sub2_Sub3_11 = null;
			this.aClass1_Sub1_Sub2_Sub3_12 = null;
			this.aClass1_Sub1_Sub2_Sub3_13 = null;
			this.aClass1_Sub1_Sub2_Sub2_11 = null;
			this.aClass1_Sub1_Sub2_Sub2Array6 = null;
			this.aClass1_Sub1_Sub2_Sub2Array4 = null;
			this.aClass1_Sub1_Sub2_Sub2Array3 = null;
			this.aClass1_Sub1_Sub2_Sub2_2 = null;
			this.aClass1_Sub1_Sub2_Sub2_3 = null;
			this.aClass1_Sub1_Sub2_Sub2_4 = null;
			this.aClass1_Sub1_Sub2_Sub2_5 = null;
			this.aClass1_Sub1_Sub2_Sub3Array3 = null;
			this.aClass1_Sub1_Sub2_Sub2Array7 = null;
			this.anIntArrayArray6 = null;
			this.aClass1_Sub1_Sub1_Sub1_Sub1Array1 = null;
			this.anIntArray46 = null;
			this.anIntArray47 = null;
			this.aClass1_Sub1_Sub3Array1 = null;
			this.anIntArray53 = null;
			this.aClass1_Sub1_Sub1_Sub1_Sub2Array1 = null;
			this.anIntArray91 = null;
			this.aClass29ArrayArrayArray1 = null;
			this.aClass29_1 = null;
			this.aClass29_3 = null;
			this.aClass29_2 = null;
			this.anIntArray32 = null;
			this.anIntArray33 = null;
			this.anIntArray34 = null;
			this.anIntArray35 = null;
			this.aStringArray1 = null;
			this.anIntArray56 = null;
			this.anIntArray69 = null;
			this.anIntArray70 = null;
			this.aClass1_Sub1_Sub2_Sub2Array5 = null;
			this.aClass1_Sub1_Sub2_Sub2_1 = null;
			this.aStringArray2 = null;
			this.aLongArray3 = null;
			this.anIntArray48 = null;
			this.aClass35_22 = null;
			this.aClass35_23 = null;
			this.aClass35_19 = null;
			this.aClass35_20 = null;
			this.aClass35_21 = null;
			this.aClass35_24 = null;
			this.aClass35_25 = null;
			this.aBoolean89 &= true;
			this.aClass35_26 = null;
			this.aClass35_27 = null;
			this.method155();
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
		} catch (@Pc(370) RuntimeException local370) {
			signlink.reporterror("6848, " + true + ", " + local370.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "h", descriptor = "(II)V")
	private void method223(@OriginalArg(1) int arg0) {
		try {
			if (arg0 >= 0) {
				if (this.aBoolean79) {
					this.aBoolean79 = false;
					this.aBoolean88 = true;
				}
				@Pc(18) int local18 = this.anIntArray32[arg0];
				@Pc(23) int local23 = this.anIntArray33[arg0];
				@Pc(28) int local28 = this.anIntArray34[arg0];
				@Pc(33) int local33 = this.anIntArray35[arg0];
				if (local28 >= 2000) {
					local28 -= 2000;
				}
				if (local28 == 810 && this.method168(215, local18, local33, local23, this.anInt274)) {
					this.aClass1_Sub1_Sub3_3.method471(this.anInt284);
					this.aClass1_Sub1_Sub3_3.method471(this.anInt282);
					this.aClass1_Sub1_Sub3_3.method471(this.anInt283);
				}
				if (local28 == 398) {
					this.aClass1_Sub1_Sub3_3.method469(101);
					this.aClass1_Sub1_Sub3_3.method471(local33);
					this.aClass1_Sub1_Sub3_3.method471(local18);
					this.aClass1_Sub1_Sub3_3.method471(local23);
					this.aClass1_Sub1_Sub3_3.method471(this.anInt284);
					this.aClass1_Sub1_Sub3_3.method471(this.anInt282);
					this.aClass1_Sub1_Sub3_3.method471(this.anInt283);
					this.anInt329 = 0;
					this.anInt330 = local23;
					this.anInt331 = local18;
					this.anInt332 = 2;
					if (Class6.aClass6Array1[local23].anInt405 == this.anInt324) {
						this.anInt332 = 1;
					}
					if (Class6.aClass6Array1[local23].anInt405 == this.anInt197) {
						this.anInt332 = 3;
					}
				}
				@Pc(155) boolean local155;
				if (local28 == 111) {
					local155 = this.method156(aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray273[0], aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray272[0], 0, local18, local23, 0, false, 0, 0, (byte) 4, 2, 0);
					if (!local155) {
						this.method156(aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray273[0], aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray272[0], 0, local18, local23, 0, false, 1, 1, (byte) 4, 2, 0);
					}
					this.anInt370 = super.anInt188;
					this.anInt371 = super.anInt189;
					this.anInt373 = 2;
					this.anInt372 = 0;
					this.aClass1_Sub1_Sub3_3.method469(163);
					this.aClass1_Sub1_Sub3_3.method471(local18 + this.anInt354);
					this.aClass1_Sub1_Sub3_3.method471(local23 + this.anInt355);
					this.aClass1_Sub1_Sub3_3.method471(local33);
					this.aClass1_Sub1_Sub3_3.method471(this.anInt284);
					this.aClass1_Sub1_Sub3_3.method471(this.anInt282);
					this.aClass1_Sub1_Sub3_3.method471(this.anInt283);
				}
				@Pc(250) Class1_Sub1_Sub1_Sub1_Sub2 local250;
				if (local28 == 242 || local28 == 209 || local28 == 309 || local28 == 852 || local28 == 793) {
					local250 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local33];
					if (local250 != null) {
						this.method156(aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray273[0], aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray272[0], 0, local250.anIntArray272[0], local250.anIntArray273[0], 0, false, 1, 1, (byte) 4, 2, 0);
						this.anInt370 = super.anInt188;
						this.anInt371 = super.anInt189;
						this.anInt373 = 2;
						this.anInt372 = 0;
						if (local28 == 793) {
							this.aClass1_Sub1_Sub3_3.method469(188);
						}
						if (local28 == 852) {
							this.aClass1_Sub1_Sub3_3.method469(22);
						}
						if (local28 == 209) {
							this.aClass1_Sub1_Sub3_3.method469(4);
						}
						if (local28 == 242) {
							this.aClass1_Sub1_Sub3_3.method469(35);
						}
						if (local28 == 309) {
							this.aClass1_Sub1_Sub3_3.method469(239);
						}
						this.aClass1_Sub1_Sub3_3.method471(local33);
					}
				}
				if (local28 == 1071) {
					this.method168(253, local18, local33, local23, this.anInt274);
				}
				if (local28 == 743) {
					anInt396++;
					if (anInt396 >= 124) {
						this.aClass1_Sub1_Sub3_3.method469(173);
						this.aClass1_Sub1_Sub3_3.method471(37954);
					}
					this.method168(98, local18, local33, local23, this.anInt274);
				}
				@Pc(385) Class1_Sub1_Sub1_Sub1_Sub1 local385;
				if (local28 == 275) {
					local385 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local33];
					if (local385 != null) {
						this.method156(aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray273[0], aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray272[0], 0, local385.anIntArray272[0], local385.anIntArray273[0], 0, false, 1, 1, (byte) 4, 2, 0);
						this.anInt370 = super.anInt188;
						this.anInt371 = super.anInt189;
						this.anInt373 = 2;
						this.anInt372 = 0;
						this.aClass1_Sub1_Sub3_3.method469(136);
						this.aClass1_Sub1_Sub3_3.method471(local33);
						this.aClass1_Sub1_Sub3_3.method471(this.anInt284);
						this.aClass1_Sub1_Sub3_3.method471(this.anInt282);
						this.aClass1_Sub1_Sub3_3.method471(this.anInt283);
					}
				}
				if (local28 == 357) {
					this.method168(5, local18, local33, local23, this.anInt274);
				}
				if (local28 == 829) {
					local250 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local33];
					if (local250 != null) {
						this.method156(aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray273[0], aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray272[0], 0, local250.anIntArray272[0], local250.anIntArray273[0], 0, false, 1, 1, (byte) 4, 2, 0);
						this.anInt370 = super.anInt188;
						this.anInt371 = super.anInt189;
						this.anInt373 = 2;
						this.anInt372 = 0;
						this.aClass1_Sub1_Sub3_3.method469(120);
						this.aClass1_Sub1_Sub3_3.method471(local33);
						this.aClass1_Sub1_Sub3_3.method471(this.anInt284);
						this.aClass1_Sub1_Sub3_3.method471(this.anInt282);
						this.aClass1_Sub1_Sub3_3.method471(this.anInt283);
					}
				}
				@Pc(580) String local580;
				@Pc(546) Class6 local546;
				@Pc(565) String local565;
				if (local28 == 274) {
					local546 = Class6.aClass6Array1[local23];
					this.anInt297 = 1;
					this.anInt298 = local23;
					this.anInt299 = local546.anInt432;
					this.anInt281 = 0;
					this.aBoolean73 = true;
					local565 = local546.aString20;
					if (local565.indexOf(" ") != -1) {
						local565 = local565.substring(0, local565.indexOf(" "));
					}
					local580 = local546.aString20;
					if (local580.indexOf(" ") != -1) {
						local580 = local580.substring(local580.indexOf(" ") + 1);
					}
					this.aString9 = local565 + " " + local546.aString21 + " " + local580;
					if (this.anInt299 == 16) {
						this.aBoolean73 = true;
						this.anInt270 = 3;
						this.aBoolean80 = true;
					}
				} else {
					@Pc(645) int local645;
					@Pc(656) long local656;
					@Pc(641) String local641;
					if (local28 == 605 || local28 == 47 || local28 == 513 || local28 == 884) {
						local641 = this.aStringArray1[arg0];
						local645 = local641.indexOf("@whi@");
						if (local645 != -1) {
							local656 = Class48.method667(local641.substring(local645 + 5).trim());
							if (local28 == 605) {
								this.method123(local656);
							}
							if (local28 == 47) {
								this.method211(local656);
							}
							if (local28 == 513) {
								this.method145(local656);
							}
							if (local28 == 884) {
								this.method210(local656);
							}
						}
					}
					if (local28 == 694 || local28 == 962 || local28 == 795 || local28 == 681 || local28 == 100) {
						if (local28 == 100) {
							this.aClass1_Sub1_Sub3_3.method469(127);
						}
						if (local28 == 694) {
							this.aClass1_Sub1_Sub3_3.method469(64);
						}
						if (local28 == 795) {
							this.aClass1_Sub1_Sub3_3.method469(213);
						}
						if (local28 == 962) {
							this.aClass1_Sub1_Sub3_3.method469(156);
						}
						if (local28 == 681) {
							anInt320++;
							if (anInt320 >= 116) {
								this.aClass1_Sub1_Sub3_3.method469(152);
								this.aClass1_Sub1_Sub3_3.method473(13018169);
							}
							this.aClass1_Sub1_Sub3_3.method469(254);
						}
						this.aClass1_Sub1_Sub3_3.method471(local33);
						this.aClass1_Sub1_Sub3_3.method471(local18);
						this.aClass1_Sub1_Sub3_3.method471(local23);
						this.anInt329 = 0;
						this.anInt330 = local23;
						this.anInt331 = local18;
						this.anInt332 = 2;
						if (Class6.aClass6Array1[local23].anInt405 == this.anInt324) {
							this.anInt332 = 1;
						}
						if (Class6.aClass6Array1[local23].anInt405 == this.anInt197) {
							this.anInt332 = 3;
						}
					}
					if (local28 == 737) {
						this.method129();
					}
					if (local28 == 370) {
						local155 = this.method156(aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray273[0], aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray272[0], 0, local18, local23, 0, false, 0, 0, (byte) 4, 2, 0);
						if (!local155) {
							this.method156(aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray273[0], aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray272[0], 0, local18, local23, 0, false, 1, 1, (byte) 4, 2, 0);
						}
						this.anInt370 = super.anInt188;
						this.anInt371 = super.anInt189;
						this.anInt373 = 2;
						this.anInt372 = 0;
						this.aClass1_Sub1_Sub3_3.method469(195);
						this.aClass1_Sub1_Sub3_3.method471(local18 + this.anInt354);
						this.aClass1_Sub1_Sub3_3.method471(local23 + this.anInt355);
						this.aClass1_Sub1_Sub3_3.method471(local33);
						this.aClass1_Sub1_Sub3_3.method471(this.anInt298);
					}
					if (local28 == 1381) {
						@Pc(903) int local903 = local33 >> 14 & 0x7FFF;
						@Pc(906) Class9 local906 = Class9.method288(local903);
						if (local906.aByteArray4 == null) {
							local580 = "It's a " + local906.aString23 + ".";
						} else {
							local580 = new String(local906.aByteArray4);
						}
						this.method221(local580, 0, "");
					}
					if (local28 == 639 || local28 == 499 || local28 == 27 || local28 == 387 || local28 == 185) {
						local385 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local33];
						if (local385 != null) {
							this.method156(aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray273[0], aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray272[0], 0, local385.anIntArray272[0], local385.anIntArray273[0], 0, false, 1, 1, (byte) 4, 2, 0);
							this.anInt370 = super.anInt188;
							this.anInt371 = super.anInt189;
							this.anInt373 = 2;
							this.anInt372 = 0;
							if (local28 == 185) {
								this.aClass1_Sub1_Sub3_3.method469(83);
							}
							if (local28 == 387) {
								anInt250 += local33;
								if (anInt250 >= 66) {
									this.aClass1_Sub1_Sub3_3.method469(222);
									this.aClass1_Sub1_Sub3_3.method470(154);
								}
								this.aClass1_Sub1_Sub3_3.method469(241);
							}
							if (local28 == 499) {
								this.aClass1_Sub1_Sub3_3.method469(40);
							}
							if (local28 == 639) {
								anInt257++;
								if (anInt257 >= 52) {
									this.aClass1_Sub1_Sub3_3.method469(0);
									this.aClass1_Sub1_Sub3_3.method470(131);
								}
								this.aClass1_Sub1_Sub3_3.method469(10);
							}
							if (local28 == 27) {
								this.aClass1_Sub1_Sub3_3.method469(17);
							}
							this.aClass1_Sub1_Sub3_3.method471(local33);
						}
					}
					if (local28 == 721) {
						anInt194 += local23;
						if (anInt194 >= 139) {
							this.aClass1_Sub1_Sub3_3.method469(202);
							this.aClass1_Sub1_Sub3_3.method474(0);
						}
						this.method168(207, local18, local33, local23, this.anInt274);
					}
					if (local28 == 997 && !this.aBoolean94) {
						this.aClass1_Sub1_Sub3_3.method469(223);
						this.aClass1_Sub1_Sub3_3.method471(local23);
						this.aBoolean94 = true;
					}
					if (local28 == 435) {
						this.aClass1_Sub1_Sub3_3.method469(62);
						this.aClass1_Sub1_Sub3_3.method471(local23);
						local546 = Class6.aClass6Array1[local23];
						if (local546.anIntArrayArray7 != null && local546.anIntArrayArray7[0][0] == 5) {
							local645 = local546.anIntArrayArray7[0][1];
							this.anIntArray56[local645] = 1 - this.anIntArray56[local645];
							this.method142(local645);
							this.aBoolean73 = true;
						}
					}
					if (local28 == 102) {
						this.anInt281 = 1;
						this.anInt282 = local18;
						this.anInt283 = local23;
						this.anInt284 = local33;
						this.aString8 = Class15.method361(local33).aString25;
						this.anInt297 = 0;
						this.aBoolean73 = true;
					} else {
						if (local28 == 139 || local28 == 778 || local28 == 617 || local28 == 224 || local28 == 662) {
							local155 = this.method156(aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray273[0], aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray272[0], 0, local18, local23, 0, false, 0, 0, (byte) 4, 2, 0);
							if (!local155) {
								this.method156(aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray273[0], aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray272[0], 0, local18, local23, 0, false, 1, 1, (byte) 4, 2, 0);
							}
							this.anInt370 = super.anInt188;
							this.anInt371 = super.anInt189;
							this.anInt373 = 2;
							this.anInt372 = 0;
							if (local28 == 139) {
								if ((local18 & 0x3) == 0) {
									anInt218++;
								}
								if (anInt218 >= 123) {
									this.aClass1_Sub1_Sub3_3.method469(58);
									this.aClass1_Sub1_Sub3_3.method474(0);
								}
								this.aClass1_Sub1_Sub3_3.method469(27);
							}
							if (local28 == 617) {
								this.aClass1_Sub1_Sub3_3.method469(60);
							}
							if (local28 == 662) {
								anInt302 += this.anInt355;
								if (anInt302 >= 118) {
									this.aClass1_Sub1_Sub3_3.method469(26);
									this.aClass1_Sub1_Sub3_3.method474(0);
								}
								this.aClass1_Sub1_Sub3_3.method469(211);
							}
							if (local28 == 224) {
								anInt348 += local23;
								if (anInt348 >= 75) {
									this.aClass1_Sub1_Sub3_3.method469(41);
									this.aClass1_Sub1_Sub3_3.method470(19);
								}
								this.aClass1_Sub1_Sub3_3.method469(123);
							}
							if (local28 == 778) {
								this.aClass1_Sub1_Sub3_3.method469(42);
							}
							this.aClass1_Sub1_Sub3_3.method471(local18 + this.anInt354);
							this.aClass1_Sub1_Sub3_3.method471(local23 + this.anInt355);
							this.aClass1_Sub1_Sub3_3.method471(local33);
						}
						if (local28 == 524) {
							local641 = this.aStringArray1[arg0];
							local645 = local641.indexOf("@whi@");
							if (local645 != -1) {
								if (this.anInt324 == -1) {
									this.method129();
									this.aString7 = local641.substring(local645 + 5).trim();
									this.aBoolean76 = false;
									for (@Pc(1416) int local1416 = 0; local1416 < Class6.aClass6Array1.length; local1416++) {
										if (Class6.aClass6Array1[local1416] != null && Class6.aClass6Array1[local1416].anInt408 == 600) {
											this.anInt221 = this.anInt324 = Class6.aClass6Array1[local1416].anInt405;
											break;
										}
									}
								} else {
									this.method221("Please close the interface you have open before using 'report abuse'", 0, "");
								}
							}
						}
						@Pc(1476) int local1476;
						if (local28 == 902) {
							local641 = this.aStringArray1[arg0];
							local645 = local641.indexOf("@whi@");
							if (local645 != -1) {
								local656 = Class48.method667(local641.substring(local645 + 5).trim());
								local1476 = -1;
								for (@Pc(1478) int local1478 = 0; local1478 < this.anInt350; local1478++) {
									if (this.aLongArray3[local1478] == local656) {
										local1476 = local1478;
										break;
									}
								}
								if (local1476 != -1 && this.anIntArray48[local1476] > 0) {
									this.aBoolean88 = true;
									this.aBoolean79 = false;
									this.aBoolean69 = true;
									this.aString16 = "";
									this.anInt328 = 3;
									this.aLong17 = this.aLongArray3[local1476];
									this.aString14 = "Enter message to send to " + this.aStringArray2[local1476];
								}
							}
						}
						@Pc(1543) Class15 local1543;
						if (local28 == 1152) {
							local1543 = Class15.method361(local33);
							if (local1543.aByteArray6 == null) {
								local565 = "It's a " + local1543.aString25 + ".";
							} else {
								local565 = new String(local1543.aByteArray6);
							}
							this.method221(local565, 0, "");
						}
						if (local28 == 582 || local28 == 113 || local28 == 555 || local28 == 331 || local28 == 354) {
							if (local28 == 113) {
								this.aClass1_Sub1_Sub3_3.method469(88);
							}
							if (local28 == 555) {
								this.aClass1_Sub1_Sub3_3.method469(130);
							}
							if (local28 == 354) {
								this.aClass1_Sub1_Sub3_3.method469(87);
							}
							if (local28 == 582) {
								if ((local33 & 0x3) == 0) {
									anInt306++;
								}
								if (anInt306 >= 133) {
									this.aClass1_Sub1_Sub3_3.method469(203);
									this.aClass1_Sub1_Sub3_3.method471(6118);
								}
								this.aClass1_Sub1_Sub3_3.method469(198);
							}
							if (local28 == 331) {
								this.aClass1_Sub1_Sub3_3.method469(125);
							}
							this.aClass1_Sub1_Sub3_3.method471(local33);
							this.aClass1_Sub1_Sub3_3.method471(local18);
							this.aClass1_Sub1_Sub3_3.method471(local23);
							this.anInt329 = 0;
							this.anInt330 = local23;
							this.anInt331 = local18;
							this.anInt332 = 2;
							if (Class6.aClass6Array1[local23].anInt405 == this.anInt324) {
								this.anInt332 = 1;
							}
							if (Class6.aClass6Array1[local23].anInt405 == this.anInt197) {
								this.anInt332 = 3;
							}
						}
						if (local28 == 507 || local28 == 957) {
							local641 = this.aStringArray1[arg0];
							local645 = local641.indexOf("@whi@");
							if (local645 != -1) {
								local641 = local641.substring(local645 + 5).trim();
								local580 = Class48.method671(Class48.method668(Class48.method667(local641)));
								@Pc(1724) boolean local1724 = false;
								for (local1476 = 0; local1476 < this.anInt242; local1476++) {
									@Pc(1736) Class1_Sub1_Sub1_Sub1_Sub1 local1736 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[this.anIntArray46[local1476]];
									if (local1736 != null && local1736.aString3 != null && local1736.aString3.equalsIgnoreCase(local580)) {
										this.method156(aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray273[0], aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray272[0], 0, local1736.anIntArray272[0], local1736.anIntArray273[0], 0, false, 1, 1, (byte) 4, 2, 0);
										if (local28 == 507) {
											anInt250 += local33;
											if (anInt250 >= 66) {
												this.aClass1_Sub1_Sub3_3.method469(222);
												this.aClass1_Sub1_Sub3_3.method470(154);
											}
											this.aClass1_Sub1_Sub3_3.method469(241);
										}
										if (local28 == 957) {
											anInt257++;
											if (anInt257 >= 52) {
												this.aClass1_Sub1_Sub3_3.method469(0);
												this.aClass1_Sub1_Sub3_3.method470(131);
											}
											this.aClass1_Sub1_Sub3_3.method469(10);
										}
										this.aClass1_Sub1_Sub3_3.method471(this.anIntArray46[local1476]);
										local1724 = true;
										break;
									}
								}
								if (!local1724) {
									this.method221("Unable to find " + local580, 0, "");
								}
							}
						}
						if (local28 == 718) {
							if (this.aBoolean87) {
								this.aClass37_1.method568(local18 - 4, local23 - 4);
							} else {
								this.aClass37_1.method568(super.anInt188 - 4, super.anInt189 - 4);
							}
						}
						if (local28 == 131) {
							local385 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local33];
							if (local385 != null) {
								this.method156(aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray273[0], aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray272[0], 0, local385.anIntArray272[0], local385.anIntArray273[0], 0, false, 1, 1, (byte) 4, 2, 0);
								this.anInt370 = super.anInt188;
								this.anInt371 = super.anInt189;
								this.anInt373 = 2;
								this.anInt372 = 0;
								this.aClass1_Sub1_Sub3_3.method469(97);
								this.aClass1_Sub1_Sub3_3.method471(local33);
								this.aClass1_Sub1_Sub3_3.method471(this.anInt298);
							}
						}
						if (local28 == 625) {
							this.method168(238, local18, local33, local23, this.anInt274);
						}
						if (local28 == 1714) {
							local250 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local33];
							if (local250 != null) {
								@Pc(1971) Class13 local1971 = local250.aClass13_2;
								if (local1971.anIntArray174 != null) {
									local1971 = local1971.method327();
								}
								if (local1971 != null) {
									if (local1971.aByteArray5 == null) {
										local580 = "It's a " + local1971.aString24 + ".";
									} else {
										local580 = new String(local1971.aByteArray5);
									}
									this.method221(local580, 0, "");
								}
							}
						}
						if (local28 == 225) {
							this.aClass1_Sub1_Sub3_3.method469(62);
							this.aClass1_Sub1_Sub3_3.method471(local23);
							local546 = Class6.aClass6Array1[local23];
							if (local546.anIntArrayArray7 != null && local546.anIntArrayArray7[0][0] == 5) {
								local645 = local546.anIntArrayArray7[0][1];
								if (this.anIntArray56[local645] != local546.anIntArray97[0]) {
									this.anIntArray56[local645] = local546.anIntArray97[0];
									this.method142(local645);
									this.aBoolean73 = true;
								}
							}
						}
						if (local28 == 231) {
							local546 = Class6.aClass6Array1[local23];
							@Pc(2075) boolean local2075 = true;
							if (local546.anInt408 > 0) {
								local2075 = this.method105(local546);
							}
							if (local2075) {
								this.aClass1_Sub1_Sub3_3.method469(62);
								this.aClass1_Sub1_Sub3_3.method471(local23);
							}
						}
						if (local28 == 563) {
							this.aClass1_Sub1_Sub3_3.method469(199);
							this.aClass1_Sub1_Sub3_3.method471(local33);
							this.aClass1_Sub1_Sub3_3.method471(local18);
							this.aClass1_Sub1_Sub3_3.method471(local23);
							this.aClass1_Sub1_Sub3_3.method471(this.anInt298);
							this.anInt329 = 0;
							this.anInt330 = local23;
							this.anInt331 = local18;
							this.anInt332 = 2;
							if (Class6.aClass6Array1[local23].anInt405 == this.anInt324) {
								this.anInt332 = 1;
							}
							if (Class6.aClass6Array1[local23].anInt405 == this.anInt197) {
								this.anInt332 = 3;
							}
						}
						if (local28 == 240) {
							local250 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local33];
							if (local250 != null) {
								this.method156(aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray273[0], aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray272[0], 0, local250.anIntArray272[0], local250.anIntArray273[0], 0, false, 1, 1, (byte) 4, 2, 0);
								this.anInt370 = super.anInt188;
								this.anInt371 = super.anInt189;
								this.anInt373 = 2;
								this.anInt372 = 0;
								this.aClass1_Sub1_Sub3_3.method469(100);
								this.aClass1_Sub1_Sub3_3.method471(local33);
								this.aClass1_Sub1_Sub3_3.method471(this.anInt298);
							}
						}
						if (local28 == 1328) {
							local1543 = Class15.method361(local33);
							@Pc(2226) Class6 local2226 = Class6.aClass6Array1[local23];
							if (local2226 != null && local2226.anIntArray95[local18] >= 100000) {
								local565 = local2226.anIntArray95[local18] + " x " + local1543.aString25;
							} else if (local1543.aByteArray6 == null) {
								local565 = "It's a " + local1543.aString25 + ".";
							} else {
								local565 = new String(local1543.aByteArray6);
							}
							this.method221(local565, 0, "");
						}
						if (local28 == 899 && this.method168(124, local18, local33, local23, this.anInt274)) {
							this.aClass1_Sub1_Sub3_3.method471(this.anInt298);
						}
						this.anInt281 = 0;
						this.anInt297 = 0;
						this.aBoolean73 = true;
					}
				}
			}
		} catch (@Pc(2318) RuntimeException local2318) {
			signlink.reporterror("79370, " + -368 + ", " + arg0 + ", " + local2318.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(IILclient!lb;)V")
	private void method224(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class1_Sub1_Sub3 arg2) {
		try {
			arg2.method490();
			@Pc(9) int local9 = arg2.method491(8);
			@Pc(15) int local15;
			if (local9 < this.anInt395) {
				for (local15 = local9; local15 < this.anInt395; local15++) {
					this.anIntArray53[this.anInt271++] = this.anIntArray91[local15];
				}
			}
			if (local9 > this.anInt395) {
				signlink.reporterror(this.aString12 + " Too many npcs");
				throw new RuntimeException("eek");
			}
			this.anInt395 = 0;
			@Pc(62) boolean local62 = false;
			for (local15 = 0; local15 < local9; local15++) {
				@Pc(71) int local71 = this.anIntArray91[local15];
				@Pc(76) Class1_Sub1_Sub1_Sub1_Sub2 local76 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local71];
				@Pc(81) int local81 = arg2.method491(1);
				if (local81 == 0) {
					this.anIntArray91[this.anInt395++] = local71;
					local76.anInt1002 = anInt239;
				} else {
					@Pc(104) int local104 = arg2.method491(2);
					if (local104 == 0) {
						this.anIntArray91[this.anInt395++] = local71;
						local76.anInt1002 = anInt239;
						this.anIntArray47[this.anInt243++] = local71;
					} else {
						@Pc(155) int local155;
						@Pc(165) int local165;
						if (local104 == 1) {
							this.anIntArray91[this.anInt395++] = local71;
							local76.anInt1002 = anInt239;
							local155 = arg2.method491(3);
							local76.method678(local155, false);
							local165 = arg2.method491(1);
							if (local165 == 1) {
								this.anIntArray47[this.anInt243++] = local71;
							}
						} else if (local104 == 2) {
							this.anIntArray91[this.anInt395++] = local71;
							local76.anInt1002 = anInt239;
							local155 = arg2.method491(3);
							local76.method678(local155, true);
							local165 = arg2.method491(3);
							local76.method678(local165, true);
							@Pc(223) int local223 = arg2.method491(1);
							if (local223 == 1) {
								this.anIntArray47[this.anInt243++] = local71;
							}
						} else if (local104 == 3) {
							this.anIntArray53[this.anInt271++] = local71;
						}
					}
				}
			}
		} catch (@Pc(260) RuntimeException local260) {
			signlink.reporterror("23745, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local260.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(BLjava/lang/String;)Z")
	private boolean method225(@OriginalArg(1) String arg0) {
		try {
			if (arg0 == null) {
				return false;
			}
			for (@Pc(5) int local5 = 0; local5 < this.anInt350; local5++) {
				if (arg0.equalsIgnoreCase(this.aStringArray2[local5])) {
					return true;
				}
			}
			if (this.aByte7 != 9) {
				throw new NullPointerException();
			}
			return arg0.equalsIgnoreCase(aClass1_Sub1_Sub1_Sub1_Sub1_1.aString3);
		} catch (@Pc(39) RuntimeException local39) {
			signlink.reporterror("23811, " + 9 + ", " + arg0 + ", " + local39.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "H", descriptor = "(I)V")
	private void method226() {
		try {
			if (this.anInt285 == 2) {
				this.method151((this.anInt203 - this.anInt354 << 7) + this.anInt206, this.anInt205 * 2, (this.anInt204 - this.anInt355 << 7) + this.anInt207);
				if (this.anInt386 > -1 && anInt239 % 20 < 10) {
					this.aClass1_Sub1_Sub2_Sub2Array4[2].method391(this.anInt386 - 12, this.anInt387 - 28);
				}
			}
		} catch (@Pc(60) RuntimeException local60) {
			signlink.reporterror("14007, " + -36148 + ", " + local60.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IZIIIIIIII)V")
	private void method227(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		try {
			@Pc(1) Class1_Sub2 local1 = null;
			for (@Pc(6) Class1_Sub2 local6 = (Class1_Sub2) this.aClass29_1.method511(); local6 != null; local6 = (Class1_Sub2) this.aClass29_1.method513()) {
				if (local6.anInt758 == arg7 && local6.anInt760 == arg4 && local6.anInt761 == arg0 && local6.anInt759 == arg6) {
					local1 = local6;
					break;
				}
			}
			if (local1 == null) {
				local1 = new Class1_Sub2();
				local1.anInt758 = arg7;
				local1.anInt759 = arg6;
				local1.anInt760 = arg4;
				local1.anInt761 = arg0;
				this.method171(local1);
				this.aClass29_1.method508(local1);
			}
			local1.anInt765 = arg1;
			local1.anInt767 = arg5;
			local1.anInt766 = arg8;
			local1.anInt768 = arg3;
			local1.anInt769 = arg2;
		} catch (@Pc(83) RuntimeException local83) {
			signlink.reporterror("9464, " + arg0 + ", " + false + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + local83.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "p", descriptor = "(B)V")
	private void method228(@OriginalArg(0) byte arg0) {
		try {
			@Pc(6) int local6;
			if (arg0 != 106) {
				for (local6 = 1; local6 > 0; local6++) {
				}
			}
			this.aBoolean83 = true;
			for (local6 = 0; local6 < 7; local6++) {
				this.anIntArray54[local6] = -1;
				for (@Pc(25) int local25 = 0; local25 < Class23.anInt729; local25++) {
					if (!Class23.aClass23Array1[local25].aBoolean202 && Class23.aClass23Array1[local25].anInt730 == local6 + (this.aBoolean58 ? 0 : 7)) {
						this.anIntArray54[local6] = local25;
						break;
					}
				}
			}
		} catch (@Pc(62) RuntimeException local62) {
			signlink.reporterror("2248, " + arg0 + ", " + local62.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "I", descriptor = "(I)V")
	private void method229(@OriginalArg(0) int arg0) {
		try {
			this.aClass35_3.method524(this.anInt198);
			Class1_Sub1_Sub2_Sub1.anIntArray180 = this.anIntArray83;
			this.aClass1_Sub1_Sub2_Sub3_1.method418(0, 0);
			if (this.anInt245 != -1) {
				this.method190(0, 0, Class6.aClass6Array1[this.anInt245], 0);
			} else if (this.anIntArray81[this.anInt270] != -1) {
				this.method190(0, 0, Class6.aClass6Array1[this.anIntArray81[this.anInt270]], 0);
			}
			if (this.aBoolean87 && this.anInt252 == 1) {
				this.method174();
			}
			this.aClass35_3.method525(553, super.aGraphics2, 205);
			this.aClass35_5.method524(this.anInt198);
			@Pc(76) boolean local76 = false;
			Class1_Sub1_Sub2_Sub1.anIntArray180 = this.anIntArray84;
		} catch (@Pc(81) RuntimeException local81) {
			signlink.reporterror("69471, " + arg0 + ", " + local81.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "r", descriptor = "(Z)V")
	private void method230() {
		try {
			try {
				if (this.aClass8_1 != null) {
					this.aClass8_1.method247();
				}
			} catch (@Pc(14) Exception local14) {
			}
			this.aClass8_1 = null;
			this.aBoolean89 = false;
			this.anInt339 = 0;
			this.aString12 = "";
			this.aString13 = "";
			this.method182();
			this.aClass37_1.method530();
			for (@Pc(38) int local38 = 0; local38 < 4; local38++) {
				this.aClass19Array1[local38].method420();
			}
			System.gc();
			this.method189();
			this.anInt317 = -1;
			this.anInt308 = -1;
			this.anInt238 = 0;
		} catch (@Pc(65) RuntimeException local65) {
			signlink.reporterror("60403, " + false + ", " + local65.toString());
			throw new RuntimeException();
		}
	}
}
