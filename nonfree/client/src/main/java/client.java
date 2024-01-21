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

	@OriginalMember(owner = "client!client", name = "sb", descriptor = "I")
	private static int anInt252;

	@OriginalMember(owner = "client!client", name = "Fb", descriptor = "I")
	public static int anInt262;

	@OriginalMember(owner = "client!client", name = "Hb", descriptor = "Z")
	private static boolean aBoolean48;

	@OriginalMember(owner = "client!client", name = "Ob", descriptor = "I")
	private static int anInt265;

	@OriginalMember(owner = "client!client", name = "Pb", descriptor = "Lclient!bb;")
	public static Class1_Sub1_Sub1_Sub1_Sub2 aClass1_Sub1_Sub1_Sub1_Sub2_1;

	@OriginalMember(owner = "client!client", name = "Sb", descriptor = "I")
	private static int anInt266;

	@OriginalMember(owner = "client!client", name = "bd", descriptor = "I")
	private static int anInt294;

	@OriginalMember(owner = "client!client", name = "vd", descriptor = "I")
	private static int anInt300;

	@OriginalMember(owner = "client!client", name = "Ad", descriptor = "Z")
	private static boolean aBoolean57;

	@OriginalMember(owner = "client!client", name = "Gd", descriptor = "I")
	private static int anInt304;

	@OriginalMember(owner = "client!client", name = "de", descriptor = "I")
	private static int anInt309;

	@OriginalMember(owner = "client!client", name = "Ve", descriptor = "Z")
	private static boolean aBoolean66;

	@OriginalMember(owner = "client!client", name = "of", descriptor = "I")
	private static int anInt337;

	@OriginalMember(owner = "client!client", name = "Gf", descriptor = "I")
	private static int anInt342;

	@OriginalMember(owner = "client!client", name = "Kf", descriptor = "Z")
	private static boolean aBoolean69;

	@OriginalMember(owner = "client!client", name = "Lf", descriptor = "I")
	private static int anInt346;

	@OriginalMember(owner = "client!client", name = "yg", descriptor = "I")
	private static int anInt358;

	@OriginalMember(owner = "client!client", name = "Dg", descriptor = "I")
	private static int anInt361;

	@OriginalMember(owner = "client!client", name = "Ug", descriptor = "I")
	private static int anInt371;

	@OriginalMember(owner = "client!client", name = "rh", descriptor = "I")
	private static int anInt380;

	@OriginalMember(owner = "client!client", name = "zh", descriptor = "I")
	private static int anInt386;

	@OriginalMember(owner = "client!client", name = "fj", descriptor = "I")
	private static int anInt438;

	@OriginalMember(owner = "client!client", name = "lj", descriptor = "I")
	private static int anInt441;

	@OriginalMember(owner = "client!client", name = "uj", descriptor = "I")
	public static int anInt446;

	@OriginalMember(owner = "client!client", name = "Eb", descriptor = "I")
	private static int anInt261 = 10;

	@OriginalMember(owner = "client!client", name = "Gb", descriptor = "Z")
	private static boolean aBoolean47 = true;

	@OriginalMember(owner = "client!client", name = "Qc", descriptor = "[I")
	private static int[] anIntArray46 = new int[32];

	@OriginalMember(owner = "client!client", name = "fe", descriptor = "I")
	private static int anInt311;

	@OriginalMember(owner = "client!client", name = "Ue", descriptor = "Ljava/math/BigInteger;")
	private static BigInteger aBigInteger1;

	@OriginalMember(owner = "client!client", name = "af", descriptor = "Ljava/lang/String;")
	private static String aString13;

	@OriginalMember(owner = "client!client", name = "hf", descriptor = "I")
	private static int anInt336;

	@OriginalMember(owner = "client!client", name = "yf", descriptor = "[[I")
	public static final int[][] anIntArrayArray3;

	@OriginalMember(owner = "client!client", name = "Pf", descriptor = "Ljava/math/BigInteger;")
	private static BigInteger aBigInteger2;

	@OriginalMember(owner = "client!client", name = "yh", descriptor = "[I")
	private static int[] anIntArray84;

	@OriginalMember(owner = "client!client", name = "Qh", descriptor = "[I")
	public static final int[] anIntArray87;

	@OriginalMember(owner = "client!client", name = "J", descriptor = "Ljava/lang/String;")
	private String aString5;

	@OriginalMember(owner = "client!client", name = "K", descriptor = "I")
	private int anInt244;

	@OriginalMember(owner = "client!client", name = "M", descriptor = "I")
	private int anInt245;

	@OriginalMember(owner = "client!client", name = "O", descriptor = "I")
	private int anInt247;

	@OriginalMember(owner = "client!client", name = "R", descriptor = "Lclient!rb;")
	private Class37 aClass37_3;

	@OriginalMember(owner = "client!client", name = "S", descriptor = "Lclient!rb;")
	private Class37 aClass37_4;

	@OriginalMember(owner = "client!client", name = "T", descriptor = "Lclient!rb;")
	private Class37 aClass37_5;

	@OriginalMember(owner = "client!client", name = "U", descriptor = "Lclient!rb;")
	private Class37 aClass37_6;

	@OriginalMember(owner = "client!client", name = "V", descriptor = "Lclient!rb;")
	private Class37 aClass37_7;

	@OriginalMember(owner = "client!client", name = "W", descriptor = "Lclient!rb;")
	private Class37 aClass37_8;

	@OriginalMember(owner = "client!client", name = "X", descriptor = "Lclient!rb;")
	private Class37 aClass37_9;

	@OriginalMember(owner = "client!client", name = "Y", descriptor = "Lclient!rb;")
	private Class37 aClass37_10;

	@OriginalMember(owner = "client!client", name = "Z", descriptor = "Lclient!rb;")
	private Class37 aClass37_11;

	@OriginalMember(owner = "client!client", name = "bb", descriptor = "Lclient!rb;")
	private Class37 aClass37_12;

	@OriginalMember(owner = "client!client", name = "cb", descriptor = "Lclient!rb;")
	private Class37 aClass37_13;

	@OriginalMember(owner = "client!client", name = "db", descriptor = "Lclient!rb;")
	private Class37 aClass37_14;

	@OriginalMember(owner = "client!client", name = "eb", descriptor = "Lclient!rb;")
	private Class37 aClass37_15;

	@OriginalMember(owner = "client!client", name = "fb", descriptor = "Lclient!rb;")
	private Class37 aClass37_16;

	@OriginalMember(owner = "client!client", name = "gb", descriptor = "Lclient!rb;")
	private Class37 aClass37_17;

	@OriginalMember(owner = "client!client", name = "hb", descriptor = "Lclient!rb;")
	private Class37 aClass37_18;

	@OriginalMember(owner = "client!client", name = "ib", descriptor = "Lclient!rb;")
	private Class37 aClass37_19;

	@OriginalMember(owner = "client!client", name = "jb", descriptor = "Lclient!rb;")
	private Class37 aClass37_20;

	@OriginalMember(owner = "client!client", name = "ob", descriptor = "I")
	private int anInt250;

	@OriginalMember(owner = "client!client", name = "qb", descriptor = "I")
	private int anInt251;

	@OriginalMember(owner = "client!client", name = "tb", descriptor = "I")
	private int anInt253;

	@OriginalMember(owner = "client!client", name = "xb", descriptor = "I")
	private int anInt255;

	@OriginalMember(owner = "client!client", name = "zb", descriptor = "I")
	private int anInt256;

	@OriginalMember(owner = "client!client", name = "Ab", descriptor = "I")
	private int anInt257;

	@OriginalMember(owner = "client!client", name = "Bb", descriptor = "I")
	private int anInt258;

	@OriginalMember(owner = "client!client", name = "Cb", descriptor = "I")
	private int anInt259;

	@OriginalMember(owner = "client!client", name = "Jb", descriptor = "Lclient!jb;")
	private Class1_Sub1_Sub2_Sub2 aClass1_Sub1_Sub2_Sub2_1;

	@OriginalMember(owner = "client!client", name = "Mb", descriptor = "I")
	private int anInt264;

	@OriginalMember(owner = "client!client", name = "Tb", descriptor = "Lclient!jb;")
	private Class1_Sub1_Sub2_Sub2 aClass1_Sub1_Sub2_Sub2_2;

	@OriginalMember(owner = "client!client", name = "Ub", descriptor = "Lclient!jb;")
	private Class1_Sub1_Sub2_Sub2 aClass1_Sub1_Sub2_Sub2_3;

	@OriginalMember(owner = "client!client", name = "ac", descriptor = "I")
	private int anInt267;

	@OriginalMember(owner = "client!client", name = "bc", descriptor = "I")
	private int anInt268;

	@OriginalMember(owner = "client!client", name = "cc", descriptor = "I")
	private int anInt269;

	@OriginalMember(owner = "client!client", name = "dc", descriptor = "I")
	private int anInt270;

	@OriginalMember(owner = "client!client", name = "ec", descriptor = "I")
	private int anInt271;

	@OriginalMember(owner = "client!client", name = "gc", descriptor = "I")
	private int anInt272;

	@OriginalMember(owner = "client!client", name = "hc", descriptor = "I")
	private int anInt273;

	@OriginalMember(owner = "client!client", name = "ic", descriptor = "I")
	private int anInt274;

	@OriginalMember(owner = "client!client", name = "jc", descriptor = "I")
	private int anInt275;

	@OriginalMember(owner = "client!client", name = "kc", descriptor = "I")
	private int anInt276;

	@OriginalMember(owner = "client!client", name = "lc", descriptor = "I")
	private int anInt277;

	@OriginalMember(owner = "client!client", name = "pc", descriptor = "I")
	private int anInt280;

	@OriginalMember(owner = "client!client", name = "qc", descriptor = "I")
	private int anInt281;

	@OriginalMember(owner = "client!client", name = "sc", descriptor = "Lclient!kb;")
	private Class1_Sub1_Sub2_Sub3 aClass1_Sub1_Sub2_Sub3_1;

	@OriginalMember(owner = "client!client", name = "tc", descriptor = "Lclient!kb;")
	private Class1_Sub1_Sub2_Sub3 aClass1_Sub1_Sub2_Sub3_2;

	@OriginalMember(owner = "client!client", name = "uc", descriptor = "Lclient!kb;")
	private Class1_Sub1_Sub2_Sub3 aClass1_Sub1_Sub2_Sub3_3;

	@OriginalMember(owner = "client!client", name = "vc", descriptor = "Lclient!kb;")
	private Class1_Sub1_Sub2_Sub3 aClass1_Sub1_Sub2_Sub3_4;

	@OriginalMember(owner = "client!client", name = "wc", descriptor = "Lclient!kb;")
	private Class1_Sub1_Sub2_Sub3 aClass1_Sub1_Sub2_Sub3_5;

	@OriginalMember(owner = "client!client", name = "xc", descriptor = "Lclient!vb;")
	private Class45_Sub1 aClass45_Sub1_1;

	@OriginalMember(owner = "client!client", name = "Bc", descriptor = "I")
	private int anInt283;

	@OriginalMember(owner = "client!client", name = "Cc", descriptor = "I")
	private int anInt284;

	@OriginalMember(owner = "client!client", name = "Dc", descriptor = "I")
	private int anInt285;

	@OriginalMember(owner = "client!client", name = "Ec", descriptor = "I")
	private int anInt286;

	@OriginalMember(owner = "client!client", name = "Fc", descriptor = "Ljava/lang/String;")
	private String aString7;

	@OriginalMember(owner = "client!client", name = "Lc", descriptor = "I")
	private int anInt287;

	@OriginalMember(owner = "client!client", name = "Mc", descriptor = "I")
	private int anInt288;

	@OriginalMember(owner = "client!client", name = "Nc", descriptor = "Lclient!kb;")
	private Class1_Sub1_Sub2_Sub3 aClass1_Sub1_Sub2_Sub3_6;

	@OriginalMember(owner = "client!client", name = "Oc", descriptor = "Lclient!kb;")
	private Class1_Sub1_Sub2_Sub3 aClass1_Sub1_Sub2_Sub3_7;

	@OriginalMember(owner = "client!client", name = "Pc", descriptor = "Lclient!kb;")
	private Class1_Sub1_Sub2_Sub3 aClass1_Sub1_Sub2_Sub3_8;

	@OriginalMember(owner = "client!client", name = "Rc", descriptor = "[[B")
	private byte[][] aByteArrayArray1;

	@OriginalMember(owner = "client!client", name = "Tc", descriptor = "Lclient!kb;")
	private Class1_Sub1_Sub2_Sub3 aClass1_Sub1_Sub2_Sub3_9;

	@OriginalMember(owner = "client!client", name = "Uc", descriptor = "Lclient!kb;")
	private Class1_Sub1_Sub2_Sub3 aClass1_Sub1_Sub2_Sub3_10;

	@OriginalMember(owner = "client!client", name = "Vc", descriptor = "I")
	private int anInt289;

	@OriginalMember(owner = "client!client", name = "Wc", descriptor = "I")
	private int anInt290;

	@OriginalMember(owner = "client!client", name = "Xc", descriptor = "I")
	private int anInt291;

	@OriginalMember(owner = "client!client", name = "Yc", descriptor = "I")
	private int anInt292;

	@OriginalMember(owner = "client!client", name = "Zc", descriptor = "I")
	private int anInt293;

	@OriginalMember(owner = "client!client", name = "dd", descriptor = "I")
	private int anInt295;

	@OriginalMember(owner = "client!client", name = "fd", descriptor = "I")
	private int anInt296;

	@OriginalMember(owner = "client!client", name = "gd", descriptor = "I")
	private int anInt297;

	@OriginalMember(owner = "client!client", name = "hd", descriptor = "Lclient!jb;")
	private Class1_Sub1_Sub2_Sub2 aClass1_Sub1_Sub2_Sub2_4;

	@OriginalMember(owner = "client!client", name = "id", descriptor = "[[B")
	private byte[][] aByteArrayArray2;

	@OriginalMember(owner = "client!client", name = "od", descriptor = "I")
	private int anInt299;

	@OriginalMember(owner = "client!client", name = "qd", descriptor = "Lclient!jb;")
	private Class1_Sub1_Sub2_Sub2 aClass1_Sub1_Sub2_Sub2_5;

	@OriginalMember(owner = "client!client", name = "rd", descriptor = "Lclient!jb;")
	private Class1_Sub1_Sub2_Sub2 aClass1_Sub1_Sub2_Sub2_6;

	@OriginalMember(owner = "client!client", name = "sd", descriptor = "J")
	private long aLong14;

	@OriginalMember(owner = "client!client", name = "ud", descriptor = "Lclient!fc;")
	private Class11 aClass11_1;

	@OriginalMember(owner = "client!client", name = "xd", descriptor = "I")
	private int anInt301;

	@OriginalMember(owner = "client!client", name = "zd", descriptor = "I")
	private int anInt302;

	@OriginalMember(owner = "client!client", name = "Bd", descriptor = "I")
	private int anInt303;

	@OriginalMember(owner = "client!client", name = "Jd", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray3;

	@OriginalMember(owner = "client!client", name = "Md", descriptor = "I")
	private int anInt305;

	@OriginalMember(owner = "client!client", name = "Pd", descriptor = "[[[B")
	private byte[][][] aByteArrayArrayArray7;

	@OriginalMember(owner = "client!client", name = "Sd", descriptor = "I")
	private int anInt306;

	@OriginalMember(owner = "client!client", name = "Td", descriptor = "[I")
	private int[] anIntArray54;

	@OriginalMember(owner = "client!client", name = "Ud", descriptor = "[I")
	private int[] anIntArray55;

	@OriginalMember(owner = "client!client", name = "Vd", descriptor = "[I")
	private int[] anIntArray56;

	@OriginalMember(owner = "client!client", name = "ge", descriptor = "Lclient!lb;")
	private Class1_Sub1_Sub2_Sub4 aClass1_Sub1_Sub2_Sub4_1;

	@OriginalMember(owner = "client!client", name = "he", descriptor = "Lclient!lb;")
	private Class1_Sub1_Sub2_Sub4 aClass1_Sub1_Sub2_Sub4_2;

	@OriginalMember(owner = "client!client", name = "ie", descriptor = "Lclient!lb;")
	private Class1_Sub1_Sub2_Sub4 aClass1_Sub1_Sub2_Sub4_3;

	@OriginalMember(owner = "client!client", name = "je", descriptor = "Lclient!lb;")
	private Class1_Sub1_Sub2_Sub4 aClass1_Sub1_Sub2_Sub4_4;

	@OriginalMember(owner = "client!client", name = "me", descriptor = "I")
	private int anInt312;

	@OriginalMember(owner = "client!client", name = "ne", descriptor = "I")
	private int anInt313;

	@OriginalMember(owner = "client!client", name = "oe", descriptor = "I")
	private int anInt314;

	@OriginalMember(owner = "client!client", name = "pe", descriptor = "I")
	private int anInt315;

	@OriginalMember(owner = "client!client", name = "re", descriptor = "I")
	private int anInt317;

	@OriginalMember(owner = "client!client", name = "te", descriptor = "I")
	private int anInt318;

	@OriginalMember(owner = "client!client", name = "He", descriptor = "I")
	private int anInt322;

	@OriginalMember(owner = "client!client", name = "Ke", descriptor = "I")
	private int anInt324;

	@OriginalMember(owner = "client!client", name = "Le", descriptor = "I")
	private int anInt325;

	@OriginalMember(owner = "client!client", name = "Me", descriptor = "I")
	private int anInt326;

	@OriginalMember(owner = "client!client", name = "Ne", descriptor = "I")
	private int anInt327;

	@OriginalMember(owner = "client!client", name = "Oe", descriptor = "I")
	private int anInt328;

	@OriginalMember(owner = "client!client", name = "Pe", descriptor = "I")
	private int anInt329;

	@OriginalMember(owner = "client!client", name = "Xe", descriptor = "Lclient!jb;")
	private Class1_Sub1_Sub2_Sub2 aClass1_Sub1_Sub2_Sub2_7;

	@OriginalMember(owner = "client!client", name = "Ye", descriptor = "Lclient!jb;")
	private Class1_Sub1_Sub2_Sub2 aClass1_Sub1_Sub2_Sub2_8;

	@OriginalMember(owner = "client!client", name = "cf", descriptor = "J")
	private long aLong15;

	@OriginalMember(owner = "client!client", name = "df", descriptor = "I")
	private int anInt333;

	@OriginalMember(owner = "client!client", name = "ef", descriptor = "I")
	private int anInt334;

	@OriginalMember(owner = "client!client", name = "kf", descriptor = "Lclient!xb;")
	private Class47 aClass47_1;

	@OriginalMember(owner = "client!client", name = "pf", descriptor = "Lclient!s;")
	private Class39 aClass39_1;

	@OriginalMember(owner = "client!client", name = "sf", descriptor = "Lclient!kb;")
	private Class1_Sub1_Sub2_Sub3 aClass1_Sub1_Sub2_Sub3_11;

	@OriginalMember(owner = "client!client", name = "tf", descriptor = "Lclient!kb;")
	private Class1_Sub1_Sub2_Sub3 aClass1_Sub1_Sub2_Sub3_12;

	@OriginalMember(owner = "client!client", name = "uf", descriptor = "Lclient!kb;")
	private Class1_Sub1_Sub2_Sub3 aClass1_Sub1_Sub2_Sub3_13;

	@OriginalMember(owner = "client!client", name = "wf", descriptor = "I")
	private int anInt338;

	@OriginalMember(owner = "client!client", name = "zf", descriptor = "I")
	private int anInt339;

	@OriginalMember(owner = "client!client", name = "Cf", descriptor = "Ljava/lang/String;")
	private String aString15;

	@OriginalMember(owner = "client!client", name = "Df", descriptor = "I")
	private int anInt341;

	@OriginalMember(owner = "client!client", name = "If", descriptor = "I")
	private int anInt344;

	@OriginalMember(owner = "client!client", name = "Jf", descriptor = "I")
	private int anInt345;

	@OriginalMember(owner = "client!client", name = "Qf", descriptor = "J")
	private long aLong16;

	@OriginalMember(owner = "client!client", name = "Tf", descriptor = "I")
	private int anInt349;

	@OriginalMember(owner = "client!client", name = "Uf", descriptor = "I")
	private int anInt350;

	@OriginalMember(owner = "client!client", name = "Wf", descriptor = "I")
	private int anInt352;

	@OriginalMember(owner = "client!client", name = "Yf", descriptor = "I")
	private int anInt353;

	@OriginalMember(owner = "client!client", name = "dg", descriptor = "Lclient!jb;")
	private Class1_Sub1_Sub2_Sub2 aClass1_Sub1_Sub2_Sub2_9;

	@OriginalMember(owner = "client!client", name = "ig", descriptor = "I")
	private int anInt354;

	@OriginalMember(owner = "client!client", name = "jg", descriptor = "Lclient!kb;")
	private Class1_Sub1_Sub2_Sub3 aClass1_Sub1_Sub2_Sub3_14;

	@OriginalMember(owner = "client!client", name = "kg", descriptor = "Lclient!kb;")
	private Class1_Sub1_Sub2_Sub3 aClass1_Sub1_Sub2_Sub3_15;

	@OriginalMember(owner = "client!client", name = "lg", descriptor = "Lclient!kb;")
	private Class1_Sub1_Sub2_Sub3 aClass1_Sub1_Sub2_Sub3_16;

	@OriginalMember(owner = "client!client", name = "mg", descriptor = "Lclient!kb;")
	private Class1_Sub1_Sub2_Sub3 aClass1_Sub1_Sub2_Sub3_17;

	@OriginalMember(owner = "client!client", name = "ng", descriptor = "Lclient!kb;")
	private Class1_Sub1_Sub2_Sub3 aClass1_Sub1_Sub2_Sub3_18;

	@OriginalMember(owner = "client!client", name = "og", descriptor = "[I")
	private int[] anIntArray72;

	@OriginalMember(owner = "client!client", name = "pg", descriptor = "[I")
	private int[] anIntArray73;

	@OriginalMember(owner = "client!client", name = "qg", descriptor = "[I")
	private int[] anIntArray74;

	@OriginalMember(owner = "client!client", name = "rg", descriptor = "[I")
	private int[] anIntArray75;

	@OriginalMember(owner = "client!client", name = "sg", descriptor = "Lclient!rb;")
	private Class37 aClass37_21;

	@OriginalMember(owner = "client!client", name = "tg", descriptor = "Lclient!rb;")
	private Class37 aClass37_22;

	@OriginalMember(owner = "client!client", name = "ug", descriptor = "Lclient!rb;")
	private Class37 aClass37_23;

	@OriginalMember(owner = "client!client", name = "wg", descriptor = "I")
	private int anInt356;

	@OriginalMember(owner = "client!client", name = "xg", descriptor = "I")
	private int anInt357;

	@OriginalMember(owner = "client!client", name = "Ag", descriptor = "I")
	private int anInt359;

	@OriginalMember(owner = "client!client", name = "Eg", descriptor = "I")
	private int anInt362;

	@OriginalMember(owner = "client!client", name = "Hg", descriptor = "I")
	private int anInt363;

	@OriginalMember(owner = "client!client", name = "Ig", descriptor = "I")
	private int anInt364;

	@OriginalMember(owner = "client!client", name = "Jg", descriptor = "I")
	private int anInt365;

	@OriginalMember(owner = "client!client", name = "Lg", descriptor = "[I")
	private int[] anIntArray77;

	@OriginalMember(owner = "client!client", name = "Mg", descriptor = "[I")
	private int[] anIntArray78;

	@OriginalMember(owner = "client!client", name = "Ng", descriptor = "Lclient!e;")
	private Class8 aClass8_1;

	@OriginalMember(owner = "client!client", name = "Og", descriptor = "I")
	private int anInt366;

	@OriginalMember(owner = "client!client", name = "Pg", descriptor = "I")
	private int anInt367;

	@OriginalMember(owner = "client!client", name = "Qg", descriptor = "I")
	private int anInt368;

	@OriginalMember(owner = "client!client", name = "Rg", descriptor = "I")
	private int anInt369;

	@OriginalMember(owner = "client!client", name = "Sg", descriptor = "I")
	private int anInt370;

	@OriginalMember(owner = "client!client", name = "Vg", descriptor = "J")
	private long aLong17;

	@OriginalMember(owner = "client!client", name = "ah", descriptor = "[I")
	private int[] anIntArray80;

	@OriginalMember(owner = "client!client", name = "bh", descriptor = "[I")
	private int[] anIntArray81;

	@OriginalMember(owner = "client!client", name = "ch", descriptor = "[I")
	private int[] anIntArray82;

	@OriginalMember(owner = "client!client", name = "fh", descriptor = "I")
	private int anInt372;

	@OriginalMember(owner = "client!client", name = "gh", descriptor = "I")
	private int anInt373;

	@OriginalMember(owner = "client!client", name = "jh", descriptor = "I")
	private int anInt374;

	@OriginalMember(owner = "client!client", name = "kh", descriptor = "I")
	private int anInt375;

	@OriginalMember(owner = "client!client", name = "nh", descriptor = "I")
	private int anInt377;

	@OriginalMember(owner = "client!client", name = "oh", descriptor = "I")
	private int anInt378;

	@OriginalMember(owner = "client!client", name = "ph", descriptor = "I")
	private int anInt379;

	@OriginalMember(owner = "client!client", name = "th", descriptor = "I")
	private int anInt381;

	@OriginalMember(owner = "client!client", name = "uh", descriptor = "I")
	private int anInt382;

	@OriginalMember(owner = "client!client", name = "vh", descriptor = "I")
	private int anInt383;

	@OriginalMember(owner = "client!client", name = "wh", descriptor = "I")
	private int anInt384;

	@OriginalMember(owner = "client!client", name = "xh", descriptor = "I")
	private int anInt385;

	@OriginalMember(owner = "client!client", name = "Bh", descriptor = "I")
	private int anInt388;

	@OriginalMember(owner = "client!client", name = "Dh", descriptor = "I")
	private int anInt389;

	@OriginalMember(owner = "client!client", name = "Fh", descriptor = "I")
	private int anInt390;

	@OriginalMember(owner = "client!client", name = "Ih", descriptor = "I")
	private int anInt391;

	@OriginalMember(owner = "client!client", name = "Kh", descriptor = "I")
	private int anInt393;

	@OriginalMember(owner = "client!client", name = "Mh", descriptor = "I")
	private int anInt394;

	@OriginalMember(owner = "client!client", name = "Nh", descriptor = "I")
	private int anInt395;

	@OriginalMember(owner = "client!client", name = "Oh", descriptor = "I")
	private int anInt396;

	@OriginalMember(owner = "client!client", name = "Ph", descriptor = "Ljava/lang/String;")
	private String aString16;

	@OriginalMember(owner = "client!client", name = "Rh", descriptor = "I")
	private int anInt397;

	@OriginalMember(owner = "client!client", name = "Sh", descriptor = "I")
	private int anInt398;

	@OriginalMember(owner = "client!client", name = "Th", descriptor = "I")
	private int anInt399;

	@OriginalMember(owner = "client!client", name = "Wh", descriptor = "I")
	private int anInt401;

	@OriginalMember(owner = "client!client", name = "Zh", descriptor = "I")
	private int anInt403;

	@OriginalMember(owner = "client!client", name = "ai", descriptor = "I")
	private int anInt404;

	@OriginalMember(owner = "client!client", name = "bi", descriptor = "I")
	private int anInt405;

	@OriginalMember(owner = "client!client", name = "di", descriptor = "Lclient!yb;")
	private Class48 aClass48_1;

	@OriginalMember(owner = "client!client", name = "ei", descriptor = "I")
	private int anInt406;

	@OriginalMember(owner = "client!client", name = "hi", descriptor = "I")
	private int anInt407;

	@OriginalMember(owner = "client!client", name = "ii", descriptor = "I")
	private int anInt408;

	@OriginalMember(owner = "client!client", name = "ji", descriptor = "I")
	private int anInt409;

	@OriginalMember(owner = "client!client", name = "ki", descriptor = "I")
	private int anInt410;

	@OriginalMember(owner = "client!client", name = "li", descriptor = "I")
	private int anInt411;

	@OriginalMember(owner = "client!client", name = "ni", descriptor = "I")
	private int anInt413;

	@OriginalMember(owner = "client!client", name = "qi", descriptor = "Lclient!jb;")
	private Class1_Sub1_Sub2_Sub2 aClass1_Sub1_Sub2_Sub2_10;

	@OriginalMember(owner = "client!client", name = "ri", descriptor = "Lclient!jb;")
	private Class1_Sub1_Sub2_Sub2 aClass1_Sub1_Sub2_Sub2_11;

	@OriginalMember(owner = "client!client", name = "si", descriptor = "Lclient!jb;")
	private Class1_Sub1_Sub2_Sub2 aClass1_Sub1_Sub2_Sub2_12;

	@OriginalMember(owner = "client!client", name = "ti", descriptor = "Lclient!jb;")
	private Class1_Sub1_Sub2_Sub2 aClass1_Sub1_Sub2_Sub2_13;

	@OriginalMember(owner = "client!client", name = "vi", descriptor = "I")
	private int anInt417;

	@OriginalMember(owner = "client!client", name = "Bi", descriptor = "I")
	private int anInt420;

	@OriginalMember(owner = "client!client", name = "Di", descriptor = "I")
	private int anInt421;

	@OriginalMember(owner = "client!client", name = "Ii", descriptor = "I")
	private int anInt422;

	@OriginalMember(owner = "client!client", name = "Ji", descriptor = "I")
	private int anInt423;

	@OriginalMember(owner = "client!client", name = "Ki", descriptor = "I")
	private int anInt424;

	@OriginalMember(owner = "client!client", name = "Li", descriptor = "I")
	private int anInt425;

	@OriginalMember(owner = "client!client", name = "Mi", descriptor = "I")
	private int anInt426;

	@OriginalMember(owner = "client!client", name = "Ni", descriptor = "I")
	private int anInt427;

	@OriginalMember(owner = "client!client", name = "Oi", descriptor = "I")
	private int anInt428;

	@OriginalMember(owner = "client!client", name = "Pi", descriptor = "I")
	private int anInt429;

	@OriginalMember(owner = "client!client", name = "Qi", descriptor = "I")
	private int anInt430;

	@OriginalMember(owner = "client!client", name = "Ri", descriptor = "I")
	private int anInt431;

	@OriginalMember(owner = "client!client", name = "Si", descriptor = "I")
	private int anInt432;

	@OriginalMember(owner = "client!client", name = "Ti", descriptor = "I")
	private int anInt433;

	@OriginalMember(owner = "client!client", name = "Ui", descriptor = "I")
	private int anInt434;

	@OriginalMember(owner = "client!client", name = "Wi", descriptor = "I")
	private int anInt435;

	@OriginalMember(owner = "client!client", name = "Xi", descriptor = "I")
	private int anInt436;

	@OriginalMember(owner = "client!client", name = "Yi", descriptor = "J")
	private long aLong18;

	@OriginalMember(owner = "client!client", name = "aj", descriptor = "I")
	private int anInt437;

	@OriginalMember(owner = "client!client", name = "bj", descriptor = "Lclient!rb;")
	private Class37 aClass37_24;

	@OriginalMember(owner = "client!client", name = "cj", descriptor = "Lclient!rb;")
	private Class37 aClass37_25;

	@OriginalMember(owner = "client!client", name = "dj", descriptor = "Lclient!rb;")
	private Class37 aClass37_26;

	@OriginalMember(owner = "client!client", name = "ej", descriptor = "Lclient!rb;")
	private Class37 aClass37_27;

	@OriginalMember(owner = "client!client", name = "gj", descriptor = "Lclient!kb;")
	private Class1_Sub1_Sub2_Sub3 aClass1_Sub1_Sub2_Sub3_19;

	@OriginalMember(owner = "client!client", name = "hj", descriptor = "Lclient!kb;")
	private Class1_Sub1_Sub2_Sub3 aClass1_Sub1_Sub2_Sub3_20;

	@OriginalMember(owner = "client!client", name = "ij", descriptor = "I")
	private int anInt439;

	@OriginalMember(owner = "client!client", name = "mj", descriptor = "I")
	private int anInt442;

	@OriginalMember(owner = "client!client", name = "nj", descriptor = "I")
	private int anInt443;

	@OriginalMember(owner = "client!client", name = "oj", descriptor = "I")
	private int anInt444;

	@OriginalMember(owner = "client!client", name = "pj", descriptor = "I")
	private int anInt445;

	@OriginalMember(owner = "client!client", name = "qj", descriptor = "[I")
	private int[] anIntArray94;

	@OriginalMember(owner = "client!client", name = "rj", descriptor = "[I")
	private int[] anIntArray95;

	@OriginalMember(owner = "client!client", name = "vj", descriptor = "[Lclient!kb;")
	private Class1_Sub1_Sub2_Sub3[] aClass1_Sub1_Sub2_Sub3Array4;

	@OriginalMember(owner = "client!client", name = "wj", descriptor = "I")
	private int anInt447;

	@OriginalMember(owner = "client!client", name = "L", descriptor = "B")
	private byte aByte2 = -21;

	@OriginalMember(owner = "client!client", name = "N", descriptor = "I")
	private int anInt246 = -1;

	@OriginalMember(owner = "client!client", name = "P", descriptor = "Z")
	private boolean aBoolean44 = false;

	@OriginalMember(owner = "client!client", name = "Q", descriptor = "I")
	private int anInt248 = -1;

	@OriginalMember(owner = "client!client", name = "ab", descriptor = "I")
	private int anInt249 = -1;

	@OriginalMember(owner = "client!client", name = "kb", descriptor = "[I")
	private int[] anIntArray34 = new int[4000];

	@OriginalMember(owner = "client!client", name = "lb", descriptor = "[I")
	private int[] anIntArray35 = new int[4000];

	@OriginalMember(owner = "client!client", name = "mb", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray1 = new String[500];

	@OriginalMember(owner = "client!client", name = "nb", descriptor = "[Lclient!jc;")
	private Class19[] aClass19Array1 = new Class19[4];

	@OriginalMember(owner = "client!client", name = "pb", descriptor = "[I")
	private int[] anIntArray36 = new int[7];

	@OriginalMember(owner = "client!client", name = "rb", descriptor = "Z")
	private boolean aBoolean45 = false;

	@OriginalMember(owner = "client!client", name = "ub", descriptor = "I")
	private int anInt254 = 2;

	@OriginalMember(owner = "client!client", name = "vb", descriptor = "[I")
	private int[] anIntArray37 = new int[5];

	@OriginalMember(owner = "client!client", name = "wb", descriptor = "Z")
	public boolean aBoolean46 = false;

	@OriginalMember(owner = "client!client", name = "yb", descriptor = "B")
	private byte aByte3 = 69;

	@OriginalMember(owner = "client!client", name = "Db", descriptor = "I")
	private int anInt260 = 1;

	@OriginalMember(owner = "client!client", name = "Ib", descriptor = "I")
	private int anInt263 = 3;

	@OriginalMember(owner = "client!client", name = "Kb", descriptor = "B")
	private byte aByte4 = 8;

	@OriginalMember(owner = "client!client", name = "Lb", descriptor = "B")
	private byte aByte5 = 4;

	@OriginalMember(owner = "client!client", name = "Nb", descriptor = "Z")
	private boolean aBoolean49 = false;

	@OriginalMember(owner = "client!client", name = "Qb", descriptor = "Z")
	private boolean aBoolean50 = false;

	@OriginalMember(owner = "client!client", name = "Rb", descriptor = "Z")
	private boolean aBoolean51 = false;

	@OriginalMember(owner = "client!client", name = "Vb", descriptor = "[I")
	private int[] anIntArray38 = new int[33];

	@OriginalMember(owner = "client!client", name = "Wb", descriptor = "B")
	private byte aByte6 = 118;

	@OriginalMember(owner = "client!client", name = "Xb", descriptor = "[I")
	private int[] anIntArray39 = new int[100];

	@OriginalMember(owner = "client!client", name = "Yb", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray2 = new String[100];

	@OriginalMember(owner = "client!client", name = "Zb", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray3 = new String[100];

	@OriginalMember(owner = "client!client", name = "fc", descriptor = "[I")
	private int[] anIntArray40 = new int[50];

	@OriginalMember(owner = "client!client", name = "mc", descriptor = "I")
	private int anInt278 = -1;

	@OriginalMember(owner = "client!client", name = "nc", descriptor = "I")
	private final int anInt279 = 100;

	@OriginalMember(owner = "client!client", name = "oc", descriptor = "[I")
	private int[] anIntArray41 = new int[100];

	@OriginalMember(owner = "client!client", name = "rc", descriptor = "I")
	private int anInt282 = 9;

	@OriginalMember(owner = "client!client", name = "yc", descriptor = "Ljava/lang/String;")
	private String aString6 = "";

	@OriginalMember(owner = "client!client", name = "zc", descriptor = "B")
	private byte aByte7 = 8;

	@OriginalMember(owner = "client!client", name = "Ac", descriptor = "[I")
	private final int[] anIntArray42 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

	@OriginalMember(owner = "client!client", name = "Gc", descriptor = "Z")
	private boolean aBoolean52 = false;

	@OriginalMember(owner = "client!client", name = "Hc", descriptor = "[I")
	private int[] anIntArray43 = new int[151];

	@OriginalMember(owner = "client!client", name = "Ic", descriptor = "[[I")
	private int[][] anIntArrayArray2 = new int[104][104];

	@OriginalMember(owner = "client!client", name = "Jc", descriptor = "[I")
	private int[] anIntArray44 = new int[5];

	@OriginalMember(owner = "client!client", name = "Kc", descriptor = "[I")
	private int[] anIntArray45 = new int[256];

	@OriginalMember(owner = "client!client", name = "Sc", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray4 = new String[200];

	@OriginalMember(owner = "client!client", name = "ad", descriptor = "Lclient!pb;")
	private Class31 aClass31_1 = new Class31(-767);

	@OriginalMember(owner = "client!client", name = "cd", descriptor = "B")
	private byte aByte8 = 9;

	@OriginalMember(owner = "client!client", name = "ed", descriptor = "[J")
	private long[] aLongArray3 = new long[100];

	@OriginalMember(owner = "client!client", name = "jd", descriptor = "I")
	private int anInt298 = 919;

	@OriginalMember(owner = "client!client", name = "kd", descriptor = "Z")
	private boolean aBoolean53 = true;

	@OriginalMember(owner = "client!client", name = "ld", descriptor = "Ljava/lang/String;")
	private String aString8 = "";

	@OriginalMember(owner = "client!client", name = "md", descriptor = "Lclient!d;")
	private Class6 aClass6_1 = new Class6();

	@OriginalMember(owner = "client!client", name = "nd", descriptor = "Z")
	private boolean aBoolean54 = false;

	@OriginalMember(owner = "client!client", name = "pd", descriptor = "Z")
	private boolean aBoolean55 = false;

	@OriginalMember(owner = "client!client", name = "td", descriptor = "B")
	private byte aByte9 = 5;

	@OriginalMember(owner = "client!client", name = "wd", descriptor = "Z")
	private boolean aBoolean56 = false;

	@OriginalMember(owner = "client!client", name = "yd", descriptor = "[J")
	private long[] aLongArray4 = new long[200];

	@OriginalMember(owner = "client!client", name = "Cd", descriptor = "[I")
	private int[] anIntArray47 = new int[500];

	@OriginalMember(owner = "client!client", name = "Dd", descriptor = "[I")
	private int[] anIntArray48 = new int[500];

	@OriginalMember(owner = "client!client", name = "Ed", descriptor = "[I")
	private int[] anIntArray49 = new int[500];

	@OriginalMember(owner = "client!client", name = "Fd", descriptor = "[I")
	private int[] anIntArray50 = new int[500];

	@OriginalMember(owner = "client!client", name = "Hd", descriptor = "Ljava/lang/String;")
	private String aString9 = "";

	@OriginalMember(owner = "client!client", name = "Id", descriptor = "Ljava/lang/String;")
	private String aString10 = "";

	@OriginalMember(owner = "client!client", name = "Kd", descriptor = "[I")
	private int[] anIntArray51 = new int[9];

	@OriginalMember(owner = "client!client", name = "Ld", descriptor = "Lclient!mb;")
	private Class1_Sub1_Sub3 aClass1_Sub1_Sub3_2 = Class1_Sub1_Sub3.method485();

	@OriginalMember(owner = "client!client", name = "Nd", descriptor = "[I")
	private int[] anIntArray52 = new int[1000];

	@OriginalMember(owner = "client!client", name = "Od", descriptor = "[[[Lclient!pb;")
	private Class31[][][] aClass31ArrayArrayArray1 = new Class31[4][104][104];

	@OriginalMember(owner = "client!client", name = "Qd", descriptor = "[I")
	private int[] anIntArray53 = new int[33];

	@OriginalMember(owner = "client!client", name = "Rd", descriptor = "Ljava/lang/String;")
	private String aString11 = "";

	@OriginalMember(owner = "client!client", name = "Wd", descriptor = "Z")
	private boolean aBoolean58 = false;

	@OriginalMember(owner = "client!client", name = "Xd", descriptor = "Z")
	private boolean aBoolean59 = false;

	@OriginalMember(owner = "client!client", name = "Yd", descriptor = "Ljava/util/zip/CRC32;")
	private CRC32 aCRC32_1 = new CRC32();

	@OriginalMember(owner = "client!client", name = "Zd", descriptor = "Z")
	private boolean aBoolean60 = false;

	@OriginalMember(owner = "client!client", name = "ae", descriptor = "I")
	private int anInt307 = 7;

	@OriginalMember(owner = "client!client", name = "be", descriptor = "I")
	private int anInt308 = 7759444;

	@OriginalMember(owner = "client!client", name = "ce", descriptor = "[Lclient!wb;")
	public Class46[] aClass46Array1 = new Class46[5];

	@OriginalMember(owner = "client!client", name = "ee", descriptor = "I")
	private int anInt310 = -550;

	@OriginalMember(owner = "client!client", name = "ke", descriptor = "Z")
	private boolean aBoolean61 = false;

	@OriginalMember(owner = "client!client", name = "le", descriptor = "Ljava/lang/String;")
	private String aString12 = "";

	@OriginalMember(owner = "client!client", name = "qe", descriptor = "I")
	private int anInt316 = -345;

	@OriginalMember(owner = "client!client", name = "se", descriptor = "B")
	private byte aByte10 = -4;

	@OriginalMember(owner = "client!client", name = "ue", descriptor = "I")
	private int anInt319 = 50;

	@OriginalMember(owner = "client!client", name = "ve", descriptor = "[I")
	private int[] anIntArray57 = new int[this.anInt319];

	@OriginalMember(owner = "client!client", name = "we", descriptor = "[I")
	private int[] anIntArray58 = new int[this.anInt319];

	@OriginalMember(owner = "client!client", name = "xe", descriptor = "[I")
	private int[] anIntArray59 = new int[this.anInt319];

	@OriginalMember(owner = "client!client", name = "ye", descriptor = "[I")
	private int[] anIntArray60 = new int[this.anInt319];

	@OriginalMember(owner = "client!client", name = "ze", descriptor = "[I")
	private int[] anIntArray61 = new int[this.anInt319];

	@OriginalMember(owner = "client!client", name = "Ae", descriptor = "[I")
	private int[] anIntArray62 = new int[this.anInt319];

	@OriginalMember(owner = "client!client", name = "Be", descriptor = "[I")
	private int[] anIntArray63 = new int[this.anInt319];

	@OriginalMember(owner = "client!client", name = "Ce", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray5 = new String[this.anInt319];

	@OriginalMember(owner = "client!client", name = "De", descriptor = "I")
	private int anInt320 = 3353893;

	@OriginalMember(owner = "client!client", name = "Ee", descriptor = "[I")
	private int[] anIntArray64 = new int[5];

	@OriginalMember(owner = "client!client", name = "Fe", descriptor = "I")
	private int anInt321 = -1;

	@OriginalMember(owner = "client!client", name = "Ge", descriptor = "Z")
	private boolean aBoolean62 = false;

	@OriginalMember(owner = "client!client", name = "Ie", descriptor = "I")
	private int anInt323 = -523;

	@OriginalMember(owner = "client!client", name = "Je", descriptor = "Z")
	private boolean aBoolean63 = true;

	@OriginalMember(owner = "client!client", name = "Qe", descriptor = "Z")
	private boolean aBoolean64 = false;

	@OriginalMember(owner = "client!client", name = "Re", descriptor = "I")
	private int anInt330 = -1;

	@OriginalMember(owner = "client!client", name = "Se", descriptor = "I")
	private int anInt331 = -1;

	@OriginalMember(owner = "client!client", name = "Te", descriptor = "Z")
	private boolean aBoolean65 = false;

	@OriginalMember(owner = "client!client", name = "We", descriptor = "Z")
	private boolean aBoolean67 = true;

	@OriginalMember(owner = "client!client", name = "Ze", descriptor = "I")
	private int anInt332 = -1;

	@OriginalMember(owner = "client!client", name = "bf", descriptor = "[Lclient!kb;")
	private Class1_Sub1_Sub2_Sub3[] aClass1_Sub1_Sub2_Sub3Array1 = new Class1_Sub1_Sub2_Sub3[2];

	@OriginalMember(owner = "client!client", name = "ff", descriptor = "I")
	private int anInt335 = 1;

	@OriginalMember(owner = "client!client", name = "gf", descriptor = "B")
	private byte aByte11 = 8;

	@OriginalMember(owner = "client!client", name = "jf", descriptor = "Ljava/lang/String;")
	private String aString14 = "";

	@OriginalMember(owner = "client!client", name = "lf", descriptor = "Z")
	private boolean aBoolean68 = false;

	@OriginalMember(owner = "client!client", name = "mf", descriptor = "[Lclient!jb;")
	private Class1_Sub1_Sub2_Sub2[] aClass1_Sub1_Sub2_Sub2Array3 = new Class1_Sub1_Sub2_Sub2[8];

	@OriginalMember(owner = "client!client", name = "nf", descriptor = "B")
	private byte aByte12 = -4;

	@OriginalMember(owner = "client!client", name = "qf", descriptor = "[I")
	private int[] anIntArray65 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

	@OriginalMember(owner = "client!client", name = "rf", descriptor = "[Lclient!kb;")
	private Class1_Sub1_Sub2_Sub3[] aClass1_Sub1_Sub2_Sub3Array2 = new Class1_Sub1_Sub2_Sub3[13];

	@OriginalMember(owner = "client!client", name = "vf", descriptor = "[B")
	private byte[] aByteArray2 = new byte[16384];

	@OriginalMember(owner = "client!client", name = "xf", descriptor = "B")
	private byte aByte13 = 125;

	@OriginalMember(owner = "client!client", name = "Af", descriptor = "[Lclient!jb;")
	private Class1_Sub1_Sub2_Sub2[] aClass1_Sub1_Sub2_Sub2Array4 = new Class1_Sub1_Sub2_Sub2[50];

	@OriginalMember(owner = "client!client", name = "Bf", descriptor = "I")
	private int anInt340 = 351;

	@OriginalMember(owner = "client!client", name = "Ef", descriptor = "[I")
	private int[] anIntArray66 = new int[1000];

	@OriginalMember(owner = "client!client", name = "Ff", descriptor = "[I")
	private int[] anIntArray67 = new int[1000];

	@OriginalMember(owner = "client!client", name = "Hf", descriptor = "I")
	private int anInt343 = -1;

	@OriginalMember(owner = "client!client", name = "Mf", descriptor = "Z")
	private boolean aBoolean70 = false;

	@OriginalMember(owner = "client!client", name = "Nf", descriptor = "I")
	private int anInt347 = -1;

	@OriginalMember(owner = "client!client", name = "Of", descriptor = "I")
	private int anInt348 = -1;

	@OriginalMember(owner = "client!client", name = "Rf", descriptor = "Z")
	private boolean aBoolean71 = false;

	@OriginalMember(owner = "client!client", name = "Sf", descriptor = "Z")
	private boolean aBoolean72 = false;

	@OriginalMember(owner = "client!client", name = "Vf", descriptor = "I")
	private int anInt351 = 78;

	@OriginalMember(owner = "client!client", name = "Xf", descriptor = "[Lclient!kb;")
	private Class1_Sub1_Sub2_Sub3[] aClass1_Sub1_Sub2_Sub3Array3 = new Class1_Sub1_Sub2_Sub3[50];

	@OriginalMember(owner = "client!client", name = "Zf", descriptor = "[I")
	private int[] anIntArray68 = new int[Class29.anInt825];

	@OriginalMember(owner = "client!client", name = "ag", descriptor = "[I")
	private int[] anIntArray69 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

	@OriginalMember(owner = "client!client", name = "bg", descriptor = "[I")
	private int[] anIntArray70 = new int[50];

	@OriginalMember(owner = "client!client", name = "cg", descriptor = "Z")
	private boolean aBoolean73 = false;

	@OriginalMember(owner = "client!client", name = "eg", descriptor = "Z")
	private boolean aBoolean74 = false;

	@OriginalMember(owner = "client!client", name = "fg", descriptor = "[I")
	private int[] anIntArray71 = new int[2000];

	@OriginalMember(owner = "client!client", name = "gg", descriptor = "Z")
	private boolean aBoolean75 = true;

	@OriginalMember(owner = "client!client", name = "hg", descriptor = "Z")
	private boolean aBoolean76 = false;

	@OriginalMember(owner = "client!client", name = "vg", descriptor = "I")
	private int anInt355 = 2301979;

	@OriginalMember(owner = "client!client", name = "zg", descriptor = "[Lclient!jb;")
	private Class1_Sub1_Sub2_Sub2[] aClass1_Sub1_Sub2_Sub2Array5 = new Class1_Sub1_Sub2_Sub2[20];

	@OriginalMember(owner = "client!client", name = "Bg", descriptor = "I")
	private int anInt360 = 1;

	@OriginalMember(owner = "client!client", name = "Cg", descriptor = "Z")
	private boolean aBoolean77 = true;

	@OriginalMember(owner = "client!client", name = "Fg", descriptor = "Z")
	private boolean aBoolean78 = true;

	@OriginalMember(owner = "client!client", name = "Gg", descriptor = "Z")
	private boolean aBoolean79 = true;

	@OriginalMember(owner = "client!client", name = "Kg", descriptor = "[I")
	private int[] anIntArray76 = new int[Class29.anInt825];

	@OriginalMember(owner = "client!client", name = "Tg", descriptor = "[Z")
	private boolean[] aBooleanArray4 = new boolean[5];

	@OriginalMember(owner = "client!client", name = "Wg", descriptor = "[I")
	private int[] anIntArray79 = new int[50];

	@OriginalMember(owner = "client!client", name = "Xg", descriptor = "B")
	private byte aByte14 = -82;

	@OriginalMember(owner = "client!client", name = "Yg", descriptor = "[[I")
	private int[][] anIntArrayArray4 = new int[104][104];

	@OriginalMember(owner = "client!client", name = "Zg", descriptor = "Z")
	private boolean aBoolean80 = true;

	@OriginalMember(owner = "client!client", name = "dh", descriptor = "Lclient!pb;")
	private Class31 aClass31_2 = new Class31(-767);

	@OriginalMember(owner = "client!client", name = "eh", descriptor = "[I")
	private int[] anIntArray83 = new int[151];

	@OriginalMember(owner = "client!client", name = "hh", descriptor = "Z")
	private boolean aBoolean81 = false;

	@OriginalMember(owner = "client!client", name = "ih", descriptor = "Z")
	private boolean aBoolean82 = false;

	@OriginalMember(owner = "client!client", name = "mh", descriptor = "Z")
	private boolean aBoolean83 = false;

	@OriginalMember(owner = "client!client", name = "qh", descriptor = "Z")
	private boolean aBoolean84 = false;

	@OriginalMember(owner = "client!client", name = "sh", descriptor = "Z")
	private boolean aBoolean85 = false;

	@OriginalMember(owner = "client!client", name = "Ah", descriptor = "I")
	private int anInt387 = -45;

	@OriginalMember(owner = "client!client", name = "Ch", descriptor = "[Lclient!ab;")
	private Class1_Sub1_Sub1_Sub1_Sub1[] aClass1_Sub1_Sub1_Sub1_Sub1Array1 = new Class1_Sub1_Sub1_Sub1_Sub1[8192];

	@OriginalMember(owner = "client!client", name = "Eh", descriptor = "[I")
	private int[] anIntArray85 = new int[8192];

	@OriginalMember(owner = "client!client", name = "Gh", descriptor = "[Lclient!jb;")
	private Class1_Sub1_Sub2_Sub2[] aClass1_Sub1_Sub2_Sub2Array6 = new Class1_Sub1_Sub2_Sub2[1000];

	@OriginalMember(owner = "client!client", name = "Hh", descriptor = "[I")
	private int[] anIntArray86 = new int[Class29.anInt825];

	@OriginalMember(owner = "client!client", name = "Jh", descriptor = "I")
	private int anInt392 = 5063219;

	@OriginalMember(owner = "client!client", name = "Lh", descriptor = "Z")
	private boolean aBoolean86 = false;

	@OriginalMember(owner = "client!client", name = "Uh", descriptor = "I")
	private int anInt400 = 3;

	@OriginalMember(owner = "client!client", name = "Vh", descriptor = "[I")
	private int[] anIntArray88 = new int[5];

	@OriginalMember(owner = "client!client", name = "Xh", descriptor = "[I")
	private int[] anIntArray89 = new int[200];

	@OriginalMember(owner = "client!client", name = "Yh", descriptor = "I")
	private int anInt402 = 128;

	@OriginalMember(owner = "client!client", name = "ci", descriptor = "Lclient!mb;")
	private Class1_Sub1_Sub3 aClass1_Sub1_Sub3_3 = Class1_Sub1_Sub3.method485();

	@OriginalMember(owner = "client!client", name = "fi", descriptor = "Lclient!mb;")
	private Class1_Sub1_Sub3 aClass1_Sub1_Sub3_4 = Class1_Sub1_Sub3.method485();

	@OriginalMember(owner = "client!client", name = "gi", descriptor = "[[I")
	private int[][] anIntArrayArray5 = new int[104][104];

	@OriginalMember(owner = "client!client", name = "mi", descriptor = "I")
	private int anInt412 = -1;

	@OriginalMember(owner = "client!client", name = "oi", descriptor = "I")
	private int anInt414 = 2;

	@OriginalMember(owner = "client!client", name = "pi", descriptor = "I")
	private int anInt415 = -1;

	@OriginalMember(owner = "client!client", name = "ui", descriptor = "I")
	private int anInt416 = -1;

	@OriginalMember(owner = "client!client", name = "wi", descriptor = "[Lclient!jb;")
	private Class1_Sub1_Sub2_Sub2[] aClass1_Sub1_Sub2_Sub2Array7 = new Class1_Sub1_Sub2_Sub2[20];

	@OriginalMember(owner = "client!client", name = "xi", descriptor = "[I")
	private int[] anIntArray90 = new int[5];

	@OriginalMember(owner = "client!client", name = "yi", descriptor = "I")
	private int anInt418 = 2048;

	@OriginalMember(owner = "client!client", name = "zi", descriptor = "I")
	private int anInt419 = 2047;

	@OriginalMember(owner = "client!client", name = "Ai", descriptor = "[Lclient!bb;")
	private Class1_Sub1_Sub1_Sub1_Sub2[] aClass1_Sub1_Sub1_Sub1_Sub2Array1 = new Class1_Sub1_Sub1_Sub1_Sub2[this.anInt418];

	@OriginalMember(owner = "client!client", name = "Ci", descriptor = "[I")
	private int[] anIntArray91 = new int[this.anInt418];

	@OriginalMember(owner = "client!client", name = "Ei", descriptor = "[I")
	private int[] anIntArray92 = new int[this.anInt418];

	@OriginalMember(owner = "client!client", name = "Fi", descriptor = "[Lclient!mb;")
	private Class1_Sub1_Sub3[] aClass1_Sub1_Sub3Array1 = new Class1_Sub1_Sub3[this.anInt418];

	@OriginalMember(owner = "client!client", name = "Gi", descriptor = "B")
	private byte aByte15 = -117;

	@OriginalMember(owner = "client!client", name = "Hi", descriptor = "Lclient!pb;")
	private Class31 aClass31_3 = new Class31(-767);

	@OriginalMember(owner = "client!client", name = "Vi", descriptor = "Z")
	private boolean aBoolean87 = false;

	@OriginalMember(owner = "client!client", name = "Zi", descriptor = "[I")
	private int[] anIntArray93 = new int[2000];

	@OriginalMember(owner = "client!client", name = "jj", descriptor = "I")
	private int anInt440 = 2;

	@OriginalMember(owner = "client!client", name = "kj", descriptor = "B")
	private byte aByte16 = 7;

	@OriginalMember(owner = "client!client", name = "sj", descriptor = "Ljava/lang/String;")
	private String aString17 = "";

	@OriginalMember(owner = "client!client", name = "tj", descriptor = "Ljava/lang/String;")
	private String aString18 = "";

	static {
		@Pc(8) int local8 = 2;
		@Pc(10) int local10;
		for (local10 = 0; local10 < 32; local10++) {
			anIntArray46[local10] = local8 - 1;
			local8 += local8;
		}
		anInt311 = -161;
		aBigInteger1 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");
		aString13 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";
		anInt336 = -796;
		anIntArrayArray3 = new int[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, 33697, 22433, 2983, 54193 }, { 8741, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003, 25239 }, { 25238, 8742, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };
		aBigInteger2 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");
		anIntArray84 = new int[99];
		local8 = 0;
		for (local10 = 0; local10 < 99; local10++) {
			@Pc(313) int local313 = local10 + 1;
			@Pc(326) int local326 = (int) ((double) local313 + Math.pow(2.0D, (double) local313 / 7.0D) * 300.0D);
			local8 += local326;
			anIntArray84[local10] = local8 / 4;
		}
		anIntArray87 = new int[] { 9104, 10275, 7595, 3610, 7975, 8526, 918, 38802, 24466, 10145, 58654, 5027, 1457, 16565, 34991, 25486 };
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(I)V")
	private static void method99() {
		try {
			Class39.aBoolean215 = true;
			Class1_Sub1_Sub2_Sub1.aBoolean154 = true;
			aBoolean48 = true;
			Class4.aBoolean32 = true;
		} catch (@Pc(13) RuntimeException local13) {
			signlink.reporterror("43106, " + -21519 + ", " + local13.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "s", descriptor = "(I)V")
	private static void method153() {
		try {
			Class39.aBoolean215 = false;
			Class1_Sub1_Sub2_Sub1.aBoolean154 = false;
			aBoolean48 = false;
			Class4.aBoolean32 = false;
		} catch (@Pc(12) RuntimeException local12) {
			signlink.reporterror("65125, " + -136 + ", " + local12.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(III)Ljava/lang/String;")
	private static String method154(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(8) int local8 = arg1 - arg0;
			if (local8 < -9) {
				return "@red@";
			} else if (local8 < -6) {
				return "@or3@";
			} else if (local8 < -3) {
				return "@or2@";
			} else if (local8 < 0) {
				return "@or1@";
			} else if (local8 > 9) {
				return "@gre@";
			} else if (local8 > 6) {
				return "@gr3@";
			} else if (local8 > 3) {
				return "@gr2@";
			} else if (local8 > 0) {
				return "@gr1@";
			} else {
				return "@yel@";
			}
		} catch (@Pc(49) RuntimeException local49) {
			signlink.reporterror("66696, " + arg0 + ", " + arg1 + ", " + -34316 + ", " + local49.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "f", descriptor = "(II)Ljava/lang/String;")
	private static String method158(@OriginalArg(0) int arg0) {
		try {
			if (arg0 < 100000) {
				return String.valueOf(arg0);
			} else if (arg0 < 10000000) {
				return arg0 / 1000 + "K";
			} else {
				return arg0 / 1000000 + "M";
			}
		} catch (@Pc(38) RuntimeException local38) {
			signlink.reporterror("17773, " + arg0 + ", " + -5001 + ", " + local38.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "main", descriptor = "([Ljava/lang/String;)V")
	public static void main(@OriginalArg(0) String[] arg0) {
		try {
			System.out.println("RS2 user client - release #" + 249);
			if (arg0.length == 5) {
				anInt261 = Integer.parseInt(arg0[0]);
				anInt262 = Integer.parseInt(arg0[1]);
				if (arg0[2].equals("lowmem")) {
					method99();
				} else if (arg0[2].equals("highmem")) {
					method153();
				} else {
					System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
					return;
				}
				if (arg0[3].equals("free")) {
					aBoolean47 = false;
				} else if (arg0[3].equals("members")) {
					aBoolean47 = true;
				} else {
					System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
					return;
				}
				signlink.anInt924 = Integer.parseInt(arg0[4]);
				signlink.startpriv(InetAddress.getLocalHost());
				@Pc(87) client local87 = new client();
				local87.method85(anInt311);
			} else {
				System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
			}
		} catch (@Pc(94) Exception local94) {
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ZI)Ljava/lang/String;")
	private static String method183(@OriginalArg(1) int arg0) {
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
			signlink.reporterror("24543, " + false + ", " + arg0 + ", " + local98.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(B)V")
	private void method98() {
		try {
			System.out.println("============");
			System.out.println("flame-cycle:" + this.anInt406);
			if (this.aClass45_Sub1_1 != null) {
				System.out.println("Od-cycle:" + this.aClass45_Sub1_1.anInt979);
			}
			System.out.println("loop-cycle:" + anInt446);
			System.out.println("draw-cycle:" + anInt441);
			System.out.println("ptype:" + this.anInt423);
			System.out.println("psize:" + this.anInt422);
			if (this.aClass8_1 != null) {
				this.aClass8_1.method249((byte) 6);
			}
			super.aBoolean41 = true;
		} catch (@Pc(86) RuntimeException local86) {
			signlink.reporterror("31622, " + 6 + ", " + local86.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(I)Ljava/awt/Component;")
	@Override
	protected Component method95(@OriginalArg(0) int arg0) {
		try {
			@Pc(3) boolean local3 = false;
			if (signlink.mainapp == null) {
				return super.aFrame_Sub1_2 == null ? this : super.aFrame_Sub1_2;
			} else {
				return signlink.mainapp;
			}
		} catch (@Pc(16) RuntimeException local16) {
			signlink.reporterror("5908, " + arg0 + ", " + local16.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ZILclient!mb;)V")
	private void method100(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub1_Sub3 arg1) {
		try {
			@Pc(6) int local6 = arg1.method509(8);
			@Pc(12) int local12;
			if (local6 < this.anInt420) {
				for (local12 = local6; local12 < this.anInt420; local12++) {
					this.anIntArray52[this.anInt305++] = this.anIntArray91[local12];
				}
			}
			if (local6 > this.anInt420) {
				signlink.reporterror(this.aString17 + " Too many players");
				throw new RuntimeException("eek");
			}
			this.anInt420 = 0;
			for (local12 = 0; local12 < local6; local12++) {
				@Pc(74) int local74 = this.anIntArray91[local12];
				@Pc(79) Class1_Sub1_Sub1_Sub1_Sub2 local79 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local74];
				@Pc(84) int local84 = arg1.method509(1);
				if (local84 == 0) {
					this.anIntArray91[this.anInt420++] = local74;
					local79.anInt170 = anInt446;
				} else {
					@Pc(107) int local107 = arg1.method509(2);
					if (local107 == 0) {
						this.anIntArray91[this.anInt420++] = local74;
						local79.anInt170 = anInt446;
						this.anIntArray92[this.anInt421++] = local74;
					} else {
						@Pc(158) int local158;
						@Pc(168) int local168;
						if (local107 == 1) {
							this.anIntArray91[this.anInt420++] = local74;
							local79.anInt170 = anInt446;
							local158 = arg1.method509(3);
							local79.method47(local158, false);
							local168 = arg1.method509(1);
							if (local168 == 1) {
								this.anIntArray92[this.anInt421++] = local74;
							}
						} else if (local107 == 2) {
							this.anIntArray91[this.anInt420++] = local74;
							local79.anInt170 = anInt446;
							local158 = arg1.method509(3);
							local79.method47(local158, true);
							local168 = arg1.method509(3);
							local79.method47(local168, true);
							@Pc(226) int local226 = arg1.method509(1);
							if (local226 == 1) {
								this.anIntArray92[this.anInt421++] = local74;
							}
						} else if (local107 == 3) {
							this.anIntArray52[this.anInt305++] = local74;
						}
					}
				}
			}
		} catch (@Pc(263) RuntimeException local263) {
			signlink.reporterror("64211, " + true + ", " + arg0 + ", " + arg1 + ", " + local263.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "f", descriptor = "(I)V")
	private void method101(@OriginalArg(0) int arg0) {
		try {
			@Pc(11) int local11;
			for (@Pc(3) int local3 = -1; local3 < this.anInt420; local3++) {
				if (local3 == -1) {
					local11 = this.anInt419;
				} else {
					local11 = this.anIntArray91[local3];
				}
				@Pc(23) Class1_Sub1_Sub1_Sub1_Sub2 local23 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local11];
				if (local23 != null && local23.anInt141 > 0) {
					local23.anInt141--;
					if (local23.anInt141 == 0) {
						local23.aString3 = null;
					}
				}
			}
			@Pc(49) boolean local49 = false;
			for (local11 = 0; local11 < this.anInt389; local11++) {
				@Pc(58) int local58 = this.anIntArray85[local11];
				@Pc(63) Class1_Sub1_Sub1_Sub1_Sub1 local63 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local58];
				if (local63 != null && local63.anInt141 > 0) {
					local63.anInt141--;
					if (local63.anInt141 == 0) {
						local63.aString3 = null;
					}
				}
			}
		} catch (@Pc(87) RuntimeException local87) {
			signlink.reporterror("65308, " + arg0 + ", " + local87.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "g", descriptor = "(I)V")
	private void method102() {
		try {
			signlink.anInt929 = 0;
			signlink.midi = "stop";
		} catch (@Pc(12) RuntimeException local12) {
			signlink.reporterror("72263, " + 0 + ", " + local12.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(II)V")
	private void method103(@OriginalArg(1) int arg0) {
		try {
			signlink.anInt931 = arg0;
		} catch (@Pc(11) RuntimeException local11) {
			signlink.reporterror("90732, " + 9993 + ", " + arg0 + ", " + local11.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/Runnable;I)V")
	@Override
	public void method96(@OriginalArg(0) Runnable arg0, @OriginalArg(1) int arg1) {
		if (arg1 > 10) {
			arg1 = 10;
		}
		if (signlink.mainapp == null) {
			super.method96(arg0, arg1);
		} else {
			signlink.startthread(arg0, arg1);
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(II)Ljava/lang/String;")
	private String method104(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(3) boolean local3 = false;
			return arg0 < 999999999 ? String.valueOf(arg0) : "*";
		} catch (@Pc(12) RuntimeException local12) {
			signlink.reporterror("16828, " + arg0 + ", " + arg1 + ", " + local12.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Z)V")
	private void method105() {
		try {
			this.aBoolean46 &= true;
			Class9.aClass42_4.method643();
			Class9.aClass42_5.method643();
			Class13.aClass42_6.method643();
			Class15.aClass42_7.method643();
			Class15.aClass42_8.method643();
			Class1_Sub1_Sub1_Sub1_Sub2.aClass42_1.method643();
			Class32.aClass42_9.method643();
		} catch (@Pc(21) RuntimeException local21) {
			signlink.reporterror("87505, " + true + ", " + local21.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(B)V")
	private void method106() {
		try {
			for (@Pc(3) int local3 = 0; local3 < this.anInt350; local3++) {
				if (this.anIntArray79[local3] <= 0) {
					@Pc(12) boolean local12 = false;
					try {
						if (this.anIntArray40[local3] != this.anInt248 || this.anIntArray70[local3] != this.anInt330) {
							@Pc(45) Class1_Sub1_Sub3 local45 = Class5.method80(this.anIntArray70[local3], this.anIntArray40[local3]);
							if (System.currentTimeMillis() + (long) (local45.anInt768 / 22) > this.aLong16 + (long) (this.anInt356 / 22)) {
								this.anInt356 = local45.anInt768;
								this.aLong16 = System.currentTimeMillis();
								if (this.method135(local45.anInt768, local45.aByteArray9)) {
									this.anInt248 = this.anIntArray40[local3];
									this.anInt330 = this.anIntArray70[local3];
								} else {
									local12 = true;
								}
							}
						} else if (!this.method202((byte) 7)) {
							local12 = true;
						}
					} catch (@Pc(95) Exception local95) {
					}
					if (local12 && this.anIntArray79[local3] != -5) {
						this.anIntArray79[local3] = -5;
					} else {
						this.anInt350--;
						for (@Pc(111) int local111 = local3; local111 < this.anInt350; local111++) {
							this.anIntArray40[local111] = this.anIntArray40[local111 + 1];
							this.anIntArray70[local111] = this.anIntArray70[local111 + 1];
							this.anIntArray79[local111] = this.anIntArray79[local111 + 1];
						}
						local3--;
					}
				} else {
					@Pc(163) int local163 = this.anIntArray79[local3]--;
				}
			}
			if (9 == this.aByte8 && this.anInt357 > 0) {
				this.anInt357 -= 20;
				if (this.anInt357 < 0) {
					this.anInt357 = 0;
				}
				if (this.anInt357 == 0 && this.aBoolean75 && !aBoolean48) {
					this.anInt434 = this.anInt321;
					this.aBoolean87 = false;
					this.aClass45_Sub1_1.method657(2, this.anInt434);
					return;
				}
			}
		} catch (@Pc(214) RuntimeException local214) {
			signlink.reporterror("733, " + 9 + ", " + local214.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;Z)V")
	private void method107(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) boolean arg2) {
		signlink.errorname = arg0;
		try {
			if (!arg2) {
				this.aString9 = "";
				this.aString10 = "Connecting to server...";
				this.method143();
			}
			this.aClass8_1 = new Class8(this, this.method131(anInt262 + 43594), 7);
			@Pc(29) long local29 = Class49.method679(arg0);
			@Pc(36) int local36 = (int) (local29 >> 16 & 0x1FL);
			this.aClass1_Sub1_Sub3_4.anInt768 = 0;
			this.aClass1_Sub1_Sub3_4.method488(14);
			this.aClass1_Sub1_Sub3_4.method488(local36);
			this.aClass8_1.method248(this.aClass1_Sub1_Sub3_4.aByteArray9, 2);
			for (@Pc(59) int local59 = 0; local59 < 8; local59++) {
				this.aClass8_1.method245();
			}
			@Pc(73) int local73 = this.aClass8_1.method245();
			@Pc(216) int local216;
			@Pc(251) int local251;
			if (local73 == 0) {
				this.aClass8_1.method247(this.aClass1_Sub1_Sub3_3.aByteArray9, 0, 8);
				this.aClass1_Sub1_Sub3_3.anInt768 = 0;
				this.aLong14 = this.aClass1_Sub1_Sub3_3.method504();
				@Pc(96) int[] local96 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (this.aLong14 >> 32), (int) this.aLong14 };
				this.aClass1_Sub1_Sub3_4.anInt768 = 0;
				this.aClass1_Sub1_Sub3_4.method488(10);
				this.aClass1_Sub1_Sub3_4.method492(local96[0]);
				this.aClass1_Sub1_Sub3_4.method492(local96[1]);
				this.aClass1_Sub1_Sub3_4.method492(local96[2]);
				this.aClass1_Sub1_Sub3_4.method492(local96[3]);
				this.aClass1_Sub1_Sub3_4.method492(signlink.anInt923);
				this.aClass1_Sub1_Sub3_4.method495(arg0);
				this.aClass1_Sub1_Sub3_4.method495(arg1);
				this.aClass1_Sub1_Sub3_4.method513(aBigInteger2, aBigInteger1);
				this.aClass1_Sub1_Sub3_2.anInt768 = 0;
				if (arg2) {
					this.aClass1_Sub1_Sub3_2.method488(18);
				} else {
					this.aClass1_Sub1_Sub3_2.method488(16);
				}
				this.aClass1_Sub1_Sub3_2.method488(this.aClass1_Sub1_Sub3_4.anInt768 + 36 + 1 + 1);
				this.aClass1_Sub1_Sub3_2.method488(249);
				this.aClass1_Sub1_Sub3_2.method488(aBoolean48 ? 1 : 0);
				for (local216 = 0; local216 < 9; local216++) {
					this.aClass1_Sub1_Sub3_2.method492(this.anIntArray51[local216]);
				}
				this.aClass1_Sub1_Sub3_2.method496(this.aClass1_Sub1_Sub3_4.anInt768, this.aClass1_Sub1_Sub3_4.aByteArray9);
				this.aClass1_Sub1_Sub3_4.aClass47_2 = new Class47(this.aByte14, local96);
				for (local251 = 0; local251 < 4; local251++) {
					local96[local251] += 50;
				}
				this.aClass47_1 = new Class47(this.aByte14, local96);
				this.aClass8_1.method248(this.aClass1_Sub1_Sub3_2.aByteArray9, this.aClass1_Sub1_Sub3_2.anInt768);
				local73 = this.aClass8_1.method245();
			}
			if (local73 == 1) {
				try {
					Thread.sleep(2000L);
				} catch (@Pc(294) Exception local294) {
				}
				this.method107(arg0, arg1, arg2);
			} else if (local73 == 2 || local73 == 18 || local73 == 19) {
				this.anInt329 = 0;
				if (local73 == 18) {
					this.anInt329 = 1;
				}
				if (local73 == 19) {
					this.anInt329 = 2;
				}
				Class10.method267(this.aBoolean58);
				this.aLong17 = 0L;
				this.anInt353 = 0;
				this.aClass11_1.anInt557 = 0;
				super.aBoolean43 = true;
				this.aBoolean63 = true;
				this.aBoolean46 = true;
				this.aClass1_Sub1_Sub3_4.anInt768 = 0;
				this.aClass1_Sub1_Sub3_3.anInt768 = 0;
				this.anInt423 = -1;
				this.anInt377 = -1;
				this.anInt378 = -1;
				this.anInt379 = -1;
				this.anInt422 = 0;
				this.anInt424 = 0;
				this.anInt272 = 0;
				this.anInt426 = 0;
				this.anInt408 = 0;
				this.anInt338 = 0;
				this.anInt365 = 0;
				this.aBoolean61 = false;
				super.anInt231 = 0;
				for (@Pc(395) int local395 = 0; local395 < 100; local395++) {
					this.aStringArray3[local395] = null;
				}
				this.anInt283 = 0;
				this.anInt394 = 0;
				this.anInt362 = 0;
				this.anInt350 = 0;
				this.anInt439 = (int) (Math.random() * 100.0D) - 50;
				this.anInt253 = (int) (Math.random() * 110.0D) - 55;
				this.anInt334 = (int) (Math.random() * 80.0D) - 40;
				this.anInt413 = (int) (Math.random() * 120.0D) - 60;
				this.anInt359 = (int) (Math.random() * 30.0D) - 20;
				this.anInt403 = (int) (Math.random() * 20.0D) - 10 & 0x7FF;
				this.anInt249 = -1;
				this.anInt296 = 0;
				this.anInt297 = 0;
				this.anInt420 = 0;
				this.anInt389 = 0;
				for (local216 = 0; local216 < this.anInt418; local216++) {
					this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local216] = null;
					this.aClass1_Sub1_Sub3Array1[local216] = null;
				}
				for (local251 = 0; local251 < 8192; local251++) {
					this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local251] = null;
				}
				aClass1_Sub1_Sub1_Sub1_Sub2_1 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[this.anInt419] = new Class1_Sub1_Sub1_Sub1_Sub2();
				this.aClass31_3.method527();
				this.aClass31_2.method527();
				@Pc(537) int local537;
				for (@Pc(533) int local533 = 0; local533 < 4; local533++) {
					for (local537 = 0; local537 < 104; local537++) {
						for (@Pc(541) int local541 = 0; local541 < 104; local541++) {
							this.aClass31ArrayArrayArray1[local533][local537][local541] = null;
						}
					}
				}
				this.aClass31_1 = new Class31(-767);
				this.anInt317 = 0;
				this.anInt331 = -1;
				this.anInt412 = -1;
				this.anInt278 = -1;
				this.anInt343 = -1;
				this.anInt416 = -1;
				this.aBoolean73 = false;
				this.anInt263 = 3;
				this.aBoolean62 = false;
				this.aBoolean61 = false;
				this.aBoolean44 = false;
				this.aString15 = null;
				this.anInt435 = 0;
				this.anInt415 = -1;
				this.aBoolean53 = true;
				this.method140(this.aByte13);
				for (local537 = 0; local537 < 5; local537++) {
					this.anIntArray88[local537] = 0;
				}
				anInt304 = 0;
				anInt380 = 0;
				anInt358 = 0;
				anInt252 = 0;
				anInt265 = 0;
				anInt386 = 0;
				anInt266 = 0;
				anInt361 = 0;
				anInt337 = 0;
				this.method164();
			} else if (local73 == 3) {
				this.aString9 = "";
				this.aString10 = "Invalid username or password.";
			} else if (local73 == 4) {
				this.aString9 = "Your account has been disabled.";
				this.aString10 = "Please check your message-centre for details.";
			} else if (local73 == 5) {
				this.aString9 = "Your account is already logged in.";
				this.aString10 = "Try again in 60 secs...";
			} else if (local73 == 6) {
				this.aString9 = "RuneScape has been updated!";
				this.aString10 = "Please reload this page.";
			} else if (local73 == 7) {
				this.aString9 = "This world is full.";
				this.aString10 = "Please use a different world.";
			} else if (local73 == 8) {
				this.aString9 = "Unable to connect.";
				this.aString10 = "Login server offline.";
			} else if (local73 == 9) {
				this.aString9 = "Login limit exceeded.";
				this.aString10 = "Too many connections from your address.";
			} else if (local73 == 10) {
				this.aString9 = "Unable to connect.";
				this.aString10 = "Bad session id.";
			} else if (local73 == 11) {
				this.aString10 = "Login server rejected session.";
				this.aString10 = "Please try again.";
			} else if (local73 == 12) {
				this.aString9 = "You need a members account to login to this world.";
				this.aString10 = "Please subscribe, or use a different world.";
			} else if (local73 == 13) {
				this.aString9 = "Could not complete login.";
				this.aString10 = "Please try using a different world.";
			} else if (local73 == 14) {
				this.aString9 = "The server is being updated.";
				this.aString10 = "Please wait 1 minute and try again.";
			} else if (local73 == 15) {
				this.aBoolean46 = true;
				this.aClass1_Sub1_Sub3_4.anInt768 = 0;
				this.aClass1_Sub1_Sub3_3.anInt768 = 0;
				this.anInt423 = -1;
				this.anInt377 = -1;
				this.anInt378 = -1;
				this.anInt379 = -1;
				this.anInt422 = 0;
				this.anInt424 = 0;
				this.anInt272 = 0;
				this.anInt365 = 0;
				this.aBoolean61 = false;
				this.aLong15 = System.currentTimeMillis();
			} else if (local73 == 16) {
				this.aString9 = "Login attempts exceeded.";
				this.aString10 = "Please wait 1 minute and try again.";
			} else if (local73 == 17) {
				this.aString9 = "You are standing in a members-only area.";
				this.aString10 = "To play on this world move to a free area first";
			} else if (local73 == 20) {
				this.aString9 = "Invalid loginserver requested";
				this.aString10 = "Please try using a different world.";
			} else if (local73 == -1) {
				this.aString9 = "No response from server";
				this.aString10 = "Please try using a different world.";
			} else {
				System.out.println("response:" + local73);
				this.aString9 = "Unexpected server response";
				this.aString10 = "Please try using a different world.";
			}
		} catch (@Pc(878) IOException local878) {
			this.aString9 = "";
			this.aString10 = "Error connecting to server.";
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ZII)Z")
	private boolean method108(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		try {
			@Pc(3) boolean local3 = false;
			@Pc(16) Class6 local16 = Class6.aClass6Array1[arg0];
			for (@Pc(18) int local18 = 0; local18 < local16.anIntArray100.length && local16.anIntArray100[local18] != -1; local18++) {
				@Pc(33) Class6 local33 = Class6.aClass6Array1[local16.anIntArray100[local18]];
				if (local33.anInt452 == 1) {
					local3 |= this.method108(local33.anInt450, arg1);
				}
				if (local33.anInt452 == 6 && (local33.anInt473 != -1 || local33.anInt474 != -1)) {
					@Pc(63) boolean local63 = this.method114(local33, 295);
					@Pc(68) int local68;
					if (local63) {
						local68 = local33.anInt474;
					} else {
						local68 = local33.anInt473;
					}
					if (local68 != -1) {
						@Pc(80) Class27 local80 = Class27.aClass27Array1[local68];
						local33.anInt449 += arg1;
						while (local33.anInt449 > local80.method517(local33.anInt448)) {
							local33.anInt449 -= local80.method517(local33.anInt448) + 1;
							local33.anInt448++;
							if (local33.anInt448 >= local80.anInt800) {
								local33.anInt448 -= local80.anInt801;
								if (local33.anInt448 < 0 || local33.anInt448 >= local80.anInt800) {
									local33.anInt448 = 0;
								}
							}
							local3 = true;
						}
					}
				}
			}
			return local3;
		} catch (@Pc(148) RuntimeException local148) {
			signlink.reporterror("33278, " + false + ", " + arg0 + ", " + arg1 + ", " + local148.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Z)V")
	private void method109() {
		try {
			if (aBoolean48 && this.anInt362 == 2 && Class4.anInt203 != this.anInt257) {
				this.aClass37_26.method538();
				this.aClass1_Sub1_Sub2_Sub4_2.method465("Loading - please wait.", 0, 151, 257);
				this.aClass1_Sub1_Sub2_Sub4_2.method465("Loading - please wait.", 16777215, 150, 256);
				this.aClass37_26.method539(4, super.aGraphics2, 4);
				this.anInt362 = 1;
				this.aLong15 = System.currentTimeMillis();
			}
			if (this.anInt362 == 1) {
				@Pc(56) int local56 = this.method110((byte) 7);
				if (local56 != 0 && System.currentTimeMillis() - this.aLong15 > 360000L) {
					signlink.reporterror(this.aString17 + " glcfb " + this.aLong14 + "," + local56 + "," + aBoolean48 + "," + this.aClass46Array1[0] + "," + this.aClass45_Sub1_1.method658() + "," + this.anInt257 + "," + this.anInt344 + "," + this.anInt345);
					this.aLong15 = System.currentTimeMillis();
				}
			}
			if (this.anInt362 == 2 && this.anInt257 != this.anInt249) {
				this.anInt249 = this.anInt257;
				this.method184(this.anInt257);
			}
		} catch (@Pc(137) RuntimeException local137) {
			signlink.reporterror("2431, " + false + ", " + local137.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "f", descriptor = "(B)I")
	private int method110(@OriginalArg(0) byte arg0) {
		try {
			for (@Pc(3) int local3 = 0; local3 < this.aByteArrayArray2.length; local3++) {
				if (this.aByteArrayArray2[local3] == null && this.anIntArray55[local3] != -1) {
					return -1;
				}
				if (this.aByteArrayArray1[local3] == null && this.anIntArray56[local3] != -1) {
					return -2;
				}
			}
			@Pc(39) boolean local39 = true;
			for (@Pc(41) int local41 = 0; local41 < this.aByteArrayArray2.length; local41++) {
				@Pc(48) byte[] local48 = this.aByteArrayArray1[local41];
				if (local48 != null) {
					@Pc(62) int local62 = (this.anIntArray54[local41] >> 8) * 64 - this.anInt312;
					@Pc(74) int local74 = (this.anIntArray54[local41] & 0xFF) * 64 - this.anInt313;
					local39 &= Class4.method59(local48, local74, local62);
				}
			}
			if (!local39) {
				return -3;
			} else if (this.aBoolean51) {
				return -4;
			} else {
				this.anInt362 = 2;
				Class4.anInt203 = this.anInt257;
				this.method112(this.aByte10);
				@Pc(112) boolean local112 = false;
				return 0;
			}
		} catch (@Pc(122) RuntimeException local122) {
			signlink.reporterror("47367, " + arg0 + ", " + local122.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "h", descriptor = "(I)V")
	private void method111(@OriginalArg(0) int arg0) {
		try {
			if (this.anInt326 == 0) {
				this.aStringArray1[0] = "Cancel";
				this.anIntArray49[0] = 1252;
				this.anInt365 = 1;
				this.method147();
				this.anInt259 = 0;
				if (super.anInt233 > 4 && super.anInt234 > 4 && super.anInt233 < 516 && super.anInt234 < 338) {
					if (this.anInt278 == -1) {
						this.method213();
					} else {
						this.method217(4, this.anInt323, 4, 0, super.anInt233, super.anInt234, Class6.aClass6Array1[this.anInt278]);
					}
				}
				if (this.anInt259 != this.anInt250) {
					this.anInt250 = this.anInt259;
				}
				this.anInt259 = 0;
				if (super.anInt233 > 553 && super.anInt234 > 205 && super.anInt233 < 743 && super.anInt234 < 466) {
					if (this.anInt343 != -1) {
						this.method217(205, this.anInt323, 553, 0, super.anInt233, super.anInt234, Class6.aClass6Array1[this.anInt343]);
					} else if (this.anIntArray65[this.anInt263] != -1) {
						this.method217(205, this.anInt323, 553, 0, super.anInt233, super.anInt234, Class6.aClass6Array1[this.anIntArray65[this.anInt263]]);
					}
				}
				if (this.anInt259 != this.anInt256) {
					this.aBoolean82 = true;
					this.anInt256 = this.anInt259;
				}
				this.anInt259 = 0;
				if (super.anInt233 > 17 && super.anInt234 > 357 && super.anInt233 < 496 && super.anInt234 < 453) {
					if (this.anInt412 != -1) {
						this.method217(357, this.anInt323, 17, 0, super.anInt233, super.anInt234, Class6.aClass6Array1[this.anInt412]);
					} else if (super.anInt234 < 434 && super.anInt233 < 426) {
						this.method180(super.anInt234 - 357, this.aBoolean45, super.anInt233 - 17);
					}
				}
				if (this.anInt412 != -1 && this.anInt259 != this.anInt322) {
					this.aBoolean52 = true;
					this.anInt322 = this.anInt259;
				}
				@Pc(228) boolean local228 = false;
				this.anInt422 += arg0;
				while (!local228) {
					local228 = true;
					for (@Pc(240) int local240 = 0; local240 < this.anInt365 - 1; local240++) {
						if (this.anIntArray49[local240] < 1000 && this.anIntArray49[local240 + 1] > 1000) {
							@Pc(261) String local261 = this.aStringArray1[local240];
							this.aStringArray1[local240] = this.aStringArray1[local240 + 1];
							this.aStringArray1[local240 + 1] = local261;
							@Pc(283) int local283 = this.anIntArray49[local240];
							this.anIntArray49[local240] = this.anIntArray49[local240 + 1];
							this.anIntArray49[local240 + 1] = local283;
							@Pc(305) int local305 = this.anIntArray47[local240];
							this.anIntArray47[local240] = this.anIntArray47[local240 + 1];
							this.anIntArray47[local240 + 1] = local305;
							@Pc(327) int local327 = this.anIntArray48[local240];
							this.anIntArray48[local240] = this.anIntArray48[local240 + 1];
							this.anIntArray48[local240 + 1] = local327;
							@Pc(349) int local349 = this.anIntArray50[local240];
							this.anIntArray50[local240] = this.anIntArray50[local240 + 1];
							this.anIntArray50[local240 + 1] = local349;
							local228 = false;
						}
					}
				}
			}
		} catch (@Pc(379) RuntimeException local379) {
			signlink.reporterror("94294, " + arg0 + ", " + local379.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "g", descriptor = "(B)V")
	private void method112(@OriginalArg(0) byte arg0) {
		try {
			@Pc(22) int local22;
			@Pc(50) int local50;
			@Pc(54) int local54;
			@Pc(63) int local63;
			@Pc(70) int local70;
			@Pc(133) int local133;
			@Pc(190) int local190;
			try {
				this.anInt249 = -1;
				this.aClass31_2.method527();
				this.aClass31_3.method527();
				Class1_Sub1_Sub2_Sub1.method373();
				this.method105();
				this.aClass39_1.method544(this.anInt387);
				for (local22 = 0; local22 < 4; local22++) {
					this.aClass19Array1[local22].method414();
				}
				System.gc();
				@Pc(46) Class4 local46 = new Class4(0, 104, this.aByteArrayArrayArray7, 104, this.anIntArrayArrayArray3);
				local50 = this.aByteArrayArray2.length;
				Class4.aBoolean32 = Class39.aBoolean215;
				for (local54 = 0; local54 < local50; local54++) {
					local63 = this.anIntArray54[local54] >> 8;
					local70 = this.anIntArray54[local54] & 0xFF;
					if (local63 == 33 && local70 >= 71 && local70 <= 73) {
						Class4.aBoolean32 = false;
					}
				}
				if (Class4.aBoolean32) {
					this.aClass39_1.method545(this.anInt257);
				} else {
					this.aClass39_1.method545(0);
				}
				this.aClass1_Sub1_Sub3_4.method487(206);
				@Pc(138) byte[] local138;
				for (local63 = 0; local63 < local50; local63++) {
					local70 = (this.anIntArray54[local63] >> 8) * 64 - this.anInt312;
					local133 = (this.anIntArray54[local63] & 0xFF) * 64 - this.anInt313;
					local138 = this.aByteArrayArray2[local63];
					if (local138 != null) {
						local46.method58(local138, local133, (this.anInt345 - 6) * 8, local70, (this.anInt344 - 6) * 8);
					}
				}
				for (local70 = 0; local70 < local50; local70++) {
					local133 = (this.anIntArray54[local70] >> 8) * 64 - this.anInt312;
					local190 = (this.anIntArray54[local70] & 0xFF) * 64 - this.anInt313;
					@Pc(195) byte[] local195 = this.aByteArrayArray2[local70];
					if (local195 == null && this.anInt345 < 800) {
						local46.method57(local133, local190);
					}
				}
				this.aClass1_Sub1_Sub3_4.method487(206);
				@Pc(240) int local240;
				for (local133 = 0; local133 < local50; local133++) {
					local138 = this.aByteArrayArray1[local133];
					if (local138 != null) {
						local240 = (this.anIntArray54[local133] >> 8) * 64 - this.anInt312;
						@Pc(252) int local252 = (this.anIntArray54[local133] & 0xFF) * 64 - this.anInt313;
						local46.method61(this.aClass39_1, local252, local240, this.aClass19Array1, local138);
					}
				}
				this.aClass1_Sub1_Sub3_4.method487(206);
				local46.method63(this.aClass19Array1, this.aClass39_1);
				this.aClass37_26.method538();
				this.aClass1_Sub1_Sub3_4.method487(206);
				for (local190 = 0; local190 < 104; local190++) {
					for (local240 = 0; local240 < 104; local240++) {
						this.method162(local190, local240);
					}
				}
				this.method124();
			} catch (@Pc(312) Exception local312) {
			}
			Class9.aClass42_4.method643();
			@Pc(326) int local326;
			if (aBoolean48 && signlink.aRandomAccessFile1 != null) {
				local22 = this.aClass45_Sub1_1.method650(0);
				for (local326 = 0; local326 < local22; local326++) {
					local50 = this.aClass45_Sub1_1.method655(local326);
					if ((local50 & 0x79) == 0) {
						Class1_Sub1_Sub1_Sub5.method287(local326);
					}
				}
			}
			System.gc();
			Class1_Sub1_Sub2_Sub1.method374();
			this.aClass45_Sub1_1.method661();
			local22 = (this.anInt344 - 6) / 8 - 1;
			local326 = (this.anInt344 + 6) / 8 + 1;
			local50 = (this.anInt345 - 6) / 8 - 1;
			local54 = (this.anInt345 + 6) / 8 + 1;
			if (arg0 != -4) {
				this.aClass1_Sub1_Sub3_4.method488(45);
			}
			if (this.aBoolean74) {
				local22 = 49;
				local326 = 50;
				local50 = 49;
				local54 = 50;
			}
			for (local63 = local22; local63 <= local326; local63++) {
				for (local70 = local50; local70 <= local54; local70++) {
					if (local63 == local22 || local63 == local326 || local70 == local50 || local70 == local54) {
						local133 = this.aClass45_Sub1_1.method652(local70, 0, local63);
						if (local133 != -1) {
							this.aClass45_Sub1_1.method662(3, local133);
						}
						local190 = this.aClass45_Sub1_1.method652(local70, 1, local63);
						if (local190 != -1) {
							this.aClass45_Sub1_1.method662(3, local190);
						}
					}
				}
			}
		} catch (@Pc(471) RuntimeException local471) {
			signlink.reporterror("84084, " + arg0 + ", " + local471.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(Z)V")
	private void method113() {
		try {
			if (this.anInt390 != 0) {
				@Pc(6) Class1_Sub1_Sub2_Sub4 local6 = this.aClass1_Sub1_Sub2_Sub4_2;
				@Pc(13) int local13 = 0;
				if (this.anInt272 != 0) {
					local13 = 1;
				}
				for (@Pc(20) int local20 = 0; local20 < 100; local20++) {
					if (this.aStringArray3[local20] != null) {
						@Pc(32) int local32 = this.anIntArray39[local20];
						@Pc(37) String local37 = this.aStringArray2[local20];
						@Pc(39) byte local39 = 0;
						if (local37 != null && local37.startsWith("@cr1@")) {
							local37 = local37.substring(5);
							local39 = 1;
						}
						if (local37 != null && local37.startsWith("@cr2@")) {
							local37 = local37.substring(5);
							local39 = 2;
						}
						@Pc(91) int local91;
						if ((local32 == 3 || local32 == 7) && (local32 == 7 || this.anInt447 == 0 || this.anInt447 == 1 && this.method226(local37, this.aByte6))) {
							local91 = 329 - local13 * 13;
							local6.method468(local91, 4, "From", 0);
							local6.method468(local91 - 1, 4, "From", 65535);
							@Pc(116) int local116 = local6.method467("From ") + 4;
							if (local39 == 1) {
								this.aClass1_Sub1_Sub2_Sub3Array1[0].method445(local91 - 12, local116);
								local116 += 14;
							}
							if (local39 == 2) {
								this.aClass1_Sub1_Sub2_Sub3Array1[1].method445(local91 - 12, local116);
								local116 += 14;
							}
							local6.method468(local91, local116, local37 + ": " + this.aStringArray3[local20], 0);
							local6.method468(local91 - 1, local116, local37 + ": " + this.aStringArray3[local20], 65535);
							local13++;
							if (local13 >= 5) {
								return;
							}
						}
						if (local32 == 5 && this.anInt447 < 2) {
							local91 = 329 - local13 * 13;
							local6.method468(local91, 4, this.aStringArray3[local20], 0);
							local6.method468(local91 - 1, 4, this.aStringArray3[local20], 65535);
							local13++;
							if (local13 >= 5) {
								return;
							}
						}
						if (local32 == 6 && this.anInt447 < 2) {
							local91 = 329 - local13 * 13;
							local6.method468(local91, 4, "To " + local37 + ": " + this.aStringArray3[local20], 0);
							local6.method468(local91 - 1, 4, "To " + local37 + ": " + this.aStringArray3[local20], 65535);
							local13++;
							if (local13 >= 5) {
								return;
							}
						}
					}
				}
			}
		} catch (@Pc(295) RuntimeException local295) {
			signlink.reporterror("26100, " + false + ", " + local295.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!d;I)Z")
	private boolean method114(@OriginalArg(0) Class6 arg0, @OriginalArg(1) int arg1) {
		try {
			if (arg0.anIntArray98 == null) {
				return false;
			}
			for (@Pc(6) int local6 = 0; local6 < arg0.anIntArray98.length; local6++) {
				@Pc(15) int local15 = this.method145(this.aByte3, arg0, local6);
				@Pc(20) int local20 = arg0.anIntArray99[local6];
				if (arg0.anIntArray98[local6] == 2) {
					if (local15 >= local20) {
						return false;
					}
				} else if (arg0.anIntArray98[local6] == 3) {
					if (local15 <= local20) {
						return false;
					}
				} else if (arg0.anIntArray98[local6] == 4) {
					if (local15 == local20) {
						return false;
					}
				} else if (local15 != local20) {
					return false;
				}
			}
			@Pc(68) boolean local68 = false;
			return true;
		} catch (@Pc(71) RuntimeException local71) {
			signlink.reporterror("83075, " + arg0 + ", " + arg1 + ", " + local71.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!d;B)Z")
	private boolean method115(@OriginalArg(0) Class6 arg0) {
		try {
			@Pc(15) int local15 = arg0.anInt454;
			if (local15 == 201) {
				this.aBoolean52 = true;
				this.aBoolean62 = false;
				this.aBoolean44 = true;
				this.aString11 = "";
				this.anInt374 = 1;
				this.aString12 = "Enter name of friend to add to list";
			}
			if (local15 == 202) {
				this.aBoolean52 = true;
				this.aBoolean62 = false;
				this.aBoolean44 = true;
				this.aString11 = "";
				this.anInt374 = 2;
				this.aString12 = "Enter name of friend to delete from list";
			}
			if (local15 == 205) {
				this.anInt426 = 250;
				return true;
			}
			if (local15 == 501) {
				this.aBoolean52 = true;
				this.aBoolean62 = false;
				this.aBoolean44 = true;
				this.aString11 = "";
				this.anInt374 = 4;
				this.aString12 = "Enter name of player to add to list";
			}
			if (local15 == 502) {
				this.aBoolean52 = true;
				this.aBoolean62 = false;
				this.aBoolean44 = true;
				this.aString11 = "";
				this.anInt374 = 5;
				this.aString12 = "Enter name of player to delete from list";
			}
			@Pc(119) int local119;
			@Pc(123) int local123;
			@Pc(128) int local128;
			if (local15 >= 300 && local15 <= 313) {
				local119 = (local15 - 300) / 2;
				local123 = local15 & 0x1;
				local128 = this.anIntArray36[local119];
				if (local128 != -1) {
					while (true) {
						if (local123 == 0) {
							local128--;
							if (local128 < 0) {
								local128 = Class23.anInt747 - 1;
							}
						}
						if (local123 == 1) {
							local128++;
							if (local128 >= Class23.anInt747) {
								local128 = 0;
							}
						}
						if (!Class23.aClass23Array1[local128].aBoolean180 && Class23.aClass23Array1[local128].anInt748 == local119 + (this.aBoolean53 ? 0 : 7)) {
							this.anIntArray36[local119] = local128;
							this.aBoolean54 = true;
							break;
						}
					}
				}
			}
			if (local15 >= 314 && local15 <= 323) {
				local119 = (local15 - 314) / 2;
				local123 = local15 & 0x1;
				local128 = this.anIntArray88[local119];
				if (local123 == 0) {
					local128--;
					if (local128 < 0) {
						local128 = anIntArrayArray3[local119].length - 1;
					}
				}
				if (local123 == 1) {
					local128++;
					if (local128 >= anIntArrayArray3[local119].length) {
						local128 = 0;
					}
				}
				this.anIntArray88[local119] = local128;
				this.aBoolean54 = true;
			}
			if (local15 == 324 && !this.aBoolean53) {
				this.aBoolean53 = true;
				this.method140(this.aByte13);
			}
			if (local15 == 325 && this.aBoolean53) {
				this.aBoolean53 = false;
				this.method140(this.aByte13);
			}
			if (local15 == 326) {
				this.aClass1_Sub1_Sub3_4.method487(150);
				this.aClass1_Sub1_Sub3_4.method488(this.aBoolean53 ? 0 : 1);
				for (local119 = 0; local119 < 7; local119++) {
					this.aClass1_Sub1_Sub3_4.method488(this.anIntArray36[local119]);
				}
				for (local123 = 0; local123 < 5; local123++) {
					this.aClass1_Sub1_Sub3_4.method488(this.anIntArray88[local123]);
				}
				return true;
			}
			if (local15 == 613) {
				this.aBoolean72 = !this.aBoolean72;
			}
			if (local15 >= 601 && local15 <= 612) {
				this.method204(251);
				if (this.aString8.length() > 0) {
					this.aClass1_Sub1_Sub3_4.method487(205);
					this.aClass1_Sub1_Sub3_4.method494(Class49.method679(this.aString8), this.anInt295);
					this.aClass1_Sub1_Sub3_4.method488(local15 - 601);
					this.aClass1_Sub1_Sub3_4.method488(this.aBoolean72 ? 1 : 0);
				}
			}
			return false;
		} catch (@Pc(359) RuntimeException local359) {
			signlink.reporterror("95095, " + arg0 + ", " + -50 + ", " + local359.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IBIIII)V")
	private void method116(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		try {
			this.aClass1_Sub1_Sub2_Sub3_19.method445(arg2, arg1);
			this.aClass1_Sub1_Sub2_Sub3_20.method445(arg2 + arg4 - 16, arg1);
			Class1_Sub1_Sub2.method458(16, arg1, arg2 + 16, arg4 - 32, this.anInt355);
			@Pc(41) int local41 = (arg4 - 32) * arg4 / arg3;
			if (local41 < 8) {
				local41 = 8;
			}
			@Pc(58) int local58 = (arg4 - local41 - 32) * arg0 / (arg3 - arg4);
			Class1_Sub1_Sub2.method458(16, arg1, arg2 + local58 + 16, local41, this.anInt392);
			Class1_Sub1_Sub2.method463(arg2 + local58 + 16, local41, this.anInt308, arg1);
			Class1_Sub1_Sub2.method463(arg2 + local58 + 16, local41, this.anInt308, arg1 + 1);
			Class1_Sub1_Sub2.method461(arg2 + local58 + 16, arg1, 16, this.anInt308);
			Class1_Sub1_Sub2.method461(arg2 + local58 + 17, arg1, 16, this.anInt308);
			Class1_Sub1_Sub2.method463(arg2 + local58 + 16, local41, this.anInt320, arg1 + 15);
			Class1_Sub1_Sub2.method463(arg2 + local58 + 17, local41 - 1, this.anInt320, arg1 + 14);
			Class1_Sub1_Sub2.method461(arg2 + local58 + local41 + 15, arg1, 16, this.anInt320);
			Class1_Sub1_Sub2.method461(arg2 + local58 + local41 + 14, arg1 + 1, 15, this.anInt320);
		} catch (@Pc(174) RuntimeException local174) {
			signlink.reporterror("4589, " + arg0 + ", " + 8 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local174.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(Z)V")
	private void method117() {
		try {
			this.aClass37_27.method538();
			Class1_Sub1_Sub2_Sub1.anIntArray185 = this.anIntArray80;
			this.aClass1_Sub1_Sub2_Sub3_13.method445(0, 0);
			if (this.aBoolean44) {
				this.aClass1_Sub1_Sub2_Sub4_3.method465(this.aString12, 0, 40, 239);
				this.aClass1_Sub1_Sub2_Sub4_3.method465(this.aString11 + "*", 128, 60, 239);
			} else if (this.aBoolean62) {
				this.aClass1_Sub1_Sub2_Sub4_3.method465("Enter amount:", 0, 40, 239);
				this.aClass1_Sub1_Sub2_Sub4_3.method465(this.aString6 + "*", 128, 60, 239);
			} else if (this.aString15 != null) {
				this.aClass1_Sub1_Sub2_Sub4_3.method465(this.aString15, 0, 40, 239);
				this.aClass1_Sub1_Sub2_Sub4_3.method465("Click to continue", 128, 60, 239);
			} else if (this.anInt412 != -1) {
				this.method170(Class6.aClass6Array1[this.anInt412], 0, 0, 0);
			} else if (this.anInt331 == -1) {
				@Pc(137) Class1_Sub1_Sub2_Sub4 local137 = this.aClass1_Sub1_Sub2_Sub4_2;
				@Pc(139) int local139 = 0;
				Class1_Sub1_Sub2.method455(0, 463, 77, 0, this.aBoolean79);
				for (@Pc(148) int local148 = 0; local148 < 100; local148++) {
					if (this.aStringArray3[local148] != null) {
						@Pc(160) int local160 = this.anIntArray39[local148];
						@Pc(169) int local169 = this.anInt354 + 70 - local139 * 14;
						@Pc(174) String local174 = this.aStringArray2[local148];
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
								local137.method468(local169, 4, this.aStringArray3[local148], 0);
							}
							local139++;
						}
						@Pc(247) int local247;
						if ((local160 == 1 || local160 == 2) && (local160 == 1 || this.anInt364 == 0 || this.anInt364 == 1 && this.method226(local174, this.aByte6))) {
							if (local169 > 0 && local169 < 110) {
								local247 = 4;
								if (local176 == 1) {
									this.aClass1_Sub1_Sub2_Sub3Array1[0].method445(local169 - 12, 4);
									local247 += 14;
								}
								if (local176 == 2) {
									this.aClass1_Sub1_Sub2_Sub3Array1[1].method445(local169 - 12, local247);
									local247 += 14;
								}
								local137.method468(local169, local247, local174 + ":", 0);
								local247 += local137.method467(local174) + 8;
								local137.method468(local169, local247, this.aStringArray3[local148], 255);
							}
							local139++;
						}
						if ((local160 == 3 || local160 == 7) && this.anInt390 == 0 && (local160 == 7 || this.anInt447 == 0 || this.anInt447 == 1 && this.method226(local174, this.aByte6))) {
							if (local169 > 0 && local169 < 110) {
								local137.method468(local169, 4, "From", 0);
								local247 = local137.method467("From ") + 4;
								if (local176 == 1) {
									this.aClass1_Sub1_Sub2_Sub3Array1[0].method445(local169 - 12, local247);
									local247 += 14;
								}
								if (local176 == 2) {
									this.aClass1_Sub1_Sub2_Sub3Array1[1].method445(local169 - 12, local247);
									local247 += 14;
								}
								local137.method468(local169, local247, local174 + ":", 0);
								local247 += local137.method467(local174) + 8;
								local137.method468(local169, local247, this.aStringArray3[local148], 8388608);
							}
							local139++;
						}
						if (local160 == 4 && (this.anInt306 == 0 || this.anInt306 == 1 && this.method226(local174, this.aByte6))) {
							if (local169 > 0 && local169 < 110) {
								local137.method468(local169, 4, local174 + " " + this.aStringArray3[local148], 8388736);
							}
							local139++;
						}
						if (local160 == 5 && this.anInt390 == 0 && this.anInt447 < 2) {
							if (local169 > 0 && local169 < 110) {
								local137.method468(local169, 4, this.aStringArray3[local148], 8388608);
							}
							local139++;
						}
						if (local160 == 6 && this.anInt390 == 0 && this.anInt447 < 2) {
							if (local169 > 0 && local169 < 110) {
								local137.method468(local169, 4, "To " + local174 + ":", 0);
								local137.method468(local169, local137.method467("To " + local174) + 12, this.aStringArray3[local148], 8388608);
							}
							local139++;
						}
						if (local160 == 8 && (this.anInt306 == 0 || this.anInt306 == 1 && this.method226(local174, this.aByte6))) {
							if (local169 > 0 && local169 < 110) {
								local137.method468(local169, 4, local174 + " " + this.aStringArray3[local148], 8270336);
							}
							local139++;
						}
					}
				}
				Class1_Sub1_Sub2.method454();
				this.anInt351 = local139 * 14 + 7;
				if (this.anInt351 < 78) {
					this.anInt351 = 78;
				}
				this.method116(this.anInt351 - this.anInt354 - 77, 463, 0, this.anInt351, 77);
				@Pc(620) String local620;
				if (aClass1_Sub1_Sub1_Sub1_Sub2_1 == null || aClass1_Sub1_Sub1_Sub1_Sub2_1.aString4 == null) {
					local620 = Class49.method683(this.aString17);
				} else {
					local620 = aClass1_Sub1_Sub1_Sub1_Sub2_1.aString4;
				}
				local137.method468(90, 4, local620 + ":", 0);
				local137.method468(90, local137.method467(local620 + ": ") + 6, this.aString14 + "*", 255);
				Class1_Sub1_Sub2.method461(77, 0, 479, 0);
			} else {
				this.method170(Class6.aClass6Array1[this.anInt331], 0, 0, 0);
			}
			if (this.aBoolean61 && this.anInt366 == 2) {
				this.method142();
			}
			this.aClass37_27.method539(357, super.aGraphics2, 17);
			this.aClass37_26.method538();
			Class1_Sub1_Sub2_Sub1.anIntArray185 = this.anIntArray82;
		} catch (@Pc(701) RuntimeException local701) {
			signlink.reporterror("67508, " + false + ", " + local701.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(BZ)V")
	private void method118(@OriginalArg(0) byte arg0, @OriginalArg(1) boolean arg1) {
		try {
			if (aClass1_Sub1_Sub1_Sub1_Sub2_1.anInt130 >> 7 == this.anInt296 && aClass1_Sub1_Sub1_Sub1_Sub2_1.anInt131 >> 7 == this.anInt297) {
				this.anInt296 = 0;
			}
			@Pc(21) int local21 = this.anInt420;
			@Pc(26) boolean local26 = false;
			if (arg1) {
				local21 = 1;
			}
			for (@Pc(36) int local36 = 0; local36 < local21; local36++) {
				@Pc(42) Class1_Sub1_Sub1_Sub1_Sub2 local42;
				@Pc(47) int local47;
				if (arg1) {
					local42 = aClass1_Sub1_Sub1_Sub1_Sub2_1;
					local47 = this.anInt419 << 14;
				} else {
					local42 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[this.anIntArray91[local36]];
					local47 = this.anIntArray91[local36] << 14;
				}
				if (local42 != null && local42.method49()) {
					local42.aBoolean28 = false;
					if ((aBoolean48 && this.anInt420 > 50 || this.anInt420 > 200) && !arg1 && local42.anInt150 == local42.anInt134) {
						local42.aBoolean28 = true;
					}
					@Pc(98) int local98 = local42.anInt130 >> 7;
					@Pc(103) int local103 = local42.anInt131 >> 7;
					if (local98 >= 0 && local98 < 104 && local103 >= 0 && local103 < 104) {
						if (local42.aClass1_Sub1_Sub1_Sub5_1 == null || anInt446 < local42.anInt182 || anInt446 >= local42.anInt183) {
							if ((local42.anInt130 & 0x7F) == 64 && (local42.anInt131 & 0x7F) == 64) {
								if (this.anIntArrayArray2[local98][local103] == this.anInt303) {
									continue;
								}
								this.anIntArrayArray2[local98][local103] = this.anInt303;
							}
							local42.anInt181 = this.method151(local42.anInt131, this.anInt257, local42.anInt130, (byte) 6);
							this.aClass39_1.method555(local42, local42.anInt181, local42.anInt132, local47, local42.aBoolean26, this.anInt257, local42.anInt131, 60, this.anInt282, local42.anInt130);
						} else {
							local42.aBoolean28 = false;
							local42.anInt181 = this.method151(local42.anInt131, this.anInt257, local42.anInt130, (byte) 6);
							this.aClass39_1.method556(local42, local47, local42.anInt190, local42.anInt132, local42.anInt181, local42.anInt131, local42.anInt187, local42.anInt130, this.anInt257, this.aByte9, local42.anInt188, local42.anInt189);
						}
					}
				}
			}
		} catch (@Pc(234) RuntimeException local234) {
			signlink.reporterror("12410, " + arg0 + ", " + arg1 + ", " + local234.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!jb;III)V")
	private void method119(@OriginalArg(0) Class1_Sub1_Sub2_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		try {
			@Pc(17) int local17 = arg1 * arg1 + arg2 * arg2;
			if (local17 > 4225 && local17 < 90000) {
				@Pc(31) int local31 = this.anInt403 + this.anInt413 & 0x7FF;
				@Pc(35) int local35 = Class1_Sub1_Sub1_Sub5.anIntArray158[local31];
				@Pc(39) int local39 = Class1_Sub1_Sub1_Sub5.anIntArray159[local31];
				@Pc(48) int local48 = local35 * 256 / (this.anInt359 + 256);
				@Pc(57) int local57 = local39 * 256 / (this.anInt359 + 256);
				@Pc(67) int local67 = arg2 * local48 + arg1 * local57 >> 16;
				@Pc(77) int local77 = arg2 * local57 - arg1 * local48 >> 16;
				@Pc(83) double local83 = Math.atan2((double) local67, (double) local77);
				@Pc(89) int local89 = (int) (Math.sin(local83) * 63.0D);
				@Pc(95) int local95 = (int) (Math.cos(local83) * 57.0D);
				this.aClass1_Sub1_Sub2_Sub2_1.method411(local89 + 94 + 4 - 10, local83, 83 - local95 - 20);
			} else {
				this.method207(arg0, arg2, arg1);
			}
		} catch (@Pc(126) RuntimeException local126) {
			signlink.reporterror("82319, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 0 + ", " + local126.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "h", descriptor = "(B)V")
	private void method120() {
		try {
			if (this.anInt408 == 2) {
				this.method224((this.anInt382 - this.anInt313 << 7) + this.anInt385, this.anInt383 * 2, (this.anInt381 - this.anInt312 << 7) + this.anInt384);
				if (this.anInt347 > -1 && anInt446 % 20 < 10) {
					this.aClass1_Sub1_Sub2_Sub2Array5[2].method406(this.anInt348 - 28, this.anInt347 - 12);
				}
			}
		} catch (@Pc(60) RuntimeException local60) {
			signlink.reporterror("84815, " + 109 + ", " + local60.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(II)Z")
	private boolean method121(@OriginalArg(1) int arg0) {
		try {
			if (arg0 < 0) {
				return false;
			}
			@Pc(8) int local8 = this.anIntArray49[arg0];
			if (local8 >= 2000) {
				local8 -= 2000;
			}
			return local8 == 406;
		} catch (@Pc(26) RuntimeException local26) {
			signlink.reporterror("22848, " + 0 + ", " + arg0 + ", " + local26.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "i", descriptor = "(I)V")
	private void method122() {
		try {
			@Pc(4) Graphics local4 = this.method95(437).getGraphics();
			local4.setColor(Color.black);
			local4.fillRect(0, 0, 765, 503);
			this.method88();
			@Pc(42) byte local42;
			@Pc(48) int local48;
			if (this.aBoolean70) {
				this.aBoolean59 = false;
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
			if (this.aBoolean85) {
				this.aBoolean59 = false;
				local4.setFont(new Font("Helvetica", 1, 20));
				local4.setColor(Color.white);
				local4.drawString("Error - unable to load game!", 50, 50);
				local4.drawString("To play RuneScape make sure you play from", 50, 100);
				local4.drawString("http://www.runescape.com", 50, 150);
			}
			if (this.aBoolean49) {
				this.aBoolean59 = false;
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
			signlink.reporterror("96581, " + 3 + ", " + local180.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "j", descriptor = "(I)V")
	private void method123(@OriginalArg(0) int arg0) {
		try {
			@Pc(5) boolean local5 = false;
			try {
				@Pc(11) int local11 = aClass1_Sub1_Sub1_Sub1_Sub2_1.anInt130 + this.anInt439;
				@Pc(17) int local17 = aClass1_Sub1_Sub1_Sub1_Sub2_1.anInt131 + this.anInt253;
				if (this.anInt372 - local11 < -500 || this.anInt372 - local11 > 500 || this.anInt373 - local17 < -500 || this.anInt373 - local17 > 500) {
					this.anInt372 = local11;
					this.anInt373 = local17;
				}
				if (this.anInt372 != local11) {
					this.anInt372 += (local11 - this.anInt372) / 16;
				}
				if (this.anInt373 != local17) {
					this.anInt373 += (local17 - this.anInt373) / 16;
				}
				if (super.anIntArray32[1] == 1) {
					this.anInt404 += (-this.anInt404 - 24) / 2;
				} else if (super.anIntArray32[2] == 1) {
					this.anInt404 += (24 - this.anInt404) / 2;
				} else {
					this.anInt404 /= 2;
				}
				if (super.anIntArray32[3] == 1) {
					this.anInt405 += (12 - this.anInt405) / 2;
				} else if (super.anIntArray32[4] == 1) {
					this.anInt405 += (-this.anInt405 - 12) / 2;
				} else {
					this.anInt405 /= 2;
				}
				this.anInt403 = this.anInt403 + this.anInt404 / 2 & 0x7FF;
				this.anInt402 += this.anInt405 / 2;
				if (this.anInt402 < 128) {
					this.anInt402 = 128;
				}
				if (this.anInt402 > 383) {
					this.anInt402 = 383;
				}
				@Pc(204) int local204 = this.anInt372 >> 7;
				@Pc(209) int local209 = this.anInt373 >> 7;
				@Pc(219) int local219 = this.method151(this.anInt373, this.anInt257, this.anInt372, (byte) 6);
				@Pc(221) int local221 = 0;
				@Pc(237) int local237;
				if (local204 > 3 && local209 > 3 && local204 < 100 && local209 < 100) {
					for (local237 = local204 - 4; local237 <= local204 + 4; local237++) {
						for (@Pc(243) int local243 = local209 - 4; local243 <= local209 + 4; local243++) {
							@Pc(248) int local248 = this.anInt257;
							if (local248 < 3 && (this.aByteArrayArrayArray7[1][local237][local243] & 0x2) == 2) {
								local248++;
							}
							@Pc(275) int local275 = local219 - this.anIntArrayArrayArray3[local248][local237][local243];
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
				if (local237 > this.anInt409) {
					this.anInt409 += (local237 - this.anInt409) / 24;
				} else if (local237 < this.anInt409) {
					this.anInt409 += (local237 - this.anInt409) / 80;
				}
			} catch (@Pc(339) Exception local339) {
				signlink.reporterror("glfc_ex " + aClass1_Sub1_Sub1_Sub1_Sub2_1.anInt130 + "," + aClass1_Sub1_Sub1_Sub1_Sub2_1.anInt131 + "," + this.anInt372 + "," + this.anInt373 + "," + this.anInt344 + "," + this.anInt345 + "," + this.anInt312 + "," + this.anInt313);
				throw new RuntimeException("eek");
			}
		} catch (@Pc(389) RuntimeException local389) {
			signlink.reporterror("38852, " + arg0 + ", " + local389.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(Z)V")
	private void method124() {
		try {
			for (@Pc(13) Class1_Sub2 local13 = (Class1_Sub2) this.aClass31_1.method523(); local13 != null; local13 = (Class1_Sub2) this.aClass31_1.method525()) {
				if (local13.anInt824 == -1) {
					local13.anInt823 = 0;
					this.method216(local13);
				} else {
					local13.method669();
				}
			}
		} catch (@Pc(40) RuntimeException local40) {
			signlink.reporterror("66254, " + false + ", " + local40.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "f", descriptor = "(Z)V")
	private void method125() {
		try {
			for (@Pc(9) Class1_Sub1_Sub1_Sub4 local9 = (Class1_Sub1_Sub1_Sub4) this.aClass31_3.method523(); local9 != null; local9 = (Class1_Sub1_Sub1_Sub4) this.aClass31_3.method525()) {
				if (local9.anInt496 != this.anInt257 || anInt446 > local9.anInt502) {
					local9.method669();
				} else if (anInt446 >= local9.anInt501) {
					if (local9.anInt505 > 0) {
						@Pc(39) Class1_Sub1_Sub1_Sub1_Sub1 local39 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local9.anInt505 - 1];
						if (local39 != null && local39.anInt130 >= 0 && local39.anInt130 < 13312 && local39.anInt131 >= 0 && local39.anInt131 < 13312) {
							local9.method254(anInt446, local39.anInt131, local39.anInt130, this.method151(local39.anInt131, local9.anInt496, local39.anInt130, (byte) 6) - local9.anInt500);
						}
					}
					if (local9.anInt505 < 0) {
						@Pc(84) int local84 = -local9.anInt505 - 1;
						@Pc(90) Class1_Sub1_Sub1_Sub1_Sub2 local90;
						if (local84 == this.anInt246) {
							local90 = aClass1_Sub1_Sub1_Sub1_Sub2_1;
						} else {
							local90 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local84];
						}
						if (local90 != null && local90.anInt130 >= 0 && local90.anInt130 < 13312 && local90.anInt131 >= 0 && local90.anInt131 < 13312) {
							local9.method254(anInt446, local90.anInt131, local90.anInt130, this.method151(local90.anInt131, local9.anInt496, local90.anInt130, (byte) 6) - local9.anInt500);
						}
					}
					local9.method255(this.anInt301);
					this.aClass39_1.method555(local9, (int) local9.aDouble3, local9.anInt506, -1, false, this.anInt257, (int) local9.aDouble2, 60, this.anInt282, (int) local9.aDouble1);
				}
			}
		} catch (@Pc(171) RuntimeException local171) {
			signlink.reporterror("37783, " + true + ", " + local171.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(JB)V")
	private void method126(@OriginalArg(0) long arg0) {
		try {
			if (arg0 != 0L) {
				if (this.anInt258 >= 100) {
					this.method211(0, "", "Your ignore list is full. Max of 100 hit");
				} else {
					@Pc(23) String local23 = Class49.method683(Class49.method680(arg0));
					for (@Pc(25) int local25 = 0; local25 < this.anInt258; local25++) {
						if (this.aLongArray3[local25] == arg0) {
							this.method211(0, "", local23 + " is already on your ignore list");
							return;
						}
					}
					for (@Pc(55) int local55 = 0; local55 < this.anInt317; local55++) {
						if (this.aLongArray4[local55] == arg0) {
							this.method211(0, "", "Please remove " + local23 + " from your friend list first");
							return;
						}
					}
					this.aLongArray3[this.anInt258++] = arg0;
					if (this.aByte15 != -117) {
						this.aBoolean71 = !this.aBoolean71;
					}
					this.aBoolean82 = true;
					this.aClass1_Sub1_Sub3_4.method487(20);
					this.aClass1_Sub1_Sub3_4.method494(arg0, this.anInt295);
				}
			}
		} catch (@Pc(123) RuntimeException local123) {
			signlink.reporterror("90022, " + arg0 + ", " + -117 + ", " + local123.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "i", descriptor = "(B)V")
	private void method127() {
		try {
			if (this.aByte11 != 8) {
				this.aClass1_Sub1_Sub3_4.method488(134);
			}
			if (super.anInt238 == 1) {
				if (super.anInt239 >= 6 && super.anInt239 <= 106 && super.anInt240 >= 467 && super.anInt240 <= 499) {
					this.anInt364 = (this.anInt364 + 1) % 4;
					this.aBoolean83 = true;
					this.aBoolean52 = true;
					this.aClass1_Sub1_Sub3_4.method487(8);
					this.aClass1_Sub1_Sub3_4.method488(this.anInt364);
					this.aClass1_Sub1_Sub3_4.method488(this.anInt447);
					this.aClass1_Sub1_Sub3_4.method488(this.anInt306);
				}
				if (super.anInt239 >= 135 && super.anInt239 <= 235 && super.anInt240 >= 467 && super.anInt240 <= 499) {
					this.anInt447 = (this.anInt447 + 1) % 3;
					this.aBoolean83 = true;
					this.aBoolean52 = true;
					this.aClass1_Sub1_Sub3_4.method487(8);
					this.aClass1_Sub1_Sub3_4.method488(this.anInt364);
					this.aClass1_Sub1_Sub3_4.method488(this.anInt447);
					this.aClass1_Sub1_Sub3_4.method488(this.anInt306);
				}
				if (super.anInt239 >= 273 && super.anInt239 <= 373 && super.anInt240 >= 467 && super.anInt240 <= 499) {
					this.anInt306 = (this.anInt306 + 1) % 3;
					this.aBoolean83 = true;
					this.aBoolean52 = true;
					this.aClass1_Sub1_Sub3_4.method487(8);
					this.aClass1_Sub1_Sub3_4.method488(this.anInt364);
					this.aClass1_Sub1_Sub3_4.method488(this.anInt447);
					this.aClass1_Sub1_Sub3_4.method488(this.anInt306);
				}
				if (super.anInt239 >= 412 && super.anInt239 <= 512 && super.anInt240 >= 467 && super.anInt240 <= 499) {
					this.method204(251);
					this.aString8 = "";
					this.aBoolean72 = false;
					for (@Pc(188) int local188 = 0; local188 < Class6.aClass6Array1.length; local188++) {
						if (Class6.aClass6Array1[local188] != null && Class6.aClass6Array1[local188].anInt454 == 600) {
							this.anInt332 = this.anInt278 = Class6.aClass6Array1[local188].anInt451;
							return;
						}
					}
					return;
				}
			}
		} catch (@Pc(217) RuntimeException local217) {
			signlink.reporterror("69736, " + 8 + ", " + local217.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!mb;IZ)V")
	private void method128(@OriginalArg(0) Class1_Sub1_Sub3 arg0, @OriginalArg(1) int arg1) {
		try {
			this.anInt305 = 0;
			this.anInt421 = 0;
			this.method210(arg1, arg0);
			this.method100(arg1, arg0);
			this.method172(arg1, arg0);
			this.method221(arg1, arg0);
			@Pc(36) int local36;
			for (@Pc(29) int local29 = 0; local29 < this.anInt305; local29++) {
				local36 = this.anIntArray52[local29];
				if (this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local36].anInt170 != anInt446) {
					this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local36] = null;
				}
			}
			if (arg0.anInt768 != arg1) {
				signlink.reporterror("Error packet size mismatch in getplayer pos:" + arg0.anInt768 + " psize:" + arg1);
				throw new RuntimeException("eek");
			}
			for (local36 = 0; local36 < this.anInt420; local36++) {
				if (this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[this.anIntArray91[local36]] == null) {
					signlink.reporterror(this.aString17 + " null entry in pl list - pos:" + local36 + " size:" + this.anInt420);
					throw new RuntimeException("eek");
				}
			}
		} catch (@Pc(124) RuntimeException local124) {
			signlink.reporterror("52375, " + arg0 + ", " + arg1 + ", " + false + ", " + local124.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "j", descriptor = "(B)I")
	private int method129() {
		try {
			@Pc(11) int local11 = 3;
			if (this.anInt292 < 310) {
				@Pc(20) int local20 = this.anInt289 >> 7;
				@Pc(25) int local25 = this.anInt291 >> 7;
				@Pc(30) int local30 = aClass1_Sub1_Sub1_Sub1_Sub2_1.anInt130 >> 7;
				@Pc(35) int local35 = aClass1_Sub1_Sub1_Sub1_Sub2_1.anInt131 >> 7;
				if ((this.aByteArrayArrayArray7[this.anInt257][local20][local25] & 0x4) != 0) {
					local11 = this.anInt257;
				}
				@Pc(57) int local57;
				if (local30 > local20) {
					local57 = local30 - local20;
				} else {
					local57 = local20 - local30;
				}
				@Pc(70) int local70;
				if (local35 > local25) {
					local70 = local35 - local25;
				} else {
					local70 = local25 - local35;
				}
				@Pc(85) int local85;
				@Pc(87) int local87;
				if (local57 > local70) {
					local85 = local70 * 65536 / local57;
					local87 = 32768;
					while (local20 != local30) {
						if (local20 < local30) {
							local20++;
						} else if (local20 > local30) {
							local20--;
						}
						if ((this.aByteArrayArrayArray7[this.anInt257][local20][local25] & 0x4) != 0) {
							local11 = this.anInt257;
						}
						local87 += local85;
						if (local87 >= 65536) {
							local87 -= 65536;
							if (local25 < local35) {
								local25++;
							} else if (local25 > local35) {
								local25--;
							}
							if ((this.aByteArrayArrayArray7[this.anInt257][local20][local25] & 0x4) != 0) {
								local11 = this.anInt257;
							}
						}
					}
				} else {
					local85 = local57 * 65536 / local70;
					local87 = 32768;
					while (local25 != local35) {
						if (local25 < local35) {
							local25++;
						} else if (local25 > local35) {
							local25--;
						}
						if ((this.aByteArrayArrayArray7[this.anInt257][local20][local25] & 0x4) != 0) {
							local11 = this.anInt257;
						}
						local87 += local85;
						if (local87 >= 65536) {
							local87 -= 65536;
							if (local20 < local30) {
								local20++;
							} else if (local20 > local30) {
								local20--;
							}
							if ((this.aByteArrayArrayArray7[this.anInt257][local20][local25] & 0x4) != 0) {
								local11 = this.anInt257;
							}
						}
					}
				}
			}
			if ((this.aByteArrayArrayArray7[this.anInt257][aClass1_Sub1_Sub1_Sub1_Sub2_1.anInt130 >> 7][aClass1_Sub1_Sub1_Sub1_Sub2_1.anInt131 >> 7] & 0x4) != 0) {
				local11 = this.anInt257;
			}
			return local11;
		} catch (@Pc(253) RuntimeException local253) {
			signlink.reporterror("85842, " + -107 + ", " + local253.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "k", descriptor = "(I)I")
	private int method130() {
		try {
			@Pc(20) int local20 = this.method151(this.anInt291, this.anInt257, this.anInt289, (byte) 6);
			return local20 - this.anInt290 >= 800 || (this.aByteArrayArrayArray7[this.anInt257][this.anInt289 >> 7][this.anInt291 >> 7] & 0x4) == 0 ? 3 : this.anInt257;
		} catch (@Pc(50) RuntimeException local50) {
			signlink.reporterror("73646, " + 43738 + ", " + local50.toString());
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
				return new URL("http://127.0.0.1:" + (anInt262 + 80));
			}
		} catch (@Pc(21) Exception local21) {
		}
		return super.getCodeBase();
	}

	@OriginalMember(owner = "client!client", name = "l", descriptor = "(I)Ljava/net/Socket;")
	public Socket method131(@OriginalArg(0) int arg0) throws IOException {
		return signlink.mainapp == null ? new Socket(InetAddress.getByName(this.getCodeBase().getHost()), arg0) : signlink.opensocket(arg0);
	}

	@OriginalMember(owner = "client!client", name = "m", descriptor = "(I)V")
	private void method132() {
		try {
			this.anInt422 += 0;
			if (this.anInt362 == 2) {
				for (@Pc(16) Class1_Sub2 local16 = (Class1_Sub2) this.aClass31_1.method523(); local16 != null; local16 = (Class1_Sub2) this.aClass31_1.method525()) {
					if (local16.anInt824 > 0) {
						local16.anInt824--;
					}
					if (local16.anInt824 != 0) {
						if (local16.anInt823 > 0) {
							local16.anInt823--;
						}
						if (local16.anInt823 == 0 && local16.anInt815 >= 1 && local16.anInt816 >= 1 && local16.anInt815 <= 102 && local16.anInt816 <= 102 && (local16.anInt820 < 0 || Class4.method73(local16.anInt822, local16.anInt820))) {
							this.method195(local16.anInt821, local16.anInt813, local16.anInt815, local16.anInt822, local16.anInt820, local16.anInt814, local16.anInt816);
							local16.anInt823 = -1;
							if (local16.anInt820 == local16.anInt817 && local16.anInt817 == -1) {
								local16.method669();
							} else if (local16.anInt820 == local16.anInt817 && local16.anInt821 == local16.anInt818 && local16.anInt822 == local16.anInt819) {
								local16.method669();
							}
						}
					} else if (local16.anInt817 < 0 || Class4.method73(local16.anInt819, local16.anInt817)) {
						this.method195(local16.anInt818, local16.anInt813, local16.anInt815, local16.anInt819, local16.anInt817, local16.anInt814, local16.anInt816);
						local16.method669();
					}
				}
				anInt300++;
				if (anInt300 > 85) {
					anInt300 = 0;
					this.aClass1_Sub1_Sub3_4.method487(63);
					return;
				}
			}
		} catch (@Pc(173) RuntimeException local173) {
			signlink.reporterror("78867, " + 0 + ", " + local173.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ZZ[B)V")
	private void method133(@OriginalArg(0) boolean arg0, @OriginalArg(2) byte[] arg1) {
		try {
			signlink.anInt929 = arg0 ? 1 : 0;
			signlink.midisave(arg1, arg1.length);
		} catch (@Pc(18) RuntimeException local18) {
			signlink.reporterror("95956, " + arg0 + ", " + false + ", " + arg1 + ", " + local18.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "n", descriptor = "(I)Z")
	private boolean method134() {
		try {
			this.anInt422 += 0;
			if (this.aClass8_1 == null) {
				return false;
			}
			@Pc(2397) String local2397;
			@Pc(201) int local201;
			try {
				@Pc(16) int local16 = this.aClass8_1.method246();
				if (local16 == 0) {
					return false;
				}
				if (this.anInt423 == -1) {
					this.aClass8_1.method247(this.aClass1_Sub1_Sub3_3.aByteArray9, 0, 1);
					this.anInt423 = this.aClass1_Sub1_Sub3_3.aByteArray9[0] & 0xFF;
					if (this.aClass47_1 != null) {
						this.anInt423 = this.anInt423 - this.aClass47_1.method674() & 0xFF;
					}
					this.anInt422 = Class17.anIntArray190[this.anInt423];
					local16--;
				}
				if (this.anInt422 == -1) {
					if (local16 <= 0) {
						return false;
					}
					this.aClass8_1.method247(this.aClass1_Sub1_Sub3_3.aByteArray9, 0, 1);
					this.anInt422 = this.aClass1_Sub1_Sub3_3.aByteArray9[0] & 0xFF;
					local16--;
				}
				if (this.anInt422 == -2) {
					if (local16 <= 1) {
						return false;
					}
					this.aClass8_1.method247(this.aClass1_Sub1_Sub3_3.aByteArray9, 0, 2);
					this.aClass1_Sub1_Sub3_3.anInt768 = 0;
					this.anInt422 = this.aClass1_Sub1_Sub3_3.method500();
					local16 -= 2;
				}
				if (local16 < this.anInt422) {
					return false;
				}
				this.aClass1_Sub1_Sub3_3.anInt768 = 0;
				this.aClass8_1.method247(this.aClass1_Sub1_Sub3_3.aByteArray9, 0, this.anInt422);
				this.anInt424 = 0;
				this.anInt379 = this.anInt378;
				this.anInt378 = this.anInt377;
				this.anInt377 = this.anInt423;
				@Pc(172) int local172;
				if (this.anInt423 == 15) {
					this.anInt398 = this.aClass1_Sub1_Sub3_3.method498();
					this.anInt399 = this.aClass1_Sub1_Sub3_3.method498();
					while (this.aClass1_Sub1_Sub3_3.anInt768 < this.anInt422) {
						local172 = this.aClass1_Sub1_Sub3_3.method498();
						this.method173(local172, this.aClass1_Sub1_Sub3_3);
					}
					this.anInt423 = -1;
					return true;
				}
				@Pc(205) int local205;
				if (this.anInt423 == 153) {
					local172 = this.aClass1_Sub1_Sub3_3.method500();
					local201 = this.aClass1_Sub1_Sub3_3.method500();
					local205 = this.aClass1_Sub1_Sub3_3.method500();
					@Pc(208) Class15 local208 = Class15.method345(local201);
					Class6.aClass6Array1[local172].anInt469 = 4;
					Class6.aClass6Array1[local172].anInt470 = local201;
					Class6.aClass6Array1[local172].anInt476 = local208.anInt608;
					Class6.aClass6Array1[local172].anInt477 = local208.anInt609;
					Class6.aClass6Array1[local172].anInt475 = local208.anInt607 * 100 / local205;
					this.anInt423 = -1;
					return true;
				}
				if (this.anInt423 == 165) {
					@Pc(252) Class1_Sub1_Sub3 local252 = Class10.method269();
					if (local252 != null) {
						this.aClass1_Sub1_Sub3_4.method487(19);
						this.aClass1_Sub1_Sub3_4.method489(local252.anInt768);
						this.aClass1_Sub1_Sub3_4.method496(local252.anInt768, local252.aByteArray9);
						local252.method486();
					}
					this.anInt423 = -1;
					return true;
				}
				@Pc(302) int local302;
				@Pc(315) int local315;
				@Pc(296) Class6 local296;
				if (this.anInt423 == 156) {
					this.aBoolean82 = true;
					local172 = this.aClass1_Sub1_Sub3_3.method500();
					local296 = Class6.aClass6Array1[local172];
					local205 = this.aClass1_Sub1_Sub3_3.method498();
					for (local302 = 0; local302 < local205; local302++) {
						local296.anIntArray96[local302] = this.aClass1_Sub1_Sub3_3.method500();
						local315 = this.aClass1_Sub1_Sub3_3.method498();
						if (local315 == 255) {
							local315 = this.aClass1_Sub1_Sub3_3.method503();
						}
						local296.anIntArray97[local302] = local315;
					}
					for (local315 = local205; local315 < local296.anIntArray96.length; local315++) {
						local296.anIntArray96[local315] = 0;
						local296.anIntArray97[local315] = 0;
					}
					this.anInt423 = -1;
					return true;
				}
				if (this.anInt423 == 69) {
					local172 = this.aClass1_Sub1_Sub3_3.method500();
					local201 = this.aClass1_Sub1_Sub3_3.method500();
					Class6.aClass6Array1[local172].anInt473 = local201;
					this.anInt423 = -1;
					return true;
				}
				if (this.anInt423 == 115) {
					local172 = this.aClass1_Sub1_Sub3_3.method501();
					if (local172 >= 0) {
						this.method136(local172);
					}
					this.anInt416 = local172;
					this.anInt423 = -1;
					return true;
				}
				@Pc(412) String local412;
				if (this.anInt423 == 32) {
					local172 = this.aClass1_Sub1_Sub3_3.method500();
					local412 = this.aClass1_Sub1_Sub3_3.method505();
					Class6.aClass6Array1[local172].aString19 = local412;
					if (Class6.aClass6Array1[local172].anInt451 == this.anIntArray65[this.anInt263]) {
						this.aBoolean82 = true;
					}
					this.anInt423 = -1;
					return true;
				}
				if (this.anInt423 == 96) {
					local172 = this.aClass1_Sub1_Sub3_3.method500();
					if (local172 == 65535) {
						local172 = -1;
					}
					if (local172 != this.anInt321 && this.aBoolean75 && !aBoolean48 && this.anInt357 == 0) {
						this.anInt434 = local172;
						this.aBoolean87 = true;
						this.aClass45_Sub1_1.method657(2, this.anInt434);
					}
					this.anInt321 = local172;
					this.anInt423 = -1;
					return true;
				}
				if (this.anInt423 == 39) {
					local172 = this.aClass1_Sub1_Sub3_3.method500();
					local201 = this.aClass1_Sub1_Sub3_3.method500();
					if (this.aBoolean75 && !aBoolean48) {
						this.anInt434 = local172;
						this.aBoolean87 = false;
						this.aClass45_Sub1_1.method657(2, this.anInt434);
						this.anInt357 = local201;
					}
					this.anInt423 = -1;
					return true;
				}
				if (this.anInt423 == 243) {
					this.anInt408 = this.aClass1_Sub1_Sub3_3.method498();
					if (this.anInt408 == 1) {
						this.anInt247 = this.aClass1_Sub1_Sub3_3.method500();
					}
					if (this.anInt408 >= 2 && this.anInt408 <= 6) {
						if (this.anInt408 == 2) {
							this.anInt384 = 64;
							this.anInt385 = 64;
						}
						if (this.anInt408 == 3) {
							this.anInt384 = 0;
							this.anInt385 = 64;
						}
						if (this.anInt408 == 4) {
							this.anInt384 = 128;
							this.anInt385 = 64;
						}
						if (this.anInt408 == 5) {
							this.anInt384 = 64;
							this.anInt385 = 0;
						}
						if (this.anInt408 == 6) {
							this.anInt384 = 64;
							this.anInt385 = 128;
						}
						this.anInt408 = 2;
						this.anInt381 = this.aClass1_Sub1_Sub3_3.method500();
						this.anInt382 = this.aClass1_Sub1_Sub3_3.method500();
						this.anInt383 = this.aClass1_Sub1_Sub3_3.method498();
					}
					if (this.anInt408 == 10) {
						this.anInt428 = this.aClass1_Sub1_Sub3_3.method500();
					}
					this.anInt423 = -1;
					return true;
				}
				if (this.anInt423 == 26) {
					this.anInt272 = this.aClass1_Sub1_Sub3_3.method500() * 30;
					this.anInt423 = -1;
					return true;
				}
				if (this.anInt423 == 60) {
					local172 = this.aClass1_Sub1_Sub3_3.method500();
					local201 = this.aClass1_Sub1_Sub3_3.method500();
					Class6.aClass6Array1[local172].anInt469 = 1;
					Class6.aClass6Array1[local172].anInt470 = local201;
					this.anInt423 = -1;
					return true;
				}
				if (this.anInt423 == 76) {
					local172 = this.aClass1_Sub1_Sub3_3.method500();
					local201 = this.aClass1_Sub1_Sub3_3.method500();
					Class6.aClass6Array1[local172].anInt469 = 2;
					Class6.aClass6Array1[local172].anInt470 = local201;
					this.anInt423 = -1;
					return true;
				}
				if (this.anInt423 == 2) {
					this.anInt364 = this.aClass1_Sub1_Sub3_3.method498();
					this.anInt447 = this.aClass1_Sub1_Sub3_3.method498();
					this.anInt306 = this.aClass1_Sub1_Sub3_3.method498();
					this.aBoolean83 = true;
					this.aBoolean52 = true;
					this.anInt423 = -1;
					return true;
				}
				if (this.anInt423 == 25) {
					for (local172 = 0; local172 < this.anIntArray71.length; local172++) {
						if (this.anIntArray71[local172] != this.anIntArray93[local172]) {
							this.anIntArray71[local172] = this.anIntArray93[local172];
							this.method194(local172);
							this.aBoolean82 = true;
						}
					}
					this.anInt423 = -1;
					return true;
				}
				if (this.anInt423 == 208) {
					if (this.anInt263 == 12) {
						this.aBoolean82 = true;
					}
					this.anInt436 = this.aClass1_Sub1_Sub3_3.method498();
					this.anInt423 = -1;
					return true;
				}
				if (this.anInt423 == 161) {
					this.method128(this.aClass1_Sub1_Sub3_3, this.anInt422);
					this.aBoolean51 = false;
					this.anInt423 = -1;
					return true;
				}
				if (this.anInt423 == 140) {
					this.anInt398 = this.aClass1_Sub1_Sub3_3.method498();
					this.anInt399 = this.aClass1_Sub1_Sub3_3.method498();
					for (local172 = this.anInt398; local172 < this.anInt398 + 8; local172++) {
						for (local201 = this.anInt399; local201 < this.anInt399 + 8; local201++) {
							if (this.aClass31ArrayArrayArray1[this.anInt257][local172][local201] != null) {
								this.aClass31ArrayArrayArray1[this.anInt257][local172][local201] = null;
								this.method162(local172, local201);
							}
						}
					}
					for (@Pc(875) Class1_Sub2 local875 = (Class1_Sub2) this.aClass31_1.method523(); local875 != null; local875 = (Class1_Sub2) this.aClass31_1.method525()) {
						if (local875.anInt815 >= this.anInt398 && local875.anInt815 < this.anInt398 + 8 && local875.anInt816 >= this.anInt399 && local875.anInt816 < this.anInt399 + 8 && local875.anInt813 == this.anInt257) {
							local875.anInt824 = 0;
						}
					}
					this.anInt423 = -1;
					return true;
				}
				@Pc(943) int local943;
				@Pc(964) int local964;
				@Pc(941) boolean local941;
				@Pc(931) long local931;
				if (this.anInt423 == 207) {
					local931 = this.aClass1_Sub1_Sub3_3.method504();
					local205 = this.aClass1_Sub1_Sub3_3.method503();
					local302 = this.aClass1_Sub1_Sub3_3.method498();
					local941 = false;
					for (local943 = 0; local943 < 100; local943++) {
						if (this.anIntArray41[local943] == local205) {
							local941 = true;
							break;
						}
					}
					if (local302 <= 1) {
						for (local964 = 0; local964 < this.anInt258; local964++) {
							if (this.aLongArray3[local964] == local931) {
								local941 = true;
								break;
							}
						}
					}
					if (!local941 && this.anInt388 == 0) {
						try {
							this.anIntArray41[this.anInt363] = local205;
							this.anInt363 = (this.anInt363 + 1) % 100;
							@Pc(1010) String local1010 = Class2.method40(this.aClass1_Sub1_Sub3_3, this.anInt422 - 13, 983);
							@Pc(1014) String local1014 = Class41.method613(local1010);
							if (local302 == 2 || local302 == 3) {
								this.method211(7, "@cr2@" + Class49.method683(Class49.method680(local931)), local1014);
							} else if (local302 == 1) {
								this.method211(7, "@cr1@" + Class49.method683(Class49.method680(local931)), local1014);
							} else {
								this.method211(3, Class49.method683(Class49.method680(local931)), local1014);
							}
						} catch (@Pc(1071) Exception local1071) {
							signlink.reporterror("cde1");
						}
					}
					this.anInt423 = -1;
					return true;
				}
				if (this.anInt423 == 152) {
					local172 = this.aClass1_Sub1_Sub3_3.method501();
					this.anInt331 = local172;
					this.aBoolean52 = true;
					this.anInt423 = -1;
					return true;
				}
				if (this.anInt423 == 7) {
					local172 = this.aClass1_Sub1_Sub3_3.method500();
					this.method136(local172);
					if (this.anInt343 != -1) {
						this.anInt343 = -1;
						this.aBoolean82 = true;
						this.aBoolean60 = true;
					}
					this.anInt412 = local172;
					this.aBoolean52 = true;
					this.anInt278 = -1;
					this.aBoolean73 = false;
					this.anInt423 = -1;
					return true;
				}
				if (this.anInt423 == 28) {
					Class10.method266();
					this.anInt423 = -1;
					return true;
				}
				if (this.anInt423 == 135) {
					local172 = this.aClass1_Sub1_Sub3_3.method500();
					local201 = this.aClass1_Sub1_Sub3_3.method500();
					local205 = local201 >> 10 & 0x1F;
					local302 = local201 >> 5 & 0x1F;
					local315 = local201 & 0x1F;
					Class6.aClass6Array1[local172].anInt465 = (local205 << 19) + (local302 << 11) + (local315 << 3);
					this.anInt423 = -1;
					return true;
				}
				if (this.anInt423 == 144) {
					for (local172 = 0; local172 < this.aClass1_Sub1_Sub1_Sub1_Sub2Array1.length; local172++) {
						if (this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local172] != null) {
							this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local172].anInt153 = -1;
						}
					}
					for (local201 = 0; local201 < this.aClass1_Sub1_Sub1_Sub1_Sub1Array1.length; local201++) {
						if (this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local201] != null) {
							this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local201].anInt153 = -1;
						}
					}
					this.anInt423 = -1;
					return true;
				}
				if (this.anInt423 == 225) {
					local172 = this.aClass1_Sub1_Sub3_3.method500();
					@Pc(1267) boolean local1267 = this.aClass1_Sub1_Sub3_3.method498() == 1;
					Class6.aClass6Array1[local172].aBoolean89 = local1267;
					this.anInt423 = -1;
					return true;
				}
				if (this.anInt423 == 230) {
					local172 = this.aClass1_Sub1_Sub3_3.method500();
					local201 = this.aClass1_Sub1_Sub3_3.method501();
					local205 = this.aClass1_Sub1_Sub3_3.method501();
					@Pc(1297) Class6 local1297 = Class6.aClass6Array1[local172];
					local1297.anInt457 = local201;
					local1297.anInt458 = local205;
					this.anInt423 = -1;
					return true;
				}
				if (this.anInt423 == 192) {
					local172 = this.aClass1_Sub1_Sub3_3.method500();
					@Pc(1320) byte local1320 = this.aClass1_Sub1_Sub3_3.method499();
					this.anIntArray93[local172] = local1320;
					if (this.anIntArray71[local172] != local1320) {
						this.anIntArray71[local172] = local1320;
						this.method194(local172);
						this.aBoolean82 = true;
						if (this.anInt331 != -1) {
							this.aBoolean52 = true;
						}
					}
					this.anInt423 = -1;
					return true;
				}
				if (this.anInt423 == 226) {
					local172 = this.aClass1_Sub1_Sub3_3.method500();
					local201 = this.aClass1_Sub1_Sub3_3.method500();
					@Pc(1371) Class6 local1371 = Class6.aClass6Array1[local172];
					if (local1371 != null && local1371.anInt452 == 0) {
						if (local201 < 0) {
							local201 = 0;
						}
						if (local201 > local1371.anInt460 - local1371.anInt456) {
							local201 = local1371.anInt460 - local1371.anInt456;
						}
						local1371.anInt461 = local201;
					}
					this.anInt423 = -1;
					return true;
				}
				if (this.anInt423 == 238) {
					this.anInt401 = this.aClass1_Sub1_Sub3_3.method503();
					this.anInt437 = this.aClass1_Sub1_Sub3_3.method500();
					this.anInt244 = this.aClass1_Sub1_Sub3_3.method498();
					this.anInt302 = this.aClass1_Sub1_Sub3_3.method500();
					this.anInt251 = this.aClass1_Sub1_Sub3_3.method498();
					if (this.anInt401 != 0 && this.anInt278 == -1) {
						signlink.dnslookup(Class49.method682(this.anInt401));
						this.method204(251);
						@Pc(1447) short local1447 = 650;
						if (this.anInt244 != 201 || this.anInt251 == 1) {
							local1447 = 655;
						}
						this.aString8 = "";
						this.aBoolean72 = false;
						for (local201 = 0; local201 < Class6.aClass6Array1.length; local201++) {
							if (Class6.aClass6Array1[local201] != null && Class6.aClass6Array1[local201].anInt454 == local1447) {
								this.anInt278 = Class6.aClass6Array1[local201].anInt451;
								break;
							}
						}
					}
					this.anInt423 = -1;
					return true;
				}
				if (this.anInt423 == 203) {
					this.anInt398 = this.aClass1_Sub1_Sub3_3.method498();
					this.anInt399 = this.aClass1_Sub1_Sub3_3.method498();
					this.anInt423 = -1;
					return true;
				}
				if (this.anInt423 == 123) {
					this.aBoolean55 = true;
					this.anInt273 = this.aClass1_Sub1_Sub3_3.method498();
					this.anInt274 = this.aClass1_Sub1_Sub3_3.method498();
					this.anInt275 = this.aClass1_Sub1_Sub3_3.method500();
					this.anInt276 = this.aClass1_Sub1_Sub3_3.method498();
					this.anInt277 = this.aClass1_Sub1_Sub3_3.method498();
					if (this.anInt277 >= 100) {
						local172 = this.anInt273 * 128 + 64;
						local201 = this.anInt274 * 128 + 64;
						local205 = this.method151(local201, this.anInt257, local172, (byte) 6) - this.anInt275;
						local302 = local172 - this.anInt289;
						local315 = local205 - this.anInt290;
						local943 = local201 - this.anInt291;
						local964 = (int) Math.sqrt((double) (local302 * local302 + local943 * local943));
						this.anInt292 = (int) (Math.atan2((double) local315, (double) local964) * 325.949D) & 0x7FF;
						this.anInt293 = (int) (Math.atan2((double) local302, (double) local943) * -325.949D) & 0x7FF;
						if (this.anInt292 < 128) {
							this.anInt292 = 128;
						}
						if (this.anInt292 > 383) {
							this.anInt292 = 383;
						}
					}
					this.anInt423 = -1;
					return true;
				}
				if (this.anInt423 == 56) {
					this.aBoolean44 = false;
					this.aBoolean62 = true;
					this.aString6 = "";
					this.aBoolean52 = true;
					this.anInt423 = -1;
					return true;
				}
				if (this.anInt423 == 86) {
					this.aBoolean55 = true;
					this.anInt429 = this.aClass1_Sub1_Sub3_3.method498();
					this.anInt430 = this.aClass1_Sub1_Sub3_3.method498();
					this.anInt431 = this.aClass1_Sub1_Sub3_3.method500();
					this.anInt432 = this.aClass1_Sub1_Sub3_3.method498();
					this.anInt433 = this.aClass1_Sub1_Sub3_3.method498();
					if (this.anInt433 >= 100) {
						this.anInt289 = this.anInt429 * 128 + 64;
						this.anInt291 = this.anInt430 * 128 + 64;
						this.anInt290 = this.method151(this.anInt291, this.anInt257, this.anInt289, (byte) 6) - this.anInt431;
					}
					this.anInt423 = -1;
					return true;
				}
				if (this.anInt423 == 105) {
					this.method177(this.aClass1_Sub1_Sub3_3, this.anInt422);
					this.anInt423 = -1;
					return true;
				}
				if (this.anInt423 == 174) {
					if (this.anInt343 != -1) {
						this.anInt343 = -1;
						this.aBoolean82 = true;
						this.aBoolean60 = true;
					}
					if (this.anInt412 != -1) {
						this.anInt412 = -1;
						this.aBoolean52 = true;
					}
					if (this.aBoolean62) {
						this.aBoolean62 = false;
						this.aBoolean52 = true;
					}
					this.anInt278 = -1;
					this.aBoolean73 = false;
					this.anInt423 = -1;
					return true;
				}
				@Pc(1955) int local1955;
				if (this.anInt423 == 109) {
					local931 = this.aClass1_Sub1_Sub3_3.method504();
					local205 = this.aClass1_Sub1_Sub3_3.method498();
					@Pc(1818) String local1818 = Class49.method683(Class49.method680(local931));
					for (local315 = 0; local315 < this.anInt317; local315++) {
						if (local931 == this.aLongArray4[local315]) {
							if (this.anIntArray89[local315] != local205) {
								this.anIntArray89[local315] = local205;
								this.aBoolean82 = true;
								if (local205 > 0) {
									this.method211(5, "", local1818 + " has logged in.");
								}
								if (local205 == 0) {
									this.method211(5, "", local1818 + " has logged out.");
								}
							}
							local1818 = null;
							break;
						}
					}
					if (local1818 != null && this.anInt317 < 200) {
						this.aLongArray4[this.anInt317] = local931;
						this.aStringArray4[this.anInt317] = local1818;
						this.anIntArray89[this.anInt317] = local205;
						this.anInt317++;
						this.aBoolean82 = true;
					}
					@Pc(1916) boolean local1916 = false;
					while (!local1916) {
						local1916 = true;
						for (local964 = 0; local964 < this.anInt317 - 1; local964++) {
							if (this.anIntArray89[local964] != anInt261 && this.anIntArray89[local964 + 1] == anInt261 || this.anIntArray89[local964] == 0 && this.anIntArray89[local964 + 1] != 0) {
								local1955 = this.anIntArray89[local964];
								this.anIntArray89[local964] = this.anIntArray89[local964 + 1];
								this.anIntArray89[local964 + 1] = local1955;
								@Pc(1977) String local1977 = this.aStringArray4[local964];
								this.aStringArray4[local964] = this.aStringArray4[local964 + 1];
								this.aStringArray4[local964 + 1] = local1977;
								@Pc(1999) long local1999 = this.aLongArray4[local964];
								this.aLongArray4[local964] = this.aLongArray4[local964 + 1];
								this.aLongArray4[local964 + 1] = local1999;
								this.aBoolean82 = true;
								local1916 = false;
							}
						}
					}
					this.anInt423 = -1;
					return true;
				}
				if (this.anInt423 == 49) {
					this.anInt246 = this.aClass1_Sub1_Sub3_3.method500();
					this.anInt391 = this.aClass1_Sub1_Sub3_3.method498();
					this.anInt423 = -1;
					return true;
				}
				if (this.anInt423 == 75) {
					local172 = this.aClass1_Sub1_Sub3_3.method500();
					local201 = this.aClass1_Sub1_Sub3_3.method503();
					this.anIntArray93[local172] = local201;
					if (this.anIntArray71[local172] != local201) {
						this.anIntArray71[local172] = local201;
						this.method194(local172);
						this.aBoolean82 = true;
						if (this.anInt331 != -1) {
							this.aBoolean52 = true;
						}
					}
					this.anInt423 = -1;
					return true;
				}
				if (this.anInt423 == 29) {
					local172 = this.aClass1_Sub1_Sub3_3.method500();
					local201 = this.aClass1_Sub1_Sub3_3.method498();
					if (local172 == 65535) {
						local172 = -1;
					}
					this.anIntArray65[local201] = local172;
					this.aBoolean82 = true;
					this.aBoolean60 = true;
					this.anInt423 = -1;
					return true;
				}
				if (this.anInt423 == 8) {
					this.anInt263 = this.aClass1_Sub1_Sub3_3.method498();
					this.aBoolean82 = true;
					this.aBoolean60 = true;
					this.anInt423 = -1;
					return true;
				}
				if (this.anInt423 == 177) {
					local172 = this.aClass1_Sub1_Sub3_3.method500();
					this.method136(local172);
					if (this.anInt343 != -1) {
						this.anInt343 = -1;
						this.aBoolean82 = true;
						this.aBoolean60 = true;
					}
					if (this.anInt412 != -1) {
						this.anInt412 = -1;
						this.aBoolean52 = true;
					}
					if (this.aBoolean62) {
						this.aBoolean62 = false;
						this.aBoolean52 = true;
					}
					this.anInt278 = local172;
					this.aBoolean73 = false;
					this.anInt423 = -1;
					return true;
				}
				if (this.anInt423 == 236) {
					local172 = this.aClass1_Sub1_Sub3_3.method500();
					this.method136(local172);
					if (this.anInt412 != -1) {
						this.anInt412 = -1;
						this.aBoolean52 = true;
					}
					if (this.aBoolean62) {
						this.aBoolean62 = false;
						this.aBoolean52 = true;
					}
					this.anInt343 = local172;
					this.aBoolean82 = true;
					this.aBoolean60 = true;
					this.anInt278 = -1;
					this.aBoolean73 = false;
					this.anInt423 = -1;
					return true;
				}
				if (this.anInt423 == 95) {
					this.aBoolean82 = true;
					local172 = this.aClass1_Sub1_Sub3_3.method500();
					local296 = Class6.aClass6Array1[local172];
					while (this.aClass1_Sub1_Sub3_3.anInt768 < this.anInt422) {
						local205 = this.aClass1_Sub1_Sub3_3.method498();
						local302 = this.aClass1_Sub1_Sub3_3.method500();
						local315 = this.aClass1_Sub1_Sub3_3.method498();
						if (local315 == 255) {
							local315 = this.aClass1_Sub1_Sub3_3.method503();
						}
						if (local205 >= 0 && local205 < local296.anIntArray96.length) {
							local296.anIntArray96[local205] = local302;
							local296.anIntArray97[local205] = local315;
						}
					}
					this.anInt423 = -1;
					return true;
				}
				if (this.anInt423 == 108) {
					this.anInt338 = 255;
					this.anInt423 = -1;
					return true;
				}
				if (this.anInt423 == 70) {
					if (this.anInt263 == 12) {
						this.aBoolean82 = true;
					}
					this.anInt245 = this.aClass1_Sub1_Sub3_3.method501();
					this.anInt423 = -1;
					return true;
				}
				if (this.anInt423 == 181) {
					this.anInt258 = this.anInt422 / 8;
					for (local172 = 0; local172 < this.anInt258; local172++) {
						this.aLongArray3[local172] = this.aClass1_Sub1_Sub3_3.method504();
					}
					this.anInt423 = -1;
					return true;
				}
				if (this.anInt423 == 175) {
					local2397 = this.aClass1_Sub1_Sub3_3.method505();
					@Pc(2411) long local2411;
					if (local2397.endsWith(":tradereq:")) {
						local412 = local2397.substring(0, local2397.indexOf(":"));
						local2411 = Class49.method679(local412);
						local941 = false;
						for (local943 = 0; local943 < this.anInt258; local943++) {
							if (this.aLongArray3[local943] == local2411) {
								local941 = true;
								break;
							}
						}
						if (!local941 && this.anInt388 == 0) {
							this.method211(4, local412, "wishes to trade with you.");
						}
					} else if (local2397.endsWith(":duelreq:")) {
						local412 = local2397.substring(0, local2397.indexOf(":"));
						local2411 = Class49.method679(local412);
						local941 = false;
						for (local943 = 0; local943 < this.anInt258; local943++) {
							if (this.aLongArray3[local943] == local2411) {
								local941 = true;
								break;
							}
						}
						if (!local941 && this.anInt388 == 0) {
							this.method211(8, local412, "wishes to duel with you.");
						}
					} else {
						this.method211(0, "", local2397);
					}
					this.anInt423 = -1;
					return true;
				}
				if (this.anInt423 == 229) {
					local172 = this.aClass1_Sub1_Sub3_3.method500();
					local201 = this.aClass1_Sub1_Sub3_3.method500();
					if (this.anInt412 != -1) {
						this.anInt412 = -1;
						this.aBoolean52 = true;
					}
					if (this.aBoolean62) {
						this.aBoolean62 = false;
						this.aBoolean52 = true;
					}
					this.anInt278 = local172;
					this.anInt343 = local201;
					this.aBoolean82 = true;
					this.aBoolean60 = true;
					this.aBoolean73 = false;
					this.anInt423 = -1;
					return true;
				}
				if (this.anInt423 == 110) {
					this.aBoolean82 = true;
					local172 = this.aClass1_Sub1_Sub3_3.method498();
					local201 = this.aClass1_Sub1_Sub3_3.method503();
					local205 = this.aClass1_Sub1_Sub3_3.method498();
					this.anIntArray68[local172] = local201;
					this.anIntArray76[local172] = local205;
					this.anIntArray86[local172] = 1;
					for (local302 = 0; local302 < 98; local302++) {
						if (local201 >= anIntArray84[local302]) {
							this.anIntArray86[local172] = local302 + 2;
						}
					}
					this.anInt423 = -1;
					return true;
				}
				if (this.anInt423 == 143) {
					local172 = this.aClass1_Sub1_Sub3_3.method500();
					local296 = Class6.aClass6Array1[local172];
					for (local205 = 0; local205 < local296.anIntArray96.length; local205++) {
						local296.anIntArray96[local205] = -1;
						local296.anIntArray96[local205] = 0;
					}
					this.anInt423 = -1;
					return true;
				}
				if (this.anInt423 == 233) {
					this.anInt296 = 0;
					this.anInt423 = -1;
					return true;
				}
				if (this.anInt423 == 132) {
					this.anInt415 = this.aClass1_Sub1_Sub3_3.method498();
					if (this.anInt415 == this.anInt263) {
						if (this.anInt415 == 3) {
							this.anInt263 = 1;
						} else {
							this.anInt263 = 3;
						}
						this.aBoolean82 = true;
					}
					this.anInt423 = -1;
					return true;
				}
				if (this.anInt423 == 83) {
					local172 = this.aClass1_Sub1_Sub3_3.method500();
					Class6.aClass6Array1[local172].anInt469 = 3;
					Class6.aClass6Array1[local172].anInt470 = (aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray19[0] << 24) + (aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray19[4] << 18) + (aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray18[0] << 12) + (aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray18[8] << 6) + aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray18[11];
					this.anInt423 = -1;
					return true;
				}
				if (this.anInt423 == 209) {
					local172 = this.aClass1_Sub1_Sub3_3.method500();
					local201 = this.aClass1_Sub1_Sub3_3.method498();
					local205 = this.aClass1_Sub1_Sub3_3.method500();
					if (this.aBoolean80 && !aBoolean48 && this.anInt350 < 50) {
						this.anIntArray40[this.anInt350] = local172;
						this.anIntArray70[this.anInt350] = local201;
						this.anIntArray79[this.anInt350] = local205 + Class5.anIntArray31[local172];
						this.anInt350++;
					}
					this.anInt423 = -1;
					return true;
				}
				if (this.anInt423 == 103) {
					local172 = this.aClass1_Sub1_Sub3_3.method498();
					local201 = this.aClass1_Sub1_Sub3_3.method498();
					local205 = this.aClass1_Sub1_Sub3_3.method498();
					local302 = this.aClass1_Sub1_Sub3_3.method498();
					this.aBooleanArray4[local172] = true;
					this.anIntArray64[local172] = local201;
					this.anIntArray37[local172] = local205;
					this.anIntArray90[local172] = local302;
					this.anIntArray44[local172] = 0;
					this.anInt423 = -1;
					return true;
				}
				if (this.anInt423 == 151 || this.anInt423 == 188 || this.anInt423 == 190 || this.anInt423 == 141 || this.anInt423 == 187 || this.anInt423 == 13 || this.anInt423 == 94 || this.anInt423 == 71 || this.anInt423 == 198 || this.anInt423 == 119) {
					this.method173(this.anInt423, this.aClass1_Sub1_Sub3_3);
					this.anInt423 = -1;
					return true;
				}
				if (this.anInt423 == 35) {
					this.anInt435 = this.aClass1_Sub1_Sub3_3.method498();
					this.anInt423 = -1;
					return true;
				}
				if (this.anInt423 == 36) {
					this.method220();
					this.anInt423 = -1;
					return false;
				}
				if (this.anInt423 == 134) {
					this.aBoolean55 = false;
					for (local172 = 0; local172 < 5; local172++) {
						this.aBooleanArray4[local172] = false;
					}
					this.anInt423 = -1;
					return true;
				}
				if (this.anInt423 == 66) {
					local172 = this.aClass1_Sub1_Sub3_3.method500();
					local201 = this.aClass1_Sub1_Sub3_3.method500();
					if (this.anInt344 == local172 && this.anInt345 == local201 && this.anInt362 == 2) {
						this.anInt423 = -1;
						return true;
					}
					this.anInt344 = local172;
					this.anInt345 = local201;
					this.anInt312 = (this.anInt344 - 6) * 8;
					this.anInt313 = (this.anInt345 - 6) * 8;
					this.aBoolean74 = false;
					if ((this.anInt344 / 8 == 48 || this.anInt344 / 8 == 49) && this.anInt345 / 8 == 48) {
						this.aBoolean74 = true;
					}
					if (this.anInt344 / 8 == 48 && this.anInt345 / 8 == 148) {
						this.aBoolean74 = true;
					}
					this.anInt362 = 1;
					this.aLong15 = System.currentTimeMillis();
					this.aClass37_26.method538();
					this.aClass1_Sub1_Sub2_Sub4_2.method465("Loading - please wait.", 0, 151, 257);
					this.aClass1_Sub1_Sub2_Sub4_2.method465("Loading - please wait.", 16777215, 150, 256);
					this.aClass37_26.method539(4, super.aGraphics2, 4);
					local205 = 0;
					for (local302 = (this.anInt344 - 6) / 8; local302 <= (this.anInt344 + 6) / 8; local302++) {
						for (local315 = (this.anInt345 - 6) / 8; local315 <= (this.anInt345 + 6) / 8; local315++) {
							local205++;
						}
					}
					this.aByteArrayArray2 = new byte[local205][];
					this.aByteArrayArray1 = new byte[local205][];
					this.anIntArray54 = new int[local205];
					this.anIntArray55 = new int[local205];
					this.anIntArray56 = new int[local205];
					local205 = 0;
					for (local315 = (this.anInt344 - 6) / 8; local315 <= (this.anInt344 + 6) / 8; local315++) {
						for (local943 = (this.anInt345 - 6) / 8; local943 <= (this.anInt345 + 6) / 8; local943++) {
							this.anIntArray54[local205] = (local315 << 8) + local943;
							if (this.aBoolean74 && (local943 == 49 || local943 == 149 || local943 == 147 || local315 == 50 || local315 == 49 && local943 == 47)) {
								this.anIntArray55[local205] = -1;
								this.anIntArray56[local205] = -1;
								local205++;
							} else {
								local964 = this.anIntArray55[local205] = this.aClass45_Sub1_1.method652(local943, 0, local315);
								if (local964 != -1) {
									this.aClass45_Sub1_1.method657(3, local964);
								}
								local1955 = this.anIntArray56[local205] = this.aClass45_Sub1_1.method652(local943, 1, local315);
								if (local1955 != -1) {
									this.aClass45_Sub1_1.method657(3, local1955);
								}
								local205++;
							}
						}
					}
					local943 = this.anInt312 - this.anInt314;
					local964 = this.anInt313 - this.anInt315;
					this.anInt314 = this.anInt312;
					this.anInt315 = this.anInt313;
					for (local1955 = 0; local1955 < 8192; local1955++) {
						@Pc(3300) Class1_Sub1_Sub1_Sub1_Sub1 local3300 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local1955];
						if (local3300 != null) {
							for (@Pc(3304) int local3304 = 0; local3304 < 10; local3304++) {
								local3300.anIntArray16[local3304] -= local943;
								local3300.anIntArray17[local3304] -= local964;
							}
							local3300.anInt130 -= local943 * 128;
							local3300.anInt131 -= local964 * 128;
						}
					}
					for (@Pc(3348) int local3348 = 0; local3348 < this.anInt418; local3348++) {
						@Pc(3355) Class1_Sub1_Sub1_Sub1_Sub2 local3355 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local3348];
						if (local3355 != null) {
							for (@Pc(3359) int local3359 = 0; local3359 < 10; local3359++) {
								local3355.anIntArray16[local3359] -= local943;
								local3355.anIntArray17[local3359] -= local964;
							}
							local3355.anInt130 -= local943 * 128;
							local3355.anInt131 -= local964 * 128;
						}
					}
					this.aBoolean51 = true;
					@Pc(3407) byte local3407 = 0;
					@Pc(3409) byte local3409 = 104;
					@Pc(3411) byte local3411 = 1;
					if (local943 < 0) {
						local3407 = 103;
						local3409 = -1;
						local3411 = -1;
					}
					@Pc(3421) byte local3421 = 0;
					@Pc(3423) byte local3423 = 104;
					@Pc(3425) byte local3425 = 1;
					if (local964 < 0) {
						local3421 = 103;
						local3423 = -1;
						local3425 = -1;
					}
					for (@Pc(3435) int local3435 = local3407; local3435 != local3409; local3435 += local3411) {
						for (@Pc(3439) int local3439 = local3421; local3439 != local3423; local3439 += local3425) {
							@Pc(3445) int local3445 = local3435 + local943;
							@Pc(3449) int local3449 = local3439 + local964;
							for (@Pc(3451) int local3451 = 0; local3451 < 4; local3451++) {
								if (local3445 >= 0 && local3449 >= 0 && local3445 < 104 && local3449 < 104) {
									this.aClass31ArrayArrayArray1[local3451][local3435][local3439] = this.aClass31ArrayArrayArray1[local3451][local3445][local3449];
								} else {
									this.aClass31ArrayArrayArray1[local3451][local3435][local3439] = null;
								}
							}
						}
					}
					for (@Pc(3513) Class1_Sub2 local3513 = (Class1_Sub2) this.aClass31_1.method523(); local3513 != null; local3513 = (Class1_Sub2) this.aClass31_1.method525()) {
						local3513.anInt815 -= local943;
						local3513.anInt816 -= local964;
						if (local3513.anInt815 < 0 || local3513.anInt816 < 0 || local3513.anInt815 >= 104 || local3513.anInt816 >= 104) {
							local3513.method669();
						}
					}
					if (this.anInt296 != 0) {
						this.anInt296 -= local943;
						this.anInt297 -= local964;
					}
					this.aBoolean55 = false;
					this.anInt423 = -1;
					return true;
				}
				signlink.reporterror("T1 - " + this.anInt423 + "," + this.anInt422 + " - " + this.anInt378 + "," + this.anInt379);
				this.method220();
			} catch (@Pc(3603) IOException local3603) {
				this.method165();
			} catch (@Pc(3608) Exception local3608) {
				local2397 = "T2 - " + this.anInt423 + "," + this.anInt378 + "," + this.anInt379 + " - " + this.anInt422 + "," + (this.anInt312 + aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray16[0]) + "," + (this.anInt313 + aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray17[0]) + " - ";
				for (local201 = 0; local201 < this.anInt422 && local201 < 50; local201++) {
					local2397 = local2397 + this.aClass1_Sub1_Sub3_3.aByteArray9[local201] + ",";
				}
				signlink.reporterror(local2397);
				this.method220();
			}
			return true;
		} catch (@Pc(3689) RuntimeException local3689) {
			signlink.reporterror("76621, " + 0 + ", " + local3689.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(I[BI)Z")
	private boolean method135(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1) {
		try {
			return arg1 == null ? true : signlink.wavesave(arg1, arg0);
		} catch (@Pc(12) RuntimeException local12) {
			signlink.reporterror("1335, " + arg0 + ", " + arg1 + ", " + 0 + ", " + local12.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(II)V")
	private void method136(@OriginalArg(0) int arg0) {
		try {
			@Pc(10) Class6 local10 = Class6.aClass6Array1[arg0];
			for (@Pc(12) int local12 = 0; local12 < local10.anIntArray100.length && local10.anIntArray100[local12] != -1; local12++) {
				@Pc(27) Class6 local27 = Class6.aClass6Array1[local10.anIntArray100[local12]];
				if (local27.anInt452 == 1) {
					this.method136(local27.anInt450);
				}
				local27.anInt448 = 0;
				local27.anInt449 = 0;
			}
		} catch (@Pc(50) RuntimeException local50) {
			signlink.reporterror("17233, " + arg0 + ", " + -380 + ", " + local50.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ZLclient!mb;I)V")
	private void method137(@OriginalArg(1) Class1_Sub1_Sub3 arg0, @OriginalArg(2) int arg1) {
		try {
			while (true) {
				if (arg0.anInt769 + 21 < arg1 * 8) {
					@Pc(17) int local17 = arg0.method509(13);
					if (local17 != 8191) {
						if (this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local17] == null) {
							this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local17] = new Class1_Sub1_Sub1_Sub1_Sub1();
						}
						@Pc(37) Class1_Sub1_Sub1_Sub1_Sub1 local37 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local17];
						this.anIntArray85[this.anInt389++] = local17;
						local37.anInt170 = anInt446;
						local37.aClass13_1 = Class13.method320(arg0.method509(11));
						local37.anInt133 = local37.aClass13_1.aByte21;
						local37.anInt136 = local37.aClass13_1.anInt574;
						local37.anInt137 = local37.aClass13_1.anInt575;
						local37.anInt138 = local37.aClass13_1.anInt576;
						local37.anInt139 = local37.aClass13_1.anInt577;
						local37.anInt134 = local37.aClass13_1.anInt573;
						@Pc(93) int local93 = arg0.method509(5);
						if (local93 > 15) {
							local93 -= 32;
						}
						@Pc(102) int local102 = arg0.method509(5);
						if (local102 > 15) {
							local102 -= 32;
						}
						local37.method46(aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray16[0] + local93, false, aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray17[0] + local102);
						@Pc(127) int local127 = arg0.method509(1);
						if (local127 == 1) {
							this.anIntArray92[this.anInt421++] = local17;
						}
						continue;
					}
				}
				arg0.method510();
				return;
			}
		} catch (@Pc(148) RuntimeException local148) {
			signlink.reporterror("46921, " + false + ", " + arg0 + ", " + arg1 + ", " + local148.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "o", descriptor = "(I)V")
	private void method138() {
		try {
			@Pc(11) int local11;
			for (@Pc(3) int local3 = -1; local3 < this.anInt420; local3++) {
				if (local3 == -1) {
					local11 = this.anInt419;
				} else {
					local11 = this.anIntArray91[local3];
				}
				@Pc(23) Class1_Sub1_Sub1_Sub1_Sub2 local23 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local11];
				if (local23 != null) {
					this.method187(1, local23);
				}
			}
			anInt371++;
			if (anInt371 > 1406) {
				anInt371 = 0;
				this.aClass1_Sub1_Sub3_4.method487(112);
				this.aClass1_Sub1_Sub3_4.method488(0);
				local11 = this.aClass1_Sub1_Sub3_4.anInt768;
				this.aClass1_Sub1_Sub3_4.method488(162);
				this.aClass1_Sub1_Sub3_4.method488(22);
				if ((int) (Math.random() * 2.0D) == 0) {
					this.aClass1_Sub1_Sub3_4.method488(84);
				}
				this.aClass1_Sub1_Sub3_4.method489(31824);
				this.aClass1_Sub1_Sub3_4.method489(13490);
				if ((int) (Math.random() * 2.0D) == 0) {
					this.aClass1_Sub1_Sub3_4.method488(123);
				}
				if ((int) (Math.random() * 2.0D) == 0) {
					this.aClass1_Sub1_Sub3_4.method488(134);
				}
				this.aClass1_Sub1_Sub3_4.method488(100);
				this.aClass1_Sub1_Sub3_4.method488(94);
				this.aClass1_Sub1_Sub3_4.method489(35521);
				this.aClass1_Sub1_Sub3_4.method497(this.aClass1_Sub1_Sub3_4.anInt768 - local11);
			}
		} catch (@Pc(133) RuntimeException local133) {
			signlink.reporterror("12518, " + 60 + ", " + local133.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "p", descriptor = "(I)V")
	private void method139() {
		try {
			this.anInt303++;
			this.method118((byte) 9, true);
			this.method163(true);
			this.method118((byte) 9, false);
			this.method163(false);
			this.method125();
			this.method209(this.aByte5);
			@Pc(36) int local36;
			@Pc(75) int local75;
			@Pc(122) int local122;
			if (!this.aBoolean55) {
				local36 = this.anInt402;
				if (this.anInt409 / 256 > local36) {
					local36 = this.anInt409 / 256;
				}
				if (this.aBooleanArray4[4] && this.anIntArray37[4] + 128 > local36) {
					local36 = this.anIntArray37[4] + 128;
				}
				local75 = this.anInt403 + this.anInt334 & 0x7FF;
				this.method200(this.method151(aClass1_Sub1_Sub1_Sub1_Sub2_1.anInt131, this.anInt257, aClass1_Sub1_Sub1_Sub1_Sub2_1.anInt130, (byte) 6) - 50, local36 * 3 + 600, local75, this.anInt373, this.anInt372, local36);
				anInt309++;
				if (anInt309 > 1802) {
					anInt309 = 0;
					this.aClass1_Sub1_Sub3_4.method487(223);
					this.aClass1_Sub1_Sub3_4.method488(0);
					local122 = this.aClass1_Sub1_Sub3_4.anInt768;
					this.aClass1_Sub1_Sub3_4.method489(29711);
					this.aClass1_Sub1_Sub3_4.method488(70);
					this.aClass1_Sub1_Sub3_4.method488((int) (Math.random() * 256.0D));
					this.aClass1_Sub1_Sub3_4.method488(242);
					this.aClass1_Sub1_Sub3_4.method488(186);
					this.aClass1_Sub1_Sub3_4.method488(39);
					this.aClass1_Sub1_Sub3_4.method488(61);
					if ((int) (Math.random() * 2.0D) == 0) {
						this.aClass1_Sub1_Sub3_4.method488(13);
					}
					if ((int) (Math.random() * 2.0D) == 0) {
						this.aClass1_Sub1_Sub3_4.method489(57856);
					}
					this.aClass1_Sub1_Sub3_4.method489((int) (Math.random() * 65536.0D));
					this.aClass1_Sub1_Sub3_4.method497(this.aClass1_Sub1_Sub3_4.anInt768 - local122);
				}
			}
			if (this.aBoolean55) {
				local36 = this.method130();
			} else {
				local36 = this.method129();
			}
			local75 = this.anInt289;
			local122 = this.anInt290;
			@Pc(209) int local209 = this.anInt291;
			@Pc(212) int local212 = this.anInt292;
			@Pc(215) int local215 = this.anInt293;
			@Pc(264) int local264;
			for (@Pc(217) int local217 = 0; local217 < 5; local217++) {
				if (this.aBooleanArray4[local217]) {
					local264 = (int) (Math.random() * (double) (this.anIntArray64[local217] * 2 + 1) - (double) this.anIntArray64[local217] + Math.sin((double) this.anIntArray44[local217] * ((double) this.anIntArray90[local217] / 100.0D)) * (double) this.anIntArray37[local217]);
					if (local217 == 0) {
						this.anInt289 += local264;
					}
					if (local217 == 1) {
						this.anInt290 += local264;
					}
					if (local217 == 2) {
						this.anInt291 += local264;
					}
					if (local217 == 3) {
						this.anInt293 = this.anInt293 + local264 & 0x7FF;
					}
					if (local217 == 4) {
						this.anInt292 += local264;
						if (this.anInt292 < 128) {
							this.anInt292 = 128;
						}
						if (this.anInt292 > 383) {
							this.anInt292 = 383;
						}
					}
				}
			}
			local264 = Class1_Sub1_Sub2_Sub1.anInt658;
			Class1_Sub1_Sub1_Sub5.aBoolean131 = true;
			Class1_Sub1_Sub1_Sub5.anInt556 = 0;
			Class1_Sub1_Sub1_Sub5.anInt554 = super.anInt233 - 4;
			Class1_Sub1_Sub1_Sub5.anInt555 = super.anInt234 - 4;
			Class1_Sub1_Sub2.method456();
			this.aClass39_1.method583(this.anInt291, this.anInt292, this.anInt293, this.anInt290, this.anInt289, local36);
			this.aClass39_1.method558();
			this.method185();
			this.method120();
			this.method176((byte) 4, local264);
			this.method225(48);
			this.aClass37_26.method539(4, super.aGraphics2, 4);
			this.anInt289 = local75;
			this.anInt290 = local122;
			this.anInt291 = local209;
			this.anInt292 = local212;
			this.anInt293 = local215;
		} catch (@Pc(408) RuntimeException local408) {
			signlink.reporterror("16453, " + 424 + ", " + local408.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "k", descriptor = "(B)V")
	private void method140(@OriginalArg(0) byte arg0) {
		try {
			this.aBoolean54 = true;
			if (arg0 != 125) {
				this.aBoolean67 = !this.aBoolean67;
			}
			for (@Pc(17) int local17 = 0; local17 < 7; local17++) {
				this.anIntArray36[local17] = -1;
				for (@Pc(26) int local26 = 0; local26 < Class23.anInt747; local26++) {
					if (!Class23.aClass23Array1[local26].aBoolean180 && Class23.aClass23Array1[local26].anInt748 == local17 + (this.aBoolean53 ? 0 : 7)) {
						this.anIntArray36[local17] = local26;
						break;
					}
				}
			}
		} catch (@Pc(63) RuntimeException local63) {
			signlink.reporterror("7779, " + arg0 + ", " + local63.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/String;)Ljava/io/DataInputStream;")
	private DataInputStream method141(@OriginalArg(0) String arg0) throws IOException {
		return signlink.mainapp == null ? new DataInputStream((new URL(this.getCodeBase(), arg0)).openStream()) : signlink.openurl(arg0);
	}

	@OriginalMember(owner = "client!client", name = "run", descriptor = "()V")
	@Override
	public void run() {
		if (this.aBoolean64) {
			this.method205();
		} else {
			super.run();
		}
	}

	@OriginalMember(owner = "client!client", name = "g", descriptor = "(Z)V")
	private void method142() {
		try {
			@Pc(2) int local2 = this.anInt367;
			@Pc(5) int local5 = this.anInt368;
			@Pc(8) int local8 = this.anInt369;
			@Pc(11) int local11 = this.anInt370;
			Class1_Sub1_Sub2.method458(local8, local2, local5, local11, 6116423);
			Class1_Sub1_Sub2.method458(local8 - 2, local2 + 1, local5 + 1, 16, 0);
			Class1_Sub1_Sub2.method459(anInt336, local11 - 19, local5 + 18, local8 - 2, 0, local2 + 1);
			this.aClass1_Sub1_Sub2_Sub4_3.method468(local5 + 14, local2 + 3, "Choose Option", 6116423);
			@Pc(68) int local68 = super.anInt233;
			@Pc(71) int local71 = super.anInt234;
			if (this.anInt366 == 0) {
				local68 -= 4;
				local71 -= 4;
			}
			if (this.anInt366 == 1) {
				local68 -= 553;
				local71 -= 205;
			}
			if (this.anInt366 == 2) {
				local68 -= 17;
				local71 -= 357;
			}
			for (@Pc(90) int local90 = 0; local90 < this.anInt365; local90++) {
				@Pc(105) int local105 = local5 + (this.anInt365 - 1 - local90) * 15 + 31;
				@Pc(107) int local107 = 16777215;
				if (local68 > local2 && local68 < local2 + local8 && local71 > local105 - 13 && local71 < local105 + 3) {
					local107 = 16776960;
				}
				this.aClass1_Sub1_Sub2_Sub4_3.method470(this.aStringArray1[local90], local105, local2 + 3, true, local107);
			}
		} catch (@Pc(148) RuntimeException local148) {
			signlink.reporterror("92391, " + false + ", " + local148.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "q", descriptor = "(I)V")
	private void method143() {
		try {
			this.method160();
			this.aClass37_14.method538();
			this.aClass1_Sub1_Sub2_Sub3_9.method445(0, 0);
			@Pc(53) byte local53;
			@Pc(65) int local65;
			if (this.anInt333 == 0) {
				this.aClass1_Sub1_Sub2_Sub4_1.method466(180, (byte) 6, 180, true, this.aClass45_Sub1_1.aString31, 7711145);
				local53 = 80;
				this.aClass1_Sub1_Sub2_Sub4_3.method466(80, (byte) 6, 180, true, "Welcome to RuneScape", 16776960);
				local65 = local53 + 30;
				this.aClass1_Sub1_Sub2_Sub3_10.method445(100, 27);
				this.aClass1_Sub1_Sub2_Sub4_3.method466(125, (byte) 6, 100, true, "New user", 16777215);
				this.aClass1_Sub1_Sub2_Sub3_10.method445(100, 187);
				this.aClass1_Sub1_Sub2_Sub4_3.method466(125, (byte) 6, 260, true, "Existing User", 16777215);
			}
			if (this.anInt333 == 2) {
				local53 = 60;
				if (this.aString9.length() > 0) {
					this.aClass1_Sub1_Sub2_Sub4_3.method466(45, (byte) 6, 180, true, this.aString9, 16776960);
					this.aClass1_Sub1_Sub2_Sub4_3.method466(60, (byte) 6, 180, true, this.aString10, 16776960);
					local65 = local53 + 30;
				} else {
					this.aClass1_Sub1_Sub2_Sub4_3.method466(53, (byte) 6, 180, true, this.aString10, 16776960);
					local65 = local53 + 30;
				}
				this.aClass1_Sub1_Sub2_Sub4_3.method470("Username: " + this.aString17 + (this.anInt375 == 0 & anInt446 % 40 < 20 ? "@yel@|" : ""), 90, 90, true, 16777215);
				local65 += 15;
				this.aClass1_Sub1_Sub2_Sub4_3.method470("Password: " + Class49.method685(this.aString18) + (this.anInt375 == 1 & anInt446 % 40 < 20 ? "@yel@|" : ""), 105, 92, true, 16777215);
				local65 += 15;
				this.aClass1_Sub1_Sub2_Sub3_10.method445(130, 27);
				this.aClass1_Sub1_Sub2_Sub4_3.method466(155, (byte) 6, 100, true, "Login", 16777215);
				this.aClass1_Sub1_Sub2_Sub3_10.method445(130, 187);
				this.aClass1_Sub1_Sub2_Sub4_3.method466(155, (byte) 6, 260, true, "Cancel", 16777215);
			}
			if (this.anInt333 == 3) {
				this.aClass1_Sub1_Sub2_Sub4_3.method466(40, (byte) 6, 180, true, "Create a free account", 16776960);
				local53 = 65;
				this.aClass1_Sub1_Sub2_Sub4_3.method466(65, (byte) 6, 180, true, "To create a new account you need to", 16777215);
				local65 = local53 + 15;
				this.aClass1_Sub1_Sub2_Sub4_3.method466(80, (byte) 6, 180, true, "go back to the main RuneScape webpage", 16777215);
				local65 += 15;
				this.aClass1_Sub1_Sub2_Sub4_3.method466(95, (byte) 6, 180, true, "and choose the red 'create account'", 16777215);
				local65 += 15;
				this.aClass1_Sub1_Sub2_Sub4_3.method466(110, (byte) 6, 180, true, "button at the top right of that page.", 16777215);
				local65 += 15;
				this.aClass1_Sub1_Sub2_Sub3_10.method445(130, 107);
				this.aClass1_Sub1_Sub2_Sub4_3.method466(155, (byte) 6, 180, true, "Cancel", 16777215);
			}
			this.aClass37_14.method539(171, super.aGraphics2, 202);
			if (this.aBoolean86) {
				this.aBoolean86 = false;
				this.aClass37_12.method539(0, super.aGraphics2, 128);
				this.aClass37_13.method539(371, super.aGraphics2, 202);
				this.aClass37_17.method539(265, super.aGraphics2, 0);
				this.aClass37_18.method539(265, super.aGraphics2, 562);
				this.aClass37_19.method539(171, super.aGraphics2, 128);
				this.aClass37_20.method539(171, super.aGraphics2, 562);
			}
		} catch (@Pc(496) RuntimeException local496) {
			signlink.reporterror("20179, " + 6 + ", " + local496.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "r", descriptor = "(I)V")
	private void method144() {
		try {
			if (super.anInt238 == 1) {
				if (super.anInt239 >= 539 && super.anInt239 <= 573 && super.anInt240 >= 169 && super.anInt240 < 205 && this.anIntArray65[0] != -1) {
					this.aBoolean82 = true;
					this.anInt263 = 0;
					this.aBoolean60 = true;
				}
				if (super.anInt239 >= 569 && super.anInt239 <= 599 && super.anInt240 >= 168 && super.anInt240 < 205 && this.anIntArray65[1] != -1) {
					this.aBoolean82 = true;
					this.anInt263 = 1;
					this.aBoolean60 = true;
				}
				if (super.anInt239 >= 597 && super.anInt239 <= 627 && super.anInt240 >= 168 && super.anInt240 < 205 && this.anIntArray65[2] != -1) {
					this.aBoolean82 = true;
					this.anInt263 = 2;
					this.aBoolean60 = true;
				}
				if (super.anInt239 >= 625 && super.anInt239 <= 669 && super.anInt240 >= 168 && super.anInt240 < 203 && this.anIntArray65[3] != -1) {
					this.aBoolean82 = true;
					this.anInt263 = 3;
					this.aBoolean60 = true;
				}
				if (super.anInt239 >= 666 && super.anInt239 <= 696 && super.anInt240 >= 168 && super.anInt240 < 205 && this.anIntArray65[4] != -1) {
					this.aBoolean82 = true;
					this.anInt263 = 4;
					this.aBoolean60 = true;
				}
				if (super.anInt239 >= 694 && super.anInt239 <= 724 && super.anInt240 >= 168 && super.anInt240 < 205 && this.anIntArray65[5] != -1) {
					this.aBoolean82 = true;
					this.anInt263 = 5;
					this.aBoolean60 = true;
				}
				if (super.anInt239 >= 722 && super.anInt239 <= 756 && super.anInt240 >= 169 && super.anInt240 < 205 && this.anIntArray65[6] != -1) {
					this.aBoolean82 = true;
					this.anInt263 = 6;
					this.aBoolean60 = true;
				}
				if (super.anInt239 >= 540 && super.anInt239 <= 574 && super.anInt240 >= 466 && super.anInt240 < 502 && this.anIntArray65[7] != -1) {
					this.aBoolean82 = true;
					this.anInt263 = 7;
					this.aBoolean60 = true;
				}
				if (super.anInt239 >= 572 && super.anInt239 <= 602 && super.anInt240 >= 466 && super.anInt240 < 503 && this.anIntArray65[8] != -1) {
					this.aBoolean82 = true;
					this.anInt263 = 8;
					this.aBoolean60 = true;
				}
				if (super.anInt239 >= 599 && super.anInt239 <= 629 && super.anInt240 >= 466 && super.anInt240 < 503 && this.anIntArray65[9] != -1) {
					this.aBoolean82 = true;
					this.anInt263 = 9;
					this.aBoolean60 = true;
				}
				if (super.anInt239 >= 627 && super.anInt239 <= 671 && super.anInt240 >= 467 && super.anInt240 < 502 && this.anIntArray65[10] != -1) {
					this.aBoolean82 = true;
					this.anInt263 = 10;
					this.aBoolean60 = true;
				}
				if (super.anInt239 >= 669 && super.anInt239 <= 699 && super.anInt240 >= 466 && super.anInt240 < 503 && this.anIntArray65[11] != -1) {
					this.aBoolean82 = true;
					this.anInt263 = 11;
					this.aBoolean60 = true;
				}
				if (super.anInt239 >= 696 && super.anInt239 <= 726 && super.anInt240 >= 466 && super.anInt240 < 503 && this.anIntArray65[12] != -1) {
					this.aBoolean82 = true;
					this.anInt263 = 12;
					this.aBoolean60 = true;
				}
				if (super.anInt239 >= 724 && super.anInt239 <= 758 && super.anInt240 >= 466 && super.anInt240 < 502 && this.anIntArray65[13] != -1) {
					this.aBoolean82 = true;
					this.anInt263 = 13;
					this.aBoolean60 = true;
				}
				anInt346++;
				if (anInt346 > 150) {
					anInt346 = 0;
					this.aClass1_Sub1_Sub3_4.method487(136);
					this.aClass1_Sub1_Sub3_4.method488(43);
					return;
				}
			}
		} catch (@Pc(464) RuntimeException local464) {
			signlink.reporterror("10558, " + -974 + ", " + local464.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(BLclient!d;I)I")
	private int method145(@OriginalArg(0) byte arg0, @OriginalArg(1) Class6 arg1, @OriginalArg(2) int arg2) {
		try {
			if (arg0 != 69) {
				return 1;
			} else if (arg1.anIntArrayArray6 == null || arg2 >= arg1.anIntArrayArray6.length) {
				return -2;
			} else {
				try {
					@Pc(21) int[] local21 = arg1.anIntArrayArray6[arg2];
					@Pc(23) int local23 = 0;
					@Pc(25) int local25 = 0;
					while (true) {
						@Pc(30) int local30 = local21[local25++];
						if (local30 == 0) {
							return local23;
						}
						if (local30 == 1) {
							local23 += this.anIntArray76[local21[local25++]];
						}
						if (local30 == 2) {
							local23 += this.anIntArray86[local21[local25++]];
						}
						if (local30 == 3) {
							local23 += this.anIntArray68[local21[local25++]];
						}
						@Pc(83) Class6 local83;
						@Pc(88) int local88;
						@Pc(101) int local101;
						if (local30 == 4) {
							local83 = Class6.aClass6Array1[local21[local25++]];
							local88 = local21[local25++];
							if (local88 >= 0 && local88 < Class15.anInt603 && (!Class15.method345(local88).aBoolean148 || aBoolean47)) {
								for (local101 = 0; local101 < local83.anIntArray96.length; local101++) {
									if (local83.anIntArray96[local101] == local88 + 1) {
										local23 += local83.anIntArray97[local101];
									}
								}
							}
						}
						if (local30 == 5) {
							local23 += this.anIntArray71[local21[local25++]];
						}
						if (local30 == 6) {
							local23 += anIntArray84[this.anIntArray86[local21[local25++]] - 1];
						}
						if (local30 == 7) {
							local23 += this.anIntArray71[local21[local25++]] * 100 / 46875;
						}
						if (local30 == 8) {
							local23 += aClass1_Sub1_Sub1_Sub1_Sub2_1.anInt180;
						}
						@Pc(184) int local184;
						if (local30 == 9) {
							for (local184 = 0; local184 < Class29.anInt825; local184++) {
								if (Class29.aBooleanArray9[local184]) {
									local23 += this.anIntArray86[local184];
								}
							}
						}
						if (local30 == 10) {
							local83 = Class6.aClass6Array1[local21[local25++]];
							local88 = local21[local25++] + 1;
							if (local88 >= 0 && local88 < Class15.anInt603 && (!Class15.method345(local88).aBoolean148 || aBoolean47)) {
								for (local101 = 0; local101 < local83.anIntArray96.length; local101++) {
									if (local83.anIntArray96[local101] == local88) {
										local23 += 999999999;
										break;
									}
								}
							}
						}
						if (local30 == 11) {
							local23 += this.anInt436;
						}
						if (local30 == 12) {
							local23 += this.anInt245;
						}
						if (local30 == 13) {
							local184 = this.anIntArray71[local21[local25++]];
							local88 = local21[local25++];
							local23 += (local184 & 0x1 << local88) == 0 ? 0 : 1;
						}
						if (local30 == 14) {
							local184 = local21[local25++];
							@Pc(307) Class35 local307 = Class35.aClass35Array1[local184];
							local101 = local307.anInt859;
							@Pc(313) int local313 = local307.anInt860;
							@Pc(316) int local316 = local307.anInt861;
							@Pc(322) int local322 = anIntArray46[local316 - local313];
							local23 += this.anIntArray71[local101] >> local313 & local322;
						}
					}
				} catch (@Pc(335) Exception local335) {
					return -1;
				}
			}
		} catch (@Pc(338) RuntimeException local338) {
			signlink.reporterror("32709, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local338.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "l", descriptor = "(B)V")
	private void method146(@OriginalArg(0) byte arg0) {
		try {
			@Pc(12) int local12;
			for (@Pc(5) int local5 = 10; local5 < 117; local5++) {
				local12 = (int) (Math.random() * 100.0D);
				if (local12 < 50) {
					this.anIntArray94[local5 + 32512] = 255;
				}
			}
			@Pc(41) int local41;
			@Pc(48) int local48;
			@Pc(54) int local54;
			for (local12 = 0; local12 < 100; local12++) {
				local41 = (int) (Math.random() * 124.0D) + 2;
				local48 = (int) (Math.random() * 128.0D) + 128;
				local54 = local41 + (local48 << 7);
				this.anIntArray94[local54] = 192;
			}
			for (local41 = 1; local41 < 255; local41++) {
				for (local48 = 1; local48 < 127; local48++) {
					local54 = local48 + (local41 << 7);
					this.anIntArray95[local54] = (this.anIntArray94[local54 - 1] + this.anIntArray94[local54 + 1] + this.anIntArray94[local54 - 128] + this.anIntArray94[local54 + 128]) / 4;
				}
			}
			this.anInt299 += 128;
			if (this.anInt299 > this.anIntArray77.length) {
				this.anInt299 -= this.anIntArray77.length;
				local48 = (int) (Math.random() * 12.0D);
				this.method208(this.aClass1_Sub1_Sub2_Sub3Array4[local48]);
			}
			@Pc(166) int local166;
			for (local48 = 1; local48 < 255; local48++) {
				for (local54 = 1; local54 < 127; local54++) {
					local166 = local54 + (local48 << 7);
					@Pc(189) int local189 = this.anIntArray95[local166 + 128] - this.anIntArray77[local166 + this.anInt299 & this.anIntArray77.length - 1] / 5;
					if (local189 < 0) {
						local189 = 0;
					}
					this.anIntArray94[local166] = local189;
				}
			}
			if (this.aByte16 == 7) {
				@Pc(214) boolean local214 = false;
			} else {
				this.method90();
			}
			for (local54 = 0; local54 < 255; local54++) {
				this.anIntArray45[local54] = this.anIntArray45[local54 + 1];
			}
			this.anIntArray45[255] = (int) (Math.sin((double) anInt446 / 14.0D) * 16.0D + Math.sin((double) anInt446 / 15.0D) * 14.0D + Math.sin((double) anInt446 / 16.0D) * 12.0D);
			if (this.anInt410 > 0) {
				this.anInt410 -= 4;
			}
			if (this.anInt411 > 0) {
				this.anInt411 -= 4;
			}
			if (this.anInt410 == 0 && this.anInt411 == 0) {
				local166 = (int) (Math.random() * 2000.0D);
				if (local166 == 0) {
					this.anInt410 = 1024;
				}
				if (local166 == 1) {
					this.anInt411 = 1024;
					return;
				}
			}
		} catch (@Pc(310) RuntimeException local310) {
			signlink.reporterror("93407, " + arg0 + ", " + local310.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "h", descriptor = "(Z)V")
	private void method147() {
		try {
			if (this.anInt390 != 0) {
				@Pc(5) int local5 = 0;
				if (this.anInt272 != 0) {
					local5 = 1;
				}
				for (@Pc(12) int local12 = 0; local12 < 100; local12++) {
					if (this.aStringArray3[local12] != null) {
						@Pc(24) int local24 = this.anIntArray39[local12];
						@Pc(29) String local29 = this.aStringArray2[local12];
						if (local29 != null && local29.startsWith("@cr1@")) {
							local29 = local29.substring(5);
						}
						if (local29 != null && local29.startsWith("@cr2@")) {
							local29 = local29.substring(5);
						}
						if ((local24 == 3 || local24 == 7) && (local24 == 7 || this.anInt447 == 0 || this.anInt447 == 1 && this.method226(local29, this.aByte6))) {
							@Pc(83) int local83 = 329 - local5 * 13;
							if (super.anInt233 > 4 && super.anInt234 - 4 > local83 - 10 && super.anInt234 - 4 <= local83 + 3) {
								@Pc(122) int local122 = this.aClass1_Sub1_Sub2_Sub4_2.method467("From:  " + local29 + this.aStringArray3[local12]) + 25;
								if (local122 > 450) {
									local122 = 450;
								}
								if (super.anInt233 < local122 + 4) {
									if (this.anInt329 >= 1) {
										this.aStringArray1[this.anInt365] = "Report abuse @whi@" + local29;
										this.anIntArray49[this.anInt365] = 2034;
										this.anInt365++;
									}
									this.aStringArray1[this.anInt365] = "Add ignore @whi@" + local29;
									this.anIntArray49[this.anInt365] = 2436;
									this.anInt365++;
									this.aStringArray1[this.anInt365] = "Add friend @whi@" + local29;
									this.anIntArray49[this.anInt365] = 2406;
									this.anInt365++;
								}
							}
							local5++;
							if (local5 >= 5) {
								return;
							}
						}
						if ((local24 == 5 || local24 == 6) && this.anInt447 < 2) {
							local5++;
							if (local5 >= 5) {
								return;
							}
						}
					}
				}
			}
		} catch (@Pc(237) RuntimeException local237) {
			signlink.reporterror("86924, " + true + ", " + local237.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/String;IIILjava/lang/String;I)Lclient!yb;")
	private Class48 method148(@OriginalArg(0) String arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) String arg3, @OriginalArg(5) int arg4) {
		try {
			@Pc(3) byte[] local3 = null;
			@Pc(5) int local5 = 5;
			try {
				if (this.aClass46Array1[0] != null) {
					local3 = this.aClass46Array1[0].method670(arg1);
				}
			} catch (@Pc(20) Exception local20) {
			}
			@Pc(34) int local34;
			if (local3 != null) {
				this.aCRC32_1.reset();
				this.aCRC32_1.update(local3);
				local34 = (int) this.aCRC32_1.getValue();
				if (local34 != arg2) {
					local3 = null;
				}
			}
			if (local3 != null) {
				return new Class48(this.aByte2, local3);
			}
			local34 = 0;
			while (local3 == null) {
				@Pc(60) String local60 = "Unknown error";
				this.method97(638, "Requesting " + arg3, arg4);
				@Pc(75) int local75;
				try {
					local75 = 0;
					@Pc(86) DataInputStream local86 = this.method141(arg0 + arg2);
					@Pc(89) byte[] local89 = new byte[6];
					local86.readFully(local89, 0, 6);
					@Pc(100) Class1_Sub1_Sub3 local100 = new Class1_Sub1_Sub3(local89, 337);
					local100.anInt768 = 3;
					@Pc(108) int local108 = local100.method502() + 6;
					@Pc(110) int local110 = 6;
					local3 = new byte[local108];
					for (@Pc(115) int local115 = 0; local115 < 6; local115++) {
						local3[local115] = local89[local115];
					}
					@Pc(133) int local133;
					while (local110 < local108) {
						local133 = local108 - local110;
						if (local133 > 1000) {
							local133 = 1000;
						}
						@Pc(144) int local144 = local86.read(local3, local110, local133);
						if (local144 < 0) {
							(new StringBuffer("Length error: ")).append(local110).append("/").append(local108).toString();
							throw new IOException("EOF");
						}
						local110 += local144;
						@Pc(173) int local173 = local110 * 100 / local108;
						if (local173 != local75) {
							this.method97(638, "Loading " + arg3 + " - " + local173 + "%", arg4);
						}
						local75 = local173;
					}
					local86.close();
					try {
						if (this.aClass46Array1[0] != null) {
							this.aClass46Array1[0].method671(local3, arg1, local3.length);
						}
					} catch (@Pc(218) Exception local218) {
						this.aClass46Array1[0] = null;
					}
					if (local3 != null) {
						this.aCRC32_1.reset();
						this.aCRC32_1.update(local3);
						local133 = (int) this.aCRC32_1.getValue();
						if (local133 != arg2) {
							local3 = null;
							local34++;
							local60 = "Checksum error: " + local133;
						}
					}
				} catch (@Pc(253) IOException local253) {
					if (local60.equals("Unknown error")) {
						local60 = "Connection error";
					}
					local3 = null;
				} catch (@Pc(263) NullPointerException local263) {
					local60 = "Null error";
					local3 = null;
					if (!signlink.reporterror) {
						return null;
					}
				} catch (@Pc(272) ArrayIndexOutOfBoundsException local272) {
					local60 = "Bounds error";
					local3 = null;
					if (!signlink.reporterror) {
						return null;
					}
				} catch (@Pc(281) Exception local281) {
					local60 = "Unexpected error";
					local3 = null;
					if (!signlink.reporterror) {
						return null;
					}
				}
				if (local3 == null) {
					for (local75 = local5; local75 > 0; local75--) {
						if (local34 >= 3) {
							this.method97(638, "Game updated - please reload page", arg4);
							local75 = 10;
						} else {
							this.method97(638, local60 + " - Retrying in " + local75, arg4);
						}
						try {
							Thread.sleep(1000L);
						} catch (@Pc(325) Exception local325) {
						}
					}
					local5 *= 2;
					if (local5 > 60) {
						local5 = 60;
					}
				}
			}
			return new Class48(this.aByte2, local3);
		} catch (@Pc(350) RuntimeException local350) {
			signlink.reporterror("87324, " + arg0 + ", " + 143 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local350.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "i", descriptor = "(Z)V")
	private void method149(@OriginalArg(0) boolean arg0) {
		try {
			if (this.anInt272 > 1) {
				this.anInt272--;
			}
			if (this.anInt426 > 0) {
				this.anInt426--;
			}
			if (this.anInt338 > 0) {
				this.anInt338 -= 2;
			}
			for (@Pc(31) int local31 = 0; local31 < 5 && this.method134(); local31++) {
			}
			if (!arg0) {
				anInt311 = 380;
			}
			if (this.aBoolean46) {
				this.method109();
				this.method132();
				this.method106();
				@Pc(62) Class1_Sub1_Sub3 local62 = Class10.method268();
				if (local62 != null) {
					this.aClass1_Sub1_Sub3_4.method487(19);
					this.aClass1_Sub1_Sub3_4.method489(local62.anInt768);
					this.aClass1_Sub1_Sub3_4.method496(local62.anInt768, local62.aByteArray9);
					local62.method486();
				}
				this.anInt424++;
				if (this.anInt424 > 750) {
					this.method165();
				}
				this.method138();
				this.method186();
				this.method101(264);
				this.anInt301++;
				if (this.anInt445 != 0) {
					this.anInt444 += 20;
					if (this.anInt444 >= 400) {
						this.anInt445 = 0;
					}
				}
				if (this.anInt271 != 0) {
					this.anInt268++;
					if (this.anInt268 >= 15) {
						if (this.anInt271 == 2) {
							this.aBoolean82 = true;
						}
						if (this.anInt271 == 3) {
							this.aBoolean52 = true;
						}
						this.anInt271 = 0;
					}
				}
				if (this.anInt326 != 0) {
					this.anInt352++;
					if (super.anInt233 > this.anInt327 + 5 || super.anInt233 < this.anInt327 - 5 || super.anInt234 > this.anInt328 + 5 || super.anInt234 < this.anInt328 - 5) {
						this.aBoolean68 = true;
					}
					if (super.anInt232 == 0) {
						if (this.anInt326 == 2) {
							this.aBoolean82 = true;
						}
						if (this.anInt326 == 3) {
							this.aBoolean52 = true;
						}
						this.anInt326 = 0;
						if (this.aBoolean68 && this.anInt352 >= 5) {
							this.anInt281 = -1;
							this.method111(this.anInt287);
							if (this.anInt281 == this.anInt324 && this.anInt280 != this.anInt325) {
								@Pc(249) Class6 local249 = Class6.aClass6Array1[this.anInt324];
								@Pc(251) byte local251 = 0;
								if (this.anInt349 == 1 && local249.anInt454 == 206) {
									local251 = 1;
								}
								if (local249.anIntArray96[this.anInt280] <= 0) {
									local251 = 0;
								}
								@Pc(275) int local275;
								@Pc(278) int local278;
								if (local249.aBoolean94) {
									local275 = this.anInt325;
									local278 = this.anInt280;
									local249.anIntArray96[local278] = local249.anIntArray96[local275];
									local249.anIntArray97[local278] = local249.anIntArray97[local275];
									local249.anIntArray96[local275] = -1;
									local249.anIntArray97[local275] = 0;
								} else if (local251 == 1) {
									local275 = this.anInt325;
									local278 = this.anInt280;
									while (local275 != local278) {
										if (local275 > local278) {
											local249.method231(local275 - 1, local275);
											local275--;
										} else if (local275 < local278) {
											local249.method231(local275 + 1, local275);
											local275++;
										}
									}
								} else {
									local249.method231(this.anInt280, this.anInt325);
								}
								this.aClass1_Sub1_Sub3_4.method487(7);
								this.aClass1_Sub1_Sub3_4.method489(this.anInt324);
								this.aClass1_Sub1_Sub3_4.method489(this.anInt325);
								this.aClass1_Sub1_Sub3_4.method489(this.anInt280);
								this.aClass1_Sub1_Sub3_4.method488(local251);
							}
						} else if ((this.anInt427 == 1 || this.method121(this.anInt365 - 1)) && this.anInt365 > 2) {
							this.method201();
						} else if (this.anInt365 > 0) {
							this.method215(this.anInt365 - 1);
						}
						this.anInt268 = 10;
						super.anInt238 = 0;
					}
				}
				anInt294++;
				if (anInt294 > 127) {
					anInt294 = 0;
					this.aClass1_Sub1_Sub3_4.method487(181);
					this.aClass1_Sub1_Sub3_4.method491(4991788);
				}
				@Pc(439) int local439;
				@Pc(441) int local441;
				if (Class39.anInt907 != -1) {
					local439 = Class39.anInt907;
					local441 = Class39.anInt908;
					@Pc(462) boolean local462 = this.method166(true, 0, 0, local439, 0, 0, aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray16[0], 0, local441, 0, aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray17[0]);
					Class39.anInt907 = -1;
					if (local462) {
						this.anInt442 = super.anInt239;
						this.anInt443 = super.anInt240;
						this.anInt445 = 1;
						this.anInt444 = 0;
					}
				}
				if (super.anInt238 == 1 && this.aString15 != null) {
					this.aString15 = null;
					this.aBoolean52 = true;
					super.anInt238 = 0;
				}
				this.method167();
				this.method196();
				this.method144();
				this.method127();
				if (super.anInt232 == 1 || super.anInt238 == 1) {
					this.anInt255++;
				}
				if (this.anInt362 == 2) {
					this.method123(992);
				}
				if (this.anInt362 == 2 && this.aBoolean55) {
					this.method218(this.anInt340);
				}
				for (local439 = 0; local439 < 5; local439++) {
					@Pc(549) int local549 = this.anIntArray44[local439]++;
				}
				this.method175();
				super.anInt231++;
				if (super.anInt231 > 4500) {
					this.anInt426 = 250;
					super.anInt231 -= 500;
					this.aClass1_Sub1_Sub3_4.method487(102);
				}
				this.anInt407++;
				if (this.anInt407 > 500) {
					this.anInt407 = 0;
					local441 = (int) (Math.random() * 8.0D);
					if ((local441 & 0x1) == 1) {
						this.anInt439 += this.anInt440;
					}
					if ((local441 & 0x2) == 2) {
						this.anInt253 += this.anInt254;
					}
					if ((local441 & 0x4) == 4) {
						this.anInt334 += this.anInt335;
					}
				}
				if (this.anInt439 < -50) {
					this.anInt440 = 2;
				}
				if (this.anInt439 > 50) {
					this.anInt440 = -2;
				}
				if (this.anInt253 < -55) {
					this.anInt254 = 2;
				}
				if (this.anInt253 > 55) {
					this.anInt254 = -2;
				}
				if (this.anInt334 < -40) {
					this.anInt335 = 1;
				}
				if (this.anInt334 > 40) {
					this.anInt335 = -1;
				}
				this.anInt393++;
				if (this.anInt393 > 500) {
					this.anInt393 = 0;
					local441 = (int) (Math.random() * 8.0D);
					if ((local441 & 0x1) == 1) {
						this.anInt413 += this.anInt414;
					}
					if ((local441 & 0x2) == 2) {
						this.anInt359 += this.anInt360;
					}
				}
				if (this.anInt413 < -60) {
					this.anInt414 = 2;
				}
				if (this.anInt413 > 60) {
					this.anInt414 = -2;
				}
				if (this.anInt359 < -20) {
					this.anInt360 = 1;
				}
				if (this.anInt359 > 10) {
					this.anInt360 = -1;
				}
				anInt342++;
				if (anInt342 > 110) {
					anInt342 = 0;
					this.aClass1_Sub1_Sub3_4.method487(94);
					this.aClass1_Sub1_Sub3_4.method492(0);
				}
				this.anInt425++;
				if (this.anInt425 > 50) {
					this.aClass1_Sub1_Sub3_4.method487(206);
				}
				try {
					if (this.aClass8_1 != null && this.aClass1_Sub1_Sub3_4.anInt768 > 0) {
						this.aClass8_1.method248(this.aClass1_Sub1_Sub3_4.aByteArray9, this.aClass1_Sub1_Sub3_4.anInt768);
						this.aClass1_Sub1_Sub3_4.anInt768 = 0;
						this.anInt425 = 0;
					}
				} catch (@Pc(809) IOException local809) {
					this.method165();
				} catch (@Pc(814) Exception local814) {
					this.method220();
				}
			}
		} catch (@Pc(819) RuntimeException local819) {
			signlink.reporterror("99946, " + arg0 + ", " + local819.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "m", descriptor = "(B)Ljava/lang/String;")
	private String method150() {
		try {
			if (signlink.mainapp == null) {
				return super.aFrame_Sub1_2 == null ? super.getDocumentBase().getHost().toLowerCase() : "runescape.com";
			} else {
				return signlink.mainapp.getDocumentBase().getHost().toLowerCase();
			}
		} catch (@Pc(22) RuntimeException local22) {
			signlink.reporterror("37655, " + -76 + ", " + local22.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIB)I")
	private int method151(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte arg3) {
		try {
			@Pc(5) int local5 = arg2 >> 7;
			@Pc(9) int local9 = arg0 >> 7;
			if (local5 < 0 || local9 < 0 || local5 > 103 || local9 > 103) {
				return 0;
			}
			@Pc(23) int local23 = arg1;
			if (arg1 < 3 && (this.aByteArrayArrayArray7[1][local5][local9] & 0x2) == 2) {
				local23 = arg1 + 1;
			}
			@Pc(43) int local43 = arg2 & 0x7F;
			@Pc(47) int local47 = arg0 & 0x7F;
			@Pc(52) boolean local52 = false;
			@Pc(89) int local89 = this.anIntArrayArrayArray3[local23][local5][local9] * (128 - local43) + this.anIntArrayArrayArray3[local23][local5 + 1][local9] * local43 >> 7;
			@Pc(121) int local121 = this.anIntArrayArrayArray3[local23][local5][local9 + 1] * (128 - local43) + this.anIntArrayArrayArray3[local23][local5 + 1][local9 + 1] * local43 >> 7;
			return local89 * (128 - local47) + local121 * local47 >> 7;
		} catch (@Pc(134) RuntimeException local134) {
			signlink.reporterror("13217, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local134.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IJ)V")
	private void method152(@OriginalArg(1) long arg0) {
		try {
			if (arg0 != 0L) {
				for (@Pc(8) int local8 = 0; local8 < this.anInt258; local8++) {
					if (this.aLongArray3[local8] == arg0) {
						this.anInt258--;
						this.aBoolean82 = true;
						for (@Pc(28) int local28 = local8; local28 < this.anInt258; local28++) {
							this.aLongArray3[local28] = this.aLongArray3[local28 + 1];
						}
						this.aClass1_Sub1_Sub3_4.method487(4);
						this.aClass1_Sub1_Sub3_4.method494(arg0, this.anInt295);
						break;
					}
				}
				this.anInt422 += 0;
			}
		} catch (@Pc(71) RuntimeException local71) {
			signlink.reporterror("47631, " + 0 + ", " + arg0 + ", " + local71.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ZLclient!d;)V")
	private void method155(@OriginalArg(1) Class6 arg0) {
		try {
			@Pc(9) int local9 = arg0.anInt454;
			if (local9 >= 1 && local9 <= 100 || !(local9 < 701 || local9 > 800)) {
				if (local9 > 700) {
					local9 -= 601;
				} else {
					local9--;
				}
				if (local9 >= this.anInt317) {
					arg0.aString19 = "";
					arg0.anInt453 = 0;
				} else {
					arg0.aString19 = this.aStringArray4[local9];
					arg0.anInt453 = 1;
				}
			} else if (local9 >= 101 && local9 <= 200 || !(local9 < 801 || local9 > 900)) {
				if (local9 > 800) {
					local9 -= 701;
				} else {
					local9 -= 101;
				}
				if (local9 >= this.anInt317) {
					arg0.aString19 = "";
					arg0.anInt453 = 0;
				} else {
					if (this.anIntArray89[local9] == 0) {
						arg0.aString19 = "@red@Offline";
					} else if (this.anIntArray89[local9] == anInt261) {
						arg0.aString19 = "@gre@World-" + (this.anIntArray89[local9] - 9);
					} else {
						arg0.aString19 = "@yel@World-" + (this.anIntArray89[local9] - 9);
					}
					arg0.anInt453 = 1;
				}
			} else if (local9 == 203) {
				arg0.anInt460 = this.anInt317 * 15 + 20;
				if (arg0.anInt460 <= arg0.anInt456) {
					arg0.anInt460 = arg0.anInt456 + 1;
				}
			} else if (local9 >= 401 && local9 <= 500) {
				local9 -= 401;
				if (local9 >= this.anInt258) {
					arg0.aString19 = "";
					arg0.anInt453 = 0;
				} else {
					arg0.aString19 = Class49.method683(Class49.method680(this.aLongArray3[local9]));
					arg0.anInt453 = 1;
				}
			} else if (local9 == 503) {
				arg0.anInt460 = this.anInt258 * 15 + 20;
				if (arg0.anInt460 <= arg0.anInt456) {
					arg0.anInt460 = arg0.anInt456 + 1;
				}
			} else if (local9 == 327) {
				arg0.anInt476 = 150;
				arg0.anInt477 = (int) (Math.sin((double) anInt446 / 40.0D) * 256.0D) & 0x7FF;
				if (this.aBoolean54) {
					for (@Pc(230) int local230 = 0; local230 < 7; local230++) {
						@Pc(237) int local237 = this.anIntArray36[local230];
						if (local237 >= 0 && !Class23.aClass23Array1[local237].method479()) {
							return;
						}
					}
					this.aBoolean54 = false;
					@Pc(256) Class1_Sub1_Sub1_Sub5[] local256 = new Class1_Sub1_Sub1_Sub5[7];
					@Pc(258) int local258 = 0;
					for (@Pc(260) int local260 = 0; local260 < 7; local260++) {
						@Pc(267) int local267 = this.anIntArray36[local260];
						if (local267 >= 0) {
							local256[local258++] = Class23.aClass23Array1[local267].method480();
						}
					}
					@Pc(289) Class1_Sub1_Sub1_Sub5 local289 = new Class1_Sub1_Sub1_Sub5((byte) 1, local258, local256);
					for (@Pc(291) int local291 = 0; local291 < 5; local291++) {
						if (this.anIntArray88[local291] != 0) {
							local289.method302(anIntArrayArray3[local291][0], anIntArrayArray3[local291][this.anIntArray88[local291]]);
							if (local291 == 1) {
								local289.method302(anIntArray87[0], anIntArray87[this.anIntArray88[local291]]);
							}
						}
					}
					local289.method295();
					local289.method296(Class27.aClass27Array1[aClass1_Sub1_Sub1_Sub1_Sub2_1.anInt134].anIntArray227[0]);
					local289.method305(64, 850, -30, -50, -30, true);
					arg0.anInt469 = 5;
					arg0.anInt470 = 0;
					Class6.method234(local289);
				}
			} else if (local9 == 324) {
				if (this.aClass1_Sub1_Sub2_Sub2_5 == null) {
					this.aClass1_Sub1_Sub2_Sub2_5 = arg0.aClass1_Sub1_Sub2_Sub2_14;
					this.aClass1_Sub1_Sub2_Sub2_6 = arg0.aClass1_Sub1_Sub2_Sub2_15;
				}
				if (this.aBoolean53) {
					arg0.aClass1_Sub1_Sub2_Sub2_14 = this.aClass1_Sub1_Sub2_Sub2_6;
				} else {
					arg0.aClass1_Sub1_Sub2_Sub2_14 = this.aClass1_Sub1_Sub2_Sub2_5;
				}
			} else if (local9 == 325) {
				if (this.aClass1_Sub1_Sub2_Sub2_5 == null) {
					this.aClass1_Sub1_Sub2_Sub2_5 = arg0.aClass1_Sub1_Sub2_Sub2_14;
					this.aClass1_Sub1_Sub2_Sub2_6 = arg0.aClass1_Sub1_Sub2_Sub2_15;
				}
				if (this.aBoolean53) {
					arg0.aClass1_Sub1_Sub2_Sub2_14 = this.aClass1_Sub1_Sub2_Sub2_5;
				} else {
					arg0.aClass1_Sub1_Sub2_Sub2_14 = this.aClass1_Sub1_Sub2_Sub2_6;
				}
			} else if (local9 == 600) {
				arg0.aString19 = this.aString8;
				if (anInt446 % 20 < 10) {
					arg0.aString19 = arg0.aString19 + "|";
				} else {
					arg0.aString19 = arg0.aString19 + " ";
				}
			} else {
				if (local9 == 613) {
					if (this.anInt329 < 1) {
						arg0.aString19 = "";
					} else if (this.aBoolean72) {
						arg0.anInt465 = 16711680;
						arg0.aString19 = "Moderator option: Mute player for 48 hours: <ON>";
					} else {
						arg0.anInt465 = 16777215;
						arg0.aString19 = "Moderator option: Mute player for 48 hours: <OFF>";
					}
				}
				@Pc(497) String local497;
				if (local9 == 650 || local9 == 655) {
					if (this.anInt401 == 0) {
						arg0.aString19 = "";
					} else {
						if (this.anInt437 == 0) {
							local497 = "earlier today";
						} else if (this.anInt437 == 1) {
							local497 = "yesterday";
						} else {
							local497 = this.anInt437 + " days ago";
						}
						arg0.aString19 = "You last logged in " + local497 + " from: " + signlink.dns;
					}
				}
				if (local9 == 651) {
					if (this.anInt302 == 0) {
						arg0.aString19 = "0 unread messages";
						arg0.anInt465 = 16776960;
					}
					if (this.anInt302 == 1) {
						arg0.aString19 = "1 unread message";
						arg0.anInt465 = 65280;
					}
					if (this.anInt302 > 1) {
						arg0.aString19 = this.anInt302 + " unread messages";
						arg0.anInt465 = 65280;
					}
				}
				if (local9 == 652) {
					if (this.anInt244 == 201) {
						if (this.anInt251 == 1) {
							arg0.aString19 = "@yel@This is a non-members world: @whi@Since you are a member we";
						} else {
							arg0.aString19 = "";
						}
					} else if (this.anInt244 == 200) {
						arg0.aString19 = "You have not yet set any password recovery questions.";
					} else {
						if (this.anInt244 == 0) {
							local497 = "Earlier today";
						} else if (this.anInt244 == 1) {
							local497 = "Yesterday";
						} else {
							local497 = this.anInt244 + " days ago";
						}
						arg0.aString19 = local497 + " you changed your recovery questions";
					}
				}
				if (local9 == 653) {
					if (this.anInt244 == 201) {
						if (this.anInt251 == 1) {
							arg0.aString19 = "@whi@recommend you use a members world instead. You may use";
						} else {
							arg0.aString19 = "";
						}
					} else if (this.anInt244 == 200) {
						arg0.aString19 = "We strongly recommend you do so now to secure your account.";
					} else {
						arg0.aString19 = "If you do not remember making this change then cancel it immediately";
					}
				}
				if (local9 == 654) {
					if (this.anInt244 == 201) {
						if (this.anInt251 == 1) {
							arg0.aString19 = "@whi@this world but member benefits are unavailabe whilst here.";
						} else {
							arg0.aString19 = "";
						}
					} else if (this.anInt244 == 200) {
						arg0.aString19 = "Do this from the 'account management' area on our front webpage";
					} else {
						arg0.aString19 = "Do this from the 'account management' area on our front webpage";
					}
				}
			}
		} catch (@Pc(705) RuntimeException local705) {
			signlink.reporterror("36110, " + false + ", " + arg0 + ", " + local705.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(BIIILclient!bb;)V")
	private void method156(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class1_Sub1_Sub1_Sub1_Sub2 arg3) {
		try {
			if (arg3 != aClass1_Sub1_Sub1_Sub1_Sub2_1 && this.anInt365 < 400) {
				@Pc(39) String local39 = arg3.aString4 + method154(arg3.anInt180, aClass1_Sub1_Sub1_Sub1_Sub2_1.anInt180) + " (level-" + arg3.anInt180 + ")";
				if (this.anInt283 == 1) {
					this.aStringArray1[this.anInt365] = "Use " + this.aString7 + " with @whi@" + local39;
					this.anIntArray49[this.anInt365] = 367;
					this.anIntArray50[this.anInt365] = arg0;
					this.anIntArray47[this.anInt365] = arg1;
					this.anIntArray48[this.anInt365] = arg2;
					this.anInt365++;
				} else if (this.anInt394 != 1) {
					this.aStringArray1[this.anInt365] = "Follow @whi@" + local39;
					this.anIntArray49[this.anInt365] = 1544;
					this.anIntArray50[this.anInt365] = arg0;
					this.anIntArray47[this.anInt365] = arg1;
					this.anIntArray48[this.anInt365] = arg2;
					this.anInt365++;
					if (this.anInt388 == 0) {
						this.aStringArray1[this.anInt365] = "Trade with @whi@" + local39;
						this.anIntArray49[this.anInt365] = 1373;
						this.anIntArray50[this.anInt365] = arg0;
						this.anIntArray47[this.anInt365] = arg1;
						this.anIntArray48[this.anInt365] = arg2;
						this.anInt365++;
					}
					if (this.anInt267 > 0) {
						this.aStringArray1[this.anInt365] = "Attack @whi@" + local39;
						if (aClass1_Sub1_Sub1_Sub1_Sub2_1.anInt180 >= arg3.anInt180) {
							this.anIntArray49[this.anInt365] = 151;
						} else {
							this.anIntArray49[this.anInt365] = 2151;
						}
						this.anIntArray50[this.anInt365] = arg0;
						this.anIntArray47[this.anInt365] = arg1;
						this.anIntArray48[this.anInt365] = arg2;
						this.anInt365++;
					}
					if (this.anInt288 == 1) {
						this.aStringArray1[this.anInt365] = "Fight @whi@" + local39;
						this.anIntArray49[this.anInt365] = 151;
						this.anIntArray50[this.anInt365] = arg0;
						this.anIntArray47[this.anInt365] = arg1;
						this.anIntArray48[this.anInt365] = arg2;
						this.anInt365++;
					}
					if (this.anInt288 == 2) {
						this.aStringArray1[this.anInt365] = "Duel-with @whi@" + local39;
						this.anIntArray49[this.anInt365] = 1101;
						this.anIntArray50[this.anInt365] = arg0;
						this.anIntArray47[this.anInt365] = arg1;
						this.anIntArray48[this.anInt365] = arg2;
						this.anInt365++;
					}
				} else if ((this.anInt396 & 0x8) == 8) {
					this.aStringArray1[this.anInt365] = this.aString16 + " @whi@" + local39;
					this.anIntArray49[this.anInt365] = 651;
					this.anIntArray50[this.anInt365] = arg0;
					this.anIntArray47[this.anInt365] = arg1;
					this.anIntArray48[this.anInt365] = arg2;
					this.anInt365++;
				}
				for (@Pc(389) int local389 = 0; local389 < this.anInt365; local389++) {
					if (this.anIntArray49[local389] == 660) {
						this.aStringArray1[local389] = "Walk here @whi@" + local39;
						return;
					}
				}
			}
		} catch (@Pc(416) RuntimeException local416) {
			signlink.reporterror("78525, " + 10 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local416.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "n", descriptor = "(B)V")
	private void method157(@OriginalArg(0) byte arg0) {
		try {
			@Pc(7) byte[] local7 = this.aClass48_1.method678("title.dat", null);
			@Pc(13) Class1_Sub1_Sub2_Sub2 local13 = new Class1_Sub1_Sub2_Sub2(local7, this);
			this.aClass37_15.method538();
			local13.method404(0, 0);
			this.aClass37_16.method538();
			local13.method404(-637, 0);
			this.aClass37_12.method538();
			local13.method404(-128, 0);
			this.aClass37_13.method538();
			local13.method404(-202, -371);
			this.aClass37_14.method538();
			@Pc(58) boolean local58 = false;
			local13.method404(-202, -171);
			this.aClass37_17.method538();
			local13.method404(0, -265);
			this.aClass37_18.method538();
			local13.method404(-562, -265);
			this.aClass37_19.method538();
			local13.method404(-128, -171);
			this.aClass37_20.method538();
			local13.method404(-562, -171);
			@Pc(112) int[] local112 = new int[local13.anInt679];
			for (@Pc(114) int local114 = 0; local114 < local13.anInt680; local114++) {
				for (@Pc(118) int local118 = 0; local118 < local13.anInt679; local118++) {
					local112[local118] = local13.anIntArray210[local13.anInt679 + local13.anInt679 * local114 - local118 - 1];
				}
				for (@Pc(144) int local144 = 0; local144 < local13.anInt679; local144++) {
					local13.anIntArray210[local144 + local13.anInt679 * local114] = local112[local144];
				}
			}
			this.aClass37_15.method538();
			local13.method404(382, 0);
			this.aClass37_16.method538();
			local13.method404(-255, 0);
			this.aClass37_12.method538();
			local13.method404(254, 0);
			this.aClass37_13.method538();
			local13.method404(180, -371);
			this.aClass37_14.method538();
			local13.method404(180, -171);
			this.aClass37_17.method538();
			local13.method404(382, -265);
			this.aClass37_18.method538();
			local13.method404(-180, -265);
			this.aClass37_19.method538();
			local13.method404(254, -171);
			this.aClass37_20.method538();
			local13.method404(-180, -171);
			local13 = new Class1_Sub1_Sub2_Sub2(this.aClass48_1, "logo", 0);
			this.aClass37_12.method538();
			local13.method406(18, 382 - local13.anInt679 / 2 - 128);
			System.gc();
		} catch (@Pc(282) RuntimeException local282) {
			signlink.reporterror("36890, " + arg0 + ", " + local282.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
	@Override
	public String getParameter(@OriginalArg(0) String arg0) {
		return signlink.mainapp == null ? super.getParameter(arg0) : signlink.mainapp.getParameter(arg0);
	}

	@OriginalMember(owner = "client!client", name = "j", descriptor = "(Z)V")
	private void method159() {
		try {
			while (true) {
				@Pc(9) Class1_Sub1_Sub4 local9 = this.aClass45_Sub1_1.method659();
				if (local9 == null) {
					return;
				}
				if (local9.anInt796 == 0) {
					Class1_Sub1_Sub1_Sub5.method286(local9.anInt797, this.anInt260, local9.aByteArray10);
					if ((this.aClass45_Sub1_1.method655(local9.anInt797) & 0x62) != 0) {
						this.aBoolean82 = true;
						if (this.anInt412 != -1) {
							this.aBoolean52 = true;
						}
					}
				}
				if (local9.anInt796 == 1 && local9.aByteArray10 != null) {
					Class14.method325(local9.aByteArray10);
				}
				if (local9.anInt796 == 2 && local9.anInt797 == this.anInt434 && local9.aByteArray10 != null) {
					this.method133(this.aBoolean87, local9.aByteArray10);
				}
				if (local9.anInt796 == 3 && this.anInt362 == 1) {
					for (@Pc(81) int local81 = 0; local81 < this.aByteArrayArray2.length; local81++) {
						if (this.anIntArray55[local81] == local9.anInt797) {
							this.aByteArrayArray2[local81] = local9.aByteArray10;
							if (local9.aByteArray10 == null) {
								this.anIntArray55[local81] = -1;
							}
							break;
						}
						if (this.anIntArray56[local81] == local9.anInt797) {
							this.aByteArrayArray1[local81] = local9.aByteArray10;
							if (local9.aByteArray10 == null) {
								this.anIntArray56[local81] = -1;
							}
							break;
						}
					}
				}
				if (local9.anInt796 == 93 && this.aClass45_Sub1_1.method654(local9.anInt797)) {
					Class4.method60(new Class1_Sub1_Sub3(local9.aByteArray10, 337), this.aClass45_Sub1_1);
				}
			}
		} catch (@Pc(158) RuntimeException local158) {
			signlink.reporterror("35845, " + false + ", " + local158.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "t", descriptor = "(I)V")
	private void method160() {
		try {
			if (this.aClass37_12 == null) {
				super.aClass37_2 = null;
				this.aClass37_27 = null;
				this.aClass37_25 = null;
				this.aClass37_24 = null;
				this.aClass37_26 = null;
				this.aClass37_21 = null;
				this.aClass37_22 = null;
				this.aClass37_23 = null;
				this.aClass37_15 = new Class37((byte) -82, 265, this.method95(437), 128);
				Class1_Sub1_Sub2.method456();
				this.aClass37_16 = new Class37((byte) -82, 265, this.method95(437), 128);
				Class1_Sub1_Sub2.method456();
				this.aClass37_12 = new Class37((byte) -82, 171, this.method95(437), 509);
				Class1_Sub1_Sub2.method456();
				this.aClass37_13 = new Class37((byte) -82, 132, this.method95(437), 360);
				Class1_Sub1_Sub2.method456();
				this.aClass37_14 = new Class37((byte) -82, 200, this.method95(437), 360);
				Class1_Sub1_Sub2.method456();
				this.aClass37_17 = new Class37((byte) -82, 238, this.method95(437), 202);
				Class1_Sub1_Sub2.method456();
				if (this.anInt307 != 7) {
					this.anInt423 = this.aClass1_Sub1_Sub3_3.method498();
				}
				this.aClass37_18 = new Class37((byte) -82, 238, this.method95(437), 203);
				Class1_Sub1_Sub2.method456();
				this.aClass37_19 = new Class37((byte) -82, 94, this.method95(437), 74);
				Class1_Sub1_Sub2.method456();
				this.aClass37_20 = new Class37((byte) -82, 94, this.method95(437), 75);
				Class1_Sub1_Sub2.method456();
				if (this.aClass48_1 != null) {
					this.method157((byte) 7);
					this.method214(anInt438);
				}
				this.aBoolean86 = true;
			}
		} catch (@Pc(167) RuntimeException local167) {
			signlink.reporterror("42412, " + 7 + ", " + local167.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(ZII)V")
	private void method161(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1) {
		try {
			signlink.anInt928 = arg1;
			if (arg0) {
				signlink.midi = "voladjust";
			}
		} catch (@Pc(11) RuntimeException local11) {
			signlink.reporterror("62412, " + arg0 + ", " + arg1 + ", " + 4 + ", " + local11.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(I)V")
	@Override
	protected void method94() {
		try {
			this.aBoolean86 = true;
		} catch (@Pc(12) RuntimeException local12) {
			signlink.reporterror("96511, " + 9 + ", " + local12.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "g", descriptor = "(II)V")
	private void method162(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(9) Class31 local9 = this.aClass31ArrayArrayArray1[this.anInt257][arg0][arg1];
		if (local9 == null) {
			this.aClass39_1.method565(this.anInt257, arg0, arg1);
			return;
		}
		@Pc(21) int local21 = -99999999;
		@Pc(23) Class1_Sub1_Sub1_Sub3 local23 = null;
		@Pc(27) Class1_Sub1_Sub1_Sub3 local27;
		for (local27 = (Class1_Sub1_Sub1_Sub3) local9.method523(); local27 != null; local27 = (Class1_Sub1_Sub1_Sub3) local9.method525()) {
			@Pc(32) Class15 local32 = Class15.method345(local27.anInt482);
			@Pc(35) int local35 = local32.anInt614;
			if (local32.aBoolean147) {
				local35 *= local27.anInt483 + 1;
			}
			if (local35 > local21) {
				local21 = local35;
				local23 = local27;
			}
		}
		local9.method521(local23);
		@Pc(65) Class1_Sub1_Sub1_Sub3 local65 = null;
		@Pc(67) Class1_Sub1_Sub1_Sub3 local67 = null;
		for (local27 = (Class1_Sub1_Sub1_Sub3) local9.method523(); local27 != null; local27 = (Class1_Sub1_Sub1_Sub3) local9.method525()) {
			if (local27.anInt482 != local23.anInt482 && local65 == null) {
				local65 = local27;
			}
			if (local27.anInt482 != local23.anInt482 && local27.anInt482 != local65.anInt482 && local67 == null) {
				local67 = local27;
			}
		}
		@Pc(110) int local110 = arg0 + (arg1 << 7) + 1610612736;
		this.aClass39_1.method551(arg1, arg0, local67, local65, this.anInt257, local110, local23, this.method151(arg1 * 128 + 64, this.anInt257, arg0 * 128 + 64, (byte) 6));
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IZ)V")
	private void method163(@OriginalArg(1) boolean arg0) {
		try {
			for (@Pc(9) int local9 = 0; local9 < this.anInt389; local9++) {
				@Pc(19) Class1_Sub1_Sub1_Sub1_Sub1 local19 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[this.anIntArray85[local9]];
				@Pc(28) int local28 = (this.anIntArray85[local9] << 14) + 536870912;
				if (local19 != null && local19.method49() && local19.aClass13_1.aBoolean139 == arg0) {
					@Pc(44) int local44 = local19.anInt130 >> 7;
					@Pc(49) int local49 = local19.anInt131 >> 7;
					if (local44 >= 0 && local44 < 104 && local49 >= 0 && local49 < 104) {
						if (local19.anInt133 == 1 && (local19.anInt130 & 0x7F) == 64 && (local19.anInt131 & 0x7F) == 64) {
							if (this.anIntArrayArray2[local44][local49] == this.anInt303) {
								continue;
							}
							this.anIntArrayArray2[local44][local49] = this.anInt303;
						}
						this.aClass39_1.method555(local19, this.method151(local19.anInt131, this.anInt257, local19.anInt130, (byte) 6), local19.anInt132, local28, local19.aBoolean26, this.anInt257, local19.anInt131, (local19.anInt133 - 1) * 64 + 60, this.anInt282, local19.anInt130);
					}
				}
			}
		} catch (@Pc(134) RuntimeException local134) {
			signlink.reporterror("14696, " + -5080 + ", " + arg0 + ", " + local134.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "o", descriptor = "(B)V")
	private void method164() {
		try {
			if (this.aClass37_27 == null) {
				this.method212(366);
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
				this.aClass37_27 = new Class37((byte) -82, 96, this.method95(437), 479);
				this.aClass37_25 = new Class37((byte) -82, 156, this.method95(437), 172);
				Class1_Sub1_Sub2.method456();
				this.aClass1_Sub1_Sub2_Sub3_12.method445(0, 0);
				this.aClass37_24 = new Class37((byte) -82, 261, this.method95(437), 190);
				this.aClass37_26 = new Class37((byte) -82, 334, this.method95(437), 512);
				Class1_Sub1_Sub2.method456();
				this.aClass37_21 = new Class37((byte) -82, 50, this.method95(437), 496);
				this.aClass37_22 = new Class37((byte) -82, 37, this.method95(437), 269);
				this.aClass37_23 = new Class37((byte) -82, 45, this.method95(437), 249);
				this.aBoolean86 = true;
			}
		} catch (@Pc(135) RuntimeException local135) {
			signlink.reporterror("31497, " + 118 + ", " + local135.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "k", descriptor = "(Z)V")
	private void method165() {
		try {
			if (this.anInt426 > 0) {
				this.method220();
			} else {
				this.aClass37_26.method538();
				this.aClass1_Sub1_Sub2_Sub4_2.method465("Connection lost", 0, 144, 257);
				this.aClass1_Sub1_Sub2_Sub4_2.method465("Connection lost", 16777215, 143, 256);
				this.aClass1_Sub1_Sub2_Sub4_2.method465("Please wait - attempting to reestablish", 0, 159, 257);
				this.aClass1_Sub1_Sub2_Sub4_2.method465("Please wait - attempting to reestablish", 16777215, 158, 256);
				this.aClass37_26.method539(4, super.aGraphics2, 4);
				this.anInt296 = 0;
				@Pc(63) Class8 local63 = this.aClass8_1;
				this.aBoolean46 = false;
				this.method107(this.aString17, this.aString18, true);
				if (!this.aBoolean46) {
					this.method220();
				}
				try {
					local63.method244();
				} catch (@Pc(83) Exception local83) {
				}
			}
		} catch (@Pc(85) RuntimeException local85) {
			signlink.reporterror("25681, " + false + ", " + local85.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ZIIIIIIIIIIZ)Z")
	private boolean method166(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10) {
		try {
			@Pc(11) int local11;
			for (@Pc(7) int local7 = 0; local7 < 104; local7++) {
				for (local11 = 0; local11 < 104; local11++) {
					this.anIntArrayArray4[local7][local11] = 0;
					this.anIntArrayArray5[local7][local11] = 99999999;
				}
			}
			local11 = arg6;
			@Pc(39) int local39 = arg10;
			this.anIntArrayArray4[arg6][arg10] = 99;
			this.anIntArrayArray5[arg6][arg10] = 0;
			@Pc(55) byte local55 = 0;
			@Pc(57) int local57 = 0;
			this.anIntArray34[0] = arg6;
			@Pc(66) int local66 = local55 + 1;
			this.anIntArray35[0] = arg10;
			@Pc(70) boolean local70 = false;
			@Pc(74) int local74 = this.anIntArray34.length;
			@Pc(81) int[][] local81 = this.aClass19Array1[this.anInt257].anIntArrayArray17;
			@Pc(199) int local199;
			while (local57 != local66) {
				local11 = this.anIntArray34[local57];
				local39 = this.anIntArray35[local57];
				local57 = (local57 + 1) % local74;
				if (local11 == arg3 && local39 == arg8) {
					local70 = true;
					break;
				}
				if (arg2 != 0) {
					if ((arg2 < 5 || arg2 == 10) && this.aClass19Array1[this.anInt257].method423(arg3, local11, arg2 - 1, arg7, arg8, local39, (byte) 7)) {
						local70 = true;
						break;
					}
					if (arg2 < 10 && this.aClass19Array1[this.anInt257].method424(arg3, local11, arg8, arg7, arg2 - 1, local39)) {
						local70 = true;
						break;
					}
				}
				if (arg1 != 0 && arg9 != 0 && this.aClass19Array1[this.anInt257].method425(arg8, arg4, arg9, local39, local11, 730, arg1, arg3)) {
					local70 = true;
					break;
				}
				local199 = this.anIntArrayArray5[local11][local39] + 1;
				if (local11 > 0 && this.anIntArrayArray4[local11 - 1][local39] == 0 && (local81[local11 - 1][local39] & 0x280108) == 0) {
					this.anIntArray34[local66] = local11 - 1;
					this.anIntArray35[local66] = local39;
					local66 = (local66 + 1) % local74;
					this.anIntArrayArray4[local11 - 1][local39] = 2;
					this.anIntArrayArray5[local11 - 1][local39] = local199;
				}
				if (local11 < 103 && this.anIntArrayArray4[local11 + 1][local39] == 0 && (local81[local11 + 1][local39] & 0x280180) == 0) {
					this.anIntArray34[local66] = local11 + 1;
					this.anIntArray35[local66] = local39;
					local66 = (local66 + 1) % local74;
					this.anIntArrayArray4[local11 + 1][local39] = 8;
					this.anIntArrayArray5[local11 + 1][local39] = local199;
				}
				if (local39 > 0 && this.anIntArrayArray4[local11][local39 - 1] == 0 && (local81[local11][local39 - 1] & 0x280102) == 0) {
					this.anIntArray34[local66] = local11;
					this.anIntArray35[local66] = local39 - 1;
					local66 = (local66 + 1) % local74;
					this.anIntArrayArray4[local11][local39 - 1] = 1;
					this.anIntArrayArray5[local11][local39 - 1] = local199;
				}
				if (local39 < 103 && this.anIntArrayArray4[local11][local39 + 1] == 0 && (local81[local11][local39 + 1] & 0x280120) == 0) {
					this.anIntArray34[local66] = local11;
					this.anIntArray35[local66] = local39 + 1;
					local66 = (local66 + 1) % local74;
					this.anIntArrayArray4[local11][local39 + 1] = 4;
					this.anIntArrayArray5[local11][local39 + 1] = local199;
				}
				if (local11 > 0 && local39 > 0 && this.anIntArrayArray4[local11 - 1][local39 - 1] == 0 && (local81[local11 - 1][local39 - 1] & 0x28010E) == 0 && (local81[local11 - 1][local39] & 0x280108) == 0 && (local81[local11][local39 - 1] & 0x280102) == 0) {
					this.anIntArray34[local66] = local11 - 1;
					this.anIntArray35[local66] = local39 - 1;
					local66 = (local66 + 1) % local74;
					this.anIntArrayArray4[local11 - 1][local39 - 1] = 3;
					this.anIntArrayArray5[local11 - 1][local39 - 1] = local199;
				}
				if (local11 < 103 && local39 > 0 && this.anIntArrayArray4[local11 + 1][local39 - 1] == 0 && (local81[local11 + 1][local39 - 1] & 0x280183) == 0 && (local81[local11 + 1][local39] & 0x280180) == 0 && (local81[local11][local39 - 1] & 0x280102) == 0) {
					this.anIntArray34[local66] = local11 + 1;
					this.anIntArray35[local66] = local39 - 1;
					local66 = (local66 + 1) % local74;
					this.anIntArrayArray4[local11 + 1][local39 - 1] = 9;
					this.anIntArrayArray5[local11 + 1][local39 - 1] = local199;
				}
				if (local11 > 0 && local39 < 103 && this.anIntArrayArray4[local11 - 1][local39 + 1] == 0 && (local81[local11 - 1][local39 + 1] & 0x280138) == 0 && (local81[local11 - 1][local39] & 0x280108) == 0 && (local81[local11][local39 + 1] & 0x280120) == 0) {
					this.anIntArray34[local66] = local11 - 1;
					this.anIntArray35[local66] = local39 + 1;
					local66 = (local66 + 1) % local74;
					this.anIntArrayArray4[local11 - 1][local39 + 1] = 6;
					this.anIntArrayArray5[local11 - 1][local39 + 1] = local199;
				}
				if (local11 < 103 && local39 < 103 && this.anIntArrayArray4[local11 + 1][local39 + 1] == 0 && (local81[local11 + 1][local39 + 1] & 0x2801E0) == 0 && (local81[local11 + 1][local39] & 0x280180) == 0 && (local81[local11][local39 + 1] & 0x280120) == 0) {
					this.anIntArray34[local66] = local11 + 1;
					this.anIntArray35[local66] = local39 + 1;
					local66 = (local66 + 1) % local74;
					this.anIntArrayArray4[local11 + 1][local39 + 1] = 12;
					this.anIntArrayArray5[local11 + 1][local39 + 1] = local199;
				}
			}
			this.anInt264 = 0;
			@Pc(815) int local815;
			@Pc(821) int local821;
			@Pc(827) int local827;
			if (!local70) {
				if (arg0) {
					local199 = 100;
					for (local815 = 1; local815 < 2; local815++) {
						for (local821 = arg3 - local815; local821 <= arg3 + local815; local821++) {
							for (local827 = arg8 - local815; local827 <= arg8 + local815; local827++) {
								if (local821 >= 0 && local827 >= 0 && local821 < 104 && local827 < 104 && this.anIntArrayArray5[local821][local827] < local199) {
									local199 = this.anIntArrayArray5[local821][local827];
									local11 = local821;
									local39 = local827;
									this.anInt264 = 1;
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
			this.anIntArray34[0] = local11;
			local57 = local888 + 1;
			this.anIntArray35[0] = local39;
			local199 = local815 = this.anIntArrayArray4[local11][local39];
			while (local11 != arg6 || local39 != arg10) {
				if (local199 != local815) {
					local815 = local199;
					this.anIntArray34[local57] = local11;
					this.anIntArray35[local57++] = local39;
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
				local821 = this.anIntArray34[local57];
				local827 = this.anIntArray35[local57];
				if (arg5 == 0) {
					this.aClass1_Sub1_Sub3_4.method487(182);
					this.aClass1_Sub1_Sub3_4.method488(local74 + local74 + 3);
				}
				if (arg5 == 1) {
					this.aClass1_Sub1_Sub3_4.method487(198);
					this.aClass1_Sub1_Sub3_4.method488(local74 + local74 + 3 + 14);
				}
				if (arg5 == 2) {
					this.aClass1_Sub1_Sub3_4.method487(216);
					this.aClass1_Sub1_Sub3_4.method488(local74 + local74 + 3);
				}
				if (super.anIntArray32[5] == 1) {
					this.aClass1_Sub1_Sub3_4.method488(1);
				} else {
					this.aClass1_Sub1_Sub3_4.method488(0);
				}
				this.aClass1_Sub1_Sub3_4.method489(local821 + this.anInt312);
				this.aClass1_Sub1_Sub3_4.method489(local827 + this.anInt313);
				this.anInt296 = this.anIntArray34[0];
				this.anInt297 = this.anIntArray35[0];
				for (@Pc(1076) int local1076 = 1; local1076 < local74; local1076++) {
					local57--;
					this.aClass1_Sub1_Sub3_4.method488(this.anIntArray34[local57] - local821);
					this.aClass1_Sub1_Sub3_4.method488(this.anIntArray35[local57] - local827);
				}
				return true;
			} else if (arg5 == 1) {
				return false;
			} else {
				return true;
			}
		} catch (@Pc(1111) RuntimeException local1111) {
			signlink.reporterror("52034, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + arg10 + ", " + false + ", " + local1111.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "p", descriptor = "(B)V")
	private void method167() {
		try {
			if (this.anInt326 == 0) {
				@Pc(6) int local6 = super.anInt238;
				if (this.aByte7 != 8) {
					this.aBoolean78 = !this.aBoolean78;
				}
				if (this.anInt394 == 1 && super.anInt239 >= 516 && super.anInt240 >= 160 && super.anInt239 <= 765 && super.anInt240 <= 205) {
					local6 = 0;
				}
				@Pc(49) int local49;
				@Pc(52) int local52;
				@Pc(128) int local128;
				if (this.aBoolean61) {
					if (local6 != 1) {
						local49 = super.anInt233;
						local52 = super.anInt234;
						if (this.anInt366 == 0) {
							local49 -= 4;
							local52 -= 4;
						}
						if (this.anInt366 == 1) {
							local49 -= 553;
							local52 -= 205;
						}
						if (this.anInt366 == 2) {
							local49 -= 17;
							local52 -= 357;
						}
						if (local49 < this.anInt367 - 10 || local49 > this.anInt367 + this.anInt369 + 10 || local52 < this.anInt368 - 10 || local52 > this.anInt368 + this.anInt370 + 10) {
							this.aBoolean61 = false;
							if (this.anInt366 == 1) {
								this.aBoolean82 = true;
							}
							if (this.anInt366 == 2) {
								this.aBoolean52 = true;
							}
						}
					}
					if (local6 == 1) {
						local49 = this.anInt367;
						local52 = this.anInt368;
						local128 = this.anInt369;
						@Pc(131) int local131 = super.anInt239;
						@Pc(134) int local134 = super.anInt240;
						if (this.anInt366 == 0) {
							local131 -= 4;
							local134 -= 4;
						}
						if (this.anInt366 == 1) {
							local131 -= 553;
							local134 -= 205;
						}
						if (this.anInt366 == 2) {
							local131 -= 17;
							local134 -= 357;
						}
						@Pc(153) int local153 = -1;
						for (@Pc(155) int local155 = 0; local155 < this.anInt365; local155++) {
							@Pc(170) int local170 = local52 + (this.anInt365 - 1 - local155) * 15 + 31;
							if (local131 > local49 && local131 < local49 + local128 && local134 > local170 - 13 && local134 < local170 + 3) {
								local153 = local155;
							}
						}
						if (local153 != -1) {
							this.method215(local153);
						}
						this.aBoolean61 = false;
						if (this.anInt366 == 1) {
							this.aBoolean82 = true;
						}
						if (this.anInt366 == 2) {
							this.aBoolean52 = true;
							return;
						}
					}
				} else {
					if (local6 == 1 && this.anInt365 > 0) {
						local49 = this.anIntArray49[this.anInt365 - 1];
						if (local49 == 602 || local49 == 596 || local49 == 22 || local49 == 892 || local49 == 415 || local49 == 405 || local49 == 38 || local49 == 422 || local49 == 478 || local49 == 347 || local49 == 188 || local49 == 1773) {
							local52 = this.anIntArray47[this.anInt365 - 1];
							local128 = this.anIntArray48[this.anInt365 - 1];
							@Pc(290) Class6 local290 = Class6.aClass6Array1[local128];
							if (local290.aBoolean91 || local290.aBoolean94) {
								this.aBoolean68 = false;
								this.anInt352 = 0;
								this.anInt324 = local128;
								this.anInt325 = local52;
								this.anInt326 = 2;
								this.anInt327 = super.anInt239;
								this.anInt328 = super.anInt240;
								if (Class6.aClass6Array1[local128].anInt451 == this.anInt278) {
									this.anInt326 = 1;
								}
								if (Class6.aClass6Array1[local128].anInt451 == this.anInt412) {
									this.anInt326 = 3;
								}
								return;
							}
						}
					}
					if (local6 == 1 && (this.anInt427 == 1 || this.method121(this.anInt365 - 1)) && this.anInt365 > 2) {
						local6 = 2;
					}
					if (local6 == 1 && this.anInt365 > 0) {
						this.method215(this.anInt365 - 1);
					}
					if (local6 != 2 || this.anInt365 <= 0) {
						return;
					}
					this.method201();
				}
			}
		} catch (@Pc(385) RuntimeException local385) {
			signlink.reporterror("78639, " + 8 + ", " + local385.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(JB)V")
	private void method168(@OriginalArg(0) long arg0, @OriginalArg(1) byte arg1) {
		try {
			if (arg0 != 0L) {
				if (this.anInt317 >= 100 && this.anInt391 != 1) {
					this.method211(0, "", "Your friendlist is full. Max of 100 for free users, and 200 for members");
				} else if (this.anInt317 >= 200) {
					this.method211(0, "", "Your friendlist is full. Max of 100 for free users, and 200 for members");
				} else {
					@Pc(38) String local38 = Class49.method683(Class49.method680(arg0));
					for (@Pc(40) int local40 = 0; local40 < this.anInt317; local40++) {
						if (this.aLongArray4[local40] == arg0) {
							this.method211(0, "", local38 + " is already on your friend list");
							return;
						}
					}
					for (@Pc(70) int local70 = 0; local70 < this.anInt258; local70++) {
						if (this.aLongArray3[local70] == arg0) {
							this.method211(0, "", "Please remove " + local38 + " from your ignore list first");
							return;
						}
					}
					if (!local38.equals(aClass1_Sub1_Sub1_Sub1_Sub2_1.aString4)) {
						this.aStringArray4[this.anInt317] = local38;
						this.aLongArray4[this.anInt317] = arg0;
						this.anIntArray89[this.anInt317] = 0;
						this.anInt317++;
						this.aBoolean82 = true;
						this.aClass1_Sub1_Sub3_4.method487(116);
						this.aClass1_Sub1_Sub3_4.method494(arg0, this.anInt295);
						@Pc(148) boolean local148 = false;
					}
				}
			}
		} catch (@Pc(151) RuntimeException local151) {
			signlink.reporterror("67239, " + arg0 + ", " + arg1 + ", " + local151.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(ZLclient!d;)Z")
	private boolean method169(@OriginalArg(1) Class6 arg0) {
		try {
			@Pc(9) int local9 = arg0.anInt454;
			if (local9 >= 1 && local9 <= 200 || !(local9 < 701 || local9 > 900)) {
				if (local9 >= 801) {
					local9 -= 701;
				} else if (local9 >= 701) {
					local9 -= 601;
				} else if (local9 >= 101) {
					local9 -= 101;
				} else {
					local9--;
				}
				this.aStringArray1[this.anInt365] = "Remove @whi@" + this.aStringArray4[local9];
				this.anIntArray49[this.anInt365] = 557;
				this.anInt365++;
				this.aStringArray1[this.anInt365] = "Message @whi@" + this.aStringArray4[local9];
				this.anIntArray49[this.anInt365] = 679;
				this.anInt365++;
				return true;
			} else if (local9 >= 401 && local9 <= 500) {
				this.aStringArray1[this.anInt365] = "Remove @whi@" + arg0.aString19;
				this.anIntArray49[this.anInt365] = 556;
				this.anInt365++;
				return true;
			} else {
				return false;
			}
		} catch (@Pc(132) RuntimeException local132) {
			signlink.reporterror("90866, " + true + ", " + arg0 + ", " + local132.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ZLclient!d;III)V")
	private void method170(@OriginalArg(1) Class6 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		try {
			if (arg0.anInt452 == 0 && arg0.anIntArray100 != null && (!arg0.aBoolean89 || this.anInt250 == arg0.anInt450 || this.anInt256 == arg0.anInt450 || this.anInt322 == arg0.anInt450)) {
				@Pc(29) int local29 = Class1_Sub1_Sub2.anInt738;
				@Pc(31) int local31 = Class1_Sub1_Sub2.anInt736;
				@Pc(33) int local33 = Class1_Sub1_Sub2.anInt739;
				@Pc(35) int local35 = Class1_Sub1_Sub2.anInt737;
				this.aBoolean46 &= true;
				Class1_Sub1_Sub2.method455(arg2, arg2 + arg0.anInt455, arg3 + arg0.anInt456, arg3, this.aBoolean79);
				@Pc(58) int local58 = arg0.anIntArray100.length;
				for (@Pc(60) int local60 = 0; local60 < local58; local60++) {
					@Pc(69) int local69 = arg0.anIntArray101[local60] + arg2;
					@Pc(78) int local78 = arg0.anIntArray102[local60] + arg3 - arg1;
					@Pc(85) Class6 local85 = Class6.aClass6Array1[arg0.anIntArray100[local60]];
					@Pc(90) int local90 = local69 + local85.anInt457;
					@Pc(95) int local95 = local78 + local85.anInt458;
					if (local85.anInt454 > 0) {
						this.method155(local85);
					}
					if (local85.anInt452 == 0) {
						if (local85.anInt461 > local85.anInt460 - local85.anInt456) {
							local85.anInt461 = local85.anInt460 - local85.anInt456;
						}
						if (local85.anInt461 < 0) {
							local85.anInt461 = 0;
						}
						this.method170(local85, local85.anInt461, local90, local95);
						if (local85.anInt460 > local85.anInt456) {
							this.method116(local85.anInt461, local90 + local85.anInt455, local95, local85.anInt460, local85.anInt456);
						}
					} else if (local85.anInt452 != 1) {
						@Pc(167) int local167;
						@Pc(171) int local171;
						@Pc(182) int local182;
						@Pc(217) int local217;
						@Pc(224) int local224;
						@Pc(165) int local165;
						@Pc(215) int local215;
						if (local85.anInt452 == 2) {
							local165 = 0;
							for (local167 = 0; local167 < local85.anInt456; local167++) {
								for (local171 = 0; local171 < local85.anInt455; local171++) {
									local182 = local90 + local171 * (local85.anInt463 + 32);
									@Pc(191) int local191 = local95 + local167 * (local85.anInt464 + 32);
									if (local165 < 20) {
										local182 += local85.anIntArray103[local165];
										local191 += local85.anIntArray104[local165];
									}
									if (local85.anIntArray96[local165] > 0) {
										local215 = 0;
										local217 = 0;
										local224 = local85.anIntArray96[local165] - 1;
										if (local182 > Class1_Sub1_Sub2.anInt738 - 32 && local182 < Class1_Sub1_Sub2.anInt739 && local191 > Class1_Sub1_Sub2.anInt736 - 32 && local191 < Class1_Sub1_Sub2.anInt737 || this.anInt326 != 0 && this.anInt325 == local165) {
											@Pc(249) int local249 = 0;
											if (this.anInt283 == 1 && this.anInt284 == local165 && this.anInt285 == local85.anInt450) {
												local249 = 16777215;
											}
											@Pc(273) Class1_Sub1_Sub2_Sub2 local273 = Class15.method351(local249, local85.anIntArray97[local165], local224);
											if (local273 != null) {
												@Pc(352) int local352;
												if (this.anInt326 != 0 && this.anInt325 == local165 && this.anInt324 == local85.anInt450) {
													local215 = super.anInt233 - this.anInt327;
													local217 = super.anInt234 - this.anInt328;
													if (local215 < 5 && local215 > -5) {
														local215 = 0;
													}
													if (local217 < 5 && local217 > -5) {
														local217 = 0;
													}
													if (this.anInt352 < 5) {
														local215 = 0;
														local217 = 0;
													}
													local273.method408(local182 + local215, local191 + local217);
													if (local191 + local217 < Class1_Sub1_Sub2.anInt736 && arg0.anInt461 > 0) {
														local352 = this.anInt301 * (Class1_Sub1_Sub2.anInt736 - local191 - local217) / 3;
														if (local352 > this.anInt301 * 10) {
															local352 = this.anInt301 * 10;
														}
														if (local352 > arg0.anInt461) {
															local352 = arg0.anInt461;
														}
														arg0.anInt461 -= local352;
														this.anInt328 += local352;
													}
													if (local191 + local217 + 32 > Class1_Sub1_Sub2.anInt737 && arg0.anInt461 < arg0.anInt460 - arg0.anInt456) {
														local352 = this.anInt301 * (local191 + local217 + 32 - Class1_Sub1_Sub2.anInt737) / 3;
														if (local352 > this.anInt301 * 10) {
															local352 = this.anInt301 * 10;
														}
														if (local352 > arg0.anInt460 - arg0.anInt456 - arg0.anInt461) {
															local352 = arg0.anInt460 - arg0.anInt456 - arg0.anInt461;
														}
														arg0.anInt461 += local352;
														this.anInt328 -= local352;
													}
												} else if (this.anInt271 != 0 && this.anInt270 == local165 && this.anInt269 == local85.anInt450) {
													local273.method408(local182, local191);
												} else {
													local273.method406(local191, local182);
												}
												if (local273.anInt683 == 33 || local85.anIntArray97[local165] != 1) {
													local352 = local85.anIntArray97[local165];
													this.aClass1_Sub1_Sub2_Sub4_1.method468(local191 + local217 + 10, local182 + 1 + local215, method158(local352), 0);
													this.aClass1_Sub1_Sub2_Sub4_1.method468(local191 + local217 + 9, local182 + local215, method158(local352), 16776960);
												}
											}
										}
									} else if (local85.aClass1_Sub1_Sub2_Sub2Array8 != null && local165 < 20) {
										@Pc(541) Class1_Sub1_Sub2_Sub2 local541 = local85.aClass1_Sub1_Sub2_Sub2Array8[local165];
										if (local541 != null) {
											local541.method406(local191, local182);
										}
									}
									local165++;
								}
							}
						} else if (local85.anInt452 == 3) {
							@Pc(567) boolean local567 = false;
							if (this.anInt322 == local85.anInt450 || this.anInt256 == local85.anInt450 || this.anInt250 == local85.anInt450) {
								local567 = true;
							}
							if (this.method114(local85, 295)) {
								local165 = local85.anInt466;
								if (local567 && local85.anInt468 != 0) {
									local165 = local85.anInt468;
								}
							} else {
								local165 = local85.anInt465;
								if (local567 && local85.anInt467 != 0) {
									local165 = local85.anInt467;
								}
							}
							if (local85.aByte17 == 0) {
								if (local85.aBoolean95) {
									Class1_Sub1_Sub2.method458(local85.anInt455, local90, local95, local85.anInt456, local165);
								} else {
									Class1_Sub1_Sub2.method459(anInt336, local85.anInt456, local95, local85.anInt455, local165, local90);
								}
							} else if (local85.aBoolean95) {
								Class1_Sub1_Sub2.method457(local90, local85.anInt456, local95, (byte) 4, 256 - (local85.aByte17 & 0xFF), local85.anInt455, local165);
							} else {
								Class1_Sub1_Sub2.method460(local85.anInt455, local165, local85.anInt456, local95, local90, 256 - (local85.aByte17 & 0xFF));
							}
						} else {
							@Pc(685) Class1_Sub1_Sub2_Sub4 local685;
							if (local85.anInt452 == 4) {
								local685 = local85.aClass1_Sub1_Sub2_Sub4_5;
								@Pc(688) String local688 = local85.aString19;
								@Pc(690) boolean local690 = false;
								if (this.anInt322 == local85.anInt450 || this.anInt256 == local85.anInt450 || this.anInt250 == local85.anInt450) {
									local690 = true;
								}
								if (this.method114(local85, 295)) {
									local167 = local85.anInt466;
									if (local690 && local85.anInt468 != 0) {
										local167 = local85.anInt468;
									}
									if (local85.aString20.length() > 0) {
										local688 = local85.aString20;
									}
								} else {
									local167 = local85.anInt465;
									if (local690 && local85.anInt467 != 0) {
										local167 = local85.anInt467;
									}
								}
								if (local85.anInt453 == 6 && this.aBoolean73) {
									local688 = "Please wait...";
									local167 = local85.anInt465;
								}
								if (Class1_Sub1_Sub2.anInt734 == 479) {
									if (local167 == 16776960) {
										local167 = 255;
									}
									if (local167 == 49152) {
										local167 = 16777215;
									}
								}
								local215 = local95 + local685.anInt745;
								while (local688.length() > 0) {
									if (local688.indexOf("%") != -1) {
										label348: while (true) {
											local217 = local688.indexOf("%1");
											if (local217 == -1) {
												while (true) {
													local217 = local688.indexOf("%2");
													if (local217 == -1) {
														while (true) {
															local217 = local688.indexOf("%3");
															if (local217 == -1) {
																while (true) {
																	local217 = local688.indexOf("%4");
																	if (local217 == -1) {
																		while (true) {
																			local217 = local688.indexOf("%5");
																			if (local217 == -1) {
																				break label348;
																			}
																			local688 = local688.substring(0, local217) + this.method104(this.method145(this.aByte3, local85, 4), 292) + local688.substring(local217 + 2);
																		}
																	}
																	local688 = local688.substring(0, local217) + this.method104(this.method145(this.aByte3, local85, 3), 292) + local688.substring(local217 + 2);
																}
															}
															local688 = local688.substring(0, local217) + this.method104(this.method145(this.aByte3, local85, 2), 292) + local688.substring(local217 + 2);
														}
													}
													local688 = local688.substring(0, local217) + this.method104(this.method145(this.aByte3, local85, 1), 292) + local688.substring(local217 + 2);
												}
											}
											local688 = local688.substring(0, local217) + this.method104(this.method145(this.aByte3, local85, 0), 292) + local688.substring(local217 + 2);
										}
									}
									local217 = local688.indexOf("\\n");
									@Pc(967) String local967;
									if (local217 == -1) {
										local967 = local688;
										local688 = "";
									} else {
										local967 = local688.substring(0, local217);
										local688 = local688.substring(local217 + 2);
									}
									if (local85.aBoolean96) {
										local685.method466(local215, (byte) 6, local90 + local85.anInt455 / 2, local85.aBoolean97, local967, local167);
									} else {
										local685.method470(local967, local215, local90, local85.aBoolean97, local167);
									}
									local215 += local685.anInt745;
								}
							} else if (local85.anInt452 == 5) {
								@Pc(1029) Class1_Sub1_Sub2_Sub2 local1029;
								if (this.method114(local85, 295)) {
									local1029 = local85.aClass1_Sub1_Sub2_Sub2_15;
								} else {
									local1029 = local85.aClass1_Sub1_Sub2_Sub2_14;
								}
								if (local1029 != null) {
									local1029.method406(local95, local90);
								}
							} else if (local85.anInt452 == 6) {
								local165 = Class1_Sub1_Sub2_Sub1.anInt654;
								local167 = Class1_Sub1_Sub2_Sub1.anInt655;
								Class1_Sub1_Sub2_Sub1.anInt654 = local90 + local85.anInt455 / 2;
								Class1_Sub1_Sub2_Sub1.anInt655 = local95 + local85.anInt456 / 2;
								local171 = Class1_Sub1_Sub2_Sub1.anIntArray183[local85.anInt476] * local85.anInt475 >> 16;
								local182 = Class1_Sub1_Sub2_Sub1.anIntArray184[local85.anInt476] * local85.anInt475 >> 16;
								@Pc(1090) boolean local1090 = this.method114(local85, 295);
								if (local1090) {
									local215 = local85.anInt474;
								} else {
									local215 = local85.anInt473;
								}
								@Pc(1110) Class1_Sub1_Sub1_Sub5 local1110;
								if (local215 == -1) {
									local1110 = local85.method232(-1, -1, local1090);
								} else {
									@Pc(1116) Class27 local1116 = Class27.aClass27Array1[local215];
									local1110 = local85.method232(local1116.anIntArray228[local85.anInt448], local1116.anIntArray227[local85.anInt448], local1090);
								}
								if (local1110 != null) {
									local1110.method308(local85.anInt477, 0, local85.anInt476, 0, local171, local182);
								}
								Class1_Sub1_Sub2_Sub1.anInt654 = local165;
								Class1_Sub1_Sub2_Sub1.anInt655 = local167;
							} else if (local85.anInt452 == 7) {
								local685 = local85.aClass1_Sub1_Sub2_Sub4_5;
								local167 = 0;
								for (local171 = 0; local171 < local85.anInt456; local171++) {
									for (local182 = 0; local182 < local85.anInt455; local182++) {
										if (local85.anIntArray96[local167] > 0) {
											@Pc(1180) Class15 local1180 = Class15.method345(local85.anIntArray96[local167] - 1);
											@Pc(1183) String local1183 = local1180.aString26;
											if (local1180.aBoolean147 || local85.anIntArray97[local167] != 1) {
												local1183 = local1183 + " x" + method183(local85.anIntArray97[local167]);
											}
											local217 = local90 + local182 * (local85.anInt463 + 115);
											local224 = local95 + local171 * (local85.anInt464 + 12);
											if (local85.aBoolean96) {
												local685.method466(local224, (byte) 6, local217 + local85.anInt455 / 2, local85.aBoolean97, local1183, local85.anInt465);
											} else {
												local685.method470(local1183, local224, local217, local85.aBoolean97, local85.anInt465);
											}
										}
										local167++;
									}
								}
							}
						}
					}
				}
				Class1_Sub1_Sub2.method455(local29, local33, local35, local31, this.aBoolean79);
			}
		} catch (@Pc(1280) RuntimeException local1280) {
			signlink.reporterror("85343, " + true + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local1280.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "u", descriptor = "(I)V")
	private void method171() {
		try {
			this.aClass37_25.method538();
			@Pc(13) int local13 = this.anInt403 + this.anInt413 & 0x7FF;
			@Pc(20) int local20 = aClass1_Sub1_Sub1_Sub1_Sub2_1.anInt130 / 32 + 48;
			@Pc(27) int local27 = 464 - aClass1_Sub1_Sub1_Sub1_Sub2_1.anInt131 / 32;
			this.aClass1_Sub1_Sub2_Sub2_4.method410(5, this.anIntArray43, local20, 151, 146, local27, 25, this.anIntArray83, local13, this.anInt359 + 256);
			this.aClass1_Sub1_Sub2_Sub2_9.method410(0, this.anIntArray38, 25, 33, 33, 25, 0, this.anIntArray53, this.anInt403, 256);
			for (@Pc(72) int local72 = 0; local72 < this.anInt341; local72++) {
				local20 = this.anIntArray66[local72] * 4 + 2 - aClass1_Sub1_Sub1_Sub1_Sub2_1.anInt130 / 32;
				local27 = this.anIntArray67[local72] * 4 + 2 - aClass1_Sub1_Sub1_Sub1_Sub2_1.anInt131 / 32;
				this.method207(this.aClass1_Sub1_Sub2_Sub2Array6[local72], local27, local20);
			}
			@Pc(122) int local122;
			for (@Pc(118) int local118 = 0; local118 < 104; local118++) {
				for (local122 = 0; local122 < 104; local122++) {
					@Pc(134) Class31 local134 = this.aClass31ArrayArrayArray1[this.anInt257][local118][local122];
					if (local134 != null) {
						local20 = local118 * 4 + 2 - aClass1_Sub1_Sub1_Sub1_Sub2_1.anInt130 / 32;
						local27 = local122 * 4 + 2 - aClass1_Sub1_Sub1_Sub1_Sub2_1.anInt131 / 32;
						this.method207(this.aClass1_Sub1_Sub2_Sub2_10, local27, local20);
					}
				}
			}
			for (local122 = 0; local122 < this.anInt389; local122++) {
				@Pc(185) Class1_Sub1_Sub1_Sub1_Sub1 local185 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[this.anIntArray85[local122]];
				if (local185 != null && local185.method49() && local185.aClass13_1.aBoolean138) {
					local20 = local185.anInt130 / 32 - aClass1_Sub1_Sub1_Sub1_Sub2_1.anInt130 / 32;
					local27 = local185.anInt131 / 32 - aClass1_Sub1_Sub1_Sub1_Sub2_1.anInt131 / 32;
					this.method207(this.aClass1_Sub1_Sub2_Sub2_11, local27, local20);
				}
			}
			@Pc(239) Class1_Sub1_Sub1_Sub1_Sub2 local239;
			for (@Pc(229) int local229 = 0; local229 < this.anInt420; local229++) {
				local239 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[this.anIntArray91[local229]];
				if (local239 != null && local239.method49()) {
					local20 = local239.anInt130 / 32 - aClass1_Sub1_Sub1_Sub1_Sub2_1.anInt130 / 32;
					local27 = local239.anInt131 / 32 - aClass1_Sub1_Sub1_Sub1_Sub2_1.anInt131 / 32;
					@Pc(267) boolean local267 = false;
					@Pc(271) long local271 = Class49.method679(local239.aString4);
					for (@Pc(273) int local273 = 0; local273 < this.anInt317; local273++) {
						if (local271 == this.aLongArray4[local273] && this.anIntArray89[local273] != 0) {
							local267 = true;
							break;
						}
					}
					if (local267) {
						this.method207(this.aClass1_Sub1_Sub2_Sub2_13, local27, local20);
					} else {
						this.method207(this.aClass1_Sub1_Sub2_Sub2_12, local27, local20);
					}
				}
			}
			if (this.anInt408 != 0 && anInt446 % 20 < 10) {
				if (this.anInt408 == 1 && this.anInt247 >= 0 && this.anInt247 < this.aClass1_Sub1_Sub1_Sub1_Sub1Array1.length) {
					@Pc(346) Class1_Sub1_Sub1_Sub1_Sub1 local346 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[this.anInt247];
					if (local346 != null) {
						local20 = local346.anInt130 / 32 - aClass1_Sub1_Sub1_Sub1_Sub2_1.anInt130 / 32;
						local27 = local346.anInt131 / 32 - aClass1_Sub1_Sub1_Sub1_Sub2_1.anInt131 / 32;
						this.method119(this.aClass1_Sub1_Sub2_Sub2_3, local20, local27);
					}
				}
				if (this.anInt408 == 2) {
					local20 = (this.anInt381 - this.anInt312) * 4 + 2 - aClass1_Sub1_Sub1_Sub1_Sub2_1.anInt130 / 32;
					local27 = (this.anInt382 - this.anInt313) * 4 + 2 - aClass1_Sub1_Sub1_Sub1_Sub2_1.anInt131 / 32;
					this.method119(this.aClass1_Sub1_Sub2_Sub2_3, local20, local27);
				}
				if (this.anInt408 == 10 && this.anInt428 >= 0 && this.anInt428 < this.aClass1_Sub1_Sub1_Sub1_Sub2Array1.length) {
					local239 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[this.anInt428];
					if (local239 != null) {
						local20 = local239.anInt130 / 32 - aClass1_Sub1_Sub1_Sub1_Sub2_1.anInt130 / 32;
						local27 = local239.anInt131 / 32 - aClass1_Sub1_Sub1_Sub1_Sub2_1.anInt131 / 32;
						this.method119(this.aClass1_Sub1_Sub2_Sub2_3, local20, local27);
					}
				}
			}
			if (this.anInt296 != 0) {
				local20 = this.anInt296 * 4 + 2 - aClass1_Sub1_Sub1_Sub1_Sub2_1.anInt130 / 32;
				local27 = this.anInt297 * 4 + 2 - aClass1_Sub1_Sub1_Sub1_Sub2_1.anInt131 / 32;
				this.method207(this.aClass1_Sub1_Sub2_Sub2_2, local27, local20);
			}
			Class1_Sub1_Sub2.method458(3, 97, 78, 3, 16777215);
			this.aClass37_26.method538();
		} catch (@Pc(511) RuntimeException local511) {
			signlink.reporterror("39811, " + -892 + ", " + local511.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IILclient!mb;)V")
	private void method172(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub1_Sub3 arg1) {
		try {
			while (true) {
				if (arg1.anInt769 + 10 < arg0 * 8) {
					@Pc(15) int local15 = arg1.method509(11);
					if (local15 != 2047) {
						if (this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local15] == null) {
							this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local15] = new Class1_Sub1_Sub1_Sub1_Sub2();
							if (this.aClass1_Sub1_Sub3Array1[local15] != null) {
								this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local15].method51(this.aClass1_Sub1_Sub3Array1[local15], this.aBoolean77);
							}
						}
						this.anIntArray91[this.anInt420++] = local15;
						@Pc(62) Class1_Sub1_Sub1_Sub1_Sub2 local62 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local15];
						local62.anInt170 = anInt446;
						@Pc(70) int local70 = arg1.method509(5);
						if (local70 > 15) {
							local70 -= 32;
						}
						@Pc(79) int local79 = arg1.method509(5);
						if (local79 > 15) {
							local79 -= 32;
						}
						@Pc(88) int local88 = arg1.method509(1);
						local62.method46(aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray16[0] + local70, local88 == 1, aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray17[0] + local79);
						@Pc(114) int local114 = arg1.method509(1);
						if (local114 == 1) {
							this.anIntArray92[this.anInt421++] = local15;
						}
						continue;
					}
				}
				arg1.method510();
				return;
			}
		} catch (@Pc(135) RuntimeException local135) {
			signlink.reporterror("86557, " + 0 + ", " + arg0 + ", " + arg1 + ", " + local135.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(IILclient!mb;)V")
	private void method173(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub1_Sub3 arg1) {
		try {
			@Pc(16) int local16;
			@Pc(25) int local25;
			@Pc(32) int local32;
			@Pc(35) int local35;
			@Pc(39) int local39;
			@Pc(43) int local43;
			@Pc(48) int local48;
			@Pc(53) int local53;
			if (arg0 == 119 || arg0 == 198) {
				local16 = arg1.method498();
				local25 = this.anInt398 + (local16 >> 4 & 0x7);
				local32 = this.anInt399 + (local16 & 0x7);
				local35 = arg1.method498();
				local39 = local35 >> 2;
				local43 = local35 & 0x3;
				local48 = this.anIntArray42[local39];
				if (arg0 == 198) {
					local53 = -1;
				} else {
					local53 = arg1.method500();
				}
				if (local25 >= 0 && local32 >= 0 && local25 < 104 && local32 < 104) {
					this.method199(local32, this.anInt257, local48, -1, local53, local25, 0, local39, local43);
				}
			} else {
				@Pc(143) int local143;
				@Pc(155) int local155;
				@Pc(169) int local169;
				@Pc(181) int local181;
				if (arg0 == 71) {
					local16 = arg1.method498();
					local25 = this.anInt398 + (local16 >> 4 & 0x7);
					local32 = this.anInt399 + (local16 & 0x7);
					local35 = arg1.method498();
					local39 = local35 >> 2;
					local43 = local35 & 0x3;
					local48 = this.anIntArray42[local39];
					local53 = arg1.method500();
					if (local25 >= 0 && local32 >= 0 && local25 < 103 && local32 < 103) {
						local143 = this.anIntArrayArrayArray3[this.anInt257][local25][local32];
						local155 = this.anIntArrayArrayArray3[this.anInt257][local25 + 1][local32];
						local169 = this.anIntArrayArrayArray3[this.anInt257][local25 + 1][local32 + 1];
						local181 = this.anIntArrayArrayArray3[this.anInt257][local25][local32 + 1];
						if (local48 == 0) {
							@Pc(192) Class36 local192 = this.aClass39_1.method566(local32, this.anInt257, local25);
							if (local192 != null) {
								@Pc(201) int local201 = local192.anInt867 >> 14 & 0x7FFF;
								if (local39 == 2) {
									local192.aClass1_Sub1_Sub1_7 = new Class1_Sub1_Sub1_Sub2(local143, false, local181, local53, local155, this.anInt310, local169, local43 + 4, local201, 2);
									local192.aClass1_Sub1_Sub1_8 = new Class1_Sub1_Sub1_Sub2(local143, false, local181, local53, local155, this.anInt310, local169, local43 + 1 & 0x3, local201, 2);
								} else {
									local192.aClass1_Sub1_Sub1_7 = new Class1_Sub1_Sub1_Sub2(local143, false, local181, local53, local155, this.anInt310, local169, local43, local201, local39);
								}
							}
						}
						if (local48 == 1) {
							@Pc(272) Class16 local272 = this.aClass39_1.method567(local32, local25, this.anInt257);
							if (local272 != null) {
								local272.aClass1_Sub1_Sub1_1 = new Class1_Sub1_Sub1_Sub2(local143, false, local181, local53, local155, this.anInt310, local169, 0, local272.anInt637 >> 14 & 0x7FFF, 4);
							}
						}
						if (local48 == 2) {
							@Pc(307) Class33 local307 = this.aClass39_1.method568(local32, local25, this.anInt257);
							if (local39 == 11) {
								local39 = 10;
							}
							if (local307 != null) {
								local307.aClass1_Sub1_Sub1_6 = new Class1_Sub1_Sub1_Sub2(local143, false, local181, local53, local155, this.anInt310, local169, local43, local307.anInt854 >> 14 & 0x7FFF, local39);
							}
						}
						if (local48 == 3) {
							@Pc(347) Class20 local347 = this.aClass39_1.method569(local32, local25, this.anInt257);
							if (local347 != null) {
								local347.aClass1_Sub1_Sub1_2 = new Class1_Sub1_Sub1_Sub2(local143, false, local181, local53, local155, this.anInt310, local169, local43, local347.anInt694 >> 14 & 0x7FFF, 22);
							}
						}
					}
				} else {
					@Pc(413) Class1_Sub1_Sub1_Sub3 local413;
					if (arg0 == 94) {
						local16 = arg1.method498();
						local25 = this.anInt398 + (local16 >> 4 & 0x7);
						local32 = this.anInt399 + (local16 & 0x7);
						local35 = arg1.method500();
						local39 = arg1.method500();
						if (local25 >= 0 && local32 >= 0 && local25 < 104 && local32 < 104) {
							local413 = new Class1_Sub1_Sub1_Sub3();
							local413.anInt482 = local35;
							local413.anInt483 = local39;
							if (this.aClass31ArrayArrayArray1[this.anInt257][local25][local32] == null) {
								this.aClass31ArrayArrayArray1[this.anInt257][local25][local32] = new Class31(-767);
							}
							this.aClass31ArrayArrayArray1[this.anInt257][local25][local32].method520(local413);
							this.method162(local25, local32);
						}
					} else if (arg0 == 13) {
						local16 = arg1.method498();
						local25 = this.anInt398 + (local16 >> 4 & 0x7);
						local32 = this.anInt399 + (local16 & 0x7);
						local35 = arg1.method500();
						if (local25 >= 0 && local32 >= 0 && local25 < 104 && local32 < 104) {
							@Pc(503) Class31 local503 = this.aClass31ArrayArrayArray1[this.anInt257][local25][local32];
							if (local503 != null) {
								for (local413 = (Class1_Sub1_Sub1_Sub3) local503.method523(); local413 != null; local413 = (Class1_Sub1_Sub1_Sub3) local503.method525()) {
									if (local413.anInt482 == (local35 & 0x7FFF)) {
										local413.method669();
										break;
									}
								}
								if (local503.method523() == null) {
									this.aClass31ArrayArrayArray1[this.anInt257][local25][local32] = null;
								}
								this.method162(local25, local32);
							}
						}
					} else if (arg0 == 187) {
						local16 = arg1.method498();
						local25 = this.anInt398 + (local16 >> 4 & 0x7);
						local32 = this.anInt399 + (local16 & 0x7);
						local35 = local25 + arg1.method499();
						local39 = local32 + arg1.method499();
						local43 = arg1.method501();
						local48 = arg1.method500();
						local53 = arg1.method498() * 4;
						local143 = arg1.method498() * 4;
						local155 = arg1.method500();
						local169 = arg1.method500();
						local181 = arg1.method498();
						@Pc(606) int local606 = arg1.method498();
						if (local25 >= 0 && local32 >= 0 && local25 < 104 && local32 < 104 && local35 >= 0 && local39 >= 0 && local35 < 104 && local39 < 104) {
							local25 = local25 * 128 + 64;
							local32 = local32 * 128 + 64;
							local35 = local35 * 128 + 64;
							local39 = local39 * 128 + 64;
							@Pc(679) Class1_Sub1_Sub1_Sub4 local679 = new Class1_Sub1_Sub1_Sub4(local606, local32, local48, local169 + anInt446, local155 + anInt446, false, this.method151(local32, this.anInt257, local25, (byte) 6) - local53, local25, local143, local181, local43, this.anInt257);
							local679.method254(local155 + anInt446, local39, local35, this.method151(local39, this.anInt257, local35, (byte) 6) - local143);
							this.aClass31_3.method520(local679);
						}
					} else if (arg0 == 141) {
						local16 = arg1.method498();
						local25 = this.anInt398 + (local16 >> 4 & 0x7);
						local32 = this.anInt399 + (local16 & 0x7);
						local35 = arg1.method500();
						local39 = arg1.method498();
						local43 = arg1.method500();
						if (local25 >= 0 && local32 >= 0 && local25 < 104 && local32 < 104) {
							local25 = local25 * 128 + 64;
							local32 = local32 * 128 + 64;
							@Pc(775) Class1_Sub1_Sub1_Sub6 local775 = new Class1_Sub1_Sub1_Sub6(0, local32, local43, local35, local25, anInt446, this.method151(local32, this.anInt257, local25, (byte) 6) - local39, this.anInt257);
							this.aClass31_2.method520(local775);
						}
					} else if (arg0 == 190) {
						local16 = arg1.method498();
						local25 = this.anInt398 + (local16 >> 4 & 0x7);
						local32 = this.anInt399 + (local16 & 0x7);
						local35 = arg1.method500();
						local39 = arg1.method500();
						local43 = arg1.method500();
						if (local25 >= 0 && local32 >= 0 && local25 < 104 && local32 < 104 && local43 != this.anInt246) {
							@Pc(829) Class1_Sub1_Sub1_Sub3 local829 = new Class1_Sub1_Sub1_Sub3();
							local829.anInt482 = local35;
							local829.anInt483 = local39;
							if (this.aClass31ArrayArrayArray1[this.anInt257][local25][local32] == null) {
								this.aClass31ArrayArrayArray1[this.anInt257][local25][local32] = new Class31(-767);
							}
							this.aClass31ArrayArrayArray1[this.anInt257][local25][local32].method520(local829);
							this.method162(local25, local32);
						}
					} else {
						if (arg0 == 188) {
							local16 = arg1.method498();
							local25 = this.anInt398 + (local16 >> 4 & 0x7);
							local32 = this.anInt399 + (local16 & 0x7);
							local35 = arg1.method498();
							local39 = local35 >> 2;
							local43 = local35 & 0x3;
							local48 = this.anIntArray42[local39];
							local53 = arg1.method500();
							local143 = arg1.method500();
							local155 = arg1.method500();
							local169 = arg1.method500();
							@Pc(927) byte local927 = arg1.method499();
							@Pc(930) byte local930 = arg1.method499();
							@Pc(933) byte local933 = arg1.method499();
							@Pc(936) byte local936 = arg1.method499();
							@Pc(942) Class1_Sub1_Sub1_Sub1_Sub2 local942;
							if (local169 == this.anInt246) {
								local942 = aClass1_Sub1_Sub1_Sub1_Sub2_1;
							} else {
								local942 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local169];
							}
							if (local942 != null) {
								@Pc(954) Class9 local954 = Class9.method258(local53);
								@Pc(964) int local964 = this.anIntArrayArrayArray3[this.anInt257][local25][local32];
								@Pc(976) int local976 = this.anIntArrayArrayArray3[this.anInt257][local25 + 1][local32];
								@Pc(990) int local990 = this.anIntArrayArrayArray3[this.anInt257][local25 + 1][local32 + 1];
								@Pc(1002) int local1002 = this.anIntArrayArrayArray3[this.anInt257][local25][local32 + 1];
								@Pc(1012) Class1_Sub1_Sub1_Sub5 local1012 = local954.method264(local39, local43, local964, local976, local990, local1002, -1);
								if (local1012 != null) {
									this.method199(local32, this.anInt257, local48, local155 + 1, -1, local25, local143 + 1, 0, 0);
									local942.anInt182 = local143 + anInt446;
									local942.anInt183 = local155 + anInt446;
									local942.aClass1_Sub1_Sub1_Sub5_1 = local1012;
									@Pc(1047) int local1047 = local954.anInt515;
									@Pc(1050) int local1050 = local954.anInt516;
									if (local43 == 1 || local43 == 3) {
										local1047 = local954.anInt516;
										local1050 = local954.anInt515;
									}
									local942.anInt184 = local25 * 128 + local1047 * 64;
									local942.anInt186 = local32 * 128 + local1050 * 64;
									local942.anInt185 = this.method151(local942.anInt186, this.anInt257, local942.anInt184, (byte) 6);
									@Pc(1096) byte local1096;
									if (local927 > local933) {
										local1096 = local927;
										local927 = local933;
										local933 = local1096;
									}
									if (local930 > local936) {
										local1096 = local930;
										local930 = local936;
										local936 = local1096;
									}
									local942.anInt187 = local25 + local927;
									local942.anInt189 = local25 + local933;
									local942.anInt188 = local32 + local930;
									local942.anInt190 = local32 + local936;
								}
							}
						}
						if (arg0 == 151) {
							local16 = arg1.method498();
							local25 = this.anInt398 + (local16 >> 4 & 0x7);
							local32 = this.anInt399 + (local16 & 0x7);
							local35 = arg1.method500();
							local39 = arg1.method500();
							local43 = arg1.method500();
							if (local25 >= 0 && local32 >= 0 && local25 < 104 && local32 < 104) {
								@Pc(1180) Class31 local1180 = this.aClass31ArrayArrayArray1[this.anInt257][local25][local32];
								if (local1180 != null) {
									for (@Pc(1186) Class1_Sub1_Sub1_Sub3 local1186 = (Class1_Sub1_Sub1_Sub3) local1180.method523(); local1186 != null; local1186 = (Class1_Sub1_Sub1_Sub3) local1180.method525()) {
										if (local1186.anInt482 == (local35 & 0x7FFF) && local1186.anInt483 == local39) {
											local1186.anInt483 = local43;
											break;
										}
									}
									this.method162(local25, local32);
								}
							}
						}
					}
				}
			}
		} catch (@Pc(1216) RuntimeException local1216) {
			signlink.reporterror("71260, " + -47250 + ", " + arg0 + ", " + arg1 + ", " + local1216.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(BIIII)Z")
	private boolean method174(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		try {
			@Pc(7) int local7 = arg0 >> 14 & 0x7FFF;
			@Pc(16) int local16 = this.aClass39_1.method574(this.anInt257, arg3, arg2, arg0);
			if (local16 == -1) {
				return false;
			}
			@Pc(25) int local25 = local16 & 0x1F;
			@Pc(31) int local31 = local16 >> 6 & 0x3;
			if (local25 == 10 || local25 == 11 || local25 == 22) {
				@Pc(43) Class9 local43 = Class9.method258(local7);
				@Pc(51) int local51;
				@Pc(54) int local54;
				if (local31 == 0 || local31 == 2) {
					local51 = local43.anInt515;
					local54 = local43.anInt516;
				} else {
					local51 = local43.anInt516;
					local54 = local43.anInt515;
				}
				@Pc(65) int local65 = local43.anInt527;
				if (local31 != 0) {
					local65 = (local65 << local31 & 0xF) + (local65 >> 4 - local31);
				}
				this.method166(false, local51, 0, arg3, local65, 2, aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray16[0], 0, arg2, local54, aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray17[0]);
			} else {
				this.method166(false, 0, local25 + 1, arg3, 0, 2, aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray16[0], local31, arg2, 0, aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray17[0]);
			}
			this.anInt442 = super.anInt239;
			this.anInt443 = super.anInt240;
			this.anInt445 = 2;
			this.anInt444 = 0;
			this.aClass1_Sub1_Sub3_4.method487(arg1);
			this.aClass1_Sub1_Sub3_4.method489(arg3 + this.anInt312);
			this.aClass1_Sub1_Sub3_4.method489(arg2 + this.anInt313);
			this.aClass1_Sub1_Sub3_4.method489(local7);
			return true;
		} catch (@Pc(172) RuntimeException local172) {
			signlink.reporterror("7078, " + 5 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local172.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "l", descriptor = "(Z)V")
	private void method175() {
		try {
			while (true) {
				@Pc(10) int local10 = this.method89();
				if (local10 == -1) {
					return;
				}
				if (this.anInt278 != -1 && this.anInt278 == this.anInt332) {
					if (local10 == 8 && this.aString8.length() > 0) {
						this.aString8 = this.aString8.substring(0, this.aString8.length() - 1);
					}
					if ((local10 >= 97 && local10 <= 122 || local10 >= 65 && local10 <= 90 || local10 >= 48 && local10 <= 57 || local10 == 32) && this.aString8.length() < 12) {
						this.aString8 = this.aString8 + (char) local10;
					}
				} else {
					@Pc(190) int local190;
					if (this.aBoolean44) {
						if (local10 >= 32 && local10 <= 122 && this.aString11.length() < 80) {
							this.aString11 = this.aString11 + (char) local10;
							this.aBoolean52 = true;
						}
						if (local10 == 8 && this.aString11.length() > 0) {
							this.aString11 = this.aString11.substring(0, this.aString11.length() - 1);
							this.aBoolean52 = true;
						}
						if (local10 == 13 || local10 == 10) {
							this.aBoolean44 = false;
							this.aBoolean52 = true;
							@Pc(150) long local150;
							if (this.anInt374 == 1) {
								local150 = Class49.method679(this.aString11);
								this.method168(local150, (byte) 5);
							}
							if (this.anInt374 == 2 && this.anInt317 > 0) {
								local150 = Class49.method679(this.aString11);
								this.method203(local150);
							}
							if (this.anInt374 == 3 && this.aString11.length() > 0) {
								this.aClass1_Sub1_Sub3_4.method487(99);
								this.aClass1_Sub1_Sub3_4.method488(0);
								local190 = this.aClass1_Sub1_Sub3_4.anInt768;
								this.aClass1_Sub1_Sub3_4.method494(this.aLong18, this.anInt295);
								Class2.method41(this.aString11, this.aClass1_Sub1_Sub3_4, this.aByte4);
								this.aClass1_Sub1_Sub3_4.method497(this.aClass1_Sub1_Sub3_4.anInt768 - local190);
								this.aString11 = Class49.method684(this.aByte12, this.aString11);
								this.aString11 = Class41.method613(this.aString11);
								this.method211(6, Class49.method683(Class49.method680(this.aLong18)), this.aString11);
								if (this.anInt447 == 2) {
									this.anInt447 = 1;
									this.aBoolean83 = true;
									this.aClass1_Sub1_Sub3_4.method487(8);
									this.aClass1_Sub1_Sub3_4.method488(this.anInt364);
									this.aClass1_Sub1_Sub3_4.method488(this.anInt447);
									this.aClass1_Sub1_Sub3_4.method488(this.anInt306);
								}
							}
							if (this.anInt374 == 4 && this.anInt258 < 100) {
								local150 = Class49.method679(this.aString11);
								this.method126(local150);
							}
							if (this.anInt374 == 5 && this.anInt258 > 0) {
								local150 = Class49.method679(this.aString11);
								this.method152(local150);
							}
						}
					} else if (this.aBoolean62) {
						if (local10 >= 48 && local10 <= 57 && this.aString6.length() < 10) {
							this.aString6 = this.aString6 + (char) local10;
							this.aBoolean52 = true;
						}
						if (local10 == 8 && this.aString6.length() > 0) {
							this.aString6 = this.aString6.substring(0, this.aString6.length() - 1);
							this.aBoolean52 = true;
						}
						if (local10 == 13 || local10 == 10) {
							if (this.aString6.length() > 0) {
								local190 = 0;
								try {
									local190 = Integer.parseInt(this.aString6);
								} catch (@Pc(369) Exception local369) {
								}
								this.aClass1_Sub1_Sub3_4.method487(241);
								this.aClass1_Sub1_Sub3_4.method492(local190);
							}
							this.aBoolean62 = false;
							this.aBoolean52 = true;
						}
					} else if (this.anInt412 == -1) {
						if (local10 >= 32 && local10 <= 122 && this.aString14.length() < 80) {
							this.aString14 = this.aString14 + (char) local10;
							this.aBoolean52 = true;
						}
						if (local10 == 8 && this.aString14.length() > 0) {
							this.aString14 = this.aString14.substring(0, this.aString14.length() - 1);
							this.aBoolean52 = true;
						}
						if ((local10 == 13 || local10 == 10) && this.aString14.length() > 0) {
							if (this.anInt329 == 2) {
								if (this.aString14.equals("::clientdrop")) {
									this.method165();
								}
								if (this.aString14.equals("::lag")) {
									this.method98();
								}
								if (this.aString14.equals("::prefetchmusic")) {
									for (local190 = 0; local190 < this.aClass45_Sub1_1.method650(2); local190++) {
										this.aClass45_Sub1_1.method660((byte) 1, local190, 2);
									}
								}
							}
							if (this.aString14.startsWith("::")) {
								this.aClass1_Sub1_Sub3_4.method487(11);
								this.aClass1_Sub1_Sub3_4.method488(this.aString14.length() - 1);
								this.aClass1_Sub1_Sub3_4.method495(this.aString14.substring(2));
							} else {
								@Pc(520) byte local520 = 0;
								if (this.aString14.startsWith("yellow:")) {
									local520 = 0;
									this.aString14 = this.aString14.substring(7);
								}
								if (this.aString14.startsWith("red:")) {
									local520 = 1;
									this.aString14 = this.aString14.substring(4);
								}
								if (this.aString14.startsWith("green:")) {
									local520 = 2;
									this.aString14 = this.aString14.substring(6);
								}
								if (this.aString14.startsWith("cyan:")) {
									local520 = 3;
									this.aString14 = this.aString14.substring(5);
								}
								if (this.aString14.startsWith("purple:")) {
									local520 = 4;
									this.aString14 = this.aString14.substring(7);
								}
								if (this.aString14.startsWith("white:")) {
									local520 = 5;
									this.aString14 = this.aString14.substring(6);
								}
								if (this.aString14.startsWith("flash1:")) {
									local520 = 6;
									this.aString14 = this.aString14.substring(7);
								}
								if (this.aString14.startsWith("flash2:")) {
									local520 = 7;
									this.aString14 = this.aString14.substring(7);
								}
								if (this.aString14.startsWith("flash3:")) {
									local520 = 8;
									this.aString14 = this.aString14.substring(7);
								}
								if (this.aString14.startsWith("glow1:")) {
									local520 = 9;
									this.aString14 = this.aString14.substring(6);
								}
								if (this.aString14.startsWith("glow2:")) {
									local520 = 10;
									this.aString14 = this.aString14.substring(6);
								}
								if (this.aString14.startsWith("glow3:")) {
									local520 = 11;
									this.aString14 = this.aString14.substring(6);
								}
								@Pc(678) byte local678 = 0;
								if (this.aString14.startsWith("wave:")) {
									local678 = 1;
									this.aString14 = this.aString14.substring(5);
								}
								if (this.aString14.startsWith("scroll:")) {
									local678 = 2;
									this.aString14 = this.aString14.substring(7);
								}
								this.aClass1_Sub1_Sub3_4.method487(78);
								this.aClass1_Sub1_Sub3_4.method488(0);
								@Pc(717) int local717 = this.aClass1_Sub1_Sub3_4.anInt768;
								this.aClass1_Sub1_Sub3_4.method488(local520);
								this.aClass1_Sub1_Sub3_4.method488(local678);
								Class2.method41(this.aString14, this.aClass1_Sub1_Sub3_4, this.aByte4);
								this.aClass1_Sub1_Sub3_4.method497(this.aClass1_Sub1_Sub3_4.anInt768 - local717);
								this.aString14 = Class49.method684(this.aByte12, this.aString14);
								this.aString14 = Class41.method613(this.aString14);
								aClass1_Sub1_Sub1_Sub1_Sub2_1.aString3 = this.aString14;
								aClass1_Sub1_Sub1_Sub1_Sub2_1.anInt142 = local520;
								aClass1_Sub1_Sub1_Sub1_Sub2_1.anInt143 = local678;
								aClass1_Sub1_Sub1_Sub1_Sub2_1.anInt141 = 150;
								if (this.anInt329 == 2) {
									this.method211(2, "@cr2@" + aClass1_Sub1_Sub1_Sub1_Sub2_1.aString4, aClass1_Sub1_Sub1_Sub1_Sub2_1.aString3);
								} else if (this.anInt329 == 1) {
									this.method211(2, "@cr1@" + aClass1_Sub1_Sub1_Sub1_Sub2_1.aString4, aClass1_Sub1_Sub1_Sub1_Sub2_1.aString3);
								} else {
									this.method211(2, aClass1_Sub1_Sub1_Sub1_Sub2_1.aString4, aClass1_Sub1_Sub1_Sub1_Sub2_1.aString3);
								}
								if (this.anInt364 == 2) {
									this.anInt364 = 3;
									this.aBoolean83 = true;
									this.aClass1_Sub1_Sub3_4.method487(8);
									this.aClass1_Sub1_Sub3_4.method488(this.anInt364);
									this.aClass1_Sub1_Sub3_4.method488(this.anInt447);
									this.aClass1_Sub1_Sub3_4.method488(this.anInt306);
								}
							}
							this.aString14 = "";
							this.aBoolean52 = true;
						}
					}
				}
			}
		} catch (@Pc(855) RuntimeException local855) {
			signlink.reporterror("7911, " + false + ", " + local855.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(BI)V")
	private void method176(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(6) boolean local6 = false;
			if (!aBoolean48) {
				@Pc(21) Class1_Sub1_Sub2_Sub3 local21;
				@Pc(29) int local29;
				@Pc(37) int local37;
				@Pc(40) byte[] local40;
				@Pc(43) byte[] local43;
				@Pc(45) int local45;
				if (Class1_Sub1_Sub2_Sub1.anIntArray187[17] >= arg1) {
					local21 = Class1_Sub1_Sub2_Sub1.aClass1_Sub1_Sub2_Sub3Array5[17];
					local29 = local21.anInt709 * local21.anInt710 - 1;
					local37 = local21.anInt709 * this.anInt301 * 2;
					local40 = local21.aByteArray7;
					local43 = this.aByteArray2;
					for (local45 = 0; local45 <= local29; local45++) {
						local43[local45] = local40[local45 - local37 & local29];
					}
					local21.aByteArray7 = local43;
					this.aByteArray2 = local40;
					Class1_Sub1_Sub2_Sub1.method377(this.anInt298, 17);
				}
				if (Class1_Sub1_Sub2_Sub1.anIntArray187[24] >= arg1) {
					local21 = Class1_Sub1_Sub2_Sub1.aClass1_Sub1_Sub2_Sub3Array5[24];
					local29 = local21.anInt709 * local21.anInt710 - 1;
					local37 = local21.anInt709 * this.anInt301 * 2;
					local40 = local21.aByteArray7;
					local43 = this.aByteArray2;
					for (local45 = 0; local45 <= local29; local45++) {
						local43[local45] = local40[local45 - local37 & local29];
					}
					local21.aByteArray7 = local43;
					this.aByteArray2 = local40;
					Class1_Sub1_Sub2_Sub1.method377(this.anInt298, 24);
					return;
				}
			}
		} catch (@Pc(132) RuntimeException local132) {
			signlink.reporterror("27831, " + arg0 + ", " + arg1 + ", " + local132.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILclient!mb;I)V")
	private void method177(@OriginalArg(1) Class1_Sub1_Sub3 arg0, @OriginalArg(2) int arg1) {
		try {
			this.anInt305 = 0;
			this.anInt421 = 0;
			this.method181(arg1, arg0);
			this.method137(arg0, arg1);
			this.method206(arg1, arg0);
			@Pc(34) int local34;
			for (@Pc(27) int local27 = 0; local27 < this.anInt305; local27++) {
				local34 = this.anIntArray52[local27];
				if (this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local34].anInt170 != anInt446) {
					this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local34].aClass13_1 = null;
					this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local34] = null;
				}
			}
			if (arg0.anInt768 != arg1) {
				signlink.reporterror(this.aString17 + " size mismatch in getnpcpos - pos:" + arg0.anInt768 + " psize:" + arg1);
				throw new RuntimeException("eek");
			}
			for (local34 = 0; local34 < this.anInt389; local34++) {
				if (this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[this.anIntArray85[local34]] == null) {
					signlink.reporterror(this.aString17 + " null entry in npc list - pos:" + local34 + " size:" + this.anInt389);
					throw new RuntimeException("eek");
				}
			}
		} catch (@Pc(124) RuntimeException local124) {
			signlink.reporterror("6518, " + 435 + ", " + arg0 + ", " + arg1 + ", " + local124.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "v", descriptor = "(I)V")
	private void method178() {
		try {
			@Pc(17) int local17;
			@Pc(24) int local24;
			if (this.anInt333 == 0) {
				local17 = super.anInt229 / 2 - 80;
				local24 = super.anInt230 / 2 + 20;
				local24 += 20;
				if (super.anInt238 == 1 && super.anInt239 >= local17 - 75 && super.anInt239 <= local17 + 75 && super.anInt240 >= local24 - 20 && super.anInt240 <= local24 + 20) {
					this.anInt333 = 3;
					this.anInt375 = 0;
				}
				local17 = super.anInt229 / 2 + 80;
				if (super.anInt238 == 1 && super.anInt239 >= local17 - 75 && super.anInt239 <= local17 + 75 && super.anInt240 >= local24 - 20 && super.anInt240 <= local24 + 20) {
					this.aString9 = "";
					this.aString10 = "Enter your username & password.";
					this.anInt333 = 2;
					this.anInt375 = 0;
				}
			} else if (this.anInt333 == 2) {
				local17 = super.anInt230 / 2 - 40;
				local17 += 30;
				local17 += 25;
				if (super.anInt238 == 1 && super.anInt240 >= local17 - 15 && super.anInt240 < local17) {
					this.anInt375 = 0;
				}
				local17 += 15;
				if (super.anInt238 == 1 && super.anInt240 >= local17 - 15 && super.anInt240 < local17) {
					this.anInt375 = 1;
				}
				local17 += 15;
				local24 = super.anInt229 / 2 - 80;
				@Pc(170) int local170 = super.anInt230 / 2 + 50;
				@Pc(171) int local171 = local170 + 20;
				if (super.anInt238 == 1 && super.anInt239 >= local24 - 75 && super.anInt239 <= local24 + 75 && super.anInt240 >= local171 - 20 && super.anInt240 <= local171 + 20) {
					this.method107(this.aString17, this.aString18, false);
					if (this.aBoolean46) {
						return;
					}
				}
				local24 = super.anInt229 / 2 + 80;
				if (super.anInt238 == 1 && super.anInt239 >= local24 - 75 && super.anInt239 <= local24 + 75 && super.anInt240 >= local171 - 20 && super.anInt240 <= local171 + 20) {
					this.anInt333 = 0;
					this.aString17 = "";
					this.aString18 = "";
				}
				while (true) {
					while (true) {
						@Pc(258) int local258 = this.method89();
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
						if (this.anInt375 == 0) {
							if (local258 == 8 && this.aString17.length() > 0) {
								this.aString17 = this.aString17.substring(0, this.aString17.length() - 1);
							}
							if (local258 == 9 || local258 == 10 || local258 == 13) {
								this.anInt375 = 1;
							}
							if (local263) {
								this.aString17 = this.aString17 + (char) local258;
							}
							if (this.aString17.length() > 12) {
								this.aString17 = this.aString17.substring(0, 12);
							}
						} else if (this.anInt375 == 1) {
							if (local258 == 8 && this.aString18.length() > 0) {
								this.aString18 = this.aString18.substring(0, this.aString18.length() - 1);
							}
							if (local258 == 9 || local258 == 10 || local258 == 13) {
								this.anInt375 = 0;
							}
							if (local263) {
								this.aString18 = this.aString18 + (char) local258;
							}
							if (this.aString18.length() > 20) {
								this.aString18 = this.aString18.substring(0, 20);
							}
						}
					}
				}
			} else if (this.anInt333 == 3) {
				local17 = super.anInt229 / 2;
				local24 = super.anInt230 / 2 + 50;
				@Pc(422) int local422 = local24 + 20;
				if (super.anInt238 == 1 && super.anInt239 >= local17 - 75 && super.anInt239 <= local17 + 75 && super.anInt240 >= local422 - 20 && super.anInt240 <= local422 + 20) {
					this.anInt333 = 0;
					return;
				}
			}
		} catch (@Pc(455) RuntimeException local455) {
			signlink.reporterror("29946, " + 0 + ", " + local455.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IILclient!gc;II)V")
	private void method179(@OriginalArg(1) int arg0, @OriginalArg(2) Class13 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		try {
			if (this.anInt365 < 400) {
				@Pc(9) String local9 = arg1.aString25;
				this.anInt422 += 0;
				if (arg1.anInt581 != 0) {
					local9 = local9 + method154(arg1.anInt581, aClass1_Sub1_Sub1_Sub1_Sub2_1.anInt180) + " (level-" + arg1.anInt581 + ")";
				}
				if (this.anInt283 == 1) {
					this.aStringArray1[this.anInt365] = "Use " + this.aString7 + " with @yel@" + local9;
					this.anIntArray49[this.anInt365] = 900;
					this.anIntArray50[this.anInt365] = arg3;
					this.anIntArray47[this.anInt365] = arg2;
					this.anIntArray48[this.anInt365] = arg0;
					this.anInt365++;
				} else if (this.anInt394 != 1) {
					@Pc(153) int local153;
					if (arg1.aStringArray8 != null) {
						for (local153 = 4; local153 >= 0; local153--) {
							if (arg1.aStringArray8[local153] != null && !arg1.aStringArray8[local153].equalsIgnoreCase("attack")) {
								this.aStringArray1[this.anInt365] = arg1.aStringArray8[local153] + " @yel@" + local9;
								if (local153 == 0) {
									this.anIntArray49[this.anInt365] = 728;
								}
								if (local153 == 1) {
									this.anIntArray49[this.anInt365] = 542;
								}
								if (local153 == 2) {
									this.anIntArray49[this.anInt365] = 6;
								}
								if (local153 == 3) {
									this.anIntArray49[this.anInt365] = 963;
								}
								if (local153 == 4) {
									this.anIntArray49[this.anInt365] = 245;
								}
								this.anIntArray50[this.anInt365] = arg3;
								this.anIntArray47[this.anInt365] = arg2;
								this.anIntArray48[this.anInt365] = arg0;
								this.anInt365++;
							}
						}
					}
					if (arg1.aStringArray8 != null) {
						for (local153 = 4; local153 >= 0; local153--) {
							if (arg1.aStringArray8[local153] != null && arg1.aStringArray8[local153].equalsIgnoreCase("attack")) {
								@Pc(277) short local277 = 0;
								if (arg1.anInt581 > aClass1_Sub1_Sub1_Sub1_Sub2_1.anInt180) {
									local277 = 2000;
								}
								this.aStringArray1[this.anInt365] = arg1.aStringArray8[local153] + " @yel@" + local9;
								if (local153 == 0) {
									this.anIntArray49[this.anInt365] = local277 + 728;
								}
								if (local153 == 1) {
									this.anIntArray49[this.anInt365] = local277 + 542;
								}
								if (local153 == 2) {
									this.anIntArray49[this.anInt365] = local277 + 6;
								}
								if (local153 == 3) {
									this.anIntArray49[this.anInt365] = local277 + 963;
								}
								if (local153 == 4) {
									this.anIntArray49[this.anInt365] = local277 + 245;
								}
								this.anIntArray50[this.anInt365] = arg3;
								this.anIntArray47[this.anInt365] = arg2;
								this.anIntArray48[this.anInt365] = arg0;
								this.anInt365++;
							}
						}
					}
					this.aStringArray1[this.anInt365] = "Examine @yel@" + local9;
					this.anIntArray49[this.anInt365] = 1607;
					this.anIntArray50[this.anInt365] = arg3;
					this.anIntArray47[this.anInt365] = arg2;
					this.anIntArray48[this.anInt365] = arg0;
					this.anInt365++;
				} else if ((this.anInt396 & 0x2) == 2) {
					this.aStringArray1[this.anInt365] = this.aString16 + " @yel@" + local9;
					this.anIntArray49[this.anInt365] = 265;
					this.anIntArray50[this.anInt365] = arg3;
					this.anIntArray47[this.anInt365] = arg2;
					this.anIntArray48[this.anInt365] = arg0;
					this.anInt365++;
					return;
				}
			}
		} catch (@Pc(427) RuntimeException local427) {
			signlink.reporterror("59403, " + 0 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local427.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IZI)V")
	private void method180(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2) {
		try {
			@Pc(1) int local1 = 0;
			if (arg1) {
				this.method90();
			}
			for (@Pc(7) int local7 = 0; local7 < 100; local7++) {
				if (this.aStringArray3[local7] != null) {
					@Pc(19) int local19 = this.anIntArray39[local7];
					@Pc(30) int local30 = this.anInt354 + 70 + 4 - local1 * 14;
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
					if ((local19 == 1 || local19 == 2) && (local19 == 1 || this.anInt364 == 0 || this.anInt364 == 1 && this.method226(local38, this.aByte6))) {
						if (arg0 > local30 - 14 && arg0 <= local30 && !local38.equals(aClass1_Sub1_Sub1_Sub1_Sub2_1.aString4)) {
							if (this.anInt329 >= 1) {
								this.aStringArray1[this.anInt365] = "Report abuse @whi@" + local38;
								this.anIntArray49[this.anInt365] = 34;
								this.anInt365++;
							}
							this.aStringArray1[this.anInt365] = "Add ignore @whi@" + local38;
							this.anIntArray49[this.anInt365] = 436;
							this.anInt365++;
							this.aStringArray1[this.anInt365] = "Add friend @whi@" + local38;
							this.anIntArray49[this.anInt365] = 406;
							this.anInt365++;
						}
						local1++;
					}
					if ((local19 == 3 || local19 == 7) && this.anInt390 == 0 && (local19 == 7 || this.anInt447 == 0 || this.anInt447 == 1 && this.method226(local38, this.aByte6))) {
						if (arg0 > local30 - 14 && arg0 <= local30) {
							if (this.anInt329 >= 1) {
								this.aStringArray1[this.anInt365] = "Report abuse @whi@" + local38;
								this.anIntArray49[this.anInt365] = 34;
								this.anInt365++;
							}
							this.aStringArray1[this.anInt365] = "Add ignore @whi@" + local38;
							this.anIntArray49[this.anInt365] = 436;
							this.anInt365++;
							this.aStringArray1[this.anInt365] = "Add friend @whi@" + local38;
							this.anIntArray49[this.anInt365] = 406;
							this.anInt365++;
						}
						local1++;
					}
					if (local19 == 4 && (this.anInt306 == 0 || this.anInt306 == 1 && this.method226(local38, this.aByte6))) {
						if (arg0 > local30 - 14 && arg0 <= local30) {
							this.aStringArray1[this.anInt365] = "Accept trade @whi@" + local38;
							this.anIntArray49[this.anInt365] = 903;
							this.anInt365++;
						}
						local1++;
					}
					if ((local19 == 5 || local19 == 6) && this.anInt390 == 0 && this.anInt447 < 2) {
						local1++;
					}
					if (local19 == 8 && (this.anInt306 == 0 || this.anInt306 == 1 && this.method226(local38, this.aByte6))) {
						if (arg0 > local30 - 14 && arg0 <= local30) {
							this.aStringArray1[this.anInt365] = "Accept duel @whi@" + local38;
							this.anIntArray49[this.anInt365] = 363;
							this.anInt365++;
						}
						local1++;
					}
				}
			}
		} catch (@Pc(407) RuntimeException local407) {
			signlink.reporterror("47002, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local407.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILjava/lang/String;I)V")
	@Override
	protected void method97(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2) {
		try {
			this.anInt339 = arg2;
			this.aString5 = arg1;
			this.method160();
			if (this.aClass48_1 == null) {
				super.method97(638, arg1, arg2);
			} else {
				this.aClass37_14.method538();
				this.aClass1_Sub1_Sub2_Sub4_3.method465("RuneScape is loading - please wait...", 16777215, 54, 180);
				Class1_Sub1_Sub2.method459(anInt336, 34, 62, 304, 9179409, 28);
				Class1_Sub1_Sub2.method459(anInt336, 32, 63, 302, 0, 29);
				Class1_Sub1_Sub2.method458(arg2 * 3, 30, 64, 30, 9179409);
				@Pc(94) boolean local94 = false;
				Class1_Sub1_Sub2.method458(300 - arg2 * 3, arg2 * 3 + 30, 64, 30, 0);
				this.aClass1_Sub1_Sub2_Sub4_3.method465(arg1, 16777215, 85, 180);
				this.aClass37_14.method539(171, super.aGraphics2, 202);
				if (this.aBoolean86) {
					this.aBoolean86 = false;
					if (!this.aBoolean59) {
						this.aClass37_15.method539(0, super.aGraphics2, 0);
						this.aClass37_16.method539(0, super.aGraphics2, 637);
					}
					this.aClass37_12.method539(0, super.aGraphics2, 128);
					this.aClass37_13.method539(371, super.aGraphics2, 202);
					this.aClass37_17.method539(265, super.aGraphics2, 0);
					this.aClass37_18.method539(265, super.aGraphics2, 562);
					this.aClass37_19.method539(171, super.aGraphics2, 128);
					this.aClass37_20.method539(171, super.aGraphics2, 562);
				}
			}
		} catch (@Pc(214) RuntimeException local214) {
			signlink.reporterror("38525, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local214.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(IILclient!mb;)V")
	private void method181(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub1_Sub3 arg1) {
		try {
			arg1.method508();
			@Pc(20) int local20 = arg1.method509(8);
			@Pc(26) int local26;
			if (local20 < this.anInt389) {
				for (local26 = local20; local26 < this.anInt389; local26++) {
					this.anIntArray52[this.anInt305++] = this.anIntArray85[local26];
				}
			}
			if (local20 > this.anInt389) {
				signlink.reporterror(this.aString17 + " Too many npcs");
				throw new RuntimeException("eek");
			}
			this.anInt389 = 0;
			for (local26 = 0; local26 < local20; local26++) {
				@Pc(78) int local78 = this.anIntArray85[local26];
				@Pc(83) Class1_Sub1_Sub1_Sub1_Sub1 local83 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local78];
				@Pc(88) int local88 = arg1.method509(1);
				if (local88 == 0) {
					this.anIntArray85[this.anInt389++] = local78;
					local83.anInt170 = anInt446;
				} else {
					@Pc(111) int local111 = arg1.method509(2);
					if (local111 == 0) {
						this.anIntArray85[this.anInt389++] = local78;
						local83.anInt170 = anInt446;
						this.anIntArray92[this.anInt421++] = local78;
					} else {
						@Pc(162) int local162;
						@Pc(172) int local172;
						if (local111 == 1) {
							this.anIntArray85[this.anInt389++] = local78;
							local83.anInt170 = anInt446;
							local162 = arg1.method509(3);
							local83.method47(local162, false);
							local172 = arg1.method509(1);
							if (local172 == 1) {
								this.anIntArray92[this.anInt421++] = local78;
							}
						} else if (local111 == 2) {
							this.anIntArray85[this.anInt389++] = local78;
							local83.anInt170 = anInt446;
							local162 = arg1.method509(3);
							local83.method47(local162, true);
							local172 = arg1.method509(3);
							local83.method47(local172, true);
							@Pc(230) int local230 = arg1.method509(1);
							if (local230 == 1) {
								this.anIntArray92[this.anInt421++] = local78;
							}
						} else if (local111 == 3) {
							this.anIntArray52[this.anInt305++] = local78;
						}
					}
				}
			}
		} catch (@Pc(267) RuntimeException local267) {
			signlink.reporterror("21365, " + 0 + ", " + arg0 + ", " + arg1 + ", " + local267.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "q", descriptor = "(B)V")
	private void method182() {
		try {
			this.aClass37_24.method538();
			Class1_Sub1_Sub2_Sub1.anIntArray185 = this.anIntArray81;
			this.aClass1_Sub1_Sub2_Sub3_11.method445(0, 0);
			if (this.anInt343 != -1) {
				this.method170(Class6.aClass6Array1[this.anInt343], 0, 0, 0);
			} else if (this.anIntArray65[this.anInt263] != -1) {
				this.method170(Class6.aClass6Array1[this.anIntArray65[this.anInt263]], 0, 0, 0);
			}
			if (this.aBoolean61 && this.anInt366 == 1) {
				this.method142();
			}
			this.aClass37_24.method539(205, super.aGraphics2, 553);
			this.aClass37_26.method538();
			Class1_Sub1_Sub2_Sub1.anIntArray185 = this.anIntArray82;
		} catch (@Pc(79) RuntimeException local79) {
			signlink.reporterror("7357, " + -103 + ", " + local79.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "h", descriptor = "(II)V")
	private void method184(@OriginalArg(1) int arg0) {
		try {
			@Pc(5) int[] local5 = this.aClass1_Sub1_Sub2_Sub2_4.anIntArray210;
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
						this.aClass39_1.method579(local5, local34, arg0, local36, local22);
					}
					if (arg0 < 3 && (this.aByteArrayArrayArray7[arg0 + 1][local36][local22] & 0x8) != 0) {
						this.aClass39_1.method579(local5, local34, arg0 + 1, local36, local22);
					}
					local34 += 4;
				}
			}
			local34 = ((int) (Math.random() * 20.0D) + 238 - 10 << 16) + ((int) (Math.random() * 20.0D) + 238 - 10 << 8) + (int) (Math.random() * 20.0D) + 238 - 10;
			local36 = (int) (Math.random() * 20.0D) + 238 - 10 << 16;
			this.aClass1_Sub1_Sub2_Sub2_4.method401();
			@Pc(146) int local146;
			for (@Pc(142) int local142 = 1; local142 < 103; local142++) {
				for (local146 = 1; local146 < 103; local146++) {
					if ((this.aByteArrayArrayArray7[arg0][local146][local142] & 0x18) == 0) {
						this.method229(local34, local36, arg0, local142, local146);
					}
					if (arg0 < 3 && (this.aByteArrayArrayArray7[arg0 + 1][local146][local142] & 0x8) != 0) {
						this.method229(local34, local36, arg0 + 1, local142, local146);
					}
				}
			}
			this.aClass37_26.method538();
			this.anInt341 = 0;
			for (local146 = 0; local146 < 104; local146++) {
				for (@Pc(218) int local218 = 0; local218 < 104; local218++) {
					@Pc(228) int local228 = this.aClass39_1.method573(this.anInt257, local146, local218);
					if (local228 != 0) {
						local228 = local228 >> 14 & 0x7FFF;
						@Pc(240) int local240 = Class9.method258(local228).anInt519;
						if (local240 >= 0) {
							@Pc(244) int local244 = local146;
							@Pc(246) int local246 = local218;
							if (local240 != 22 && local240 != 29 && local240 != 34 && local240 != 36 && local240 != 46 && local240 != 47 && local240 != 48) {
								@Pc(278) int[][] local278 = this.aClass19Array1[this.anInt257].anIntArrayArray17;
								for (@Pc(280) int local280 = 0; local280 < 10; local280++) {
									@Pc(287) int local287 = (int) (Math.random() * 4.0D);
									if (local287 == 0 && local244 > 0 && local244 > local146 - 3 && (local278[local244 - 1][local246] & 0x280108) == 0) {
										local244--;
									}
									if (local287 == 1 && local244 < 103 && local244 < local146 + 3 && (local278[local244 + 1][local246] & 0x280180) == 0) {
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
							this.aClass1_Sub1_Sub2_Sub2Array6[this.anInt341] = this.aClass1_Sub1_Sub2_Sub2Array4[local240];
							this.anIntArray66[this.anInt341] = local244;
							this.anIntArray67[this.anInt341] = local246;
							this.anInt341++;
						}
					}
				}
			}
		} catch (@Pc(417) RuntimeException local417) {
			signlink.reporterror("26208, " + 39649 + ", " + arg0 + ", " + local417.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(B)V")
	@Override
	protected void method92() {
		try {
			signlink.reporterror = false;
			try {
				if (this.aClass8_1 != null) {
					this.aClass8_1.method244();
				}
			} catch (@Pc(11) Exception local11) {
			}
			this.aClass8_1 = null;
			this.method102();
			if (this.aClass11_1 != null) {
				this.aClass11_1.aBoolean132 = false;
			}
			this.aClass11_1 = null;
			this.aClass45_Sub1_1.method649();
			this.aClass45_Sub1_1 = null;
			this.aClass1_Sub1_Sub3_4 = null;
			this.aClass1_Sub1_Sub3_2 = null;
			this.aClass1_Sub1_Sub3_3 = null;
			this.anIntArray54 = null;
			this.aByteArrayArray2 = null;
			this.aByteArrayArray1 = null;
			this.anIntArray55 = null;
			this.anIntArray56 = null;
			this.anIntArrayArrayArray3 = null;
			this.aByteArrayArrayArray7 = null;
			this.aClass39_1 = null;
			this.aClass19Array1 = null;
			this.anIntArrayArray4 = null;
			this.anIntArrayArray5 = null;
			this.anIntArray34 = null;
			this.anIntArray35 = null;
			this.aByteArray2 = null;
			this.aClass37_24 = null;
			this.aClass37_25 = null;
			this.aClass37_26 = null;
			this.aClass37_27 = null;
			this.aClass37_21 = null;
			this.aClass37_22 = null;
			this.aClass37_23 = null;
			this.aClass37_3 = null;
			this.aClass37_4 = null;
			this.aClass37_5 = null;
			this.aClass37_6 = null;
			this.aClass37_7 = null;
			this.aClass37_8 = null;
			this.aClass37_9 = null;
			this.aClass37_10 = null;
			this.aClass37_11 = null;
			this.aClass1_Sub1_Sub2_Sub3_11 = null;
			this.aClass1_Sub1_Sub2_Sub3_12 = null;
			this.aClass1_Sub1_Sub2_Sub3_13 = null;
			this.aClass1_Sub1_Sub2_Sub3_6 = null;
			this.aClass1_Sub1_Sub2_Sub3_7 = null;
			this.aClass1_Sub1_Sub2_Sub3_8 = null;
			this.aClass1_Sub1_Sub2_Sub3Array2 = null;
			this.aClass1_Sub1_Sub2_Sub3_14 = null;
			this.aClass1_Sub1_Sub2_Sub3_15 = null;
			this.aClass1_Sub1_Sub2_Sub3_16 = null;
			this.aClass1_Sub1_Sub2_Sub3_17 = null;
			this.aClass1_Sub1_Sub2_Sub3_18 = null;
			this.aClass1_Sub1_Sub2_Sub3_1 = null;
			this.aClass1_Sub1_Sub2_Sub3_2 = null;
			this.aClass1_Sub1_Sub2_Sub3_3 = null;
			this.aClass1_Sub1_Sub2_Sub3_4 = null;
			this.aClass1_Sub1_Sub2_Sub3_5 = null;
			this.aClass1_Sub1_Sub2_Sub2_9 = null;
			this.aClass1_Sub1_Sub2_Sub2Array7 = null;
			this.aClass1_Sub1_Sub2_Sub2Array5 = null;
			this.aClass1_Sub1_Sub2_Sub2Array3 = null;
			this.aClass1_Sub1_Sub2_Sub2_10 = null;
			this.aClass1_Sub1_Sub2_Sub2_11 = null;
			this.aClass1_Sub1_Sub2_Sub2_12 = null;
			this.aClass1_Sub1_Sub2_Sub2_13 = null;
			this.aClass1_Sub1_Sub2_Sub3Array3 = null;
			this.aClass1_Sub1_Sub2_Sub2Array4 = null;
			this.anIntArrayArray2 = null;
			this.aClass1_Sub1_Sub1_Sub1_Sub2Array1 = null;
			this.anIntArray91 = null;
			this.anIntArray92 = null;
			this.aClass1_Sub1_Sub3Array1 = null;
			this.anIntArray52 = null;
			this.aClass1_Sub1_Sub1_Sub1_Sub1Array1 = null;
			this.anIntArray85 = null;
			this.aClass31ArrayArrayArray1 = null;
			this.aClass31_1 = null;
			this.aClass31_3 = null;
			this.aClass31_2 = null;
			this.anIntArray47 = null;
			this.anIntArray48 = null;
			this.anIntArray49 = null;
			this.anIntArray50 = null;
			this.aStringArray1 = null;
			this.anIntArray71 = null;
			this.anIntArray66 = null;
			this.anIntArray67 = null;
			this.aClass1_Sub1_Sub2_Sub2Array6 = null;
			this.aClass1_Sub1_Sub2_Sub2_4 = null;
			this.aStringArray4 = null;
			this.aLongArray4 = null;
			this.anIntArray89 = null;
			this.aClass37_15 = null;
			this.aClass37_16 = null;
			this.aClass37_12 = null;
			this.aClass37_13 = null;
			this.aClass37_14 = null;
			this.aClass37_17 = null;
			this.aClass37_18 = null;
			this.aClass37_19 = null;
			this.aClass37_20 = null;
			this.method212(366);
			Class9.method257();
			Class13.method319();
			Class15.method344();
			Class21.aClass21Array1 = null;
			Class23.aClass23Array1 = null;
			Class6.aClass6Array1 = null;
			Class25.aClass25Array1 = null;
			Class27.aClass27Array1 = null;
			Class32.aClass32Array1 = null;
			Class32.aClass42_9 = null;
			Class38.aClass38Array1 = null;
			super.aClass37_2 = null;
			Class1_Sub1_Sub1_Sub1_Sub2.aClass42_1 = null;
			Class1_Sub1_Sub2_Sub1.method370();
			Class39.method543();
			Class1_Sub1_Sub1_Sub5.method284();
			Class14.method326();
			System.gc();
		} catch (@Pc(370) RuntimeException local370) {
			signlink.reporterror("32339, " + 24 + ", " + local370.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "w", descriptor = "(I)V")
	private void method185() {
		try {
			this.anInt318 = 0;
			@Pc(53) int local53;
			@Pc(73) int local73;
			for (@Pc(6) int local6 = -1; local6 < this.anInt420 + this.anInt389; local6++) {
				@Pc(13) Class1_Sub1_Sub1_Sub1 local13;
				if (local6 == -1) {
					local13 = aClass1_Sub1_Sub1_Sub1_Sub2_1;
				} else if (local6 < this.anInt420) {
					local13 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[this.anIntArray91[local6]];
				} else {
					local13 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[this.anIntArray85[local6 - this.anInt420]];
				}
				if (local13 != null && local13.method49()) {
					if (local6 >= this.anInt420) {
						@Pc(146) Class13 local146 = ((Class1_Sub1_Sub1_Sub1_Sub1) local13).aClass13_1;
						if (local146.anInt586 >= 0 && local146.anInt586 < this.aClass1_Sub1_Sub2_Sub2Array5.length) {
							this.method223(local13, local13.anInt171 + 15);
							if (this.anInt347 > -1) {
								this.aClass1_Sub1_Sub2_Sub2Array5[local146.anInt586].method406(this.anInt348 - 30, this.anInt347 - 12);
							}
						}
						if (this.anInt408 == 1 && this.anInt247 == this.anIntArray85[local6 - this.anInt420] && anInt446 % 20 < 10) {
							this.method223(local13, local13.anInt171 + 15);
							if (this.anInt347 > -1) {
								this.aClass1_Sub1_Sub2_Sub2Array5[2].method406(this.anInt348 - 28, this.anInt347 - 12);
							}
						}
					} else {
						local53 = 30;
						@Pc(56) Class1_Sub1_Sub1_Sub1_Sub2 local56 = (Class1_Sub1_Sub1_Sub1_Sub2) local13;
						if (local56.anInt179 != 0) {
							this.method223(local13, local13.anInt171 + 15);
							if (this.anInt347 > -1) {
								for (local73 = 0; local73 < 8; local73++) {
									if ((local56.anInt179 & 0x1 << local73) != 0) {
										this.aClass1_Sub1_Sub2_Sub2Array5[local73].method406(this.anInt348 - local53, this.anInt347 - 12);
										local53 -= 25;
									}
								}
							}
						}
						if (local6 >= 0 && this.anInt408 == 10 && this.anInt428 == this.anIntArray91[local6]) {
							this.method223(local13, local13.anInt171 + 15);
							if (this.anInt347 > -1) {
								this.aClass1_Sub1_Sub2_Sub2Array5[7].method406(this.anInt348 - local53, this.anInt347 - 12);
							}
						}
					}
					if (local13.aString3 != null && (local6 >= this.anInt420 || this.anInt364 == 0 || this.anInt364 == 3 || this.anInt364 == 1 && this.method226(((Class1_Sub1_Sub1_Sub1_Sub2) local13).aString4, this.aByte6))) {
						this.method223(local13, local13.anInt171);
						if (this.anInt347 > -1 && this.anInt318 < this.anInt319) {
							this.anIntArray60[this.anInt318] = this.aClass1_Sub1_Sub2_Sub4_3.method467(local13.aString3) / 2;
							this.anIntArray59[this.anInt318] = this.aClass1_Sub1_Sub2_Sub4_3.anInt745;
							this.anIntArray57[this.anInt318] = this.anInt347;
							this.anIntArray58[this.anInt318] = this.anInt348;
							this.anIntArray61[this.anInt318] = local13.anInt142;
							this.anIntArray62[this.anInt318] = local13.anInt143;
							this.anIntArray63[this.anInt318] = local13.anInt141;
							this.aStringArray5[this.anInt318++] = local13.aString3;
							if (this.anInt397 == 0 && local13.anInt143 == 1) {
								this.anIntArray59[this.anInt318] += 10;
								this.anIntArray58[this.anInt318] += 5;
							}
							if (this.anInt397 == 0 && local13.anInt143 == 2) {
								this.anIntArray60[this.anInt318] = 60;
							}
						}
					}
					if (local13.anInt144 > anInt446) {
						this.method223(local13, local13.anInt171 + 15);
						if (this.anInt347 > -1) {
							local53 = local13.anInt145 * 30 / local13.anInt146;
							if (local53 > 30) {
								local53 = 30;
							}
							Class1_Sub1_Sub2.method458(local53, this.anInt347 - 15, this.anInt348 - 3, 5, 65280);
							Class1_Sub1_Sub2.method458(30 - local53, this.anInt347 - 15 + local53, this.anInt348 - 3, 5, 16711680);
						}
					}
					for (local53 = 0; local53 < 4; local53++) {
						if (local13.anIntArray15[local53] > anInt446) {
							this.method223(local13, local13.anInt171 / 2);
							if (this.anInt347 > -1) {
								if (local53 == 1) {
									this.anInt348 -= 20;
								}
								if (local53 == 2) {
									this.anInt347 -= 15;
									this.anInt348 -= 10;
								}
								if (local53 == 3) {
									this.anInt347 += 15;
									this.anInt348 -= 10;
								}
								this.aClass1_Sub1_Sub2_Sub2Array7[local13.anIntArray14[local53]].method406(this.anInt348 - 12, this.anInt347 - 12);
								this.aClass1_Sub1_Sub2_Sub4_1.method465(String.valueOf(local13.anIntArray13[local53]), 0, this.anInt348 + 4, this.anInt347);
								this.aClass1_Sub1_Sub2_Sub4_1.method465(String.valueOf(local13.anIntArray13[local53]), 16777215, this.anInt348 + 3, this.anInt347 - 1);
							}
						}
					}
				}
			}
			this.anInt422 += 0;
			for (@Pc(565) int local565 = 0; local565 < this.anInt318; local565++) {
				local53 = this.anIntArray57[local565];
				@Pc(577) int local577 = this.anIntArray58[local565];
				local73 = this.anIntArray60[local565];
				@Pc(587) int local587 = this.anIntArray59[local565];
				@Pc(589) boolean local589 = true;
				while (local589) {
					local589 = false;
					for (@Pc(595) int local595 = 0; local595 < local565; local595++) {
						if (local577 + 2 > this.anIntArray58[local595] - this.anIntArray59[local595] && local577 - local587 < this.anIntArray58[local595] + 2 && local53 - local73 < this.anIntArray57[local595] + this.anIntArray60[local595] && local53 + local73 > this.anIntArray57[local595] - this.anIntArray60[local595] && this.anIntArray58[local595] - this.anIntArray59[local595] < local577) {
							local577 = this.anIntArray58[local595] - this.anIntArray59[local595];
							local589 = true;
						}
					}
				}
				this.anInt347 = this.anIntArray57[local565];
				this.anInt348 = this.anIntArray58[local565] = local577;
				@Pc(694) String local694 = this.aStringArray5[local565];
				if (this.anInt397 == 0) {
					@Pc(699) int local699 = 16776960;
					if (this.anIntArray61[local565] < 6) {
						local699 = this.anIntArray69[this.anIntArray61[local565]];
					}
					if (this.anIntArray61[local565] == 6) {
						local699 = this.anInt303 % 20 < 10 ? 16711680 : 16776960;
					}
					if (this.anIntArray61[local565] == 7) {
						local699 = this.anInt303 % 20 < 10 ? 255 : 65535;
					}
					if (this.anIntArray61[local565] == 8) {
						local699 = this.anInt303 % 20 < 10 ? 45056 : 8454016;
					}
					@Pc(774) int local774;
					if (this.anIntArray61[local565] == 9) {
						local774 = 150 - this.anIntArray63[local565];
						if (local774 < 50) {
							local699 = local774 * 1280 + 16711680;
						} else if (local774 < 100) {
							local699 = 16776960 - (local774 - 50) * 327680;
						} else if (local774 < 150) {
							local699 = (local774 - 100) * 5 + 65280;
						}
					}
					if (this.anIntArray61[local565] == 10) {
						local774 = 150 - this.anIntArray63[local565];
						if (local774 < 50) {
							local699 = local774 * 5 + 16711680;
						} else if (local774 < 100) {
							local699 = 16711935 - (local774 - 50) * 327680;
						} else if (local774 < 150) {
							local699 = (local774 - 100) * 327680 + 255 - (local774 - 100) * 5;
						}
					}
					if (this.anIntArray61[local565] == 11) {
						local774 = 150 - this.anIntArray63[local565];
						if (local774 < 50) {
							local699 = 16777215 - local774 * 327685;
						} else if (local774 < 100) {
							local699 = (local774 - 50) * 327685 + 65280;
						} else if (local774 < 150) {
							local699 = 16777215 - (local774 - 100) * 327680;
						}
					}
					if (this.anIntArray62[local565] == 0) {
						this.aClass1_Sub1_Sub2_Sub4_3.method465(local694, 0, this.anInt348 + 1, this.anInt347);
						this.aClass1_Sub1_Sub2_Sub4_3.method465(local694, local699, this.anInt348, this.anInt347);
					}
					if (this.anIntArray62[local565] == 1) {
						this.aClass1_Sub1_Sub2_Sub4_3.method469(this.anInt347, local694, 0, this.anInt303, this.anInt348 + 1);
						this.aClass1_Sub1_Sub2_Sub4_3.method469(this.anInt347, local694, local699, this.anInt303, this.anInt348);
					}
					if (this.anIntArray62[local565] == 2) {
						local774 = this.aClass1_Sub1_Sub2_Sub4_3.method467(local694);
						@Pc(995) int local995 = (150 - this.anIntArray63[local565]) * (local774 + 100) / 150;
						Class1_Sub1_Sub2.method455(this.anInt347 - 50, this.anInt347 + 50, 334, 0, this.aBoolean79);
						this.aClass1_Sub1_Sub2_Sub4_3.method468(this.anInt348 + 1, this.anInt347 + 50 - local995, local694, 0);
						this.aClass1_Sub1_Sub2_Sub4_3.method468(this.anInt348, this.anInt347 + 50 - local995, local694, local699);
						Class1_Sub1_Sub2.method454();
					}
				} else {
					this.aClass1_Sub1_Sub2_Sub4_3.method465(local694, 0, this.anInt348 + 1, this.anInt347);
					this.aClass1_Sub1_Sub2_Sub4_3.method465(local694, 16776960, this.anInt348, this.anInt347);
				}
			}
		} catch (@Pc(1071) RuntimeException local1071) {
			signlink.reporterror("77044, " + 0 + ", " + local1071.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "m", descriptor = "(Z)V")
	private void method186() {
		try {
			for (@Pc(1) int local1 = 0; local1 < this.anInt389; local1++) {
				@Pc(8) int local8 = this.anIntArray85[local1];
				@Pc(13) Class1_Sub1_Sub1_Sub1_Sub1 local13 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local8];
				if (local13 != null) {
					this.method187(local13.aClass13_1.aByte21, local13);
				}
			}
			this.aBoolean46 &= true;
		} catch (@Pc(35) RuntimeException local35) {
			signlink.reporterror("70461, " + true + ", " + local35.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILclient!z;Z)V")
	private void method187(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub1_Sub1_Sub1 arg1) {
		try {
			if (arg1.anInt130 < 128 || arg1.anInt131 < 128 || arg1.anInt130 >= 13184 || arg1.anInt131 >= 13184) {
				arg1.anInt153 = -1;
				arg1.anInt158 = -1;
				arg1.anInt167 = 0;
				arg1.anInt168 = 0;
				arg1.anInt130 = arg1.anIntArray16[0] * 128 + arg1.anInt133 * 64;
				arg1.anInt131 = arg1.anIntArray17[0] * 128 + arg1.anInt133 * 64;
				arg1.method48();
			}
			if (arg1 == aClass1_Sub1_Sub1_Sub1_Sub2_1 && (arg1.anInt130 < 1536 || arg1.anInt131 < 1536 || arg1.anInt130 >= 11776 || arg1.anInt131 >= 11776)) {
				arg1.anInt153 = -1;
				arg1.anInt158 = -1;
				arg1.anInt167 = 0;
				arg1.anInt168 = 0;
				arg1.anInt130 = arg1.anIntArray16[0] * 128 + arg1.anInt133 * 64;
				arg1.anInt131 = arg1.anIntArray17[0] * 128 + arg1.anInt133 * 64;
				arg1.method48();
			}
			if (arg1.anInt167 > anInt446) {
				this.method188(arg1);
			} else if (arg1.anInt168 >= anInt446) {
				this.method189(arg1);
			} else {
				this.method190(arg1);
			}
			this.method191(arg1);
			this.method192(arg1);
		} catch (@Pc(159) RuntimeException local159) {
			signlink.reporterror("99106, " + arg0 + ", " + arg1 + ", " + true + ", " + local159.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILclient!z;)V")
	private void method188(@OriginalArg(1) Class1_Sub1_Sub1_Sub1 arg0) {
		try {
			@Pc(4) int local4 = arg0.anInt167 - anInt446;
			@Pc(22) int local22 = arg0.anInt163 * 128 + arg0.anInt133 * 64;
			@Pc(32) int local32 = arg0.anInt165 * 128 + arg0.anInt133 * 64;
			arg0.anInt130 += (local22 - arg0.anInt130) / local4;
			arg0.anInt131 += (local32 - arg0.anInt131) / local4;
			arg0.anInt174 = 0;
			if (arg0.anInt169 == 0) {
				arg0.anInt172 = 1024;
			}
			if (arg0.anInt169 == 1) {
				arg0.anInt172 = 1536;
			}
			if (arg0.anInt169 == 2) {
				arg0.anInt172 = 0;
			}
			if (arg0.anInt169 == 3) {
				arg0.anInt172 = 512;
			}
		} catch (@Pc(86) RuntimeException local86) {
			signlink.reporterror("18868, " + 7 + ", " + arg0 + ", " + local86.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!z;I)V")
	private void method189(@OriginalArg(0) Class1_Sub1_Sub1_Sub1 arg0) {
		try {
			if (arg0.anInt168 == anInt446 || arg0.anInt153 == -1 || arg0.anInt156 != 0 || arg0.anInt155 + 1 > Class27.aClass27Array1[arg0.anInt153].method517(arg0.anInt154)) {
				@Pc(29) int local29 = arg0.anInt168 - arg0.anInt167;
				@Pc(34) int local34 = anInt446 - arg0.anInt167;
				@Pc(44) int local44 = arg0.anInt163 * 128 + arg0.anInt133 * 64;
				@Pc(54) int local54 = arg0.anInt165 * 128 + arg0.anInt133 * 64;
				@Pc(64) int local64 = arg0.anInt164 * 128 + arg0.anInt133 * 64;
				@Pc(74) int local74 = arg0.anInt166 * 128 + arg0.anInt133 * 64;
				arg0.anInt130 = (local44 * (local29 - local34) + local64 * local34) / local29;
				arg0.anInt131 = (local54 * (local29 - local34) + local74 * local34) / local29;
			}
			arg0.anInt174 = 0;
			if (arg0.anInt169 == 0) {
				arg0.anInt172 = 1024;
			}
			if (arg0.anInt169 == 1) {
				arg0.anInt172 = 1536;
			}
			if (arg0.anInt169 == 2) {
				arg0.anInt172 = 0;
			}
			if (arg0.anInt169 == 3) {
				arg0.anInt172 = 512;
			}
			arg0.anInt132 = arg0.anInt172;
		} catch (@Pc(142) RuntimeException local142) {
			signlink.reporterror("73652, " + arg0 + ", " + 1 + ", " + local142.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Lclient!z;I)V")
	private void method190(@OriginalArg(0) Class1_Sub1_Sub1_Sub1 arg0) {
		try {
			arg0.anInt150 = arg0.anInt134;
			if (arg0.anInt173 == 0) {
				arg0.anInt174 = 0;
			} else {
				if (arg0.anInt153 != -1 && arg0.anInt156 == 0) {
					@Pc(24) Class27 local24 = Class27.aClass27Array1[arg0.anInt153];
					if (arg0.anInt175 > 0 && local24.anInt806 == 0) {
						arg0.anInt174++;
						return;
					}
					if (arg0.anInt175 <= 0 && local24.anInt807 == 0) {
						arg0.anInt174++;
						return;
					}
				}
				@Pc(53) int local53 = arg0.anInt130;
				@Pc(56) int local56 = arg0.anInt131;
				@Pc(71) int local71 = arg0.anIntArray16[arg0.anInt173 - 1] * 128 + arg0.anInt133 * 64;
				@Pc(86) int local86 = arg0.anIntArray17[arg0.anInt173 - 1] * 128 + arg0.anInt133 * 64;
				if (local71 - local53 <= 256 && local71 - local53 >= -256 && local86 - local56 <= 256 && local86 - local56 >= -256) {
					if (local53 < local71) {
						if (local56 < local86) {
							arg0.anInt172 = 1280;
						} else if (local56 > local86) {
							arg0.anInt172 = 1792;
						} else {
							arg0.anInt172 = 1536;
						}
					} else if (local53 > local71) {
						if (local56 < local86) {
							arg0.anInt172 = 768;
						} else if (local56 > local86) {
							arg0.anInt172 = 256;
						} else {
							arg0.anInt172 = 512;
						}
					} else if (local56 < local86) {
						arg0.anInt172 = 1024;
					} else {
						arg0.anInt172 = 0;
					}
					@Pc(183) int local183 = arg0.anInt172 - arg0.anInt132 & 0x7FF;
					if (local183 > 1024) {
						local183 -= 2048;
					}
					@Pc(190) int local190 = arg0.anInt137;
					if (local183 >= -256 && local183 <= 256) {
						local190 = arg0.anInt136;
					} else if (local183 >= 256 && local183 < 768) {
						local190 = arg0.anInt139;
					} else if (local183 >= -768 && local183 <= -256) {
						local190 = arg0.anInt138;
					}
					if (local190 == -1) {
						local190 = arg0.anInt136;
					}
					arg0.anInt150 = local190;
					@Pc(232) int local232 = 4;
					if (arg0.anInt132 != arg0.anInt172 && arg0.anInt147 == -1) {
						local232 = 2;
					}
					if (arg0.anInt173 > 2) {
						local232 = 6;
					}
					if (arg0.anInt173 > 3) {
						local232 = 8;
					}
					if (arg0.anInt174 > 0 && arg0.anInt173 > 1) {
						local232 = 8;
						arg0.anInt174--;
					}
					if (arg0.aBooleanArray3[arg0.anInt173 - 1]) {
						local232 <<= 0x1;
					}
					if (local232 >= 8 && arg0.anInt150 == arg0.anInt136 && arg0.anInt140 != -1) {
						arg0.anInt150 = arg0.anInt140;
					}
					if (local53 < local71) {
						arg0.anInt130 += local232;
						if (arg0.anInt130 > local71) {
							arg0.anInt130 = local71;
						}
					} else if (local53 > local71) {
						arg0.anInt130 -= local232;
						if (arg0.anInt130 < local71) {
							arg0.anInt130 = local71;
						}
					}
					if (local56 < local86) {
						arg0.anInt131 += local232;
						if (arg0.anInt131 > local86) {
							arg0.anInt131 = local86;
						}
					} else if (local56 > local86) {
						arg0.anInt131 -= local232;
						if (arg0.anInt131 < local86) {
							arg0.anInt131 = local86;
						}
					}
					if (arg0.anInt130 == local71 && arg0.anInt131 == local86) {
						arg0.anInt173--;
						if (arg0.anInt175 > 0) {
							arg0.anInt175--;
							return;
						}
					}
				} else {
					arg0.anInt130 = local71;
					arg0.anInt131 = local86;
				}
			}
		} catch (@Pc(391) RuntimeException local391) {
			signlink.reporterror("72794, " + arg0 + ", " + -950 + ", " + local391.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!z;B)V")
	private void method191(@OriginalArg(0) Class1_Sub1_Sub1_Sub1 arg0) {
		try {
			@Pc(33) int local33;
			@Pc(39) int local39;
			if (arg0.anInt147 != -1 && arg0.anInt147 < 32768) {
				@Pc(25) Class1_Sub1_Sub1_Sub1_Sub1 local25 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[arg0.anInt147];
				if (local25 != null) {
					local33 = arg0.anInt130 - local25.anInt130;
					local39 = arg0.anInt131 - local25.anInt131;
					if (local33 != 0 || local39 != 0) {
						arg0.anInt172 = (int) (Math.atan2((double) local33, (double) local39) * 325.949D) & 0x7FF;
					}
				}
			}
			@Pc(64) int local64;
			if (arg0.anInt147 >= 32768) {
				local64 = arg0.anInt147 - 32768;
				if (local64 == this.anInt246) {
					local64 = this.anInt419;
				}
				@Pc(76) Class1_Sub1_Sub1_Sub1_Sub2 local76 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local64];
				if (local76 != null) {
					local39 = arg0.anInt130 - local76.anInt130;
					@Pc(90) int local90 = arg0.anInt131 - local76.anInt131;
					if (local39 != 0 || local90 != 0) {
						arg0.anInt172 = (int) (Math.atan2((double) local39, (double) local90) * 325.949D) & 0x7FF;
					}
				}
			}
			if ((arg0.anInt148 != 0 || arg0.anInt149 != 0) && (arg0.anInt173 == 0 || arg0.anInt174 > 0)) {
				local64 = arg0.anInt130 - (arg0.anInt148 - this.anInt312 - this.anInt312) * 64;
				local33 = arg0.anInt131 - (arg0.anInt149 - this.anInt313 - this.anInt313) * 64;
				if (local64 != 0 || local33 != 0) {
					arg0.anInt172 = (int) (Math.atan2((double) local64, (double) local33) * 325.949D) & 0x7FF;
				}
				arg0.anInt148 = 0;
				arg0.anInt149 = 0;
			}
			local64 = arg0.anInt172 - arg0.anInt132 & 0x7FF;
			if (local64 != 0) {
				if (local64 < 32 || local64 > 2016) {
					arg0.anInt132 = arg0.anInt172;
				} else if (local64 > 1024) {
					arg0.anInt132 -= 32;
				} else {
					arg0.anInt132 += 32;
				}
				arg0.anInt132 &= 0x7FF;
				if (arg0.anInt150 == arg0.anInt134 && arg0.anInt132 != arg0.anInt172) {
					if (arg0.anInt135 != -1) {
						arg0.anInt150 = arg0.anInt135;
						return;
					}
					arg0.anInt150 = arg0.anInt136;
					return;
				}
			}
		} catch (@Pc(238) RuntimeException local238) {
			signlink.reporterror("65888, " + arg0 + ", " + 9 + ", " + local238.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Lclient!z;B)V")
	private void method192(@OriginalArg(0) Class1_Sub1_Sub1_Sub1 arg0) {
		try {
			arg0.aBoolean26 = false;
			@Pc(19) Class27 local19;
			if (arg0.anInt150 != -1) {
				local19 = Class27.aClass27Array1[arg0.anInt150];
				arg0.anInt152++;
				if (arg0.anInt151 < local19.anInt800 && arg0.anInt152 > local19.method517(arg0.anInt151)) {
					arg0.anInt152 = 0;
					arg0.anInt151++;
				}
				if (arg0.anInt151 >= local19.anInt800) {
					arg0.anInt152 = 0;
					arg0.anInt151 = 0;
				}
			}
			if (arg0.anInt158 != -1 && anInt446 >= arg0.anInt161) {
				if (arg0.anInt159 < 0) {
					arg0.anInt159 = 0;
				}
				local19 = Class32.aClass32Array1[arg0.anInt158].aClass27_2;
				arg0.anInt160++;
				while (arg0.anInt159 < local19.anInt800 && arg0.anInt160 > local19.method517(arg0.anInt159)) {
					arg0.anInt160 -= local19.method517(arg0.anInt159);
					arg0.anInt159++;
				}
				if (arg0.anInt159 >= local19.anInt800 && (arg0.anInt159 < 0 || arg0.anInt159 >= local19.anInt800)) {
					arg0.anInt158 = -1;
				}
			}
			if (arg0.anInt153 != -1 && arg0.anInt156 <= 1) {
				local19 = Class27.aClass27Array1[arg0.anInt153];
				if (local19.anInt806 == 1 && arg0.anInt175 > 0 && arg0.anInt167 <= anInt446 && arg0.anInt168 < anInt446) {
					arg0.anInt156 = 1;
					return;
				}
			}
			if (arg0.anInt153 != -1 && arg0.anInt156 == 0) {
				local19 = Class27.aClass27Array1[arg0.anInt153];
				arg0.anInt155++;
				while (arg0.anInt154 < local19.anInt800 && arg0.anInt155 > local19.method517(arg0.anInt154)) {
					arg0.anInt155 -= local19.method517(arg0.anInt154);
					arg0.anInt154++;
				}
				if (arg0.anInt154 >= local19.anInt800) {
					arg0.anInt154 -= local19.anInt801;
					arg0.anInt157++;
					if (arg0.anInt157 >= local19.anInt805) {
						arg0.anInt153 = -1;
					}
					if (arg0.anInt154 < 0 || arg0.anInt154 >= local19.anInt800) {
						arg0.anInt153 = -1;
					}
				}
				arg0.aBoolean26 = local19.aBoolean200;
			}
			if (arg0.anInt156 > 0) {
				arg0.anInt156--;
			}
		} catch (@Pc(264) RuntimeException local264) {
			signlink.reporterror("74632, " + arg0 + ", " + 4 + ", " + local264.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "r", descriptor = "(B)V")
	private void method193() {
		try {
			if (this.aBoolean86) {
				this.aBoolean86 = false;
				this.aClass37_3.method539(4, super.aGraphics2, 0);
				this.aClass37_4.method539(357, super.aGraphics2, 0);
				this.aClass37_5.method539(4, super.aGraphics2, 722);
				this.aClass37_6.method539(205, super.aGraphics2, 743);
				this.aClass37_7.method539(0, super.aGraphics2, 0);
				this.aClass37_8.method539(4, super.aGraphics2, 516);
				this.aClass37_9.method539(205, super.aGraphics2, 516);
				this.aClass37_10.method539(357, super.aGraphics2, 496);
				this.aClass37_11.method539(338, super.aGraphics2, 0);
				this.aBoolean82 = true;
				this.aBoolean52 = true;
				this.aBoolean60 = true;
				this.aBoolean83 = true;
				if (this.anInt362 != 2) {
					this.aClass37_26.method539(4, super.aGraphics2, 4);
					this.aClass37_25.method539(4, super.aGraphics2, 550);
				}
			}
			if (this.anInt362 == 2) {
				this.method139();
			}
			if (this.aBoolean61 && this.anInt366 == 1) {
				this.aBoolean82 = true;
			}
			@Pc(138) boolean local138;
			if (this.anInt343 != -1) {
				local138 = this.method108(this.anInt343, this.anInt301);
				if (local138) {
					this.aBoolean82 = true;
				}
			}
			if (this.anInt271 == 2) {
				this.aBoolean82 = true;
			}
			if (this.anInt326 == 2) {
				this.aBoolean82 = true;
			}
			if (this.aBoolean82) {
				this.method182();
				this.aBoolean82 = false;
			}
			if (this.anInt412 == -1) {
				this.aClass6_1.anInt461 = this.anInt351 - this.anInt354 - 77;
				if (super.anInt233 > 448 && super.anInt233 < 560 && super.anInt234 > 332) {
					this.method219(77, false, 463, super.anInt234 - 357, this.aClass6_1, 0, super.anInt233 - 17, this.anInt351);
				}
				@Pc(220) int local220 = this.anInt351 - this.aClass6_1.anInt461 - 77;
				if (local220 < 0) {
					local220 = 0;
				}
				if (local220 > this.anInt351 - 77) {
					local220 = this.anInt351 - 77;
				}
				if (this.anInt354 != local220) {
					this.anInt354 = local220;
					this.aBoolean52 = true;
				}
			}
			if (this.anInt412 != -1) {
				local138 = this.method108(this.anInt412, this.anInt301);
				if (local138) {
					this.aBoolean52 = true;
				}
			}
			if (this.anInt271 == 3) {
				this.aBoolean52 = true;
			}
			if (this.anInt326 == 3) {
				this.aBoolean52 = true;
			}
			if (this.aString15 != null) {
				this.aBoolean52 = true;
			}
			if (this.aBoolean61 && this.anInt366 == 2) {
				this.aBoolean52 = true;
			}
			if (this.aBoolean52) {
				this.method117();
				this.aBoolean52 = false;
			}
			if (this.anInt362 == 2) {
				this.method171();
				this.aClass37_25.method539(4, super.aGraphics2, 550);
			}
			if (this.anInt415 != -1) {
				this.aBoolean60 = true;
			}
			if (this.aBoolean60) {
				if (this.anInt415 != -1 && this.anInt415 == this.anInt263) {
					this.anInt415 = -1;
					this.aClass1_Sub1_Sub3_4.method487(243);
					this.aClass1_Sub1_Sub3_4.method488(this.anInt263);
				}
				this.aBoolean60 = false;
				this.aClass37_23.method538();
				this.aClass1_Sub1_Sub2_Sub3_8.method445(0, 0);
				if (this.anInt343 == -1) {
					if (this.anIntArray65[this.anInt263] != -1) {
						if (this.anInt263 == 0) {
							this.aClass1_Sub1_Sub2_Sub3_14.method445(10, 22);
						}
						if (this.anInt263 == 1) {
							this.aClass1_Sub1_Sub2_Sub3_15.method445(8, 54);
						}
						if (this.anInt263 == 2) {
							this.aClass1_Sub1_Sub2_Sub3_15.method445(8, 82);
						}
						if (this.anInt263 == 3) {
							this.aClass1_Sub1_Sub2_Sub3_16.method445(8, 110);
						}
						if (this.anInt263 == 4) {
							this.aClass1_Sub1_Sub2_Sub3_18.method445(8, 153);
						}
						if (this.anInt263 == 5) {
							this.aClass1_Sub1_Sub2_Sub3_18.method445(8, 181);
						}
						if (this.anInt263 == 6) {
							this.aClass1_Sub1_Sub2_Sub3_17.method445(9, 209);
						}
					}
					if (this.anIntArray65[0] != -1 && (this.anInt415 != 0 || anInt446 % 20 < 10)) {
						this.aClass1_Sub1_Sub2_Sub3Array2[0].method445(13, 29);
					}
					if (this.anIntArray65[1] != -1 && (this.anInt415 != 1 || anInt446 % 20 < 10)) {
						this.aClass1_Sub1_Sub2_Sub3Array2[1].method445(11, 53);
					}
					if (this.anIntArray65[2] != -1 && (this.anInt415 != 2 || anInt446 % 20 < 10)) {
						this.aClass1_Sub1_Sub2_Sub3Array2[2].method445(11, 82);
					}
					if (this.anIntArray65[3] != -1 && (this.anInt415 != 3 || anInt446 % 20 < 10)) {
						this.aClass1_Sub1_Sub2_Sub3Array2[3].method445(12, 115);
					}
					if (this.anIntArray65[4] != -1 && (this.anInt415 != 4 || anInt446 % 20 < 10)) {
						this.aClass1_Sub1_Sub2_Sub3Array2[4].method445(13, 153);
					}
					if (this.anIntArray65[5] != -1 && (this.anInt415 != 5 || anInt446 % 20 < 10)) {
						this.aClass1_Sub1_Sub2_Sub3Array2[5].method445(11, 180);
					}
					if (this.anIntArray65[6] != -1 && (this.anInt415 != 6 || anInt446 % 20 < 10)) {
						this.aClass1_Sub1_Sub2_Sub3Array2[6].method445(13, 208);
					}
				}
				this.aClass37_23.method539(160, super.aGraphics2, 516);
				this.aClass37_22.method538();
				this.aClass1_Sub1_Sub2_Sub3_7.method445(0, 0);
				if (this.anInt343 == -1) {
					if (this.anIntArray65[this.anInt263] != -1) {
						if (this.anInt263 == 7) {
							this.aClass1_Sub1_Sub2_Sub3_1.method445(0, 42);
						}
						if (this.anInt263 == 8) {
							this.aClass1_Sub1_Sub2_Sub3_2.method445(0, 74);
						}
						if (this.anInt263 == 9) {
							this.aClass1_Sub1_Sub2_Sub3_2.method445(0, 102);
						}
						if (this.anInt263 == 10) {
							this.aClass1_Sub1_Sub2_Sub3_3.method445(1, 130);
						}
						if (this.anInt263 == 11) {
							this.aClass1_Sub1_Sub2_Sub3_5.method445(0, 173);
						}
						if (this.anInt263 == 12) {
							this.aClass1_Sub1_Sub2_Sub3_5.method445(0, 201);
						}
						if (this.anInt263 == 13) {
							this.aClass1_Sub1_Sub2_Sub3_4.method445(0, 229);
						}
					}
					if (this.anIntArray65[8] != -1 && (this.anInt415 != 8 || anInt446 % 20 < 10)) {
						this.aClass1_Sub1_Sub2_Sub3Array2[7].method445(2, 74);
					}
					if (this.anIntArray65[9] != -1 && (this.anInt415 != 9 || anInt446 % 20 < 10)) {
						this.aClass1_Sub1_Sub2_Sub3Array2[8].method445(3, 102);
					}
					if (this.anIntArray65[10] != -1 && (this.anInt415 != 10 || anInt446 % 20 < 10)) {
						this.aClass1_Sub1_Sub2_Sub3Array2[9].method445(4, 137);
					}
					if (this.anIntArray65[11] != -1 && (this.anInt415 != 11 || anInt446 % 20 < 10)) {
						this.aClass1_Sub1_Sub2_Sub3Array2[10].method445(2, 174);
					}
					if (this.anIntArray65[12] != -1 && (this.anInt415 != 12 || anInt446 % 20 < 10)) {
						this.aClass1_Sub1_Sub2_Sub3Array2[11].method445(2, 201);
					}
					if (this.anIntArray65[13] != -1 && (this.anInt415 != 13 || anInt446 % 20 < 10)) {
						this.aClass1_Sub1_Sub2_Sub3Array2[12].method445(2, 226);
					}
				}
				this.aClass37_22.method539(466, super.aGraphics2, 496);
				this.aClass37_26.method538();
			}
			if (this.aBoolean83) {
				this.aBoolean83 = false;
				this.aClass37_21.method538();
				this.aClass1_Sub1_Sub2_Sub3_6.method445(0, 0);
				this.aClass1_Sub1_Sub2_Sub4_2.method466(28, (byte) 6, 55, true, "Public chat", 16777215);
				if (this.anInt364 == 0) {
					this.aClass1_Sub1_Sub2_Sub4_2.method466(41, (byte) 6, 55, true, "On", 65280);
				}
				if (this.anInt364 == 1) {
					this.aClass1_Sub1_Sub2_Sub4_2.method466(41, (byte) 6, 55, true, "Friends", 16776960);
				}
				if (this.anInt364 == 2) {
					this.aClass1_Sub1_Sub2_Sub4_2.method466(41, (byte) 6, 55, true, "Off", 16711680);
				}
				if (this.anInt364 == 3) {
					this.aClass1_Sub1_Sub2_Sub4_2.method466(41, (byte) 6, 55, true, "Hide", 65535);
				}
				this.aClass1_Sub1_Sub2_Sub4_2.method466(28, (byte) 6, 184, true, "Private chat", 16777215);
				if (this.anInt447 == 0) {
					this.aClass1_Sub1_Sub2_Sub4_2.method466(41, (byte) 6, 184, true, "On", 65280);
				}
				if (this.anInt447 == 1) {
					this.aClass1_Sub1_Sub2_Sub4_2.method466(41, (byte) 6, 184, true, "Friends", 16776960);
				}
				if (this.anInt447 == 2) {
					this.aClass1_Sub1_Sub2_Sub4_2.method466(41, (byte) 6, 184, true, "Off", 16711680);
				}
				this.aClass1_Sub1_Sub2_Sub4_2.method466(28, (byte) 6, 324, true, "Trade/duel", 16777215);
				if (this.anInt306 == 0) {
					this.aClass1_Sub1_Sub2_Sub4_2.method466(41, (byte) 6, 324, true, "On", 65280);
				}
				if (this.anInt306 == 1) {
					this.aClass1_Sub1_Sub2_Sub4_2.method466(41, (byte) 6, 324, true, "Friends", 16776960);
				}
				if (this.anInt306 == 2) {
					this.aClass1_Sub1_Sub2_Sub4_2.method466(41, (byte) 6, 324, true, "Off", 16711680);
				}
				this.aClass1_Sub1_Sub2_Sub4_2.method466(33, (byte) 6, 458, true, "Report abuse", 16777215);
				this.aClass37_21.method539(453, super.aGraphics2, 0);
				this.aClass37_26.method538();
			}
			this.anInt301 = 0;
		} catch (@Pc(1056) RuntimeException local1056) {
			signlink.reporterror("36502, " + 3 + ", " + local1056.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "i", descriptor = "(II)V")
	private void method194(@OriginalArg(0) int arg0) {
		try {
			@Pc(4) int local4 = Class38.aClass38Array1[arg0].anInt875;
			if (local4 != 0) {
				@Pc(12) int local12 = this.anIntArray71[arg0];
				if (local4 == 1) {
					if (local12 == 1) {
						Class1_Sub1_Sub2_Sub1.method379(0.9D);
					}
					if (local12 == 2) {
						Class1_Sub1_Sub2_Sub1.method379(0.8D);
					}
					if (local12 == 3) {
						Class1_Sub1_Sub2_Sub1.method379(0.7D);
					}
					if (local12 == 4) {
						Class1_Sub1_Sub2_Sub1.method379(0.6D);
					}
					Class15.aClass42_8.method643();
					this.aBoolean86 = true;
				}
				if (local4 == 3) {
					@Pc(54) boolean local54 = this.aBoolean75;
					if (local12 == 0) {
						this.method161(this.aBoolean75, 0);
						this.aBoolean75 = true;
					}
					if (local12 == 1) {
						this.method161(this.aBoolean75, -400);
						this.aBoolean75 = true;
					}
					if (local12 == 2) {
						this.method161(this.aBoolean75, -800);
						this.aBoolean75 = true;
					}
					if (local12 == 3) {
						this.method161(this.aBoolean75, -1200);
						this.aBoolean75 = true;
					}
					if (local12 == 4) {
						this.aBoolean75 = false;
					}
					if (this.aBoolean75 != local54 && !aBoolean48) {
						if (this.aBoolean75) {
							this.anInt434 = this.anInt321;
							this.aBoolean87 = false;
							this.aClass45_Sub1_1.method657(2, this.anInt434);
						} else {
							this.method102();
						}
						this.anInt357 = 0;
					}
				}
				if (local4 == 4) {
					if (local12 == 0) {
						this.aBoolean80 = true;
						this.method103(0);
					}
					if (local12 == 1) {
						this.aBoolean80 = true;
						this.method103(-400);
					}
					if (local12 == 2) {
						this.aBoolean80 = true;
						this.method103(-800);
					}
					if (local12 == 3) {
						this.aBoolean80 = true;
						this.method103(-1200);
					}
					if (local12 == 4) {
						this.aBoolean80 = false;
					}
				}
				if (local4 == 5) {
					this.anInt427 = local12;
				}
				if (local4 == 6) {
					this.anInt397 = local12;
				}
				if (local4 == 8) {
					this.anInt390 = local12;
					this.aBoolean52 = true;
				}
				if (local4 == 9) {
					this.anInt349 = local12;
				}
			}
		} catch (@Pc(214) RuntimeException local214) {
			signlink.reporterror("78821, " + arg0 + ", " + -42638 + ", " + local214.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIIBIII)V")
	private void method195(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		try {
			if (arg2 >= 1 && arg6 >= 1 && arg2 <= 102 && arg6 <= 102) {
				if (aBoolean48 && arg1 != this.anInt257) {
					return;
				}
				@Pc(30) int local30 = 0;
				if (arg5 == 0) {
					local30 = this.aClass39_1.method570(arg1, arg2, arg6);
				}
				if (arg5 == 1) {
					local30 = this.aClass39_1.method571(arg2, arg6, arg1);
				}
				if (arg5 == 2) {
					local30 = this.aClass39_1.method572(arg1, arg2, arg6);
				}
				if (arg5 == 3) {
					local30 = this.aClass39_1.method573(arg1, arg2, arg6);
				}
				@Pc(86) int local86;
				if (local30 != 0) {
					local86 = this.aClass39_1.method574(arg1, arg2, arg6, local30);
					@Pc(92) int local92 = local30 >> 14 & 0x7FFF;
					@Pc(96) int local96 = local86 & 0x1F;
					@Pc(100) int local100 = local86 >> 6;
					@Pc(112) Class9 local112;
					if (arg5 == 0) {
						this.aClass39_1.method561(arg2, arg6, arg1);
						local112 = Class9.method258(local92);
						if (local112.aBoolean111) {
							this.aClass19Array1[arg1].method419(arg2, arg6, local96, local112.aBoolean112, local100);
						}
					}
					if (arg5 == 1) {
						this.aClass39_1.method562(arg6, arg1, arg2);
					}
					if (arg5 == 2) {
						this.aClass39_1.method563(arg6, arg2, arg1);
						local112 = Class9.method258(local92);
						if (arg2 + local112.anInt515 > 103 || arg6 + local112.anInt515 > 103 || arg2 + local112.anInt516 > 103 || arg6 + local112.anInt516 > 103) {
							return;
						}
						if (local112.aBoolean111) {
							this.aClass19Array1[arg1].method420(arg6, local112.anInt515, arg2, local112.anInt516, local100, local112.aBoolean112);
						}
					}
					if (arg5 == 3) {
						this.aClass39_1.method564(arg2, arg1, arg6);
						local112 = Class9.method258(local92);
						if (local112.aBoolean111 && local112.aBoolean113) {
							this.aClass19Array1[arg1].method422(arg2, arg6);
						}
					}
				}
				if (arg4 >= 0) {
					local86 = arg1;
					if (arg1 < 3 && (this.aByteArrayArrayArray7[1][arg2][arg6] & 0x2) == 2) {
						local86 = arg1 + 1;
					}
					Class4.method74(this.anIntArrayArrayArray3, arg3, this.aClass39_1, local86, arg2, this.aClass19Array1[arg1], arg0, arg1, arg4, arg6);
					return;
				}
			}
		} catch (@Pc(259) RuntimeException local259) {
			signlink.reporterror("15045, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + -2 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + local259.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "x", descriptor = "(I)V")
	private void method196() {
		try {
			if (super.anInt238 == 1) {
				@Pc(18) int local18 = super.anInt239 - 25 - 550;
				@Pc(25) int local25 = super.anInt240 - 5 - 4;
				if (local18 >= 0 && local25 >= 0 && local18 < 146 && local25 < 151) {
					local18 -= 73;
					local25 -= 75;
					@Pc(45) int local45 = this.anInt403 + this.anInt413 & 0x7FF;
					@Pc(49) int local49 = Class1_Sub1_Sub2_Sub1.anIntArray183[local45];
					@Pc(53) int local53 = Class1_Sub1_Sub2_Sub1.anIntArray184[local45];
					@Pc(62) int local62 = local49 * (this.anInt359 + 256) >> 8;
					@Pc(71) int local71 = local53 * (this.anInt359 + 256) >> 8;
					@Pc(81) int local81 = local25 * local62 + local18 * local71 >> 11;
					@Pc(91) int local91 = local25 * local71 - local18 * local62 >> 11;
					@Pc(98) int local98 = aClass1_Sub1_Sub1_Sub1_Sub2_1.anInt130 + local81 >> 7;
					@Pc(105) int local105 = aClass1_Sub1_Sub1_Sub1_Sub2_1.anInt131 - local91 >> 7;
					@Pc(126) boolean local126 = this.method166(true, 0, 0, local98, 0, 1, aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray16[0], 0, local105, 0, aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray17[0]);
					if (local126) {
						this.aClass1_Sub1_Sub3_4.method488(local18);
						this.aClass1_Sub1_Sub3_4.method488(local25);
						this.aClass1_Sub1_Sub3_4.method489(this.anInt403);
						this.aClass1_Sub1_Sub3_4.method488(57);
						this.aClass1_Sub1_Sub3_4.method488(this.anInt413);
						this.aClass1_Sub1_Sub3_4.method488(this.anInt359);
						this.aClass1_Sub1_Sub3_4.method488(89);
						this.aClass1_Sub1_Sub3_4.method489(aClass1_Sub1_Sub1_Sub1_Sub2_1.anInt130);
						this.aClass1_Sub1_Sub3_4.method489(aClass1_Sub1_Sub1_Sub1_Sub2_1.anInt131);
						this.aClass1_Sub1_Sub3_4.method488(this.anInt264);
						this.aClass1_Sub1_Sub3_4.method488(63);
						return;
					}
				}
			}
		} catch (@Pc(180) RuntimeException local180) {
			signlink.reporterror("59915, " + 8 + ", " + local180.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "init", descriptor = "()V")
	@Override
	public void init() {
		anInt261 = Integer.parseInt(this.getParameter("nodeid"));
		anInt262 = Integer.parseInt(this.getParameter("portoff"));
		@Pc(15) String local15 = this.getParameter("lowmem");
		if (local15 != null && local15.equals("1")) {
			method99();
		} else {
			method153();
		}
		@Pc(31) String local31 = this.getParameter("free");
		if (local31 != null && local31.equals("1")) {
			aBoolean47 = false;
		} else {
			aBoolean47 = true;
		}
		this.method86();
	}

	@OriginalMember(owner = "client!client", name = "n", descriptor = "(Z)V")
	private void method197() {
		try {
			@Pc(18) int local18 = (aClass1_Sub1_Sub1_Sub1_Sub2_1.anInt130 >> 7) + this.anInt312;
			@Pc(26) int local26 = (aClass1_Sub1_Sub1_Sub1_Sub2_1.anInt131 >> 7) + this.anInt313;
			if (local18 >= 2944 && local18 < 3392 && local26 >= 3520 && local26 < 6400) {
				this.anInt267 = (local26 - 3520) / 8 + 1;
			} else if (local18 >= 2944 && local18 < 3392 && local26 >= 9920 && local26 < 12800) {
				this.anInt267 = (local26 - 9920) / 8 + 1;
			} else {
				this.anInt267 = 0;
			}
			this.anInt288 = 0;
			if (local18 >= 3328 && local18 < 3392 && local26 >= 3200 && local26 < 3264) {
				@Pc(94) int local94 = local18 & 0x3F;
				@Pc(98) int local98 = local26 & 0x3F;
				if (local94 >= 4 && local94 <= 29 && local98 >= 44 && local98 <= 58) {
					this.anInt288 = 1;
				}
				if (local94 >= 36 && local94 <= 61 && local98 >= 44 && local98 <= 58) {
					this.anInt288 = 1;
				}
				if (local94 >= 4 && local94 <= 29 && local98 >= 25 && local98 <= 39) {
					this.anInt288 = 1;
				}
				if (local94 >= 36 && local94 <= 61 && local98 >= 25 && local98 <= 39) {
					this.anInt288 = 1;
				}
				if (local94 >= 4 && local94 <= 29 && local98 >= 6 && local98 <= 20) {
					this.anInt288 = 1;
				}
				if (local94 >= 36 && local94 <= 61 && local98 >= 6 && local98 <= 20) {
					this.anInt288 = 1;
				}
			}
			if (this.anInt288 == 0 && local18 >= 3328 && local18 <= 3393 && local26 >= 3203 && local26 <= 3325) {
				this.anInt288 = 2;
			}
			this.anInt388 = 0;
			if (local18 >= 3053 && local18 <= 3156 && local26 >= 3056 && local26 <= 3136) {
				this.anInt388 = 1;
			}
			if (local18 >= 3072 && local18 <= 3118 && local26 >= 9492 && local26 <= 9535) {
				this.anInt388 = 1;
			}
			if (this.anInt388 == 1 && local18 >= 3139 && local18 <= 3199 && local26 >= 3008 && local26 <= 3062) {
				this.anInt388 = 0;
			}
		} catch (@Pc(260) RuntimeException local260) {
			signlink.reporterror("11935, " + false + ", " + local260.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "o", descriptor = "(Z)V")
	private void method198() {
		try {
			if (this.anInt365 >= 2 || this.anInt283 != 0 || this.anInt394 != 0) {
				@Pc(31) String local31;
				if (this.anInt283 == 1 && this.anInt365 < 2) {
					local31 = "Use " + this.aString7 + " with...";
				} else if (this.anInt394 == 1 && this.anInt365 < 2) {
					local31 = this.aString16 + "...";
				} else {
					local31 = this.aStringArray1[this.anInt365 - 1];
				}
				if (this.anInt365 > 2) {
					local31 = local31 + "@whi@ / " + (this.anInt365 - 2) + " more options";
				}
				this.aClass1_Sub1_Sub2_Sub4_3.method471(anInt446 / 1000, 15, 4, 16777215, local31);
			}
		} catch (@Pc(100) RuntimeException local100) {
			signlink.reporterror("88450, " + false + ", " + local100.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIIIIBIII)V")
	private void method199(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		try {
			@Pc(1) Class1_Sub2 local1 = null;
			for (@Pc(6) Class1_Sub2 local6 = (Class1_Sub2) this.aClass31_1.method523(); local6 != null; local6 = (Class1_Sub2) this.aClass31_1.method525()) {
				if (local6.anInt813 == arg1 && local6.anInt815 == arg5 && local6.anInt816 == arg0 && local6.anInt814 == arg2) {
					local1 = local6;
					break;
				}
			}
			if (local1 == null) {
				local1 = new Class1_Sub2();
				local1.anInt813 = arg1;
				local1.anInt814 = arg2;
				local1.anInt815 = arg5;
				local1.anInt816 = arg0;
				this.method216(local1);
				this.aClass31_1.method520(local1);
			}
			local1.anInt820 = arg4;
			local1.anInt822 = arg7;
			local1.anInt821 = arg8;
			local1.anInt823 = arg6;
			local1.anInt824 = arg3;
		} catch (@Pc(84) RuntimeException local84) {
			signlink.reporterror("82254, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + 2 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + local84.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIIIII)V")
	private void method200(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		try {
			@Pc(5) int local5 = 2048 - arg5 & 0x7FF;
			@Pc(11) int local11 = 2048 - arg2 & 0x7FF;
			@Pc(13) int local13 = 0;
			@Pc(15) int local15 = 0;
			@Pc(17) int local17 = arg1;
			@Pc(23) int local23;
			@Pc(27) int local27;
			@Pc(37) int local37;
			if (local5 != 0) {
				local23 = Class1_Sub1_Sub1_Sub5.anIntArray158[local5];
				local27 = Class1_Sub1_Sub1_Sub5.anIntArray159[local5];
				local37 = local27 * 0 - arg1 * local23 >> 16;
				local17 = local23 * 0 + arg1 * local27 >> 16;
				local15 = local37;
			}
			if (local11 != 0) {
				local23 = Class1_Sub1_Sub1_Sub5.anIntArray158[local11];
				local27 = Class1_Sub1_Sub1_Sub5.anIntArray159[local11];
				local37 = local17 * local23 + local27 * 0 >> 16;
				local17 = local17 * local27 - local23 * 0 >> 16;
				local13 = local37;
			}
			this.anInt289 = arg4 - local13;
			this.anInt290 = arg0 - local15;
			this.anInt291 = arg3 - local17;
			this.anInt292 = arg5;
			this.anInt293 = arg2;
		} catch (@Pc(109) RuntimeException local109) {
			signlink.reporterror("95875, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + 0 + ", " + arg4 + ", " + arg5 + ", " + local109.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "y", descriptor = "(I)V")
	private void method201() {
		try {
			@Pc(7) int local7 = this.aClass1_Sub1_Sub2_Sub4_3.method467("Choose Option");
			@Pc(27) int local27;
			for (@Pc(16) int local16 = 0; local16 < this.anInt365; local16++) {
				local27 = this.aClass1_Sub1_Sub2_Sub4_3.method467(this.aStringArray1[local16]);
				if (local27 > local7) {
					local7 = local27;
				}
			}
			local7 += 8;
			local27 = this.anInt365 * 15 + 21;
			@Pc(70) int local70;
			@Pc(88) int local88;
			if (super.anInt239 > 4 && super.anInt240 > 4 && super.anInt239 < 516 && super.anInt240 < 338) {
				local70 = super.anInt239 - local7 / 2 - 4;
				if (local70 + local7 > 512) {
					local70 = 512 - local7;
				}
				if (local70 < 0) {
					local70 = 0;
				}
				local88 = super.anInt240 - 4;
				if (local88 + local27 > 334) {
					local88 = 334 - local27;
				}
				if (local88 < 0) {
					local88 = 0;
				}
				this.aBoolean61 = true;
				this.anInt366 = 0;
				this.anInt367 = local70;
				this.anInt368 = local88;
				this.anInt369 = local7;
				this.anInt370 = this.anInt365 * 15 + 22;
			}
			if (super.anInt239 > 553 && super.anInt240 > 205 && super.anInt239 < 743 && super.anInt240 < 466) {
				local70 = super.anInt239 - local7 / 2 - 553;
				if (local70 < 0) {
					local70 = 0;
				} else if (local70 + local7 > 190) {
					local70 = 190 - local7;
				}
				local88 = super.anInt240 - 205;
				if (local88 < 0) {
					local88 = 0;
				} else if (local88 + local27 > 261) {
					local88 = 261 - local27;
				}
				this.aBoolean61 = true;
				this.anInt366 = 1;
				this.anInt367 = local70;
				this.anInt368 = local88;
				this.anInt369 = local7;
				this.anInt370 = this.anInt365 * 15 + 22;
			}
			if (super.anInt239 > 17 && super.anInt240 > 357 && super.anInt239 < 496 && super.anInt240 < 453) {
				local70 = super.anInt239 - local7 / 2 - 17;
				if (local70 < 0) {
					local70 = 0;
				} else if (local70 + local7 > 479) {
					local70 = 479 - local7;
				}
				local88 = super.anInt240 - 357;
				if (local88 < 0) {
					local88 = 0;
				} else if (local88 + local27 > 96) {
					local88 = 96 - local27;
				}
				this.aBoolean61 = true;
				this.anInt366 = 2;
				this.anInt367 = local70;
				this.anInt368 = local88;
				this.anInt369 = local7;
				this.anInt370 = this.anInt365 * 15 + 22;
			}
		} catch (@Pc(292) RuntimeException local292) {
			signlink.reporterror("73048, " + 1 + ", " + local292.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "s", descriptor = "(B)Z")
	private boolean method202(@OriginalArg(0) byte arg0) {
		try {
			@Pc(4) boolean local4 = false;
			return signlink.wavereplay();
		} catch (@Pc(13) RuntimeException local13) {
			signlink.reporterror("6973, " + arg0 + ", " + local13.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(I)V")
	@Override
	protected void method93() {
		try {
			if (this.aBoolean49 || this.aBoolean70 || this.aBoolean85) {
				this.method122();
			} else {
				anInt441++;
				if (this.aBoolean46) {
					this.method193();
				} else {
					this.method143();
				}
				this.anInt255 = 0;
			}
		} catch (@Pc(37) RuntimeException local37) {
			signlink.reporterror("39027, " + 0 + ", " + local37.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(IJ)V")
	private void method203(@OriginalArg(1) long arg0) {
		try {
			if (arg0 != 0L) {
				for (@Pc(17) int local17 = 0; local17 < this.anInt317; local17++) {
					if (this.aLongArray4[local17] == arg0) {
						this.anInt317--;
						this.aBoolean82 = true;
						for (@Pc(37) int local37 = local17; local37 < this.anInt317; local37++) {
							this.aStringArray4[local37] = this.aStringArray4[local37 + 1];
							this.anIntArray89[local37] = this.anIntArray89[local37 + 1];
							this.aLongArray4[local37] = this.aLongArray4[local37 + 1];
						}
						this.aClass1_Sub1_Sub3_4.method487(61);
						this.aClass1_Sub1_Sub3_4.method494(arg0, this.anInt295);
						return;
					}
				}
			}
		} catch (@Pc(93) RuntimeException local93) {
			signlink.reporterror("37198, " + -443 + ", " + arg0 + ", " + local93.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "z", descriptor = "(I)V")
	private void method204(@OriginalArg(0) int arg0) {
		try {
			@Pc(3) boolean local3 = false;
			this.aClass1_Sub1_Sub3_4.method487(245);
			if (this.anInt343 != -1) {
				this.anInt343 = -1;
				this.aBoolean82 = true;
				this.aBoolean73 = false;
				this.aBoolean60 = true;
			}
			if (this.anInt412 != -1) {
				this.anInt412 = -1;
				this.aBoolean52 = true;
				this.aBoolean73 = false;
			}
			this.anInt278 = -1;
		} catch (@Pc(42) RuntimeException local42) {
			signlink.reporterror("49112, " + arg0 + ", " + local42.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "A", descriptor = "(I)V")
	private void method205() {
		try {
			if (this.anInt400 == 3) {
				this.aBoolean56 = true;
				try {
					@Pc(9) long local9 = System.currentTimeMillis();
					@Pc(11) int local11 = 0;
					@Pc(13) int local13 = 20;
					while (this.aBoolean59) {
						this.anInt406++;
						this.method146((byte) 7);
						this.method146((byte) 7);
						this.method228();
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
				this.aBoolean56 = false;
			}
		} catch (@Pc(74) RuntimeException local74) {
			signlink.reporterror("50616, " + 3 + ", " + local74.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILclient!mb;Z)V")
	private void method206(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub1_Sub3 arg1) {
		try {
			this.aBoolean46 &= true;
			for (@Pc(9) int local9 = 0; local9 < this.anInt421; local9++) {
				@Pc(16) int local16 = this.anIntArray92[local9];
				@Pc(21) Class1_Sub1_Sub1_Sub1_Sub1 local21 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local16];
				@Pc(24) int local24 = arg1.method498();
				@Pc(32) int local32;
				@Pc(35) int local35;
				if ((local24 & 0x1) == 1) {
					local32 = arg1.method498();
					local35 = arg1.method498();
					local21.method50(local32, local35);
					local21.anInt144 = anInt446 + 300;
					local21.anInt145 = arg1.method498();
					local21.anInt146 = arg1.method498();
				}
				if ((local24 & 0x2) == 2) {
					local32 = arg1.method500();
					if (local32 == 65535) {
						local32 = -1;
					}
					if (local32 == local21.anInt153) {
						local21.anInt157 = 0;
					}
					local35 = arg1.method498();
					if (local32 == local21.anInt153 && local32 != -1) {
						@Pc(88) int local88 = Class27.aClass27Array1[local32].anInt808;
						if (local88 == 1) {
							local21.anInt154 = 0;
							local21.anInt155 = 0;
							local21.anInt156 = local35;
							local21.anInt157 = 0;
						}
						if (local88 == 2) {
							local21.anInt157 = 0;
						}
					} else if (local32 == -1 || local21.anInt153 == -1 || Class27.aClass27Array1[local32].anInt802 >= Class27.aClass27Array1[local21.anInt153].anInt802) {
						local21.anInt153 = local32;
						local21.anInt154 = 0;
						local21.anInt155 = 0;
						local21.anInt156 = local35;
						local21.anInt157 = 0;
						local21.anInt175 = local21.anInt173;
					}
				}
				if ((local24 & 0x4) == 4) {
					local21.anInt147 = arg1.method500();
					if (local21.anInt147 == 65535) {
						local21.anInt147 = -1;
					}
				}
				if ((local24 & 0x8) == 8) {
					local21.aString3 = arg1.method505();
					local21.anInt141 = 100;
				}
				if ((local24 & 0x10) == 16) {
					local32 = arg1.method498();
					local35 = arg1.method498();
					local21.method50(local32, local35);
					local21.anInt144 = anInt446 + 300;
					local21.anInt145 = arg1.method498();
					local21.anInt146 = arg1.method498();
				}
				if ((local24 & 0x20) == 32) {
					local21.aClass13_1 = Class13.method320(arg1.method500());
					local21.anInt136 = local21.aClass13_1.anInt574;
					local21.anInt137 = local21.aClass13_1.anInt575;
					local21.anInt138 = local21.aClass13_1.anInt576;
					local21.anInt139 = local21.aClass13_1.anInt577;
					local21.anInt134 = local21.aClass13_1.anInt573;
				}
				if ((local24 & 0x40) == 64) {
					local21.anInt158 = arg1.method500();
					local32 = arg1.method503();
					local21.anInt162 = local32 >> 16;
					local21.anInt161 = anInt446 + (local32 & 0xFFFF);
					local21.anInt159 = 0;
					local21.anInt160 = 0;
					if (local21.anInt161 > anInt446) {
						local21.anInt159 = -1;
					}
					if (local21.anInt158 == 65535) {
						local21.anInt158 = -1;
					}
				}
				if ((local24 & 0x80) == 128) {
					local21.anInt148 = arg1.method500();
					local21.anInt149 = arg1.method500();
				}
			}
		} catch (@Pc(303) RuntimeException local303) {
			signlink.reporterror("82093, " + arg0 + ", " + arg1 + ", " + true + ", " + local303.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Lclient!jb;III)V")
	private void method207(@OriginalArg(0) Class1_Sub1_Sub2_Sub2 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		try {
			@Pc(19) int local19 = this.anInt403 + this.anInt413 & 0x7FF;
			@Pc(27) int local27 = arg2 * arg2 + arg1 * arg1;
			if (local27 <= 6400) {
				@Pc(35) int local35 = Class1_Sub1_Sub1_Sub5.anIntArray158[local19];
				@Pc(39) int local39 = Class1_Sub1_Sub1_Sub5.anIntArray159[local19];
				@Pc(48) int local48 = local35 * 256 / (this.anInt359 + 256);
				@Pc(57) int local57 = local39 * 256 / (this.anInt359 + 256);
				@Pc(67) int local67 = arg1 * local48 + arg2 * local57 >> 16;
				@Pc(77) int local77 = arg1 * local57 - arg2 * local48 >> 16;
				if (local27 > 2500) {
					arg0.method412(83 - local77 - arg0.anInt684 / 2 - 4, (byte) 4, local67 + 94 + 4 - arg0.anInt683 / 2, this.aClass1_Sub1_Sub2_Sub3_12);
				} else {
					arg0.method406(83 - local77 - arg0.anInt684 / 2 - 4, local67 + 94 - arg0.anInt683 / 2 + 4);
				}
			}
		} catch (@Pc(131) RuntimeException local131) {
			signlink.reporterror("92136, " + arg0 + ", " + 4 + ", " + arg1 + ", " + arg2 + ", " + local131.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!kb;I)V")
	private void method208(@OriginalArg(0) Class1_Sub1_Sub2_Sub3 arg0) {
		try {
			for (@Pc(5) int local5 = 0; local5 < this.anIntArray77.length; local5++) {
				this.anIntArray77[local5] = 0;
			}
			@Pc(30) int local30;
			for (@Pc(20) int local20 = 0; local20 < 5000; local20++) {
				local30 = (int) (Math.random() * 128.0D * (double) 256);
				this.anIntArray77[local30] = (int) (Math.random() * 256.0D);
			}
			@Pc(54) int local54;
			@Pc(58) int local58;
			@Pc(66) int local66;
			for (local30 = 0; local30 < 20; local30++) {
				for (local54 = 1; local54 < 255; local54++) {
					for (local58 = 1; local58 < 127; local58++) {
						local66 = local58 + (local54 << 7);
						this.anIntArray78[local66] = (this.anIntArray77[local66 - 1] + this.anIntArray77[local66 + 1] + this.anIntArray77[local66 - 128] + this.anIntArray77[local66 + 128]) / 4;
					}
				}
				@Pc(112) int[] local112 = this.anIntArray77;
				this.anIntArray77 = this.anIntArray78;
				this.anIntArray78 = local112;
			}
			if (arg0 != null) {
				local54 = 0;
				for (local58 = 0; local58 < arg0.anInt710; local58++) {
					for (local66 = 0; local66 < arg0.anInt709; local66++) {
						if (arg0.aByteArray7[local54++] != 0) {
							@Pc(148) int local148 = local66 + arg0.anInt711 + 16;
							@Pc(155) int local155 = local58 + arg0.anInt712 + 16;
							@Pc(161) int local161 = local148 + (local155 << 7);
							this.anIntArray77[local161] = 0;
						}
					}
				}
			}
		} catch (@Pc(178) RuntimeException local178) {
			signlink.reporterror("24971, " + arg0 + ", " + 32758 + ", " + local178.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "t", descriptor = "(B)V")
	private void method209(@OriginalArg(0) byte arg0) {
		try {
			if (arg0 == 4) {
				@Pc(6) boolean local6 = false;
			} else {
				this.anInt423 = this.aClass1_Sub1_Sub3_3.method498();
			}
			for (@Pc(18) Class1_Sub1_Sub1_Sub6 local18 = (Class1_Sub1_Sub1_Sub6) this.aClass31_2.method523(); local18 != null; local18 = (Class1_Sub1_Sub1_Sub6) this.aClass31_2.method525()) {
				if (local18.anInt563 != this.anInt257 || local18.aBoolean137) {
					local18.method669();
				} else if (anInt446 >= local18.anInt562) {
					local18.method317(630, this.anInt301);
					if (local18.aBoolean137) {
						local18.method669();
					} else {
						this.aClass39_1.method555(local18, local18.anInt566, 0, -1, false, local18.anInt563, local18.anInt565, 60, this.anInt282, local18.anInt564);
					}
				}
			}
		} catch (@Pc(77) RuntimeException local77) {
			signlink.reporterror("38630, " + arg0 + ", " + local77.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(B)V")
	@Override
	protected void method91(@OriginalArg(0) byte arg0) {
		try {
			@Pc(6) boolean local6 = false;
			if (!this.aBoolean49 && !this.aBoolean70 && !this.aBoolean85) {
				anInt446++;
				if (this.aBoolean46) {
					this.method149(this.aBoolean78);
				} else {
					this.method178();
				}
				this.method159();
			}
		} catch (@Pc(46) RuntimeException local46) {
			signlink.reporterror("47445, " + arg0 + ", " + local46.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(ILclient!mb;I)V")
	private void method210(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub1_Sub3 arg1) {
		try {
			arg1.method508();
			@Pc(7) int local7 = arg1.method509(1);
			if (local7 != 0) {
				@Pc(21) int local21 = arg1.method509(2);
				if (local21 == 0) {
					this.anIntArray92[this.anInt421++] = this.anInt419;
				} else {
					@Pc(44) int local44;
					@Pc(54) int local54;
					if (local21 == 1) {
						local44 = arg1.method509(3);
						aClass1_Sub1_Sub1_Sub1_Sub2_1.method47(local44, false);
						local54 = arg1.method509(1);
						if (local54 == 1) {
							this.anIntArray92[this.anInt421++] = this.anInt419;
						}
					} else {
						@Pc(98) int local98;
						if (local21 == 2) {
							local44 = arg1.method509(3);
							aClass1_Sub1_Sub1_Sub1_Sub2_1.method47(local44, true);
							local54 = arg1.method509(3);
							aClass1_Sub1_Sub1_Sub1_Sub2_1.method47(local54, true);
							local98 = arg1.method509(1);
							if (local98 == 1) {
								this.anIntArray92[this.anInt421++] = this.anInt419;
							}
						} else if (local21 == 3) {
							this.anInt257 = arg1.method509(2);
							local44 = arg1.method509(7);
							local54 = arg1.method509(7);
							local98 = arg1.method509(1);
							aClass1_Sub1_Sub1_Sub1_Sub2_1.method46(local44, local98 == 1, local54);
							@Pc(154) int local154 = arg1.method509(1);
							if (local154 == 1) {
								this.anIntArray92[this.anInt421++] = this.anInt419;
							}
						}
					}
				}
			}
		} catch (@Pc(171) RuntimeException local171) {
			signlink.reporterror("84674, " + arg0 + ", " + arg1 + ", " + -16477 + ", " + local171.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/String;I)V")
	private void method211(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2) {
		try {
			if (arg0 == 0 && this.anInt331 != -1) {
				this.aString15 = arg2;
				super.anInt238 = 0;
			}
			if (this.anInt412 == -1) {
				this.aBoolean52 = true;
			}
			for (@Pc(20) int local20 = 99; local20 > 0; local20--) {
				this.anIntArray39[local20] = this.anIntArray39[local20 - 1];
				this.aStringArray2[local20] = this.aStringArray2[local20 - 1];
				this.aStringArray3[local20] = this.aStringArray3[local20 - 1];
			}
			this.anIntArray39[0] = arg0;
			this.aStringArray2[0] = arg1;
			this.aStringArray3[0] = arg2;
		} catch (@Pc(75) RuntimeException local75) {
			signlink.reporterror("63053, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 0 + ", " + local75.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "B", descriptor = "(I)V")
	private void method212(@OriginalArg(0) int arg0) {
		try {
			this.aBoolean59 = false;
			while (this.aBoolean56) {
				this.aBoolean59 = false;
				try {
					Thread.sleep(50L);
				} catch (@Pc(11) Exception local11) {
				}
			}
			this.aClass1_Sub1_Sub2_Sub3_9 = null;
			this.aClass1_Sub1_Sub2_Sub3_10 = null;
			this.aClass1_Sub1_Sub2_Sub3Array4 = null;
			this.anIntArray72 = null;
			this.anIntArray73 = null;
			this.anIntArray74 = null;
			@Pc(37) boolean local37 = false;
			this.anIntArray75 = null;
			this.anIntArray77 = null;
			this.anIntArray78 = null;
			this.anIntArray94 = null;
			this.anIntArray95 = null;
			this.aClass1_Sub1_Sub2_Sub2_7 = null;
			this.aClass1_Sub1_Sub2_Sub2_8 = null;
		} catch (@Pc(60) RuntimeException local60) {
			signlink.reporterror("57068, " + arg0 + ", " + local60.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "C", descriptor = "(I)V")
	private void method213() {
		try {
			if (this.anInt283 == 0 && this.anInt394 == 0) {
				this.aStringArray1[this.anInt365] = "Walk here";
				this.anIntArray49[this.anInt365] = 660;
				this.anIntArray47[this.anInt365] = super.anInt233;
				this.anIntArray48[this.anInt365] = super.anInt234;
				this.anInt365++;
			}
			@Pc(44) int local44 = -1;
			for (@Pc(46) int local46 = 0; local46 < Class1_Sub1_Sub1_Sub5.anInt556; local46++) {
				@Pc(52) int local52 = Class1_Sub1_Sub1_Sub5.anIntArray157[local46];
				@Pc(56) int local56 = local52 & 0x7F;
				@Pc(62) int local62 = local52 >> 7 & 0x7F;
				@Pc(68) int local68 = local52 >> 29 & 0x3;
				@Pc(74) int local74 = local52 >> 14 & 0x7FFF;
				if (local52 != local44) {
					local44 = local52;
					@Pc(212) int local212;
					if (local68 == 2 && this.aClass39_1.method574(this.anInt257, local56, local62, local52) >= 0) {
						@Pc(94) Class9 local94 = Class9.method258(local74);
						if (this.anInt283 == 1) {
							this.aStringArray1[this.anInt365] = "Use " + this.aString7 + " with @cya@" + local94.aString24;
							this.anIntArray49[this.anInt365] = 450;
							this.anIntArray50[this.anInt365] = local52;
							this.anIntArray47[this.anInt365] = local56;
							this.anIntArray48[this.anInt365] = local62;
							this.anInt365++;
						} else if (this.anInt394 != 1) {
							if (local94.aStringArray7 != null) {
								for (local212 = 4; local212 >= 0; local212--) {
									if (local94.aStringArray7[local212] != null) {
										this.aStringArray1[this.anInt365] = local94.aStringArray7[local212] + " @cya@" + local94.aString24;
										if (local212 == 0) {
											this.anIntArray49[this.anInt365] = 285;
										}
										if (local212 == 1) {
											this.anIntArray49[this.anInt365] = 504;
										}
										if (local212 == 2) {
											this.anIntArray49[this.anInt365] = 364;
										}
										if (local212 == 3) {
											this.anIntArray49[this.anInt365] = 581;
										}
										if (local212 == 4) {
											this.anIntArray49[this.anInt365] = 1501;
										}
										this.anIntArray50[this.anInt365] = local52;
										this.anIntArray47[this.anInt365] = local56;
										this.anIntArray48[this.anInt365] = local62;
										this.anInt365++;
									}
								}
							}
							this.aStringArray1[this.anInt365] = "Examine @cya@" + local94.aString24;
							this.anIntArray49[this.anInt365] = 1175;
							this.anIntArray50[this.anInt365] = local52;
							this.anIntArray47[this.anInt365] = local56;
							this.anIntArray48[this.anInt365] = local62;
							this.anInt365++;
						} else if ((this.anInt396 & 0x4) == 4) {
							this.aStringArray1[this.anInt365] = this.aString16 + " @cya@" + local94.aString24;
							this.anIntArray49[this.anInt365] = 55;
							this.anIntArray50[this.anInt365] = local52;
							this.anIntArray47[this.anInt365] = local56;
							this.anIntArray48[this.anInt365] = local62;
							this.anInt365++;
						}
					}
					@Pc(389) Class1_Sub1_Sub1_Sub1_Sub1 local389;
					if (local68 == 1) {
						@Pc(360) Class1_Sub1_Sub1_Sub1_Sub1 local360 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local74];
						if (local360.aClass13_1.aByte21 == 1 && (local360.anInt130 & 0x7F) == 64 && (local360.anInt131 & 0x7F) == 64) {
							for (local212 = 0; local212 < this.anInt389; local212++) {
								local389 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[this.anIntArray85[local212]];
								if (local389 != null && local389 != local360 && local389.aClass13_1.aByte21 == 1 && local389.anInt130 == local360.anInt130 && local389.anInt131 == local360.anInt131) {
									this.method179(local62, local389.aClass13_1, local56, this.anIntArray85[local212]);
								}
							}
						}
						this.method179(local62, local360.aClass13_1, local56, local74);
					}
					if (local68 == 0) {
						@Pc(440) Class1_Sub1_Sub1_Sub1_Sub2 local440 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local74];
						if ((local440.anInt130 & 0x7F) == 64 && (local440.anInt131 & 0x7F) == 64) {
							for (local212 = 0; local212 < this.anInt389; local212++) {
								local389 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[this.anIntArray85[local212]];
								if (local389 != null && local389.aClass13_1.aByte21 == 1 && local389.anInt130 == local440.anInt130 && local389.anInt131 == local440.anInt131) {
									this.method179(local62, local389.aClass13_1, local56, this.anIntArray85[local212]);
								}
							}
							for (@Pc(499) int local499 = 0; local499 < this.anInt420; local499++) {
								@Pc(509) Class1_Sub1_Sub1_Sub1_Sub2 local509 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[this.anIntArray91[local499]];
								if (local509 != null && local509 != local440 && local509.anInt130 == local440.anInt130 && local509.anInt131 == local440.anInt131) {
									this.method156(this.anIntArray91[local499], local56, local62, local509);
								}
							}
						}
						this.method156(local74, local56, local62, local440);
					}
					if (local68 == 3) {
						@Pc(559) Class31 local559 = this.aClass31ArrayArrayArray1[this.anInt257][local56][local62];
						if (local559 != null) {
							for (@Pc(566) Class1_Sub1_Sub1_Sub3 local566 = (Class1_Sub1_Sub1_Sub3) local559.method524(); local566 != null; local566 = (Class1_Sub1_Sub1_Sub3) local559.method526()) {
								@Pc(572) Class15 local572 = Class15.method345(local566.anInt482);
								if (this.anInt283 == 1) {
									this.aStringArray1[this.anInt365] = "Use " + this.aString7 + " with @lre@" + local572.aString26;
									this.anIntArray49[this.anInt365] = 217;
									this.anIntArray50[this.anInt365] = local566.anInt482;
									this.anIntArray47[this.anInt365] = local56;
									this.anIntArray48[this.anInt365] = local62;
									this.anInt365++;
								} else if (this.anInt394 != 1) {
									for (@Pc(689) int local689 = 4; local689 >= 0; local689--) {
										if (local572.aStringArray9 != null && local572.aStringArray9[local689] != null) {
											this.aStringArray1[this.anInt365] = local572.aStringArray9[local689] + " @lre@" + local572.aString26;
											if (local689 == 0) {
												this.anIntArray49[this.anInt365] = 224;
											}
											if (local689 == 1) {
												this.anIntArray49[this.anInt365] = 993;
											}
											if (local689 == 2) {
												this.anIntArray49[this.anInt365] = 99;
											}
											if (local689 == 3) {
												this.anIntArray49[this.anInt365] = 746;
											}
											if (local689 == 4) {
												this.anIntArray49[this.anInt365] = 877;
											}
											this.anIntArray50[this.anInt365] = local566.anInt482;
											this.anIntArray47[this.anInt365] = local56;
											this.anIntArray48[this.anInt365] = local62;
											this.anInt365++;
										} else if (local689 == 2) {
											this.aStringArray1[this.anInt365] = "Take @lre@" + local572.aString26;
											this.anIntArray49[this.anInt365] = 99;
											this.anIntArray50[this.anInt365] = local566.anInt482;
											this.anIntArray47[this.anInt365] = local56;
											this.anIntArray48[this.anInt365] = local62;
											this.anInt365++;
										}
									}
									this.aStringArray1[this.anInt365] = "Examine @lre@" + local572.aString26;
									this.anIntArray49[this.anInt365] = 1102;
									this.anIntArray50[this.anInt365] = local566.anInt482;
									this.anIntArray47[this.anInt365] = local56;
									this.anIntArray48[this.anInt365] = local62;
									this.anInt365++;
								} else if ((this.anInt396 & 0x1) == 1) {
									this.aStringArray1[this.anInt365] = this.aString16 + " @lre@" + local572.aString26;
									this.anIntArray49[this.anInt365] = 965;
									this.anIntArray50[this.anInt365] = local566.anInt482;
									this.anIntArray47[this.anInt365] = local56;
									this.anIntArray48[this.anInt365] = local62;
									this.anInt365++;
								}
							}
						}
					}
				}
			}
		} catch (@Pc(896) RuntimeException local896) {
			signlink.reporterror("95829, " + 715 + ", " + local896.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "D", descriptor = "(I)V")
	private void method214(@OriginalArg(0) int arg0) {
		try {
			this.aClass1_Sub1_Sub2_Sub3_9 = new Class1_Sub1_Sub2_Sub3(this.aClass48_1, "titlebox", 0);
			this.aClass1_Sub1_Sub2_Sub3_10 = new Class1_Sub1_Sub2_Sub3(this.aClass48_1, "titlebutton", 0);
			this.anInt422 += arg0;
			this.aClass1_Sub1_Sub2_Sub3Array4 = new Class1_Sub1_Sub2_Sub3[12];
			for (@Pc(31) int local31 = 0; local31 < 12; local31++) {
				this.aClass1_Sub1_Sub2_Sub3Array4[local31] = new Class1_Sub1_Sub2_Sub3(this.aClass48_1, "runes", local31);
			}
			this.aClass1_Sub1_Sub2_Sub2_7 = new Class1_Sub1_Sub2_Sub2(128, 265);
			this.aClass1_Sub1_Sub2_Sub2_8 = new Class1_Sub1_Sub2_Sub2(128, 265);
			for (@Pc(64) int local64 = 0; local64 < 33920; local64++) {
				this.aClass1_Sub1_Sub2_Sub2_7.anIntArray210[local64] = this.aClass37_15.anIntArray233[local64];
			}
			for (@Pc(82) int local82 = 0; local82 < 33920; local82++) {
				this.aClass1_Sub1_Sub2_Sub2_8.anIntArray210[local82] = this.aClass37_16.anIntArray233[local82];
			}
			this.anIntArray73 = new int[256];
			for (@Pc(104) int local104 = 0; local104 < 64; local104++) {
				this.anIntArray73[local104] = local104 * 262144;
			}
			for (@Pc(119) int local119 = 0; local119 < 64; local119++) {
				this.anIntArray73[local119 + 64] = local119 * 1024 + 16711680;
			}
			for (@Pc(138) int local138 = 0; local138 < 64; local138++) {
				this.anIntArray73[local138 + 128] = local138 * 4 + 16776960;
			}
			for (@Pc(157) int local157 = 0; local157 < 64; local157++) {
				this.anIntArray73[local157 + 192] = 16777215;
			}
			this.anIntArray74 = new int[256];
			for (@Pc(176) int local176 = 0; local176 < 64; local176++) {
				this.anIntArray74[local176] = local176 * 1024;
			}
			for (@Pc(191) int local191 = 0; local191 < 64; local191++) {
				this.anIntArray74[local191 + 64] = local191 * 4 + 65280;
			}
			for (@Pc(210) int local210 = 0; local210 < 64; local210++) {
				this.anIntArray74[local210 + 128] = local210 * 262144 + 65535;
			}
			for (@Pc(229) int local229 = 0; local229 < 64; local229++) {
				this.anIntArray74[local229 + 192] = 16777215;
			}
			this.anIntArray75 = new int[256];
			for (@Pc(248) int local248 = 0; local248 < 64; local248++) {
				this.anIntArray75[local248] = local248 * 4;
			}
			for (@Pc(263) int local263 = 0; local263 < 64; local263++) {
				this.anIntArray75[local263 + 64] = local263 * 262144 + 255;
			}
			for (@Pc(282) int local282 = 0; local282 < 64; local282++) {
				this.anIntArray75[local282 + 128] = local282 * 1024 + 16711935;
			}
			for (@Pc(301) int local301 = 0; local301 < 64; local301++) {
				this.anIntArray75[local301 + 192] = 16777215;
			}
			this.anIntArray72 = new int[256];
			this.anIntArray77 = new int[32768];
			this.anIntArray78 = new int[32768];
			this.method208(null);
			this.anIntArray94 = new int[32768];
			this.anIntArray95 = new int[32768];
			this.method97(638, "Connecting to fileserver", 10);
			if (!this.aBoolean59) {
				this.aBoolean64 = true;
				this.aBoolean59 = true;
				this.method96(this, 2);
			}
		} catch (@Pc(358) RuntimeException local358) {
			signlink.reporterror("49633, " + arg0 + ", " + local358.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "j", descriptor = "(II)V")
	private void method215(@OriginalArg(1) int arg0) {
		try {
			if (arg0 >= 0) {
				if (this.aBoolean62) {
					this.aBoolean62 = false;
					this.aBoolean52 = true;
				}
				@Pc(18) int local18 = this.anIntArray47[arg0];
				@Pc(23) int local23 = this.anIntArray48[arg0];
				@Pc(28) int local28 = this.anIntArray49[arg0];
				@Pc(33) int local33 = this.anIntArray50[arg0];
				if (local28 >= 2000) {
					local28 -= 2000;
				}
				if (local28 == 1501) {
					anInt386 += this.anInt313;
					if (anInt386 >= 92) {
						this.aClass1_Sub1_Sub3_4.method487(250);
						this.aClass1_Sub1_Sub3_4.method492(0);
					}
					this.method174(local33, 86, local23, local18);
				}
				if (local28 == 450 && this.method174(local33, 147, local23, local18)) {
					this.aClass1_Sub1_Sub3_4.method489(this.anInt286);
					this.aClass1_Sub1_Sub3_4.method489(this.anInt284);
					this.aClass1_Sub1_Sub3_4.method489(this.anInt285);
				}
				@Pc(99) String local99;
				@Pc(103) int local103;
				@Pc(114) long local114;
				@Pc(116) int local116;
				if (local28 == 679) {
					local99 = this.aStringArray1[arg0];
					local103 = local99.indexOf("@whi@");
					if (local103 != -1) {
						local114 = Class49.method679(local99.substring(local103 + 5).trim());
						local116 = -1;
						for (@Pc(118) int local118 = 0; local118 < this.anInt317; local118++) {
							if (this.aLongArray4[local118] == local114) {
								local116 = local118;
								break;
							}
						}
						if (local116 != -1 && this.anIntArray89[local116] > 0) {
							this.aBoolean52 = true;
							this.aBoolean62 = false;
							this.aBoolean44 = true;
							this.aString11 = "";
							this.anInt374 = 3;
							this.aLong18 = this.aLongArray4[local116];
							this.aString12 = "Enter message to send to " + this.aStringArray4[local116];
						}
					}
				}
				@Pc(209) String local209;
				if (local28 == 903 || local28 == 363) {
					local99 = this.aStringArray1[arg0];
					local103 = local99.indexOf("@whi@");
					if (local103 != -1) {
						local99 = local99.substring(local103 + 5).trim();
						local209 = Class49.method683(Class49.method680(Class49.method679(local99)));
						@Pc(211) boolean local211 = false;
						for (local116 = 0; local116 < this.anInt420; local116++) {
							@Pc(223) Class1_Sub1_Sub1_Sub1_Sub2 local223 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[this.anIntArray91[local116]];
							if (local223 != null && local223.aString4 != null && local223.aString4.equalsIgnoreCase(local209)) {
								this.method166(false, 1, 0, local223.anIntArray16[0], 0, 2, aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray16[0], 0, local223.anIntArray17[0], 1, aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray17[0]);
								if (local28 == 903) {
									this.aClass1_Sub1_Sub3_4.method487(54);
								}
								if (local28 == 363) {
									this.aClass1_Sub1_Sub3_4.method487(135);
								}
								this.aClass1_Sub1_Sub3_4.method489(this.anIntArray91[local116]);
								local211 = true;
								break;
							}
						}
						if (!local211) {
							this.method211(0, "", "Unable to find " + local209);
						}
					}
				}
				@Pc(314) Class1_Sub1_Sub1_Sub1_Sub2 local314;
				if (local28 == 367) {
					local314 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local33];
					if (local314 != null) {
						this.method166(false, 1, 0, local314.anIntArray16[0], 0, 2, aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray16[0], 0, local314.anIntArray17[0], 1, aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray17[0]);
						this.anInt442 = super.anInt239;
						this.anInt443 = super.anInt240;
						this.anInt445 = 2;
						this.anInt444 = 0;
						this.aClass1_Sub1_Sub3_4.method487(210);
						this.aClass1_Sub1_Sub3_4.method489(local33);
						this.aClass1_Sub1_Sub3_4.method489(this.anInt286);
						this.aClass1_Sub1_Sub3_4.method489(this.anInt284);
						this.aClass1_Sub1_Sub3_4.method489(this.anInt285);
					}
				}
				@Pc(389) Class1_Sub1_Sub1_Sub1_Sub1 local389;
				@Pc(402) String local402;
				if (local28 == 1607) {
					local389 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local33];
					if (local389 != null) {
						if (local389.aClass13_1.aByteArray5 == null) {
							local402 = "It's a " + local389.aClass13_1.aString25 + ".";
						} else {
							local402 = new String(local389.aClass13_1.aByteArray5);
						}
						this.method211(0, "", local402);
					}
				}
				@Pc(428) Class15 local428;
				if (local28 == 1102) {
					local428 = Class15.method345(local33);
					if (local428.aByteArray6 == null) {
						local402 = "It's a " + local428.aString26 + ".";
					} else {
						local402 = new String(local428.aByteArray6);
					}
					this.method211(0, "", local402);
				}
				if (local28 == 581) {
					if ((local33 & 0x3) == 0) {
						anInt304++;
					}
					if (anInt304 >= 99) {
						this.aClass1_Sub1_Sub3_4.method487(87);
						this.aClass1_Sub1_Sub3_4.method492(0);
					}
					this.method174(local33, 204, local23, local18);
				}
				@Pc(503) Class6 local503;
				if (local28 == 960) {
					this.aClass1_Sub1_Sub3_4.method487(177);
					this.aClass1_Sub1_Sub3_4.method489(local23);
					local503 = Class6.aClass6Array1[local23];
					if (local503.anIntArrayArray6 != null && local503.anIntArrayArray6[0][0] == 5) {
						local103 = local503.anIntArrayArray6[0][1];
						if (this.anIntArray71[local103] != local503.anIntArray99[0]) {
							this.anIntArray71[local103] = local503.anIntArray99[0];
							this.method194(local103);
							this.aBoolean82 = true;
						}
					}
				}
				if (local28 == 55 && this.method174(local33, 208, local23, local18)) {
					this.aClass1_Sub1_Sub3_4.method489(this.anInt395);
				}
				if (local28 == 947) {
					this.method204(251);
				}
				if (local28 == 951) {
					local503 = Class6.aClass6Array1[local23];
					@Pc(576) boolean local576 = true;
					if (local503.anInt454 > 0) {
						local576 = this.method115(local503);
					}
					if (local576) {
						this.aClass1_Sub1_Sub3_4.method487(177);
						this.aClass1_Sub1_Sub3_4.method489(local23);
					}
				}
				if (local28 == 1175) {
					@Pc(604) int local604 = local33 >> 14 & 0x7FFF;
					@Pc(607) Class9 local607 = Class9.method258(local604);
					if (local607.aByteArray4 == null) {
						local209 = "It's a " + local607.aString24 + ".";
					} else {
						local209 = new String(local607.aByteArray4);
					}
					this.method211(0, "", local209);
				}
				if (local28 == 504) {
					this.method174(local33, 219, local23, local18);
				}
				if (local28 == 1773) {
					local428 = Class15.method345(local33);
					@Pc(656) Class6 local656 = Class6.aClass6Array1[local23];
					if (local656 != null && local656.anIntArray97[local18] >= 100000) {
						local402 = local656.anIntArray97[local18] + " x " + local428.aString26;
					} else if (local428.aByteArray6 == null) {
						local402 = "It's a " + local428.aString26 + ".";
					} else {
						local402 = new String(local428.aByteArray6);
					}
					this.method211(0, "", local402);
				}
				if (local28 == 660) {
					if (this.aBoolean61) {
						this.aClass39_1.method582(local18 - 4, local23 - 4);
					} else {
						this.aClass39_1.method582(super.anInt239 - 4, super.anInt240 - 4);
					}
				}
				if (local28 == 728 || local28 == 542 || local28 == 6 || local28 == 963 || local28 == 245) {
					local389 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local33];
					if (local389 != null) {
						this.method166(false, 1, 0, local389.anIntArray16[0], 0, 2, aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray16[0], 0, local389.anIntArray17[0], 1, aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray17[0]);
						this.anInt442 = super.anInt239;
						this.anInt443 = super.anInt240;
						this.anInt445 = 2;
						this.anInt444 = 0;
						if (local28 == 728) {
							this.aClass1_Sub1_Sub3_4.method487(180);
						}
						if (local28 == 963) {
							this.aClass1_Sub1_Sub3_4.method487(107);
						}
						if (local28 == 6) {
							if ((local33 & 0x3) == 0) {
								anInt380++;
							}
							if (anInt380 >= 124) {
								this.aClass1_Sub1_Sub3_4.method487(95);
								this.aClass1_Sub1_Sub3_4.method492(0);
							}
							this.aClass1_Sub1_Sub3_4.method487(196);
						}
						if (local28 == 542) {
							this.aClass1_Sub1_Sub3_4.method487(252);
						}
						if (local28 == 245) {
							if ((local33 & 0x3) == 0) {
								anInt252++;
							}
							if (anInt252 >= 85) {
								this.aClass1_Sub1_Sub3_4.method487(186);
								this.aClass1_Sub1_Sub3_4.method489(39596);
							}
							this.aClass1_Sub1_Sub3_4.method487(43);
						}
						this.aClass1_Sub1_Sub3_4.method489(local33);
					}
				}
				if (local28 == 1373 || local28 == 1544 || local28 == 151 || local28 == 1101) {
					local314 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local33];
					if (local314 != null) {
						this.method166(false, 1, 0, local314.anIntArray16[0], 0, 2, aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray16[0], 0, local314.anIntArray17[0], 1, aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray17[0]);
						this.anInt442 = super.anInt239;
						this.anInt443 = super.anInt240;
						this.anInt445 = 2;
						this.anInt444 = 0;
						if (local28 == 1544) {
							this.aClass1_Sub1_Sub3_4.method487(172);
						}
						if (local28 == 1101) {
							this.aClass1_Sub1_Sub3_4.method487(135);
						}
						if (local28 == 151) {
							anInt361++;
							if (anInt361 >= 90) {
								this.aClass1_Sub1_Sub3_4.method487(171);
								this.aClass1_Sub1_Sub3_4.method489(31114);
							}
							this.aClass1_Sub1_Sub3_4.method487(165);
						}
						if (local28 == 1373) {
							this.aClass1_Sub1_Sub3_4.method487(54);
						}
						this.aClass1_Sub1_Sub3_4.method489(local33);
					}
				}
				if (local28 == 465) {
					this.aClass1_Sub1_Sub3_4.method487(177);
					this.aClass1_Sub1_Sub3_4.method489(local23);
					local503 = Class6.aClass6Array1[local23];
					if (local503.anIntArrayArray6 != null && local503.anIntArrayArray6[0][0] == 5) {
						local103 = local503.anIntArrayArray6[0][1];
						this.anIntArray71[local103] = 1 - this.anIntArray71[local103];
						this.method194(local103);
						this.aBoolean82 = true;
					}
				}
				if (local28 == 406 || local28 == 436 || local28 == 557 || local28 == 556) {
					local99 = this.aStringArray1[arg0];
					local103 = local99.indexOf("@whi@");
					if (local103 != -1) {
						local114 = Class49.method679(local99.substring(local103 + 5).trim());
						if (local28 == 406) {
							this.method168(local114, (byte) 5);
						}
						if (local28 == 436) {
							this.method126(local114);
						}
						if (local28 == 557) {
							this.method203(local114);
						}
						if (local28 == 556) {
							this.method152(local114);
						}
					}
				}
				@Pc(1133) boolean local1133;
				if (local28 == 217) {
					local1133 = this.method166(false, 0, 0, local18, 0, 2, aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray16[0], 0, local23, 0, aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray17[0]);
					if (!local1133) {
						this.method166(false, 1, 0, local18, 0, 2, aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray16[0], 0, local23, 1, aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray17[0]);
					}
					this.anInt442 = super.anInt239;
					this.anInt443 = super.anInt240;
					this.anInt445 = 2;
					this.anInt444 = 0;
					this.aClass1_Sub1_Sub3_4.method487(143);
					this.aClass1_Sub1_Sub3_4.method489(local18 + this.anInt312);
					this.aClass1_Sub1_Sub3_4.method489(local23 + this.anInt313);
					this.aClass1_Sub1_Sub3_4.method489(local33);
					this.aClass1_Sub1_Sub3_4.method489(this.anInt286);
					this.aClass1_Sub1_Sub3_4.method489(this.anInt284);
					this.aClass1_Sub1_Sub3_4.method489(this.anInt285);
				}
				if (local28 == 405 || local28 == 38 || local28 == 422 || local28 == 478 || local28 == 347) {
					if (local28 == 347) {
						this.aClass1_Sub1_Sub3_4.method487(9);
					}
					if (local28 == 405) {
						anInt358 += local33;
						if (anInt358 >= 97) {
							this.aClass1_Sub1_Sub3_4.method487(146);
							this.aClass1_Sub1_Sub3_4.method491(14953816);
						}
						this.aClass1_Sub1_Sub3_4.method487(104);
					}
					if (local28 == 478) {
						if ((local18 & 0x3) == 0) {
							anInt265++;
						}
						if (anInt265 >= 90) {
							this.aClass1_Sub1_Sub3_4.method487(74);
						}
						this.aClass1_Sub1_Sub3_4.method487(194);
					}
					if (local28 == 422) {
						this.aClass1_Sub1_Sub3_4.method487(115);
					}
					if (local28 == 38) {
						this.aClass1_Sub1_Sub3_4.method487(193);
					}
					this.aClass1_Sub1_Sub3_4.method489(local33);
					this.aClass1_Sub1_Sub3_4.method489(local18);
					this.aClass1_Sub1_Sub3_4.method489(local23);
					this.anInt268 = 0;
					this.anInt269 = local23;
					this.anInt270 = local18;
					this.anInt271 = 2;
					if (Class6.aClass6Array1[local23].anInt451 == this.anInt278) {
						this.anInt271 = 1;
					}
					if (Class6.aClass6Array1[local23].anInt451 == this.anInt412) {
						this.anInt271 = 3;
					}
				}
				if (local28 == 265) {
					local389 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local33];
					if (local389 != null) {
						this.method166(false, 1, 0, local389.anIntArray16[0], 0, 2, aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray16[0], 0, local389.anIntArray17[0], 1, aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray17[0]);
						this.anInt442 = super.anInt239;
						this.anInt443 = super.anInt240;
						this.anInt445 = 2;
						this.anInt444 = 0;
						this.aClass1_Sub1_Sub3_4.method487(141);
						this.aClass1_Sub1_Sub3_4.method489(local33);
						this.aClass1_Sub1_Sub3_4.method489(this.anInt395);
					}
				}
				if (local28 == 900) {
					local389 = this.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local33];
					if (local389 != null) {
						this.method166(false, 1, 0, local389.anIntArray16[0], 0, 2, aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray16[0], 0, local389.anIntArray17[0], 1, aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray17[0]);
						this.anInt442 = super.anInt239;
						this.anInt443 = super.anInt240;
						this.anInt445 = 2;
						this.anInt444 = 0;
						this.aClass1_Sub1_Sub3_4.method487(14);
						this.aClass1_Sub1_Sub3_4.method489(local33);
						this.aClass1_Sub1_Sub3_4.method489(this.anInt286);
						this.aClass1_Sub1_Sub3_4.method489(this.anInt284);
						this.aClass1_Sub1_Sub3_4.method489(this.anInt285);
					}
				}
				if (local28 == 881) {
					this.aClass1_Sub1_Sub3_4.method487(126);
					this.aClass1_Sub1_Sub3_4.method489(local33);
					this.aClass1_Sub1_Sub3_4.method489(local18);
					this.aClass1_Sub1_Sub3_4.method489(local23);
					this.aClass1_Sub1_Sub3_4.method489(this.anInt286);
					this.aClass1_Sub1_Sub3_4.method489(this.anInt284);
					this.aClass1_Sub1_Sub3_4.method489(this.anInt285);
					this.anInt268 = 0;
					this.anInt269 = local23;
					this.anInt270 = local18;
					this.anInt271 = 2;
					if (Class6.aClass6Array1[local23].anInt451 == this.anInt278) {
						this.anInt271 = 1;
					}
					if (Class6.aClass6Array1[local23].anInt451 == this.anInt412) {
						this.anInt271 = 3;
					}
				}
				if (local28 == 965) {
					local1133 = this.method166(false, 0, 0, local18, 0, 2, aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray16[0], 0, local23, 0, aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray17[0]);
					if (!local1133) {
						this.method166(false, 1, 0, local18, 0, 2, aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray16[0], 0, local23, 1, aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray17[0]);
					}
					this.anInt442 = super.anInt239;
					this.anInt443 = super.anInt240;
					this.anInt445 = 2;
					this.anInt444 = 0;
					this.aClass1_Sub1_Sub3_4.method487(122);
					this.aClass1_Sub1_Sub3_4.method489(local18 + this.anInt312);
					this.aClass1_Sub1_Sub3_4.method489(local23 + this.anInt313);
					this.aClass1_Sub1_Sub3_4.method489(local33);
					this.aClass1_Sub1_Sub3_4.method489(this.anInt395);
				}
				if (local28 == 930) {
					local503 = Class6.aClass6Array1[local23];
					this.anInt394 = 1;
					this.anInt395 = local23;
					this.anInt396 = local503.anInt478;
					this.anInt283 = 0;
					this.aBoolean82 = true;
					local402 = local503.aString21;
					if (local402.indexOf(" ") != -1) {
						local402 = local402.substring(0, local402.indexOf(" "));
					}
					local209 = local503.aString21;
					if (local209.indexOf(" ") != -1) {
						local209 = local209.substring(local209.indexOf(" ") + 1);
					}
					this.aString16 = local402 + " " + local503.aString22 + " " + local209;
					if (this.anInt396 == 16) {
						this.aBoolean82 = true;
						this.anInt263 = 3;
						this.aBoolean60 = true;
					}
				} else if (local28 == 188) {
					this.anInt283 = 1;
					this.anInt284 = local18;
					this.anInt285 = local23;
					this.anInt286 = local33;
					this.aString7 = Class15.method345(local33).aString26;
					this.anInt394 = 0;
					this.aBoolean82 = true;
				} else {
					if (local28 == 364) {
						this.method174(local33, 226, local23, local18);
					}
					if (local28 == 224 || local28 == 993 || local28 == 99 || local28 == 746 || local28 == 877) {
						local1133 = this.method166(false, 0, 0, local18, 0, 2, aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray16[0], 0, local23, 0, aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray17[0]);
						if (!local1133) {
							this.method166(false, 1, 0, local18, 0, 2, aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray16[0], 0, local23, 1, aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray17[0]);
						}
						this.anInt442 = super.anInt239;
						this.anInt443 = super.anInt240;
						this.anInt445 = 2;
						this.anInt444 = 0;
						if (local28 == 993) {
							this.aClass1_Sub1_Sub3_4.method487(238);
						}
						if (local28 == 746) {
							this.aClass1_Sub1_Sub3_4.method487(17);
						}
						if (local28 == 224) {
							this.aClass1_Sub1_Sub3_4.method487(113);
						}
						if (local28 == 877) {
							this.aClass1_Sub1_Sub3_4.method487(247);
						}
						if (local28 == 99) {
							this.aClass1_Sub1_Sub3_4.method487(55);
						}
						this.aClass1_Sub1_Sub3_4.method489(local18 + this.anInt312);
						this.aClass1_Sub1_Sub3_4.method489(local23 + this.anInt313);
						this.aClass1_Sub1_Sub3_4.method489(local33);
					}
					if (local28 == 44 && !this.aBoolean73) {
						this.aClass1_Sub1_Sub3_4.method487(239);
						this.aClass1_Sub1_Sub3_4.method489(local23);
						this.aBoolean73 = true;
					}
					if (local28 == 391) {
						this.aClass1_Sub1_Sub3_4.method487(188);
						this.aClass1_Sub1_Sub3_4.method489(local33);
						this.aClass1_Sub1_Sub3_4.method489(local18);
						this.aClass1_Sub1_Sub3_4.method489(local23);
						this.aClass1_Sub1_Sub3_4.method489(this.anInt395);
						this.anInt268 = 0;
						this.anInt269 = local23;
						this.anInt270 = local18;
						this.anInt271 = 2;
						if (Class6.aClass6Array1[local23].anInt451 == this.anInt278) {
							this.anInt271 = 1;
						}
						if (Class6.aClass6Array1[local23].anInt451 == this.anInt412) {
							this.anInt271 = 3;
						}
					}
					if (local28 == 651) {
						local314 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local33];
						if (local314 != null) {
							this.method166(false, 1, 0, local314.anIntArray16[0], 0, 2, aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray16[0], 0, local314.anIntArray17[0], 1, aClass1_Sub1_Sub1_Sub1_Sub2_1.anIntArray17[0]);
							this.anInt442 = super.anInt239;
							this.anInt443 = super.anInt240;
							this.anInt445 = 2;
							this.anInt444 = 0;
							this.aClass1_Sub1_Sub3_4.method487(52);
							this.aClass1_Sub1_Sub3_4.method489(local33);
							this.aClass1_Sub1_Sub3_4.method489(this.anInt395);
						}
					}
					if (local28 == 34) {
						local99 = this.aStringArray1[arg0];
						local103 = local99.indexOf("@whi@");
						if (local103 != -1) {
							this.method204(251);
							this.aString8 = local99.substring(local103 + 5).trim();
							this.aBoolean72 = false;
							for (@Pc(2060) int local2060 = 0; local2060 < Class6.aClass6Array1.length; local2060++) {
								if (Class6.aClass6Array1[local2060] != null && Class6.aClass6Array1[local2060].anInt454 == 600) {
									this.anInt332 = this.anInt278 = Class6.aClass6Array1[local2060].anInt451;
									break;
								}
							}
						}
					}
					if (local28 == 602 || local28 == 596 || local28 == 22 || local28 == 892 || local28 == 415) {
						if (local28 == 415) {
							if ((local23 & 0x3) == 0) {
								anInt266++;
							}
							if (anInt266 >= 55) {
								this.aClass1_Sub1_Sub3_4.method487(119);
								this.aClass1_Sub1_Sub3_4.method492(0);
							}
							this.aClass1_Sub1_Sub3_4.method487(242);
						}
						if (local28 == 892) {
							if ((local18 & 0x3) == 0) {
								anInt337++;
							}
							if (anInt337 >= 130) {
								this.aClass1_Sub1_Sub3_4.method487(233);
								this.aClass1_Sub1_Sub3_4.method488(177);
							}
							this.aClass1_Sub1_Sub3_4.method487(183);
						}
						if (local28 == 596) {
							this.aClass1_Sub1_Sub3_4.method487(58);
						}
						if (local28 == 22) {
							this.aClass1_Sub1_Sub3_4.method487(48);
						}
						if (local28 == 602) {
							this.aClass1_Sub1_Sub3_4.method487(13);
						}
						this.aClass1_Sub1_Sub3_4.method489(local33);
						this.aClass1_Sub1_Sub3_4.method489(local18);
						this.aClass1_Sub1_Sub3_4.method489(local23);
						this.anInt268 = 0;
						this.anInt269 = local23;
						this.anInt270 = local18;
						this.anInt271 = 2;
						if (Class6.aClass6Array1[local23].anInt451 == this.anInt278) {
							this.anInt271 = 1;
						}
						if (Class6.aClass6Array1[local23].anInt451 == this.anInt412) {
							this.anInt271 = 3;
						}
					}
					if (local28 == 285) {
						this.method174(local33, 1, local23, local18);
					}
					this.anInt283 = 0;
					this.anInt394 = 0;
					this.aBoolean82 = true;
				}
			}
		} catch (@Pc(2259) RuntimeException local2259) {
			signlink.reporterror("63573, " + 0 + ", " + arg0 + ", " + local2259.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!ob;I)V")
	private void method216(@OriginalArg(0) Class1_Sub2 arg0) {
		try {
			@Pc(14) int local14 = 0;
			@Pc(16) int local16 = -1;
			@Pc(18) int local18 = 0;
			@Pc(20) int local20 = 0;
			if (arg0.anInt814 == 0) {
				local14 = this.aClass39_1.method570(arg0.anInt813, arg0.anInt815, arg0.anInt816);
			}
			if (arg0.anInt814 == 1) {
				local14 = this.aClass39_1.method571(arg0.anInt815, arg0.anInt816, arg0.anInt813);
			}
			if (arg0.anInt814 == 2) {
				local14 = this.aClass39_1.method572(arg0.anInt813, arg0.anInt815, arg0.anInt816);
			}
			if (arg0.anInt814 == 3) {
				local14 = this.aClass39_1.method573(arg0.anInt813, arg0.anInt815, arg0.anInt816);
			}
			if (local14 != 0) {
				@Pc(89) int local89 = this.aClass39_1.method574(arg0.anInt813, arg0.anInt815, arg0.anInt816, local14);
				local16 = local14 >> 14 & 0x7FFF;
				local18 = local89 & 0x1F;
				local20 = local89 >> 6;
			}
			arg0.anInt817 = local16;
			arg0.anInt819 = local18;
			arg0.anInt818 = local20;
		} catch (@Pc(114) RuntimeException local114) {
			signlink.reporterror("23434, " + arg0 + ", " + -388 + ", " + local114.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIIIILclient!d;)V")
	private void method217(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class6 arg6) {
		try {
			if (arg6.anInt452 == 0 && arg6.anIntArray100 != null && !arg6.aBoolean89 && (arg4 >= arg2 && arg5 >= arg0 && arg4 <= arg2 + arg6.anInt455 && arg5 <= arg0 + arg6.anInt456)) {
				@Pc(34) int local34 = arg6.anIntArray100.length;
				if (arg1 < 0) {
					for (@Pc(39) int local39 = 0; local39 < local34; local39++) {
						@Pc(48) int local48 = arg6.anIntArray101[local39] + arg2;
						@Pc(57) int local57 = arg6.anIntArray102[local39] + arg0 - arg3;
						@Pc(64) Class6 local64 = Class6.aClass6Array1[arg6.anIntArray100[local39]];
						@Pc(69) int local69 = local48 + local64.anInt457;
						@Pc(74) int local74 = local57 + local64.anInt458;
						if ((local64.anInt459 >= 0 || local64.anInt467 != 0) && arg4 >= local69 && arg5 >= local74 && arg4 < local69 + local64.anInt455 && arg5 < local74 + local64.anInt456) {
							if (local64.anInt459 >= 0) {
								this.anInt259 = local64.anInt459;
							} else {
								this.anInt259 = local64.anInt450;
							}
						}
						if (local64.anInt452 == 0) {
							this.method217(local74, this.anInt323, local69, local64.anInt461, arg4, arg5, local64);
							if (local64.anInt460 > local64.anInt456) {
								this.method219(local64.anInt456, true, local69 + local64.anInt455, arg5, local64, local74, arg4, local64.anInt460);
							}
						} else {
							if (local64.anInt453 == 1 && arg4 >= local69 && arg5 >= local74 && arg4 < local69 + local64.anInt455 && arg5 < local74 + local64.anInt456) {
								@Pc(172) boolean local172 = false;
								if (local64.anInt454 != 0) {
									local172 = this.method169(local64);
								}
								if (!local172) {
									this.aStringArray1[this.anInt365] = local64.aString23;
									this.anIntArray49[this.anInt365] = 951;
									this.anIntArray48[this.anInt365] = local64.anInt450;
									this.anInt365++;
								}
							}
							if (local64.anInt453 == 2 && this.anInt394 == 0 && arg4 >= local69 && arg5 >= local74 && arg4 < local69 + local64.anInt455 && arg5 < local74 + local64.anInt456) {
								@Pc(236) String local236 = local64.aString21;
								if (local236.indexOf(" ") != -1) {
									local236 = local236.substring(0, local236.indexOf(" "));
								}
								this.aStringArray1[this.anInt365] = local236 + " @gre@" + local64.aString22;
								this.anIntArray49[this.anInt365] = 930;
								this.anIntArray48[this.anInt365] = local64.anInt450;
								this.anInt365++;
							}
							if (local64.anInt453 == 3 && arg4 >= local69 && arg5 >= local74 && arg4 < local69 + local64.anInt455 && arg5 < local74 + local64.anInt456) {
								this.aStringArray1[this.anInt365] = "Close";
								this.anIntArray49[this.anInt365] = 947;
								this.anIntArray48[this.anInt365] = local64.anInt450;
								this.anInt365++;
							}
							if (local64.anInt453 == 4 && arg4 >= local69 && arg5 >= local74 && arg4 < local69 + local64.anInt455 && arg5 < local74 + local64.anInt456) {
								this.aStringArray1[this.anInt365] = local64.aString23;
								this.anIntArray49[this.anInt365] = 465;
								this.anIntArray48[this.anInt365] = local64.anInt450;
								this.anInt365++;
							}
							if (local64.anInt453 == 5 && arg4 >= local69 && arg5 >= local74 && arg4 < local69 + local64.anInt455 && arg5 < local74 + local64.anInt456) {
								this.aStringArray1[this.anInt365] = local64.aString23;
								this.anIntArray49[this.anInt365] = 960;
								this.anIntArray48[this.anInt365] = local64.anInt450;
								this.anInt365++;
							}
							if (local64.anInt453 == 6 && !this.aBoolean73 && arg4 >= local69 && arg5 >= local74 && arg4 < local69 + local64.anInt455 && arg5 < local74 + local64.anInt456) {
								this.aStringArray1[this.anInt365] = local64.aString23;
								this.anIntArray49[this.anInt365] = 44;
								this.anIntArray48[this.anInt365] = local64.anInt450;
								this.anInt365++;
							}
							if (local64.anInt452 == 2) {
								@Pc(484) int local484 = 0;
								for (@Pc(486) int local486 = 0; local486 < local64.anInt456; local486++) {
									for (@Pc(490) int local490 = 0; local490 < local64.anInt455; local490++) {
										@Pc(501) int local501 = local69 + local490 * (local64.anInt463 + 32);
										@Pc(510) int local510 = local74 + local486 * (local64.anInt464 + 32);
										if (local484 < 20) {
											local501 += local64.anIntArray103[local484];
											local510 += local64.anIntArray104[local484];
										}
										if (arg4 >= local501 && arg5 >= local510 && arg4 < local501 + 32 && arg5 < local510 + 32) {
											this.anInt280 = local484;
											this.anInt281 = local64.anInt450;
											if (local64.anIntArray96[local484] > 0) {
												@Pc(563) Class15 local563 = Class15.method345(local64.anIntArray96[local484] - 1);
												if (this.anInt283 == 1 && local64.aBoolean92) {
													if (local64.anInt450 != this.anInt285 || local484 != this.anInt284) {
														this.aStringArray1[this.anInt365] = "Use " + this.aString7 + " with @lre@" + local563.aString26;
														this.anIntArray49[this.anInt365] = 881;
														this.anIntArray50[this.anInt365] = local563.anInt605;
														this.anIntArray47[this.anInt365] = local484;
														this.anIntArray48[this.anInt365] = local64.anInt450;
														this.anInt365++;
													}
												} else if (this.anInt394 != 1 || !local64.aBoolean92) {
													@Pc(700) int local700;
													if (local64.aBoolean92) {
														for (local700 = 4; local700 >= 3; local700--) {
															if (local563.aStringArray10 != null && local563.aStringArray10[local700] != null) {
																this.aStringArray1[this.anInt365] = local563.aStringArray10[local700] + " @lre@" + local563.aString26;
																if (local700 == 3) {
																	this.anIntArray49[this.anInt365] = 478;
																}
																if (local700 == 4) {
																	this.anIntArray49[this.anInt365] = 347;
																}
																this.anIntArray50[this.anInt365] = local563.anInt605;
																this.anIntArray47[this.anInt365] = local484;
																this.anIntArray48[this.anInt365] = local64.anInt450;
																this.anInt365++;
															} else if (local700 == 4) {
																this.aStringArray1[this.anInt365] = "Drop @lre@" + local563.aString26;
																this.anIntArray49[this.anInt365] = 347;
																this.anIntArray50[this.anInt365] = local563.anInt605;
																this.anIntArray47[this.anInt365] = local484;
																this.anIntArray48[this.anInt365] = local64.anInt450;
																this.anInt365++;
															}
														}
													}
													if (local64.aBoolean93) {
														this.aStringArray1[this.anInt365] = "Use @lre@" + local563.aString26;
														this.anIntArray49[this.anInt365] = 188;
														this.anIntArray50[this.anInt365] = local563.anInt605;
														this.anIntArray47[this.anInt365] = local484;
														this.anIntArray48[this.anInt365] = local64.anInt450;
														this.anInt365++;
													}
													if (local64.aBoolean92 && local563.aStringArray10 != null) {
														for (local700 = 2; local700 >= 0; local700--) {
															if (local563.aStringArray10[local700] != null) {
																this.aStringArray1[this.anInt365] = local563.aStringArray10[local700] + " @lre@" + local563.aString26;
																if (local700 == 0) {
																	this.anIntArray49[this.anInt365] = 405;
																}
																if (local700 == 1) {
																	this.anIntArray49[this.anInt365] = 38;
																}
																if (local700 == 2) {
																	this.anIntArray49[this.anInt365] = 422;
																}
																this.anIntArray50[this.anInt365] = local563.anInt605;
																this.anIntArray47[this.anInt365] = local484;
																this.anIntArray48[this.anInt365] = local64.anInt450;
																this.anInt365++;
															}
														}
													}
													if (local64.aStringArray6 != null) {
														for (local700 = 4; local700 >= 0; local700--) {
															if (local64.aStringArray6[local700] != null) {
																this.aStringArray1[this.anInt365] = local64.aStringArray6[local700] + " @lre@" + local563.aString26;
																if (local700 == 0) {
																	this.anIntArray49[this.anInt365] = 602;
																}
																if (local700 == 1) {
																	this.anIntArray49[this.anInt365] = 596;
																}
																if (local700 == 2) {
																	this.anIntArray49[this.anInt365] = 22;
																}
																if (local700 == 3) {
																	this.anIntArray49[this.anInt365] = 892;
																}
																if (local700 == 4) {
																	this.anIntArray49[this.anInt365] = 415;
																}
																this.anIntArray50[this.anInt365] = local563.anInt605;
																this.anIntArray47[this.anInt365] = local484;
																this.anIntArray48[this.anInt365] = local64.anInt450;
																this.anInt365++;
															}
														}
													}
													this.aStringArray1[this.anInt365] = "Examine @lre@" + local563.aString26;
													this.anIntArray49[this.anInt365] = 1773;
													this.anIntArray50[this.anInt365] = local563.anInt605;
													this.anIntArray47[this.anInt365] = local484;
													this.anIntArray48[this.anInt365] = local64.anInt450;
													this.anInt365++;
												} else if ((this.anInt396 & 0x10) == 16) {
													this.aStringArray1[this.anInt365] = this.aString16 + " @lre@" + local563.aString26;
													this.anIntArray49[this.anInt365] = 391;
													this.anIntArray50[this.anInt365] = local563.anInt605;
													this.anIntArray47[this.anInt365] = local484;
													this.anIntArray48[this.anInt365] = local64.anInt450;
													this.anInt365++;
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
			}
		} catch (@Pc(1130) RuntimeException local1130) {
			signlink.reporterror("11548, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + local1130.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "E", descriptor = "(I)V")
	private void method218(@OriginalArg(0) int arg0) {
		try {
			@Pc(6) int local6 = this.anInt429 * 128 + 64;
			@Pc(13) int local13 = this.anInt430 * 128 + 64;
			@Pc(24) int local24 = this.method151(local13, this.anInt257, local6, (byte) 6) - this.anInt431;
			if (this.anInt289 < local6) {
				this.anInt289 += this.anInt432 + (local6 - this.anInt289) * this.anInt433 / 1000;
				if (this.anInt289 > local6) {
					this.anInt289 = local6;
				}
			}
			if (this.anInt289 > local6) {
				this.anInt289 -= this.anInt432 + (this.anInt289 - local6) * this.anInt433 / 1000;
				if (this.anInt289 < local6) {
					this.anInt289 = local6;
				}
			}
			if (this.anInt290 < local24) {
				this.anInt290 += this.anInt432 + (local24 - this.anInt290) * this.anInt433 / 1000;
				if (this.anInt290 > local24) {
					this.anInt290 = local24;
				}
			}
			if (this.anInt290 > local24) {
				this.anInt290 -= this.anInt432 + (this.anInt290 - local24) * this.anInt433 / 1000;
				if (this.anInt290 < local24) {
					this.anInt290 = local24;
				}
			}
			if (this.anInt291 < local13) {
				this.anInt291 += this.anInt432 + (local13 - this.anInt291) * this.anInt433 / 1000;
				if (this.anInt291 > local13) {
					this.anInt291 = local13;
				}
			}
			if (this.anInt291 > local13) {
				this.anInt291 -= this.anInt432 + (this.anInt291 - local13) * this.anInt433 / 1000;
				if (this.anInt291 < local13) {
					this.anInt291 = local13;
				}
			}
			local6 = this.anInt273 * 128 + 64;
			local13 = this.anInt274 * 128 + 64;
			local24 = this.method151(local13, this.anInt257, local6, (byte) 6) - this.anInt275;
			if (arg0 <= 0) {
				this.anInt387 = -244;
			}
			@Pc(227) int local227 = local6 - this.anInt289;
			@Pc(232) int local232 = local24 - this.anInt290;
			@Pc(237) int local237 = local13 - this.anInt291;
			@Pc(248) int local248 = (int) Math.sqrt((double) (local227 * local227 + local237 * local237));
			@Pc(259) int local259 = (int) (Math.atan2((double) local232, (double) local248) * 325.949D) & 0x7FF;
			@Pc(270) int local270 = (int) (Math.atan2((double) local227, (double) local237) * -325.949D) & 0x7FF;
			if (local259 < 128) {
				local259 = 128;
			}
			if (local259 > 383) {
				local259 = 383;
			}
			if (this.anInt292 < local259) {
				this.anInt292 += this.anInt276 + (local259 - this.anInt292) * this.anInt277 / 1000;
				if (this.anInt292 > local259) {
					this.anInt292 = local259;
				}
			}
			if (this.anInt292 > local259) {
				this.anInt292 -= this.anInt276 + (this.anInt292 - local259) * this.anInt277 / 1000;
				if (this.anInt292 < local259) {
					this.anInt292 = local259;
				}
			}
			@Pc(341) int local341 = local270 - this.anInt293;
			if (local341 > 1024) {
				local341 -= 2048;
			}
			if (local341 < -1024) {
				local341 += 2048;
			}
			if (local341 > 0) {
				this.anInt293 += this.anInt276 + local341 * this.anInt277 / 1000;
				this.anInt293 &= 0x7FF;
			}
			if (local341 < 0) {
				this.anInt293 -= this.anInt276 + -local341 * this.anInt277 / 1000;
				this.anInt293 &= 0x7FF;
			}
			@Pc(399) int local399 = local270 - this.anInt293;
			if (local399 > 1024) {
				local399 -= 2048;
			}
			if (local399 < -1024) {
				local399 += 2048;
			}
			if (local399 < 0 && local341 > 0 || local399 > 0 && local341 < 0) {
				this.anInt293 = local270;
			}
		} catch (@Pc(420) RuntimeException local420) {
			signlink.reporterror("40670, " + arg0 + ", " + local420.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IZIILclient!d;IIII)V")
	private void method219(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class6 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		try {
			if (this.aBoolean76) {
				this.anInt417 = 32;
			} else {
				this.anInt417 = 0;
			}
			this.aBoolean76 = false;
			if (arg6 >= arg2 && arg6 < arg2 + 16 && arg3 >= arg5 && arg3 < arg5 + 16) {
				arg4.anInt461 -= this.anInt255 * 4;
				if (arg1) {
					this.aBoolean82 = true;
					return;
				}
			} else if (arg6 >= arg2 && arg6 < arg2 + 16 && arg3 >= arg5 + arg0 - 16 && arg3 < arg5 + arg0) {
				arg4.anInt461 += this.anInt255 * 4;
				if (arg1) {
					this.aBoolean82 = true;
					return;
				}
			} else if (arg6 >= arg2 - this.anInt417 && arg6 < arg2 + this.anInt417 + 16 && arg3 >= arg5 + 16 && arg3 < arg5 + arg0 - 16 && this.anInt255 > 0) {
				@Pc(127) int local127 = (arg0 - 32) * arg0 / arg7;
				if (local127 < 8) {
					local127 = 8;
				}
				@Pc(142) int local142 = arg3 - arg5 - local127 / 2 - 16;
				@Pc(148) int local148 = arg0 - local127 - 32;
				arg4.anInt461 = (arg7 - arg0) * local142 / local148;
				if (arg1) {
					this.aBoolean82 = true;
				}
				this.aBoolean76 = true;
			} else {
				return;
			}
		} catch (@Pc(167) RuntimeException local167) {
			signlink.reporterror("16848, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + 0 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + local167.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "F", descriptor = "(I)V")
	private void method220() {
		try {
			this.anInt422 += 0;
			try {
				if (this.aClass8_1 != null) {
					this.aClass8_1.method244();
				}
			} catch (@Pc(13) Exception local13) {
			}
			this.aClass8_1 = null;
			this.aBoolean46 = false;
			this.anInt333 = 0;
			this.aString17 = "";
			this.aString18 = "";
			Class10.method267(this.aBoolean58);
			this.method105();
			this.aClass39_1.method544(this.anInt387);
			for (@Pc(41) int local41 = 0; local41 < 4; local41++) {
				this.aClass19Array1[local41].method414();
			}
			System.gc();
			this.method102();
			this.anInt321 = -1;
			this.anInt434 = -1;
			this.anInt357 = 0;
		} catch (@Pc(68) RuntimeException local68) {
			signlink.reporterror("83721, " + 0 + ", " + local68.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "()V")
	@Override
	protected void method90() {
		if (signlink.sunjava) {
			super.anInt227 = 5;
		}
		if (aBoolean66) {
			this.aBoolean49 = true;
			return;
		}
		aBoolean66 = true;
		@Pc(16) boolean local16 = false;
		@Pc(20) String local20 = this.method150();
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
			this.aBoolean85 = true;
			return;
		}
		@Pc(84) int local84;
		if (signlink.aRandomAccessFile1 != null) {
			for (local84 = 0; local84 < 5; local84++) {
				this.aClass46Array1[local84] = new Class46(34035, signlink.aRandomAccessFileArray1[local84], signlink.aRandomAccessFile1, 500000, local84 + 1);
			}
		}
		try {
			local84 = 5;
			this.anIntArray51[8] = 0;
			while (this.anIntArray51[8] == 0) {
				this.method97(638, "Connecting to web server", 20);
				try {
					@Pc(133) DataInputStream local133 = this.method141("crc" + (int) (Math.random() * 9.9999999E7D));
					@Pc(140) Class1_Sub1_Sub3 local140 = new Class1_Sub1_Sub3(new byte[36], 337);
					local133.readFully(local140.aByteArray9, 0, 36);
					for (@Pc(148) int local148 = 0; local148 < 9; local148++) {
						this.anIntArray51[local148] = local140.method503();
					}
					local133.close();
				} catch (@Pc(164) IOException local164) {
					for (@Pc(166) int local166 = local84; local166 > 0; local166--) {
						this.method97(638, "Error loading - Will retry in " + local166 + " secs.", 10);
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
			this.aClass48_1 = this.method148("title", 1, this.anIntArray51[1], "title screen", 25);
			this.aClass1_Sub1_Sub2_Sub4_1 = new Class1_Sub1_Sub2_Sub4("p11", (byte) 7, this.aClass48_1);
			this.aClass1_Sub1_Sub2_Sub4_2 = new Class1_Sub1_Sub2_Sub4("p12", (byte) 7, this.aClass48_1);
			this.aClass1_Sub1_Sub2_Sub4_3 = new Class1_Sub1_Sub2_Sub4("b12", (byte) 7, this.aClass48_1);
			this.aClass1_Sub1_Sub2_Sub4_4 = new Class1_Sub1_Sub2_Sub4("q8", (byte) 7, this.aClass48_1);
			this.method157((byte) 7);
			this.method214(anInt438);
			@Pc(271) Class48 local271 = this.method148("config", 2, this.anIntArray51[2], "config", 30);
			@Pc(283) Class48 local283 = this.method148("interface", 3, this.anIntArray51[3], "interface", 35);
			@Pc(295) Class48 local295 = this.method148("media", 4, this.anIntArray51[4], "2d graphics", 40);
			@Pc(307) Class48 local307 = this.method148("textures", 6, this.anIntArray51[6], "textures", 45);
			@Pc(319) Class48 local319 = this.method148("wordenc", 7, this.anIntArray51[7], "chat system", 50);
			@Pc(331) Class48 local331 = this.method148("sounds", 8, this.anIntArray51[8], "sound effects", 55);
			this.aByteArrayArrayArray7 = new byte[4][104][104];
			this.anIntArrayArrayArray3 = new int[4][105][105];
			this.aClass39_1 = new Class39(4, 104, 104, (byte) 108, this.anIntArrayArrayArray3);
			for (@Pc(356) int local356 = 0; local356 < 4; local356++) {
				this.aClass19Array1[local356] = new Class19(104, 104, false);
			}
			this.aClass1_Sub1_Sub2_Sub2_4 = new Class1_Sub1_Sub2_Sub2(512, 512);
			@Pc(391) Class48 local391 = this.method148("versionlist", 5, this.anIntArray51[5], "update list", 60);
			this.method97(638, "Connecting to update server", 60);
			this.aClass45_Sub1_1 = new Class45_Sub1();
			this.aClass45_Sub1_1.method648(local391, this);
			Class14.method324(this.aClass45_Sub1_1.method651(aBoolean57));
			Class1_Sub1_Sub1_Sub5.method285(this.aClass45_Sub1_1.method650(0), this.aClass45_Sub1_1);
			if (!aBoolean48) {
				this.anInt434 = 0;
				this.aBoolean87 = false;
				this.aClass45_Sub1_1.method657(2, this.anInt434);
				while (this.aClass45_Sub1_1.method658() > 0) {
					this.method159();
					try {
						Thread.sleep(100L);
					} catch (@Pc(442) Exception local442) {
					}
				}
			}
			this.method97(638, "Requesting animations", 65);
			@Pc(458) int local458 = this.aClass45_Sub1_1.method650(1);
			for (@Pc(460) int local460 = 0; local460 < local458; local460++) {
				this.aClass45_Sub1_1.method657(1, local460);
			}
			@Pc(479) int local479;
			while (this.aClass45_Sub1_1.method658() > 0) {
				local479 = local458 - this.aClass45_Sub1_1.method658();
				if (local479 > 0) {
					this.method97(638, "Loading animations - " + local479 * 100 / local458 + "%", 65);
				}
				this.method159();
				try {
					Thread.sleep(100L);
				} catch (@Pc(505) Exception local505) {
				}
			}
			this.method97(638, "Requesting models", 70);
			local458 = this.aClass45_Sub1_1.method650(0);
			@Pc(531) int local531;
			for (local479 = 0; local479 < local458; local479++) {
				local531 = this.aClass45_Sub1_1.method655(local479);
				if ((local531 & 0x1) != 0) {
					this.aClass45_Sub1_1.method657(0, local479);
				}
			}
			local458 = this.aClass45_Sub1_1.method658();
			while (this.aClass45_Sub1_1.method658() > 0) {
				local531 = local458 - this.aClass45_Sub1_1.method658();
				if (local531 > 0) {
					this.method97(638, "Loading models - " + local531 * 100 / local458 + "%", 70);
				}
				this.method159();
				try {
					Thread.sleep(100L);
				} catch (@Pc(582) Exception local582) {
				}
			}
			if (this.aClass46Array1[0] != null) {
				this.method97(638, "Requesting maps", 75);
				this.aClass45_Sub1_1.method657(3, this.aClass45_Sub1_1.method652(48, 0, 47));
				this.aClass45_Sub1_1.method657(3, this.aClass45_Sub1_1.method652(48, 1, 47));
				this.aClass45_Sub1_1.method657(3, this.aClass45_Sub1_1.method652(48, 0, 48));
				this.aClass45_Sub1_1.method657(3, this.aClass45_Sub1_1.method652(48, 1, 48));
				this.aClass45_Sub1_1.method657(3, this.aClass45_Sub1_1.method652(48, 0, 49));
				this.aClass45_Sub1_1.method657(3, this.aClass45_Sub1_1.method652(48, 1, 49));
				this.aClass45_Sub1_1.method657(3, this.aClass45_Sub1_1.method652(47, 0, 47));
				this.aClass45_Sub1_1.method657(3, this.aClass45_Sub1_1.method652(47, 1, 47));
				this.aClass45_Sub1_1.method657(3, this.aClass45_Sub1_1.method652(47, 0, 48));
				this.aClass45_Sub1_1.method657(3, this.aClass45_Sub1_1.method652(47, 1, 48));
				this.aClass45_Sub1_1.method657(3, this.aClass45_Sub1_1.method652(148, 0, 48));
				this.aClass45_Sub1_1.method657(3, this.aClass45_Sub1_1.method652(148, 1, 48));
				local458 = this.aClass45_Sub1_1.method658();
				while (this.aClass45_Sub1_1.method658() > 0) {
					local531 = local458 - this.aClass45_Sub1_1.method658();
					if (local531 > 0) {
						this.method97(638, "Loading maps - " + local531 * 100 / local458 + "%", 75);
					}
					this.method159();
					try {
						Thread.sleep(100L);
					} catch (@Pc(767) Exception local767) {
					}
				}
			}
			local458 = this.aClass45_Sub1_1.method650(0);
			@Pc(788) int local788;
			for (local531 = 0; local531 < local458; local531++) {
				local788 = this.aClass45_Sub1_1.method655(local531);
				@Pc(790) byte local790 = 0;
				if ((local788 & 0x8) != 0) {
					local790 = 10;
				} else if ((local788 & 0x20) != 0) {
					local790 = 9;
				} else if ((local788 & 0x10) != 0) {
					local790 = 8;
				} else if ((local788 & 0x40) != 0) {
					local790 = 7;
				} else if ((local788 & 0x80) != 0) {
					local790 = 6;
				} else if ((local788 & 0x2) != 0) {
					local790 = 5;
				} else if ((local788 & 0x4) != 0) {
					local790 = 4;
				}
				if ((local788 & 0x1) != 0) {
					local790 = 3;
				}
				if (local790 != 0) {
					this.aClass45_Sub1_1.method660(local790, local531, 0);
				}
			}
			this.aClass45_Sub1_1.method653(aBoolean47);
			if (!aBoolean48) {
				local458 = this.aClass45_Sub1_1.method650(2);
				for (local788 = 1; local788 < local458; local788++) {
					if (this.aClass45_Sub1_1.method656(local788)) {
						this.aClass45_Sub1_1.method660((byte) 1, local788, 2);
					}
				}
			}
			this.method97(638, "Unpacking media", 80);
			this.aClass1_Sub1_Sub2_Sub3_11 = new Class1_Sub1_Sub2_Sub3(local295, "invback", 0);
			this.aClass1_Sub1_Sub2_Sub3_13 = new Class1_Sub1_Sub2_Sub3(local295, "chatback", 0);
			this.aClass1_Sub1_Sub2_Sub3_12 = new Class1_Sub1_Sub2_Sub3(local295, "mapback", 0);
			this.aClass1_Sub1_Sub2_Sub3_6 = new Class1_Sub1_Sub2_Sub3(local295, "backbase1", 0);
			this.aClass1_Sub1_Sub2_Sub3_7 = new Class1_Sub1_Sub2_Sub3(local295, "backbase2", 0);
			this.aClass1_Sub1_Sub2_Sub3_8 = new Class1_Sub1_Sub2_Sub3(local295, "backhmid1", 0);
			for (local788 = 0; local788 < 13; local788++) {
				this.aClass1_Sub1_Sub2_Sub3Array2[local788] = new Class1_Sub1_Sub2_Sub3(local295, "sideicons", local788);
			}
			this.aClass1_Sub1_Sub2_Sub2_9 = new Class1_Sub1_Sub2_Sub2(local295, "compass", 0);
			this.aClass1_Sub1_Sub2_Sub2_1 = new Class1_Sub1_Sub2_Sub2(local295, "mapedge", 0);
			this.aClass1_Sub1_Sub2_Sub2_1.method403();
			@Pc(990) int local990;
			try {
				for (local990 = 0; local990 < 50; local990++) {
					this.aClass1_Sub1_Sub2_Sub3Array3[local990] = new Class1_Sub1_Sub2_Sub3(local295, "mapscene", local990);
				}
			} catch (@Pc(1008) Exception local1008) {
			}
			try {
				for (local990 = 0; local990 < 50; local990++) {
					this.aClass1_Sub1_Sub2_Sub2Array4[local990] = new Class1_Sub1_Sub2_Sub2(local295, "mapfunction", local990);
				}
			} catch (@Pc(1028) Exception local1028) {
			}
			try {
				for (local990 = 0; local990 < 20; local990++) {
					this.aClass1_Sub1_Sub2_Sub2Array7[local990] = new Class1_Sub1_Sub2_Sub2(local295, "hitmarks", local990);
				}
			} catch (@Pc(1048) Exception local1048) {
			}
			try {
				for (local990 = 0; local990 < 20; local990++) {
					this.aClass1_Sub1_Sub2_Sub2Array5[local990] = new Class1_Sub1_Sub2_Sub2(local295, "headicons", local990);
				}
			} catch (@Pc(1068) Exception local1068) {
			}
			this.aClass1_Sub1_Sub2_Sub2_2 = new Class1_Sub1_Sub2_Sub2(local295, "mapmarker", 0);
			this.aClass1_Sub1_Sub2_Sub2_3 = new Class1_Sub1_Sub2_Sub2(local295, "mapmarker", 1);
			for (local990 = 0; local990 < 8; local990++) {
				this.aClass1_Sub1_Sub2_Sub2Array3[local990] = new Class1_Sub1_Sub2_Sub2(local295, "cross", local990);
			}
			this.aClass1_Sub1_Sub2_Sub2_10 = new Class1_Sub1_Sub2_Sub2(local295, "mapdots", 0);
			this.aClass1_Sub1_Sub2_Sub2_11 = new Class1_Sub1_Sub2_Sub2(local295, "mapdots", 1);
			this.aClass1_Sub1_Sub2_Sub2_12 = new Class1_Sub1_Sub2_Sub2(local295, "mapdots", 2);
			this.aClass1_Sub1_Sub2_Sub2_13 = new Class1_Sub1_Sub2_Sub2(local295, "mapdots", 3);
			this.aClass1_Sub1_Sub2_Sub3_19 = new Class1_Sub1_Sub2_Sub3(local295, "scrollbar", 0);
			this.aClass1_Sub1_Sub2_Sub3_20 = new Class1_Sub1_Sub2_Sub3(local295, "scrollbar", 1);
			this.aClass1_Sub1_Sub2_Sub3_14 = new Class1_Sub1_Sub2_Sub3(local295, "redstone1", 0);
			this.aClass1_Sub1_Sub2_Sub3_15 = new Class1_Sub1_Sub2_Sub3(local295, "redstone2", 0);
			this.aClass1_Sub1_Sub2_Sub3_16 = new Class1_Sub1_Sub2_Sub3(local295, "redstone3", 0);
			this.aClass1_Sub1_Sub2_Sub3_17 = new Class1_Sub1_Sub2_Sub3(local295, "redstone1", 0);
			this.aClass1_Sub1_Sub2_Sub3_17.method442();
			this.aClass1_Sub1_Sub2_Sub3_18 = new Class1_Sub1_Sub2_Sub3(local295, "redstone2", 0);
			this.aClass1_Sub1_Sub2_Sub3_18.method442();
			this.aClass1_Sub1_Sub2_Sub3_1 = new Class1_Sub1_Sub2_Sub3(local295, "redstone1", 0);
			this.aClass1_Sub1_Sub2_Sub3_1.method443();
			this.aClass1_Sub1_Sub2_Sub3_2 = new Class1_Sub1_Sub2_Sub3(local295, "redstone2", 0);
			this.aClass1_Sub1_Sub2_Sub3_2.method443();
			this.aClass1_Sub1_Sub2_Sub3_3 = new Class1_Sub1_Sub2_Sub3(local295, "redstone3", 0);
			this.aClass1_Sub1_Sub2_Sub3_3.method443();
			this.aClass1_Sub1_Sub2_Sub3_4 = new Class1_Sub1_Sub2_Sub3(local295, "redstone1", 0);
			this.aClass1_Sub1_Sub2_Sub3_4.method442();
			this.aClass1_Sub1_Sub2_Sub3_4.method443();
			this.aClass1_Sub1_Sub2_Sub3_5 = new Class1_Sub1_Sub2_Sub3(local295, "redstone2", 0);
			this.aClass1_Sub1_Sub2_Sub3_5.method442();
			this.aClass1_Sub1_Sub2_Sub3_5.method443();
			for (@Pc(1268) int local1268 = 0; local1268 < 2; local1268++) {
				this.aClass1_Sub1_Sub2_Sub3Array1[local1268] = new Class1_Sub1_Sub2_Sub3(local295, "mod_icons", local1268);
			}
			@Pc(1291) Class1_Sub1_Sub2_Sub2 local1291 = new Class1_Sub1_Sub2_Sub2(local295, "backleft1", 0);
			this.aClass37_3 = new Class37((byte) -82, local1291.anInt680, this.method95(437), local1291.anInt679);
			local1291.method404(0, 0);
			@Pc(1316) Class1_Sub1_Sub2_Sub2 local1316 = new Class1_Sub1_Sub2_Sub2(local295, "backleft2", 0);
			this.aClass37_4 = new Class37((byte) -82, local1316.anInt680, this.method95(437), local1316.anInt679);
			local1316.method404(0, 0);
			@Pc(1341) Class1_Sub1_Sub2_Sub2 local1341 = new Class1_Sub1_Sub2_Sub2(local295, "backright1", 0);
			this.aClass37_5 = new Class37((byte) -82, local1341.anInt680, this.method95(437), local1341.anInt679);
			local1341.method404(0, 0);
			@Pc(1366) Class1_Sub1_Sub2_Sub2 local1366 = new Class1_Sub1_Sub2_Sub2(local295, "backright2", 0);
			this.aClass37_6 = new Class37((byte) -82, local1366.anInt680, this.method95(437), local1366.anInt679);
			local1366.method404(0, 0);
			@Pc(1391) Class1_Sub1_Sub2_Sub2 local1391 = new Class1_Sub1_Sub2_Sub2(local295, "backtop1", 0);
			this.aClass37_7 = new Class37((byte) -82, local1391.anInt680, this.method95(437), local1391.anInt679);
			local1391.method404(0, 0);
			@Pc(1416) Class1_Sub1_Sub2_Sub2 local1416 = new Class1_Sub1_Sub2_Sub2(local295, "backvmid1", 0);
			this.aClass37_8 = new Class37((byte) -82, local1416.anInt680, this.method95(437), local1416.anInt679);
			local1416.method404(0, 0);
			@Pc(1441) Class1_Sub1_Sub2_Sub2 local1441 = new Class1_Sub1_Sub2_Sub2(local295, "backvmid2", 0);
			this.aClass37_9 = new Class37((byte) -82, local1441.anInt680, this.method95(437), local1441.anInt679);
			local1441.method404(0, 0);
			@Pc(1466) Class1_Sub1_Sub2_Sub2 local1466 = new Class1_Sub1_Sub2_Sub2(local295, "backvmid3", 0);
			this.aClass37_10 = new Class37((byte) -82, local1466.anInt680, this.method95(437), local1466.anInt679);
			local1466.method404(0, 0);
			@Pc(1491) Class1_Sub1_Sub2_Sub2 local1491 = new Class1_Sub1_Sub2_Sub2(local295, "backhmid2", 0);
			this.aClass37_11 = new Class37((byte) -82, local1491.anInt680, this.method95(437), local1491.anInt679);
			local1491.method404(0, 0);
			@Pc(1516) int local1516 = (int) (Math.random() * 21.0D) - 10;
			@Pc(1523) int local1523 = (int) (Math.random() * 21.0D) - 10;
			@Pc(1530) int local1530 = (int) (Math.random() * 21.0D) - 10;
			@Pc(1537) int local1537 = (int) (Math.random() * 41.0D) - 20;
			for (@Pc(1539) int local1539 = 0; local1539 < 50; local1539++) {
				if (this.aClass1_Sub1_Sub2_Sub2Array4[local1539] != null) {
					this.aClass1_Sub1_Sub2_Sub2Array4[local1539].method402(local1523 + local1537, local1530 + local1537, local1516 + local1537);
				}
				if (this.aClass1_Sub1_Sub2_Sub3Array3[local1539] != null) {
					this.aClass1_Sub1_Sub2_Sub3Array3[local1539].method444(local1523 + local1537, local1530 + local1537, local1516 + local1537);
				}
			}
			this.method97(638, "Unpacking textures", 83);
			Class1_Sub1_Sub2_Sub1.method375(local307);
			Class1_Sub1_Sub2_Sub1.method379(0.8D);
			Class1_Sub1_Sub2_Sub1.method374();
			this.method97(638, "Unpacking config", 86);
			Class27.method516(local271);
			Class9.method256(local271);
			Class21.method447(local271);
			Class15.method343(local271);
			Class13.method318(local271);
			Class23.method477(local271);
			Class32.method528(local271);
			Class38.method541(local271);
			Class35.method536(local271);
			Class15.aBoolean146 = aBoolean47;
			if (!aBoolean48) {
				this.method97(638, "Unpacking sounds", 90);
				@Pc(1642) byte[] local1642 = local331.method678("sounds.dat", null);
				@Pc(1648) Class1_Sub1_Sub3 local1648 = new Class1_Sub1_Sub3(local1642, 337);
				Class5.method79(local1648);
			}
			this.method97(638, "Unpacking interfaces", 95);
			@Pc(1679) Class1_Sub1_Sub2_Sub4[] local1679 = new Class1_Sub1_Sub2_Sub4[] { this.aClass1_Sub1_Sub2_Sub4_1, this.aClass1_Sub1_Sub2_Sub4_2, this.aClass1_Sub1_Sub2_Sub4_3, this.aClass1_Sub1_Sub2_Sub4_4 };
			Class6.method230(local1679, local295, local283);
			this.method97(638, "Preparing game engine", 100);
			@Pc(1695) int local1695;
			@Pc(1697) int local1697;
			@Pc(1699) int local1699;
			for (@Pc(1691) int local1691 = 0; local1691 < 33; local1691++) {
				local1695 = 999;
				local1697 = 0;
				for (local1699 = 0; local1699 < 34; local1699++) {
					if (this.aClass1_Sub1_Sub2_Sub3_12.aByteArray7[local1699 + local1691 * this.aClass1_Sub1_Sub2_Sub3_12.anInt709] == 0) {
						if (local1695 == 999) {
							local1695 = local1699;
						}
					} else if (local1695 != 999) {
						local1697 = local1699;
						break;
					}
				}
				this.anIntArray53[local1691] = local1695;
				this.anIntArray38[local1691] = local1697 - local1695;
			}
			@Pc(1757) int local1757;
			for (local1695 = 5; local1695 < 156; local1695++) {
				local1697 = 999;
				local1699 = 0;
				for (local1757 = 25; local1757 < 172; local1757++) {
					if (this.aClass1_Sub1_Sub2_Sub3_12.aByteArray7[local1757 + local1695 * this.aClass1_Sub1_Sub2_Sub3_12.anInt709] == 0 && (local1757 > 34 || local1695 > 34)) {
						if (local1697 == 999) {
							local1697 = local1757;
						}
					} else if (local1697 != 999) {
						local1699 = local1757;
						break;
					}
				}
				this.anIntArray83[local1695 - 5] = local1697 - 25;
				this.anIntArray43[local1695 - 5] = local1699 - local1697;
			}
			Class1_Sub1_Sub2_Sub1.method372(96, 479);
			this.anIntArray80 = Class1_Sub1_Sub2_Sub1.anIntArray185;
			Class1_Sub1_Sub2_Sub1.method372(261, 190);
			this.anIntArray81 = Class1_Sub1_Sub2_Sub1.anIntArray185;
			Class1_Sub1_Sub2_Sub1.method372(334, 512);
			this.anIntArray82 = Class1_Sub1_Sub2_Sub1.anIntArray185;
			@Pc(1841) int[] local1841 = new int[9];
			for (local1699 = 0; local1699 < 9; local1699++) {
				local1757 = local1699 * 32 + 128 + 15;
				@Pc(1859) int local1859 = local1757 * 3 + 600;
				@Pc(1863) int local1863 = Class1_Sub1_Sub2_Sub1.anIntArray183[local1757];
				local1841[local1699] = local1859 * local1863 >> 16;
			}
			Class39.method580(local1841);
			Class41.method603(local319);
			this.aClass11_1 = new Class11(-331, this);
		} catch (@Pc(1893) Exception local1893) {
			signlink.reporterror("loaderror " + this.aString5 + " " + this.anInt339);
			this.aBoolean70 = true;
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IZLclient!mb;)V")
	private void method221(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub1_Sub3 arg1) {
		try {
			for (@Pc(4) int local4 = 0; local4 < this.anInt421; local4++) {
				@Pc(11) int local11 = this.anIntArray92[local4];
				@Pc(16) Class1_Sub1_Sub1_Sub1_Sub2 local16 = this.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local11];
				@Pc(19) int local19 = arg1.method498();
				if ((local19 & 0x80) == 128) {
					local19 += arg1.method498() << 8;
				}
				this.method227(arg1, local16, local11, local19);
			}
		} catch (@Pc(45) RuntimeException local45) {
			signlink.reporterror("54726, " + arg0 + ", " + false + ", " + arg1 + ", " + local45.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIII)I")
	private int method222(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		try {
			this.anInt422 += 0;
			@Pc(9) int local9 = 256 - arg1;
			return ((arg2 & 0xFF00FF) * local9 + (arg0 & 0xFF00FF) * arg1 & 0xFF00FF00) + ((arg2 & 0xFF00) * local9 + (arg0 & 0xFF00) * arg1 & 0xFF0000) >> 8;
		} catch (@Pc(40) RuntimeException local40) {
			signlink.reporterror("8927, " + arg0 + ", " + arg1 + ", " + 0 + ", " + arg2 + ", " + local40.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!z;II)V")
	private void method223(@OriginalArg(0) Class1_Sub1_Sub1_Sub1 arg0, @OriginalArg(2) int arg1) {
		try {
			this.method224(arg0.anInt131, arg1, arg0.anInt130);
		} catch (@Pc(13) RuntimeException local13) {
			signlink.reporterror("18091, " + arg0 + ", " + 4 + ", " + arg1 + ", " + local13.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ZIII)V")
	private void method224(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		try {
			if (arg2 >= 128 && arg0 >= 128 && arg2 <= 13056 && arg0 <= 13056) {
				@Pc(32) int local32 = this.method151(arg0, this.anInt257, arg2, (byte) 6) - arg1;
				@Pc(37) int local37 = arg2 - this.anInt289;
				@Pc(42) int local42 = local32 - this.anInt290;
				@Pc(47) int local47 = arg0 - this.anInt291;
				@Pc(52) int local52 = Class1_Sub1_Sub1_Sub5.anIntArray158[this.anInt292];
				@Pc(57) int local57 = Class1_Sub1_Sub1_Sub5.anIntArray159[this.anInt292];
				@Pc(62) int local62 = Class1_Sub1_Sub1_Sub5.anIntArray158[this.anInt293];
				@Pc(67) int local67 = Class1_Sub1_Sub1_Sub5.anIntArray159[this.anInt293];
				@Pc(77) int local77 = local47 * local62 + local37 * local67 >> 16;
				@Pc(87) int local87 = local47 * local67 - local37 * local62 >> 16;
				@Pc(89) int local89 = local77;
				@Pc(99) int local99 = local42 * local57 - local87 * local52 >> 16;
				@Pc(109) int local109 = local42 * local52 + local87 * local57 >> 16;
				if (local109 >= 50) {
					this.anInt347 = Class1_Sub1_Sub2_Sub1.anInt654 + (local89 << 9) / local109;
					this.anInt348 = Class1_Sub1_Sub2_Sub1.anInt655 + (local99 << 9) / local109;
				} else {
					this.anInt347 = -1;
					this.anInt348 = -1;
				}
			} else {
				this.anInt347 = -1;
				this.anInt348 = -1;
			}
		} catch (@Pc(141) RuntimeException local141) {
			signlink.reporterror("5592, " + false + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local141.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "G", descriptor = "(I)V")
	private void method225(@OriginalArg(0) int arg0) {
		try {
			this.method113();
			if (this.anInt445 == 1) {
				this.aClass1_Sub1_Sub2_Sub2Array3[this.anInt444 / 100].method406(this.anInt443 - 8 - 4, this.anInt442 - 8 - 4);
			}
			if (this.anInt445 == 2) {
				this.aClass1_Sub1_Sub2_Sub2Array3[this.anInt444 / 100 + 4].method406(this.anInt443 - 8 - 4, this.anInt442 - 8 - 4);
			}
			if (this.anInt416 != -1) {
				this.method108(this.anInt416, this.anInt301);
				this.method170(Class6.aClass6Array1[this.anInt416], 0, 0, 0);
			}
			@Pc(94) int local94;
			@Pc(96) int local96;
			if (this.anInt338 > 0) {
				local94 = 302 - (int) Math.abs(Math.sin((double) this.anInt338 / 10.0D) * 10.0D);
				for (local96 = 0; local96 < 30; local96++) {
					@Pc(104) int local104 = (30 - local96) * 16;
					Class1_Sub1_Sub2.method462(local96 + local94, this.anInt338, local104, 16776960, 256 - local104 / 2);
				}
			}
			if (this.anInt278 != -1) {
				this.method108(this.anInt278, this.anInt301);
				this.method170(Class6.aClass6Array1[this.anInt278], 0, 0, 0);
			}
			this.method197();
			@Pc(151) boolean local151 = false;
			if (!this.aBoolean61) {
				this.method111(this.anInt287);
				this.method198();
			} else if (this.anInt366 == 0) {
				this.method142();
			}
			if (this.anInt435 == 1) {
				if (this.anInt267 > 0 || this.anInt288 == 1) {
					this.aClass1_Sub1_Sub2_Sub2Array5[1].method406(258, 472);
				} else {
					this.aClass1_Sub1_Sub2_Sub2Array5[1].method406(296, 472);
				}
			}
			if (this.anInt267 > 0) {
				this.aClass1_Sub1_Sub2_Sub2Array5[0].method406(296, 472);
				this.aClass1_Sub1_Sub2_Sub4_2.method465("Level: " + this.anInt267, 16776960, 329, 484);
			}
			if (this.anInt288 == 1) {
				this.aClass1_Sub1_Sub2_Sub2Array5[6].method406(296, 472);
				this.aClass1_Sub1_Sub2_Sub4_2.method465("Arena", 16776960, 329, 484);
			}
			if (this.anInt272 != 0) {
				local94 = this.anInt272 / 50;
				local96 = local94 / 60;
				local94 %= 60;
				if (local94 < 10) {
					this.aClass1_Sub1_Sub2_Sub4_2.method468(329, 4, "System update in: " + local96 + ":0" + local94, 16776960);
				} else {
					this.aClass1_Sub1_Sub2_Sub4_2.method468(329, 4, "System update in: " + local96 + ":" + local94, 16776960);
				}
			}
		} catch (@Pc(302) RuntimeException local302) {
			signlink.reporterror("20705, " + arg0 + ", " + local302.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/String;B)Z")
	private boolean method226(@OriginalArg(0) String arg0, @OriginalArg(1) byte arg1) {
		try {
			if (arg1 != 118) {
				this.anInt423 = -1;
			}
			if (arg0 == null) {
				return false;
			}
			for (@Pc(11) int local11 = 0; local11 < this.anInt317; local11++) {
				if (arg0.equalsIgnoreCase(this.aStringArray4[local11])) {
					return true;
				}
			}
			return arg0.equalsIgnoreCase(aClass1_Sub1_Sub1_Sub1_Sub2_1.aString4);
		} catch (@Pc(37) RuntimeException local37) {
			signlink.reporterror("97885, " + arg0 + ", " + arg1 + ", " + local37.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!mb;Lclient!bb;IBI)V")
	private void method227(@OriginalArg(0) Class1_Sub1_Sub3 arg0, @OriginalArg(1) Class1_Sub1_Sub1_Sub1_Sub2 arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		try {
			@Pc(16) int local16;
			if ((arg3 & 0x1) == 1) {
				local16 = arg0.method498();
				@Pc(19) byte[] local19 = new byte[local16];
				@Pc(25) Class1_Sub1_Sub3 local25 = new Class1_Sub1_Sub3(local19, 337);
				arg0.method507(local16, local19);
				this.aClass1_Sub1_Sub3Array1[arg2] = local25;
				arg1.method51(local25, this.aBoolean77);
			}
			@Pc(64) int local64;
			@Pc(76) int local76;
			if ((arg3 & 0x2) == 2) {
				local16 = arg0.method500();
				if (local16 == 65535) {
					local16 = -1;
				}
				if (local16 == arg1.anInt153) {
					arg1.anInt157 = 0;
				}
				local64 = arg0.method498();
				if (local16 == arg1.anInt153 && local16 != -1) {
					local76 = Class27.aClass27Array1[local16].anInt808;
					if (local76 == 1) {
						arg1.anInt154 = 0;
						arg1.anInt155 = 0;
						arg1.anInt156 = local64;
						arg1.anInt157 = 0;
					}
					if (local76 == 2) {
						arg1.anInt157 = 0;
					}
				} else if (local16 == -1 || arg1.anInt153 == -1 || Class27.aClass27Array1[local16].anInt802 >= Class27.aClass27Array1[arg1.anInt153].anInt802) {
					arg1.anInt153 = local16;
					arg1.anInt154 = 0;
					arg1.anInt155 = 0;
					arg1.anInt156 = local64;
					arg1.anInt157 = 0;
					arg1.anInt175 = arg1.anInt173;
				}
			}
			if ((arg3 & 0x4) == 4) {
				arg1.anInt147 = arg0.method500();
				if (arg1.anInt147 == 65535) {
					arg1.anInt147 = -1;
				}
			}
			if ((arg3 & 0x8) == 8) {
				arg1.aString3 = arg0.method505();
				arg1.anInt142 = 0;
				arg1.anInt143 = 0;
				arg1.anInt141 = 150;
				this.method211(2, arg1.aString4, arg1.aString3);
			}
			if ((arg3 & 0x10) == 16) {
				local16 = arg0.method498();
				local64 = arg0.method498();
				arg1.method50(local16, local64);
				arg1.anInt144 = anInt446 + 300;
				arg1.anInt145 = arg0.method498();
				arg1.anInt146 = arg0.method498();
			}
			if ((arg3 & 0x20) == 32) {
				arg1.anInt148 = arg0.method500();
				arg1.anInt149 = arg0.method500();
			}
			if ((arg3 & 0x40) == 64) {
				local16 = arg0.method500();
				local64 = arg0.method498();
				local76 = arg0.method498();
				@Pc(236) int local236 = arg0.anInt768;
				if (arg1.aString4 != null && arg1.aBoolean27) {
					@Pc(246) long local246 = Class49.method679(arg1.aString4);
					@Pc(248) boolean local248 = false;
					if (local64 <= 1) {
						for (@Pc(253) int local253 = 0; local253 < this.anInt258; local253++) {
							if (this.aLongArray3[local253] == local246) {
								local248 = true;
								break;
							}
						}
					}
					if (!local248 && this.anInt388 == 0) {
						try {
							@Pc(281) String local281 = Class2.method40(arg0, local76, 983);
							@Pc(285) String local285 = Class41.method613(local281);
							arg1.aString3 = local285;
							arg1.anInt142 = local16 >> 8;
							arg1.anInt143 = local16 & 0xFF;
							arg1.anInt141 = 150;
							if (local64 == 2 || local64 == 3) {
								this.method211(1, "@cr2@" + arg1.aString4, local285);
							} else if (local64 == 1) {
								this.method211(1, "@cr1@" + arg1.aString4, local285);
							} else {
								this.method211(2, arg1.aString4, local285);
							}
						} catch (@Pc(349) Exception local349) {
							signlink.reporterror("cde2");
						}
					}
				}
				arg0.anInt768 = local236 + local76;
			}
			if ((arg3 & 0x100) == 256) {
				arg1.anInt158 = arg0.method500();
				local16 = arg0.method503();
				arg1.anInt162 = local16 >> 16;
				arg1.anInt161 = anInt446 + (local16 & 0xFFFF);
				arg1.anInt159 = 0;
				arg1.anInt160 = 0;
				if (arg1.anInt161 > anInt446) {
					arg1.anInt159 = -1;
				}
				if (arg1.anInt158 == 65535) {
					arg1.anInt158 = -1;
				}
			}
			if ((arg3 & 0x200) == 512) {
				arg1.anInt163 = arg0.method498();
				arg1.anInt165 = arg0.method498();
				arg1.anInt164 = arg0.method498();
				arg1.anInt166 = arg0.method498();
				arg1.anInt167 = arg0.method500() + anInt446;
				arg1.anInt168 = arg0.method500() + anInt446;
				arg1.anInt169 = arg0.method498();
				arg1.method48();
			}
			if ((arg3 & 0x400) == 1024) {
				local16 = arg0.method498();
				local64 = arg0.method498();
				arg1.method50(local16, local64);
				arg1.anInt144 = anInt446 + 300;
				arg1.anInt145 = arg0.method498();
				arg1.anInt146 = arg0.method498();
			}
		} catch (@Pc(472) RuntimeException local472) {
			signlink.reporterror("93819, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 44 + ", " + arg3 + ", " + local472.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "H", descriptor = "(I)V")
	private void method228() {
		try {
			@Pc(8) int local8;
			if (this.anInt410 > 0) {
				for (local8 = 0; local8 < 256; local8++) {
					if (this.anInt410 > 768) {
						this.anIntArray72[local8] = this.method222(this.anIntArray74[local8], 1024 - this.anInt410, this.anIntArray73[local8]);
					} else if (this.anInt410 > 256) {
						this.anIntArray72[local8] = this.anIntArray74[local8];
					} else {
						this.anIntArray72[local8] = this.method222(this.anIntArray73[local8], 256 - this.anInt410, this.anIntArray74[local8]);
					}
				}
			} else if (this.anInt411 > 0) {
				for (local8 = 0; local8 < 256; local8++) {
					if (this.anInt411 > 768) {
						this.anIntArray72[local8] = this.method222(this.anIntArray75[local8], 1024 - this.anInt411, this.anIntArray73[local8]);
					} else if (this.anInt411 > 256) {
						this.anIntArray72[local8] = this.anIntArray75[local8];
					} else {
						this.anIntArray72[local8] = this.method222(this.anIntArray73[local8], 256 - this.anInt411, this.anIntArray75[local8]);
					}
				}
			} else {
				for (local8 = 0; local8 < 256; local8++) {
					this.anIntArray72[local8] = this.anIntArray73[local8];
				}
			}
			for (local8 = 0; local8 < 33920; local8++) {
				this.aClass37_15.anIntArray233[local8] = this.aClass1_Sub1_Sub2_Sub2_7.anIntArray210[local8];
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
				local196 = this.anIntArray45[local183] * (256 - local183) / 256;
				local200 = local196 + 22;
				if (local200 < 0) {
					local200 = 0;
				}
				local179 += local200;
				for (local210 = local200; local210 < 128; local210++) {
					local218 = this.anIntArray94[local179++];
					if (local218 == 0) {
						local181++;
					} else {
						local222 = local218;
						local226 = 256 - local218;
						local218 = this.anIntArray72[local218];
						local237 = this.aClass37_15.anIntArray233[local181];
						this.aClass37_15.anIntArray233[local181++] = ((local218 & 0xFF00FF) * local222 + (local237 & 0xFF00FF) * local226 & 0xFF00FF00) + ((local218 & 0xFF00) * local222 + (local237 & 0xFF00) * local226 & 0xFF0000) >> 8;
					}
				}
				local181 += local200;
			}
			this.aClass37_15.method539(0, super.aGraphics2, 0);
			for (local196 = 0; local196 < 33920; local196++) {
				this.aClass37_16.anIntArray233[local196] = this.aClass1_Sub1_Sub2_Sub2_8.anIntArray210[local196];
			}
			local179 = 0;
			local181 = 1176;
			for (local200 = 1; local200 < 255; local200++) {
				local210 = this.anIntArray45[local200] * (256 - local200) / 256;
				local218 = 103 - local210;
				local181 += local210;
				for (local222 = 0; local222 < local218; local222++) {
					local226 = this.anIntArray94[local179++];
					if (local226 == 0) {
						local181++;
					} else {
						local237 = local226;
						@Pc(360) int local360 = 256 - local226;
						local226 = this.anIntArray72[local226];
						@Pc(371) int local371 = this.aClass37_16.anIntArray233[local181];
						this.aClass37_16.anIntArray233[local181++] = ((local226 & 0xFF00FF) * local237 + (local371 & 0xFF00FF) * local360 & 0xFF00FF00) + ((local226 & 0xFF00) * local237 + (local371 & 0xFF00) * local360 & 0xFF0000) >> 8;
					}
				}
				local179 += 128 - local218;
				local181 += 128 - local218 - local210;
			}
			this.aClass37_16.method539(0, super.aGraphics2, 637);
		} catch (@Pc(451) RuntimeException local451) {
			signlink.reporterror("88504, " + 676 + ", " + local451.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIIIB)V")
	private void method229(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		try {
			@Pc(8) int local8 = this.aClass39_1.method570(arg2, arg4, arg3);
			@Pc(18) int local18;
			@Pc(24) int local24;
			@Pc(28) int local28;
			@Pc(30) int local30;
			@Pc(52) int local52;
			@Pc(58) int local58;
			if (local8 != 0) {
				local18 = this.aClass39_1.method574(arg2, arg4, arg3, local8);
				local24 = local18 >> 6 & 0x3;
				local28 = local18 & 0x1F;
				local30 = arg0;
				if (local8 > 0) {
					local30 = arg1;
				}
				@Pc(38) int[] local38 = this.aClass1_Sub1_Sub2_Sub2_4.anIntArray210;
				local52 = arg4 * 4 + (103 - arg3) * 512 * 4 + 24624;
				local58 = local8 >> 14 & 0x7FFF;
				@Pc(61) Class9 local61 = Class9.method258(local58);
				if (local61.anInt520 == -1) {
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
					@Pc(71) Class1_Sub1_Sub2_Sub3 local71 = this.aClass1_Sub1_Sub2_Sub3Array3[local61.anInt520];
					if (local71 != null) {
						@Pc(83) int local83 = (local61.anInt515 * 4 - local71.anInt709) / 2;
						@Pc(93) int local93 = (local61.anInt516 * 4 - local71.anInt710) / 2;
						local71.method445((104 - arg3 - local61.anInt516) * 4 + local93 + 48, arg4 * 4 + 48 + local83);
					}
				}
			}
			local8 = this.aClass39_1.method572(arg2, arg4, arg3);
			if (local8 != 0) {
				local18 = this.aClass39_1.method574(arg2, arg4, arg3, local8);
				local24 = local18 >> 6 & 0x3;
				local28 = local18 & 0x1F;
				local30 = local8 >> 14 & 0x7FFF;
				@Pc(457) Class9 local457 = Class9.method258(local30);
				@Pc(489) int local489;
				if (local457.anInt520 != -1) {
					@Pc(467) Class1_Sub1_Sub2_Sub3 local467 = this.aClass1_Sub1_Sub2_Sub3Array3[local457.anInt520];
					if (local467 != null) {
						local58 = (local457.anInt515 * 4 - local467.anInt709) / 2;
						local489 = (local457.anInt516 * 4 - local467.anInt710) / 2;
						local467.method445((104 - arg3 - local457.anInt516) * 4 + local489 + 48, arg4 * 4 + 48 + local58);
					}
				} else if (local28 == 9) {
					local52 = 15658734;
					if (local8 > 0) {
						local52 = 15597568;
					}
					@Pc(526) int[] local526 = this.aClass1_Sub1_Sub2_Sub2_4.anIntArray210;
					local489 = arg4 * 4 + (103 - arg3) * 512 * 4 + 24624;
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
			local8 = this.aClass39_1.method573(arg2, arg4, arg3);
			if (local8 != 0) {
				local18 = local8 >> 14 & 0x7FFF;
				@Pc(621) Class9 local621 = Class9.method258(local18);
				if (local621.anInt520 != -1) {
					@Pc(631) Class1_Sub1_Sub2_Sub3 local631 = this.aClass1_Sub1_Sub2_Sub3Array3[local621.anInt520];
					if (local631 != null) {
						local30 = (local621.anInt515 * 4 - local631.anInt709) / 2;
						@Pc(653) int local653 = (local621.anInt516 * 4 - local631.anInt710) / 2;
						local631.method445((104 - arg3 - local621.anInt516) * 4 + local653 + 48, arg4 * 4 + 48 + local30);
						return;
					}
				}
			}
		} catch (@Pc(677) RuntimeException local677) {
			signlink.reporterror("77833, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + 5 + ", " + local677.toString());
			throw new RuntimeException();
		}
	}
}
