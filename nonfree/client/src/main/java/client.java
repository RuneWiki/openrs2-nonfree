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

	@OriginalMember(owner = "client!client", name = "ub", descriptor = "I")
	private static int anInt213;

	@OriginalMember(owner = "client!client", name = "yb", descriptor = "I")
	private static int anInt215;

	@OriginalMember(owner = "client!client", name = "Vb", descriptor = "I")
	public static int anInt223;

	@OriginalMember(owner = "client!client", name = "Dc", descriptor = "I")
	private static int anInt242;

	@OriginalMember(owner = "client!client", name = "sd", descriptor = "I")
	private static int anInt265;

	@OriginalMember(owner = "client!client", name = "Qd", descriptor = "Lclient!ab;")
	public static Class1_Sub1_Sub1_Sub1_Sub1 aClass1_Sub1_Sub1_Sub1_Sub1_1;

	@OriginalMember(owner = "client!client", name = "Sd", descriptor = "I")
	private static int anInt273;

	@OriginalMember(owner = "client!client", name = "Td", descriptor = "I")
	private static int anInt274;

	@OriginalMember(owner = "client!client", name = "ae", descriptor = "I")
	private static int anInt275;

	@OriginalMember(owner = "client!client", name = "be", descriptor = "Z")
	private static boolean aBoolean62;

	@OriginalMember(owner = "client!client", name = "de", descriptor = "I")
	private static int anInt276;

	@OriginalMember(owner = "client!client", name = "me", descriptor = "I")
	private static int anInt283;

	@OriginalMember(owner = "client!client", name = "se", descriptor = "I")
	private static int anInt288;

	@OriginalMember(owner = "client!client", name = "De", descriptor = "Z")
	private static boolean aBoolean64;

	@OriginalMember(owner = "client!client", name = "pf", descriptor = "I")
	private static int anInt323;

	@OriginalMember(owner = "client!client", name = "zf", descriptor = "I")
	private static int anInt326;

	@OriginalMember(owner = "client!client", name = "Af", descriptor = "I")
	private static int anInt327;

	@OriginalMember(owner = "client!client", name = "Jg", descriptor = "I")
	private static int anInt351;

	@OriginalMember(owner = "client!client", name = "bh", descriptor = "I")
	private static int anInt358;

	@OriginalMember(owner = "client!client", name = "jh", descriptor = "I")
	public static int anInt363;

	@OriginalMember(owner = "client!client", name = "lh", descriptor = "Z")
	private static boolean aBoolean72;

	@OriginalMember(owner = "client!client", name = "nh", descriptor = "I")
	private static int anInt364;

	@OriginalMember(owner = "client!client", name = "Hh", descriptor = "Z")
	private static boolean aBoolean74;

	@OriginalMember(owner = "client!client", name = "Ai", descriptor = "I")
	private static int anInt386;

	@OriginalMember(owner = "client!client", name = "bj", descriptor = "I")
	private static int anInt405;

	@OriginalMember(owner = "client!client", name = "Nb", descriptor = "Ljava/math/BigInteger;")
	private static BigInteger aBigInteger1 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");

	@OriginalMember(owner = "client!client", name = "Ob", descriptor = "Z")
	private static boolean aBoolean49 = true;

	@OriginalMember(owner = "client!client", name = "Yc", descriptor = "Ljava/lang/String;")
	private static String aString5 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";

	@OriginalMember(owner = "client!client", name = "Cd", descriptor = "I")
	private static int anInt268 = 243;

	@OriginalMember(owner = "client!client", name = "Cf", descriptor = "I")
	private static int anInt329 = -1127;

	@OriginalMember(owner = "client!client", name = "tg", descriptor = "[I")
	private static int[] anIntArray63 = new int[99];

	@OriginalMember(owner = "client!client", name = "Hg", descriptor = "[I")
	public static int[] anIntArray67;

	@OriginalMember(owner = "client!client", name = "Ug", descriptor = "Ljava/math/BigInteger;")
	private static BigInteger aBigInteger2;

	@OriginalMember(owner = "client!client", name = "ih", descriptor = "I")
	private static int anInt362;

	@OriginalMember(owner = "client!client", name = "kh", descriptor = "Z")
	private static boolean aBoolean71;

	@OriginalMember(owner = "client!client", name = "ai", descriptor = "[[I")
	public static final int[][] anIntArrayArray5;

	@OriginalMember(owner = "client!client", name = "Aj", descriptor = "[I")
	public static final int[] anIntArray91;

	@OriginalMember(owner = "client!client", name = "O", descriptor = "Lclient!qb;")
	private Class35 aClass35_3;

	@OriginalMember(owner = "client!client", name = "P", descriptor = "Lclient!qb;")
	private Class35 aClass35_4;

	@OriginalMember(owner = "client!client", name = "Q", descriptor = "Lclient!qb;")
	private Class35 aClass35_5;

	@OriginalMember(owner = "client!client", name = "R", descriptor = "Lclient!qb;")
	private Class35 aClass35_6;

	@OriginalMember(owner = "client!client", name = "S", descriptor = "Lclient!qb;")
	private Class35 aClass35_7;

	@OriginalMember(owner = "client!client", name = "T", descriptor = "Lclient!qb;")
	private Class35 aClass35_8;

	@OriginalMember(owner = "client!client", name = "U", descriptor = "Lclient!qb;")
	private Class35 aClass35_9;

	@OriginalMember(owner = "client!client", name = "V", descriptor = "Lclient!qb;")
	private Class35 aClass35_10;

	@OriginalMember(owner = "client!client", name = "W", descriptor = "Lclient!qb;")
	private Class35 aClass35_11;

	@OriginalMember(owner = "client!client", name = "bb", descriptor = "I")
	private int anInt206;

	@OriginalMember(owner = "client!client", name = "hb", descriptor = "I")
	private int anInt207;

	@OriginalMember(owner = "client!client", name = "kb", descriptor = "Lclient!jb;")
	private Class1_Sub1_Sub2_Sub3 aClass1_Sub1_Sub2_Sub3_1;

	@OriginalMember(owner = "client!client", name = "lb", descriptor = "Lclient!jb;")
	private Class1_Sub1_Sub2_Sub3 aClass1_Sub1_Sub2_Sub3_2;

	@OriginalMember(owner = "client!client", name = "mb", descriptor = "Lclient!jb;")
	private Class1_Sub1_Sub2_Sub3 aClass1_Sub1_Sub2_Sub3_3;

	@OriginalMember(owner = "client!client", name = "nb", descriptor = "Lclient!jb;")
	private Class1_Sub1_Sub2_Sub3 aClass1_Sub1_Sub2_Sub3_4;

	@OriginalMember(owner = "client!client", name = "ob", descriptor = "Lclient!jb;")
	private Class1_Sub1_Sub2_Sub3 aClass1_Sub1_Sub2_Sub3_5;

	@OriginalMember(owner = "client!client", name = "pb", descriptor = "I")
	private int anInt209;

	@OriginalMember(owner = "client!client", name = "qb", descriptor = "I")
	private int anInt210;

	@OriginalMember(owner = "client!client", name = "rb", descriptor = "I")
	private int anInt211;

	@OriginalMember(owner = "client!client", name = "vb", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray5;

	@OriginalMember(owner = "client!client", name = "Ab", descriptor = "[I")
	private int[] anIntArray39;

	@OriginalMember(owner = "client!client", name = "Bb", descriptor = "[I")
	private int[] anIntArray40;

	@OriginalMember(owner = "client!client", name = "Cb", descriptor = "[I")
	private int[] anIntArray41;

	@OriginalMember(owner = "client!client", name = "Db", descriptor = "I")
	private int anInt216;

	@OriginalMember(owner = "client!client", name = "Eb", descriptor = "J")
	private long aLong14;

	@OriginalMember(owner = "client!client", name = "Hb", descriptor = "I")
	private int anInt217;

	@OriginalMember(owner = "client!client", name = "Ib", descriptor = "I")
	private int anInt218;

	@OriginalMember(owner = "client!client", name = "Jb", descriptor = "Lclient!ib;")
	private Class1_Sub1_Sub2_Sub2 aClass1_Sub1_Sub2_Sub2_1;

	@OriginalMember(owner = "client!client", name = "Kb", descriptor = "Lclient!ib;")
	private Class1_Sub1_Sub2_Sub2 aClass1_Sub1_Sub2_Sub2_2;

	@OriginalMember(owner = "client!client", name = "Mb", descriptor = "Lclient!ub;")
	private Class44_Sub1 aClass44_Sub1_1;

	@OriginalMember(owner = "client!client", name = "Pb", descriptor = "I")
	private int anInt220;

	@OriginalMember(owner = "client!client", name = "Sb", descriptor = "I")
	private int anInt222;

	@OriginalMember(owner = "client!client", name = "Wb", descriptor = "I")
	private int anInt224;

	@OriginalMember(owner = "client!client", name = "Xb", descriptor = "Ljava/net/Socket;")
	private Socket aSocket1;

	@OriginalMember(owner = "client!client", name = "Yb", descriptor = "I")
	private int anInt225;

	@OriginalMember(owner = "client!client", name = "cc", descriptor = "I")
	private int anInt227;

	@OriginalMember(owner = "client!client", name = "fc", descriptor = "I")
	private int anInt229;

	@OriginalMember(owner = "client!client", name = "hc", descriptor = "I")
	private int anInt231;

	@OriginalMember(owner = "client!client", name = "ic", descriptor = "I")
	private int anInt232;

	@OriginalMember(owner = "client!client", name = "kc", descriptor = "I")
	private int anInt233;

	@OriginalMember(owner = "client!client", name = "lc", descriptor = "I")
	private int anInt234;

	@OriginalMember(owner = "client!client", name = "qc", descriptor = "I")
	private int anInt235;

	@OriginalMember(owner = "client!client", name = "rc", descriptor = "I")
	private int anInt236;

	@OriginalMember(owner = "client!client", name = "sc", descriptor = "I")
	private int anInt237;

	@OriginalMember(owner = "client!client", name = "tc", descriptor = "I")
	private int anInt238;

	@OriginalMember(owner = "client!client", name = "uc", descriptor = "I")
	private int anInt239;

	@OriginalMember(owner = "client!client", name = "vc", descriptor = "I")
	private int anInt240;

	@OriginalMember(owner = "client!client", name = "wc", descriptor = "Lclient!jb;")
	private Class1_Sub1_Sub2_Sub3 aClass1_Sub1_Sub2_Sub3_6;

	@OriginalMember(owner = "client!client", name = "xc", descriptor = "Lclient!jb;")
	private Class1_Sub1_Sub2_Sub3 aClass1_Sub1_Sub2_Sub3_7;

	@OriginalMember(owner = "client!client", name = "yc", descriptor = "Lclient!jb;")
	private Class1_Sub1_Sub2_Sub3 aClass1_Sub1_Sub2_Sub3_8;

	@OriginalMember(owner = "client!client", name = "zc", descriptor = "Lclient!jb;")
	private Class1_Sub1_Sub2_Sub3 aClass1_Sub1_Sub2_Sub3_9;

	@OriginalMember(owner = "client!client", name = "Ac", descriptor = "Lclient!jb;")
	private Class1_Sub1_Sub2_Sub3 aClass1_Sub1_Sub2_Sub3_10;

	@OriginalMember(owner = "client!client", name = "Jc", descriptor = "[I")
	private int[] anIntArray45;

	@OriginalMember(owner = "client!client", name = "Kc", descriptor = "[I")
	private int[] anIntArray46;

	@OriginalMember(owner = "client!client", name = "Lc", descriptor = "[I")
	private int[] anIntArray47;

	@OriginalMember(owner = "client!client", name = "Mc", descriptor = "[I")
	private int[] anIntArray48;

	@OriginalMember(owner = "client!client", name = "Nc", descriptor = "[I")
	private int[] anIntArray49;

	@OriginalMember(owner = "client!client", name = "Oc", descriptor = "I")
	private int anInt244;

	@OriginalMember(owner = "client!client", name = "Pc", descriptor = "I")
	private int anInt245;

	@OriginalMember(owner = "client!client", name = "Qc", descriptor = "I")
	private int anInt246;

	@OriginalMember(owner = "client!client", name = "Rc", descriptor = "I")
	private int anInt247;

	@OriginalMember(owner = "client!client", name = "Sc", descriptor = "I")
	private int anInt248;

	@OriginalMember(owner = "client!client", name = "Tc", descriptor = "I")
	private int anInt249;

	@OriginalMember(owner = "client!client", name = "Uc", descriptor = "[Lclient!jb;")
	private Class1_Sub1_Sub2_Sub3[] aClass1_Sub1_Sub2_Sub3Array2;

	@OriginalMember(owner = "client!client", name = "Wc", descriptor = "I")
	private int anInt250;

	@OriginalMember(owner = "client!client", name = "Zc", descriptor = "I")
	private int anInt251;

	@OriginalMember(owner = "client!client", name = "ad", descriptor = "I")
	private int anInt252;

	@OriginalMember(owner = "client!client", name = "bd", descriptor = "I")
	private int anInt253;

	@OriginalMember(owner = "client!client", name = "cd", descriptor = "I")
	private int anInt254;

	@OriginalMember(owner = "client!client", name = "dd", descriptor = "I")
	private int anInt255;

	@OriginalMember(owner = "client!client", name = "fd", descriptor = "Ljava/lang/String;")
	private String aString6;

	@OriginalMember(owner = "client!client", name = "gd", descriptor = "I")
	private int anInt257;

	@OriginalMember(owner = "client!client", name = "hd", descriptor = "I")
	private int anInt258;

	@OriginalMember(owner = "client!client", name = "id", descriptor = "I")
	private int anInt259;

	@OriginalMember(owner = "client!client", name = "od", descriptor = "I")
	private int anInt262;

	@OriginalMember(owner = "client!client", name = "pd", descriptor = "I")
	private int anInt263;

	@OriginalMember(owner = "client!client", name = "qd", descriptor = "I")
	private int anInt264;

	@OriginalMember(owner = "client!client", name = "td", descriptor = "Lclient!ib;")
	private Class1_Sub1_Sub2_Sub2 aClass1_Sub1_Sub2_Sub2_3;

	@OriginalMember(owner = "client!client", name = "ud", descriptor = "Lclient!ib;")
	private Class1_Sub1_Sub2_Sub2 aClass1_Sub1_Sub2_Sub2_4;

	@OriginalMember(owner = "client!client", name = "yd", descriptor = "I")
	private int anInt266;

	@OriginalMember(owner = "client!client", name = "zd", descriptor = "I")
	private int anInt267;

	@OriginalMember(owner = "client!client", name = "Fd", descriptor = "I")
	private int anInt270;

	@OriginalMember(owner = "client!client", name = "Hd", descriptor = "Lclient!ib;")
	private Class1_Sub1_Sub2_Sub2 aClass1_Sub1_Sub2_Sub2_5;

	@OriginalMember(owner = "client!client", name = "Md", descriptor = "Lclient!e;")
	private Class8 aClass8_1;

	@OriginalMember(owner = "client!client", name = "Rd", descriptor = "[[B")
	private byte[][] aByteArrayArray1;

	@OriginalMember(owner = "client!client", name = "Ud", descriptor = "Lclient!fc;")
	private Class11 aClass11_1;

	@OriginalMember(owner = "client!client", name = "Wd", descriptor = "Lclient!kb;")
	private Class1_Sub1_Sub2_Sub4 aClass1_Sub1_Sub2_Sub4_1;

	@OriginalMember(owner = "client!client", name = "Xd", descriptor = "Lclient!kb;")
	private Class1_Sub1_Sub2_Sub4 aClass1_Sub1_Sub2_Sub4_2;

	@OriginalMember(owner = "client!client", name = "Yd", descriptor = "Lclient!kb;")
	private Class1_Sub1_Sub2_Sub4 aClass1_Sub1_Sub2_Sub4_3;

	@OriginalMember(owner = "client!client", name = "Zd", descriptor = "Lclient!kb;")
	private Class1_Sub1_Sub2_Sub4 aClass1_Sub1_Sub2_Sub4_4;

	@OriginalMember(owner = "client!client", name = "ge", descriptor = "I")
	private int anInt278;

	@OriginalMember(owner = "client!client", name = "ie", descriptor = "I")
	private int anInt280;

	@OriginalMember(owner = "client!client", name = "je", descriptor = "I")
	private int anInt281;

	@OriginalMember(owner = "client!client", name = "ke", descriptor = "I")
	private int anInt282;

	@OriginalMember(owner = "client!client", name = "le", descriptor = "Lclient!ib;")
	private Class1_Sub1_Sub2_Sub2 aClass1_Sub1_Sub2_Sub2_6;

	@OriginalMember(owner = "client!client", name = "ne", descriptor = "I")
	private int anInt284;

	@OriginalMember(owner = "client!client", name = "oe", descriptor = "I")
	private int anInt285;

	@OriginalMember(owner = "client!client", name = "qe", descriptor = "I")
	private int anInt286;

	@OriginalMember(owner = "client!client", name = "re", descriptor = "I")
	private int anInt287;

	@OriginalMember(owner = "client!client", name = "te", descriptor = "Lclient!ib;")
	private Class1_Sub1_Sub2_Sub2 aClass1_Sub1_Sub2_Sub2_7;

	@OriginalMember(owner = "client!client", name = "ue", descriptor = "Lclient!ib;")
	private Class1_Sub1_Sub2_Sub2 aClass1_Sub1_Sub2_Sub2_8;

	@OriginalMember(owner = "client!client", name = "ve", descriptor = "Lclient!ib;")
	private Class1_Sub1_Sub2_Sub2 aClass1_Sub1_Sub2_Sub2_9;

	@OriginalMember(owner = "client!client", name = "we", descriptor = "Lclient!ib;")
	private Class1_Sub1_Sub2_Sub2 aClass1_Sub1_Sub2_Sub2_10;

	@OriginalMember(owner = "client!client", name = "xe", descriptor = "Lclient!ib;")
	private Class1_Sub1_Sub2_Sub2 aClass1_Sub1_Sub2_Sub2_11;

	@OriginalMember(owner = "client!client", name = "ye", descriptor = "I")
	private int anInt289;

	@OriginalMember(owner = "client!client", name = "ze", descriptor = "I")
	private int anInt290;

	@OriginalMember(owner = "client!client", name = "Ae", descriptor = "I")
	private int anInt291;

	@OriginalMember(owner = "client!client", name = "Be", descriptor = "I")
	private int anInt292;

	@OriginalMember(owner = "client!client", name = "Ce", descriptor = "I")
	private int anInt293;

	@OriginalMember(owner = "client!client", name = "Ee", descriptor = "I")
	private int anInt294;

	@OriginalMember(owner = "client!client", name = "Ge", descriptor = "Lclient!wb;")
	private Class46 aClass46_1;

	@OriginalMember(owner = "client!client", name = "Ie", descriptor = "I")
	private int anInt295;

	@OriginalMember(owner = "client!client", name = "Ke", descriptor = "I")
	private int anInt296;

	@OriginalMember(owner = "client!client", name = "Le", descriptor = "I")
	private int anInt297;

	@OriginalMember(owner = "client!client", name = "Me", descriptor = "I")
	private int anInt298;

	@OriginalMember(owner = "client!client", name = "Ne", descriptor = "I")
	private int anInt299;

	@OriginalMember(owner = "client!client", name = "Oe", descriptor = "I")
	private int anInt300;

	@OriginalMember(owner = "client!client", name = "Pe", descriptor = "I")
	private int anInt301;

	@OriginalMember(owner = "client!client", name = "Qe", descriptor = "I")
	private int anInt302;

	@OriginalMember(owner = "client!client", name = "Re", descriptor = "I")
	private int anInt303;

	@OriginalMember(owner = "client!client", name = "Se", descriptor = "I")
	private int anInt304;

	@OriginalMember(owner = "client!client", name = "Te", descriptor = "Ljava/lang/String;")
	private String aString8;

	@OriginalMember(owner = "client!client", name = "Ue", descriptor = "I")
	private int anInt305;

	@OriginalMember(owner = "client!client", name = "Ve", descriptor = "[[B")
	private byte[][] aByteArrayArray2;

	@OriginalMember(owner = "client!client", name = "We", descriptor = "I")
	private int anInt306;

	@OriginalMember(owner = "client!client", name = "Xe", descriptor = "I")
	private int anInt307;

	@OriginalMember(owner = "client!client", name = "Ye", descriptor = "I")
	private int anInt308;

	@OriginalMember(owner = "client!client", name = "Ze", descriptor = "I")
	private int anInt309;

	@OriginalMember(owner = "client!client", name = "af", descriptor = "I")
	private int anInt310;

	@OriginalMember(owner = "client!client", name = "bf", descriptor = "I")
	private int anInt311;

	@OriginalMember(owner = "client!client", name = "ef", descriptor = "I")
	private int anInt314;

	@OriginalMember(owner = "client!client", name = "gf", descriptor = "I")
	private int anInt316;

	@OriginalMember(owner = "client!client", name = "hf", descriptor = "I")
	private int anInt317;

	@OriginalMember(owner = "client!client", name = "jf", descriptor = "I")
	private int anInt318;

	@OriginalMember(owner = "client!client", name = "lf", descriptor = "I")
	private int anInt319;

	@OriginalMember(owner = "client!client", name = "mf", descriptor = "I")
	private int anInt320;

	@OriginalMember(owner = "client!client", name = "nf", descriptor = "I")
	private int anInt321;

	@OriginalMember(owner = "client!client", name = "qf", descriptor = "Lclient!qb;")
	private Class35 aClass35_12;

	@OriginalMember(owner = "client!client", name = "rf", descriptor = "Lclient!qb;")
	private Class35 aClass35_13;

	@OriginalMember(owner = "client!client", name = "sf", descriptor = "Lclient!qb;")
	private Class35 aClass35_14;

	@OriginalMember(owner = "client!client", name = "tf", descriptor = "Lclient!qb;")
	private Class35 aClass35_15;

	@OriginalMember(owner = "client!client", name = "uf", descriptor = "J")
	private long aLong15;

	@OriginalMember(owner = "client!client", name = "vf", descriptor = "I")
	private int anInt324;

	@OriginalMember(owner = "client!client", name = "xf", descriptor = "Lclient!jb;")
	private Class1_Sub1_Sub2_Sub3 aClass1_Sub1_Sub2_Sub3_11;

	@OriginalMember(owner = "client!client", name = "yf", descriptor = "Lclient!jb;")
	private Class1_Sub1_Sub2_Sub3 aClass1_Sub1_Sub2_Sub3_12;

	@OriginalMember(owner = "client!client", name = "Bf", descriptor = "I")
	private int anInt328;

	@OriginalMember(owner = "client!client", name = "Ff", descriptor = "I")
	private int anInt330;

	@OriginalMember(owner = "client!client", name = "Gf", descriptor = "I")
	private int anInt331;

	@OriginalMember(owner = "client!client", name = "Hf", descriptor = "I")
	private int anInt332;

	@OriginalMember(owner = "client!client", name = "If", descriptor = "I")
	private int anInt333;

	@OriginalMember(owner = "client!client", name = "Jf", descriptor = "I")
	private int anInt334;

	@OriginalMember(owner = "client!client", name = "Of", descriptor = "I")
	private int anInt335;

	@OriginalMember(owner = "client!client", name = "Qf", descriptor = "Lclient!qb;")
	private Class35 aClass35_16;

	@OriginalMember(owner = "client!client", name = "Rf", descriptor = "Lclient!qb;")
	private Class35 aClass35_17;

	@OriginalMember(owner = "client!client", name = "Sf", descriptor = "Lclient!qb;")
	private Class35 aClass35_18;

	@OriginalMember(owner = "client!client", name = "Tf", descriptor = "Lclient!qb;")
	private Class35 aClass35_19;

	@OriginalMember(owner = "client!client", name = "Uf", descriptor = "Lclient!qb;")
	private Class35 aClass35_20;

	@OriginalMember(owner = "client!client", name = "Vf", descriptor = "Lclient!qb;")
	private Class35 aClass35_21;

	@OriginalMember(owner = "client!client", name = "Wf", descriptor = "Lclient!qb;")
	private Class35 aClass35_22;

	@OriginalMember(owner = "client!client", name = "Xf", descriptor = "Lclient!qb;")
	private Class35 aClass35_23;

	@OriginalMember(owner = "client!client", name = "Yf", descriptor = "Lclient!qb;")
	private Class35 aClass35_24;

	@OriginalMember(owner = "client!client", name = "Zf", descriptor = "I")
	private int anInt337;

	@OriginalMember(owner = "client!client", name = "ag", descriptor = "I")
	private int anInt338;

	@OriginalMember(owner = "client!client", name = "cg", descriptor = "I")
	private int anInt339;

	@OriginalMember(owner = "client!client", name = "dg", descriptor = "Lclient!jb;")
	private Class1_Sub1_Sub2_Sub3 aClass1_Sub1_Sub2_Sub3_13;

	@OriginalMember(owner = "client!client", name = "eg", descriptor = "Lclient!jb;")
	private Class1_Sub1_Sub2_Sub3 aClass1_Sub1_Sub2_Sub3_14;

	@OriginalMember(owner = "client!client", name = "kg", descriptor = "I")
	private int anInt342;

	@OriginalMember(owner = "client!client", name = "lg", descriptor = "I")
	private int anInt343;

	@OriginalMember(owner = "client!client", name = "mg", descriptor = "I")
	private int anInt344;

	@OriginalMember(owner = "client!client", name = "ng", descriptor = "I")
	private int anInt345;

	@OriginalMember(owner = "client!client", name = "og", descriptor = "I")
	private int anInt346;

	@OriginalMember(owner = "client!client", name = "qg", descriptor = "I")
	private int anInt347;

	@OriginalMember(owner = "client!client", name = "rg", descriptor = "Lclient!ib;")
	private Class1_Sub1_Sub2_Sub2 aClass1_Sub1_Sub2_Sub2_12;

	@OriginalMember(owner = "client!client", name = "sg", descriptor = "Lclient!ib;")
	private Class1_Sub1_Sub2_Sub2 aClass1_Sub1_Sub2_Sub2_13;

	@OriginalMember(owner = "client!client", name = "ug", descriptor = "[I")
	private int[] anIntArray64;

	@OriginalMember(owner = "client!client", name = "vg", descriptor = "[I")
	private int[] anIntArray65;

	@OriginalMember(owner = "client!client", name = "zg", descriptor = "I")
	private int anInt348;

	@OriginalMember(owner = "client!client", name = "Ag", descriptor = "I")
	private int anInt349;

	@OriginalMember(owner = "client!client", name = "Cg", descriptor = "Lclient!jb;")
	private Class1_Sub1_Sub2_Sub3 aClass1_Sub1_Sub2_Sub3_15;

	@OriginalMember(owner = "client!client", name = "Dg", descriptor = "Lclient!jb;")
	private Class1_Sub1_Sub2_Sub3 aClass1_Sub1_Sub2_Sub3_16;

	@OriginalMember(owner = "client!client", name = "Eg", descriptor = "Lclient!jb;")
	private Class1_Sub1_Sub2_Sub3 aClass1_Sub1_Sub2_Sub3_17;

	@OriginalMember(owner = "client!client", name = "Fg", descriptor = "Ljava/lang/String;")
	private String aString9;

	@OriginalMember(owner = "client!client", name = "Gg", descriptor = "I")
	private int anInt350;

	@OriginalMember(owner = "client!client", name = "Kg", descriptor = "I")
	private int anInt352;

	@OriginalMember(owner = "client!client", name = "Lg", descriptor = "I")
	private int anInt353;

	@OriginalMember(owner = "client!client", name = "Og", descriptor = "I")
	private int anInt354;

	@OriginalMember(owner = "client!client", name = "Pg", descriptor = "I")
	private int anInt355;

	@OriginalMember(owner = "client!client", name = "Tg", descriptor = "I")
	private int anInt357;

	@OriginalMember(owner = "client!client", name = "Yg", descriptor = "Lclient!qb;")
	private Class35 aClass35_25;

	@OriginalMember(owner = "client!client", name = "Zg", descriptor = "Lclient!qb;")
	private Class35 aClass35_26;

	@OriginalMember(owner = "client!client", name = "ah", descriptor = "Lclient!qb;")
	private Class35 aClass35_27;

	@OriginalMember(owner = "client!client", name = "eh", descriptor = "I")
	private int anInt360;

	@OriginalMember(owner = "client!client", name = "hh", descriptor = "I")
	private int anInt361;

	@OriginalMember(owner = "client!client", name = "oh", descriptor = "J")
	private long aLong16;

	@OriginalMember(owner = "client!client", name = "qh", descriptor = "I")
	private int anInt366;

	@OriginalMember(owner = "client!client", name = "Ah", descriptor = "[I")
	private int[] anIntArray79;

	@OriginalMember(owner = "client!client", name = "Bh", descriptor = "[I")
	private int[] anIntArray80;

	@OriginalMember(owner = "client!client", name = "Ch", descriptor = "[I")
	private int[] anIntArray81;

	@OriginalMember(owner = "client!client", name = "Dh", descriptor = "[I")
	private int[] anIntArray82;

	@OriginalMember(owner = "client!client", name = "Fh", descriptor = "Lclient!xb;")
	private Class47 aClass47_1;

	@OriginalMember(owner = "client!client", name = "Gh", descriptor = "I")
	private int anInt368;

	@OriginalMember(owner = "client!client", name = "Kh", descriptor = "I")
	private int anInt370;

	@OriginalMember(owner = "client!client", name = "Oh", descriptor = "I")
	private int anInt372;

	@OriginalMember(owner = "client!client", name = "Ph", descriptor = "I")
	private int anInt373;

	@OriginalMember(owner = "client!client", name = "Sh", descriptor = "J")
	private long aLong17;

	@OriginalMember(owner = "client!client", name = "Uh", descriptor = "Lclient!jb;")
	private Class1_Sub1_Sub2_Sub3 aClass1_Sub1_Sub2_Sub3_18;

	@OriginalMember(owner = "client!client", name = "Vh", descriptor = "Lclient!jb;")
	private Class1_Sub1_Sub2_Sub3 aClass1_Sub1_Sub2_Sub3_19;

	@OriginalMember(owner = "client!client", name = "Wh", descriptor = "Lclient!jb;")
	private Class1_Sub1_Sub2_Sub3 aClass1_Sub1_Sub2_Sub3_20;

	@OriginalMember(owner = "client!client", name = "ci", descriptor = "I")
	private int anInt376;

	@OriginalMember(owner = "client!client", name = "hi", descriptor = "I")
	private int anInt377;

	@OriginalMember(owner = "client!client", name = "ki", descriptor = "I")
	private int anInt378;

	@OriginalMember(owner = "client!client", name = "ri", descriptor = "I")
	private int anInt381;

	@OriginalMember(owner = "client!client", name = "si", descriptor = "I")
	private int anInt382;

	@OriginalMember(owner = "client!client", name = "ti", descriptor = "I")
	private int anInt383;

	@OriginalMember(owner = "client!client", name = "ui", descriptor = "I")
	private int anInt384;

	@OriginalMember(owner = "client!client", name = "xi", descriptor = "Lclient!r;")
	private Class37 aClass37_1;

	@OriginalMember(owner = "client!client", name = "Fi", descriptor = "I")
	private int anInt389;

	@OriginalMember(owner = "client!client", name = "Hi", descriptor = "I")
	private int anInt390;

	@OriginalMember(owner = "client!client", name = "Mi", descriptor = "I")
	private int anInt392;

	@OriginalMember(owner = "client!client", name = "Ni", descriptor = "I")
	private int anInt393;

	@OriginalMember(owner = "client!client", name = "Oi", descriptor = "I")
	private int anInt394;

	@OriginalMember(owner = "client!client", name = "Pi", descriptor = "I")
	private int anInt395;

	@OriginalMember(owner = "client!client", name = "Ri", descriptor = "I")
	private int anInt397;

	@OriginalMember(owner = "client!client", name = "Si", descriptor = "I")
	private int anInt398;

	@OriginalMember(owner = "client!client", name = "Ti", descriptor = "I")
	private int anInt399;

	@OriginalMember(owner = "client!client", name = "Ui", descriptor = "I")
	private int anInt400;

	@OriginalMember(owner = "client!client", name = "Vi", descriptor = "I")
	private int anInt401;

	@OriginalMember(owner = "client!client", name = "aj", descriptor = "I")
	private int anInt404;

	@OriginalMember(owner = "client!client", name = "cj", descriptor = "I")
	private int anInt406;

	@OriginalMember(owner = "client!client", name = "dj", descriptor = "I")
	private int anInt407;

	@OriginalMember(owner = "client!client", name = "ej", descriptor = "I")
	private int anInt408;

	@OriginalMember(owner = "client!client", name = "fj", descriptor = "Ljava/lang/String;")
	private String aString15;

	@OriginalMember(owner = "client!client", name = "gj", descriptor = "I")
	private int anInt409;

	@OriginalMember(owner = "client!client", name = "hj", descriptor = "I")
	private int anInt410;

	@OriginalMember(owner = "client!client", name = "ij", descriptor = "I")
	private int anInt411;

	@OriginalMember(owner = "client!client", name = "kj", descriptor = "I")
	private int anInt412;

	@OriginalMember(owner = "client!client", name = "nj", descriptor = "I")
	private int anInt413;

	@OriginalMember(owner = "client!client", name = "pj", descriptor = "[[[B")
	private byte[][][] aByteArrayArrayArray7;

	@OriginalMember(owner = "client!client", name = "rj", descriptor = "Lclient!ib;")
	private Class1_Sub1_Sub2_Sub2 aClass1_Sub1_Sub2_Sub2_14;

	@OriginalMember(owner = "client!client", name = "uj", descriptor = "I")
	private int anInt416;

	@OriginalMember(owner = "client!client", name = "Gj", descriptor = "I")
	private int anInt420;

	@OriginalMember(owner = "client!client", name = "Jj", descriptor = "I")
	private int anInt421;

	@OriginalMember(owner = "client!client", name = "Kj", descriptor = "I")
	private int anInt422;

	@OriginalMember(owner = "client!client", name = "Mj", descriptor = "J")
	private long aLong18;

	@OriginalMember(owner = "client!client", name = "Nj", descriptor = "I")
	private int anInt424;

	@OriginalMember(owner = "client!client", name = "M", descriptor = "I")
	private int anInt203 = -1;

	@OriginalMember(owner = "client!client", name = "N", descriptor = "I")
	private int anInt204 = -715;

	@OriginalMember(owner = "client!client", name = "X", descriptor = "[I")
	private final int[] anIntArray32 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

	@OriginalMember(owner = "client!client", name = "Y", descriptor = "I")
	private int anInt205 = -1;

	@OriginalMember(owner = "client!client", name = "Z", descriptor = "[I")
	public int[] anIntArray33 = new int[2000];

	@OriginalMember(owner = "client!client", name = "ab", descriptor = "Z")
	private boolean aBoolean46 = false;

	@OriginalMember(owner = "client!client", name = "cb", descriptor = "[Lclient!ib;")
	private Class1_Sub1_Sub2_Sub2[] aClass1_Sub1_Sub2_Sub2Array3 = new Class1_Sub1_Sub2_Sub2[100];

	@OriginalMember(owner = "client!client", name = "db", descriptor = "[I")
	private int[] anIntArray34 = new int[500];

	@OriginalMember(owner = "client!client", name = "eb", descriptor = "[I")
	private int[] anIntArray35 = new int[500];

	@OriginalMember(owner = "client!client", name = "fb", descriptor = "[I")
	private int[] anIntArray36 = new int[500];

	@OriginalMember(owner = "client!client", name = "gb", descriptor = "[I")
	private int[] anIntArray37 = new int[500];

	@OriginalMember(owner = "client!client", name = "ib", descriptor = "I")
	private int anInt208 = -276;

	@OriginalMember(owner = "client!client", name = "jb", descriptor = "[Lclient!jb;")
	private Class1_Sub1_Sub2_Sub3[] aClass1_Sub1_Sub2_Sub3Array1 = new Class1_Sub1_Sub2_Sub3[2];

	@OriginalMember(owner = "client!client", name = "sb", descriptor = "I")
	private int anInt212 = 78;

	@OriginalMember(owner = "client!client", name = "tb", descriptor = "[I")
	private int[] anIntArray38 = new int[151];

	@OriginalMember(owner = "client!client", name = "wb", descriptor = "I")
	private int anInt214 = 6;

	@OriginalMember(owner = "client!client", name = "xb", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray6 = new int[4][13][13];

	@OriginalMember(owner = "client!client", name = "zb", descriptor = "Z")
	private boolean aBoolean47 = false;

	@OriginalMember(owner = "client!client", name = "Fb", descriptor = "Lclient!lb;")
	private Class1_Sub1_Sub3 aClass1_Sub1_Sub3_2 = Class1_Sub1_Sub3.method468();

	@OriginalMember(owner = "client!client", name = "Gb", descriptor = "Z")
	private boolean aBoolean48 = false;

	@OriginalMember(owner = "client!client", name = "Lb", descriptor = "I")
	private int anInt219 = -825;

	@OriginalMember(owner = "client!client", name = "Qb", descriptor = "I")
	private int anInt221 = 1;

	@OriginalMember(owner = "client!client", name = "Rb", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray1 = new String[200];

	@OriginalMember(owner = "client!client", name = "Tb", descriptor = "[I")
	private int[] anIntArray42 = new int[50];

	@OriginalMember(owner = "client!client", name = "Ub", descriptor = "[I")
	private int[] anIntArray43 = new int[Class30.anInt808];

	@OriginalMember(owner = "client!client", name = "Zb", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray2 = new String[5];

	@OriginalMember(owner = "client!client", name = "ac", descriptor = "[Z")
	private boolean[] aBooleanArray3 = new boolean[5];

	@OriginalMember(owner = "client!client", name = "bc", descriptor = "I")
	private int anInt226 = 5063219;

	@OriginalMember(owner = "client!client", name = "dc", descriptor = "I")
	private int anInt228 = 2;

	@OriginalMember(owner = "client!client", name = "ec", descriptor = "[Lclient!vb;")
	public Class45[] aClass45Array1 = new Class45[5];

	@OriginalMember(owner = "client!client", name = "gc", descriptor = "I")
	private int anInt230 = 3353893;

	@OriginalMember(owner = "client!client", name = "jc", descriptor = "Z")
	private boolean aBoolean50 = false;

	@OriginalMember(owner = "client!client", name = "mc", descriptor = "Z")
	private boolean aBoolean51 = false;

	@OriginalMember(owner = "client!client", name = "nc", descriptor = "[[I")
	private int[][] anIntArrayArray3 = new int[104][104];

	@OriginalMember(owner = "client!client", name = "oc", descriptor = "[[[Lclient!ob;")
	private Class29[][][] aClass29ArrayArrayArray1 = new Class29[4][104][104];

	@OriginalMember(owner = "client!client", name = "pc", descriptor = "[J")
	private long[] aLongArray3 = new long[200];

	@OriginalMember(owner = "client!client", name = "Bc", descriptor = "I")
	private int anInt241 = 8;

	@OriginalMember(owner = "client!client", name = "Cc", descriptor = "Z")
	private boolean aBoolean52 = true;

	@OriginalMember(owner = "client!client", name = "Ec", descriptor = "I")
	private int anInt243 = -398;

	@OriginalMember(owner = "client!client", name = "Fc", descriptor = "[I")
	private int[] anIntArray44 = new int[50];

	@OriginalMember(owner = "client!client", name = "Gc", descriptor = "Z")
	private boolean aBoolean53 = false;

	@OriginalMember(owner = "client!client", name = "Hc", descriptor = "Ljava/lang/String;")
	private String aString4 = "";

	@OriginalMember(owner = "client!client", name = "Ic", descriptor = "[Lclient!jc;")
	private Class19[] aClass19Array1 = new Class19[4];

	@OriginalMember(owner = "client!client", name = "Vc", descriptor = "Z")
	private boolean aBoolean54 = false;

	@OriginalMember(owner = "client!client", name = "Xc", descriptor = "Z")
	private boolean aBoolean55 = false;

	@OriginalMember(owner = "client!client", name = "ed", descriptor = "I")
	private int anInt256 = -1;

	@OriginalMember(owner = "client!client", name = "jd", descriptor = "Lclient!d;")
	private Class6 aClass6_1 = new Class6();

	@OriginalMember(owner = "client!client", name = "kd", descriptor = "Ljava/util/zip/CRC32;")
	private CRC32 aCRC32_1 = new CRC32();

	@OriginalMember(owner = "client!client", name = "ld", descriptor = "[I")
	private int[] anIntArray50 = new int[9];

	@OriginalMember(owner = "client!client", name = "md", descriptor = "I")
	private int anInt260 = -1;

	@OriginalMember(owner = "client!client", name = "nd", descriptor = "I")
	private int anInt261 = -1;

	@OriginalMember(owner = "client!client", name = "rd", descriptor = "Z")
	private boolean aBoolean56 = false;

	@OriginalMember(owner = "client!client", name = "vd", descriptor = "Z")
	private boolean aBoolean57 = false;

	@OriginalMember(owner = "client!client", name = "wd", descriptor = "Z")
	private boolean aBoolean58 = false;

	@OriginalMember(owner = "client!client", name = "xd", descriptor = "Z")
	private boolean aBoolean59 = false;

	@OriginalMember(owner = "client!client", name = "Ad", descriptor = "[I")
	private int[] anIntArray51 = new int[1000];

	@OriginalMember(owner = "client!client", name = "Bd", descriptor = "[I")
	private int[] anIntArray52 = new int[1000];

	@OriginalMember(owner = "client!client", name = "Dd", descriptor = "Ljava/lang/String;")
	private String aString7 = "";

	@OriginalMember(owner = "client!client", name = "Ed", descriptor = "I")
	private int anInt269 = 7759444;

	@OriginalMember(owner = "client!client", name = "Gd", descriptor = "Z")
	private boolean aBoolean60 = false;

	@OriginalMember(owner = "client!client", name = "Jd", descriptor = "Z")
	private boolean aBoolean61 = true;

	@OriginalMember(owner = "client!client", name = "Kd", descriptor = "[Z")
	private boolean[] aBooleanArray4 = new boolean[5];

	@OriginalMember(owner = "client!client", name = "Ld", descriptor = "I")
	private int anInt272 = -318;

	@OriginalMember(owner = "client!client", name = "Nd", descriptor = "[I")
	private int[] anIntArray53 = new int[100];

	@OriginalMember(owner = "client!client", name = "Od", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray3 = new String[100];

	@OriginalMember(owner = "client!client", name = "Pd", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray4 = new String[100];

	@OriginalMember(owner = "client!client", name = "Vd", descriptor = "[Lclient!ib;")
	private Class1_Sub1_Sub2_Sub2[] aClass1_Sub1_Sub2_Sub2Array4 = new Class1_Sub1_Sub2_Sub2[20];

	@OriginalMember(owner = "client!client", name = "ce", descriptor = "Z")
	private boolean aBoolean63 = false;

	@OriginalMember(owner = "client!client", name = "ee", descriptor = "I")
	private int anInt277 = 2301979;

	@OriginalMember(owner = "client!client", name = "fe", descriptor = "[I")
	private int[] anIntArray54 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

	@OriginalMember(owner = "client!client", name = "he", descriptor = "I")
	private int anInt279 = -1;

	@OriginalMember(owner = "client!client", name = "pe", descriptor = "Lclient!ob;")
	private Class29 aClass29_1 = new Class29(0);

	@OriginalMember(owner = "client!client", name = "Fe", descriptor = "Z")
	private boolean aBoolean65 = true;

	@OriginalMember(owner = "client!client", name = "He", descriptor = "Z")
	private boolean aBoolean66 = false;

	@OriginalMember(owner = "client!client", name = "Je", descriptor = "[I")
	private int[] anIntArray55 = new int[1000];

	@OriginalMember(owner = "client!client", name = "cf", descriptor = "I")
	private int anInt312 = 3;

	@OriginalMember(owner = "client!client", name = "df", descriptor = "I")
	private int anInt313 = -1;

	@OriginalMember(owner = "client!client", name = "ff", descriptor = "I")
	private int anInt315 = 128;

	@OriginalMember(owner = "client!client", name = "kf", descriptor = "[I")
	private int[] anIntArray56 = new int[5];

	@OriginalMember(owner = "client!client", name = "of", descriptor = "I")
	private int anInt322 = 1;

	@OriginalMember(owner = "client!client", name = "wf", descriptor = "I")
	private int anInt325 = -714;

	@OriginalMember(owner = "client!client", name = "Df", descriptor = "[I")
	private int[] anIntArray57 = new int[4000];

	@OriginalMember(owner = "client!client", name = "Ef", descriptor = "[I")
	private int[] anIntArray58 = new int[4000];

	@OriginalMember(owner = "client!client", name = "Kf", descriptor = "Z")
	private boolean aBoolean67 = false;

	@OriginalMember(owner = "client!client", name = "Lf", descriptor = "[I")
	private int[] anIntArray59 = new int[5];

	@OriginalMember(owner = "client!client", name = "Mf", descriptor = "[I")
	private int[] anIntArray60 = new int[Class30.anInt808];

	@OriginalMember(owner = "client!client", name = "Nf", descriptor = "B")
	private byte aByte8 = 23;

	@OriginalMember(owner = "client!client", name = "Pf", descriptor = "I")
	private int anInt336 = 2;

	@OriginalMember(owner = "client!client", name = "bg", descriptor = "[Lclient!ib;")
	private Class1_Sub1_Sub2_Sub2[] aClass1_Sub1_Sub2_Sub2Array5 = new Class1_Sub1_Sub2_Sub2[1000];

	@OriginalMember(owner = "client!client", name = "fg", descriptor = "[Lclient!ib;")
	private Class1_Sub1_Sub2_Sub2[] aClass1_Sub1_Sub2_Sub2Array6 = new Class1_Sub1_Sub2_Sub2[20];

	@OriginalMember(owner = "client!client", name = "gg", descriptor = "I")
	private int anInt340 = 1;

	@OriginalMember(owner = "client!client", name = "hg", descriptor = "[I")
	private int[] anIntArray61 = new int[7];

	@OriginalMember(owner = "client!client", name = "ig", descriptor = "I")
	private int anInt341 = -10467;

	@OriginalMember(owner = "client!client", name = "jg", descriptor = "[I")
	private int[] anIntArray62 = new int[5];

	@OriginalMember(owner = "client!client", name = "pg", descriptor = "[[I")
	private int[][] anIntArrayArray4 = new int[104][104];

	@OriginalMember(owner = "client!client", name = "wg", descriptor = "[I")
	private int[] anIntArray66 = new int[33];

	@OriginalMember(owner = "client!client", name = "xg", descriptor = "[Lclient!jb;")
	private Class1_Sub1_Sub2_Sub3[] aClass1_Sub1_Sub2_Sub3Array3 = new Class1_Sub1_Sub2_Sub3[100];

	@OriginalMember(owner = "client!client", name = "yg", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray5 = new String[500];

	@OriginalMember(owner = "client!client", name = "Bg", descriptor = "B")
	private byte aByte9 = 1;

	@OriginalMember(owner = "client!client", name = "Ig", descriptor = "Z")
	private boolean aBoolean68 = false;

	@OriginalMember(owner = "client!client", name = "Mg", descriptor = "Z")
	private boolean aBoolean69 = true;

	@OriginalMember(owner = "client!client", name = "Ng", descriptor = "[I")
	private int[] anIntArray68 = new int[151];

	@OriginalMember(owner = "client!client", name = "Qg", descriptor = "Z")
	private boolean aBoolean70 = false;

	@OriginalMember(owner = "client!client", name = "Rg", descriptor = "[I")
	private int[] anIntArray69 = new int[5];

	@OriginalMember(owner = "client!client", name = "Sg", descriptor = "I")
	private int anInt356 = -732;

	@OriginalMember(owner = "client!client", name = "Vg", descriptor = "Lclient!lb;")
	private Class1_Sub1_Sub3 aClass1_Sub1_Sub3_3 = Class1_Sub1_Sub3.method468();

	@OriginalMember(owner = "client!client", name = "Wg", descriptor = "Ljava/lang/String;")
	private String aString10 = "";

	@OriginalMember(owner = "client!client", name = "Xg", descriptor = "[I")
	private int[] anIntArray70 = new int[256];

	@OriginalMember(owner = "client!client", name = "ch", descriptor = "I")
	private final int anInt359 = 100;

	@OriginalMember(owner = "client!client", name = "dh", descriptor = "[I")
	private int[] anIntArray71 = new int[100];

	@OriginalMember(owner = "client!client", name = "fh", descriptor = "Ljava/lang/String;")
	private String aString11 = "";

	@OriginalMember(owner = "client!client", name = "gh", descriptor = "Ljava/lang/String;")
	private String aString12 = "";

	@OriginalMember(owner = "client!client", name = "mh", descriptor = "Lclient!lb;")
	private Class1_Sub1_Sub3 aClass1_Sub1_Sub3_4 = Class1_Sub1_Sub3.method468();

	@OriginalMember(owner = "client!client", name = "ph", descriptor = "I")
	private int anInt365 = 7;

	@OriginalMember(owner = "client!client", name = "rh", descriptor = "I")
	private int anInt367 = 50;

	@OriginalMember(owner = "client!client", name = "sh", descriptor = "[I")
	private int[] anIntArray72 = new int[this.anInt367];

	@OriginalMember(owner = "client!client", name = "th", descriptor = "[I")
	private int[] anIntArray73 = new int[this.anInt367];

	@OriginalMember(owner = "client!client", name = "uh", descriptor = "[I")
	private int[] anIntArray74 = new int[this.anInt367];

	@OriginalMember(owner = "client!client", name = "vh", descriptor = "[I")
	private int[] anIntArray75 = new int[this.anInt367];

	@OriginalMember(owner = "client!client", name = "wh", descriptor = "[I")
	private int[] anIntArray76 = new int[this.anInt367];

	@OriginalMember(owner = "client!client", name = "xh", descriptor = "[I")
	private int[] anIntArray77 = new int[this.anInt367];

	@OriginalMember(owner = "client!client", name = "yh", descriptor = "[I")
	private int[] anIntArray78 = new int[this.anInt367];

	@OriginalMember(owner = "client!client", name = "zh", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray6 = new String[this.anInt367];

	@OriginalMember(owner = "client!client", name = "Eh", descriptor = "Z")
	private boolean aBoolean73 = true;

	@OriginalMember(owner = "client!client", name = "Ih", descriptor = "I")
	private int anInt369 = -14114;

	@OriginalMember(owner = "client!client", name = "Jh", descriptor = "Z")
	private boolean aBoolean75 = false;

	@OriginalMember(owner = "client!client", name = "Lh", descriptor = "Z")
	private boolean aBoolean76 = true;

	@OriginalMember(owner = "client!client", name = "Mh", descriptor = "I")
	private int anInt371 = -1;

	@OriginalMember(owner = "client!client", name = "Nh", descriptor = "Lclient!ob;")
	private Class29 aClass29_2 = new Class29(0);

	@OriginalMember(owner = "client!client", name = "Qh", descriptor = "[I")
	private int[] anIntArray83 = new int[200];

	@OriginalMember(owner = "client!client", name = "Rh", descriptor = "[I")
	private int[] anIntArray84 = new int[Class30.anInt808];

	@OriginalMember(owner = "client!client", name = "Th", descriptor = "Z")
	private boolean aBoolean77 = false;

	@OriginalMember(owner = "client!client", name = "Xh", descriptor = "I")
	private int anInt374 = 332;

	@OriginalMember(owner = "client!client", name = "Yh", descriptor = "Z")
	private boolean aBoolean78 = true;

	@OriginalMember(owner = "client!client", name = "Zh", descriptor = "I")
	private int anInt375 = 4;

	@OriginalMember(owner = "client!client", name = "bi", descriptor = "B")
	private byte aByte10 = -93;

	@OriginalMember(owner = "client!client", name = "di", descriptor = "[I")
	private int[] anIntArray85 = new int[33];

	@OriginalMember(owner = "client!client", name = "ei", descriptor = "B")
	private byte aByte11 = 67;

	@OriginalMember(owner = "client!client", name = "fi", descriptor = "Lclient!ob;")
	private Class29 aClass29_3 = new Class29(0);

	@OriginalMember(owner = "client!client", name = "gi", descriptor = "Z")
	private boolean aBoolean79 = false;

	@OriginalMember(owner = "client!client", name = "ii", descriptor = "B")
	private byte aByte12 = 6;

	@OriginalMember(owner = "client!client", name = "ji", descriptor = "[I")
	private int[] anIntArray86 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

	@OriginalMember(owner = "client!client", name = "li", descriptor = "Z")
	public boolean aBoolean80 = false;

	@OriginalMember(owner = "client!client", name = "mi", descriptor = "Ljava/lang/String;")
	private String aString13 = "";

	@OriginalMember(owner = "client!client", name = "ni", descriptor = "Ljava/lang/String;")
	private String aString14 = "";

	@OriginalMember(owner = "client!client", name = "oi", descriptor = "I")
	private int anInt379 = -1;

	@OriginalMember(owner = "client!client", name = "pi", descriptor = "I")
	private int anInt380 = -1;

	@OriginalMember(owner = "client!client", name = "qi", descriptor = "[Lclient!jb;")
	private Class1_Sub1_Sub2_Sub3[] aClass1_Sub1_Sub2_Sub3Array4 = new Class1_Sub1_Sub2_Sub3[13];

	@OriginalMember(owner = "client!client", name = "vi", descriptor = "I")
	private int anInt385 = 2;

	@OriginalMember(owner = "client!client", name = "wi", descriptor = "Z")
	private boolean aBoolean81 = false;

	@OriginalMember(owner = "client!client", name = "yi", descriptor = "Z")
	private boolean aBoolean82 = false;

	@OriginalMember(owner = "client!client", name = "zi", descriptor = "[[I")
	private int[][] anIntArrayArray6 = new int[104][104];

	@OriginalMember(owner = "client!client", name = "Bi", descriptor = "Z")
	private boolean aBoolean83 = false;

	@OriginalMember(owner = "client!client", name = "Ci", descriptor = "I")
	private int anInt387 = 2048;

	@OriginalMember(owner = "client!client", name = "Di", descriptor = "I")
	private int anInt388 = 2047;

	@OriginalMember(owner = "client!client", name = "Ei", descriptor = "[Lclient!ab;")
	private Class1_Sub1_Sub1_Sub1_Sub1[] aClass1_Sub1_Sub1_Sub1_Sub1Array1 = new Class1_Sub1_Sub1_Sub1_Sub1[this.anInt387];

	@OriginalMember(owner = "client!client", name = "Gi", descriptor = "[I")
	private int[] anIntArray87 = new int[this.anInt387];

	@OriginalMember(owner = "client!client", name = "Ii", descriptor = "[I")
	private int[] anIntArray88 = new int[this.anInt387];

	@OriginalMember(owner = "client!client", name = "Ji", descriptor = "[Lclient!lb;")
	private Class1_Sub1_Sub3[] aClass1_Sub1_Sub3Array1 = new Class1_Sub1_Sub3[this.anInt387];

	@OriginalMember(owner = "client!client", name = "Ki", descriptor = "I")
	private int anInt391 = 7;

	@OriginalMember(owner = "client!client", name = "Li", descriptor = "Z")
	private boolean aBoolean84 = true;

	@OriginalMember(owner = "client!client", name = "Qi", descriptor = "I")
	private int anInt396 = 5;

	@OriginalMember(owner = "client!client", name = "Wi", descriptor = "Z")
	private boolean aBoolean85 = false;

	@OriginalMember(owner = "client!client", name = "Xi", descriptor = "[I")
	private int[] anIntArray89 = new int[5];

	@OriginalMember(owner = "client!client", name = "Yi", descriptor = "I")
	private int anInt402 = 257;

	@OriginalMember(owner = "client!client", name = "Zi", descriptor = "I")
	private int anInt403 = 960;

	@OriginalMember(owner = "client!client", name = "jj", descriptor = "Z")
	private boolean aBoolean86 = false;

	@OriginalMember(owner = "client!client", name = "lj", descriptor = "Ljava/lang/String;")
	private String aString16 = "";

	@OriginalMember(owner = "client!client", name = "mj", descriptor = "Ljava/lang/String;")
	private String aString17 = "";

	@OriginalMember(owner = "client!client", name = "oj", descriptor = "I")
	private int anInt414 = -1;

	@OriginalMember(owner = "client!client", name = "qj", descriptor = "[Lclient!ib;")
	private Class1_Sub1_Sub2_Sub2[] aClass1_Sub1_Sub2_Sub2Array7 = new Class1_Sub1_Sub2_Sub2[8];

	@OriginalMember(owner = "client!client", name = "sj", descriptor = "I")
	private int anInt415 = -533;

	@OriginalMember(owner = "client!client", name = "tj", descriptor = "[B")
	private byte[] aByteArray2 = new byte[16384];

	@OriginalMember(owner = "client!client", name = "vj", descriptor = "Z")
	private boolean aBoolean87 = false;

	@OriginalMember(owner = "client!client", name = "wj", descriptor = "I")
	private int anInt417 = 4131;

	@OriginalMember(owner = "client!client", name = "xj", descriptor = "[I")
	private int[] anIntArray90 = new int[50];

	@OriginalMember(owner = "client!client", name = "yj", descriptor = "I")
	private int anInt418 = -1;

	@OriginalMember(owner = "client!client", name = "zj", descriptor = "I")
	private int anInt419 = -1;

	@OriginalMember(owner = "client!client", name = "Bj", descriptor = "Z")
	private boolean aBoolean88 = false;

	@OriginalMember(owner = "client!client", name = "Cj", descriptor = "Z")
	private boolean aBoolean89 = false;

	@OriginalMember(owner = "client!client", name = "Dj", descriptor = "Z")
	private boolean aBoolean90 = false;

	@OriginalMember(owner = "client!client", name = "Ej", descriptor = "[I")
	private int[] anIntArray92 = new int[2000];

	@OriginalMember(owner = "client!client", name = "Fj", descriptor = "[Lclient!z;")
	private Class1_Sub1_Sub1_Sub1_Sub2[] aClass1_Sub1_Sub1_Sub1_Sub2Array1 = new Class1_Sub1_Sub1_Sub1_Sub2[16384];

	@OriginalMember(owner = "client!client", name = "Hj", descriptor = "[I")
	private int[] anIntArray93 = new int[16384];

	@OriginalMember(owner = "client!client", name = "Ij", descriptor = "[J")
	private long[] aLongArray4 = new long[100];

	@OriginalMember(owner = "client!client", name = "Lj", descriptor = "I")
	private int anInt423 = -1;

	static {
		@Pc(17) int local17 = 0;
		@Pc(19) int local19;
		for (local19 = 0; local19 < 99; local19++) {
			@Pc(24) int local24 = local19 + 1;
			@Pc(37) int local37 = (int) ((double) local24 + Math.pow(2.0D, (double) local24 / 7.0D) * 300.0D);
			local17 += local37;
			anIntArray63[local19] = local17 / 4;
		}
		anIntArray67 = new int[32];
		local17 = 2;
		for (local19 = 0; local19 < 32; local19++) {
			anIntArray67[local19] = local17 - 1;
			local17 += local17;
		}
		aBigInteger2 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");
		anInt362 = 10;
		aBoolean71 = true;
		anIntArrayArray5 = new int[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, 33697, 22433, 2983, 54193 }, { 8741, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003, 25239 }, { 25238, 8742, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };
		anIntArray91 = new int[] { 9104, 10275, 7595, 3610, 7975, 8526, 918, 38802, 24466, 10145, 58654, 5027, 1457, 16565, 34991, 25486 };
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(III)Ljava/lang/String;")
	private static String method107(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		try {
			@Pc(10) int local10 = arg0 - arg1;
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
			signlink.reporterror("90572, " + arg0 + ", " + 1 + ", " + arg1 + ", " + local51.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(II)Ljava/lang/String;")
	private static String method128(@OriginalArg(0) int arg0) {
		try {
			@Pc(10) String local10 = String.valueOf(arg0);
			for (@Pc(15) int local15 = local10.length() - 3; local15 > 0; local15 -= 3) {
				local10 = local10.substring(0, local15) + "," + local10.substring(local15);
			}
			if (local10.length() > 8) {
				local10 = "@gre@" + local10.substring(0, local10.length() - 8) + " million @whi@(" + local10 + ")";
			} else if (local10.length() > 4) {
				local10 = "@cya@" + local10.substring(0, local10.length() - 4) + "K @whi@(" + local10 + ")";
			}
			return " " + local10;
		} catch (@Pc(95) RuntimeException local95) {
			signlink.reporterror("84188, " + arg0 + ", " + 0 + ", " + local95.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "i", descriptor = "(B)V")
	private static void method146() {
		try {
			Class37.aBoolean215 = true;
			Class1_Sub1_Sub2_Sub1.aBoolean151 = true;
			aBoolean72 = true;
			Class4.aBoolean33 = true;
			Class9.aBoolean122 = true;
		} catch (@Pc(18) RuntimeException local18) {
			signlink.reporterror("16525, " + 0 + ", " + local18.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "v", descriptor = "(I)V")
	private static void method188() {
		try {
			Class37.aBoolean215 = false;
			Class1_Sub1_Sub2_Sub1.aBoolean151 = false;
			aBoolean72 = false;
			Class4.aBoolean33 = false;
			Class9.aBoolean122 = false;
		} catch (@Pc(19) RuntimeException local19) {
			signlink.reporterror("59615, " + -394 + ", " + local19.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "main", descriptor = "([Ljava/lang/String;)V")
	public static void main(@OriginalArg(0) String[] arg0) {
		try {
			System.out.println("RS2 user client - release #" + 303);
			if (arg0.length == 5) {
				anInt362 = Integer.parseInt(arg0[0]);
				anInt363 = Integer.parseInt(arg0[1]);
				if (arg0[2].equals("lowmem")) {
					method146();
				} else if (arg0[2].equals("highmem")) {
					method188();
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
				signlink.anInt931 = Integer.parseInt(arg0[4]);
				signlink.startpriv(InetAddress.getLocalHost());
				@Pc(87) client local87 = new client();
				local87.method84();
			} else {
				System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
			}
		} catch (@Pc(94) Exception local94) {
		}
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(II)Ljava/lang/String;")
	private static String method217(@OriginalArg(0) int arg0) {
		try {
			if (arg0 < 100000) {
				return String.valueOf(arg0);
			} else if (arg0 < 10000000) {
				return arg0 / 1000 + "K";
			} else {
				return arg0 / 1000000 + "M";
			}
		} catch (@Pc(41) RuntimeException local41) {
			signlink.reporterror("90557, " + arg0 + ", " + 2 + ", " + local41.toString());
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
				return new URL("http://127.0.0.1:" + (anInt363 + 80));
			}
		} catch (@Pc(21) Exception local21) {
		}
		return super.getCodeBase();
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILclient!lb;I)V")
	private void method97(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub1_Sub3 arg1, @OriginalArg(2) int arg2) {
		try {
			this.anInt295 = 0;
			this.anInt390 = 0;
			this.method111(arg2, arg1);
			this.method145(arg2, arg1);
			this.method176(arg2, arg1);
			@Pc(31) int local31;
			for (@Pc(24) int local24 = 0; local24 < this.anInt295; local24++) {
				local31 = this.anIntArray55[local24];
				if (this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local31].anInt1021 != anInt223) {
					this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local31].aClass13_2 = null;
					this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local31] = null;
				}
			}
			if (arg0 < 5 || arg0 > 5) {
				this.anInt373 = -112;
			}
			if (arg1.anInt742 != arg2) {
				signlink.reporterror(this.aString16 + " size mismatch in getnpcpos - pos:" + arg1.anInt742 + " psize:" + arg2);
				throw new RuntimeException("eek");
			}
			for (local31 = 0; local31 < this.anInt420; local31++) {
				if (this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[this.anIntArray93[local31]] == null) {
					signlink.reporterror(this.aString16 + " null entry in npc list - pos:" + local31 + " size:" + this.anInt420);
					throw new RuntimeException("eek");
				}
			}
		} catch (@Pc(130) RuntimeException local130) {
			signlink.reporterror("82700, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local130.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
	@Override
	public String getParameter(@OriginalArg(0) String arg0) {
		return signlink.mainapp == null ? super.getParameter(arg0) : signlink.mainapp.getParameter(arg0);
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "([BIB)Z")
	private boolean method98(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte arg2) {
		try {
			@Pc(4) boolean local4 = false;
			return arg0 == null ? true : signlink.wavesave(arg0, arg1);
		} catch (@Pc(19) RuntimeException local19) {
			signlink.reporterror("63076, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local19.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IZI)V")
	private void method99(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		try {
			signlink.anInt935 = arg0;
			if (arg1) {
				signlink.midi = "voladjust";
			}
		} catch (@Pc(15) RuntimeException local15) {
			signlink.reporterror("8437, " + arg0 + ", " + arg1 + ", " + -39072 + ", " + local15.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(B)V")
	private void method100() {
		try {
			@Pc(21) int local21;
			@Pc(49) int local49;
			@Pc(53) int local53;
			@Pc(62) int local62;
			@Pc(69) int local69;
			@Pc(133) int local133;
			@Pc(190) int local190;
			try {
				this.anInt260 = -1;
				this.aClass29_2.method515();
				this.aClass29_3.method515();
				Class1_Sub1_Sub2_Sub1.method345();
				this.method209(336);
				this.aClass37_1.method530(880);
				for (local21 = 0; local21 < 4; local21++) {
					this.aClass19Array1[local21].method420();
				}
				System.gc();
				@Pc(45) Class4 local45 = new Class4(-702, this.anIntArrayArrayArray5, 104, 104, this.aByteArrayArrayArray7);
				local49 = this.aByteArrayArray1.length;
				Class4.aBoolean33 = Class37.aBoolean215;
				for (local53 = 0; local53 < local49; local53++) {
					local62 = this.anIntArray39[local53] >> 8;
					local69 = this.anIntArray39[local53] & 0xFF;
					if (local62 == 33 && local69 >= 71 && local69 <= 73) {
						Class4.aBoolean33 = false;
					}
				}
				if (Class4.aBoolean33) {
					this.aClass37_1.method531(this.anInt361, 10);
				} else {
					this.aClass37_1.method531(0, 10);
				}
				this.aClass1_Sub1_Sub3_2.method469(this.anInt208, 62);
				@Pc(138) byte[] local138;
				for (local62 = 0; local62 < local49; local62++) {
					local69 = (this.anIntArray39[local62] >> 8) * 64 - this.anInt244;
					local133 = (this.anIntArray39[local62] & 0xFF) * 64 - this.anInt245;
					local138 = this.aByteArrayArray1[local62];
					if (local138 != null) {
						local45.method57(local133, (this.anInt249 - 6) * 8, local69, (this.anInt248 - 6) * 8, local138);
					}
				}
				for (local69 = 0; local69 < local49; local69++) {
					local133 = (this.anIntArray39[local69] >> 8) * 64 - this.anInt244;
					local190 = (this.anIntArray39[local69] & 0xFF) * 64 - this.anInt245;
					@Pc(195) byte[] local195 = this.aByteArrayArray1[local69];
					if (local195 == null && this.anInt249 < 800) {
						local45.method56(local190, local133);
					}
				}
				this.aClass1_Sub1_Sub3_2.method469(this.anInt208, 62);
				@Pc(241) int local241;
				for (local133 = 0; local133 < local49; local133++) {
					local138 = this.aByteArrayArray2[local133];
					if (local138 != null) {
						local241 = (this.anIntArray39[local133] >> 8) * 64 - this.anInt244;
						@Pc(253) int local253 = (this.anIntArray39[local133] & 0xFF) * 64 - this.anInt245;
						local45.method60((byte) 1, local138, local253, this.aClass19Array1, this.aClass37_1, local241);
					}
				}
				this.aClass1_Sub1_Sub3_2.method469(this.anInt208, 62);
				local45.method62(this.aClass37_1, this.aClass19Array1);
				this.aClass35_14.method524((byte) 4);
				this.aClass1_Sub1_Sub3_2.method469(this.anInt208, 62);
				for (local190 = 0; local190 < 104; local190++) {
					for (local241 = 0; local241 < 104; local241++) {
						this.method184(local190, local241);
					}
				}
				this.method189();
			} catch (@Pc(315) Exception local315) {
			}
			Class9.aClass40_4.method593();
			@Pc(329) int local329;
			if (aBoolean72 && signlink.aRandomAccessFile1 != null) {
				local21 = this.aClass44_Sub1_1.method638(0);
				for (local329 = 0; local329 < local21; local329++) {
					local49 = this.aClass44_Sub1_1.method643(local329);
					if ((local49 & 0x79) == 0) {
						Class1_Sub1_Sub1_Sub5.method260(local329);
					}
				}
			}
			System.gc();
			Class1_Sub1_Sub2_Sub1.method346();
			this.aClass44_Sub1_1.method649();
			local21 = (this.anInt248 - 6) / 8 - 1;
			local329 = (this.anInt248 + 6) / 8 + 1;
			local49 = (this.anInt249 - 6) / 8 - 1;
			local53 = (this.anInt249 + 6) / 8 + 1;
			if (this.aBoolean83) {
				local21 = 49;
				local329 = 50;
				local49 = 49;
				local53 = 50;
			}
			for (local62 = local21; local62 <= local329; local62++) {
				for (local69 = local49; local69 <= local53; local69++) {
					if (local62 == local21 || local62 == local329 || local69 == local49 || local69 == local53) {
						local133 = this.aClass44_Sub1_1.method640(local62, local69, 0);
						if (local133 != -1) {
							this.aClass44_Sub1_1.method650(3, local133);
						}
						local190 = this.aClass44_Sub1_1.method640(local62, local69, 1);
						if (local190 != -1) {
							this.aClass44_Sub1_1.method650(3, local190);
						}
					}
				}
			}
		} catch (@Pc(473) RuntimeException local473) {
			signlink.reporterror("23672, " + 9 + ", " + local473.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ZB)V")
	private void method101(@OriginalArg(0) boolean arg0) {
		try {
			for (@Pc(1) int local1 = 0; local1 < this.anInt420; local1++) {
				@Pc(11) Class1_Sub1_Sub1_Sub1_Sub2 local11 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[this.anIntArray93[local1]];
				@Pc(20) int local20 = (this.anIntArray93[local1] << 14) + 536870912;
				if (local11 != null && local11.method680() && local11.aClass13_2.aBoolean146 == arg0) {
					@Pc(36) int local36 = local11.anInt981 >> 7;
					@Pc(41) int local41 = local11.anInt982 >> 7;
					if (local36 >= 0 && local36 < 104 && local41 >= 0 && local41 < 104) {
						if (local11.anInt984 == 1 && (local11.anInt981 & 0x7F) == 64 && (local11.anInt982 & 0x7F) == 64) {
							if (this.anIntArrayArray6[local36][local41] == this.anInt319) {
								continue;
							}
							this.anIntArrayArray6[local36][local41] = this.anInt319;
						}
						this.aClass37_1.method541((local11.anInt984 - 1) * 64 + 60, local11.anInt982, local11.anInt981, this.method181(this.aByte10, this.anInt361, local11.anInt981, local11.anInt982), local11, local11.anInt983, local11.aBoolean245, this.anInt361, local20);
					}
				}
			}
		} catch (@Pc(129) RuntimeException local129) {
			signlink.reporterror("84882, " + arg0 + ", " + 8 + ", " + local129.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(I)V")
	private void method102() {
		try {
			signlink.anInt936 = 0;
			signlink.midi = "stop";
		} catch (@Pc(7) RuntimeException local7) {
			signlink.reporterror("53112, " + 0 + ", " + local7.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(B)Z")
	private boolean method103() {
		try {
			if (this.aClass8_1 == null) {
				return false;
			}
			@Pc(3518) String local3518;
			@Pc(179) int local179;
			try {
				@Pc(17) int local17 = this.aClass8_1.method249();
				if (local17 == 0) {
					return false;
				}
				if (this.anInt331 == -1) {
					this.aClass8_1.method250(this.aClass1_Sub1_Sub3_3.aByteArray9, 0, 1);
					this.anInt331 = this.aClass1_Sub1_Sub3_3.aByteArray9[0] & 0xFF;
					if (this.aClass46_1 != null) {
						this.anInt331 = this.anInt331 - this.aClass46_1.method662() & 0xFF;
					}
					this.anInt330 = Class17.anIntArray210[this.anInt331];
					local17--;
				}
				if (this.anInt330 == -1) {
					if (local17 <= 0) {
						return false;
					}
					this.aClass8_1.method250(this.aClass1_Sub1_Sub3_3.aByteArray9, 0, 1);
					this.anInt330 = this.aClass1_Sub1_Sub3_3.aByteArray9[0] & 0xFF;
					local17--;
				}
				if (this.anInt330 == -2) {
					if (local17 <= 1) {
						return false;
					}
					this.aClass8_1.method250(this.aClass1_Sub1_Sub3_3.aByteArray9, 0, 2);
					this.aClass1_Sub1_Sub3_3.anInt742 = 0;
					this.anInt330 = this.aClass1_Sub1_Sub3_3.method482();
					local17 -= 2;
				}
				if (local17 < this.anInt330) {
					return false;
				}
				this.aClass1_Sub1_Sub3_3.anInt742 = 0;
				this.aClass8_1.method250(this.aClass1_Sub1_Sub3_3.aByteArray9, 0, this.anInt330);
				this.anInt332 = 0;
				this.anInt259 = this.anInt258;
				this.anInt258 = this.anInt257;
				this.anInt257 = this.anInt331;
				if (this.anInt331 == 162) {
					this.anInt287 = this.aClass1_Sub1_Sub3_3.method480();
					this.anInt331 = -1;
					return true;
				}
				@Pc(175) int local175;
				if (this.anInt331 == 24) {
					local175 = this.aClass1_Sub1_Sub3_3.method480();
					local179 = this.aClass1_Sub1_Sub3_3.method480();
					@Pc(183) String local183 = this.aClass1_Sub1_Sub3_3.method487();
					if (local175 >= 1 && local175 <= 5) {
						if (local183.equalsIgnoreCase("null")) {
							local183 = null;
						}
						this.aStringArray2[local175 - 1] = local183;
						this.aBooleanArray3[local175 - 1] = local179 == 0;
					}
					this.anInt331 = -1;
					return true;
				}
				if (this.anInt331 == 231) {
					this.anInt222 = this.aClass1_Sub1_Sub3_3.method480();
					if (this.anInt222 == 1) {
						this.anInt424 = this.aClass1_Sub1_Sub3_3.method482();
					}
					if (this.anInt222 >= 2 && this.anInt222 <= 6) {
						if (this.anInt222 == 2) {
							this.anInt292 = 64;
							this.anInt293 = 64;
						}
						if (this.anInt222 == 3) {
							this.anInt292 = 0;
							this.anInt293 = 64;
						}
						if (this.anInt222 == 4) {
							this.anInt292 = 128;
							this.anInt293 = 64;
						}
						if (this.anInt222 == 5) {
							this.anInt292 = 64;
							this.anInt293 = 0;
						}
						if (this.anInt222 == 6) {
							this.anInt292 = 64;
							this.anInt293 = 128;
						}
						this.anInt222 = 2;
						this.anInt289 = this.aClass1_Sub1_Sub3_3.method482();
						this.anInt290 = this.aClass1_Sub1_Sub3_3.method482();
						this.anInt291 = this.aClass1_Sub1_Sub3_3.method480();
					}
					if (this.anInt222 == 10) {
						this.anInt224 = this.aClass1_Sub1_Sub3_3.method482();
					}
					this.anInt331 = -1;
					return true;
				}
				@Pc(340) int local340;
				@Pc(483) int local483;
				@Pc(450) int local450;
				@Pc(348) int local348;
				@Pc(336) long local336;
				if (this.anInt331 == 18) {
					local336 = this.aClass1_Sub1_Sub3_3.method486(this.anInt375);
					local340 = this.aClass1_Sub1_Sub3_3.method480();
					@Pc(346) String local346 = Class48.method671(Class48.method668(local336), 789);
					for (local348 = 0; local348 < this.anInt262; local348++) {
						if (local336 == this.aLongArray3[local348]) {
							if (this.anIntArray83[local348] != local340) {
								this.anIntArray83[local348] = local340;
								this.aBoolean54 = true;
								if (local340 > 0) {
									this.method187(5, local346 + " has logged in.", "");
								}
								if (local340 == 0) {
									this.method187(5, local346 + " has logged out.", "");
								}
							}
							local346 = null;
							break;
						}
					}
					if (local346 != null && this.anInt262 < 200) {
						this.aLongArray3[this.anInt262] = local336;
						this.aStringArray1[this.anInt262] = local346;
						this.anIntArray83[this.anInt262] = local340;
						this.anInt262++;
						this.aBoolean54 = true;
					}
					@Pc(444) boolean local444 = false;
					while (!local444) {
						local444 = true;
						for (local450 = 0; local450 < this.anInt262 - 1; local450++) {
							if (this.anIntArray83[local450] != anInt362 && this.anIntArray83[local450 + 1] == anInt362 || this.anIntArray83[local450] == 0 && this.anIntArray83[local450 + 1] != 0) {
								local483 = this.anIntArray83[local450];
								this.anIntArray83[local450] = this.anIntArray83[local450 + 1];
								this.anIntArray83[local450 + 1] = local483;
								@Pc(505) String local505 = this.aStringArray1[local450];
								this.aStringArray1[local450] = this.aStringArray1[local450 + 1];
								this.aStringArray1[local450 + 1] = local505;
								@Pc(527) long local527 = this.aLongArray3[local450];
								this.aLongArray3[local450] = this.aLongArray3[local450 + 1];
								this.aLongArray3[local450 + 1] = local527;
								this.aBoolean54 = true;
								local444 = false;
							}
						}
					}
					this.anInt331 = -1;
					return true;
				}
				if (this.anInt331 == 116) {
					local175 = this.aClass1_Sub1_Sub3_3.method482();
					local179 = this.aClass1_Sub1_Sub3_3.method480();
					local340 = this.aClass1_Sub1_Sub3_3.method482();
					if (this.aBoolean69 && !aBoolean72 && this.anInt347 < 50) {
						this.anIntArray42[this.anInt347] = local175;
						this.anIntArray90[this.anInt347] = local179;
						this.anIntArray44[this.anInt347] = local340 + Class5.anIntArray29[local175];
						this.anInt347++;
					}
					this.anInt331 = -1;
					return true;
				}
				if (this.anInt331 == 179) {
					this.anInt377 = this.aClass1_Sub1_Sub3_3.method480();
					this.anInt294 = this.aClass1_Sub1_Sub3_3.method480();
					this.anInt355 = this.aClass1_Sub1_Sub3_3.method480();
					this.aBoolean85 = true;
					this.aBoolean75 = true;
					this.anInt331 = -1;
					return true;
				}
				@Pc(671) int local671;
				if (this.anInt331 == 36) {
					local175 = this.aClass1_Sub1_Sub3_3.method482();
					local179 = this.aClass1_Sub1_Sub3_3.method482();
					local340 = this.aClass1_Sub1_Sub3_3.method482();
					local671 = this.aClass1_Sub1_Sub3_3.method482();
					Class6.aClass6Array1[local175].anInt455 = local179;
					Class6.aClass6Array1[local175].anInt456 = local340;
					Class6.aClass6Array1[local175].anInt454 = local671;
					this.anInt331 = -1;
					return true;
				}
				@Pc(707) Class6 local707;
				if (this.anInt331 == 249) {
					local175 = this.aClass1_Sub1_Sub3_3.method482();
					local179 = this.aClass1_Sub1_Sub3_3.method482();
					local707 = Class6.aClass6Array1[local175];
					if (local707 != null && local707.anInt431 == 0) {
						if (local179 < 0) {
							local179 = 0;
						}
						if (local179 > local707.anInt439 - local707.anInt435) {
							local179 = local707.anInt439 - local707.anInt435;
						}
						local707.anInt440 = local179;
					}
					this.anInt331 = -1;
					return true;
				}
				if (this.anInt331 == 101) {
					this.anInt348 = this.anInt330 / 8;
					for (local175 = 0; local175 < this.anInt348; local175++) {
						this.aLongArray4[local175] = this.aClass1_Sub1_Sub3_3.method486(this.anInt375);
					}
					this.anInt331 = -1;
					return true;
				}
				@Pc(782) String local782;
				if (this.anInt331 == 185) {
					local175 = this.aClass1_Sub1_Sub3_3.method482();
					local782 = this.aClass1_Sub1_Sub3_3.method487();
					Class6.aClass6Array1[local175].aString18 = local782;
					if (Class6.aClass6Array1[local175].anInt430 == this.anIntArray86[this.anInt312]) {
						this.aBoolean54 = true;
					}
					this.anInt331 = -1;
					return true;
				}
				if (this.anInt331 == 217) {
					this.aBoolean54 = true;
					local175 = this.aClass1_Sub1_Sub3_3.method480();
					local179 = this.aClass1_Sub1_Sub3_3.method485();
					local340 = this.aClass1_Sub1_Sub3_3.method480();
					this.anIntArray60[local175] = local179;
					this.anIntArray43[local175] = local340;
					this.anIntArray84[local175] = 1;
					for (local671 = 0; local671 < 98; local671++) {
						if (local179 >= anIntArray63[local671]) {
							this.anIntArray84[local175] = local671 + 2;
						}
					}
					this.anInt331 = -1;
					return true;
				}
				@Pc(879) Class6 local879;
				if (this.anInt331 == 206) {
					this.aBoolean54 = true;
					local175 = this.aClass1_Sub1_Sub3_3.method482();
					local879 = Class6.aClass6Array1[local175];
					while (this.aClass1_Sub1_Sub3_3.anInt742 < this.anInt330) {
						local340 = this.aClass1_Sub1_Sub3_3.method494();
						local671 = this.aClass1_Sub1_Sub3_3.method482();
						local348 = this.aClass1_Sub1_Sub3_3.method480();
						if (local348 == 255) {
							local348 = this.aClass1_Sub1_Sub3_3.method485();
						}
						if (local340 >= 0 && local340 < local879.anIntArray94.length) {
							local879.anIntArray94[local340] = local671;
							local879.anIntArray95[local340] = local348;
						}
					}
					this.anInt331 = -1;
					return true;
				}
				if (this.anInt331 == 120) {
					local175 = this.aClass1_Sub1_Sub3_3.method482();
					this.method219(local175);
					if (this.anInt203 != -1) {
						this.anInt203 = -1;
						this.aBoolean54 = true;
						this.aBoolean79 = true;
					}
					this.anInt261 = local175;
					this.aBoolean75 = true;
					this.anInt205 = -1;
					this.aBoolean90 = false;
					this.anInt331 = -1;
					return true;
				}
				if (this.anInt331 == 229) {
					this.method118();
					this.anInt331 = -1;
					return false;
				}
				if (this.anInt331 == 159) {
					this.anInt339 = this.aClass1_Sub1_Sub3_3.method480();
					this.anInt331 = -1;
					return true;
				}
				@Pc(1016) boolean local1016;
				@Pc(1018) int local1018;
				@Pc(1085) String local1085;
				if (this.anInt331 == 69) {
					local336 = this.aClass1_Sub1_Sub3_3.method486(this.anInt375);
					local340 = this.aClass1_Sub1_Sub3_3.method485();
					local671 = this.aClass1_Sub1_Sub3_3.method480();
					local1016 = false;
					for (local1018 = 0; local1018 < 100; local1018++) {
						if (this.anIntArray71[local1018] == local340) {
							local1016 = true;
							break;
						}
					}
					if (local671 <= 1) {
						for (local450 = 0; local450 < this.anInt348; local450++) {
							if (this.aLongArray4[local450] == local336) {
								local1016 = true;
								break;
							}
						}
					}
					if (!local1016 && this.anInt250 == 0) {
						try {
							this.anIntArray71[this.anInt314] = local340;
							this.anInt314 = (this.anInt314 + 1) % 100;
							local1085 = Class49.method683(this.aClass1_Sub1_Sub3_3, this.anInt330 - 13);
							if (local671 != 3) {
								local1085 = Class42.method604(local1085);
							}
							if (local671 == 2 || local671 == 3) {
								this.method187(7, local1085, "@cr2@" + Class48.method671(Class48.method668(local336), 789));
							} else if (local671 == 1) {
								this.method187(7, local1085, "@cr1@" + Class48.method671(Class48.method668(local336), 789));
							} else {
								this.method187(3, local1085, Class48.method671(Class48.method668(local336), 789));
							}
						} catch (@Pc(1149) Exception local1149) {
							signlink.reporterror("cde1");
						}
					}
					this.anInt331 = -1;
					return true;
				}
				if (this.anInt331 == 58) {
					this.method97(this.anInt396, this.aClass1_Sub1_Sub3_3, this.anInt330);
					this.anInt331 = -1;
					return true;
				}
				if (this.anInt331 == 239 || this.anInt331 == 74) {
					local175 = this.aClass1_Sub1_Sub3_3.method482();
					local179 = this.aClass1_Sub1_Sub3_3.method482();
					this.aBoolean55 = false;
					if (this.anInt331 == 74) {
						this.aClass1_Sub1_Sub3_3.method490();
						local340 = 0;
						while (true) {
							if (local340 >= 4) {
								this.aClass1_Sub1_Sub3_3.method492(this.anInt365);
								this.aBoolean55 = true;
								break;
							}
							for (local671 = 0; local671 < 13; local671++) {
								for (local348 = 0; local348 < 13; local348++) {
									local1018 = this.aClass1_Sub1_Sub3_3.method491(this.anInt243, 1);
									if (local1018 == 1) {
										this.anIntArrayArrayArray6[local340][local671][local348] = this.aClass1_Sub1_Sub3_3.method491(this.anInt243, 26);
									} else {
										this.anIntArrayArrayArray6[local340][local671][local348] = -1;
									}
								}
							}
							local340++;
						}
					}
					if (this.anInt248 == local175 && this.anInt249 == local179 && this.anInt232 == 2) {
						this.anInt331 = -1;
						return true;
					}
					this.anInt248 = local175;
					this.anInt249 = local179;
					this.anInt244 = (this.anInt248 - 6) * 8;
					this.anInt245 = (this.anInt249 - 6) * 8;
					this.aBoolean83 = false;
					if ((this.anInt248 / 8 == 48 || this.anInt248 / 8 == 49) && this.anInt249 / 8 == 48) {
						this.aBoolean83 = true;
					}
					if (this.anInt248 / 8 == 48 && this.anInt249 / 8 == 148) {
						this.aBoolean83 = true;
					}
					this.anInt232 = 1;
					this.aLong15 = System.currentTimeMillis();
					this.aClass35_14.method524((byte) 4);
					this.aClass1_Sub1_Sub2_Sub4_2.method447("Loading - please wait.", this.anInt241, 151, 0, 257);
					this.aClass1_Sub1_Sub2_Sub4_2.method447("Loading - please wait.", this.anInt241, 150, 16777215, 256);
					this.aClass35_14.method525(super.aGraphics2, 4, 4, (byte) 8);
					if (this.anInt331 == 239) {
						local340 = 0;
						local671 = (this.anInt248 - 6) / 8;
						label1069: while (true) {
							if (local671 > (this.anInt248 + 6) / 8) {
								this.aByteArrayArray1 = new byte[local340][];
								this.aByteArrayArray2 = new byte[local340][];
								this.anIntArray39 = new int[local340];
								this.anIntArray40 = new int[local340];
								this.anIntArray41 = new int[local340];
								local340 = 0;
								local348 = (this.anInt248 - 6) / 8;
								while (true) {
									if (local348 > (this.anInt248 + 6) / 8) {
										break label1069;
									}
									for (local1018 = (this.anInt249 - 6) / 8; local1018 <= (this.anInt249 + 6) / 8; local1018++) {
										this.anIntArray39[local340] = (local348 << 8) + local1018;
										if (this.aBoolean83 && (local1018 == 49 || local1018 == 149 || local1018 == 147 || local348 == 50 || local348 == 49 && local1018 == 47)) {
											this.anIntArray40[local340] = -1;
											this.anIntArray41[local340] = -1;
											local340++;
										} else {
											local450 = this.anIntArray40[local340] = this.aClass44_Sub1_1.method640(local348, local1018, 0);
											if (local450 != -1) {
												this.aClass44_Sub1_1.method645(3, local450);
											}
											local483 = this.anIntArray41[local340] = this.aClass44_Sub1_1.method640(local348, local1018, 1);
											if (local483 != -1) {
												this.aClass44_Sub1_1.method645(3, local483);
											}
											local340++;
										}
									}
									local348++;
								}
							}
							for (local348 = (this.anInt249 - 6) / 8; local348 <= (this.anInt249 + 6) / 8; local348++) {
								local340++;
							}
							local671++;
						}
					}
					local340 = this.anInt244 - this.anInt246;
					local671 = this.anInt245 - this.anInt247;
					this.anInt246 = this.anInt244;
					this.anInt247 = this.anInt245;
					for (local348 = 0; local348 < 16384; local348++) {
						@Pc(1598) Class1_Sub1_Sub1_Sub1_Sub2 local1598 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local348];
						if (local1598 != null) {
							for (local450 = 0; local450 < 10; local450++) {
								local1598.anIntArray272[local450] -= local340;
								local1598.anIntArray273[local450] -= local671;
							}
							local1598.anInt981 -= local340 * 128;
							local1598.anInt982 -= local671 * 128;
						}
					}
					for (local1018 = 0; local1018 < this.anInt387; local1018++) {
						@Pc(1653) Class1_Sub1_Sub1_Sub1_Sub1 local1653 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local1018];
						if (local1653 != null) {
							for (local483 = 0; local483 < 10; local483++) {
								local1653.anIntArray272[local483] -= local340;
								local1653.anIntArray273[local483] -= local671;
							}
							local1653.anInt981 -= local340 * 128;
							local1653.anInt982 -= local671 * 128;
						}
					}
					this.aBoolean46 = true;
					@Pc(1705) byte local1705 = 0;
					@Pc(1707) byte local1707 = 104;
					@Pc(1709) byte local1709 = 1;
					if (local340 < 0) {
						local1705 = 103;
						local1707 = -1;
						local1709 = -1;
					}
					@Pc(1719) byte local1719 = 0;
					@Pc(1721) byte local1721 = 104;
					@Pc(1723) byte local1723 = 1;
					if (local671 < 0) {
						local1719 = 103;
						local1721 = -1;
						local1723 = -1;
					}
					for (@Pc(1733) int local1733 = local1705; local1733 != local1707; local1733 += local1709) {
						for (@Pc(1737) int local1737 = local1719; local1737 != local1721; local1737 += local1723) {
							@Pc(1743) int local1743 = local1733 + local340;
							@Pc(1747) int local1747 = local1737 + local671;
							for (@Pc(1749) int local1749 = 0; local1749 < 4; local1749++) {
								if (local1743 >= 0 && local1747 >= 0 && local1743 < 104 && local1747 < 104) {
									this.aClass29ArrayArrayArray1[local1749][local1733][local1737] = this.aClass29ArrayArrayArray1[local1749][local1743][local1747];
								} else {
									this.aClass29ArrayArrayArray1[local1749][local1733][local1737] = null;
								}
							}
						}
					}
					for (@Pc(1811) Class1_Sub2 local1811 = (Class1_Sub2) this.aClass29_1.method511(); local1811 != null; local1811 = (Class1_Sub2) this.aClass29_1.method513()) {
						local1811.anInt780 -= local340;
						local1811.anInt781 -= local671;
						if (local1811.anInt780 < 0 || local1811.anInt781 < 0 || local1811.anInt780 >= 104 || local1811.anInt781 >= 104) {
							local1811.method673();
						}
					}
					if (this.anInt281 != 0) {
						this.anInt281 -= local340;
						this.anInt282 -= local671;
					}
					this.aBoolean89 = false;
					this.anInt331 = -1;
					return true;
				}
				if (this.anInt331 == 242) {
					this.anInt421 = this.aClass1_Sub1_Sub3_3.method480();
					this.anInt422 = this.aClass1_Sub1_Sub3_3.method480();
					for (local175 = this.anInt421; local175 < this.anInt421 + 8; local175++) {
						for (local179 = this.anInt422; local179 < this.anInt422 + 8; local179++) {
							if (this.aClass29ArrayArrayArray1[this.anInt361][local175][local179] != null) {
								this.aClass29ArrayArrayArray1[this.anInt361][local175][local179] = null;
								this.method184(local175, local179);
							}
						}
					}
					for (@Pc(1939) Class1_Sub2 local1939 = (Class1_Sub2) this.aClass29_1.method511(); local1939 != null; local1939 = (Class1_Sub2) this.aClass29_1.method513()) {
						if (local1939.anInt780 >= this.anInt421 && local1939.anInt780 < this.anInt421 + 8 && local1939.anInt781 >= this.anInt422 && local1939.anInt781 < this.anInt422 + 8 && local1939.anInt778 == this.anInt361) {
							local1939.anInt789 = 0;
						}
					}
					this.anInt331 = -1;
					return true;
				}
				if (this.anInt331 == 228) {
					this.anInt421 = this.aClass1_Sub1_Sub3_3.method480();
					this.anInt422 = this.aClass1_Sub1_Sub3_3.method480();
					this.anInt331 = -1;
					return true;
				}
				if (this.anInt331 == 27) {
					local175 = this.aClass1_Sub1_Sub3_3.method482();
					local179 = this.aClass1_Sub1_Sub3_3.method482();
					Class6.aClass6Array1[local175].anInt448 = 1;
					Class6.aClass6Array1[local175].anInt449 = local179;
					this.anInt331 = -1;
					return true;
				}
				if (this.anInt331 == 247) {
					this.anInt313 = this.aClass1_Sub1_Sub3_3.method480();
					if (this.anInt313 == this.anInt312) {
						if (this.anInt313 == 3) {
							this.anInt312 = 1;
						} else {
							this.anInt312 = 3;
						}
						this.aBoolean54 = true;
					}
					this.anInt331 = -1;
					return true;
				}
				if (this.anInt331 == 213) {
					local175 = this.aClass1_Sub1_Sub3_3.method482();
					Class6.aClass6Array1[local175].anInt448 = 3;
					if (aClass1_Sub1_Sub1_Sub1_Sub1_1.aClass13_1 == null) {
						Class6.aClass6Array1[local175].anInt449 = (aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray14[0] << 25) + (aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray14[4] << 20) + (aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray13[0] << 15) + (aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray13[8] << 10) + (aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray13[11] << 5) + aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray13[1];
					} else {
						Class6.aClass6Array1[local175].anInt449 = (int) (aClass1_Sub1_Sub1_Sub1_Sub1_1.aClass13_1.aLong23 + 305419896L);
					}
					this.anInt331 = -1;
					return true;
				}
				if (this.anInt331 == 19 || this.anInt331 == 197 || this.anInt331 == 35 || this.anInt331 == 14 || this.anInt331 == 45 || this.anInt331 == 192 || this.anInt331 == 76 || this.anInt331 == 7 || this.anInt331 == 188 || this.anInt331 == 237 || this.anInt331 == 142) {
					this.method171(this.aClass1_Sub1_Sub3_3, this.anInt331);
					this.anInt331 = -1;
					return true;
				}
				if (this.anInt331 == 111) {
					this.anInt312 = this.aClass1_Sub1_Sub3_3.method480();
					this.aBoolean54 = true;
					this.aBoolean79 = true;
					this.anInt331 = -1;
					return true;
				}
				if (this.anInt331 == 156) {
					local175 = this.aClass1_Sub1_Sub3_3.method482();
					local179 = this.aClass1_Sub1_Sub3_3.method480();
					if (local175 == 65535) {
						local175 = -1;
					}
					this.anIntArray86[local179] = local175;
					this.aBoolean54 = true;
					this.aBoolean79 = true;
					this.anInt331 = -1;
					return true;
				}
				if (this.anInt331 == 189) {
					local175 = this.aClass1_Sub1_Sub3_3.method482();
					local879 = Class6.aClass6Array1[local175];
					for (local340 = 0; local340 < local879.anIntArray94.length; local340++) {
						local879.anIntArray94[local340] = -1;
						local879.anIntArray94[local340] = 0;
					}
					this.anInt331 = -1;
					return true;
				}
				if (this.anInt331 == 236) {
					local175 = this.aClass1_Sub1_Sub3_3.method482();
					local179 = this.aClass1_Sub1_Sub3_3.method482();
					local340 = local179 >> 10 & 0x1F;
					local671 = local179 >> 5 & 0x1F;
					local348 = local179 & 0x1F;
					Class6.aClass6Array1[local175].anInt444 = (local340 << 19) + (local671 << 11) + (local348 << 3);
					this.anInt331 = -1;
					return true;
				}
				if (this.anInt331 == 16) {
					local175 = this.aClass1_Sub1_Sub3_3.method482();
					this.method219(local175);
					if (this.anInt203 != -1) {
						this.anInt203 = -1;
						this.aBoolean54 = true;
						this.aBoolean79 = true;
					}
					if (this.anInt261 != -1) {
						this.anInt261 = -1;
						this.aBoolean75 = true;
					}
					if (this.aBoolean82) {
						this.aBoolean82 = false;
						this.aBoolean75 = true;
					}
					this.anInt205 = local175;
					this.aBoolean90 = false;
					this.anInt331 = -1;
					return true;
				}
				if (this.anInt331 == 34) {
					this.anInt281 = 0;
					this.anInt331 = -1;
					return true;
				}
				if (this.anInt331 == 44) {
					this.anInt368 = this.aClass1_Sub1_Sub3_3.method485();
					this.anInt404 = this.aClass1_Sub1_Sub3_3.method482();
					this.anInt280 = this.aClass1_Sub1_Sub3_3.method480();
					this.anInt352 = this.aClass1_Sub1_Sub3_3.method482();
					this.anInt217 = this.aClass1_Sub1_Sub3_3.method480();
					if (this.anInt368 != 0 && this.anInt205 == -1) {
						signlink.dnslookup(Class48.method670((byte) 7, this.anInt368));
						this.method204();
						@Pc(2449) short local2449 = 650;
						if (this.anInt280 != 201 || this.anInt217 == 1) {
							local2449 = 655;
						}
						this.aString7 = "";
						this.aBoolean67 = false;
						for (local179 = 0; local179 < Class6.aClass6Array1.length; local179++) {
							if (Class6.aClass6Array1[local179] != null && Class6.aClass6Array1[local179].anInt433 == local2449) {
								this.anInt205 = Class6.aClass6Array1[local179].anInt430;
								break;
							}
						}
					}
					this.anInt331 = -1;
					return true;
				}
				if (this.anInt331 == 136) {
					for (local175 = 0; local175 < this.anIntArray33.length; local175++) {
						if (this.anIntArray33[local175] != this.anIntArray92[local175]) {
							this.anIntArray33[local175] = this.anIntArray92[local175];
							this.method121(local175);
							this.aBoolean54 = true;
						}
					}
					this.anInt331 = -1;
					return true;
				}
				if (this.anInt331 == 31) {
					local175 = this.aClass1_Sub1_Sub3_3.method482();
					if (local175 == 65535) {
						local175 = -1;
					}
					if (local175 != this.anInt418 && this.aBoolean65 && !aBoolean72 && this.anInt320 == 0) {
						this.anInt370 = local175;
						this.aBoolean76 = true;
						this.aClass44_Sub1_1.method645(2, this.anInt370);
					}
					this.anInt418 = local175;
					this.anInt331 = -1;
					return true;
				}
				if (this.anInt331 == 218) {
					local175 = this.aClass1_Sub1_Sub3_3.method482();
					local179 = this.aClass1_Sub1_Sub3_3.method482();
					if (this.aBoolean65 && !aBoolean72) {
						this.anInt370 = local175;
						this.aBoolean76 = false;
						this.aClass44_Sub1_1.method645(2, this.anInt370);
						this.anInt320 = local179;
					}
					this.anInt331 = -1;
					return true;
				}
				if (this.anInt331 == 235) {
					this.aBoolean54 = true;
					local175 = this.aClass1_Sub1_Sub3_3.method482();
					local879 = Class6.aClass6Array1[local175];
					local340 = this.aClass1_Sub1_Sub3_3.method482();
					for (local671 = 0; local671 < local340; local671++) {
						local879.anIntArray94[local671] = this.aClass1_Sub1_Sub3_3.method482();
						local348 = this.aClass1_Sub1_Sub3_3.method480();
						if (local348 == 255) {
							local348 = this.aClass1_Sub1_Sub3_3.method485();
						}
						local879.anIntArray95[local671] = local348;
					}
					for (local348 = local340; local348 < local879.anIntArray94.length; local348++) {
						local879.anIntArray94[local348] = 0;
						local879.anIntArray95[local348] = 0;
					}
					this.anInt331 = -1;
					return true;
				}
				if (this.anInt331 == 167) {
					local175 = this.aClass1_Sub1_Sub3_3.method482();
					local179 = this.aClass1_Sub1_Sub3_3.method483();
					local707 = Class6.aClass6Array1[local175];
					local707.anInt452 = local179;
					if (local179 == -1) {
						local707.anInt427 = 0;
						local707.anInt428 = 0;
					}
					this.anInt331 = -1;
					return true;
				}
				if (this.anInt331 == 169) {
					local175 = this.aClass1_Sub1_Sub3_3.method482();
					@Pc(2742) byte local2742 = this.aClass1_Sub1_Sub3_3.method481();
					this.anIntArray92[local175] = local2742;
					if (this.anIntArray33[local175] != local2742) {
						this.anIntArray33[local175] = local2742;
						this.method121(local175);
						this.aBoolean54 = true;
						if (this.anInt256 != -1) {
							this.aBoolean75 = true;
						}
					}
					this.anInt331 = -1;
					return true;
				}
				if (this.anInt331 == 66) {
					local175 = this.aClass1_Sub1_Sub3_3.method482();
					this.method219(local175);
					if (this.anInt261 != -1) {
						this.anInt261 = -1;
						this.aBoolean75 = true;
					}
					if (this.aBoolean82) {
						this.aBoolean82 = false;
						this.aBoolean75 = true;
					}
					this.anInt203 = local175;
					this.aBoolean54 = true;
					this.aBoolean79 = true;
					this.anInt205 = -1;
					this.aBoolean90 = false;
					this.anInt331 = -1;
					return true;
				}
				if (this.anInt331 == 214) {
					if (this.anInt312 == 12) {
						this.aBoolean54 = true;
					}
					this.anInt229 = this.aClass1_Sub1_Sub3_3.method483();
					this.anInt331 = -1;
					return true;
				}
				if (this.anInt331 == 109) {
					this.anInt421 = this.aClass1_Sub1_Sub3_3.method480();
					this.anInt422 = this.aClass1_Sub1_Sub3_3.method480();
					while (this.aClass1_Sub1_Sub3_3.anInt742 < this.anInt330) {
						local175 = this.aClass1_Sub1_Sub3_3.method480();
						this.method171(this.aClass1_Sub1_Sub3_3, local175);
					}
					this.anInt331 = -1;
					return true;
				}
				if (this.anInt331 == 221) {
					local175 = this.aClass1_Sub1_Sub3_3.method482();
					local179 = this.aClass1_Sub1_Sub3_3.method485();
					this.anIntArray92[local175] = local179;
					if (this.anIntArray33[local175] != local179) {
						this.anIntArray33[local175] = local179;
						this.method121(local175);
						this.aBoolean54 = true;
						if (this.anInt256 != -1) {
							this.aBoolean75 = true;
						}
					}
					this.anInt331 = -1;
					return true;
				}
				if (this.anInt331 == 89) {
					local175 = this.aClass1_Sub1_Sub3_3.method482();
					local179 = this.aClass1_Sub1_Sub3_3.method483();
					local340 = this.aClass1_Sub1_Sub3_3.method483();
					@Pc(2953) Class6 local2953 = Class6.aClass6Array1[local175];
					local2953.anInt436 = local179;
					local2953.anInt437 = local340;
					this.anInt331 = -1;
					return true;
				}
				if (this.anInt331 == 176) {
					this.anInt240 = this.aClass1_Sub1_Sub3_3.method482() * 30;
					this.anInt331 = -1;
					return true;
				}
				if (this.anInt331 == 107) {
					local175 = this.aClass1_Sub1_Sub3_3.method483();
					this.anInt256 = local175;
					this.aBoolean75 = true;
					this.anInt331 = -1;
					return true;
				}
				if (this.anInt331 == 122) {
					this.method115(this.aClass1_Sub1_Sub3_3, this.anInt330);
					this.aBoolean46 = false;
					this.anInt331 = -1;
					return true;
				}
				if (this.anInt331 == 139) {
					local175 = this.aClass1_Sub1_Sub3_3.method482();
					local179 = this.aClass1_Sub1_Sub3_3.method482();
					Class6.aClass6Array1[local175].anInt448 = 2;
					Class6.aClass6Array1[local175].anInt449 = local179;
					this.anInt331 = -1;
					return true;
				}
				if (this.anInt331 == 220) {
					this.aBoolean89 = true;
					this.anInt235 = this.aClass1_Sub1_Sub3_3.method480();
					this.anInt236 = this.aClass1_Sub1_Sub3_3.method480();
					this.anInt237 = this.aClass1_Sub1_Sub3_3.method482();
					this.anInt238 = this.aClass1_Sub1_Sub3_3.method480();
					this.anInt239 = this.aClass1_Sub1_Sub3_3.method480();
					if (this.anInt239 >= 100) {
						this.anInt251 = this.anInt235 * 128 + 64;
						this.anInt253 = this.anInt236 * 128 + 64;
						this.anInt252 = this.method181(this.aByte10, this.anInt361, this.anInt251, this.anInt253) - this.anInt237;
					}
					this.anInt331 = -1;
					return true;
				}
				if (this.anInt331 == 148) {
					for (local175 = 0; local175 < this.aClass1_Sub1_Sub1_Sub1_Sub1Array1.length; local175++) {
						if (this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local175] != null) {
							this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local175].anInt1004 = -1;
						}
					}
					for (local179 = 0; local179 < this.aClass1_Sub1_Sub1_Sub1_Sub2Array1.length; local179++) {
						if (this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local179] != null) {
							this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local179].anInt1004 = -1;
						}
					}
					this.anInt331 = -1;
					return true;
				}
				if (this.anInt331 == 127) {
					this.aBoolean89 = false;
					for (local175 = 0; local175 < 5; local175++) {
						this.aBooleanArray4[local175] = false;
					}
					this.anInt331 = -1;
					return true;
				}
				if (this.anInt331 == 22) {
					this.anInt423 = this.aClass1_Sub1_Sub3_3.method482();
					this.anInt372 = this.aClass1_Sub1_Sub3_3.method480();
					this.anInt331 = -1;
					return true;
				}
				if (this.anInt331 == 143) {
					local175 = this.aClass1_Sub1_Sub3_3.method482();
					local179 = this.aClass1_Sub1_Sub3_3.method482();
					local340 = this.aClass1_Sub1_Sub3_3.method482();
					if (local179 == 65535) {
						Class6.aClass6Array1[local175].anInt448 = 0;
						this.anInt331 = -1;
						return true;
					}
					@Pc(3244) Class15 local3244 = Class15.method361(local179);
					Class6.aClass6Array1[local175].anInt448 = 4;
					Class6.aClass6Array1[local175].anInt449 = local179;
					Class6.aClass6Array1[local175].anInt455 = local3244.anInt608;
					Class6.aClass6Array1[local175].anInt456 = local3244.anInt609;
					Class6.aClass6Array1[local175].anInt454 = local3244.anInt607 * 100 / local340;
					this.anInt331 = -1;
					return true;
				}
				if (this.anInt331 == 124) {
					this.aBoolean89 = true;
					this.anInt397 = this.aClass1_Sub1_Sub3_3.method480();
					this.anInt398 = this.aClass1_Sub1_Sub3_3.method480();
					this.anInt399 = this.aClass1_Sub1_Sub3_3.method482();
					this.anInt400 = this.aClass1_Sub1_Sub3_3.method480();
					this.anInt401 = this.aClass1_Sub1_Sub3_3.method480();
					if (this.anInt401 >= 100) {
						local175 = this.anInt397 * 128 + 64;
						local179 = this.anInt398 * 128 + 64;
						local340 = this.method181(this.aByte10, this.anInt361, local175, local179) - this.anInt399;
						local671 = local175 - this.anInt251;
						local348 = local340 - this.anInt252;
						local1018 = local179 - this.anInt253;
						local450 = (int) Math.sqrt((double) (local671 * local671 + local1018 * local1018));
						this.anInt254 = (int) (Math.atan2((double) local348, (double) local450) * 325.949D) & 0x7FF;
						this.anInt255 = (int) (Math.atan2((double) local671, (double) local1018) * -325.949D) & 0x7FF;
						if (this.anInt254 < 128) {
							this.anInt254 = 128;
						}
						if (this.anInt254 > 383) {
							this.anInt254 = 383;
						}
					}
					this.anInt331 = -1;
					return true;
				}
				if (this.anInt331 == 121) {
					local175 = this.aClass1_Sub1_Sub3_3.method482();
					local179 = this.aClass1_Sub1_Sub3_3.method482();
					if (this.anInt261 != -1) {
						this.anInt261 = -1;
						this.aBoolean75 = true;
					}
					if (this.aBoolean82) {
						this.aBoolean82 = false;
						this.aBoolean75 = true;
					}
					this.anInt205 = local175;
					this.anInt203 = local179;
					this.aBoolean54 = true;
					this.aBoolean79 = true;
					this.aBoolean90 = false;
					this.anInt331 = -1;
					return true;
				}
				if (this.anInt331 == 195) {
					if (this.anInt203 != -1) {
						this.anInt203 = -1;
						this.aBoolean54 = true;
						this.aBoolean79 = true;
					}
					if (this.anInt261 != -1) {
						this.anInt261 = -1;
						this.aBoolean75 = true;
					}
					if (this.aBoolean82) {
						this.aBoolean82 = false;
						this.aBoolean75 = true;
					}
					this.anInt205 = -1;
					this.aBoolean90 = false;
					this.anInt331 = -1;
					return true;
				}
				if (this.anInt331 == 244) {
					local3518 = this.aClass1_Sub1_Sub3_3.method487();
					@Pc(3532) long local3532;
					if (local3518.endsWith(":tradereq:")) {
						local782 = local3518.substring(0, local3518.indexOf(":"));
						local3532 = Class48.method667(local782);
						local1016 = false;
						for (local1018 = 0; local1018 < this.anInt348; local1018++) {
							if (this.aLongArray4[local1018] == local3532) {
								local1016 = true;
								break;
							}
						}
						if (!local1016 && this.anInt250 == 0) {
							this.method187(4, "wishes to trade with you.", local782);
						}
					} else if (local3518.endsWith(":duelreq:")) {
						local782 = local3518.substring(0, local3518.indexOf(":"));
						local3532 = Class48.method667(local782);
						local1016 = false;
						for (local1018 = 0; local1018 < this.anInt348; local1018++) {
							if (this.aLongArray4[local1018] == local3532) {
								local1016 = true;
								break;
							}
						}
						if (!local1016 && this.anInt250 == 0) {
							this.method187(8, "wishes to duel with you.", local782);
						}
					} else if (local3518.endsWith(":chalreq:")) {
						local782 = local3518.substring(0, local3518.indexOf(":"));
						local3532 = Class48.method667(local782);
						local1016 = false;
						for (local1018 = 0; local1018 < this.anInt348; local1018++) {
							if (this.aLongArray4[local1018] == local3532) {
								local1016 = true;
								break;
							}
						}
						if (!local1016 && this.anInt250 == 0) {
							local1085 = local3518.substring(local3518.indexOf(":") + 1, local3518.length() - 9);
							this.method187(8, local1085, local782);
						}
					} else {
						this.method187(0, local3518, "");
					}
					this.anInt331 = -1;
					return true;
				}
				if (this.anInt331 == 234) {
					local175 = this.aClass1_Sub1_Sub3_3.method480();
					local179 = this.aClass1_Sub1_Sub3_3.method480();
					local340 = this.aClass1_Sub1_Sub3_3.method480();
					local671 = this.aClass1_Sub1_Sub3_3.method480();
					this.aBooleanArray4[local175] = true;
					this.anIntArray59[local175] = local179;
					this.anIntArray56[local175] = local340;
					this.anIntArray89[local175] = local671;
					this.anIntArray62[local175] = 0;
					this.anInt331 = -1;
					return true;
				}
				if (this.anInt331 == 42) {
					this.aBoolean81 = false;
					this.aBoolean82 = true;
					this.aString11 = "";
					this.aBoolean75 = true;
					this.anInt331 = -1;
					return true;
				}
				if (this.anInt331 == 132) {
					local175 = this.aClass1_Sub1_Sub3_3.method483();
					if (local175 >= 0) {
						this.method219(local175);
					}
					this.anInt419 = local175;
					this.anInt331 = -1;
					return true;
				}
				if (this.anInt331 == 47) {
					if (this.anInt312 == 12) {
						this.aBoolean54 = true;
					}
					this.anInt266 = this.aClass1_Sub1_Sub3_3.method480();
					this.anInt331 = -1;
					return true;
				}
				if (this.anInt331 == 224) {
					this.anInt263 = this.aClass1_Sub1_Sub3_3.method480();
					this.aBoolean54 = true;
					this.anInt331 = -1;
					return true;
				}
				if (this.anInt331 == 180) {
					local175 = this.aClass1_Sub1_Sub3_3.method482();
					@Pc(3836) boolean local3836 = this.aClass1_Sub1_Sub3_3.method480() == 1;
					Class6.aClass6Array1[local175].aBoolean93 = local3836;
					this.anInt331 = -1;
					return true;
				}
				signlink.reporterror("T1 - " + this.anInt331 + "," + this.anInt330 + " - " + this.anInt258 + "," + this.anInt259);
				this.method118();
			} catch (@Pc(3875) IOException local3875) {
				this.method194((byte) 3);
			} catch (@Pc(3880) Exception local3880) {
				local3518 = "T2 - " + this.anInt331 + "," + this.anInt258 + "," + this.anInt259 + " - " + this.anInt330 + "," + (this.anInt244 + aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray272[0]) + "," + (this.anInt245 + aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray273[0]) + " - ";
				for (local179 = 0; local179 < this.anInt330 && local179 < 50; local179++) {
					local3518 = local3518 + this.aClass1_Sub1_Sub3_3.aByteArray9[local179] + ",";
				}
				signlink.reporterror(local3518);
				this.method118();
			}
			return true;
		} catch (@Pc(3961) RuntimeException local3961) {
			signlink.reporterror("63922, " + -67 + ", " + local3961.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(JI)V")
	private void method104(@OriginalArg(0) long arg0) {
		try {
			if (arg0 != 0L) {
				for (@Pc(8) int local8 = 0; local8 < this.anInt262; local8++) {
					if (this.aLongArray3[local8] == arg0) {
						this.anInt262--;
						this.aBoolean54 = true;
						for (@Pc(28) int local28 = local8; local28 < this.anInt262; local28++) {
							this.aStringArray1[local28] = this.aStringArray1[local28 + 1];
							this.anIntArray83[local28] = this.anIntArray83[local28 + 1];
							this.aLongArray3[local28] = this.aLongArray3[local28 + 1];
						}
						this.aClass1_Sub1_Sub3_2.method469(this.anInt208, 22);
						this.aClass1_Sub1_Sub3_2.method476(arg0, this.anInt402);
						break;
					}
				}
			}
		} catch (@Pc(89) RuntimeException local89) {
			signlink.reporterror("25054, " + arg0 + ", " + 9 + ", " + local89.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIIIII)V")
	private void method105(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		try {
			@Pc(5) int local5 = 2048 - arg0 & 0x7FF;
			@Pc(11) int local11 = 2048 - arg2 & 0x7FF;
			@Pc(13) int local13 = 0;
			@Pc(15) int local15 = 0;
			@Pc(17) int local17 = arg5;
			@Pc(23) int local23;
			@Pc(27) int local27;
			@Pc(37) int local37;
			if (local5 != 0) {
				local23 = Class1_Sub1_Sub1_Sub5.anIntArray151[local5];
				local27 = Class1_Sub1_Sub1_Sub5.anIntArray152[local5];
				local37 = local27 * 0 - arg5 * local23 >> 16;
				local17 = local23 * 0 + arg5 * local27 >> 16;
				local15 = local37;
			}
			if (local11 != 0) {
				local23 = Class1_Sub1_Sub1_Sub5.anIntArray151[local11];
				local27 = Class1_Sub1_Sub1_Sub5.anIntArray152[local11];
				local37 = local17 * local23 + local27 * 0 >> 16;
				local17 = local17 * local27 - local23 * 0 >> 16;
				local13 = local37;
			}
			this.anInt251 = arg3 - local13;
			this.anInt252 = arg4 - local15;
			this.anInt253 = arg1 - local17;
			this.anInt254 = arg0;
			this.anInt255 = arg2;
		} catch (@Pc(115) RuntimeException local115) {
			signlink.reporterror("64832, " + arg0 + ", " + 2 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local115.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Z)V")
	private void method106() {
		try {
			for (@Pc(6) Class1_Sub1_Sub1_Sub6 local6 = (Class1_Sub1_Sub1_Sub6) this.aClass29_2.method511(); local6 != null; local6 = (Class1_Sub1_Sub1_Sub6) this.aClass29_2.method513()) {
				if (local6.anInt533 != this.anInt361 || local6.aBoolean137) {
					local6.method673();
				} else if (anInt223 >= local6.anInt532) {
					local6.method301(this.anInt264);
					if (local6.aBoolean137) {
						local6.method673();
					} else {
						this.aClass37_1.method541(60, local6.anInt535, local6.anInt534, local6.anInt536, local6, 0, false, local6.anInt533, -1);
					}
				}
			}
		} catch (@Pc(72) RuntimeException local72) {
			signlink.reporterror("80857, " + true + ", " + local72.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "run", descriptor = "()V")
	@Override
	public void run() {
		if (this.aBoolean70) {
			this.method202();
		} else {
			super.run();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "()V")
	@Override
	protected void method89() {
		this.method96("Starting up", 20);
		if (signlink.sunjava) {
			super.anInt186 = 5;
		}
		if (aBoolean64) {
			this.aBoolean63 = true;
			return;
		}
		aBoolean64 = true;
		@Pc(21) boolean local21 = false;
		@Pc(25) String local25 = this.method137(anInt268);
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
			this.aBoolean56 = true;
			return;
		}
		if (signlink.aRandomAccessFile1 != null) {
			for (@Pc(95) int local95 = 0; local95 < 5; local95++) {
				this.aClass45Array1[local95] = new Class45(signlink.aRandomAccessFile1, (byte) 80, signlink.aRandomAccessFileArray1[local95], local95 + 1, 500000);
			}
		}
		try {
			this.method230();
			this.aClass47_1 = this.method170("title", "title screen", 1, this.anIntArray50[1], 25);
			this.aClass1_Sub1_Sub2_Sub4_1 = new Class1_Sub1_Sub2_Sub4(this.aClass47_1, false, "p11_full", 0);
			this.aClass1_Sub1_Sub2_Sub4_2 = new Class1_Sub1_Sub2_Sub4(this.aClass47_1, false, "p12_full", 0);
			this.aClass1_Sub1_Sub2_Sub4_3 = new Class1_Sub1_Sub2_Sub4(this.aClass47_1, false, "b12_full", 0);
			this.aClass1_Sub1_Sub2_Sub4_4 = new Class1_Sub1_Sub2_Sub4(this.aClass47_1, true, "q8_full", 0);
			this.method138();
			this.method109();
			@Pc(191) Class47 local191 = this.method170("config", "config", 2, this.anIntArray50[2], 30);
			@Pc(203) Class47 local203 = this.method170("interface", "interface", 3, this.anIntArray50[3], 35);
			@Pc(215) Class47 local215 = this.method170("media", "2d graphics", 4, this.anIntArray50[4], 40);
			@Pc(227) Class47 local227 = this.method170("textures", "textures", 6, this.anIntArray50[6], 45);
			@Pc(239) Class47 local239 = this.method170("wordenc", "chat system", 7, this.anIntArray50[7], 50);
			@Pc(251) Class47 local251 = this.method170("sounds", "sound effects", 8, this.anIntArray50[8], 55);
			this.aByteArrayArrayArray7 = new byte[4][104][104];
			this.anIntArrayArrayArray5 = new int[4][105][105];
			this.aClass37_1 = new Class37(this.anIntArrayArrayArray5, (byte) 92, 104, 104, 4);
			for (@Pc(276) int local276 = 0; local276 < 4; local276++) {
				this.aClass19Array1[local276] = new Class19(-85, 104, 104);
			}
			this.aClass1_Sub1_Sub2_Sub2_6 = new Class1_Sub1_Sub2_Sub2(512, 512);
			@Pc(311) Class47 local311 = this.method170("versionlist", "update list", 5, this.anIntArray50[5], 60);
			this.method96("Connecting to update server", 60);
			this.aClass44_Sub1_1 = new Class44_Sub1();
			this.aClass44_Sub1_1.method636(local311, this);
			Class12.method302(this.aClass44_Sub1_1.method639());
			Class1_Sub1_Sub1_Sub5.method258(this.aClass44_Sub1_1.method638(0), this.aClass44_Sub1_1);
			if (!aBoolean72) {
				this.anInt370 = 0;
				try {
					this.anInt370 = Integer.parseInt(this.getParameter("music"));
				} catch (@Pc(352) Exception local352) {
				}
				this.aBoolean76 = true;
				this.aClass44_Sub1_1.method645(2, this.anInt370);
				while (this.aClass44_Sub1_1.method646() > 0) {
					this.method120();
					try {
						Thread.sleep(100L);
					} catch (@Pc(370) Exception local370) {
					}
					if (this.aClass44_Sub1_1.anInt949 > 3) {
						this.method179("ondemand");
						return;
					}
				}
			}
			this.method96("Requesting animations", 65);
			@Pc(394) int local394 = this.aClass44_Sub1_1.method638(1);
			for (@Pc(396) int local396 = 0; local396 < local394; local396++) {
				this.aClass44_Sub1_1.method645(1, local396);
			}
			@Pc(415) int local415;
			while (this.aClass44_Sub1_1.method646() > 0) {
				local415 = local394 - this.aClass44_Sub1_1.method646();
				if (local415 > 0) {
					this.method96("Loading animations - " + local415 * 100 / local394 + "%", 65);
				}
				this.method120();
				try {
					Thread.sleep(100L);
				} catch (@Pc(441) Exception local441) {
				}
				if (this.aClass44_Sub1_1.anInt949 > 3) {
					this.method179("ondemand");
					return;
				}
			}
			this.method96("Requesting models", 70);
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
					this.method96("Loading models - " + local475 * 100 / local394 + "%", 70);
				}
				this.method120();
				try {
					Thread.sleep(100L);
				} catch (@Pc(526) Exception local526) {
				}
			}
			if (this.aClass45Array1[0] != null) {
				this.method96("Requesting maps", 75);
				this.aClass44_Sub1_1.method645(3, this.aClass44_Sub1_1.method640(47, 48, 0));
				this.aClass44_Sub1_1.method645(3, this.aClass44_Sub1_1.method640(47, 48, 1));
				this.aClass44_Sub1_1.method645(3, this.aClass44_Sub1_1.method640(48, 48, 0));
				this.aClass44_Sub1_1.method645(3, this.aClass44_Sub1_1.method640(48, 48, 1));
				this.aClass44_Sub1_1.method645(3, this.aClass44_Sub1_1.method640(49, 48, 0));
				this.aClass44_Sub1_1.method645(3, this.aClass44_Sub1_1.method640(49, 48, 1));
				this.aClass44_Sub1_1.method645(3, this.aClass44_Sub1_1.method640(47, 47, 0));
				this.aClass44_Sub1_1.method645(3, this.aClass44_Sub1_1.method640(47, 47, 1));
				this.aClass44_Sub1_1.method645(3, this.aClass44_Sub1_1.method640(48, 47, 0));
				this.aClass44_Sub1_1.method645(3, this.aClass44_Sub1_1.method640(48, 47, 1));
				this.aClass44_Sub1_1.method645(3, this.aClass44_Sub1_1.method640(48, 148, 0));
				this.aClass44_Sub1_1.method645(3, this.aClass44_Sub1_1.method640(48, 148, 1));
				local394 = this.aClass44_Sub1_1.method646();
				while (this.aClass44_Sub1_1.method646() > 0) {
					local475 = local394 - this.aClass44_Sub1_1.method646();
					if (local475 > 0) {
						this.method96("Loading maps - " + local475 * 100 / local394 + "%", 75);
					}
					this.method120();
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
					this.aClass44_Sub1_1.method648(local734, 0, local475);
				}
			}
			this.aClass44_Sub1_1.method641(aBoolean71);
			if (!aBoolean72) {
				local394 = this.aClass44_Sub1_1.method638(2);
				for (local732 = 1; local732 < local394; local732++) {
					if (this.aClass44_Sub1_1.method644(local732)) {
						this.aClass44_Sub1_1.method648((byte) 1, 2, local732);
					}
				}
			}
			this.method96("Unpacking media", 80);
			this.aClass1_Sub1_Sub2_Sub3_15 = new Class1_Sub1_Sub2_Sub3(local215, "invback", 0);
			this.aClass1_Sub1_Sub2_Sub3_17 = new Class1_Sub1_Sub2_Sub3(local215, "chatback", 0);
			this.aClass1_Sub1_Sub2_Sub3_16 = new Class1_Sub1_Sub2_Sub3(local215, "mapback", 0);
			this.aClass1_Sub1_Sub2_Sub3_18 = new Class1_Sub1_Sub2_Sub3(local215, "backbase1", 0);
			this.aClass1_Sub1_Sub2_Sub3_19 = new Class1_Sub1_Sub2_Sub3(local215, "backbase2", 0);
			this.aClass1_Sub1_Sub2_Sub3_20 = new Class1_Sub1_Sub2_Sub3(local215, "backhmid1", 0);
			for (local732 = 0; local732 < 13; local732++) {
				this.aClass1_Sub1_Sub2_Sub3Array4[local732] = new Class1_Sub1_Sub2_Sub3(local215, "sideicons", local732);
			}
			this.aClass1_Sub1_Sub2_Sub2_14 = new Class1_Sub1_Sub2_Sub2(local215, "compass", 0);
			this.aClass1_Sub1_Sub2_Sub2_5 = new Class1_Sub1_Sub2_Sub2(local215, "mapedge", 0);
			this.aClass1_Sub1_Sub2_Sub2_5.method388();
			@Pc(934) int local934;
			try {
				for (local934 = 0; local934 < 100; local934++) {
					this.aClass1_Sub1_Sub2_Sub3Array3[local934] = new Class1_Sub1_Sub2_Sub3(local215, "mapscene", local934);
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
					this.aClass1_Sub1_Sub2_Sub2Array4[local934] = new Class1_Sub1_Sub2_Sub2(local215, "hitmarks", local934);
				}
			} catch (@Pc(992) Exception local992) {
			}
			try {
				for (local934 = 0; local934 < 20; local934++) {
					this.aClass1_Sub1_Sub2_Sub2Array6[local934] = new Class1_Sub1_Sub2_Sub2(local215, "headicons", local934);
				}
			} catch (@Pc(1012) Exception local1012) {
			}
			this.aClass1_Sub1_Sub2_Sub2_12 = new Class1_Sub1_Sub2_Sub2(local215, "mapmarker", 0);
			this.aClass1_Sub1_Sub2_Sub2_13 = new Class1_Sub1_Sub2_Sub2(local215, "mapmarker", 1);
			for (local934 = 0; local934 < 8; local934++) {
				this.aClass1_Sub1_Sub2_Sub2Array7[local934] = new Class1_Sub1_Sub2_Sub2(local215, "cross", local934);
			}
			this.aClass1_Sub1_Sub2_Sub2_7 = new Class1_Sub1_Sub2_Sub2(local215, "mapdots", 0);
			this.aClass1_Sub1_Sub2_Sub2_8 = new Class1_Sub1_Sub2_Sub2(local215, "mapdots", 1);
			this.aClass1_Sub1_Sub2_Sub2_9 = new Class1_Sub1_Sub2_Sub2(local215, "mapdots", 2);
			this.aClass1_Sub1_Sub2_Sub2_10 = new Class1_Sub1_Sub2_Sub2(local215, "mapdots", 3);
			this.aClass1_Sub1_Sub2_Sub2_11 = new Class1_Sub1_Sub2_Sub2(local215, "mapdots", 4);
			this.aClass1_Sub1_Sub2_Sub3_13 = new Class1_Sub1_Sub2_Sub3(local215, "scrollbar", 0);
			this.aClass1_Sub1_Sub2_Sub3_14 = new Class1_Sub1_Sub2_Sub3(local215, "scrollbar", 1);
			this.aClass1_Sub1_Sub2_Sub3_6 = new Class1_Sub1_Sub2_Sub3(local215, "redstone1", 0);
			this.aClass1_Sub1_Sub2_Sub3_7 = new Class1_Sub1_Sub2_Sub3(local215, "redstone2", 0);
			this.aClass1_Sub1_Sub2_Sub3_8 = new Class1_Sub1_Sub2_Sub3(local215, "redstone3", 0);
			this.aClass1_Sub1_Sub2_Sub3_9 = new Class1_Sub1_Sub2_Sub3(local215, "redstone1", 0);
			this.aClass1_Sub1_Sub2_Sub3_9.method415();
			this.aClass1_Sub1_Sub2_Sub3_10 = new Class1_Sub1_Sub2_Sub3(local215, "redstone2", 0);
			this.aClass1_Sub1_Sub2_Sub3_10.method415();
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
				this.aClass1_Sub1_Sub2_Sub3Array1[local1220] = new Class1_Sub1_Sub2_Sub3(local215, "mod_icons", local1220);
			}
			@Pc(1243) Class1_Sub1_Sub2_Sub2 local1243 = new Class1_Sub1_Sub2_Sub2(local215, "backleft1", 0);
			this.aClass35_3 = new Class35(local1243.anInt652, 5, local1243.anInt653, this.method94());
			local1243.method389(anInt329, 0, 0);
			@Pc(1268) Class1_Sub1_Sub2_Sub2 local1268 = new Class1_Sub1_Sub2_Sub2(local215, "backleft2", 0);
			this.aClass35_4 = new Class35(local1268.anInt652, 5, local1268.anInt653, this.method94());
			local1268.method389(anInt329, 0, 0);
			@Pc(1293) Class1_Sub1_Sub2_Sub2 local1293 = new Class1_Sub1_Sub2_Sub2(local215, "backright1", 0);
			this.aClass35_5 = new Class35(local1293.anInt652, 5, local1293.anInt653, this.method94());
			local1293.method389(anInt329, 0, 0);
			@Pc(1318) Class1_Sub1_Sub2_Sub2 local1318 = new Class1_Sub1_Sub2_Sub2(local215, "backright2", 0);
			this.aClass35_6 = new Class35(local1318.anInt652, 5, local1318.anInt653, this.method94());
			local1318.method389(anInt329, 0, 0);
			@Pc(1343) Class1_Sub1_Sub2_Sub2 local1343 = new Class1_Sub1_Sub2_Sub2(local215, "backtop1", 0);
			this.aClass35_7 = new Class35(local1343.anInt652, 5, local1343.anInt653, this.method94());
			local1343.method389(anInt329, 0, 0);
			@Pc(1368) Class1_Sub1_Sub2_Sub2 local1368 = new Class1_Sub1_Sub2_Sub2(local215, "backvmid1", 0);
			this.aClass35_8 = new Class35(local1368.anInt652, 5, local1368.anInt653, this.method94());
			local1368.method389(anInt329, 0, 0);
			@Pc(1393) Class1_Sub1_Sub2_Sub2 local1393 = new Class1_Sub1_Sub2_Sub2(local215, "backvmid2", 0);
			this.aClass35_9 = new Class35(local1393.anInt652, 5, local1393.anInt653, this.method94());
			local1393.method389(anInt329, 0, 0);
			@Pc(1418) Class1_Sub1_Sub2_Sub2 local1418 = new Class1_Sub1_Sub2_Sub2(local215, "backvmid3", 0);
			this.aClass35_10 = new Class35(local1418.anInt652, 5, local1418.anInt653, this.method94());
			local1418.method389(anInt329, 0, 0);
			@Pc(1443) Class1_Sub1_Sub2_Sub2 local1443 = new Class1_Sub1_Sub2_Sub2(local215, "backhmid2", 0);
			this.aClass35_11 = new Class35(local1443.anInt652, 5, local1443.anInt653, this.method94());
			local1443.method389(anInt329, 0, 0);
			@Pc(1468) int local1468 = (int) (Math.random() * 21.0D) - 10;
			@Pc(1475) int local1475 = (int) (Math.random() * 21.0D) - 10;
			@Pc(1482) int local1482 = (int) (Math.random() * 21.0D) - 10;
			@Pc(1489) int local1489 = (int) (Math.random() * 41.0D) - 20;
			for (@Pc(1491) int local1491 = 0; local1491 < 100; local1491++) {
				if (this.aClass1_Sub1_Sub2_Sub2Array3[local1491] != null) {
					this.aClass1_Sub1_Sub2_Sub2Array3[local1491].method387(local1468 + local1489, local1482 + local1489, local1475 + local1489);
				}
				if (this.aClass1_Sub1_Sub2_Sub3Array3[local1491] != null) {
					this.aClass1_Sub1_Sub2_Sub3Array3[local1491].method417(local1468 + local1489, local1482 + local1489, local1475 + local1489);
				}
			}
			this.method96("Unpacking textures", 83);
			Class1_Sub1_Sub2_Sub1.method347(local227);
			Class1_Sub1_Sub2_Sub1.method351(0.8D);
			Class1_Sub1_Sub2_Sub1.method346();
			this.method96("Unpacking config", 86);
			Class27.method505(local191);
			Class9.method286(local191);
			Class21.method462(local191);
			Class15.method359(local191);
			Class13.method321(local191);
			Class23.method496(local191);
			Class33.method521(local191);
			Class39.method589(local191);
			Class36.method527(local191);
			Class15.aBoolean157 = aBoolean71;
			if (!aBoolean72) {
				this.method96("Unpacking sounds", 90);
				@Pc(1594) byte[] local1594 = local251.method666("sounds.dat", null);
				@Pc(1600) Class1_Sub1_Sub3 local1600 = new Class1_Sub1_Sub3(local1594, 58);
				Class5.method78(local1600);
			}
			this.method96("Unpacking interfaces", 95);
			@Pc(1631) Class1_Sub1_Sub2_Sub4[] local1631 = new Class1_Sub1_Sub2_Sub4[] { this.aClass1_Sub1_Sub2_Sub4_1, this.aClass1_Sub1_Sub2_Sub4_2, this.aClass1_Sub1_Sub2_Sub4_3, this.aClass1_Sub1_Sub2_Sub4_4 };
			Class6.method231((byte) 3, local1631, local203, local215);
			this.method96("Preparing game engine", 100);
			@Pc(1647) int local1647;
			@Pc(1649) int local1649;
			@Pc(1651) int local1651;
			for (@Pc(1643) int local1643 = 0; local1643 < 33; local1643++) {
				local1647 = 999;
				local1649 = 0;
				for (local1651 = 0; local1651 < 34; local1651++) {
					if (this.aClass1_Sub1_Sub2_Sub3_16.aByteArray7[local1651 + local1643 * this.aClass1_Sub1_Sub2_Sub3_16.anInt677] == 0) {
						if (local1647 == 999) {
							local1647 = local1651;
						}
					} else if (local1647 != 999) {
						local1649 = local1651;
						break;
					}
				}
				this.anIntArray85[local1643] = local1647;
				this.anIntArray66[local1643] = local1649 - local1647;
			}
			@Pc(1709) int local1709;
			for (local1647 = 5; local1647 < 156; local1647++) {
				local1649 = 999;
				local1651 = 0;
				for (local1709 = 25; local1709 < 172; local1709++) {
					if (this.aClass1_Sub1_Sub2_Sub3_16.aByteArray7[local1709 + local1647 * this.aClass1_Sub1_Sub2_Sub3_16.anInt677] == 0 && (local1709 > 34 || local1647 > 34)) {
						if (local1649 == 999) {
							local1649 = local1709;
						}
					} else if (local1649 != 999) {
						local1651 = local1709;
						break;
					}
				}
				this.anIntArray38[local1647 - 5] = local1649 - 25;
				this.anIntArray68[local1647 - 5] = local1651 - local1649;
			}
			Class1_Sub1_Sub2_Sub1.method344(479, 96);
			this.anIntArray47 = Class1_Sub1_Sub2_Sub1.anIntArray180;
			Class1_Sub1_Sub2_Sub1.method344(190, 261);
			this.anIntArray48 = Class1_Sub1_Sub2_Sub1.anIntArray180;
			Class1_Sub1_Sub2_Sub1.method344(512, 334);
			this.anIntArray49 = Class1_Sub1_Sub2_Sub1.anIntArray180;
			@Pc(1793) int[] local1793 = new int[9];
			for (local1651 = 0; local1651 < 9; local1651++) {
				local1709 = local1651 * 32 + 128 + 15;
				@Pc(1811) int local1811 = local1709 * 3 + 600;
				@Pc(1815) int local1815 = Class1_Sub1_Sub2_Sub1.anIntArray178[local1709];
				local1793[local1651] = local1811 * local1815 >> 16;
			}
			Class37.method566(local1793);
			Class42.method594(local239);
			this.aClass11_1 = new Class11(anInt351, this);
			this.method95(this.aClass11_1, 10);
			Class1_Sub1_Sub1_Sub2.aClient1 = this;
			Class9.aClient2 = this;
			Class13.aClient4 = this;
		} catch (@Pc(1856) Exception local1856) {
			signlink.reporterror("loaderror " + this.aString9 + " " + this.anInt207);
			this.aBoolean48 = true;
		}
	}

	@OriginalMember(owner = "client!client", name = "f", descriptor = "(I)V")
	private void method108() {
		try {
			anInt358++;
			if (this.anInt214 <= 6 && this.anInt214 >= 6) {
				if (anInt358 > 192) {
					anInt358 = 0;
					this.aClass1_Sub1_Sub3_2.method469(this.anInt208, 166);
					this.aClass1_Sub1_Sub3_2.method470(232);
				}
				while (true) {
					@Pc(33) int local33;
					do {
						while (true) {
							local33 = this.method88();
							if (local33 == -1) {
								return;
							}
							if (this.anInt205 != -1 && this.anInt205 == this.anInt414) {
								if (local33 == 8 && this.aString7.length() > 0) {
									this.aString7 = this.aString7.substring(0, this.aString7.length() - 1);
								}
								break;
							}
							@Pc(214) int local214;
							if (this.aBoolean81) {
								if (local33 >= 32 && local33 <= 122 && this.aString12.length() < 80) {
									this.aString12 = this.aString12 + (char) local33;
									this.aBoolean75 = true;
								}
								if (local33 == 8 && this.aString12.length() > 0) {
									this.aString12 = this.aString12.substring(0, this.aString12.length() - 1);
									this.aBoolean75 = true;
								}
								if (local33 == 13 || local33 == 10) {
									this.aBoolean81 = false;
									this.aBoolean75 = true;
									@Pc(173) long local173;
									if (this.anInt216 == 1) {
										local173 = Class48.method667(this.aString12);
										this.method186(local173);
									}
									if (this.anInt216 == 2 && this.anInt262 > 0) {
										local173 = Class48.method667(this.aString12);
										this.method104(local173);
									}
									if (this.anInt216 == 3 && this.aString12.length() > 0) {
										this.aClass1_Sub1_Sub3_2.method469(this.anInt208, 165);
										this.aClass1_Sub1_Sub3_2.method470(0);
										local214 = this.aClass1_Sub1_Sub3_2.anInt742;
										this.aClass1_Sub1_Sub3_2.method476(this.aLong14, this.anInt402);
										Class49.method684(this.aClass1_Sub1_Sub3_2, this.aString12);
										this.aClass1_Sub1_Sub3_2.method479(this.aClass1_Sub1_Sub3_2.anInt742 - local214);
										this.aString12 = Class49.method685(this.aString12);
										this.aString12 = Class42.method604(this.aString12);
										this.method187(6, this.aString12, Class48.method671(Class48.method668(this.aLong14), 789));
										if (this.anInt294 == 2) {
											this.anInt294 = 1;
											this.aBoolean85 = true;
											this.aClass1_Sub1_Sub3_2.method469(this.anInt208, 215);
											this.aClass1_Sub1_Sub3_2.method470(this.anInt377);
											this.aClass1_Sub1_Sub3_2.method470(this.anInt294);
											this.aClass1_Sub1_Sub3_2.method470(this.anInt355);
										}
									}
									if (this.anInt216 == 4 && this.anInt348 < 100) {
										local173 = Class48.method667(this.aString12);
										this.method192(local173);
									}
									if (this.anInt216 == 5 && this.anInt348 > 0) {
										local173 = Class48.method667(this.aString12);
										this.method136(local173);
									}
								}
							} else if (this.aBoolean82) {
								if (local33 >= 48 && local33 <= 57 && this.aString11.length() < 10) {
									this.aString11 = this.aString11 + (char) local33;
									this.aBoolean75 = true;
								}
								if (local33 == 8 && this.aString11.length() > 0) {
									this.aString11 = this.aString11.substring(0, this.aString11.length() - 1);
									this.aBoolean75 = true;
								}
								if (local33 == 13 || local33 == 10) {
									if (this.aString11.length() > 0) {
										local214 = 0;
										try {
											local214 = Integer.parseInt(this.aString11);
										} catch (@Pc(392) Exception local392) {
										}
										this.aClass1_Sub1_Sub3_2.method469(this.anInt208, 112);
										this.aClass1_Sub1_Sub3_2.method474(local214);
									}
									this.aBoolean82 = false;
									this.aBoolean75 = true;
								}
							} else if (this.anInt261 == -1) {
								if (local33 >= 32 && local33 <= 122 && this.aString10.length() < 80) {
									this.aString10 = this.aString10 + (char) local33;
									this.aBoolean75 = true;
								}
								if (local33 == 8 && this.aString10.length() > 0) {
									this.aString10 = this.aString10.substring(0, this.aString10.length() - 1);
									this.aBoolean75 = true;
								}
								if ((local33 == 13 || local33 == 10) && this.aString10.length() > 0) {
									if (this.anInt306 == 2) {
										if (this.aString10.equals("::clientdrop")) {
											this.method194((byte) 3);
										}
										if (this.aString10.equals("::lag")) {
											this.method124();
										}
										if (this.aString10.equals("::prefetchmusic")) {
											for (local214 = 0; local214 < this.aClass44_Sub1_1.method638(2); local214++) {
												this.aClass44_Sub1_1.method648((byte) 1, 2, local214);
											}
										}
										if (this.aString10.equals("::fpson")) {
											aBoolean74 = true;
										}
										if (this.aString10.equals("::fpsoff")) {
											aBoolean74 = false;
										}
									}
									if (this.aString10.startsWith("::")) {
										this.aClass1_Sub1_Sub3_2.method469(this.anInt208, 78);
										this.aClass1_Sub1_Sub3_2.method470(this.aString10.length() - 1);
										this.aClass1_Sub1_Sub3_2.method477(this.aString10.substring(2));
									} else {
										@Pc(561) String local561 = this.aString10.toLowerCase();
										@Pc(563) byte local563 = 0;
										if (local561.startsWith("yellow:")) {
											local563 = 0;
											this.aString10 = this.aString10.substring(7);
										} else if (local561.startsWith("red:")) {
											local563 = 1;
											this.aString10 = this.aString10.substring(4);
										} else if (local561.startsWith("green:")) {
											local563 = 2;
											this.aString10 = this.aString10.substring(6);
										} else if (local561.startsWith("cyan:")) {
											local563 = 3;
											this.aString10 = this.aString10.substring(5);
										} else if (local561.startsWith("purple:")) {
											local563 = 4;
											this.aString10 = this.aString10.substring(7);
										} else if (local561.startsWith("white:")) {
											local563 = 5;
											this.aString10 = this.aString10.substring(6);
										} else if (local561.startsWith("flash1:")) {
											local563 = 6;
											this.aString10 = this.aString10.substring(7);
										} else if (local561.startsWith("flash2:")) {
											local563 = 7;
											this.aString10 = this.aString10.substring(7);
										} else if (local561.startsWith("flash3:")) {
											local563 = 8;
											this.aString10 = this.aString10.substring(7);
										} else if (local561.startsWith("glow1:")) {
											local563 = 9;
											this.aString10 = this.aString10.substring(6);
										} else if (local561.startsWith("glow2:")) {
											local563 = 10;
											this.aString10 = this.aString10.substring(6);
										} else if (local561.startsWith("glow3:")) {
											local563 = 11;
											this.aString10 = this.aString10.substring(6);
										}
										local561 = this.aString10.toLowerCase();
										@Pc(735) byte local735 = 0;
										if (local561.startsWith("wave:")) {
											local735 = 1;
											this.aString10 = this.aString10.substring(5);
										} else if (local561.startsWith("wave2:")) {
											local735 = 2;
											this.aString10 = this.aString10.substring(6);
										} else if (local561.startsWith("shake:")) {
											local735 = 3;
											this.aString10 = this.aString10.substring(6);
										} else if (local561.startsWith("scroll:")) {
											local735 = 4;
											this.aString10 = this.aString10.substring(7);
										} else if (local561.startsWith("slide:")) {
											local735 = 5;
											this.aString10 = this.aString10.substring(6);
										}
										this.aClass1_Sub1_Sub3_2.method469(this.anInt208, 233);
										this.aClass1_Sub1_Sub3_2.method470(0);
										@Pc(817) int local817 = this.aClass1_Sub1_Sub3_2.anInt742;
										this.aClass1_Sub1_Sub3_2.method470(local563);
										this.aClass1_Sub1_Sub3_2.method470(local735);
										Class49.method684(this.aClass1_Sub1_Sub3_2, this.aString10);
										this.aClass1_Sub1_Sub3_2.method479(this.aClass1_Sub1_Sub3_2.anInt742 - local817);
										this.aString10 = Class49.method685(this.aString10);
										this.aString10 = Class42.method604(this.aString10);
										aClass1_Sub1_Sub1_Sub1_Sub1_1.aString31 = this.aString10;
										aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt993 = local563;
										aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt994 = local735;
										aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt992 = 150;
										if (this.anInt306 == 2) {
											this.method187(2, aClass1_Sub1_Sub1_Sub1_Sub1_1.aString31, "@cr2@" + aClass1_Sub1_Sub1_Sub1_Sub1_1.aString3);
										} else if (this.anInt306 == 1) {
											this.method187(2, aClass1_Sub1_Sub1_Sub1_Sub1_1.aString31, "@cr1@" + aClass1_Sub1_Sub1_Sub1_Sub1_1.aString3);
										} else {
											this.method187(2, aClass1_Sub1_Sub1_Sub1_Sub1_1.aString31, aClass1_Sub1_Sub1_Sub1_Sub1_1.aString3);
										}
										if (this.anInt377 == 2) {
											this.anInt377 = 3;
											this.aBoolean85 = true;
											this.aClass1_Sub1_Sub3_2.method469(this.anInt208, 215);
											this.aClass1_Sub1_Sub3_2.method470(this.anInt377);
											this.aClass1_Sub1_Sub3_2.method470(this.anInt294);
											this.aClass1_Sub1_Sub3_2.method470(this.anInt355);
										}
									}
									this.aString10 = "";
									this.aBoolean75 = true;
								}
							}
						}
					} while ((local33 < 97 || local33 > 122) && (local33 < 65 || local33 > 90) && (local33 < 48 || local33 > 57) && local33 != 32);
					if (this.aString7.length() < 12) {
						this.aString7 = this.aString7 + (char) local33;
					}
				}
			}
		} catch (@Pc(954) RuntimeException local954) {
			signlink.reporterror("76985, " + 6 + ", " + local954.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "init", descriptor = "()V")
	@Override
	public void init() {
		anInt362 = Integer.parseInt(this.getParameter("nodeid"));
		anInt363 = Integer.parseInt(this.getParameter("portoff"));
		@Pc(15) String local15 = this.getParameter("lowmem");
		if (local15 != null && local15.equals("1")) {
			method146();
		} else {
			method188();
		}
		@Pc(31) String local31 = this.getParameter("free");
		if (local31 != null && local31.equals("1")) {
			aBoolean71 = false;
		} else {
			aBoolean71 = true;
		}
		this.method85();
	}

	@OriginalMember(owner = "client!client", name = "g", descriptor = "(I)V")
	private void method109() {
		try {
			this.aClass1_Sub1_Sub2_Sub3_11 = new Class1_Sub1_Sub2_Sub3(this.aClass47_1, "titlebox", 0);
			this.aClass1_Sub1_Sub2_Sub3_12 = new Class1_Sub1_Sub2_Sub3(this.aClass47_1, "titlebutton", 0);
			this.aClass1_Sub1_Sub2_Sub3Array2 = new Class1_Sub1_Sub2_Sub3[12];
			@Pc(25) int local25 = 0;
			try {
				local25 = Integer.parseInt(this.getParameter("fl_icon"));
			} catch (@Pc(32) Exception local32) {
			}
			@Pc(36) int local36;
			if (local25 == 0) {
				for (local36 = 0; local36 < 12; local36++) {
					this.aClass1_Sub1_Sub2_Sub3Array2[local36] = new Class1_Sub1_Sub2_Sub3(this.aClass47_1, "runes", local36);
				}
			} else {
				for (local36 = 0; local36 < 12; local36++) {
					this.aClass1_Sub1_Sub2_Sub3Array2[local36] = new Class1_Sub1_Sub2_Sub3(this.aClass47_1, "runes", (local36 & 0x3) + 12);
				}
			}
			this.aClass1_Sub1_Sub2_Sub2_3 = new Class1_Sub1_Sub2_Sub2(128, 265);
			this.aClass1_Sub1_Sub2_Sub2_4 = new Class1_Sub1_Sub2_Sub2(128, 265);
			for (local36 = 0; local36 < 33920; local36++) {
				this.aClass1_Sub1_Sub2_Sub2_3.anIntArray208[local36] = this.aClass35_19.anIntArray231[local36];
			}
			for (@Pc(116) int local116 = 0; local116 < 33920; local116++) {
				this.aClass1_Sub1_Sub2_Sub2_4.anIntArray208[local116] = this.aClass35_20.anIntArray231[local116];
			}
			this.anIntArray80 = new int[256];
			for (@Pc(138) int local138 = 0; local138 < 64; local138++) {
				this.anIntArray80[local138] = local138 * 262144;
			}
			for (@Pc(153) int local153 = 0; local153 < 64; local153++) {
				this.anIntArray80[local153 + 64] = local153 * 1024 + 16711680;
			}
			for (@Pc(172) int local172 = 0; local172 < 64; local172++) {
				this.anIntArray80[local172 + 128] = local172 * 4 + 16776960;
			}
			for (@Pc(191) int local191 = 0; local191 < 64; local191++) {
				this.anIntArray80[local191 + 192] = 16777215;
			}
			this.anIntArray81 = new int[256];
			for (@Pc(210) int local210 = 0; local210 < 64; local210++) {
				this.anIntArray81[local210] = local210 * 1024;
			}
			for (@Pc(225) int local225 = 0; local225 < 64; local225++) {
				this.anIntArray81[local225 + 64] = local225 * 4 + 65280;
			}
			for (@Pc(244) int local244 = 0; local244 < 64; local244++) {
				this.anIntArray81[local244 + 128] = local244 * 262144 + 65535;
			}
			for (@Pc(263) int local263 = 0; local263 < 64; local263++) {
				this.anIntArray81[local263 + 192] = 16777215;
			}
			this.anIntArray82 = new int[256];
			for (@Pc(282) int local282 = 0; local282 < 64; local282++) {
				this.anIntArray82[local282] = local282 * 4;
			}
			for (@Pc(297) int local297 = 0; local297 < 64; local297++) {
				this.anIntArray82[local297 + 64] = local297 * 262144 + 255;
			}
			for (@Pc(316) int local316 = 0; local316 < 64; local316++) {
				this.anIntArray82[local316 + 128] = local316 * 1024 + 16711935;
			}
			for (@Pc(335) int local335 = 0; local335 < 64; local335++) {
				this.anIntArray82[local335 + 192] = 16777215;
			}
			this.anIntArray79 = new int[256];
			this.anIntArray45 = new int[32768];
			this.anIntArray46 = new int[32768];
			this.method140(null);
			this.anIntArray64 = new int[32768];
			this.anIntArray65 = new int[32768];
			this.method96("Connecting to fileserver", 10);
			if (!this.aBoolean87) {
				this.aBoolean70 = true;
				this.aBoolean87 = true;
				this.method95(this, 2);
			}
		} catch (@Pc(392) RuntimeException local392) {
			signlink.reporterror("87850, " + -13665 + ", " + local392.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(IZ)V")
	private void method110(@OriginalArg(0) int arg0) {
		try {
			if (arg0 >= 0) {
				if (this.aBoolean82) {
					this.aBoolean82 = false;
					this.aBoolean75 = true;
				}
				@Pc(18) int local18 = this.anIntArray34[arg0];
				@Pc(23) int local23 = this.anIntArray35[arg0];
				@Pc(28) int local28 = this.anIntArray36[arg0];
				@Pc(33) int local33 = this.anIntArray37[arg0];
				if (local28 >= 2000) {
					local28 -= 2000;
				}
				if (local28 == 357) {
					this.method119(local18, local23, 123, local33, 845);
				}
				if (local28 == 563) {
					this.aClass1_Sub1_Sub3_2.method469(this.anInt208, 216);
					this.aClass1_Sub1_Sub3_2.method471(local33);
					this.aClass1_Sub1_Sub3_2.method471(local18);
					this.aClass1_Sub1_Sub3_2.method471(local23);
					this.aClass1_Sub1_Sub3_2.method471(this.anInt407);
					this.anInt392 = 0;
					this.anInt393 = local23;
					this.anInt394 = local18;
					this.anInt395 = 2;
					if (Class6.aClass6Array1[local23].anInt430 == this.anInt205) {
						this.anInt395 = 1;
					}
					if (Class6.aClass6Array1[local23].anInt430 == this.anInt261) {
						this.anInt395 = 3;
					}
				}
				@Pc(142) boolean local142;
				if (local28 == 139 || local28 == 778 || local28 == 617 || local28 == 224 || local28 == 662) {
					local142 = this.method178(aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray273[0], 0, 0, 0, false, 2, aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray272[0], local18, 0, local23, 0);
					if (!local142) {
						this.method178(aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray273[0], 0, 0, 1, false, 2, aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray272[0], local18, 1, local23, 0);
					}
					this.anInt343 = super.anInt198;
					this.anInt344 = super.anInt199;
					this.anInt346 = 2;
					this.anInt345 = 0;
					if (local28 == 617) {
						this.aClass1_Sub1_Sub3_2.method469(this.anInt208, 66);
					}
					if (local28 == 778) {
						this.aClass1_Sub1_Sub3_2.method469(this.anInt208, 203);
					}
					if (local28 == 139) {
						if ((local18 & 0x3) == 0) {
							anInt276++;
						}
						if (anInt276 >= 123) {
							this.aClass1_Sub1_Sub3_2.method469(this.anInt208, 237);
							this.aClass1_Sub1_Sub3_2.method474(0);
						}
						this.aClass1_Sub1_Sub3_2.method469(this.anInt208, 21);
					}
					if (local28 == 224) {
						anInt273 += local23;
						if (anInt273 >= 75) {
							this.aClass1_Sub1_Sub3_2.method469(this.anInt208, 184);
							this.aClass1_Sub1_Sub3_2.method470(19);
						}
						this.aClass1_Sub1_Sub3_2.method469(this.anInt208, 204);
					}
					if (local28 == 662) {
						anInt405 += this.anInt245;
						if (anInt405 >= 118) {
							this.aClass1_Sub1_Sub3_2.method469(this.anInt208, 122);
							this.aClass1_Sub1_Sub3_2.method474(0);
						}
						this.aClass1_Sub1_Sub3_2.method469(this.anInt208, 205);
					}
					this.aClass1_Sub1_Sub3_2.method471(local18 + this.anInt244);
					this.aClass1_Sub1_Sub3_2.method471(local23 + this.anInt245);
					this.aClass1_Sub1_Sub3_2.method471(local33);
				}
				if (local28 == 625) {
					this.method119(local18, local23, 97, local33, 845);
				}
				if (local28 == 1071) {
					this.method119(local18, local23, 246, local33, 845);
				}
				if (local28 == 743) {
					anInt274++;
					if (anInt274 >= 124) {
						this.aClass1_Sub1_Sub3_2.method469(this.anInt208, 201);
						this.aClass1_Sub1_Sub3_2.method471(37954);
					}
					this.method119(local18, local23, 142, local33, 845);
				}
				if (local28 == 997 && !this.aBoolean90) {
					this.aClass1_Sub1_Sub3_2.method469(this.anInt208, 239);
					this.aClass1_Sub1_Sub3_2.method471(local23);
					this.aBoolean90 = true;
				}
				@Pc(375) Class1_Sub1_Sub1_Sub1_Sub1 local375;
				if (local28 == 275) {
					local375 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local33];
					if (local375 != null) {
						this.method178(aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray273[0], 0, 0, 1, false, 2, aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray272[0], local375.anIntArray272[0], 1, local375.anIntArray273[0], 0);
						this.anInt343 = super.anInt198;
						this.anInt344 = super.anInt199;
						this.anInt346 = 2;
						this.anInt345 = 0;
						this.aClass1_Sub1_Sub3_2.method469(this.anInt208, 242);
						this.aClass1_Sub1_Sub3_2.method471(local33);
						this.aClass1_Sub1_Sub3_2.method471(this.anInt304);
						this.aClass1_Sub1_Sub3_2.method471(this.anInt302);
						this.aClass1_Sub1_Sub3_2.method471(this.anInt303);
					}
				}
				@Pc(484) String local484;
				@Pc(450) Class6 local450;
				@Pc(469) String local469;
				if (local28 == 274) {
					local450 = Class6.aClass6Array1[local23];
					this.anInt406 = 1;
					this.anInt407 = local23;
					this.anInt408 = local450.anInt457;
					this.anInt301 = 0;
					this.aBoolean54 = true;
					local469 = local450.aString20;
					if (local469.indexOf(" ") != -1) {
						local469 = local469.substring(0, local469.indexOf(" "));
					}
					local484 = local450.aString20;
					if (local484.indexOf(" ") != -1) {
						local484 = local484.substring(local484.indexOf(" ") + 1);
					}
					this.aString15 = local469 + " " + local450.aString21 + " " + local484;
					if (this.anInt408 == 16) {
						this.aBoolean54 = true;
						this.anInt312 = 3;
						this.aBoolean79 = true;
					}
				} else {
					@Pc(543) int local543;
					@Pc(564) int local564;
					@Pc(539) String local539;
					if (local28 == 507 || local28 == 957) {
						local539 = this.aStringArray5[arg0];
						local543 = local539.indexOf("@whi@");
						if (local543 != -1) {
							local539 = local539.substring(local543 + 5).trim();
							local484 = Class48.method671(Class48.method668(Class48.method667(local539)), 789);
							@Pc(562) boolean local562 = false;
							for (local564 = 0; local564 < this.anInt389; local564++) {
								@Pc(574) Class1_Sub1_Sub1_Sub1_Sub1 local574 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[this.anIntArray87[local564]];
								if (local574 != null && local574.aString3 != null && local574.aString3.equalsIgnoreCase(local484)) {
									this.method178(aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray273[0], 0, 0, 1, false, 2, aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray272[0], local574.anIntArray272[0], 1, local574.anIntArray273[0], 0);
									if (local28 == 507) {
										anInt323 += local33;
										if (anInt323 >= 66) {
											this.aClass1_Sub1_Sub3_2.method469(this.anInt208, 244);
											this.aClass1_Sub1_Sub3_2.method470(154);
										}
										this.aClass1_Sub1_Sub3_2.method469(this.anInt208, 183);
									}
									if (local28 == 957) {
										anInt327++;
										if (anInt327 >= 52) {
											this.aClass1_Sub1_Sub3_2.method469(this.anInt208, 206);
											this.aClass1_Sub1_Sub3_2.method470(131);
										}
										this.aClass1_Sub1_Sub3_2.method469(this.anInt208, 230);
									}
									this.aClass1_Sub1_Sub3_2.method471(this.anIntArray87[local564]);
									local562 = true;
									break;
								}
							}
							if (!local562) {
								this.method187(0, "Unable to find " + local484, "");
							}
						}
					}
					if (local28 == 435) {
						this.aClass1_Sub1_Sub3_2.method469(this.anInt208, 100);
						this.aClass1_Sub1_Sub3_2.method471(local23);
						local450 = Class6.aClass6Array1[local23];
						if (local450.anIntArrayArray7 != null && local450.anIntArrayArray7[0][0] == 5) {
							local543 = local450.anIntArrayArray7[0][1];
							this.anIntArray33[local543] = 1 - this.anIntArray33[local543];
							this.method121(local543);
							this.aBoolean54 = true;
						}
					}
					@Pc(765) Class1_Sub1_Sub1_Sub1_Sub2 local765;
					if (local28 == 242 || local28 == 209 || local28 == 309 || local28 == 852 || local28 == 793) {
						local765 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local33];
						if (local765 != null) {
							this.method178(aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray273[0], 0, 0, 1, false, 2, aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray272[0], local765.anIntArray272[0], 1, local765.anIntArray273[0], 0);
							this.anInt343 = super.anInt198;
							this.anInt344 = super.anInt199;
							this.anInt346 = 2;
							this.anInt345 = 0;
							if (local28 == 242) {
								this.aClass1_Sub1_Sub3_2.method469(this.anInt208, 70);
							}
							if (local28 == 852) {
								this.aClass1_Sub1_Sub3_2.method469(this.anInt208, 17);
							}
							if (local28 == 793) {
								this.aClass1_Sub1_Sub3_2.method469(this.anInt208, 149);
							}
							if (local28 == 309) {
								this.aClass1_Sub1_Sub3_2.method469(this.anInt208, 106);
							}
							if (local28 == 209) {
								this.aClass1_Sub1_Sub3_2.method469(this.anInt208, 45);
							}
							this.aClass1_Sub1_Sub3_2.method471(local33);
						}
					}
					if (local28 == 524) {
						local539 = this.aStringArray5[arg0];
						local543 = local539.indexOf("@whi@");
						if (local543 != -1) {
							if (this.anInt205 == -1) {
								this.method204();
								this.aString7 = local539.substring(local543 + 5).trim();
								this.aBoolean67 = false;
								for (@Pc(892) int local892 = 0; local892 < Class6.aClass6Array1.length; local892++) {
									if (Class6.aClass6Array1[local892] != null && Class6.aClass6Array1[local892].anInt433 == 600) {
										this.anInt414 = this.anInt205 = Class6.aClass6Array1[local892].anInt430;
										break;
									}
								}
							} else {
								this.method187(0, "Please close the interface you have open before using 'report abuse'", "");
							}
						}
					}
					if (local28 == 737) {
						this.method204();
					}
					if (local28 == 398) {
						this.aClass1_Sub1_Sub3_2.method469(this.anInt208, 241);
						this.aClass1_Sub1_Sub3_2.method471(local33);
						this.aClass1_Sub1_Sub3_2.method471(local18);
						this.aClass1_Sub1_Sub3_2.method471(local23);
						this.aClass1_Sub1_Sub3_2.method471(this.anInt304);
						this.aClass1_Sub1_Sub3_2.method471(this.anInt302);
						this.aClass1_Sub1_Sub3_2.method471(this.anInt303);
						this.anInt392 = 0;
						this.anInt393 = local23;
						this.anInt394 = local18;
						this.anInt395 = 2;
						if (Class6.aClass6Array1[local23].anInt430 == this.anInt205) {
							this.anInt395 = 1;
						}
						if (Class6.aClass6Array1[local23].anInt430 == this.anInt261) {
							this.anInt395 = 3;
						}
					}
					if (local28 == 240) {
						local765 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local33];
						if (local765 != null) {
							this.method178(aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray273[0], 0, 0, 1, false, 2, aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray272[0], local765.anIntArray272[0], 1, local765.anIntArray273[0], 0);
							this.anInt343 = super.anInt198;
							this.anInt344 = super.anInt199;
							this.anInt346 = 2;
							this.anInt345 = 0;
							this.aClass1_Sub1_Sub3_2.method469(this.anInt208, 127);
							this.aClass1_Sub1_Sub3_2.method471(local33);
							this.aClass1_Sub1_Sub3_2.method471(this.anInt407);
						}
					}
					if (local28 == 1714) {
						local765 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local33];
						if (local765 != null) {
							@Pc(1081) Class13 local1081 = local765.aClass13_2;
							if (local1081.anIntArray174 != null) {
								local1081 = local1081.method327((byte) 8);
							}
							if (local1081 != null) {
								if (local1081.aByteArray5 == null) {
									local484 = "It's a " + local1081.aString24 + ".";
								} else {
									local484 = new String(local1081.aByteArray5);
								}
								this.method187(0, local484, "");
							}
						}
					}
					if (local28 == 694 || local28 == 962 || local28 == 795 || local28 == 681 || local28 == 100) {
						if (local28 == 100) {
							this.aClass1_Sub1_Sub3_2.method469(this.anInt208, 243);
						}
						if (local28 == 962) {
							this.aClass1_Sub1_Sub3_2.method469(this.anInt208, 52);
						}
						if (local28 == 694) {
							this.aClass1_Sub1_Sub3_2.method469(this.anInt208, 67);
						}
						if (local28 == 681) {
							anInt326++;
							if (anInt326 >= 116) {
								this.aClass1_Sub1_Sub3_2.method469(this.anInt208, 214);
								this.aClass1_Sub1_Sub3_2.method473(13018169);
							}
							this.aClass1_Sub1_Sub3_2.method469(this.anInt208, 155);
						}
						if (local28 == 795) {
							this.aClass1_Sub1_Sub3_2.method469(this.anInt208, 195);
						}
						this.aClass1_Sub1_Sub3_2.method471(local33);
						this.aClass1_Sub1_Sub3_2.method471(local18);
						this.aClass1_Sub1_Sub3_2.method471(local23);
						this.anInt392 = 0;
						this.anInt393 = local23;
						this.anInt394 = local18;
						this.anInt395 = 2;
						if (Class6.aClass6Array1[local23].anInt430 == this.anInt205) {
							this.anInt395 = 1;
						}
						if (Class6.aClass6Array1[local23].anInt430 == this.anInt261) {
							this.anInt395 = 3;
						}
					}
					@Pc(1262) long local1262;
					if (local28 == 902) {
						local539 = this.aStringArray5[arg0];
						local543 = local539.indexOf("@whi@");
						if (local543 != -1) {
							local1262 = Class48.method667(local539.substring(local543 + 5).trim());
							local564 = -1;
							for (@Pc(1266) int local1266 = 0; local1266 < this.anInt262; local1266++) {
								if (this.aLongArray3[local1266] == local1262) {
									local564 = local1266;
									break;
								}
							}
							if (local564 != -1 && this.anIntArray83[local564] > 0) {
								this.aBoolean75 = true;
								this.aBoolean82 = false;
								this.aBoolean81 = true;
								this.aString12 = "";
								this.anInt216 = 3;
								this.aLong14 = this.aLongArray3[local564];
								this.aString4 = "Enter message to send to " + this.aStringArray1[local564];
							}
						}
					}
					if (local28 == 639 || local28 == 499 || local28 == 27 || local28 == 387 || local28 == 185) {
						local375 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local33];
						if (local375 != null) {
							this.method178(aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray273[0], 0, 0, 1, false, 2, aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray272[0], local375.anIntArray272[0], 1, local375.anIntArray273[0], 0);
							this.anInt343 = super.anInt198;
							this.anInt344 = super.anInt199;
							this.anInt346 = 2;
							this.anInt345 = 0;
							if (local28 == 185) {
								this.aClass1_Sub1_Sub3_2.method469(this.anInt208, 54);
							}
							if (local28 == 387) {
								anInt323 += local33;
								if (anInt323 >= 66) {
									this.aClass1_Sub1_Sub3_2.method469(this.anInt208, 244);
									this.aClass1_Sub1_Sub3_2.method470(154);
								}
								this.aClass1_Sub1_Sub3_2.method469(this.anInt208, 183);
							}
							if (local28 == 639) {
								anInt327++;
								if (anInt327 >= 52) {
									this.aClass1_Sub1_Sub3_2.method469(this.anInt208, 206);
									this.aClass1_Sub1_Sub3_2.method470(131);
								}
								this.aClass1_Sub1_Sub3_2.method469(this.anInt208, 230);
							}
							if (local28 == 499) {
								this.aClass1_Sub1_Sub3_2.method469(this.anInt208, 147);
							}
							if (local28 == 27) {
								this.aClass1_Sub1_Sub3_2.method469(this.anInt208, 27);
							}
							this.aClass1_Sub1_Sub3_2.method471(local33);
						}
					}
					@Pc(1477) Class15 local1477;
					if (local28 == 1328) {
						local1477 = Class15.method361(local33);
						@Pc(1481) Class6 local1481 = Class6.aClass6Array1[local23];
						if (local1481 != null && local1481.anIntArray95[local18] >= 100000) {
							local469 = local1481.anIntArray95[local18] + " x " + local1477.aString25;
						} else if (local1477.aByteArray6 == null) {
							local469 = "It's a " + local1477.aString25 + ".";
						} else {
							local469 = new String(local1477.aByteArray6);
						}
						this.method187(0, local469, "");
					}
					if (local28 == 718) {
						if (this.aBoolean77) {
							this.aClass37_1.method568(local23 - 4, local18 - 4);
						} else {
							this.aClass37_1.method568(super.anInt199 - 4, super.anInt198 - 4);
						}
					}
					if (local28 == 131) {
						local375 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local33];
						if (local375 != null) {
							this.method178(aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray273[0], 0, 0, 1, false, 2, aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray272[0], local375.anIntArray272[0], 1, local375.anIntArray273[0], 0);
							this.anInt343 = super.anInt198;
							this.anInt344 = super.anInt199;
							this.anInt346 = 2;
							this.anInt345 = 0;
							this.aClass1_Sub1_Sub3_2.method469(this.anInt208, 218);
							this.aClass1_Sub1_Sub3_2.method471(local33);
							this.aClass1_Sub1_Sub3_2.method471(this.anInt407);
						}
					}
					if (local28 == 1152) {
						local1477 = Class15.method361(local33);
						if (local1477.aByteArray6 == null) {
							local469 = "It's a " + local1477.aString25 + ".";
						} else {
							local469 = new String(local1477.aByteArray6);
						}
						this.method187(0, local469, "");
					}
					if (local28 == 721) {
						anInt288 += local23;
						if (anInt288 >= 139) {
							this.aClass1_Sub1_Sub3_2.method469(this.anInt208, 59);
							this.aClass1_Sub1_Sub3_2.method474(0);
						}
						this.method119(local18, local23, 139, local33, 845);
					}
					if (local28 == 1381) {
						@Pc(1701) int local1701 = local33 >> 14 & 0x7FFF;
						@Pc(1704) Class9 local1704 = Class9.method288(local1701);
						if (local1704.aByteArray4 == null) {
							local484 = "It's a " + local1704.aString23 + ".";
						} else {
							local484 = new String(local1704.aByteArray4);
						}
						this.method187(0, local484, "");
					}
					if (local28 == 370) {
						local142 = this.method178(aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray273[0], 0, 0, 0, false, 2, aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray272[0], local18, 0, local23, 0);
						if (!local142) {
							this.method178(aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray273[0], 0, 0, 1, false, 2, aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray272[0], local18, 1, local23, 0);
						}
						this.anInt343 = super.anInt198;
						this.anInt344 = super.anInt199;
						this.anInt346 = 2;
						this.anInt345 = 0;
						this.aClass1_Sub1_Sub3_2.method469(this.anInt208, 144);
						this.aClass1_Sub1_Sub3_2.method471(local18 + this.anInt244);
						this.aClass1_Sub1_Sub3_2.method471(local23 + this.anInt245);
						this.aClass1_Sub1_Sub3_2.method471(local33);
						this.aClass1_Sub1_Sub3_2.method471(this.anInt407);
					}
					if (local28 == 231) {
						local450 = Class6.aClass6Array1[local23];
						@Pc(1831) boolean local1831 = true;
						if (local450.anInt433 > 0) {
							local1831 = this.method126(local450);
						}
						if (local1831) {
							this.aClass1_Sub1_Sub3_2.method469(this.anInt208, 100);
							this.aClass1_Sub1_Sub3_2.method471(local23);
						}
					}
					if (local28 == 605 || local28 == 47 || local28 == 513 || local28 == 884) {
						local539 = this.aStringArray5[arg0];
						local543 = local539.indexOf("@whi@");
						if (local543 != -1) {
							local1262 = Class48.method667(local539.substring(local543 + 5).trim());
							if (local28 == 605) {
								this.method186(local1262);
							}
							if (local28 == 47) {
								this.method192(local1262);
							}
							if (local28 == 513) {
								this.method104(local1262);
							}
							if (local28 == 884) {
								this.method136(local1262);
							}
						}
					}
					if (local28 == 582 || local28 == 113 || local28 == 555 || local28 == 331 || local28 == 354) {
						if (local28 == 113) {
							this.aClass1_Sub1_Sub3_2.method469(this.anInt208, 25);
						}
						if (local28 == 331) {
							this.aClass1_Sub1_Sub3_2.method469(this.anInt208, 210);
						}
						if (local28 == 582) {
							if ((local33 & 0x3) == 0) {
								anInt265++;
							}
							if (anInt265 >= 133) {
								this.aClass1_Sub1_Sub3_2.method469(this.anInt208, 30);
								this.aClass1_Sub1_Sub3_2.method471(6118);
							}
							this.aClass1_Sub1_Sub3_2.method469(this.anInt208, 103);
						}
						if (local28 == 555) {
							this.aClass1_Sub1_Sub3_2.method469(this.anInt208, 85);
						}
						if (local28 == 354) {
							this.aClass1_Sub1_Sub3_2.method469(this.anInt208, 198);
						}
						this.aClass1_Sub1_Sub3_2.method471(local33);
						this.aClass1_Sub1_Sub3_2.method471(local18);
						this.aClass1_Sub1_Sub3_2.method471(local23);
						this.anInt392 = 0;
						this.anInt393 = local23;
						this.anInt394 = local18;
						this.anInt395 = 2;
						if (Class6.aClass6Array1[local23].anInt430 == this.anInt205) {
							this.anInt395 = 1;
						}
						if (Class6.aClass6Array1[local23].anInt430 == this.anInt261) {
							this.anInt395 = 3;
						}
					}
					if (local28 == 829) {
						local765 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local33];
						if (local765 != null) {
							this.method178(aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray273[0], 0, 0, 1, false, 2, aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray272[0], local765.anIntArray272[0], 1, local765.anIntArray273[0], 0);
							this.anInt343 = super.anInt198;
							this.anInt344 = super.anInt199;
							this.anInt346 = 2;
							this.anInt345 = 0;
							this.aClass1_Sub1_Sub3_2.method469(this.anInt208, 150);
							this.aClass1_Sub1_Sub3_2.method471(local33);
							this.aClass1_Sub1_Sub3_2.method471(this.anInt304);
							this.aClass1_Sub1_Sub3_2.method471(this.anInt302);
							this.aClass1_Sub1_Sub3_2.method471(this.anInt303);
						}
					}
					if (local28 == 899 && this.method119(local18, local23, 167, local33, 845)) {
						this.aClass1_Sub1_Sub3_2.method471(this.anInt407);
					}
					if (local28 == 111) {
						local142 = this.method178(aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray273[0], 0, 0, 0, false, 2, aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray272[0], local18, 0, local23, 0);
						if (!local142) {
							this.method178(aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray273[0], 0, 0, 1, false, 2, aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray272[0], local18, 1, local23, 0);
						}
						this.anInt343 = super.anInt198;
						this.anInt344 = super.anInt199;
						this.anInt346 = 2;
						this.anInt345 = 0;
						this.aClass1_Sub1_Sub3_2.method469(this.anInt208, 176);
						this.aClass1_Sub1_Sub3_2.method471(local18 + this.anInt244);
						this.aClass1_Sub1_Sub3_2.method471(local23 + this.anInt245);
						this.aClass1_Sub1_Sub3_2.method471(local33);
						this.aClass1_Sub1_Sub3_2.method471(this.anInt304);
						this.aClass1_Sub1_Sub3_2.method471(this.anInt302);
						this.aClass1_Sub1_Sub3_2.method471(this.anInt303);
					}
					if (local28 == 225) {
						this.aClass1_Sub1_Sub3_2.method469(this.anInt208, 100);
						this.aClass1_Sub1_Sub3_2.method471(local23);
						local450 = Class6.aClass6Array1[local23];
						if (local450.anIntArrayArray7 != null && local450.anIntArrayArray7[0][0] == 5) {
							local543 = local450.anIntArrayArray7[0][1];
							if (this.anIntArray33[local543] != local450.anIntArray97[0]) {
								this.anIntArray33[local543] = local450.anIntArray97[0];
								this.method121(local543);
								this.aBoolean54 = true;
							}
						}
					}
					if (local28 == 102) {
						this.anInt301 = 1;
						this.anInt302 = local18;
						this.anInt303 = local23;
						this.anInt304 = local33;
						this.aString8 = Class15.method361(local33).aString25;
						this.anInt406 = 0;
						this.aBoolean54 = true;
					} else {
						if (local28 == 810 && this.method119(local18, local23, 9, local33, 845)) {
							this.aClass1_Sub1_Sub3_2.method471(this.anInt304);
							this.aClass1_Sub1_Sub3_2.method471(this.anInt302);
							this.aClass1_Sub1_Sub3_2.method471(this.anInt303);
						}
						this.anInt301 = 0;
						this.anInt406 = 0;
						this.aBoolean54 = true;
					}
				}
			}
		} catch (@Pc(2359) RuntimeException local2359) {
			signlink.reporterror("24833, " + arg0 + ", " + true + ", " + local2359.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IILclient!lb;)V")
	private void method111(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub1_Sub3 arg1) {
		try {
			arg1.method490();
			@Pc(10) int local10 = arg1.method491(this.anInt243, 8);
			@Pc(16) int local16;
			if (local10 < this.anInt420) {
				for (local16 = local10; local16 < this.anInt420; local16++) {
					this.anIntArray55[this.anInt295++] = this.anIntArray93[local16];
				}
			}
			if (local10 > this.anInt420) {
				signlink.reporterror(this.aString16 + " Too many npcs");
				throw new RuntimeException("eek");
			}
			this.anInt420 = 0;
			for (local16 = 0; local16 < local10; local16++) {
				@Pc(75) int local75 = this.anIntArray93[local16];
				@Pc(80) Class1_Sub1_Sub1_Sub1_Sub2 local80 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local75];
				@Pc(86) int local86 = arg1.method491(this.anInt243, 1);
				if (local86 == 0) {
					this.anIntArray93[this.anInt420++] = local75;
					local80.anInt1021 = anInt223;
				} else {
					@Pc(110) int local110 = arg1.method491(this.anInt243, 2);
					if (local110 == 0) {
						this.anIntArray93[this.anInt420++] = local75;
						local80.anInt1021 = anInt223;
						this.anIntArray88[this.anInt390++] = local75;
					} else {
						@Pc(162) int local162;
						@Pc(173) int local173;
						if (local110 == 1) {
							this.anIntArray93[this.anInt420++] = local75;
							local80.anInt1021 = anInt223;
							local162 = arg1.method491(this.anInt243, 3);
							local80.method678(692, local162, false);
							local173 = arg1.method491(this.anInt243, 1);
							if (local173 == 1) {
								this.anIntArray88[this.anInt390++] = local75;
							}
						} else if (local110 == 2) {
							this.anIntArray93[this.anInt420++] = local75;
							local80.anInt1021 = anInt223;
							local162 = arg1.method491(this.anInt243, 3);
							local80.method678(692, local162, true);
							local173 = arg1.method491(this.anInt243, 3);
							local80.method678(692, local173, true);
							@Pc(234) int local234 = arg1.method491(this.anInt243, 1);
							if (local234 == 1) {
								this.anIntArray88[this.anInt390++] = local75;
							}
						} else if (local110 == 3) {
							this.anIntArray55[this.anInt295++] = local75;
						}
					}
				}
			}
		} catch (@Pc(271) RuntimeException local271) {
			signlink.reporterror("36709, " + 879 + ", " + arg0 + ", " + arg1 + ", " + local271.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "h", descriptor = "(I)V")
	private void method112(@OriginalArg(0) int arg0) {
		try {
			this.anInt319++;
			this.method142(true);
			this.method101(true);
			this.method142(false);
			this.method101(false);
			this.method141();
			this.method106();
			@Pc(35) int local35;
			@Pc(74) int local74;
			if (!this.aBoolean89) {
				local35 = this.anInt315;
				if (this.anInt349 / 256 > local35) {
					local35 = this.anInt349 / 256;
				}
				if (this.aBooleanArray4[4] && this.anIntArray56[4] + 128 > local35) {
					local35 = this.anIntArray56[4] + 128;
				}
				local74 = this.anInt316 + this.anInt321 & 0x7FF;
				this.method105(local35, this.anInt410, local74, this.anInt409, this.method181(this.aByte10, this.anInt361, aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt981, aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt982) - 50, local35 * 3 + 600);
			}
			if (this.aBoolean89) {
				local35 = this.method228();
			} else {
				local35 = this.method227();
			}
			local74 = this.anInt251;
			@Pc(119) int local119 = this.anInt252;
			@Pc(122) int local122 = this.anInt253;
			@Pc(125) int local125 = this.anInt254;
			@Pc(128) int local128 = this.anInt255;
			@Pc(177) int local177;
			for (@Pc(130) int local130 = 0; local130 < 5; local130++) {
				if (this.aBooleanArray4[local130]) {
					local177 = (int) (Math.random() * (double) (this.anIntArray59[local130] * 2 + 1) - (double) this.anIntArray59[local130] + Math.sin((double) this.anIntArray62[local130] * ((double) this.anIntArray89[local130] / 100.0D)) * (double) this.anIntArray56[local130]);
					if (local130 == 0) {
						this.anInt251 += local177;
					}
					if (local130 == 1) {
						this.anInt252 += local177;
					}
					if (local130 == 2) {
						this.anInt253 += local177;
					}
					if (local130 == 3) {
						this.anInt255 = this.anInt255 + local177 & 0x7FF;
					}
					if (local130 == 4) {
						this.anInt254 += local177;
						if (this.anInt254 < 128) {
							this.anInt254 = 128;
						}
						if (this.anInt254 > 383) {
							this.anInt254 = 383;
						}
					}
				}
			}
			local177 = Class1_Sub1_Sub2_Sub1.anInt601;
			Class1_Sub1_Sub1_Sub5.aBoolean120 = true;
			Class1_Sub1_Sub1_Sub5.anInt507 = 0;
			if (arg0 != 7) {
				for (@Pc(252) int local252 = 1; local252 > 0; local252++) {
				}
			}
			Class1_Sub1_Sub1_Sub5.anInt505 = super.anInt192 - 4;
			Class1_Sub1_Sub1_Sub5.anInt506 = super.anInt193 - 4;
			Class1_Sub1_Sub2.method437(this.aBoolean50);
			this.aClass37_1.method569(this.anInt253, local35, this.anInt251, this.anInt254, this.anInt255, this.anInt252);
			this.aClass37_1.method544();
			this.method223();
			this.method208((byte) 4);
			this.method132(local177);
			this.method216();
			this.aClass35_14.method525(super.aGraphics2, 4, 4, (byte) 8);
			this.anInt251 = local74;
			this.anInt252 = local119;
			this.anInt253 = local122;
			this.anInt254 = local125;
			this.anInt255 = local128;
		} catch (@Pc(327) RuntimeException local327) {
			signlink.reporterror("92369, " + arg0 + ", " + local327.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ZLjava/lang/String;)Z")
	private boolean method113(@OriginalArg(1) String arg0) {
		try {
			if (arg0 == null) {
				return false;
			}
			for (@Pc(5) int local5 = 0; local5 < this.anInt262; local5++) {
				if (arg0.equalsIgnoreCase(this.aStringArray1[local5])) {
					return true;
				}
			}
			return arg0.equalsIgnoreCase(aClass1_Sub1_Sub1_Sub1_Sub1_1.aString3);
		} catch (@Pc(35) RuntimeException local35) {
			signlink.reporterror("46097, " + true + ", " + arg0 + ", " + local35.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Z)V")
	private void method114() {
		try {
			this.aBoolean80 &= true;
			@Pc(14) int local14;
			if (this.anInt210 > 0) {
				for (local14 = 0; local14 < 256; local14++) {
					if (this.anInt210 > 768) {
						this.anIntArray79[local14] = this.method200(this.anIntArray81[local14], 1024 - this.anInt210, this.anIntArray80[local14]);
					} else if (this.anInt210 > 256) {
						this.anIntArray79[local14] = this.anIntArray81[local14];
					} else {
						this.anIntArray79[local14] = this.method200(this.anIntArray80[local14], 256 - this.anInt210, this.anIntArray81[local14]);
					}
				}
			} else if (this.anInt211 > 0) {
				for (local14 = 0; local14 < 256; local14++) {
					if (this.anInt211 > 768) {
						this.anIntArray79[local14] = this.method200(this.anIntArray82[local14], 1024 - this.anInt211, this.anIntArray80[local14]);
					} else if (this.anInt211 > 256) {
						this.anIntArray79[local14] = this.anIntArray82[local14];
					} else {
						this.anIntArray79[local14] = this.method200(this.anIntArray80[local14], 256 - this.anInt211, this.anIntArray82[local14]);
					}
				}
			} else {
				for (local14 = 0; local14 < 256; local14++) {
					this.anIntArray79[local14] = this.anIntArray80[local14];
				}
			}
			for (local14 = 0; local14 < 33920; local14++) {
				this.aClass35_19.anIntArray231[local14] = this.aClass1_Sub1_Sub2_Sub2_3.anIntArray208[local14];
			}
			@Pc(187) int local187 = 0;
			@Pc(189) int local189 = 1152;
			@Pc(204) int local204;
			@Pc(208) int local208;
			@Pc(218) int local218;
			@Pc(226) int local226;
			@Pc(230) int local230;
			@Pc(234) int local234;
			@Pc(245) int local245;
			for (@Pc(191) int local191 = 1; local191 < 255; local191++) {
				local204 = this.anIntArray70[local191] * (256 - local191) / 256;
				local208 = local204 + 22;
				if (local208 < 0) {
					local208 = 0;
				}
				local187 += local208;
				for (local218 = local208; local218 < 128; local218++) {
					local226 = this.anIntArray64[local187++];
					if (local226 == 0) {
						local189++;
					} else {
						local230 = local226;
						local234 = 256 - local226;
						local226 = this.anIntArray79[local226];
						local245 = this.aClass35_19.anIntArray231[local189];
						this.aClass35_19.anIntArray231[local189++] = ((local226 & 0xFF00FF) * local230 + (local245 & 0xFF00FF) * local234 & 0xFF00FF00) + ((local226 & 0xFF00) * local230 + (local245 & 0xFF00) * local234 & 0xFF0000) >> 8;
					}
				}
				local189 += local208;
			}
			this.aClass35_19.method525(super.aGraphics2, 0, 0, (byte) 8);
			for (local204 = 0; local204 < 33920; local204++) {
				this.aClass35_20.anIntArray231[local204] = this.aClass1_Sub1_Sub2_Sub2_4.anIntArray208[local204];
			}
			local187 = 0;
			local189 = 1176;
			for (local208 = 1; local208 < 255; local208++) {
				local218 = this.anIntArray70[local208] * (256 - local208) / 256;
				local226 = 103 - local218;
				local189 += local218;
				for (local230 = 0; local230 < local226; local230++) {
					local234 = this.anIntArray64[local187++];
					if (local234 == 0) {
						local189++;
					} else {
						local245 = local234;
						@Pc(368) int local368 = 256 - local234;
						local234 = this.anIntArray79[local234];
						@Pc(379) int local379 = this.aClass35_20.anIntArray231[local189];
						this.aClass35_20.anIntArray231[local189++] = ((local234 & 0xFF00FF) * local245 + (local379 & 0xFF00FF) * local368 & 0xFF00FF00) + ((local234 & 0xFF00) * local245 + (local379 & 0xFF00) * local368 & 0xFF0000) >> 8;
					}
				}
				local187 += 128 - local226;
				local189 += 128 - local226 - local218;
			}
			this.aClass35_20.method525(super.aGraphics2, 0, 637, (byte) 8);
		} catch (@Pc(451) RuntimeException local451) {
			signlink.reporterror("56047, " + true + ", " + local451.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ZLclient!lb;I)V")
	private void method115(@OriginalArg(1) Class1_Sub1_Sub3 arg0, @OriginalArg(2) int arg1) {
		try {
			this.anInt295 = 0;
			this.anInt390 = 0;
			this.method156(arg0, arg1);
			this.method220(arg0, arg1);
			this.method117(arg1, arg0);
			this.method139(arg0, arg1);
			@Pc(46) int local46;
			for (@Pc(39) int local39 = 0; local39 < this.anInt295; local39++) {
				local46 = this.anIntArray55[local39];
				if (this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local46].anInt1021 != anInt223) {
					this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local46] = null;
				}
			}
			if (arg0.anInt742 != arg1) {
				signlink.reporterror("Error packet size mismatch in getplayer pos:" + arg0.anInt742 + " psize:" + arg1);
				throw new RuntimeException("eek");
			}
			for (local46 = 0; local46 < this.anInt389; local46++) {
				if (this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[this.anIntArray87[local46]] == null) {
					signlink.reporterror(this.aString16 + " null entry in pl list - pos:" + local46 + " size:" + this.anInt389);
					throw new RuntimeException("eek");
				}
			}
		} catch (@Pc(126) RuntimeException local126) {
			signlink.reporterror("56243, " + false + ", " + arg0 + ", " + arg1 + ", " + local126.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/String;)Ljava/io/DataInputStream;")
	private DataInputStream method116(@OriginalArg(0) String arg0) throws IOException {
		if (this.aBoolean57) {
			if (this.aSocket1 != null) {
				try {
					this.aSocket1.close();
				} catch (@Pc(26) Exception local26) {
				}
				this.aSocket1 = null;
			}
			this.aSocket1 = this.method213(43595);
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

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(IILclient!lb;)V")
	private void method117(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub1_Sub3 arg1) {
		try {
			while (true) {
				if (arg1.anInt743 + 10 < arg0 * 8) {
					@Pc(16) int local16 = arg1.method491(this.anInt243, 11);
					if (local16 != 2047) {
						if (this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local16] == null) {
							this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local16] = new Class1_Sub1_Sub1_Sub1_Sub1();
							if (this.aClass1_Sub1_Sub3Array1[local16] != null) {
								this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local16].method39(this.aClass1_Sub1_Sub3Array1[local16]);
							}
						}
						this.anIntArray87[this.anInt389++] = local16;
						@Pc(62) Class1_Sub1_Sub1_Sub1_Sub1 local62 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local16];
						local62.anInt1021 = anInt223;
						@Pc(71) int local71 = arg1.method491(this.anInt243, 5);
						if (local71 > 15) {
							local71 -= 32;
						}
						@Pc(81) int local81 = arg1.method491(this.anInt243, 5);
						if (local81 > 15) {
							local81 -= 32;
						}
						@Pc(91) int local91 = arg1.method491(this.anInt243, 1);
						local62.method677(aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray273[0] + local81, local91 == 1, aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray272[0] + local71);
						@Pc(118) int local118 = arg1.method491(this.anInt243, 1);
						if (local118 == 1) {
							this.anIntArray88[this.anInt390++] = local16;
						}
						continue;
					}
				}
				arg1.method492(this.anInt365);
				return;
			}
		} catch (@Pc(140) RuntimeException local140) {
			signlink.reporterror("96368, " + 0 + ", " + arg0 + ", " + arg1 + ", " + local140.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(Z)V")
	private void method118() {
		try {
			try {
				if (this.aClass8_1 != null) {
					this.aClass8_1.method247();
				}
			} catch (@Pc(7) Exception local7) {
			}
			this.aClass8_1 = null;
			this.aBoolean80 = false;
			this.anInt225 = 0;
			this.aString16 = "";
			this.aString17 = "";
			this.method209(336);
			this.aClass37_1.method530(880);
			for (@Pc(38) int local38 = 0; local38 < 4; local38++) {
				this.aClass19Array1[local38].method420();
			}
			System.gc();
			this.method102();
			this.anInt418 = -1;
			this.anInt370 = -1;
			this.anInt320 = 0;
		} catch (@Pc(65) RuntimeException local65) {
			signlink.reporterror("23634, " + false + ", " + local65.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIII)Z")
	private boolean method119(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		try {
			@Pc(7) int local7 = arg3 >> 14 & 0x7FFF;
			@Pc(16) int local16 = this.aClass37_1.method560(this.anInt361, arg0, arg1, arg3);
			if (local16 == -1) {
				return false;
			}
			@Pc(25) int local25 = local16 & 0x1F;
			@Pc(31) int local31 = local16 >> 6 & 0x3;
			@Pc(35) boolean local35 = false;
			anInt215++;
			if (anInt215 > 1086) {
				anInt215 = 0;
				this.aClass1_Sub1_Sub3_2.method469(this.anInt208, 46);
				this.aClass1_Sub1_Sub3_2.method470(0);
				@Pc(58) int local58 = this.aClass1_Sub1_Sub3_2.anInt742;
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
				this.aClass1_Sub1_Sub3_2.method479(this.aClass1_Sub1_Sub3_2.anInt742 - local58);
			}
			if (local25 == 10 || local25 == 11 || local25 == 22) {
				@Pc(138) Class9 local138 = Class9.method288(local7);
				@Pc(146) int local146;
				@Pc(149) int local149;
				if (local31 == 0 || local31 == 2) {
					local146 = local138.anInt513;
					local149 = local138.anInt514;
				} else {
					local146 = local138.anInt514;
					local149 = local138.anInt513;
				}
				@Pc(160) int local160 = local138.anInt525;
				if (local31 != 0) {
					local160 = (local160 << local31 & 0xF) + (local160 >> 4 - local31);
				}
				this.method178(aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray273[0], 0, local160, local146, false, 2, aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray272[0], arg0, local149, arg1, 0);
			} else {
				this.method178(aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray273[0], local31, 0, 0, false, 2, aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray272[0], arg0, 0, arg1, local25 + 1);
			}
			this.anInt343 = super.anInt198;
			this.anInt344 = super.anInt199;
			this.anInt346 = 2;
			this.anInt345 = 0;
			this.aClass1_Sub1_Sub3_2.method469(this.anInt208, arg2);
			this.aClass1_Sub1_Sub3_2.method471(arg0 + this.anInt244);
			this.aClass1_Sub1_Sub3_2.method471(arg1 + this.anInt245);
			this.aClass1_Sub1_Sub3_2.method471(local7);
			return true;
		} catch (@Pc(261) RuntimeException local261) {
			signlink.reporterror("21359, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local261.toString());
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

	@OriginalMember(owner = "client!client", name = "i", descriptor = "(I)V")
	private void method120() {
		try {
			while (true) {
				@Pc(8) Class1_Sub1_Sub4 local8 = this.aClass44_Sub1_1.method647();
				if (local8 == null) {
					return;
				}
				if (local8.anInt769 == 0) {
					Class1_Sub1_Sub1_Sub5.method259(local8.aByteArray10, local8.anInt770);
					if ((this.aClass44_Sub1_1.method643(local8.anInt770) & 0x62) != 0) {
						this.aBoolean54 = true;
						if (this.anInt261 != -1) {
							this.aBoolean75 = true;
						}
					}
				}
				if (local8.anInt769 == 1 && local8.aByteArray10 != null) {
					Class12.method303(local8.aByteArray10);
				}
				if (local8.anInt769 == 2 && local8.anInt770 == this.anInt370 && local8.aByteArray10 != null) {
					this.method144(this.aBoolean76, local8.aByteArray10);
				}
				if (local8.anInt769 == 3 && this.anInt232 == 1) {
					for (@Pc(79) int local79 = 0; local79 < this.aByteArrayArray1.length; local79++) {
						if (this.anIntArray40[local79] == local8.anInt770) {
							this.aByteArrayArray1[local79] = local8.aByteArray10;
							if (local8.aByteArray10 == null) {
								this.anIntArray40[local79] = -1;
							}
							break;
						}
						if (this.anIntArray41[local79] == local8.anInt770) {
							this.aByteArrayArray2[local79] = local8.aByteArray10;
							if (local8.aByteArray10 == null) {
								this.anIntArray41[local79] = -1;
							}
							break;
						}
					}
				}
				if (local8.anInt769 == 93 && this.aClass44_Sub1_1.method642(local8.anInt770)) {
					Class4.method59(this.aClass44_Sub1_1, new Class1_Sub1_Sub3(local8.aByteArray10, 58));
				}
			}
		} catch (@Pc(156) RuntimeException local156) {
			signlink.reporterror("36408, " + 0 + ", " + local156.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(II)V")
	private void method121(@OriginalArg(1) int arg0) {
		try {
			@Pc(4) int local4 = Class39.aClass39Array1[arg0].anInt885;
			if (local4 != 0) {
				@Pc(22) int local22 = this.anIntArray33[arg0];
				if (local4 == 1) {
					if (local22 == 1) {
						Class1_Sub1_Sub2_Sub1.method351(0.9D);
					}
					if (local22 == 2) {
						Class1_Sub1_Sub2_Sub1.method351(0.8D);
					}
					if (local22 == 3) {
						Class1_Sub1_Sub2_Sub1.method351(0.7D);
					}
					if (local22 == 4) {
						Class1_Sub1_Sub2_Sub1.method351(0.6D);
					}
					Class15.aClass40_8.method593();
					this.aBoolean60 = true;
				}
				if (local4 == 3) {
					@Pc(60) boolean local60 = this.aBoolean65;
					if (local22 == 0) {
						this.method99(0, this.aBoolean65);
						this.aBoolean65 = true;
					}
					if (local22 == 1) {
						this.method99(-400, this.aBoolean65);
						this.aBoolean65 = true;
					}
					if (local22 == 2) {
						this.method99(-800, this.aBoolean65);
						this.aBoolean65 = true;
					}
					if (local22 == 3) {
						this.method99(-1200, this.aBoolean65);
						this.aBoolean65 = true;
					}
					if (local22 == 4) {
						this.aBoolean65 = false;
					}
					if (this.aBoolean65 != local60 && !aBoolean72) {
						if (this.aBoolean65) {
							this.anInt370 = this.anInt418;
							this.aBoolean76 = true;
							this.aClass44_Sub1_1.method645(2, this.anInt370);
						} else {
							this.method102();
						}
						this.anInt320 = 0;
					}
				}
				if (local4 == 4) {
					if (local22 == 0) {
						this.aBoolean69 = true;
						this.method164(0, this.aBoolean58);
					}
					if (local22 == 1) {
						this.aBoolean69 = true;
						this.method164(-400, this.aBoolean58);
					}
					if (local22 == 2) {
						this.aBoolean69 = true;
						this.method164(-800, this.aBoolean58);
					}
					if (local22 == 3) {
						this.aBoolean69 = true;
						this.method164(-1200, this.aBoolean58);
					}
					if (local22 == 4) {
						this.aBoolean69 = false;
					}
				}
				if (local4 == 5) {
					this.anInt305 = local22;
				}
				if (local4 == 6) {
					this.anInt416 = local22;
				}
				if (local4 == 8) {
					this.anInt234 = local22;
					this.aBoolean75 = true;
				}
				if (local4 == 9) {
					this.anInt383 = local22;
				}
			}
		} catch (@Pc(224) RuntimeException local224) {
			signlink.reporterror("14807, " + 0 + ", " + arg0 + ", " + local224.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "j", descriptor = "(I)V")
	private void method122(@OriginalArg(0) int arg0) {
		try {
			@Pc(11) int local11;
			for (@Pc(3) int local3 = -1; local3 < this.anInt389; local3++) {
				if (local3 == -1) {
					local11 = this.anInt388;
				} else {
					local11 = this.anIntArray87[local3];
				}
				@Pc(23) Class1_Sub1_Sub1_Sub1_Sub1 local23 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local11];
				if (local23 != null && local23.anInt992 > 0) {
					local23.anInt992--;
					if (local23.anInt992 == 0) {
						local23.aString31 = null;
					}
				}
			}
			if (arg0 != 0) {
				anInt268 = 276;
			}
			for (local11 = 0; local11 < this.anInt420; local11++) {
				@Pc(58) int local58 = this.anIntArray93[local11];
				@Pc(63) Class1_Sub1_Sub1_Sub1_Sub2 local63 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local58];
				if (local63 != null && local63.anInt992 > 0) {
					local63.anInt992--;
					if (local63.anInt992 == 0) {
						local63.aString31 = null;
					}
				}
			}
		} catch (@Pc(87) RuntimeException local87) {
			signlink.reporterror("87206, " + arg0 + ", " + local87.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "f", descriptor = "(B)V")
	private void method123(@OriginalArg(0) byte arg0) {
		try {
			if (this.anInt234 != 0) {
				@Pc(7) int local7 = 0;
				@Pc(12) boolean local12 = false;
				if (this.anInt240 != 0) {
					local7 = 1;
				}
				for (@Pc(24) int local24 = 0; local24 < 100; local24++) {
					if (this.aStringArray4[local24] != null) {
						@Pc(36) int local36 = this.anIntArray53[local24];
						@Pc(41) String local41 = this.aStringArray3[local24];
						if (local41 != null && local41.startsWith("@cr1@")) {
							local41 = local41.substring(5);
						}
						if (local41 != null && local41.startsWith("@cr2@")) {
							local41 = local41.substring(5);
						}
						if ((local36 == 3 || local36 == 7) && (local36 == 7 || this.anInt294 == 0 || this.anInt294 == 1 && this.method113(local41))) {
							@Pc(94) int local94 = 329 - local7 * 13;
							if (super.anInt192 > 4 && super.anInt193 - 4 > local94 - 10 && super.anInt193 - 4 <= local94 + 3) {
								@Pc(133) int local133 = this.aClass1_Sub1_Sub2_Sub4_2.method449((byte) 5, "From:  " + local41 + this.aStringArray4[local24]) + 25;
								if (local133 > 450) {
									local133 = 450;
								}
								if (super.anInt192 < local133 + 4) {
									if (this.anInt306 >= 1) {
										this.aStringArray5[this.anInt278] = "Report abuse @whi@" + local41;
										this.anIntArray36[this.anInt278] = 2524;
										this.anInt278++;
									}
									this.aStringArray5[this.anInt278] = "Add ignore @whi@" + local41;
									this.anIntArray36[this.anInt278] = 2047;
									this.anInt278++;
									this.aStringArray5[this.anInt278] = "Add friend @whi@" + local41;
									this.anIntArray36[this.anInt278] = 2605;
									this.anInt278++;
								}
							}
							local7++;
							if (local7 >= 5) {
								return;
							}
						}
						if ((local36 == 5 || local36 == 6) && this.anInt294 < 2) {
							local7++;
							if (local7 >= 5) {
								return;
							}
						}
					}
				}
			}
		} catch (@Pc(246) RuntimeException local246) {
			signlink.reporterror("95091, " + arg0 + ", " + local246.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(Z)V")
	private void method124() {
		try {
			this.aBoolean80 &= true;
			System.out.println("============");
			System.out.println("flame-cycle:" + this.anInt342);
			if (this.aClass44_Sub1_1 != null) {
				System.out.println("Od-cycle:" + this.aClass44_Sub1_1.anInt954);
			}
			System.out.println("loop-cycle:" + anInt223);
			System.out.println("draw-cycle:" + anInt242);
			System.out.println("ptype:" + this.anInt331);
			System.out.println("psize:" + this.anInt330);
			if (this.aClass8_1 != null) {
				this.aClass8_1.method252();
			}
			super.aBoolean43 = true;
		} catch (@Pc(82) RuntimeException local82) {
			signlink.reporterror("56194, " + true + ", " + local82.toString());
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
			signlink.reporterror("5888, " + -914 + ", " + local18.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IBIIIIIIII)V")
	private void method125(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		try {
			@Pc(1) Class1_Sub2 local1 = null;
			for (@Pc(6) Class1_Sub2 local6 = (Class1_Sub2) this.aClass29_1.method511(); local6 != null; local6 = (Class1_Sub2) this.aClass29_1.method513()) {
				if (local6.anInt778 == arg5 && local6.anInt780 == arg1 && local6.anInt781 == arg6 && local6.anInt779 == arg0) {
					local1 = local6;
					break;
				}
			}
			if (local1 == null) {
				local1 = new Class1_Sub2();
				local1.anInt778 = arg5;
				local1.anInt779 = arg0;
				local1.anInt780 = arg1;
				local1.anInt781 = arg6;
				this.method131(this.anInt356, local1);
				this.aClass29_1.method508(local1);
			}
			local1.anInt785 = arg2;
			local1.anInt787 = arg7;
			local1.anInt786 = arg4;
			local1.anInt788 = arg8;
			local1.anInt789 = arg3;
		} catch (@Pc(83) RuntimeException local83) {
			signlink.reporterror("92073, " + arg0 + ", " + 3 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + local83.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ZLclient!d;)Z")
	private boolean method126(@OriginalArg(1) Class6 arg0) {
		try {
			@Pc(4) int local4 = arg0.anInt433;
			if (this.anInt263 == 2) {
				if (local4 == 201) {
					this.aBoolean75 = true;
					this.aBoolean82 = false;
					this.aBoolean81 = true;
					this.aString12 = "";
					this.anInt216 = 1;
					this.aString4 = "Enter name of friend to add to list";
				}
				if (local4 == 202) {
					this.aBoolean75 = true;
					this.aBoolean82 = false;
					this.aBoolean81 = true;
					this.aString12 = "";
					this.anInt216 = 2;
					this.aString4 = "Enter name of friend to delete from list";
				}
			}
			if (local4 == 205) {
				this.anInt334 = 250;
				return true;
			}
			if (local4 == 501) {
				this.aBoolean75 = true;
				this.aBoolean82 = false;
				this.aBoolean81 = true;
				this.aString12 = "";
				this.anInt216 = 4;
				this.aString4 = "Enter name of player to add to list";
			}
			if (local4 == 502) {
				this.aBoolean75 = true;
				this.aBoolean82 = false;
				this.aBoolean81 = true;
				this.aString12 = "";
				this.anInt216 = 5;
				this.aString4 = "Enter name of player to delete from list";
			}
			@Pc(118) int local118;
			@Pc(122) int local122;
			@Pc(127) int local127;
			if (local4 >= 300 && local4 <= 313) {
				local118 = (local4 - 300) / 2;
				local122 = local4 & 0x1;
				local127 = this.anIntArray61[local118];
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
						if (!Class23.aClass23Array1[local127].aBoolean190 && Class23.aClass23Array1[local127].anInt750 == local118 + (this.aBoolean73 ? 0 : 7)) {
							this.anIntArray61[local118] = local127;
							this.aBoolean66 = true;
							break;
						}
					}
				}
			}
			if (local4 >= 314 && local4 <= 323) {
				local118 = (local4 - 314) / 2;
				local122 = local4 & 0x1;
				local127 = this.anIntArray69[local118];
				if (local122 == 0) {
					local127--;
					if (local127 < 0) {
						local127 = anIntArrayArray5[local118].length - 1;
					}
				}
				if (local122 == 1) {
					local127++;
					if (local127 >= anIntArrayArray5[local118].length) {
						local127 = 0;
					}
				}
				this.anIntArray69[local118] = local127;
				this.aBoolean66 = true;
			}
			if (local4 == 324 && !this.aBoolean73) {
				this.aBoolean73 = true;
				this.method218();
			}
			if (local4 == 325 && this.aBoolean73) {
				this.aBoolean73 = false;
				this.method218();
			}
			if (local4 == 326) {
				this.aClass1_Sub1_Sub3_2.method469(this.anInt208, 247);
				this.aClass1_Sub1_Sub3_2.method470(this.aBoolean73 ? 0 : 1);
				for (local118 = 0; local118 < 7; local118++) {
					this.aClass1_Sub1_Sub3_2.method470(this.anIntArray61[local118]);
				}
				for (local122 = 0; local122 < 5; local122++) {
					this.aClass1_Sub1_Sub3_2.method470(this.anIntArray69[local122]);
				}
				return true;
			}
			if (local4 == 613) {
				this.aBoolean67 = !this.aBoolean67;
			}
			if (local4 >= 601 && local4 <= 612) {
				this.method204();
				if (this.aString7.length() > 0) {
					this.aClass1_Sub1_Sub3_2.method469(this.anInt208, 217);
					this.aClass1_Sub1_Sub3_2.method476(Class48.method667(this.aString7), this.anInt402);
					this.aClass1_Sub1_Sub3_2.method470(local4 - 601);
					this.aClass1_Sub1_Sub3_2.method470(this.aBoolean67 ? 1 : 0);
				}
			}
			return false;
		} catch (@Pc(358) RuntimeException local358) {
			signlink.reporterror("70199, " + true + ", " + arg0 + ", " + local358.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "k", descriptor = "(I)V")
	private void method127() {
		try {
			try {
				@Pc(11) int local11 = aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt981 + this.anInt227;
				@Pc(17) int local17 = aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt982 + this.anInt335;
				if (this.anInt409 - local11 < -500 || this.anInt409 - local11 > 500 || this.anInt410 - local17 < -500 || this.anInt410 - local17 > 500) {
					this.anInt409 = local11;
					this.anInt410 = local17;
				}
				if (this.anInt409 != local11) {
					this.anInt409 += (local11 - this.anInt409) / 16;
				}
				if (this.anInt410 != local17) {
					this.anInt410 += (local17 - this.anInt410) / 16;
				}
				if (super.anIntArray30[1] == 1) {
					this.anInt317 += (-this.anInt317 - 24) / 2;
				} else if (super.anIntArray30[2] == 1) {
					this.anInt317 += (24 - this.anInt317) / 2;
				} else {
					this.anInt317 /= 2;
				}
				if (super.anIntArray30[3] == 1) {
					this.anInt318 += (12 - this.anInt318) / 2;
				} else if (super.anIntArray30[4] == 1) {
					this.anInt318 += (-this.anInt318 - 12) / 2;
				} else {
					this.anInt318 /= 2;
				}
				this.anInt316 = this.anInt316 + this.anInt317 / 2 & 0x7FF;
				this.anInt315 += this.anInt318 / 2;
				if (this.anInt315 < 128) {
					this.anInt315 = 128;
				}
				if (this.anInt315 > 383) {
					this.anInt315 = 383;
				}
				@Pc(204) int local204 = this.anInt409 >> 7;
				@Pc(209) int local209 = this.anInt410 >> 7;
				@Pc(220) int local220 = this.method181(this.aByte10, this.anInt361, this.anInt409, this.anInt410);
				@Pc(222) int local222 = 0;
				@Pc(238) int local238;
				if (local204 > 3 && local209 > 3 && local204 < 100 && local209 < 100) {
					for (local238 = local204 - 4; local238 <= local204 + 4; local238++) {
						for (@Pc(244) int local244 = local209 - 4; local244 <= local209 + 4; local244++) {
							@Pc(249) int local249 = this.anInt361;
							if (local249 < 3 && (this.aByteArrayArrayArray7[1][local238][local244] & 0x2) == 2) {
								local249++;
							}
							@Pc(276) int local276 = local220 - this.anIntArrayArrayArray5[local249][local238][local244];
							if (local276 > local222) {
								local222 = local276;
							}
						}
					}
				}
				local238 = local222 * 192;
				if (local238 > 98048) {
					local238 = 98048;
				}
				if (local238 < 32768) {
					local238 = 32768;
				}
				if (local238 > this.anInt349) {
					this.anInt349 += (local238 - this.anInt349) / 24;
				} else if (local238 < this.anInt349) {
					this.anInt349 += (local238 - this.anInt349) / 80;
				}
			} catch (@Pc(340) Exception local340) {
				signlink.reporterror("glfc_ex " + aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt981 + "," + aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt982 + "," + this.anInt409 + "," + this.anInt410 + "," + this.anInt248 + "," + this.anInt249 + "," + this.anInt244 + "," + this.anInt245);
				throw new RuntimeException("eek");
			}
		} catch (@Pc(390) RuntimeException local390) {
			signlink.reporterror("82454, " + 20686 + ", " + local390.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "g", descriptor = "(B)V")
	private void method129() {
		try {
			if (super.anInt197 == 1) {
				if (super.anInt198 >= 539 && super.anInt198 <= 573 && super.anInt199 >= 169 && super.anInt199 < 205 && this.anIntArray86[0] != -1) {
					this.aBoolean54 = true;
					this.anInt312 = 0;
					this.aBoolean79 = true;
				}
				if (super.anInt198 >= 569 && super.anInt198 <= 599 && super.anInt199 >= 168 && super.anInt199 < 205 && this.anIntArray86[1] != -1) {
					this.aBoolean54 = true;
					this.anInt312 = 1;
					this.aBoolean79 = true;
				}
				if (super.anInt198 >= 597 && super.anInt198 <= 627 && super.anInt199 >= 168 && super.anInt199 < 205 && this.anIntArray86[2] != -1) {
					this.aBoolean54 = true;
					this.anInt312 = 2;
					this.aBoolean79 = true;
				}
				if (super.anInt198 >= 625 && super.anInt198 <= 669 && super.anInt199 >= 168 && super.anInt199 < 203 && this.anIntArray86[3] != -1) {
					this.aBoolean54 = true;
					this.anInt312 = 3;
					this.aBoolean79 = true;
				}
				if (super.anInt198 >= 666 && super.anInt198 <= 696 && super.anInt199 >= 168 && super.anInt199 < 205 && this.anIntArray86[4] != -1) {
					this.aBoolean54 = true;
					this.anInt312 = 4;
					this.aBoolean79 = true;
				}
				if (super.anInt198 >= 694 && super.anInt198 <= 724 && super.anInt199 >= 168 && super.anInt199 < 205 && this.anIntArray86[5] != -1) {
					this.aBoolean54 = true;
					this.anInt312 = 5;
					this.aBoolean79 = true;
				}
				if (super.anInt198 >= 722 && super.anInt198 <= 756 && super.anInt199 >= 169 && super.anInt199 < 205 && this.anIntArray86[6] != -1) {
					this.aBoolean54 = true;
					this.anInt312 = 6;
					this.aBoolean79 = true;
				}
				if (super.anInt198 >= 540 && super.anInt198 <= 574 && super.anInt199 >= 466 && super.anInt199 < 502 && this.anIntArray86[7] != -1) {
					this.aBoolean54 = true;
					this.anInt312 = 7;
					this.aBoolean79 = true;
				}
				if (super.anInt198 >= 572 && super.anInt198 <= 602 && super.anInt199 >= 466 && super.anInt199 < 503 && this.anIntArray86[8] != -1) {
					this.aBoolean54 = true;
					this.anInt312 = 8;
					this.aBoolean79 = true;
				}
				if (super.anInt198 >= 599 && super.anInt198 <= 629 && super.anInt199 >= 466 && super.anInt199 < 503 && this.anIntArray86[9] != -1) {
					this.aBoolean54 = true;
					this.anInt312 = 9;
					this.aBoolean79 = true;
				}
				if (super.anInt198 >= 627 && super.anInt198 <= 671 && super.anInt199 >= 467 && super.anInt199 < 502 && this.anIntArray86[10] != -1) {
					this.aBoolean54 = true;
					this.anInt312 = 10;
					this.aBoolean79 = true;
				}
				if (super.anInt198 >= 669 && super.anInt198 <= 699 && super.anInt199 >= 466 && super.anInt199 < 503 && this.anIntArray86[11] != -1) {
					this.aBoolean54 = true;
					this.anInt312 = 11;
					this.aBoolean79 = true;
				}
				if (super.anInt198 >= 696 && super.anInt198 <= 726 && super.anInt199 >= 466 && super.anInt199 < 503 && this.anIntArray86[12] != -1) {
					this.aBoolean54 = true;
					this.anInt312 = 12;
					this.aBoolean79 = true;
				}
				if (super.anInt198 >= 724 && super.anInt198 <= 758 && super.anInt199 >= 466 && super.anInt199 < 502 && this.anIntArray86[13] != -1) {
					this.aBoolean54 = true;
					this.anInt312 = 13;
					this.aBoolean79 = true;
					return;
				}
			}
		} catch (@Pc(449) RuntimeException local449) {
			signlink.reporterror("3543, " + 24 + ", " + local449.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(Z)Z")
	private boolean method130() {
		try {
			return signlink.wavereplay();
		} catch (@Pc(8) RuntimeException local8) {
			signlink.reporterror("61951, " + true + ", " + local8.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILclient!nb;)V")
	private void method131(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub2 arg1) {
		try {
			@Pc(1) int local1 = 0;
			@Pc(3) int local3 = -1;
			@Pc(5) int local5 = 0;
			@Pc(7) int local7 = 0;
			while (arg0 >= 0) {
				this.anInt331 = this.aClass1_Sub1_Sub3_3.method480();
			}
			if (arg1.anInt779 == 0) {
				local1 = this.aClass37_1.method556(arg1.anInt778, arg1.anInt780, arg1.anInt781);
			}
			if (arg1.anInt779 == 1) {
				local1 = this.aClass37_1.method557(arg1.anInt778, arg1.anInt780, arg1.anInt781);
			}
			if (arg1.anInt779 == 2) {
				local1 = this.aClass37_1.method558(arg1.anInt778, arg1.anInt780, arg1.anInt781);
			}
			if (arg1.anInt779 == 3) {
				local1 = this.aClass37_1.method559(arg1.anInt778, arg1.anInt780, arg1.anInt781);
			}
			if (local1 != 0) {
				@Pc(85) int local85 = this.aClass37_1.method560(arg1.anInt778, arg1.anInt780, arg1.anInt781, local1);
				local3 = local1 >> 14 & 0x7FFF;
				local5 = local85 & 0x1F;
				local7 = local85 >> 6;
			}
			arg1.anInt782 = local3;
			arg1.anInt784 = local5;
			arg1.anInt783 = local7;
		} catch (@Pc(110) RuntimeException local110) {
			signlink.reporterror("6406, " + arg0 + ", " + arg1 + ", " + local110.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ZI)V")
	private void method132(@OriginalArg(1) int arg0) {
		try {
			if (!aBoolean72) {
				@Pc(17) Class1_Sub1_Sub2_Sub3 local17;
				@Pc(25) int local25;
				@Pc(33) int local33;
				@Pc(36) byte[] local36;
				@Pc(39) byte[] local39;
				@Pc(41) int local41;
				if (Class1_Sub1_Sub2_Sub1.anIntArray182[17] >= arg0) {
					local17 = Class1_Sub1_Sub2_Sub1.aClass1_Sub1_Sub2_Sub3Array5[17];
					local25 = local17.anInt677 * local17.anInt678 - 1;
					local33 = local17.anInt677 * this.anInt264 * 2;
					local36 = local17.aByteArray7;
					local39 = this.aByteArray2;
					for (local41 = 0; local41 <= local25; local41++) {
						local39[local41] = local36[local41 - local33 & local25];
					}
					local17.aByteArray7 = local39;
					this.aByteArray2 = local36;
					Class1_Sub1_Sub2_Sub1.method349(this.anInt341, 17);
				}
				if (Class1_Sub1_Sub2_Sub1.anIntArray182[24] >= arg0) {
					local17 = Class1_Sub1_Sub2_Sub1.aClass1_Sub1_Sub2_Sub3Array5[24];
					local25 = local17.anInt677 * local17.anInt678 - 1;
					local33 = local17.anInt677 * this.anInt264 * 2;
					local36 = local17.aByteArray7;
					local39 = this.aByteArray2;
					for (local41 = 0; local41 <= local25; local41++) {
						local39[local41] = local36[local41 - local33 & local25];
					}
					local17.aByteArray7 = local39;
					this.aByteArray2 = local36;
					Class1_Sub1_Sub2_Sub1.method349(this.anInt341, 24);
				}
				if (Class1_Sub1_Sub2_Sub1.anIntArray182[34] >= arg0) {
					local17 = Class1_Sub1_Sub2_Sub1.aClass1_Sub1_Sub2_Sub3Array5[34];
					local25 = local17.anInt677 * local17.anInt678 - 1;
					local33 = local17.anInt677 * this.anInt264 * 2;
					local36 = local17.aByteArray7;
					local39 = this.aByteArray2;
					for (local41 = 0; local41 <= local25; local41++) {
						local39[local41] = local36[local41 - local33 & local25];
					}
					local17.aByteArray7 = local39;
					this.aByteArray2 = local36;
					Class1_Sub1_Sub2_Sub1.method349(this.anInt341, 34);
					return;
				}
			}
		} catch (@Pc(187) RuntimeException local187) {
			signlink.reporterror("72894, " + false + ", " + arg0 + ", " + local187.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIZIIBIILclient!d;)V")
	private void method133(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) Class6 arg7) {
		try {
			if (this.aBoolean51) {
				this.anInt338 = 32;
			} else {
				this.anInt338 = 0;
			}
			this.aBoolean51 = false;
			if (arg0 >= arg4 && arg0 < arg4 + 16 && arg1 >= arg6 && arg1 < arg6 + 16) {
				arg7.anInt440 -= this.anInt378 * 4;
				if (arg2) {
					this.aBoolean54 = true;
					return;
				}
			} else if (arg0 >= arg4 && arg0 < arg4 + 16 && arg1 >= arg6 + arg3 - 16 && arg1 < arg6 + arg3) {
				arg7.anInt440 += this.anInt378 * 4;
				if (arg2) {
					this.aBoolean54 = true;
					return;
				}
			} else if (arg0 >= arg4 - this.anInt338 && arg0 < arg4 + this.anInt338 + 16 && arg1 >= arg6 + 16 && arg1 < arg6 + arg3 - 16 && this.anInt378 > 0) {
				@Pc(122) int local122 = (arg3 - 32) * arg3 / arg5;
				if (local122 < 8) {
					local122 = 8;
				}
				@Pc(137) int local137 = arg1 - arg6 - local122 / 2 - 16;
				@Pc(143) int local143 = arg3 - local122 - 32;
				arg7.anInt440 = (arg5 - arg3) * local137 / local143;
				if (arg2) {
					this.aBoolean54 = true;
				}
				this.aBoolean51 = true;
			} else {
				return;
			}
		} catch (@Pc(162) RuntimeException local162) {
			signlink.reporterror("68090, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + -71 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + local162.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "f", descriptor = "(Z)V")
	private void method134() {
		try {
			if (aBoolean72 && this.anInt232 == 2 && Class4.anInt172 != this.anInt361) {
				this.aClass35_14.method524((byte) 4);
				this.aClass1_Sub1_Sub2_Sub4_2.method447("Loading - please wait.", this.anInt241, 151, 0, 257);
				this.aClass1_Sub1_Sub2_Sub4_2.method447("Loading - please wait.", this.anInt241, 150, 16777215, 256);
				this.aClass35_14.method525(super.aGraphics2, 4, 4, (byte) 8);
				this.anInt232 = 1;
				this.aLong15 = System.currentTimeMillis();
			}
			if (this.anInt232 == 1) {
				@Pc(56) int local56 = this.method135((byte) 2);
				if (local56 != 0 && System.currentTimeMillis() - this.aLong15 > 360000L) {
					signlink.reporterror(this.aString16 + " glcfb " + this.aLong17 + "," + local56 + "," + aBoolean72 + "," + this.aClass45Array1[0] + "," + this.aClass44_Sub1_1.method646() + "," + this.anInt361 + "," + this.anInt248 + "," + this.anInt249);
					this.aLong15 = System.currentTimeMillis();
				}
			}
			if (this.anInt232 == 2 && this.anInt361 != this.anInt260) {
				this.anInt260 = this.anInt361;
				this.method182(this.anInt361);
			}
		} catch (@Pc(137) RuntimeException local137) {
			signlink.reporterror("26476, " + false + ", " + local137.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "h", descriptor = "(B)I")
	private int method135(@OriginalArg(0) byte arg0) {
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
			@Pc(44) boolean local44 = false;
			for (@Pc(55) int local55 = 0; local55 < this.aByteArrayArray1.length; local55++) {
				@Pc(62) byte[] local62 = this.aByteArrayArray2[local55];
				if (local62 != null) {
					@Pc(76) int local76 = (this.anIntArray39[local55] >> 8) * 64 - this.anInt244;
					@Pc(88) int local88 = (this.anIntArray39[local55] & 0xFF) * 64 - this.anInt245;
					local39 &= Class4.method58(local76, local62, local88);
				}
			}
			if (!local39) {
				return -3;
			} else if (this.aBoolean46) {
				return -4;
			} else {
				this.anInt232 = 2;
				Class4.anInt172 = this.anInt361;
				this.method100();
				this.aClass1_Sub1_Sub3_2.method469(this.anInt208, 98);
				return 0;
			}
		} catch (@Pc(129) RuntimeException local129) {
			signlink.reporterror("63802, " + arg0 + ", " + local129.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(JI)V")
	private void method136(@OriginalArg(0) long arg0) {
		try {
			if (arg0 != 0L) {
				for (@Pc(8) int local8 = 0; local8 < this.anInt348; local8++) {
					if (this.aLongArray4[local8] == arg0) {
						this.anInt348--;
						this.aBoolean54 = true;
						for (@Pc(28) int local28 = local8; local28 < this.anInt348; local28++) {
							this.aLongArray4[local28] = this.aLongArray4[local28 + 1];
						}
						this.aClass1_Sub1_Sub3_2.method469(this.anInt208, 180);
						this.aClass1_Sub1_Sub3_2.method476(arg0, this.anInt402);
						break;
					}
				}
			}
		} catch (@Pc(77) RuntimeException local77) {
			signlink.reporterror("47865, " + arg0 + ", " + -825 + ", " + local77.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "l", descriptor = "(I)Ljava/lang/String;")
	private String method137(@OriginalArg(0) int arg0) {
		try {
			@Pc(3) int local3 = 90 / arg0;
			if (signlink.mainapp == null) {
				return super.aFrame_Sub1_2 == null ? super.getDocumentBase().getHost().toLowerCase() : "runescape.com";
			} else {
				return signlink.mainapp.getDocumentBase().getHost().toLowerCase();
			}
		} catch (@Pc(21) RuntimeException local21) {
			signlink.reporterror("84274, " + arg0 + ", " + local21.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "g", descriptor = "(Z)V")
	private void method138() {
		try {
			@Pc(7) byte[] local7 = this.aClass47_1.method666("title.dat", null);
			@Pc(13) Class1_Sub1_Sub2_Sub2 local13 = new Class1_Sub1_Sub2_Sub2(local7, this);
			this.aClass35_19.method524((byte) 4);
			local13.method389(anInt329, 0, 0);
			this.aClass35_20.method524((byte) 4);
			local13.method389(anInt329, 0, -637);
			this.aClass35_16.method524((byte) 4);
			local13.method389(anInt329, 0, -128);
			this.aClass35_17.method524((byte) 4);
			local13.method389(anInt329, -371, -202);
			this.aClass35_18.method524((byte) 4);
			local13.method389(anInt329, -171, -202);
			this.aClass35_21.method524((byte) 4);
			local13.method389(anInt329, -265, 0);
			this.aBoolean80 &= true;
			this.aClass35_22.method524((byte) 4);
			local13.method389(anInt329, -265, -562);
			this.aClass35_23.method524((byte) 4);
			local13.method389(anInt329, -171, -128);
			this.aClass35_24.method524((byte) 4);
			local13.method389(anInt329, -171, -562);
			@Pc(104) int[] local104 = new int[local13.anInt652];
			for (@Pc(106) int local106 = 0; local106 < local13.anInt653; local106++) {
				for (@Pc(110) int local110 = 0; local110 < local13.anInt652; local110++) {
					local104[local110] = local13.anIntArray208[local13.anInt652 + local13.anInt652 * local106 - local110 - 1];
				}
				for (@Pc(136) int local136 = 0; local136 < local13.anInt652; local136++) {
					local13.anIntArray208[local136 + local13.anInt652 * local106] = local104[local136];
				}
			}
			this.aClass35_19.method524((byte) 4);
			local13.method389(anInt329, 0, 382);
			this.aClass35_20.method524((byte) 4);
			local13.method389(anInt329, 0, -255);
			this.aClass35_16.method524((byte) 4);
			local13.method389(anInt329, 0, 254);
			this.aClass35_17.method524((byte) 4);
			local13.method389(anInt329, -371, 180);
			this.aClass35_18.method524((byte) 4);
			local13.method389(anInt329, -171, 180);
			this.aClass35_21.method524((byte) 4);
			local13.method389(anInt329, -265, 382);
			this.aClass35_22.method524((byte) 4);
			local13.method389(anInt329, -265, -180);
			this.aClass35_23.method524((byte) 4);
			local13.method389(anInt329, -171, 254);
			this.aClass35_24.method524((byte) 4);
			local13.method389(anInt329, -171, -180);
			local13 = new Class1_Sub1_Sub2_Sub2(this.aClass47_1, "logo", 0);
			this.aClass35_16.method524((byte) 4);
			local13.method391(382 - local13.anInt652 / 2 - 128, 18);
			System.gc();
		} catch (@Pc(274) RuntimeException local274) {
			signlink.reporterror("78490, " + true + ", " + local274.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!lb;IZ)V")
	private void method139(@OriginalArg(0) Class1_Sub1_Sub3 arg0, @OriginalArg(1) int arg1) {
		try {
			for (@Pc(1) int local1 = 0; local1 < this.anInt390; local1++) {
				@Pc(8) int local8 = this.anIntArray88[local1];
				@Pc(13) Class1_Sub1_Sub1_Sub1_Sub1 local13 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local8];
				@Pc(16) int local16 = arg0.method480();
				if ((local16 & 0x80) == 128) {
					local16 += arg0.method480() << 8;
				}
				this.method224(local16, arg0, local13, local8);
			}
		} catch (@Pc(48) RuntimeException local48) {
			signlink.reporterror("2062, " + arg0 + ", " + arg1 + ", " + true + ", " + local48.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILclient!jb;)V")
	private void method140(@OriginalArg(1) Class1_Sub1_Sub2_Sub3 arg0) {
		try {
			for (@Pc(5) int local5 = 0; local5 < this.anIntArray45.length; local5++) {
				this.anIntArray45[local5] = 0;
			}
			@Pc(30) int local30;
			for (@Pc(20) int local20 = 0; local20 < 5000; local20++) {
				local30 = (int) (Math.random() * 128.0D * (double) 256);
				this.anIntArray45[local30] = (int) (Math.random() * 256.0D);
			}
			@Pc(48) int local48;
			@Pc(52) int local52;
			@Pc(60) int local60;
			for (local30 = 0; local30 < 20; local30++) {
				for (local48 = 1; local48 < 255; local48++) {
					for (local52 = 1; local52 < 127; local52++) {
						local60 = local52 + (local48 << 7);
						this.anIntArray46[local60] = (this.anIntArray45[local60 - 1] + this.anIntArray45[local60 + 1] + this.anIntArray45[local60 - 128] + this.anIntArray45[local60 + 128]) / 4;
					}
				}
				@Pc(106) int[] local106 = this.anIntArray45;
				this.anIntArray45 = this.anIntArray46;
				this.anIntArray46 = local106;
			}
			if (arg0 != null) {
				local48 = 0;
				for (local52 = 0; local52 < arg0.anInt678; local52++) {
					for (local60 = 0; local60 < arg0.anInt677; local60++) {
						if (arg0.aByteArray7[local48++] != 0) {
							@Pc(148) int local148 = local60 + arg0.anInt679 + 16;
							@Pc(155) int local155 = local52 + arg0.anInt680 + 16;
							@Pc(161) int local161 = local148 + (local155 << 7);
							this.anIntArray45[local161] = 0;
						}
					}
				}
			}
		} catch (@Pc(178) RuntimeException local178) {
			signlink.reporterror("6824, " + -209 + ", " + arg0 + ", " + local178.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
	@Override
	public AppletContext getAppletContext() {
		return signlink.mainapp == null ? super.getAppletContext() : signlink.mainapp.getAppletContext();
	}

	@OriginalMember(owner = "client!client", name = "m", descriptor = "(I)V")
	private void method141() {
		try {
			for (@Pc(17) Class1_Sub1_Sub1_Sub4 local17 = (Class1_Sub1_Sub1_Sub4) this.aClass29_3.method511(); local17 != null; local17 = (Class1_Sub1_Sub1_Sub4) this.aClass29_3.method513()) {
				if (local17.anInt461 != this.anInt361 || anInt223 > local17.anInt467) {
					local17.method673();
				} else if (anInt223 >= local17.anInt466) {
					if (local17.anInt470 > 0) {
						@Pc(47) Class1_Sub1_Sub1_Sub1_Sub2 local47 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local17.anInt470 - 1];
						if (local47 != null && local47.anInt981 >= 0 && local47.anInt981 < 13312 && local47.anInt982 >= 0 && local47.anInt982 < 13312) {
							local17.method241(local47.anInt982, anInt223, this.method181(this.aByte10, local17.anInt461, local47.anInt981, local47.anInt982) - local17.anInt465, (byte) 6, local47.anInt981);
						}
					}
					if (local17.anInt470 < 0) {
						@Pc(93) int local93 = -local17.anInt470 - 1;
						@Pc(99) Class1_Sub1_Sub1_Sub1_Sub1 local99;
						if (local93 == this.anInt423) {
							local99 = aClass1_Sub1_Sub1_Sub1_Sub1_1;
						} else {
							local99 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local93];
						}
						if (local99 != null && local99.anInt981 >= 0 && local99.anInt981 < 13312 && local99.anInt982 >= 0 && local99.anInt982 < 13312) {
							local17.method241(local99.anInt982, anInt223, this.method181(this.aByte10, local17.anInt461, local99.anInt981, local99.anInt982) - local17.anInt465, (byte) 6, local99.anInt981);
						}
					}
					local17.method242(this.anInt264);
					this.aClass37_1.method541(60, (int) local17.aDouble2, (int) local17.aDouble1, (int) local17.aDouble3, local17, local17.anInt471, false, this.anInt361, -1);
				}
			}
			anInt213++;
			if (anInt213 > 1174) {
				anInt213 = 0;
				this.aClass1_Sub1_Sub3_2.method469(this.anInt208, 179);
				this.aClass1_Sub1_Sub3_2.method470(0);
				@Pc(201) int local201 = this.aClass1_Sub1_Sub3_2.anInt742;
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
				this.aClass1_Sub1_Sub3_2.method479(this.aClass1_Sub1_Sub3_2.anInt742 - local201);
			}
		} catch (@Pc(275) RuntimeException local275) {
			signlink.reporterror("10556, " + -144 + ", " + local275.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(ZB)V")
	private void method142(@OriginalArg(0) boolean arg0) {
		try {
			if (aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt981 >> 7 == this.anInt281 && aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt982 >> 7 == this.anInt282) {
				this.anInt281 = 0;
				anInt386++;
				if (anInt386 > 122) {
					anInt386 = 0;
					this.aClass1_Sub1_Sub3_2.method469(this.anInt208, 168);
					this.aClass1_Sub1_Sub3_2.method470(62);
				}
			}
			@Pc(40) int local40 = this.anInt389;
			if (arg0) {
				local40 = 1;
			}
			for (@Pc(46) int local46 = 0; local46 < local40; local46++) {
				@Pc(52) Class1_Sub1_Sub1_Sub1_Sub1 local52;
				@Pc(57) int local57;
				if (arg0) {
					local52 = aClass1_Sub1_Sub1_Sub1_Sub1_1;
					local57 = this.anInt388 << 14;
				} else {
					local52 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[this.anIntArray87[local46]];
					local57 = this.anIntArray87[local46] << 14;
				}
				if (local52 != null && local52.method680()) {
					local52.aBoolean27 = false;
					if ((aBoolean72 && this.anInt389 > 50 || this.anInt389 > 200) && !arg0 && local52.anInt1001 == local52.anInt985) {
						local52.aBoolean27 = true;
					}
					@Pc(108) int local108 = local52.anInt981 >> 7;
					@Pc(113) int local113 = local52.anInt982 >> 7;
					if (local108 >= 0 && local108 < 104 && local113 >= 0 && local113 < 104) {
						if (local52.aClass1_Sub1_Sub1_Sub5_1 == null || anInt223 < local52.anInt132 || anInt223 >= local52.anInt133) {
							if ((local52.anInt981 & 0x7F) == 64 && (local52.anInt982 & 0x7F) == 64) {
								if (this.anIntArrayArray6[local108][local113] == this.anInt319) {
									continue;
								}
								this.anIntArrayArray6[local108][local113] = this.anInt319;
							}
							local52.anInt131 = this.method181(this.aByte10, this.anInt361, local52.anInt981, local52.anInt982);
							this.aClass37_1.method541(60, local52.anInt982, local52.anInt981, local52.anInt131, local52, local52.anInt983, local52.aBoolean245, this.anInt361, local57);
						} else {
							local52.aBoolean27 = false;
							local52.anInt131 = this.method181(this.aByte10, this.anInt361, local52.anInt981, local52.anInt982);
							this.aClass37_1.method542(local52.anInt139, local52.anInt131, local52.anInt137, local52.anInt138, local52.anInt140, local57, local52.anInt982, local52, this.anInt361, local52.anInt981, local52.anInt983);
						}
					}
				}
			}
		} catch (@Pc(250) RuntimeException local250) {
			signlink.reporterror("75377, " + arg0 + ", " + 58 + ", " + local250.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "h", descriptor = "(Z)V")
	private void method143() {
		try {
			this.anInt250 = 0;
			@Pc(10) int local10 = (aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt981 >> 7) + this.anInt244;
			@Pc(18) int local18 = (aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt982 >> 7) + this.anInt245;
			if (local10 >= 3053 && local10 <= 3156 && local18 >= 3056 && local18 <= 3136) {
				this.anInt250 = 1;
			}
			if (local10 >= 3072 && local10 <= 3118 && local18 >= 9492 && local18 <= 9535) {
				this.anInt250 = 1;
			}
			if (this.anInt250 == 1 && local10 >= 3139 && local10 <= 3199 && local18 >= 3008 && local18 <= 3062) {
				this.anInt250 = 0;
			}
		} catch (@Pc(77) RuntimeException local77) {
			signlink.reporterror("46127, " + false + ", " + local77.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ZI[B)V")
	private void method144(@OriginalArg(0) boolean arg0, @OriginalArg(2) byte[] arg1) {
		try {
			signlink.anInt936 = arg0 ? 1 : 0;
			signlink.midisave(arg1, arg1.length);
			this.anInt330 += 0;
		} catch (@Pc(17) RuntimeException local17) {
			signlink.reporterror("22151, " + arg0 + ", " + 0 + ", " + arg1 + ", " + local17.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(IILclient!lb;)V")
	private void method145(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub1_Sub3 arg1) {
		try {
			while (true) {
				if (arg1.anInt743 + 21 < arg0 * 8) {
					@Pc(13) int local13 = arg1.method491(this.anInt243, 14);
					if (local13 != 16383) {
						if (this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local13] == null) {
							this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local13] = new Class1_Sub1_Sub1_Sub1_Sub2();
						}
						@Pc(33) Class1_Sub1_Sub1_Sub1_Sub2 local33 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local13];
						this.anIntArray93[this.anInt420++] = local13;
						local33.anInt1021 = anInt223;
						local33.aClass13_2 = Class13.method323(arg1.method491(this.anInt243, 12));
						local33.anInt984 = local33.aClass13_2.aByte18;
						local33.anInt1024 = local33.aClass13_2.anInt572;
						local33.anInt987 = local33.aClass13_2.anInt559;
						local33.anInt988 = local33.aClass13_2.anInt560;
						local33.anInt989 = local33.aClass13_2.anInt561;
						local33.anInt990 = local33.aClass13_2.anInt562;
						local33.anInt985 = local33.aClass13_2.anInt558;
						@Pc(96) int local96 = arg1.method491(this.anInt243, 5);
						if (local96 > 15) {
							local96 -= 32;
						}
						@Pc(106) int local106 = arg1.method491(this.anInt243, 5);
						if (local106 > 15) {
							local106 -= 32;
						}
						@Pc(116) int local116 = arg1.method491(this.anInt243, 1);
						local33.method677(aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray273[0] + local106, local116 == 1, aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray272[0] + local96);
						@Pc(143) int local143 = arg1.method491(this.anInt243, 1);
						if (local143 == 1) {
							this.anIntArray88[this.anInt390++] = local13;
						}
						continue;
					}
				}
				arg1.method492(this.anInt365);
				return;
			}
		} catch (@Pc(170) RuntimeException local170) {
			signlink.reporterror("66392, " + 237 + ", " + arg0 + ", " + arg1 + ", " + local170.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "n", descriptor = "(I)V")
	private void method147(@OriginalArg(0) int arg0) {
		try {
			for (@Pc(1) int local1 = 0; local1 < this.anInt420; local1++) {
				@Pc(8) int local8 = this.anIntArray93[local1];
				@Pc(13) Class1_Sub1_Sub1_Sub1_Sub2 local13 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local8];
				if (local13 != null) {
					this.method148(local13.aClass13_2.aByte18, local13, (byte) 6);
				}
			}
			@Pc(31) boolean local31 = false;
		} catch (@Pc(33) RuntimeException local33) {
			signlink.reporterror("8998, " + arg0 + ", " + local33.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILclient!y;B)V")
	private void method148(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub1_Sub1_Sub1 arg1, @OriginalArg(2) byte arg2) {
		try {
			if (arg1.anInt981 < 128 || arg1.anInt982 < 128 || arg1.anInt981 >= 13184 || arg1.anInt982 >= 13184) {
				arg1.anInt1004 = -1;
				arg1.anInt1009 = -1;
				arg1.anInt1018 = 0;
				arg1.anInt1019 = 0;
				arg1.anInt981 = arg1.anIntArray272[0] * 128 + arg1.anInt984 * 64;
				arg1.anInt982 = arg1.anIntArray273[0] * 128 + arg1.anInt984 * 64;
				arg1.method679();
			}
			if (arg1 == aClass1_Sub1_Sub1_Sub1_Sub1_1 && (arg1.anInt981 < 1536 || arg1.anInt982 < 1536 || arg1.anInt981 >= 11776 || arg1.anInt982 >= 11776)) {
				arg1.anInt1004 = -1;
				arg1.anInt1009 = -1;
				arg1.anInt1018 = 0;
				arg1.anInt1019 = 0;
				arg1.anInt981 = arg1.anIntArray272[0] * 128 + arg1.anInt984 * 64;
				arg1.anInt982 = arg1.anIntArray273[0] * 128 + arg1.anInt984 * 64;
				arg1.method679();
			}
			if (arg1.anInt1018 > anInt223) {
				this.method149(arg1);
			} else if (arg1.anInt1019 >= anInt223) {
				this.method150(arg1);
			} else {
				this.method151(arg1);
			}
			this.method152(arg1);
			this.method153(arg1, 508);
			@Pc(155) boolean local155 = false;
		} catch (@Pc(160) RuntimeException local160) {
			signlink.reporterror("18116, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local160.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILclient!y;)V")
	private void method149(@OriginalArg(1) Class1_Sub1_Sub1_Sub1 arg0) {
		try {
			this.anInt330 += 0;
			@Pc(10) int local10 = arg0.anInt1018 - anInt223;
			@Pc(20) int local20 = arg0.anInt1014 * 128 + arg0.anInt984 * 64;
			@Pc(30) int local30 = arg0.anInt1016 * 128 + arg0.anInt984 * 64;
			arg0.anInt981 += (local20 - arg0.anInt981) / local10;
			arg0.anInt982 += (local30 - arg0.anInt982) / local10;
			arg0.anInt1026 = 0;
			if (arg0.anInt1020 == 0) {
				arg0.anInt1023 = 1024;
			}
			if (arg0.anInt1020 == 1) {
				arg0.anInt1023 = 1536;
			}
			if (arg0.anInt1020 == 2) {
				arg0.anInt1023 = 0;
			}
			if (arg0.anInt1020 == 3) {
				arg0.anInt1023 = 512;
			}
		} catch (@Pc(84) RuntimeException local84) {
			signlink.reporterror("1371, " + 0 + ", " + arg0 + ", " + local84.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(ILclient!y;)V")
	private void method150(@OriginalArg(1) Class1_Sub1_Sub1_Sub1 arg0) {
		try {
			if (arg0.anInt1019 == anInt223 || arg0.anInt1004 == -1 || arg0.anInt1007 != 0 || arg0.anInt1006 + 1 > Class27.aClass27Array1[arg0.anInt1004].method506(arg0.anInt1005)) {
				@Pc(29) int local29 = arg0.anInt1019 - arg0.anInt1018;
				@Pc(34) int local34 = anInt223 - arg0.anInt1018;
				@Pc(44) int local44 = arg0.anInt1014 * 128 + arg0.anInt984 * 64;
				@Pc(54) int local54 = arg0.anInt1016 * 128 + arg0.anInt984 * 64;
				@Pc(64) int local64 = arg0.anInt1015 * 128 + arg0.anInt984 * 64;
				@Pc(74) int local74 = arg0.anInt1017 * 128 + arg0.anInt984 * 64;
				arg0.anInt981 = (local44 * (local29 - local34) + local64 * local34) / local29;
				arg0.anInt982 = (local54 * (local29 - local34) + local74 * local34) / local29;
			}
			arg0.anInt1026 = 0;
			if (this.anInt417 == 4131) {
				if (arg0.anInt1020 == 0) {
					arg0.anInt1023 = 1024;
				}
				if (arg0.anInt1020 == 1) {
					arg0.anInt1023 = 1536;
				}
				if (arg0.anInt1020 == 2) {
					arg0.anInt1023 = 0;
				}
				if (arg0.anInt1020 == 3) {
					arg0.anInt1023 = 512;
				}
				arg0.anInt983 = arg0.anInt1023;
			}
		} catch (@Pc(141) RuntimeException local141) {
			signlink.reporterror("42769, " + 4131 + ", " + arg0 + ", " + local141.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!y;Z)V")
	private void method151(@OriginalArg(0) Class1_Sub1_Sub1_Sub1 arg0) {
		try {
			arg0.anInt1001 = arg0.anInt985;
			if (arg0.anInt1025 == 0) {
				arg0.anInt1026 = 0;
			} else {
				if (arg0.anInt1004 != -1 && arg0.anInt1007 == 0) {
					@Pc(30) Class27 local30 = Class27.aClass27Array1[arg0.anInt1004];
					if (arg0.anInt1027 > 0 && local30.anInt797 == 0) {
						arg0.anInt1026++;
						return;
					}
					if (arg0.anInt1027 <= 0 && local30.anInt798 == 0) {
						arg0.anInt1026++;
						return;
					}
				}
				@Pc(59) int local59 = arg0.anInt981;
				@Pc(62) int local62 = arg0.anInt982;
				@Pc(77) int local77 = arg0.anIntArray272[arg0.anInt1025 - 1] * 128 + arg0.anInt984 * 64;
				@Pc(92) int local92 = arg0.anIntArray273[arg0.anInt1025 - 1] * 128 + arg0.anInt984 * 64;
				if (local77 - local59 <= 256 && local77 - local59 >= -256 && local92 - local62 <= 256 && local92 - local62 >= -256) {
					if (local59 < local77) {
						if (local62 < local92) {
							arg0.anInt1023 = 1280;
						} else if (local62 > local92) {
							arg0.anInt1023 = 1792;
						} else {
							arg0.anInt1023 = 1536;
						}
					} else if (local59 > local77) {
						if (local62 < local92) {
							arg0.anInt1023 = 768;
						} else if (local62 > local92) {
							arg0.anInt1023 = 256;
						} else {
							arg0.anInt1023 = 512;
						}
					} else if (local62 < local92) {
						arg0.anInt1023 = 1024;
					} else {
						arg0.anInt1023 = 0;
					}
					@Pc(186) int local186 = arg0.anInt1023 - arg0.anInt983 & 0x7FF;
					if (local186 > 1024) {
						local186 -= 2048;
					}
					@Pc(193) int local193 = arg0.anInt988;
					if (local186 >= -256 && local186 <= 256) {
						local193 = arg0.anInt987;
					} else if (local186 >= 256 && local186 < 768) {
						local193 = arg0.anInt990;
					} else if (local186 >= -768 && local186 <= -256) {
						local193 = arg0.anInt989;
					}
					if (local193 == -1) {
						local193 = arg0.anInt987;
					}
					arg0.anInt1001 = local193;
					@Pc(235) int local235 = 4;
					if (arg0.anInt983 != arg0.anInt1023 && arg0.anInt998 == -1 && arg0.anInt1024 != 0) {
						local235 = 2;
					}
					if (arg0.anInt1025 > 2) {
						local235 = 6;
					}
					if (arg0.anInt1025 > 3) {
						local235 = 8;
					}
					if (arg0.anInt1026 > 0 && arg0.anInt1025 > 1) {
						local235 = 8;
						arg0.anInt1026--;
					}
					if (arg0.aBooleanArray12[arg0.anInt1025 - 1]) {
						local235 <<= 0x1;
					}
					if (local235 >= 8 && arg0.anInt1001 == arg0.anInt987 && arg0.anInt991 != -1) {
						arg0.anInt1001 = arg0.anInt991;
					}
					if (local59 < local77) {
						arg0.anInt981 += local235;
						if (arg0.anInt981 > local77) {
							arg0.anInt981 = local77;
						}
					} else if (local59 > local77) {
						arg0.anInt981 -= local235;
						if (arg0.anInt981 < local77) {
							arg0.anInt981 = local77;
						}
					}
					if (local62 < local92) {
						arg0.anInt982 += local235;
						if (arg0.anInt982 > local92) {
							arg0.anInt982 = local92;
						}
					} else if (local62 > local92) {
						arg0.anInt982 -= local235;
						if (arg0.anInt982 < local92) {
							arg0.anInt982 = local92;
						}
					}
					if (arg0.anInt981 == local77 && arg0.anInt982 == local92) {
						arg0.anInt1025--;
						if (arg0.anInt1027 > 0) {
							arg0.anInt1027--;
							return;
						}
					}
				} else {
					arg0.anInt981 = local77;
					arg0.anInt982 = local92;
				}
			}
		} catch (@Pc(397) RuntimeException local397) {
			signlink.reporterror("17431, " + arg0 + ", " + false + ", " + local397.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!y;I)V")
	private void method152(@OriginalArg(0) Class1_Sub1_Sub1_Sub1 arg0) {
		try {
			if (arg0.anInt1024 != 0) {
				@Pc(34) int local34;
				@Pc(40) int local40;
				if (arg0.anInt998 != -1 && arg0.anInt998 < 32768) {
					@Pc(26) Class1_Sub1_Sub1_Sub1_Sub2 local26 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[arg0.anInt998];
					if (local26 != null) {
						local34 = arg0.anInt981 - local26.anInt981;
						local40 = arg0.anInt982 - local26.anInt982;
						if (local34 != 0 || local40 != 0) {
							arg0.anInt1023 = (int) (Math.atan2((double) local34, (double) local40) * 325.949D) & 0x7FF;
						}
					}
				}
				@Pc(65) int local65;
				if (arg0.anInt998 >= 32768) {
					local65 = arg0.anInt998 - 32768;
					if (local65 == this.anInt423) {
						local65 = this.anInt388;
					}
					@Pc(77) Class1_Sub1_Sub1_Sub1_Sub1 local77 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local65];
					if (local77 != null) {
						local40 = arg0.anInt981 - local77.anInt981;
						@Pc(91) int local91 = arg0.anInt982 - local77.anInt982;
						if (local40 != 0 || local91 != 0) {
							arg0.anInt1023 = (int) (Math.atan2((double) local40, (double) local91) * 325.949D) & 0x7FF;
						}
					}
				}
				if ((arg0.anInt999 != 0 || arg0.anInt1000 != 0) && (arg0.anInt1025 == 0 || arg0.anInt1026 > 0)) {
					local65 = arg0.anInt981 - (arg0.anInt999 - this.anInt244 - this.anInt244) * 64;
					local34 = arg0.anInt982 - (arg0.anInt1000 - this.anInt245 - this.anInt245) * 64;
					if (local65 != 0 || local34 != 0) {
						arg0.anInt1023 = (int) (Math.atan2((double) local65, (double) local34) * 325.949D) & 0x7FF;
					}
					arg0.anInt999 = 0;
					arg0.anInt1000 = 0;
				}
				local65 = arg0.anInt1023 - arg0.anInt983 & 0x7FF;
				if (local65 != 0) {
					if (local65 < arg0.anInt1024 || local65 > 2048 - arg0.anInt1024) {
						arg0.anInt983 = arg0.anInt1023;
					} else if (local65 > 1024) {
						arg0.anInt983 -= arg0.anInt1024;
					} else {
						arg0.anInt983 += arg0.anInt1024;
					}
					arg0.anInt983 &= 0x7FF;
					if (arg0.anInt1001 == arg0.anInt985 && arg0.anInt983 != arg0.anInt1023) {
						if (arg0.anInt986 != -1) {
							arg0.anInt1001 = arg0.anInt986;
							return;
						}
						arg0.anInt1001 = arg0.anInt987;
						return;
					}
				}
			}
		} catch (@Pc(245) RuntimeException local245) {
			signlink.reporterror("33736, " + arg0 + ", " + -318 + ", " + local245.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Lclient!y;I)V")
	private void method153(@OriginalArg(0) Class1_Sub1_Sub1_Sub1 arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(5) boolean local5 = false;
			arg0.aBoolean245 = false;
			@Pc(17) Class27 local17;
			if (arg0.anInt1001 != -1) {
				local17 = Class27.aClass27Array1[arg0.anInt1001];
				arg0.anInt1003++;
				if (arg0.anInt1002 < local17.anInt791 && arg0.anInt1003 > local17.method506(arg0.anInt1002)) {
					arg0.anInt1003 = 0;
					arg0.anInt1002++;
				}
				if (arg0.anInt1002 >= local17.anInt791) {
					arg0.anInt1003 = 0;
					arg0.anInt1002 = 0;
				}
			}
			if (arg0.anInt1009 != -1 && anInt223 >= arg0.anInt1012) {
				if (arg0.anInt1010 < 0) {
					arg0.anInt1010 = 0;
				}
				local17 = Class33.aClass33Array1[arg0.anInt1009].aClass27_2;
				arg0.anInt1011++;
				while (arg0.anInt1010 < local17.anInt791 && arg0.anInt1011 > local17.method506(arg0.anInt1010)) {
					arg0.anInt1011 -= local17.method506(arg0.anInt1010);
					arg0.anInt1010++;
				}
				if (arg0.anInt1010 >= local17.anInt791 && (arg0.anInt1010 < 0 || arg0.anInt1010 >= local17.anInt791)) {
					arg0.anInt1009 = -1;
				}
			}
			if (arg0.anInt1004 != -1 && arg0.anInt1007 <= 1) {
				local17 = Class27.aClass27Array1[arg0.anInt1004];
				if (local17.anInt797 == 1 && arg0.anInt1027 > 0 && arg0.anInt1018 <= anInt223 && arg0.anInt1019 < anInt223) {
					arg0.anInt1007 = 1;
					return;
				}
			}
			if (arg0.anInt1004 != -1 && arg0.anInt1007 == 0) {
				local17 = Class27.aClass27Array1[arg0.anInt1004];
				arg0.anInt1006++;
				while (arg0.anInt1005 < local17.anInt791 && arg0.anInt1006 > local17.method506(arg0.anInt1005)) {
					arg0.anInt1006 -= local17.method506(arg0.anInt1005);
					arg0.anInt1005++;
				}
				if (arg0.anInt1005 >= local17.anInt791) {
					arg0.anInt1005 -= local17.anInt792;
					arg0.anInt1008++;
					if (arg0.anInt1008 >= local17.anInt796) {
						arg0.anInt1004 = -1;
					}
					if (arg0.anInt1005 < 0 || arg0.anInt1005 >= local17.anInt791) {
						arg0.anInt1004 = -1;
					}
				}
				arg0.aBoolean245 = local17.aBoolean205;
			}
			if (arg0.anInt1007 > 0) {
				arg0.anInt1007--;
			}
		} catch (@Pc(262) RuntimeException local262) {
			signlink.reporterror("55751, " + arg0 + ", " + arg1 + ", " + local262.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "j", descriptor = "(B)V")
	private void method154(@OriginalArg(0) byte arg0) {
		try {
			if (this.aBoolean60) {
				this.aBoolean60 = false;
				this.aClass35_3.method525(super.aGraphics2, 4, 0, (byte) 8);
				this.aClass35_4.method525(super.aGraphics2, 357, 0, (byte) 8);
				this.aClass35_5.method525(super.aGraphics2, 4, 722, (byte) 8);
				this.aClass35_6.method525(super.aGraphics2, 205, 743, (byte) 8);
				this.aClass35_7.method525(super.aGraphics2, 0, 0, (byte) 8);
				this.aClass35_8.method525(super.aGraphics2, 4, 516, (byte) 8);
				this.aClass35_9.method525(super.aGraphics2, 205, 516, (byte) 8);
				this.aClass35_10.method525(super.aGraphics2, 357, 496, (byte) 8);
				this.aClass35_11.method525(super.aGraphics2, 338, 0, (byte) 8);
				this.aBoolean54 = true;
				this.aBoolean75 = true;
				this.aBoolean79 = true;
				this.aBoolean85 = true;
				if (this.anInt232 != 2) {
					this.aClass35_14.method525(super.aGraphics2, 4, 4, (byte) 8);
					this.aClass35_13.method525(super.aGraphics2, 4, 550, (byte) 8);
				}
			}
			if (this.anInt232 == 2) {
				this.method112(this.anInt391);
			}
			if (this.aBoolean77 && this.anInt307 == 1) {
				this.aBoolean54 = true;
			}
			@Pc(139) boolean local139;
			if (this.anInt203 != -1) {
				local139 = this.method185(this.anInt264, this.anInt203);
				if (local139) {
					this.aBoolean54 = true;
				}
			}
			if (this.anInt395 == 2) {
				this.aBoolean54 = true;
			}
			if (this.anInt298 == 2) {
				this.aBoolean54 = true;
			}
			if (this.aBoolean54) {
				this.method157();
				this.aBoolean54 = false;
			}
			@Pc(221) int local221;
			if (this.anInt261 == -1) {
				this.aClass6_1.anInt440 = this.anInt212 - this.anInt357 - 77;
				if (super.anInt192 > 448 && super.anInt192 < 560 && super.anInt193 > 332) {
					this.method133(super.anInt192 - 17, super.anInt193 - 357, false, 77, 463, this.anInt212, 0, this.aClass6_1);
				}
				local221 = this.anInt212 - this.aClass6_1.anInt440 - 77;
				if (local221 < 0) {
					local221 = 0;
				}
				if (local221 > this.anInt212 - 77) {
					local221 = this.anInt212 - 77;
				}
				if (this.anInt357 != local221) {
					this.anInt357 = local221;
					this.aBoolean75 = true;
				}
			}
			if (this.anInt261 != -1) {
				local139 = this.method185(this.anInt264, this.anInt261);
				if (local139) {
					this.aBoolean75 = true;
				}
			}
			if (this.anInt395 == 3) {
				this.aBoolean75 = true;
			}
			if (this.anInt298 == 3) {
				this.aBoolean75 = true;
			}
			if (this.aString6 != null) {
				this.aBoolean75 = true;
			}
			if (this.aBoolean77 && this.anInt307 == 2) {
				this.aBoolean75 = true;
			}
			if (this.aBoolean75) {
				this.method225();
				this.aBoolean75 = false;
			}
			if (this.anInt232 == 2) {
				this.method169();
				this.aClass35_13.method525(super.aGraphics2, 4, 550, (byte) 8);
			}
			if (this.anInt313 != -1) {
				this.aBoolean79 = true;
			}
			if (this.aBoolean79) {
				if (this.anInt313 != -1 && this.anInt313 == this.anInt312) {
					this.anInt313 = -1;
					this.aClass1_Sub1_Sub3_2.method469(this.anInt208, 83);
					this.aClass1_Sub1_Sub3_2.method470(this.anInt312);
				}
				this.aBoolean79 = false;
				this.aClass35_27.method524((byte) 4);
				this.aClass1_Sub1_Sub2_Sub3_20.method418(0, 0);
				if (this.anInt203 == -1) {
					if (this.anIntArray86[this.anInt312] != -1) {
						if (this.anInt312 == 0) {
							this.aClass1_Sub1_Sub2_Sub3_6.method418(22, 10);
						}
						if (this.anInt312 == 1) {
							this.aClass1_Sub1_Sub2_Sub3_7.method418(54, 8);
						}
						if (this.anInt312 == 2) {
							this.aClass1_Sub1_Sub2_Sub3_7.method418(82, 8);
						}
						if (this.anInt312 == 3) {
							this.aClass1_Sub1_Sub2_Sub3_8.method418(110, 8);
						}
						if (this.anInt312 == 4) {
							this.aClass1_Sub1_Sub2_Sub3_10.method418(153, 8);
						}
						if (this.anInt312 == 5) {
							this.aClass1_Sub1_Sub2_Sub3_10.method418(181, 8);
						}
						if (this.anInt312 == 6) {
							this.aClass1_Sub1_Sub2_Sub3_9.method418(209, 9);
						}
					}
					if (this.anIntArray86[0] != -1 && (this.anInt313 != 0 || anInt223 % 20 < 10)) {
						this.aClass1_Sub1_Sub2_Sub3Array4[0].method418(29, 13);
					}
					if (this.anIntArray86[1] != -1 && (this.anInt313 != 1 || anInt223 % 20 < 10)) {
						this.aClass1_Sub1_Sub2_Sub3Array4[1].method418(53, 11);
					}
					if (this.anIntArray86[2] != -1 && (this.anInt313 != 2 || anInt223 % 20 < 10)) {
						this.aClass1_Sub1_Sub2_Sub3Array4[2].method418(82, 11);
					}
					if (this.anIntArray86[3] != -1 && (this.anInt313 != 3 || anInt223 % 20 < 10)) {
						this.aClass1_Sub1_Sub2_Sub3Array4[3].method418(115, 12);
					}
					if (this.anIntArray86[4] != -1 && (this.anInt313 != 4 || anInt223 % 20 < 10)) {
						this.aClass1_Sub1_Sub2_Sub3Array4[4].method418(153, 13);
					}
					if (this.anIntArray86[5] != -1 && (this.anInt313 != 5 || anInt223 % 20 < 10)) {
						this.aClass1_Sub1_Sub2_Sub3Array4[5].method418(180, 11);
					}
					if (this.anIntArray86[6] != -1 && (this.anInt313 != 6 || anInt223 % 20 < 10)) {
						this.aClass1_Sub1_Sub2_Sub3Array4[6].method418(208, 13);
					}
				}
				this.aClass35_27.method525(super.aGraphics2, 160, 516, (byte) 8);
				this.aClass35_26.method524((byte) 4);
				this.aClass1_Sub1_Sub2_Sub3_19.method418(0, 0);
				if (this.anInt203 == -1) {
					if (this.anIntArray86[this.anInt312] != -1) {
						if (this.anInt312 == 7) {
							this.aClass1_Sub1_Sub2_Sub3_1.method418(42, 0);
						}
						if (this.anInt312 == 8) {
							this.aClass1_Sub1_Sub2_Sub3_2.method418(74, 0);
						}
						if (this.anInt312 == 9) {
							this.aClass1_Sub1_Sub2_Sub3_2.method418(102, 0);
						}
						if (this.anInt312 == 10) {
							this.aClass1_Sub1_Sub2_Sub3_3.method418(130, 1);
						}
						if (this.anInt312 == 11) {
							this.aClass1_Sub1_Sub2_Sub3_5.method418(173, 0);
						}
						if (this.anInt312 == 12) {
							this.aClass1_Sub1_Sub2_Sub3_5.method418(201, 0);
						}
						if (this.anInt312 == 13) {
							this.aClass1_Sub1_Sub2_Sub3_4.method418(229, 0);
						}
					}
					if (this.anIntArray86[8] != -1 && (this.anInt313 != 8 || anInt223 % 20 < 10)) {
						this.aClass1_Sub1_Sub2_Sub3Array4[7].method418(74, 2);
					}
					if (this.anIntArray86[9] != -1 && (this.anInt313 != 9 || anInt223 % 20 < 10)) {
						this.aClass1_Sub1_Sub2_Sub3Array4[8].method418(102, 3);
					}
					if (this.anIntArray86[10] != -1 && (this.anInt313 != 10 || anInt223 % 20 < 10)) {
						this.aClass1_Sub1_Sub2_Sub3Array4[9].method418(137, 4);
					}
					if (this.anIntArray86[11] != -1 && (this.anInt313 != 11 || anInt223 % 20 < 10)) {
						this.aClass1_Sub1_Sub2_Sub3Array4[10].method418(174, 2);
					}
					if (this.anIntArray86[12] != -1 && (this.anInt313 != 12 || anInt223 % 20 < 10)) {
						this.aClass1_Sub1_Sub2_Sub3Array4[11].method418(201, 2);
					}
					if (this.anIntArray86[13] != -1 && (this.anInt313 != 13 || anInt223 % 20 < 10)) {
						this.aClass1_Sub1_Sub2_Sub3Array4[12].method418(226, 2);
					}
				}
				this.aClass35_26.method525(super.aGraphics2, 466, 496, (byte) 8);
				this.aClass35_14.method524((byte) 4);
			}
			if (this.aBoolean85) {
				this.aBoolean85 = false;
				this.aClass35_25.method524((byte) 4);
				this.aClass1_Sub1_Sub2_Sub3_18.method418(0, 0);
				this.aClass1_Sub1_Sub2_Sub4_2.method448(55, 16777215, "Public chat", 28, true);
				if (this.anInt377 == 0) {
					this.aClass1_Sub1_Sub2_Sub4_2.method448(55, 65280, "On", 41, true);
				}
				if (this.anInt377 == 1) {
					this.aClass1_Sub1_Sub2_Sub4_2.method448(55, 16776960, "Friends", 41, true);
				}
				if (this.anInt377 == 2) {
					this.aClass1_Sub1_Sub2_Sub4_2.method448(55, 16711680, "Off", 41, true);
				}
				if (this.anInt377 == 3) {
					this.aClass1_Sub1_Sub2_Sub4_2.method448(55, 65535, "Hide", 41, true);
				}
				this.aClass1_Sub1_Sub2_Sub4_2.method448(184, 16777215, "Private chat", 28, true);
				if (this.anInt294 == 0) {
					this.aClass1_Sub1_Sub2_Sub4_2.method448(184, 65280, "On", 41, true);
				}
				if (this.anInt294 == 1) {
					this.aClass1_Sub1_Sub2_Sub4_2.method448(184, 16776960, "Friends", 41, true);
				}
				if (this.anInt294 == 2) {
					this.aClass1_Sub1_Sub2_Sub4_2.method448(184, 16711680, "Off", 41, true);
				}
				this.aClass1_Sub1_Sub2_Sub4_2.method448(324, 16777215, "Trade/compete", 28, true);
				if (this.anInt355 == 0) {
					this.aClass1_Sub1_Sub2_Sub4_2.method448(324, 65280, "On", 41, true);
				}
				if (this.anInt355 == 1) {
					this.aClass1_Sub1_Sub2_Sub4_2.method448(324, 16776960, "Friends", 41, true);
				}
				if (this.anInt355 == 2) {
					this.aClass1_Sub1_Sub2_Sub4_2.method448(324, 16711680, "Off", 41, true);
				}
				this.aClass1_Sub1_Sub2_Sub4_2.method448(458, 16777215, "Report abuse", 33, true);
				this.aClass35_25.method525(super.aGraphics2, 453, 0, (byte) 8);
				this.aClass35_14.method524((byte) 4);
			}
			this.anInt264 = 0;
			if (arg0 != 1) {
				for (local221 = 1; local221 > 0; local221++) {
				}
			}
		} catch (@Pc(1058) RuntimeException local1058) {
			signlink.reporterror("4392, " + arg0 + ", " + local1058.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IILclient!d;II)V")
	private void method155(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class6 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		try {
			if (arg4 >= this.anInt340 && arg4 <= this.anInt340 && (arg2.anInt431 == 0 && arg2.anIntArray98 != null && (!arg2.aBoolean93 || this.anInt354 == arg2.anInt429 || this.anInt233 == arg2.anInt429 || this.anInt337 == arg2.anInt429))) {
				@Pc(38) int local38 = Class1_Sub1_Sub2.anInt700;
				@Pc(40) int local40 = Class1_Sub1_Sub2.anInt698;
				@Pc(42) int local42 = Class1_Sub1_Sub2.anInt701;
				@Pc(44) int local44 = Class1_Sub1_Sub2.anInt699;
				Class1_Sub1_Sub2.method436(arg0, arg1, arg0 + arg2.anInt435, arg1 + arg2.anInt434);
				@Pc(60) int local60 = arg2.anIntArray98.length;
				for (@Pc(62) int local62 = 0; local62 < local60; local62++) {
					@Pc(71) int local71 = arg2.anIntArray99[local62] + arg1;
					@Pc(80) int local80 = arg2.anIntArray100[local62] + arg0 - arg3;
					@Pc(87) Class6 local87 = Class6.aClass6Array1[arg2.anIntArray98[local62]];
					@Pc(92) int local92 = local71 + local87.anInt436;
					@Pc(97) int local97 = local80 + local87.anInt437;
					if (local87.anInt433 > 0) {
						this.method183(local87);
					}
					if (local87.anInt431 == 0) {
						if (local87.anInt440 > local87.anInt439 - local87.anInt435) {
							local87.anInt440 = local87.anInt439 - local87.anInt435;
						}
						if (local87.anInt440 < 0) {
							local87.anInt440 = 0;
						}
						this.method155(local97, local92, local87, local87.anInt440, this.anInt340);
						if (local87.anInt439 > local87.anInt435) {
							this.method196(local97, local87.anInt439, local87.anInt440, local92 + local87.anInt434, local87.anInt435);
						}
					} else if (local87.anInt431 != 1) {
						@Pc(170) int local170;
						@Pc(174) int local174;
						@Pc(185) int local185;
						@Pc(220) int local220;
						@Pc(227) int local227;
						@Pc(168) int local168;
						@Pc(218) int local218;
						if (local87.anInt431 == 2) {
							local168 = 0;
							for (local170 = 0; local170 < local87.anInt435; local170++) {
								for (local174 = 0; local174 < local87.anInt434; local174++) {
									local185 = local92 + local174 * (local87.anInt442 + 32);
									@Pc(194) int local194 = local97 + local170 * (local87.anInt443 + 32);
									if (local168 < 20) {
										local185 += local87.anIntArray101[local168];
										local194 += local87.anIntArray102[local168];
									}
									if (local87.anIntArray94[local168] > 0) {
										local218 = 0;
										local220 = 0;
										local227 = local87.anIntArray94[local168] - 1;
										if (local185 > Class1_Sub1_Sub2.anInt700 - 32 && local185 < Class1_Sub1_Sub2.anInt701 && local194 > Class1_Sub1_Sub2.anInt698 - 32 && local194 < Class1_Sub1_Sub2.anInt699 || this.anInt298 != 0 && this.anInt297 == local168) {
											@Pc(252) int local252 = 0;
											if (this.anInt301 == 1 && this.anInt302 == local168 && this.anInt303 == local87.anInt429) {
												local252 = 16777215;
											}
											@Pc(276) Class1_Sub1_Sub2_Sub2 local276 = Class15.method367(local227, local87.anIntArray95[local168], local252);
											if (local276 != null) {
												@Pc(355) int local355;
												if (this.anInt298 != 0 && this.anInt297 == local168 && this.anInt296 == local87.anInt429) {
													local218 = super.anInt192 - this.anInt299;
													local220 = super.anInt193 - this.anInt300;
													if (local218 < 5 && local218 > -5) {
														local218 = 0;
													}
													if (local220 < 5 && local220 > -5) {
														local220 = 0;
													}
													if (this.anInt353 < 5) {
														local218 = 0;
														local220 = 0;
													}
													local276.method393(local185 + local218, local194 + local220);
													if (local194 + local220 < Class1_Sub1_Sub2.anInt698 && arg2.anInt440 > 0) {
														local355 = this.anInt264 * (Class1_Sub1_Sub2.anInt698 - local194 - local220) / 3;
														if (local355 > this.anInt264 * 10) {
															local355 = this.anInt264 * 10;
														}
														if (local355 > arg2.anInt440) {
															local355 = arg2.anInt440;
														}
														arg2.anInt440 -= local355;
														this.anInt300 += local355;
													}
													if (local194 + local220 + 32 > Class1_Sub1_Sub2.anInt699 && arg2.anInt440 < arg2.anInt439 - arg2.anInt435) {
														local355 = this.anInt264 * (local194 + local220 + 32 - Class1_Sub1_Sub2.anInt699) / 3;
														if (local355 > this.anInt264 * 10) {
															local355 = this.anInt264 * 10;
														}
														if (local355 > arg2.anInt439 - arg2.anInt435 - arg2.anInt440) {
															local355 = arg2.anInt439 - arg2.anInt435 - arg2.anInt440;
														}
														arg2.anInt440 += local355;
														this.anInt300 -= local355;
													}
												} else if (this.anInt395 != 0 && this.anInt394 == local168 && this.anInt393 == local87.anInt429) {
													local276.method393(local185, local194);
												} else {
													local276.method391(local185, local194);
												}
												if (local276.anInt656 == 33 || local87.anIntArray95[local168] != 1) {
													local355 = local87.anIntArray95[local168];
													this.aClass1_Sub1_Sub2_Sub4_1.method451(method217(local355), 0, local194 + local220 + 10, local185 + 1 + local218);
													this.aClass1_Sub1_Sub2_Sub4_1.method451(method217(local355), 16776960, local194 + local220 + 9, local185 + local218);
												}
											}
										}
									} else if (local87.aClass1_Sub1_Sub2_Sub2Array8 != null && local168 < 20) {
										@Pc(544) Class1_Sub1_Sub2_Sub2 local544 = local87.aClass1_Sub1_Sub2_Sub2Array8[local168];
										if (local544 != null) {
											local544.method391(local185, local194);
										}
									}
									local168++;
								}
							}
						} else if (local87.anInt431 == 3) {
							@Pc(570) boolean local570 = false;
							if (this.anInt337 == local87.anInt429 || this.anInt233 == local87.anInt429 || this.anInt354 == local87.anInt429) {
								local570 = true;
							}
							if (this.method163(local87)) {
								local168 = local87.anInt445;
								if (local570 && local87.anInt447 != 0) {
									local168 = local87.anInt447;
								}
							} else {
								local168 = local87.anInt444;
								if (local570 && local87.anInt446 != 0) {
									local168 = local87.anInt446;
								}
							}
							if (local87.aByte13 == 0) {
								if (local87.aBoolean99) {
									Class1_Sub1_Sub2.method439(local92, local87.anInt434, local168, local97, local87.anInt435);
								} else {
									Class1_Sub1_Sub2.method440(local87.anInt434, local97, local92, local87.anInt435, local168);
								}
							} else if (local87.aBoolean99) {
								Class1_Sub1_Sub2.method438(local97, local92, 256 - (local87.aByte13 & 0xFF), local168, local87.anInt434, local87.anInt435);
							} else {
								Class1_Sub1_Sub2.method441(local168, local87.anInt434, local87.anInt435, local97, local92, 256 - (local87.aByte13 & 0xFF));
							}
						} else {
							@Pc(688) Class1_Sub1_Sub2_Sub4 local688;
							if (local87.anInt431 == 4) {
								local688 = local87.aClass1_Sub1_Sub2_Sub4_5;
								@Pc(691) String local691 = local87.aString18;
								@Pc(693) boolean local693 = false;
								if (this.anInt337 == local87.anInt429 || this.anInt233 == local87.anInt429 || this.anInt354 == local87.anInt429) {
									local693 = true;
								}
								if (this.method163(local87)) {
									local170 = local87.anInt445;
									if (local693 && local87.anInt447 != 0) {
										local170 = local87.anInt447;
									}
									if (local87.aString19.length() > 0) {
										local691 = local87.aString19;
									}
								} else {
									local170 = local87.anInt444;
									if (local693 && local87.anInt446 != 0) {
										local170 = local87.anInt446;
									}
								}
								if (local87.anInt432 == 6 && this.aBoolean90) {
									local691 = "Please wait...";
									local170 = local87.anInt444;
								}
								if (Class1_Sub1_Sub2.anInt696 == 479) {
									if (local170 == 16776960) {
										local170 = 255;
									}
									if (local170 == 49152) {
										local170 = 16777215;
									}
								}
								local218 = local97 + local688.anInt710;
								while (local691.length() > 0) {
									if (local691.indexOf("%") != -1) {
										label351: while (true) {
											local220 = local691.indexOf("%1");
											if (local220 == -1) {
												while (true) {
													local220 = local691.indexOf("%2");
													if (local220 == -1) {
														while (true) {
															local220 = local691.indexOf("%3");
															if (local220 == -1) {
																while (true) {
																	local220 = local691.indexOf("%4");
																	if (local220 == -1) {
																		while (true) {
																			local220 = local691.indexOf("%5");
																			if (local220 == -1) {
																				break label351;
																			}
																			local691 = local691.substring(0, local220) + this.method191(this.method203(local87, 4)) + local691.substring(local220 + 2);
																		}
																	}
																	local691 = local691.substring(0, local220) + this.method191(this.method203(local87, 3)) + local691.substring(local220 + 2);
																}
															}
															local691 = local691.substring(0, local220) + this.method191(this.method203(local87, 2)) + local691.substring(local220 + 2);
														}
													}
													local691 = local691.substring(0, local220) + this.method191(this.method203(local87, 1)) + local691.substring(local220 + 2);
												}
											}
											local691 = local691.substring(0, local220) + this.method191(this.method203(local87, 0)) + local691.substring(local220 + 2);
										}
									}
									local220 = local691.indexOf("\\n");
									@Pc(965) String local965;
									if (local220 == -1) {
										local965 = local691;
										local691 = "";
									} else {
										local965 = local691.substring(0, local220);
										local691 = local691.substring(local220 + 2);
									}
									if (local87.aBoolean100) {
										local688.method448(local92 + local87.anInt434 / 2, local170, local965, local218, local87.aBoolean101);
									} else {
										local688.method455(local92, local170, local965, local87.aBoolean101, local218);
									}
									local218 += local688.anInt710;
								}
							} else if (local87.anInt431 == 5) {
								@Pc(1027) Class1_Sub1_Sub2_Sub2 local1027;
								if (this.method163(local87)) {
									local1027 = local87.aClass1_Sub1_Sub2_Sub2_16;
								} else {
									local1027 = local87.aClass1_Sub1_Sub2_Sub2_15;
								}
								if (local1027 != null) {
									local1027.method391(local92, local97);
								}
							} else if (local87.anInt431 == 6) {
								local168 = Class1_Sub1_Sub2_Sub1.anInt597;
								local170 = Class1_Sub1_Sub2_Sub1.anInt598;
								Class1_Sub1_Sub2_Sub1.anInt597 = local92 + local87.anInt434 / 2;
								Class1_Sub1_Sub2_Sub1.anInt598 = local97 + local87.anInt435 / 2;
								local174 = Class1_Sub1_Sub2_Sub1.anIntArray178[local87.anInt455] * local87.anInt454 >> 16;
								local185 = Class1_Sub1_Sub2_Sub1.anIntArray179[local87.anInt455] * local87.anInt454 >> 16;
								@Pc(1088) boolean local1088 = this.method163(local87);
								if (local1088) {
									local218 = local87.anInt453;
								} else {
									local218 = local87.anInt452;
								}
								@Pc(1108) Class1_Sub1_Sub1_Sub5 local1108;
								if (local218 == -1) {
									local1108 = local87.method233(-1, local1088, -1);
								} else {
									@Pc(1114) Class27 local1114 = Class27.aClass27Array1[local218];
									local1108 = local87.method233(local1114.anIntArray225[local87.anInt427], local1088, local1114.anIntArray226[local87.anInt427]);
								}
								if (local1108 != null) {
									local1108.method281(local87.anInt456, 0, local87.anInt455, 0, local174, local185);
								}
								Class1_Sub1_Sub2_Sub1.anInt597 = local168;
								Class1_Sub1_Sub2_Sub1.anInt598 = local170;
							} else if (local87.anInt431 == 7) {
								local688 = local87.aClass1_Sub1_Sub2_Sub4_5;
								local170 = 0;
								for (local174 = 0; local174 < local87.anInt435; local174++) {
									for (local185 = 0; local185 < local87.anInt434; local185++) {
										if (local87.anIntArray94[local170] > 0) {
											@Pc(1178) Class15 local1178 = Class15.method361(local87.anIntArray94[local170] - 1);
											@Pc(1181) String local1181 = local1178.aString25;
											if (local1178.aBoolean158 || local87.anIntArray95[local170] != 1) {
												local1181 = local1181 + " x" + method128(local87.anIntArray95[local170]);
											}
											local220 = local92 + local185 * (local87.anInt442 + 115);
											local227 = local97 + local174 * (local87.anInt443 + 12);
											if (local87.aBoolean100) {
												local688.method448(local220 + local87.anInt434 / 2, local87.anInt444, local1181, local227, local87.aBoolean101);
											} else {
												local688.method455(local220, local87.anInt444, local1181, local87.aBoolean101, local227);
											}
										}
										local170++;
									}
								}
							}
						}
					}
				}
				Class1_Sub1_Sub2.method436(local40, local38, local44, local42);
			}
		} catch (@Pc(1277) RuntimeException local1277) {
			signlink.reporterror("74997, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local1277.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!lb;II)V")
	private void method156(@OriginalArg(0) Class1_Sub1_Sub3 arg0, @OriginalArg(1) int arg1) {
		try {
			arg0.method490();
			@Pc(12) int local12 = arg0.method491(this.anInt243, 1);
			if (local12 != 0) {
				@Pc(21) int local21 = arg0.method491(this.anInt243, 2);
				if (local21 == 0) {
					this.anIntArray88[this.anInt390++] = this.anInt388;
				} else {
					@Pc(45) int local45;
					@Pc(56) int local56;
					if (local21 == 1) {
						local45 = arg0.method491(this.anInt243, 3);
						aClass1_Sub1_Sub1_Sub1_Sub1_1.method678(692, local45, false);
						local56 = arg0.method491(this.anInt243, 1);
						if (local56 == 1) {
							this.anIntArray88[this.anInt390++] = this.anInt388;
						}
					} else {
						@Pc(103) int local103;
						if (local21 == 2) {
							local45 = arg0.method491(this.anInt243, 3);
							aClass1_Sub1_Sub1_Sub1_Sub1_1.method678(692, local45, true);
							local56 = arg0.method491(this.anInt243, 3);
							aClass1_Sub1_Sub1_Sub1_Sub1_1.method678(692, local56, true);
							local103 = arg0.method491(this.anInt243, 1);
							if (local103 == 1) {
								this.anIntArray88[this.anInt390++] = this.anInt388;
							}
						} else if (local21 == 3) {
							this.anInt361 = arg0.method491(this.anInt243, 2);
							local45 = arg0.method491(this.anInt243, 7);
							local56 = arg0.method491(this.anInt243, 7);
							local103 = arg0.method491(this.anInt243, 1);
							aClass1_Sub1_Sub1_Sub1_Sub1_1.method677(local56, local103 == 1, local45);
							@Pc(164) int local164 = arg0.method491(this.anInt243, 1);
							if (local164 == 1) {
								this.anIntArray88[this.anInt390++] = this.anInt388;
							}
						}
					}
				}
			}
		} catch (@Pc(181) RuntimeException local181) {
			signlink.reporterror("53459, " + arg0 + ", " + arg1 + ", " + -33436 + ", " + local181.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "o", descriptor = "(I)V")
	private void method157() {
		try {
			if (this.anInt369 != -14114) {
				this.anInt331 = this.aClass1_Sub1_Sub3_3.method480();
			}
			this.aClass35_12.method524((byte) 4);
			Class1_Sub1_Sub2_Sub1.anIntArray180 = this.anIntArray48;
			this.aClass1_Sub1_Sub2_Sub3_15.method418(0, 0);
			if (this.anInt203 != -1) {
				this.method155(0, 0, Class6.aClass6Array1[this.anInt203], 0, this.anInt340);
			} else if (this.anIntArray86[this.anInt312] != -1) {
				this.method155(0, 0, Class6.aClass6Array1[this.anIntArray86[this.anInt312]], 0, this.anInt340);
			}
			if (this.aBoolean77 && this.anInt307 == 1) {
				this.method180();
			}
			this.aClass35_12.method525(super.aGraphics2, 205, 553, (byte) 8);
			this.aClass35_14.method524((byte) 4);
			Class1_Sub1_Sub2_Sub1.anIntArray180 = this.anIntArray49;
		} catch (@Pc(86) RuntimeException local86) {
			signlink.reporterror("4348, " + -14114 + ", " + local86.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "p", descriptor = "(I)V")
	private void method158() {
		try {
			@Pc(7) int local7 = this.aClass1_Sub1_Sub2_Sub4_3.method449((byte) 5, "Choose Option");
			@Pc(20) int local20;
			for (@Pc(9) int local9 = 0; local9 < this.anInt278; local9++) {
				local20 = this.aClass1_Sub1_Sub2_Sub4_3.method449((byte) 5, this.aStringArray5[local9]);
				if (local20 > local7) {
					local7 = local20;
				}
			}
			local7 += 8;
			local20 = this.anInt278 * 15 + 21;
			@Pc(74) int local74;
			@Pc(92) int local92;
			if (super.anInt198 > 4 && super.anInt199 > 4 && super.anInt198 < 516 && super.anInt199 < 338) {
				local74 = super.anInt198 - local7 / 2 - 4;
				if (local74 + local7 > 512) {
					local74 = 512 - local7;
				}
				if (local74 < 0) {
					local74 = 0;
				}
				local92 = super.anInt199 - 4;
				if (local92 + local20 > 334) {
					local92 = 334 - local20;
				}
				if (local92 < 0) {
					local92 = 0;
				}
				this.aBoolean77 = true;
				this.anInt307 = 0;
				this.anInt308 = local74;
				this.anInt309 = local92;
				this.anInt310 = local7;
				this.anInt311 = this.anInt278 * 15 + 22;
			}
			if (super.anInt198 > 553 && super.anInt199 > 205 && super.anInt198 < 743 && super.anInt199 < 466) {
				local74 = super.anInt198 - local7 / 2 - 553;
				if (local74 < 0) {
					local74 = 0;
				} else if (local74 + local7 > 190) {
					local74 = 190 - local7;
				}
				local92 = super.anInt199 - 205;
				if (local92 < 0) {
					local92 = 0;
				} else if (local92 + local20 > 261) {
					local92 = 261 - local20;
				}
				this.aBoolean77 = true;
				this.anInt307 = 1;
				this.anInt308 = local74;
				this.anInt309 = local92;
				this.anInt310 = local7;
				this.anInt311 = this.anInt278 * 15 + 22;
			}
			if (super.anInt198 > 17 && super.anInt199 > 357 && super.anInt198 < 496 && super.anInt199 < 453) {
				local74 = super.anInt198 - local7 / 2 - 17;
				if (local74 < 0) {
					local74 = 0;
				} else if (local74 + local7 > 479) {
					local74 = 479 - local7;
				}
				local92 = super.anInt199 - 357;
				if (local92 < 0) {
					local92 = 0;
				} else if (local92 + local20 > 96) {
					local92 = 96 - local20;
				}
				this.aBoolean77 = true;
				this.anInt307 = 2;
				this.anInt308 = local74;
				this.anInt309 = local92;
				this.anInt310 = local7;
				this.anInt311 = this.anInt278 * 15 + 22;
			}
		} catch (@Pc(296) RuntimeException local296) {
			signlink.reporterror("46603, " + 5 + ", " + local296.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ZLclient!y;I)V")
	private void method159(@OriginalArg(1) Class1_Sub1_Sub1_Sub1 arg0, @OriginalArg(2) int arg1) {
		try {
			this.method160(arg0.anInt982, arg0.anInt981, 265, arg1);
		} catch (@Pc(16) RuntimeException local16) {
			signlink.reporterror("33342, " + true + ", " + arg0 + ", " + arg1 + ", " + local16.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIII)V")
	private void method160(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		try {
			if (arg1 >= 128 && arg0 >= 128 && arg1 <= 13056 && arg0 <= 13056) {
				@Pc(29) int local29 = this.method181(this.aByte10, this.anInt361, arg1, arg0) - arg3;
				@Pc(34) int local34 = arg1 - this.anInt251;
				@Pc(39) int local39 = local29 - this.anInt252;
				@Pc(43) boolean local43 = false;
				@Pc(48) int local48 = arg0 - this.anInt253;
				@Pc(53) int local53 = Class1_Sub1_Sub1_Sub5.anIntArray151[this.anInt254];
				@Pc(58) int local58 = Class1_Sub1_Sub1_Sub5.anIntArray152[this.anInt254];
				@Pc(63) int local63 = Class1_Sub1_Sub1_Sub5.anIntArray151[this.anInt255];
				@Pc(68) int local68 = Class1_Sub1_Sub1_Sub5.anIntArray152[this.anInt255];
				@Pc(78) int local78 = local48 * local63 + local34 * local68 >> 16;
				@Pc(88) int local88 = local48 * local68 - local34 * local63 >> 16;
				@Pc(90) int local90 = local78;
				@Pc(100) int local100 = local39 * local58 - local88 * local53 >> 16;
				@Pc(110) int local110 = local39 * local53 + local88 * local58 >> 16;
				if (local110 >= 50) {
					this.anInt379 = Class1_Sub1_Sub2_Sub1.anInt597 + (local90 << 9) / local110;
					this.anInt380 = Class1_Sub1_Sub2_Sub1.anInt598 + (local100 << 9) / local110;
				} else {
					this.anInt379 = -1;
					this.anInt380 = -1;
				}
			} else {
				this.anInt379 = -1;
				this.anInt380 = -1;
			}
		} catch (@Pc(142) RuntimeException local142) {
			signlink.reporterror("17677, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local142.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(III)V")
	private void method161(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		try {
			@Pc(12) int local12 = 0;
			for (@Pc(14) int local14 = 0; local14 < 100; local14++) {
				if (this.aStringArray4[local14] != null) {
					@Pc(26) int local26 = this.anIntArray53[local14];
					@Pc(37) int local37 = this.anInt357 + 70 + 4 - local12 * 14;
					if (local37 < -20) {
						break;
					}
					@Pc(45) String local45 = this.aStringArray3[local14];
					if (local45 != null && local45.startsWith("@cr1@")) {
						local45 = local45.substring(5);
					}
					if (local45 != null && local45.startsWith("@cr2@")) {
						local45 = local45.substring(5);
					}
					if (local26 == 0) {
						local12++;
					}
					if ((local26 == 1 || local26 == 2) && (local26 == 1 || this.anInt377 == 0 || this.anInt377 == 1 && this.method113(local45))) {
						if (arg0 > local37 - 14 && arg0 <= local37 && !local45.equals(aClass1_Sub1_Sub1_Sub1_Sub1_1.aString3)) {
							if (this.anInt306 >= 1) {
								this.aStringArray5[this.anInt278] = "Report abuse @whi@" + local45;
								this.anIntArray36[this.anInt278] = 524;
								this.anInt278++;
							}
							this.aStringArray5[this.anInt278] = "Add ignore @whi@" + local45;
							this.anIntArray36[this.anInt278] = 47;
							this.anInt278++;
							this.aStringArray5[this.anInt278] = "Add friend @whi@" + local45;
							this.anIntArray36[this.anInt278] = 605;
							this.anInt278++;
						}
						local12++;
					}
					if ((local26 == 3 || local26 == 7) && this.anInt234 == 0 && (local26 == 7 || this.anInt294 == 0 || this.anInt294 == 1 && this.method113(local45))) {
						if (arg0 > local37 - 14 && arg0 <= local37) {
							if (this.anInt306 >= 1) {
								this.aStringArray5[this.anInt278] = "Report abuse @whi@" + local45;
								this.anIntArray36[this.anInt278] = 524;
								this.anInt278++;
							}
							this.aStringArray5[this.anInt278] = "Add ignore @whi@" + local45;
							this.anIntArray36[this.anInt278] = 47;
							this.anInt278++;
							this.aStringArray5[this.anInt278] = "Add friend @whi@" + local45;
							this.anIntArray36[this.anInt278] = 605;
							this.anInt278++;
						}
						local12++;
					}
					if (local26 == 4 && (this.anInt355 == 0 || this.anInt355 == 1 && this.method113(local45))) {
						if (arg0 > local37 - 14 && arg0 <= local37) {
							this.aStringArray5[this.anInt278] = "Accept trade @whi@" + local45;
							this.anIntArray36[this.anInt278] = 507;
							this.anInt278++;
						}
						local12++;
					}
					if ((local26 == 5 || local26 == 6) && this.anInt234 == 0 && this.anInt294 < 2) {
						local12++;
					}
					if (local26 == 8 && (this.anInt355 == 0 || this.anInt355 == 1 && this.method113(local45))) {
						if (arg0 > local37 - 14 && arg0 <= local37) {
							this.aStringArray5[this.anInt278] = "Accept challenge @whi@" + local45;
							this.anIntArray36[this.anInt278] = 957;
							this.anInt278++;
						}
						local12++;
					}
				}
			}
		} catch (@Pc(410) RuntimeException local410) {
			signlink.reporterror("36729, " + arg0 + ", " + 0 + ", " + arg1 + ", " + local410.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "q", descriptor = "(I)V")
	private void method162(@OriginalArg(0) int arg0) {
		try {
			this.aBoolean87 = false;
			while (this.aBoolean53) {
				this.aBoolean87 = false;
				try {
					Thread.sleep(50L);
				} catch (@Pc(11) Exception local11) {
				}
			}
			this.aClass1_Sub1_Sub2_Sub3_11 = null;
			this.aClass1_Sub1_Sub2_Sub3_12 = null;
			this.aClass1_Sub1_Sub2_Sub3Array2 = null;
			this.anIntArray79 = null;
			if (arg0 < 0 || arg0 > 0) {
				anInt268 = 403;
			}
			this.anIntArray80 = null;
			this.anIntArray81 = null;
			this.anIntArray82 = null;
			this.anIntArray45 = null;
			this.anIntArray46 = null;
			this.anIntArray64 = null;
			this.anIntArray65 = null;
			this.aClass1_Sub1_Sub2_Sub2_3 = null;
			this.aClass1_Sub1_Sub2_Sub2_4 = null;
		} catch (@Pc(62) RuntimeException local62) {
			signlink.reporterror("92136, " + arg0 + ", " + local62.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(BLclient!d;)Z")
	private boolean method163(@OriginalArg(1) Class6 arg0) {
		try {
			if (arg0.anIntArray96 == null) {
				return false;
			}
			for (@Pc(6) int local6 = 0; local6 < arg0.anIntArray96.length; local6++) {
				@Pc(14) int local14 = this.method203(arg0, local6);
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
			if (this.aByte11 != 67) {
				this.method89();
			}
			return true;
		} catch (@Pc(72) RuntimeException local72) {
			signlink.reporterror("53108, " + 67 + ", " + arg0 + ", " + local72.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(I)V")
	@Override
	protected void method93(@OriginalArg(0) int arg0) {
		try {
			this.aBoolean60 = true;
			@Pc(6) boolean local6 = false;
		} catch (@Pc(8) RuntimeException local8) {
			signlink.reporterror("72717, " + arg0 + ", " + local8.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(IZ)V")
	private void method164(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		try {
			signlink.anInt938 = arg0;
			if (arg1) {
				this.anInt331 = this.aClass1_Sub1_Sub3_3.method480();
			}
		} catch (@Pc(10) RuntimeException local10) {
			signlink.reporterror("34267, " + arg0 + ", " + arg1 + ", " + local10.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "r", descriptor = "(I)V")
	private void method165() {
		try {
			for (@Pc(10) int local10 = 0; local10 < this.anInt347; local10++) {
				if (this.anIntArray44[local10] <= 0) {
					@Pc(19) boolean local19 = false;
					try {
						if (this.anIntArray42[local10] != this.anInt371 || this.anIntArray90[local10] != this.anInt279) {
							@Pc(52) Class1_Sub1_Sub3 local52 = Class5.method79(this.anIntArray90[local10], this.anIntArray42[local10]);
							if (System.currentTimeMillis() + (long) (local52.anInt742 / 22) > this.aLong18 + (long) (this.anInt412 / 22)) {
								this.anInt412 = local52.anInt742;
								this.aLong18 = System.currentTimeMillis();
								if (this.method98(local52.aByteArray9, local52.anInt742, (byte) 7)) {
									this.anInt371 = this.anIntArray42[local10];
									this.anInt279 = this.anIntArray90[local10];
								} else {
									local19 = true;
								}
							}
						} else if (!this.method130()) {
							local19 = true;
						}
					} catch (@Pc(102) Exception local102) {
					}
					if (local19 && this.anIntArray44[local10] != -5) {
						this.anIntArray44[local10] = -5;
					} else {
						this.anInt347--;
						for (@Pc(118) int local118 = local10; local118 < this.anInt347; local118++) {
							this.anIntArray42[local118] = this.anIntArray42[local118 + 1];
							this.anIntArray90[local118] = this.anIntArray90[local118 + 1];
							this.anIntArray44[local118] = this.anIntArray44[local118 + 1];
						}
						local10--;
					}
				} else {
					@Pc(170) int local170 = this.anIntArray44[local10]--;
				}
			}
			if (this.anInt320 > 0) {
				this.anInt320 -= 20;
				if (this.anInt320 < 0) {
					this.anInt320 = 0;
				}
				if (this.anInt320 == 0 && this.aBoolean65 && !aBoolean72) {
					this.anInt370 = this.anInt418;
					this.aBoolean76 = true;
					this.aClass44_Sub1_1.method645(2, this.anInt370);
					return;
				}
			}
		} catch (@Pc(216) RuntimeException local216) {
			signlink.reporterror("39591, " + 3 + ", " + local216.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(I)V")
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
			this.method102();
			if (this.aClass11_1 != null) {
				this.aClass11_1.aBoolean139 = false;
			}
			this.aClass11_1 = null;
			this.aClass44_Sub1_1.method637();
			this.aClass44_Sub1_1 = null;
			this.aClass1_Sub1_Sub3_2 = null;
			this.aClass1_Sub1_Sub3_4 = null;
			this.aClass1_Sub1_Sub3_3 = null;
			this.anIntArray39 = null;
			this.aByteArrayArray1 = null;
			this.aByteArrayArray2 = null;
			this.anIntArray40 = null;
			this.anIntArray41 = null;
			this.anIntArrayArrayArray5 = null;
			this.aByteArrayArrayArray7 = null;
			this.aClass37_1 = null;
			this.aClass19Array1 = null;
			this.anIntArrayArray4 = null;
			this.anIntArrayArray3 = null;
			this.anIntArray57 = null;
			this.anIntArray58 = null;
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
			this.aClass1_Sub1_Sub2_Sub3_15 = null;
			this.aClass1_Sub1_Sub2_Sub3_16 = null;
			this.aClass1_Sub1_Sub2_Sub3_17 = null;
			this.aClass1_Sub1_Sub2_Sub3_18 = null;
			this.aClass1_Sub1_Sub2_Sub3_19 = null;
			this.aClass1_Sub1_Sub2_Sub3_20 = null;
			this.aClass1_Sub1_Sub2_Sub3Array4 = null;
			this.aClass1_Sub1_Sub2_Sub3_6 = null;
			this.aClass1_Sub1_Sub2_Sub3_7 = null;
			this.aClass1_Sub1_Sub2_Sub3_8 = null;
			this.aClass1_Sub1_Sub2_Sub3_9 = null;
			this.aClass1_Sub1_Sub2_Sub3_10 = null;
			this.aClass1_Sub1_Sub2_Sub3_1 = null;
			this.aClass1_Sub1_Sub2_Sub3_2 = null;
			this.aClass1_Sub1_Sub2_Sub3_3 = null;
			this.aClass1_Sub1_Sub2_Sub3_4 = null;
			this.aClass1_Sub1_Sub2_Sub3_5 = null;
			this.aClass1_Sub1_Sub2_Sub2_14 = null;
			this.aClass1_Sub1_Sub2_Sub2Array4 = null;
			this.aClass1_Sub1_Sub2_Sub2Array6 = null;
			this.aClass1_Sub1_Sub2_Sub2Array7 = null;
			this.aClass1_Sub1_Sub2_Sub2_7 = null;
			this.aClass1_Sub1_Sub2_Sub2_8 = null;
			this.aClass1_Sub1_Sub2_Sub2_9 = null;
			this.aClass1_Sub1_Sub2_Sub2_10 = null;
			this.aClass1_Sub1_Sub2_Sub2_11 = null;
			this.aClass1_Sub1_Sub2_Sub3Array3 = null;
			this.aClass1_Sub1_Sub2_Sub2Array3 = null;
			this.anIntArrayArray6 = null;
			this.aClass1_Sub1_Sub1_Sub1_Sub1Array1 = null;
			this.anIntArray87 = null;
			this.anIntArray88 = null;
			this.aClass1_Sub1_Sub3Array1 = null;
			this.anIntArray55 = null;
			this.aClass1_Sub1_Sub1_Sub1_Sub2Array1 = null;
			this.anIntArray93 = null;
			this.aClass29ArrayArrayArray1 = null;
			this.aClass29_1 = null;
			this.aClass29_3 = null;
			this.aClass29_2 = null;
			this.anIntArray34 = null;
			this.anIntArray35 = null;
			this.anIntArray36 = null;
			this.anIntArray37 = null;
			this.aStringArray5 = null;
			this.anIntArray33 = null;
			this.anIntArray51 = null;
			this.anIntArray52 = null;
			this.aClass1_Sub1_Sub2_Sub2Array5 = null;
			this.aClass1_Sub1_Sub2_Sub2_6 = null;
			this.aStringArray1 = null;
			this.aLongArray3 = null;
			this.anIntArray83 = null;
			this.aClass35_19 = null;
			this.aClass35_20 = null;
			this.aClass35_16 = null;
			this.aClass35_17 = null;
			this.aClass35_18 = null;
			this.aClass35_21 = null;
			this.aClass35_22 = null;
			this.aClass35_23 = null;
			this.aClass35_24 = null;
			this.method162(this.anInt413);
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
		} catch (@Pc(379) RuntimeException local379) {
			signlink.reporterror("3963, " + -48204 + ", " + local379.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "s", descriptor = "(I)V")
	private void method166(@OriginalArg(0) int arg0) {
		try {
			if (arg0 < 0 || arg0 > 0) {
				this.method89();
			}
			if (this.anInt240 > 1) {
				this.anInt240--;
			}
			if (this.anInt334 > 0) {
				this.anInt334--;
			}
			for (@Pc(28) int local28 = 0; local28 < 5 && this.method103(); local28++) {
			}
			if (this.aBoolean80) {
				@Pc(47) Object local47 = this.aClass11_1.anObject1;
				@Pc(73) int local73;
				@Pc(75) int local75;
				@Pc(77) int local77;
				@Pc(110) int local110;
				synchronized (this.aClass11_1.anObject1) {
					if (!aBoolean62) {
						this.aClass11_1.anInt539 = 0;
					} else if (super.anInt197 != 0 || this.aClass11_1.anInt539 >= 40) {
						this.aClass1_Sub1_Sub3_2.method469(this.anInt208, 94);
						this.aClass1_Sub1_Sub3_2.method470(0);
						local73 = this.aClass1_Sub1_Sub3_2.anInt742;
						local75 = 0;
						@Pc(93) int local93;
						for (local77 = 0; local77 < this.aClass11_1.anInt539 && local73 - this.aClass1_Sub1_Sub3_2.anInt742 < 240; local77++) {
							local75++;
							local93 = this.aClass11_1.anIntArray163[local77];
							if (local93 < 0) {
								local93 = 0;
							} else if (local93 > 502) {
								local93 = 502;
							}
							local110 = this.aClass11_1.anIntArray162[local77];
							if (local110 < 0) {
								local110 = 0;
							} else if (local110 > 764) {
								local110 = 764;
							}
							@Pc(127) int local127 = local93 * 765 + local110;
							if (this.aClass11_1.anIntArray163[local77] == -1 && this.aClass11_1.anIntArray162[local77] == -1) {
								local110 = -1;
								local93 = -1;
								local127 = 524287;
							}
							if (local110 != this.anInt284 || local93 != this.anInt285) {
								@Pc(172) int local172 = local110 - this.anInt284;
								this.anInt284 = local110;
								@Pc(180) int local180 = local93 - this.anInt285;
								this.anInt285 = local93;
								if (this.anInt209 < 8 && local172 >= -32 && local172 <= 31 && local180 >= -32 && local180 <= 31) {
									local172 += 32;
									local180 += 32;
									this.aClass1_Sub1_Sub3_2.method471((this.anInt209 << 12) + (local172 << 6) + local180);
									this.anInt209 = 0;
								} else if (this.anInt209 < 8) {
									this.aClass1_Sub1_Sub3_2.method473((this.anInt209 << 19) + local127 + 8388608);
									this.anInt209 = 0;
								} else {
									this.aClass1_Sub1_Sub3_2.method474((this.anInt209 << 19) + local127 - 1073741824);
									this.anInt209 = 0;
								}
							} else if (this.anInt209 < 2047) {
								this.anInt209++;
							}
						}
						this.aClass1_Sub1_Sub3_2.method479(this.aClass1_Sub1_Sub3_2.anInt742 - local73);
						if (local75 >= this.aClass11_1.anInt539) {
							this.aClass11_1.anInt539 = 0;
						} else {
							this.aClass11_1.anInt539 -= local75;
							for (local93 = 0; local93 < this.aClass11_1.anInt539; local93++) {
								this.aClass11_1.anIntArray162[local93] = this.aClass11_1.anIntArray162[local93 + local75];
								this.aClass11_1.anIntArray163[local93] = this.aClass11_1.anIntArray163[local93 + local75];
							}
						}
					}
				}
				if (super.anInt197 != 0) {
					@Pc(343) long local343 = (super.aLong13 - this.aLong16) / 50L;
					if (local343 > 4095L) {
						local343 = 4095L;
					}
					this.aLong16 = super.aLong13;
					local73 = super.anInt199;
					if (local73 < 0) {
						local73 = 0;
					} else if (local73 > 502) {
						local73 = 502;
					}
					local75 = super.anInt198;
					if (local75 < 0) {
						local75 = 0;
					} else if (local75 > 764) {
						local75 = 764;
					}
					local77 = local73 * 765 + local75;
					@Pc(389) byte local389 = 0;
					if (super.anInt197 == 2) {
						local389 = 1;
					}
					local110 = (int) local343;
					this.aClass1_Sub1_Sub3_2.method469(this.anInt208, 238);
					this.aClass1_Sub1_Sub3_2.method474((local110 << 20) + (local389 << 19) + local77);
				}
				if (this.anInt411 > 0) {
					this.anInt411--;
				}
				if (super.anIntArray30[1] == 1 || super.anIntArray30[2] == 1 || super.anIntArray30[3] == 1 || super.anIntArray30[4] == 1) {
					this.aBoolean86 = true;
				}
				if (this.aBoolean86 && this.anInt411 <= 0) {
					this.anInt411 = 20;
					this.aBoolean86 = false;
					this.aClass1_Sub1_Sub3_2.method469(this.anInt208, 212);
					this.aClass1_Sub1_Sub3_2.method471(this.anInt315);
					this.aClass1_Sub1_Sub3_2.method471(this.anInt316);
				}
				if (super.aBoolean45 && !this.aBoolean52) {
					this.aBoolean52 = true;
					this.aClass1_Sub1_Sub3_2.method469(this.anInt208, 11);
					this.aClass1_Sub1_Sub3_2.method470(1);
				}
				if (!super.aBoolean45 && this.aBoolean52) {
					this.aBoolean52 = false;
					this.aClass1_Sub1_Sub3_2.method469(this.anInt208, 11);
					this.aClass1_Sub1_Sub3_2.method470(0);
				}
				this.method134();
				this.method229();
				this.method165();
				this.anInt332++;
				if (this.anInt332 > 750) {
					this.method194((byte) 3);
				}
				this.method197();
				this.method147(960);
				this.method122(this.anInt231);
				this.anInt264++;
				if (this.anInt346 != 0) {
					this.anInt345 += 20;
					if (this.anInt345 >= 400) {
						this.anInt346 = 0;
					}
				}
				if (this.anInt395 != 0) {
					this.anInt392++;
					if (this.anInt392 >= 15) {
						if (this.anInt395 == 2) {
							this.aBoolean54 = true;
						}
						if (this.anInt395 == 3) {
							this.aBoolean75 = true;
						}
						this.anInt395 = 0;
					}
				}
				if (this.anInt298 != 0) {
					this.anInt353++;
					if (super.anInt192 > this.anInt299 + 5 || super.anInt192 < this.anInt299 - 5 || super.anInt193 > this.anInt300 + 5 || super.anInt193 < this.anInt300 - 5) {
						this.aBoolean59 = true;
					}
					if (super.anInt191 == 0) {
						if (this.anInt298 == 2) {
							this.aBoolean54 = true;
						}
						if (this.anInt298 == 3) {
							this.aBoolean75 = true;
						}
						this.anInt298 = 0;
						if (this.aBoolean59 && this.anInt353 >= 5) {
							this.anInt382 = -1;
							this.method172();
							if (this.anInt382 == this.anInt296 && this.anInt381 != this.anInt297) {
								@Pc(694) Class6 local694 = Class6.aClass6Array1[this.anInt296];
								@Pc(696) byte local696 = 0;
								if (this.anInt383 == 1 && local694.anInt433 == 206) {
									local696 = 1;
								}
								if (local694.anIntArray94[this.anInt381] <= 0) {
									local696 = 0;
								}
								if (local694.aBoolean98) {
									local73 = this.anInt297;
									local75 = this.anInt381;
									local694.anIntArray94[local75] = local694.anIntArray94[local73];
									local694.anIntArray95[local75] = local694.anIntArray95[local73];
									local694.anIntArray94[local73] = -1;
									local694.anIntArray95[local73] = 0;
								} else if (local696 == 1) {
									local73 = this.anInt297;
									local75 = this.anInt381;
									while (local73 != local75) {
										if (local73 > local75) {
											local694.method232(local73 - 1, local73);
											local73--;
										} else if (local73 < local75) {
											local694.method232(local73 + 1, local73);
											local73++;
										}
									}
								} else {
									local694.method232(this.anInt381, this.anInt297);
								}
								this.aClass1_Sub1_Sub3_2.method469(this.anInt208, 126);
								this.aClass1_Sub1_Sub3_2.method471(this.anInt296);
								this.aClass1_Sub1_Sub3_2.method471(this.anInt297);
								this.aClass1_Sub1_Sub3_2.method471(this.anInt381);
								this.aClass1_Sub1_Sub3_2.method470(local696);
							}
						} else if ((this.anInt305 == 1 || this.method210(this.anInt324, this.anInt278 - 1)) && this.anInt278 > 2) {
							this.method158();
						} else if (this.anInt278 > 0) {
							this.method110(this.anInt278 - 1);
						}
						this.anInt392 = 10;
						super.anInt197 = 0;
					}
				}
				anInt275++;
				if (anInt275 > 62) {
					anInt275 = 0;
					this.aClass1_Sub1_Sub3_2.method469(this.anInt208, 87);
				}
				@Pc(883) int local883;
				@Pc(885) int local885;
				if (Class37.anInt870 != -1) {
					local883 = Class37.anInt870;
					local885 = Class37.anInt871;
					@Pc(906) boolean local906 = this.method178(aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray273[0], 0, 0, 0, true, 0, aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray272[0], local883, 0, local885, 0);
					Class37.anInt870 = -1;
					if (local906) {
						this.anInt343 = super.anInt198;
						this.anInt344 = super.anInt199;
						this.anInt346 = 1;
						this.anInt345 = 0;
					}
				}
				if (super.anInt197 == 1 && this.aString6 != null) {
					this.aString6 = null;
					this.aBoolean75 = true;
					super.anInt197 = 0;
				}
				this.method201();
				this.method215();
				this.method129();
				this.method167(this.aBoolean84);
				if (super.anInt191 == 1 || super.anInt197 == 1) {
					this.anInt378++;
				}
				if (this.anInt232 == 2) {
					this.method127();
				}
				if (this.anInt232 == 2 && this.aBoolean89) {
					this.method211();
				}
				for (local883 = 0; local883 < 5; local883++) {
					@Pc(993) int local993 = this.anIntArray62[local883]++;
				}
				this.method108();
				super.anInt190++;
				if (super.anInt190 > 4500) {
					this.anInt334 = 250;
					super.anInt190 -= 500;
					this.aClass1_Sub1_Sub3_2.method469(this.anInt208, 194);
				}
				this.anInt328++;
				if (this.anInt328 > 500) {
					this.anInt328 = 0;
					local885 = (int) (Math.random() * 8.0D);
					if ((local885 & 0x1) == 1) {
						this.anInt227 += this.anInt228;
					}
					if ((local885 & 0x2) == 2) {
						this.anInt335 += this.anInt336;
					}
					if ((local885 & 0x4) == 4) {
						this.anInt321 += this.anInt322;
					}
				}
				if (this.anInt227 < -50) {
					this.anInt228 = 2;
				}
				if (this.anInt227 > 50) {
					this.anInt228 = -2;
				}
				if (this.anInt335 < -55) {
					this.anInt336 = 2;
				}
				if (this.anInt335 > 55) {
					this.anInt336 = -2;
				}
				if (this.anInt321 < -40) {
					this.anInt322 = 1;
				}
				if (this.anInt321 > 40) {
					this.anInt322 = -1;
				}
				this.anInt270++;
				if (this.anInt270 > 500) {
					this.anInt270 = 0;
					local885 = (int) (Math.random() * 8.0D);
					if ((local885 & 0x1) == 1) {
						this.anInt384 += this.anInt385;
					}
					if ((local885 & 0x2) == 2) {
						this.anInt220 += this.anInt221;
					}
				}
				if (this.anInt384 < -60) {
					this.anInt385 = 2;
				}
				if (this.anInt384 > 60) {
					this.anInt385 = -2;
				}
				if (this.anInt220 < -20) {
					this.anInt221 = 1;
				}
				if (this.anInt220 > 10) {
					this.anInt221 = -1;
				}
				this.anInt333++;
				if (this.anInt333 > 50) {
					this.aClass1_Sub1_Sub3_2.method469(this.anInt208, 62);
				}
				try {
					if (this.aClass8_1 != null && this.aClass1_Sub1_Sub3_2.anInt742 > 0) {
						this.aClass8_1.method251(this.aClass1_Sub1_Sub3_2.aByteArray9, this.aClass1_Sub1_Sub3_2.anInt742);
						this.aClass1_Sub1_Sub3_2.anInt742 = 0;
						this.anInt333 = 0;
					}
				} catch (@Pc(1237) IOException local1237) {
					this.method194((byte) 3);
				} catch (@Pc(1242) Exception local1242) {
					this.method118();
				}
			}
		} catch (@Pc(1247) RuntimeException local1247) {
			signlink.reporterror("31308, " + arg0 + ", " + local1247.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "i", descriptor = "(Z)V")
	private void method167(@OriginalArg(0) boolean arg0) {
		try {
			this.aBoolean80 &= arg0;
			if (super.anInt197 == 1) {
				if (super.anInt198 >= 6 && super.anInt198 <= 106 && super.anInt199 >= 467 && super.anInt199 <= 499) {
					this.anInt377 = (this.anInt377 + 1) % 4;
					this.aBoolean85 = true;
					this.aBoolean75 = true;
					this.aClass1_Sub1_Sub3_2.method469(this.anInt208, 215);
					this.aClass1_Sub1_Sub3_2.method470(this.anInt377);
					this.aClass1_Sub1_Sub3_2.method470(this.anInt294);
					this.aClass1_Sub1_Sub3_2.method470(this.anInt355);
				}
				if (super.anInt198 >= 135 && super.anInt198 <= 235 && super.anInt199 >= 467 && super.anInt199 <= 499) {
					this.anInt294 = (this.anInt294 + 1) % 3;
					this.aBoolean85 = true;
					this.aBoolean75 = true;
					this.aClass1_Sub1_Sub3_2.method469(this.anInt208, 215);
					this.aClass1_Sub1_Sub3_2.method470(this.anInt377);
					this.aClass1_Sub1_Sub3_2.method470(this.anInt294);
					this.aClass1_Sub1_Sub3_2.method470(this.anInt355);
				}
				if (super.anInt198 >= 273 && super.anInt198 <= 373 && super.anInt199 >= 467 && super.anInt199 <= 499) {
					this.anInt355 = (this.anInt355 + 1) % 3;
					this.aBoolean85 = true;
					this.aBoolean75 = true;
					this.aClass1_Sub1_Sub3_2.method469(this.anInt208, 215);
					this.aClass1_Sub1_Sub3_2.method470(this.anInt377);
					this.aClass1_Sub1_Sub3_2.method470(this.anInt294);
					this.aClass1_Sub1_Sub3_2.method470(this.anInt355);
				}
				if (super.anInt198 >= 412 && super.anInt198 <= 512 && super.anInt199 >= 467 && super.anInt199 <= 499) {
					if (this.anInt205 == -1) {
						this.method204();
						this.aString7 = "";
						this.aBoolean67 = false;
						for (@Pc(193) int local193 = 0; local193 < Class6.aClass6Array1.length; local193++) {
							if (Class6.aClass6Array1[local193] != null && Class6.aClass6Array1[local193].anInt433 == 600) {
								this.anInt414 = this.anInt205 = Class6.aClass6Array1[local193].anInt430;
								return;
							}
						}
						return;
					}
					this.method187(0, "Please close the interface you have open before using 'report abuse'", "");
					return;
				}
			}
		} catch (@Pc(229) RuntimeException local229) {
			signlink.reporterror("36917, " + arg0 + ", " + local229.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!ib;IBI)V")
	private void method168(@OriginalArg(0) Class1_Sub1_Sub2_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte arg2, @OriginalArg(3) int arg3) {
		try {
			@Pc(7) int local7 = this.anInt316 + this.anInt384 & 0x7FF;
			@Pc(15) int local15 = arg1 * arg1 + arg3 * arg3;
			if (local15 <= 6400) {
				@Pc(23) int local23 = Class1_Sub1_Sub1_Sub5.anIntArray151[local7];
				@Pc(27) int local27 = Class1_Sub1_Sub1_Sub5.anIntArray152[local7];
				@Pc(36) int local36 = local23 * 256 / (this.anInt220 + 256);
				@Pc(41) boolean local41 = false;
				@Pc(55) int local55 = local27 * 256 / (this.anInt220 + 256);
				@Pc(65) int local65 = arg3 * local36 + arg1 * local55 >> 16;
				@Pc(75) int local75 = arg3 * local55 - arg1 * local36 >> 16;
				if (local15 > 2500) {
					arg0.method397(this.aClass1_Sub1_Sub2_Sub3_16, 83 - local75 - arg0.anInt657 / 2 - 4, local65 + 94 - arg0.anInt656 / 2 + 4);
				} else {
					arg0.method391(local65 + 94 + 4 - arg0.anInt656 / 2, 83 - local75 - arg0.anInt657 / 2 - 4);
				}
			}
		} catch (@Pc(129) RuntimeException local129) {
			signlink.reporterror("24366, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local129.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "k", descriptor = "(B)V")
	private void method169() {
		try {
			this.aClass35_13.method524((byte) 4);
			@Pc(18) int local18;
			@Pc(20) int local20;
			if (this.anInt287 == 2) {
				@Pc(13) byte[] local13 = this.aClass1_Sub1_Sub2_Sub3_16.aByteArray7;
				@Pc(15) int[] local15 = Class1_Sub1_Sub2.anIntArray213;
				local18 = local13.length;
				for (local20 = 0; local20 < local18; local20++) {
					if (local13[local20] == 0) {
						local15[local20] = 0;
					}
				}
				this.aClass1_Sub1_Sub2_Sub2_14.method395(403, 0, 25, 0, this.anIntArray66, 33, 25, this.anIntArray85, 33, this.anInt316, 256);
				this.aClass35_14.method524((byte) 4);
			} else {
				@Pc(64) int local64 = this.anInt316 + this.anInt384 & 0x7FF;
				@Pc(71) int local71 = aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt981 / 32 + 48;
				local18 = 464 - aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt982 / 32;
				this.aClass1_Sub1_Sub2_Sub2_6.method395(403, 25, local18, 5, this.anIntArray68, 146, local71, this.anIntArray38, 151, local64, this.anInt220 + 256);
				this.aClass1_Sub1_Sub2_Sub2_14.method395(403, 0, 25, 0, this.anIntArray66, 33, 25, this.anIntArray85, 33, this.anInt316, 256);
				for (local20 = 0; local20 < this.anInt267; local20++) {
					local71 = this.anIntArray51[local20] * 4 + 2 - aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt981 / 32;
					local18 = this.anIntArray52[local20] * 4 + 2 - aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt982 / 32;
					this.method168(this.aClass1_Sub1_Sub2_Sub2Array5[local20], local71, (byte) 4, local18);
				}
				@Pc(166) int local166;
				for (@Pc(162) int local162 = 0; local162 < 104; local162++) {
					for (local166 = 0; local166 < 104; local166++) {
						@Pc(178) Class29 local178 = this.aClass29ArrayArrayArray1[this.anInt361][local162][local166];
						if (local178 != null) {
							local71 = local162 * 4 + 2 - aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt981 / 32;
							local18 = local166 * 4 + 2 - aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt982 / 32;
							this.method168(this.aClass1_Sub1_Sub2_Sub2_7, local71, (byte) 4, local18);
						}
					}
				}
				for (local166 = 0; local166 < this.anInt420; local166++) {
					@Pc(240) Class1_Sub1_Sub1_Sub1_Sub2 local240 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[this.anIntArray93[local166]];
					if (local240 != null && local240.method680()) {
						@Pc(249) Class13 local249 = local240.aClass13_2;
						if (local249.anIntArray174 != null) {
							local249 = local249.method327((byte) 8);
						}
						if (local249 != null && local249.aBoolean145) {
							local71 = local240.anInt981 / 32 - aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt981 / 32;
							local18 = local240.anInt982 / 32 - aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt982 / 32;
							this.method168(this.aClass1_Sub1_Sub2_Sub2_8, local71, (byte) 4, local18);
						}
					}
				}
				@Pc(305) Class1_Sub1_Sub1_Sub1_Sub1 local305;
				for (@Pc(295) int local295 = 0; local295 < this.anInt389; local295++) {
					local305 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[this.anIntArray87[local295]];
					if (local305 != null && local305.method680()) {
						local71 = local305.anInt981 / 32 - aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt981 / 32;
						local18 = local305.anInt982 / 32 - aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt982 / 32;
						@Pc(333) boolean local333 = false;
						@Pc(337) long local337 = Class48.method667(local305.aString3);
						for (@Pc(339) int local339 = 0; local339 < this.anInt262; local339++) {
							if (local337 == this.aLongArray3[local339] && this.anIntArray83[local339] != 0) {
								local333 = true;
								break;
							}
						}
						@Pc(364) boolean local364 = false;
						if (aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt141 != 0 && local305.anInt141 != 0 && aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt141 == local305.anInt141) {
							local364 = true;
						}
						if (local333) {
							this.method168(this.aClass1_Sub1_Sub2_Sub2_10, local71, (byte) 4, local18);
						} else if (local364) {
							this.method168(this.aClass1_Sub1_Sub2_Sub2_11, local71, (byte) 4, local18);
						} else {
							this.method168(this.aClass1_Sub1_Sub2_Sub2_9, local71, (byte) 4, local18);
						}
					}
				}
				if (this.anInt222 != 0 && anInt223 % 20 < 10) {
					if (this.anInt222 == 1 && this.anInt424 >= 0 && this.anInt424 < this.aClass1_Sub1_Sub1_Sub1_Sub2Array1.length) {
						@Pc(438) Class1_Sub1_Sub1_Sub1_Sub2 local438 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[this.anInt424];
						if (local438 != null) {
							local71 = local438.anInt981 / 32 - aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt981 / 32;
							local18 = local438.anInt982 / 32 - aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt982 / 32;
							this.method190(local18, this.aClass1_Sub1_Sub2_Sub2_13, local71);
						}
					}
					if (this.anInt222 == 2) {
						local71 = (this.anInt289 - this.anInt244) * 4 + 2 - aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt981 / 32;
						local18 = (this.anInt290 - this.anInt245) * 4 + 2 - aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt982 / 32;
						this.method190(local18, this.aClass1_Sub1_Sub2_Sub2_13, local71);
					}
					if (this.anInt222 == 10 && this.anInt224 >= 0 && this.anInt224 < this.aClass1_Sub1_Sub1_Sub1_Sub1Array1.length) {
						local305 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[this.anInt224];
						if (local305 != null) {
							local71 = local305.anInt981 / 32 - aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt981 / 32;
							local18 = local305.anInt982 / 32 - aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt982 / 32;
							this.method190(local18, this.aClass1_Sub1_Sub2_Sub2_13, local71);
						}
					}
				}
				if (this.anInt281 != 0) {
					local71 = this.anInt281 * 4 + 2 - aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt981 / 32;
					local18 = this.anInt282 * 4 + 2 - aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt982 / 32;
					this.method168(this.aClass1_Sub1_Sub2_Sub2_12, local71, (byte) 4, local18);
				}
				Class1_Sub1_Sub2.method439(97, 3, 16777215, 78, 3);
				this.aClass35_14.method524((byte) 4);
			}
		} catch (@Pc(603) RuntimeException local603) {
			signlink.reporterror("44448, " + 39 + ", " + local603.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;IIII)Lclient!xb;")
	private Class47 method170(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		try {
			@Pc(3) byte[] local3 = null;
			@Pc(5) int local5 = 5;
			try {
				if (this.aClass45Array1[0] != null) {
					local3 = this.aClass45Array1[0].method658(arg2, 913);
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
				return new Class47(true, local3);
			}
			local34 = 0;
			while (local3 == null) {
				@Pc(55) String local55 = "Unknown error";
				this.method96("Requesting " + arg1, arg4);
				@Pc(70) int local70;
				try {
					local70 = 0;
					@Pc(81) DataInputStream local81 = this.method116(arg0 + arg3);
					@Pc(84) byte[] local84 = new byte[6];
					local81.readFully(local84, 0, 6);
					@Pc(95) Class1_Sub1_Sub3 local95 = new Class1_Sub1_Sub3(local84, 58);
					local95.anInt742 = 3;
					@Pc(103) int local103 = local95.method484() + 6;
					@Pc(105) int local105 = 6;
					local3 = new byte[local103];
					for (@Pc(110) int local110 = 0; local110 < 6; local110++) {
						local3[local110] = local84[local110];
					}
					@Pc(128) int local128;
					while (local105 < local103) {
						local128 = local103 - local105;
						if (local128 > 1000) {
							local128 = 1000;
						}
						@Pc(139) int local139 = local81.read(local3, local105, local128);
						if (local139 < 0) {
							(new StringBuffer("Length error: ")).append(local105).append("/").append(local103).toString();
							throw new IOException("EOF");
						}
						local105 += local139;
						@Pc(168) int local168 = local105 * 100 / local103;
						if (local168 != local70) {
							this.method96("Loading " + arg1 + " - " + local168 + "%", arg4);
						}
						local70 = local168;
					}
					local81.close();
					try {
						if (this.aClass45Array1[0] != null) {
							this.aClass45Array1[0].method659(arg2, local3, local3.length);
						}
					} catch (@Pc(213) Exception local213) {
						this.aClass45Array1[0] = null;
					}
					if (local3 != null) {
						this.aCRC32_1.reset();
						this.aCRC32_1.update(local3);
						local128 = (int) this.aCRC32_1.getValue();
						if (local128 != arg3) {
							local3 = null;
							local34++;
							local55 = "Checksum error: " + local128;
						}
					}
				} catch (@Pc(248) IOException local248) {
					if (local55.equals("Unknown error")) {
						local55 = "Connection error";
					}
					local3 = null;
				} catch (@Pc(258) NullPointerException local258) {
					local55 = "Null error";
					local3 = null;
					if (!signlink.reporterror) {
						return null;
					}
				} catch (@Pc(267) ArrayIndexOutOfBoundsException local267) {
					local55 = "Bounds error";
					local3 = null;
					if (!signlink.reporterror) {
						return null;
					}
				} catch (@Pc(276) Exception local276) {
					local55 = "Unexpected error";
					local3 = null;
					if (!signlink.reporterror) {
						return null;
					}
				}
				if (local3 == null) {
					for (local70 = local5; local70 > 0; local70--) {
						if (local34 >= 3) {
							this.method96("Game updated - please reload page", arg4);
							local70 = 10;
						} else {
							this.method96(local55 + " - Retrying in " + local70, arg4);
						}
						try {
							Thread.sleep(1000L);
						} catch (@Pc(320) Exception local320) {
						}
					}
					local5 *= 2;
					if (local5 > 60) {
						local5 = 60;
					}
					this.aBoolean57 = !this.aBoolean57;
				}
			}
			return new Class47(true, local3);
		} catch (@Pc(359) RuntimeException local359) {
			signlink.reporterror("81474, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 1 + ", " + arg3 + ", " + arg4 + ", " + local359.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Lclient!lb;IZ)V")
	private void method171(@OriginalArg(0) Class1_Sub1_Sub3 arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(20) int local20;
			@Pc(29) int local29;
			@Pc(36) int local36;
			@Pc(39) int local39;
			@Pc(43) int local43;
			@Pc(47) int local47;
			@Pc(52) int local52;
			@Pc(57) int local57;
			if (arg1 == 142 || arg1 == 237) {
				local20 = arg0.method480();
				local29 = this.anInt421 + (local20 >> 4 & 0x7);
				local36 = this.anInt422 + (local20 & 0x7);
				local39 = arg0.method480();
				local43 = local39 >> 2;
				local47 = local39 & 0x3;
				local52 = this.anIntArray32[local43];
				if (arg1 == 237) {
					local57 = -1;
				} else {
					local57 = arg0.method482();
				}
				if (local29 >= 0 && local36 >= 0 && local29 < 104 && local36 < 104) {
					this.method125(local52, local29, local57, -1, local47, this.anInt361, local36, local43, 0);
				}
			} else {
				@Pc(147) int local147;
				@Pc(159) int local159;
				@Pc(173) int local173;
				@Pc(185) int local185;
				if (arg1 == 188) {
					local20 = arg0.method480();
					local29 = this.anInt421 + (local20 >> 4 & 0x7);
					local36 = this.anInt422 + (local20 & 0x7);
					local39 = arg0.method480();
					local43 = local39 >> 2;
					local47 = local39 & 0x3;
					local52 = this.anIntArray32[local43];
					local57 = arg0.method482();
					if (local29 >= 0 && local36 >= 0 && local29 < 103 && local36 < 103) {
						local147 = this.anIntArrayArrayArray5[this.anInt361][local29][local36];
						local159 = this.anIntArrayArrayArray5[this.anInt361][local29 + 1][local36];
						local173 = this.anIntArrayArrayArray5[this.anInt361][local29 + 1][local36 + 1];
						local185 = this.anIntArrayArrayArray5[this.anInt361][local29][local36 + 1];
						if (local52 == 0) {
							@Pc(196) Class34 local196 = this.aClass37_1.method552(local36, this.anInt361, local29);
							if (local196 != null) {
								@Pc(205) int local205 = local196.anInt835 >> 14 & 0x7FFF;
								if (local43 == 2) {
									local196.aClass1_Sub1_Sub1_7 = new Class1_Sub1_Sub1_Sub2(local57, local173, -530, local147, false, local47 + 4, local159, 2, local185, local205);
									local196.aClass1_Sub1_Sub1_8 = new Class1_Sub1_Sub1_Sub2(local57, local173, -530, local147, false, local47 + 1 & 0x3, local159, 2, local185, local205);
								} else {
									local196.aClass1_Sub1_Sub1_7 = new Class1_Sub1_Sub1_Sub2(local57, local173, -530, local147, false, local47, local159, local43, local185, local205);
								}
							}
						}
						if (local52 == 1) {
							@Pc(273) Class14 local273 = this.aClass37_1.method553(local29, local36, this.anInt361);
							if (local273 != null) {
								local273.aClass1_Sub1_Sub1_1 = new Class1_Sub1_Sub1_Sub2(local57, local173, -530, local147, false, 0, local159, 4, local185, local273.anInt580 >> 14 & 0x7FFF);
							}
						}
						if (local52 == 2) {
							@Pc(307) Class31 local307 = this.aClass37_1.method554(local29, this.anInt361, local36);
							if (local43 == 11) {
								local43 = 10;
							}
							if (local307 != null) {
								local307.aClass1_Sub1_Sub1_6 = new Class1_Sub1_Sub1_Sub2(local57, local173, -530, local147, false, local47, local159, local43, local185, local307.anInt820 >> 14 & 0x7FFF);
							}
						}
						if (local52 == 3) {
							@Pc(346) Class18 local346 = this.aClass37_1.method555(this.anInt361, local36, local29);
							if (local346 != null) {
								local346.aClass1_Sub1_Sub1_2 = new Class1_Sub1_Sub1_Sub2(local57, local173, -530, local147, false, local47, local159, 22, local185, local346.anInt661 >> 14 & 0x7FFF);
							}
						}
					}
				} else {
					@Pc(411) Class1_Sub1_Sub1_Sub3 local411;
					if (arg1 == 7) {
						local20 = arg0.method480();
						local29 = this.anInt421 + (local20 >> 4 & 0x7);
						local36 = this.anInt422 + (local20 & 0x7);
						local39 = arg0.method482();
						local43 = arg0.method482();
						if (local29 >= 0 && local36 >= 0 && local29 < 104 && local36 < 104) {
							local411 = new Class1_Sub1_Sub1_Sub3();
							local411.anInt179 = local39;
							local411.anInt180 = local43;
							if (this.aClass29ArrayArrayArray1[this.anInt361][local29][local36] == null) {
								this.aClass29ArrayArrayArray1[this.anInt361][local29][local36] = new Class29(0);
							}
							this.aClass29ArrayArrayArray1[this.anInt361][local29][local36].method508(local411);
							this.method184(local29, local36);
						}
					} else if (arg1 == 76) {
						local20 = arg0.method480();
						local29 = this.anInt421 + (local20 >> 4 & 0x7);
						local36 = this.anInt422 + (local20 & 0x7);
						local39 = arg0.method482();
						if (local29 >= 0 && local36 >= 0 && local29 < 104 && local36 < 104) {
							@Pc(501) Class29 local501 = this.aClass29ArrayArrayArray1[this.anInt361][local29][local36];
							if (local501 != null) {
								for (local411 = (Class1_Sub1_Sub1_Sub3) local501.method511(); local411 != null; local411 = (Class1_Sub1_Sub1_Sub3) local501.method513()) {
									if (local411.anInt179 == (local39 & 0x7FFF)) {
										local411.method673();
										break;
									}
								}
								if (local501.method511() == null) {
									this.aClass29ArrayArrayArray1[this.anInt361][local29][local36] = null;
								}
								this.method184(local29, local36);
							}
						}
					} else if (arg1 == 192) {
						local20 = arg0.method480();
						local29 = this.anInt421 + (local20 >> 4 & 0x7);
						local36 = this.anInt422 + (local20 & 0x7);
						local39 = local29 + arg0.method481();
						local43 = local36 + arg0.method481();
						local47 = arg0.method483();
						local52 = arg0.method482();
						local57 = arg0.method480() * 4;
						local147 = arg0.method480() * 4;
						local159 = arg0.method482();
						local173 = arg0.method482();
						local185 = arg0.method480();
						@Pc(604) int local604 = arg0.method480();
						if (local29 >= 0 && local36 >= 0 && local29 < 104 && local36 < 104 && local39 >= 0 && local43 >= 0 && local39 < 104 && local43 < 104 && local52 != 65535) {
							local29 = local29 * 128 + 64;
							local36 = local36 * 128 + 64;
							local39 = local39 * 128 + 64;
							local43 = local43 * 128 + 64;
							@Pc(682) Class1_Sub1_Sub1_Sub4 local682 = new Class1_Sub1_Sub1_Sub4(local173 + anInt223, this.anInt204, local29, local604, this.method181(this.aByte10, this.anInt361, local29, local36) - local57, this.anInt361, local47, local185, local147, local52, local36, local159 + anInt223);
							local682.method241(local43, local159 + anInt223, this.method181(this.aByte10, this.anInt361, local39, local43) - local147, (byte) 6, local39);
							this.aClass29_3.method508(local682);
						}
					} else if (arg1 == 45) {
						local20 = arg0.method480();
						local29 = this.anInt421 + (local20 >> 4 & 0x7);
						local36 = this.anInt422 + (local20 & 0x7);
						local39 = arg0.method482();
						local43 = arg0.method480();
						local47 = arg0.method482();
						if (local29 >= 0 && local36 >= 0 && local29 < 104 && local36 < 104) {
							local29 = local29 * 128 + 64;
							local36 = local36 * 128 + 64;
							@Pc(781) Class1_Sub1_Sub1_Sub6 local781 = new Class1_Sub1_Sub1_Sub6(local29, local39, this.method181(this.aByte10, this.anInt361, local29, local36) - local43, this.anInt361, anInt223, local36, local47, this.anInt374);
							this.aClass29_2.method508(local781);
						}
					} else if (arg1 == 14) {
						local20 = arg0.method480();
						local29 = this.anInt421 + (local20 >> 4 & 0x7);
						local36 = this.anInt422 + (local20 & 0x7);
						local39 = arg0.method482();
						local43 = arg0.method482();
						local47 = arg0.method482();
						if (local29 >= 0 && local36 >= 0 && local29 < 104 && local36 < 104 && local47 != this.anInt423) {
							@Pc(835) Class1_Sub1_Sub1_Sub3 local835 = new Class1_Sub1_Sub1_Sub3();
							local835.anInt179 = local39;
							local835.anInt180 = local43;
							if (this.aClass29ArrayArrayArray1[this.anInt361][local29][local36] == null) {
								this.aClass29ArrayArrayArray1[this.anInt361][local29][local36] = new Class29(0);
							}
							this.aClass29ArrayArrayArray1[this.anInt361][local29][local36].method508(local835);
							this.method184(local29, local36);
						}
					} else {
						if (arg1 == 35) {
							local20 = arg0.method480();
							local29 = this.anInt421 + (local20 >> 4 & 0x7);
							local36 = this.anInt422 + (local20 & 0x7);
							local39 = arg0.method480();
							local43 = local39 >> 2;
							local47 = local39 & 0x3;
							local52 = this.anIntArray32[local43];
							local57 = arg0.method482();
							local147 = arg0.method482();
							local159 = arg0.method482();
							local173 = arg0.method482();
							@Pc(933) byte local933 = arg0.method481();
							@Pc(936) byte local936 = arg0.method481();
							@Pc(939) byte local939 = arg0.method481();
							@Pc(942) byte local942 = arg0.method481();
							@Pc(948) Class1_Sub1_Sub1_Sub1_Sub1 local948;
							if (local173 == this.anInt423) {
								local948 = aClass1_Sub1_Sub1_Sub1_Sub1_1;
							} else {
								local948 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local173];
							}
							if (local948 != null) {
								@Pc(960) Class9 local960 = Class9.method288(local57);
								@Pc(970) int local970 = this.anIntArrayArrayArray5[this.anInt361][local29][local36];
								@Pc(982) int local982 = this.anIntArrayArrayArray5[this.anInt361][local29 + 1][local36];
								@Pc(996) int local996 = this.anIntArrayArrayArray5[this.anInt361][local29 + 1][local36 + 1];
								@Pc(1008) int local1008 = this.anIntArrayArrayArray5[this.anInt361][local29][local36 + 1];
								@Pc(1018) Class1_Sub1_Sub1_Sub5 local1018 = local960.method294(local43, local47, local970, local982, local996, local1008, -1);
								if (local1018 != null) {
									this.method125(local52, local29, -1, local159 + 1, 0, this.anInt361, local36, 0, local147 + 1);
									local948.anInt132 = local147 + anInt223;
									local948.anInt133 = local159 + anInt223;
									local948.aClass1_Sub1_Sub1_Sub5_1 = local1018;
									@Pc(1053) int local1053 = local960.anInt513;
									@Pc(1056) int local1056 = local960.anInt514;
									if (local47 == 1 || local47 == 3) {
										local1053 = local960.anInt514;
										local1056 = local960.anInt513;
									}
									local948.anInt134 = local29 * 128 + local1053 * 64;
									local948.anInt136 = local36 * 128 + local1056 * 64;
									local948.anInt135 = this.method181(this.aByte10, this.anInt361, local948.anInt134, local948.anInt136);
									@Pc(1103) byte local1103;
									if (local933 > local939) {
										local1103 = local933;
										local933 = local939;
										local939 = local1103;
									}
									if (local936 > local942) {
										local1103 = local936;
										local936 = local942;
										local942 = local1103;
									}
									local948.anInt137 = local29 + local933;
									local948.anInt139 = local29 + local939;
									local948.anInt138 = local36 + local936;
									local948.anInt140 = local36 + local942;
								}
							}
						}
						if (arg1 == 197) {
							local20 = arg0.method480();
							local29 = this.anInt421 + (local20 >> 4 & 0x7);
							local36 = this.anInt422 + (local20 & 0x7);
							local39 = arg0.method482();
							local43 = arg0.method482();
							local47 = arg0.method482();
							if (local29 >= 0 && local36 >= 0 && local29 < 104 && local36 < 104) {
								@Pc(1187) Class29 local1187 = this.aClass29ArrayArrayArray1[this.anInt361][local29][local36];
								if (local1187 != null) {
									for (@Pc(1193) Class1_Sub1_Sub1_Sub3 local1193 = (Class1_Sub1_Sub1_Sub3) local1187.method511(); local1193 != null; local1193 = (Class1_Sub1_Sub1_Sub3) local1187.method513()) {
										if (local1193.anInt179 == (local39 & 0x7FFF) && local1193.anInt180 == local43) {
											local1193.anInt180 = local47;
											break;
										}
									}
									this.method184(local29, local36);
								}
							}
						} else if (arg1 == 19) {
							local20 = arg0.method480();
							local29 = this.anInt421 + (local20 >> 4 & 0x7);
							local36 = this.anInt422 + (local20 & 0x7);
							local39 = arg0.method482();
							local43 = arg0.method480();
							local47 = local43 >> 4 & 0xF;
							local52 = local43 & 0x7;
							if (aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray272[0] >= local29 - local47 && aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray272[0] <= local29 + local47 && aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray273[0] >= local36 - local47 && aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray273[0] <= local36 + local47 && this.aBoolean69 && !aBoolean72 && this.anInt347 < 50) {
								this.anIntArray42[this.anInt347] = local39;
								this.anIntArray90[this.anInt347] = local52;
								this.anIntArray44[this.anInt347] = Class5.anIntArray29[local39];
								this.anInt347++;
								return;
							}
						}
					}
				}
			}
		} catch (@Pc(1329) RuntimeException local1329) {
			signlink.reporterror("32458, " + arg0 + ", " + arg1 + ", " + false + ", " + local1329.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "l", descriptor = "(B)V")
	private void method172() {
		try {
			if (this.anInt298 == 0) {
				this.aStringArray5[0] = "Cancel";
				this.anIntArray36[0] = 1106;
				this.anInt278 = 1;
				this.method123((byte) 1);
				this.anInt206 = 0;
				if (super.anInt192 > 4 && super.anInt193 > 4 && super.anInt192 < 516 && super.anInt193 < 338) {
					if (this.anInt205 == -1) {
						this.method226();
					} else {
						this.method177(4, super.anInt192, super.anInt193, 0, Class6.aClass6Array1[this.anInt205], 4);
					}
				}
				if (this.anInt206 != this.anInt354) {
					this.anInt354 = this.anInt206;
				}
				this.anInt206 = 0;
				if (super.anInt192 > 553 && super.anInt193 > 205 && super.anInt192 < 743 && super.anInt193 < 466) {
					if (this.anInt203 != -1) {
						this.method177(553, super.anInt192, super.anInt193, 0, Class6.aClass6Array1[this.anInt203], 205);
					} else if (this.anIntArray86[this.anInt312] != -1) {
						this.method177(553, super.anInt192, super.anInt193, 0, Class6.aClass6Array1[this.anIntArray86[this.anInt312]], 205);
					}
				}
				if (this.anInt206 != this.anInt233) {
					this.aBoolean54 = true;
					this.anInt233 = this.anInt206;
				}
				this.anInt206 = 0;
				if (super.anInt192 > 17 && super.anInt193 > 357 && super.anInt192 < 496 && super.anInt193 < 453) {
					if (this.anInt261 != -1) {
						this.method177(17, super.anInt192, super.anInt193, 0, Class6.aClass6Array1[this.anInt261], 357);
					} else if (super.anInt193 < 434 && super.anInt192 < 426) {
						this.method161(super.anInt193 - 357, super.anInt192 - 17);
					}
				}
				if (this.anInt261 != -1 && this.anInt206 != this.anInt337) {
					this.aBoolean75 = true;
					this.anInt337 = this.anInt206;
				}
				@Pc(229) boolean local229 = false;
				while (!local229) {
					local229 = true;
					for (@Pc(235) int local235 = 0; local235 < this.anInt278 - 1; local235++) {
						if (this.anIntArray36[local235] < 1000 && this.anIntArray36[local235 + 1] > 1000) {
							@Pc(256) String local256 = this.aStringArray5[local235];
							this.aStringArray5[local235] = this.aStringArray5[local235 + 1];
							this.aStringArray5[local235 + 1] = local256;
							@Pc(278) int local278 = this.anIntArray36[local235];
							this.anIntArray36[local235] = this.anIntArray36[local235 + 1];
							this.anIntArray36[local235 + 1] = local278;
							@Pc(300) int local300 = this.anIntArray34[local235];
							this.anIntArray34[local235] = this.anIntArray34[local235 + 1];
							this.anIntArray34[local235 + 1] = local300;
							@Pc(322) int local322 = this.anIntArray35[local235];
							this.anIntArray35[local235] = this.anIntArray35[local235 + 1];
							this.anIntArray35[local235 + 1] = local322;
							@Pc(344) int local344 = this.anIntArray37[local235];
							this.anIntArray37[local235] = this.anIntArray37[local235 + 1];
							this.anIntArray37[local235 + 1] = local344;
							local229 = false;
						}
					}
				}
			}
		} catch (@Pc(374) RuntimeException local374) {
			signlink.reporterror("6194, " + 8 + ", " + local374.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "t", descriptor = "(I)V")
	private void method173() {
		try {
			@Pc(12) int local12;
			for (@Pc(5) int local5 = 10; local5 < 117; local5++) {
				local12 = (int) (Math.random() * 100.0D);
				if (local12 < 50) {
					this.anIntArray64[local5 + 32512] = 255;
				}
			}
			@Pc(41) int local41;
			@Pc(48) int local48;
			@Pc(54) int local54;
			for (local12 = 0; local12 < 100; local12++) {
				local41 = (int) (Math.random() * 124.0D) + 2;
				local48 = (int) (Math.random() * 128.0D) + 128;
				local54 = local41 + (local48 << 7);
				this.anIntArray64[local54] = 192;
			}
			for (local41 = 1; local41 < 255; local41++) {
				for (local48 = 1; local48 < 127; local48++) {
					local54 = local48 + (local41 << 7);
					this.anIntArray65[local54] = (this.anIntArray64[local54 - 1] + this.anIntArray64[local54 + 1] + this.anIntArray64[local54 - 128] + this.anIntArray64[local54 + 128]) / 4;
				}
			}
			this.anInt286 += 128;
			if (this.anInt286 > this.anIntArray45.length) {
				this.anInt286 -= this.anIntArray45.length;
				local48 = (int) (Math.random() * 12.0D);
				this.method140(this.aClass1_Sub1_Sub2_Sub3Array2[local48]);
			}
			@Pc(166) int local166;
			for (local48 = 1; local48 < 255; local48++) {
				for (local54 = 1; local54 < 127; local54++) {
					local166 = local54 + (local48 << 7);
					@Pc(189) int local189 = this.anIntArray65[local166 + 128] - this.anIntArray45[local166 + this.anInt286 & this.anIntArray45.length - 1] / 5;
					if (local189 < 0) {
						local189 = 0;
					}
					this.anIntArray64[local166] = local189;
				}
			}
			for (local54 = 0; local54 < 255; local54++) {
				this.anIntArray70[local54] = this.anIntArray70[local54 + 1];
			}
			this.anIntArray70[255] = (int) (Math.sin((double) anInt223 / 14.0D) * 16.0D + Math.sin((double) anInt223 / 15.0D) * 14.0D + Math.sin((double) anInt223 / 16.0D) * 12.0D);
			if (this.anInt210 > 0) {
				this.anInt210 -= 4;
			}
			if (this.anInt211 > 0) {
				this.anInt211 -= 4;
			}
			if (this.anInt210 == 0 && this.anInt211 == 0) {
				local166 = (int) (Math.random() * 2000.0D);
				if (local166 == 0) {
					this.anInt210 = 1024;
				}
				if (local166 == 1) {
					this.anInt211 = 1024;
					return;
				}
			}
		} catch (@Pc(303) RuntimeException local303) {
			signlink.reporterror("55644, " + 243 + ", " + local303.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIIIIII)V")
	private void method174(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		try {
			this.anInt330 += 0;
			if (arg2 >= 1 && arg3 >= 1 && arg2 <= 102 && arg3 <= 102) {
				if (aBoolean72 && arg1 != this.anInt361) {
					return;
				}
				@Pc(26) int local26 = 0;
				if (arg4 == 0) {
					local26 = this.aClass37_1.method556(arg1, arg2, arg3);
				}
				if (arg4 == 1) {
					local26 = this.aClass37_1.method557(arg1, arg2, arg3);
				}
				if (arg4 == 2) {
					local26 = this.aClass37_1.method558(arg1, arg2, arg3);
				}
				if (arg4 == 3) {
					local26 = this.aClass37_1.method559(arg1, arg2, arg3);
				}
				@Pc(82) int local82;
				if (local26 != 0) {
					local82 = this.aClass37_1.method560(arg1, arg2, arg3, local26);
					@Pc(88) int local88 = local26 >> 14 & 0x7FFF;
					@Pc(92) int local92 = local82 & 0x1F;
					@Pc(96) int local96 = local82 >> 6;
					@Pc(108) Class9 local108;
					if (arg4 == 0) {
						this.aClass37_1.method547(arg3, arg2, arg1, 408);
						local108 = Class9.method288(local88);
						if (local108.aBoolean123) {
							this.aClass19Array1[arg1].method425(local108.aBoolean124, local96, arg3, local92, arg2);
						}
					}
					if (arg4 == 1) {
						this.aClass37_1.method548(arg1, arg3, arg2);
					}
					if (arg4 == 2) {
						this.aClass37_1.method549(this.aBoolean68, arg3, arg2, arg1);
						local108 = Class9.method288(local88);
						if (arg2 + local108.anInt513 > 103 || arg3 + local108.anInt513 > 103 || arg2 + local108.anInt514 > 103 || arg3 + local108.anInt514 > 103) {
							return;
						}
						if (local108.aBoolean123) {
							this.aClass19Array1[arg1].method426(local108.anInt514, local108.aBoolean124, local108.anInt513, local96, arg3, arg2);
						}
					}
					if (arg4 == 3) {
						this.aClass37_1.method550(arg2, 171, arg3, arg1);
						local108 = Class9.method288(local88);
						if (local108.aBoolean123 && local108.aBoolean125) {
							this.aClass19Array1[arg1].method428(arg2, arg3);
						}
					}
				}
				if (arg0 >= 0) {
					local82 = arg1;
					if (arg1 < 3 && (this.aByteArrayArrayArray7[1][arg2][arg3] & 0x2) == 2) {
						local82 = arg1 + 1;
					}
					Class4.method73(this.aClass19Array1[arg1], arg1, arg0, arg6, local82, this.anIntArrayArrayArray5, arg2, arg3, arg5, this.aClass37_1);
					return;
				}
			}
		} catch (@Pc(256) RuntimeException local256) {
			signlink.reporterror("94576, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + 0 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + local256.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "u", descriptor = "(I)V")
	private void method175(@OriginalArg(0) int arg0) {
		try {
			@Pc(5) boolean local5 = false;
			@Pc(15) int local15;
			@Pc(22) int local22;
			if (this.anInt225 == 0) {
				local15 = super.anInt188 / 2 - 80;
				local22 = super.anInt189 / 2 + 20;
				local22 += 20;
				if (super.anInt197 == 1 && super.anInt198 >= local15 - 75 && super.anInt198 <= local15 + 75 && super.anInt199 >= local22 - 20 && super.anInt199 <= local22 + 20) {
					this.anInt225 = 3;
					this.anInt360 = 0;
				}
				local15 = super.anInt188 / 2 + 80;
				if (super.anInt197 == 1 && super.anInt198 >= local15 - 75 && super.anInt198 <= local15 + 75 && super.anInt199 >= local22 - 20 && super.anInt199 <= local22 + 20) {
					this.aString13 = "";
					this.aString14 = "Enter your username & password.";
					this.anInt225 = 2;
					this.anInt360 = 0;
				}
			} else if (this.anInt225 == 2) {
				local15 = super.anInt189 / 2 - 40;
				local15 += 30;
				local15 += 25;
				if (super.anInt197 == 1 && super.anInt199 >= local15 - 15 && super.anInt199 < local15) {
					this.anInt360 = 0;
				}
				local15 += 15;
				if (super.anInt197 == 1 && super.anInt199 >= local15 - 15 && super.anInt199 < local15) {
					this.anInt360 = 1;
				}
				local15 += 15;
				local22 = super.anInt188 / 2 - 80;
				@Pc(168) int local168 = super.anInt189 / 2 + 50;
				@Pc(169) int local169 = local168 + 20;
				if (super.anInt197 == 1 && super.anInt198 >= local22 - 75 && super.anInt198 <= local22 + 75 && super.anInt199 >= local169 - 20 && super.anInt199 <= local169 + 20) {
					this.anInt218 = 0;
					this.method221(this.aString16, this.aString17, false);
					if (this.aBoolean80) {
						return;
					}
				}
				local22 = super.anInt188 / 2 + 80;
				if (super.anInt197 == 1 && super.anInt198 >= local22 - 75 && super.anInt198 <= local22 + 75 && super.anInt199 >= local169 - 20 && super.anInt199 <= local169 + 20) {
					this.anInt225 = 0;
					this.aString16 = "";
					this.aString17 = "";
				}
				while (true) {
					while (true) {
						@Pc(259) int local259 = this.method88();
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
						if (this.anInt360 == 0) {
							if (local259 == 8 && this.aString16.length() > 0) {
								this.aString16 = this.aString16.substring(0, this.aString16.length() - 1);
							}
							if (local259 == 9 || local259 == 10 || local259 == 13) {
								this.anInt360 = 1;
							}
							if (local264) {
								this.aString16 = this.aString16 + (char) local259;
							}
							if (this.aString16.length() > 12) {
								this.aString16 = this.aString16.substring(0, 12);
							}
						} else if (this.anInt360 == 1) {
							if (local259 == 8 && this.aString17.length() > 0) {
								this.aString17 = this.aString17.substring(0, this.aString17.length() - 1);
							}
							if (local259 == 9 || local259 == 10 || local259 == 13) {
								this.anInt360 = 0;
							}
							if (local264) {
								this.aString17 = this.aString17 + (char) local259;
							}
							if (this.aString17.length() > 20) {
								this.aString17 = this.aString17.substring(0, 20);
							}
						}
					}
				}
			} else if (this.anInt225 == 3) {
				local15 = super.anInt188 / 2;
				local22 = super.anInt189 / 2 + 50;
				@Pc(423) int local423 = local22 + 20;
				if (super.anInt197 == 1 && super.anInt198 >= local15 - 75 && super.anInt198 <= local15 + 75 && super.anInt199 >= local423 - 20 && super.anInt199 <= local423 + 20) {
					this.anInt225 = 0;
					return;
				}
			}
		} catch (@Pc(456) RuntimeException local456) {
			signlink.reporterror("42817, " + arg0 + ", " + local456.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IZLclient!lb;)V")
	private void method176(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub1_Sub3 arg1) {
		try {
			for (@Pc(3) int local3 = 0; local3 < this.anInt390; local3++) {
				@Pc(10) int local10 = this.anIntArray88[local3];
				@Pc(15) Class1_Sub1_Sub1_Sub1_Sub2 local15 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local10];
				@Pc(18) int local18 = arg1.method480();
				@Pc(26) int local26;
				@Pc(29) int local29;
				if ((local18 & 0x1) == 1) {
					local26 = arg1.method480();
					local29 = arg1.method480();
					local15.method681(local29, anInt223, local26);
					local15.anInt995 = anInt223 + 300;
					local15.anInt996 = arg1.method480();
					local15.anInt997 = arg1.method480();
				}
				if ((local18 & 0x2) == 2) {
					local26 = arg1.method482();
					if (local26 == 65535) {
						local26 = -1;
					}
					if (local26 == local15.anInt1004) {
						local15.anInt1008 = 0;
					}
					local29 = arg1.method480();
					if (local26 == local15.anInt1004 && local26 != -1) {
						@Pc(83) int local83 = Class27.aClass27Array1[local26].anInt799;
						if (local83 == 1) {
							local15.anInt1005 = 0;
							local15.anInt1006 = 0;
							local15.anInt1007 = local29;
							local15.anInt1008 = 0;
						}
						if (local83 == 2) {
							local15.anInt1008 = 0;
						}
					} else if (local26 == -1 || local15.anInt1004 == -1 || Class27.aClass27Array1[local26].anInt793 >= Class27.aClass27Array1[local15.anInt1004].anInt793) {
						local15.anInt1004 = local26;
						local15.anInt1005 = 0;
						local15.anInt1006 = 0;
						local15.anInt1007 = local29;
						local15.anInt1008 = 0;
						local15.anInt1027 = local15.anInt1025;
					}
				}
				if ((local18 & 0x4) == 4) {
					local15.anInt998 = arg1.method482();
					if (local15.anInt998 == 65535) {
						local15.anInt998 = -1;
					}
				}
				if ((local18 & 0x8) == 8) {
					local15.aString31 = arg1.method487();
					local15.anInt992 = 100;
				}
				if ((local18 & 0x10) == 16) {
					local26 = arg1.method480();
					local29 = arg1.method480();
					local15.method681(local29, anInt223, local26);
					local15.anInt995 = anInt223 + 300;
					local15.anInt996 = arg1.method480();
					local15.anInt997 = arg1.method480();
				}
				if ((local18 & 0x20) == 32) {
					local15.aClass13_2 = Class13.method323(arg1.method482());
					local15.anInt984 = local15.aClass13_2.aByte18;
					local15.anInt1024 = local15.aClass13_2.anInt572;
					local15.anInt987 = local15.aClass13_2.anInt559;
					local15.anInt988 = local15.aClass13_2.anInt560;
					local15.anInt989 = local15.aClass13_2.anInt561;
					local15.anInt990 = local15.aClass13_2.anInt562;
					local15.anInt985 = local15.aClass13_2.anInt558;
				}
				if ((local18 & 0x40) == 64) {
					local15.anInt1009 = arg1.method482();
					local26 = arg1.method485();
					local15.anInt1013 = local26 >> 16;
					local15.anInt1012 = anInt223 + (local26 & 0xFFFF);
					local15.anInt1010 = 0;
					local15.anInt1011 = 0;
					if (local15.anInt1012 > anInt223) {
						local15.anInt1010 = -1;
					}
					if (local15.anInt1009 == 65535) {
						local15.anInt1009 = -1;
					}
				}
				if ((local18 & 0x80) == 128) {
					local15.anInt999 = arg1.method482();
					local15.anInt1000 = arg1.method482();
				}
			}
			this.aBoolean80 &= true;
		} catch (@Pc(315) RuntimeException local315) {
			signlink.reporterror("61222, " + arg0 + ", " + true + ", " + arg1 + ", " + local315.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIIILclient!d;I)V")
	private void method177(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class6 arg4, @OriginalArg(6) int arg5) {
		try {
			if (arg4.anInt431 == 0 && arg4.anIntArray98 != null && !arg4.aBoolean93 && (arg1 >= arg0 && arg2 >= arg5 && arg1 <= arg0 + arg4.anInt434 && arg2 <= arg5 + arg4.anInt435)) {
				@Pc(38) int local38 = arg4.anIntArray98.length;
				for (@Pc(40) int local40 = 0; local40 < local38; local40++) {
					@Pc(49) int local49 = arg4.anIntArray99[local40] + arg0;
					@Pc(58) int local58 = arg4.anIntArray100[local40] + arg5 - arg3;
					@Pc(65) Class6 local65 = Class6.aClass6Array1[arg4.anIntArray98[local40]];
					@Pc(70) int local70 = local49 + local65.anInt436;
					@Pc(75) int local75 = local58 + local65.anInt437;
					if ((local65.anInt438 >= 0 || local65.anInt446 != 0) && arg1 >= local70 && arg2 >= local75 && arg1 < local70 + local65.anInt434 && arg2 < local75 + local65.anInt435) {
						if (local65.anInt438 >= 0) {
							this.anInt206 = local65.anInt438;
						} else {
							this.anInt206 = local65.anInt429;
						}
					}
					if (local65.anInt431 == 0) {
						this.method177(local70, arg1, arg2, local65.anInt440, local65, local75);
						if (local65.anInt439 > local65.anInt435) {
							this.method133(arg1, arg2, true, local65.anInt435, local70 + local65.anInt434, local65.anInt439, local75, local65);
						}
					} else {
						if (local65.anInt432 == 1 && arg1 >= local70 && arg2 >= local75 && arg1 < local70 + local65.anInt434 && arg2 < local75 + local65.anInt435) {
							@Pc(172) boolean local172 = false;
							if (local65.anInt433 != 0) {
								local172 = this.method193(local65, this.aBoolean78);
							}
							if (!local172) {
								this.aStringArray5[this.anInt278] = local65.aString22;
								this.anIntArray36[this.anInt278] = 231;
								this.anIntArray35[this.anInt278] = local65.anInt429;
								this.anInt278++;
							}
						}
						if (local65.anInt432 == 2 && this.anInt406 == 0 && arg1 >= local70 && arg2 >= local75 && arg1 < local70 + local65.anInt434 && arg2 < local75 + local65.anInt435) {
							@Pc(237) String local237 = local65.aString20;
							if (local237.indexOf(" ") != -1) {
								local237 = local237.substring(0, local237.indexOf(" "));
							}
							this.aStringArray5[this.anInt278] = local237 + " @gre@" + local65.aString21;
							this.anIntArray36[this.anInt278] = 274;
							this.anIntArray35[this.anInt278] = local65.anInt429;
							this.anInt278++;
						}
						if (local65.anInt432 == 3 && arg1 >= local70 && arg2 >= local75 && arg1 < local70 + local65.anInt434 && arg2 < local75 + local65.anInt435) {
							this.aStringArray5[this.anInt278] = "Close";
							this.anIntArray36[this.anInt278] = 737;
							this.anIntArray35[this.anInt278] = local65.anInt429;
							this.anInt278++;
						}
						if (local65.anInt432 == 4 && arg1 >= local70 && arg2 >= local75 && arg1 < local70 + local65.anInt434 && arg2 < local75 + local65.anInt435) {
							this.aStringArray5[this.anInt278] = local65.aString22;
							this.anIntArray36[this.anInt278] = 435;
							this.anIntArray35[this.anInt278] = local65.anInt429;
							this.anInt278++;
						}
						if (local65.anInt432 == 5 && arg1 >= local70 && arg2 >= local75 && arg1 < local70 + local65.anInt434 && arg2 < local75 + local65.anInt435) {
							this.aStringArray5[this.anInt278] = local65.aString22;
							this.anIntArray36[this.anInt278] = 225;
							this.anIntArray35[this.anInt278] = local65.anInt429;
							this.anInt278++;
						}
						if (local65.anInt432 == 6 && !this.aBoolean90 && arg1 >= local70 && arg2 >= local75 && arg1 < local70 + local65.anInt434 && arg2 < local75 + local65.anInt435) {
							this.aStringArray5[this.anInt278] = local65.aString22;
							this.anIntArray36[this.anInt278] = 997;
							this.anIntArray35[this.anInt278] = local65.anInt429;
							this.anInt278++;
						}
						if (local65.anInt431 == 2) {
							@Pc(485) int local485 = 0;
							for (@Pc(487) int local487 = 0; local487 < local65.anInt435; local487++) {
								for (@Pc(491) int local491 = 0; local491 < local65.anInt434; local491++) {
									@Pc(502) int local502 = local70 + local491 * (local65.anInt442 + 32);
									@Pc(511) int local511 = local75 + local487 * (local65.anInt443 + 32);
									if (local485 < 20) {
										local502 += local65.anIntArray101[local485];
										local511 += local65.anIntArray102[local485];
									}
									if (arg1 >= local502 && arg2 >= local511 && arg1 < local502 + 32 && arg2 < local511 + 32) {
										this.anInt381 = local485;
										this.anInt382 = local65.anInt429;
										if (local65.anIntArray94[local485] > 0) {
											@Pc(564) Class15 local564 = Class15.method361(local65.anIntArray94[local485] - 1);
											if (this.anInt301 == 1 && local65.aBoolean96) {
												if (local65.anInt429 != this.anInt303 || local485 != this.anInt302) {
													this.aStringArray5[this.anInt278] = "Use " + this.aString8 + " with @lre@" + local564.aString25;
													this.anIntArray36[this.anInt278] = 398;
													this.anIntArray37[this.anInt278] = local564.anInt605;
													this.anIntArray34[this.anInt278] = local485;
													this.anIntArray35[this.anInt278] = local65.anInt429;
													this.anInt278++;
												}
											} else if (this.anInt406 != 1 || !local65.aBoolean96) {
												@Pc(701) int local701;
												if (local65.aBoolean96) {
													for (local701 = 4; local701 >= 3; local701--) {
														if (local564.aStringArray11 != null && local564.aStringArray11[local701] != null) {
															this.aStringArray5[this.anInt278] = local564.aStringArray11[local701] + " @lre@" + local564.aString25;
															if (local701 == 3) {
																this.anIntArray36[this.anInt278] = 681;
															}
															if (local701 == 4) {
																this.anIntArray36[this.anInt278] = 100;
															}
															this.anIntArray37[this.anInt278] = local564.anInt605;
															this.anIntArray34[this.anInt278] = local485;
															this.anIntArray35[this.anInt278] = local65.anInt429;
															this.anInt278++;
														} else if (local701 == 4) {
															this.aStringArray5[this.anInt278] = "Drop @lre@" + local564.aString25;
															this.anIntArray36[this.anInt278] = 100;
															this.anIntArray37[this.anInt278] = local564.anInt605;
															this.anIntArray34[this.anInt278] = local485;
															this.anIntArray35[this.anInt278] = local65.anInt429;
															this.anInt278++;
														}
													}
												}
												if (local65.aBoolean97) {
													this.aStringArray5[this.anInt278] = "Use @lre@" + local564.aString25;
													this.anIntArray36[this.anInt278] = 102;
													this.anIntArray37[this.anInt278] = local564.anInt605;
													this.anIntArray34[this.anInt278] = local485;
													this.anIntArray35[this.anInt278] = local65.anInt429;
													this.anInt278++;
												}
												if (local65.aBoolean96 && local564.aStringArray11 != null) {
													for (local701 = 2; local701 >= 0; local701--) {
														if (local564.aStringArray11[local701] != null) {
															this.aStringArray5[this.anInt278] = local564.aStringArray11[local701] + " @lre@" + local564.aString25;
															if (local701 == 0) {
																this.anIntArray36[this.anInt278] = 694;
															}
															if (local701 == 1) {
																this.anIntArray36[this.anInt278] = 962;
															}
															if (local701 == 2) {
																this.anIntArray36[this.anInt278] = 795;
															}
															this.anIntArray37[this.anInt278] = local564.anInt605;
															this.anIntArray34[this.anInt278] = local485;
															this.anIntArray35[this.anInt278] = local65.anInt429;
															this.anInt278++;
														}
													}
												}
												if (local65.aStringArray7 != null) {
													for (local701 = 4; local701 >= 0; local701--) {
														if (local65.aStringArray7[local701] != null) {
															this.aStringArray5[this.anInt278] = local65.aStringArray7[local701] + " @lre@" + local564.aString25;
															if (local701 == 0) {
																this.anIntArray36[this.anInt278] = 582;
															}
															if (local701 == 1) {
																this.anIntArray36[this.anInt278] = 113;
															}
															if (local701 == 2) {
																this.anIntArray36[this.anInt278] = 555;
															}
															if (local701 == 3) {
																this.anIntArray36[this.anInt278] = 331;
															}
															if (local701 == 4) {
																this.anIntArray36[this.anInt278] = 354;
															}
															this.anIntArray37[this.anInt278] = local564.anInt605;
															this.anIntArray34[this.anInt278] = local485;
															this.anIntArray35[this.anInt278] = local65.anInt429;
															this.anInt278++;
														}
													}
												}
												this.aStringArray5[this.anInt278] = "Examine @lre@" + local564.aString25;
												this.anIntArray36[this.anInt278] = 1328;
												this.anIntArray37[this.anInt278] = local564.anInt605;
												this.anIntArray34[this.anInt278] = local485;
												this.anIntArray35[this.anInt278] = local65.anInt429;
												this.anInt278++;
											} else if ((this.anInt408 & 0x10) == 16) {
												this.aStringArray5[this.anInt278] = this.aString15 + " @lre@" + local564.aString25;
												this.anIntArray36[this.anInt278] = 563;
												this.anIntArray37[this.anInt278] = local564.anInt605;
												this.anIntArray34[this.anInt278] = local485;
												this.anIntArray35[this.anInt278] = local65.anInt429;
												this.anInt278++;
											}
										}
									}
									local485++;
								}
							}
						}
					}
				}
			}
		} catch (@Pc(1131) RuntimeException local1131) {
			signlink.reporterror("42722, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + -47549 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local1131.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIIIZIIIIII)Z")
	private boolean method178(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		try {
			@Pc(11) int local11;
			for (@Pc(7) int local7 = 0; local7 < 104; local7++) {
				for (local11 = 0; local11 < 104; local11++) {
					this.anIntArrayArray4[local7][local11] = 0;
					this.anIntArrayArray3[local7][local11] = 99999999;
				}
			}
			local11 = arg6;
			@Pc(47) int local47 = arg0;
			this.anIntArrayArray4[arg6][arg0] = 99;
			this.anIntArrayArray3[arg6][arg0] = 0;
			@Pc(63) byte local63 = 0;
			@Pc(65) int local65 = 0;
			this.anIntArray57[0] = arg6;
			@Pc(74) int local74 = local63 + 1;
			this.anIntArray58[0] = arg0;
			@Pc(78) boolean local78 = false;
			@Pc(82) int local82 = this.anIntArray57.length;
			@Pc(89) int[][] local89 = this.aClass19Array1[this.anInt361].anIntArrayArray18;
			@Pc(200) int local200;
			while (local65 != local74) {
				local11 = this.anIntArray57[local65];
				local47 = this.anIntArray58[local65];
				local65 = (local65 + 1) % local82;
				if (local11 == arg7 && local47 == arg9) {
					local78 = true;
					break;
				}
				if (arg10 != 0) {
					if ((arg10 < 5 || arg10 == 10) && this.aClass19Array1[this.anInt361].method429(arg1, arg9, arg7, arg10 - 1, local47, local11)) {
						local78 = true;
						break;
					}
					if (arg10 < 10 && this.aClass19Array1[this.anInt361].method430(arg10 - 1, local47, arg9, arg7, local11, arg1)) {
						local78 = true;
						break;
					}
				}
				if (arg3 != 0 && arg8 != 0 && this.aClass19Array1[this.anInt361].method431(arg8, arg7, arg2, arg9, local11, local47, arg3)) {
					local78 = true;
					break;
				}
				local200 = this.anIntArrayArray3[local11][local47] + 1;
				if (local11 > 0 && this.anIntArrayArray4[local11 - 1][local47] == 0 && (local89[local11 - 1][local47] & 0x280108) == 0) {
					this.anIntArray57[local74] = local11 - 1;
					this.anIntArray58[local74] = local47;
					local74 = (local74 + 1) % local82;
					this.anIntArrayArray4[local11 - 1][local47] = 2;
					this.anIntArrayArray3[local11 - 1][local47] = local200;
				}
				if (local11 < 103 && this.anIntArrayArray4[local11 + 1][local47] == 0 && (local89[local11 + 1][local47] & 0x280180) == 0) {
					this.anIntArray57[local74] = local11 + 1;
					this.anIntArray58[local74] = local47;
					local74 = (local74 + 1) % local82;
					this.anIntArrayArray4[local11 + 1][local47] = 8;
					this.anIntArrayArray3[local11 + 1][local47] = local200;
				}
				if (local47 > 0 && this.anIntArrayArray4[local11][local47 - 1] == 0 && (local89[local11][local47 - 1] & 0x280102) == 0) {
					this.anIntArray57[local74] = local11;
					this.anIntArray58[local74] = local47 - 1;
					local74 = (local74 + 1) % local82;
					this.anIntArrayArray4[local11][local47 - 1] = 1;
					this.anIntArrayArray3[local11][local47 - 1] = local200;
				}
				if (local47 < 103 && this.anIntArrayArray4[local11][local47 + 1] == 0 && (local89[local11][local47 + 1] & 0x280120) == 0) {
					this.anIntArray57[local74] = local11;
					this.anIntArray58[local74] = local47 + 1;
					local74 = (local74 + 1) % local82;
					this.anIntArrayArray4[local11][local47 + 1] = 4;
					this.anIntArrayArray3[local11][local47 + 1] = local200;
				}
				if (local11 > 0 && local47 > 0 && this.anIntArrayArray4[local11 - 1][local47 - 1] == 0 && (local89[local11 - 1][local47 - 1] & 0x28010E) == 0 && (local89[local11 - 1][local47] & 0x280108) == 0 && (local89[local11][local47 - 1] & 0x280102) == 0) {
					this.anIntArray57[local74] = local11 - 1;
					this.anIntArray58[local74] = local47 - 1;
					local74 = (local74 + 1) % local82;
					this.anIntArrayArray4[local11 - 1][local47 - 1] = 3;
					this.anIntArrayArray3[local11 - 1][local47 - 1] = local200;
				}
				if (local11 < 103 && local47 > 0 && this.anIntArrayArray4[local11 + 1][local47 - 1] == 0 && (local89[local11 + 1][local47 - 1] & 0x280183) == 0 && (local89[local11 + 1][local47] & 0x280180) == 0 && (local89[local11][local47 - 1] & 0x280102) == 0) {
					this.anIntArray57[local74] = local11 + 1;
					this.anIntArray58[local74] = local47 - 1;
					local74 = (local74 + 1) % local82;
					this.anIntArrayArray4[local11 + 1][local47 - 1] = 9;
					this.anIntArrayArray3[local11 + 1][local47 - 1] = local200;
				}
				if (local11 > 0 && local47 < 103 && this.anIntArrayArray4[local11 - 1][local47 + 1] == 0 && (local89[local11 - 1][local47 + 1] & 0x280138) == 0 && (local89[local11 - 1][local47] & 0x280108) == 0 && (local89[local11][local47 + 1] & 0x280120) == 0) {
					this.anIntArray57[local74] = local11 - 1;
					this.anIntArray58[local74] = local47 + 1;
					local74 = (local74 + 1) % local82;
					this.anIntArrayArray4[local11 - 1][local47 + 1] = 6;
					this.anIntArrayArray3[local11 - 1][local47 + 1] = local200;
				}
				if (local11 < 103 && local47 < 103 && this.anIntArrayArray4[local11 + 1][local47 + 1] == 0 && (local89[local11 + 1][local47 + 1] & 0x2801E0) == 0 && (local89[local11 + 1][local47] & 0x280180) == 0 && (local89[local11][local47 + 1] & 0x280120) == 0) {
					this.anIntArray57[local74] = local11 + 1;
					this.anIntArray58[local74] = local47 + 1;
					local74 = (local74 + 1) % local82;
					this.anIntArrayArray4[local11 + 1][local47 + 1] = 12;
					this.anIntArrayArray3[local11 + 1][local47 + 1] = local200;
				}
			}
			this.anInt376 = 0;
			@Pc(816) int local816;
			@Pc(822) int local822;
			@Pc(828) int local828;
			if (!local78) {
				if (arg4) {
					local200 = 100;
					for (local816 = 1; local816 < 2; local816++) {
						for (local822 = arg7 - local816; local822 <= arg7 + local816; local822++) {
							for (local828 = arg9 - local816; local828 <= arg9 + local816; local828++) {
								if (local822 >= 0 && local828 >= 0 && local822 < 104 && local828 < 104 && this.anIntArrayArray3[local822][local828] < local200) {
									local200 = this.anIntArrayArray3[local822][local828];
									local11 = local822;
									local47 = local828;
									this.anInt376 = 1;
									local78 = true;
								}
							}
						}
						if (local78) {
							break;
						}
					}
				}
				if (!local78) {
					return false;
				}
			}
			@Pc(889) byte local889 = 0;
			this.anIntArray57[0] = local11;
			local65 = local889 + 1;
			this.anIntArray58[0] = local47;
			local200 = local816 = this.anIntArrayArray4[local11][local47];
			while (local11 != arg6 || local47 != arg0) {
				if (local200 != local816) {
					local816 = local200;
					this.anIntArray57[local65] = local11;
					this.anIntArray58[local65++] = local47;
				}
				if ((local200 & 0x2) != 0) {
					local11++;
				} else if ((local200 & 0x8) != 0) {
					local11--;
				}
				if ((local200 & 0x1) != 0) {
					local47++;
				} else if ((local200 & 0x4) != 0) {
					local47--;
				}
				local200 = this.anIntArrayArray4[local11][local47];
			}
			if (local65 > 0) {
				local82 = local65;
				if (local65 > 25) {
					local82 = 25;
				}
				local65--;
				local822 = this.anIntArray57[local65];
				local828 = this.anIntArray58[local65];
				if (arg5 == 0) {
					this.aClass1_Sub1_Sub3_2.method469(this.anInt208, 102);
					this.aClass1_Sub1_Sub3_2.method470(local82 + local82 + 3);
				}
				if (arg5 == 1) {
					this.aClass1_Sub1_Sub3_2.method469(this.anInt208, 170);
					this.aClass1_Sub1_Sub3_2.method470(local82 + local82 + 3 + 14);
				}
				if (arg5 == 2) {
					this.aClass1_Sub1_Sub3_2.method469(this.anInt208, 15);
					this.aClass1_Sub1_Sub3_2.method470(local82 + local82 + 3);
				}
				if (super.anIntArray30[5] == 1) {
					this.aClass1_Sub1_Sub3_2.method470(1);
				} else {
					this.aClass1_Sub1_Sub3_2.method470(0);
				}
				this.aClass1_Sub1_Sub3_2.method471(local822 + this.anInt244);
				this.aClass1_Sub1_Sub3_2.method471(local828 + this.anInt245);
				this.anInt281 = this.anIntArray57[0];
				this.anInt282 = this.anIntArray58[0];
				for (@Pc(1080) int local1080 = 1; local1080 < local82; local1080++) {
					local65--;
					this.aClass1_Sub1_Sub3_2.method470(this.anIntArray57[local65] - local822);
					this.aClass1_Sub1_Sub3_2.method470(this.anIntArray58[local65] - local828);
				}
				return true;
			} else if (arg5 == 1) {
				return false;
			} else {
				return true;
			}
		} catch (@Pc(1115) RuntimeException local1115) {
			signlink.reporterror("56441, " + arg0 + ", " + arg1 + ", " + -35517 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + arg10 + ", " + local1115.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Ljava/lang/String;)V")
	private void method179(@OriginalArg(0) String arg0) {
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

	@OriginalMember(owner = "client!client", name = "m", descriptor = "(B)V")
	private void method180() {
		try {
			@Pc(2) int local2 = this.anInt308;
			@Pc(5) int local5 = this.anInt309;
			@Pc(8) int local8 = this.anInt310;
			@Pc(11) int local11 = this.anInt311;
			Class1_Sub1_Sub2.method439(local2, local8, 6116423, local5, local11);
			Class1_Sub1_Sub2.method439(local2 + 1, local8 - 2, 0, local5 + 1, 16);
			Class1_Sub1_Sub2.method440(local8 - 2, local5 + 18, local2 + 1, local11 - 19, 0);
			this.aClass1_Sub1_Sub2_Sub4_3.method451("Choose Option", 6116423, local5 + 14, local2 + 3);
			@Pc(74) int local74 = super.anInt192;
			@Pc(77) int local77 = super.anInt193;
			if (this.anInt307 == 0) {
				local74 -= 4;
				local77 -= 4;
			}
			if (this.anInt307 == 1) {
				local74 -= 553;
				local77 -= 205;
			}
			if (this.anInt307 == 2) {
				local74 -= 17;
				local77 -= 357;
			}
			for (@Pc(96) int local96 = 0; local96 < this.anInt278; local96++) {
				@Pc(111) int local111 = local5 + (this.anInt278 - 1 - local96) * 15 + 31;
				@Pc(113) int local113 = 16777215;
				if (local74 > local2 && local74 < local2 + local8 && local77 > local111 - 13 && local77 < local111 + 3) {
					local113 = 16776960;
				}
				this.aClass1_Sub1_Sub2_Sub4_3.method455(local2 + 3, local113, this.aStringArray5[local96], true, local111);
			}
		} catch (@Pc(154) RuntimeException local154) {
			signlink.reporterror("71567, " + 110 + ", " + local154.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(BIII)I")
	private int method181(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		try {
			@Pc(3) int local3 = arg2 >> 7;
			@Pc(7) int local7 = arg3 >> 7;
			if (local3 < 0 || local7 < 0 || local3 > 103 || local7 > 103) {
				return 0;
			}
			@Pc(21) int local21 = arg1;
			if (arg1 < 3 && (this.aByteArrayArrayArray7[1][local3][local7] & 0x2) == 2) {
				local21 = arg1 + 1;
			}
			@Pc(41) int local41 = arg2 & 0x7F;
			@Pc(45) int local45 = arg3 & 0x7F;
			if (arg0 != -93) {
				this.aClass29ArrayArrayArray1 = null;
			}
			@Pc(79) int local79 = this.anIntArrayArrayArray5[local21][local3][local7] * (128 - local41) + this.anIntArrayArrayArray5[local21][local3 + 1][local7] * local41 >> 7;
			@Pc(111) int local111 = this.anIntArrayArrayArray5[local21][local3][local7 + 1] * (128 - local41) + this.anIntArrayArrayArray5[local21][local3 + 1][local7 + 1] * local41 >> 7;
			return local79 * (128 - local45) + local111 * local45 >> 7;
		} catch (@Pc(124) RuntimeException local124) {
			signlink.reporterror("7046, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local124.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(IZ)V")
	private void method182(@OriginalArg(0) int arg0) {
		try {
			@Pc(5) int[] local5 = this.aClass1_Sub1_Sub2_Sub2_6.anIntArray208;
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
			this.aClass1_Sub1_Sub2_Sub2_6.method386();
			@Pc(156) int local156;
			for (@Pc(152) int local152 = 1; local152 < 103; local152++) {
				for (local156 = 1; local156 < 103; local156++) {
					if ((this.aByteArrayArrayArray7[arg0][local156][local152] & 0x18) == 0) {
						this.method212(local156, local36, local34, local152, arg0);
					}
					if (arg0 < 3 && (this.aByteArrayArrayArray7[arg0 + 1][local156][local152] & 0x8) != 0) {
						this.method212(local156, local36, local34, local152, arg0 + 1);
					}
				}
			}
			this.aClass35_14.method524((byte) 4);
			this.anInt267 = 0;
			for (local156 = 0; local156 < 104; local156++) {
				for (@Pc(224) int local224 = 0; local224 < 104; local224++) {
					@Pc(234) int local234 = this.aClass37_1.method559(this.anInt361, local156, local224);
					if (local234 != 0) {
						local234 = local234 >> 14 & 0x7FFF;
						@Pc(246) int local246 = Class9.method288(local234).anInt517;
						if (local246 >= 0) {
							@Pc(250) int local250 = local156;
							@Pc(252) int local252 = local224;
							if (local246 != 22 && local246 != 29 && local246 != 34 && local246 != 36 && local246 != 46 && local246 != 47 && local246 != 48) {
								@Pc(284) int[][] local284 = this.aClass19Array1[this.anInt361].anIntArrayArray18;
								for (@Pc(286) int local286 = 0; local286 < 10; local286++) {
									@Pc(293) int local293 = (int) (Math.random() * 4.0D);
									if (local293 == 0 && local250 > 0 && local250 > local156 - 3 && (local284[local250 - 1][local252] & 0x280108) == 0) {
										local250--;
									}
									if (local293 == 1 && local250 < 103 && local250 < local156 + 3 && (local284[local250 + 1][local252] & 0x280180) == 0) {
										local250++;
									}
									if (local293 == 2 && local252 > 0 && local252 > local224 - 3 && (local284[local250][local252 - 1] & 0x280102) == 0) {
										local252--;
									}
									if (local293 == 3 && local252 < 103 && local252 < local224 + 3 && (local284[local250][local252 + 1] & 0x280120) == 0) {
										local252++;
									}
								}
							}
							this.aClass1_Sub1_Sub2_Sub2Array5[this.anInt267] = this.aClass1_Sub1_Sub2_Sub2Array3[local246];
							this.anIntArray51[this.anInt267] = local250;
							this.anIntArray52[this.anInt267] = local252;
							this.anInt267++;
						}
					}
				}
			}
			anInt283++;
			if (anInt283 > 112) {
				anInt283 = 0;
				this.aClass1_Sub1_Sub3_2.method469(this.anInt208, 65);
				this.aClass1_Sub1_Sub3_2.method470(50);
			}
		} catch (@Pc(442) RuntimeException local442) {
			signlink.reporterror("34039, " + arg0 + ", " + false + ", " + local442.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(BLclient!d;)V")
	private void method183(@OriginalArg(1) Class6 arg0) {
		try {
			if (this.aByte12 != 6) {
				this.anInt331 = this.aClass1_Sub1_Sub3_3.method480();
			}
			@Pc(13) int local13 = arg0.anInt433;
			@Pc(69) int local69;
			if (local13 >= 1 && local13 <= 100 || local13 >= 701 && local13 <= 800) {
				if (local13 == 1 && this.anInt263 == 0) {
					arg0.aString18 = "Loading friend list";
					arg0.anInt432 = 0;
				} else if (local13 == 1 && this.anInt263 == 1) {
					arg0.aString18 = "Connecting to friendserver";
					arg0.anInt432 = 0;
				} else if (local13 == 2 && this.anInt263 != 2) {
					arg0.aString18 = "Please wait...";
					arg0.anInt432 = 0;
				} else {
					local69 = this.anInt262;
					if (this.anInt263 != 2) {
						local69 = 0;
					}
					if (local13 > 700) {
						local13 -= 601;
					} else {
						local13--;
					}
					if (local13 >= local69) {
						arg0.aString18 = "";
						arg0.anInt432 = 0;
					} else {
						arg0.aString18 = this.aStringArray1[local13];
						arg0.anInt432 = 1;
					}
				}
			} else if (local13 >= 101 && local13 <= 200 || local13 >= 801 && local13 <= 900) {
				local69 = this.anInt262;
				if (this.anInt263 != 2) {
					local69 = 0;
				}
				if (local13 > 800) {
					local13 -= 701;
				} else {
					local13 -= 101;
				}
				if (local13 >= local69) {
					arg0.aString18 = "";
					arg0.anInt432 = 0;
				} else {
					if (this.anIntArray83[local13] == 0) {
						arg0.aString18 = "@red@Offline";
					} else if (this.anIntArray83[local13] == anInt362) {
						arg0.aString18 = "@gre@World-" + (this.anIntArray83[local13] - 9);
					} else {
						arg0.aString18 = "@yel@World-" + (this.anIntArray83[local13] - 9);
					}
					arg0.anInt432 = 1;
				}
			} else if (local13 == 203) {
				local69 = this.anInt262;
				if (this.anInt263 != 2) {
					local69 = 0;
				}
				arg0.anInt439 = local69 * 15 + 20;
				if (arg0.anInt439 <= arg0.anInt435) {
					arg0.anInt439 = arg0.anInt435 + 1;
				}
			} else if (local13 >= 401 && local13 <= 500) {
				local13 -= 401;
				if (local13 == 0 && this.anInt263 == 0) {
					arg0.aString18 = "Loading ignore list";
					arg0.anInt432 = 0;
				} else if (local13 == 1 && this.anInt263 == 0) {
					arg0.aString18 = "Please wait...";
					arg0.anInt432 = 0;
				} else {
					local69 = this.anInt348;
					if (this.anInt263 == 0) {
						local69 = 0;
					}
					if (local13 >= local69) {
						arg0.aString18 = "";
						arg0.anInt432 = 0;
					} else {
						arg0.aString18 = Class48.method671(Class48.method668(this.aLongArray4[local13]), 789);
						arg0.anInt432 = 1;
					}
				}
			} else if (local13 == 503) {
				arg0.anInt439 = this.anInt348 * 15 + 20;
				if (arg0.anInt439 <= arg0.anInt435) {
					arg0.anInt439 = arg0.anInt435 + 1;
				}
			} else if (local13 == 327) {
				arg0.anInt455 = 150;
				arg0.anInt456 = (int) (Math.sin((double) anInt223 / 40.0D) * 256.0D) & 0x7FF;
				if (this.aBoolean66) {
					for (local69 = 0; local69 < 7; local69++) {
						@Pc(338) int local338 = this.anIntArray61[local69];
						if (local338 >= 0 && !Class23.aClass23Array1[local338].method498()) {
							return;
						}
					}
					this.aBoolean66 = false;
					@Pc(357) Class1_Sub1_Sub1_Sub5[] local357 = new Class1_Sub1_Sub1_Sub5[7];
					@Pc(359) int local359 = 0;
					for (@Pc(361) int local361 = 0; local361 < 7; local361++) {
						@Pc(368) int local368 = this.anIntArray61[local361];
						if (local368 >= 0) {
							local357[local359++] = Class23.aClass23Array1[local368].method499();
						}
					}
					@Pc(390) Class1_Sub1_Sub1_Sub5 local390 = new Class1_Sub1_Sub1_Sub5((byte) 2, local357, local359);
					for (@Pc(392) int local392 = 0; local392 < 5; local392++) {
						if (this.anIntArray69[local392] != 0) {
							local390.method275(anIntArrayArray5[local392][0], anIntArrayArray5[local392][this.anIntArray69[local392]]);
							if (local392 == 1) {
								local390.method275(anIntArray91[0], anIntArray91[this.anIntArray69[local392]]);
							}
						}
					}
					local390.method268();
					local390.method269(Class27.aClass27Array1[aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt985].anIntArray225[0]);
					local390.method278(64, 850, -30, -50, -30, true);
					arg0.anInt448 = 5;
					arg0.anInt449 = 0;
					Class6.method235(local390);
				}
			} else if (local13 == 324) {
				if (this.aClass1_Sub1_Sub2_Sub2_1 == null) {
					this.aClass1_Sub1_Sub2_Sub2_1 = arg0.aClass1_Sub1_Sub2_Sub2_15;
					this.aClass1_Sub1_Sub2_Sub2_2 = arg0.aClass1_Sub1_Sub2_Sub2_16;
				}
				if (this.aBoolean73) {
					arg0.aClass1_Sub1_Sub2_Sub2_15 = this.aClass1_Sub1_Sub2_Sub2_2;
				} else {
					arg0.aClass1_Sub1_Sub2_Sub2_15 = this.aClass1_Sub1_Sub2_Sub2_1;
				}
			} else if (local13 == 325) {
				if (this.aClass1_Sub1_Sub2_Sub2_1 == null) {
					this.aClass1_Sub1_Sub2_Sub2_1 = arg0.aClass1_Sub1_Sub2_Sub2_15;
					this.aClass1_Sub1_Sub2_Sub2_2 = arg0.aClass1_Sub1_Sub2_Sub2_16;
				}
				if (this.aBoolean73) {
					arg0.aClass1_Sub1_Sub2_Sub2_15 = this.aClass1_Sub1_Sub2_Sub2_1;
				} else {
					arg0.aClass1_Sub1_Sub2_Sub2_15 = this.aClass1_Sub1_Sub2_Sub2_2;
				}
			} else if (local13 == 600) {
				arg0.aString18 = this.aString7;
				if (anInt223 % 20 < 10) {
					arg0.aString18 = arg0.aString18 + "|";
				} else {
					arg0.aString18 = arg0.aString18 + " ";
				}
			} else {
				if (local13 == 613) {
					if (this.anInt306 < 1) {
						arg0.aString18 = "";
					} else if (this.aBoolean67) {
						arg0.anInt444 = 16711680;
						arg0.aString18 = "Moderator option: Mute player for 48 hours: <ON>";
					} else {
						arg0.anInt444 = 16777215;
						arg0.aString18 = "Moderator option: Mute player for 48 hours: <OFF>";
					}
				}
				@Pc(598) String local598;
				if (local13 == 650 || local13 == 655) {
					if (this.anInt368 == 0) {
						arg0.aString18 = "";
					} else {
						if (this.anInt404 == 0) {
							local598 = "earlier today";
						} else if (this.anInt404 == 1) {
							local598 = "yesterday";
						} else {
							local598 = this.anInt404 + " days ago";
						}
						arg0.aString18 = "You last logged in " + local598 + " from: " + signlink.dns;
					}
				}
				if (local13 == 651) {
					if (this.anInt352 == 0) {
						arg0.aString18 = "0 unread messages";
						arg0.anInt444 = 16776960;
					}
					if (this.anInt352 == 1) {
						arg0.aString18 = "1 unread message";
						arg0.anInt444 = 65280;
					}
					if (this.anInt352 > 1) {
						arg0.aString18 = this.anInt352 + " unread messages";
						arg0.anInt444 = 65280;
					}
				}
				if (local13 == 652) {
					if (this.anInt280 == 201) {
						if (this.anInt217 == 1) {
							arg0.aString18 = "@yel@This is a non-members world: @whi@Since you are a member we";
						} else {
							arg0.aString18 = "";
						}
					} else if (this.anInt280 == 200) {
						arg0.aString18 = "You have not yet set any password recovery questions.";
					} else {
						if (this.anInt280 == 0) {
							local598 = "Earlier today";
						} else if (this.anInt280 == 1) {
							local598 = "Yesterday";
						} else {
							local598 = this.anInt280 + " days ago";
						}
						arg0.aString18 = local598 + " you changed your recovery questions";
					}
				}
				if (local13 == 653) {
					if (this.anInt280 == 201) {
						if (this.anInt217 == 1) {
							arg0.aString18 = "@whi@recommend you use a members world instead. You may use";
						} else {
							arg0.aString18 = "";
						}
					} else if (this.anInt280 == 200) {
						arg0.aString18 = "We strongly recommend you do so now to secure your account.";
					} else {
						arg0.aString18 = "If you do not remember making this change then cancel it immediately";
					}
				}
				if (local13 == 654) {
					if (this.anInt280 == 201) {
						if (this.anInt217 == 1) {
							arg0.aString18 = "@whi@this world but member benefits are unavailable whilst here.";
						} else {
							arg0.aString18 = "";
						}
					} else if (this.anInt280 == 200) {
						arg0.aString18 = "Do this from the 'account management' area on our front webpage";
					} else {
						arg0.aString18 = "Do this from the 'account management' area on our front webpage";
					}
				}
			}
		} catch (@Pc(806) RuntimeException local806) {
			signlink.reporterror("58348, " + 6 + ", " + arg0 + ", " + local806.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(II)V")
	private void method184(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(9) Class29 local9 = this.aClass29ArrayArrayArray1[this.anInt361][arg0][arg1];
		if (local9 == null) {
			this.aClass37_1.method551(this.anInt361, arg0, arg1);
			return;
		}
		@Pc(21) int local21 = -99999999;
		@Pc(23) Class1_Sub1_Sub1_Sub3 local23 = null;
		@Pc(27) Class1_Sub1_Sub1_Sub3 local27;
		for (local27 = (Class1_Sub1_Sub1_Sub3) local9.method511(); local27 != null; local27 = (Class1_Sub1_Sub1_Sub3) local9.method513()) {
			@Pc(32) Class15 local32 = Class15.method361(local27.anInt179);
			@Pc(35) int local35 = local32.anInt614;
			if (local32.aBoolean158) {
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
		this.aClass37_1.method537(local23, local110, this.method181(this.aByte10, this.anInt361, arg0 * 128 + 64, arg1 * 128 + 64), local65, arg0, arg1, this.anInt361, local67);
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(III)Z")
	private boolean method185(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		try {
			@Pc(3) boolean local3 = false;
			@Pc(7) Class6 local7 = Class6.aClass6Array1[arg1];
			for (@Pc(9) int local9 = 0; local9 < local7.anIntArray98.length && local7.anIntArray98[local9] != -1; local9++) {
				@Pc(24) Class6 local24 = Class6.aClass6Array1[local7.anIntArray98[local9]];
				if (local24.anInt431 == 1) {
					local3 |= this.method185(arg0, local24.anInt429);
				}
				if (local24.anInt431 == 6 && (local24.anInt452 != -1 || local24.anInt453 != -1)) {
					@Pc(54) boolean local54 = this.method163(local24);
					@Pc(59) int local59;
					if (local54) {
						local59 = local24.anInt453;
					} else {
						local59 = local24.anInt452;
					}
					if (local59 != -1) {
						@Pc(71) Class27 local71 = Class27.aClass27Array1[local59];
						local24.anInt428 += arg0;
						while (local24.anInt428 > local71.method506(local24.anInt427)) {
							local24.anInt428 -= local71.method506(local24.anInt427) + 1;
							local24.anInt427++;
							if (local24.anInt427 >= local71.anInt791) {
								local24.anInt427 -= local71.anInt792;
								if (local24.anInt427 < 0 || local24.anInt427 >= local71.anInt791) {
									local24.anInt427 = 0;
								}
							}
							local3 = true;
						}
					}
				}
			}
			return local3;
		} catch (@Pc(146) RuntimeException local146) {
			signlink.reporterror("47247, " + 0 + ", " + arg0 + ", " + arg1 + ", " + local146.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(JZ)V")
	private void method186(@OriginalArg(0) long arg0) {
		try {
			if (arg0 != 0L) {
				if (this.anInt262 >= 100 && this.anInt372 != 1) {
					this.method187(0, "Your friendlist is full. Max of 100 for free users, and 200 for members", "");
				} else if (this.anInt262 >= 200) {
					this.method187(0, "Your friendlist is full. Max of 100 for free users, and 200 for members", "");
				} else {
					@Pc(38) String local38 = Class48.method671(Class48.method668(arg0), 789);
					for (@Pc(47) int local47 = 0; local47 < this.anInt262; local47++) {
						if (this.aLongArray3[local47] == arg0) {
							this.method187(0, local38 + " is already on your friend list", "");
							return;
						}
					}
					for (@Pc(77) int local77 = 0; local77 < this.anInt348; local77++) {
						if (this.aLongArray4[local77] == arg0) {
							this.method187(0, "Please remove " + local38 + " from your ignore list first", "");
							return;
						}
					}
					if (!local38.equals(aClass1_Sub1_Sub1_Sub1_Sub1_1.aString3)) {
						this.aStringArray1[this.anInt262] = local38;
						this.aLongArray3[this.anInt262] = arg0;
						this.anIntArray83[this.anInt262] = 0;
						this.anInt262++;
						this.aBoolean54 = true;
						this.aClass1_Sub1_Sub3_2.method469(this.anInt208, 72);
						this.aClass1_Sub1_Sub3_2.method476(arg0, this.anInt402);
					}
				}
			}
		} catch (@Pc(153) RuntimeException local153) {
			signlink.reporterror("65871, " + arg0 + ", " + true + ", " + local153.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ZILjava/lang/String;Ljava/lang/String;)V")
	private void method187(@OriginalArg(1) int arg0, @OriginalArg(2) String arg1, @OriginalArg(3) String arg2) {
		try {
			if (arg0 == 0 && this.anInt256 != -1) {
				this.aString6 = arg1;
				super.anInt197 = 0;
			}
			if (this.anInt261 == -1) {
				this.aBoolean75 = true;
			}
			for (@Pc(20) int local20 = 99; local20 > 0; local20--) {
				this.anIntArray53[local20] = this.anIntArray53[local20 - 1];
				this.aStringArray3[local20] = this.aStringArray3[local20 - 1];
				this.aStringArray4[local20] = this.aStringArray4[local20 - 1];
			}
			this.anIntArray53[0] = arg0;
			this.aStringArray3[0] = arg2;
			this.aStringArray4[0] = arg1;
		} catch (@Pc(77) RuntimeException local77) {
			signlink.reporterror("93035, " + true + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local77.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "w", descriptor = "(I)V")
	private void method189() {
		try {
			for (@Pc(6) Class1_Sub2 local6 = (Class1_Sub2) this.aClass29_1.method511(); local6 != null; local6 = (Class1_Sub2) this.aClass29_1.method513()) {
				if (local6.anInt789 == -1) {
					local6.anInt788 = 0;
					this.method131(this.anInt356, local6);
				} else {
					local6.method673();
				}
			}
		} catch (@Pc(40) RuntimeException local40) {
			signlink.reporterror("13174, " + 6831 + ", " + local40.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(BILclient!ib;I)V")
	private void method190(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub1_Sub2_Sub2 arg1, @OriginalArg(3) int arg2) {
		try {
			@Pc(7) int local7 = arg2 * arg2 + arg0 * arg0;
			if (local7 > 4225 && local7 < 90000) {
				@Pc(25) int local25 = this.anInt316 + this.anInt384 & 0x7FF;
				@Pc(29) int local29 = Class1_Sub1_Sub1_Sub5.anIntArray151[local25];
				@Pc(33) int local33 = Class1_Sub1_Sub1_Sub5.anIntArray152[local25];
				@Pc(42) int local42 = local29 * 256 / (this.anInt220 + 256);
				@Pc(51) int local51 = local33 * 256 / (this.anInt220 + 256);
				@Pc(61) int local61 = arg0 * local42 + arg2 * local51 >> 16;
				@Pc(71) int local71 = arg0 * local51 - arg2 * local42 >> 16;
				@Pc(77) double local77 = Math.atan2((double) local61, (double) local71);
				@Pc(83) int local83 = (int) (Math.sin(local77) * 63.0D);
				@Pc(89) int local89 = (int) (Math.cos(local77) * 57.0D);
				this.aClass1_Sub1_Sub2_Sub2_5.method396(local83 + 94 + 4 - 10, 83 - local89 - 20, local77);
			} else {
				this.method168(arg1, arg2, (byte) 4, arg0);
			}
		} catch (@Pc(120) RuntimeException local120) {
			signlink.reporterror("79558, " + -85 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local120.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(ZI)Ljava/lang/String;")
	private String method191(@OriginalArg(1) int arg0) {
		try {
			return arg0 < 999999999 ? String.valueOf(arg0) : "*";
		} catch (@Pc(14) RuntimeException local14) {
			signlink.reporterror("29067, " + false + ", " + arg0 + ", " + local14.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(JZ)V")
	private void method192(@OriginalArg(0) long arg0) {
		try {
			if (arg0 != 0L) {
				if (this.anInt348 >= 100) {
					this.method187(0, "Your ignore list is full. Max of 100 hit", "");
				} else {
					@Pc(23) String local23 = Class48.method671(Class48.method668(arg0), 789);
					for (@Pc(25) int local25 = 0; local25 < this.anInt348; local25++) {
						if (this.aLongArray4[local25] == arg0) {
							this.method187(0, local23 + " is already on your ignore list", "");
							return;
						}
					}
					for (@Pc(61) int local61 = 0; local61 < this.anInt262; local61++) {
						if (this.aLongArray3[local61] == arg0) {
							this.method187(0, "Please remove " + local23 + " from your friend list first", "");
							return;
						}
					}
					this.aLongArray4[this.anInt348++] = arg0;
					this.aBoolean54 = true;
					this.aClass1_Sub1_Sub3_2.method469(this.anInt208, 131);
					this.aClass1_Sub1_Sub3_2.method476(arg0, this.anInt402);
				}
			}
		} catch (@Pc(118) RuntimeException local118) {
			signlink.reporterror("97270, " + arg0 + ", " + true + ", " + local118.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!d;Z)Z")
	private boolean method193(@OriginalArg(0) Class6 arg0, @OriginalArg(1) boolean arg1) {
		try {
			this.aBoolean80 &= arg1;
			@Pc(10) int local10 = arg0.anInt433;
			if (local10 >= 1 && local10 <= 200 || !(local10 < 701 || local10 > 900)) {
				if (local10 >= 801) {
					local10 -= 701;
				} else if (local10 >= 701) {
					local10 -= 601;
				} else if (local10 >= 101) {
					local10 -= 101;
				} else {
					local10--;
				}
				this.aStringArray5[this.anInt278] = "Remove @whi@" + this.aStringArray1[local10];
				this.anIntArray36[this.anInt278] = 513;
				this.anInt278++;
				this.aStringArray5[this.anInt278] = "Message @whi@" + this.aStringArray1[local10];
				this.anIntArray36[this.anInt278] = 902;
				this.anInt278++;
				return true;
			} else if (local10 >= 401 && local10 <= 500) {
				this.aStringArray5[this.anInt278] = "Remove @whi@" + arg0.aString18;
				this.anIntArray36[this.anInt278] = 884;
				this.anInt278++;
				return true;
			} else {
				return false;
			}
		} catch (@Pc(133) RuntimeException local133) {
			signlink.reporterror("75344, " + arg0 + ", " + arg1 + ", " + local133.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "n", descriptor = "(B)V")
	private void method194(@OriginalArg(0) byte arg0) {
		try {
			if (this.anInt334 > 0) {
				this.method118();
			} else {
				this.aClass35_14.method524((byte) 4);
				this.aClass1_Sub1_Sub2_Sub4_2.method447("Connection lost", this.anInt241, 144, 0, 257);
				this.aClass1_Sub1_Sub2_Sub4_2.method447("Connection lost", this.anInt241, 143, 16777215, 256);
				this.aClass1_Sub1_Sub2_Sub4_2.method447("Please wait - attempting to reestablish", this.anInt241, 159, 0, 257);
				this.aClass1_Sub1_Sub2_Sub4_2.method447("Please wait - attempting to reestablish", this.anInt241, 158, 16777215, 256);
				this.aClass35_14.method525(super.aGraphics2, 4, 4, (byte) 8);
				this.anInt287 = 0;
				this.anInt281 = 0;
				@Pc(63) Class8 local63 = this.aClass8_1;
				this.aBoolean80 = false;
				@Pc(71) boolean local71 = false;
				this.anInt218 = 0;
				this.method221(this.aString16, this.aString17, true);
				if (!this.aBoolean80) {
					this.method118();
				}
				try {
					local63.method247();
				} catch (@Pc(97) Exception local97) {
				}
			}
		} catch (@Pc(99) RuntimeException local99) {
			signlink.reporterror("64785, " + arg0 + ", " + local99.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IZIILclient!gc;)V")
	private void method195(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class13 arg3) {
		try {
			if (this.anInt278 < 400) {
				if (arg3.anIntArray174 != null) {
					arg3 = arg3.method327((byte) 8);
				}
				if (arg3 != null) {
					@Pc(19) String local19 = arg3.aString24;
					if (arg3.anInt566 != 0) {
						local19 = local19 + method107(aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt129, arg3.anInt566) + " (level-" + arg3.anInt566 + ")";
					}
					if (this.anInt301 == 1) {
						this.aStringArray5[this.anInt278] = "Use " + this.aString8 + " with @yel@" + local19;
						this.anIntArray36[this.anInt278] = 829;
						this.anIntArray37[this.anInt278] = arg0;
						this.anIntArray34[this.anInt278] = arg2;
						this.anIntArray35[this.anInt278] = arg1;
						this.anInt278++;
					} else if (this.anInt406 != 1) {
						@Pc(166) int local166;
						if (arg3.aStringArray9 != null) {
							for (local166 = 4; local166 >= 0; local166--) {
								if (arg3.aStringArray9[local166] != null && !arg3.aStringArray9[local166].equalsIgnoreCase("attack")) {
									this.aStringArray5[this.anInt278] = arg3.aStringArray9[local166] + " @yel@" + local19;
									if (local166 == 0) {
										this.anIntArray36[this.anInt278] = 242;
									}
									if (local166 == 1) {
										this.anIntArray36[this.anInt278] = 209;
									}
									if (local166 == 2) {
										this.anIntArray36[this.anInt278] = 309;
									}
									if (local166 == 3) {
										this.anIntArray36[this.anInt278] = 852;
									}
									if (local166 == 4) {
										this.anIntArray36[this.anInt278] = 793;
									}
									this.anIntArray37[this.anInt278] = arg0;
									this.anIntArray34[this.anInt278] = arg2;
									this.anIntArray35[this.anInt278] = arg1;
									this.anInt278++;
								}
							}
						}
						if (arg3.aStringArray9 != null) {
							for (local166 = 4; local166 >= 0; local166--) {
								if (arg3.aStringArray9[local166] != null && arg3.aStringArray9[local166].equalsIgnoreCase("attack")) {
									@Pc(290) short local290 = 0;
									if (arg3.anInt566 > aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt129) {
										local290 = 2000;
									}
									this.aStringArray5[this.anInt278] = arg3.aStringArray9[local166] + " @yel@" + local19;
									if (local166 == 0) {
										this.anIntArray36[this.anInt278] = local290 + 242;
									}
									if (local166 == 1) {
										this.anIntArray36[this.anInt278] = local290 + 209;
									}
									if (local166 == 2) {
										this.anIntArray36[this.anInt278] = local290 + 309;
									}
									if (local166 == 3) {
										this.anIntArray36[this.anInt278] = local290 + 852;
									}
									if (local166 == 4) {
										this.anIntArray36[this.anInt278] = local290 + 793;
									}
									this.anIntArray37[this.anInt278] = arg0;
									this.anIntArray34[this.anInt278] = arg2;
									this.anIntArray35[this.anInt278] = arg1;
									this.anInt278++;
								}
							}
						}
						this.aStringArray5[this.anInt278] = "Examine @yel@" + local19;
						this.anIntArray36[this.anInt278] = 1714;
						this.anIntArray37[this.anInt278] = arg0;
						this.anIntArray34[this.anInt278] = arg2;
						this.anIntArray35[this.anInt278] = arg1;
						this.anInt278++;
					} else if ((this.anInt408 & 0x2) == 2) {
						this.aStringArray5[this.anInt278] = this.aString15 + " @yel@" + local19;
						this.anIntArray36[this.anInt278] = 240;
						this.anIntArray37[this.anInt278] = arg0;
						this.anIntArray34[this.anInt278] = arg2;
						this.anIntArray35[this.anInt278] = arg1;
						this.anInt278++;
						return;
					}
				}
			}
		} catch (@Pc(440) RuntimeException local440) {
			signlink.reporterror("36040, " + arg0 + ", " + false + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local440.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(BIIIII)V")
	private void method196(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		try {
			this.aClass1_Sub1_Sub2_Sub3_13.method418(arg3, arg0);
			this.aClass1_Sub1_Sub2_Sub3_14.method418(arg3, arg0 + arg4 - 16);
			Class1_Sub1_Sub2.method439(arg3, 16, this.anInt277, arg0 + 16, arg4 - 32);
			@Pc(35) int local35 = (arg4 - 32) * arg4 / arg1;
			if (local35 < 8) {
				local35 = 8;
			}
			@Pc(52) int local52 = (arg4 - local35 - 32) * arg2 / (arg1 - arg4);
			Class1_Sub1_Sub2.method439(arg3, 16, this.anInt226, arg0 + local52 + 16, local35);
			Class1_Sub1_Sub2.method444(arg3, this.anInt269, local35, arg0 + local52 + 16);
			Class1_Sub1_Sub2.method444(arg3 + 1, this.anInt269, local35, arg0 + local52 + 16);
			Class1_Sub1_Sub2.method442(this.anInt269, 16, arg3, arg0 + local52 + 16);
			Class1_Sub1_Sub2.method442(this.anInt269, 16, arg3, arg0 + local52 + 17);
			Class1_Sub1_Sub2.method444(arg3 + 15, this.anInt230, local35, arg0 + local52 + 16);
			Class1_Sub1_Sub2.method444(arg3 + 14, this.anInt230, local35 - 1, arg0 + 17 + local52);
			Class1_Sub1_Sub2.method442(this.anInt230, 16, arg3, arg0 + local52 + local35 + 15);
			Class1_Sub1_Sub2.method442(this.anInt230, 15, arg3 + 1, arg0 + 14 + local52 + local35);
		} catch (@Pc(174) RuntimeException local174) {
			signlink.reporterror("82776, " + 2 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local174.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "j", descriptor = "(Z)V")
	private void method197() {
		try {
			for (@Pc(6) int local6 = -1; local6 < this.anInt389; local6++) {
				@Pc(14) int local14;
				if (local6 == -1) {
					local14 = this.anInt388;
				} else {
					local14 = this.anIntArray87[local6];
				}
				@Pc(26) Class1_Sub1_Sub1_Sub1_Sub1 local26 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local14];
				if (local26 != null) {
					this.method148(1, local26, (byte) 6);
				}
			}
		} catch (@Pc(40) RuntimeException local40) {
			signlink.reporterror("29323, " + true + ", " + local40.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "x", descriptor = "(I)V")
	private void method198() {
		try {
			if (this.anInt234 != 0) {
				@Pc(6) Class1_Sub1_Sub2_Sub4 local6 = this.aClass1_Sub1_Sub2_Sub4_2;
				@Pc(8) int local8 = 0;
				if (this.anInt240 != 0) {
					local8 = 1;
				}
				for (@Pc(15) int local15 = 0; local15 < 100; local15++) {
					if (this.aStringArray4[local15] != null) {
						@Pc(27) int local27 = this.anIntArray53[local15];
						@Pc(32) String local32 = this.aStringArray3[local15];
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
						if ((local27 == 3 || local27 == 7) && (local27 == 7 || this.anInt294 == 0 || this.anInt294 == 1 && this.method113(local32))) {
							local85 = 329 - local8 * 13;
							local6.method451("From", 0, local85, 4);
							local6.method451("From", 65535, local85 - 1, 4);
							@Pc(110) int local110 = local6.method449((byte) 5, "From ") + 4;
							if (local34 == 1) {
								this.aClass1_Sub1_Sub2_Sub3Array1[0].method418(local110, local85 - 12);
								local110 += 14;
							}
							if (local34 == 2) {
								this.aClass1_Sub1_Sub2_Sub3Array1[1].method418(local110, local85 - 12);
								local110 += 14;
							}
							local6.method451(local32 + ": " + this.aStringArray4[local15], 0, local85, local110);
							local6.method451(local32 + ": " + this.aStringArray4[local15], 65535, local85 - 1, local110);
							local8++;
							if (local8 >= 5) {
								return;
							}
						}
						if (local27 == 5 && this.anInt294 < 2) {
							local85 = 329 - local8 * 13;
							local6.method451(this.aStringArray4[local15], 0, local85, 4);
							local6.method451(this.aStringArray4[local15], 65535, local85 - 1, 4);
							local8++;
							if (local8 >= 5) {
								return;
							}
						}
						if (local27 == 6 && this.anInt294 < 2) {
							local85 = 329 - local8 * 13;
							local6.method451("To " + local32 + ": " + this.aStringArray4[local15], 0, local85, 4);
							local6.method451("To " + local32 + ": " + this.aStringArray4[local15], 65535, local85 - 1, 4);
							local8++;
							if (local8 >= 5) {
								return;
							}
						}
					}
				}
			}
		} catch (@Pc(300) RuntimeException local300) {
			signlink.reporterror("47862, " + 9734 + ", " + local300.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "y", descriptor = "(I)V")
	private void method199() {
		try {
			@Pc(4) Graphics local4 = this.method94().getGraphics();
			local4.setColor(Color.black);
			local4.fillRect(0, 0, 765, 503);
			this.method87();
			@Pc(40) byte local40;
			@Pc(46) int local46;
			if (this.aBoolean48) {
				this.aBoolean87 = false;
				local4.setFont(new Font("Helvetica", 1, 16));
				local4.setColor(Color.yellow);
				local40 = 35;
				local4.drawString("Sorry, an error has occured whilst loading RuneScape", 30, 35);
				local46 = local40 + 50;
				local4.setColor(Color.white);
				local4.drawString("To fix this try the following (in order):", 30, 85);
				@Pc(55) int local55 = local46 + 50;
				local4.setColor(Color.white);
				local4.setFont(new Font("Helvetica", 1, 12));
				local4.drawString("1: Try closing ALL open web-browser windows, and reloading", 30, 135);
				@Pc(72) int local72 = local55 + 30;
				local4.drawString("2: Try clearing your web-browsers cache from tools->internet options", 30, 165);
				@Pc(78) int local78 = local72 + 30;
				local4.drawString("3: Try using a different game-world", 30, 195);
				@Pc(84) int local84 = local78 + 30;
				local4.drawString("4: Try rebooting your computer", 30, 225);
				@Pc(90) int local90 = local84 + 30;
				local4.drawString("5: Try selecting a different version of Java from the play-game menu", 30, 255);
			}
			if (this.aBoolean56) {
				this.aBoolean87 = false;
				local4.setFont(new Font("Helvetica", 1, 20));
				local4.setColor(Color.white);
				local4.drawString("Error - unable to load game!", 50, 50);
				local4.drawString("To play RuneScape make sure you play from", 50, 100);
				local4.drawString("http://www.runescape.com", 50, 150);
			}
			if (this.aBoolean63) {
				this.aBoolean87 = false;
				local4.setColor(Color.yellow);
				local40 = 35;
				local4.drawString("Error a copy of RuneScape already appears to be loaded", 30, 35);
				local46 = local40 + 50;
				local4.setColor(Color.white);
				local4.drawString("To fix this try the following (in order):", 30, 85);
				local46 += 50;
				local4.setColor(Color.white);
				local4.setFont(new Font("Helvetica", 1, 12));
				local4.drawString("1: Try closing ALL open web-browser windows, and reloading", 30, 135);
				local46 += 30;
				local4.drawString("2: Try rebooting your computer, and reloading", 30, 165);
				local46 += 30;
			}
		} catch (@Pc(178) RuntimeException local178) {
			signlink.reporterror("2169, " + -21285 + ", " + local178.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(BIII)I")
	private int method200(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		try {
			@Pc(3) int local3 = 256 - arg1;
			return ((arg2 & 0xFF00FF) * local3 + (arg0 & 0xFF00FF) * arg1 & 0xFF00FF00) + ((arg2 & 0xFF00) * local3 + (arg0 & 0xFF00) * arg1 & 0xFF0000) >> 8;
		} catch (@Pc(44) RuntimeException local44) {
			signlink.reporterror("32170, " + 0 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local44.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "k", descriptor = "(Z)V")
	private void method201() {
		try {
			if (this.anInt298 == 0) {
				@Pc(17) int local17 = super.anInt197;
				if (this.anInt406 == 1 && super.anInt198 >= 516 && super.anInt199 >= 160 && super.anInt198 <= 765 && super.anInt199 <= 205) {
					local17 = 0;
				}
				@Pc(48) int local48;
				@Pc(51) int local51;
				@Pc(127) int local127;
				if (this.aBoolean77) {
					if (local17 != 1) {
						local48 = super.anInt192;
						local51 = super.anInt193;
						if (this.anInt307 == 0) {
							local48 -= 4;
							local51 -= 4;
						}
						if (this.anInt307 == 1) {
							local48 -= 553;
							local51 -= 205;
						}
						if (this.anInt307 == 2) {
							local48 -= 17;
							local51 -= 357;
						}
						if (local48 < this.anInt308 - 10 || local48 > this.anInt308 + this.anInt310 + 10 || local51 < this.anInt309 - 10 || local51 > this.anInt309 + this.anInt311 + 10) {
							this.aBoolean77 = false;
							if (this.anInt307 == 1) {
								this.aBoolean54 = true;
							}
							if (this.anInt307 == 2) {
								this.aBoolean75 = true;
							}
						}
					}
					if (local17 == 1) {
						local48 = this.anInt308;
						local51 = this.anInt309;
						local127 = this.anInt310;
						@Pc(130) int local130 = super.anInt198;
						@Pc(133) int local133 = super.anInt199;
						if (this.anInt307 == 0) {
							local130 -= 4;
							local133 -= 4;
						}
						if (this.anInt307 == 1) {
							local130 -= 553;
							local133 -= 205;
						}
						if (this.anInt307 == 2) {
							local130 -= 17;
							local133 -= 357;
						}
						@Pc(152) int local152 = -1;
						for (@Pc(154) int local154 = 0; local154 < this.anInt278; local154++) {
							@Pc(169) int local169 = local51 + (this.anInt278 - 1 - local154) * 15 + 31;
							if (local130 > local48 && local130 < local48 + local127 && local133 > local169 - 13 && local133 < local169 + 3) {
								local152 = local154;
							}
						}
						if (local152 != -1) {
							this.method110(local152);
						}
						this.aBoolean77 = false;
						if (this.anInt307 == 1) {
							this.aBoolean54 = true;
						}
						if (this.anInt307 == 2) {
							this.aBoolean75 = true;
							return;
						}
					}
				} else {
					if (local17 == 1 && this.anInt278 > 0) {
						local48 = this.anIntArray36[this.anInt278 - 1];
						if (local48 == 582 || local48 == 113 || local48 == 555 || local48 == 331 || local48 == 354 || local48 == 694 || local48 == 962 || local48 == 795 || local48 == 681 || local48 == 100 || local48 == 102 || local48 == 1328) {
							local51 = this.anIntArray34[this.anInt278 - 1];
							local127 = this.anIntArray35[this.anInt278 - 1];
							@Pc(289) Class6 local289 = Class6.aClass6Array1[local127];
							if (local289.aBoolean95 || local289.aBoolean98) {
								this.aBoolean59 = false;
								this.anInt353 = 0;
								this.anInt296 = local127;
								this.anInt297 = local51;
								this.anInt298 = 2;
								this.anInt299 = super.anInt198;
								this.anInt300 = super.anInt199;
								if (Class6.aClass6Array1[local127].anInt430 == this.anInt205) {
									this.anInt298 = 1;
								}
								if (Class6.aClass6Array1[local127].anInt430 == this.anInt261) {
									this.anInt298 = 3;
								}
								return;
							}
						}
					}
					if (local17 == 1 && (this.anInt305 == 1 || this.method210(this.anInt324, this.anInt278 - 1)) && this.anInt278 > 2) {
						local17 = 2;
					}
					if (local17 == 1 && this.anInt278 > 0) {
						this.method110(this.anInt278 - 1);
					}
					if (local17 != 2 || this.anInt278 <= 0) {
						return;
					}
					this.method158();
				}
			}
		} catch (@Pc(385) RuntimeException local385) {
			signlink.reporterror("45500, " + true + ", " + local385.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "l", descriptor = "(Z)V")
	private void method202() {
		try {
			this.aBoolean53 = true;
			try {
				@Pc(9) long local9 = System.currentTimeMillis();
				@Pc(11) int local11 = 0;
				@Pc(13) int local13 = 20;
				while (this.aBoolean87) {
					this.anInt342++;
					this.method173();
					this.method173();
					this.method114();
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
			this.aBoolean53 = false;
		} catch (@Pc(74) RuntimeException local74) {
			signlink.reporterror("85796, " + false + ", " + local74.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!d;II)I")
	private int method203(@OriginalArg(0) Class6 arg0, @OriginalArg(1) int arg1) {
		try {
			if (arg0.anIntArrayArray7 == null || arg1 >= arg0.anIntArrayArray7.length) {
				return -2;
			}
			try {
				@Pc(23) int[] local23 = arg0.anIntArrayArray7[arg1];
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
						local36 = this.anIntArray43[local23[local27++]];
					}
					if (local34 == 2) {
						local36 = this.anIntArray84[local23[local27++]];
					}
					if (local34 == 3) {
						local36 = this.anIntArray60[local23[local27++]];
					}
					@Pc(85) Class6 local85;
					@Pc(90) int local90;
					@Pc(103) int local103;
					if (local34 == 4) {
						local85 = Class6.aClass6Array1[local23[local27++]];
						local90 = local23[local27++];
						if (local90 >= 0 && local90 < Class15.anInt603 && (!Class15.method361(local90).aBoolean159 || aBoolean71)) {
							for (local103 = 0; local103 < local85.anIntArray94.length; local103++) {
								if (local85.anIntArray94[local103] == local90 + 1) {
									local36 += local85.anIntArray95[local103];
								}
							}
						}
					}
					if (local34 == 5) {
						local36 = this.anIntArray33[local23[local27++]];
					}
					if (local34 == 6) {
						local36 = anIntArray63[this.anIntArray84[local23[local27++]] - 1];
					}
					if (local34 == 7) {
						local36 = this.anIntArray33[local23[local27++]] * 100 / 46875;
					}
					if (local34 == 8) {
						local36 = aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt129;
					}
					@Pc(178) int local178;
					if (local34 == 9) {
						for (local178 = 0; local178 < Class30.anInt808; local178++) {
							if (Class30.aBooleanArray9[local178]) {
								local36 += this.anIntArray84[local178];
							}
						}
					}
					if (local34 == 10) {
						local85 = Class6.aClass6Array1[local23[local27++]];
						local90 = local23[local27++] + 1;
						if (local90 >= 0 && local90 < Class15.anInt603 && (!Class15.method361(local90).aBoolean159 || aBoolean71)) {
							for (local103 = 0; local103 < local85.anIntArray94.length; local103++) {
								if (local85.anIntArray94[local103] == local90) {
									local36 = 999999999;
									break;
								}
							}
						}
					}
					if (local34 == 11) {
						local36 = this.anInt266;
					}
					if (local34 == 12) {
						local36 = this.anInt229;
					}
					if (local34 == 13) {
						local178 = this.anIntArray33[local23[local27++]];
						local90 = local23[local27++];
						local36 = (local178 & 0x1 << local90) == 0 ? 0 : 1;
					}
					if (local34 == 14) {
						local178 = local23[local27++];
						@Pc(293) Class36 local293 = Class36.aClass36Array1[local178];
						local103 = local293.anInt839;
						@Pc(299) int local299 = local293.anInt840;
						@Pc(302) int local302 = local293.anInt841;
						@Pc(308) int local308 = anIntArray67[local302 - local299];
						local36 = this.anIntArray33[local103] >> local299 & local308;
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
						local36 = (aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt981 >> 7) + this.anInt244;
					}
					if (local34 == 19) {
						local36 = (aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt982 >> 7) + this.anInt245;
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
			} catch (@Pc(401) Exception local401) {
				return -1;
			}
		} catch (@Pc(404) RuntimeException local404) {
			signlink.reporterror("24911, " + arg0 + ", " + arg1 + ", " + 0 + ", " + local404.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "z", descriptor = "(I)V")
	private void method204() {
		try {
			this.aClass1_Sub1_Sub3_2.method469(this.anInt208, 153);
			if (this.anInt203 != -1) {
				this.anInt203 = -1;
				this.aBoolean54 = true;
				this.aBoolean90 = false;
				this.aBoolean79 = true;
			}
			if (this.anInt261 != -1) {
				this.anInt261 = -1;
				this.aBoolean75 = true;
				this.aBoolean90 = false;
			}
			this.anInt205 = -1;
		} catch (@Pc(43) RuntimeException local43) {
			signlink.reporterror("92867, " + 3 + ", " + local43.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILclient!ab;III)V")
	private void method205(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub1_Sub1_Sub1_Sub1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		try {
			if (arg1 != aClass1_Sub1_Sub1_Sub1_Sub1_1 && this.anInt278 < 400) {
				@Pc(35) String local35;
				if (arg1.anInt130 == 0) {
					local35 = arg1.aString3 + method107(aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt129, arg1.anInt129) + " (level-" + arg1.anInt129 + ")";
				} else {
					local35 = arg1.aString3 + " (skill-" + arg1.anInt130 + ")";
				}
				@Pc(165) int local165;
				if (this.anInt301 == 1) {
					this.aStringArray5[this.anInt278] = "Use " + this.aString8 + " with @whi@" + local35;
					this.anIntArray36[this.anInt278] = 275;
					this.anIntArray37[this.anInt278] = arg0;
					this.anIntArray34[this.anInt278] = arg3;
					this.anIntArray35[this.anInt278] = arg2;
					this.anInt278++;
				} else if (this.anInt406 != 1) {
					for (local165 = 4; local165 >= 0; local165--) {
						if (this.aStringArray2[local165] != null) {
							this.aStringArray5[this.anInt278] = this.aStringArray2[local165] + " @whi@" + local35;
							@Pc(192) short local192 = 0;
							if (this.aStringArray2[local165].equalsIgnoreCase("attack")) {
								if (arg1.anInt129 > aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt129) {
									local192 = 2000;
								}
								if (aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt141 != 0 && arg1.anInt141 != 0) {
									if (aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt141 == arg1.anInt141) {
										local192 = 2000;
									} else {
										local192 = 0;
									}
								}
							} else if (this.aBooleanArray3[local165]) {
								local192 = 2000;
							}
							if (local165 == 0) {
								this.anIntArray36[this.anInt278] = local192 + 639;
							}
							if (local165 == 1) {
								this.anIntArray36[this.anInt278] = local192 + 499;
							}
							if (local165 == 2) {
								this.anIntArray36[this.anInt278] = local192 + 27;
							}
							if (local165 == 3) {
								this.anIntArray36[this.anInt278] = local192 + 387;
							}
							if (local165 == 4) {
								this.anIntArray36[this.anInt278] = local192 + 185;
							}
							this.anIntArray37[this.anInt278] = arg0;
							this.anIntArray34[this.anInt278] = arg3;
							this.anIntArray35[this.anInt278] = arg2;
							this.anInt278++;
						}
					}
				} else if ((this.anInt408 & 0x8) == 8) {
					this.aStringArray5[this.anInt278] = this.aString15 + " @whi@" + local35;
					this.anIntArray36[this.anInt278] = 131;
					this.anIntArray37[this.anInt278] = arg0;
					this.anIntArray34[this.anInt278] = arg3;
					this.anIntArray35[this.anInt278] = arg2;
					this.anInt278++;
				}
				for (local165 = 0; local165 < this.anInt278; local165++) {
					if (this.anIntArray36[local165] == 718) {
						this.aStringArray5[local165] = "Walk here @whi@" + local35;
						break;
					}
				}
				this.anInt330 += arg4;
			}
		} catch (@Pc(349) RuntimeException local349) {
			signlink.reporterror("51250, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local349.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(ZI)V")
	private void method206(@OriginalArg(0) boolean arg0) {
		try {
			this.method207();
			this.aClass35_18.method524((byte) 4);
			this.aClass1_Sub1_Sub2_Sub3_11.method418(0, 0);
			@Pc(48) byte local48;
			@Pc(60) int local60;
			if (this.anInt225 == 0) {
				this.aClass1_Sub1_Sub2_Sub4_1.method448(180, 7711145, this.aClass44_Sub1_1.aString30, 180, true);
				local48 = 80;
				this.aClass1_Sub1_Sub2_Sub4_3.method448(180, 16776960, "Welcome to RuneScape", 80, true);
				local60 = local48 + 30;
				this.aClass1_Sub1_Sub2_Sub3_12.method418(27, 100);
				this.aClass1_Sub1_Sub2_Sub4_3.method448(100, 16777215, "New User", 125, true);
				this.aClass1_Sub1_Sub2_Sub3_12.method418(187, 100);
				this.aClass1_Sub1_Sub2_Sub4_3.method448(260, 16777215, "Existing User", 125, true);
			}
			if (this.anInt225 == 2) {
				local48 = 60;
				if (this.aString13.length() > 0) {
					this.aClass1_Sub1_Sub2_Sub4_3.method448(180, 16776960, this.aString13, 45, true);
					this.aClass1_Sub1_Sub2_Sub4_3.method448(180, 16776960, this.aString14, 60, true);
					local60 = local48 + 30;
				} else {
					this.aClass1_Sub1_Sub2_Sub4_3.method448(180, 16776960, this.aString14, 53, true);
					local60 = local48 + 30;
				}
				this.aClass1_Sub1_Sub2_Sub4_3.method455(90, 16777215, "Username: " + this.aString16 + (this.anInt360 == 0 & anInt223 % 40 < 20 ? "@yel@|" : ""), true, 90);
				local60 += 15;
				this.aClass1_Sub1_Sub2_Sub4_3.method455(92, 16777215, "Password: " + Class48.method672(this.aString17) + (this.anInt360 == 1 & anInt223 % 40 < 20 ? "@yel@|" : ""), true, 105);
				local60 += 15;
				if (!arg0) {
					this.aClass1_Sub1_Sub2_Sub3_12.method418(27, 130);
					this.aClass1_Sub1_Sub2_Sub4_3.method448(100, 16777215, "Login", 155, true);
					this.aClass1_Sub1_Sub2_Sub3_12.method418(187, 130);
					this.aClass1_Sub1_Sub2_Sub4_3.method448(260, 16777215, "Cancel", 155, true);
				}
			}
			if (this.anInt225 == 3) {
				this.aClass1_Sub1_Sub2_Sub4_3.method448(180, 16776960, "Create a free account", 40, true);
				local48 = 65;
				this.aClass1_Sub1_Sub2_Sub4_3.method448(180, 16777215, "To create a new account you need to", 65, true);
				local60 = local48 + 15;
				this.aClass1_Sub1_Sub2_Sub4_3.method448(180, 16777215, "go back to the main RuneScape webpage", 80, true);
				local60 += 15;
				this.aClass1_Sub1_Sub2_Sub4_3.method448(180, 16777215, "and choose the red 'create account'", 95, true);
				local60 += 15;
				this.aClass1_Sub1_Sub2_Sub4_3.method448(180, 16777215, "button at the top right of that page.", 110, true);
				local60 += 15;
				this.aClass1_Sub1_Sub2_Sub3_12.method418(107, 130);
				this.aClass1_Sub1_Sub2_Sub4_3.method448(180, 16777215, "Cancel", 155, true);
			}
			this.aClass35_18.method525(super.aGraphics2, 171, 202, (byte) 8);
			if (this.aBoolean60) {
				this.aBoolean60 = false;
				this.aClass35_16.method525(super.aGraphics2, 0, 128, (byte) 8);
				this.aClass35_17.method525(super.aGraphics2, 371, 202, (byte) 8);
				this.aClass35_21.method525(super.aGraphics2, 265, 0, (byte) 8);
				this.aClass35_22.method525(super.aGraphics2, 265, 562, (byte) 8);
				this.aClass35_23.method525(super.aGraphics2, 171, 128, (byte) 8);
				this.aClass35_24.method525(super.aGraphics2, 171, 562, (byte) 8);
			}
		} catch (@Pc(493) RuntimeException local493) {
			signlink.reporterror("94330, " + arg0 + ", " + -810 + ", " + local493.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "o", descriptor = "(B)V")
	private void method207() {
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
				this.aClass35_19 = new Class35(128, 5, 265, this.method94());
				Class1_Sub1_Sub2.method437(this.aBoolean50);
				this.aClass35_20 = new Class35(128, 5, 265, this.method94());
				Class1_Sub1_Sub2.method437(this.aBoolean50);
				this.aClass35_16 = new Class35(509, 5, 171, this.method94());
				Class1_Sub1_Sub2.method437(this.aBoolean50);
				this.aClass35_17 = new Class35(360, 5, 132, this.method94());
				Class1_Sub1_Sub2.method437(this.aBoolean50);
				this.aClass35_18 = new Class35(360, 5, 200, this.method94());
				Class1_Sub1_Sub2.method437(this.aBoolean50);
				this.aClass35_21 = new Class35(202, 5, 238, this.method94());
				Class1_Sub1_Sub2.method437(this.aBoolean50);
				this.aClass35_22 = new Class35(203, 5, 238, this.method94());
				Class1_Sub1_Sub2.method437(this.aBoolean50);
				this.aClass35_23 = new Class35(74, 5, 94, this.method94());
				Class1_Sub1_Sub2.method437(this.aBoolean50);
				this.aClass35_24 = new Class35(75, 5, 94, this.method94());
				Class1_Sub1_Sub2.method437(this.aBoolean50);
				if (this.aClass47_1 != null) {
					this.method138();
					this.method109();
				}
				this.aBoolean60 = true;
			}
		} catch (@Pc(177) RuntimeException local177) {
			signlink.reporterror("26573, " + 112 + ", " + local177.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "p", descriptor = "(B)V")
	private void method208(@OriginalArg(0) byte arg0) {
		try {
			@Pc(4) boolean local4 = false;
			if (this.anInt222 == 2) {
				this.method160((this.anInt290 - this.anInt245 << 7) + this.anInt293, (this.anInt289 - this.anInt244 << 7) + this.anInt292, 265, this.anInt291 * 2);
				if (this.anInt379 > -1 && anInt223 % 20 < 10) {
					this.aClass1_Sub1_Sub2_Sub2Array6[2].method391(this.anInt379 - 12, this.anInt380 - 28);
				}
			}
		} catch (@Pc(66) RuntimeException local66) {
			signlink.reporterror("43992, " + arg0 + ", " + local66.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "A", descriptor = "(I)V")
	private void method209(@OriginalArg(0) int arg0) {
		try {
			Class9.aClass40_4.method593();
			Class9.aClass40_5.method593();
			Class13.aClass40_6.method593();
			Class15.aClass40_7.method593();
			Class15.aClass40_8.method593();
			@Pc(13) boolean local13 = false;
			Class1_Sub1_Sub1_Sub1_Sub1.aClass40_1.method593();
			Class33.aClass40_9.method593();
		} catch (@Pc(19) RuntimeException local19) {
			signlink.reporterror("72923, " + arg0 + ", " + local19.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(II)Z")
	private boolean method210(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			this.anInt330 += arg0;
			if (arg1 < 0) {
				return false;
			}
			@Pc(14) int local14 = this.anIntArray36[arg1];
			if (local14 >= 2000) {
				local14 -= 2000;
			}
			return local14 == 605;
		} catch (@Pc(26) RuntimeException local26) {
			signlink.reporterror("9762, " + arg0 + ", " + arg1 + ", " + local26.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "m", descriptor = "(Z)V")
	private void method211() {
		try {
			@Pc(6) int local6 = this.anInt235 * 128 + 64;
			@Pc(13) int local13 = this.anInt236 * 128 + 64;
			@Pc(25) int local25 = this.method181(this.aByte10, this.anInt361, local6, local13) - this.anInt237;
			if (this.anInt251 < local6) {
				this.anInt251 += this.anInt238 + (local6 - this.anInt251) * this.anInt239 / 1000;
				if (this.anInt251 > local6) {
					this.anInt251 = local6;
				}
			}
			if (this.anInt251 > local6) {
				this.anInt251 -= this.anInt238 + (this.anInt251 - local6) * this.anInt239 / 1000;
				if (this.anInt251 < local6) {
					this.anInt251 = local6;
				}
			}
			if (this.anInt252 < local25) {
				this.anInt252 += this.anInt238 + (local25 - this.anInt252) * this.anInt239 / 1000;
				if (this.anInt252 > local25) {
					this.anInt252 = local25;
				}
			}
			if (this.anInt252 > local25) {
				this.anInt252 -= this.anInt238 + (this.anInt252 - local25) * this.anInt239 / 1000;
				if (this.anInt252 < local25) {
					this.anInt252 = local25;
				}
			}
			if (this.anInt253 < local13) {
				this.anInt253 += this.anInt238 + (local13 - this.anInt253) * this.anInt239 / 1000;
				if (this.anInt253 > local13) {
					this.anInt253 = local13;
				}
			}
			if (this.anInt253 > local13) {
				this.anInt253 -= this.anInt238 + (this.anInt253 - local13) * this.anInt239 / 1000;
				if (this.anInt253 < local13) {
					this.anInt253 = local13;
				}
			}
			local6 = this.anInt397 * 128 + 64;
			local13 = this.anInt398 * 128 + 64;
			local25 = this.method181(this.aByte10, this.anInt361, local6, local13) - this.anInt399;
			@Pc(224) int local224 = local6 - this.anInt251;
			@Pc(229) int local229 = local25 - this.anInt252;
			@Pc(234) int local234 = local13 - this.anInt253;
			@Pc(245) int local245 = (int) Math.sqrt((double) (local224 * local224 + local234 * local234));
			@Pc(261) int local261 = (int) (Math.atan2((double) local229, (double) local245) * 325.949D) & 0x7FF;
			@Pc(272) int local272 = (int) (Math.atan2((double) local224, (double) local234) * -325.949D) & 0x7FF;
			if (local261 < 128) {
				local261 = 128;
			}
			if (local261 > 383) {
				local261 = 383;
			}
			if (this.anInt254 < local261) {
				this.anInt254 += this.anInt400 + (local261 - this.anInt254) * this.anInt401 / 1000;
				if (this.anInt254 > local261) {
					this.anInt254 = local261;
				}
			}
			if (this.anInt254 > local261) {
				this.anInt254 -= this.anInt400 + (this.anInt254 - local261) * this.anInt401 / 1000;
				if (this.anInt254 < local261) {
					this.anInt254 = local261;
				}
			}
			@Pc(343) int local343 = local272 - this.anInt255;
			if (local343 > 1024) {
				local343 -= 2048;
			}
			if (local343 < -1024) {
				local343 += 2048;
			}
			if (local343 > 0) {
				this.anInt255 += this.anInt400 + local343 * this.anInt401 / 1000;
				this.anInt255 &= 0x7FF;
			}
			if (local343 < 0) {
				this.anInt255 -= this.anInt400 + -local343 * this.anInt401 / 1000;
				this.anInt255 &= 0x7FF;
			}
			@Pc(401) int local401 = local272 - this.anInt255;
			if (local401 > 1024) {
				local401 -= 2048;
			}
			if (local401 < -1024) {
				local401 += 2048;
			}
			if (local401 < 0 && local343 > 0 || local401 > 0 && local343 < 0) {
				this.anInt255 = local272;
			}
		} catch (@Pc(422) RuntimeException local422) {
			signlink.reporterror("83306, " + false + ", " + local422.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(I)V")
	@Override
	protected void method92() {
		try {
			if (this.aBoolean63 || this.aBoolean48 || this.aBoolean56) {
				this.method199();
			} else {
				anInt242++;
				if (this.aBoolean80) {
					this.method154(this.aByte9);
				} else {
					this.method206(false);
				}
				this.anInt378 = 0;
			}
		} catch (@Pc(41) RuntimeException local41) {
			signlink.reporterror("41329, " + -349 + ", " + local41.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIIII)V")
	private void method212(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		try {
			@Pc(8) int local8 = this.aClass37_1.method556(arg4, arg0, arg3);
			@Pc(18) int local18;
			@Pc(24) int local24;
			@Pc(28) int local28;
			@Pc(30) int local30;
			@Pc(52) int local52;
			@Pc(58) int local58;
			if (local8 != 0) {
				local18 = this.aClass37_1.method560(arg4, arg0, arg3, local8);
				local24 = local18 >> 6 & 0x3;
				local28 = local18 & 0x1F;
				local30 = arg2;
				if (local8 > 0) {
					local30 = arg1;
				}
				@Pc(38) int[] local38 = this.aClass1_Sub1_Sub2_Sub2_6.anIntArray208;
				local52 = arg0 * 4 + (103 - arg3) * 512 * 4 + 24624;
				local58 = local8 >> 14 & 0x7FFF;
				@Pc(61) Class9 local61 = Class9.method288(local58);
				if (local61.anInt518 == -1) {
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
					@Pc(71) Class1_Sub1_Sub2_Sub3 local71 = this.aClass1_Sub1_Sub2_Sub3Array3[local61.anInt518];
					if (local71 != null) {
						@Pc(83) int local83 = (local61.anInt513 * 4 - local71.anInt677) / 2;
						@Pc(93) int local93 = (local61.anInt514 * 4 - local71.anInt678) / 2;
						local71.method418(arg0 * 4 + local83 + 48, (104 - arg3 - local61.anInt514) * 4 + 48 + local93);
					}
				}
			}
			local8 = this.aClass37_1.method558(arg4, arg0, arg3);
			if (local8 != 0) {
				local18 = this.aClass37_1.method560(arg4, arg0, arg3, local8);
				local24 = local18 >> 6 & 0x3;
				local28 = local18 & 0x1F;
				local30 = local8 >> 14 & 0x7FFF;
				@Pc(454) Class9 local454 = Class9.method288(local30);
				@Pc(486) int local486;
				if (local454.anInt518 != -1) {
					@Pc(464) Class1_Sub1_Sub2_Sub3 local464 = this.aClass1_Sub1_Sub2_Sub3Array3[local454.anInt518];
					if (local464 != null) {
						local58 = (local454.anInt513 * 4 - local464.anInt677) / 2;
						local486 = (local454.anInt514 * 4 - local464.anInt678) / 2;
						local464.method418(arg0 * 4 + local58 + 48, (104 - arg3 - local454.anInt514) * 4 + 48 + local486);
					}
				} else if (local28 == 9) {
					local52 = 15658734;
					if (local8 > 0) {
						local52 = 15597568;
					}
					@Pc(523) int[] local523 = this.aClass1_Sub1_Sub2_Sub2_6.anIntArray208;
					local486 = arg0 * 4 + (103 - arg3) * 512 * 4 + 24624;
					if (local24 == 0 || local24 == 2) {
						local523[local486 + 1536] = local52;
						local523[local486 + 1024 + 1] = local52;
						local523[local486 + 512 + 2] = local52;
						local523[local486 + 3] = local52;
					} else {
						local523[local486] = local52;
						local523[local486 + 512 + 1] = local52;
						local523[local486 + 1024 + 2] = local52;
						local523[local486 + 1536 + 3] = local52;
					}
				}
			}
			local8 = this.aClass37_1.method559(arg4, arg0, arg3);
			if (local8 != 0) {
				local18 = local8 >> 14 & 0x7FFF;
				@Pc(618) Class9 local618 = Class9.method288(local18);
				if (local618.anInt518 != -1) {
					@Pc(628) Class1_Sub1_Sub2_Sub3 local628 = this.aClass1_Sub1_Sub2_Sub3Array3[local618.anInt518];
					if (local628 != null) {
						local30 = (local618.anInt513 * 4 - local628.anInt677) / 2;
						@Pc(650) int local650 = (local618.anInt514 * 4 - local628.anInt678) / 2;
						local628.method418(arg0 * 4 + local30 + 48, (104 - arg3 - local618.anInt514) * 4 + 48 + local650);
						return;
					}
				}
			}
		} catch (@Pc(674) RuntimeException local674) {
			signlink.reporterror("32601, " + arg0 + ", " + 541 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local674.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/String;II)V")
	@Override
	protected void method96(@OriginalArg(0) String arg0, @OriginalArg(2) int arg1) {
		try {
			this.anInt207 = arg1;
			this.aString9 = arg0;
			this.method207();
			if (this.aClass47_1 == null) {
				super.method96(arg0, arg1);
			} else {
				this.aClass35_18.method524((byte) 4);
				this.aClass1_Sub1_Sub2_Sub4_3.method447("RuneScape is loading - please wait...", this.anInt241, 54, 16777215, 180);
				Class1_Sub1_Sub2.method440(304, 62, 28, 34, 9179409);
				Class1_Sub1_Sub2.method440(302, 63, 29, 32, 0);
				Class1_Sub1_Sub2.method439(30, arg1 * 3, 9179409, 64, 30);
				Class1_Sub1_Sub2.method439(arg1 * 3 + 30, 300 - arg1 * 3, 0, 64, 30);
				this.aClass1_Sub1_Sub2_Sub4_3.method447(arg0, this.anInt241, 85, 16777215, 180);
				this.aClass35_18.method525(super.aGraphics2, 171, 202, (byte) 8);
				if (this.aBoolean60) {
					this.aBoolean60 = false;
					if (!this.aBoolean87) {
						this.aClass35_19.method525(super.aGraphics2, 0, 0, (byte) 8);
						this.aClass35_20.method525(super.aGraphics2, 0, 637, (byte) 8);
					}
					this.aClass35_16.method525(super.aGraphics2, 0, 128, (byte) 8);
					this.aClass35_17.method525(super.aGraphics2, 371, 202, (byte) 8);
					this.aClass35_21.method525(super.aGraphics2, 265, 0, (byte) 8);
					this.aClass35_22.method525(super.aGraphics2, 265, 562, (byte) 8);
					this.aClass35_23.method525(super.aGraphics2, 171, 128, (byte) 8);
					this.aClass35_24.method525(super.aGraphics2, 171, 562, (byte) 8);
				}
			}
		} catch (@Pc(219) RuntimeException local219) {
			signlink.reporterror("84245, " + arg0 + ", " + -761 + ", " + arg1 + ", " + local219.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "B", descriptor = "(I)Ljava/net/Socket;")
	public Socket method213(@OriginalArg(0) int arg0) throws IOException {
		return signlink.mainapp == null ? new Socket(InetAddress.getByName(this.getCodeBase().getHost()), arg0) : signlink.opensocket(arg0);
	}

	@OriginalMember(owner = "client!client", name = "C", descriptor = "(I)V")
	private void method214(@OriginalArg(0) int arg0) {
		try {
			if (this.anInt278 >= 2 || this.anInt301 != 0 || this.anInt406 != 0) {
				@Pc(31) String local31;
				if (this.anInt301 == 1 && this.anInt278 < 2) {
					local31 = "Use " + this.aString8 + " with...";
				} else if (this.anInt406 == 1 && this.anInt278 < 2) {
					local31 = this.aString15 + "...";
				} else {
					local31 = this.aStringArray5[this.anInt278 - 1];
				}
				if (this.anInt278 > 2) {
					local31 = local31 + "@whi@ / " + (this.anInt278 - 2) + " more options";
				}
				this.aClass1_Sub1_Sub2_Sub4_3.method456(15, 16777215, local31, anInt223 / 1000, 4);
				@Pc(97) boolean local97 = false;
			}
		} catch (@Pc(99) RuntimeException local99) {
			signlink.reporterror("62408, " + arg0 + ", " + local99.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "q", descriptor = "(B)V")
	private void method215() {
		try {
			if (this.anInt287 == 0 && super.anInt197 == 1) {
				@Pc(24) int local24 = super.anInt198 - 25 - 550;
				@Pc(31) int local31 = super.anInt199 - 5 - 4;
				if (local24 >= 0 && local31 >= 0 && local24 < 146 && local31 < 151) {
					local24 -= 73;
					local31 -= 75;
					@Pc(51) int local51 = this.anInt316 + this.anInt384 & 0x7FF;
					@Pc(55) int local55 = Class1_Sub1_Sub2_Sub1.anIntArray178[local51];
					@Pc(59) int local59 = Class1_Sub1_Sub2_Sub1.anIntArray179[local51];
					@Pc(68) int local68 = local55 * (this.anInt220 + 256) >> 8;
					@Pc(77) int local77 = local59 * (this.anInt220 + 256) >> 8;
					@Pc(87) int local87 = local31 * local68 + local24 * local77 >> 11;
					@Pc(97) int local97 = local31 * local77 - local24 * local68 >> 11;
					@Pc(104) int local104 = aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt981 + local87 >> 7;
					@Pc(111) int local111 = aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt982 - local97 >> 7;
					@Pc(132) boolean local132 = this.method178(aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray273[0], 0, 0, 0, true, 1, aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray272[0], local104, 0, local111, 0);
					if (local132) {
						this.aClass1_Sub1_Sub3_2.method470(local24);
						this.aClass1_Sub1_Sub3_2.method470(local31);
						this.aClass1_Sub1_Sub3_2.method471(this.anInt316);
						this.aClass1_Sub1_Sub3_2.method470(57);
						this.aClass1_Sub1_Sub3_2.method470(this.anInt384);
						this.aClass1_Sub1_Sub3_2.method470(this.anInt220);
						this.aClass1_Sub1_Sub3_2.method470(89);
						this.aClass1_Sub1_Sub3_2.method471(aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt981);
						this.aClass1_Sub1_Sub3_2.method471(aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt982);
						this.aClass1_Sub1_Sub3_2.method470(this.anInt376);
						this.aClass1_Sub1_Sub3_2.method470(63);
						return;
					}
				}
			}
		} catch (@Pc(186) RuntimeException local186) {
			signlink.reporterror("60349, " + -95 + ", " + local186.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "n", descriptor = "(Z)V")
	private void method216() {
		try {
			this.method198();
			if (this.anInt346 == 1) {
				this.aClass1_Sub1_Sub2_Sub2Array7[this.anInt345 / 100].method391(this.anInt343 - 8 - 4, this.anInt344 - 8 - 4);
			}
			if (this.anInt346 == 2) {
				this.aClass1_Sub1_Sub2_Sub2Array7[this.anInt345 / 100 + 4].method391(this.anInt343 - 8 - 4, this.anInt344 - 8 - 4);
				anInt364++;
				if (anInt364 > 57) {
					anInt364 = 0;
					this.aClass1_Sub1_Sub3_2.method469(this.anInt208, 19);
				}
			}
			if (this.anInt419 != -1) {
				this.method185(this.anInt264, this.anInt419);
				this.method155(0, 0, Class6.aClass6Array1[this.anInt419], 0, this.anInt340);
			}
			if (this.anInt205 != -1) {
				this.method185(this.anInt264, this.anInt205);
				this.method155(0, 0, Class6.aClass6Array1[this.anInt205], 0, this.anInt340);
			}
			this.method143();
			if (!this.aBoolean77) {
				this.method172();
				this.method214(453);
			} else if (this.anInt307 == 0) {
				this.method180();
			}
			if (this.anInt339 == 1) {
				this.aClass1_Sub1_Sub2_Sub2Array6[1].method391(472, 296);
			}
			@Pc(180) int local180;
			if (aBoolean74) {
				@Pc(156) byte local156 = 20;
				@Pc(158) int local158 = 16776960;
				if (super.anInt187 < 15) {
					local158 = 16711680;
				}
				this.aClass1_Sub1_Sub2_Sub4_2.method446(20, local158, "Fps:" + super.anInt187, 108);
				local180 = local156 + 15;
				@Pc(182) Runtime local182 = Runtime.getRuntime();
				@Pc(191) int local191 = (int) ((local182.totalMemory() - local182.freeMemory()) / 1024L);
				if (local191 > 33554432 && aBoolean72) {
				}
				this.aClass1_Sub1_Sub2_Sub4_2.method446(35, 16776960, "Mem:" + local191 + "k", 108);
				local180 += 15;
			}
			if (this.anInt240 != 0) {
				@Pc(225) int local225 = this.anInt240 / 50;
				local180 = local225 / 60;
				@Pc(233) int local233 = local225 % 60;
				if (local233 < 10) {
					this.aClass1_Sub1_Sub2_Sub4_2.method451("System update in: " + local180 + ":0" + local233, 16776960, 329, 4);
				} else {
					this.aClass1_Sub1_Sub2_Sub4_2.method451("System update in: " + local180 + ":" + local233, 16776960, 329, 4);
				}
			}
		} catch (@Pc(275) RuntimeException local275) {
			signlink.reporterror("11056, " + false + ", " + local275.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "r", descriptor = "(B)V")
	private void method218() {
		try {
			this.aBoolean66 = true;
			for (@Pc(10) int local10 = 0; local10 < 7; local10++) {
				this.anIntArray61[local10] = -1;
				for (@Pc(19) int local19 = 0; local19 < Class23.anInt749; local19++) {
					if (!Class23.aClass23Array1[local19].aBoolean190 && Class23.aClass23Array1[local19].anInt750 == local10 + (this.aBoolean73 ? 0 : 7)) {
						this.anIntArray61[local10] = local19;
						break;
					}
				}
			}
		} catch (@Pc(56) RuntimeException local56) {
			signlink.reporterror("53425, " + 100 + ", " + local56.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "f", descriptor = "(II)V")
	private void method219(@OriginalArg(1) int arg0) {
		try {
			@Pc(3) Class6 local3 = Class6.aClass6Array1[arg0];
			for (@Pc(5) int local5 = 0; local5 < local3.anIntArray98.length && local3.anIntArray98[local5] != -1; local5++) {
				@Pc(20) Class6 local20 = Class6.aClass6Array1[local3.anIntArray98[local5]];
				if (local20.anInt431 == 1) {
					this.method219(local20.anInt429);
				}
				local20.anInt427 = 0;
				local20.anInt428 = 0;
			}
		} catch (@Pc(48) RuntimeException local48) {
			signlink.reporterror("60011, " + 664 + ", " + arg0 + ", " + local48.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(ILclient!lb;I)V")
	private void method220(@OriginalArg(1) Class1_Sub1_Sub3 arg0, @OriginalArg(2) int arg1) {
		try {
			@Pc(10) int local10 = arg0.method491(this.anInt243, 8);
			@Pc(16) int local16;
			if (local10 < this.anInt389) {
				for (local16 = local10; local16 < this.anInt389; local16++) {
					this.anIntArray55[this.anInt295++] = this.anIntArray87[local16];
				}
			}
			if (local10 > this.anInt389) {
				signlink.reporterror(this.aString16 + " Too many players");
				throw new RuntimeException("eek");
			}
			this.anInt389 = 0;
			for (local16 = 0; local16 < local10; local16++) {
				@Pc(68) int local68 = this.anIntArray87[local16];
				@Pc(73) Class1_Sub1_Sub1_Sub1_Sub1 local73 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local68];
				@Pc(79) int local79 = arg0.method491(this.anInt243, 1);
				if (local79 == 0) {
					this.anIntArray87[this.anInt389++] = local68;
					local73.anInt1021 = anInt223;
				} else {
					@Pc(103) int local103 = arg0.method491(this.anInt243, 2);
					if (local103 == 0) {
						this.anIntArray87[this.anInt389++] = local68;
						local73.anInt1021 = anInt223;
						this.anIntArray88[this.anInt390++] = local68;
					} else {
						@Pc(155) int local155;
						@Pc(166) int local166;
						if (local103 == 1) {
							this.anIntArray87[this.anInt389++] = local68;
							local73.anInt1021 = anInt223;
							local155 = arg0.method491(this.anInt243, 3);
							local73.method678(692, local155, false);
							local166 = arg0.method491(this.anInt243, 1);
							if (local166 == 1) {
								this.anIntArray88[this.anInt390++] = local68;
							}
						} else if (local103 == 2) {
							this.anIntArray87[this.anInt389++] = local68;
							local73.anInt1021 = anInt223;
							local155 = arg0.method491(this.anInt243, 3);
							local73.method678(692, local155, true);
							local166 = arg0.method491(this.anInt243, 3);
							local73.method678(692, local166, true);
							@Pc(227) int local227 = arg0.method491(this.anInt243, 1);
							if (local227 == 1) {
								this.anIntArray88[this.anInt390++] = local68;
							}
						} else if (local103 == 3) {
							this.anIntArray55[this.anInt295++] = local68;
						}
					}
				}
			}
		} catch (@Pc(264) RuntimeException local264) {
			signlink.reporterror("1453, " + 0 + ", " + arg0 + ", " + arg1 + ", " + local264.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;Z)V")
	private void method221(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) boolean arg2) {
		signlink.errorname = arg0;
		try {
			if (!arg2) {
				this.aString13 = "";
				this.aString14 = "Connecting to server...";
				this.method206(true);
			}
			this.aClass8_1 = new Class8(this.method213(anInt363 + 43594), this, false);
			@Pc(30) long local30 = Class48.method667(arg0);
			@Pc(37) int local37 = (int) (local30 >> 16 & 0x1FL);
			this.aClass1_Sub1_Sub3_2.anInt742 = 0;
			this.aClass1_Sub1_Sub3_2.method470(14);
			this.aClass1_Sub1_Sub3_2.method470(local37);
			this.aClass8_1.method251(this.aClass1_Sub1_Sub3_2.aByteArray9, 2);
			for (@Pc(60) int local60 = 0; local60 < 8; local60++) {
				this.aClass8_1.method248();
			}
			@Pc(74) int local74 = this.aClass8_1.method248();
			@Pc(76) int local76 = local74;
			@Pc(226) int local226;
			@Pc(260) int local260;
			if (local74 == 0) {
				this.aClass8_1.method250(this.aClass1_Sub1_Sub3_3.aByteArray9, 0, 8);
				this.aClass1_Sub1_Sub3_3.anInt742 = 0;
				this.aLong17 = this.aClass1_Sub1_Sub3_3.method486(this.anInt375);
				@Pc(100) int[] local100 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (this.aLong17 >> 32), (int) this.aLong17 };
				this.aClass1_Sub1_Sub3_2.anInt742 = 0;
				this.aClass1_Sub1_Sub3_2.method470(10);
				this.aClass1_Sub1_Sub3_2.method474(local100[0]);
				this.aClass1_Sub1_Sub3_2.method474(local100[1]);
				this.aClass1_Sub1_Sub3_2.method474(local100[2]);
				this.aClass1_Sub1_Sub3_2.method474(local100[3]);
				this.aClass1_Sub1_Sub3_2.method474(signlink.anInt930);
				this.aClass1_Sub1_Sub3_2.method477(arg0);
				this.aClass1_Sub1_Sub3_2.method477(arg1);
				this.aClass1_Sub1_Sub3_2.method495(aBigInteger2, aBigInteger1);
				this.aClass1_Sub1_Sub3_4.anInt742 = 0;
				if (arg2) {
					this.aClass1_Sub1_Sub3_4.method470(18);
				} else {
					this.aClass1_Sub1_Sub3_4.method470(16);
				}
				this.aClass1_Sub1_Sub3_4.method470(this.aClass1_Sub1_Sub3_2.anInt742 + 36 + 1 + 1 + 2);
				this.aClass1_Sub1_Sub3_4.method470(255);
				this.aClass1_Sub1_Sub3_4.method471(303);
				this.aClass1_Sub1_Sub3_4.method470(aBoolean72 ? 1 : 0);
				for (local226 = 0; local226 < 9; local226++) {
					this.aClass1_Sub1_Sub3_4.method474(this.anIntArray50[local226]);
				}
				this.aClass1_Sub1_Sub3_4.method478(this.aClass1_Sub1_Sub3_2.anInt742, this.aClass1_Sub1_Sub3_2.aByteArray9);
				this.aClass1_Sub1_Sub3_2.aClass46_2 = new Class46(local100, true);
				for (local260 = 0; local260 < 4; local260++) {
					local100[local260] += 50;
				}
				this.aClass46_1 = new Class46(local100, true);
				this.aClass8_1.method251(this.aClass1_Sub1_Sub3_4.aByteArray9, this.aClass1_Sub1_Sub3_4.anInt742);
				local74 = this.aClass8_1.method248();
			}
			if (local74 == 1) {
				try {
					Thread.sleep(2000L);
				} catch (@Pc(302) Exception local302) {
				}
				this.method221(arg0, arg1, arg2);
			} else {
				@Pc(390) int local390;
				if (local74 == 2) {
					this.anInt306 = this.aClass8_1.method248();
					aBoolean62 = this.aClass8_1.method248() == 1;
					this.aLong16 = 0L;
					this.anInt209 = 0;
					this.aClass11_1.anInt539 = 0;
					super.aBoolean45 = true;
					this.aBoolean52 = true;
					this.aBoolean80 = true;
					this.aClass1_Sub1_Sub3_2.anInt742 = 0;
					this.aClass1_Sub1_Sub3_3.anInt742 = 0;
					this.anInt331 = -1;
					this.anInt257 = -1;
					this.anInt258 = -1;
					this.anInt259 = -1;
					this.anInt330 = 0;
					this.anInt332 = 0;
					this.anInt240 = 0;
					this.anInt334 = 0;
					this.anInt222 = 0;
					this.anInt278 = 0;
					this.aBoolean77 = false;
					super.anInt190 = 0;
					for (local390 = 0; local390 < 100; local390++) {
						this.aStringArray4[local390] = null;
					}
					this.anInt301 = 0;
					this.anInt406 = 0;
					this.anInt232 = 0;
					this.anInt347 = 0;
					this.anInt227 = (int) (Math.random() * 100.0D) - 50;
					this.anInt335 = (int) (Math.random() * 110.0D) - 55;
					this.anInt321 = (int) (Math.random() * 80.0D) - 40;
					this.anInt384 = (int) (Math.random() * 120.0D) - 60;
					this.anInt220 = (int) (Math.random() * 30.0D) - 20;
					this.anInt316 = (int) (Math.random() * 20.0D) - 10 & 0x7FF;
					this.anInt287 = 0;
					this.anInt260 = -1;
					this.anInt281 = 0;
					this.anInt282 = 0;
					this.anInt389 = 0;
					this.anInt420 = 0;
					for (local226 = 0; local226 < this.anInt387; local226++) {
						this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local226] = null;
						this.aClass1_Sub1_Sub3Array1[local226] = null;
					}
					for (local260 = 0; local260 < 16384; local260++) {
						this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local260] = null;
					}
					aClass1_Sub1_Sub1_Sub1_Sub1_1 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[this.anInt388] = new Class1_Sub1_Sub1_Sub1_Sub1();
					this.aClass29_3.method515();
					this.aClass29_2.method515();
					@Pc(535) int local535;
					@Pc(539) int local539;
					for (@Pc(531) int local531 = 0; local531 < 4; local531++) {
						for (local535 = 0; local535 < 104; local535++) {
							for (local539 = 0; local539 < 104; local539++) {
								this.aClass29ArrayArrayArray1[local531][local535][local539] = null;
							}
						}
					}
					this.aClass29_1 = new Class29(0);
					this.anInt263 = 0;
					this.anInt262 = 0;
					this.anInt256 = -1;
					this.anInt261 = -1;
					this.anInt205 = -1;
					this.anInt203 = -1;
					this.anInt419 = -1;
					this.aBoolean90 = false;
					this.anInt312 = 3;
					this.aBoolean82 = false;
					this.aBoolean77 = false;
					this.aBoolean81 = false;
					this.aString6 = null;
					this.anInt339 = 0;
					this.anInt313 = -1;
					this.aBoolean73 = true;
					this.method218();
					for (local535 = 0; local535 < 5; local535++) {
						this.anIntArray69[local535] = 0;
					}
					for (local539 = 0; local539 < 5; local539++) {
						this.aStringArray2[local539] = null;
						this.aBooleanArray3[local539] = false;
					}
					anInt288 = 0;
					anInt274 = 0;
					anInt405 = 0;
					anInt327 = 0;
					anInt323 = 0;
					anInt265 = 0;
					anInt276 = 0;
					anInt273 = 0;
					anInt326 = 0;
					this.method222();
				} else if (local74 == 3) {
					this.aString13 = "";
					this.aString14 = "Invalid username or password.";
				} else if (local74 == 4) {
					this.aString13 = "Your account has been disabled.";
					this.aString14 = "Please check your message-centre for details.";
				} else if (local74 == 5) {
					this.aString13 = "Your account is already logged in.";
					this.aString14 = "Try again in 60 secs...";
				} else if (local74 == 6) {
					this.aString13 = "RuneScape has been updated!";
					this.aString14 = "Please reload this page.";
				} else if (local74 == 7) {
					this.aString13 = "This world is full.";
					this.aString14 = "Please use a different world.";
				} else if (local74 == 8) {
					this.aString13 = "Unable to connect.";
					this.aString14 = "Login server offline.";
				} else if (local74 == 9) {
					this.aString13 = "Login limit exceeded.";
					this.aString14 = "Too many connections from your address.";
				} else if (local74 == 10) {
					this.aString13 = "Unable to connect.";
					this.aString14 = "Bad session id.";
				} else if (local74 == 11) {
					this.aString14 = "Login server rejected session.";
					this.aString14 = "Please try again.";
				} else if (local74 == 12) {
					this.aString13 = "You need a members account to login to this world.";
					this.aString14 = "Please subscribe, or use a different world.";
				} else if (local74 == 13) {
					this.aString13 = "Could not complete login.";
					this.aString14 = "Please try using a different world.";
				} else if (local74 == 14) {
					this.aString13 = "The server is being updated.";
					this.aString14 = "Please wait 1 minute and try again.";
				} else if (local74 == 15) {
					this.aBoolean80 = true;
					this.aClass1_Sub1_Sub3_2.anInt742 = 0;
					this.aClass1_Sub1_Sub3_3.anInt742 = 0;
					this.anInt331 = -1;
					this.anInt257 = -1;
					this.anInt258 = -1;
					this.anInt259 = -1;
					this.anInt330 = 0;
					this.anInt332 = 0;
					this.anInt240 = 0;
					this.anInt278 = 0;
					this.aBoolean77 = false;
					this.aLong15 = System.currentTimeMillis();
				} else if (local74 == 16) {
					this.aString13 = "Login attempts exceeded.";
					this.aString14 = "Please wait 1 minute and try again.";
				} else if (local74 == 17) {
					this.aString13 = "You are standing in a members-only area.";
					this.aString14 = "To play on this world move to a free area first";
				} else if (local74 == 20) {
					this.aString13 = "Invalid loginserver requested";
					this.aString14 = "Please try using a different world.";
				} else if (local74 == 21) {
					for (local390 = this.aClass8_1.method248(); local390 >= 0; local390--) {
						this.aString13 = "You have only just left another world";
						this.aString14 = "Your profile will be transferred in: " + local390 + " seconds";
						this.method206(true);
						try {
							Thread.sleep(1000L);
						} catch (@Pc(900) Exception local900) {
						}
					}
					this.method221(arg0, arg1, arg2);
				} else if (local74 != -1) {
					System.out.println("response:" + local74);
					this.aString13 = "Unexpected server response";
					this.aString14 = "Please try using a different world.";
				} else if (local76 != 0) {
					this.aString13 = "No response from server";
					this.aString14 = "Please try using a different world.";
				} else if (this.anInt218 < 2) {
					try {
						Thread.sleep(2000L);
					} catch (@Pc(922) Exception local922) {
					}
					this.anInt218++;
					this.method221(arg0, arg1, arg2);
				} else {
					this.aString13 = "No response from loginserver";
					this.aString14 = "Please wait 1 minute and try again.";
				}
			}
		} catch (@Pc(965) IOException local965) {
			this.aString13 = "";
			this.aString14 = "Error connecting to server.";
		}
	}

	@OriginalMember(owner = "client!client", name = "D", descriptor = "(I)V")
	private void method222() {
		try {
			if (this.aClass35_15 == null) {
				this.method162(this.anInt413);
				super.aClass35_2 = null;
				this.aClass35_16 = null;
				this.aClass35_17 = null;
				this.aClass35_18 = null;
				this.aClass35_19 = null;
				this.aClass35_20 = null;
				this.aClass35_21 = null;
				this.aClass35_22 = null;
				this.aClass35_23 = null;
				this.aClass35_24 = null;
				this.aClass35_15 = new Class35(479, 5, 96, this.method94());
				this.aClass35_13 = new Class35(172, 5, 156, this.method94());
				Class1_Sub1_Sub2.method437(this.aBoolean50);
				this.aClass1_Sub1_Sub2_Sub3_16.method418(0, 0);
				this.aClass35_12 = new Class35(190, 5, 261, this.method94());
				this.aClass35_14 = new Class35(512, 5, 334, this.method94());
				Class1_Sub1_Sub2.method437(this.aBoolean50);
				this.aClass35_25 = new Class35(496, 5, 50, this.method94());
				this.aClass35_26 = new Class35(269, 5, 37, this.method94());
				this.aClass35_27 = new Class35(249, 5, 45, this.method94());
				this.aBoolean60 = true;
			}
		} catch (@Pc(134) RuntimeException local134) {
			signlink.reporterror("93360, " + -682 + ", " + local134.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "E", descriptor = "(I)V")
	private void method223() {
		try {
			this.anInt366 = 0;
			@Pc(90) int local90;
			@Pc(70) int local70;
			for (@Pc(6) int local6 = -1; local6 < this.anInt389 + this.anInt420; local6++) {
				@Pc(13) Class1_Sub1_Sub1_Sub1 local13;
				if (local6 == -1) {
					local13 = aClass1_Sub1_Sub1_Sub1_Sub1_1;
				} else if (local6 < this.anInt389) {
					local13 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[this.anIntArray87[local6]];
				} else {
					local13 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[this.anIntArray93[local6 - this.anInt389]];
				}
				if (local13 != null && local13.method680()) {
					@Pc(54) Class13 local54;
					if (local13 instanceof Class1_Sub1_Sub1_Sub1_Sub2) {
						local54 = ((Class1_Sub1_Sub1_Sub1_Sub2) local13).aClass13_2;
						if (local54.anIntArray174 != null) {
							local54 = local54.method327((byte) 8);
						}
						if (local54 == null) {
							continue;
						}
					}
					if (local6 >= this.anInt389) {
						local54 = ((Class1_Sub1_Sub1_Sub1_Sub2) local13).aClass13_2;
						if (local54.anInt571 >= 0 && local54.anInt571 < this.aClass1_Sub1_Sub2_Sub2Array6.length) {
							this.method159(local13, local13.anInt1022 + 15);
							if (this.anInt379 > -1) {
								this.aClass1_Sub1_Sub2_Sub2Array6[local54.anInt571].method391(this.anInt379 - 12, this.anInt380 - 30);
							}
						}
						if (this.anInt222 == 1 && this.anInt424 == this.anIntArray93[local6 - this.anInt389] && anInt223 % 20 < 10) {
							this.method159(local13, local13.anInt1022 + 15);
							if (this.anInt379 > -1) {
								this.aClass1_Sub1_Sub2_Sub2Array6[2].method391(this.anInt379 - 12, this.anInt380 - 28);
							}
						}
					} else {
						local70 = 30;
						@Pc(73) Class1_Sub1_Sub1_Sub1_Sub1 local73 = (Class1_Sub1_Sub1_Sub1_Sub1) local13;
						if (local73.anInt128 != 0) {
							this.method159(local13, local13.anInt1022 + 15);
							if (this.anInt379 > -1) {
								for (local90 = 0; local90 < 8; local90++) {
									if ((local73.anInt128 & 0x1 << local90) != 0) {
										this.aClass1_Sub1_Sub2_Sub2Array6[local90].method391(this.anInt379 - 12, this.anInt380 - local70);
										local70 -= 25;
									}
								}
							}
						}
						if (local6 >= 0 && this.anInt222 == 10 && this.anInt224 == this.anIntArray87[local6]) {
							this.method159(local13, local13.anInt1022 + 15);
							if (this.anInt379 > -1) {
								this.aClass1_Sub1_Sub2_Sub2Array6[7].method391(this.anInt379 - 12, this.anInt380 - local70);
							}
						}
					}
					if (local13.aString31 != null && (local6 >= this.anInt389 || this.anInt377 == 0 || this.anInt377 == 3 || this.anInt377 == 1 && this.method113(((Class1_Sub1_Sub1_Sub1_Sub1) local13).aString3))) {
						this.method159(local13, local13.anInt1022);
						if (this.anInt379 > -1 && this.anInt366 < this.anInt367) {
							this.anIntArray75[this.anInt366] = this.aClass1_Sub1_Sub2_Sub4_3.method450(local13.aString31) / 2;
							this.anIntArray74[this.anInt366] = this.aClass1_Sub1_Sub2_Sub4_3.anInt710;
							this.anIntArray72[this.anInt366] = this.anInt379;
							this.anIntArray73[this.anInt366] = this.anInt380;
							this.anIntArray76[this.anInt366] = local13.anInt993;
							this.anIntArray77[this.anInt366] = local13.anInt994;
							this.anIntArray78[this.anInt366] = local13.anInt992;
							this.aStringArray6[this.anInt366++] = local13.aString31;
							if (this.anInt416 == 0 && local13.anInt994 >= 1 && local13.anInt994 <= 3) {
								this.anIntArray74[this.anInt366] += 10;
								this.anIntArray73[this.anInt366] += 5;
							}
							if (this.anInt416 == 0 && local13.anInt994 == 4) {
								this.anIntArray75[this.anInt366] = 60;
							}
							if (this.anInt416 == 0 && local13.anInt994 == 5) {
								this.anIntArray74[this.anInt366] += 5;
							}
						}
					}
					if (local13.anInt995 > anInt223) {
						this.method159(local13, local13.anInt1022 + 15);
						if (this.anInt379 > -1) {
							local70 = local13.anInt996 * 30 / local13.anInt997;
							if (local70 > 30) {
								local70 = 30;
							}
							Class1_Sub1_Sub2.method439(this.anInt379 - 15, local70, 65280, this.anInt380 - 3, 5);
							Class1_Sub1_Sub2.method439(this.anInt379 + local70 - 15, 30 - local70, 16711680, this.anInt380 - 3, 5);
						}
					}
					for (local70 = 0; local70 < 4; local70++) {
						if (local13.anIntArray271[local70] > anInt223) {
							this.method159(local13, local13.anInt1022 / 2);
							if (this.anInt379 > -1) {
								if (local70 == 1) {
									this.anInt380 -= 20;
								}
								if (local70 == 2) {
									this.anInt379 -= 15;
									this.anInt380 -= 10;
								}
								if (local70 == 3) {
									this.anInt379 += 15;
									this.anInt380 -= 10;
								}
								this.aClass1_Sub1_Sub2_Sub2Array4[local13.anIntArray270[local70]].method391(this.anInt379 - 12, this.anInt380 - 12);
								this.aClass1_Sub1_Sub2_Sub4_1.method447(String.valueOf(local13.anIntArray269[local70]), this.anInt241, this.anInt380 + 4, 0, this.anInt379);
								this.aClass1_Sub1_Sub2_Sub4_1.method447(String.valueOf(local13.anIntArray269[local70]), this.anInt241, this.anInt380 + 3, 16777215, this.anInt379 - 1);
							}
						}
					}
				}
			}
			for (@Pc(597) int local597 = 0; local597 < this.anInt366; local597++) {
				local70 = this.anIntArray72[local597];
				@Pc(609) int local609 = this.anIntArray73[local597];
				local90 = this.anIntArray75[local597];
				@Pc(619) int local619 = this.anIntArray74[local597];
				@Pc(621) boolean local621 = true;
				while (local621) {
					local621 = false;
					for (@Pc(627) int local627 = 0; local627 < local597; local627++) {
						if (local609 + 2 > this.anIntArray73[local627] - this.anIntArray74[local627] && local609 - local619 < this.anIntArray73[local627] + 2 && local70 - local90 < this.anIntArray72[local627] + this.anIntArray75[local627] && local70 + local90 > this.anIntArray72[local627] - this.anIntArray75[local627] && this.anIntArray73[local627] - this.anIntArray74[local627] < local609) {
							local609 = this.anIntArray73[local627] - this.anIntArray74[local627];
							local621 = true;
						}
					}
				}
				this.anInt379 = this.anIntArray72[local597];
				this.anInt380 = this.anIntArray73[local597] = local609;
				@Pc(726) String local726 = this.aStringArray6[local597];
				if (this.anInt416 == 0) {
					@Pc(731) int local731 = 16776960;
					if (this.anIntArray76[local597] < 6) {
						local731 = this.anIntArray54[this.anIntArray76[local597]];
					}
					if (this.anIntArray76[local597] == 6) {
						local731 = this.anInt319 % 20 < 10 ? 16711680 : 16776960;
					}
					if (this.anIntArray76[local597] == 7) {
						local731 = this.anInt319 % 20 < 10 ? 255 : 65535;
					}
					if (this.anIntArray76[local597] == 8) {
						local731 = this.anInt319 % 20 < 10 ? 45056 : 8454016;
					}
					@Pc(806) int local806;
					if (this.anIntArray76[local597] == 9) {
						local806 = 150 - this.anIntArray78[local597];
						if (local806 < 50) {
							local731 = local806 * 1280 + 16711680;
						} else if (local806 < 100) {
							local731 = 16776960 - (local806 - 50) * 327680;
						} else if (local806 < 150) {
							local731 = (local806 - 100) * 5 + 65280;
						}
					}
					if (this.anIntArray76[local597] == 10) {
						local806 = 150 - this.anIntArray78[local597];
						if (local806 < 50) {
							local731 = local806 * 5 + 16711680;
						} else if (local806 < 100) {
							local731 = 16711935 - (local806 - 50) * 327680;
						} else if (local806 < 150) {
							local731 = (local806 - 100) * 327680 + 255 - (local806 - 100) * 5;
						}
					}
					if (this.anIntArray76[local597] == 11) {
						local806 = 150 - this.anIntArray78[local597];
						if (local806 < 50) {
							local731 = 16777215 - local806 * 327685;
						} else if (local806 < 100) {
							local731 = (local806 - 50) * 327685 + 65280;
						} else if (local806 < 150) {
							local731 = 16777215 - (local806 - 100) * 327680;
						}
					}
					if (this.anIntArray77[local597] == 0) {
						this.aClass1_Sub1_Sub2_Sub4_3.method447(local726, this.anInt241, this.anInt380 + 1, 0, this.anInt379);
						this.aClass1_Sub1_Sub2_Sub4_3.method447(local726, this.anInt241, this.anInt380, local731, this.anInt379);
					}
					if (this.anIntArray77[local597] == 1) {
						this.aClass1_Sub1_Sub2_Sub4_3.method452(local726, 0, this.anInt379, this.anInt319, this.anInt380 + 1);
						this.aClass1_Sub1_Sub2_Sub4_3.method452(local726, local731, this.anInt379, this.anInt319, this.anInt380);
					}
					if (this.anIntArray77[local597] == 2) {
						this.aClass1_Sub1_Sub2_Sub4_3.method453(this.anInt319, local726, 0, this.anInt380 + 1, this.anInt379);
						this.aClass1_Sub1_Sub2_Sub4_3.method453(this.anInt319, local726, local731, this.anInt380, this.anInt379);
					}
					if (this.anIntArray77[local597] == 3) {
						this.aClass1_Sub1_Sub2_Sub4_3.method454(this.anInt380 + 1, this.anInt379, 150 - this.anIntArray78[local597], this.anInt325, 0, local726, this.anInt319);
						this.aClass1_Sub1_Sub2_Sub4_3.method454(this.anInt380, this.anInt379, 150 - this.anIntArray78[local597], this.anInt325, local731, local726, this.anInt319);
					}
					@Pc(1107) int local1107;
					if (this.anIntArray77[local597] == 4) {
						local806 = this.aClass1_Sub1_Sub2_Sub4_3.method450(local726);
						local1107 = (150 - this.anIntArray78[local597]) * (local806 + 100) / 150;
						Class1_Sub1_Sub2.method436(0, this.anInt379 - 50, 334, this.anInt379 + 50);
						this.aClass1_Sub1_Sub2_Sub4_3.method451(local726, 0, this.anInt380 + 1, this.anInt379 + 50 - local1107);
						this.aClass1_Sub1_Sub2_Sub4_3.method451(local726, local731, this.anInt380, this.anInt379 + 50 - local1107);
						Class1_Sub1_Sub2.method435();
					}
					if (this.anIntArray77[local597] == 5) {
						local806 = 150 - this.anIntArray78[local597];
						local1107 = 0;
						if (local806 < 25) {
							local1107 = local806 - 25;
						} else if (local806 > 125) {
							local1107 = local806 - 125;
						}
						Class1_Sub1_Sub2.method436(this.anInt380 - this.aClass1_Sub1_Sub2_Sub4_3.anInt710 - 1, 0, this.anInt380 + 5, 512);
						this.aClass1_Sub1_Sub2_Sub4_3.method447(local726, this.anInt241, this.anInt380 + local1107 + 1, 0, this.anInt379);
						this.aClass1_Sub1_Sub2_Sub4_3.method447(local726, this.anInt241, this.anInt380 + local1107, local731, this.anInt379);
						Class1_Sub1_Sub2.method435();
					}
				} else {
					this.aClass1_Sub1_Sub2_Sub4_3.method447(local726, this.anInt241, this.anInt380 + 1, 0, this.anInt379);
					this.aClass1_Sub1_Sub2_Sub4_3.method447(local726, this.anInt241, this.anInt380, 16776960, this.anInt379);
				}
			}
		} catch (@Pc(1267) RuntimeException local1267) {
			signlink.reporterror("17912, " + -901 + ", " + local1267.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILclient!lb;Lclient!ab;IZ)V")
	private void method224(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub1_Sub3 arg1, @OriginalArg(2) Class1_Sub1_Sub1_Sub1_Sub1 arg2, @OriginalArg(3) int arg3) {
		try {
			@Pc(12) int local12;
			if ((arg0 & 0x1) == 1) {
				local12 = arg1.method480();
				@Pc(15) byte[] local15 = new byte[local12];
				@Pc(21) Class1_Sub1_Sub3 local21 = new Class1_Sub1_Sub3(local15, 58);
				arg1.method489(local12, local15);
				this.aClass1_Sub1_Sub3Array1[arg3] = local21;
				arg2.method39(local21);
			}
			@Pc(59) int local59;
			@Pc(71) int local71;
			if ((arg0 & 0x2) == 2) {
				local12 = arg1.method482();
				if (local12 == 65535) {
					local12 = -1;
				}
				if (local12 == arg2.anInt1004) {
					arg2.anInt1008 = 0;
				}
				local59 = arg1.method480();
				if (local12 == arg2.anInt1004 && local12 != -1) {
					local71 = Class27.aClass27Array1[local12].anInt799;
					if (local71 == 1) {
						arg2.anInt1005 = 0;
						arg2.anInt1006 = 0;
						arg2.anInt1007 = local59;
						arg2.anInt1008 = 0;
					}
					if (local71 == 2) {
						arg2.anInt1008 = 0;
					}
				} else if (local12 == -1 || arg2.anInt1004 == -1 || Class27.aClass27Array1[local12].anInt793 >= Class27.aClass27Array1[arg2.anInt1004].anInt793) {
					arg2.anInt1004 = local12;
					arg2.anInt1005 = 0;
					arg2.anInt1006 = 0;
					arg2.anInt1007 = local59;
					arg2.anInt1008 = 0;
					arg2.anInt1027 = arg2.anInt1025;
				}
			}
			if ((arg0 & 0x4) == 4) {
				arg2.anInt998 = arg1.method482();
				if (arg2.anInt998 == 65535) {
					arg2.anInt998 = -1;
				}
			}
			if ((arg0 & 0x8) == 8) {
				arg2.aString31 = arg1.method487();
				if (arg2.aString31.charAt(0) == '~') {
					arg2.aString31 = arg2.aString31.substring(1);
					this.method187(2, arg2.aString31, arg2.aString3);
				} else if (arg2 == aClass1_Sub1_Sub1_Sub1_Sub1_1) {
					this.method187(2, arg2.aString31, arg2.aString3);
				}
				arg2.anInt993 = 0;
				arg2.anInt994 = 0;
				arg2.anInt992 = 150;
			}
			if ((arg0 & 0x10) == 16) {
				local12 = arg1.method480();
				local59 = arg1.method480();
				arg2.method681(local59, anInt223, local12);
				arg2.anInt995 = anInt223 + 300;
				arg2.anInt996 = arg1.method480();
				arg2.anInt997 = arg1.method480();
			}
			if ((arg0 & 0x20) == 32) {
				arg2.anInt999 = arg1.method482();
				arg2.anInt1000 = arg1.method482();
			}
			if ((arg0 & 0x40) == 64) {
				local12 = arg1.method482();
				local59 = arg1.method480();
				local71 = arg1.method480();
				@Pc(257) int local257 = arg1.anInt742;
				if (arg2.aString3 != null && arg2.aBoolean26) {
					@Pc(267) long local267 = Class48.method667(arg2.aString3);
					@Pc(269) boolean local269 = false;
					if (local59 <= 1) {
						for (@Pc(274) int local274 = 0; local274 < this.anInt348; local274++) {
							if (this.aLongArray4[local274] == local267) {
								local269 = true;
								break;
							}
						}
					}
					if (!local269 && this.anInt250 == 0) {
						try {
							@Pc(302) String local302 = Class49.method683(arg1, local71);
							@Pc(306) String local306 = Class42.method604(local302);
							arg2.aString31 = local306;
							arg2.anInt993 = local12 >> 8;
							arg2.anInt994 = local12 & 0xFF;
							arg2.anInt992 = 150;
							if (local59 == 2 || local59 == 3) {
								this.method187(1, local306, "@cr2@" + arg2.aString3);
							} else if (local59 == 1) {
								this.method187(1, local306, "@cr1@" + arg2.aString3);
							} else {
								this.method187(2, local306, arg2.aString3);
							}
						} catch (@Pc(370) Exception local370) {
							signlink.reporterror("cde2");
						}
					}
				}
				arg1.anInt742 = local257 + local71;
			}
			if ((arg0 & 0x100) == 256) {
				arg2.anInt1009 = arg1.method482();
				local12 = arg1.method485();
				arg2.anInt1013 = local12 >> 16;
				arg2.anInt1012 = anInt223 + (local12 & 0xFFFF);
				arg2.anInt1010 = 0;
				arg2.anInt1011 = 0;
				if (arg2.anInt1012 > anInt223) {
					arg2.anInt1010 = -1;
				}
				if (arg2.anInt1009 == 65535) {
					arg2.anInt1009 = -1;
				}
			}
			if ((arg0 & 0x200) == 512) {
				arg2.anInt1014 = arg1.method480();
				arg2.anInt1016 = arg1.method480();
				arg2.anInt1015 = arg1.method480();
				arg2.anInt1017 = arg1.method480();
				arg2.anInt1018 = arg1.method482() + anInt223;
				arg2.anInt1019 = arg1.method482() + anInt223;
				arg2.anInt1020 = arg1.method480();
				arg2.method679();
			}
			if ((arg0 & 0x400) == 1024) {
				local12 = arg1.method480();
				local59 = arg1.method480();
				arg2.method681(local59, anInt223, local12);
				arg2.anInt995 = anInt223 + 300;
				arg2.anInt996 = arg1.method480();
				arg2.anInt997 = arg1.method480();
			}
		} catch (@Pc(494) RuntimeException local494) {
			signlink.reporterror("48683, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + true + ", " + local494.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "F", descriptor = "(I)V")
	private void method225() {
		try {
			this.aClass35_15.method524((byte) 4);
			Class1_Sub1_Sub2_Sub1.anIntArray180 = this.anIntArray47;
			this.aClass1_Sub1_Sub2_Sub3_17.method418(0, 0);
			if (this.aBoolean81) {
				this.aClass1_Sub1_Sub2_Sub4_3.method447(this.aString4, this.anInt241, 40, 0, 239);
				this.aClass1_Sub1_Sub2_Sub4_3.method447(this.aString12 + "*", this.anInt241, 60, 128, 239);
			} else if (this.aBoolean82) {
				this.aClass1_Sub1_Sub2_Sub4_3.method447("Enter amount:", this.anInt241, 40, 0, 239);
				this.aClass1_Sub1_Sub2_Sub4_3.method447(this.aString11 + "*", this.anInt241, 60, 128, 239);
			} else if (this.aString6 != null) {
				this.aClass1_Sub1_Sub2_Sub4_3.method447(this.aString6, this.anInt241, 40, 0, 239);
				this.aClass1_Sub1_Sub2_Sub4_3.method447("Click to continue", this.anInt241, 60, 128, 239);
			} else if (this.anInt261 != -1) {
				this.method155(0, 0, Class6.aClass6Array1[this.anInt261], 0, this.anInt340);
			} else if (this.anInt256 == -1) {
				@Pc(138) Class1_Sub1_Sub2_Sub4 local138 = this.aClass1_Sub1_Sub2_Sub4_2;
				@Pc(140) int local140 = 0;
				Class1_Sub1_Sub2.method436(0, 0, 77, 463);
				for (@Pc(148) int local148 = 0; local148 < 100; local148++) {
					if (this.aStringArray4[local148] != null) {
						@Pc(160) int local160 = this.anIntArray53[local148];
						@Pc(169) int local169 = this.anInt357 + 70 - local140 * 14;
						@Pc(174) String local174 = this.aStringArray3[local148];
						@Pc(176) byte local176 = 0;
						if (local174 != null && local174.startsWith("@cr1@")) {
							local174 = local174.substring(5);
							local176 = 1;
						}
						if (local174 != null && local174.startsWith("@cr2@")) {
							local174 = local174.substring(5);
							local176 = 2;
						}
						if (local160 == 0) {
							if (local169 > 0 && local169 < 110) {
								local138.method451(this.aStringArray4[local148], 0, local169, 4);
							}
							local140++;
						}
						@Pc(246) int local246;
						if ((local160 == 1 || local160 == 2) && (local160 == 1 || this.anInt377 == 0 || this.anInt377 == 1 && this.method113(local174))) {
							if (local169 > 0 && local169 < 110) {
								local246 = 4;
								if (local176 == 1) {
									this.aClass1_Sub1_Sub2_Sub3Array1[0].method418(4, local169 - 12);
									local246 += 14;
								}
								if (local176 == 2) {
									this.aClass1_Sub1_Sub2_Sub3Array1[1].method418(local246, local169 - 12);
									local246 += 14;
								}
								local138.method451(local174 + ":", 0, local169, local246);
								local246 += local138.method449((byte) 5, local174) + 8;
								local138.method451(this.aStringArray4[local148], 255, local169, local246);
							}
							local140++;
						}
						if ((local160 == 3 || local160 == 7) && this.anInt234 == 0 && (local160 == 7 || this.anInt294 == 0 || this.anInt294 == 1 && this.method113(local174))) {
							if (local169 > 0 && local169 < 110) {
								local138.method451("From", 0, local169, 4);
								local246 = local138.method449((byte) 5, "From ") + 4;
								if (local176 == 1) {
									this.aClass1_Sub1_Sub2_Sub3Array1[0].method418(local246, local169 - 12);
									local246 += 14;
								}
								if (local176 == 2) {
									this.aClass1_Sub1_Sub2_Sub3Array1[1].method418(local246, local169 - 12);
									local246 += 14;
								}
								local138.method451(local174 + ":", 0, local169, local246);
								local246 += local138.method449((byte) 5, local174) + 8;
								local138.method451(this.aStringArray4[local148], 8388608, local169, local246);
							}
							local140++;
						}
						if (local160 == 4 && (this.anInt355 == 0 || this.anInt355 == 1 && this.method113(local174))) {
							if (local169 > 0 && local169 < 110) {
								local138.method451(local174 + " " + this.aStringArray4[local148], 8388736, local169, 4);
							}
							local140++;
						}
						if (local160 == 5 && this.anInt234 == 0 && this.anInt294 < 2) {
							if (local169 > 0 && local169 < 110) {
								local138.method451(this.aStringArray4[local148], 8388608, local169, 4);
							}
							local140++;
						}
						if (local160 == 6 && this.anInt234 == 0 && this.anInt294 < 2) {
							if (local169 > 0 && local169 < 110) {
								local138.method451("To " + local174 + ":", 0, local169, 4);
								local138.method451(this.aStringArray4[local148], 8388608, local169, local138.method449((byte) 5, "To " + local174) + 12);
							}
							local140++;
						}
						if (local160 == 8 && (this.anInt355 == 0 || this.anInt355 == 1 && this.method113(local174))) {
							if (local169 > 0 && local169 < 110) {
								local138.method451(local174 + " " + this.aStringArray4[local148], 8270336, local169, 4);
							}
							local140++;
						}
					}
				}
				Class1_Sub1_Sub2.method435();
				this.anInt212 = local140 * 14 + 7;
				if (this.anInt212 < 78) {
					this.anInt212 = 78;
				}
				this.method196(0, this.anInt212, this.anInt212 - this.anInt357 - 77, 463, 77);
				@Pc(616) String local616;
				if (aClass1_Sub1_Sub1_Sub1_Sub1_1 == null || aClass1_Sub1_Sub1_Sub1_Sub1_1.aString3 == null) {
					local616 = Class48.method671(this.aString16, 789);
				} else {
					local616 = aClass1_Sub1_Sub1_Sub1_Sub1_1.aString3;
				}
				local138.method451(local616 + ":", 0, 90, 4);
				local138.method451(this.aString10 + "*", 255, 90, local138.method449((byte) 5, local616 + ": ") + 6);
				Class1_Sub1_Sub2.method442(0, 479, 0, 77);
			} else {
				this.method155(0, 0, Class6.aClass6Array1[this.anInt256], 0, this.anInt340);
			}
			if (this.aBoolean77 && this.anInt307 == 2) {
				this.method180();
			}
			this.aClass35_15.method525(super.aGraphics2, 357, 17, (byte) 8);
			this.aClass35_14.method524((byte) 4);
			Class1_Sub1_Sub2_Sub1.anIntArray180 = this.anIntArray49;
		} catch (@Pc(708) RuntimeException local708) {
			signlink.reporterror("66586, " + 8 + ", " + local708.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "G", descriptor = "(I)V")
	private void method226() {
		try {
			if (this.anInt301 == 0 && this.anInt406 == 0) {
				this.aStringArray5[this.anInt278] = "Walk here";
				this.anIntArray36[this.anInt278] = 718;
				this.anIntArray34[this.anInt278] = super.anInt192;
				this.anIntArray35[this.anInt278] = super.anInt193;
				this.anInt278++;
			}
			@Pc(50) int local50 = -1;
			for (@Pc(52) int local52 = 0; local52 < Class1_Sub1_Sub1_Sub5.anInt507; local52++) {
				@Pc(58) int local58 = Class1_Sub1_Sub1_Sub5.anIntArray150[local52];
				@Pc(62) int local62 = local58 & 0x7F;
				@Pc(68) int local68 = local58 >> 7 & 0x7F;
				@Pc(74) int local74 = local58 >> 29 & 0x3;
				@Pc(80) int local80 = local58 >> 14 & 0x7FFF;
				if (local58 != local50) {
					local50 = local58;
					@Pc(228) int local228;
					if (local74 == 2 && this.aClass37_1.method560(this.anInt361, local62, local68, local58) >= 0) {
						@Pc(100) Class9 local100 = Class9.method288(local80);
						if (local100.anIntArray160 != null) {
							local100 = local100.method296(this.anInt415);
						}
						if (local100 == null) {
							continue;
						}
						if (this.anInt301 == 1) {
							this.aStringArray5[this.anInt278] = "Use " + this.aString8 + " with @cya@" + local100.aString23;
							this.anIntArray36[this.anInt278] = 810;
							this.anIntArray37[this.anInt278] = local58;
							this.anIntArray34[this.anInt278] = local62;
							this.anIntArray35[this.anInt278] = local68;
							this.anInt278++;
						} else if (this.anInt406 != 1) {
							if (local100.aStringArray8 != null) {
								for (local228 = 4; local228 >= 0; local228--) {
									if (local100.aStringArray8[local228] != null) {
										this.aStringArray5[this.anInt278] = local100.aStringArray8[local228] + " @cya@" + local100.aString23;
										if (local228 == 0) {
											this.anIntArray36[this.anInt278] = 625;
										}
										if (local228 == 1) {
											this.anIntArray36[this.anInt278] = 721;
										}
										if (local228 == 2) {
											this.anIntArray36[this.anInt278] = 743;
										}
										if (local228 == 3) {
											this.anIntArray36[this.anInt278] = 357;
										}
										if (local228 == 4) {
											this.anIntArray36[this.anInt278] = 1071;
										}
										this.anIntArray37[this.anInt278] = local58;
										this.anIntArray34[this.anInt278] = local62;
										this.anIntArray35[this.anInt278] = local68;
										this.anInt278++;
									}
								}
							}
							this.aStringArray5[this.anInt278] = "Examine @cya@" + local100.aString23;
							this.anIntArray36[this.anInt278] = 1381;
							this.anIntArray37[this.anInt278] = local100.anInt512 << 14;
							this.anIntArray34[this.anInt278] = local62;
							this.anIntArray35[this.anInt278] = local68;
							this.anInt278++;
						} else if ((this.anInt408 & 0x4) == 4) {
							this.aStringArray5[this.anInt278] = this.aString15 + " @cya@" + local100.aString23;
							this.anIntArray36[this.anInt278] = 899;
							this.anIntArray37[this.anInt278] = local58;
							this.anIntArray34[this.anInt278] = local62;
							this.anIntArray35[this.anInt278] = local68;
							this.anInt278++;
						}
					}
					@Pc(408) Class1_Sub1_Sub1_Sub1_Sub2 local408;
					@Pc(456) Class1_Sub1_Sub1_Sub1_Sub1 local456;
					@Pc(446) int local446;
					if (local74 == 1) {
						@Pc(379) Class1_Sub1_Sub1_Sub1_Sub2 local379 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local80];
						if (local379.aClass13_2.aByte18 == 1 && (local379.anInt981 & 0x7F) == 64 && (local379.anInt982 & 0x7F) == 64) {
							for (local228 = 0; local228 < this.anInt420; local228++) {
								local408 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[this.anIntArray93[local228]];
								if (local408 != null && local408 != local379 && local408.aClass13_2.aByte18 == 1 && local408.anInt981 == local379.anInt981 && local408.anInt982 == local379.anInt982) {
									this.method195(this.anIntArray93[local228], local68, local62, local408.aClass13_2);
								}
							}
							for (local446 = 0; local446 < this.anInt389; local446++) {
								local456 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[this.anIntArray87[local446]];
								if (local456 != null && local456.anInt981 == local379.anInt981 && local456.anInt982 == local379.anInt982) {
									this.method205(this.anIntArray87[local446], local456, local68, local62, this.anInt350);
								}
							}
						}
						this.method195(local80, local68, local62, local379.aClass13_2);
					}
					if (local74 == 0) {
						@Pc(499) Class1_Sub1_Sub1_Sub1_Sub1 local499 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local80];
						if ((local499.anInt981 & 0x7F) == 64 && (local499.anInt982 & 0x7F) == 64) {
							for (local228 = 0; local228 < this.anInt420; local228++) {
								local408 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[this.anIntArray93[local228]];
								if (local408 != null && local408.aClass13_2.aByte18 == 1 && local408.anInt981 == local499.anInt981 && local408.anInt982 == local499.anInt982) {
									this.method195(this.anIntArray93[local228], local68, local62, local408.aClass13_2);
								}
							}
							for (local446 = 0; local446 < this.anInt389; local446++) {
								local456 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[this.anIntArray87[local446]];
								if (local456 != null && local456 != local499 && local456.anInt981 == local499.anInt981 && local456.anInt982 == local499.anInt982) {
									this.method205(this.anIntArray87[local446], local456, local68, local62, this.anInt350);
								}
							}
						}
						this.method205(local80, local499, local68, local62, this.anInt350);
					}
					if (local74 == 3) {
						@Pc(620) Class29 local620 = this.aClass29ArrayArrayArray1[this.anInt361][local62][local68];
						if (local620 != null) {
							for (@Pc(627) Class1_Sub1_Sub1_Sub3 local627 = (Class1_Sub1_Sub1_Sub3) local620.method512(); local627 != null; local627 = (Class1_Sub1_Sub1_Sub3) local620.method514((byte) 1)) {
								@Pc(633) Class15 local633 = Class15.method361(local627.anInt179);
								if (this.anInt301 == 1) {
									this.aStringArray5[this.anInt278] = "Use " + this.aString8 + " with @lre@" + local633.aString25;
									this.anIntArray36[this.anInt278] = 111;
									this.anIntArray37[this.anInt278] = local627.anInt179;
									this.anIntArray34[this.anInt278] = local62;
									this.anIntArray35[this.anInt278] = local68;
									this.anInt278++;
								} else if (this.anInt406 != 1) {
									for (@Pc(750) int local750 = 4; local750 >= 0; local750--) {
										if (local633.aStringArray10 != null && local633.aStringArray10[local750] != null) {
											this.aStringArray5[this.anInt278] = local633.aStringArray10[local750] + " @lre@" + local633.aString25;
											if (local750 == 0) {
												this.anIntArray36[this.anInt278] = 139;
											}
											if (local750 == 1) {
												this.anIntArray36[this.anInt278] = 778;
											}
											if (local750 == 2) {
												this.anIntArray36[this.anInt278] = 617;
											}
											if (local750 == 3) {
												this.anIntArray36[this.anInt278] = 224;
											}
											if (local750 == 4) {
												this.anIntArray36[this.anInt278] = 662;
											}
											this.anIntArray37[this.anInt278] = local627.anInt179;
											this.anIntArray34[this.anInt278] = local62;
											this.anIntArray35[this.anInt278] = local68;
											this.anInt278++;
										} else if (local750 == 2) {
											this.aStringArray5[this.anInt278] = "Take @lre@" + local633.aString25;
											this.anIntArray36[this.anInt278] = 617;
											this.anIntArray37[this.anInt278] = local627.anInt179;
											this.anIntArray34[this.anInt278] = local62;
											this.anIntArray35[this.anInt278] = local68;
											this.anInt278++;
										}
									}
									this.aStringArray5[this.anInt278] = "Examine @lre@" + local633.aString25;
									this.anIntArray36[this.anInt278] = 1152;
									this.anIntArray37[this.anInt278] = local627.anInt179;
									this.anIntArray34[this.anInt278] = local62;
									this.anIntArray35[this.anInt278] = local68;
									this.anInt278++;
								} else if ((this.anInt408 & 0x1) == 1) {
									this.aStringArray5[this.anInt278] = this.aString15 + " @lre@" + local633.aString25;
									this.anIntArray36[this.anInt278] = 370;
									this.anIntArray37[this.anInt278] = local627.anInt179;
									this.anIntArray34[this.anInt278] = local62;
									this.anIntArray35[this.anInt278] = local68;
									this.anInt278++;
								}
							}
						}
					}
				}
			}
		} catch (@Pc(957) RuntimeException local957) {
			signlink.reporterror("35812, " + 492 + ", " + local957.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "o", descriptor = "(Z)I")
	private int method227() {
		try {
			@Pc(3) int local3 = 3;
			if (this.anInt254 < 310) {
				@Pc(21) int local21 = this.anInt251 >> 7;
				@Pc(26) int local26 = this.anInt253 >> 7;
				@Pc(31) int local31 = aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt981 >> 7;
				@Pc(36) int local36 = aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt982 >> 7;
				if ((this.aByteArrayArrayArray7[this.anInt361][local21][local26] & 0x4) != 0) {
					local3 = this.anInt361;
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
						if ((this.aByteArrayArrayArray7[this.anInt361][local21][local26] & 0x4) != 0) {
							local3 = this.anInt361;
						}
						local88 += local86;
						if (local88 >= 65536) {
							local88 -= 65536;
							if (local26 < local36) {
								local26++;
							} else if (local26 > local36) {
								local26--;
							}
							if ((this.aByteArrayArrayArray7[this.anInt361][local21][local26] & 0x4) != 0) {
								local3 = this.anInt361;
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
						if ((this.aByteArrayArrayArray7[this.anInt361][local21][local26] & 0x4) != 0) {
							local3 = this.anInt361;
						}
						local88 += local86;
						if (local88 >= 65536) {
							local88 -= 65536;
							if (local21 < local31) {
								local21++;
							} else if (local21 > local31) {
								local21--;
							}
							if ((this.aByteArrayArrayArray7[this.anInt361][local21][local26] & 0x4) != 0) {
								local3 = this.anInt361;
							}
						}
					}
				}
			}
			if ((this.aByteArrayArrayArray7[this.anInt361][aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt981 >> 7][aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt982 >> 7] & 0x4) != 0) {
				local3 = this.anInt361;
			}
			return local3;
		} catch (@Pc(253) RuntimeException local253) {
			signlink.reporterror("20846, " + false + ", " + local253.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "s", descriptor = "(B)I")
	private int method228() {
		try {
			@Pc(10) int local10 = this.method181(this.aByte10, this.anInt361, this.anInt251, this.anInt253);
			return local10 - this.anInt252 >= 800 || (this.aByteArrayArrayArray7[this.anInt361][this.anInt251 >> 7][this.anInt253 >> 7] & 0x4) == 0 ? 3 : this.anInt361;
		} catch (@Pc(48) RuntimeException local48) {
			signlink.reporterror("9665, " + 1 + ", " + local48.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(B)V")
	@Override
	protected void method90() {
		try {
			if (!this.aBoolean63 && !this.aBoolean48 && !this.aBoolean56) {
				anInt223++;
				if (this.aByte8 != 23) {
					for (@Pc(21) int local21 = 1; local21 > 0; local21++) {
					}
				}
				if (this.aBoolean80) {
					this.method166(this.anInt373);
				} else {
					this.method175(80);
				}
				this.method120();
			}
		} catch (@Pc(43) RuntimeException local43) {
			signlink.reporterror("65366, " + 23 + ", " + local43.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "H", descriptor = "(I)V")
	private void method229() {
		try {
			if (this.anInt232 == 2) {
				for (@Pc(17) Class1_Sub2 local17 = (Class1_Sub2) this.aClass29_1.method511(); local17 != null; local17 = (Class1_Sub2) this.aClass29_1.method513()) {
					if (local17.anInt789 > 0) {
						local17.anInt789--;
					}
					if (local17.anInt789 != 0) {
						if (local17.anInt788 > 0) {
							local17.anInt788--;
						}
						if (local17.anInt788 == 0 && local17.anInt780 >= 1 && local17.anInt781 >= 1 && local17.anInt780 <= 102 && local17.anInt781 <= 102 && (local17.anInt785 < 0 || Class4.method72(local17.anInt787, local17.anInt785))) {
							this.method174(local17.anInt785, local17.anInt778, local17.anInt780, local17.anInt781, local17.anInt779, local17.anInt787, local17.anInt786);
							local17.anInt788 = -1;
							if (local17.anInt785 == local17.anInt782 && local17.anInt782 == -1) {
								local17.method673();
							} else if (local17.anInt785 == local17.anInt782 && local17.anInt786 == local17.anInt783 && local17.anInt787 == local17.anInt784) {
								local17.method673();
							}
						}
					} else if (local17.anInt782 < 0 || Class4.method72(local17.anInt784, local17.anInt782)) {
						this.method174(local17.anInt782, local17.anInt778, local17.anInt780, local17.anInt781, local17.anInt779, local17.anInt784, local17.anInt783);
						local17.method673();
					}
				}
			}
		} catch (@Pc(160) RuntimeException local160) {
			signlink.reporterror("90193, " + 0 + ", " + local160.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "t", descriptor = "(B)V")
	private void method230() {
		try {
			@Pc(3) int local3 = 5;
			this.anIntArray50[8] = 0;
			@Pc(10) int local10 = 0;
			while (this.anIntArray50[8] == 0) {
				@Pc(16) String local16 = "Unknown problem";
				this.method96("Connecting to web server", 20);
				try {
					@Pc(38) DataInputStream local38 = this.method116("crc" + (int) (Math.random() * 9.9999999E7D) + "-" + 303);
					@Pc(45) Class1_Sub1_Sub3 local45 = new Class1_Sub1_Sub3(new byte[40], 58);
					local38.readFully(local45.aByteArray9, 0, 40);
					local38.close();
					for (@Pc(55) int local55 = 0; local55 < 9; local55++) {
						this.anIntArray50[local55] = local45.method485();
					}
					@Pc(70) int local70 = local45.method485();
					@Pc(72) int local72 = 1234;
					for (@Pc(74) int local74 = 0; local74 < 9; local74++) {
						local72 = (local72 << 1) + this.anIntArray50[local74];
					}
					if (local70 != local72) {
						local16 = "checksum problem";
						this.anIntArray50[8] = 0;
					}
				} catch (@Pc(101) EOFException local101) {
					local16 = "EOF problem";
					this.anIntArray50[8] = 0;
				} catch (@Pc(110) IOException local110) {
					local16 = "connection problem";
					this.anIntArray50[8] = 0;
				} catch (@Pc(119) Exception local119) {
					local16 = "logic problem";
					this.anIntArray50[8] = 0;
					if (!signlink.reporterror) {
						return;
					}
				}
				if (this.anIntArray50[8] == 0) {
					local10++;
					for (@Pc(137) int local137 = local3; local137 > 0; local137--) {
						if (local10 >= 10) {
							this.method96("Game updated - please reload page", 10);
							local137 = 10;
						} else {
							this.method96(local16 + " - Will retry in " + local137 + " secs.", 10);
						}
						try {
							Thread.sleep(1000L);
						} catch (@Pc(171) Exception local171) {
						}
					}
					local3 *= 2;
					if (local3 > 60) {
						local3 = 60;
					}
					this.aBoolean57 = !this.aBoolean57;
				}
			}
		} catch (@Pc(199) RuntimeException local199) {
			signlink.reporterror("31385, " + 51 + ", " + local199.toString());
			throw new RuntimeException();
		}
	}
}
