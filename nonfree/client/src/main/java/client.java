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

	@OriginalMember(owner = "client!client", name = "N", descriptor = "I")
	private static int anInt209;

	@OriginalMember(owner = "client!client", name = "Q", descriptor = "I")
	private static int anInt212;

	@OriginalMember(owner = "client!client", name = "ab", descriptor = "I")
	private static int anInt218;

	@OriginalMember(owner = "client!client", name = "hb", descriptor = "I")
	private static int anInt222;

	@OriginalMember(owner = "client!client", name = "ib", descriptor = "I")
	private static int anInt223;

	@OriginalMember(owner = "client!client", name = "yb", descriptor = "Z")
	private static boolean aBoolean47;

	@OriginalMember(owner = "client!client", name = "zb", descriptor = "Z")
	private static boolean aBoolean48;

	@OriginalMember(owner = "client!client", name = "Ab", descriptor = "I")
	private static int anInt232;

	@OriginalMember(owner = "client!client", name = "Ib", descriptor = "I")
	private static int anInt235;

	@OriginalMember(owner = "client!client", name = "Zb", descriptor = "I")
	private static int anInt244;

	@OriginalMember(owner = "client!client", name = "dc", descriptor = "I")
	private static int anInt248;

	@OriginalMember(owner = "client!client", name = "ic", descriptor = "I")
	private static int anInt253;

	@OriginalMember(owner = "client!client", name = "bd", descriptor = "I")
	private static int anInt267;

	@OriginalMember(owner = "client!client", name = "md", descriptor = "I")
	private static int anInt273;

	@OriginalMember(owner = "client!client", name = "wd", descriptor = "I")
	private static int anInt279;

	@OriginalMember(owner = "client!client", name = "xd", descriptor = "Lclient!ab;")
	public static Class1_Sub1_Sub1_Sub1_Sub1 aClass1_Sub1_Sub1_Sub1_Sub1_1;

	@OriginalMember(owner = "client!client", name = "de", descriptor = "I")
	public static int anInt297;

	@OriginalMember(owner = "client!client", name = "uf", descriptor = "I")
	private static int anInt329;

	@OriginalMember(owner = "client!client", name = "Tf", descriptor = "Z")
	private static boolean aBoolean68;

	@OriginalMember(owner = "client!client", name = "Uf", descriptor = "Z")
	private static boolean aBoolean69;

	@OriginalMember(owner = "client!client", name = "hg", descriptor = "I")
	private static int anInt346;

	@OriginalMember(owner = "client!client", name = "jg", descriptor = "I")
	public static int anInt348;

	@OriginalMember(owner = "client!client", name = "lg", descriptor = "Z")
	private static boolean aBoolean71;

	@OriginalMember(owner = "client!client", name = "mg", descriptor = "I")
	private static int anInt349;

	@OriginalMember(owner = "client!client", name = "Lg", descriptor = "I")
	private static int anInt366;

	@OriginalMember(owner = "client!client", name = "ph", descriptor = "I")
	private static int anInt379;

	@OriginalMember(owner = "client!client", name = "Gh", descriptor = "I")
	private static int anInt389;

	@OriginalMember(owner = "client!client", name = "O", descriptor = "I")
	private static int anInt210 = 4;

	@OriginalMember(owner = "client!client", name = "Ub", descriptor = "Ljava/math/BigInteger;")
	private static BigInteger aBigInteger1 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");

	@OriginalMember(owner = "client!client", name = "Vc", descriptor = "[[I")
	public static final int[][] anIntArrayArray3 = new int[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, 33697, 22433, 2983, 54193 }, { 8741, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003, 25239 }, { 25238, 8742, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };

	@OriginalMember(owner = "client!client", name = "Yc", descriptor = "[I")
	public static int[] anIntArray48 = new int[32];

	@OriginalMember(owner = "client!client", name = "Ld", descriptor = "I")
	private static int anInt285;

	@OriginalMember(owner = "client!client", name = "fe", descriptor = "I")
	private static int anInt298;

	@OriginalMember(owner = "client!client", name = "Ce", descriptor = "[I")
	public static final int[] anIntArray58;

	@OriginalMember(owner = "client!client", name = "Pe", descriptor = "I")
	private static int anInt309;

	@OriginalMember(owner = "client!client", name = "Zf", descriptor = "[I")
	private static int[] anIntArray70;

	@OriginalMember(owner = "client!client", name = "ig", descriptor = "I")
	private static int anInt347;

	@OriginalMember(owner = "client!client", name = "kg", descriptor = "Z")
	private static boolean aBoolean70;

	@OriginalMember(owner = "client!client", name = "Mh", descriptor = "I")
	private static int anInt395;

	@OriginalMember(owner = "client!client", name = "di", descriptor = "Ljava/math/BigInteger;")
	private static BigInteger aBigInteger2;

	@OriginalMember(owner = "client!client", name = "Gi", descriptor = "Ljava/lang/String;")
	private static String aString14;

	@OriginalMember(owner = "client!client", name = "M", descriptor = "I")
	private int anInt208;

	@OriginalMember(owner = "client!client", name = "P", descriptor = "I")
	private int anInt211;

	@OriginalMember(owner = "client!client", name = "S", descriptor = "J")
	private long aLong14;

	@OriginalMember(owner = "client!client", name = "T", descriptor = "I")
	private int anInt213;

	@OriginalMember(owner = "client!client", name = "X", descriptor = "I")
	private int anInt216;

	@OriginalMember(owner = "client!client", name = "bb", descriptor = "I")
	private int anInt219;

	@OriginalMember(owner = "client!client", name = "cb", descriptor = "I")
	private int anInt220;

	@OriginalMember(owner = "client!client", name = "db", descriptor = "I")
	private int anInt221;

	@OriginalMember(owner = "client!client", name = "gb", descriptor = "Lclient!e;")
	private Class8 aClass8_1;

	@OriginalMember(owner = "client!client", name = "kb", descriptor = "I")
	private int anInt224;

	@OriginalMember(owner = "client!client", name = "mb", descriptor = "I")
	private int anInt225;

	@OriginalMember(owner = "client!client", name = "nb", descriptor = "I")
	private int anInt226;

	@OriginalMember(owner = "client!client", name = "qb", descriptor = "I")
	private int anInt227;

	@OriginalMember(owner = "client!client", name = "rb", descriptor = "I")
	private int anInt228;

	@OriginalMember(owner = "client!client", name = "sb", descriptor = "I")
	private int anInt229;

	@OriginalMember(owner = "client!client", name = "tb", descriptor = "I")
	private int anInt230;

	@OriginalMember(owner = "client!client", name = "ub", descriptor = "Ljava/lang/String;")
	private String aString5;

	@OriginalMember(owner = "client!client", name = "vb", descriptor = "I")
	private int anInt231;

	@OriginalMember(owner = "client!client", name = "wb", descriptor = "[I")
	private int[] anIntArray34;

	@OriginalMember(owner = "client!client", name = "xb", descriptor = "[I")
	private int[] anIntArray35;

	@OriginalMember(owner = "client!client", name = "Cb", descriptor = "Lclient!qb;")
	private Class35 aClass35_3;

	@OriginalMember(owner = "client!client", name = "Db", descriptor = "Lclient!qb;")
	private Class35 aClass35_4;

	@OriginalMember(owner = "client!client", name = "Eb", descriptor = "Lclient!qb;")
	private Class35 aClass35_5;

	@OriginalMember(owner = "client!client", name = "Fb", descriptor = "Lclient!qb;")
	private Class35 aClass35_6;

	@OriginalMember(owner = "client!client", name = "Gb", descriptor = "I")
	private int anInt233;

	@OriginalMember(owner = "client!client", name = "Hb", descriptor = "I")
	private int anInt234;

	@OriginalMember(owner = "client!client", name = "Jb", descriptor = "I")
	private int anInt236;

	@OriginalMember(owner = "client!client", name = "Kb", descriptor = "I")
	private int anInt237;

	@OriginalMember(owner = "client!client", name = "Pb", descriptor = "I")
	private int anInt238;

	@OriginalMember(owner = "client!client", name = "Qb", descriptor = "I")
	private int anInt239;

	@OriginalMember(owner = "client!client", name = "Rb", descriptor = "I")
	private int anInt240;

	@OriginalMember(owner = "client!client", name = "Sb", descriptor = "I")
	private int anInt241;

	@OriginalMember(owner = "client!client", name = "Tb", descriptor = "I")
	private int anInt242;

	@OriginalMember(owner = "client!client", name = "Yb", descriptor = "Lclient!xb;")
	private Class47 aClass47_1;

	@OriginalMember(owner = "client!client", name = "bc", descriptor = "I")
	private int anInt246;

	@OriginalMember(owner = "client!client", name = "cc", descriptor = "I")
	private int anInt247;

	@OriginalMember(owner = "client!client", name = "ec", descriptor = "I")
	private int anInt249;

	@OriginalMember(owner = "client!client", name = "fc", descriptor = "I")
	private int anInt250;

	@OriginalMember(owner = "client!client", name = "gc", descriptor = "I")
	private int anInt251;

	@OriginalMember(owner = "client!client", name = "hc", descriptor = "I")
	private int anInt252;

	@OriginalMember(owner = "client!client", name = "jc", descriptor = "Lclient!ib;")
	private Class1_Sub1_Sub2_Sub2 aClass1_Sub1_Sub2_Sub2_1;

	@OriginalMember(owner = "client!client", name = "kc", descriptor = "Lclient!ib;")
	private Class1_Sub1_Sub2_Sub2 aClass1_Sub1_Sub2_Sub2_2;

	@OriginalMember(owner = "client!client", name = "lc", descriptor = "Lclient!ib;")
	private Class1_Sub1_Sub2_Sub2 aClass1_Sub1_Sub2_Sub2_3;

	@OriginalMember(owner = "client!client", name = "mc", descriptor = "Lclient!ib;")
	private Class1_Sub1_Sub2_Sub2 aClass1_Sub1_Sub2_Sub2_4;

	@OriginalMember(owner = "client!client", name = "nc", descriptor = "I")
	private int anInt254;

	@OriginalMember(owner = "client!client", name = "pc", descriptor = "[[[B")
	private byte[][][] aByteArrayArrayArray7;

	@OriginalMember(owner = "client!client", name = "rc", descriptor = "Lclient!ib;")
	private Class1_Sub1_Sub2_Sub2 aClass1_Sub1_Sub2_Sub2_5;

	@OriginalMember(owner = "client!client", name = "sc", descriptor = "I")
	private int anInt256;

	@OriginalMember(owner = "client!client", name = "tc", descriptor = "I")
	private int anInt257;

	@OriginalMember(owner = "client!client", name = "uc", descriptor = "I")
	private int anInt258;

	@OriginalMember(owner = "client!client", name = "vc", descriptor = "Lclient!jb;")
	private Class1_Sub1_Sub2_Sub3 aClass1_Sub1_Sub2_Sub3_1;

	@OriginalMember(owner = "client!client", name = "wc", descriptor = "Lclient!jb;")
	private Class1_Sub1_Sub2_Sub3 aClass1_Sub1_Sub2_Sub3_2;

	@OriginalMember(owner = "client!client", name = "xc", descriptor = "Lclient!jb;")
	private Class1_Sub1_Sub2_Sub3 aClass1_Sub1_Sub2_Sub3_3;

	@OriginalMember(owner = "client!client", name = "yc", descriptor = "[[B")
	private byte[][] aByteArrayArray1;

	@OriginalMember(owner = "client!client", name = "Cc", descriptor = "[I")
	private int[] anIntArray43;

	@OriginalMember(owner = "client!client", name = "Dc", descriptor = "[I")
	private int[] anIntArray44;

	@OriginalMember(owner = "client!client", name = "Ec", descriptor = "[I")
	private int[] anIntArray45;

	@OriginalMember(owner = "client!client", name = "Fc", descriptor = "I")
	private int anInt259;

	@OriginalMember(owner = "client!client", name = "Gc", descriptor = "I")
	private int anInt260;

	@OriginalMember(owner = "client!client", name = "Mc", descriptor = "I")
	private int anInt262;

	@OriginalMember(owner = "client!client", name = "Xc", descriptor = "I")
	private int anInt266;

	@OriginalMember(owner = "client!client", name = "cd", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray5;

	@OriginalMember(owner = "client!client", name = "fd", descriptor = "I")
	private int anInt268;

	@OriginalMember(owner = "client!client", name = "gd", descriptor = "I")
	private int anInt269;

	@OriginalMember(owner = "client!client", name = "nd", descriptor = "I")
	private int anInt274;

	@OriginalMember(owner = "client!client", name = "od", descriptor = "I")
	private int anInt275;

	@OriginalMember(owner = "client!client", name = "pd", descriptor = "I")
	private int anInt276;

	@OriginalMember(owner = "client!client", name = "qd", descriptor = "Lclient!ib;")
	private Class1_Sub1_Sub2_Sub2 aClass1_Sub1_Sub2_Sub2_6;

	@OriginalMember(owner = "client!client", name = "sd", descriptor = "[[B")
	private byte[][] aByteArrayArray2;

	@OriginalMember(owner = "client!client", name = "ud", descriptor = "I")
	private int anInt277;

	@OriginalMember(owner = "client!client", name = "vd", descriptor = "I")
	private int anInt278;

	@OriginalMember(owner = "client!client", name = "zd", descriptor = "Lclient!jb;")
	private Class1_Sub1_Sub2_Sub3 aClass1_Sub1_Sub2_Sub3_4;

	@OriginalMember(owner = "client!client", name = "Ad", descriptor = "Lclient!jb;")
	private Class1_Sub1_Sub2_Sub3 aClass1_Sub1_Sub2_Sub3_5;

	@OriginalMember(owner = "client!client", name = "Bd", descriptor = "Lclient!jb;")
	private Class1_Sub1_Sub2_Sub3 aClass1_Sub1_Sub2_Sub3_6;

	@OriginalMember(owner = "client!client", name = "Dd", descriptor = "I")
	private int anInt280;

	@OriginalMember(owner = "client!client", name = "Ed", descriptor = "I")
	private int anInt281;

	@OriginalMember(owner = "client!client", name = "Fd", descriptor = "I")
	private int anInt282;

	@OriginalMember(owner = "client!client", name = "Gd", descriptor = "I")
	private int anInt283;

	@OriginalMember(owner = "client!client", name = "Nd", descriptor = "[I")
	private int[] anIntArray51;

	@OriginalMember(owner = "client!client", name = "Od", descriptor = "[I")
	private int[] anIntArray52;

	@OriginalMember(owner = "client!client", name = "Pd", descriptor = "[I")
	private int[] anIntArray53;

	@OriginalMember(owner = "client!client", name = "Qd", descriptor = "[I")
	private int[] anIntArray54;

	@OriginalMember(owner = "client!client", name = "Rd", descriptor = "I")
	private int anInt286;

	@OriginalMember(owner = "client!client", name = "Sd", descriptor = "I")
	private int anInt287;

	@OriginalMember(owner = "client!client", name = "Td", descriptor = "I")
	private int anInt288;

	@OriginalMember(owner = "client!client", name = "Ud", descriptor = "I")
	private int anInt289;

	@OriginalMember(owner = "client!client", name = "Vd", descriptor = "I")
	private int anInt290;

	@OriginalMember(owner = "client!client", name = "Wd", descriptor = "I")
	private int anInt291;

	@OriginalMember(owner = "client!client", name = "Xd", descriptor = "I")
	private int anInt292;

	@OriginalMember(owner = "client!client", name = "be", descriptor = "I")
	private int anInt295;

	@OriginalMember(owner = "client!client", name = "ce", descriptor = "I")
	private int anInt296;

	@OriginalMember(owner = "client!client", name = "ke", descriptor = "Lclient!wb;")
	private Class46 aClass46_1;

	@OriginalMember(owner = "client!client", name = "me", descriptor = "Lclient!ib;")
	private Class1_Sub1_Sub2_Sub2 aClass1_Sub1_Sub2_Sub2_7;

	@OriginalMember(owner = "client!client", name = "oe", descriptor = "I")
	private int anInt299;

	@OriginalMember(owner = "client!client", name = "pe", descriptor = "Lclient!jb;")
	private Class1_Sub1_Sub2_Sub3 aClass1_Sub1_Sub2_Sub3_7;

	@OriginalMember(owner = "client!client", name = "qe", descriptor = "Lclient!jb;")
	private Class1_Sub1_Sub2_Sub3 aClass1_Sub1_Sub2_Sub3_8;

	@OriginalMember(owner = "client!client", name = "re", descriptor = "Lclient!jb;")
	private Class1_Sub1_Sub2_Sub3 aClass1_Sub1_Sub2_Sub3_9;

	@OriginalMember(owner = "client!client", name = "se", descriptor = "Lclient!jb;")
	private Class1_Sub1_Sub2_Sub3 aClass1_Sub1_Sub2_Sub3_10;

	@OriginalMember(owner = "client!client", name = "te", descriptor = "Lclient!jb;")
	private Class1_Sub1_Sub2_Sub3 aClass1_Sub1_Sub2_Sub3_11;

	@OriginalMember(owner = "client!client", name = "xe", descriptor = "I")
	private int anInt300;

	@OriginalMember(owner = "client!client", name = "Be", descriptor = "I")
	private int anInt303;

	@OriginalMember(owner = "client!client", name = "Ee", descriptor = "I")
	private int anInt304;

	@OriginalMember(owner = "client!client", name = "Fe", descriptor = "I")
	private int anInt305;

	@OriginalMember(owner = "client!client", name = "Je", descriptor = "I")
	private int anInt307;

	@OriginalMember(owner = "client!client", name = "Oe", descriptor = "I")
	private int anInt308;

	@OriginalMember(owner = "client!client", name = "Qe", descriptor = "Lclient!jb;")
	private Class1_Sub1_Sub2_Sub3 aClass1_Sub1_Sub2_Sub3_12;

	@OriginalMember(owner = "client!client", name = "Re", descriptor = "Lclient!jb;")
	private Class1_Sub1_Sub2_Sub3 aClass1_Sub1_Sub2_Sub3_13;

	@OriginalMember(owner = "client!client", name = "Te", descriptor = "I")
	private int anInt310;

	@OriginalMember(owner = "client!client", name = "Ue", descriptor = "I")
	private int anInt311;

	@OriginalMember(owner = "client!client", name = "Ve", descriptor = "I")
	private int anInt312;

	@OriginalMember(owner = "client!client", name = "We", descriptor = "I")
	private int anInt313;

	@OriginalMember(owner = "client!client", name = "Xe", descriptor = "I")
	private int anInt314;

	@OriginalMember(owner = "client!client", name = "Ze", descriptor = "I")
	private int anInt316;

	@OriginalMember(owner = "client!client", name = "ef", descriptor = "I")
	private int anInt317;

	@OriginalMember(owner = "client!client", name = "hf", descriptor = "I")
	private int anInt320;

	@OriginalMember(owner = "client!client", name = "kf", descriptor = "I")
	private int anInt322;

	@OriginalMember(owner = "client!client", name = "mf", descriptor = "I")
	private int anInt323;

	@OriginalMember(owner = "client!client", name = "nf", descriptor = "I")
	private int anInt324;

	@OriginalMember(owner = "client!client", name = "of", descriptor = "I")
	private int anInt325;

	@OriginalMember(owner = "client!client", name = "pf", descriptor = "I")
	private int anInt326;

	@OriginalMember(owner = "client!client", name = "qf", descriptor = "I")
	private int anInt327;

	@OriginalMember(owner = "client!client", name = "rf", descriptor = "I")
	private int anInt328;

	@OriginalMember(owner = "client!client", name = "sf", descriptor = "[I")
	private int[] anIntArray61;

	@OriginalMember(owner = "client!client", name = "tf", descriptor = "[I")
	private int[] anIntArray62;

	@OriginalMember(owner = "client!client", name = "Bf", descriptor = "I")
	private int anInt332;

	@OriginalMember(owner = "client!client", name = "Df", descriptor = "I")
	private int anInt333;

	@OriginalMember(owner = "client!client", name = "If", descriptor = "I")
	private int anInt335;

	@OriginalMember(owner = "client!client", name = "Jf", descriptor = "I")
	private int anInt336;

	@OriginalMember(owner = "client!client", name = "Nf", descriptor = "Lclient!ib;")
	private Class1_Sub1_Sub2_Sub2 aClass1_Sub1_Sub2_Sub2_8;

	@OriginalMember(owner = "client!client", name = "Of", descriptor = "Lclient!ib;")
	private Class1_Sub1_Sub2_Sub2 aClass1_Sub1_Sub2_Sub2_9;

	@OriginalMember(owner = "client!client", name = "Qf", descriptor = "I")
	private int anInt337;

	@OriginalMember(owner = "client!client", name = "Rf", descriptor = "I")
	private int anInt338;

	@OriginalMember(owner = "client!client", name = "Sf", descriptor = "I")
	private int anInt339;

	@OriginalMember(owner = "client!client", name = "Xf", descriptor = "Lclient!jb;")
	private Class1_Sub1_Sub2_Sub3 aClass1_Sub1_Sub2_Sub3_14;

	@OriginalMember(owner = "client!client", name = "Yf", descriptor = "Lclient!jb;")
	private Class1_Sub1_Sub2_Sub3 aClass1_Sub1_Sub2_Sub3_15;

	@OriginalMember(owner = "client!client", name = "bg", descriptor = "I")
	private int anInt341;

	@OriginalMember(owner = "client!client", name = "dg", descriptor = "Ljava/net/Socket;")
	private Socket aSocket1;

	@OriginalMember(owner = "client!client", name = "eg", descriptor = "I")
	private int anInt343;

	@OriginalMember(owner = "client!client", name = "fg", descriptor = "I")
	private int anInt344;

	@OriginalMember(owner = "client!client", name = "gg", descriptor = "I")
	private int anInt345;

	@OriginalMember(owner = "client!client", name = "qg", descriptor = "I")
	private int anInt350;

	@OriginalMember(owner = "client!client", name = "rg", descriptor = "I")
	private int anInt351;

	@OriginalMember(owner = "client!client", name = "tg", descriptor = "I")
	private int anInt353;

	@OriginalMember(owner = "client!client", name = "ug", descriptor = "I")
	private int anInt354;

	@OriginalMember(owner = "client!client", name = "yg", descriptor = "I")
	private int anInt357;

	@OriginalMember(owner = "client!client", name = "Bg", descriptor = "Lclient!ub;")
	private Class44_Sub1 aClass44_Sub1_1;

	@OriginalMember(owner = "client!client", name = "Dg", descriptor = "I")
	private int anInt359;

	@OriginalMember(owner = "client!client", name = "Eg", descriptor = "I")
	private int anInt360;

	@OriginalMember(owner = "client!client", name = "Fg", descriptor = "I")
	private int anInt361;

	@OriginalMember(owner = "client!client", name = "Gg", descriptor = "I")
	private int anInt362;

	@OriginalMember(owner = "client!client", name = "Hg", descriptor = "I")
	private int anInt363;

	@OriginalMember(owner = "client!client", name = "Ig", descriptor = "I")
	private int anInt364;

	@OriginalMember(owner = "client!client", name = "Jg", descriptor = "I")
	private int anInt365;

	@OriginalMember(owner = "client!client", name = "Kg", descriptor = "J")
	private long aLong15;

	@OriginalMember(owner = "client!client", name = "Mg", descriptor = "I")
	private int anInt367;

	@OriginalMember(owner = "client!client", name = "Ng", descriptor = "Lclient!ib;")
	private Class1_Sub1_Sub2_Sub2 aClass1_Sub1_Sub2_Sub2_10;

	@OriginalMember(owner = "client!client", name = "Og", descriptor = "Lclient!ib;")
	private Class1_Sub1_Sub2_Sub2 aClass1_Sub1_Sub2_Sub2_11;

	@OriginalMember(owner = "client!client", name = "Qg", descriptor = "I")
	private int anInt368;

	@OriginalMember(owner = "client!client", name = "Rg", descriptor = "I")
	private int anInt369;

	@OriginalMember(owner = "client!client", name = "Sg", descriptor = "I")
	private int anInt370;

	@OriginalMember(owner = "client!client", name = "Tg", descriptor = "I")
	private int anInt371;

	@OriginalMember(owner = "client!client", name = "Ug", descriptor = "I")
	private int anInt372;

	@OriginalMember(owner = "client!client", name = "Yg", descriptor = "I")
	private int anInt373;

	@OriginalMember(owner = "client!client", name = "ah", descriptor = "I")
	private int anInt374;

	@OriginalMember(owner = "client!client", name = "fh", descriptor = "[Lclient!jb;")
	private Class1_Sub1_Sub2_Sub3[] aClass1_Sub1_Sub2_Sub3Array3;

	@OriginalMember(owner = "client!client", name = "gh", descriptor = "Lclient!ib;")
	private Class1_Sub1_Sub2_Sub2 aClass1_Sub1_Sub2_Sub2_12;

	@OriginalMember(owner = "client!client", name = "hh", descriptor = "Lclient!ib;")
	private Class1_Sub1_Sub2_Sub2 aClass1_Sub1_Sub2_Sub2_13;

	@OriginalMember(owner = "client!client", name = "kh", descriptor = "Lclient!qb;")
	private Class35 aClass35_7;

	@OriginalMember(owner = "client!client", name = "lh", descriptor = "Lclient!qb;")
	private Class35 aClass35_8;

	@OriginalMember(owner = "client!client", name = "mh", descriptor = "Lclient!qb;")
	private Class35 aClass35_9;

	@OriginalMember(owner = "client!client", name = "nh", descriptor = "I")
	private int anInt377;

	@OriginalMember(owner = "client!client", name = "qh", descriptor = "Lclient!jb;")
	private Class1_Sub1_Sub2_Sub3 aClass1_Sub1_Sub2_Sub3_16;

	@OriginalMember(owner = "client!client", name = "rh", descriptor = "Lclient!jb;")
	private Class1_Sub1_Sub2_Sub3 aClass1_Sub1_Sub2_Sub3_17;

	@OriginalMember(owner = "client!client", name = "sh", descriptor = "Lclient!jb;")
	private Class1_Sub1_Sub2_Sub3 aClass1_Sub1_Sub2_Sub3_18;

	@OriginalMember(owner = "client!client", name = "th", descriptor = "Lclient!jb;")
	private Class1_Sub1_Sub2_Sub3 aClass1_Sub1_Sub2_Sub3_19;

	@OriginalMember(owner = "client!client", name = "uh", descriptor = "Lclient!jb;")
	private Class1_Sub1_Sub2_Sub3 aClass1_Sub1_Sub2_Sub3_20;

	@OriginalMember(owner = "client!client", name = "wh", descriptor = "I")
	private int anInt380;

	@OriginalMember(owner = "client!client", name = "yh", descriptor = "I")
	private int anInt381;

	@OriginalMember(owner = "client!client", name = "zh", descriptor = "I")
	private int anInt382;

	@OriginalMember(owner = "client!client", name = "Ah", descriptor = "I")
	private int anInt383;

	@OriginalMember(owner = "client!client", name = "Bh", descriptor = "I")
	private int anInt384;

	@OriginalMember(owner = "client!client", name = "Ch", descriptor = "I")
	private int anInt385;

	@OriginalMember(owner = "client!client", name = "Hh", descriptor = "I")
	private int anInt390;

	@OriginalMember(owner = "client!client", name = "Jh", descriptor = "I")
	private int anInt392;

	@OriginalMember(owner = "client!client", name = "Kh", descriptor = "I")
	private int anInt393;

	@OriginalMember(owner = "client!client", name = "Lh", descriptor = "I")
	private int anInt394;

	@OriginalMember(owner = "client!client", name = "Rh", descriptor = "I")
	private int anInt396;

	@OriginalMember(owner = "client!client", name = "fi", descriptor = "I")
	private int anInt399;

	@OriginalMember(owner = "client!client", name = "ji", descriptor = "Lclient!r;")
	private Class37 aClass37_1;

	@OriginalMember(owner = "client!client", name = "ki", descriptor = "[I")
	private int[] anIntArray86;

	@OriginalMember(owner = "client!client", name = "li", descriptor = "[I")
	private int[] anIntArray87;

	@OriginalMember(owner = "client!client", name = "mi", descriptor = "[I")
	private int[] anIntArray88;

	@OriginalMember(owner = "client!client", name = "pi", descriptor = "J")
	private long aLong16;

	@OriginalMember(owner = "client!client", name = "qi", descriptor = "I")
	private int anInt402;

	@OriginalMember(owner = "client!client", name = "ri", descriptor = "I")
	private int anInt403;

	@OriginalMember(owner = "client!client", name = "si", descriptor = "I")
	private int anInt404;

	@OriginalMember(owner = "client!client", name = "ti", descriptor = "I")
	private int anInt405;

	@OriginalMember(owner = "client!client", name = "ui", descriptor = "I")
	private int anInt406;

	@OriginalMember(owner = "client!client", name = "xi", descriptor = "I")
	private int anInt407;

	@OriginalMember(owner = "client!client", name = "Bi", descriptor = "I")
	private int anInt409;

	@OriginalMember(owner = "client!client", name = "Ci", descriptor = "I")
	private int anInt410;

	@OriginalMember(owner = "client!client", name = "Ei", descriptor = "I")
	private int anInt411;

	@OriginalMember(owner = "client!client", name = "Hi", descriptor = "I")
	private int anInt413;

	@OriginalMember(owner = "client!client", name = "Ji", descriptor = "I")
	private int anInt414;

	@OriginalMember(owner = "client!client", name = "Ki", descriptor = "I")
	private int anInt415;

	@OriginalMember(owner = "client!client", name = "Li", descriptor = "I")
	private int anInt416;

	@OriginalMember(owner = "client!client", name = "Mi", descriptor = "I")
	private int anInt417;

	@OriginalMember(owner = "client!client", name = "Ni", descriptor = "I")
	private int anInt418;

	@OriginalMember(owner = "client!client", name = "Pi", descriptor = "I")
	private int anInt419;

	@OriginalMember(owner = "client!client", name = "Qi", descriptor = "Lclient!qb;")
	private Class35 aClass35_10;

	@OriginalMember(owner = "client!client", name = "Ri", descriptor = "Lclient!qb;")
	private Class35 aClass35_11;

	@OriginalMember(owner = "client!client", name = "Si", descriptor = "Lclient!qb;")
	private Class35 aClass35_12;

	@OriginalMember(owner = "client!client", name = "Ti", descriptor = "Lclient!qb;")
	private Class35 aClass35_13;

	@OriginalMember(owner = "client!client", name = "Ui", descriptor = "Lclient!qb;")
	private Class35 aClass35_14;

	@OriginalMember(owner = "client!client", name = "Vi", descriptor = "Lclient!qb;")
	private Class35 aClass35_15;

	@OriginalMember(owner = "client!client", name = "Wi", descriptor = "Lclient!qb;")
	private Class35 aClass35_16;

	@OriginalMember(owner = "client!client", name = "Xi", descriptor = "Lclient!qb;")
	private Class35 aClass35_17;

	@OriginalMember(owner = "client!client", name = "Yi", descriptor = "Lclient!qb;")
	private Class35 aClass35_18;

	@OriginalMember(owner = "client!client", name = "Zi", descriptor = "I")
	private int anInt420;

	@OriginalMember(owner = "client!client", name = "bj", descriptor = "I")
	private int anInt421;

	@OriginalMember(owner = "client!client", name = "cj", descriptor = "J")
	private long aLong17;

	@OriginalMember(owner = "client!client", name = "dj", descriptor = "I")
	private int anInt422;

	@OriginalMember(owner = "client!client", name = "fj", descriptor = "Lclient!qb;")
	private Class35 aClass35_19;

	@OriginalMember(owner = "client!client", name = "gj", descriptor = "Lclient!qb;")
	private Class35 aClass35_20;

	@OriginalMember(owner = "client!client", name = "hj", descriptor = "Lclient!qb;")
	private Class35 aClass35_21;

	@OriginalMember(owner = "client!client", name = "ij", descriptor = "Lclient!qb;")
	private Class35 aClass35_22;

	@OriginalMember(owner = "client!client", name = "jj", descriptor = "Lclient!qb;")
	private Class35 aClass35_23;

	@OriginalMember(owner = "client!client", name = "kj", descriptor = "Lclient!qb;")
	private Class35 aClass35_24;

	@OriginalMember(owner = "client!client", name = "lj", descriptor = "Lclient!qb;")
	private Class35 aClass35_25;

	@OriginalMember(owner = "client!client", name = "mj", descriptor = "Lclient!qb;")
	private Class35 aClass35_26;

	@OriginalMember(owner = "client!client", name = "nj", descriptor = "Lclient!qb;")
	private Class35 aClass35_27;

	@OriginalMember(owner = "client!client", name = "oj", descriptor = "Ljava/lang/String;")
	private String aString15;

	@OriginalMember(owner = "client!client", name = "qj", descriptor = "Lclient!kb;")
	private Class1_Sub1_Sub2_Sub4 aClass1_Sub1_Sub2_Sub4_1;

	@OriginalMember(owner = "client!client", name = "rj", descriptor = "Lclient!kb;")
	private Class1_Sub1_Sub2_Sub4 aClass1_Sub1_Sub2_Sub4_2;

	@OriginalMember(owner = "client!client", name = "sj", descriptor = "Lclient!kb;")
	private Class1_Sub1_Sub2_Sub4 aClass1_Sub1_Sub2_Sub4_3;

	@OriginalMember(owner = "client!client", name = "tj", descriptor = "Lclient!kb;")
	private Class1_Sub1_Sub2_Sub4 aClass1_Sub1_Sub2_Sub4_4;

	@OriginalMember(owner = "client!client", name = "Bj", descriptor = "I")
	private int anInt424;

	@OriginalMember(owner = "client!client", name = "Dj", descriptor = "J")
	private long aLong18;

	@OriginalMember(owner = "client!client", name = "Ej", descriptor = "I")
	private int anInt425;

	@OriginalMember(owner = "client!client", name = "Fj", descriptor = "I")
	private int anInt426;

	@OriginalMember(owner = "client!client", name = "Gj", descriptor = "I")
	private int anInt427;

	@OriginalMember(owner = "client!client", name = "Hj", descriptor = "Ljava/lang/String;")
	private String aString16;

	@OriginalMember(owner = "client!client", name = "Jj", descriptor = "Ljava/lang/String;")
	private String aString17;

	@OriginalMember(owner = "client!client", name = "Kj", descriptor = "Lclient!fc;")
	private Class11 aClass11_1;

	@OriginalMember(owner = "client!client", name = "R", descriptor = "Z")
	private boolean aBoolean43 = false;

	@OriginalMember(owner = "client!client", name = "U", descriptor = "[I")
	private int[] anIntArray32 = new int[Class30.anInt812];

	@OriginalMember(owner = "client!client", name = "V", descriptor = "I")
	private int anInt214 = -1;

	@OriginalMember(owner = "client!client", name = "Y", descriptor = "[Lclient!vb;")
	public Class45[] aClass45Array1 = new Class45[5];

	@OriginalMember(owner = "client!client", name = "Z", descriptor = "I")
	private int anInt217 = -1;

	@OriginalMember(owner = "client!client", name = "eb", descriptor = "Z")
	private boolean aBoolean44 = false;

	@OriginalMember(owner = "client!client", name = "fb", descriptor = "Ljava/lang/String;")
	private String aString4 = "";

	@OriginalMember(owner = "client!client", name = "jb", descriptor = "Z")
	private boolean aBoolean45 = false;

	@OriginalMember(owner = "client!client", name = "lb", descriptor = "Z")
	private boolean aBoolean46 = false;

	@OriginalMember(owner = "client!client", name = "ob", descriptor = "[Lclient!jb;")
	private Class1_Sub1_Sub2_Sub3[] aClass1_Sub1_Sub2_Sub3Array1 = new Class1_Sub1_Sub2_Sub3[100];

	@OriginalMember(owner = "client!client", name = "pb", descriptor = "[I")
	private int[] anIntArray33 = new int[151];

	@OriginalMember(owner = "client!client", name = "Bb", descriptor = "[I")
	private int[] anIntArray36 = new int[50];

	@OriginalMember(owner = "client!client", name = "Lb", descriptor = "[I")
	private int[] anIntArray37 = new int[500];

	@OriginalMember(owner = "client!client", name = "Mb", descriptor = "[I")
	private int[] anIntArray38 = new int[500];

	@OriginalMember(owner = "client!client", name = "Nb", descriptor = "[I")
	private int[] anIntArray39 = new int[500];

	@OriginalMember(owner = "client!client", name = "Ob", descriptor = "[I")
	private int[] anIntArray40 = new int[500];

	@OriginalMember(owner = "client!client", name = "Vb", descriptor = "Z")
	private boolean aBoolean49 = false;

	@OriginalMember(owner = "client!client", name = "Wb", descriptor = "[[[Lclient!ob;")
	private Class29[][][] aClass29ArrayArrayArray1 = new Class29[4][104][104];

	@OriginalMember(owner = "client!client", name = "Xb", descriptor = "I")
	private int anInt243 = -1;

	@OriginalMember(owner = "client!client", name = "ac", descriptor = "I")
	private int anInt245 = 5063219;

	@OriginalMember(owner = "client!client", name = "oc", descriptor = "[I")
	private int[] anIntArray41 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

	@OriginalMember(owner = "client!client", name = "qc", descriptor = "I")
	private int anInt255 = 328;

	@OriginalMember(owner = "client!client", name = "zc", descriptor = "Ljava/lang/String;")
	private String aString6 = "";

	@OriginalMember(owner = "client!client", name = "Ac", descriptor = "Ljava/lang/String;")
	private String aString7 = "";

	@OriginalMember(owner = "client!client", name = "Bc", descriptor = "[I")
	private int[] anIntArray42 = new int[50];

	@OriginalMember(owner = "client!client", name = "Hc", descriptor = "[I")
	private int[] anIntArray46 = new int[1000];

	@OriginalMember(owner = "client!client", name = "Ic", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray1 = new String[5];

	@OriginalMember(owner = "client!client", name = "Jc", descriptor = "[Z")
	private boolean[] aBooleanArray3 = new boolean[5];

	@OriginalMember(owner = "client!client", name = "Kc", descriptor = "I")
	private int anInt261 = 78;

	@OriginalMember(owner = "client!client", name = "Lc", descriptor = "[B")
	private byte[] aByteArray2 = new byte[16384];

	@OriginalMember(owner = "client!client", name = "Nc", descriptor = "[I")
	private int[] anIntArray47 = new int[100];

	@OriginalMember(owner = "client!client", name = "Oc", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray2 = new String[100];

	@OriginalMember(owner = "client!client", name = "Pc", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray3 = new String[100];

	@OriginalMember(owner = "client!client", name = "Qc", descriptor = "Lclient!ob;")
	private Class29 aClass29_1 = new Class29(6);

	@OriginalMember(owner = "client!client", name = "Rc", descriptor = "I")
	private int anInt263 = -13274;

	@OriginalMember(owner = "client!client", name = "Sc", descriptor = "I")
	private int anInt264 = 487;

	@OriginalMember(owner = "client!client", name = "Tc", descriptor = "I")
	private int anInt265 = 7759444;

	@OriginalMember(owner = "client!client", name = "Uc", descriptor = "B")
	private byte aByte5 = 0;

	@OriginalMember(owner = "client!client", name = "Wc", descriptor = "Z")
	private boolean aBoolean50 = false;

	@OriginalMember(owner = "client!client", name = "Zc", descriptor = "Ljava/lang/String;")
	private String aString8 = "";

	@OriginalMember(owner = "client!client", name = "ad", descriptor = "Ljava/lang/String;")
	private String aString9 = "";

	@OriginalMember(owner = "client!client", name = "dd", descriptor = "Ljava/lang/String;")
	private String aString10 = "";

	@OriginalMember(owner = "client!client", name = "ed", descriptor = "Z")
	private boolean aBoolean51 = false;

	@OriginalMember(owner = "client!client", name = "hd", descriptor = "I")
	private int anInt270 = 1;

	@OriginalMember(owner = "client!client", name = "id", descriptor = "[Lclient!jc;")
	private Class19[] aClass19Array1 = new Class19[4];

	@OriginalMember(owner = "client!client", name = "jd", descriptor = "I")
	private int anInt271 = -1;

	@OriginalMember(owner = "client!client", name = "kd", descriptor = "I")
	private int anInt272 = 648;

	@OriginalMember(owner = "client!client", name = "ld", descriptor = "[I")
	private int[] anIntArray49 = new int[200];

	@OriginalMember(owner = "client!client", name = "rd", descriptor = "B")
	private byte aByte6 = 29;

	@OriginalMember(owner = "client!client", name = "td", descriptor = "[Lclient!ib;")
	private Class1_Sub1_Sub2_Sub2[] aClass1_Sub1_Sub2_Sub2Array3 = new Class1_Sub1_Sub2_Sub2[8];

	@OriginalMember(owner = "client!client", name = "yd", descriptor = "Lclient!ob;")
	private Class29 aClass29_2 = new Class29(6);

	@OriginalMember(owner = "client!client", name = "Cd", descriptor = "Z")
	private boolean aBoolean52 = false;

	@OriginalMember(owner = "client!client", name = "Hd", descriptor = "[Lclient!ib;")
	private Class1_Sub1_Sub2_Sub2[] aClass1_Sub1_Sub2_Sub2Array4 = new Class1_Sub1_Sub2_Sub2[20];

	@OriginalMember(owner = "client!client", name = "Id", descriptor = "Lclient!lb;")
	private Class1_Sub1_Sub3 aClass1_Sub1_Sub3_2 = Class1_Sub1_Sub3.method468();

	@OriginalMember(owner = "client!client", name = "Jd", descriptor = "Z")
	private boolean aBoolean53 = false;

	@OriginalMember(owner = "client!client", name = "Kd", descriptor = "I")
	private int anInt284 = 21991;

	@OriginalMember(owner = "client!client", name = "Md", descriptor = "[I")
	public int[] anIntArray50 = new int[2000];

	@OriginalMember(owner = "client!client", name = "Yd", descriptor = "I")
	private int anInt293 = -576;

	@OriginalMember(owner = "client!client", name = "Zd", descriptor = "I")
	private int anInt294 = -22129;

	@OriginalMember(owner = "client!client", name = "ae", descriptor = "Z")
	public boolean aBoolean54 = false;

	@OriginalMember(owner = "client!client", name = "ee", descriptor = "[I")
	private int[] anIntArray55 = new int[Class30.anInt812];

	@OriginalMember(owner = "client!client", name = "ge", descriptor = "Z")
	private boolean aBoolean55 = false;

	@OriginalMember(owner = "client!client", name = "he", descriptor = "Ljava/util/zip/CRC32;")
	private CRC32 aCRC32_1 = new CRC32();

	@OriginalMember(owner = "client!client", name = "ie", descriptor = "Z")
	private boolean aBoolean56 = false;

	@OriginalMember(owner = "client!client", name = "je", descriptor = "Z")
	private boolean aBoolean57 = true;

	@OriginalMember(owner = "client!client", name = "le", descriptor = "[I")
	private int[] anIntArray56 = new int[5];

	@OriginalMember(owner = "client!client", name = "ne", descriptor = "Z")
	private boolean aBoolean58 = true;

	@OriginalMember(owner = "client!client", name = "ue", descriptor = "Lclient!lb;")
	private Class1_Sub1_Sub3 aClass1_Sub1_Sub3_3 = Class1_Sub1_Sub3.method468();

	@OriginalMember(owner = "client!client", name = "ve", descriptor = "[I")
	private int[] anIntArray57 = new int[5];

	@OriginalMember(owner = "client!client", name = "we", descriptor = "Z")
	private boolean aBoolean59 = false;

	@OriginalMember(owner = "client!client", name = "ye", descriptor = "I")
	private int anInt301 = 2;

	@OriginalMember(owner = "client!client", name = "ze", descriptor = "Z")
	private boolean aBoolean60 = false;

	@OriginalMember(owner = "client!client", name = "Ae", descriptor = "I")
	private int anInt302 = -1;

	@OriginalMember(owner = "client!client", name = "De", descriptor = "[I")
	private int[] anIntArray59 = new int[Class30.anInt812];

	@OriginalMember(owner = "client!client", name = "Ge", descriptor = "Z")
	private boolean aBoolean61 = false;

	@OriginalMember(owner = "client!client", name = "He", descriptor = "Z")
	private boolean aBoolean62 = false;

	@OriginalMember(owner = "client!client", name = "Ie", descriptor = "I")
	private int anInt306 = 18835;

	@OriginalMember(owner = "client!client", name = "Ke", descriptor = "[Z")
	private boolean[] aBooleanArray4 = new boolean[5];

	@OriginalMember(owner = "client!client", name = "Le", descriptor = "[Lclient!ib;")
	private Class1_Sub1_Sub2_Sub2[] aClass1_Sub1_Sub2_Sub2Array5 = new Class1_Sub1_Sub2_Sub2[1000];

	@OriginalMember(owner = "client!client", name = "Me", descriptor = "[J")
	private long[] aLongArray3 = new long[200];

	@OriginalMember(owner = "client!client", name = "Ne", descriptor = "Z")
	private boolean aBoolean63 = false;

	@OriginalMember(owner = "client!client", name = "Se", descriptor = "Z")
	private boolean aBoolean64 = false;

	@OriginalMember(owner = "client!client", name = "Ye", descriptor = "I")
	private int anInt315 = 1;

	@OriginalMember(owner = "client!client", name = "af", descriptor = "Z")
	private boolean aBoolean65 = true;

	@OriginalMember(owner = "client!client", name = "bf", descriptor = "Ljava/lang/String;")
	private String aString11 = "";

	@OriginalMember(owner = "client!client", name = "cf", descriptor = "Ljava/lang/String;")
	private String aString12 = "";

	@OriginalMember(owner = "client!client", name = "df", descriptor = "[[I")
	private int[][] anIntArrayArray4 = new int[104][104];

	@OriginalMember(owner = "client!client", name = "ff", descriptor = "I")
	private int anInt318 = 1;

	@OriginalMember(owner = "client!client", name = "gf", descriptor = "I")
	private int anInt319 = -1;

	@OriginalMember(owner = "client!client", name = "jf", descriptor = "I")
	private int anInt321 = 2301979;

	@OriginalMember(owner = "client!client", name = "lf", descriptor = "[I")
	private int[] anIntArray60 = new int[151];

	@OriginalMember(owner = "client!client", name = "vf", descriptor = "[I")
	private int[] anIntArray63 = new int[5];

	@OriginalMember(owner = "client!client", name = "wf", descriptor = "Z")
	private boolean aBoolean66 = false;

	@OriginalMember(owner = "client!client", name = "xf", descriptor = "[Lclient!jb;")
	private Class1_Sub1_Sub2_Sub3[] aClass1_Sub1_Sub2_Sub3Array2 = new Class1_Sub1_Sub2_Sub3[2];

	@OriginalMember(owner = "client!client", name = "yf", descriptor = "I")
	private int anInt330 = 2048;

	@OriginalMember(owner = "client!client", name = "zf", descriptor = "I")
	private int anInt331 = 2047;

	@OriginalMember(owner = "client!client", name = "Af", descriptor = "[Lclient!ab;")
	private Class1_Sub1_Sub1_Sub1_Sub1[] aClass1_Sub1_Sub1_Sub1_Sub1Array1 = new Class1_Sub1_Sub1_Sub1_Sub1[this.anInt330];

	@OriginalMember(owner = "client!client", name = "Cf", descriptor = "[I")
	private int[] anIntArray64 = new int[this.anInt330];

	@OriginalMember(owner = "client!client", name = "Ef", descriptor = "[I")
	private int[] anIntArray65 = new int[this.anInt330];

	@OriginalMember(owner = "client!client", name = "Ff", descriptor = "[Lclient!lb;")
	private Class1_Sub1_Sub3[] aClass1_Sub1_Sub3Array1 = new Class1_Sub1_Sub3[this.anInt330];

	@OriginalMember(owner = "client!client", name = "Gf", descriptor = "[Lclient!ib;")
	private Class1_Sub1_Sub2_Sub2[] aClass1_Sub1_Sub2_Sub2Array6 = new Class1_Sub1_Sub2_Sub2[100];

	@OriginalMember(owner = "client!client", name = "Hf", descriptor = "I")
	private int anInt334 = 3;

	@OriginalMember(owner = "client!client", name = "Kf", descriptor = "[I")
	private int[] anIntArray66 = new int[1000];

	@OriginalMember(owner = "client!client", name = "Lf", descriptor = "[I")
	private int[] anIntArray67 = new int[1000];

	@OriginalMember(owner = "client!client", name = "Mf", descriptor = "Z")
	private boolean aBoolean67 = false;

	@OriginalMember(owner = "client!client", name = "Pf", descriptor = "[I")
	private int[] anIntArray68 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

	@OriginalMember(owner = "client!client", name = "Vf", descriptor = "I")
	private int anInt340 = -1;

	@OriginalMember(owner = "client!client", name = "Wf", descriptor = "[I")
	private int[] anIntArray69 = new int[9];

	@OriginalMember(owner = "client!client", name = "ag", descriptor = "B")
	private byte aByte7 = 7;

	@OriginalMember(owner = "client!client", name = "cg", descriptor = "I")
	private int anInt342 = 3353893;

	@OriginalMember(owner = "client!client", name = "ng", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray4 = new String[500];

	@OriginalMember(owner = "client!client", name = "og", descriptor = "Z")
	private boolean aBoolean72 = false;

	@OriginalMember(owner = "client!client", name = "pg", descriptor = "Lclient!d;")
	private Class6 aClass6_1 = new Class6();

	@OriginalMember(owner = "client!client", name = "sg", descriptor = "I")
	private int anInt352 = 6;

	@OriginalMember(owner = "client!client", name = "vg", descriptor = "[I")
	private final int[] anIntArray71 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

	@OriginalMember(owner = "client!client", name = "wg", descriptor = "I")
	private int anInt355 = -1;

	@OriginalMember(owner = "client!client", name = "xg", descriptor = "I")
	private int anInt356 = -34963;

	@OriginalMember(owner = "client!client", name = "zg", descriptor = "Z")
	private boolean aBoolean73 = true;

	@OriginalMember(owner = "client!client", name = "Ag", descriptor = "[I")
	private int[] anIntArray72 = new int[256];

	@OriginalMember(owner = "client!client", name = "Cg", descriptor = "I")
	private int anInt358 = -1;

	@OriginalMember(owner = "client!client", name = "Pg", descriptor = "Ljava/lang/String;")
	private String aString13 = "";

	@OriginalMember(owner = "client!client", name = "Vg", descriptor = "[I")
	private int[] anIntArray73 = new int[4000];

	@OriginalMember(owner = "client!client", name = "Wg", descriptor = "[I")
	private int[] anIntArray74 = new int[4000];

	@OriginalMember(owner = "client!client", name = "Xg", descriptor = "[I")
	private int[] anIntArray75 = new int[5];

	@OriginalMember(owner = "client!client", name = "Zg", descriptor = "[[I")
	private int[][] anIntArrayArray5 = new int[104][104];

	@OriginalMember(owner = "client!client", name = "bh", descriptor = "I")
	private int anInt375 = -31809;

	@OriginalMember(owner = "client!client", name = "ch", descriptor = "I")
	private int anInt376 = -1;

	@OriginalMember(owner = "client!client", name = "dh", descriptor = "Z")
	private boolean aBoolean74 = false;

	@OriginalMember(owner = "client!client", name = "eh", descriptor = "Z")
	private boolean aBoolean75 = true;

	@OriginalMember(owner = "client!client", name = "ih", descriptor = "[I")
	private int[] anIntArray76 = new int[33];

	@OriginalMember(owner = "client!client", name = "jh", descriptor = "Z")
	private boolean aBoolean76 = true;

	@OriginalMember(owner = "client!client", name = "oh", descriptor = "I")
	private int anInt378 = -1;

	@OriginalMember(owner = "client!client", name = "vh", descriptor = "B")
	private byte aByte8 = -43;

	@OriginalMember(owner = "client!client", name = "xh", descriptor = "[I")
	private int[] anIntArray77 = new int[5];

	@OriginalMember(owner = "client!client", name = "Dh", descriptor = "I")
	private int anInt386 = -25848;

	@OriginalMember(owner = "client!client", name = "Eh", descriptor = "I")
	private int anInt387 = -1;

	@OriginalMember(owner = "client!client", name = "Fh", descriptor = "I")
	private int anInt388 = -1;

	@OriginalMember(owner = "client!client", name = "Ih", descriptor = "I")
	private int anInt391 = 128;

	@OriginalMember(owner = "client!client", name = "Nh", descriptor = "Z")
	private boolean aBoolean77 = true;

	@OriginalMember(owner = "client!client", name = "Oh", descriptor = "Z")
	private boolean aBoolean78 = false;

	@OriginalMember(owner = "client!client", name = "Ph", descriptor = "[I")
	private int[] anIntArray78 = new int[2000];

	@OriginalMember(owner = "client!client", name = "Qh", descriptor = "[J")
	private long[] aLongArray4 = new long[100];

	@OriginalMember(owner = "client!client", name = "Sh", descriptor = "I")
	private int anInt397 = 50;

	@OriginalMember(owner = "client!client", name = "Th", descriptor = "[I")
	private int[] anIntArray79 = new int[this.anInt397];

	@OriginalMember(owner = "client!client", name = "Uh", descriptor = "[I")
	private int[] anIntArray80 = new int[this.anInt397];

	@OriginalMember(owner = "client!client", name = "Vh", descriptor = "[I")
	private int[] anIntArray81 = new int[this.anInt397];

	@OriginalMember(owner = "client!client", name = "Wh", descriptor = "[I")
	private int[] anIntArray82 = new int[this.anInt397];

	@OriginalMember(owner = "client!client", name = "Xh", descriptor = "[I")
	private int[] anIntArray83 = new int[this.anInt397];

	@OriginalMember(owner = "client!client", name = "Yh", descriptor = "[I")
	private int[] anIntArray84 = new int[this.anInt397];

	@OriginalMember(owner = "client!client", name = "Zh", descriptor = "[I")
	private int[] anIntArray85 = new int[this.anInt397];

	@OriginalMember(owner = "client!client", name = "ai", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray5 = new String[this.anInt397];

	@OriginalMember(owner = "client!client", name = "bi", descriptor = "I")
	private int anInt398 = -36824;

	@OriginalMember(owner = "client!client", name = "ci", descriptor = "Lclient!ob;")
	private Class29 aClass29_3 = new Class29(6);

	@OriginalMember(owner = "client!client", name = "ei", descriptor = "Z")
	private boolean aBoolean79 = true;

	@OriginalMember(owner = "client!client", name = "gi", descriptor = "I")
	private int anInt400 = 2;

	@OriginalMember(owner = "client!client", name = "hi", descriptor = "Z")
	private boolean aBoolean80 = false;

	@OriginalMember(owner = "client!client", name = "ii", descriptor = "Lclient!lb;")
	private Class1_Sub1_Sub3 aClass1_Sub1_Sub3_4 = Class1_Sub1_Sub3.method468();

	@OriginalMember(owner = "client!client", name = "ni", descriptor = "B")
	private byte aByte9 = -70;

	@OriginalMember(owner = "client!client", name = "oi", descriptor = "I")
	private int anInt401 = 1;

	@OriginalMember(owner = "client!client", name = "vi", descriptor = "[I")
	private int[] anIntArray89 = new int[50];

	@OriginalMember(owner = "client!client", name = "wi", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray6 = new String[200];

	@OriginalMember(owner = "client!client", name = "yi", descriptor = "[Lclient!ib;")
	private Class1_Sub1_Sub2_Sub2[] aClass1_Sub1_Sub2_Sub2Array7 = new Class1_Sub1_Sub2_Sub2[20];

	@OriginalMember(owner = "client!client", name = "zi", descriptor = "I")
	private final int anInt408 = 100;

	@OriginalMember(owner = "client!client", name = "Ai", descriptor = "[I")
	private int[] anIntArray90 = new int[100];

	@OriginalMember(owner = "client!client", name = "Di", descriptor = "[I")
	private int[] anIntArray91 = new int[7];

	@OriginalMember(owner = "client!client", name = "Fi", descriptor = "I")
	private int anInt412 = -1;

	@OriginalMember(owner = "client!client", name = "Ii", descriptor = "Z")
	private boolean aBoolean81 = false;

	@OriginalMember(owner = "client!client", name = "Oi", descriptor = "Z")
	private boolean aBoolean82 = false;

	@OriginalMember(owner = "client!client", name = "aj", descriptor = "Z")
	private boolean aBoolean83 = false;

	@OriginalMember(owner = "client!client", name = "ej", descriptor = "I")
	private int anInt423 = 2;

	@OriginalMember(owner = "client!client", name = "pj", descriptor = "[[I")
	private int[][] anIntArrayArray6 = new int[104][104];

	@OriginalMember(owner = "client!client", name = "uj", descriptor = "Z")
	private boolean aBoolean84 = true;

	@OriginalMember(owner = "client!client", name = "vj", descriptor = "Z")
	private boolean aBoolean85 = false;

	@OriginalMember(owner = "client!client", name = "wj", descriptor = "Z")
	private boolean aBoolean86 = false;

	@OriginalMember(owner = "client!client", name = "xj", descriptor = "[Lclient!jb;")
	private Class1_Sub1_Sub2_Sub3[] aClass1_Sub1_Sub2_Sub3Array4 = new Class1_Sub1_Sub2_Sub3[13];

	@OriginalMember(owner = "client!client", name = "yj", descriptor = "Z")
	private boolean aBoolean87 = true;

	@OriginalMember(owner = "client!client", name = "zj", descriptor = "Z")
	private boolean aBoolean88 = false;

	@OriginalMember(owner = "client!client", name = "Aj", descriptor = "[Lclient!z;")
	private Class1_Sub1_Sub1_Sub1_Sub2[] aClass1_Sub1_Sub1_Sub1_Sub2Array1 = new Class1_Sub1_Sub1_Sub1_Sub2[16384];

	@OriginalMember(owner = "client!client", name = "Cj", descriptor = "[I")
	private int[] anIntArray92 = new int[16384];

	@OriginalMember(owner = "client!client", name = "Ij", descriptor = "[I")
	private int[] anIntArray93 = new int[33];

	static {
		@Pc(271) int local271 = 2;
		@Pc(273) int local273;
		for (local273 = 0; local273 < 32; local273++) {
			anIntArray48[local273] = local271 - 1;
			local271 += local271;
		}
		anInt285 = 2;
		anInt298 = -285;
		anIntArray58 = new int[] { 9104, 10275, 7595, 3610, 7975, 8526, 918, 38802, 24466, 10145, 58654, 5027, 1457, 16565, 34991, 25486 };
		anInt309 = 168;
		anIntArray70 = new int[99];
		local271 = 0;
		for (local273 = 0; local273 < 99; local273++) {
			@Pc(373) int local373 = local273 + 1;
			@Pc(386) int local386 = (int) ((double) local373 + Math.pow(2.0D, (double) local373 / 7.0D) * 300.0D);
			local271 += local386;
			anIntArray70[local273] = local271 / 4;
		}
		anInt347 = 10;
		aBoolean70 = true;
		anInt395 = -16342;
		aBigInteger2 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");
		aString14 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(II)Ljava/lang/String;")
	private static String method98(@OriginalArg(0) int arg0) {
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
			signlink.reporterror("91721, " + arg0 + ", " + 46749 + ", " + local94.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(II)Ljava/lang/String;")
	private static String method105(@OriginalArg(0) int arg0) {
		try {
			if (arg0 < 100000) {
				return String.valueOf(arg0);
			} else if (arg0 < 10000000) {
				return arg0 / 1000 + "K";
			} else {
				return arg0 / 1000000 + "M";
			}
		} catch (@Pc(35) RuntimeException local35) {
			signlink.reporterror("63582, " + arg0 + ", " + 0 + ", " + local35.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(Z)V")
	private static void method126() {
		try {
			Class37.aBoolean215 = true;
			Class1_Sub1_Sub2_Sub1.aBoolean146 = true;
			aBoolean71 = true;
			Class4.aBoolean32 = true;
		} catch (@Pc(17) RuntimeException local17) {
			signlink.reporterror("18151, " + true + ", " + local17.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "u", descriptor = "(I)V")
	private static void method164() {
		try {
			Class37.aBoolean215 = false;
			Class1_Sub1_Sub2_Sub1.aBoolean146 = false;
			aBoolean71 = false;
			Class4.aBoolean32 = false;
		} catch (@Pc(12) RuntimeException local12) {
			signlink.reporterror("1653, " + 0 + ", " + local12.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "main", descriptor = "([Ljava/lang/String;)V")
	public static void main(@OriginalArg(0) String[] arg0) {
		try {
			System.out.println("RS2 user client - release #" + 299);
			if (arg0.length == 5) {
				anInt347 = Integer.parseInt(arg0[0]);
				anInt348 = Integer.parseInt(arg0[1]);
				if (arg0[2].equals("lowmem")) {
					method126();
				} else if (arg0[2].equals("highmem")) {
					method164();
				} else {
					System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
					return;
				}
				if (arg0[3].equals("free")) {
					aBoolean70 = false;
				} else if (arg0[3].equals("members")) {
					aBoolean70 = true;
				} else {
					System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
					return;
				}
				signlink.anInt940 = Integer.parseInt(arg0[4]);
				signlink.startpriv(InetAddress.getLocalHost());
				@Pc(87) client local87 = new client();
				local87.method84();
			} else {
				System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
			}
		} catch (@Pc(94) Exception local94) {
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(III)Ljava/lang/String;")
	private static String method221(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		try {
			@Pc(12) int local12 = arg1 - arg0;
			if (local12 < -9) {
				return "@red@";
			} else if (local12 < -6) {
				return "@or3@";
			} else if (local12 < -3) {
				return "@or2@";
			} else if (local12 < 0) {
				return "@or1@";
			} else if (local12 > 9) {
				return "@gre@";
			} else if (local12 > 6) {
				return "@gr3@";
			} else if (local12 > 3) {
				return "@gr2@";
			} else if (local12 > 0) {
				return "@gr1@";
			} else {
				return "@yel@";
			}
		} catch (@Pc(53) RuntimeException local53) {
			signlink.reporterror("97311, " + 0 + ", " + arg0 + ", " + arg1 + ", " + local53.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIIIIII)V")
	private void method97(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		try {
			if (arg0 >= 1 && arg4 >= 1 && arg0 <= 102 && arg4 <= 102) {
				if (aBoolean71 && arg2 != this.anInt246) {
					return;
				}
				@Pc(34) int local34 = 0;
				if (arg1 == 0) {
					local34 = this.aClass37_1.method556(arg2, arg0, arg4);
				}
				if (arg1 == 1) {
					local34 = this.aClass37_1.method557(arg2, arg4, arg0);
				}
				if (arg1 == 2) {
					local34 = this.aClass37_1.method558(arg2, arg0, arg4);
				}
				if (arg1 == 3) {
					local34 = this.aClass37_1.method559(arg2, arg0, arg4);
				}
				@Pc(90) int local90;
				if (local34 != 0) {
					local90 = this.aClass37_1.method560(arg2, arg0, arg4, local34);
					@Pc(96) int local96 = local34 >> 14 & 0x7FFF;
					@Pc(100) int local100 = local90 & 0x1F;
					@Pc(104) int local104 = local90 >> 6;
					@Pc(116) Class9 local116;
					if (arg1 == 0) {
						this.aClass37_1.method547(arg0, arg4, arg2);
						local116 = Class9.method288(local96);
						if (local116.aBoolean118) {
							this.aClass19Array1[arg2].method425(arg0, local116.aBoolean119, local100, arg4, local104);
						}
					}
					if (arg1 == 1) {
						this.aClass37_1.method548(arg4, arg2, arg0);
					}
					if (arg1 == 2) {
						this.aClass37_1.method549(arg4, arg2, arg0);
						local116 = Class9.method288(local96);
						if (arg0 + local116.anInt513 > 103 || arg4 + local116.anInt513 > 103 || arg0 + local116.anInt514 > 103 || arg4 + local116.anInt514 > 103) {
							return;
						}
						if (local116.aBoolean118) {
							this.aClass19Array1[arg2].method426(local116.aBoolean119, local104, arg0, arg4, local116.anInt514, local116.anInt513);
						}
					}
					if (arg1 == 3) {
						this.aClass37_1.method550(675, arg4, arg2, arg0);
						local116 = Class9.method288(local96);
						if (local116.aBoolean118 && local116.aBoolean120) {
							this.aClass19Array1[arg2].method428(arg4, arg0, this.aBoolean62);
						}
					}
				}
				if (arg3 >= 0) {
					local90 = arg2;
					if (arg2 < 3 && (this.aByteArrayArrayArray7[1][arg0][arg4] & 0x2) == 2) {
						local90 = arg2 + 1;
					}
					Class4.method73(local90, arg2, arg3, this.anIntArrayArrayArray5, this.aClass19Array1[arg2], arg6, arg4, this.aClass37_1, arg0, arg5);
					return;
				}
			}
		} catch (@Pc(264) RuntimeException local264) {
			signlink.reporterror("49298, " + arg0 + ", " + 2 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + local264.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILclient!gc;III)V")
	private void method99(@OriginalArg(0) int arg0, @OriginalArg(1) Class13 arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		try {
			if (this.anInt322 < 400) {
				if (arg1.anIntArray174 != null) {
					arg1 = arg1.method327(559);
				}
				if (arg1 != null) {
					@Pc(19) String local19 = arg1.aString24;
					if (arg1.anInt566 != 0) {
						local19 = local19 + method221(arg1.anInt566, aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt128) + " (level-" + arg1.anInt566 + ")";
					}
					if (this.anInt227 == 1) {
						this.aStringArray4[this.anInt322] = "Use " + this.aString5 + " with @yel@" + local19;
						this.anIntArray39[this.anInt322] = 829;
						this.anIntArray40[this.anInt322] = arg2;
						this.anIntArray37[this.anInt322] = arg0;
						this.anIntArray38[this.anInt322] = arg3;
						this.anInt322++;
					} else if (this.anInt425 != 1) {
						@Pc(168) int local168;
						if (arg1.aStringArray9 != null) {
							for (local168 = 4; local168 >= 0; local168--) {
								if (arg1.aStringArray9[local168] != null && !arg1.aStringArray9[local168].equalsIgnoreCase("attack")) {
									this.aStringArray4[this.anInt322] = arg1.aStringArray9[local168] + " @yel@" + local19;
									if (local168 == 0) {
										this.anIntArray39[this.anInt322] = 242;
									}
									if (local168 == 1) {
										this.anIntArray39[this.anInt322] = 209;
									}
									if (local168 == 2) {
										this.anIntArray39[this.anInt322] = 309;
									}
									if (local168 == 3) {
										this.anIntArray39[this.anInt322] = 852;
									}
									if (local168 == 4) {
										this.anIntArray39[this.anInt322] = 793;
									}
									this.anIntArray40[this.anInt322] = arg2;
									this.anIntArray37[this.anInt322] = arg0;
									this.anIntArray38[this.anInt322] = arg3;
									this.anInt322++;
								}
							}
						}
						if (arg1.aStringArray9 != null) {
							for (local168 = 4; local168 >= 0; local168--) {
								if (arg1.aStringArray9[local168] != null && arg1.aStringArray9[local168].equalsIgnoreCase("attack")) {
									@Pc(292) short local292 = 0;
									if (arg1.anInt566 > aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt128) {
										local292 = 2000;
									}
									this.aStringArray4[this.anInt322] = arg1.aStringArray9[local168] + " @yel@" + local19;
									if (local168 == 0) {
										this.anIntArray39[this.anInt322] = local292 + 242;
									}
									if (local168 == 1) {
										this.anIntArray39[this.anInt322] = local292 + 209;
									}
									if (local168 == 2) {
										this.anIntArray39[this.anInt322] = local292 + 309;
									}
									if (local168 == 3) {
										this.anIntArray39[this.anInt322] = local292 + 852;
									}
									if (local168 == 4) {
										this.anIntArray39[this.anInt322] = local292 + 793;
									}
									this.anIntArray40[this.anInt322] = arg2;
									this.anIntArray37[this.anInt322] = arg0;
									this.anIntArray38[this.anInt322] = arg3;
									this.anInt322++;
								}
							}
						}
						this.aStringArray4[this.anInt322] = "Examine @yel@" + local19;
						this.anIntArray39[this.anInt322] = 1714;
						this.anIntArray40[this.anInt322] = arg2;
						this.anIntArray37[this.anInt322] = arg0;
						this.anIntArray38[this.anInt322] = arg3;
						this.anInt322++;
					} else if ((this.anInt427 & 0x2) == 2) {
						this.aStringArray4[this.anInt322] = this.aString16 + " @yel@" + local19;
						this.anIntArray39[this.anInt322] = 240;
						this.anIntArray40[this.anInt322] = arg2;
						this.anIntArray37[this.anInt322] = arg0;
						this.anIntArray38[this.anInt322] = arg3;
						this.anInt322++;
						return;
					}
				}
			}
		} catch (@Pc(442) RuntimeException local442) {
			signlink.reporterror("36762, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 22080 + ", " + arg3 + ", " + local442.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Z)V")
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
			this.method130();
			if (this.aClass11_1 != null) {
				this.aClass11_1.aBoolean133 = false;
			}
			this.aClass11_1 = null;
			this.aClass44_Sub1_1.method637();
			this.aClass44_Sub1_1 = null;
			this.aClass1_Sub1_Sub3_4 = null;
			this.aClass1_Sub1_Sub3_2 = null;
			this.aClass1_Sub1_Sub3_3 = null;
			this.anIntArray43 = null;
			this.aByteArrayArray2 = null;
			this.aByteArrayArray1 = null;
			this.anIntArray44 = null;
			this.anIntArray45 = null;
			this.anIntArrayArrayArray5 = null;
			this.aByteArrayArrayArray7 = null;
			this.aClass37_1 = null;
			this.aClass19Array1 = null;
			this.anIntArrayArray4 = null;
			this.anIntArrayArray6 = null;
			this.aBoolean54 &= true;
			this.anIntArray73 = null;
			this.anIntArray74 = null;
			this.aByteArray2 = null;
			this.aClass35_3 = null;
			this.aClass35_4 = null;
			this.aClass35_5 = null;
			this.aClass35_6 = null;
			this.aClass35_7 = null;
			this.aClass35_8 = null;
			this.aClass35_9 = null;
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
			this.aClass1_Sub1_Sub2_Sub3Array4 = null;
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
			this.aClass1_Sub1_Sub2_Sub2_7 = null;
			this.aClass1_Sub1_Sub2_Sub2Array4 = null;
			this.aClass1_Sub1_Sub2_Sub2Array7 = null;
			this.aClass1_Sub1_Sub2_Sub2Array3 = null;
			this.aClass1_Sub1_Sub2_Sub2_1 = null;
			this.aClass1_Sub1_Sub2_Sub2_2 = null;
			this.aClass1_Sub1_Sub2_Sub2_3 = null;
			this.aClass1_Sub1_Sub2_Sub2_4 = null;
			this.aClass1_Sub1_Sub2_Sub3Array1 = null;
			this.aClass1_Sub1_Sub2_Sub2Array6 = null;
			this.anIntArrayArray5 = null;
			this.aClass1_Sub1_Sub1_Sub1_Sub1Array1 = null;
			this.anIntArray64 = null;
			this.anIntArray65 = null;
			this.aClass1_Sub1_Sub3Array1 = null;
			this.anIntArray46 = null;
			this.aClass1_Sub1_Sub1_Sub1_Sub2Array1 = null;
			this.anIntArray92 = null;
			this.aClass29ArrayArrayArray1 = null;
			this.aClass29_2 = null;
			this.aClass29_1 = null;
			this.aClass29_3 = null;
			this.anIntArray37 = null;
			this.anIntArray38 = null;
			this.anIntArray39 = null;
			this.anIntArray40 = null;
			this.aStringArray4 = null;
			this.anIntArray50 = null;
			this.anIntArray66 = null;
			this.anIntArray67 = null;
			this.aClass1_Sub1_Sub2_Sub2Array5 = null;
			this.aClass1_Sub1_Sub2_Sub2_6 = null;
			this.aStringArray6 = null;
			this.aLongArray3 = null;
			this.anIntArray49 = null;
			this.aClass35_22 = null;
			this.aClass35_23 = null;
			this.aClass35_19 = null;
			this.aClass35_20 = null;
			this.aClass35_21 = null;
			this.aClass35_24 = null;
			this.aClass35_25 = null;
			this.aClass35_26 = null;
			this.aClass35_27 = null;
			this.method108();
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
			signlink.reporterror("45185, " + true + ", " + local370.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "f", descriptor = "(I)V")
	private void method100() {
		try {
			if (this.anInt322 >= 2 || this.anInt227 != 0 || this.anInt425 != 0) {
				@Pc(31) String local31;
				if (this.anInt227 == 1 && this.anInt322 < 2) {
					local31 = "Use " + this.aString5 + " with...";
				} else if (this.anInt425 == 1 && this.anInt322 < 2) {
					local31 = this.aString16 + "...";
				} else {
					local31 = this.aStringArray4[this.anInt322 - 1];
				}
				if (this.anInt322 > 2) {
					local31 = local31 + "@whi@ / " + (this.anInt322 - 2) + " more options";
				}
				this.aClass1_Sub1_Sub2_Sub4_3.method456(anInt297 / 1000, 16777215, 15, local31, 4);
			}
		} catch (@Pc(98) RuntimeException local98) {
			signlink.reporterror("49543, " + 2 + ", " + local98.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!d;BI)I")
	private int method101(@OriginalArg(0) Class6 arg0, @OriginalArg(2) int arg1) {
		try {
			if (arg0.anIntArrayArray7 == null || arg1 >= arg0.anIntArrayArray7.length) {
				return -2;
			}
			try {
				@Pc(21) int[] local21 = arg0.anIntArrayArray7[arg1];
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
						local34 = this.anIntArray32[local21[local25++]];
					}
					if (local32 == 2) {
						local34 = this.anIntArray59[local21[local25++]];
					}
					if (local32 == 3) {
						local34 = this.anIntArray55[local21[local25++]];
					}
					@Pc(83) Class6 local83;
					@Pc(88) int local88;
					@Pc(101) int local101;
					if (local32 == 4) {
						local83 = Class6.aClass6Array1[local21[local25++]];
						local88 = local21[local25++];
						if (local88 >= 0 && local88 < Class15.anInt601 && (!Class15.method361(local88).aBoolean154 || aBoolean70)) {
							for (local101 = 0; local101 < local83.anIntArray94.length; local101++) {
								if (local83.anIntArray94[local101] == local88 + 1) {
									local34 += local83.anIntArray95[local101];
								}
							}
						}
					}
					if (local32 == 5) {
						local34 = this.anIntArray50[local21[local25++]];
					}
					if (local32 == 6) {
						local34 = anIntArray70[this.anIntArray59[local21[local25++]] - 1];
					}
					if (local32 == 7) {
						local34 = this.anIntArray50[local21[local25++]] * 100 / 46875;
					}
					if (local32 == 8) {
						local34 = aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt128;
					}
					@Pc(176) int local176;
					if (local32 == 9) {
						for (local176 = 0; local176 < Class30.anInt812; local176++) {
							if (Class30.aBooleanArray9[local176]) {
								local34 += this.anIntArray59[local176];
							}
						}
					}
					if (local32 == 10) {
						local83 = Class6.aClass6Array1[local21[local25++]];
						local88 = local21[local25++] + 1;
						if (local88 >= 0 && local88 < Class15.anInt601 && (!Class15.method361(local88).aBoolean154 || aBoolean70)) {
							for (local101 = 0; local101 < local83.anIntArray94.length; local101++) {
								if (local83.anIntArray94[local101] == local88) {
									local34 = 999999999;
									break;
								}
							}
						}
					}
					if (local32 == 11) {
						local34 = this.anInt380;
					}
					if (local32 == 12) {
						local34 = this.anInt374;
					}
					if (local32 == 13) {
						local176 = this.anIntArray50[local21[local25++]];
						local88 = local21[local25++];
						local34 = (local176 & 0x1 << local88) == 0 ? 0 : 1;
					}
					if (local32 == 14) {
						local176 = local21[local25++];
						@Pc(291) Class36 local291 = Class36.aClass36Array1[local176];
						local101 = local291.anInt846;
						@Pc(297) int local297 = local291.anInt847;
						@Pc(300) int local300 = local291.anInt848;
						@Pc(306) int local306 = anIntArray48[local300 - local297];
						local34 = this.anIntArray50[local101] >> local297 & local306;
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
						local34 = (aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt988 >> 7) + this.anInt323;
					}
					if (local32 == 19) {
						local34 = (aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt989 >> 7) + this.anInt324;
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
			signlink.reporterror("57607, " + arg0 + ", " + -11 + ", " + arg1 + ", " + local402.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!lb;II)V")
	private void method102(@OriginalArg(0) Class1_Sub1_Sub3 arg0, @OriginalArg(2) int arg1) {
		try {
			for (@Pc(3) int local3 = 0; local3 < this.anInt333; local3++) {
				@Pc(10) int local10 = this.anIntArray65[local3];
				@Pc(15) Class1_Sub1_Sub1_Sub1_Sub2 local15 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local10];
				@Pc(18) int local18 = arg0.method480();
				@Pc(26) int local26;
				@Pc(29) int local29;
				if ((local18 & 0x1) == 1) {
					local26 = arg0.method480();
					local29 = arg0.method480();
					local15.method681(local29, anInt297, local26);
					local15.anInt1002 = anInt297 + 300;
					local15.anInt1003 = arg0.method480();
					local15.anInt1004 = arg0.method480();
				}
				if ((local18 & 0x2) == 2) {
					local26 = arg0.method482();
					if (local26 == 65535) {
						local26 = -1;
					}
					if (local26 == local15.anInt1011) {
						local15.anInt1015 = 0;
					}
					local29 = arg0.method480();
					if (local26 == local15.anInt1011 && local26 != -1) {
						@Pc(83) int local83 = Class27.aClass27Array1[local26].anInt802;
						if (local83 == 1) {
							local15.anInt1012 = 0;
							local15.anInt1013 = 0;
							local15.anInt1014 = local29;
							local15.anInt1015 = 0;
						}
						if (local83 == 2) {
							local15.anInt1015 = 0;
						}
					} else if (local26 == -1 || local15.anInt1011 == -1 || Class27.aClass27Array1[local26].anInt796 >= Class27.aClass27Array1[local15.anInt1011].anInt796) {
						local15.anInt1011 = local26;
						local15.anInt1012 = 0;
						local15.anInt1013 = 0;
						local15.anInt1014 = local29;
						local15.anInt1015 = 0;
						local15.anInt1034 = local15.anInt1032;
					}
				}
				if ((local18 & 0x4) == 4) {
					local15.anInt1005 = arg0.method482();
					if (local15.anInt1005 == 65535) {
						local15.anInt1005 = -1;
					}
				}
				if ((local18 & 0x8) == 8) {
					local15.aString31 = arg0.method487();
					local15.anInt999 = 100;
				}
				if ((local18 & 0x10) == 16) {
					local26 = arg0.method480();
					local29 = arg0.method480();
					local15.method681(local29, anInt297, local26);
					local15.anInt1002 = anInt297 + 300;
					local15.anInt1003 = arg0.method480();
					local15.anInt1004 = arg0.method480();
				}
				if ((local18 & 0x20) == 32) {
					local15.aClass13_2 = Class13.method323(arg0.method482());
					local15.anInt991 = local15.aClass13_2.aByte16;
					local15.anInt1031 = local15.aClass13_2.anInt572;
					local15.anInt994 = local15.aClass13_2.anInt559;
					local15.anInt995 = local15.aClass13_2.anInt560;
					local15.anInt996 = local15.aClass13_2.anInt561;
					local15.anInt997 = local15.aClass13_2.anInt562;
					local15.anInt992 = local15.aClass13_2.anInt558;
				}
				if ((local18 & 0x40) == 64) {
					local15.anInt1016 = arg0.method482();
					local26 = arg0.method485();
					local15.anInt1020 = local26 >> 16;
					local15.anInt1019 = anInt297 + (local26 & 0xFFFF);
					local15.anInt1017 = 0;
					local15.anInt1018 = 0;
					if (local15.anInt1019 > anInt297) {
						local15.anInt1017 = -1;
					}
					if (local15.anInt1016 == 65535) {
						local15.anInt1016 = -1;
					}
				}
				if ((local18 & 0x80) == 128) {
					local15.anInt1006 = arg0.method482();
					local15.anInt1007 = arg0.method482();
				}
			}
		} catch (@Pc(312) RuntimeException local312) {
			signlink.reporterror("2900, " + arg0 + ", " + 37046 + ", " + arg1 + ", " + local312.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/String;I)Z")
	private boolean method103(@OriginalArg(0) String arg0) {
		try {
			if (arg0 == null) {
				return false;
			}
			for (@Pc(5) int local5 = 0; local5 < this.anInt409; local5++) {
				if (arg0.equalsIgnoreCase(this.aStringArray6[local5])) {
					return true;
				}
			}
			return arg0.equalsIgnoreCase(aClass1_Sub1_Sub1_Sub1_Sub1_1.aString3);
		} catch (@Pc(36) RuntimeException local36) {
			signlink.reporterror("37272, " + arg0 + ", " + 458 + ", " + local36.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILclient!d;)Z")
	private boolean method104(@OriginalArg(1) Class6 arg0) {
		try {
			@Pc(15) int local15 = arg0.anInt436;
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
				this.aStringArray4[this.anInt322] = "Remove @whi@" + this.aStringArray6[local15];
				this.anIntArray39[this.anInt322] = 513;
				this.anInt322++;
				this.aStringArray4[this.anInt322] = "Message @whi@" + this.aStringArray6[local15];
				this.anIntArray39[this.anInt322] = 902;
				this.anInt322++;
				return true;
			} else if (local15 >= 401 && local15 <= 500) {
				this.aStringArray4[this.anInt322] = "Remove @whi@" + arg0.aString18;
				this.anIntArray39[this.anInt322] = 884;
				this.anInt322++;
				return true;
			} else {
				return false;
			}
		} catch (@Pc(138) RuntimeException local138) {
			signlink.reporterror("16313, " + -51 + ", " + arg0 + ", " + local138.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "g", descriptor = "(I)V")
	private void method106() {
		try {
			@Pc(4) Graphics local4 = this.method94().getGraphics();
			local4.setColor(Color.black);
			this.anInt368 += 0;
			local4.fillRect(0, 0, 765, 503);
			this.method87(500);
			@Pc(42) byte local42;
			@Pc(48) int local48;
			if (this.aBoolean85) {
				this.aBoolean51 = false;
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
			if (this.aBoolean46) {
				this.aBoolean51 = false;
				local4.setFont(new Font("Helvetica", 1, 20));
				local4.setColor(Color.white);
				local4.drawString("Error - unable to load game!", 50, 50);
				local4.drawString("To play RuneScape make sure you play from", 50, 100);
				local4.drawString("http://www.runescape.com", 50, 150);
			}
			if (this.aBoolean83) {
				this.aBoolean51 = false;
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
			signlink.reporterror("37607, " + 0 + ", " + local180.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "h", descriptor = "(I)V")
	private void method107() {
		try {
			@Pc(23) int local23;
			@Pc(30) int local30;
			if (this.anInt343 == 0) {
				local23 = super.anInt193 / 2 - 80;
				local30 = super.anInt194 / 2 + 20;
				local30 += 20;
				if (super.anInt202 == 1 && super.anInt203 >= local23 - 75 && super.anInt203 <= local23 + 75 && super.anInt204 >= local30 - 20 && super.anInt204 <= local30 + 20) {
					this.anInt343 = 3;
					this.anInt237 = 0;
				}
				local23 = super.anInt193 / 2 + 80;
				if (super.anInt202 == 1 && super.anInt203 >= local23 - 75 && super.anInt203 <= local23 + 75 && super.anInt204 >= local30 - 20 && super.anInt204 <= local30 + 20) {
					this.aString8 = "";
					this.aString9 = "Enter your username & password.";
					this.anInt343 = 2;
					this.anInt237 = 0;
				}
			} else if (this.anInt343 == 2) {
				local23 = super.anInt194 / 2 - 40;
				local23 += 30;
				local23 += 25;
				if (super.anInt202 == 1 && super.anInt204 >= local23 - 15 && super.anInt204 < local23) {
					this.anInt237 = 0;
				}
				local23 += 15;
				if (super.anInt202 == 1 && super.anInt204 >= local23 - 15 && super.anInt204 < local23) {
					this.anInt237 = 1;
				}
				local23 += 15;
				local30 = super.anInt193 / 2 - 80;
				@Pc(176) int local176 = super.anInt194 / 2 + 50;
				@Pc(177) int local177 = local176 + 20;
				if (super.anInt202 == 1 && super.anInt203 >= local30 - 75 && super.anInt203 <= local30 + 75 && super.anInt204 >= local177 - 20 && super.anInt204 <= local177 + 20) {
					this.anInt373 = 0;
					this.method158(this.aString6, this.aString7, false);
					if (this.aBoolean54) {
						return;
					}
				}
				local30 = super.anInt193 / 2 + 80;
				if (super.anInt202 == 1 && super.anInt203 >= local30 - 75 && super.anInt203 <= local30 + 75 && super.anInt204 >= local177 - 20 && super.anInt204 <= local177 + 20) {
					this.anInt343 = 0;
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
						for (@Pc(274) int local274 = 0; local274 < aString14.length(); local274++) {
							if (local267 == aString14.charAt(local274)) {
								local272 = true;
								break;
							}
						}
						if (this.anInt237 == 0) {
							if (local267 == 8 && this.aString6.length() > 0) {
								this.aString6 = this.aString6.substring(0, this.aString6.length() - 1);
							}
							if (local267 == 9 || local267 == 10 || local267 == 13) {
								this.anInt237 = 1;
							}
							if (local272) {
								this.aString6 = this.aString6 + (char) local267;
							}
							if (this.aString6.length() > 12) {
								this.aString6 = this.aString6.substring(0, 12);
							}
						} else if (this.anInt237 == 1) {
							if (local267 == 8 && this.aString7.length() > 0) {
								this.aString7 = this.aString7.substring(0, this.aString7.length() - 1);
							}
							if (local267 == 9 || local267 == 10 || local267 == 13) {
								this.anInt237 = 0;
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
			} else if (this.anInt343 == 3) {
				local23 = super.anInt193 / 2;
				local30 = super.anInt194 / 2 + 50;
				@Pc(431) int local431 = local30 + 20;
				if (super.anInt202 == 1 && super.anInt203 >= local23 - 75 && super.anInt203 <= local23 + 75 && super.anInt204 >= local431 - 20 && super.anInt204 <= local431 + 20) {
					this.anInt343 = 0;
					return;
				}
			}
		} catch (@Pc(464) RuntimeException local464) {
			signlink.reporterror("57246, " + 5 + ", " + local464.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Z)V")
	private void method108() {
		try {
			this.aBoolean51 = false;
			while (this.aBoolean72) {
				this.aBoolean51 = false;
				try {
					Thread.sleep(50L);
				} catch (@Pc(11) Exception local11) {
				}
			}
			this.aClass1_Sub1_Sub2_Sub3_14 = null;
			this.aClass1_Sub1_Sub2_Sub3_15 = null;
			this.aClass1_Sub1_Sub2_Sub3Array3 = null;
			this.anIntArray51 = null;
			this.anIntArray52 = null;
			this.anIntArray53 = null;
			this.anIntArray54 = null;
			this.anIntArray34 = null;
			this.anIntArray35 = null;
			this.anIntArray61 = null;
			this.aBoolean54 &= true;
			this.anIntArray62 = null;
			this.aClass1_Sub1_Sub2_Sub2_8 = null;
			this.aClass1_Sub1_Sub2_Sub2_9 = null;
		} catch (@Pc(62) RuntimeException local62) {
			signlink.reporterror("35394, " + true + ", " + local62.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(JB)V")
	private void method109(@OriginalArg(0) long arg0, @OriginalArg(1) byte arg1) {
		try {
			if (arg0 != 0L) {
				if (this.anInt274 >= 100) {
					this.method227(0, "", "Your ignore list is full. Max of 100 hit");
				} else {
					@Pc(23) String local23 = Class48.method671(943, Class48.method668(arg0));
					for (@Pc(25) int local25 = 0; local25 < this.anInt274; local25++) {
						if (this.aLongArray4[local25] == arg0) {
							this.method227(0, "", local23 + " is already on your ignore list");
							return;
						}
					}
					for (@Pc(55) int local55 = 0; local55 < this.anInt409; local55++) {
						if (this.aLongArray3[local55] == arg0) {
							this.method227(0, "", "Please remove " + local23 + " from your friend list first");
							return;
						}
					}
					if (arg1 == 7) {
						@Pc(89) boolean local89 = false;
					} else {
						this.aClass1_Sub1_Sub3_4.method470(48);
					}
					this.aLongArray4[this.anInt274++] = arg0;
					this.aBoolean53 = true;
					this.aClass1_Sub1_Sub3_4.method469(158);
					this.aClass1_Sub1_Sub3_4.method476(arg0);
				}
			}
		} catch (@Pc(121) RuntimeException local121) {
			signlink.reporterror("93166, " + arg0 + ", " + arg1 + ", " + local121.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "i", descriptor = "(I)V")
	private void method110() {
		try {
			Class9.aClass40_4.method593();
			Class9.aClass40_5.method593();
			Class13.aClass40_6.method593();
			Class15.aClass40_7.method593();
			Class15.aClass40_8.method593();
			Class1_Sub1_Sub1_Sub1_Sub1.aClass40_1.method593();
			Class33.aClass40_9.method593();
		} catch (@Pc(25) RuntimeException local25) {
			signlink.reporterror("69112, " + -24602 + ", " + local25.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!jb;I)V")
	private void method111(@OriginalArg(0) Class1_Sub1_Sub2_Sub3 arg0) {
		try {
			for (@Pc(5) int local5 = 0; local5 < this.anIntArray34.length; local5++) {
				this.anIntArray34[local5] = 0;
			}
			@Pc(30) int local30;
			for (@Pc(20) int local20 = 0; local20 < 5000; local20++) {
				local30 = (int) (Math.random() * 128.0D * (double) 256);
				this.anIntArray34[local30] = (int) (Math.random() * 256.0D);
			}
			@Pc(55) int local55;
			@Pc(59) int local59;
			@Pc(67) int local67;
			for (local30 = 0; local30 < 20; local30++) {
				for (local55 = 1; local55 < 255; local55++) {
					for (local59 = 1; local59 < 127; local59++) {
						local67 = local59 + (local55 << 7);
						this.anIntArray35[local67] = (this.anIntArray34[local67 - 1] + this.anIntArray34[local67 + 1] + this.anIntArray34[local67 - 128] + this.anIntArray34[local67 + 128]) / 4;
					}
				}
				@Pc(113) int[] local113 = this.anIntArray34;
				this.anIntArray34 = this.anIntArray35;
				this.anIntArray35 = local113;
			}
			if (arg0 != null) {
				local55 = 0;
				for (local59 = 0; local59 < arg0.anInt676; local59++) {
					for (local67 = 0; local67 < arg0.anInt675; local67++) {
						if (arg0.aByteArray7[local55++] != 0) {
							@Pc(149) int local149 = local67 + arg0.anInt677 + 16;
							@Pc(156) int local156 = local59 + arg0.anInt678 + 16;
							@Pc(162) int local162 = local149 + (local156 << 7);
							this.anIntArray34[local162] = 0;
						}
					}
				}
			}
		} catch (@Pc(179) RuntimeException local179) {
			signlink.reporterror("10038, " + arg0 + ", " + 2 + ", " + local179.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "run", descriptor = "()V")
	@Override
	public void run() {
		if (this.aBoolean66) {
			this.method208();
		} else {
			super.run();
		}
	}

	@OriginalMember(owner = "client!client", name = "j", descriptor = "(I)V")
	private void method112() {
		try {
			if (aBoolean71 && this.anInt353 == 2 && Class4.anInt172 != this.anInt246) {
				this.aClass35_5.method524(this.anInt255);
				this.aClass1_Sub1_Sub2_Sub4_2.method447("Loading - please wait.", 151, 0, 257, this.anInt272);
				this.aClass1_Sub1_Sub2_Sub4_2.method447("Loading - please wait.", 150, 16777215, 256, this.anInt272);
				this.aClass35_5.method525(super.aGraphics2, 4, 4);
				this.anInt353 = 1;
				this.aLong16 = System.currentTimeMillis();
			}
			if (this.anInt353 == 1) {
				@Pc(57) int local57 = this.method113();
				if (local57 != 0 && System.currentTimeMillis() - this.aLong16 > 360000L) {
					signlink.reporterror(this.aString6 + " glcfb " + this.aLong18 + "," + local57 + "," + aBoolean71 + "," + this.aClass45Array1[0] + "," + this.aClass44_Sub1_1.method646() + "," + this.anInt246 + "," + this.anInt225 + "," + this.anInt226);
					this.aLong16 = System.currentTimeMillis();
				}
			}
			if (this.anInt353 == 2 && this.anInt246 != this.anInt358) {
				this.anInt358 = this.anInt246;
				this.method211(this.anInt247, this.anInt246);
			}
		} catch (@Pc(139) RuntimeException local139) {
			signlink.reporterror("63860, " + 874 + ", " + local139.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "k", descriptor = "(I)I")
	private int method113() {
		try {
			for (@Pc(3) int local3 = 0; local3 < this.aByteArrayArray2.length; local3++) {
				if (this.aByteArrayArray2[local3] == null && this.anIntArray44[local3] != -1) {
					return -1;
				}
				if (this.aByteArrayArray1[local3] == null && this.anIntArray45[local3] != -1) {
					return -2;
				}
			}
			@Pc(39) boolean local39 = true;
			for (@Pc(41) int local41 = 0; local41 < this.aByteArrayArray2.length; local41++) {
				@Pc(48) byte[] local48 = this.aByteArrayArray1[local41];
				if (local48 != null) {
					@Pc(62) int local62 = (this.anIntArray43[local41] >> 8) * 64 - this.anInt323;
					@Pc(74) int local74 = (this.anIntArray43[local41] & 0xFF) * 64 - this.anInt324;
					local39 &= Class4.method58(this.anInt284, local62, local74, local48);
				}
			}
			if (!local39) {
				return -3;
			} else if (this.aBoolean60) {
				return -4;
			} else {
				this.anInt353 = 2;
				Class4.anInt172 = this.anInt246;
				this.method144();
				this.aClass1_Sub1_Sub3_4.method469(81);
				return 0;
			}
		} catch (@Pc(120) RuntimeException local120) {
			signlink.reporterror("75985, " + 8 + ", " + local120.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(B)V")
	private void method114(@OriginalArg(0) byte arg0) {
		try {
			if (this.anInt359 != 0) {
				@Pc(6) Class1_Sub1_Sub2_Sub4 local6 = this.aClass1_Sub1_Sub2_Sub4_2;
				@Pc(8) int local8 = 0;
				if (this.anInt365 != 0) {
					local8 = 1;
				}
				for (@Pc(15) int local15 = 0; local15 < 100; local15++) {
					if (this.aStringArray3[local15] != null) {
						@Pc(27) int local27 = this.anIntArray47[local15];
						@Pc(32) String local32 = this.aStringArray2[local15];
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
						if ((local27 == 3 || local27 == 7) && (local27 == 7 || this.anInt421 == 0 || this.anInt421 == 1 && this.method103(local32))) {
							local85 = 329 - local8 * 13;
							local6.method451("From", 4, 0, local85);
							local6.method451("From", 4, 65535, local85 - 1);
							@Pc(110) int local110 = local6.method449("From ") + 4;
							if (local34 == 1) {
								this.aClass1_Sub1_Sub2_Sub3Array2[0].method418(local110, local85 - 12);
								local110 += 14;
							}
							if (local34 == 2) {
								this.aClass1_Sub1_Sub2_Sub3Array2[1].method418(local110, local85 - 12);
								local110 += 14;
							}
							local6.method451(local32 + ": " + this.aStringArray3[local15], local110, 0, local85);
							local6.method451(local32 + ": " + this.aStringArray3[local15], local110, 65535, local85 - 1);
							local8++;
							if (local8 >= 5) {
								return;
							}
						}
						if (local27 == 5 && this.anInt421 < 2) {
							local85 = 329 - local8 * 13;
							local6.method451(this.aStringArray3[local15], 4, 0, local85);
							local6.method451(this.aStringArray3[local15], 4, 65535, local85 - 1);
							local8++;
							if (local8 >= 5) {
								return;
							}
						}
						if (local27 == 6 && this.anInt421 < 2) {
							local85 = 329 - local8 * 13;
							local6.method451("To " + local32 + ": " + this.aStringArray3[local15], 4, 0, local85);
							local6.method451("To " + local32 + ": " + this.aStringArray3[local15], 4, 65535, local85 - 1);
							local8++;
							if (local8 >= 5) {
								return;
							}
						}
					}
				}
				@Pc(292) boolean local292 = false;
			}
		} catch (@Pc(297) RuntimeException local297) {
			signlink.reporterror("38743, " + arg0 + ", " + local297.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(Z)V")
	private void method115() {
		try {
			if (this.aClass35_19 == null) {
				super.aClass35_2 = null;
				this.aClass35_6 = null;
				this.aClass35_4 = null;
				this.aClass35_3 = null;
				this.aClass35_5 = null;
				this.aClass35_7 = null;
				this.aClass35_8 = null;
				this.aClass35_9 = null;
				this.aClass35_22 = new Class35(this.method94(), (byte) 3, 265, 128);
				Class1_Sub1_Sub2.method437();
				this.aClass35_23 = new Class35(this.method94(), (byte) 3, 265, 128);
				Class1_Sub1_Sub2.method437();
				this.aClass35_19 = new Class35(this.method94(), (byte) 3, 171, 509);
				Class1_Sub1_Sub2.method437();
				this.aClass35_20 = new Class35(this.method94(), (byte) 3, 132, 360);
				Class1_Sub1_Sub2.method437();
				this.aClass35_21 = new Class35(this.method94(), (byte) 3, 200, 360);
				Class1_Sub1_Sub2.method437();
				this.aClass35_24 = new Class35(this.method94(), (byte) 3, 238, 202);
				Class1_Sub1_Sub2.method437();
				this.aClass35_25 = new Class35(this.method94(), (byte) 3, 238, 203);
				Class1_Sub1_Sub2.method437();
				this.aClass35_26 = new Class35(this.method94(), (byte) 3, 94, 74);
				Class1_Sub1_Sub2.method437();
				this.aClass35_27 = new Class35(this.method94(), (byte) 3, 94, 75);
				Class1_Sub1_Sub2.method437();
				if (this.aClass47_1 != null) {
					this.method220();
					this.method190();
				}
				this.aBoolean61 = true;
			}
		} catch (@Pc(162) RuntimeException local162) {
			signlink.reporterror("62343, " + false + ", " + local162.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(B)V")
	private void method116(@OriginalArg(0) byte arg0) {
		try {
			@Pc(6) boolean local6 = false;
			this.aClass35_6.method524(this.anInt255);
			Class1_Sub1_Sub2_Sub1.anIntArray180 = this.anIntArray86;
			this.aClass1_Sub1_Sub2_Sub3_3.method418(0, 0);
			if (this.aBoolean81) {
				this.aClass1_Sub1_Sub2_Sub4_3.method447(this.aString13, 40, 0, 239, this.anInt272);
				this.aClass1_Sub1_Sub2_Sub4_3.method447(this.aString4 + "*", 60, 128, 239, this.anInt272);
			} else if (this.aBoolean43) {
				this.aClass1_Sub1_Sub2_Sub4_3.method447("Enter amount:", 40, 0, 239, this.anInt272);
				this.aClass1_Sub1_Sub2_Sub4_3.method447(this.aString11 + "*", 60, 128, 239, this.anInt272);
			} else if (this.aString17 != null) {
				this.aClass1_Sub1_Sub2_Sub4_3.method447(this.aString17, 40, 0, 239, this.anInt272);
				this.aClass1_Sub1_Sub2_Sub4_3.method447("Click to continue", 60, 128, 239, this.anInt272);
			} else if (this.anInt217 != -1) {
				this.method214(0, 0, 0, Class6.aClass6Array1[this.anInt217]);
			} else if (this.anInt412 == -1) {
				@Pc(146) Class1_Sub1_Sub2_Sub4 local146 = this.aClass1_Sub1_Sub2_Sub4_2;
				@Pc(148) int local148 = 0;
				Class1_Sub1_Sub2.method436(0, 463, 0, 77);
				for (@Pc(156) int local156 = 0; local156 < 100; local156++) {
					if (this.aStringArray3[local156] != null) {
						@Pc(168) int local168 = this.anIntArray47[local156];
						@Pc(177) int local177 = this.anInt211 + 70 - local148 * 14;
						@Pc(182) String local182 = this.aStringArray2[local156];
						@Pc(184) byte local184 = 0;
						if (local182 != null && local182.startsWith("@cr1@")) {
							local182 = local182.substring(5);
							local184 = 1;
						}
						if (local182 != null && local182.startsWith("@cr2@")) {
							local182 = local182.substring(5);
							local184 = 2;
						}
						if (local168 == 0) {
							if (local177 > 0 && local177 < 110) {
								local146.method451(this.aStringArray3[local156], 4, 0, local177);
							}
							local148++;
						}
						@Pc(254) int local254;
						if ((local168 == 1 || local168 == 2) && (local168 == 1 || this.anInt216 == 0 || this.anInt216 == 1 && this.method103(local182))) {
							if (local177 > 0 && local177 < 110) {
								local254 = 4;
								if (local184 == 1) {
									this.aClass1_Sub1_Sub2_Sub3Array2[0].method418(4, local177 - 12);
									local254 += 14;
								}
								if (local184 == 2) {
									this.aClass1_Sub1_Sub2_Sub3Array2[1].method418(local254, local177 - 12);
									local254 += 14;
								}
								local146.method451(local182 + ":", local254, 0, local177);
								local254 += local146.method449(local182) + 8;
								local146.method451(this.aStringArray3[local156], local254, 255, local177);
							}
							local148++;
						}
						if ((local168 == 3 || local168 == 7) && this.anInt359 == 0 && (local168 == 7 || this.anInt421 == 0 || this.anInt421 == 1 && this.method103(local182))) {
							if (local177 > 0 && local177 < 110) {
								local146.method451("From", 4, 0, local177);
								local254 = local146.method449("From ") + 4;
								if (local184 == 1) {
									this.aClass1_Sub1_Sub2_Sub3Array2[0].method418(local254, local177 - 12);
									local254 += 14;
								}
								if (local184 == 2) {
									this.aClass1_Sub1_Sub2_Sub3Array2[1].method418(local254, local177 - 12);
									local254 += 14;
								}
								local146.method451(local182 + ":", local254, 0, local177);
								local254 += local146.method449(local182) + 8;
								local146.method451(this.aStringArray3[local156], local254, 8388608, local177);
							}
							local148++;
						}
						if (local168 == 4 && (this.anInt296 == 0 || this.anInt296 == 1 && this.method103(local182))) {
							if (local177 > 0 && local177 < 110) {
								local146.method451(local182 + " " + this.aStringArray3[local156], 4, 8388736, local177);
							}
							local148++;
						}
						if (local168 == 5 && this.anInt359 == 0 && this.anInt421 < 2) {
							if (local177 > 0 && local177 < 110) {
								local146.method451(this.aStringArray3[local156], 4, 8388608, local177);
							}
							local148++;
						}
						if (local168 == 6 && this.anInt359 == 0 && this.anInt421 < 2) {
							if (local177 > 0 && local177 < 110) {
								local146.method451("To " + local182 + ":", 4, 0, local177);
								local146.method451(this.aStringArray3[local156], local146.method449("To " + local182) + 12, 8388608, local177);
							}
							local148++;
						}
						if (local168 == 8 && (this.anInt296 == 0 || this.anInt296 == 1 && this.method103(local182))) {
							if (local177 > 0 && local177 < 110) {
								local146.method451(local182 + " " + this.aStringArray3[local156], 4, 8270336, local177);
							}
							local148++;
						}
					}
				}
				Class1_Sub1_Sub2.method435();
				this.anInt261 = local148 * 14 + 7;
				if (this.anInt261 < 78) {
					this.anInt261 = 78;
				}
				this.method205(463, this.anInt261, this.anInt261 - this.anInt211 - 77, 0, 77);
				@Pc(624) String local624;
				if (aClass1_Sub1_Sub1_Sub1_Sub1_1 == null || aClass1_Sub1_Sub1_Sub1_Sub1_1.aString3 == null) {
					local624 = Class48.method671(943, this.aString6);
				} else {
					local624 = aClass1_Sub1_Sub1_Sub1_Sub1_1.aString3;
				}
				local146.method451(local624 + ":", 4, 0, 90);
				local146.method451(this.aString10 + "*", local146.method449(local624 + ": ") + 6, 255, 90);
				Class1_Sub1_Sub2.method442(77, 0, 0, 479);
			} else {
				this.method214(0, 0, 0, Class6.aClass6Array1[this.anInt412]);
			}
			if (this.aBoolean78 && this.anInt360 == 2) {
				this.method225();
			}
			this.aClass35_6.method525(super.aGraphics2, 17, 357);
			this.aClass35_5.method524(this.anInt255);
			Class1_Sub1_Sub2_Sub1.anIntArray180 = this.anIntArray88;
		} catch (@Pc(706) RuntimeException local706) {
			signlink.reporterror("95161, " + arg0 + ", " + local706.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!nb;I)V")
	private void method117(@OriginalArg(0) Class1_Sub2 arg0) {
		try {
			@Pc(1) int local1 = 0;
			@Pc(3) int local3 = -1;
			@Pc(5) int local5 = 0;
			@Pc(7) int local7 = 0;
			if (arg0.anInt781 == 0) {
				local1 = this.aClass37_1.method556(arg0.anInt780, arg0.anInt782, arg0.anInt783);
			}
			if (arg0.anInt781 == 1) {
				local1 = this.aClass37_1.method557(arg0.anInt780, arg0.anInt783, arg0.anInt782);
			}
			if (arg0.anInt781 == 2) {
				local1 = this.aClass37_1.method558(arg0.anInt780, arg0.anInt782, arg0.anInt783);
			}
			if (arg0.anInt781 == 3) {
				local1 = this.aClass37_1.method559(arg0.anInt780, arg0.anInt782, arg0.anInt783);
			}
			if (local1 != 0) {
				@Pc(76) int local76 = this.aClass37_1.method560(arg0.anInt780, arg0.anInt782, arg0.anInt783, local1);
				local3 = local1 >> 14 & 0x7FFF;
				local5 = local76 & 0x1F;
				local7 = local76 >> 6;
			}
			arg0.anInt784 = local3;
			arg0.anInt786 = local5;
			arg0.anInt785 = local7;
		} catch (@Pc(104) RuntimeException local104) {
			signlink.reporterror("37658, " + arg0 + ", " + -886 + ", " + local104.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IBLclient!lb;)V")
	private void method118(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub1_Sub3 arg1) {
		try {
			this.anInt260 = 0;
			this.anInt333 = 0;
			this.method189(arg0, arg1);
			this.method162(arg0, arg1);
			this.method102(arg1, arg0);
			@Pc(39) int local39;
			for (@Pc(32) int local32 = 0; local32 < this.anInt260; local32++) {
				local39 = this.anIntArray46[local32];
				if (this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local39].anInt1028 != anInt297) {
					this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local39].aClass13_2 = null;
					this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local39] = null;
				}
			}
			if (arg1.anInt742 != arg0) {
				signlink.reporterror(this.aString6 + " size mismatch in getnpcpos - pos:" + arg1.anInt742 + " psize:" + arg0);
				throw new RuntimeException("eek");
			}
			for (local39 = 0; local39 < this.anInt424; local39++) {
				if (this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[this.anIntArray92[local39]] == null) {
					signlink.reporterror(this.aString6 + " null entry in npc list - pos:" + local39 + " size:" + this.anInt424);
					throw new RuntimeException("eek");
				}
			}
		} catch (@Pc(129) RuntimeException local129) {
			signlink.reporterror("72316, " + arg0 + ", " + 5 + ", " + arg1 + ", " + local129.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!d;I)V")
	private void method119(@OriginalArg(0) Class6 arg0) {
		try {
			this.anInt368 += 0;
			@Pc(10) int local10 = arg0.anInt436;
			@Pc(66) int local66;
			if ((local10 < 1 || local10 > 100) && (local10 < 701 || local10 > 800)) {
				if (local10 >= 101 && local10 <= 200 || local10 >= 801 && local10 <= 900) {
					local66 = this.anInt409;
					if (this.anInt410 != 2) {
						local66 = 0;
					}
					if (local10 > 800) {
						local10 -= 701;
					} else {
						local10 -= 101;
					}
					if (local10 >= local66) {
						arg0.aString18 = "";
						arg0.anInt435 = 0;
					} else {
						if (this.anIntArray49[local10] == 0) {
							arg0.aString18 = "@red@Offline";
						} else if (this.anIntArray49[local10] == anInt347) {
							arg0.aString18 = "@gre@World-" + (this.anIntArray49[local10] - 9);
						} else {
							arg0.aString18 = "@yel@World-" + (this.anIntArray49[local10] - 9);
						}
						arg0.anInt435 = 1;
					}
				} else if (local10 == 203) {
					local66 = this.anInt409;
					if (this.anInt410 != 2) {
						local66 = 0;
					}
					arg0.anInt442 = local66 * 15 + 20;
					if (arg0.anInt442 <= arg0.anInt438) {
						arg0.anInt442 = arg0.anInt438 + 1;
					}
				} else if (local10 >= 401 && local10 <= 500) {
					local10 -= 401;
					if (local10 == 0 && this.anInt410 == 0) {
						arg0.aString18 = "Loading ignore list";
						arg0.anInt435 = 0;
					} else if (local10 == 1 && this.anInt410 == 0) {
						arg0.aString18 = "Please wait...";
						arg0.anInt435 = 0;
					} else {
						local66 = this.anInt274;
						if (this.anInt410 == 0) {
							local66 = 0;
						}
						if (local10 >= local66) {
							arg0.aString18 = "";
							arg0.anInt435 = 0;
						} else {
							arg0.aString18 = Class48.method671(943, Class48.method668(this.aLongArray4[local10]));
							arg0.anInt435 = 1;
						}
					}
				} else if (local10 == 503) {
					arg0.anInt442 = this.anInt274 * 15 + 20;
					if (arg0.anInt442 <= arg0.anInt438) {
						arg0.anInt442 = arg0.anInt438 + 1;
					}
				} else if (local10 == 327) {
					arg0.anInt458 = 150;
					arg0.anInt459 = (int) (Math.sin((double) anInt297 / 40.0D) * 256.0D) & 0x7FF;
					if (this.aBoolean55) {
						for (local66 = 0; local66 < 7; local66++) {
							@Pc(335) int local335 = this.anIntArray91[local66];
							if (local335 >= 0 && !Class23.aClass23Array1[local335].method498()) {
								return;
							}
						}
						this.aBoolean55 = false;
						@Pc(354) Class1_Sub1_Sub1_Sub5[] local354 = new Class1_Sub1_Sub1_Sub5[7];
						@Pc(356) int local356 = 0;
						for (@Pc(358) int local358 = 0; local358 < 7; local358++) {
							@Pc(365) int local365 = this.anIntArray91[local358];
							if (local365 >= 0) {
								local354[local356++] = Class23.aClass23Array1[local365].method499();
							}
						}
						@Pc(387) Class1_Sub1_Sub1_Sub5 local387 = new Class1_Sub1_Sub1_Sub5(local356, -314, local354);
						for (@Pc(389) int local389 = 0; local389 < 5; local389++) {
							if (this.anIntArray75[local389] != 0) {
								local387.method275(anIntArrayArray3[local389][0], anIntArrayArray3[local389][this.anIntArray75[local389]]);
								if (local389 == 1) {
									local387.method275(anIntArray58[0], anIntArray58[this.anIntArray75[local389]]);
								}
							}
						}
						local387.method268();
						local387.method269(Class27.aClass27Array1[aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt992].anIntArray225[0]);
						local387.method278(64, 850, -30, -50, -30, true);
						arg0.anInt451 = 5;
						arg0.anInt452 = 0;
						Class6.method235(local387);
					}
				} else if (local10 == 324) {
					if (this.aClass1_Sub1_Sub2_Sub2_12 == null) {
						this.aClass1_Sub1_Sub2_Sub2_12 = arg0.aClass1_Sub1_Sub2_Sub2_14;
						this.aClass1_Sub1_Sub2_Sub2_13 = arg0.aClass1_Sub1_Sub2_Sub2_15;
					}
					if (this.aBoolean76) {
						arg0.aClass1_Sub1_Sub2_Sub2_14 = this.aClass1_Sub1_Sub2_Sub2_13;
					} else {
						arg0.aClass1_Sub1_Sub2_Sub2_14 = this.aClass1_Sub1_Sub2_Sub2_12;
					}
				} else if (local10 == 325) {
					if (this.aClass1_Sub1_Sub2_Sub2_12 == null) {
						this.aClass1_Sub1_Sub2_Sub2_12 = arg0.aClass1_Sub1_Sub2_Sub2_14;
						this.aClass1_Sub1_Sub2_Sub2_13 = arg0.aClass1_Sub1_Sub2_Sub2_15;
					}
					if (this.aBoolean76) {
						arg0.aClass1_Sub1_Sub2_Sub2_14 = this.aClass1_Sub1_Sub2_Sub2_12;
					} else {
						arg0.aClass1_Sub1_Sub2_Sub2_14 = this.aClass1_Sub1_Sub2_Sub2_13;
					}
				} else if (local10 == 600) {
					arg0.aString18 = this.aString12;
					if (anInt297 % 20 < 10) {
						arg0.aString18 = arg0.aString18 + "|";
					} else {
						arg0.aString18 = arg0.aString18 + " ";
					}
				} else {
					if (local10 == 613) {
						if (this.anInt262 < 1) {
							arg0.aString18 = "";
						} else if (this.aBoolean82) {
							arg0.anInt447 = 16711680;
							arg0.aString18 = "Moderator option: Mute player for 48 hours: <ON>";
						} else {
							arg0.anInt447 = 16777215;
							arg0.aString18 = "Moderator option: Mute player for 48 hours: <OFF>";
						}
					}
					@Pc(595) String local595;
					if (local10 == 650 || local10 == 655) {
						if (this.anInt413 == 0) {
							arg0.aString18 = "";
						} else {
							if (this.anInt278 == 0) {
								local595 = "earlier today";
							} else if (this.anInt278 == 1) {
								local595 = "yesterday";
							} else {
								local595 = this.anInt278 + " days ago";
							}
							arg0.aString18 = "You last logged in " + local595 + " from: " + signlink.dns;
						}
					}
					if (local10 == 651) {
						if (this.anInt280 == 0) {
							arg0.aString18 = "0 unread messages";
							arg0.anInt447 = 16776960;
						}
						if (this.anInt280 == 1) {
							arg0.aString18 = "1 unread message";
							arg0.anInt447 = 65280;
						}
						if (this.anInt280 > 1) {
							arg0.aString18 = this.anInt280 + " unread messages";
							arg0.anInt447 = 65280;
						}
					}
					if (local10 == 652) {
						if (this.anInt390 == 201) {
							if (this.anInt224 == 1) {
								arg0.aString18 = "@yel@This is a non-members world: @whi@Since you are a member we";
							} else {
								arg0.aString18 = "";
							}
						} else if (this.anInt390 == 200) {
							arg0.aString18 = "You have not yet set any password recovery questions.";
						} else {
							if (this.anInt390 == 0) {
								local595 = "Earlier today";
							} else if (this.anInt390 == 1) {
								local595 = "Yesterday";
							} else {
								local595 = this.anInt390 + " days ago";
							}
							arg0.aString18 = local595 + " you changed your recovery questions";
						}
					}
					if (local10 == 653) {
						if (this.anInt390 == 201) {
							if (this.anInt224 == 1) {
								arg0.aString18 = "@whi@recommend you use a members world instead. You may use";
							} else {
								arg0.aString18 = "";
							}
						} else if (this.anInt390 == 200) {
							arg0.aString18 = "We strongly recommend you do so now to secure your account.";
						} else {
							arg0.aString18 = "If you do not remember making this change then cancel it immediately";
						}
					}
					if (local10 == 654) {
						if (this.anInt390 == 201) {
							if (this.anInt224 == 1) {
								arg0.aString18 = "@whi@this world but member benefits are unavailable whilst here.";
							} else {
								arg0.aString18 = "";
							}
						} else if (this.anInt390 == 200) {
							arg0.aString18 = "Do this from the 'account management' area on our front webpage";
						} else {
							arg0.aString18 = "Do this from the 'account management' area on our front webpage";
						}
					}
				}
			} else if (local10 == 1 && this.anInt410 == 0) {
				arg0.aString18 = "Loading friend list";
				arg0.anInt435 = 0;
			} else if (local10 == 1 && this.anInt410 == 1) {
				arg0.aString18 = "Connecting to friendserver";
				arg0.anInt435 = 0;
			} else if (local10 == 2 && this.anInt410 != 2) {
				arg0.aString18 = "Please wait...";
				arg0.anInt435 = 0;
			} else {
				local66 = this.anInt409;
				if (this.anInt410 != 2) {
					local66 = 0;
				}
				if (local10 > 700) {
					local10 -= 601;
				} else {
					local10--;
				}
				if (local10 >= local66) {
					arg0.aString18 = "";
					arg0.anInt435 = 0;
				} else {
					arg0.aString18 = this.aStringArray6[local10];
					arg0.anInt435 = 1;
				}
			}
		} catch (@Pc(803) RuntimeException local803) {
			signlink.reporterror("63806, " + arg0 + ", " + 0 + ", " + local803.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILclient!ib;II)V")
	private void method120(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub1_Sub2_Sub2 arg1, @OriginalArg(3) int arg2) {
		try {
			@Pc(12) int local12 = arg2 * arg2 + arg0 * arg0;
			if (local12 > 4225 && local12 < 90000) {
				@Pc(26) int local26 = this.anInt392 + this.anInt422 & 0x7FF;
				@Pc(30) int local30 = Class1_Sub1_Sub1_Sub5.anIntArray151[local26];
				@Pc(34) int local34 = Class1_Sub1_Sub1_Sub5.anIntArray152[local26];
				@Pc(43) int local43 = local30 * 256 / (this.anInt269 + 256);
				@Pc(52) int local52 = local34 * 256 / (this.anInt269 + 256);
				@Pc(62) int local62 = arg0 * local43 + arg2 * local52 >> 16;
				@Pc(72) int local72 = arg0 * local52 - arg2 * local43 >> 16;
				@Pc(78) double local78 = Math.atan2((double) local62, (double) local72);
				@Pc(84) int local84 = (int) (Math.sin(local78) * 63.0D);
				@Pc(90) int local90 = (int) (Math.cos(local78) * 57.0D);
				this.aClass1_Sub1_Sub2_Sub2_5.method396(83 - local90 - 20, local84 + 94 + 4 - 10, local78);
			} else {
				this.method137(arg1, arg2, arg0);
			}
		} catch (@Pc(121) RuntimeException local121) {
			signlink.reporterror("55121, " + arg0 + ", " + arg1 + ", " + 873 + ", " + arg2 + ", " + local121.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(I)V")
	@Override
	protected void method90() {
		try {
			if (!this.aBoolean83 && !this.aBoolean85 && !this.aBoolean46) {
				anInt297++;
				if (this.aBoolean54) {
					this.method154();
				} else {
					this.method107();
				}
				this.method215();
			}
		} catch (@Pc(34) RuntimeException local34) {
			signlink.reporterror("8653, " + 7 + ", " + local34.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(Z)V")
	private void method121() {
		try {
			this.anInt396 = 0;
			@Pc(100) int local100;
			@Pc(80) int local80;
			for (@Pc(16) int local16 = -1; local16 < this.anInt332 + this.anInt424; local16++) {
				@Pc(23) Class1_Sub1_Sub1_Sub1 local23;
				if (local16 == -1) {
					local23 = aClass1_Sub1_Sub1_Sub1_Sub1_1;
				} else if (local16 < this.anInt332) {
					local23 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[this.anIntArray64[local16]];
				} else {
					local23 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[this.anIntArray92[local16 - this.anInt332]];
				}
				if (local23 != null && local23.method680()) {
					@Pc(64) Class13 local64;
					if (local23 instanceof Class1_Sub1_Sub1_Sub1_Sub2) {
						local64 = ((Class1_Sub1_Sub1_Sub1_Sub2) local23).aClass13_2;
						if (local64.anIntArray174 != null) {
							local64 = local64.method327(559);
						}
						if (local64 == null) {
							continue;
						}
					}
					if (local16 >= this.anInt332) {
						local64 = ((Class1_Sub1_Sub1_Sub1_Sub2) local23).aClass13_2;
						if (local64.anInt571 >= 0 && local64.anInt571 < this.aClass1_Sub1_Sub2_Sub2Array7.length) {
							this.method146(local23, local23.anInt1029 + 15);
							if (this.anInt387 > -1) {
								this.aClass1_Sub1_Sub2_Sub2Array7[local64.anInt571].method391(this.anInt387 - 12, this.anInt388 - 30);
							}
						}
						if (this.anInt420 == 1 && this.anInt233 == this.anIntArray92[local16 - this.anInt332] && anInt297 % 20 < 10) {
							this.method146(local23, local23.anInt1029 + 15);
							if (this.anInt387 > -1) {
								this.aClass1_Sub1_Sub2_Sub2Array7[2].method391(this.anInt387 - 12, this.anInt388 - 28);
							}
						}
					} else {
						local80 = 30;
						@Pc(83) Class1_Sub1_Sub1_Sub1_Sub1 local83 = (Class1_Sub1_Sub1_Sub1_Sub1) local23;
						if (local83.anInt127 != 0) {
							this.method146(local23, local23.anInt1029 + 15);
							if (this.anInt387 > -1) {
								for (local100 = 0; local100 < 8; local100++) {
									if ((local83.anInt127 & 0x1 << local100) != 0) {
										this.aClass1_Sub1_Sub2_Sub2Array7[local100].method391(this.anInt387 - 12, this.anInt388 - local80);
										local80 -= 25;
									}
								}
							}
						}
						if (local16 >= 0 && this.anInt420 == 10 && this.anInt258 == this.anIntArray64[local16]) {
							this.method146(local23, local23.anInt1029 + 15);
							if (this.anInt387 > -1) {
								this.aClass1_Sub1_Sub2_Sub2Array7[7].method391(this.anInt387 - 12, this.anInt388 - local80);
							}
						}
					}
					if (local23.aString31 != null && (local16 >= this.anInt332 || this.anInt216 == 0 || this.anInt216 == 3 || this.anInt216 == 1 && this.method103(((Class1_Sub1_Sub1_Sub1_Sub1) local23).aString3))) {
						this.method146(local23, local23.anInt1029);
						if (this.anInt387 > -1 && this.anInt396 < this.anInt397) {
							this.anIntArray82[this.anInt396] = this.aClass1_Sub1_Sub2_Sub4_3.method450(local23.aString31) / 2;
							this.anIntArray81[this.anInt396] = this.aClass1_Sub1_Sub2_Sub4_3.anInt711;
							this.anIntArray79[this.anInt396] = this.anInt387;
							this.anIntArray80[this.anInt396] = this.anInt388;
							this.anIntArray83[this.anInt396] = local23.anInt1000;
							this.anIntArray84[this.anInt396] = local23.anInt1001;
							this.anIntArray85[this.anInt396] = local23.anInt999;
							this.aStringArray5[this.anInt396++] = local23.aString31;
							if (this.anInt308 == 0 && local23.anInt1001 >= 1 && local23.anInt1001 <= 3) {
								this.anIntArray81[this.anInt396] += 10;
								this.anIntArray80[this.anInt396] += 5;
							}
							if (this.anInt308 == 0 && local23.anInt1001 == 4) {
								this.anIntArray82[this.anInt396] = 60;
							}
							if (this.anInt308 == 0 && local23.anInt1001 == 5) {
								this.anIntArray81[this.anInt396] += 5;
							}
						}
					}
					if (local23.anInt1002 > anInt297) {
						this.method146(local23, local23.anInt1029 + 15);
						if (this.anInt387 > -1) {
							local80 = local23.anInt1003 * 30 / local23.anInt1004;
							if (local80 > 30) {
								local80 = 30;
							}
							Class1_Sub1_Sub2.method439(this.anInt388 - 3, 5, 65280, local80, this.anInt387 - 15);
							Class1_Sub1_Sub2.method439(this.anInt388 - 3, 5, 16711680, 30 - local80, this.anInt387 - 15 + local80);
						}
					}
					for (local80 = 0; local80 < 4; local80++) {
						if (local23.anIntArray271[local80] > anInt297) {
							this.method146(local23, local23.anInt1029 / 2);
							if (this.anInt387 > -1) {
								if (local80 == 1) {
									this.anInt388 -= 20;
								}
								if (local80 == 2) {
									this.anInt387 -= 15;
									this.anInt388 -= 10;
								}
								if (local80 == 3) {
									this.anInt387 += 15;
									this.anInt388 -= 10;
								}
								this.aClass1_Sub1_Sub2_Sub2Array4[local23.anIntArray270[local80]].method391(this.anInt387 - 12, this.anInt388 - 12);
								this.aClass1_Sub1_Sub2_Sub4_1.method447(String.valueOf(local23.anIntArray269[local80]), this.anInt388 + 4, 0, this.anInt387, this.anInt272);
								this.aClass1_Sub1_Sub2_Sub4_1.method447(String.valueOf(local23.anIntArray269[local80]), this.anInt388 + 3, 16777215, this.anInt387 - 1, this.anInt272);
							}
						}
					}
				}
			}
			for (@Pc(607) int local607 = 0; local607 < this.anInt396; local607++) {
				local80 = this.anIntArray79[local607];
				@Pc(619) int local619 = this.anIntArray80[local607];
				local100 = this.anIntArray82[local607];
				@Pc(629) int local629 = this.anIntArray81[local607];
				@Pc(631) boolean local631 = true;
				while (local631) {
					local631 = false;
					for (@Pc(637) int local637 = 0; local637 < local607; local637++) {
						if (local619 + 2 > this.anIntArray80[local637] - this.anIntArray81[local637] && local619 - local629 < this.anIntArray80[local637] + 2 && local80 - local100 < this.anIntArray79[local637] + this.anIntArray82[local637] && local80 + local100 > this.anIntArray79[local637] - this.anIntArray82[local637] && this.anIntArray80[local637] - this.anIntArray81[local637] < local619) {
							local619 = this.anIntArray80[local637] - this.anIntArray81[local637];
							local631 = true;
						}
					}
				}
				this.anInt387 = this.anIntArray79[local607];
				this.anInt388 = this.anIntArray80[local607] = local619;
				@Pc(736) String local736 = this.aStringArray5[local607];
				if (this.anInt308 == 0) {
					@Pc(741) int local741 = 16776960;
					if (this.anIntArray83[local607] < 6) {
						local741 = this.anIntArray41[this.anIntArray83[local607]];
					}
					if (this.anIntArray83[local607] == 6) {
						local741 = this.anInt316 % 20 < 10 ? 16711680 : 16776960;
					}
					if (this.anIntArray83[local607] == 7) {
						local741 = this.anInt316 % 20 < 10 ? 255 : 65535;
					}
					if (this.anIntArray83[local607] == 8) {
						local741 = this.anInt316 % 20 < 10 ? 45056 : 8454016;
					}
					@Pc(816) int local816;
					if (this.anIntArray83[local607] == 9) {
						local816 = 150 - this.anIntArray85[local607];
						if (local816 < 50) {
							local741 = local816 * 1280 + 16711680;
						} else if (local816 < 100) {
							local741 = 16776960 - (local816 - 50) * 327680;
						} else if (local816 < 150) {
							local741 = (local816 - 100) * 5 + 65280;
						}
					}
					if (this.anIntArray83[local607] == 10) {
						local816 = 150 - this.anIntArray85[local607];
						if (local816 < 50) {
							local741 = local816 * 5 + 16711680;
						} else if (local816 < 100) {
							local741 = 16711935 - (local816 - 50) * 327680;
						} else if (local816 < 150) {
							local741 = (local816 - 100) * 327680 + 255 - (local816 - 100) * 5;
						}
					}
					if (this.anIntArray83[local607] == 11) {
						local816 = 150 - this.anIntArray85[local607];
						if (local816 < 50) {
							local741 = 16777215 - local816 * 327685;
						} else if (local816 < 100) {
							local741 = (local816 - 50) * 327685 + 65280;
						} else if (local816 < 150) {
							local741 = 16777215 - (local816 - 100) * 327680;
						}
					}
					if (this.anIntArray84[local607] == 0) {
						this.aClass1_Sub1_Sub2_Sub4_3.method447(local736, this.anInt388 + 1, 0, this.anInt387, this.anInt272);
						this.aClass1_Sub1_Sub2_Sub4_3.method447(local736, this.anInt388, local741, this.anInt387, this.anInt272);
					}
					if (this.anIntArray84[local607] == 1) {
						this.aClass1_Sub1_Sub2_Sub4_3.method452(this.anInt316, 0, this.anInt388 + 1, this.anInt387, local736);
						this.aClass1_Sub1_Sub2_Sub4_3.method452(this.anInt316, local741, this.anInt388, this.anInt387, local736);
					}
					if (this.anIntArray84[local607] == 2) {
						this.aClass1_Sub1_Sub2_Sub4_3.method453(0, this.anInt316, local736, this.anInt388 + 1, this.anInt387);
						this.aClass1_Sub1_Sub2_Sub4_3.method453(local741, this.anInt316, local736, this.anInt388, this.anInt387);
					}
					if (this.anIntArray84[local607] == 3) {
						this.aClass1_Sub1_Sub2_Sub4_3.method454(local736, 150 - this.anIntArray85[local607], 0, this.anInt388 + 1, this.anInt316, this.anInt387);
						this.aClass1_Sub1_Sub2_Sub4_3.method454(local736, 150 - this.anIntArray85[local607], local741, this.anInt388, this.anInt316, this.anInt387);
					}
					@Pc(1115) int local1115;
					if (this.anIntArray84[local607] == 4) {
						local816 = this.aClass1_Sub1_Sub2_Sub4_3.method450(local736);
						local1115 = (150 - this.anIntArray85[local607]) * (local816 + 100) / 150;
						Class1_Sub1_Sub2.method436(this.anInt387 - 50, this.anInt387 + 50, 0, 334);
						this.aClass1_Sub1_Sub2_Sub4_3.method451(local736, this.anInt387 + 50 - local1115, 0, this.anInt388 + 1);
						this.aClass1_Sub1_Sub2_Sub4_3.method451(local736, this.anInt387 + 50 - local1115, local741, this.anInt388);
						Class1_Sub1_Sub2.method435();
					}
					if (this.anIntArray84[local607] == 5) {
						local816 = 150 - this.anIntArray85[local607];
						local1115 = 0;
						if (local816 < 25) {
							local1115 = local816 - 25;
						} else if (local816 > 125) {
							local1115 = local816 - 125;
						}
						Class1_Sub1_Sub2.method436(0, 512, this.anInt388 - this.aClass1_Sub1_Sub2_Sub4_3.anInt711 - 1, this.anInt388 + 5);
						this.aClass1_Sub1_Sub2_Sub4_3.method447(local736, this.anInt388 + local1115 + 1, 0, this.anInt387, this.anInt272);
						this.aClass1_Sub1_Sub2_Sub4_3.method447(local736, this.anInt388 + local1115, local741, this.anInt387, this.anInt272);
						Class1_Sub1_Sub2.method435();
					}
				} else {
					this.aClass1_Sub1_Sub2_Sub4_3.method447(local736, this.anInt388 + 1, 0, this.anInt387, this.anInt272);
					this.aClass1_Sub1_Sub2_Sub4_3.method447(local736, this.anInt388, 16776960, this.anInt387, this.anInt272);
				}
			}
		} catch (@Pc(1269) RuntimeException local1269) {
			signlink.reporterror("40907, " + true + ", " + local1269.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IILclient!ab;IZ)V")
	private void method122(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class1_Sub1_Sub1_Sub1_Sub1 arg2, @OriginalArg(3) int arg3) {
		try {
			this.aBoolean54 &= true;
			if (arg2 != aClass1_Sub1_Sub1_Sub1_Sub1_1 && this.anInt322 < 400) {
				@Pc(41) String local41;
				if (arg2.anInt129 == 0) {
					local41 = arg2.aString3 + method221(arg2.anInt128, aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt128) + " (level-" + arg2.anInt128 + ")";
				} else {
					local41 = arg2.aString3 + " (skill-" + arg2.anInt129 + ")";
				}
				@Pc(171) int local171;
				if (this.anInt227 == 1) {
					this.aStringArray4[this.anInt322] = "Use " + this.aString5 + " with @whi@" + local41;
					this.anIntArray39[this.anInt322] = 275;
					this.anIntArray40[this.anInt322] = arg3;
					this.anIntArray37[this.anInt322] = arg0;
					this.anIntArray38[this.anInt322] = arg1;
					this.anInt322++;
				} else if (this.anInt425 != 1) {
					for (local171 = 4; local171 >= 0; local171--) {
						if (this.aStringArray1[local171] != null) {
							this.aStringArray4[this.anInt322] = this.aStringArray1[local171] + " @whi@" + local41;
							@Pc(198) short local198 = 0;
							if (this.aStringArray1[local171].equalsIgnoreCase("attack")) {
								if (arg2.anInt128 > aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt128) {
									local198 = 2000;
								}
								if (aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt140 != 0 && arg2.anInt140 != 0) {
									if (aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt140 == arg2.anInt140) {
										local198 = 2000;
									} else {
										local198 = 0;
									}
								}
							} else if (this.aBooleanArray3[local171]) {
								local198 = 2000;
							}
							if (local171 == 0) {
								this.anIntArray39[this.anInt322] = local198 + 639;
							}
							if (local171 == 1) {
								this.anIntArray39[this.anInt322] = local198 + 499;
							}
							if (local171 == 2) {
								this.anIntArray39[this.anInt322] = local198 + 27;
							}
							if (local171 == 3) {
								this.anIntArray39[this.anInt322] = local198 + 387;
							}
							if (local171 == 4) {
								this.anIntArray39[this.anInt322] = local198 + 185;
							}
							this.anIntArray40[this.anInt322] = arg3;
							this.anIntArray37[this.anInt322] = arg0;
							this.anIntArray38[this.anInt322] = arg1;
							this.anInt322++;
						}
					}
				} else if ((this.anInt427 & 0x8) == 8) {
					this.aStringArray4[this.anInt322] = this.aString16 + " @whi@" + local41;
					this.anIntArray39[this.anInt322] = 131;
					this.anIntArray40[this.anInt322] = arg3;
					this.anIntArray37[this.anInt322] = arg0;
					this.anIntArray38[this.anInt322] = arg1;
					this.anInt322++;
				}
				for (local171 = 0; local171 < this.anInt322; local171++) {
					if (this.anIntArray39[local171] == 718) {
						this.aStringArray4[local171] = "Walk here @whi@" + local41;
						return;
					}
				}
			}
		} catch (@Pc(348) RuntimeException local348) {
			signlink.reporterror("3031, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + true + ", " + local348.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(B)V")
	private void method123(@OriginalArg(0) byte arg0) {
		try {
			this.aClass35_3.method524(this.anInt255);
			@Pc(11) boolean local11 = false;
			Class1_Sub1_Sub2_Sub1.anIntArray180 = this.anIntArray87;
			this.aClass1_Sub1_Sub2_Sub3_1.method418(0, 0);
			if (this.anInt376 != -1) {
				this.method214(0, 0, 0, Class6.aClass6Array1[this.anInt376]);
			} else if (this.anIntArray68[this.anInt334] != -1) {
				this.method214(0, 0, 0, Class6.aClass6Array1[this.anIntArray68[this.anInt334]]);
			}
			if (this.aBoolean78 && this.anInt360 == 1) {
				this.method225();
			}
			this.aClass35_3.method525(super.aGraphics2, 553, 205);
			this.aClass35_5.method524(this.anInt255);
			Class1_Sub1_Sub2_Sub1.anIntArray180 = this.anIntArray88;
		} catch (@Pc(90) RuntimeException local90) {
			signlink.reporterror("24145, " + arg0 + ", " + local90.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "l", descriptor = "(I)V")
	private void method124() {
		try {
			this.aClass35_4.method524(this.anInt255);
			@Pc(19) int local19;
			@Pc(21) int local21;
			if (this.anInt339 == 2) {
				@Pc(14) byte[] local14 = this.aClass1_Sub1_Sub2_Sub3_2.aByteArray7;
				@Pc(16) int[] local16 = Class1_Sub1_Sub2.anIntArray213;
				local19 = local14.length;
				for (local21 = 0; local21 < local19; local21++) {
					if (local14[local21] == 0) {
						local16[local21] = 0;
					}
				}
				this.aClass1_Sub1_Sub2_Sub2_7.method395(0, 33, 25, 33, this.anInt392, this.anIntArray93, this.anIntArray76, 256, 0, 25);
				this.aClass35_5.method524(this.anInt255);
			} else {
				@Pc(66) int local66 = this.anInt392 + this.anInt422 & 0x7FF;
				@Pc(73) int local73 = aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt988 / 32 + 48;
				local19 = 464 - aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt989 / 32;
				this.aClass1_Sub1_Sub2_Sub2_6.method395(5, 151, local73, 146, local66, this.anIntArray33, this.anIntArray60, this.anInt269 + 256, 25, local19);
				this.aClass1_Sub1_Sub2_Sub2_7.method395(0, 33, 25, 33, this.anInt392, this.anIntArray93, this.anIntArray76, 256, 0, 25);
				for (local21 = 0; local21 < this.anInt336; local21++) {
					local73 = this.anIntArray66[local21] * 4 + 2 - aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt988 / 32;
					local19 = this.anIntArray67[local21] * 4 + 2 - aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt989 / 32;
					this.method137(this.aClass1_Sub1_Sub2_Sub2Array5[local21], local73, local19);
				}
				@Pc(168) int local168;
				for (@Pc(164) int local164 = 0; local164 < 104; local164++) {
					for (local168 = 0; local168 < 104; local168++) {
						@Pc(180) Class29 local180 = this.aClass29ArrayArrayArray1[this.anInt246][local164][local168];
						if (local180 != null) {
							local73 = local164 * 4 + 2 - aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt988 / 32;
							local19 = local168 * 4 + 2 - aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt989 / 32;
							this.method137(this.aClass1_Sub1_Sub2_Sub2_1, local73, local19);
						}
					}
				}
				for (local168 = 0; local168 < this.anInt424; local168++) {
					@Pc(231) Class1_Sub1_Sub1_Sub1_Sub2 local231 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[this.anIntArray92[local168]];
					if (local231 != null && local231.method680()) {
						@Pc(240) Class13 local240 = local231.aClass13_2;
						if (local240.anIntArray174 != null) {
							local240 = local240.method327(559);
						}
						if (local240 != null && local240.aBoolean139) {
							local73 = local231.anInt988 / 32 - aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt988 / 32;
							local19 = local231.anInt989 / 32 - aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt989 / 32;
							this.method137(this.aClass1_Sub1_Sub2_Sub2_2, local73, local19);
						}
					}
				}
				@Pc(302) Class1_Sub1_Sub1_Sub1_Sub1 local302;
				for (@Pc(292) int local292 = 0; local292 < this.anInt332; local292++) {
					local302 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[this.anIntArray64[local292]];
					if (local302 != null && local302.method680()) {
						local73 = local302.anInt988 / 32 - aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt988 / 32;
						local19 = local302.anInt989 / 32 - aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt989 / 32;
						@Pc(330) boolean local330 = false;
						@Pc(334) long local334 = Class48.method667(local302.aString3);
						for (@Pc(336) int local336 = 0; local336 < this.anInt409; local336++) {
							if (local334 == this.aLongArray3[local336] && this.anIntArray49[local336] != 0) {
								local330 = true;
								break;
							}
						}
						if (aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt140 != 0 && local302.anInt140 != 0) {
							if (aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt140 == local302.anInt140) {
								local330 = true;
							} else {
								local330 = false;
							}
						}
						if (local330) {
							this.method137(this.aClass1_Sub1_Sub2_Sub2_4, local73, local19);
						} else {
							this.method137(this.aClass1_Sub1_Sub2_Sub2_3, local73, local19);
						}
					}
				}
				if (this.anInt420 != 0 && anInt297 % 20 < 10) {
					if (this.anInt420 == 1 && this.anInt233 >= 0 && this.anInt233 < this.aClass1_Sub1_Sub1_Sub1_Sub2Array1.length) {
						@Pc(426) Class1_Sub1_Sub1_Sub1_Sub2 local426 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[this.anInt233];
						if (local426 != null) {
							local73 = local426.anInt988 / 32 - aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt988 / 32;
							local19 = local426.anInt989 / 32 - aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt989 / 32;
							this.method120(local19, this.aClass1_Sub1_Sub2_Sub2_11, local73);
						}
					}
					if (this.anInt420 == 2) {
						local73 = (this.anInt238 - this.anInt323) * 4 + 2 - aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt988 / 32;
						local19 = (this.anInt239 - this.anInt324) * 4 + 2 - aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt989 / 32;
						this.method120(local19, this.aClass1_Sub1_Sub2_Sub2_11, local73);
					}
					if (this.anInt420 == 10 && this.anInt258 >= 0 && this.anInt258 < this.aClass1_Sub1_Sub1_Sub1_Sub1Array1.length) {
						local302 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[this.anInt258];
						if (local302 != null) {
							local73 = local302.anInt988 / 32 - aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt988 / 32;
							local19 = local302.anInt989 / 32 - aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt989 / 32;
							this.method120(local19, this.aClass1_Sub1_Sub2_Sub2_11, local73);
						}
					}
				}
				if (this.anInt275 != 0) {
					local73 = this.anInt275 * 4 + 2 - aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt988 / 32;
					local19 = this.anInt276 * 4 + 2 - aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt989 / 32;
					this.method137(this.aClass1_Sub1_Sub2_Sub2_10, local73, local19);
				}
				Class1_Sub1_Sub2.method439(78, 3, 16777215, 3, 97);
				this.aClass35_5.method524(this.anInt255);
			}
		} catch (@Pc(592) RuntimeException local592) {
			signlink.reporterror("85666, " + 8 + ", " + local592.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "m", descriptor = "(I)V")
	private void method125() {
		try {
			for (@Pc(12) Class1_Sub1_Sub1_Sub6 local12 = (Class1_Sub1_Sub1_Sub6) this.aClass29_3.method511(); local12 != null; local12 = (Class1_Sub1_Sub1_Sub6) this.aClass29_3.method513()) {
				if (local12.anInt534 != this.anInt246 || local12.aBoolean132) {
					local12.method673();
				} else if (anInt297 >= local12.anInt533) {
					local12.method301(this.anInt208, this.aBoolean67);
					if (local12.aBoolean132) {
						local12.method673();
					} else {
						this.aClass37_1.method541(local12, local12.anInt535, local12.anInt534, local12.anInt537, 60, local12.anInt536, 0, false, -1);
					}
				}
			}
		} catch (@Pc(71) RuntimeException local71) {
			signlink.reporterror("73905, " + 19748 + ", " + local71.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILclient!lb;B)V")
	private void method127(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub1_Sub3 arg1) {
		try {
			@Pc(6) int local6 = arg1.method491(8);
			@Pc(16) int local16;
			if (local6 < this.anInt332) {
				for (local16 = local6; local16 < this.anInt332; local16++) {
					this.anIntArray46[this.anInt260++] = this.anIntArray64[local16];
				}
			}
			if (local6 > this.anInt332) {
				signlink.reporterror(this.aString6 + " Too many players");
				throw new RuntimeException("eek");
			}
			this.anInt332 = 0;
			for (local16 = 0; local16 < local6; local16++) {
				@Pc(68) int local68 = this.anIntArray64[local16];
				@Pc(73) Class1_Sub1_Sub1_Sub1_Sub1 local73 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local68];
				@Pc(78) int local78 = arg1.method491(1);
				if (local78 == 0) {
					this.anIntArray64[this.anInt332++] = local68;
					local73.anInt1028 = anInt297;
				} else {
					@Pc(101) int local101 = arg1.method491(2);
					if (local101 == 0) {
						this.anIntArray64[this.anInt332++] = local68;
						local73.anInt1028 = anInt297;
						this.anIntArray65[this.anInt333++] = local68;
					} else {
						@Pc(152) int local152;
						@Pc(162) int local162;
						if (local101 == 1) {
							this.anIntArray64[this.anInt332++] = local68;
							local73.anInt1028 = anInt297;
							local152 = arg1.method491(3);
							local73.method678(false, 490, local152);
							local162 = arg1.method491(1);
							if (local162 == 1) {
								this.anIntArray65[this.anInt333++] = local68;
							}
						} else if (local101 == 2) {
							this.anIntArray64[this.anInt332++] = local68;
							local73.anInt1028 = anInt297;
							local152 = arg1.method491(3);
							local73.method678(true, 490, local152);
							local162 = arg1.method491(3);
							local73.method678(true, 490, local162);
							@Pc(220) int local220 = arg1.method491(1);
							if (local220 == 1) {
								this.anIntArray65[this.anInt333++] = local68;
							}
						} else if (local101 == 3) {
							this.anIntArray46[this.anInt260++] = local68;
						}
					}
				}
			}
		} catch (@Pc(257) RuntimeException local257) {
			signlink.reporterror("49680, " + arg0 + ", " + arg1 + ", " + -124 + ", " + local257.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Lclient!d;I)Z")
	private boolean method128(@OriginalArg(0) Class6 arg0, @OriginalArg(1) int arg1) {
		try {
			if (arg1 <= 0) {
				this.method89();
			}
			@Pc(8) int local8 = arg0.anInt436;
			if (this.anInt410 == 2) {
				if (local8 == 201) {
					this.aBoolean59 = true;
					this.aBoolean43 = false;
					this.aBoolean81 = true;
					this.aString4 = "";
					this.anInt286 = 1;
					this.aString13 = "Enter name of friend to add to list";
				}
				if (local8 == 202) {
					this.aBoolean59 = true;
					this.aBoolean43 = false;
					this.aBoolean81 = true;
					this.aString4 = "";
					this.anInt286 = 2;
					this.aString13 = "Enter name of friend to delete from list";
				}
			}
			if (local8 == 205) {
				this.anInt372 = 250;
				return true;
			}
			if (local8 == 501) {
				this.aBoolean59 = true;
				this.aBoolean43 = false;
				this.aBoolean81 = true;
				this.aString4 = "";
				this.anInt286 = 4;
				this.aString13 = "Enter name of player to add to list";
			}
			if (local8 == 502) {
				this.aBoolean59 = true;
				this.aBoolean43 = false;
				this.aBoolean81 = true;
				this.aString4 = "";
				this.anInt286 = 5;
				this.aString13 = "Enter name of player to delete from list";
			}
			@Pc(116) int local116;
			@Pc(120) int local120;
			@Pc(125) int local125;
			if (local8 >= 300 && local8 <= 313) {
				local116 = (local8 - 300) / 2;
				local120 = local8 & 0x1;
				local125 = this.anIntArray91[local116];
				if (local125 != -1) {
					while (true) {
						if (local120 == 0) {
							local125--;
							if (local125 < 0) {
								local125 = Class23.anInt750 - 1;
							}
						}
						if (local120 == 1) {
							local125++;
							if (local125 >= Class23.anInt750) {
								local125 = 0;
							}
						}
						if (!Class23.aClass23Array1[local125].aBoolean192 && Class23.aClass23Array1[local125].anInt751 == local116 + (this.aBoolean76 ? 0 : 7)) {
							this.anIntArray91[local116] = local125;
							this.aBoolean55 = true;
							break;
						}
					}
				}
			}
			if (local8 >= 314 && local8 <= 323) {
				local116 = (local8 - 314) / 2;
				local120 = local8 & 0x1;
				local125 = this.anIntArray75[local116];
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
				this.anIntArray75[local116] = local125;
				this.aBoolean55 = true;
			}
			if (local8 == 324 && !this.aBoolean76) {
				this.aBoolean76 = true;
				this.method139();
			}
			if (local8 == 325 && this.aBoolean76) {
				this.aBoolean76 = false;
				this.method139();
			}
			if (local8 == 326) {
				this.aClass1_Sub1_Sub3_4.method469(145);
				this.aClass1_Sub1_Sub3_4.method470(this.aBoolean76 ? 0 : 1);
				for (local116 = 0; local116 < 7; local116++) {
					this.aClass1_Sub1_Sub3_4.method470(this.anIntArray91[local116]);
				}
				for (local120 = 0; local120 < 5; local120++) {
					this.aClass1_Sub1_Sub3_4.method470(this.anIntArray75[local120]);
				}
				return true;
			}
			if (local8 == 613) {
				this.aBoolean82 = !this.aBoolean82;
			}
			if (local8 >= 601 && local8 <= 612) {
				this.method143();
				if (this.aString12.length() > 0) {
					this.aClass1_Sub1_Sub3_4.method469(85);
					this.aClass1_Sub1_Sub3_4.method476(Class48.method667(this.aString12));
					this.aClass1_Sub1_Sub3_4.method470(local8 - 601);
					this.aClass1_Sub1_Sub3_4.method470(this.aBoolean82 ? 1 : 0);
				}
			}
			return false;
		} catch (@Pc(353) RuntimeException local353) {
			signlink.reporterror("78252, " + arg0 + ", " + arg1 + ", " + local353.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(BI)V")
	private void method129(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(4) boolean local4 = false;
			signlink.anInt947 = arg1;
		} catch (@Pc(18) RuntimeException local18) {
			signlink.reporterror("52652, " + arg0 + ", " + arg1 + ", " + local18.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "f", descriptor = "(Z)V")
	private void method130() {
		try {
			signlink.anInt945 = 0;
			signlink.midi = "stop";
		} catch (@Pc(10) RuntimeException local10) {
			signlink.reporterror("12775, " + true + ", " + local10.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "g", descriptor = "(Z)V")
	private void method131() {
		try {
			System.out.println("============");
			System.out.println("flame-cycle:" + this.anInt277);
			if (this.aClass44_Sub1_1 != null) {
				System.out.println("Od-cycle:" + this.aClass44_Sub1_1.anInt964);
			}
			System.out.println("loop-cycle:" + anInt297);
			System.out.println("draw-cycle:" + anInt279);
			System.out.println("ptype:" + this.anInt369);
			System.out.println("psize:" + this.anInt368);
			if (this.aClass8_1 != null) {
				this.aClass8_1.method252();
			}
			super.aBoolean40 = true;
		} catch (@Pc(79) RuntimeException local79) {
			signlink.reporterror("90839, " + false + ", " + local79.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(I)Ljava/awt/Component;")
	@Override
	protected Component method94() {
		try {
			if (this.anInt318 != 1) {
				this.aClass1_Sub1_Sub3_4.method470(3);
			}
			if (signlink.mainapp == null) {
				return super.aFrame_Sub1_2 == null ? this : super.aFrame_Sub1_2;
			} else {
				return signlink.mainapp;
			}
		} catch (@Pc(20) RuntimeException local20) {
			signlink.reporterror("58654, " + 1 + ", " + local20.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ZLclient!lb;I)V")
	private void method132(@OriginalArg(1) Class1_Sub1_Sub3 arg0, @OriginalArg(2) int arg1) {
		try {
			this.aBoolean54 &= true;
			@Pc(16) int local16;
			@Pc(25) int local25;
			@Pc(32) int local32;
			@Pc(35) int local35;
			@Pc(39) int local39;
			@Pc(43) int local43;
			@Pc(48) int local48;
			@Pc(53) int local53;
			if (arg1 == 136 || arg1 == 211) {
				local16 = arg0.method480();
				local25 = this.anInt337 + (local16 >> 4 & 0x7);
				local32 = this.anInt338 + (local16 & 0x7);
				local35 = arg0.method480();
				local39 = local35 >> 2;
				local43 = local35 & 0x3;
				local48 = this.anIntArray71[local39];
				if (arg1 == 211) {
					local53 = -1;
				} else {
					local53 = arg0.method482();
				}
				if (local25 >= 0 && local32 >= 0 && local25 < 104 && local32 < 104) {
					this.method207(local39, this.anInt246, -1, local32, 0, local43, local25, local53, local48);
				}
			} else {
				@Pc(143) int local143;
				@Pc(155) int local155;
				@Pc(169) int local169;
				@Pc(181) int local181;
				if (arg1 == 2) {
					local16 = arg0.method480();
					local25 = this.anInt337 + (local16 >> 4 & 0x7);
					local32 = this.anInt338 + (local16 & 0x7);
					local35 = arg0.method480();
					local39 = local35 >> 2;
					local43 = local35 & 0x3;
					local48 = this.anIntArray71[local39];
					local53 = arg0.method482();
					if (local25 >= 0 && local32 >= 0 && local25 < 103 && local32 < 103) {
						local143 = this.anIntArrayArrayArray5[this.anInt246][local25][local32];
						local155 = this.anIntArrayArrayArray5[this.anInt246][local25 + 1][local32];
						local169 = this.anIntArrayArrayArray5[this.anInt246][local25 + 1][local32 + 1];
						local181 = this.anIntArrayArrayArray5[this.anInt246][local25][local32 + 1];
						if (local48 == 0) {
							@Pc(192) Class34 local192 = this.aClass37_1.method552(this.anInt246, 634, local25, local32);
							if (local192 != null) {
								@Pc(201) int local201 = local192.anInt840 >> 14 & 0x7FFF;
								if (local39 == 2) {
									local192.aClass1_Sub1_Sub1_7 = new Class1_Sub1_Sub1_Sub2(local181, false, 2, 0, local143, local155, local169, local43 + 4, local201, local53);
									local192.aClass1_Sub1_Sub1_8 = new Class1_Sub1_Sub1_Sub2(local181, false, 2, 0, local143, local155, local169, local43 + 1 & 0x3, local201, local53);
								} else {
									local192.aClass1_Sub1_Sub1_7 = new Class1_Sub1_Sub1_Sub2(local181, false, local39, 0, local143, local155, local169, local43, local201, local53);
								}
							}
						}
						if (local48 == 1) {
							@Pc(269) Class14 local269 = this.aClass37_1.method553(local25, this.anInt246, local32);
							if (local269 != null) {
								local269.aClass1_Sub1_Sub1_1 = new Class1_Sub1_Sub1_Sub2(local181, false, 4, 0, local143, local155, local169, 0, local269.anInt580 >> 14 & 0x7FFF, local53);
							}
						}
						if (local48 == 2) {
							@Pc(303) Class31 local303 = this.aClass37_1.method554(local32, this.anInt246, local25);
							if (local39 == 11) {
								local39 = 10;
							}
							if (local303 != null) {
								local303.aClass1_Sub1_Sub1_6 = new Class1_Sub1_Sub1_Sub2(local181, false, local39, 0, local143, local155, local169, local43, local303.anInt824 >> 14 & 0x7FFF, local53);
							}
						}
						if (local48 == 3) {
							@Pc(342) Class18 local342 = this.aClass37_1.method555(this.anInt246, local32, local25);
							if (local342 != null) {
								local342.aClass1_Sub1_Sub1_2 = new Class1_Sub1_Sub1_Sub2(local181, false, 22, 0, local143, local155, local169, local43, local342.anInt661 >> 14 & 0x7FFF, local53);
							}
						}
					}
				} else {
					@Pc(407) Class1_Sub1_Sub1_Sub3 local407;
					if (arg1 == 147) {
						local16 = arg0.method480();
						local25 = this.anInt337 + (local16 >> 4 & 0x7);
						local32 = this.anInt338 + (local16 & 0x7);
						local35 = arg0.method482();
						local39 = arg0.method482();
						if (local25 >= 0 && local32 >= 0 && local25 < 104 && local32 < 104) {
							local407 = new Class1_Sub1_Sub1_Sub3();
							local407.anInt179 = local35;
							local407.anInt180 = local39;
							if (this.aClass29ArrayArrayArray1[this.anInt246][local25][local32] == null) {
								this.aClass29ArrayArrayArray1[this.anInt246][local25][local32] = new Class29(6);
							}
							this.aClass29ArrayArrayArray1[this.anInt246][local25][local32].method508(local407);
							this.method176(local25, local32);
						}
					} else if (arg1 == 53) {
						local16 = arg0.method480();
						local25 = this.anInt337 + (local16 >> 4 & 0x7);
						local32 = this.anInt338 + (local16 & 0x7);
						local35 = arg0.method482();
						if (local25 >= 0 && local32 >= 0 && local25 < 104 && local32 < 104) {
							@Pc(497) Class29 local497 = this.aClass29ArrayArrayArray1[this.anInt246][local25][local32];
							if (local497 != null) {
								for (local407 = (Class1_Sub1_Sub1_Sub3) local497.method511(); local407 != null; local407 = (Class1_Sub1_Sub1_Sub3) local497.method513()) {
									if (local407.anInt179 == (local35 & 0x7FFF)) {
										local407.method673();
										break;
									}
								}
								if (local497.method511() == null) {
									this.aClass29ArrayArrayArray1[this.anInt246][local25][local32] = null;
								}
								this.method176(local25, local32);
							}
						}
					} else if (arg1 == 30) {
						local16 = arg0.method480();
						local25 = this.anInt337 + (local16 >> 4 & 0x7);
						local32 = this.anInt338 + (local16 & 0x7);
						local35 = local25 + arg0.method481();
						local39 = local32 + arg0.method481();
						local43 = arg0.method483();
						local48 = arg0.method482();
						local53 = arg0.method480() * 4;
						local143 = arg0.method480() * 4;
						local155 = arg0.method482();
						local169 = arg0.method482();
						local181 = arg0.method480();
						@Pc(600) int local600 = arg0.method480();
						if (local25 >= 0 && local32 >= 0 && local25 < 104 && local32 < 104 && local35 >= 0 && local39 >= 0 && local35 < 104 && local39 < 104 && local48 != 65535) {
							local25 = local25 * 128 + 64;
							local32 = local32 * 128 + 64;
							local35 = local35 * 128 + 64;
							local39 = local39 * 128 + 64;
							@Pc(677) Class1_Sub1_Sub1_Sub4 local677 = new Class1_Sub1_Sub1_Sub4(this.anInt419, this.method223(local25, this.anInt246, local32) - local53, local32, local48, local169 + anInt297, local43, local181, local600, local25, local143, this.anInt246, local155 + anInt297);
							local677.method241(local39, local155 + anInt297, this.method223(local35, this.anInt246, local39) - local143, local35);
							this.aClass29_1.method508(local677);
						}
					} else if (arg1 == 193) {
						local16 = arg0.method480();
						local25 = this.anInt337 + (local16 >> 4 & 0x7);
						local32 = this.anInt338 + (local16 & 0x7);
						local35 = arg0.method482();
						local39 = arg0.method480();
						local43 = arg0.method482();
						if (local25 >= 0 && local32 >= 0 && local25 < 104 && local32 < 104) {
							local25 = local25 * 128 + 64;
							local32 = local32 * 128 + 64;
							@Pc(773) Class1_Sub1_Sub1_Sub6 local773 = new Class1_Sub1_Sub1_Sub6(local32, local43, this.anInt246, local35, true, this.method223(local25, this.anInt246, local32) - local39, local25, anInt297);
							this.aClass29_3.method508(local773);
						}
					} else if (arg1 == 137) {
						local16 = arg0.method480();
						local25 = this.anInt337 + (local16 >> 4 & 0x7);
						local32 = this.anInt338 + (local16 & 0x7);
						local35 = arg0.method482();
						local39 = arg0.method482();
						local43 = arg0.method482();
						if (local25 >= 0 && local32 >= 0 && local25 < 104 && local32 < 104 && local43 != this.anInt214) {
							@Pc(827) Class1_Sub1_Sub1_Sub3 local827 = new Class1_Sub1_Sub1_Sub3();
							local827.anInt179 = local35;
							local827.anInt180 = local39;
							if (this.aClass29ArrayArrayArray1[this.anInt246][local25][local32] == null) {
								this.aClass29ArrayArrayArray1[this.anInt246][local25][local32] = new Class29(6);
							}
							this.aClass29ArrayArrayArray1[this.anInt246][local25][local32].method508(local827);
							this.method176(local25, local32);
						}
					} else {
						if (arg1 == 191) {
							local16 = arg0.method480();
							local25 = this.anInt337 + (local16 >> 4 & 0x7);
							local32 = this.anInt338 + (local16 & 0x7);
							local35 = arg0.method480();
							local39 = local35 >> 2;
							local43 = local35 & 0x3;
							local48 = this.anIntArray71[local39];
							local53 = arg0.method482();
							local143 = arg0.method482();
							local155 = arg0.method482();
							local169 = arg0.method482();
							@Pc(925) byte local925 = arg0.method481();
							@Pc(928) byte local928 = arg0.method481();
							@Pc(931) byte local931 = arg0.method481();
							@Pc(934) byte local934 = arg0.method481();
							@Pc(940) Class1_Sub1_Sub1_Sub1_Sub1 local940;
							if (local169 == this.anInt214) {
								local940 = aClass1_Sub1_Sub1_Sub1_Sub1_1;
							} else {
								local940 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local169];
							}
							if (local940 != null) {
								@Pc(952) Class9 local952 = Class9.method288(local53);
								@Pc(962) int local962 = this.anIntArrayArrayArray5[this.anInt246][local25][local32];
								@Pc(974) int local974 = this.anIntArrayArrayArray5[this.anInt246][local25 + 1][local32];
								@Pc(988) int local988 = this.anIntArrayArrayArray5[this.anInt246][local25 + 1][local32 + 1];
								@Pc(1000) int local1000 = this.anIntArrayArrayArray5[this.anInt246][local25][local32 + 1];
								@Pc(1010) Class1_Sub1_Sub1_Sub5 local1010 = local952.method294(local39, local43, local962, local974, local988, local1000, -1);
								if (local1010 != null) {
									this.method207(0, this.anInt246, local155 + 1, local32, local143 + 1, 0, local25, -1, local48);
									local940.anInt131 = local143 + anInt297;
									local940.anInt132 = local155 + anInt297;
									local940.aClass1_Sub1_Sub1_Sub5_1 = local1010;
									@Pc(1045) int local1045 = local952.anInt513;
									@Pc(1048) int local1048 = local952.anInt514;
									if (local43 == 1 || local43 == 3) {
										local1045 = local952.anInt514;
										local1048 = local952.anInt513;
									}
									local940.anInt133 = local25 * 128 + local1045 * 64;
									local940.anInt135 = local32 * 128 + local1048 * 64;
									local940.anInt134 = this.method223(local940.anInt133, this.anInt246, local940.anInt135);
									@Pc(1094) byte local1094;
									if (local925 > local931) {
										local1094 = local925;
										local925 = local931;
										local931 = local1094;
									}
									if (local928 > local934) {
										local1094 = local928;
										local928 = local934;
										local934 = local1094;
									}
									local940.anInt136 = local25 + local925;
									local940.anInt138 = local25 + local931;
									local940.anInt137 = local32 + local928;
									local940.anInt139 = local32 + local934;
								}
							}
						}
						if (arg1 == 253) {
							local16 = arg0.method480();
							local25 = this.anInt337 + (local16 >> 4 & 0x7);
							local32 = this.anInt338 + (local16 & 0x7);
							local35 = arg0.method482();
							local39 = arg0.method482();
							local43 = arg0.method482();
							if (local25 >= 0 && local32 >= 0 && local25 < 104 && local32 < 104) {
								@Pc(1178) Class29 local1178 = this.aClass29ArrayArrayArray1[this.anInt246][local25][local32];
								if (local1178 != null) {
									for (@Pc(1184) Class1_Sub1_Sub1_Sub3 local1184 = (Class1_Sub1_Sub1_Sub3) local1178.method511(); local1184 != null; local1184 = (Class1_Sub1_Sub1_Sub3) local1178.method513()) {
										if (local1184.anInt179 == (local35 & 0x7FFF) && local1184.anInt180 == local39) {
											local1184.anInt180 = local43;
											break;
										}
									}
									this.method176(local25, local32);
								}
							}
						} else if (arg1 == 222) {
							local16 = arg0.method480();
							local25 = this.anInt337 + (local16 >> 4 & 0x7);
							local32 = this.anInt338 + (local16 & 0x7);
							local35 = arg0.method482();
							local39 = arg0.method480();
							local43 = local39 >> 4 & 0xF;
							local48 = local39 & 0x7;
							if (aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray272[0] >= local25 - local43 && aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray272[0] <= local25 + local43 && aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray273[0] >= local32 - local43 && aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray273[0] <= local32 + local43 && this.aBoolean77 && !aBoolean71 && this.anInt317 < 50) {
								this.anIntArray42[this.anInt317] = local35;
								this.anIntArray89[this.anInt317] = local48;
								this.anIntArray36[this.anInt317] = Class5.anIntArray29[local35];
								this.anInt317++;
								return;
							}
						}
					}
				}
			}
		} catch (@Pc(1320) RuntimeException local1320) {
			signlink.reporterror("44645, " + true + ", " + arg0 + ", " + arg1 + ", " + local1320.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "h", descriptor = "(Z)V")
	private void method133() {
		try {
			if (this.anInt227 == 0 && this.anInt425 == 0) {
				this.aStringArray4[this.anInt322] = "Walk here";
				this.anIntArray39[this.anInt322] = 718;
				this.anIntArray37[this.anInt322] = super.anInt197;
				this.anIntArray38[this.anInt322] = super.anInt198;
				this.anInt322++;
			}
			@Pc(41) int local41 = -1;
			for (@Pc(49) int local49 = 0; local49 < Class1_Sub1_Sub1_Sub5.anInt508; local49++) {
				@Pc(55) int local55 = Class1_Sub1_Sub1_Sub5.anIntArray150[local49];
				@Pc(59) int local59 = local55 & 0x7F;
				@Pc(65) int local65 = local55 >> 7 & 0x7F;
				@Pc(71) int local71 = local55 >> 29 & 0x3;
				@Pc(77) int local77 = local55 >> 14 & 0x7FFF;
				if (local55 != local41) {
					local41 = local55;
					@Pc(225) int local225;
					if (local71 == 2 && this.aClass37_1.method560(this.anInt246, local59, local65, local55) >= 0) {
						@Pc(97) Class9 local97 = Class9.method288(local77);
						if (local97.anIntArray160 != null) {
							local97 = local97.method296(this.aByte9);
						}
						if (local97 == null) {
							continue;
						}
						if (this.anInt227 == 1) {
							this.aStringArray4[this.anInt322] = "Use " + this.aString5 + " with @cya@" + local97.aString23;
							this.anIntArray39[this.anInt322] = 810;
							this.anIntArray40[this.anInt322] = local55;
							this.anIntArray37[this.anInt322] = local59;
							this.anIntArray38[this.anInt322] = local65;
							this.anInt322++;
						} else if (this.anInt425 != 1) {
							if (local97.aStringArray8 != null) {
								for (local225 = 4; local225 >= 0; local225--) {
									if (local97.aStringArray8[local225] != null) {
										this.aStringArray4[this.anInt322] = local97.aStringArray8[local225] + " @cya@" + local97.aString23;
										if (local225 == 0) {
											this.anIntArray39[this.anInt322] = 625;
										}
										if (local225 == 1) {
											this.anIntArray39[this.anInt322] = 721;
										}
										if (local225 == 2) {
											this.anIntArray39[this.anInt322] = 743;
										}
										if (local225 == 3) {
											this.anIntArray39[this.anInt322] = 357;
										}
										if (local225 == 4) {
											this.anIntArray39[this.anInt322] = 1071;
										}
										this.anIntArray40[this.anInt322] = local55;
										this.anIntArray37[this.anInt322] = local59;
										this.anIntArray38[this.anInt322] = local65;
										this.anInt322++;
									}
								}
							}
							this.aStringArray4[this.anInt322] = "Examine @cya@" + local97.aString23;
							this.anIntArray39[this.anInt322] = 1381;
							this.anIntArray40[this.anInt322] = local97.anInt512 << 14;
							this.anIntArray37[this.anInt322] = local59;
							this.anIntArray38[this.anInt322] = local65;
							this.anInt322++;
						} else if ((this.anInt427 & 0x4) == 4) {
							this.aStringArray4[this.anInt322] = this.aString16 + " @cya@" + local97.aString23;
							this.anIntArray39[this.anInt322] = 899;
							this.anIntArray40[this.anInt322] = local55;
							this.anIntArray37[this.anInt322] = local59;
							this.anIntArray38[this.anInt322] = local65;
							this.anInt322++;
						}
					}
					@Pc(405) Class1_Sub1_Sub1_Sub1_Sub2 local405;
					@Pc(453) Class1_Sub1_Sub1_Sub1_Sub1 local453;
					@Pc(443) int local443;
					if (local71 == 1) {
						@Pc(376) Class1_Sub1_Sub1_Sub1_Sub2 local376 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local77];
						if (local376.aClass13_2.aByte16 == 1 && (local376.anInt988 & 0x7F) == 64 && (local376.anInt989 & 0x7F) == 64) {
							for (local225 = 0; local225 < this.anInt424; local225++) {
								local405 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[this.anIntArray92[local225]];
								if (local405 != null && local405 != local376 && local405.aClass13_2.aByte16 == 1 && local405.anInt988 == local376.anInt988 && local405.anInt989 == local376.anInt989) {
									this.method99(local59, local405.aClass13_2, this.anIntArray92[local225], local65);
								}
							}
							for (local443 = 0; local443 < this.anInt332; local443++) {
								local453 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[this.anIntArray64[local443]];
								if (local453 != null && local453.anInt988 == local376.anInt988 && local453.anInt989 == local376.anInt989) {
									this.method122(local59, local65, local453, this.anIntArray64[local443]);
								}
							}
						}
						this.method99(local59, local376.aClass13_2, local77, local65);
					}
					if (local71 == 0) {
						@Pc(495) Class1_Sub1_Sub1_Sub1_Sub1 local495 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local77];
						if ((local495.anInt988 & 0x7F) == 64 && (local495.anInt989 & 0x7F) == 64) {
							for (local225 = 0; local225 < this.anInt424; local225++) {
								local405 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[this.anIntArray92[local225]];
								if (local405 != null && local405.aClass13_2.aByte16 == 1 && local405.anInt988 == local495.anInt988 && local405.anInt989 == local495.anInt989) {
									this.method99(local59, local405.aClass13_2, this.anIntArray92[local225], local65);
								}
							}
							for (local443 = 0; local443 < this.anInt332; local443++) {
								local453 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[this.anIntArray64[local443]];
								if (local453 != null && local453 != local495 && local453.anInt988 == local495.anInt988 && local453.anInt989 == local495.anInt989) {
									this.method122(local59, local65, local453, this.anIntArray64[local443]);
								}
							}
						}
						this.method122(local59, local65, local495, local77);
					}
					if (local71 == 3) {
						@Pc(614) Class29 local614 = this.aClass29ArrayArrayArray1[this.anInt246][local59][local65];
						if (local614 != null) {
							for (@Pc(621) Class1_Sub1_Sub1_Sub3 local621 = (Class1_Sub1_Sub1_Sub3) local614.method512(); local621 != null; local621 = (Class1_Sub1_Sub1_Sub3) local614.method514()) {
								@Pc(627) Class15 local627 = Class15.method361(local621.anInt179);
								if (this.anInt227 == 1) {
									this.aStringArray4[this.anInt322] = "Use " + this.aString5 + " with @lre@" + local627.aString25;
									this.anIntArray39[this.anInt322] = 111;
									this.anIntArray40[this.anInt322] = local621.anInt179;
									this.anIntArray37[this.anInt322] = local59;
									this.anIntArray38[this.anInt322] = local65;
									this.anInt322++;
								} else if (this.anInt425 != 1) {
									for (@Pc(744) int local744 = 4; local744 >= 0; local744--) {
										if (local627.aStringArray10 != null && local627.aStringArray10[local744] != null) {
											this.aStringArray4[this.anInt322] = local627.aStringArray10[local744] + " @lre@" + local627.aString25;
											if (local744 == 0) {
												this.anIntArray39[this.anInt322] = 139;
											}
											if (local744 == 1) {
												this.anIntArray39[this.anInt322] = 778;
											}
											if (local744 == 2) {
												this.anIntArray39[this.anInt322] = 617;
											}
											if (local744 == 3) {
												this.anIntArray39[this.anInt322] = 224;
											}
											if (local744 == 4) {
												this.anIntArray39[this.anInt322] = 662;
											}
											this.anIntArray40[this.anInt322] = local621.anInt179;
											this.anIntArray37[this.anInt322] = local59;
											this.anIntArray38[this.anInt322] = local65;
											this.anInt322++;
										} else if (local744 == 2) {
											this.aStringArray4[this.anInt322] = "Take @lre@" + local627.aString25;
											this.anIntArray39[this.anInt322] = 617;
											this.anIntArray40[this.anInt322] = local621.anInt179;
											this.anIntArray37[this.anInt322] = local59;
											this.anIntArray38[this.anInt322] = local65;
											this.anInt322++;
										}
									}
									this.aStringArray4[this.anInt322] = "Examine @lre@" + local627.aString25;
									this.anIntArray39[this.anInt322] = 1152;
									this.anIntArray40[this.anInt322] = local621.anInt179;
									this.anIntArray37[this.anInt322] = local59;
									this.anIntArray38[this.anInt322] = local65;
									this.anInt322++;
								} else if ((this.anInt427 & 0x1) == 1) {
									this.aStringArray4[this.anInt322] = this.aString16 + " @lre@" + local627.aString25;
									this.anIntArray39[this.anInt322] = 370;
									this.anIntArray40[this.anInt322] = local621.anInt179;
									this.anIntArray37[this.anInt322] = local59;
									this.anIntArray38[this.anInt322] = local65;
									this.anInt322++;
								}
							}
						}
					}
				}
			}
		} catch (@Pc(951) RuntimeException local951) {
			signlink.reporterror("43190, " + true + ", " + local951.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IB)Z")
	private boolean method134(@OriginalArg(0) int arg0) {
		try {
			if (arg0 < 0) {
				return false;
			}
			@Pc(8) int local8 = this.anIntArray39[arg0];
			if (local8 >= 2000) {
				local8 -= 2000;
			}
			return local8 == 605;
		} catch (@Pc(27) RuntimeException local27) {
			signlink.reporterror("72816, " + arg0 + ", " + 3 + ", " + local27.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIII)Z")
	private boolean method135(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		try {
			@Pc(7) int local7 = arg0 >> 14 & 0x7FFF;
			@Pc(16) int local16 = this.aClass37_1.method560(this.anInt246, arg1, arg2, arg0);
			if (local16 == -1) {
				return false;
			}
			@Pc(25) int local25 = local16 & 0x1F;
			@Pc(31) int local31 = local16 >> 6 & 0x3;
			anInt366++;
			if (anInt366 > 1086) {
				anInt366 = 0;
				this.aClass1_Sub1_Sub3_4.method469(170);
				this.aClass1_Sub1_Sub3_4.method470(0);
				@Pc(53) int local53 = this.aClass1_Sub1_Sub3_4.anInt742;
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
				this.aClass1_Sub1_Sub3_4.method479(this.aClass1_Sub1_Sub3_4.anInt742 - local53);
			}
			if (local25 == 10 || local25 == 11 || local25 == 22) {
				@Pc(133) Class9 local133 = Class9.method288(local7);
				@Pc(141) int local141;
				@Pc(144) int local144;
				if (local31 == 0 || local31 == 2) {
					local141 = local133.anInt513;
					local144 = local133.anInt514;
				} else {
					local141 = local133.anInt514;
					local144 = local133.anInt513;
				}
				@Pc(155) int local155 = local133.anInt525;
				if (local31 != 0) {
					local155 = (local155 << local31 & 0xF) + (local155 >> 4 - local31);
				}
				this.method150((byte) 2, 0, arg2, arg1, aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray273[0], local155, 0, 2, false, aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray272[0], local144, local141);
			} else {
				this.method150((byte) 2, local25 + 1, arg2, arg1, aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray273[0], 0, local31, 2, false, aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray272[0], 0, 0);
			}
			this.anInt310 = super.anInt203;
			this.anInt311 = super.anInt204;
			this.anInt313 = 2;
			this.anInt312 = 0;
			this.aClass1_Sub1_Sub3_4.method469(arg3);
			this.aClass1_Sub1_Sub3_4.method471(arg1 + this.anInt323);
			this.aClass1_Sub1_Sub3_4.method471(arg2 + this.anInt324);
			this.anInt368 += 0;
			this.aClass1_Sub1_Sub3_4.method471(local7);
			return true;
		} catch (@Pc(261) RuntimeException local261) {
			signlink.reporterror("3326, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + 0 + ", " + local261.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIII)I")
	private int method136(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		try {
			@Pc(3) int local3 = 256 - arg1;
			return ((arg2 & 0xFF00FF) * local3 + (arg0 & 0xFF00FF) * arg1 & 0xFF00FF00) + ((arg2 & 0xFF00) * local3 + (arg0 & 0xFF00) * arg1 & 0xFF0000) >> 8;
		} catch (@Pc(43) RuntimeException local43) {
			signlink.reporterror("82355, " + arg0 + ", " + arg1 + ", " + 30661 + ", " + arg2 + ", " + local43.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ZLclient!ib;II)V")
	private void method137(@OriginalArg(1) Class1_Sub1_Sub2_Sub2 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		try {
			@Pc(7) int local7 = this.anInt392 + this.anInt422 & 0x7FF;
			@Pc(21) int local21 = arg1 * arg1 + arg2 * arg2;
			if (local21 <= 6400) {
				@Pc(29) int local29 = Class1_Sub1_Sub1_Sub5.anIntArray151[local7];
				@Pc(33) int local33 = Class1_Sub1_Sub1_Sub5.anIntArray152[local7];
				@Pc(42) int local42 = local29 * 256 / (this.anInt269 + 256);
				@Pc(51) int local51 = local33 * 256 / (this.anInt269 + 256);
				@Pc(61) int local61 = arg2 * local42 + arg1 * local51 >> 16;
				@Pc(71) int local71 = arg2 * local51 - arg1 * local42 >> 16;
				if (local21 > 2500) {
					arg0.method397(local61 + 94 + 4 - arg0.anInt656 / 2, this.aClass1_Sub1_Sub2_Sub3_2, 83 - local71 - arg0.anInt657 / 2 - 4, this.anInt299);
				} else {
					arg0.method391(local61 + 94 + 4 - arg0.anInt656 / 2, 83 - local71 - arg0.anInt657 / 2 - 4);
				}
			}
		} catch (@Pc(126) RuntimeException local126) {
			signlink.reporterror("69524, " + false + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local126.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(BLclient!lb;I)V")
	private void method138(@OriginalArg(1) Class1_Sub1_Sub3 arg0, @OriginalArg(2) int arg1) {
		try {
			while (true) {
				if (arg0.anInt743 + 10 < arg1 * 8) {
					@Pc(12) int local12 = arg0.method491(11);
					if (local12 != 2047) {
						if (this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local12] == null) {
							this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local12] = new Class1_Sub1_Sub1_Sub1_Sub1();
							if (this.aClass1_Sub1_Sub3Array1[local12] != null) {
								this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local12].method39(this.aClass1_Sub1_Sub3Array1[local12]);
							}
						}
						this.anIntArray64[this.anInt332++] = local12;
						@Pc(58) Class1_Sub1_Sub1_Sub1_Sub1 local58 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local12];
						local58.anInt1028 = anInt297;
						@Pc(66) int local66 = arg0.method491(5);
						if (local66 > 15) {
							local66 -= 32;
						}
						@Pc(75) int local75 = arg0.method491(5);
						if (local75 > 15) {
							local75 -= 32;
						}
						@Pc(84) int local84 = arg0.method491(1);
						local58.method677(aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray273[0] + local75, local84 == 1, aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray272[0] + local66);
						@Pc(110) int local110 = arg0.method491(1);
						if (local110 == 1) {
							this.anIntArray65[this.anInt333++] = local12;
						}
						continue;
					}
				}
				arg0.method492(312);
				return;
			}
		} catch (@Pc(134) RuntimeException local134) {
			signlink.reporterror("1823, " + 4 + ", " + arg0 + ", " + arg1 + ", " + local134.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "n", descriptor = "(I)V")
	private void method139() {
		try {
			this.aBoolean55 = true;
			for (@Pc(10) int local10 = 0; local10 < 7; local10++) {
				this.anIntArray91[local10] = -1;
				for (@Pc(19) int local19 = 0; local19 < Class23.anInt750; local19++) {
					if (!Class23.aClass23Array1[local19].aBoolean192 && Class23.aClass23Array1[local19].anInt751 == local10 + (this.aBoolean76 ? 0 : 7)) {
						this.anIntArray91[local10] = local19;
						break;
					}
				}
			}
		} catch (@Pc(56) RuntimeException local56) {
			signlink.reporterror("8577, " + 0 + ", " + local56.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILclient!lb;Lclient!ab;II)V")
	private void method140(@OriginalArg(1) Class1_Sub1_Sub3 arg0, @OriginalArg(2) Class1_Sub1_Sub1_Sub1_Sub1 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		try {
			@Pc(14) int local14;
			if ((arg2 & 0x1) == 1) {
				local14 = arg0.method480();
				@Pc(17) byte[] local17 = new byte[local14];
				@Pc(23) Class1_Sub1_Sub3 local23 = new Class1_Sub1_Sub3(local17, -26728);
				arg0.method489(local14, local17);
				this.aClass1_Sub1_Sub3Array1[arg3] = local23;
				arg1.method39(local23);
			}
			@Pc(61) int local61;
			@Pc(73) int local73;
			if ((arg2 & 0x2) == 2) {
				local14 = arg0.method482();
				if (local14 == 65535) {
					local14 = -1;
				}
				if (local14 == arg1.anInt1011) {
					arg1.anInt1015 = 0;
				}
				local61 = arg0.method480();
				if (local14 == arg1.anInt1011 && local14 != -1) {
					local73 = Class27.aClass27Array1[local14].anInt802;
					if (local73 == 1) {
						arg1.anInt1012 = 0;
						arg1.anInt1013 = 0;
						arg1.anInt1014 = local61;
						arg1.anInt1015 = 0;
					}
					if (local73 == 2) {
						arg1.anInt1015 = 0;
					}
				} else if (local14 == -1 || arg1.anInt1011 == -1 || Class27.aClass27Array1[local14].anInt796 >= Class27.aClass27Array1[arg1.anInt1011].anInt796) {
					arg1.anInt1011 = local14;
					arg1.anInt1012 = 0;
					arg1.anInt1013 = 0;
					arg1.anInt1014 = local61;
					arg1.anInt1015 = 0;
					arg1.anInt1034 = arg1.anInt1032;
				}
			}
			if ((arg2 & 0x4) == 4) {
				arg1.anInt1005 = arg0.method482();
				if (arg1.anInt1005 == 65535) {
					arg1.anInt1005 = -1;
				}
			}
			if ((arg2 & 0x8) == 8) {
				arg1.aString31 = arg0.method487();
				if (arg1.aString31.charAt(0) == '~') {
					arg1.aString31 = arg1.aString31.substring(1);
					this.method227(2, arg1.aString3, arg1.aString31);
				} else if (arg1 == aClass1_Sub1_Sub1_Sub1_Sub1_1) {
					this.method227(2, arg1.aString3, arg1.aString31);
				}
				arg1.anInt1000 = 0;
				arg1.anInt1001 = 0;
				arg1.anInt999 = 150;
			}
			if ((arg2 & 0x10) == 16) {
				local14 = arg0.method480();
				local61 = arg0.method480();
				arg1.method681(local61, anInt297, local14);
				arg1.anInt1002 = anInt297 + 300;
				arg1.anInt1003 = arg0.method480();
				arg1.anInt1004 = arg0.method480();
			}
			if ((arg2 & 0x20) == 32) {
				arg1.anInt1006 = arg0.method482();
				arg1.anInt1007 = arg0.method482();
			}
			if ((arg2 & 0x40) == 64) {
				local14 = arg0.method482();
				local61 = arg0.method480();
				local73 = arg0.method480();
				@Pc(259) int local259 = arg0.anInt742;
				if (arg1.aString3 != null && arg1.aBoolean24) {
					@Pc(269) long local269 = Class48.method667(arg1.aString3);
					@Pc(271) boolean local271 = false;
					if (local61 <= 1) {
						for (@Pc(276) int local276 = 0; local276 < this.anInt274; local276++) {
							if (this.aLongArray4[local276] == local269) {
								local271 = true;
								break;
							}
						}
					}
					if (!local271 && this.anInt377 == 0) {
						try {
							@Pc(304) String local304 = Class49.method683(local73, arg0);
							@Pc(308) String local308 = Class42.method604(local304);
							arg1.aString31 = local308;
							arg1.anInt1000 = local14 >> 8;
							arg1.anInt1001 = local14 & 0xFF;
							arg1.anInt999 = 150;
							if (local61 == 2 || local61 == 3) {
								this.method227(1, "@cr2@" + arg1.aString3, local308);
							} else if (local61 == 1) {
								this.method227(1, "@cr1@" + arg1.aString3, local308);
							} else {
								this.method227(2, arg1.aString3, local308);
							}
						} catch (@Pc(372) Exception local372) {
							signlink.reporterror("cde2");
						}
					}
				}
				arg0.anInt742 = local259 + local73;
			}
			if ((arg2 & 0x100) == 256) {
				arg1.anInt1016 = arg0.method482();
				local14 = arg0.method485();
				arg1.anInt1020 = local14 >> 16;
				arg1.anInt1019 = anInt297 + (local14 & 0xFFFF);
				arg1.anInt1017 = 0;
				arg1.anInt1018 = 0;
				if (arg1.anInt1019 > anInt297) {
					arg1.anInt1017 = -1;
				}
				if (arg1.anInt1016 == 65535) {
					arg1.anInt1016 = -1;
				}
			}
			if ((arg2 & 0x200) == 512) {
				arg1.anInt1021 = arg0.method480();
				arg1.anInt1023 = arg0.method480();
				arg1.anInt1022 = arg0.method480();
				arg1.anInt1024 = arg0.method480();
				arg1.anInt1025 = arg0.method482() + anInt297;
				arg1.anInt1026 = arg0.method482() + anInt297;
				arg1.anInt1027 = arg0.method480();
				arg1.method679();
			}
			if ((arg2 & 0x400) == 1024) {
				local14 = arg0.method480();
				local61 = arg0.method480();
				arg1.method681(local61, anInt297, local14);
				arg1.anInt1002 = anInt297 + 300;
				arg1.anInt1003 = arg0.method480();
				arg1.anInt1004 = arg0.method480();
			}
		} catch (@Pc(496) RuntimeException local496) {
			signlink.reporterror("41065, " + -521 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local496.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "o", descriptor = "(I)V")
	private void method141() {
		try {
			for (@Pc(13) Class1_Sub2 local13 = (Class1_Sub2) this.aClass29_2.method511(); local13 != null; local13 = (Class1_Sub2) this.aClass29_2.method513()) {
				if (local13.anInt791 == -1) {
					local13.anInt790 = 0;
					this.method117(local13);
				} else {
					local13.method673();
				}
			}
		} catch (@Pc(40) RuntimeException local40) {
			signlink.reporterror("57235, " + 0 + ", " + local40.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(II)Ljava/lang/String;")
	private String method142(@OriginalArg(0) int arg0) {
		try {
			return arg0 < 999999999 ? String.valueOf(arg0) : "*";
		} catch (@Pc(17) RuntimeException local17) {
			signlink.reporterror("83120, " + arg0 + ", " + 0 + ", " + local17.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "i", descriptor = "(Z)V")
	private void method143() {
		try {
			this.aClass1_Sub1_Sub3_4.method469(165);
			this.aBoolean54 &= true;
			if (this.anInt376 != -1) {
				this.anInt376 = -1;
				this.aBoolean53 = true;
				this.aBoolean49 = false;
				this.aBoolean64 = true;
			}
			if (this.anInt217 != -1) {
				this.anInt217 = -1;
				this.aBoolean59 = true;
				this.aBoolean49 = false;
			}
			this.anInt378 = -1;
		} catch (@Pc(44) RuntimeException local44) {
			signlink.reporterror("57503, " + true + ", " + local44.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "j", descriptor = "(Z)V")
	private void method144() {
		try {
			@Pc(28) int local28;
			@Pc(56) int local56;
			@Pc(60) int local60;
			@Pc(69) int local69;
			@Pc(76) int local76;
			@Pc(139) int local139;
			@Pc(196) int local196;
			try {
				this.anInt358 = -1;
				this.aClass29_3.method515();
				this.aClass29_1.method515();
				Class1_Sub1_Sub2_Sub1.method345();
				this.method110();
				this.aClass37_1.method530(this.anInt398);
				for (local28 = 0; local28 < 4; local28++) {
					this.aClass19Array1[local28].method420(anInt395);
				}
				System.gc();
				@Pc(52) Class4 local52 = new Class4(104, this.anIntArrayArrayArray5, 104, this.aByteArrayArrayArray7, 0);
				local56 = this.aByteArrayArray2.length;
				Class4.aBoolean32 = Class37.aBoolean215;
				for (local60 = 0; local60 < local56; local60++) {
					local69 = this.anIntArray43[local60] >> 8;
					local76 = this.anIntArray43[local60] & 0xFF;
					if (local69 == 33 && local76 >= 71 && local76 <= 73) {
						Class4.aBoolean32 = false;
					}
				}
				if (Class4.aBoolean32) {
					this.aClass37_1.method531(978, this.anInt246);
				} else {
					this.aClass37_1.method531(978, 0);
				}
				this.aClass1_Sub1_Sub3_4.method469(115);
				@Pc(144) byte[] local144;
				for (local69 = 0; local69 < local56; local69++) {
					local76 = (this.anIntArray43[local69] >> 8) * 64 - this.anInt323;
					local139 = (this.anIntArray43[local69] & 0xFF) * 64 - this.anInt324;
					local144 = this.aByteArrayArray2[local69];
					if (local144 != null) {
						local52.method57((this.anInt226 - 6) * 8, local76, (this.anInt225 - 6) * 8, local139, local144);
					}
				}
				for (local76 = 0; local76 < local56; local76++) {
					local139 = (this.anIntArray43[local76] >> 8) * 64 - this.anInt323;
					local196 = (this.anIntArray43[local76] & 0xFF) * 64 - this.anInt324;
					@Pc(201) byte[] local201 = this.aByteArrayArray2[local76];
					if (local201 == null && this.anInt226 < 800) {
						local52.method56(local139, local196);
					}
				}
				this.aClass1_Sub1_Sub3_4.method469(115);
				@Pc(246) int local246;
				for (local139 = 0; local139 < local56; local139++) {
					local144 = this.aByteArrayArray1[local139];
					if (local144 != null) {
						local246 = (this.anIntArray43[local139] >> 8) * 64 - this.anInt323;
						@Pc(258) int local258 = (this.anIntArray43[local139] & 0xFF) * 64 - this.anInt324;
						local52.method60(local258, this.aClass19Array1, this.aClass37_1, local246, local144);
					}
				}
				this.aClass1_Sub1_Sub3_4.method469(115);
				local52.method62(this.aClass19Array1, this.aClass37_1);
				this.aClass35_5.method524(this.anInt255);
				this.aClass1_Sub1_Sub3_4.method469(115);
				for (local196 = 0; local196 < 104; local196++) {
					for (local246 = 0; local246 < 104; local246++) {
						this.method176(local196, local246);
					}
				}
				this.method141();
			} catch (@Pc(319) Exception local319) {
			}
			Class9.aClass40_4.method593();
			@Pc(333) int local333;
			if (aBoolean71 && signlink.aRandomAccessFile1 != null) {
				local28 = this.aClass44_Sub1_1.method638(0);
				for (local333 = 0; local333 < local28; local333++) {
					local56 = this.aClass44_Sub1_1.method643(local333);
					if ((local56 & 0x79) == 0) {
						Class1_Sub1_Sub1_Sub5.method260(local333, (byte) 3);
					}
				}
			}
			System.gc();
			Class1_Sub1_Sub2_Sub1.method346(7);
			this.aClass44_Sub1_1.method649();
			local28 = (this.anInt225 - 6) / 8 - 1;
			local333 = (this.anInt225 + 6) / 8 + 1;
			local56 = (this.anInt226 - 6) / 8 - 1;
			local60 = (this.anInt226 + 6) / 8 + 1;
			if (this.aBoolean86) {
				local28 = 49;
				local333 = 50;
				local56 = 49;
				local60 = 50;
			}
			for (local69 = local28; local69 <= local333; local69++) {
				for (local76 = local56; local76 <= local60; local76++) {
					if (local69 == local28 || local69 == local333 || local76 == local56 || local76 == local60) {
						local139 = this.aClass44_Sub1_1.method640(local76, 905, 0, local69);
						if (local139 != -1) {
							this.aClass44_Sub1_1.method650(3, local139);
						}
						local196 = this.aClass44_Sub1_1.method640(local76, 905, 1, local69);
						if (local196 != -1) {
							this.aClass44_Sub1_1.method650(3, local196);
						}
					}
				}
			}
		} catch (@Pc(471) RuntimeException local471) {
			signlink.reporterror("33672, " + true + ", " + local471.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(B)V")
	private void method145() {
		try {
			@Pc(6) int local6 = this.anInt287 * 128 + 64;
			@Pc(13) int local13 = this.anInt288 * 128 + 64;
			@Pc(24) int local24 = this.method223(local6, this.anInt246, local13) - this.anInt289;
			if (this.anInt381 < local6) {
				this.anInt381 += this.anInt290 + (local6 - this.anInt381) * this.anInt291 / 1000;
				if (this.anInt381 > local6) {
					this.anInt381 = local6;
				}
			}
			if (this.anInt381 > local6) {
				this.anInt381 -= this.anInt290 + (this.anInt381 - local6) * this.anInt291 / 1000;
				if (this.anInt381 < local6) {
					this.anInt381 = local6;
				}
			}
			if (this.anInt382 < local24) {
				this.anInt382 += this.anInt290 + (local24 - this.anInt382) * this.anInt291 / 1000;
				if (this.anInt382 > local24) {
					this.anInt382 = local24;
				}
			}
			if (this.anInt382 > local24) {
				this.anInt382 -= this.anInt290 + (this.anInt382 - local24) * this.anInt291 / 1000;
				if (this.anInt382 < local24) {
					this.anInt382 = local24;
				}
			}
			if (this.anInt383 < local13) {
				this.anInt383 += this.anInt290 + (local13 - this.anInt383) * this.anInt291 / 1000;
				if (this.anInt383 > local13) {
					this.anInt383 = local13;
				}
			}
			if (this.anInt383 > local13) {
				this.anInt383 -= this.anInt290 + (this.anInt383 - local13) * this.anInt291 / 1000;
				if (this.anInt383 < local13) {
					this.anInt383 = local13;
				}
			}
			local6 = this.anInt414 * 128 + 64;
			local13 = this.anInt415 * 128 + 64;
			local24 = this.method223(local6, this.anInt246, local13) - this.anInt416;
			@Pc(227) int local227 = local6 - this.anInt381;
			@Pc(232) int local232 = local24 - this.anInt382;
			@Pc(237) int local237 = local13 - this.anInt383;
			@Pc(248) int local248 = (int) Math.sqrt((double) (local227 * local227 + local237 * local237));
			@Pc(259) int local259 = (int) (Math.atan2((double) local232, (double) local248) * 325.949D) & 0x7FF;
			@Pc(270) int local270 = (int) (Math.atan2((double) local227, (double) local237) * -325.949D) & 0x7FF;
			if (local259 < 128) {
				local259 = 128;
			}
			if (local259 > 383) {
				local259 = 383;
			}
			if (this.anInt384 < local259) {
				this.anInt384 += this.anInt417 + (local259 - this.anInt384) * this.anInt418 / 1000;
				if (this.anInt384 > local259) {
					this.anInt384 = local259;
				}
			}
			if (this.anInt384 > local259) {
				this.anInt384 -= this.anInt417 + (this.anInt384 - local259) * this.anInt418 / 1000;
				if (this.anInt384 < local259) {
					this.anInt384 = local259;
				}
			}
			@Pc(341) int local341 = local270 - this.anInt385;
			if (local341 > 1024) {
				local341 -= 2048;
			}
			if (local341 < -1024) {
				local341 += 2048;
			}
			if (local341 > 0) {
				this.anInt385 += this.anInt417 + local341 * this.anInt418 / 1000;
				this.anInt385 &= 0x7FF;
			}
			if (local341 < 0) {
				this.anInt385 -= this.anInt417 + -local341 * this.anInt418 / 1000;
				this.anInt385 &= 0x7FF;
			}
			@Pc(399) int local399 = local270 - this.anInt385;
			if (local399 > 1024) {
				local399 -= 2048;
			}
			if (local399 < -1024) {
				local399 += 2048;
			}
			if (local399 < 0 && local341 > 0 || local399 > 0 && local341 < 0) {
				this.anInt385 = local270;
			}
		} catch (@Pc(420) RuntimeException local420) {
			signlink.reporterror("50211, " + 45 + ", " + local420.toString());
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

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILclient!y;I)V")
	private void method146(@OriginalArg(1) Class1_Sub1_Sub1_Sub1 arg0, @OriginalArg(2) int arg1) {
		try {
			if (this.anInt356 == -34963) {
				this.method147(arg0.anInt989, arg1, arg0.anInt988, 736);
			}
		} catch (@Pc(14) RuntimeException local14) {
			signlink.reporterror("22530, " + -34963 + ", " + arg0 + ", " + arg1 + ", " + local14.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(IIII)V")
	private void method147(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		try {
			if (arg2 >= 128 && arg0 >= 128 && arg2 <= 13056 && arg0 <= 13056) {
				@Pc(28) int local28 = this.method223(arg2, this.anInt246, arg0) - arg1;
				@Pc(33) int local33 = arg2 - this.anInt381;
				@Pc(38) int local38 = local28 - this.anInt382;
				@Pc(43) int local43 = arg0 - this.anInt383;
				@Pc(48) int local48 = Class1_Sub1_Sub1_Sub5.anIntArray151[this.anInt384];
				@Pc(53) int local53 = Class1_Sub1_Sub1_Sub5.anIntArray152[this.anInt384];
				@Pc(57) boolean local57 = false;
				@Pc(62) int local62 = Class1_Sub1_Sub1_Sub5.anIntArray151[this.anInt385];
				@Pc(67) int local67 = Class1_Sub1_Sub1_Sub5.anIntArray152[this.anInt385];
				@Pc(77) int local77 = local43 * local62 + local33 * local67 >> 16;
				@Pc(87) int local87 = local43 * local67 - local33 * local62 >> 16;
				@Pc(89) int local89 = local77;
				@Pc(99) int local99 = local38 * local53 - local87 * local48 >> 16;
				@Pc(109) int local109 = local38 * local48 + local87 * local53 >> 16;
				if (local109 >= 50) {
					this.anInt387 = Class1_Sub1_Sub2_Sub1.anInt595 + (local89 << 9) / local109;
					this.anInt388 = Class1_Sub1_Sub2_Sub1.anInt596 + (local99 << 9) / local109;
				} else {
					this.anInt387 = -1;
					this.anInt388 = -1;
				}
			} else {
				this.anInt387 = -1;
				this.anInt388 = -1;
			}
		} catch (@Pc(141) RuntimeException local141) {
			signlink.reporterror("3284, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local141.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "p", descriptor = "(I)V")
	private void method148() {
		try {
			for (@Pc(3) int local3 = 0; local3 < this.anInt317; local3++) {
				if (this.anIntArray36[local3] <= 0) {
					@Pc(12) boolean local12 = false;
					try {
						if (this.anIntArray42[local3] != this.anInt243 || this.anIntArray89[local3] != this.anInt355) {
							@Pc(45) Class1_Sub1_Sub3 local45 = Class5.method79(this.anIntArray89[local3], this.anIntArray42[local3]);
							if (System.currentTimeMillis() + (long) (local45.anInt742 / 22) > this.aLong15 + (long) (this.anInt259 / 22)) {
								this.anInt259 = local45.anInt742;
								this.aLong15 = System.currentTimeMillis();
								if (this.method163(local45.anInt742, local45.aByteArray9)) {
									this.anInt243 = this.anIntArray42[local3];
									this.anInt355 = this.anIntArray89[local3];
								} else {
									local12 = true;
								}
							}
						} else if (!this.method178()) {
							local12 = true;
						}
					} catch (@Pc(95) Exception local95) {
					}
					if (local12 && this.anIntArray36[local3] != -5) {
						this.anIntArray36[local3] = -5;
					} else {
						this.anInt317--;
						for (@Pc(111) int local111 = local3; local111 < this.anInt317; local111++) {
							this.anIntArray42[local111] = this.anIntArray42[local111 + 1];
							this.anIntArray89[local111] = this.anIntArray89[local111 + 1];
							this.anIntArray36[local111] = this.anIntArray36[local111 + 1];
						}
						local3--;
					}
				} else {
					@Pc(163) int local163 = this.anIntArray36[local3]--;
				}
			}
			if (this.anInt295 > 0) {
				this.anInt295 -= 20;
				if (this.anInt295 < 0) {
					this.anInt295 = 0;
				}
				if (this.anInt295 == 0 && this.aBoolean79 && !aBoolean71) {
					this.anInt357 = this.anInt302;
					this.aBoolean73 = true;
					this.aClass44_Sub1_1.method645(2, this.anInt357);
					return;
				}
			}
		} catch (@Pc(223) RuntimeException local223) {
			signlink.reporterror("36980, " + 9 + ", " + local223.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "q", descriptor = "(I)V")
	private void method149(@OriginalArg(0) int arg0) {
		try {
			@Pc(7) int local7 = this.aClass1_Sub1_Sub2_Sub4_3.method449("Choose Option");
			if (arg0 >= 0) {
				this.anInt356 = -305;
			}
			@Pc(25) int local25;
			for (@Pc(14) int local14 = 0; local14 < this.anInt322; local14++) {
				local25 = this.aClass1_Sub1_Sub2_Sub4_3.method449(this.aStringArray4[local14]);
				if (local25 > local7) {
					local7 = local25;
				}
			}
			local7 += 8;
			local25 = this.anInt322 * 15 + 21;
			@Pc(68) int local68;
			@Pc(86) int local86;
			if (super.anInt203 > 4 && super.anInt204 > 4 && super.anInt203 < 516 && super.anInt204 < 338) {
				local68 = super.anInt203 - local7 / 2 - 4;
				if (local68 + local7 > 512) {
					local68 = 512 - local7;
				}
				if (local68 < 0) {
					local68 = 0;
				}
				local86 = super.anInt204 - 4;
				if (local86 + local25 > 334) {
					local86 = 334 - local25;
				}
				if (local86 < 0) {
					local86 = 0;
				}
				this.aBoolean78 = true;
				this.anInt360 = 0;
				this.anInt361 = local68;
				this.anInt362 = local86;
				this.anInt363 = local7;
				this.anInt364 = this.anInt322 * 15 + 22;
			}
			if (super.anInt203 > 553 && super.anInt204 > 205 && super.anInt203 < 743 && super.anInt204 < 466) {
				local68 = super.anInt203 - local7 / 2 - 553;
				if (local68 < 0) {
					local68 = 0;
				} else if (local68 + local7 > 190) {
					local68 = 190 - local7;
				}
				local86 = super.anInt204 - 205;
				if (local86 < 0) {
					local86 = 0;
				} else if (local86 + local25 > 261) {
					local86 = 261 - local25;
				}
				this.aBoolean78 = true;
				this.anInt360 = 1;
				this.anInt361 = local68;
				this.anInt362 = local86;
				this.anInt363 = local7;
				this.anInt364 = this.anInt322 * 15 + 22;
			}
			if (super.anInt203 > 17 && super.anInt204 > 357 && super.anInt203 < 496 && super.anInt204 < 453) {
				local68 = super.anInt203 - local7 / 2 - 17;
				if (local68 < 0) {
					local68 = 0;
				} else if (local68 + local7 > 479) {
					local68 = 479 - local7;
				}
				local86 = super.anInt204 - 357;
				if (local86 < 0) {
					local86 = 0;
				} else if (local86 + local25 > 96) {
					local86 = 96 - local25;
				}
				this.aBoolean78 = true;
				this.anInt360 = 2;
				this.anInt361 = local68;
				this.anInt362 = local86;
				this.anInt363 = local7;
				this.anInt364 = this.anInt322 * 15 + 22;
			}
		} catch (@Pc(290) RuntimeException local290) {
			signlink.reporterror("1865, " + arg0 + ", " + local290.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(BIIIIIIIZIII)Z")
	private boolean method150(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11) {
		try {
			@Pc(11) int local11;
			for (@Pc(7) int local7 = 0; local7 < 104; local7++) {
				for (local11 = 0; local11 < 104; local11++) {
					this.anIntArrayArray4[local7][local11] = 0;
					this.anIntArrayArray6[local7][local11] = 99999999;
				}
			}
			local11 = arg9;
			@Pc(39) int local39 = arg4;
			this.anIntArrayArray4[arg9][arg4] = 99;
			this.anIntArrayArray6[arg9][arg4] = 0;
			@Pc(55) byte local55 = 0;
			@Pc(57) int local57 = 0;
			this.anIntArray73[0] = arg9;
			@Pc(66) int local66 = local55 + 1;
			this.anIntArray74[0] = arg4;
			@Pc(70) boolean local70 = false;
			@Pc(74) int local74 = this.anIntArray73.length;
			@Pc(81) int[][] local81 = this.aClass19Array1[this.anInt246].anIntArrayArray18;
			@Pc(192) int local192;
			while (local57 != local66) {
				local11 = this.anIntArray73[local57];
				local39 = this.anIntArray74[local57];
				local57 = (local57 + 1) % local74;
				if (local11 == arg3 && local39 == arg2) {
					local70 = true;
					break;
				}
				if (arg1 != 0) {
					if ((arg1 < 5 || arg1 == 10) && this.aClass19Array1[this.anInt246].method429(arg3, local11, arg2, local39, arg1 - 1, arg6)) {
						local70 = true;
						break;
					}
					if (arg1 < 10 && this.aClass19Array1[this.anInt246].method430(arg2, arg6, local39, arg3, local11, arg1 - 1)) {
						local70 = true;
						break;
					}
				}
				if (arg11 != 0 && arg10 != 0 && this.aClass19Array1[this.anInt246].method431(arg3, arg5, local39, arg11, arg2, arg10, local11)) {
					local70 = true;
					break;
				}
				local192 = this.anIntArrayArray6[local11][local39] + 1;
				if (local11 > 0 && this.anIntArrayArray4[local11 - 1][local39] == 0 && (local81[local11 - 1][local39] & 0x280108) == 0) {
					this.anIntArray73[local66] = local11 - 1;
					this.anIntArray74[local66] = local39;
					local66 = (local66 + 1) % local74;
					this.anIntArrayArray4[local11 - 1][local39] = 2;
					this.anIntArrayArray6[local11 - 1][local39] = local192;
				}
				if (local11 < 103 && this.anIntArrayArray4[local11 + 1][local39] == 0 && (local81[local11 + 1][local39] & 0x280180) == 0) {
					this.anIntArray73[local66] = local11 + 1;
					this.anIntArray74[local66] = local39;
					local66 = (local66 + 1) % local74;
					this.anIntArrayArray4[local11 + 1][local39] = 8;
					this.anIntArrayArray6[local11 + 1][local39] = local192;
				}
				if (local39 > 0 && this.anIntArrayArray4[local11][local39 - 1] == 0 && (local81[local11][local39 - 1] & 0x280102) == 0) {
					this.anIntArray73[local66] = local11;
					this.anIntArray74[local66] = local39 - 1;
					local66 = (local66 + 1) % local74;
					this.anIntArrayArray4[local11][local39 - 1] = 1;
					this.anIntArrayArray6[local11][local39 - 1] = local192;
				}
				if (local39 < 103 && this.anIntArrayArray4[local11][local39 + 1] == 0 && (local81[local11][local39 + 1] & 0x280120) == 0) {
					this.anIntArray73[local66] = local11;
					this.anIntArray74[local66] = local39 + 1;
					local66 = (local66 + 1) % local74;
					this.anIntArrayArray4[local11][local39 + 1] = 4;
					this.anIntArrayArray6[local11][local39 + 1] = local192;
				}
				if (local11 > 0 && local39 > 0 && this.anIntArrayArray4[local11 - 1][local39 - 1] == 0 && (local81[local11 - 1][local39 - 1] & 0x28010E) == 0 && (local81[local11 - 1][local39] & 0x280108) == 0 && (local81[local11][local39 - 1] & 0x280102) == 0) {
					this.anIntArray73[local66] = local11 - 1;
					this.anIntArray74[local66] = local39 - 1;
					local66 = (local66 + 1) % local74;
					this.anIntArrayArray4[local11 - 1][local39 - 1] = 3;
					this.anIntArrayArray6[local11 - 1][local39 - 1] = local192;
				}
				if (local11 < 103 && local39 > 0 && this.anIntArrayArray4[local11 + 1][local39 - 1] == 0 && (local81[local11 + 1][local39 - 1] & 0x280183) == 0 && (local81[local11 + 1][local39] & 0x280180) == 0 && (local81[local11][local39 - 1] & 0x280102) == 0) {
					this.anIntArray73[local66] = local11 + 1;
					this.anIntArray74[local66] = local39 - 1;
					local66 = (local66 + 1) % local74;
					this.anIntArrayArray4[local11 + 1][local39 - 1] = 9;
					this.anIntArrayArray6[local11 + 1][local39 - 1] = local192;
				}
				if (local11 > 0 && local39 < 103 && this.anIntArrayArray4[local11 - 1][local39 + 1] == 0 && (local81[local11 - 1][local39 + 1] & 0x280138) == 0 && (local81[local11 - 1][local39] & 0x280108) == 0 && (local81[local11][local39 + 1] & 0x280120) == 0) {
					this.anIntArray73[local66] = local11 - 1;
					this.anIntArray74[local66] = local39 + 1;
					local66 = (local66 + 1) % local74;
					this.anIntArrayArray4[local11 - 1][local39 + 1] = 6;
					this.anIntArrayArray6[local11 - 1][local39 + 1] = local192;
				}
				if (local11 < 103 && local39 < 103 && this.anIntArrayArray4[local11 + 1][local39 + 1] == 0 && (local81[local11 + 1][local39 + 1] & 0x2801E0) == 0 && (local81[local11 + 1][local39] & 0x280180) == 0 && (local81[local11][local39 + 1] & 0x280120) == 0) {
					this.anIntArray73[local66] = local11 + 1;
					this.anIntArray74[local66] = local39 + 1;
					local66 = (local66 + 1) % local74;
					this.anIntArrayArray4[local11 + 1][local39 + 1] = 12;
					this.anIntArrayArray6[local11 + 1][local39 + 1] = local192;
				}
			}
			this.anInt268 = 0;
			@Pc(808) int local808;
			@Pc(814) int local814;
			@Pc(820) int local820;
			if (!local70) {
				if (arg8) {
					local192 = 100;
					for (local808 = 1; local808 < 2; local808++) {
						for (local814 = arg3 - local808; local814 <= arg3 + local808; local814++) {
							for (local820 = arg2 - local808; local820 <= arg2 + local808; local820++) {
								if (local814 >= 0 && local820 >= 0 && local814 < 104 && local820 < 104 && this.anIntArrayArray6[local814][local820] < local192) {
									local192 = this.anIntArrayArray6[local814][local820];
									local11 = local814;
									local39 = local820;
									this.anInt268 = 1;
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
			this.anIntArray73[0] = local11;
			local57 = local881 + 1;
			this.anIntArray74[0] = local39;
			local192 = local808 = this.anIntArrayArray4[local11][local39];
			@Pc(906) boolean local906 = false;
			while (local11 != arg9 || local39 != arg4) {
				if (local192 != local808) {
					local808 = local192;
					this.anIntArray73[local57] = local11;
					this.anIntArray74[local57++] = local39;
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
				local814 = this.anIntArray73[local57];
				local820 = this.anIntArray74[local57];
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
				this.aClass1_Sub1_Sub3_4.method471(local814 + this.anInt323);
				this.aClass1_Sub1_Sub3_4.method471(local820 + this.anInt324);
				this.anInt275 = this.anIntArray73[0];
				this.anInt276 = this.anIntArray74[0];
				for (@Pc(1083) int local1083 = 1; local1083 < local74; local1083++) {
					local57--;
					this.aClass1_Sub1_Sub3_4.method470(this.anIntArray73[local57] - local814);
					this.aClass1_Sub1_Sub3_4.method470(this.anIntArray74[local57] - local820);
				}
				return true;
			} else if (arg7 == 1) {
				return false;
			} else {
				return true;
			}
		} catch (@Pc(1118) RuntimeException local1118) {
			signlink.reporterror("57633, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + arg10 + ", " + arg11 + ", " + local1118.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "f", descriptor = "(B)V")
	private void method151() {
		try {
			@Pc(3) int local3 = 5;
			this.anIntArray69[8] = 0;
			@Pc(10) int local10 = 0;
			while (this.anIntArray69[8] == 0) {
				@Pc(20) String local20 = "Unknown problem";
				this.method96(20, "Connecting to web server");
				try {
					@Pc(42) DataInputStream local42 = this.method169("crc" + (int) (Math.random() * 9.9999999E7D) + "-" + 299);
					@Pc(49) Class1_Sub1_Sub3 local49 = new Class1_Sub1_Sub3(new byte[40], -26728);
					local42.readFully(local49.aByteArray9, 0, 40);
					local42.close();
					for (@Pc(59) int local59 = 0; local59 < 9; local59++) {
						this.anIntArray69[local59] = local49.method485();
					}
					@Pc(74) int local74 = local49.method485();
					@Pc(76) int local76 = 1234;
					for (@Pc(78) int local78 = 0; local78 < 9; local78++) {
						local76 = (local76 << 1) + this.anIntArray69[local78];
					}
					if (local74 != local76) {
						local20 = "checksum problem";
						this.anIntArray69[8] = 0;
					}
				} catch (@Pc(105) EOFException local105) {
					local20 = "EOF problem";
					this.anIntArray69[8] = 0;
				} catch (@Pc(114) IOException local114) {
					local20 = "connection problem";
					this.anIntArray69[8] = 0;
				} catch (@Pc(123) Exception local123) {
					local20 = "logic problem";
					this.anIntArray69[8] = 0;
					if (!signlink.reporterror) {
						return;
					}
				}
				if (this.anIntArray69[8] == 0) {
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
					this.aBoolean74 = !this.aBoolean74;
				}
			}
		} catch (@Pc(203) RuntimeException local203) {
			signlink.reporterror("87587, " + -69 + ", " + local203.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "r", descriptor = "(I)V")
	private void method152() {
		try {
			if (this.anInt375 != -31809) {
				this.anInt369 = this.aClass1_Sub1_Sub3_3.method480();
			}
			if (super.anInt202 == 1) {
				if (super.anInt203 >= 6 && super.anInt203 <= 106 && super.anInt204 >= 467 && super.anInt204 <= 499) {
					this.anInt216 = (this.anInt216 + 1) % 4;
					this.aBoolean45 = true;
					this.aBoolean59 = true;
					this.aClass1_Sub1_Sub3_4.method469(242);
					this.aClass1_Sub1_Sub3_4.method470(this.anInt216);
					this.aClass1_Sub1_Sub3_4.method470(this.anInt421);
					this.aClass1_Sub1_Sub3_4.method470(this.anInt296);
				}
				if (super.anInt203 >= 135 && super.anInt203 <= 235 && super.anInt204 >= 467 && super.anInt204 <= 499) {
					this.anInt421 = (this.anInt421 + 1) % 3;
					this.aBoolean45 = true;
					this.aBoolean59 = true;
					this.aClass1_Sub1_Sub3_4.method469(242);
					this.aClass1_Sub1_Sub3_4.method470(this.anInt216);
					this.aClass1_Sub1_Sub3_4.method470(this.anInt421);
					this.aClass1_Sub1_Sub3_4.method470(this.anInt296);
				}
				if (super.anInt203 >= 273 && super.anInt203 <= 373 && super.anInt204 >= 467 && super.anInt204 <= 499) {
					this.anInt296 = (this.anInt296 + 1) % 3;
					this.aBoolean45 = true;
					this.aBoolean59 = true;
					this.aClass1_Sub1_Sub3_4.method469(242);
					this.aClass1_Sub1_Sub3_4.method470(this.anInt216);
					this.aClass1_Sub1_Sub3_4.method470(this.anInt421);
					this.aClass1_Sub1_Sub3_4.method470(this.anInt296);
				}
				if (super.anInt203 >= 412 && super.anInt203 <= 512 && super.anInt204 >= 467 && super.anInt204 <= 499) {
					if (this.anInt378 == -1) {
						this.method143();
						this.aString12 = "";
						this.aBoolean82 = false;
						for (@Pc(193) int local193 = 0; local193 < Class6.aClass6Array1.length; local193++) {
							if (Class6.aClass6Array1[local193] != null && Class6.aClass6Array1[local193].anInt436 == 600) {
								this.anInt340 = this.anInt378 = Class6.aClass6Array1[local193].anInt433;
								return;
							}
						}
						return;
					}
					this.method227(0, "", "Please close the interface you have open before using 'report abuse'");
					return;
				}
			}
		} catch (@Pc(229) RuntimeException local229) {
			signlink.reporterror("65290, " + -31809 + ", " + local229.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
	@Override
	public String getParameter(@OriginalArg(0) String arg0) {
		return signlink.mainapp == null ? super.getParameter(arg0) : signlink.mainapp.getParameter(arg0);
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(II)V")
	private void method153(@OriginalArg(0) int arg0) {
		try {
			if (arg0 >= 0) {
				if (this.aBoolean43) {
					this.aBoolean43 = false;
					this.aBoolean59 = true;
				}
				@Pc(18) int local18 = this.anIntArray37[arg0];
				@Pc(23) int local23 = this.anIntArray38[arg0];
				@Pc(28) int local28 = this.anIntArray39[arg0];
				@Pc(33) int local33 = this.anIntArray40[arg0];
				if (local28 >= 2000) {
					local28 -= 2000;
				}
				if (local28 == 563) {
					this.aClass1_Sub1_Sub3_4.method469(199);
					this.aClass1_Sub1_Sub3_4.method471(local33);
					this.aClass1_Sub1_Sub3_4.method471(local18);
					this.aClass1_Sub1_Sub3_4.method471(local23);
					this.aClass1_Sub1_Sub3_4.method471(this.anInt426);
					this.anInt249 = 0;
					this.anInt250 = local23;
					this.anInt251 = local18;
					this.anInt252 = 2;
					if (Class6.aClass6Array1[local23].anInt433 == this.anInt378) {
						this.anInt252 = 1;
					}
					if (Class6.aClass6Array1[local23].anInt433 == this.anInt217) {
						this.anInt252 = 3;
					}
				}
				@Pc(128) boolean local128;
				if (local28 == 111) {
					local128 = this.method150((byte) 2, 0, local23, local18, aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray273[0], 0, 0, 2, false, aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray272[0], 0, 0);
					if (!local128) {
						this.method150((byte) 2, 0, local23, local18, aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray273[0], 0, 0, 2, false, aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray272[0], 1, 1);
					}
					this.anInt310 = super.anInt203;
					this.anInt311 = super.anInt204;
					this.anInt313 = 2;
					this.anInt312 = 0;
					this.aClass1_Sub1_Sub3_4.method469(163);
					this.aClass1_Sub1_Sub3_4.method471(local18 + this.anInt323);
					this.aClass1_Sub1_Sub3_4.method471(local23 + this.anInt324);
					this.aClass1_Sub1_Sub3_4.method471(local33);
					this.aClass1_Sub1_Sub3_4.method471(this.anInt230);
					this.aClass1_Sub1_Sub3_4.method471(this.anInt228);
					this.aClass1_Sub1_Sub3_4.method471(this.anInt229);
				}
				if (local28 == 899 && this.method135(local33, local18, local23, 124)) {
					this.aClass1_Sub1_Sub3_4.method471(this.anInt426);
				}
				@Pc(234) String local234;
				@Pc(225) Class15 local225;
				if (local28 == 1152) {
					local225 = Class15.method361(local33);
					if (local225.aByteArray6 == null) {
						local234 = "It's a " + local225.aString25 + ".";
					} else {
						local234 = new String(local225.aByteArray6);
					}
					this.method227(0, "", local234);
				}
				@Pc(261) Class1_Sub1_Sub1_Sub1_Sub1 local261;
				if (local28 == 275) {
					local261 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local33];
					if (local261 != null) {
						this.method150((byte) 2, 0, local261.anIntArray273[0], local261.anIntArray272[0], aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray273[0], 0, 0, 2, false, aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray272[0], 1, 1);
						this.anInt310 = super.anInt203;
						this.anInt311 = super.anInt204;
						this.anInt313 = 2;
						this.anInt312 = 0;
						this.aClass1_Sub1_Sub3_4.method469(136);
						this.aClass1_Sub1_Sub3_4.method471(local33);
						this.aClass1_Sub1_Sub3_4.method471(this.anInt230);
						this.aClass1_Sub1_Sub3_4.method471(this.anInt228);
						this.aClass1_Sub1_Sub3_4.method471(this.anInt229);
					}
				}
				if (local28 == 1071) {
					this.method135(local33, local18, local23, 253);
				}
				@Pc(355) Class6 local355;
				@Pc(373) int local373;
				if (local28 == 435) {
					this.aClass1_Sub1_Sub3_4.method469(62);
					this.aClass1_Sub1_Sub3_4.method471(local23);
					local355 = Class6.aClass6Array1[local23];
					if (local355.anIntArrayArray7 != null && local355.anIntArrayArray7[0][0] == 5) {
						local373 = local355.anIntArrayArray7[0][1];
						this.anIntArray50[local373] = 1 - this.anIntArray50[local373];
						this.method218(local373, this.aByte8);
						this.aBoolean53 = true;
					}
				}
				if (local28 == 370) {
					local128 = this.method150((byte) 2, 0, local23, local18, aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray273[0], 0, 0, 2, false, aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray272[0], 0, 0);
					if (!local128) {
						this.method150((byte) 2, 0, local23, local18, aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray273[0], 0, 0, 2, false, aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray272[0], 1, 1);
					}
					this.anInt310 = super.anInt203;
					this.anInt311 = super.anInt204;
					this.anInt313 = 2;
					this.anInt312 = 0;
					this.aClass1_Sub1_Sub3_4.method469(195);
					this.aClass1_Sub1_Sub3_4.method471(local18 + this.anInt323);
					this.aClass1_Sub1_Sub3_4.method471(local23 + this.anInt324);
					this.aClass1_Sub1_Sub3_4.method471(local33);
					this.aClass1_Sub1_Sub3_4.method471(this.anInt426);
				}
				if (local28 == 810 && this.method135(local33, local18, local23, 215)) {
					this.aClass1_Sub1_Sub3_4.method471(this.anInt230);
					this.aClass1_Sub1_Sub3_4.method471(this.anInt228);
					this.aClass1_Sub1_Sub3_4.method471(this.anInt229);
				}
				if (local28 == 997 && !this.aBoolean49) {
					this.aClass1_Sub1_Sub3_4.method469(223);
					this.aClass1_Sub1_Sub3_4.method471(local23);
					this.aBoolean49 = true;
				}
				if (local28 == 139 || local28 == 778 || local28 == 617 || local28 == 224 || local28 == 662) {
					local128 = this.method150((byte) 2, 0, local23, local18, aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray273[0], 0, 0, 2, false, aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray272[0], 0, 0);
					if (!local128) {
						this.method150((byte) 2, 0, local23, local18, aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray273[0], 0, 0, 2, false, aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray272[0], 1, 1);
					}
					this.anInt310 = super.anInt203;
					this.anInt311 = super.anInt204;
					this.anInt313 = 2;
					this.anInt312 = 0;
					if (local28 == 139) {
						if ((local18 & 0x3) == 0) {
							anInt244++;
						}
						if (anInt244 >= 123) {
							this.aClass1_Sub1_Sub3_4.method469(58);
							this.aClass1_Sub1_Sub3_4.method474(0);
						}
						this.aClass1_Sub1_Sub3_4.method469(27);
					}
					if (local28 == 662) {
						anInt209 += this.anInt324;
						if (anInt209 >= 118) {
							this.aClass1_Sub1_Sub3_4.method469(26);
							this.aClass1_Sub1_Sub3_4.method474(0);
						}
						this.aClass1_Sub1_Sub3_4.method469(211);
					}
					if (local28 == 617) {
						this.aClass1_Sub1_Sub3_4.method469(60);
					}
					if (local28 == 224) {
						anInt212 += local23;
						if (anInt212 >= 75) {
							this.aClass1_Sub1_Sub3_4.method469(41);
							this.aClass1_Sub1_Sub3_4.method470(19);
						}
						this.aClass1_Sub1_Sub3_4.method469(123);
					}
					if (local28 == 778) {
						this.aClass1_Sub1_Sub3_4.method469(42);
					}
					this.aClass1_Sub1_Sub3_4.method471(local18 + this.anInt323);
					this.aClass1_Sub1_Sub3_4.method471(local23 + this.anInt324);
					this.aClass1_Sub1_Sub3_4.method471(local33);
				}
				@Pc(728) Class1_Sub1_Sub1_Sub1_Sub2 local728;
				if (local28 == 242 || local28 == 209 || local28 == 309 || local28 == 852 || local28 == 793) {
					local728 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local33];
					if (local728 != null) {
						this.method150((byte) 2, 0, local728.anIntArray273[0], local728.anIntArray272[0], aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray273[0], 0, 0, 2, false, aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray272[0], 1, 1);
						this.anInt310 = super.anInt203;
						this.anInt311 = super.anInt204;
						this.anInt313 = 2;
						this.anInt312 = 0;
						if (local28 == 309) {
							this.aClass1_Sub1_Sub3_4.method469(239);
						}
						if (local28 == 852) {
							this.aClass1_Sub1_Sub3_4.method469(22);
						}
						if (local28 == 793) {
							this.aClass1_Sub1_Sub3_4.method469(188);
						}
						if (local28 == 209) {
							this.aClass1_Sub1_Sub3_4.method469(4);
						}
						if (local28 == 242) {
							this.aClass1_Sub1_Sub3_4.method469(35);
						}
						this.aClass1_Sub1_Sub3_4.method471(local33);
					}
				}
				@Pc(836) String local836;
				if (local28 == 1381) {
					@Pc(824) int local824 = local33 >> 14 & 0x7FFF;
					@Pc(827) Class9 local827 = Class9.method288(local824);
					if (local827.aByteArray4 == null) {
						local836 = "It's a " + local827.aString23 + ".";
					} else {
						local836 = new String(local827.aByteArray4);
					}
					this.method227(0, "", local836);
				}
				@Pc(863) String local863;
				if (local28 == 524) {
					local863 = this.aStringArray4[arg0];
					local373 = local863.indexOf("@whi@");
					if (local373 != -1) {
						if (this.anInt378 == -1) {
							this.method143();
							this.aString12 = local863.substring(local373 + 5).trim();
							this.aBoolean82 = false;
							for (@Pc(890) int local890 = 0; local890 < Class6.aClass6Array1.length; local890++) {
								if (Class6.aClass6Array1[local890] != null && Class6.aClass6Array1[local890].anInt436 == 600) {
									this.anInt340 = this.anInt378 = Class6.aClass6Array1[local890].anInt433;
									break;
								}
							}
						} else {
							this.method227(0, "", "Please close the interface you have open before using 'report abuse'");
						}
					}
				}
				if (local28 == 721) {
					anInt248 += local23;
					if (anInt248 >= 139) {
						this.aClass1_Sub1_Sub3_4.method469(202);
						this.aClass1_Sub1_Sub3_4.method474(0);
					}
					this.method135(local33, local18, local23, 207);
				}
				if (local28 == 743) {
					anInt273++;
					if (anInt273 >= 124) {
						this.aClass1_Sub1_Sub3_4.method469(173);
						this.aClass1_Sub1_Sub3_4.method471(37954);
					}
					this.method135(local33, local18, local23, 98);
				}
				if (local28 == 102) {
					this.anInt227 = 1;
					this.anInt228 = local18;
					this.anInt229 = local23;
					this.anInt230 = local33;
					this.aString5 = Class15.method361(local33).aString25;
					this.anInt425 = 0;
					this.aBoolean53 = true;
				} else if (local28 == 274) {
					local355 = Class6.aClass6Array1[local23];
					this.anInt425 = 1;
					this.anInt426 = local23;
					this.anInt427 = local355.anInt460;
					this.anInt227 = 0;
					this.aBoolean53 = true;
					local234 = local355.aString20;
					if (local234.indexOf(" ") != -1) {
						local234 = local234.substring(0, local234.indexOf(" "));
					}
					local836 = local355.aString20;
					if (local836.indexOf(" ") != -1) {
						local836 = local836.substring(local836.indexOf(" ") + 1);
					}
					this.aString16 = local234 + " " + local355.aString21 + " " + local836;
					if (this.anInt427 == 16) {
						this.aBoolean53 = true;
						this.anInt334 = 3;
						this.aBoolean64 = true;
					}
				} else {
					if (local28 == 357) {
						this.method135(local33, local18, local23, 5);
					}
					if (local28 == 639 || local28 == 499 || local28 == 27 || local28 == 387 || local28 == 185) {
						local261 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local33];
						if (local261 != null) {
							this.method150((byte) 2, 0, local261.anIntArray273[0], local261.anIntArray272[0], aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray273[0], 0, 0, 2, false, aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray272[0], 1, 1);
							this.anInt310 = super.anInt203;
							this.anInt311 = super.anInt204;
							this.anInt313 = 2;
							this.anInt312 = 0;
							if (local28 == 27) {
								this.aClass1_Sub1_Sub3_4.method469(17);
							}
							if (local28 == 185) {
								this.aClass1_Sub1_Sub3_4.method469(83);
							}
							if (local28 == 387) {
								anInt346 += local33;
								if (anInt346 >= 66) {
									this.aClass1_Sub1_Sub3_4.method469(222);
									this.aClass1_Sub1_Sub3_4.method470(154);
								}
								this.aClass1_Sub1_Sub3_4.method469(241);
							}
							if (local28 == 639) {
								anInt329++;
								if (anInt329 >= 52) {
									this.aClass1_Sub1_Sub3_4.method469(0);
									this.aClass1_Sub1_Sub3_4.method470(131);
								}
								this.aClass1_Sub1_Sub3_4.method469(10);
							}
							if (local28 == 499) {
								this.aClass1_Sub1_Sub3_4.method469(40);
							}
							this.aClass1_Sub1_Sub3_4.method471(local33);
						}
					}
					if (local28 == 225) {
						this.aClass1_Sub1_Sub3_4.method469(62);
						this.aClass1_Sub1_Sub3_4.method471(local23);
						local355 = Class6.aClass6Array1[local23];
						if (local355.anIntArrayArray7 != null && local355.anIntArrayArray7[0][0] == 5) {
							local373 = local355.anIntArrayArray7[0][1];
							if (this.anIntArray50[local373] != local355.anIntArray97[0]) {
								this.anIntArray50[local373] = local355.anIntArray97[0];
								this.method218(local373, this.aByte8);
								this.aBoolean53 = true;
							}
						}
					}
					if (local28 == 737) {
						this.method143();
					}
					if (local28 == 694 || local28 == 962 || local28 == 795 || local28 == 681 || local28 == 100) {
						if (local28 == 681) {
							anInt218++;
							if (anInt218 >= 116) {
								this.aClass1_Sub1_Sub3_4.method469(152);
								this.aClass1_Sub1_Sub3_4.method473(13018169);
							}
							this.aClass1_Sub1_Sub3_4.method469(254);
						}
						if (local28 == 962) {
							this.aClass1_Sub1_Sub3_4.method469(156);
						}
						if (local28 == 795) {
							this.aClass1_Sub1_Sub3_4.method469(213);
						}
						if (local28 == 100) {
							this.aClass1_Sub1_Sub3_4.method469(127);
						}
						if (local28 == 694) {
							this.aClass1_Sub1_Sub3_4.method469(64);
						}
						this.aClass1_Sub1_Sub3_4.method471(local33);
						this.aClass1_Sub1_Sub3_4.method471(local18);
						this.aClass1_Sub1_Sub3_4.method471(local23);
						this.anInt249 = 0;
						this.anInt250 = local23;
						this.anInt251 = local18;
						this.anInt252 = 2;
						if (Class6.aClass6Array1[local23].anInt433 == this.anInt378) {
							this.anInt252 = 1;
						}
						if (Class6.aClass6Array1[local23].anInt433 == this.anInt217) {
							this.anInt252 = 3;
						}
					}
					if (local28 == 582 || local28 == 113 || local28 == 555 || local28 == 331 || local28 == 354) {
						if (local28 == 354) {
							this.aClass1_Sub1_Sub3_4.method469(87);
						}
						if (local28 == 555) {
							this.aClass1_Sub1_Sub3_4.method469(130);
						}
						if (local28 == 113) {
							this.aClass1_Sub1_Sub3_4.method469(88);
						}
						if (local28 == 582) {
							if ((local33 & 0x3) == 0) {
								anInt222++;
							}
							if (anInt222 >= 133) {
								this.aClass1_Sub1_Sub3_4.method469(203);
								this.aClass1_Sub1_Sub3_4.method471(6118);
							}
							this.aClass1_Sub1_Sub3_4.method469(198);
						}
						if (local28 == 331) {
							this.aClass1_Sub1_Sub3_4.method469(125);
						}
						this.aClass1_Sub1_Sub3_4.method471(local33);
						this.aClass1_Sub1_Sub3_4.method471(local18);
						this.aClass1_Sub1_Sub3_4.method471(local23);
						this.anInt249 = 0;
						this.anInt250 = local23;
						this.anInt251 = local18;
						this.anInt252 = 2;
						if (Class6.aClass6Array1[local23].anInt433 == this.anInt378) {
							this.anInt252 = 1;
						}
						if (Class6.aClass6Array1[local23].anInt433 == this.anInt217) {
							this.anInt252 = 3;
						}
					}
					if (local28 == 625) {
						this.method135(local33, local18, local23, 238);
					}
					if (local28 == 398) {
						this.aClass1_Sub1_Sub3_4.method469(101);
						this.aClass1_Sub1_Sub3_4.method471(local33);
						this.aClass1_Sub1_Sub3_4.method471(local18);
						this.aClass1_Sub1_Sub3_4.method471(local23);
						this.aClass1_Sub1_Sub3_4.method471(this.anInt230);
						this.aClass1_Sub1_Sub3_4.method471(this.anInt228);
						this.aClass1_Sub1_Sub3_4.method471(this.anInt229);
						this.anInt249 = 0;
						this.anInt250 = local23;
						this.anInt251 = local18;
						this.anInt252 = 2;
						if (Class6.aClass6Array1[local23].anInt433 == this.anInt378) {
							this.anInt252 = 1;
						}
						if (Class6.aClass6Array1[local23].anInt433 == this.anInt217) {
							this.anInt252 = 3;
						}
					}
					if (local28 == 231) {
						local355 = Class6.aClass6Array1[local23];
						@Pc(1628) boolean local1628 = true;
						if (local355.anInt436 > 0) {
							local1628 = this.method128(local355, this.anInt264);
						}
						if (local1628) {
							this.aClass1_Sub1_Sub3_4.method469(62);
							this.aClass1_Sub1_Sub3_4.method471(local23);
						}
					}
					if (local28 == 1714) {
						local728 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local33];
						if (local728 != null) {
							@Pc(1661) Class13 local1661 = local728.aClass13_2;
							if (local1661.anIntArray174 != null) {
								local1661 = local1661.method327(559);
							}
							if (local1661 != null) {
								if (local1661.aByteArray5 == null) {
									local836 = "It's a " + local1661.aString24 + ".";
								} else {
									local836 = new String(local1661.aByteArray5);
								}
								this.method227(0, "", local836);
							}
						}
					}
					if (local28 == 1328) {
						local225 = Class15.method361(local33);
						@Pc(1708) Class6 local1708 = Class6.aClass6Array1[local23];
						if (local1708 != null && local1708.anIntArray95[local18] >= 100000) {
							local234 = local1708.anIntArray95[local18] + " x " + local225.aString25;
						} else if (local225.aByteArray6 == null) {
							local234 = "It's a " + local225.aString25 + ".";
						} else {
							local234 = new String(local225.aByteArray6);
						}
						this.method227(0, "", local234);
					}
					@Pc(1786) int local1786;
					@Pc(1784) long local1784;
					if (local28 == 902) {
						local863 = this.aStringArray4[arg0];
						local373 = local863.indexOf("@whi@");
						if (local373 != -1) {
							local1784 = Class48.method667(local863.substring(local373 + 5).trim());
							local1786 = -1;
							for (@Pc(1788) int local1788 = 0; local1788 < this.anInt409; local1788++) {
								if (this.aLongArray3[local1788] == local1784) {
									local1786 = local1788;
									break;
								}
							}
							if (local1786 != -1 && this.anIntArray49[local1786] > 0) {
								this.aBoolean59 = true;
								this.aBoolean43 = false;
								this.aBoolean81 = true;
								this.aString4 = "";
								this.anInt286 = 3;
								this.aLong17 = this.aLongArray3[local1786];
								this.aString13 = "Enter message to send to " + this.aStringArray6[local1786];
							}
						}
					}
					if (local28 == 829) {
						local728 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local33];
						if (local728 != null) {
							this.method150((byte) 2, 0, local728.anIntArray273[0], local728.anIntArray272[0], aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray273[0], 0, 0, 2, false, aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray272[0], 1, 1);
							this.anInt310 = super.anInt203;
							this.anInt311 = super.anInt204;
							this.anInt313 = 2;
							this.anInt312 = 0;
							this.aClass1_Sub1_Sub3_4.method469(120);
							this.aClass1_Sub1_Sub3_4.method471(local33);
							this.aClass1_Sub1_Sub3_4.method471(this.anInt230);
							this.aClass1_Sub1_Sub3_4.method471(this.anInt228);
							this.aClass1_Sub1_Sub3_4.method471(this.anInt229);
						}
					}
					if (local28 == 605 || local28 == 47 || local28 == 513 || local28 == 884) {
						local863 = this.aStringArray4[arg0];
						local373 = local863.indexOf("@whi@");
						if (local373 != -1) {
							local1784 = Class48.method667(local863.substring(local373 + 5).trim());
							if (local28 == 605) {
								this.method188(local1784);
							}
							if (local28 == 47) {
								this.method109(local1784, this.aByte7);
							}
							if (local28 == 513) {
								this.method209(local1784);
							}
							if (local28 == 884) {
								this.method177(local1784);
							}
						}
					}
					if (local28 == 718) {
						if (this.aBoolean78) {
							this.aClass37_1.method568(local23 - 4, local18 - 4);
						} else {
							this.aClass37_1.method568(super.anInt204 - 4, super.anInt203 - 4);
						}
					}
					if (local28 == 240) {
						local728 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local33];
						if (local728 != null) {
							this.method150((byte) 2, 0, local728.anIntArray273[0], local728.anIntArray272[0], aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray273[0], 0, 0, 2, false, aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray272[0], 1, 1);
							this.anInt310 = super.anInt203;
							this.anInt311 = super.anInt204;
							this.anInt313 = 2;
							this.anInt312 = 0;
							this.aClass1_Sub1_Sub3_4.method469(100);
							this.aClass1_Sub1_Sub3_4.method471(local33);
							this.aClass1_Sub1_Sub3_4.method471(this.anInt426);
						}
					}
					if (local28 == 507 || local28 == 957) {
						local863 = this.aStringArray4[arg0];
						local373 = local863.indexOf("@whi@");
						if (local373 != -1) {
							local863 = local863.substring(local373 + 5).trim();
							local836 = Class48.method671(943, Class48.method668(Class48.method667(local863)));
							@Pc(2112) boolean local2112 = false;
							for (local1786 = 0; local1786 < this.anInt332; local1786++) {
								@Pc(2124) Class1_Sub1_Sub1_Sub1_Sub1 local2124 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[this.anIntArray64[local1786]];
								if (local2124 != null && local2124.aString3 != null && local2124.aString3.equalsIgnoreCase(local836)) {
									this.method150((byte) 2, 0, local2124.anIntArray273[0], local2124.anIntArray272[0], aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray273[0], 0, 0, 2, false, aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray272[0], 1, 1);
									if (local28 == 507) {
										anInt346 += local33;
										if (anInt346 >= 66) {
											this.aClass1_Sub1_Sub3_4.method469(222);
											this.aClass1_Sub1_Sub3_4.method470(154);
										}
										this.aClass1_Sub1_Sub3_4.method469(241);
									}
									if (local28 == 957) {
										anInt329++;
										if (anInt329 >= 52) {
											this.aClass1_Sub1_Sub3_4.method469(0);
											this.aClass1_Sub1_Sub3_4.method470(131);
										}
										this.aClass1_Sub1_Sub3_4.method469(10);
									}
									this.aClass1_Sub1_Sub3_4.method471(this.anIntArray64[local1786]);
									local2112 = true;
									break;
								}
							}
							if (!local2112) {
								this.method227(0, "", "Unable to find " + local836);
							}
						}
					}
					if (local28 == 131) {
						local261 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local33];
						if (local261 != null) {
							this.method150((byte) 2, 0, local261.anIntArray273[0], local261.anIntArray272[0], aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray273[0], 0, 0, 2, false, aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray272[0], 1, 1);
							this.anInt310 = super.anInt203;
							this.anInt311 = super.anInt204;
							this.anInt313 = 2;
							this.anInt312 = 0;
							this.aClass1_Sub1_Sub3_4.method469(97);
							this.aClass1_Sub1_Sub3_4.method471(local33);
							this.aClass1_Sub1_Sub3_4.method471(this.anInt426);
						}
					}
					this.anInt227 = 0;
					this.anInt425 = 0;
					this.aBoolean53 = true;
				}
			}
		} catch (@Pc(2315) RuntimeException local2315) {
			signlink.reporterror("60024, " + arg0 + ", " + 96 + ", " + local2315.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "k", descriptor = "(Z)V")
	private void method154() {
		try {
			if (this.anInt365 > 1) {
				this.anInt365--;
			}
			if (this.anInt372 > 0) {
				this.anInt372--;
			}
			for (@Pc(22) int local22 = 0; local22 < 5 && this.method166(); local22++) {
			}
			if (this.aBoolean54) {
				@Pc(41) Object local41 = this.aClass11_1.anObject1;
				@Pc(66) int local66;
				@Pc(68) int local68;
				@Pc(70) int local70;
				@Pc(103) int local103;
				synchronized (this.aClass11_1.anObject1) {
					if (!aBoolean69) {
						this.aClass11_1.anInt540 = 0;
					} else if (super.anInt202 != 0 || this.aClass11_1.anInt540 >= 40) {
						this.aClass1_Sub1_Sub3_4.method469(151);
						this.aClass1_Sub1_Sub3_4.method470(0);
						local66 = this.aClass1_Sub1_Sub3_4.anInt742;
						local68 = 0;
						@Pc(86) int local86;
						for (local70 = 0; local70 < this.aClass11_1.anInt540 && local66 - this.aClass1_Sub1_Sub3_4.anInt742 < 240; local70++) {
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
							if (local103 != this.anInt256 || local86 != this.anInt257) {
								@Pc(165) int local165 = local103 - this.anInt256;
								this.anInt256 = local103;
								@Pc(173) int local173 = local86 - this.anInt257;
								this.anInt257 = local86;
								if (this.anInt292 < 8 && local165 >= -32 && local165 <= 31 && local173 >= -32 && local173 <= 31) {
									local165 += 32;
									local173 += 32;
									this.aClass1_Sub1_Sub3_4.method471((this.anInt292 << 12) + (local165 << 6) + local173);
									this.anInt292 = 0;
								} else if (this.anInt292 < 8) {
									this.aClass1_Sub1_Sub3_4.method473((this.anInt292 << 19) + local120 + 8388608);
									this.anInt292 = 0;
								} else {
									this.aClass1_Sub1_Sub3_4.method474((this.anInt292 << 19) + local120 - 1073741824);
									this.anInt292 = 0;
								}
							} else if (this.anInt292 < 2047) {
								this.anInt292++;
							}
						}
						this.aClass1_Sub1_Sub3_4.method479(this.aClass1_Sub1_Sub3_4.anInt742 - local66);
						if (local68 >= this.aClass11_1.anInt540) {
							this.aClass11_1.anInt540 = 0;
						} else {
							this.aClass11_1.anInt540 -= local68;
							for (local86 = 0; local86 < this.aClass11_1.anInt540; local86++) {
								this.aClass11_1.anIntArray162[local86] = this.aClass11_1.anIntArray162[local86 + local68];
								this.aClass11_1.anIntArray163[local86] = this.aClass11_1.anIntArray163[local86 + local68];
							}
						}
					}
				}
				if (super.anInt202 != 0) {
					@Pc(336) long local336 = (super.aLong13 - this.aLong14) / 50L;
					if (local336 > 4095L) {
						local336 = 4095L;
					}
					this.aLong14 = super.aLong13;
					local66 = super.anInt204;
					if (local66 < 0) {
						local66 = 0;
					} else if (local66 > 502) {
						local66 = 502;
					}
					local68 = super.anInt203;
					if (local68 < 0) {
						local68 = 0;
					} else if (local68 > 764) {
						local68 = 764;
					}
					local70 = local66 * 765 + local68;
					@Pc(382) byte local382 = 0;
					if (super.anInt202 == 2) {
						local382 = 1;
					}
					local103 = (int) local336;
					this.aClass1_Sub1_Sub3_4.method469(240);
					this.aClass1_Sub1_Sub3_4.method474((local103 << 20) + (local382 << 19) + local70);
				}
				if (this.anInt221 > 0) {
					this.anInt221--;
				}
				if (super.anIntArray30[1] == 1 || super.anIntArray30[2] == 1 || super.anIntArray30[3] == 1 || super.anIntArray30[4] == 1) {
					this.aBoolean44 = true;
				}
				if (this.aBoolean44 && this.anInt221 <= 0) {
					this.anInt221 = 20;
					this.aBoolean44 = false;
					this.aClass1_Sub1_Sub3_4.method469(169);
					this.aClass1_Sub1_Sub3_4.method471(this.anInt391);
					this.aClass1_Sub1_Sub3_4.method471(this.anInt392);
				}
				if (super.aBoolean42 && !this.aBoolean65) {
					this.aBoolean65 = true;
					this.aClass1_Sub1_Sub3_4.method469(247);
					this.aClass1_Sub1_Sub3_4.method470(1);
				}
				if (!super.aBoolean42 && this.aBoolean65) {
					this.aBoolean65 = false;
					this.aClass1_Sub1_Sub3_4.method469(247);
					this.aClass1_Sub1_Sub3_4.method470(0);
				}
				this.method112();
				this.method181(this.aBoolean87);
				this.method148();
				this.anInt370++;
				if (this.anInt370 > 750) {
					this.method183();
				}
				this.method171();
				this.method196();
				this.method219();
				this.anInt208++;
				if (this.anInt313 != 0) {
					this.anInt312 += 20;
					if (this.anInt312 >= 400) {
						this.anInt313 = 0;
					}
				}
				if (this.anInt252 != 0) {
					this.anInt249++;
					if (this.anInt249 >= 15) {
						if (this.anInt252 == 2) {
							this.aBoolean53 = true;
						}
						if (this.anInt252 == 3) {
							this.aBoolean59 = true;
						}
						this.anInt252 = 0;
					}
				}
				if (this.anInt404 != 0) {
					this.anInt303++;
					if (super.anInt197 > this.anInt405 + 5 || super.anInt197 < this.anInt405 - 5 || super.anInt198 > this.anInt406 + 5 || super.anInt198 < this.anInt406 - 5) {
						this.aBoolean63 = true;
					}
					if (super.anInt196 == 0) {
						if (this.anInt404 == 2) {
							this.aBoolean53 = true;
						}
						if (this.anInt404 == 3) {
							this.aBoolean59 = true;
						}
						this.anInt404 = 0;
						if (this.aBoolean63 && this.anInt303 >= 5) {
							this.anInt351 = -1;
							this.method222(270);
							if (this.anInt351 == this.anInt402 && this.anInt350 != this.anInt403) {
								@Pc(683) Class6 local683 = Class6.aClass6Array1[this.anInt402];
								@Pc(685) byte local685 = 0;
								if (this.anInt231 == 1 && local683.anInt436 == 206) {
									local685 = 1;
								}
								if (local683.anIntArray94[this.anInt350] <= 0) {
									local685 = 0;
								}
								if (local683.aBoolean97) {
									local66 = this.anInt403;
									local68 = this.anInt350;
									local683.anIntArray94[local68] = local683.anIntArray94[local66];
									local683.anIntArray95[local68] = local683.anIntArray95[local66];
									local683.anIntArray94[local66] = -1;
									local683.anIntArray95[local66] = 0;
								} else if (local685 == 1) {
									local66 = this.anInt403;
									local68 = this.anInt350;
									while (local66 != local68) {
										if (local66 > local68) {
											local683.method232(local66 - 1, local66);
											local66--;
										} else if (local66 < local68) {
											local683.method232(local66 + 1, local66);
											local66++;
										}
									}
								} else {
									local683.method232(this.anInt350, this.anInt403);
								}
								this.aClass1_Sub1_Sub3_4.method469(38);
								this.aClass1_Sub1_Sub3_4.method471(this.anInt402);
								this.aClass1_Sub1_Sub3_4.method471(this.anInt403);
								this.aClass1_Sub1_Sub3_4.method471(this.anInt350);
								this.aClass1_Sub1_Sub3_4.method470(local685);
							}
						} else if ((this.anInt266 == 1 || this.method134(this.anInt322 - 1)) && this.anInt322 > 2) {
							this.method149(anInt298);
						} else if (this.anInt322 > 0) {
							this.method153(this.anInt322 - 1);
						}
						this.anInt249 = 10;
						super.anInt202 = 0;
					}
				}
				anInt253++;
				if (anInt253 > 62) {
					anInt253 = 0;
					this.aClass1_Sub1_Sub3_4.method469(6);
				}
				@Pc(869) int local869;
				@Pc(871) int local871;
				if (Class37.anInt877 != -1) {
					local869 = Class37.anInt877;
					local871 = Class37.anInt878;
					@Pc(892) boolean local892 = this.method150((byte) 2, 0, local871, local869, aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray273[0], 0, 0, 0, true, aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray272[0], 0, 0);
					Class37.anInt877 = -1;
					if (local892) {
						this.anInt310 = super.anInt203;
						this.anInt311 = super.anInt204;
						this.anInt313 = 1;
						this.anInt312 = 0;
					}
				}
				if (super.anInt202 == 1 && this.aString17 != null) {
					this.aString17 = null;
					this.aBoolean59 = true;
					super.anInt202 = 0;
				}
				this.method156();
				this.method193((byte) 7);
				this.method155();
				this.method152();
				if (super.anInt196 == 1 || super.anInt202 == 1) {
					this.anInt335++;
				}
				if (this.anInt353 == 2) {
					this.method206();
				}
				if (this.anInt353 == 2 && this.aBoolean50) {
					this.method145();
				}
				for (local869 = 0; local869 < 5; local869++) {
					@Pc(983) int local983 = this.anIntArray63[local869]++;
				}
				this.method170();
				super.anInt195++;
				if (super.anInt195 > 4500) {
					this.anInt372 = 250;
					super.anInt195 -= 500;
					this.aClass1_Sub1_Sub3_4.method469(80);
				}
				this.anInt407++;
				if (this.anInt407 > 500) {
					this.anInt407 = 0;
					local871 = (int) (Math.random() * 8.0D);
					if ((local871 & 0x1) == 1) {
						this.anInt399 += this.anInt400;
					}
					if ((local871 & 0x2) == 2) {
						this.anInt300 += this.anInt301;
					}
					if ((local871 & 0x4) == 4) {
						this.anInt314 += this.anInt315;
					}
				}
				if (this.anInt399 < -50) {
					this.anInt400 = 2;
				}
				if (this.anInt399 > 50) {
					this.anInt400 = -2;
				}
				if (this.anInt300 < -55) {
					this.anInt301 = 2;
				}
				if (this.anInt300 > 55) {
					this.anInt301 = -2;
				}
				if (this.anInt314 < -40) {
					this.anInt315 = 1;
				}
				if (this.anInt314 > 40) {
					this.anInt315 = -1;
				}
				this.anInt305++;
				if (this.anInt305 > 500) {
					this.anInt305 = 0;
					local871 = (int) (Math.random() * 8.0D);
					if ((local871 & 0x1) == 1) {
						this.anInt422 += this.anInt423;
					}
					if ((local871 & 0x2) == 2) {
						this.anInt269 += this.anInt270;
					}
				}
				if (this.anInt422 < -60) {
					this.anInt423 = 2;
				}
				if (this.anInt422 > 60) {
					this.anInt423 = -2;
				}
				if (this.anInt269 < -20) {
					this.anInt270 = 1;
				}
				if (this.anInt269 > 10) {
					this.anInt270 = -1;
				}
				this.anInt371++;
				if (this.anInt371 > 50) {
					this.aClass1_Sub1_Sub3_4.method469(115);
				}
				try {
					if (this.aClass8_1 != null && this.aClass1_Sub1_Sub3_4.anInt742 > 0) {
						this.aClass8_1.method251(this.aClass1_Sub1_Sub3_4.aByteArray9, this.aClass1_Sub1_Sub3_4.anInt742);
						this.aClass1_Sub1_Sub3_4.anInt742 = 0;
						this.anInt371 = 0;
					}
				} catch (@Pc(1225) IOException local1225) {
					this.method183();
				} catch (@Pc(1230) Exception local1230) {
					this.method210();
				}
			}
		} catch (@Pc(1235) RuntimeException local1235) {
			signlink.reporterror("61271, " + false + ", " + local1235.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "s", descriptor = "(I)V")
	private void method155() {
		try {
			if (super.anInt202 == 1) {
				if (super.anInt203 >= 539 && super.anInt203 <= 573 && super.anInt204 >= 169 && super.anInt204 < 205 && this.anIntArray68[0] != -1) {
					this.aBoolean53 = true;
					this.anInt334 = 0;
					this.aBoolean64 = true;
				}
				if (super.anInt203 >= 569 && super.anInt203 <= 599 && super.anInt204 >= 168 && super.anInt204 < 205 && this.anIntArray68[1] != -1) {
					this.aBoolean53 = true;
					this.anInt334 = 1;
					this.aBoolean64 = true;
				}
				if (super.anInt203 >= 597 && super.anInt203 <= 627 && super.anInt204 >= 168 && super.anInt204 < 205 && this.anIntArray68[2] != -1) {
					this.aBoolean53 = true;
					this.anInt334 = 2;
					this.aBoolean64 = true;
				}
				if (super.anInt203 >= 625 && super.anInt203 <= 669 && super.anInt204 >= 168 && super.anInt204 < 203 && this.anIntArray68[3] != -1) {
					this.aBoolean53 = true;
					this.anInt334 = 3;
					this.aBoolean64 = true;
				}
				if (super.anInt203 >= 666 && super.anInt203 <= 696 && super.anInt204 >= 168 && super.anInt204 < 205 && this.anIntArray68[4] != -1) {
					this.aBoolean53 = true;
					this.anInt334 = 4;
					this.aBoolean64 = true;
				}
				if (super.anInt203 >= 694 && super.anInt203 <= 724 && super.anInt204 >= 168 && super.anInt204 < 205 && this.anIntArray68[5] != -1) {
					this.aBoolean53 = true;
					this.anInt334 = 5;
					this.aBoolean64 = true;
				}
				if (super.anInt203 >= 722 && super.anInt203 <= 756 && super.anInt204 >= 169 && super.anInt204 < 205 && this.anIntArray68[6] != -1) {
					this.aBoolean53 = true;
					this.anInt334 = 6;
					this.aBoolean64 = true;
				}
				if (super.anInt203 >= 540 && super.anInt203 <= 574 && super.anInt204 >= 466 && super.anInt204 < 502 && this.anIntArray68[7] != -1) {
					this.aBoolean53 = true;
					this.anInt334 = 7;
					this.aBoolean64 = true;
				}
				if (super.anInt203 >= 572 && super.anInt203 <= 602 && super.anInt204 >= 466 && super.anInt204 < 503 && this.anIntArray68[8] != -1) {
					this.aBoolean53 = true;
					this.anInt334 = 8;
					this.aBoolean64 = true;
				}
				if (super.anInt203 >= 599 && super.anInt203 <= 629 && super.anInt204 >= 466 && super.anInt204 < 503 && this.anIntArray68[9] != -1) {
					this.aBoolean53 = true;
					this.anInt334 = 9;
					this.aBoolean64 = true;
				}
				if (super.anInt203 >= 627 && super.anInt203 <= 671 && super.anInt204 >= 467 && super.anInt204 < 502 && this.anIntArray68[10] != -1) {
					this.aBoolean53 = true;
					this.anInt334 = 10;
					this.aBoolean64 = true;
				}
				if (super.anInt203 >= 669 && super.anInt203 <= 699 && super.anInt204 >= 466 && super.anInt204 < 503 && this.anIntArray68[11] != -1) {
					this.aBoolean53 = true;
					this.anInt334 = 11;
					this.aBoolean64 = true;
				}
				if (super.anInt203 >= 696 && super.anInt203 <= 726 && super.anInt204 >= 466 && super.anInt204 < 503 && this.anIntArray68[12] != -1) {
					this.aBoolean53 = true;
					this.anInt334 = 12;
					this.aBoolean64 = true;
				}
				if (super.anInt203 >= 724 && super.anInt203 <= 758 && super.anInt204 >= 466 && super.anInt204 < 502 && this.anIntArray68[13] != -1) {
					this.aBoolean53 = true;
					this.anInt334 = 13;
					this.aBoolean64 = true;
					return;
				}
			}
		} catch (@Pc(443) RuntimeException local443) {
			signlink.reporterror("18607, " + -26751 + ", " + local443.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "l", descriptor = "(Z)V")
	private void method156() {
		try {
			if (this.anInt404 == 0) {
				@Pc(11) int local11 = super.anInt202;
				if (this.anInt425 == 1 && super.anInt203 >= 516 && super.anInt204 >= 160 && super.anInt203 <= 765 && super.anInt204 <= 205) {
					local11 = 0;
				}
				@Pc(42) int local42;
				@Pc(45) int local45;
				@Pc(121) int local121;
				if (this.aBoolean78) {
					if (local11 != 1) {
						local42 = super.anInt197;
						local45 = super.anInt198;
						if (this.anInt360 == 0) {
							local42 -= 4;
							local45 -= 4;
						}
						if (this.anInt360 == 1) {
							local42 -= 553;
							local45 -= 205;
						}
						if (this.anInt360 == 2) {
							local42 -= 17;
							local45 -= 357;
						}
						if (local42 < this.anInt361 - 10 || local42 > this.anInt361 + this.anInt363 + 10 || local45 < this.anInt362 - 10 || local45 > this.anInt362 + this.anInt364 + 10) {
							this.aBoolean78 = false;
							if (this.anInt360 == 1) {
								this.aBoolean53 = true;
							}
							if (this.anInt360 == 2) {
								this.aBoolean59 = true;
							}
						}
					}
					if (local11 == 1) {
						local42 = this.anInt361;
						local45 = this.anInt362;
						local121 = this.anInt363;
						@Pc(124) int local124 = super.anInt203;
						@Pc(127) int local127 = super.anInt204;
						if (this.anInt360 == 0) {
							local124 -= 4;
							local127 -= 4;
						}
						if (this.anInt360 == 1) {
							local124 -= 553;
							local127 -= 205;
						}
						if (this.anInt360 == 2) {
							local124 -= 17;
							local127 -= 357;
						}
						@Pc(146) int local146 = -1;
						for (@Pc(148) int local148 = 0; local148 < this.anInt322; local148++) {
							@Pc(163) int local163 = local45 + (this.anInt322 - 1 - local148) * 15 + 31;
							if (local124 > local42 && local124 < local42 + local121 && local127 > local163 - 13 && local127 < local163 + 3) {
								local146 = local148;
							}
						}
						if (local146 != -1) {
							this.method153(local146);
						}
						this.aBoolean78 = false;
						if (this.anInt360 == 1) {
							this.aBoolean53 = true;
						}
						if (this.anInt360 == 2) {
							this.aBoolean59 = true;
							return;
						}
					}
				} else {
					if (local11 == 1 && this.anInt322 > 0) {
						local42 = this.anIntArray39[this.anInt322 - 1];
						if (local42 == 582 || local42 == 113 || local42 == 555 || local42 == 331 || local42 == 354 || local42 == 694 || local42 == 962 || local42 == 795 || local42 == 681 || local42 == 100 || local42 == 102 || local42 == 1328) {
							local45 = this.anIntArray37[this.anInt322 - 1];
							local121 = this.anIntArray38[this.anInt322 - 1];
							@Pc(283) Class6 local283 = Class6.aClass6Array1[local121];
							if (local283.aBoolean94 || local283.aBoolean97) {
								this.aBoolean63 = false;
								this.anInt303 = 0;
								this.anInt402 = local121;
								this.anInt403 = local45;
								this.anInt404 = 2;
								this.anInt405 = super.anInt203;
								this.anInt406 = super.anInt204;
								if (Class6.aClass6Array1[local121].anInt433 == this.anInt378) {
									this.anInt404 = 1;
								}
								if (Class6.aClass6Array1[local121].anInt433 == this.anInt217) {
									this.anInt404 = 3;
								}
								return;
							}
						}
					}
					if (local11 == 1 && (this.anInt266 == 1 || this.method134(this.anInt322 - 1)) && this.anInt322 > 2) {
						local11 = 2;
					}
					if (local11 == 1 && this.anInt322 > 0) {
						this.method153(this.anInt322 - 1);
					}
					if (local11 != 2 || this.anInt322 <= 0) {
						return;
					}
					this.method149(anInt298);
				}
			}
		} catch (@Pc(378) RuntimeException local378) {
			signlink.reporterror("1832, " + true + ", " + local378.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ZI)V")
	private void method157(@OriginalArg(1) int arg0) {
		try {
			if (!aBoolean71) {
				@Pc(22) Class1_Sub1_Sub2_Sub3 local22;
				@Pc(30) int local30;
				@Pc(38) int local38;
				@Pc(41) byte[] local41;
				@Pc(44) byte[] local44;
				@Pc(46) int local46;
				if (Class1_Sub1_Sub2_Sub1.anIntArray182[17] >= arg0) {
					local22 = Class1_Sub1_Sub2_Sub1.aClass1_Sub1_Sub2_Sub3Array5[17];
					local30 = local22.anInt675 * local22.anInt676 - 1;
					local38 = local22.anInt675 * this.anInt208 * 2;
					local41 = local22.aByteArray7;
					local44 = this.aByteArray2;
					for (local46 = 0; local46 <= local30; local46++) {
						local44[local46] = local41[local46 - local38 & local30];
					}
					local22.aByteArray7 = local44;
					this.aByteArray2 = local41;
					Class1_Sub1_Sub2_Sub1.method349(17);
				}
				if (Class1_Sub1_Sub2_Sub1.anIntArray182[24] >= arg0) {
					local22 = Class1_Sub1_Sub2_Sub1.aClass1_Sub1_Sub2_Sub3Array5[24];
					local30 = local22.anInt675 * local22.anInt676 - 1;
					local38 = local22.anInt675 * this.anInt208 * 2;
					local41 = local22.aByteArray7;
					local44 = this.aByteArray2;
					for (local46 = 0; local46 <= local30; local46++) {
						local44[local46] = local41[local46 - local38 & local30];
					}
					local22.aByteArray7 = local44;
					this.aByteArray2 = local41;
					Class1_Sub1_Sub2_Sub1.method349(24);
				}
				if (Class1_Sub1_Sub2_Sub1.anIntArray182[34] >= arg0) {
					local22 = Class1_Sub1_Sub2_Sub1.aClass1_Sub1_Sub2_Sub3Array5[34];
					local30 = local22.anInt675 * local22.anInt676 - 1;
					local38 = local22.anInt675 * this.anInt208 * 2;
					local41 = local22.aByteArray7;
					local44 = this.aByteArray2;
					for (local46 = 0; local46 <= local30; local46++) {
						local44[local46] = local41[local46 - local38 & local30];
					}
					local22.aByteArray7 = local44;
					this.aByteArray2 = local41;
					Class1_Sub1_Sub2_Sub1.method349(34);
					return;
				}
			}
		} catch (@Pc(189) RuntimeException local189) {
			signlink.reporterror("88916, " + false + ", " + arg0 + ", " + local189.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;Z)V")
	private void method158(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) boolean arg2) {
		signlink.errorname = arg0;
		try {
			if (!arg2) {
				this.aString8 = "";
				this.aString9 = "Connecting to server...";
				this.method186(true);
			}
			this.aClass8_1 = new Class8(this, true, this.method230(anInt348 + 43594));
			@Pc(30) long local30 = Class48.method667(arg0);
			@Pc(37) int local37 = (int) (local30 >> 16 & 0x1FL);
			this.aClass1_Sub1_Sub3_4.anInt742 = 0;
			this.aClass1_Sub1_Sub3_4.method470(14);
			this.aClass1_Sub1_Sub3_4.method470(local37);
			this.aClass8_1.method251(this.aClass1_Sub1_Sub3_4.aByteArray9, 2);
			for (@Pc(60) int local60 = 0; local60 < 8; local60++) {
				this.aClass8_1.method248();
			}
			@Pc(74) int local74 = this.aClass8_1.method248();
			@Pc(76) int local76 = local74;
			@Pc(225) int local225;
			@Pc(260) int local260;
			if (local74 == 0) {
				this.aClass8_1.method250(this.aClass1_Sub1_Sub3_3.aByteArray9, 0, 8);
				this.aClass1_Sub1_Sub3_3.anInt742 = 0;
				this.aLong18 = this.aClass1_Sub1_Sub3_3.method486();
				@Pc(99) int[] local99 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (this.aLong18 >> 32), (int) this.aLong18 };
				this.aClass1_Sub1_Sub3_4.anInt742 = 0;
				this.aClass1_Sub1_Sub3_4.method470(10);
				this.aClass1_Sub1_Sub3_4.method474(local99[0]);
				this.aClass1_Sub1_Sub3_4.method474(local99[1]);
				this.aClass1_Sub1_Sub3_4.method474(local99[2]);
				this.aClass1_Sub1_Sub3_4.method474(local99[3]);
				this.aClass1_Sub1_Sub3_4.method474(signlink.anInt939);
				this.aClass1_Sub1_Sub3_4.method477(arg0);
				this.aClass1_Sub1_Sub3_4.method477(arg1);
				this.aClass1_Sub1_Sub3_4.method495(aBigInteger1, aBigInteger2);
				this.aClass1_Sub1_Sub3_2.anInt742 = 0;
				if (arg2) {
					this.aClass1_Sub1_Sub3_2.method470(18);
				} else {
					this.aClass1_Sub1_Sub3_2.method470(16);
				}
				this.aClass1_Sub1_Sub3_2.method470(this.aClass1_Sub1_Sub3_4.anInt742 + 36 + 1 + 1 + 2);
				this.aClass1_Sub1_Sub3_2.method470(255);
				this.aClass1_Sub1_Sub3_2.method471(299);
				this.aClass1_Sub1_Sub3_2.method470(aBoolean71 ? 1 : 0);
				for (local225 = 0; local225 < 9; local225++) {
					this.aClass1_Sub1_Sub3_2.method474(this.anIntArray69[local225]);
				}
				this.aClass1_Sub1_Sub3_2.method478(this.aClass1_Sub1_Sub3_4.anInt742, this.aClass1_Sub1_Sub3_4.aByteArray9);
				this.aClass1_Sub1_Sub3_4.aClass46_2 = new Class46(local99, this.aBoolean80);
				for (local260 = 0; local260 < 4; local260++) {
					local99[local260] += 50;
				}
				this.aClass46_1 = new Class46(local99, this.aBoolean80);
				this.aClass8_1.method251(this.aClass1_Sub1_Sub3_2.aByteArray9, this.aClass1_Sub1_Sub3_2.anInt742);
				local74 = this.aClass8_1.method248();
			}
			if (local74 == 1) {
				try {
					Thread.sleep(2000L);
				} catch (@Pc(303) Exception local303) {
				}
				this.method158(arg0, arg1, arg2);
			} else {
				@Pc(391) int local391;
				if (local74 == 2) {
					this.anInt262 = this.aClass8_1.method248();
					aBoolean69 = this.aClass8_1.method248() == 1;
					this.aLong14 = 0L;
					this.anInt292 = 0;
					this.aClass11_1.anInt540 = 0;
					super.aBoolean42 = true;
					this.aBoolean65 = true;
					this.aBoolean54 = true;
					this.aClass1_Sub1_Sub3_4.anInt742 = 0;
					this.aClass1_Sub1_Sub3_3.anInt742 = 0;
					this.anInt369 = -1;
					this.anInt281 = -1;
					this.anInt282 = -1;
					this.anInt283 = -1;
					this.anInt368 = 0;
					this.anInt370 = 0;
					this.anInt365 = 0;
					this.anInt372 = 0;
					this.anInt420 = 0;
					this.anInt322 = 0;
					this.aBoolean78 = false;
					super.anInt195 = 0;
					for (local391 = 0; local391 < 100; local391++) {
						this.aStringArray3[local391] = null;
					}
					this.anInt227 = 0;
					this.anInt425 = 0;
					this.anInt353 = 0;
					this.anInt317 = 0;
					this.anInt399 = (int) (Math.random() * 100.0D) - 50;
					this.anInt300 = (int) (Math.random() * 110.0D) - 55;
					this.anInt314 = (int) (Math.random() * 80.0D) - 40;
					this.anInt422 = (int) (Math.random() * 120.0D) - 60;
					this.anInt269 = (int) (Math.random() * 30.0D) - 20;
					this.anInt392 = (int) (Math.random() * 20.0D) - 10 & 0x7FF;
					this.anInt339 = 0;
					this.anInt358 = -1;
					this.anInt275 = 0;
					this.anInt276 = 0;
					this.anInt332 = 0;
					this.anInt424 = 0;
					for (local225 = 0; local225 < this.anInt330; local225++) {
						this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local225] = null;
						this.aClass1_Sub1_Sub3Array1[local225] = null;
					}
					for (local260 = 0; local260 < 16384; local260++) {
						this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local260] = null;
					}
					aClass1_Sub1_Sub1_Sub1_Sub1_1 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[this.anInt331] = new Class1_Sub1_Sub1_Sub1_Sub1();
					this.aClass29_1.method515();
					this.aClass29_3.method515();
					@Pc(536) int local536;
					@Pc(540) int local540;
					for (@Pc(532) int local532 = 0; local532 < 4; local532++) {
						for (local536 = 0; local536 < 104; local536++) {
							for (local540 = 0; local540 < 104; local540++) {
								this.aClass29ArrayArrayArray1[local532][local536][local540] = null;
							}
						}
					}
					this.aClass29_2 = new Class29(6);
					this.anInt410 = 0;
					this.anInt409 = 0;
					this.anInt412 = -1;
					this.anInt217 = -1;
					this.anInt378 = -1;
					this.anInt376 = -1;
					this.anInt319 = -1;
					this.aBoolean49 = false;
					this.anInt334 = 3;
					this.aBoolean43 = false;
					this.aBoolean78 = false;
					this.aBoolean81 = false;
					this.aString17 = null;
					this.anInt344 = 0;
					this.anInt271 = -1;
					this.aBoolean76 = true;
					this.method139();
					for (local536 = 0; local536 < 5; local536++) {
						this.anIntArray75[local536] = 0;
					}
					for (local540 = 0; local540 < 5; local540++) {
						this.aStringArray1[local540] = null;
						this.aBooleanArray3[local540] = false;
					}
					anInt248 = 0;
					anInt273 = 0;
					anInt209 = 0;
					anInt329 = 0;
					anInt346 = 0;
					anInt222 = 0;
					anInt244 = 0;
					anInt212 = 0;
					anInt218 = 0;
					this.method165((byte) 4);
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
					this.aBoolean54 = true;
					this.aClass1_Sub1_Sub3_4.anInt742 = 0;
					this.aClass1_Sub1_Sub3_3.anInt742 = 0;
					this.anInt369 = -1;
					this.anInt281 = -1;
					this.anInt282 = -1;
					this.anInt283 = -1;
					this.anInt368 = 0;
					this.anInt370 = 0;
					this.anInt365 = 0;
					this.anInt322 = 0;
					this.aBoolean78 = false;
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
					for (local391 = this.aClass8_1.method248(); local391 >= 0; local391--) {
						this.aString8 = "You have only just left another world";
						this.aString9 = "Your profile will be transferred in: " + local391 + " seconds";
						this.method186(true);
						try {
							Thread.sleep(1000L);
						} catch (@Pc(901) Exception local901) {
						}
					}
					this.method158(arg0, arg1, arg2);
				} else if (local74 != -1) {
					System.out.println("response:" + local74);
					this.aString8 = "Unexpected server response";
					this.aString9 = "Please try using a different world.";
				} else if (local76 != 0) {
					this.aString8 = "No response from server";
					this.aString9 = "Please try using a different world.";
				} else if (this.anInt373 < 2) {
					try {
						Thread.sleep(2000L);
					} catch (@Pc(923) Exception local923) {
					}
					this.anInt373++;
					this.method158(arg0, arg1, arg2);
				} else {
					this.aString8 = "No response from loginserver";
					this.aString9 = "Please wait 1 minute and try again.";
				}
			}
		} catch (@Pc(966) IOException local966) {
			this.aString8 = "";
			this.aString9 = "Error connecting to server.";
		}
	}

	@OriginalMember(owner = "client!client", name = "g", descriptor = "(B)V")
	private void method159() {
		try {
			if (this.anInt359 != 0) {
				@Pc(12) int local12 = 0;
				if (this.anInt365 != 0) {
					local12 = 1;
				}
				for (@Pc(19) int local19 = 0; local19 < 100; local19++) {
					if (this.aStringArray3[local19] != null) {
						@Pc(31) int local31 = this.anIntArray47[local19];
						@Pc(36) String local36 = this.aStringArray2[local19];
						if (local36 != null && local36.startsWith("@cr1@")) {
							local36 = local36.substring(5);
						}
						if (local36 != null && local36.startsWith("@cr2@")) {
							local36 = local36.substring(5);
						}
						if ((local31 == 3 || local31 == 7) && (local31 == 7 || this.anInt421 == 0 || this.anInt421 == 1 && this.method103(local36))) {
							@Pc(89) int local89 = 329 - local12 * 13;
							if (super.anInt197 > 4 && super.anInt198 - 4 > local89 - 10 && super.anInt198 - 4 <= local89 + 3) {
								@Pc(128) int local128 = this.aClass1_Sub1_Sub2_Sub4_2.method449("From:  " + local36 + this.aStringArray3[local19]) + 25;
								if (local128 > 450) {
									local128 = 450;
								}
								if (super.anInt197 < local128 + 4) {
									if (this.anInt262 >= 1) {
										this.aStringArray4[this.anInt322] = "Report abuse @whi@" + local36;
										this.anIntArray39[this.anInt322] = 2524;
										this.anInt322++;
									}
									this.aStringArray4[this.anInt322] = "Add ignore @whi@" + local36;
									this.anIntArray39[this.anInt322] = 2047;
									this.anInt322++;
									this.aStringArray4[this.anInt322] = "Add friend @whi@" + local36;
									this.anIntArray39[this.anInt322] = 2605;
									this.anInt322++;
								}
							}
							local12++;
							if (local12 >= 5) {
								return;
							}
						}
						if ((local31 == 5 || local31 == 6) && this.anInt421 < 2) {
							local12++;
							if (local12 >= 5) {
								return;
							}
						}
					}
				}
			}
		} catch (@Pc(241) RuntimeException local241) {
			signlink.reporterror("71212, " + 4 + ", " + local241.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "t", descriptor = "(I)V")
	private void method160() {
		try {
			this.anInt316++;
			this.method182(true);
			this.method192(true);
			this.method182(false);
			this.method192(false);
			this.method184();
			this.method125();
			@Pc(35) int local35;
			@Pc(74) int local74;
			if (!this.aBoolean50) {
				local35 = this.anInt391;
				if (this.anInt320 / 256 > local35) {
					local35 = this.anInt320 / 256;
				}
				if (this.aBooleanArray4[4] && this.anIntArray56[4] + 128 > local35) {
					local35 = this.anIntArray56[4] + 128;
				}
				local74 = this.anInt392 + this.anInt314 & 0x7FF;
				this.method187(local35, this.anInt219, local35 * 3 + 600, this.anInt220, this.method223(aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt988, this.anInt246, aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt989) - 50, local74);
			}
			if (this.aBoolean50) {
				local35 = this.method217(this.aBoolean88);
			} else {
				local35 = this.method216();
			}
			local74 = this.anInt381;
			@Pc(128) int local128 = this.anInt382;
			@Pc(131) int local131 = this.anInt383;
			@Pc(134) int local134 = this.anInt384;
			@Pc(137) int local137 = this.anInt385;
			@Pc(186) int local186;
			for (@Pc(139) int local139 = 0; local139 < 5; local139++) {
				if (this.aBooleanArray4[local139]) {
					local186 = (int) (Math.random() * (double) (this.anIntArray57[local139] * 2 + 1) - (double) this.anIntArray57[local139] + Math.sin((double) this.anIntArray63[local139] * ((double) this.anIntArray77[local139] / 100.0D)) * (double) this.anIntArray56[local139]);
					if (local139 == 0) {
						this.anInt381 += local186;
					}
					if (local139 == 1) {
						this.anInt382 += local186;
					}
					if (local139 == 2) {
						this.anInt383 += local186;
					}
					if (local139 == 3) {
						this.anInt385 = this.anInt385 + local186 & 0x7FF;
					}
					if (local139 == 4) {
						this.anInt384 += local186;
						if (this.anInt384 < 128) {
							this.anInt384 = 128;
						}
						if (this.anInt384 > 383) {
							this.anInt384 = 383;
						}
					}
				}
			}
			local186 = Class1_Sub1_Sub2_Sub1.anInt599;
			Class1_Sub1_Sub1_Sub5.aBoolean115 = true;
			Class1_Sub1_Sub1_Sub5.anInt508 = 0;
			Class1_Sub1_Sub1_Sub5.anInt506 = super.anInt197 - 4;
			Class1_Sub1_Sub1_Sub5.anInt507 = super.anInt198 - 4;
			Class1_Sub1_Sub2.method437();
			this.aClass37_1.method569(this.anInt381, this.anInt384, this.anInt383, this.anInt385, local35, this.anInt382);
			this.aClass37_1.method544();
			this.method121();
			this.method229();
			this.method157(local186);
			this.method180((byte) 1);
			this.aClass35_5.method525(super.aGraphics2, 4, 4);
			this.anInt381 = local74;
			this.anInt382 = local128;
			this.anInt383 = local131;
			this.anInt384 = local134;
			this.anInt385 = local137;
		} catch (@Pc(325) RuntimeException local325) {
			signlink.reporterror("72457, " + 142 + ", " + local325.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(III)V")
	private void method161(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		try {
			@Pc(1) int local1 = 0;
			for (@Pc(6) int local6 = 0; local6 < 100; local6++) {
				if (this.aStringArray3[local6] != null) {
					@Pc(18) int local18 = this.anIntArray47[local6];
					@Pc(29) int local29 = this.anInt211 + 70 + 4 - local1 * 14;
					if (local29 < -20) {
						break;
					}
					@Pc(37) String local37 = this.aStringArray2[local6];
					if (local37 != null && local37.startsWith("@cr1@")) {
						local37 = local37.substring(5);
					}
					if (local37 != null && local37.startsWith("@cr2@")) {
						local37 = local37.substring(5);
					}
					if (local18 == 0) {
						local1++;
					}
					if ((local18 == 1 || local18 == 2) && (local18 == 1 || this.anInt216 == 0 || this.anInt216 == 1 && this.method103(local37))) {
						if (arg0 > local29 - 14 && arg0 <= local29 && !local37.equals(aClass1_Sub1_Sub1_Sub1_Sub1_1.aString3)) {
							if (this.anInt262 >= 1) {
								this.aStringArray4[this.anInt322] = "Report abuse @whi@" + local37;
								this.anIntArray39[this.anInt322] = 524;
								this.anInt322++;
							}
							this.aStringArray4[this.anInt322] = "Add ignore @whi@" + local37;
							this.anIntArray39[this.anInt322] = 47;
							this.anInt322++;
							this.aStringArray4[this.anInt322] = "Add friend @whi@" + local37;
							this.anIntArray39[this.anInt322] = 605;
							this.anInt322++;
						}
						local1++;
					}
					if ((local18 == 3 || local18 == 7) && this.anInt359 == 0 && (local18 == 7 || this.anInt421 == 0 || this.anInt421 == 1 && this.method103(local37))) {
						if (arg0 > local29 - 14 && arg0 <= local29) {
							if (this.anInt262 >= 1) {
								this.aStringArray4[this.anInt322] = "Report abuse @whi@" + local37;
								this.anIntArray39[this.anInt322] = 524;
								this.anInt322++;
							}
							this.aStringArray4[this.anInt322] = "Add ignore @whi@" + local37;
							this.anIntArray39[this.anInt322] = 47;
							this.anInt322++;
							this.aStringArray4[this.anInt322] = "Add friend @whi@" + local37;
							this.anIntArray39[this.anInt322] = 605;
							this.anInt322++;
						}
						local1++;
					}
					if (local18 == 4 && (this.anInt296 == 0 || this.anInt296 == 1 && this.method103(local37))) {
						if (arg0 > local29 - 14 && arg0 <= local29) {
							this.aStringArray4[this.anInt322] = "Accept trade @whi@" + local37;
							this.anIntArray39[this.anInt322] = 507;
							this.anInt322++;
						}
						local1++;
					}
					if ((local18 == 5 || local18 == 6) && this.anInt359 == 0 && this.anInt421 < 2) {
						local1++;
					}
					if (local18 == 8 && (this.anInt296 == 0 || this.anInt296 == 1 && this.method103(local37))) {
						if (arg0 > local29 - 14 && arg0 <= local29) {
							this.aStringArray4[this.anInt322] = "Accept challenge @whi@" + local37;
							this.anIntArray39[this.anInt322] = 957;
							this.anInt322++;
						}
						local1++;
					}
				}
			}
		} catch (@Pc(402) RuntimeException local402) {
			signlink.reporterror("36657, " + arg0 + ", " + 0 + ", " + arg1 + ", " + local402.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(IBLclient!lb;)V")
	private void method162(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub1_Sub3 arg1) {
		try {
			while (true) {
				if (arg1.anInt743 + 21 < arg0 * 8) {
					@Pc(12) int local12 = arg1.method491(14);
					if (local12 != 16383) {
						if (this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local12] == null) {
							this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local12] = new Class1_Sub1_Sub1_Sub1_Sub2();
						}
						@Pc(32) Class1_Sub1_Sub1_Sub1_Sub2 local32 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local12];
						this.anIntArray92[this.anInt424++] = local12;
						local32.anInt1028 = anInt297;
						local32.aClass13_2 = Class13.method323(arg1.method491(12));
						local32.anInt991 = local32.aClass13_2.aByte16;
						local32.anInt1031 = local32.aClass13_2.anInt572;
						local32.anInt994 = local32.aClass13_2.anInt559;
						local32.anInt995 = local32.aClass13_2.anInt560;
						local32.anInt996 = local32.aClass13_2.anInt561;
						local32.anInt997 = local32.aClass13_2.anInt562;
						local32.anInt992 = local32.aClass13_2.anInt558;
						@Pc(93) int local93 = arg1.method491(5);
						if (local93 > 15) {
							local93 -= 32;
						}
						@Pc(102) int local102 = arg1.method491(5);
						if (local102 > 15) {
							local102 -= 32;
						}
						@Pc(111) int local111 = arg1.method491(1);
						local32.method677(aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray273[0] + local102, local111 == 1, aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray272[0] + local93);
						@Pc(137) int local137 = arg1.method491(1);
						if (local137 == 1) {
							this.anIntArray65[this.anInt333++] = local12;
						}
						continue;
					}
				}
				arg1.method492(312);
				return;
			}
		} catch (@Pc(165) RuntimeException local165) {
			signlink.reporterror("35147, " + arg0 + ", " + 115 + ", " + arg1 + ", " + local165.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(II[B)Z")
	private boolean method163(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1) {
		try {
			this.anInt368 += 0;
			return arg1 == null ? true : signlink.wavesave(arg1, arg0);
		} catch (@Pc(14) RuntimeException local14) {
			signlink.reporterror("80358, " + arg0 + ", " + 0 + ", " + arg1 + ", " + local14.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "h", descriptor = "(B)V")
	private void method165(@OriginalArg(0) byte arg0) {
		try {
			if (this.aClass35_6 == null) {
				this.method108();
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
				this.aClass35_6 = new Class35(this.method94(), (byte) 3, 96, 479);
				this.aClass35_4 = new Class35(this.method94(), (byte) 3, 156, 172);
				Class1_Sub1_Sub2.method437();
				this.aClass1_Sub1_Sub2_Sub3_2.method418(0, 0);
				this.aClass35_3 = new Class35(this.method94(), (byte) 3, 261, 190);
				this.aClass35_5 = new Class35(this.method94(), (byte) 3, 334, 512);
				@Pc(95) boolean local95 = false;
				Class1_Sub1_Sub2.method437();
				this.aClass35_7 = new Class35(this.method94(), (byte) 3, 50, 496);
				this.aClass35_8 = new Class35(this.method94(), (byte) 3, 37, 269);
				this.aClass35_9 = new Class35(this.method94(), (byte) 3, 45, 249);
				this.aBoolean61 = true;
			}
		} catch (@Pc(144) RuntimeException local144) {
			signlink.reporterror("50243, " + arg0 + ", " + local144.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "m", descriptor = "(Z)Z")
	private boolean method166() {
		try {
			if (this.aClass8_1 == null) {
				return false;
			}
			@Pc(160) String local160;
			@Pc(553) int local553;
			try {
				@Pc(16) int local16 = this.aClass8_1.method249();
				if (local16 == 0) {
					return false;
				}
				if (this.anInt369 == -1) {
					this.aClass8_1.method250(this.aClass1_Sub1_Sub3_3.aByteArray9, 0, 1);
					this.anInt369 = this.aClass1_Sub1_Sub3_3.aByteArray9[0] & 0xFF;
					if (this.aClass46_1 != null) {
						this.anInt369 = this.anInt369 - this.aClass46_1.method662() & 0xFF;
					}
					this.anInt368 = Class17.anIntArray210[this.anInt369];
					local16--;
				}
				if (this.anInt368 == -1) {
					if (local16 <= 0) {
						return false;
					}
					this.aClass8_1.method250(this.aClass1_Sub1_Sub3_3.aByteArray9, 0, 1);
					this.anInt368 = this.aClass1_Sub1_Sub3_3.aByteArray9[0] & 0xFF;
					local16--;
				}
				if (this.anInt368 == -2) {
					if (local16 <= 1) {
						return false;
					}
					this.aClass8_1.method250(this.aClass1_Sub1_Sub3_3.aByteArray9, 0, 2);
					this.aClass1_Sub1_Sub3_3.anInt742 = 0;
					this.anInt368 = this.aClass1_Sub1_Sub3_3.method482();
					local16 -= 2;
				}
				if (local16 < this.anInt368) {
					return false;
				}
				this.aClass1_Sub1_Sub3_3.anInt742 = 0;
				this.aClass8_1.method250(this.aClass1_Sub1_Sub3_3.aByteArray9, 0, this.anInt368);
				this.anInt370 = 0;
				this.anInt283 = this.anInt282;
				this.anInt282 = this.anInt281;
				this.anInt281 = this.anInt369;
				@Pc(178) int local178;
				@Pc(176) boolean local176;
				@Pc(311) String local311;
				@Pc(171) String local171;
				if (this.anInt369 == 238) {
					local160 = this.aClass1_Sub1_Sub3_3.method487();
					@Pc(174) long local174;
					if (local160.endsWith(":tradereq:")) {
						local171 = local160.substring(0, local160.indexOf(":"));
						local174 = Class48.method667(local171);
						local176 = false;
						for (local178 = 0; local178 < this.anInt274; local178++) {
							if (this.aLongArray4[local178] == local174) {
								local176 = true;
								break;
							}
						}
						if (!local176 && this.anInt377 == 0) {
							this.method227(4, local171, "wishes to trade with you.");
						}
					} else if (local160.endsWith(":duelreq:")) {
						local171 = local160.substring(0, local160.indexOf(":"));
						local174 = Class48.method667(local171);
						local176 = false;
						for (local178 = 0; local178 < this.anInt274; local178++) {
							if (this.aLongArray4[local178] == local174) {
								local176 = true;
								break;
							}
						}
						if (!local176 && this.anInt377 == 0) {
							this.method227(8, local171, "wishes to duel with you.");
						}
					} else if (local160.endsWith(":chalreq:")) {
						local171 = local160.substring(0, local160.indexOf(":"));
						local174 = Class48.method667(local171);
						local176 = false;
						for (local178 = 0; local178 < this.anInt274; local178++) {
							if (this.aLongArray4[local178] == local174) {
								local176 = true;
								break;
							}
						}
						if (!local176 && this.anInt377 == 0) {
							local311 = local160.substring(local160.indexOf(":") + 1, local160.length() - 9);
							this.method227(8, local171, local311);
						}
					} else {
						this.method227(0, "", local160);
					}
					this.anInt369 = -1;
					return true;
				}
				if (this.anInt369 == 118) {
					this.anInt410 = this.aClass1_Sub1_Sub3_3.method480();
					this.aBoolean53 = true;
					this.anInt369 = -1;
					return true;
				}
				if (this.anInt369 == 75) {
					this.method210();
					this.anInt369 = -1;
					return false;
				}
				@Pc(367) int local367;
				if (this.anInt369 == 169) {
					local367 = this.aClass1_Sub1_Sub3_3.method482();
					local171 = this.aClass1_Sub1_Sub3_3.method487();
					Class6.aClass6Array1[local367].aString18 = local171;
					if (Class6.aClass6Array1[local367].anInt433 == this.anIntArray68[this.anInt334]) {
						this.aBoolean53 = true;
					}
					this.anInt369 = -1;
					return true;
				}
				if (this.anInt369 == 196) {
					this.method175(this.anInt368, this.aClass1_Sub1_Sub3_3);
					this.aBoolean60 = false;
					this.anInt369 = -1;
					return true;
				}
				if (this.anInt369 == 108) {
					this.anInt337 = this.aClass1_Sub1_Sub3_3.method480();
					this.anInt338 = this.aClass1_Sub1_Sub3_3.method480();
					while (this.aClass1_Sub1_Sub3_3.anInt742 < this.anInt368) {
						local367 = this.aClass1_Sub1_Sub3_3.method480();
						this.method132(this.aClass1_Sub1_Sub3_3, local367);
					}
					this.anInt369 = -1;
					return true;
				}
				@Pc(469) int local469;
				@Pc(471) int local471;
				@Pc(484) int local484;
				@Pc(465) Class6 local465;
				if (this.anInt369 == 188) {
					this.aBoolean53 = true;
					local367 = this.aClass1_Sub1_Sub3_3.method482();
					local465 = Class6.aClass6Array1[local367];
					local469 = this.aClass1_Sub1_Sub3_3.method482();
					for (local471 = 0; local471 < local469; local471++) {
						local465.anIntArray94[local471] = this.aClass1_Sub1_Sub3_3.method482();
						local484 = this.aClass1_Sub1_Sub3_3.method480();
						if (local484 == 255) {
							local484 = this.aClass1_Sub1_Sub3_3.method485();
						}
						local465.anIntArray95[local471] = local484;
					}
					for (local484 = local469; local484 < local465.anIntArray94.length; local484++) {
						local465.anIntArray94[local484] = 0;
						local465.anIntArray95[local484] = 0;
					}
					this.anInt369 = -1;
					return true;
				}
				if (this.anInt369 == 195) {
					this.method118(this.anInt368, this.aClass1_Sub1_Sub3_3);
					this.anInt369 = -1;
					return true;
				}
				@Pc(803) int local803;
				@Pc(824) int local824;
				if (this.anInt369 == 170) {
					local367 = this.aClass1_Sub1_Sub3_3.method482();
					local553 = this.aClass1_Sub1_Sub3_3.method482();
					if (this.anInt225 == local367 && this.anInt226 == local553 && this.anInt353 == 2) {
						this.anInt369 = -1;
						return true;
					}
					this.anInt225 = local367;
					this.anInt226 = local553;
					this.anInt323 = (this.anInt225 - 6) * 8;
					this.anInt324 = (this.anInt226 - 6) * 8;
					this.aBoolean86 = false;
					if ((this.anInt225 / 8 == 48 || this.anInt225 / 8 == 49) && this.anInt226 / 8 == 48) {
						this.aBoolean86 = true;
					}
					if (this.anInt225 / 8 == 48 && this.anInt226 / 8 == 148) {
						this.aBoolean86 = true;
					}
					this.anInt353 = 1;
					this.aLong16 = System.currentTimeMillis();
					this.aClass35_5.method524(this.anInt255);
					this.aClass1_Sub1_Sub2_Sub4_2.method447("Loading - please wait.", 151, 0, 257, this.anInt272);
					this.aClass1_Sub1_Sub2_Sub4_2.method447("Loading - please wait.", 150, 16777215, 256, this.anInt272);
					this.aClass35_5.method525(super.aGraphics2, 4, 4);
					local469 = 0;
					for (local471 = (this.anInt225 - 6) / 8; local471 <= (this.anInt225 + 6) / 8; local471++) {
						for (local484 = (this.anInt226 - 6) / 8; local484 <= (this.anInt226 + 6) / 8; local484++) {
							local469++;
						}
					}
					this.aByteArrayArray2 = new byte[local469][];
					this.aByteArrayArray1 = new byte[local469][];
					this.anIntArray43 = new int[local469];
					this.anIntArray44 = new int[local469];
					this.anIntArray45 = new int[local469];
					local469 = 0;
					for (local484 = (this.anInt225 - 6) / 8; local484 <= (this.anInt225 + 6) / 8; local484++) {
						for (local178 = (this.anInt226 - 6) / 8; local178 <= (this.anInt226 + 6) / 8; local178++) {
							this.anIntArray43[local469] = (local484 << 8) + local178;
							if (this.aBoolean86 && (local178 == 49 || local178 == 149 || local178 == 147 || local484 == 50 || local484 == 49 && local178 == 47)) {
								this.anIntArray44[local469] = -1;
								this.anIntArray45[local469] = -1;
								local469++;
							} else {
								local803 = this.anIntArray44[local469] = this.aClass44_Sub1_1.method640(local178, 905, 0, local484);
								if (local803 != -1) {
									this.aClass44_Sub1_1.method645(3, local803);
								}
								local824 = this.anIntArray45[local469] = this.aClass44_Sub1_1.method640(local178, 905, 1, local484);
								if (local824 != -1) {
									this.aClass44_Sub1_1.method645(3, local824);
								}
								local469++;
							}
						}
					}
					local178 = this.anInt323 - this.anInt325;
					local803 = this.anInt324 - this.anInt326;
					this.anInt325 = this.anInt323;
					this.anInt326 = this.anInt324;
					for (local824 = 0; local824 < 16384; local824++) {
						@Pc(880) Class1_Sub1_Sub1_Sub1_Sub2 local880 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local824];
						if (local880 != null) {
							for (@Pc(884) int local884 = 0; local884 < 10; local884++) {
								local880.anIntArray272[local884] -= local178;
								local880.anIntArray273[local884] -= local803;
							}
							local880.anInt988 -= local178 * 128;
							local880.anInt989 -= local803 * 128;
						}
					}
					for (@Pc(928) int local928 = 0; local928 < this.anInt330; local928++) {
						@Pc(935) Class1_Sub1_Sub1_Sub1_Sub1 local935 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local928];
						if (local935 != null) {
							for (@Pc(939) int local939 = 0; local939 < 10; local939++) {
								local935.anIntArray272[local939] -= local178;
								local935.anIntArray273[local939] -= local803;
							}
							local935.anInt988 -= local178 * 128;
							local935.anInt989 -= local803 * 128;
						}
					}
					this.aBoolean60 = true;
					@Pc(987) byte local987 = 0;
					@Pc(989) byte local989 = 104;
					@Pc(991) byte local991 = 1;
					if (local178 < 0) {
						local987 = 103;
						local989 = -1;
						local991 = -1;
					}
					@Pc(1001) byte local1001 = 0;
					@Pc(1003) byte local1003 = 104;
					@Pc(1005) byte local1005 = 1;
					if (local803 < 0) {
						local1001 = 103;
						local1003 = -1;
						local1005 = -1;
					}
					for (@Pc(1015) int local1015 = local987; local1015 != local989; local1015 += local991) {
						for (@Pc(1019) int local1019 = local1001; local1019 != local1003; local1019 += local1005) {
							@Pc(1025) int local1025 = local1015 + local178;
							@Pc(1029) int local1029 = local1019 + local803;
							for (@Pc(1031) int local1031 = 0; local1031 < 4; local1031++) {
								if (local1025 >= 0 && local1029 >= 0 && local1025 < 104 && local1029 < 104) {
									this.aClass29ArrayArrayArray1[local1031][local1015][local1019] = this.aClass29ArrayArrayArray1[local1031][local1025][local1029];
								} else {
									this.aClass29ArrayArrayArray1[local1031][local1015][local1019] = null;
								}
							}
						}
					}
					for (@Pc(1093) Class1_Sub2 local1093 = (Class1_Sub2) this.aClass29_2.method511(); local1093 != null; local1093 = (Class1_Sub2) this.aClass29_2.method513()) {
						local1093.anInt782 -= local178;
						local1093.anInt783 -= local803;
						if (local1093.anInt782 < 0 || local1093.anInt783 < 0 || local1093.anInt782 >= 104 || local1093.anInt783 >= 104) {
							local1093.method673();
						}
					}
					if (this.anInt275 != 0) {
						this.anInt275 -= local178;
						this.anInt276 -= local803;
					}
					this.aBoolean50 = false;
					this.anInt369 = -1;
					return true;
				}
				if (this.anInt369 == 83) {
					this.anInt275 = 0;
					this.anInt369 = -1;
					return true;
				}
				if (this.anInt369 == 213) {
					local367 = this.aClass1_Sub1_Sub3_3.method482();
					@Pc(1178) byte local1178 = this.aClass1_Sub1_Sub3_3.method481();
					this.anIntArray78[local367] = local1178;
					if (this.anIntArray50[local367] != local1178) {
						this.anIntArray50[local367] = local1178;
						this.method218(local367, this.aByte8);
						this.aBoolean53 = true;
						if (this.anInt412 != -1) {
							this.aBoolean59 = true;
						}
					}
					this.anInt369 = -1;
					return true;
				}
				if (this.anInt369 == 153) {
					local367 = this.aClass1_Sub1_Sub3_3.method482();
					local553 = this.aClass1_Sub1_Sub3_3.method482();
					local469 = this.aClass1_Sub1_Sub3_3.method482();
					if (local553 == 65535) {
						Class6.aClass6Array1[local367].anInt451 = 0;
						this.anInt369 = -1;
						return true;
					}
					@Pc(1246) Class15 local1246 = Class15.method361(local553);
					Class6.aClass6Array1[local367].anInt451 = 4;
					Class6.aClass6Array1[local367].anInt452 = local553;
					Class6.aClass6Array1[local367].anInt458 = local1246.anInt606;
					Class6.aClass6Array1[local367].anInt459 = local1246.anInt607;
					Class6.aClass6Array1[local367].anInt457 = local1246.anInt605 * 100 / local469;
					this.anInt369 = -1;
					return true;
				}
				if (this.anInt369 == 19) {
					this.anInt344 = this.aClass1_Sub1_Sub3_3.method480();
					this.anInt369 = -1;
					return true;
				}
				if (this.anInt369 == 212) {
					if (this.anInt376 != -1) {
						this.anInt376 = -1;
						this.aBoolean53 = true;
						this.aBoolean64 = true;
					}
					if (this.anInt217 != -1) {
						this.anInt217 = -1;
						this.aBoolean59 = true;
					}
					if (this.aBoolean43) {
						this.aBoolean43 = false;
						this.aBoolean59 = true;
					}
					this.anInt378 = -1;
					this.aBoolean49 = false;
					this.anInt369 = -1;
					return true;
				}
				@Pc(1360) Class6 local1360;
				if (this.anInt369 == 186) {
					local367 = this.aClass1_Sub1_Sub3_3.method482();
					local553 = this.aClass1_Sub1_Sub3_3.method483();
					local1360 = Class6.aClass6Array1[local367];
					local1360.anInt455 = local553;
					if (local553 == -1) {
						local1360.anInt430 = 0;
						local1360.anInt431 = 0;
					}
					this.anInt369 = -1;
					return true;
				}
				if (this.anInt369 == 33) {
					this.anInt214 = this.aClass1_Sub1_Sub3_3.method482();
					this.anInt367 = this.aClass1_Sub1_Sub3_3.method480();
					this.anInt369 = -1;
					return true;
				}
				if (this.anInt369 == 181) {
					this.anInt271 = this.aClass1_Sub1_Sub3_3.method480();
					if (this.anInt271 == this.anInt334) {
						if (this.anInt271 == 3) {
							this.anInt334 = 1;
						} else {
							this.anInt334 = 3;
						}
						this.aBoolean53 = true;
					}
					this.anInt369 = -1;
					return true;
				}
				if (this.anInt369 == 138) {
					this.aBoolean50 = false;
					for (local367 = 0; local367 < 5; local367++) {
						this.aBooleanArray4[local367] = false;
					}
					this.anInt369 = -1;
					return true;
				}
				if (this.anInt369 == 55) {
					this.anInt420 = this.aClass1_Sub1_Sub3_3.method480();
					if (this.anInt420 == 1) {
						this.anInt233 = this.aClass1_Sub1_Sub3_3.method482();
					}
					if (this.anInt420 >= 2 && this.anInt420 <= 6) {
						if (this.anInt420 == 2) {
							this.anInt241 = 64;
							this.anInt242 = 64;
						}
						if (this.anInt420 == 3) {
							this.anInt241 = 0;
							this.anInt242 = 64;
						}
						if (this.anInt420 == 4) {
							this.anInt241 = 128;
							this.anInt242 = 64;
						}
						if (this.anInt420 == 5) {
							this.anInt241 = 64;
							this.anInt242 = 0;
						}
						if (this.anInt420 == 6) {
							this.anInt241 = 64;
							this.anInt242 = 128;
						}
						this.anInt420 = 2;
						this.anInt238 = this.aClass1_Sub1_Sub3_3.method482();
						this.anInt239 = this.aClass1_Sub1_Sub3_3.method482();
						this.anInt240 = this.aClass1_Sub1_Sub3_3.method480();
					}
					if (this.anInt420 == 10) {
						this.anInt258 = this.aClass1_Sub1_Sub3_3.method482();
					}
					this.anInt369 = -1;
					return true;
				}
				if (this.anInt369 == 105) {
					this.anInt274 = this.anInt368 / 8;
					for (local367 = 0; local367 < this.anInt274; local367++) {
						this.aLongArray4[local367] = this.aClass1_Sub1_Sub3_3.method486();
					}
					this.anInt369 = -1;
					return true;
				}
				if (this.anInt369 == 145) {
					local367 = this.aClass1_Sub1_Sub3_3.method482();
					local553 = this.aClass1_Sub1_Sub3_3.method485();
					this.anIntArray78[local367] = local553;
					if (this.anIntArray50[local367] != local553) {
						this.anIntArray50[local367] = local553;
						this.method218(local367, this.aByte8);
						this.aBoolean53 = true;
						if (this.anInt412 != -1) {
							this.aBoolean59 = true;
						}
					}
					this.anInt369 = -1;
					return true;
				}
				if (this.anInt369 == 44) {
					this.anInt337 = this.aClass1_Sub1_Sub3_3.method480();
					this.anInt338 = this.aClass1_Sub1_Sub3_3.method480();
					for (local367 = this.anInt337; local367 < this.anInt337 + 8; local367++) {
						for (local553 = this.anInt338; local553 < this.anInt338 + 8; local553++) {
							if (this.aClass29ArrayArrayArray1[this.anInt246][local367][local553] != null) {
								this.aClass29ArrayArrayArray1[this.anInt246][local367][local553] = null;
								this.method176(local367, local553);
							}
						}
					}
					for (@Pc(1710) Class1_Sub2 local1710 = (Class1_Sub2) this.aClass29_2.method511(); local1710 != null; local1710 = (Class1_Sub2) this.aClass29_2.method513()) {
						if (local1710.anInt782 >= this.anInt337 && local1710.anInt782 < this.anInt337 + 8 && local1710.anInt783 >= this.anInt338 && local1710.anInt783 < this.anInt338 + 8 && local1710.anInt780 == this.anInt246) {
							local1710.anInt791 = 0;
						}
					}
					this.anInt369 = -1;
					return true;
				}
				if (this.anInt369 == 141) {
					local367 = this.aClass1_Sub1_Sub3_3.method482();
					local553 = this.aClass1_Sub1_Sub3_3.method480();
					if (local367 == 65535) {
						local367 = -1;
					}
					this.anIntArray68[local553] = local367;
					this.aBoolean53 = true;
					this.aBoolean64 = true;
					this.anInt369 = -1;
					return true;
				}
				if (this.anInt369 == 38) {
					local367 = this.aClass1_Sub1_Sub3_3.method482();
					if (local367 == 65535) {
						local367 = -1;
					}
					if (local367 != this.anInt302 && this.aBoolean79 && !aBoolean71 && this.anInt295 == 0) {
						this.anInt357 = local367;
						this.aBoolean73 = true;
						this.aClass44_Sub1_1.method645(2, this.anInt357);
					}
					this.anInt302 = local367;
					this.anInt369 = -1;
					return true;
				}
				if (this.anInt369 == 183) {
					local367 = this.aClass1_Sub1_Sub3_3.method482();
					local553 = this.aClass1_Sub1_Sub3_3.method482();
					if (this.aBoolean79 && !aBoolean71) {
						this.anInt357 = local367;
						this.aBoolean73 = false;
						this.aClass44_Sub1_1.method645(2, this.anInt357);
						this.anInt295 = local553;
					}
					this.anInt369 = -1;
					return true;
				}
				if (this.anInt369 == 85) {
					local367 = this.aClass1_Sub1_Sub3_3.method482();
					local553 = this.aClass1_Sub1_Sub3_3.method482();
					local1360 = Class6.aClass6Array1[local367];
					if (local1360 != null && local1360.anInt434 == 0) {
						if (local553 < 0) {
							local553 = 0;
						}
						if (local553 > local1360.anInt442 - local1360.anInt438) {
							local553 = local1360.anInt442 - local1360.anInt438;
						}
						local1360.anInt443 = local553;
					}
					this.anInt369 = -1;
					return true;
				}
				if (this.anInt369 == 111) {
					for (local367 = 0; local367 < this.aClass1_Sub1_Sub1_Sub1_Sub1Array1.length; local367++) {
						if (this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local367] != null) {
							this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local367].anInt1011 = -1;
						}
					}
					for (local553 = 0; local553 < this.aClass1_Sub1_Sub1_Sub1_Sub2Array1.length; local553++) {
						if (this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local553] != null) {
							this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local553].anInt1011 = -1;
						}
					}
					this.anInt369 = -1;
					return true;
				}
				if (this.anInt369 == 77) {
					local367 = this.aClass1_Sub1_Sub3_3.method482();
					this.method212(local367);
					if (this.anInt376 != -1) {
						this.anInt376 = -1;
						this.aBoolean53 = true;
						this.aBoolean64 = true;
					}
					this.anInt217 = local367;
					this.aBoolean59 = true;
					this.anInt378 = -1;
					this.aBoolean49 = false;
					this.anInt369 = -1;
					return true;
				}
				if (this.anInt369 == 3) {
					this.anInt334 = this.aClass1_Sub1_Sub3_3.method480();
					this.aBoolean53 = true;
					this.aBoolean64 = true;
					this.anInt369 = -1;
					return true;
				}
				if (this.anInt369 == 81) {
					local367 = this.aClass1_Sub1_Sub3_3.method482();
					local553 = this.aClass1_Sub1_Sub3_3.method482();
					local469 = this.aClass1_Sub1_Sub3_3.method482();
					local471 = this.aClass1_Sub1_Sub3_3.method482();
					Class6.aClass6Array1[local367].anInt458 = local553;
					Class6.aClass6Array1[local367].anInt459 = local469;
					Class6.aClass6Array1[local367].anInt457 = local471;
					this.anInt369 = -1;
					return true;
				}
				if (this.anInt369 == 22) {
					this.anInt337 = this.aClass1_Sub1_Sub3_3.method480();
					this.anInt338 = this.aClass1_Sub1_Sub3_3.method480();
					this.anInt369 = -1;
					return true;
				}
				if (this.anInt369 == 185) {
					local367 = this.aClass1_Sub1_Sub3_3.method482();
					local553 = this.aClass1_Sub1_Sub3_3.method482();
					Class6.aClass6Array1[local367].anInt451 = 1;
					Class6.aClass6Array1[local367].anInt452 = local553;
					this.anInt369 = -1;
					return true;
				}
				if (this.anInt369 == 13) {
					this.aBoolean53 = true;
					local367 = this.aClass1_Sub1_Sub3_3.method482();
					local465 = Class6.aClass6Array1[local367];
					while (this.aClass1_Sub1_Sub3_3.anInt742 < this.anInt368) {
						local469 = this.aClass1_Sub1_Sub3_3.method494();
						local471 = this.aClass1_Sub1_Sub3_3.method482();
						local484 = this.aClass1_Sub1_Sub3_3.method480();
						if (local484 == 255) {
							local484 = this.aClass1_Sub1_Sub3_3.method485();
						}
						if (local469 >= 0 && local469 < local465.anIntArray94.length) {
							local465.anIntArray94[local469] = local471;
							local465.anIntArray95[local469] = local484;
						}
					}
					this.anInt369 = -1;
					return true;
				}
				if (this.anInt369 == 214) {
					local367 = this.aClass1_Sub1_Sub3_3.method482();
					local553 = this.aClass1_Sub1_Sub3_3.method482();
					local469 = local553 >> 10 & 0x1F;
					local471 = local553 >> 5 & 0x1F;
					local484 = local553 & 0x1F;
					Class6.aClass6Array1[local367].anInt447 = (local469 << 19) + (local471 << 11) + (local484 << 3);
					this.anInt369 = -1;
					return true;
				}
				if (this.anInt369 == 98) {
					local367 = this.aClass1_Sub1_Sub3_3.method480();
					local553 = this.aClass1_Sub1_Sub3_3.method480();
					@Pc(2245) String local2245 = this.aClass1_Sub1_Sub3_3.method487();
					if (local367 >= 1 && local367 <= 5) {
						if (local2245.equalsIgnoreCase("null")) {
							local2245 = null;
						}
						this.aStringArray1[local367 - 1] = local2245;
						this.aBooleanArray3[local367 - 1] = local553 == 0;
					}
					this.anInt369 = -1;
					return true;
				}
				if (this.anInt369 == 204) {
					local367 = this.aClass1_Sub1_Sub3_3.method482();
					local465 = Class6.aClass6Array1[local367];
					for (local469 = 0; local469 < local465.anIntArray94.length; local469++) {
						local465.anIntArray94[local469] = -1;
						local465.anIntArray94[local469] = 0;
					}
					this.anInt369 = -1;
					return true;
				}
				if (this.anInt369 == 156) {
					if (this.anInt334 == 12) {
						this.aBoolean53 = true;
					}
					this.anInt374 = this.aClass1_Sub1_Sub3_3.method483();
					this.anInt369 = -1;
					return true;
				}
				if (this.anInt369 == 151) {
					this.aBoolean53 = true;
					local367 = this.aClass1_Sub1_Sub3_3.method480();
					local553 = this.aClass1_Sub1_Sub3_3.method485();
					local469 = this.aClass1_Sub1_Sub3_3.method480();
					this.anIntArray55[local367] = local553;
					this.anIntArray32[local367] = local469;
					this.anIntArray59[local367] = 1;
					for (local471 = 0; local471 < 98; local471++) {
						if (local553 >= anIntArray70[local471]) {
							this.anIntArray59[local367] = local471 + 2;
						}
					}
					this.anInt369 = -1;
					return true;
				}
				if (this.anInt369 == 222 || this.anInt369 == 253 || this.anInt369 == 191 || this.anInt369 == 137 || this.anInt369 == 193 || this.anInt369 == 30 || this.anInt369 == 53 || this.anInt369 == 147 || this.anInt369 == 2 || this.anInt369 == 211 || this.anInt369 == 136) {
					this.method132(this.aClass1_Sub1_Sub3_3, this.anInt369);
					this.anInt369 = -1;
					return true;
				}
				if (this.anInt369 == 45) {
					local367 = this.aClass1_Sub1_Sub3_3.method482();
					local553 = this.aClass1_Sub1_Sub3_3.method480();
					local469 = this.aClass1_Sub1_Sub3_3.method482();
					if (this.aBoolean77 && !aBoolean71 && this.anInt317 < 50) {
						this.anIntArray42[this.anInt317] = local367;
						this.anIntArray89[this.anInt317] = local553;
						this.anIntArray36[this.anInt317] = local469 + Class5.anIntArray29[local367];
						this.anInt317++;
					}
					this.anInt369 = -1;
					return true;
				}
				if (this.anInt369 == 62) {
					this.aBoolean81 = false;
					this.aBoolean43 = true;
					this.aString11 = "";
					this.aBoolean59 = true;
					this.anInt369 = -1;
					return true;
				}
				@Pc(2541) long local2541;
				if (this.anInt369 == 149) {
					local2541 = this.aClass1_Sub1_Sub3_3.method486();
					local469 = this.aClass1_Sub1_Sub3_3.method480();
					@Pc(2551) String local2551 = Class48.method671(943, Class48.method668(local2541));
					for (local484 = 0; local484 < this.anInt409; local484++) {
						if (local2541 == this.aLongArray3[local484]) {
							if (this.anIntArray49[local484] != local469) {
								this.anIntArray49[local484] = local469;
								this.aBoolean53 = true;
								if (local469 > 0) {
									this.method227(5, "", local2551 + " has logged in.");
								}
								if (local469 == 0) {
									this.method227(5, "", local2551 + " has logged out.");
								}
							}
							local2551 = null;
							break;
						}
					}
					if (local2551 != null && this.anInt409 < 200) {
						this.aLongArray3[this.anInt409] = local2541;
						this.aStringArray6[this.anInt409] = local2551;
						this.anIntArray49[this.anInt409] = local469;
						this.anInt409++;
						this.aBoolean53 = true;
					}
					@Pc(2649) boolean local2649 = false;
					while (!local2649) {
						local2649 = true;
						for (local803 = 0; local803 < this.anInt409 - 1; local803++) {
							if (this.anIntArray49[local803] != anInt347 && this.anIntArray49[local803 + 1] == anInt347 || this.anIntArray49[local803] == 0 && this.anIntArray49[local803 + 1] != 0) {
								local824 = this.anIntArray49[local803];
								this.anIntArray49[local803] = this.anIntArray49[local803 + 1];
								this.anIntArray49[local803 + 1] = local824;
								@Pc(2710) String local2710 = this.aStringArray6[local803];
								this.aStringArray6[local803] = this.aStringArray6[local803 + 1];
								this.aStringArray6[local803 + 1] = local2710;
								@Pc(2732) long local2732 = this.aLongArray3[local803];
								this.aLongArray3[local803] = this.aLongArray3[local803 + 1];
								this.aLongArray3[local803 + 1] = local2732;
								this.aBoolean53 = true;
								local2649 = false;
							}
						}
					}
					this.anInt369 = -1;
					return true;
				}
				if (this.anInt369 == 226) {
					for (local367 = 0; local367 < this.anIntArray50.length; local367++) {
						if (this.anIntArray50[local367] != this.anIntArray78[local367]) {
							this.anIntArray50[local367] = this.anIntArray78[local367];
							this.method218(local367, this.aByte8);
							this.aBoolean53 = true;
						}
					}
					this.anInt369 = -1;
					return true;
				}
				if (this.anInt369 == 131) {
					this.anInt339 = this.aClass1_Sub1_Sub3_3.method480();
					this.anInt369 = -1;
					return true;
				}
				if (this.anInt369 == 9) {
					local367 = this.aClass1_Sub1_Sub3_3.method483();
					this.anInt412 = local367;
					this.aBoolean59 = true;
					this.anInt369 = -1;
					return true;
				}
				if (this.anInt369 == 237) {
					local367 = this.aClass1_Sub1_Sub3_3.method482();
					this.method212(local367);
					if (this.anInt217 != -1) {
						this.anInt217 = -1;
						this.aBoolean59 = true;
					}
					if (this.aBoolean43) {
						this.aBoolean43 = false;
						this.aBoolean59 = true;
					}
					this.anInt376 = local367;
					this.aBoolean53 = true;
					this.aBoolean64 = true;
					this.anInt378 = -1;
					this.aBoolean49 = false;
					this.anInt369 = -1;
					return true;
				}
				if (this.anInt369 == 115) {
					this.aBoolean50 = true;
					this.anInt287 = this.aClass1_Sub1_Sub3_3.method480();
					this.anInt288 = this.aClass1_Sub1_Sub3_3.method480();
					this.anInt289 = this.aClass1_Sub1_Sub3_3.method482();
					this.anInt290 = this.aClass1_Sub1_Sub3_3.method480();
					this.anInt291 = this.aClass1_Sub1_Sub3_3.method480();
					if (this.anInt291 >= 100) {
						this.anInt381 = this.anInt287 * 128 + 64;
						this.anInt383 = this.anInt288 * 128 + 64;
						this.anInt382 = this.method223(this.anInt381, this.anInt246, this.anInt383) - this.anInt289;
					}
					this.anInt369 = -1;
					return true;
				}
				if (this.anInt369 == 224) {
					local2541 = this.aClass1_Sub1_Sub3_3.method486();
					local469 = this.aClass1_Sub1_Sub3_3.method485();
					local471 = this.aClass1_Sub1_Sub3_3.method480();
					local176 = false;
					for (local178 = 0; local178 < 100; local178++) {
						if (this.anIntArray90[local178] == local469) {
							local176 = true;
							break;
						}
					}
					if (local471 <= 1) {
						for (local803 = 0; local803 < this.anInt274; local803++) {
							if (this.aLongArray4[local803] == local2541) {
								local176 = true;
								break;
							}
						}
					}
					if (!local176 && this.anInt377 == 0) {
						try {
							this.anIntArray90[this.anInt341] = local469;
							this.anInt341 = (this.anInt341 + 1) % 100;
							local311 = Class49.method683(this.anInt368 - 13, this.aClass1_Sub1_Sub3_3);
							@Pc(3059) String local3059 = Class42.method604(local311);
							if (local471 == 2 || local471 == 3) {
								this.method227(7, "@cr2@" + Class48.method671(943, Class48.method668(local2541)), local3059);
							} else if (local471 == 1) {
								this.method227(7, "@cr1@" + Class48.method671(943, Class48.method668(local2541)), local3059);
							} else {
								this.method227(3, Class48.method671(943, Class48.method668(local2541)), local3059);
							}
						} catch (@Pc(3116) Exception local3116) {
							signlink.reporterror("cde1");
						}
					}
					this.anInt369 = -1;
					return true;
				}
				if (this.anInt369 == 51) {
					local367 = this.aClass1_Sub1_Sub3_3.method482();
					@Pc(3141) boolean local3141 = this.aClass1_Sub1_Sub3_3.method480() == 1;
					Class6.aClass6Array1[local367].aBoolean92 = local3141;
					this.anInt369 = -1;
					return true;
				}
				if (this.anInt369 == 7) {
					local367 = this.aClass1_Sub1_Sub3_3.method482();
					local553 = this.aClass1_Sub1_Sub3_3.method482();
					Class6.aClass6Array1[local367].anInt451 = 2;
					Class6.aClass6Array1[local367].anInt452 = local553;
					this.anInt369 = -1;
					return true;
				}
				if (this.anInt369 == 130) {
					local367 = this.aClass1_Sub1_Sub3_3.method482();
					local553 = this.aClass1_Sub1_Sub3_3.method483();
					local469 = this.aClass1_Sub1_Sub3_3.method483();
					@Pc(3198) Class6 local3198 = Class6.aClass6Array1[local367];
					local3198.anInt439 = local553;
					local3198.anInt440 = local469;
					this.anInt369 = -1;
					return true;
				}
				if (this.anInt369 == 245) {
					local367 = this.aClass1_Sub1_Sub3_3.method482();
					local553 = this.aClass1_Sub1_Sub3_3.method482();
					if (this.anInt217 != -1) {
						this.anInt217 = -1;
						this.aBoolean59 = true;
					}
					if (this.aBoolean43) {
						this.aBoolean43 = false;
						this.aBoolean59 = true;
					}
					this.anInt378 = local367;
					this.anInt376 = local553;
					this.aBoolean53 = true;
					this.aBoolean64 = true;
					this.aBoolean49 = false;
					this.anInt369 = -1;
					return true;
				}
				if (this.anInt369 == 246) {
					local367 = this.aClass1_Sub1_Sub3_3.method483();
					if (local367 >= 0) {
						this.method212(local367);
					}
					this.anInt319 = local367;
					this.anInt369 = -1;
					return true;
				}
				if (this.anInt369 == 92) {
					local367 = this.aClass1_Sub1_Sub3_3.method480();
					local553 = this.aClass1_Sub1_Sub3_3.method480();
					local469 = this.aClass1_Sub1_Sub3_3.method480();
					local471 = this.aClass1_Sub1_Sub3_3.method480();
					this.aBooleanArray4[local367] = true;
					this.anIntArray57[local367] = local553;
					this.anIntArray56[local367] = local469;
					this.anIntArray77[local367] = local471;
					this.anIntArray63[local367] = 0;
					this.anInt369 = -1;
					return true;
				}
				if (this.anInt369 == 228) {
					this.anInt365 = this.aClass1_Sub1_Sub3_3.method482() * 30;
					this.anInt369 = -1;
					return true;
				}
				if (this.anInt369 == 94) {
					local367 = this.aClass1_Sub1_Sub3_3.method482();
					Class6.aClass6Array1[local367].anInt451 = 3;
					if (aClass1_Sub1_Sub1_Sub1_Sub1_1.aClass13_1 == null) {
						Class6.aClass6Array1[local367].anInt452 = (aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray14[0] << 25) + (aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray14[4] << 20) + (aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray13[0] << 15) + (aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray13[8] << 10) + (aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray13[11] << 5) + aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray13[1];
					} else {
						Class6.aClass6Array1[local367].anInt452 = (int) (aClass1_Sub1_Sub1_Sub1_Sub1_1.aClass13_1.aLong23 + 305419896L);
					}
					this.anInt369 = -1;
					return true;
				}
				if (this.anInt369 == 206) {
					this.anInt216 = this.aClass1_Sub1_Sub3_3.method480();
					this.anInt421 = this.aClass1_Sub1_Sub3_3.method480();
					this.anInt296 = this.aClass1_Sub1_Sub3_3.method480();
					this.aBoolean45 = true;
					this.aBoolean59 = true;
					this.anInt369 = -1;
					return true;
				}
				if (this.anInt369 == 27) {
					if (this.anInt334 == 12) {
						this.aBoolean53 = true;
					}
					this.anInt380 = this.aClass1_Sub1_Sub3_3.method480();
					this.anInt369 = -1;
					return true;
				}
				if (this.anInt369 == 241) {
					this.aBoolean50 = true;
					this.anInt414 = this.aClass1_Sub1_Sub3_3.method480();
					this.anInt415 = this.aClass1_Sub1_Sub3_3.method480();
					this.anInt416 = this.aClass1_Sub1_Sub3_3.method482();
					this.anInt417 = this.aClass1_Sub1_Sub3_3.method480();
					this.anInt418 = this.aClass1_Sub1_Sub3_3.method480();
					if (this.anInt418 >= 100) {
						local367 = this.anInt414 * 128 + 64;
						local553 = this.anInt415 * 128 + 64;
						local469 = this.method223(local367, this.anInt246, local553) - this.anInt416;
						local471 = local367 - this.anInt381;
						local484 = local469 - this.anInt382;
						local178 = local553 - this.anInt383;
						local803 = (int) Math.sqrt((double) (local471 * local471 + local178 * local178));
						this.anInt384 = (int) (Math.atan2((double) local484, (double) local803) * 325.949D) & 0x7FF;
						this.anInt385 = (int) (Math.atan2((double) local471, (double) local178) * -325.949D) & 0x7FF;
						if (this.anInt384 < 128) {
							this.anInt384 = 128;
						}
						if (this.anInt384 > 383) {
							this.anInt384 = 383;
						}
					}
					this.anInt369 = -1;
					return true;
				}
				if (this.anInt369 == 119) {
					this.anInt413 = this.aClass1_Sub1_Sub3_3.method485();
					this.anInt278 = this.aClass1_Sub1_Sub3_3.method482();
					this.anInt390 = this.aClass1_Sub1_Sub3_3.method480();
					this.anInt280 = this.aClass1_Sub1_Sub3_3.method482();
					this.anInt224 = this.aClass1_Sub1_Sub3_3.method480();
					if (this.anInt413 != 0 && this.anInt378 == -1) {
						signlink.dnslookup(Class48.method670(this.anInt413));
						this.method143();
						@Pc(3651) short local3651 = 650;
						if (this.anInt390 != 201 || this.anInt224 == 1) {
							local3651 = 655;
						}
						this.aString12 = "";
						this.aBoolean82 = false;
						for (local553 = 0; local553 < Class6.aClass6Array1.length; local553++) {
							if (Class6.aClass6Array1[local553] != null && Class6.aClass6Array1[local553].anInt436 == local3651) {
								this.anInt378 = Class6.aClass6Array1[local553].anInt433;
								break;
							}
						}
					}
					this.anInt369 = -1;
					return true;
				}
				if (this.anInt369 == 236) {
					local367 = this.aClass1_Sub1_Sub3_3.method482();
					this.method212(local367);
					if (this.anInt376 != -1) {
						this.anInt376 = -1;
						this.aBoolean53 = true;
						this.aBoolean64 = true;
					}
					if (this.anInt217 != -1) {
						this.anInt217 = -1;
						this.aBoolean59 = true;
					}
					if (this.aBoolean43) {
						this.aBoolean43 = false;
						this.aBoolean59 = true;
					}
					this.anInt378 = local367;
					this.aBoolean49 = false;
					this.anInt369 = -1;
					return true;
				}
				signlink.reporterror("T1 - " + this.anInt369 + "," + this.anInt368 + " - " + this.anInt282 + "," + this.anInt283);
				this.method210();
			} catch (@Pc(3783) IOException local3783) {
				this.method183();
			} catch (@Pc(3788) Exception local3788) {
				local160 = "T2 - " + this.anInt369 + "," + this.anInt282 + "," + this.anInt283 + " - " + this.anInt368 + "," + (this.anInt323 + aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray272[0]) + "," + (this.anInt324 + aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray273[0]) + " - ";
				for (local553 = 0; local553 < this.anInt368 && local553 < 50; local553++) {
					local160 = local160 + this.aClass1_Sub1_Sub3_3.aByteArray9[local553] + ",";
				}
				signlink.reporterror(local160);
				this.method210();
			}
			return true;
		} catch (@Pc(3869) RuntimeException local3869) {
			signlink.reporterror("74397, " + true + ", " + local3869.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(III)Z")
	private boolean method167(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		try {
			this.anInt368 += 0;
			@Pc(9) boolean local9 = false;
			@Pc(13) Class6 local13 = Class6.aClass6Array1[arg1];
			for (@Pc(15) int local15 = 0; local15 < local13.anIntArray98.length && local13.anIntArray98[local15] != -1; local15++) {
				@Pc(30) Class6 local30 = Class6.aClass6Array1[local13.anIntArray98[local15]];
				if (local30.anInt434 == 1) {
					local9 |= this.method167(arg0, local30.anInt432);
				}
				if (local30.anInt434 == 6 && (local30.anInt455 != -1 || local30.anInt456 != -1)) {
					@Pc(60) boolean local60 = this.method168(local30);
					@Pc(65) int local65;
					if (local60) {
						local65 = local30.anInt456;
					} else {
						local65 = local30.anInt455;
					}
					if (local65 != -1) {
						@Pc(77) Class27 local77 = Class27.aClass27Array1[local65];
						local30.anInt431 += arg0;
						while (local30.anInt431 > local77.method506(local30.anInt430)) {
							local30.anInt431 -= local77.method506(local30.anInt430) + 1;
							local30.anInt430++;
							if (local30.anInt430 >= local77.anInt794) {
								local30.anInt430 -= local77.anInt795;
								if (local30.anInt430 < 0 || local30.anInt430 >= local77.anInt794) {
									local30.anInt430 = 0;
								}
							}
							local9 = true;
						}
					}
				}
			}
			return local9;
		} catch (@Pc(145) RuntimeException local145) {
			signlink.reporterror("47360, " + arg0 + ", " + 0 + ", " + arg1 + ", " + local145.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!d;Z)Z")
	private boolean method168(@OriginalArg(0) Class6 arg0) {
		try {
			if (arg0.anIntArray96 == null) {
				return false;
			}
			for (@Pc(6) int local6 = 0; local6 < arg0.anIntArray96.length; local6++) {
				@Pc(14) int local14 = this.method101(arg0, local6);
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
			return true;
		} catch (@Pc(72) RuntimeException local72) {
			signlink.reporterror("2469, " + arg0 + ", " + true + ", " + local72.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/String;)Ljava/io/DataInputStream;")
	private DataInputStream method169(@OriginalArg(0) String arg0) throws IOException {
		if (this.aBoolean74) {
			if (this.aSocket1 != null) {
				try {
					this.aSocket1.close();
				} catch (@Pc(26) Exception local26) {
				}
				this.aSocket1 = null;
			}
			this.aSocket1 = this.method230(43595);
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

	@OriginalMember(owner = "client!client", name = "v", descriptor = "(I)V")
	private void method170() {
		try {
			this.anInt368 += 0;
			anInt223++;
			if (anInt223 > 192) {
				anInt223 = 0;
				this.aClass1_Sub1_Sub3_4.method469(24);
				this.aClass1_Sub1_Sub3_4.method470(232);
			}
			while (true) {
				@Pc(29) int local29;
				do {
					while (true) {
						local29 = this.method88();
						if (local29 == -1) {
							return;
						}
						if (this.anInt378 != -1 && this.anInt378 == this.anInt340) {
							if (local29 == 8 && this.aString12.length() > 0) {
								this.aString12 = this.aString12.substring(0, this.aString12.length() - 1);
							}
							break;
						}
						@Pc(209) int local209;
						if (this.aBoolean81) {
							if (local29 >= 32 && local29 <= 122 && this.aString4.length() < 80) {
								this.aString4 = this.aString4 + (char) local29;
								this.aBoolean59 = true;
							}
							if (local29 == 8 && this.aString4.length() > 0) {
								this.aString4 = this.aString4.substring(0, this.aString4.length() - 1);
								this.aBoolean59 = true;
							}
							if (local29 == 13 || local29 == 10) {
								this.aBoolean81 = false;
								this.aBoolean59 = true;
								@Pc(169) long local169;
								if (this.anInt286 == 1) {
									local169 = Class48.method667(this.aString4);
									this.method188(local169);
								}
								if (this.anInt286 == 2 && this.anInt409 > 0) {
									local169 = Class48.method667(this.aString4);
									this.method209(local169);
								}
								if (this.anInt286 == 3 && this.aString4.length() > 0) {
									this.aClass1_Sub1_Sub3_4.method469(47);
									this.aClass1_Sub1_Sub3_4.method470(0);
									local209 = this.aClass1_Sub1_Sub3_4.anInt742;
									this.aClass1_Sub1_Sub3_4.method476(this.aLong17);
									Class49.method684(this.aClass1_Sub1_Sub3_4, this.aString4);
									this.aClass1_Sub1_Sub3_4.method479(this.aClass1_Sub1_Sub3_4.anInt742 - local209);
									this.aString4 = Class49.method685(this.aString4);
									this.aString4 = Class42.method604(this.aString4);
									this.method227(6, Class48.method671(943, Class48.method668(this.aLong17)), this.aString4);
									if (this.anInt421 == 2) {
										this.anInt421 = 1;
										this.aBoolean45 = true;
										this.aClass1_Sub1_Sub3_4.method469(242);
										this.aClass1_Sub1_Sub3_4.method470(this.anInt216);
										this.aClass1_Sub1_Sub3_4.method470(this.anInt421);
										this.aClass1_Sub1_Sub3_4.method470(this.anInt296);
									}
								}
								if (this.anInt286 == 4 && this.anInt274 < 100) {
									local169 = Class48.method667(this.aString4);
									this.method109(local169, this.aByte7);
								}
								if (this.anInt286 == 5 && this.anInt274 > 0) {
									local169 = Class48.method667(this.aString4);
									this.method177(local169);
								}
							}
						} else if (this.aBoolean43) {
							if (local29 >= 48 && local29 <= 57 && this.aString11.length() < 10) {
								this.aString11 = this.aString11 + (char) local29;
								this.aBoolean59 = true;
							}
							if (local29 == 8 && this.aString11.length() > 0) {
								this.aString11 = this.aString11.substring(0, this.aString11.length() - 1);
								this.aBoolean59 = true;
							}
							if (local29 == 13 || local29 == 10) {
								if (this.aString11.length() > 0) {
									local209 = 0;
									try {
										local209 = Integer.parseInt(this.aString11);
									} catch (@Pc(386) Exception local386) {
									}
									this.aClass1_Sub1_Sub3_4.method469(236);
									this.aClass1_Sub1_Sub3_4.method474(local209);
								}
								this.aBoolean43 = false;
								this.aBoolean59 = true;
							}
						} else if (this.anInt217 == -1) {
							if (local29 >= 32 && local29 <= 122 && this.aString10.length() < 80) {
								this.aString10 = this.aString10 + (char) local29;
								this.aBoolean59 = true;
							}
							if (local29 == 8 && this.aString10.length() > 0) {
								this.aString10 = this.aString10.substring(0, this.aString10.length() - 1);
								this.aBoolean59 = true;
							}
							if ((local29 == 13 || local29 == 10) && this.aString10.length() > 0) {
								if (this.anInt262 == 2) {
									if (this.aString10.equals("::clientdrop")) {
										this.method183();
									}
									if (this.aString10.equals("::lag")) {
										this.method131();
									}
									if (this.aString10.equals("::prefetchmusic")) {
										for (local209 = 0; local209 < this.aClass44_Sub1_1.method638(2); local209++) {
											this.aClass44_Sub1_1.method648((byte) 1, local209, 2);
										}
									}
									if (this.aString10.equals("::fpson")) {
										aBoolean48 = true;
									}
									if (this.aString10.equals("::fpsoff")) {
										aBoolean48 = false;
									}
								}
								if (this.aString10.startsWith("::")) {
									this.aClass1_Sub1_Sub3_4.method469(248);
									this.aClass1_Sub1_Sub3_4.method470(this.aString10.length() - 1);
									this.aClass1_Sub1_Sub3_4.method477(this.aString10.substring(2));
								} else {
									@Pc(553) String local553 = this.aString10.toLowerCase();
									@Pc(555) byte local555 = 0;
									if (local553.startsWith("yellow:")) {
										local555 = 0;
										this.aString10 = this.aString10.substring(7);
									} else if (local553.startsWith("red:")) {
										local555 = 1;
										this.aString10 = this.aString10.substring(4);
									} else if (local553.startsWith("green:")) {
										local555 = 2;
										this.aString10 = this.aString10.substring(6);
									} else if (local553.startsWith("cyan:")) {
										local555 = 3;
										this.aString10 = this.aString10.substring(5);
									} else if (local553.startsWith("purple:")) {
										local555 = 4;
										this.aString10 = this.aString10.substring(7);
									} else if (local553.startsWith("white:")) {
										local555 = 5;
										this.aString10 = this.aString10.substring(6);
									} else if (local553.startsWith("flash1:")) {
										local555 = 6;
										this.aString10 = this.aString10.substring(7);
									} else if (local553.startsWith("flash2:")) {
										local555 = 7;
										this.aString10 = this.aString10.substring(7);
									} else if (local553.startsWith("flash3:")) {
										local555 = 8;
										this.aString10 = this.aString10.substring(7);
									} else if (local553.startsWith("glow1:")) {
										local555 = 9;
										this.aString10 = this.aString10.substring(6);
									} else if (local553.startsWith("glow2:")) {
										local555 = 10;
										this.aString10 = this.aString10.substring(6);
									} else if (local553.startsWith("glow3:")) {
										local555 = 11;
										this.aString10 = this.aString10.substring(6);
									}
									local553 = this.aString10.toLowerCase();
									@Pc(727) byte local727 = 0;
									if (local553.startsWith("wave:")) {
										local727 = 1;
										this.aString10 = this.aString10.substring(5);
									} else if (local553.startsWith("wave2:")) {
										local727 = 2;
										this.aString10 = this.aString10.substring(6);
									} else if (local553.startsWith("shake:")) {
										local727 = 3;
										this.aString10 = this.aString10.substring(6);
									} else if (local553.startsWith("scroll:")) {
										local727 = 4;
										this.aString10 = this.aString10.substring(7);
									} else if (local553.startsWith("slide:")) {
										local727 = 5;
										this.aString10 = this.aString10.substring(6);
									}
									this.aClass1_Sub1_Sub3_4.method469(37);
									this.aClass1_Sub1_Sub3_4.method470(0);
									@Pc(808) int local808 = this.aClass1_Sub1_Sub3_4.anInt742;
									this.aClass1_Sub1_Sub3_4.method470(local555);
									this.aClass1_Sub1_Sub3_4.method470(local727);
									Class49.method684(this.aClass1_Sub1_Sub3_4, this.aString10);
									this.aClass1_Sub1_Sub3_4.method479(this.aClass1_Sub1_Sub3_4.anInt742 - local808);
									this.aString10 = Class49.method685(this.aString10);
									this.aString10 = Class42.method604(this.aString10);
									aClass1_Sub1_Sub1_Sub1_Sub1_1.aString31 = this.aString10;
									aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt1000 = local555;
									aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt1001 = local727;
									aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt999 = 150;
									if (this.anInt262 == 2) {
										this.method227(2, "@cr2@" + aClass1_Sub1_Sub1_Sub1_Sub1_1.aString3, aClass1_Sub1_Sub1_Sub1_Sub1_1.aString31);
									} else if (this.anInt262 == 1) {
										this.method227(2, "@cr1@" + aClass1_Sub1_Sub1_Sub1_Sub1_1.aString3, aClass1_Sub1_Sub1_Sub1_Sub1_1.aString31);
									} else {
										this.method227(2, aClass1_Sub1_Sub1_Sub1_Sub1_1.aString3, aClass1_Sub1_Sub1_Sub1_Sub1_1.aString31);
									}
									if (this.anInt216 == 2) {
										this.anInt216 = 3;
										this.aBoolean45 = true;
										this.aClass1_Sub1_Sub3_4.method469(242);
										this.aClass1_Sub1_Sub3_4.method470(this.anInt216);
										this.aClass1_Sub1_Sub3_4.method470(this.anInt421);
										this.aClass1_Sub1_Sub3_4.method470(this.anInt296);
									}
								}
								this.aString10 = "";
								this.aBoolean59 = true;
							}
						}
					}
				} while ((local29 < 97 || local29 > 122) && (local29 < 65 || local29 > 90) && (local29 < 48 || local29 > 57) && local29 != 32);
				if (this.aString12.length() < 12) {
					this.aString12 = this.aString12 + (char) local29;
				}
			}
		} catch (@Pc(944) RuntimeException local944) {
			signlink.reporterror("23010, " + 0 + ", " + local944.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "w", descriptor = "(I)V")
	private void method171() {
		try {
			for (@Pc(8) int local8 = -1; local8 < this.anInt332; local8++) {
				@Pc(16) int local16;
				if (local8 == -1) {
					local16 = this.anInt331;
				} else {
					local16 = this.anIntArray64[local8];
				}
				@Pc(28) Class1_Sub1_Sub1_Sub1_Sub1 local28 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local16];
				if (local28 != null) {
					this.method197(local28, 1);
				}
			}
		} catch (@Pc(42) RuntimeException local42) {
			signlink.reporterror("98050, " + -564 + ", " + local42.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IILclient!lb;)V")
	private void method172(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub1_Sub3 arg1) {
		try {
			arg1.method490();
			@Pc(7) int local7 = arg1.method491(1);
			if (local7 != 0) {
				@Pc(25) int local25 = arg1.method491(2);
				if (local25 == 0) {
					this.anIntArray65[this.anInt333++] = this.anInt331;
				} else {
					@Pc(48) int local48;
					@Pc(58) int local58;
					if (local25 == 1) {
						local48 = arg1.method491(3);
						aClass1_Sub1_Sub1_Sub1_Sub1_1.method678(false, 490, local48);
						local58 = arg1.method491(1);
						if (local58 == 1) {
							this.anIntArray65[this.anInt333++] = this.anInt331;
						}
					} else {
						@Pc(102) int local102;
						if (local25 == 2) {
							local48 = arg1.method491(3);
							aClass1_Sub1_Sub1_Sub1_Sub1_1.method678(true, 490, local48);
							local58 = arg1.method491(3);
							aClass1_Sub1_Sub1_Sub1_Sub1_1.method678(true, 490, local58);
							local102 = arg1.method491(1);
							if (local102 == 1) {
								this.anIntArray65[this.anInt333++] = this.anInt331;
							}
						} else if (local25 == 3) {
							this.anInt246 = arg1.method491(2);
							local48 = arg1.method491(7);
							local58 = arg1.method491(7);
							local102 = arg1.method491(1);
							aClass1_Sub1_Sub1_Sub1_Sub1_1.method677(local58, local102 == 1, local48);
							@Pc(158) int local158 = arg1.method491(1);
							if (local158 == 1) {
								this.anIntArray65[this.anInt333++] = this.anInt331;
							}
						}
					}
				}
			}
		} catch (@Pc(175) RuntimeException local175) {
			signlink.reporterror("98767, " + -29266 + ", " + arg0 + ", " + arg1 + ", " + local175.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Ljava/lang/String;)V")
	private void method173(@OriginalArg(0) String arg0) {
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

	@OriginalMember(owner = "client!client", name = "n", descriptor = "(Z)V")
	private void method174() {
		try {
			@Pc(8) int local8;
			if (this.anInt327 > 0) {
				for (local8 = 0; local8 < 256; local8++) {
					if (this.anInt327 > 768) {
						this.anIntArray51[local8] = this.method136(this.anIntArray53[local8], 1024 - this.anInt327, this.anIntArray52[local8]);
					} else if (this.anInt327 > 256) {
						this.anIntArray51[local8] = this.anIntArray53[local8];
					} else {
						this.anIntArray51[local8] = this.method136(this.anIntArray52[local8], 256 - this.anInt327, this.anIntArray53[local8]);
					}
				}
			} else if (this.anInt328 > 0) {
				for (local8 = 0; local8 < 256; local8++) {
					if (this.anInt328 > 768) {
						this.anIntArray51[local8] = this.method136(this.anIntArray54[local8], 1024 - this.anInt328, this.anIntArray52[local8]);
					} else if (this.anInt328 > 256) {
						this.anIntArray51[local8] = this.anIntArray54[local8];
					} else {
						this.anIntArray51[local8] = this.method136(this.anIntArray52[local8], 256 - this.anInt328, this.anIntArray54[local8]);
					}
				}
			} else {
				for (local8 = 0; local8 < 256; local8++) {
					this.anIntArray51[local8] = this.anIntArray52[local8];
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
				local198 = this.anIntArray72[local185] * (256 - local185) / 256;
				local202 = local198 + 22;
				if (local202 < 0) {
					local202 = 0;
				}
				local181 += local202;
				for (local212 = local202; local212 < 128; local212++) {
					local220 = this.anIntArray61[local181++];
					if (local220 == 0) {
						local183++;
					} else {
						local224 = local220;
						local228 = 256 - local220;
						local220 = this.anIntArray51[local220];
						local239 = this.aClass35_22.anIntArray231[local183];
						this.aClass35_22.anIntArray231[local183++] = ((local220 & 0xFF00FF) * local224 + (local239 & 0xFF00FF) * local228 & 0xFF00FF00) + ((local220 & 0xFF00) * local224 + (local239 & 0xFF00) * local228 & 0xFF0000) >> 8;
					}
				}
				local183 += local202;
			}
			this.aClass35_22.method525(super.aGraphics2, 0, 0);
			for (local198 = 0; local198 < 33920; local198++) {
				this.aClass35_23.anIntArray231[local198] = this.aClass1_Sub1_Sub2_Sub2_9.anIntArray208[local198];
			}
			local181 = 0;
			local183 = 1176;
			for (local202 = 1; local202 < 255; local202++) {
				local212 = this.anIntArray72[local202] * (256 - local202) / 256;
				local220 = 103 - local212;
				local183 += local212;
				for (local224 = 0; local224 < local220; local224++) {
					local228 = this.anIntArray61[local181++];
					if (local228 == 0) {
						local183++;
					} else {
						local239 = local228;
						@Pc(369) int local369 = 256 - local228;
						local228 = this.anIntArray51[local228];
						@Pc(380) int local380 = this.aClass35_23.anIntArray231[local183];
						this.aClass35_23.anIntArray231[local183++] = ((local228 & 0xFF00FF) * local239 + (local380 & 0xFF00FF) * local369 & 0xFF00FF00) + ((local228 & 0xFF00) * local239 + (local380 & 0xFF00) * local369 & 0xFF0000) >> 8;
					}
				}
				local181 += 128 - local220;
				local183 += 128 - local220 - local212;
			}
			this.aClass35_23.method525(super.aGraphics2, 637, 0);
		} catch (@Pc(452) RuntimeException local452) {
			signlink.reporterror("68571, " + false + ", " + local452.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(IILclient!lb;)V")
	private void method175(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub1_Sub3 arg1) {
		try {
			this.anInt260 = 0;
			this.anInt333 = 0;
			this.method172(arg0, arg1);
			this.method127(arg0, arg1);
			this.method138(arg1, arg0);
			this.method224(arg0, arg1);
			@Pc(39) int local39;
			for (@Pc(32) int local32 = 0; local32 < this.anInt260; local32++) {
				local39 = this.anIntArray46[local32];
				if (this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local39].anInt1028 != anInt297) {
					this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local39] = null;
				}
			}
			if (arg1.anInt742 != arg0) {
				signlink.reporterror("Error packet size mismatch in getplayer pos:" + arg1.anInt742 + " psize:" + arg0);
				throw new RuntimeException("eek");
			}
			for (local39 = 0; local39 < this.anInt332; local39++) {
				if (this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[this.anIntArray64[local39]] == null) {
					signlink.reporterror(this.aString6 + " null entry in pl list - pos:" + local39 + " size:" + this.anInt332);
					throw new RuntimeException("eek");
				}
			}
		} catch (@Pc(119) RuntimeException local119) {
			signlink.reporterror("59848, " + arg0 + ", " + 0 + ", " + arg1 + ", " + local119.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "f", descriptor = "(II)V")
	private void method176(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(9) Class29 local9 = this.aClass29ArrayArrayArray1[this.anInt246][arg0][arg1];
		if (local9 == null) {
			this.aClass37_1.method551(this.anInt246, arg0, arg1);
			return;
		}
		@Pc(21) int local21 = -99999999;
		@Pc(23) Class1_Sub1_Sub1_Sub3 local23 = null;
		@Pc(27) Class1_Sub1_Sub1_Sub3 local27;
		for (local27 = (Class1_Sub1_Sub1_Sub3) local9.method511(); local27 != null; local27 = (Class1_Sub1_Sub1_Sub3) local9.method513()) {
			@Pc(32) Class15 local32 = Class15.method361(local27.anInt179);
			@Pc(35) int local35 = local32.anInt612;
			if (local32.aBoolean153) {
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
		this.aClass37_1.method537(this.aBoolean58, arg0, local67, this.anInt246, local110, this.method223(arg0 * 128 + 64, this.anInt246, arg1 * 128 + 64), local65, local23, arg1);
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ZJ)V")
	private void method177(@OriginalArg(1) long arg0) {
		try {
			if (arg0 != 0L) {
				for (@Pc(8) int local8 = 0; local8 < this.anInt274; local8++) {
					if (this.aLongArray4[local8] == arg0) {
						this.anInt274--;
						this.aBoolean53 = true;
						for (@Pc(28) int local28 = local8; local28 < this.anInt274; local28++) {
							this.aLongArray4[local28] = this.aLongArray4[local28 + 1];
						}
						this.aClass1_Sub1_Sub3_4.method469(104);
						this.aClass1_Sub1_Sub3_4.method476(arg0);
						break;
					}
				}
			}
		} catch (@Pc(69) RuntimeException local69) {
			signlink.reporterror("15258, " + true + ", " + arg0 + ", " + local69.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "i", descriptor = "(B)Z")
	private boolean method178() {
		try {
			return signlink.wavereplay();
		} catch (@Pc(9) RuntimeException local9) {
			signlink.reporterror("14178, " + -113 + ", " + local9.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "x", descriptor = "(I)V")
	private void method179() {
		try {
			@Pc(12) int local12;
			for (@Pc(5) int local5 = 10; local5 < 117; local5++) {
				local12 = (int) (Math.random() * 100.0D);
				if (local12 < 50) {
					this.anIntArray61[local5 + 32512] = 255;
				}
			}
			@Pc(41) int local41;
			@Pc(48) int local48;
			@Pc(54) int local54;
			for (local12 = 0; local12 < 100; local12++) {
				local41 = (int) (Math.random() * 124.0D) + 2;
				local48 = (int) (Math.random() * 128.0D) + 128;
				local54 = local41 + (local48 << 7);
				this.anIntArray61[local54] = 192;
			}
			for (local41 = 1; local41 < 255; local41++) {
				for (local48 = 1; local48 < 127; local48++) {
					local54 = local48 + (local41 << 7);
					this.anIntArray62[local54] = (this.anIntArray61[local54 - 1] + this.anIntArray61[local54 + 1] + this.anIntArray61[local54 - 128] + this.anIntArray61[local54 + 128]) / 4;
				}
			}
			this.anInt411 += 128;
			if (this.anInt411 > this.anIntArray34.length) {
				this.anInt411 -= this.anIntArray34.length;
				local48 = (int) (Math.random() * 12.0D);
				this.method111(this.aClass1_Sub1_Sub2_Sub3Array3[local48]);
			}
			@Pc(172) int local172;
			for (local48 = 1; local48 < 255; local48++) {
				for (local54 = 1; local54 < 127; local54++) {
					local172 = local54 + (local48 << 7);
					@Pc(195) int local195 = this.anIntArray62[local172 + 128] - this.anIntArray34[local172 + this.anInt411 & this.anIntArray34.length - 1] / 5;
					if (local195 < 0) {
						local195 = 0;
					}
					this.anIntArray61[local172] = local195;
				}
			}
			for (local54 = 0; local54 < 255; local54++) {
				this.anIntArray72[local54] = this.anIntArray72[local54 + 1];
			}
			this.anIntArray72[255] = (int) (Math.sin((double) anInt297 / 14.0D) * 16.0D + Math.sin((double) anInt297 / 15.0D) * 14.0D + Math.sin((double) anInt297 / 16.0D) * 12.0D);
			if (this.anInt327 > 0) {
				this.anInt327 -= 4;
			}
			if (this.anInt328 > 0) {
				this.anInt328 -= 4;
			}
			if (this.anInt327 == 0 && this.anInt328 == 0) {
				local172 = (int) (Math.random() * 2000.0D);
				if (local172 == 0) {
					this.anInt327 = 1024;
				}
				if (local172 == 1) {
					this.anInt328 = 1024;
					return;
				}
			}
		} catch (@Pc(306) RuntimeException local306) {
			signlink.reporterror("81057, " + -360 + ", " + local306.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "j", descriptor = "(B)V")
	private void method180(@OriginalArg(0) byte arg0) {
		try {
			this.method114((byte) 5);
			if (this.anInt313 == 1) {
				this.aClass1_Sub1_Sub2_Sub2Array3[this.anInt312 / 100].method391(this.anInt310 - 8 - 4, this.anInt311 - 8 - 4);
			}
			if (this.anInt313 == 2) {
				this.aClass1_Sub1_Sub2_Sub2Array3[this.anInt312 / 100 + 4].method391(this.anInt310 - 8 - 4, this.anInt311 - 8 - 4);
				anInt379++;
				if (anInt379 > 57) {
					anInt379 = 0;
					this.aClass1_Sub1_Sub3_4.method469(34);
				}
			}
			if (this.anInt319 != -1) {
				this.method167(this.anInt208, this.anInt319);
				this.method214(0, 0, 0, Class6.aClass6Array1[this.anInt319]);
			}
			if (this.anInt378 != -1) {
				this.method167(this.anInt208, this.anInt378);
				this.method214(0, 0, 0, Class6.aClass6Array1[this.anInt378]);
			}
			this.method228();
			@Pc(122) boolean local122 = false;
			if (!this.aBoolean78) {
				this.method222(270);
				this.method100();
			} else if (this.anInt360 == 0) {
				this.method225();
			}
			if (this.anInt344 == 1) {
				this.aClass1_Sub1_Sub2_Sub2Array7[1].method391(472, 296);
			}
			@Pc(188) int local188;
			if (aBoolean48) {
				@Pc(164) byte local164 = 20;
				@Pc(166) int local166 = 16776960;
				if (super.anInt192 < 15) {
					local166 = 16711680;
				}
				this.aClass1_Sub1_Sub2_Sub4_2.method446(20, "Fps:" + super.anInt192, local166);
				local188 = local164 + 15;
				@Pc(190) Runtime local190 = Runtime.getRuntime();
				@Pc(199) int local199 = (int) ((local190.totalMemory() - local190.freeMemory()) / 1024L);
				if (local199 > 33554432 && aBoolean71) {
				}
				this.aClass1_Sub1_Sub2_Sub4_2.method446(35, "Mem:" + local199 + "k", 16776960);
				local188 += 15;
			}
			if (this.anInt365 != 0) {
				@Pc(233) int local233 = this.anInt365 / 50;
				local188 = local233 / 60;
				@Pc(241) int local241 = local233 % 60;
				if (local241 < 10) {
					this.aClass1_Sub1_Sub2_Sub4_2.method451("System update in: " + local188 + ":0" + local241, 4, 16776960, 329);
				} else {
					this.aClass1_Sub1_Sub2_Sub4_2.method451("System update in: " + local188 + ":" + local241, 4, 16776960, 329);
				}
			}
		} catch (@Pc(283) RuntimeException local283) {
			signlink.reporterror("82955, " + arg0 + ", " + local283.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "o", descriptor = "(Z)V")
	private void method181(@OriginalArg(0) boolean arg0) {
		try {
			this.aBoolean54 &= arg0;
			if (this.anInt353 == 2) {
				for (@Pc(16) Class1_Sub2 local16 = (Class1_Sub2) this.aClass29_2.method511(); local16 != null; local16 = (Class1_Sub2) this.aClass29_2.method513()) {
					if (local16.anInt791 > 0) {
						local16.anInt791--;
					}
					if (local16.anInt791 != 0) {
						if (local16.anInt790 > 0) {
							local16.anInt790--;
						}
						if (local16.anInt790 == 0 && local16.anInt782 >= 1 && local16.anInt783 >= 1 && local16.anInt782 <= 102 && local16.anInt783 <= 102 && (local16.anInt787 < 0 || Class4.method72(local16.anInt787, local16.anInt789))) {
							this.method97(local16.anInt782, local16.anInt781, local16.anInt780, local16.anInt787, local16.anInt783, local16.anInt789, local16.anInt788);
							local16.anInt790 = -1;
							if (local16.anInt787 == local16.anInt784 && local16.anInt784 == -1) {
								local16.method673();
							} else if (local16.anInt787 == local16.anInt784 && local16.anInt788 == local16.anInt785 && local16.anInt789 == local16.anInt786) {
								local16.method673();
							}
						}
					} else if (local16.anInt784 < 0 || Class4.method72(local16.anInt784, local16.anInt786)) {
						this.method97(local16.anInt782, local16.anInt781, local16.anInt780, local16.anInt784, local16.anInt783, local16.anInt786, local16.anInt785);
						local16.method673();
					}
				}
			}
		} catch (@Pc(159) RuntimeException local159) {
			signlink.reporterror("72379, " + arg0 + ", " + local159.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(ZI)V")
	private void method182(@OriginalArg(0) boolean arg0) {
		try {
			if (aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt988 >> 7 == this.anInt275 && aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt989 >> 7 == this.anInt276) {
				this.anInt275 = 0;
				anInt267++;
				if (anInt267 > 122) {
					anInt267 = 0;
					this.aClass1_Sub1_Sub3_4.method469(110);
					this.aClass1_Sub1_Sub3_4.method470(62);
				}
			}
			@Pc(39) int local39 = this.anInt332;
			if (arg0) {
				local39 = 1;
			}
			for (@Pc(45) int local45 = 0; local45 < local39; local45++) {
				@Pc(51) Class1_Sub1_Sub1_Sub1_Sub1 local51;
				@Pc(56) int local56;
				if (arg0) {
					local51 = aClass1_Sub1_Sub1_Sub1_Sub1_1;
					local56 = this.anInt331 << 14;
				} else {
					local51 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[this.anIntArray64[local45]];
					local56 = this.anIntArray64[local45] << 14;
				}
				if (local51 != null && local51.method680()) {
					local51.aBoolean25 = false;
					if ((aBoolean71 && this.anInt332 > 50 || this.anInt332 > 200) && !arg0 && local51.anInt1008 == local51.anInt992) {
						local51.aBoolean25 = true;
					}
					@Pc(107) int local107 = local51.anInt988 >> 7;
					@Pc(112) int local112 = local51.anInt989 >> 7;
					if (local107 >= 0 && local107 < 104 && local112 >= 0 && local112 < 104) {
						if (local51.aClass1_Sub1_Sub1_Sub5_1 == null || anInt297 < local51.anInt131 || anInt297 >= local51.anInt132) {
							if ((local51.anInt988 & 0x7F) == 64 && (local51.anInt989 & 0x7F) == 64) {
								if (this.anIntArrayArray5[local107][local112] == this.anInt316) {
									continue;
								}
								this.anIntArrayArray5[local107][local112] = this.anInt316;
							}
							local51.anInt130 = this.method223(local51.anInt988, this.anInt246, local51.anInt989);
							this.aClass37_1.method541(local51, local51.anInt988, this.anInt246, local51.anInt130, 60, local51.anInt989, local51.anInt990, local51.aBoolean247, local56);
						} else {
							local51.aBoolean25 = false;
							local51.anInt130 = this.method223(local51.anInt988, this.anInt246, local51.anInt989);
							this.aClass37_1.method542(local51.anInt139, local51.anInt136, this.anInt246, local51.anInt138, local51.anInt989, local51, local56, local51.anInt990, local51.anInt130, local51.anInt988, local51.anInt137);
						}
					}
				}
			}
			this.anInt368 += 0;
		} catch (@Pc(247) RuntimeException local247) {
			signlink.reporterror("68597, " + arg0 + ", " + 0 + ", " + local247.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "y", descriptor = "(I)V")
	private void method183() {
		try {
			if (this.anInt372 > 0) {
				this.method210();
			} else {
				this.aClass35_5.method524(this.anInt255);
				this.aClass1_Sub1_Sub2_Sub4_2.method447("Connection lost", 144, 0, 257, this.anInt272);
				this.aClass1_Sub1_Sub2_Sub4_2.method447("Connection lost", 143, 16777215, 256, this.anInt272);
				this.aClass1_Sub1_Sub2_Sub4_2.method447("Please wait - attempting to reestablish", 159, 0, 257, this.anInt272);
				this.aClass1_Sub1_Sub2_Sub4_2.method447("Please wait - attempting to reestablish", 158, 16777215, 256, this.anInt272);
				this.aClass35_5.method525(super.aGraphics2, 4, 4);
				this.anInt339 = 0;
				this.anInt275 = 0;
				@Pc(72) Class8 local72 = this.aClass8_1;
				this.aBoolean54 = false;
				this.anInt373 = 0;
				this.method158(this.aString6, this.aString7, true);
				if (!this.aBoolean54) {
					this.method210();
				}
				try {
					local72.method247();
				} catch (@Pc(95) Exception local95) {
				}
			}
		} catch (@Pc(97) RuntimeException local97) {
			signlink.reporterror("44630, " + -784 + ", " + local97.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "k", descriptor = "(B)V")
	private void method184() {
		try {
			for (@Pc(6) Class1_Sub1_Sub1_Sub4 local6 = (Class1_Sub1_Sub1_Sub4) this.aClass29_1.method511(); local6 != null; local6 = (Class1_Sub1_Sub1_Sub4) this.aClass29_1.method513()) {
				if (local6.anInt464 != this.anInt246 || anInt297 > local6.anInt470) {
					local6.method673();
				} else if (anInt297 >= local6.anInt469) {
					if (local6.anInt473 > 0) {
						@Pc(36) Class1_Sub1_Sub1_Sub1_Sub2 local36 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local6.anInt473 - 1];
						if (local36 != null && local36.anInt988 >= 0 && local36.anInt988 < 13312 && local36.anInt989 >= 0 && local36.anInt989 < 13312) {
							local6.method241(local36.anInt989, anInt297, this.method223(local36.anInt988, local6.anInt464, local36.anInt989) - local6.anInt468, local36.anInt988);
						}
					}
					if (local6.anInt473 < 0) {
						@Pc(81) int local81 = -local6.anInt473 - 1;
						@Pc(87) Class1_Sub1_Sub1_Sub1_Sub1 local87;
						if (local81 == this.anInt214) {
							local87 = aClass1_Sub1_Sub1_Sub1_Sub1_1;
						} else {
							local87 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local81];
						}
						if (local87 != null && local87.anInt988 >= 0 && local87.anInt988 < 13312 && local87.anInt989 >= 0 && local87.anInt989 < 13312) {
							local6.method241(local87.anInt989, anInt297, this.method223(local87.anInt988, local6.anInt464, local87.anInt989) - local6.anInt468, local87.anInt988);
						}
					}
					local6.method242(this.anInt208);
					this.aClass37_1.method541(local6, (int) local6.aDouble1, this.anInt246, (int) local6.aDouble3, 60, (int) local6.aDouble2, local6.anInt474, false, -1);
				}
			}
			anInt349++;
			if (this.aByte6 != 29) {
				this.anInt369 = -1;
			}
			if (anInt349 > 1174) {
				anInt349 = 0;
				this.aClass1_Sub1_Sub3_4.method469(90);
				this.aClass1_Sub1_Sub3_4.method470(0);
				@Pc(194) int local194 = this.aClass1_Sub1_Sub3_4.anInt742;
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
				this.aClass1_Sub1_Sub3_4.method479(this.aClass1_Sub1_Sub3_4.anInt742 - local194);
			}
		} catch (@Pc(268) RuntimeException local268) {
			signlink.reporterror("78132, " + 29 + ", " + local268.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ZZI)V")
	private void method185(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1) {
		try {
			signlink.anInt944 = arg1;
			if (arg0) {
				signlink.midi = "voladjust";
			}
		} catch (@Pc(16) RuntimeException local16) {
			signlink.reporterror("41895, " + arg0 + ", " + true + ", " + arg1 + ", " + local16.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "()V")
	@Override
	protected void method89() {
		this.method96(20, "Starting up");
		if (signlink.sunjava) {
			super.anInt191 = 5;
		}
		if (aBoolean68) {
			this.aBoolean83 = true;
			return;
		}
		aBoolean68 = true;
		@Pc(21) boolean local21 = false;
		@Pc(25) String local25 = this.method213();
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
			this.aBoolean46 = true;
			return;
		}
		if (signlink.aRandomAccessFile1 != null) {
			for (@Pc(95) int local95 = 0; local95 < 5; local95++) {
				this.aClass45Array1[local95] = new Class45(signlink.aRandomAccessFile1, anInt285, 500000, local95 + 1, signlink.aRandomAccessFileArray1[local95]);
			}
		}
		try {
			this.method151();
			this.aClass47_1 = this.method204("title", 25, this.anIntArray69[1], 1, "title screen");
			this.aClass1_Sub1_Sub2_Sub4_1 = new Class1_Sub1_Sub2_Sub4(7, false, "p11_full", this.aClass47_1);
			this.aClass1_Sub1_Sub2_Sub4_2 = new Class1_Sub1_Sub2_Sub4(7, false, "p12_full", this.aClass47_1);
			this.aClass1_Sub1_Sub2_Sub4_3 = new Class1_Sub1_Sub2_Sub4(7, false, "b12_full", this.aClass47_1);
			this.aClass1_Sub1_Sub2_Sub4_4 = new Class1_Sub1_Sub2_Sub4(7, true, "q8_full", this.aClass47_1);
			this.method220();
			this.method190();
			@Pc(191) Class47 local191 = this.method204("config", 30, this.anIntArray69[2], 2, "config");
			@Pc(203) Class47 local203 = this.method204("interface", 35, this.anIntArray69[3], 3, "interface");
			@Pc(215) Class47 local215 = this.method204("media", 40, this.anIntArray69[4], 4, "2d graphics");
			@Pc(227) Class47 local227 = this.method204("textures", 45, this.anIntArray69[6], 6, "textures");
			@Pc(239) Class47 local239 = this.method204("wordenc", 50, this.anIntArray69[7], 7, "chat system");
			@Pc(251) Class47 local251 = this.method204("sounds", 55, this.anIntArray69[8], 8, "sound effects");
			this.aByteArrayArrayArray7 = new byte[4][104][104];
			this.anIntArrayArrayArray5 = new int[4][105][105];
			this.aClass37_1 = new Class37(3, 104, this.anIntArrayArrayArray5, 4, 104);
			for (@Pc(276) int local276 = 0; local276 < 4; local276++) {
				this.aClass19Array1[local276] = new Class19(104, -20259, 104);
			}
			this.aClass1_Sub1_Sub2_Sub2_6 = new Class1_Sub1_Sub2_Sub2(512, 512);
			@Pc(311) Class47 local311 = this.method204("versionlist", 60, this.anIntArray69[5], 5, "update list");
			this.method96(60, "Connecting to update server");
			this.aClass44_Sub1_1 = new Class44_Sub1();
			this.aClass44_Sub1_1.method636(local311, this);
			Class12.method302(this.aClass44_Sub1_1.method639());
			Class1_Sub1_Sub1_Sub5.method258(this.aClass44_Sub1_1.method638(0), this.aClass44_Sub1_1);
			if (!aBoolean71) {
				this.anInt357 = 0;
				try {
					this.anInt357 = Integer.parseInt(this.getParameter("music"));
				} catch (@Pc(352) Exception local352) {
				}
				this.aBoolean73 = true;
				this.aClass44_Sub1_1.method645(2, this.anInt357);
				while (this.aClass44_Sub1_1.method646() > 0) {
					this.method215();
					try {
						Thread.sleep(100L);
					} catch (@Pc(370) Exception local370) {
					}
					if (this.aClass44_Sub1_1.anInt959 > 3) {
						this.method173("ondemand");
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
				this.method215();
				try {
					Thread.sleep(100L);
				} catch (@Pc(441) Exception local441) {
				}
				if (this.aClass44_Sub1_1.anInt959 > 3) {
					this.method173("ondemand");
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
				this.method215();
				try {
					Thread.sleep(100L);
				} catch (@Pc(526) Exception local526) {
				}
			}
			if (this.aClass45Array1[0] != null) {
				this.method96(75, "Requesting maps");
				this.aClass44_Sub1_1.method645(3, this.aClass44_Sub1_1.method640(48, 905, 0, 47));
				this.aClass44_Sub1_1.method645(3, this.aClass44_Sub1_1.method640(48, 905, 1, 47));
				this.aClass44_Sub1_1.method645(3, this.aClass44_Sub1_1.method640(48, 905, 0, 48));
				this.aClass44_Sub1_1.method645(3, this.aClass44_Sub1_1.method640(48, 905, 1, 48));
				this.aClass44_Sub1_1.method645(3, this.aClass44_Sub1_1.method640(48, 905, 0, 49));
				this.aClass44_Sub1_1.method645(3, this.aClass44_Sub1_1.method640(48, 905, 1, 49));
				this.aClass44_Sub1_1.method645(3, this.aClass44_Sub1_1.method640(47, 905, 0, 47));
				this.aClass44_Sub1_1.method645(3, this.aClass44_Sub1_1.method640(47, 905, 1, 47));
				this.aClass44_Sub1_1.method645(3, this.aClass44_Sub1_1.method640(47, 905, 0, 48));
				this.aClass44_Sub1_1.method645(3, this.aClass44_Sub1_1.method640(47, 905, 1, 48));
				this.aClass44_Sub1_1.method645(3, this.aClass44_Sub1_1.method640(148, 905, 0, 48));
				this.aClass44_Sub1_1.method645(3, this.aClass44_Sub1_1.method640(148, 905, 1, 48));
				local394 = this.aClass44_Sub1_1.method646();
				while (this.aClass44_Sub1_1.method646() > 0) {
					local475 = local394 - this.aClass44_Sub1_1.method646();
					if (local475 > 0) {
						this.method96(75, "Loading maps - " + local475 * 100 / local394 + "%");
					}
					this.method215();
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
					this.aClass44_Sub1_1.method648(local734, local475, 0);
				}
			}
			this.aClass44_Sub1_1.method641(aBoolean70);
			if (!aBoolean71) {
				local394 = this.aClass44_Sub1_1.method638(2);
				for (local732 = 1; local732 < local394; local732++) {
					if (this.aClass44_Sub1_1.method644(anInt389, local732)) {
						this.aClass44_Sub1_1.method648((byte) 1, local732, 2);
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
				this.aClass1_Sub1_Sub2_Sub3Array4[local732] = new Class1_Sub1_Sub2_Sub3(local215, "sideicons", local732);
			}
			this.aClass1_Sub1_Sub2_Sub2_7 = new Class1_Sub1_Sub2_Sub2(local215, "compass", 0);
			this.aClass1_Sub1_Sub2_Sub2_5 = new Class1_Sub1_Sub2_Sub2(local215, "mapedge", 0);
			this.aClass1_Sub1_Sub2_Sub2_5.method388(767);
			@Pc(934) int local934;
			try {
				for (local934 = 0; local934 < 100; local934++) {
					this.aClass1_Sub1_Sub2_Sub3Array1[local934] = new Class1_Sub1_Sub2_Sub3(local215, "mapscene", local934);
				}
			} catch (@Pc(952) Exception local952) {
			}
			try {
				for (local934 = 0; local934 < 100; local934++) {
					this.aClass1_Sub1_Sub2_Sub2Array6[local934] = new Class1_Sub1_Sub2_Sub2(local215, "mapfunction", local934);
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
					this.aClass1_Sub1_Sub2_Sub2Array7[local934] = new Class1_Sub1_Sub2_Sub2(local215, "headicons", local934);
				}
			} catch (@Pc(1012) Exception local1012) {
			}
			this.aClass1_Sub1_Sub2_Sub2_10 = new Class1_Sub1_Sub2_Sub2(local215, "mapmarker", 0);
			this.aClass1_Sub1_Sub2_Sub2_11 = new Class1_Sub1_Sub2_Sub2(local215, "mapmarker", 1);
			for (local934 = 0; local934 < 8; local934++) {
				this.aClass1_Sub1_Sub2_Sub2Array3[local934] = new Class1_Sub1_Sub2_Sub2(local215, "cross", local934);
			}
			this.aClass1_Sub1_Sub2_Sub2_1 = new Class1_Sub1_Sub2_Sub2(local215, "mapdots", 0);
			this.aClass1_Sub1_Sub2_Sub2_2 = new Class1_Sub1_Sub2_Sub2(local215, "mapdots", 1);
			this.aClass1_Sub1_Sub2_Sub2_3 = new Class1_Sub1_Sub2_Sub2(local215, "mapdots", 2);
			this.aClass1_Sub1_Sub2_Sub2_4 = new Class1_Sub1_Sub2_Sub2(local215, "mapdots", 3);
			this.aClass1_Sub1_Sub2_Sub3_12 = new Class1_Sub1_Sub2_Sub3(local215, "scrollbar", 0);
			this.aClass1_Sub1_Sub2_Sub3_13 = new Class1_Sub1_Sub2_Sub3(local215, "scrollbar", 1);
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
				this.aClass1_Sub1_Sub2_Sub3Array2[local1212] = new Class1_Sub1_Sub2_Sub3(local215, "mod_icons", local1212);
			}
			@Pc(1235) Class1_Sub1_Sub2_Sub2 local1235 = new Class1_Sub1_Sub2_Sub2(local215, "backleft1", 0);
			this.aClass35_10 = new Class35(this.method94(), (byte) 3, local1235.anInt653, local1235.anInt652);
			local1235.method389(0, 0);
			@Pc(1260) Class1_Sub1_Sub2_Sub2 local1260 = new Class1_Sub1_Sub2_Sub2(local215, "backleft2", 0);
			this.aClass35_11 = new Class35(this.method94(), (byte) 3, local1260.anInt653, local1260.anInt652);
			local1260.method389(0, 0);
			@Pc(1285) Class1_Sub1_Sub2_Sub2 local1285 = new Class1_Sub1_Sub2_Sub2(local215, "backright1", 0);
			this.aClass35_12 = new Class35(this.method94(), (byte) 3, local1285.anInt653, local1285.anInt652);
			local1285.method389(0, 0);
			@Pc(1310) Class1_Sub1_Sub2_Sub2 local1310 = new Class1_Sub1_Sub2_Sub2(local215, "backright2", 0);
			this.aClass35_13 = new Class35(this.method94(), (byte) 3, local1310.anInt653, local1310.anInt652);
			local1310.method389(0, 0);
			@Pc(1335) Class1_Sub1_Sub2_Sub2 local1335 = new Class1_Sub1_Sub2_Sub2(local215, "backtop1", 0);
			this.aClass35_14 = new Class35(this.method94(), (byte) 3, local1335.anInt653, local1335.anInt652);
			local1335.method389(0, 0);
			@Pc(1360) Class1_Sub1_Sub2_Sub2 local1360 = new Class1_Sub1_Sub2_Sub2(local215, "backvmid1", 0);
			this.aClass35_15 = new Class35(this.method94(), (byte) 3, local1360.anInt653, local1360.anInt652);
			local1360.method389(0, 0);
			@Pc(1385) Class1_Sub1_Sub2_Sub2 local1385 = new Class1_Sub1_Sub2_Sub2(local215, "backvmid2", 0);
			this.aClass35_16 = new Class35(this.method94(), (byte) 3, local1385.anInt653, local1385.anInt652);
			local1385.method389(0, 0);
			@Pc(1410) Class1_Sub1_Sub2_Sub2 local1410 = new Class1_Sub1_Sub2_Sub2(local215, "backvmid3", 0);
			this.aClass35_17 = new Class35(this.method94(), (byte) 3, local1410.anInt653, local1410.anInt652);
			local1410.method389(0, 0);
			@Pc(1435) Class1_Sub1_Sub2_Sub2 local1435 = new Class1_Sub1_Sub2_Sub2(local215, "backhmid2", 0);
			this.aClass35_18 = new Class35(this.method94(), (byte) 3, local1435.anInt653, local1435.anInt652);
			local1435.method389(0, 0);
			@Pc(1460) int local1460 = (int) (Math.random() * 21.0D) - 10;
			@Pc(1467) int local1467 = (int) (Math.random() * 21.0D) - 10;
			@Pc(1474) int local1474 = (int) (Math.random() * 21.0D) - 10;
			@Pc(1481) int local1481 = (int) (Math.random() * 41.0D) - 20;
			for (@Pc(1483) int local1483 = 0; local1483 < 100; local1483++) {
				if (this.aClass1_Sub1_Sub2_Sub2Array6[local1483] != null) {
					this.aClass1_Sub1_Sub2_Sub2Array6[local1483].method387(local1474 + local1481, local1460 + local1481, local1467 + local1481);
				}
				if (this.aClass1_Sub1_Sub2_Sub3Array1[local1483] != null) {
					this.aClass1_Sub1_Sub2_Sub3Array1[local1483].method417(local1474 + local1481, local1460 + local1481, local1467 + local1481);
				}
			}
			this.method96(83, "Unpacking textures");
			Class1_Sub1_Sub2_Sub1.method347(local227);
			Class1_Sub1_Sub2_Sub1.method351(anInt309, 0.8D);
			Class1_Sub1_Sub2_Sub1.method346(7);
			this.method96(86, "Unpacking config");
			Class27.method505(anInt232, local191);
			Class9.method286(local191);
			Class21.method462(anInt232, local191);
			Class15.method359(local191);
			Class13.method321(local191);
			Class23.method496(anInt232, local191);
			Class33.method521(anInt232, local191);
			Class39.method589(anInt232, local191);
			Class36.method527(anInt232, local191);
			Class15.aBoolean152 = aBoolean70;
			if (!aBoolean71) {
				this.method96(90, "Unpacking sounds");
				@Pc(1586) byte[] local1586 = local251.method666("sounds.dat", null);
				@Pc(1592) Class1_Sub1_Sub3 local1592 = new Class1_Sub1_Sub3(local1586, -26728);
				Class5.method78(anInt232, local1592);
			}
			this.method96(95, "Unpacking interfaces");
			@Pc(1623) Class1_Sub1_Sub2_Sub4[] local1623 = new Class1_Sub1_Sub2_Sub4[] { this.aClass1_Sub1_Sub2_Sub4_1, this.aClass1_Sub1_Sub2_Sub4_2, this.aClass1_Sub1_Sub2_Sub4_3, this.aClass1_Sub1_Sub2_Sub4_4 };
			Class6.method231(local215, local203, local1623);
			this.method96(100, "Preparing game engine");
			@Pc(1639) int local1639;
			@Pc(1641) int local1641;
			@Pc(1643) int local1643;
			for (@Pc(1635) int local1635 = 0; local1635 < 33; local1635++) {
				local1639 = 999;
				local1641 = 0;
				for (local1643 = 0; local1643 < 34; local1643++) {
					if (this.aClass1_Sub1_Sub2_Sub3_2.aByteArray7[local1643 + local1635 * this.aClass1_Sub1_Sub2_Sub3_2.anInt675] == 0) {
						if (local1639 == 999) {
							local1639 = local1643;
						}
					} else if (local1639 != 999) {
						local1641 = local1643;
						break;
					}
				}
				this.anIntArray93[local1635] = local1639;
				this.anIntArray76[local1635] = local1641 - local1639;
			}
			@Pc(1701) int local1701;
			for (local1639 = 5; local1639 < 156; local1639++) {
				local1641 = 999;
				local1643 = 0;
				for (local1701 = 25; local1701 < 172; local1701++) {
					if (this.aClass1_Sub1_Sub2_Sub3_2.aByteArray7[local1701 + local1639 * this.aClass1_Sub1_Sub2_Sub3_2.anInt675] == 0 && (local1701 > 34 || local1639 > 34)) {
						if (local1641 == 999) {
							local1641 = local1701;
						}
					} else if (local1641 != 999) {
						local1643 = local1701;
						break;
					}
				}
				this.anIntArray33[local1639 - 5] = local1641 - 25;
				this.anIntArray60[local1639 - 5] = local1643 - local1641;
			}
			Class1_Sub1_Sub2_Sub1.method344(479, 96, anInt210);
			this.anIntArray86 = Class1_Sub1_Sub2_Sub1.anIntArray180;
			Class1_Sub1_Sub2_Sub1.method344(190, 261, anInt210);
			this.anIntArray87 = Class1_Sub1_Sub2_Sub1.anIntArray180;
			Class1_Sub1_Sub2_Sub1.method344(512, 334, anInt210);
			this.anIntArray88 = Class1_Sub1_Sub2_Sub1.anIntArray180;
			@Pc(1785) int[] local1785 = new int[9];
			for (local1643 = 0; local1643 < 9; local1643++) {
				local1701 = local1643 * 32 + 128 + 15;
				@Pc(1803) int local1803 = local1701 * 3 + 600;
				@Pc(1807) int local1807 = Class1_Sub1_Sub2_Sub1.anIntArray178[local1701];
				local1785[local1643] = local1803 * local1807 >> 16;
			}
			Class37.method566(local1785, 785);
			Class42.method594(local239);
			this.aClass11_1 = new Class11((byte) -41, this);
			this.method95(this.aClass11_1, 10);
			Class1_Sub1_Sub1_Sub2.aClient1 = this;
			Class9.aClient2 = this;
			Class13.aClient4 = this;
		} catch (@Pc(1848) Exception local1848) {
			signlink.reporterror("loaderror " + this.aString15 + " " + this.anInt354);
			this.aBoolean85 = true;
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(BZ)V")
	private void method186(@OriginalArg(1) boolean arg0) {
		try {
			this.method115();
			this.aClass35_21.method524(this.anInt255);
			this.aClass1_Sub1_Sub2_Sub3_14.method418(0, 0);
			@Pc(54) byte local54;
			@Pc(66) int local66;
			if (this.anInt343 == 0) {
				this.aClass1_Sub1_Sub2_Sub4_1.method448(this.aClass44_Sub1_1.aString30, 180, 180, 7711145, true);
				local54 = 80;
				this.aClass1_Sub1_Sub2_Sub4_3.method448("Welcome to RuneScape", 80, 180, 16776960, true);
				local66 = local54 + 30;
				this.aClass1_Sub1_Sub2_Sub3_15.method418(27, 100);
				this.aClass1_Sub1_Sub2_Sub4_3.method448("New User", 125, 100, 16777215, true);
				this.aClass1_Sub1_Sub2_Sub3_15.method418(187, 100);
				this.aClass1_Sub1_Sub2_Sub4_3.method448("Existing User", 125, 260, 16777215, true);
			}
			if (this.anInt343 == 2) {
				local54 = 60;
				if (this.aString8.length() > 0) {
					this.aClass1_Sub1_Sub2_Sub4_3.method448(this.aString8, 45, 180, 16776960, true);
					this.aClass1_Sub1_Sub2_Sub4_3.method448(this.aString9, 60, 180, 16776960, true);
					local66 = local54 + 30;
				} else {
					this.aClass1_Sub1_Sub2_Sub4_3.method448(this.aString9, 53, 180, 16776960, true);
					local66 = local54 + 30;
				}
				this.aClass1_Sub1_Sub2_Sub4_3.method455("Username: " + this.aString6 + (this.anInt237 == 0 & anInt297 % 40 < 20 ? "@yel@|" : ""), 16777215, 90, true, 90);
				local66 += 15;
				this.aClass1_Sub1_Sub2_Sub4_3.method455("Password: " + Class48.method672(this.aString7) + (this.anInt237 == 1 & anInt297 % 40 < 20 ? "@yel@|" : ""), 16777215, 92, true, 105);
				local66 += 15;
				if (!arg0) {
					this.aClass1_Sub1_Sub2_Sub3_15.method418(27, 130);
					this.aClass1_Sub1_Sub2_Sub4_3.method448("Login", 155, 100, 16777215, true);
					this.aClass1_Sub1_Sub2_Sub3_15.method418(187, 130);
					this.aClass1_Sub1_Sub2_Sub4_3.method448("Cancel", 155, 260, 16777215, true);
				}
			}
			if (this.anInt343 == 3) {
				this.aClass1_Sub1_Sub2_Sub4_3.method448("Create a free account", 40, 180, 16776960, true);
				local54 = 65;
				this.aClass1_Sub1_Sub2_Sub4_3.method448("To create a new account you need to", 65, 180, 16777215, true);
				local66 = local54 + 15;
				this.aClass1_Sub1_Sub2_Sub4_3.method448("go back to the main RuneScape webpage", 80, 180, 16777215, true);
				local66 += 15;
				this.aClass1_Sub1_Sub2_Sub4_3.method448("and choose the red 'create account'", 95, 180, 16777215, true);
				local66 += 15;
				this.aClass1_Sub1_Sub2_Sub4_3.method448("button at the top right of that page.", 110, 180, 16777215, true);
				local66 += 15;
				this.aClass1_Sub1_Sub2_Sub3_15.method418(107, 130);
				this.aClass1_Sub1_Sub2_Sub4_3.method448("Cancel", 155, 180, 16777215, true);
			}
			this.aClass35_21.method525(super.aGraphics2, 202, 171);
			if (this.aBoolean61) {
				this.aBoolean61 = false;
				this.aClass35_19.method525(super.aGraphics2, 128, 0);
				this.aClass35_20.method525(super.aGraphics2, 202, 371);
				this.aClass35_24.method525(super.aGraphics2, 0, 265);
				this.aClass35_25.method525(super.aGraphics2, 562, 265);
				this.aClass35_26.method525(super.aGraphics2, 128, 171);
				this.aClass35_27.method525(super.aGraphics2, 562, 171);
			}
		} catch (@Pc(499) RuntimeException local499) {
			signlink.reporterror("57405, " + -16 + ", " + arg0 + ", " + local499.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIIIII)V")
	private void method187(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		try {
			@Pc(5) int local5 = 2048 - arg0 & 0x7FF;
			@Pc(11) int local11 = 2048 - arg5 & 0x7FF;
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
			this.anInt381 = arg1 - local13;
			this.anInt382 = arg4 - local15;
			this.anInt383 = arg3 - local17;
			if (this.anInt263 != -13274) {
				this.aBoolean88 = !this.aBoolean88;
			}
			this.anInt384 = arg0;
			this.anInt385 = arg5;
		} catch (@Pc(116) RuntimeException local116) {
			signlink.reporterror("63343, " + arg0 + ", " + -13274 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local116.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(JI)V")
	private void method188(@OriginalArg(0) long arg0) {
		try {
			if (arg0 != 0L) {
				if (this.anInt409 >= 100 && this.anInt367 != 1) {
					this.method227(0, "", "Your friendlist is full. Max of 100 for free users, and 200 for members");
				} else if (this.anInt409 >= 200) {
					this.method227(0, "", "Your friendlist is full. Max of 100 for free users, and 200 for members");
				} else {
					@Pc(38) String local38 = Class48.method671(943, Class48.method668(arg0));
					for (@Pc(40) int local40 = 0; local40 < this.anInt409; local40++) {
						if (this.aLongArray3[local40] == arg0) {
							this.method227(0, "", local38 + " is already on your friend list");
							return;
						}
					}
					for (@Pc(70) int local70 = 0; local70 < this.anInt274; local70++) {
						if (this.aLongArray4[local70] == arg0) {
							this.method227(0, "", "Please remove " + local38 + " from your ignore list first");
							return;
						}
					}
					if (!local38.equals(aClass1_Sub1_Sub1_Sub1_Sub1_1.aString3)) {
						this.aStringArray6[this.anInt409] = local38;
						this.aLongArray3[this.anInt409] = arg0;
						this.anIntArray49[this.anInt409] = 0;
						this.anInt409++;
						this.aBoolean53 = true;
						this.aClass1_Sub1_Sub3_4.method469(221);
						this.aClass1_Sub1_Sub3_4.method476(arg0);
					}
				}
			}
		} catch (@Pc(150) RuntimeException local150) {
			signlink.reporterror("70517, " + arg0 + ", " + -549 + ", " + local150.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(ILclient!lb;B)V")
	private void method189(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub1_Sub3 arg1) {
		try {
			arg1.method490();
			@Pc(14) int local14 = arg1.method491(8);
			@Pc(20) int local20;
			if (local14 < this.anInt424) {
				for (local20 = local14; local20 < this.anInt424; local20++) {
					this.anIntArray46[this.anInt260++] = this.anIntArray92[local20];
				}
			}
			if (local14 > this.anInt424) {
				signlink.reporterror(this.aString6 + " Too many npcs");
				throw new RuntimeException("eek");
			}
			this.anInt424 = 0;
			for (local20 = 0; local20 < local14; local20++) {
				@Pc(72) int local72 = this.anIntArray92[local20];
				@Pc(77) Class1_Sub1_Sub1_Sub1_Sub2 local77 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local72];
				@Pc(82) int local82 = arg1.method491(1);
				if (local82 == 0) {
					this.anIntArray92[this.anInt424++] = local72;
					local77.anInt1028 = anInt297;
				} else {
					@Pc(105) int local105 = arg1.method491(2);
					if (local105 == 0) {
						this.anIntArray92[this.anInt424++] = local72;
						local77.anInt1028 = anInt297;
						this.anIntArray65[this.anInt333++] = local72;
					} else {
						@Pc(156) int local156;
						@Pc(166) int local166;
						if (local105 == 1) {
							this.anIntArray92[this.anInt424++] = local72;
							local77.anInt1028 = anInt297;
							local156 = arg1.method491(3);
							local77.method678(false, 490, local156);
							local166 = arg1.method491(1);
							if (local166 == 1) {
								this.anIntArray65[this.anInt333++] = local72;
							}
						} else if (local105 == 2) {
							this.anIntArray92[this.anInt424++] = local72;
							local77.anInt1028 = anInt297;
							local156 = arg1.method491(3);
							local77.method678(true, 490, local156);
							local166 = arg1.method491(3);
							local77.method678(true, 490, local166);
							@Pc(224) int local224 = arg1.method491(1);
							if (local224 == 1) {
								this.anIntArray65[this.anInt333++] = local72;
							}
						} else if (local105 == 3) {
							this.anIntArray46[this.anInt260++] = local72;
						}
					}
				}
			}
		} catch (@Pc(261) RuntimeException local261) {
			signlink.reporterror("88945, " + arg0 + ", " + arg1 + ", " + -87 + ", " + local261.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "z", descriptor = "(I)V")
	private void method190() {
		try {
			this.aClass1_Sub1_Sub2_Sub3_14 = new Class1_Sub1_Sub2_Sub3(this.aClass47_1, "titlebox", 0);
			this.anInt368 += 0;
			this.aClass1_Sub1_Sub2_Sub3_15 = new Class1_Sub1_Sub2_Sub3(this.aClass47_1, "titlebutton", 0);
			this.aClass1_Sub1_Sub2_Sub3Array3 = new Class1_Sub1_Sub2_Sub3[12];
			@Pc(31) int local31 = 0;
			try {
				local31 = Integer.parseInt(this.getParameter("fl_icon"));
			} catch (@Pc(38) Exception local38) {
			}
			@Pc(42) int local42;
			if (local31 == 0) {
				for (local42 = 0; local42 < 12; local42++) {
					this.aClass1_Sub1_Sub2_Sub3Array3[local42] = new Class1_Sub1_Sub2_Sub3(this.aClass47_1, "runes", local42);
				}
			} else {
				for (local42 = 0; local42 < 12; local42++) {
					this.aClass1_Sub1_Sub2_Sub3Array3[local42] = new Class1_Sub1_Sub2_Sub3(this.aClass47_1, "runes", (local42 & 0x3) + 12);
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
			this.anIntArray52 = new int[256];
			for (@Pc(140) int local140 = 0; local140 < 64; local140++) {
				this.anIntArray52[local140] = local140 * 262144;
			}
			for (@Pc(155) int local155 = 0; local155 < 64; local155++) {
				this.anIntArray52[local155 + 64] = local155 * 1024 + 16711680;
			}
			for (@Pc(174) int local174 = 0; local174 < 64; local174++) {
				this.anIntArray52[local174 + 128] = local174 * 4 + 16776960;
			}
			for (@Pc(193) int local193 = 0; local193 < 64; local193++) {
				this.anIntArray52[local193 + 192] = 16777215;
			}
			this.anIntArray53 = new int[256];
			for (@Pc(212) int local212 = 0; local212 < 64; local212++) {
				this.anIntArray53[local212] = local212 * 1024;
			}
			for (@Pc(227) int local227 = 0; local227 < 64; local227++) {
				this.anIntArray53[local227 + 64] = local227 * 4 + 65280;
			}
			for (@Pc(246) int local246 = 0; local246 < 64; local246++) {
				this.anIntArray53[local246 + 128] = local246 * 262144 + 65535;
			}
			for (@Pc(265) int local265 = 0; local265 < 64; local265++) {
				this.anIntArray53[local265 + 192] = 16777215;
			}
			this.anIntArray54 = new int[256];
			for (@Pc(284) int local284 = 0; local284 < 64; local284++) {
				this.anIntArray54[local284] = local284 * 4;
			}
			for (@Pc(299) int local299 = 0; local299 < 64; local299++) {
				this.anIntArray54[local299 + 64] = local299 * 262144 + 255;
			}
			for (@Pc(318) int local318 = 0; local318 < 64; local318++) {
				this.anIntArray54[local318 + 128] = local318 * 1024 + 16711935;
			}
			for (@Pc(337) int local337 = 0; local337 < 64; local337++) {
				this.anIntArray54[local337 + 192] = 16777215;
			}
			this.anIntArray51 = new int[256];
			this.anIntArray34 = new int[32768];
			this.anIntArray35 = new int[32768];
			this.method111(null);
			this.anIntArray61 = new int[32768];
			this.anIntArray62 = new int[32768];
			this.method96(10, "Connecting to fileserver");
			if (!this.aBoolean51) {
				this.aBoolean66 = true;
				this.aBoolean51 = true;
				this.method95(this, 2);
			}
		} catch (@Pc(394) RuntimeException local394) {
			signlink.reporterror("22863, " + 0 + ", " + local394.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIIIB)V")
	private void method191(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) byte arg5) {
		try {
			@Pc(8) int local8 = this.aClass37_1.method556(arg4, arg0, arg1);
			@Pc(18) int local18;
			@Pc(24) int local24;
			@Pc(28) int local28;
			@Pc(30) int local30;
			@Pc(52) int local52;
			@Pc(58) int local58;
			if (local8 != 0) {
				local18 = this.aClass37_1.method560(arg4, arg0, arg1, local8);
				local24 = local18 >> 6 & 0x3;
				local28 = local18 & 0x1F;
				local30 = arg3;
				if (local8 > 0) {
					local30 = arg2;
				}
				@Pc(38) int[] local38 = this.aClass1_Sub1_Sub2_Sub2_6.anIntArray208;
				local52 = arg0 * 4 + (103 - arg1) * 512 * 4 + 24624;
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
					@Pc(71) Class1_Sub1_Sub2_Sub3 local71 = this.aClass1_Sub1_Sub2_Sub3Array1[local61.anInt518];
					if (local71 != null) {
						@Pc(83) int local83 = (local61.anInt513 * 4 - local71.anInt675) / 2;
						@Pc(93) int local93 = (local61.anInt514 * 4 - local71.anInt676) / 2;
						local71.method418(arg0 * 4 + local83 + 48, (104 - arg1 - local61.anInt514) * 4 + 48 + local93);
					}
				}
			}
			local8 = this.aClass37_1.method558(arg4, arg0, arg1);
			if (arg5 == 0) {
				if (local8 != 0) {
					local18 = this.aClass37_1.method560(arg4, arg0, arg1, local8);
					local24 = local18 >> 6 & 0x3;
					local28 = local18 & 0x1F;
					local30 = local8 >> 14 & 0x7FFF;
					@Pc(450) Class9 local450 = Class9.method288(local30);
					@Pc(482) int local482;
					if (local450.anInt518 != -1) {
						@Pc(460) Class1_Sub1_Sub2_Sub3 local460 = this.aClass1_Sub1_Sub2_Sub3Array1[local450.anInt518];
						if (local460 != null) {
							local58 = (local450.anInt513 * 4 - local460.anInt675) / 2;
							local482 = (local450.anInt514 * 4 - local460.anInt676) / 2;
							local460.method418(arg0 * 4 + local58 + 48, (104 - arg1 - local450.anInt514) * 4 + 48 + local482);
						}
					} else if (local28 == 9) {
						local52 = 15658734;
						if (local8 > 0) {
							local52 = 15597568;
						}
						@Pc(519) int[] local519 = this.aClass1_Sub1_Sub2_Sub2_6.anIntArray208;
						local482 = arg0 * 4 + (103 - arg1) * 512 * 4 + 24624;
						if (local24 == 0 || local24 == 2) {
							local519[local482 + 1536] = local52;
							local519[local482 + 1024 + 1] = local52;
							local519[local482 + 512 + 2] = local52;
							local519[local482 + 3] = local52;
						} else {
							local519[local482] = local52;
							local519[local482 + 512 + 1] = local52;
							local519[local482 + 1024 + 2] = local52;
							local519[local482 + 1536 + 3] = local52;
						}
					}
				}
				local8 = this.aClass37_1.method559(arg4, arg0, arg1);
				if (local8 != 0) {
					local18 = local8 >> 14 & 0x7FFF;
					@Pc(614) Class9 local614 = Class9.method288(local18);
					if (local614.anInt518 != -1) {
						@Pc(624) Class1_Sub1_Sub2_Sub3 local624 = this.aClass1_Sub1_Sub2_Sub3Array1[local614.anInt518];
						if (local624 != null) {
							local30 = (local614.anInt513 * 4 - local624.anInt675) / 2;
							@Pc(646) int local646 = (local614.anInt514 * 4 - local624.anInt676) / 2;
							local624.method418(arg0 * 4 + local30 + 48, (104 - arg1 - local614.anInt514) * 4 + 48 + local646);
							return;
						}
					}
				}
			}
		} catch (@Pc(670) RuntimeException local670) {
			signlink.reporterror("65927, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local670.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(ZI)V")
	private void method192(@OriginalArg(0) boolean arg0) {
		try {
			this.anInt368 += 0;
			for (@Pc(7) int local7 = 0; local7 < this.anInt424; local7++) {
				@Pc(17) Class1_Sub1_Sub1_Sub1_Sub2 local17 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[this.anIntArray92[local7]];
				@Pc(26) int local26 = (this.anIntArray92[local7] << 14) + 536870912;
				if (local17 != null && local17.method680() && local17.aClass13_2.aBoolean140 == arg0) {
					@Pc(42) int local42 = local17.anInt988 >> 7;
					@Pc(47) int local47 = local17.anInt989 >> 7;
					if (local42 >= 0 && local42 < 104 && local47 >= 0 && local47 < 104) {
						if (local17.anInt991 == 1 && (local17.anInt988 & 0x7F) == 64 && (local17.anInt989 & 0x7F) == 64) {
							if (this.anIntArrayArray5[local42][local47] == this.anInt316) {
								continue;
							}
							this.anIntArrayArray5[local42][local47] = this.anInt316;
						}
						this.aClass37_1.method541(local17, local17.anInt988, this.anInt246, this.method223(local17.anInt988, this.anInt246, local17.anInt989), (local17.anInt991 - 1) * 64 + 60, local17.anInt989, local17.anInt990, local17.aBoolean247, local26);
					}
				}
			}
		} catch (@Pc(131) RuntimeException local131) {
			signlink.reporterror("15312, " + arg0 + ", " + 0 + ", " + local131.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "l", descriptor = "(B)V")
	private void method193(@OriginalArg(0) byte arg0) {
		try {
			@Pc(4) boolean local4 = false;
			if (this.anInt339 == 0 && super.anInt202 == 1) {
				@Pc(29) int local29 = super.anInt203 - 25 - 550;
				@Pc(36) int local36 = super.anInt204 - 5 - 4;
				if (local29 >= 0 && local36 >= 0 && local29 < 146 && local36 < 151) {
					local29 -= 73;
					local36 -= 75;
					@Pc(56) int local56 = this.anInt392 + this.anInt422 & 0x7FF;
					@Pc(60) int local60 = Class1_Sub1_Sub2_Sub1.anIntArray178[local56];
					@Pc(64) int local64 = Class1_Sub1_Sub2_Sub1.anIntArray179[local56];
					@Pc(73) int local73 = local60 * (this.anInt269 + 256) >> 8;
					@Pc(82) int local82 = local64 * (this.anInt269 + 256) >> 8;
					@Pc(92) int local92 = local36 * local73 + local29 * local82 >> 11;
					@Pc(102) int local102 = local36 * local82 - local29 * local73 >> 11;
					@Pc(109) int local109 = aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt988 + local92 >> 7;
					@Pc(116) int local116 = aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt989 - local102 >> 7;
					@Pc(137) boolean local137 = this.method150((byte) 2, 0, local116, local109, aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray273[0], 0, 0, 1, true, aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray272[0], 0, 0);
					if (local137) {
						this.aClass1_Sub1_Sub3_4.method470(local29);
						this.aClass1_Sub1_Sub3_4.method470(local36);
						this.aClass1_Sub1_Sub3_4.method471(this.anInt392);
						this.aClass1_Sub1_Sub3_4.method470(57);
						this.aClass1_Sub1_Sub3_4.method470(this.anInt422);
						this.aClass1_Sub1_Sub3_4.method470(this.anInt269);
						this.aClass1_Sub1_Sub3_4.method470(89);
						this.aClass1_Sub1_Sub3_4.method471(aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt988);
						this.aClass1_Sub1_Sub3_4.method471(aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt989);
						this.aClass1_Sub1_Sub3_4.method470(this.anInt268);
						this.aClass1_Sub1_Sub3_4.method470(63);
						return;
					}
				}
			}
		} catch (@Pc(191) RuntimeException local191) {
			signlink.reporterror("56163, " + arg0 + ", " + local191.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILclient!d;IIBII)V")
	private void method194(@OriginalArg(0) int arg0, @OriginalArg(1) Class6 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		try {
			if (arg1.anInt434 == 0 && arg1.anIntArray98 != null && !arg1.aBoolean92 && (arg5 >= arg3 && arg2 >= arg0 && arg5 <= arg3 + arg1.anInt437 && arg2 <= arg0 + arg1.anInt438)) {
				@Pc(38) int local38 = arg1.anIntArray98.length;
				for (@Pc(40) int local40 = 0; local40 < local38; local40++) {
					@Pc(49) int local49 = arg1.anIntArray99[local40] + arg3;
					@Pc(58) int local58 = arg1.anIntArray100[local40] + arg0 - arg4;
					@Pc(65) Class6 local65 = Class6.aClass6Array1[arg1.anIntArray98[local40]];
					@Pc(70) int local70 = local49 + local65.anInt439;
					@Pc(75) int local75 = local58 + local65.anInt440;
					if ((local65.anInt441 >= 0 || local65.anInt449 != 0) && arg5 >= local70 && arg2 >= local75 && arg5 < local70 + local65.anInt437 && arg2 < local75 + local65.anInt438) {
						if (local65.anInt441 >= 0) {
							this.anInt213 = local65.anInt441;
						} else {
							this.anInt213 = local65.anInt432;
						}
					}
					if (local65.anInt434 == 0) {
						this.method194(local75, local65, arg2, local70, local65.anInt443, arg5);
						if (local65.anInt442 > local65.anInt438) {
							this.method195(local65, local75, arg2, local70 + local65.anInt437, local65.anInt438, local65.anInt442, arg5, true);
						}
					} else {
						if (local65.anInt435 == 1 && arg5 >= local70 && arg2 >= local75 && arg5 < local70 + local65.anInt437 && arg2 < local75 + local65.anInt438) {
							@Pc(172) boolean local172 = false;
							if (local65.anInt436 != 0) {
								local172 = this.method104(local65);
							}
							if (!local172) {
								this.aStringArray4[this.anInt322] = local65.aString22;
								this.anIntArray39[this.anInt322] = 231;
								this.anIntArray38[this.anInt322] = local65.anInt432;
								this.anInt322++;
							}
						}
						if (local65.anInt435 == 2 && this.anInt425 == 0 && arg5 >= local70 && arg2 >= local75 && arg5 < local70 + local65.anInt437 && arg2 < local75 + local65.anInt438) {
							@Pc(236) String local236 = local65.aString20;
							if (local236.indexOf(" ") != -1) {
								local236 = local236.substring(0, local236.indexOf(" "));
							}
							this.aStringArray4[this.anInt322] = local236 + " @gre@" + local65.aString21;
							this.anIntArray39[this.anInt322] = 274;
							this.anIntArray38[this.anInt322] = local65.anInt432;
							this.anInt322++;
						}
						if (local65.anInt435 == 3 && arg5 >= local70 && arg2 >= local75 && arg5 < local70 + local65.anInt437 && arg2 < local75 + local65.anInt438) {
							this.aStringArray4[this.anInt322] = "Close";
							this.anIntArray39[this.anInt322] = 737;
							this.anIntArray38[this.anInt322] = local65.anInt432;
							this.anInt322++;
						}
						if (local65.anInt435 == 4 && arg5 >= local70 && arg2 >= local75 && arg5 < local70 + local65.anInt437 && arg2 < local75 + local65.anInt438) {
							this.aStringArray4[this.anInt322] = local65.aString22;
							this.anIntArray39[this.anInt322] = 435;
							this.anIntArray38[this.anInt322] = local65.anInt432;
							this.anInt322++;
						}
						if (local65.anInt435 == 5 && arg5 >= local70 && arg2 >= local75 && arg5 < local70 + local65.anInt437 && arg2 < local75 + local65.anInt438) {
							this.aStringArray4[this.anInt322] = local65.aString22;
							this.anIntArray39[this.anInt322] = 225;
							this.anIntArray38[this.anInt322] = local65.anInt432;
							this.anInt322++;
						}
						if (local65.anInt435 == 6 && !this.aBoolean49 && arg5 >= local70 && arg2 >= local75 && arg5 < local70 + local65.anInt437 && arg2 < local75 + local65.anInt438) {
							this.aStringArray4[this.anInt322] = local65.aString22;
							this.anIntArray39[this.anInt322] = 997;
							this.anIntArray38[this.anInt322] = local65.anInt432;
							this.anInt322++;
						}
						if (local65.anInt434 == 2) {
							@Pc(484) int local484 = 0;
							for (@Pc(486) int local486 = 0; local486 < local65.anInt438; local486++) {
								for (@Pc(490) int local490 = 0; local490 < local65.anInt437; local490++) {
									@Pc(501) int local501 = local70 + local490 * (local65.anInt445 + 32);
									@Pc(510) int local510 = local75 + local486 * (local65.anInt446 + 32);
									if (local484 < 20) {
										local501 += local65.anIntArray101[local484];
										local510 += local65.anIntArray102[local484];
									}
									if (arg5 >= local501 && arg2 >= local510 && arg5 < local501 + 32 && arg2 < local510 + 32) {
										this.anInt350 = local484;
										this.anInt351 = local65.anInt432;
										if (local65.anIntArray94[local484] > 0) {
											@Pc(563) Class15 local563 = Class15.method361(local65.anIntArray94[local484] - 1);
											if (this.anInt227 == 1 && local65.aBoolean95) {
												if (local65.anInt432 != this.anInt229 || local484 != this.anInt228) {
													this.aStringArray4[this.anInt322] = "Use " + this.aString5 + " with @lre@" + local563.aString25;
													this.anIntArray39[this.anInt322] = 398;
													this.anIntArray40[this.anInt322] = local563.anInt603;
													this.anIntArray37[this.anInt322] = local484;
													this.anIntArray38[this.anInt322] = local65.anInt432;
													this.anInt322++;
												}
											} else if (this.anInt425 != 1 || !local65.aBoolean95) {
												@Pc(700) int local700;
												if (local65.aBoolean95) {
													for (local700 = 4; local700 >= 3; local700--) {
														if (local563.aStringArray11 != null && local563.aStringArray11[local700] != null) {
															this.aStringArray4[this.anInt322] = local563.aStringArray11[local700] + " @lre@" + local563.aString25;
															if (local700 == 3) {
																this.anIntArray39[this.anInt322] = 681;
															}
															if (local700 == 4) {
																this.anIntArray39[this.anInt322] = 100;
															}
															this.anIntArray40[this.anInt322] = local563.anInt603;
															this.anIntArray37[this.anInt322] = local484;
															this.anIntArray38[this.anInt322] = local65.anInt432;
															this.anInt322++;
														} else if (local700 == 4) {
															this.aStringArray4[this.anInt322] = "Drop @lre@" + local563.aString25;
															this.anIntArray39[this.anInt322] = 100;
															this.anIntArray40[this.anInt322] = local563.anInt603;
															this.anIntArray37[this.anInt322] = local484;
															this.anIntArray38[this.anInt322] = local65.anInt432;
															this.anInt322++;
														}
													}
												}
												if (local65.aBoolean96) {
													this.aStringArray4[this.anInt322] = "Use @lre@" + local563.aString25;
													this.anIntArray39[this.anInt322] = 102;
													this.anIntArray40[this.anInt322] = local563.anInt603;
													this.anIntArray37[this.anInt322] = local484;
													this.anIntArray38[this.anInt322] = local65.anInt432;
													this.anInt322++;
												}
												if (local65.aBoolean95 && local563.aStringArray11 != null) {
													for (local700 = 2; local700 >= 0; local700--) {
														if (local563.aStringArray11[local700] != null) {
															this.aStringArray4[this.anInt322] = local563.aStringArray11[local700] + " @lre@" + local563.aString25;
															if (local700 == 0) {
																this.anIntArray39[this.anInt322] = 694;
															}
															if (local700 == 1) {
																this.anIntArray39[this.anInt322] = 962;
															}
															if (local700 == 2) {
																this.anIntArray39[this.anInt322] = 795;
															}
															this.anIntArray40[this.anInt322] = local563.anInt603;
															this.anIntArray37[this.anInt322] = local484;
															this.anIntArray38[this.anInt322] = local65.anInt432;
															this.anInt322++;
														}
													}
												}
												if (local65.aStringArray7 != null) {
													for (local700 = 4; local700 >= 0; local700--) {
														if (local65.aStringArray7[local700] != null) {
															this.aStringArray4[this.anInt322] = local65.aStringArray7[local700] + " @lre@" + local563.aString25;
															if (local700 == 0) {
																this.anIntArray39[this.anInt322] = 582;
															}
															if (local700 == 1) {
																this.anIntArray39[this.anInt322] = 113;
															}
															if (local700 == 2) {
																this.anIntArray39[this.anInt322] = 555;
															}
															if (local700 == 3) {
																this.anIntArray39[this.anInt322] = 331;
															}
															if (local700 == 4) {
																this.anIntArray39[this.anInt322] = 354;
															}
															this.anIntArray40[this.anInt322] = local563.anInt603;
															this.anIntArray37[this.anInt322] = local484;
															this.anIntArray38[this.anInt322] = local65.anInt432;
															this.anInt322++;
														}
													}
												}
												this.aStringArray4[this.anInt322] = "Examine @lre@" + local563.aString25;
												this.anIntArray39[this.anInt322] = 1328;
												this.anIntArray40[this.anInt322] = local563.anInt603;
												this.anIntArray37[this.anInt322] = local484;
												this.anIntArray38[this.anInt322] = local65.anInt432;
												this.anInt322++;
											} else if ((this.anInt427 & 0x10) == 16) {
												this.aStringArray4[this.anInt322] = this.aString16 + " @lre@" + local563.aString25;
												this.anIntArray39[this.anInt322] = 563;
												this.anIntArray40[this.anInt322] = local563.anInt603;
												this.anIntArray37[this.anInt322] = local484;
												this.anIntArray38[this.anInt322] = local65.anInt432;
												this.anInt322++;
											}
										}
									}
									local484++;
								}
							}
						}
					}
				}
			}
		} catch (@Pc(1130) RuntimeException local1130) {
			signlink.reporterror("34943, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + -99 + ", " + arg4 + ", " + arg5 + ", " + local1130.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!d;IIIIIIIZ)V")
	private void method195(@OriginalArg(0) Class6 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) boolean arg7) {
		try {
			if (this.anInt352 == 6) {
				if (this.aBoolean52) {
					this.anInt304 = 32;
				} else {
					this.anInt304 = 0;
				}
				this.aBoolean52 = false;
				if (arg6 >= arg3 && arg6 < arg3 + 16 && arg2 >= arg1 && arg2 < arg1 + 16) {
					arg0.anInt443 -= this.anInt335 * 4;
					if (arg7) {
						this.aBoolean53 = true;
						return;
					}
				} else if (arg6 >= arg3 && arg6 < arg3 + 16 && arg2 >= arg1 + arg4 - 16 && arg2 < arg1 + arg4) {
					arg0.anInt443 += this.anInt335 * 4;
					if (arg7) {
						this.aBoolean53 = true;
						return;
					}
				} else if (arg6 >= arg3 - this.anInt304 && arg6 < arg3 + this.anInt304 + 16 && arg2 >= arg1 + 16 && arg2 < arg1 + arg4 - 16 && this.anInt335 > 0) {
					@Pc(121) int local121 = (arg4 - 32) * arg4 / arg5;
					if (local121 < 8) {
						local121 = 8;
					}
					@Pc(136) int local136 = arg2 - arg1 - local121 / 2 - 16;
					@Pc(142) int local142 = arg4 - local121 - 32;
					arg0.anInt443 = (arg5 - arg4) * local136 / local142;
					if (arg7) {
						this.aBoolean53 = true;
					}
					this.aBoolean52 = true;
				} else {
					return;
				}
			}
		} catch (@Pc(161) RuntimeException local161) {
			signlink.reporterror("24829, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + 6 + ", " + arg6 + ", " + arg7 + ", " + local161.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(BILjava/lang/String;)V")
	@Override
	protected void method96(@OriginalArg(1) int arg0, @OriginalArg(2) String arg1) {
		try {
			this.anInt354 = arg0;
			this.aString15 = arg1;
			this.method115();
			if (this.aClass47_1 == null) {
				super.method96(arg0, arg1);
			} else {
				this.aClass35_21.method524(this.anInt255);
				this.aClass1_Sub1_Sub2_Sub4_3.method447("RuneScape is loading - please wait...", 54, 16777215, 180, this.anInt272);
				Class1_Sub1_Sub2.method440(28, 62, 304, 9179409, 34);
				Class1_Sub1_Sub2.method440(29, 63, 302, 0, 32);
				Class1_Sub1_Sub2.method439(64, 30, 9179409, arg0 * 3, 30);
				Class1_Sub1_Sub2.method439(64, 30, 0, 300 - arg0 * 3, arg0 * 3 + 30);
				this.aClass1_Sub1_Sub2_Sub4_3.method447(arg1, 85, 16777215, 180, this.anInt272);
				this.aClass35_21.method525(super.aGraphics2, 202, 171);
				if (this.aBoolean61) {
					this.aBoolean61 = false;
					if (!this.aBoolean51) {
						this.aClass35_22.method525(super.aGraphics2, 0, 0);
						this.aClass35_23.method525(super.aGraphics2, 637, 0);
					}
					this.aClass35_19.method525(super.aGraphics2, 128, 0);
					this.aClass35_20.method525(super.aGraphics2, 202, 371);
					this.aClass35_24.method525(super.aGraphics2, 0, 265);
					this.aClass35_25.method525(super.aGraphics2, 562, 265);
					this.aClass35_26.method525(super.aGraphics2, 128, 171);
					this.aClass35_27.method525(super.aGraphics2, 562, 171);
				}
			}
		} catch (@Pc(219) RuntimeException local219) {
			signlink.reporterror("89046, " + 22 + ", " + arg0 + ", " + arg1 + ", " + local219.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "A", descriptor = "(I)V")
	private void method196() {
		try {
			for (@Pc(1) int local1 = 0; local1 < this.anInt424; local1++) {
				@Pc(8) int local8 = this.anIntArray92[local1];
				@Pc(13) Class1_Sub1_Sub1_Sub1_Sub2 local13 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local8];
				if (local13 != null) {
					this.method197(local13, local13.aClass13_2.aByte16);
				}
			}
		} catch (@Pc(34) RuntimeException local34) {
			signlink.reporterror("45088, " + 9 + ", " + local34.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(ILclient!y;I)V")
	private void method197(@OriginalArg(1) Class1_Sub1_Sub1_Sub1 arg0, @OriginalArg(2) int arg1) {
		try {
			this.anInt368 += 0;
			if (arg0.anInt988 < 128 || arg0.anInt989 < 128 || arg0.anInt988 >= 13184 || arg0.anInt989 >= 13184) {
				arg0.anInt1011 = -1;
				arg0.anInt1016 = -1;
				arg0.anInt1025 = 0;
				arg0.anInt1026 = 0;
				arg0.anInt988 = arg0.anIntArray272[0] * 128 + arg0.anInt991 * 64;
				arg0.anInt989 = arg0.anIntArray273[0] * 128 + arg0.anInt991 * 64;
				arg0.method679();
			}
			if (arg0 == aClass1_Sub1_Sub1_Sub1_Sub1_1 && (arg0.anInt988 < 1536 || arg0.anInt989 < 1536 || arg0.anInt988 >= 11776 || arg0.anInt989 >= 11776)) {
				arg0.anInt1011 = -1;
				arg0.anInt1016 = -1;
				arg0.anInt1025 = 0;
				arg0.anInt1026 = 0;
				arg0.anInt988 = arg0.anIntArray272[0] * 128 + arg0.anInt991 * 64;
				arg0.anInt989 = arg0.anIntArray273[0] * 128 + arg0.anInt991 * 64;
				arg0.method679();
			}
			if (arg0.anInt1025 > anInt297) {
				this.method198(23, arg0);
			} else if (arg0.anInt1026 >= anInt297) {
				this.method199(arg0);
			} else {
				this.method200(129, arg0);
			}
			this.method201(arg0);
			this.method202(arg0);
		} catch (@Pc(158) RuntimeException local158) {
			signlink.reporterror("43361, " + 0 + ", " + arg0 + ", " + arg1 + ", " + local158.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILclient!y;)V")
	private void method198(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub1_Sub1_Sub1 arg1) {
		try {
			@Pc(3) boolean local3 = true;
			@Pc(8) int local8 = arg1.anInt1025 - anInt297;
			@Pc(18) int local18 = arg1.anInt1021 * 128 + arg1.anInt991 * 64;
			@Pc(28) int local28 = arg1.anInt1023 * 128 + arg1.anInt991 * 64;
			arg1.anInt988 += (local18 - arg1.anInt988) / local8;
			arg1.anInt989 += (local28 - arg1.anInt989) / local8;
			arg1.anInt1033 = 0;
			if (arg1.anInt1027 == 0) {
				arg1.anInt1030 = 1024;
			}
			if (arg1.anInt1027 == 1) {
				arg1.anInt1030 = 1536;
			}
			if (arg1.anInt1027 == 2) {
				arg1.anInt1030 = 0;
			}
			if (arg1.anInt1027 == 3) {
				arg1.anInt1030 = 512;
			}
		} catch (@Pc(82) RuntimeException local82) {
			signlink.reporterror("89938, " + arg0 + ", " + arg1 + ", " + local82.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(ILclient!y;)V")
	private void method199(@OriginalArg(1) Class1_Sub1_Sub1_Sub1 arg0) {
		try {
			if (arg0.anInt1026 == anInt297 || arg0.anInt1011 == -1 || arg0.anInt1014 != 0 || arg0.anInt1013 + 1 > Class27.aClass27Array1[arg0.anInt1011].method506(arg0.anInt1012)) {
				@Pc(40) int local40 = arg0.anInt1026 - arg0.anInt1025;
				@Pc(45) int local45 = anInt297 - arg0.anInt1025;
				@Pc(55) int local55 = arg0.anInt1021 * 128 + arg0.anInt991 * 64;
				@Pc(65) int local65 = arg0.anInt1023 * 128 + arg0.anInt991 * 64;
				@Pc(75) int local75 = arg0.anInt1022 * 128 + arg0.anInt991 * 64;
				@Pc(85) int local85 = arg0.anInt1024 * 128 + arg0.anInt991 * 64;
				arg0.anInt988 = (local55 * (local40 - local45) + local75 * local45) / local40;
				arg0.anInt989 = (local65 * (local40 - local45) + local85 * local45) / local40;
			}
			arg0.anInt1033 = 0;
			if (arg0.anInt1027 == 0) {
				arg0.anInt1030 = 1024;
			}
			if (arg0.anInt1027 == 1) {
				arg0.anInt1030 = 1536;
			}
			if (arg0.anInt1027 == 2) {
				arg0.anInt1030 = 0;
			}
			if (arg0.anInt1027 == 3) {
				arg0.anInt1030 = 512;
			}
			arg0.anInt990 = arg0.anInt1030;
		} catch (@Pc(147) RuntimeException local147) {
			signlink.reporterror("78488, " + 6438 + ", " + arg0 + ", " + local147.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(ILclient!y;)V")
	private void method200(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub1_Sub1_Sub1 arg1) {
		try {
			@Pc(5) boolean local5 = false;
			arg1.anInt1008 = arg1.anInt992;
			if (arg1.anInt1032 == 0) {
				arg1.anInt1033 = 0;
			} else {
				if (arg1.anInt1011 != -1 && arg1.anInt1014 == 0) {
					@Pc(28) Class27 local28 = Class27.aClass27Array1[arg1.anInt1011];
					if (arg1.anInt1034 > 0 && local28.anInt800 == 0) {
						arg1.anInt1033++;
						return;
					}
					if (arg1.anInt1034 <= 0 && local28.anInt801 == 0) {
						arg1.anInt1033++;
						return;
					}
				}
				@Pc(57) int local57 = arg1.anInt988;
				@Pc(60) int local60 = arg1.anInt989;
				@Pc(75) int local75 = arg1.anIntArray272[arg1.anInt1032 - 1] * 128 + arg1.anInt991 * 64;
				@Pc(90) int local90 = arg1.anIntArray273[arg1.anInt1032 - 1] * 128 + arg1.anInt991 * 64;
				if (local75 - local57 <= 256 && local75 - local57 >= -256 && local90 - local60 <= 256 && local90 - local60 >= -256) {
					if (local57 < local75) {
						if (local60 < local90) {
							arg1.anInt1030 = 1280;
						} else if (local60 > local90) {
							arg1.anInt1030 = 1792;
						} else {
							arg1.anInt1030 = 1536;
						}
					} else if (local57 > local75) {
						if (local60 < local90) {
							arg1.anInt1030 = 768;
						} else if (local60 > local90) {
							arg1.anInt1030 = 256;
						} else {
							arg1.anInt1030 = 512;
						}
					} else if (local60 < local90) {
						arg1.anInt1030 = 1024;
					} else {
						arg1.anInt1030 = 0;
					}
					@Pc(184) int local184 = arg1.anInt1030 - arg1.anInt990 & 0x7FF;
					if (local184 > 1024) {
						local184 -= 2048;
					}
					@Pc(191) int local191 = arg1.anInt995;
					if (local184 >= -256 && local184 <= 256) {
						local191 = arg1.anInt994;
					} else if (local184 >= 256 && local184 < 768) {
						local191 = arg1.anInt997;
					} else if (local184 >= -768 && local184 <= -256) {
						local191 = arg1.anInt996;
					}
					if (local191 == -1) {
						local191 = arg1.anInt994;
					}
					arg1.anInt1008 = local191;
					@Pc(233) int local233 = 4;
					if (arg1.anInt990 != arg1.anInt1030 && arg1.anInt1005 == -1 && arg1.anInt1031 != 0) {
						local233 = 2;
					}
					if (arg1.anInt1032 > 2) {
						local233 = 6;
					}
					if (arg1.anInt1032 > 3) {
						local233 = 8;
					}
					if (arg1.anInt1033 > 0 && arg1.anInt1032 > 1) {
						local233 = 8;
						arg1.anInt1033--;
					}
					if (arg1.aBooleanArray12[arg1.anInt1032 - 1]) {
						local233 <<= 0x1;
					}
					if (local233 >= 8 && arg1.anInt1008 == arg1.anInt994 && arg1.anInt998 != -1) {
						arg1.anInt1008 = arg1.anInt998;
					}
					if (local57 < local75) {
						arg1.anInt988 += local233;
						if (arg1.anInt988 > local75) {
							arg1.anInt988 = local75;
						}
					} else if (local57 > local75) {
						arg1.anInt988 -= local233;
						if (arg1.anInt988 < local75) {
							arg1.anInt988 = local75;
						}
					}
					if (local60 < local90) {
						arg1.anInt989 += local233;
						if (arg1.anInt989 > local90) {
							arg1.anInt989 = local90;
						}
					} else if (local60 > local90) {
						arg1.anInt989 -= local233;
						if (arg1.anInt989 < local90) {
							arg1.anInt989 = local90;
						}
					}
					if (arg1.anInt988 == local75 && arg1.anInt989 == local90) {
						arg1.anInt1032--;
						if (arg1.anInt1034 > 0) {
							arg1.anInt1034--;
							return;
						}
					}
				} else {
					arg1.anInt988 = local75;
					arg1.anInt989 = local90;
				}
			}
		} catch (@Pc(395) RuntimeException local395) {
			signlink.reporterror("58712, " + arg0 + ", " + arg1 + ", " + local395.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!y;Z)V")
	private void method201(@OriginalArg(0) Class1_Sub1_Sub1_Sub1 arg0) {
		try {
			if (arg0.anInt1031 != 0) {
				@Pc(31) int local31;
				@Pc(37) int local37;
				if (arg0.anInt1005 != -1 && arg0.anInt1005 < 32768) {
					@Pc(23) Class1_Sub1_Sub1_Sub1_Sub2 local23 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[arg0.anInt1005];
					if (local23 != null) {
						local31 = arg0.anInt988 - local23.anInt988;
						local37 = arg0.anInt989 - local23.anInt989;
						if (local31 != 0 || local37 != 0) {
							arg0.anInt1030 = (int) (Math.atan2((double) local31, (double) local37) * 325.949D) & 0x7FF;
						}
					}
				}
				@Pc(62) int local62;
				if (arg0.anInt1005 >= 32768) {
					local62 = arg0.anInt1005 - 32768;
					if (local62 == this.anInt214) {
						local62 = this.anInt331;
					}
					@Pc(74) Class1_Sub1_Sub1_Sub1_Sub1 local74 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local62];
					if (local74 != null) {
						local37 = arg0.anInt988 - local74.anInt988;
						@Pc(88) int local88 = arg0.anInt989 - local74.anInt989;
						if (local37 != 0 || local88 != 0) {
							arg0.anInt1030 = (int) (Math.atan2((double) local37, (double) local88) * 325.949D) & 0x7FF;
						}
					}
				}
				if ((arg0.anInt1006 != 0 || arg0.anInt1007 != 0) && (arg0.anInt1032 == 0 || arg0.anInt1033 > 0)) {
					local62 = arg0.anInt988 - (arg0.anInt1006 - this.anInt323 - this.anInt323) * 64;
					local31 = arg0.anInt989 - (arg0.anInt1007 - this.anInt324 - this.anInt324) * 64;
					if (local62 != 0 || local31 != 0) {
						arg0.anInt1030 = (int) (Math.atan2((double) local62, (double) local31) * 325.949D) & 0x7FF;
					}
					arg0.anInt1006 = 0;
					arg0.anInt1007 = 0;
				}
				local62 = arg0.anInt1030 - arg0.anInt990 & 0x7FF;
				if (local62 != 0) {
					if (local62 < arg0.anInt1031 || local62 > 2048 - arg0.anInt1031) {
						arg0.anInt990 = arg0.anInt1030;
					} else if (local62 > 1024) {
						arg0.anInt990 -= arg0.anInt1031;
					} else {
						arg0.anInt990 += arg0.anInt1031;
					}
					arg0.anInt990 &= 0x7FF;
					if (arg0.anInt1008 == arg0.anInt992 && arg0.anInt990 != arg0.anInt1030) {
						if (arg0.anInt993 != -1) {
							arg0.anInt1008 = arg0.anInt993;
							return;
						}
						arg0.anInt1008 = arg0.anInt994;
						return;
					}
				}
			}
		} catch (@Pc(242) RuntimeException local242) {
			signlink.reporterror("71280, " + arg0 + ", " + false + ", " + local242.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ZLclient!y;)V")
	private void method202(@OriginalArg(1) Class1_Sub1_Sub1_Sub1 arg0) {
		try {
			arg0.aBoolean247 = false;
			@Pc(22) Class27 local22;
			if (arg0.anInt1008 != -1) {
				local22 = Class27.aClass27Array1[arg0.anInt1008];
				arg0.anInt1010++;
				if (arg0.anInt1009 < local22.anInt794 && arg0.anInt1010 > local22.method506(arg0.anInt1009)) {
					arg0.anInt1010 = 0;
					arg0.anInt1009++;
				}
				if (arg0.anInt1009 >= local22.anInt794) {
					arg0.anInt1010 = 0;
					arg0.anInt1009 = 0;
				}
			}
			if (arg0.anInt1016 != -1 && anInt297 >= arg0.anInt1019) {
				if (arg0.anInt1017 < 0) {
					arg0.anInt1017 = 0;
				}
				local22 = Class33.aClass33Array1[arg0.anInt1016].aClass27_2;
				arg0.anInt1018++;
				while (arg0.anInt1017 < local22.anInt794 && arg0.anInt1018 > local22.method506(arg0.anInt1017)) {
					arg0.anInt1018 -= local22.method506(arg0.anInt1017);
					arg0.anInt1017++;
				}
				if (arg0.anInt1017 >= local22.anInt794 && (arg0.anInt1017 < 0 || arg0.anInt1017 >= local22.anInt794)) {
					arg0.anInt1016 = -1;
				}
			}
			if (arg0.anInt1011 != -1 && arg0.anInt1014 <= 1) {
				local22 = Class27.aClass27Array1[arg0.anInt1011];
				if (local22.anInt800 == 1 && arg0.anInt1034 > 0 && arg0.anInt1025 <= anInt297 && arg0.anInt1026 < anInt297) {
					arg0.anInt1014 = 1;
					return;
				}
			}
			if (arg0.anInt1011 != -1 && arg0.anInt1014 == 0) {
				local22 = Class27.aClass27Array1[arg0.anInt1011];
				arg0.anInt1013++;
				while (arg0.anInt1012 < local22.anInt794 && arg0.anInt1013 > local22.method506(arg0.anInt1012)) {
					arg0.anInt1013 -= local22.method506(arg0.anInt1012);
					arg0.anInt1012++;
				}
				if (arg0.anInt1012 >= local22.anInt794) {
					arg0.anInt1012 -= local22.anInt795;
					arg0.anInt1015++;
					if (arg0.anInt1015 >= local22.anInt799) {
						arg0.anInt1011 = -1;
					}
					if (arg0.anInt1012 < 0 || arg0.anInt1012 >= local22.anInt794) {
						arg0.anInt1011 = -1;
					}
				}
				arg0.aBoolean247 = local22.aBoolean204;
			}
			if (arg0.anInt1014 > 0) {
				arg0.anInt1014--;
			}
		} catch (@Pc(267) RuntimeException local267) {
			signlink.reporterror("5033, " + false + ", " + arg0 + ", " + local267.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "B", descriptor = "(I)V")
	private void method203(@OriginalArg(0) int arg0) {
		try {
			if (this.aBoolean61) {
				this.aBoolean61 = false;
				this.aClass35_10.method525(super.aGraphics2, 0, 4);
				this.aClass35_11.method525(super.aGraphics2, 0, 357);
				this.aClass35_12.method525(super.aGraphics2, 722, 4);
				this.aClass35_13.method525(super.aGraphics2, 743, 205);
				this.aClass35_14.method525(super.aGraphics2, 0, 0);
				this.aClass35_15.method525(super.aGraphics2, 516, 4);
				this.aClass35_16.method525(super.aGraphics2, 516, 205);
				this.aClass35_17.method525(super.aGraphics2, 496, 357);
				this.aClass35_18.method525(super.aGraphics2, 0, 338);
				this.aBoolean53 = true;
				this.aBoolean59 = true;
				this.aBoolean64 = true;
				this.aBoolean45 = true;
				if (this.anInt353 != 2) {
					this.aClass35_5.method525(super.aGraphics2, 4, 4);
					this.aClass35_4.method525(super.aGraphics2, 550, 4);
				}
			}
			if (this.anInt353 == 2) {
				this.method160();
			}
			if (this.aBoolean78 && this.anInt360 == 1) {
				this.aBoolean53 = true;
			}
			@Pc(138) boolean local138;
			if (this.anInt376 != -1) {
				local138 = this.method167(this.anInt208, this.anInt376);
				if (local138) {
					this.aBoolean53 = true;
				}
			}
			if (this.anInt252 == 2) {
				this.aBoolean53 = true;
			}
			if (this.anInt404 == 2) {
				this.aBoolean53 = true;
			}
			if (this.aBoolean53) {
				this.method123((byte) 2);
				this.aBoolean53 = false;
			}
			if (this.anInt217 == -1) {
				this.aClass6_1.anInt443 = this.anInt261 - this.anInt211 - 77;
				if (super.anInt197 > 448 && super.anInt197 < 560 && super.anInt198 > 332) {
					this.method195(this.aClass6_1, 0, super.anInt198 - 357, 463, 77, this.anInt261, super.anInt197 - 17, false);
				}
				@Pc(220) int local220 = this.anInt261 - this.aClass6_1.anInt443 - 77;
				if (local220 < 0) {
					local220 = 0;
				}
				if (local220 > this.anInt261 - 77) {
					local220 = this.anInt261 - 77;
				}
				if (this.anInt211 != local220) {
					this.anInt211 = local220;
					this.aBoolean59 = true;
				}
			}
			if (this.anInt217 != -1) {
				local138 = this.method167(this.anInt208, this.anInt217);
				if (local138) {
					this.aBoolean59 = true;
				}
			}
			if (this.anInt252 == 3) {
				this.aBoolean59 = true;
			}
			if (this.anInt404 == 3) {
				this.aBoolean59 = true;
			}
			if (this.aString17 != null) {
				this.aBoolean59 = true;
			}
			if (this.aBoolean78 && this.anInt360 == 2) {
				this.aBoolean59 = true;
			}
			if (this.aBoolean59) {
				this.method116((byte) 2);
				this.aBoolean59 = false;
			}
			if (this.anInt353 == 2) {
				this.method124();
				this.aClass35_4.method525(super.aGraphics2, 550, 4);
			}
			if (this.anInt271 != -1) {
				this.aBoolean64 = true;
			}
			if (this.aBoolean64) {
				if (this.anInt271 != -1 && this.anInt271 == this.anInt334) {
					this.anInt271 = -1;
					this.aClass1_Sub1_Sub3_4.method469(36);
					this.aClass1_Sub1_Sub3_4.method470(this.anInt334);
				}
				this.aBoolean64 = false;
				this.aClass35_9.method524(this.anInt255);
				this.aClass1_Sub1_Sub2_Sub3_6.method418(0, 0);
				if (this.anInt376 == -1) {
					if (this.anIntArray68[this.anInt334] != -1) {
						if (this.anInt334 == 0) {
							this.aClass1_Sub1_Sub2_Sub3_7.method418(22, 10);
						}
						if (this.anInt334 == 1) {
							this.aClass1_Sub1_Sub2_Sub3_8.method418(54, 8);
						}
						if (this.anInt334 == 2) {
							this.aClass1_Sub1_Sub2_Sub3_8.method418(82, 8);
						}
						if (this.anInt334 == 3) {
							this.aClass1_Sub1_Sub2_Sub3_9.method418(110, 8);
						}
						if (this.anInt334 == 4) {
							this.aClass1_Sub1_Sub2_Sub3_11.method418(153, 8);
						}
						if (this.anInt334 == 5) {
							this.aClass1_Sub1_Sub2_Sub3_11.method418(181, 8);
						}
						if (this.anInt334 == 6) {
							this.aClass1_Sub1_Sub2_Sub3_10.method418(209, 9);
						}
					}
					if (this.anIntArray68[0] != -1 && (this.anInt271 != 0 || anInt297 % 20 < 10)) {
						this.aClass1_Sub1_Sub2_Sub3Array4[0].method418(29, 13);
					}
					if (this.anIntArray68[1] != -1 && (this.anInt271 != 1 || anInt297 % 20 < 10)) {
						this.aClass1_Sub1_Sub2_Sub3Array4[1].method418(53, 11);
					}
					if (this.anIntArray68[2] != -1 && (this.anInt271 != 2 || anInt297 % 20 < 10)) {
						this.aClass1_Sub1_Sub2_Sub3Array4[2].method418(82, 11);
					}
					if (this.anIntArray68[3] != -1 && (this.anInt271 != 3 || anInt297 % 20 < 10)) {
						this.aClass1_Sub1_Sub2_Sub3Array4[3].method418(115, 12);
					}
					if (this.anIntArray68[4] != -1 && (this.anInt271 != 4 || anInt297 % 20 < 10)) {
						this.aClass1_Sub1_Sub2_Sub3Array4[4].method418(153, 13);
					}
					if (this.anIntArray68[5] != -1 && (this.anInt271 != 5 || anInt297 % 20 < 10)) {
						this.aClass1_Sub1_Sub2_Sub3Array4[5].method418(180, 11);
					}
					if (this.anIntArray68[6] != -1 && (this.anInt271 != 6 || anInt297 % 20 < 10)) {
						this.aClass1_Sub1_Sub2_Sub3Array4[6].method418(208, 13);
					}
				}
				this.aClass35_9.method525(super.aGraphics2, 516, 160);
				this.aClass35_8.method524(this.anInt255);
				this.aClass1_Sub1_Sub2_Sub3_5.method418(0, 0);
				if (this.anInt376 == -1) {
					if (this.anIntArray68[this.anInt334] != -1) {
						if (this.anInt334 == 7) {
							this.aClass1_Sub1_Sub2_Sub3_16.method418(42, 0);
						}
						if (this.anInt334 == 8) {
							this.aClass1_Sub1_Sub2_Sub3_17.method418(74, 0);
						}
						if (this.anInt334 == 9) {
							this.aClass1_Sub1_Sub2_Sub3_17.method418(102, 0);
						}
						if (this.anInt334 == 10) {
							this.aClass1_Sub1_Sub2_Sub3_18.method418(130, 1);
						}
						if (this.anInt334 == 11) {
							this.aClass1_Sub1_Sub2_Sub3_20.method418(173, 0);
						}
						if (this.anInt334 == 12) {
							this.aClass1_Sub1_Sub2_Sub3_20.method418(201, 0);
						}
						if (this.anInt334 == 13) {
							this.aClass1_Sub1_Sub2_Sub3_19.method418(229, 0);
						}
					}
					if (this.anIntArray68[8] != -1 && (this.anInt271 != 8 || anInt297 % 20 < 10)) {
						this.aClass1_Sub1_Sub2_Sub3Array4[7].method418(74, 2);
					}
					if (this.anIntArray68[9] != -1 && (this.anInt271 != 9 || anInt297 % 20 < 10)) {
						this.aClass1_Sub1_Sub2_Sub3Array4[8].method418(102, 3);
					}
					if (this.anIntArray68[10] != -1 && (this.anInt271 != 10 || anInt297 % 20 < 10)) {
						this.aClass1_Sub1_Sub2_Sub3Array4[9].method418(137, 4);
					}
					if (this.anIntArray68[11] != -1 && (this.anInt271 != 11 || anInt297 % 20 < 10)) {
						this.aClass1_Sub1_Sub2_Sub3Array4[10].method418(174, 2);
					}
					if (this.anIntArray68[12] != -1 && (this.anInt271 != 12 || anInt297 % 20 < 10)) {
						this.aClass1_Sub1_Sub2_Sub3Array4[11].method418(201, 2);
					}
					if (this.anIntArray68[13] != -1 && (this.anInt271 != 13 || anInt297 % 20 < 10)) {
						this.aClass1_Sub1_Sub2_Sub3Array4[12].method418(226, 2);
					}
				}
				this.aClass35_8.method525(super.aGraphics2, 496, 466);
				this.aClass35_5.method524(this.anInt255);
			}
			if (this.aBoolean45) {
				this.aBoolean45 = false;
				this.aClass35_7.method524(this.anInt255);
				this.aClass1_Sub1_Sub2_Sub3_4.method418(0, 0);
				this.aClass1_Sub1_Sub2_Sub4_2.method448("Public chat", 28, 55, 16777215, true);
				if (this.anInt216 == 0) {
					this.aClass1_Sub1_Sub2_Sub4_2.method448("On", 41, 55, 65280, true);
				}
				if (this.anInt216 == 1) {
					this.aClass1_Sub1_Sub2_Sub4_2.method448("Friends", 41, 55, 16776960, true);
				}
				if (this.anInt216 == 2) {
					this.aClass1_Sub1_Sub2_Sub4_2.method448("Off", 41, 55, 16711680, true);
				}
				if (this.anInt216 == 3) {
					this.aClass1_Sub1_Sub2_Sub4_2.method448("Hide", 41, 55, 65535, true);
				}
				this.aClass1_Sub1_Sub2_Sub4_2.method448("Private chat", 28, 184, 16777215, true);
				if (this.anInt421 == 0) {
					this.aClass1_Sub1_Sub2_Sub4_2.method448("On", 41, 184, 65280, true);
				}
				if (this.anInt421 == 1) {
					this.aClass1_Sub1_Sub2_Sub4_2.method448("Friends", 41, 184, 16776960, true);
				}
				if (this.anInt421 == 2) {
					this.aClass1_Sub1_Sub2_Sub4_2.method448("Off", 41, 184, 16711680, true);
				}
				this.aClass1_Sub1_Sub2_Sub4_2.method448("Trade/compete", 28, 324, 16777215, true);
				if (this.anInt296 == 0) {
					this.aClass1_Sub1_Sub2_Sub4_2.method448("On", 41, 324, 65280, true);
				}
				if (this.anInt296 == 1) {
					this.aClass1_Sub1_Sub2_Sub4_2.method448("Friends", 41, 324, 16776960, true);
				}
				if (this.anInt296 == 2) {
					this.aClass1_Sub1_Sub2_Sub4_2.method448("Off", 41, 324, 16711680, true);
				}
				this.aClass1_Sub1_Sub2_Sub4_2.method448("Report abuse", 33, 458, 16777215, true);
				this.aClass35_7.method525(super.aGraphics2, 0, 453);
				this.aClass35_5.method524(this.anInt255);
			}
			this.anInt208 = 0;
			if (arg0 != -25848) {
				this.aClass1_Sub1_Sub3_4.method470(235);
			}
		} catch (@Pc(1058) RuntimeException local1058) {
			signlink.reporterror("88506, " + arg0 + ", " + local1058.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/String;IIIILjava/lang/String;)Lclient!xb;")
	private Class47 method204(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) String arg4) {
		try {
			@Pc(8) byte[] local8 = null;
			@Pc(10) int local10 = 5;
			try {
				if (this.aClass45Array1[0] != null) {
					local8 = this.aClass45Array1[0].method658(arg3);
				}
			} catch (@Pc(25) Exception local25) {
			}
			@Pc(39) int local39;
			if (local8 != null) {
				this.aCRC32_1.reset();
				this.aCRC32_1.update(local8);
				local39 = (int) this.aCRC32_1.getValue();
				if (local39 != arg2) {
					local8 = null;
				}
			}
			if (local8 != null) {
				return new Class47(20025, local8);
			}
			local39 = 0;
			while (local8 == null) {
				@Pc(60) String local60 = "Unknown error";
				this.method96(arg1, "Requesting " + arg4);
				@Pc(75) int local75;
				try {
					local75 = 0;
					@Pc(86) DataInputStream local86 = this.method169(arg0 + arg2);
					@Pc(89) byte[] local89 = new byte[6];
					local86.readFully(local89, 0, 6);
					@Pc(100) Class1_Sub1_Sub3 local100 = new Class1_Sub1_Sub3(local89, -26728);
					local100.anInt742 = 3;
					@Pc(108) int local108 = local100.method484() + 6;
					@Pc(110) int local110 = 6;
					local8 = new byte[local108];
					for (@Pc(115) int local115 = 0; local115 < 6; local115++) {
						local8[local115] = local89[local115];
					}
					@Pc(133) int local133;
					while (local110 < local108) {
						local133 = local108 - local110;
						if (local133 > 1000) {
							local133 = 1000;
						}
						@Pc(144) int local144 = local86.read(local8, local110, local133);
						if (local144 < 0) {
							(new StringBuffer("Length error: ")).append(local110).append("/").append(local108).toString();
							throw new IOException("EOF");
						}
						local110 += local144;
						@Pc(173) int local173 = local110 * 100 / local108;
						if (local173 != local75) {
							this.method96(arg1, "Loading " + arg4 + " - " + local173 + "%");
						}
						local75 = local173;
					}
					local86.close();
					try {
						if (this.aClass45Array1[0] != null) {
							this.aClass45Array1[0].method659(local8, arg3, local8.length);
						}
					} catch (@Pc(218) Exception local218) {
						this.aClass45Array1[0] = null;
					}
					if (local8 != null) {
						this.aCRC32_1.reset();
						this.aCRC32_1.update(local8);
						local133 = (int) this.aCRC32_1.getValue();
						if (local133 != arg2) {
							local8 = null;
							local39++;
							local60 = "Checksum error: " + local133;
						}
					}
				} catch (@Pc(253) IOException local253) {
					if (local60.equals("Unknown error")) {
						local60 = "Connection error";
					}
					local8 = null;
				} catch (@Pc(263) NullPointerException local263) {
					local60 = "Null error";
					local8 = null;
					if (!signlink.reporterror) {
						return null;
					}
				} catch (@Pc(272) ArrayIndexOutOfBoundsException local272) {
					local60 = "Bounds error";
					local8 = null;
					if (!signlink.reporterror) {
						return null;
					}
				} catch (@Pc(281) Exception local281) {
					local60 = "Unexpected error";
					local8 = null;
					if (!signlink.reporterror) {
						return null;
					}
				}
				if (local8 == null) {
					for (local75 = local10; local75 > 0; local75--) {
						if (local39 >= 3) {
							this.method96(arg1, "Game updated - please reload page");
							local75 = 10;
						} else {
							this.method96(arg1, local60 + " - Retrying in " + local75);
						}
						try {
							Thread.sleep(1000L);
						} catch (@Pc(325) Exception local325) {
						}
					}
					local10 *= 2;
					if (local10 > 60) {
						local10 = 60;
					}
					this.aBoolean74 = !this.aBoolean74;
				}
			}
			return new Class47(20025, local8);
		} catch (@Pc(357) RuntimeException local357) {
			signlink.reporterror("81761, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + 0 + ", " + arg4 + ", " + local357.toString());
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
				return new URL("http://127.0.0.1:" + (anInt348 + 80));
			}
		} catch (@Pc(21) Exception local21) {
		}
		return super.getCodeBase();
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIZII)V")
	private void method205(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		try {
			this.aClass1_Sub1_Sub2_Sub3_12.method418(arg0, arg3);
			this.aClass1_Sub1_Sub2_Sub3_13.method418(arg0, arg3 + arg4 - 16);
			Class1_Sub1_Sub2.method439(arg3 + 16, arg4 - 32, this.anInt321, 16, arg0);
			this.aBoolean54 &= true;
			@Pc(41) int local41 = (arg4 - 32) * arg4 / arg1;
			if (local41 < 8) {
				local41 = 8;
			}
			@Pc(58) int local58 = (arg4 - local41 - 32) * arg2 / (arg1 - arg4);
			Class1_Sub1_Sub2.method439(arg3 + local58 + 16, local41, this.anInt245, 16, arg0);
			Class1_Sub1_Sub2.method444(this.anInt265, local41, arg0, arg3 + local58 + 16);
			Class1_Sub1_Sub2.method444(this.anInt265, local41, arg0 + 1, arg3 + 16 + local58);
			Class1_Sub1_Sub2.method442(arg3 + local58 + 16, arg0, this.anInt265, 16);
			Class1_Sub1_Sub2.method442(arg3 + local58 + 17, arg0, this.anInt265, 16);
			Class1_Sub1_Sub2.method444(this.anInt342, local41, arg0 + 15, arg3 + 16 + local58);
			Class1_Sub1_Sub2.method444(this.anInt342, local41 - 1, arg0 + 14, arg3 + local58 + 17);
			Class1_Sub1_Sub2.method442(arg3 + local58 + local41 + 15, arg0, this.anInt342, 16);
			Class1_Sub1_Sub2.method442(arg3 + local58 + local41 + 14, arg0 + 1, this.anInt342, 15);
		} catch (@Pc(174) RuntimeException local174) {
			signlink.reporterror("44115, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + true + ", " + arg3 + ", " + arg4 + ", " + local174.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "C", descriptor = "(I)V")
	private void method206() {
		try {
			try {
				@Pc(18) int local18 = aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt988 + this.anInt399;
				@Pc(24) int local24 = aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt989 + this.anInt300;
				if (this.anInt219 - local18 < -500 || this.anInt219 - local18 > 500 || this.anInt220 - local24 < -500 || this.anInt220 - local24 > 500) {
					this.anInt219 = local18;
					this.anInt220 = local24;
				}
				if (this.anInt219 != local18) {
					this.anInt219 += (local18 - this.anInt219) / 16;
				}
				if (this.anInt220 != local24) {
					this.anInt220 += (local24 - this.anInt220) / 16;
				}
				if (super.anIntArray30[1] == 1) {
					this.anInt393 += (-this.anInt393 - 24) / 2;
				} else if (super.anIntArray30[2] == 1) {
					this.anInt393 += (24 - this.anInt393) / 2;
				} else {
					this.anInt393 /= 2;
				}
				if (super.anIntArray30[3] == 1) {
					this.anInt394 += (12 - this.anInt394) / 2;
				} else if (super.anIntArray30[4] == 1) {
					this.anInt394 += (-this.anInt394 - 12) / 2;
				} else {
					this.anInt394 /= 2;
				}
				this.anInt392 = this.anInt392 + this.anInt393 / 2 & 0x7FF;
				this.anInt391 += this.anInt394 / 2;
				if (this.anInt391 < 128) {
					this.anInt391 = 128;
				}
				if (this.anInt391 > 383) {
					this.anInt391 = 383;
				}
				@Pc(211) int local211 = this.anInt219 >> 7;
				@Pc(216) int local216 = this.anInt220 >> 7;
				@Pc(226) int local226 = this.method223(this.anInt219, this.anInt246, this.anInt220);
				@Pc(228) int local228 = 0;
				@Pc(244) int local244;
				if (local211 > 3 && local216 > 3 && local211 < 100 && local216 < 100) {
					for (local244 = local211 - 4; local244 <= local211 + 4; local244++) {
						for (@Pc(250) int local250 = local216 - 4; local250 <= local216 + 4; local250++) {
							@Pc(255) int local255 = this.anInt246;
							if (local255 < 3 && (this.aByteArrayArrayArray7[1][local244][local250] & 0x2) == 2) {
								local255++;
							}
							@Pc(282) int local282 = local226 - this.anIntArrayArrayArray5[local255][local244][local250];
							if (local282 > local228) {
								local228 = local282;
							}
						}
					}
				}
				local244 = local228 * 192;
				if (local244 > 98048) {
					local244 = 98048;
				}
				if (local244 < 32768) {
					local244 = 32768;
				}
				if (local244 > this.anInt320) {
					this.anInt320 += (local244 - this.anInt320) / 24;
				} else if (local244 < this.anInt320) {
					this.anInt320 += (local244 - this.anInt320) / 80;
				}
			} catch (@Pc(346) Exception local346) {
				signlink.reporterror("glfc_ex " + aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt988 + "," + aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt989 + "," + this.anInt219 + "," + this.anInt220 + "," + this.anInt225 + "," + this.anInt226 + "," + this.anInt323 + "," + this.anInt324);
				throw new RuntimeException("eek");
			}
		} catch (@Pc(396) RuntimeException local396) {
			signlink.reporterror("27663, " + 7 + ", " + local396.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIIIIIIII)V")
	private void method207(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		try {
			@Pc(1) Class1_Sub2 local1 = null;
			for (@Pc(6) Class1_Sub2 local6 = (Class1_Sub2) this.aClass29_2.method511(); local6 != null; local6 = (Class1_Sub2) this.aClass29_2.method513()) {
				if (local6.anInt780 == arg1 && local6.anInt782 == arg6 && local6.anInt783 == arg3 && local6.anInt781 == arg8) {
					local1 = local6;
					break;
				}
			}
			if (local1 == null) {
				local1 = new Class1_Sub2();
				local1.anInt780 = arg1;
				local1.anInt781 = arg8;
				local1.anInt782 = arg6;
				local1.anInt783 = arg3;
				this.method117(local1);
				this.aClass29_2.method508(local1);
			}
			local1.anInt787 = arg7;
			local1.anInt789 = arg0;
			local1.anInt788 = arg5;
			local1.anInt790 = arg4;
			local1.anInt791 = arg2;
		} catch (@Pc(83) RuntimeException local83) {
			signlink.reporterror("74615, " + arg0 + ", " + arg1 + ", " + 608 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + local83.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "D", descriptor = "(I)V")
	private void method208() {
		try {
			this.aBoolean72 = true;
			try {
				@Pc(9) long local9 = System.currentTimeMillis();
				@Pc(11) int local11 = 0;
				@Pc(13) int local13 = 20;
				while (this.aBoolean51) {
					this.anInt277++;
					this.method179();
					this.method179();
					this.method174();
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
			this.aBoolean72 = false;
		} catch (@Pc(74) RuntimeException local74) {
			signlink.reporterror("67340, " + 177 + ", " + local74.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(JB)V")
	private void method209(@OriginalArg(0) long arg0) {
		try {
			if (arg0 != 0L) {
				for (@Pc(8) int local8 = 0; local8 < this.anInt409; local8++) {
					if (this.aLongArray3[local8] == arg0) {
						this.anInt409--;
						this.aBoolean53 = true;
						for (@Pc(28) int local28 = local8; local28 < this.anInt409; local28++) {
							this.aStringArray6[local28] = this.aStringArray6[local28 + 1];
							this.anIntArray49[local28] = this.anIntArray49[local28 + 1];
							this.aLongArray3[local28] = this.aLongArray3[local28 + 1];
						}
						this.aClass1_Sub1_Sub3_4.method469(160);
						this.aClass1_Sub1_Sub3_4.method476(arg0);
						break;
					}
				}
			}
		} catch (@Pc(95) RuntimeException local95) {
			signlink.reporterror("33495, " + arg0 + ", " + -51 + ", " + local95.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "p", descriptor = "(Z)V")
	private void method210() {
		try {
			try {
				if (this.aClass8_1 != null) {
					this.aClass8_1.method247();
				}
			} catch (@Pc(7) Exception local7) {
			}
			this.aClass8_1 = null;
			this.aBoolean54 = false;
			this.anInt343 = 0;
			this.aString6 = "";
			this.aString7 = "";
			this.method110();
			this.aClass37_1.method530(this.anInt398);
			for (@Pc(36) int local36 = 0; local36 < 4; local36++) {
				this.aClass19Array1[local36].method420(anInt395);
			}
			System.gc();
			this.method130();
			this.anInt302 = -1;
			this.anInt357 = -1;
			this.anInt295 = 0;
		} catch (@Pc(63) RuntimeException local63) {
			signlink.reporterror("61935, " + true + ", " + local63.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "g", descriptor = "(II)V")
	private void method211(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
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
			this.aClass1_Sub1_Sub2_Sub2_6.method386(this.anInt255);
			@Pc(147) int local147;
			for (@Pc(143) int local143 = 1; local143 < 103; local143++) {
				for (local147 = 1; local147 < 103; local147++) {
					if ((this.aByteArrayArrayArray7[arg1][local147][local143] & 0x18) == 0) {
						this.method191(local147, local143, local36, local34, arg1, this.aByte5);
					}
					if (arg1 < 3 && (this.aByteArrayArrayArray7[arg1 + 1][local147][local143] & 0x8) != 0) {
						this.method191(local147, local143, local36, local34, arg1 + 1, this.aByte5);
					}
				}
			}
			this.anInt368 += arg0;
			this.aClass35_5.method524(this.anInt255);
			this.anInt336 = 0;
			for (local147 = 0; local147 < 104; local147++) {
				for (@Pc(224) int local224 = 0; local224 < 104; local224++) {
					@Pc(234) int local234 = this.aClass37_1.method559(this.anInt246, local147, local224);
					if (local234 != 0) {
						local234 = local234 >> 14 & 0x7FFF;
						@Pc(246) int local246 = Class9.method288(local234).anInt517;
						if (local246 >= 0) {
							@Pc(250) int local250 = local147;
							@Pc(252) int local252 = local224;
							if (local246 != 22 && local246 != 29 && local246 != 34 && local246 != 36 && local246 != 46 && local246 != 47 && local246 != 48) {
								@Pc(284) int[][] local284 = this.aClass19Array1[this.anInt246].anIntArrayArray18;
								for (@Pc(286) int local286 = 0; local286 < 10; local286++) {
									@Pc(293) int local293 = (int) (Math.random() * 4.0D);
									if (local293 == 0 && local250 > 0 && local250 > local147 - 3 && (local284[local250 - 1][local252] & 0x280108) == 0) {
										local250--;
									}
									if (local293 == 1 && local250 < 103 && local250 < local147 + 3 && (local284[local250 + 1][local252] & 0x280180) == 0) {
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
							this.aClass1_Sub1_Sub2_Sub2Array5[this.anInt336] = this.aClass1_Sub1_Sub2_Sub2Array6[local246];
							this.anIntArray66[this.anInt336] = local250;
							this.anIntArray67[this.anInt336] = local252;
							this.anInt336++;
						}
					}
				}
			}
			anInt235++;
			if (anInt235 > 112) {
				anInt235 = 0;
				this.aClass1_Sub1_Sub3_4.method469(164);
				this.aClass1_Sub1_Sub3_4.method470(50);
			}
		} catch (@Pc(441) RuntimeException local441) {
			signlink.reporterror("37102, " + arg0 + ", " + arg1 + ", " + local441.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IZ)V")
	private void method212(@OriginalArg(0) int arg0) {
		try {
			@Pc(6) Class6 local6 = Class6.aClass6Array1[arg0];
			for (@Pc(8) int local8 = 0; local8 < local6.anIntArray98.length && local6.anIntArray98[local8] != -1; local8++) {
				@Pc(23) Class6 local23 = Class6.aClass6Array1[local6.anIntArray98[local8]];
				if (local23.anInt434 == 1) {
					this.method212(local23.anInt432);
				}
				local23.anInt430 = 0;
				local23.anInt431 = 0;
			}
		} catch (@Pc(46) RuntimeException local46) {
			signlink.reporterror("11137, " + arg0 + ", " + false + ", " + local46.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "E", descriptor = "(I)Ljava/lang/String;")
	private String method213() {
		try {
			if (signlink.mainapp == null) {
				return super.aFrame_Sub1_2 == null ? super.getDocumentBase().getHost().toLowerCase() : "runescape.com";
			} else {
				return signlink.mainapp.getDocumentBase().getHost().toLowerCase();
			}
		} catch (@Pc(22) RuntimeException local22) {
			signlink.reporterror("10949, " + 252 + ", " + local22.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IBIILclient!d;)V")
	private void method214(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class6 arg3) {
		try {
			if (arg3.anInt434 == 0 && arg3.anIntArray98 != null && (!arg3.aBoolean92 || this.anInt254 == arg3.anInt432 || this.anInt345 == arg3.anInt432 || this.anInt236 == arg3.anInt432)) {
				@Pc(29) int local29 = Class1_Sub1_Sub2.anInt699;
				@Pc(31) int local31 = Class1_Sub1_Sub2.anInt697;
				@Pc(33) int local33 = Class1_Sub1_Sub2.anInt700;
				@Pc(35) int local35 = Class1_Sub1_Sub2.anInt698;
				Class1_Sub1_Sub2.method436(arg0, arg0 + arg3.anInt437, arg2, arg2 + arg3.anInt438);
				@Pc(51) int local51 = arg3.anIntArray98.length;
				for (@Pc(53) int local53 = 0; local53 < local51; local53++) {
					@Pc(62) int local62 = arg3.anIntArray99[local53] + arg0;
					@Pc(71) int local71 = arg3.anIntArray100[local53] + arg2 - arg1;
					@Pc(78) Class6 local78 = Class6.aClass6Array1[arg3.anIntArray98[local53]];
					@Pc(83) int local83 = local62 + local78.anInt439;
					@Pc(88) int local88 = local71 + local78.anInt440;
					if (local78.anInt436 > 0) {
						this.method119(local78);
					}
					if (local78.anInt434 == 0) {
						if (local78.anInt443 > local78.anInt442 - local78.anInt438) {
							local78.anInt443 = local78.anInt442 - local78.anInt438;
						}
						if (local78.anInt443 < 0) {
							local78.anInt443 = 0;
						}
						this.method214(local83, local78.anInt443, local88, local78);
						if (local78.anInt442 > local78.anInt438) {
							this.method205(local83 + local78.anInt437, local78.anInt442, local78.anInt443, local88, local78.anInt438);
						}
					} else if (local78.anInt434 != 1) {
						@Pc(160) int local160;
						@Pc(164) int local164;
						@Pc(175) int local175;
						@Pc(210) int local210;
						@Pc(217) int local217;
						@Pc(158) int local158;
						@Pc(208) int local208;
						if (local78.anInt434 == 2) {
							local158 = 0;
							for (local160 = 0; local160 < local78.anInt438; local160++) {
								for (local164 = 0; local164 < local78.anInt437; local164++) {
									local175 = local83 + local164 * (local78.anInt445 + 32);
									@Pc(184) int local184 = local88 + local160 * (local78.anInt446 + 32);
									if (local158 < 20) {
										local175 += local78.anIntArray101[local158];
										local184 += local78.anIntArray102[local158];
									}
									if (local78.anIntArray94[local158] > 0) {
										local208 = 0;
										local210 = 0;
										local217 = local78.anIntArray94[local158] - 1;
										if (local175 > Class1_Sub1_Sub2.anInt699 - 32 && local175 < Class1_Sub1_Sub2.anInt700 && local184 > Class1_Sub1_Sub2.anInt697 - 32 && local184 < Class1_Sub1_Sub2.anInt698 || this.anInt404 != 0 && this.anInt403 == local158) {
											@Pc(242) int local242 = 0;
											if (this.anInt227 == 1 && this.anInt228 == local158 && this.anInt229 == local78.anInt432) {
												local242 = 16777215;
											}
											@Pc(267) Class1_Sub1_Sub2_Sub2 local267 = Class15.method367(local78.anIntArray95[local158], this.anInt306, local242, local217);
											if (local267 != null) {
												@Pc(346) int local346;
												if (this.anInt404 != 0 && this.anInt403 == local158 && this.anInt402 == local78.anInt432) {
													local208 = super.anInt197 - this.anInt405;
													local210 = super.anInt198 - this.anInt406;
													if (local208 < 5 && local208 > -5) {
														local208 = 0;
													}
													if (local210 < 5 && local210 > -5) {
														local210 = 0;
													}
													if (this.anInt303 < 5) {
														local208 = 0;
														local210 = 0;
													}
													local267.method393(local184 + local210, local175 + local208);
													if (local184 + local210 < Class1_Sub1_Sub2.anInt697 && arg3.anInt443 > 0) {
														local346 = this.anInt208 * (Class1_Sub1_Sub2.anInt697 - local184 - local210) / 3;
														if (local346 > this.anInt208 * 10) {
															local346 = this.anInt208 * 10;
														}
														if (local346 > arg3.anInt443) {
															local346 = arg3.anInt443;
														}
														arg3.anInt443 -= local346;
														this.anInt406 += local346;
													}
													if (local184 + local210 + 32 > Class1_Sub1_Sub2.anInt698 && arg3.anInt443 < arg3.anInt442 - arg3.anInt438) {
														local346 = this.anInt208 * (local184 + local210 + 32 - Class1_Sub1_Sub2.anInt698) / 3;
														if (local346 > this.anInt208 * 10) {
															local346 = this.anInt208 * 10;
														}
														if (local346 > arg3.anInt442 - arg3.anInt438 - arg3.anInt443) {
															local346 = arg3.anInt442 - arg3.anInt438 - arg3.anInt443;
														}
														arg3.anInt443 += local346;
														this.anInt406 -= local346;
													}
												} else if (this.anInt252 != 0 && this.anInt251 == local158 && this.anInt250 == local78.anInt432) {
													local267.method393(local184, local175);
												} else {
													local267.method391(local175, local184);
												}
												if (local267.anInt656 == 33 || local78.anIntArray95[local158] != 1) {
													local346 = local78.anIntArray95[local158];
													this.aClass1_Sub1_Sub2_Sub4_1.method451(method105(local346), local175 + local208 + 1, 0, local184 + local210 + 10);
													this.aClass1_Sub1_Sub2_Sub4_1.method451(method105(local346), local175 + local208, 16776960, local184 + local210 + 9);
												}
											}
										}
									} else if (local78.aClass1_Sub1_Sub2_Sub2Array8 != null && local158 < 20) {
										@Pc(535) Class1_Sub1_Sub2_Sub2 local535 = local78.aClass1_Sub1_Sub2_Sub2Array8[local158];
										if (local535 != null) {
											local535.method391(local175, local184);
										}
									}
									local158++;
								}
							}
						} else if (local78.anInt434 == 3) {
							@Pc(560) boolean local560 = false;
							if (this.anInt236 == local78.anInt432 || this.anInt345 == local78.anInt432 || this.anInt254 == local78.anInt432) {
								local560 = true;
							}
							if (this.method168(local78)) {
								local158 = local78.anInt448;
								if (local560 && local78.anInt450 != 0) {
									local158 = local78.anInt450;
								}
							} else {
								local158 = local78.anInt447;
								if (local560 && local78.anInt449 != 0) {
									local158 = local78.anInt449;
								}
							}
							if (local78.aByte10 == 0) {
								if (local78.aBoolean98) {
									Class1_Sub1_Sub2.method439(local88, local78.anInt438, local158, local78.anInt437, local83);
								} else {
									Class1_Sub1_Sub2.method440(local83, local88, local78.anInt437, local158, local78.anInt438);
								}
							} else if (local78.aBoolean98) {
								Class1_Sub1_Sub2.method438(local78.anInt437, local88, local78.anInt438, local83, 256 - (local78.aByte10 & 0xFF), local158);
							} else {
								Class1_Sub1_Sub2.method441(local158, local88, 256 - (local78.aByte10 & 0xFF), local78.anInt438, local83, local78.anInt437);
							}
						} else {
							@Pc(678) Class1_Sub1_Sub2_Sub4 local678;
							if (local78.anInt434 == 4) {
								local678 = local78.aClass1_Sub1_Sub2_Sub4_5;
								@Pc(681) String local681 = local78.aString18;
								@Pc(683) boolean local683 = false;
								if (this.anInt236 == local78.anInt432 || this.anInt345 == local78.anInt432 || this.anInt254 == local78.anInt432) {
									local683 = true;
								}
								if (this.method168(local78)) {
									local160 = local78.anInt448;
									if (local683 && local78.anInt450 != 0) {
										local160 = local78.anInt450;
									}
									if (local78.aString19.length() > 0) {
										local681 = local78.aString19;
									}
								} else {
									local160 = local78.anInt447;
									if (local683 && local78.anInt449 != 0) {
										local160 = local78.anInt449;
									}
								}
								if (local78.anInt435 == 6 && this.aBoolean49) {
									local681 = "Please wait...";
									local160 = local78.anInt447;
								}
								if (Class1_Sub1_Sub2.anInt695 == 479) {
									if (local160 == 16776960) {
										local160 = 255;
									}
									if (local160 == 49152) {
										local160 = 16777215;
									}
								}
								local208 = local88 + local678.anInt711;
								while (local681.length() > 0) {
									if (local681.indexOf("%") != -1) {
										label348: while (true) {
											local210 = local681.indexOf("%1");
											if (local210 == -1) {
												while (true) {
													local210 = local681.indexOf("%2");
													if (local210 == -1) {
														while (true) {
															local210 = local681.indexOf("%3");
															if (local210 == -1) {
																while (true) {
																	local210 = local681.indexOf("%4");
																	if (local210 == -1) {
																		while (true) {
																			local210 = local681.indexOf("%5");
																			if (local210 == -1) {
																				break label348;
																			}
																			local681 = local681.substring(0, local210) + this.method142(this.method101(local78, 4)) + local681.substring(local210 + 2);
																		}
																	}
																	local681 = local681.substring(0, local210) + this.method142(this.method101(local78, 3)) + local681.substring(local210 + 2);
																}
															}
															local681 = local681.substring(0, local210) + this.method142(this.method101(local78, 2)) + local681.substring(local210 + 2);
														}
													}
													local681 = local681.substring(0, local210) + this.method142(this.method101(local78, 1)) + local681.substring(local210 + 2);
												}
											}
											local681 = local681.substring(0, local210) + this.method142(this.method101(local78, 0)) + local681.substring(local210 + 2);
										}
									}
									local210 = local681.indexOf("\\n");
									@Pc(955) String local955;
									if (local210 == -1) {
										local955 = local681;
										local681 = "";
									} else {
										local955 = local681.substring(0, local210);
										local681 = local681.substring(local210 + 2);
									}
									if (local78.aBoolean99) {
										local678.method448(local955, local208, local83 + local78.anInt437 / 2, local160, local78.aBoolean100);
									} else {
										local678.method455(local955, local160, local83, local78.aBoolean100, local208);
									}
									local208 += local678.anInt711;
								}
							} else if (local78.anInt434 == 5) {
								@Pc(1016) Class1_Sub1_Sub2_Sub2 local1016;
								if (this.method168(local78)) {
									local1016 = local78.aClass1_Sub1_Sub2_Sub2_15;
								} else {
									local1016 = local78.aClass1_Sub1_Sub2_Sub2_14;
								}
								if (local1016 != null) {
									local1016.method391(local83, local88);
								}
							} else if (local78.anInt434 == 6) {
								local158 = Class1_Sub1_Sub2_Sub1.anInt595;
								local160 = Class1_Sub1_Sub2_Sub1.anInt596;
								Class1_Sub1_Sub2_Sub1.anInt595 = local83 + local78.anInt437 / 2;
								Class1_Sub1_Sub2_Sub1.anInt596 = local88 + local78.anInt438 / 2;
								local164 = Class1_Sub1_Sub2_Sub1.anIntArray178[local78.anInt458] * local78.anInt457 >> 16;
								local175 = Class1_Sub1_Sub2_Sub1.anIntArray179[local78.anInt458] * local78.anInt457 >> 16;
								@Pc(1077) boolean local1077 = this.method168(local78);
								if (local1077) {
									local208 = local78.anInt456;
								} else {
									local208 = local78.anInt455;
								}
								@Pc(1097) Class1_Sub1_Sub1_Sub5 local1097;
								if (local208 == -1) {
									local1097 = local78.method233(-1, local1077, -1);
								} else {
									@Pc(1103) Class27 local1103 = Class27.aClass27Array1[local208];
									local1097 = local78.method233(local1103.anIntArray226[local78.anInt430], local1077, local1103.anIntArray225[local78.anInt430]);
								}
								if (local1097 != null) {
									local1097.method281(local78.anInt459, 0, local78.anInt458, 0, local164, local175);
								}
								Class1_Sub1_Sub2_Sub1.anInt595 = local158;
								Class1_Sub1_Sub2_Sub1.anInt596 = local160;
							} else if (local78.anInt434 == 7) {
								local678 = local78.aClass1_Sub1_Sub2_Sub4_5;
								local160 = 0;
								for (local164 = 0; local164 < local78.anInt438; local164++) {
									for (local175 = 0; local175 < local78.anInt437; local175++) {
										if (local78.anIntArray94[local160] > 0) {
											@Pc(1167) Class15 local1167 = Class15.method361(local78.anIntArray94[local160] - 1);
											@Pc(1170) String local1170 = local1167.aString25;
											if (local1167.aBoolean153 || local78.anIntArray95[local160] != 1) {
												local1170 = local1170 + " x" + method98(local78.anIntArray95[local160]);
											}
											local210 = local83 + local175 * (local78.anInt445 + 115);
											local217 = local88 + local164 * (local78.anInt446 + 12);
											if (local78.aBoolean99) {
												local678.method448(local1170, local217, local210 + local78.anInt437 / 2, local78.anInt447, local78.aBoolean100);
											} else {
												local678.method455(local1170, local78.anInt447, local210, local78.aBoolean100, local217);
											}
										}
										local160++;
									}
								}
							}
						}
					}
				}
				Class1_Sub1_Sub2.method436(local29, local33, local31, local35);
			}
		} catch (@Pc(1272) RuntimeException local1272) {
			signlink.reporterror("61932, " + arg0 + ", " + 7 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local1272.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "F", descriptor = "(I)V")
	private void method215() {
		try {
			while (true) {
				@Pc(11) Class1_Sub1_Sub4 local11 = this.aClass44_Sub1_1.method647();
				if (local11 == null) {
					return;
				}
				if (local11.anInt770 == 0) {
					Class1_Sub1_Sub1_Sub5.method259(local11.anInt771, local11.aByteArray10);
					if ((this.aClass44_Sub1_1.method643(local11.anInt771) & 0x62) != 0) {
						this.aBoolean53 = true;
						if (this.anInt217 != -1) {
							this.aBoolean59 = true;
						}
					}
				}
				if (local11.anInt770 == 1 && local11.aByteArray10 != null) {
					Class12.method303(local11.aByteArray10);
				}
				if (local11.anInt770 == 2 && local11.anInt771 == this.anInt357 && local11.aByteArray10 != null) {
					this.method226(this.anInt401, this.aBoolean73, local11.aByteArray10);
				}
				if (local11.anInt770 == 3 && this.anInt353 == 1) {
					for (@Pc(83) int local83 = 0; local83 < this.aByteArrayArray2.length; local83++) {
						if (this.anIntArray44[local83] == local11.anInt771) {
							this.aByteArrayArray2[local83] = local11.aByteArray10;
							if (local11.aByteArray10 == null) {
								this.anIntArray44[local83] = -1;
							}
							break;
						}
						if (this.anIntArray45[local83] == local11.anInt771) {
							this.aByteArrayArray1[local83] = local11.aByteArray10;
							if (local11.aByteArray10 == null) {
								this.anIntArray45[local83] = -1;
							}
							break;
						}
					}
				}
				if (local11.anInt770 == 93 && this.aClass44_Sub1_1.method642(local11.anInt771)) {
					Class4.method59(new Class1_Sub1_Sub3(local11.aByteArray10, -26728), this.aClass44_Sub1_1);
				}
			}
		} catch (@Pc(160) RuntimeException local160) {
			signlink.reporterror("45168, " + -424 + ", " + local160.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "G", descriptor = "(I)I")
	private int method216() {
		try {
			@Pc(3) int local3 = 3;
			if (this.anInt384 < 310) {
				@Pc(17) int local17 = this.anInt381 >> 7;
				@Pc(22) int local22 = this.anInt383 >> 7;
				@Pc(27) int local27 = aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt988 >> 7;
				@Pc(32) int local32 = aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt989 >> 7;
				if ((this.aByteArrayArrayArray7[this.anInt246][local17][local22] & 0x4) != 0) {
					local3 = this.anInt246;
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
						if ((this.aByteArrayArrayArray7[this.anInt246][local17][local22] & 0x4) != 0) {
							local3 = this.anInt246;
						}
						local84 += local82;
						if (local84 >= 65536) {
							local84 -= 65536;
							if (local22 < local32) {
								local22++;
							} else if (local22 > local32) {
								local22--;
							}
							if ((this.aByteArrayArrayArray7[this.anInt246][local17][local22] & 0x4) != 0) {
								local3 = this.anInt246;
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
						if ((this.aByteArrayArrayArray7[this.anInt246][local17][local22] & 0x4) != 0) {
							local3 = this.anInt246;
						}
						local84 += local82;
						if (local84 >= 65536) {
							local84 -= 65536;
							if (local17 < local27) {
								local17++;
							} else if (local17 > local27) {
								local17--;
							}
							if ((this.aByteArrayArrayArray7[this.anInt246][local17][local22] & 0x4) != 0) {
								local3 = this.anInt246;
							}
						}
					}
				}
			}
			if ((this.aByteArrayArrayArray7[this.anInt246][aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt988 >> 7][aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt989 >> 7] & 0x4) != 0) {
				local3 = this.anInt246;
			}
			return local3;
		} catch (@Pc(249) RuntimeException local249) {
			signlink.reporterror("96027, " + -32745 + ", " + local249.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "q", descriptor = "(Z)I")
	private int method217(@OriginalArg(0) boolean arg0) {
		try {
			if (arg0) {
				this.anInt369 = -1;
			}
			@Pc(14) int local14 = this.method223(this.anInt381, this.anInt246, this.anInt383);
			return local14 - this.anInt382 >= 800 || (this.aByteArrayArrayArray7[this.anInt246][this.anInt381 >> 7][this.anInt383 >> 7] & 0x4) == 0 ? 3 : this.anInt246;
		} catch (@Pc(44) RuntimeException local44) {
			signlink.reporterror("71123, " + arg0 + ", " + local44.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(IB)V")
	private void method218(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		try {
			@Pc(4) int local4 = Class39.aClass39Array1[arg0].anInt892;
			if (arg1 != -43) {
				this.anInt369 = this.aClass1_Sub1_Sub3_3.method480();
			}
			if (local4 != 0) {
				@Pc(20) int local20 = this.anIntArray50[arg0];
				if (local4 == 1) {
					if (local20 == 1) {
						Class1_Sub1_Sub2_Sub1.method351(anInt309, 0.9D);
					}
					if (local20 == 2) {
						Class1_Sub1_Sub2_Sub1.method351(anInt309, 0.8D);
					}
					if (local20 == 3) {
						Class1_Sub1_Sub2_Sub1.method351(anInt309, 0.7D);
					}
					if (local20 == 4) {
						Class1_Sub1_Sub2_Sub1.method351(anInt309, 0.6D);
					}
					Class15.aClass40_8.method593();
					this.aBoolean61 = true;
				}
				if (local4 == 3) {
					@Pc(58) boolean local58 = this.aBoolean79;
					if (local20 == 0) {
						this.method185(this.aBoolean79, 0);
						this.aBoolean79 = true;
					}
					if (local20 == 1) {
						this.method185(this.aBoolean79, -400);
						this.aBoolean79 = true;
					}
					if (local20 == 2) {
						this.method185(this.aBoolean79, -800);
						this.aBoolean79 = true;
					}
					if (local20 == 3) {
						this.method185(this.aBoolean79, -1200);
						this.aBoolean79 = true;
					}
					if (local20 == 4) {
						this.aBoolean79 = false;
					}
					if (this.aBoolean79 != local58 && !aBoolean71) {
						if (this.aBoolean79) {
							this.anInt357 = this.anInt302;
							this.aBoolean73 = true;
							this.aClass44_Sub1_1.method645(2, this.anInt357);
						} else {
							this.method130();
						}
						this.anInt295 = 0;
					}
				}
				if (local4 == 4) {
					if (local20 == 0) {
						this.aBoolean77 = true;
						this.method129((byte) 1, 0);
					}
					if (local20 == 1) {
						this.aBoolean77 = true;
						this.method129((byte) 1, -400);
					}
					if (local20 == 2) {
						this.aBoolean77 = true;
						this.method129((byte) 1, -800);
					}
					if (local20 == 3) {
						this.aBoolean77 = true;
						this.method129((byte) 1, -1200);
					}
					if (local20 == 4) {
						this.aBoolean77 = false;
					}
				}
				if (local4 == 5) {
					this.anInt266 = local20;
				}
				if (local4 == 6) {
					this.anInt308 = local20;
				}
				if (local4 == 8) {
					this.anInt359 = local20;
					this.aBoolean59 = true;
				}
				if (local4 == 9) {
					this.anInt231 = local20;
				}
			}
		} catch (@Pc(218) RuntimeException local218) {
			signlink.reporterror("83025, " + arg0 + ", " + arg1 + ", " + local218.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "H", descriptor = "(I)V")
	private void method219() {
		try {
			@Pc(11) int local11;
			for (@Pc(3) int local3 = -1; local3 < this.anInt332; local3++) {
				if (local3 == -1) {
					local11 = this.anInt331;
				} else {
					local11 = this.anIntArray64[local3];
				}
				@Pc(23) Class1_Sub1_Sub1_Sub1_Sub1 local23 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local11];
				if (local23 != null && local23.anInt999 > 0) {
					local23.anInt999--;
					if (local23.anInt999 == 0) {
						local23.aString31 = null;
					}
				}
			}
			if (this.anInt294 != -22129) {
				this.aClass1_Sub1_Sub3_4.method470(232);
			}
			for (local11 = 0; local11 < this.anInt424; local11++) {
				@Pc(62) int local62 = this.anIntArray92[local11];
				@Pc(67) Class1_Sub1_Sub1_Sub1_Sub2 local67 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local62];
				if (local67 != null && local67.anInt999 > 0) {
					local67.anInt999--;
					if (local67.anInt999 == 0) {
						local67.aString31 = null;
					}
				}
			}
		} catch (@Pc(91) RuntimeException local91) {
			signlink.reporterror("87732, " + -22129 + ", " + local91.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "I", descriptor = "(I)V")
	private void method220() {
		try {
			@Pc(7) byte[] local7 = this.aClass47_1.method666("title.dat", null);
			@Pc(13) Class1_Sub1_Sub2_Sub2 local13 = new Class1_Sub1_Sub2_Sub2(local7, this);
			this.aClass35_22.method524(this.anInt255);
			local13.method389(0, 0);
			this.aClass35_23.method524(this.anInt255);
			local13.method389(-637, 0);
			this.aClass35_19.method524(this.anInt255);
			local13.method389(-128, 0);
			this.aClass35_20.method524(this.anInt255);
			local13.method389(-202, -371);
			this.aClass35_21.method524(this.anInt255);
			local13.method389(-202, -171);
			this.aClass35_24.method524(this.anInt255);
			local13.method389(0, -265);
			this.aClass35_25.method524(this.anInt255);
			local13.method389(-562, -265);
			this.aClass35_26.method524(this.anInt255);
			local13.method389(-128, -171);
			this.aClass35_27.method524(this.anInt255);
			local13.method389(-562, -171);
			@Pc(115) int[] local115 = new int[local13.anInt652];
			for (@Pc(117) int local117 = 0; local117 < local13.anInt653; local117++) {
				for (@Pc(121) int local121 = 0; local121 < local13.anInt652; local121++) {
					local115[local121] = local13.anIntArray208[local13.anInt652 + local13.anInt652 * local117 - local121 - 1];
				}
				for (@Pc(147) int local147 = 0; local147 < local13.anInt652; local147++) {
					local13.anIntArray208[local147 + local13.anInt652 * local117] = local115[local147];
				}
			}
			this.aClass35_22.method524(this.anInt255);
			local13.method389(382, 0);
			this.aClass35_23.method524(this.anInt255);
			local13.method389(-255, 0);
			this.aClass35_19.method524(this.anInt255);
			local13.method389(254, 0);
			this.aClass35_20.method524(this.anInt255);
			local13.method389(180, -371);
			this.aClass35_21.method524(this.anInt255);
			local13.method389(180, -171);
			this.aClass35_24.method524(this.anInt255);
			local13.method389(382, -265);
			this.aClass35_25.method524(this.anInt255);
			local13.method389(-180, -265);
			this.aClass35_26.method524(this.anInt255);
			local13.method389(254, -171);
			this.aClass35_27.method524(this.anInt255);
			local13.method389(-180, -171);
			local13 = new Class1_Sub1_Sub2_Sub2(this.aClass47_1, "logo", 0);
			this.aClass35_19.method524(this.anInt255);
			local13.method391(382 - local13.anInt652 / 2 - 128, 18);
			System.gc();
		} catch (@Pc(295) RuntimeException local295) {
			signlink.reporterror("72074, " + 21480 + ", " + local295.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "J", descriptor = "(I)V")
	private void method222(@OriginalArg(0) int arg0) {
		try {
			if (this.anInt404 == 0) {
				this.aStringArray4[0] = "Cancel";
				this.anIntArray39[0] = 1106;
				this.anInt322 = 1;
				this.method159();
				this.anInt213 = 0;
				if (super.anInt197 > 4 && super.anInt198 > 4 && super.anInt197 < 516 && super.anInt198 < 338) {
					if (this.anInt378 == -1) {
						this.method133();
					} else {
						this.method194(4, Class6.aClass6Array1[this.anInt378], super.anInt198, 4, 0, super.anInt197);
					}
				}
				if (this.anInt213 != this.anInt254) {
					this.anInt254 = this.anInt213;
				}
				this.anInt213 = 0;
				if (super.anInt197 > 553 && super.anInt198 > 205 && super.anInt197 < 743 && super.anInt198 < 466) {
					if (this.anInt376 != -1) {
						this.method194(205, Class6.aClass6Array1[this.anInt376], super.anInt198, 553, 0, super.anInt197);
					} else if (this.anIntArray68[this.anInt334] != -1) {
						this.method194(205, Class6.aClass6Array1[this.anIntArray68[this.anInt334]], super.anInt198, 553, 0, super.anInt197);
					}
				}
				if (this.anInt213 != this.anInt345) {
					this.aBoolean53 = true;
					this.anInt345 = this.anInt213;
				}
				this.anInt213 = 0;
				@Pc(154) boolean local154 = false;
				if (super.anInt197 > 17 && super.anInt198 > 357 && super.anInt197 < 496 && super.anInt198 < 453) {
					if (this.anInt217 != -1) {
						this.method194(357, Class6.aClass6Array1[this.anInt217], super.anInt198, 17, 0, super.anInt197);
					} else if (super.anInt198 < 434 && super.anInt197 < 426) {
						this.method161(super.anInt198 - 357, super.anInt197 - 17);
					}
				}
				if (this.anInt217 != -1 && this.anInt213 != this.anInt236) {
					this.aBoolean59 = true;
					this.anInt236 = this.anInt213;
				}
				@Pc(227) boolean local227 = false;
				while (!local227) {
					local227 = true;
					for (@Pc(233) int local233 = 0; local233 < this.anInt322 - 1; local233++) {
						if (this.anIntArray39[local233] < 1000 && this.anIntArray39[local233 + 1] > 1000) {
							@Pc(254) String local254 = this.aStringArray4[local233];
							this.aStringArray4[local233] = this.aStringArray4[local233 + 1];
							this.aStringArray4[local233 + 1] = local254;
							@Pc(276) int local276 = this.anIntArray39[local233];
							this.anIntArray39[local233] = this.anIntArray39[local233 + 1];
							this.anIntArray39[local233 + 1] = local276;
							@Pc(298) int local298 = this.anIntArray37[local233];
							this.anIntArray37[local233] = this.anIntArray37[local233 + 1];
							this.anIntArray37[local233 + 1] = local298;
							@Pc(320) int local320 = this.anIntArray38[local233];
							this.anIntArray38[local233] = this.anIntArray38[local233 + 1];
							this.anIntArray38[local233 + 1] = local320;
							@Pc(342) int local342 = this.anIntArray40[local233];
							this.anIntArray40[local233] = this.anIntArray40[local233 + 1];
							this.anIntArray40[local233 + 1] = local342;
							local227 = false;
						}
					}
				}
			}
		} catch (@Pc(372) RuntimeException local372) {
			signlink.reporterror("76110, " + arg0 + ", " + local372.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(IIII)I")
	private int method223(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		try {
			@Pc(9) int local9 = arg0 >> 7;
			@Pc(13) int local13 = arg2 >> 7;
			if (local9 < 0 || local13 < 0 || local9 > 103 || local13 > 103) {
				return 0;
			}
			@Pc(27) int local27 = arg1;
			if (arg1 < 3 && (this.aByteArrayArrayArray7[1][local9][local13] & 0x2) == 2) {
				local27 = arg1 + 1;
			}
			@Pc(47) int local47 = arg0 & 0x7F;
			@Pc(51) int local51 = arg2 & 0x7F;
			@Pc(79) int local79 = this.anIntArrayArrayArray5[local27][local9][local13] * (128 - local47) + this.anIntArrayArrayArray5[local27][local9 + 1][local13] * local47 >> 7;
			@Pc(111) int local111 = this.anIntArrayArrayArray5[local27][local9][local13 + 1] * (128 - local47) + this.anIntArrayArrayArray5[local27][local9 + 1][local13 + 1] * local47 >> 7;
			return local79 * (128 - local51) + local111 * local51 >> 7;
		} catch (@Pc(124) RuntimeException local124) {
			signlink.reporterror("13568, " + arg0 + ", " + arg1 + ", " + -576 + ", " + arg2 + ", " + local124.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(B)V")
	@Override
	protected void method92(@OriginalArg(0) byte arg0) {
		try {
			@Pc(6) boolean local6 = false;
			if (this.aBoolean83 || this.aBoolean85 || this.aBoolean46) {
				this.method106();
			} else {
				anInt279++;
				if (this.aBoolean54) {
					this.method203(this.anInt386);
				} else {
					this.method186(false);
				}
				this.anInt335 = 0;
			}
		} catch (@Pc(50) RuntimeException local50) {
			signlink.reporterror("74603, " + arg0 + ", " + local50.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(I)V")
	@Override
	protected void method93(@OriginalArg(0) int arg0) {
		try {
			@Pc(3) int local3 = 9 / arg0;
			this.aBoolean61 = true;
		} catch (@Pc(8) RuntimeException local8) {
			signlink.reporterror("68906, " + arg0 + ", " + local8.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "init", descriptor = "()V")
	@Override
	public void init() {
		anInt347 = Integer.parseInt(this.getParameter("nodeid"));
		anInt348 = Integer.parseInt(this.getParameter("portoff"));
		@Pc(15) String local15 = this.getParameter("lowmem");
		if (local15 != null && local15.equals("1")) {
			method126();
		} else {
			method164();
		}
		@Pc(31) String local31 = this.getParameter("free");
		if (local31 != null && local31.equals("1")) {
			aBoolean70 = false;
		} else {
			aBoolean70 = true;
		}
		this.method85();
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(ILclient!lb;B)V")
	private void method224(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub1_Sub3 arg1) {
		try {
			for (@Pc(13) int local13 = 0; local13 < this.anInt333; local13++) {
				@Pc(20) int local20 = this.anIntArray65[local13];
				@Pc(25) Class1_Sub1_Sub1_Sub1_Sub1 local25 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local20];
				@Pc(28) int local28 = arg1.method480();
				if ((local28 & 0x80) == 128) {
					local28 += arg1.method480() << 8;
				}
				this.method140(arg1, local25, local28, local20);
			}
		} catch (@Pc(54) RuntimeException local54) {
			signlink.reporterror("30305, " + arg0 + ", " + arg1 + ", " + 5 + ", " + local54.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "r", descriptor = "(Z)V")
	private void method225() {
		try {
			@Pc(2) int local2 = this.anInt361;
			@Pc(5) int local5 = this.anInt362;
			@Pc(8) int local8 = this.anInt363;
			@Pc(11) int local11 = this.anInt364;
			Class1_Sub1_Sub2.method439(local5, local11, 6116423, local8, local2);
			this.aBoolean54 &= true;
			Class1_Sub1_Sub2.method439(local5 + 1, 16, 0, local8 - 2, local2 + 1);
			Class1_Sub1_Sub2.method440(local2 + 1, local5 + 18, local8 - 2, 0, local11 - 19);
			this.aClass1_Sub1_Sub2_Sub4_3.method451("Choose Option", local2 + 3, 6116423, local5 + 14);
			@Pc(69) int local69 = super.anInt197;
			@Pc(72) int local72 = super.anInt198;
			if (this.anInt360 == 0) {
				local69 -= 4;
				local72 -= 4;
			}
			if (this.anInt360 == 1) {
				local69 -= 553;
				local72 -= 205;
			}
			if (this.anInt360 == 2) {
				local69 -= 17;
				local72 -= 357;
			}
			for (@Pc(91) int local91 = 0; local91 < this.anInt322; local91++) {
				@Pc(106) int local106 = local5 + (this.anInt322 - 1 - local91) * 15 + 31;
				@Pc(108) int local108 = 16777215;
				if (local69 > local2 && local69 < local2 + local8 && local72 > local106 - 13 && local72 < local106 + 3) {
					local108 = 16776960;
				}
				this.aClass1_Sub1_Sub2_Sub4_3.method455(this.aStringArray4[local91], local108, local2 + 3, true, local106);
			}
		} catch (@Pc(149) RuntimeException local149) {
			signlink.reporterror("15511, " + true + ", " + local149.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IZ[B)V")
	private void method226(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) byte[] arg2) {
		try {
			signlink.anInt945 = arg1 ? 1 : 0;
			signlink.midisave(arg2, arg2.length);
			if (arg0 < 1 || arg0 > 1) {
				this.anInt318 = this.aClass46_1.method662();
			}
		} catch (@Pc(22) RuntimeException local22) {
			signlink.reporterror("39057, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local22.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IILjava/lang/String;Ljava/lang/String;)V")
	private void method227(@OriginalArg(1) int arg0, @OriginalArg(2) String arg1, @OriginalArg(3) String arg2) {
		try {
			if (arg0 == 0 && this.anInt412 != -1) {
				this.aString17 = arg2;
				super.anInt202 = 0;
			}
			if (this.anInt217 == -1) {
				this.aBoolean59 = true;
			}
			for (@Pc(20) int local20 = 99; local20 > 0; local20--) {
				this.anIntArray47[local20] = this.anIntArray47[local20 - 1];
				this.aStringArray2[local20] = this.aStringArray2[local20 - 1];
				this.aStringArray3[local20] = this.aStringArray3[local20 - 1];
			}
			this.anIntArray47[0] = arg0;
			this.aStringArray2[0] = arg1;
			this.aStringArray3[0] = arg2;
		} catch (@Pc(78) RuntimeException local78) {
			signlink.reporterror("3360, " + 176 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local78.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "K", descriptor = "(I)V")
	private void method228() {
		try {
			this.anInt377 = 0;
			@Pc(15) int local15 = (aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt988 >> 7) + this.anInt323;
			@Pc(23) int local23 = (aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt989 >> 7) + this.anInt324;
			if (local15 >= 3053 && local15 <= 3156 && local23 >= 3056 && local23 <= 3136) {
				this.anInt377 = 1;
			}
			if (local15 >= 3072 && local15 <= 3118 && local23 >= 9492 && local23 <= 9535) {
				this.anInt377 = 1;
			}
			if (this.anInt377 == 1 && local15 >= 3139 && local15 <= 3199 && local23 >= 3008 && local23 <= 3062) {
				this.anInt377 = 0;
			}
		} catch (@Pc(74) RuntimeException local74) {
			signlink.reporterror("70483, " + 798 + ", " + local74.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "L", descriptor = "(I)V")
	private void method229() {
		try {
			if (this.anInt420 == 2) {
				this.method147((this.anInt239 - this.anInt324 << 7) + this.anInt242, this.anInt240 * 2, (this.anInt238 - this.anInt323 << 7) + this.anInt241, 736);
				if (this.anInt387 > -1 && anInt297 % 20 < 10) {
					this.aClass1_Sub1_Sub2_Sub2Array7[2].method391(this.anInt387 - 12, this.anInt388 - 28);
				}
			}
		} catch (@Pc(65) RuntimeException local65) {
			signlink.reporterror("80251, " + 7 + ", " + local65.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
	@Override
	public AppletContext getAppletContext() {
		return signlink.mainapp == null ? super.getAppletContext() : signlink.mainapp.getAppletContext();
	}

	@OriginalMember(owner = "client!client", name = "M", descriptor = "(I)Ljava/net/Socket;")
	public Socket method230(@OriginalArg(0) int arg0) throws IOException {
		return signlink.mainapp == null ? new Socket(InetAddress.getByName(this.getCodeBase().getHost()), arg0) : signlink.opensocket(arg0);
	}
}
