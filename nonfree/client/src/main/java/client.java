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

	@OriginalMember(owner = "client!client", name = "S", descriptor = "I")
	private static int anInt201;

	@OriginalMember(owner = "client!client", name = "Pb", descriptor = "I")
	private static int anInt220;

	@OriginalMember(owner = "client!client", name = "Sb", descriptor = "I")
	private static int anInt221;

	@OriginalMember(owner = "client!client", name = "pc", descriptor = "Z")
	private static boolean aBoolean60;

	@OriginalMember(owner = "client!client", name = "Qc", descriptor = "I")
	private static int anInt245;

	@OriginalMember(owner = "client!client", name = "ed", descriptor = "Z")
	private static boolean aBoolean67;

	@OriginalMember(owner = "client!client", name = "ld", descriptor = "I")
	private static int anInt256;

	@OriginalMember(owner = "client!client", name = "be", descriptor = "I")
	private static int anInt281;

	@OriginalMember(owner = "client!client", name = "Se", descriptor = "I")
	private static int anInt304;

	@OriginalMember(owner = "client!client", name = "kf", descriptor = "I")
	private static int anInt312;

	@OriginalMember(owner = "client!client", name = "lf", descriptor = "Lclient!ab;")
	public static Class1_Sub1_Sub1_Sub1_Sub1 aClass1_Sub1_Sub1_Sub1_Sub1_1;

	@OriginalMember(owner = "client!client", name = "zf", descriptor = "Z")
	private static boolean aBoolean78;

	@OriginalMember(owner = "client!client", name = "Zf", descriptor = "I")
	private static int anInt328;

	@OriginalMember(owner = "client!client", name = "mg", descriptor = "I")
	private static int anInt336;

	@OriginalMember(owner = "client!client", name = "Ag", descriptor = "I")
	private static int anInt343;

	@OriginalMember(owner = "client!client", name = "Bh", descriptor = "I")
	private static int anInt359;

	@OriginalMember(owner = "client!client", name = "Jh", descriptor = "I")
	private static int anInt366;

	@OriginalMember(owner = "client!client", name = "Oh", descriptor = "I")
	private static int anInt369;

	@OriginalMember(owner = "client!client", name = "mi", descriptor = "I")
	private static int anInt380;

	@OriginalMember(owner = "client!client", name = "pi", descriptor = "I")
	private static int anInt382;

	@OriginalMember(owner = "client!client", name = "Pi", descriptor = "I")
	public static int anInt393;

	@OriginalMember(owner = "client!client", name = "Ri", descriptor = "Z")
	private static boolean aBoolean90;

	@OriginalMember(owner = "client!client", name = "Ui", descriptor = "I")
	private static int anInt394;

	@OriginalMember(owner = "client!client", name = "Wi", descriptor = "I")
	public static int anInt396;

	@OriginalMember(owner = "client!client", name = "Ej", descriptor = "I")
	private static int anInt411;

	@OriginalMember(owner = "client!client", name = "qd", descriptor = "B")
	private static byte aByte5 = -48;

	@OriginalMember(owner = "client!client", name = "zd", descriptor = "I")
	private static int anInt265 = 1;

	@OriginalMember(owner = "client!client", name = "Hd", descriptor = "Ljava/lang/String;")
	private static String aString8 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";

	@OriginalMember(owner = "client!client", name = "Zd", descriptor = "[I")
	private static int[] anIntArray53 = new int[99];

	@OriginalMember(owner = "client!client", name = "gf", descriptor = "[I")
	public static final int[] anIntArray67;

	@OriginalMember(owner = "client!client", name = "jf", descriptor = "Ljava/math/BigInteger;")
	private static BigInteger aBigInteger1;

	@OriginalMember(owner = "client!client", name = "Lf", descriptor = "[[I")
	public static final int[][] anIntArrayArray5;

	@OriginalMember(owner = "client!client", name = "ag", descriptor = "[I")
	public static int[] anIntArray70;

	@OriginalMember(owner = "client!client", name = "Vg", descriptor = "Ljava/math/BigInteger;")
	private static BigInteger aBigInteger2;

	@OriginalMember(owner = "client!client", name = "ci", descriptor = "B")
	private static byte aByte13;

	@OriginalMember(owner = "client!client", name = "Oi", descriptor = "I")
	private static int anInt392;

	@OriginalMember(owner = "client!client", name = "Qi", descriptor = "Z")
	private static boolean aBoolean89;

	@OriginalMember(owner = "client!client", name = "cj", descriptor = "I")
	private static int anInt401;

	@OriginalMember(owner = "client!client", name = "K", descriptor = "J")
	private long aLong14;

	@OriginalMember(owner = "client!client", name = "L", descriptor = "Lclient!ub;")
	private Class44_Sub1 aClass44_Sub1_1;

	@OriginalMember(owner = "client!client", name = "M", descriptor = "I")
	private int anInt196;

	@OriginalMember(owner = "client!client", name = "N", descriptor = "I")
	private int anInt197;

	@OriginalMember(owner = "client!client", name = "O", descriptor = "I")
	private int anInt198;

	@OriginalMember(owner = "client!client", name = "P", descriptor = "I")
	private int anInt199;

	@OriginalMember(owner = "client!client", name = "Q", descriptor = "I")
	private int anInt200;

	@OriginalMember(owner = "client!client", name = "U", descriptor = "Ljava/lang/String;")
	private String aString4;

	@OriginalMember(owner = "client!client", name = "V", descriptor = "I")
	private int anInt202;

	@OriginalMember(owner = "client!client", name = "W", descriptor = "I")
	private int anInt203;

	@OriginalMember(owner = "client!client", name = "X", descriptor = "I")
	private int anInt204;

	@OriginalMember(owner = "client!client", name = "cb", descriptor = "I")
	private int anInt205;

	@OriginalMember(owner = "client!client", name = "db", descriptor = "I")
	private int anInt206;

	@OriginalMember(owner = "client!client", name = "fb", descriptor = "I")
	private int anInt208;

	@OriginalMember(owner = "client!client", name = "gb", descriptor = "I")
	private int anInt209;

	@OriginalMember(owner = "client!client", name = "mb", descriptor = "I")
	private int anInt210;

	@OriginalMember(owner = "client!client", name = "nb", descriptor = "I")
	private int anInt211;

	@OriginalMember(owner = "client!client", name = "ob", descriptor = "I")
	private int anInt212;

	@OriginalMember(owner = "client!client", name = "tb", descriptor = "I")
	private int anInt215;

	@OriginalMember(owner = "client!client", name = "xb", descriptor = "Lclient!jb;")
	private Class1_Sub1_Sub2_Sub3 aClass1_Sub1_Sub2_Sub3_1;

	@OriginalMember(owner = "client!client", name = "yb", descriptor = "Lclient!jb;")
	private Class1_Sub1_Sub2_Sub3 aClass1_Sub1_Sub2_Sub3_2;

	@OriginalMember(owner = "client!client", name = "zb", descriptor = "Lclient!jb;")
	private Class1_Sub1_Sub2_Sub3 aClass1_Sub1_Sub2_Sub3_3;

	@OriginalMember(owner = "client!client", name = "Ab", descriptor = "Lclient!jb;")
	private Class1_Sub1_Sub2_Sub3 aClass1_Sub1_Sub2_Sub3_4;

	@OriginalMember(owner = "client!client", name = "Bb", descriptor = "Lclient!jb;")
	private Class1_Sub1_Sub2_Sub3 aClass1_Sub1_Sub2_Sub3_5;

	@OriginalMember(owner = "client!client", name = "Cb", descriptor = "I")
	private int anInt216;

	@OriginalMember(owner = "client!client", name = "Db", descriptor = "Lclient!qb;")
	private Class35 aClass35_3;

	@OriginalMember(owner = "client!client", name = "Eb", descriptor = "Lclient!qb;")
	private Class35 aClass35_4;

	@OriginalMember(owner = "client!client", name = "Fb", descriptor = "Lclient!qb;")
	private Class35 aClass35_5;

	@OriginalMember(owner = "client!client", name = "Gb", descriptor = "I")
	private int anInt217;

	@OriginalMember(owner = "client!client", name = "Hb", descriptor = "I")
	private int anInt218;

	@OriginalMember(owner = "client!client", name = "Jb", descriptor = "[Lclient!jb;")
	private Class1_Sub1_Sub2_Sub3[] aClass1_Sub1_Sub2_Sub3Array2;

	@OriginalMember(owner = "client!client", name = "Kb", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray5;

	@OriginalMember(owner = "client!client", name = "Lb", descriptor = "Lclient!fc;")
	private Class11 aClass11_1;

	@OriginalMember(owner = "client!client", name = "Ob", descriptor = "I")
	private int anInt219;

	@OriginalMember(owner = "client!client", name = "Qb", descriptor = "[[[B")
	private byte[][][] aByteArrayArrayArray7;

	@OriginalMember(owner = "client!client", name = "Ub", descriptor = "I")
	private int anInt223;

	@OriginalMember(owner = "client!client", name = "Vb", descriptor = "I")
	private int anInt224;

	@OriginalMember(owner = "client!client", name = "Wb", descriptor = "I")
	private int anInt225;

	@OriginalMember(owner = "client!client", name = "Xb", descriptor = "I")
	private int anInt226;

	@OriginalMember(owner = "client!client", name = "Yb", descriptor = "I")
	private int anInt227;

	@OriginalMember(owner = "client!client", name = "Zb", descriptor = "I")
	private int anInt228;

	@OriginalMember(owner = "client!client", name = "bc", descriptor = "I")
	private int anInt229;

	@OriginalMember(owner = "client!client", name = "gc", descriptor = "I")
	private int anInt230;

	@OriginalMember(owner = "client!client", name = "hc", descriptor = "I")
	private int anInt231;

	@OriginalMember(owner = "client!client", name = "jc", descriptor = "I")
	private int anInt233;

	@OriginalMember(owner = "client!client", name = "kc", descriptor = "Lclient!jb;")
	private Class1_Sub1_Sub2_Sub3 aClass1_Sub1_Sub2_Sub3_6;

	@OriginalMember(owner = "client!client", name = "lc", descriptor = "Lclient!jb;")
	private Class1_Sub1_Sub2_Sub3 aClass1_Sub1_Sub2_Sub3_7;

	@OriginalMember(owner = "client!client", name = "oc", descriptor = "I")
	private int anInt234;

	@OriginalMember(owner = "client!client", name = "sc", descriptor = "I")
	private int anInt235;

	@OriginalMember(owner = "client!client", name = "uc", descriptor = "I")
	private int anInt237;

	@OriginalMember(owner = "client!client", name = "wc", descriptor = "Lclient!jb;")
	private Class1_Sub1_Sub2_Sub3 aClass1_Sub1_Sub2_Sub3_8;

	@OriginalMember(owner = "client!client", name = "xc", descriptor = "Lclient!jb;")
	private Class1_Sub1_Sub2_Sub3 aClass1_Sub1_Sub2_Sub3_9;

	@OriginalMember(owner = "client!client", name = "yc", descriptor = "Lclient!jb;")
	private Class1_Sub1_Sub2_Sub3 aClass1_Sub1_Sub2_Sub3_10;

	@OriginalMember(owner = "client!client", name = "Ac", descriptor = "I")
	private int anInt239;

	@OriginalMember(owner = "client!client", name = "Cc", descriptor = "I")
	private int anInt240;

	@OriginalMember(owner = "client!client", name = "Ec", descriptor = "I")
	private int anInt241;

	@OriginalMember(owner = "client!client", name = "Fc", descriptor = "I")
	private int anInt242;

	@OriginalMember(owner = "client!client", name = "Gc", descriptor = "Lclient!ib;")
	private Class1_Sub1_Sub2_Sub2 aClass1_Sub1_Sub2_Sub2_1;

	@OriginalMember(owner = "client!client", name = "Hc", descriptor = "[I")
	private int[] anIntArray45;

	@OriginalMember(owner = "client!client", name = "Ic", descriptor = "[I")
	private int[] anIntArray46;

	@OriginalMember(owner = "client!client", name = "Jc", descriptor = "[I")
	private int[] anIntArray47;

	@OriginalMember(owner = "client!client", name = "Kc", descriptor = "I")
	private int anInt243;

	@OriginalMember(owner = "client!client", name = "Oc", descriptor = "I")
	private int anInt244;

	@OriginalMember(owner = "client!client", name = "Tc", descriptor = "Ljava/lang/String;")
	private String aString5;

	@OriginalMember(owner = "client!client", name = "Uc", descriptor = "Lclient!wb;")
	private Class46 aClass46_1;

	@OriginalMember(owner = "client!client", name = "Vc", descriptor = "I")
	private int anInt247;

	@OriginalMember(owner = "client!client", name = "Xc", descriptor = "I")
	private int anInt249;

	@OriginalMember(owner = "client!client", name = "Yc", descriptor = "I")
	private int anInt250;

	@OriginalMember(owner = "client!client", name = "Zc", descriptor = "I")
	private int anInt251;

	@OriginalMember(owner = "client!client", name = "ad", descriptor = "I")
	private int anInt252;

	@OriginalMember(owner = "client!client", name = "dd", descriptor = "I")
	private int anInt253;

	@OriginalMember(owner = "client!client", name = "hd", descriptor = "I")
	private int anInt254;

	@OriginalMember(owner = "client!client", name = "jd", descriptor = "I")
	private int anInt255;

	@OriginalMember(owner = "client!client", name = "md", descriptor = "I")
	private int anInt257;

	@OriginalMember(owner = "client!client", name = "od", descriptor = "I")
	private int anInt258;

	@OriginalMember(owner = "client!client", name = "td", descriptor = "I")
	private int anInt260;

	@OriginalMember(owner = "client!client", name = "ud", descriptor = "I")
	private int anInt261;

	@OriginalMember(owner = "client!client", name = "vd", descriptor = "I")
	private int anInt262;

	@OriginalMember(owner = "client!client", name = "wd", descriptor = "I")
	private int anInt263;

	@OriginalMember(owner = "client!client", name = "xd", descriptor = "Ljava/lang/String;")
	private String aString7;

	@OriginalMember(owner = "client!client", name = "yd", descriptor = "I")
	private int anInt264;

	@OriginalMember(owner = "client!client", name = "Ad", descriptor = "I")
	private int anInt266;

	@OriginalMember(owner = "client!client", name = "Fd", descriptor = "I")
	private int anInt270;

	@OriginalMember(owner = "client!client", name = "Id", descriptor = "J")
	private long aLong15;

	@OriginalMember(owner = "client!client", name = "Jd", descriptor = "I")
	private int anInt272;

	@OriginalMember(owner = "client!client", name = "Ld", descriptor = "I")
	private int anInt274;

	@OriginalMember(owner = "client!client", name = "Md", descriptor = "I")
	private int anInt275;

	@OriginalMember(owner = "client!client", name = "Nd", descriptor = "I")
	private int anInt276;

	@OriginalMember(owner = "client!client", name = "Od", descriptor = "[[B")
	private byte[][] aByteArrayArray1;

	@OriginalMember(owner = "client!client", name = "Td", descriptor = "I")
	private int anInt278;

	@OriginalMember(owner = "client!client", name = "Wd", descriptor = "[[B")
	private byte[][] aByteArrayArray2;

	@OriginalMember(owner = "client!client", name = "Xd", descriptor = "I")
	private int anInt279;

	@OriginalMember(owner = "client!client", name = "Yd", descriptor = "I")
	private int anInt280;

	@OriginalMember(owner = "client!client", name = "de", descriptor = "Lclient!ib;")
	private Class1_Sub1_Sub2_Sub2 aClass1_Sub1_Sub2_Sub2_2;

	@OriginalMember(owner = "client!client", name = "ee", descriptor = "I")
	private int anInt282;

	@OriginalMember(owner = "client!client", name = "fe", descriptor = "I")
	private int anInt283;

	@OriginalMember(owner = "client!client", name = "ge", descriptor = "I")
	private int anInt284;

	@OriginalMember(owner = "client!client", name = "he", descriptor = "I")
	private int anInt285;

	@OriginalMember(owner = "client!client", name = "ie", descriptor = "I")
	private int anInt286;

	@OriginalMember(owner = "client!client", name = "je", descriptor = "I")
	private int anInt287;

	@OriginalMember(owner = "client!client", name = "ke", descriptor = "I")
	private int anInt288;

	@OriginalMember(owner = "client!client", name = "le", descriptor = "I")
	private int anInt289;

	@OriginalMember(owner = "client!client", name = "me", descriptor = "Ljava/lang/String;")
	private String aString9;

	@OriginalMember(owner = "client!client", name = "ne", descriptor = "I")
	private int anInt290;

	@OriginalMember(owner = "client!client", name = "oe", descriptor = "I")
	private int anInt291;

	@OriginalMember(owner = "client!client", name = "ue", descriptor = "I")
	private int anInt293;

	@OriginalMember(owner = "client!client", name = "ye", descriptor = "I")
	private int anInt294;

	@OriginalMember(owner = "client!client", name = "Ae", descriptor = "I")
	private int anInt295;

	@OriginalMember(owner = "client!client", name = "Ce", descriptor = "Ljava/net/Socket;")
	private Socket aSocket1;

	@OriginalMember(owner = "client!client", name = "De", descriptor = "I")
	private int anInt297;

	@OriginalMember(owner = "client!client", name = "Ge", descriptor = "I")
	private int anInt299;

	@OriginalMember(owner = "client!client", name = "Me", descriptor = "I")
	private int anInt301;

	@OriginalMember(owner = "client!client", name = "Oe", descriptor = "Lclient!ib;")
	private Class1_Sub1_Sub2_Sub2 aClass1_Sub1_Sub2_Sub2_3;

	@OriginalMember(owner = "client!client", name = "Pe", descriptor = "Lclient!ib;")
	private Class1_Sub1_Sub2_Sub2 aClass1_Sub1_Sub2_Sub2_4;

	@OriginalMember(owner = "client!client", name = "Re", descriptor = "I")
	private int anInt303;

	@OriginalMember(owner = "client!client", name = "Te", descriptor = "I")
	private int anInt305;

	@OriginalMember(owner = "client!client", name = "Ue", descriptor = "I")
	private int anInt306;

	@OriginalMember(owner = "client!client", name = "Ve", descriptor = "I")
	private int anInt307;

	@OriginalMember(owner = "client!client", name = "We", descriptor = "I")
	private int anInt308;

	@OriginalMember(owner = "client!client", name = "Xe", descriptor = "I")
	private int anInt309;

	@OriginalMember(owner = "client!client", name = "af", descriptor = "I")
	private int anInt310;

	@OriginalMember(owner = "client!client", name = "bf", descriptor = "I")
	private int anInt311;

	@OriginalMember(owner = "client!client", name = "cf", descriptor = "[I")
	private int[] anIntArray64;

	@OriginalMember(owner = "client!client", name = "df", descriptor = "[I")
	private int[] anIntArray65;

	@OriginalMember(owner = "client!client", name = "ef", descriptor = "[I")
	private int[] anIntArray66;

	@OriginalMember(owner = "client!client", name = "mf", descriptor = "J")
	private long aLong16;

	@OriginalMember(owner = "client!client", name = "wf", descriptor = "Lclient!jb;")
	private Class1_Sub1_Sub2_Sub3 aClass1_Sub1_Sub2_Sub3_11;

	@OriginalMember(owner = "client!client", name = "xf", descriptor = "Lclient!jb;")
	private Class1_Sub1_Sub2_Sub3 aClass1_Sub1_Sub2_Sub3_12;

	@OriginalMember(owner = "client!client", name = "Ef", descriptor = "I")
	private int anInt317;

	@OriginalMember(owner = "client!client", name = "Ff", descriptor = "I")
	private int anInt318;

	@OriginalMember(owner = "client!client", name = "Gf", descriptor = "I")
	private int anInt319;

	@OriginalMember(owner = "client!client", name = "Hf", descriptor = "I")
	private int anInt320;

	@OriginalMember(owner = "client!client", name = "If", descriptor = "J")
	private long aLong17;

	@OriginalMember(owner = "client!client", name = "Nf", descriptor = "I")
	private int anInt322;

	@OriginalMember(owner = "client!client", name = "Pf", descriptor = "Lclient!ib;")
	private Class1_Sub1_Sub2_Sub2 aClass1_Sub1_Sub2_Sub2_5;

	@OriginalMember(owner = "client!client", name = "Qf", descriptor = "Lclient!ib;")
	private Class1_Sub1_Sub2_Sub2 aClass1_Sub1_Sub2_Sub2_6;

	@OriginalMember(owner = "client!client", name = "Rf", descriptor = "Lclient!ib;")
	private Class1_Sub1_Sub2_Sub2 aClass1_Sub1_Sub2_Sub2_7;

	@OriginalMember(owner = "client!client", name = "Sf", descriptor = "Lclient!ib;")
	private Class1_Sub1_Sub2_Sub2 aClass1_Sub1_Sub2_Sub2_8;

	@OriginalMember(owner = "client!client", name = "Tf", descriptor = "I")
	private int anInt324;

	@OriginalMember(owner = "client!client", name = "Uf", descriptor = "I")
	private int anInt325;

	@OriginalMember(owner = "client!client", name = "Vf", descriptor = "I")
	private int anInt326;

	@OriginalMember(owner = "client!client", name = "bg", descriptor = "I")
	private int anInt329;

	@OriginalMember(owner = "client!client", name = "fg", descriptor = "I")
	private int anInt331;

	@OriginalMember(owner = "client!client", name = "gg", descriptor = "I")
	private int anInt332;

	@OriginalMember(owner = "client!client", name = "hg", descriptor = "I")
	private int anInt333;

	@OriginalMember(owner = "client!client", name = "ig", descriptor = "I")
	private int anInt334;

	@OriginalMember(owner = "client!client", name = "jg", descriptor = "I")
	private int anInt335;

	@OriginalMember(owner = "client!client", name = "lg", descriptor = "Lclient!e;")
	private Class8 aClass8_1;

	@OriginalMember(owner = "client!client", name = "pg", descriptor = "I")
	private int anInt337;

	@OriginalMember(owner = "client!client", name = "qg", descriptor = "I")
	private int anInt338;

	@OriginalMember(owner = "client!client", name = "rg", descriptor = "I")
	private int anInt339;

	@OriginalMember(owner = "client!client", name = "sg", descriptor = "I")
	private int anInt340;

	@OriginalMember(owner = "client!client", name = "yg", descriptor = "I")
	private int anInt342;

	@OriginalMember(owner = "client!client", name = "Dg", descriptor = "Lclient!xb;")
	private Class47 aClass47_1;

	@OriginalMember(owner = "client!client", name = "Eg", descriptor = "I")
	private int anInt345;

	@OriginalMember(owner = "client!client", name = "Fg", descriptor = "I")
	private int anInt346;

	@OriginalMember(owner = "client!client", name = "Gg", descriptor = "I")
	private int anInt347;

	@OriginalMember(owner = "client!client", name = "Hg", descriptor = "I")
	private int anInt348;

	@OriginalMember(owner = "client!client", name = "Ig", descriptor = "I")
	private int anInt349;

	@OriginalMember(owner = "client!client", name = "Jg", descriptor = "Lclient!qb;")
	private Class35 aClass35_6;

	@OriginalMember(owner = "client!client", name = "Kg", descriptor = "Lclient!qb;")
	private Class35 aClass35_7;

	@OriginalMember(owner = "client!client", name = "Lg", descriptor = "Lclient!qb;")
	private Class35 aClass35_8;

	@OriginalMember(owner = "client!client", name = "Mg", descriptor = "Lclient!qb;")
	private Class35 aClass35_9;

	@OriginalMember(owner = "client!client", name = "Ng", descriptor = "Lclient!qb;")
	private Class35 aClass35_10;

	@OriginalMember(owner = "client!client", name = "Og", descriptor = "Lclient!qb;")
	private Class35 aClass35_11;

	@OriginalMember(owner = "client!client", name = "Pg", descriptor = "Lclient!qb;")
	private Class35 aClass35_12;

	@OriginalMember(owner = "client!client", name = "Qg", descriptor = "Lclient!qb;")
	private Class35 aClass35_13;

	@OriginalMember(owner = "client!client", name = "Rg", descriptor = "Lclient!qb;")
	private Class35 aClass35_14;

	@OriginalMember(owner = "client!client", name = "Tg", descriptor = "[I")
	private int[] anIntArray72;

	@OriginalMember(owner = "client!client", name = "Ug", descriptor = "[I")
	private int[] anIntArray73;

	@OriginalMember(owner = "client!client", name = "Wg", descriptor = "Lclient!jb;")
	private Class1_Sub1_Sub2_Sub3 aClass1_Sub1_Sub2_Sub3_13;

	@OriginalMember(owner = "client!client", name = "Xg", descriptor = "Lclient!jb;")
	private Class1_Sub1_Sub2_Sub3 aClass1_Sub1_Sub2_Sub3_14;

	@OriginalMember(owner = "client!client", name = "Yg", descriptor = "Lclient!jb;")
	private Class1_Sub1_Sub2_Sub3 aClass1_Sub1_Sub2_Sub3_15;

	@OriginalMember(owner = "client!client", name = "Zg", descriptor = "Lclient!jb;")
	private Class1_Sub1_Sub2_Sub3 aClass1_Sub1_Sub2_Sub3_16;

	@OriginalMember(owner = "client!client", name = "ah", descriptor = "Lclient!jb;")
	private Class1_Sub1_Sub2_Sub3 aClass1_Sub1_Sub2_Sub3_17;

	@OriginalMember(owner = "client!client", name = "dh", descriptor = "Lclient!jb;")
	private Class1_Sub1_Sub2_Sub3 aClass1_Sub1_Sub2_Sub3_18;

	@OriginalMember(owner = "client!client", name = "eh", descriptor = "Lclient!jb;")
	private Class1_Sub1_Sub2_Sub3 aClass1_Sub1_Sub2_Sub3_19;

	@OriginalMember(owner = "client!client", name = "fh", descriptor = "Lclient!jb;")
	private Class1_Sub1_Sub2_Sub3 aClass1_Sub1_Sub2_Sub3_20;

	@OriginalMember(owner = "client!client", name = "ih", descriptor = "I")
	private int anInt350;

	@OriginalMember(owner = "client!client", name = "jh", descriptor = "I")
	private int anInt351;

	@OriginalMember(owner = "client!client", name = "kh", descriptor = "I")
	private int anInt352;

	@OriginalMember(owner = "client!client", name = "lh", descriptor = "I")
	private int anInt353;

	@OriginalMember(owner = "client!client", name = "mh", descriptor = "I")
	private int anInt354;

	@OriginalMember(owner = "client!client", name = "ph", descriptor = "I")
	private int anInt356;

	@OriginalMember(owner = "client!client", name = "rh", descriptor = "I")
	private int anInt357;

	@OriginalMember(owner = "client!client", name = "Ch", descriptor = "I")
	private int anInt360;

	@OriginalMember(owner = "client!client", name = "Dh", descriptor = "I")
	private int anInt361;

	@OriginalMember(owner = "client!client", name = "Eh", descriptor = "I")
	private int anInt362;

	@OriginalMember(owner = "client!client", name = "Fh", descriptor = "I")
	private int anInt363;

	@OriginalMember(owner = "client!client", name = "Gh", descriptor = "I")
	private int anInt364;

	@OriginalMember(owner = "client!client", name = "Hh", descriptor = "I")
	private int anInt365;

	@OriginalMember(owner = "client!client", name = "Kh", descriptor = "I")
	private int anInt367;

	@OriginalMember(owner = "client!client", name = "Ph", descriptor = "J")
	private long aLong18;

	@OriginalMember(owner = "client!client", name = "Sh", descriptor = "I")
	private int anInt370;

	@OriginalMember(owner = "client!client", name = "Th", descriptor = "I")
	private int anInt371;

	@OriginalMember(owner = "client!client", name = "Uh", descriptor = "I")
	private int anInt372;

	@OriginalMember(owner = "client!client", name = "Vh", descriptor = "I")
	private int anInt373;

	@OriginalMember(owner = "client!client", name = "Wh", descriptor = "I")
	private int anInt374;

	@OriginalMember(owner = "client!client", name = "Xh", descriptor = "I")
	private int anInt375;

	@OriginalMember(owner = "client!client", name = "Yh", descriptor = "I")
	private int anInt376;

	@OriginalMember(owner = "client!client", name = "ai", descriptor = "Lclient!r;")
	private Class37 aClass37_1;

	@OriginalMember(owner = "client!client", name = "di", descriptor = "Lclient!qb;")
	private Class35 aClass35_15;

	@OriginalMember(owner = "client!client", name = "ei", descriptor = "Lclient!qb;")
	private Class35 aClass35_16;

	@OriginalMember(owner = "client!client", name = "fi", descriptor = "Lclient!qb;")
	private Class35 aClass35_17;

	@OriginalMember(owner = "client!client", name = "gi", descriptor = "Lclient!qb;")
	private Class35 aClass35_18;

	@OriginalMember(owner = "client!client", name = "ni", descriptor = "I")
	private int anInt381;

	@OriginalMember(owner = "client!client", name = "si", descriptor = "Lclient!ib;")
	private Class1_Sub1_Sub2_Sub2 aClass1_Sub1_Sub2_Sub2_9;

	@OriginalMember(owner = "client!client", name = "ti", descriptor = "Lclient!ib;")
	private Class1_Sub1_Sub2_Sub2 aClass1_Sub1_Sub2_Sub2_10;

	@OriginalMember(owner = "client!client", name = "ui", descriptor = "I")
	private int anInt383;

	@OriginalMember(owner = "client!client", name = "xi", descriptor = "I")
	private int anInt384;

	@OriginalMember(owner = "client!client", name = "Ai", descriptor = "[I")
	private int[] anIntArray86;

	@OriginalMember(owner = "client!client", name = "Bi", descriptor = "[I")
	private int[] anIntArray87;

	@OriginalMember(owner = "client!client", name = "Ci", descriptor = "[I")
	private int[] anIntArray88;

	@OriginalMember(owner = "client!client", name = "Di", descriptor = "[I")
	private int[] anIntArray89;

	@OriginalMember(owner = "client!client", name = "Ii", descriptor = "I")
	private int anInt389;

	@OriginalMember(owner = "client!client", name = "Ki", descriptor = "I")
	private int anInt390;

	@OriginalMember(owner = "client!client", name = "Ni", descriptor = "I")
	private int anInt391;

	@OriginalMember(owner = "client!client", name = "Vi", descriptor = "I")
	private int anInt395;

	@OriginalMember(owner = "client!client", name = "Yi", descriptor = "I")
	private int anInt397;

	@OriginalMember(owner = "client!client", name = "bj", descriptor = "I")
	private int anInt400;

	@OriginalMember(owner = "client!client", name = "ej", descriptor = "I")
	private int anInt403;

	@OriginalMember(owner = "client!client", name = "fj", descriptor = "I")
	private int anInt404;

	@OriginalMember(owner = "client!client", name = "gj", descriptor = "I")
	private int anInt405;

	@OriginalMember(owner = "client!client", name = "hj", descriptor = "I")
	private int anInt406;

	@OriginalMember(owner = "client!client", name = "ij", descriptor = "I")
	private int anInt407;

	@OriginalMember(owner = "client!client", name = "lj", descriptor = "Lclient!kb;")
	private Class1_Sub1_Sub2_Sub4 aClass1_Sub1_Sub2_Sub4_1;

	@OriginalMember(owner = "client!client", name = "mj", descriptor = "Lclient!kb;")
	private Class1_Sub1_Sub2_Sub4 aClass1_Sub1_Sub2_Sub4_2;

	@OriginalMember(owner = "client!client", name = "nj", descriptor = "Lclient!kb;")
	private Class1_Sub1_Sub2_Sub4 aClass1_Sub1_Sub2_Sub4_3;

	@OriginalMember(owner = "client!client", name = "oj", descriptor = "Lclient!kb;")
	private Class1_Sub1_Sub2_Sub4 aClass1_Sub1_Sub2_Sub4_4;

	@OriginalMember(owner = "client!client", name = "pj", descriptor = "I")
	private int anInt409;

	@OriginalMember(owner = "client!client", name = "qj", descriptor = "I")
	private int anInt410;

	@OriginalMember(owner = "client!client", name = "rj", descriptor = "Lclient!ib;")
	private Class1_Sub1_Sub2_Sub2 aClass1_Sub1_Sub2_Sub2_11;

	@OriginalMember(owner = "client!client", name = "tj", descriptor = "Lclient!qb;")
	private Class35 aClass35_19;

	@OriginalMember(owner = "client!client", name = "uj", descriptor = "Lclient!qb;")
	private Class35 aClass35_20;

	@OriginalMember(owner = "client!client", name = "vj", descriptor = "Lclient!qb;")
	private Class35 aClass35_21;

	@OriginalMember(owner = "client!client", name = "wj", descriptor = "Lclient!qb;")
	private Class35 aClass35_22;

	@OriginalMember(owner = "client!client", name = "xj", descriptor = "Lclient!qb;")
	private Class35 aClass35_23;

	@OriginalMember(owner = "client!client", name = "yj", descriptor = "Lclient!qb;")
	private Class35 aClass35_24;

	@OriginalMember(owner = "client!client", name = "zj", descriptor = "Lclient!qb;")
	private Class35 aClass35_25;

	@OriginalMember(owner = "client!client", name = "Aj", descriptor = "Lclient!qb;")
	private Class35 aClass35_26;

	@OriginalMember(owner = "client!client", name = "Bj", descriptor = "Lclient!qb;")
	private Class35 aClass35_27;

	@OriginalMember(owner = "client!client", name = "Cj", descriptor = "[I")
	private int[] anIntArray92;

	@OriginalMember(owner = "client!client", name = "Dj", descriptor = "[I")
	private int[] anIntArray93;

	@OriginalMember(owner = "client!client", name = "Hj", descriptor = "Lclient!ib;")
	private Class1_Sub1_Sub2_Sub2 aClass1_Sub1_Sub2_Sub2_12;

	@OriginalMember(owner = "client!client", name = "Ij", descriptor = "Lclient!ib;")
	private Class1_Sub1_Sub2_Sub2 aClass1_Sub1_Sub2_Sub2_13;

	@OriginalMember(owner = "client!client", name = "J", descriptor = "Z")
	private boolean aBoolean53 = false;

	@OriginalMember(owner = "client!client", name = "R", descriptor = "Z")
	private boolean aBoolean54 = false;

	@OriginalMember(owner = "client!client", name = "T", descriptor = "Lclient!lb;")
	private Class1_Sub1_Sub3 aClass1_Sub1_Sub3_2 = Class1_Sub1_Sub3.method464();

	@OriginalMember(owner = "client!client", name = "Y", descriptor = "[I")
	private int[] anIntArray32 = new int[1000];

	@OriginalMember(owner = "client!client", name = "Z", descriptor = "[I")
	private int[] anIntArray33 = new int[1000];

	@OriginalMember(owner = "client!client", name = "ab", descriptor = "Z")
	private boolean aBoolean55 = false;

	@OriginalMember(owner = "client!client", name = "bb", descriptor = "B")
	private byte aByte1 = -83;

	@OriginalMember(owner = "client!client", name = "eb", descriptor = "I")
	private int anInt207 = -1;

	@OriginalMember(owner = "client!client", name = "hb", descriptor = "[Lclient!jb;")
	private Class1_Sub1_Sub2_Sub3[] aClass1_Sub1_Sub2_Sub3Array1 = new Class1_Sub1_Sub2_Sub3[2];

	@OriginalMember(owner = "client!client", name = "ib", descriptor = "[I")
	private int[] anIntArray34 = new int[500];

	@OriginalMember(owner = "client!client", name = "jb", descriptor = "[I")
	private int[] anIntArray35 = new int[500];

	@OriginalMember(owner = "client!client", name = "kb", descriptor = "[I")
	private int[] anIntArray36 = new int[500];

	@OriginalMember(owner = "client!client", name = "lb", descriptor = "[I")
	private int[] anIntArray37 = new int[500];

	@OriginalMember(owner = "client!client", name = "pb", descriptor = "I")
	private int anInt213 = 3353893;

	@OriginalMember(owner = "client!client", name = "rb", descriptor = "[I")
	private int[] anIntArray38 = new int[50];

	@OriginalMember(owner = "client!client", name = "sb", descriptor = "Z")
	private boolean aBoolean56 = false;

	@OriginalMember(owner = "client!client", name = "ub", descriptor = "[I")
	private int[] anIntArray39 = new int[7];

	@OriginalMember(owner = "client!client", name = "vb", descriptor = "Lclient!lb;")
	private Class1_Sub1_Sub3 aClass1_Sub1_Sub3_3 = Class1_Sub1_Sub3.method464();

	@OriginalMember(owner = "client!client", name = "wb", descriptor = "[I")
	private int[] anIntArray40 = new int[Class30.anInt801];

	@OriginalMember(owner = "client!client", name = "Ib", descriptor = "Z")
	public boolean aBoolean57 = false;

	@OriginalMember(owner = "client!client", name = "Mb", descriptor = "[Lclient!ib;")
	private Class1_Sub1_Sub2_Sub2[] aClass1_Sub1_Sub2_Sub2Array3 = new Class1_Sub1_Sub2_Sub2[8];

	@OriginalMember(owner = "client!client", name = "Nb", descriptor = "[I")
	private int[] anIntArray41 = new int[151];

	@OriginalMember(owner = "client!client", name = "Rb", descriptor = "[Lclient!ib;")
	private Class1_Sub1_Sub2_Sub2[] aClass1_Sub1_Sub2_Sub2Array4 = new Class1_Sub1_Sub2_Sub2[1000];

	@OriginalMember(owner = "client!client", name = "Tb", descriptor = "I")
	private int anInt222 = 78;

	@OriginalMember(owner = "client!client", name = "ac", descriptor = "[I")
	private int[] anIntArray42 = new int[151];

	@OriginalMember(owner = "client!client", name = "cc", descriptor = "B")
	private byte aByte2 = -127;

	@OriginalMember(owner = "client!client", name = "dc", descriptor = "B")
	private byte aByte3 = 38;

	@OriginalMember(owner = "client!client", name = "ec", descriptor = "[[I")
	private int[][] anIntArrayArray3 = new int[104][104];

	@OriginalMember(owner = "client!client", name = "fc", descriptor = "Z")
	private boolean aBoolean58 = false;

	@OriginalMember(owner = "client!client", name = "ic", descriptor = "I")
	private int anInt232 = -1;

	@OriginalMember(owner = "client!client", name = "mc", descriptor = "Z")
	private boolean aBoolean59 = false;

	@OriginalMember(owner = "client!client", name = "nc", descriptor = "[I")
	private int[] anIntArray43 = new int[200];

	@OriginalMember(owner = "client!client", name = "qc", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray1 = new String[500];

	@OriginalMember(owner = "client!client", name = "rc", descriptor = "Z")
	private boolean aBoolean61 = false;

	@OriginalMember(owner = "client!client", name = "tc", descriptor = "I")
	private int anInt236 = -1;

	@OriginalMember(owner = "client!client", name = "vc", descriptor = "I")
	private int anInt238 = 70;

	@OriginalMember(owner = "client!client", name = "zc", descriptor = "Z")
	private boolean aBoolean62 = false;

	@OriginalMember(owner = "client!client", name = "Bc", descriptor = "Z")
	private boolean aBoolean63 = false;

	@OriginalMember(owner = "client!client", name = "Dc", descriptor = "[I")
	private int[] anIntArray44 = new int[33];

	@OriginalMember(owner = "client!client", name = "Lc", descriptor = "Lclient!ob;")
	private Class29 aClass29_1 = new Class29(-199);

	@OriginalMember(owner = "client!client", name = "Mc", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray2 = new String[5];

	@OriginalMember(owner = "client!client", name = "Nc", descriptor = "[Z")
	private boolean[] aBooleanArray3 = new boolean[5];

	@OriginalMember(owner = "client!client", name = "Pc", descriptor = "Z")
	private boolean aBoolean64 = false;

	@OriginalMember(owner = "client!client", name = "Rc", descriptor = "I")
	private int anInt246 = -1;

	@OriginalMember(owner = "client!client", name = "Sc", descriptor = "B")
	private byte aByte4 = 1;

	@OriginalMember(owner = "client!client", name = "Wc", descriptor = "I")
	private int anInt248 = 128;

	@OriginalMember(owner = "client!client", name = "bd", descriptor = "Z")
	private boolean aBoolean65 = true;

	@OriginalMember(owner = "client!client", name = "cd", descriptor = "Z")
	private boolean aBoolean66 = false;

	@OriginalMember(owner = "client!client", name = "fd", descriptor = "[I")
	private int[] anIntArray48 = new int[5];

	@OriginalMember(owner = "client!client", name = "gd", descriptor = "Ljava/lang/String;")
	private String aString6 = "";

	@OriginalMember(owner = "client!client", name = "id", descriptor = "[I")
	private int[] anIntArray49 = new int[1000];

	@OriginalMember(owner = "client!client", name = "kd", descriptor = "[I")
	private int[] anIntArray50 = new int[5];

	@OriginalMember(owner = "client!client", name = "nd", descriptor = "Z")
	private boolean aBoolean68 = false;

	@OriginalMember(owner = "client!client", name = "pd", descriptor = "I")
	private int anInt259 = -587;

	@OriginalMember(owner = "client!client", name = "rd", descriptor = "Z")
	private boolean aBoolean69 = true;

	@OriginalMember(owner = "client!client", name = "sd", descriptor = "Ljava/util/zip/CRC32;")
	private CRC32 aCRC32_1 = new CRC32();

	@OriginalMember(owner = "client!client", name = "Bd", descriptor = "I")
	private int anInt267 = 2;

	@OriginalMember(owner = "client!client", name = "Cd", descriptor = "[I")
	private int[] anIntArray51 = new int[33];

	@OriginalMember(owner = "client!client", name = "Dd", descriptor = "I")
	private int anInt268 = 817;

	@OriginalMember(owner = "client!client", name = "Ed", descriptor = "I")
	private int anInt269 = -1;

	@OriginalMember(owner = "client!client", name = "Gd", descriptor = "I")
	private int anInt271 = -1;

	@OriginalMember(owner = "client!client", name = "Kd", descriptor = "I")
	private int anInt273 = -8033;

	@OriginalMember(owner = "client!client", name = "Pd", descriptor = "I")
	private int anInt277 = 8;

	@OriginalMember(owner = "client!client", name = "Qd", descriptor = "[[I")
	private int[][] anIntArrayArray4 = new int[104][104];

	@OriginalMember(owner = "client!client", name = "Rd", descriptor = "[I")
	private int[] anIntArray52 = new int[5];

	@OriginalMember(owner = "client!client", name = "Sd", descriptor = "B")
	private byte aByte6 = 8;

	@OriginalMember(owner = "client!client", name = "Ud", descriptor = "[J")
	private long[] aLongArray3 = new long[200];

	@OriginalMember(owner = "client!client", name = "Vd", descriptor = "Z")
	private boolean aBoolean70 = false;

	@OriginalMember(owner = "client!client", name = "ae", descriptor = "Z")
	private boolean aBoolean71 = true;

	@OriginalMember(owner = "client!client", name = "ce", descriptor = "Z")
	private boolean aBoolean72 = false;

	@OriginalMember(owner = "client!client", name = "pe", descriptor = "I")
	private int anInt292 = 2301979;

	@OriginalMember(owner = "client!client", name = "qe", descriptor = "[I")
	private int[] anIntArray54 = new int[5];

	@OriginalMember(owner = "client!client", name = "re", descriptor = "[I")
	private int[] anIntArray55 = new int[100];

	@OriginalMember(owner = "client!client", name = "se", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray3 = new String[100];

	@OriginalMember(owner = "client!client", name = "te", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray4 = new String[100];

	@OriginalMember(owner = "client!client", name = "ve", descriptor = "[I")
	private int[] anIntArray56 = new int[50];

	@OriginalMember(owner = "client!client", name = "we", descriptor = "Ljava/lang/String;")
	private String aString10 = "";

	@OriginalMember(owner = "client!client", name = "xe", descriptor = "[Lclient!z;")
	private Class1_Sub1_Sub1_Sub1_Sub2[] aClass1_Sub1_Sub1_Sub1_Sub2Array1 = new Class1_Sub1_Sub1_Sub1_Sub2[16384];

	@OriginalMember(owner = "client!client", name = "ze", descriptor = "[I")
	private int[] anIntArray57 = new int[16384];

	@OriginalMember(owner = "client!client", name = "Be", descriptor = "I")
	private int anInt296 = 2;

	@OriginalMember(owner = "client!client", name = "Ee", descriptor = "I")
	private final int anInt298 = 100;

	@OriginalMember(owner = "client!client", name = "Fe", descriptor = "[I")
	private int[] anIntArray58 = new int[100];

	@OriginalMember(owner = "client!client", name = "He", descriptor = "[I")
	private int[] anIntArray59 = new int[256];

	@OriginalMember(owner = "client!client", name = "Ie", descriptor = "I")
	private int anInt300 = 661;

	@OriginalMember(owner = "client!client", name = "Je", descriptor = "[I")
	private int[] anIntArray60 = new int[4000];

	@OriginalMember(owner = "client!client", name = "Ke", descriptor = "[I")
	private int[] anIntArray61 = new int[4000];

	@OriginalMember(owner = "client!client", name = "Le", descriptor = "[Lclient!jc;")
	private Class19[] aClass19Array1 = new Class19[4];

	@OriginalMember(owner = "client!client", name = "Ne", descriptor = "[I")
	private int[] anIntArray62 = new int[2000];

	@OriginalMember(owner = "client!client", name = "Qe", descriptor = "I")
	private int anInt302 = 3;

	@OriginalMember(owner = "client!client", name = "Ye", descriptor = "[I")
	private int[] anIntArray63 = new int[Class30.anInt801];

	@OriginalMember(owner = "client!client", name = "Ze", descriptor = "Z")
	private boolean aBoolean73 = true;

	@OriginalMember(owner = "client!client", name = "ff", descriptor = "B")
	private byte aByte7 = -71;

	@OriginalMember(owner = "client!client", name = "hf", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray5 = new String[200];

	@OriginalMember(owner = "client!client", name = "nf", descriptor = "Z")
	private boolean aBoolean74 = false;

	@OriginalMember(owner = "client!client", name = "of", descriptor = "Z")
	private boolean aBoolean75 = true;

	@OriginalMember(owner = "client!client", name = "pf", descriptor = "[I")
	private int[] anIntArray68 = new int[9];

	@OriginalMember(owner = "client!client", name = "qf", descriptor = "[Lclient!ib;")
	private Class1_Sub1_Sub2_Sub2[] aClass1_Sub1_Sub2_Sub2Array5 = new Class1_Sub1_Sub2_Sub2[100];

	@OriginalMember(owner = "client!client", name = "rf", descriptor = "B")
	private byte aByte8 = 29;

	@OriginalMember(owner = "client!client", name = "sf", descriptor = "Lclient!ob;")
	private Class29 aClass29_2 = new Class29(-199);

	@OriginalMember(owner = "client!client", name = "tf", descriptor = "Z")
	private boolean aBoolean76 = false;

	@OriginalMember(owner = "client!client", name = "uf", descriptor = "I")
	private int anInt313 = 513;

	@OriginalMember(owner = "client!client", name = "vf", descriptor = "Z")
	private boolean aBoolean77 = true;

	@OriginalMember(owner = "client!client", name = "yf", descriptor = "[I")
	private int[] anIntArray69 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

	@OriginalMember(owner = "client!client", name = "Af", descriptor = "Z")
	private boolean aBoolean79 = false;

	@OriginalMember(owner = "client!client", name = "Bf", descriptor = "I")
	private int anInt314 = -1;

	@OriginalMember(owner = "client!client", name = "Cf", descriptor = "I")
	private int anInt315 = -1;

	@OriginalMember(owner = "client!client", name = "Df", descriptor = "I")
	private int anInt316 = -1;

	@OriginalMember(owner = "client!client", name = "Jf", descriptor = "Ljava/lang/String;")
	private String aString11 = "";

	@OriginalMember(owner = "client!client", name = "Kf", descriptor = "Ljava/lang/String;")
	private String aString12 = "";

	@OriginalMember(owner = "client!client", name = "Mf", descriptor = "I")
	private int anInt321 = -940;

	@OriginalMember(owner = "client!client", name = "Of", descriptor = "I")
	private int anInt323 = 1;

	@OriginalMember(owner = "client!client", name = "Wf", descriptor = "Z")
	private boolean aBoolean80 = false;

	@OriginalMember(owner = "client!client", name = "Xf", descriptor = "I")
	private int anInt327 = 7759444;

	@OriginalMember(owner = "client!client", name = "Yf", descriptor = "B")
	private byte aByte9 = 38;

	@OriginalMember(owner = "client!client", name = "cg", descriptor = "[I")
	private int[] anIntArray71 = new int[Class30.anInt801];

	@OriginalMember(owner = "client!client", name = "dg", descriptor = "I")
	private int anInt330 = 37395;

	@OriginalMember(owner = "client!client", name = "eg", descriptor = "Ljava/lang/String;")
	private String aString13 = "";

	@OriginalMember(owner = "client!client", name = "kg", descriptor = "B")
	private byte aByte10 = 29;

	@OriginalMember(owner = "client!client", name = "ng", descriptor = "B")
	private byte aByte11 = 6;

	@OriginalMember(owner = "client!client", name = "og", descriptor = "Ljava/lang/String;")
	private String aString14 = "";

	@OriginalMember(owner = "client!client", name = "tg", descriptor = "I")
	private int anInt341 = 1;

	@OriginalMember(owner = "client!client", name = "ug", descriptor = "[Lclient!ib;")
	private Class1_Sub1_Sub2_Sub2[] aClass1_Sub1_Sub2_Sub2Array6 = new Class1_Sub1_Sub2_Sub2[20];

	@OriginalMember(owner = "client!client", name = "vg", descriptor = "[B")
	private byte[] aByteArray2 = new byte[16384];

	@OriginalMember(owner = "client!client", name = "wg", descriptor = "Ljava/lang/String;")
	private String aString15 = "";

	@OriginalMember(owner = "client!client", name = "xg", descriptor = "Ljava/lang/String;")
	private String aString16 = "";

	@OriginalMember(owner = "client!client", name = "zg", descriptor = "[[I")
	private int[][] anIntArrayArray6 = new int[104][104];

	@OriginalMember(owner = "client!client", name = "Bg", descriptor = "I")
	private int anInt344 = -1;

	@OriginalMember(owner = "client!client", name = "Cg", descriptor = "Lclient!ob;")
	private Class29 aClass29_3 = new Class29(-199);

	@OriginalMember(owner = "client!client", name = "Sg", descriptor = "Lclient!lb;")
	private Class1_Sub1_Sub3 aClass1_Sub1_Sub3_4 = Class1_Sub1_Sub3.method464();

	@OriginalMember(owner = "client!client", name = "bh", descriptor = "Ljava/lang/String;")
	private String aString17 = "";

	@OriginalMember(owner = "client!client", name = "ch", descriptor = "[I")
	private final int[] anIntArray74 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

	@OriginalMember(owner = "client!client", name = "gh", descriptor = "[[[Lclient!ob;")
	private Class29[][][] aClass29ArrayArrayArray1 = new Class29[4][104][104];

	@OriginalMember(owner = "client!client", name = "hh", descriptor = "Z")
	private boolean aBoolean81 = false;

	@OriginalMember(owner = "client!client", name = "nh", descriptor = "I")
	private int anInt355 = -6002;

	@OriginalMember(owner = "client!client", name = "oh", descriptor = "Z")
	private boolean aBoolean82 = false;

	@OriginalMember(owner = "client!client", name = "qh", descriptor = "Z")
	private boolean aBoolean83 = false;

	@OriginalMember(owner = "client!client", name = "sh", descriptor = "I")
	private int anInt358 = 50;

	@OriginalMember(owner = "client!client", name = "th", descriptor = "[I")
	private int[] anIntArray75 = new int[this.anInt358];

	@OriginalMember(owner = "client!client", name = "uh", descriptor = "[I")
	private int[] anIntArray76 = new int[this.anInt358];

	@OriginalMember(owner = "client!client", name = "vh", descriptor = "[I")
	private int[] anIntArray77 = new int[this.anInt358];

	@OriginalMember(owner = "client!client", name = "wh", descriptor = "[I")
	private int[] anIntArray78 = new int[this.anInt358];

	@OriginalMember(owner = "client!client", name = "xh", descriptor = "[I")
	private int[] anIntArray79 = new int[this.anInt358];

	@OriginalMember(owner = "client!client", name = "yh", descriptor = "[I")
	private int[] anIntArray80 = new int[this.anInt358];

	@OriginalMember(owner = "client!client", name = "zh", descriptor = "[I")
	private int[] anIntArray81 = new int[this.anInt358];

	@OriginalMember(owner = "client!client", name = "Ah", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray6 = new String[this.anInt358];

	@OriginalMember(owner = "client!client", name = "Ih", descriptor = "Z")
	private boolean aBoolean84 = false;

	@OriginalMember(owner = "client!client", name = "Lh", descriptor = "I")
	private int anInt368 = -1;

	@OriginalMember(owner = "client!client", name = "Mh", descriptor = "Z")
	private boolean aBoolean85 = true;

	@OriginalMember(owner = "client!client", name = "Nh", descriptor = "Z")
	private boolean aBoolean86 = true;

	@OriginalMember(owner = "client!client", name = "Qh", descriptor = "B")
	private byte aByte12 = 2;

	@OriginalMember(owner = "client!client", name = "Rh", descriptor = "[Lclient!ib;")
	private Class1_Sub1_Sub2_Sub2[] aClass1_Sub1_Sub2_Sub2Array7 = new Class1_Sub1_Sub2_Sub2[20];

	@OriginalMember(owner = "client!client", name = "Zh", descriptor = "Z")
	private boolean aBoolean87 = true;

	@OriginalMember(owner = "client!client", name = "bi", descriptor = "[I")
	private int[] anIntArray82 = new int[50];

	@OriginalMember(owner = "client!client", name = "hi", descriptor = "I")
	private int anInt377 = -1;

	@OriginalMember(owner = "client!client", name = "ii", descriptor = "I")
	private int anInt378 = 5063219;

	@OriginalMember(owner = "client!client", name = "ji", descriptor = "Lclient!d;")
	private Class6 aClass6_1 = new Class6();

	@OriginalMember(owner = "client!client", name = "ki", descriptor = "I")
	private int anInt379 = 9;

	@OriginalMember(owner = "client!client", name = "li", descriptor = "[I")
	private int[] anIntArray83 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

	@OriginalMember(owner = "client!client", name = "oi", descriptor = "[I")
	private int[] anIntArray84 = new int[5];

	@OriginalMember(owner = "client!client", name = "qi", descriptor = "[Lclient!vb;")
	public Class45[] aClass45Array1 = new Class45[5];

	@OriginalMember(owner = "client!client", name = "ri", descriptor = "[Z")
	private boolean[] aBooleanArray4 = new boolean[5];

	@OriginalMember(owner = "client!client", name = "vi", descriptor = "B")
	private byte aByte14 = 1;

	@OriginalMember(owner = "client!client", name = "wi", descriptor = "[I")
	public int[] anIntArray85 = new int[2000];

	@OriginalMember(owner = "client!client", name = "yi", descriptor = "I")
	private int anInt385 = 2;

	@OriginalMember(owner = "client!client", name = "zi", descriptor = "I")
	private int anInt386 = -1;

	@OriginalMember(owner = "client!client", name = "Ei", descriptor = "Z")
	private boolean aBoolean88 = false;

	@OriginalMember(owner = "client!client", name = "Fi", descriptor = "I")
	private int anInt387 = 2048;

	@OriginalMember(owner = "client!client", name = "Gi", descriptor = "I")
	private int anInt388 = 2047;

	@OriginalMember(owner = "client!client", name = "Hi", descriptor = "[Lclient!ab;")
	private Class1_Sub1_Sub1_Sub1_Sub1[] aClass1_Sub1_Sub1_Sub1_Sub1Array1 = new Class1_Sub1_Sub1_Sub1_Sub1[this.anInt387];

	@OriginalMember(owner = "client!client", name = "Ji", descriptor = "[I")
	private int[] anIntArray90 = new int[this.anInt387];

	@OriginalMember(owner = "client!client", name = "Li", descriptor = "[I")
	private int[] anIntArray91 = new int[this.anInt387];

	@OriginalMember(owner = "client!client", name = "Mi", descriptor = "[Lclient!lb;")
	private Class1_Sub1_Sub3[] aClass1_Sub1_Sub3Array1 = new Class1_Sub1_Sub3[this.anInt387];

	@OriginalMember(owner = "client!client", name = "Si", descriptor = "Z")
	private boolean aBoolean91 = false;

	@OriginalMember(owner = "client!client", name = "Ti", descriptor = "Z")
	private boolean aBoolean92 = false;

	@OriginalMember(owner = "client!client", name = "Xi", descriptor = "[Lclient!jb;")
	private Class1_Sub1_Sub2_Sub3[] aClass1_Sub1_Sub2_Sub3Array3 = new Class1_Sub1_Sub2_Sub3[100];

	@OriginalMember(owner = "client!client", name = "Zi", descriptor = "I")
	private int anInt398 = 831;

	@OriginalMember(owner = "client!client", name = "aj", descriptor = "I")
	private int anInt399 = 393;

	@OriginalMember(owner = "client!client", name = "dj", descriptor = "I")
	private int anInt402 = -282;

	@OriginalMember(owner = "client!client", name = "jj", descriptor = "I")
	private int anInt408 = -1;

	@OriginalMember(owner = "client!client", name = "kj", descriptor = "[J")
	private long[] aLongArray4 = new long[100];

	@OriginalMember(owner = "client!client", name = "sj", descriptor = "Z")
	private boolean aBoolean93 = false;

	@OriginalMember(owner = "client!client", name = "Fj", descriptor = "Z")
	private boolean aBoolean94 = false;

	@OriginalMember(owner = "client!client", name = "Gj", descriptor = "[Lclient!jb;")
	private Class1_Sub1_Sub2_Sub3[] aClass1_Sub1_Sub2_Sub3Array4 = new Class1_Sub1_Sub2_Sub3[13];

	static {
		@Pc(10) int local10 = 0;
		@Pc(12) int local12;
		for (local12 = 0; local12 < 99; local12++) {
			@Pc(17) int local17 = local12 + 1;
			@Pc(30) int local30 = (int) ((double) local17 + Math.pow(2.0D, (double) local17 / 7.0D) * 300.0D);
			local10 += local30;
			anIntArray53[local12] = local10 / 4;
		}
		anIntArray67 = new int[] { 9104, 10275, 7595, 3610, 7975, 8526, 918, 38802, 24466, 10145, 58654, 5027, 1457, 16565, 34991, 25486 };
		aBigInteger1 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");
		anIntArrayArray5 = new int[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, 33697, 22433, 2983, 54193 }, { 8741, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003, 25239 }, { 25238, 8742, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };
		anIntArray70 = new int[32];
		local10 = 2;
		for (local12 = 0; local12 < 32; local12++) {
			anIntArray70[local12] = local10 - 1;
			local10 += local10;
		}
		aBigInteger2 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");
		aByte13 = 102;
		anInt392 = 10;
		aBoolean89 = true;
		anInt401 = 604;
	}

	@OriginalMember(owner = "client!client", name = "main", descriptor = "([Ljava/lang/String;)V")
	public static void main(@OriginalArg(0) String[] arg0) {
		try {
			System.out.println("RS2 user client - release #" + 289);
			if (arg0.length == 5) {
				anInt392 = Integer.parseInt(arg0[0]);
				anInt393 = Integer.parseInt(arg0[1]);
				if (arg0[2].equals("lowmem")) {
					method213(aByte13);
				} else if (arg0[2].equals("highmem")) {
					method146();
				} else {
					System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
					return;
				}
				if (arg0[3].equals("free")) {
					aBoolean89 = false;
				} else if (arg0[3].equals("members")) {
					aBoolean89 = true;
				} else {
					System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
					return;
				}
				signlink.anInt929 = Integer.parseInt(arg0[4]);
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
	private static void method146() {
		try {
			Class37.aBoolean223 = false;
			Class1_Sub1_Sub2_Sub1.aBoolean154 = false;
			aBoolean90 = false;
			Class4.aBoolean39 = false;
		} catch (@Pc(13) RuntimeException local13) {
			signlink.reporterror("78522, " + true + ", " + local13.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(IB)Ljava/lang/String;")
	private static String method180(@OriginalArg(0) int arg0) {
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
		} catch (@Pc(96) RuntimeException local96) {
			signlink.reporterror("6522, " + arg0 + ", " + 5 + ", " + local96.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(II)Ljava/lang/String;")
	private static String method182(@OriginalArg(0) int arg0) {
		try {
			if (arg0 < 100000) {
				return String.valueOf(arg0);
			} else if (arg0 < 10000000) {
				return arg0 / 1000 + "K";
			} else {
				return arg0 / 1000000 + "M";
			}
		} catch (@Pc(36) RuntimeException local36) {
			signlink.reporterror("1290, " + arg0 + ", " + 656 + ", " + local36.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "u", descriptor = "(B)V")
	private static void method213(@OriginalArg(0) byte arg0) {
		try {
			Class37.aBoolean223 = true;
			if (arg0 != 102) {
				for (@Pc(6) int local6 = 1; local6 > 0; local6++) {
				}
			}
			Class1_Sub1_Sub2_Sub1.aBoolean154 = true;
			aBoolean90 = true;
			Class4.aBoolean39 = true;
		} catch (@Pc(19) RuntimeException local19) {
			signlink.reporterror("41041, " + arg0 + ", " + local19.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(III)Ljava/lang/String;")
	private static String method219(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(10) int local10 = arg1 - arg0;
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
			signlink.reporterror("90622, " + arg0 + ", " + arg1 + ", " + -41081 + ", " + local51.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "init", descriptor = "()V")
	@Override
	public void init() {
		anInt392 = Integer.parseInt(this.getParameter("nodeid"));
		anInt393 = Integer.parseInt(this.getParameter("portoff"));
		@Pc(15) String local15 = this.getParameter("lowmem");
		if (local15 != null && local15.equals("1")) {
			method213(aByte13);
		} else {
			method146();
		}
		@Pc(31) String local31 = this.getParameter("free");
		if (local31 != null && local31.equals("1")) {
			aBoolean89 = false;
		} else {
			aBoolean89 = true;
		}
		this.method84();
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(I)V")
	@Override
	protected void method89() {
		try {
			if (!this.aBoolean91 && !this.aBoolean76 && !this.aBoolean54) {
				anInt396++;
				if (this.aBoolean57) {
					this.method138(this.anInt313);
				} else {
					this.method179();
				}
				this.method175();
			}
		} catch (@Pc(38) RuntimeException local38) {
			signlink.reporterror("47231, " + 9 + ", " + local38.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
	@Override
	public AppletContext getAppletContext() {
		return signlink.mainapp == null ? super.getAppletContext() : signlink.mainapp.getAppletContext();
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(B)V")
	private void method96() {
		try {
			if (this.anInt333 == 0) {
				@Pc(11) int local11 = super.anInt191;
				if (this.anInt287 == 1 && super.anInt192 >= 516 && super.anInt193 >= 160 && super.anInt192 <= 765 && super.anInt193 <= 205) {
					local11 = 0;
				}
				@Pc(42) int local42;
				@Pc(45) int local45;
				@Pc(121) int local121;
				if (this.aBoolean68) {
					if (local11 != 1) {
						local42 = super.anInt186;
						local45 = super.anInt187;
						if (this.anInt305 == 0) {
							local42 -= 4;
							local45 -= 4;
						}
						if (this.anInt305 == 1) {
							local42 -= 553;
							local45 -= 205;
						}
						if (this.anInt305 == 2) {
							local42 -= 17;
							local45 -= 357;
						}
						if (local42 < this.anInt306 - 10 || local42 > this.anInt306 + this.anInt308 + 10 || local45 < this.anInt307 - 10 || local45 > this.anInt307 + this.anInt309 + 10) {
							this.aBoolean68 = false;
							if (this.anInt305 == 1) {
								this.aBoolean61 = true;
							}
							if (this.anInt305 == 2) {
								this.aBoolean74 = true;
							}
						}
					}
					if (local11 == 1) {
						local42 = this.anInt306;
						local45 = this.anInt307;
						local121 = this.anInt308;
						@Pc(124) int local124 = super.anInt192;
						@Pc(127) int local127 = super.anInt193;
						if (this.anInt305 == 0) {
							local124 -= 4;
							local127 -= 4;
						}
						if (this.anInt305 == 1) {
							local124 -= 553;
							local127 -= 205;
						}
						if (this.anInt305 == 2) {
							local124 -= 17;
							local127 -= 357;
						}
						@Pc(146) int local146 = -1;
						for (@Pc(148) int local148 = 0; local148 < this.anInt275; local148++) {
							@Pc(163) int local163 = local45 + (this.anInt275 - 1 - local148) * 15 + 31;
							if (local124 > local42 && local124 < local42 + local121 && local127 > local163 - 13 && local127 < local163 + 3) {
								local146 = local148;
							}
						}
						if (local146 != -1) {
							this.method216(local146, 725);
						}
						this.aBoolean68 = false;
						if (this.anInt305 == 1) {
							this.aBoolean61 = true;
						}
						if (this.anInt305 == 2) {
							this.aBoolean74 = true;
							return;
						}
					}
				} else {
					if (local11 == 1 && this.anInt275 > 0) {
						local42 = this.anIntArray36[this.anInt275 - 1];
						if (local42 == 582 || local42 == 113 || local42 == 555 || local42 == 331 || local42 == 354 || local42 == 694 || local42 == 962 || local42 == 795 || local42 == 681 || local42 == 100 || local42 == 102 || local42 == 1328) {
							local45 = this.anIntArray34[this.anInt275 - 1];
							local121 = this.anIntArray35[this.anInt275 - 1];
							@Pc(283) Class6 local283 = Class6.aClass6Array1[local121];
							if (local283.aBoolean98 || local283.aBoolean101) {
								this.aBoolean56 = false;
								this.anInt278 = 0;
								this.anInt331 = local121;
								this.anInt332 = local45;
								this.anInt333 = 2;
								this.anInt334 = super.anInt192;
								this.anInt335 = super.anInt193;
								if (Class6.aClass6Array1[local121].anInt416 == this.anInt377) {
									this.anInt333 = 1;
								}
								if (Class6.aClass6Array1[local121].anInt416 == this.anInt408) {
									this.anInt333 = 3;
								}
								return;
							}
						}
					}
					if (local11 == 1 && (this.anInt218 == 1 || this.method108(this.anInt275 - 1)) && this.anInt275 > 2) {
						local11 = 2;
					}
					if (local11 == 1 && this.anInt275 > 0) {
						this.method216(this.anInt275 - 1, 725);
					}
					if (local11 != 2 || this.anInt275 <= 0) {
						return;
					}
					this.method171(this.anInt235);
				}
			}
		} catch (@Pc(379) RuntimeException local379) {
			signlink.reporterror("43374, " + 1 + ", " + local379.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILclient!ib;II)V")
	private void method97(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub1_Sub2_Sub2 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		try {
			@Pc(7) int local7 = arg0 * arg0 + arg2 * arg2;
			if (arg3 != 0) {
				this.aClass1_Sub1_Sub3_3.method466(121);
			}
			if (local7 > 4225 && local7 < 90000) {
				@Pc(27) int local27 = this.anInt249 + this.anInt266 & 0x7FF;
				@Pc(31) int local31 = Class1_Sub1_Sub1_Sub5.anIntArray151[local27];
				@Pc(35) int local35 = Class1_Sub1_Sub1_Sub5.anIntArray152[local27];
				@Pc(44) int local44 = local31 * 256 / (this.anInt322 + 256);
				@Pc(53) int local53 = local35 * 256 / (this.anInt322 + 256);
				@Pc(63) int local63 = arg2 * local44 + arg0 * local53 >> 16;
				@Pc(73) int local73 = arg2 * local53 - arg0 * local44 >> 16;
				@Pc(79) double local79 = Math.atan2((double) local63, (double) local73);
				@Pc(85) int local85 = (int) (Math.sin(local79) * 63.0D);
				@Pc(91) int local91 = (int) (Math.cos(local79) * 57.0D);
				this.aClass1_Sub1_Sub2_Sub2_11.method393(local79, local85 + 94 + 4 - 10, (byte) 8, 83 - local91 - 20);
			} else {
				this.method223(arg0, arg1, arg2);
			}
		} catch (@Pc(122) RuntimeException local122) {
			signlink.reporterror("6403, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local122.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "f", descriptor = "(I)V")
	private void method98() {
		try {
			this.method145();
			if (this.anInt199 == 1) {
				this.aClass1_Sub1_Sub2_Sub2Array3[this.anInt198 / 100].method388(this.anInt197 - 8 - 4, this.aByte14, this.anInt196 - 8 - 4);
			}
			if (this.anInt199 == 2) {
				this.aClass1_Sub1_Sub2_Sub2Array3[this.anInt198 / 100 + 4].method388(this.anInt197 - 8 - 4, this.aByte14, this.anInt196 - 8 - 4);
				anInt245++;
				if (anInt245 > 57) {
					anInt245 = 0;
					this.aClass1_Sub1_Sub3_3.method465(85);
				}
			}
			if (this.anInt246 != -1) {
				this.method147(this.anInt202, this.anInt246);
				this.method119(0, 0, Class6.aClass6Array1[this.anInt246], 0);
			}
			if (this.anInt377 != -1) {
				this.method147(this.anInt202, this.anInt377);
				this.method119(0, 0, Class6.aClass6Array1[this.anInt377], 0);
			}
			this.method106();
			if (this.anInt273 != -8033) {
				this.aClass1_Sub1_Sub3_3.method466(186);
			}
			if (!this.aBoolean68) {
				this.method136((byte) 6);
				this.method134();
			} else if (this.anInt305 == 0) {
				this.method197();
			}
			if (this.anInt342 == 1) {
				this.aClass1_Sub1_Sub2_Sub2Array7[1].method388(296, this.aByte14, 472);
			}
			if (this.anInt290 != 0) {
				@Pc(163) int local163 = this.anInt290 / 50;
				@Pc(167) int local167 = local163 / 60;
				@Pc(171) int local171 = local163 % 60;
				if (local171 < 10) {
					this.aClass1_Sub1_Sub2_Sub4_2.method447(16776960, "System update in: " + local167 + ":0" + local171, 4, 329);
				} else {
					this.aClass1_Sub1_Sub2_Sub4_2.method447(16776960, "System update in: " + local167 + ":" + local171, 4, 329);
				}
			}
		} catch (@Pc(213) RuntimeException local213) {
			signlink.reporterror("39313, " + -8033 + ", " + local213.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IBLjava/lang/String;Ljava/lang/String;)V")
	private void method99(@OriginalArg(0) int arg0, @OriginalArg(2) String arg1, @OriginalArg(3) String arg2) {
		try {
			if (arg0 == 0 && this.anInt271 != -1) {
				this.aString4 = arg1;
				super.anInt191 = 0;
			}
			if (this.anInt408 == -1) {
				this.aBoolean74 = true;
			}
			for (@Pc(20) int local20 = 99; local20 > 0; local20--) {
				this.anIntArray55[local20] = this.anIntArray55[local20 - 1];
				this.aStringArray3[local20] = this.aStringArray3[local20 - 1];
				this.aStringArray4[local20] = this.aStringArray4[local20 - 1];
			}
			this.anIntArray55[0] = arg0;
			this.aStringArray3[0] = arg2;
			this.aStringArray4[0] = arg1;
		} catch (@Pc(80) RuntimeException local80) {
			signlink.reporterror("60879, " + arg0 + ", " + -115 + ", " + arg1 + ", " + arg2 + ", " + local80.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "g", descriptor = "(I)V")
	private void method100() {
		try {
			this.anInt361 += 0;
			signlink.anInt934 = 0;
			signlink.midi = "stop";
		} catch (@Pc(11) RuntimeException local11) {
			signlink.reporterror("82229, " + 0 + ", " + local11.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(BLclient!d;)Z")
	private boolean method101(@OriginalArg(1) Class6 arg0) {
		try {
			@Pc(10) int local10 = arg0.anInt419;
			if (this.anInt339 == 2) {
				if (local10 == 201) {
					this.aBoolean74 = true;
					this.aBoolean70 = false;
					this.aBoolean88 = true;
					this.aString10 = "";
					this.anInt228 = 1;
					this.aString14 = "Enter name of friend to add to list";
				}
				if (local10 == 202) {
					this.aBoolean74 = true;
					this.aBoolean70 = false;
					this.aBoolean88 = true;
					this.aString10 = "";
					this.anInt228 = 2;
					this.aString14 = "Enter name of friend to delete from list";
				}
			}
			if (local10 == 205) {
				this.anInt365 = 250;
				return true;
			}
			if (local10 == 501) {
				this.aBoolean74 = true;
				this.aBoolean70 = false;
				this.aBoolean88 = true;
				this.aString10 = "";
				this.anInt228 = 4;
				this.aString14 = "Enter name of player to add to list";
			}
			if (local10 == 502) {
				this.aBoolean74 = true;
				this.aBoolean70 = false;
				this.aBoolean88 = true;
				this.aString10 = "";
				this.anInt228 = 5;
				this.aString14 = "Enter name of player to delete from list";
			}
			@Pc(118) int local118;
			@Pc(122) int local122;
			@Pc(127) int local127;
			if (local10 >= 300 && local10 <= 313) {
				local118 = (local10 - 300) / 2;
				local122 = local10 & 0x1;
				local127 = this.anIntArray39[local118];
				if (local127 != -1) {
					while (true) {
						if (local122 == 0) {
							local127--;
							if (local127 < 0) {
								local127 = Class23.anInt741 - 1;
							}
						}
						if (local122 == 1) {
							local127++;
							if (local127 >= Class23.anInt741) {
								local127 = 0;
							}
						}
						if (!Class23.aClass23Array1[local127].aBoolean201 && Class23.aClass23Array1[local127].anInt742 == local118 + (this.aBoolean86 ? 0 : 7)) {
							this.anIntArray39[local118] = local127;
							this.aBoolean53 = true;
							break;
						}
					}
				}
			}
			if (local10 >= 314 && local10 <= 323) {
				local118 = (local10 - 314) / 2;
				local122 = local10 & 0x1;
				local127 = this.anIntArray48[local118];
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
				this.anIntArray48[local118] = local127;
				this.aBoolean53 = true;
			}
			if (local10 == 324 && !this.aBoolean86) {
				this.aBoolean86 = true;
				this.method152(this.aByte2);
			}
			if (local10 == 325 && this.aBoolean86) {
				this.aBoolean86 = false;
				this.method152(this.aByte2);
			}
			if (local10 == 326) {
				this.aClass1_Sub1_Sub3_3.method465(27);
				this.aClass1_Sub1_Sub3_3.method466(this.aBoolean86 ? 0 : 1);
				for (local118 = 0; local118 < 7; local118++) {
					this.aClass1_Sub1_Sub3_3.method466(this.anIntArray39[local118]);
				}
				for (local122 = 0; local122 < 5; local122++) {
					this.aClass1_Sub1_Sub3_3.method466(this.anIntArray48[local122]);
				}
				return true;
			}
			if (local10 == 613) {
				this.aBoolean72 = !this.aBoolean72;
			}
			if (local10 >= 601 && local10 <= 612) {
				this.method110();
				if (this.aString6.length() > 0) {
					this.aClass1_Sub1_Sub3_3.method465(94);
					this.aClass1_Sub1_Sub3_3.method472(Class48.method663(this.aString6));
					this.aClass1_Sub1_Sub3_3.method466(local10 - 601);
					this.aClass1_Sub1_Sub3_3.method466(this.aBoolean72 ? 1 : 0);
				}
			}
			return false;
		} catch (@Pc(357) RuntimeException local357) {
			signlink.reporterror("38005, " + -16 + ", " + arg0 + ", " + local357.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "h", descriptor = "(I)V")
	private void method102() {
		try {
			@Pc(11) int local11;
			for (@Pc(3) int local3 = -1; local3 < this.anInt389; local3++) {
				if (local3 == -1) {
					local11 = this.anInt388;
				} else {
					local11 = this.anIntArray90[local3];
				}
				@Pc(23) Class1_Sub1_Sub1_Sub1_Sub1 local23 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local11];
				if (local23 != null && local23.anInt991 > 0) {
					local23.anInt991--;
					if (local23.anInt991 == 0) {
						local23.aString31 = null;
					}
				}
			}
			for (local11 = 0; local11 < this.anInt294; local11++) {
				@Pc(54) int local54 = this.anIntArray57[local11];
				@Pc(59) Class1_Sub1_Sub1_Sub1_Sub2 local59 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local54];
				if (local59 != null && local59.anInt991 > 0) {
					local59.anInt991--;
					if (local59.anInt991 == 0) {
						local59.aString31 = null;
					}
				}
			}
		} catch (@Pc(89) RuntimeException local89) {
			signlink.reporterror("41421, " + 0 + ", " + local89.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIIII)V")
	private void method103(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		try {
			this.aClass1_Sub1_Sub2_Sub3_11.method415(arg0, this.aByte14, arg1);
			this.aClass1_Sub1_Sub2_Sub3_12.method415(arg0 + arg4 - 16, this.aByte14, arg1);
			Class1_Sub1_Sub2.method436(this.anInt292, 210, arg0 + 16, arg4 - 32, arg1, 16);
			@Pc(37) int local37 = (arg4 - 32) * arg4 / arg3;
			if (local37 < 8) {
				local37 = 8;
			}
			@Pc(54) int local54 = (arg4 - local37 - 32) * arg2 / (arg3 - arg4);
			Class1_Sub1_Sub2.method436(this.anInt378, 210, arg0 + local54 + 16, local37, arg1, 16);
			Class1_Sub1_Sub2.method441(arg0 + local54 + 16, arg1, this.anInt327, local37);
			Class1_Sub1_Sub2.method441(arg0 + local54 + 16, arg1 + 1, this.anInt327, local37);
			Class1_Sub1_Sub2.method439(16, arg1, this.anInt327, arg0 + local54 + 16);
			Class1_Sub1_Sub2.method439(16, arg1, this.anInt327, arg0 + local54 + 17);
			Class1_Sub1_Sub2.method441(arg0 + local54 + 16, arg1 + 15, this.anInt213, local37);
			Class1_Sub1_Sub2.method441(arg0 + local54 + 17, arg1 + 14, this.anInt213, local37 - 1);
			Class1_Sub1_Sub2.method439(16, arg1, this.anInt213, arg0 + local54 + local37 + 15);
			Class1_Sub1_Sub2.method439(15, arg1 + 1, this.anInt213, arg0 + local54 + local37 + 14);
		} catch (@Pc(176) RuntimeException local176) {
			signlink.reporterror("34190, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + 3 + ", " + local176.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(B)V")
	private void method104() {
		try {
			try {
				if (this.aClass8_1 != null) {
					this.aClass8_1.method246();
				}
			} catch (@Pc(7) Exception local7) {
			}
			this.aClass8_1 = null;
			this.aBoolean57 = false;
			this.anInt297 = 0;
			this.aString11 = "";
			this.aString12 = "";
			this.method158(this.aByte7);
			this.aClass37_1.method526();
			for (@Pc(38) int local38 = 0; local38 < 4; local38++) {
				this.aClass19Array1[local38].method417();
			}
			System.gc();
			this.method100();
			this.anInt269 = -1;
			this.anInt376 = -1;
			this.anInt255 = 0;
		} catch (@Pc(65) RuntimeException local65) {
			signlink.reporterror("79964, " + 25 + ", " + local65.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "i", descriptor = "(I)V")
	private void method105() {
		try {
			if (this.anInt229 == 2) {
				for (@Pc(15) Class1_Sub2 local15 = (Class1_Sub2) this.aClass29_3.method507(); local15 != null; local15 = (Class1_Sub2) this.aClass29_3.method509()) {
					if (local15.anInt781 > 0) {
						local15.anInt781--;
					}
					if (local15.anInt781 != 0) {
						if (local15.anInt780 > 0) {
							local15.anInt780--;
						}
						if (local15.anInt780 == 0 && local15.anInt772 >= 1 && local15.anInt773 >= 1 && local15.anInt772 <= 102 && local15.anInt773 <= 102 && (local15.anInt777 < 0 || Class4.method71(local15.anInt777, local15.anInt779))) {
							this.method155(local15.anInt778, local15.anInt779, local15.anInt770, local15.anInt777, local15.anInt772, local15.anInt771, local15.anInt773);
							local15.anInt780 = -1;
							if (local15.anInt777 == local15.anInt774 && local15.anInt774 == -1) {
								local15.method669();
							} else if (local15.anInt777 == local15.anInt774 && local15.anInt778 == local15.anInt775 && local15.anInt779 == local15.anInt776) {
								local15.method669();
							}
						}
					} else if (local15.anInt774 < 0 || Class4.method71(local15.anInt774, local15.anInt776)) {
						this.method155(local15.anInt775, local15.anInt776, local15.anInt770, local15.anInt774, local15.anInt772, local15.anInt771, local15.anInt773);
						local15.method669();
					}
				}
			}
		} catch (@Pc(158) RuntimeException local158) {
			signlink.reporterror("56217, " + 845 + ", " + local158.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(B)V")
	private void method106() {
		try {
			this.anInt400 = 0;
			@Pc(18) int local18 = (aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt980 >> 7) + this.anInt370;
			@Pc(26) int local26 = (aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt981 >> 7) + this.anInt371;
			if (local18 >= 3053 && local18 <= 3156 && local26 >= 3056 && local26 <= 3136) {
				this.anInt400 = 1;
			}
			if (local18 >= 3072 && local18 <= 3118 && local26 >= 9492 && local26 <= 9535) {
				this.anInt400 = 1;
			}
			if (this.anInt400 == 1 && local18 >= 3139 && local18 <= 3199 && local26 >= 3008 && local26 <= 3062) {
				this.anInt400 = 0;
			}
		} catch (@Pc(77) RuntimeException local77) {
			signlink.reporterror("82905, " + -128 + ", " + local77.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "j", descriptor = "(I)V")
	private void method107(@OriginalArg(0) int arg0) {
		try {
			@Pc(12) int local12;
			for (@Pc(5) int local5 = 10; local5 < 117; local5++) {
				local12 = (int) (Math.random() * 100.0D);
				if (local12 < 50) {
					this.anIntArray92[local5 + 32512] = 255;
				}
			}
			@Pc(41) int local41;
			@Pc(48) int local48;
			@Pc(54) int local54;
			for (local12 = 0; local12 < 100; local12++) {
				local41 = (int) (Math.random() * 124.0D) + 2;
				local48 = (int) (Math.random() * 128.0D) + 128;
				local54 = local41 + (local48 << 7);
				this.anIntArray92[local54] = 192;
			}
			for (local41 = 1; local41 < 255; local41++) {
				for (local48 = 1; local48 < 127; local48++) {
					local54 = local48 + (local41 << 7);
					this.anIntArray93[local54] = (this.anIntArray92[local54 - 1] + this.anIntArray92[local54 + 1] + this.anIntArray92[local54 - 128] + this.anIntArray92[local54 + 128]) / 4;
				}
			}
			this.anInt233 += 128;
			@Pc(130) boolean local130 = false;
			if (this.anInt233 > this.anIntArray72.length) {
				this.anInt233 -= this.anIntArray72.length;
				local48 = (int) (Math.random() * 12.0D);
				this.method191(this.aClass1_Sub1_Sub2_Sub3Array2[local48]);
			}
			@Pc(170) int local170;
			for (local48 = 1; local48 < 255; local48++) {
				for (local54 = 1; local54 < 127; local54++) {
					local170 = local54 + (local48 << 7);
					@Pc(193) int local193 = this.anIntArray93[local170 + 128] - this.anIntArray72[local170 + this.anInt233 & this.anIntArray72.length - 1] / 5;
					if (local193 < 0) {
						local193 = 0;
					}
					this.anIntArray92[local170] = local193;
				}
			}
			for (local54 = 0; local54 < 255; local54++) {
				this.anIntArray59[local54] = this.anIntArray59[local54 + 1];
			}
			this.anIntArray59[255] = (int) (Math.sin((double) anInt396 / 14.0D) * 16.0D + Math.sin((double) anInt396 / 15.0D) * 14.0D + Math.sin((double) anInt396 / 16.0D) * 12.0D);
			if (this.anInt409 > 0) {
				this.anInt409 -= 4;
			}
			if (this.anInt410 > 0) {
				this.anInt410 -= 4;
			}
			if (this.anInt409 == 0 && this.anInt410 == 0) {
				local170 = (int) (Math.random() * 2000.0D);
				if (local170 == 0) {
					this.anInt409 = 1024;
				}
				if (local170 == 1) {
					this.anInt410 = 1024;
					return;
				}
			}
		} catch (@Pc(304) RuntimeException local304) {
			signlink.reporterror("53446, " + arg0 + ", " + local304.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(II)Z")
	private boolean method108(@OriginalArg(0) int arg0) {
		try {
			if (arg0 < 0) {
				return false;
			}
			@Pc(8) int local8 = this.anIntArray36[arg0];
			if (local8 >= 2000) {
				local8 -= 2000;
			}
			return local8 == 605;
		} catch (@Pc(27) RuntimeException local27) {
			signlink.reporterror("17125, " + arg0 + ", " + -40 + ", " + local27.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(B)V")
	private void method109(@OriginalArg(0) byte arg0) {
		try {
			@Pc(3) int local3 = 5;
			this.anIntArray68[8] = 0;
			if (arg0 != -48) {
				this.anInt362 = this.aClass1_Sub1_Sub3_4.method476();
			}
			@Pc(18) int local18 = 0;
			while (this.anIntArray68[8] == 0) {
				@Pc(22) String local22 = "Unknown problem";
				this.method95(20, "Connecting to web server");
				try {
					@Pc(44) DataInputStream local44 = this.method159("crc" + (int) (Math.random() * 9.9999999E7D) + "-" + 289);
					@Pc(51) Class1_Sub1_Sub3 local51 = new Class1_Sub1_Sub3(new byte[40], 15787);
					local44.readFully(local51.aByteArray9, 0, 40);
					local44.close();
					for (@Pc(61) int local61 = 0; local61 < 9; local61++) {
						this.anIntArray68[local61] = local51.method481();
					}
					@Pc(76) int local76 = local51.method481();
					@Pc(78) int local78 = 1234;
					for (@Pc(80) int local80 = 0; local80 < 9; local80++) {
						local78 = (local78 << 1) + this.anIntArray68[local80];
					}
					if (local76 != local78) {
						local22 = "checksum problem";
						this.anIntArray68[8] = 0;
					}
				} catch (@Pc(107) EOFException local107) {
					local22 = "EOF problem";
					this.anIntArray68[8] = 0;
				} catch (@Pc(116) IOException local116) {
					local22 = "connection problem";
					this.anIntArray68[8] = 0;
				} catch (@Pc(125) Exception local125) {
					local22 = "logic problem";
					this.anIntArray68[8] = 0;
					if (!signlink.reporterror) {
						return;
					}
				}
				if (this.anIntArray68[8] == 0) {
					local18++;
					for (@Pc(143) int local143 = local3; local143 > 0; local143--) {
						if (local18 >= 10) {
							this.method95(10, "Game updated - please reload page");
							local143 = 10;
						} else {
							this.method95(10, local22 + " - Will retry in " + local143 + " secs.");
						}
						try {
							Thread.sleep(1000L);
						} catch (@Pc(177) Exception local177) {
						}
					}
					local3 *= 2;
					if (local3 > 60) {
						local3 = 60;
					}
					this.aBoolean64 = !this.aBoolean64;
				}
			}
		} catch (@Pc(205) RuntimeException local205) {
			signlink.reporterror("95813, " + arg0 + ", " + local205.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "k", descriptor = "(I)V")
	private void method110() {
		try {
			this.aClass1_Sub1_Sub3_3.method465(93);
			if (this.anInt232 != -1) {
				this.anInt232 = -1;
				this.aBoolean61 = true;
				this.aBoolean66 = false;
				this.aBoolean82 = true;
			}
			if (this.anInt408 != -1) {
				this.anInt408 = -1;
				this.aBoolean74 = true;
				this.aBoolean66 = false;
			}
			this.anInt377 = -1;
		} catch (@Pc(47) RuntimeException local47) {
			signlink.reporterror("99207, " + 3 + ", " + local47.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "f", descriptor = "(B)V")
	private void method111() {
		try {
			System.out.println("============");
			System.out.println("flame-cycle:" + this.anInt257);
			if (this.aClass44_Sub1_1 != null) {
				System.out.println("Od-cycle:" + this.aClass44_Sub1_1.anInt951);
			}
			System.out.println("loop-cycle:" + anInt396);
			System.out.println("draw-cycle:" + anInt366);
			System.out.println("ptype:" + this.anInt362);
			System.out.println("psize:" + this.anInt361);
			if (this.aClass8_1 != null) {
				this.aClass8_1.method251();
			}
			super.aBoolean49 = true;
		} catch (@Pc(86) RuntimeException local86) {
			signlink.reporterror("31857, " + -11 + ", " + local86.toString());
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
		} catch (@Pc(26) RuntimeException local26) {
			signlink.reporterror("75072, " + 7 + ", " + local26.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIILclient!d;III)V")
	private void method112(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class6 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		try {
			if (arg3.anInt417 == 0 && arg3.anIntArray98 != null && !arg3.aBoolean96 && (arg2 >= arg0 && arg5 >= arg4 && arg2 <= arg0 + arg3.anInt420 && arg5 <= arg4 + arg3.anInt421)) {
				@Pc(34) int local34 = arg3.anIntArray98.length;
				for (@Pc(39) int local39 = 0; local39 < local34; local39++) {
					@Pc(48) int local48 = arg3.anIntArray99[local39] + arg0;
					@Pc(57) int local57 = arg3.anIntArray100[local39] + arg4 - arg1;
					@Pc(64) Class6 local64 = Class6.aClass6Array1[arg3.anIntArray98[local39]];
					@Pc(69) int local69 = local48 + local64.anInt422;
					@Pc(74) int local74 = local57 + local64.anInt423;
					if ((local64.anInt424 >= 0 || local64.anInt432 != 0) && arg2 >= local69 && arg5 >= local74 && arg2 < local69 + local64.anInt420 && arg5 < local74 + local64.anInt421) {
						if (local64.anInt424 >= 0) {
							this.anInt203 = local64.anInt424;
						} else {
							this.anInt203 = local64.anInt415;
						}
					}
					if (local64.anInt417 == 0) {
						this.method112(local69, local64.anInt426, arg2, local64, local74, arg5);
						if (local64.anInt425 > local64.anInt421) {
							this.method163(local74, arg2, local64, local69 + local64.anInt420, true, local64.anInt421, this.aByte1, arg5, local64.anInt425);
						}
					} else {
						if (local64.anInt418 == 1 && arg2 >= local69 && arg5 >= local74 && arg2 < local69 + local64.anInt420 && arg5 < local74 + local64.anInt421) {
							@Pc(172) boolean local172 = false;
							if (local64.anInt419 != 0) {
								local172 = this.method189(local64);
							}
							if (!local172) {
								this.aStringArray1[this.anInt275] = local64.aString22;
								this.anIntArray36[this.anInt275] = 231;
								this.anIntArray35[this.anInt275] = local64.anInt415;
								this.anInt275++;
							}
						}
						if (local64.anInt418 == 2 && this.anInt287 == 0 && arg2 >= local69 && arg5 >= local74 && arg2 < local69 + local64.anInt420 && arg5 < local74 + local64.anInt421) {
							@Pc(236) String local236 = local64.aString20;
							if (local236.indexOf(" ") != -1) {
								local236 = local236.substring(0, local236.indexOf(" "));
							}
							this.aStringArray1[this.anInt275] = local236 + " @gre@" + local64.aString21;
							this.anIntArray36[this.anInt275] = 274;
							this.anIntArray35[this.anInt275] = local64.anInt415;
							this.anInt275++;
						}
						if (local64.anInt418 == 3 && arg2 >= local69 && arg5 >= local74 && arg2 < local69 + local64.anInt420 && arg5 < local74 + local64.anInt421) {
							this.aStringArray1[this.anInt275] = "Close";
							this.anIntArray36[this.anInt275] = 737;
							this.anIntArray35[this.anInt275] = local64.anInt415;
							this.anInt275++;
						}
						if (local64.anInt418 == 4 && arg2 >= local69 && arg5 >= local74 && arg2 < local69 + local64.anInt420 && arg5 < local74 + local64.anInt421) {
							this.aStringArray1[this.anInt275] = local64.aString22;
							this.anIntArray36[this.anInt275] = 435;
							this.anIntArray35[this.anInt275] = local64.anInt415;
							this.anInt275++;
						}
						if (local64.anInt418 == 5 && arg2 >= local69 && arg5 >= local74 && arg2 < local69 + local64.anInt420 && arg5 < local74 + local64.anInt421) {
							this.aStringArray1[this.anInt275] = local64.aString22;
							this.anIntArray36[this.anInt275] = 225;
							this.anIntArray35[this.anInt275] = local64.anInt415;
							this.anInt275++;
						}
						if (local64.anInt418 == 6 && !this.aBoolean66 && arg2 >= local69 && arg5 >= local74 && arg2 < local69 + local64.anInt420 && arg5 < local74 + local64.anInt421) {
							this.aStringArray1[this.anInt275] = local64.aString22;
							this.anIntArray36[this.anInt275] = 997;
							this.anIntArray35[this.anInt275] = local64.anInt415;
							this.anInt275++;
						}
						if (local64.anInt417 == 2) {
							@Pc(484) int local484 = 0;
							for (@Pc(486) int local486 = 0; local486 < local64.anInt421; local486++) {
								for (@Pc(490) int local490 = 0; local490 < local64.anInt420; local490++) {
									@Pc(501) int local501 = local69 + local490 * (local64.anInt428 + 32);
									@Pc(510) int local510 = local74 + local486 * (local64.anInt429 + 32);
									if (local484 < 20) {
										local501 += local64.anIntArray101[local484];
										local510 += local64.anIntArray102[local484];
									}
									if (arg2 >= local501 && arg5 >= local510 && arg2 < local501 + 32 && arg5 < local510 + 32) {
										this.anInt279 = local484;
										this.anInt280 = local64.anInt415;
										if (local64.anIntArray94[local484] > 0) {
											@Pc(563) Class15 local563 = Class15.method358(local64.anIntArray94[local484] - 1);
											if (this.anInt260 == 1 && local64.aBoolean99) {
												if (local64.anInt415 != this.anInt262 || local484 != this.anInt261) {
													this.aStringArray1[this.anInt275] = "Use " + this.aString7 + " with @lre@" + local563.aString25;
													this.anIntArray36[this.anInt275] = 398;
													this.anIntArray37[this.anInt275] = local563.anInt595;
													this.anIntArray34[this.anInt275] = local484;
													this.anIntArray35[this.anInt275] = local64.anInt415;
													this.anInt275++;
												}
											} else if (this.anInt287 != 1 || !local64.aBoolean99) {
												@Pc(700) int local700;
												if (local64.aBoolean99) {
													for (local700 = 4; local700 >= 3; local700--) {
														if (local563.aStringArray11 != null && local563.aStringArray11[local700] != null) {
															this.aStringArray1[this.anInt275] = local563.aStringArray11[local700] + " @lre@" + local563.aString25;
															if (local700 == 3) {
																this.anIntArray36[this.anInt275] = 681;
															}
															if (local700 == 4) {
																this.anIntArray36[this.anInt275] = 100;
															}
															this.anIntArray37[this.anInt275] = local563.anInt595;
															this.anIntArray34[this.anInt275] = local484;
															this.anIntArray35[this.anInt275] = local64.anInt415;
															this.anInt275++;
														} else if (local700 == 4) {
															this.aStringArray1[this.anInt275] = "Drop @lre@" + local563.aString25;
															this.anIntArray36[this.anInt275] = 100;
															this.anIntArray37[this.anInt275] = local563.anInt595;
															this.anIntArray34[this.anInt275] = local484;
															this.anIntArray35[this.anInt275] = local64.anInt415;
															this.anInt275++;
														}
													}
												}
												if (local64.aBoolean100) {
													this.aStringArray1[this.anInt275] = "Use @lre@" + local563.aString25;
													this.anIntArray36[this.anInt275] = 102;
													this.anIntArray37[this.anInt275] = local563.anInt595;
													this.anIntArray34[this.anInt275] = local484;
													this.anIntArray35[this.anInt275] = local64.anInt415;
													this.anInt275++;
												}
												if (local64.aBoolean99 && local563.aStringArray11 != null) {
													for (local700 = 2; local700 >= 0; local700--) {
														if (local563.aStringArray11[local700] != null) {
															this.aStringArray1[this.anInt275] = local563.aStringArray11[local700] + " @lre@" + local563.aString25;
															if (local700 == 0) {
																this.anIntArray36[this.anInt275] = 694;
															}
															if (local700 == 1) {
																this.anIntArray36[this.anInt275] = 962;
															}
															if (local700 == 2) {
																this.anIntArray36[this.anInt275] = 795;
															}
															this.anIntArray37[this.anInt275] = local563.anInt595;
															this.anIntArray34[this.anInt275] = local484;
															this.anIntArray35[this.anInt275] = local64.anInt415;
															this.anInt275++;
														}
													}
												}
												if (local64.aStringArray7 != null) {
													for (local700 = 4; local700 >= 0; local700--) {
														if (local64.aStringArray7[local700] != null) {
															this.aStringArray1[this.anInt275] = local64.aStringArray7[local700] + " @lre@" + local563.aString25;
															if (local700 == 0) {
																this.anIntArray36[this.anInt275] = 582;
															}
															if (local700 == 1) {
																this.anIntArray36[this.anInt275] = 113;
															}
															if (local700 == 2) {
																this.anIntArray36[this.anInt275] = 555;
															}
															if (local700 == 3) {
																this.anIntArray36[this.anInt275] = 331;
															}
															if (local700 == 4) {
																this.anIntArray36[this.anInt275] = 354;
															}
															this.anIntArray37[this.anInt275] = local563.anInt595;
															this.anIntArray34[this.anInt275] = local484;
															this.anIntArray35[this.anInt275] = local64.anInt415;
															this.anInt275++;
														}
													}
												}
												this.aStringArray1[this.anInt275] = "Examine @lre@" + local563.aString25;
												this.anIntArray36[this.anInt275] = 1328;
												this.anIntArray37[this.anInt275] = local563.anInt595;
												this.anIntArray34[this.anInt275] = local484;
												this.anIntArray35[this.anInt275] = local64.anInt415;
												this.anInt275++;
											} else if ((this.anInt289 & 0x10) == 16) {
												this.aStringArray1[this.anInt275] = this.aString9 + " @lre@" + local563.aString25;
												this.anIntArray36[this.anInt275] = 563;
												this.anIntArray37[this.anInt275] = local563.anInt595;
												this.anIntArray34[this.anInt275] = local484;
												this.anIntArray35[this.anInt275] = local64.anInt415;
												this.anInt275++;
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
			signlink.reporterror("12590, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + 792 + ", " + local1130.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Z)Z")
	private boolean method113() {
		try {
			this.aBoolean57 &= true;
			if (this.aClass8_1 == null) {
				return false;
			}
			@Pc(2594) String local2594;
			@Pc(164) int local164;
			try {
				@Pc(16) int local16 = this.aClass8_1.method248();
				if (local16 == 0) {
					return false;
				}
				if (this.anInt362 == -1) {
					this.aClass8_1.method249(this.aClass1_Sub1_Sub3_4.aByteArray9, 0, 1);
					this.anInt362 = this.aClass1_Sub1_Sub3_4.aByteArray9[0] & 0xFF;
					if (this.aClass46_1 != null) {
						this.anInt362 = this.anInt362 - this.aClass46_1.method658() & 0xFF;
					}
					this.anInt361 = Class17.anIntArray209[this.anInt362];
					local16--;
				}
				if (this.anInt361 == -1) {
					if (local16 <= 0) {
						return false;
					}
					this.aClass8_1.method249(this.aClass1_Sub1_Sub3_4.aByteArray9, 0, 1);
					this.anInt361 = this.aClass1_Sub1_Sub3_4.aByteArray9[0] & 0xFF;
					local16--;
				}
				if (this.anInt361 == -2) {
					if (local16 <= 1) {
						return false;
					}
					this.aClass8_1.method249(this.aClass1_Sub1_Sub3_4.aByteArray9, 0, 2);
					this.aClass1_Sub1_Sub3_4.anInt734 = 0;
					this.anInt361 = this.aClass1_Sub1_Sub3_4.method478();
					local16 -= 2;
				}
				if (local16 < this.anInt361) {
					return false;
				}
				this.aClass1_Sub1_Sub3_4.anInt734 = 0;
				this.aClass8_1.method249(this.aClass1_Sub1_Sub3_4.aByteArray9, 0, this.anInt361);
				this.anInt363 = 0;
				this.anInt320 = this.anInt319;
				this.anInt319 = this.anInt318;
				this.anInt318 = this.anInt362;
				@Pc(160) int local160;
				if (this.anInt362 == 55) {
					local160 = this.aClass1_Sub1_Sub3_4.method478();
					local164 = this.aClass1_Sub1_Sub3_4.method478();
					if (this.anInt408 != -1) {
						this.anInt408 = -1;
						this.aBoolean74 = true;
					}
					if (this.aBoolean70) {
						this.aBoolean70 = false;
						this.aBoolean74 = true;
					}
					this.anInt377 = local160;
					this.anInt232 = local164;
					this.aBoolean61 = true;
					this.aBoolean82 = true;
					this.aBoolean66 = false;
					this.anInt362 = -1;
					return true;
				}
				if (this.anInt362 == 13) {
					this.anInt212 = this.aClass1_Sub1_Sub3_4.method476();
					this.anInt234 = this.aClass1_Sub1_Sub3_4.method476();
					this.anInt360 = this.aClass1_Sub1_Sub3_4.method476();
					this.aBoolean79 = true;
					this.aBoolean74 = true;
					this.anInt362 = -1;
					return true;
				}
				if (this.anInt362 == 195) {
					if (this.anInt302 == 12) {
						this.aBoolean61 = true;
					}
					this.anInt253 = this.aClass1_Sub1_Sub3_4.method476();
					this.anInt362 = -1;
					return true;
				}
				if (this.anInt362 == 46) {
					if (this.anInt302 == 12) {
						this.aBoolean61 = true;
					}
					this.anInt381 = this.aClass1_Sub1_Sub3_4.method479();
					this.anInt362 = -1;
					return true;
				}
				@Pc(287) String local287;
				if (this.anInt362 == 59) {
					local160 = this.aClass1_Sub1_Sub3_4.method478();
					local287 = this.aClass1_Sub1_Sub3_4.method483();
					Class6.aClass6Array1[local160].aString18 = local287;
					if (Class6.aClass6Array1[local160].anInt416 == this.anIntArray69[this.anInt302]) {
						this.aBoolean61 = true;
					}
					this.anInt362 = -1;
					return true;
				}
				if (this.anInt362 == 120) {
					this.anInt344 = this.aClass1_Sub1_Sub3_4.method478();
					this.anInt329 = this.aClass1_Sub1_Sub3_4.method476();
					this.anInt362 = -1;
					return true;
				}
				@Pc(345) int local345;
				if (this.anInt362 == 79) {
					local160 = this.aClass1_Sub1_Sub3_4.method478();
					local164 = this.aClass1_Sub1_Sub3_4.method479();
					local345 = this.aClass1_Sub1_Sub3_4.method479();
					@Pc(349) Class6 local349 = Class6.aClass6Array1[local160];
					local349.anInt422 = local164;
					local349.anInt423 = local345;
					this.anInt362 = -1;
					return true;
				}
				if (this.anInt362 == 252) {
					local160 = this.aClass1_Sub1_Sub3_4.method478();
					this.method186(local160);
					if (this.anInt408 != -1) {
						this.anInt408 = -1;
						this.aBoolean74 = true;
					}
					if (this.aBoolean70) {
						this.aBoolean70 = false;
						this.aBoolean74 = true;
					}
					this.anInt232 = local160;
					this.aBoolean61 = true;
					this.aBoolean82 = true;
					this.anInt377 = -1;
					this.aBoolean66 = false;
					this.anInt362 = -1;
					return true;
				}
				if (this.anInt362 == 115) {
					this.anInt293 = this.aClass1_Sub1_Sub3_4.method476();
					if (this.anInt293 == 1) {
						this.anInt237 = this.aClass1_Sub1_Sub3_4.method478();
					}
					if (this.anInt293 >= 2 && this.anInt293 <= 6) {
						if (this.anInt293 == 2) {
							this.anInt406 = 64;
							this.anInt407 = 64;
						}
						if (this.anInt293 == 3) {
							this.anInt406 = 0;
							this.anInt407 = 64;
						}
						if (this.anInt293 == 4) {
							this.anInt406 = 128;
							this.anInt407 = 64;
						}
						if (this.anInt293 == 5) {
							this.anInt406 = 64;
							this.anInt407 = 0;
						}
						if (this.anInt293 == 6) {
							this.anInt406 = 64;
							this.anInt407 = 128;
						}
						this.anInt293 = 2;
						this.anInt403 = this.aClass1_Sub1_Sub3_4.method478();
						this.anInt404 = this.aClass1_Sub1_Sub3_4.method478();
						this.anInt405 = this.aClass1_Sub1_Sub3_4.method476();
					}
					if (this.anInt293 == 10) {
						this.anInt240 = this.aClass1_Sub1_Sub3_4.method478();
					}
					this.anInt362 = -1;
					return true;
				}
				@Pc(535) Class6 local535;
				if (this.anInt362 == 211) {
					local160 = this.aClass1_Sub1_Sub3_4.method478();
					local164 = this.aClass1_Sub1_Sub3_4.method479();
					local535 = Class6.aClass6Array1[local160];
					local535.anInt438 = local164;
					if (local164 == -1) {
						local535.anInt413 = 0;
						local535.anInt414 = 0;
					}
					this.anInt362 = -1;
					return true;
				}
				if (this.anInt362 == 136) {
					this.anInt215 = this.aClass1_Sub1_Sub3_4.method476();
					this.anInt362 = -1;
					return true;
				}
				if (this.anInt362 == 91 || this.anInt362 == 117 || this.anInt362 == 83 || this.anInt362 == 176 || this.anInt362 == 233 || this.anInt362 == 87 || this.anInt362 == 71 || this.anInt362 == 60 || this.anInt362 == 106 || this.anInt362 == 194 || this.anInt362 == 90) {
					this.method149(this.aClass1_Sub1_Sub3_4, this.anInt362);
					this.anInt362 = -1;
					return true;
				}
				@Pc(634) Class6 local634;
				if (this.anInt362 == 28) {
					local160 = this.aClass1_Sub1_Sub3_4.method478();
					local634 = Class6.aClass6Array1[local160];
					for (local345 = 0; local345 < local634.anIntArray94.length; local345++) {
						local634.anIntArray94[local345] = -1;
						local634.anIntArray94[local345] = 0;
					}
					this.anInt362 = -1;
					return true;
				}
				if (this.anInt362 == 144) {
					this.anInt310 = this.aClass1_Sub1_Sub3_4.method476();
					this.anInt311 = this.aClass1_Sub1_Sub3_4.method476();
					for (local160 = this.anInt310; local160 < this.anInt310 + 8; local160++) {
						for (local164 = this.anInt311; local164 < this.anInt311 + 8; local164++) {
							if (this.aClass29ArrayArrayArray1[this.anInt356][local160][local164] != null) {
								this.aClass29ArrayArrayArray1[this.anInt356][local160][local164] = null;
								this.method174(local160, local164);
							}
						}
					}
					for (@Pc(726) Class1_Sub2 local726 = (Class1_Sub2) this.aClass29_3.method507(); local726 != null; local726 = (Class1_Sub2) this.aClass29_3.method509()) {
						if (local726.anInt772 >= this.anInt310 && local726.anInt772 < this.anInt310 + 8 && local726.anInt773 >= this.anInt311 && local726.anInt773 < this.anInt311 + 8 && local726.anInt770 == this.anInt356) {
							local726.anInt781 = 0;
						}
					}
					this.anInt362 = -1;
					return true;
				}
				@Pc(809) int local809;
				if (this.anInt362 == 154) {
					this.aBoolean61 = true;
					local160 = this.aClass1_Sub1_Sub3_4.method476();
					local164 = this.aClass1_Sub1_Sub3_4.method481();
					local345 = this.aClass1_Sub1_Sub3_4.method476();
					this.anIntArray40[local160] = local164;
					this.anIntArray63[local160] = local345;
					this.anIntArray71[local160] = 1;
					for (local809 = 0; local809 < 98; local809++) {
						if (local164 >= anIntArray53[local809]) {
							this.anIntArray71[local160] = local809 + 2;
						}
					}
					this.anInt362 = -1;
					return true;
				}
				if (this.anInt362 == 181) {
					this.anInt207 = this.aClass1_Sub1_Sub3_4.method476();
					if (this.anInt207 == this.anInt302) {
						if (this.anInt207 == 3) {
							this.anInt302 = 1;
						} else {
							this.anInt302 = 3;
						}
						this.aBoolean61 = true;
					}
					this.anInt362 = -1;
					return true;
				}
				if (this.anInt362 == 73) {
					this.aBoolean55 = true;
					this.anInt345 = this.aClass1_Sub1_Sub3_4.method476();
					this.anInt346 = this.aClass1_Sub1_Sub3_4.method476();
					this.anInt347 = this.aClass1_Sub1_Sub3_4.method478();
					this.anInt348 = this.aClass1_Sub1_Sub3_4.method476();
					this.anInt349 = this.aClass1_Sub1_Sub3_4.method476();
					if (this.anInt349 >= 100) {
						this.anInt223 = this.anInt345 * 128 + 64;
						this.anInt225 = this.anInt346 * 128 + 64;
						this.anInt224 = this.method133(this.anInt225, this.anInt223, this.anInt356) - this.anInt347;
					}
					this.anInt362 = -1;
					return true;
				}
				if (this.anInt362 == 188) {
					this.method139(this.anInt361, this.aClass1_Sub1_Sub3_4);
					this.aBoolean94 = false;
					this.anInt362 = -1;
					return true;
				}
				if (this.anInt362 == 244) {
					local160 = this.aClass1_Sub1_Sub3_4.method478();
					local164 = this.aClass1_Sub1_Sub3_4.method478();
					Class6.aClass6Array1[local160].anInt434 = 2;
					Class6.aClass6Array1[local160].anInt435 = local164;
					this.anInt362 = -1;
					return true;
				}
				if (this.anInt362 == 121) {
					this.method104();
					this.anInt362 = -1;
					return false;
				}
				if (this.anInt362 == 119) {
					local160 = this.aClass1_Sub1_Sub3_4.method478();
					this.method186(local160);
					if (this.anInt232 != -1) {
						this.anInt232 = -1;
						this.aBoolean61 = true;
						this.aBoolean82 = true;
					}
					if (this.anInt408 != -1) {
						this.anInt408 = -1;
						this.aBoolean74 = true;
					}
					if (this.aBoolean70) {
						this.aBoolean70 = false;
						this.aBoolean74 = true;
					}
					this.anInt377 = local160;
					this.aBoolean66 = false;
					this.anInt362 = -1;
					return true;
				}
				@Pc(1071) int local1071;
				@Pc(1173) int local1173;
				@Pc(1206) int local1206;
				@Pc(1059) long local1059;
				if (this.anInt362 == 168) {
					local1059 = this.aClass1_Sub1_Sub3_4.method482();
					local345 = this.aClass1_Sub1_Sub3_4.method476();
					@Pc(1069) String local1069 = Class48.method667(Class48.method664(local1059));
					for (local1071 = 0; local1071 < this.anInt338; local1071++) {
						if (local1059 == this.aLongArray3[local1071]) {
							if (this.anIntArray43[local1071] != local345) {
								this.anIntArray43[local1071] = local345;
								this.aBoolean61 = true;
								if (local345 > 0) {
									this.method99(5, local1069 + " has logged in.", "");
								}
								if (local345 == 0) {
									this.method99(5, local1069 + " has logged out.", "");
								}
							}
							local1069 = null;
							break;
						}
					}
					if (local1069 != null && this.anInt338 < 200) {
						this.aLongArray3[this.anInt338] = local1059;
						this.aStringArray5[this.anInt338] = local1069;
						this.anIntArray43[this.anInt338] = local345;
						this.anInt338++;
						this.aBoolean61 = true;
					}
					@Pc(1167) boolean local1167 = false;
					while (!local1167) {
						local1167 = true;
						for (local1173 = 0; local1173 < this.anInt338 - 1; local1173++) {
							if (this.anIntArray43[local1173] != anInt392 && this.anIntArray43[local1173 + 1] == anInt392 || this.anIntArray43[local1173] == 0 && this.anIntArray43[local1173 + 1] != 0) {
								local1206 = this.anIntArray43[local1173];
								this.anIntArray43[local1173] = this.anIntArray43[local1173 + 1];
								this.anIntArray43[local1173 + 1] = local1206;
								@Pc(1228) String local1228 = this.aStringArray5[local1173];
								this.aStringArray5[local1173] = this.aStringArray5[local1173 + 1];
								this.aStringArray5[local1173 + 1] = local1228;
								@Pc(1250) long local1250 = this.aLongArray3[local1173];
								this.aLongArray3[local1173] = this.aLongArray3[local1173 + 1];
								this.aLongArray3[local1173 + 1] = local1250;
								this.aBoolean61 = true;
								local1167 = false;
							}
						}
					}
					this.anInt362 = -1;
					return true;
				}
				if (this.anInt362 == 164) {
					this.anInt241 = 0;
					this.anInt362 = -1;
					return true;
				}
				@Pc(1319) int local1319;
				@Pc(1317) boolean local1317;
				@Pc(1386) String local1386;
				if (this.anInt362 == 243) {
					local1059 = this.aClass1_Sub1_Sub3_4.method482();
					local345 = this.aClass1_Sub1_Sub3_4.method481();
					local809 = this.aClass1_Sub1_Sub3_4.method476();
					local1317 = false;
					for (local1319 = 0; local1319 < 100; local1319++) {
						if (this.anIntArray58[local1319] == local345) {
							local1317 = true;
							break;
						}
					}
					if (local809 <= 1) {
						for (local1173 = 0; local1173 < this.anInt264; local1173++) {
							if (this.aLongArray4[local1173] == local1059) {
								local1317 = true;
								break;
							}
						}
					}
					if (!local1317 && this.anInt400 == 0) {
						try {
							this.anIntArray58[this.anInt247] = local345;
							this.anInt247 = (this.anInt247 + 1) % 100;
							local1386 = Class49.method679(this.aClass1_Sub1_Sub3_4, this.anInt361 - 13);
							local1386 = Class42.method600(local1386, this.anInt397);
							if (local809 == 2 || local809 == 3) {
								this.method99(7, local1386, "@cr2@" + Class48.method667(Class48.method664(local1059)));
							} else if (local809 == 1) {
								this.method99(7, local1386, "@cr1@" + Class48.method667(Class48.method664(local1059)));
							} else {
								this.method99(3, local1386, Class48.method667(Class48.method664(local1059)));
							}
						} catch (@Pc(1448) Exception local1448) {
							signlink.reporterror("cde1");
						}
					}
					this.anInt362 = -1;
					return true;
				}
				if (this.anInt362 == 208) {
					local160 = this.aClass1_Sub1_Sub3_4.method476();
					local164 = this.aClass1_Sub1_Sub3_4.method476();
					local345 = this.aClass1_Sub1_Sub3_4.method476();
					local809 = this.aClass1_Sub1_Sub3_4.method476();
					this.aBooleanArray4[local160] = true;
					this.anIntArray52[local160] = local164;
					this.anIntArray84[local160] = local345;
					this.anIntArray50[local160] = local809;
					this.anIntArray54[local160] = 0;
					this.anInt362 = -1;
					return true;
				}
				if (this.anInt362 == 107) {
					this.aBoolean61 = true;
					local160 = this.aClass1_Sub1_Sub3_4.method478();
					local634 = Class6.aClass6Array1[local160];
					local345 = this.aClass1_Sub1_Sub3_4.method478();
					for (local809 = 0; local809 < local345; local809++) {
						local634.anIntArray94[local809] = this.aClass1_Sub1_Sub3_4.method478();
						local1071 = this.aClass1_Sub1_Sub3_4.method476();
						if (local1071 == 255) {
							local1071 = this.aClass1_Sub1_Sub3_4.method481();
						}
						local634.anIntArray95[local809] = local1071;
					}
					for (local1071 = local345; local1071 < local634.anIntArray94.length; local1071++) {
						local634.anIntArray94[local1071] = 0;
						local634.anIntArray95[local1071] = 0;
					}
					this.anInt362 = -1;
					return true;
				}
				if (this.anInt362 == 12) {
					local160 = this.aClass1_Sub1_Sub3_4.method479();
					this.anInt271 = local160;
					this.aBoolean74 = true;
					this.anInt362 = -1;
					return true;
				}
				if (this.anInt362 == 219) {
					local160 = this.aClass1_Sub1_Sub3_4.method478();
					local164 = this.aClass1_Sub1_Sub3_4.method478();
					if (this.anInt210 == local160 && this.anInt211 == local164 && this.anInt229 == 2) {
						this.anInt362 = -1;
						return true;
					}
					this.anInt210 = local160;
					this.anInt211 = local164;
					this.anInt370 = (this.anInt210 - 6) * 8;
					this.anInt371 = (this.anInt211 - 6) * 8;
					this.aBoolean62 = false;
					if ((this.anInt210 / 8 == 48 || this.anInt210 / 8 == 49) && this.anInt211 / 8 == 48) {
						this.aBoolean62 = true;
					}
					if (this.anInt210 / 8 == 48 && this.anInt211 / 8 == 148) {
						this.aBoolean62 = true;
					}
					this.anInt229 = 1;
					this.aLong17 = System.currentTimeMillis();
					this.aClass35_17.method520();
					this.aClass1_Sub1_Sub2_Sub4_2.method443(257, "Loading - please wait.", 0, 151);
					this.aClass1_Sub1_Sub2_Sub4_2.method443(256, "Loading - please wait.", 16777215, 150);
					this.aClass35_17.method521(4, 4, super.aGraphics2);
					local345 = 0;
					for (local809 = (this.anInt210 - 6) / 8; local809 <= (this.anInt210 + 6) / 8; local809++) {
						for (local1071 = (this.anInt211 - 6) / 8; local1071 <= (this.anInt211 + 6) / 8; local1071++) {
							local345++;
						}
					}
					this.aByteArrayArray2 = new byte[local345][];
					this.aByteArrayArray1 = new byte[local345][];
					this.anIntArray64 = new int[local345];
					this.anIntArray65 = new int[local345];
					this.anIntArray66 = new int[local345];
					local345 = 0;
					for (local1071 = (this.anInt210 - 6) / 8; local1071 <= (this.anInt210 + 6) / 8; local1071++) {
						for (local1319 = (this.anInt211 - 6) / 8; local1319 <= (this.anInt211 + 6) / 8; local1319++) {
							this.anIntArray64[local345] = (local1071 << 8) + local1319;
							if (this.aBoolean62 && (local1319 == 49 || local1319 == 149 || local1319 == 147 || local1071 == 50 || local1071 == 49 && local1319 == 47)) {
								this.anIntArray65[local345] = -1;
								this.anIntArray66[local345] = -1;
								local345++;
							} else {
								local1173 = this.anIntArray65[local345] = this.aClass44_Sub1_1.method636(local1319, local1071, 0);
								if (local1173 != -1) {
									this.aClass44_Sub1_1.method641(3, local1173);
								}
								local1206 = this.anIntArray66[local345] = this.aClass44_Sub1_1.method636(local1319, local1071, 1);
								if (local1206 != -1) {
									this.aClass44_Sub1_1.method641(3, local1206);
								}
								local345++;
							}
						}
					}
					local1319 = this.anInt370 - this.anInt372;
					local1173 = this.anInt371 - this.anInt373;
					this.anInt372 = this.anInt370;
					this.anInt373 = this.anInt371;
					for (local1206 = 0; local1206 < 16384; local1206++) {
						@Pc(1936) Class1_Sub1_Sub1_Sub1_Sub2 local1936 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local1206];
						if (local1936 != null) {
							for (@Pc(1940) int local1940 = 0; local1940 < 10; local1940++) {
								local1936.anIntArray271[local1940] -= local1319;
								local1936.anIntArray272[local1940] -= local1173;
							}
							local1936.anInt980 -= local1319 * 128;
							local1936.anInt981 -= local1173 * 128;
						}
					}
					for (@Pc(1984) int local1984 = 0; local1984 < this.anInt387; local1984++) {
						@Pc(1991) Class1_Sub1_Sub1_Sub1_Sub1 local1991 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local1984];
						if (local1991 != null) {
							for (@Pc(1995) int local1995 = 0; local1995 < 10; local1995++) {
								local1991.anIntArray271[local1995] -= local1319;
								local1991.anIntArray272[local1995] -= local1173;
							}
							local1991.anInt980 -= local1319 * 128;
							local1991.anInt981 -= local1173 * 128;
						}
					}
					this.aBoolean94 = true;
					@Pc(2043) byte local2043 = 0;
					@Pc(2045) byte local2045 = 104;
					@Pc(2047) byte local2047 = 1;
					if (local1319 < 0) {
						local2043 = 103;
						local2045 = -1;
						local2047 = -1;
					}
					@Pc(2057) byte local2057 = 0;
					@Pc(2059) byte local2059 = 104;
					@Pc(2061) byte local2061 = 1;
					if (local1173 < 0) {
						local2057 = 103;
						local2059 = -1;
						local2061 = -1;
					}
					for (@Pc(2071) int local2071 = local2043; local2071 != local2045; local2071 += local2047) {
						for (@Pc(2075) int local2075 = local2057; local2075 != local2059; local2075 += local2061) {
							@Pc(2081) int local2081 = local2071 + local1319;
							@Pc(2085) int local2085 = local2075 + local1173;
							for (@Pc(2087) int local2087 = 0; local2087 < 4; local2087++) {
								if (local2081 >= 0 && local2085 >= 0 && local2081 < 104 && local2085 < 104) {
									this.aClass29ArrayArrayArray1[local2087][local2071][local2075] = this.aClass29ArrayArrayArray1[local2087][local2081][local2085];
								} else {
									this.aClass29ArrayArrayArray1[local2087][local2071][local2075] = null;
								}
							}
						}
					}
					for (@Pc(2149) Class1_Sub2 local2149 = (Class1_Sub2) this.aClass29_3.method507(); local2149 != null; local2149 = (Class1_Sub2) this.aClass29_3.method509()) {
						local2149.anInt772 -= local1319;
						local2149.anInt773 -= local1173;
						if (local2149.anInt772 < 0 || local2149.anInt773 < 0 || local2149.anInt772 >= 104 || local2149.anInt773 >= 104) {
							local2149.method669();
						}
					}
					if (this.anInt241 != 0) {
						this.anInt241 -= local1319;
						this.anInt242 -= local1173;
					}
					this.aBoolean55 = false;
					this.anInt362 = -1;
					return true;
				}
				if (this.anInt362 == 63) {
					local160 = this.aClass1_Sub1_Sub3_4.method478();
					local164 = this.aClass1_Sub1_Sub3_4.method476();
					if (local160 == 65535) {
						local160 = -1;
					}
					this.anIntArray69[local164] = local160;
					this.aBoolean61 = true;
					this.aBoolean82 = true;
					this.anInt362 = -1;
					return true;
				}
				if (this.anInt362 == 184) {
					local160 = this.aClass1_Sub1_Sub3_4.method478();
					local164 = this.aClass1_Sub1_Sub3_4.method478();
					local535 = Class6.aClass6Array1[local160];
					if (local535 != null && local535.anInt417 == 0) {
						if (local164 < 0) {
							local164 = 0;
						}
						if (local164 > local535.anInt425 - local535.anInt421) {
							local164 = local535.anInt425 - local535.anInt421;
						}
						local535.anInt426 = local164;
					}
					this.anInt362 = -1;
					return true;
				}
				if (this.anInt362 == 204) {
					this.anInt290 = this.aClass1_Sub1_Sub3_4.method478() * 30;
					this.anInt362 = -1;
					return true;
				}
				if (this.anInt362 == 253) {
					this.anInt391 = this.aClass1_Sub1_Sub3_4.method481();
					this.anInt258 = this.aClass1_Sub1_Sub3_4.method478();
					this.anInt219 = this.aClass1_Sub1_Sub3_4.method476();
					this.anInt301 = this.aClass1_Sub1_Sub3_4.method478();
					this.anInt243 = this.aClass1_Sub1_Sub3_4.method476();
					if (this.anInt391 != 0 && this.anInt377 == -1) {
						signlink.dnslookup(Class48.method666(this.anInt391));
						this.method110();
						@Pc(2351) short local2351 = 650;
						if (this.anInt219 != 201 || this.anInt243 == 1) {
							local2351 = 655;
						}
						this.aString6 = "";
						this.aBoolean72 = false;
						for (local164 = 0; local164 < Class6.aClass6Array1.length; local164++) {
							if (Class6.aClass6Array1[local164] != null && Class6.aClass6Array1[local164].anInt419 == local2351) {
								this.anInt377 = Class6.aClass6Array1[local164].anInt416;
								break;
							}
						}
					}
					this.anInt362 = -1;
					return true;
				}
				if (this.anInt362 == 30) {
					local160 = this.aClass1_Sub1_Sub3_4.method478();
					Class6.aClass6Array1[local160].anInt434 = 3;
					if (aClass1_Sub1_Sub1_Sub1_Sub1_1.aClass13_1 == null) {
						Class6.aClass6Array1[local160].anInt435 = (aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray14[0] << 24) + (aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray14[4] << 18) + (aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray13[0] << 12) + (aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray13[8] << 6) + aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray13[11];
					} else {
						Class6.aClass6Array1[local160].anInt435 = (int) (aClass1_Sub1_Sub1_Sub1_Sub1_1.aClass13_1.aLong23 + 305419896L);
					}
					this.anInt362 = -1;
					return true;
				}
				if (this.anInt362 == 23) {
					if (this.anInt232 != -1) {
						this.anInt232 = -1;
						this.aBoolean61 = true;
						this.aBoolean82 = true;
					}
					if (this.anInt408 != -1) {
						this.anInt408 = -1;
						this.aBoolean74 = true;
					}
					if (this.aBoolean70) {
						this.aBoolean70 = false;
						this.aBoolean74 = true;
					}
					this.anInt377 = -1;
					this.aBoolean66 = false;
					this.anInt362 = -1;
					return true;
				}
				if (this.anInt362 == 21) {
					local160 = this.aClass1_Sub1_Sub3_4.method476();
					local164 = this.aClass1_Sub1_Sub3_4.method476();
					@Pc(2531) String local2531 = this.aClass1_Sub1_Sub3_4.method483();
					if (local160 >= 1 && local160 <= 5) {
						if (local2531.equalsIgnoreCase("null")) {
							local2531 = null;
						}
						this.aStringArray2[local160 - 1] = local2531;
						this.aBooleanArray3[local160 - 1] = local164 == 0;
					}
					this.anInt362 = -1;
					return true;
				}
				if (this.anInt362 == 189) {
					this.anInt302 = this.aClass1_Sub1_Sub3_4.method476();
					this.aBoolean61 = true;
					this.aBoolean82 = true;
					this.anInt362 = -1;
					return true;
				}
				if (this.anInt362 == 196) {
					local2594 = this.aClass1_Sub1_Sub3_4.method483();
					@Pc(2608) long local2608;
					if (local2594.endsWith(":tradereq:")) {
						local287 = local2594.substring(0, local2594.indexOf(":"));
						local2608 = Class48.method663(local287);
						local1317 = false;
						for (local1319 = 0; local1319 < this.anInt264; local1319++) {
							if (this.aLongArray4[local1319] == local2608) {
								local1317 = true;
								break;
							}
						}
						if (!local1317 && this.anInt400 == 0) {
							this.method99(4, "wishes to trade with you.", local287);
						}
					} else if (local2594.endsWith(":duelreq:")) {
						local287 = local2594.substring(0, local2594.indexOf(":"));
						local2608 = Class48.method663(local287);
						local1317 = false;
						for (local1319 = 0; local1319 < this.anInt264; local1319++) {
							if (this.aLongArray4[local1319] == local2608) {
								local1317 = true;
								break;
							}
						}
						if (!local1317 && this.anInt400 == 0) {
							this.method99(8, "wishes to duel with you.", local287);
						}
					} else if (local2594.endsWith(":chalreq:")) {
						local287 = local2594.substring(0, local2594.indexOf(":"));
						local2608 = Class48.method663(local287);
						local1317 = false;
						for (local1319 = 0; local1319 < this.anInt264; local1319++) {
							if (this.aLongArray4[local1319] == local2608) {
								local1317 = true;
								break;
							}
						}
						if (!local1317 && this.anInt400 == 0) {
							local1386 = local2594.substring(local2594.indexOf(":") + 1, local2594.length() - 9);
							this.method99(8, local1386, local287);
						}
					} else {
						this.method99(0, local2594, "");
					}
					this.anInt362 = -1;
					return true;
				}
				if (this.anInt362 == 18) {
					local160 = this.aClass1_Sub1_Sub3_4.method478();
					local164 = this.aClass1_Sub1_Sub3_4.method478();
					local345 = this.aClass1_Sub1_Sub3_4.method478();
					if (local164 == 65535) {
						Class6.aClass6Array1[local160].anInt434 = 0;
						this.anInt362 = -1;
						return true;
					}
					@Pc(2796) Class15 local2796 = Class15.method358(local164);
					Class6.aClass6Array1[local160].anInt434 = 4;
					Class6.aClass6Array1[local160].anInt435 = local164;
					Class6.aClass6Array1[local160].anInt441 = local2796.anInt598;
					Class6.aClass6Array1[local160].anInt442 = local2796.anInt599;
					Class6.aClass6Array1[local160].anInt440 = local2796.anInt597 * 100 / local345;
					this.anInt362 = -1;
					return true;
				}
				if (this.anInt362 == 187) {
					local160 = this.aClass1_Sub1_Sub3_4.method478();
					if (local160 == 65535) {
						local160 = -1;
					}
					if (local160 != this.anInt269 && this.aBoolean77 && !aBoolean90 && this.anInt255 == 0) {
						this.anInt376 = local160;
						this.aBoolean87 = true;
						this.aClass44_Sub1_1.method641(2, this.anInt376);
					}
					this.anInt269 = local160;
					this.anInt362 = -1;
					return true;
				}
				if (this.anInt362 == 29) {
					local160 = this.aClass1_Sub1_Sub3_4.method478();
					local164 = this.aClass1_Sub1_Sub3_4.method478();
					if (this.aBoolean77 && !aBoolean90) {
						this.anInt376 = local160;
						this.aBoolean87 = false;
						this.aClass44_Sub1_1.method641(2, this.anInt376);
						this.anInt255 = local164;
					}
					this.anInt362 = -1;
					return true;
				}
				if (this.anInt362 == 177) {
					local160 = this.aClass1_Sub1_Sub3_4.method478();
					local164 = this.aClass1_Sub1_Sub3_4.method476();
					local345 = this.aClass1_Sub1_Sub3_4.method478();
					if (this.aBoolean75 && !aBoolean90 && this.anInt272 < 50) {
						this.anIntArray38[this.anInt272] = local160;
						this.anIntArray56[this.anInt272] = local164;
						this.anIntArray82[this.anInt272] = local345 + Class5.anIntArray29[local160];
						this.anInt272++;
					}
					this.anInt362 = -1;
					return true;
				}
				if (this.anInt362 == 112) {
					this.anInt310 = this.aClass1_Sub1_Sub3_4.method476();
					this.anInt311 = this.aClass1_Sub1_Sub3_4.method476();
					while (this.aClass1_Sub1_Sub3_4.anInt734 < this.anInt361) {
						local160 = this.aClass1_Sub1_Sub3_4.method476();
						this.method149(this.aClass1_Sub1_Sub3_4, local160);
					}
					this.anInt362 = -1;
					return true;
				}
				if (this.anInt362 == 172) {
					for (local160 = 0; local160 < this.anIntArray85.length; local160++) {
						if (this.anIntArray85[local160] != this.anIntArray62[local160]) {
							this.anIntArray85[local160] = this.anIntArray62[local160];
							this.method229(local160);
							this.aBoolean61 = true;
						}
					}
					this.anInt362 = -1;
					return true;
				}
				if (this.anInt362 == 160) {
					local160 = this.aClass1_Sub1_Sub3_4.method478();
					local164 = this.aClass1_Sub1_Sub3_4.method478();
					local345 = local164 >> 10 & 0x1F;
					local809 = local164 >> 5 & 0x1F;
					local1071 = local164 & 0x1F;
					Class6.aClass6Array1[local160].anInt430 = (local345 << 19) + (local809 << 11) + (local1071 << 3);
					this.anInt362 = -1;
					return true;
				}
				if (this.anInt362 == 47) {
					this.anInt264 = this.anInt361 / 8;
					for (local160 = 0; local160 < this.anInt264; local160++) {
						this.aLongArray4[local160] = this.aClass1_Sub1_Sub3_4.method482();
					}
					this.anInt362 = -1;
					return true;
				}
				if (this.anInt362 == 65) {
					this.method187(this.anInt361, this.aClass1_Sub1_Sub3_4);
					this.anInt362 = -1;
					return true;
				}
				if (this.anInt362 == 222) {
					local160 = this.aClass1_Sub1_Sub3_4.method478();
					local164 = this.aClass1_Sub1_Sub3_4.method478();
					Class6.aClass6Array1[local160].anInt434 = 1;
					Class6.aClass6Array1[local160].anInt435 = local164;
					this.anInt362 = -1;
					return true;
				}
				if (this.anInt362 == 127) {
					local160 = this.aClass1_Sub1_Sub3_4.method479();
					if (local160 >= 0) {
						this.method186(local160);
					}
					this.anInt246 = local160;
					this.anInt362 = -1;
					return true;
				}
				if (this.anInt362 == 75) {
					local160 = this.aClass1_Sub1_Sub3_4.method478();
					@Pc(3210) byte local3210 = this.aClass1_Sub1_Sub3_4.method477();
					this.anIntArray62[local160] = local3210;
					if (this.anIntArray85[local160] != local3210) {
						this.anIntArray85[local160] = local3210;
						this.method229(local160);
						this.aBoolean61 = true;
						if (this.anInt271 != -1) {
							this.aBoolean74 = true;
						}
					}
					this.anInt362 = -1;
					return true;
				}
				if (this.anInt362 == 82) {
					this.aBoolean55 = true;
					this.anInt282 = this.aClass1_Sub1_Sub3_4.method476();
					this.anInt283 = this.aClass1_Sub1_Sub3_4.method476();
					this.anInt284 = this.aClass1_Sub1_Sub3_4.method478();
					this.anInt285 = this.aClass1_Sub1_Sub3_4.method476();
					this.anInt286 = this.aClass1_Sub1_Sub3_4.method476();
					if (this.anInt286 >= 100) {
						local160 = this.anInt282 * 128 + 64;
						local164 = this.anInt283 * 128 + 64;
						local345 = this.method133(local164, local160, this.anInt356) - this.anInt284;
						local809 = local160 - this.anInt223;
						local1071 = local345 - this.anInt224;
						local1319 = local164 - this.anInt225;
						local1173 = (int) Math.sqrt((double) (local809 * local809 + local1319 * local1319));
						this.anInt226 = (int) (Math.atan2((double) local1071, (double) local1173) * 325.949D) & 0x7FF;
						this.anInt227 = (int) (Math.atan2((double) local809, (double) local1319) * -325.949D) & 0x7FF;
						if (this.anInt226 < 128) {
							this.anInt226 = 128;
						}
						if (this.anInt226 > 383) {
							this.anInt226 = 383;
						}
					}
					this.anInt362 = -1;
					return true;
				}
				if (this.anInt362 == 81) {
					local160 = this.aClass1_Sub1_Sub3_4.method478();
					this.method186(local160);
					if (this.anInt232 != -1) {
						this.anInt232 = -1;
						this.aBoolean61 = true;
						this.aBoolean82 = true;
					}
					this.anInt408 = local160;
					this.aBoolean74 = true;
					this.anInt377 = -1;
					this.aBoolean66 = false;
					this.anInt362 = -1;
					return true;
				}
				if (this.anInt362 == 138) {
					local160 = this.aClass1_Sub1_Sub3_4.method478();
					@Pc(3434) boolean local3434 = this.aClass1_Sub1_Sub3_4.method476() == 1;
					Class6.aClass6Array1[local160].aBoolean96 = local3434;
					this.anInt362 = -1;
					return true;
				}
				if (this.anInt362 == 247) {
					this.anInt342 = this.aClass1_Sub1_Sub3_4.method476();
					this.anInt362 = -1;
					return true;
				}
				if (this.anInt362 == 235) {
					this.anInt339 = this.aClass1_Sub1_Sub3_4.method476();
					this.aBoolean61 = true;
					this.anInt362 = -1;
					return true;
				}
				if (this.anInt362 == 76) {
					this.aBoolean61 = true;
					local160 = this.aClass1_Sub1_Sub3_4.method478();
					local634 = Class6.aClass6Array1[local160];
					while (this.aClass1_Sub1_Sub3_4.anInt734 < this.anInt361) {
						local345 = this.aClass1_Sub1_Sub3_4.method490();
						local809 = this.aClass1_Sub1_Sub3_4.method478();
						local1071 = this.aClass1_Sub1_Sub3_4.method476();
						if (local1071 == 255) {
							local1071 = this.aClass1_Sub1_Sub3_4.method481();
						}
						if (local345 >= 0 && local345 < local634.anIntArray94.length) {
							local634.anIntArray94[local345] = local809;
							local634.anIntArray95[local345] = local1071;
						}
					}
					this.anInt362 = -1;
					return true;
				}
				if (this.anInt362 == 201) {
					for (local160 = 0; local160 < this.aClass1_Sub1_Sub1_Sub1_Sub1Array1.length; local160++) {
						if (this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local160] != null) {
							this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local160].anInt1003 = -1;
						}
					}
					for (local164 = 0; local164 < this.aClass1_Sub1_Sub1_Sub1_Sub2Array1.length; local164++) {
						if (this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local164] != null) {
							this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local164].anInt1003 = -1;
						}
					}
					this.anInt362 = -1;
					return true;
				}
				if (this.anInt362 == 35) {
					this.aBoolean88 = false;
					this.aBoolean70 = true;
					this.aString13 = "";
					this.aBoolean74 = true;
					this.anInt362 = -1;
					return true;
				}
				if (this.anInt362 == 133) {
					this.aBoolean55 = false;
					for (local160 = 0; local160 < 5; local160++) {
						this.aBooleanArray4[local160] = false;
					}
					this.anInt362 = -1;
					return true;
				}
				if (this.anInt362 == 97) {
					local160 = this.aClass1_Sub1_Sub3_4.method478();
					local164 = this.aClass1_Sub1_Sub3_4.method481();
					this.anIntArray62[local160] = local164;
					if (this.anIntArray85[local160] != local164) {
						this.anIntArray85[local160] = local164;
						this.method229(local160);
						this.aBoolean61 = true;
						if (this.anInt271 != -1) {
							this.aBoolean74 = true;
						}
					}
					this.anInt362 = -1;
					return true;
				}
				if (this.anInt362 == 155) {
					this.anInt310 = this.aClass1_Sub1_Sub3_4.method476();
					this.anInt311 = this.aClass1_Sub1_Sub3_4.method476();
					this.anInt362 = -1;
					return true;
				}
				signlink.reporterror("T1 - " + this.anInt362 + "," + this.anInt361 + " - " + this.anInt319 + "," + this.anInt320);
				this.method104();
			} catch (@Pc(3731) IOException local3731) {
				this.method181();
			} catch (@Pc(3736) Exception local3736) {
				local2594 = "T2 - " + this.anInt362 + "," + this.anInt319 + "," + this.anInt320 + " - " + this.anInt361 + "," + (this.anInt370 + aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray271[0]) + "," + (this.anInt371 + aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray272[0]) + " - ";
				for (local164 = 0; local164 < this.anInt361 && local164 < 50; local164++) {
					local2594 = local2594 + this.aClass1_Sub1_Sub3_4.aByteArray9[local164] + ",";
				}
				signlink.reporterror(local2594);
				this.method104();
			}
			return true;
		} catch (@Pc(3817) RuntimeException local3817) {
			signlink.reporterror("74182, " + true + ", " + local3817.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/String;)V")
	private void method114(@OriginalArg(0) String arg0) {
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

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(B[BZ)V")
	private void method115(@OriginalArg(1) byte[] arg0, @OriginalArg(2) boolean arg1) {
		try {
			signlink.anInt934 = arg1 ? 1 : 0;
			signlink.midisave(arg0, arg0.length);
		} catch (@Pc(17) RuntimeException local17) {
			signlink.reporterror("89004, " + 27 + ", " + arg0 + ", " + arg1 + ", " + local17.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "l", descriptor = "(I)Ljava/net/Socket;")
	public Socket method116(@OriginalArg(0) int arg0) throws IOException {
		return signlink.mainapp == null ? new Socket(InetAddress.getByName(this.getCodeBase().getHost()), arg0) : signlink.opensocket(arg0);
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "()V")
	@Override
	protected void method88() {
		this.method95(20, "Starting up");
		if (signlink.sunjava) {
			super.anInt180 = 5;
		}
		if (aBoolean60) {
			this.aBoolean91 = true;
			return;
		}
		aBoolean60 = true;
		@Pc(21) boolean local21 = false;
		@Pc(25) String local25 = this.method184();
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
				this.aClass45Array1[local95] = new Class45(signlink.aRandomAccessFile1, 500000, signlink.aRandomAccessFileArray1[local95], local95 + 1, (byte) 4);
			}
		}
		try {
			this.method109(aByte5);
			this.aClass47_1 = this.method207("title screen", 1, "title", 25, this.anIntArray68[1]);
			this.aClass1_Sub1_Sub2_Sub4_1 = new Class1_Sub1_Sub2_Sub4(9, "p11_full", false, this.aClass47_1);
			this.aClass1_Sub1_Sub2_Sub4_2 = new Class1_Sub1_Sub2_Sub4(9, "p12_full", false, this.aClass47_1);
			this.aClass1_Sub1_Sub2_Sub4_3 = new Class1_Sub1_Sub2_Sub4(9, "b12_full", false, this.aClass47_1);
			this.aClass1_Sub1_Sub2_Sub4_4 = new Class1_Sub1_Sub2_Sub4(9, "q8_full", true, this.aClass47_1);
			this.method150();
			this.method130();
			@Pc(191) Class47 local191 = this.method207("config", 2, "config", 30, this.anIntArray68[2]);
			@Pc(203) Class47 local203 = this.method207("interface", 3, "interface", 35, this.anIntArray68[3]);
			@Pc(215) Class47 local215 = this.method207("2d graphics", 4, "media", 40, this.anIntArray68[4]);
			@Pc(227) Class47 local227 = this.method207("textures", 6, "textures", 45, this.anIntArray68[6]);
			@Pc(239) Class47 local239 = this.method207("chat system", 7, "wordenc", 50, this.anIntArray68[7]);
			@Pc(251) Class47 local251 = this.method207("sound effects", 8, "sounds", 55, this.anIntArray68[8]);
			this.aByteArrayArrayArray7 = new byte[4][104][104];
			this.anIntArrayArrayArray5 = new int[4][105][105];
			this.aClass37_1 = new Class37(104, 4, this.anIntArrayArrayArray5, 104, anInt401);
			for (@Pc(276) int local276 = 0; local276 < 4; local276++) {
				this.aClass19Array1[local276] = new Class19(99, 104, 104);
			}
			this.aClass1_Sub1_Sub2_Sub2_1 = new Class1_Sub1_Sub2_Sub2(512, 512);
			@Pc(311) Class47 local311 = this.method207("update list", 5, "versionlist", 60, this.anIntArray68[5]);
			this.method95(60, "Connecting to update server");
			this.aClass44_Sub1_1 = new Class44_Sub1();
			this.aClass44_Sub1_1.method632(local311, this);
			Class12.method300(this.aClass44_Sub1_1.method635());
			Class1_Sub1_Sub1_Sub5.method257(this.aClass44_Sub1_1.method634(0, (byte) 7), this.aClass44_Sub1_1);
			if (!aBoolean90) {
				this.anInt376 = 0;
				try {
					this.anInt376 = Integer.parseInt(this.getParameter("music"));
				} catch (@Pc(352) Exception local352) {
				}
				this.aBoolean87 = true;
				this.aClass44_Sub1_1.method641(2, this.anInt376);
				while (this.aClass44_Sub1_1.method642() > 0) {
					this.method175();
					try {
						Thread.sleep(100L);
					} catch (@Pc(370) Exception local370) {
					}
					if (this.aClass44_Sub1_1.anInt946 > 3) {
						this.method114("ondemand");
						return;
					}
				}
			}
			this.method95(65, "Requesting animations");
			@Pc(394) int local394 = this.aClass44_Sub1_1.method634(1, (byte) 7);
			for (@Pc(396) int local396 = 0; local396 < local394; local396++) {
				this.aClass44_Sub1_1.method641(1, local396);
			}
			@Pc(415) int local415;
			while (this.aClass44_Sub1_1.method642() > 0) {
				local415 = local394 - this.aClass44_Sub1_1.method642();
				if (local415 > 0) {
					this.method95(65, "Loading animations - " + local415 * 100 / local394 + "%");
				}
				this.method175();
				try {
					Thread.sleep(100L);
				} catch (@Pc(441) Exception local441) {
				}
				if (this.aClass44_Sub1_1.anInt946 > 3) {
					this.method114("ondemand");
					return;
				}
			}
			this.method95(70, "Requesting models");
			local394 = this.aClass44_Sub1_1.method634(0, (byte) 7);
			@Pc(475) int local475;
			for (local415 = 0; local415 < local394; local415++) {
				local475 = this.aClass44_Sub1_1.method639(local415);
				if ((local475 & 0x1) != 0) {
					this.aClass44_Sub1_1.method641(0, local415);
				}
			}
			local394 = this.aClass44_Sub1_1.method642();
			while (this.aClass44_Sub1_1.method642() > 0) {
				local475 = local394 - this.aClass44_Sub1_1.method642();
				if (local475 > 0) {
					this.method95(70, "Loading models - " + local475 * 100 / local394 + "%");
				}
				this.method175();
				try {
					Thread.sleep(100L);
				} catch (@Pc(526) Exception local526) {
				}
			}
			if (this.aClass45Array1[0] != null) {
				this.method95(75, "Requesting maps");
				this.aClass44_Sub1_1.method641(3, this.aClass44_Sub1_1.method636(48, 47, 0));
				this.aClass44_Sub1_1.method641(3, this.aClass44_Sub1_1.method636(48, 47, 1));
				this.aClass44_Sub1_1.method641(3, this.aClass44_Sub1_1.method636(48, 48, 0));
				this.aClass44_Sub1_1.method641(3, this.aClass44_Sub1_1.method636(48, 48, 1));
				this.aClass44_Sub1_1.method641(3, this.aClass44_Sub1_1.method636(48, 49, 0));
				this.aClass44_Sub1_1.method641(3, this.aClass44_Sub1_1.method636(48, 49, 1));
				this.aClass44_Sub1_1.method641(3, this.aClass44_Sub1_1.method636(47, 47, 0));
				this.aClass44_Sub1_1.method641(3, this.aClass44_Sub1_1.method636(47, 47, 1));
				this.aClass44_Sub1_1.method641(3, this.aClass44_Sub1_1.method636(47, 48, 0));
				this.aClass44_Sub1_1.method641(3, this.aClass44_Sub1_1.method636(47, 48, 1));
				this.aClass44_Sub1_1.method641(3, this.aClass44_Sub1_1.method636(148, 48, 0));
				this.aClass44_Sub1_1.method641(3, this.aClass44_Sub1_1.method636(148, 48, 1));
				local394 = this.aClass44_Sub1_1.method642();
				while (this.aClass44_Sub1_1.method642() > 0) {
					local475 = local394 - this.aClass44_Sub1_1.method642();
					if (local475 > 0) {
						this.method95(75, "Loading maps - " + local475 * 100 / local394 + "%");
					}
					this.method175();
					try {
						Thread.sleep(100L);
					} catch (@Pc(711) Exception local711) {
					}
				}
			}
			local394 = this.aClass44_Sub1_1.method634(0, (byte) 7);
			@Pc(732) int local732;
			for (local475 = 0; local475 < local394; local475++) {
				local732 = this.aClass44_Sub1_1.method639(local475);
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
					this.aClass44_Sub1_1.method644(0, local734, local475);
				}
			}
			this.aClass44_Sub1_1.method637(aBoolean89);
			if (!aBoolean90) {
				local394 = this.aClass44_Sub1_1.method634(2, (byte) 7);
				for (local732 = 1; local732 < local394; local732++) {
					if (this.aClass44_Sub1_1.method640(local732, 324)) {
						this.aClass44_Sub1_1.method644(2, (byte) 1, local732);
					}
				}
			}
			this.method95(80, "Unpacking media");
			this.aClass1_Sub1_Sub2_Sub3_18 = new Class1_Sub1_Sub2_Sub3(local215, "invback", 0);
			this.aClass1_Sub1_Sub2_Sub3_20 = new Class1_Sub1_Sub2_Sub3(local215, "chatback", 0);
			this.aClass1_Sub1_Sub2_Sub3_19 = new Class1_Sub1_Sub2_Sub3(local215, "mapback", 0);
			this.aClass1_Sub1_Sub2_Sub3_8 = new Class1_Sub1_Sub2_Sub3(local215, "backbase1", 0);
			this.aClass1_Sub1_Sub2_Sub3_9 = new Class1_Sub1_Sub2_Sub3(local215, "backbase2", 0);
			this.aClass1_Sub1_Sub2_Sub3_10 = new Class1_Sub1_Sub2_Sub3(local215, "backhmid1", 0);
			for (local732 = 0; local732 < 13; local732++) {
				this.aClass1_Sub1_Sub2_Sub3Array4[local732] = new Class1_Sub1_Sub2_Sub3(local215, "sideicons", local732);
			}
			this.aClass1_Sub1_Sub2_Sub2_2 = new Class1_Sub1_Sub2_Sub2(local215, "compass", 0);
			this.aClass1_Sub1_Sub2_Sub2_11 = new Class1_Sub1_Sub2_Sub2(local215, "mapedge", 0);
			this.aClass1_Sub1_Sub2_Sub2_11.method385();
			@Pc(934) int local934;
			try {
				for (local934 = 0; local934 < 100; local934++) {
					this.aClass1_Sub1_Sub2_Sub3Array3[local934] = new Class1_Sub1_Sub2_Sub3(local215, "mapscene", local934);
				}
			} catch (@Pc(952) Exception local952) {
			}
			try {
				for (local934 = 0; local934 < 100; local934++) {
					this.aClass1_Sub1_Sub2_Sub2Array5[local934] = new Class1_Sub1_Sub2_Sub2(local215, "mapfunction", local934);
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
			this.aClass1_Sub1_Sub2_Sub2_9 = new Class1_Sub1_Sub2_Sub2(local215, "mapmarker", 0);
			this.aClass1_Sub1_Sub2_Sub2_10 = new Class1_Sub1_Sub2_Sub2(local215, "mapmarker", 1);
			for (local934 = 0; local934 < 8; local934++) {
				this.aClass1_Sub1_Sub2_Sub2Array3[local934] = new Class1_Sub1_Sub2_Sub2(local215, "cross", local934);
			}
			this.aClass1_Sub1_Sub2_Sub2_5 = new Class1_Sub1_Sub2_Sub2(local215, "mapdots", 0);
			this.aClass1_Sub1_Sub2_Sub2_6 = new Class1_Sub1_Sub2_Sub2(local215, "mapdots", 1);
			this.aClass1_Sub1_Sub2_Sub2_7 = new Class1_Sub1_Sub2_Sub2(local215, "mapdots", 2);
			this.aClass1_Sub1_Sub2_Sub2_8 = new Class1_Sub1_Sub2_Sub2(local215, "mapdots", 3);
			this.aClass1_Sub1_Sub2_Sub3_11 = new Class1_Sub1_Sub2_Sub3(local215, "scrollbar", 0);
			this.aClass1_Sub1_Sub2_Sub3_12 = new Class1_Sub1_Sub2_Sub3(local215, "scrollbar", 1);
			this.aClass1_Sub1_Sub2_Sub3_13 = new Class1_Sub1_Sub2_Sub3(local215, "redstone1", 0);
			this.aClass1_Sub1_Sub2_Sub3_14 = new Class1_Sub1_Sub2_Sub3(local215, "redstone2", 0);
			this.aClass1_Sub1_Sub2_Sub3_15 = new Class1_Sub1_Sub2_Sub3(local215, "redstone3", 0);
			this.aClass1_Sub1_Sub2_Sub3_16 = new Class1_Sub1_Sub2_Sub3(local215, "redstone1", 0);
			this.aClass1_Sub1_Sub2_Sub3_16.method412();
			this.aClass1_Sub1_Sub2_Sub3_17 = new Class1_Sub1_Sub2_Sub3(local215, "redstone2", 0);
			this.aClass1_Sub1_Sub2_Sub3_17.method412();
			this.aClass1_Sub1_Sub2_Sub3_1 = new Class1_Sub1_Sub2_Sub3(local215, "redstone1", 0);
			this.aClass1_Sub1_Sub2_Sub3_1.method413();
			this.aClass1_Sub1_Sub2_Sub3_2 = new Class1_Sub1_Sub2_Sub3(local215, "redstone2", 0);
			this.aClass1_Sub1_Sub2_Sub3_2.method413();
			this.aClass1_Sub1_Sub2_Sub3_3 = new Class1_Sub1_Sub2_Sub3(local215, "redstone3", 0);
			this.aClass1_Sub1_Sub2_Sub3_3.method413();
			this.aClass1_Sub1_Sub2_Sub3_4 = new Class1_Sub1_Sub2_Sub3(local215, "redstone1", 0);
			this.aClass1_Sub1_Sub2_Sub3_4.method412();
			this.aClass1_Sub1_Sub2_Sub3_4.method413();
			this.aClass1_Sub1_Sub2_Sub3_5 = new Class1_Sub1_Sub2_Sub3(local215, "redstone2", 0);
			this.aClass1_Sub1_Sub2_Sub3_5.method412();
			this.aClass1_Sub1_Sub2_Sub3_5.method413();
			for (@Pc(1212) int local1212 = 0; local1212 < 2; local1212++) {
				this.aClass1_Sub1_Sub2_Sub3Array1[local1212] = new Class1_Sub1_Sub2_Sub3(local215, "mod_icons", local1212);
			}
			@Pc(1235) Class1_Sub1_Sub2_Sub2 local1235 = new Class1_Sub1_Sub2_Sub2(local215, "backleft1", 0);
			this.aClass35_6 = new Class35(this.method93(), local1235.anInt643, local1235.anInt644, 2);
			local1235.method386(0, 0);
			@Pc(1260) Class1_Sub1_Sub2_Sub2 local1260 = new Class1_Sub1_Sub2_Sub2(local215, "backleft2", 0);
			this.aClass35_7 = new Class35(this.method93(), local1260.anInt643, local1260.anInt644, 2);
			local1260.method386(0, 0);
			@Pc(1285) Class1_Sub1_Sub2_Sub2 local1285 = new Class1_Sub1_Sub2_Sub2(local215, "backright1", 0);
			this.aClass35_8 = new Class35(this.method93(), local1285.anInt643, local1285.anInt644, 2);
			local1285.method386(0, 0);
			@Pc(1310) Class1_Sub1_Sub2_Sub2 local1310 = new Class1_Sub1_Sub2_Sub2(local215, "backright2", 0);
			this.aClass35_9 = new Class35(this.method93(), local1310.anInt643, local1310.anInt644, 2);
			local1310.method386(0, 0);
			@Pc(1335) Class1_Sub1_Sub2_Sub2 local1335 = new Class1_Sub1_Sub2_Sub2(local215, "backtop1", 0);
			this.aClass35_10 = new Class35(this.method93(), local1335.anInt643, local1335.anInt644, 2);
			local1335.method386(0, 0);
			@Pc(1360) Class1_Sub1_Sub2_Sub2 local1360 = new Class1_Sub1_Sub2_Sub2(local215, "backvmid1", 0);
			this.aClass35_11 = new Class35(this.method93(), local1360.anInt643, local1360.anInt644, 2);
			local1360.method386(0, 0);
			@Pc(1385) Class1_Sub1_Sub2_Sub2 local1385 = new Class1_Sub1_Sub2_Sub2(local215, "backvmid2", 0);
			this.aClass35_12 = new Class35(this.method93(), local1385.anInt643, local1385.anInt644, 2);
			local1385.method386(0, 0);
			@Pc(1410) Class1_Sub1_Sub2_Sub2 local1410 = new Class1_Sub1_Sub2_Sub2(local215, "backvmid3", 0);
			this.aClass35_13 = new Class35(this.method93(), local1410.anInt643, local1410.anInt644, 2);
			local1410.method386(0, 0);
			@Pc(1435) Class1_Sub1_Sub2_Sub2 local1435 = new Class1_Sub1_Sub2_Sub2(local215, "backhmid2", 0);
			this.aClass35_14 = new Class35(this.method93(), local1435.anInt643, local1435.anInt644, 2);
			local1435.method386(0, 0);
			@Pc(1460) int local1460 = (int) (Math.random() * 21.0D) - 10;
			@Pc(1467) int local1467 = (int) (Math.random() * 21.0D) - 10;
			@Pc(1474) int local1474 = (int) (Math.random() * 21.0D) - 10;
			@Pc(1481) int local1481 = (int) (Math.random() * 41.0D) - 20;
			for (@Pc(1483) int local1483 = 0; local1483 < 100; local1483++) {
				if (this.aClass1_Sub1_Sub2_Sub2Array5[local1483] != null) {
					this.aClass1_Sub1_Sub2_Sub2Array5[local1483].method384(local1460 + local1481, (byte) 3, local1467 + local1481, local1474 + local1481);
				}
				if (this.aClass1_Sub1_Sub2_Sub3Array3[local1483] != null) {
					this.aClass1_Sub1_Sub2_Sub3Array3[local1483].method414(local1460 + local1481, local1467 + local1481, local1474 + local1481);
				}
			}
			this.method95(83, "Unpacking textures");
			Class1_Sub1_Sub2_Sub1.method344(local227, aBoolean78);
			Class1_Sub1_Sub2_Sub1.method348(0.8D);
			Class1_Sub1_Sub2_Sub1.method343();
			this.method95(86, "Unpacking config");
			Class27.method501(local191);
			Class9.method285(local191);
			Class21.method458(local191);
			Class15.method356(local191);
			Class13.method319(local191);
			Class23.method492(local191);
			Class33.method517(local191);
			Class39.method585(local191);
			Class36.method523(local191);
			Class15.aBoolean159 = aBoolean89;
			if (!aBoolean90) {
				this.method95(90, "Unpacking sounds");
				@Pc(1586) byte[] local1586 = local251.method662("sounds.dat", null);
				@Pc(1592) Class1_Sub1_Sub3 local1592 = new Class1_Sub1_Sub3(local1586, 15787);
				Class5.method77(local1592);
			}
			this.method95(95, "Unpacking interfaces");
			@Pc(1623) Class1_Sub1_Sub2_Sub4[] local1623 = new Class1_Sub1_Sub2_Sub4[] { this.aClass1_Sub1_Sub2_Sub4_1, this.aClass1_Sub1_Sub2_Sub4_2, this.aClass1_Sub1_Sub2_Sub4_3, this.aClass1_Sub1_Sub2_Sub4_4 };
			Class6.method230(local1623, local215, local203);
			this.method95(100, "Preparing game engine");
			@Pc(1639) int local1639;
			@Pc(1641) int local1641;
			@Pc(1643) int local1643;
			for (@Pc(1635) int local1635 = 0; local1635 < 33; local1635++) {
				local1639 = 999;
				local1641 = 0;
				for (local1643 = 0; local1643 < 34; local1643++) {
					if (this.aClass1_Sub1_Sub2_Sub3_19.aByteArray7[local1643 + local1635 * this.aClass1_Sub1_Sub2_Sub3_19.anInt666] == 0) {
						if (local1639 == 999) {
							local1639 = local1643;
						}
					} else if (local1639 != 999) {
						local1641 = local1643;
						break;
					}
				}
				this.anIntArray51[local1635] = local1639;
				this.anIntArray44[local1635] = local1641 - local1639;
			}
			@Pc(1701) int local1701;
			for (local1639 = 5; local1639 < 156; local1639++) {
				local1641 = 999;
				local1643 = 0;
				for (local1701 = 25; local1701 < 172; local1701++) {
					if (this.aClass1_Sub1_Sub2_Sub3_19.aByteArray7[local1701 + local1639 * this.aClass1_Sub1_Sub2_Sub3_19.anInt666] == 0 && (local1701 > 34 || local1639 > 34)) {
						if (local1641 == 999) {
							local1641 = local1701;
						}
					} else if (local1641 != 999) {
						local1643 = local1701;
						break;
					}
				}
				this.anIntArray42[local1639 - 5] = local1641 - 25;
				this.anIntArray41[local1639 - 5] = local1643 - local1641;
			}
			Class1_Sub1_Sub2_Sub1.method341(96, 479);
			this.anIntArray45 = Class1_Sub1_Sub2_Sub1.anIntArray179;
			Class1_Sub1_Sub2_Sub1.method341(261, 190);
			this.anIntArray46 = Class1_Sub1_Sub2_Sub1.anIntArray179;
			Class1_Sub1_Sub2_Sub1.method341(334, 512);
			this.anIntArray47 = Class1_Sub1_Sub2_Sub1.anIntArray179;
			@Pc(1785) int[] local1785 = new int[9];
			for (local1643 = 0; local1643 < 9; local1643++) {
				local1701 = local1643 * 32 + 128 + 15;
				@Pc(1803) int local1803 = local1701 * 3 + 600;
				@Pc(1807) int local1807 = Class1_Sub1_Sub2_Sub1.anIntArray177[local1701];
				local1785[local1643] = local1803 * local1807 >> 16;
			}
			Class37.method562(local1785);
			Class42.method590(local239);
			this.aClass11_1 = new Class11(228, this);
			this.method94(this.aClass11_1, 10);
			Class1_Sub1_Sub1_Sub2.aClient1 = this;
		} catch (@Pc(1844) Exception local1844) {
			signlink.reporterror("loaderror " + this.aString5 + " " + this.anInt367);
			this.aBoolean76 = true;
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(Z)V")
	private void method117() {
		try {
			this.aBoolean59 = true;
			try {
				@Pc(4) long local4 = System.currentTimeMillis();
				@Pc(6) int local6 = 0;
				@Pc(8) int local8 = 20;
				while (this.aBoolean84) {
					this.anInt257++;
					this.method107(699);
					this.method107(699);
					this.method166();
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
			this.aBoolean59 = false;
		} catch (@Pc(71) RuntimeException local71) {
			signlink.reporterror("21026, " + false + ", " + local71.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "m", descriptor = "(I)V")
	private void method118() {
		try {
			this.aClass35_16.method520();
			@Pc(18) int local18;
			@Pc(20) int local20;
			if (this.anInt215 == 2) {
				@Pc(13) byte[] local13 = this.aClass1_Sub1_Sub2_Sub3_19.aByteArray7;
				@Pc(15) int[] local15 = Class1_Sub1_Sub2.anIntArray212;
				local18 = local13.length;
				for (local20 = 0; local20 < local18; local20++) {
					if (local13[local20] == 0) {
						local15[local20] = 0;
					}
				}
				this.aClass1_Sub1_Sub2_Sub2_2.method392(this.anIntArray51, 0, 25, 256, this.anInt249, 33, this.anIntArray44, 33, 25, 0);
				this.aClass35_17.method520();
			} else {
				@Pc(64) int local64 = this.anInt249 + this.anInt266 & 0x7FF;
				@Pc(71) int local71 = aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt980 / 32 + 48;
				local18 = 464 - aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt981 / 32;
				this.aClass1_Sub1_Sub2_Sub2_1.method392(this.anIntArray42, 5, local18, this.anInt322 + 256, local64, 151, this.anIntArray41, 146, local71, 25);
				this.aClass1_Sub1_Sub2_Sub2_2.method392(this.anIntArray51, 0, 25, 256, this.anInt249, 33, this.anIntArray44, 33, 25, 0);
				for (local20 = 0; local20 < this.anInt204; local20++) {
					local71 = this.anIntArray32[local20] * 4 + 2 - aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt980 / 32;
					local18 = this.anIntArray33[local20] * 4 + 2 - aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt981 / 32;
					this.method223(local71, this.aClass1_Sub1_Sub2_Sub2Array4[local20], local18);
				}
				@Pc(166) int local166;
				for (@Pc(162) int local162 = 0; local162 < 104; local162++) {
					for (local166 = 0; local166 < 104; local166++) {
						@Pc(178) Class29 local178 = this.aClass29ArrayArrayArray1[this.anInt356][local162][local166];
						if (local178 != null) {
							local71 = local162 * 4 + 2 - aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt980 / 32;
							local18 = local166 * 4 + 2 - aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt981 / 32;
							this.method223(local71, this.aClass1_Sub1_Sub2_Sub2_5, local18);
						}
					}
				}
				this.anInt361 += 0;
				for (local166 = 0; local166 < this.anInt294; local166++) {
					@Pc(235) Class1_Sub1_Sub1_Sub1_Sub2 local235 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[this.anIntArray57[local166]];
					if (local235 != null && local235.method676() && local235.aClass13_2.aBoolean145) {
						local71 = local235.anInt980 / 32 - aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt980 / 32;
						local18 = local235.anInt981 / 32 - aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt981 / 32;
						this.method223(local71, this.aClass1_Sub1_Sub2_Sub2_6, local18);
					}
				}
				@Pc(289) Class1_Sub1_Sub1_Sub1_Sub1 local289;
				for (@Pc(279) int local279 = 0; local279 < this.anInt389; local279++) {
					local289 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[this.anIntArray90[local279]];
					if (local289 != null && local289.method676()) {
						local71 = local289.anInt980 / 32 - aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt980 / 32;
						local18 = local289.anInt981 / 32 - aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt981 / 32;
						@Pc(317) boolean local317 = false;
						@Pc(321) long local321 = Class48.method663(local289.aString3);
						for (@Pc(323) int local323 = 0; local323 < this.anInt338; local323++) {
							if (local321 == this.aLongArray3[local323] && this.anIntArray43[local323] != 0) {
								local317 = true;
								break;
							}
						}
						if (aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt137 != 0 && local289.anInt137 != 0) {
							if (aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt137 == local289.anInt137) {
								local317 = true;
							} else {
								local317 = false;
							}
						}
						if (local317) {
							this.method223(local71, this.aClass1_Sub1_Sub2_Sub2_8, local18);
						} else {
							this.method223(local71, this.aClass1_Sub1_Sub2_Sub2_7, local18);
						}
					}
				}
				if (this.anInt293 != 0 && anInt396 % 20 < 10) {
					if (this.anInt293 == 1 && this.anInt237 >= 0 && this.anInt237 < this.aClass1_Sub1_Sub1_Sub1_Sub2Array1.length) {
						@Pc(413) Class1_Sub1_Sub1_Sub1_Sub2 local413 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[this.anInt237];
						if (local413 != null) {
							local71 = local413.anInt980 / 32 - aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt980 / 32;
							local18 = local413.anInt981 / 32 - aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt981 / 32;
							this.method97(local71, this.aClass1_Sub1_Sub2_Sub2_10, local18, this.anInt208);
						}
					}
					if (this.anInt293 == 2) {
						local71 = (this.anInt403 - this.anInt370) * 4 + 2 - aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt980 / 32;
						local18 = (this.anInt404 - this.anInt371) * 4 + 2 - aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt981 / 32;
						this.method97(local71, this.aClass1_Sub1_Sub2_Sub2_10, local18, this.anInt208);
					}
					if (this.anInt293 == 10 && this.anInt240 >= 0 && this.anInt240 < this.aClass1_Sub1_Sub1_Sub1_Sub1Array1.length) {
						local289 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[this.anInt240];
						if (local289 != null) {
							local71 = local289.anInt980 / 32 - aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt980 / 32;
							local18 = local289.anInt981 / 32 - aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt981 / 32;
							this.method97(local71, this.aClass1_Sub1_Sub2_Sub2_10, local18, this.anInt208);
						}
					}
				}
				if (this.anInt241 != 0) {
					local71 = this.anInt241 * 4 + 2 - aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt980 / 32;
					local18 = this.anInt242 * 4 + 2 - aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt981 / 32;
					this.method223(local71, this.aClass1_Sub1_Sub2_Sub2_9, local18);
				}
				Class1_Sub1_Sub2.method436(16777215, 210, 78, 3, 97, 3);
				this.aClass35_17.method520();
			}
		} catch (@Pc(581) RuntimeException local581) {
			signlink.reporterror("47037, " + 0 + ", " + local581.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIILclient!d;I)V")
	private void method119(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class6 arg2, @OriginalArg(4) int arg3) {
		try {
			if (arg2.anInt417 == 0 && arg2.anIntArray98 != null && (!arg2.aBoolean96 || this.anInt291 == arg2.anInt415 || this.anInt252 == arg2.anInt415 || this.anInt383 == arg2.anInt415)) {
				@Pc(29) int local29 = Class1_Sub1_Sub2.anInt692;
				@Pc(31) int local31 = Class1_Sub1_Sub2.anInt690;
				@Pc(33) int local33 = Class1_Sub1_Sub2.anInt693;
				@Pc(35) int local35 = Class1_Sub1_Sub2.anInt691;
				Class1_Sub1_Sub2.method433(this.aByte6, arg3 + arg2.anInt421, arg1 + arg2.anInt420, arg3, arg1);
				@Pc(52) int local52 = arg2.anIntArray98.length;
				for (@Pc(54) int local54 = 0; local54 < local52; local54++) {
					@Pc(63) int local63 = arg2.anIntArray99[local54] + arg1;
					@Pc(72) int local72 = arg2.anIntArray100[local54] + arg3 - arg0;
					@Pc(79) Class6 local79 = Class6.aClass6Array1[arg2.anIntArray98[local54]];
					@Pc(84) int local84 = local63 + local79.anInt422;
					@Pc(89) int local89 = local72 + local79.anInt423;
					if (local79.anInt419 > 0) {
						this.method123(local79);
					}
					if (local79.anInt417 == 0) {
						if (local79.anInt426 > local79.anInt425 - local79.anInt421) {
							local79.anInt426 = local79.anInt425 - local79.anInt421;
						}
						if (local79.anInt426 < 0) {
							local79.anInt426 = 0;
						}
						this.method119(local79.anInt426, local84, local79, local89);
						if (local79.anInt425 > local79.anInt421) {
							this.method103(local89, local84 + local79.anInt420, local79.anInt426, local79.anInt425, local79.anInt421);
						}
					} else if (local79.anInt417 != 1) {
						@Pc(161) int local161;
						@Pc(165) int local165;
						@Pc(176) int local176;
						@Pc(211) int local211;
						@Pc(218) int local218;
						@Pc(159) int local159;
						@Pc(209) int local209;
						if (local79.anInt417 == 2) {
							local159 = 0;
							for (local161 = 0; local161 < local79.anInt421; local161++) {
								for (local165 = 0; local165 < local79.anInt420; local165++) {
									local176 = local84 + local165 * (local79.anInt428 + 32);
									@Pc(185) int local185 = local89 + local161 * (local79.anInt429 + 32);
									if (local159 < 20) {
										local176 += local79.anIntArray101[local159];
										local185 += local79.anIntArray102[local159];
									}
									if (local79.anIntArray94[local159] > 0) {
										local209 = 0;
										local211 = 0;
										local218 = local79.anIntArray94[local159] - 1;
										if (local176 > Class1_Sub1_Sub2.anInt692 - 32 && local176 < Class1_Sub1_Sub2.anInt693 && local185 > Class1_Sub1_Sub2.anInt690 - 32 && local185 < Class1_Sub1_Sub2.anInt691 || this.anInt333 != 0 && this.anInt332 == local159) {
											@Pc(243) int local243 = 0;
											if (this.anInt260 == 1 && this.anInt261 == local159 && this.anInt262 == local79.anInt415) {
												local243 = 16777215;
											}
											@Pc(267) Class1_Sub1_Sub2_Sub2 local267 = Class15.method364(local218, local243, local79.anIntArray95[local159]);
											if (local267 != null) {
												@Pc(347) int local347;
												if (this.anInt333 != 0 && this.anInt332 == local159 && this.anInt331 == local79.anInt415) {
													local209 = super.anInt186 - this.anInt334;
													local211 = super.anInt187 - this.anInt335;
													if (local209 < 5 && local209 > -5) {
														local209 = 0;
													}
													if (local211 < 5 && local211 > -5) {
														local211 = 0;
													}
													if (this.anInt278 < 5) {
														local209 = 0;
														local211 = 0;
													}
													local267.method390(this.anInt238, local185 + local211, local176 + local209);
													if (local185 + local211 < Class1_Sub1_Sub2.anInt690 && arg2.anInt426 > 0) {
														local347 = this.anInt202 * (Class1_Sub1_Sub2.anInt690 - local185 - local211) / 3;
														if (local347 > this.anInt202 * 10) {
															local347 = this.anInt202 * 10;
														}
														if (local347 > arg2.anInt426) {
															local347 = arg2.anInt426;
														}
														arg2.anInt426 -= local347;
														this.anInt335 += local347;
													}
													if (local185 + local211 + 32 > Class1_Sub1_Sub2.anInt691 && arg2.anInt426 < arg2.anInt425 - arg2.anInt421) {
														local347 = this.anInt202 * (local185 + local211 + 32 - Class1_Sub1_Sub2.anInt691) / 3;
														if (local347 > this.anInt202 * 10) {
															local347 = this.anInt202 * 10;
														}
														if (local347 > arg2.anInt425 - arg2.anInt421 - arg2.anInt426) {
															local347 = arg2.anInt425 - arg2.anInt421 - arg2.anInt426;
														}
														arg2.anInt426 += local347;
														this.anInt335 -= local347;
													}
												} else if (this.anInt353 != 0 && this.anInt352 == local159 && this.anInt351 == local79.anInt415) {
													local267.method390(this.anInt238, local185, local176);
												} else {
													local267.method388(local185, this.aByte14, local176);
												}
												if (local267.anInt647 == 33 || local79.anIntArray95[local159] != 1) {
													local347 = local79.anIntArray95[local159];
													this.aClass1_Sub1_Sub2_Sub4_1.method447(0, method182(local347), local176 + local209 + 1, local185 + 10 + local211);
													this.aClass1_Sub1_Sub2_Sub4_1.method447(16776960, method182(local347), local176 + local209, local185 + 9 + local211);
												}
											}
										}
									} else if (local79.aClass1_Sub1_Sub2_Sub2Array8 != null && local159 < 20) {
										@Pc(538) Class1_Sub1_Sub2_Sub2 local538 = local79.aClass1_Sub1_Sub2_Sub2Array8[local159];
										if (local538 != null) {
											local538.method388(local185, this.aByte14, local176);
										}
									}
									local159++;
								}
							}
						} else if (local79.anInt417 == 3) {
							@Pc(565) boolean local565 = false;
							if (this.anInt383 == local79.anInt415 || this.anInt252 == local79.anInt415 || this.anInt291 == local79.anInt415) {
								local565 = true;
							}
							if (this.method170(local79)) {
								local159 = local79.anInt431;
								if (local565 && local79.anInt433 != 0) {
									local159 = local79.anInt433;
								}
							} else {
								local159 = local79.anInt430;
								if (local565 && local79.anInt432 != 0) {
									local159 = local79.anInt432;
								}
							}
							if (local79.aByte16 == 0) {
								if (local79.aBoolean102) {
									Class1_Sub1_Sub2.method436(local159, 210, local89, local79.anInt421, local84, local79.anInt420);
								} else {
									Class1_Sub1_Sub2.method437(local84, local79.anInt420, local159, local89, local79.anInt421);
								}
							} else if (local79.aBoolean102) {
								Class1_Sub1_Sub2.method435(local89, local79.anInt421, 256 - (local79.aByte16 & 0xFF), local159, local79.anInt420, local84);
							} else {
								Class1_Sub1_Sub2.method438(local79.anInt421, local159, local84, local79.anInt420, 256 - (local79.aByte16 & 0xFF), local89);
							}
						} else {
							@Pc(683) Class1_Sub1_Sub2_Sub4 local683;
							if (local79.anInt417 == 4) {
								local683 = local79.aClass1_Sub1_Sub2_Sub4_5;
								@Pc(686) String local686 = local79.aString18;
								@Pc(688) boolean local688 = false;
								if (this.anInt383 == local79.anInt415 || this.anInt252 == local79.anInt415 || this.anInt291 == local79.anInt415) {
									local688 = true;
								}
								if (this.method170(local79)) {
									local161 = local79.anInt431;
									if (local688 && local79.anInt433 != 0) {
										local161 = local79.anInt433;
									}
									if (local79.aString19.length() > 0) {
										local686 = local79.aString19;
									}
								} else {
									local161 = local79.anInt430;
									if (local688 && local79.anInt432 != 0) {
										local161 = local79.anInt432;
									}
								}
								if (local79.anInt418 == 6 && this.aBoolean66) {
									local686 = "Please wait...";
									local161 = local79.anInt430;
								}
								if (Class1_Sub1_Sub2.anInt688 == 479) {
									if (local161 == 16776960) {
										local161 = 255;
									}
									if (local161 == 49152) {
										local161 = 16777215;
									}
								}
								local209 = local89 + local683.anInt701;
								while (local686.length() > 0) {
									if (local686.indexOf("%") != -1) {
										label348: while (true) {
											local211 = local686.indexOf("%1");
											if (local211 == -1) {
												while (true) {
													local211 = local686.indexOf("%2");
													if (local211 == -1) {
														while (true) {
															local211 = local686.indexOf("%3");
															if (local211 == -1) {
																while (true) {
																	local211 = local686.indexOf("%4");
																	if (local211 == -1) {
																		while (true) {
																			local211 = local686.indexOf("%5");
																			if (local211 == -1) {
																				break label348;
																			}
																			local686 = local686.substring(0, local211) + this.method154(this.method176(4, this.aByte9, local79)) + local686.substring(local211 + 2);
																		}
																	}
																	local686 = local686.substring(0, local211) + this.method154(this.method176(3, this.aByte9, local79)) + local686.substring(local211 + 2);
																}
															}
															local686 = local686.substring(0, local211) + this.method154(this.method176(2, this.aByte9, local79)) + local686.substring(local211 + 2);
														}
													}
													local686 = local686.substring(0, local211) + this.method154(this.method176(1, this.aByte9, local79)) + local686.substring(local211 + 2);
												}
											}
											local686 = local686.substring(0, local211) + this.method154(this.method176(0, this.aByte9, local79)) + local686.substring(local211 + 2);
										}
									}
									local211 = local686.indexOf("\\n");
									@Pc(965) String local965;
									if (local211 == -1) {
										local965 = local686;
										local686 = "";
									} else {
										local965 = local686.substring(0, local211);
										local686 = local686.substring(local211 + 2);
									}
									if (local79.aBoolean103) {
										local683.method444(local79.aBoolean104, local161, local84 + local79.anInt420 / 2, local965, local209);
									} else {
										local683.method451(local161, local209, local79.aBoolean104, local84, local965);
									}
									local209 += local683.anInt701;
								}
							} else if (local79.anInt417 == 5) {
								@Pc(1027) Class1_Sub1_Sub2_Sub2 local1027;
								if (this.method170(local79)) {
									local1027 = local79.aClass1_Sub1_Sub2_Sub2_15;
								} else {
									local1027 = local79.aClass1_Sub1_Sub2_Sub2_14;
								}
								if (local1027 != null) {
									local1027.method388(local89, this.aByte14, local84);
								}
							} else if (local79.anInt417 == 6) {
								local159 = Class1_Sub1_Sub2_Sub1.anInt585;
								local161 = Class1_Sub1_Sub2_Sub1.anInt586;
								Class1_Sub1_Sub2_Sub1.anInt585 = local84 + local79.anInt420 / 2;
								Class1_Sub1_Sub2_Sub1.anInt586 = local89 + local79.anInt421 / 2;
								local165 = Class1_Sub1_Sub2_Sub1.anIntArray177[local79.anInt441] * local79.anInt440 >> 16;
								local176 = Class1_Sub1_Sub2_Sub1.anIntArray178[local79.anInt441] * local79.anInt440 >> 16;
								@Pc(1089) boolean local1089 = this.method170(local79);
								if (local1089) {
									local209 = local79.anInt439;
								} else {
									local209 = local79.anInt438;
								}
								@Pc(1109) Class1_Sub1_Sub1_Sub5 local1109;
								if (local209 == -1) {
									local1109 = local79.method232(-1, -1, local1089);
								} else {
									@Pc(1115) Class27 local1115 = Class27.aClass27Array1[local209];
									local1109 = local79.method232(local1115.anIntArray225[local79.anInt413], local1115.anIntArray224[local79.anInt413], local1089);
								}
								if (local1109 != null) {
									local1109.method280(local79.anInt442, 0, local79.anInt441, 0, local165, local176);
								}
								Class1_Sub1_Sub2_Sub1.anInt585 = local159;
								Class1_Sub1_Sub2_Sub1.anInt586 = local161;
							} else if (local79.anInt417 == 7) {
								local683 = local79.aClass1_Sub1_Sub2_Sub4_5;
								local161 = 0;
								for (local165 = 0; local165 < local79.anInt421; local165++) {
									for (local176 = 0; local176 < local79.anInt420; local176++) {
										if (local79.anIntArray94[local161] > 0) {
											@Pc(1179) Class15 local1179 = Class15.method358(local79.anIntArray94[local161] - 1);
											@Pc(1182) String local1182 = local1179.aString25;
											if (local1179.aBoolean160 || local79.anIntArray95[local161] != 1) {
												local1182 = local1182 + " x" + method180(local79.anIntArray95[local161]);
											}
											local211 = local84 + local176 * (local79.anInt428 + 115);
											local218 = local89 + local165 * (local79.anInt429 + 12);
											if (local79.aBoolean103) {
												local683.method444(local79.aBoolean104, local79.anInt430, local211 + local79.anInt420 / 2, local1182, local218);
											} else {
												local683.method451(local79.anInt430, local218, local79.aBoolean104, local211, local1182);
											}
										}
										local161++;
									}
								}
							}
						}
					}
				}
				Class1_Sub1_Sub2.method433(this.aByte6, local35, local33, local31, local29);
			}
		} catch (@Pc(1291) RuntimeException local1291) {
			signlink.reporterror("32464, " + 6 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local1291.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "g", descriptor = "(B)V")
	private void method120() {
		try {
			if (aBoolean90 && this.anInt229 == 2 && Class4.anInt164 != this.anInt356) {
				this.aClass35_17.method520();
				this.aClass1_Sub1_Sub2_Sub4_2.method443(257, "Loading - please wait.", 0, 151);
				this.aClass1_Sub1_Sub2_Sub4_2.method443(256, "Loading - please wait.", 16777215, 150);
				this.aClass35_17.method521(4, 4, super.aGraphics2);
				this.anInt229 = 1;
				this.aLong17 = System.currentTimeMillis();
			}
			if (this.anInt229 == 1) {
				@Pc(56) int local56 = this.method121(this.aByte12);
				if (local56 != 0 && System.currentTimeMillis() - this.aLong17 > 360000L) {
					signlink.reporterror(this.aString11 + " glcfb " + this.aLong14 + "," + local56 + "," + aBoolean90 + "," + this.aClass45Array1[0] + "," + this.aClass44_Sub1_1.method642() + "," + this.anInt356 + "," + this.anInt210 + "," + this.anInt211);
					this.aLong17 = System.currentTimeMillis();
				}
			}
			if (this.anInt229 == 2 && this.anInt356 != this.anInt314) {
				this.anInt314 = this.anInt356;
				this.method122(this.anInt356);
			}
		} catch (@Pc(137) RuntimeException local137) {
			signlink.reporterror("64388, " + 6 + ", " + local137.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "h", descriptor = "(B)I")
	private int method121(@OriginalArg(0) byte arg0) {
		try {
			for (@Pc(3) int local3 = 0; local3 < this.aByteArrayArray2.length; local3++) {
				if (this.aByteArrayArray2[local3] == null && this.anIntArray65[local3] != -1) {
					return -1;
				}
				if (this.aByteArrayArray1[local3] == null && this.anIntArray66[local3] != -1) {
					return -2;
				}
			}
			@Pc(39) boolean local39 = true;
			for (@Pc(41) int local41 = 0; local41 < this.aByteArrayArray2.length; local41++) {
				@Pc(48) byte[] local48 = this.aByteArrayArray1[local41];
				if (local48 != null) {
					@Pc(62) int local62 = (this.anIntArray64[local41] >> 8) * 64 - this.anInt370;
					@Pc(74) int local74 = (this.anIntArray64[local41] & 0xFF) * 64 - this.anInt371;
					local39 &= Class4.method57(local74, local62, local48);
				}
			}
			if (!local39) {
				return -3;
			} else if (this.aBoolean94) {
				return -4;
			} else {
				this.anInt229 = 2;
				Class4.anInt164 = this.anInt356;
				this.method211();
				this.aClass1_Sub1_Sub3_3.method465(214);
				if (arg0 == 2) {
					@Pc(116) boolean local116 = false;
				} else {
					anInt304 = 384;
				}
				return 0;
			}
		} catch (@Pc(123) RuntimeException local123) {
			signlink.reporterror("76031, " + arg0 + ", " + local123.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(BI)V")
	private void method122(@OriginalArg(1) int arg0) {
		try {
			@Pc(5) int[] local5 = this.aClass1_Sub1_Sub2_Sub2_1.anIntArray207;
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
						this.aClass37_1.method561(local5, local34, arg0, local36, local22);
					}
					if (arg0 < 3 && (this.aByteArrayArrayArray7[arg0 + 1][local36][local22] & 0x8) != 0) {
						this.aClass37_1.method561(local5, local34, arg0 + 1, local36, local22);
					}
					local34 += 4;
				}
			}
			local34 = ((int) (Math.random() * 20.0D) + 238 - 10 << 16) + ((int) (Math.random() * 20.0D) + 238 - 10 << 8) + (int) (Math.random() * 20.0D) + 238 - 10;
			local36 = (int) (Math.random() * 20.0D) + 238 - 10 << 16;
			this.aClass1_Sub1_Sub2_Sub2_1.method383((byte) 5);
			@Pc(146) int local146;
			for (@Pc(142) int local142 = 1; local142 < 103; local142++) {
				for (local146 = 1; local146 < 103; local146++) {
					if ((this.aByteArrayArrayArray7[arg0][local146][local142] & 0x18) == 0) {
						this.method168(local146, local142, local34, (byte) 5, arg0, local36);
					}
					if (arg0 < 3 && (this.aByteArrayArrayArray7[arg0 + 1][local146][local142] & 0x8) != 0) {
						this.method168(local146, local142, local34, (byte) 5, arg0 + 1, local36);
					}
				}
			}
			this.aClass35_17.method520();
			this.anInt204 = 0;
			for (local146 = 0; local146 < 104; local146++) {
				for (@Pc(221) int local221 = 0; local221 < 104; local221++) {
					@Pc(231) int local231 = this.aClass37_1.method555(this.anInt356, local146, local221);
					if (local231 != 0) {
						local231 = local231 >> 14 & 0x7FFF;
						@Pc(243) int local243 = Class9.method287(local231).anInt506;
						if (local243 >= 0) {
							@Pc(247) int local247 = local146;
							@Pc(249) int local249 = local221;
							if (local243 != 22 && local243 != 29 && local243 != 34 && local243 != 36 && local243 != 46 && local243 != 47 && local243 != 48) {
								@Pc(281) int[][] local281 = this.aClass19Array1[this.anInt356].anIntArrayArray18;
								for (@Pc(283) int local283 = 0; local283 < 10; local283++) {
									@Pc(290) int local290 = (int) (Math.random() * 4.0D);
									if (local290 == 0 && local247 > 0 && local247 > local146 - 3 && (local281[local247 - 1][local249] & 0x280108) == 0) {
										local247--;
									}
									if (local290 == 1 && local247 < 103 && local247 < local146 + 3 && (local281[local247 + 1][local249] & 0x280180) == 0) {
										local247++;
									}
									if (local290 == 2 && local249 > 0 && local249 > local221 - 3 && (local281[local247][local249 - 1] & 0x280102) == 0) {
										local249--;
									}
									if (local290 == 3 && local249 < 103 && local249 < local221 + 3 && (local281[local247][local249 + 1] & 0x280120) == 0) {
										local249++;
									}
								}
							}
							this.aClass1_Sub1_Sub2_Sub2Array4[this.anInt204] = this.aClass1_Sub1_Sub2_Sub2Array5[local243];
							this.anIntArray32[this.anInt204] = local247;
							this.anIntArray33[this.anInt204] = local249;
							this.anInt204++;
						}
					}
				}
			}
			anInt380++;
			if (anInt380 > 112) {
				anInt380 = 0;
				this.aClass1_Sub1_Sub3_3.method465(125);
				this.aClass1_Sub1_Sub3_3.method466(50);
			}
		} catch (@Pc(438) RuntimeException local438) {
			signlink.reporterror("89876, " + -89 + ", " + arg0 + ", " + local438.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILclient!d;)V")
	private void method123(@OriginalArg(1) Class6 arg0) {
		try {
			@Pc(11) int local11 = arg0.anInt419;
			@Pc(67) int local67;
			if ((local11 < 1 || local11 > 100) && (local11 < 701 || local11 > 800)) {
				if (local11 >= 101 && local11 <= 200 || local11 >= 801 && local11 <= 900) {
					local67 = this.anInt338;
					if (this.anInt339 != 2) {
						local67 = 0;
					}
					if (local11 > 800) {
						local11 -= 701;
					} else {
						local11 -= 101;
					}
					if (local11 >= local67) {
						arg0.aString18 = "";
						arg0.anInt418 = 0;
					} else {
						if (this.anIntArray43[local11] == 0) {
							arg0.aString18 = "@red@Offline";
						} else if (this.anIntArray43[local11] == anInt392) {
							arg0.aString18 = "@gre@World-" + (this.anIntArray43[local11] - 9);
						} else {
							arg0.aString18 = "@yel@World-" + (this.anIntArray43[local11] - 9);
						}
						arg0.anInt418 = 1;
					}
				} else if (local11 == 203) {
					local67 = this.anInt338;
					if (this.anInt339 != 2) {
						local67 = 0;
					}
					arg0.anInt425 = local67 * 15 + 20;
					if (arg0.anInt425 <= arg0.anInt421) {
						arg0.anInt425 = arg0.anInt421 + 1;
					}
				} else if (local11 >= 401 && local11 <= 500) {
					local11 -= 401;
					if (local11 == 0 && this.anInt339 == 0) {
						arg0.aString18 = "Loading ignore list";
						arg0.anInt418 = 0;
					} else if (local11 == 1 && this.anInt339 == 0) {
						arg0.aString18 = "Please wait...";
						arg0.anInt418 = 0;
					} else {
						local67 = this.anInt264;
						if (this.anInt339 == 0) {
							local67 = 0;
						}
						if (local11 >= local67) {
							arg0.aString18 = "";
							arg0.anInt418 = 0;
						} else {
							arg0.aString18 = Class48.method667(Class48.method664(this.aLongArray4[local11]));
							arg0.anInt418 = 1;
						}
					}
				} else if (local11 == 503) {
					arg0.anInt425 = this.anInt264 * 15 + 20;
					if (arg0.anInt425 <= arg0.anInt421) {
						arg0.anInt425 = arg0.anInt421 + 1;
					}
				} else if (local11 == 327) {
					arg0.anInt441 = 150;
					arg0.anInt442 = (int) (Math.sin((double) anInt396 / 40.0D) * 256.0D) & 0x7FF;
					if (this.aBoolean53) {
						for (local67 = 0; local67 < 7; local67++) {
							@Pc(336) int local336 = this.anIntArray39[local67];
							if (local336 >= 0 && !Class23.aClass23Array1[local336].method494()) {
								return;
							}
						}
						this.aBoolean53 = false;
						@Pc(355) Class1_Sub1_Sub1_Sub5[] local355 = new Class1_Sub1_Sub1_Sub5[7];
						@Pc(357) int local357 = 0;
						for (@Pc(359) int local359 = 0; local359 < 7; local359++) {
							@Pc(366) int local366 = this.anIntArray39[local359];
							if (local366 >= 0) {
								local355[local357++] = Class23.aClass23Array1[local366].method495();
							}
						}
						@Pc(388) Class1_Sub1_Sub1_Sub5 local388 = new Class1_Sub1_Sub1_Sub5(local355, local357, -33019);
						for (@Pc(390) int local390 = 0; local390 < 5; local390++) {
							if (this.anIntArray48[local390] != 0) {
								local388.method274(anIntArrayArray5[local390][0], anIntArrayArray5[local390][this.anIntArray48[local390]]);
								if (local390 == 1) {
									local388.method274(anIntArray67[0], anIntArray67[this.anIntArray48[local390]]);
								}
							}
						}
						local388.method267((byte) 3);
						local388.method268(Class27.aClass27Array1[aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt984].anIntArray224[0], 188);
						local388.method277(64, 850, -30, -50, -30, true);
						arg0.anInt434 = 5;
						arg0.anInt435 = 0;
						Class6.method234(local388);
					}
				} else if (local11 == 324) {
					if (this.aClass1_Sub1_Sub2_Sub2_3 == null) {
						this.aClass1_Sub1_Sub2_Sub2_3 = arg0.aClass1_Sub1_Sub2_Sub2_14;
						this.aClass1_Sub1_Sub2_Sub2_4 = arg0.aClass1_Sub1_Sub2_Sub2_15;
					}
					if (this.aBoolean86) {
						arg0.aClass1_Sub1_Sub2_Sub2_14 = this.aClass1_Sub1_Sub2_Sub2_4;
					} else {
						arg0.aClass1_Sub1_Sub2_Sub2_14 = this.aClass1_Sub1_Sub2_Sub2_3;
					}
				} else if (local11 == 325) {
					if (this.aClass1_Sub1_Sub2_Sub2_3 == null) {
						this.aClass1_Sub1_Sub2_Sub2_3 = arg0.aClass1_Sub1_Sub2_Sub2_14;
						this.aClass1_Sub1_Sub2_Sub2_4 = arg0.aClass1_Sub1_Sub2_Sub2_15;
					}
					if (this.aBoolean86) {
						arg0.aClass1_Sub1_Sub2_Sub2_14 = this.aClass1_Sub1_Sub2_Sub2_3;
					} else {
						arg0.aClass1_Sub1_Sub2_Sub2_14 = this.aClass1_Sub1_Sub2_Sub2_4;
					}
				} else if (local11 == 600) {
					arg0.aString18 = this.aString6;
					if (anInt396 % 20 < 10) {
						arg0.aString18 = arg0.aString18 + "|";
					} else {
						arg0.aString18 = arg0.aString18 + " ";
					}
				} else {
					if (local11 == 613) {
						if (this.anInt374 < 1) {
							arg0.aString18 = "";
						} else if (this.aBoolean72) {
							arg0.anInt430 = 16711680;
							arg0.aString18 = "Moderator option: Mute player for 48 hours: <ON>";
						} else {
							arg0.anInt430 = 16777215;
							arg0.aString18 = "Moderator option: Mute player for 48 hours: <OFF>";
						}
					}
					@Pc(596) String local596;
					if (local11 == 650 || local11 == 655) {
						if (this.anInt391 == 0) {
							arg0.aString18 = "";
						} else {
							if (this.anInt258 == 0) {
								local596 = "earlier today";
							} else if (this.anInt258 == 1) {
								local596 = "yesterday";
							} else {
								local596 = this.anInt258 + " days ago";
							}
							arg0.aString18 = "You last logged in " + local596 + " from: " + signlink.dns;
						}
					}
					if (local11 == 651) {
						if (this.anInt301 == 0) {
							arg0.aString18 = "0 unread messages";
							arg0.anInt430 = 16776960;
						}
						if (this.anInt301 == 1) {
							arg0.aString18 = "1 unread message";
							arg0.anInt430 = 65280;
						}
						if (this.anInt301 > 1) {
							arg0.aString18 = this.anInt301 + " unread messages";
							arg0.anInt430 = 65280;
						}
					}
					if (local11 == 652) {
						if (this.anInt219 == 201) {
							if (this.anInt243 == 1) {
								arg0.aString18 = "@yel@This is a non-members world: @whi@Since you are a member we";
							} else {
								arg0.aString18 = "";
							}
						} else if (this.anInt219 == 200) {
							arg0.aString18 = "You have not yet set any password recovery questions.";
						} else {
							if (this.anInt219 == 0) {
								local596 = "Earlier today";
							} else if (this.anInt219 == 1) {
								local596 = "Yesterday";
							} else {
								local596 = this.anInt219 + " days ago";
							}
							arg0.aString18 = local596 + " you changed your recovery questions";
						}
					}
					if (local11 == 653) {
						if (this.anInt219 == 201) {
							if (this.anInt243 == 1) {
								arg0.aString18 = "@whi@recommend you use a members world instead. You may use";
							} else {
								arg0.aString18 = "";
							}
						} else if (this.anInt219 == 200) {
							arg0.aString18 = "We strongly recommend you do so now to secure your account.";
						} else {
							arg0.aString18 = "If you do not remember making this change then cancel it immediately";
						}
					}
					if (local11 == 654) {
						if (this.anInt219 == 201) {
							if (this.anInt243 == 1) {
								arg0.aString18 = "@whi@this world but member benefits are unavailable whilst here.";
							} else {
								arg0.aString18 = "";
							}
						} else if (this.anInt219 == 200) {
							arg0.aString18 = "Do this from the 'account management' area on our front webpage";
						} else {
							arg0.aString18 = "Do this from the 'account management' area on our front webpage";
						}
					}
				}
			} else if (local11 == 1 && this.anInt339 == 0) {
				arg0.aString18 = "Loading friend list";
				arg0.anInt418 = 0;
			} else if (local11 == 1 && this.anInt339 == 1) {
				arg0.aString18 = "Connecting to friendserver";
				arg0.anInt418 = 0;
			} else if (local11 == 2 && this.anInt339 != 2) {
				arg0.aString18 = "Please wait...";
				arg0.anInt418 = 0;
			} else {
				local67 = this.anInt338;
				if (this.anInt339 != 2) {
					local67 = 0;
				}
				if (local11 > 700) {
					local11 -= 601;
				} else {
					local11--;
				}
				if (local11 >= local67) {
					arg0.aString18 = "";
					arg0.anInt418 = 0;
				} else {
					arg0.aString18 = this.aStringArray5[local11];
					arg0.anInt418 = 1;
				}
			}
		} catch (@Pc(804) RuntimeException local804) {
			signlink.reporterror("89305, " + -338 + ", " + arg0 + ", " + local804.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(BILclient!lb;)V")
	private void method124(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub1_Sub3 arg1) {
		try {
			while (true) {
				if (arg1.anInt735 + 21 < arg0 * 8) {
					@Pc(12) int local12 = arg1.method487(14);
					if (local12 != 16383) {
						if (this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local12] == null) {
							this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local12] = new Class1_Sub1_Sub1_Sub1_Sub2();
						}
						@Pc(32) Class1_Sub1_Sub1_Sub1_Sub2 local32 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local12];
						this.anIntArray57[this.anInt294++] = local12;
						local32.anInt1020 = anInt396;
						local32.aClass13_2 = Class13.method321(arg1.method487(11));
						local32.anInt983 = local32.aClass13_2.aByte25;
						local32.anInt1023 = local32.aClass13_2.anInt563;
						local32.anInt986 = local32.aClass13_2.anInt550;
						local32.anInt987 = local32.aClass13_2.anInt551;
						local32.anInt988 = local32.aClass13_2.anInt552;
						local32.anInt989 = local32.aClass13_2.anInt553;
						local32.anInt984 = local32.aClass13_2.anInt549;
						@Pc(93) int local93 = arg1.method487(5);
						if (local93 > 15) {
							local93 -= 32;
						}
						@Pc(102) int local102 = arg1.method487(5);
						if (local102 > 15) {
							local102 -= 32;
						}
						@Pc(111) int local111 = arg1.method487(1);
						local32.method673(aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray271[0] + local93, local111 == 1, aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray272[0] + local102, this.aByte4);
						@Pc(138) int local138 = arg1.method487(1);
						if (local138 == 1) {
							this.anIntArray91[this.anInt390++] = local12;
						}
						continue;
					}
				}
				arg1.method488();
				return;
			}
		} catch (@Pc(162) RuntimeException local162) {
			signlink.reporterror("11026, " + -97 + ", " + arg0 + ", " + arg1 + ", " + local162.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ZILjava/lang/String;)V")
	@Override
	protected void method95(@OriginalArg(1) int arg0, @OriginalArg(2) String arg1) {
		try {
			this.anInt367 = arg0;
			this.aString5 = arg1;
			this.method169(831);
			if (this.aClass47_1 == null) {
				super.method95(arg0, arg1);
			} else {
				this.aClass35_21.method520();
				this.aClass1_Sub1_Sub2_Sub4_3.method443(180, "RuneScape is loading - please wait...", 16777215, 54);
				Class1_Sub1_Sub2.method437(28, 304, 9179409, 62, 34);
				Class1_Sub1_Sub2.method437(29, 302, 0, 63, 32);
				Class1_Sub1_Sub2.method436(9179409, 210, 64, 30, 30, arg0 * 3);
				Class1_Sub1_Sub2.method436(0, 210, 64, 30, arg0 * 3 + 30, 300 - arg0 * 3);
				this.aClass1_Sub1_Sub2_Sub4_3.method443(180, arg1, 16777215, 85);
				this.aClass35_21.method521(202, 171, super.aGraphics2);
				if (this.aBoolean63) {
					this.aBoolean63 = false;
					if (!this.aBoolean84) {
						this.aClass35_22.method521(0, 0, super.aGraphics2);
						this.aClass35_23.method521(637, 0, super.aGraphics2);
					}
					this.aClass35_19.method521(128, 0, super.aGraphics2);
					this.aClass35_20.method521(202, 371, super.aGraphics2);
					this.aClass35_24.method521(0, 265, super.aGraphics2);
					this.aClass35_25.method521(562, 265, super.aGraphics2);
					this.aClass35_26.method521(128, 171, super.aGraphics2);
					this.aClass35_27.method521(562, 171, super.aGraphics2);
				}
			}
		} catch (@Pc(218) RuntimeException local218) {
			signlink.reporterror("10134, " + false + ", " + arg0 + ", " + arg1 + ", " + local218.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "n", descriptor = "(I)V")
	private void method125() {
		try {
			this.anInt375++;
			this.method192(true);
			this.method132(true);
			this.method192(false);
			this.method132(false);
			this.method151(this.aByte10);
			this.method196();
			@Pc(36) int local36;
			@Pc(75) int local75;
			if (!this.aBoolean55) {
				local36 = this.anInt248;
				if (this.anInt395 / 256 > local36) {
					local36 = this.anInt395 / 256;
				}
				if (this.aBooleanArray4[4] && this.anIntArray84[4] + 128 > local36) {
					local36 = this.anIntArray84[4] + 128;
				}
				local75 = this.anInt249 + this.anInt340 & 0x7FF;
				this.method220(local36 * 3 + 600, local75, this.method133(aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt981, aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt980, this.anInt356) - 50, this.anInt325, this.anInt324, local36);
			}
			if (this.aBoolean55) {
				local36 = this.method209((byte) 7);
			} else {
				local36 = this.method208();
			}
			local75 = this.anInt223;
			@Pc(119) int local119 = this.anInt224;
			@Pc(122) int local122 = this.anInt225;
			@Pc(125) int local125 = this.anInt226;
			@Pc(128) int local128 = this.anInt227;
			@Pc(177) int local177;
			for (@Pc(130) int local130 = 0; local130 < 5; local130++) {
				if (this.aBooleanArray4[local130]) {
					local177 = (int) (Math.random() * (double) (this.anIntArray52[local130] * 2 + 1) - (double) this.anIntArray52[local130] + Math.sin((double) this.anIntArray54[local130] * ((double) this.anIntArray50[local130] / 100.0D)) * (double) this.anIntArray84[local130]);
					if (local130 == 0) {
						this.anInt223 += local177;
					}
					if (local130 == 1) {
						this.anInt224 += local177;
					}
					if (local130 == 2) {
						this.anInt225 += local177;
					}
					if (local130 == 3) {
						this.anInt227 = this.anInt227 + local177 & 0x7FF;
					}
					if (local130 == 4) {
						this.anInt226 += local177;
						if (this.anInt226 < 128) {
							this.anInt226 = 128;
						}
						if (this.anInt226 > 383) {
							this.anInt226 = 383;
						}
					}
				}
			}
			local177 = Class1_Sub1_Sub2_Sub1.anInt589;
			Class1_Sub1_Sub1_Sub5.aBoolean121 = true;
			Class1_Sub1_Sub1_Sub5.anInt494 = 0;
			Class1_Sub1_Sub1_Sub5.anInt492 = super.anInt186 - 4;
			Class1_Sub1_Sub1_Sub5.anInt493 = super.anInt187 - 4;
			Class1_Sub1_Sub2.method434();
			this.aClass37_1.method565(this.anInt223, this.anInt226, this.anInt225, local36, this.anInt224, this.anInt227);
			this.aClass37_1.method540();
			this.method143();
			this.method218(this.anInt300);
			this.method144(local177);
			this.method98();
			this.aClass35_17.method521(4, 4, super.aGraphics2);
			this.anInt223 = local75;
			this.anInt224 = local119;
			this.anInt225 = local122;
			this.anInt226 = local125;
			this.anInt227 = local128;
		} catch (@Pc(320) RuntimeException local320) {
			signlink.reporterror("19860, " + 0 + ", " + local320.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(JI)V")
	private void method126(@OriginalArg(0) long arg0) {
		try {
			if (arg0 != 0L) {
				for (@Pc(14) int local14 = 0; local14 < this.anInt338; local14++) {
					if (this.aLongArray3[local14] == arg0) {
						this.anInt338--;
						this.aBoolean61 = true;
						for (@Pc(34) int local34 = local14; local34 < this.anInt338; local34++) {
							this.aStringArray5[local34] = this.aStringArray5[local34 + 1];
							this.anIntArray43[local34] = this.anIntArray43[local34 + 1];
							this.aLongArray3[local34] = this.aLongArray3[local34 + 1];
						}
						this.aClass1_Sub1_Sub3_3.method465(203);
						this.aClass1_Sub1_Sub3_3.method472(arg0);
						return;
					}
				}
			}
		} catch (@Pc(89) RuntimeException local89) {
			signlink.reporterror("67342, " + arg0 + ", " + 37517 + ", " + local89.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "o", descriptor = "(I)V")
	private void method127() {
		try {
			if (this.anInt299 != 0) {
				@Pc(15) int local15 = 0;
				if (this.anInt290 != 0) {
					local15 = 1;
				}
				for (@Pc(22) int local22 = 0; local22 < 100; local22++) {
					if (this.aStringArray4[local22] != null) {
						@Pc(34) int local34 = this.anIntArray55[local22];
						@Pc(39) String local39 = this.aStringArray3[local22];
						if (local39 != null && local39.startsWith("@cr1@")) {
							local39 = local39.substring(5);
						}
						if (local39 != null && local39.startsWith("@cr2@")) {
							local39 = local39.substring(5);
						}
						if ((local34 == 3 || local34 == 7) && (local34 == 7 || this.anInt234 == 0 || this.anInt234 == 1 && this.method162(local39))) {
							@Pc(92) int local92 = 329 - local15 * 13;
							if (super.anInt186 > 4 && super.anInt187 - 4 > local92 - 10 && super.anInt187 - 4 <= local92 + 3) {
								@Pc(131) int local131 = this.aClass1_Sub1_Sub2_Sub4_2.method445("From:  " + local39 + this.aStringArray4[local22]) + 25;
								if (local131 > 450) {
									local131 = 450;
								}
								if (super.anInt186 < local131 + 4) {
									if (this.anInt374 >= 1) {
										this.aStringArray1[this.anInt275] = "Report abuse @whi@" + local39;
										this.anIntArray36[this.anInt275] = 2524;
										this.anInt275++;
									}
									this.aStringArray1[this.anInt275] = "Add ignore @whi@" + local39;
									this.anIntArray36[this.anInt275] = 2047;
									this.anInt275++;
									this.aStringArray1[this.anInt275] = "Add friend @whi@" + local39;
									this.anIntArray36[this.anInt275] = 2605;
									this.anInt275++;
								}
							}
							local15++;
							if (local15 >= 5) {
								return;
							}
						}
						if ((local34 == 5 || local34 == 6) && this.anInt234 < 2) {
							local15++;
							if (local15 >= 5) {
								return;
							}
						}
					}
				}
			}
		} catch (@Pc(244) RuntimeException local244) {
			signlink.reporterror("41007, " + -113 + ", " + local244.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
	@Override
	public String getParameter(@OriginalArg(0) String arg0) {
		return signlink.mainapp == null ? super.getParameter(arg0) : signlink.mainapp.getParameter(arg0);
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IBLclient!lb;ILclient!ab;)V")
	private void method128(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub1_Sub3 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class1_Sub1_Sub1_Sub1_Sub1 arg3) {
		try {
			@Pc(19) int local19;
			if ((arg0 & 0x1) == 1) {
				local19 = arg1.method476();
				@Pc(22) byte[] local22 = new byte[local19];
				@Pc(28) Class1_Sub1_Sub3 local28 = new Class1_Sub1_Sub3(local22, 15787);
				arg1.method485(local22, local19);
				this.aClass1_Sub1_Sub3Array1[arg2] = local28;
				arg3.method39(local28);
			}
			@Pc(66) int local66;
			@Pc(78) int local78;
			if ((arg0 & 0x2) == 2) {
				local19 = arg1.method478();
				if (local19 == 65535) {
					local19 = -1;
				}
				if (local19 == arg3.anInt1003) {
					arg3.anInt1007 = 0;
				}
				local66 = arg1.method476();
				if (local19 == arg3.anInt1003 && local19 != -1) {
					local78 = Class27.aClass27Array1[local19].anInt791;
					if (local78 == 1) {
						arg3.anInt1004 = 0;
						arg3.anInt1005 = 0;
						arg3.anInt1006 = local66;
						arg3.anInt1007 = 0;
					}
					if (local78 == 2) {
						arg3.anInt1007 = 0;
					}
				} else if (local19 == -1 || arg3.anInt1003 == -1 || Class27.aClass27Array1[local19].anInt785 >= Class27.aClass27Array1[arg3.anInt1003].anInt785) {
					arg3.anInt1003 = local19;
					arg3.anInt1004 = 0;
					arg3.anInt1005 = 0;
					arg3.anInt1006 = local66;
					arg3.anInt1007 = 0;
					arg3.anInt1026 = arg3.anInt1024;
				}
			}
			if ((arg0 & 0x4) == 4) {
				arg3.anInt997 = arg1.method478();
				if (arg3.anInt997 == 65535) {
					arg3.anInt997 = -1;
				}
			}
			if ((arg0 & 0x8) == 8) {
				arg3.aString31 = arg1.method483();
				if (arg3.aString31.charAt(0) == '~') {
					arg3.aString31 = arg3.aString31.substring(1);
					this.method99(2, arg3.aString31, arg3.aString3);
				} else if (arg3 == aClass1_Sub1_Sub1_Sub1_Sub1_1) {
					this.method99(2, arg3.aString31, arg3.aString3);
				}
				arg3.anInt992 = 0;
				arg3.anInt993 = 0;
				arg3.anInt991 = 150;
			}
			if ((arg0 & 0x10) == 16) {
				local19 = arg1.method476();
				local66 = arg1.method476();
				arg3.method677(local66, anInt396, local19);
				arg3.anInt994 = anInt396 + 300;
				arg3.anInt995 = arg1.method476();
				arg3.anInt996 = arg1.method476();
			}
			if ((arg0 & 0x20) == 32) {
				arg3.anInt998 = arg1.method478();
				arg3.anInt999 = arg1.method478();
			}
			if ((arg0 & 0x40) == 64) {
				local19 = arg1.method478();
				local66 = arg1.method476();
				local78 = arg1.method476();
				@Pc(264) int local264 = arg1.anInt734;
				if (arg3.aString3 != null && arg3.aBoolean29) {
					@Pc(274) long local274 = Class48.method663(arg3.aString3);
					@Pc(276) boolean local276 = false;
					if (local66 <= 1) {
						for (@Pc(281) int local281 = 0; local281 < this.anInt264; local281++) {
							if (this.aLongArray4[local281] == local274) {
								local276 = true;
								break;
							}
						}
					}
					if (!local276 && this.anInt400 == 0) {
						try {
							@Pc(309) String local309 = Class49.method679(arg1, local78);
							@Pc(314) String local314 = Class42.method600(local309, this.anInt397);
							arg3.aString31 = local314;
							arg3.anInt992 = local19 >> 8;
							arg3.anInt993 = local19 & 0xFF;
							arg3.anInt991 = 150;
							if (local66 == 2 || local66 == 3) {
								this.method99(1, local314, "@cr2@" + arg3.aString3);
							} else if (local66 == 1) {
								this.method99(1, local314, "@cr1@" + arg3.aString3);
							} else {
								this.method99(2, local314, arg3.aString3);
							}
						} catch (@Pc(378) Exception local378) {
							signlink.reporterror("cde2");
						}
					}
				}
				arg1.anInt734 = local264 + local78;
			}
			if ((arg0 & 0x100) == 256) {
				arg3.anInt1008 = arg1.method478();
				local19 = arg1.method481();
				arg3.anInt1012 = local19 >> 16;
				arg3.anInt1011 = anInt396 + (local19 & 0xFFFF);
				arg3.anInt1009 = 0;
				arg3.anInt1010 = 0;
				if (arg3.anInt1011 > anInt396) {
					arg3.anInt1009 = -1;
				}
				if (arg3.anInt1008 == 65535) {
					arg3.anInt1008 = -1;
				}
			}
			if ((arg0 & 0x200) == 512) {
				arg3.anInt1013 = arg1.method476();
				arg3.anInt1015 = arg1.method476();
				arg3.anInt1014 = arg1.method476();
				arg3.anInt1016 = arg1.method476();
				arg3.anInt1017 = arg1.method478() + anInt396;
				arg3.anInt1018 = arg1.method478() + anInt396;
				arg3.anInt1019 = arg1.method476();
				arg3.method675();
			}
			if ((arg0 & 0x400) == 1024) {
				local19 = arg1.method476();
				local66 = arg1.method476();
				arg3.method677(local66, anInt396, local19);
				arg3.anInt994 = anInt396 + 300;
				arg3.anInt995 = arg1.method476();
				arg3.anInt996 = arg1.method476();
			}
		} catch (@Pc(502) RuntimeException local502) {
			signlink.reporterror("71941, " + arg0 + ", " + -106 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local502.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "p", descriptor = "(I)V")
	private void method129() {
		try {
			this.aClass35_18.method520();
			Class1_Sub1_Sub2_Sub1.anIntArray179 = this.anIntArray45;
			this.aClass1_Sub1_Sub2_Sub3_20.method415(0, this.aByte14, 0);
			if (this.aBoolean88) {
				this.aClass1_Sub1_Sub2_Sub4_3.method443(239, this.aString14, 0, 40);
				this.aClass1_Sub1_Sub2_Sub4_3.method443(239, this.aString10 + "*", 128, 60);
			} else if (this.aBoolean70) {
				this.aClass1_Sub1_Sub2_Sub4_3.method443(239, "Enter amount:", 0, 40);
				this.aClass1_Sub1_Sub2_Sub4_3.method443(239, this.aString13 + "*", 128, 60);
			} else if (this.aString4 != null) {
				this.aClass1_Sub1_Sub2_Sub4_3.method443(239, this.aString4, 0, 40);
				this.aClass1_Sub1_Sub2_Sub4_3.method443(239, "Click to continue", 128, 60);
			} else if (this.anInt408 != -1) {
				this.method119(0, 0, Class6.aClass6Array1[this.anInt408], 0);
			} else if (this.anInt271 == -1) {
				@Pc(136) Class1_Sub1_Sub2_Sub4 local136 = this.aClass1_Sub1_Sub2_Sub4_2;
				@Pc(138) int local138 = 0;
				Class1_Sub1_Sub2.method433(this.aByte6, 77, 463, 0, 0);
				for (@Pc(147) int local147 = 0; local147 < 100; local147++) {
					if (this.aStringArray4[local147] != null) {
						@Pc(159) int local159 = this.anIntArray55[local147];
						@Pc(168) int local168 = this.anInt337 + 70 - local138 * 14;
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
								local136.method447(0, this.aStringArray4[local147], 4, local168);
							}
							local138++;
						}
						@Pc(245) int local245;
						if ((local159 == 1 || local159 == 2) && (local159 == 1 || this.anInt212 == 0 || this.anInt212 == 1 && this.method162(local173))) {
							if (local168 > 0 && local168 < 110) {
								local245 = 4;
								if (local175 == 1) {
									this.aClass1_Sub1_Sub2_Sub3Array1[0].method415(local168 - 12, this.aByte14, 4);
									local245 += 14;
								}
								if (local175 == 2) {
									this.aClass1_Sub1_Sub2_Sub3Array1[1].method415(local168 - 12, this.aByte14, local245);
									local245 += 14;
								}
								local136.method447(0, local173 + ":", local245, local168);
								local245 += local136.method445(local173) + 8;
								local136.method447(255, this.aStringArray4[local147], local245, local168);
							}
							local138++;
						}
						if ((local159 == 3 || local159 == 7) && this.anInt299 == 0 && (local159 == 7 || this.anInt234 == 0 || this.anInt234 == 1 && this.method162(local173))) {
							if (local168 > 0 && local168 < 110) {
								local136.method447(0, "From", 4, local168);
								local245 = local136.method445("From ") + 4;
								if (local175 == 1) {
									this.aClass1_Sub1_Sub2_Sub3Array1[0].method415(local168 - 12, this.aByte14, local245);
									local245 += 14;
								}
								if (local175 == 2) {
									this.aClass1_Sub1_Sub2_Sub3Array1[1].method415(local168 - 12, this.aByte14, local245);
									local245 += 14;
								}
								local136.method447(0, local173 + ":", local245, local168);
								local245 += local136.method445(local173) + 8;
								local136.method447(8388608, this.aStringArray4[local147], local245, local168);
							}
							local138++;
						}
						if (local159 == 4 && (this.anInt360 == 0 || this.anInt360 == 1 && this.method162(local173))) {
							if (local168 > 0 && local168 < 110) {
								local136.method447(8388736, local173 + " " + this.aStringArray4[local147], 4, local168);
							}
							local138++;
						}
						if (local159 == 5 && this.anInt299 == 0 && this.anInt234 < 2) {
							if (local168 > 0 && local168 < 110) {
								local136.method447(8388608, this.aStringArray4[local147], 4, local168);
							}
							local138++;
						}
						if (local159 == 6 && this.anInt299 == 0 && this.anInt234 < 2) {
							if (local168 > 0 && local168 < 110) {
								local136.method447(0, "To " + local173 + ":", 4, local168);
								local136.method447(8388608, this.aStringArray4[local147], local136.method445("To " + local173) + 12, local168);
							}
							local138++;
						}
						if (local159 == 8 && (this.anInt360 == 0 || this.anInt360 == 1 && this.method162(local173))) {
							if (local168 > 0 && local168 < 110) {
								local136.method447(8270336, local173 + " " + this.aStringArray4[local147], 4, local168);
							}
							local138++;
						}
					}
				}
				Class1_Sub1_Sub2.method432();
				this.anInt222 = local138 * 14 + 7;
				if (this.anInt222 < 78) {
					this.anInt222 = 78;
				}
				this.method103(0, 463, this.anInt222 - this.anInt337 - 77, this.anInt222, 77);
				@Pc(619) String local619;
				if (aClass1_Sub1_Sub1_Sub1_Sub1_1 == null || aClass1_Sub1_Sub1_Sub1_Sub1_1.aString3 == null) {
					local619 = Class48.method667(this.aString11);
				} else {
					local619 = aClass1_Sub1_Sub1_Sub1_Sub1_1.aString3;
				}
				local136.method447(0, local619 + ":", 4, 90);
				local136.method447(255, this.aString17 + "*", local136.method445(local619 + ": ") + 6, 90);
				Class1_Sub1_Sub2.method439(479, 0, 0, 77);
			} else {
				this.method119(0, 0, Class6.aClass6Array1[this.anInt271], 0);
			}
			if (this.aBoolean68 && this.anInt305 == 2) {
				this.method197();
			}
			this.aClass35_18.method521(17, 357, super.aGraphics2);
			this.aClass35_17.method520();
			Class1_Sub1_Sub2_Sub1.anIntArray179 = this.anIntArray47;
		} catch (@Pc(700) RuntimeException local700) {
			signlink.reporterror("21760, " + 311 + ", " + local700.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "q", descriptor = "(I)V")
	private void method130() {
		try {
			this.aClass1_Sub1_Sub2_Sub3_6 = new Class1_Sub1_Sub2_Sub3(this.aClass47_1, "titlebox", 0);
			this.aClass1_Sub1_Sub2_Sub3_7 = new Class1_Sub1_Sub2_Sub3(this.aClass47_1, "titlebutton", 0);
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
			this.aClass1_Sub1_Sub2_Sub2_12 = new Class1_Sub1_Sub2_Sub2(128, 265);
			this.aClass1_Sub1_Sub2_Sub2_13 = new Class1_Sub1_Sub2_Sub2(128, 265);
			for (local36 = 0; local36 < 33920; local36++) {
				this.aClass1_Sub1_Sub2_Sub2_12.anIntArray207[local36] = this.aClass35_22.anIntArray230[local36];
			}
			for (@Pc(115) int local115 = 0; local115 < 33920; local115++) {
				this.aClass1_Sub1_Sub2_Sub2_13.anIntArray207[local115] = this.aClass35_23.anIntArray230[local115];
			}
			this.anIntArray87 = new int[256];
			for (@Pc(137) int local137 = 0; local137 < 64; local137++) {
				this.anIntArray87[local137] = local137 * 262144;
			}
			for (@Pc(152) int local152 = 0; local152 < 64; local152++) {
				this.anIntArray87[local152 + 64] = local152 * 1024 + 16711680;
			}
			for (@Pc(171) int local171 = 0; local171 < 64; local171++) {
				this.anIntArray87[local171 + 128] = local171 * 4 + 16776960;
			}
			for (@Pc(190) int local190 = 0; local190 < 64; local190++) {
				this.anIntArray87[local190 + 192] = 16777215;
			}
			this.anIntArray88 = new int[256];
			for (@Pc(209) int local209 = 0; local209 < 64; local209++) {
				this.anIntArray88[local209] = local209 * 1024;
			}
			for (@Pc(224) int local224 = 0; local224 < 64; local224++) {
				this.anIntArray88[local224 + 64] = local224 * 4 + 65280;
			}
			for (@Pc(243) int local243 = 0; local243 < 64; local243++) {
				this.anIntArray88[local243 + 128] = local243 * 262144 + 65535;
			}
			for (@Pc(262) int local262 = 0; local262 < 64; local262++) {
				this.anIntArray88[local262 + 192] = 16777215;
			}
			this.anIntArray89 = new int[256];
			for (@Pc(281) int local281 = 0; local281 < 64; local281++) {
				this.anIntArray89[local281] = local281 * 4;
			}
			for (@Pc(296) int local296 = 0; local296 < 64; local296++) {
				this.anIntArray89[local296 + 64] = local296 * 262144 + 255;
			}
			for (@Pc(315) int local315 = 0; local315 < 64; local315++) {
				this.anIntArray89[local315 + 128] = local315 * 1024 + 16711935;
			}
			for (@Pc(334) int local334 = 0; local334 < 64; local334++) {
				this.anIntArray89[local334 + 192] = 16777215;
			}
			this.anIntArray86 = new int[256];
			this.anIntArray72 = new int[32768];
			this.anIntArray73 = new int[32768];
			this.method191(null);
			this.anIntArray92 = new int[32768];
			this.anIntArray93 = new int[32768];
			this.method95(10, "Connecting to fileserver");
			if (!this.aBoolean84) {
				this.aBoolean58 = true;
				this.aBoolean84 = true;
				this.method94(this, 2);
			}
		} catch (@Pc(391) RuntimeException local391) {
			signlink.reporterror("92179, " + -532 + ", " + local391.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "i", descriptor = "(B)V")
	private void method131() {
		try {
			if (this.aByte11 != 6) {
				this.aBoolean85 = !this.aBoolean85;
			}
			try {
				@Pc(19) int local19 = aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt980 + this.anInt295;
				@Pc(25) int local25 = aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt981 + this.anInt384;
				if (this.anInt324 - local19 < -500 || this.anInt324 - local19 > 500 || this.anInt325 - local25 < -500 || this.anInt325 - local25 > 500) {
					this.anInt324 = local19;
					this.anInt325 = local25;
				}
				if (this.anInt324 != local19) {
					this.anInt324 += (local19 - this.anInt324) / 16;
				}
				if (this.anInt325 != local25) {
					this.anInt325 += (local25 - this.anInt325) / 16;
				}
				if (super.anIntArray30[1] == 1) {
					this.anInt250 += (-this.anInt250 - 24) / 2;
				} else if (super.anIntArray30[2] == 1) {
					this.anInt250 += (24 - this.anInt250) / 2;
				} else {
					this.anInt250 /= 2;
				}
				if (super.anIntArray30[3] == 1) {
					this.anInt251 += (12 - this.anInt251) / 2;
				} else if (super.anIntArray30[4] == 1) {
					this.anInt251 += (-this.anInt251 - 12) / 2;
				} else {
					this.anInt251 /= 2;
				}
				this.anInt249 = this.anInt249 + this.anInt250 / 2 & 0x7FF;
				this.anInt248 += this.anInt251 / 2;
				if (this.anInt248 < 128) {
					this.anInt248 = 128;
				}
				if (this.anInt248 > 383) {
					this.anInt248 = 383;
				}
				@Pc(212) int local212 = this.anInt324 >> 7;
				@Pc(217) int local217 = this.anInt325 >> 7;
				@Pc(227) int local227 = this.method133(this.anInt325, this.anInt324, this.anInt356);
				@Pc(229) int local229 = 0;
				@Pc(245) int local245;
				if (local212 > 3 && local217 > 3 && local212 < 100 && local217 < 100) {
					for (local245 = local212 - 4; local245 <= local212 + 4; local245++) {
						for (@Pc(251) int local251 = local217 - 4; local251 <= local217 + 4; local251++) {
							@Pc(256) int local256 = this.anInt356;
							if (local256 < 3 && (this.aByteArrayArrayArray7[1][local245][local251] & 0x2) == 2) {
								local256++;
							}
							@Pc(283) int local283 = local227 - this.anIntArrayArrayArray5[local256][local245][local251];
							if (local283 > local229) {
								local229 = local283;
							}
						}
					}
				}
				local245 = local229 * 192;
				if (local245 > 98048) {
					local245 = 98048;
				}
				if (local245 < 32768) {
					local245 = 32768;
				}
				if (local245 > this.anInt395) {
					this.anInt395 += (local245 - this.anInt395) / 24;
				} else if (local245 < this.anInt395) {
					this.anInt395 += (local245 - this.anInt395) / 80;
				}
			} catch (@Pc(347) Exception local347) {
				signlink.reporterror("glfc_ex " + aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt980 + "," + aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt981 + "," + this.anInt324 + "," + this.anInt325 + "," + this.anInt210 + "," + this.anInt211 + "," + this.anInt370 + "," + this.anInt371);
				throw new RuntimeException("eek");
			}
		} catch (@Pc(397) RuntimeException local397) {
			signlink.reporterror("96812, " + 6 + ", " + local397.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ZZ)V")
	private void method132(@OriginalArg(1) boolean arg0) {
		try {
			for (@Pc(1) int local1 = 0; local1 < this.anInt294; local1++) {
				@Pc(11) Class1_Sub1_Sub1_Sub1_Sub2 local11 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[this.anIntArray57[local1]];
				@Pc(20) int local20 = (this.anIntArray57[local1] << 14) + 536870912;
				if (local11 != null && local11.method676() && local11.aClass13_2.aBoolean146 == arg0) {
					@Pc(36) int local36 = local11.anInt980 >> 7;
					@Pc(41) int local41 = local11.anInt981 >> 7;
					if (local36 >= 0 && local36 < 104 && local41 >= 0 && local41 < 104) {
						if (local11.anInt983 == 1 && (local11.anInt980 & 0x7F) == 64 && (local11.anInt981 & 0x7F) == 64) {
							if (this.anIntArrayArray3[local36][local41] == this.anInt375) {
								continue;
							}
							this.anIntArrayArray3[local36][local41] = this.anInt375;
						}
						this.aClass37_1.method537((local11.anInt983 - 1) * 64 + 60, local20, this.method133(local11.anInt981, local11.anInt980, this.anInt356), local11.anInt980, 384, local11, local11.anInt982, local11.aBoolean259, local11.anInt981, this.anInt356);
					}
				}
			}
		} catch (@Pc(127) RuntimeException local127) {
			signlink.reporterror("10709, " + false + ", " + arg0 + ", " + local127.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ZIII)I")
	private int method133(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
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
			@Pc(73) int local73 = this.anIntArrayArrayArray5[local21][local3][local7] * (128 - local41) + this.anIntArrayArrayArray5[local21][local3 + 1][local7] * local41 >> 7;
			@Pc(109) int local109 = this.anIntArrayArrayArray5[local21][local3][local7 + 1] * (128 - local41) + this.anIntArrayArrayArray5[local21][local3 + 1][local7 + 1] * local41 >> 7;
			return local73 * (128 - local45) + local109 * local45 >> 7;
		} catch (@Pc(122) RuntimeException local122) {
			signlink.reporterror("38676, " + false + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local122.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "r", descriptor = "(I)V")
	private void method134() {
		try {
			if (this.anInt275 >= 2 || this.anInt260 != 0 || this.anInt287 != 0) {
				@Pc(40) String local40;
				if (this.anInt260 == 1 && this.anInt275 < 2) {
					local40 = "Use " + this.aString7 + " with...";
				} else if (this.anInt287 == 1 && this.anInt275 < 2) {
					local40 = this.aString9 + "...";
				} else {
					local40 = this.aStringArray1[this.anInt275 - 1];
				}
				if (this.anInt275 > 2) {
					local40 = local40 + "@whi@ / " + (this.anInt275 - 2) + " more options";
				}
				this.aClass1_Sub1_Sub2_Sub4_3.method452(local40, 16777215, 4, anInt396 / 1000, 15);
			}
		} catch (@Pc(104) RuntimeException local104) {
			signlink.reporterror("20355, " + 521 + ", " + local104.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "s", descriptor = "(I)V")
	private void method135() {
		try {
			@Pc(17) Graphics local17 = this.method93().getGraphics();
			local17.setColor(Color.black);
			local17.fillRect(0, 0, 765, 503);
			this.method86();
			@Pc(49) byte local49;
			@Pc(55) int local55;
			if (this.aBoolean76) {
				this.aBoolean84 = false;
				local17.setFont(new Font("Helvetica", 1, 16));
				local17.setColor(Color.yellow);
				local49 = 35;
				local17.drawString("Sorry, an error has occured whilst loading RuneScape", 30, 35);
				local55 = local49 + 50;
				local17.setColor(Color.white);
				local17.drawString("To fix this try the following (in order):", 30, 85);
				@Pc(64) int local64 = local55 + 50;
				local17.setColor(Color.white);
				local17.setFont(new Font("Helvetica", 1, 12));
				local17.drawString("1: Try closing ALL open web-browser windows, and reloading", 30, 135);
				@Pc(81) int local81 = local64 + 30;
				local17.drawString("2: Try clearing your web-browsers cache from tools->internet options", 30, 165);
				@Pc(87) int local87 = local81 + 30;
				local17.drawString("3: Try using a different game-world", 30, 195);
				@Pc(93) int local93 = local87 + 30;
				local17.drawString("4: Try rebooting your computer", 30, 225);
				@Pc(99) int local99 = local93 + 30;
				local17.drawString("5: Try selecting a different version of Java from the play-game menu", 30, 255);
			}
			if (this.aBoolean54) {
				this.aBoolean84 = false;
				local17.setFont(new Font("Helvetica", 1, 20));
				local17.setColor(Color.white);
				local17.drawString("Error - unable to load game!", 50, 50);
				local17.drawString("To play RuneScape make sure you play from", 50, 100);
				local17.drawString("http://www.runescape.com", 50, 150);
			}
			if (this.aBoolean91) {
				this.aBoolean84 = false;
				local17.setColor(Color.yellow);
				local49 = 35;
				local17.drawString("Error a copy of RuneScape already appears to be loaded", 30, 35);
				local55 = local49 + 50;
				local17.setColor(Color.white);
				local17.drawString("To fix this try the following (in order):", 30, 85);
				local55 += 50;
				local17.setColor(Color.white);
				local17.setFont(new Font("Helvetica", 1, 12));
				local17.drawString("1: Try closing ALL open web-browser windows, and reloading", 30, 135);
				local55 += 30;
				local17.drawString("2: Try rebooting your computer, and reloading", 30, 165);
				local55 += 30;
			}
		} catch (@Pc(187) RuntimeException local187) {
			signlink.reporterror("39122, " + 9 + ", " + local187.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "j", descriptor = "(B)V")
	private void method136(@OriginalArg(0) byte arg0) {
		try {
			if (this.anInt333 == 0) {
				this.aStringArray1[0] = "Cancel";
				this.anIntArray36[0] = 1106;
				@Pc(20) boolean local20 = false;
				this.anInt275 = 1;
				this.method127();
				this.anInt203 = 0;
				if (super.anInt186 > 4 && super.anInt187 > 4 && super.anInt186 < 516 && super.anInt187 < 338) {
					if (this.anInt377 == -1) {
						this.method217();
					} else {
						this.method112(4, 0, super.anInt186, Class6.aClass6Array1[this.anInt377], 4, super.anInt187);
					}
				}
				if (this.anInt203 != this.anInt291) {
					this.anInt291 = this.anInt203;
				}
				this.anInt203 = 0;
				if (super.anInt186 > 553 && super.anInt187 > 205 && super.anInt186 < 743 && super.anInt187 < 466) {
					if (this.anInt232 != -1) {
						this.method112(553, 0, super.anInt186, Class6.aClass6Array1[this.anInt232], 205, super.anInt187);
					} else if (this.anIntArray69[this.anInt302] != -1) {
						this.method112(553, 0, super.anInt186, Class6.aClass6Array1[this.anIntArray69[this.anInt302]], 205, super.anInt187);
					}
				}
				if (this.anInt203 != this.anInt252) {
					this.aBoolean61 = true;
					this.anInt252 = this.anInt203;
				}
				this.anInt203 = 0;
				if (super.anInt186 > 17 && super.anInt187 > 357 && super.anInt186 < 496 && super.anInt187 < 453) {
					if (this.anInt408 != -1) {
						this.method112(17, 0, super.anInt186, Class6.aClass6Array1[this.anInt408], 357, super.anInt187);
					} else if (super.anInt187 < 434 && super.anInt186 < 426) {
						this.method193(super.anInt186 - 17, super.anInt187 - 357);
					}
				}
				if (this.anInt408 != -1 && this.anInt203 != this.anInt383) {
					this.aBoolean74 = true;
					this.anInt383 = this.anInt203;
				}
				@Pc(231) boolean local231 = false;
				while (!local231) {
					local231 = true;
					for (@Pc(237) int local237 = 0; local237 < this.anInt275 - 1; local237++) {
						if (this.anIntArray36[local237] < 1000 && this.anIntArray36[local237 + 1] > 1000) {
							@Pc(258) String local258 = this.aStringArray1[local237];
							this.aStringArray1[local237] = this.aStringArray1[local237 + 1];
							this.aStringArray1[local237 + 1] = local258;
							@Pc(280) int local280 = this.anIntArray36[local237];
							this.anIntArray36[local237] = this.anIntArray36[local237 + 1];
							this.anIntArray36[local237 + 1] = local280;
							@Pc(302) int local302 = this.anIntArray34[local237];
							this.anIntArray34[local237] = this.anIntArray34[local237 + 1];
							this.anIntArray34[local237 + 1] = local302;
							@Pc(324) int local324 = this.anIntArray35[local237];
							this.anIntArray35[local237] = this.anIntArray35[local237 + 1];
							this.anIntArray35[local237 + 1] = local324;
							@Pc(346) int local346 = this.anIntArray37[local237];
							this.anIntArray37[local237] = this.anIntArray37[local237 + 1];
							this.anIntArray37[local237 + 1] = local346;
							local231 = false;
						}
					}
				}
			}
		} catch (@Pc(376) RuntimeException local376) {
			signlink.reporterror("40244, " + arg0 + ", " + local376.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(BJ)V")
	private void method137(@OriginalArg(1) long arg0) {
		try {
			if (arg0 != 0L) {
				if (this.anInt264 >= 100) {
					this.method99(0, "Your ignore list is full. Max of 100 hit", "");
				} else {
					@Pc(23) String local23 = Class48.method667(Class48.method664(arg0));
					for (@Pc(25) int local25 = 0; local25 < this.anInt264; local25++) {
						if (this.aLongArray4[local25] == arg0) {
							this.method99(0, local23 + " is already on your ignore list", "");
							return;
						}
					}
					for (@Pc(55) int local55 = 0; local55 < this.anInt338; local55++) {
						if (this.aLongArray3[local55] == arg0) {
							this.method99(0, "Please remove " + local23 + " from your friend list first", "");
							return;
						}
					}
					this.aLongArray4[this.anInt264++] = arg0;
					this.aBoolean61 = true;
					this.aClass1_Sub1_Sub3_3.method465(192);
					this.aClass1_Sub1_Sub3_3.method472(arg0);
				}
			}
		} catch (@Pc(117) RuntimeException local117) {
			signlink.reporterror("6582, " + -37 + ", " + arg0 + ", " + local117.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "t", descriptor = "(I)V")
	private void method138(@OriginalArg(0) int arg0) {
		try {
			if (this.anInt290 > 1) {
				this.anInt290--;
			}
			if (this.anInt365 > 0) {
				this.anInt365--;
			}
			for (@Pc(22) int local22 = 0; local22 < 5 && this.method113(); local22++) {
			}
			if (this.aBoolean57) {
				@Pc(41) Object local41 = this.aClass11_1.anObject1;
				@Pc(66) int local66;
				@Pc(68) int local68;
				@Pc(70) int local70;
				@Pc(103) int local103;
				synchronized (this.aClass11_1.anObject1) {
					if (!aBoolean67) {
						this.aClass11_1.anInt529 = 0;
					} else if (super.anInt191 != 0 || this.aClass11_1.anInt529 >= 40) {
						this.aClass1_Sub1_Sub3_3.method465(229);
						this.aClass1_Sub1_Sub3_3.method466(0);
						local66 = this.aClass1_Sub1_Sub3_3.anInt734;
						local68 = 0;
						@Pc(86) int local86;
						for (local70 = 0; local70 < this.aClass11_1.anInt529 && local66 - this.aClass1_Sub1_Sub3_3.anInt734 < 240; local70++) {
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
							if (local103 != this.anInt230 || local86 != this.anInt231) {
								@Pc(165) int local165 = local103 - this.anInt230;
								this.anInt230 = local103;
								@Pc(173) int local173 = local86 - this.anInt231;
								this.anInt231 = local86;
								if (this.anInt200 < 8 && local165 >= -32 && local165 <= 31 && local173 >= -32 && local173 <= 31) {
									local165 += 32;
									local173 += 32;
									this.aClass1_Sub1_Sub3_3.method467((this.anInt200 << 12) + (local165 << 6) + local173);
									this.anInt200 = 0;
								} else if (this.anInt200 < 8) {
									this.aClass1_Sub1_Sub3_3.method469((this.anInt200 << 19) + local120 + 8388608);
									this.anInt200 = 0;
								} else {
									this.aClass1_Sub1_Sub3_3.method470((this.anInt200 << 19) + local120 - 1073741824);
									this.anInt200 = 0;
								}
							} else if (this.anInt200 < 2047) {
								this.anInt200++;
							}
						}
						this.aClass1_Sub1_Sub3_3.method475(this.aClass1_Sub1_Sub3_3.anInt734 - local66, this.anInt354);
						if (local68 >= this.aClass11_1.anInt529) {
							this.aClass11_1.anInt529 = 0;
						} else {
							this.aClass11_1.anInt529 -= local68;
							for (local86 = 0; local86 < this.aClass11_1.anInt529; local86++) {
								this.aClass11_1.anIntArray162[local86] = this.aClass11_1.anIntArray162[local86 + local68];
								this.aClass11_1.anIntArray163[local86] = this.aClass11_1.anIntArray163[local86 + local68];
							}
						}
					}
				}
				if (super.anInt191 != 0) {
					@Pc(337) long local337 = (super.aLong13 - this.aLong18) / 50L;
					if (local337 > 4095L) {
						local337 = 4095L;
					}
					this.aLong18 = super.aLong13;
					local66 = super.anInt193;
					if (local66 < 0) {
						local66 = 0;
					} else if (local66 > 502) {
						local66 = 502;
					}
					local68 = super.anInt192;
					if (local68 < 0) {
						local68 = 0;
					} else if (local68 > 764) {
						local68 = 764;
					}
					local70 = local66 * 765 + local68;
					@Pc(383) byte local383 = 0;
					if (super.anInt191 == 2) {
						local383 = 1;
					}
					local103 = (int) local337;
					this.aClass1_Sub1_Sub3_3.method465(224);
					this.aClass1_Sub1_Sub3_3.method470((local103 << 20) + (local383 << 19) + local70);
				}
				if (this.anInt326 > 0) {
					this.anInt326--;
				}
				if (super.anIntArray30[1] == 1 || super.anIntArray30[2] == 1 || super.anIntArray30[3] == 1 || super.anIntArray30[4] == 1) {
					this.aBoolean80 = true;
				}
				if (this.aBoolean80 && this.anInt326 <= 0) {
					this.anInt326 = 20;
					this.aBoolean80 = false;
					this.aClass1_Sub1_Sub3_3.method465(193);
					this.aClass1_Sub1_Sub3_3.method467(this.anInt248);
					this.aClass1_Sub1_Sub3_3.method467(this.anInt249);
				}
				if (super.aBoolean51 && !this.aBoolean65) {
					this.aBoolean65 = true;
					this.aClass1_Sub1_Sub3_3.method465(149);
					this.aClass1_Sub1_Sub3_3.method466(1);
				}
				if (!super.aBoolean51 && this.aBoolean65) {
					this.aBoolean65 = false;
					this.aClass1_Sub1_Sub3_3.method465(149);
					this.aClass1_Sub1_Sub3_3.method466(0);
				}
				this.method120();
				this.method105();
				this.method190(948);
				this.anInt363++;
				if (this.anInt363 > 750) {
					this.method181();
				}
				this.method165((byte) 5);
				this.method198();
				this.method102();
				this.anInt202++;
				if (this.anInt199 != 0) {
					this.anInt198 += 20;
					if (this.anInt198 >= 400) {
						this.anInt199 = 0;
					}
				}
				if (this.anInt353 != 0) {
					this.anInt350++;
					if (this.anInt350 >= 15) {
						if (this.anInt353 == 2) {
							this.aBoolean61 = true;
						}
						if (this.anInt353 == 3) {
							this.aBoolean74 = true;
						}
						this.anInt353 = 0;
					}
				}
				if (this.anInt333 != 0) {
					this.anInt278++;
					if (super.anInt186 > this.anInt334 + 5 || super.anInt186 < this.anInt334 - 5 || super.anInt187 > this.anInt335 + 5 || super.anInt187 < this.anInt335 - 5) {
						this.aBoolean56 = true;
					}
					if (super.anInt185 == 0) {
						if (this.anInt333 == 2) {
							this.aBoolean61 = true;
						}
						if (this.anInt333 == 3) {
							this.aBoolean74 = true;
						}
						this.anInt333 = 0;
						if (this.aBoolean56 && this.anInt278 >= 5) {
							this.anInt280 = -1;
							this.method136((byte) 6);
							if (this.anInt280 == this.anInt331 && this.anInt279 != this.anInt332) {
								@Pc(683) Class6 local683 = Class6.aClass6Array1[this.anInt331];
								@Pc(685) byte local685 = 0;
								if (this.anInt209 == 1 && local683.anInt419 == 206) {
									local685 = 1;
								}
								if (local683.anIntArray94[this.anInt279] <= 0) {
									local685 = 0;
								}
								if (local683.aBoolean101) {
									local66 = this.anInt332;
									local68 = this.anInt279;
									local683.anIntArray94[local68] = local683.anIntArray94[local66];
									local683.anIntArray95[local68] = local683.anIntArray95[local66];
									local683.anIntArray94[local66] = -1;
									local683.anIntArray95[local66] = 0;
								} else if (local685 == 1) {
									local66 = this.anInt332;
									local68 = this.anInt279;
									while (local66 != local68) {
										if (local66 > local68) {
											local683.method231(local66 - 1, local66);
											local66--;
										} else if (local66 < local68) {
											local683.method231(local66 + 1, local66);
											local66++;
										}
									}
								} else {
									local683.method231(this.anInt279, this.anInt332);
								}
								this.aClass1_Sub1_Sub3_3.method465(253);
								this.aClass1_Sub1_Sub3_3.method467(this.anInt331);
								this.aClass1_Sub1_Sub3_3.method467(this.anInt332);
								this.aClass1_Sub1_Sub3_3.method467(this.anInt279);
								this.aClass1_Sub1_Sub3_3.method466(local685);
							}
						} else if ((this.anInt218 == 1 || this.method108(this.anInt275 - 1)) && this.anInt275 > 2) {
							this.method171(this.anInt235);
						} else if (this.anInt275 > 0) {
							this.method216(this.anInt275 - 1, 725);
						}
						this.anInt350 = 10;
						super.anInt191 = 0;
					}
				}
				anInt221++;
				if (anInt221 > 62) {
					anInt221 = 0;
					this.aClass1_Sub1_Sub3_3.method465(232);
				}
				@Pc(870) int local870;
				@Pc(872) int local872;
				if (Class37.anInt869 != -1) {
					local870 = Class37.anInt869;
					local872 = Class37.anInt870;
					@Pc(893) boolean local893 = this.method206(0, aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray271[0], 0, local872, 0, 0, true, 0, 0, local870, aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray272[0]);
					Class37.anInt869 = -1;
					if (local893) {
						this.anInt196 = super.anInt192;
						this.anInt197 = super.anInt193;
						this.anInt199 = 1;
						this.anInt198 = 0;
					}
				}
				if (super.anInt191 == 1 && this.aString4 != null) {
					this.aString4 = null;
					this.aBoolean74 = true;
					super.anInt191 = 0;
				}
				this.method96();
				this.method225();
				this.method188();
				if (arg0 <= 0) {
					this.aClass1_Sub1_Sub3_3.method466(98);
				}
				this.method227((byte) 9);
				if (super.anInt185 == 1 || super.anInt191 == 1) {
					this.anInt317++;
				}
				if (this.anInt229 == 2) {
					this.method131();
				}
				if (this.anInt229 == 2 && this.aBoolean55) {
					this.method214();
				}
				for (local870 = 0; local870 < 5; local870++) {
					@Pc(985) int local985 = this.anIntArray54[local870]++;
				}
				this.method215(this.anInt321);
				super.anInt184++;
				if (super.anInt184 > 4500) {
					this.anInt365 = 250;
					super.anInt184 -= 500;
					this.aClass1_Sub1_Sub3_3.method465(145);
				}
				this.anInt244++;
				if (this.anInt244 > 500) {
					this.anInt244 = 0;
					local872 = (int) (Math.random() * 8.0D);
					if ((local872 & 0x1) == 1) {
						this.anInt295 += this.anInt296;
					}
					if ((local872 & 0x2) == 2) {
						this.anInt384 += this.anInt385;
					}
					if ((local872 & 0x4) == 4) {
						this.anInt340 += this.anInt341;
					}
				}
				if (this.anInt295 < -50) {
					this.anInt296 = 2;
				}
				if (this.anInt295 > 50) {
					this.anInt296 = -2;
				}
				if (this.anInt384 < -55) {
					this.anInt385 = 2;
				}
				if (this.anInt384 > 55) {
					this.anInt385 = -2;
				}
				if (this.anInt340 < -40) {
					this.anInt341 = 1;
				}
				if (this.anInt340 > 40) {
					this.anInt341 = -1;
				}
				this.anInt239++;
				if (this.anInt239 > 500) {
					this.anInt239 = 0;
					local872 = (int) (Math.random() * 8.0D);
					if ((local872 & 0x1) == 1) {
						this.anInt266 += this.anInt267;
					}
					if ((local872 & 0x2) == 2) {
						this.anInt322 += this.anInt323;
					}
				}
				if (this.anInt266 < -60) {
					this.anInt267 = 2;
				}
				if (this.anInt266 > 60) {
					this.anInt267 = -2;
				}
				if (this.anInt322 < -20) {
					this.anInt323 = 1;
				}
				if (this.anInt322 > 10) {
					this.anInt323 = -1;
				}
				this.anInt364++;
				if (this.anInt364 > 50) {
					this.aClass1_Sub1_Sub3_3.method465(181);
				}
				try {
					if (this.aClass8_1 != null && this.aClass1_Sub1_Sub3_3.anInt734 > 0) {
						this.aClass8_1.method250(this.aClass1_Sub1_Sub3_3.aByteArray9, this.aClass1_Sub1_Sub3_3.anInt734);
						this.aClass1_Sub1_Sub3_3.anInt734 = 0;
						this.anInt364 = 0;
					}
				} catch (@Pc(1228) IOException local1228) {
					this.method181();
				} catch (@Pc(1233) Exception local1233) {
					this.method104();
				}
			}
		} catch (@Pc(1238) RuntimeException local1238) {
			signlink.reporterror("87308, " + arg0 + ", " + local1238.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IBLclient!lb;)V")
	private void method139(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub1_Sub3 arg1) {
		try {
			this.anInt254 = 0;
			this.anInt390 = 0;
			this.method212(arg0, arg1);
			this.method185(arg1, arg0);
			this.method172(arg0, arg1);
			this.method153(arg1, arg0);
			@Pc(36) int local36;
			for (@Pc(29) int local29 = 0; local29 < this.anInt254; local29++) {
				local36 = this.anIntArray49[local29];
				if (this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local36].anInt1020 != anInt396) {
					this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local36] = null;
				}
			}
			if (arg1.anInt734 != arg0) {
				signlink.reporterror("Error packet size mismatch in getplayer pos:" + arg1.anInt734 + " psize:" + arg0);
				throw new RuntimeException("eek");
			}
			for (local36 = 0; local36 < this.anInt389; local36++) {
				if (this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[this.anIntArray90[local36]] == null) {
					signlink.reporterror(this.aString11 + " null entry in pl list - pos:" + local36 + " size:" + this.anInt389);
					throw new RuntimeException("eek");
				}
			}
		} catch (@Pc(122) RuntimeException local122) {
			signlink.reporterror("73689, " + arg0 + ", " + 7 + ", " + arg1 + ", " + local122.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILclient!gc;III)V")
	private void method140(@OriginalArg(0) int arg0, @OriginalArg(1) Class13 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		try {
			@Pc(5) boolean local5 = false;
			if (this.anInt275 < 400) {
				@Pc(13) String local13 = arg1.aString24;
				if (arg1.anInt557 != 0) {
					local13 = local13 + method219(arg1.anInt557, aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt125) + " (level-" + arg1.anInt557 + ")";
				}
				if (this.anInt260 == 1) {
					this.aStringArray1[this.anInt275] = "Use " + this.aString7 + " with @yel@" + local13;
					this.anIntArray36[this.anInt275] = 829;
					this.anIntArray37[this.anInt275] = arg0;
					this.anIntArray34[this.anInt275] = arg2;
					this.anIntArray35[this.anInt275] = arg4;
					this.anInt275++;
				} else if (this.anInt287 != 1) {
					@Pc(151) int local151;
					if (arg1.aStringArray9 != null) {
						for (local151 = 4; local151 >= 0; local151--) {
							if (arg1.aStringArray9[local151] != null && !arg1.aStringArray9[local151].equalsIgnoreCase("attack")) {
								this.aStringArray1[this.anInt275] = arg1.aStringArray9[local151] + " @yel@" + local13;
								if (local151 == 0) {
									this.anIntArray36[this.anInt275] = 242;
								}
								if (local151 == 1) {
									this.anIntArray36[this.anInt275] = 209;
								}
								if (local151 == 2) {
									this.anIntArray36[this.anInt275] = 309;
								}
								if (local151 == 3) {
									this.anIntArray36[this.anInt275] = 852;
								}
								if (local151 == 4) {
									this.anIntArray36[this.anInt275] = 793;
								}
								this.anIntArray37[this.anInt275] = arg0;
								this.anIntArray34[this.anInt275] = arg2;
								this.anIntArray35[this.anInt275] = arg4;
								this.anInt275++;
							}
						}
					}
					if (arg1.aStringArray9 != null) {
						for (local151 = 4; local151 >= 0; local151--) {
							if (arg1.aStringArray9[local151] != null && arg1.aStringArray9[local151].equalsIgnoreCase("attack")) {
								@Pc(275) short local275 = 0;
								if (arg1.anInt557 > aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt125) {
									local275 = 2000;
								}
								this.aStringArray1[this.anInt275] = arg1.aStringArray9[local151] + " @yel@" + local13;
								if (local151 == 0) {
									this.anIntArray36[this.anInt275] = local275 + 242;
								}
								if (local151 == 1) {
									this.anIntArray36[this.anInt275] = local275 + 209;
								}
								if (local151 == 2) {
									this.anIntArray36[this.anInt275] = local275 + 309;
								}
								if (local151 == 3) {
									this.anIntArray36[this.anInt275] = local275 + 852;
								}
								if (local151 == 4) {
									this.anIntArray36[this.anInt275] = local275 + 793;
								}
								this.anIntArray37[this.anInt275] = arg0;
								this.anIntArray34[this.anInt275] = arg2;
								this.anIntArray35[this.anInt275] = arg4;
								this.anInt275++;
							}
						}
					}
					this.aStringArray1[this.anInt275] = "Examine @yel@" + local13;
					this.anIntArray36[this.anInt275] = 1714;
					this.anIntArray37[this.anInt275] = arg0;
					this.anIntArray34[this.anInt275] = arg2;
					this.anIntArray35[this.anInt275] = arg4;
					this.anInt275++;
				} else if ((this.anInt289 & 0x2) == 2) {
					this.aStringArray1[this.anInt275] = this.aString9 + " @yel@" + local13;
					this.anIntArray36[this.anInt275] = 240;
					this.anIntArray37[this.anInt275] = arg0;
					this.anIntArray34[this.anInt275] = arg2;
					this.anIntArray35[this.anInt275] = arg4;
					this.anInt275++;
					return;
				}
			}
		} catch (@Pc(425) RuntimeException local425) {
			signlink.reporterror("53238, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local425.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ZIZ)V")
	private void method141(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1) {
		try {
			this.aBoolean57 &= true;
			signlink.anInt933 = arg0;
			if (arg1) {
				signlink.midi = "voladjust";
			}
		} catch (@Pc(13) RuntimeException local13) {
			signlink.reporterror("20099, " + true + ", " + arg0 + ", " + arg1 + ", " + local13.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "u", descriptor = "(I)V")
	private void method142() {
		try {
			if (this.aClass35_18 == null) {
				this.method210();
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
				this.aClass35_18 = new Class35(this.method93(), 479, 96, 2);
				this.aClass35_16 = new Class35(this.method93(), 172, 156, 2);
				Class1_Sub1_Sub2.method434();
				this.aClass1_Sub1_Sub2_Sub3_19.method415(0, this.aByte14, 0);
				this.aClass35_15 = new Class35(this.method93(), 190, 261, 2);
				this.aClass35_17 = new Class35(this.method93(), 512, 334, 2);
				Class1_Sub1_Sub2.method434();
				this.aClass35_3 = new Class35(this.method93(), 496, 50, 2);
				this.aClass35_4 = new Class35(this.method93(), 269, 37, 2);
				this.aClass35_5 = new Class35(this.method93(), 249, 45, 2);
				this.aBoolean63 = true;
			}
		} catch (@Pc(134) RuntimeException local134) {
			signlink.reporterror("97189, " + 817 + ", " + local134.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "v", descriptor = "(I)V")
	private void method143() {
		try {
			this.anInt357 = 0;
			@Pc(60) int local60;
			@Pc(80) int local80;
			for (@Pc(13) int local13 = -1; local13 < this.anInt389 + this.anInt294; local13++) {
				@Pc(20) Class1_Sub1_Sub1_Sub1 local20;
				if (local13 == -1) {
					local20 = aClass1_Sub1_Sub1_Sub1_Sub1_1;
				} else if (local13 < this.anInt389) {
					local20 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[this.anIntArray90[local13]];
				} else {
					local20 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[this.anIntArray57[local13 - this.anInt389]];
				}
				if (local20 != null && local20.method676()) {
					if (local13 >= this.anInt389) {
						@Pc(155) Class13 local155 = ((Class1_Sub1_Sub1_Sub1_Sub2) local20).aClass13_2;
						if (local155.anInt562 >= 0 && local155.anInt562 < this.aClass1_Sub1_Sub2_Sub2Array7.length) {
							this.method156(local20.anInt1021 + 15, local20);
							if (this.anInt315 > -1) {
								this.aClass1_Sub1_Sub2_Sub2Array7[local155.anInt562].method388(this.anInt316 - 30, this.aByte14, this.anInt315 - 12);
							}
						}
						if (this.anInt293 == 1 && this.anInt237 == this.anIntArray57[local13 - this.anInt389] && anInt396 % 20 < 10) {
							this.method156(local20.anInt1021 + 15, local20);
							if (this.anInt315 > -1) {
								this.aClass1_Sub1_Sub2_Sub2Array7[2].method388(this.anInt316 - 28, this.aByte14, this.anInt315 - 12);
							}
						}
					} else {
						local60 = 30;
						@Pc(63) Class1_Sub1_Sub1_Sub1_Sub1 local63 = (Class1_Sub1_Sub1_Sub1_Sub1) local20;
						if (local63.anInt124 != 0) {
							this.method156(local20.anInt1021 + 15, local20);
							if (this.anInt315 > -1) {
								for (local80 = 0; local80 < 8; local80++) {
									if ((local63.anInt124 & 0x1 << local80) != 0) {
										this.aClass1_Sub1_Sub2_Sub2Array7[local80].method388(this.anInt316 - local60, this.aByte14, this.anInt315 - 12);
										local60 -= 25;
									}
								}
							}
						}
						if (local13 >= 0 && this.anInt293 == 10 && this.anInt240 == this.anIntArray90[local13]) {
							this.method156(local20.anInt1021 + 15, local20);
							if (this.anInt315 > -1) {
								this.aClass1_Sub1_Sub2_Sub2Array7[7].method388(this.anInt316 - local60, this.aByte14, this.anInt315 - 12);
							}
						}
					}
					if (local20.aString31 != null && (local13 >= this.anInt389 || this.anInt212 == 0 || this.anInt212 == 3 || this.anInt212 == 1 && this.method162(((Class1_Sub1_Sub1_Sub1_Sub1) local20).aString3))) {
						this.method156(local20.anInt1021, local20);
						if (this.anInt315 > -1 && this.anInt357 < this.anInt358) {
							this.anIntArray78[this.anInt357] = this.aClass1_Sub1_Sub2_Sub4_3.method446(local20.aString31) / 2;
							this.anIntArray77[this.anInt357] = this.aClass1_Sub1_Sub2_Sub4_3.anInt701;
							this.anIntArray75[this.anInt357] = this.anInt315;
							this.anIntArray76[this.anInt357] = this.anInt316;
							this.anIntArray79[this.anInt357] = local20.anInt992;
							this.anIntArray80[this.anInt357] = local20.anInt993;
							this.anIntArray81[this.anInt357] = local20.anInt991;
							this.aStringArray6[this.anInt357++] = local20.aString31;
							if (this.anInt274 == 0 && local20.anInt993 >= 1 && local20.anInt993 <= 3) {
								this.anIntArray77[this.anInt357] += 10;
								this.anIntArray76[this.anInt357] += 5;
							}
							if (this.anInt274 == 0 && local20.anInt993 == 4) {
								this.anIntArray78[this.anInt357] = 60;
							}
							if (this.anInt274 == 0 && local20.anInt993 == 5) {
								this.anIntArray77[this.anInt357] += 5;
							}
						}
					}
					if (local20.anInt994 > anInt396) {
						this.method156(local20.anInt1021 + 15, local20);
						if (this.anInt315 > -1) {
							local60 = local20.anInt995 * 30 / local20.anInt996;
							if (local60 > 30) {
								local60 = 30;
							}
							Class1_Sub1_Sub2.method436(65280, 210, this.anInt316 - 3, 5, this.anInt315 - 15, local60);
							Class1_Sub1_Sub2.method436(16711680, 210, this.anInt316 - 3, 5, this.anInt315 + local60 - 15, 30 - local60);
						}
					}
					for (local60 = 0; local60 < 4; local60++) {
						if (local20.anIntArray270[local60] > anInt396) {
							this.method156(local20.anInt1021 / 2, local20);
							if (this.anInt315 > -1) {
								if (local60 == 1) {
									this.anInt316 -= 20;
								}
								if (local60 == 2) {
									this.anInt315 -= 15;
									this.anInt316 -= 10;
								}
								if (local60 == 3) {
									this.anInt315 += 15;
									this.anInt316 -= 10;
								}
								this.aClass1_Sub1_Sub2_Sub2Array6[local20.anIntArray269[local60]].method388(this.anInt316 - 12, this.aByte14, this.anInt315 - 12);
								this.aClass1_Sub1_Sub2_Sub4_1.method443(this.anInt315, String.valueOf(local20.anIntArray268[local60]), 0, this.anInt316 + 4);
								this.aClass1_Sub1_Sub2_Sub4_1.method443(this.anInt315 - 1, String.valueOf(local20.anIntArray268[local60]), 16777215, this.anInt316 + 3);
							}
						}
					}
				}
			}
			for (@Pc(590) int local590 = 0; local590 < this.anInt357; local590++) {
				local60 = this.anIntArray75[local590];
				@Pc(602) int local602 = this.anIntArray76[local590];
				local80 = this.anIntArray78[local590];
				@Pc(612) int local612 = this.anIntArray77[local590];
				@Pc(614) boolean local614 = true;
				while (local614) {
					local614 = false;
					for (@Pc(620) int local620 = 0; local620 < local590; local620++) {
						if (local602 + 2 > this.anIntArray76[local620] - this.anIntArray77[local620] && local602 - local612 < this.anIntArray76[local620] + 2 && local60 - local80 < this.anIntArray75[local620] + this.anIntArray78[local620] && local60 + local80 > this.anIntArray75[local620] - this.anIntArray78[local620] && this.anIntArray76[local620] - this.anIntArray77[local620] < local602) {
							local602 = this.anIntArray76[local620] - this.anIntArray77[local620];
							local614 = true;
						}
					}
				}
				this.anInt315 = this.anIntArray75[local590];
				this.anInt316 = this.anIntArray76[local590] = local602;
				@Pc(719) String local719 = this.aStringArray6[local590];
				if (this.anInt274 == 0) {
					@Pc(724) int local724 = 16776960;
					if (this.anIntArray79[local590] < 6) {
						local724 = this.anIntArray83[this.anIntArray79[local590]];
					}
					if (this.anIntArray79[local590] == 6) {
						local724 = this.anInt375 % 20 < 10 ? 16711680 : 16776960;
					}
					if (this.anIntArray79[local590] == 7) {
						local724 = this.anInt375 % 20 < 10 ? 255 : 65535;
					}
					if (this.anIntArray79[local590] == 8) {
						local724 = this.anInt375 % 20 < 10 ? 45056 : 8454016;
					}
					@Pc(799) int local799;
					if (this.anIntArray79[local590] == 9) {
						local799 = 150 - this.anIntArray81[local590];
						if (local799 < 50) {
							local724 = local799 * 1280 + 16711680;
						} else if (local799 < 100) {
							local724 = 16776960 - (local799 - 50) * 327680;
						} else if (local799 < 150) {
							local724 = (local799 - 100) * 5 + 65280;
						}
					}
					if (this.anIntArray79[local590] == 10) {
						local799 = 150 - this.anIntArray81[local590];
						if (local799 < 50) {
							local724 = local799 * 5 + 16711680;
						} else if (local799 < 100) {
							local724 = 16711935 - (local799 - 50) * 327680;
						} else if (local799 < 150) {
							local724 = (local799 - 100) * 327680 + 255 - (local799 - 100) * 5;
						}
					}
					if (this.anIntArray79[local590] == 11) {
						local799 = 150 - this.anIntArray81[local590];
						if (local799 < 50) {
							local724 = 16777215 - local799 * 327685;
						} else if (local799 < 100) {
							local724 = (local799 - 50) * 327685 + 65280;
						} else if (local799 < 150) {
							local724 = 16777215 - (local799 - 100) * 327680;
						}
					}
					if (this.anIntArray80[local590] == 0) {
						this.aClass1_Sub1_Sub2_Sub4_3.method443(this.anInt315, local719, 0, this.anInt316 + 1);
						this.aClass1_Sub1_Sub2_Sub4_3.method443(this.anInt315, local719, local724, this.anInt316);
					}
					if (this.anIntArray80[local590] == 1) {
						this.aClass1_Sub1_Sub2_Sub4_3.method448(this.anInt315, this.anInt375, 0, this.anInt316 + 1, local719);
						this.aClass1_Sub1_Sub2_Sub4_3.method448(this.anInt315, this.anInt375, local724, this.anInt316, local719);
					}
					if (this.anIntArray80[local590] == 2) {
						this.aClass1_Sub1_Sub2_Sub4_3.method449(0, local719, (byte) 3, this.anInt315, this.anInt316 + 1, this.anInt375);
						this.aClass1_Sub1_Sub2_Sub4_3.method449(local724, local719, (byte) 3, this.anInt315, this.anInt316, this.anInt375);
					}
					if (this.anIntArray80[local590] == 3) {
						this.aClass1_Sub1_Sub2_Sub4_3.method450(local719, this.anInt315, this.anInt375, this.anInt316 + 1, 0, this.anInt277, 150 - this.anIntArray81[local590]);
						this.aClass1_Sub1_Sub2_Sub4_3.method450(local719, this.anInt315, this.anInt375, this.anInt316, local724, this.anInt277, 150 - this.anIntArray81[local590]);
					}
					@Pc(1098) int local1098;
					if (this.anIntArray80[local590] == 4) {
						local799 = this.aClass1_Sub1_Sub2_Sub4_3.method446(local719);
						local1098 = (150 - this.anIntArray81[local590]) * (local799 + 100) / 150;
						Class1_Sub1_Sub2.method433(this.aByte6, 334, this.anInt315 + 50, 0, this.anInt315 - 50);
						this.aClass1_Sub1_Sub2_Sub4_3.method447(0, local719, this.anInt315 + 50 - local1098, this.anInt316 + 1);
						this.aClass1_Sub1_Sub2_Sub4_3.method447(local724, local719, this.anInt315 + 50 - local1098, this.anInt316);
						Class1_Sub1_Sub2.method432();
					}
					if (this.anIntArray80[local590] == 5) {
						local799 = 150 - this.anIntArray81[local590];
						local1098 = 0;
						if (local799 < 25) {
							local1098 = local799 - 25;
						} else if (local799 > 125) {
							local1098 = local799 - 125;
						}
						Class1_Sub1_Sub2.method433(this.aByte6, this.anInt316 + 5, 512, this.anInt316 - this.aClass1_Sub1_Sub2_Sub4_3.anInt701 - 1, 0);
						this.aClass1_Sub1_Sub2_Sub4_3.method443(this.anInt315, local719, 0, this.anInt316 + local1098 + 1);
						this.aClass1_Sub1_Sub2_Sub4_3.method443(this.anInt315, local719, local724, this.anInt316 + local1098);
						Class1_Sub1_Sub2.method432();
					}
				} else {
					this.aClass1_Sub1_Sub2_Sub4_3.method443(this.anInt315, local719, 0, this.anInt316 + 1);
					this.aClass1_Sub1_Sub2_Sub4_3.method443(this.anInt315, local719, 16776960, this.anInt316);
				}
			}
		} catch (@Pc(1250) RuntimeException local1250) {
			signlink.reporterror("28791, " + 1 + ", " + local1250.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IB)V")
	private void method144(@OriginalArg(0) int arg0) {
		try {
			if (!aBoolean90) {
				@Pc(17) Class1_Sub1_Sub2_Sub3 local17;
				@Pc(25) int local25;
				@Pc(33) int local33;
				@Pc(36) byte[] local36;
				@Pc(39) byte[] local39;
				@Pc(41) int local41;
				if (Class1_Sub1_Sub2_Sub1.anIntArray181[17] >= arg0) {
					local17 = Class1_Sub1_Sub2_Sub1.aClass1_Sub1_Sub2_Sub3Array5[17];
					local25 = local17.anInt666 * local17.anInt667 - 1;
					local33 = local17.anInt666 * this.anInt202 * 2;
					local36 = local17.aByteArray7;
					local39 = this.aByteArray2;
					for (local41 = 0; local41 <= local25; local41++) {
						local39[local41] = local36[local41 - local33 & local25];
					}
					local17.aByteArray7 = local39;
					this.aByteArray2 = local36;
					Class1_Sub1_Sub2_Sub1.method346(17);
				}
				if (Class1_Sub1_Sub2_Sub1.anIntArray181[24] >= arg0) {
					local17 = Class1_Sub1_Sub2_Sub1.aClass1_Sub1_Sub2_Sub3Array5[24];
					local25 = local17.anInt666 * local17.anInt667 - 1;
					local33 = local17.anInt666 * this.anInt202 * 2;
					local36 = local17.aByteArray7;
					local39 = this.aByteArray2;
					for (local41 = 0; local41 <= local25; local41++) {
						local39[local41] = local36[local41 - local33 & local25];
					}
					local17.aByteArray7 = local39;
					this.aByteArray2 = local36;
					Class1_Sub1_Sub2_Sub1.method346(24);
					return;
				}
			}
		} catch (@Pc(126) RuntimeException local126) {
			signlink.reporterror("9303, " + arg0 + ", " + -12 + ", " + local126.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "w", descriptor = "(I)V")
	private void method145() {
		try {
			if (this.anInt299 != 0) {
				@Pc(8) Class1_Sub1_Sub2_Sub4 local8 = this.aClass1_Sub1_Sub2_Sub4_2;
				@Pc(10) int local10 = 0;
				if (this.anInt290 != 0) {
					local10 = 1;
				}
				for (@Pc(26) int local26 = 0; local26 < 100; local26++) {
					if (this.aStringArray4[local26] != null) {
						@Pc(38) int local38 = this.anIntArray55[local26];
						@Pc(43) String local43 = this.aStringArray3[local26];
						@Pc(45) byte local45 = 0;
						if (local43 != null && local43.startsWith("@cr1@")) {
							local43 = local43.substring(5);
							local45 = 1;
						}
						if (local43 != null && local43.startsWith("@cr2@")) {
							local43 = local43.substring(5);
							local45 = 2;
						}
						@Pc(96) int local96;
						if ((local38 == 3 || local38 == 7) && (local38 == 7 || this.anInt234 == 0 || this.anInt234 == 1 && this.method162(local43))) {
							local96 = 329 - local10 * 13;
							local8.method447(0, "From", 4, local96);
							local8.method447(65535, "From", 4, local96 - 1);
							@Pc(121) int local121 = local8.method445("From ") + 4;
							if (local45 == 1) {
								this.aClass1_Sub1_Sub2_Sub3Array1[0].method415(local96 - 12, this.aByte14, local121);
								local121 += 14;
							}
							if (local45 == 2) {
								this.aClass1_Sub1_Sub2_Sub3Array1[1].method415(local96 - 12, this.aByte14, local121);
								local121 += 14;
							}
							local8.method447(0, local43 + ": " + this.aStringArray4[local26], local121, local96);
							local8.method447(65535, local43 + ": " + this.aStringArray4[local26], local121, local96 - 1);
							local10++;
							if (local10 >= 5) {
								return;
							}
						}
						if (local38 == 5 && this.anInt234 < 2) {
							local96 = 329 - local10 * 13;
							local8.method447(0, this.aStringArray4[local26], 4, local96);
							local8.method447(65535, this.aStringArray4[local26], 4, local96 - 1);
							local10++;
							if (local10 >= 5) {
								return;
							}
						}
						if (local38 == 6 && this.anInt234 < 2) {
							local96 = 329 - local10 * 13;
							local8.method447(0, "To " + local43 + ": " + this.aStringArray4[local26], 4, local96);
							local8.method447(65535, "To " + local43 + ": " + this.aStringArray4[local26], 4, local96 - 1);
							local10++;
							if (local10 >= 5) {
								return;
							}
						}
					}
				}
			}
		} catch (@Pc(302) RuntimeException local302) {
			signlink.reporterror("54582, " + -411 + ", " + local302.toString());
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

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIB)Z")
	private boolean method147(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(9) boolean local9 = false;
			@Pc(13) Class6 local13 = Class6.aClass6Array1[arg1];
			for (@Pc(15) int local15 = 0; local15 < local13.anIntArray98.length && local13.anIntArray98[local15] != -1; local15++) {
				@Pc(30) Class6 local30 = Class6.aClass6Array1[local13.anIntArray98[local15]];
				if (local30.anInt417 == 1) {
					local9 |= this.method147(arg0, local30.anInt415);
				}
				if (local30.anInt417 == 6 && (local30.anInt438 != -1 || local30.anInt439 != -1)) {
					@Pc(60) boolean local60 = this.method170(local30);
					@Pc(65) int local65;
					if (local60) {
						local65 = local30.anInt439;
					} else {
						local65 = local30.anInt438;
					}
					if (local65 != -1) {
						@Pc(77) Class27 local77 = Class27.aClass27Array1[local65];
						local30.anInt414 += arg0;
						while (local30.anInt414 > local77.method502(local30.anInt413)) {
							local30.anInt414 -= local77.method502(local30.anInt413) + 1;
							local30.anInt413++;
							if (local30.anInt413 >= local77.anInt783) {
								local30.anInt413 -= local77.anInt784;
								if (local30.anInt413 < 0 || local30.anInt413 >= local77.anInt783) {
									local30.anInt413 = 0;
								}
							}
							local9 = true;
						}
					}
				}
			}
			return local9;
		} catch (@Pc(145) RuntimeException local145) {
			signlink.reporterror("91123, " + arg0 + ", " + arg1 + ", " + -103 + ", " + local145.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(BZ)V")
	private void method148(@OriginalArg(1) boolean arg0) {
		try {
			this.method169(831);
			this.aClass35_21.method520();
			this.aClass1_Sub1_Sub2_Sub3_6.method415(0, this.aByte14, 0);
			@Pc(51) byte local51;
			@Pc(63) int local63;
			if (this.anInt297 == 0) {
				this.aClass1_Sub1_Sub2_Sub4_1.method444(true, 7711145, 180, this.aClass44_Sub1_1.aString30, 180);
				local51 = 80;
				this.aClass1_Sub1_Sub2_Sub4_3.method444(true, 16776960, 180, "Welcome to RuneScape", 80);
				local63 = local51 + 30;
				this.aClass1_Sub1_Sub2_Sub3_7.method415(100, this.aByte14, 27);
				this.aClass1_Sub1_Sub2_Sub4_3.method444(true, 16777215, 100, "New User", 125);
				this.aClass1_Sub1_Sub2_Sub3_7.method415(100, this.aByte14, 187);
				this.aClass1_Sub1_Sub2_Sub4_3.method444(true, 16777215, 260, "Existing User", 125);
			}
			if (this.anInt297 == 2) {
				local51 = 60;
				if (this.aString15.length() > 0) {
					this.aClass1_Sub1_Sub2_Sub4_3.method444(true, 16776960, 180, this.aString15, 45);
					this.aClass1_Sub1_Sub2_Sub4_3.method444(true, 16776960, 180, this.aString16, 60);
					local63 = local51 + 30;
				} else {
					this.aClass1_Sub1_Sub2_Sub4_3.method444(true, 16776960, 180, this.aString16, 53);
					local63 = local51 + 30;
				}
				this.aClass1_Sub1_Sub2_Sub4_3.method451(16777215, 90, true, 90, "Username: " + this.aString11 + (this.anInt205 == 0 & anInt396 % 40 < 20 ? "@yel@|" : ""));
				local63 += 15;
				this.aClass1_Sub1_Sub2_Sub4_3.method451(16777215, 105, true, 92, "Password: " + Class48.method668(this.aString12) + (this.anInt205 == 1 & anInt396 % 40 < 20 ? "@yel@|" : ""));
				local63 += 15;
				if (!arg0) {
					this.aClass1_Sub1_Sub2_Sub3_7.method415(130, this.aByte14, 27);
					this.aClass1_Sub1_Sub2_Sub4_3.method444(true, 16777215, 100, "Login", 155);
					this.aClass1_Sub1_Sub2_Sub3_7.method415(130, this.aByte14, 187);
					this.aClass1_Sub1_Sub2_Sub4_3.method444(true, 16777215, 260, "Cancel", 155);
				}
			}
			if (this.anInt297 == 3) {
				this.aClass1_Sub1_Sub2_Sub4_3.method444(true, 16776960, 180, "Create a free account", 40);
				local51 = 65;
				this.aClass1_Sub1_Sub2_Sub4_3.method444(true, 16777215, 180, "To create a new account you need to", 65);
				local63 = local51 + 15;
				this.aClass1_Sub1_Sub2_Sub4_3.method444(true, 16777215, 180, "go back to the main RuneScape webpage", 80);
				local63 += 15;
				this.aClass1_Sub1_Sub2_Sub4_3.method444(true, 16777215, 180, "and choose the red 'create account'", 95);
				local63 += 15;
				this.aClass1_Sub1_Sub2_Sub4_3.method444(true, 16777215, 180, "button at the top right of that page.", 110);
				local63 += 15;
				this.aClass1_Sub1_Sub2_Sub3_7.method415(130, this.aByte14, 107);
				this.aClass1_Sub1_Sub2_Sub4_3.method444(true, 16777215, 180, "Cancel", 155);
			}
			this.aClass35_21.method521(202, 171, super.aGraphics2);
			if (this.aBoolean63) {
				this.aBoolean63 = false;
				this.aClass35_19.method521(128, 0, super.aGraphics2);
				this.aClass35_20.method521(202, 371, super.aGraphics2);
				this.aClass35_24.method521(0, 265, super.aGraphics2);
				this.aClass35_25.method521(562, 265, super.aGraphics2);
				this.aClass35_26.method521(128, 171, super.aGraphics2);
				this.aClass35_27.method521(562, 171, super.aGraphics2);
			}
		} catch (@Pc(501) RuntimeException local501) {
			signlink.reporterror("72643, " + -21 + ", " + arg0 + ", " + local501.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!lb;II)V")
	private void method149(@OriginalArg(0) Class1_Sub1_Sub3 arg0, @OriginalArg(2) int arg1) {
		try {
			@Pc(20) int local20;
			@Pc(29) int local29;
			@Pc(36) int local36;
			@Pc(39) int local39;
			@Pc(43) int local43;
			@Pc(47) int local47;
			@Pc(52) int local52;
			@Pc(57) int local57;
			if (arg1 == 90 || arg1 == 194) {
				local20 = arg0.method476();
				local29 = this.anInt310 + (local20 >> 4 & 0x7);
				local36 = this.anInt311 + (local20 & 0x7);
				local39 = arg0.method476();
				local43 = local39 >> 2;
				local47 = local39 & 0x3;
				local52 = this.anIntArray74[local43];
				if (arg1 == 194) {
					local57 = -1;
				} else {
					local57 = arg0.method478();
				}
				if (local29 >= 0 && local36 >= 0 && local29 < 104 && local36 < 104) {
					this.method164(0, this.anInt356, local57, local43, local36, local47, -1, local52, local29);
				}
			} else {
				@Pc(147) int local147;
				@Pc(159) int local159;
				@Pc(173) int local173;
				@Pc(185) int local185;
				if (arg1 == 106) {
					local20 = arg0.method476();
					local29 = this.anInt310 + (local20 >> 4 & 0x7);
					local36 = this.anInt311 + (local20 & 0x7);
					local39 = arg0.method476();
					local43 = local39 >> 2;
					local47 = local39 & 0x3;
					local52 = this.anIntArray74[local43];
					local57 = arg0.method478();
					if (local29 >= 0 && local36 >= 0 && local29 < 103 && local36 < 103) {
						local147 = this.anIntArrayArrayArray5[this.anInt356][local29][local36];
						local159 = this.anIntArrayArrayArray5[this.anInt356][local29 + 1][local36];
						local173 = this.anIntArrayArrayArray5[this.anInt356][local29 + 1][local36 + 1];
						local185 = this.anIntArrayArrayArray5[this.anInt356][local29][local36 + 1];
						if (local52 == 0) {
							@Pc(196) Class34 local196 = this.aClass37_1.method548(this.anInt356, local29, local36);
							if (local196 != null) {
								@Pc(205) int local205 = local196.anInt829 >> 14 & 0x7FFF;
								if (local43 == 2) {
									local196.aClass1_Sub1_Sub1_7 = new Class1_Sub1_Sub1_Sub2(local47 + 4, local205, 2, local185, local173, false, local147, local57, false, local159);
									local196.aClass1_Sub1_Sub1_8 = new Class1_Sub1_Sub1_Sub2(local47 + 1 & 0x3, local205, 2, local185, local173, false, local147, local57, false, local159);
								} else {
									local196.aClass1_Sub1_Sub1_7 = new Class1_Sub1_Sub1_Sub2(local47, local205, local43, local185, local173, false, local147, local57, false, local159);
								}
							}
						}
						if (local52 == 1) {
							@Pc(273) Class14 local273 = this.aClass37_1.method549(local36, this.anInt356, local29);
							if (local273 != null) {
								local273.aClass1_Sub1_Sub1_1 = new Class1_Sub1_Sub1_Sub2(0, local273.anInt569 >> 14 & 0x7FFF, 4, local185, local173, false, local147, local57, false, local159);
							}
						}
						if (local52 == 2) {
							@Pc(307) Class31 local307 = this.aClass37_1.method550(local29, local36, this.anInt356);
							if (local43 == 11) {
								local43 = 10;
							}
							if (local307 != null) {
								local307.aClass1_Sub1_Sub1_6 = new Class1_Sub1_Sub1_Sub2(local47, local307.anInt813 >> 14 & 0x7FFF, local43, local185, local173, false, local147, local57, false, local159);
							}
						}
						if (local52 == 3) {
							@Pc(346) Class18 local346 = this.aClass37_1.method551(this.anInt356, local36, local29);
							if (local346 != null) {
								local346.aClass1_Sub1_Sub1_2 = new Class1_Sub1_Sub1_Sub2(local47, local346.anInt652 >> 14 & 0x7FFF, 22, local185, local173, false, local147, local57, false, local159);
							}
						}
					}
				} else {
					@Pc(411) Class1_Sub1_Sub1_Sub3 local411;
					if (arg1 == 60) {
						local20 = arg0.method476();
						local29 = this.anInt310 + (local20 >> 4 & 0x7);
						local36 = this.anInt311 + (local20 & 0x7);
						local39 = arg0.method478();
						local43 = arg0.method478();
						if (local29 >= 0 && local36 >= 0 && local29 < 104 && local36 < 104) {
							local411 = new Class1_Sub1_Sub1_Sub3();
							local411.anInt171 = local39;
							local411.anInt172 = local43;
							if (this.aClass29ArrayArrayArray1[this.anInt356][local29][local36] == null) {
								this.aClass29ArrayArrayArray1[this.anInt356][local29][local36] = new Class29(-199);
							}
							this.aClass29ArrayArrayArray1[this.anInt356][local29][local36].method504(local411);
							this.method174(local29, local36);
						}
					} else if (arg1 == 71) {
						local20 = arg0.method476();
						local29 = this.anInt310 + (local20 >> 4 & 0x7);
						local36 = this.anInt311 + (local20 & 0x7);
						local39 = arg0.method478();
						if (local29 >= 0 && local36 >= 0 && local29 < 104 && local36 < 104) {
							@Pc(501) Class29 local501 = this.aClass29ArrayArrayArray1[this.anInt356][local29][local36];
							if (local501 != null) {
								for (local411 = (Class1_Sub1_Sub1_Sub3) local501.method507(); local411 != null; local411 = (Class1_Sub1_Sub1_Sub3) local501.method509()) {
									if (local411.anInt171 == (local39 & 0x7FFF)) {
										local411.method669();
										break;
									}
								}
								if (local501.method507() == null) {
									this.aClass29ArrayArrayArray1[this.anInt356][local29][local36] = null;
								}
								this.method174(local29, local36);
							}
						}
					} else if (arg1 == 87) {
						local20 = arg0.method476();
						local29 = this.anInt310 + (local20 >> 4 & 0x7);
						local36 = this.anInt311 + (local20 & 0x7);
						local39 = local29 + arg0.method477();
						local43 = local36 + arg0.method477();
						local47 = arg0.method479();
						local52 = arg0.method478();
						local57 = arg0.method476() * 4;
						local147 = arg0.method476() * 4;
						local159 = arg0.method478();
						local173 = arg0.method478();
						local185 = arg0.method476();
						@Pc(604) int local604 = arg0.method476();
						if (local29 >= 0 && local36 >= 0 && local29 < 104 && local36 < 104 && local39 >= 0 && local43 >= 0 && local39 < 104 && local43 < 104) {
							local29 = local29 * 128 + 64;
							local36 = local36 * 128 + 64;
							local39 = local39 * 128 + 64;
							local43 = local43 * 128 + 64;
							@Pc(677) Class1_Sub1_Sub1_Sub4 local677 = new Class1_Sub1_Sub1_Sub4(local604, this.method133(local36, local29, this.anInt356) - local57, local159 + anInt396, local52, local29, local47, this.anInt356, local36, local173 + anInt396, local185, false, local147);
							local677.method240(this.method133(local43, local39, this.anInt356) - local147, local43, local159 + anInt396, local39);
							this.aClass29_1.method504(local677);
						}
					} else if (arg1 == 233) {
						local20 = arg0.method476();
						local29 = this.anInt310 + (local20 >> 4 & 0x7);
						local36 = this.anInt311 + (local20 & 0x7);
						local39 = arg0.method478();
						local43 = arg0.method476();
						local47 = arg0.method478();
						if (local29 >= 0 && local36 >= 0 && local29 < 104 && local36 < 104) {
							local29 = local29 * 128 + 64;
							local36 = local36 * 128 + 64;
							@Pc(773) Class1_Sub1_Sub1_Sub6 local773 = new Class1_Sub1_Sub1_Sub6(local29, this.anInt356, this.method133(local36, local29, this.anInt356) - local43, local47, true, local36, local39, anInt396);
							this.aClass29_2.method504(local773);
						}
					} else if (arg1 == 176) {
						local20 = arg0.method476();
						local29 = this.anInt310 + (local20 >> 4 & 0x7);
						local36 = this.anInt311 + (local20 & 0x7);
						local39 = arg0.method478();
						local43 = arg0.method478();
						local47 = arg0.method478();
						if (local29 >= 0 && local36 >= 0 && local29 < 104 && local36 < 104 && local47 != this.anInt344) {
							@Pc(827) Class1_Sub1_Sub1_Sub3 local827 = new Class1_Sub1_Sub1_Sub3();
							local827.anInt171 = local39;
							local827.anInt172 = local43;
							if (this.aClass29ArrayArrayArray1[this.anInt356][local29][local36] == null) {
								this.aClass29ArrayArrayArray1[this.anInt356][local29][local36] = new Class29(-199);
							}
							this.aClass29ArrayArrayArray1[this.anInt356][local29][local36].method504(local827);
							this.method174(local29, local36);
						}
					} else {
						if (arg1 == 83) {
							local20 = arg0.method476();
							local29 = this.anInt310 + (local20 >> 4 & 0x7);
							local36 = this.anInt311 + (local20 & 0x7);
							local39 = arg0.method476();
							local43 = local39 >> 2;
							local47 = local39 & 0x3;
							local52 = this.anIntArray74[local43];
							local57 = arg0.method478();
							local147 = arg0.method478();
							local159 = arg0.method478();
							local173 = arg0.method478();
							@Pc(925) byte local925 = arg0.method477();
							@Pc(928) byte local928 = arg0.method477();
							@Pc(931) byte local931 = arg0.method477();
							@Pc(934) byte local934 = arg0.method477();
							@Pc(940) Class1_Sub1_Sub1_Sub1_Sub1 local940;
							if (local173 == this.anInt344) {
								local940 = aClass1_Sub1_Sub1_Sub1_Sub1_1;
							} else {
								local940 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local173];
							}
							if (local940 != null) {
								@Pc(952) Class9 local952 = Class9.method287(local57);
								@Pc(962) int local962 = this.anIntArrayArrayArray5[this.anInt356][local29][local36];
								@Pc(974) int local974 = this.anIntArrayArrayArray5[this.anInt356][local29 + 1][local36];
								@Pc(988) int local988 = this.anIntArrayArrayArray5[this.anInt356][local29 + 1][local36 + 1];
								@Pc(1000) int local1000 = this.anIntArrayArrayArray5[this.anInt356][local29][local36 + 1];
								@Pc(1010) Class1_Sub1_Sub1_Sub5 local1010 = local952.method293(local43, local47, local962, local974, local988, local1000, -1);
								if (local1010 != null) {
									this.method164(local147 + 1, this.anInt356, -1, 0, local36, 0, local159 + 1, local52, local29);
									local940.anInt128 = local147 + anInt396;
									local940.anInt129 = local159 + anInt396;
									local940.aClass1_Sub1_Sub1_Sub5_1 = local1010;
									@Pc(1045) int local1045 = local952.anInt502;
									@Pc(1048) int local1048 = local952.anInt503;
									if (local47 == 1 || local47 == 3) {
										local1045 = local952.anInt503;
										local1048 = local952.anInt502;
									}
									local940.anInt130 = local29 * 128 + local1045 * 64;
									local940.anInt132 = local36 * 128 + local1048 * 64;
									local940.anInt131 = this.method133(local940.anInt132, local940.anInt130, this.anInt356);
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
									local940.anInt133 = local29 + local925;
									local940.anInt135 = local29 + local931;
									local940.anInt134 = local36 + local928;
									local940.anInt136 = local36 + local934;
								}
							}
						}
						if (arg1 == 117) {
							local20 = arg0.method476();
							local29 = this.anInt310 + (local20 >> 4 & 0x7);
							local36 = this.anInt311 + (local20 & 0x7);
							local39 = arg0.method478();
							local43 = arg0.method478();
							local47 = arg0.method478();
							if (local29 >= 0 && local36 >= 0 && local29 < 104 && local36 < 104) {
								@Pc(1178) Class29 local1178 = this.aClass29ArrayArrayArray1[this.anInt356][local29][local36];
								if (local1178 != null) {
									for (@Pc(1184) Class1_Sub1_Sub1_Sub3 local1184 = (Class1_Sub1_Sub1_Sub3) local1178.method507(); local1184 != null; local1184 = (Class1_Sub1_Sub1_Sub3) local1178.method509()) {
										if (local1184.anInt171 == (local39 & 0x7FFF) && local1184.anInt172 == local43) {
											local1184.anInt172 = local47;
											break;
										}
									}
									this.method174(local29, local36);
								}
							}
						} else if (arg1 == 91) {
							local20 = arg0.method476();
							local29 = this.anInt310 + (local20 >> 4 & 0x7);
							local36 = this.anInt311 + (local20 & 0x7);
							local39 = arg0.method478();
							local43 = arg0.method476();
							local47 = local43 >> 4 & 0xF;
							local52 = local43 & 0x7;
							if (aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray271[0] >= local29 - local47 && aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray271[0] <= local29 + local47 && aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray272[0] >= local36 - local47 && aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray272[0] <= local36 + local47 && this.aBoolean75 && !aBoolean90 && this.anInt272 < 50) {
								this.anIntArray38[this.anInt272] = local39;
								this.anIntArray56[this.anInt272] = local52;
								this.anIntArray82[this.anInt272] = Class5.anIntArray29[local39];
								this.anInt272++;
								return;
							}
						}
					}
				}
			}
		} catch (@Pc(1320) RuntimeException local1320) {
			signlink.reporterror("80608, " + arg0 + ", " + -6563 + ", " + arg1 + ", " + local1320.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "x", descriptor = "(I)V")
	private void method150() {
		try {
			@Pc(7) byte[] local7 = this.aClass47_1.method662("title.dat", null);
			@Pc(13) Class1_Sub1_Sub2_Sub2 local13 = new Class1_Sub1_Sub2_Sub2(local7, this);
			this.aClass35_22.method520();
			local13.method386(0, 0);
			this.aClass35_23.method520();
			local13.method386(-637, 0);
			this.aClass35_19.method520();
			local13.method386(-128, 0);
			this.aClass35_20.method520();
			local13.method386(-202, -371);
			this.aClass35_21.method520();
			local13.method386(-202, -171);
			this.aClass35_24.method520();
			local13.method386(0, -265);
			this.aClass35_25.method520();
			local13.method386(-562, -265);
			this.aClass35_26.method520();
			local13.method386(-128, -171);
			this.aClass35_27.method520();
			local13.method386(-562, -171);
			@Pc(98) int[] local98 = new int[local13.anInt643];
			for (@Pc(100) int local100 = 0; local100 < local13.anInt644; local100++) {
				for (@Pc(104) int local104 = 0; local104 < local13.anInt643; local104++) {
					local98[local104] = local13.anIntArray207[local13.anInt643 + local13.anInt643 * local100 - local104 - 1];
				}
				for (@Pc(130) int local130 = 0; local130 < local13.anInt643; local130++) {
					local13.anIntArray207[local130 + local13.anInt643 * local100] = local98[local130];
				}
			}
			this.aClass35_22.method520();
			local13.method386(382, 0);
			this.aClass35_23.method520();
			local13.method386(-255, 0);
			this.aClass35_19.method520();
			local13.method386(254, 0);
			this.aClass35_20.method520();
			local13.method386(180, -371);
			this.aClass35_21.method520();
			local13.method386(180, -171);
			this.aClass35_24.method520();
			local13.method386(382, -265);
			this.aClass35_25.method520();
			local13.method386(-180, -265);
			this.aClass35_26.method520();
			local13.method386(254, -171);
			this.aClass35_27.method520();
			local13.method386(-180, -171);
			local13 = new Class1_Sub1_Sub2_Sub2(this.aClass47_1, "logo", 0);
			this.aClass35_19.method520();
			local13.method388(18, this.aByte14, 382 - local13.anInt643 / 2 - 128);
			System.gc();
		} catch (@Pc(272) RuntimeException local272) {
			signlink.reporterror("12680, " + 0 + ", " + local272.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "k", descriptor = "(B)V")
	private void method151(@OriginalArg(0) byte arg0) {
		try {
			for (@Pc(6) Class1_Sub1_Sub1_Sub4 local6 = (Class1_Sub1_Sub1_Sub4) this.aClass29_1.method507(); local6 != null; local6 = (Class1_Sub1_Sub1_Sub4) this.aClass29_1.method509()) {
				if (local6.anInt448 != this.anInt356 || anInt396 > local6.anInt454) {
					local6.method669();
				} else if (anInt396 >= local6.anInt453) {
					if (local6.anInt457 > 0) {
						@Pc(36) Class1_Sub1_Sub1_Sub1_Sub2 local36 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local6.anInt457 - 1];
						if (local36 != null && local36.anInt980 >= 0 && local36.anInt980 < 13312 && local36.anInt981 >= 0 && local36.anInt981 < 13312) {
							local6.method240(this.method133(local36.anInt981, local36.anInt980, local6.anInt448) - local6.anInt452, local36.anInt981, anInt396, local36.anInt980);
						}
					}
					if (local6.anInt457 < 0) {
						@Pc(81) int local81 = -local6.anInt457 - 1;
						@Pc(87) Class1_Sub1_Sub1_Sub1_Sub1 local87;
						if (local81 == this.anInt344) {
							local87 = aClass1_Sub1_Sub1_Sub1_Sub1_1;
						} else {
							local87 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local81];
						}
						if (local87 != null && local87.anInt980 >= 0 && local87.anInt980 < 13312 && local87.anInt981 >= 0 && local87.anInt981 < 13312) {
							local6.method240(this.method133(local87.anInt981, local87.anInt980, local6.anInt448) - local6.anInt452, local87.anInt981, anInt396, local87.anInt980);
						}
					}
					local6.method241(this.anInt202);
					this.aClass37_1.method537(60, -1, (int) local6.aDouble3, (int) local6.aDouble1, 384, local6, local6.anInt458, false, (int) local6.aDouble2, this.anInt356);
				}
			}
			anInt359++;
			if (arg0 != this.aByte8) {
				this.aBoolean93 = !this.aBoolean93;
			}
			if (anInt359 > 1174) {
				anInt359 = 0;
				this.aClass1_Sub1_Sub3_3.method465(130);
				this.aClass1_Sub1_Sub3_3.method466(0);
				@Pc(199) int local199 = this.aClass1_Sub1_Sub3_3.anInt734;
				if ((int) (Math.random() * 2.0D) == 0) {
					this.aClass1_Sub1_Sub3_3.method467(11499);
				}
				this.aClass1_Sub1_Sub3_3.method467(10548);
				if ((int) (Math.random() * 2.0D) == 0) {
					this.aClass1_Sub1_Sub3_3.method466(139);
				}
				if ((int) (Math.random() * 2.0D) == 0) {
					this.aClass1_Sub1_Sub3_3.method466(94);
				}
				this.aClass1_Sub1_Sub3_3.method467(51693);
				this.aClass1_Sub1_Sub3_3.method466(16);
				this.aClass1_Sub1_Sub3_3.method467(15036);
				if ((int) (Math.random() * 2.0D) == 0) {
					this.aClass1_Sub1_Sub3_3.method466(65);
				}
				this.aClass1_Sub1_Sub3_3.method466((int) (Math.random() * 256.0D));
				this.aClass1_Sub1_Sub3_3.method467(22990);
				this.aClass1_Sub1_Sub3_3.method475(this.aClass1_Sub1_Sub3_3.anInt734 - local199, this.anInt354);
			}
		} catch (@Pc(274) RuntimeException local274) {
			signlink.reporterror("60480, " + arg0 + ", " + local274.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "l", descriptor = "(B)V")
	private void method152(@OriginalArg(0) byte arg0) {
		try {
			this.aBoolean53 = true;
			for (@Pc(6) int local6 = 0; local6 < 7; local6++) {
				this.anIntArray39[local6] = -1;
				for (@Pc(15) int local15 = 0; local15 < Class23.anInt741; local15++) {
					if (!Class23.aClass23Array1[local15].aBoolean201 && Class23.aClass23Array1[local15].anInt742 == local6 + (this.aBoolean86 ? 0 : 7)) {
						this.anIntArray39[local6] = local15;
						break;
					}
				}
			}
			if (arg0 != -127) {
				this.anInt362 = this.aClass1_Sub1_Sub3_4.method476();
			}
		} catch (@Pc(60) RuntimeException local60) {
			signlink.reporterror("72183, " + arg0 + ", " + local60.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!lb;ZI)V")
	private void method153(@OriginalArg(0) Class1_Sub1_Sub3 arg0, @OriginalArg(2) int arg1) {
		try {
			for (@Pc(11) int local11 = 0; local11 < this.anInt390; local11++) {
				@Pc(18) int local18 = this.anIntArray91[local11];
				@Pc(23) Class1_Sub1_Sub1_Sub1_Sub1 local23 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local18];
				@Pc(26) int local26 = arg0.method476();
				if ((local26 & 0x80) == 128) {
					local26 += arg0.method476() << 8;
				}
				this.method128(local26, arg0, local18, local23);
			}
		} catch (@Pc(52) RuntimeException local52) {
			signlink.reporterror("27562, " + arg0 + ", " + false + ", " + arg1 + ", " + local52.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IZ)Ljava/lang/String;")
	private String method154(@OriginalArg(0) int arg0) {
		try {
			return arg0 < 999999999 ? String.valueOf(arg0) : "*";
		} catch (@Pc(12) RuntimeException local12) {
			signlink.reporterror("94656, " + arg0 + ", " + false + ", " + local12.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIIIIII)V")
	private void method155(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		try {
			if (arg4 >= 1 && arg6 >= 1 && arg4 <= 102 && arg6 <= 102) {
				if (aBoolean90 && arg2 != this.anInt356) {
					return;
				}
				@Pc(26) int local26 = 0;
				if (arg5 == 0) {
					local26 = this.aClass37_1.method552(arg2, arg4, arg6);
				}
				if (arg5 == 1) {
					local26 = this.aClass37_1.method553(arg6, arg2, arg4);
				}
				if (arg5 == 2) {
					local26 = this.aClass37_1.method554(arg2, arg4, arg6);
				}
				if (arg5 == 3) {
					local26 = this.aClass37_1.method555(arg2, arg4, arg6);
				}
				@Pc(82) int local82;
				if (local26 != 0) {
					local82 = this.aClass37_1.method556(arg2, arg4, arg6, local26);
					@Pc(88) int local88 = local26 >> 14 & 0x7FFF;
					@Pc(92) int local92 = local82 & 0x1F;
					@Pc(96) int local96 = local82 >> 6;
					@Pc(108) Class9 local108;
					if (arg5 == 0) {
						this.aClass37_1.method543(arg6, arg4, (byte) 7, arg2);
						local108 = Class9.method287(local88);
						if (local108.aBoolean123) {
							this.aClass19Array1[arg2].method422(local96, local92, arg6, arg4, local108.aBoolean124);
						}
					}
					if (arg5 == 1) {
						this.aClass37_1.method544(arg2, arg6, arg4);
					}
					if (arg5 == 2) {
						this.aClass37_1.method545(arg2, arg6, arg4);
						local108 = Class9.method287(local88);
						if (arg4 + local108.anInt502 > 103 || arg6 + local108.anInt502 > 103 || arg4 + local108.anInt503 > 103 || arg6 + local108.anInt503 > 103) {
							return;
						}
						if (local108.aBoolean123) {
							this.aClass19Array1[arg2].method423(local108.anInt503, arg6, arg4, local108.aBoolean124, local96, local108.anInt502);
						}
					}
					if (arg5 == 3) {
						this.aClass37_1.method546(arg4, arg6, arg2);
						local108 = Class9.method287(local88);
						if (local108.aBoolean123 && local108.aBoolean125) {
							this.aClass19Array1[arg2].method425(arg6, arg4);
						}
					}
				}
				if (arg3 >= 0) {
					local82 = arg2;
					if (arg2 < 3 && (this.aByteArrayArrayArray7[1][arg4][arg6] & 0x2) == 2) {
						local82 = arg2 + 1;
					}
					Class4.method72(arg0, arg2, arg6, arg1, this.anIntArrayArrayArray5, local82, arg4, this.aClass19Array1[arg2], this.aClass37_1, arg3);
					return;
				}
			}
		} catch (@Pc(255) RuntimeException local255) {
			signlink.reporterror("55555, " + arg0 + ", " + 0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + local255.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILclient!y;I)V")
	private void method156(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub1_Sub1_Sub1 arg1) {
		try {
			this.method157(arg1.anInt980, arg0, arg1.anInt981);
		} catch (@Pc(16) RuntimeException local16) {
			signlink.reporterror("86761, " + arg0 + ", " + arg1 + ", " + 0 + ", " + local16.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIBI)V")
	private void method157(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		try {
			if (arg0 >= 128 && arg2 >= 128 && arg0 <= 13056 && arg2 <= 13056) {
				@Pc(28) int local28 = this.method133(arg2, arg0, this.anInt356) - arg1;
				@Pc(33) int local33 = arg0 - this.anInt223;
				@Pc(45) int local45 = local28 - this.anInt224;
				@Pc(50) int local50 = arg2 - this.anInt225;
				@Pc(55) int local55 = Class1_Sub1_Sub1_Sub5.anIntArray151[this.anInt226];
				@Pc(60) int local60 = Class1_Sub1_Sub1_Sub5.anIntArray152[this.anInt226];
				@Pc(65) int local65 = Class1_Sub1_Sub1_Sub5.anIntArray151[this.anInt227];
				@Pc(70) int local70 = Class1_Sub1_Sub1_Sub5.anIntArray152[this.anInt227];
				@Pc(80) int local80 = local50 * local65 + local33 * local70 >> 16;
				@Pc(90) int local90 = local50 * local70 - local33 * local65 >> 16;
				@Pc(92) int local92 = local80;
				@Pc(102) int local102 = local45 * local60 - local90 * local55 >> 16;
				@Pc(112) int local112 = local45 * local55 + local90 * local60 >> 16;
				if (local112 >= 50) {
					this.anInt315 = Class1_Sub1_Sub2_Sub1.anInt585 + (local92 << 9) / local112;
					this.anInt316 = Class1_Sub1_Sub2_Sub1.anInt586 + (local102 << 9) / local112;
				} else {
					this.anInt315 = -1;
					this.anInt316 = -1;
				}
			} else {
				this.anInt315 = -1;
				this.anInt316 = -1;
			}
		} catch (@Pc(144) RuntimeException local144) {
			signlink.reporterror("20782, " + arg0 + ", " + arg1 + ", " + -79 + ", " + arg2 + ", " + local144.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "m", descriptor = "(B)V")
	private void method158(@OriginalArg(0) byte arg0) {
		try {
			Class9.aClass40_4.method589();
			Class9.aClass40_5.method589();
			if (arg0 != -71) {
				this.anInt313 = this.aClass46_1.method658();
			}
			Class13.aClass40_6.method589();
			Class15.aClass40_7.method589();
			Class15.aClass40_8.method589();
			Class1_Sub1_Sub1_Sub1_Sub1.aClass40_1.method589();
			Class33.aClass40_9.method589();
		} catch (@Pc(23) RuntimeException local23) {
			signlink.reporterror("83788, " + arg0 + ", " + local23.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Ljava/lang/String;)Ljava/io/DataInputStream;")
	private DataInputStream method159(@OriginalArg(0) String arg0) throws IOException {
		if (this.aBoolean64) {
			if (this.aSocket1 != null) {
				try {
					this.aSocket1.close();
				} catch (@Pc(26) Exception local26) {
				}
				this.aSocket1 = null;
			}
			this.aSocket1 = this.method116(43595);
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

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIZII)Z")
	private boolean method160(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		try {
			@Pc(7) int local7 = arg0 >> 14 & 0x7FFF;
			@Pc(16) int local16 = this.aClass37_1.method556(this.anInt356, arg3, arg2, arg0);
			if (local16 == -1) {
				return false;
			}
			@Pc(25) int local25 = local16 & 0x1F;
			@Pc(31) int local31 = local16 >> 6 & 0x3;
			anInt382++;
			if (anInt382 > 1086) {
				anInt382 = 0;
				this.aClass1_Sub1_Sub3_3.method465(154);
				this.aClass1_Sub1_Sub3_3.method466(0);
				@Pc(53) int local53 = this.aClass1_Sub1_Sub3_3.anInt734;
				if ((int) (Math.random() * 2.0D) == 0) {
					this.aClass1_Sub1_Sub3_3.method467(16791);
				}
				this.aClass1_Sub1_Sub3_3.method466(254);
				this.aClass1_Sub1_Sub3_3.method467((int) (Math.random() * 65536.0D));
				this.aClass1_Sub1_Sub3_3.method467(16128);
				this.aClass1_Sub1_Sub3_3.method467(52610);
				this.aClass1_Sub1_Sub3_3.method467((int) (Math.random() * 65536.0D));
				this.aClass1_Sub1_Sub3_3.method467(55420);
				if ((int) (Math.random() * 2.0D) == 0) {
					this.aClass1_Sub1_Sub3_3.method467(35025);
				}
				this.aClass1_Sub1_Sub3_3.method467(46628);
				this.aClass1_Sub1_Sub3_3.method466((int) (Math.random() * 256.0D));
				this.aClass1_Sub1_Sub3_3.method475(this.aClass1_Sub1_Sub3_3.anInt734 - local53, this.anInt354);
			}
			if (local25 == 10 || local25 == 11 || local25 == 22) {
				@Pc(134) Class9 local134 = Class9.method287(local7);
				@Pc(142) int local142;
				@Pc(145) int local145;
				if (local31 == 0 || local31 == 2) {
					local142 = local134.anInt502;
					local145 = local134.anInt503;
				} else {
					local142 = local134.anInt503;
					local145 = local134.anInt502;
				}
				@Pc(156) int local156 = local134.anInt514;
				if (local31 != 0) {
					local156 = (local156 << local31 & 0xF) + (local156 >> 4 - local31);
				}
				this.method206(local142, aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray271[0], 0, arg2, local156, 0, false, 2, local145, arg3, aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray272[0]);
			} else {
				this.method206(0, aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray271[0], local31, arg2, 0, local25 + 1, false, 2, 0, arg3, aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray272[0]);
			}
			this.anInt196 = super.anInt192;
			this.anInt197 = super.anInt193;
			this.anInt199 = 2;
			this.anInt198 = 0;
			this.aClass1_Sub1_Sub3_3.method465(arg1);
			this.aClass1_Sub1_Sub3_3.method467(arg3 + this.anInt370);
			this.aClass1_Sub1_Sub3_3.method467(arg2 + this.anInt371);
			this.aClass1_Sub1_Sub3_3.method467(local7);
			return true;
		} catch (@Pc(260) RuntimeException local260) {
			signlink.reporterror("86165, " + arg0 + ", " + arg1 + ", " + false + ", " + arg2 + ", " + arg3 + ", " + local260.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "n", descriptor = "(B)Z")
	private boolean method161() {
		try {
			return signlink.wavereplay();
		} catch (@Pc(8) RuntimeException local8) {
			signlink.reporterror("96494, " + 9 + ", " + local8.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/String;I)Z")
	private boolean method162(@OriginalArg(0) String arg0) {
		try {
			if (arg0 == null) {
				return false;
			}
			for (@Pc(19) int local19 = 0; local19 < this.anInt338; local19++) {
				if (arg0.equalsIgnoreCase(this.aStringArray5[local19])) {
					return true;
				}
			}
			return arg0.equalsIgnoreCase(aClass1_Sub1_Sub1_Sub1_Sub1_1.aString3);
		} catch (@Pc(45) RuntimeException local45) {
			signlink.reporterror("59627, " + arg0 + ", " + 3 + ", " + local45.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IILclient!d;IZIBII)V")
	private void method163(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class6 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		try {
			if (this.aBoolean83) {
				this.anInt206 = 32;
			} else {
				this.anInt206 = 0;
			}
			this.aBoolean83 = false;
			if (arg6 != -83) {
				this.aClass1_Sub1_Sub3_3.method466(103);
			}
			if (arg1 >= arg3 && arg1 < arg3 + 16 && arg7 >= arg0 && arg7 < arg0 + 16) {
				arg2.anInt426 -= this.anInt317 * 4;
				if (arg4) {
					this.aBoolean61 = true;
					return;
				}
			} else if (arg1 >= arg3 && arg1 < arg3 + 16 && arg7 >= arg0 + arg5 - 16 && arg7 < arg0 + arg5) {
				arg2.anInt426 += this.anInt317 * 4;
				if (arg4) {
					this.aBoolean61 = true;
					return;
				}
			} else if (arg1 >= arg3 - this.anInt206 && arg1 < arg3 + this.anInt206 + 16 && arg7 >= arg0 + 16 && arg7 < arg0 + arg5 - 16 && this.anInt317 > 0) {
				@Pc(123) int local123 = (arg5 - 32) * arg5 / arg8;
				if (local123 < 8) {
					local123 = 8;
				}
				@Pc(138) int local138 = arg7 - arg0 - local123 / 2 - 16;
				@Pc(144) int local144 = arg5 - local123 - 32;
				arg2.anInt426 = (arg8 - arg5) * local138 / local144;
				if (arg4) {
					this.aBoolean61 = true;
				}
				this.aBoolean83 = true;
			} else {
				return;
			}
		} catch (@Pc(163) RuntimeException local163) {
			signlink.reporterror("35389, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + local163.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Z)V")
	@Override
	protected void method92() {
		try {
			this.aBoolean63 = true;
		} catch (@Pc(6) RuntimeException local6) {
			signlink.reporterror("20297, " + false + ", " + local6.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIIIIIIII)V")
	private void method164(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		try {
			@Pc(1) Class1_Sub2 local1 = null;
			for (@Pc(6) Class1_Sub2 local6 = (Class1_Sub2) this.aClass29_3.method507(); local6 != null; local6 = (Class1_Sub2) this.aClass29_3.method509()) {
				if (local6.anInt770 == arg1 && local6.anInt772 == arg8 && local6.anInt773 == arg4 && local6.anInt771 == arg7) {
					local1 = local6;
					break;
				}
			}
			if (local1 == null) {
				local1 = new Class1_Sub2();
				local1.anInt770 = arg1;
				local1.anInt771 = arg7;
				local1.anInt772 = arg8;
				local1.anInt773 = arg4;
				this.method221(local1);
				this.aClass29_3.method504(local1);
			}
			local1.anInt777 = arg2;
			local1.anInt779 = arg3;
			local1.anInt778 = arg5;
			local1.anInt780 = arg0;
			local1.anInt781 = arg6;
		} catch (@Pc(80) RuntimeException local80) {
			signlink.reporterror("49827, " + -23081 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + local80.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "o", descriptor = "(B)V")
	private void method165(@OriginalArg(0) byte arg0) {
		try {
			for (@Pc(3) int local3 = -1; local3 < this.anInt389; local3++) {
				@Pc(11) int local11;
				if (local3 == -1) {
					local11 = this.anInt388;
				} else {
					local11 = this.anIntArray90[local3];
				}
				@Pc(23) Class1_Sub1_Sub1_Sub1_Sub1 local23 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local11];
				if (local23 != null) {
					this.method199(local23, 1);
				}
			}
			@Pc(40) boolean local40 = false;
		} catch (@Pc(45) RuntimeException local45) {
			signlink.reporterror("82180, " + arg0 + ", " + local45.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "y", descriptor = "(I)V")
	private void method166() {
		try {
			@Pc(14) int local14;
			if (this.anInt409 > 0) {
				for (local14 = 0; local14 < 256; local14++) {
					if (this.anInt409 > 768) {
						this.anIntArray86[local14] = this.method173(this.anIntArray87[local14], this.anIntArray88[local14], 1024 - this.anInt409, 35);
					} else if (this.anInt409 > 256) {
						this.anIntArray86[local14] = this.anIntArray88[local14];
					} else {
						this.anIntArray86[local14] = this.method173(this.anIntArray88[local14], this.anIntArray87[local14], 256 - this.anInt409, 35);
					}
				}
			} else if (this.anInt410 > 0) {
				for (local14 = 0; local14 < 256; local14++) {
					if (this.anInt410 > 768) {
						this.anIntArray86[local14] = this.method173(this.anIntArray87[local14], this.anIntArray89[local14], 1024 - this.anInt410, 35);
					} else if (this.anInt410 > 256) {
						this.anIntArray86[local14] = this.anIntArray89[local14];
					} else {
						this.anIntArray86[local14] = this.method173(this.anIntArray89[local14], this.anIntArray87[local14], 256 - this.anInt410, 35);
					}
				}
			} else {
				for (local14 = 0; local14 < 256; local14++) {
					this.anIntArray86[local14] = this.anIntArray87[local14];
				}
			}
			for (local14 = 0; local14 < 33920; local14++) {
				this.aClass35_22.anIntArray230[local14] = this.aClass1_Sub1_Sub2_Sub2_12.anIntArray207[local14];
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
				local204 = this.anIntArray59[local191] * (256 - local191) / 256;
				local208 = local204 + 22;
				if (local208 < 0) {
					local208 = 0;
				}
				local187 += local208;
				for (local218 = local208; local218 < 128; local218++) {
					local226 = this.anIntArray92[local187++];
					if (local226 == 0) {
						local189++;
					} else {
						local230 = local226;
						local234 = 256 - local226;
						local226 = this.anIntArray86[local226];
						local245 = this.aClass35_22.anIntArray230[local189];
						this.aClass35_22.anIntArray230[local189++] = ((local226 & 0xFF00FF) * local230 + (local245 & 0xFF00FF) * local234 & 0xFF00FF00) + ((local226 & 0xFF00) * local230 + (local245 & 0xFF00) * local234 & 0xFF0000) >> 8;
					}
				}
				local189 += local208;
			}
			this.aClass35_22.method521(0, 0, super.aGraphics2);
			for (local204 = 0; local204 < 33920; local204++) {
				this.aClass35_23.anIntArray230[local204] = this.aClass1_Sub1_Sub2_Sub2_13.anIntArray207[local204];
			}
			local187 = 0;
			local189 = 1176;
			for (local208 = 1; local208 < 255; local208++) {
				local218 = this.anIntArray59[local208] * (256 - local208) / 256;
				local226 = 103 - local218;
				local189 += local218;
				for (local230 = 0; local230 < local226; local230++) {
					local234 = this.anIntArray92[local187++];
					if (local234 == 0) {
						local189++;
					} else {
						local245 = local234;
						@Pc(368) int local368 = 256 - local234;
						local234 = this.anIntArray86[local234];
						@Pc(379) int local379 = this.aClass35_23.anIntArray230[local189];
						this.aClass35_23.anIntArray230[local189++] = ((local234 & 0xFF00FF) * local245 + (local379 & 0xFF00FF) * local368 & 0xFF00FF00) + ((local234 & 0xFF00) * local245 + (local379 & 0xFF00) * local368 & 0xFF0000) >> 8;
					}
				}
				local187 += 128 - local226;
				local189 += 128 - local226 - local218;
			}
			this.aClass35_23.method521(637, 0, super.aGraphics2);
		} catch (@Pc(451) RuntimeException local451) {
			signlink.reporterror("27482, " + 0 + ", " + local451.toString());
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
				return new URL("http://127.0.0.1:" + (anInt393 + 80));
			}
		} catch (@Pc(21) Exception local21) {
		}
		return super.getCodeBase();
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ZI)V")
	private void method167(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1) {
		try {
			if (!arg0) {
				this.anInt362 = this.aClass1_Sub1_Sub3_4.method476();
			}
			signlink.anInt936 = arg1;
		} catch (@Pc(10) RuntimeException local10) {
			signlink.reporterror("41016, " + arg0 + ", " + arg1 + ", " + local10.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIBII)V")
	private void method168(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		try {
			@Pc(8) int local8 = this.aClass37_1.method552(arg4, arg0, arg1);
			@Pc(18) int local18;
			@Pc(24) int local24;
			@Pc(28) int local28;
			@Pc(30) int local30;
			@Pc(52) int local52;
			@Pc(58) int local58;
			if (local8 != 0) {
				local18 = this.aClass37_1.method556(arg4, arg0, arg1, local8);
				local24 = local18 >> 6 & 0x3;
				local28 = local18 & 0x1F;
				local30 = arg2;
				if (local8 > 0) {
					local30 = arg5;
				}
				@Pc(38) int[] local38 = this.aClass1_Sub1_Sub2_Sub2_1.anIntArray207;
				local52 = arg0 * 4 + (103 - arg1) * 512 * 4 + 24624;
				local58 = local8 >> 14 & 0x7FFF;
				@Pc(61) Class9 local61 = Class9.method287(local58);
				if (local61.anInt507 == -1) {
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
					@Pc(71) Class1_Sub1_Sub2_Sub3 local71 = this.aClass1_Sub1_Sub2_Sub3Array3[local61.anInt507];
					if (local71 != null) {
						@Pc(83) int local83 = (local61.anInt502 * 4 - local71.anInt666) / 2;
						@Pc(93) int local93 = (local61.anInt503 * 4 - local71.anInt667) / 2;
						local71.method415((104 - arg1 - local61.anInt503) * 4 + local93 + 48, this.aByte14, arg0 * 4 + local83 + 48);
					}
				}
			}
			local8 = this.aClass37_1.method554(arg4, arg0, arg1);
			if (local8 != 0) {
				local18 = this.aClass37_1.method556(arg4, arg0, arg1, local8);
				local24 = local18 >> 6 & 0x3;
				local28 = local18 & 0x1F;
				local30 = local8 >> 14 & 0x7FFF;
				@Pc(448) Class9 local448 = Class9.method287(local30);
				@Pc(480) int local480;
				if (local448.anInt507 != -1) {
					@Pc(458) Class1_Sub1_Sub2_Sub3 local458 = this.aClass1_Sub1_Sub2_Sub3Array3[local448.anInt507];
					if (local458 != null) {
						local58 = (local448.anInt502 * 4 - local458.anInt666) / 2;
						local480 = (local448.anInt503 * 4 - local458.anInt667) / 2;
						local458.method415((104 - arg1 - local448.anInt503) * 4 + local480 + 48, this.aByte14, arg0 * 4 + local58 + 48);
					}
				} else if (local28 == 9) {
					local52 = 15658734;
					if (local8 > 0) {
						local52 = 15597568;
					}
					@Pc(518) int[] local518 = this.aClass1_Sub1_Sub2_Sub2_1.anIntArray207;
					local480 = arg0 * 4 + (103 - arg1) * 512 * 4 + 24624;
					if (local24 == 0 || local24 == 2) {
						local518[local480 + 1536] = local52;
						local518[local480 + 1024 + 1] = local52;
						local518[local480 + 512 + 2] = local52;
						local518[local480 + 3] = local52;
					} else {
						local518[local480] = local52;
						local518[local480 + 512 + 1] = local52;
						local518[local480 + 1024 + 2] = local52;
						local518[local480 + 1536 + 3] = local52;
					}
				}
			}
			local8 = this.aClass37_1.method555(arg4, arg0, arg1);
			@Pc(607) boolean local607 = false;
			if (local8 != 0) {
				local18 = local8 >> 14 & 0x7FFF;
				@Pc(628) Class9 local628 = Class9.method287(local18);
				if (local628.anInt507 != -1) {
					@Pc(638) Class1_Sub1_Sub2_Sub3 local638 = this.aClass1_Sub1_Sub2_Sub3Array3[local628.anInt507];
					if (local638 != null) {
						local30 = (local628.anInt502 * 4 - local638.anInt666) / 2;
						@Pc(660) int local660 = (local628.anInt503 * 4 - local638.anInt667) / 2;
						local638.method415((104 - arg1 - local628.anInt503) * 4 + local660 + 48, this.aByte14, arg0 * 4 + local30 + 48);
						return;
					}
				}
			}
		} catch (@Pc(685) RuntimeException local685) {
			signlink.reporterror("97581, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local685.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "z", descriptor = "(I)V")
	private void method169(@OriginalArg(0) int arg0) {
		try {
			if (this.aClass35_19 == null) {
				super.aClass35_2 = null;
				this.aClass35_18 = null;
				this.aClass35_16 = null;
				this.aClass35_15 = null;
				this.aClass35_17 = null;
				this.aClass35_3 = null;
				this.aClass35_4 = null;
				this.aClass35_5 = null;
				this.aClass35_22 = new Class35(this.method93(), 128, 265, 2);
				@Pc(42) boolean local42 = false;
				Class1_Sub1_Sub2.method434();
				this.aClass35_23 = new Class35(this.method93(), 128, 265, 2);
				Class1_Sub1_Sub2.method434();
				this.aClass35_19 = new Class35(this.method93(), 509, 171, 2);
				Class1_Sub1_Sub2.method434();
				this.aClass35_20 = new Class35(this.method93(), 360, 132, 2);
				Class1_Sub1_Sub2.method434();
				this.aClass35_21 = new Class35(this.method93(), 360, 200, 2);
				Class1_Sub1_Sub2.method434();
				this.aClass35_24 = new Class35(this.method93(), 202, 238, 2);
				Class1_Sub1_Sub2.method434();
				this.aClass35_25 = new Class35(this.method93(), 203, 238, 2);
				Class1_Sub1_Sub2.method434();
				this.aClass35_26 = new Class35(this.method93(), 74, 94, 2);
				Class1_Sub1_Sub2.method434();
				this.aClass35_27 = new Class35(this.method93(), 75, 94, 2);
				Class1_Sub1_Sub2.method434();
				if (this.aClass47_1 != null) {
					this.method150();
					this.method130();
				}
				this.aBoolean63 = true;
			}
		} catch (@Pc(162) RuntimeException local162) {
			signlink.reporterror("94767, " + arg0 + ", " + local162.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!d;I)Z")
	private boolean method170(@OriginalArg(0) Class6 arg0) {
		try {
			if (arg0.anIntArray96 == null) {
				return false;
			}
			for (@Pc(12) int local12 = 0; local12 < arg0.anIntArray96.length; local12++) {
				@Pc(21) int local21 = this.method176(local12, this.aByte9, arg0);
				@Pc(26) int local26 = arg0.anIntArray97[local12];
				if (arg0.anIntArray96[local12] == 2) {
					if (local21 >= local26) {
						return false;
					}
				} else if (arg0.anIntArray96[local12] == 3) {
					if (local21 <= local26) {
						return false;
					}
				} else if (arg0.anIntArray96[local12] == 4) {
					if (local21 == local26) {
						return false;
					}
				} else if (local21 != local26) {
					return false;
				}
			}
			return true;
		} catch (@Pc(73) RuntimeException local73) {
			signlink.reporterror("20821, " + arg0 + ", " + 0 + ", " + local73.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "A", descriptor = "(I)V")
	private void method171(@OriginalArg(0) int arg0) {
		try {
			@Pc(7) int local7 = this.aClass1_Sub1_Sub2_Sub4_3.method445("Choose Option");
			@Pc(20) int local20;
			for (@Pc(9) int local9 = 0; local9 < this.anInt275; local9++) {
				local20 = this.aClass1_Sub1_Sub2_Sub4_3.method445(this.aStringArray1[local9]);
				if (local20 > local7) {
					local7 = local20;
				}
			}
			local7 += 8;
			if (arg0 != 0) {
				this.aBoolean73 = !this.aBoolean73;
			}
			local20 = this.anInt275 * 15 + 21;
			@Pc(73) int local73;
			@Pc(91) int local91;
			if (super.anInt192 > 4 && super.anInt193 > 4 && super.anInt192 < 516 && super.anInt193 < 338) {
				local73 = super.anInt192 - local7 / 2 - 4;
				if (local73 + local7 > 512) {
					local73 = 512 - local7;
				}
				if (local73 < 0) {
					local73 = 0;
				}
				local91 = super.anInt193 - 4;
				if (local91 + local20 > 334) {
					local91 = 334 - local20;
				}
				if (local91 < 0) {
					local91 = 0;
				}
				this.aBoolean68 = true;
				this.anInt305 = 0;
				this.anInt306 = local73;
				this.anInt307 = local91;
				this.anInt308 = local7;
				this.anInt309 = this.anInt275 * 15 + 22;
			}
			if (super.anInt192 > 553 && super.anInt193 > 205 && super.anInt192 < 743 && super.anInt193 < 466) {
				local73 = super.anInt192 - local7 / 2 - 553;
				if (local73 < 0) {
					local73 = 0;
				} else if (local73 + local7 > 190) {
					local73 = 190 - local7;
				}
				local91 = super.anInt193 - 205;
				if (local91 < 0) {
					local91 = 0;
				} else if (local91 + local20 > 261) {
					local91 = 261 - local20;
				}
				this.aBoolean68 = true;
				this.anInt305 = 1;
				this.anInt306 = local73;
				this.anInt307 = local91;
				this.anInt308 = local7;
				this.anInt309 = this.anInt275 * 15 + 22;
			}
			if (super.anInt192 > 17 && super.anInt193 > 357 && super.anInt192 < 496 && super.anInt193 < 453) {
				local73 = super.anInt192 - local7 / 2 - 17;
				if (local73 < 0) {
					local73 = 0;
				} else if (local73 + local7 > 479) {
					local73 = 479 - local7;
				}
				local91 = super.anInt193 - 357;
				if (local91 < 0) {
					local91 = 0;
				} else if (local91 + local20 > 96) {
					local91 = 96 - local20;
				}
				this.aBoolean68 = true;
				this.anInt305 = 2;
				this.anInt306 = local73;
				this.anInt307 = local91;
				this.anInt308 = local7;
				this.anInt309 = this.anInt275 * 15 + 22;
			}
		} catch (@Pc(295) RuntimeException local295) {
			signlink.reporterror("90690, " + arg0 + ", " + local295.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILclient!lb;I)V")
	private void method172(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub1_Sub3 arg1) {
		try {
			while (true) {
				if (arg1.anInt735 + 10 < arg0 * 8) {
					@Pc(12) int local12 = arg1.method487(11);
					if (local12 != 2047) {
						if (this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local12] == null) {
							this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local12] = new Class1_Sub1_Sub1_Sub1_Sub1();
							if (this.aClass1_Sub1_Sub3Array1[local12] != null) {
								this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local12].method39(this.aClass1_Sub1_Sub3Array1[local12]);
							}
						}
						this.anIntArray90[this.anInt389++] = local12;
						@Pc(58) Class1_Sub1_Sub1_Sub1_Sub1 local58 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local12];
						local58.anInt1020 = anInt396;
						@Pc(66) int local66 = arg1.method487(5);
						if (local66 > 15) {
							local66 -= 32;
						}
						@Pc(75) int local75 = arg1.method487(5);
						if (local75 > 15) {
							local75 -= 32;
						}
						@Pc(84) int local84 = arg1.method487(1);
						local58.method673(aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray271[0] + local66, local84 == 1, aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray272[0] + local75, this.aByte4);
						@Pc(111) int local111 = arg1.method487(1);
						if (local111 == 1) {
							this.anIntArray91[this.anInt390++] = local12;
						}
						continue;
					}
				}
				arg1.method488();
				return;
			}
		} catch (@Pc(136) RuntimeException local136) {
			signlink.reporterror("29713, " + arg0 + ", " + arg1 + ", " + 0 + ", " + local136.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIII)I")
	private int method173(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		try {
			@Pc(3) boolean local3 = true;
			@Pc(7) int local7 = 256 - arg2;
			return ((arg0 & 0xFF00FF) * local7 + (arg1 & 0xFF00FF) * arg2 & 0xFF00FF00) + ((arg0 & 0xFF00) * local7 + (arg1 & 0xFF00) * arg2 & 0xFF0000) >> 8;
		} catch (@Pc(38) RuntimeException local38) {
			signlink.reporterror("66303, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local38.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(II)V")
	private void method174(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(9) Class29 local9 = this.aClass29ArrayArrayArray1[this.anInt356][arg0][arg1];
		if (local9 == null) {
			this.aClass37_1.method547(this.anInt356, arg0, arg1);
			return;
		}
		@Pc(21) int local21 = -99999999;
		@Pc(23) Class1_Sub1_Sub1_Sub3 local23 = null;
		@Pc(27) Class1_Sub1_Sub1_Sub3 local27;
		for (local27 = (Class1_Sub1_Sub1_Sub3) local9.method507(); local27 != null; local27 = (Class1_Sub1_Sub1_Sub3) local9.method509()) {
			@Pc(32) Class15 local32 = Class15.method358(local27.anInt171);
			@Pc(35) int local35 = local32.anInt604;
			if (local32.aBoolean160) {
				local35 *= local27.anInt172 + 1;
			}
			if (local35 > local21) {
				local21 = local35;
				local23 = local27;
			}
		}
		local9.method505(local23);
		@Pc(65) Class1_Sub1_Sub1_Sub3 local65 = null;
		@Pc(67) Class1_Sub1_Sub1_Sub3 local67 = null;
		for (local27 = (Class1_Sub1_Sub1_Sub3) local9.method507(); local27 != null; local27 = (Class1_Sub1_Sub1_Sub3) local9.method509()) {
			if (local27.anInt171 != local23.anInt171 && local65 == null) {
				local65 = local27;
			}
			if (local27.anInt171 != local23.anInt171 && local27.anInt171 != local65.anInt171 && local67 == null) {
				local67 = local27;
			}
		}
		@Pc(110) int local110 = arg0 + (arg1 << 7) + 1610612736;
		this.aClass37_1.method533(arg1, local110, local65, arg0, local67, this.anInt356, this.method133(arg1 * 128 + 64, arg0 * 128 + 64, this.anInt356), local23);
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(Z)V")
	private void method175() {
		try {
			while (true) {
				@Pc(12) Class1_Sub1_Sub4 local12 = this.aClass44_Sub1_1.method643();
				if (local12 == null) {
					return;
				}
				if (local12.anInt761 == 0) {
					Class1_Sub1_Sub1_Sub5.method258(local12.aByteArray10, local12.anInt762);
					if ((this.aClass44_Sub1_1.method639(local12.anInt762) & 0x62) != 0) {
						this.aBoolean61 = true;
						if (this.anInt408 != -1) {
							this.aBoolean74 = true;
						}
					}
				}
				if (local12.anInt761 == 1 && local12.aByteArray10 != null) {
					Class12.method301(local12.aByteArray10);
				}
				if (local12.anInt761 == 2 && local12.anInt762 == this.anInt376 && local12.aByteArray10 != null) {
					this.method115(local12.aByteArray10, this.aBoolean87);
				}
				if (local12.anInt761 == 3 && this.anInt229 == 1) {
					for (@Pc(83) int local83 = 0; local83 < this.aByteArrayArray2.length; local83++) {
						if (this.anIntArray65[local83] == local12.anInt762) {
							this.aByteArrayArray2[local83] = local12.aByteArray10;
							if (local12.aByteArray10 == null) {
								this.anIntArray65[local83] = -1;
							}
							break;
						}
						if (this.anIntArray66[local83] == local12.anInt762) {
							this.aByteArrayArray1[local83] = local12.aByteArray10;
							if (local12.aByteArray10 == null) {
								this.anIntArray66[local83] = -1;
							}
							break;
						}
					}
				}
				if (local12.anInt761 == 93 && this.aClass44_Sub1_1.method638(local12.anInt762, this.anInt216)) {
					Class4.method58(this.aClass44_Sub1_1, new Class1_Sub1_Sub3(local12.aByteArray10, 15787), this.anInt402);
				}
			}
		} catch (@Pc(162) RuntimeException local162) {
			signlink.reporterror("44515, " + false + ", " + local162.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IBLclient!d;)I")
	private int method176(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) Class6 arg2) {
		try {
			if (arg1 != this.aByte3) {
				this.aClass1_Sub1_Sub3_3.method466(14);
			}
			if (arg2.anIntArrayArray7 == null || arg0 >= arg2.anIntArrayArray7.length) {
				return -2;
			}
			try {
				@Pc(24) int[] local24 = arg2.anIntArrayArray7[arg0];
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
						local37 = this.anIntArray63[local24[local28++]];
					}
					if (local35 == 2) {
						local37 = this.anIntArray71[local24[local28++]];
					}
					if (local35 == 3) {
						local37 = this.anIntArray40[local24[local28++]];
					}
					@Pc(86) Class6 local86;
					@Pc(91) int local91;
					@Pc(104) int local104;
					if (local35 == 4) {
						local86 = Class6.aClass6Array1[local24[local28++]];
						local91 = local24[local28++];
						if (local91 >= 0 && local91 < Class15.anInt593 && (!Class15.method358(local91).aBoolean161 || aBoolean89)) {
							for (local104 = 0; local104 < local86.anIntArray94.length; local104++) {
								if (local86.anIntArray94[local104] == local91 + 1) {
									local37 += local86.anIntArray95[local104];
								}
							}
						}
					}
					if (local35 == 5) {
						local37 = this.anIntArray85[local24[local28++]];
					}
					if (local35 == 6) {
						local37 = anIntArray53[this.anIntArray71[local24[local28++]] - 1];
					}
					if (local35 == 7) {
						local37 = this.anIntArray85[local24[local28++]] * 100 / 46875;
					}
					if (local35 == 8) {
						local37 = aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt125;
					}
					@Pc(179) int local179;
					if (local35 == 9) {
						for (local179 = 0; local179 < Class30.anInt801; local179++) {
							if (Class30.aBooleanArray9[local179]) {
								local37 += this.anIntArray71[local179];
							}
						}
					}
					if (local35 == 10) {
						local86 = Class6.aClass6Array1[local24[local28++]];
						local91 = local24[local28++] + 1;
						if (local91 >= 0 && local91 < Class15.anInt593 && (!Class15.method358(local91).aBoolean161 || aBoolean89)) {
							for (local104 = 0; local104 < local86.anIntArray94.length; local104++) {
								if (local86.anIntArray94[local104] == local91) {
									local37 = 999999999;
									break;
								}
							}
						}
					}
					if (local35 == 11) {
						local37 = this.anInt253;
					}
					if (local35 == 12) {
						local37 = this.anInt381;
					}
					if (local35 == 13) {
						local179 = this.anIntArray85[local24[local28++]];
						local91 = local24[local28++];
						local37 = (local179 & 0x1 << local91) == 0 ? 0 : 1;
					}
					if (local35 == 14) {
						local179 = local24[local28++];
						@Pc(294) Class36 local294 = Class36.aClass36Array1[local179];
						local104 = local294.anInt835;
						@Pc(300) int local300 = local294.anInt836;
						@Pc(303) int local303 = local294.anInt837;
						@Pc(309) int local309 = anIntArray70[local303 - local300];
						local37 = this.anIntArray85[local104] >> local300 & local309;
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
						local37 = (aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt980 >> 7) + this.anInt370;
					}
					if (local35 == 19) {
						local37 = (aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt981 >> 7) + this.anInt371;
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
			signlink.reporterror("71115, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local405.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IJ)V")
	private void method177(@OriginalArg(1) long arg0) {
		try {
			if (arg0 != 0L) {
				if (this.anInt338 >= 100 && this.anInt329 != 1) {
					this.method99(0, "Your friendlist is full. Max of 100 for free users, and 200 for members", "");
				} else if (this.anInt338 >= 200) {
					this.method99(0, "Your friendlist is full. Max of 100 for free users, and 200 for members", "");
				} else {
					@Pc(38) String local38 = Class48.method667(Class48.method664(arg0));
					for (@Pc(40) int local40 = 0; local40 < this.anInt338; local40++) {
						if (this.aLongArray3[local40] == arg0) {
							this.method99(0, local38 + " is already on your friend list", "");
							return;
						}
					}
					for (@Pc(70) int local70 = 0; local70 < this.anInt264; local70++) {
						if (this.aLongArray4[local70] == arg0) {
							this.method99(0, "Please remove " + local38 + " from your ignore list first", "");
							return;
						}
					}
					if (!local38.equals(aClass1_Sub1_Sub1_Sub1_Sub1_1.aString3)) {
						this.aStringArray5[this.anInt338] = local38;
						this.aLongArray3[this.anInt338] = arg0;
						this.anIntArray43[this.anInt338] = 0;
						this.anInt338++;
						this.aBoolean61 = true;
						this.aClass1_Sub1_Sub3_3.method465(235);
						this.aClass1_Sub1_Sub3_3.method472(arg0);
					}
				}
			}
		} catch (@Pc(153) RuntimeException local153) {
			signlink.reporterror("60470, " + 0 + ", " + arg0 + ", " + local153.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;Z)V")
	private void method178(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) boolean arg2) {
		signlink.errorname = arg0;
		try {
			if (!arg2) {
				this.aString15 = "";
				this.aString16 = "Connecting to server...";
				this.method148(true);
			}
			this.aClass8_1 = new Class8(this.method116(anInt393 + 43594), 32596, this);
			@Pc(30) long local30 = Class48.method663(arg0);
			@Pc(37) int local37 = (int) (local30 >> 16 & 0x1FL);
			this.aClass1_Sub1_Sub3_3.anInt734 = 0;
			this.aClass1_Sub1_Sub3_3.method466(14);
			this.aClass1_Sub1_Sub3_3.method466(local37);
			this.aClass8_1.method250(this.aClass1_Sub1_Sub3_3.aByteArray9, 2);
			for (@Pc(60) int local60 = 0; local60 < 8; local60++) {
				this.aClass8_1.method247();
			}
			@Pc(74) int local74 = this.aClass8_1.method247();
			@Pc(223) int local223;
			@Pc(257) int local257;
			if (local74 == 0) {
				this.aClass8_1.method249(this.aClass1_Sub1_Sub3_4.aByteArray9, 0, 8);
				this.aClass1_Sub1_Sub3_4.anInt734 = 0;
				this.aLong14 = this.aClass1_Sub1_Sub3_4.method482();
				@Pc(97) int[] local97 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (this.aLong14 >> 32), (int) this.aLong14 };
				this.aClass1_Sub1_Sub3_3.anInt734 = 0;
				this.aClass1_Sub1_Sub3_3.method466(10);
				this.aClass1_Sub1_Sub3_3.method470(local97[0]);
				this.aClass1_Sub1_Sub3_3.method470(local97[1]);
				this.aClass1_Sub1_Sub3_3.method470(local97[2]);
				this.aClass1_Sub1_Sub3_3.method470(local97[3]);
				this.aClass1_Sub1_Sub3_3.method470(signlink.anInt928);
				this.aClass1_Sub1_Sub3_3.method473(arg0);
				this.aClass1_Sub1_Sub3_3.method473(arg1);
				this.aClass1_Sub1_Sub3_3.method491(aBigInteger2, aBigInteger1);
				this.aClass1_Sub1_Sub3_2.anInt734 = 0;
				if (arg2) {
					this.aClass1_Sub1_Sub3_2.method466(18);
				} else {
					this.aClass1_Sub1_Sub3_2.method466(16);
				}
				this.aClass1_Sub1_Sub3_2.method466(this.aClass1_Sub1_Sub3_3.anInt734 + 36 + 1 + 1 + 2);
				this.aClass1_Sub1_Sub3_2.method466(255);
				this.aClass1_Sub1_Sub3_2.method467(289);
				this.aClass1_Sub1_Sub3_2.method466(aBoolean90 ? 1 : 0);
				for (local223 = 0; local223 < 9; local223++) {
					this.aClass1_Sub1_Sub3_2.method470(this.anIntArray68[local223]);
				}
				this.aClass1_Sub1_Sub3_2.method474(this.aClass1_Sub1_Sub3_3.aByteArray9, this.aClass1_Sub1_Sub3_3.anInt734);
				this.aClass1_Sub1_Sub3_3.aClass46_2 = new Class46(local97, (byte) -23);
				for (local257 = 0; local257 < 4; local257++) {
					local97[local257] += 50;
				}
				this.aClass46_1 = new Class46(local97, (byte) -23);
				this.aClass8_1.method250(this.aClass1_Sub1_Sub3_2.aByteArray9, this.aClass1_Sub1_Sub3_2.anInt734);
				local74 = this.aClass8_1.method247();
			}
			if (local74 == 1) {
				try {
					Thread.sleep(2000L);
				} catch (@Pc(299) Exception local299) {
				}
				this.method178(arg0, arg1, arg2);
			} else {
				@Pc(387) int local387;
				if (local74 == 2) {
					this.anInt374 = this.aClass8_1.method247();
					aBoolean67 = this.aClass8_1.method247() == 1;
					this.aLong18 = 0L;
					this.anInt200 = 0;
					this.aClass11_1.anInt529 = 0;
					super.aBoolean51 = true;
					this.aBoolean65 = true;
					this.aBoolean57 = true;
					this.aClass1_Sub1_Sub3_3.anInt734 = 0;
					this.aClass1_Sub1_Sub3_4.anInt734 = 0;
					this.anInt362 = -1;
					this.anInt318 = -1;
					this.anInt319 = -1;
					this.anInt320 = -1;
					this.anInt361 = 0;
					this.anInt363 = 0;
					this.anInt290 = 0;
					this.anInt365 = 0;
					this.anInt293 = 0;
					this.anInt275 = 0;
					this.aBoolean68 = false;
					super.anInt184 = 0;
					for (local387 = 0; local387 < 100; local387++) {
						this.aStringArray4[local387] = null;
					}
					this.anInt260 = 0;
					this.anInt287 = 0;
					this.anInt229 = 0;
					this.anInt272 = 0;
					this.anInt295 = (int) (Math.random() * 100.0D) - 50;
					this.anInt384 = (int) (Math.random() * 110.0D) - 55;
					this.anInt340 = (int) (Math.random() * 80.0D) - 40;
					this.anInt266 = (int) (Math.random() * 120.0D) - 60;
					this.anInt322 = (int) (Math.random() * 30.0D) - 20;
					this.anInt249 = (int) (Math.random() * 20.0D) - 10 & 0x7FF;
					this.anInt215 = 0;
					this.anInt314 = -1;
					this.anInt241 = 0;
					this.anInt242 = 0;
					this.anInt389 = 0;
					this.anInt294 = 0;
					for (local223 = 0; local223 < this.anInt387; local223++) {
						this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local223] = null;
						this.aClass1_Sub1_Sub3Array1[local223] = null;
					}
					for (local257 = 0; local257 < 16384; local257++) {
						this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local257] = null;
					}
					aClass1_Sub1_Sub1_Sub1_Sub1_1 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[this.anInt388] = new Class1_Sub1_Sub1_Sub1_Sub1();
					this.aClass29_1.method511();
					this.aClass29_2.method511();
					@Pc(532) int local532;
					@Pc(536) int local536;
					for (@Pc(528) int local528 = 0; local528 < 4; local528++) {
						for (local532 = 0; local532 < 104; local532++) {
							for (local536 = 0; local536 < 104; local536++) {
								this.aClass29ArrayArrayArray1[local528][local532][local536] = null;
							}
						}
					}
					this.aClass29_3 = new Class29(-199);
					this.anInt339 = 0;
					this.anInt338 = 0;
					this.anInt271 = -1;
					this.anInt408 = -1;
					this.anInt377 = -1;
					this.anInt232 = -1;
					this.anInt246 = -1;
					this.aBoolean66 = false;
					this.anInt302 = 3;
					this.aBoolean70 = false;
					this.aBoolean68 = false;
					this.aBoolean88 = false;
					this.aString4 = null;
					this.anInt342 = 0;
					this.anInt207 = -1;
					this.aBoolean86 = true;
					this.method152(this.aByte2);
					for (local532 = 0; local532 < 5; local532++) {
						this.anIntArray48[local532] = 0;
					}
					for (local536 = 0; local536 < 5; local536++) {
						this.aStringArray2[local536] = null;
						this.aBooleanArray3[local536] = false;
					}
					anInt394 = 0;
					anInt369 = 0;
					anInt281 = 0;
					anInt220 = 0;
					anInt201 = 0;
					anInt411 = 0;
					anInt343 = 0;
					anInt312 = 0;
					anInt336 = 0;
					this.method142();
				} else if (local74 == 3) {
					this.aString15 = "";
					this.aString16 = "Invalid username or password.";
				} else if (local74 == 4) {
					this.aString15 = "Your account has been disabled.";
					this.aString16 = "Please check your message-centre for details.";
				} else if (local74 == 5) {
					this.aString15 = "Your account is already logged in.";
					this.aString16 = "Try again in 60 secs...";
				} else if (local74 == 6) {
					this.aString15 = "RuneScape has been updated!";
					this.aString16 = "Please reload this page.";
				} else if (local74 == 7) {
					this.aString15 = "This world is full.";
					this.aString16 = "Please use a different world.";
				} else if (local74 == 8) {
					this.aString15 = "Unable to connect.";
					this.aString16 = "Login server offline.";
				} else if (local74 == 9) {
					this.aString15 = "Login limit exceeded.";
					this.aString16 = "Too many connections from your address.";
				} else if (local74 == 10) {
					this.aString15 = "Unable to connect.";
					this.aString16 = "Bad session id.";
				} else if (local74 == 11) {
					this.aString16 = "Login server rejected session.";
					this.aString16 = "Please try again.";
				} else if (local74 == 12) {
					this.aString15 = "You need a members account to login to this world.";
					this.aString16 = "Please subscribe, or use a different world.";
				} else if (local74 == 13) {
					this.aString15 = "Could not complete login.";
					this.aString16 = "Please try using a different world.";
				} else if (local74 == 14) {
					this.aString15 = "The server is being updated.";
					this.aString16 = "Please wait 1 minute and try again.";
				} else if (local74 == 15) {
					this.aBoolean57 = true;
					this.aClass1_Sub1_Sub3_3.anInt734 = 0;
					this.aClass1_Sub1_Sub3_4.anInt734 = 0;
					this.anInt362 = -1;
					this.anInt318 = -1;
					this.anInt319 = -1;
					this.anInt320 = -1;
					this.anInt361 = 0;
					this.anInt363 = 0;
					this.anInt290 = 0;
					this.anInt275 = 0;
					this.aBoolean68 = false;
					this.aLong17 = System.currentTimeMillis();
				} else if (local74 == 16) {
					this.aString15 = "Login attempts exceeded.";
					this.aString16 = "Please wait 1 minute and try again.";
				} else if (local74 == 17) {
					this.aString15 = "You are standing in a members-only area.";
					this.aString16 = "To play on this world move to a free area first";
				} else if (local74 == 20) {
					this.aString15 = "Invalid loginserver requested";
					this.aString16 = "Please try using a different world.";
				} else if (local74 == 21) {
					for (local387 = this.aClass8_1.method247(); local387 >= 0; local387--) {
						this.aString15 = "You have only just left another world";
						this.aString16 = "Your profile will be transferred in: " + local387 + " seconds";
						this.method148(true);
						try {
							Thread.sleep(1000L);
						} catch (@Pc(898) Exception local898) {
						}
					}
					this.method178(arg0, arg1, arg2);
				} else if (local74 == -1) {
					this.aString15 = "No response from server";
					this.aString16 = "Please try using a different world.";
				} else {
					System.out.println("response:" + local74);
					this.aString15 = "Unexpected server response";
					this.aString16 = "Please try using a different world.";
				}
			}
		} catch (@Pc(934) IOException local934) {
			this.aString15 = "";
			this.aString16 = "Error connecting to server.";
		}
	}

	@OriginalMember(owner = "client!client", name = "p", descriptor = "(B)V")
	private void method179() {
		try {
			@Pc(19) int local19;
			@Pc(26) int local26;
			if (this.anInt297 == 0) {
				local19 = super.anInt182 / 2 - 80;
				local26 = super.anInt183 / 2 + 20;
				local26 += 20;
				if (super.anInt191 == 1 && super.anInt192 >= local19 - 75 && super.anInt192 <= local19 + 75 && super.anInt193 >= local26 - 20 && super.anInt193 <= local26 + 20) {
					this.anInt297 = 3;
					this.anInt205 = 0;
				}
				local19 = super.anInt182 / 2 + 80;
				if (super.anInt191 == 1 && super.anInt192 >= local19 - 75 && super.anInt192 <= local19 + 75 && super.anInt193 >= local26 - 20 && super.anInt193 <= local26 + 20) {
					this.aString15 = "";
					this.aString16 = "Enter your username & password.";
					this.anInt297 = 2;
					this.anInt205 = 0;
				}
			} else if (this.anInt297 == 2) {
				local19 = super.anInt183 / 2 - 40;
				local19 += 30;
				local19 += 25;
				if (super.anInt191 == 1 && super.anInt193 >= local19 - 15 && super.anInt193 < local19) {
					this.anInt205 = 0;
				}
				local19 += 15;
				if (super.anInt191 == 1 && super.anInt193 >= local19 - 15 && super.anInt193 < local19) {
					this.anInt205 = 1;
				}
				local19 += 15;
				local26 = super.anInt182 / 2 - 80;
				@Pc(172) int local172 = super.anInt183 / 2 + 50;
				@Pc(173) int local173 = local172 + 20;
				if (super.anInt191 == 1 && super.anInt192 >= local26 - 75 && super.anInt192 <= local26 + 75 && super.anInt193 >= local173 - 20 && super.anInt193 <= local173 + 20) {
					this.method178(this.aString11, this.aString12, false);
					if (this.aBoolean57) {
						return;
					}
				}
				local26 = super.anInt182 / 2 + 80;
				if (super.anInt191 == 1 && super.anInt192 >= local26 - 75 && super.anInt192 <= local26 + 75 && super.anInt193 >= local173 - 20 && super.anInt193 <= local173 + 20) {
					this.anInt297 = 0;
					this.aString11 = "";
					this.aString12 = "";
				}
				while (true) {
					while (true) {
						@Pc(260) int local260 = this.method87();
						if (local260 == -1) {
							return;
						}
						@Pc(265) boolean local265 = false;
						for (@Pc(267) int local267 = 0; local267 < aString8.length(); local267++) {
							if (local260 == aString8.charAt(local267)) {
								local265 = true;
								break;
							}
						}
						if (this.anInt205 == 0) {
							if (local260 == 8 && this.aString11.length() > 0) {
								this.aString11 = this.aString11.substring(0, this.aString11.length() - 1);
							}
							if (local260 == 9 || local260 == 10 || local260 == 13) {
								this.anInt205 = 1;
							}
							if (local265) {
								this.aString11 = this.aString11 + (char) local260;
							}
							if (this.aString11.length() > 12) {
								this.aString11 = this.aString11.substring(0, 12);
							}
						} else if (this.anInt205 == 1) {
							if (local260 == 8 && this.aString12.length() > 0) {
								this.aString12 = this.aString12.substring(0, this.aString12.length() - 1);
							}
							if (local260 == 9 || local260 == 10 || local260 == 13) {
								this.anInt205 = 0;
							}
							if (local265) {
								this.aString12 = this.aString12 + (char) local260;
							}
							if (this.aString12.length() > 20) {
								this.aString12 = this.aString12.substring(0, 20);
							}
						}
					}
				}
			} else if (this.anInt297 == 3) {
				local19 = super.anInt182 / 2;
				local26 = super.anInt183 / 2 + 50;
				@Pc(424) int local424 = local26 + 20;
				if (super.anInt191 == 1 && super.anInt192 >= local19 - 75 && super.anInt192 <= local19 + 75 && super.anInt193 >= local424 - 20 && super.anInt193 <= local424 + 20) {
					this.anInt297 = 0;
					return;
				}
			}
		} catch (@Pc(457) RuntimeException local457) {
			signlink.reporterror("36554, " + 122 + ", " + local457.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "q", descriptor = "(B)V")
	private void method181() {
		try {
			if (this.anInt365 > 0) {
				this.method104();
			} else {
				this.aClass35_17.method520();
				this.aClass1_Sub1_Sub2_Sub4_2.method443(257, "Connection lost", 0, 144);
				this.aClass1_Sub1_Sub2_Sub4_2.method443(256, "Connection lost", 16777215, 143);
				this.aClass1_Sub1_Sub2_Sub4_2.method443(257, "Please wait - attempting to reestablish", 0, 159);
				this.aClass1_Sub1_Sub2_Sub4_2.method443(256, "Please wait - attempting to reestablish", 16777215, 158);
				this.aClass35_17.method521(4, 4, super.aGraphics2);
				this.anInt215 = 0;
				this.anInt241 = 0;
				@Pc(63) Class8 local63 = this.aClass8_1;
				this.aBoolean57 = false;
				this.method178(this.aString11, this.aString12, true);
				if (!this.aBoolean57) {
					this.method104();
				}
				try {
					local63.method246();
				} catch (@Pc(83) Exception local83) {
				}
			}
		} catch (@Pc(85) RuntimeException local85) {
			signlink.reporterror("96492, " + 7 + ", " + local85.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "B", descriptor = "(I)V")
	private void method183() {
		try {
			for (@Pc(9) Class1_Sub2 local9 = (Class1_Sub2) this.aClass29_3.method507(); local9 != null; local9 = (Class1_Sub2) this.aClass29_3.method509()) {
				if (local9.anInt781 == -1) {
					local9.anInt780 = 0;
					this.method221(local9);
				} else {
					local9.method669();
				}
			}
		} catch (@Pc(36) RuntimeException local36) {
			signlink.reporterror("43758, " + -922 + ", " + local36.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "C", descriptor = "(I)Ljava/lang/String;")
	private String method184() {
		try {
			if (signlink.mainapp == null) {
				return super.aFrame_Sub1_2 == null ? super.getDocumentBase().getHost().toLowerCase() : "runescape.com";
			} else {
				return signlink.mainapp.getDocumentBase().getHost().toLowerCase();
			}
		} catch (@Pc(27) RuntimeException local27) {
			signlink.reporterror("16537, " + 974 + ", " + local27.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(ILclient!lb;I)V")
	private void method185(@OriginalArg(1) Class1_Sub1_Sub3 arg0, @OriginalArg(2) int arg1) {
		try {
			@Pc(11) int local11 = arg0.method487(8);
			@Pc(17) int local17;
			if (local11 < this.anInt389) {
				for (local17 = local11; local17 < this.anInt389; local17++) {
					this.anIntArray49[this.anInt254++] = this.anIntArray90[local17];
				}
			}
			if (local11 > this.anInt389) {
				signlink.reporterror(this.aString11 + " Too many players");
				throw new RuntimeException("eek");
			}
			this.anInt389 = 0;
			for (local17 = 0; local17 < local11; local17++) {
				@Pc(69) int local69 = this.anIntArray90[local17];
				@Pc(74) Class1_Sub1_Sub1_Sub1_Sub1 local74 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local69];
				@Pc(79) int local79 = arg0.method487(1);
				if (local79 == 0) {
					this.anIntArray90[this.anInt389++] = local69;
					local74.anInt1020 = anInt396;
				} else {
					@Pc(102) int local102 = arg0.method487(2);
					if (local102 == 0) {
						this.anIntArray90[this.anInt389++] = local69;
						local74.anInt1020 = anInt396;
						this.anIntArray91[this.anInt390++] = local69;
					} else {
						@Pc(153) int local153;
						@Pc(164) int local164;
						if (local102 == 1) {
							this.anIntArray90[this.anInt389++] = local69;
							local74.anInt1020 = anInt396;
							local153 = arg0.method487(3);
							local74.method674(false, local153, this.anInt355);
							local164 = arg0.method487(1);
							if (local164 == 1) {
								this.anIntArray91[this.anInt390++] = local69;
							}
						} else if (local102 == 2) {
							this.anIntArray90[this.anInt389++] = local69;
							local74.anInt1020 = anInt396;
							local153 = arg0.method487(3);
							local74.method674(true, local153, this.anInt355);
							local164 = arg0.method487(3);
							local74.method674(true, local164, this.anInt355);
							@Pc(224) int local224 = arg0.method487(1);
							if (local224 == 1) {
								this.anIntArray91[this.anInt390++] = local69;
							}
						} else if (local102 == 3) {
							this.anIntArray49[this.anInt254++] = local69;
						}
					}
				}
			}
		} catch (@Pc(261) RuntimeException local261) {
			signlink.reporterror("48001, " + -752 + ", " + arg0 + ", " + arg1 + ", " + local261.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(II)V")
	private void method186(@OriginalArg(0) int arg0) {
		try {
			@Pc(9) Class6 local9 = Class6.aClass6Array1[arg0];
			for (@Pc(11) int local11 = 0; local11 < local9.anIntArray98.length && local9.anIntArray98[local11] != -1; local11++) {
				@Pc(26) Class6 local26 = Class6.aClass6Array1[local9.anIntArray98[local11]];
				if (local26.anInt417 == 1) {
					this.method186(local26.anInt415);
				}
				local26.anInt413 = 0;
				local26.anInt414 = 0;
			}
		} catch (@Pc(49) RuntimeException local49) {
			signlink.reporterror("3125, " + arg0 + ", " + -44196 + ", " + local49.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ZILclient!lb;)V")
	private void method187(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub1_Sub3 arg1) {
		try {
			this.anInt254 = 0;
			this.anInt390 = 0;
			this.method226(arg0, arg1, this.anInt379);
			this.method124(arg0, arg1);
			this.method222(arg1, arg0);
			@Pc(38) int local38;
			for (@Pc(31) int local31 = 0; local31 < this.anInt254; local31++) {
				local38 = this.anIntArray49[local31];
				if (this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local38].anInt1020 != anInt396) {
					this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local38].aClass13_2 = null;
					this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local38] = null;
				}
			}
			if (arg1.anInt734 != arg0) {
				signlink.reporterror(this.aString11 + " size mismatch in getnpcpos - pos:" + arg1.anInt734 + " psize:" + arg0);
				throw new RuntimeException("eek");
			}
			for (local38 = 0; local38 < this.anInt294; local38++) {
				if (this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[this.anIntArray57[local38]] == null) {
					signlink.reporterror(this.aString11 + " null entry in npc list - pos:" + local38 + " size:" + this.anInt294);
					throw new RuntimeException("eek");
				}
			}
		} catch (@Pc(128) RuntimeException local128) {
			signlink.reporterror("79159, " + true + ", " + arg0 + ", " + arg1 + ", " + local128.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "D", descriptor = "(I)V")
	private void method188() {
		try {
			if (super.anInt191 == 1) {
				if (super.anInt192 >= 539 && super.anInt192 <= 573 && super.anInt193 >= 169 && super.anInt193 < 205 && this.anIntArray69[0] != -1) {
					this.aBoolean61 = true;
					this.anInt302 = 0;
					this.aBoolean82 = true;
				}
				if (super.anInt192 >= 569 && super.anInt192 <= 599 && super.anInt193 >= 168 && super.anInt193 < 205 && this.anIntArray69[1] != -1) {
					this.aBoolean61 = true;
					this.anInt302 = 1;
					this.aBoolean82 = true;
				}
				if (super.anInt192 >= 597 && super.anInt192 <= 627 && super.anInt193 >= 168 && super.anInt193 < 205 && this.anIntArray69[2] != -1) {
					this.aBoolean61 = true;
					this.anInt302 = 2;
					this.aBoolean82 = true;
				}
				if (super.anInt192 >= 625 && super.anInt192 <= 669 && super.anInt193 >= 168 && super.anInt193 < 203 && this.anIntArray69[3] != -1) {
					this.aBoolean61 = true;
					this.anInt302 = 3;
					this.aBoolean82 = true;
				}
				if (super.anInt192 >= 666 && super.anInt192 <= 696 && super.anInt193 >= 168 && super.anInt193 < 205 && this.anIntArray69[4] != -1) {
					this.aBoolean61 = true;
					this.anInt302 = 4;
					this.aBoolean82 = true;
				}
				if (super.anInt192 >= 694 && super.anInt192 <= 724 && super.anInt193 >= 168 && super.anInt193 < 205 && this.anIntArray69[5] != -1) {
					this.aBoolean61 = true;
					this.anInt302 = 5;
					this.aBoolean82 = true;
				}
				if (super.anInt192 >= 722 && super.anInt192 <= 756 && super.anInt193 >= 169 && super.anInt193 < 205 && this.anIntArray69[6] != -1) {
					this.aBoolean61 = true;
					this.anInt302 = 6;
					this.aBoolean82 = true;
				}
				if (super.anInt192 >= 540 && super.anInt192 <= 574 && super.anInt193 >= 466 && super.anInt193 < 502 && this.anIntArray69[7] != -1) {
					this.aBoolean61 = true;
					this.anInt302 = 7;
					this.aBoolean82 = true;
				}
				if (super.anInt192 >= 572 && super.anInt192 <= 602 && super.anInt193 >= 466 && super.anInt193 < 503 && this.anIntArray69[8] != -1) {
					this.aBoolean61 = true;
					this.anInt302 = 8;
					this.aBoolean82 = true;
				}
				if (super.anInt192 >= 599 && super.anInt192 <= 629 && super.anInt193 >= 466 && super.anInt193 < 503 && this.anIntArray69[9] != -1) {
					this.aBoolean61 = true;
					this.anInt302 = 9;
					this.aBoolean82 = true;
				}
				if (super.anInt192 >= 627 && super.anInt192 <= 671 && super.anInt193 >= 467 && super.anInt193 < 502 && this.anIntArray69[10] != -1) {
					this.aBoolean61 = true;
					this.anInt302 = 10;
					this.aBoolean82 = true;
				}
				if (super.anInt192 >= 669 && super.anInt192 <= 699 && super.anInt193 >= 466 && super.anInt193 < 503 && this.anIntArray69[11] != -1) {
					this.aBoolean61 = true;
					this.anInt302 = 11;
					this.aBoolean82 = true;
				}
				if (super.anInt192 >= 696 && super.anInt192 <= 726 && super.anInt193 >= 466 && super.anInt193 < 503 && this.anIntArray69[12] != -1) {
					this.aBoolean61 = true;
					this.anInt302 = 12;
					this.aBoolean82 = true;
				}
				if (super.anInt192 >= 724 && super.anInt192 <= 758 && super.anInt193 >= 466 && super.anInt193 < 502 && this.anIntArray69[13] != -1) {
					this.aBoolean61 = true;
					this.anInt302 = 13;
					this.aBoolean82 = true;
					return;
				}
			}
		} catch (@Pc(444) RuntimeException local444) {
			signlink.reporterror("63058, " + -293 + ", " + local444.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!d;Z)Z")
	private boolean method189(@OriginalArg(0) Class6 arg0) {
		try {
			this.aBoolean57 &= true;
			@Pc(10) int local10 = arg0.anInt419;
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
				this.aStringArray1[this.anInt275] = "Remove @whi@" + this.aStringArray5[local10];
				this.anIntArray36[this.anInt275] = 513;
				this.anInt275++;
				this.aStringArray1[this.anInt275] = "Message @whi@" + this.aStringArray5[local10];
				this.anIntArray36[this.anInt275] = 902;
				this.anInt275++;
				return true;
			} else if (local10 >= 401 && local10 <= 500) {
				this.aStringArray1[this.anInt275] = "Remove @whi@" + arg0.aString18;
				this.anIntArray36[this.anInt275] = 884;
				this.anInt275++;
				return true;
			} else {
				return false;
			}
		} catch (@Pc(133) RuntimeException local133) {
			signlink.reporterror("1354, " + arg0 + ", " + true + ", " + local133.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "E", descriptor = "(I)V")
	private void method190(@OriginalArg(0) int arg0) {
		try {
			@Pc(5) boolean local5 = false;
			for (@Pc(7) int local7 = 0; local7 < this.anInt272; local7++) {
				if (this.anIntArray82[local7] <= 0) {
					@Pc(16) boolean local16 = false;
					try {
						if (this.anIntArray38[local7] != this.anInt236 || this.anIntArray56[local7] != this.anInt368) {
							@Pc(49) Class1_Sub1_Sub3 local49 = Class5.method78(this.anIntArray56[local7], this.anIntArray38[local7]);
							if (System.currentTimeMillis() + (long) (local49.anInt734 / 22) > this.aLong16 + (long) (this.anInt303 / 22)) {
								this.anInt303 = local49.anInt734;
								this.aLong16 = System.currentTimeMillis();
								if (this.method228(local49.aByteArray9, local49.anInt734)) {
									this.anInt236 = this.anIntArray38[local7];
									this.anInt368 = this.anIntArray56[local7];
								} else {
									local16 = true;
								}
							}
						} else if (!this.method161()) {
							local16 = true;
						}
					} catch (@Pc(99) Exception local99) {
					}
					if (local16 && this.anIntArray82[local7] != -5) {
						this.anIntArray82[local7] = -5;
					} else {
						this.anInt272--;
						for (@Pc(115) int local115 = local7; local115 < this.anInt272; local115++) {
							this.anIntArray38[local115] = this.anIntArray38[local115 + 1];
							this.anIntArray56[local115] = this.anIntArray56[local115 + 1];
							this.anIntArray82[local115] = this.anIntArray82[local115 + 1];
						}
						local7--;
					}
				} else {
					@Pc(167) int local167 = this.anIntArray82[local7]--;
				}
			}
			if (this.anInt255 > 0) {
				this.anInt255 -= 20;
				if (this.anInt255 < 0) {
					this.anInt255 = 0;
				}
				if (this.anInt255 == 0 && this.aBoolean77 && !aBoolean90) {
					this.anInt376 = this.anInt269;
					this.aBoolean87 = true;
					this.aClass44_Sub1_1.method641(2, this.anInt376);
					return;
				}
			}
		} catch (@Pc(213) RuntimeException local213) {
			signlink.reporterror("64409, " + arg0 + ", " + local213.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!jb;I)V")
	private void method191(@OriginalArg(0) Class1_Sub1_Sub2_Sub3 arg0) {
		try {
			for (@Pc(5) int local5 = 0; local5 < this.anIntArray72.length; local5++) {
				this.anIntArray72[local5] = 0;
			}
			@Pc(30) int local30;
			for (@Pc(20) int local20 = 0; local20 < 5000; local20++) {
				local30 = (int) (Math.random() * 128.0D * (double) 256);
				this.anIntArray72[local30] = (int) (Math.random() * 256.0D);
			}
			@Pc(48) int local48;
			@Pc(52) int local52;
			@Pc(60) int local60;
			for (local30 = 0; local30 < 20; local30++) {
				for (local48 = 1; local48 < 255; local48++) {
					for (local52 = 1; local52 < 127; local52++) {
						local60 = local52 + (local48 << 7);
						this.anIntArray73[local60] = (this.anIntArray72[local60 - 1] + this.anIntArray72[local60 + 1] + this.anIntArray72[local60 - 128] + this.anIntArray72[local60 + 128]) / 4;
					}
				}
				@Pc(106) int[] local106 = this.anIntArray72;
				this.anIntArray72 = this.anIntArray73;
				this.anIntArray73 = local106;
			}
			if (arg0 != null) {
				local48 = 0;
				for (local52 = 0; local52 < arg0.anInt667; local52++) {
					for (local60 = 0; local60 < arg0.anInt666; local60++) {
						if (arg0.aByteArray7[local48++] != 0) {
							@Pc(148) int local148 = local60 + arg0.anInt668 + 16;
							@Pc(155) int local155 = local52 + arg0.anInt669 + 16;
							@Pc(161) int local161 = local148 + (local155 << 7);
							this.anIntArray72[local161] = 0;
						}
					}
				}
			}
		} catch (@Pc(178) RuntimeException local178) {
			signlink.reporterror("10967, " + arg0 + ", " + 34809 + ", " + local178.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(ZZ)V")
	private void method192(@OriginalArg(1) boolean arg0) {
		try {
			if (aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt980 >> 7 == this.anInt241 && aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt981 >> 7 == this.anInt242) {
				this.anInt241 = 0;
				anInt256++;
				if (anInt256 > 122) {
					anInt256 = 0;
					this.aClass1_Sub1_Sub3_3.method465(255);
					this.aClass1_Sub1_Sub3_3.method466(62);
				}
			}
			@Pc(39) int local39 = this.anInt389;
			if (arg0) {
				local39 = 1;
			}
			for (@Pc(52) int local52 = 0; local52 < local39; local52++) {
				@Pc(58) Class1_Sub1_Sub1_Sub1_Sub1 local58;
				@Pc(63) int local63;
				if (arg0) {
					local58 = aClass1_Sub1_Sub1_Sub1_Sub1_1;
					local63 = this.anInt388 << 14;
				} else {
					local58 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[this.anIntArray90[local52]];
					local63 = this.anIntArray90[local52] << 14;
				}
				if (local58 != null && local58.method676()) {
					local58.aBoolean30 = false;
					if ((aBoolean90 && this.anInt389 > 50 || this.anInt389 > 200) && !arg0 && local58.anInt1000 == local58.anInt984) {
						local58.aBoolean30 = true;
					}
					@Pc(114) int local114 = local58.anInt980 >> 7;
					@Pc(119) int local119 = local58.anInt981 >> 7;
					if (local114 >= 0 && local114 < 104 && local119 >= 0 && local119 < 104) {
						if (local58.aClass1_Sub1_Sub1_Sub5_1 == null || anInt396 < local58.anInt128 || anInt396 >= local58.anInt129) {
							if ((local58.anInt980 & 0x7F) == 64 && (local58.anInt981 & 0x7F) == 64) {
								if (this.anIntArrayArray3[local114][local119] == this.anInt375) {
									continue;
								}
								this.anIntArrayArray3[local114][local119] = this.anInt375;
							}
							local58.anInt127 = this.method133(local58.anInt981, local58.anInt980, this.anInt356);
							this.aClass37_1.method537(60, local63, local58.anInt127, local58.anInt980, 384, local58, local58.anInt982, local58.aBoolean259, local58.anInt981, this.anInt356);
						} else {
							local58.aBoolean30 = false;
							local58.anInt127 = this.method133(local58.anInt981, local58.anInt980, this.anInt356);
							this.aClass37_1.method538(local63, local58.anInt134, local58.anInt135, local58.anInt980, local58.anInt136, local58, local58.anInt981, this.anInt356, local58.anInt127, local58.anInt133, local58.anInt982);
						}
					}
				}
			}
		} catch (@Pc(248) RuntimeException local248) {
			signlink.reporterror("61838, " + true + ", " + arg0 + ", " + local248.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IBI)V")
	private void method193(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		try {
			@Pc(1) int local1 = 0;
			for (@Pc(3) int local3 = 0; local3 < 100; local3++) {
				if (this.aStringArray4[local3] != null) {
					@Pc(15) int local15 = this.anIntArray55[local3];
					@Pc(26) int local26 = this.anInt337 + 70 + 4 - local1 * 14;
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
					if ((local15 == 1 || local15 == 2) && (local15 == 1 || this.anInt212 == 0 || this.anInt212 == 1 && this.method162(local34))) {
						if (arg1 > local26 - 14 && arg1 <= local26 && !local34.equals(aClass1_Sub1_Sub1_Sub1_Sub1_1.aString3)) {
							if (this.anInt374 >= 1) {
								this.aStringArray1[this.anInt275] = "Report abuse @whi@" + local34;
								this.anIntArray36[this.anInt275] = 524;
								this.anInt275++;
							}
							this.aStringArray1[this.anInt275] = "Add ignore @whi@" + local34;
							this.anIntArray36[this.anInt275] = 47;
							this.anInt275++;
							this.aStringArray1[this.anInt275] = "Add friend @whi@" + local34;
							this.anIntArray36[this.anInt275] = 605;
							this.anInt275++;
						}
						local1++;
					}
					if ((local15 == 3 || local15 == 7) && this.anInt299 == 0 && (local15 == 7 || this.anInt234 == 0 || this.anInt234 == 1 && this.method162(local34))) {
						if (arg1 > local26 - 14 && arg1 <= local26) {
							if (this.anInt374 >= 1) {
								this.aStringArray1[this.anInt275] = "Report abuse @whi@" + local34;
								this.anIntArray36[this.anInt275] = 524;
								this.anInt275++;
							}
							this.aStringArray1[this.anInt275] = "Add ignore @whi@" + local34;
							this.anIntArray36[this.anInt275] = 47;
							this.anInt275++;
							this.aStringArray1[this.anInt275] = "Add friend @whi@" + local34;
							this.anIntArray36[this.anInt275] = 605;
							this.anInt275++;
						}
						local1++;
					}
					if (local15 == 4 && (this.anInt360 == 0 || this.anInt360 == 1 && this.method162(local34))) {
						if (arg1 > local26 - 14 && arg1 <= local26) {
							this.aStringArray1[this.anInt275] = "Accept trade @whi@" + local34;
							this.anIntArray36[this.anInt275] = 507;
							this.anInt275++;
						}
						local1++;
					}
					if ((local15 == 5 || local15 == 6) && this.anInt299 == 0 && this.anInt234 < 2) {
						local1++;
					}
					if (local15 == 8 && (this.anInt360 == 0 || this.anInt360 == 1 && this.method162(local34))) {
						if (arg1 > local26 - 14 && arg1 <= local26) {
							this.aStringArray1[this.anInt275] = "Accept challenge @whi@" + local34;
							this.anIntArray36[this.anInt275] = 957;
							this.anInt275++;
						}
						local1++;
					}
				}
			}
		} catch (@Pc(404) RuntimeException local404) {
			signlink.reporterror("6327, " + arg0 + ", " + 7 + ", " + arg1 + ", " + local404.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IILclient!ab;II)V")
	private void method194(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub1_Sub1_Sub1_Sub1 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		try {
			if (arg1 != aClass1_Sub1_Sub1_Sub1_Sub1_1 && this.anInt275 < 400) {
				@Pc(35) String local35;
				if (arg1.anInt126 == 0) {
					local35 = arg1.aString3 + method219(arg1.anInt125, aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt125) + " (level-" + arg1.anInt125 + ")";
				} else {
					local35 = arg1.aString3 + " (skill-" + arg1.anInt126 + ")";
				}
				@Pc(165) int local165;
				if (this.anInt260 == 1) {
					this.aStringArray1[this.anInt275] = "Use " + this.aString7 + " with @whi@" + local35;
					this.anIntArray36[this.anInt275] = 275;
					this.anIntArray37[this.anInt275] = arg3;
					this.anIntArray34[this.anInt275] = arg2;
					this.anIntArray35[this.anInt275] = arg0;
					this.anInt275++;
				} else if (this.anInt287 != 1) {
					for (local165 = 4; local165 >= 0; local165--) {
						if (this.aStringArray2[local165] != null) {
							this.aStringArray1[this.anInt275] = this.aStringArray2[local165] + " @whi@" + local35;
							@Pc(192) short local192 = 0;
							if (this.aStringArray2[local165].equalsIgnoreCase("attack")) {
								if (arg1.anInt125 > aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt125) {
									local192 = 2000;
								}
								if (aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt137 != 0 && arg1.anInt137 != 0) {
									if (aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt137 == arg1.anInt137) {
										local192 = 2000;
									} else {
										local192 = 0;
									}
								}
							} else if (this.aBooleanArray3[local165]) {
								local192 = 2000;
							}
							if (local165 == 0) {
								this.anIntArray36[this.anInt275] = local192 + 639;
							}
							if (local165 == 1) {
								this.anIntArray36[this.anInt275] = local192 + 499;
							}
							if (local165 == 2) {
								this.anIntArray36[this.anInt275] = local192 + 27;
							}
							if (local165 == 3) {
								this.anIntArray36[this.anInt275] = local192 + 387;
							}
							if (local165 == 4) {
								this.anIntArray36[this.anInt275] = local192 + 185;
							}
							this.anIntArray37[this.anInt275] = arg3;
							this.anIntArray34[this.anInt275] = arg2;
							this.anIntArray35[this.anInt275] = arg0;
							this.anInt275++;
						}
					}
				} else if ((this.anInt289 & 0x8) == 8) {
					this.aStringArray1[this.anInt275] = this.aString9 + " @whi@" + local35;
					this.anIntArray36[this.anInt275] = 131;
					this.anIntArray37[this.anInt275] = arg3;
					this.anIntArray34[this.anInt275] = arg2;
					this.anIntArray35[this.anInt275] = arg0;
					this.anInt275++;
				}
				for (local165 = 0; local165 < this.anInt275; local165++) {
					if (this.anIntArray36[local165] == 718) {
						this.aStringArray1[local165] = "Walk here @whi@" + local35;
						break;
					}
				}
			}
		} catch (@Pc(351) RuntimeException local351) {
			signlink.reporterror("20699, " + arg0 + ", " + 705 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local351.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "r", descriptor = "(B)V")
	private void method195() {
		try {
			this.aClass35_15.method520();
			Class1_Sub1_Sub2_Sub1.anIntArray179 = this.anIntArray46;
			this.aClass1_Sub1_Sub2_Sub3_18.method415(0, this.aByte14, 0);
			if (this.anInt232 != -1) {
				this.method119(0, 0, Class6.aClass6Array1[this.anInt232], 0);
			} else if (this.anIntArray69[this.anInt302] != -1) {
				this.method119(0, 0, Class6.aClass6Array1[this.anIntArray69[this.anInt302]], 0);
			}
			if (this.aBoolean68 && this.anInt305 == 1) {
				this.method197();
			}
			this.aClass35_15.method521(553, 205, super.aGraphics2);
			this.aClass35_17.method520();
			Class1_Sub1_Sub2_Sub1.anIntArray179 = this.anIntArray47;
		} catch (@Pc(80) RuntimeException local80) {
			signlink.reporterror("78878, " + 3 + ", " + local80.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "F", descriptor = "(I)V")
	private void method196() {
		try {
			for (@Pc(6) Class1_Sub1_Sub1_Sub6 local6 = (Class1_Sub1_Sub1_Sub6) this.aClass29_2.method507(); local6 != null; local6 = (Class1_Sub1_Sub1_Sub6) this.aClass29_2.method509()) {
				if (local6.anInt523 != this.anInt356 || local6.aBoolean137) {
					local6.method669();
				} else if (anInt396 >= local6.anInt522) {
					local6.method299(this.anInt202);
					if (local6.aBoolean137) {
						local6.method669();
					} else {
						this.aClass37_1.method537(60, -1, local6.anInt526, local6.anInt524, 384, local6, 0, false, local6.anInt525, local6.anInt523);
					}
				}
			}
		} catch (@Pc(70) RuntimeException local70) {
			signlink.reporterror("1882, " + -249 + ", " + local70.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "G", descriptor = "(I)V")
	private void method197() {
		try {
			@Pc(2) int local2 = this.anInt306;
			@Pc(5) int local5 = this.anInt307;
			@Pc(8) int local8 = this.anInt308;
			@Pc(11) int local11 = this.anInt309;
			Class1_Sub1_Sub2.method436(6116423, 210, local5, local11, local2, local8);
			Class1_Sub1_Sub2.method436(0, 210, local5 + 1, 16, local2 + 1, local8 - 2);
			Class1_Sub1_Sub2.method437(local2 + 1, local8 - 2, 0, local5 + 18, local11 - 19);
			this.aClass1_Sub1_Sub2_Sub4_3.method447(6116423, "Choose Option", local2 + 3, local5 + 14);
			@Pc(68) int local68 = super.anInt186;
			@Pc(71) int local71 = super.anInt187;
			if (this.anInt305 == 0) {
				local68 -= 4;
				local71 -= 4;
			}
			if (this.anInt305 == 1) {
				local68 -= 553;
				local71 -= 205;
			}
			if (this.anInt305 == 2) {
				local68 -= 17;
				local71 -= 357;
			}
			for (@Pc(90) int local90 = 0; local90 < this.anInt275; local90++) {
				@Pc(105) int local105 = local5 + (this.anInt275 - 1 - local90) * 15 + 31;
				@Pc(107) int local107 = 16777215;
				if (local68 > local2 && local68 < local2 + local8 && local71 > local105 - 13 && local71 < local105 + 3) {
					local107 = 16776960;
				}
				this.aClass1_Sub1_Sub2_Sub4_3.method451(local107, local105, true, local2 + 3, this.aStringArray1[local90]);
			}
		} catch (@Pc(148) RuntimeException local148) {
			signlink.reporterror("33105, " + 393 + ", " + local148.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "H", descriptor = "(I)V")
	private void method198() {
		try {
			for (@Pc(1) int local1 = 0; local1 < this.anInt294; local1++) {
				@Pc(8) int local8 = this.anIntArray57[local1];
				@Pc(13) Class1_Sub1_Sub1_Sub1_Sub2 local13 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local8];
				if (local13 != null) {
					this.method199(local13, local13.aClass13_2.aByte25);
				}
			}
		} catch (@Pc(34) RuntimeException local34) {
			signlink.reporterror("89148, " + 905 + ", " + local34.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(ILclient!y;I)V")
	private void method199(@OriginalArg(1) Class1_Sub1_Sub1_Sub1 arg0, @OriginalArg(2) int arg1) {
		try {
			if (arg0.anInt980 < 128 || arg0.anInt981 < 128 || arg0.anInt980 >= 13184 || arg0.anInt981 >= 13184) {
				arg0.anInt1003 = -1;
				arg0.anInt1008 = -1;
				arg0.anInt1017 = 0;
				arg0.anInt1018 = 0;
				arg0.anInt980 = arg0.anIntArray271[0] * 128 + arg0.anInt983 * 64;
				arg0.anInt981 = arg0.anIntArray272[0] * 128 + arg0.anInt983 * 64;
				arg0.method675();
			}
			if (arg0 == aClass1_Sub1_Sub1_Sub1_Sub1_1 && (arg0.anInt980 < 1536 || arg0.anInt981 < 1536 || arg0.anInt980 >= 11776 || arg0.anInt981 >= 11776)) {
				arg0.anInt1003 = -1;
				arg0.anInt1008 = -1;
				arg0.anInt1017 = 0;
				arg0.anInt1018 = 0;
				arg0.anInt980 = arg0.anIntArray271[0] * 128 + arg0.anInt983 * 64;
				arg0.anInt981 = arg0.anIntArray272[0] * 128 + arg0.anInt983 * 64;
				arg0.method675();
			}
			if (arg0.anInt1017 > anInt396) {
				this.method200(arg0);
			} else if (arg0.anInt1018 >= anInt396) {
				this.method201(this.anInt330, arg0);
			} else {
				this.method202(arg0);
			}
			this.method203((byte) 2, arg0);
			this.method204(arg0);
		} catch (@Pc(161) RuntimeException local161) {
			signlink.reporterror("3333, " + -34028 + ", " + arg0 + ", " + arg1 + ", " + local161.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILclient!y;)V")
	private void method200(@OriginalArg(1) Class1_Sub1_Sub1_Sub1 arg0) {
		try {
			@Pc(4) int local4 = arg0.anInt1017 - anInt396;
			@Pc(23) int local23 = arg0.anInt1013 * 128 + arg0.anInt983 * 64;
			@Pc(33) int local33 = arg0.anInt1015 * 128 + arg0.anInt983 * 64;
			arg0.anInt980 += (local23 - arg0.anInt980) / local4;
			arg0.anInt981 += (local33 - arg0.anInt981) / local4;
			arg0.anInt1025 = 0;
			if (arg0.anInt1019 == 0) {
				arg0.anInt1022 = 1024;
			}
			if (arg0.anInt1019 == 1) {
				arg0.anInt1022 = 1536;
			}
			if (arg0.anInt1019 == 2) {
				arg0.anInt1022 = 0;
			}
			if (arg0.anInt1019 == 3) {
				arg0.anInt1022 = 512;
			}
		} catch (@Pc(87) RuntimeException local87) {
			signlink.reporterror("29708, " + 5 + ", " + arg0 + ", " + local87.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(ILclient!y;)V")
	private void method201(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub1_Sub1_Sub1 arg1) {
		try {
			if (arg1.anInt1018 == anInt396 || arg1.anInt1003 == -1 || arg1.anInt1006 != 0 || arg1.anInt1005 + 1 > Class27.aClass27Array1[arg1.anInt1003].method502(arg1.anInt1004)) {
				@Pc(29) int local29 = arg1.anInt1018 - arg1.anInt1017;
				@Pc(34) int local34 = anInt396 - arg1.anInt1017;
				@Pc(44) int local44 = arg1.anInt1013 * 128 + arg1.anInt983 * 64;
				@Pc(54) int local54 = arg1.anInt1015 * 128 + arg1.anInt983 * 64;
				@Pc(64) int local64 = arg1.anInt1014 * 128 + arg1.anInt983 * 64;
				@Pc(74) int local74 = arg1.anInt1016 * 128 + arg1.anInt983 * 64;
				arg1.anInt980 = (local44 * (local29 - local34) + local64 * local34) / local29;
				arg1.anInt981 = (local54 * (local29 - local34) + local74 * local34) / local29;
			}
			arg1.anInt1025 = 0;
			if (arg1.anInt1019 == 0) {
				arg1.anInt1022 = 1024;
			}
			if (arg1.anInt1019 == 1) {
				arg1.anInt1022 = 1536;
			}
			if (arg1.anInt1019 == 2) {
				arg1.anInt1022 = 0;
			}
			if (arg1.anInt1019 == 3) {
				arg1.anInt1022 = 512;
			}
			arg1.anInt982 = arg1.anInt1022;
			if (arg0 != 37395) {
				this.anInt362 = this.aClass1_Sub1_Sub3_4.method476();
			}
		} catch (@Pc(144) RuntimeException local144) {
			signlink.reporterror("74708, " + arg0 + ", " + arg1 + ", " + local144.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!y;I)V")
	private void method202(@OriginalArg(0) Class1_Sub1_Sub1_Sub1 arg0) {
		try {
			arg0.anInt1000 = arg0.anInt984;
			if (arg0.anInt1024 == 0) {
				arg0.anInt1025 = 0;
			} else {
				if (arg0.anInt1003 != -1 && arg0.anInt1006 == 0) {
					@Pc(24) Class27 local24 = Class27.aClass27Array1[arg0.anInt1003];
					if (arg0.anInt1026 > 0 && local24.anInt789 == 0) {
						arg0.anInt1025++;
						return;
					}
					if (arg0.anInt1026 <= 0 && local24.anInt790 == 0) {
						arg0.anInt1025++;
						return;
					}
				}
				@Pc(53) int local53 = arg0.anInt980;
				@Pc(56) int local56 = arg0.anInt981;
				@Pc(71) int local71 = arg0.anIntArray271[arg0.anInt1024 - 1] * 128 + arg0.anInt983 * 64;
				@Pc(86) int local86 = arg0.anIntArray272[arg0.anInt1024 - 1] * 128 + arg0.anInt983 * 64;
				if (local71 - local53 <= 256 && local71 - local53 >= -256 && local86 - local56 <= 256 && local86 - local56 >= -256) {
					if (local53 < local71) {
						if (local56 < local86) {
							arg0.anInt1022 = 1280;
						} else if (local56 > local86) {
							arg0.anInt1022 = 1792;
						} else {
							arg0.anInt1022 = 1536;
						}
					} else if (local53 > local71) {
						if (local56 < local86) {
							arg0.anInt1022 = 768;
						} else if (local56 > local86) {
							arg0.anInt1022 = 256;
						} else {
							arg0.anInt1022 = 512;
						}
					} else if (local56 < local86) {
						arg0.anInt1022 = 1024;
					} else {
						arg0.anInt1022 = 0;
					}
					@Pc(180) int local180 = arg0.anInt1022 - arg0.anInt982 & 0x7FF;
					if (local180 > 1024) {
						local180 -= 2048;
					}
					@Pc(187) int local187 = arg0.anInt987;
					this.anInt361 += 0;
					if (local180 >= -256 && local180 <= 256) {
						local187 = arg0.anInt986;
					} else if (local180 >= 256 && local180 < 768) {
						local187 = arg0.anInt989;
					} else if (local180 >= -768 && local180 <= -256) {
						local187 = arg0.anInt988;
					}
					if (local187 == -1) {
						local187 = arg0.anInt986;
					}
					arg0.anInt1000 = local187;
					@Pc(235) int local235 = 4;
					if (arg0.anInt982 != arg0.anInt1022 && arg0.anInt997 == -1 && arg0.anInt1023 != 0) {
						local235 = 2;
					}
					if (arg0.anInt1024 > 2) {
						local235 = 6;
					}
					if (arg0.anInt1024 > 3) {
						local235 = 8;
					}
					if (arg0.anInt1025 > 0 && arg0.anInt1024 > 1) {
						local235 = 8;
						arg0.anInt1025--;
					}
					if (arg0.aBooleanArray12[arg0.anInt1024 - 1]) {
						local235 <<= 0x1;
					}
					if (local235 >= 8 && arg0.anInt1000 == arg0.anInt986 && arg0.anInt990 != -1) {
						arg0.anInt1000 = arg0.anInt990;
					}
					if (local53 < local71) {
						arg0.anInt980 += local235;
						if (arg0.anInt980 > local71) {
							arg0.anInt980 = local71;
						}
					} else if (local53 > local71) {
						arg0.anInt980 -= local235;
						if (arg0.anInt980 < local71) {
							arg0.anInt980 = local71;
						}
					}
					if (local56 < local86) {
						arg0.anInt981 += local235;
						if (arg0.anInt981 > local86) {
							arg0.anInt981 = local86;
						}
					} else if (local56 > local86) {
						arg0.anInt981 -= local235;
						if (arg0.anInt981 < local86) {
							arg0.anInt981 = local86;
						}
					}
					if (arg0.anInt980 == local71 && arg0.anInt981 == local86) {
						arg0.anInt1024--;
						if (arg0.anInt1026 > 0) {
							arg0.anInt1026--;
							return;
						}
					}
				} else {
					arg0.anInt980 = local71;
					arg0.anInt981 = local86;
				}
			}
		} catch (@Pc(397) RuntimeException local397) {
			signlink.reporterror("29188, " + arg0 + ", " + 0 + ", " + local397.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(BLclient!y;)V")
	private void method203(@OriginalArg(0) byte arg0, @OriginalArg(1) Class1_Sub1_Sub1_Sub1 arg1) {
		try {
			@Pc(6) boolean local6 = false;
			if (arg1.anInt1023 != 0) {
				@Pc(37) int local37;
				@Pc(43) int local43;
				if (arg1.anInt997 != -1 && arg1.anInt997 < 32768) {
					@Pc(29) Class1_Sub1_Sub1_Sub1_Sub2 local29 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[arg1.anInt997];
					if (local29 != null) {
						local37 = arg1.anInt980 - local29.anInt980;
						local43 = arg1.anInt981 - local29.anInt981;
						if (local37 != 0 || local43 != 0) {
							arg1.anInt1022 = (int) (Math.atan2((double) local37, (double) local43) * 325.949D) & 0x7FF;
						}
					}
				}
				@Pc(68) int local68;
				if (arg1.anInt997 >= 32768) {
					local68 = arg1.anInt997 - 32768;
					if (local68 == this.anInt344) {
						local68 = this.anInt388;
					}
					@Pc(80) Class1_Sub1_Sub1_Sub1_Sub1 local80 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local68];
					if (local80 != null) {
						local43 = arg1.anInt980 - local80.anInt980;
						@Pc(94) int local94 = arg1.anInt981 - local80.anInt981;
						if (local43 != 0 || local94 != 0) {
							arg1.anInt1022 = (int) (Math.atan2((double) local43, (double) local94) * 325.949D) & 0x7FF;
						}
					}
				}
				if ((arg1.anInt998 != 0 || arg1.anInt999 != 0) && (arg1.anInt1024 == 0 || arg1.anInt1025 > 0)) {
					local68 = arg1.anInt980 - (arg1.anInt998 - this.anInt370 - this.anInt370) * 64;
					local37 = arg1.anInt981 - (arg1.anInt999 - this.anInt371 - this.anInt371) * 64;
					if (local68 != 0 || local37 != 0) {
						arg1.anInt1022 = (int) (Math.atan2((double) local68, (double) local37) * 325.949D) & 0x7FF;
					}
					arg1.anInt998 = 0;
					arg1.anInt999 = 0;
				}
				local68 = arg1.anInt1022 - arg1.anInt982 & 0x7FF;
				if (local68 != 0) {
					if (local68 < arg1.anInt1023 || local68 > 2048 - arg1.anInt1023) {
						arg1.anInt982 = arg1.anInt1022;
					} else if (local68 > 1024) {
						arg1.anInt982 -= arg1.anInt1023;
					} else {
						arg1.anInt982 += arg1.anInt1023;
					}
					arg1.anInt982 &= 0x7FF;
					if (arg1.anInt1000 == arg1.anInt984 && arg1.anInt982 != arg1.anInt1022) {
						if (arg1.anInt985 != -1) {
							arg1.anInt1000 = arg1.anInt985;
							return;
						}
						arg1.anInt1000 = arg1.anInt986;
						return;
					}
				}
			}
		} catch (@Pc(248) RuntimeException local248) {
			signlink.reporterror("53139, " + arg0 + ", " + arg1 + ", " + local248.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Lclient!y;I)V")
	private void method204(@OriginalArg(0) Class1_Sub1_Sub1_Sub1 arg0) {
		try {
			this.anInt361 += 0;
			arg0.aBoolean259 = false;
			@Pc(19) Class27 local19;
			if (arg0.anInt1000 != -1) {
				local19 = Class27.aClass27Array1[arg0.anInt1000];
				arg0.anInt1002++;
				if (arg0.anInt1001 < local19.anInt783 && arg0.anInt1002 > local19.method502(arg0.anInt1001)) {
					arg0.anInt1002 = 0;
					arg0.anInt1001++;
				}
				if (arg0.anInt1001 >= local19.anInt783) {
					arg0.anInt1002 = 0;
					arg0.anInt1001 = 0;
				}
			}
			if (arg0.anInt1008 != -1 && anInt396 >= arg0.anInt1011) {
				if (arg0.anInt1009 < 0) {
					arg0.anInt1009 = 0;
				}
				local19 = Class33.aClass33Array1[arg0.anInt1008].aClass27_2;
				arg0.anInt1010++;
				while (arg0.anInt1009 < local19.anInt783 && arg0.anInt1010 > local19.method502(arg0.anInt1009)) {
					arg0.anInt1010 -= local19.method502(arg0.anInt1009);
					arg0.anInt1009++;
				}
				if (arg0.anInt1009 >= local19.anInt783 && (arg0.anInt1009 < 0 || arg0.anInt1009 >= local19.anInt783)) {
					arg0.anInt1008 = -1;
				}
			}
			if (arg0.anInt1003 != -1 && arg0.anInt1006 <= 1) {
				local19 = Class27.aClass27Array1[arg0.anInt1003];
				if (local19.anInt789 == 1 && arg0.anInt1026 > 0 && arg0.anInt1017 <= anInt396 && arg0.anInt1018 < anInt396) {
					arg0.anInt1006 = 1;
					return;
				}
			}
			if (arg0.anInt1003 != -1 && arg0.anInt1006 == 0) {
				local19 = Class27.aClass27Array1[arg0.anInt1003];
				arg0.anInt1005++;
				while (arg0.anInt1004 < local19.anInt783 && arg0.anInt1005 > local19.method502(arg0.anInt1004)) {
					arg0.anInt1005 -= local19.method502(arg0.anInt1004);
					arg0.anInt1004++;
				}
				if (arg0.anInt1004 >= local19.anInt783) {
					arg0.anInt1004 -= local19.anInt784;
					arg0.anInt1007++;
					if (arg0.anInt1007 >= local19.anInt788) {
						arg0.anInt1003 = -1;
					}
					if (arg0.anInt1004 < 0 || arg0.anInt1004 >= local19.anInt783) {
						arg0.anInt1003 = -1;
					}
				}
				arg0.aBoolean259 = local19.aBoolean217;
			}
			if (arg0.anInt1006 > 0) {
				arg0.anInt1006--;
			}
		} catch (@Pc(264) RuntimeException local264) {
			signlink.reporterror("50955, " + arg0 + ", " + 0 + ", " + local264.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "f", descriptor = "(Z)V")
	private void method205() {
		try {
			if (this.aBoolean63) {
				this.aBoolean63 = false;
				this.aClass35_6.method521(0, 4, super.aGraphics2);
				this.aClass35_7.method521(0, 357, super.aGraphics2);
				this.aClass35_8.method521(722, 4, super.aGraphics2);
				this.aClass35_9.method521(743, 205, super.aGraphics2);
				this.aClass35_10.method521(0, 0, super.aGraphics2);
				this.aClass35_11.method521(516, 4, super.aGraphics2);
				this.aClass35_12.method521(516, 205, super.aGraphics2);
				this.aClass35_13.method521(496, 357, super.aGraphics2);
				this.aClass35_14.method521(0, 338, super.aGraphics2);
				this.aBoolean61 = true;
				this.aBoolean74 = true;
				this.aBoolean82 = true;
				this.aBoolean79 = true;
				if (this.anInt229 != 2) {
					this.aClass35_17.method521(4, 4, super.aGraphics2);
					this.aClass35_16.method521(550, 4, super.aGraphics2);
				}
			}
			if (this.anInt229 == 2) {
				this.method125();
			}
			if (this.aBoolean68 && this.anInt305 == 1) {
				this.aBoolean61 = true;
			}
			@Pc(141) boolean local141;
			if (this.anInt232 != -1) {
				local141 = this.method147(this.anInt202, this.anInt232);
				if (local141) {
					this.aBoolean61 = true;
				}
			}
			if (this.anInt353 == 2) {
				this.aBoolean61 = true;
			}
			if (this.anInt333 == 2) {
				this.aBoolean61 = true;
			}
			if (this.aBoolean61) {
				this.method195();
				this.aBoolean61 = false;
			}
			if (this.anInt408 == -1) {
				this.aClass6_1.anInt426 = this.anInt222 - this.anInt337 - 77;
				if (super.anInt186 > 448 && super.anInt186 < 560 && super.anInt187 > 332) {
					this.method163(0, super.anInt186 - 17, this.aClass6_1, 463, false, 77, this.aByte1, super.anInt187 - 357, this.anInt222);
				}
				@Pc(224) int local224 = this.anInt222 - this.aClass6_1.anInt426 - 77;
				if (local224 < 0) {
					local224 = 0;
				}
				if (local224 > this.anInt222 - 77) {
					local224 = this.anInt222 - 77;
				}
				if (this.anInt337 != local224) {
					this.anInt337 = local224;
					this.aBoolean74 = true;
				}
			}
			if (this.anInt408 != -1) {
				local141 = this.method147(this.anInt202, this.anInt408);
				if (local141) {
					this.aBoolean74 = true;
				}
			}
			if (this.anInt353 == 3) {
				this.aBoolean74 = true;
			}
			if (this.anInt333 == 3) {
				this.aBoolean74 = true;
			}
			if (this.aString4 != null) {
				this.aBoolean74 = true;
			}
			if (this.aBoolean68 && this.anInt305 == 2) {
				this.aBoolean74 = true;
			}
			if (this.aBoolean74) {
				this.method129();
				this.aBoolean74 = false;
			}
			if (this.anInt229 == 2) {
				this.method118();
				this.aClass35_16.method521(550, 4, super.aGraphics2);
			}
			if (this.anInt207 != -1) {
				this.aBoolean82 = true;
			}
			if (this.aBoolean82) {
				if (this.anInt207 != -1 && this.anInt207 == this.anInt302) {
					this.anInt207 = -1;
					this.aClass1_Sub1_Sub3_3.method465(146);
					this.aClass1_Sub1_Sub3_3.method466(this.anInt302);
				}
				this.aBoolean82 = false;
				this.aClass35_5.method520();
				this.aClass1_Sub1_Sub2_Sub3_10.method415(0, this.aByte14, 0);
				if (this.anInt232 == -1) {
					if (this.anIntArray69[this.anInt302] != -1) {
						if (this.anInt302 == 0) {
							this.aClass1_Sub1_Sub2_Sub3_13.method415(10, this.aByte14, 22);
						}
						if (this.anInt302 == 1) {
							this.aClass1_Sub1_Sub2_Sub3_14.method415(8, this.aByte14, 54);
						}
						if (this.anInt302 == 2) {
							this.aClass1_Sub1_Sub2_Sub3_14.method415(8, this.aByte14, 82);
						}
						if (this.anInt302 == 3) {
							this.aClass1_Sub1_Sub2_Sub3_15.method415(8, this.aByte14, 110);
						}
						if (this.anInt302 == 4) {
							this.aClass1_Sub1_Sub2_Sub3_17.method415(8, this.aByte14, 153);
						}
						if (this.anInt302 == 5) {
							this.aClass1_Sub1_Sub2_Sub3_17.method415(8, this.aByte14, 181);
						}
						if (this.anInt302 == 6) {
							this.aClass1_Sub1_Sub2_Sub3_16.method415(9, this.aByte14, 209);
						}
					}
					if (this.anIntArray69[0] != -1 && (this.anInt207 != 0 || anInt396 % 20 < 10)) {
						this.aClass1_Sub1_Sub2_Sub3Array4[0].method415(13, this.aByte14, 29);
					}
					if (this.anIntArray69[1] != -1 && (this.anInt207 != 1 || anInt396 % 20 < 10)) {
						this.aClass1_Sub1_Sub2_Sub3Array4[1].method415(11, this.aByte14, 53);
					}
					if (this.anIntArray69[2] != -1 && (this.anInt207 != 2 || anInt396 % 20 < 10)) {
						this.aClass1_Sub1_Sub2_Sub3Array4[2].method415(11, this.aByte14, 82);
					}
					if (this.anIntArray69[3] != -1 && (this.anInt207 != 3 || anInt396 % 20 < 10)) {
						this.aClass1_Sub1_Sub2_Sub3Array4[3].method415(12, this.aByte14, 115);
					}
					if (this.anIntArray69[4] != -1 && (this.anInt207 != 4 || anInt396 % 20 < 10)) {
						this.aClass1_Sub1_Sub2_Sub3Array4[4].method415(13, this.aByte14, 153);
					}
					if (this.anIntArray69[5] != -1 && (this.anInt207 != 5 || anInt396 % 20 < 10)) {
						this.aClass1_Sub1_Sub2_Sub3Array4[5].method415(11, this.aByte14, 180);
					}
					if (this.anIntArray69[6] != -1 && (this.anInt207 != 6 || anInt396 % 20 < 10)) {
						this.aClass1_Sub1_Sub2_Sub3Array4[6].method415(13, this.aByte14, 208);
					}
				}
				this.aClass35_5.method521(516, 160, super.aGraphics2);
				this.aClass35_4.method520();
				this.aClass1_Sub1_Sub2_Sub3_9.method415(0, this.aByte14, 0);
				if (this.anInt232 == -1) {
					if (this.anIntArray69[this.anInt302] != -1) {
						if (this.anInt302 == 7) {
							this.aClass1_Sub1_Sub2_Sub3_1.method415(0, this.aByte14, 42);
						}
						if (this.anInt302 == 8) {
							this.aClass1_Sub1_Sub2_Sub3_2.method415(0, this.aByte14, 74);
						}
						if (this.anInt302 == 9) {
							this.aClass1_Sub1_Sub2_Sub3_2.method415(0, this.aByte14, 102);
						}
						if (this.anInt302 == 10) {
							this.aClass1_Sub1_Sub2_Sub3_3.method415(1, this.aByte14, 130);
						}
						if (this.anInt302 == 11) {
							this.aClass1_Sub1_Sub2_Sub3_5.method415(0, this.aByte14, 173);
						}
						if (this.anInt302 == 12) {
							this.aClass1_Sub1_Sub2_Sub3_5.method415(0, this.aByte14, 201);
						}
						if (this.anInt302 == 13) {
							this.aClass1_Sub1_Sub2_Sub3_4.method415(0, this.aByte14, 229);
						}
					}
					if (this.anIntArray69[8] != -1 && (this.anInt207 != 8 || anInt396 % 20 < 10)) {
						this.aClass1_Sub1_Sub2_Sub3Array4[7].method415(2, this.aByte14, 74);
					}
					if (this.anIntArray69[9] != -1 && (this.anInt207 != 9 || anInt396 % 20 < 10)) {
						this.aClass1_Sub1_Sub2_Sub3Array4[8].method415(3, this.aByte14, 102);
					}
					if (this.anIntArray69[10] != -1 && (this.anInt207 != 10 || anInt396 % 20 < 10)) {
						this.aClass1_Sub1_Sub2_Sub3Array4[9].method415(4, this.aByte14, 137);
					}
					if (this.anIntArray69[11] != -1 && (this.anInt207 != 11 || anInt396 % 20 < 10)) {
						this.aClass1_Sub1_Sub2_Sub3Array4[10].method415(2, this.aByte14, 174);
					}
					if (this.anIntArray69[12] != -1 && (this.anInt207 != 12 || anInt396 % 20 < 10)) {
						this.aClass1_Sub1_Sub2_Sub3Array4[11].method415(2, this.aByte14, 201);
					}
					if (this.anIntArray69[13] != -1 && (this.anInt207 != 13 || anInt396 % 20 < 10)) {
						this.aClass1_Sub1_Sub2_Sub3Array4[12].method415(2, this.aByte14, 226);
					}
				}
				this.aClass35_4.method521(496, 466, super.aGraphics2);
				this.aClass35_17.method520();
			}
			if (this.aBoolean79) {
				this.aBoolean79 = false;
				this.aClass35_3.method520();
				this.aClass1_Sub1_Sub2_Sub3_8.method415(0, this.aByte14, 0);
				this.aClass1_Sub1_Sub2_Sub4_2.method444(true, 16777215, 55, "Public chat", 28);
				if (this.anInt212 == 0) {
					this.aClass1_Sub1_Sub2_Sub4_2.method444(true, 65280, 55, "On", 41);
				}
				if (this.anInt212 == 1) {
					this.aClass1_Sub1_Sub2_Sub4_2.method444(true, 16776960, 55, "Friends", 41);
				}
				if (this.anInt212 == 2) {
					this.aClass1_Sub1_Sub2_Sub4_2.method444(true, 16711680, 55, "Off", 41);
				}
				if (this.anInt212 == 3) {
					this.aClass1_Sub1_Sub2_Sub4_2.method444(true, 65535, 55, "Hide", 41);
				}
				this.aClass1_Sub1_Sub2_Sub4_2.method444(true, 16777215, 184, "Private chat", 28);
				if (this.anInt234 == 0) {
					this.aClass1_Sub1_Sub2_Sub4_2.method444(true, 65280, 184, "On", 41);
				}
				if (this.anInt234 == 1) {
					this.aClass1_Sub1_Sub2_Sub4_2.method444(true, 16776960, 184, "Friends", 41);
				}
				if (this.anInt234 == 2) {
					this.aClass1_Sub1_Sub2_Sub4_2.method444(true, 16711680, 184, "Off", 41);
				}
				this.aClass1_Sub1_Sub2_Sub4_2.method444(true, 16777215, 324, "Trade/compete", 28);
				if (this.anInt360 == 0) {
					this.aClass1_Sub1_Sub2_Sub4_2.method444(true, 65280, 324, "On", 41);
				}
				if (this.anInt360 == 1) {
					this.aClass1_Sub1_Sub2_Sub4_2.method444(true, 16776960, 324, "Friends", 41);
				}
				if (this.anInt360 == 2) {
					this.aClass1_Sub1_Sub2_Sub4_2.method444(true, 16711680, 324, "Off", 41);
				}
				this.aClass1_Sub1_Sub2_Sub4_2.method444(true, 16777215, 458, "Report abuse", 33);
				this.aClass35_3.method521(0, 453, super.aGraphics2);
				this.aClass35_17.method520();
			}
			this.anInt202 = 0;
		} catch (@Pc(1080) RuntimeException local1080) {
			signlink.reporterror("27122, " + false + ", " + local1080.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIIIIZIIIII)Z")
	private boolean method206(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6, @OriginalArg(7) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		try {
			@Pc(11) int local11;
			for (@Pc(7) int local7 = 0; local7 < 104; local7++) {
				for (local11 = 0; local11 < 104; local11++) {
					this.anIntArrayArray6[local7][local11] = 0;
					this.anIntArrayArray4[local7][local11] = 99999999;
				}
			}
			local11 = arg1;
			@Pc(39) int local39 = arg10;
			this.anIntArrayArray6[arg1][arg10] = 99;
			this.anIntArrayArray4[arg1][arg10] = 0;
			@Pc(55) byte local55 = 0;
			@Pc(57) int local57 = 0;
			this.anIntArray60[0] = arg1;
			@Pc(66) int local66 = local55 + 1;
			this.anIntArray61[0] = arg10;
			@Pc(70) boolean local70 = false;
			@Pc(79) int local79 = this.anIntArray60.length;
			@Pc(86) int[][] local86 = this.aClass19Array1[this.anInt356].anIntArrayArray18;
			@Pc(197) int local197;
			while (local57 != local66) {
				local11 = this.anIntArray60[local57];
				local39 = this.anIntArray61[local57];
				local57 = (local57 + 1) % local79;
				if (local11 == arg9 && local39 == arg3) {
					local70 = true;
					break;
				}
				if (arg5 != 0) {
					if ((arg5 < 5 || arg5 == 10) && this.aClass19Array1[this.anInt356].method426(arg3, arg2, arg5 - 1, arg9, local39, local11)) {
						local70 = true;
						break;
					}
					if (arg5 < 10 && this.aClass19Array1[this.anInt356].method427(arg9, local39, arg3, arg5 - 1, arg2, local11)) {
						local70 = true;
						break;
					}
				}
				if (arg0 != 0 && arg8 != 0 && this.aClass19Array1[this.anInt356].method428(arg0, arg3, local39, anInt265, arg8, local11, arg4, arg9)) {
					local70 = true;
					break;
				}
				local197 = this.anIntArrayArray4[local11][local39] + 1;
				if (local11 > 0 && this.anIntArrayArray6[local11 - 1][local39] == 0 && (local86[local11 - 1][local39] & 0x280108) == 0) {
					this.anIntArray60[local66] = local11 - 1;
					this.anIntArray61[local66] = local39;
					local66 = (local66 + 1) % local79;
					this.anIntArrayArray6[local11 - 1][local39] = 2;
					this.anIntArrayArray4[local11 - 1][local39] = local197;
				}
				if (local11 < 103 && this.anIntArrayArray6[local11 + 1][local39] == 0 && (local86[local11 + 1][local39] & 0x280180) == 0) {
					this.anIntArray60[local66] = local11 + 1;
					this.anIntArray61[local66] = local39;
					local66 = (local66 + 1) % local79;
					this.anIntArrayArray6[local11 + 1][local39] = 8;
					this.anIntArrayArray4[local11 + 1][local39] = local197;
				}
				if (local39 > 0 && this.anIntArrayArray6[local11][local39 - 1] == 0 && (local86[local11][local39 - 1] & 0x280102) == 0) {
					this.anIntArray60[local66] = local11;
					this.anIntArray61[local66] = local39 - 1;
					local66 = (local66 + 1) % local79;
					this.anIntArrayArray6[local11][local39 - 1] = 1;
					this.anIntArrayArray4[local11][local39 - 1] = local197;
				}
				if (local39 < 103 && this.anIntArrayArray6[local11][local39 + 1] == 0 && (local86[local11][local39 + 1] & 0x280120) == 0) {
					this.anIntArray60[local66] = local11;
					this.anIntArray61[local66] = local39 + 1;
					local66 = (local66 + 1) % local79;
					this.anIntArrayArray6[local11][local39 + 1] = 4;
					this.anIntArrayArray4[local11][local39 + 1] = local197;
				}
				if (local11 > 0 && local39 > 0 && this.anIntArrayArray6[local11 - 1][local39 - 1] == 0 && (local86[local11 - 1][local39 - 1] & 0x28010E) == 0 && (local86[local11 - 1][local39] & 0x280108) == 0 && (local86[local11][local39 - 1] & 0x280102) == 0) {
					this.anIntArray60[local66] = local11 - 1;
					this.anIntArray61[local66] = local39 - 1;
					local66 = (local66 + 1) % local79;
					this.anIntArrayArray6[local11 - 1][local39 - 1] = 3;
					this.anIntArrayArray4[local11 - 1][local39 - 1] = local197;
				}
				if (local11 < 103 && local39 > 0 && this.anIntArrayArray6[local11 + 1][local39 - 1] == 0 && (local86[local11 + 1][local39 - 1] & 0x280183) == 0 && (local86[local11 + 1][local39] & 0x280180) == 0 && (local86[local11][local39 - 1] & 0x280102) == 0) {
					this.anIntArray60[local66] = local11 + 1;
					this.anIntArray61[local66] = local39 - 1;
					local66 = (local66 + 1) % local79;
					this.anIntArrayArray6[local11 + 1][local39 - 1] = 9;
					this.anIntArrayArray4[local11 + 1][local39 - 1] = local197;
				}
				if (local11 > 0 && local39 < 103 && this.anIntArrayArray6[local11 - 1][local39 + 1] == 0 && (local86[local11 - 1][local39 + 1] & 0x280138) == 0 && (local86[local11 - 1][local39] & 0x280108) == 0 && (local86[local11][local39 + 1] & 0x280120) == 0) {
					this.anIntArray60[local66] = local11 - 1;
					this.anIntArray61[local66] = local39 + 1;
					local66 = (local66 + 1) % local79;
					this.anIntArrayArray6[local11 - 1][local39 + 1] = 6;
					this.anIntArrayArray4[local11 - 1][local39 + 1] = local197;
				}
				if (local11 < 103 && local39 < 103 && this.anIntArrayArray6[local11 + 1][local39 + 1] == 0 && (local86[local11 + 1][local39 + 1] & 0x2801E0) == 0 && (local86[local11 + 1][local39] & 0x280180) == 0 && (local86[local11][local39 + 1] & 0x280120) == 0) {
					this.anIntArray60[local66] = local11 + 1;
					this.anIntArray61[local66] = local39 + 1;
					local66 = (local66 + 1) % local79;
					this.anIntArrayArray6[local11 + 1][local39 + 1] = 12;
					this.anIntArrayArray4[local11 + 1][local39 + 1] = local197;
				}
			}
			this.anInt276 = 0;
			@Pc(813) int local813;
			@Pc(819) int local819;
			@Pc(825) int local825;
			if (!local70) {
				if (arg6) {
					local197 = 100;
					for (local813 = 1; local813 < 2; local813++) {
						for (local819 = arg9 - local813; local819 <= arg9 + local813; local819++) {
							for (local825 = arg3 - local813; local825 <= arg3 + local813; local825++) {
								if (local819 >= 0 && local825 >= 0 && local819 < 104 && local825 < 104 && this.anIntArrayArray4[local819][local825] < local197) {
									local197 = this.anIntArrayArray4[local819][local825];
									local11 = local819;
									local39 = local825;
									this.anInt276 = 1;
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
			@Pc(886) byte local886 = 0;
			this.anIntArray60[0] = local11;
			local57 = local886 + 1;
			this.anIntArray61[0] = local39;
			local197 = local813 = this.anIntArrayArray6[local11][local39];
			while (local11 != arg1 || local39 != arg10) {
				if (local197 != local813) {
					local813 = local197;
					this.anIntArray60[local57] = local11;
					this.anIntArray61[local57++] = local39;
				}
				if ((local197 & 0x2) != 0) {
					local11++;
				} else if ((local197 & 0x8) != 0) {
					local11--;
				}
				if ((local197 & 0x1) != 0) {
					local39++;
				} else if ((local197 & 0x4) != 0) {
					local39--;
				}
				local197 = this.anIntArrayArray6[local11][local39];
			}
			if (local57 > 0) {
				local79 = local57;
				if (local57 > 25) {
					local79 = 25;
				}
				local57--;
				local819 = this.anIntArray60[local57];
				local825 = this.anIntArray61[local57];
				if (arg7 == 0) {
					this.aClass1_Sub1_Sub3_3.method465(234);
					this.aClass1_Sub1_Sub3_3.method466(local79 + local79 + 3);
				}
				if (arg7 == 1) {
					this.aClass1_Sub1_Sub3_3.method465(236);
					this.aClass1_Sub1_Sub3_3.method466(local79 + local79 + 3 + 14);
				}
				if (arg7 == 2) {
					this.aClass1_Sub1_Sub3_3.method465(67);
					this.aClass1_Sub1_Sub3_3.method466(local79 + local79 + 3);
				}
				if (super.anIntArray30[5] == 1) {
					this.aClass1_Sub1_Sub3_3.method466(1);
				} else {
					this.aClass1_Sub1_Sub3_3.method466(0);
				}
				this.aClass1_Sub1_Sub3_3.method467(local819 + this.anInt370);
				this.aClass1_Sub1_Sub3_3.method467(local825 + this.anInt371);
				this.anInt241 = this.anIntArray60[0];
				this.anInt242 = this.anIntArray61[0];
				for (@Pc(1074) int local1074 = 1; local1074 < local79; local1074++) {
					local57--;
					this.aClass1_Sub1_Sub3_3.method466(this.anIntArray60[local57] - local819);
					this.aClass1_Sub1_Sub3_3.method466(this.anIntArray61[local57] - local825);
				}
				return true;
			} else if (arg7 == 1) {
				return false;
			} else {
				return true;
			}
		} catch (@Pc(1109) RuntimeException local1109) {
			signlink.reporterror("96354, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + 124 + ", " + arg8 + ", " + arg9 + ", " + arg10 + ", " + local1109.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(BLjava/lang/String;ILjava/lang/String;II)Lclient!xb;")
	private Class47 method207(@OriginalArg(1) String arg0, @OriginalArg(2) int arg1, @OriginalArg(3) String arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		try {
			@Pc(3) byte[] local3 = null;
			@Pc(12) int local12 = 5;
			try {
				if (this.aClass45Array1[0] != null) {
					local3 = this.aClass45Array1[0].method654(arg1);
				}
			} catch (@Pc(27) Exception local27) {
			}
			@Pc(41) int local41;
			if (local3 != null) {
				this.aCRC32_1.reset();
				this.aCRC32_1.update(local3);
				local41 = (int) this.aCRC32_1.getValue();
				if (local41 != arg4) {
					local3 = null;
				}
			}
			if (local3 != null) {
				return new Class47(local3, 0);
			}
			local41 = 0;
			while (local3 == null) {
				@Pc(62) String local62 = "Unknown error";
				this.method95(arg3, "Requesting " + arg0);
				@Pc(77) int local77;
				try {
					local77 = 0;
					@Pc(88) DataInputStream local88 = this.method159(arg2 + arg4);
					@Pc(91) byte[] local91 = new byte[6];
					local88.readFully(local91, 0, 6);
					@Pc(102) Class1_Sub1_Sub3 local102 = new Class1_Sub1_Sub3(local91, 15787);
					local102.anInt734 = 3;
					@Pc(110) int local110 = local102.method480() + 6;
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
							this.method95(arg3, "Loading " + arg0 + " - " + local175 + "%");
						}
						local77 = local175;
					}
					local88.close();
					try {
						if (this.aClass45Array1[0] != null) {
							this.aClass45Array1[0].method655(local3, local3.length, arg1);
						}
					} catch (@Pc(220) Exception local220) {
						this.aClass45Array1[0] = null;
					}
					if (local3 != null) {
						this.aCRC32_1.reset();
						this.aCRC32_1.update(local3);
						local135 = (int) this.aCRC32_1.getValue();
						if (local135 != arg4) {
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
							this.method95(arg3, "Game updated - please reload page");
							local77 = 10;
						} else {
							this.method95(arg3, local62 + " - Retrying in " + local77);
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
					this.aBoolean64 = !this.aBoolean64;
				}
			}
			return new Class47(local3, 0);
		} catch (@Pc(359) RuntimeException local359) {
			signlink.reporterror("12814, " + -9 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local359.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "s", descriptor = "(B)I")
	private int method208() {
		try {
			@Pc(3) int local3 = 3;
			if (this.anInt226 < 310) {
				@Pc(18) int local18 = this.anInt223 >> 7;
				@Pc(23) int local23 = this.anInt225 >> 7;
				@Pc(28) int local28 = aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt980 >> 7;
				@Pc(33) int local33 = aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt981 >> 7;
				if ((this.aByteArrayArrayArray7[this.anInt356][local18][local23] & 0x4) != 0) {
					local3 = this.anInt356;
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
						if ((this.aByteArrayArrayArray7[this.anInt356][local18][local23] & 0x4) != 0) {
							local3 = this.anInt356;
						}
						local85 += local83;
						if (local85 >= 65536) {
							local85 -= 65536;
							if (local23 < local33) {
								local23++;
							} else if (local23 > local33) {
								local23--;
							}
							if ((this.aByteArrayArrayArray7[this.anInt356][local18][local23] & 0x4) != 0) {
								local3 = this.anInt356;
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
						if ((this.aByteArrayArrayArray7[this.anInt356][local18][local23] & 0x4) != 0) {
							local3 = this.anInt356;
						}
						local85 += local83;
						if (local85 >= 65536) {
							local85 -= 65536;
							if (local18 < local28) {
								local18++;
							} else if (local18 > local28) {
								local18--;
							}
							if ((this.aByteArrayArrayArray7[this.anInt356][local18][local23] & 0x4) != 0) {
								local3 = this.anInt356;
							}
						}
					}
				}
			}
			if ((this.aByteArrayArrayArray7[this.anInt356][aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt980 >> 7][aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt981 >> 7] & 0x4) != 0) {
				local3 = this.anInt356;
			}
			return local3;
		} catch (@Pc(251) RuntimeException local251) {
			signlink.reporterror("26640, " + 2 + ", " + local251.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "t", descriptor = "(B)I")
	private int method209(@OriginalArg(0) byte arg0) {
		try {
			@Pc(4) boolean local4 = false;
			@Pc(18) int local18 = this.method133(this.anInt225, this.anInt223, this.anInt356);
			return local18 - this.anInt224 >= 800 || (this.aByteArrayArrayArray7[this.anInt356][this.anInt223 >> 7][this.anInt225 >> 7] & 0x4) == 0 ? 3 : this.anInt356;
		} catch (@Pc(48) RuntimeException local48) {
			signlink.reporterror("19764, " + arg0 + ", " + local48.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "g", descriptor = "(Z)V")
	private void method210() {
		try {
			this.aBoolean84 = false;
			while (this.aBoolean59) {
				this.aBoolean84 = false;
				try {
					Thread.sleep(50L);
				} catch (@Pc(11) Exception local11) {
				}
			}
			this.aClass1_Sub1_Sub2_Sub3_6 = null;
			this.aClass1_Sub1_Sub2_Sub3_7 = null;
			this.aClass1_Sub1_Sub2_Sub3Array2 = null;
			this.anIntArray86 = null;
			this.anIntArray87 = null;
			this.anIntArray88 = null;
			this.anIntArray89 = null;
			this.anIntArray72 = null;
			this.anIntArray73 = null;
			this.anIntArray92 = null;
			this.anIntArray93 = null;
			this.aClass1_Sub1_Sub2_Sub2_12 = null;
			this.aClass1_Sub1_Sub2_Sub2_13 = null;
		} catch (@Pc(62) RuntimeException local62) {
			signlink.reporterror("94958, " + false + ", " + local62.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "run", descriptor = "()V")
	@Override
	public void run() {
		if (this.aBoolean58) {
			this.method117();
		} else {
			super.run();
		}
	}

	@OriginalMember(owner = "client!client", name = "I", descriptor = "(I)V")
	private void method211() {
		try {
			@Pc(22) int local22;
			@Pc(50) int local50;
			@Pc(54) int local54;
			@Pc(63) int local63;
			@Pc(70) int local70;
			@Pc(133) int local133;
			@Pc(190) int local190;
			try {
				this.anInt314 = -1;
				this.aClass29_2.method511();
				this.aClass29_1.method511();
				Class1_Sub1_Sub2_Sub1.method342();
				this.method158(this.aByte7);
				this.aClass37_1.method526();
				for (local22 = 0; local22 < 4; local22++) {
					this.aClass19Array1[local22].method417();
				}
				System.gc();
				@Pc(46) Class4 local46 = new Class4(this.anIntArrayArrayArray5, 104, (byte) 9, this.aByteArrayArrayArray7, 104);
				local50 = this.aByteArrayArray2.length;
				Class4.aBoolean39 = Class37.aBoolean223;
				for (local54 = 0; local54 < local50; local54++) {
					local63 = this.anIntArray64[local54] >> 8;
					local70 = this.anIntArray64[local54] & 0xFF;
					if (local63 == 33 && local70 >= 71 && local70 <= 73) {
						Class4.aBoolean39 = false;
					}
				}
				if (Class4.aBoolean39) {
					this.aClass37_1.method527(this.anInt356);
				} else {
					this.aClass37_1.method527(0);
				}
				this.aClass1_Sub1_Sub3_3.method465(181);
				@Pc(138) byte[] local138;
				for (local63 = 0; local63 < local50; local63++) {
					local70 = (this.anIntArray64[local63] >> 8) * 64 - this.anInt370;
					local133 = (this.anIntArray64[local63] & 0xFF) * 64 - this.anInt371;
					local138 = this.aByteArrayArray2[local63];
					if (local138 != null) {
						local46.method56((this.anInt211 - 6) * 8, (this.anInt210 - 6) * 8, local138, local133, local70);
					}
				}
				for (local70 = 0; local70 < local50; local70++) {
					local133 = (this.anIntArray64[local70] >> 8) * 64 - this.anInt370;
					local190 = (this.anIntArray64[local70] & 0xFF) * 64 - this.anInt371;
					@Pc(195) byte[] local195 = this.aByteArrayArray2[local70];
					if (local195 == null && this.anInt211 < 800) {
						local46.method55(local133, local190);
					}
				}
				this.aClass1_Sub1_Sub3_3.method465(181);
				@Pc(240) int local240;
				for (local133 = 0; local133 < local50; local133++) {
					local138 = this.aByteArrayArray1[local133];
					if (local138 != null) {
						local240 = (this.anIntArray64[local133] >> 8) * 64 - this.anInt370;
						@Pc(252) int local252 = (this.anIntArray64[local133] & 0xFF) * 64 - this.anInt371;
						local46.method59(local252, local240, local138, this.aClass37_1, this.aClass19Array1);
					}
				}
				this.aClass1_Sub1_Sub3_3.method465(181);
				local46.method61(this.aClass19Array1, this.aClass37_1);
				this.aClass35_17.method520();
				this.aClass1_Sub1_Sub3_3.method465(181);
				for (local190 = 0; local190 < 104; local190++) {
					for (local240 = 0; local240 < 104; local240++) {
						this.method174(local190, local240);
					}
				}
				this.method183();
			} catch (@Pc(312) Exception local312) {
			}
			Class9.aClass40_4.method589();
			@Pc(326) int local326;
			if (aBoolean90 && signlink.aRandomAccessFile1 != null) {
				local22 = this.aClass44_Sub1_1.method634(0, (byte) 7);
				for (local326 = 0; local326 < local22; local326++) {
					local50 = this.aClass44_Sub1_1.method639(local326);
					if ((local50 & 0x79) == 0) {
						Class1_Sub1_Sub1_Sub5.method259(local326);
					}
				}
			}
			System.gc();
			Class1_Sub1_Sub2_Sub1.method343();
			this.aClass44_Sub1_1.method645(this.anInt259);
			local22 = (this.anInt210 - 6) / 8 - 1;
			local326 = (this.anInt210 + 6) / 8 + 1;
			local50 = (this.anInt211 - 6) / 8 - 1;
			local54 = (this.anInt211 + 6) / 8 + 1;
			if (this.aBoolean62) {
				local22 = 49;
				local326 = 50;
				local50 = 49;
				local54 = 50;
			}
			for (local63 = local22; local63 <= local326; local63++) {
				for (local70 = local50; local70 <= local54; local70++) {
					if (local63 == local22 || local63 == local326 || local70 == local50 || local70 == local54) {
						local133 = this.aClass44_Sub1_1.method636(local70, local63, 0);
						if (local133 != -1) {
							this.aClass44_Sub1_1.method646(local133, 3);
						}
						local190 = this.aClass44_Sub1_1.method636(local70, local63, 1);
						if (local190 != -1) {
							this.aClass44_Sub1_1.method646(local190, 3);
						}
					}
				}
			}
		} catch (@Pc(469) RuntimeException local469) {
			signlink.reporterror("93797, " + -17416 + ", " + local469.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILclient!lb;Z)V")
	private void method212(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub1_Sub3 arg1) {
		try {
			arg1.method486();
			@Pc(7) int local7 = arg1.method487(1);
			if (local7 != 0) {
				@Pc(15) int local15 = arg1.method487(2);
				if (local15 == 0) {
					this.anIntArray91[this.anInt390++] = this.anInt388;
				} else {
					@Pc(44) int local44;
					@Pc(55) int local55;
					if (local15 == 1) {
						local44 = arg1.method487(3);
						aClass1_Sub1_Sub1_Sub1_Sub1_1.method674(false, local44, this.anInt355);
						local55 = arg1.method487(1);
						if (local55 == 1) {
							this.anIntArray91[this.anInt390++] = this.anInt388;
						}
					} else {
						@Pc(101) int local101;
						if (local15 == 2) {
							local44 = arg1.method487(3);
							aClass1_Sub1_Sub1_Sub1_Sub1_1.method674(true, local44, this.anInt355);
							local55 = arg1.method487(3);
							aClass1_Sub1_Sub1_Sub1_Sub1_1.method674(true, local55, this.anInt355);
							local101 = arg1.method487(1);
							if (local101 == 1) {
								this.anIntArray91[this.anInt390++] = this.anInt388;
							}
						} else if (local15 == 3) {
							this.anInt356 = arg1.method487(2);
							local44 = arg1.method487(7);
							local55 = arg1.method487(7);
							local101 = arg1.method487(1);
							aClass1_Sub1_Sub1_Sub1_Sub1_1.method673(local44, local101 == 1, local55, this.aByte4);
							@Pc(158) int local158 = arg1.method487(1);
							if (local158 == 1) {
								this.anIntArray91[this.anInt390++] = this.anInt388;
							}
						}
					}
				}
			}
		} catch (@Pc(175) RuntimeException local175) {
			signlink.reporterror("6378, " + arg0 + ", " + arg1 + ", " + false + ", " + local175.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "J", descriptor = "(I)V")
	private void method214() {
		try {
			@Pc(6) int local6 = this.anInt345 * 128 + 64;
			@Pc(13) int local13 = this.anInt346 * 128 + 64;
			@Pc(24) int local24 = this.method133(local13, local6, this.anInt356) - this.anInt347;
			if (this.anInt223 < local6) {
				this.anInt223 += this.anInt348 + (local6 - this.anInt223) * this.anInt349 / 1000;
				if (this.anInt223 > local6) {
					this.anInt223 = local6;
				}
			}
			if (this.anInt223 > local6) {
				this.anInt223 -= this.anInt348 + (this.anInt223 - local6) * this.anInt349 / 1000;
				if (this.anInt223 < local6) {
					this.anInt223 = local6;
				}
			}
			if (this.anInt224 < local24) {
				this.anInt224 += this.anInt348 + (local24 - this.anInt224) * this.anInt349 / 1000;
				if (this.anInt224 > local24) {
					this.anInt224 = local24;
				}
			}
			if (this.anInt224 > local24) {
				this.anInt224 -= this.anInt348 + (this.anInt224 - local24) * this.anInt349 / 1000;
				if (this.anInt224 < local24) {
					this.anInt224 = local24;
				}
			}
			if (this.anInt225 < local13) {
				this.anInt225 += this.anInt348 + (local13 - this.anInt225) * this.anInt349 / 1000;
				if (this.anInt225 > local13) {
					this.anInt225 = local13;
				}
			}
			if (this.anInt225 > local13) {
				this.anInt225 -= this.anInt348 + (this.anInt225 - local13) * this.anInt349 / 1000;
				if (this.anInt225 < local13) {
					this.anInt225 = local13;
				}
			}
			local6 = this.anInt282 * 128 + 64;
			local13 = this.anInt283 * 128 + 64;
			local24 = this.method133(local13, local6, this.anInt356) - this.anInt284;
			@Pc(222) int local222 = local6 - this.anInt223;
			@Pc(227) int local227 = local24 - this.anInt224;
			@Pc(232) int local232 = local13 - this.anInt225;
			this.anInt361 += 0;
			@Pc(249) int local249 = (int) Math.sqrt((double) (local222 * local222 + local232 * local232));
			@Pc(260) int local260 = (int) (Math.atan2((double) local227, (double) local249) * 325.949D) & 0x7FF;
			@Pc(271) int local271 = (int) (Math.atan2((double) local222, (double) local232) * -325.949D) & 0x7FF;
			if (local260 < 128) {
				local260 = 128;
			}
			if (local260 > 383) {
				local260 = 383;
			}
			if (this.anInt226 < local260) {
				this.anInt226 += this.anInt285 + (local260 - this.anInt226) * this.anInt286 / 1000;
				if (this.anInt226 > local260) {
					this.anInt226 = local260;
				}
			}
			if (this.anInt226 > local260) {
				this.anInt226 -= this.anInt285 + (this.anInt226 - local260) * this.anInt286 / 1000;
				if (this.anInt226 < local260) {
					this.anInt226 = local260;
				}
			}
			@Pc(342) int local342 = local271 - this.anInt227;
			if (local342 > 1024) {
				local342 -= 2048;
			}
			if (local342 < -1024) {
				local342 += 2048;
			}
			if (local342 > 0) {
				this.anInt227 += this.anInt285 + local342 * this.anInt286 / 1000;
				this.anInt227 &= 0x7FF;
			}
			if (local342 < 0) {
				this.anInt227 -= this.anInt285 + -local342 * this.anInt286 / 1000;
				this.anInt227 &= 0x7FF;
			}
			@Pc(400) int local400 = local271 - this.anInt227;
			if (local400 > 1024) {
				local400 -= 2048;
			}
			if (local400 < -1024) {
				local400 += 2048;
			}
			if (local400 < 0 && local342 > 0 || local400 > 0 && local342 < 0) {
				this.anInt227 = local271;
			}
		} catch (@Pc(421) RuntimeException local421) {
			signlink.reporterror("37827, " + 0 + ", " + local421.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "K", descriptor = "(I)V")
	private void method215(@OriginalArg(0) int arg0) {
		try {
			anInt328++;
			while (arg0 >= 0) {
				this.anInt268 = 326;
			}
			if (anInt328 > 192) {
				anInt328 = 0;
				this.aClass1_Sub1_Sub3_3.method465(137);
				this.aClass1_Sub1_Sub3_3.method466(232);
			}
			while (true) {
				@Pc(30) int local30;
				do {
					while (true) {
						local30 = this.method87();
						if (local30 == -1) {
							return;
						}
						if (this.anInt377 != -1 && this.anInt377 == this.anInt386) {
							if (local30 == 8 && this.aString6.length() > 0) {
								this.aString6 = this.aString6.substring(0, this.aString6.length() - 1);
							}
							break;
						}
						@Pc(210) int local210;
						if (this.aBoolean88) {
							if (local30 >= 32 && local30 <= 122 && this.aString10.length() < 80) {
								this.aString10 = this.aString10 + (char) local30;
								this.aBoolean74 = true;
							}
							if (local30 == 8 && this.aString10.length() > 0) {
								this.aString10 = this.aString10.substring(0, this.aString10.length() - 1);
								this.aBoolean74 = true;
							}
							if (local30 == 13 || local30 == 10) {
								this.aBoolean88 = false;
								this.aBoolean74 = true;
								@Pc(170) long local170;
								if (this.anInt228 == 1) {
									local170 = Class48.method663(this.aString10);
									this.method177(local170);
								}
								if (this.anInt228 == 2 && this.anInt338 > 0) {
									local170 = Class48.method663(this.aString10);
									this.method126(local170);
								}
								if (this.anInt228 == 3 && this.aString10.length() > 0) {
									this.aClass1_Sub1_Sub3_3.method465(107);
									this.aClass1_Sub1_Sub3_3.method466(0);
									local210 = this.aClass1_Sub1_Sub3_3.anInt734;
									this.aClass1_Sub1_Sub3_3.method472(this.aLong15);
									Class49.method680(this.aString10, this.aClass1_Sub1_Sub3_3);
									this.aClass1_Sub1_Sub3_3.method475(this.aClass1_Sub1_Sub3_3.anInt734 - local210, this.anInt354);
									this.aString10 = Class49.method681(this.aString10, this.anInt397);
									this.aString10 = Class42.method600(this.aString10, this.anInt397);
									this.method99(6, this.aString10, Class48.method667(Class48.method664(this.aLong15)));
									if (this.anInt234 == 2) {
										this.anInt234 = 1;
										this.aBoolean79 = true;
										this.aClass1_Sub1_Sub3_3.method465(161);
										this.aClass1_Sub1_Sub3_3.method466(this.anInt212);
										this.aClass1_Sub1_Sub3_3.method466(this.anInt234);
										this.aClass1_Sub1_Sub3_3.method466(this.anInt360);
									}
								}
								if (this.anInt228 == 4 && this.anInt264 < 100) {
									local170 = Class48.method663(this.aString10);
									this.method137(local170);
								}
								if (this.anInt228 == 5 && this.anInt264 > 0) {
									local170 = Class48.method663(this.aString10);
									this.method224(local170);
								}
							}
						} else if (this.aBoolean70) {
							if (local30 >= 48 && local30 <= 57 && this.aString13.length() < 10) {
								this.aString13 = this.aString13 + (char) local30;
								this.aBoolean74 = true;
							}
							if (local30 == 8 && this.aString13.length() > 0) {
								this.aString13 = this.aString13.substring(0, this.aString13.length() - 1);
								this.aBoolean74 = true;
							}
							if (local30 == 13 || local30 == 10) {
								if (this.aString13.length() > 0) {
									local210 = 0;
									try {
										local210 = Integer.parseInt(this.aString13);
									} catch (@Pc(389) Exception local389) {
									}
									this.aClass1_Sub1_Sub3_3.method465(180);
									this.aClass1_Sub1_Sub3_3.method470(local210);
								}
								this.aBoolean70 = false;
								this.aBoolean74 = true;
							}
						} else if (this.anInt408 == -1) {
							if (local30 >= 32 && local30 <= 122 && this.aString17.length() < 80) {
								this.aString17 = this.aString17 + (char) local30;
								this.aBoolean74 = true;
							}
							if (local30 == 8 && this.aString17.length() > 0) {
								this.aString17 = this.aString17.substring(0, this.aString17.length() - 1);
								this.aBoolean74 = true;
							}
							if ((local30 == 13 || local30 == 10) && this.aString17.length() > 0) {
								if (this.anInt374 == 2) {
									if (this.aString17.equals("::clientdrop")) {
										this.method181();
									}
									if (this.aString17.equals("::lag")) {
										this.method111();
									}
									if (this.aString17.equals("::prefetchmusic")) {
										for (local210 = 0; local210 < this.aClass44_Sub1_1.method634(2, (byte) 7); local210++) {
											this.aClass44_Sub1_1.method644(2, (byte) 1, local210);
										}
									}
								}
								if (this.aString17.startsWith("::")) {
									this.aClass1_Sub1_Sub3_3.method465(34);
									this.aClass1_Sub1_Sub3_3.method466(this.aString17.length() - 1);
									this.aClass1_Sub1_Sub3_3.method473(this.aString17.substring(2));
								} else {
									@Pc(542) String local542 = this.aString17.toLowerCase();
									@Pc(544) byte local544 = 0;
									if (local542.startsWith("yellow:")) {
										local544 = 0;
										this.aString17 = this.aString17.substring(7);
									} else if (local542.startsWith("red:")) {
										local544 = 1;
										this.aString17 = this.aString17.substring(4);
									} else if (local542.startsWith("green:")) {
										local544 = 2;
										this.aString17 = this.aString17.substring(6);
									} else if (local542.startsWith("cyan:")) {
										local544 = 3;
										this.aString17 = this.aString17.substring(5);
									} else if (local542.startsWith("purple:")) {
										local544 = 4;
										this.aString17 = this.aString17.substring(7);
									} else if (local542.startsWith("white:")) {
										local544 = 5;
										this.aString17 = this.aString17.substring(6);
									} else if (local542.startsWith("flash1:")) {
										local544 = 6;
										this.aString17 = this.aString17.substring(7);
									} else if (local542.startsWith("flash2:")) {
										local544 = 7;
										this.aString17 = this.aString17.substring(7);
									} else if (local542.startsWith("flash3:")) {
										local544 = 8;
										this.aString17 = this.aString17.substring(7);
									} else if (local542.startsWith("glow1:")) {
										local544 = 9;
										this.aString17 = this.aString17.substring(6);
									} else if (local542.startsWith("glow2:")) {
										local544 = 10;
										this.aString17 = this.aString17.substring(6);
									} else if (local542.startsWith("glow3:")) {
										local544 = 11;
										this.aString17 = this.aString17.substring(6);
									}
									local542 = this.aString17.toLowerCase();
									@Pc(716) byte local716 = 0;
									if (local542.startsWith("wave:")) {
										local716 = 1;
										this.aString17 = this.aString17.substring(5);
									} else if (local542.startsWith("wave2:")) {
										local716 = 2;
										this.aString17 = this.aString17.substring(6);
									} else if (local542.startsWith("shake:")) {
										local716 = 3;
										this.aString17 = this.aString17.substring(6);
									} else if (local542.startsWith("scroll:")) {
										local716 = 4;
										this.aString17 = this.aString17.substring(7);
									} else if (local542.startsWith("slide:")) {
										local716 = 5;
										this.aString17 = this.aString17.substring(6);
									}
									this.aClass1_Sub1_Sub3_3.method465(156);
									this.aClass1_Sub1_Sub3_3.method466(0);
									@Pc(797) int local797 = this.aClass1_Sub1_Sub3_3.anInt734;
									this.aClass1_Sub1_Sub3_3.method466(local544);
									this.aClass1_Sub1_Sub3_3.method466(local716);
									Class49.method680(this.aString17, this.aClass1_Sub1_Sub3_3);
									this.aClass1_Sub1_Sub3_3.method475(this.aClass1_Sub1_Sub3_3.anInt734 - local797, this.anInt354);
									this.aString17 = Class49.method681(this.aString17, this.anInt397);
									this.aString17 = Class42.method600(this.aString17, this.anInt397);
									aClass1_Sub1_Sub1_Sub1_Sub1_1.aString31 = this.aString17;
									aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt992 = local544;
									aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt993 = local716;
									aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt991 = 150;
									if (this.anInt374 == 2) {
										this.method99(2, aClass1_Sub1_Sub1_Sub1_Sub1_1.aString31, "@cr2@" + aClass1_Sub1_Sub1_Sub1_Sub1_1.aString3);
									} else if (this.anInt374 == 1) {
										this.method99(2, aClass1_Sub1_Sub1_Sub1_Sub1_1.aString31, "@cr1@" + aClass1_Sub1_Sub1_Sub1_Sub1_1.aString3);
									} else {
										this.method99(2, aClass1_Sub1_Sub1_Sub1_Sub1_1.aString31, aClass1_Sub1_Sub1_Sub1_Sub1_1.aString3);
									}
									if (this.anInt212 == 2) {
										this.anInt212 = 3;
										this.aBoolean79 = true;
										this.aClass1_Sub1_Sub3_3.method465(161);
										this.aClass1_Sub1_Sub3_3.method466(this.anInt212);
										this.aClass1_Sub1_Sub3_3.method466(this.anInt234);
										this.aClass1_Sub1_Sub3_3.method466(this.anInt360);
									}
								}
								this.aString17 = "";
								this.aBoolean74 = true;
							}
						}
					}
				} while ((local30 < 97 || local30 > 122) && (local30 < 65 || local30 > 90) && (local30 < 48 || local30 > 57) && local30 != 32);
				if (this.aString6.length() < 12) {
					this.aString6 = this.aString6 + (char) local30;
				}
			}
		} catch (@Pc(936) RuntimeException local936) {
			signlink.reporterror("93263, " + arg0 + ", " + local936.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(B)V")
	@Override
	protected void method91(@OriginalArg(0) byte arg0) {
		try {
			if (this.aBoolean91 || this.aBoolean76 || this.aBoolean54) {
				this.method135();
			} else {
				anInt366++;
				if (this.aBoolean57) {
					this.method205();
				} else {
					this.method148(false);
				}
				this.anInt317 = 0;
				@Pc(36) boolean local36 = false;
			}
		} catch (@Pc(39) RuntimeException local39) {
			signlink.reporterror("25980, " + arg0 + ", " + local39.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "f", descriptor = "(II)V")
	private void method216(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			if (arg0 >= 0) {
				if (this.aBoolean70) {
					this.aBoolean70 = false;
					this.aBoolean74 = true;
				}
				@Pc(18) int local18 = this.anIntArray34[arg0];
				@Pc(23) int local23 = this.anIntArray35[arg0];
				@Pc(28) int local28 = this.anIntArray36[arg0];
				@Pc(33) int local33 = this.anIntArray37[arg0];
				if (local28 >= 2000) {
					local28 -= 2000;
				}
				if (local28 == 721) {
					anInt394 += local23;
					if (anInt394 >= 139) {
						this.aClass1_Sub1_Sub3_3.method465(195);
						this.aClass1_Sub1_Sub3_3.method470(0);
					}
					this.method160(local33, 45, local23, local18);
				}
				if (local28 == 718) {
					if (this.aBoolean68) {
						this.aClass37_1.method564(local23 - 4, this.anInt217, local18 - 4);
					} else {
						this.aClass37_1.method564(super.anInt193 - 4, this.anInt217, super.anInt192 - 4);
					}
				}
				@Pc(104) Class1_Sub1_Sub1_Sub1_Sub1 local104;
				if (local28 == 131) {
					local104 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local33];
					if (local104 != null) {
						this.method206(1, aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray271[0], 0, local104.anIntArray272[0], 0, 0, false, 2, 1, local104.anIntArray271[0], aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray272[0]);
						this.anInt196 = super.anInt192;
						this.anInt197 = super.anInt193;
						this.anInt199 = 2;
						this.anInt198 = 0;
						this.aClass1_Sub1_Sub3_3.method465(138);
						this.aClass1_Sub1_Sub3_3.method467(local33);
						this.aClass1_Sub1_Sub3_3.method467(this.anInt288);
					}
				}
				@Pc(176) int local176;
				@Pc(193) String local193;
				@Pc(197) int local197;
				@Pc(172) String local172;
				if (local28 == 507 || local28 == 957) {
					local172 = this.aStringArray1[arg0];
					local176 = local172.indexOf("@whi@");
					if (local176 != -1) {
						local172 = local172.substring(local176 + 5).trim();
						local193 = Class48.method667(Class48.method664(Class48.method663(local172)));
						@Pc(195) boolean local195 = false;
						for (local197 = 0; local197 < this.anInt389; local197++) {
							@Pc(207) Class1_Sub1_Sub1_Sub1_Sub1 local207 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[this.anIntArray90[local197]];
							if (local207 != null && local207.aString3 != null && local207.aString3.equalsIgnoreCase(local193)) {
								this.method206(1, aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray271[0], 0, local207.anIntArray272[0], 0, 0, false, 2, 1, local207.anIntArray271[0], aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray272[0]);
								if (local28 == 507) {
									anInt201 += local33;
									if (anInt201 >= 66) {
										this.aClass1_Sub1_Sub3_3.method465(46);
										this.aClass1_Sub1_Sub3_3.method466(154);
									}
									this.aClass1_Sub1_Sub3_3.method465(189);
								}
								if (local28 == 957) {
									anInt220++;
									if (anInt220 >= 52) {
										this.aClass1_Sub1_Sub3_3.method465(49);
										this.aClass1_Sub1_Sub3_3.method466(131);
									}
									this.aClass1_Sub1_Sub3_3.method465(220);
								}
								this.aClass1_Sub1_Sub3_3.method467(this.anIntArray90[local197]);
								local195 = true;
								break;
							}
						}
						if (!local195) {
							this.method99(0, "Unable to find " + local193, "");
						}
					}
				}
				if (local28 == 625) {
					this.method160(local33, 10, local23, local18);
				}
				@Pc(339) Class15 local339;
				@Pc(348) String local348;
				if (local28 == 1152) {
					local339 = Class15.method358(local33);
					if (local339.aByteArray6 == null) {
						local348 = "It's a " + local339.aString25 + ".";
					} else {
						local348 = new String(local339.aByteArray6);
					}
					this.method99(0, local348, "");
				}
				if (local28 == 737) {
					this.method110();
				}
				@Pc(396) long local396;
				if (local28 == 902) {
					local172 = this.aStringArray1[arg0];
					local176 = local172.indexOf("@whi@");
					if (local176 != -1) {
						local396 = Class48.method663(local172.substring(local176 + 5).trim());
						local197 = -1;
						for (@Pc(400) int local400 = 0; local400 < this.anInt338; local400++) {
							if (this.aLongArray3[local400] == local396) {
								local197 = local400;
								break;
							}
						}
						if (local197 != -1 && this.anIntArray43[local197] > 0) {
							this.aBoolean74 = true;
							this.aBoolean70 = false;
							this.aBoolean88 = true;
							this.aString10 = "";
							this.anInt228 = 3;
							this.aLong15 = this.aLongArray3[local197];
							this.aString14 = "Enter message to send to " + this.aStringArray5[local197];
						}
					}
				}
				if (local28 == 605 || local28 == 47 || local28 == 513 || local28 == 884) {
					local172 = this.aStringArray1[arg0];
					local176 = local172.indexOf("@whi@");
					if (local176 != -1) {
						local396 = Class48.method663(local172.substring(local176 + 5).trim());
						if (local28 == 605) {
							this.method177(local396);
						}
						if (local28 == 47) {
							this.method137(local396);
						}
						if (local28 == 513) {
							this.method126(local396);
						}
						if (local28 == 884) {
							this.method224(local396);
						}
					}
				}
				if (local28 == 563) {
					this.aClass1_Sub1_Sub3_3.method465(112);
					this.aClass1_Sub1_Sub3_3.method467(local33);
					this.aClass1_Sub1_Sub3_3.method467(local18);
					this.aClass1_Sub1_Sub3_3.method467(local23);
					this.aClass1_Sub1_Sub3_3.method467(this.anInt288);
					this.anInt350 = 0;
					this.anInt351 = local23;
					this.anInt352 = local18;
					this.anInt353 = 2;
					if (Class6.aClass6Array1[local23].anInt416 == this.anInt377) {
						this.anInt353 = 1;
					}
					if (Class6.aClass6Array1[local23].anInt416 == this.anInt408) {
						this.anInt353 = 3;
					}
				}
				@Pc(583) Class6 local583;
				if (local28 == 274) {
					local583 = Class6.aClass6Array1[local23];
					this.anInt287 = 1;
					this.anInt288 = local23;
					this.anInt289 = local583.anInt443;
					this.anInt260 = 0;
					this.aBoolean61 = true;
					local348 = local583.aString20;
					if (local348.indexOf(" ") != -1) {
						local348 = local348.substring(0, local348.indexOf(" "));
					}
					local193 = local583.aString20;
					if (local193.indexOf(" ") != -1) {
						local193 = local193.substring(local193.indexOf(" ") + 1);
					}
					this.aString9 = local348 + " " + local583.aString21 + " " + local193;
					if (this.anInt289 == 16) {
						this.aBoolean61 = true;
						this.anInt302 = 3;
						this.aBoolean82 = true;
					}
				} else {
					if (local28 == 225) {
						this.aClass1_Sub1_Sub3_3.method465(86);
						this.aClass1_Sub1_Sub3_3.method467(local23);
						local583 = Class6.aClass6Array1[local23];
						if (local583.anIntArrayArray7 != null && local583.anIntArrayArray7[0][0] == 5) {
							local176 = local583.anIntArrayArray7[0][1];
							if (this.anIntArray85[local176] != local583.anIntArray97[0]) {
								this.anIntArray85[local176] = local583.anIntArray97[0];
								this.method229(local176);
								this.aBoolean61 = true;
							}
						}
					}
					if (local28 == 524) {
						local172 = this.aStringArray1[arg0];
						local176 = local172.indexOf("@whi@");
						if (local176 != -1) {
							if (this.anInt377 == -1) {
								this.method110();
								this.aString6 = local172.substring(local176 + 5).trim();
								this.aBoolean72 = false;
								for (@Pc(754) int local754 = 0; local754 < Class6.aClass6Array1.length; local754++) {
									if (Class6.aClass6Array1[local754] != null && Class6.aClass6Array1[local754].anInt419 == 600) {
										this.anInt386 = this.anInt377 = Class6.aClass6Array1[local754].anInt416;
										break;
									}
								}
							} else {
								this.method99(0, "Please close the interface you have open before using 'report abuse'", "");
							}
						}
					}
					@Pc(810) Class1_Sub1_Sub1_Sub1_Sub2 local810;
					if (local28 == 242 || local28 == 209 || local28 == 309 || local28 == 852 || local28 == 793) {
						local810 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local33];
						if (local810 != null) {
							this.method206(1, aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray271[0], 0, local810.anIntArray272[0], 0, 0, false, 2, 1, local810.anIntArray271[0], aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray272[0]);
							this.anInt196 = super.anInt192;
							this.anInt197 = super.anInt193;
							this.anInt199 = 2;
							this.anInt198 = 0;
							if (local28 == 242) {
								this.aClass1_Sub1_Sub3_3.method465(252);
							}
							if (local28 == 209) {
								this.aClass1_Sub1_Sub3_3.method465(21);
							}
							if (local28 == 793) {
								this.aClass1_Sub1_Sub3_3.method465(247);
							}
							if (local28 == 309) {
								this.aClass1_Sub1_Sub3_3.method465(178);
							}
							if (local28 == 852) {
								this.aClass1_Sub1_Sub3_3.method465(30);
							}
							this.aClass1_Sub1_Sub3_3.method467(local33);
						}
					}
					if (local28 == 231) {
						local583 = Class6.aClass6Array1[local23];
						@Pc(906) boolean local906 = true;
						if (local583.anInt419 > 0) {
							local906 = this.method101(local583);
						}
						if (local906) {
							this.aClass1_Sub1_Sub3_3.method465(86);
							this.aClass1_Sub1_Sub3_3.method467(local23);
						}
					}
					if (local28 == 1714) {
						local810 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local33];
						if (local810 != null) {
							if (local810.aClass13_2.aByteArray5 == null) {
								local348 = "It's a " + local810.aClass13_2.aString24 + ".";
							} else {
								local348 = new String(local810.aClass13_2.aByteArray5);
							}
							this.method99(0, local348, "");
						}
					}
					if (local28 == 398) {
						this.aClass1_Sub1_Sub3_3.method465(200);
						this.aClass1_Sub1_Sub3_3.method467(local33);
						this.aClass1_Sub1_Sub3_3.method467(local18);
						this.aClass1_Sub1_Sub3_3.method467(local23);
						this.aClass1_Sub1_Sub3_3.method467(this.anInt263);
						this.aClass1_Sub1_Sub3_3.method467(this.anInt261);
						this.aClass1_Sub1_Sub3_3.method467(this.anInt262);
						this.anInt350 = 0;
						this.anInt351 = local23;
						this.anInt352 = local18;
						this.anInt353 = 2;
						if (Class6.aClass6Array1[local23].anInt416 == this.anInt377) {
							this.anInt353 = 1;
						}
						if (Class6.aClass6Array1[local23].anInt416 == this.anInt408) {
							this.anInt353 = 3;
						}
					}
					if (local28 == 102) {
						this.anInt260 = 1;
						this.anInt261 = local18;
						this.anInt262 = local23;
						this.anInt263 = local33;
						this.aString7 = Class15.method358(local33).aString25;
						this.anInt287 = 0;
						this.aBoolean61 = true;
					} else {
						if (local28 == 997 && !this.aBoolean66) {
							this.aClass1_Sub1_Sub3_3.method465(166);
							this.aClass1_Sub1_Sub3_3.method467(local23);
							this.aBoolean66 = true;
						}
						if (local28 == 899 && this.method160(local33, 218, local23, local18)) {
							this.aClass1_Sub1_Sub3_3.method467(this.anInt288);
						}
						if (local28 == 694 || local28 == 962 || local28 == 795 || local28 == 681 || local28 == 100) {
							if (local28 == 100) {
								this.aClass1_Sub1_Sub3_3.method465(79);
							}
							if (local28 == 681) {
								anInt336++;
								if (anInt336 >= 116) {
									this.aClass1_Sub1_Sub3_3.method465(88);
									this.aClass1_Sub1_Sub3_3.method469(13018169);
								}
								this.aClass1_Sub1_Sub3_3.method465(191);
							}
							if (local28 == 694) {
								this.aClass1_Sub1_Sub3_3.method465(76);
							}
							if (local28 == 795) {
								this.aClass1_Sub1_Sub3_3.method465(40);
							}
							if (local28 == 962) {
								this.aClass1_Sub1_Sub3_3.method465(177);
							}
							this.aClass1_Sub1_Sub3_3.method467(local33);
							this.aClass1_Sub1_Sub3_3.method467(local18);
							this.aClass1_Sub1_Sub3_3.method467(local23);
							this.anInt350 = 0;
							this.anInt351 = local23;
							this.anInt352 = local18;
							this.anInt353 = 2;
							if (Class6.aClass6Array1[local23].anInt416 == this.anInt377) {
								this.anInt353 = 1;
							}
							if (Class6.aClass6Array1[local23].anInt416 == this.anInt408) {
								this.anInt353 = 3;
							}
						}
						if (local28 == 275) {
							local104 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local33];
							if (local104 != null) {
								this.method206(1, aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray271[0], 0, local104.anIntArray272[0], 0, 0, false, 2, 1, local104.anIntArray271[0], aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray272[0]);
								this.anInt196 = super.anInt192;
								this.anInt197 = super.anInt193;
								this.anInt199 = 2;
								this.anInt198 = 0;
								this.aClass1_Sub1_Sub3_3.method465(16);
								this.aClass1_Sub1_Sub3_3.method467(local33);
								this.aClass1_Sub1_Sub3_3.method467(this.anInt263);
								this.aClass1_Sub1_Sub3_3.method467(this.anInt261);
								this.aClass1_Sub1_Sub3_3.method467(this.anInt262);
							}
						}
						if (local28 == 240) {
							local810 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local33];
							if (local810 != null) {
								this.method206(1, aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray271[0], 0, local810.anIntArray272[0], 0, 0, false, 2, 1, local810.anIntArray271[0], aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray272[0]);
								this.anInt196 = super.anInt192;
								this.anInt197 = super.anInt193;
								this.anInt199 = 2;
								this.anInt198 = 0;
								this.aClass1_Sub1_Sub3_3.method465(108);
								this.aClass1_Sub1_Sub3_3.method467(local33);
								this.aClass1_Sub1_Sub3_3.method467(this.anInt288);
							}
						}
						if (local28 == 743) {
							anInt369++;
							if (anInt369 >= 124) {
								this.aClass1_Sub1_Sub3_3.method465(81);
								this.aClass1_Sub1_Sub3_3.method467(37954);
							}
							this.method160(local33, 196, local23, local18);
						}
						@Pc(1400) boolean local1400;
						if (local28 == 111) {
							local1400 = this.method206(0, aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray271[0], 0, local23, 0, 0, false, 2, 0, local18, aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray272[0]);
							if (!local1400) {
								this.method206(1, aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray271[0], 0, local23, 0, 0, false, 2, 1, local18, aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray272[0]);
							}
							this.anInt196 = super.anInt192;
							this.anInt197 = super.anInt193;
							this.anInt199 = 2;
							this.anInt198 = 0;
							this.aClass1_Sub1_Sub3_3.method465(55);
							this.aClass1_Sub1_Sub3_3.method467(local18 + this.anInt370);
							this.aClass1_Sub1_Sub3_3.method467(local23 + this.anInt371);
							this.aClass1_Sub1_Sub3_3.method467(local33);
							this.aClass1_Sub1_Sub3_3.method467(this.anInt263);
							this.aClass1_Sub1_Sub3_3.method467(this.anInt261);
							this.aClass1_Sub1_Sub3_3.method467(this.anInt262);
						}
						if (local28 == 810 && this.method160(local33, 184, local23, local18)) {
							this.aClass1_Sub1_Sub3_3.method467(this.anInt263);
							this.aClass1_Sub1_Sub3_3.method467(this.anInt261);
							this.aClass1_Sub1_Sub3_3.method467(this.anInt262);
						}
						if (local28 == 829) {
							local810 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local33];
							if (local810 != null) {
								this.method206(1, aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray271[0], 0, local810.anIntArray272[0], 0, 0, false, 2, 1, local810.anIntArray271[0], aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray272[0]);
								this.anInt196 = super.anInt192;
								this.anInt197 = super.anInt193;
								this.anInt199 = 2;
								this.anInt198 = 0;
								this.aClass1_Sub1_Sub3_3.method465(160);
								this.aClass1_Sub1_Sub3_3.method467(local33);
								this.aClass1_Sub1_Sub3_3.method467(this.anInt263);
								this.aClass1_Sub1_Sub3_3.method467(this.anInt261);
								this.aClass1_Sub1_Sub3_3.method467(this.anInt262);
							}
						}
						if (local28 == 1381) {
							@Pc(1585) int local1585 = local33 >> 14 & 0x7FFF;
							@Pc(1588) Class9 local1588 = Class9.method287(local1585);
							if (local1588.aByteArray4 == null) {
								local193 = "It's a " + local1588.aString23 + ".";
							} else {
								local193 = new String(local1588.aByteArray4);
							}
							this.method99(0, local193, "");
						}
						if (local28 == 1071) {
							this.method160(local33, 126, local23, local18);
						}
						if (local28 == 139 || local28 == 778 || local28 == 617 || local28 == 224 || local28 == 662) {
							local1400 = this.method206(0, aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray271[0], 0, local23, 0, 0, false, 2, 0, local18, aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray272[0]);
							if (!local1400) {
								this.method206(1, aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray271[0], 0, local23, 0, 0, false, 2, 1, local18, aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray272[0]);
							}
							this.anInt196 = super.anInt192;
							this.anInt197 = super.anInt193;
							this.anInt199 = 2;
							this.anInt198 = 0;
							if (local28 == 662) {
								anInt281 += this.anInt371;
								if (anInt281 >= 118) {
									this.aClass1_Sub1_Sub3_3.method465(122);
									this.aClass1_Sub1_Sub3_3.method470(0);
								}
								this.aClass1_Sub1_Sub3_3.method465(22);
							}
							if (local28 == 139) {
								if ((local18 & 0x3) == 0) {
									anInt343++;
								}
								if (anInt343 >= 123) {
									this.aClass1_Sub1_Sub3_3.method465(133);
									this.aClass1_Sub1_Sub3_3.method470(0);
								}
								this.aClass1_Sub1_Sub3_3.method465(97);
							}
							if (local28 == 778) {
								this.aClass1_Sub1_Sub3_3.method465(4);
							}
							if (local28 == 617) {
								this.aClass1_Sub1_Sub3_3.method465(110);
							}
							if (local28 == 224) {
								anInt312 += local23;
								if (anInt312 >= 75) {
									this.aClass1_Sub1_Sub3_3.method465(168);
									this.aClass1_Sub1_Sub3_3.method466(19);
								}
								this.aClass1_Sub1_Sub3_3.method465(147);
							}
							this.aClass1_Sub1_Sub3_3.method467(local18 + this.anInt370);
							this.aClass1_Sub1_Sub3_3.method467(local23 + this.anInt371);
							this.aClass1_Sub1_Sub3_3.method467(local33);
						}
						if (local28 == 435) {
							this.aClass1_Sub1_Sub3_3.method465(86);
							this.aClass1_Sub1_Sub3_3.method467(local23);
							local583 = Class6.aClass6Array1[local23];
							if (local583.anIntArrayArray7 != null && local583.anIntArrayArray7[0][0] == 5) {
								local176 = local583.anIntArrayArray7[0][1];
								this.anIntArray85[local176] = 1 - this.anIntArray85[local176];
								this.method229(local176);
								this.aBoolean61 = true;
							}
						}
						if (local28 == 357) {
							this.method160(local33, 53, local23, local18);
						}
						if (local28 == 370) {
							local1400 = this.method206(0, aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray271[0], 0, local23, 0, 0, false, 2, 0, local18, aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray272[0]);
							if (!local1400) {
								this.method206(1, aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray271[0], 0, local23, 0, 0, false, 2, 1, local18, aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray272[0]);
							}
							this.anInt196 = super.anInt192;
							this.anInt197 = super.anInt193;
							this.anInt199 = 2;
							this.anInt198 = 0;
							this.aClass1_Sub1_Sub3_3.method465(241);
							this.aClass1_Sub1_Sub3_3.method467(local18 + this.anInt370);
							this.aClass1_Sub1_Sub3_3.method467(local23 + this.anInt371);
							this.aClass1_Sub1_Sub3_3.method467(local33);
							this.aClass1_Sub1_Sub3_3.method467(this.anInt288);
						}
						if (local28 == 639 || local28 == 499 || local28 == 27 || local28 == 387 || local28 == 185) {
							local104 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local33];
							if (local104 != null) {
								this.method206(1, aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray271[0], 0, local104.anIntArray272[0], 0, 0, false, 2, 1, local104.anIntArray271[0], aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray272[0]);
								this.anInt196 = super.anInt192;
								this.anInt197 = super.anInt193;
								this.anInt199 = 2;
								this.anInt198 = 0;
								if (local28 == 185) {
									this.aClass1_Sub1_Sub3_3.method465(69);
								}
								if (local28 == 387) {
									anInt201 += local33;
									if (anInt201 >= 66) {
										this.aClass1_Sub1_Sub3_3.method465(46);
										this.aClass1_Sub1_Sub3_3.method466(154);
									}
									this.aClass1_Sub1_Sub3_3.method465(189);
								}
								if (local28 == 499) {
									this.aClass1_Sub1_Sub3_3.method465(51);
								}
								if (local28 == 639) {
									anInt220++;
									if (anInt220 >= 52) {
										this.aClass1_Sub1_Sub3_3.method465(49);
										this.aClass1_Sub1_Sub3_3.method466(131);
									}
									this.aClass1_Sub1_Sub3_3.method465(220);
								}
								if (local28 == 27) {
									this.aClass1_Sub1_Sub3_3.method465(13);
								}
								this.aClass1_Sub1_Sub3_3.method467(local33);
							}
						}
						if (local28 == 582 || local28 == 113 || local28 == 555 || local28 == 331 || local28 == 354) {
							if (local28 == 555) {
								this.aClass1_Sub1_Sub3_3.method465(124);
							}
							if (local28 == 113) {
								this.aClass1_Sub1_Sub3_3.method465(111);
							}
							if (local28 == 354) {
								this.aClass1_Sub1_Sub3_3.method465(227);
							}
							if (local28 == 582) {
								if ((local33 & 0x3) == 0) {
									anInt411++;
								}
								if (anInt411 >= 133) {
									this.aClass1_Sub1_Sub3_3.method465(73);
									this.aClass1_Sub1_Sub3_3.method467(6118);
								}
								this.aClass1_Sub1_Sub3_3.method465(44);
							}
							if (local28 == 331) {
								this.aClass1_Sub1_Sub3_3.method465(248);
							}
							this.aClass1_Sub1_Sub3_3.method467(local33);
							this.aClass1_Sub1_Sub3_3.method467(local18);
							this.aClass1_Sub1_Sub3_3.method467(local23);
							this.anInt350 = 0;
							this.anInt351 = local23;
							this.anInt352 = local18;
							this.anInt353 = 2;
							if (Class6.aClass6Array1[local23].anInt416 == this.anInt377) {
								this.anInt353 = 1;
							}
							if (Class6.aClass6Array1[local23].anInt416 == this.anInt408) {
								this.anInt353 = 3;
							}
						}
						if (local28 == 1328) {
							local339 = Class15.method358(local33);
							@Pc(2230) Class6 local2230 = Class6.aClass6Array1[local23];
							if (local2230 != null && local2230.anIntArray95[local18] >= 100000) {
								local348 = local2230.anIntArray95[local18] + " x " + local339.aString25;
							} else if (local339.aByteArray6 == null) {
								local348 = "It's a " + local339.aString25 + ".";
							} else {
								local348 = new String(local339.aByteArray6);
							}
							this.method99(0, local348, "");
						}
						this.anInt260 = 0;
						@Pc(2290) boolean local2290 = false;
						this.anInt287 = 0;
						this.aBoolean61 = true;
					}
				}
			}
		} catch (@Pc(2298) RuntimeException local2298) {
			signlink.reporterror("27672, " + arg0 + ", " + arg1 + ", " + local2298.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "h", descriptor = "(Z)V")
	private void method217() {
		try {
			if (this.anInt260 == 0 && this.anInt287 == 0) {
				this.aStringArray1[this.anInt275] = "Walk here";
				this.anIntArray36[this.anInt275] = 718;
				this.anIntArray34[this.anInt275] = super.anInt186;
				this.anIntArray35[this.anInt275] = super.anInt187;
				this.anInt275++;
			}
			@Pc(41) int local41 = -1;
			this.aBoolean57 &= true;
			for (@Pc(49) int local49 = 0; local49 < Class1_Sub1_Sub1_Sub5.anInt494; local49++) {
				@Pc(55) int local55 = Class1_Sub1_Sub1_Sub5.anIntArray150[local49];
				@Pc(59) int local59 = local55 & 0x7F;
				@Pc(65) int local65 = local55 >> 7 & 0x7F;
				@Pc(71) int local71 = local55 >> 29 & 0x3;
				@Pc(77) int local77 = local55 >> 14 & 0x7FFF;
				if (local55 != local41) {
					local41 = local55;
					@Pc(108) int local108;
					@Pc(111) int local111;
					@Pc(267) int local267;
					if (local71 == 2 && this.aClass37_1.method556(this.anInt356, local59, local65, local55) >= 0) {
						@Pc(97) Class9 local97 = Class9.method287(local77);
						if (local97.anIntArray160 != null) {
							@Pc(105) Class36 local105 = Class36.aClass36Array1[local97.anInt516];
							local108 = local105.anInt835;
							local111 = local105.anInt836;
							@Pc(114) int local114 = local105.anInt837;
							@Pc(120) int local120 = anIntArray70[local114 - local111];
							@Pc(129) int local129 = this.anIntArray85[local108] >> local111 & local120;
							if (local129 < 0 || local129 >= local97.anIntArray160.length || local97.anIntArray160[local129] == -1) {
								continue;
							}
							local97 = Class9.method287(local97.anIntArray160[local129]);
						}
						if (this.anInt260 == 1) {
							this.aStringArray1[this.anInt275] = "Use " + this.aString7 + " with @cya@" + local97.aString23;
							this.anIntArray36[this.anInt275] = 810;
							this.anIntArray37[this.anInt275] = local55;
							this.anIntArray34[this.anInt275] = local59;
							this.anIntArray35[this.anInt275] = local65;
							this.anInt275++;
						} else if (this.anInt287 != 1) {
							if (local97.aStringArray8 != null) {
								for (local267 = 4; local267 >= 0; local267--) {
									if (local97.aStringArray8[local267] != null) {
										this.aStringArray1[this.anInt275] = local97.aStringArray8[local267] + " @cya@" + local97.aString23;
										if (local267 == 0) {
											this.anIntArray36[this.anInt275] = 625;
										}
										if (local267 == 1) {
											this.anIntArray36[this.anInt275] = 721;
										}
										if (local267 == 2) {
											this.anIntArray36[this.anInt275] = 743;
										}
										if (local267 == 3) {
											this.anIntArray36[this.anInt275] = 357;
										}
										if (local267 == 4) {
											this.anIntArray36[this.anInt275] = 1071;
										}
										this.anIntArray37[this.anInt275] = local55;
										this.anIntArray34[this.anInt275] = local59;
										this.anIntArray35[this.anInt275] = local65;
										this.anInt275++;
									}
								}
							}
							this.aStringArray1[this.anInt275] = "Examine @cya@" + local97.aString23;
							this.anIntArray36[this.anInt275] = 1381;
							this.anIntArray37[this.anInt275] = local97.anInt501 << 14;
							this.anIntArray34[this.anInt275] = local59;
							this.anIntArray35[this.anInt275] = local65;
							this.anInt275++;
						} else if ((this.anInt289 & 0x4) == 4) {
							this.aStringArray1[this.anInt275] = this.aString9 + " @cya@" + local97.aString23;
							this.anIntArray36[this.anInt275] = 899;
							this.anIntArray37[this.anInt275] = local55;
							this.anIntArray34[this.anInt275] = local59;
							this.anIntArray35[this.anInt275] = local65;
							this.anInt275++;
						}
					}
					@Pc(447) Class1_Sub1_Sub1_Sub1_Sub2 local447;
					@Pc(495) Class1_Sub1_Sub1_Sub1_Sub1 local495;
					if (local71 == 1) {
						@Pc(418) Class1_Sub1_Sub1_Sub1_Sub2 local418 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local77];
						if (local418.aClass13_2.aByte25 == 1 && (local418.anInt980 & 0x7F) == 64 && (local418.anInt981 & 0x7F) == 64) {
							for (local267 = 0; local267 < this.anInt294; local267++) {
								local447 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[this.anIntArray57[local267]];
								if (local447 != null && local447 != local418 && local447.aClass13_2.aByte25 == 1 && local447.anInt980 == local418.anInt980 && local447.anInt981 == local418.anInt981) {
									this.method140(this.anIntArray57[local267], local447.aClass13_2, local59, 559, local65);
								}
							}
							for (local108 = 0; local108 < this.anInt389; local108++) {
								local495 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[this.anIntArray90[local108]];
								if (local495 != null && local495.anInt980 == local418.anInt980 && local495.anInt981 == local418.anInt981) {
									this.method194(local65, local495, local59, this.anIntArray90[local108]);
								}
							}
						}
						this.method140(local77, local418.aClass13_2, local59, 559, local65);
					}
					if (local71 == 0) {
						@Pc(537) Class1_Sub1_Sub1_Sub1_Sub1 local537 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local77];
						if ((local537.anInt980 & 0x7F) == 64 && (local537.anInt981 & 0x7F) == 64) {
							for (local267 = 0; local267 < this.anInt294; local267++) {
								local447 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[this.anIntArray57[local267]];
								if (local447 != null && local447.aClass13_2.aByte25 == 1 && local447.anInt980 == local537.anInt980 && local447.anInt981 == local537.anInt981) {
									this.method140(this.anIntArray57[local267], local447.aClass13_2, local59, 559, local65);
								}
							}
							for (local108 = 0; local108 < this.anInt389; local108++) {
								local495 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[this.anIntArray90[local108]];
								if (local495 != null && local495 != local537 && local495.anInt980 == local537.anInt980 && local495.anInt981 == local537.anInt981) {
									this.method194(local65, local495, local59, this.anIntArray90[local108]);
								}
							}
						}
						this.method194(local65, local537, local59, local77);
					}
					if (local71 == 3) {
						@Pc(656) Class29 local656 = this.aClass29ArrayArrayArray1[this.anInt356][local59][local65];
						if (local656 != null) {
							for (@Pc(663) Class1_Sub1_Sub1_Sub3 local663 = (Class1_Sub1_Sub1_Sub3) local656.method508(); local663 != null; local663 = (Class1_Sub1_Sub1_Sub3) local656.method510()) {
								@Pc(669) Class15 local669 = Class15.method358(local663.anInt171);
								if (this.anInt260 == 1) {
									this.aStringArray1[this.anInt275] = "Use " + this.aString7 + " with @lre@" + local669.aString25;
									this.anIntArray36[this.anInt275] = 111;
									this.anIntArray37[this.anInt275] = local663.anInt171;
									this.anIntArray34[this.anInt275] = local59;
									this.anIntArray35[this.anInt275] = local65;
									this.anInt275++;
								} else if (this.anInt287 != 1) {
									for (local111 = 4; local111 >= 0; local111--) {
										if (local669.aStringArray10 != null && local669.aStringArray10[local111] != null) {
											this.aStringArray1[this.anInt275] = local669.aStringArray10[local111] + " @lre@" + local669.aString25;
											if (local111 == 0) {
												this.anIntArray36[this.anInt275] = 139;
											}
											if (local111 == 1) {
												this.anIntArray36[this.anInt275] = 778;
											}
											if (local111 == 2) {
												this.anIntArray36[this.anInt275] = 617;
											}
											if (local111 == 3) {
												this.anIntArray36[this.anInt275] = 224;
											}
											if (local111 == 4) {
												this.anIntArray36[this.anInt275] = 662;
											}
											this.anIntArray37[this.anInt275] = local663.anInt171;
											this.anIntArray34[this.anInt275] = local59;
											this.anIntArray35[this.anInt275] = local65;
											this.anInt275++;
										} else if (local111 == 2) {
											this.aStringArray1[this.anInt275] = "Take @lre@" + local669.aString25;
											this.anIntArray36[this.anInt275] = 617;
											this.anIntArray37[this.anInt275] = local663.anInt171;
											this.anIntArray34[this.anInt275] = local59;
											this.anIntArray35[this.anInt275] = local65;
											this.anInt275++;
										}
									}
									this.aStringArray1[this.anInt275] = "Examine @lre@" + local669.aString25;
									this.anIntArray36[this.anInt275] = 1152;
									this.anIntArray37[this.anInt275] = local663.anInt171;
									this.anIntArray34[this.anInt275] = local59;
									this.anIntArray35[this.anInt275] = local65;
									this.anInt275++;
								} else if ((this.anInt289 & 0x1) == 1) {
									this.aStringArray1[this.anInt275] = this.aString9 + " @lre@" + local669.aString25;
									this.anIntArray36[this.anInt275] = 370;
									this.anIntArray37[this.anInt275] = local663.anInt171;
									this.anIntArray34[this.anInt275] = local59;
									this.anIntArray35[this.anInt275] = local65;
									this.anInt275++;
								}
							}
						}
					}
				}
			}
		} catch (@Pc(993) RuntimeException local993) {
			signlink.reporterror("60112, " + true + ", " + local993.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "L", descriptor = "(I)V")
	private void method218(@OriginalArg(0) int arg0) {
		try {
			if (arg0 <= 0) {
				this.anInt362 = -1;
			}
			if (this.anInt293 == 2) {
				this.method157((this.anInt403 - this.anInt370 << 7) + this.anInt406, this.anInt405 * 2, (this.anInt404 - this.anInt371 << 7) + this.anInt407);
				if (this.anInt315 > -1 && anInt396 % 20 < 10) {
					this.aClass1_Sub1_Sub2_Sub2Array7[2].method388(this.anInt316 - 28, this.aByte14, this.anInt315 - 12);
				}
			}
		} catch (@Pc(62) RuntimeException local62) {
			signlink.reporterror("57596, " + arg0 + ", " + local62.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IBIIIII)V")
	private void method220(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		try {
			@Pc(16) int local16 = 2048 - arg5 & 0x7FF;
			@Pc(22) int local22 = 2048 - arg1 & 0x7FF;
			@Pc(24) int local24 = 0;
			@Pc(26) int local26 = 0;
			@Pc(28) int local28 = arg0;
			@Pc(34) int local34;
			@Pc(38) int local38;
			@Pc(48) int local48;
			if (local16 != 0) {
				local34 = Class1_Sub1_Sub1_Sub5.anIntArray151[local16];
				local38 = Class1_Sub1_Sub1_Sub5.anIntArray152[local16];
				local48 = local38 * 0 - arg0 * local34 >> 16;
				local28 = local34 * 0 + arg0 * local38 >> 16;
				local26 = local48;
			}
			if (local22 != 0) {
				local34 = Class1_Sub1_Sub1_Sub5.anIntArray151[local22];
				local38 = Class1_Sub1_Sub1_Sub5.anIntArray152[local22];
				local48 = local28 * local34 + local38 * 0 >> 16;
				local28 = local28 * local38 - local34 * 0 >> 16;
				local24 = local48;
			}
			this.anInt223 = arg4 - local24;
			this.anInt224 = arg2 - local26;
			this.anInt225 = arg3 - local28;
			this.anInt226 = arg5;
			this.anInt227 = arg1;
		} catch (@Pc(115) RuntimeException local115) {
			signlink.reporterror("24308, " + arg0 + ", " + 6 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local115.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!nb;Z)V")
	private void method221(@OriginalArg(0) Class1_Sub2 arg0) {
		try {
			@Pc(1) int local1 = 0;
			@Pc(3) int local3 = -1;
			@Pc(5) int local5 = 0;
			@Pc(7) int local7 = 0;
			if (arg0.anInt771 == 0) {
				local1 = this.aClass37_1.method552(arg0.anInt770, arg0.anInt772, arg0.anInt773);
			}
			if (arg0.anInt771 == 1) {
				local1 = this.aClass37_1.method553(arg0.anInt773, arg0.anInt770, arg0.anInt772);
			}
			if (arg0.anInt771 == 2) {
				local1 = this.aClass37_1.method554(arg0.anInt770, arg0.anInt772, arg0.anInt773);
			}
			if (arg0.anInt771 == 3) {
				local1 = this.aClass37_1.method555(arg0.anInt770, arg0.anInt772, arg0.anInt773);
			}
			if (local1 != 0) {
				@Pc(85) int local85 = this.aClass37_1.method556(arg0.anInt770, arg0.anInt772, arg0.anInt773, local1);
				local3 = local1 >> 14 & 0x7FFF;
				local5 = local85 & 0x1F;
				local7 = local85 >> 6;
			}
			arg0.anInt774 = local3;
			arg0.anInt776 = local5;
			arg0.anInt775 = local7;
		} catch (@Pc(110) RuntimeException local110) {
			signlink.reporterror("51962, " + arg0 + ", " + false + ", " + local110.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(ILclient!lb;I)V")
	private void method222(@OriginalArg(1) Class1_Sub1_Sub3 arg0, @OriginalArg(2) int arg1) {
		try {
			@Pc(5) int local5 = arg1 + 0;
			for (@Pc(7) int local7 = 0; local7 < this.anInt390; local7++) {
				@Pc(14) int local14 = this.anIntArray91[local7];
				@Pc(19) Class1_Sub1_Sub1_Sub1_Sub2 local19 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local14];
				@Pc(22) int local22 = arg0.method476();
				@Pc(30) int local30;
				@Pc(33) int local33;
				if ((local22 & 0x1) == 1) {
					local30 = arg0.method476();
					local33 = arg0.method476();
					local19.method677(local33, anInt396, local30);
					local19.anInt994 = anInt396 + 300;
					local19.anInt995 = arg0.method476();
					local19.anInt996 = arg0.method476();
				}
				if ((local22 & 0x2) == 2) {
					local30 = arg0.method478();
					if (local30 == 65535) {
						local30 = -1;
					}
					if (local30 == local19.anInt1003) {
						local19.anInt1007 = 0;
					}
					local33 = arg0.method476();
					if (local30 == local19.anInt1003 && local30 != -1) {
						@Pc(87) int local87 = Class27.aClass27Array1[local30].anInt791;
						if (local87 == 1) {
							local19.anInt1004 = 0;
							local19.anInt1005 = 0;
							local19.anInt1006 = local33;
							local19.anInt1007 = 0;
						}
						if (local87 == 2) {
							local19.anInt1007 = 0;
						}
					} else if (local30 == -1 || local19.anInt1003 == -1 || Class27.aClass27Array1[local30].anInt785 >= Class27.aClass27Array1[local19.anInt1003].anInt785) {
						local19.anInt1003 = local30;
						local19.anInt1004 = 0;
						local19.anInt1005 = 0;
						local19.anInt1006 = local33;
						local19.anInt1007 = 0;
						local19.anInt1026 = local19.anInt1024;
					}
				}
				if ((local22 & 0x4) == 4) {
					local19.anInt997 = arg0.method478();
					if (local19.anInt997 == 65535) {
						local19.anInt997 = -1;
					}
				}
				if ((local22 & 0x8) == 8) {
					local19.aString31 = arg0.method483();
					local19.anInt991 = 100;
				}
				if ((local22 & 0x10) == 16) {
					local30 = arg0.method476();
					local33 = arg0.method476();
					local19.method677(local33, anInt396, local30);
					local19.anInt994 = anInt396 + 300;
					local19.anInt995 = arg0.method476();
					local19.anInt996 = arg0.method476();
				}
				if ((local22 & 0x20) == 32) {
					local19.aClass13_2 = Class13.method321(arg0.method478());
					local19.anInt983 = local19.aClass13_2.aByte25;
					local19.anInt1023 = local19.aClass13_2.anInt563;
					local19.anInt986 = local19.aClass13_2.anInt550;
					local19.anInt987 = local19.aClass13_2.anInt551;
					local19.anInt988 = local19.aClass13_2.anInt552;
					local19.anInt989 = local19.aClass13_2.anInt553;
					local19.anInt984 = local19.aClass13_2.anInt549;
				}
				if ((local22 & 0x40) == 64) {
					local19.anInt1008 = arg0.method478();
					local30 = arg0.method481();
					local19.anInt1012 = local30 >> 16;
					local19.anInt1011 = anInt396 + (local30 & 0xFFFF);
					local19.anInt1009 = 0;
					local19.anInt1010 = 0;
					if (local19.anInt1011 > anInt396) {
						local19.anInt1009 = -1;
					}
					if (local19.anInt1008 == 65535) {
						local19.anInt1008 = -1;
					}
				}
				if ((local22 & 0x80) == 128) {
					local19.anInt998 = arg0.method478();
					local19.anInt999 = arg0.method478();
				}
			}
		} catch (@Pc(313) RuntimeException local313) {
			signlink.reporterror("44339, " + 0 + ", " + arg0 + ", " + arg1 + ", " + local313.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(ILclient!ib;II)V")
	private void method223(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub1_Sub2_Sub2 arg1, @OriginalArg(3) int arg2) {
		try {
			@Pc(7) int local7 = this.anInt249 + this.anInt266 & 0x7FF;
			@Pc(15) int local15 = arg0 * arg0 + arg2 * arg2;
			if (local15 <= 6400) {
				@Pc(23) int local23 = Class1_Sub1_Sub1_Sub5.anIntArray151[local7];
				@Pc(27) int local27 = Class1_Sub1_Sub1_Sub5.anIntArray152[local7];
				@Pc(36) int local36 = local23 * 256 / (this.anInt322 + 256);
				@Pc(45) int local45 = local27 * 256 / (this.anInt322 + 256);
				@Pc(64) int local64 = arg2 * local36 + arg0 * local45 >> 16;
				@Pc(74) int local74 = arg2 * local45 - arg0 * local36 >> 16;
				if (local15 > 2500) {
					arg1.method394(local64 + 94 + 4 - arg1.anInt647 / 2, this.aClass1_Sub1_Sub2_Sub3_19, 83 - local74 - arg1.anInt648 / 2 - 4);
				} else {
					arg1.method388(83 - local74 - arg1.anInt648 / 2 - 4, this.aByte14, local64 + 94 + 4 - arg1.anInt647 / 2);
				}
			}
		} catch (@Pc(129) RuntimeException local129) {
			signlink.reporterror("87513, " + arg0 + ", " + arg1 + ", " + 139 + ", " + arg2 + ", " + local129.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(IJ)V")
	private void method224(@OriginalArg(1) long arg0) {
		try {
			if (arg0 != 0L) {
				for (@Pc(13) int local13 = 0; local13 < this.anInt264; local13++) {
					if (this.aLongArray4[local13] == arg0) {
						this.anInt264--;
						this.aBoolean61 = true;
						for (@Pc(33) int local33 = local13; local33 < this.anInt264; local33++) {
							this.aLongArray4[local33] = this.aLongArray4[local33 + 1];
						}
						this.aClass1_Sub1_Sub3_3.method465(251);
						this.aClass1_Sub1_Sub3_3.method472(arg0);
						return;
					}
				}
			}
		} catch (@Pc(68) RuntimeException local68) {
			signlink.reporterror("81778, " + -197 + ", " + arg0 + ", " + local68.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "M", descriptor = "(I)V")
	private void method225() {
		try {
			if (this.anInt215 == 0 && super.anInt191 == 1) {
				@Pc(20) int local20 = super.anInt192 - 25 - 550;
				@Pc(27) int local27 = super.anInt193 - 5 - 4;
				if (local20 >= 0 && local27 >= 0 && local20 < 146 && local27 < 151) {
					local20 -= 73;
					local27 -= 75;
					@Pc(47) int local47 = this.anInt249 + this.anInt266 & 0x7FF;
					@Pc(51) int local51 = Class1_Sub1_Sub2_Sub1.anIntArray177[local47];
					@Pc(55) int local55 = Class1_Sub1_Sub2_Sub1.anIntArray178[local47];
					@Pc(64) int local64 = local51 * (this.anInt322 + 256) >> 8;
					@Pc(73) int local73 = local55 * (this.anInt322 + 256) >> 8;
					@Pc(83) int local83 = local27 * local64 + local20 * local73 >> 11;
					@Pc(93) int local93 = local27 * local73 - local20 * local64 >> 11;
					@Pc(100) int local100 = aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt980 + local83 >> 7;
					@Pc(107) int local107 = aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt981 - local93 >> 7;
					@Pc(128) boolean local128 = this.method206(0, aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray271[0], 0, local107, 0, 0, true, 1, 0, local100, aClass1_Sub1_Sub1_Sub1_Sub1_1.anIntArray272[0]);
					if (local128) {
						this.aClass1_Sub1_Sub3_3.method466(local20);
						this.aClass1_Sub1_Sub3_3.method466(local27);
						this.aClass1_Sub1_Sub3_3.method467(this.anInt249);
						this.aClass1_Sub1_Sub3_3.method466(57);
						this.aClass1_Sub1_Sub3_3.method466(this.anInt266);
						this.aClass1_Sub1_Sub3_3.method466(this.anInt322);
						this.aClass1_Sub1_Sub3_3.method466(89);
						this.aClass1_Sub1_Sub3_3.method467(aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt980);
						this.aClass1_Sub1_Sub3_3.method467(aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt981);
						this.aClass1_Sub1_Sub3_3.method466(this.anInt276);
						this.aClass1_Sub1_Sub3_3.method466(63);
						return;
					}
				}
			}
		} catch (@Pc(182) RuntimeException local182) {
			signlink.reporterror("62107, " + 176 + ", " + local182.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(ILclient!lb;I)V")
	private void method226(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub1_Sub3 arg1, @OriginalArg(2) int arg2) {
		try {
			arg1.method486();
			@Pc(9) int local9 = arg1.method487(8);
			@Pc(15) int local15;
			if (local9 < this.anInt294) {
				for (local15 = local9; local15 < this.anInt294; local15++) {
					this.anIntArray49[this.anInt254++] = this.anIntArray57[local15];
				}
			}
			if (local9 > this.anInt294) {
				signlink.reporterror(this.aString11 + " Too many npcs");
				throw new RuntimeException("eek");
			}
			this.anInt294 = 0;
			for (local15 = 0; local15 < local9; local15++) {
				@Pc(67) int local67 = this.anIntArray57[local15];
				@Pc(72) Class1_Sub1_Sub1_Sub1_Sub2 local72 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local67];
				@Pc(77) int local77 = arg1.method487(1);
				if (local77 == 0) {
					this.anIntArray57[this.anInt294++] = local67;
					local72.anInt1020 = anInt396;
				} else {
					@Pc(100) int local100 = arg1.method487(2);
					if (local100 == 0) {
						this.anIntArray57[this.anInt294++] = local67;
						local72.anInt1020 = anInt396;
						this.anIntArray91[this.anInt390++] = local67;
					} else {
						@Pc(151) int local151;
						@Pc(162) int local162;
						if (local100 == 1) {
							this.anIntArray57[this.anInt294++] = local67;
							local72.anInt1020 = anInt396;
							local151 = arg1.method487(3);
							local72.method674(false, local151, this.anInt355);
							local162 = arg1.method487(1);
							if (local162 == 1) {
								this.anIntArray91[this.anInt390++] = local67;
							}
						} else if (local100 == 2) {
							this.anIntArray57[this.anInt294++] = local67;
							local72.anInt1020 = anInt396;
							local151 = arg1.method487(3);
							local72.method674(true, local151, this.anInt355);
							local162 = arg1.method487(3);
							local72.method674(true, local162, this.anInt355);
							@Pc(222) int local222 = arg1.method487(1);
							if (local222 == 1) {
								this.anIntArray91[this.anInt390++] = local67;
							}
						} else if (local100 == 3) {
							this.anIntArray49[this.anInt254++] = local67;
						}
					}
				}
			}
			if (arg2 < 9 || arg2 > 9) {
				this.anInt362 = -1;
			}
		} catch (@Pc(268) RuntimeException local268) {
			signlink.reporterror("93413, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local268.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(I)V")
	@Override
	protected void method90(@OriginalArg(0) int arg0) {
		try {
			signlink.reporterror = false;
			try {
				if (this.aClass8_1 != null) {
					this.aClass8_1.method246();
				}
			} catch (@Pc(11) Exception local11) {
			}
			this.aClass8_1 = null;
			this.method100();
			if (this.aClass11_1 != null) {
				this.aClass11_1.aBoolean138 = false;
			}
			this.aClass11_1 = null;
			this.aClass44_Sub1_1.method633();
			this.aClass44_Sub1_1 = null;
			this.aClass1_Sub1_Sub3_3 = null;
			this.aClass1_Sub1_Sub3_2 = null;
			this.aClass1_Sub1_Sub3_4 = null;
			this.anIntArray64 = null;
			this.aByteArrayArray2 = null;
			this.aByteArrayArray1 = null;
			this.anIntArray65 = null;
			this.anIntArray66 = null;
			this.anIntArrayArrayArray5 = null;
			this.aByteArrayArrayArray7 = null;
			this.aClass37_1 = null;
			this.aClass19Array1 = null;
			this.anIntArrayArray6 = null;
			this.anIntArrayArray4 = null;
			this.anIntArray60 = null;
			this.anIntArray61 = null;
			this.aByteArray2 = null;
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
			this.aClass35_12 = null;
			this.aClass35_13 = null;
			this.aClass35_14 = null;
			this.aClass1_Sub1_Sub2_Sub3_18 = null;
			this.aClass1_Sub1_Sub2_Sub3_19 = null;
			this.aClass1_Sub1_Sub2_Sub3_20 = null;
			this.aClass1_Sub1_Sub2_Sub3_8 = null;
			this.aClass1_Sub1_Sub2_Sub3_9 = null;
			this.aClass1_Sub1_Sub2_Sub3_10 = null;
			this.aClass1_Sub1_Sub2_Sub3Array4 = null;
			this.aClass1_Sub1_Sub2_Sub3_13 = null;
			this.aClass1_Sub1_Sub2_Sub3_14 = null;
			this.aClass1_Sub1_Sub2_Sub3_15 = null;
			this.aClass1_Sub1_Sub2_Sub3_16 = null;
			this.aClass1_Sub1_Sub2_Sub3_17 = null;
			this.aClass1_Sub1_Sub2_Sub3_1 = null;
			this.aClass1_Sub1_Sub2_Sub3_2 = null;
			this.aClass1_Sub1_Sub2_Sub3_3 = null;
			this.aClass1_Sub1_Sub2_Sub3_4 = null;
			this.aClass1_Sub1_Sub2_Sub3_5 = null;
			this.aClass1_Sub1_Sub2_Sub2_2 = null;
			this.aClass1_Sub1_Sub2_Sub2Array6 = null;
			this.aClass1_Sub1_Sub2_Sub2Array7 = null;
			this.aClass1_Sub1_Sub2_Sub2Array3 = null;
			this.aClass1_Sub1_Sub2_Sub2_5 = null;
			this.aClass1_Sub1_Sub2_Sub2_6 = null;
			this.aClass1_Sub1_Sub2_Sub2_7 = null;
			this.aClass1_Sub1_Sub2_Sub2_8 = null;
			this.aClass1_Sub1_Sub2_Sub3Array3 = null;
			this.aClass1_Sub1_Sub2_Sub2Array5 = null;
			this.anIntArrayArray3 = null;
			this.aClass1_Sub1_Sub1_Sub1_Sub1Array1 = null;
			this.anIntArray90 = null;
			this.anIntArray91 = null;
			this.aClass1_Sub1_Sub3Array1 = null;
			this.anIntArray49 = null;
			this.aClass1_Sub1_Sub1_Sub1_Sub2Array1 = null;
			this.anIntArray57 = null;
			this.aClass29ArrayArrayArray1 = null;
			this.aClass29_3 = null;
			this.aClass29_1 = null;
			this.aClass29_2 = null;
			this.anIntArray34 = null;
			this.anIntArray35 = null;
			this.anIntArray36 = null;
			this.anIntArray37 = null;
			this.aStringArray1 = null;
			this.anIntArray85 = null;
			this.anIntArray32 = null;
			this.anIntArray33 = null;
			this.aClass1_Sub1_Sub2_Sub2Array4 = null;
			this.aClass1_Sub1_Sub2_Sub2_1 = null;
			this.aStringArray5 = null;
			this.aLongArray3 = null;
			this.anIntArray43 = null;
			this.aClass35_22 = null;
			this.aClass35_23 = null;
			this.aClass35_19 = null;
			this.aClass35_20 = null;
			this.aClass35_21 = null;
			this.aClass35_24 = null;
			this.aClass35_25 = null;
			this.aClass35_26 = null;
			this.aClass35_27 = null;
			this.method210();
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
			Class37.method525();
			Class1_Sub1_Sub1_Sub5.method256();
			Class12.method302();
			System.gc();
		} catch (@Pc(369) RuntimeException local369) {
			signlink.reporterror("75879, " + 874 + ", " + local369.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "v", descriptor = "(B)V")
	private void method227(@OriginalArg(0) byte arg0) {
		try {
			@Pc(6) boolean local6 = false;
			if (super.anInt191 == 1) {
				if (super.anInt192 >= 6 && super.anInt192 <= 106 && super.anInt193 >= 467 && super.anInt193 <= 499) {
					this.anInt212 = (this.anInt212 + 1) % 4;
					this.aBoolean79 = true;
					this.aBoolean74 = true;
					this.aClass1_Sub1_Sub3_3.method465(161);
					this.aClass1_Sub1_Sub3_3.method466(this.anInt212);
					this.aClass1_Sub1_Sub3_3.method466(this.anInt234);
					this.aClass1_Sub1_Sub3_3.method466(this.anInt360);
				}
				if (super.anInt192 >= 135 && super.anInt192 <= 235 && super.anInt193 >= 467 && super.anInt193 <= 499) {
					this.anInt234 = (this.anInt234 + 1) % 3;
					this.aBoolean79 = true;
					this.aBoolean74 = true;
					this.aClass1_Sub1_Sub3_3.method465(161);
					this.aClass1_Sub1_Sub3_3.method466(this.anInt212);
					this.aClass1_Sub1_Sub3_3.method466(this.anInt234);
					this.aClass1_Sub1_Sub3_3.method466(this.anInt360);
				}
				if (super.anInt192 >= 273 && super.anInt192 <= 373 && super.anInt193 >= 467 && super.anInt193 <= 499) {
					this.anInt360 = (this.anInt360 + 1) % 3;
					this.aBoolean79 = true;
					this.aBoolean74 = true;
					this.aClass1_Sub1_Sub3_3.method465(161);
					this.aClass1_Sub1_Sub3_3.method466(this.anInt212);
					this.aClass1_Sub1_Sub3_3.method466(this.anInt234);
					this.aClass1_Sub1_Sub3_3.method466(this.anInt360);
				}
				if (super.anInt192 >= 412 && super.anInt192 <= 512 && super.anInt193 >= 467 && super.anInt193 <= 499) {
					if (this.anInt377 == -1) {
						this.method110();
						this.aString6 = "";
						this.aBoolean72 = false;
						for (@Pc(194) int local194 = 0; local194 < Class6.aClass6Array1.length; local194++) {
							if (Class6.aClass6Array1[local194] != null && Class6.aClass6Array1[local194].anInt419 == 600) {
								this.anInt386 = this.anInt377 = Class6.aClass6Array1[local194].anInt416;
								return;
							}
						}
						return;
					}
					this.method99(0, "Please close the interface you have open before using 'report abuse'", "");
					return;
				}
			}
		} catch (@Pc(230) RuntimeException local230) {
			signlink.reporterror("77202, " + arg0 + ", " + local230.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "([BII)Z")
	private boolean method228(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1) {
		try {
			return arg0 == null ? true : signlink.wavesave(arg0, arg1);
		} catch (@Pc(14) RuntimeException local14) {
			signlink.reporterror("56223, " + arg0 + ", " + 0 + ", " + arg1 + ", " + local14.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(ZI)V")
	private void method229(@OriginalArg(1) int arg0) {
		try {
			this.aBoolean57 &= true;
			@Pc(10) int local10 = Class39.aClass39Array1[arg0].anInt886;
			if (local10 != 0) {
				@Pc(18) int local18 = this.anIntArray85[arg0];
				if (local10 == 1) {
					if (local18 == 1) {
						Class1_Sub1_Sub2_Sub1.method348(0.9D);
					}
					if (local18 == 2) {
						Class1_Sub1_Sub2_Sub1.method348(0.8D);
					}
					if (local18 == 3) {
						Class1_Sub1_Sub2_Sub1.method348(0.7D);
					}
					if (local18 == 4) {
						Class1_Sub1_Sub2_Sub1.method348(0.6D);
					}
					Class15.aClass40_8.method589();
					this.aBoolean63 = true;
				}
				if (local10 == 3) {
					@Pc(56) boolean local56 = this.aBoolean77;
					if (local18 == 0) {
						this.method141(0, this.aBoolean77);
						this.aBoolean77 = true;
					}
					if (local18 == 1) {
						this.method141(-400, this.aBoolean77);
						this.aBoolean77 = true;
					}
					if (local18 == 2) {
						this.method141(-800, this.aBoolean77);
						this.aBoolean77 = true;
					}
					if (local18 == 3) {
						this.method141(-1200, this.aBoolean77);
						this.aBoolean77 = true;
					}
					if (local18 == 4) {
						this.aBoolean77 = false;
					}
					if (this.aBoolean77 != local56 && !aBoolean90) {
						if (this.aBoolean77) {
							this.anInt376 = this.anInt269;
							this.aBoolean87 = true;
							this.aClass44_Sub1_1.method641(2, this.anInt376);
						} else {
							this.method100();
						}
						this.anInt255 = 0;
					}
				}
				if (local10 == 4) {
					if (local18 == 0) {
						this.aBoolean75 = true;
						this.method167(this.aBoolean71, 0);
					}
					if (local18 == 1) {
						this.aBoolean75 = true;
						this.method167(this.aBoolean71, -400);
					}
					if (local18 == 2) {
						this.aBoolean75 = true;
						this.method167(this.aBoolean71, -800);
					}
					if (local18 == 3) {
						this.aBoolean75 = true;
						this.method167(this.aBoolean71, -1200);
					}
					if (local18 == 4) {
						this.aBoolean75 = false;
					}
				}
				if (local10 == 5) {
					this.anInt218 = local18;
				}
				if (local10 == 6) {
					this.anInt274 = local18;
				}
				if (local10 == 8) {
					this.anInt299 = local18;
					this.aBoolean74 = true;
				}
				if (local10 == 9) {
					this.anInt209 = local18;
				}
			}
		} catch (@Pc(220) RuntimeException local220) {
			signlink.reporterror("33016, " + true + ", " + arg0 + ", " + local220.toString());
			throw new RuntimeException();
		}
	}
}
