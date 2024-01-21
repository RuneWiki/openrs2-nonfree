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

	@OriginalMember(owner = "client!client", name = "T", descriptor = "Z")
	private static boolean aBoolean62;

	@OriginalMember(owner = "client!client", name = "V", descriptor = "Z")
	private static boolean aBoolean63;

	@OriginalMember(owner = "client!client", name = "W", descriptor = "I")
	private static int anInt208;

	@OriginalMember(owner = "client!client", name = "X", descriptor = "I")
	private static int anInt209;

	@OriginalMember(owner = "client!client", name = "Hb", descriptor = "I")
	private static int anInt221;

	@OriginalMember(owner = "client!client", name = "Vb", descriptor = "I")
	private static int anInt228;

	@OriginalMember(owner = "client!client", name = "bc", descriptor = "Lclient!ab;")
	public static Class1_Sub1_Sub1_Sub1_Sub1 aClass1_Sub1_Sub1_Sub1_Sub1_1;

	@OriginalMember(owner = "client!client", name = "cc", descriptor = "I")
	private static int anInt231;

	@OriginalMember(owner = "client!client", name = "uc", descriptor = "I")
	private static int anInt239;

	@OriginalMember(owner = "client!client", name = "Ec", descriptor = "I")
	public static int anInt248;

	@OriginalMember(owner = "client!client", name = "Gc", descriptor = "Z")
	private static boolean aBoolean71;

	@OriginalMember(owner = "client!client", name = "Ic", descriptor = "I")
	private static int anInt250;

	@OriginalMember(owner = "client!client", name = "bd", descriptor = "I")
	public static int anInt265;

	@OriginalMember(owner = "client!client", name = "qd", descriptor = "Z")
	private static boolean aBoolean73;

	@OriginalMember(owner = "client!client", name = "Ad", descriptor = "I")
	private static int anInt276;

	@OriginalMember(owner = "client!client", name = "je", descriptor = "I")
	private static int anInt289;

	@OriginalMember(owner = "client!client", name = "oe", descriptor = "I")
	private static int anInt293;

	@OriginalMember(owner = "client!client", name = "Ae", descriptor = "I")
	private static int anInt300;

	@OriginalMember(owner = "client!client", name = "Re", descriptor = "I")
	private static int anInt313;

	@OriginalMember(owner = "client!client", name = "Df", descriptor = "I")
	private static int anInt331;

	@OriginalMember(owner = "client!client", name = "Lf", descriptor = "I")
	private static int anInt335;

	@OriginalMember(owner = "client!client", name = "Zg", descriptor = "I")
	private static int anInt361;

	@OriginalMember(owner = "client!client", name = "rh", descriptor = "I")
	private static int anInt369;

	@OriginalMember(owner = "client!client", name = "yi", descriptor = "I")
	private static int anInt394;

	@OriginalMember(owner = "client!client", name = "jj", descriptor = "I")
	private static int anInt414;

	@OriginalMember(owner = "client!client", name = "L", descriptor = "Ljava/math/BigInteger;")
	private static BigInteger aBigInteger1 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");

	@OriginalMember(owner = "client!client", name = "S", descriptor = "Ljava/math/BigInteger;")
	private static BigInteger aBigInteger2 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");

	@OriginalMember(owner = "client!client", name = "Dc", descriptor = "I")
	private static int anInt247 = 10;

	@OriginalMember(owner = "client!client", name = "Fc", descriptor = "Z")
	private static boolean aBoolean70 = true;

	@OriginalMember(owner = "client!client", name = "Tc", descriptor = "Z")
	private static boolean aBoolean72 = true;

	@OriginalMember(owner = "client!client", name = "ad", descriptor = "I")
	private static int anInt264 = 438;

	@OriginalMember(owner = "client!client", name = "Bd", descriptor = "[I")
	private static int[] anIntArray51 = new int[99];

	@OriginalMember(owner = "client!client", name = "te", descriptor = "[[I")
	public static final int[][] anIntArrayArray6;

	@OriginalMember(owner = "client!client", name = "Qe", descriptor = "[I")
	public static final int[] anIntArray54;

	@OriginalMember(owner = "client!client", name = "wg", descriptor = "Ljava/lang/String;")
	private static String aString13;

	@OriginalMember(owner = "client!client", name = "cj", descriptor = "I")
	private static int anInt412;

	@OriginalMember(owner = "client!client", name = "kj", descriptor = "[I")
	private static int[] anIntArray87;

	@OriginalMember(owner = "client!client", name = "K", descriptor = "I")
	private int anInt204;

	@OriginalMember(owner = "client!client", name = "M", descriptor = "I")
	private int anInt205;

	@OriginalMember(owner = "client!client", name = "P", descriptor = "I")
	private int anInt207;

	@OriginalMember(owner = "client!client", name = "Y", descriptor = "I")
	private int anInt210;

	@OriginalMember(owner = "client!client", name = "ib", descriptor = "I")
	private int anInt212;

	@OriginalMember(owner = "client!client", name = "mb", descriptor = "J")
	private long aLong14;

	@OriginalMember(owner = "client!client", name = "nb", descriptor = "I")
	private int anInt213;

	@OriginalMember(owner = "client!client", name = "ob", descriptor = "I")
	private int anInt214;

	@OriginalMember(owner = "client!client", name = "pb", descriptor = "I")
	private int anInt215;

	@OriginalMember(owner = "client!client", name = "qb", descriptor = "I")
	private int anInt216;

	@OriginalMember(owner = "client!client", name = "rb", descriptor = "I")
	private int anInt217;

	@OriginalMember(owner = "client!client", name = "sb", descriptor = "I")
	private int anInt218;

	@OriginalMember(owner = "client!client", name = "tb", descriptor = "Lclient!qb;")
	private Class35 aClass35_3;

	@OriginalMember(owner = "client!client", name = "ub", descriptor = "Lclient!qb;")
	private Class35 aClass35_4;

	@OriginalMember(owner = "client!client", name = "vb", descriptor = "Lclient!qb;")
	private Class35 aClass35_5;

	@OriginalMember(owner = "client!client", name = "wb", descriptor = "Lclient!qb;")
	private Class35 aClass35_6;

	@OriginalMember(owner = "client!client", name = "xb", descriptor = "Lclient!qb;")
	private Class35 aClass35_7;

	@OriginalMember(owner = "client!client", name = "yb", descriptor = "Lclient!qb;")
	private Class35 aClass35_8;

	@OriginalMember(owner = "client!client", name = "zb", descriptor = "Lclient!qb;")
	private Class35 aClass35_9;

	@OriginalMember(owner = "client!client", name = "Ab", descriptor = "Lclient!qb;")
	private Class35 aClass35_10;

	@OriginalMember(owner = "client!client", name = "Bb", descriptor = "Lclient!qb;")
	private Class35 aClass35_11;

	@OriginalMember(owner = "client!client", name = "Db", descriptor = "I")
	private int anInt219;

	@OriginalMember(owner = "client!client", name = "Ib", descriptor = "[I")
	private int[] anIntArray38;

	@OriginalMember(owner = "client!client", name = "Jb", descriptor = "[I")
	private int[] anIntArray39;

	@OriginalMember(owner = "client!client", name = "Kb", descriptor = "I")
	private int anInt222;

	@OriginalMember(owner = "client!client", name = "Pb", descriptor = "Lclient!jb;")
	private Class1_Sub1_Sub2_Sub3 aClass1_Sub1_Sub2_Sub3_1;

	@OriginalMember(owner = "client!client", name = "Qb", descriptor = "Lclient!jb;")
	private Class1_Sub1_Sub2_Sub3 aClass1_Sub1_Sub2_Sub3_2;

	@OriginalMember(owner = "client!client", name = "Rb", descriptor = "I")
	private int anInt224;

	@OriginalMember(owner = "client!client", name = "Sb", descriptor = "I")
	private int anInt225;

	@OriginalMember(owner = "client!client", name = "Tb", descriptor = "I")
	private int anInt226;

	@OriginalMember(owner = "client!client", name = "Ub", descriptor = "I")
	private int anInt227;

	@OriginalMember(owner = "client!client", name = "Xb", descriptor = "Lclient!fc;")
	private Class11 aClass11_1;

	@OriginalMember(owner = "client!client", name = "Yb", descriptor = "I")
	private int anInt229;

	@OriginalMember(owner = "client!client", name = "Zb", descriptor = "I")
	private int anInt230;

	@OriginalMember(owner = "client!client", name = "ac", descriptor = "Lclient!ib;")
	private Class1_Sub1_Sub2_Sub2 aClass1_Sub1_Sub2_Sub2_1;

	@OriginalMember(owner = "client!client", name = "dc", descriptor = "I")
	private int anInt232;

	@OriginalMember(owner = "client!client", name = "fc", descriptor = "Lclient!ib;")
	private Class1_Sub1_Sub2_Sub2 aClass1_Sub1_Sub2_Sub2_2;

	@OriginalMember(owner = "client!client", name = "gc", descriptor = "Lclient!ib;")
	private Class1_Sub1_Sub2_Sub2 aClass1_Sub1_Sub2_Sub2_3;

	@OriginalMember(owner = "client!client", name = "hc", descriptor = "Lclient!ib;")
	private Class1_Sub1_Sub2_Sub2 aClass1_Sub1_Sub2_Sub2_4;

	@OriginalMember(owner = "client!client", name = "ic", descriptor = "Lclient!ib;")
	private Class1_Sub1_Sub2_Sub2 aClass1_Sub1_Sub2_Sub2_5;

	@OriginalMember(owner = "client!client", name = "jc", descriptor = "I")
	private int anInt233;

	@OriginalMember(owner = "client!client", name = "qc", descriptor = "I")
	private int anInt237;

	@OriginalMember(owner = "client!client", name = "rc", descriptor = "I")
	private int anInt238;

	@OriginalMember(owner = "client!client", name = "vc", descriptor = "I")
	private int anInt240;

	@OriginalMember(owner = "client!client", name = "wc", descriptor = "I")
	private int anInt241;

	@OriginalMember(owner = "client!client", name = "xc", descriptor = "I")
	private int anInt242;

	@OriginalMember(owner = "client!client", name = "yc", descriptor = "I")
	private int anInt243;

	@OriginalMember(owner = "client!client", name = "zc", descriptor = "I")
	private int anInt244;

	@OriginalMember(owner = "client!client", name = "Ac", descriptor = "I")
	private int anInt245;

	@OriginalMember(owner = "client!client", name = "Cc", descriptor = "I")
	private int anInt246;

	@OriginalMember(owner = "client!client", name = "Hc", descriptor = "I")
	private int anInt249;

	@OriginalMember(owner = "client!client", name = "Jc", descriptor = "I")
	private int anInt251;

	@OriginalMember(owner = "client!client", name = "Kc", descriptor = "I")
	private int anInt252;

	@OriginalMember(owner = "client!client", name = "Mc", descriptor = "I")
	private int anInt253;

	@OriginalMember(owner = "client!client", name = "Pc", descriptor = "I")
	private int anInt255;

	@OriginalMember(owner = "client!client", name = "Qc", descriptor = "I")
	private int anInt256;

	@OriginalMember(owner = "client!client", name = "Rc", descriptor = "I")
	private int anInt257;

	@OriginalMember(owner = "client!client", name = "Sc", descriptor = "I")
	private int anInt258;

	@OriginalMember(owner = "client!client", name = "Uc", descriptor = "I")
	private int anInt259;

	@OriginalMember(owner = "client!client", name = "Vc", descriptor = "I")
	private int anInt260;

	@OriginalMember(owner = "client!client", name = "Xc", descriptor = "I")
	private int anInt262;

	@OriginalMember(owner = "client!client", name = "Yc", descriptor = "I")
	private int anInt263;

	@OriginalMember(owner = "client!client", name = "Zc", descriptor = "Lclient!ib;")
	private Class1_Sub1_Sub2_Sub2 aClass1_Sub1_Sub2_Sub2_6;

	@OriginalMember(owner = "client!client", name = "fd", descriptor = "[I")
	private int[] anIntArray44;

	@OriginalMember(owner = "client!client", name = "gd", descriptor = "[I")
	private int[] anIntArray45;

	@OriginalMember(owner = "client!client", name = "hd", descriptor = "I")
	private int anInt267;

	@OriginalMember(owner = "client!client", name = "id", descriptor = "Ljava/net/Socket;")
	private Socket aSocket1;

	@OriginalMember(owner = "client!client", name = "jd", descriptor = "I")
	private int anInt268;

	@OriginalMember(owner = "client!client", name = "kd", descriptor = "I")
	private int anInt269;

	@OriginalMember(owner = "client!client", name = "nd", descriptor = "I")
	private int anInt270;

	@OriginalMember(owner = "client!client", name = "ud", descriptor = "I")
	private int anInt273;

	@OriginalMember(owner = "client!client", name = "wd", descriptor = "I")
	private int anInt274;

	@OriginalMember(owner = "client!client", name = "zd", descriptor = "I")
	private int anInt275;

	@OriginalMember(owner = "client!client", name = "Ed", descriptor = "I")
	private int anInt278;

	@OriginalMember(owner = "client!client", name = "Fd", descriptor = "I")
	private int anInt279;

	@OriginalMember(owner = "client!client", name = "Gd", descriptor = "I")
	private int anInt280;

	@OriginalMember(owner = "client!client", name = "Hd", descriptor = "I")
	private int anInt281;

	@OriginalMember(owner = "client!client", name = "Id", descriptor = "Lclient!jb;")
	private Class1_Sub1_Sub2_Sub3 aClass1_Sub1_Sub2_Sub3_3;

	@OriginalMember(owner = "client!client", name = "Jd", descriptor = "Lclient!jb;")
	private Class1_Sub1_Sub2_Sub3 aClass1_Sub1_Sub2_Sub3_4;

	@OriginalMember(owner = "client!client", name = "Kd", descriptor = "Lclient!jb;")
	private Class1_Sub1_Sub2_Sub3 aClass1_Sub1_Sub2_Sub3_5;

	@OriginalMember(owner = "client!client", name = "Ld", descriptor = "Lclient!jb;")
	private Class1_Sub1_Sub2_Sub3 aClass1_Sub1_Sub2_Sub3_6;

	@OriginalMember(owner = "client!client", name = "Md", descriptor = "Lclient!jb;")
	private Class1_Sub1_Sub2_Sub3 aClass1_Sub1_Sub2_Sub3_7;

	@OriginalMember(owner = "client!client", name = "Nd", descriptor = "I")
	private int anInt282;

	@OriginalMember(owner = "client!client", name = "Od", descriptor = "I")
	private int anInt283;

	@OriginalMember(owner = "client!client", name = "Pd", descriptor = "I")
	private int anInt284;

	@OriginalMember(owner = "client!client", name = "Qd", descriptor = "Ljava/lang/String;")
	private String aString9;

	@OriginalMember(owner = "client!client", name = "Rd", descriptor = "I")
	private int anInt285;

	@OriginalMember(owner = "client!client", name = "Ud", descriptor = "Lclient!wb;")
	private Class46 aClass46_1;

	@OriginalMember(owner = "client!client", name = "Xd", descriptor = "I")
	private int anInt288;

	@OriginalMember(owner = "client!client", name = "Yd", descriptor = "Lclient!jb;")
	private Class1_Sub1_Sub2_Sub3 aClass1_Sub1_Sub2_Sub3_8;

	@OriginalMember(owner = "client!client", name = "Zd", descriptor = "Lclient!jb;")
	private Class1_Sub1_Sub2_Sub3 aClass1_Sub1_Sub2_Sub3_9;

	@OriginalMember(owner = "client!client", name = "ae", descriptor = "Lclient!jb;")
	private Class1_Sub1_Sub2_Sub3 aClass1_Sub1_Sub2_Sub3_10;

	@OriginalMember(owner = "client!client", name = "de", descriptor = "Lclient!jb;")
	private Class1_Sub1_Sub2_Sub3 aClass1_Sub1_Sub2_Sub3_11;

	@OriginalMember(owner = "client!client", name = "ee", descriptor = "Lclient!jb;")
	private Class1_Sub1_Sub2_Sub3 aClass1_Sub1_Sub2_Sub3_12;

	@OriginalMember(owner = "client!client", name = "fe", descriptor = "Lclient!jb;")
	private Class1_Sub1_Sub2_Sub3 aClass1_Sub1_Sub2_Sub3_13;

	@OriginalMember(owner = "client!client", name = "ge", descriptor = "Lclient!jb;")
	private Class1_Sub1_Sub2_Sub3 aClass1_Sub1_Sub2_Sub3_14;

	@OriginalMember(owner = "client!client", name = "he", descriptor = "Lclient!jb;")
	private Class1_Sub1_Sub2_Sub3 aClass1_Sub1_Sub2_Sub3_15;

	@OriginalMember(owner = "client!client", name = "ke", descriptor = "I")
	private int anInt290;

	@OriginalMember(owner = "client!client", name = "le", descriptor = "I")
	private int anInt291;

	@OriginalMember(owner = "client!client", name = "me", descriptor = "I")
	private int anInt292;

	@OriginalMember(owner = "client!client", name = "se", descriptor = "Lclient!e;")
	private Class8 aClass8_1;

	@OriginalMember(owner = "client!client", name = "ue", descriptor = "I")
	private int anInt296;

	@OriginalMember(owner = "client!client", name = "xe", descriptor = "I")
	private int anInt297;

	@OriginalMember(owner = "client!client", name = "ye", descriptor = "I")
	private int anInt298;

	@OriginalMember(owner = "client!client", name = "ze", descriptor = "I")
	private int anInt299;

	@OriginalMember(owner = "client!client", name = "Be", descriptor = "Ljava/lang/String;")
	private String aString10;

	@OriginalMember(owner = "client!client", name = "De", descriptor = "I")
	private int anInt301;

	@OriginalMember(owner = "client!client", name = "Ee", descriptor = "I")
	private int anInt302;

	@OriginalMember(owner = "client!client", name = "Fe", descriptor = "I")
	private int anInt303;

	@OriginalMember(owner = "client!client", name = "Ge", descriptor = "I")
	private int anInt304;

	@OriginalMember(owner = "client!client", name = "He", descriptor = "I")
	private int anInt305;

	@OriginalMember(owner = "client!client", name = "Ie", descriptor = "I")
	private int anInt306;

	@OriginalMember(owner = "client!client", name = "Ke", descriptor = "I")
	private int anInt308;

	@OriginalMember(owner = "client!client", name = "Le", descriptor = "I")
	private int anInt309;

	@OriginalMember(owner = "client!client", name = "Me", descriptor = "I")
	private int anInt310;

	@OriginalMember(owner = "client!client", name = "Ne", descriptor = "I")
	private int anInt311;

	@OriginalMember(owner = "client!client", name = "Oe", descriptor = "I")
	private int anInt312;

	@OriginalMember(owner = "client!client", name = "Pe", descriptor = "[[[B")
	private byte[][][] aByteArrayArrayArray7;

	@OriginalMember(owner = "client!client", name = "Se", descriptor = "I")
	private int anInt314;

	@OriginalMember(owner = "client!client", name = "Ve", descriptor = "[I")
	private int[] anIntArray55;

	@OriginalMember(owner = "client!client", name = "We", descriptor = "[I")
	private int[] anIntArray56;

	@OriginalMember(owner = "client!client", name = "Xe", descriptor = "[I")
	private int[] anIntArray57;

	@OriginalMember(owner = "client!client", name = "Ye", descriptor = "[I")
	private int[] anIntArray58;

	@OriginalMember(owner = "client!client", name = "bf", descriptor = "J")
	private long aLong15;

	@OriginalMember(owner = "client!client", name = "df", descriptor = "I")
	private int anInt315;

	@OriginalMember(owner = "client!client", name = "ef", descriptor = "I")
	private int anInt316;

	@OriginalMember(owner = "client!client", name = "gf", descriptor = "I")
	private int anInt318;

	@OriginalMember(owner = "client!client", name = "hf", descriptor = "I")
	private int anInt319;

	@OriginalMember(owner = "client!client", name = "jf", descriptor = "I")
	private int anInt320;

	@OriginalMember(owner = "client!client", name = "kf", descriptor = "I")
	private int anInt321;

	@OriginalMember(owner = "client!client", name = "lf", descriptor = "Ljava/lang/String;")
	private String aString11;

	@OriginalMember(owner = "client!client", name = "pf", descriptor = "J")
	private long aLong16;

	@OriginalMember(owner = "client!client", name = "qf", descriptor = "I")
	private int anInt323;

	@OriginalMember(owner = "client!client", name = "rf", descriptor = "I")
	private int anInt324;

	@OriginalMember(owner = "client!client", name = "sf", descriptor = "I")
	private int anInt325;

	@OriginalMember(owner = "client!client", name = "tf", descriptor = "I")
	private int anInt326;

	@OriginalMember(owner = "client!client", name = "uf", descriptor = "I")
	private int anInt327;

	@OriginalMember(owner = "client!client", name = "xf", descriptor = "I")
	private int anInt328;

	@OriginalMember(owner = "client!client", name = "yf", descriptor = "Ljava/lang/String;")
	private String aString12;

	@OriginalMember(owner = "client!client", name = "zf", descriptor = "[[B")
	private byte[][] aByteArrayArray1;

	@OriginalMember(owner = "client!client", name = "Af", descriptor = "I")
	private int anInt329;

	@OriginalMember(owner = "client!client", name = "Bf", descriptor = "Lclient!ub;")
	private Class44_Sub1 aClass44_Sub1_1;

	@OriginalMember(owner = "client!client", name = "If", descriptor = "I")
	private int anInt332;

	@OriginalMember(owner = "client!client", name = "Kf", descriptor = "I")
	private int anInt334;

	@OriginalMember(owner = "client!client", name = "Of", descriptor = "I")
	private int anInt336;

	@OriginalMember(owner = "client!client", name = "Pf", descriptor = "I")
	private int anInt337;

	@OriginalMember(owner = "client!client", name = "Rf", descriptor = "I")
	private int anInt339;

	@OriginalMember(owner = "client!client", name = "Sf", descriptor = "I")
	private int anInt340;

	@OriginalMember(owner = "client!client", name = "Uf", descriptor = "I")
	private int anInt341;

	@OriginalMember(owner = "client!client", name = "Xf", descriptor = "I")
	private int anInt342;

	@OriginalMember(owner = "client!client", name = "dg", descriptor = "[Lclient!jb;")
	private Class1_Sub1_Sub2_Sub3[] aClass1_Sub1_Sub2_Sub3Array3;

	@OriginalMember(owner = "client!client", name = "eg", descriptor = "Lclient!ib;")
	private Class1_Sub1_Sub2_Sub2 aClass1_Sub1_Sub2_Sub2_7;

	@OriginalMember(owner = "client!client", name = "fg", descriptor = "Lclient!ib;")
	private Class1_Sub1_Sub2_Sub2 aClass1_Sub1_Sub2_Sub2_8;

	@OriginalMember(owner = "client!client", name = "gg", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray5;

	@OriginalMember(owner = "client!client", name = "ig", descriptor = "I")
	private int anInt347;

	@OriginalMember(owner = "client!client", name = "jg", descriptor = "I")
	private int anInt348;

	@OriginalMember(owner = "client!client", name = "lg", descriptor = "Lclient!qb;")
	private Class35 aClass35_12;

	@OriginalMember(owner = "client!client", name = "mg", descriptor = "Lclient!qb;")
	private Class35 aClass35_13;

	@OriginalMember(owner = "client!client", name = "ng", descriptor = "Lclient!qb;")
	private Class35 aClass35_14;

	@OriginalMember(owner = "client!client", name = "rg", descriptor = "I")
	private int anInt350;

	@OriginalMember(owner = "client!client", name = "tg", descriptor = "Lclient!ib;")
	private Class1_Sub1_Sub2_Sub2 aClass1_Sub1_Sub2_Sub2_9;

	@OriginalMember(owner = "client!client", name = "ug", descriptor = "Lclient!ib;")
	private Class1_Sub1_Sub2_Sub2 aClass1_Sub1_Sub2_Sub2_10;

	@OriginalMember(owner = "client!client", name = "xg", descriptor = "Lclient!qb;")
	private Class35 aClass35_15;

	@OriginalMember(owner = "client!client", name = "yg", descriptor = "Lclient!qb;")
	private Class35 aClass35_16;

	@OriginalMember(owner = "client!client", name = "zg", descriptor = "Lclient!qb;")
	private Class35 aClass35_17;

	@OriginalMember(owner = "client!client", name = "Ag", descriptor = "Lclient!qb;")
	private Class35 aClass35_18;

	@OriginalMember(owner = "client!client", name = "Bg", descriptor = "Lclient!qb;")
	private Class35 aClass35_19;

	@OriginalMember(owner = "client!client", name = "Cg", descriptor = "Lclient!qb;")
	private Class35 aClass35_20;

	@OriginalMember(owner = "client!client", name = "Dg", descriptor = "Lclient!qb;")
	private Class35 aClass35_21;

	@OriginalMember(owner = "client!client", name = "Eg", descriptor = "Lclient!qb;")
	private Class35 aClass35_22;

	@OriginalMember(owner = "client!client", name = "Fg", descriptor = "Lclient!qb;")
	private Class35 aClass35_23;

	@OriginalMember(owner = "client!client", name = "Gg", descriptor = "Lclient!qb;")
	private Class35 aClass35_24;

	@OriginalMember(owner = "client!client", name = "Hg", descriptor = "Lclient!qb;")
	private Class35 aClass35_25;

	@OriginalMember(owner = "client!client", name = "Ig", descriptor = "Lclient!qb;")
	private Class35 aClass35_26;

	@OriginalMember(owner = "client!client", name = "Jg", descriptor = "Lclient!qb;")
	private Class35 aClass35_27;

	@OriginalMember(owner = "client!client", name = "Kg", descriptor = "I")
	private int anInt351;

	@OriginalMember(owner = "client!client", name = "Pg", descriptor = "I")
	private int anInt353;

	@OriginalMember(owner = "client!client", name = "Sg", descriptor = "I")
	private int anInt354;

	@OriginalMember(owner = "client!client", name = "Tg", descriptor = "I")
	private int anInt355;

	@OriginalMember(owner = "client!client", name = "Ug", descriptor = "I")
	private int anInt356;

	@OriginalMember(owner = "client!client", name = "Vg", descriptor = "I")
	private int anInt357;

	@OriginalMember(owner = "client!client", name = "Wg", descriptor = "I")
	private int anInt358;

	@OriginalMember(owner = "client!client", name = "Xg", descriptor = "I")
	private int anInt359;

	@OriginalMember(owner = "client!client", name = "Yg", descriptor = "I")
	private int anInt360;

	@OriginalMember(owner = "client!client", name = "ah", descriptor = "Lclient!r;")
	private Class37 aClass37_1;

	@OriginalMember(owner = "client!client", name = "bh", descriptor = "Lclient!jb;")
	private Class1_Sub1_Sub2_Sub3 aClass1_Sub1_Sub2_Sub3_16;

	@OriginalMember(owner = "client!client", name = "ch", descriptor = "Lclient!jb;")
	private Class1_Sub1_Sub2_Sub3 aClass1_Sub1_Sub2_Sub3_17;

	@OriginalMember(owner = "client!client", name = "dh", descriptor = "Lclient!jb;")
	private Class1_Sub1_Sub2_Sub3 aClass1_Sub1_Sub2_Sub3_18;

	@OriginalMember(owner = "client!client", name = "eh", descriptor = "Lclient!xb;")
	private Class47 aClass47_1;

	@OriginalMember(owner = "client!client", name = "fh", descriptor = "I")
	private int anInt362;

	@OriginalMember(owner = "client!client", name = "gh", descriptor = "I")
	private int anInt363;

	@OriginalMember(owner = "client!client", name = "hh", descriptor = "I")
	private int anInt364;

	@OriginalMember(owner = "client!client", name = "ih", descriptor = "I")
	private int anInt365;

	@OriginalMember(owner = "client!client", name = "jh", descriptor = "I")
	private int anInt366;

	@OriginalMember(owner = "client!client", name = "kh", descriptor = "[[B")
	private byte[][] aByteArrayArray2;

	@OriginalMember(owner = "client!client", name = "lh", descriptor = "I")
	private int anInt367;

	@OriginalMember(owner = "client!client", name = "mh", descriptor = "I")
	private int anInt368;

	@OriginalMember(owner = "client!client", name = "nh", descriptor = "J")
	private long aLong17;

	@OriginalMember(owner = "client!client", name = "ph", descriptor = "Lclient!jb;")
	private Class1_Sub1_Sub2_Sub3 aClass1_Sub1_Sub2_Sub3_19;

	@OriginalMember(owner = "client!client", name = "qh", descriptor = "Lclient!jb;")
	private Class1_Sub1_Sub2_Sub3 aClass1_Sub1_Sub2_Sub3_20;

	@OriginalMember(owner = "client!client", name = "th", descriptor = "I")
	private int anInt371;

	@OriginalMember(owner = "client!client", name = "vh", descriptor = "I")
	private int anInt373;

	@OriginalMember(owner = "client!client", name = "wh", descriptor = "[I")
	private int[] anIntArray68;

	@OriginalMember(owner = "client!client", name = "xh", descriptor = "[I")
	private int[] anIntArray69;

	@OriginalMember(owner = "client!client", name = "yh", descriptor = "[I")
	private int[] anIntArray70;

	@OriginalMember(owner = "client!client", name = "Eh", descriptor = "I")
	private int anInt375;

	@OriginalMember(owner = "client!client", name = "Fh", descriptor = "I")
	private int anInt376;

	@OriginalMember(owner = "client!client", name = "Gh", descriptor = "I")
	private int anInt377;

	@OriginalMember(owner = "client!client", name = "Hh", descriptor = "I")
	private int anInt378;

	@OriginalMember(owner = "client!client", name = "Ih", descriptor = "I")
	private int anInt379;

	@OriginalMember(owner = "client!client", name = "Jh", descriptor = "I")
	private int anInt380;

	@OriginalMember(owner = "client!client", name = "Mh", descriptor = "Lclient!ib;")
	private Class1_Sub1_Sub2_Sub2 aClass1_Sub1_Sub2_Sub2_11;

	@OriginalMember(owner = "client!client", name = "Nh", descriptor = "Lclient!ib;")
	private Class1_Sub1_Sub2_Sub2 aClass1_Sub1_Sub2_Sub2_12;

	@OriginalMember(owner = "client!client", name = "Oh", descriptor = "I")
	private int anInt381;

	@OriginalMember(owner = "client!client", name = "Sh", descriptor = "[I")
	private int[] anIntArray73;

	@OriginalMember(owner = "client!client", name = "Th", descriptor = "[I")
	private int[] anIntArray74;

	@OriginalMember(owner = "client!client", name = "Uh", descriptor = "[I")
	private int[] anIntArray75;

	@OriginalMember(owner = "client!client", name = "Vh", descriptor = "I")
	private int anInt382;

	@OriginalMember(owner = "client!client", name = "Wh", descriptor = "Lclient!ib;")
	private Class1_Sub1_Sub2_Sub2 aClass1_Sub1_Sub2_Sub2_13;

	@OriginalMember(owner = "client!client", name = "bi", descriptor = "I")
	private int anInt384;

	@OriginalMember(owner = "client!client", name = "ci", descriptor = "I")
	private int anInt385;

	@OriginalMember(owner = "client!client", name = "di", descriptor = "I")
	private int anInt386;

	@OriginalMember(owner = "client!client", name = "ei", descriptor = "I")
	private int anInt387;

	@OriginalMember(owner = "client!client", name = "gi", descriptor = "I")
	private int anInt388;

	@OriginalMember(owner = "client!client", name = "hi", descriptor = "I")
	private int anInt389;

	@OriginalMember(owner = "client!client", name = "qi", descriptor = "I")
	private int anInt393;

	@OriginalMember(owner = "client!client", name = "Fi", descriptor = "I")
	private int anInt397;

	@OriginalMember(owner = "client!client", name = "Gi", descriptor = "I")
	private int anInt398;

	@OriginalMember(owner = "client!client", name = "Hi", descriptor = "I")
	private int anInt399;

	@OriginalMember(owner = "client!client", name = "Ii", descriptor = "I")
	private int anInt400;

	@OriginalMember(owner = "client!client", name = "Ji", descriptor = "I")
	private int anInt401;

	@OriginalMember(owner = "client!client", name = "Mi", descriptor = "I")
	private int anInt402;

	@OriginalMember(owner = "client!client", name = "Ti", descriptor = "I")
	private int anInt405;

	@OriginalMember(owner = "client!client", name = "Ui", descriptor = "I")
	private int anInt406;

	@OriginalMember(owner = "client!client", name = "Vi", descriptor = "I")
	private int anInt407;

	@OriginalMember(owner = "client!client", name = "Zi", descriptor = "I")
	private int anInt410;

	@OriginalMember(owner = "client!client", name = "aj", descriptor = "I")
	private int anInt411;

	@OriginalMember(owner = "client!client", name = "dj", descriptor = "Lclient!kb;")
	private Class1_Sub1_Sub2_Sub4 aClass1_Sub1_Sub2_Sub4_1;

	@OriginalMember(owner = "client!client", name = "ej", descriptor = "Lclient!kb;")
	private Class1_Sub1_Sub2_Sub4 aClass1_Sub1_Sub2_Sub4_2;

	@OriginalMember(owner = "client!client", name = "fj", descriptor = "Lclient!kb;")
	private Class1_Sub1_Sub2_Sub4 aClass1_Sub1_Sub2_Sub4_3;

	@OriginalMember(owner = "client!client", name = "gj", descriptor = "Lclient!kb;")
	private Class1_Sub1_Sub2_Sub4 aClass1_Sub1_Sub2_Sub4_4;

	@OriginalMember(owner = "client!client", name = "ij", descriptor = "I")
	private int anInt413;

	@OriginalMember(owner = "client!client", name = "lj", descriptor = "I")
	private int anInt415;

	@OriginalMember(owner = "client!client", name = "mj", descriptor = "J")
	private long aLong18;

	@OriginalMember(owner = "client!client", name = "J", descriptor = "Ljava/lang/String;")
	private String aString4 = "";

	@OriginalMember(owner = "client!client", name = "N", descriptor = "I")
	private int anInt206 = -1;

	@OriginalMember(owner = "client!client", name = "O", descriptor = "Z")
	private boolean aBoolean59 = false;

	@OriginalMember(owner = "client!client", name = "Q", descriptor = "Z")
	private boolean aBoolean60 = false;

	@OriginalMember(owner = "client!client", name = "R", descriptor = "Z")
	private boolean aBoolean61 = true;

	@OriginalMember(owner = "client!client", name = "U", descriptor = "Ljava/lang/String;")
	private String aString5 = "";

	@OriginalMember(owner = "client!client", name = "Z", descriptor = "I")
	private int anInt211 = 50;

	@OriginalMember(owner = "client!client", name = "ab", descriptor = "[I")
	private int[] anIntArray31 = new int[this.anInt211];

	@OriginalMember(owner = "client!client", name = "bb", descriptor = "[I")
	private int[] anIntArray32 = new int[this.anInt211];

	@OriginalMember(owner = "client!client", name = "cb", descriptor = "[I")
	private int[] anIntArray33 = new int[this.anInt211];

	@OriginalMember(owner = "client!client", name = "db", descriptor = "[I")
	private int[] anIntArray34 = new int[this.anInt211];

	@OriginalMember(owner = "client!client", name = "eb", descriptor = "[I")
	private int[] anIntArray35 = new int[this.anInt211];

	@OriginalMember(owner = "client!client", name = "fb", descriptor = "[I")
	private int[] anIntArray36 = new int[this.anInt211];

	@OriginalMember(owner = "client!client", name = "gb", descriptor = "[I")
	private int[] anIntArray37 = new int[this.anInt211];

	@OriginalMember(owner = "client!client", name = "hb", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray1 = new String[this.anInt211];

	@OriginalMember(owner = "client!client", name = "jb", descriptor = "B")
	private byte aByte2 = 4;

	@OriginalMember(owner = "client!client", name = "kb", descriptor = "[Lclient!jc;")
	private Class19[] aClass19Array1 = new Class19[4];

	@OriginalMember(owner = "client!client", name = "lb", descriptor = "Z")
	private boolean aBoolean64 = false;

	@OriginalMember(owner = "client!client", name = "Cb", descriptor = "Z")
	private boolean aBoolean65 = false;

	@OriginalMember(owner = "client!client", name = "Eb", descriptor = "Lclient!ob;")
	private Class29 aClass29_1 = new Class29(false);

	@OriginalMember(owner = "client!client", name = "Fb", descriptor = "I")
	private int anInt220 = 7759444;

	@OriginalMember(owner = "client!client", name = "Gb", descriptor = "Z")
	private boolean aBoolean66 = true;

	@OriginalMember(owner = "client!client", name = "Lb", descriptor = "I")
	private int anInt223 = 2;

	@OriginalMember(owner = "client!client", name = "Mb", descriptor = "B")
	private byte aByte3 = 37;

	@OriginalMember(owner = "client!client", name = "Nb", descriptor = "[Lclient!ib;")
	private Class1_Sub1_Sub2_Sub2[] aClass1_Sub1_Sub2_Sub2Array3 = new Class1_Sub1_Sub2_Sub2[20];

	@OriginalMember(owner = "client!client", name = "Ob", descriptor = "[[I")
	private int[][] anIntArrayArray3 = new int[104][104];

	@OriginalMember(owner = "client!client", name = "Wb", descriptor = "[I")
	private int[] anIntArray40 = new int[7];

	@OriginalMember(owner = "client!client", name = "ec", descriptor = "[[I")
	private int[][] anIntArrayArray4 = new int[104][104];

	@OriginalMember(owner = "client!client", name = "kc", descriptor = "[B")
	private byte[] aByteArray2 = new byte[16384];

	@OriginalMember(owner = "client!client", name = "lc", descriptor = "I")
	private int anInt234 = -1;

	@OriginalMember(owner = "client!client", name = "mc", descriptor = "I")
	private int anInt235 = -1;

	@OriginalMember(owner = "client!client", name = "nc", descriptor = "Z")
	private boolean aBoolean67 = false;

	@OriginalMember(owner = "client!client", name = "oc", descriptor = "[I")
	private int[] anIntArray41 = new int[5];

	@OriginalMember(owner = "client!client", name = "pc", descriptor = "I")
	private int anInt236 = -455;

	@OriginalMember(owner = "client!client", name = "sc", descriptor = "[I")
	private int[] anIntArray42 = new int[5];

	@OriginalMember(owner = "client!client", name = "tc", descriptor = "Z")
	private boolean aBoolean68 = false;

	@OriginalMember(owner = "client!client", name = "Bc", descriptor = "Z")
	private boolean aBoolean69 = false;

	@OriginalMember(owner = "client!client", name = "Lc", descriptor = "B")
	private byte aByte4 = 2;

	@OriginalMember(owner = "client!client", name = "Oc", descriptor = "[I")
	private int[] anIntArray43 = new int[50];

	@OriginalMember(owner = "client!client", name = "Wc", descriptor = "I")
	private int anInt261 = 1;

	@OriginalMember(owner = "client!client", name = "cd", descriptor = "I")
	private int anInt266 = -173;

	@OriginalMember(owner = "client!client", name = "dd", descriptor = "Ljava/lang/String;")
	private String aString6 = "";

	@OriginalMember(owner = "client!client", name = "ed", descriptor = "Ljava/lang/String;")
	private String aString7 = "";

	@OriginalMember(owner = "client!client", name = "ld", descriptor = "[I")
	private final int[] anIntArray46 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

	@OriginalMember(owner = "client!client", name = "md", descriptor = "[I")
	private int[] anIntArray47 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

	@OriginalMember(owner = "client!client", name = "od", descriptor = "[I")
	private int[] anIntArray48 = new int[33];

	@OriginalMember(owner = "client!client", name = "pd", descriptor = "Ljava/lang/String;")
	private String aString8 = "";

	@OriginalMember(owner = "client!client", name = "rd", descriptor = "I")
	private int anInt271 = 2048;

	@OriginalMember(owner = "client!client", name = "sd", descriptor = "I")
	private int anInt272 = 2047;

	@OriginalMember(owner = "client!client", name = "td", descriptor = "[Lclient!ab;")
	private Class1_Sub1_Sub1_Sub1_Sub1[] aClass1_Sub1_Sub1_Sub1_Sub1Array1 = new Class1_Sub1_Sub1_Sub1_Sub1[this.anInt271];

	@OriginalMember(owner = "client!client", name = "vd", descriptor = "[I")
	private int[] anIntArray49 = new int[this.anInt271];

	@OriginalMember(owner = "client!client", name = "xd", descriptor = "[I")
	private int[] anIntArray50 = new int[this.anInt271];

	@OriginalMember(owner = "client!client", name = "yd", descriptor = "[Lclient!lb;")
	private Class1_Sub1_Sub3[] aClass1_Sub1_Sub3Array1 = new Class1_Sub1_Sub3[this.anInt271];

	@OriginalMember(owner = "client!client", name = "Cd", descriptor = "I")
	private int anInt277 = 2301979;

	@OriginalMember(owner = "client!client", name = "Dd", descriptor = "Z")
	private boolean aBoolean74 = false;

	@OriginalMember(owner = "client!client", name = "Sd", descriptor = "[[I")
	private int[][] anIntArrayArray5 = new int[104][104];

	@OriginalMember(owner = "client!client", name = "Td", descriptor = "I")
	private int anInt286 = -1;

	@OriginalMember(owner = "client!client", name = "Vd", descriptor = "I")
	private int anInt287 = -12224;

	@OriginalMember(owner = "client!client", name = "Wd", descriptor = "[I")
	private int[] anIntArray52 = new int[Class30.anInt811];

	@OriginalMember(owner = "client!client", name = "be", descriptor = "B")
	private byte aByte5 = 22;

	@OriginalMember(owner = "client!client", name = "ce", descriptor = "Ljava/util/zip/CRC32;")
	private CRC32 aCRC32_1 = new CRC32();

	@OriginalMember(owner = "client!client", name = "ie", descriptor = "Z")
	private boolean aBoolean75 = false;

	@OriginalMember(owner = "client!client", name = "ne", descriptor = "Z")
	private boolean aBoolean76 = false;

	@OriginalMember(owner = "client!client", name = "pe", descriptor = "I")
	private int anInt294 = 8;

	@OriginalMember(owner = "client!client", name = "qe", descriptor = "[I")
	private int[] anIntArray53 = new int[33];

	@OriginalMember(owner = "client!client", name = "re", descriptor = "I")
	private int anInt295 = -1;

	@OriginalMember(owner = "client!client", name = "ve", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray2 = new String[500];

	@OriginalMember(owner = "client!client", name = "we", descriptor = "[J")
	private long[] aLongArray3 = new long[200];

	@OriginalMember(owner = "client!client", name = "Ce", descriptor = "[Lclient!ib;")
	private Class1_Sub1_Sub2_Sub2[] aClass1_Sub1_Sub2_Sub2Array4 = new Class1_Sub1_Sub2_Sub2[8];

	@OriginalMember(owner = "client!client", name = "Je", descriptor = "I")
	private int anInt307 = -1;

	@OriginalMember(owner = "client!client", name = "Te", descriptor = "Lclient!ob;")
	private Class29 aClass29_2 = new Class29(false);

	@OriginalMember(owner = "client!client", name = "Ue", descriptor = "Z")
	private boolean aBoolean77 = false;

	@OriginalMember(owner = "client!client", name = "Ze", descriptor = "[Lclient!jb;")
	private Class1_Sub1_Sub2_Sub3[] aClass1_Sub1_Sub2_Sub3Array1 = new Class1_Sub1_Sub2_Sub3[100];

	@OriginalMember(owner = "client!client", name = "af", descriptor = "[I")
	private int[] anIntArray59 = new int[Class30.anInt811];

	@OriginalMember(owner = "client!client", name = "cf", descriptor = "[I")
	private int[] anIntArray60 = new int[50];

	@OriginalMember(owner = "client!client", name = "ff", descriptor = "I")
	private int anInt317 = 3;

	@OriginalMember(owner = "client!client", name = "mf", descriptor = "Lclient!lb;")
	private Class1_Sub1_Sub3 aClass1_Sub1_Sub3_2 = Class1_Sub1_Sub3.method462();

	@OriginalMember(owner = "client!client", name = "nf", descriptor = "I")
	private int anInt322 = 11300;

	@OriginalMember(owner = "client!client", name = "of", descriptor = "[I")
	private int[] anIntArray61 = new int[Class30.anInt811];

	@OriginalMember(owner = "client!client", name = "vf", descriptor = "[I")
	private int[] anIntArray62 = new int[50];

	@OriginalMember(owner = "client!client", name = "wf", descriptor = "Z")
	private boolean aBoolean78 = false;

	@OriginalMember(owner = "client!client", name = "Cf", descriptor = "I")
	private int anInt330 = 78;

	@OriginalMember(owner = "client!client", name = "Ef", descriptor = "Z")
	private boolean aBoolean79 = true;

	@OriginalMember(owner = "client!client", name = "Ff", descriptor = "[I")
	private int[] anIntArray63 = new int[100];

	@OriginalMember(owner = "client!client", name = "Gf", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray3 = new String[100];

	@OriginalMember(owner = "client!client", name = "Hf", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray4 = new String[100];

	@OriginalMember(owner = "client!client", name = "Jf", descriptor = "I")
	private int anInt333 = 2;

	@OriginalMember(owner = "client!client", name = "Mf", descriptor = "Lclient!lb;")
	private Class1_Sub1_Sub3 aClass1_Sub1_Sub3_3 = Class1_Sub1_Sub3.method462();

	@OriginalMember(owner = "client!client", name = "Nf", descriptor = "Z")
	private boolean aBoolean80 = false;

	@OriginalMember(owner = "client!client", name = "Qf", descriptor = "I")
	private int anInt338 = 2;

	@OriginalMember(owner = "client!client", name = "Tf", descriptor = "[Lclient!jb;")
	private Class1_Sub1_Sub2_Sub3[] aClass1_Sub1_Sub2_Sub3Array2 = new Class1_Sub1_Sub2_Sub3[13];

	@OriginalMember(owner = "client!client", name = "Vf", descriptor = "[I")
	private int[] anIntArray64 = new int[1000];

	@OriginalMember(owner = "client!client", name = "Wf", descriptor = "[I")
	private int[] anIntArray65 = new int[1000];

	@OriginalMember(owner = "client!client", name = "Yf", descriptor = "I")
	private int anInt343 = 1;

	@OriginalMember(owner = "client!client", name = "Zf", descriptor = "I")
	private int anInt344 = 462;

	@OriginalMember(owner = "client!client", name = "ag", descriptor = "[I")
	private int[] anIntArray66 = new int[5];

	@OriginalMember(owner = "client!client", name = "bg", descriptor = "I")
	private int anInt345 = -1;

	@OriginalMember(owner = "client!client", name = "cg", descriptor = "I")
	private int anInt346 = 5063219;

	@OriginalMember(owner = "client!client", name = "hg", descriptor = "Z")
	private boolean aBoolean81 = false;

	@OriginalMember(owner = "client!client", name = "kg", descriptor = "[I")
	private int[] anIntArray67 = new int[151];

	@OriginalMember(owner = "client!client", name = "og", descriptor = "I")
	private int anInt349 = -909;

	@OriginalMember(owner = "client!client", name = "pg", descriptor = "Z")
	private boolean aBoolean82 = false;

	@OriginalMember(owner = "client!client", name = "qg", descriptor = "Z")
	private boolean aBoolean83 = false;

	@OriginalMember(owner = "client!client", name = "sg", descriptor = "Z")
	private boolean aBoolean84 = false;

	@OriginalMember(owner = "client!client", name = "vg", descriptor = "[Lclient!ib;")
	private Class1_Sub1_Sub2_Sub2[] aClass1_Sub1_Sub2_Sub2Array5 = new Class1_Sub1_Sub2_Sub2[20];

	@OriginalMember(owner = "client!client", name = "Lg", descriptor = "I")
	private int anInt352 = 3353893;

	@OriginalMember(owner = "client!client", name = "Mg", descriptor = "[Lclient!jb;")
	private Class1_Sub1_Sub2_Sub3[] aClass1_Sub1_Sub2_Sub3Array4 = new Class1_Sub1_Sub2_Sub3[2];

	@OriginalMember(owner = "client!client", name = "Ng", descriptor = "Z")
	private boolean aBoolean85 = false;

	@OriginalMember(owner = "client!client", name = "Og", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray5 = new String[200];

	@OriginalMember(owner = "client!client", name = "Qg", descriptor = "Z")
	private boolean aBoolean86 = false;

	@OriginalMember(owner = "client!client", name = "Rg", descriptor = "Ljava/lang/String;")
	private String aString14 = "";

	@OriginalMember(owner = "client!client", name = "oh", descriptor = "Z")
	private boolean aBoolean87 = true;

	@OriginalMember(owner = "client!client", name = "sh", descriptor = "I")
	private int anInt370 = 2;

	@OriginalMember(owner = "client!client", name = "uh", descriptor = "I")
	private int anInt372 = 45827;

	@OriginalMember(owner = "client!client", name = "zh", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray6 = new String[5];

	@OriginalMember(owner = "client!client", name = "Ah", descriptor = "[Z")
	private boolean[] aBooleanArray3 = new boolean[5];

	@OriginalMember(owner = "client!client", name = "Bh", descriptor = "I")
	private int anInt374 = 9;

	@OriginalMember(owner = "client!client", name = "Ch", descriptor = "B")
	private byte aByte6 = 1;

	@OriginalMember(owner = "client!client", name = "Dh", descriptor = "[I")
	private int[] anIntArray71 = new int[5];

	@OriginalMember(owner = "client!client", name = "Kh", descriptor = "Z")
	private boolean aBoolean88 = false;

	@OriginalMember(owner = "client!client", name = "Ph", descriptor = "[I")
	private int[] anIntArray72 = new int[2000];

	@OriginalMember(owner = "client!client", name = "Qh", descriptor = "Z")
	public boolean aBoolean90 = false;

	@OriginalMember(owner = "client!client", name = "Rh", descriptor = "Lclient!lb;")
	private Class1_Sub1_Sub3 aClass1_Sub1_Sub3_4 = Class1_Sub1_Sub3.method462();

	@OriginalMember(owner = "client!client", name = "Xh", descriptor = "[I")
	private int[] anIntArray76 = new int[2000];

	@OriginalMember(owner = "client!client", name = "Yh", descriptor = "[Lclient!vb;")
	public Class45[] aClass45Array1 = new Class45[5];

	@OriginalMember(owner = "client!client", name = "Zh", descriptor = "[Lclient!ib;")
	private Class1_Sub1_Sub2_Sub2[] aClass1_Sub1_Sub2_Sub2Array6 = new Class1_Sub1_Sub2_Sub2[100];

	@OriginalMember(owner = "client!client", name = "ai", descriptor = "I")
	private int anInt383 = 128;

	@OriginalMember(owner = "client!client", name = "fi", descriptor = "[I")
	private int[] anIntArray77 = new int[1000];

	@OriginalMember(owner = "client!client", name = "ii", descriptor = "Z")
	private boolean aBoolean91 = false;

	@OriginalMember(owner = "client!client", name = "ji", descriptor = "Ljava/lang/String;")
	private String aString15 = "";

	@OriginalMember(owner = "client!client", name = "ki", descriptor = "Ljava/lang/String;")
	private String aString16 = "";

	@OriginalMember(owner = "client!client", name = "li", descriptor = "I")
	private int anInt390 = -1;

	@OriginalMember(owner = "client!client", name = "mi", descriptor = "I")
	private int anInt391 = -1;

	@OriginalMember(owner = "client!client", name = "ni", descriptor = "I")
	private int anInt392 = -1;

	@OriginalMember(owner = "client!client", name = "oi", descriptor = "Z")
	private boolean aBoolean92 = false;

	@OriginalMember(owner = "client!client", name = "pi", descriptor = "[Lclient!z;")
	private Class1_Sub1_Sub1_Sub1_Sub2[] aClass1_Sub1_Sub1_Sub1_Sub2Array1 = new Class1_Sub1_Sub1_Sub1_Sub2[16384];

	@OriginalMember(owner = "client!client", name = "ri", descriptor = "[I")
	private int[] anIntArray78 = new int[16384];

	@OriginalMember(owner = "client!client", name = "si", descriptor = "[I")
	private int[] anIntArray79 = new int[500];

	@OriginalMember(owner = "client!client", name = "ti", descriptor = "[I")
	private int[] anIntArray80 = new int[500];

	@OriginalMember(owner = "client!client", name = "ui", descriptor = "[I")
	private int[] anIntArray81 = new int[500];

	@OriginalMember(owner = "client!client", name = "vi", descriptor = "[I")
	private int[] anIntArray82 = new int[500];

	@OriginalMember(owner = "client!client", name = "wi", descriptor = "[I")
	private int[] anIntArray83 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

	@OriginalMember(owner = "client!client", name = "xi", descriptor = "Lclient!ob;")
	private Class29 aClass29_3 = new Class29(false);

	@OriginalMember(owner = "client!client", name = "zi", descriptor = "[I")
	private int[] anIntArray84 = new int[5];

	@OriginalMember(owner = "client!client", name = "Ai", descriptor = "[Z")
	private boolean[] aBooleanArray4 = new boolean[5];

	@OriginalMember(owner = "client!client", name = "Bi", descriptor = "I")
	private final int anInt395 = 100;

	@OriginalMember(owner = "client!client", name = "Ci", descriptor = "[I")
	private int[] anIntArray85 = new int[100];

	@OriginalMember(owner = "client!client", name = "Di", descriptor = "I")
	private int anInt396 = -1;

	@OriginalMember(owner = "client!client", name = "Ei", descriptor = "[J")
	private long[] aLongArray4 = new long[100];

	@OriginalMember(owner = "client!client", name = "Ki", descriptor = "Z")
	private boolean aBoolean93 = true;

	@OriginalMember(owner = "client!client", name = "Li", descriptor = "Lclient!d;")
	private Class6 aClass6_1 = new Class6();

	@OriginalMember(owner = "client!client", name = "Ni", descriptor = "[I")
	private int[] anIntArray86 = new int[9];

	@OriginalMember(owner = "client!client", name = "Oi", descriptor = "[[[Lclient!ob;")
	private Class29[][][] aClass29ArrayArrayArray1 = new Class29[4][104][104];

	@OriginalMember(owner = "client!client", name = "Pi", descriptor = "Ljava/lang/String;")
	private String aString17 = "";

	@OriginalMember(owner = "client!client", name = "Qi", descriptor = "I")
	private int anInt403 = 936;

	@OriginalMember(owner = "client!client", name = "Ri", descriptor = "[Lclient!ib;")
	private Class1_Sub1_Sub2_Sub2[] aClass1_Sub1_Sub2_Sub2Array7 = new Class1_Sub1_Sub2_Sub2[1000];

	@OriginalMember(owner = "client!client", name = "Si", descriptor = "I")
	private int anInt404 = -1;

	@OriginalMember(owner = "client!client", name = "Wi", descriptor = "I")
	private int anInt408 = -1;

	@OriginalMember(owner = "client!client", name = "Xi", descriptor = "I")
	private int anInt409 = -1;

	@OriginalMember(owner = "client!client", name = "Yi", descriptor = "Z")
	private boolean aBoolean94 = false;

	@OriginalMember(owner = "client!client", name = "bj", descriptor = "B")
	private byte aByte7 = -18;

	@OriginalMember(owner = "client!client", name = "hj", descriptor = "Z")
	private boolean aBoolean95 = false;

	@OriginalMember(owner = "client!client", name = "nj", descriptor = "[I")
	private int[] anIntArray88 = new int[256];

	@OriginalMember(owner = "client!client", name = "oj", descriptor = "Z")
	private boolean aBoolean96 = false;

	@OriginalMember(owner = "client!client", name = "pj", descriptor = "[I")
	private int[] anIntArray89 = new int[200];

	@OriginalMember(owner = "client!client", name = "qj", descriptor = "Z")
	private boolean aBoolean97 = false;

	@OriginalMember(owner = "client!client", name = "rj", descriptor = "[I")
	private int[] anIntArray90 = new int[4000];

	@OriginalMember(owner = "client!client", name = "sj", descriptor = "[I")
	private int[] anIntArray91 = new int[4000];

	@OriginalMember(owner = "client!client", name = "tj", descriptor = "[I")
	private int[] anIntArray92 = new int[151];

	static {
		@Pc(22) int local22 = 0;
		@Pc(24) int local24;
		for (local24 = 0; local24 < 99; local24++) {
			@Pc(29) int local29 = local24 + 1;
			@Pc(42) int local42 = (int) ((double) local29 + Math.pow(2.0D, (double) local29 / 7.0D) * 300.0D);
			local22 += local42;
			anIntArray51[local24] = local22 / 4;
		}
		anIntArrayArray6 = new int[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, 33697, 22433, 2983, 54193 }, { 8741, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003, 25239 }, { 25238, 8742, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };
		anIntArray54 = new int[] { 9104, 10275, 7595, 3610, 7975, 8526, 918, 38802, 24466, 10145, 58654, 5027, 1457, 16565, 34991, 25486 };
		aString13 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";
		anInt412 = -554;
		anIntArray87 = new int[32];
		local22 = 2;
		for (local24 = 0; local24 < 32; local24++) {
			anIntArray87[local24] = local22 - 1;
			local22 += local22;
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(III)Ljava/lang/String;")
	private static String method137(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
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
			signlink.reporterror("4765, " + arg0 + ", " + 2 + ", " + arg1 + ", " + local51.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(II)Ljava/lang/String;")
	private static String method157(@OriginalArg(1) int arg0) {
		try {
			if (arg0 < 100000) {
				return String.valueOf(arg0);
			} else if (arg0 < 10000000) {
				return arg0 / 1000 + "K";
			} else {
				return arg0 / 1000000 + "M";
			}
		} catch (@Pc(39) RuntimeException local39) {
			signlink.reporterror("53628, " + 0 + ", " + arg0 + ", " + local39.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "main", descriptor = "([Ljava/lang/String;)V")
	public static void main(@OriginalArg(0) String[] arg0) {
		try {
			System.out.println("RS2 user client - release #" + 282);
			if (arg0.length == 5) {
				anInt247 = Integer.parseInt(arg0[0]);
				anInt248 = Integer.parseInt(arg0[1]);
				if (arg0[2].equals("lowmem")) {
					method209();
				} else if (arg0[2].equals("highmem")) {
					method174(anInt293);
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
				signlink.anInt938 = Integer.parseInt(arg0[4]);
				signlink.startpriv(InetAddress.getLocalHost());
				@Pc(87) client local87 = new client();
				local87.method83();
			} else {
				System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
			}
		} catch (@Pc(94) Exception local94) {
		}
	}

	@OriginalMember(owner = "client!client", name = "x", descriptor = "(I)V")
	private static void method174(@OriginalArg(0) int arg0) {
		try {
			Class37.aBoolean219 = false;
			Class1_Sub1_Sub2_Sub1.aBoolean158 = false;
			aBoolean71 = false;
			Class4.aBoolean45 = false;
			if (arg0 != 0) {
				aBoolean89 = true;
			}
		} catch (@Pc(17) RuntimeException local17) {
			signlink.reporterror("82524, " + arg0 + ", " + local17.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(II)Ljava/lang/String;")
	private static String method193(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(4) String local4 = String.valueOf(arg0);
			@Pc(8) boolean local8 = false;
			for (@Pc(13) int local13 = local4.length() - 3; local13 > 0; local13 -= 3) {
				local4 = local4.substring(0, local13) + "," + local4.substring(local13);
			}
			if (local4.length() > 8) {
				local4 = "@gre@" + local4.substring(0, local4.length() - 8) + " million @whi@(" + local4 + ")";
			} else if (local4.length() > 4) {
				local4 = "@cya@" + local4.substring(0, local4.length() - 4) + "K @whi@(" + local4 + ")";
			}
			return " " + local4;
		} catch (@Pc(93) RuntimeException local93) {
			signlink.reporterror("66476, " + arg0 + ", " + arg1 + ", " + local93.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "G", descriptor = "(I)V")
	private static void method209() {
		try {
			Class37.aBoolean219 = true;
			Class1_Sub1_Sub2_Sub1.aBoolean158 = true;
			aBoolean71 = true;
			Class4.aBoolean45 = true;
		} catch (@Pc(18) RuntimeException local18) {
			signlink.reporterror("6531, " + -3259 + ", " + local18.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ZIIIIIILclient!d;B)V")
	private void method96(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) Class6 arg7, @OriginalArg(8) byte arg8) {
		try {
			@Pc(6) boolean local6 = false;
			if (this.aBoolean64) {
				this.anInt246 = 32;
			} else {
				this.anInt246 = 0;
			}
			this.aBoolean64 = false;
			if (arg2 >= arg4 && arg2 < arg4 + 16 && arg6 >= arg1 && arg6 < arg1 + 16) {
				arg7.anInt431 -= this.anInt347 * 4;
				if (arg0) {
					this.aBoolean88 = true;
					return;
				}
			} else if (arg2 >= arg4 && arg2 < arg4 + 16 && arg6 >= arg1 + arg3 - 16 && arg6 < arg1 + arg3) {
				arg7.anInt431 += this.anInt347 * 4;
				if (arg0) {
					this.aBoolean88 = true;
					return;
				}
			} else if (arg2 >= arg4 - this.anInt246 && arg2 < arg4 + this.anInt246 + 16 && arg6 >= arg1 + 16 && arg6 < arg1 + arg3 - 16 && this.anInt347 > 0) {
				@Pc(127) int local127 = (arg3 - 32) * arg3 / arg5;
				if (local127 < 8) {
					local127 = 8;
				}
				@Pc(142) int local142 = arg6 - arg1 - local127 / 2 - 16;
				@Pc(148) int local148 = arg3 - local127 - 32;
				arg7.anInt431 = (arg5 - arg3) * local142 / local148;
				if (arg0) {
					this.aBoolean88 = true;
				}
				this.aBoolean64 = true;
			} else {
				return;
			}
		} catch (@Pc(167) RuntimeException local167) {
			signlink.reporterror("94287, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + local167.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILclient!d;)V")
	private void method97(@OriginalArg(0) int arg0, @OriginalArg(1) Class6 arg1) {
		try {
			@Pc(5) boolean local5 = false;
			@Pc(8) int local8 = arg1.anInt424;
			@Pc(64) int local64;
			if ((local8 < 1 || local8 > 100) && (local8 < 701 || local8 > 800)) {
				if (local8 >= 101 && local8 <= 200 || local8 >= 801 && local8 <= 900) {
					local64 = this.anInt217;
					if (this.anInt218 != 2) {
						local64 = 0;
					}
					if (local8 > 800) {
						local8 -= 701;
					} else {
						local8 -= 101;
					}
					if (local8 >= local64) {
						arg1.aString18 = "";
						arg1.anInt423 = 0;
					} else {
						if (this.anIntArray89[local8] == 0) {
							arg1.aString18 = "@red@Offline";
						} else if (this.anIntArray89[local8] == anInt247) {
							arg1.aString18 = "@gre@World-" + (this.anIntArray89[local8] - 9);
						} else {
							arg1.aString18 = "@yel@World-" + (this.anIntArray89[local8] - 9);
						}
						arg1.anInt423 = 1;
					}
				} else if (local8 == 203) {
					local64 = this.anInt217;
					if (this.anInt218 != 2) {
						local64 = 0;
					}
					arg1.anInt430 = local64 * 15 + 20;
					if (arg1.anInt430 <= arg1.anInt426) {
						arg1.anInt430 = arg1.anInt426 + 1;
					}
				} else if (local8 >= 401 && local8 <= 500) {
					local8 -= 401;
					if (local8 == 0 && this.anInt218 == 0) {
						arg1.aString18 = "Loading ignore list";
						arg1.anInt423 = 0;
					} else if (local8 == 1 && this.anInt218 == 0) {
						arg1.aString18 = "Please wait...";
						arg1.anInt423 = 0;
					} else {
						local64 = this.anInt252;
						if (this.anInt218 == 0) {
							local64 = 0;
						}
						if (local8 >= local64) {
							arg1.aString18 = "";
							arg1.anInt423 = 0;
						} else {
							arg1.aString18 = Class48.method665(Class48.method662(this.aLongArray4[local8]));
							arg1.anInt423 = 1;
						}
					}
				} else if (local8 == 503) {
					arg1.anInt430 = this.anInt252 * 15 + 20;
					if (arg1.anInt430 <= arg1.anInt426) {
						arg1.anInt430 = arg1.anInt426 + 1;
					}
				} else if (local8 == 327) {
					arg1.anInt446 = 150;
					arg1.anInt447 = (int) (Math.sin((double) anInt265 / 40.0D) * 256.0D) & 0x7FF;
					if (this.aBoolean96) {
						for (local64 = 0; local64 < 7; local64++) {
							@Pc(333) int local333 = this.anIntArray40[local64];
							if (local333 >= 0 && !Class23.aClass23Array1[local333].method492()) {
								return;
							}
						}
						this.aBoolean96 = false;
						@Pc(352) Class1_Sub1_Sub1_Sub5[] local352 = new Class1_Sub1_Sub1_Sub5[7];
						@Pc(354) int local354 = 0;
						for (@Pc(356) int local356 = 0; local356 < 7; local356++) {
							@Pc(363) int local363 = this.anIntArray40[local356];
							if (local363 >= 0) {
								local352[local354++] = Class23.aClass23Array1[local363].method493();
							}
						}
						@Pc(385) Class1_Sub1_Sub1_Sub5 local385 = new Class1_Sub1_Sub1_Sub5((byte) 3, local354, local352);
						for (@Pc(387) int local387 = 0; local387 < 5; local387++) {
							if (this.anIntArray42[local387] != 0) {
								local385.method274(anIntArrayArray6[local387][0], anIntArrayArray6[local387][this.anIntArray42[local387]]);
								if (local387 == 1) {
									local385.method274(anIntArray54[0], anIntArray54[this.anIntArray42[local387]]);
								}
							}
						}
						local385.method267();
						local385.method268(Class27.aClass27Array1[aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt990].anIntArray222[0]);
						local385.method277(64, 850, -30, -50, -30, true);
						arg1.anInt439 = 5;
						arg1.anInt440 = 0;
						Class6.method234(local385);
					}
				} else if (local8 == 324) {
					if (this.aClass1_Sub1_Sub2_Sub2_9 == null) {
						this.aClass1_Sub1_Sub2_Sub2_9 = arg1.aClass1_Sub1_Sub2_Sub2_14;
						this.aClass1_Sub1_Sub2_Sub2_10 = arg1.aClass1_Sub1_Sub2_Sub2_15;
					}
					if (this.aBoolean79) {
						arg1.aClass1_Sub1_Sub2_Sub2_14 = this.aClass1_Sub1_Sub2_Sub2_10;
					} else {
						arg1.aClass1_Sub1_Sub2_Sub2_14 = this.aClass1_Sub1_Sub2_Sub2_9;
					}
				} else if (local8 == 325) {
					if (this.aClass1_Sub1_Sub2_Sub2_9 == null) {
						this.aClass1_Sub1_Sub2_Sub2_9 = arg1.aClass1_Sub1_Sub2_Sub2_14;
						this.aClass1_Sub1_Sub2_Sub2_10 = arg1.aClass1_Sub1_Sub2_Sub2_15;
					}
					if (this.aBoolean79) {
						arg1.aClass1_Sub1_Sub2_Sub2_14 = this.aClass1_Sub1_Sub2_Sub2_9;
					} else {
						arg1.aClass1_Sub1_Sub2_Sub2_14 = this.aClass1_Sub1_Sub2_Sub2_10;
					}
				} else if (local8 == 600) {
					arg1.aString18 = this.aString8;
					if (anInt265 % 20 < 10) {
						arg1.aString18 = arg1.aString18 + "|";
					} else {
						arg1.aString18 = arg1.aString18 + " ";
					}
				} else {
					if (local8 == 613) {
						if (this.anInt329 < 1) {
							arg1.aString18 = "";
						} else if (this.aBoolean95) {
							arg1.anInt435 = 16711680;
							arg1.aString18 = "Moderator option: Mute player for 48 hours: <ON>";
						} else {
							arg1.anInt435 = 16777215;
							arg1.aString18 = "Moderator option: Mute player for 48 hours: <OFF>";
						}
					}
					@Pc(593) String local593;
					if (local8 == 650 || local8 == 655) {
						if (this.anInt204 == 0) {
							arg1.aString18 = "";
						} else {
							if (this.anInt296 == 0) {
								local593 = "earlier today";
							} else if (this.anInt296 == 1) {
								local593 = "yesterday";
							} else {
								local593 = this.anInt296 + " days ago";
							}
							arg1.aString18 = "You last logged in " + local593 + " from: " + signlink.dns;
						}
					}
					if (local8 == 651) {
						if (this.anInt334 == 0) {
							arg1.aString18 = "0 unread messages";
							arg1.anInt435 = 16776960;
						}
						if (this.anInt334 == 1) {
							arg1.aString18 = "1 unread message";
							arg1.anInt435 = 65280;
						}
						if (this.anInt334 > 1) {
							arg1.aString18 = this.anInt334 + " unread messages";
							arg1.anInt435 = 65280;
						}
					}
					if (local8 == 652) {
						if (this.anInt232 == 201) {
							if (this.anInt402 == 1) {
								arg1.aString18 = "@yel@This is a non-members world: @whi@Since you are a member we";
							} else {
								arg1.aString18 = "";
							}
						} else if (this.anInt232 == 200) {
							arg1.aString18 = "You have not yet set any password recovery questions.";
						} else {
							if (this.anInt232 == 0) {
								local593 = "Earlier today";
							} else if (this.anInt232 == 1) {
								local593 = "Yesterday";
							} else {
								local593 = this.anInt232 + " days ago";
							}
							arg1.aString18 = local593 + " you changed your recovery questions";
						}
					}
					if (local8 == 653) {
						if (this.anInt232 == 201) {
							if (this.anInt402 == 1) {
								arg1.aString18 = "@whi@recommend you use a members world instead. You may use";
							} else {
								arg1.aString18 = "";
							}
						} else if (this.anInt232 == 200) {
							arg1.aString18 = "We strongly recommend you do so now to secure your account.";
						} else {
							arg1.aString18 = "If you do not remember making this change then cancel it immediately";
						}
					}
					if (local8 == 654) {
						if (this.anInt232 == 201) {
							if (this.anInt402 == 1) {
								arg1.aString18 = "@whi@this world but member benefits are unavailable whilst here.";
							} else {
								arg1.aString18 = "";
							}
						} else if (this.anInt232 == 200) {
							arg1.aString18 = "Do this from the 'account management' area on our front webpage";
						} else {
							arg1.aString18 = "Do this from the 'account management' area on our front webpage";
						}
					}
				}
			} else if (local8 == 1 && this.anInt218 == 0) {
				arg1.aString18 = "Loading friend list";
				arg1.anInt423 = 0;
			} else if (local8 == 1 && this.anInt218 == 1) {
				arg1.aString18 = "Connecting to friendserver";
				arg1.anInt423 = 0;
			} else if (local8 == 2 && this.anInt218 != 2) {
				arg1.aString18 = "Please wait...";
				arg1.anInt423 = 0;
			} else {
				local64 = this.anInt217;
				if (this.anInt218 != 2) {
					local64 = 0;
				}
				if (local8 > 700) {
					local8 -= 601;
				} else {
					local8--;
				}
				if (local8 >= local64) {
					arg1.aString18 = "";
					arg1.anInt423 = 0;
				} else {
					arg1.aString18 = this.aStringArray5[local8];
					arg1.anInt423 = 1;
				}
			}
		} catch (@Pc(801) RuntimeException local801) {
			signlink.reporterror("24086, " + arg0 + ", " + arg1 + ", " + local801.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!d;B)Z")
	private boolean method98(@OriginalArg(0) Class6 arg0, @OriginalArg(1) byte arg1) {
		try {
			if (arg0.anIntArray95 == null) {
				return false;
			}
			for (@Pc(8) int local8 = 0; local8 < arg0.anIntArray95.length; local8++) {
				@Pc(16) int local16 = this.method213(arg0, local8);
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
			@Pc(70) boolean local70 = false;
			return true;
		} catch (@Pc(78) RuntimeException local78) {
			signlink.reporterror("98895, " + arg0 + ", " + arg1 + ", " + local78.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Z)V")
	private void method99() {
		try {
			if (this.anInt267 == 0 && super.anInt199 == 1) {
				@Pc(19) int local19 = super.anInt200 - 25 - 550;
				@Pc(26) int local26 = super.anInt201 - 5 - 4;
				if (local19 >= 0 && local26 >= 0 && local19 < 146 && local26 < 151) {
					local19 -= 73;
					local26 -= 75;
					@Pc(46) int local46 = this.anInt384 + this.anInt337 & 0x7FF;
					@Pc(50) int local50 = Class1_Sub1_Sub2_Sub1.anIntArray175[local46];
					@Pc(54) int local54 = Class1_Sub1_Sub2_Sub1.anIntArray176[local46];
					@Pc(63) int local63 = local50 * (this.anInt260 + 256) >> 8;
					@Pc(72) int local72 = local54 * (this.anInt260 + 256) >> 8;
					@Pc(82) int local82 = local26 * local63 + local19 * local72 >> 11;
					@Pc(92) int local92 = local26 * local72 - local19 * local63 >> 11;
					@Pc(99) int local99 = aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt986 + local82 >> 7;
					@Pc(106) int local106 = aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt987 - local92 >> 7;
					@Pc(127) boolean local127 = this.method181(true, 0, aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray270[0], 0, aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray269[0], 0, local99, 0, local106, 0, 1);
					if (local127) {
						this.aClass1_Sub1_Sub3_2.method464(local19);
						this.aClass1_Sub1_Sub3_2.method464(local26);
						this.aClass1_Sub1_Sub3_2.method465(this.anInt384);
						this.aClass1_Sub1_Sub3_2.method464(57);
						this.aClass1_Sub1_Sub3_2.method464(this.anInt337);
						this.aClass1_Sub1_Sub3_2.method464(this.anInt260);
						this.aClass1_Sub1_Sub3_2.method464(89);
						this.aClass1_Sub1_Sub3_2.method465(aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt986);
						this.aClass1_Sub1_Sub3_2.method465(aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt987);
						this.aClass1_Sub1_Sub3_2.method464(this.anInt354);
						this.aClass1_Sub1_Sub3_2.method464(63);
						return;
					}
				}
			}
		} catch (@Pc(181) RuntimeException local181) {
			signlink.reporterror("18089, " + false + ", " + local181.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "f", descriptor = "(I)V")
	private void method100() {
		try {
			anInt369++;
			if (anInt369 > 192) {
				anInt369 = 0;
				this.aClass1_Sub1_Sub3_2.method463(230);
				this.aClass1_Sub1_Sub3_2.method464(232);
			}
			while (true) {
				@Pc(26) int local26;
				do {
					while (true) {
						local26 = this.method87();
						if (local26 == -1) {
							return;
						}
						if (this.anInt396 != -1 && this.anInt396 == this.anInt404) {
							if (local26 == 8 && this.aString8.length() > 0) {
								this.aString8 = this.aString8.substring(0, this.aString8.length() - 1);
							}
							break;
						}
						@Pc(206) int local206;
						if (this.aBoolean60) {
							if (local26 >= 32 && local26 <= 122 && this.aString5.length() < 80) {
								this.aString5 = this.aString5 + (char) local26;
								this.aBoolean75 = true;
							}
							if (local26 == 8 && this.aString5.length() > 0) {
								this.aString5 = this.aString5.substring(0, this.aString5.length() - 1);
								this.aBoolean75 = true;
							}
							if (local26 == 13 || local26 == 10) {
								this.aBoolean60 = false;
								this.aBoolean75 = true;
								@Pc(166) long local166;
								if (this.anInt238 == 1) {
									local166 = Class48.method661(this.aString5);
									this.method116(local166);
								}
								if (this.anInt238 == 2 && this.anInt217 > 0) {
									local166 = Class48.method661(this.aString5);
									this.method121(local166);
								}
								if (this.anInt238 == 3 && this.aString5.length() > 0) {
									this.aClass1_Sub1_Sub3_2.method463(139);
									this.aClass1_Sub1_Sub3_2.method464(0);
									local206 = this.aClass1_Sub1_Sub3_2.anInt738;
									this.aClass1_Sub1_Sub3_2.method470(this.aLong16);
									Class49.method679(this.aString5, this.aClass1_Sub1_Sub3_2);
									this.aClass1_Sub1_Sub3_2.method473(this.aClass1_Sub1_Sub3_2.anInt738 - local206);
									this.aString5 = Class48.method666(this.aString5);
									this.aString5 = Class42.method598(this.aString5);
									this.method217(this.aByte2, Class48.method665(Class48.method662(this.aLong16)), this.aString5, 6);
									if (this.anInt355 == 2) {
										this.anInt355 = 1;
										this.aBoolean67 = true;
										this.aClass1_Sub1_Sub3_2.method463(154);
										this.aClass1_Sub1_Sub3_2.method464(this.anInt415);
										this.aClass1_Sub1_Sub3_2.method464(this.anInt355);
										this.aClass1_Sub1_Sub3_2.method464(this.anInt225);
									}
								}
								if (this.anInt238 == 4 && this.anInt252 < 100) {
									local166 = Class48.method661(this.aString5);
									this.method216(local166);
								}
								if (this.anInt238 == 5 && this.anInt252 > 0) {
									local166 = Class48.method661(this.aString5);
									this.method204(local166);
								}
							}
						} else if (this.aBoolean94) {
							if (local26 >= 48 && local26 <= 57 && this.aString4.length() < 10) {
								this.aString4 = this.aString4 + (char) local26;
								this.aBoolean75 = true;
							}
							if (local26 == 8 && this.aString4.length() > 0) {
								this.aString4 = this.aString4.substring(0, this.aString4.length() - 1);
								this.aBoolean75 = true;
							}
							if (local26 == 13 || local26 == 10) {
								if (this.aString4.length() > 0) {
									local206 = 0;
									try {
										local206 = Integer.parseInt(this.aString4);
									} catch (@Pc(383) Exception local383) {
									}
									this.aClass1_Sub1_Sub3_2.method463(102);
									this.aClass1_Sub1_Sub3_2.method468(local206);
								}
								this.aBoolean94 = false;
								this.aBoolean75 = true;
							}
						} else if (this.anInt392 == -1) {
							if (local26 >= 32 && local26 <= 122 && this.aString17.length() < 80) {
								this.aString17 = this.aString17 + (char) local26;
								this.aBoolean75 = true;
							}
							if (local26 == 8 && this.aString17.length() > 0) {
								this.aString17 = this.aString17.substring(0, this.aString17.length() - 1);
								this.aBoolean75 = true;
							}
							if ((local26 == 13 || local26 == 10) && this.aString17.length() > 0) {
								if (this.anInt329 == 2) {
									if (this.aString17.equals("::clientdrop")) {
										this.method183();
									}
									if (this.aString17.equals("::lag")) {
										this.method108();
									}
									if (this.aString17.equals("::prefetchmusic")) {
										for (local206 = 0; local206 < this.aClass44_Sub1_1.method632(2); local206++) {
											this.aClass44_Sub1_1.method642(local206, (byte) 1, 2);
										}
									}
								}
								if (this.aString17.startsWith("::")) {
									this.aClass1_Sub1_Sub3_2.method463(224);
									this.aClass1_Sub1_Sub3_2.method464(this.aString17.length() - 1);
									this.aClass1_Sub1_Sub3_2.method471(this.aString17.substring(2));
								} else {
									@Pc(534) byte local534 = 0;
									if (this.aString17.startsWith("yellow:")) {
										local534 = 0;
										this.aString17 = this.aString17.substring(7);
									}
									if (this.aString17.startsWith("red:")) {
										local534 = 1;
										this.aString17 = this.aString17.substring(4);
									}
									if (this.aString17.startsWith("green:")) {
										local534 = 2;
										this.aString17 = this.aString17.substring(6);
									}
									if (this.aString17.startsWith("cyan:")) {
										local534 = 3;
										this.aString17 = this.aString17.substring(5);
									}
									if (this.aString17.startsWith("purple:")) {
										local534 = 4;
										this.aString17 = this.aString17.substring(7);
									}
									if (this.aString17.startsWith("white:")) {
										local534 = 5;
										this.aString17 = this.aString17.substring(6);
									}
									if (this.aString17.startsWith("flash1:")) {
										local534 = 6;
										this.aString17 = this.aString17.substring(7);
									}
									if (this.aString17.startsWith("flash2:")) {
										local534 = 7;
										this.aString17 = this.aString17.substring(7);
									}
									if (this.aString17.startsWith("flash3:")) {
										local534 = 8;
										this.aString17 = this.aString17.substring(7);
									}
									if (this.aString17.startsWith("glow1:")) {
										local534 = 9;
										this.aString17 = this.aString17.substring(6);
									}
									if (this.aString17.startsWith("glow2:")) {
										local534 = 10;
										this.aString17 = this.aString17.substring(6);
									}
									if (this.aString17.startsWith("glow3:")) {
										local534 = 11;
										this.aString17 = this.aString17.substring(6);
									}
									@Pc(692) byte local692 = 0;
									if (this.aString17.startsWith("wave:")) {
										local692 = 1;
										this.aString17 = this.aString17.substring(5);
									}
									if (this.aString17.startsWith("scroll:")) {
										local692 = 2;
										this.aString17 = this.aString17.substring(7);
									}
									this.aClass1_Sub1_Sub3_2.method463(253);
									this.aClass1_Sub1_Sub3_2.method464(0);
									@Pc(731) int local731 = this.aClass1_Sub1_Sub3_2.anInt738;
									this.aClass1_Sub1_Sub3_2.method464(local534);
									this.aClass1_Sub1_Sub3_2.method464(local692);
									Class49.method679(this.aString17, this.aClass1_Sub1_Sub3_2);
									this.aClass1_Sub1_Sub3_2.method473(this.aClass1_Sub1_Sub3_2.anInt738 - local731);
									this.aString17 = Class48.method666(this.aString17);
									this.aString17 = Class42.method598(this.aString17);
									aClass1_Sub1_Sub1_Sub1_Sub1_1.aString31 = this.aString17;
									aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt998 = local534;
									aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt999 = local692;
									aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt997 = 150;
									if (this.anInt329 == 2) {
										this.method217(this.aByte2, "@cr2@" + aClass1_Sub1_Sub1_Sub1_Sub1_1.aString3, aClass1_Sub1_Sub1_Sub1_Sub1_1.aString31, 2);
									} else if (this.anInt329 == 1) {
										this.method217(this.aByte2, "@cr1@" + aClass1_Sub1_Sub1_Sub1_Sub1_1.aString3, aClass1_Sub1_Sub1_Sub1_Sub1_1.aString31, 2);
									} else {
										this.method217(this.aByte2, aClass1_Sub1_Sub1_Sub1_Sub1_1.aString3, aClass1_Sub1_Sub1_Sub1_Sub1_1.aString31, 2);
									}
									if (this.anInt415 == 2) {
										this.anInt415 = 3;
										this.aBoolean67 = true;
										this.aClass1_Sub1_Sub3_2.method463(154);
										this.aClass1_Sub1_Sub3_2.method464(this.anInt415);
										this.aClass1_Sub1_Sub3_2.method464(this.anInt355);
										this.aClass1_Sub1_Sub3_2.method464(this.anInt225);
									}
								}
								this.aString17 = "";
								this.aBoolean75 = true;
							}
						}
					}
				} while ((local26 < 97 || local26 > 122) && (local26 < 65 || local26 > 90) && (local26 < 48 || local26 > 57) && local26 != 32);
				if (this.aString8.length() < 12) {
					this.aString8 = this.aString8 + (char) local26;
				}
			}
		} catch (@Pc(870) RuntimeException local870) {
			signlink.reporterror("7643, " + 0 + ", " + local870.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(I[BZ)V")
	private void method101(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) boolean arg2) {
		try {
			while (arg0 >= 0) {
				this.anInt302 = -1;
			}
			signlink.anInt943 = arg2 ? 1 : 0;
			signlink.midisave(arg1, arg1.length);
		} catch (@Pc(18) RuntimeException local18) {
			signlink.reporterror("81583, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local18.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IILclient!lb;)V")
	private void method102(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class1_Sub1_Sub3 arg2) {
		try {
			while (true) {
				if (arg2.anInt739 + 10 < arg0 * 8) {
					@Pc(12) int local12 = arg2.method485(11);
					if (local12 != 2047) {
						if (this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local12] == null) {
							this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local12] = new Class1_Sub1_Sub1_Sub1_Sub1();
							if (this.aClass1_Sub1_Sub3Array1[local12] != null) {
								this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local12].method39(this.aClass1_Sub1_Sub3Array1[local12]);
							}
						}
						this.anIntArray49[this.anInt273++] = local12;
						@Pc(58) Class1_Sub1_Sub1_Sub1_Sub1 local58 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local12];
						local58.anInt1026 = anInt265;
						@Pc(66) int local66 = arg2.method485(5);
						if (local66 > 15) {
							local66 -= 32;
						}
						@Pc(75) int local75 = arg2.method485(5);
						if (local75 > 15) {
							local75 -= 32;
						}
						@Pc(84) int local84 = arg2.method485(1);
						local58.method672(aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray269[0] + local66, local84 == 1, aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray270[0] + local75);
						@Pc(110) int local110 = arg2.method485(1);
						if (local110 == 1) {
							this.anIntArray50[this.anInt274++] = local12;
						}
						continue;
					}
				}
				arg2.method486();
				@Pc(133) boolean local133 = false;
				return;
			}
		} catch (@Pc(135) RuntimeException local135) {
			signlink.reporterror("83283, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local135.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILjava/lang/String;)Z")
	private boolean method103(@OriginalArg(1) String arg0) {
		try {
			if (arg0 == null) {
				return false;
			}
			for (@Pc(7) int local7 = 0; local7 < this.anInt217; local7++) {
				if (arg0.equalsIgnoreCase(this.aStringArray5[local7])) {
					return true;
				}
			}
			return arg0.equalsIgnoreCase(aClass1_Sub1_Sub1_Sub1_Sub1_1.aString3);
		} catch (@Pc(43) RuntimeException local43) {
			signlink.reporterror("67389, " + 2 + ", " + arg0 + ", " + local43.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIIIIIIII)V")
	private void method104(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		try {
			this.anInt301 += 0;
			@Pc(7) Class1_Sub2 local7 = null;
			for (@Pc(12) Class1_Sub2 local12 = (Class1_Sub2) this.aClass29_3.method505(); local12 != null; local12 = (Class1_Sub2) this.aClass29_3.method507()) {
				if (local12.anInt779 == arg5 && local12.anInt781 == arg4 && local12.anInt782 == arg7 && local12.anInt780 == arg6) {
					local7 = local12;
					break;
				}
			}
			if (local7 == null) {
				local7 = new Class1_Sub2();
				local7.anInt779 = arg5;
				local7.anInt780 = arg6;
				local7.anInt781 = arg4;
				local7.anInt782 = arg7;
				this.method189(local7);
				this.aClass29_3.method502(local7);
			}
			local7.anInt786 = arg8;
			local7.anInt788 = arg3;
			local7.anInt787 = arg2;
			local7.anInt789 = arg1;
			local7.anInt790 = arg0;
		} catch (@Pc(84) RuntimeException local84) {
			signlink.reporterror("92322, " + arg0 + ", " + arg1 + ", " + 0 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + local84.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/String;)Ljava/io/DataInputStream;")
	private DataInputStream method105(@OriginalArg(0) String arg0) throws IOException {
		if (this.aBoolean69) {
			if (this.aSocket1 != null) {
				try {
					this.aSocket1.close();
				} catch (@Pc(26) Exception local26) {
				}
				this.aSocket1 = null;
			}
			this.aSocket1 = this.method185(43595);
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

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(Z)V")
	private void method106() {
		try {
			this.aClass35_16.method518(979);
			@Pc(18) int local18;
			@Pc(20) int local20;
			if (this.anInt267 == 2) {
				@Pc(13) byte[] local13 = this.aClass1_Sub1_Sub2_Sub3_9.aByteArray7;
				@Pc(15) int[] local15 = Class1_Sub1_Sub2.anIntArray210;
				local18 = local13.length;
				for (local20 = 0; local20 < local18; local20++) {
					if (local13[local20] == 0) {
						local15[local20] = 0;
					}
				}
				this.aClass1_Sub1_Sub2_Sub2_6.method392(33, 25, this.anIntArray48, 25, this.anIntArray53, 0, 33, 256, 0, this.anInt384);
				this.aClass35_17.method518(979);
			} else {
				@Pc(64) int local64 = this.anInt384 + this.anInt337 & 0x7FF;
				@Pc(71) int local71 = aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt986 / 32 + 48;
				local18 = 464 - aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt987 / 32;
				this.aClass1_Sub1_Sub2_Sub2_1.method392(146, local71, this.anIntArray67, local18, this.anIntArray92, 5, 151, this.anInt260 + 256, 25, local64);
				this.aClass1_Sub1_Sub2_Sub2_6.method392(33, 25, this.anIntArray48, 25, this.anIntArray53, 0, 33, 256, 0, this.anInt384);
				for (local20 = 0; local20 < this.anInt341; local20++) {
					local71 = this.anIntArray64[local20] * 4 + 2 - aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt986 / 32;
					local18 = this.anIntArray65[local20] * 4 + 2 - aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt987 / 32;
					this.method226(this.aClass1_Sub1_Sub2_Sub2Array7[local20], local71, local18);
				}
				@Pc(170) int local170;
				for (@Pc(166) int local166 = 0; local166 < 104; local166++) {
					for (local170 = 0; local170 < 104; local170++) {
						@Pc(182) Class29 local182 = this.aClass29ArrayArrayArray1[this.anInt245][local166][local170];
						if (local182 != null) {
							local71 = local166 * 4 + 2 - aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt986 / 32;
							local18 = local170 * 4 + 2 - aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt987 / 32;
							this.method226(this.aClass1_Sub1_Sub2_Sub2_2, local71, local18);
						}
					}
				}
				for (local170 = 0; local170 < this.anInt393; local170++) {
					@Pc(233) Class1_Sub1_Sub1_Sub1_Sub2 local233 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[this.anIntArray78[local170]];
					if (local233 != null && local233.method675() && local233.aClass13_2.aBoolean151) {
						local71 = local233.anInt986 / 32 - aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt986 / 32;
						local18 = local233.anInt987 / 32 - aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt987 / 32;
						this.method226(this.aClass1_Sub1_Sub2_Sub2_3, local71, local18);
					}
				}
				@Pc(287) Class1_Sub1_Sub1_Sub1_Sub1 local287;
				for (@Pc(277) int local277 = 0; local277 < this.anInt273; local277++) {
					local287 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[this.anIntArray49[local277]];
					if (local287 != null && local287.method675()) {
						local71 = local287.anInt986 / 32 - aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt986 / 32;
						local18 = local287.anInt987 / 32 - aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt987 / 32;
						@Pc(315) boolean local315 = false;
						@Pc(319) long local319 = Class48.method661(local287.aString3);
						for (@Pc(321) int local321 = 0; local321 < this.anInt217; local321++) {
							if (local319 == this.aLongArray3[local321] && this.anIntArray89[local321] != 0) {
								local315 = true;
								break;
							}
						}
						if (aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt142 != 0 && local287.anInt142 != 0) {
							if (aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt142 == local287.anInt142) {
								local315 = true;
							} else {
								local315 = false;
							}
						}
						if (local315) {
							this.method226(this.aClass1_Sub1_Sub2_Sub2_5, local71, local18);
						} else {
							this.method226(this.aClass1_Sub1_Sub2_Sub2_4, local71, local18);
						}
					}
				}
				if (this.anInt297 != 0 && anInt265 % 20 < 10) {
					if (this.anInt297 == 1 && this.anInt249 >= 0 && this.anInt249 < this.aClass1_Sub1_Sub1_Sub1_Sub2Array1.length) {
						@Pc(411) Class1_Sub1_Sub1_Sub1_Sub2 local411 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[this.anInt249];
						if (local411 != null) {
							local71 = local411.anInt986 / 32 - aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt986 / 32;
							local18 = local411.anInt987 / 32 - aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt987 / 32;
							this.method187(local18, this.aClass1_Sub1_Sub2_Sub2_12, local71);
						}
					}
					if (this.anInt297 == 2) {
						local71 = (this.anInt240 - this.anInt278) * 4 + 2 - aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt986 / 32;
						local18 = (this.anInt241 - this.anInt279) * 4 + 2 - aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt987 / 32;
						this.method187(local18, this.aClass1_Sub1_Sub2_Sub2_12, local71);
					}
					if (this.anInt297 == 10 && this.anInt413 >= 0 && this.anInt413 < this.aClass1_Sub1_Sub1_Sub1_Sub1Array1.length) {
						local287 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[this.anInt413];
						if (local287 != null) {
							local71 = local287.anInt986 / 32 - aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt986 / 32;
							local18 = local287.anInt987 / 32 - aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt987 / 32;
							this.method187(local18, this.aClass1_Sub1_Sub2_Sub2_12, local71);
						}
					}
				}
				if (this.anInt229 != 0) {
					local71 = this.anInt229 * 4 + 2 - aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt986 / 32;
					local18 = this.anInt230 * 4 + 2 - aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt987 / 32;
					this.method226(this.aClass1_Sub1_Sub2_Sub2_11, local71, local18);
				}
				Class1_Sub1_Sub2.method436(97, 16777215, 3, 3, 78);
				this.aClass35_17.method518(979);
			}
		} catch (@Pc(576) RuntimeException local576) {
			signlink.reporterror("5846, " + true + ", " + local576.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "g", descriptor = "(I)Ljava/lang/String;")
	private String method107() {
		try {
			if (signlink.mainapp == null) {
				return super.aFrame_Sub1_2 == null ? super.getDocumentBase().getHost().toLowerCase() : "runescape.com";
			} else {
				return signlink.mainapp.getDocumentBase().getHost().toLowerCase();
			}
		} catch (@Pc(30) RuntimeException local30) {
			signlink.reporterror("28136, " + -834 + ", " + local30.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(B)V")
	private void method108() {
		try {
			System.out.println("============");
			System.out.println("flame-cycle:" + this.anInt299);
			if (this.aClass44_Sub1_1 != null) {
				System.out.println("Od-cycle:" + this.aClass44_Sub1_1.anInt960);
			}
			System.out.println("loop-cycle:" + anInt265);
			System.out.println("draw-cycle:" + anInt250);
			System.out.println("ptype:" + this.anInt302);
			System.out.println("psize:" + this.anInt301);
			if (this.aClass8_1 != null) {
				this.aClass8_1.method251();
			}
			super.aBoolean55 = true;
		} catch (@Pc(80) RuntimeException local80) {
			signlink.reporterror("33013, " + 2 + ", " + local80.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(I)Ljava/awt/Component;")
	@Override
	protected Component method93() {
		try {
			if (signlink.mainapp == null) {
				return super.aFrame_Sub1_2 == null ? this : super.aFrame_Sub1_2;
			} else {
				return signlink.mainapp;
			}
		} catch (@Pc(18) RuntimeException local18) {
			signlink.reporterror("2681, " + 37639 + ", " + local18.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "h", descriptor = "(I)V")
	private void method109() {
		try {
			if (this.anInt237 != 0) {
				@Pc(5) int local5 = 0;
				if (this.anInt405 != 0) {
					local5 = 1;
				}
				for (@Pc(12) int local12 = 0; local12 < 100; local12++) {
					if (this.aStringArray4[local12] != null) {
						@Pc(24) int local24 = this.anIntArray63[local12];
						@Pc(29) String local29 = this.aStringArray3[local12];
						if (local29 != null && local29.startsWith("@cr1@")) {
							local29 = local29.substring(5);
						}
						if (local29 != null && local29.startsWith("@cr2@")) {
							local29 = local29.substring(5);
						}
						if ((local24 == 3 || local24 == 7) && (local24 == 7 || this.anInt355 == 0 || this.anInt355 == 1 && this.method103(local29))) {
							@Pc(82) int local82 = 329 - local5 * 13;
							if (super.anInt194 > 4 && super.anInt195 - 4 > local82 - 10 && super.anInt195 - 4 <= local82 + 3) {
								@Pc(121) int local121 = this.aClass1_Sub1_Sub2_Sub4_2.method445("From:  " + local29 + this.aStringArray4[local12]) + 25;
								if (local121 > 450) {
									local121 = 450;
								}
								if (super.anInt194 < local121 + 4) {
									if (this.anInt329 >= 1) {
										this.aStringArray2[this.anInt219] = "Report abuse @whi@" + local29;
										this.anIntArray81[this.anInt219] = 2524;
										this.anInt219++;
									}
									this.aStringArray2[this.anInt219] = "Add ignore @whi@" + local29;
									this.anIntArray81[this.anInt219] = 2047;
									this.anInt219++;
									this.aStringArray2[this.anInt219] = "Add friend @whi@" + local29;
									this.anIntArray81[this.anInt219] = 2605;
									this.anInt219++;
								}
							}
							local5++;
							if (local5 >= 5) {
								return;
							}
						}
						if ((local24 == 5 || local24 == 6) && this.anInt355 < 2) {
							local5++;
							if (local5 >= 5) {
								return;
							}
						}
					}
				}
			}
		} catch (@Pc(243) RuntimeException local243) {
			signlink.reporterror("93357, " + 45189 + ", " + local243.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IZ)V")
	private void method110(@OriginalArg(0) int arg0) {
		try {
			@Pc(4) int local4 = Class39.aClass39Array1[arg0].anInt893;
			if (local4 != 0) {
				@Pc(17) int local17 = this.anIntArray72[arg0];
				if (local4 == 1) {
					if (local17 == 1) {
						Class1_Sub1_Sub2_Sub1.method348(0.9D);
					}
					if (local17 == 2) {
						Class1_Sub1_Sub2_Sub1.method348(0.8D);
					}
					if (local17 == 3) {
						Class1_Sub1_Sub2_Sub1.method348(0.7D);
					}
					if (local17 == 4) {
						Class1_Sub1_Sub2_Sub1.method348(0.6D);
					}
					Class15.aClass40_8.method587();
					this.aBoolean86 = true;
				}
				if (local4 == 3) {
					@Pc(55) boolean local55 = this.aBoolean66;
					if (local17 == 0) {
						this.method197(0, this.aBoolean66);
						this.aBoolean66 = true;
					}
					if (local17 == 1) {
						this.method197(-400, this.aBoolean66);
						this.aBoolean66 = true;
					}
					if (local17 == 2) {
						this.method197(-800, this.aBoolean66);
						this.aBoolean66 = true;
					}
					if (local17 == 3) {
						this.method197(-1200, this.aBoolean66);
						this.aBoolean66 = true;
					}
					if (local17 == 4) {
						this.aBoolean66 = false;
					}
					if (this.aBoolean66 != local55 && !aBoolean71) {
						if (this.aBoolean66) {
							this.anInt401 = this.anInt235;
							this.aBoolean93 = true;
							this.aClass44_Sub1_1.method639(2, this.anInt401);
						} else {
							this.method133();
						}
						this.anInt205 = 0;
					}
				}
				if (local4 == 4) {
					if (local17 == 0) {
						this.aBoolean87 = true;
						this.method207(0, this.anInt344);
					}
					if (local17 == 1) {
						this.aBoolean87 = true;
						this.method207(-400, this.anInt344);
					}
					if (local17 == 2) {
						this.aBoolean87 = true;
						this.method207(-800, this.anInt344);
					}
					if (local17 == 3) {
						this.aBoolean87 = true;
						this.method207(-1200, this.anInt344);
					}
					if (local17 == 4) {
						this.aBoolean87 = false;
					}
				}
				if (local4 == 5) {
					this.anInt381 = local17;
				}
				if (local4 == 6) {
					this.anInt382 = local17;
				}
				if (local4 == 8) {
					this.anInt237 = local17;
					this.aBoolean75 = true;
				}
				if (local4 == 9) {
					this.anInt315 = local17;
				}
			}
		} catch (@Pc(219) RuntimeException local219) {
			signlink.reporterror("59146, " + arg0 + ", " + false + ", " + local219.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "i", descriptor = "(I)V")
	private void method111() {
		try {
			if (this.aClass35_19 == null) {
				super.aClass35_2 = null;
				this.aClass35_18 = null;
				this.aClass35_16 = null;
				this.aClass35_15 = null;
				this.aClass35_17 = null;
				this.aClass35_12 = null;
				this.aClass35_13 = null;
				this.aClass35_14 = null;
				this.aClass35_22 = new Class35(265, 128, this.method93(), false);
				Class1_Sub1_Sub2.method434();
				this.aClass35_23 = new Class35(265, 128, this.method93(), false);
				Class1_Sub1_Sub2.method434();
				this.aClass35_19 = new Class35(171, 509, this.method93(), false);
				Class1_Sub1_Sub2.method434();
				this.aClass35_20 = new Class35(132, 360, this.method93(), false);
				Class1_Sub1_Sub2.method434();
				this.aClass35_21 = new Class35(200, 360, this.method93(), false);
				Class1_Sub1_Sub2.method434();
				this.aClass35_24 = new Class35(238, 202, this.method93(), false);
				Class1_Sub1_Sub2.method434();
				this.aClass35_25 = new Class35(238, 203, this.method93(), false);
				Class1_Sub1_Sub2.method434();
				this.aClass35_26 = new Class35(94, 74, this.method93(), false);
				Class1_Sub1_Sub2.method434();
				this.aClass35_27 = new Class35(94, 75, this.method93(), false);
				Class1_Sub1_Sub2.method434();
				if (this.aClass47_1 != null) {
					this.method199();
					this.method180();
				}
				this.aBoolean86 = true;
			}
		} catch (@Pc(161) RuntimeException local161) {
			signlink.reporterror("2766, " + -925 + ", " + local161.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(BILclient!lb;)V")
	private void method112(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub1_Sub3 arg1) {
		try {
			while (true) {
				if (arg1.anInt739 + 21 < arg0 * 8) {
					@Pc(18) int local18 = arg1.method485(14);
					if (local18 != 16383) {
						if (this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local18] == null) {
							this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local18] = new Class1_Sub1_Sub1_Sub1_Sub2();
						}
						@Pc(38) Class1_Sub1_Sub1_Sub1_Sub2 local38 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local18];
						this.anIntArray78[this.anInt393++] = local18;
						local38.anInt1026 = anInt265;
						local38.aClass13_2 = Class13.method321(arg1.method485(11));
						local38.anInt989 = local38.aClass13_2.aByte14;
						local38.anInt1029 = local38.aClass13_2.anInt569;
						local38.anInt992 = local38.aClass13_2.anInt556;
						local38.anInt993 = local38.aClass13_2.anInt557;
						local38.anInt994 = local38.aClass13_2.anInt558;
						local38.anInt995 = local38.aClass13_2.anInt559;
						local38.anInt990 = local38.aClass13_2.anInt555;
						@Pc(99) int local99 = arg1.method485(5);
						if (local99 > 15) {
							local99 -= 32;
						}
						@Pc(108) int local108 = arg1.method485(5);
						if (local108 > 15) {
							local108 -= 32;
						}
						@Pc(117) int local117 = arg1.method485(1);
						local38.method672(aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray269[0] + local99, local117 == 1, aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray270[0] + local108);
						@Pc(143) int local143 = arg1.method485(1);
						if (local143 == 1) {
							this.anIntArray50[this.anInt274++] = local18;
						}
						continue;
					}
				}
				arg1.method486();
				return;
			}
		} catch (@Pc(164) RuntimeException local164) {
			signlink.reporterror("74052, " + -86 + ", " + arg0 + ", " + arg1 + ", " + local164.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(Z)V")
	private void method113() {
		try {
			if (this.anInt237 != 0) {
				@Pc(6) Class1_Sub1_Sub2_Sub4 local6 = this.aClass1_Sub1_Sub2_Sub4_2;
				@Pc(13) int local13 = 0;
				if (this.anInt405 != 0) {
					local13 = 1;
				}
				for (@Pc(20) int local20 = 0; local20 < 100; local20++) {
					if (this.aStringArray4[local20] != null) {
						@Pc(32) int local32 = this.anIntArray63[local20];
						@Pc(37) String local37 = this.aStringArray3[local20];
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
						if ((local32 == 3 || local32 == 7) && (local32 == 7 || this.anInt355 == 0 || this.anInt355 == 1 && this.method103(local37))) {
							local90 = 329 - local13 * 13;
							local6.method447(4, "From", local90, 0);
							local6.method447(4, "From", local90 - 1, 65535);
							@Pc(115) int local115 = local6.method445("From ") + 4;
							if (local39 == 1) {
								this.aClass1_Sub1_Sub2_Sub3Array4[0].method415(local115, (byte) 1, local90 - 12);
								local115 += 14;
							}
							if (local39 == 2) {
								this.aClass1_Sub1_Sub2_Sub3Array4[1].method415(local115, (byte) 1, local90 - 12);
								local115 += 14;
							}
							local6.method447(local115, local37 + ": " + this.aStringArray4[local20], local90, 0);
							local6.method447(local115, local37 + ": " + this.aStringArray4[local20], local90 - 1, 65535);
							local13++;
							if (local13 >= 5) {
								return;
							}
						}
						if (local32 == 5 && this.anInt355 < 2) {
							local90 = 329 - local13 * 13;
							local6.method447(4, this.aStringArray4[local20], local90, 0);
							local6.method447(4, this.aStringArray4[local20], local90 - 1, 65535);
							local13++;
							if (local13 >= 5) {
								return;
							}
						}
						if (local32 == 6 && this.anInt355 < 2) {
							local90 = 329 - local13 * 13;
							local6.method447(4, "To " + local37 + ": " + this.aStringArray4[local20], local90, 0);
							local6.method447(4, "To " + local37 + ": " + this.aStringArray4[local20], local90 - 1, 65535);
							local13++;
							if (local13 >= 5) {
								return;
							}
						}
					}
				}
			}
		} catch (@Pc(294) RuntimeException local294) {
			signlink.reporterror("72115, " + true + ", " + local294.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "j", descriptor = "(I)V")
	private void method114(@OriginalArg(0) int arg0) {
		try {
			for (@Pc(3) int local3 = -1; local3 < this.anInt273; local3++) {
				@Pc(11) int local11;
				if (local3 == -1) {
					local11 = this.anInt272;
				} else {
					local11 = this.anIntArray49[local3];
				}
				@Pc(23) Class1_Sub1_Sub1_Sub1_Sub1 local23 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local11];
				if (local23 != null) {
					this.method123(local23, 1);
				}
			}
			@Pc(39) boolean local39 = false;
		} catch (@Pc(41) RuntimeException local41) {
			signlink.reporterror("3738, " + arg0 + ", " + local41.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILclient!lb;I)V")
	private void method115(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub1_Sub3 arg1) {
		try {
			@Pc(16) int local16;
			@Pc(25) int local25;
			@Pc(32) int local32;
			@Pc(35) int local35;
			@Pc(39) int local39;
			@Pc(43) int local43;
			@Pc(48) int local48;
			@Pc(53) int local53;
			if (arg0 == 138 || arg0 == 173) {
				local16 = arg1.method474();
				local25 = this.anInt226 + (local16 >> 4 & 0x7);
				local32 = this.anInt227 + (local16 & 0x7);
				local35 = arg1.method474();
				local39 = local35 >> 2;
				local43 = local35 & 0x3;
				local48 = this.anIntArray46[local39];
				if (arg0 == 173) {
					local53 = -1;
				} else {
					local53 = arg1.method476();
				}
				if (local25 >= 0 && local32 >= 0 && local25 < 104 && local32 < 104) {
					this.method104(-1, 0, local43, local39, local25, this.anInt245, local48, local32, local53);
				}
			} else {
				@Pc(143) int local143;
				@Pc(155) int local155;
				@Pc(169) int local169;
				@Pc(181) int local181;
				if (arg0 == 48) {
					local16 = arg1.method474();
					local25 = this.anInt226 + (local16 >> 4 & 0x7);
					local32 = this.anInt227 + (local16 & 0x7);
					local35 = arg1.method474();
					local39 = local35 >> 2;
					local43 = local35 & 0x3;
					local48 = this.anIntArray46[local39];
					local53 = arg1.method476();
					if (local25 >= 0 && local32 >= 0 && local25 < 103 && local32 < 103) {
						local143 = this.anIntArrayArrayArray5[this.anInt245][local25][local32];
						local155 = this.anIntArrayArrayArray5[this.anInt245][local25 + 1][local32];
						local169 = this.anIntArrayArrayArray5[this.anInt245][local25 + 1][local32 + 1];
						local181 = this.anIntArrayArrayArray5[this.anInt245][local25][local32 + 1];
						if (local48 == 0) {
							@Pc(192) Class34 local192 = this.aClass37_1.method546(this.anInt245, local25, local32);
							if (local192 != null) {
								@Pc(201) int local201 = local192.anInt841 >> 14 & 0x7FFF;
								if (local39 == 2) {
									local192.aClass1_Sub1_Sub1_7 = new Class1_Sub1_Sub1_Sub2(2, false, local143, local181, local169, local155, local53, false, local43 + 4, local201);
									local192.aClass1_Sub1_Sub1_8 = new Class1_Sub1_Sub1_Sub2(2, false, local143, local181, local169, local155, local53, false, local43 + 1 & 0x3, local201);
								} else {
									local192.aClass1_Sub1_Sub1_7 = new Class1_Sub1_Sub1_Sub2(local39, false, local143, local181, local169, local155, local53, false, local43, local201);
								}
							}
						}
						if (local48 == 1) {
							@Pc(269) Class14 local269 = this.aClass37_1.method547(local25, this.anInt245, local32);
							if (local269 != null) {
								local269.aClass1_Sub1_Sub1_1 = new Class1_Sub1_Sub1_Sub2(4, false, local143, local181, local169, local155, local53, false, 0, local269.anInt575 >> 14 & 0x7FFF);
							}
						}
						if (local48 == 2) {
							@Pc(303) Class31 local303 = this.aClass37_1.method548(local25, this.anInt245, local32);
							if (local39 == 11) {
								local39 = 10;
							}
							if (local303 != null) {
								local303.aClass1_Sub1_Sub1_6 = new Class1_Sub1_Sub1_Sub2(local39, false, local143, local181, local169, local155, local53, false, local43, local303.anInt823 >> 14 & 0x7FFF);
							}
						}
						if (local48 == 3) {
							@Pc(342) Class18 local342 = this.aClass37_1.method549(local32, local25, this.anInt245);
							if (local342 != null) {
								local342.aClass1_Sub1_Sub1_2 = new Class1_Sub1_Sub1_Sub2(22, false, local143, local181, local169, local155, local53, false, local43, local342.anInt655 >> 14 & 0x7FFF);
							}
						}
					}
				} else {
					@Pc(407) Class1_Sub1_Sub1_Sub3 local407;
					if (arg0 == 81) {
						local16 = arg1.method474();
						local25 = this.anInt226 + (local16 >> 4 & 0x7);
						local32 = this.anInt227 + (local16 & 0x7);
						local35 = arg1.method476();
						local39 = arg1.method476();
						if (local25 >= 0 && local32 >= 0 && local25 < 104 && local32 < 104) {
							local407 = new Class1_Sub1_Sub1_Sub3();
							local407.anInt178 = local35;
							local407.anInt179 = local39;
							if (this.aClass29ArrayArrayArray1[this.anInt245][local25][local32] == null) {
								this.aClass29ArrayArrayArray1[this.anInt245][local25][local32] = new Class29(false);
							}
							this.aClass29ArrayArrayArray1[this.anInt245][local25][local32].method502(local407);
							this.method190(local25, local32);
						}
					} else if (arg0 == 52) {
						local16 = arg1.method474();
						local25 = this.anInt226 + (local16 >> 4 & 0x7);
						local32 = this.anInt227 + (local16 & 0x7);
						local35 = arg1.method476();
						if (local25 >= 0 && local32 >= 0 && local25 < 104 && local32 < 104) {
							@Pc(497) Class29 local497 = this.aClass29ArrayArrayArray1[this.anInt245][local25][local32];
							if (local497 != null) {
								for (local407 = (Class1_Sub1_Sub1_Sub3) local497.method505(); local407 != null; local407 = (Class1_Sub1_Sub1_Sub3) local497.method507()) {
									if (local407.anInt178 == (local35 & 0x7FFF)) {
										local407.method668();
										break;
									}
								}
								if (local497.method505() == null) {
									this.aClass29ArrayArrayArray1[this.anInt245][local25][local32] = null;
								}
								this.method190(local25, local32);
							}
						}
					} else if (arg0 == 107) {
						local16 = arg1.method474();
						local25 = this.anInt226 + (local16 >> 4 & 0x7);
						local32 = this.anInt227 + (local16 & 0x7);
						local35 = local25 + arg1.method475();
						local39 = local32 + arg1.method475();
						local43 = arg1.method477();
						local48 = arg1.method476();
						local53 = arg1.method474() * 4;
						local143 = arg1.method474() * 4;
						local155 = arg1.method476();
						local169 = arg1.method476();
						local181 = arg1.method474();
						@Pc(600) int local600 = arg1.method474();
						if (local25 >= 0 && local32 >= 0 && local25 < 104 && local32 < 104 && local35 >= 0 && local39 >= 0 && local35 < 104 && local39 < 104) {
							local25 = local25 * 128 + 64;
							local32 = local32 * 128 + 64;
							local35 = local35 * 128 + 64;
							local39 = local39 * 128 + 64;
							@Pc(673) Class1_Sub1_Sub1_Sub4 local673 = new Class1_Sub1_Sub1_Sub4(local155 + anInt265, local181, local32, local143, this.method147(local32, local25, this.anInt245) - local53, local600, local25, local169 + anInt265, local43, 556, local48, this.anInt245);
							local673.method240(local39, local35, this.method147(local39, local35, this.anInt245) - local143, local155 + anInt265);
							this.aClass29_2.method502(local673);
						}
					} else if (arg0 == 85) {
						local16 = arg1.method474();
						local25 = this.anInt226 + (local16 >> 4 & 0x7);
						local32 = this.anInt227 + (local16 & 0x7);
						local35 = arg1.method476();
						local39 = arg1.method474();
						local43 = arg1.method476();
						if (local25 >= 0 && local32 >= 0 && local25 < 104 && local32 < 104) {
							local25 = local25 * 128 + 64;
							local32 = local32 * 128 + 64;
							@Pc(769) Class1_Sub1_Sub1_Sub6 local769 = new Class1_Sub1_Sub1_Sub6(0, local35, this.anInt245, local32, this.method147(local32, local25, this.anInt245) - local39, anInt265, local25, local43);
							this.aClass29_1.method502(local769);
						}
					} else if (arg0 == 219) {
						local16 = arg1.method474();
						local25 = this.anInt226 + (local16 >> 4 & 0x7);
						local32 = this.anInt227 + (local16 & 0x7);
						local35 = arg1.method476();
						local39 = arg1.method476();
						local43 = arg1.method476();
						if (local25 >= 0 && local32 >= 0 && local25 < 104 && local32 < 104 && local43 != this.anInt345) {
							@Pc(823) Class1_Sub1_Sub1_Sub3 local823 = new Class1_Sub1_Sub1_Sub3();
							local823.anInt178 = local35;
							local823.anInt179 = local39;
							if (this.aClass29ArrayArrayArray1[this.anInt245][local25][local32] == null) {
								this.aClass29ArrayArrayArray1[this.anInt245][local25][local32] = new Class29(false);
							}
							this.aClass29ArrayArrayArray1[this.anInt245][local25][local32].method502(local823);
							this.method190(local25, local32);
						}
					} else {
						if (arg0 == 176) {
							local16 = arg1.method474();
							local25 = this.anInt226 + (local16 >> 4 & 0x7);
							local32 = this.anInt227 + (local16 & 0x7);
							local35 = arg1.method474();
							local39 = local35 >> 2;
							local43 = local35 & 0x3;
							local48 = this.anIntArray46[local39];
							local53 = arg1.method476();
							local143 = arg1.method476();
							local155 = arg1.method476();
							local169 = arg1.method476();
							@Pc(921) byte local921 = arg1.method475();
							@Pc(924) byte local924 = arg1.method475();
							@Pc(927) byte local927 = arg1.method475();
							@Pc(930) byte local930 = arg1.method475();
							@Pc(936) Class1_Sub1_Sub1_Sub1_Sub1 local936;
							if (local169 == this.anInt345) {
								local936 = aClass1_Sub1_Sub1_Sub1_Sub1_1;
							} else {
								local936 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local169];
							}
							if (local936 != null) {
								@Pc(948) Class9 local948 = Class9.method287(local53);
								@Pc(958) int local958 = this.anIntArrayArrayArray5[this.anInt245][local25][local32];
								@Pc(970) int local970 = this.anIntArrayArrayArray5[this.anInt245][local25 + 1][local32];
								@Pc(984) int local984 = this.anIntArrayArrayArray5[this.anInt245][local25 + 1][local32 + 1];
								@Pc(996) int local996 = this.anIntArrayArrayArray5[this.anInt245][local25][local32 + 1];
								@Pc(1006) Class1_Sub1_Sub1_Sub5 local1006 = local948.method293(local39, local43, local958, local970, local984, local996, -1);
								if (local1006 != null) {
									this.method104(local155 + 1, local143 + 1, 0, 0, local25, this.anInt245, local48, local32, -1);
									local936.anInt133 = local143 + anInt265;
									local936.anInt134 = local155 + anInt265;
									local936.aClass1_Sub1_Sub1_Sub5_1 = local1006;
									@Pc(1041) int local1041 = local948.anInt508;
									@Pc(1044) int local1044 = local948.anInt509;
									if (local43 == 1 || local43 == 3) {
										local1041 = local948.anInt509;
										local1044 = local948.anInt508;
									}
									local936.anInt135 = local25 * 128 + local1041 * 64;
									local936.anInt137 = local32 * 128 + local1044 * 64;
									local936.anInt136 = this.method147(local936.anInt137, local936.anInt135, this.anInt245);
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
									local936.anInt138 = local25 + local921;
									local936.anInt140 = local25 + local927;
									local936.anInt139 = local32 + local924;
									local936.anInt141 = local32 + local930;
								}
							}
						}
						if (arg0 == 95) {
							local16 = arg1.method474();
							local25 = this.anInt226 + (local16 >> 4 & 0x7);
							local32 = this.anInt227 + (local16 & 0x7);
							local35 = arg1.method476();
							local39 = arg1.method476();
							local43 = arg1.method476();
							if (local25 >= 0 && local32 >= 0 && local25 < 104 && local32 < 104) {
								@Pc(1174) Class29 local1174 = this.aClass29ArrayArrayArray1[this.anInt245][local25][local32];
								if (local1174 != null) {
									for (@Pc(1180) Class1_Sub1_Sub1_Sub3 local1180 = (Class1_Sub1_Sub1_Sub3) local1174.method505(); local1180 != null; local1180 = (Class1_Sub1_Sub1_Sub3) local1174.method507()) {
										if (local1180.anInt178 == (local35 & 0x7FFF) && local1180.anInt179 == local39) {
											local1180.anInt179 = local43;
											break;
										}
									}
									this.method190(local25, local32);
								}
							}
						}
					}
				}
			}
		} catch (@Pc(1210) RuntimeException local1210) {
			signlink.reporterror("99147, " + arg0 + ", " + arg1 + ", " + 3872 + ", " + local1210.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(JZ)V")
	private void method116(@OriginalArg(0) long arg0) {
		try {
			if (arg0 != 0L) {
				if (this.anInt217 >= 100 && this.anInt380 != 1) {
					this.method217(this.aByte2, "", "Your friendlist is full. Max of 100 for free users, and 200 for members", 0);
				} else if (this.anInt217 >= 200) {
					this.method217(this.aByte2, "", "Your friendlist is full. Max of 100 for free users, and 200 for members", 0);
				} else {
					@Pc(40) String local40 = Class48.method665(Class48.method662(arg0));
					this.aBoolean90 &= true;
					for (@Pc(48) int local48 = 0; local48 < this.anInt217; local48++) {
						if (this.aLongArray3[local48] == arg0) {
							this.method217(this.aByte2, "", local40 + " is already on your friend list", 0);
							return;
						}
					}
					for (@Pc(79) int local79 = 0; local79 < this.anInt252; local79++) {
						if (this.aLongArray4[local79] == arg0) {
							this.method217(this.aByte2, "", "Please remove " + local40 + " from your ignore list first", 0);
							return;
						}
					}
					if (!local40.equals(aClass1_Sub1_Sub1_Sub1_Sub1_1.aString3)) {
						this.aStringArray5[this.anInt217] = local40;
						this.aLongArray3[this.anInt217] = arg0;
						this.anIntArray89[this.anInt217] = 0;
						this.anInt217++;
						this.aBoolean88 = true;
						this.aClass1_Sub1_Sub3_2.method463(13);
						this.aClass1_Sub1_Sub3_2.method470(arg0);
					}
				}
			}
		} catch (@Pc(154) RuntimeException local154) {
			signlink.reporterror("3218, " + arg0 + ", " + true + ", " + local154.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "k", descriptor = "(I)V")
	private void method117() {
		try {
			try {
				@Pc(11) int local11 = aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt986 + this.anInt222;
				@Pc(17) int local17 = aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt987 + this.anInt332;
				if (this.anInt290 - local11 < -500 || this.anInt290 - local11 > 500 || this.anInt291 - local17 < -500 || this.anInt291 - local17 > 500) {
					this.anInt290 = local11;
					this.anInt291 = local17;
				}
				if (this.anInt290 != local11) {
					this.anInt290 += (local11 - this.anInt290) / 16;
				}
				if (this.anInt291 != local17) {
					this.anInt291 += (local17 - this.anInt291) / 16;
				}
				if (super.anIntArray29[1] == 1) {
					this.anInt385 += (-this.anInt385 - 24) / 2;
				} else if (super.anIntArray29[2] == 1) {
					this.anInt385 += (24 - this.anInt385) / 2;
				} else {
					this.anInt385 /= 2;
				}
				if (super.anIntArray29[3] == 1) {
					this.anInt386 += (12 - this.anInt386) / 2;
				} else if (super.anIntArray29[4] == 1) {
					this.anInt386 += (-this.anInt386 - 12) / 2;
				} else {
					this.anInt386 /= 2;
				}
				this.anInt384 = this.anInt384 + this.anInt385 / 2 & 0x7FF;
				this.anInt383 += this.anInt386 / 2;
				if (this.anInt383 < 128) {
					this.anInt383 = 128;
				}
				if (this.anInt383 > 383) {
					this.anInt383 = 383;
				}
				@Pc(204) int local204 = this.anInt290 >> 7;
				@Pc(209) int local209 = this.anInt291 >> 7;
				@Pc(219) int local219 = this.method147(this.anInt291, this.anInt290, this.anInt245);
				@Pc(221) int local221 = 0;
				@Pc(237) int local237;
				if (local204 > 3 && local209 > 3 && local204 < 100 && local209 < 100) {
					for (local237 = local204 - 4; local237 <= local204 + 4; local237++) {
						for (@Pc(243) int local243 = local209 - 4; local243 <= local209 + 4; local243++) {
							@Pc(248) int local248 = this.anInt245;
							if (local248 < 3 && (this.aByteArrayArrayArray7[1][local237][local243] & 0x2) == 2) {
								local248++;
							}
							@Pc(275) int local275 = local219 - this.anIntArrayArrayArray5[local248][local237][local243];
							if (local275 > local221) {
								local221 = local275;
							}
						}
					}
				}
				local237 = local221 * 192;
				if (local237 > 98048) {
					local237 = 98048;
				}
				if (local237 < 32768) {
					local237 = 32768;
				}
				if (local237 > this.anInt263) {
					this.anInt263 += (local237 - this.anInt263) / 24;
				} else if (local237 < this.anInt263) {
					this.anInt263 += (local237 - this.anInt263) / 80;
				}
			} catch (@Pc(339) Exception local339) {
				signlink.reporterror("glfc_ex " + aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt986 + "," + aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt987 + "," + this.anInt290 + "," + this.anInt291 + "," + this.anInt388 + "," + this.anInt389 + "," + this.anInt278 + "," + this.anInt279);
				throw new RuntimeException("eek");
			}
		} catch (@Pc(389) RuntimeException local389) {
			signlink.reporterror("2553, " + 4974 + ", " + local389.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "l", descriptor = "(I)V")
	private void method118(@OriginalArg(0) int arg0) {
		try {
			if (this.anInt297 == 2) {
				this.method159((this.anInt241 - this.anInt279 << 7) + this.anInt244, this.anInt242 * 2, (this.anInt240 - this.anInt278 << 7) + this.anInt243);
				if (arg0 != 11300) {
					for (@Pc(36) int local36 = 1; local36 > 0; local36++) {
					}
				}
				if (this.anInt408 > -1 && anInt265 % 20 < 10) {
					this.aClass1_Sub1_Sub2_Sub2Array5[2].method388(this.anInt408 - 12, (byte) 1, this.anInt409 - 28);
				}
			}
		} catch (@Pc(66) RuntimeException local66) {
			signlink.reporterror("88625, " + arg0 + ", " + local66.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "([BII)Z")
	private boolean method119(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		try {
			return arg0 == null ? true : signlink.wavesave(arg0, arg1);
		} catch (@Pc(17) RuntimeException local17) {
			signlink.reporterror("96269, " + arg0 + ", " + arg1 + ", " + -237 + ", " + local17.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!d;IIIIZI)V")
	private void method120(@OriginalArg(0) Class6 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		try {
			if (arg0.anInt422 == 0 && arg0.anIntArray97 != null && !arg0.aBoolean99 && (arg2 >= arg1 && arg3 >= arg5 && arg2 <= arg1 + arg0.anInt425 && arg3 <= arg5 + arg0.anInt426)) {
				@Pc(34) int local34 = arg0.anIntArray97.length;
				for (@Pc(36) int local36 = 0; local36 < local34; local36++) {
					@Pc(45) int local45 = arg0.anIntArray98[local36] + arg1;
					@Pc(54) int local54 = arg0.anIntArray99[local36] + arg5 - arg4;
					@Pc(61) Class6 local61 = Class6.aClass6Array1[arg0.anIntArray97[local36]];
					@Pc(66) int local66 = local45 + local61.anInt427;
					@Pc(71) int local71 = local54 + local61.anInt428;
					if ((local61.anInt429 >= 0 || local61.anInt437 != 0) && arg2 >= local66 && arg3 >= local71 && arg2 < local66 + local61.anInt425 && arg3 < local71 + local61.anInt426) {
						if (local61.anInt429 >= 0) {
							this.anInt336 = local61.anInt429;
						} else {
							this.anInt336 = local61.anInt420;
						}
					}
					if (local61.anInt422 == 0) {
						this.method120(local61, local66, arg2, arg3, local61.anInt431, local71);
						if (local61.anInt430 > local61.anInt426) {
							this.method96(true, local71, arg2, local61.anInt426, local66 + local61.anInt425, local61.anInt430, arg3, local61, (byte) 7);
						}
					} else {
						if (local61.anInt423 == 1 && arg2 >= local66 && arg3 >= local71 && arg2 < local66 + local61.anInt425 && arg3 < local71 + local61.anInt426) {
							@Pc(168) boolean local168 = false;
							if (local61.anInt424 != 0) {
								local168 = this.method200(local61, this.aByte3);
							}
							if (!local168) {
								this.aStringArray2[this.anInt219] = local61.aString22;
								this.anIntArray81[this.anInt219] = 231;
								this.anIntArray80[this.anInt219] = local61.anInt420;
								this.anInt219++;
							}
						}
						if (local61.anInt423 == 2 && this.anInt282 == 0 && arg2 >= local66 && arg3 >= local71 && arg2 < local66 + local61.anInt425 && arg3 < local71 + local61.anInt426) {
							@Pc(233) String local233 = local61.aString20;
							if (local233.indexOf(" ") != -1) {
								local233 = local233.substring(0, local233.indexOf(" "));
							}
							this.aStringArray2[this.anInt219] = local233 + " @gre@" + local61.aString21;
							this.anIntArray81[this.anInt219] = 274;
							this.anIntArray80[this.anInt219] = local61.anInt420;
							this.anInt219++;
						}
						if (local61.anInt423 == 3 && arg2 >= local66 && arg3 >= local71 && arg2 < local66 + local61.anInt425 && arg3 < local71 + local61.anInt426) {
							this.aStringArray2[this.anInt219] = "Close";
							this.anIntArray81[this.anInt219] = 737;
							this.anIntArray80[this.anInt219] = local61.anInt420;
							this.anInt219++;
						}
						if (local61.anInt423 == 4 && arg2 >= local66 && arg3 >= local71 && arg2 < local66 + local61.anInt425 && arg3 < local71 + local61.anInt426) {
							this.aStringArray2[this.anInt219] = local61.aString22;
							this.anIntArray81[this.anInt219] = 435;
							this.anIntArray80[this.anInt219] = local61.anInt420;
							this.anInt219++;
						}
						if (local61.anInt423 == 5 && arg2 >= local66 && arg3 >= local71 && arg2 < local66 + local61.anInt425 && arg3 < local71 + local61.anInt426) {
							this.aStringArray2[this.anInt219] = local61.aString22;
							this.anIntArray81[this.anInt219] = 225;
							this.anIntArray80[this.anInt219] = local61.anInt420;
							this.anInt219++;
						}
						if (local61.anInt423 == 6 && !this.aBoolean84 && arg2 >= local66 && arg3 >= local71 && arg2 < local66 + local61.anInt425 && arg3 < local71 + local61.anInt426) {
							this.aStringArray2[this.anInt219] = local61.aString22;
							this.anIntArray81[this.anInt219] = 997;
							this.anIntArray80[this.anInt219] = local61.anInt420;
							this.anInt219++;
						}
						if (local61.anInt422 == 2) {
							@Pc(481) int local481 = 0;
							for (@Pc(483) int local483 = 0; local483 < local61.anInt426; local483++) {
								for (@Pc(487) int local487 = 0; local487 < local61.anInt425; local487++) {
									@Pc(498) int local498 = local66 + local487 * (local61.anInt433 + 32);
									@Pc(507) int local507 = local71 + local483 * (local61.anInt434 + 32);
									if (local481 < 20) {
										local498 += local61.anIntArray100[local481];
										local507 += local61.anIntArray101[local481];
									}
									if (arg2 >= local498 && arg3 >= local507 && arg2 < local498 + 32 && arg3 < local507 + 32) {
										this.anInt367 = local481;
										this.anInt368 = local61.anInt420;
										if (local61.anIntArray93[local481] > 0) {
											@Pc(560) Class15 local560 = Class15.method358(local61.anIntArray93[local481] - 1);
											if (this.anInt318 == 1 && local61.aBoolean102) {
												if (local61.anInt420 != this.anInt320 || local481 != this.anInt319) {
													this.aStringArray2[this.anInt219] = "Use " + this.aString11 + " with @lre@" + local560.aString25;
													this.anIntArray81[this.anInt219] = 398;
													this.anIntArray82[this.anInt219] = local560.anInt600;
													this.anIntArray79[this.anInt219] = local481;
													this.anIntArray80[this.anInt219] = local61.anInt420;
													this.anInt219++;
												}
											} else if (this.anInt282 != 1 || !local61.aBoolean102) {
												@Pc(697) int local697;
												if (local61.aBoolean102) {
													for (local697 = 4; local697 >= 3; local697--) {
														if (local560.aStringArray11 != null && local560.aStringArray11[local697] != null) {
															this.aStringArray2[this.anInt219] = local560.aStringArray11[local697] + " @lre@" + local560.aString25;
															if (local697 == 3) {
																this.anIntArray81[this.anInt219] = 681;
															}
															if (local697 == 4) {
																this.anIntArray81[this.anInt219] = 100;
															}
															this.anIntArray82[this.anInt219] = local560.anInt600;
															this.anIntArray79[this.anInt219] = local481;
															this.anIntArray80[this.anInt219] = local61.anInt420;
															this.anInt219++;
														} else if (local697 == 4) {
															this.aStringArray2[this.anInt219] = "Drop @lre@" + local560.aString25;
															this.anIntArray81[this.anInt219] = 100;
															this.anIntArray82[this.anInt219] = local560.anInt600;
															this.anIntArray79[this.anInt219] = local481;
															this.anIntArray80[this.anInt219] = local61.anInt420;
															this.anInt219++;
														}
													}
												}
												if (local61.aBoolean103) {
													this.aStringArray2[this.anInt219] = "Use @lre@" + local560.aString25;
													this.anIntArray81[this.anInt219] = 102;
													this.anIntArray82[this.anInt219] = local560.anInt600;
													this.anIntArray79[this.anInt219] = local481;
													this.anIntArray80[this.anInt219] = local61.anInt420;
													this.anInt219++;
												}
												if (local61.aBoolean102 && local560.aStringArray11 != null) {
													for (local697 = 2; local697 >= 0; local697--) {
														if (local560.aStringArray11[local697] != null) {
															this.aStringArray2[this.anInt219] = local560.aStringArray11[local697] + " @lre@" + local560.aString25;
															if (local697 == 0) {
																this.anIntArray81[this.anInt219] = 694;
															}
															if (local697 == 1) {
																this.anIntArray81[this.anInt219] = 962;
															}
															if (local697 == 2) {
																this.anIntArray81[this.anInt219] = 795;
															}
															this.anIntArray82[this.anInt219] = local560.anInt600;
															this.anIntArray79[this.anInt219] = local481;
															this.anIntArray80[this.anInt219] = local61.anInt420;
															this.anInt219++;
														}
													}
												}
												if (local61.aStringArray7 != null) {
													for (local697 = 4; local697 >= 0; local697--) {
														if (local61.aStringArray7[local697] != null) {
															this.aStringArray2[this.anInt219] = local61.aStringArray7[local697] + " @lre@" + local560.aString25;
															if (local697 == 0) {
																this.anIntArray81[this.anInt219] = 582;
															}
															if (local697 == 1) {
																this.anIntArray81[this.anInt219] = 113;
															}
															if (local697 == 2) {
																this.anIntArray81[this.anInt219] = 555;
															}
															if (local697 == 3) {
																this.anIntArray81[this.anInt219] = 331;
															}
															if (local697 == 4) {
																this.anIntArray81[this.anInt219] = 354;
															}
															this.anIntArray82[this.anInt219] = local560.anInt600;
															this.anIntArray79[this.anInt219] = local481;
															this.anIntArray80[this.anInt219] = local61.anInt420;
															this.anInt219++;
														}
													}
												}
												this.aStringArray2[this.anInt219] = "Examine @lre@" + local560.aString25;
												this.anIntArray81[this.anInt219] = 1328;
												this.anIntArray82[this.anInt219] = local560.anInt600;
												this.anIntArray79[this.anInt219] = local481;
												this.anIntArray80[this.anInt219] = local61.anInt420;
												this.anInt219++;
											} else if ((this.anInt284 & 0x10) == 16) {
												this.aStringArray2[this.anInt219] = this.aString9 + " @lre@" + local560.aString25;
												this.anIntArray81[this.anInt219] = 563;
												this.anIntArray82[this.anInt219] = local560.anInt600;
												this.anIntArray79[this.anInt219] = local481;
												this.anIntArray80[this.anInt219] = local61.anInt420;
												this.anInt219++;
											}
										}
									}
									local481++;
								}
							}
						}
					}
				}
				this.aBoolean90 &= true;
			}
		} catch (@Pc(1133) RuntimeException local1133) {
			signlink.reporterror("1918, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + true + ", " + arg5 + ", " + local1133.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(JI)V")
	private void method121(@OriginalArg(0) long arg0) {
		try {
			if (arg0 != 0L) {
				for (@Pc(11) int local11 = 0; local11 < this.anInt217; local11++) {
					if (this.aLongArray3[local11] == arg0) {
						this.anInt217--;
						this.aBoolean88 = true;
						for (@Pc(31) int local31 = local11; local31 < this.anInt217; local31++) {
							this.aStringArray5[local31] = this.aStringArray5[local31 + 1];
							this.anIntArray89[local31] = this.anIntArray89[local31 + 1];
							this.aLongArray3[local31] = this.aLongArray3[local31 + 1];
						}
						this.aClass1_Sub1_Sub3_2.method463(106);
						this.aClass1_Sub1_Sub3_2.method470(arg0);
						return;
					}
				}
			}
		} catch (@Pc(86) RuntimeException local86) {
			signlink.reporterror("94891, " + arg0 + ", " + 748 + ", " + local86.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "m", descriptor = "(I)V")
	private void method122() {
		try {
			for (@Pc(9) int local9 = 0; local9 < this.anInt393; local9++) {
				@Pc(16) int local16 = this.anIntArray78[local9];
				@Pc(21) Class1_Sub1_Sub1_Sub1_Sub2 local21 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local16];
				if (local21 != null) {
					this.method123(local21, local21.aClass13_2.aByte14);
				}
			}
		} catch (@Pc(37) RuntimeException local37) {
			signlink.reporterror("85825, " + 0 + ", " + local37.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!y;IZ)V")
	private void method123(@OriginalArg(0) Class1_Sub1_Sub1_Sub1 arg0, @OriginalArg(1) int arg1) {
		try {
			if (arg0.anInt986 < 128 || arg0.anInt987 < 128 || arg0.anInt986 >= 13184 || arg0.anInt987 >= 13184) {
				arg0.anInt1009 = -1;
				arg0.anInt1014 = -1;
				arg0.anInt1023 = 0;
				arg0.anInt1024 = 0;
				arg0.anInt986 = arg0.anIntArray269[0] * 128 + arg0.anInt989 * 64;
				arg0.anInt987 = arg0.anIntArray270[0] * 128 + arg0.anInt989 * 64;
				arg0.method674();
			}
			if (arg0 == aClass1_Sub1_Sub1_Sub1_Sub1_1 && (arg0.anInt986 < 1536 || arg0.anInt987 < 1536 || arg0.anInt986 >= 11776 || arg0.anInt987 >= 11776)) {
				arg0.anInt1009 = -1;
				arg0.anInt1014 = -1;
				arg0.anInt1023 = 0;
				arg0.anInt1024 = 0;
				arg0.anInt986 = arg0.anIntArray269[0] * 128 + arg0.anInt989 * 64;
				arg0.anInt987 = arg0.anIntArray270[0] * 128 + arg0.anInt989 * 64;
				arg0.method674();
			}
			if (arg0.anInt1023 > anInt265) {
				this.method124(arg0);
			} else if (arg0.anInt1024 >= anInt265) {
				this.method125(arg0);
			} else {
				this.method126(arg0);
			}
			this.method127(arg0);
			this.method128(arg0);
		} catch (@Pc(154) RuntimeException local154) {
			signlink.reporterror("53669, " + arg0 + ", " + arg1 + ", " + true + ", " + local154.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!y;B)V")
	private void method124(@OriginalArg(0) Class1_Sub1_Sub1_Sub1 arg0) {
		try {
			@Pc(4) int local4 = arg0.anInt1023 - anInt265;
			@Pc(14) int local14 = arg0.anInt1019 * 128 + arg0.anInt989 * 64;
			@Pc(24) int local24 = arg0.anInt1021 * 128 + arg0.anInt989 * 64;
			arg0.anInt986 += (local14 - arg0.anInt986) / local4;
			arg0.anInt987 += (local24 - arg0.anInt987) / local4;
			arg0.anInt1031 = 0;
			if (arg0.anInt1025 == 0) {
				arg0.anInt1028 = 1024;
			}
			if (arg0.anInt1025 == 1) {
				arg0.anInt1028 = 1536;
			}
			if (arg0.anInt1025 == 2) {
				arg0.anInt1028 = 0;
			}
			if (arg0.anInt1025 == 3) {
				arg0.anInt1028 = 512;
			}
		} catch (@Pc(87) RuntimeException local87) {
			signlink.reporterror("31123, " + arg0 + ", " + 4 + ", " + local87.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!y;I)V")
	private void method125(@OriginalArg(0) Class1_Sub1_Sub1_Sub1 arg0) {
		try {
			if (arg0.anInt1024 == anInt265 || arg0.anInt1009 == -1 || arg0.anInt1012 != 0 || arg0.anInt1011 + 1 > Class27.aClass27Array1[arg0.anInt1009].method500(arg0.anInt1010)) {
				@Pc(29) int local29 = arg0.anInt1024 - arg0.anInt1023;
				@Pc(34) int local34 = anInt265 - arg0.anInt1023;
				@Pc(44) int local44 = arg0.anInt1019 * 128 + arg0.anInt989 * 64;
				@Pc(54) int local54 = arg0.anInt1021 * 128 + arg0.anInt989 * 64;
				@Pc(64) int local64 = arg0.anInt1020 * 128 + arg0.anInt989 * 64;
				@Pc(74) int local74 = arg0.anInt1022 * 128 + arg0.anInt989 * 64;
				arg0.anInt986 = (local44 * (local29 - local34) + local64 * local34) / local29;
				arg0.anInt987 = (local54 * (local29 - local34) + local74 * local34) / local29;
			}
			arg0.anInt1031 = 0;
			if (arg0.anInt1025 == 0) {
				arg0.anInt1028 = 1024;
			}
			if (arg0.anInt1025 == 1) {
				arg0.anInt1028 = 1536;
			}
			if (arg0.anInt1025 == 2) {
				arg0.anInt1028 = 0;
			}
			if (arg0.anInt1025 == 3) {
				arg0.anInt1028 = 512;
			}
			arg0.anInt988 = arg0.anInt1028;
		} catch (@Pc(141) RuntimeException local141) {
			signlink.reporterror("28444, " + arg0 + ", " + -30935 + ", " + local141.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!y;Z)V")
	private void method126(@OriginalArg(0) Class1_Sub1_Sub1_Sub1 arg0) {
		try {
			arg0.anInt1006 = arg0.anInt990;
			if (arg0.anInt1030 == 0) {
				arg0.anInt1031 = 0;
			} else {
				if (arg0.anInt1009 != -1 && arg0.anInt1012 == 0) {
					@Pc(32) Class27 local32 = Class27.aClass27Array1[arg0.anInt1009];
					if (arg0.anInt1032 > 0 && local32.anInt799 == 0) {
						arg0.anInt1031++;
						return;
					}
					if (arg0.anInt1032 <= 0 && local32.anInt800 == 0) {
						arg0.anInt1031++;
						return;
					}
				}
				@Pc(61) int local61 = arg0.anInt986;
				@Pc(64) int local64 = arg0.anInt987;
				@Pc(79) int local79 = arg0.anIntArray269[arg0.anInt1030 - 1] * 128 + arg0.anInt989 * 64;
				@Pc(94) int local94 = arg0.anIntArray270[arg0.anInt1030 - 1] * 128 + arg0.anInt989 * 64;
				if (local79 - local61 <= 256 && local79 - local61 >= -256 && local94 - local64 <= 256 && local94 - local64 >= -256) {
					if (local61 < local79) {
						if (local64 < local94) {
							arg0.anInt1028 = 1280;
						} else if (local64 > local94) {
							arg0.anInt1028 = 1792;
						} else {
							arg0.anInt1028 = 1536;
						}
					} else if (local61 > local79) {
						if (local64 < local94) {
							arg0.anInt1028 = 768;
						} else if (local64 > local94) {
							arg0.anInt1028 = 256;
						} else {
							arg0.anInt1028 = 512;
						}
					} else if (local64 < local94) {
						arg0.anInt1028 = 1024;
					} else {
						arg0.anInt1028 = 0;
					}
					@Pc(188) int local188 = arg0.anInt1028 - arg0.anInt988 & 0x7FF;
					if (local188 > 1024) {
						local188 -= 2048;
					}
					@Pc(195) int local195 = arg0.anInt993;
					if (local188 >= -256 && local188 <= 256) {
						local195 = arg0.anInt992;
					} else if (local188 >= 256 && local188 < 768) {
						local195 = arg0.anInt995;
					} else if (local188 >= -768 && local188 <= -256) {
						local195 = arg0.anInt994;
					}
					if (local195 == -1) {
						local195 = arg0.anInt992;
					}
					arg0.anInt1006 = local195;
					@Pc(237) int local237 = 4;
					if (arg0.anInt988 != arg0.anInt1028 && arg0.anInt1003 == -1 && arg0.anInt1029 != 0) {
						local237 = 2;
					}
					if (arg0.anInt1030 > 2) {
						local237 = 6;
					}
					if (arg0.anInt1030 > 3) {
						local237 = 8;
					}
					if (arg0.anInt1031 > 0 && arg0.anInt1030 > 1) {
						local237 = 8;
						arg0.anInt1031--;
					}
					if (arg0.aBooleanArray12[arg0.anInt1030 - 1]) {
						local237 <<= 0x1;
					}
					if (local237 >= 8 && arg0.anInt1006 == arg0.anInt992 && arg0.anInt996 != -1) {
						arg0.anInt1006 = arg0.anInt996;
					}
					if (local61 < local79) {
						arg0.anInt986 += local237;
						if (arg0.anInt986 > local79) {
							arg0.anInt986 = local79;
						}
					} else if (local61 > local79) {
						arg0.anInt986 -= local237;
						if (arg0.anInt986 < local79) {
							arg0.anInt986 = local79;
						}
					}
					if (local64 < local94) {
						arg0.anInt987 += local237;
						if (arg0.anInt987 > local94) {
							arg0.anInt987 = local94;
						}
					} else if (local64 > local94) {
						arg0.anInt987 -= local237;
						if (arg0.anInt987 < local94) {
							arg0.anInt987 = local94;
						}
					}
					if (arg0.anInt986 == local79 && arg0.anInt987 == local94) {
						arg0.anInt1030--;
						if (arg0.anInt1032 > 0) {
							arg0.anInt1032--;
							return;
						}
					}
				} else {
					arg0.anInt986 = local79;
					arg0.anInt987 = local94;
				}
			}
		} catch (@Pc(399) RuntimeException local399) {
			signlink.reporterror("78691, " + arg0 + ", " + false + ", " + local399.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILclient!y;)V")
	private void method127(@OriginalArg(1) Class1_Sub1_Sub1_Sub1 arg0) {
		try {
			if (arg0.anInt1029 != 0) {
				@Pc(31) int local31;
				@Pc(37) int local37;
				if (arg0.anInt1003 != -1 && arg0.anInt1003 < 32768) {
					@Pc(23) Class1_Sub1_Sub1_Sub1_Sub2 local23 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[arg0.anInt1003];
					if (local23 != null) {
						local31 = arg0.anInt986 - local23.anInt986;
						local37 = arg0.anInt987 - local23.anInt987;
						if (local31 != 0 || local37 != 0) {
							arg0.anInt1028 = (int) (Math.atan2((double) local31, (double) local37) * 325.949D) & 0x7FF;
						}
					}
				}
				@Pc(62) int local62;
				if (arg0.anInt1003 >= 32768) {
					local62 = arg0.anInt1003 - 32768;
					if (local62 == this.anInt345) {
						local62 = this.anInt272;
					}
					@Pc(74) Class1_Sub1_Sub1_Sub1_Sub1 local74 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local62];
					if (local74 != null) {
						local37 = arg0.anInt986 - local74.anInt986;
						@Pc(88) int local88 = arg0.anInt987 - local74.anInt987;
						if (local37 != 0 || local88 != 0) {
							arg0.anInt1028 = (int) (Math.atan2((double) local37, (double) local88) * 325.949D) & 0x7FF;
						}
					}
				}
				if ((arg0.anInt1004 != 0 || arg0.anInt1005 != 0) && (arg0.anInt1030 == 0 || arg0.anInt1031 > 0)) {
					local62 = arg0.anInt986 - (arg0.anInt1004 - this.anInt278 - this.anInt278) * 64;
					local31 = arg0.anInt987 - (arg0.anInt1005 - this.anInt279 - this.anInt279) * 64;
					if (local62 != 0 || local31 != 0) {
						arg0.anInt1028 = (int) (Math.atan2((double) local62, (double) local31) * 325.949D) & 0x7FF;
					}
					arg0.anInt1004 = 0;
					arg0.anInt1005 = 0;
				}
				local62 = arg0.anInt1028 - arg0.anInt988 & 0x7FF;
				if (local62 != 0) {
					if (local62 < arg0.anInt1029 || local62 > 2048 - arg0.anInt1029) {
						arg0.anInt988 = arg0.anInt1028;
					} else if (local62 > 1024) {
						arg0.anInt988 -= arg0.anInt1029;
					} else {
						arg0.anInt988 += arg0.anInt1029;
					}
					arg0.anInt988 &= 0x7FF;
					if (arg0.anInt1006 == arg0.anInt990 && arg0.anInt988 != arg0.anInt1028) {
						if (arg0.anInt991 != -1) {
							arg0.anInt1006 = arg0.anInt991;
							return;
						}
						arg0.anInt1006 = arg0.anInt992;
						return;
					}
				}
			}
		} catch (@Pc(242) RuntimeException local242) {
			signlink.reporterror("95921, " + 1 + ", " + arg0 + ", " + local242.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Lclient!y;B)V")
	private void method128(@OriginalArg(0) Class1_Sub1_Sub1_Sub1 arg0) {
		try {
			arg0.aBoolean261 = false;
			@Pc(19) Class27 local19;
			if (arg0.anInt1006 != -1) {
				local19 = Class27.aClass27Array1[arg0.anInt1006];
				arg0.anInt1008++;
				if (arg0.anInt1007 < local19.anInt793 && arg0.anInt1008 > local19.method500(arg0.anInt1007)) {
					arg0.anInt1008 = 0;
					arg0.anInt1007++;
				}
				if (arg0.anInt1007 >= local19.anInt793) {
					arg0.anInt1008 = 0;
					arg0.anInt1007 = 0;
				}
			}
			if (arg0.anInt1014 != -1 && anInt265 >= arg0.anInt1017) {
				if (arg0.anInt1015 < 0) {
					arg0.anInt1015 = 0;
				}
				local19 = Class33.aClass33Array1[arg0.anInt1014].aClass27_2;
				arg0.anInt1016++;
				while (arg0.anInt1015 < local19.anInt793 && arg0.anInt1016 > local19.method500(arg0.anInt1015)) {
					arg0.anInt1016 -= local19.method500(arg0.anInt1015);
					arg0.anInt1015++;
				}
				if (arg0.anInt1015 >= local19.anInt793 && (arg0.anInt1015 < 0 || arg0.anInt1015 >= local19.anInt793)) {
					arg0.anInt1014 = -1;
				}
			}
			if (arg0.anInt1009 != -1 && arg0.anInt1012 <= 1) {
				local19 = Class27.aClass27Array1[arg0.anInt1009];
				if (local19.anInt799 == 1 && arg0.anInt1032 > 0 && arg0.anInt1023 <= anInt265 && arg0.anInt1024 < anInt265) {
					arg0.anInt1012 = 1;
					return;
				}
			}
			if (arg0.anInt1009 != -1 && arg0.anInt1012 == 0) {
				local19 = Class27.aClass27Array1[arg0.anInt1009];
				arg0.anInt1011++;
				while (arg0.anInt1010 < local19.anInt793 && arg0.anInt1011 > local19.method500(arg0.anInt1010)) {
					arg0.anInt1011 -= local19.method500(arg0.anInt1010);
					arg0.anInt1010++;
				}
				if (arg0.anInt1010 >= local19.anInt793) {
					arg0.anInt1010 -= local19.anInt794;
					arg0.anInt1013++;
					if (arg0.anInt1013 >= local19.anInt798) {
						arg0.anInt1009 = -1;
					}
					if (arg0.anInt1010 < 0 || arg0.anInt1010 >= local19.anInt793) {
						arg0.anInt1009 = -1;
					}
				}
				arg0.aBoolean261 = local19.aBoolean211;
			}
			if (arg0.anInt1012 > 0) {
				arg0.anInt1012--;
			}
		} catch (@Pc(264) RuntimeException local264) {
			signlink.reporterror("78146, " + arg0 + ", " + -93 + ", " + local264.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "n", descriptor = "(I)V")
	private void method129() {
		try {
			if (this.aBoolean86) {
				this.aBoolean86 = false;
				this.aClass35_3.method519(super.aGraphics2, 0, 4);
				this.aClass35_4.method519(super.aGraphics2, 0, 357);
				this.aClass35_5.method519(super.aGraphics2, 722, 4);
				this.aClass35_6.method519(super.aGraphics2, 743, 205);
				this.aClass35_7.method519(super.aGraphics2, 0, 0);
				this.aClass35_8.method519(super.aGraphics2, 516, 4);
				this.aClass35_9.method519(super.aGraphics2, 516, 205);
				this.aClass35_10.method519(super.aGraphics2, 496, 357);
				this.aClass35_11.method519(super.aGraphics2, 0, 338);
				this.aBoolean88 = true;
				this.aBoolean75 = true;
				this.aBoolean68 = true;
				this.aBoolean67 = true;
				if (this.anInt348 != 2) {
					this.aClass35_17.method519(super.aGraphics2, 4, 4);
					this.aClass35_16.method519(super.aGraphics2, 550, 4);
				}
			}
			if (this.anInt348 == 2) {
				this.method203();
			}
			if (this.aBoolean85 && this.anInt323 == 1) {
				this.aBoolean88 = true;
			}
			@Pc(138) boolean local138;
			if (this.anInt390 != -1) {
				local138 = this.method182(this.anInt390, this.anInt251);
				if (local138) {
					this.aBoolean88 = true;
				}
			}
			if (this.anInt400 == 2) {
				this.aBoolean88 = true;
			}
			if (this.anInt358 == 2) {
				this.aBoolean88 = true;
			}
			if (this.aBoolean88) {
				this.method135(640);
				this.aBoolean88 = false;
			}
			if (this.anInt392 == -1) {
				this.aClass6_1.anInt431 = this.anInt330 - this.anInt339 - 77;
				if (super.anInt194 > 448 && super.anInt194 < 560 && super.anInt195 > 332) {
					this.method96(false, 0, super.anInt194 - 17, 77, 463, this.anInt330, super.anInt195 - 357, this.aClass6_1, (byte) 7);
				}
				@Pc(220) int local220 = this.anInt330 - this.aClass6_1.anInt431 - 77;
				if (local220 < 0) {
					local220 = 0;
				}
				if (local220 > this.anInt330 - 77) {
					local220 = this.anInt330 - 77;
				}
				if (this.anInt339 != local220) {
					this.anInt339 = local220;
					this.aBoolean75 = true;
				}
			}
			if (this.anInt392 != -1) {
				local138 = this.method182(this.anInt392, this.anInt251);
				if (local138) {
					this.aBoolean75 = true;
				}
			}
			if (this.anInt400 == 3) {
				this.aBoolean75 = true;
			}
			if (this.anInt358 == 3) {
				this.aBoolean75 = true;
			}
			if (this.aString12 != null) {
				this.aBoolean75 = true;
			}
			if (this.aBoolean85 && this.anInt323 == 2) {
				this.aBoolean75 = true;
			}
			if (this.aBoolean75) {
				this.method214((byte) 6);
				this.aBoolean75 = false;
			}
			if (this.anInt348 == 2) {
				this.method106();
				this.aClass35_16.method519(super.aGraphics2, 550, 4);
			}
			if (this.anInt286 != -1) {
				this.aBoolean68 = true;
			}
			if (this.aBoolean68) {
				if (this.anInt286 != -1 && this.anInt286 == this.anInt317) {
					this.anInt286 = -1;
					this.aClass1_Sub1_Sub3_2.method463(94);
					this.aClass1_Sub1_Sub3_2.method464(this.anInt317);
				}
				this.aBoolean68 = false;
				this.aClass35_14.method518(979);
				this.aClass1_Sub1_Sub2_Sub3_18.method415(0, (byte) 1, 0);
				if (this.anInt390 == -1) {
					if (this.anIntArray47[this.anInt317] != -1) {
						if (this.anInt317 == 0) {
							this.aClass1_Sub1_Sub2_Sub3_11.method415(22, (byte) 1, 10);
						}
						if (this.anInt317 == 1) {
							this.aClass1_Sub1_Sub2_Sub3_12.method415(54, (byte) 1, 8);
						}
						if (this.anInt317 == 2) {
							this.aClass1_Sub1_Sub2_Sub3_12.method415(82, (byte) 1, 8);
						}
						if (this.anInt317 == 3) {
							this.aClass1_Sub1_Sub2_Sub3_13.method415(110, (byte) 1, 8);
						}
						if (this.anInt317 == 4) {
							this.aClass1_Sub1_Sub2_Sub3_15.method415(153, (byte) 1, 8);
						}
						if (this.anInt317 == 5) {
							this.aClass1_Sub1_Sub2_Sub3_15.method415(181, (byte) 1, 8);
						}
						if (this.anInt317 == 6) {
							this.aClass1_Sub1_Sub2_Sub3_14.method415(209, (byte) 1, 9);
						}
					}
					if (this.anIntArray47[0] != -1 && (this.anInt286 != 0 || anInt265 % 20 < 10)) {
						this.aClass1_Sub1_Sub2_Sub3Array2[0].method415(29, (byte) 1, 13);
					}
					if (this.anIntArray47[1] != -1 && (this.anInt286 != 1 || anInt265 % 20 < 10)) {
						this.aClass1_Sub1_Sub2_Sub3Array2[1].method415(53, (byte) 1, 11);
					}
					if (this.anIntArray47[2] != -1 && (this.anInt286 != 2 || anInt265 % 20 < 10)) {
						this.aClass1_Sub1_Sub2_Sub3Array2[2].method415(82, (byte) 1, 11);
					}
					if (this.anIntArray47[3] != -1 && (this.anInt286 != 3 || anInt265 % 20 < 10)) {
						this.aClass1_Sub1_Sub2_Sub3Array2[3].method415(115, (byte) 1, 12);
					}
					if (this.anIntArray47[4] != -1 && (this.anInt286 != 4 || anInt265 % 20 < 10)) {
						this.aClass1_Sub1_Sub2_Sub3Array2[4].method415(153, (byte) 1, 13);
					}
					if (this.anIntArray47[5] != -1 && (this.anInt286 != 5 || anInt265 % 20 < 10)) {
						this.aClass1_Sub1_Sub2_Sub3Array2[5].method415(180, (byte) 1, 11);
					}
					if (this.anIntArray47[6] != -1 && (this.anInt286 != 6 || anInt265 % 20 < 10)) {
						this.aClass1_Sub1_Sub2_Sub3Array2[6].method415(208, (byte) 1, 13);
					}
				}
				this.aClass35_14.method519(super.aGraphics2, 516, 160);
				this.aClass35_13.method518(979);
				this.aClass1_Sub1_Sub2_Sub3_17.method415(0, (byte) 1, 0);
				if (this.anInt390 == -1) {
					if (this.anIntArray47[this.anInt317] != -1) {
						if (this.anInt317 == 7) {
							this.aClass1_Sub1_Sub2_Sub3_3.method415(42, (byte) 1, 0);
						}
						if (this.anInt317 == 8) {
							this.aClass1_Sub1_Sub2_Sub3_4.method415(74, (byte) 1, 0);
						}
						if (this.anInt317 == 9) {
							this.aClass1_Sub1_Sub2_Sub3_4.method415(102, (byte) 1, 0);
						}
						if (this.anInt317 == 10) {
							this.aClass1_Sub1_Sub2_Sub3_5.method415(130, (byte) 1, 1);
						}
						if (this.anInt317 == 11) {
							this.aClass1_Sub1_Sub2_Sub3_7.method415(173, (byte) 1, 0);
						}
						if (this.anInt317 == 12) {
							this.aClass1_Sub1_Sub2_Sub3_7.method415(201, (byte) 1, 0);
						}
						if (this.anInt317 == 13) {
							this.aClass1_Sub1_Sub2_Sub3_6.method415(229, (byte) 1, 0);
						}
					}
					if (this.anIntArray47[8] != -1 && (this.anInt286 != 8 || anInt265 % 20 < 10)) {
						this.aClass1_Sub1_Sub2_Sub3Array2[7].method415(74, (byte) 1, 2);
					}
					if (this.anIntArray47[9] != -1 && (this.anInt286 != 9 || anInt265 % 20 < 10)) {
						this.aClass1_Sub1_Sub2_Sub3Array2[8].method415(102, (byte) 1, 3);
					}
					if (this.anIntArray47[10] != -1 && (this.anInt286 != 10 || anInt265 % 20 < 10)) {
						this.aClass1_Sub1_Sub2_Sub3Array2[9].method415(137, (byte) 1, 4);
					}
					if (this.anIntArray47[11] != -1 && (this.anInt286 != 11 || anInt265 % 20 < 10)) {
						this.aClass1_Sub1_Sub2_Sub3Array2[10].method415(174, (byte) 1, 2);
					}
					if (this.anIntArray47[12] != -1 && (this.anInt286 != 12 || anInt265 % 20 < 10)) {
						this.aClass1_Sub1_Sub2_Sub3Array2[11].method415(201, (byte) 1, 2);
					}
					if (this.anIntArray47[13] != -1 && (this.anInt286 != 13 || anInt265 % 20 < 10)) {
						this.aClass1_Sub1_Sub2_Sub3Array2[12].method415(226, (byte) 1, 2);
					}
				}
				this.aClass35_13.method519(super.aGraphics2, 496, 466);
				this.aClass35_17.method518(979);
			}
			if (this.aBoolean67) {
				this.aBoolean67 = false;
				this.aClass35_12.method518(979);
				this.aClass1_Sub1_Sub2_Sub3_16.method415(0, (byte) 1, 0);
				this.aClass1_Sub1_Sub2_Sub4_2.method444(true, 28, "Public chat", 55, 16777215);
				if (this.anInt415 == 0) {
					this.aClass1_Sub1_Sub2_Sub4_2.method444(true, 41, "On", 55, 65280);
				}
				if (this.anInt415 == 1) {
					this.aClass1_Sub1_Sub2_Sub4_2.method444(true, 41, "Friends", 55, 16776960);
				}
				if (this.anInt415 == 2) {
					this.aClass1_Sub1_Sub2_Sub4_2.method444(true, 41, "Off", 55, 16711680);
				}
				if (this.anInt415 == 3) {
					this.aClass1_Sub1_Sub2_Sub4_2.method444(true, 41, "Hide", 55, 65535);
				}
				this.aClass1_Sub1_Sub2_Sub4_2.method444(true, 28, "Private chat", 184, 16777215);
				if (this.anInt355 == 0) {
					this.aClass1_Sub1_Sub2_Sub4_2.method444(true, 41, "On", 184, 65280);
				}
				if (this.anInt355 == 1) {
					this.aClass1_Sub1_Sub2_Sub4_2.method444(true, 41, "Friends", 184, 16776960);
				}
				if (this.anInt355 == 2) {
					this.aClass1_Sub1_Sub2_Sub4_2.method444(true, 41, "Off", 184, 16711680);
				}
				this.aClass1_Sub1_Sub2_Sub4_2.method444(true, 28, "Trade/compete", 324, 16777215);
				if (this.anInt225 == 0) {
					this.aClass1_Sub1_Sub2_Sub4_2.method444(true, 41, "On", 324, 65280);
				}
				if (this.anInt225 == 1) {
					this.aClass1_Sub1_Sub2_Sub4_2.method444(true, 41, "Friends", 324, 16776960);
				}
				if (this.anInt225 == 2) {
					this.aClass1_Sub1_Sub2_Sub4_2.method444(true, 41, "Off", 324, 16711680);
				}
				this.aClass1_Sub1_Sub2_Sub4_2.method444(true, 33, "Report abuse", 458, 16777215);
				this.aClass35_12.method519(super.aGraphics2, 0, 453);
				this.aClass35_17.method518(979);
			}
			this.anInt251 = 0;
		} catch (@Pc(1051) RuntimeException local1051) {
			signlink.reporterror("45399, " + 38919 + ", " + local1051.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(Z)V")
	private void method130() {
		try {
			this.anInt210 = 0;
			@Pc(62) int local62;
			@Pc(82) int local82;
			for (@Pc(15) int local15 = -1; local15 < this.anInt273 + this.anInt393; local15++) {
				@Pc(22) Class1_Sub1_Sub1_Sub1 local22;
				if (local15 == -1) {
					local22 = aClass1_Sub1_Sub1_Sub1_Sub1_1;
				} else if (local15 < this.anInt273) {
					local22 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[this.anIntArray49[local15]];
				} else {
					local22 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[this.anIntArray78[local15 - this.anInt273]];
				}
				if (local22 != null && local22.method675()) {
					if (local15 >= this.anInt273) {
						@Pc(155) Class13 local155 = ((Class1_Sub1_Sub1_Sub1_Sub2) local22).aClass13_2;
						if (local155.anInt568 >= 0 && local155.anInt568 < this.aClass1_Sub1_Sub2_Sub2Array5.length) {
							this.method158(local22.anInt1027 + 15, local22);
							if (this.anInt408 > -1) {
								this.aClass1_Sub1_Sub2_Sub2Array5[local155.anInt568].method388(this.anInt408 - 12, (byte) 1, this.anInt409 - 30);
							}
						}
						if (this.anInt297 == 1 && this.anInt249 == this.anIntArray78[local15 - this.anInt273] && anInt265 % 20 < 10) {
							this.method158(local22.anInt1027 + 15, local22);
							if (this.anInt408 > -1) {
								this.aClass1_Sub1_Sub2_Sub2Array5[2].method388(this.anInt408 - 12, (byte) 1, this.anInt409 - 28);
							}
						}
					} else {
						local62 = 30;
						@Pc(65) Class1_Sub1_Sub1_Sub1_Sub1 local65 = (Class1_Sub1_Sub1_Sub1_Sub1) local22;
						if (local65.anInt129 != 0) {
							this.method158(local22.anInt1027 + 15, local22);
							if (this.anInt408 > -1) {
								for (local82 = 0; local82 < 8; local82++) {
									if ((local65.anInt129 & 0x1 << local82) != 0) {
										this.aClass1_Sub1_Sub2_Sub2Array5[local82].method388(this.anInt408 - 12, (byte) 1, this.anInt409 - local62);
										local62 -= 25;
									}
								}
							}
						}
						if (local15 >= 0 && this.anInt297 == 10 && this.anInt413 == this.anIntArray49[local15]) {
							this.method158(local22.anInt1027 + 15, local22);
							if (this.anInt408 > -1) {
								this.aClass1_Sub1_Sub2_Sub2Array5[7].method388(this.anInt408 - 12, (byte) 1, this.anInt409 - local62);
							}
						}
					}
					if (local22.aString31 != null && (local15 >= this.anInt273 || this.anInt415 == 0 || this.anInt415 == 3 || this.anInt415 == 1 && this.method103(((Class1_Sub1_Sub1_Sub1_Sub1) local22).aString3))) {
						this.method158(local22.anInt1027, local22);
						if (this.anInt408 > -1 && this.anInt210 < this.anInt211) {
							this.anIntArray34[this.anInt210] = this.aClass1_Sub1_Sub2_Sub4_3.method446(local22.aString31) / 2;
							this.anIntArray33[this.anInt210] = this.aClass1_Sub1_Sub2_Sub4_3.anInt704;
							this.anIntArray31[this.anInt210] = this.anInt408;
							this.anIntArray32[this.anInt210] = this.anInt409;
							this.anIntArray35[this.anInt210] = local22.anInt998;
							this.anIntArray36[this.anInt210] = local22.anInt999;
							this.anIntArray37[this.anInt210] = local22.anInt997;
							this.aStringArray1[this.anInt210++] = local22.aString31;
							if (this.anInt382 == 0 && local22.anInt999 == 1) {
								this.anIntArray33[this.anInt210] += 10;
								this.anIntArray32[this.anInt210] += 5;
							}
							if (this.anInt382 == 0 && local22.anInt999 == 2) {
								this.anIntArray34[this.anInt210] = 60;
							}
						}
					}
					if (local22.anInt1000 > anInt265) {
						this.method158(local22.anInt1027 + 15, local22);
						if (this.anInt408 > -1) {
							local62 = local22.anInt1001 * 30 / local22.anInt1002;
							if (local62 > 30) {
								local62 = 30;
							}
							Class1_Sub1_Sub2.method436(this.anInt408 - 15, 65280, 5, local62, this.anInt409 - 3);
							Class1_Sub1_Sub2.method436(this.anInt408 + local62 - 15, 16711680, 5, 30 - local62, this.anInt409 - 3);
						}
					}
					for (local62 = 0; local62 < 4; local62++) {
						if (local22.anIntArray268[local62] > anInt265) {
							this.method158(local22.anInt1027 / 2, local22);
							if (this.anInt408 > -1) {
								if (local62 == 1) {
									this.anInt409 -= 20;
								}
								if (local62 == 2) {
									this.anInt408 -= 15;
									this.anInt409 -= 10;
								}
								if (local62 == 3) {
									this.anInt408 += 15;
									this.anInt409 -= 10;
								}
								this.aClass1_Sub1_Sub2_Sub2Array3[local22.anIntArray267[local62]].method388(this.anInt408 - 12, (byte) 1, this.anInt409 - 12);
								this.aClass1_Sub1_Sub2_Sub4_1.method443(this.anInt408, 0, String.valueOf(local22.anIntArray266[local62]), this.anInt409 + 4);
								this.aClass1_Sub1_Sub2_Sub4_1.method443(this.anInt408 - 1, 16777215, String.valueOf(local22.anIntArray266[local62]), this.anInt409 + 3);
							}
						}
					}
				}
			}
			for (@Pc(567) int local567 = 0; local567 < this.anInt210; local567++) {
				local62 = this.anIntArray31[local567];
				@Pc(579) int local579 = this.anIntArray32[local567];
				local82 = this.anIntArray34[local567];
				@Pc(589) int local589 = this.anIntArray33[local567];
				@Pc(591) boolean local591 = true;
				while (local591) {
					local591 = false;
					for (@Pc(597) int local597 = 0; local597 < local567; local597++) {
						if (local579 + 2 > this.anIntArray32[local597] - this.anIntArray33[local597] && local579 - local589 < this.anIntArray32[local597] + 2 && local62 - local82 < this.anIntArray31[local597] + this.anIntArray34[local597] && local62 + local82 > this.anIntArray31[local597] - this.anIntArray34[local597] && this.anIntArray32[local597] - this.anIntArray33[local597] < local579) {
							local579 = this.anIntArray32[local597] - this.anIntArray33[local597];
							local591 = true;
						}
					}
				}
				this.anInt408 = this.anIntArray31[local567];
				this.anInt409 = this.anIntArray32[local567] = local579;
				@Pc(696) String local696 = this.aStringArray1[local567];
				if (this.anInt382 == 0) {
					@Pc(701) int local701 = 16776960;
					if (this.anIntArray35[local567] < 6) {
						local701 = this.anIntArray83[this.anIntArray35[local567]];
					}
					if (this.anIntArray35[local567] == 6) {
						local701 = this.anInt328 % 20 < 10 ? 16711680 : 16776960;
					}
					if (this.anIntArray35[local567] == 7) {
						local701 = this.anInt328 % 20 < 10 ? 255 : 65535;
					}
					if (this.anIntArray35[local567] == 8) {
						local701 = this.anInt328 % 20 < 10 ? 45056 : 8454016;
					}
					@Pc(776) int local776;
					if (this.anIntArray35[local567] == 9) {
						local776 = 150 - this.anIntArray37[local567];
						if (local776 < 50) {
							local701 = local776 * 1280 + 16711680;
						} else if (local776 < 100) {
							local701 = 16776960 - (local776 - 50) * 327680;
						} else if (local776 < 150) {
							local701 = (local776 - 100) * 5 + 65280;
						}
					}
					if (this.anIntArray35[local567] == 10) {
						local776 = 150 - this.anIntArray37[local567];
						if (local776 < 50) {
							local701 = local776 * 5 + 16711680;
						} else if (local776 < 100) {
							local701 = 16711935 - (local776 - 50) * 327680;
						} else if (local776 < 150) {
							local701 = (local776 - 100) * 327680 + 255 - (local776 - 100) * 5;
						}
					}
					if (this.anIntArray35[local567] == 11) {
						local776 = 150 - this.anIntArray37[local567];
						if (local776 < 50) {
							local701 = 16777215 - local776 * 327685;
						} else if (local776 < 100) {
							local701 = (local776 - 50) * 327685 + 65280;
						} else if (local776 < 150) {
							local701 = 16777215 - (local776 - 100) * 327680;
						}
					}
					if (this.anIntArray36[local567] == 0) {
						this.aClass1_Sub1_Sub2_Sub4_3.method443(this.anInt408, 0, local696, this.anInt409 + 1);
						this.aClass1_Sub1_Sub2_Sub4_3.method443(this.anInt408, local701, local696, this.anInt409);
					}
					if (this.anIntArray36[local567] == 1) {
						this.aClass1_Sub1_Sub2_Sub4_3.method448(0, local696, this.anInt328, this.anInt409 + 1, this.anInt408, (byte) 8);
						this.aClass1_Sub1_Sub2_Sub4_3.method448(local701, local696, this.anInt328, this.anInt409, this.anInt408, (byte) 8);
					}
					if (this.anIntArray36[local567] == 2) {
						local776 = this.aClass1_Sub1_Sub2_Sub4_3.method446(local696);
						@Pc(997) int local997 = (150 - this.anIntArray37[local567]) * (local776 + 100) / 150;
						Class1_Sub1_Sub2.method433(0, this.anInt408 - 50, this.anInt408 + 50, 334, 297);
						this.aClass1_Sub1_Sub2_Sub4_3.method447(this.anInt408 + 50 - local997, local696, this.anInt409 + 1, 0);
						this.aClass1_Sub1_Sub2_Sub4_3.method447(this.anInt408 + 50 - local997, local696, this.anInt409, local701);
						Class1_Sub1_Sub2.method432();
					}
				} else {
					this.aClass1_Sub1_Sub2_Sub4_3.method443(this.anInt408, 0, local696, this.anInt409 + 1);
					this.aClass1_Sub1_Sub2_Sub4_3.method443(this.anInt408, 16776960, local696, this.anInt409);
				}
			}
		} catch (@Pc(1072) RuntimeException local1072) {
			signlink.reporterror("38377, " + false + ", " + local1072.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "o", descriptor = "(I)V")
	private void method131() {
		try {
			@Pc(4) Graphics local4 = this.method93().getGraphics();
			local4.setColor(Color.black);
			local4.fillRect(0, 0, 765, 503);
			this.method86((byte) 1);
			@Pc(41) byte local41;
			@Pc(47) int local47;
			if (this.aBoolean91) {
				this.aBoolean81 = false;
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
			if (this.aBoolean59) {
				this.aBoolean81 = false;
				local4.setFont(new Font("Helvetica", 1, 20));
				local4.setColor(Color.white);
				local4.drawString("Error - unable to load game!", 50, 50);
				local4.drawString("To play RuneScape make sure you play from", 50, 100);
				local4.drawString("http://www.runescape.com", 50, 150);
			}
			if (this.aBoolean80) {
				this.aBoolean81 = false;
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
			signlink.reporterror("40083, " + 0 + ", " + local179.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "f", descriptor = "(Z)V")
	private void method132() {
		try {
			this.aBoolean81 = false;
			while (this.aBoolean83) {
				this.aBoolean81 = false;
				try {
					Thread.sleep(50L);
				} catch (@Pc(11) Exception local11) {
				}
			}
			this.aClass1_Sub1_Sub2_Sub3_1 = null;
			this.aClass1_Sub1_Sub2_Sub3_2 = null;
			this.aClass1_Sub1_Sub2_Sub3Array3 = null;
			this.anIntArray55 = null;
			this.anIntArray56 = null;
			this.anIntArray57 = null;
			this.anIntArray58 = null;
			this.anIntArray38 = null;
			this.anIntArray39 = null;
			this.anIntArray44 = null;
			this.anIntArray45 = null;
			this.aClass1_Sub1_Sub2_Sub2_7 = null;
			this.aClass1_Sub1_Sub2_Sub2_8 = null;
		} catch (@Pc(64) RuntimeException local64) {
			signlink.reporterror("8290, " + false + ", " + local64.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "p", descriptor = "(I)V")
	private void method133() {
		try {
			signlink.anInt943 = 0;
			signlink.midi = "stop";
		} catch (@Pc(12) RuntimeException local12) {
			signlink.reporterror("80559, " + -232 + ", " + local12.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!jb;I)V")
	private void method134(@OriginalArg(0) Class1_Sub1_Sub2_Sub3 arg0) {
		try {
			for (@Pc(5) int local5 = 0; local5 < this.anIntArray38.length; local5++) {
				this.anIntArray38[local5] = 0;
			}
			@Pc(30) int local30;
			for (@Pc(20) int local20 = 0; local20 < 5000; local20++) {
				local30 = (int) (Math.random() * 128.0D * (double) 256);
				this.anIntArray38[local30] = (int) (Math.random() * 256.0D);
			}
			@Pc(48) int local48;
			@Pc(52) int local52;
			@Pc(60) int local60;
			for (local30 = 0; local30 < 20; local30++) {
				for (local48 = 1; local48 < 255; local48++) {
					for (local52 = 1; local52 < 127; local52++) {
						local60 = local52 + (local48 << 7);
						this.anIntArray39[local60] = (this.anIntArray38[local60 - 1] + this.anIntArray38[local60 + 1] + this.anIntArray38[local60 - 128] + this.anIntArray38[local60 + 128]) / 4;
					}
				}
				@Pc(106) int[] local106 = this.anIntArray38;
				this.anIntArray38 = this.anIntArray39;
				this.anIntArray39 = local106;
			}
			if (arg0 != null) {
				local48 = 0;
				for (local52 = 0; local52 < arg0.anInt671; local52++) {
					for (local60 = 0; local60 < arg0.anInt670; local60++) {
						if (arg0.aByteArray7[local48++] != 0) {
							@Pc(145) int local145 = local60 + arg0.anInt672 + 16;
							@Pc(152) int local152 = local52 + arg0.anInt673 + 16;
							@Pc(158) int local158 = local145 + (local152 << 7);
							this.anIntArray38[local158] = 0;
						}
					}
				}
			}
		} catch (@Pc(175) RuntimeException local175) {
			signlink.reporterror("30916, " + arg0 + ", " + 0 + ", " + local175.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "q", descriptor = "(I)V")
	private void method135(@OriginalArg(0) int arg0) {
		try {
			this.aClass35_15.method518(979);
			@Pc(7) boolean local7 = false;
			Class1_Sub1_Sub2_Sub1.anIntArray177 = this.anIntArray69;
			this.aClass1_Sub1_Sub2_Sub3_8.method415(0, (byte) 1, 0);
			if (this.anInt390 != -1) {
				this.method228(Class6.aClass6Array1[this.anInt390], 0, 0, 0);
			} else if (this.anIntArray47[this.anInt317] != -1) {
				this.method228(Class6.aClass6Array1[this.anIntArray47[this.anInt317]], 0, 0, 0);
			}
			if (this.aBoolean85 && this.anInt323 == 1) {
				this.method171();
			}
			this.aClass35_15.method519(super.aGraphics2, 553, 205);
			this.aClass35_17.method518(979);
			Class1_Sub1_Sub2_Sub1.anIntArray177 = this.anIntArray70;
		} catch (@Pc(79) RuntimeException local79) {
			signlink.reporterror("8118, " + arg0 + ", " + local79.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "r", descriptor = "(I)V")
	private void method136() {
		try {
			@Pc(12) int local12 = 5;
			this.anIntArray86[8] = 0;
			@Pc(19) int local19 = 0;
			while (this.anIntArray86[8] == 0) {
				@Pc(23) String local23 = "Unknown problem";
				this.method95(20, "Connecting to web server");
				try {
					@Pc(45) DataInputStream local45 = this.method105("crc" + (int) (Math.random() * 9.9999999E7D) + "-" + 282);
					@Pc(52) Class1_Sub1_Sub3 local52 = new Class1_Sub1_Sub3(new byte[40], 185);
					local45.readFully(local52.aByteArray9, 0, 40);
					local45.close();
					for (@Pc(62) int local62 = 0; local62 < 9; local62++) {
						this.anIntArray86[local62] = local52.method479();
					}
					@Pc(77) int local77 = local52.method479();
					@Pc(79) int local79 = 1234;
					for (@Pc(81) int local81 = 0; local81 < 9; local81++) {
						local79 = (local79 << 1) + this.anIntArray86[local81];
					}
					if (local77 != local79) {
						local23 = "checksum problem";
						this.anIntArray86[8] = 0;
					}
				} catch (@Pc(108) EOFException local108) {
					local23 = "EOF problem";
					this.anIntArray86[8] = 0;
				} catch (@Pc(117) IOException local117) {
					local23 = "connection problem";
					this.anIntArray86[8] = 0;
				} catch (@Pc(126) Exception local126) {
					local23 = "logic problem";
					this.anIntArray86[8] = 0;
					if (!signlink.reporterror) {
						return;
					}
				}
				if (this.anIntArray86[8] == 0) {
					local19++;
					for (@Pc(144) int local144 = local12; local144 > 0; local144--) {
						if (local19 >= 10) {
							this.method95(10, "Game updated - please reload page");
							local144 = 10;
						} else {
							this.method95(10, local23 + " - Will retry in " + local144 + " secs.");
						}
						try {
							Thread.sleep(1000L);
						} catch (@Pc(178) Exception local178) {
						}
					}
					local12 *= 2;
					if (local12 > 60) {
						local12 = 60;
					}
					this.aBoolean69 = !this.aBoolean69;
				}
			}
		} catch (@Pc(206) RuntimeException local206) {
			signlink.reporterror("85565, " + 0 + ", " + local206.toString());
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
				return new URL("http://127.0.0.1:" + (anInt248 + 80));
			}
		} catch (@Pc(21) Exception local21) {
		}
		return super.getCodeBase();
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIII)I")
	private int method138(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		try {
			@Pc(3) int local3 = 256 - arg2;
			this.anInt301 += 0;
			return ((arg1 & 0xFF00FF) * local3 + (arg0 & 0xFF00FF) * arg2 & 0xFF00FF00) + ((arg1 & 0xFF00) * local3 + (arg0 & 0xFF00) * arg2 & 0xFF0000) >> 8;
		} catch (@Pc(40) RuntimeException local40) {
			signlink.reporterror("30342, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 0 + ", " + local40.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(B)V")
	private void method139() {
		try {
			@Pc(12) int local12;
			for (@Pc(5) int local5 = 10; local5 < 117; local5++) {
				local12 = (int) (Math.random() * 100.0D);
				if (local12 < 50) {
					this.anIntArray44[local5 + 32512] = 255;
				}
			}
			@Pc(41) int local41;
			@Pc(48) int local48;
			@Pc(54) int local54;
			for (local12 = 0; local12 < 100; local12++) {
				local41 = (int) (Math.random() * 124.0D) + 2;
				local48 = (int) (Math.random() * 128.0D) + 128;
				local54 = local41 + (local48 << 7);
				this.anIntArray44[local54] = 192;
			}
			for (local41 = 1; local41 < 255; local41++) {
				for (local48 = 1; local48 < 127; local48++) {
					local54 = local48 + (local41 << 7);
					this.anIntArray45[local54] = (this.anIntArray44[local54 - 1] + this.anIntArray44[local54 + 1] + this.anIntArray44[local54 - 128] + this.anIntArray44[local54 + 128]) / 4;
				}
			}
			this.anInt306 += 128;
			if (this.anInt306 > this.anIntArray38.length) {
				this.anInt306 -= this.anIntArray38.length;
				local48 = (int) (Math.random() * 12.0D);
				this.method134(this.aClass1_Sub1_Sub2_Sub3Array3[local48]);
			}
			@Pc(171) int local171;
			for (local48 = 1; local48 < 255; local48++) {
				for (local54 = 1; local54 < 127; local54++) {
					local171 = local54 + (local48 << 7);
					@Pc(194) int local194 = this.anIntArray45[local171 + 128] - this.anIntArray38[local171 + this.anInt306 & this.anIntArray38.length - 1] / 5;
					if (local194 < 0) {
						local194 = 0;
					}
					this.anIntArray44[local171] = local194;
				}
			}
			for (local54 = 0; local54 < 255; local54++) {
				this.anIntArray88[local54] = this.anIntArray88[local54 + 1];
			}
			this.anIntArray88[255] = (int) (Math.sin((double) anInt265 / 14.0D) * 16.0D + Math.sin((double) anInt265 / 15.0D) * 14.0D + Math.sin((double) anInt265 / 16.0D) * 12.0D);
			if (this.anInt406 > 0) {
				this.anInt406 -= 4;
			}
			if (this.anInt407 > 0) {
				this.anInt407 -= 4;
			}
			if (this.anInt406 == 0 && this.anInt407 == 0) {
				local171 = (int) (Math.random() * 2000.0D);
				if (local171 == 0) {
					this.anInt406 = 1024;
				}
				if (local171 == 1) {
					this.anInt407 = 1024;
					return;
				}
			}
		} catch (@Pc(305) RuntimeException local305) {
			signlink.reporterror("31346, " + 16 + ", " + local305.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "s", descriptor = "(I)V")
	private void method140() {
		try {
			for (@Pc(3) int local3 = 0; local3 < this.anInt262; local3++) {
				if (this.anIntArray43[local3] <= 0) {
					@Pc(12) boolean local12 = false;
					try {
						if (this.anIntArray62[local3] != this.anInt391 || this.anIntArray60[local3] != this.anInt307) {
							@Pc(45) Class1_Sub1_Sub3 local45 = Class5.method78(this.anIntArray62[local3], this.anIntArray60[local3]);
							if (System.currentTimeMillis() + (long) (local45.anInt738 / 22) > this.aLong18 + (long) (this.anInt350 / 22)) {
								this.anInt350 = local45.anInt738;
								this.aLong18 = System.currentTimeMillis();
								if (this.method119(local45.aByteArray9, local45.anInt738)) {
									this.anInt391 = this.anIntArray62[local3];
									this.anInt307 = this.anIntArray60[local3];
								} else {
									local12 = true;
								}
							}
						} else if (!this.method192((byte) 5)) {
							local12 = true;
						}
					} catch (@Pc(95) Exception local95) {
					}
					if (local12 && this.anIntArray43[local3] != -5) {
						this.anIntArray43[local3] = -5;
					} else {
						this.anInt262--;
						for (@Pc(111) int local111 = local3; local111 < this.anInt262; local111++) {
							this.anIntArray62[local111] = this.anIntArray62[local111 + 1];
							this.anIntArray60[local111] = this.anIntArray60[local111 + 1];
							this.anIntArray43[local111] = this.anIntArray43[local111 + 1];
						}
						local3--;
					}
				} else {
					@Pc(163) int local163 = this.anIntArray43[local3]--;
				}
			}
			if (this.anInt205 > 0) {
				this.anInt205 -= 20;
				if (this.anInt205 < 0) {
					this.anInt205 = 0;
				}
				if (this.anInt205 == 0 && this.aBoolean66 && !aBoolean71) {
					this.anInt401 = this.anInt235;
					this.aBoolean93 = true;
					this.aClass44_Sub1_1.method639(2, this.anInt401);
					return;
				}
			}
		} catch (@Pc(217) RuntimeException local217) {
			signlink.reporterror("89857, " + 9 + ", " + local217.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!lb;IB)V")
	private void method141(@OriginalArg(0) Class1_Sub1_Sub3 arg0, @OriginalArg(1) int arg1) {
		try {
			arg0.method484();
			@Pc(7) int local7 = arg0.method485(1);
			if (local7 != 0) {
				@Pc(15) int local15 = arg0.method485(2);
				if (local15 == 0) {
					this.anIntArray50[this.anInt274++] = this.anInt272;
				} else {
					@Pc(47) int local47;
					@Pc(57) int local57;
					if (local15 == 1) {
						local47 = arg0.method485(3);
						aClass1_Sub1_Sub1_Sub1_Sub1_1.method673((byte) 5, local47, false);
						local57 = arg0.method485(1);
						if (local57 == 1) {
							this.anIntArray50[this.anInt274++] = this.anInt272;
						}
					} else {
						@Pc(101) int local101;
						if (local15 == 2) {
							local47 = arg0.method485(3);
							aClass1_Sub1_Sub1_Sub1_Sub1_1.method673((byte) 5, local47, true);
							local57 = arg0.method485(3);
							aClass1_Sub1_Sub1_Sub1_Sub1_1.method673((byte) 5, local57, true);
							local101 = arg0.method485(1);
							if (local101 == 1) {
								this.anIntArray50[this.anInt274++] = this.anInt272;
							}
						} else if (local15 == 3) {
							this.anInt245 = arg0.method485(2);
							local47 = arg0.method485(7);
							local57 = arg0.method485(7);
							local101 = arg0.method485(1);
							aClass1_Sub1_Sub1_Sub1_Sub1_1.method672(local47, local101 == 1, local57);
							@Pc(157) int local157 = arg0.method485(1);
							if (local157 == 1) {
								this.anIntArray50[this.anInt274++] = this.anInt272;
							}
						}
					}
				}
			}
		} catch (@Pc(174) RuntimeException local174) {
			signlink.reporterror("7762, " + arg0 + ", " + arg1 + ", " + 0 + ", " + local174.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "g", descriptor = "(Z)V")
	private void method142() {
		try {
			if (aBoolean71 && this.anInt348 == 2 && Class4.anInt169 != this.anInt245) {
				this.aClass35_17.method518(979);
				this.aClass1_Sub1_Sub2_Sub4_2.method443(257, 0, "Loading - please wait.", 151);
				this.aClass1_Sub1_Sub2_Sub4_2.method443(256, 16777215, "Loading - please wait.", 150);
				this.aClass35_17.method519(super.aGraphics2, 4, 4);
				this.anInt348 = 1;
				this.aLong17 = System.currentTimeMillis();
			}
			if (this.anInt348 == 1) {
				@Pc(55) int local55 = this.method143();
				if (local55 != 0 && System.currentTimeMillis() - this.aLong17 > 360000L) {
					signlink.reporterror(this.aString15 + " glcfb " + this.aLong15 + "," + local55 + "," + aBoolean71 + "," + this.aClass45Array1[0] + "," + this.aClass44_Sub1_1.method640() + "," + this.anInt245 + "," + this.anInt388 + "," + this.anInt389);
					this.aLong17 = System.currentTimeMillis();
				}
			}
			if (this.anInt348 == 2 && this.anInt245 != this.anInt206) {
				this.anInt206 = this.anInt245;
				this.method178(this.anInt245);
			}
		} catch (@Pc(136) RuntimeException local136) {
			signlink.reporterror("47196, " + true + ", " + local136.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "h", descriptor = "(Z)I")
	private int method143() {
		try {
			for (@Pc(3) int local3 = 0; local3 < this.aByteArrayArray2.length; local3++) {
				if (this.aByteArrayArray2[local3] == null && this.anIntArray74[local3] != -1) {
					return -1;
				}
				if (this.aByteArrayArray1[local3] == null && this.anIntArray75[local3] != -1) {
					return -2;
				}
			}
			@Pc(39) boolean local39 = true;
			for (@Pc(41) int local41 = 0; local41 < this.aByteArrayArray2.length; local41++) {
				@Pc(48) byte[] local48 = this.aByteArrayArray1[local41];
				if (local48 != null) {
					@Pc(62) int local62 = (this.anIntArray73[local41] >> 8) * 64 - this.anInt278;
					@Pc(74) int local74 = (this.anIntArray73[local41] & 0xFF) * 64 - this.anInt279;
					local39 &= Class4.method57(local74, local48, local62);
				}
			}
			if (!local39) {
				return -3;
			} else if (this.aBoolean77) {
				return -4;
			} else {
				this.anInt348 = 2;
				Class4.anInt169 = this.anInt245;
				this.method222();
				this.aClass1_Sub1_Sub3_2.method463(214);
				return 0;
			}
		} catch (@Pc(120) RuntimeException local120) {
			signlink.reporterror("89445, " + false + ", " + local120.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!lb;ILclient!ab;II)V")
	private void method144(@OriginalArg(0) Class1_Sub1_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class1_Sub1_Sub1_Sub1_Sub1 arg2, @OriginalArg(3) int arg3) {
		try {
			@Pc(18) int local18;
			if ((arg1 & 0x1) == 1) {
				local18 = arg0.method474();
				@Pc(21) byte[] local21 = new byte[local18];
				@Pc(27) Class1_Sub1_Sub3 local27 = new Class1_Sub1_Sub3(local21, 185);
				arg0.method483(local18, local21);
				this.aClass1_Sub1_Sub3Array1[arg3] = local27;
				arg2.method39(local27);
			}
			@Pc(65) int local65;
			@Pc(77) int local77;
			if ((arg1 & 0x2) == 2) {
				local18 = arg0.method476();
				if (local18 == 65535) {
					local18 = -1;
				}
				if (local18 == arg2.anInt1009) {
					arg2.anInt1013 = 0;
				}
				local65 = arg0.method474();
				if (local18 == arg2.anInt1009 && local18 != -1) {
					local77 = Class27.aClass27Array1[local18].anInt801;
					if (local77 == 1) {
						arg2.anInt1010 = 0;
						arg2.anInt1011 = 0;
						arg2.anInt1012 = local65;
						arg2.anInt1013 = 0;
					}
					if (local77 == 2) {
						arg2.anInt1013 = 0;
					}
				} else if (local18 == -1 || arg2.anInt1009 == -1 || Class27.aClass27Array1[local18].anInt795 >= Class27.aClass27Array1[arg2.anInt1009].anInt795) {
					arg2.anInt1009 = local18;
					arg2.anInt1010 = 0;
					arg2.anInt1011 = 0;
					arg2.anInt1012 = local65;
					arg2.anInt1013 = 0;
					arg2.anInt1032 = arg2.anInt1030;
				}
			}
			if ((arg1 & 0x4) == 4) {
				arg2.anInt1003 = arg0.method476();
				if (arg2.anInt1003 == 65535) {
					arg2.anInt1003 = -1;
				}
			}
			if ((arg1 & 0x8) == 8) {
				arg2.aString31 = arg0.method481();
				arg2.anInt998 = 0;
				arg2.anInt999 = 0;
				arg2.anInt997 = 150;
				this.method217(this.aByte2, arg2.aString3, arg2.aString31, 2);
			}
			if ((arg1 & 0x10) == 16) {
				local18 = arg0.method474();
				local65 = arg0.method474();
				arg2.method676(local18, local65, anInt265);
				arg2.anInt1000 = anInt265 + 300;
				arg2.anInt1001 = arg0.method474();
				arg2.anInt1002 = arg0.method474();
			}
			if ((arg1 & 0x20) == 32) {
				arg2.anInt1004 = arg0.method476();
				arg2.anInt1005 = arg0.method476();
			}
			if ((arg1 & 0x40) == 64) {
				local18 = arg0.method476();
				local65 = arg0.method474();
				local77 = arg0.method474();
				@Pc(239) int local239 = arg0.anInt738;
				if (arg2.aString3 != null && arg2.aBoolean32) {
					@Pc(249) long local249 = Class48.method661(arg2.aString3);
					@Pc(251) boolean local251 = false;
					if (local65 <= 1) {
						for (@Pc(256) int local256 = 0; local256 < this.anInt252; local256++) {
							if (this.aLongArray4[local256] == local249) {
								local251 = true;
								break;
							}
						}
					}
					if (!local251 && this.anInt316 == 0) {
						try {
							@Pc(284) String local284 = Class49.method678(local77, arg0);
							@Pc(288) String local288 = Class42.method598(local284);
							arg2.aString31 = local288;
							arg2.anInt998 = local18 >> 8;
							arg2.anInt999 = local18 & 0xFF;
							arg2.anInt997 = 150;
							if (local65 == 2 || local65 == 3) {
								this.method217(this.aByte2, "@cr2@" + arg2.aString3, local288, 1);
							} else if (local65 == 1) {
								this.method217(this.aByte2, "@cr1@" + arg2.aString3, local288, 1);
							} else {
								this.method217(this.aByte2, arg2.aString3, local288, 2);
							}
						} catch (@Pc(355) Exception local355) {
							signlink.reporterror("cde2");
						}
					}
				}
				arg0.anInt738 = local239 + local77;
			}
			if ((arg1 & 0x100) == 256) {
				arg2.anInt1014 = arg0.method476();
				local18 = arg0.method479();
				arg2.anInt1018 = local18 >> 16;
				arg2.anInt1017 = anInt265 + (local18 & 0xFFFF);
				arg2.anInt1015 = 0;
				arg2.anInt1016 = 0;
				if (arg2.anInt1017 > anInt265) {
					arg2.anInt1015 = -1;
				}
				if (arg2.anInt1014 == 65535) {
					arg2.anInt1014 = -1;
				}
			}
			if ((arg1 & 0x200) == 512) {
				arg2.anInt1019 = arg0.method474();
				arg2.anInt1021 = arg0.method474();
				arg2.anInt1020 = arg0.method474();
				arg2.anInt1022 = arg0.method474();
				arg2.anInt1023 = arg0.method476() + anInt265;
				arg2.anInt1024 = arg0.method476() + anInt265;
				arg2.anInt1025 = arg0.method474();
				arg2.method674();
			}
			if ((arg1 & 0x400) == 1024) {
				local18 = arg0.method474();
				local65 = arg0.method474();
				arg2.method676(local18, local65, anInt265);
				arg2.anInt1000 = anInt265 + 300;
				arg2.anInt1001 = arg0.method474();
				arg2.anInt1002 = arg0.method474();
			}
		} catch (@Pc(479) RuntimeException local479) {
			signlink.reporterror("42259, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + 0 + ", " + local479.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "()V")
	@Override
	protected void method88() {
		this.method95(20, "Starting up");
		if (signlink.sunjava) {
			super.anInt188 = 5;
		}
		if (aBoolean63) {
			this.aBoolean80 = true;
			return;
		}
		aBoolean63 = true;
		@Pc(21) boolean local21 = false;
		@Pc(25) String local25 = this.method107();
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
				this.aClass45Array1[local95] = new Class45(284, 500000, signlink.aRandomAccessFileArray1[local95], local95 + 1, signlink.aRandomAccessFile1);
			}
		}
		try {
			this.method136();
			this.aClass47_1 = this.method146(1, "title", this.anIntArray86[1], "title screen", 25);
			this.aClass1_Sub1_Sub2_Sub4_1 = new Class1_Sub1_Sub2_Sub4(this.aClass47_1, false, "p11_full", 8);
			this.aClass1_Sub1_Sub2_Sub4_2 = new Class1_Sub1_Sub2_Sub4(this.aClass47_1, false, "p12_full", 8);
			this.aClass1_Sub1_Sub2_Sub4_3 = new Class1_Sub1_Sub2_Sub4(this.aClass47_1, false, "b12_full", 8);
			this.aClass1_Sub1_Sub2_Sub4_4 = new Class1_Sub1_Sub2_Sub4(this.aClass47_1, true, "q8_full", 8);
			this.method199();
			this.method180();
			@Pc(191) Class47 local191 = this.method146(2, "config", this.anIntArray86[2], "config", 30);
			@Pc(203) Class47 local203 = this.method146(3, "interface", this.anIntArray86[3], "interface", 35);
			@Pc(215) Class47 local215 = this.method146(4, "media", this.anIntArray86[4], "2d graphics", 40);
			@Pc(227) Class47 local227 = this.method146(6, "textures", this.anIntArray86[6], "textures", 45);
			@Pc(239) Class47 local239 = this.method146(7, "wordenc", this.anIntArray86[7], "chat system", 50);
			@Pc(251) Class47 local251 = this.method146(8, "sounds", this.anIntArray86[8], "sound effects", 55);
			this.aByteArrayArrayArray7 = new byte[4][104][104];
			this.anIntArrayArrayArray5 = new int[4][105][105];
			this.aClass37_1 = new Class37(16215, 104, 4, this.anIntArrayArrayArray5, 104);
			for (@Pc(276) int local276 = 0; local276 < 4; local276++) {
				this.aClass19Array1[local276] = new Class19((byte) -97, 104, 104);
			}
			this.aClass1_Sub1_Sub2_Sub2_1 = new Class1_Sub1_Sub2_Sub2(512, 512);
			@Pc(311) Class47 local311 = this.method146(5, "versionlist", this.anIntArray86[5], "update list", 60);
			this.method95(60, "Connecting to update server");
			this.aClass44_Sub1_1 = new Class44_Sub1();
			this.aClass44_Sub1_1.method630(local311, this);
			Class12.method300(this.aClass44_Sub1_1.method633());
			Class1_Sub1_Sub1_Sub5.method257(this.aClass44_Sub1_1.method632(0), this.aClass44_Sub1_1);
			if (!aBoolean71) {
				this.anInt401 = 0;
				try {
					this.anInt401 = Integer.parseInt(this.getParameter("music"));
				} catch (@Pc(352) Exception local352) {
				}
				this.aBoolean93 = true;
				this.aClass44_Sub1_1.method639(2, this.anInt401);
				while (this.aClass44_Sub1_1.method640() > 0) {
					this.method225();
					try {
						Thread.sleep(100L);
					} catch (@Pc(370) Exception local370) {
					}
					if (this.aClass44_Sub1_1.anInt955 > 3) {
						this.method164("ondemand");
						return;
					}
				}
			}
			this.method95(65, "Requesting animations");
			@Pc(394) int local394 = this.aClass44_Sub1_1.method632(1);
			for (@Pc(396) int local396 = 0; local396 < local394; local396++) {
				this.aClass44_Sub1_1.method639(1, local396);
			}
			@Pc(415) int local415;
			while (this.aClass44_Sub1_1.method640() > 0) {
				local415 = local394 - this.aClass44_Sub1_1.method640();
				if (local415 > 0) {
					this.method95(65, "Loading animations - " + local415 * 100 / local394 + "%");
				}
				this.method225();
				try {
					Thread.sleep(100L);
				} catch (@Pc(441) Exception local441) {
				}
				if (this.aClass44_Sub1_1.anInt955 > 3) {
					this.method164("ondemand");
					return;
				}
			}
			this.method95(70, "Requesting models");
			local394 = this.aClass44_Sub1_1.method632(0);
			@Pc(475) int local475;
			for (local415 = 0; local415 < local394; local415++) {
				local475 = this.aClass44_Sub1_1.method637(local415);
				if ((local475 & 0x1) != 0) {
					this.aClass44_Sub1_1.method639(0, local415);
				}
			}
			local394 = this.aClass44_Sub1_1.method640();
			while (this.aClass44_Sub1_1.method640() > 0) {
				local475 = local394 - this.aClass44_Sub1_1.method640();
				if (local475 > 0) {
					this.method95(70, "Loading models - " + local475 * 100 / local394 + "%");
				}
				this.method225();
				try {
					Thread.sleep(100L);
				} catch (@Pc(526) Exception local526) {
				}
			}
			if (this.aClass45Array1[0] != null) {
				this.method95(75, "Requesting maps");
				this.aClass44_Sub1_1.method639(3, this.aClass44_Sub1_1.method634(0, 47, 48));
				this.aClass44_Sub1_1.method639(3, this.aClass44_Sub1_1.method634(1, 47, 48));
				this.aClass44_Sub1_1.method639(3, this.aClass44_Sub1_1.method634(0, 48, 48));
				this.aClass44_Sub1_1.method639(3, this.aClass44_Sub1_1.method634(1, 48, 48));
				this.aClass44_Sub1_1.method639(3, this.aClass44_Sub1_1.method634(0, 49, 48));
				this.aClass44_Sub1_1.method639(3, this.aClass44_Sub1_1.method634(1, 49, 48));
				this.aClass44_Sub1_1.method639(3, this.aClass44_Sub1_1.method634(0, 47, 47));
				this.aClass44_Sub1_1.method639(3, this.aClass44_Sub1_1.method634(1, 47, 47));
				this.aClass44_Sub1_1.method639(3, this.aClass44_Sub1_1.method634(0, 48, 47));
				this.aClass44_Sub1_1.method639(3, this.aClass44_Sub1_1.method634(1, 48, 47));
				this.aClass44_Sub1_1.method639(3, this.aClass44_Sub1_1.method634(0, 48, 148));
				this.aClass44_Sub1_1.method639(3, this.aClass44_Sub1_1.method634(1, 48, 148));
				local394 = this.aClass44_Sub1_1.method640();
				while (this.aClass44_Sub1_1.method640() > 0) {
					local475 = local394 - this.aClass44_Sub1_1.method640();
					if (local475 > 0) {
						this.method95(75, "Loading maps - " + local475 * 100 / local394 + "%");
					}
					this.method225();
					try {
						Thread.sleep(100L);
					} catch (@Pc(711) Exception local711) {
					}
				}
			}
			local394 = this.aClass44_Sub1_1.method632(0);
			@Pc(732) int local732;
			for (local475 = 0; local475 < local394; local475++) {
				local732 = this.aClass44_Sub1_1.method637(local475);
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
					this.aClass44_Sub1_1.method642(local475, local734, 0);
				}
			}
			this.aClass44_Sub1_1.method635((byte) 9, aBoolean70);
			if (!aBoolean71) {
				local394 = this.aClass44_Sub1_1.method632(2);
				for (local732 = 1; local732 < local394; local732++) {
					if (this.aClass44_Sub1_1.method638(local732)) {
						this.aClass44_Sub1_1.method642(local732, (byte) 1, 2);
					}
				}
			}
			this.method95(80, "Unpacking media");
			this.aClass1_Sub1_Sub2_Sub3_8 = new Class1_Sub1_Sub2_Sub3(local215, "invback", 0);
			this.aClass1_Sub1_Sub2_Sub3_10 = new Class1_Sub1_Sub2_Sub3(local215, "chatback", 0);
			this.aClass1_Sub1_Sub2_Sub3_9 = new Class1_Sub1_Sub2_Sub3(local215, "mapback", 0);
			this.aClass1_Sub1_Sub2_Sub3_16 = new Class1_Sub1_Sub2_Sub3(local215, "backbase1", 0);
			this.aClass1_Sub1_Sub2_Sub3_17 = new Class1_Sub1_Sub2_Sub3(local215, "backbase2", 0);
			this.aClass1_Sub1_Sub2_Sub3_18 = new Class1_Sub1_Sub2_Sub3(local215, "backhmid1", 0);
			for (local732 = 0; local732 < 13; local732++) {
				this.aClass1_Sub1_Sub2_Sub3Array2[local732] = new Class1_Sub1_Sub2_Sub3(local215, "sideicons", local732);
			}
			this.aClass1_Sub1_Sub2_Sub2_6 = new Class1_Sub1_Sub2_Sub2(local215, "compass", 0);
			this.aClass1_Sub1_Sub2_Sub2_13 = new Class1_Sub1_Sub2_Sub2(local215, "mapedge", 0);
			this.aClass1_Sub1_Sub2_Sub2_13.method385();
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
					this.aClass1_Sub1_Sub2_Sub2Array3[local934] = new Class1_Sub1_Sub2_Sub2(local215, "hitmarks", local934);
				}
			} catch (@Pc(992) Exception local992) {
			}
			try {
				for (local934 = 0; local934 < 20; local934++) {
					this.aClass1_Sub1_Sub2_Sub2Array5[local934] = new Class1_Sub1_Sub2_Sub2(local215, "headicons", local934);
				}
			} catch (@Pc(1012) Exception local1012) {
			}
			this.aClass1_Sub1_Sub2_Sub2_11 = new Class1_Sub1_Sub2_Sub2(local215, "mapmarker", 0);
			this.aClass1_Sub1_Sub2_Sub2_12 = new Class1_Sub1_Sub2_Sub2(local215, "mapmarker", 1);
			for (local934 = 0; local934 < 8; local934++) {
				this.aClass1_Sub1_Sub2_Sub2Array4[local934] = new Class1_Sub1_Sub2_Sub2(local215, "cross", local934);
			}
			this.aClass1_Sub1_Sub2_Sub2_2 = new Class1_Sub1_Sub2_Sub2(local215, "mapdots", 0);
			this.aClass1_Sub1_Sub2_Sub2_3 = new Class1_Sub1_Sub2_Sub2(local215, "mapdots", 1);
			this.aClass1_Sub1_Sub2_Sub2_4 = new Class1_Sub1_Sub2_Sub2(local215, "mapdots", 2);
			this.aClass1_Sub1_Sub2_Sub2_5 = new Class1_Sub1_Sub2_Sub2(local215, "mapdots", 3);
			this.aClass1_Sub1_Sub2_Sub3_19 = new Class1_Sub1_Sub2_Sub3(local215, "scrollbar", 0);
			this.aClass1_Sub1_Sub2_Sub3_20 = new Class1_Sub1_Sub2_Sub3(local215, "scrollbar", 1);
			this.aClass1_Sub1_Sub2_Sub3_11 = new Class1_Sub1_Sub2_Sub3(local215, "redstone1", 0);
			this.aClass1_Sub1_Sub2_Sub3_12 = new Class1_Sub1_Sub2_Sub3(local215, "redstone2", 0);
			this.aClass1_Sub1_Sub2_Sub3_13 = new Class1_Sub1_Sub2_Sub3(local215, "redstone3", 0);
			this.aClass1_Sub1_Sub2_Sub3_14 = new Class1_Sub1_Sub2_Sub3(local215, "redstone1", 0);
			this.aClass1_Sub1_Sub2_Sub3_14.method412(anInt264);
			this.aClass1_Sub1_Sub2_Sub3_15 = new Class1_Sub1_Sub2_Sub3(local215, "redstone2", 0);
			this.aClass1_Sub1_Sub2_Sub3_15.method412(anInt264);
			this.aClass1_Sub1_Sub2_Sub3_3 = new Class1_Sub1_Sub2_Sub3(local215, "redstone1", 0);
			this.aClass1_Sub1_Sub2_Sub3_3.method413();
			this.aClass1_Sub1_Sub2_Sub3_4 = new Class1_Sub1_Sub2_Sub3(local215, "redstone2", 0);
			this.aClass1_Sub1_Sub2_Sub3_4.method413();
			this.aClass1_Sub1_Sub2_Sub3_5 = new Class1_Sub1_Sub2_Sub3(local215, "redstone3", 0);
			this.aClass1_Sub1_Sub2_Sub3_5.method413();
			this.aClass1_Sub1_Sub2_Sub3_6 = new Class1_Sub1_Sub2_Sub3(local215, "redstone1", 0);
			this.aClass1_Sub1_Sub2_Sub3_6.method412(anInt264);
			this.aClass1_Sub1_Sub2_Sub3_6.method413();
			this.aClass1_Sub1_Sub2_Sub3_7 = new Class1_Sub1_Sub2_Sub3(local215, "redstone2", 0);
			this.aClass1_Sub1_Sub2_Sub3_7.method412(anInt264);
			this.aClass1_Sub1_Sub2_Sub3_7.method413();
			for (@Pc(1212) int local1212 = 0; local1212 < 2; local1212++) {
				this.aClass1_Sub1_Sub2_Sub3Array4[local1212] = new Class1_Sub1_Sub2_Sub3(local215, "mod_icons", local1212);
			}
			@Pc(1235) Class1_Sub1_Sub2_Sub2 local1235 = new Class1_Sub1_Sub2_Sub2(local215, "backleft1", 0);
			this.aClass35_3 = new Class35(local1235.anInt647, local1235.anInt646, this.method93(), false);
			local1235.method386(0, 0);
			@Pc(1260) Class1_Sub1_Sub2_Sub2 local1260 = new Class1_Sub1_Sub2_Sub2(local215, "backleft2", 0);
			this.aClass35_4 = new Class35(local1260.anInt647, local1260.anInt646, this.method93(), false);
			local1260.method386(0, 0);
			@Pc(1285) Class1_Sub1_Sub2_Sub2 local1285 = new Class1_Sub1_Sub2_Sub2(local215, "backright1", 0);
			this.aClass35_5 = new Class35(local1285.anInt647, local1285.anInt646, this.method93(), false);
			local1285.method386(0, 0);
			@Pc(1310) Class1_Sub1_Sub2_Sub2 local1310 = new Class1_Sub1_Sub2_Sub2(local215, "backright2", 0);
			this.aClass35_6 = new Class35(local1310.anInt647, local1310.anInt646, this.method93(), false);
			local1310.method386(0, 0);
			@Pc(1335) Class1_Sub1_Sub2_Sub2 local1335 = new Class1_Sub1_Sub2_Sub2(local215, "backtop1", 0);
			this.aClass35_7 = new Class35(local1335.anInt647, local1335.anInt646, this.method93(), false);
			local1335.method386(0, 0);
			@Pc(1360) Class1_Sub1_Sub2_Sub2 local1360 = new Class1_Sub1_Sub2_Sub2(local215, "backvmid1", 0);
			this.aClass35_8 = new Class35(local1360.anInt647, local1360.anInt646, this.method93(), false);
			local1360.method386(0, 0);
			@Pc(1385) Class1_Sub1_Sub2_Sub2 local1385 = new Class1_Sub1_Sub2_Sub2(local215, "backvmid2", 0);
			this.aClass35_9 = new Class35(local1385.anInt647, local1385.anInt646, this.method93(), false);
			local1385.method386(0, 0);
			@Pc(1410) Class1_Sub1_Sub2_Sub2 local1410 = new Class1_Sub1_Sub2_Sub2(local215, "backvmid3", 0);
			this.aClass35_10 = new Class35(local1410.anInt647, local1410.anInt646, this.method93(), false);
			local1410.method386(0, 0);
			@Pc(1435) Class1_Sub1_Sub2_Sub2 local1435 = new Class1_Sub1_Sub2_Sub2(local215, "backhmid2", 0);
			this.aClass35_11 = new Class35(local1435.anInt647, local1435.anInt646, this.method93(), false);
			local1435.method386(0, 0);
			@Pc(1460) int local1460 = (int) (Math.random() * 21.0D) - 10;
			@Pc(1467) int local1467 = (int) (Math.random() * 21.0D) - 10;
			@Pc(1474) int local1474 = (int) (Math.random() * 21.0D) - 10;
			@Pc(1481) int local1481 = (int) (Math.random() * 41.0D) - 20;
			for (@Pc(1483) int local1483 = 0; local1483 < 100; local1483++) {
				if (this.aClass1_Sub1_Sub2_Sub2Array6[local1483] != null) {
					this.aClass1_Sub1_Sub2_Sub2Array6[local1483].method384(local1467 + local1481, local1474 + local1481, local1460 + local1481);
				}
				if (this.aClass1_Sub1_Sub2_Sub3Array1[local1483] != null) {
					this.aClass1_Sub1_Sub2_Sub3Array1[local1483].method414(local1467 + local1481, local1474 + local1481, local1460 + local1481);
				}
			}
			this.method95(83, "Unpacking textures");
			Class1_Sub1_Sub2_Sub1.method344(anInt412, local227);
			Class1_Sub1_Sub2_Sub1.method348(0.8D);
			Class1_Sub1_Sub2_Sub1.method343();
			this.method95(86, "Unpacking config");
			Class27.method499(local191);
			Class9.method285(local191);
			Class21.method456(local191);
			Class15.method356(local191);
			Class13.method319(local191);
			Class23.method490(local191);
			Class33.method515(local191);
			Class39.method583(local191);
			Class36.method521(local191);
			Class15.aBoolean163 = aBoolean70;
			if (!aBoolean71) {
				this.method95(90, "Unpacking sounds");
				@Pc(1586) byte[] local1586 = local251.method660("sounds.dat", null);
				@Pc(1592) Class1_Sub1_Sub3 local1592 = new Class1_Sub1_Sub3(local1586, 185);
				Class5.method77(local1592);
			}
			this.method95(95, "Unpacking interfaces");
			@Pc(1623) Class1_Sub1_Sub2_Sub4[] local1623 = new Class1_Sub1_Sub2_Sub4[] { this.aClass1_Sub1_Sub2_Sub4_1, this.aClass1_Sub1_Sub2_Sub4_2, this.aClass1_Sub1_Sub2_Sub4_3, this.aClass1_Sub1_Sub2_Sub4_4 };
			Class6.method230(local203, local215, local1623);
			this.method95(100, "Preparing game engine");
			@Pc(1639) int local1639;
			@Pc(1641) int local1641;
			@Pc(1643) int local1643;
			for (@Pc(1635) int local1635 = 0; local1635 < 33; local1635++) {
				local1639 = 999;
				local1641 = 0;
				for (local1643 = 0; local1643 < 34; local1643++) {
					if (this.aClass1_Sub1_Sub2_Sub3_9.aByteArray7[local1643 + local1635 * this.aClass1_Sub1_Sub2_Sub3_9.anInt670] == 0) {
						if (local1639 == 999) {
							local1639 = local1643;
						}
					} else if (local1639 != 999) {
						local1641 = local1643;
						break;
					}
				}
				this.anIntArray53[local1635] = local1639;
				this.anIntArray48[local1635] = local1641 - local1639;
			}
			@Pc(1701) int local1701;
			for (local1639 = 5; local1639 < 156; local1639++) {
				local1641 = 999;
				local1643 = 0;
				for (local1701 = 25; local1701 < 172; local1701++) {
					if (this.aClass1_Sub1_Sub2_Sub3_9.aByteArray7[local1701 + local1639 * this.aClass1_Sub1_Sub2_Sub3_9.anInt670] == 0 && (local1701 > 34 || local1639 > 34)) {
						if (local1641 == 999) {
							local1641 = local1701;
						}
					} else if (local1641 != 999) {
						local1643 = local1701;
						break;
					}
				}
				this.anIntArray92[local1639 - 5] = local1641 - 25;
				this.anIntArray67[local1639 - 5] = local1643 - local1641;
			}
			Class1_Sub1_Sub2_Sub1.method341(479, 96);
			this.anIntArray68 = Class1_Sub1_Sub2_Sub1.anIntArray177;
			Class1_Sub1_Sub2_Sub1.method341(190, 261);
			this.anIntArray69 = Class1_Sub1_Sub2_Sub1.anIntArray177;
			Class1_Sub1_Sub2_Sub1.method341(512, 334);
			this.anIntArray70 = Class1_Sub1_Sub2_Sub1.anIntArray177;
			@Pc(1785) int[] local1785 = new int[9];
			for (local1643 = 0; local1643 < 9; local1643++) {
				local1701 = local1643 * 32 + 128 + 15;
				@Pc(1803) int local1803 = local1701 * 3 + 600;
				@Pc(1807) int local1807 = Class1_Sub1_Sub2_Sub1.anIntArray175[local1701];
				local1785[local1643] = local1803 * local1807 >> 16;
			}
			Class37.method560(local1785);
			Class42.method588(local239);
			this.aClass11_1 = new Class11(this, true);
			this.method94(this.aClass11_1, 10);
		} catch (@Pc(1842) Exception local1842) {
			signlink.reporterror("loaderror " + this.aString10 + " " + this.anInt373);
			this.aBoolean91 = true;
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ZZ)V")
	private void method145(@OriginalArg(1) boolean arg0) {
		try {
			this.method111();
			this.aClass35_21.method518(979);
			this.aClass1_Sub1_Sub2_Sub3_1.method415(0, (byte) 1, 0);
			@Pc(44) byte local44;
			@Pc(56) int local56;
			if (this.anInt268 == 0) {
				this.aClass1_Sub1_Sub2_Sub4_1.method444(true, 180, this.aClass44_Sub1_1.aString30, 180, 7711145);
				local44 = 80;
				this.aClass1_Sub1_Sub2_Sub4_3.method444(true, 80, "Welcome to RuneScape", 180, 16776960);
				local56 = local44 + 30;
				this.aClass1_Sub1_Sub2_Sub3_2.method415(27, (byte) 1, 100);
				this.aClass1_Sub1_Sub2_Sub4_3.method444(true, 125, "New User", 100, 16777215);
				this.aClass1_Sub1_Sub2_Sub3_2.method415(187, (byte) 1, 100);
				this.aClass1_Sub1_Sub2_Sub4_3.method444(true, 125, "Existing User", 260, 16777215);
			}
			if (this.anInt268 == 2) {
				local44 = 60;
				if (this.aString6.length() > 0) {
					this.aClass1_Sub1_Sub2_Sub4_3.method444(true, 45, this.aString6, 180, 16776960);
					this.aClass1_Sub1_Sub2_Sub4_3.method444(true, 60, this.aString7, 180, 16776960);
					local56 = local44 + 30;
				} else {
					this.aClass1_Sub1_Sub2_Sub4_3.method444(true, 53, this.aString7, 180, 16776960);
					local56 = local44 + 30;
				}
				this.aClass1_Sub1_Sub2_Sub4_3.method449(90, 90, true, 16777215, "Username: " + this.aString15 + (this.anInt212 == 0 & anInt265 % 40 < 20 ? "@yel@|" : ""));
				local56 += 15;
				this.aClass1_Sub1_Sub2_Sub4_3.method449(105, 92, true, 16777215, "Password: " + Class48.method667(this.aString16) + (this.anInt212 == 1 & anInt265 % 40 < 20 ? "@yel@|" : ""));
				local56 += 15;
				if (!arg0) {
					this.aClass1_Sub1_Sub2_Sub3_2.method415(27, (byte) 1, 130);
					this.aClass1_Sub1_Sub2_Sub4_3.method444(true, 155, "Login", 100, 16777215);
					this.aClass1_Sub1_Sub2_Sub3_2.method415(187, (byte) 1, 130);
					this.aClass1_Sub1_Sub2_Sub4_3.method444(true, 155, "Cancel", 260, 16777215);
				}
			}
			if (this.anInt268 == 3) {
				this.aClass1_Sub1_Sub2_Sub4_3.method444(true, 40, "Create a free account", 180, 16776960);
				local44 = 65;
				this.aClass1_Sub1_Sub2_Sub4_3.method444(true, 65, "To create a new account you need to", 180, 16777215);
				local56 = local44 + 15;
				this.aClass1_Sub1_Sub2_Sub4_3.method444(true, 80, "go back to the main RuneScape webpage", 180, 16777215);
				local56 += 15;
				this.aClass1_Sub1_Sub2_Sub4_3.method444(true, 95, "and choose the red 'create account'", 180, 16777215);
				local56 += 15;
				this.aClass1_Sub1_Sub2_Sub4_3.method444(true, 110, "button at the top right of that page.", 180, 16777215);
				local56 += 15;
				this.aClass1_Sub1_Sub2_Sub3_2.method415(107, (byte) 1, 130);
				this.aClass1_Sub1_Sub2_Sub4_3.method444(true, 155, "Cancel", 180, 16777215);
			}
			this.aClass35_21.method519(super.aGraphics2, 202, 171);
			this.aBoolean90 &= true;
			if (this.aBoolean86) {
				this.aBoolean86 = false;
				this.aClass35_19.method519(super.aGraphics2, 128, 0);
				this.aClass35_20.method519(super.aGraphics2, 202, 371);
				this.aClass35_24.method519(super.aGraphics2, 0, 265);
				this.aClass35_25.method519(super.aGraphics2, 562, 265);
				this.aClass35_26.method519(super.aGraphics2, 128, 171);
				this.aClass35_27.method519(super.aGraphics2, 562, 171);
			}
		} catch (@Pc(495) RuntimeException local495) {
			signlink.reporterror("68156, " + true + ", " + arg0 + ", " + local495.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILjava/lang/String;ILjava/lang/String;II)Lclient!xb;")
	private Class47 method146(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) String arg3, @OriginalArg(4) int arg4) {
		try {
			this.anInt301 += 0;
			@Pc(9) byte[] local9 = null;
			@Pc(11) int local11 = 5;
			try {
				if (this.aClass45Array1[0] != null) {
					local9 = this.aClass45Array1[0].method652(arg0);
				}
			} catch (@Pc(26) Exception local26) {
			}
			@Pc(40) int local40;
			if (local9 != null) {
				this.aCRC32_1.reset();
				this.aCRC32_1.update(local9);
				local40 = (int) this.aCRC32_1.getValue();
				if (local40 != arg2) {
					local9 = null;
				}
			}
			if (local9 != null) {
				return new Class47(-32452, local9);
			}
			local40 = 0;
			while (local9 == null) {
				@Pc(61) String local61 = "Unknown error";
				this.method95(arg4, "Requesting " + arg3);
				@Pc(76) int local76;
				try {
					local76 = 0;
					@Pc(87) DataInputStream local87 = this.method105(arg1 + arg2);
					@Pc(90) byte[] local90 = new byte[6];
					local87.readFully(local90, 0, 6);
					@Pc(101) Class1_Sub1_Sub3 local101 = new Class1_Sub1_Sub3(local90, 185);
					local101.anInt738 = 3;
					@Pc(109) int local109 = local101.method478() + 6;
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
							this.method95(arg4, "Loading " + arg3 + " - " + local174 + "%");
						}
						local76 = local174;
					}
					local87.close();
					try {
						if (this.aClass45Array1[0] != null) {
							this.aClass45Array1[0].method653(local9, arg0, local9.length);
						}
					} catch (@Pc(219) Exception local219) {
						this.aClass45Array1[0] = null;
					}
					if (local9 != null) {
						this.aCRC32_1.reset();
						this.aCRC32_1.update(local9);
						local134 = (int) this.aCRC32_1.getValue();
						if (local134 != arg2) {
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
							this.method95(arg4, "Game updated - please reload page");
							local76 = 10;
						} else {
							this.method95(arg4, local61 + " - Retrying in " + local76);
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
					this.aBoolean69 = !this.aBoolean69;
				}
			}
			return new Class47(-32452, local9);
		} catch (@Pc(358) RuntimeException local358) {
			signlink.reporterror("76648, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + 0 + ", " + local358.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(IIII)I")
	private int method147(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
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
			@Pc(48) int local48 = arg1 & 0x7F;
			@Pc(52) int local52 = arg0 & 0x7F;
			@Pc(80) int local80 = this.anIntArrayArrayArray5[local21][local3][local7] * (128 - local48) + this.anIntArrayArrayArray5[local21][local3 + 1][local7] * local48 >> 7;
			@Pc(112) int local112 = this.anIntArrayArrayArray5[local21][local3][local7 + 1] * (128 - local48) + this.anIntArrayArrayArray5[local21][local3 + 1][local7 + 1] * local48 >> 7;
			return local80 * (128 - local52) + local112 * local52 >> 7;
		} catch (@Pc(125) RuntimeException local125) {
			signlink.reporterror("75831, " + arg0 + ", " + arg1 + ", " + -195 + ", " + arg2 + ", " + local125.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIII)Z")
	private boolean method148(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		try {
			@Pc(7) int local7 = arg2 >> 14 & 0x7FFF;
			@Pc(16) int local16 = this.aClass37_1.method554(this.anInt245, arg1, arg3, arg2);
			if (local16 == -1) {
				return false;
			}
			@Pc(25) int local25 = local16 & 0x1F;
			@Pc(31) int local31 = local16 >> 6 & 0x3;
			anInt335++;
			if (anInt335 > 1086) {
				anInt335 = 0;
				this.aClass1_Sub1_Sub3_2.method463(149);
				this.aClass1_Sub1_Sub3_2.method464(0);
				@Pc(53) int local53 = this.aClass1_Sub1_Sub3_2.anInt738;
				if ((int) (Math.random() * 2.0D) == 0) {
					this.aClass1_Sub1_Sub3_2.method465(16791);
				}
				this.aClass1_Sub1_Sub3_2.method464(254);
				this.aClass1_Sub1_Sub3_2.method465((int) (Math.random() * 65536.0D));
				this.aClass1_Sub1_Sub3_2.method465(16128);
				this.aClass1_Sub1_Sub3_2.method465(52610);
				this.aClass1_Sub1_Sub3_2.method465((int) (Math.random() * 65536.0D));
				this.aClass1_Sub1_Sub3_2.method465(55420);
				if ((int) (Math.random() * 2.0D) == 0) {
					this.aClass1_Sub1_Sub3_2.method465(35025);
				}
				this.aClass1_Sub1_Sub3_2.method465(46628);
				this.aClass1_Sub1_Sub3_2.method464((int) (Math.random() * 256.0D));
				this.aClass1_Sub1_Sub3_2.method473(this.aClass1_Sub1_Sub3_2.anInt738 - local53);
			}
			if (local25 == 10 || local25 == 11 || local25 == 22) {
				@Pc(133) Class9 local133 = Class9.method287(local7);
				@Pc(141) int local141;
				@Pc(144) int local144;
				if (local31 == 0 || local31 == 2) {
					local141 = local133.anInt508;
					local144 = local133.anInt509;
				} else {
					local141 = local133.anInt509;
					local144 = local133.anInt508;
				}
				@Pc(155) int local155 = local133.anInt520;
				if (local31 != 0) {
					local155 = (local155 << local31 & 0xF) + (local155 >> 4 - local31);
				}
				this.method181(false, local155, aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray270[0], local141, aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray269[0], 0, arg1, local144, arg3, 0, 2);
			} else {
				this.method181(false, 0, aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray270[0], 0, aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray269[0], local25 + 1, arg1, 0, arg3, local31, 2);
			}
			this.anInt255 = super.anInt200;
			this.anInt301 += 0;
			this.anInt256 = super.anInt201;
			this.anInt258 = 2;
			this.anInt257 = 0;
			this.aClass1_Sub1_Sub3_2.method463(arg0);
			this.aClass1_Sub1_Sub3_2.method465(arg1 + this.anInt278);
			this.aClass1_Sub1_Sub3_2.method465(arg3 + this.anInt279);
			this.aClass1_Sub1_Sub3_2.method465(local7);
			return true;
		} catch (@Pc(261) RuntimeException local261) {
			signlink.reporterror("91536, " + arg0 + ", " + arg1 + ", " + 0 + ", " + arg2 + ", " + arg3 + ", " + local261.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IILjava/lang/String;)V")
	@Override
	protected void method95(@OriginalArg(1) int arg0, @OriginalArg(2) String arg1) {
		try {
			this.anInt373 = arg0;
			this.aString10 = arg1;
			this.method111();
			if (this.aClass47_1 == null) {
				super.method95(arg0, arg1);
			} else {
				this.aClass35_21.method518(979);
				this.aClass1_Sub1_Sub2_Sub4_3.method443(180, 16777215, "RuneScape is loading - please wait...", 54);
				Class1_Sub1_Sub2.method437(304, 9179409, 34, 62, 28);
				if (this.anInt374 == 9) {
					Class1_Sub1_Sub2.method437(302, 0, 32, 63, 29);
					Class1_Sub1_Sub2.method436(30, 9179409, 30, arg0 * 3, 64);
					Class1_Sub1_Sub2.method436(arg0 * 3 + 30, 0, 30, 300 - arg0 * 3, 64);
					this.aClass1_Sub1_Sub2_Sub4_3.method443(180, 16777215, arg1, 85);
					this.aClass35_21.method519(super.aGraphics2, 202, 171);
					if (this.aBoolean86) {
						this.aBoolean86 = false;
						if (!this.aBoolean81) {
							this.aClass35_22.method519(super.aGraphics2, 0, 0);
							this.aClass35_23.method519(super.aGraphics2, 637, 0);
						}
						this.aClass35_19.method519(super.aGraphics2, 128, 0);
						this.aClass35_20.method519(super.aGraphics2, 202, 371);
						this.aClass35_24.method519(super.aGraphics2, 0, 265);
						this.aClass35_25.method519(super.aGraphics2, 562, 265);
						this.aClass35_26.method519(super.aGraphics2, 128, 171);
						this.aClass35_27.method519(super.aGraphics2, 562, 171);
					}
				}
			}
		} catch (@Pc(215) RuntimeException local215) {
			signlink.reporterror("68884, " + 9 + ", " + arg0 + ", " + arg1 + ", " + local215.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "t", descriptor = "(I)V")
	private void method149() {
		try {
			this.aClass1_Sub1_Sub3_2.method463(51);
			if (this.anInt390 != -1) {
				this.anInt390 = -1;
				this.aBoolean88 = true;
				this.aBoolean84 = false;
				this.aBoolean68 = true;
			}
			if (this.anInt392 != -1) {
				this.anInt392 = -1;
				this.aBoolean75 = true;
				this.aBoolean84 = false;
			}
			this.anInt396 = -1;
		} catch (@Pc(43) RuntimeException local43) {
			signlink.reporterror("88554, " + -364 + ", " + local43.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!lb;II)V")
	private void method150(@OriginalArg(0) Class1_Sub1_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		try {
			arg0.method484();
			if (arg2 != 0) {
				aBoolean62 = !aBoolean62;
			}
			@Pc(17) int local17 = arg0.method485(8);
			@Pc(23) int local23;
			if (local17 < this.anInt393) {
				for (local23 = local17; local23 < this.anInt393; local23++) {
					this.anIntArray77[this.anInt387++] = this.anIntArray78[local23];
				}
			}
			if (local17 > this.anInt393) {
				signlink.reporterror(this.aString15 + " Too many npcs");
				throw new RuntimeException("eek");
			}
			this.anInt393 = 0;
			for (local23 = 0; local23 < local17; local23++) {
				@Pc(75) int local75 = this.anIntArray78[local23];
				@Pc(80) Class1_Sub1_Sub1_Sub1_Sub2 local80 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local75];
				@Pc(85) int local85 = arg0.method485(1);
				if (local85 == 0) {
					this.anIntArray78[this.anInt393++] = local75;
					local80.anInt1026 = anInt265;
				} else {
					@Pc(108) int local108 = arg0.method485(2);
					if (local108 == 0) {
						this.anIntArray78[this.anInt393++] = local75;
						local80.anInt1026 = anInt265;
						this.anIntArray50[this.anInt274++] = local75;
					} else {
						@Pc(159) int local159;
						@Pc(169) int local169;
						if (local108 == 1) {
							this.anIntArray78[this.anInt393++] = local75;
							local80.anInt1026 = anInt265;
							local159 = arg0.method485(3);
							local80.method673((byte) 5, local159, false);
							local169 = arg0.method485(1);
							if (local169 == 1) {
								this.anIntArray50[this.anInt274++] = local75;
							}
						} else if (local108 == 2) {
							this.anIntArray78[this.anInt393++] = local75;
							local80.anInt1026 = anInt265;
							local159 = arg0.method485(3);
							local80.method673((byte) 5, local159, true);
							local169 = arg0.method485(3);
							local80.method673((byte) 5, local169, true);
							@Pc(227) int local227 = arg0.method485(1);
							if (local227 == 1) {
								this.anIntArray50[this.anInt274++] = local75;
							}
						} else if (local108 == 3) {
							this.anIntArray77[this.anInt387++] = local75;
						}
					}
				}
			}
		} catch (@Pc(264) RuntimeException local264) {
			signlink.reporterror("67934, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local264.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(B)V")
	private void method151(@OriginalArg(0) byte arg0) {
		try {
			if (this.aClass35_18 == null) {
				this.method132();
				super.aClass35_2 = null;
				this.aClass35_19 = null;
				this.aClass35_20 = null;
				this.aClass35_21 = null;
				this.aClass35_22 = null;
				this.aClass35_23 = null;
				this.aClass35_24 = null;
				@Pc(32) boolean local32 = false;
				this.aClass35_25 = null;
				this.aClass35_26 = null;
				this.aClass35_27 = null;
				this.aClass35_18 = new Class35(96, 479, this.method93(), false);
				this.aClass35_16 = new Class35(156, 172, this.method93(), false);
				Class1_Sub1_Sub2.method434();
				this.aClass1_Sub1_Sub2_Sub3_9.method415(0, (byte) 1, 0);
				this.aClass35_15 = new Class35(261, 190, this.method93(), false);
				this.aClass35_17 = new Class35(334, 512, this.method93(), false);
				Class1_Sub1_Sub2.method434();
				this.aClass35_12 = new Class35(50, 496, this.method93(), false);
				this.aClass35_13 = new Class35(37, 269, this.method93(), false);
				this.aClass35_14 = new Class35(45, 249, this.method93(), false);
				this.aBoolean86 = true;
			}
		} catch (@Pc(136) RuntimeException local136) {
			signlink.reporterror("16306, " + arg0 + ", " + local136.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "u", descriptor = "(I)V")
	private void method152(@OriginalArg(0) int arg0) {
		try {
			try {
				if (this.aClass8_1 != null) {
					this.aClass8_1.method246();
				}
			} catch (@Pc(7) Exception local7) {
			}
			this.aClass8_1 = null;
			this.aBoolean90 = false;
			this.anInt268 = 0;
			this.aString15 = "";
			this.aString16 = "";
			this.method176();
			this.aClass37_1.method524();
			@Pc(33) boolean local33 = false;
			for (@Pc(35) int local35 = 0; local35 < 4; local35++) {
				this.aClass19Array1[local35].method417();
			}
			System.gc();
			this.method133();
			this.anInt235 = -1;
			this.anInt401 = -1;
			this.anInt205 = 0;
		} catch (@Pc(62) RuntimeException local62) {
			signlink.reporterror("13464, " + arg0 + ", " + local62.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Lclient!lb;II)V")
	private void method153(@OriginalArg(0) Class1_Sub1_Sub3 arg0, @OriginalArg(2) int arg1) {
		try {
			for (@Pc(12) int local12 = 0; local12 < this.anInt274; local12++) {
				@Pc(19) int local19 = this.anIntArray50[local12];
				@Pc(24) Class1_Sub1_Sub1_Sub1_Sub2 local24 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local19];
				@Pc(27) int local27 = arg0.method474();
				@Pc(35) int local35;
				@Pc(38) int local38;
				if ((local27 & 0x1) == 1) {
					local35 = arg0.method474();
					local38 = arg0.method474();
					local24.method676(local35, local38, anInt265);
					local24.anInt1000 = anInt265 + 300;
					local24.anInt1001 = arg0.method474();
					local24.anInt1002 = arg0.method474();
				}
				if ((local27 & 0x2) == 2) {
					local35 = arg0.method476();
					if (local35 == 65535) {
						local35 = -1;
					}
					if (local35 == local24.anInt1009) {
						local24.anInt1013 = 0;
					}
					local38 = arg0.method474();
					if (local35 == local24.anInt1009 && local35 != -1) {
						@Pc(92) int local92 = Class27.aClass27Array1[local35].anInt801;
						if (local92 == 1) {
							local24.anInt1010 = 0;
							local24.anInt1011 = 0;
							local24.anInt1012 = local38;
							local24.anInt1013 = 0;
						}
						if (local92 == 2) {
							local24.anInt1013 = 0;
						}
					} else if (local35 == -1 || local24.anInt1009 == -1 || Class27.aClass27Array1[local35].anInt795 >= Class27.aClass27Array1[local24.anInt1009].anInt795) {
						local24.anInt1009 = local35;
						local24.anInt1010 = 0;
						local24.anInt1011 = 0;
						local24.anInt1012 = local38;
						local24.anInt1013 = 0;
						local24.anInt1032 = local24.anInt1030;
					}
				}
				if ((local27 & 0x4) == 4) {
					local24.anInt1003 = arg0.method476();
					if (local24.anInt1003 == 65535) {
						local24.anInt1003 = -1;
					}
				}
				if ((local27 & 0x8) == 8) {
					local24.aString31 = arg0.method481();
					local24.anInt997 = 100;
				}
				if ((local27 & 0x10) == 16) {
					local35 = arg0.method474();
					local38 = arg0.method474();
					local24.method676(local35, local38, anInt265);
					local24.anInt1000 = anInt265 + 300;
					local24.anInt1001 = arg0.method474();
					local24.anInt1002 = arg0.method474();
				}
				if ((local27 & 0x20) == 32) {
					local24.aClass13_2 = Class13.method321(arg0.method476());
					local24.anInt989 = local24.aClass13_2.aByte14;
					local24.anInt1029 = local24.aClass13_2.anInt569;
					local24.anInt992 = local24.aClass13_2.anInt556;
					local24.anInt993 = local24.aClass13_2.anInt557;
					local24.anInt994 = local24.aClass13_2.anInt558;
					local24.anInt995 = local24.aClass13_2.anInt559;
					local24.anInt990 = local24.aClass13_2.anInt555;
				}
				if ((local27 & 0x40) == 64) {
					local24.anInt1014 = arg0.method476();
					local35 = arg0.method479();
					local24.anInt1018 = local35 >> 16;
					local24.anInt1017 = anInt265 + (local35 & 0xFFFF);
					local24.anInt1015 = 0;
					local24.anInt1016 = 0;
					if (local24.anInt1017 > anInt265) {
						local24.anInt1015 = -1;
					}
					if (local24.anInt1014 == 65535) {
						local24.anInt1014 = -1;
					}
				}
				if ((local27 & 0x80) == 128) {
					local24.anInt1004 = arg0.method476();
					local24.anInt1005 = arg0.method476();
				}
			}
		} catch (@Pc(318) RuntimeException local318) {
			signlink.reporterror("23671, " + arg0 + ", " + 1 + ", " + arg1 + ", " + local318.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "i", descriptor = "(Z)I")
	private int method154() {
		try {
			@Pc(10) int local10 = 3;
			if (this.anInt365 < 310) {
				@Pc(19) int local19 = this.anInt362 >> 7;
				@Pc(24) int local24 = this.anInt364 >> 7;
				@Pc(29) int local29 = aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt986 >> 7;
				@Pc(34) int local34 = aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt987 >> 7;
				if ((this.aByteArrayArrayArray7[this.anInt245][local19][local24] & 0x4) != 0) {
					local10 = this.anInt245;
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
						if ((this.aByteArrayArrayArray7[this.anInt245][local19][local24] & 0x4) != 0) {
							local10 = this.anInt245;
						}
						local86 += local84;
						if (local86 >= 65536) {
							local86 -= 65536;
							if (local24 < local34) {
								local24++;
							} else if (local24 > local34) {
								local24--;
							}
							if ((this.aByteArrayArrayArray7[this.anInt245][local19][local24] & 0x4) != 0) {
								local10 = this.anInt245;
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
						if ((this.aByteArrayArrayArray7[this.anInt245][local19][local24] & 0x4) != 0) {
							local10 = this.anInt245;
						}
						local86 += local84;
						if (local86 >= 65536) {
							local86 -= 65536;
							if (local19 < local29) {
								local19++;
							} else if (local19 > local29) {
								local19--;
							}
							if ((this.aByteArrayArrayArray7[this.anInt245][local19][local24] & 0x4) != 0) {
								local10 = this.anInt245;
							}
						}
					}
				}
			}
			if ((this.aByteArrayArrayArray7[this.anInt245][aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt986 >> 7][aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt987 >> 7] & 0x4) != 0) {
				local10 = this.anInt245;
			}
			return local10;
		} catch (@Pc(252) RuntimeException local252) {
			signlink.reporterror("94118, " + false + ", " + local252.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "j", descriptor = "(Z)I")
	private int method155() {
		try {
			@Pc(17) int local17 = this.method147(this.anInt364, this.anInt362, this.anInt245);
			return local17 - this.anInt363 >= 800 || (this.aByteArrayArrayArray7[this.anInt245][this.anInt362 >> 7][this.anInt364 >> 7] & 0x4) == 0 ? 3 : this.anInt245;
		} catch (@Pc(47) RuntimeException local47) {
			signlink.reporterror("72793, " + false + ", " + local47.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(B)V")
	private void method156() {
		try {
			for (@Pc(10) Class1_Sub1_Sub1_Sub6 local10 = (Class1_Sub1_Sub1_Sub6) this.aClass29_1.method505(); local10 != null; local10 = (Class1_Sub1_Sub1_Sub6) this.aClass29_1.method507()) {
				if (local10.anInt530 != this.anInt245 || local10.aBoolean143) {
					local10.method668();
				} else if (anInt265 >= local10.anInt529) {
					local10.method299(this.anInt251);
					if (local10.aBoolean143) {
						local10.method668();
					} else {
						this.aClass37_1.method535(local10.anInt533, local10.anInt531, 0, local10.anInt530, local10, -1, false, 60, local10.anInt532);
					}
				}
			}
		} catch (@Pc(68) RuntimeException local68) {
			signlink.reporterror("20594, " + 38 + ", " + local68.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IBLclient!y;)V")
	private void method158(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub1_Sub1_Sub1 arg1) {
		try {
			this.method159(arg1.anInt987, arg0, arg1.anInt986);
		} catch (@Pc(17) RuntimeException local17) {
			signlink.reporterror("6138, " + arg0 + ", " + 67 + ", " + arg1 + ", " + local17.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(IIII)V")
	private void method159(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		try {
			if (arg2 >= 128 && arg0 >= 128 && arg2 <= 13056 && arg0 <= 13056) {
				@Pc(28) int local28 = this.method147(arg0, arg2, this.anInt245) - arg1;
				@Pc(37) int local37 = arg2 - this.anInt362;
				@Pc(42) int local42 = local28 - this.anInt363;
				@Pc(47) int local47 = arg0 - this.anInt364;
				@Pc(52) int local52 = Class1_Sub1_Sub1_Sub5.anIntArray150[this.anInt365];
				@Pc(57) int local57 = Class1_Sub1_Sub1_Sub5.anIntArray151[this.anInt365];
				@Pc(62) int local62 = Class1_Sub1_Sub1_Sub5.anIntArray150[this.anInt366];
				@Pc(67) int local67 = Class1_Sub1_Sub1_Sub5.anIntArray151[this.anInt366];
				@Pc(77) int local77 = local47 * local62 + local37 * local67 >> 16;
				@Pc(87) int local87 = local47 * local67 - local37 * local62 >> 16;
				@Pc(89) int local89 = local77;
				@Pc(99) int local99 = local42 * local57 - local87 * local52 >> 16;
				@Pc(109) int local109 = local42 * local52 + local87 * local57 >> 16;
				if (local109 >= 50) {
					this.anInt408 = Class1_Sub1_Sub2_Sub1.anInt591 + (local89 << 9) / local109;
					this.anInt409 = Class1_Sub1_Sub2_Sub1.anInt592 + (local99 << 9) / local109;
				} else {
					this.anInt408 = -1;
					this.anInt409 = -1;
				}
			} else {
				this.anInt408 = -1;
				this.anInt409 = -1;
			}
		} catch (@Pc(141) RuntimeException local141) {
			signlink.reporterror("15246, " + arg0 + ", " + 25656 + ", " + arg1 + ", " + arg2 + ", " + local141.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "f", descriptor = "(B)V")
	private void method160() {
		try {
			if (super.anInt199 == 1) {
				if (super.anInt200 >= 6 && super.anInt200 <= 106 && super.anInt201 >= 467 && super.anInt201 <= 499) {
					this.anInt415 = (this.anInt415 + 1) % 4;
					this.aBoolean67 = true;
					this.aBoolean75 = true;
					this.aClass1_Sub1_Sub3_2.method463(154);
					this.aClass1_Sub1_Sub3_2.method464(this.anInt415);
					this.aClass1_Sub1_Sub3_2.method464(this.anInt355);
					this.aClass1_Sub1_Sub3_2.method464(this.anInt225);
				}
				if (super.anInt200 >= 135 && super.anInt200 <= 235 && super.anInt201 >= 467 && super.anInt201 <= 499) {
					this.anInt355 = (this.anInt355 + 1) % 3;
					this.aBoolean67 = true;
					this.aBoolean75 = true;
					this.aClass1_Sub1_Sub3_2.method463(154);
					this.aClass1_Sub1_Sub3_2.method464(this.anInt415);
					this.aClass1_Sub1_Sub3_2.method464(this.anInt355);
					this.aClass1_Sub1_Sub3_2.method464(this.anInt225);
				}
				if (super.anInt200 >= 273 && super.anInt200 <= 373 && super.anInt201 >= 467 && super.anInt201 <= 499) {
					this.anInt225 = (this.anInt225 + 1) % 3;
					this.aBoolean67 = true;
					this.aBoolean75 = true;
					this.aClass1_Sub1_Sub3_2.method463(154);
					this.aClass1_Sub1_Sub3_2.method464(this.anInt415);
					this.aClass1_Sub1_Sub3_2.method464(this.anInt355);
					this.aClass1_Sub1_Sub3_2.method464(this.anInt225);
				}
				if (super.anInt200 >= 412 && super.anInt200 <= 512 && super.anInt201 >= 467 && super.anInt201 <= 499) {
					if (this.anInt396 == -1) {
						this.method149();
						this.aString8 = "";
						this.aBoolean95 = false;
						for (@Pc(192) int local192 = 0; local192 < Class6.aClass6Array1.length; local192++) {
							if (Class6.aClass6Array1[local192] != null && Class6.aClass6Array1[local192].anInt424 == 600) {
								this.anInt404 = this.anInt396 = Class6.aClass6Array1[local192].anInt421;
								return;
							}
						}
						return;
					}
					this.method217(this.aByte2, "", "Please close the interface you have open before using 'report abuse'", 0);
					return;
				}
			}
		} catch (@Pc(229) RuntimeException local229) {
			signlink.reporterror("71102, " + -116 + ", " + local229.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "g", descriptor = "(B)V")
	private void method161() {
		try {
			if (this.anInt358 == 0) {
				@Pc(6) int local6 = super.anInt199;
				if (this.anInt282 == 1 && super.anInt200 >= 516 && super.anInt201 >= 160 && super.anInt200 <= 765 && super.anInt201 <= 205) {
					local6 = 0;
				}
				@Pc(42) int local42;
				@Pc(45) int local45;
				@Pc(121) int local121;
				if (this.aBoolean85) {
					if (local6 != 1) {
						local42 = super.anInt194;
						local45 = super.anInt195;
						if (this.anInt323 == 0) {
							local42 -= 4;
							local45 -= 4;
						}
						if (this.anInt323 == 1) {
							local42 -= 553;
							local45 -= 205;
						}
						if (this.anInt323 == 2) {
							local42 -= 17;
							local45 -= 357;
						}
						if (local42 < this.anInt324 - 10 || local42 > this.anInt324 + this.anInt326 + 10 || local45 < this.anInt325 - 10 || local45 > this.anInt325 + this.anInt327 + 10) {
							this.aBoolean85 = false;
							if (this.anInt323 == 1) {
								this.aBoolean88 = true;
							}
							if (this.anInt323 == 2) {
								this.aBoolean75 = true;
							}
						}
					}
					if (local6 == 1) {
						local42 = this.anInt324;
						local45 = this.anInt325;
						local121 = this.anInt326;
						@Pc(124) int local124 = super.anInt200;
						@Pc(127) int local127 = super.anInt201;
						if (this.anInt323 == 0) {
							local124 -= 4;
							local127 -= 4;
						}
						if (this.anInt323 == 1) {
							local124 -= 553;
							local127 -= 205;
						}
						if (this.anInt323 == 2) {
							local124 -= 17;
							local127 -= 357;
						}
						@Pc(146) int local146 = -1;
						for (@Pc(148) int local148 = 0; local148 < this.anInt219; local148++) {
							@Pc(163) int local163 = local45 + (this.anInt219 - 1 - local148) * 15 + 31;
							if (local124 > local42 && local124 < local42 + local121 && local127 > local163 - 13 && local127 < local163 + 3) {
								local146 = local148;
							}
						}
						if (local146 != -1) {
							this.method219(local146);
						}
						this.aBoolean85 = false;
						if (this.anInt323 == 1) {
							this.aBoolean88 = true;
						}
						if (this.anInt323 == 2) {
							this.aBoolean75 = true;
							return;
						}
					}
				} else {
					if (local6 == 1 && this.anInt219 > 0) {
						local42 = this.anIntArray81[this.anInt219 - 1];
						if (local42 == 582 || local42 == 113 || local42 == 555 || local42 == 331 || local42 == 354 || local42 == 694 || local42 == 962 || local42 == 795 || local42 == 681 || local42 == 100 || local42 == 102 || local42 == 1328) {
							local45 = this.anIntArray79[this.anInt219 - 1];
							local121 = this.anIntArray80[this.anInt219 - 1];
							@Pc(283) Class6 local283 = Class6.aClass6Array1[local121];
							if (local283.aBoolean101 || local283.aBoolean104) {
								this.aBoolean82 = false;
								this.anInt371 = 0;
								this.anInt356 = local121;
								this.anInt357 = local45;
								this.anInt358 = 2;
								this.anInt359 = super.anInt200;
								this.anInt360 = super.anInt201;
								if (Class6.aClass6Array1[local121].anInt421 == this.anInt396) {
									this.anInt358 = 1;
								}
								if (Class6.aClass6Array1[local121].anInt421 == this.anInt392) {
									this.anInt358 = 3;
								}
								return;
							}
						}
					}
					if (local6 == 1 && (this.anInt381 == 1 || this.method169(this.anInt219 - 1)) && this.anInt219 > 2) {
						local6 = 2;
					}
					if (local6 == 1 && this.anInt219 > 0) {
						this.method219(this.anInt219 - 1);
					}
					if (local6 != 2 || this.anInt219 <= 0) {
						return;
					}
					this.method227();
				}
			}
		} catch (@Pc(378) RuntimeException local378) {
			signlink.reporterror("60106, " + 51 + ", " + local378.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIIIIII)V")
	private void method162(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		try {
			if (arg0 >= 1 && arg1 >= 1 && arg0 <= 102 && arg1 <= 102) {
				if (aBoolean71 && arg2 != this.anInt245) {
					return;
				}
				@Pc(24) int local24 = 0;
				if (arg4 == 0) {
					local24 = this.aClass37_1.method550(arg2, arg0, arg1);
				}
				if (arg4 == 1) {
					local24 = this.aClass37_1.method551(arg2, arg0, arg1);
				}
				if (arg4 == 2) {
					local24 = this.aClass37_1.method552(arg2, arg0, arg1);
				}
				if (arg4 == 3) {
					local24 = this.aClass37_1.method553(arg2, arg0, arg1);
				}
				@Pc(80) int local80;
				if (local24 != 0) {
					local80 = this.aClass37_1.method554(arg2, arg0, arg1, local24);
					@Pc(86) int local86 = local24 >> 14 & 0x7FFF;
					@Pc(90) int local90 = local80 & 0x1F;
					@Pc(94) int local94 = local80 >> 6;
					@Pc(106) Class9 local106;
					if (arg4 == 0) {
						this.aClass37_1.method541(arg1, arg0, arg2);
						local106 = Class9.method287(local86);
						if (local106.aBoolean126) {
							this.aClass19Array1[arg2].method422(this.anInt285, arg1, arg0, local94, local90, local106.aBoolean127);
						}
					}
					if (arg4 == 1) {
						this.aClass37_1.method542(arg0, arg2, arg1);
					}
					if (arg4 == 2) {
						this.aClass37_1.method543(arg1, arg2, arg0);
						local106 = Class9.method287(local86);
						if (arg0 + local106.anInt508 > 103 || arg1 + local106.anInt508 > 103 || arg0 + local106.anInt509 > 103 || arg1 + local106.anInt509 > 103) {
							return;
						}
						if (local106.aBoolean126) {
							this.aClass19Array1[arg2].method423(local106.anInt509, arg1, local106.anInt508, arg0, local94, local106.aBoolean127);
						}
					}
					if (arg4 == 3) {
						this.aClass37_1.method544(arg1, arg2, arg0);
						local106 = Class9.method287(local86);
						if (local106.aBoolean126 && local106.aBoolean128) {
							this.aClass19Array1[arg2].method425(arg0, arg1);
						}
					}
				}
				if (arg3 >= 0) {
					local80 = arg2;
					if (arg2 < 3 && (this.aByteArrayArrayArray7[1][arg0][arg1] & 0x2) == 2) {
						local80 = arg2 + 1;
					}
					Class4.method72(arg0, local80, this.anIntArrayArrayArray5, arg1, arg3, this.aClass37_1, arg5, this.aClass19Array1[arg2], arg2, arg6);
					return;
				}
			}
		} catch (@Pc(254) RuntimeException local254) {
			signlink.reporterror("14570, " + arg0 + ", " + arg1 + ", " + 0 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + local254.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(Lclient!lb;II)V")
	private void method163(@OriginalArg(0) Class1_Sub1_Sub3 arg0, @OriginalArg(2) int arg1) {
		try {
			this.anInt387 = 0;
			this.anInt274 = 0;
			this.method150(arg0, arg1, this.anInt216);
			this.method112(arg1, arg0);
			this.method153(arg0, arg1);
			@Pc(42) int local42;
			for (@Pc(35) int local35 = 0; local35 < this.anInt387; local35++) {
				local42 = this.anIntArray77[local35];
				if (this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local42].anInt1026 != anInt265) {
					this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local42].aClass13_2 = null;
					this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local42] = null;
				}
			}
			if (arg0.anInt738 != arg1) {
				signlink.reporterror(this.aString15 + " size mismatch in getnpcpos - pos:" + arg0.anInt738 + " psize:" + arg1);
				throw new RuntimeException("eek");
			}
			for (local42 = 0; local42 < this.anInt393; local42++) {
				if (this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[this.anIntArray78[local42]] == null) {
					signlink.reporterror(this.aString15 + " null entry in npc list - pos:" + local42 + " size:" + this.anInt393);
					throw new RuntimeException("eek");
				}
			}
		} catch (@Pc(132) RuntimeException local132) {
			signlink.reporterror("71239, " + arg0 + ", " + 3 + ", " + arg1 + ", " + local132.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Ljava/lang/String;)V")
	private void method164(@OriginalArg(0) String arg0) {
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

	@OriginalMember(owner = "client!client", name = "v", descriptor = "(I)V")
	private void method165() {
		try {
			if (this.anInt318 == 0 && this.anInt282 == 0) {
				this.aStringArray2[this.anInt219] = "Walk here";
				this.anIntArray81[this.anInt219] = 718;
				this.anIntArray79[this.anInt219] = super.anInt194;
				this.anIntArray80[this.anInt219] = super.anInt195;
				this.anInt219++;
			}
			@Pc(41) int local41 = -1;
			for (@Pc(43) int local43 = 0; local43 < Class1_Sub1_Sub1_Sub5.anInt501; local43++) {
				@Pc(49) int local49 = Class1_Sub1_Sub1_Sub5.anIntArray149[local43];
				@Pc(53) int local53 = local49 & 0x7F;
				@Pc(59) int local59 = local49 >> 7 & 0x7F;
				@Pc(65) int local65 = local49 >> 29 & 0x3;
				@Pc(71) int local71 = local49 >> 14 & 0x7FFF;
				if (local49 != local41) {
					local41 = local49;
					@Pc(209) int local209;
					if (local65 == 2 && this.aClass37_1.method554(this.anInt245, local53, local59, local49) >= 0) {
						@Pc(91) Class9 local91 = Class9.method287(local71);
						if (this.anInt318 == 1) {
							this.aStringArray2[this.anInt219] = "Use " + this.aString11 + " with @cya@" + local91.aString23;
							this.anIntArray81[this.anInt219] = 810;
							this.anIntArray82[this.anInt219] = local49;
							this.anIntArray79[this.anInt219] = local53;
							this.anIntArray80[this.anInt219] = local59;
							this.anInt219++;
						} else if (this.anInt282 != 1) {
							if (local91.aStringArray8 != null) {
								for (local209 = 4; local209 >= 0; local209--) {
									if (local91.aStringArray8[local209] != null) {
										this.aStringArray2[this.anInt219] = local91.aStringArray8[local209] + " @cya@" + local91.aString23;
										if (local209 == 0) {
											this.anIntArray81[this.anInt219] = 625;
										}
										if (local209 == 1) {
											this.anIntArray81[this.anInt219] = 721;
										}
										if (local209 == 2) {
											this.anIntArray81[this.anInt219] = 743;
										}
										if (local209 == 3) {
											this.anIntArray81[this.anInt219] = 357;
										}
										if (local209 == 4) {
											this.anIntArray81[this.anInt219] = 1071;
										}
										this.anIntArray82[this.anInt219] = local49;
										this.anIntArray79[this.anInt219] = local53;
										this.anIntArray80[this.anInt219] = local59;
										this.anInt219++;
									}
								}
							}
							this.aStringArray2[this.anInt219] = "Examine @cya@" + local91.aString23;
							this.anIntArray81[this.anInt219] = 1381;
							this.anIntArray82[this.anInt219] = local49;
							this.anIntArray79[this.anInt219] = local53;
							this.anIntArray80[this.anInt219] = local59;
							this.anInt219++;
						} else if ((this.anInt284 & 0x4) == 4) {
							this.aStringArray2[this.anInt219] = this.aString9 + " @cya@" + local91.aString23;
							this.anIntArray81[this.anInt219] = 899;
							this.anIntArray82[this.anInt219] = local49;
							this.anIntArray79[this.anInt219] = local53;
							this.anIntArray80[this.anInt219] = local59;
							this.anInt219++;
						}
					}
					@Pc(386) Class1_Sub1_Sub1_Sub1_Sub2 local386;
					@Pc(434) Class1_Sub1_Sub1_Sub1_Sub1 local434;
					@Pc(424) int local424;
					if (local65 == 1) {
						@Pc(357) Class1_Sub1_Sub1_Sub1_Sub2 local357 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local71];
						if (local357.aClass13_2.aByte14 == 1 && (local357.anInt986 & 0x7F) == 64 && (local357.anInt987 & 0x7F) == 64) {
							for (local209 = 0; local209 < this.anInt393; local209++) {
								local386 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[this.anIntArray78[local209]];
								if (local386 != null && local386 != local357 && local386.aClass13_2.aByte14 == 1 && local386.anInt986 == local357.anInt986 && local386.anInt987 == local357.anInt987) {
									this.method202(local59, this.anIntArray78[local209], 177, local386.aClass13_2, local53);
								}
							}
							for (local424 = 0; local424 < this.anInt273; local424++) {
								local434 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[this.anIntArray49[local424]];
								if (local434 != null && local434.anInt986 == local357.anInt986 && local434.anInt987 == local357.anInt987) {
									this.method168(local53, this.anIntArray49[local424], local59, local434);
								}
							}
						}
						this.method202(local59, local71, 177, local357.aClass13_2, local53);
					}
					if (local65 == 0) {
						@Pc(476) Class1_Sub1_Sub1_Sub1_Sub1 local476 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local71];
						if ((local476.anInt986 & 0x7F) == 64 && (local476.anInt987 & 0x7F) == 64) {
							for (local209 = 0; local209 < this.anInt393; local209++) {
								local386 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[this.anIntArray78[local209]];
								if (local386 != null && local386.aClass13_2.aByte14 == 1 && local386.anInt986 == local476.anInt986 && local386.anInt987 == local476.anInt987) {
									this.method202(local59, this.anIntArray78[local209], 177, local386.aClass13_2, local53);
								}
							}
							for (local424 = 0; local424 < this.anInt273; local424++) {
								local434 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[this.anIntArray49[local424]];
								if (local434 != null && local434 != local476 && local434.anInt986 == local476.anInt986 && local434.anInt987 == local476.anInt987) {
									this.method168(local53, this.anIntArray49[local424], local59, local434);
								}
							}
						}
						this.method168(local53, local71, local59, local476);
					}
					if (local65 == 3) {
						@Pc(595) Class29 local595 = this.aClass29ArrayArrayArray1[this.anInt245][local53][local59];
						if (local595 != null) {
							for (@Pc(602) Class1_Sub1_Sub1_Sub3 local602 = (Class1_Sub1_Sub1_Sub3) local595.method506((byte) 5); local602 != null; local602 = (Class1_Sub1_Sub1_Sub3) local595.method508(this.anInt259)) {
								@Pc(608) Class15 local608 = Class15.method358(local602.anInt178);
								if (this.anInt318 == 1) {
									this.aStringArray2[this.anInt219] = "Use " + this.aString11 + " with @lre@" + local608.aString25;
									this.anIntArray81[this.anInt219] = 111;
									this.anIntArray82[this.anInt219] = local602.anInt178;
									this.anIntArray79[this.anInt219] = local53;
									this.anIntArray80[this.anInt219] = local59;
									this.anInt219++;
								} else if (this.anInt282 != 1) {
									for (@Pc(725) int local725 = 4; local725 >= 0; local725--) {
										if (local608.aStringArray10 != null && local608.aStringArray10[local725] != null) {
											this.aStringArray2[this.anInt219] = local608.aStringArray10[local725] + " @lre@" + local608.aString25;
											if (local725 == 0) {
												this.anIntArray81[this.anInt219] = 139;
											}
											if (local725 == 1) {
												this.anIntArray81[this.anInt219] = 778;
											}
											if (local725 == 2) {
												this.anIntArray81[this.anInt219] = 617;
											}
											if (local725 == 3) {
												this.anIntArray81[this.anInt219] = 224;
											}
											if (local725 == 4) {
												this.anIntArray81[this.anInt219] = 662;
											}
											this.anIntArray82[this.anInt219] = local602.anInt178;
											this.anIntArray79[this.anInt219] = local53;
											this.anIntArray80[this.anInt219] = local59;
											this.anInt219++;
										} else if (local725 == 2) {
											this.aStringArray2[this.anInt219] = "Take @lre@" + local608.aString25;
											this.anIntArray81[this.anInt219] = 617;
											this.anIntArray82[this.anInt219] = local602.anInt178;
											this.anIntArray79[this.anInt219] = local53;
											this.anIntArray80[this.anInt219] = local59;
											this.anInt219++;
										}
									}
									this.aStringArray2[this.anInt219] = "Examine @lre@" + local608.aString25;
									this.anIntArray81[this.anInt219] = 1152;
									this.anIntArray82[this.anInt219] = local602.anInt178;
									this.anIntArray79[this.anInt219] = local53;
									this.anIntArray80[this.anInt219] = local59;
									this.anInt219++;
								} else if ((this.anInt284 & 0x1) == 1) {
									this.aStringArray2[this.anInt219] = this.aString9 + " @lre@" + local608.aString25;
									this.anIntArray81[this.anInt219] = 370;
									this.anIntArray82[this.anInt219] = local602.anInt178;
									this.anIntArray79[this.anInt219] = local53;
									this.anIntArray80[this.anInt219] = local59;
									this.anInt219++;
								}
							}
						}
					}
				}
			}
		} catch (@Pc(939) RuntimeException local939) {
			signlink.reporterror("20644, " + 0 + ", " + local939.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "h", descriptor = "(B)V")
	private void method166() {
		try {
			if (22 == this.aByte5 && this.anInt348 == 2) {
				for (@Pc(15) Class1_Sub2 local15 = (Class1_Sub2) this.aClass29_3.method505(); local15 != null; local15 = (Class1_Sub2) this.aClass29_3.method507()) {
					if (local15.anInt790 > 0) {
						local15.anInt790--;
					}
					if (local15.anInt790 != 0) {
						if (local15.anInt789 > 0) {
							local15.anInt789--;
						}
						if (local15.anInt789 == 0 && local15.anInt781 >= 1 && local15.anInt782 >= 1 && local15.anInt781 <= 102 && local15.anInt782 <= 102 && (local15.anInt786 < 0 || Class4.method71(local15.anInt786, local15.anInt788))) {
							this.method162(local15.anInt781, local15.anInt782, local15.anInt779, local15.anInt786, local15.anInt780, local15.anInt788, local15.anInt787);
							local15.anInt789 = -1;
							if (local15.anInt786 == local15.anInt783 && local15.anInt783 == -1) {
								local15.method668();
							} else if (local15.anInt786 == local15.anInt783 && local15.anInt787 == local15.anInt784 && local15.anInt788 == local15.anInt785) {
								local15.method668();
							}
						}
					} else if (local15.anInt783 < 0 || Class4.method71(local15.anInt783, local15.anInt785)) {
						this.method162(local15.anInt781, local15.anInt782, local15.anInt779, local15.anInt783, local15.anInt780, local15.anInt785, local15.anInt784);
						local15.method668();
					}
				}
			}
		} catch (@Pc(158) RuntimeException local158) {
			signlink.reporterror("85072, " + 22 + ", " + local158.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "i", descriptor = "(B)V")
	private void method167() {
		try {
			for (@Pc(6) Class1_Sub2 local6 = (Class1_Sub2) this.aClass29_3.method505(); local6 != null; local6 = (Class1_Sub2) this.aClass29_3.method507()) {
				if (local6.anInt790 == -1) {
					local6.anInt789 = 0;
					this.method189(local6);
				} else {
					local6.method668();
				}
			}
		} catch (@Pc(39) RuntimeException local39) {
			signlink.reporterror("73884, " + 5 + ", " + local39.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIBILclient!ab;)V")
	private void method168(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class1_Sub1_Sub1_Sub1_Sub1 arg3) {
		try {
			if (arg3 != aClass1_Sub1_Sub1_Sub1_Sub1_1 && this.anInt219 < 400) {
				@Pc(35) String local35;
				if (arg3.anInt131 == 0) {
					local35 = arg3.aString3 + method137(aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt130, arg3.anInt130) + " (level-" + arg3.anInt130 + ")";
				} else {
					local35 = arg3.aString3 + " (skill-" + arg3.anInt131 + ")";
				}
				@Pc(165) int local165;
				if (this.anInt318 == 1) {
					this.aStringArray2[this.anInt219] = "Use " + this.aString11 + " with @whi@" + local35;
					this.anIntArray81[this.anInt219] = 275;
					this.anIntArray82[this.anInt219] = arg1;
					this.anIntArray79[this.anInt219] = arg0;
					this.anIntArray80[this.anInt219] = arg2;
					this.anInt219++;
				} else if (this.anInt282 != 1) {
					for (local165 = 4; local165 >= 0; local165--) {
						if (this.aStringArray6[local165] != null) {
							this.aStringArray2[this.anInt219] = this.aStringArray6[local165] + " @whi@" + local35;
							@Pc(192) short local192 = 0;
							if (this.aStringArray6[local165].equalsIgnoreCase("attack")) {
								if (arg3.anInt130 > aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt130) {
									local192 = 2000;
								}
								if (aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt142 != 0 && arg3.anInt142 != 0) {
									if (aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt142 == arg3.anInt142) {
										local192 = 2000;
									} else {
										local192 = 0;
									}
								}
							} else if (this.aBooleanArray3[local165]) {
								local192 = 2000;
							}
							if (local165 == 0) {
								this.anIntArray81[this.anInt219] = local192 + 639;
							}
							if (local165 == 1) {
								this.anIntArray81[this.anInt219] = local192 + 499;
							}
							if (local165 == 2) {
								this.anIntArray81[this.anInt219] = local192 + 27;
							}
							if (local165 == 3) {
								this.anIntArray81[this.anInt219] = local192 + 387;
							}
							if (local165 == 4) {
								this.anIntArray81[this.anInt219] = local192 + 185;
							}
							this.anIntArray82[this.anInt219] = arg1;
							this.anIntArray79[this.anInt219] = arg0;
							this.anIntArray80[this.anInt219] = arg2;
							this.anInt219++;
						}
					}
				} else if ((this.anInt284 & 0x8) == 8) {
					this.aStringArray2[this.anInt219] = this.aString9 + " @whi@" + local35;
					this.anIntArray81[this.anInt219] = 131;
					this.anIntArray82[this.anInt219] = arg1;
					this.anIntArray79[this.anInt219] = arg0;
					this.anIntArray80[this.anInt219] = arg2;
					this.anInt219++;
				}
				for (local165 = 0; local165 < this.anInt219; local165++) {
					if (this.anIntArray81[local165] == 718) {
						this.aStringArray2[local165] = "Walk here @whi@" + local35;
						break;
					}
				}
			}
		} catch (@Pc(350) RuntimeException local350) {
			signlink.reporterror("58786, " + arg0 + ", " + arg1 + ", " + 23 + ", " + arg2 + ", " + arg3 + ", " + local350.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(II)Z")
	private boolean method169(@OriginalArg(1) int arg0) {
		try {
			if (arg0 < 0) {
				return false;
			}
			@Pc(8) int local8 = this.anIntArray81[arg0];
			if (local8 >= 2000) {
				local8 -= 2000;
			}
			return local8 == 605;
		} catch (@Pc(27) RuntimeException local27) {
			signlink.reporterror("20185, " + -29317 + ", " + arg0 + ", " + local27.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
	@Override
	public String getParameter(@OriginalArg(0) String arg0) {
		return signlink.mainapp == null ? super.getParameter(arg0) : signlink.mainapp.getParameter(arg0);
	}

	@OriginalMember(owner = "client!client", name = "j", descriptor = "(B)Z")
	private boolean method170() {
		try {
			if (this.aClass8_1 == null) {
				return false;
			}
			@Pc(691) String local691;
			@Pc(218) int local218;
			try {
				@Pc(17) int local17 = this.aClass8_1.method248();
				if (local17 == 0) {
					return false;
				}
				if (this.anInt302 == -1) {
					this.aClass8_1.method249(this.aClass1_Sub1_Sub3_3.aByteArray9, 0, 1);
					this.anInt302 = this.aClass1_Sub1_Sub3_3.aByteArray9[0] & 0xFF;
					if (this.aClass46_1 != null) {
						this.anInt302 = this.anInt302 - this.aClass46_1.method656() & 0xFF;
					}
					this.anInt301 = Class17.anIntArray207[this.anInt302];
					local17--;
				}
				if (this.anInt301 == -1) {
					if (local17 <= 0) {
						return false;
					}
					this.aClass8_1.method249(this.aClass1_Sub1_Sub3_3.aByteArray9, 0, 1);
					this.anInt301 = this.aClass1_Sub1_Sub3_3.aByteArray9[0] & 0xFF;
					local17--;
				}
				if (this.anInt301 == -2) {
					if (local17 <= 1) {
						return false;
					}
					this.aClass8_1.method249(this.aClass1_Sub1_Sub3_3.aByteArray9, 0, 2);
					this.aClass1_Sub1_Sub3_3.anInt738 = 0;
					this.anInt301 = this.aClass1_Sub1_Sub3_3.method476();
					local17 -= 2;
				}
				if (local17 < this.anInt301) {
					return false;
				}
				this.aClass1_Sub1_Sub3_3.anInt738 = 0;
				this.aClass8_1.method249(this.aClass1_Sub1_Sub3_3.aByteArray9, 0, this.anInt301);
				this.anInt303 = 0;
				this.anInt215 = this.anInt214;
				this.anInt214 = this.anInt213;
				this.anInt213 = this.anInt302;
				@Pc(161) int local161;
				if (this.anInt302 == 130) {
					local161 = this.aClass1_Sub1_Sub3_3.method477();
					this.anInt234 = local161;
					this.aBoolean75 = true;
					this.anInt302 = -1;
					return true;
				}
				if (this.anInt302 == 90) {
					this.anInt286 = this.aClass1_Sub1_Sub3_3.method474();
					if (this.anInt286 == this.anInt317) {
						if (this.anInt286 == 3) {
							this.anInt317 = 1;
						} else {
							this.anInt317 = 3;
						}
						this.aBoolean88 = true;
					}
					this.anInt302 = -1;
					return true;
				}
				@Pc(222) int local222;
				@Pc(226) int local226;
				if (this.anInt302 == 64) {
					local161 = this.aClass1_Sub1_Sub3_3.method474();
					local218 = this.aClass1_Sub1_Sub3_3.method474();
					local222 = this.aClass1_Sub1_Sub3_3.method474();
					local226 = this.aClass1_Sub1_Sub3_3.method474();
					this.aBooleanArray4[local161] = true;
					this.anIntArray71[local161] = local218;
					this.anIntArray41[local161] = local222;
					this.anIntArray84[local161] = local226;
					this.anIntArray66[local161] = 0;
					this.anInt302 = -1;
					return true;
				}
				if (this.anInt302 == 142) {
					local161 = this.aClass1_Sub1_Sub3_3.method476();
					local218 = this.aClass1_Sub1_Sub3_3.method476();
					Class6.aClass6Array1[local161].anInt439 = 2;
					Class6.aClass6Array1[local161].anInt440 = local218;
					this.anInt302 = -1;
					return true;
				}
				if (this.anInt302 == 158) {
					local161 = this.aClass1_Sub1_Sub3_3.method476();
					local218 = this.aClass1_Sub1_Sub3_3.method476();
					if (this.anInt392 != -1) {
						this.anInt392 = -1;
						this.aBoolean75 = true;
					}
					if (this.aBoolean94) {
						this.aBoolean94 = false;
						this.aBoolean75 = true;
					}
					this.anInt396 = local161;
					this.anInt390 = local218;
					this.aBoolean88 = true;
					this.aBoolean68 = true;
					this.aBoolean84 = false;
					this.anInt302 = -1;
					return true;
				}
				@Pc(368) int local368;
				@Pc(349) Class6 local349;
				if (this.anInt302 == 106) {
					this.aBoolean88 = true;
					local161 = this.aClass1_Sub1_Sub3_3.method476();
					local349 = Class6.aClass6Array1[local161];
					local222 = this.aClass1_Sub1_Sub3_3.method474();
					for (local226 = 0; local226 < local222; local226++) {
						local349.anIntArray93[local226] = this.aClass1_Sub1_Sub3_3.method476();
						local368 = this.aClass1_Sub1_Sub3_3.method474();
						if (local368 == 255) {
							local368 = this.aClass1_Sub1_Sub3_3.method479();
						}
						local349.anIntArray94[local226] = local368;
					}
					for (local368 = local222; local368 < local349.anIntArray93.length; local368++) {
						local349.anIntArray93[local368] = 0;
						local349.anIntArray94[local368] = 0;
					}
					this.anInt302 = -1;
					return true;
				}
				if (this.anInt302 == 23) {
					local161 = this.aClass1_Sub1_Sub3_3.method476();
					if (local161 == 65535) {
						local161 = -1;
					}
					if (local161 != this.anInt235 && this.aBoolean66 && !aBoolean71 && this.anInt205 == 0) {
						this.anInt401 = local161;
						this.aBoolean93 = true;
						this.aClass44_Sub1_1.method639(2, this.anInt401);
					}
					this.anInt235 = local161;
					this.anInt302 = -1;
					return true;
				}
				if (this.anInt302 == 15) {
					local161 = this.aClass1_Sub1_Sub3_3.method476();
					local218 = this.aClass1_Sub1_Sub3_3.method476();
					if (this.aBoolean66 && !aBoolean71) {
						this.anInt401 = local161;
						this.aBoolean93 = false;
						this.aClass44_Sub1_1.method639(2, this.anInt401);
						this.anInt205 = local218;
					}
					this.anInt302 = -1;
					return true;
				}
				if (this.anInt302 == 77) {
					local161 = this.aClass1_Sub1_Sub3_3.method476();
					local218 = this.aClass1_Sub1_Sub3_3.method477();
					local222 = this.aClass1_Sub1_Sub3_3.method477();
					@Pc(511) Class6 local511 = Class6.aClass6Array1[local161];
					local511.anInt427 = local218;
					local511.anInt428 = local222;
					this.anInt302 = -1;
					return true;
				}
				if (this.anInt302 == 153) {
					this.anInt226 = this.aClass1_Sub1_Sub3_3.method474();
					this.anInt227 = this.aClass1_Sub1_Sub3_3.method474();
					for (local161 = this.anInt226; local161 < this.anInt226 + 8; local161++) {
						for (local218 = this.anInt227; local218 < this.anInt227 + 8; local218++) {
							if (this.aClass29ArrayArrayArray1[this.anInt245][local161][local218] != null) {
								this.aClass29ArrayArrayArray1[this.anInt245][local161][local218] = null;
								this.method190(local161, local218);
							}
						}
					}
					for (@Pc(589) Class1_Sub2 local589 = (Class1_Sub2) this.aClass29_3.method505(); local589 != null; local589 = (Class1_Sub2) this.aClass29_3.method507()) {
						if (local589.anInt781 >= this.anInt226 && local589.anInt781 < this.anInt226 + 8 && local589.anInt782 >= this.anInt227 && local589.anInt782 < this.anInt227 + 8 && local589.anInt779 == this.anInt245) {
							local589.anInt790 = 0;
						}
					}
					this.anInt302 = -1;
					return true;
				}
				if (this.anInt302 == 171) {
					if (this.anInt390 != -1) {
						this.anInt390 = -1;
						this.aBoolean88 = true;
						this.aBoolean68 = true;
					}
					if (this.anInt392 != -1) {
						this.anInt392 = -1;
						this.aBoolean75 = true;
					}
					if (this.aBoolean94) {
						this.aBoolean94 = false;
						this.aBoolean75 = true;
					}
					this.anInt396 = -1;
					this.aBoolean84 = false;
					this.anInt302 = -1;
					return true;
				}
				@Pc(702) String local702;
				@Pc(707) boolean local707;
				@Pc(709) int local709;
				@Pc(844) String local844;
				if (this.anInt302 == 161) {
					local691 = this.aClass1_Sub1_Sub3_3.method481();
					@Pc(705) long local705;
					if (local691.endsWith(":tradereq:")) {
						local702 = local691.substring(0, local691.indexOf(":"));
						local705 = Class48.method661(local702);
						local707 = false;
						for (local709 = 0; local709 < this.anInt252; local709++) {
							if (this.aLongArray4[local709] == local705) {
								local707 = true;
								break;
							}
						}
						if (!local707 && this.anInt316 == 0) {
							this.method217(this.aByte2, local702, "wishes to trade with you.", 4);
						}
					} else if (local691.endsWith(":duelreq:")) {
						local702 = local691.substring(0, local691.indexOf(":"));
						local705 = Class48.method661(local702);
						local707 = false;
						for (local709 = 0; local709 < this.anInt252; local709++) {
							if (this.aLongArray4[local709] == local705) {
								local707 = true;
								break;
							}
						}
						if (!local707 && this.anInt316 == 0) {
							this.method217(this.aByte2, local702, "wishes to duel with you.", 8);
						}
					} else if (local691.endsWith(":chalreq:")) {
						local702 = local691.substring(0, local691.indexOf(":"));
						local705 = Class48.method661(local702);
						local707 = false;
						for (local709 = 0; local709 < this.anInt252; local709++) {
							if (this.aLongArray4[local709] == local705) {
								local707 = true;
								break;
							}
						}
						if (!local707 && this.anInt316 == 0) {
							local844 = local691.substring(local691.indexOf(":") + 1, local691.length() - 9);
							this.method217(this.aByte2, local702, local844, 8);
						}
					} else {
						this.method217(this.aByte2, "", local691, 0);
					}
					this.anInt302 = -1;
					return true;
				}
				if (this.anInt302 == 129) {
					local161 = this.aClass1_Sub1_Sub3_3.method476();
					local218 = this.aClass1_Sub1_Sub3_3.method476();
					Class6.aClass6Array1[local161].anInt439 = 1;
					Class6.aClass6Array1[local161].anInt440 = local218;
					this.anInt302 = -1;
					return true;
				}
				@Pc(1151) int local1151;
				@Pc(1172) int local1172;
				if (this.anInt302 == 231) {
					local161 = this.aClass1_Sub1_Sub3_3.method476();
					local218 = this.aClass1_Sub1_Sub3_3.method476();
					if (this.anInt388 == local161 && this.anInt389 == local218 && this.anInt348 == 2) {
						this.anInt302 = -1;
						return true;
					}
					this.anInt388 = local161;
					this.anInt389 = local218;
					this.anInt278 = (this.anInt388 - 6) * 8;
					this.anInt279 = (this.anInt389 - 6) * 8;
					this.aBoolean92 = false;
					if ((this.anInt388 / 8 == 48 || this.anInt388 / 8 == 49) && this.anInt389 / 8 == 48) {
						this.aBoolean92 = true;
					}
					if (this.anInt388 / 8 == 48 && this.anInt389 / 8 == 148) {
						this.aBoolean92 = true;
					}
					this.anInt348 = 1;
					this.aLong17 = System.currentTimeMillis();
					this.aClass35_17.method518(979);
					this.aClass1_Sub1_Sub2_Sub4_2.method443(257, 0, "Loading - please wait.", 151);
					this.aClass1_Sub1_Sub2_Sub4_2.method443(256, 16777215, "Loading - please wait.", 150);
					this.aClass35_17.method519(super.aGraphics2, 4, 4);
					local222 = 0;
					for (local226 = (this.anInt388 - 6) / 8; local226 <= (this.anInt388 + 6) / 8; local226++) {
						for (local368 = (this.anInt389 - 6) / 8; local368 <= (this.anInt389 + 6) / 8; local368++) {
							local222++;
						}
					}
					this.aByteArrayArray2 = new byte[local222][];
					this.aByteArrayArray1 = new byte[local222][];
					this.anIntArray73 = new int[local222];
					this.anIntArray74 = new int[local222];
					this.anIntArray75 = new int[local222];
					local222 = 0;
					for (local368 = (this.anInt388 - 6) / 8; local368 <= (this.anInt388 + 6) / 8; local368++) {
						for (local709 = (this.anInt389 - 6) / 8; local709 <= (this.anInt389 + 6) / 8; local709++) {
							this.anIntArray73[local222] = (local368 << 8) + local709;
							if (this.aBoolean92 && (local709 == 49 || local709 == 149 || local709 == 147 || local368 == 50 || local368 == 49 && local709 == 47)) {
								this.anIntArray74[local222] = -1;
								this.anIntArray75[local222] = -1;
								local222++;
							} else {
								local1151 = this.anIntArray74[local222] = this.aClass44_Sub1_1.method634(0, local368, local709);
								if (local1151 != -1) {
									this.aClass44_Sub1_1.method639(3, local1151);
								}
								local1172 = this.anIntArray75[local222] = this.aClass44_Sub1_1.method634(1, local368, local709);
								if (local1172 != -1) {
									this.aClass44_Sub1_1.method639(3, local1172);
								}
								local222++;
							}
						}
					}
					local709 = this.anInt278 - this.anInt280;
					local1151 = this.anInt279 - this.anInt281;
					this.anInt280 = this.anInt278;
					this.anInt281 = this.anInt279;
					for (local1172 = 0; local1172 < 16384; local1172++) {
						@Pc(1228) Class1_Sub1_Sub1_Sub1_Sub2 local1228 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local1172];
						if (local1228 != null) {
							for (@Pc(1232) int local1232 = 0; local1232 < 10; local1232++) {
								local1228.anIntArray269[local1232] -= local709;
								local1228.anIntArray270[local1232] -= local1151;
							}
							local1228.anInt986 -= local709 * 128;
							local1228.anInt987 -= local1151 * 128;
						}
					}
					for (@Pc(1276) int local1276 = 0; local1276 < this.anInt271; local1276++) {
						@Pc(1283) Class1_Sub1_Sub1_Sub1_Sub1 local1283 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local1276];
						if (local1283 != null) {
							for (@Pc(1287) int local1287 = 0; local1287 < 10; local1287++) {
								local1283.anIntArray269[local1287] -= local709;
								local1283.anIntArray270[local1287] -= local1151;
							}
							local1283.anInt986 -= local709 * 128;
							local1283.anInt987 -= local1151 * 128;
						}
					}
					this.aBoolean77 = true;
					@Pc(1335) byte local1335 = 0;
					@Pc(1337) byte local1337 = 104;
					@Pc(1339) byte local1339 = 1;
					if (local709 < 0) {
						local1335 = 103;
						local1337 = -1;
						local1339 = -1;
					}
					@Pc(1349) byte local1349 = 0;
					@Pc(1351) byte local1351 = 104;
					@Pc(1353) byte local1353 = 1;
					if (local1151 < 0) {
						local1349 = 103;
						local1351 = -1;
						local1353 = -1;
					}
					for (@Pc(1363) int local1363 = local1335; local1363 != local1337; local1363 += local1339) {
						for (@Pc(1367) int local1367 = local1349; local1367 != local1351; local1367 += local1353) {
							@Pc(1373) int local1373 = local1363 + local709;
							@Pc(1377) int local1377 = local1367 + local1151;
							for (@Pc(1379) int local1379 = 0; local1379 < 4; local1379++) {
								if (local1373 >= 0 && local1377 >= 0 && local1373 < 104 && local1377 < 104) {
									this.aClass29ArrayArrayArray1[local1379][local1363][local1367] = this.aClass29ArrayArrayArray1[local1379][local1373][local1377];
								} else {
									this.aClass29ArrayArrayArray1[local1379][local1363][local1367] = null;
								}
							}
						}
					}
					for (@Pc(1441) Class1_Sub2 local1441 = (Class1_Sub2) this.aClass29_3.method505(); local1441 != null; local1441 = (Class1_Sub2) this.aClass29_3.method507()) {
						local1441.anInt781 -= local709;
						local1441.anInt782 -= local1151;
						if (local1441.anInt781 < 0 || local1441.anInt782 < 0 || local1441.anInt781 >= 104 || local1441.anInt782 >= 104) {
							local1441.method668();
						}
					}
					if (this.anInt229 != 0) {
						this.anInt229 -= local709;
						this.anInt230 -= local1151;
					}
					this.aBoolean74 = false;
					this.anInt302 = -1;
					return true;
				}
				if (this.anInt302 == 192) {
					local161 = this.aClass1_Sub1_Sub3_3.method476();
					Class6.aClass6Array1[local161].anInt439 = 3;
					if (aClass1_Sub1_Sub1_Sub1_Sub1_1.aClass13_1 == null) {
						Class6.aClass6Array1[local161].anInt440 = (aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray14[0] << 24) + (aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray14[4] << 18) + (aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray13[0] << 12) + (aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray13[8] << 6) + aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray13[11];
					} else {
						Class6.aClass6Array1[local161].anInt440 = (int) (aClass1_Sub1_Sub1_Sub1_Sub1_1.aClass13_1.aLong23 + 305419896L);
					}
					this.anInt302 = -1;
					return true;
				}
				if (this.anInt302 == 167) {
					this.method177(230, this.anInt301, this.aClass1_Sub1_Sub3_3);
					this.aBoolean77 = false;
					this.anInt302 = -1;
					return true;
				}
				if (this.anInt302 == 17) {
					local161 = this.aClass1_Sub1_Sub3_3.method474();
					local218 = this.aClass1_Sub1_Sub3_3.method474();
					@Pc(1606) String local1606 = this.aClass1_Sub1_Sub3_3.method481();
					if (local161 >= 1 && local161 <= 5) {
						if (local1606.equalsIgnoreCase("null")) {
							local1606 = null;
						}
						this.aStringArray6[local161 - 1] = local1606;
						this.aBooleanArray3[local161 - 1] = local218 == 0;
					}
					this.anInt302 = -1;
					return true;
				}
				if (this.anInt302 == 240) {
					local161 = this.aClass1_Sub1_Sub3_3.method477();
					if (local161 >= 0) {
						this.method229(local161);
					}
					this.anInt295 = local161;
					this.anInt302 = -1;
					return true;
				}
				if (this.anInt302 == 203) {
					local161 = this.aClass1_Sub1_Sub3_3.method476();
					@Pc(1675) byte local1675 = this.aClass1_Sub1_Sub3_3.method475();
					this.anIntArray76[local161] = local1675;
					if (this.anIntArray72[local161] != local1675) {
						this.anIntArray72[local161] = local1675;
						this.method110(local161);
						this.aBoolean88 = true;
						if (this.anInt234 != -1) {
							this.aBoolean75 = true;
						}
					}
					this.anInt302 = -1;
					return true;
				}
				if (this.anInt302 == 245) {
					local161 = this.aClass1_Sub1_Sub3_3.method476();
					local218 = this.aClass1_Sub1_Sub3_3.method479();
					this.anIntArray76[local161] = local218;
					if (this.anIntArray72[local161] != local218) {
						this.anIntArray72[local161] = local218;
						this.method110(local161);
						this.aBoolean88 = true;
						if (this.anInt234 != -1) {
							this.aBoolean75 = true;
						}
					}
					this.anInt302 = -1;
					return true;
				}
				if (this.anInt302 == 156) {
					this.anInt297 = this.aClass1_Sub1_Sub3_3.method474();
					if (this.anInt297 == 1) {
						this.anInt249 = this.aClass1_Sub1_Sub3_3.method476();
					}
					if (this.anInt297 >= 2 && this.anInt297 <= 6) {
						if (this.anInt297 == 2) {
							this.anInt243 = 64;
							this.anInt244 = 64;
						}
						if (this.anInt297 == 3) {
							this.anInt243 = 0;
							this.anInt244 = 64;
						}
						if (this.anInt297 == 4) {
							this.anInt243 = 128;
							this.anInt244 = 64;
						}
						if (this.anInt297 == 5) {
							this.anInt243 = 64;
							this.anInt244 = 0;
						}
						if (this.anInt297 == 6) {
							this.anInt243 = 64;
							this.anInt244 = 128;
						}
						this.anInt297 = 2;
						this.anInt240 = this.aClass1_Sub1_Sub3_3.method476();
						this.anInt241 = this.aClass1_Sub1_Sub3_3.method476();
						this.anInt242 = this.aClass1_Sub1_Sub3_3.method474();
					}
					if (this.anInt297 == 10) {
						this.anInt413 = this.aClass1_Sub1_Sub3_3.method476();
					}
					this.anInt302 = -1;
					return true;
				}
				if (this.anInt302 == 227) {
					local161 = this.aClass1_Sub1_Sub3_3.method476();
					local349 = Class6.aClass6Array1[local161];
					for (local222 = 0; local222 < local349.anIntArray93.length; local222++) {
						local349.anIntArray93[local222] = -1;
						local349.anIntArray93[local222] = 0;
					}
					this.anInt302 = -1;
					return true;
				}
				@Pc(1918) Class6 local1918;
				if (this.anInt302 == 134) {
					local161 = this.aClass1_Sub1_Sub3_3.method476();
					local218 = this.aClass1_Sub1_Sub3_3.method477();
					local1918 = Class6.aClass6Array1[local161];
					local1918.anInt443 = local218;
					if (local218 == -1) {
						local1918.anInt418 = 0;
						local1918.anInt419 = 0;
					}
					this.anInt302 = -1;
					return true;
				}
				if (this.anInt302 == 233) {
					this.aBoolean74 = true;
					this.anInt308 = this.aClass1_Sub1_Sub3_3.method474();
					this.anInt309 = this.aClass1_Sub1_Sub3_3.method474();
					this.anInt310 = this.aClass1_Sub1_Sub3_3.method476();
					this.anInt311 = this.aClass1_Sub1_Sub3_3.method474();
					this.anInt312 = this.aClass1_Sub1_Sub3_3.method474();
					if (this.anInt312 >= 100) {
						local161 = this.anInt308 * 128 + 64;
						local218 = this.anInt309 * 128 + 64;
						local222 = this.method147(local218, local161, this.anInt245) - this.anInt310;
						local226 = local161 - this.anInt362;
						local368 = local222 - this.anInt363;
						local709 = local218 - this.anInt364;
						local1151 = (int) Math.sqrt((double) (local226 * local226 + local709 * local709));
						this.anInt365 = (int) (Math.atan2((double) local368, (double) local1151) * 325.949D) & 0x7FF;
						this.anInt366 = (int) (Math.atan2((double) local226, (double) local709) * -325.949D) & 0x7FF;
						if (this.anInt365 < 128) {
							this.anInt365 = 128;
						}
						if (this.anInt365 > 383) {
							this.anInt365 = 383;
						}
					}
					this.anInt302 = -1;
					return true;
				}
				if (this.anInt302 == 210) {
					this.aBoolean60 = false;
					this.aBoolean94 = true;
					this.aString4 = "";
					this.aBoolean75 = true;
					this.anInt302 = -1;
					return true;
				}
				if (this.anInt302 == 195) {
					this.anInt226 = this.aClass1_Sub1_Sub3_3.method474();
					this.anInt227 = this.aClass1_Sub1_Sub3_3.method474();
					while (this.aClass1_Sub1_Sub3_3.anInt738 < this.anInt301) {
						local161 = this.aClass1_Sub1_Sub3_3.method474();
						this.method115(local161, this.aClass1_Sub1_Sub3_3);
					}
					this.anInt302 = -1;
					return true;
				}
				if (this.anInt302 == 105) {
					this.aBoolean88 = true;
					local161 = this.aClass1_Sub1_Sub3_3.method474();
					local218 = this.aClass1_Sub1_Sub3_3.method479();
					local222 = this.aClass1_Sub1_Sub3_3.method474();
					this.anIntArray52[local161] = local218;
					this.anIntArray61[local161] = local222;
					this.anIntArray59[local161] = 1;
					for (local226 = 0; local226 < 98; local226++) {
						if (local218 >= anIntArray51[local226]) {
							this.anIntArray59[local161] = local226 + 2;
						}
					}
					this.anInt302 = -1;
					return true;
				}
				if (this.anInt302 == 114) {
					this.anInt415 = this.aClass1_Sub1_Sub3_3.method474();
					this.anInt355 = this.aClass1_Sub1_Sub3_3.method474();
					this.anInt225 = this.aClass1_Sub1_Sub3_3.method474();
					this.aBoolean67 = true;
					this.aBoolean75 = true;
					this.anInt302 = -1;
					return true;
				}
				@Pc(2221) long local2221;
				if (this.anInt302 == 235) {
					local2221 = this.aClass1_Sub1_Sub3_3.method480();
					local222 = this.aClass1_Sub1_Sub3_3.method479();
					local226 = this.aClass1_Sub1_Sub3_3.method474();
					local707 = false;
					for (local709 = 0; local709 < 100; local709++) {
						if (this.anIntArray85[local709] == local222) {
							local707 = true;
							break;
						}
					}
					if (local226 <= 1) {
						for (local1151 = 0; local1151 < this.anInt252; local1151++) {
							if (this.aLongArray4[local1151] == local2221) {
								local707 = true;
								break;
							}
						}
					}
					if (!local707 && this.anInt316 == 0) {
						try {
							this.anIntArray85[this.anInt314] = local222;
							this.anInt314 = (this.anInt314 + 1) % 100;
							local844 = Class49.method678(this.anInt301 - 13, this.aClass1_Sub1_Sub3_3);
							@Pc(2304) String local2304 = Class42.method598(local844);
							if (local226 == 2 || local226 == 3) {
								this.method217(this.aByte2, "@cr2@" + Class48.method665(Class48.method662(local2221)), local2304, 7);
							} else if (local226 == 1) {
								this.method217(this.aByte2, "@cr1@" + Class48.method665(Class48.method662(local2221)), local2304, 7);
							} else {
								this.method217(this.aByte2, Class48.method665(Class48.method662(local2221)), local2304, 3);
							}
						} catch (@Pc(2364) Exception local2364) {
							signlink.reporterror("cde1");
						}
					}
					this.anInt302 = -1;
					return true;
				}
				if (this.anInt302 == 183) {
					local161 = this.aClass1_Sub1_Sub3_3.method476();
					local218 = this.aClass1_Sub1_Sub3_3.method476();
					local222 = local218 >> 10 & 0x1F;
					local226 = local218 >> 5 & 0x1F;
					local368 = local218 & 0x1F;
					Class6.aClass6Array1[local161].anInt435 = (local222 << 19) + (local226 << 11) + (local368 << 3);
					this.anInt302 = -1;
					return true;
				}
				if (this.anInt302 == 10) {
					local161 = this.aClass1_Sub1_Sub3_3.method476();
					@Pc(2437) boolean local2437 = this.aClass1_Sub1_Sub3_3.method474() == 1;
					Class6.aClass6Array1[local161].aBoolean99 = local2437;
					this.anInt302 = -1;
					return true;
				}
				if (this.anInt302 == 194) {
					this.anInt267 = this.aClass1_Sub1_Sub3_3.method474();
					this.anInt302 = -1;
					return true;
				}
				if (this.anInt302 == 89) {
					this.anInt405 = this.aClass1_Sub1_Sub3_3.method476() * 30;
					this.anInt302 = -1;
					return true;
				}
				if (this.anInt302 == 190) {
					for (local161 = 0; local161 < this.anIntArray72.length; local161++) {
						if (this.anIntArray72[local161] != this.anIntArray76[local161]) {
							this.anIntArray72[local161] = this.anIntArray76[local161];
							this.method110(local161);
							this.aBoolean88 = true;
						}
					}
					this.anInt302 = -1;
					return true;
				}
				if (this.anInt302 == 32) {
					this.anInt226 = this.aClass1_Sub1_Sub3_3.method474();
					this.anInt227 = this.aClass1_Sub1_Sub3_3.method474();
					this.anInt302 = -1;
					return true;
				}
				if (this.anInt302 == 247) {
					local2221 = this.aClass1_Sub1_Sub3_3.method480();
					local222 = this.aClass1_Sub1_Sub3_3.method474();
					@Pc(2558) String local2558 = Class48.method665(Class48.method662(local2221));
					for (local368 = 0; local368 < this.anInt217; local368++) {
						if (local2221 == this.aLongArray3[local368]) {
							if (this.anIntArray89[local368] != local222) {
								this.anIntArray89[local368] = local222;
								this.aBoolean88 = true;
								if (local222 > 0) {
									this.method217(this.aByte2, "", local2558 + " has logged in.", 5);
								}
								if (local222 == 0) {
									this.method217(this.aByte2, "", local2558 + " has logged out.", 5);
								}
							}
							local2558 = null;
							break;
						}
					}
					if (local2558 != null && this.anInt217 < 200) {
						this.aLongArray3[this.anInt217] = local2221;
						this.aStringArray5[this.anInt217] = local2558;
						this.anIntArray89[this.anInt217] = local222;
						this.anInt217++;
						this.aBoolean88 = true;
					}
					@Pc(2658) boolean local2658 = false;
					while (!local2658) {
						local2658 = true;
						for (local1151 = 0; local1151 < this.anInt217 - 1; local1151++) {
							if (this.anIntArray89[local1151] != anInt247 && this.anIntArray89[local1151 + 1] == anInt247 || this.anIntArray89[local1151] == 0 && this.anIntArray89[local1151 + 1] != 0) {
								local1172 = this.anIntArray89[local1151];
								this.anIntArray89[local1151] = this.anIntArray89[local1151 + 1];
								this.anIntArray89[local1151 + 1] = local1172;
								@Pc(2719) String local2719 = this.aStringArray5[local1151];
								this.aStringArray5[local1151] = this.aStringArray5[local1151 + 1];
								this.aStringArray5[local1151 + 1] = local2719;
								@Pc(2741) long local2741 = this.aLongArray3[local1151];
								this.aLongArray3[local1151] = this.aLongArray3[local1151 + 1];
								this.aLongArray3[local1151 + 1] = local2741;
								this.aBoolean88 = true;
								local2658 = false;
							}
						}
					}
					this.anInt302 = -1;
					return true;
				}
				if (this.anInt302 == 200) {
					this.aBoolean74 = true;
					this.anInt375 = this.aClass1_Sub1_Sub3_3.method474();
					this.anInt376 = this.aClass1_Sub1_Sub3_3.method474();
					this.anInt377 = this.aClass1_Sub1_Sub3_3.method476();
					this.anInt378 = this.aClass1_Sub1_Sub3_3.method474();
					this.anInt379 = this.aClass1_Sub1_Sub3_3.method474();
					if (this.anInt379 >= 100) {
						this.anInt362 = this.anInt375 * 128 + 64;
						this.anInt364 = this.anInt376 * 128 + 64;
						this.anInt363 = this.method147(this.anInt364, this.anInt362, this.anInt245) - this.anInt377;
					}
					this.anInt302 = -1;
					return true;
				}
				if (this.anInt302 == 215) {
					local161 = this.aClass1_Sub1_Sub3_3.method476();
					local218 = this.aClass1_Sub1_Sub3_3.method474();
					if (local161 == 65535) {
						local161 = -1;
					}
					this.anIntArray47[local218] = local161;
					this.aBoolean88 = true;
					this.aBoolean68 = true;
					this.anInt302 = -1;
					return true;
				}
				if (this.anInt302 == 115) {
					this.anInt229 = 0;
					this.anInt302 = -1;
					return true;
				}
				if (this.anInt302 == 44) {
					local161 = this.aClass1_Sub1_Sub3_3.method476();
					local702 = this.aClass1_Sub1_Sub3_3.method481();
					Class6.aClass6Array1[local161].aString18 = local702;
					if (Class6.aClass6Array1[local161].anInt421 == this.anIntArray47[this.anInt317]) {
						this.aBoolean88 = true;
					}
					this.anInt302 = -1;
					return true;
				}
				if (this.anInt302 == 166) {
					local161 = this.aClass1_Sub1_Sub3_3.method476();
					this.method229(local161);
					if (this.anInt390 != -1) {
						this.anInt390 = -1;
						this.aBoolean88 = true;
						this.aBoolean68 = true;
					}
					this.anInt392 = local161;
					this.aBoolean75 = true;
					this.anInt396 = -1;
					this.aBoolean84 = false;
					this.anInt302 = -1;
					return true;
				}
				if (this.anInt302 == 91) {
					this.anInt204 = this.aClass1_Sub1_Sub3_3.method479();
					this.anInt296 = this.aClass1_Sub1_Sub3_3.method476();
					this.anInt232 = this.aClass1_Sub1_Sub3_3.method474();
					this.anInt334 = this.aClass1_Sub1_Sub3_3.method476();
					this.anInt402 = this.aClass1_Sub1_Sub3_3.method474();
					if (this.anInt204 != 0 && this.anInt396 == -1) {
						signlink.dnslookup(Class48.method664(this.anInt204));
						this.method149();
						@Pc(3016) short local3016 = 650;
						if (this.anInt232 != 201 || this.anInt402 == 1) {
							local3016 = 655;
						}
						this.aString8 = "";
						this.aBoolean95 = false;
						for (local218 = 0; local218 < Class6.aClass6Array1.length; local218++) {
							if (Class6.aClass6Array1[local218] != null && Class6.aClass6Array1[local218].anInt424 == local3016) {
								this.anInt396 = Class6.aClass6Array1[local218].anInt421;
								break;
							}
						}
					}
					this.anInt302 = -1;
					return true;
				}
				if (this.anInt302 == 133) {
					this.anInt345 = this.aClass1_Sub1_Sub3_3.method476();
					this.anInt380 = this.aClass1_Sub1_Sub3_3.method474();
					this.anInt302 = -1;
					return true;
				}
				if (this.anInt302 == 207) {
					this.anInt275 = this.aClass1_Sub1_Sub3_3.method474();
					this.anInt302 = -1;
					return true;
				}
				if (this.anInt302 == 172) {
					this.aBoolean88 = true;
					local161 = this.aClass1_Sub1_Sub3_3.method476();
					local349 = Class6.aClass6Array1[local161];
					while (this.aClass1_Sub1_Sub3_3.anInt738 < this.anInt301) {
						local222 = this.aClass1_Sub1_Sub3_3.method474();
						local226 = this.aClass1_Sub1_Sub3_3.method476();
						local368 = this.aClass1_Sub1_Sub3_3.method474();
						if (local368 == 255) {
							local368 = this.aClass1_Sub1_Sub3_3.method479();
						}
						if (local222 >= 0 && local222 < local349.anIntArray93.length) {
							local349.anIntArray93[local222] = local226;
							local349.anIntArray94[local222] = local368;
						}
					}
					this.anInt302 = -1;
					return true;
				}
				if (this.anInt302 == 88) {
					this.method152(184);
					this.anInt302 = -1;
					return false;
				}
				if (this.anInt302 == 241) {
					this.anInt317 = this.aClass1_Sub1_Sub3_3.method474();
					this.aBoolean88 = true;
					this.aBoolean68 = true;
					this.anInt302 = -1;
					return true;
				}
				if (this.anInt302 == 28) {
					local161 = this.aClass1_Sub1_Sub3_3.method476();
					local218 = this.aClass1_Sub1_Sub3_3.method476();
					local222 = this.aClass1_Sub1_Sub3_3.method476();
					if (local218 == 65535) {
						Class6.aClass6Array1[local161].anInt439 = 0;
						this.anInt302 = -1;
						return true;
					}
					@Pc(3225) Class15 local3225 = Class15.method358(local218);
					Class6.aClass6Array1[local161].anInt439 = 4;
					Class6.aClass6Array1[local161].anInt440 = local218;
					Class6.aClass6Array1[local161].anInt446 = local3225.anInt603;
					Class6.aClass6Array1[local161].anInt447 = local3225.anInt604;
					Class6.aClass6Array1[local161].anInt445 = local3225.anInt602 * 100 / local222;
					this.anInt302 = -1;
					return true;
				}
				if (this.anInt302 == 211) {
					local161 = this.aClass1_Sub1_Sub3_3.method476();
					this.method229(local161);
					if (this.anInt390 != -1) {
						this.anInt390 = -1;
						this.aBoolean88 = true;
						this.aBoolean68 = true;
					}
					if (this.anInt392 != -1) {
						this.anInt392 = -1;
						this.aBoolean75 = true;
					}
					if (this.aBoolean94) {
						this.aBoolean94 = false;
						this.aBoolean75 = true;
					}
					this.anInt396 = local161;
					this.aBoolean84 = false;
					this.anInt302 = -1;
					return true;
				}
				if (this.anInt302 == 101) {
					this.aBoolean74 = false;
					for (local161 = 0; local161 < 5; local161++) {
						this.aBooleanArray4[local161] = false;
					}
					this.anInt302 = -1;
					return true;
				}
				if (this.anInt302 == 3) {
					this.anInt252 = this.anInt301 / 8;
					for (local161 = 0; local161 < this.anInt252; local161++) {
						this.aLongArray4[local161] = this.aClass1_Sub1_Sub3_3.method480();
					}
					this.anInt302 = -1;
					return true;
				}
				if (this.anInt302 == 47) {
					for (local161 = 0; local161 < this.aClass1_Sub1_Sub1_Sub1_Sub1Array1.length; local161++) {
						if (this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local161] != null) {
							this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local161].anInt1009 = -1;
						}
					}
					for (local218 = 0; local218 < this.aClass1_Sub1_Sub1_Sub1_Sub2Array1.length; local218++) {
						if (this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local218] != null) {
							this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local218].anInt1009 = -1;
						}
					}
					this.anInt302 = -1;
					return true;
				}
				if (this.anInt302 == 67) {
					if (this.anInt317 == 12) {
						this.aBoolean88 = true;
					}
					this.anInt340 = this.aClass1_Sub1_Sub3_3.method477();
					this.anInt302 = -1;
					return true;
				}
				if (this.anInt302 == 95 || this.anInt302 == 176 || this.anInt302 == 219 || this.anInt302 == 85 || this.anInt302 == 107 || this.anInt302 == 52 || this.anInt302 == 81 || this.anInt302 == 48 || this.anInt302 == 173 || this.anInt302 == 138) {
					this.method115(this.anInt302, this.aClass1_Sub1_Sub3_3);
					this.anInt302 = -1;
					return true;
				}
				if (this.anInt302 == 54) {
					local161 = this.aClass1_Sub1_Sub3_3.method476();
					local218 = this.aClass1_Sub1_Sub3_3.method476();
					local1918 = Class6.aClass6Array1[local161];
					if (local1918 != null && local1918.anInt422 == 0) {
						if (local218 < 0) {
							local218 = 0;
						}
						if (local218 > local1918.anInt430 - local1918.anInt426) {
							local218 = local1918.anInt430 - local1918.anInt426;
						}
						local1918.anInt431 = local218;
					}
					this.anInt302 = -1;
					return true;
				}
				if (this.anInt302 == 83) {
					if (this.anInt317 == 12) {
						this.aBoolean88 = true;
					}
					this.anInt288 = this.aClass1_Sub1_Sub3_3.method474();
					this.anInt302 = -1;
					return true;
				}
				if (this.anInt302 == 197) {
					this.method163(this.aClass1_Sub1_Sub3_3, this.anInt301);
					this.anInt302 = -1;
					return true;
				}
				if (this.anInt302 == 185) {
					this.anInt218 = this.aClass1_Sub1_Sub3_3.method474();
					this.aBoolean88 = true;
					this.anInt302 = -1;
					return true;
				}
				if (this.anInt302 == 34) {
					local161 = this.aClass1_Sub1_Sub3_3.method476();
					local218 = this.aClass1_Sub1_Sub3_3.method474();
					local222 = this.aClass1_Sub1_Sub3_3.method476();
					if (this.aBoolean87 && !aBoolean71 && this.anInt262 < 50) {
						this.anIntArray62[this.anInt262] = local161;
						this.anIntArray60[this.anInt262] = local218;
						this.anIntArray43[this.anInt262] = local222 + Class5.anIntArray28[local161];
						this.anInt262++;
					}
					this.anInt302 = -1;
					return true;
				}
				if (this.anInt302 == 16) {
					local161 = this.aClass1_Sub1_Sub3_3.method476();
					this.method229(local161);
					if (this.anInt392 != -1) {
						this.anInt392 = -1;
						this.aBoolean75 = true;
					}
					if (this.aBoolean94) {
						this.aBoolean94 = false;
						this.aBoolean75 = true;
					}
					this.anInt390 = local161;
					this.aBoolean88 = true;
					this.aBoolean68 = true;
					this.anInt396 = -1;
					this.aBoolean84 = false;
					this.anInt302 = -1;
					return true;
				}
				signlink.reporterror("T1 - " + this.anInt302 + "," + this.anInt301 + " - " + this.anInt214 + "," + this.anInt215);
				this.method152(184);
			} catch (@Pc(3736) IOException local3736) {
				this.method183();
			} catch (@Pc(3741) Exception local3741) {
				local691 = "T2 - " + this.anInt302 + "," + this.anInt214 + "," + this.anInt215 + " - " + this.anInt301 + "," + (this.anInt278 + aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray269[0]) + "," + (this.anInt279 + aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray270[0]) + " - ";
				for (local218 = 0; local218 < this.anInt301 && local218 < 50; local218++) {
					local691 = local691 + this.aClass1_Sub1_Sub3_3.aByteArray9[local218] + ",";
				}
				signlink.reporterror(local691);
				this.method152(184);
			}
			return true;
		} catch (@Pc(3822) RuntimeException local3822) {
			signlink.reporterror("47455, " + -2 + ", " + local3822.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "w", descriptor = "(I)V")
	private void method171() {
		try {
			@Pc(2) int local2 = this.anInt324;
			@Pc(5) int local5 = this.anInt325;
			@Pc(8) int local8 = this.anInt326;
			@Pc(11) int local11 = this.anInt327;
			Class1_Sub1_Sub2.method436(local2, 6116423, local11, local8, local5);
			Class1_Sub1_Sub2.method436(local2 + 1, 0, 16, local8 - 2, local5 + 1);
			Class1_Sub1_Sub2.method437(local8 - 2, 0, local11 - 19, local5 + 18, local2 + 1);
			this.aClass1_Sub1_Sub2_Sub4_3.method447(local2 + 3, "Choose Option", local5 + 14, 6116423);
			@Pc(71) int local71 = super.anInt194;
			@Pc(74) int local74 = super.anInt195;
			if (this.anInt323 == 0) {
				local71 -= 4;
				local74 -= 4;
			}
			if (this.anInt323 == 1) {
				local71 -= 553;
				local74 -= 205;
			}
			if (this.anInt323 == 2) {
				local71 -= 17;
				local74 -= 357;
			}
			for (@Pc(93) int local93 = 0; local93 < this.anInt219; local93++) {
				@Pc(108) int local108 = local5 + (this.anInt219 - 1 - local93) * 15 + 31;
				@Pc(110) int local110 = 16777215;
				if (local71 > local2 && local71 < local2 + local8 && local74 > local108 - 13 && local74 < local108 + 3) {
					local110 = 16776960;
				}
				this.aClass1_Sub1_Sub2_Sub4_3.method449(local108, local2 + 3, true, local110, this.aStringArray2[local93]);
			}
		} catch (@Pc(151) RuntimeException local151) {
			signlink.reporterror("66652, " + 185 + ", " + local151.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "k", descriptor = "(Z)V")
	private void method172() {
		try {
			if (this.anInt358 == 0) {
				this.aStringArray2[0] = "Cancel";
				this.anIntArray81[0] = 1106;
				this.anInt219 = 1;
				this.method109();
				this.anInt336 = 0;
				if (super.anInt194 > 4 && super.anInt195 > 4 && super.anInt194 < 516 && super.anInt195 < 338) {
					if (this.anInt396 == -1) {
						this.method165();
					} else {
						this.method120(Class6.aClass6Array1[this.anInt396], 4, super.anInt194, super.anInt195, 0, 4);
					}
				}
				if (this.anInt336 != this.anInt233) {
					this.anInt233 = this.anInt336;
				}
				this.anInt336 = 0;
				if (super.anInt194 > 553 && super.anInt195 > 205 && super.anInt194 < 743 && super.anInt195 < 466) {
					if (this.anInt390 != -1) {
						this.method120(Class6.aClass6Array1[this.anInt390], 553, super.anInt194, super.anInt195, 0, 205);
					} else if (this.anIntArray47[this.anInt317] != -1) {
						this.method120(Class6.aClass6Array1[this.anIntArray47[this.anInt317]], 553, super.anInt194, super.anInt195, 0, 205);
					}
				}
				if (this.anInt336 != this.anInt224) {
					this.aBoolean88 = true;
					this.anInt224 = this.anInt336;
				}
				this.anInt336 = 0;
				if (super.anInt194 > 17 && super.anInt195 > 357 && super.anInt194 < 496 && super.anInt195 < 453) {
					if (this.anInt392 != -1) {
						this.method120(Class6.aClass6Array1[this.anInt392], 17, super.anInt194, super.anInt195, 0, 357);
					} else if (super.anInt195 < 434 && super.anInt194 < 426) {
						this.method173(super.anInt195 - 357, super.anInt194 - 17);
					}
				}
				if (this.anInt392 != -1 && this.anInt336 != this.anInt253) {
					this.aBoolean75 = true;
					this.anInt253 = this.anInt336;
				}
				@Pc(226) boolean local226 = false;
				while (!local226) {
					local226 = true;
					for (@Pc(232) int local232 = 0; local232 < this.anInt219 - 1; local232++) {
						if (this.anIntArray81[local232] < 1000 && this.anIntArray81[local232 + 1] > 1000) {
							@Pc(253) String local253 = this.aStringArray2[local232];
							this.aStringArray2[local232] = this.aStringArray2[local232 + 1];
							this.aStringArray2[local232 + 1] = local253;
							@Pc(275) int local275 = this.anIntArray81[local232];
							this.anIntArray81[local232] = this.anIntArray81[local232 + 1];
							this.anIntArray81[local232 + 1] = local275;
							@Pc(297) int local297 = this.anIntArray79[local232];
							this.anIntArray79[local232] = this.anIntArray79[local232 + 1];
							this.anIntArray79[local232 + 1] = local297;
							@Pc(319) int local319 = this.anIntArray80[local232];
							this.anIntArray80[local232] = this.anIntArray80[local232 + 1];
							this.anIntArray80[local232 + 1] = local319;
							@Pc(341) int local341 = this.anIntArray82[local232];
							this.anIntArray82[local232] = this.anIntArray82[local232 + 1];
							this.anIntArray82[local232 + 1] = local341;
							local226 = false;
						}
					}
				}
			}
		} catch (@Pc(371) RuntimeException local371) {
			signlink.reporterror("40869, " + true + ", " + local371.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(III)V")
	private void method173(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			if (this.anInt372 != 45827) {
				this.aClass1_Sub1_Sub3_2.method464(35);
			}
			@Pc(9) int local9 = 0;
			for (@Pc(11) int local11 = 0; local11 < 100; local11++) {
				if (this.aStringArray4[local11] != null) {
					@Pc(23) int local23 = this.anIntArray63[local11];
					@Pc(34) int local34 = this.anInt339 + 70 + 4 - local9 * 14;
					if (local34 < -20) {
						break;
					}
					@Pc(42) String local42 = this.aStringArray3[local11];
					if (local42 != null && local42.startsWith("@cr1@")) {
						local42 = local42.substring(5);
					}
					if (local42 != null && local42.startsWith("@cr2@")) {
						local42 = local42.substring(5);
					}
					if (local23 == 0) {
						local9++;
					}
					if ((local23 == 1 || local23 == 2) && (local23 == 1 || this.anInt415 == 0 || this.anInt415 == 1 && this.method103(local42))) {
						if (arg0 > local34 - 14 && arg0 <= local34 && !local42.equals(aClass1_Sub1_Sub1_Sub1_Sub1_1.aString3)) {
							if (this.anInt329 >= 1) {
								this.aStringArray2[this.anInt219] = "Report abuse @whi@" + local42;
								this.anIntArray81[this.anInt219] = 524;
								this.anInt219++;
							}
							this.aStringArray2[this.anInt219] = "Add ignore @whi@" + local42;
							this.anIntArray81[this.anInt219] = 47;
							this.anInt219++;
							this.aStringArray2[this.anInt219] = "Add friend @whi@" + local42;
							this.anIntArray81[this.anInt219] = 605;
							this.anInt219++;
						}
						local9++;
					}
					if ((local23 == 3 || local23 == 7) && this.anInt237 == 0 && (local23 == 7 || this.anInt355 == 0 || this.anInt355 == 1 && this.method103(local42))) {
						if (arg0 > local34 - 14 && arg0 <= local34) {
							if (this.anInt329 >= 1) {
								this.aStringArray2[this.anInt219] = "Report abuse @whi@" + local42;
								this.anIntArray81[this.anInt219] = 524;
								this.anInt219++;
							}
							this.aStringArray2[this.anInt219] = "Add ignore @whi@" + local42;
							this.anIntArray81[this.anInt219] = 47;
							this.anInt219++;
							this.aStringArray2[this.anInt219] = "Add friend @whi@" + local42;
							this.anIntArray81[this.anInt219] = 605;
							this.anInt219++;
						}
						local9++;
					}
					if (local23 == 4 && (this.anInt225 == 0 || this.anInt225 == 1 && this.method103(local42))) {
						if (arg0 > local34 - 14 && arg0 <= local34) {
							this.aStringArray2[this.anInt219] = "Accept trade @whi@" + local42;
							this.anIntArray81[this.anInt219] = 507;
							this.anInt219++;
						}
						local9++;
					}
					if ((local23 == 5 || local23 == 6) && this.anInt237 == 0 && this.anInt355 < 2) {
						local9++;
					}
					if (local23 == 8 && (this.anInt225 == 0 || this.anInt225 == 1 && this.method103(local42))) {
						if (arg0 > local34 - 14 && arg0 <= local34) {
							this.aStringArray2[this.anInt219] = "Accept challenge @whi@" + local42;
							this.anIntArray81[this.anInt219] = 957;
							this.anInt219++;
						}
						local9++;
					}
				}
			}
		} catch (@Pc(407) RuntimeException local407) {
			signlink.reporterror("56660, " + arg0 + ", " + arg1 + ", " + 45827 + ", " + local407.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIIII)V")
	private void method175(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		try {
			this.aClass1_Sub1_Sub2_Sub3_19.method415(arg2, (byte) 1, arg1);
			this.aClass1_Sub1_Sub2_Sub3_20.method415(arg2, (byte) 1, arg1 + arg4 - 16);
			Class1_Sub1_Sub2.method436(arg2, this.anInt277, arg4 - 32, 16, arg1 + 16);
			@Pc(41) int local41 = (arg4 - 32) * arg4 / arg0;
			if (local41 < 8) {
				local41 = 8;
			}
			@Pc(58) int local58 = (arg4 - local41 - 32) * arg3 / (arg0 - arg4);
			Class1_Sub1_Sub2.method436(arg2, this.anInt346, local41, 16, arg1 + local58 + 16);
			Class1_Sub1_Sub2.method441(local41, arg2, arg1 + local58 + 16, this.anInt220);
			Class1_Sub1_Sub2.method441(local41, arg2 + 1, arg1 + 16 + local58, this.anInt220);
			Class1_Sub1_Sub2.method439(arg1 + local58 + 16, this.anInt220, 16, arg2);
			Class1_Sub1_Sub2.method439(arg1 + local58 + 17, this.anInt220, 16, arg2);
			Class1_Sub1_Sub2.method441(local41, arg2 + 15, arg1 + 16 + local58, this.anInt352);
			Class1_Sub1_Sub2.method441(local41 - 1, arg2 + 14, arg1 + local58 + 17, this.anInt352);
			Class1_Sub1_Sub2.method439(arg1 + local58 + local41 + 15, this.anInt352, 16, arg2);
			Class1_Sub1_Sub2.method439(arg1 + local58 + local41 + 14, this.anInt352, 15, arg2 + 1);
		} catch (@Pc(174) RuntimeException local174) {
			signlink.reporterror("23840, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + 223 + ", " + local174.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "y", descriptor = "(I)V")
	private void method176() {
		try {
			Class9.aClass40_4.method587();
			Class9.aClass40_5.method587();
			Class13.aClass40_6.method587();
			Class15.aClass40_7.method587();
			Class15.aClass40_8.method587();
			Class1_Sub1_Sub1_Sub1_Sub1.aClass40_1.method587();
			Class33.aClass40_9.method587();
		} catch (@Pc(21) RuntimeException local21) {
			signlink.reporterror("88662, " + 0 + ", " + local21.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(IILclient!lb;)V")
	private void method177(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class1_Sub1_Sub3 arg2) {
		try {
			this.anInt387 = 0;
			this.anInt274 = 0;
			@Pc(11) boolean local11 = false;
			this.method141(arg2, arg1);
			this.method184(arg2, arg1);
			this.method102(arg1, 368, arg2);
			this.method198(arg2, arg1);
			@Pc(40) int local40;
			for (@Pc(33) int local33 = 0; local33 < this.anInt387; local33++) {
				local40 = this.anIntArray77[local33];
				if (this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local40].anInt1026 != anInt265) {
					this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local40] = null;
				}
			}
			if (arg2.anInt738 != arg1) {
				signlink.reporterror("Error packet size mismatch in getplayer pos:" + arg2.anInt738 + " psize:" + arg1);
				throw new RuntimeException("eek");
			}
			for (local40 = 0; local40 < this.anInt273; local40++) {
				if (this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[this.anIntArray49[local40]] == null) {
					signlink.reporterror(this.aString15 + " null entry in pl list - pos:" + local40 + " size:" + this.anInt273);
					throw new RuntimeException("eek");
				}
			}
		} catch (@Pc(120) RuntimeException local120) {
			signlink.reporterror("14648, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local120.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(II)V")
	private void method178(@OriginalArg(0) int arg0) {
		try {
			@Pc(5) int[] local5 = this.aClass1_Sub1_Sub2_Sub2_1.anIntArray205;
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
						this.aClass37_1.method559(local5, local34, arg0, local36, local22);
					}
					if (arg0 < 3 && (this.aByteArrayArrayArray7[arg0 + 1][local36][local22] & 0x8) != 0) {
						this.aClass37_1.method559(local5, local34, arg0 + 1, local36, local22);
					}
					local34 += 4;
				}
			}
			local34 = ((int) (Math.random() * 20.0D) + 238 - 10 << 16) + ((int) (Math.random() * 20.0D) + 238 - 10 << 8) + (int) (Math.random() * 20.0D) + 238 - 10;
			local36 = (int) (Math.random() * 20.0D) + 238 - 10 << 16;
			this.aClass1_Sub1_Sub2_Sub2_1.method383();
			@Pc(146) int local146;
			for (@Pc(142) int local142 = 1; local142 < 103; local142++) {
				for (local146 = 1; local146 < 103; local146++) {
					if ((this.aByteArrayArrayArray7[arg0][local146][local142] & 0x18) == 0) {
						this.method201(local34, local142, local146, local36, arg0);
					}
					if (arg0 < 3 && (this.aByteArrayArrayArray7[arg0 + 1][local146][local142] & 0x8) != 0) {
						this.method201(local34, local142, local146, local36, arg0 + 1);
					}
				}
			}
			this.aClass35_17.method518(979);
			this.anInt341 = 0;
			for (local146 = 0; local146 < 104; local146++) {
				for (@Pc(220) int local220 = 0; local220 < 104; local220++) {
					@Pc(230) int local230 = this.aClass37_1.method553(this.anInt245, local146, local220);
					if (local230 != 0) {
						local230 = local230 >> 14 & 0x7FFF;
						@Pc(242) int local242 = Class9.method287(local230).anInt512;
						if (local242 >= 0) {
							@Pc(246) int local246 = local146;
							@Pc(248) int local248 = local220;
							if (local242 != 22 && local242 != 29 && local242 != 34 && local242 != 36 && local242 != 46 && local242 != 47 && local242 != 48) {
								@Pc(280) int[][] local280 = this.aClass19Array1[this.anInt245].anIntArrayArray18;
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
							this.aClass1_Sub1_Sub2_Sub2Array7[this.anInt341] = this.aClass1_Sub1_Sub2_Sub2Array6[local242];
							this.anIntArray64[this.anInt341] = local246;
							this.anIntArray65[this.anInt341] = local248;
							this.anInt341++;
						}
					}
				}
			}
			anInt414++;
			if (anInt414 > 112) {
				anInt414 = 0;
				this.aClass1_Sub1_Sub3_2.method463(52);
				this.aClass1_Sub1_Sub3_2.method464(50);
			}
		} catch (@Pc(437) RuntimeException local437) {
			signlink.reporterror("71536, " + arg0 + ", " + 2412 + ", " + local437.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "z", descriptor = "(I)V")
	private void method179() {
		try {
			@Pc(16) int local16;
			if (this.anInt406 > 0) {
				for (local16 = 0; local16 < 256; local16++) {
					if (this.anInt406 > 768) {
						this.anIntArray55[local16] = this.method138(this.anIntArray57[local16], this.anIntArray56[local16], 1024 - this.anInt406);
					} else if (this.anInt406 > 256) {
						this.anIntArray55[local16] = this.anIntArray57[local16];
					} else {
						this.anIntArray55[local16] = this.method138(this.anIntArray56[local16], this.anIntArray57[local16], 256 - this.anInt406);
					}
				}
			} else if (this.anInt407 > 0) {
				for (local16 = 0; local16 < 256; local16++) {
					if (this.anInt407 > 768) {
						this.anIntArray55[local16] = this.method138(this.anIntArray58[local16], this.anIntArray56[local16], 1024 - this.anInt407);
					} else if (this.anInt407 > 256) {
						this.anIntArray55[local16] = this.anIntArray58[local16];
					} else {
						this.anIntArray55[local16] = this.method138(this.anIntArray56[local16], this.anIntArray58[local16], 256 - this.anInt407);
					}
				}
			} else {
				for (local16 = 0; local16 < 256; local16++) {
					this.anIntArray55[local16] = this.anIntArray56[local16];
				}
			}
			for (local16 = 0; local16 < 33920; local16++) {
				this.aClass35_22.anIntArray228[local16] = this.aClass1_Sub1_Sub2_Sub2_7.anIntArray205[local16];
			}
			@Pc(189) int local189 = 0;
			@Pc(191) int local191 = 1152;
			@Pc(206) int local206;
			@Pc(210) int local210;
			@Pc(220) int local220;
			@Pc(228) int local228;
			@Pc(232) int local232;
			@Pc(236) int local236;
			@Pc(247) int local247;
			for (@Pc(193) int local193 = 1; local193 < 255; local193++) {
				local206 = this.anIntArray88[local193] * (256 - local193) / 256;
				local210 = local206 + 22;
				if (local210 < 0) {
					local210 = 0;
				}
				local189 += local210;
				for (local220 = local210; local220 < 128; local220++) {
					local228 = this.anIntArray44[local189++];
					if (local228 == 0) {
						local191++;
					} else {
						local232 = local228;
						local236 = 256 - local228;
						local228 = this.anIntArray55[local228];
						local247 = this.aClass35_22.anIntArray228[local191];
						this.aClass35_22.anIntArray228[local191++] = ((local228 & 0xFF00FF) * local232 + (local247 & 0xFF00FF) * local236 & 0xFF00FF00) + ((local228 & 0xFF00) * local232 + (local247 & 0xFF00) * local236 & 0xFF0000) >> 8;
					}
				}
				local191 += local210;
			}
			this.aClass35_22.method519(super.aGraphics2, 0, 0);
			for (local206 = 0; local206 < 33920; local206++) {
				this.aClass35_23.anIntArray228[local206] = this.aClass1_Sub1_Sub2_Sub2_8.anIntArray205[local206];
			}
			local189 = 0;
			local191 = 1176;
			for (local210 = 1; local210 < 255; local210++) {
				local220 = this.anIntArray88[local210] * (256 - local210) / 256;
				local228 = 103 - local220;
				local191 += local220;
				for (local232 = 0; local232 < local228; local232++) {
					local236 = this.anIntArray44[local189++];
					if (local236 == 0) {
						local191++;
					} else {
						local247 = local236;
						@Pc(370) int local370 = 256 - local236;
						local236 = this.anIntArray55[local236];
						@Pc(381) int local381 = this.aClass35_23.anIntArray228[local191];
						this.aClass35_23.anIntArray228[local191++] = ((local236 & 0xFF00FF) * local247 + (local381 & 0xFF00FF) * local370 & 0xFF00FF00) + ((local236 & 0xFF00) * local247 + (local381 & 0xFF00) * local370 & 0xFF0000) >> 8;
					}
				}
				local189 += 128 - local228;
				local191 += 128 - local228 - local220;
			}
			this.aClass35_23.method519(super.aGraphics2, 637, 0);
		} catch (@Pc(453) RuntimeException local453) {
			signlink.reporterror("57801, " + 631 + ", " + local453.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "A", descriptor = "(I)V")
	private void method180() {
		try {
			this.aClass1_Sub1_Sub2_Sub3_1 = new Class1_Sub1_Sub2_Sub3(this.aClass47_1, "titlebox", 0);
			this.aClass1_Sub1_Sub2_Sub3_2 = new Class1_Sub1_Sub2_Sub3(this.aClass47_1, "titlebutton", 0);
			this.aClass1_Sub1_Sub2_Sub3Array3 = new Class1_Sub1_Sub2_Sub3[12];
			@Pc(32) int local32 = 0;
			try {
				local32 = Integer.parseInt(this.getParameter("fl_icon"));
			} catch (@Pc(39) Exception local39) {
			}
			@Pc(43) int local43;
			if (local32 == 0) {
				for (local43 = 0; local43 < 12; local43++) {
					this.aClass1_Sub1_Sub2_Sub3Array3[local43] = new Class1_Sub1_Sub2_Sub3(this.aClass47_1, "runes", local43);
				}
			} else {
				for (local43 = 0; local43 < 12; local43++) {
					this.aClass1_Sub1_Sub2_Sub3Array3[local43] = new Class1_Sub1_Sub2_Sub3(this.aClass47_1, "runes", (local43 & 0x3) + 12);
				}
			}
			this.aClass1_Sub1_Sub2_Sub2_7 = new Class1_Sub1_Sub2_Sub2(128, 265);
			this.aClass1_Sub1_Sub2_Sub2_8 = new Class1_Sub1_Sub2_Sub2(128, 265);
			for (local43 = 0; local43 < 33920; local43++) {
				this.aClass1_Sub1_Sub2_Sub2_7.anIntArray205[local43] = this.aClass35_22.anIntArray228[local43];
			}
			for (@Pc(119) int local119 = 0; local119 < 33920; local119++) {
				this.aClass1_Sub1_Sub2_Sub2_8.anIntArray205[local119] = this.aClass35_23.anIntArray228[local119];
			}
			this.anIntArray56 = new int[256];
			for (@Pc(141) int local141 = 0; local141 < 64; local141++) {
				this.anIntArray56[local141] = local141 * 262144;
			}
			for (@Pc(156) int local156 = 0; local156 < 64; local156++) {
				this.anIntArray56[local156 + 64] = local156 * 1024 + 16711680;
			}
			for (@Pc(175) int local175 = 0; local175 < 64; local175++) {
				this.anIntArray56[local175 + 128] = local175 * 4 + 16776960;
			}
			for (@Pc(194) int local194 = 0; local194 < 64; local194++) {
				this.anIntArray56[local194 + 192] = 16777215;
			}
			this.anIntArray57 = new int[256];
			for (@Pc(213) int local213 = 0; local213 < 64; local213++) {
				this.anIntArray57[local213] = local213 * 1024;
			}
			for (@Pc(228) int local228 = 0; local228 < 64; local228++) {
				this.anIntArray57[local228 + 64] = local228 * 4 + 65280;
			}
			for (@Pc(247) int local247 = 0; local247 < 64; local247++) {
				this.anIntArray57[local247 + 128] = local247 * 262144 + 65535;
			}
			for (@Pc(266) int local266 = 0; local266 < 64; local266++) {
				this.anIntArray57[local266 + 192] = 16777215;
			}
			this.anIntArray58 = new int[256];
			for (@Pc(285) int local285 = 0; local285 < 64; local285++) {
				this.anIntArray58[local285] = local285 * 4;
			}
			for (@Pc(300) int local300 = 0; local300 < 64; local300++) {
				this.anIntArray58[local300 + 64] = local300 * 262144 + 255;
			}
			for (@Pc(319) int local319 = 0; local319 < 64; local319++) {
				this.anIntArray58[local319 + 128] = local319 * 1024 + 16711935;
			}
			for (@Pc(338) int local338 = 0; local338 < 64; local338++) {
				this.anIntArray58[local338 + 192] = 16777215;
			}
			this.anIntArray55 = new int[256];
			this.anIntArray38 = new int[32768];
			this.anIntArray39 = new int[32768];
			this.method134(null);
			this.anIntArray44 = new int[32768];
			this.anIntArray45 = new int[32768];
			this.method95(10, "Connecting to fileserver");
			if (!this.aBoolean81) {
				this.aBoolean97 = true;
				this.aBoolean81 = true;
				this.method94(this, 2);
			}
		} catch (@Pc(395) RuntimeException local395) {
			signlink.reporterror("69399, " + 7 + ", " + local395.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
	@Override
	public AppletContext getAppletContext() {
		return signlink.mainapp == null ? super.getAppletContext() : signlink.mainapp.getAppletContext();
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ZIIIIIIIIIIZ)Z")
	private boolean method181(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10) {
		try {
			@Pc(11) int local11;
			for (@Pc(7) int local7 = 0; local7 < 104; local7++) {
				for (local11 = 0; local11 < 104; local11++) {
					this.anIntArrayArray4[local7][local11] = 0;
					this.anIntArrayArray3[local7][local11] = 99999999;
				}
			}
			local11 = arg4;
			@Pc(39) int local39 = arg2;
			this.anIntArrayArray4[arg4][arg2] = 99;
			this.anIntArrayArray3[arg4][arg2] = 0;
			@Pc(55) byte local55 = 0;
			@Pc(57) int local57 = 0;
			this.anIntArray90[0] = arg4;
			@Pc(66) int local66 = local55 + 1;
			this.anIntArray91[0] = arg2;
			@Pc(70) boolean local70 = false;
			@Pc(74) int local74 = this.anIntArray90.length;
			@Pc(87) int[][] local87 = this.aClass19Array1[this.anInt245].anIntArrayArray18;
			@Pc(199) int local199;
			while (local57 != local66) {
				local11 = this.anIntArray90[local57];
				local39 = this.anIntArray91[local57];
				local57 = (local57 + 1) % local74;
				if (local11 == arg6 && local39 == arg8) {
					local70 = true;
					break;
				}
				if (arg5 != 0) {
					if ((arg5 < 5 || arg5 == 10) && this.aClass19Array1[this.anInt245].method426(local39, arg9, arg8, local11, arg6, arg5 - 1)) {
						local70 = true;
						break;
					}
					if (arg5 < 10 && this.aClass19Array1[this.anInt245].method427(local11, local39, arg5 - 1, arg8, arg6, arg9)) {
						local70 = true;
						break;
					}
				}
				if (arg3 != 0 && arg7 != 0 && this.aClass19Array1[this.anInt245].method428(arg6, local11, arg8, arg3, this.anInt403, local39, arg1, arg7)) {
					local70 = true;
					break;
				}
				local199 = this.anIntArrayArray3[local11][local39] + 1;
				if (local11 > 0 && this.anIntArrayArray4[local11 - 1][local39] == 0 && (local87[local11 - 1][local39] & 0x280108) == 0) {
					this.anIntArray90[local66] = local11 - 1;
					this.anIntArray91[local66] = local39;
					local66 = (local66 + 1) % local74;
					this.anIntArrayArray4[local11 - 1][local39] = 2;
					this.anIntArrayArray3[local11 - 1][local39] = local199;
				}
				if (local11 < 103 && this.anIntArrayArray4[local11 + 1][local39] == 0 && (local87[local11 + 1][local39] & 0x280180) == 0) {
					this.anIntArray90[local66] = local11 + 1;
					this.anIntArray91[local66] = local39;
					local66 = (local66 + 1) % local74;
					this.anIntArrayArray4[local11 + 1][local39] = 8;
					this.anIntArrayArray3[local11 + 1][local39] = local199;
				}
				if (local39 > 0 && this.anIntArrayArray4[local11][local39 - 1] == 0 && (local87[local11][local39 - 1] & 0x280102) == 0) {
					this.anIntArray90[local66] = local11;
					this.anIntArray91[local66] = local39 - 1;
					local66 = (local66 + 1) % local74;
					this.anIntArrayArray4[local11][local39 - 1] = 1;
					this.anIntArrayArray3[local11][local39 - 1] = local199;
				}
				if (local39 < 103 && this.anIntArrayArray4[local11][local39 + 1] == 0 && (local87[local11][local39 + 1] & 0x280120) == 0) {
					this.anIntArray90[local66] = local11;
					this.anIntArray91[local66] = local39 + 1;
					local66 = (local66 + 1) % local74;
					this.anIntArrayArray4[local11][local39 + 1] = 4;
					this.anIntArrayArray3[local11][local39 + 1] = local199;
				}
				if (local11 > 0 && local39 > 0 && this.anIntArrayArray4[local11 - 1][local39 - 1] == 0 && (local87[local11 - 1][local39 - 1] & 0x28010E) == 0 && (local87[local11 - 1][local39] & 0x280108) == 0 && (local87[local11][local39 - 1] & 0x280102) == 0) {
					this.anIntArray90[local66] = local11 - 1;
					this.anIntArray91[local66] = local39 - 1;
					local66 = (local66 + 1) % local74;
					this.anIntArrayArray4[local11 - 1][local39 - 1] = 3;
					this.anIntArrayArray3[local11 - 1][local39 - 1] = local199;
				}
				if (local11 < 103 && local39 > 0 && this.anIntArrayArray4[local11 + 1][local39 - 1] == 0 && (local87[local11 + 1][local39 - 1] & 0x280183) == 0 && (local87[local11 + 1][local39] & 0x280180) == 0 && (local87[local11][local39 - 1] & 0x280102) == 0) {
					this.anIntArray90[local66] = local11 + 1;
					this.anIntArray91[local66] = local39 - 1;
					local66 = (local66 + 1) % local74;
					this.anIntArrayArray4[local11 + 1][local39 - 1] = 9;
					this.anIntArrayArray3[local11 + 1][local39 - 1] = local199;
				}
				if (local11 > 0 && local39 < 103 && this.anIntArrayArray4[local11 - 1][local39 + 1] == 0 && (local87[local11 - 1][local39 + 1] & 0x280138) == 0 && (local87[local11 - 1][local39] & 0x280108) == 0 && (local87[local11][local39 + 1] & 0x280120) == 0) {
					this.anIntArray90[local66] = local11 - 1;
					this.anIntArray91[local66] = local39 + 1;
					local66 = (local66 + 1) % local74;
					this.anIntArrayArray4[local11 - 1][local39 + 1] = 6;
					this.anIntArrayArray3[local11 - 1][local39 + 1] = local199;
				}
				if (local11 < 103 && local39 < 103 && this.anIntArrayArray4[local11 + 1][local39 + 1] == 0 && (local87[local11 + 1][local39 + 1] & 0x2801E0) == 0 && (local87[local11 + 1][local39] & 0x280180) == 0 && (local87[local11][local39 + 1] & 0x280120) == 0) {
					this.anIntArray90[local66] = local11 + 1;
					this.anIntArray91[local66] = local39 + 1;
					local66 = (local66 + 1) % local74;
					this.anIntArrayArray4[local11 + 1][local39 + 1] = 12;
					this.anIntArrayArray3[local11 + 1][local39 + 1] = local199;
				}
			}
			this.anInt354 = 0;
			@Pc(815) int local815;
			@Pc(821) int local821;
			@Pc(827) int local827;
			if (!local70) {
				if (arg0) {
					local199 = 100;
					for (local815 = 1; local815 < 2; local815++) {
						for (local821 = arg6 - local815; local821 <= arg6 + local815; local821++) {
							for (local827 = arg8 - local815; local827 <= arg8 + local815; local827++) {
								if (local821 >= 0 && local827 >= 0 && local821 < 104 && local827 < 104 && this.anIntArrayArray3[local821][local827] < local199) {
									local199 = this.anIntArrayArray3[local821][local827];
									local11 = local821;
									local39 = local827;
									this.anInt354 = 1;
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
			@Pc(888) byte local888 = 0;
			this.anIntArray90[0] = local11;
			local57 = local888 + 1;
			this.anIntArray91[0] = local39;
			local199 = local815 = this.anIntArrayArray4[local11][local39];
			while (local11 != arg4 || local39 != arg2) {
				if (local199 != local815) {
					local815 = local199;
					this.anIntArray90[local57] = local11;
					this.anIntArray91[local57++] = local39;
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
				local199 = this.anIntArrayArray4[local11][local39];
			}
			if (local57 > 0) {
				local74 = local57;
				if (local57 > 25) {
					local74 = 25;
				}
				local57--;
				local821 = this.anIntArray90[local57];
				local827 = this.anIntArray91[local57];
				if (arg10 == 0) {
					this.aClass1_Sub1_Sub3_2.method463(207);
					this.aClass1_Sub1_Sub3_2.method464(local74 + local74 + 3);
				}
				if (arg10 == 1) {
					this.aClass1_Sub1_Sub3_2.method463(86);
					this.aClass1_Sub1_Sub3_2.method464(local74 + local74 + 3 + 14);
				}
				if (arg10 == 2) {
					this.aClass1_Sub1_Sub3_2.method463(138);
					this.aClass1_Sub1_Sub3_2.method464(local74 + local74 + 3);
				}
				if (super.anIntArray29[5] == 1) {
					this.aClass1_Sub1_Sub3_2.method464(1);
				} else {
					this.aClass1_Sub1_Sub3_2.method464(0);
				}
				this.aClass1_Sub1_Sub3_2.method465(local821 + this.anInt278);
				this.aClass1_Sub1_Sub3_2.method465(local827 + this.anInt279);
				this.anInt229 = this.anIntArray90[0];
				this.anInt230 = this.anIntArray91[0];
				for (@Pc(1076) int local1076 = 1; local1076 < local74; local1076++) {
					local57--;
					this.aClass1_Sub1_Sub3_2.method464(this.anIntArray90[local57] - local821);
					this.aClass1_Sub1_Sub3_2.method464(this.anIntArray91[local57] - local827);
				}
				return true;
			} else if (arg10 == 1) {
				return false;
			} else {
				return true;
			}
		} catch (@Pc(1111) RuntimeException local1111) {
			signlink.reporterror("89557, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + arg10 + ", " + true + ", " + local1111.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(III)Z")
	private boolean method182(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(3) boolean local3 = false;
			@Pc(7) Class6 local7 = Class6.aClass6Array1[arg0];
			for (@Pc(9) int local9 = 0; local9 < local7.anIntArray97.length && local7.anIntArray97[local9] != -1; local9++) {
				@Pc(24) Class6 local24 = Class6.aClass6Array1[local7.anIntArray97[local9]];
				if (local24.anInt422 == 1) {
					local3 |= this.method182(local24.anInt420, arg1);
				}
				if (local24.anInt422 == 6 && (local24.anInt443 != -1 || local24.anInt444 != -1)) {
					@Pc(54) boolean local54 = this.method98(local24, (byte) 8);
					@Pc(59) int local59;
					if (local54) {
						local59 = local24.anInt444;
					} else {
						local59 = local24.anInt443;
					}
					if (local59 != -1) {
						@Pc(71) Class27 local71 = Class27.aClass27Array1[local59];
						local24.anInt419 += arg1;
						while (local24.anInt419 > local71.method500(local24.anInt418)) {
							local24.anInt419 -= local71.method500(local24.anInt418) + 1;
							local24.anInt418++;
							if (local24.anInt418 >= local71.anInt793) {
								local24.anInt418 -= local71.anInt794;
								if (local24.anInt418 < 0 || local24.anInt418 >= local71.anInt793) {
									local24.anInt418 = 0;
								}
							}
							local3 = true;
						}
					}
				}
			}
			return local3;
		} catch (@Pc(148) RuntimeException local148) {
			signlink.reporterror("41887, " + arg0 + ", " + arg1 + ", " + 2 + ", " + local148.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(B)V")
	@Override
	protected void method90(@OriginalArg(0) byte arg0) {
		try {
			signlink.reporterror = false;
			try {
				if (this.aClass8_1 != null) {
					this.aClass8_1.method246();
				}
			} catch (@Pc(11) Exception local11) {
			}
			this.aClass8_1 = null;
			this.method133();
			if (this.aClass11_1 != null) {
				this.aClass11_1.aBoolean144 = false;
			}
			this.aClass11_1 = null;
			this.aClass44_Sub1_1.method631();
			this.aClass44_Sub1_1 = null;
			this.aClass1_Sub1_Sub3_2 = null;
			this.aClass1_Sub1_Sub3_4 = null;
			this.aClass1_Sub1_Sub3_3 = null;
			this.anIntArray73 = null;
			this.aByteArrayArray2 = null;
			this.aByteArrayArray1 = null;
			this.anIntArray74 = null;
			this.anIntArray75 = null;
			this.anIntArrayArrayArray5 = null;
			this.aByteArrayArrayArray7 = null;
			this.aClass37_1 = null;
			this.aClass19Array1 = null;
			this.anIntArrayArray4 = null;
			this.anIntArrayArray3 = null;
			this.anIntArray90 = null;
			this.anIntArray91 = null;
			this.aByteArray2 = null;
			this.aClass35_15 = null;
			this.aClass35_16 = null;
			this.aClass35_17 = null;
			this.aClass35_18 = null;
			this.aClass35_12 = null;
			this.aClass35_13 = null;
			this.aClass35_14 = null;
			this.aClass35_3 = null;
			this.aClass35_4 = null;
			this.aClass35_5 = null;
			this.aClass35_6 = null;
			this.aClass35_7 = null;
			this.aClass35_8 = null;
			this.aClass35_9 = null;
			this.aClass35_10 = null;
			this.aClass35_11 = null;
			this.aClass1_Sub1_Sub2_Sub3_8 = null;
			this.aClass1_Sub1_Sub2_Sub3_9 = null;
			this.aClass1_Sub1_Sub2_Sub3_10 = null;
			this.aClass1_Sub1_Sub2_Sub3_16 = null;
			this.aClass1_Sub1_Sub2_Sub3_17 = null;
			this.aClass1_Sub1_Sub2_Sub3_18 = null;
			this.aClass1_Sub1_Sub2_Sub3Array2 = null;
			this.aClass1_Sub1_Sub2_Sub3_11 = null;
			this.aClass1_Sub1_Sub2_Sub3_12 = null;
			this.aClass1_Sub1_Sub2_Sub3_13 = null;
			this.aClass1_Sub1_Sub2_Sub3_14 = null;
			this.aClass1_Sub1_Sub2_Sub3_15 = null;
			this.aClass1_Sub1_Sub2_Sub3_3 = null;
			this.aClass1_Sub1_Sub2_Sub3_4 = null;
			this.aClass1_Sub1_Sub2_Sub3_5 = null;
			this.aClass1_Sub1_Sub2_Sub3_6 = null;
			this.aClass1_Sub1_Sub2_Sub3_7 = null;
			this.aClass1_Sub1_Sub2_Sub2_6 = null;
			this.aClass1_Sub1_Sub2_Sub2Array3 = null;
			this.aClass1_Sub1_Sub2_Sub2Array5 = null;
			this.aClass1_Sub1_Sub2_Sub2Array4 = null;
			this.aClass1_Sub1_Sub2_Sub2_2 = null;
			this.aClass1_Sub1_Sub2_Sub2_3 = null;
			this.aClass1_Sub1_Sub2_Sub2_4 = null;
			this.aClass1_Sub1_Sub2_Sub2_5 = null;
			this.aClass1_Sub1_Sub2_Sub3Array1 = null;
			this.aClass1_Sub1_Sub2_Sub2Array6 = null;
			this.anIntArrayArray5 = null;
			this.aClass1_Sub1_Sub1_Sub1_Sub1Array1 = null;
			this.anIntArray49 = null;
			this.anIntArray50 = null;
			this.aClass1_Sub1_Sub3Array1 = null;
			this.anIntArray77 = null;
			this.aClass1_Sub1_Sub1_Sub1_Sub2Array1 = null;
			this.anIntArray78 = null;
			this.aClass29ArrayArrayArray1 = null;
			this.aClass29_3 = null;
			this.aClass29_2 = null;
			this.aClass29_1 = null;
			this.anIntArray79 = null;
			this.anIntArray80 = null;
			this.anIntArray81 = null;
			this.anIntArray82 = null;
			this.aStringArray2 = null;
			this.anIntArray72 = null;
			this.anIntArray64 = null;
			this.anIntArray65 = null;
			@Pc(278) boolean local278 = false;
			this.aClass1_Sub1_Sub2_Sub2Array7 = null;
			this.aClass1_Sub1_Sub2_Sub2_1 = null;
			this.aStringArray5 = null;
			this.aLongArray3 = null;
			this.anIntArray89 = null;
			this.aClass35_22 = null;
			this.aClass35_23 = null;
			this.aClass35_19 = null;
			this.aClass35_20 = null;
			this.aClass35_21 = null;
			this.aClass35_24 = null;
			this.aClass35_25 = null;
			this.aClass35_26 = null;
			this.aClass35_27 = null;
			this.method132();
			Class9.method286();
			Class13.method320();
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
			Class1_Sub1_Sub2_Sub1.method339();
			Class37.method523();
			Class1_Sub1_Sub1_Sub5.method256();
			Class12.method302();
			System.gc();
		} catch (@Pc(375) RuntimeException local375) {
			signlink.reporterror("12822, " + arg0 + ", " + local375.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "k", descriptor = "(B)V")
	private void method183() {
		try {
			if (this.anInt305 > 0) {
				this.method152(184);
			} else {
				this.aClass35_17.method518(979);
				this.aClass1_Sub1_Sub2_Sub4_2.method443(257, 0, "Connection lost", 144);
				this.aClass1_Sub1_Sub2_Sub4_2.method443(256, 16777215, "Connection lost", 143);
				this.aClass1_Sub1_Sub2_Sub4_2.method443(257, 0, "Please wait - attempting to reestablish", 159);
				this.aClass1_Sub1_Sub2_Sub4_2.method443(256, 16777215, "Please wait - attempting to reestablish", 158);
				this.aClass35_17.method519(super.aGraphics2, 4, 4);
				this.anInt267 = 0;
				this.anInt229 = 0;
				@Pc(64) Class8 local64 = this.aClass8_1;
				this.aBoolean90 = false;
				this.method215(this.aString15, this.aString16, true);
				if (!this.aBoolean90) {
					this.method152(184);
				}
				try {
					local64.method246();
				} catch (@Pc(84) Exception local84) {
				}
			}
		} catch (@Pc(86) RuntimeException local86) {
			signlink.reporterror("86467, " + -31 + ", " + local86.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(BLclient!lb;I)V")
	private void method184(@OriginalArg(1) Class1_Sub1_Sub3 arg0, @OriginalArg(2) int arg1) {
		try {
			@Pc(6) int local6 = arg0.method485(8);
			if (this.aByte7 != -18) {
				this.aClass29ArrayArrayArray1 = null;
			}
			@Pc(19) int local19;
			if (local6 < this.anInt273) {
				for (local19 = local6; local19 < this.anInt273; local19++) {
					this.anIntArray77[this.anInt387++] = this.anIntArray49[local19];
				}
			}
			if (local6 > this.anInt273) {
				signlink.reporterror(this.aString15 + " Too many players");
				throw new RuntimeException("eek");
			}
			this.anInt273 = 0;
			for (local19 = 0; local19 < local6; local19++) {
				@Pc(71) int local71 = this.anIntArray49[local19];
				@Pc(76) Class1_Sub1_Sub1_Sub1_Sub1 local76 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local71];
				@Pc(81) int local81 = arg0.method485(1);
				if (local81 == 0) {
					this.anIntArray49[this.anInt273++] = local71;
					local76.anInt1026 = anInt265;
				} else {
					@Pc(104) int local104 = arg0.method485(2);
					if (local104 == 0) {
						this.anIntArray49[this.anInt273++] = local71;
						local76.anInt1026 = anInt265;
						this.anIntArray50[this.anInt274++] = local71;
					} else {
						@Pc(155) int local155;
						@Pc(165) int local165;
						if (local104 == 1) {
							this.anIntArray49[this.anInt273++] = local71;
							local76.anInt1026 = anInt265;
							local155 = arg0.method485(3);
							local76.method673((byte) 5, local155, false);
							local165 = arg0.method485(1);
							if (local165 == 1) {
								this.anIntArray50[this.anInt274++] = local71;
							}
						} else if (local104 == 2) {
							this.anIntArray49[this.anInt273++] = local71;
							local76.anInt1026 = anInt265;
							local155 = arg0.method485(3);
							local76.method673((byte) 5, local155, true);
							local165 = arg0.method485(3);
							local76.method673((byte) 5, local165, true);
							@Pc(223) int local223 = arg0.method485(1);
							if (local223 == 1) {
								this.anIntArray50[this.anInt274++] = local71;
							}
						} else if (local104 == 3) {
							this.anIntArray77[this.anInt387++] = local71;
						}
					}
				}
			}
		} catch (@Pc(260) RuntimeException local260) {
			signlink.reporterror("82847, " + -18 + ", " + arg0 + ", " + arg1 + ", " + local260.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "B", descriptor = "(I)Ljava/net/Socket;")
	public Socket method185(@OriginalArg(0) int arg0) throws IOException {
		return signlink.mainapp == null ? new Socket(InetAddress.getByName(this.getCodeBase().getHost()), arg0) : signlink.opensocket(arg0);
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IBIIIII)V")
	private void method186(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		try {
			@Pc(5) int local5 = 2048 - arg1 & 0x7FF;
			@Pc(11) int local11 = 2048 - arg4 & 0x7FF;
			@Pc(13) int local13 = 0;
			@Pc(15) int local15 = 0;
			@Pc(17) int local17 = arg2;
			@Pc(23) int local23;
			@Pc(27) int local27;
			@Pc(37) int local37;
			if (local5 != 0) {
				local23 = Class1_Sub1_Sub1_Sub5.anIntArray150[local5];
				local27 = Class1_Sub1_Sub1_Sub5.anIntArray151[local5];
				local37 = local27 * 0 - arg2 * local23 >> 16;
				local17 = local23 * 0 + arg2 * local27 >> 16;
				local15 = local37;
			}
			if (local11 != 0) {
				local23 = Class1_Sub1_Sub1_Sub5.anIntArray150[local11];
				local27 = Class1_Sub1_Sub1_Sub5.anIntArray151[local11];
				local37 = local17 * local23 + local27 * 0 >> 16;
				local17 = local17 * local27 - local23 * 0 >> 16;
				local13 = local37;
			}
			this.anInt362 = arg5 - local13;
			this.anInt363 = arg3 - local15;
			this.anInt364 = arg0 - local17;
			this.anInt365 = arg1;
			this.anInt366 = arg4;
		} catch (@Pc(109) RuntimeException local109) {
			signlink.reporterror("58783, " + arg0 + ", " + 0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local109.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILclient!ib;IB)V")
	private void method187(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub1_Sub2_Sub2 arg1, @OriginalArg(2) int arg2) {
		try {
			@Pc(11) int local11 = arg2 * arg2 + arg0 * arg0;
			if (local11 > 4225 && local11 < 90000) {
				@Pc(25) int local25 = this.anInt384 + this.anInt337 & 0x7FF;
				@Pc(29) int local29 = Class1_Sub1_Sub1_Sub5.anIntArray150[local25];
				@Pc(33) int local33 = Class1_Sub1_Sub1_Sub5.anIntArray151[local25];
				@Pc(42) int local42 = local29 * 256 / (this.anInt260 + 256);
				@Pc(51) int local51 = local33 * 256 / (this.anInt260 + 256);
				@Pc(61) int local61 = arg0 * local42 + arg2 * local51 >> 16;
				@Pc(71) int local71 = arg0 * local51 - arg2 * local42 >> 16;
				@Pc(77) double local77 = Math.atan2((double) local61, (double) local71);
				@Pc(83) int local83 = (int) (Math.sin(local77) * 63.0D);
				@Pc(89) int local89 = (int) (Math.cos(local77) * 57.0D);
				this.aClass1_Sub1_Sub2_Sub2_13.method393(local77, local83 + 94 + 4 - 10, 83 - local89 - 20);
			} else {
				this.method226(arg1, arg2, arg0);
			}
		} catch (@Pc(120) RuntimeException local120) {
			signlink.reporterror("4323, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 33 + ", " + local120.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(BZ)V")
	private void method188(@OriginalArg(0) byte arg0, @OriginalArg(1) boolean arg1) {
		try {
			for (@Pc(1) int local1 = 0; local1 < this.anInt393; local1++) {
				@Pc(11) Class1_Sub1_Sub1_Sub1_Sub2 local11 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[this.anIntArray78[local1]];
				@Pc(20) int local20 = (this.anIntArray78[local1] << 14) + 536870912;
				if (local11 != null && local11.method675() && local11.aClass13_2.aBoolean152 == arg1) {
					@Pc(36) int local36 = local11.anInt986 >> 7;
					@Pc(41) int local41 = local11.anInt987 >> 7;
					if (local36 >= 0 && local36 < 104 && local41 >= 0 && local41 < 104) {
						if (local11.anInt989 == 1 && (local11.anInt986 & 0x7F) == 64 && (local11.anInt987 & 0x7F) == 64) {
							if (this.anIntArrayArray5[local36][local41] == this.anInt328) {
								continue;
							}
							this.anIntArrayArray5[local36][local41] = this.anInt328;
						}
						this.aClass37_1.method535(this.method147(local11.anInt987, local11.anInt986, this.anInt245), local11.anInt986, local11.anInt988, this.anInt245, local11, local20, local11.aBoolean261, (local11.anInt989 - 1) * 64 + 60, local11.anInt987);
					}
				}
			}
			if (arg0 != 2) {
				this.aClass1_Sub1_Sub3_2.method464(5);
			}
		} catch (@Pc(132) RuntimeException local132) {
			signlink.reporterror("22771, " + arg0 + ", " + arg1 + ", " + local132.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!nb;I)V")
	private void method189(@OriginalArg(0) Class1_Sub2 arg0) {
		try {
			@Pc(10) int local10 = 0;
			@Pc(12) int local12 = -1;
			@Pc(14) int local14 = 0;
			@Pc(16) int local16 = 0;
			if (arg0.anInt780 == 0) {
				local10 = this.aClass37_1.method550(arg0.anInt779, arg0.anInt781, arg0.anInt782);
			}
			if (arg0.anInt780 == 1) {
				local10 = this.aClass37_1.method551(arg0.anInt779, arg0.anInt781, arg0.anInt782);
			}
			if (arg0.anInt780 == 2) {
				local10 = this.aClass37_1.method552(arg0.anInt779, arg0.anInt781, arg0.anInt782);
			}
			if (arg0.anInt780 == 3) {
				local10 = this.aClass37_1.method553(arg0.anInt779, arg0.anInt781, arg0.anInt782);
			}
			if (local10 != 0) {
				@Pc(85) int local85 = this.aClass37_1.method554(arg0.anInt779, arg0.anInt781, arg0.anInt782, local10);
				local12 = local10 >> 14 & 0x7FFF;
				local14 = local85 & 0x1F;
				local16 = local85 >> 6;
			}
			arg0.anInt783 = local12;
			arg0.anInt785 = local14;
			arg0.anInt784 = local16;
		} catch (@Pc(110) RuntimeException local110) {
			signlink.reporterror("51058, " + arg0 + ", " + -707 + ", " + local110.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(II)V")
	private void method190(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(9) Class29 local9 = this.aClass29ArrayArrayArray1[this.anInt245][arg0][arg1];
		if (local9 == null) {
			this.aClass37_1.method545(this.anInt245, arg0, arg1);
			return;
		}
		@Pc(21) int local21 = -99999999;
		@Pc(23) Class1_Sub1_Sub1_Sub3 local23 = null;
		@Pc(27) Class1_Sub1_Sub1_Sub3 local27;
		for (local27 = (Class1_Sub1_Sub1_Sub3) local9.method505(); local27 != null; local27 = (Class1_Sub1_Sub1_Sub3) local9.method507()) {
			@Pc(32) Class15 local32 = Class15.method358(local27.anInt178);
			@Pc(35) int local35 = local32.anInt609;
			if (local32.aBoolean164) {
				local35 *= local27.anInt179 + 1;
			}
			if (local35 > local21) {
				local21 = local35;
				local23 = local27;
			}
		}
		local9.method503(local23);
		@Pc(65) Class1_Sub1_Sub1_Sub3 local65 = null;
		@Pc(67) Class1_Sub1_Sub1_Sub3 local67 = null;
		for (local27 = (Class1_Sub1_Sub1_Sub3) local9.method505(); local27 != null; local27 = (Class1_Sub1_Sub1_Sub3) local9.method507()) {
			if (local27.anInt178 != local23.anInt178 && local65 == null) {
				local65 = local27;
			}
			if (local27.anInt178 != local23.anInt178 && local27.anInt178 != local65.anInt178 && local67 == null) {
				local67 = local27;
			}
		}
		@Pc(110) int local110 = arg0 + (arg1 << 7) + 1610612736;
		this.aClass37_1.method531(arg0, this.anInt245, this.method147(arg1 * 128 + 64, arg0 * 128 + 64, this.anInt245), local110, arg1, local23, local65, local67);
	}

	@OriginalMember(owner = "client!client", name = "C", descriptor = "(I)V")
	private void method191() {
		try {
			@Pc(6) int local6 = this.anInt375 * 128 + 64;
			@Pc(13) int local13 = this.anInt376 * 128 + 64;
			@Pc(24) int local24 = this.method147(local13, local6, this.anInt245) - this.anInt377;
			if (this.anInt362 < local6) {
				this.anInt362 += this.anInt378 + (local6 - this.anInt362) * this.anInt379 / 1000;
				if (this.anInt362 > local6) {
					this.anInt362 = local6;
				}
			}
			if (this.anInt362 > local6) {
				this.anInt362 -= this.anInt378 + (this.anInt362 - local6) * this.anInt379 / 1000;
				if (this.anInt362 < local6) {
					this.anInt362 = local6;
				}
			}
			if (this.anInt363 < local24) {
				this.anInt363 += this.anInt378 + (local24 - this.anInt363) * this.anInt379 / 1000;
				if (this.anInt363 > local24) {
					this.anInt363 = local24;
				}
			}
			if (this.anInt363 > local24) {
				this.anInt363 -= this.anInt378 + (this.anInt363 - local24) * this.anInt379 / 1000;
				if (this.anInt363 < local24) {
					this.anInt363 = local24;
				}
			}
			if (this.anInt364 < local13) {
				this.anInt364 += this.anInt378 + (local13 - this.anInt364) * this.anInt379 / 1000;
				if (this.anInt364 > local13) {
					this.anInt364 = local13;
				}
			}
			if (this.anInt364 > local13) {
				this.anInt364 -= this.anInt378 + (this.anInt364 - local13) * this.anInt379 / 1000;
				if (this.anInt364 < local13) {
					this.anInt364 = local13;
				}
			}
			local6 = this.anInt308 * 128 + 64;
			local13 = this.anInt309 * 128 + 64;
			local24 = this.method147(local13, local6, this.anInt245) - this.anInt310;
			@Pc(222) int local222 = local6 - this.anInt362;
			@Pc(227) int local227 = local24 - this.anInt363;
			@Pc(232) int local232 = local13 - this.anInt364;
			@Pc(243) int local243 = (int) Math.sqrt((double) (local222 * local222 + local232 * local232));
			@Pc(254) int local254 = (int) (Math.atan2((double) local227, (double) local243) * 325.949D) & 0x7FF;
			@Pc(272) int local272 = (int) (Math.atan2((double) local222, (double) local232) * -325.949D) & 0x7FF;
			if (local254 < 128) {
				local254 = 128;
			}
			if (local254 > 383) {
				local254 = 383;
			}
			if (this.anInt365 < local254) {
				this.anInt365 += this.anInt311 + (local254 - this.anInt365) * this.anInt312 / 1000;
				if (this.anInt365 > local254) {
					this.anInt365 = local254;
				}
			}
			if (this.anInt365 > local254) {
				this.anInt365 -= this.anInt311 + (this.anInt365 - local254) * this.anInt312 / 1000;
				if (this.anInt365 < local254) {
					this.anInt365 = local254;
				}
			}
			@Pc(343) int local343 = local272 - this.anInt366;
			if (local343 > 1024) {
				local343 -= 2048;
			}
			if (local343 < -1024) {
				local343 += 2048;
			}
			if (local343 > 0) {
				this.anInt366 += this.anInt311 + local343 * this.anInt312 / 1000;
				this.anInt366 &= 0x7FF;
			}
			if (local343 < 0) {
				this.anInt366 -= this.anInt311 + -local343 * this.anInt312 / 1000;
				this.anInt366 &= 0x7FF;
			}
			@Pc(401) int local401 = local272 - this.anInt366;
			if (local401 > 1024) {
				local401 -= 2048;
			}
			if (local401 < -1024) {
				local401 += 2048;
			}
			if (local401 < 0 && local343 > 0 || local401 > 0 && local343 < 0) {
				this.anInt366 = local272;
			}
		} catch (@Pc(422) RuntimeException local422) {
			signlink.reporterror("17020, " + -810 + ", " + local422.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "l", descriptor = "(B)Z")
	private boolean method192(@OriginalArg(0) byte arg0) {
		try {
			@Pc(4) boolean local4 = false;
			return signlink.wavereplay();
		} catch (@Pc(15) RuntimeException local15) {
			signlink.reporterror("14519, " + arg0 + ", " + local15.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "l", descriptor = "(Z)V")
	private void method194(@OriginalArg(0) boolean arg0) {
		try {
			this.aBoolean83 = true;
			if (arg0) {
				this.aClass29ArrayArrayArray1 = null;
			}
			try {
				@Pc(9) long local9 = System.currentTimeMillis();
				@Pc(11) int local11 = 0;
				@Pc(13) int local13 = 20;
				while (this.aBoolean81) {
					this.anInt299++;
					this.method139();
					this.method139();
					this.method179();
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
			this.aBoolean83 = false;
		} catch (@Pc(74) RuntimeException local74) {
			signlink.reporterror("60268, " + arg0 + ", " + local74.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "D", descriptor = "(I)V")
	private void method195() {
		try {
			@Pc(6) Class1_Sub1_Sub1_Sub4 local6 = (Class1_Sub1_Sub1_Sub4) this.aClass29_2.method505();
			if (this.anInt287 == -12224) {
				while (local6 != null) {
					if (local6.anInt455 != this.anInt245 || anInt265 > local6.anInt461) {
						local6.method668();
					} else if (anInt265 >= local6.anInt460) {
						if (local6.anInt464 > 0) {
							@Pc(39) Class1_Sub1_Sub1_Sub1_Sub2 local39 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local6.anInt464 - 1];
							if (local39 != null && local39.anInt986 >= 0 && local39.anInt986 < 13312 && local39.anInt987 >= 0 && local39.anInt987 < 13312) {
								local6.method240(local39.anInt987, local39.anInt986, this.method147(local39.anInt987, local39.anInt986, local6.anInt455) - local6.anInt459, anInt265);
							}
						}
						if (local6.anInt464 < 0) {
							@Pc(84) int local84 = -local6.anInt464 - 1;
							@Pc(90) Class1_Sub1_Sub1_Sub1_Sub1 local90;
							if (local84 == this.anInt345) {
								local90 = aClass1_Sub1_Sub1_Sub1_Sub1_1;
							} else {
								local90 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local84];
							}
							if (local90 != null && local90.anInt986 >= 0 && local90.anInt986 < 13312 && local90.anInt987 >= 0 && local90.anInt987 < 13312) {
								local6.method240(local90.anInt987, local90.anInt986, this.method147(local90.anInt987, local90.anInt986, local6.anInt455) - local6.anInt459, anInt265);
							}
						}
						local6.method241(this.anInt251);
						this.aClass37_1.method535((int) local6.aDouble3, (int) local6.aDouble1, local6.anInt465, this.anInt245, local6, -1, false, 60, (int) local6.aDouble2);
					}
					local6 = (Class1_Sub1_Sub1_Sub4) this.aClass29_2.method507();
				}
				anInt331++;
				if (anInt331 > 1174) {
					anInt331 = 0;
					this.aClass1_Sub1_Sub3_2.method463(12);
					this.aClass1_Sub1_Sub3_2.method464(0);
					@Pc(190) int local190 = this.aClass1_Sub1_Sub3_2.anInt738;
					if ((int) (Math.random() * 2.0D) == 0) {
						this.aClass1_Sub1_Sub3_2.method465(11499);
					}
					this.aClass1_Sub1_Sub3_2.method465(10548);
					if ((int) (Math.random() * 2.0D) == 0) {
						this.aClass1_Sub1_Sub3_2.method464(139);
					}
					if ((int) (Math.random() * 2.0D) == 0) {
						this.aClass1_Sub1_Sub3_2.method464(94);
					}
					this.aClass1_Sub1_Sub3_2.method465(51693);
					this.aClass1_Sub1_Sub3_2.method464(16);
					this.aClass1_Sub1_Sub3_2.method465(15036);
					if ((int) (Math.random() * 2.0D) == 0) {
						this.aClass1_Sub1_Sub3_2.method464(65);
					}
					this.aClass1_Sub1_Sub3_2.method464((int) (Math.random() * 256.0D));
					this.aClass1_Sub1_Sub3_2.method465(22990);
					this.aClass1_Sub1_Sub3_2.method473(this.aClass1_Sub1_Sub3_2.anInt738 - local190);
				}
			}
		} catch (@Pc(264) RuntimeException local264) {
			signlink.reporterror("14281, " + -12224 + ", " + local264.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(I)V")
	@Override
	protected void method91(@OriginalArg(0) int arg0) {
		try {
			if (this.aBoolean80 || this.aBoolean91 || this.aBoolean59) {
				this.method131();
			} else {
				anInt250++;
				@Pc(20) boolean local20 = false;
				if (this.aBoolean90) {
					this.method129();
				} else {
					this.method145(false);
				}
				this.anInt347 = 0;
			}
		} catch (@Pc(37) RuntimeException local37) {
			signlink.reporterror("86568, " + arg0 + ", " + local37.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "E", descriptor = "(I)V")
	private void method196(@OriginalArg(0) int arg0) {
		try {
			this.method113();
			if (this.anInt258 == 1) {
				this.aClass1_Sub1_Sub2_Sub2Array4[this.anInt257 / 100].method388(this.anInt255 - 8 - 4, (byte) 1, this.anInt256 - 8 - 4);
			}
			if (this.anInt258 == 2) {
				this.aClass1_Sub1_Sub2_Sub2Array4[this.anInt257 / 100 + 4].method388(this.anInt255 - 8 - 4, (byte) 1, this.anInt256 - 8 - 4);
				anInt394++;
				if (anInt394 > 57) {
					anInt394 = 0;
					this.aClass1_Sub1_Sub3_2.method463(100);
				}
			}
			if (this.anInt295 != -1) {
				this.method182(this.anInt295, this.anInt251);
				this.method228(Class6.aClass6Array1[this.anInt295], 0, 0, 0);
			}
			if (this.anInt396 != -1) {
				this.method182(this.anInt396, this.anInt251);
				this.method228(Class6.aClass6Array1[this.anInt396], 0, 0, 0);
			}
			this.method205();
			@Pc(121) int local121;
			while (arg0 >= 0) {
				for (local121 = 1; local121 > 0; local121++) {
				}
			}
			if (!this.aBoolean85) {
				this.method172();
				this.method224();
			} else if (this.anInt323 == 0) {
				this.method171();
			}
			if (this.anInt275 == 1) {
				this.aClass1_Sub1_Sub2_Sub2Array5[1].method388(472, (byte) 1, 296);
			}
			if (this.anInt405 != 0) {
				local121 = this.anInt405 / 50;
				@Pc(169) int local169 = local121 / 60;
				local121 %= 60;
				if (local121 < 10) {
					this.aClass1_Sub1_Sub2_Sub4_2.method447(4, "System update in: " + local169 + ":0" + local121, 329, 16776960);
				} else {
					this.aClass1_Sub1_Sub2_Sub4_2.method447(4, "System update in: " + local169 + ":" + local121, 329, 16776960);
				}
			}
		} catch (@Pc(215) RuntimeException local215) {
			signlink.reporterror("64372, " + arg0 + ", " + local215.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIZ)V")
	private void method197(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1) {
		try {
			signlink.anInt942 = arg0;
			if (arg1) {
				signlink.midi = "voladjust";
			}
		} catch (@Pc(15) RuntimeException local15) {
			signlink.reporterror("41163, " + -859 + ", " + arg0 + ", " + arg1 + ", " + local15.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "init", descriptor = "()V")
	@Override
	public void init() {
		anInt247 = Integer.parseInt(this.getParameter("nodeid"));
		anInt248 = Integer.parseInt(this.getParameter("portoff"));
		@Pc(15) String local15 = this.getParameter("lowmem");
		if (local15 != null && local15.equals("1")) {
			method209();
		} else {
			method174(anInt293);
		}
		@Pc(31) String local31 = this.getParameter("free");
		if (local31 != null && local31.equals("1")) {
			aBoolean70 = false;
		} else {
			aBoolean70 = true;
		}
		this.method84();
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(Lclient!lb;II)V")
	private void method198(@OriginalArg(0) Class1_Sub1_Sub3 arg0, @OriginalArg(2) int arg1) {
		try {
			for (@Pc(8) int local8 = 0; local8 < this.anInt274; local8++) {
				@Pc(15) int local15 = this.anIntArray50[local8];
				@Pc(20) Class1_Sub1_Sub1_Sub1_Sub1 local20 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local15];
				@Pc(23) int local23 = arg0.method474();
				if ((local23 & 0x80) == 128) {
					local23 += arg0.method474() << 8;
				}
				this.method144(arg0, local23, local20, local15);
			}
		} catch (@Pc(49) RuntimeException local49) {
			signlink.reporterror("12219, " + arg0 + ", " + 6 + ", " + arg1 + ", " + local49.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "m", descriptor = "(Z)V")
	private void method199() {
		try {
			@Pc(7) byte[] local7 = this.aClass47_1.method660("title.dat", null);
			@Pc(13) Class1_Sub1_Sub2_Sub2 local13 = new Class1_Sub1_Sub2_Sub2(local7, this);
			this.aClass35_22.method518(979);
			local13.method386(0, 0);
			this.aClass35_23.method518(979);
			local13.method386(0, -637);
			this.aClass35_19.method518(979);
			local13.method386(0, -128);
			this.aClass35_20.method518(979);
			local13.method386(-371, -202);
			this.aClass35_21.method518(979);
			local13.method386(-171, -202);
			this.aClass35_24.method518(979);
			local13.method386(-265, 0);
			this.aClass35_25.method518(979);
			local13.method386(-265, -562);
			this.aClass35_26.method518(979);
			local13.method386(-171, -128);
			this.aClass35_27.method518(979);
			local13.method386(-171, -562);
			@Pc(98) int[] local98 = new int[local13.anInt646];
			for (@Pc(100) int local100 = 0; local100 < local13.anInt647; local100++) {
				for (@Pc(104) int local104 = 0; local104 < local13.anInt646; local104++) {
					local98[local104] = local13.anIntArray205[local13.anInt646 + local13.anInt646 * local100 - local104 - 1];
				}
				for (@Pc(130) int local130 = 0; local130 < local13.anInt646; local130++) {
					local13.anIntArray205[local130 + local13.anInt646 * local100] = local98[local130];
				}
			}
			this.aClass35_22.method518(979);
			local13.method386(0, 382);
			this.aClass35_23.method518(979);
			local13.method386(0, -255);
			this.aClass35_19.method518(979);
			local13.method386(0, 254);
			this.aClass35_20.method518(979);
			local13.method386(-371, 180);
			this.aClass35_21.method518(979);
			local13.method386(-171, 180);
			this.aClass35_24.method518(979);
			local13.method386(-265, 382);
			this.aClass35_25.method518(979);
			local13.method386(-265, -180);
			this.aClass35_26.method518(979);
			local13.method386(-171, 254);
			this.aClass35_27.method518(979);
			local13.method386(-171, -180);
			local13 = new Class1_Sub1_Sub2_Sub2(this.aClass47_1, "logo", 0);
			this.aClass35_19.method518(979);
			local13.method388(382 - local13.anInt646 / 2 - 128, (byte) 1, 18);
			System.gc();
		} catch (@Pc(275) RuntimeException local275) {
			signlink.reporterror("77949, " + false + ", " + local275.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Lclient!d;B)Z")
	private boolean method200(@OriginalArg(0) Class6 arg0, @OriginalArg(1) byte arg1) {
		try {
			if (arg1 != 37) {
				throw new NullPointerException();
			}
			@Pc(11) int local11 = arg0.anInt424;
			if (local11 >= 1 && local11 <= 200 || !(local11 < 701 || local11 > 900)) {
				if (local11 >= 801) {
					local11 -= 701;
				} else if (local11 >= 701) {
					local11 -= 601;
				} else if (local11 >= 101) {
					local11 -= 101;
				} else {
					local11--;
				}
				this.aStringArray2[this.anInt219] = "Remove @whi@" + this.aStringArray5[local11];
				this.anIntArray81[this.anInt219] = 513;
				this.anInt219++;
				this.aStringArray2[this.anInt219] = "Message @whi@" + this.aStringArray5[local11];
				this.anIntArray81[this.anInt219] = 902;
				this.anInt219++;
				return true;
			} else if (local11 >= 401 && local11 <= 500) {
				this.aStringArray2[this.anInt219] = "Remove @whi@" + arg0.aString18;
				this.anIntArray81[this.anInt219] = 884;
				this.anInt219++;
				return true;
			} else {
				return false;
			}
		} catch (@Pc(134) RuntimeException local134) {
			signlink.reporterror("89009, " + arg0 + ", " + arg1 + ", " + local134.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IZIIII)V")
	private void method201(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		try {
			@Pc(16) int local16 = this.aClass37_1.method550(arg4, arg2, arg1);
			@Pc(26) int local26;
			@Pc(32) int local32;
			@Pc(36) int local36;
			@Pc(38) int local38;
			@Pc(60) int local60;
			@Pc(66) int local66;
			if (local16 != 0) {
				local26 = this.aClass37_1.method554(arg4, arg2, arg1, local16);
				local32 = local26 >> 6 & 0x3;
				local36 = local26 & 0x1F;
				local38 = arg0;
				if (local16 > 0) {
					local38 = arg3;
				}
				@Pc(46) int[] local46 = this.aClass1_Sub1_Sub2_Sub2_1.anIntArray205;
				local60 = arg2 * 4 + (103 - arg1) * 512 * 4 + 24624;
				local66 = local16 >> 14 & 0x7FFF;
				@Pc(69) Class9 local69 = Class9.method287(local66);
				if (local69.anInt513 == -1) {
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
					@Pc(79) Class1_Sub1_Sub2_Sub3 local79 = this.aClass1_Sub1_Sub2_Sub3Array1[local69.anInt513];
					if (local79 != null) {
						@Pc(91) int local91 = (local69.anInt508 * 4 - local79.anInt670) / 2;
						@Pc(101) int local101 = (local69.anInt509 * 4 - local79.anInt671) / 2;
						local79.method415(arg2 * 4 + local91 + 48, (byte) 1, (104 - arg1 - local69.anInt509) * 4 + local101 + 48);
					}
				}
			}
			local16 = this.aClass37_1.method552(arg4, arg2, arg1);
			if (local16 != 0) {
				local26 = this.aClass37_1.method554(arg4, arg2, arg1, local16);
				local32 = local26 >> 6 & 0x3;
				local36 = local26 & 0x1F;
				local38 = local16 >> 14 & 0x7FFF;
				@Pc(455) Class9 local455 = Class9.method287(local38);
				@Pc(487) int local487;
				if (local455.anInt513 != -1) {
					@Pc(465) Class1_Sub1_Sub2_Sub3 local465 = this.aClass1_Sub1_Sub2_Sub3Array1[local455.anInt513];
					if (local465 != null) {
						local66 = (local455.anInt508 * 4 - local465.anInt670) / 2;
						local487 = (local455.anInt509 * 4 - local465.anInt671) / 2;
						local465.method415(arg2 * 4 + local66 + 48, (byte) 1, (104 - arg1 - local455.anInt509) * 4 + local487 + 48);
					}
				} else if (local36 == 9) {
					local60 = 15658734;
					if (local16 > 0) {
						local60 = 15597568;
					}
					@Pc(524) int[] local524 = this.aClass1_Sub1_Sub2_Sub2_1.anIntArray205;
					local487 = arg2 * 4 + (103 - arg1) * 512 * 4 + 24624;
					if (local32 == 0 || local32 == 2) {
						local524[local487 + 1536] = local60;
						local524[local487 + 1024 + 1] = local60;
						local524[local487 + 512 + 2] = local60;
						local524[local487 + 3] = local60;
					} else {
						local524[local487] = local60;
						local524[local487 + 512 + 1] = local60;
						local524[local487 + 1024 + 2] = local60;
						local524[local487 + 1536 + 3] = local60;
					}
				}
			}
			local16 = this.aClass37_1.method553(arg4, arg2, arg1);
			if (local16 != 0) {
				local26 = local16 >> 14 & 0x7FFF;
				@Pc(619) Class9 local619 = Class9.method287(local26);
				if (local619.anInt513 != -1) {
					@Pc(629) Class1_Sub1_Sub2_Sub3 local629 = this.aClass1_Sub1_Sub2_Sub3Array1[local619.anInt513];
					if (local629 != null) {
						local38 = (local619.anInt508 * 4 - local629.anInt670) / 2;
						@Pc(651) int local651 = (local619.anInt509 * 4 - local629.anInt671) / 2;
						local629.method415(arg2 * 4 + local38 + 48, (byte) 1, (104 - arg1 - local619.anInt509) * 4 + local651 + 48);
						return;
					}
				}
			}
		} catch (@Pc(675) RuntimeException local675) {
			signlink.reporterror("87162, " + arg0 + ", " + true + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local675.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(I)V")
	@Override
	protected void method89() {
		try {
			this.anInt301 += 0;
			if (!this.aBoolean80 && !this.aBoolean91 && !this.aBoolean59) {
				anInt265++;
				if (this.aBoolean90) {
					this.method218();
				} else {
					this.method220();
				}
				this.method225();
			}
		} catch (@Pc(35) RuntimeException local35) {
			signlink.reporterror("33714, " + 0 + ", " + local35.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIILclient!gc;I)V")
	private void method202(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class13 arg3, @OriginalArg(4) int arg4) {
		try {
			if (this.anInt219 < 400) {
				@Pc(9) String local9 = arg3.aString24;
				@Pc(13) boolean local13 = false;
				if (arg3.anInt563 != 0) {
					local9 = local9 + method137(aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt130, arg3.anInt563) + " (level-" + arg3.anInt563 + ")";
				}
				if (this.anInt318 == 1) {
					this.aStringArray2[this.anInt219] = "Use " + this.aString11 + " with @yel@" + local9;
					this.anIntArray81[this.anInt219] = 829;
					this.anIntArray82[this.anInt219] = arg1;
					this.anIntArray79[this.anInt219] = arg4;
					this.anIntArray80[this.anInt219] = arg0;
					this.anInt219++;
				} else if (this.anInt282 != 1) {
					@Pc(151) int local151;
					if (arg3.aStringArray9 != null) {
						for (local151 = 4; local151 >= 0; local151--) {
							if (arg3.aStringArray9[local151] != null && !arg3.aStringArray9[local151].equalsIgnoreCase("attack")) {
								this.aStringArray2[this.anInt219] = arg3.aStringArray9[local151] + " @yel@" + local9;
								if (local151 == 0) {
									this.anIntArray81[this.anInt219] = 242;
								}
								if (local151 == 1) {
									this.anIntArray81[this.anInt219] = 209;
								}
								if (local151 == 2) {
									this.anIntArray81[this.anInt219] = 309;
								}
								if (local151 == 3) {
									this.anIntArray81[this.anInt219] = 852;
								}
								if (local151 == 4) {
									this.anIntArray81[this.anInt219] = 793;
								}
								this.anIntArray82[this.anInt219] = arg1;
								this.anIntArray79[this.anInt219] = arg4;
								this.anIntArray80[this.anInt219] = arg0;
								this.anInt219++;
							}
						}
					}
					if (arg3.aStringArray9 != null) {
						for (local151 = 4; local151 >= 0; local151--) {
							if (arg3.aStringArray9[local151] != null && arg3.aStringArray9[local151].equalsIgnoreCase("attack")) {
								@Pc(275) short local275 = 0;
								if (arg3.anInt563 > aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt130) {
									local275 = 2000;
								}
								this.aStringArray2[this.anInt219] = arg3.aStringArray9[local151] + " @yel@" + local9;
								if (local151 == 0) {
									this.anIntArray81[this.anInt219] = local275 + 242;
								}
								if (local151 == 1) {
									this.anIntArray81[this.anInt219] = local275 + 209;
								}
								if (local151 == 2) {
									this.anIntArray81[this.anInt219] = local275 + 309;
								}
								if (local151 == 3) {
									this.anIntArray81[this.anInt219] = local275 + 852;
								}
								if (local151 == 4) {
									this.anIntArray81[this.anInt219] = local275 + 793;
								}
								this.anIntArray82[this.anInt219] = arg1;
								this.anIntArray79[this.anInt219] = arg4;
								this.anIntArray80[this.anInt219] = arg0;
								this.anInt219++;
							}
						}
					}
					this.aStringArray2[this.anInt219] = "Examine @yel@" + local9;
					this.anIntArray81[this.anInt219] = 1714;
					this.anIntArray82[this.anInt219] = arg1;
					this.anIntArray79[this.anInt219] = arg4;
					this.anIntArray80[this.anInt219] = arg0;
					this.anInt219++;
				} else if ((this.anInt284 & 0x2) == 2) {
					this.aStringArray2[this.anInt219] = this.aString9 + " @yel@" + local9;
					this.anIntArray81[this.anInt219] = 240;
					this.anIntArray82[this.anInt219] = arg1;
					this.anIntArray79[this.anInt219] = arg4;
					this.anIntArray80[this.anInt219] = arg0;
					this.anInt219++;
					return;
				}
			}
		} catch (@Pc(425) RuntimeException local425) {
			signlink.reporterror("32941, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local425.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "n", descriptor = "(Z)V")
	private void method203() {
		try {
			this.anInt328++;
			this.method221(true);
			this.method188(this.aByte4, true);
			this.method221(false);
			this.method188(this.aByte4, false);
			this.method195();
			this.method156();
			@Pc(37) int local37;
			@Pc(76) int local76;
			if (!this.aBoolean74) {
				local37 = this.anInt383;
				if (this.anInt263 / 256 > local37) {
					local37 = this.anInt263 / 256;
				}
				if (this.aBooleanArray4[4] && this.anIntArray41[4] + 128 > local37) {
					local37 = this.anIntArray41[4] + 128;
				}
				local76 = this.anInt384 + this.anInt342 & 0x7FF;
				this.method186(this.anInt291, local37, local37 * 3 + 600, this.method147(aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt987, aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt986, this.anInt245) - 50, local76, this.anInt290);
			}
			if (this.aBoolean74) {
				local37 = this.method155();
			} else {
				local37 = this.method154();
			}
			local76 = this.anInt362;
			@Pc(120) int local120 = this.anInt363;
			@Pc(123) int local123 = this.anInt364;
			@Pc(126) int local126 = this.anInt365;
			@Pc(129) int local129 = this.anInt366;
			this.aBoolean90 &= true;
			@Pc(184) int local184;
			for (@Pc(137) int local137 = 0; local137 < 5; local137++) {
				if (this.aBooleanArray4[local137]) {
					local184 = (int) (Math.random() * (double) (this.anIntArray71[local137] * 2 + 1) - (double) this.anIntArray71[local137] + Math.sin((double) this.anIntArray66[local137] * ((double) this.anIntArray84[local137] / 100.0D)) * (double) this.anIntArray41[local137]);
					if (local137 == 0) {
						this.anInt362 += local184;
					}
					if (local137 == 1) {
						this.anInt363 += local184;
					}
					if (local137 == 2) {
						this.anInt364 += local184;
					}
					if (local137 == 3) {
						this.anInt366 = this.anInt366 + local184 & 0x7FF;
					}
					if (local137 == 4) {
						this.anInt365 += local184;
						if (this.anInt365 < 128) {
							this.anInt365 = 128;
						}
						if (this.anInt365 > 383) {
							this.anInt365 = 383;
						}
					}
				}
			}
			local184 = Class1_Sub1_Sub2_Sub1.anInt595;
			Class1_Sub1_Sub1_Sub5.aBoolean125 = true;
			Class1_Sub1_Sub1_Sub5.anInt501 = 0;
			Class1_Sub1_Sub1_Sub5.anInt499 = super.anInt194 - 4;
			Class1_Sub1_Sub1_Sub5.anInt500 = super.anInt195 - 4;
			Class1_Sub1_Sub2.method434();
			this.aClass37_1.method563(this.anInt365, this.anInt366, this.anInt363, this.anInt362, this.anInt364, local37);
			this.aClass37_1.method538();
			this.method130();
			this.method118(this.anInt322);
			this.method210(local184);
			this.method196(this.anInt266);
			this.aClass35_17.method519(super.aGraphics2, 4, 4);
			this.anInt362 = local76;
			this.anInt363 = local120;
			this.anInt364 = local123;
			this.anInt365 = local126;
			this.anInt366 = local129;
		} catch (@Pc(325) RuntimeException local325) {
			signlink.reporterror("68508, " + true + ", " + local325.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(JI)V")
	private void method204(@OriginalArg(0) long arg0) {
		try {
			if (arg0 != 0L) {
				for (@Pc(8) int local8 = 0; local8 < this.anInt252; local8++) {
					if (this.aLongArray4[local8] == arg0) {
						this.anInt252--;
						this.aBoolean88 = true;
						for (@Pc(28) int local28 = local8; local28 < this.anInt252; local28++) {
							this.aLongArray4[local28] = this.aLongArray4[local28 + 1];
						}
						this.aClass1_Sub1_Sub3_2.method463(101);
						this.aClass1_Sub1_Sub3_2.method470(arg0);
						break;
					}
				}
				this.anInt301 += 0;
			}
		} catch (@Pc(70) RuntimeException local70) {
			signlink.reporterror("24890, " + arg0 + ", " + 0 + ", " + local70.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "F", descriptor = "(I)V")
	private void method205() {
		try {
			this.anInt316 = 0;
			@Pc(19) int local19 = (aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt986 >> 7) + this.anInt278;
			@Pc(27) int local27 = (aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt987 >> 7) + this.anInt279;
			if (local19 >= 3053 && local19 <= 3156 && local27 >= 3056 && local27 <= 3136) {
				this.anInt316 = 1;
			}
			if (local19 >= 3072 && local19 <= 3118 && local27 >= 9492 && local27 <= 9535) {
				this.anInt316 = 1;
			}
			if (this.anInt316 == 1 && local19 >= 3139 && local19 <= 3199 && local27 >= 3008 && local27 <= 3062) {
				this.anInt316 = 0;
			}
		} catch (@Pc(78) RuntimeException local78) {
			signlink.reporterror("21633, " + 4 + ", " + local78.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ZI)Ljava/lang/String;")
	private String method206(@OriginalArg(1) int arg0) {
		try {
			return arg0 < 999999999 ? String.valueOf(arg0) : "*";
		} catch (@Pc(13) RuntimeException local13) {
			signlink.reporterror("12519, " + false + ", " + arg0 + ", " + local13.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "f", descriptor = "(II)V")
	private void method207(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			signlink.anInt945 = arg0;
			if (arg1 > 0) {
				;
			}
		} catch (@Pc(5) RuntimeException local5) {
			signlink.reporterror("20212, " + arg0 + ", " + arg1 + ", " + local5.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!d;I)Z")
	private boolean method208(@OriginalArg(0) Class6 arg0, @OriginalArg(1) int arg1) {
		try {
			if (arg1 != 0) {
				this.aClass29ArrayArrayArray1 = null;
			}
			@Pc(9) int local9 = arg0.anInt424;
			if (this.anInt218 == 2) {
				if (local9 == 201) {
					this.aBoolean75 = true;
					this.aBoolean94 = false;
					this.aBoolean60 = true;
					this.aString5 = "";
					this.anInt238 = 1;
					this.aString14 = "Enter name of friend to add to list";
				}
				if (local9 == 202) {
					this.aBoolean75 = true;
					this.aBoolean94 = false;
					this.aBoolean60 = true;
					this.aString5 = "";
					this.anInt238 = 2;
					this.aString14 = "Enter name of friend to delete from list";
				}
			}
			if (local9 == 205) {
				this.anInt305 = 250;
				return true;
			}
			if (local9 == 501) {
				this.aBoolean75 = true;
				this.aBoolean94 = false;
				this.aBoolean60 = true;
				this.aString5 = "";
				this.anInt238 = 4;
				this.aString14 = "Enter name of player to add to list";
			}
			if (local9 == 502) {
				this.aBoolean75 = true;
				this.aBoolean94 = false;
				this.aBoolean60 = true;
				this.aString5 = "";
				this.anInt238 = 5;
				this.aString14 = "Enter name of player to delete from list";
			}
			@Pc(117) int local117;
			@Pc(121) int local121;
			@Pc(126) int local126;
			if (local9 >= 300 && local9 <= 313) {
				local117 = (local9 - 300) / 2;
				local121 = local9 & 0x1;
				local126 = this.anIntArray40[local117];
				if (local126 != -1) {
					while (true) {
						if (local121 == 0) {
							local126--;
							if (local126 < 0) {
								local126 = Class23.anInt746 - 1;
							}
						}
						if (local121 == 1) {
							local126++;
							if (local126 >= Class23.anInt746) {
								local126 = 0;
							}
						}
						if (!Class23.aClass23Array1[local126].aBoolean196 && Class23.aClass23Array1[local126].anInt747 == local117 + (this.aBoolean79 ? 0 : 7)) {
							this.anIntArray40[local117] = local126;
							this.aBoolean96 = true;
							break;
						}
					}
				}
			}
			if (local9 >= 314 && local9 <= 323) {
				local117 = (local9 - 314) / 2;
				local121 = local9 & 0x1;
				local126 = this.anIntArray42[local117];
				if (local121 == 0) {
					local126--;
					if (local126 < 0) {
						local126 = anIntArrayArray6[local117].length - 1;
					}
				}
				if (local121 == 1) {
					local126++;
					if (local126 >= anIntArrayArray6[local117].length) {
						local126 = 0;
					}
				}
				this.anIntArray42[local117] = local126;
				this.aBoolean96 = true;
			}
			if (local9 == 324 && !this.aBoolean79) {
				this.aBoolean79 = true;
				this.method212();
			}
			if (local9 == 325 && this.aBoolean79) {
				this.aBoolean79 = false;
				this.method212();
			}
			if (local9 == 326) {
				this.aClass1_Sub1_Sub3_2.method463(125);
				this.aClass1_Sub1_Sub3_2.method464(this.aBoolean79 ? 0 : 1);
				for (local117 = 0; local117 < 7; local117++) {
					this.aClass1_Sub1_Sub3_2.method464(this.anIntArray40[local117]);
				}
				for (local121 = 0; local121 < 5; local121++) {
					this.aClass1_Sub1_Sub3_2.method464(this.anIntArray42[local121]);
				}
				return true;
			}
			if (local9 == 613) {
				this.aBoolean95 = !this.aBoolean95;
			}
			if (local9 >= 601 && local9 <= 612) {
				this.method149();
				if (this.aString8.length() > 0) {
					this.aClass1_Sub1_Sub3_2.method463(137);
					this.aClass1_Sub1_Sub3_2.method470(Class48.method661(this.aString8));
					this.aClass1_Sub1_Sub3_2.method464(local9 - 601);
					this.aClass1_Sub1_Sub3_2.method464(this.aBoolean95 ? 1 : 0);
				}
			}
			return false;
		} catch (@Pc(354) RuntimeException local354) {
			signlink.reporterror("67053, " + arg0 + ", " + arg1 + ", " + local354.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "g", descriptor = "(II)V")
	private void method210(@OriginalArg(1) int arg0) {
		try {
			if (!aBoolean71) {
				@Pc(22) Class1_Sub1_Sub2_Sub3 local22;
				@Pc(30) int local30;
				@Pc(38) int local38;
				@Pc(41) byte[] local41;
				@Pc(44) byte[] local44;
				@Pc(46) int local46;
				if (Class1_Sub1_Sub2_Sub1.anIntArray179[17] >= arg0) {
					local22 = Class1_Sub1_Sub2_Sub1.aClass1_Sub1_Sub2_Sub3Array5[17];
					local30 = local22.anInt670 * local22.anInt671 - 1;
					local38 = local22.anInt670 * this.anInt251 * 2;
					local41 = local22.aByteArray7;
					local44 = this.aByteArray2;
					for (local46 = 0; local46 <= local30; local46++) {
						local44[local46] = local41[local46 - local38 & local30];
					}
					local22.aByteArray7 = local44;
					this.aByteArray2 = local41;
					Class1_Sub1_Sub2_Sub1.method346(17);
				}
				if (Class1_Sub1_Sub2_Sub1.anIntArray179[24] >= arg0) {
					local22 = Class1_Sub1_Sub2_Sub1.aClass1_Sub1_Sub2_Sub3Array5[24];
					local30 = local22.anInt670 * local22.anInt671 - 1;
					local38 = local22.anInt670 * this.anInt251 * 2;
					local41 = local22.aByteArray7;
					local44 = this.aByteArray2;
					for (local46 = 0; local46 <= local30; local46++) {
						local44[local46] = local41[local46 - local38 & local30];
					}
					local22.aByteArray7 = local44;
					this.aByteArray2 = local41;
					Class1_Sub1_Sub2_Sub1.method346(24);
					return;
				}
			}
		} catch (@Pc(131) RuntimeException local131) {
			signlink.reporterror("37727, " + -14374 + ", " + arg0 + ", " + local131.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "H", descriptor = "(I)V")
	private void method211() {
		try {
			@Pc(11) int local11;
			for (@Pc(3) int local3 = -1; local3 < this.anInt273; local3++) {
				if (local3 == -1) {
					local11 = this.anInt272;
				} else {
					local11 = this.anIntArray49[local3];
				}
				@Pc(23) Class1_Sub1_Sub1_Sub1_Sub1 local23 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local11];
				if (local23 != null && local23.anInt997 > 0) {
					local23.anInt997--;
					if (local23.anInt997 == 0) {
						local23.aString31 = null;
					}
				}
			}
			for (local11 = 0; local11 < this.anInt393; local11++) {
				@Pc(54) int local54 = this.anIntArray78[local11];
				@Pc(59) Class1_Sub1_Sub1_Sub1_Sub2 local59 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local54];
				if (local59 != null && local59.anInt997 > 0) {
					local59.anInt997--;
					if (local59.anInt997 == 0) {
						local59.aString31 = null;
					}
				}
			}
		} catch (@Pc(86) RuntimeException local86) {
			signlink.reporterror("52449, " + 8 + ", " + local86.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "I", descriptor = "(I)V")
	private void method212() {
		try {
			this.aBoolean96 = true;
			for (@Pc(13) int local13 = 0; local13 < 7; local13++) {
				this.anIntArray40[local13] = -1;
				for (@Pc(22) int local22 = 0; local22 < Class23.anInt746; local22++) {
					if (!Class23.aClass23Array1[local22].aBoolean196 && Class23.aClass23Array1[local22].anInt747 == local13 + (this.aBoolean79 ? 0 : 7)) {
						this.anIntArray40[local13] = local22;
						break;
					}
				}
			}
		} catch (@Pc(59) RuntimeException local59) {
			signlink.reporterror("18551, " + -346 + ", " + local59.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!d;II)I")
	private int method213(@OriginalArg(0) Class6 arg0, @OriginalArg(1) int arg1) {
		try {
			if (arg0.anIntArrayArray7 == null || arg1 >= arg0.anIntArrayArray7.length) {
				return -2;
			}
			try {
				@Pc(20) int[] local20 = arg0.anIntArrayArray7[arg1];
				@Pc(22) int local22 = 0;
				@Pc(24) int local24 = 0;
				@Pc(26) byte local26 = 0;
				while (true) {
					@Pc(31) int local31 = local20[local24++];
					@Pc(33) int local33 = 0;
					@Pc(35) byte local35 = 0;
					if (local31 == 0) {
						return local22;
					}
					if (local31 == 1) {
						local33 = this.anIntArray61[local20[local24++]];
					}
					if (local31 == 2) {
						local33 = this.anIntArray59[local20[local24++]];
					}
					if (local31 == 3) {
						local33 = this.anIntArray52[local20[local24++]];
					}
					@Pc(82) Class6 local82;
					@Pc(87) int local87;
					@Pc(100) int local100;
					if (local31 == 4) {
						local82 = Class6.aClass6Array1[local20[local24++]];
						local87 = local20[local24++];
						if (local87 >= 0 && local87 < Class15.anInt598 && (!Class15.method358(local87).aBoolean165 || aBoolean70)) {
							for (local100 = 0; local100 < local82.anIntArray93.length; local100++) {
								if (local82.anIntArray93[local100] == local87 + 1) {
									local33 += local82.anIntArray94[local100];
								}
							}
						}
					}
					if (local31 == 5) {
						local33 = this.anIntArray72[local20[local24++]];
					}
					if (local31 == 6) {
						local33 = anIntArray51[this.anIntArray59[local20[local24++]] - 1];
					}
					if (local31 == 7) {
						local33 = this.anIntArray72[local20[local24++]] * 100 / 46875;
					}
					if (local31 == 8) {
						local33 = aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt130;
					}
					@Pc(175) int local175;
					if (local31 == 9) {
						for (local175 = 0; local175 < Class30.anInt811; local175++) {
							if (Class30.aBooleanArray9[local175]) {
								local33 += this.anIntArray59[local175];
							}
						}
					}
					if (local31 == 10) {
						local82 = Class6.aClass6Array1[local20[local24++]];
						local87 = local20[local24++] + 1;
						if (local87 >= 0 && local87 < Class15.anInt598 && (!Class15.method358(local87).aBoolean165 || aBoolean70)) {
							for (local100 = 0; local100 < local82.anIntArray93.length; local100++) {
								if (local82.anIntArray93[local100] == local87) {
									local33 = 999999999;
									break;
								}
							}
						}
					}
					if (local31 == 11) {
						local33 = this.anInt288;
					}
					if (local31 == 12) {
						local33 = this.anInt340;
					}
					if (local31 == 13) {
						local175 = this.anIntArray72[local20[local24++]];
						local87 = local20[local24++];
						local33 = (local175 & 0x1 << local87) == 0 ? 0 : 1;
					}
					if (local31 == 14) {
						local175 = local20[local24++];
						@Pc(290) Class36 local290 = Class36.aClass36Array1[local175];
						local100 = local290.anInt846;
						@Pc(296) int local296 = local290.anInt847;
						@Pc(299) int local299 = local290.anInt848;
						@Pc(305) int local305 = anIntArray87[local299 - local296];
						local33 = this.anIntArray72[local100] >> local296 & local305;
					}
					if (local31 == 15) {
						local35 = 1;
					}
					if (local31 == 16) {
						local35 = 2;
					}
					if (local31 == 17) {
						local35 = 3;
					}
					if (local31 == 18) {
						local33 = (aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt986 >> 7) + this.anInt278;
					}
					if (local31 == 19) {
						local33 = (aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt987 >> 7) + this.anInt279;
					}
					if (local31 == 20) {
						local33 = local20[local24++];
					}
					if (local35 == 0) {
						if (local26 == 0) {
							local22 += local33;
						}
						if (local26 == 1) {
							local22 -= local33;
						}
						if (local26 == 2 && local33 != 0) {
							local22 /= local33;
						}
						if (local26 == 3) {
							local22 *= local33;
						}
						local26 = 0;
					} else {
						local26 = local35;
					}
				}
			} catch (@Pc(398) Exception local398) {
				return -1;
			}
		} catch (@Pc(401) RuntimeException local401) {
			signlink.reporterror("44424, " + arg0 + ", " + arg1 + ", " + 862 + ", " + local401.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "m", descriptor = "(B)V")
	private void method214(@OriginalArg(0) byte arg0) {
		try {
			@Pc(6) boolean local6 = false;
			this.aClass35_18.method518(979);
			Class1_Sub1_Sub2_Sub1.anIntArray177 = this.anIntArray68;
			this.aClass1_Sub1_Sub2_Sub3_10.method415(0, (byte) 1, 0);
			if (this.aBoolean60) {
				this.aClass1_Sub1_Sub2_Sub4_3.method443(239, 0, this.aString14, 40);
				this.aClass1_Sub1_Sub2_Sub4_3.method443(239, 128, this.aString5 + "*", 60);
			} else if (this.aBoolean94) {
				this.aClass1_Sub1_Sub2_Sub4_3.method443(239, 0, "Enter amount:", 40);
				this.aClass1_Sub1_Sub2_Sub4_3.method443(239, 128, this.aString4 + "*", 60);
			} else if (this.aString12 != null) {
				this.aClass1_Sub1_Sub2_Sub4_3.method443(239, 0, this.aString12, 40);
				this.aClass1_Sub1_Sub2_Sub4_3.method443(239, 128, "Click to continue", 60);
			} else if (this.anInt392 != -1) {
				this.method228(Class6.aClass6Array1[this.anInt392], 0, 0, 0);
			} else if (this.anInt234 == -1) {
				@Pc(141) Class1_Sub1_Sub2_Sub4 local141 = this.aClass1_Sub1_Sub2_Sub4_2;
				@Pc(143) int local143 = 0;
				Class1_Sub1_Sub2.method433(0, 0, 463, 77, 297);
				for (@Pc(151) int local151 = 0; local151 < 100; local151++) {
					if (this.aStringArray4[local151] != null) {
						@Pc(163) int local163 = this.anIntArray63[local151];
						@Pc(172) int local172 = this.anInt339 + 70 - local143 * 14;
						@Pc(177) String local177 = this.aStringArray3[local151];
						@Pc(179) byte local179 = 0;
						if (local177 != null && local177.startsWith("@cr1@")) {
							local177 = local177.substring(5);
							local179 = 1;
						}
						if (local177 != null && local177.startsWith("@cr2@")) {
							local177 = local177.substring(5);
							local179 = 2;
						}
						if (local163 == 0) {
							if (local172 > 0 && local172 < 110) {
								local141.method447(4, this.aStringArray4[local151], local172, 0);
							}
							local143++;
						}
						@Pc(249) int local249;
						if ((local163 == 1 || local163 == 2) && (local163 == 1 || this.anInt415 == 0 || this.anInt415 == 1 && this.method103(local177))) {
							if (local172 > 0 && local172 < 110) {
								local249 = 4;
								if (local179 == 1) {
									this.aClass1_Sub1_Sub2_Sub3Array4[0].method415(4, (byte) 1, local172 - 12);
									local249 += 14;
								}
								if (local179 == 2) {
									this.aClass1_Sub1_Sub2_Sub3Array4[1].method415(local249, (byte) 1, local172 - 12);
									local249 += 14;
								}
								local141.method447(local249, local177 + ":", local172, 0);
								local249 += local141.method445(local177) + 8;
								local141.method447(local249, this.aStringArray4[local151], local172, 255);
							}
							local143++;
						}
						if ((local163 == 3 || local163 == 7) && this.anInt237 == 0 && (local163 == 7 || this.anInt355 == 0 || this.anInt355 == 1 && this.method103(local177))) {
							if (local172 > 0 && local172 < 110) {
								local141.method447(4, "From", local172, 0);
								local249 = local141.method445("From ") + 4;
								if (local179 == 1) {
									this.aClass1_Sub1_Sub2_Sub3Array4[0].method415(local249, (byte) 1, local172 - 12);
									local249 += 14;
								}
								if (local179 == 2) {
									this.aClass1_Sub1_Sub2_Sub3Array4[1].method415(local249, (byte) 1, local172 - 12);
									local249 += 14;
								}
								local141.method447(local249, local177 + ":", local172, 0);
								local249 += local141.method445(local177) + 8;
								local141.method447(local249, this.aStringArray4[local151], local172, 8388608);
							}
							local143++;
						}
						if (local163 == 4 && (this.anInt225 == 0 || this.anInt225 == 1 && this.method103(local177))) {
							if (local172 > 0 && local172 < 110) {
								local141.method447(4, local177 + " " + this.aStringArray4[local151], local172, 8388736);
							}
							local143++;
						}
						if (local163 == 5 && this.anInt237 == 0 && this.anInt355 < 2) {
							if (local172 > 0 && local172 < 110) {
								local141.method447(4, this.aStringArray4[local151], local172, 8388608);
							}
							local143++;
						}
						if (local163 == 6 && this.anInt237 == 0 && this.anInt355 < 2) {
							if (local172 > 0 && local172 < 110) {
								local141.method447(4, "To " + local177 + ":", local172, 0);
								local141.method447(local141.method445("To " + local177) + 12, this.aStringArray4[local151], local172, 8388608);
							}
							local143++;
						}
						if (local163 == 8 && (this.anInt225 == 0 || this.anInt225 == 1 && this.method103(local177))) {
							if (local172 > 0 && local172 < 110) {
								local141.method447(4, local177 + " " + this.aStringArray4[local151], local172, 8270336);
							}
							local143++;
						}
					}
				}
				Class1_Sub1_Sub2.method432();
				this.anInt330 = local143 * 14 + 7;
				if (this.anInt330 < 78) {
					this.anInt330 = 78;
				}
				this.method175(this.anInt330, 0, 463, this.anInt330 - this.anInt339 - 77, 77);
				@Pc(619) String local619;
				if (aClass1_Sub1_Sub1_Sub1_Sub1_1 == null || aClass1_Sub1_Sub1_Sub1_Sub1_1.aString3 == null) {
					local619 = Class48.method665(this.aString15);
				} else {
					local619 = aClass1_Sub1_Sub1_Sub1_Sub1_1.aString3;
				}
				local141.method447(4, local619 + ":", 90, 0);
				local141.method447(local141.method445(local619 + ": ") + 6, this.aString17 + "*", 90, 255);
				Class1_Sub1_Sub2.method439(77, 0, 479, 0);
			} else {
				this.method228(Class6.aClass6Array1[this.anInt234], 0, 0, 0);
			}
			if (this.aBoolean85 && this.anInt323 == 2) {
				this.method171();
			}
			this.aClass35_18.method519(super.aGraphics2, 17, 357);
			this.aClass35_17.method518(979);
			Class1_Sub1_Sub2_Sub1.anIntArray177 = this.anIntArray70;
		} catch (@Pc(700) RuntimeException local700) {
			signlink.reporterror("42305, " + arg0 + ", " + local700.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;Z)V")
	private void method215(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) boolean arg2) {
		signlink.errorname = arg0;
		try {
			if (!arg2) {
				this.aString6 = "";
				this.aString7 = "Connecting to server...";
				this.method145(true);
			}
			this.aClass8_1 = new Class8(this, this.method185(anInt248 + 43594), (byte) -14);
			@Pc(30) long local30 = Class48.method661(arg0);
			@Pc(37) int local37 = (int) (local30 >> 16 & 0x1FL);
			this.aClass1_Sub1_Sub3_2.anInt738 = 0;
			this.aClass1_Sub1_Sub3_2.method464(14);
			this.aClass1_Sub1_Sub3_2.method464(local37);
			this.aClass8_1.method250(this.aClass1_Sub1_Sub3_2.aByteArray9, 190, 2);
			for (@Pc(60) int local60 = 0; local60 < 8; local60++) {
				this.aClass8_1.method247();
			}
			@Pc(74) int local74 = this.aClass8_1.method247();
			@Pc(223) int local223;
			@Pc(258) int local258;
			if (local74 == 0) {
				this.aClass8_1.method249(this.aClass1_Sub1_Sub3_3.aByteArray9, 0, 8);
				this.aClass1_Sub1_Sub3_3.anInt738 = 0;
				this.aLong15 = this.aClass1_Sub1_Sub3_3.method480();
				@Pc(97) int[] local97 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (this.aLong15 >> 32), (int) this.aLong15 };
				this.aClass1_Sub1_Sub3_2.anInt738 = 0;
				this.aClass1_Sub1_Sub3_2.method464(10);
				this.aClass1_Sub1_Sub3_2.method468(local97[0]);
				this.aClass1_Sub1_Sub3_2.method468(local97[1]);
				this.aClass1_Sub1_Sub3_2.method468(local97[2]);
				this.aClass1_Sub1_Sub3_2.method468(local97[3]);
				this.aClass1_Sub1_Sub3_2.method468(signlink.anInt937);
				this.aClass1_Sub1_Sub3_2.method471(arg0);
				this.aClass1_Sub1_Sub3_2.method471(arg1);
				this.aClass1_Sub1_Sub3_2.method489(aBigInteger2, aBigInteger1);
				this.aClass1_Sub1_Sub3_4.anInt738 = 0;
				if (arg2) {
					this.aClass1_Sub1_Sub3_4.method464(18);
				} else {
					this.aClass1_Sub1_Sub3_4.method464(16);
				}
				this.aClass1_Sub1_Sub3_4.method464(this.aClass1_Sub1_Sub3_2.anInt738 + 36 + 1 + 1 + 2);
				this.aClass1_Sub1_Sub3_4.method464(255);
				this.aClass1_Sub1_Sub3_4.method465(282);
				this.aClass1_Sub1_Sub3_4.method464(aBoolean71 ? 1 : 0);
				for (local223 = 0; local223 < 9; local223++) {
					this.aClass1_Sub1_Sub3_4.method468(this.anIntArray86[local223]);
				}
				this.aClass1_Sub1_Sub3_4.method472(this.aClass1_Sub1_Sub3_2.aByteArray9, this.aClass1_Sub1_Sub3_2.anInt738);
				this.aClass1_Sub1_Sub3_2.aClass46_2 = new Class46(local97, this.anInt294);
				for (local258 = 0; local258 < 4; local258++) {
					local97[local258] += 50;
				}
				this.aClass46_1 = new Class46(local97, this.anInt294);
				this.aClass8_1.method250(this.aClass1_Sub1_Sub3_4.aByteArray9, 190, this.aClass1_Sub1_Sub3_4.anInt738);
				local74 = this.aClass8_1.method247();
			}
			if (local74 == 1) {
				try {
					Thread.sleep(2000L);
				} catch (@Pc(301) Exception local301) {
				}
				this.method215(arg0, arg1, arg2);
			} else {
				@Pc(389) int local389;
				if (local74 == 2) {
					this.anInt329 = this.aClass8_1.method247();
					aBoolean73 = this.aClass8_1.method247() == 1;
					this.aLong14 = 0L;
					this.anInt298 = 0;
					this.aClass11_1.anInt537 = 0;
					super.aBoolean57 = true;
					this.aBoolean61 = true;
					this.aBoolean90 = true;
					this.aClass1_Sub1_Sub3_2.anInt738 = 0;
					this.aClass1_Sub1_Sub3_3.anInt738 = 0;
					this.anInt302 = -1;
					this.anInt213 = -1;
					this.anInt214 = -1;
					this.anInt215 = -1;
					this.anInt301 = 0;
					this.anInt303 = 0;
					this.anInt405 = 0;
					this.anInt305 = 0;
					this.anInt297 = 0;
					this.anInt219 = 0;
					this.aBoolean85 = false;
					super.anInt192 = 0;
					for (local389 = 0; local389 < 100; local389++) {
						this.aStringArray4[local389] = null;
					}
					this.anInt318 = 0;
					this.anInt282 = 0;
					this.anInt348 = 0;
					this.anInt262 = 0;
					this.anInt222 = (int) (Math.random() * 100.0D) - 50;
					this.anInt332 = (int) (Math.random() * 110.0D) - 55;
					this.anInt342 = (int) (Math.random() * 80.0D) - 40;
					this.anInt337 = (int) (Math.random() * 120.0D) - 60;
					this.anInt260 = (int) (Math.random() * 30.0D) - 20;
					this.anInt384 = (int) (Math.random() * 20.0D) - 10 & 0x7FF;
					this.anInt267 = 0;
					this.anInt206 = -1;
					this.anInt229 = 0;
					this.anInt230 = 0;
					this.anInt273 = 0;
					this.anInt393 = 0;
					for (local223 = 0; local223 < this.anInt271; local223++) {
						this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local223] = null;
						this.aClass1_Sub1_Sub3Array1[local223] = null;
					}
					for (local258 = 0; local258 < 16384; local258++) {
						this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local258] = null;
					}
					aClass1_Sub1_Sub1_Sub1_Sub1_1 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[this.anInt272] = new Class1_Sub1_Sub1_Sub1_Sub1();
					this.aClass29_2.method509();
					this.aClass29_1.method509();
					@Pc(534) int local534;
					@Pc(538) int local538;
					for (@Pc(530) int local530 = 0; local530 < 4; local530++) {
						for (local534 = 0; local534 < 104; local534++) {
							for (local538 = 0; local538 < 104; local538++) {
								this.aClass29ArrayArrayArray1[local530][local534][local538] = null;
							}
						}
					}
					this.aClass29_3 = new Class29(false);
					this.anInt218 = 0;
					this.anInt217 = 0;
					this.anInt234 = -1;
					this.anInt392 = -1;
					this.anInt396 = -1;
					this.anInt390 = -1;
					this.anInt295 = -1;
					this.aBoolean84 = false;
					this.anInt317 = 3;
					this.aBoolean94 = false;
					this.aBoolean85 = false;
					this.aBoolean60 = false;
					this.aString12 = null;
					this.anInt275 = 0;
					this.anInt286 = -1;
					this.aBoolean79 = true;
					this.method212();
					for (local534 = 0; local534 < 5; local534++) {
						this.anIntArray42[local534] = 0;
					}
					for (local538 = 0; local538 < 5; local538++) {
						this.aStringArray6[local538] = null;
						this.aBooleanArray3[local538] = false;
					}
					anInt231 = 0;
					anInt313 = 0;
					anInt208 = 0;
					anInt361 = 0;
					anInt228 = 0;
					anInt289 = 0;
					anInt209 = 0;
					anInt276 = 0;
					anInt221 = 0;
					this.method151((byte) 9);
				} else if (local74 == 3) {
					this.aString6 = "";
					this.aString7 = "Invalid username or password.";
				} else if (local74 == 4) {
					this.aString6 = "Your account has been disabled.";
					this.aString7 = "Please check your message-centre for details.";
				} else if (local74 == 5) {
					this.aString6 = "Your account is already logged in.";
					this.aString7 = "Try again in 60 secs...";
				} else if (local74 == 6) {
					this.aString6 = "RuneScape has been updated!";
					this.aString7 = "Please reload this page.";
				} else if (local74 == 7) {
					this.aString6 = "This world is full.";
					this.aString7 = "Please use a different world.";
				} else if (local74 == 8) {
					this.aString6 = "Unable to connect.";
					this.aString7 = "Login server offline.";
				} else if (local74 == 9) {
					this.aString6 = "Login limit exceeded.";
					this.aString7 = "Too many connections from your address.";
				} else if (local74 == 10) {
					this.aString6 = "Unable to connect.";
					this.aString7 = "Bad session id.";
				} else if (local74 == 11) {
					this.aString7 = "Login server rejected session.";
					this.aString7 = "Please try again.";
				} else if (local74 == 12) {
					this.aString6 = "You need a members account to login to this world.";
					this.aString7 = "Please subscribe, or use a different world.";
				} else if (local74 == 13) {
					this.aString6 = "Could not complete login.";
					this.aString7 = "Please try using a different world.";
				} else if (local74 == 14) {
					this.aString6 = "The server is being updated.";
					this.aString7 = "Please wait 1 minute and try again.";
				} else if (local74 == 15) {
					this.aBoolean90 = true;
					this.aClass1_Sub1_Sub3_2.anInt738 = 0;
					this.aClass1_Sub1_Sub3_3.anInt738 = 0;
					this.anInt302 = -1;
					this.anInt213 = -1;
					this.anInt214 = -1;
					this.anInt215 = -1;
					this.anInt301 = 0;
					this.anInt303 = 0;
					this.anInt405 = 0;
					this.anInt219 = 0;
					this.aBoolean85 = false;
					this.aLong17 = System.currentTimeMillis();
				} else if (local74 == 16) {
					this.aString6 = "Login attempts exceeded.";
					this.aString7 = "Please wait 1 minute and try again.";
				} else if (local74 == 17) {
					this.aString6 = "You are standing in a members-only area.";
					this.aString7 = "To play on this world move to a free area first";
				} else if (local74 == 20) {
					this.aString6 = "Invalid loginserver requested";
					this.aString7 = "Please try using a different world.";
				} else if (local74 == 21) {
					for (local389 = this.aClass8_1.method247(); local389 >= 0; local389--) {
						this.aString6 = "You have only just left another world";
						this.aString7 = "Your profile will be transferred in: " + local389 + " seconds";
						this.method145(true);
						try {
							Thread.sleep(1000L);
						} catch (@Pc(899) Exception local899) {
						}
					}
					this.method215(arg0, arg1, arg2);
				} else if (local74 == -1) {
					this.aString6 = "No response from server";
					this.aString7 = "Please try using a different world.";
				} else {
					System.out.println("response:" + local74);
					this.aString6 = "Unexpected server response";
					this.aString7 = "Please try using a different world.";
				}
			}
		} catch (@Pc(935) IOException local935) {
			this.aString6 = "";
			this.aString7 = "Error connecting to server.";
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(JI)V")
	private void method216(@OriginalArg(0) long arg0) {
		try {
			if (arg0 != 0L) {
				if (this.anInt252 >= 100) {
					this.method217(this.aByte2, "", "Your ignore list is full. Max of 100 hit", 0);
				} else {
					@Pc(24) String local24 = Class48.method665(Class48.method662(arg0));
					for (@Pc(29) int local29 = 0; local29 < this.anInt252; local29++) {
						if (this.aLongArray4[local29] == arg0) {
							this.method217(this.aByte2, "", local24 + " is already on your ignore list", 0);
							return;
						}
					}
					for (@Pc(60) int local60 = 0; local60 < this.anInt217; local60++) {
						if (this.aLongArray3[local60] == arg0) {
							this.method217(this.aByte2, "", "Please remove " + local24 + " from your friend list first", 0);
							return;
						}
					}
					this.aLongArray4[this.anInt252++] = arg0;
					this.aBoolean88 = true;
					this.aClass1_Sub1_Sub3_2.method463(255);
					this.aClass1_Sub1_Sub3_2.method470(arg0);
				}
			}
		} catch (@Pc(116) RuntimeException local116) {
			signlink.reporterror("48195, " + arg0 + ", " + -589 + ", " + local116.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(BLjava/lang/String;Ljava/lang/String;I)V")
	private void method217(@OriginalArg(0) byte arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3) {
		try {
			if (arg0 == 4) {
				if (arg3 == 0 && this.anInt234 != -1) {
					this.aString12 = arg2;
					super.anInt199 = 0;
				}
				if (this.anInt392 == -1) {
					this.aBoolean75 = true;
				}
				for (@Pc(24) int local24 = 99; local24 > 0; local24--) {
					this.anIntArray63[local24] = this.anIntArray63[local24 - 1];
					this.aStringArray3[local24] = this.aStringArray3[local24 - 1];
					this.aStringArray4[local24] = this.aStringArray4[local24 - 1];
				}
				this.anIntArray63[0] = arg3;
				this.aStringArray3[0] = arg1;
				this.aStringArray4[0] = arg2;
			}
		} catch (@Pc(76) RuntimeException local76) {
			signlink.reporterror("22932, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local76.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "J", descriptor = "(I)V")
	private void method218() {
		try {
			if (this.anInt405 > 1) {
				this.anInt405--;
			}
			if (this.anInt305 > 0) {
				this.anInt305--;
			}
			for (@Pc(22) int local22 = 0; local22 < 5 && this.method170(); local22++) {
			}
			if (this.aBoolean90) {
				@Pc(41) Object local41 = this.aClass11_1.anObject1;
				@Pc(66) int local66;
				@Pc(68) int local68;
				@Pc(70) int local70;
				@Pc(103) int local103;
				synchronized (this.aClass11_1.anObject1) {
					if (!aBoolean73) {
						this.aClass11_1.anInt537 = 0;
					} else if (super.anInt199 != 0 || this.aClass11_1.anInt537 >= 40) {
						this.aClass1_Sub1_Sub3_2.method463(222);
						this.aClass1_Sub1_Sub3_2.method464(0);
						local66 = this.aClass1_Sub1_Sub3_2.anInt738;
						local68 = 0;
						@Pc(86) int local86;
						for (local70 = 0; local70 < this.aClass11_1.anInt537 && local66 - this.aClass1_Sub1_Sub3_2.anInt738 < 240; local70++) {
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
							if (local103 != this.anInt410 || local86 != this.anInt411) {
								@Pc(165) int local165 = local103 - this.anInt410;
								this.anInt410 = local103;
								@Pc(173) int local173 = local86 - this.anInt411;
								this.anInt411 = local86;
								if (this.anInt298 < 8 && local165 >= -32 && local165 <= 31 && local173 >= -32 && local173 <= 31) {
									local165 += 32;
									local173 += 32;
									this.aClass1_Sub1_Sub3_2.method465((this.anInt298 << 12) + (local165 << 6) + local173);
									this.anInt298 = 0;
								} else if (this.anInt298 < 8) {
									this.aClass1_Sub1_Sub3_2.method467((this.anInt298 << 19) + local120 + 8388608);
									this.anInt298 = 0;
								} else {
									this.aClass1_Sub1_Sub3_2.method468((this.anInt298 << 19) + local120 - 1073741824);
									this.anInt298 = 0;
								}
							} else if (this.anInt298 < 2047) {
								this.anInt298++;
							}
						}
						this.aClass1_Sub1_Sub3_2.method473(this.aClass1_Sub1_Sub3_2.anInt738 - local66);
						if (local68 >= this.aClass11_1.anInt537) {
							this.aClass11_1.anInt537 = 0;
						} else {
							this.aClass11_1.anInt537 -= local68;
							for (local86 = 0; local86 < this.aClass11_1.anInt537; local86++) {
								this.aClass11_1.anIntArray160[local86] = this.aClass11_1.anIntArray160[local86 + local68];
								this.aClass11_1.anIntArray161[local86] = this.aClass11_1.anIntArray161[local86 + local68];
							}
						}
					}
				}
				if (super.anInt199 != 0) {
					@Pc(336) long local336 = (super.aLong13 - this.aLong14) / 50L;
					if (local336 > 4095L) {
						local336 = 4095L;
					}
					this.aLong14 = super.aLong13;
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
					this.aClass1_Sub1_Sub3_2.method463(20);
					this.aClass1_Sub1_Sub3_2.method468((local103 << 20) + (local382 << 19) + local70);
				}
				if (this.anInt292 > 0) {
					this.anInt292--;
				}
				if (super.anIntArray29[1] == 1 || super.anIntArray29[2] == 1 || super.anIntArray29[3] == 1 || super.anIntArray29[4] == 1) {
					this.aBoolean76 = true;
				}
				if (this.aBoolean76 && this.anInt292 <= 0) {
					this.anInt292 = 20;
					this.aBoolean76 = false;
					this.aClass1_Sub1_Sub3_2.method463(53);
					this.aClass1_Sub1_Sub3_2.method465(this.anInt383);
					this.aClass1_Sub1_Sub3_2.method465(this.anInt384);
				}
				if (super.aBoolean57 && !this.aBoolean61) {
					this.aBoolean61 = true;
					this.aClass1_Sub1_Sub3_2.method463(73);
					this.aClass1_Sub1_Sub3_2.method464(1);
				}
				if (!super.aBoolean57 && this.aBoolean61) {
					this.aBoolean61 = false;
					this.aClass1_Sub1_Sub3_2.method463(73);
					this.aClass1_Sub1_Sub3_2.method464(0);
				}
				this.method142();
				this.method166();
				this.method140();
				this.anInt303++;
				if (this.anInt303 > 750) {
					this.method183();
				}
				this.method114(759);
				this.method122();
				this.method211();
				this.anInt251++;
				if (this.anInt258 != 0) {
					this.anInt257 += 20;
					if (this.anInt257 >= 400) {
						this.anInt258 = 0;
					}
				}
				if (this.anInt400 != 0) {
					this.anInt397++;
					if (this.anInt397 >= 15) {
						if (this.anInt400 == 2) {
							this.aBoolean88 = true;
						}
						if (this.anInt400 == 3) {
							this.aBoolean75 = true;
						}
						this.anInt400 = 0;
					}
				}
				if (this.anInt358 != 0) {
					this.anInt371++;
					if (super.anInt194 > this.anInt359 + 5 || super.anInt194 < this.anInt359 - 5 || super.anInt195 > this.anInt360 + 5 || super.anInt195 < this.anInt360 - 5) {
						this.aBoolean82 = true;
					}
					if (super.anInt193 == 0) {
						if (this.anInt358 == 2) {
							this.aBoolean88 = true;
						}
						if (this.anInt358 == 3) {
							this.aBoolean75 = true;
						}
						this.anInt358 = 0;
						if (this.aBoolean82 && this.anInt371 >= 5) {
							this.anInt368 = -1;
							this.method172();
							if (this.anInt368 == this.anInt356 && this.anInt367 != this.anInt357) {
								@Pc(682) Class6 local682 = Class6.aClass6Array1[this.anInt356];
								@Pc(684) byte local684 = 0;
								if (this.anInt315 == 1 && local682.anInt424 == 206) {
									local684 = 1;
								}
								if (local682.anIntArray93[this.anInt367] <= 0) {
									local684 = 0;
								}
								if (local682.aBoolean104) {
									local66 = this.anInt357;
									local68 = this.anInt367;
									local682.anIntArray93[local68] = local682.anIntArray93[local66];
									local682.anIntArray94[local68] = local682.anIntArray94[local66];
									local682.anIntArray93[local66] = -1;
									local682.anIntArray94[local66] = 0;
								} else if (local684 == 1) {
									local66 = this.anInt357;
									local68 = this.anInt367;
									while (local66 != local68) {
										if (local66 > local68) {
											local682.method231(local66, local66 - 1, this.anInt236);
											local66--;
										} else if (local66 < local68) {
											local682.method231(local66, local66 + 1, this.anInt236);
											local66++;
										}
									}
								} else {
									local682.method231(this.anInt357, this.anInt367, this.anInt236);
								}
								this.aClass1_Sub1_Sub3_2.method463(93);
								this.aClass1_Sub1_Sub3_2.method465(this.anInt356);
								this.aClass1_Sub1_Sub3_2.method465(this.anInt357);
								this.aClass1_Sub1_Sub3_2.method465(this.anInt367);
								this.aClass1_Sub1_Sub3_2.method464(local684);
							}
						} else if ((this.anInt381 == 1 || this.method169(this.anInt219 - 1)) && this.anInt219 > 2) {
							this.method227();
						} else if (this.anInt219 > 0) {
							this.method219(this.anInt219 - 1);
						}
						this.anInt397 = 10;
						super.anInt199 = 0;
					}
				}
				anInt239++;
				if (anInt239 > 62) {
					anInt239 = 0;
					this.aClass1_Sub1_Sub3_2.method463(89);
				}
				@Pc(871) int local871;
				@Pc(873) int local873;
				if (Class37.anInt877 != -1) {
					local871 = Class37.anInt877;
					local873 = Class37.anInt878;
					@Pc(894) boolean local894 = this.method181(true, 0, aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray270[0], 0, aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray269[0], 0, local871, 0, local873, 0, 0);
					Class37.anInt877 = -1;
					if (local894) {
						this.anInt255 = super.anInt200;
						this.anInt256 = super.anInt201;
						this.anInt258 = 1;
						this.anInt257 = 0;
					}
				}
				if (super.anInt199 == 1 && this.aString12 != null) {
					this.aString12 = null;
					this.aBoolean75 = true;
					super.anInt199 = 0;
				}
				this.method161();
				this.method99();
				this.method223(this.anInt351);
				this.method160();
				if (super.anInt193 == 1 || super.anInt199 == 1) {
					this.anInt347++;
				}
				if (this.anInt348 == 2) {
					this.method117();
				}
				if (this.anInt348 == 2 && this.aBoolean74) {
					this.method191();
				}
				for (local871 = 0; local871 < 5; local871++) {
					@Pc(981) int local981 = this.anIntArray66[local871]++;
				}
				this.method100();
				super.anInt192++;
				if (super.anInt192 > 4500) {
					this.anInt305 = 250;
					super.anInt192 -= 500;
					this.aClass1_Sub1_Sub3_2.method463(209);
				}
				this.anInt207++;
				if (this.anInt207 > 500) {
					this.anInt207 = 0;
					local873 = (int) (Math.random() * 8.0D);
					if ((local873 & 0x1) == 1) {
						this.anInt222 += this.anInt223;
					}
					if ((local873 & 0x2) == 2) {
						this.anInt332 += this.anInt333;
					}
					if ((local873 & 0x4) == 4) {
						this.anInt342 += this.anInt343;
					}
				}
				if (this.anInt222 < -50) {
					this.anInt223 = 2;
				}
				if (this.anInt222 > 50) {
					this.anInt223 = -2;
				}
				if (this.anInt332 < -55) {
					this.anInt333 = 2;
				}
				if (this.anInt332 > 55) {
					this.anInt333 = -2;
				}
				if (this.anInt342 < -40) {
					this.anInt343 = 1;
				}
				if (this.anInt342 > 40) {
					this.anInt343 = -1;
				}
				this.anInt353++;
				if (this.anInt353 > 500) {
					this.anInt353 = 0;
					local873 = (int) (Math.random() * 8.0D);
					if ((local873 & 0x1) == 1) {
						this.anInt337 += this.anInt338;
					}
					if ((local873 & 0x2) == 2) {
						this.anInt260 += this.anInt261;
					}
				}
				if (this.anInt337 < -60) {
					this.anInt338 = 2;
				}
				if (this.anInt337 > 60) {
					this.anInt338 = -2;
				}
				if (this.anInt260 < -20) {
					this.anInt261 = 1;
				}
				if (this.anInt260 > 10) {
					this.anInt261 = -1;
				}
				this.anInt304++;
				if (this.anInt304 > 50) {
					this.aClass1_Sub1_Sub3_2.method463(120);
				}
				try {
					if (this.aClass8_1 != null && this.aClass1_Sub1_Sub3_2.anInt738 > 0) {
						this.aClass8_1.method250(this.aClass1_Sub1_Sub3_2.aByteArray9, 190, this.aClass1_Sub1_Sub3_2.anInt738);
						this.aClass1_Sub1_Sub3_2.anInt738 = 0;
						this.anInt304 = 0;
					}
				} catch (@Pc(1231) IOException local1231) {
					this.method183();
				} catch (@Pc(1236) Exception local1236) {
					this.method152(184);
				}
			}
		} catch (@Pc(1241) RuntimeException local1241) {
			signlink.reporterror("62678, " + 7 + ", " + local1241.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(IZ)V")
	private void method219(@OriginalArg(0) int arg0) {
		try {
			if (arg0 >= 0) {
				if (this.aBoolean94) {
					this.aBoolean94 = false;
					this.aBoolean75 = true;
				}
				@Pc(23) int local23 = this.anIntArray79[arg0];
				@Pc(28) int local28 = this.anIntArray80[arg0];
				@Pc(33) int local33 = this.anIntArray81[arg0];
				@Pc(38) int local38 = this.anIntArray82[arg0];
				if (local33 >= 2000) {
					local33 -= 2000;
				}
				@Pc(63) String local63;
				if (local33 == 1381) {
					@Pc(51) int local51 = local38 >> 14 & 0x7FFF;
					@Pc(54) Class9 local54 = Class9.method287(local51);
					if (local54.aByteArray4 == null) {
						local63 = "It's a " + local54.aString23 + ".";
					} else {
						local63 = new String(local54.aByteArray4);
					}
					this.method217(this.aByte2, "", local63, 0);
				}
				@Pc(107) boolean local107;
				if (local33 == 111) {
					local107 = this.method181(false, 0, aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray270[0], 0, aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray269[0], 0, local23, 0, local28, 0, 2);
					if (!local107) {
						this.method181(false, 0, aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray270[0], 1, aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray269[0], 0, local23, 1, local28, 0, 2);
					}
					this.anInt255 = super.anInt200;
					this.anInt256 = super.anInt201;
					this.anInt258 = 2;
					this.anInt257 = 0;
					this.aClass1_Sub1_Sub3_2.method463(39);
					this.aClass1_Sub1_Sub3_2.method465(local23 + this.anInt278);
					this.aClass1_Sub1_Sub3_2.method465(local28 + this.anInt279);
					this.aClass1_Sub1_Sub3_2.method465(local38);
					this.aClass1_Sub1_Sub3_2.method465(this.anInt321);
					this.aClass1_Sub1_Sub3_2.method465(this.anInt319);
					this.aClass1_Sub1_Sub3_2.method465(this.anInt320);
				}
				if (local33 == 718) {
					if (this.aBoolean85) {
						this.aClass37_1.method562(local28 - 4, local23 - 4);
					} else {
						this.aClass37_1.method562(super.anInt201 - 4, super.anInt200 - 4);
					}
				}
				@Pc(248) int local248;
				@Pc(223) String local223;
				@Pc(227) int local227;
				if (local33 == 507 || local33 == 957) {
					local223 = this.aStringArray2[arg0];
					local227 = local223.indexOf("@whi@");
					if (local227 != -1) {
						local223 = local223.substring(local227 + 5).trim();
						local63 = Class48.method665(Class48.method662(Class48.method661(local223)));
						@Pc(246) boolean local246 = false;
						for (local248 = 0; local248 < this.anInt273; local248++) {
							@Pc(258) Class1_Sub1_Sub1_Sub1_Sub1 local258 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[this.anIntArray49[local248]];
							if (local258 != null && local258.aString3 != null && local258.aString3.equalsIgnoreCase(local63)) {
								this.method181(false, 0, aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray270[0], 1, aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray269[0], 0, local258.anIntArray269[0], 1, local258.anIntArray270[0], 0, 2);
								if (local33 == 507) {
									anInt228 += local38;
									if (anInt228 >= 66) {
										this.aClass1_Sub1_Sub3_2.method463(235);
										this.aClass1_Sub1_Sub3_2.method464(154);
									}
									this.aClass1_Sub1_Sub3_2.method463(98);
								}
								if (local33 == 957) {
									anInt361++;
									if (anInt361 >= 52) {
										this.aClass1_Sub1_Sub3_2.method463(80);
										this.aClass1_Sub1_Sub3_2.method464(131);
									}
									this.aClass1_Sub1_Sub3_2.method463(109);
								}
								this.aClass1_Sub1_Sub3_2.method465(this.anIntArray49[local248]);
								local246 = true;
								break;
							}
						}
						if (!local246) {
							this.method217(this.aByte2, "", "Unable to find " + local63, 0);
						}
					}
				}
				if (local33 == 899 && this.method148(213, local23, local38, local28)) {
					this.aClass1_Sub1_Sub3_2.method465(this.anInt283);
				}
				@Pc(398) Class1_Sub1_Sub1_Sub1_Sub2 local398;
				@Pc(411) String local411;
				if (local33 == 1714) {
					local398 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local38];
					if (local398 != null) {
						if (local398.aClass13_2.aByteArray5 == null) {
							local411 = "It's a " + local398.aClass13_2.aString24 + ".";
						} else {
							local411 = new String(local398.aClass13_2.aByteArray5);
						}
						this.method217(this.aByte2, "", local411, 0);
					}
				}
				@Pc(448) Class6 local448;
				if (local33 == 435) {
					this.aClass1_Sub1_Sub3_2.method463(9);
					this.aClass1_Sub1_Sub3_2.method465(local28);
					local448 = Class6.aClass6Array1[local28];
					if (local448.anIntArrayArray7 != null && local448.anIntArrayArray7[0][0] == 5) {
						local227 = local448.anIntArrayArray7[0][1];
						this.anIntArray72[local227] = 1 - this.anIntArray72[local227];
						this.method110(local227);
						this.aBoolean88 = true;
					}
				}
				if (local33 == 225) {
					this.aClass1_Sub1_Sub3_2.method463(9);
					this.aClass1_Sub1_Sub3_2.method465(local28);
					local448 = Class6.aClass6Array1[local28];
					if (local448.anIntArrayArray7 != null && local448.anIntArrayArray7[0][0] == 5) {
						local227 = local448.anIntArrayArray7[0][1];
						if (this.anIntArray72[local227] != local448.anIntArray96[0]) {
							this.anIntArray72[local227] = local448.anIntArray96[0];
							this.method110(local227);
							this.aBoolean88 = true;
						}
					}
				}
				if (local33 == 582 || local33 == 113 || local33 == 555 || local33 == 331 || local33 == 354) {
					if (local33 == 113) {
						this.aClass1_Sub1_Sub3_2.method463(82);
					}
					if (local33 == 331) {
						this.aClass1_Sub1_Sub3_2.method463(179);
					}
					if (local33 == 354) {
						this.aClass1_Sub1_Sub3_2.method463(46);
					}
					if (local33 == 582) {
						if ((local38 & 0x3) == 0) {
							anInt289++;
						}
						if (anInt289 >= 133) {
							this.aClass1_Sub1_Sub3_2.method463(250);
							this.aClass1_Sub1_Sub3_2.method465(6118);
						}
						this.aClass1_Sub1_Sub3_2.method463(74);
					}
					if (local33 == 555) {
						this.aClass1_Sub1_Sub3_2.method463(239);
					}
					this.aClass1_Sub1_Sub3_2.method465(local38);
					this.aClass1_Sub1_Sub3_2.method465(local23);
					this.aClass1_Sub1_Sub3_2.method465(local28);
					this.anInt397 = 0;
					this.anInt398 = local28;
					this.anInt399 = local23;
					this.anInt400 = 2;
					if (Class6.aClass6Array1[local28].anInt421 == this.anInt396) {
						this.anInt400 = 1;
					}
					if (Class6.aClass6Array1[local28].anInt421 == this.anInt392) {
						this.anInt400 = 3;
					}
				}
				if (local33 == 357) {
					this.method148(157, local23, local38, local28);
				}
				@Pc(677) Class15 local677;
				if (local33 == 1152) {
					local677 = Class15.method358(local38);
					if (local677.aByteArray6 == null) {
						local411 = "It's a " + local677.aString25 + ".";
					} else {
						local411 = new String(local677.aByteArray6);
					}
					this.method217(this.aByte2, "", local411, 0);
				}
				if (local33 == 139 || local33 == 778 || local33 == 617 || local33 == 224 || local33 == 662) {
					local107 = this.method181(false, 0, aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray270[0], 0, aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray269[0], 0, local23, 0, local28, 0, 2);
					if (!local107) {
						this.method181(false, 0, aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray270[0], 1, aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray269[0], 0, local23, 1, local28, 0, 2);
					}
					this.anInt255 = super.anInt200;
					this.anInt256 = super.anInt201;
					this.anInt258 = 2;
					this.anInt257 = 0;
					if (local33 == 617) {
						this.aClass1_Sub1_Sub3_2.method463(108);
					}
					if (local33 == 224) {
						anInt276 += local28;
						if (anInt276 >= 75) {
							this.aClass1_Sub1_Sub3_2.method463(0);
							this.aClass1_Sub1_Sub3_2.method464(19);
						}
						this.aClass1_Sub1_Sub3_2.method463(62);
					}
					if (local33 == 139) {
						if ((local23 & 0x3) == 0) {
							anInt209++;
						}
						if (anInt209 >= 123) {
							this.aClass1_Sub1_Sub3_2.method463(25);
							this.aClass1_Sub1_Sub3_2.method468(0);
						}
						this.aClass1_Sub1_Sub3_2.method463(247);
					}
					if (local33 == 778) {
						this.aClass1_Sub1_Sub3_2.method463(169);
					}
					if (local33 == 662) {
						anInt208 += this.anInt279;
						if (anInt208 >= 118) {
							this.aClass1_Sub1_Sub3_2.method463(41);
							this.aClass1_Sub1_Sub3_2.method468(0);
						}
						this.aClass1_Sub1_Sub3_2.method463(117);
					}
					this.aClass1_Sub1_Sub3_2.method465(local23 + this.anInt278);
					this.aClass1_Sub1_Sub3_2.method465(local28 + this.anInt279);
					this.aClass1_Sub1_Sub3_2.method465(local38);
				}
				@Pc(910) Class1_Sub1_Sub1_Sub1_Sub1 local910;
				if (local33 == 639 || local33 == 499 || local33 == 27 || local33 == 387 || local33 == 185) {
					local910 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local38];
					if (local910 != null) {
						this.method181(false, 0, aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray270[0], 1, aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray269[0], 0, local910.anIntArray269[0], 1, local910.anIntArray270[0], 0, 2);
						this.anInt255 = super.anInt200;
						this.anInt256 = super.anInt201;
						this.anInt258 = 2;
						this.anInt257 = 0;
						if (local33 == 499) {
							this.aClass1_Sub1_Sub3_2.method463(166);
						}
						if (local33 == 185) {
							this.aClass1_Sub1_Sub3_2.method463(174);
						}
						if (local33 == 27) {
							this.aClass1_Sub1_Sub3_2.method463(196);
						}
						if (local33 == 387) {
							anInt228 += local38;
							if (anInt228 >= 66) {
								this.aClass1_Sub1_Sub3_2.method463(235);
								this.aClass1_Sub1_Sub3_2.method464(154);
							}
							this.aClass1_Sub1_Sub3_2.method463(98);
						}
						if (local33 == 639) {
							anInt361++;
							if (anInt361 >= 52) {
								this.aClass1_Sub1_Sub3_2.method463(80);
								this.aClass1_Sub1_Sub3_2.method464(131);
							}
							this.aClass1_Sub1_Sub3_2.method463(109);
						}
						this.aClass1_Sub1_Sub3_2.method465(local38);
					}
				}
				if (local33 == 625) {
					this.method148(215, local23, local38, local28);
				}
				if (local33 == 810 && this.method148(60, local23, local38, local28)) {
					this.aClass1_Sub1_Sub3_2.method465(this.anInt321);
					this.aClass1_Sub1_Sub3_2.method465(this.anInt319);
					this.aClass1_Sub1_Sub3_2.method465(this.anInt320);
				}
				if (local33 == 274) {
					local448 = Class6.aClass6Array1[local28];
					this.anInt282 = 1;
					this.anInt283 = local28;
					this.anInt284 = local448.anInt448;
					this.anInt318 = 0;
					this.aBoolean88 = true;
					local411 = local448.aString20;
					if (local411.indexOf(" ") != -1) {
						local411 = local411.substring(0, local411.indexOf(" "));
					}
					local63 = local448.aString20;
					if (local63.indexOf(" ") != -1) {
						local63 = local63.substring(local63.indexOf(" ") + 1);
					}
					this.aString9 = local411 + " " + local448.aString21 + " " + local63;
					if (this.anInt284 == 16) {
						this.aBoolean88 = true;
						this.anInt317 = 3;
						this.aBoolean68 = true;
					}
				} else {
					if (local33 == 997 && !this.aBoolean84) {
						this.aClass1_Sub1_Sub3_2.method463(72);
						this.aClass1_Sub1_Sub3_2.method465(local28);
						this.aBoolean84 = true;
					}
					if (local33 == 829) {
						local398 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local38];
						if (local398 != null) {
							this.method181(false, 0, aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray270[0], 1, aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray269[0], 0, local398.anIntArray269[0], 1, local398.anIntArray270[0], 0, 2);
							this.anInt255 = super.anInt200;
							this.anInt256 = super.anInt201;
							this.anInt258 = 2;
							this.anInt257 = 0;
							this.aClass1_Sub1_Sub3_2.method463(150);
							this.aClass1_Sub1_Sub3_2.method465(local38);
							this.aClass1_Sub1_Sub3_2.method465(this.anInt321);
							this.aClass1_Sub1_Sub3_2.method465(this.anInt319);
							this.aClass1_Sub1_Sub3_2.method465(this.anInt320);
						}
					}
					if (local33 == 1328) {
						local677 = Class15.method358(local38);
						@Pc(1254) Class6 local1254 = Class6.aClass6Array1[local28];
						if (local1254 != null && local1254.anIntArray94[local23] >= 100000) {
							local411 = local1254.anIntArray94[local23] + " x " + local677.aString25;
						} else if (local677.aByteArray6 == null) {
							local411 = "It's a " + local677.aString25 + ".";
						} else {
							local411 = new String(local677.aByteArray6);
						}
						this.method217(this.aByte2, "", local411, 0);
					}
					@Pc(1331) long local1331;
					if (local33 == 902) {
						local223 = this.aStringArray2[arg0];
						local227 = local223.indexOf("@whi@");
						if (local227 != -1) {
							local1331 = Class48.method661(local223.substring(local227 + 5).trim());
							local248 = -1;
							for (@Pc(1335) int local1335 = 0; local1335 < this.anInt217; local1335++) {
								if (this.aLongArray3[local1335] == local1331) {
									local248 = local1335;
									break;
								}
							}
							if (local248 != -1 && this.anIntArray89[local248] > 0) {
								this.aBoolean75 = true;
								this.aBoolean94 = false;
								this.aBoolean60 = true;
								this.aString5 = "";
								this.anInt238 = 3;
								this.aLong16 = this.aLongArray3[local248];
								this.aString14 = "Enter message to send to " + this.aStringArray5[local248];
							}
						}
					}
					if (local33 == 743) {
						anInt313++;
						if (anInt313 >= 124) {
							this.aClass1_Sub1_Sub3_2.method463(201);
							this.aClass1_Sub1_Sub3_2.method465(37954);
						}
						this.method148(187, local23, local38, local28);
					}
					if (local33 == 524) {
						local223 = this.aStringArray2[arg0];
						local227 = local223.indexOf("@whi@");
						if (local227 != -1) {
							if (this.anInt396 == -1) {
								this.method149();
								this.aString8 = local223.substring(local227 + 5).trim();
								this.aBoolean95 = false;
								for (@Pc(1456) int local1456 = 0; local1456 < Class6.aClass6Array1.length; local1456++) {
									if (Class6.aClass6Array1[local1456] != null && Class6.aClass6Array1[local1456].anInt424 == 600) {
										this.anInt404 = this.anInt396 = Class6.aClass6Array1[local1456].anInt421;
										break;
									}
								}
							} else {
								this.method217(this.aByte2, "", "Please close the interface you have open before using 'report abuse'", 0);
							}
						}
					}
					if (local33 == 605 || local33 == 47 || local33 == 513 || local33 == 884) {
						local223 = this.aStringArray2[arg0];
						local227 = local223.indexOf("@whi@");
						if (local227 != -1) {
							local1331 = Class48.method661(local223.substring(local227 + 5).trim());
							if (local33 == 605) {
								this.method116(local1331);
							}
							if (local33 == 47) {
								this.method216(local1331);
							}
							if (local33 == 513) {
								this.method121(local1331);
							}
							if (local33 == 884) {
								this.method204(local1331);
							}
						}
					}
					if (local33 == 398) {
						this.aClass1_Sub1_Sub3_2.method463(136);
						this.aClass1_Sub1_Sub3_2.method465(local38);
						this.aClass1_Sub1_Sub3_2.method465(local23);
						this.aClass1_Sub1_Sub3_2.method465(local28);
						this.aClass1_Sub1_Sub3_2.method465(this.anInt321);
						this.aClass1_Sub1_Sub3_2.method465(this.anInt319);
						this.aClass1_Sub1_Sub3_2.method465(this.anInt320);
						this.anInt397 = 0;
						this.anInt398 = local28;
						this.anInt399 = local23;
						this.anInt400 = 2;
						if (Class6.aClass6Array1[local28].anInt421 == this.anInt396) {
							this.anInt400 = 1;
						}
						if (Class6.aClass6Array1[local28].anInt421 == this.anInt392) {
							this.anInt400 = 3;
						}
					}
					if (local33 == 231) {
						local448 = Class6.aClass6Array1[local28];
						@Pc(1629) boolean local1629 = true;
						if (local448.anInt424 > 0) {
							local1629 = this.method208(local448, this.anInt270);
						}
						if (local1629) {
							this.aClass1_Sub1_Sub3_2.method463(9);
							this.aClass1_Sub1_Sub3_2.method465(local28);
						}
					}
					if (local33 == 242 || local33 == 209 || local33 == 309 || local33 == 852 || local33 == 793) {
						local398 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local38];
						if (local398 != null) {
							this.method181(false, 0, aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray270[0], 1, aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray269[0], 0, local398.anIntArray269[0], 1, local398.anIntArray270[0], 0, 2);
							this.anInt255 = super.anInt200;
							this.anInt256 = super.anInt201;
							this.anInt258 = 2;
							this.anInt257 = 0;
							if (local33 == 242) {
								this.aClass1_Sub1_Sub3_2.method463(236);
							}
							if (local33 == 793) {
								this.aClass1_Sub1_Sub3_2.method463(189);
							}
							if (local33 == 209) {
								this.aClass1_Sub1_Sub3_2.method463(233);
							}
							if (local33 == 852) {
								this.aClass1_Sub1_Sub3_2.method463(147);
							}
							if (local33 == 309) {
								this.aClass1_Sub1_Sub3_2.method463(223);
							}
							this.aClass1_Sub1_Sub3_2.method465(local38);
						}
					}
					if (local33 == 102) {
						this.anInt318 = 1;
						this.anInt319 = local23;
						this.anInt320 = local28;
						this.anInt321 = local38;
						this.aString11 = Class15.method358(local38).aString25;
						this.anInt282 = 0;
						this.aBoolean88 = true;
					} else {
						if (local33 == 275) {
							local910 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local38];
							if (local910 != null) {
								this.method181(false, 0, aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray270[0], 1, aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray269[0], 0, local910.anIntArray269[0], 1, local910.anIntArray270[0], 0, 2);
								this.anInt255 = super.anInt200;
								this.anInt256 = super.anInt201;
								this.anInt258 = 2;
								this.anInt257 = 0;
								this.aClass1_Sub1_Sub3_2.method463(36);
								this.aClass1_Sub1_Sub3_2.method465(local38);
								this.aClass1_Sub1_Sub3_2.method465(this.anInt321);
								this.aClass1_Sub1_Sub3_2.method465(this.anInt319);
								this.aClass1_Sub1_Sub3_2.method465(this.anInt320);
							}
						}
						if (local33 == 131) {
							local910 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local38];
							if (local910 != null) {
								this.method181(false, 0, aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray270[0], 1, aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray269[0], 0, local910.anIntArray269[0], 1, local910.anIntArray270[0], 0, 2);
								this.anInt255 = super.anInt200;
								this.anInt256 = super.anInt201;
								this.anInt258 = 2;
								this.anInt257 = 0;
								this.aClass1_Sub1_Sub3_2.method463(240);
								this.aClass1_Sub1_Sub3_2.method465(local38);
								this.aClass1_Sub1_Sub3_2.method465(this.anInt283);
							}
						}
						if (local33 == 563) {
							this.aClass1_Sub1_Sub3_2.method463(135);
							this.aClass1_Sub1_Sub3_2.method465(local38);
							this.aClass1_Sub1_Sub3_2.method465(local23);
							this.aClass1_Sub1_Sub3_2.method465(local28);
							this.aClass1_Sub1_Sub3_2.method465(this.anInt283);
							this.anInt397 = 0;
							this.anInt398 = local28;
							this.anInt399 = local23;
							this.anInt400 = 2;
							if (Class6.aClass6Array1[local28].anInt421 == this.anInt396) {
								this.anInt400 = 1;
							}
							if (Class6.aClass6Array1[local28].anInt421 == this.anInt392) {
								this.anInt400 = 3;
							}
						}
						if (local33 == 737) {
							this.method149();
						}
						if (local33 == 694 || local33 == 962 || local33 == 795 || local33 == 681 || local33 == 100) {
							if (local33 == 681) {
								anInt221++;
								if (anInt221 >= 116) {
									this.aClass1_Sub1_Sub3_2.method463(24);
									this.aClass1_Sub1_Sub3_2.method467(13018169);
								}
								this.aClass1_Sub1_Sub3_2.method463(216);
							}
							if (local33 == 694) {
								this.aClass1_Sub1_Sub3_2.method463(185);
							}
							if (local33 == 962) {
								this.aClass1_Sub1_Sub3_2.method463(2);
							}
							if (local33 == 100) {
								this.aClass1_Sub1_Sub3_2.method463(42);
							}
							if (local33 == 795) {
								this.aClass1_Sub1_Sub3_2.method463(123);
							}
							this.aClass1_Sub1_Sub3_2.method465(local38);
							this.aClass1_Sub1_Sub3_2.method465(local23);
							this.aClass1_Sub1_Sub3_2.method465(local28);
							this.anInt397 = 0;
							this.anInt398 = local28;
							this.anInt399 = local23;
							this.anInt400 = 2;
							if (Class6.aClass6Array1[local28].anInt421 == this.anInt396) {
								this.anInt400 = 1;
							}
							if (Class6.aClass6Array1[local28].anInt421 == this.anInt392) {
								this.anInt400 = 3;
							}
						}
						if (local33 == 1071) {
							this.method148(127, local23, local38, local28);
						}
						if (local33 == 240) {
							local398 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local38];
							if (local398 != null) {
								this.method181(false, 0, aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray270[0], 1, aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray269[0], 0, local398.anIntArray269[0], 1, local398.anIntArray270[0], 0, 2);
								this.anInt255 = super.anInt200;
								this.anInt256 = super.anInt201;
								this.anInt258 = 2;
								this.anInt257 = 0;
								this.aClass1_Sub1_Sub3_2.method463(181);
								this.aClass1_Sub1_Sub3_2.method465(local38);
								this.aClass1_Sub1_Sub3_2.method465(this.anInt283);
							}
						}
						if (local33 == 721) {
							anInt231 += local28;
							if (anInt231 >= 139) {
								this.aClass1_Sub1_Sub3_2.method463(219);
								this.aClass1_Sub1_Sub3_2.method468(0);
							}
							this.method148(103, local23, local38, local28);
						}
						if (local33 == 370) {
							local107 = this.method181(false, 0, aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray270[0], 0, aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray269[0], 0, local23, 0, local28, 0, 2);
							if (!local107) {
								this.method181(false, 0, aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray270[0], 1, aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray269[0], 0, local23, 1, local28, 0, 2);
							}
							this.anInt255 = super.anInt200;
							this.anInt256 = super.anInt201;
							this.anInt258 = 2;
							this.anInt257 = 0;
							this.aClass1_Sub1_Sub3_2.method463(91);
							this.aClass1_Sub1_Sub3_2.method465(local23 + this.anInt278);
							this.aClass1_Sub1_Sub3_2.method465(local28 + this.anInt279);
							this.aClass1_Sub1_Sub3_2.method465(local38);
							this.aClass1_Sub1_Sub3_2.method465(this.anInt283);
						}
						this.anInt318 = 0;
						this.anInt282 = 0;
						this.aBoolean88 = true;
					}
				}
			}
		} catch (@Pc(2304) RuntimeException local2304) {
			signlink.reporterror("11213, " + arg0 + ", " + false + ", " + local2304.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "K", descriptor = "(I)V")
	private void method220() {
		try {
			@Pc(17) int local17;
			@Pc(24) int local24;
			if (this.anInt268 == 0) {
				local17 = super.anInt190 / 2 - 80;
				local24 = super.anInt191 / 2 + 20;
				local24 += 20;
				if (super.anInt199 == 1 && super.anInt200 >= local17 - 75 && super.anInt200 <= local17 + 75 && super.anInt201 >= local24 - 20 && super.anInt201 <= local24 + 20) {
					this.anInt268 = 3;
					this.anInt212 = 0;
				}
				local17 = super.anInt190 / 2 + 80;
				if (super.anInt199 == 1 && super.anInt200 >= local17 - 75 && super.anInt200 <= local17 + 75 && super.anInt201 >= local24 - 20 && super.anInt201 <= local24 + 20) {
					this.aString6 = "";
					this.aString7 = "Enter your username & password.";
					this.anInt268 = 2;
					this.anInt212 = 0;
				}
			} else if (this.anInt268 == 2) {
				local17 = super.anInt191 / 2 - 40;
				local17 += 30;
				local17 += 25;
				if (super.anInt199 == 1 && super.anInt201 >= local17 - 15 && super.anInt201 < local17) {
					this.anInt212 = 0;
				}
				local17 += 15;
				if (super.anInt199 == 1 && super.anInt201 >= local17 - 15 && super.anInt201 < local17) {
					this.anInt212 = 1;
				}
				local17 += 15;
				local24 = super.anInt190 / 2 - 80;
				@Pc(170) int local170 = super.anInt191 / 2 + 50;
				@Pc(171) int local171 = local170 + 20;
				if (super.anInt199 == 1 && super.anInt200 >= local24 - 75 && super.anInt200 <= local24 + 75 && super.anInt201 >= local171 - 20 && super.anInt201 <= local171 + 20) {
					this.method215(this.aString15, this.aString16, false);
					if (this.aBoolean90) {
						return;
					}
				}
				local24 = super.anInt190 / 2 + 80;
				if (super.anInt199 == 1 && super.anInt200 >= local24 - 75 && super.anInt200 <= local24 + 75 && super.anInt201 >= local171 - 20 && super.anInt201 <= local171 + 20) {
					this.anInt268 = 0;
					this.aString15 = "";
					this.aString16 = "";
				}
				while (true) {
					while (true) {
						@Pc(258) int local258 = this.method87();
						if (local258 == -1) {
							return;
						}
						@Pc(263) boolean local263 = false;
						for (@Pc(265) int local265 = 0; local265 < aString13.length(); local265++) {
							if (local258 == aString13.charAt(local265)) {
								local263 = true;
								break;
							}
						}
						if (this.anInt212 == 0) {
							if (local258 == 8 && this.aString15.length() > 0) {
								this.aString15 = this.aString15.substring(0, this.aString15.length() - 1);
							}
							if (local258 == 9 || local258 == 10 || local258 == 13) {
								this.anInt212 = 1;
							}
							if (local263) {
								this.aString15 = this.aString15 + (char) local258;
							}
							if (this.aString15.length() > 12) {
								this.aString15 = this.aString15.substring(0, 12);
							}
						} else if (this.anInt212 == 1) {
							if (local258 == 8 && this.aString16.length() > 0) {
								this.aString16 = this.aString16.substring(0, this.aString16.length() - 1);
							}
							if (local258 == 9 || local258 == 10 || local258 == 13) {
								this.anInt212 = 0;
							}
							if (local263) {
								this.aString16 = this.aString16 + (char) local258;
							}
							if (this.aString16.length() > 20) {
								this.aString16 = this.aString16.substring(0, 20);
							}
						}
					}
				}
			} else if (this.anInt268 == 3) {
				local17 = super.anInt190 / 2;
				local24 = super.anInt191 / 2 + 50;
				@Pc(422) int local422 = local24 + 20;
				if (super.anInt199 == 1 && super.anInt200 >= local17 - 75 && super.anInt200 <= local17 + 75 && super.anInt201 >= local422 - 20 && super.anInt201 <= local422 + 20) {
					this.anInt268 = 0;
					return;
				}
			}
		} catch (@Pc(455) RuntimeException local455) {
			signlink.reporterror("94006, " + -19490 + ", " + local455.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(ZI)V")
	private void method221(@OriginalArg(0) boolean arg0) {
		try {
			if (aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt986 >> 7 == this.anInt229 && aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt987 >> 7 == this.anInt230) {
				this.anInt229 = 0;
				anInt300++;
				if (anInt300 > 122) {
					anInt300 = 0;
					this.aClass1_Sub1_Sub3_2.method463(188);
					this.aClass1_Sub1_Sub3_2.method464(62);
				}
			}
			@Pc(39) int local39 = this.anInt273;
			if (arg0) {
				local39 = 1;
			}
			for (@Pc(45) int local45 = 0; local45 < local39; local45++) {
				@Pc(51) Class1_Sub1_Sub1_Sub1_Sub1 local51;
				@Pc(56) int local56;
				if (arg0) {
					local51 = aClass1_Sub1_Sub1_Sub1_Sub1_1;
					local56 = this.anInt272 << 14;
				} else {
					local51 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[this.anIntArray49[local45]];
					local56 = this.anIntArray49[local45] << 14;
				}
				if (local51 != null && local51.method675()) {
					local51.aBoolean33 = false;
					if ((aBoolean71 && this.anInt273 > 50 || this.anInt273 > 200) && !arg0 && local51.anInt1006 == local51.anInt990) {
						local51.aBoolean33 = true;
					}
					@Pc(107) int local107 = local51.anInt986 >> 7;
					@Pc(112) int local112 = local51.anInt987 >> 7;
					if (local107 >= 0 && local107 < 104 && local112 >= 0 && local112 < 104) {
						if (local51.aClass1_Sub1_Sub1_Sub5_1 == null || anInt265 < local51.anInt133 || anInt265 >= local51.anInt134) {
							if ((local51.anInt986 & 0x7F) == 64 && (local51.anInt987 & 0x7F) == 64) {
								if (this.anIntArrayArray5[local107][local112] == this.anInt328) {
									continue;
								}
								this.anIntArrayArray5[local107][local112] = this.anInt328;
							}
							local51.anInt132 = this.method147(local51.anInt987, local51.anInt986, this.anInt245);
							this.aClass37_1.method535(local51.anInt132, local51.anInt986, local51.anInt988, this.anInt245, local51, local56, local51.aBoolean261, 60, local51.anInt987);
						} else {
							local51.aBoolean33 = false;
							local51.anInt132 = this.method147(local51.anInt987, local51.anInt986, this.anInt245);
							this.aClass37_1.method536(local51.anInt988, local56, local51.anInt141, local51.anInt138, local51.anInt132, local51.anInt140, local51, local51.anInt987, this.anInt245, local51.anInt139, local51.anInt986);
						}
					}
				}
			}
		} catch (@Pc(245) RuntimeException local245) {
			signlink.reporterror("42972, " + arg0 + ", " + 0 + ", " + local245.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "n", descriptor = "(B)V")
	private void method222() {
		try {
			@Pc(21) int local21;
			@Pc(49) int local49;
			@Pc(53) int local53;
			@Pc(62) int local62;
			@Pc(69) int local69;
			@Pc(132) int local132;
			@Pc(189) int local189;
			try {
				this.anInt206 = -1;
				this.aClass29_1.method509();
				this.aClass29_2.method509();
				Class1_Sub1_Sub2_Sub1.method342();
				this.method176();
				this.aClass37_1.method524();
				for (local21 = 0; local21 < 4; local21++) {
					this.aClass19Array1[local21].method417();
				}
				System.gc();
				@Pc(45) Class4 local45 = new Class4((byte) 113, this.anIntArrayArrayArray5, this.aByteArrayArrayArray7, 104, 104);
				local49 = this.aByteArrayArray2.length;
				Class4.aBoolean45 = Class37.aBoolean219;
				for (local53 = 0; local53 < local49; local53++) {
					local62 = this.anIntArray73[local53] >> 8;
					local69 = this.anIntArray73[local53] & 0xFF;
					if (local62 == 33 && local69 >= 71 && local69 <= 73) {
						Class4.aBoolean45 = false;
					}
				}
				if (Class4.aBoolean45) {
					this.aClass37_1.method525(this.anInt245);
				} else {
					this.aClass37_1.method525(0);
				}
				this.aClass1_Sub1_Sub3_2.method463(120);
				@Pc(137) byte[] local137;
				for (local62 = 0; local62 < local49; local62++) {
					local69 = (this.anIntArray73[local62] >> 8) * 64 - this.anInt278;
					local132 = (this.anIntArray73[local62] & 0xFF) * 64 - this.anInt279;
					local137 = this.aByteArrayArray2[local62];
					if (local137 != null) {
						local45.method56((this.anInt388 - 6) * 8, local137, local69, (this.anInt389 - 6) * 8, local132);
					}
				}
				for (local69 = 0; local69 < local49; local69++) {
					local132 = (this.anIntArray73[local69] >> 8) * 64 - this.anInt278;
					local189 = (this.anIntArray73[local69] & 0xFF) * 64 - this.anInt279;
					@Pc(194) byte[] local194 = this.aByteArrayArray2[local69];
					if (local194 == null && this.anInt389 < 800) {
						local45.method55(local132, local189, this.anInt370);
					}
				}
				this.aClass1_Sub1_Sub3_2.method463(120);
				@Pc(240) int local240;
				for (local132 = 0; local132 < local49; local132++) {
					local137 = this.aByteArrayArray1[local132];
					if (local137 != null) {
						local240 = (this.anIntArray73[local132] >> 8) * 64 - this.anInt278;
						@Pc(252) int local252 = (this.anIntArray73[local132] & 0xFF) * 64 - this.anInt279;
						local45.method59(local240, local252, this.aByte6, this.aClass19Array1, this.aClass37_1, local137);
					}
				}
				this.aClass1_Sub1_Sub3_2.method463(120);
				local45.method61(this.aClass37_1, this.aClass19Array1);
				this.aClass35_17.method518(979);
				this.aClass1_Sub1_Sub3_2.method463(120);
				for (local189 = 0; local189 < 104; local189++) {
					for (local240 = 0; local240 < 104; local240++) {
						this.method190(local189, local240);
					}
				}
				this.method167();
			} catch (@Pc(313) Exception local313) {
			}
			Class9.aClass40_4.method587();
			@Pc(327) int local327;
			if (aBoolean71 && signlink.aRandomAccessFile1 != null) {
				local21 = this.aClass44_Sub1_1.method632(0);
				for (local327 = 0; local327 < local21; local327++) {
					local49 = this.aClass44_Sub1_1.method637(local327);
					if ((local49 & 0x79) == 0) {
						Class1_Sub1_Sub1_Sub5.method259(local327);
					}
				}
			}
			System.gc();
			Class1_Sub1_Sub2_Sub1.method343();
			this.aClass44_Sub1_1.method643();
			local21 = (this.anInt388 - 6) / 8 - 1;
			local327 = (this.anInt388 + 6) / 8 + 1;
			local49 = (this.anInt389 - 6) / 8 - 1;
			local53 = (this.anInt389 + 6) / 8 + 1;
			if (this.aBoolean92) {
				local21 = 49;
				local327 = 50;
				local49 = 49;
				local53 = 50;
			}
			for (local62 = local21; local62 <= local327; local62++) {
				for (local69 = local49; local69 <= local53; local69++) {
					if (local62 == local21 || local62 == local327 || local69 == local49 || local69 == local53) {
						local132 = this.aClass44_Sub1_1.method634(0, local62, local69);
						if (local132 != -1) {
							this.aClass44_Sub1_1.method644(3, local132);
						}
						local189 = this.aClass44_Sub1_1.method634(1, local62, local69);
						if (local189 != -1) {
							this.aClass44_Sub1_1.method644(3, local189);
						}
					}
				}
			}
		} catch (@Pc(471) RuntimeException local471) {
			signlink.reporterror("68636, " + 45 + ", " + local471.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(I)V")
	@Override
	protected void method92() {
		try {
			this.aBoolean86 = true;
		} catch (@Pc(6) RuntimeException local6) {
			signlink.reporterror("13093, " + -202 + ", " + local6.toString());
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

	@OriginalMember(owner = "client!client", name = "run", descriptor = "()V")
	@Override
	public void run() {
		if (this.aBoolean97) {
			this.method194(aBoolean62);
		} else {
			super.run();
		}
	}

	@OriginalMember(owner = "client!client", name = "L", descriptor = "(I)V")
	private void method223(@OriginalArg(0) int arg0) {
		try {
			if (arg0 != 0) {
				aBoolean89 = true;
			}
			if (super.anInt199 == 1) {
				if (super.anInt200 >= 539 && super.anInt200 <= 573 && super.anInt201 >= 169 && super.anInt201 < 205 && this.anIntArray47[0] != -1) {
					this.aBoolean88 = true;
					this.anInt317 = 0;
					this.aBoolean68 = true;
				}
				if (super.anInt200 >= 569 && super.anInt200 <= 599 && super.anInt201 >= 168 && super.anInt201 < 205 && this.anIntArray47[1] != -1) {
					this.aBoolean88 = true;
					this.anInt317 = 1;
					this.aBoolean68 = true;
				}
				if (super.anInt200 >= 597 && super.anInt200 <= 627 && super.anInt201 >= 168 && super.anInt201 < 205 && this.anIntArray47[2] != -1) {
					this.aBoolean88 = true;
					this.anInt317 = 2;
					this.aBoolean68 = true;
				}
				if (super.anInt200 >= 625 && super.anInt200 <= 669 && super.anInt201 >= 168 && super.anInt201 < 203 && this.anIntArray47[3] != -1) {
					this.aBoolean88 = true;
					this.anInt317 = 3;
					this.aBoolean68 = true;
				}
				if (super.anInt200 >= 666 && super.anInt200 <= 696 && super.anInt201 >= 168 && super.anInt201 < 205 && this.anIntArray47[4] != -1) {
					this.aBoolean88 = true;
					this.anInt317 = 4;
					this.aBoolean68 = true;
				}
				if (super.anInt200 >= 694 && super.anInt200 <= 724 && super.anInt201 >= 168 && super.anInt201 < 205 && this.anIntArray47[5] != -1) {
					this.aBoolean88 = true;
					this.anInt317 = 5;
					this.aBoolean68 = true;
				}
				if (super.anInt200 >= 722 && super.anInt200 <= 756 && super.anInt201 >= 169 && super.anInt201 < 205 && this.anIntArray47[6] != -1) {
					this.aBoolean88 = true;
					this.anInt317 = 6;
					this.aBoolean68 = true;
				}
				if (super.anInt200 >= 540 && super.anInt200 <= 574 && super.anInt201 >= 466 && super.anInt201 < 502 && this.anIntArray47[7] != -1) {
					this.aBoolean88 = true;
					this.anInt317 = 7;
					this.aBoolean68 = true;
				}
				if (super.anInt200 >= 572 && super.anInt200 <= 602 && super.anInt201 >= 466 && super.anInt201 < 503 && this.anIntArray47[8] != -1) {
					this.aBoolean88 = true;
					this.anInt317 = 8;
					this.aBoolean68 = true;
				}
				if (super.anInt200 >= 599 && super.anInt200 <= 629 && super.anInt201 >= 466 && super.anInt201 < 503 && this.anIntArray47[9] != -1) {
					this.aBoolean88 = true;
					this.anInt317 = 9;
					this.aBoolean68 = true;
				}
				if (super.anInt200 >= 627 && super.anInt200 <= 671 && super.anInt201 >= 467 && super.anInt201 < 502 && this.anIntArray47[10] != -1) {
					this.aBoolean88 = true;
					this.anInt317 = 10;
					this.aBoolean68 = true;
				}
				if (super.anInt200 >= 669 && super.anInt200 <= 699 && super.anInt201 >= 466 && super.anInt201 < 503 && this.anIntArray47[11] != -1) {
					this.aBoolean88 = true;
					this.anInt317 = 11;
					this.aBoolean68 = true;
				}
				if (super.anInt200 >= 696 && super.anInt200 <= 726 && super.anInt201 >= 466 && super.anInt201 < 503 && this.anIntArray47[12] != -1) {
					this.aBoolean88 = true;
					this.anInt317 = 12;
					this.aBoolean68 = true;
				}
				if (super.anInt200 >= 724 && super.anInt200 <= 758 && super.anInt201 >= 466 && super.anInt201 < 502 && this.anIntArray47[13] != -1) {
					this.aBoolean88 = true;
					this.anInt317 = 13;
					this.aBoolean68 = true;
					return;
				}
			}
		} catch (@Pc(447) RuntimeException local447) {
			signlink.reporterror("64848, " + arg0 + ", " + local447.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "M", descriptor = "(I)V")
	private void method224() {
		try {
			if (this.anInt219 >= 2 || this.anInt318 != 0 || this.anInt282 != 0) {
				@Pc(31) String local31;
				if (this.anInt318 == 1 && this.anInt219 < 2) {
					local31 = "Use " + this.aString11 + " with...";
				} else if (this.anInt282 == 1 && this.anInt219 < 2) {
					local31 = this.aString9 + "...";
				} else {
					local31 = this.aStringArray2[this.anInt219 - 1];
				}
				if (this.anInt219 > 2) {
					local31 = local31 + "@whi@ / " + (this.anInt219 - 2) + " more options";
				}
				this.aClass1_Sub1_Sub2_Sub4_3.method450(local31, 16777215, 15, anInt265 / 1000, 4);
			}
		} catch (@Pc(103) RuntimeException local103) {
			signlink.reporterror("48742, " + 805 + ", " + local103.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "N", descriptor = "(I)V")
	private void method225() {
		try {
			this.anInt301 += 0;
			while (true) {
				@Pc(11) Class1_Sub1_Sub4 local11 = this.aClass44_Sub1_1.method641();
				if (local11 == null) {
					return;
				}
				if (local11.anInt767 == 0) {
					Class1_Sub1_Sub1_Sub5.method258(local11.anInt768, local11.aByteArray10);
					if ((this.aClass44_Sub1_1.method637(local11.anInt768) & 0x62) != 0) {
						this.aBoolean88 = true;
						if (this.anInt392 != -1) {
							this.aBoolean75 = true;
						}
					}
				}
				if (local11.anInt767 == 1 && local11.aByteArray10 != null) {
					Class12.method301(local11.aByteArray10);
				}
				if (local11.anInt767 == 2 && local11.anInt768 == this.anInt401 && local11.aByteArray10 != null) {
					this.method101(this.anInt349, local11.aByteArray10, this.aBoolean93);
				}
				if (local11.anInt767 == 3 && this.anInt348 == 1) {
					for (@Pc(83) int local83 = 0; local83 < this.aByteArrayArray2.length; local83++) {
						if (this.anIntArray74[local83] == local11.anInt768) {
							this.aByteArrayArray2[local83] = local11.aByteArray10;
							if (local11.aByteArray10 == null) {
								this.anIntArray74[local83] = -1;
							}
							break;
						}
						if (this.anIntArray75[local83] == local11.anInt768) {
							this.aByteArrayArray1[local83] = local11.aByteArray10;
							if (local11.aByteArray10 == null) {
								this.anIntArray75[local83] = -1;
							}
							break;
						}
					}
				}
				if (local11.anInt767 == 93 && this.aClass44_Sub1_1.method636(local11.anInt768)) {
					Class4.method58(new Class1_Sub1_Sub3(local11.aByteArray10, 185), this.aClass44_Sub1_1);
				}
			}
		} catch (@Pc(160) RuntimeException local160) {
			signlink.reporterror("28043, " + 0 + ", " + local160.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!ib;III)V")
	private void method226(@OriginalArg(0) Class1_Sub1_Sub2_Sub2 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		try {
			@Pc(7) int local7 = this.anInt384 + this.anInt337 & 0x7FF;
			@Pc(19) int local19 = arg1 * arg1 + arg2 * arg2;
			if (local19 <= 6400) {
				@Pc(27) int local27 = Class1_Sub1_Sub1_Sub5.anIntArray150[local7];
				@Pc(31) int local31 = Class1_Sub1_Sub1_Sub5.anIntArray151[local7];
				@Pc(40) int local40 = local27 * 256 / (this.anInt260 + 256);
				@Pc(49) int local49 = local31 * 256 / (this.anInt260 + 256);
				@Pc(59) int local59 = arg2 * local40 + arg1 * local49 >> 16;
				@Pc(69) int local69 = arg2 * local49 - arg1 * local40 >> 16;
				if (local19 > 2500) {
					arg0.method394(local59 + 94 + 4 - arg0.anInt650 / 2, 83 - local69 - arg0.anInt651 / 2 - 4, this.aClass1_Sub1_Sub2_Sub3_9);
				} else {
					arg0.method388(local59 + 94 + 4 - arg0.anInt650 / 2, (byte) 1, 83 - local69 - arg0.anInt651 / 2 - 4);
				}
			}
		} catch (@Pc(123) RuntimeException local123) {
			signlink.reporterror("83753, " + arg0 + ", " + 0 + ", " + arg1 + ", " + arg2 + ", " + local123.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "O", descriptor = "(I)V")
	private void method227() {
		try {
			@Pc(7) int local7 = this.aClass1_Sub1_Sub2_Sub4_3.method445("Choose Option");
			@Pc(20) int local20;
			for (@Pc(9) int local9 = 0; local9 < this.anInt219; local9++) {
				local20 = this.aClass1_Sub1_Sub2_Sub4_3.method445(this.aStringArray2[local9]);
				if (local20 > local7) {
					local7 = local20;
				}
			}
			local7 += 8;
			local20 = this.anInt219 * 15 + 21;
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
				this.aBoolean85 = true;
				this.anInt323 = 0;
				this.anInt324 = local68;
				this.anInt325 = local86;
				this.anInt326 = local7;
				this.anInt327 = this.anInt219 * 15 + 22;
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
				this.aBoolean85 = true;
				this.anInt323 = 1;
				this.anInt324 = local68;
				this.anInt325 = local86;
				this.anInt326 = local7;
				this.anInt327 = this.anInt219 * 15 + 22;
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
				this.aBoolean85 = true;
				this.anInt323 = 2;
				this.anInt324 = local68;
				this.anInt325 = local86;
				this.anInt326 = local7;
				this.anInt327 = this.anInt219 * 15 + 22;
			}
		} catch (@Pc(290) RuntimeException local290) {
			signlink.reporterror("61359, " + 0 + ", " + local290.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!d;IIII)V")
	private void method228(@OriginalArg(0) Class6 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		try {
			if (arg0.anInt422 == 0 && arg0.anIntArray97 != null && (!arg0.aBoolean99 || this.anInt233 == arg0.anInt420 || this.anInt224 == arg0.anInt420 || this.anInt253 == arg0.anInt420)) {
				@Pc(29) int local29 = Class1_Sub1_Sub2.anInt695;
				@Pc(31) int local31 = Class1_Sub1_Sub2.anInt693;
				@Pc(33) int local33 = Class1_Sub1_Sub2.anInt696;
				@Pc(35) int local35 = Class1_Sub1_Sub2.anInt694;
				Class1_Sub1_Sub2.method433(arg2, arg3, arg3 + arg0.anInt425, arg2 + arg0.anInt426, 297);
				@Pc(51) int local51 = arg0.anIntArray97.length;
				for (@Pc(53) int local53 = 0; local53 < local51; local53++) {
					@Pc(62) int local62 = arg0.anIntArray98[local53] + arg3;
					@Pc(71) int local71 = arg0.anIntArray99[local53] + arg2 - arg1;
					@Pc(78) Class6 local78 = Class6.aClass6Array1[arg0.anIntArray97[local53]];
					@Pc(83) int local83 = local62 + local78.anInt427;
					@Pc(88) int local88 = local71 + local78.anInt428;
					if (local78.anInt424 > 0) {
						this.method97(606, local78);
					}
					if (local78.anInt422 == 0) {
						if (local78.anInt431 > local78.anInt430 - local78.anInt426) {
							local78.anInt431 = local78.anInt430 - local78.anInt426;
						}
						if (local78.anInt431 < 0) {
							local78.anInt431 = 0;
						}
						this.method228(local78, local78.anInt431, local88, local83);
						if (local78.anInt430 > local78.anInt426) {
							this.method175(local78.anInt430, local88, local83 + local78.anInt425, local78.anInt431, local78.anInt426);
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
										if (local175 > Class1_Sub1_Sub2.anInt695 - 32 && local175 < Class1_Sub1_Sub2.anInt696 && local184 > Class1_Sub1_Sub2.anInt693 - 32 && local184 < Class1_Sub1_Sub2.anInt694 || this.anInt358 != 0 && this.anInt357 == local158) {
											@Pc(242) int local242 = 0;
											if (this.anInt318 == 1 && this.anInt319 == local158 && this.anInt320 == local78.anInt420) {
												local242 = 16777215;
											}
											@Pc(266) Class1_Sub1_Sub2_Sub2 local266 = Class15.method364(local78.anIntArray94[local158], local217, local242);
											if (local266 != null) {
												@Pc(345) int local345;
												if (this.anInt358 != 0 && this.anInt357 == local158 && this.anInt356 == local78.anInt420) {
													local208 = super.anInt194 - this.anInt359;
													local210 = super.anInt195 - this.anInt360;
													if (local208 < 5 && local208 > -5) {
														local208 = 0;
													}
													if (local210 < 5 && local210 > -5) {
														local210 = 0;
													}
													if (this.anInt371 < 5) {
														local208 = 0;
														local210 = 0;
													}
													local266.method390(local175 + local208, local184 + local210);
													if (local184 + local210 < Class1_Sub1_Sub2.anInt693 && arg0.anInt431 > 0) {
														local345 = this.anInt251 * (Class1_Sub1_Sub2.anInt693 - local184 - local210) / 3;
														if (local345 > this.anInt251 * 10) {
															local345 = this.anInt251 * 10;
														}
														if (local345 > arg0.anInt431) {
															local345 = arg0.anInt431;
														}
														arg0.anInt431 -= local345;
														this.anInt360 += local345;
													}
													if (local184 + local210 + 32 > Class1_Sub1_Sub2.anInt694 && arg0.anInt431 < arg0.anInt430 - arg0.anInt426) {
														local345 = this.anInt251 * (local184 + local210 + 32 - Class1_Sub1_Sub2.anInt694) / 3;
														if (local345 > this.anInt251 * 10) {
															local345 = this.anInt251 * 10;
														}
														if (local345 > arg0.anInt430 - arg0.anInt426 - arg0.anInt431) {
															local345 = arg0.anInt430 - arg0.anInt426 - arg0.anInt431;
														}
														arg0.anInt431 += local345;
														this.anInt360 -= local345;
													}
												} else if (this.anInt400 != 0 && this.anInt399 == local158 && this.anInt398 == local78.anInt420) {
													local266.method390(local175, local184);
												} else {
													local266.method388(local175, (byte) 1, local184);
												}
												if (local266.anInt650 == 33 || local78.anIntArray94[local158] != 1) {
													local345 = local78.anIntArray94[local158];
													this.aClass1_Sub1_Sub2_Sub4_1.method447(local175 + local208 + 1, method157(local345), local184 + local210 + 10, 0);
													this.aClass1_Sub1_Sub2_Sub4_1.method447(local175 + local208, method157(local345), local184 + local210 + 9, 16776960);
												}
											}
										}
									} else if (local78.aClass1_Sub1_Sub2_Sub2Array8 != null && local158 < 20) {
										@Pc(534) Class1_Sub1_Sub2_Sub2 local534 = local78.aClass1_Sub1_Sub2_Sub2Array8[local158];
										if (local534 != null) {
											local534.method388(local175, (byte) 1, local184);
										}
									}
									local158++;
								}
							}
						} else if (local78.anInt422 == 3) {
							@Pc(559) boolean local559 = false;
							if (this.anInt253 == local78.anInt420 || this.anInt224 == local78.anInt420 || this.anInt233 == local78.anInt420) {
								local559 = true;
							}
							if (this.method98(local78, (byte) 8)) {
								local158 = local78.anInt436;
								if (local559 && local78.anInt438 != 0) {
									local158 = local78.anInt438;
								}
							} else {
								local158 = local78.anInt435;
								if (local559 && local78.anInt437 != 0) {
									local158 = local78.anInt437;
								}
							}
							if (local78.aByte8 == 0) {
								if (local78.aBoolean105) {
									Class1_Sub1_Sub2.method436(local83, local158, local78.anInt426, local78.anInt425, local88);
								} else {
									Class1_Sub1_Sub2.method437(local78.anInt425, local158, local78.anInt426, local88, local83);
								}
							} else if (local78.aBoolean105) {
								Class1_Sub1_Sub2.method435(256 - (local78.aByte8 & 0xFF), local78.anInt425, local158, local83, local78.anInt426, local88);
							} else {
								Class1_Sub1_Sub2.method438(256 - (local78.aByte8 & 0xFF), local158, local88, local83, local78.anInt425, local78.anInt426);
							}
						} else {
							@Pc(677) Class1_Sub1_Sub2_Sub4 local677;
							if (local78.anInt422 == 4) {
								local677 = local78.aClass1_Sub1_Sub2_Sub4_5;
								@Pc(680) String local680 = local78.aString18;
								@Pc(682) boolean local682 = false;
								if (this.anInt253 == local78.anInt420 || this.anInt224 == local78.anInt420 || this.anInt233 == local78.anInt420) {
									local682 = true;
								}
								if (this.method98(local78, (byte) 8)) {
									local160 = local78.anInt436;
									if (local682 && local78.anInt438 != 0) {
										local160 = local78.anInt438;
									}
									if (local78.aString19.length() > 0) {
										local680 = local78.aString19;
									}
								} else {
									local160 = local78.anInt435;
									if (local682 && local78.anInt437 != 0) {
										local160 = local78.anInt437;
									}
								}
								if (local78.anInt423 == 6 && this.aBoolean84) {
									local680 = "Please wait...";
									local160 = local78.anInt435;
								}
								if (Class1_Sub1_Sub2.anInt691 == 479) {
									if (local160 == 16776960) {
										local160 = 255;
									}
									if (local160 == 49152) {
										local160 = 16777215;
									}
								}
								local208 = local88 + local677.anInt704;
								while (local680.length() > 0) {
									if (local680.indexOf("%") != -1) {
										label348: while (true) {
											local210 = local680.indexOf("%1");
											if (local210 == -1) {
												while (true) {
													local210 = local680.indexOf("%2");
													if (local210 == -1) {
														while (true) {
															local210 = local680.indexOf("%3");
															if (local210 == -1) {
																while (true) {
																	local210 = local680.indexOf("%4");
																	if (local210 == -1) {
																		while (true) {
																			local210 = local680.indexOf("%5");
																			if (local210 == -1) {
																				break label348;
																			}
																			local680 = local680.substring(0, local210) + this.method206(this.method213(local78, 4)) + local680.substring(local210 + 2);
																		}
																	}
																	local680 = local680.substring(0, local210) + this.method206(this.method213(local78, 3)) + local680.substring(local210 + 2);
																}
															}
															local680 = local680.substring(0, local210) + this.method206(this.method213(local78, 2)) + local680.substring(local210 + 2);
														}
													}
													local680 = local680.substring(0, local210) + this.method206(this.method213(local78, 1)) + local680.substring(local210 + 2);
												}
											}
											local680 = local680.substring(0, local210) + this.method206(this.method213(local78, 0)) + local680.substring(local210 + 2);
										}
									}
									local210 = local680.indexOf("\\n");
									@Pc(954) String local954;
									if (local210 == -1) {
										local954 = local680;
										local680 = "";
									} else {
										local954 = local680.substring(0, local210);
										local680 = local680.substring(local210 + 2);
									}
									if (local78.aBoolean106) {
										local677.method444(local78.aBoolean107, local208, local954, local83 + local78.anInt425 / 2, local160);
									} else {
										local677.method449(local208, local83, local78.aBoolean107, local160, local954);
									}
									local208 += local677.anInt704;
								}
							} else if (local78.anInt422 == 5) {
								@Pc(1015) Class1_Sub1_Sub2_Sub2 local1015;
								if (this.method98(local78, (byte) 8)) {
									local1015 = local78.aClass1_Sub1_Sub2_Sub2_15;
								} else {
									local1015 = local78.aClass1_Sub1_Sub2_Sub2_14;
								}
								if (local1015 != null) {
									local1015.method388(local83, (byte) 1, local88);
								}
							} else if (local78.anInt422 == 6) {
								local158 = Class1_Sub1_Sub2_Sub1.anInt591;
								local160 = Class1_Sub1_Sub2_Sub1.anInt592;
								Class1_Sub1_Sub2_Sub1.anInt591 = local83 + local78.anInt425 / 2;
								Class1_Sub1_Sub2_Sub1.anInt592 = local88 + local78.anInt426 / 2;
								local164 = Class1_Sub1_Sub2_Sub1.anIntArray175[local78.anInt446] * local78.anInt445 >> 16;
								local175 = Class1_Sub1_Sub2_Sub1.anIntArray176[local78.anInt446] * local78.anInt445 >> 16;
								@Pc(1076) boolean local1076 = this.method98(local78, (byte) 8);
								if (local1076) {
									local208 = local78.anInt444;
								} else {
									local208 = local78.anInt443;
								}
								@Pc(1096) Class1_Sub1_Sub1_Sub5 local1096;
								if (local208 == -1) {
									local1096 = local78.method232(-1, -1, local1076);
								} else {
									@Pc(1102) Class27 local1102 = Class27.aClass27Array1[local208];
									local1096 = local78.method232(local1102.anIntArray222[local78.anInt418], local1102.anIntArray223[local78.anInt418], local1076);
								}
								if (local1096 != null) {
									local1096.method280(local78.anInt447, 0, local78.anInt446, 0, local164, local175);
								}
								Class1_Sub1_Sub2_Sub1.anInt591 = local158;
								Class1_Sub1_Sub2_Sub1.anInt592 = local160;
							} else if (local78.anInt422 == 7) {
								local677 = local78.aClass1_Sub1_Sub2_Sub4_5;
								local160 = 0;
								for (local164 = 0; local164 < local78.anInt426; local164++) {
									for (local175 = 0; local175 < local78.anInt425; local175++) {
										if (local78.anIntArray93[local160] > 0) {
											@Pc(1166) Class15 local1166 = Class15.method358(local78.anIntArray93[local160] - 1);
											@Pc(1169) String local1169 = local1166.aString25;
											if (local1166.aBoolean164 || local78.anIntArray94[local160] != 1) {
												local1169 = local1169 + " x" + method193(local78.anIntArray94[local160], 57);
											}
											local210 = local83 + local175 * (local78.anInt433 + 115);
											local217 = local88 + local164 * (local78.anInt434 + 12);
											if (local78.aBoolean106) {
												local677.method444(local78.aBoolean107, local217, local1169, local210 + local78.anInt425 / 2, local78.anInt435);
											} else {
												local677.method449(local217, local210, local78.aBoolean107, local78.anInt435, local1169);
											}
										}
										local160++;
									}
								}
							}
						}
					}
				}
				Class1_Sub1_Sub2.method433(local31, local29, local33, local35, 297);
			}
		} catch (@Pc(1275) RuntimeException local1275) {
			signlink.reporterror("50365, " + arg0 + ", " + 2712 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local1275.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "h", descriptor = "(II)V")
	private void method229(@OriginalArg(0) int arg0) {
		try {
			@Pc(5) Class6 local5 = Class6.aClass6Array1[arg0];
			for (@Pc(7) int local7 = 0; local7 < local5.anIntArray97.length && local5.anIntArray97[local7] != -1; local7++) {
				@Pc(22) Class6 local22 = Class6.aClass6Array1[local5.anIntArray97[local7]];
				if (local22.anInt422 == 1) {
					this.method229(local22.anInt420);
				}
				local22.anInt418 = 0;
				local22.anInt419 = 0;
			}
		} catch (@Pc(54) RuntimeException local54) {
			signlink.reporterror("63985, " + arg0 + ", " + 95 + ", " + local54.toString());
			throw new RuntimeException();
		}
	}
}
