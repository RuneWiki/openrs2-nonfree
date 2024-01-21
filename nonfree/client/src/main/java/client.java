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

	@OriginalMember(owner = "client!client", name = "Xc", descriptor = "I")
	public static int anInt132;

	@OriginalMember(owner = "client!client", name = "Ad", descriptor = "Z")
	private static boolean aBoolean48;

	@OriginalMember(owner = "client!client", name = "Ud", descriptor = "I")
	private static int anInt158;

	@OriginalMember(owner = "client!client", name = "oe", descriptor = "Z")
	private static boolean aBoolean49;

	@OriginalMember(owner = "client!client", name = "Be", descriptor = "I")
	private static int anInt174;

	@OriginalMember(owner = "client!client", name = "fb", descriptor = "Z")
	private static boolean aBoolean36 = true;

	@OriginalMember(owner = "client!client", name = "gb", descriptor = "[I")
	public static final int[] anIntArray18 = new int[] { 9104, 10275, 7595, 3610, 7975, 8526, 918, 38802, 24466, 10145, 58654, 5027, 1457, 16565, 34991, 25486 };

	@OriginalMember(owner = "client!client", name = "sb", descriptor = "I")
	private static int anInt98 = 460;

	@OriginalMember(owner = "client!client", name = "ub", descriptor = "[I")
	private static int[] anIntArray19 = new int[99];

	@OriginalMember(owner = "client!client", name = "Kb", descriptor = "Ljava/math/BigInteger;")
	private static BigInteger aBigInteger1;

	@OriginalMember(owner = "client!client", name = "Yc", descriptor = "Ljava/lang/String;")
	private static String aString9;

	@OriginalMember(owner = "client!client", name = "yd", descriptor = "Ljava/math/BigInteger;")
	private static BigInteger aBigInteger2;

	@OriginalMember(owner = "client!client", name = "ve", descriptor = "Z")
	private static boolean aBoolean51;

	@OriginalMember(owner = "client!client", name = "vg", descriptor = "[[I")
	public static final int[][] anIntArrayArray6;

	@OriginalMember(owner = "client!client", name = "E", descriptor = "I")
	private int anInt87;

	@OriginalMember(owner = "client!client", name = "F", descriptor = "I")
	private int anInt88;

	@OriginalMember(owner = "client!client", name = "G", descriptor = "I")
	private int anInt89;

	@OriginalMember(owner = "client!client", name = "J", descriptor = "I")
	private int anInt90;

	@OriginalMember(owner = "client!client", name = "K", descriptor = "Lclient!qb;")
	private Class29 aClass29_3;

	@OriginalMember(owner = "client!client", name = "L", descriptor = "Lclient!qb;")
	private Class29 aClass29_4;

	@OriginalMember(owner = "client!client", name = "M", descriptor = "Lclient!qb;")
	private Class29 aClass29_5;

	@OriginalMember(owner = "client!client", name = "N", descriptor = "Lclient!qb;")
	private Class29 aClass29_6;

	@OriginalMember(owner = "client!client", name = "O", descriptor = "Lclient!tb;")
	private Class35 aClass35_1;

	@OriginalMember(owner = "client!client", name = "P", descriptor = "Lclient!ib;")
	private Class1_Sub3_Sub2_Sub3 aClass1_Sub3_Sub2_Sub3_1;

	@OriginalMember(owner = "client!client", name = "Q", descriptor = "Lclient!ib;")
	private Class1_Sub3_Sub2_Sub3 aClass1_Sub3_Sub2_Sub3_2;

	@OriginalMember(owner = "client!client", name = "R", descriptor = "Lclient!ib;")
	private Class1_Sub3_Sub2_Sub3 aClass1_Sub3_Sub2_Sub3_3;

	@OriginalMember(owner = "client!client", name = "S", descriptor = "Lclient!ib;")
	private Class1_Sub3_Sub2_Sub3 aClass1_Sub3_Sub2_Sub3_4;

	@OriginalMember(owner = "client!client", name = "T", descriptor = "Lclient!ib;")
	private Class1_Sub3_Sub2_Sub3 aClass1_Sub3_Sub2_Sub3_5;

	@OriginalMember(owner = "client!client", name = "W", descriptor = "[[[B")
	private byte[][][] aByteArrayArrayArray7;

	@OriginalMember(owner = "client!client", name = "ab", descriptor = "I")
	private int anInt91;

	@OriginalMember(owner = "client!client", name = "bb", descriptor = "I")
	private int anInt92;

	@OriginalMember(owner = "client!client", name = "ib", descriptor = "Ljava/lang/String;")
	private String aString2;

	@OriginalMember(owner = "client!client", name = "jb", descriptor = "I")
	private int anInt93;

	@OriginalMember(owner = "client!client", name = "kb", descriptor = "I")
	private int anInt94;

	@OriginalMember(owner = "client!client", name = "lb", descriptor = "I")
	private int anInt95;

	@OriginalMember(owner = "client!client", name = "mb", descriptor = "I")
	private int anInt96;

	@OriginalMember(owner = "client!client", name = "nb", descriptor = "I")
	private int anInt97;

	@OriginalMember(owner = "client!client", name = "ob", descriptor = "Lclient!jb;")
	private Class1_Sub3_Sub2_Sub4 aClass1_Sub3_Sub2_Sub4_1;

	@OriginalMember(owner = "client!client", name = "pb", descriptor = "Lclient!jb;")
	private Class1_Sub3_Sub2_Sub4 aClass1_Sub3_Sub2_Sub4_2;

	@OriginalMember(owner = "client!client", name = "qb", descriptor = "Lclient!jb;")
	private Class1_Sub3_Sub2_Sub4 aClass1_Sub3_Sub2_Sub4_3;

	@OriginalMember(owner = "client!client", name = "rb", descriptor = "Lclient!jb;")
	private Class1_Sub3_Sub2_Sub4 aClass1_Sub3_Sub2_Sub4_4;

	@OriginalMember(owner = "client!client", name = "zb", descriptor = "I")
	private int anInt100;

	@OriginalMember(owner = "client!client", name = "Db", descriptor = "Lclient!hb;")
	private Class1_Sub3_Sub2_Sub2 aClass1_Sub3_Sub2_Sub2_1;

	@OriginalMember(owner = "client!client", name = "Eb", descriptor = "Lclient!hb;")
	private Class1_Sub3_Sub2_Sub2 aClass1_Sub3_Sub2_Sub2_2;

	@OriginalMember(owner = "client!client", name = "Fb", descriptor = "I")
	private int anInt103;

	@OriginalMember(owner = "client!client", name = "Hb", descriptor = "Lclient!ib;")
	private Class1_Sub3_Sub2_Sub3 aClass1_Sub3_Sub2_Sub3_6;

	@OriginalMember(owner = "client!client", name = "Ib", descriptor = "Lclient!ib;")
	private Class1_Sub3_Sub2_Sub3 aClass1_Sub3_Sub2_Sub3_7;

	@OriginalMember(owner = "client!client", name = "Jb", descriptor = "Lclient!ib;")
	private Class1_Sub3_Sub2_Sub3 aClass1_Sub3_Sub2_Sub3_8;

	@OriginalMember(owner = "client!client", name = "Ob", descriptor = "Lclient!z;")
	private Class1_Sub1_Sub3_Sub2 aClass1_Sub1_Sub3_Sub2_1;

	@OriginalMember(owner = "client!client", name = "Pb", descriptor = "I")
	private int anInt105;

	@OriginalMember(owner = "client!client", name = "Qb", descriptor = "I")
	private int anInt106;

	@OriginalMember(owner = "client!client", name = "Tb", descriptor = "I")
	private int anInt108;

	@OriginalMember(owner = "client!client", name = "Wb", descriptor = "I")
	private int anInt109;

	@OriginalMember(owner = "client!client", name = "Xb", descriptor = "I")
	private int anInt110;

	@OriginalMember(owner = "client!client", name = "Yb", descriptor = "I")
	private int anInt111;

	@OriginalMember(owner = "client!client", name = "Zb", descriptor = "Ljava/lang/String;")
	private String aString4;

	@OriginalMember(owner = "client!client", name = "ac", descriptor = "I")
	private int anInt112;

	@OriginalMember(owner = "client!client", name = "cc", descriptor = "I")
	private int anInt114;

	@OriginalMember(owner = "client!client", name = "dc", descriptor = "I")
	private int anInt115;

	@OriginalMember(owner = "client!client", name = "ec", descriptor = "I")
	private int anInt116;

	@OriginalMember(owner = "client!client", name = "fc", descriptor = "I")
	private int anInt117;

	@OriginalMember(owner = "client!client", name = "gc", descriptor = "Ljava/lang/String;")
	private String aString5;

	@OriginalMember(owner = "client!client", name = "mc", descriptor = "I")
	private int anInt119;

	@OriginalMember(owner = "client!client", name = "pc", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray3;

	@OriginalMember(owner = "client!client", name = "rc", descriptor = "Lclient!ib;")
	private Class1_Sub3_Sub2_Sub3 aClass1_Sub3_Sub2_Sub3_9;

	@OriginalMember(owner = "client!client", name = "sc", descriptor = "Lclient!ib;")
	private Class1_Sub3_Sub2_Sub3 aClass1_Sub3_Sub2_Sub3_10;

	@OriginalMember(owner = "client!client", name = "tc", descriptor = "Lclient!ib;")
	private Class1_Sub3_Sub2_Sub3 aClass1_Sub3_Sub2_Sub3_11;

	@OriginalMember(owner = "client!client", name = "uc", descriptor = "Lclient!ib;")
	private Class1_Sub3_Sub2_Sub3 aClass1_Sub3_Sub2_Sub3_12;

	@OriginalMember(owner = "client!client", name = "vc", descriptor = "Lclient!ib;")
	private Class1_Sub3_Sub2_Sub3 aClass1_Sub3_Sub2_Sub3_13;

	@OriginalMember(owner = "client!client", name = "wc", descriptor = "Lclient!ub;")
	private Class36 aClass36_1;

	@OriginalMember(owner = "client!client", name = "zc", descriptor = "I")
	private int anInt121;

	@OriginalMember(owner = "client!client", name = "Ac", descriptor = "I")
	private int anInt122;

	@OriginalMember(owner = "client!client", name = "Cc", descriptor = "I")
	private int anInt123;

	@OriginalMember(owner = "client!client", name = "Fc", descriptor = "Lclient!r;")
	private Class30 aClass30_1;

	@OriginalMember(owner = "client!client", name = "Gc", descriptor = "I")
	private int anInt124;

	@OriginalMember(owner = "client!client", name = "Mc", descriptor = "I")
	private int anInt125;

	@OriginalMember(owner = "client!client", name = "Qc", descriptor = "I")
	private int anInt128;

	@OriginalMember(owner = "client!client", name = "Sc", descriptor = "I")
	private int anInt129;

	@OriginalMember(owner = "client!client", name = "ad", descriptor = "I")
	private int anInt133;

	@OriginalMember(owner = "client!client", name = "cd", descriptor = "Lclient!d;")
	private Class6 aClass6_1;

	@OriginalMember(owner = "client!client", name = "ed", descriptor = "I")
	private int anInt134;

	@OriginalMember(owner = "client!client", name = "fd", descriptor = "I")
	private int anInt135;

	@OriginalMember(owner = "client!client", name = "jd", descriptor = "I")
	private int anInt136;

	@OriginalMember(owner = "client!client", name = "kd", descriptor = "I")
	private int anInt137;

	@OriginalMember(owner = "client!client", name = "ld", descriptor = "I")
	private int anInt138;

	@OriginalMember(owner = "client!client", name = "md", descriptor = "I")
	private int anInt139;

	@OriginalMember(owner = "client!client", name = "nd", descriptor = "I")
	private int anInt140;

	@OriginalMember(owner = "client!client", name = "od", descriptor = "I")
	private int anInt141;

	@OriginalMember(owner = "client!client", name = "qd", descriptor = "I")
	private int anInt142;

	@OriginalMember(owner = "client!client", name = "ud", descriptor = "I")
	private int anInt146;

	@OriginalMember(owner = "client!client", name = "Cd", descriptor = "I")
	private int anInt147;

	@OriginalMember(owner = "client!client", name = "Dd", descriptor = "I")
	private int anInt148;

	@OriginalMember(owner = "client!client", name = "Ed", descriptor = "I")
	private int anInt149;

	@OriginalMember(owner = "client!client", name = "Fd", descriptor = "I")
	private int anInt150;

	@OriginalMember(owner = "client!client", name = "Gd", descriptor = "I")
	private int anInt151;

	@OriginalMember(owner = "client!client", name = "Hd", descriptor = "[I")
	private int[] anIntArray33;

	@OriginalMember(owner = "client!client", name = "Id", descriptor = "[I")
	private int[] anIntArray34;

	@OriginalMember(owner = "client!client", name = "Jd", descriptor = "[I")
	private int[] anIntArray35;

	@OriginalMember(owner = "client!client", name = "Kd", descriptor = "[I")
	private int[] anIntArray36;

	@OriginalMember(owner = "client!client", name = "Ld", descriptor = "[I")
	private int[] anIntArray37;

	@OriginalMember(owner = "client!client", name = "Md", descriptor = "[I")
	private int[] anIntArray38;

	@OriginalMember(owner = "client!client", name = "Od", descriptor = "I")
	private int anInt152;

	@OriginalMember(owner = "client!client", name = "Pd", descriptor = "I")
	private int anInt153;

	@OriginalMember(owner = "client!client", name = "Qd", descriptor = "I")
	private int anInt154;

	@OriginalMember(owner = "client!client", name = "Rd", descriptor = "I")
	private int anInt155;

	@OriginalMember(owner = "client!client", name = "Sd", descriptor = "I")
	private int anInt156;

	@OriginalMember(owner = "client!client", name = "Wd", descriptor = "I")
	private int anInt160;

	@OriginalMember(owner = "client!client", name = "Xd", descriptor = "I")
	private int anInt161;

	@OriginalMember(owner = "client!client", name = "Yd", descriptor = "I")
	private int anInt162;

	@OriginalMember(owner = "client!client", name = "Zd", descriptor = "I")
	private int anInt163;

	@OriginalMember(owner = "client!client", name = "ce", descriptor = "I")
	private int anInt164;

	@OriginalMember(owner = "client!client", name = "de", descriptor = "I")
	private int anInt165;

	@OriginalMember(owner = "client!client", name = "ee", descriptor = "I")
	private int anInt166;

	@OriginalMember(owner = "client!client", name = "fe", descriptor = "I")
	private int anInt167;

	@OriginalMember(owner = "client!client", name = "he", descriptor = "I")
	private int anInt169;

	@OriginalMember(owner = "client!client", name = "je", descriptor = "I")
	private int anInt170;

	@OriginalMember(owner = "client!client", name = "ke", descriptor = "Lclient!hb;")
	private Class1_Sub3_Sub2_Sub2 aClass1_Sub3_Sub2_Sub2_3;

	@OriginalMember(owner = "client!client", name = "le", descriptor = "Lclient!hb;")
	private Class1_Sub3_Sub2_Sub2 aClass1_Sub3_Sub2_Sub2_4;

	@OriginalMember(owner = "client!client", name = "me", descriptor = "Lclient!hb;")
	private Class1_Sub3_Sub2_Sub2 aClass1_Sub3_Sub2_Sub2_5;

	@OriginalMember(owner = "client!client", name = "ne", descriptor = "Lclient!hb;")
	private Class1_Sub3_Sub2_Sub2 aClass1_Sub3_Sub2_Sub2_6;

	@OriginalMember(owner = "client!client", name = "te", descriptor = "I")
	private int anInt172;

	@OriginalMember(owner = "client!client", name = "we", descriptor = "Lclient!hb;")
	private Class1_Sub3_Sub2_Sub2 aClass1_Sub3_Sub2_Sub2_7;

	@OriginalMember(owner = "client!client", name = "xe", descriptor = "Lclient!hb;")
	private Class1_Sub3_Sub2_Sub2 aClass1_Sub3_Sub2_Sub2_8;

	@OriginalMember(owner = "client!client", name = "Ce", descriptor = "J")
	private long aLong6;

	@OriginalMember(owner = "client!client", name = "Le", descriptor = "I")
	private int anInt177;

	@OriginalMember(owner = "client!client", name = "Me", descriptor = "I")
	private int anInt178;

	@OriginalMember(owner = "client!client", name = "Oe", descriptor = "[I")
	private int[] anIntArray50;

	@OriginalMember(owner = "client!client", name = "Pe", descriptor = "I")
	private int anInt180;

	@OriginalMember(owner = "client!client", name = "Qe", descriptor = "I")
	private int anInt181;

	@OriginalMember(owner = "client!client", name = "Re", descriptor = "I")
	private int anInt182;

	@OriginalMember(owner = "client!client", name = "Se", descriptor = "I")
	private int anInt183;

	@OriginalMember(owner = "client!client", name = "Ye", descriptor = "I")
	private int anInt185;

	@OriginalMember(owner = "client!client", name = "Ze", descriptor = "I")
	private int anInt186;

	@OriginalMember(owner = "client!client", name = "af", descriptor = "I")
	private int anInt187;

	@OriginalMember(owner = "client!client", name = "bf", descriptor = "I")
	private int anInt188;

	@OriginalMember(owner = "client!client", name = "cf", descriptor = "I")
	private int anInt189;

	@OriginalMember(owner = "client!client", name = "ff", descriptor = "I")
	private int anInt190;

	@OriginalMember(owner = "client!client", name = "gf", descriptor = "Lclient!ib;")
	private Class1_Sub3_Sub2_Sub3 aClass1_Sub3_Sub2_Sub3_14;

	@OriginalMember(owner = "client!client", name = "hf", descriptor = "Lclient!ib;")
	private Class1_Sub3_Sub2_Sub3 aClass1_Sub3_Sub2_Sub3_15;

	@OriginalMember(owner = "client!client", name = "jf", descriptor = "I")
	private int anInt191;

	@OriginalMember(owner = "client!client", name = "pf", descriptor = "[[B")
	private byte[][] aByteArrayArray1;

	@OriginalMember(owner = "client!client", name = "yf", descriptor = "Lclient!qb;")
	private Class29 aClass29_7;

	@OriginalMember(owner = "client!client", name = "zf", descriptor = "Lclient!qb;")
	private Class29 aClass29_8;

	@OriginalMember(owner = "client!client", name = "Af", descriptor = "Lclient!qb;")
	private Class29 aClass29_9;

	@OriginalMember(owner = "client!client", name = "Bf", descriptor = "Lclient!qb;")
	private Class29 aClass29_10;

	@OriginalMember(owner = "client!client", name = "Cf", descriptor = "Lclient!qb;")
	private Class29 aClass29_11;

	@OriginalMember(owner = "client!client", name = "Df", descriptor = "Lclient!qb;")
	private Class29 aClass29_12;

	@OriginalMember(owner = "client!client", name = "Ef", descriptor = "Lclient!qb;")
	private Class29 aClass29_13;

	@OriginalMember(owner = "client!client", name = "Ff", descriptor = "Lclient!qb;")
	private Class29 aClass29_14;

	@OriginalMember(owner = "client!client", name = "Gf", descriptor = "Lclient!qb;")
	private Class29 aClass29_15;

	@OriginalMember(owner = "client!client", name = "Hf", descriptor = "Lclient!hb;")
	private Class1_Sub3_Sub2_Sub2 aClass1_Sub3_Sub2_Sub2_9;

	@OriginalMember(owner = "client!client", name = "If", descriptor = "I")
	private int anInt197;

	@OriginalMember(owner = "client!client", name = "Mf", descriptor = "I")
	private int anInt199;

	@OriginalMember(owner = "client!client", name = "Nf", descriptor = "I")
	private int anInt200;

	@OriginalMember(owner = "client!client", name = "Of", descriptor = "I")
	private int anInt201;

	@OriginalMember(owner = "client!client", name = "Sf", descriptor = "I")
	private int anInt203;

	@OriginalMember(owner = "client!client", name = "Tf", descriptor = "I")
	private int anInt204;

	@OriginalMember(owner = "client!client", name = "Vf", descriptor = "I")
	private int anInt205;

	@OriginalMember(owner = "client!client", name = "Xf", descriptor = "[Lclient!ib;")
	private Class1_Sub3_Sub2_Sub3[] aClass1_Sub3_Sub2_Sub3Array2;

	@OriginalMember(owner = "client!client", name = "Yf", descriptor = "I")
	private int anInt207;

	@OriginalMember(owner = "client!client", name = "ag", descriptor = "I")
	private int anInt208;

	@OriginalMember(owner = "client!client", name = "bg", descriptor = "I")
	private int anInt209;

	@OriginalMember(owner = "client!client", name = "cg", descriptor = "I")
	private int anInt210;

	@OriginalMember(owner = "client!client", name = "dg", descriptor = "I")
	private int anInt211;

	@OriginalMember(owner = "client!client", name = "eg", descriptor = "I")
	private int anInt212;

	@OriginalMember(owner = "client!client", name = "fg", descriptor = "I")
	private int anInt213;

	@OriginalMember(owner = "client!client", name = "hg", descriptor = "I")
	private int anInt215;

	@OriginalMember(owner = "client!client", name = "ig", descriptor = "I")
	private int anInt216;

	@OriginalMember(owner = "client!client", name = "jg", descriptor = "I")
	private int anInt217;

	@OriginalMember(owner = "client!client", name = "kg", descriptor = "I")
	private int anInt218;

	@OriginalMember(owner = "client!client", name = "lg", descriptor = "I")
	private int anInt219;

	@OriginalMember(owner = "client!client", name = "mg", descriptor = "I")
	private int anInt220;

	@OriginalMember(owner = "client!client", name = "og", descriptor = "I")
	private int anInt221;

	@OriginalMember(owner = "client!client", name = "pg", descriptor = "I")
	private int anInt222;

	@OriginalMember(owner = "client!client", name = "qg", descriptor = "I")
	private int anInt223;

	@OriginalMember(owner = "client!client", name = "rg", descriptor = "[I")
	private int[] anIntArray56;

	@OriginalMember(owner = "client!client", name = "sg", descriptor = "[I")
	private int[] anIntArray57;

	@OriginalMember(owner = "client!client", name = "tg", descriptor = "[I")
	private int[] anIntArray58;

	@OriginalMember(owner = "client!client", name = "wg", descriptor = "Lclient!qb;")
	private Class29 aClass29_16;

	@OriginalMember(owner = "client!client", name = "xg", descriptor = "Lclient!qb;")
	private Class29 aClass29_17;

	@OriginalMember(owner = "client!client", name = "yg", descriptor = "Lclient!qb;")
	private Class29 aClass29_18;

	@OriginalMember(owner = "client!client", name = "zg", descriptor = "I")
	private int anInt224;

	@OriginalMember(owner = "client!client", name = "Bg", descriptor = "Lclient!ib;")
	private Class1_Sub3_Sub2_Sub3 aClass1_Sub3_Sub2_Sub3_16;

	@OriginalMember(owner = "client!client", name = "Cg", descriptor = "Lclient!ib;")
	private Class1_Sub3_Sub2_Sub3 aClass1_Sub3_Sub2_Sub3_17;

	@OriginalMember(owner = "client!client", name = "Dg", descriptor = "Lclient!ib;")
	private Class1_Sub3_Sub2_Sub3 aClass1_Sub3_Sub2_Sub3_18;

	@OriginalMember(owner = "client!client", name = "Ig", descriptor = "I")
	private int anInt225;

	@OriginalMember(owner = "client!client", name = "Lg", descriptor = "Lclient!hb;")
	private Class1_Sub3_Sub2_Sub2 aClass1_Sub3_Sub2_Sub2_10;

	@OriginalMember(owner = "client!client", name = "Mg", descriptor = "I")
	private int anInt228;

	@OriginalMember(owner = "client!client", name = "Ng", descriptor = "[I")
	private int[] anIntArray61;

	@OriginalMember(owner = "client!client", name = "Og", descriptor = "[I")
	private int[] anIntArray62;

	@OriginalMember(owner = "client!client", name = "Rg", descriptor = "Lclient!ib;")
	private Class1_Sub3_Sub2_Sub3 aClass1_Sub3_Sub2_Sub3_19;

	@OriginalMember(owner = "client!client", name = "Sg", descriptor = "Lclient!ib;")
	private Class1_Sub3_Sub2_Sub3 aClass1_Sub3_Sub2_Sub3_20;

	@OriginalMember(owner = "client!client", name = "Ug", descriptor = "[[B")
	private byte[][] aByteArrayArray2;

	@OriginalMember(owner = "client!client", name = "Wg", descriptor = "I")
	private int anInt230;

	@OriginalMember(owner = "client!client", name = "Zg", descriptor = "I")
	private int anInt231;

	@OriginalMember(owner = "client!client", name = "ah", descriptor = "I")
	private int anInt232;

	@OriginalMember(owner = "client!client", name = "gh", descriptor = "I")
	private int anInt233;

	@OriginalMember(owner = "client!client", name = "hh", descriptor = "I")
	private int anInt234;

	@OriginalMember(owner = "client!client", name = "jh", descriptor = "Lclient!ib;")
	private Class1_Sub3_Sub2_Sub3 aClass1_Sub3_Sub2_Sub3_21;

	@OriginalMember(owner = "client!client", name = "kh", descriptor = "Lclient!ib;")
	private Class1_Sub3_Sub2_Sub3 aClass1_Sub3_Sub2_Sub3_22;

	@OriginalMember(owner = "client!client", name = "nh", descriptor = "Lclient!qb;")
	private Class29 aClass29_19;

	@OriginalMember(owner = "client!client", name = "oh", descriptor = "Lclient!qb;")
	private Class29 aClass29_20;

	@OriginalMember(owner = "client!client", name = "ph", descriptor = "Lclient!qb;")
	private Class29 aClass29_21;

	@OriginalMember(owner = "client!client", name = "qh", descriptor = "Lclient!qb;")
	private Class29 aClass29_22;

	@OriginalMember(owner = "client!client", name = "rh", descriptor = "Lclient!qb;")
	private Class29 aClass29_23;

	@OriginalMember(owner = "client!client", name = "sh", descriptor = "Lclient!qb;")
	private Class29 aClass29_24;

	@OriginalMember(owner = "client!client", name = "th", descriptor = "Lclient!qb;")
	private Class29 aClass29_25;

	@OriginalMember(owner = "client!client", name = "uh", descriptor = "Lclient!qb;")
	private Class29 aClass29_26;

	@OriginalMember(owner = "client!client", name = "vh", descriptor = "Lclient!qb;")
	private Class29 aClass29_27;

	@OriginalMember(owner = "client!client", name = "wh", descriptor = "Lclient!qb;")
	private Class29 aClass29_28;

	@OriginalMember(owner = "client!client", name = "D", descriptor = "Z")
	private boolean aBoolean30 = false;

	@OriginalMember(owner = "client!client", name = "H", descriptor = "Ljava/util/zip/CRC32;")
	private CRC32 aCRC32_1 = new CRC32();

	@OriginalMember(owner = "client!client", name = "I", descriptor = "Z")
	private boolean aBoolean31 = false;

	@OriginalMember(owner = "client!client", name = "U", descriptor = "Lclient!ob;")
	private Class25 aClass25_1 = new Class25(5);

	@OriginalMember(owner = "client!client", name = "V", descriptor = "Z")
	private boolean aBoolean32 = false;

	@OriginalMember(owner = "client!client", name = "X", descriptor = "Z")
	private boolean aBoolean33 = false;

	@OriginalMember(owner = "client!client", name = "Y", descriptor = "B")
	private byte aByte4 = 9;

	@OriginalMember(owner = "client!client", name = "Z", descriptor = "Lclient!ob;")
	private Class25 aClass25_2 = new Class25(5);

	@OriginalMember(owner = "client!client", name = "cb", descriptor = "Z")
	private boolean aBoolean34 = false;

	@OriginalMember(owner = "client!client", name = "db", descriptor = "Z")
	private boolean aBoolean35 = true;

	@OriginalMember(owner = "client!client", name = "eb", descriptor = "[I")
	private int[] anIntArray17 = new int[100];

	@OriginalMember(owner = "client!client", name = "hb", descriptor = "[[[Lclient!ob;")
	private Class25[][][] aClass25ArrayArrayArray1 = new Class25[4][104][104];

	@OriginalMember(owner = "client!client", name = "tb", descriptor = "I")
	private int anInt99 = 78;

	@OriginalMember(owner = "client!client", name = "vb", descriptor = "B")
	private byte aByte5 = 71;

	@OriginalMember(owner = "client!client", name = "wb", descriptor = "B")
	private byte aByte6 = 0;

	@OriginalMember(owner = "client!client", name = "xb", descriptor = "Z")
	private boolean aBoolean37 = false;

	@OriginalMember(owner = "client!client", name = "yb", descriptor = "Z")
	private boolean aBoolean38 = false;

	@OriginalMember(owner = "client!client", name = "Ab", descriptor = "I")
	private int anInt101 = 3073;

	@OriginalMember(owner = "client!client", name = "Bb", descriptor = "[J")
	private long[] aLongArray3 = new long[100];

	@OriginalMember(owner = "client!client", name = "Cb", descriptor = "I")
	private int anInt102 = -1;

	@OriginalMember(owner = "client!client", name = "Gb", descriptor = "I")
	private int anInt104 = 2;

	@OriginalMember(owner = "client!client", name = "Lb", descriptor = "Ljava/lang/String;")
	private String aString3 = "";

	@OriginalMember(owner = "client!client", name = "Mb", descriptor = "B")
	private byte aByte7 = 7;

	@OriginalMember(owner = "client!client", name = "Nb", descriptor = "[I")
	private int[] anIntArray20 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

	@OriginalMember(owner = "client!client", name = "Rb", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray1 = new String[100];

	@OriginalMember(owner = "client!client", name = "Sb", descriptor = "I")
	private int anInt107 = -1;

	@OriginalMember(owner = "client!client", name = "Ub", descriptor = "Z")
	private boolean aBoolean39 = false;

	@OriginalMember(owner = "client!client", name = "Vb", descriptor = "B")
	private byte aByte8 = 8;

	@OriginalMember(owner = "client!client", name = "bc", descriptor = "I")
	private int anInt113 = 7;

	@OriginalMember(owner = "client!client", name = "hc", descriptor = "[I")
	private int[] anIntArray21 = new int[8];

	@OriginalMember(owner = "client!client", name = "ic", descriptor = "[Lclient!ib;")
	private Class1_Sub3_Sub2_Sub3[] aClass1_Sub3_Sub2_Sub3Array1 = new Class1_Sub3_Sub2_Sub3[50];

	@OriginalMember(owner = "client!client", name = "jc", descriptor = "I")
	private int anInt118 = 10;

	@OriginalMember(owner = "client!client", name = "kc", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray2 = new String[500];

	@OriginalMember(owner = "client!client", name = "lc", descriptor = "[I")
	private int[] anIntArray22 = new int[256];

	@OriginalMember(owner = "client!client", name = "nc", descriptor = "[I")
	private int[] anIntArray23 = new int[4000];

	@OriginalMember(owner = "client!client", name = "oc", descriptor = "[I")
	private int[] anIntArray24 = new int[4000];

	@OriginalMember(owner = "client!client", name = "qc", descriptor = "Z")
	private boolean aBoolean40 = false;

	@OriginalMember(owner = "client!client", name = "xc", descriptor = "I")
	private int anInt120 = 962;

	@OriginalMember(owner = "client!client", name = "yc", descriptor = "Z")
	private boolean aBoolean41 = false;

	@OriginalMember(owner = "client!client", name = "Bc", descriptor = "[Lclient!bc;")
	private Class3[] aClass3Array1 = new Class3[4];

	@OriginalMember(owner = "client!client", name = "Dc", descriptor = "Z")
	private boolean aBoolean42 = false;

	@OriginalMember(owner = "client!client", name = "Ec", descriptor = "Z")
	private boolean aBoolean43 = false;

	@OriginalMember(owner = "client!client", name = "Hc", descriptor = "Ljava/lang/String;")
	private String aString6 = "";

	@OriginalMember(owner = "client!client", name = "Ic", descriptor = "Ljava/lang/String;")
	private String aString7 = "";

	@OriginalMember(owner = "client!client", name = "Jc", descriptor = "Ljava/lang/String;")
	private String aString8 = "";

	@OriginalMember(owner = "client!client", name = "Kc", descriptor = "Lclient!ob;")
	private Class25 aClass25_3 = new Class25(5);

	@OriginalMember(owner = "client!client", name = "Lc", descriptor = "Z")
	private boolean aBoolean44 = false;

	@OriginalMember(owner = "client!client", name = "Nc", descriptor = "I")
	private int anInt126 = 2048;

	@OriginalMember(owner = "client!client", name = "Oc", descriptor = "I")
	private int anInt127 = 2047;

	@OriginalMember(owner = "client!client", name = "Pc", descriptor = "[Lclient!z;")
	private Class1_Sub1_Sub3_Sub2[] aClass1_Sub1_Sub3_Sub2Array1 = new Class1_Sub1_Sub3_Sub2[this.anInt126];

	@OriginalMember(owner = "client!client", name = "Rc", descriptor = "[I")
	private int[] anIntArray25 = new int[this.anInt126];

	@OriginalMember(owner = "client!client", name = "Tc", descriptor = "[I")
	private int[] anIntArray26 = new int[this.anInt126];

	@OriginalMember(owner = "client!client", name = "Uc", descriptor = "[Lclient!kb;")
	private Class1_Sub3_Sub3[] aClass1_Sub3_Sub3Array1 = new Class1_Sub3_Sub3[this.anInt126];

	@OriginalMember(owner = "client!client", name = "Vc", descriptor = "I")
	private int anInt130 = -1;

	@OriginalMember(owner = "client!client", name = "Wc", descriptor = "I")
	private int anInt131 = -1;

	@OriginalMember(owner = "client!client", name = "Zc", descriptor = "Z")
	private boolean aBoolean45 = false;

	@OriginalMember(owner = "client!client", name = "bd", descriptor = "Z")
	private boolean aBoolean46 = false;

	@OriginalMember(owner = "client!client", name = "dd", descriptor = "[Z")
	private boolean[] aBooleanArray1 = new boolean[5];

	@OriginalMember(owner = "client!client", name = "gd", descriptor = "[I")
	private int[] anIntArray27 = new int[1000];

	@OriginalMember(owner = "client!client", name = "hd", descriptor = "[I")
	private int[] anIntArray28 = new int[1000];

	@OriginalMember(owner = "client!client", name = "id", descriptor = "Z")
	private boolean aBoolean47 = false;

	@OriginalMember(owner = "client!client", name = "pd", descriptor = "[I")
	private int[] anIntArray29 = new int[50];

	@OriginalMember(owner = "client!client", name = "rd", descriptor = "I")
	private int anInt143 = -374;

	@OriginalMember(owner = "client!client", name = "sd", descriptor = "I")
	private int anInt144 = 42788;

	@OriginalMember(owner = "client!client", name = "td", descriptor = "I")
	private int anInt145 = -23085;

	@OriginalMember(owner = "client!client", name = "vd", descriptor = "[I")
	private int[] anIntArray30 = new int[100];

	@OriginalMember(owner = "client!client", name = "wd", descriptor = "Ljava/lang/String;")
	private String aString10 = "";

	@OriginalMember(owner = "client!client", name = "xd", descriptor = "B")
	private byte aByte9 = -48;

	@OriginalMember(owner = "client!client", name = "zd", descriptor = "[I")
	private int[] anIntArray31 = new int[33];

	@OriginalMember(owner = "client!client", name = "Bd", descriptor = "[I")
	private int[] anIntArray32 = new int[5];

	@OriginalMember(owner = "client!client", name = "Nd", descriptor = "[I")
	private int[] anIntArray39 = new int[151];

	@OriginalMember(owner = "client!client", name = "Td", descriptor = "I")
	private int anInt157 = -878;

	@OriginalMember(owner = "client!client", name = "Vd", descriptor = "I")
	private int anInt159 = 647;

	@OriginalMember(owner = "client!client", name = "ae", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray3 = new String[100];

	@OriginalMember(owner = "client!client", name = "be", descriptor = "[I")
	private int[] anIntArray40 = new int[33];

	@OriginalMember(owner = "client!client", name = "ge", descriptor = "I")
	private int anInt168 = 7;

	@OriginalMember(owner = "client!client", name = "ie", descriptor = "[I")
	private int[] anIntArray41 = new int[2000];

	@OriginalMember(owner = "client!client", name = "pe", descriptor = "[I")
	private int[] anIntArray42 = new int[5];

	@OriginalMember(owner = "client!client", name = "qe", descriptor = "I")
	private final int anInt171 = 100;

	@OriginalMember(owner = "client!client", name = "re", descriptor = "[I")
	private int[] anIntArray43 = new int[100];

	@OriginalMember(owner = "client!client", name = "se", descriptor = "Z")
	private boolean aBoolean50 = false;

	@OriginalMember(owner = "client!client", name = "ue", descriptor = "[I")
	private int[] anIntArray44 = new int[1000];

	@OriginalMember(owner = "client!client", name = "ye", descriptor = "Z")
	private boolean aBoolean52 = false;

	@OriginalMember(owner = "client!client", name = "ze", descriptor = "I")
	private int anInt173 = -984;

	@OriginalMember(owner = "client!client", name = "Ae", descriptor = "[I")
	private int[] anIntArray45 = new int[50];

	@OriginalMember(owner = "client!client", name = "De", descriptor = "[Lclient!hb;")
	private Class1_Sub3_Sub2_Sub2[] aClass1_Sub3_Sub2_Sub2Array3 = new Class1_Sub3_Sub2_Sub2[20];

	@OriginalMember(owner = "client!client", name = "Ee", descriptor = "I")
	private int anInt175 = 3353893;

	@OriginalMember(owner = "client!client", name = "Fe", descriptor = "I")
	private int anInt176 = -14722;

	@OriginalMember(owner = "client!client", name = "Ge", descriptor = "[I")
	private int[] anIntArray46 = new int[500];

	@OriginalMember(owner = "client!client", name = "He", descriptor = "[I")
	private int[] anIntArray47 = new int[500];

	@OriginalMember(owner = "client!client", name = "Ie", descriptor = "[I")
	private int[] anIntArray48 = new int[500];

	@OriginalMember(owner = "client!client", name = "Je", descriptor = "[I")
	private int[] anIntArray49 = new int[500];

	@OriginalMember(owner = "client!client", name = "Ke", descriptor = "[B")
	private byte[] aByteArray1 = new byte[16384];

	@OriginalMember(owner = "client!client", name = "Ne", descriptor = "I")
	private int anInt179 = 2;

	@OriginalMember(owner = "client!client", name = "Te", descriptor = "[[I")
	private int[][] anIntArrayArray3 = new int[104][104];

	@OriginalMember(owner = "client!client", name = "Ue", descriptor = "[I")
	private int[] anIntArray51 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

	@OriginalMember(owner = "client!client", name = "Ve", descriptor = "I")
	private int anInt184 = 801;

	@OriginalMember(owner = "client!client", name = "We", descriptor = "[I")
	private int[] anIntArray52 = new int[151];

	@OriginalMember(owner = "client!client", name = "Xe", descriptor = "Lclient!ob;")
	private Class25 aClass25_4 = new Class25(5);

	@OriginalMember(owner = "client!client", name = "df", descriptor = "[I")
	private int[] anIntArray53 = new int[5];

	@OriginalMember(owner = "client!client", name = "ef", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray4 = new String[100];

	@OriginalMember(owner = "client!client", name = "kf", descriptor = "I")
	private int anInt192 = 1;

	@OriginalMember(owner = "client!client", name = "lf", descriptor = "I")
	private int anInt193 = 7759444;

	@OriginalMember(owner = "client!client", name = "mf", descriptor = "[Lclient!hb;")
	private Class1_Sub3_Sub2_Sub2[] aClass1_Sub3_Sub2_Sub2Array4 = new Class1_Sub3_Sub2_Sub2[1000];

	@OriginalMember(owner = "client!client", name = "nf", descriptor = "I")
	private int anInt194 = -1;

	@OriginalMember(owner = "client!client", name = "of", descriptor = "[[I")
	private int[][] anIntArrayArray4 = new int[104][104];

	@OriginalMember(owner = "client!client", name = "qf", descriptor = "I")
	private int anInt195 = 2301979;

	@OriginalMember(owner = "client!client", name = "rf", descriptor = "I")
	private int anInt196 = -984;

	@OriginalMember(owner = "client!client", name = "sf", descriptor = "[I")
	private int[] anIntArray54 = new int[7];

	@OriginalMember(owner = "client!client", name = "tf", descriptor = "[Lclient!hb;")
	private Class1_Sub3_Sub2_Sub2[] aClass1_Sub3_Sub2_Sub2Array5 = new Class1_Sub3_Sub2_Sub2[50];

	@OriginalMember(owner = "client!client", name = "uf", descriptor = "Lclient!ec;")
	private Class9 aClass9_1 = new Class9();

	@OriginalMember(owner = "client!client", name = "vf", descriptor = "B")
	private byte aByte10 = -48;

	@OriginalMember(owner = "client!client", name = "wf", descriptor = "Ljava/lang/String;")
	private String aString11 = "";

	@OriginalMember(owner = "client!client", name = "xf", descriptor = "Z")
	private boolean aBoolean53 = false;

	@OriginalMember(owner = "client!client", name = "Jf", descriptor = "[I")
	private final int[] anIntArray55 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

	@OriginalMember(owner = "client!client", name = "Kf", descriptor = "Lclient!kb;")
	private Class1_Sub3_Sub3 aClass1_Sub3_Sub3_1 = Class1_Sub3_Sub3.method369();

	@OriginalMember(owner = "client!client", name = "Lf", descriptor = "I")
	private int anInt198 = 5063219;

	@OriginalMember(owner = "client!client", name = "Pf", descriptor = "Z")
	private boolean aBoolean54 = false;

	@OriginalMember(owner = "client!client", name = "Qf", descriptor = "I")
	private int anInt202 = 3;

	@OriginalMember(owner = "client!client", name = "Rf", descriptor = "Z")
	private boolean aBoolean55 = true;

	@OriginalMember(owner = "client!client", name = "Uf", descriptor = "[[I")
	private int[][] anIntArrayArray5 = new int[104][104];

	@OriginalMember(owner = "client!client", name = "Wf", descriptor = "I")
	private int anInt206 = 2;

	@OriginalMember(owner = "client!client", name = "Zf", descriptor = "Z")
	private boolean aBoolean56 = false;

	@OriginalMember(owner = "client!client", name = "gg", descriptor = "I")
	private int anInt214 = 128;

	@OriginalMember(owner = "client!client", name = "ng", descriptor = "B")
	private byte aByte11 = 7;

	@OriginalMember(owner = "client!client", name = "ug", descriptor = "Lclient!kb;")
	private Class1_Sub3_Sub3 aClass1_Sub3_Sub3_2 = Class1_Sub3_Sub3.method369();

	@OriginalMember(owner = "client!client", name = "Ag", descriptor = "Lclient!ob;")
	private Class25 aClass25_5 = new Class25(5);

	@OriginalMember(owner = "client!client", name = "Eg", descriptor = "Ljava/lang/String;")
	private String aString12 = "";

	@OriginalMember(owner = "client!client", name = "Fg", descriptor = "[I")
	private int[] anIntArray59 = new int[50];

	@OriginalMember(owner = "client!client", name = "Gg", descriptor = "[I")
	private int[] anIntArray60 = new int[5];

	@OriginalMember(owner = "client!client", name = "Hg", descriptor = "B")
	private byte aByte12 = 2;

	@OriginalMember(owner = "client!client", name = "Jg", descriptor = "I")
	private int anInt226 = -40161;

	@OriginalMember(owner = "client!client", name = "Kg", descriptor = "I")
	private int anInt227 = 4;

	@OriginalMember(owner = "client!client", name = "Pg", descriptor = "[Lclient!hb;")
	private Class1_Sub3_Sub2_Sub2[] aClass1_Sub3_Sub2_Sub2Array6 = new Class1_Sub3_Sub2_Sub2[8];

	@OriginalMember(owner = "client!client", name = "Qg", descriptor = "Lclient!kb;")
	private Class1_Sub3_Sub3 aClass1_Sub3_Sub3_3 = Class1_Sub3_Sub3.method369();

	@OriginalMember(owner = "client!client", name = "Tg", descriptor = "I")
	private int anInt229 = -1;

	@OriginalMember(owner = "client!client", name = "Vg", descriptor = "[Lclient!y;")
	private Class1_Sub1_Sub3_Sub1[] aClass1_Sub1_Sub3_Sub1Array1 = new Class1_Sub1_Sub3_Sub1[8192];

	@OriginalMember(owner = "client!client", name = "Xg", descriptor = "[I")
	private int[] anIntArray63 = new int[8192];

	@OriginalMember(owner = "client!client", name = "Yg", descriptor = "[I")
	private int[] anIntArray64 = new int[5];

	@OriginalMember(owner = "client!client", name = "bh", descriptor = "Z")
	private boolean aBoolean57 = true;

	@OriginalMember(owner = "client!client", name = "ch", descriptor = "[J")
	private long[] aLongArray4 = new long[100];

	@OriginalMember(owner = "client!client", name = "dh", descriptor = "Z")
	private boolean aBoolean58 = false;

	@OriginalMember(owner = "client!client", name = "eh", descriptor = "Ljava/lang/String;")
	private String aString13 = "";

	@OriginalMember(owner = "client!client", name = "fh", descriptor = "Ljava/lang/String;")
	private String aString14 = "";

	@OriginalMember(owner = "client!client", name = "ih", descriptor = "Z")
	private boolean aBoolean59 = false;

	@OriginalMember(owner = "client!client", name = "lh", descriptor = "[Lclient!hb;")
	private Class1_Sub3_Sub2_Sub2[] aClass1_Sub3_Sub2_Sub2Array7 = new Class1_Sub3_Sub2_Sub2[20];

	@OriginalMember(owner = "client!client", name = "mh", descriptor = "I")
	private int anInt235 = -1;

	@OriginalMember(owner = "client!client", name = "xh", descriptor = "Z")
	private boolean aBoolean60 = false;

	@OriginalMember(owner = "client!client", name = "yh", descriptor = "Ljava/lang/String;")
	private String aString15 = "127.0.0.1";

	static {
		@Pc(75) int local75 = 0;
		for (@Pc(77) int local77 = 0; local77 < 99; local77++) {
			@Pc(82) int local82 = local77 + 1;
			@Pc(95) int local95 = (int) ((double) local82 + Math.pow(2.0D, (double) local82 / 7.0D) * 300.0D);
			local75 += local95;
			anIntArray19[local77] = local75 / 4;
		}
		aBigInteger1 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");
		aString9 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";
		aBigInteger2 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");
		aBoolean51 = true;
		anIntArrayArray6 = new int[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, 33697, 22433, 2983, 54193 }, { 8741, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003, 25239 }, { 25238, 8742, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IBI)Ljava/lang/String;")
	private static String method115(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
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
			signlink.reporterror("18220, " + arg0 + ", " + -102 + ", " + arg1 + ", " + local53.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "main", descriptor = "([Ljava/lang/String;)V")
	public static void main(@OriginalArg(0) String[] arg0) {
		try {
			signlink.startpriv(InetAddress.getLocalHost());
			@Pc(5) client local5 = new client();
			if (arg0.length > 0) {
				local5.anInt118 = Integer.parseInt(arg0[0]);
			}
			if (arg0.length > 1) {
				local5.anInt208 = Integer.parseInt(arg0[1]);
			}
			if (arg0.length > 2 && arg0[2].equalsIgnoreCase("lowmem")) {
				method147();
			} else {
				method168();
			}
			local5.method54();
		} catch (@Pc(47) Exception local47) {
		}
	}

	@OriginalMember(owner = "client!client", name = "F", descriptor = "(I)V")
	private static void method147() {
		try {
			Class30.aBoolean136 = true;
			Class1_Sub3_Sub2_Sub1.aBoolean91 = true;
			aBoolean36 = true;
			Class4.aBoolean18 = true;
		} catch (@Pc(13) RuntimeException local13) {
			signlink.reporterror("19696, " + 26953 + ", " + local13.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "J", descriptor = "(I)V")
	private static void method168() {
		try {
			Class30.aBoolean136 = false;
			Class1_Sub3_Sub2_Sub1.aBoolean91 = false;
			aBoolean36 = false;
			Class4.aBoolean18 = false;
		} catch (@Pc(18) RuntimeException local18) {
			signlink.reporterror("97781, " + -229 + ", " + local18.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(Z)V")
	private void method67() {
		try {
			@Pc(8) int local8;
			if (this.anInt222 > 0) {
				for (local8 = 0; local8 < 256; local8++) {
					if (this.anInt222 > 768) {
						this.anIntArray35[local8] = this.method167(this.anIntArray36[local8], 1024 - this.anInt222, this.anIntArray37[local8]);
					} else if (this.anInt222 > 256) {
						this.anIntArray35[local8] = this.anIntArray37[local8];
					} else {
						this.anIntArray35[local8] = this.method167(this.anIntArray37[local8], 256 - this.anInt222, this.anIntArray36[local8]);
					}
				}
			} else if (this.anInt223 > 0) {
				for (local8 = 0; local8 < 256; local8++) {
					if (this.anInt223 > 768) {
						this.anIntArray35[local8] = this.method167(this.anIntArray36[local8], 1024 - this.anInt223, this.anIntArray38[local8]);
					} else if (this.anInt223 > 256) {
						this.anIntArray35[local8] = this.anIntArray38[local8];
					} else {
						this.anIntArray35[local8] = this.method167(this.anIntArray38[local8], 256 - this.anInt223, this.anIntArray36[local8]);
					}
				}
			} else {
				for (local8 = 0; local8 < 256; local8++) {
					this.anIntArray35[local8] = this.anIntArray36[local8];
				}
			}
			for (local8 = 0; local8 < 33920; local8++) {
				this.aClass29_10.anIntArray171[local8] = this.aClass1_Sub3_Sub2_Sub2_1.anIntArray135[local8];
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
				local198 = this.anIntArray22[local185] * (256 - local185) / 256;
				local202 = local198 + 22;
				if (local202 < 0) {
					local202 = 0;
				}
				local181 += local202;
				for (local212 = local202; local212 < 128; local212++) {
					local220 = this.anIntArray33[local181++];
					if (local220 == 0) {
						local183++;
					} else {
						local224 = local220;
						local228 = 256 - local220;
						local220 = this.anIntArray35[local220];
						local239 = this.aClass29_10.anIntArray171[local183];
						this.aClass29_10.anIntArray171[local183++] = ((local220 & 0xFF00FF) * local224 + (local239 & 0xFF00FF) * local228 & 0xFF00FF00) + ((local220 & 0xFF00) * local224 + (local239 & 0xFF00) * local228 & 0xFF0000) >> 8;
					}
				}
				local183 += local202;
			}
			this.aClass29_10.method410(0, super.aGraphics2, 0, this.aByte11);
			for (local198 = 0; local198 < 33920; local198++) {
				this.aClass29_11.anIntArray171[local198] = this.aClass1_Sub3_Sub2_Sub2_2.anIntArray135[local198];
			}
			local181 = 0;
			local183 = 1176;
			for (local202 = 1; local202 < 255; local202++) {
				local212 = this.anIntArray22[local202] * (256 - local202) / 256;
				local220 = 103 - local212;
				local183 += local212;
				for (local224 = 0; local224 < local220; local224++) {
					local228 = this.anIntArray33[local181++];
					if (local228 == 0) {
						local183++;
					} else {
						local239 = local228;
						@Pc(363) int local363 = 256 - local228;
						local228 = this.anIntArray35[local228];
						@Pc(374) int local374 = this.aClass29_11.anIntArray171[local183];
						this.aClass29_11.anIntArray171[local183++] = ((local228 & 0xFF00FF) * local239 + (local374 & 0xFF00FF) * local363 & 0xFF00FF00) + ((local228 & 0xFF00) * local239 + (local374 & 0xFF00) * local363 & 0xFF0000) >> 8;
					}
				}
				local181 += 128 - local220;
				local183 += 128 - local220 - local212;
			}
			this.aBoolean41 &= true;
			this.aClass29_11.method410(661, super.aGraphics2, 0, this.aByte11);
		} catch (@Pc(453) RuntimeException local453) {
			signlink.reporterror("61345, " + true + ", " + local453.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIB)I")
	private int method68(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte arg3) {
		try {
			@Pc(3) int local3 = arg0 >> 7;
			@Pc(7) int local7 = arg1 >> 7;
			@Pc(9) int local9 = arg2;
			if (arg2 < 3 && (this.aByteArrayArrayArray7[1][local3][local7] & 0x2) == 2) {
				local9 = arg2 + 1;
			}
			@Pc(29) int local29 = arg0 & 0x7F;
			@Pc(33) int local33 = arg1 & 0x7F;
			@Pc(38) boolean local38 = false;
			@Pc(72) int local72 = this.anIntArrayArrayArray3[local9][local3][local7] * (128 - local29) + this.anIntArrayArrayArray3[local9][local3 + 1][local7] * local29 >> 7;
			@Pc(104) int local104 = this.anIntArrayArrayArray3[local9][local3][local7 + 1] * (128 - local29) + this.anIntArrayArrayArray3[local9][local3 + 1][local7 + 1] * local29 >> 7;
			return local72 * (128 - local33) + local104 * local33 >> 7;
		} catch (@Pc(117) RuntimeException local117) {
			signlink.reporterror("1799, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local117.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(II)V")
	private void method69(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(9) Class25 local9 = this.aClass25ArrayArrayArray1[this.anInt119][arg0][arg1];
		if (local9 == null) {
			this.aClass30_1.method436(this.anInt119, arg0, arg1);
			return;
		}
		@Pc(21) int local21 = -99999999;
		@Pc(23) Class1_Sub7 local23 = null;
		@Pc(27) Class1_Sub7 local27;
		@Pc(35) int local35;
		for (local27 = (Class1_Sub7) local9.method402(); local27 != null; local27 = (Class1_Sub7) local9.method404()) {
			@Pc(32) Class41 local32 = Class41.method522(local27.anInt608);
			local35 = local32.anInt816;
			if (local32.aBoolean164) {
				local35 *= 10;
			}
			if (local35 > local21) {
				local21 = local35;
				local23 = local27;
			}
		}
		local9.method400(local23);
		@Pc(62) int local62 = -1;
		local35 = -1;
		for (local27 = (Class1_Sub7) local9.method402(); local27 != null; local27 = (Class1_Sub7) local9.method404()) {
			if (local27.anInt608 != local23.anInt608 && local62 == -1) {
				local62 = local27.anInt608;
			}
			if (local27.anInt608 != local23.anInt608 && local27.anInt608 != local62 && local35 == -1) {
				local35 = local27.anInt608;
			}
		}
		@Pc(105) Class1_Sub3_Sub1 local105 = null;
		if (local62 != -1) {
			local105 = Class41.method522(local62).method525();
		}
		@Pc(114) Class1_Sub3_Sub1 local114 = null;
		if (local35 != -1) {
			local114 = Class41.method522(local35).method525();
		}
		@Pc(129) int local129 = arg0 + (arg1 << 7) + 1610612736;
		@Pc(133) Class41 local133 = Class41.method522(local23.anInt608);
		this.aClass30_1.method420(arg0, this.method68(arg0 * 128 + 64, arg1 * 128 + 64, this.anInt119, (byte) 9), local133.method525(), local105, local129, local114, arg1, this.anInt119);
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(Z)I")
	private int method70() {
		try {
			@Pc(3) int local3 = 3;
			if (this.anInt212 < 310) {
				@Pc(16) int local16 = this.anInt209 >> 7;
				@Pc(21) int local21 = this.anInt211 >> 7;
				@Pc(27) int local27 = this.aClass1_Sub1_Sub3_Sub2_1.anInt742 >> 7;
				@Pc(33) int local33 = this.aClass1_Sub1_Sub3_Sub2_1.anInt743 >> 7;
				if ((this.aByteArrayArrayArray7[this.anInt119][local16][local21] & 0x4) != 0) {
					local3 = this.anInt119;
				}
				@Pc(55) int local55;
				if (local27 > local16) {
					local55 = local27 - local16;
				} else {
					local55 = local16 - local27;
				}
				@Pc(68) int local68;
				if (local33 > local21) {
					local68 = local33 - local21;
				} else {
					local68 = local21 - local33;
				}
				@Pc(83) int local83;
				@Pc(85) int local85;
				if (local55 > local68) {
					local83 = local68 * 65536 / local55;
					local85 = 32768;
					while (local16 != local27) {
						if (local16 < local27) {
							local16++;
						} else if (local16 > local27) {
							local16--;
						}
						if ((this.aByteArrayArrayArray7[this.anInt119][local16][local21] & 0x4) != 0) {
							local3 = this.anInt119;
						}
						local85 += local83;
						if (local85 >= 65536) {
							local85 -= 65536;
							if (local21 < local33) {
								local21++;
							} else if (local21 > local33) {
								local21--;
							}
							if ((this.aByteArrayArrayArray7[this.anInt119][local16][local21] & 0x4) != 0) {
								local3 = this.anInt119;
							}
						}
					}
				} else {
					local83 = local55 * 65536 / local68;
					local85 = 32768;
					while (local21 != local33) {
						if (local21 < local33) {
							local21++;
						} else if (local21 > local33) {
							local21--;
						}
						if ((this.aByteArrayArrayArray7[this.anInt119][local16][local21] & 0x4) != 0) {
							local3 = this.anInt119;
						}
						local85 += local83;
						if (local85 >= 65536) {
							local85 -= 65536;
							if (local16 < local27) {
								local16++;
							} else if (local16 > local27) {
								local16--;
							}
							if ((this.aByteArrayArrayArray7[this.anInt119][local16][local21] & 0x4) != 0) {
								local3 = this.anInt119;
							}
						}
					}
				}
			}
			if ((this.aByteArrayArrayArray7[this.anInt119][this.aClass1_Sub1_Sub3_Sub2_1.anInt742 >> 7][this.aClass1_Sub1_Sub3_Sub2_1.anInt743 >> 7] & 0x4) != 0) {
				local3 = this.anInt119;
			}
			return local3;
		} catch (@Pc(253) RuntimeException local253) {
			signlink.reporterror("30044, " + false + ", " + local253.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(I)I")
	private int method71() {
		try {
			@Pc(18) int local18 = this.method68(this.anInt209, this.anInt211, this.anInt119, (byte) 9);
			return local18 - this.anInt210 >= 800 || (this.aByteArrayArrayArray7[this.anInt119][this.anInt209 >> 7][this.anInt211 >> 7] & 0x4) == 0 ? 3 : this.anInt119;
		} catch (@Pc(48) RuntimeException local48) {
			signlink.reporterror("76589, " + 5 + ", " + local48.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "f", descriptor = "(I)V")
	private void method72() {
		try {
			if (this.anInt114 == 0 && this.anInt109 == 0) {
				this.aStringArray2[this.anInt112] = "Walk here";
				this.anIntArray48[this.anInt112] = 404;
				this.anIntArray46[this.anInt112] = super.anInt79;
				this.anIntArray47[this.anInt112] = super.anInt80;
				this.anInt112++;
			}
			@Pc(46) int local46 = -1;
			for (@Pc(48) int local48 = 0; local48 < Class1_Sub3_Sub1.anInt268; local48++) {
				@Pc(54) int local54 = Class1_Sub3_Sub1.anIntArray101[local48];
				@Pc(58) int local58 = local54 & 0x7F;
				@Pc(64) int local64 = local54 >> 7 & 0x7F;
				@Pc(70) int local70 = local54 >> 29 & 0x3;
				@Pc(76) int local76 = local54 >> 14 & 0x7FFF;
				if (local54 != local46) {
					local46 = local54;
					@Pc(214) int local214;
					if (local70 == 2 && this.aClass30_1.method441(this.anInt119, local58, local64, local54) >= 0) {
						@Pc(96) Class39 local96 = Class39.method496(local76);
						if (this.anInt114 == 1) {
							this.aStringArray2[this.anInt112] = "Use " + this.aString5 + " with @cya@" + local96.aString23;
							this.anIntArray48[this.anInt112] = 174;
							this.anIntArray49[this.anInt112] = local54;
							this.anIntArray46[this.anInt112] = local58;
							this.anIntArray47[this.anInt112] = local64;
							this.anInt112++;
						} else if (this.anInt109 != 1) {
							if (local96.aStringArray7 != null) {
								for (local214 = 4; local214 >= 0; local214--) {
									if (local96.aStringArray7[local214] != null) {
										this.aStringArray2[this.anInt112] = local96.aStringArray7[local214] + " @cya@" + local96.aString23;
										if (local214 == 0) {
											this.anIntArray48[this.anInt112] = 447;
										}
										if (local214 == 1) {
											this.anIntArray48[this.anInt112] = 846;
										}
										if (local214 == 2) {
											this.anIntArray48[this.anInt112] = 34;
										}
										if (local214 == 3) {
											this.anIntArray48[this.anInt112] = 310;
										}
										if (local214 == 4) {
											this.anIntArray48[this.anInt112] = 647;
										}
										this.anIntArray49[this.anInt112] = local54;
										this.anIntArray46[this.anInt112] = local58;
										this.anIntArray47[this.anInt112] = local64;
										this.anInt112++;
									}
								}
							}
							this.aStringArray2[this.anInt112] = "Examine @cya@" + local96.aString23;
							this.anIntArray48[this.anInt112] = 1419;
							this.anIntArray49[this.anInt112] = local54;
							this.anIntArray46[this.anInt112] = local58;
							this.anIntArray47[this.anInt112] = local64;
							this.anInt112++;
						} else if ((this.anInt111 & 0x4) == 4) {
							this.aStringArray2[this.anInt112] = this.aString4 + " @cya@" + local96.aString23;
							this.anIntArray48[this.anInt112] = 792;
							this.anIntArray49[this.anInt112] = local54;
							this.anIntArray46[this.anInt112] = local58;
							this.anIntArray47[this.anInt112] = local64;
							this.anInt112++;
						}
					}
					@Pc(391) Class1_Sub1_Sub3_Sub1 local391;
					if (local70 == 1) {
						@Pc(362) Class1_Sub1_Sub3_Sub1 local362 = this.aClass1_Sub1_Sub3_Sub1Array1[local76];
						if (local362.aClass40_1.aByte28 == 1 && (local362.anInt742 & 0x7F) == 64 && (local362.anInt743 & 0x7F) == 64) {
							for (local214 = 0; local214 < this.anInt230; local214++) {
								local391 = this.aClass1_Sub1_Sub3_Sub1Array1[this.anIntArray63[local214]];
								if (local391 != null && local391 != local362 && local391.aClass40_1.aByte28 == 1 && local391.anInt742 == local362.anInt742 && local391.anInt743 == local362.anInt743) {
									this.method144(local64, this.anIntArray63[local214], local58, local391.aClass40_1);
								}
							}
						}
						this.method144(local64, local76, local58, local362.aClass40_1);
					}
					if (local70 == 0) {
						@Pc(442) Class1_Sub1_Sub3_Sub2 local442 = this.aClass1_Sub1_Sub3_Sub2Array1[local76];
						if ((local442.anInt742 & 0x7F) == 64 && (local442.anInt743 & 0x7F) == 64) {
							for (local214 = 0; local214 < this.anInt230; local214++) {
								local391 = this.aClass1_Sub1_Sub3_Sub1Array1[this.anIntArray63[local214]];
								if (local391 != null && local391.aClass40_1.aByte28 == 1 && local391.anInt742 == local442.anInt742 && local391.anInt743 == local442.anInt743) {
									this.method144(local64, this.anIntArray63[local214], local58, local391.aClass40_1);
								}
							}
							for (@Pc(501) int local501 = 0; local501 < this.anInt128; local501++) {
								@Pc(511) Class1_Sub1_Sub3_Sub2 local511 = this.aClass1_Sub1_Sub3_Sub2Array1[this.anIntArray25[local501]];
								if (local511 != null && local511 != local442 && local511.anInt742 == local442.anInt742 && local511.anInt743 == local442.anInt743) {
									this.method166(local511, this.anIntArray25[local501], local64, local58);
								}
							}
						}
						this.method166(local442, local76, local64, local58);
					}
					if (local70 == 3) {
						@Pc(561) Class25 local561 = this.aClass25ArrayArrayArray1[this.anInt119][local58][local64];
						if (local561 != null) {
							for (@Pc(568) Class1_Sub7 local568 = (Class1_Sub7) local561.method403(); local568 != null; local568 = (Class1_Sub7) local561.method405()) {
								@Pc(574) Class41 local574 = Class41.method522(local568.anInt608);
								if (this.anInt114 == 1) {
									this.aStringArray2[this.anInt112] = "Use " + this.aString5 + " with @lre@" + local574.aString28;
									this.anIntArray48[this.anInt112] = 652;
									this.anIntArray49[this.anInt112] = local568.anInt608;
									this.anIntArray46[this.anInt112] = local58;
									this.anIntArray47[this.anInt112] = local64;
									this.anInt112++;
								} else if (this.anInt109 != 1) {
									for (@Pc(691) int local691 = 4; local691 >= 0; local691--) {
										if (local574.aStringArray9 != null && local574.aStringArray9[local691] != null) {
											this.aStringArray2[this.anInt112] = local574.aStringArray9[local691] + " @lre@" + local574.aString28;
											if (local691 == 0) {
												this.anIntArray48[this.anInt112] = 533;
											}
											if (local691 == 1) {
												this.anIntArray48[this.anInt112] = 947;
											}
											if (local691 == 2) {
												this.anIntArray48[this.anInt112] = 705;
											}
											if (local691 == 3) {
												this.anIntArray48[this.anInt112] = 912;
											}
											if (local691 == 4) {
												this.anIntArray48[this.anInt112] = 603;
											}
											this.anIntArray49[this.anInt112] = local568.anInt608;
											this.anIntArray46[this.anInt112] = local58;
											this.anIntArray47[this.anInt112] = local64;
											this.anInt112++;
										} else if (local691 == 2) {
											this.aStringArray2[this.anInt112] = "Take @lre@" + local574.aString28;
											this.anIntArray48[this.anInt112] = 705;
											this.anIntArray49[this.anInt112] = local568.anInt608;
											this.anIntArray46[this.anInt112] = local58;
											this.anIntArray47[this.anInt112] = local64;
											this.anInt112++;
										}
									}
									this.aStringArray2[this.anInt112] = "Examine @lre@" + local574.aString28;
									this.anIntArray48[this.anInt112] = 1585;
									this.anIntArray49[this.anInt112] = local568.anInt608;
									this.anIntArray46[this.anInt112] = local58;
									this.anIntArray47[this.anInt112] = local64;
									this.anInt112++;
								} else if ((this.anInt111 & 0x1) == 1) {
									this.aStringArray2[this.anInt112] = this.aString4 + " @lre@" + local574.aString28;
									this.anIntArray48[this.anInt112] = 926;
									this.anIntArray49[this.anInt112] = local568.anInt608;
									this.anIntArray46[this.anInt112] = local58;
									this.anIntArray47[this.anInt112] = local64;
									this.anInt112++;
								}
							}
						}
					}
				}
			}
		} catch (@Pc(898) RuntimeException local898) {
			signlink.reporterror("76309, " + ", " + local898.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "g", descriptor = "(I)V")
	private void method73() {
		try {
			if (this.anInt167 == 1) {
				this.aClass1_Sub3_Sub2_Sub2Array6[this.anInt166 / 100].method283(this.anInt165 - 8 - 11, this.anInt184, this.anInt164 - 8 - 8);
			}
			if (this.anInt167 == 2) {
				this.aClass1_Sub3_Sub2_Sub2Array6[this.anInt166 / 100 + 4].method283(this.anInt165 - 8 - 11, this.anInt184, this.anInt164 - 8 - 8);
			}
			if (this.anInt229 != -1) {
				this.method106(this.aBoolean47, Class9.aClass9Array1[this.anInt229], 0, 0, 0);
			}
			@Pc(79) int local79 = (this.aClass1_Sub1_Sub3_Sub2_1.anInt742 >> 7) + this.anInt180;
			@Pc(88) int local88 = (this.aClass1_Sub1_Sub3_Sub2_1.anInt743 >> 7) + this.anInt181;
			if (local79 >= 2944 && local79 < 3392 && local88 >= 3520 && local88 < 6400) {
				this.anInt121 = (local88 - 3520) / 8 + 1;
			} else {
				this.anInt121 = 0;
			}
			if (!this.aBoolean52) {
				this.method133();
				this.method170(this.anInt143);
			} else if (this.anInt93 == 0) {
				this.method129();
			}
			if (this.anInt108 == 1) {
				this.aClass1_Sub3_Sub2_Sub2Array3[1].method283(296, this.anInt184, 5);
			}
			if (this.anInt121 > 0) {
				this.aClass1_Sub3_Sub2_Sub2Array3[0].method283(296, this.anInt184, 472);
				this.aClass1_Sub3_Sub2_Sub4_2.method321(329, 16776960, 484, "Level: " + this.anInt121);
			} else if (aBoolean36) {
				@Pc(187) Runtime local187 = Runtime.getRuntime();
				@Pc(190) long local190 = local187.totalMemory();
				@Pc(193) long local193 = local187.freeMemory();
				if (!signlink.sunjava && local190 - local193 > 33554432L && anInt132 > anInt158 + 500) {
					this.method110(this.anInt226);
					local187.gc();
					anInt158 = anInt132;
				}
			}
			if (this.anInt123 != 0) {
				@Pc(224) int local224 = this.anInt123 / 50;
				@Pc(228) int local228 = local224 / 60;
				@Pc(232) int local232 = local224 % 60;
				if (local232 < 10) {
					this.aClass1_Sub3_Sub2_Sub4_2.method321(329, 16776960, 256, "System update in: " + local228 + ":0" + local232);
				} else {
					this.aClass1_Sub3_Sub2_Sub4_2.method321(329, 16776960, 256, "System update in: " + local228 + ":" + local232);
				}
			}
		} catch (@Pc(274) RuntimeException local274) {
			signlink.reporterror("77113, " + 8 + ", " + local274.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "h", descriptor = "(I)V")
	private void method74() {
		try {
			for (@Pc(6) Class1_Sub1_Sub2 local6 = (Class1_Sub1_Sub2) this.aClass25_2.method402(); local6 != null; local6 = (Class1_Sub1_Sub2) this.aClass25_2.method404()) {
				if (local6.anInt35 != this.anInt119 || local6.aBoolean14) {
					local6.method512();
				} else if (anInt132 >= local6.anInt34) {
					local6.method23(this.anInt124);
					if (local6.aBoolean14) {
						local6.method512();
					} else {
						this.aClass30_1.method424(null, local6.anInt38, local6.anInt37, 0, local6.anInt36, local6.anInt35, 0, local6, 60, -1);
					}
				}
			}
		} catch (@Pc(77) RuntimeException local77) {
			signlink.reporterror("566, " + 9 + ", " + local77.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "getjinglelen", descriptor = "()I")
	private int method75() {
		return signlink.jinglelen;
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILclient!ec;I)I")
	private int method76(@OriginalArg(0) int arg0, @OriginalArg(1) Class9 arg1) {
		try {
			if (arg1.anIntArrayArray11 == null || arg0 >= arg1.anIntArrayArray11.length) {
				return -2;
			}
			try {
				@Pc(22) int[] local22 = arg1.anIntArrayArray11[arg0];
				@Pc(24) int local24 = 0;
				@Pc(26) int local26 = 0;
				while (true) {
					@Pc(31) int local31 = local22[local26++];
					if (local31 == 0) {
						return local24;
					}
					if (local31 == 1) {
						local24 += this.anIntArray59[local22[local26++]];
					}
					if (local31 == 2) {
						local24 += this.anIntArray45[local22[local26++]];
					}
					if (local31 == 3) {
						local24 += this.anIntArray29[local22[local26++]];
					}
					@Pc(84) Class9 local84;
					@Pc(91) int local91;
					@Pc(93) int local93;
					if (local31 == 4) {
						local84 = Class9.aClass9Array1[local22[local26++]];
						local91 = local22[local26++] + 1;
						for (local93 = 0; local93 < local84.anIntArray106.length; local93++) {
							if (local84.anIntArray106[local93] == local91) {
								local24 += local84.anIntArray107[local93];
							}
						}
					}
					if (local31 == 5) {
						local24 += this.anIntArray41[local22[local26++]];
					}
					if (local31 == 6) {
						local24 += anIntArray19[this.anIntArray45[local22[local26++]] - 1];
					}
					if (local31 == 7) {
						local24 += this.anIntArray41[local22[local26++]] * 100 / 46875;
					}
					if (local31 == 8) {
						local24 += this.aClass1_Sub1_Sub3_Sub2_1.anInt793;
					}
					if (local31 == 9) {
						for (@Pc(175) int local175 = 0; local175 < 19; local175++) {
							if (local175 == 18) {
								local175 = 20;
							}
							local24 += this.anIntArray45[local175];
						}
					}
					if (local31 == 10) {
						local84 = Class9.aClass9Array1[local22[local26++]];
						local91 = local22[local26++] + 1;
						for (local93 = 0; local93 < local84.anIntArray106.length; local93++) {
							if (local84.anIntArray106[local93] == local91) {
								local24 += 999999999;
								break;
							}
						}
					}
					if (local31 == 11) {
						local24 += this.anInt228;
					}
					if (local31 == 12) {
						local24 += this.anInt203;
					}
				}
			} catch (@Pc(250) Exception local250) {
				return -1;
			}
		} catch (@Pc(253) RuntimeException local253) {
			signlink.reporterror("61518, " + arg0 + ", " + arg1 + ", " + -6815 + ", " + local253.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IZLjava/lang/String;ILjava/lang/String;)Lclient!ub;")
	private Class36 method77(@OriginalArg(0) int arg0, @OriginalArg(2) String arg1, @OriginalArg(3) int arg2, @OriginalArg(4) String arg3) {
		try {
			@Pc(7) int local7 = 5;
			@Pc(10) byte[] local10 = signlink.cacheload(arg3);
			@Pc(24) int local24;
			if (local10 != null) {
				this.aCRC32_1.reset();
				this.aCRC32_1.update(local10);
				local24 = (int) this.aCRC32_1.getValue();
				if (local24 != arg0) {
					local10 = null;
				}
			}
			if (local10 != null) {
				return new Class36(local10, false);
			}
			while (local10 == null) {
				this.method66(arg2, "Requesting " + arg1);
				try {
					local24 = 0;
					@Pc(63) DataInputStream local63 = this.method157(arg3 + arg0);
					@Pc(66) byte[] local66 = new byte[6];
					local63.readFully(local66, 0, 6);
					@Pc(77) Class1_Sub3_Sub3 local77 = new Class1_Sub3_Sub3(local66, 4);
					local77.anInt433 = 3;
					@Pc(85) int local85 = local77.method384() + 6;
					@Pc(87) int local87 = 6;
					local10 = new byte[local85];
					for (@Pc(92) int local92 = 0; local92 < 6; local92++) {
						local10[local92] = local66[local92];
					}
					while (local87 < local85) {
						@Pc(110) int local110 = local85 - local87;
						if (local110 > 1000) {
							local110 = 1000;
						}
						local87 += local63.read(local10, local87, local110);
						@Pc(129) int local129 = local87 * 100 / local85;
						if (local129 != local24) {
							this.method66(arg2, "Loading " + arg1 + " - " + local129 + "%");
						}
						local24 = local129;
					}
					local63.close();
				} catch (@Pc(158) IOException local158) {
					local10 = null;
					for (local24 = local7; local24 > 0; local24--) {
						this.method66(arg2, "Error loading - Will retry in " + local24 + " secs.");
						try {
							Thread.sleep(1000L);
						} catch (@Pc(181) Exception local181) {
						}
					}
					local7 *= 2;
					if (local7 > 60) {
						local7 = 60;
					}
				}
			}
			signlink.cachesave(arg3, local10);
			return new Class36(local10, false);
		} catch (@Pc(209) RuntimeException local209) {
			signlink.reporterror("63407, " + arg0 + ", " + false + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local209.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "i", descriptor = "(I)V")
	private void method78() {
		try {
			@Pc(14) Graphics local14 = this.method64().getGraphics();
			local14.setColor(Color.black);
			local14.fillRect(0, 0, 789, 532);
			this.method57((byte) 7);
			@Pc(46) byte local46;
			@Pc(52) int local52;
			if (this.aBoolean50) {
				this.aBoolean54 = false;
				local14.setFont(new Font("Helvetica", 1, 16));
				local14.setColor(Color.yellow);
				local46 = 35;
				local14.drawString("Sorry, an error has occured whilst loading RuneScape", 30, 35);
				local52 = local46 + 50;
				local14.setColor(Color.white);
				local14.drawString("To fix this try the following (in order):", 30, 85);
				@Pc(61) int local61 = local52 + 50;
				local14.setColor(Color.white);
				local14.setFont(new Font("Helvetica", 1, 12));
				local14.drawString("1: Try closing ALL open web-browser windows, and reloading", 30, 135);
				@Pc(78) int local78 = local61 + 30;
				local14.drawString("2: Try clearing your web-browsers cache from tools->internet options", 30, 165);
				@Pc(84) int local84 = local78 + 30;
				local14.drawString("3: Try using a different game-world", 30, 195);
				@Pc(90) int local90 = local84 + 30;
				local14.drawString("4: Try rebooting your computer", 30, 225);
				@Pc(96) int local96 = local90 + 30;
				local14.drawString("5: Try selecting a different version of Java from the play-game menu", 30, 255);
			}
			if (this.aBoolean56) {
				this.aBoolean54 = false;
				local14.setFont(new Font("Helvetica", 1, 20));
				local14.setColor(Color.white);
				local14.drawString("Error - unable to load game!", 50, 50);
				local14.drawString("To play RuneScape make sure you play from", 50, 100);
				local14.drawString("http://www.runescape.com", 50, 150);
			}
			if (this.aBoolean58) {
				this.aBoolean54 = false;
				local14.setColor(Color.yellow);
				local46 = 35;
				local14.drawString("Error a copy of RuneScape already appears to be loaded", 30, 35);
				local52 = local46 + 50;
				local14.setColor(Color.white);
				local14.drawString("To fix this try the following (in order):", 30, 85);
				local52 += 50;
				local14.setColor(Color.white);
				local14.setFont(new Font("Helvetica", 1, 12));
				local14.drawString("1: Try closing ALL open web-browser windows, and reloading", 30, 135);
				local52 += 30;
				local14.drawString("2: Try rebooting your computer, and reloading", 30, 165);
				local52 += 30;
			}
		} catch (@Pc(184) RuntimeException local184) {
			signlink.reporterror("65805, " + 42545 + ", " + local184.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "j", descriptor = "(I)Z")
	private boolean method79() {
		try {
			if (this.aClass6_1 == null) {
				return false;
			}
			@Pc(2759) String local2759;
			@Pc(166) int local166;
			try {
				@Pc(18) int local18 = this.aClass6_1.method176();
				if (local18 == 0) {
					return false;
				}
				if (this.anInt161 == -1) {
					this.aClass6_1.method177(this.aClass1_Sub3_Sub3_1.aByteArray4, 0, 1);
					this.anInt161 = this.aClass1_Sub3_Sub3_1.aByteArray4[0] & 0xFF;
					if (this.aClass35_1 != null) {
						this.anInt161 = this.anInt161 - this.aClass35_1.method475() & 0xFF;
					}
					this.anInt160 = Class2.anIntArray4[this.anInt161];
					local18--;
				}
				if (this.anInt160 == -1) {
					if (local18 <= 0) {
						return false;
					}
					this.aClass6_1.method177(this.aClass1_Sub3_Sub3_1.aByteArray4, 0, 1);
					this.anInt160 = this.aClass1_Sub3_Sub3_1.aByteArray4[0] & 0xFF;
					local18--;
				}
				if (this.anInt160 == -2) {
					if (local18 <= 1) {
						return false;
					}
					this.aClass6_1.method177(this.aClass1_Sub3_Sub3_1.aByteArray4, 0, 2);
					this.aClass1_Sub3_Sub3_1.anInt433 = 0;
					this.anInt160 = this.aClass1_Sub3_Sub3_1.method382();
					local18 -= 2;
				}
				if (local18 < this.anInt160) {
					return false;
				}
				this.aClass1_Sub3_Sub3_1.anInt433 = 0;
				this.aClass6_1.method177(this.aClass1_Sub3_Sub3_1.aByteArray4, 0, this.anInt160);
				this.anInt162 = 0;
				this.anInt201 = this.anInt200;
				this.anInt200 = this.anInt199;
				this.anInt199 = this.anInt161;
				@Pc(170) int local170;
				@Pc(178) int local178;
				@Pc(162) int local162;
				@Pc(174) int local174;
				@Pc(176) int local176;
				if (this.anInt161 == 55) {
					local162 = this.aClass1_Sub3_Sub3_1.method380();
					local166 = this.aClass1_Sub3_Sub3_1.method380();
					local170 = this.aClass1_Sub3_Sub3_1.method382();
					local174 = this.aClass1_Sub3_Sub3_1.method382();
					local176 = -1;
					for (local178 = 0; local178 < this.anIntArray50.length; local178++) {
						if (this.anIntArray50[local178] == (local162 << 8) + local166) {
							local176 = local178;
						}
					}
					if (local176 != -1) {
						if (this.aByteArrayArray2[local176] == null || this.aByteArrayArray2[local176].length != local174) {
							this.aByteArrayArray2[local176] = new byte[local174];
						}
						this.aClass1_Sub3_Sub3_1.method389(this.aByteArrayArray2[local176], this.anInt160 - 6, local170);
					}
					this.anInt161 = -1;
					return true;
				}
				if (this.anInt161 == 74) {
					this.aBoolean42 = false;
					this.aBoolean46 = true;
					this.aString12 = "";
					this.aBoolean32 = true;
					this.anInt161 = -1;
					return true;
				}
				if (this.anInt161 == 1) {
					local162 = this.aClass1_Sub3_Sub3_1.method380();
					local166 = this.aClass1_Sub3_Sub3_1.method380();
					local170 = this.aClass1_Sub3_Sub3_1.method380();
					local174 = this.aClass1_Sub3_Sub3_1.method380();
					this.aBooleanArray1[local162] = true;
					this.anIntArray53[local162] = local166;
					this.anIntArray42[local162] = local170;
					this.anIntArray60[local162] = local174;
					this.anIntArray64[local162] = 0;
					this.anInt161 = -1;
					return true;
				}
				if (this.anInt161 == 86) {
					if (this.anInt202 == 12) {
						this.aBoolean44 = true;
					}
					this.anInt203 = this.aClass1_Sub3_Sub3_1.method382();
					this.anInt161 = -1;
					return true;
				}
				if (this.anInt161 == 199) {
					local162 = this.aClass1_Sub3_Sub3_1.method382();
					local166 = this.aClass1_Sub3_Sub3_1.method382();
					@Pc(344) Class40 local344 = Class40.method508(local166);
					Class9.aClass9Array1[local162].aClass1_Sub3_Sub1_1 = local344.method511();
					this.anInt161 = -1;
					return true;
				}
				if (this.anInt161 == 78) {
					local162 = this.aClass1_Sub3_Sub3_1.method380();
					local166 = this.aClass1_Sub3_Sub3_1.method380();
					local170 = -1;
					for (local174 = 0; local174 < this.anIntArray50.length; local174++) {
						if (this.anIntArray50[local174] == (local162 << 8) + local166) {
							local170 = local174;
						}
					}
					if (local170 != -1) {
						signlink.cachesave("l" + local162 + "_" + local166, this.aByteArrayArray1[local170]);
						this.anInt232 = 1;
					}
					this.anInt161 = -1;
					return true;
				}
				if (this.anInt161 == 44 || this.anInt161 == 19 || this.anInt161 == 114 || this.anInt161 == 17 || this.anInt161 == 144 || this.anInt161 == 96 || this.anInt161 == 217 || this.anInt161 == 171 || this.anInt161 == 140) {
					this.method81(this.aClass1_Sub3_Sub3_1, this.anInt161);
					this.anInt161 = -1;
					return true;
				}
				if (this.anInt161 == 136) {
					local162 = this.aClass1_Sub3_Sub3_1.method382();
					local166 = this.aClass1_Sub3_Sub3_1.method382();
					local170 = local166 >> 10 & 0x1F;
					local174 = local166 >> 5 & 0x1F;
					local176 = local166 & 0x1F;
					Class9.aClass9Array1[local162].anInt287 = (local170 << 19) + (local174 << 11) + (local176 << 3);
					this.anInt161 = -1;
					return true;
				}
				if (this.anInt161 == 187) {
					local162 = this.aClass1_Sub3_Sub3_1.method382();
					local166 = this.aClass1_Sub3_Sub3_1.method382();
					Class9.aClass9Array1[local162].aClass1_Sub3_Sub1_1 = new Class1_Sub3_Sub1(local166, 298);
					this.anInt161 = -1;
					return true;
				}
				if (this.anInt161 == 168) {
					this.method90(this.aClass1_Sub3_Sub3_1, this.anInt160);
					if (this.anInt232 == 1) {
						this.anInt232 = 2;
						Class4.anInt48 = this.anInt119;
						this.method130();
					}
					if (aBoolean36 && this.anInt232 == 2 && Class4.anInt48 != this.anInt119) {
						this.aClass29_5.method409();
						this.aClass1_Sub3_Sub2_Sub4_2.method321(151, 0, 257, "Loading - please wait.");
						this.aClass1_Sub3_Sub2_Sub4_2.method321(150, 16777215, 256, "Loading - please wait.");
						this.aClass29_5.method410(8, super.aGraphics2, 11, this.aByte11);
						Class4.anInt48 = this.anInt119;
						this.method130();
					}
					if (this.anInt119 != this.anInt194 && this.anInt232 == 2) {
						this.anInt194 = this.anInt119;
						this.method161(this.anInt119);
					}
					this.anInt161 = -1;
					return true;
				}
				if (this.anInt161 == 76) {
					this.aBoolean38 = false;
					for (local162 = 0; local162 < 5; local162++) {
						this.aBooleanArray1[local162] = false;
					}
					this.anInt161 = -1;
					return true;
				}
				if (this.anInt161 == 200) {
					this.anInt202 = this.aClass1_Sub3_Sub3_1.method380();
					this.aBoolean44 = true;
					this.aBoolean60 = true;
					this.anInt161 = -1;
					return true;
				}
				if (this.anInt161 == 34) {
					this.aBoolean38 = true;
					this.anInt185 = this.aClass1_Sub3_Sub3_1.method380();
					this.anInt186 = this.aClass1_Sub3_Sub3_1.method380();
					this.anInt187 = this.aClass1_Sub3_Sub3_1.method382();
					this.anInt188 = this.aClass1_Sub3_Sub3_1.method380();
					this.anInt189 = this.aClass1_Sub3_Sub3_1.method380();
					if (this.anInt189 >= 100) {
						this.anInt209 = this.anInt185 * 128 + 64;
						this.anInt211 = this.anInt186 * 128 + 64;
						this.anInt210 = this.method68(this.anInt185, this.anInt186, this.anInt119, (byte) 9) - this.anInt187;
					}
					this.anInt161 = -1;
					return true;
				}
				@Pc(875) int local875;
				@Pc(879) int local879;
				if (this.anInt161 == 227) {
					local162 = this.aClass1_Sub3_Sub3_1.method382();
					local166 = this.aClass1_Sub3_Sub3_1.method382();
					if (this.anInt105 == local162 && this.anInt106 == local166 && this.anInt232 != 0) {
						this.anInt161 = -1;
						return true;
					}
					this.anInt105 = local162;
					this.anInt106 = local166;
					this.anInt180 = (this.anInt105 - 6) * 8;
					this.anInt181 = (this.anInt106 - 6) * 8;
					this.anInt232 = 1;
					this.aClass29_5.method409();
					this.aClass1_Sub3_Sub2_Sub4_2.method321(151, 0, 257, "Loading - please wait.");
					this.aClass1_Sub3_Sub2_Sub4_2.method321(150, 16777215, 256, "Loading - please wait.");
					this.aClass29_5.method410(8, super.aGraphics2, 11, this.aByte11);
					signlink.looprate(5);
					local170 = (this.anInt160 - 2) / 10;
					this.aByteArrayArray2 = new byte[local170][];
					this.aByteArrayArray1 = new byte[local170][];
					this.anIntArray50 = new int[local170];
					this.aClass1_Sub3_Sub3_3.method371(160, 188);
					this.aClass1_Sub3_Sub3_3.method372(0);
					local174 = 0;
					@Pc(883) int local883;
					for (local176 = 0; local176 < local170; local176++) {
						local178 = this.aClass1_Sub3_Sub3_1.method380();
						local875 = this.aClass1_Sub3_Sub3_1.method380();
						local879 = this.aClass1_Sub3_Sub3_1.method385();
						local883 = this.aClass1_Sub3_Sub3_1.method385();
						this.anIntArray50[local176] = (local178 << 8) + local875;
						@Pc(907) byte[] local907;
						if (local879 != 0) {
							local907 = signlink.cacheload("m" + local178 + "_" + local875);
							if (local907 != null) {
								this.aCRC32_1.reset();
								this.aCRC32_1.update(local907);
								if ((int) this.aCRC32_1.getValue() != local879) {
									local907 = null;
								}
							}
							if (local907 == null) {
								this.anInt232 = 0;
								this.aClass1_Sub3_Sub3_3.method372(0);
								this.aClass1_Sub3_Sub3_3.method372(local178);
								this.aClass1_Sub3_Sub3_3.method372(local875);
								local174 += 3;
							} else {
								this.aByteArrayArray2[local176] = local907;
							}
						}
						if (local883 != 0) {
							local907 = signlink.cacheload("l" + local178 + "_" + local875);
							if (local907 != null) {
								this.aCRC32_1.reset();
								this.aCRC32_1.update(local907);
								if ((int) this.aCRC32_1.getValue() != local883) {
									local907 = null;
								}
							}
							if (local907 == null) {
								this.anInt232 = 0;
								this.aClass1_Sub3_Sub3_3.method372(1);
								this.aClass1_Sub3_Sub3_3.method372(local178);
								this.aClass1_Sub3_Sub3_3.method372(local875);
								local174 += 3;
							} else {
								this.aByteArrayArray1[local176] = local907;
							}
						}
					}
					this.aClass1_Sub3_Sub3_3.method379(local174);
					signlink.looprate(100);
					local178 = this.anInt180 - this.anInt182;
					local875 = this.anInt181 - this.anInt183;
					this.anInt182 = this.anInt180;
					this.anInt183 = this.anInt181;
					for (local879 = 0; local879 < 8192; local879++) {
						@Pc(1046) Class1_Sub1_Sub3_Sub1 local1046 = this.aClass1_Sub1_Sub3_Sub1Array1[local879];
						if (local1046 != null) {
							for (@Pc(1050) int local1050 = 0; local1050 < 10; local1050++) {
								local1046.anIntArray213[local1050] -= local178;
								local1046.anIntArray214[local1050] -= local875;
							}
							local1046.anInt742 -= local178 * 128;
							local1046.anInt743 -= local875 * 128;
						}
					}
					for (local883 = 0; local883 < this.anInt126; local883++) {
						@Pc(1101) Class1_Sub1_Sub3_Sub2 local1101 = this.aClass1_Sub1_Sub3_Sub2Array1[local883];
						if (local1101 != null) {
							for (@Pc(1105) int local1105 = 0; local1105 < 10; local1105++) {
								local1101.anIntArray213[local1105] -= local178;
								local1101.anIntArray214[local1105] -= local875;
							}
							local1101.anInt742 -= local178 * 128;
							local1101.anInt743 -= local875 * 128;
						}
					}
					@Pc(1150) byte local1150 = 0;
					@Pc(1152) byte local1152 = 104;
					@Pc(1154) byte local1154 = 1;
					if (local178 < 0) {
						local1150 = 103;
						local1152 = -1;
						local1154 = -1;
					}
					@Pc(1164) byte local1164 = 0;
					@Pc(1166) byte local1166 = 104;
					@Pc(1168) byte local1168 = 1;
					if (local875 < 0) {
						local1164 = 103;
						local1166 = -1;
						local1168 = -1;
					}
					for (@Pc(1178) int local1178 = local1150; local1178 != local1152; local1178 += local1154) {
						for (@Pc(1182) int local1182 = local1164; local1182 != local1166; local1182 += local1168) {
							@Pc(1188) int local1188 = local1178 + local178;
							@Pc(1192) int local1192 = local1182 + local875;
							for (@Pc(1194) int local1194 = 0; local1194 < 4; local1194++) {
								if (local1188 >= 0 && local1192 >= 0 && local1188 < 104 && local1192 < 104) {
									this.aClass25ArrayArrayArray1[local1194][local1178][local1182] = this.aClass25ArrayArrayArray1[local1194][local1188][local1192];
								} else {
									this.aClass25ArrayArrayArray1[local1194][local1178][local1182] = null;
								}
							}
						}
					}
					for (@Pc(1256) Class1_Sub4 local1256 = (Class1_Sub4) this.aClass25_3.method402(); local1256 != null; local1256 = (Class1_Sub4) this.aClass25_3.method404()) {
						local1256.anInt456 -= local178;
						local1256.anInt457 -= local875;
						if (local1256.anInt456 < 0 || local1256.anInt457 < 0 || local1256.anInt456 >= 104 || local1256.anInt457 >= 104) {
							local1256.method512();
						}
					}
					this.aBoolean38 = false;
					this.anInt161 = -1;
					return true;
				}
				if (this.anInt161 == 197) {
					this.aBoolean44 = true;
					local162 = this.aClass1_Sub3_Sub3_1.method382();
					@Pc(1317) byte local1317 = this.aClass1_Sub3_Sub3_1.method381();
					if (this.anIntArray41[local162] != local1317) {
						this.anIntArray41[local162] = local1317;
						this.method91(local162);
					}
					this.anInt161 = -1;
					return true;
				}
				if (this.anInt161 == 141) {
					for (local162 = 0; local162 < this.aClass1_Sub1_Sub3_Sub2Array1.length; local162++) {
						if (this.aClass1_Sub1_Sub3_Sub2Array1[local162] != null) {
							this.aClass1_Sub1_Sub3_Sub2Array1[local162].anInt768 = -1;
						}
					}
					for (local166 = 0; local166 < this.aClass1_Sub1_Sub3_Sub1Array1.length; local166++) {
						if (this.aClass1_Sub1_Sub3_Sub1Array1[local166] != null) {
							this.aClass1_Sub1_Sub3_Sub1Array1[local166].anInt768 = -1;
						}
					}
					this.anInt161 = -1;
					return true;
				}
				if (this.anInt161 == 38) {
					local162 = this.aClass1_Sub3_Sub3_1.method382();
					local166 = this.aClass1_Sub3_Sub3_1.method382();
					Class9.aClass9Array1[local162].anInt290 = local166;
					this.anInt161 = -1;
					return true;
				}
				if (this.anInt161 == 134) {
					this.anInt177 = this.aClass1_Sub3_Sub3_1.method380();
					this.anInt178 = this.aClass1_Sub3_Sub3_1.method380();
					while (this.aClass1_Sub3_Sub3_1.anInt433 < this.anInt160) {
						local162 = this.aClass1_Sub3_Sub3_1.method380();
						this.method81(this.aClass1_Sub3_Sub3_1, local162);
					}
					this.anInt161 = -1;
					return true;
				}
				if (this.anInt161 == 204) {
					this.anInt177 = this.aClass1_Sub3_Sub3_1.method380();
					this.anInt178 = this.aClass1_Sub3_Sub3_1.method380();
					for (local162 = this.anInt177; local162 < this.anInt177 + 8; local162++) {
						for (local166 = this.anInt178; local166 < this.anInt178 + 8; local166++) {
							if (this.aClass25ArrayArrayArray1[this.anInt119][local162][local166] != null) {
								this.aClass25ArrayArrayArray1[this.anInt119][local162][local166] = null;
								this.method69(local162, local166);
							}
						}
					}
					for (@Pc(1514) Class1_Sub4 local1514 = (Class1_Sub4) this.aClass25_3.method402(); local1514 != null; local1514 = (Class1_Sub4) this.aClass25_3.method404()) {
						if (local1514.anInt456 >= this.anInt177 && local1514.anInt456 < this.anInt177 + 8 && local1514.anInt457 >= this.anInt178 && local1514.anInt457 < this.anInt178 + 8 && local1514.anInt454 == this.anInt119) {
							this.method165(local1514.anInt454, local1514.anInt463, local1514.anInt457, local1514.anInt456, local1514.anInt455, local1514.anInt461, local1514.anInt462);
							local1514.method512();
						}
					}
					this.anInt161 = -1;
					return true;
				}
				if (this.anInt161 == 163) {
					this.anInt177 = this.aClass1_Sub3_Sub3_1.method380();
					this.anInt178 = this.aClass1_Sub3_Sub3_1.method380();
					this.anInt161 = -1;
					return true;
				}
				if (this.anInt161 == 157) {
					local162 = this.aClass1_Sub3_Sub3_1.method380();
					local166 = this.aClass1_Sub3_Sub3_1.method380();
					local170 = this.aClass1_Sub3_Sub3_1.method382();
					local174 = this.aClass1_Sub3_Sub3_1.method382();
					local176 = -1;
					for (local178 = 0; local178 < this.anIntArray50.length; local178++) {
						if (this.anIntArray50[local178] == (local162 << 8) + local166) {
							local176 = local178;
						}
					}
					if (local176 != -1) {
						if (this.aByteArrayArray1[local176] == null || this.aByteArrayArray1[local176].length != local174) {
							this.aByteArrayArray1[local176] = new byte[local174];
						}
						this.aClass1_Sub3_Sub3_1.method389(this.aByteArrayArray1[local176], this.anInt160 - 6, local170);
					}
					this.anInt161 = -1;
					return true;
				}
				if (this.anInt161 == 24) {
					this.anInt123 = this.aClass1_Sub3_Sub3_1.method382() * 30;
					this.anInt161 = -1;
					return true;
				}
				@Pc(1715) Class9 local1715;
				if (this.anInt161 == 131) {
					local162 = this.aClass1_Sub3_Sub3_1.method382();
					local166 = this.aClass1_Sub3_Sub3_1.method382();
					local170 = this.aClass1_Sub3_Sub3_1.method382();
					local1715 = Class9.aClass9Array1[local162];
					@Pc(1718) Class1_Sub3_Sub1 local1718 = local1715.aClass1_Sub3_Sub1_1;
					if (local1718 != null) {
						local1718.method213(local166, local170);
					}
					this.anInt161 = -1;
					return true;
				}
				@Pc(1738) long local1738;
				if (this.anInt161 == 20) {
					local1738 = this.aClass1_Sub3_Sub3_1.method386();
					local170 = this.aClass1_Sub3_Sub3_1.method385();
					@Pc(1744) boolean local1744 = false;
					for (local176 = 0; local176 < 100; local176++) {
						if (this.anIntArray43[local176] == local170) {
							local1744 = true;
							break;
						}
					}
					for (local178 = 0; local178 < this.anInt204; local178++) {
						if (this.aLongArray3[local178] == local1738) {
							local1744 = true;
							break;
						}
					}
					if (!local1744) {
						this.anIntArray43[this.anInt100] = local170;
						this.anInt100 = (this.anInt100 + 1) % 100;
						@Pc(1807) String local1807 = Class38.method487(this.anInt160 - 12, this.aClass1_Sub3_Sub3_1);
						@Pc(1811) String local1811 = Class19.method339(local1807);
						this.method128(local1811, 3, this.anInt179, Class37.method484(Class37.method482(local1738)));
					}
					this.anInt161 = -1;
					return true;
				}
				if (this.anInt161 == 85) {
					this.aBoolean44 = true;
					local162 = this.aClass1_Sub3_Sub3_1.method380();
					local166 = this.aClass1_Sub3_Sub3_1.method385();
					local170 = this.aClass1_Sub3_Sub3_1.method380();
					this.anIntArray29[local162] = local166;
					this.anIntArray59[local162] = local170;
					this.anIntArray45[local162] = 1;
					for (local174 = 0; local174 < 98; local174++) {
						if (local166 >= anIntArray19[local174]) {
							this.anIntArray45[local162] = local174 + 2;
						}
					}
					this.anInt161 = -1;
					return true;
				}
				if (this.anInt161 == 95) {
					this.anInt108 = this.aClass1_Sub3_Sub3_1.method380();
					this.anInt161 = -1;
					return true;
				}
				if (this.anInt161 == 248) {
					local162 = this.aClass1_Sub3_Sub3_1.method382();
					@Pc(1917) boolean local1917 = this.aClass1_Sub3_Sub3_1.method380() == 1;
					Class9.aClass9Array1[local162].aBoolean71 = local1917;
					this.anInt161 = -1;
					return true;
				}
				@Pc(1942) Class9 local1942;
				if (this.anInt161 == 253) {
					this.aBoolean44 = true;
					local162 = this.aClass1_Sub3_Sub3_1.method382();
					local1942 = Class9.aClass9Array1[local162];
					local170 = this.aClass1_Sub3_Sub3_1.method380();
					for (local174 = 0; local174 < local170; local174++) {
						local1942.anIntArray106[local174] = this.aClass1_Sub3_Sub3_1.method382();
						local176 = this.aClass1_Sub3_Sub3_1.method380();
						if (local176 == 255) {
							local176 = this.aClass1_Sub3_Sub3_1.method385();
						}
						local1942.anIntArray107[local174] = local176;
					}
					for (local176 = local170; local176 < local1942.anIntArray106.length; local176++) {
						local1942.anIntArray106[local176] = 0;
						local1942.anIntArray107[local176] = 0;
					}
					this.anInt161 = -1;
					return true;
				}
				if (this.anInt161 == 210) {
					local162 = this.aClass1_Sub3_Sub3_1.method382();
					local166 = this.aClass1_Sub3_Sub3_1.method380();
					this.anIntArray20[local166] = local162;
					this.aBoolean44 = true;
					this.anInt161 = -1;
					return true;
				}
				if (this.anInt161 == 192) {
					this.method80(this.anInt173);
					this.anInt161 = -1;
					return false;
				}
				if (this.anInt161 == 21) {
					if (this.aBoolean35) {
						signlink.jingle = this.aClass1_Sub3_Sub3_1.method387();
						signlink.jinglelen = this.aClass1_Sub3_Sub3_1.method382();
					}
					this.anInt161 = -1;
					return true;
				}
				if (this.anInt161 == 243) {
					local162 = this.aClass1_Sub3_Sub3_1.method382();
					local1942 = Class9.aClass9Array1[local162];
					for (local170 = 0; local170 < local1942.anIntArray106.length; local170++) {
						local1942.anIntArray106[local170] = -1;
						local1942.anIntArray106[local170] = 0;
					}
					this.anInt161 = -1;
					return true;
				}
				if (this.anInt161 == 115) {
					local162 = this.aClass1_Sub3_Sub3_1.method382();
					this.method99(local162);
					if (this.anInt107 != -1) {
						this.anInt107 = -1;
						this.aBoolean32 = true;
					}
					if (this.aBoolean46) {
						this.aBoolean46 = false;
						this.aBoolean32 = true;
					}
					this.anInt235 = local162;
					this.aBoolean44 = true;
					this.aBoolean60 = true;
					this.anInt229 = -1;
					this.aBoolean53 = false;
					this.anInt161 = -1;
					return true;
				}
				if (this.anInt161 == 183) {
					this.method92(this.aClass1_Sub3_Sub3_1, this.anInt160);
					this.anInt161 = -1;
					return true;
				}
				if (this.anInt161 == 87) {
					local162 = this.aClass1_Sub3_Sub3_1.method382();
					Class9.aClass9Array1[local162].aClass1_Sub3_Sub1_1 = this.aClass1_Sub1_Sub3_Sub2_1.method519();
					this.anInt161 = -1;
					return true;
				}
				if (this.anInt161 == 137) {
					local162 = this.aClass1_Sub3_Sub3_1.method382();
					this.method99(local162);
					if (this.anInt235 != -1) {
						this.anInt235 = -1;
						this.aBoolean44 = true;
						this.aBoolean60 = true;
					}
					if (this.anInt107 != -1) {
						this.anInt107 = -1;
						this.aBoolean32 = true;
					}
					if (this.aBoolean46) {
						this.aBoolean46 = false;
						this.aBoolean32 = true;
					}
					this.anInt229 = local162;
					this.aBoolean53 = false;
					this.anInt161 = -1;
					return true;
				}
				if (this.anInt161 == 50) {
					local162 = this.aClass1_Sub3_Sub3_1.method380();
					local166 = this.aClass1_Sub3_Sub3_1.method380();
					local170 = -1;
					for (local174 = 0; local174 < this.anIntArray50.length; local174++) {
						if (this.anIntArray50[local174] == (local162 << 8) + local166) {
							local170 = local174;
						}
					}
					if (local170 != -1) {
						signlink.cachesave("m" + local162 + "_" + local166, this.aByteArrayArray2[local170]);
						this.anInt232 = 1;
					}
					this.anInt161 = -1;
					return true;
				}
				if (this.anInt161 == 213) {
					local1738 = this.aClass1_Sub3_Sub3_1.method386();
					local170 = this.aClass1_Sub3_Sub3_1.method380();
					@Pc(2322) String local2322 = Class37.method484(Class37.method482(local1738));
					for (local176 = 0; local176 < this.anInt89; local176++) {
						if (local1738 == this.aLongArray4[local176]) {
							if (this.anIntArray30[local176] != local170) {
								this.anIntArray30[local176] = local170;
								this.aBoolean44 = true;
								if (local170 > 0) {
									this.method128(local2322 + " has logged in.", 5, this.anInt179, "");
								}
								if (local170 == 0) {
									this.method128(local2322 + " has logged out.", 5, this.anInt179, "");
								}
							}
							local2322 = null;
							break;
						}
					}
					if (local2322 != null && this.anInt89 < 100) {
						this.aLongArray4[this.anInt89] = local1738;
						this.aStringArray1[this.anInt89] = local2322;
						this.anIntArray30[this.anInt89] = local170;
						this.anInt89++;
						this.aBoolean44 = true;
					}
					@Pc(2422) boolean local2422 = false;
					while (!local2422) {
						local2422 = true;
						for (local875 = 0; local875 < this.anInt89 - 1; local875++) {
							if (this.anIntArray30[local875] != this.anInt118 && this.anIntArray30[local875 + 1] == this.anInt118 || this.anIntArray30[local875] == 0 && this.anIntArray30[local875 + 1] != 0) {
								local879 = this.anIntArray30[local875];
								this.anIntArray30[local875] = this.anIntArray30[local875 + 1];
								this.anIntArray30[local875 + 1] = local879;
								@Pc(2485) String local2485 = this.aStringArray1[local875];
								this.aStringArray1[local875] = this.aStringArray1[local875 + 1];
								this.aStringArray1[local875 + 1] = local2485;
								@Pc(2507) long local2507 = this.aLongArray4[local875];
								this.aLongArray4[local875] = this.aLongArray4[local875 + 1];
								this.aLongArray4[local875 + 1] = local2507;
								this.aBoolean44 = true;
								local2422 = false;
							}
						}
					}
					this.anInt161 = -1;
					return true;
				}
				if (this.anInt161 == 212) {
					if (this.anInt202 == 12) {
						this.aBoolean44 = true;
					}
					this.anInt228 = this.aClass1_Sub3_Sub3_1.method380();
					this.anInt161 = -1;
					return true;
				}
				if (this.anInt161 == 54) {
					local162 = this.aClass1_Sub3_Sub3_1.method382();
					this.method99(local162);
					if (this.anInt235 != -1) {
						this.anInt235 = -1;
						this.aBoolean44 = true;
						this.aBoolean60 = true;
					}
					this.anInt107 = local162;
					this.aBoolean32 = true;
					this.anInt229 = -1;
					this.aBoolean53 = false;
					this.anInt161 = -1;
					return true;
				}
				if (this.anInt161 == 98) {
					this.anInt234 = this.aClass1_Sub3_Sub3_1.method380();
					this.anInt133 = this.aClass1_Sub3_Sub3_1.method380();
					this.anInt169 = this.aClass1_Sub3_Sub3_1.method380();
					this.aBoolean33 = true;
					this.aBoolean32 = true;
					this.anInt161 = -1;
					return true;
				}
				if (this.anInt161 == 16) {
					this.aBoolean44 = true;
					local162 = this.aClass1_Sub3_Sub3_1.method382();
					local1942 = Class9.aClass9Array1[local162];
					while (this.aClass1_Sub3_Sub3_1.anInt433 < this.anInt160) {
						local170 = this.aClass1_Sub3_Sub3_1.method380();
						local174 = this.aClass1_Sub3_Sub3_1.method382();
						local176 = this.aClass1_Sub3_Sub3_1.method380();
						if (local176 == 255) {
							local176 = this.aClass1_Sub3_Sub3_1.method385();
						}
						if (local170 >= 0 && local170 < local1942.anIntArray106.length) {
							local1942.anIntArray106[local170] = local174;
							local1942.anIntArray107[local170] = local176;
						}
					}
					this.anInt161 = -1;
					return true;
				}
				if (this.anInt161 == 128) {
					local162 = this.aClass1_Sub3_Sub3_1.method382();
					local166 = this.aClass1_Sub3_Sub3_1.method382();
					if (this.anInt107 != -1) {
						this.anInt107 = -1;
						this.aBoolean32 = true;
					}
					if (this.aBoolean46) {
						this.aBoolean46 = false;
						this.aBoolean32 = true;
					}
					this.anInt229 = local162;
					this.anInt235 = local166;
					this.aBoolean44 = true;
					this.aBoolean60 = true;
					this.aBoolean53 = false;
					this.anInt161 = -1;
					return true;
				}
				if (this.anInt161 == 206) {
					local2759 = this.aClass1_Sub3_Sub3_1.method387();
					if (!local2759.equals(this.aString2)) {
						this.aString2 = local2759;
						if (this.aBoolean35) {
							signlink.midi = local2759;
						}
					}
					this.anInt161 = -1;
					return true;
				}
				if (this.anInt161 == 108) {
					this.anInt102 = this.aClass1_Sub3_Sub3_1.method382();
					this.anInt161 = -1;
					return true;
				}
				if (this.anInt161 == 240) {
					if (this.anInt235 != -1) {
						this.anInt235 = -1;
						this.aBoolean44 = true;
						this.aBoolean60 = true;
					}
					if (this.anInt107 != -1) {
						this.anInt107 = -1;
						this.aBoolean32 = true;
					}
					if (this.aBoolean46) {
						this.aBoolean46 = false;
						this.aBoolean32 = true;
					}
					this.anInt229 = -1;
					this.aBoolean53 = false;
					this.anInt161 = -1;
					return true;
				}
				if (this.anInt161 == 30) {
					this.aBoolean44 = true;
					local162 = this.aClass1_Sub3_Sub3_1.method382();
					local166 = this.aClass1_Sub3_Sub3_1.method385();
					if (this.anIntArray41[local162] != local166) {
						this.anIntArray41[local162] = local166;
						this.method91(local162);
					}
					this.anInt161 = -1;
					return true;
				}
				if (this.anInt161 == 93) {
					this.aBoolean38 = true;
					this.anInt147 = this.aClass1_Sub3_Sub3_1.method380();
					this.anInt148 = this.aClass1_Sub3_Sub3_1.method380();
					this.anInt149 = this.aClass1_Sub3_Sub3_1.method382();
					this.anInt150 = this.aClass1_Sub3_Sub3_1.method380();
					this.anInt151 = this.aClass1_Sub3_Sub3_1.method380();
					if (this.anInt151 >= 100) {
						local162 = this.anInt147 * 128 + 64;
						local166 = this.anInt148 * 128 + 64;
						local170 = this.method68(this.anInt147, this.anInt148, this.anInt119, (byte) 9) - this.anInt149;
						local174 = local162 - this.anInt209;
						local176 = local170 - this.anInt210;
						local178 = local166 - this.anInt211;
						local875 = (int) Math.sqrt((double) (local174 * local174 + local178 * local178));
						this.anInt212 = (int) (Math.atan2((double) local176, (double) local875) * 325.949D) & 0x7FF;
						this.anInt213 = (int) (Math.atan2((double) local174, (double) local178) * -325.949D) & 0x7FF;
						if (this.anInt212 < 128) {
							this.anInt212 = 128;
						}
						if (this.anInt212 > 383) {
							this.anInt212 = 383;
						}
					}
					this.anInt161 = -1;
					return true;
				}
				@Pc(3017) String local3017;
				if (this.anInt161 == 138) {
					local162 = this.aClass1_Sub3_Sub3_1.method382();
					local3017 = this.aClass1_Sub3_Sub3_1.method387();
					Class9.aClass9Array1[local162].aString16 = local3017;
					this.anInt161 = -1;
					return true;
				}
				if (this.anInt161 == 10) {
					local162 = this.aClass1_Sub3_Sub3_1.method382();
					local166 = this.aClass1_Sub3_Sub3_1.method382();
					local170 = this.aClass1_Sub3_Sub3_1.method382();
					@Pc(3046) Class41 local3046 = Class41.method522(local166);
					Class9.aClass9Array1[local162].aClass1_Sub3_Sub1_1 = local3046.method525();
					Class9.aClass9Array1[local162].anInt293 = local3046.anInt810;
					Class9.aClass9Array1[local162].anInt294 = local3046.anInt811;
					Class9.aClass9Array1[local162].anInt292 = local3046.anInt809 * 100 / local170;
					this.anInt161 = -1;
					return true;
				}
				if (this.anInt161 == 164) {
					local2759 = this.aClass1_Sub3_Sub3_1.method387();
					if (local2759.endsWith(":tradereq:")) {
						local3017 = local2759.substring(0, local2759.indexOf(":"));
						@Pc(3101) long local3101 = Class37.method481(local3017);
						@Pc(3103) boolean local3103 = false;
						for (local178 = 0; local178 < this.anInt204; local178++) {
							if (this.aLongArray3[local178] == local3101) {
								local3103 = true;
								break;
							}
						}
						if (!local3103) {
							this.method128("wishes to trade with you.", 4, this.anInt179, local3017);
						}
					} else {
						this.method128(local2759, 0, this.anInt179, "");
					}
					this.anInt161 = -1;
					return true;
				}
				if (this.anInt161 == 175) {
					this.anInt204 = this.anInt160 / 8;
					for (local162 = 0; local162 < this.anInt204; local162++) {
						this.aLongArray3[local162] = this.aClass1_Sub3_Sub3_1.method386();
					}
					this.anInt161 = -1;
					return true;
				}
				if (this.anInt161 == 101) {
					local162 = this.aClass1_Sub3_Sub3_1.method382();
					local166 = this.aClass1_Sub3_Sub3_1.method383();
					local170 = this.aClass1_Sub3_Sub3_1.method383();
					local1715 = Class9.aClass9Array1[local162];
					local1715.anInt279 = local166;
					local1715.anInt280 = local170;
					this.anInt161 = -1;
					return true;
				}
				signlink.reporterror("T1 - " + this.anInt161 + "," + this.anInt160 + " - " + this.anInt200 + "," + this.anInt201);
				this.method80(this.anInt173);
			} catch (@Pc(3239) IOException local3239) {
				this.method87();
			} catch (@Pc(3244) Exception local3244) {
				local2759 = "T2 - " + this.anInt161 + "," + this.anInt200 + "," + this.anInt201 + " - " + this.anInt160 + "," + (this.anInt180 + this.aClass1_Sub1_Sub3_Sub2_1.anIntArray213[0]) + "," + (this.anInt181 + this.aClass1_Sub1_Sub3_Sub2_1.anIntArray214[0]) + " - ";
				for (local166 = 0; local166 < this.anInt160 && local166 < 50; local166++) {
					local2759 = local2759 + this.aClass1_Sub3_Sub3_1.aByteArray4[local166] + ",";
				}
				signlink.reporterror(local2759);
				this.method80(this.anInt173);
			}
			return true;
		} catch (@Pc(3328) RuntimeException local3328) {
			signlink.reporterror("88759, " + ", " + local3328.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "k", descriptor = "(I)V")
	private void method80(@OriginalArg(0) int arg0) {
		try {
			try {
				if (this.aClass6_1 != null) {
					this.aClass6_1.method174();
				}
			} catch (@Pc(9) Exception local9) {
			}
			this.aClass6_1 = null;
			this.aBoolean41 = false;
			this.anInt207 = 0;
			while (arg0 >= 0) {
				this.aClass1_Sub3_Sub3_3.method372(253);
			}
			Class8.method186();
			this.aString6 = "";
			this.aString7 = "";
			this.aString8 = "";
			this.method110(this.anInt226);
			this.aClass30_1.method413();
			for (@Pc(47) int local47 = 0; local47 < 4; local47++) {
				this.aClass3Array1[local47].method24();
			}
			System.gc();
			if (this.aBoolean35) {
				signlink.midi = "null";
			}
			this.aString2 = null;
		} catch (@Pc(70) RuntimeException local70) {
			signlink.reporterror("95248, " + arg0 + ", " + local70.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!kb;ZI)V")
	private void method81(@OriginalArg(0) Class1_Sub3_Sub3 arg0, @OriginalArg(2) int arg1) {
		try {
			@Pc(15) int local15;
			@Pc(24) int local24;
			@Pc(31) int local31;
			@Pc(34) int local34;
			@Pc(38) int local38;
			@Pc(42) int local42;
			@Pc(47) int local47;
			@Pc(52) int local52;
			@Pc(108) int local108;
			@Pc(110) int local110;
			@Pc(112) int local112;
			if (arg1 == 140 || arg1 == 171) {
				local15 = arg0.method380();
				local24 = this.anInt177 + (local15 >> 4 & 0x7);
				local31 = this.anInt178 + (local15 & 0x7);
				local34 = arg0.method380();
				local38 = local34 >> 2;
				local42 = local34 & 0x3;
				local47 = this.anIntArray55[local38];
				if (arg1 == 171) {
					local52 = -1;
				} else {
					local52 = arg0.method382();
				}
				if (local24 >= 0 && local31 >= 0 && local24 < 104 && local31 < 104) {
					@Pc(69) Class1_Sub4 local69 = null;
					for (@Pc(74) Class1_Sub4 local74 = (Class1_Sub4) this.aClass25_3.method402(); local74 != null; local74 = (Class1_Sub4) this.aClass25_3.method404()) {
						if (local74.anInt454 == this.anInt119 && local74.anInt456 == local24 && local74.anInt457 == local31 && local74.anInt455 == local47) {
							local69 = local74;
							break;
						}
					}
					if (local69 == null) {
						local108 = 0;
						local110 = -1;
						local112 = 0;
						@Pc(114) int local114 = 0;
						if (local47 == 0) {
							local108 = this.aClass30_1.method437(this.anInt119, local24, local31);
						}
						if (local47 == 1) {
							local108 = this.aClass30_1.method438(local24, local31, this.anInt176, this.anInt119);
						}
						if (local47 == 2) {
							local108 = this.aClass30_1.method439(this.anInt119, local24, local31);
						}
						if (local47 == 3) {
							local108 = this.aClass30_1.method440(this.anInt119, local24, local31);
						}
						if (local108 != 0) {
							@Pc(170) int local170 = this.aClass30_1.method441(this.anInt119, local24, local31, local108);
							local110 = local108 >> 14 & 0x7FFF;
							local112 = local170 & 0x1F;
							local114 = local170 >> 6;
						}
						local69 = new Class1_Sub4();
						local69.anInt454 = this.anInt119;
						local69.anInt455 = local47;
						local69.anInt456 = local24;
						local69.anInt457 = local31;
						local69.anInt461 = local110;
						local69.anInt463 = local112;
						local69.anInt462 = local114;
						this.aClass25_3.method399(local69);
					}
					local69.anInt458 = local52;
					local69.anInt460 = local38;
					local69.anInt459 = local42;
					this.method165(this.anInt119, local38, local31, local24, local47, local52, local42);
				}
			} else if (arg1 == 217) {
				local15 = arg0.method380();
				local24 = this.anInt177 + (local15 >> 4 & 0x7);
				local31 = this.anInt178 + (local15 & 0x7);
				local34 = arg0.method380();
				local38 = local34 >> 2;
				local42 = this.anIntArray55[local38];
				local47 = arg0.method382();
				if (local24 >= 0 && local31 >= 0 && local24 < 104 && local31 < 104) {
					local52 = 0;
					if (local42 == 1) {
						local52 = this.aClass30_1.method438(local24, local31, this.anInt176, this.anInt119);
					}
					if (local42 == 2) {
						local52 = this.aClass30_1.method439(this.anInt119, local24, local31);
					}
					if (local52 != 0) {
						@Pc(329) Class1_Sub6 local329 = new Class1_Sub6(local42, -69, this.anInt119, local52 >> 14 & 0x7FFF, false, Class13.aClass13Array1[local47], local31, local24);
						this.aClass25_5.method399(local329);
					}
				}
			} else if (arg1 == 96) {
				local15 = arg0.method380();
				local24 = this.anInt177 + (local15 >> 4 & 0x7);
				local31 = this.anInt178 + (local15 & 0x7);
				local34 = arg0.method382();
				if (local24 >= 0 && local31 >= 0 && local24 < 104 && local31 < 104) {
					@Pc(373) Class1_Sub7 local373 = new Class1_Sub7();
					local373.anInt608 = local34;
					if (this.aClass25ArrayArrayArray1[this.anInt119][local24][local31] == null) {
						this.aClass25ArrayArrayArray1[this.anInt119][local24][local31] = new Class25(5);
					}
					this.aClass25ArrayArrayArray1[this.anInt119][local24][local31].method399(local373);
					this.method69(local24, local31);
				}
			} else {
				@Pc(466) Class1_Sub7 local466;
				if (arg1 == 144) {
					local15 = arg0.method380();
					local24 = this.anInt177 + (local15 >> 4 & 0x7);
					local31 = this.anInt178 + (local15 & 0x7);
					local34 = arg0.method382();
					if (local24 >= 0 && local31 >= 0 && local24 < 104 && local31 < 104) {
						@Pc(460) Class25 local460 = this.aClass25ArrayArrayArray1[this.anInt119][local24][local31];
						if (local460 != null) {
							for (local466 = (Class1_Sub7) local460.method402(); local466 != null; local466 = (Class1_Sub7) local460.method404()) {
								if (local466.anInt608 == (local34 & 0x7FFF)) {
									local466.method512();
									break;
								}
							}
							if (local460.method402() == null) {
								this.aClass25ArrayArrayArray1[this.anInt119][local24][local31] = null;
							}
							this.method69(local24, local31);
						}
					}
				} else {
					@Pc(547) int local547;
					@Pc(550) int local550;
					if (arg1 == 17) {
						local15 = arg0.method380();
						local24 = this.anInt177 + (local15 >> 4 & 0x7);
						local31 = this.anInt178 + (local15 & 0x7);
						local34 = local24 + arg0.method381();
						local38 = local31 + arg0.method381();
						local42 = arg0.method383();
						local47 = arg0.method382();
						local52 = arg0.method380();
						local547 = arg0.method380();
						local550 = arg0.method382();
						local108 = arg0.method382();
						local110 = arg0.method380();
						local112 = arg0.method380();
						if (local24 >= 0 && local31 >= 0 && local24 < 104 && local31 < 104 && local34 >= 0 && local38 >= 0 && local34 < 104 && local38 < 104) {
							local24 = local24 * 128 + 64;
							local31 = local31 * 128 + 64;
							local34 = local34 * 128 + 64;
							local38 = local38 * 128 + 64;
							@Pc(632) Class1_Sub1_Sub1 local632 = new Class1_Sub1_Sub1(local24, -35843, local108 + anInt132, local112, local47, this.method68(local24, local31, this.anInt119, (byte) 9) - local52, this.anInt119, local42, local550 + anInt132, local110, local31, local547);
							local632.method19(this.method68(local34, local38, this.anInt119, (byte) 9) - local547, local38, local550 + anInt132, local34, this.aBoolean55);
							this.aClass25_4.method399(local632);
						}
					} else if (arg1 == 114) {
						local15 = arg0.method380();
						local24 = this.anInt177 + (local15 >> 4 & 0x7);
						local31 = this.anInt178 + (local15 & 0x7);
						local34 = arg0.method382();
						local38 = arg0.method380();
						local42 = arg0.method382();
						if (local24 >= 0 && local31 >= 0 && local24 < 104 && local31 < 104) {
							local24 = local24 * 128 + 64;
							local31 = local31 * 128 + 64;
							@Pc(729) Class1_Sub1_Sub2 local729 = new Class1_Sub1_Sub2(local31, false, this.method68(local24, local31, this.anInt119, (byte) 9) - local38, local24, local42, local34, anInt132, this.anInt119);
							this.aClass25_2.method399(local729);
						}
					} else if (arg1 == 19) {
						local15 = arg0.method380();
						local24 = this.anInt177 + (local15 >> 4 & 0x7);
						local31 = this.anInt178 + (local15 & 0x7);
						local34 = arg0.method382();
						local38 = arg0.method382();
						if (local24 >= 0 && local31 >= 0 && local24 < 104 && local31 < 104 && local38 != this.anInt102) {
							local466 = new Class1_Sub7();
							local466.anInt608 = local34;
							if (this.aClass25ArrayArrayArray1[this.anInt119][local24][local31] == null) {
								this.aClass25ArrayArrayArray1[this.anInt119][local24][local31] = new Class25(5);
							}
							this.aClass25ArrayArrayArray1[this.anInt119][local24][local31].method399(local466);
							this.method69(local24, local31);
						}
					} else if (arg1 == 44) {
						local15 = arg0.method380();
						local24 = this.anInt177 + (local15 >> 4 & 0x7);
						local31 = this.anInt178 + (local15 & 0x7);
						local34 = arg0.method380();
						local38 = local34 >> 2;
						local42 = local34 & 0x3;
						local47 = this.anIntArray55[local38];
						local52 = arg0.method382();
						local547 = arg0.method382();
						local550 = arg0.method382();
						local108 = arg0.method382();
						@Pc(875) byte local875 = arg0.method381();
						@Pc(878) byte local878 = arg0.method381();
						@Pc(881) byte local881 = arg0.method381();
						@Pc(884) byte local884 = arg0.method381();
						@Pc(891) Class1_Sub1_Sub3_Sub2 local891;
						if (local108 == this.anInt102) {
							local891 = this.aClass1_Sub1_Sub3_Sub2_1;
						} else {
							local891 = this.aClass1_Sub1_Sub3_Sub2Array1[local108];
						}
						if (local891 != null) {
							@Pc(916) Class1_Sub5 local916 = new Class1_Sub5(local547 + anInt132, local24, local31, local38, false, local47, this.anInt119, local42, -1);
							this.aClass25_1.method399(local916);
							@Pc(936) Class1_Sub5 local936 = new Class1_Sub5(local550 + anInt132, local24, local31, local38, false, local47, this.anInt119, local42, local52);
							this.aClass25_1.method399(local936);
							@Pc(950) int local950 = this.anIntArrayArrayArray3[this.anInt119][local24][local31];
							@Pc(962) int local962 = this.anIntArrayArrayArray3[this.anInt119][local24 + 1][local31];
							@Pc(976) int local976 = this.anIntArrayArrayArray3[this.anInt119][local24 + 1][local31 + 1];
							@Pc(988) int local988 = this.anIntArrayArrayArray3[this.anInt119][local24][local31 + 1];
							@Pc(991) Class39 local991 = Class39.method496(local52);
							local891.anInt795 = local547 + anInt132;
							local891.anInt796 = local550 + anInt132;
							local891.aClass1_Sub3_Sub1_11 = local991.method499(local38, local42, local950, local962, local976, local988, -1);
							@Pc(1015) int local1015 = local991.anInt664;
							@Pc(1018) int local1018 = local991.anInt665;
							if (local42 == 1 || local42 == 3) {
								local1015 = local991.anInt665;
								local1018 = local991.anInt664;
							}
							local891.anInt797 = local24 * 128 + local1015 * 64;
							local891.anInt799 = local31 * 128 + local1018 * 64;
							local891.anInt798 = this.method68(local891.anInt797, local891.anInt799, this.anInt119, (byte) 9);
							@Pc(1064) byte local1064;
							if (local875 > local881) {
								local1064 = local875;
								local875 = local881;
								local881 = local1064;
							}
							if (local878 > local884) {
								local1064 = local878;
								local878 = local884;
								local884 = local1064;
							}
							local891.anInt800 = local24 + local875;
							local891.anInt802 = local24 + local881;
							local891.anInt801 = local31 + local878;
							local891.anInt803 = local31 + local884;
							return;
						}
					}
				}
			}
		} catch (@Pc(1099) RuntimeException local1099) {
			signlink.reporterror("67800, " + arg0 + ", " + false + ", " + arg1 + ", " + local1099.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "run", descriptor = "()V")
	@Override
	public void run() {
		if (!this.aBoolean43) {
			super.run();
			return;
		}
		this.aBoolean40 = true;
		try {
			@Pc(10) long local10 = System.currentTimeMillis();
			@Pc(12) int local12 = 0;
			@Pc(14) int local14 = 20;
			while (this.aBoolean54) {
				this.method102();
				this.method102();
				this.method67();
				local12++;
				if (local12 > 10) {
					@Pc(31) long local31 = System.currentTimeMillis();
					@Pc(40) int local40 = (int) (local31 - local10) / 10 - local14;
					local14 = 40 - local40;
					if (local14 < 5) {
						local14 = 5;
					}
					local12 = 0;
					local10 = local31;
				}
				try {
					Thread.sleep((long) local14);
				} catch (@Pc(58) Exception local58) {
				}
			}
		} catch (@Pc(64) Exception local64) {
		}
		this.aBoolean40 = false;
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!kb;II)V")
	private void method82(@OriginalArg(0) Class1_Sub3_Sub3 arg0, @OriginalArg(1) int arg1) {
		try {
			while (true) {
				if (arg0.anInt434 + 10 < arg1 * 8) {
					@Pc(14) int local14 = arg0.method391(11);
					if (local14 != 2047) {
						if (this.aClass1_Sub1_Sub3_Sub2Array1[local14] == null) {
							this.aClass1_Sub1_Sub3_Sub2Array1[local14] = new Class1_Sub1_Sub3_Sub2();
							if (this.aClass1_Sub3_Sub3Array1[local14] != null) {
								this.aClass1_Sub1_Sub3_Sub2Array1[local14].method517(this.aClass1_Sub3_Sub3Array1[local14]);
							}
						}
						this.anIntArray25[this.anInt128++] = local14;
						@Pc(60) Class1_Sub1_Sub3_Sub2 local60 = this.aClass1_Sub1_Sub3_Sub2Array1[local14];
						local60.anInt785 = anInt132;
						@Pc(68) int local68 = arg0.method391(5);
						if (local68 > 15) {
							local68 -= 32;
						}
						@Pc(77) int local77 = arg0.method391(5);
						if (local77 > 15) {
							local77 -= 32;
						}
						local60.method514(this.aClass1_Sub1_Sub3_Sub2_1.anIntArray213[0] + local68, this.aClass1_Sub1_Sub3_Sub2_1.anIntArray214[0] + local77);
						this.anIntArray26[this.anInt129++] = local14;
						continue;
					}
				}
				arg0.method392(this.aByte7);
				return;
			}
		} catch (@Pc(126) RuntimeException local126) {
			signlink.reporterror("37423, " + arg0 + ", " + arg1 + ", " + -292 + ", " + local126.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "l", descriptor = "(I)V")
	private void method83() {
		try {
			@Pc(7) int local7 = this.aClass1_Sub3_Sub2_Sub4_3.method323("Choose Option");
			@Pc(20) int local20;
			for (@Pc(9) int local9 = 0; local9 < this.anInt112; local9++) {
				local20 = this.aClass1_Sub3_Sub2_Sub4_3.method323(this.aStringArray2[local9]);
				if (local20 > local7) {
					local7 = local20;
				}
			}
			if (this.anInt145 != -23085) {
				this.anInt161 = this.aClass1_Sub3_Sub3_1.method380();
			}
			local7 += 8;
			local20 = this.anInt112 * 15 + 21;
			@Pc(72) int local72;
			@Pc(90) int local90;
			if (super.anInt82 > 8 && super.anInt83 > 11 && super.anInt82 < 520 && super.anInt83 < 345) {
				local72 = super.anInt82 - local7 / 2 - 8;
				if (local72 + local7 > 512) {
					local72 = 512 - local7;
				}
				if (local72 < 0) {
					local72 = 0;
				}
				local90 = super.anInt83 - 11;
				if (local90 + local20 > 334) {
					local90 = 334 - local20;
				}
				if (local90 < 0) {
					local90 = 0;
				}
				this.aBoolean52 = true;
				this.anInt93 = 0;
				this.anInt94 = local72;
				this.anInt95 = local90;
				this.anInt96 = local7;
				this.anInt97 = this.anInt112 * 15 + 22;
			}
			if (super.anInt82 > 562 && super.anInt83 > 231 && super.anInt82 < 752 && super.anInt83 < 492) {
				local72 = super.anInt82 - local7 / 2 - 562;
				if (local72 < 0) {
					local72 = 0;
				} else if (local72 + local7 > 190) {
					local72 = 190 - local7;
				}
				local90 = super.anInt83 - 231;
				if (local90 < 0) {
					local90 = 0;
				} else if (local90 + local20 > 261) {
					local90 = 261 - local20;
				}
				this.aBoolean52 = true;
				this.anInt93 = 1;
				this.anInt94 = local72;
				this.anInt95 = local90;
				this.anInt96 = local7;
				this.anInt97 = this.anInt112 * 15 + 22;
			}
		} catch (@Pc(211) RuntimeException local211) {
			signlink.reporterror("9927, " + -23085 + ", " + local211.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(Z)V")
	private void method84() {
		try {
			if (this.anInt232 == 2) {
				for (@Pc(15) Class1_Sub5 local15 = (Class1_Sub5) this.aClass25_1.method402(); local15 != null; local15 = (Class1_Sub5) this.aClass25_1.method404()) {
					if (anInt132 >= local15.anInt489) {
						this.method165(local15.anInt482, local15.anInt488, local15.anInt485, local15.anInt484, local15.anInt483, local15.anInt486, local15.anInt487);
						local15.method512();
					}
				}
			}
		} catch (@Pc(50) RuntimeException local50) {
			signlink.reporterror("66763, " + false + ", " + local50.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "m", descriptor = "(I)V")
	private void method85(@OriginalArg(0) int arg0) {
		try {
			@Pc(5) boolean local5 = false;
			while (true) {
				while (true) {
					@Pc(243) int local243;
					@Pc(101) int local101;
					@Pc(86) long local86;
					do {
						do {
							do {
								@Pc(9) int local9;
								@Pc(346) int local346;
								do {
									while (true) {
										local9 = this.method58();
										if (local9 == -1) {
											return;
										}
										if (this.aBoolean42) {
											if (local9 >= 32 && local9 <= 122 && this.aString11.length() < 80) {
												this.aString11 = this.aString11 + (char) local9;
												this.aBoolean32 = true;
											}
											if (local9 == 8 && this.aString11.length() > 0) {
												this.aString11 = this.aString11.substring(0, this.aString11.length() - 1);
												this.aBoolean32 = true;
											}
											break;
										}
										if (this.aBoolean46) {
											if (local9 >= 48 && local9 <= 57 && this.aString12.length() < 10) {
												this.aString12 = this.aString12 + (char) local9;
												this.aBoolean32 = true;
											}
											if (local9 == 8 && this.aString12.length() > 0) {
												this.aString12 = this.aString12.substring(0, this.aString12.length() - 1);
												this.aBoolean32 = true;
											}
											if (local9 == 13 || local9 == 10) {
												if (this.aString12.length() > 0) {
													local346 = 0;
													try {
														local346 = Integer.parseInt(this.aString12);
													} catch (@Pc(680) Exception local680) {
													}
													this.aClass1_Sub3_Sub3_3.method371(160, 41);
													this.aClass1_Sub3_Sub3_3.method375(local346);
												}
												this.aBoolean46 = false;
												this.aBoolean32 = true;
											}
										} else if (this.anInt107 == -1) {
											if (local9 >= 32 && local9 <= 122 && this.aString10.length() < 80) {
												this.aString10 = this.aString10 + (char) local9;
												this.aBoolean32 = true;
											}
											if (local9 == 8 && this.aString10.length() > 0) {
												this.aString10 = this.aString10.substring(0, this.aString10.length() - 1);
												this.aBoolean32 = true;
											}
											if ((local9 == 13 || local9 == 10) && this.aString10.length() > 0) {
												if (this.aString10.equals("::clientdrop") && super.aFrame_Sub1_2 != null) {
													this.method87();
												} else if (this.aString10.startsWith("::")) {
													this.aClass1_Sub3_Sub3_3.method371(160, 237);
													this.aClass1_Sub3_Sub3_3.method372(this.aString10.length() - 1);
													this.aClass1_Sub3_Sub3_3.method377(this.aString10.substring(2));
												} else {
													@Pc(800) byte local800 = 0;
													if (this.aString10.startsWith("yellow:")) {
														local800 = 0;
														this.aString10 = this.aString10.substring(7);
													}
													if (this.aString10.startsWith("red:")) {
														local800 = 1;
														this.aString10 = this.aString10.substring(4);
													}
													if (this.aString10.startsWith("green:")) {
														local800 = 2;
														this.aString10 = this.aString10.substring(6);
													}
													if (this.aString10.startsWith("cyan:")) {
														local800 = 3;
														this.aString10 = this.aString10.substring(5);
													}
													if (this.aString10.startsWith("purple:")) {
														local800 = 4;
														this.aString10 = this.aString10.substring(7);
													}
													if (this.aString10.startsWith("white:")) {
														local800 = 5;
														this.aString10 = this.aString10.substring(6);
													}
													if (this.aString10.startsWith("flash1:")) {
														local800 = 6;
														this.aString10 = this.aString10.substring(7);
													}
													if (this.aString10.startsWith("flash2:")) {
														local800 = 7;
														this.aString10 = this.aString10.substring(7);
													}
													if (this.aString10.startsWith("flash3:")) {
														local800 = 8;
														this.aString10 = this.aString10.substring(7);
													}
													if (this.aString10.startsWith("glow1:")) {
														local800 = 9;
														this.aString10 = this.aString10.substring(6);
													}
													if (this.aString10.startsWith("glow2:")) {
														local800 = 10;
														this.aString10 = this.aString10.substring(6);
													}
													if (this.aString10.startsWith("glow3:")) {
														local800 = 11;
														this.aString10 = this.aString10.substring(6);
													}
													@Pc(958) byte local958 = 0;
													if (this.aString10.startsWith("wave:")) {
														local958 = 1;
														this.aString10 = this.aString10.substring(5);
													}
													if (this.aString10.startsWith("scroll:")) {
														local958 = 2;
														this.aString10 = this.aString10.substring(7);
													}
													this.aClass1_Sub3_Sub3_3.method371(160, 54);
													this.aClass1_Sub3_Sub3_3.method372(0);
													local243 = this.aClass1_Sub3_Sub3_3.anInt433;
													this.aClass1_Sub3_Sub3_3.method372(local800);
													this.aClass1_Sub3_Sub3_3.method372(local958);
													Class38.method488(this.aString10, this.aClass1_Sub3_Sub3_3);
													this.aClass1_Sub3_Sub3_3.method379(this.aClass1_Sub3_Sub3_3.anInt433 - local243);
													this.aString10 = Class37.method485(this.aString10);
													this.aString10 = Class19.method339(this.aString10);
													this.aClass1_Sub1_Sub3_Sub2_1.aString26 = this.aString10;
													this.aClass1_Sub1_Sub3_Sub2_1.anInt755 = local800;
													this.aClass1_Sub1_Sub3_Sub2_1.anInt756 = local958;
													this.aClass1_Sub1_Sub3_Sub2_1.anInt754 = 150;
													this.method128(this.aClass1_Sub1_Sub3_Sub2_1.aString26, 2, this.anInt179, this.aClass1_Sub1_Sub3_Sub2_1.aString27);
													if (this.anInt234 == 2) {
														this.anInt234 = 1;
														this.aBoolean33 = true;
														this.aClass1_Sub3_Sub3_3.method371(160, 227);
														this.aClass1_Sub3_Sub3_3.method372(this.anInt234);
														this.aClass1_Sub3_Sub3_3.method372(this.anInt133);
														this.aClass1_Sub3_Sub3_3.method372(this.anInt169);
													}
												}
												this.aString10 = "";
												this.aBoolean32 = true;
											}
										}
									}
								} while (local9 != 13 && local9 != 10);
								this.aBoolean42 = false;
								this.aBoolean32 = true;
								@Pc(136) int local136;
								@Pc(99) boolean local99;
								if (this.anInt233 == 1 && this.anInt89 < 100) {
									local86 = Class37.method481(this.aString11);
									this.aString11 = Class37.method484(Class37.method482(local86));
									if (local86 != 0L) {
										local99 = false;
										for (local101 = 0; local101 < this.anInt89; local101++) {
											if (this.aLongArray4[local101] == local86) {
												this.method128(this.aString11 + " is already on your friend list", 0, this.anInt179, "");
												local99 = true;
												break;
											}
										}
										for (local136 = 0; local136 < this.anInt204; local136++) {
											if (this.aLongArray3[local136] == local86) {
												this.method128("Please remove " + this.aString11 + " from your ignore list first", 0, this.anInt179, "");
												local99 = true;
												break;
											}
										}
										if (this.aString11.equals(this.aClass1_Sub1_Sub3_Sub2_1.aString27)) {
											local99 = true;
										}
										if (!local99) {
											this.aStringArray1[this.anInt89] = this.aString11;
											this.aLongArray4[this.anInt89] = local86;
											this.anIntArray30[this.anInt89] = 0;
											this.anInt89++;
											this.aBoolean44 = true;
											this.aClass1_Sub3_Sub3_3.method371(160, 28);
											this.aClass1_Sub3_Sub3_3.method376(local86);
										}
									}
								}
								if (this.anInt233 == 2 && this.anInt89 > 0) {
									local86 = Class37.method481(this.aString11);
									this.aString11 = Class37.method484(Class37.method482(local86));
									if (local86 != 0L) {
										for (local243 = 0; local243 < this.anInt89; local243++) {
											if (this.aLongArray4[local243] == local86) {
												this.anInt89--;
												this.aBoolean44 = true;
												for (local101 = local243; local101 < this.anInt89; local101++) {
													this.aStringArray1[local101] = this.aStringArray1[local101 + 1];
													this.anIntArray30[local101] = this.anIntArray30[local101 + 1];
													this.aLongArray4[local101] = this.aLongArray4[local101 + 1];
												}
												this.aClass1_Sub3_Sub3_3.method371(160, 195);
												this.aClass1_Sub3_Sub3_3.method376(local86);
												break;
											}
										}
									}
								}
								if (this.anInt233 == 3 && this.aString11.length() > 0 && this.anInt90 >= 0 && this.anInt90 < this.anInt89) {
									this.aClass1_Sub3_Sub3_3.method371(160, 74);
									this.aClass1_Sub3_Sub3_3.method372(0);
									local346 = this.aClass1_Sub3_Sub3_3.anInt433;
									this.aClass1_Sub3_Sub3_3.method376(this.aLongArray4[this.anInt90]);
									Class38.method488(this.aString11, this.aClass1_Sub3_Sub3_3);
									this.aClass1_Sub3_Sub3_3.method379(this.aClass1_Sub3_Sub3_3.anInt433 - local346);
									this.aString11 = Class37.method485(this.aString11);
									this.aString11 = Class19.method339(this.aString11);
									this.method128(this.aString11, 6, this.anInt179, this.aStringArray1[this.anInt90]);
									if (this.anInt133 == 2) {
										this.anInt133 = 1;
										this.aBoolean33 = true;
										this.aClass1_Sub3_Sub3_3.method371(160, 227);
										this.aClass1_Sub3_Sub3_3.method372(this.anInt234);
										this.aClass1_Sub3_Sub3_3.method372(this.anInt133);
										this.aClass1_Sub3_Sub3_3.method372(this.anInt169);
									}
								}
								if (this.anInt233 == 4 && this.anInt204 < 100 && this.aString11.length() > 0) {
									local86 = Class37.method481(this.aString11);
									local99 = false;
									for (local101 = 0; local101 < this.anInt204; local101++) {
										if (this.aLongArray3[local101] == local86) {
											this.method128(this.aString11 + " is already on your ignore list", 0, this.anInt179, "");
											local99 = true;
											break;
										}
									}
									for (local136 = 0; local136 < this.anInt89; local136++) {
										if (this.aLongArray4[local136] == local86) {
											this.method128("Please remove " + this.aString11 + " from your friend list first", 0, this.anInt179, "");
											local99 = true;
											break;
										}
									}
									if (!local99) {
										this.aLongArray3[this.anInt204++] = local86;
										this.aBoolean44 = true;
										this.aClass1_Sub3_Sub3_3.method371(160, 170);
										this.aClass1_Sub3_Sub3_3.method376(local86);
									}
								}
							} while (this.anInt233 != 5);
						} while (this.anInt204 <= 0);
					} while (this.aString11.length() <= 0);
					local86 = Class37.method481(this.aString11);
					for (local243 = 0; local243 < this.anInt204; local243++) {
						if (this.aLongArray3[local243] == local86) {
							this.anInt204--;
							this.aBoolean44 = true;
							for (local101 = local243; local101 < this.anInt204; local101++) {
								this.aLongArray3[local101] = this.aLongArray3[local101 + 1];
							}
							this.aClass1_Sub3_Sub3_3.method371(160, 97);
							this.aClass1_Sub3_Sub3_3.method376(local86);
							break;
						}
					}
				}
			}
		} catch (@Pc(1100) RuntimeException local1100) {
			signlink.reporterror("33094, " + arg0 + ", " + local1100.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(BI)V")
	private void method86(@OriginalArg(1) int arg0) {
		try {
			if (!aBoolean36 && Class1_Sub3_Sub2_Sub1.anIntArray128[17] >= arg0) {
				@Pc(16) Class1_Sub3_Sub2_Sub3 local16 = Class1_Sub3_Sub2_Sub1.aClass1_Sub3_Sub2_Sub3Array3[17];
				@Pc(24) int local24 = local16.anInt388 * local16.anInt389 - 1;
				@Pc(32) int local32 = local16.anInt388 * this.anInt124 * 2;
				@Pc(35) byte[] local35 = local16.aByteArray3;
				@Pc(38) byte[] local38 = this.aByteArray1;
				for (@Pc(40) int local40 = 0; local40 <= local24; local40++) {
					local38[local40] = local35[local40 - local32 & local24];
				}
				local16.aByteArray3 = local38;
				this.aByteArray1 = local35;
				Class1_Sub3_Sub2_Sub1.method258(17);
			}
		} catch (@Pc(67) RuntimeException local67) {
			signlink.reporterror("95258, " + 6 + ", " + arg0 + ", " + local67.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "n", descriptor = "(I)V")
	private void method87() {
		try {
			this.aClass29_5.method409();
			this.aClass1_Sub3_Sub2_Sub4_2.method321(144, 0, 257, "Connection lost");
			this.aClass1_Sub3_Sub2_Sub4_2.method321(143, 16777215, 256, "Connection lost");
			this.aClass1_Sub3_Sub2_Sub4_2.method321(159, 0, 257, "Please wait - attempting to reestablish");
			this.aClass1_Sub3_Sub2_Sub4_2.method321(158, 16777215, 256, "Please wait - attempting to reestablish");
			this.aClass29_5.method410(8, super.aGraphics2, 11, this.aByte11);
			@Pc(47) Class6 local47 = this.aClass6_1;
			this.aBoolean41 = false;
			this.method156(this.aString6, this.aString7, this.method124(), true);
			if (!this.aBoolean41) {
				this.method80(this.anInt173);
			}
			try {
				local47.method174();
			} catch (@Pc(82) Exception local82) {
			}
		} catch (@Pc(84) RuntimeException local84) {
			signlink.reporterror("74741, " + ", " + local84.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IBLclient!kb;)V")
	private void method88(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub3_Sub3 arg1) {
		try {
			arg1.method390(this.anInt168);
			@Pc(14) int local14 = arg1.method391(8);
			@Pc(20) int local20;
			if (local14 < this.anInt230) {
				for (local20 = local14; local20 < this.anInt230; local20++) {
					this.anIntArray44[this.anInt172++] = this.anIntArray63[local20];
				}
			}
			if (local14 > this.anInt230) {
				signlink.reporterror(this.aString6 + " Too many npcs");
				throw new RuntimeException("eek");
			}
			this.anInt230 = 0;
			for (local20 = 0; local20 < local14; local20++) {
				@Pc(72) int local72 = this.anIntArray63[local20];
				@Pc(77) Class1_Sub1_Sub3_Sub1 local77 = this.aClass1_Sub1_Sub3_Sub1Array1[local72];
				@Pc(82) int local82 = arg1.method391(1);
				if (local82 == 0) {
					this.anIntArray63[this.anInt230++] = local72;
					local77.anInt785 = anInt132;
				} else {
					@Pc(105) int local105 = arg1.method391(2);
					if (local105 == 0) {
						this.anIntArray63[this.anInt230++] = local72;
						local77.anInt785 = anInt132;
						this.anIntArray26[this.anInt129++] = local72;
					} else {
						@Pc(156) int local156;
						@Pc(166) int local166;
						if (local105 == 1) {
							this.anIntArray63[this.anInt230++] = local72;
							local77.anInt785 = anInt132;
							local156 = arg1.method391(3);
							local77.method515(false, local156, 112);
							local166 = arg1.method391(1);
							if (local166 == 1) {
								this.anIntArray26[this.anInt129++] = local72;
							}
						} else if (local105 == 2) {
							this.anIntArray63[this.anInt230++] = local72;
							local77.anInt785 = anInt132;
							local156 = arg1.method391(3);
							local77.method515(true, local156, 112);
							local166 = arg1.method391(3);
							local77.method515(true, local166, 112);
							@Pc(224) int local224 = arg1.method391(1);
							if (local224 == 1) {
								this.anIntArray26[this.anInt129++] = local72;
							}
						} else if (local105 == 3) {
							this.anIntArray44[this.anInt172++] = local72;
						}
					}
				}
			}
		} catch (@Pc(261) RuntimeException local261) {
			signlink.reporterror("13232, " + arg0 + ", " + 6 + ", " + arg1 + ", " + local261.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "f", descriptor = "(Z)V")
	private void method89() {
		try {
			for (@Pc(3) int local3 = -1; local3 < this.anInt128 + this.anInt230; local3++) {
				@Pc(11) Class1_Sub1_Sub3 local11;
				if (local3 == -1) {
					local11 = this.aClass1_Sub1_Sub3_Sub2_1;
				} else if (local3 < this.anInt128) {
					local11 = this.aClass1_Sub1_Sub3_Sub2Array1[this.anIntArray25[local3]];
				} else {
					local11 = this.aClass1_Sub1_Sub3_Sub1Array1[this.anIntArray63[local3 - this.anInt128]];
				}
				if (local11 != null && local11.method516()) {
					@Pc(70) int local70;
					@Pc(72) int local72;
					if (local3 < this.anInt128) {
						@Pc(52) Class1_Sub1_Sub3_Sub2 local52 = (Class1_Sub1_Sub3_Sub2) local11;
						if (local52.anInt792 != 0) {
							this.method96(local11.anInt786 + 15, this.aByte6, local11);
							if (this.anInt130 > -1) {
								local70 = 28;
								for (local72 = 0; local72 < 8; local72++) {
									if ((local52.anInt792 & 0x1 << local72) != 0) {
										this.aClass1_Sub3_Sub2_Sub2Array3[local72].method283(this.anInt131 - local70, this.anInt184, this.anInt130 - 12);
										local70 -= 25;
									}
								}
							}
						}
					}
					@Pc(138) int local138;
					if (local11.aString26 != null && (local3 >= this.anInt128 || this.anInt234 == 0 || this.anInt234 == 1 && this.method125(((Class1_Sub1_Sub3_Sub2) local11).aString27))) {
						this.method96(local11.anInt786, this.aByte6, local11);
						if (this.anInt130 > -1) {
							if (this.anInt224 == 0) {
								local138 = 16776960;
								if (local11.anInt755 < 6) {
									local138 = this.anIntArray51[local11.anInt755];
								}
								if (local11.anInt755 == 6) {
									local138 = this.anInt142 % 20 < 10 ? 16711680 : 16776960;
								}
								if (local11.anInt755 == 7) {
									local138 = this.anInt142 % 20 < 10 ? 255 : 65535;
								}
								if (local11.anInt755 == 8) {
									local138 = this.anInt142 % 20 < 10 ? 45056 : 8454016;
								}
								if (local11.anInt755 == 9) {
									local70 = 150 - local11.anInt754;
									if (local70 < 50) {
										local138 = local70 * 1280 + 16711680;
									} else if (local70 < 100) {
										local138 = 16776960 - (local70 - 50) * 327680;
									} else if (local70 < 150) {
										local138 = (local70 - 100) * 5 + 65280;
									}
								}
								if (local11.anInt755 == 10) {
									local70 = 150 - local11.anInt754;
									if (local70 < 50) {
										local138 = local70 * 5 + 16711680;
									} else if (local70 < 100) {
										local138 = 16711935 - (local70 - 50) * 327680;
									} else if (local70 < 150) {
										local138 = (local70 - 100) * 327680 + 255 - (local70 - 100) * 5;
									}
								}
								if (local11.anInt755 == 11) {
									local70 = 150 - local11.anInt754;
									if (local70 < 50) {
										local138 = 16777215 - local70 * 327685;
									} else if (local70 < 100) {
										local138 = (local70 - 50) * 327685 + 65280;
									} else if (local70 < 150) {
										local138 = 16777215 - (local70 - 100) * 327680;
									}
								}
								if (local11.anInt756 == 0) {
									this.aClass1_Sub3_Sub2_Sub4_3.method321(this.anInt131 + 1, 0, this.anInt130, local11.aString26);
									this.aClass1_Sub3_Sub2_Sub4_3.method321(this.anInt131, local138, this.anInt130, local11.aString26);
								}
								if (local11.anInt756 == 1) {
									this.aClass1_Sub3_Sub2_Sub4_3.method325(this.anInt131 + 1, 0, local11.aString26, this.anInt142, this.anInt130);
									this.aClass1_Sub3_Sub2_Sub4_3.method325(this.anInt131, local138, local11.aString26, this.anInt142, this.anInt130);
								}
								if (local11.anInt756 == 2) {
									local70 = this.aClass1_Sub3_Sub2_Sub4_3.method323(local11.aString26);
									local72 = (150 - local11.anInt754) * (local70 + 100) / 150;
									Class1_Sub3_Sub2.method315(334, this.anInt130 + 50, 0, this.anInt130 - 50);
									this.aClass1_Sub3_Sub2_Sub4_3.method324(local11.aString26, this.anInt130 + 50 - local72, 0, this.anInt131 + 1);
									this.aClass1_Sub3_Sub2_Sub4_3.method324(local11.aString26, this.anInt130 + 50 - local72, local138, this.anInt131);
									Class1_Sub3_Sub2.method314();
								}
							} else {
								this.aClass1_Sub3_Sub2_Sub4_3.method321(this.anInt131 + 1, 0, this.anInt130, local11.aString26);
								this.aClass1_Sub3_Sub2_Sub4_3.method321(this.anInt131, 16776960, this.anInt130, local11.aString26);
							}
						}
					}
					if (local11.anInt759 > anInt132 + 100) {
						this.method96(local11.anInt786 + 15, this.aByte6, local11);
						if (this.anInt130 > -1) {
							local138 = local11.anInt760 * 30 / local11.anInt761;
							if (local138 > 30) {
								local138 = 30;
							}
							Class1_Sub3_Sub2.method317(65280, this.anInt157, 5, this.anInt131 - 3, local138, this.anInt130 - 15);
							Class1_Sub3_Sub2.method317(16711680, this.anInt157, 5, this.anInt131 - 3, 30 - local138, this.anInt130 + local138 - 15);
						}
					}
					if (local11.anInt759 > anInt132 + 330) {
						this.method96(local11.anInt786 / 2, this.aByte6, local11);
						if (this.anInt130 > -1) {
							this.aClass1_Sub3_Sub2_Sub2Array7[local11.anInt758].method283(this.anInt131 - 12, this.anInt184, this.anInt130 - 12);
							this.aClass1_Sub3_Sub2_Sub4_1.method321(this.anInt131 + 4, 0, this.anInt130, String.valueOf(local11.anInt757));
							this.aClass1_Sub3_Sub2_Sub4_1.method321(this.anInt131 + 3, 16777215, this.anInt130 - 1, String.valueOf(local11.anInt757));
						}
					}
				}
			}
		} catch (@Pc(622) RuntimeException local622) {
			signlink.reporterror("6541, " + false + ", " + local622.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILclient!kb;I)V")
	private void method90(@OriginalArg(1) Class1_Sub3_Sub3 arg0, @OriginalArg(2) int arg1) {
		try {
			this.anInt172 = 0;
			this.anInt129 = 0;
			this.method172(arg1, arg0);
			this.method104(arg0, arg1);
			this.method82(arg0, arg1);
			this.method119(arg0, arg1);
			@Pc(44) int local44;
			for (@Pc(37) int local37 = 0; local37 < this.anInt172; local37++) {
				local44 = this.anIntArray44[local37];
				if (this.aClass1_Sub1_Sub3_Sub2Array1[local44].anInt785 != anInt132) {
					this.aClass1_Sub1_Sub3_Sub2Array1[local44] = null;
				}
			}
			if (arg0.anInt433 != arg1) {
				signlink.reporterror("Error packet size mismatch in getplayer pos:" + arg0.anInt433 + " psize:" + arg1);
				throw new RuntimeException("eek");
			}
			for (local44 = 0; local44 < this.anInt128; local44++) {
				if (this.aClass1_Sub1_Sub3_Sub2Array1[this.anIntArray25[local44]] == null) {
					signlink.reporterror(this.aString6 + " null entry in pl list - pos:" + local44 + " size:" + this.anInt128);
					throw new RuntimeException("eek");
				}
			}
		} catch (@Pc(124) RuntimeException local124) {
			signlink.reporterror("8622, " + 15093 + ", " + arg0 + ", " + arg1 + ", " + local124.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IB)V")
	private void method91(@OriginalArg(0) int arg0) {
		try {
			@Pc(8) int local8 = Class17.aClass17Array1[arg0].anInt398;
			if (local8 != 0) {
				@Pc(16) int local16 = this.anIntArray41[arg0];
				if (local8 == 1) {
					if (local16 == 1) {
						Class1_Sub3_Sub2_Sub1.method260(0.9D);
					}
					if (local16 == 2) {
						Class1_Sub3_Sub2_Sub1.method260(0.8D);
					}
					if (local16 == 3) {
						Class1_Sub3_Sub2_Sub1.method260(0.7D);
					}
					if (local16 == 4) {
						Class1_Sub3_Sub2_Sub1.method260(0.6D);
					}
					Class41.aClass32_9.method472();
					this.aBoolean37 = true;
				}
				if (local8 == 3) {
					if (local16 == 1 && this.aBoolean35) {
						this.aBoolean35 = false;
						signlink.midi = "null";
					}
					if (local16 == 0 && !this.aBoolean35) {
						this.aBoolean35 = true;
						signlink.midi = this.aString2;
					}
				}
				if (local8 == 5) {
					this.anInt125 = local16;
				}
				if (local8 == 6) {
					this.anInt224 = local16;
				}
			}
		} catch (@Pc(87) RuntimeException local87) {
			signlink.reporterror("96589, " + arg0 + ", " + 7 + ", " + local87.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Lclient!kb;II)V")
	private void method92(@OriginalArg(0) Class1_Sub3_Sub3 arg0, @OriginalArg(1) int arg1) {
		try {
			this.anInt172 = 0;
			this.anInt129 = 0;
			this.method88(arg1, arg0);
			this.method143(arg0, arg1);
			@Pc(21) int local21 = arg1;
			this.method146(local21, arg0);
			@Pc(35) int local35;
			for (@Pc(28) int local28 = 0; local28 < this.anInt172; local28++) {
				local35 = this.anIntArray44[local28];
				if (this.aClass1_Sub1_Sub3_Sub1Array1[local35].anInt785 != anInt132) {
					this.aClass1_Sub1_Sub3_Sub1Array1[local35].aClass40_1 = null;
					this.aClass1_Sub1_Sub3_Sub1Array1[local35] = null;
				}
			}
			if (arg0.anInt433 != local21) {
				signlink.reporterror(this.aString6 + " size mismatch in getnpcpos - pos:" + arg0.anInt433 + " psize:" + local21);
				throw new RuntimeException("eek");
			}
			for (local35 = 0; local35 < this.anInt230; local35++) {
				if (this.aClass1_Sub1_Sub3_Sub1Array1[this.anIntArray63[local35]] == null) {
					signlink.reporterror(this.aString6 + " null entry in npc list - pos:" + local35 + " size:" + this.anInt230);
					throw new RuntimeException("eek");
				}
			}
		} catch (@Pc(125) RuntimeException local125) {
			signlink.reporterror("56521, " + arg0 + ", " + arg1 + ", " + ", " + local125.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "o", descriptor = "(I)V")
	private void method93() {
		try {
			@Pc(18) int local18;
			for (@Pc(10) int local10 = -1; local10 < this.anInt128; local10++) {
				if (local10 == -1) {
					local18 = this.anInt127;
				} else {
					local18 = this.anIntArray25[local10];
				}
				@Pc(30) Class1_Sub1_Sub3_Sub2 local30 = this.aClass1_Sub1_Sub3_Sub2Array1[local18];
				if (local30 != null && local30.anInt754 > 0) {
					local30.anInt754--;
					if (local30.anInt754 == 0) {
						local30.aString26 = null;
					}
				}
			}
			for (local18 = 0; local18 < this.anInt230; local18++) {
				@Pc(61) int local61 = this.anIntArray63[local18];
				@Pc(66) Class1_Sub1_Sub3_Sub1 local66 = this.aClass1_Sub1_Sub3_Sub1Array1[local61];
				if (local66 != null && local66.anInt754 > 0) {
					local66.anInt754--;
					if (local66.anInt754 == 0) {
						local66.aString26 = null;
					}
				}
			}
		} catch (@Pc(90) RuntimeException local90) {
			signlink.reporterror("855, " + -888 + ", " + local90.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "p", descriptor = "(I)V")
	private void method94() {
		try {
			if (this.aClass29_6 == null) {
				this.method171();
				super.aClass29_2 = null;
				this.aClass29_7 = null;
				this.aClass29_8 = null;
				this.aClass29_9 = null;
				this.aClass29_10 = null;
				this.aClass29_11 = null;
				this.aClass29_12 = null;
				this.aClass29_13 = null;
				this.aClass29_14 = null;
				this.aClass29_15 = null;
				this.aClass29_6 = new Class29(96, (byte) -58, this.method64(), 479);
				this.aClass29_4 = new Class29(160, (byte) -58, this.method64(), 168);
				Class1_Sub3_Sub2.method316();
				this.aClass1_Sub3_Sub2_Sub3_7.method307(0, this.anInt184, 0);
				this.aClass29_3 = new Class29(261, (byte) -58, this.method64(), 190);
				this.aClass29_5 = new Class29(334, (byte) -58, this.method64(), 512);
				Class1_Sub3_Sub2.method316();
				this.aClass29_16 = new Class29(61, (byte) -58, this.method64(), 501);
				this.aClass29_17 = new Class29(40, (byte) -58, this.method64(), 288);
				this.aClass29_18 = new Class29(66, (byte) -58, this.method64(), 269);
				this.aBoolean37 = true;
			}
		} catch (@Pc(132) RuntimeException local132) {
			signlink.reporterror("67213, " + -242 + ", " + local132.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "q", descriptor = "(I)V")
	private void method95() {
		try {
			this.aBoolean34 = true;
			for (@Pc(14) int local14 = 0; local14 < 7; local14++) {
				this.anIntArray54[local14] = -1;
				for (@Pc(23) int local23 = 0; local23 < Class7.anInt240; local23++) {
					if (Class7.aClass7Array1[local23].anInt241 == local14 + (this.aBoolean57 ? 0 : 7)) {
						this.anIntArray54[local14] = local23;
						break;
					}
				}
			}
		} catch (@Pc(55) RuntimeException local55) {
			signlink.reporterror("58590, " + 1 + ", " + local55.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IBLclient!x;)V")
	private void method96(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) Class1_Sub1_Sub3 arg2) {
		try {
			@Pc(2) int local2 = arg2.anInt742;
			@Pc(5) int local5 = arg2.anInt743;
			if (local2 >= 128 && local5 >= 128 && local2 <= 13056 && local5 <= 13056) {
				@Pc(34) int local34 = this.method68(local2, local5, this.anInt119, (byte) 9) - arg0;
				local2 -= this.anInt209;
				@Pc(44) int local44 = local34 - this.anInt210;
				if (arg1 == 0) {
					@Pc(48) boolean local48 = false;
				} else {
					this.aClass25ArrayArrayArray1 = null;
				}
				local5 -= this.anInt211;
				@Pc(63) int local63 = Class1_Sub3_Sub1.anIntArray102[this.anInt212];
				@Pc(68) int local68 = Class1_Sub3_Sub1.anIntArray103[this.anInt212];
				@Pc(73) int local73 = Class1_Sub3_Sub1.anIntArray102[this.anInt213];
				@Pc(78) int local78 = Class1_Sub3_Sub1.anIntArray103[this.anInt213];
				@Pc(88) int local88 = local5 * local73 + local2 * local78 >> 16;
				local5 = local5 * local78 - local2 * local73 >> 16;
				local2 = local88;
				@Pc(110) int local110 = local44 * local68 - local5 * local63 >> 16;
				local5 = local44 * local63 + local5 * local68 >> 16;
				if (local5 >= 50) {
					this.anInt130 = Class1_Sub3_Sub2_Sub1.anInt326 + (local2 << 9) / local5;
					this.anInt131 = Class1_Sub3_Sub2_Sub1.anInt327 + (local110 << 9) / local5;
				} else {
					this.anInt130 = -1;
					this.anInt131 = -1;
				}
			} else {
				this.anInt130 = -1;
				this.anInt131 = -1;
			}
		} catch (@Pc(152) RuntimeException local152) {
			signlink.reporterror("3571, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local152.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(II)Ljava/lang/String;")
	private String method97(@OriginalArg(0) int arg0) {
		try {
			return arg0 < 999999999 ? String.valueOf(arg0) : "*";
		} catch (@Pc(17) RuntimeException local17) {
			signlink.reporterror("96817, " + arg0 + ", " + 2 + ", " + local17.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(B)V")
	private void method98() {
		try {
			this.anInt142++;
			this.method148();
			this.method131();
			this.method145();
			this.method74();
			this.method114();
			@Pc(28) int local28;
			@Pc(67) int local67;
			if (!this.aBoolean38) {
				local28 = this.anInt214;
				if (this.anInt220 / 256 > local28) {
					local28 = this.anInt220 / 256;
				}
				if (this.aBooleanArray1[4] && this.anIntArray42[4] + 128 > local28) {
					local28 = this.anIntArray42[4] + 128;
				}
				local67 = this.anInt215 + this.anInt191 & 0x7FF;
				this.method132(this.method68(this.anInt218, this.anInt219, this.anInt119, (byte) 9) - 50, local28, this.anInt219, local28 * 3 + 600, this.anInt218, local67);
			}
			if (this.aBoolean38) {
				local28 = this.method71();
			} else {
				local28 = this.method70();
			}
			local67 = this.anInt209;
			@Pc(111) int local111 = this.anInt210;
			@Pc(114) int local114 = this.anInt211;
			@Pc(117) int local117 = this.anInt212;
			@Pc(120) int local120 = this.anInt213;
			@Pc(169) int local169;
			for (@Pc(122) int local122 = 0; local122 < 5; local122++) {
				if (this.aBooleanArray1[local122]) {
					local169 = (int) (Math.random() * (double) (this.anIntArray53[local122] * 2 + 1) - (double) this.anIntArray53[local122] + Math.sin((double) this.anIntArray64[local122] * ((double) this.anIntArray60[local122] / 100.0D)) * (double) this.anIntArray42[local122]);
					if (local122 == 0) {
						this.anInt209 += local169;
					}
					if (local122 == 1) {
						this.anInt210 += local169;
					}
					if (local122 == 2) {
						this.anInt211 += local169;
					}
					if (local122 == 3) {
						this.anInt213 = this.anInt213 + local169 & 0x7FF;
					}
					if (local122 == 4) {
						this.anInt212 += local169;
						if (this.anInt212 < 128) {
							this.anInt212 = 128;
						}
						if (this.anInt212 > 383) {
							this.anInt212 = 383;
						}
					}
				}
			}
			local169 = Class1_Sub3_Sub2_Sub1.anInt330;
			Class1_Sub3_Sub1.aBoolean70 = true;
			Class1_Sub3_Sub1.anInt268 = 0;
			Class1_Sub3_Sub1.anInt266 = super.anInt79 - 8;
			Class1_Sub3_Sub1.anInt267 = super.anInt80 - 11;
			Class1_Sub3_Sub2.method316();
			this.aClass30_1.method450(this.anInt209, local28, this.anInt210, this.anInt211, this.anInt212, this.anInt213);
			this.aClass30_1.method427();
			this.method89();
			this.method86(local169);
			this.method73();
			this.aClass29_5.method410(8, super.aGraphics2, 11, this.aByte11);
			this.anInt209 = local67;
			this.anInt210 = local111;
			this.anInt211 = local114;
			this.anInt212 = local117;
			this.anInt213 = local120;
		} catch (@Pc(312) RuntimeException local312) {
			signlink.reporterror("53140, " + -95 + ", " + local312.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(II)V")
	private void method99(@OriginalArg(1) int arg0) {
		try {
			@Pc(5) Class9 local5 = Class9.aClass9Array1[arg0];
			for (@Pc(7) int local7 = 0; local7 < local5.anIntArray110.length && local5.anIntArray110[local7] != -1; local7++) {
				@Pc(22) Class9 local22 = Class9.aClass9Array1[local5.anIntArray110[local7]];
				if (local22.anInt274 == 1) {
					this.method99(local22.anInt272);
				}
				local22.anInt270 = 0;
				local22.anInt271 = 0;
			}
		} catch (@Pc(50) RuntimeException local50) {
			signlink.reporterror("88781, " + -553 + ", " + arg0 + ", " + local50.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IZI)Z")
	private boolean method100(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		try {
			@Pc(3) boolean local3 = false;
			@Pc(7) Class9 local7 = Class9.aClass9Array1[arg0];
			for (@Pc(9) int local9 = 0; local9 < local7.anIntArray110.length && local7.anIntArray110[local9] != -1; local9++) {
				@Pc(24) Class9 local24 = Class9.aClass9Array1[local7.anIntArray110[local9]];
				if (local24.anInt274 == 1) {
					local3 |= this.method100(local24.anInt272, arg1);
				}
				if (local24.anInt290 != -1) {
					@Pc(46) Class13 local46 = Class13.aClass13Array1[local24.anInt290];
					local24.anInt271 += arg1;
					while (local24.anInt271 > local46.anIntArray132[local24.anInt270]) {
						local24.anInt271 -= local46.anIntArray132[local24.anInt270] + 1;
						local24.anInt270++;
						if (local24.anInt270 >= local46.anInt332) {
							local24.anInt270 -= local46.anInt333;
							if (local24.anInt270 < 0 || local24.anInt270 >= local46.anInt332) {
								local24.anInt270 = 0;
							}
						}
						local3 = true;
					}
				}
			}
			return local3;
		} catch (@Pc(120) RuntimeException local120) {
			signlink.reporterror("75228, " + arg0 + ", " + true + ", " + arg1 + ", " + local120.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;I)V")
	private void method101(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2) {
		try {
			this.aString13 = "";
			this.aString14 = "Connecting to server...";
			this.method127();
			this.aClass6_1 = new Class6(this, 994, this.method151(this.anInt208 + 43594));
			this.aClass6_1.method177(this.aClass1_Sub3_Sub3_1.aByteArray4, 0, 8);
			this.aClass1_Sub3_Sub3_1.anInt433 = 0;
			this.aLong6 = this.aClass1_Sub3_Sub3_1.method386();
			this.aClass1_Sub3_Sub3_3.anInt433 = 0;
			this.aClass1_Sub3_Sub3_3.method372(10);
			this.aClass1_Sub3_Sub3_3.method375((int) Math.random() * 99999999);
			this.aClass1_Sub3_Sub3_3.method375((int) Math.random() * 99999999);
			this.aClass1_Sub3_Sub3_3.method376(this.aLong6);
			this.aClass1_Sub3_Sub3_3.method375(arg2);
			this.aClass1_Sub3_Sub3_3.method377(arg0);
			this.aClass1_Sub3_Sub3_3.method377(arg1);
			this.aClass1_Sub3_Sub3_3.method395(aBigInteger2, aBigInteger1);
			this.aClass1_Sub3_Sub3_2.anInt433 = 0;
			this.aClass1_Sub3_Sub3_2.method372(17);
			this.aClass1_Sub3_Sub3_2.method372(this.aClass1_Sub3_Sub3_3.anInt433);
			this.aClass1_Sub3_Sub3_2.method378(this.aClass1_Sub3_Sub3_3.aByteArray4, this.aClass1_Sub3_Sub3_3.anInt433);
			this.aClass6_1.method178(this.aClass1_Sub3_Sub3_2.aByteArray4, this.aClass1_Sub3_Sub3_2.anInt433);
			@Pc(125) int local125 = this.aClass6_1.method175();
			if (local125 == 1) {
				try {
					Thread.sleep(2000L);
				} catch (@Pc(132) Exception local132) {
				}
				this.method101(arg0, arg1, arg2);
				return;
			}
			if (local125 == 2) {
				this.aString13 = "Username already taken.";
				this.aString14 = "Please choose a different name.";
				return;
			}
			if (local125 == 3) {
				this.anInt207 = 2;
				this.method156(this.aString6, this.aString7, arg2, false);
				return;
			}
		} catch (@Pc(164) IOException local164) {
			this.aString13 = "";
			this.aString14 = "Error connecting to server.";
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(B)V")
	private void method102() {
		try {
			@Pc(12) int local12;
			for (@Pc(5) int local5 = 10; local5 < 117; local5++) {
				local12 = (int) (Math.random() * 100.0D);
				if (local12 < 50) {
					this.anIntArray33[local5 + 32512] = 255;
				}
			}
			@Pc(41) int local41;
			@Pc(48) int local48;
			@Pc(54) int local54;
			for (local12 = 0; local12 < 100; local12++) {
				local41 = (int) (Math.random() * 124.0D) + 2;
				local48 = (int) (Math.random() * 128.0D) + 128;
				local54 = local41 + (local48 << 7);
				this.anIntArray33[local54] = 192;
			}
			for (local41 = 1; local41 < 255; local41++) {
				for (local48 = 1; local48 < 127; local48++) {
					local54 = local48 + (local41 << 7);
					this.anIntArray34[local54] = (this.anIntArray33[local54 - 1] + this.anIntArray33[local54 + 1] + this.anIntArray33[local54 - 128] + this.anIntArray33[local54 + 128]) / 4;
				}
			}
			if (this.aByte5 != 71) {
				this.anInt161 = -1;
			}
			this.anInt231 += 128;
			if (this.anInt231 > this.anIntArray61.length) {
				this.anInt231 -= this.anIntArray61.length;
				local48 = (int) (Math.random() * 12.0D);
				this.method150(this.aClass1_Sub3_Sub2_Sub3Array2[local48]);
			}
			@Pc(173) int local173;
			for (local48 = 1; local48 < 255; local48++) {
				for (local54 = 1; local54 < 127; local54++) {
					local173 = local54 + (local48 << 7);
					@Pc(196) int local196 = this.anIntArray34[local173 + 128] - this.anIntArray61[local173 + this.anInt231 & this.anIntArray61.length - 1] / 5;
					if (local196 < 0) {
						local196 = 0;
					}
					this.anIntArray33[local173] = local196;
				}
			}
			for (local54 = 0; local54 < 255; local54++) {
				this.anIntArray22[local54] = this.anIntArray22[local54 + 1];
			}
			this.anIntArray22[255] = (int) (Math.sin((double) anInt132 / 14.0D) * 16.0D + Math.sin((double) anInt132 / 15.0D) * 14.0D + Math.sin((double) anInt132 / 16.0D) * 12.0D);
			if (this.anInt222 > 0) {
				this.anInt222 -= 4;
			}
			if (this.anInt223 > 0) {
				this.anInt223 -= 4;
			}
			if (this.anInt222 == 0 && this.anInt223 == 0) {
				local173 = (int) (Math.random() * 2000.0D);
				if (local173 == 0) {
					this.anInt222 = 1024;
				}
				if (local173 == 1) {
					this.anInt223 = 1024;
					return;
				}
			}
		} catch (@Pc(307) RuntimeException local307) {
			signlink.reporterror("32745, " + 71 + ", " + local307.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "g", descriptor = "(Z)V")
	private void method103() {
		try {
			if (this.aClass29_7 == null) {
				super.aClass29_2 = null;
				this.aClass29_6 = null;
				this.aClass29_4 = null;
				this.aClass29_3 = null;
				this.aClass29_5 = null;
				this.aClass29_16 = null;
				this.aClass29_17 = null;
				this.aClass29_18 = null;
				this.aClass29_10 = new Class29(265, (byte) -58, this.method64(), 128);
				Class1_Sub3_Sub2.method316();
				this.aClass29_11 = new Class29(265, (byte) -58, this.method64(), 128);
				Class1_Sub3_Sub2.method316();
				this.aClass29_7 = new Class29(186, (byte) -58, this.method64(), 533);
				Class1_Sub3_Sub2.method316();
				this.aClass29_8 = new Class29(146, (byte) -58, this.method64(), 360);
				Class1_Sub3_Sub2.method316();
				this.aClass29_9 = new Class29(200, (byte) -58, this.method64(), 360);
				Class1_Sub3_Sub2.method316();
				this.aClass29_12 = new Class29(267, (byte) -58, this.method64(), 214);
				Class1_Sub3_Sub2.method316();
				this.aClass29_13 = new Class29(267, (byte) -58, this.method64(), 215);
				Class1_Sub3_Sub2.method316();
				this.aClass29_14 = new Class29(79, (byte) -58, this.method64(), 86);
				this.aBoolean41 &= true;
				Class1_Sub3_Sub2.method316();
				this.aClass29_15 = new Class29(79, (byte) -58, this.method64(), 87);
				Class1_Sub3_Sub2.method316();
				if (this.aClass36_1 != null) {
					this.method159();
					this.method109();
				}
				this.aBoolean37 = true;
			}
		} catch (@Pc(164) RuntimeException local164) {
			signlink.reporterror("34629, " + true + ", " + local164.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!kb;IZ)V")
	private void method104(@OriginalArg(0) Class1_Sub3_Sub3 arg0, @OriginalArg(1) int arg1) {
		try {
			this.aBoolean41 &= true;
			@Pc(12) int local12 = arg0.method391(8);
			@Pc(18) int local18;
			if (local12 < this.anInt128) {
				for (local18 = local12; local18 < this.anInt128; local18++) {
					this.anIntArray44[this.anInt172++] = this.anIntArray25[local18];
				}
			}
			if (local12 > this.anInt128) {
				signlink.reporterror(this.aString6 + " Too many players");
				throw new RuntimeException("eek");
			}
			this.anInt128 = 0;
			for (local18 = 0; local18 < local12; local18++) {
				@Pc(70) int local70 = this.anIntArray25[local18];
				@Pc(75) Class1_Sub1_Sub3_Sub2 local75 = this.aClass1_Sub1_Sub3_Sub2Array1[local70];
				@Pc(80) int local80 = arg0.method391(1);
				if (local80 == 0) {
					this.anIntArray25[this.anInt128++] = local70;
					local75.anInt785 = anInt132;
				} else {
					@Pc(103) int local103 = arg0.method391(2);
					if (local103 == 0) {
						this.anIntArray25[this.anInt128++] = local70;
						local75.anInt785 = anInt132;
						this.anIntArray26[this.anInt129++] = local70;
					} else {
						@Pc(154) int local154;
						@Pc(164) int local164;
						if (local103 == 1) {
							this.anIntArray25[this.anInt128++] = local70;
							local75.anInt785 = anInt132;
							local154 = arg0.method391(3);
							local75.method515(false, local154, 112);
							local164 = arg0.method391(1);
							if (local164 == 1) {
								this.anIntArray26[this.anInt129++] = local70;
							}
						} else if (local103 == 2) {
							this.anIntArray25[this.anInt128++] = local70;
							local75.anInt785 = anInt132;
							local154 = arg0.method391(3);
							local75.method515(true, local154, 112);
							local164 = arg0.method391(3);
							local75.method515(true, local164, 112);
							@Pc(222) int local222 = arg0.method391(1);
							if (local222 == 1) {
								this.anIntArray26[this.anInt129++] = local70;
							}
						} else if (local103 == 3) {
							this.anIntArray44[this.anInt172++] = local70;
						}
					}
				}
			}
		} catch (@Pc(259) RuntimeException local259) {
			signlink.reporterror("6248, " + arg0 + ", " + arg1 + ", " + true + ", " + local259.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(B)V")
	private void method105() {
		try {
			@Pc(8) int local8 = this.aClass1_Sub1_Sub3_Sub2_1.anInt742 + this.anInt205;
			@Pc(15) int local15 = this.aClass1_Sub1_Sub3_Sub2_1.anInt743 + this.anInt103;
			if (this.anInt218 - local8 < -500 || this.anInt218 - local8 > 500 || this.anInt219 - local15 < -500 || this.anInt219 - local15 > 500) {
				this.anInt218 = local8;
				this.anInt219 = local15;
			}
			if (this.anInt218 != local8) {
				this.anInt218 += (local8 - this.anInt218) / 16;
			}
			if (this.anInt219 != local15) {
				this.anInt219 += (local15 - this.anInt219) / 16;
			}
			if (super.anIntArray15[1] == 1) {
				this.anInt216 += (-this.anInt216 - 24) / 2;
			} else if (super.anIntArray15[2] == 1) {
				this.anInt216 += (24 - this.anInt216) / 2;
			} else {
				this.anInt216 /= 2;
			}
			if (super.anIntArray15[3] == 1) {
				this.anInt217 += (12 - this.anInt217) / 2;
			} else if (super.anIntArray15[4] == 1) {
				this.anInt217 += (-this.anInt217 - 12) / 2;
			} else {
				this.anInt217 /= 2;
			}
			this.anInt215 = this.anInt215 + this.anInt216 / 2 & 0x7FF;
			this.anInt214 += this.anInt217 / 2;
			if (this.anInt214 < 128) {
				this.anInt214 = 128;
			}
			if (this.anInt214 > 383) {
				this.anInt214 = 383;
			}
			@Pc(202) int local202 = this.anInt218 >> 7;
			@Pc(207) int local207 = this.anInt219 >> 7;
			@Pc(217) int local217 = this.method68(this.anInt218, this.anInt219, this.anInt119, (byte) 9);
			@Pc(219) int local219 = 0;
			@Pc(241) int local241;
			if (local202 > 3 && local207 > 3 && local202 < 100 && local207 < 100) {
				for (local241 = local202 - 4; local241 <= local202 + 4; local241++) {
					for (@Pc(247) int local247 = local207 - 4; local247 <= local207 + 4; local247++) {
						@Pc(252) int local252 = this.anInt119;
						if (local252 < 3 && (this.aByteArrayArrayArray7[1][local241][local247] & 0x2) == 2) {
							local252++;
						}
						@Pc(279) int local279 = local217 - this.anIntArrayArrayArray3[local252][local241][local247];
						if (local279 > local219) {
							local219 = local279;
						}
					}
				}
			}
			local241 = local219 * 192;
			if (local241 > 98048) {
				local241 = 98048;
			}
			if (local241 < 32768) {
				local241 = 32768;
			}
			if (local241 > this.anInt220) {
				this.anInt220 += (local241 - this.anInt220) / 24;
			} else if (local241 < this.anInt220) {
				this.anInt220 += (local241 - this.anInt220) / 80;
			}
		} catch (@Pc(343) RuntimeException local343) {
			signlink.reporterror("14215, " + 2 + ", " + local343.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ZLclient!ec;III)V")
	private void method106(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class9 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		try {
			if (arg1.anInt274 == 0 && arg1.anIntArray110 != null && (!arg1.aBoolean71 || this.anInt156 == arg1.anInt272 || this.anInt221 == arg1.anInt272 || this.anInt146 == arg1.anInt272)) {
				@Pc(29) int local29 = Class1_Sub3_Sub2.anInt410;
				@Pc(31) int local31 = Class1_Sub3_Sub2.anInt408;
				@Pc(33) int local33 = Class1_Sub3_Sub2.anInt411;
				@Pc(35) int local35 = Class1_Sub3_Sub2.anInt409;
				Class1_Sub3_Sub2.method315(arg2 + arg1.anInt278, arg4 + arg1.anInt277, arg2, arg4);
				@Pc(51) int local51 = arg1.anIntArray110.length;
				if (arg0) {
					this.anInt159 = 358;
				}
				for (@Pc(58) int local58 = 0; local58 < local51; local58++) {
					@Pc(67) int local67 = arg1.anIntArray111[local58] + arg4;
					@Pc(76) int local76 = arg1.anIntArray112[local58] + arg2 - arg3;
					@Pc(83) Class9 local83 = Class9.aClass9Array1[arg1.anIntArray110[local58]];
					@Pc(88) int local88 = local67 + local83.anInt279;
					@Pc(93) int local93 = local76 + local83.anInt280;
					if (local83.anInt276 > 0) {
						this.method120(local83);
					}
					if (local83.anInt274 == 0) {
						if (local83.anInt283 > local83.anInt282 - local83.anInt278) {
							local83.anInt283 = local83.anInt282 - local83.anInt278;
						}
						if (local83.anInt283 < 0) {
							local83.anInt283 = 0;
						}
						this.method106(this.aBoolean47, local83, local93, local83.anInt283, local88);
						if (local83.anInt282 > local83.anInt278) {
							this.method149(local93, local88 + local83.anInt277, local83.anInt282, local83.anInt283, local83.anInt278);
						}
					} else if (local83.anInt274 != 1) {
						@Pc(166) int local166;
						@Pc(170) int local170;
						@Pc(181) int local181;
						@Pc(216) int local216;
						@Pc(223) int local223;
						@Pc(164) int local164;
						@Pc(190) int local190;
						@Pc(214) int local214;
						if (local83.anInt274 == 2) {
							local164 = 0;
							for (local166 = 0; local166 < local83.anInt278; local166++) {
								for (local170 = 0; local170 < local83.anInt277; local170++) {
									local181 = local88 + local170 * (local83.anInt285 + 32);
									local190 = local93 + local166 * (local83.anInt286 + 32);
									if (local164 < 20) {
										local181 += local83.anIntArray113[local164];
										local190 += local83.anIntArray114[local164];
									}
									if (local83.anIntArray106[local164] > 0) {
										local214 = 0;
										local216 = 0;
										local223 = local83.anIntArray106[local164] - 1;
										@Pc(227) Class1_Sub3_Sub2_Sub2 local227 = Class41.method526(local223);
										if (this.anInt139 != 0 && this.anInt138 == local164 && this.anInt137 == local83.anInt272) {
											local214 = super.anInt79 - this.anInt140;
											local216 = super.anInt80 - this.anInt141;
											if (local214 < 5 && local214 > -5) {
												local214 = 0;
											}
											if (local216 < 5 && local216 > -5) {
												local216 = 0;
											}
											local227.method285(local181 + local214, local190 + local216);
										} else if (this.anInt155 != 0 && this.anInt154 == local164 && this.anInt153 == local83.anInt272) {
											local227.method285(local181, local190);
										} else {
											local227.method283(local190, this.anInt184, local181);
										}
										if (local227.anInt365 == 33 || local83.anIntArray107[local164] != 1) {
											@Pc(320) int local320 = local83.anIntArray107[local164];
											this.aClass1_Sub3_Sub2_Sub4_1.method324(String.valueOf(local320), local181 + local214 + 1, 0, local190 + local216 + 10);
											this.aClass1_Sub3_Sub2_Sub4_1.method324(String.valueOf(local320), local181 + local214, 16776960, local190 + local216 + 9);
										}
									} else if (local83.aClass1_Sub3_Sub2_Sub2Array8 != null && local164 < 20) {
										@Pc(365) Class1_Sub3_Sub2_Sub2 local365 = local83.aClass1_Sub3_Sub2_Sub2Array8[local164];
										if (local365 != null) {
											local365.method283(local190, this.anInt184, local181);
										}
									}
									local164++;
								}
							}
						} else if (local83.anInt274 != 3) {
							@Pc(425) Class1_Sub3_Sub2_Sub4 local425;
							if (local83.anInt274 == 4) {
								local425 = local83.aClass1_Sub3_Sub2_Sub4_5;
								local166 = local83.anInt287;
								@Pc(431) String local431 = local83.aString16;
								if ((this.anInt146 == local83.anInt272 || this.anInt221 == local83.anInt272 || this.anInt156 == local83.anInt272) && local83.anInt289 != 0) {
									local166 = local83.anInt289;
								}
								if (this.method162(local83)) {
									local166 = local83.anInt288;
									if (local83.aString17.length() > 0) {
										local431 = local83.aString17;
									}
								}
								if (local83.anInt275 == 6 && this.aBoolean53) {
									local431 = "Please wait...";
									local166 = local83.anInt287;
								}
								local190 = local93 + local425.anInt416;
								while (local431.length() > 0) {
									if (local431.indexOf("%") != -1) {
										label247: while (true) {
											local214 = local431.indexOf("%1");
											if (local214 == -1) {
												while (true) {
													local214 = local431.indexOf("%2");
													if (local214 == -1) {
														while (true) {
															local214 = local431.indexOf("%3");
															if (local214 == -1) {
																while (true) {
																	local214 = local431.indexOf("%4");
																	if (local214 == -1) {
																		while (true) {
																			local214 = local431.indexOf("%5");
																			if (local214 == -1) {
																				break label247;
																			}
																			local431 = local431.substring(0, local214) + this.method97(this.method76(4, local83)) + local431.substring(local214 + 2);
																		}
																	}
																	local431 = local431.substring(0, local214) + this.method97(this.method76(3, local83)) + local431.substring(local214 + 2);
																}
															}
															local431 = local431.substring(0, local214) + this.method97(this.method76(2, local83)) + local431.substring(local214 + 2);
														}
													}
													local431 = local431.substring(0, local214) + this.method97(this.method76(1, local83)) + local431.substring(local214 + 2);
												}
											}
											local431 = local431.substring(0, local214) + this.method97(this.method76(0, local83)) + local431.substring(local214 + 2);
										}
									}
									local214 = local431.indexOf("\\n");
									@Pc(673) String local673;
									if (local214 == -1) {
										local673 = local431;
										local431 = "";
									} else {
										local673 = local431.substring(0, local214);
										local431 = local431.substring(local214 + 2);
									}
									if (local83.aBoolean77) {
										local425.method322(local190, local88 + local83.anInt277 / 2, local166, local673, local83.aBoolean78);
									} else {
										local425.method326(local83.aBoolean78, local88, local166, local190, local673);
									}
									local190 += local425.anInt416;
								}
							} else if (local83.anInt274 == 5) {
								@Pc(735) Class1_Sub3_Sub2_Sub2 local735;
								if (this.method162(local83)) {
									local735 = local83.aClass1_Sub3_Sub2_Sub2_12;
								} else {
									local735 = local83.aClass1_Sub3_Sub2_Sub2_11;
								}
								if (local735 != null) {
									local735.method283(local93, this.anInt184, local88);
								}
							} else if (local83.anInt274 == 6) {
								local164 = Class1_Sub3_Sub2_Sub1.anInt326;
								local166 = Class1_Sub3_Sub2_Sub1.anInt327;
								Class1_Sub3_Sub2_Sub1.anInt326 = local88 + local83.anInt277 / 2;
								Class1_Sub3_Sub2_Sub1.anInt327 = local93 + local83.anInt278 / 2;
								local170 = Class1_Sub3_Sub2_Sub1.anIntArray124[local83.anInt293] * local83.anInt292 >> 16;
								local181 = Class1_Sub3_Sub2_Sub1.anIntArray125[local83.anInt293] * local83.anInt292 >> 16;
								@Pc(805) Class1_Sub3_Sub1 local805;
								if (local83.anInt290 == -1) {
									local805 = local83.method226(-1, -1, this.method162(local83));
								} else {
									@Pc(812) Class13 local812 = Class13.aClass13Array1[local83.anInt290];
									local805 = local83.method226(local812.anIntArray130[local83.anInt270], local812.anIntArray131[local83.anInt270], this.method162(local83));
								}
								if (local805 != null) {
									local805.method219(local83.anInt294, 0, local83.anInt293, 0, local170, local181);
								}
								Class1_Sub3_Sub2_Sub1.anInt326 = local164;
								Class1_Sub3_Sub2_Sub1.anInt327 = local166;
							} else if (local83.anInt274 == 7) {
								local425 = local83.aClass1_Sub3_Sub2_Sub4_5;
								local166 = 0;
								for (local170 = 0; local170 < local83.anInt278; local170++) {
									for (local181 = 0; local181 < local83.anInt277; local181++) {
										if (local83.anIntArray106[local166] > 0) {
											@Pc(878) Class41 local878 = Class41.method522(local83.anIntArray106[local166] - 1);
											@Pc(881) String local881 = local878.aString28;
											if (local878.aBoolean164 || local83.anIntArray107[local166] != 1) {
												local881 = local83.anIntArray107[local166] + "x " + local881;
											}
											local216 = local88 + local181 * (local83.anInt285 + 115);
											local223 = local93 + local170 * (local83.anInt286 + 12);
											if (local83.aBoolean77) {
												if (local83.aBoolean78) {
													local425.method321(local223 + 1, 0, local216 + local83.anInt277 / 2 + 1, local881);
												}
												local425.method321(local223, local83.anInt287, local216 + local83.anInt277 / 2, local881);
											} else {
												if (local83.aBoolean78) {
													local425.method324(local881, local216 + 1, 0, local223 + 1);
												}
												local425.method324(local881, local216, local83.anInt287, local223);
											}
										}
										local166++;
									}
								}
							}
						} else if (local83.aBoolean76) {
							Class1_Sub3_Sub2.method317(local83.anInt287, this.anInt157, local83.anInt278, local93, local83.anInt277, local88);
						} else {
							Class1_Sub3_Sub2.method318(local83.anInt287, local93, local83.anInt277, local83.anInt278, local88);
						}
					}
				}
				Class1_Sub3_Sub2.method315(local35, local33, local31, local29);
			}
		} catch (@Pc(1004) RuntimeException local1004) {
			signlink.reporterror("65377, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local1004.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(BILjava/lang/String;)V")
	@Override
	protected void method66(@OriginalArg(1) int arg0, @OriginalArg(2) String arg1) {
		try {
			this.method103();
			if (this.aClass36_1 == null) {
				super.method66(arg0, arg1);
			} else {
				this.aClass29_9.method409();
				this.aClass1_Sub3_Sub2_Sub4_3.method321(54, 16777215, 180, "RuneScape is loading - please wait...");
				Class1_Sub3_Sub2.method318(9179409, 62, 304, 34, 28);
				Class1_Sub3_Sub2.method318(0, 63, 302, 32, 29);
				Class1_Sub3_Sub2.method317(9179409, this.anInt157, 30, 64, arg0 * 3, 30);
				Class1_Sub3_Sub2.method317(0, this.anInt157, 30, 64, 300 - arg0 * 3, arg0 * 3 + 30);
				this.aClass1_Sub3_Sub2_Sub4_3.method321(85, 16777215, 180, arg1);
				this.aClass29_9.method410(214, super.aGraphics2, 186, this.aByte11);
				if (this.aBoolean37) {
					this.aBoolean37 = false;
					if (!this.aBoolean54) {
						this.aClass29_10.method410(0, super.aGraphics2, 0, this.aByte11);
						this.aClass29_11.method410(661, super.aGraphics2, 0, this.aByte11);
					}
					this.aClass29_7.method410(128, super.aGraphics2, 0, this.aByte11);
					this.aClass29_8.method410(214, super.aGraphics2, 386, this.aByte11);
					this.aClass29_12.method410(0, super.aGraphics2, 265, this.aByte11);
					this.aClass29_13.method410(574, super.aGraphics2, 265, this.aByte11);
					this.aClass29_14.method410(128, super.aGraphics2, 186, this.aByte11);
					this.aClass29_15.method410(574, super.aGraphics2, 186, this.aByte11);
				}
			}
		} catch (@Pc(220) RuntimeException local220) {
			signlink.reporterror("19589, " + -75 + ", " + arg0 + ", " + arg1 + ", " + local220.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(I)V")
	@Override
	protected void method62() {
		try {
			if (this.aBoolean58 || this.aBoolean50 || this.aBoolean56) {
				this.method78();
			} else {
				if (this.aBoolean41) {
					this.method141(this.anInt101);
				} else {
					this.method127();
				}
				this.anInt134 = 0;
			}
		} catch (@Pc(33) RuntimeException local33) {
			signlink.reporterror("44212, " + -14379 + ", " + local33.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!z;BILclient!kb;I)V")
	private void method107(@OriginalArg(0) Class1_Sub1_Sub3_Sub2 arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class1_Sub3_Sub3 arg3, @OriginalArg(4) int arg4) {
		try {
			@Pc(6) boolean local6 = false;
			@Pc(20) int local20;
			if ((arg4 & 0x1) == 1) {
				local20 = arg3.method380();
				@Pc(23) byte[] local23 = new byte[local20];
				@Pc(29) Class1_Sub3_Sub3 local29 = new Class1_Sub3_Sub3(local23, 4);
				arg3.method389(local23, local20, 0);
				this.aClass1_Sub3_Sub3Array1[arg2] = local29;
				arg0.method517(local29);
			}
			@Pc(67) int local67;
			if ((arg4 & 0x2) == 2) {
				local20 = arg3.method382();
				if (local20 == 65535) {
					local20 = -1;
				}
				if (local20 == arg0.anInt768) {
					arg0.anInt772 = 0;
				}
				local67 = arg3.method380();
				if (local20 == -1 || arg0.anInt768 == -1 || Class13.aClass13Array1[local20].anInt335 > Class13.aClass13Array1[arg0.anInt768].anInt335 || Class13.aClass13Array1[arg0.anInt768].anInt335 == 0) {
					arg0.anInt768 = local20;
					arg0.anInt769 = 0;
					arg0.anInt770 = 0;
					arg0.anInt771 = local67;
					arg0.anInt772 = 0;
				}
			}
			if ((arg4 & 0x4) == 4) {
				arg0.anInt762 = arg3.method382();
				if (arg0.anInt762 == 65535) {
					arg0.anInt762 = -1;
				}
			}
			if ((arg4 & 0x8) == 8) {
				arg0.aString26 = arg3.method387();
				arg0.anInt755 = 0;
				arg0.anInt756 = 0;
				arg0.anInt754 = 150;
				this.method128(arg0.aString26, 2, this.anInt179, arg0.aString27);
			}
			if ((arg4 & 0x10) == 16) {
				arg0.anInt757 = arg3.method380();
				arg0.anInt758 = arg3.method380();
				arg0.anInt759 = anInt132 + 400;
				arg0.anInt760 = arg3.method380();
				arg0.anInt761 = arg3.method380();
			}
			if ((arg4 & 0x20) == 32) {
				arg0.anInt763 = arg3.method382();
				arg0.anInt764 = arg3.method382();
			}
			if ((arg4 & 0x40) == 64) {
				local20 = arg3.method382();
				local67 = arg3.method380();
				@Pc(201) int local201 = arg3.anInt433;
				if (arg0.aString27 != null) {
					@Pc(208) long local208 = Class37.method481(arg0.aString27);
					@Pc(210) boolean local210 = false;
					for (@Pc(212) int local212 = 0; local212 < this.anInt204; local212++) {
						if (this.aLongArray3[local212] == local208) {
							local210 = true;
							break;
						}
					}
					if (!local210) {
						@Pc(237) String local237 = Class38.method487(local67, arg3);
						@Pc(241) String local241 = Class19.method339(local237);
						arg0.aString26 = local241;
						arg0.anInt755 = local20 >> 8;
						arg0.anInt756 = local20 & 0xFF;
						arg0.anInt754 = 150;
						this.method128(local241, 2, this.anInt179, arg0.aString27);
					}
				}
				arg3.anInt433 = local201 + local67;
			}
			if ((arg4 & 0x100) == 256) {
				arg0.anInt773 = arg3.method382();
				local20 = arg3.method385();
				arg0.anInt777 = local20 >> 16;
				arg0.anInt776 = anInt132 + (local20 & 0xFFFF);
				arg0.anInt774 = 0;
				arg0.anInt775 = 0;
				if (arg0.anInt776 > anInt132) {
					arg0.anInt774 = -1;
				}
				if (arg0.anInt773 == 65535) {
					arg0.anInt773 = -1;
				}
			}
			if ((arg4 & 0x200) == 512) {
				arg0.anInt778 = arg3.method380();
				arg0.anInt780 = arg3.method380();
				arg0.anInt779 = arg3.method380();
				arg0.anInt781 = arg3.method380();
				arg0.anInt782 = arg3.method382() + anInt132;
				arg0.anInt783 = arg3.method382() + anInt132;
				arg0.anInt784 = arg3.method380();
				arg0.anInt788 = 0;
				arg0.anIntArray213[0] = arg0.anInt779;
				arg0.anIntArray214[0] = arg0.anInt781;
			}
		} catch (@Pc(368) RuntimeException local368) {
			signlink.reporterror("87261, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local368.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "h", descriptor = "(Z)V")
	private void method108() {
		try {
			this.aBoolean41 &= true;
			@Pc(15) int local15;
			@Pc(22) int local22;
			if (this.anInt207 == 0) {
				local15 = super.anInt75 / 2;
				local22 = super.anInt76 / 2 + 90;
				if (super.anInt81 == 1 && super.anInt82 >= local15 - 75 && super.anInt82 <= local15 + 75 && super.anInt83 >= local22 - 20 && super.anInt83 <= local22 + 20) {
					this.aString13 = "";
					this.aString14 = "Enter your username & password.";
					this.anInt207 = 2;
					this.anInt190 = 0;
					return;
				}
			} else if (this.anInt207 == 1 || this.anInt207 == 2) {
				local15 = super.anInt76 / 2 - 30;
				local15 += 30;
				if (super.anInt81 == 1 && super.anInt83 >= local15 - 15 && super.anInt83 < local15) {
					this.anInt190 = 0;
				}
				local15 += 15;
				if (super.anInt81 == 1 && super.anInt83 >= local15 - 15 && super.anInt83 < local15) {
					this.anInt190 = 1;
				}
				local15 += 15;
				if (super.anInt81 == 1 && super.anInt83 >= local15 - 15 && super.anInt83 < local15 && this.anInt207 == 1) {
					this.anInt190 = 2;
				}
				local22 = super.anInt75 / 2 - 80;
				@Pc(150) int local150 = super.anInt76 / 2 + 60;
				if (super.anInt81 == 1 && super.anInt82 >= local22 - 75 && super.anInt82 <= local22 + 75 && super.anInt83 >= local150 - 20 && super.anInt83 <= local150 + 20) {
					if (this.anInt207 == 1) {
						this.method101(this.aString6, this.aString7, this.method124());
					} else {
						this.method156(this.aString6, this.aString7, this.method124(), false);
					}
				}
				local22 = super.anInt75 / 2 + 80;
				if (super.anInt81 == 1 && super.anInt82 >= local22 - 75 && super.anInt82 <= local22 + 75 && super.anInt83 >= local150 - 20 && super.anInt83 <= local150 + 20) {
					this.anInt207 = 0;
				}
				while (true) {
					while (true) {
						@Pc(245) int local245 = this.method58();
						if (local245 == -1) {
							return;
						}
						@Pc(250) boolean local250 = false;
						for (@Pc(252) int local252 = 0; local252 < aString9.length(); local252++) {
							if (local245 == aString9.charAt(local252)) {
								local250 = true;
								break;
							}
						}
						if (this.anInt190 == 0) {
							if (local245 == 8 && this.aString6.length() > 0) {
								this.aString6 = this.aString6.substring(0, this.aString6.length() - 1);
							}
							if (local245 == 9 || local245 == 10 || local245 == 13) {
								this.anInt190 = 1;
							}
							if (local250) {
								this.aString6 = this.aString6 + (char) local245;
							}
							if (this.aString6.length() > 12) {
								this.aString6 = this.aString6.substring(0, 12);
							}
						} else if (this.anInt190 == 1) {
							if (local245 == 8 && this.aString7.length() > 0) {
								this.aString7 = this.aString7.substring(0, this.aString7.length() - 1);
							}
							if (local245 == 9 || local245 == 10 || local245 == 13) {
								if (this.anInt207 == 1) {
									this.anInt190 = 2;
								} else {
									this.anInt190 = 0;
								}
							}
							if (local250) {
								this.aString7 = this.aString7 + (char) local245;
							}
							if (this.aString7.length() > 20) {
								this.aString7 = this.aString7.substring(0, 20);
							}
						} else if (this.anInt190 == 2) {
							if (local245 == 8 && this.aString8.length() > 0) {
								this.aString8 = this.aString8.substring(0, this.aString8.length() - 1);
							}
							if (local245 == 9 || local245 == 10 || local245 == 13) {
								this.anInt190 = 0;
							}
							if (local250) {
								this.aString8 = this.aString8 + (char) local245;
							}
							if (this.aString8.length() > 20) {
								this.aString8 = this.aString8.substring(0, 20);
							}
						}
					}
				}
			}
		} catch (@Pc(464) RuntimeException local464) {
			signlink.reporterror("6482, " + true + ", " + local464.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "r", descriptor = "(I)V")
	private void method109() {
		try {
			this.aClass1_Sub3_Sub2_Sub3_19 = new Class1_Sub3_Sub2_Sub3(this.aClass36_1, "titlebox", 0);
			this.aClass1_Sub3_Sub2_Sub3_20 = new Class1_Sub3_Sub2_Sub3(this.aClass36_1, "titlebutton", 0);
			this.aClass1_Sub3_Sub2_Sub3Array2 = new Class1_Sub3_Sub2_Sub3[12];
			for (@Pc(30) int local30 = 0; local30 < 12; local30++) {
				this.aClass1_Sub3_Sub2_Sub3Array2[local30] = new Class1_Sub3_Sub2_Sub3(this.aClass36_1, "runes", local30);
			}
			this.aClass1_Sub3_Sub2_Sub2_1 = new Class1_Sub3_Sub2_Sub2(128, 265);
			this.aClass1_Sub3_Sub2_Sub2_2 = new Class1_Sub3_Sub2_Sub2(128, 265);
			for (@Pc(63) int local63 = 0; local63 < 33920; local63++) {
				this.aClass1_Sub3_Sub2_Sub2_1.anIntArray135[local63] = this.aClass29_10.anIntArray171[local63];
			}
			for (@Pc(81) int local81 = 0; local81 < 33920; local81++) {
				this.aClass1_Sub3_Sub2_Sub2_2.anIntArray135[local81] = this.aClass29_11.anIntArray171[local81];
			}
			this.anIntArray36 = new int[256];
			for (@Pc(103) int local103 = 0; local103 < 64; local103++) {
				this.anIntArray36[local103] = local103 * 262144;
			}
			for (@Pc(118) int local118 = 0; local118 < 64; local118++) {
				this.anIntArray36[local118 + 64] = local118 * 1024 + 16711680;
			}
			for (@Pc(137) int local137 = 0; local137 < 64; local137++) {
				this.anIntArray36[local137 + 128] = local137 * 4 + 16776960;
			}
			for (@Pc(156) int local156 = 0; local156 < 64; local156++) {
				this.anIntArray36[local156 + 192] = 16777215;
			}
			this.anIntArray37 = new int[256];
			for (@Pc(175) int local175 = 0; local175 < 64; local175++) {
				this.anIntArray37[local175] = local175 * 1024;
			}
			for (@Pc(190) int local190 = 0; local190 < 64; local190++) {
				this.anIntArray37[local190 + 64] = local190 * 4 + 65280;
			}
			for (@Pc(209) int local209 = 0; local209 < 64; local209++) {
				this.anIntArray37[local209 + 128] = local209 * 262144 + 65535;
			}
			for (@Pc(228) int local228 = 0; local228 < 64; local228++) {
				this.anIntArray37[local228 + 192] = 16777215;
			}
			this.anIntArray38 = new int[256];
			for (@Pc(247) int local247 = 0; local247 < 64; local247++) {
				this.anIntArray38[local247] = local247 * 4;
			}
			for (@Pc(262) int local262 = 0; local262 < 64; local262++) {
				this.anIntArray38[local262 + 64] = local262 * 262144 + 255;
			}
			for (@Pc(281) int local281 = 0; local281 < 64; local281++) {
				this.anIntArray38[local281 + 128] = local281 * 1024 + 16711935;
			}
			for (@Pc(300) int local300 = 0; local300 < 64; local300++) {
				this.anIntArray38[local300 + 192] = 16777215;
			}
			this.anIntArray35 = new int[256];
			this.anIntArray61 = new int[32768];
			this.anIntArray62 = new int[32768];
			this.method150(null);
			this.anIntArray33 = new int[32768];
			this.anIntArray34 = new int[32768];
			this.method66(10, "Connecting to fileserver");
			if (!this.aBoolean54) {
				this.aBoolean43 = true;
				this.aBoolean54 = true;
				this.method65(this, 2);
			}
		} catch (@Pc(357) RuntimeException local357) {
			signlink.reporterror("96641, " + ", " + local357.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "s", descriptor = "(I)V")
	private void method110(@OriginalArg(0) int arg0) {
		try {
			Class39.aClass32_4.method472();
			Class39.aClass32_5.method472();
			if (arg0 != -40161) {
				for (@Pc(8) int local8 = 1; local8 > 0; local8++) {
				}
			}
			Class40.aClass32_6.method472();
			Class41.aClass32_8.method472();
			Class41.aClass32_9.method472();
			Class1_Sub1_Sub3_Sub2.aClass32_7.method472();
			Class15.aClass32_3.method472();
		} catch (@Pc(25) RuntimeException local25) {
			signlink.reporterror("37216, " + arg0 + ", " + local25.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIILclient!ec;II)V")
	private void method111(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class9 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		try {
			if (arg3.anInt274 == 0 && arg3.anIntArray110 != null && !arg3.aBoolean71 && (arg2 >= arg1 && arg4 >= arg5 && arg2 <= arg1 + arg3.anInt277 && arg4 <= arg5 + arg3.anInt278)) {
				@Pc(34) int local34 = arg3.anIntArray110.length;
				if (this.anInt227 != 4) {
					this.anInt176 = 313;
				}
				for (@Pc(43) int local43 = 0; local43 < local34; local43++) {
					@Pc(52) int local52 = arg3.anIntArray111[local43] + arg1;
					@Pc(61) int local61 = arg3.anIntArray112[local43] + arg5 - arg0;
					@Pc(68) Class9 local68 = Class9.aClass9Array1[arg3.anIntArray110[local43]];
					@Pc(73) int local73 = local52 + local68.anInt279;
					@Pc(78) int local78 = local61 + local68.anInt280;
					if ((local68.anInt281 >= 0 || local68.anInt289 != 0) && arg2 >= local73 && arg4 >= local78 && arg2 < local73 + local68.anInt277 && arg4 < local78 + local68.anInt278) {
						if (local68.anInt281 >= 0) {
							this.anInt170 = local68.anInt281;
						} else {
							this.anInt170 = local68.anInt272;
						}
					}
					if (local68.anInt274 == 0) {
						this.method111(local68.anInt283, local73, arg2, local68, arg4, local78);
						if (local68.anInt282 > local68.anInt278) {
							this.method153(true, local68.anInt282, arg2, local68, local73 + local68.anInt277, this.aByte4, local68.anInt278, arg4, local78);
						}
					} else {
						if (local68.anInt275 == 1 && arg2 >= local73 && arg4 >= local78 && arg2 < local73 + local68.anInt277 && arg4 < local78 + local68.anInt278) {
							this.aStringArray2[this.anInt112] = local68.aString20;
							this.anIntArray48[this.anInt112] = 508;
							this.anIntArray47[this.anInt112] = local68.anInt272;
							this.anInt112++;
						}
						if (local68.anInt275 == 2 && this.anInt109 == 0 && arg2 >= local73 && arg4 >= local78 && arg2 < local73 + local68.anInt277 && arg4 < local78 + local68.anInt278) {
							@Pc(228) String local228 = local68.aString18;
							if (local228.indexOf(" ") != -1) {
								local228 = local228.substring(0, local228.indexOf(" "));
							}
							this.aStringArray2[this.anInt112] = local228 + " @gre@" + local68.aString19;
							this.anIntArray48[this.anInt112] = 458;
							this.anIntArray47[this.anInt112] = local68.anInt272;
							this.anInt112++;
						}
						if (local68.anInt275 == 3 && arg2 >= local73 && arg4 >= local78 && arg2 < local73 + local68.anInt277 && arg4 < local78 + local68.anInt278) {
							this.aStringArray2[this.anInt112] = "Close";
							this.anIntArray48[this.anInt112] = 850;
							this.anIntArray47[this.anInt112] = local68.anInt272;
							this.anInt112++;
						}
						if (local68.anInt275 == 4 && arg2 >= local73 && arg4 >= local78 && arg2 < local73 + local68.anInt277 && arg4 < local78 + local68.anInt278) {
							this.aStringArray2[this.anInt112] = local68.aString20;
							this.anIntArray48[this.anInt112] = 170;
							this.anIntArray47[this.anInt112] = local68.anInt272;
							this.anInt112++;
						}
						if (local68.anInt275 == 5 && arg2 >= local73 && arg4 >= local78 && arg2 < local73 + local68.anInt277 && arg4 < local78 + local68.anInt278) {
							this.aStringArray2[this.anInt112] = local68.aString20;
							this.anIntArray48[this.anInt112] = 638;
							this.anIntArray47[this.anInt112] = local68.anInt272;
							this.anInt112++;
						}
						if (local68.anInt275 == 6 && !this.aBoolean53 && arg2 >= local73 && arg4 >= local78 && arg2 < local73 + local68.anInt277 && arg4 < local78 + local68.anInt278) {
							this.aStringArray2[this.anInt112] = local68.aString20;
							this.anIntArray48[this.anInt112] = 199;
							this.anIntArray47[this.anInt112] = local68.anInt272;
							this.anInt112++;
						}
						if (local68.anInt274 == 2) {
							@Pc(476) int local476 = 0;
							for (@Pc(478) int local478 = 0; local478 < local68.anInt278; local478++) {
								for (@Pc(482) int local482 = 0; local482 < local68.anInt277; local482++) {
									@Pc(493) int local493 = local73 + local482 * (local68.anInt285 + 32);
									@Pc(502) int local502 = local78 + local478 * (local68.anInt286 + 32);
									if (local476 < 20) {
										local493 += local68.anIntArray113[local476];
										local502 += local68.anIntArray114[local476];
									}
									if (arg2 >= local493 && arg4 >= local502 && arg2 < local493 + 32 && arg4 < local502 + 32) {
										this.anInt91 = local476;
										this.anInt92 = local68.anInt272;
										if (local68.anIntArray106[local476] > 0) {
											@Pc(555) Class41 local555 = Class41.method522(local68.anIntArray106[local476] - 1);
											if (this.anInt114 == 1 && local68.aBoolean74) {
												if (local68.anInt272 != this.anInt116 || local476 != this.anInt115) {
													this.aStringArray2[this.anInt112] = "Use " + this.aString5 + " with @lre@" + local555.aString28;
													this.anIntArray48[this.anInt112] = 786;
													this.anIntArray49[this.anInt112] = local555.anInt807;
													this.anIntArray46[this.anInt112] = local476;
													this.anIntArray47[this.anInt112] = local68.anInt272;
													this.anInt112++;
												}
											} else if (this.anInt109 != 1 || !local68.aBoolean74) {
												@Pc(692) int local692;
												if (local68.aBoolean74) {
													for (local692 = 4; local692 >= 3; local692--) {
														if (local555.aStringArray10 != null && local555.aStringArray10[local692] != null) {
															this.aStringArray2[this.anInt112] = local555.aStringArray10[local692] + " @lre@" + local555.aString28;
															if (local692 == 3) {
																this.anIntArray48[this.anInt112] = 294;
															}
															if (local692 == 4) {
																this.anIntArray48[this.anInt112] = 622;
															}
															this.anIntArray49[this.anInt112] = local555.anInt807;
															this.anIntArray46[this.anInt112] = local476;
															this.anIntArray47[this.anInt112] = local68.anInt272;
															this.anInt112++;
														} else if (local692 == 4) {
															this.aStringArray2[this.anInt112] = "Drop @lre@" + local555.aString28;
															this.anIntArray48[this.anInt112] = 622;
															this.anIntArray49[this.anInt112] = local555.anInt807;
															this.anIntArray46[this.anInt112] = local476;
															this.anIntArray47[this.anInt112] = local68.anInt272;
															this.anInt112++;
														}
													}
												}
												if (local68.aBoolean75) {
													this.aStringArray2[this.anInt112] = "Use @lre@" + local555.aString28;
													this.anIntArray48[this.anInt112] = 517;
													this.anIntArray49[this.anInt112] = local555.anInt807;
													this.anIntArray46[this.anInt112] = local476;
													this.anIntArray47[this.anInt112] = local68.anInt272;
													this.anInt112++;
												}
												if (local68.aBoolean74 && local555.aStringArray10 != null) {
													for (local692 = 2; local692 >= 0; local692--) {
														if (local555.aStringArray10[local692] != null) {
															this.aStringArray2[this.anInt112] = local555.aStringArray10[local692] + " @lre@" + local555.aString28;
															if (local692 == 0) {
																this.anIntArray48[this.anInt112] = 649;
															}
															if (local692 == 1) {
																this.anIntArray48[this.anInt112] = 408;
															}
															if (local692 == 2) {
																this.anIntArray48[this.anInt112] = 176;
															}
															this.anIntArray49[this.anInt112] = local555.anInt807;
															this.anIntArray46[this.anInt112] = local476;
															this.anIntArray47[this.anInt112] = local68.anInt272;
															this.anInt112++;
														}
													}
												}
												if (local68.aStringArray5 != null) {
													for (local692 = 4; local692 >= 0; local692--) {
														if (local68.aStringArray5[local692] != null) {
															this.aStringArray2[this.anInt112] = local68.aStringArray5[local692] + " @lre@" + local555.aString28;
															if (local692 == 0) {
																this.anIntArray48[this.anInt112] = 288;
															}
															if (local692 == 1) {
																this.anIntArray48[this.anInt112] = 776;
															}
															if (local692 == 2) {
																this.anIntArray48[this.anInt112] = 857;
															}
															if (local692 == 3) {
																this.anIntArray48[this.anInt112] = 881;
															}
															if (local692 == 4) {
																this.anIntArray48[this.anInt112] = 688;
															}
															this.anIntArray49[this.anInt112] = local555.anInt807;
															this.anIntArray46[this.anInt112] = local476;
															this.anIntArray47[this.anInt112] = local68.anInt272;
															this.anInt112++;
														}
													}
												}
												this.aStringArray2[this.anInt112] = "Examine @lre@" + local555.aString28;
												this.anIntArray48[this.anInt112] = 1685;
												this.anIntArray49[this.anInt112] = local555.anInt807;
												this.anInt112++;
											} else if ((this.anInt111 & 0x10) == 16) {
												this.aStringArray2[this.anInt112] = this.aString4 + " @lre@" + local555.aString28;
												this.anIntArray48[this.anInt112] = 602;
												this.anIntArray49[this.anInt112] = local555.anInt807;
												this.anIntArray46[this.anInt112] = local476;
												this.anIntArray47[this.anInt112] = local68.anInt272;
												this.anInt112++;
											}
										}
									}
									local476++;
								}
							}
						}
					}
				}
			}
		} catch (@Pc(1109) RuntimeException local1109) {
			signlink.reporterror("88204, " + 4 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local1109.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(II)V")
	private void method112(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			if (arg1 >= 0) {
				if (this.aBoolean46) {
					this.aBoolean46 = false;
					this.aBoolean32 = true;
				}
				@Pc(18) int local18 = this.anIntArray46[arg1];
				@Pc(23) int local23 = this.anIntArray47[arg1];
				@Pc(28) int local28 = this.anIntArray48[arg1];
				@Pc(33) int local33 = this.anIntArray49[arg1];
				@Pc(49) Class9 local49;
				@Pc(67) int local67;
				if (local28 == 170) {
					this.aClass1_Sub3_Sub3_3.method371(160, 167);
					this.aClass1_Sub3_Sub3_3.method373(local23);
					local49 = Class9.aClass9Array1[local23];
					if (local49.anIntArrayArray11 != null && local49.anIntArrayArray11[0][0] == 5) {
						local67 = local49.anIntArrayArray11[0][1];
						this.anIntArray41[local67] = 1 - this.anIntArray41[local67];
						this.method91(local67);
						this.aBoolean44 = true;
					}
				}
				if (local28 == 647) {
					this.method123(local23, local18, local33, 734, 249);
				}
				if (local28 == 517) {
					this.anInt114 = 1;
					this.anInt115 = local18;
					this.anInt116 = local23;
					this.anInt117 = local33;
					this.aString5 = Class41.method522(local33).aString28;
					this.anInt109 = 0;
				} else {
					if (local28 == 310) {
						this.method123(local23, local18, local33, 734, 82);
					}
					@Pc(150) Class1_Sub1_Sub3_Sub1 local150;
					if (local28 == 490 || local28 == 914 || local28 == 75 || local28 == 486 || local28 == 772) {
						local150 = this.aClass1_Sub1_Sub3_Sub1Array1[local33];
						if (local150 != null) {
							this.method126(local150.anIntArray214[0], 0, false, 1, 1, 0, 0, this.aClass1_Sub1_Sub3_Sub2_1.anIntArray214[0], this.aClass1_Sub1_Sub3_Sub2_1.anIntArray213[0], local150.anIntArray213[0]);
							this.anInt164 = super.anInt82;
							this.anInt165 = super.anInt83;
							this.anInt167 = 2;
							this.anInt166 = 0;
							if (local28 == 75) {
								this.aClass1_Sub3_Sub3_3.method371(160, 228);
							}
							if (local28 == 914) {
								this.aClass1_Sub3_Sub3_3.method371(160, 55);
							}
							if (local28 == 490) {
								this.aClass1_Sub3_Sub3_3.method371(160, 160);
							}
							if (local28 == 486) {
								this.aClass1_Sub3_Sub3_3.method371(160, 88);
							}
							if (local28 == 772) {
								this.aClass1_Sub3_Sub3_3.method371(160, 37);
							}
							this.aClass1_Sub3_Sub3_3.method373(local33);
						}
					}
					if (local28 == 792 && this.method123(local23, local18, local33, 734, 177)) {
						this.aClass1_Sub3_Sub3_3.method373(this.anInt110);
					}
					if (local28 == 174 && this.method123(local23, local18, local33, 734, 7)) {
						this.aClass1_Sub3_Sub3_3.method373(this.anInt117);
						this.aClass1_Sub3_Sub3_3.method373(this.anInt115);
						this.aClass1_Sub3_Sub3_3.method373(this.anInt116);
					}
					@Pc(301) String local301;
					if (local28 == 1318) {
						local150 = this.aClass1_Sub1_Sub3_Sub1Array1[local33];
						if (local150 != null) {
							if (local150.aClass40_1.aByteArray13 == null) {
								local301 = "It's a " + local150.aClass40_1.aString25 + ".";
							} else {
								local301 = new String(local150.aClass40_1.aByteArray13);
							}
							this.method128(local301, 0, this.anInt179, "");
						}
					}
					if (local28 == 404) {
						if (this.aBoolean52) {
							this.aClass30_1.method449(local18 - 8, local23 - 11);
						} else {
							this.aClass30_1.method449(super.anInt82 - 8, super.anInt83 - 11);
						}
					}
					@Pc(377) boolean local377;
					if (local28 == 652) {
						local377 = this.method126(local23, 0, false, 0, 0, 0, 0, this.aClass1_Sub1_Sub3_Sub2_1.anIntArray214[0], this.aClass1_Sub1_Sub3_Sub2_1.anIntArray213[0], local18);
						if (!local377) {
							this.method126(local23, 0, false, 1, 1, 0, 0, this.aClass1_Sub1_Sub3_Sub2_1.anIntArray214[0], this.aClass1_Sub1_Sub3_Sub2_1.anIntArray213[0], local18);
						}
						this.anInt164 = super.anInt82;
						this.anInt165 = super.anInt83;
						this.anInt167 = 2;
						this.anInt166 = 0;
						this.aClass1_Sub3_Sub3_3.method371(160, 209);
						this.aClass1_Sub3_Sub3_3.method373(local18 + this.anInt180);
						this.aClass1_Sub3_Sub3_3.method373(local23 + this.anInt181);
						this.aClass1_Sub3_Sub3_3.method373(local33);
						this.aClass1_Sub3_Sub3_3.method373(this.anInt117);
						this.aClass1_Sub3_Sub3_3.method373(this.anInt115);
						this.aClass1_Sub3_Sub3_3.method373(this.anInt116);
					}
					if (local28 == 786) {
						this.aClass1_Sub3_Sub3_3.method371(160, 40);
						this.aClass1_Sub3_Sub3_3.method373(local33);
						this.aClass1_Sub3_Sub3_3.method373(local18);
						this.aClass1_Sub3_Sub3_3.method373(local23);
						this.aClass1_Sub3_Sub3_3.method373(this.anInt117);
						this.aClass1_Sub3_Sub3_3.method373(this.anInt115);
						this.aClass1_Sub3_Sub3_3.method373(this.anInt116);
						this.anInt152 = 0;
						this.anInt153 = local23;
						this.anInt154 = local18;
						this.anInt155 = 2;
						if (Class9.aClass9Array1[local23].anInt273 == this.anInt229) {
							this.anInt155 = 1;
						}
						if (Class9.aClass9Array1[local23].anInt273 == this.anInt107) {
							this.anInt155 = 3;
						}
					}
					@Pc(537) Class1_Sub1_Sub3_Sub2 local537;
					if (local28 == 364 || local28 == 900 || local28 == 487 || local28 == 953) {
						local537 = this.aClass1_Sub1_Sub3_Sub2Array1[local33];
						if (local537 != null) {
							this.method126(local537.anIntArray214[0], 0, false, 1, 1, 0, 0, this.aClass1_Sub1_Sub3_Sub2_1.anIntArray214[0], this.aClass1_Sub1_Sub3_Sub2_1.anIntArray213[0], local537.anIntArray213[0]);
							this.anInt164 = super.anInt82;
							this.anInt165 = super.anInt83;
							this.anInt167 = 2;
							this.anInt166 = 0;
							if (local28 == 900) {
								this.aClass1_Sub3_Sub3_3.method371(160, 3);
							}
							if (local28 == 953) {
								this.aClass1_Sub3_Sub3_3.method371(160, 232);
							}
							if (local28 == 364) {
								this.aClass1_Sub3_Sub3_3.method371(160, 216);
							}
							if (local28 == 487) {
								this.aClass1_Sub3_Sub3_3.method371(160, 13);
							}
							this.aClass1_Sub3_Sub3_3.method373(local33);
						}
					}
					@Pc(638) String local638;
					if (local28 == 1419) {
						@Pc(626) int local626 = local33 >> 14 & 0x7FFF;
						@Pc(629) Class39 local629 = Class39.method496(local626);
						if (local629.aByteArray12 == null) {
							local638 = "It's a " + local629.aString23 + ".";
						} else {
							local638 = new String(local629.aByteArray12);
						}
						this.method128(local638, 0, this.anInt179, "");
					}
					if (local28 == 34) {
						this.method123(local23, local18, local33, 734, 229);
					}
					if (local28 == 288 || local28 == 776 || local28 == 857 || local28 == 881 || local28 == 688) {
						if (local28 == 776) {
							this.aClass1_Sub3_Sub3_3.method371(160, 53);
						}
						if (local28 == 688) {
							this.aClass1_Sub3_Sub3_3.method371(160, 220);
						}
						if (local28 == 857) {
							this.aClass1_Sub3_Sub3_3.method371(160, 146);
						}
						if (local28 == 288) {
							this.aClass1_Sub3_Sub3_3.method371(160, 184);
						}
						if (local28 == 881) {
							this.aClass1_Sub3_Sub3_3.method371(160, 240);
						}
						this.aClass1_Sub3_Sub3_3.method373(local33);
						this.aClass1_Sub3_Sub3_3.method373(local18);
						this.aClass1_Sub3_Sub3_3.method373(local23);
						this.anInt152 = 0;
						this.anInt153 = local23;
						this.anInt154 = local18;
						this.anInt155 = 2;
						if (Class9.aClass9Array1[local23].anInt273 == this.anInt229) {
							this.anInt155 = 1;
						}
						if (Class9.aClass9Array1[local23].anInt273 == this.anInt107) {
							this.anInt155 = 3;
						}
					}
					if (local28 == 199 && !this.aBoolean53) {
						this.aClass1_Sub3_Sub3_3.method371(160, 194);
						this.aClass1_Sub3_Sub3_3.method373(local23);
						this.aBoolean53 = true;
					}
					if (local28 == 985) {
						local150 = this.aClass1_Sub1_Sub3_Sub1Array1[local33];
						if (local150 != null) {
							this.method126(local150.anIntArray214[0], 0, false, 1, 1, 0, 0, this.aClass1_Sub1_Sub3_Sub2_1.anIntArray214[0], this.aClass1_Sub1_Sub3_Sub2_1.anIntArray213[0], local150.anIntArray213[0]);
							this.anInt164 = super.anInt82;
							this.anInt165 = super.anInt83;
							this.anInt167 = 2;
							this.anInt166 = 0;
							this.aClass1_Sub3_Sub3_3.method371(160, 144);
							this.aClass1_Sub3_Sub3_3.method373(local33);
							this.aClass1_Sub3_Sub3_3.method373(this.anInt117);
							this.aClass1_Sub3_Sub3_3.method373(this.anInt115);
							this.aClass1_Sub3_Sub3_3.method373(this.anInt116);
						}
					}
					if (local28 == 850) {
						this.aClass1_Sub3_Sub3_3.method371(160, 122);
						if (this.anInt235 != -1) {
							this.anInt235 = -1;
							this.aBoolean44 = true;
							this.aBoolean53 = false;
							this.aBoolean60 = true;
						}
						if (this.anInt107 != -1) {
							this.anInt107 = -1;
							this.aBoolean32 = true;
							this.aBoolean53 = false;
						}
						this.anInt229 = -1;
					}
					if (local28 == 926) {
						local377 = this.method126(local23, 0, false, 0, 0, 0, 0, this.aClass1_Sub1_Sub3_Sub2_1.anIntArray214[0], this.aClass1_Sub1_Sub3_Sub2_1.anIntArray213[0], local18);
						if (!local377) {
							this.method126(local23, 0, false, 1, 1, 0, 0, this.aClass1_Sub1_Sub3_Sub2_1.anIntArray214[0], this.aClass1_Sub1_Sub3_Sub2_1.anIntArray213[0], local18);
						}
						this.anInt164 = super.anInt82;
						this.anInt165 = super.anInt83;
						this.anInt167 = 2;
						this.anInt166 = 0;
						this.aClass1_Sub3_Sub3_3.method371(160, 45);
						this.aClass1_Sub3_Sub3_3.method373(local18 + this.anInt180);
						this.aClass1_Sub3_Sub3_3.method373(local23 + this.anInt181);
						this.aClass1_Sub3_Sub3_3.method373(local33);
						this.aClass1_Sub3_Sub3_3.method373(this.anInt110);
					}
					if (local28 == 602) {
						this.aClass1_Sub3_Sub3_3.method371(160, 231);
						this.aClass1_Sub3_Sub3_3.method373(local33);
						this.aClass1_Sub3_Sub3_3.method373(local18);
						this.aClass1_Sub3_Sub3_3.method373(local23);
						this.aClass1_Sub3_Sub3_3.method373(this.anInt110);
						this.anInt152 = 0;
						this.anInt153 = local23;
						this.anInt154 = local18;
						this.anInt155 = 2;
						if (Class9.aClass9Array1[local23].anInt273 == this.anInt229) {
							this.anInt155 = 1;
						}
						if (Class9.aClass9Array1[local23].anInt273 == this.anInt107) {
							this.anInt155 = 3;
						}
					}
					if (local28 == 649 || local28 == 408 || local28 == 176 || local28 == 294 || local28 == 622) {
						if (local28 == 176) {
							this.aClass1_Sub3_Sub3_3.method371(160, 9);
						}
						if (local28 == 622) {
							this.aClass1_Sub3_Sub3_3.method371(160, 110);
						}
						if (local28 == 649) {
							this.aClass1_Sub3_Sub3_3.method371(160, 80);
						}
						if (local28 == 408) {
							this.aClass1_Sub3_Sub3_3.method371(160, 139);
						}
						if (local28 == 294) {
							this.aClass1_Sub3_Sub3_3.method371(160, 26);
						}
						this.aClass1_Sub3_Sub3_3.method373(local33);
						this.aClass1_Sub3_Sub3_3.method373(local18);
						this.aClass1_Sub3_Sub3_3.method373(local23);
						this.anInt152 = 0;
						this.anInt153 = local23;
						this.anInt154 = local18;
						this.anInt155 = 2;
						if (Class9.aClass9Array1[local23].anInt273 == this.anInt229) {
							this.anInt155 = 1;
						}
						if (Class9.aClass9Array1[local23].anInt273 == this.anInt107) {
							this.anInt155 = 3;
						}
					}
					if (local28 == 533 || local28 == 947 || local28 == 705 || local28 == 912 || local28 == 603) {
						local377 = this.method126(local23, 0, false, 0, 0, 0, 0, this.aClass1_Sub1_Sub3_Sub2_1.anIntArray214[0], this.aClass1_Sub1_Sub3_Sub2_1.anIntArray213[0], local18);
						if (!local377) {
							this.method126(local23, 0, false, 1, 1, 0, 0, this.aClass1_Sub1_Sub3_Sub2_1.anIntArray214[0], this.aClass1_Sub1_Sub3_Sub2_1.anIntArray213[0], local18);
						}
						this.anInt164 = super.anInt82;
						this.anInt165 = super.anInt83;
						this.anInt167 = 2;
						this.anInt166 = 0;
						if (local28 == 912) {
							this.aClass1_Sub3_Sub3_3.method371(160, 142);
						}
						if (local28 == 705) {
							this.aClass1_Sub3_Sub3_3.method371(160, 96);
						}
						if (local28 == 603) {
							this.aClass1_Sub3_Sub3_3.method371(160, 131);
						}
						if (local28 == 947) {
							this.aClass1_Sub3_Sub3_3.method371(160, 251);
						}
						if (local28 == 533) {
							this.aClass1_Sub3_Sub3_3.method371(160, 91);
						}
						this.aClass1_Sub3_Sub3_3.method373(local18 + this.anInt180);
						this.aClass1_Sub3_Sub3_3.method373(local23 + this.anInt181);
						this.aClass1_Sub3_Sub3_3.method373(local33);
					}
					if (local28 == 1585 || local28 == 1685) {
						@Pc(1291) Class41 local1291 = Class41.method522(local33);
						if (local1291.aByteArray14 == null) {
							local301 = "It's a " + local1291.aString28 + ".";
						} else {
							local301 = new String(local1291.aByteArray14);
						}
						this.method128(local301, 0, this.anInt179, "");
					}
					if (local28 == 638) {
						this.aClass1_Sub3_Sub3_3.method371(160, 167);
						this.aClass1_Sub3_Sub3_3.method373(local23);
						local49 = Class9.aClass9Array1[local23];
						if (local49.anIntArrayArray11 != null && local49.anIntArrayArray11[0][0] == 5) {
							local67 = local49.anIntArrayArray11[0][1];
							if (this.anIntArray41[local67] != local49.anIntArray109[0]) {
								this.anIntArray41[local67] = local49.anIntArray109[0];
								this.method91(local67);
								this.aBoolean44 = true;
							}
						}
					}
					if (local28 == 447) {
						this.method123(local23, local18, local33, 734, 16);
					}
					if (local28 == 458) {
						local49 = Class9.aClass9Array1[local23];
						this.anInt109 = 1;
						this.anInt110 = local23;
						this.anInt111 = local49.anInt295;
						this.anInt114 = 0;
						local301 = local49.aString18;
						if (local301.indexOf(" ") != -1) {
							local301 = local301.substring(0, local301.indexOf(" "));
						}
						local638 = local49.aString18;
						if (local638.indexOf(" ") != -1) {
							local638 = local638.substring(local638.indexOf(" ") + 1);
						}
						this.aString4 = local301 + " " + local49.aString19 + " " + local638;
						if (this.anInt111 == 16) {
							this.aBoolean44 = true;
							this.anInt202 = 3;
							this.aBoolean60 = true;
						}
					} else {
						if (local28 == 508) {
							local49 = Class9.aClass9Array1[local23];
							@Pc(1480) boolean local1480 = true;
							if (local49.anInt276 > 0) {
								local1480 = this.method121(local49, (byte) 3);
							}
							if (local1480) {
								this.aClass1_Sub3_Sub3_3.method371(160, 167);
								this.aClass1_Sub3_Sub3_3.method373(local23);
							}
						}
						if (local28 == 846) {
							this.method123(local23, local18, local33, 734, 171);
						}
						if (local28 == 946) {
							local150 = this.aClass1_Sub1_Sub3_Sub1Array1[local33];
							if (local150 != null) {
								this.method126(local150.anIntArray214[0], 0, false, 1, 1, 0, 0, this.aClass1_Sub1_Sub3_Sub2_1.anIntArray214[0], this.aClass1_Sub1_Sub3_Sub2_1.anIntArray213[0], local150.anIntArray213[0]);
								this.anInt164 = super.anInt82;
								this.anInt165 = super.anInt83;
								this.anInt167 = 2;
								this.anInt166 = 0;
								this.aClass1_Sub3_Sub3_3.method371(160, 213);
								this.aClass1_Sub3_Sub3_3.method373(local33);
								this.aClass1_Sub3_Sub3_3.method373(this.anInt110);
							}
						}
						if (local28 == 989) {
							local537 = this.aClass1_Sub1_Sub3_Sub2Array1[local33];
							if (local537 != null) {
								this.method126(local537.anIntArray214[0], 0, false, 1, 1, 0, 0, this.aClass1_Sub1_Sub3_Sub2_1.anIntArray214[0], this.aClass1_Sub1_Sub3_Sub2_1.anIntArray213[0], local537.anIntArray213[0]);
								this.anInt164 = super.anInt82;
								this.anInt165 = super.anInt83;
								this.anInt167 = 2;
								this.anInt166 = 0;
								this.aClass1_Sub3_Sub3_3.method371(160, 172);
								this.aClass1_Sub3_Sub3_3.method373(local33);
								this.aClass1_Sub3_Sub3_3.method373(this.anInt110);
							}
						}
						if (local28 == 933) {
							local537 = this.aClass1_Sub1_Sub3_Sub2Array1[local33];
							if (local537 != null) {
								this.method126(local537.anIntArray214[0], 0, false, 1, 1, 0, 0, this.aClass1_Sub1_Sub3_Sub2_1.anIntArray214[0], this.aClass1_Sub1_Sub3_Sub2_1.anIntArray213[0], local537.anIntArray213[0]);
								this.anInt164 = super.anInt82;
								this.anInt165 = super.anInt83;
								this.anInt167 = 2;
								this.anInt166 = 0;
								this.aClass1_Sub3_Sub3_3.method371(160, 10);
								this.aClass1_Sub3_Sub3_3.method373(local33);
								this.aClass1_Sub3_Sub3_3.method373(this.anInt117);
								this.aClass1_Sub3_Sub3_3.method373(this.anInt115);
								this.aClass1_Sub3_Sub3_3.method373(this.anInt116);
							}
						}
						this.anInt114 = 0;
						this.anInt109 = 0;
						if (arg0 != this.anInt113) {
							this.anInt161 = this.aClass1_Sub3_Sub3_1.method380();
						}
					}
				}
			}
		} catch (@Pc(1735) RuntimeException local1735) {
			signlink.reporterror("99469, " + arg0 + ", " + arg1 + ", " + local1735.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "t", descriptor = "(I)V")
	private void method113() {
		try {
			if (this.anInt123 > 1) {
				this.anInt123--;
			}
			for (@Pc(13) int local13 = 0; local13 < 5 && this.method79(); local13++) {
			}
			if (this.aBoolean41) {
				if (Class8.aBoolean66) {
					@Pc(33) Class1_Sub3_Sub3 local33 = Class8.method187();
					if (local33 != null) {
						this.aClass1_Sub3_Sub3_3.method371(160, 35);
						this.aClass1_Sub3_Sub3_3.method373(local33.anInt433);
						this.aClass1_Sub3_Sub3_3.method378(local33.aByteArray4, local33.anInt433);
						local33.method370();
					}
				}
				this.anInt162++;
				if (this.anInt162 > 750) {
					this.method87();
				}
				this.method169();
				this.method134();
				this.method93();
				this.method84();
				this.anInt124++;
				if (this.anInt167 != 0) {
					this.anInt166 += 20;
					if (this.anInt166 >= 400) {
						this.anInt167 = 0;
					}
				}
				if (this.anInt155 != 0) {
					this.anInt152++;
					if (this.anInt152 >= 15) {
						if (this.anInt155 == 2) {
							this.aBoolean44 = true;
						}
						if (this.anInt155 == 3) {
							this.aBoolean32 = true;
						}
						this.anInt155 = 0;
					}
				}
				@Pc(226) int local226;
				if (this.anInt139 != 0) {
					if (super.anInt79 > this.anInt140 + 5 || super.anInt79 < this.anInt140 - 5 || super.anInt80 > this.anInt141 + 5 || super.anInt80 < this.anInt141 - 5) {
						this.aBoolean39 = true;
					}
					if (super.anInt78 == 0) {
						if (this.anInt139 == 2) {
							this.aBoolean44 = true;
						}
						if (this.anInt139 == 3) {
							this.aBoolean32 = true;
						}
						this.anInt139 = 0;
						if (this.aBoolean39) {
							this.anInt92 = -1;
							this.method133();
							if (this.anInt92 == this.anInt137 && this.anInt91 != this.anInt138) {
								@Pc(220) Class9 local220 = Class9.aClass9Array1[this.anInt137];
								local226 = local220.anIntArray106[this.anInt91];
								local220.anIntArray106[this.anInt91] = local220.anIntArray106[this.anInt138];
								local220.anIntArray106[this.anInt138] = local226;
								@Pc(248) int local248 = local220.anIntArray107[this.anInt91];
								local220.anIntArray107[this.anInt91] = local220.anIntArray107[this.anInt138];
								local220.anIntArray107[this.anInt138] = local248;
								this.aClass1_Sub3_Sub3_3.method371(160, 61);
								this.aClass1_Sub3_Sub3_3.method373(this.anInt137);
								this.aClass1_Sub3_Sub3_3.method373(this.anInt138);
								this.aClass1_Sub3_Sub3_3.method373(this.anInt91);
							}
						} else if (this.anInt125 == 1 && this.anInt112 > 2) {
							this.method83();
						} else if (this.anInt112 > 0) {
							this.method112(this.anInt113, this.anInt112 - 1);
						}
						this.anInt152 = 10;
						super.anInt81 = 0;
					}
				}
				@Pc(321) int local321;
				if (Class30.anInt558 != -1) {
					local321 = Class30.anInt558;
					local226 = Class30.anInt559;
					@Pc(345) boolean local345 = this.method126(local226, 0, true, 0, 0, 0, 0, this.aClass1_Sub1_Sub3_Sub2_1.anIntArray214[0], this.aClass1_Sub1_Sub3_Sub2_1.anIntArray213[0], local321);
					Class30.anInt558 = -1;
					if (local345) {
						this.anInt164 = super.anInt82;
						this.anInt165 = super.anInt83;
						this.anInt167 = 1;
						this.anInt166 = 0;
					}
				}
				this.method154();
				this.method122(this.anInt144);
				this.method118();
				this.method117(962);
				if (super.anInt78 == 1 || super.anInt81 == 1) {
					this.anInt134++;
				}
				if (this.anInt232 == 2) {
					this.method105();
				}
				if (this.anInt232 == 2 && this.aBoolean38) {
					this.method116();
				}
				for (local321 = 0; local321 < 5; local321++) {
					@Pc(416) int local416 = this.anIntArray64[local321]++;
				}
				this.method85(206);
				super.anInt77++;
				if (super.anInt77 > 4500) {
					super.anInt77 -= 500;
					this.aClass1_Sub3_Sub3_3.method371(160, 126);
				}
				this.anInt225++;
				if (this.anInt225 > 500) {
					this.anInt225 = 0;
					local226 = (int) (Math.random() * 8.0D);
					if ((local226 & 0x1) == 1) {
						this.anInt205 += this.anInt206;
					}
					if ((local226 & 0x2) == 2) {
						this.anInt103 += this.anInt104;
					}
					if ((local226 & 0x4) == 4) {
						this.anInt191 += this.anInt192;
					}
				}
				if (this.anInt205 < -50) {
					this.anInt206 = 2;
				}
				if (this.anInt205 > 50) {
					this.anInt206 = -2;
				}
				if (this.anInt103 < -55) {
					this.anInt104 = 2;
				}
				if (this.anInt103 > 55) {
					this.anInt104 = -2;
				}
				if (this.anInt191 < -40) {
					this.anInt192 = 1;
				}
				if (this.anInt191 > 40) {
					this.anInt192 = -1;
				}
				this.anInt163++;
				if (this.anInt163 > 50) {
					this.aClass1_Sub3_Sub3_3.method371(160, 87);
				}
				try {
					if (this.aClass6_1 != null && this.aClass1_Sub3_Sub3_3.anInt433 > 0) {
						this.aClass6_1.method178(this.aClass1_Sub3_Sub3_3.aByteArray4, this.aClass1_Sub3_Sub3_3.anInt433);
						this.aClass1_Sub3_Sub3_3.anInt433 = 0;
						this.anInt163 = 0;
					}
				} catch (@Pc(585) IOException local585) {
					this.method87();
				} catch (@Pc(590) Exception local590) {
					this.method80(this.anInt173);
				}
			}
		} catch (@Pc(596) RuntimeException local596) {
			signlink.reporterror("17826, " + -595 + ", " + local596.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "u", descriptor = "(I)V")
	private void method114() {
		try {
			for (@Pc(12) Class1_Sub6 local12 = (Class1_Sub6) this.aClass25_5.method402(); local12 != null; local12 = (Class1_Sub6) this.aClass25_5.method404()) {
				@Pc(16) boolean local16 = false;
				local12.anInt501 += this.anInt124;
				if (local12.anInt500 == -1) {
					local12.anInt500 = 0;
					local16 = true;
				}
				label58: {
					do {
						do {
							if (local12.anInt501 <= local12.aClass13_2.anIntArray132[local12.anInt500]) {
								break label58;
							}
							local12.anInt501 -= local12.aClass13_2.anIntArray132[local12.anInt500] + 1;
							local12.anInt500++;
							local16 = true;
						} while (local12.anInt500 < local12.aClass13_2.anInt332);
						local12.anInt500 -= local12.aClass13_2.anInt333;
					} while (local12.anInt500 >= 0 && local12.anInt500 < local12.aClass13_2.anInt332);
					local12.method512();
					local16 = false;
				}
				if (local16) {
					@Pc(98) int local98 = local12.anInt495;
					@Pc(101) int local101 = local12.anInt497;
					@Pc(104) int local104 = local12.anInt498;
					@Pc(106) int local106 = 0;
					if (local12.anInt496 == 0) {
						local106 = this.aClass30_1.method437(local98, local101, local104);
					}
					if (local12.anInt496 == 1) {
						local106 = this.aClass30_1.method438(local101, local104, this.anInt176, local98);
					}
					if (local12.anInt496 == 2) {
						local106 = this.aClass30_1.method439(local98, local101, local104);
					}
					if (local106 != 0 && (local106 >> 14 & 0x7FFF) == local12.anInt499) {
						@Pc(163) int local163 = this.anIntArrayArrayArray3[local98][local101][local104];
						@Pc(174) int local174 = this.anIntArrayArrayArray3[local98][local101 + 1][local104];
						@Pc(187) int local187 = this.anIntArrayArrayArray3[local98][local101 + 1][local104 + 1];
						@Pc(198) int local198 = this.anIntArrayArrayArray3[local98][local101][local104 + 1];
						@Pc(202) Class39 local202 = Class39.method496(local12.anInt499);
						@Pc(204) int local204 = -1;
						if (local12.anInt500 != -1) {
							local204 = local12.aClass13_2.anIntArray130[local12.anInt500];
						}
						@Pc(227) int local227;
						@Pc(231) int local231;
						@Pc(235) int local235;
						@Pc(245) Class1_Sub3_Sub1 local245;
						if (local12.anInt496 == 2) {
							local227 = this.aClass30_1.method441(local98, local101, local104, local106);
							local231 = local227 & 0x1F;
							local235 = local227 >> 6;
							local245 = local202.method499(local231, local235, local163, local174, local187, local198, local204);
							this.aClass30_1.method429(local245, 959, local104, local101, local98);
						} else if (local12.anInt496 == 1) {
							@Pc(269) Class1_Sub3_Sub1 local269 = local202.method499(4, 0, local163, local174, local187, local198, local204);
							this.aClass30_1.method430(local101, local104, local269, local98);
						} else if (local12.anInt496 == 0) {
							local227 = this.aClass30_1.method441(local98, local101, local104, local106);
							local231 = local227 & 0x1F;
							local235 = local227 >> 6;
							local245 = local202.method499(local231, local235, local163, local174, local187, local198, local204);
							this.aClass30_1.method431(local245, this.aByte12, local98, local104, local101);
						}
					} else {
						local12.method512();
					}
				}
			}
		} catch (@Pc(327) RuntimeException local327) {
			signlink.reporterror("38432, " + 7 + ", " + local327.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "v", descriptor = "(I)V")
	private void method116() {
		try {
			@Pc(12) int local12 = this.anInt185 * 128 + 64;
			@Pc(19) int local19 = this.anInt186 * 128 + 64;
			@Pc(32) int local32 = this.method68(this.anInt185, this.anInt186, this.anInt119, (byte) 9) - this.anInt187;
			if (this.anInt209 < local12) {
				this.anInt209 += this.anInt188 + (local12 - this.anInt209) * this.anInt189 / 1000;
				if (this.anInt209 > local12) {
					this.anInt209 = local12;
				}
			}
			if (this.anInt209 > local12) {
				this.anInt209 -= this.anInt188 + (this.anInt209 - local12) * this.anInt189 / 1000;
				if (this.anInt209 < local12) {
					this.anInt209 = local12;
				}
			}
			if (this.anInt210 < local32) {
				this.anInt210 += this.anInt188 + (local32 - this.anInt210) * this.anInt189 / 1000;
				if (this.anInt210 > local32) {
					this.anInt210 = local32;
				}
			}
			if (this.anInt210 > local32) {
				this.anInt210 -= this.anInt188 + (this.anInt210 - local32) * this.anInt189 / 1000;
				if (this.anInt210 < local32) {
					this.anInt210 = local32;
				}
			}
			if (this.anInt211 < local19) {
				this.anInt211 += this.anInt188 + (local19 - this.anInt211) * this.anInt189 / 1000;
				if (this.anInt211 > local19) {
					this.anInt211 = local19;
				}
			}
			if (this.anInt211 > local19) {
				this.anInt211 -= this.anInt188 + (this.anInt211 - local19) * this.anInt189 / 1000;
				if (this.anInt211 < local19) {
					this.anInt211 = local19;
				}
			}
			local12 = this.anInt147 * 128 + 64;
			local19 = this.anInt148 * 128 + 64;
			local32 = this.method68(this.anInt147, this.anInt148, this.anInt119, (byte) 9) - this.anInt149;
			@Pc(232) int local232 = local12 - this.anInt209;
			@Pc(237) int local237 = local32 - this.anInt210;
			@Pc(242) int local242 = local19 - this.anInt211;
			@Pc(253) int local253 = (int) Math.sqrt((double) (local232 * local232 + local242 * local242));
			@Pc(264) int local264 = (int) (Math.atan2((double) local237, (double) local253) * 325.949D) & 0x7FF;
			@Pc(275) int local275 = (int) (Math.atan2((double) local232, (double) local242) * -325.949D) & 0x7FF;
			if (local264 < 128) {
				local264 = 128;
			}
			if (local264 > 383) {
				local264 = 383;
			}
			if (this.anInt212 < local264) {
				this.anInt212 += this.anInt150 + (local264 - this.anInt212) * this.anInt151 / 1000;
				if (this.anInt212 > local264) {
					this.anInt212 = local264;
				}
			}
			if (this.anInt212 > local264) {
				this.anInt212 -= this.anInt150 + (this.anInt212 - local264) * this.anInt151 / 1000;
				if (this.anInt212 < local264) {
					this.anInt212 = local264;
				}
			}
			@Pc(346) int local346 = local275 - this.anInt213;
			if (local346 > 1024) {
				local346 -= 2048;
			}
			if (local346 < -1024) {
				local346 += 2048;
			}
			if (local346 > 0) {
				this.anInt213 += this.anInt150 + local346 * this.anInt151 / 1000;
			}
			if (local346 < 0) {
				this.anInt213 -= this.anInt150 + -local346 * this.anInt151 / 1000;
			}
			@Pc(392) int local392 = local275 - this.anInt213;
			if (local392 > 1024) {
				local392 -= 2048;
			}
			if (local392 < -1024) {
				local392 += 2048;
			}
			if (local392 < 0 && local346 > 0 || local392 > 0 && local346 < 0) {
				this.anInt213 = local275;
			}
		} catch (@Pc(413) RuntimeException local413) {
			signlink.reporterror("25911, " + 1 + ", " + local413.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "w", descriptor = "(I)V")
	private void method117(@OriginalArg(0) int arg0) {
		try {
			@Pc(3) boolean local3 = false;
			if (super.anInt81 == 1) {
				if (super.anInt82 >= 8 && super.anInt82 <= 108 && super.anInt83 >= 490 && super.anInt83 <= 522) {
					this.anInt234 = (this.anInt234 + 1) % 3;
					this.aBoolean33 = true;
					this.aBoolean32 = true;
					this.aClass1_Sub3_Sub3_3.method371(160, 227);
					this.aClass1_Sub3_Sub3_3.method372(this.anInt234);
					this.aClass1_Sub3_Sub3_3.method372(this.anInt133);
					this.aClass1_Sub3_Sub3_3.method372(this.anInt169);
				}
				if (super.anInt82 >= 137 && super.anInt82 <= 237 && super.anInt83 >= 490 && super.anInt83 <= 522) {
					this.anInt133 = (this.anInt133 + 1) % 3;
					this.aBoolean33 = true;
					this.aBoolean32 = true;
					this.aClass1_Sub3_Sub3_3.method371(160, 227);
					this.aClass1_Sub3_Sub3_3.method372(this.anInt234);
					this.aClass1_Sub3_Sub3_3.method372(this.anInt133);
					this.aClass1_Sub3_Sub3_3.method372(this.anInt169);
				}
				if (super.anInt82 >= 275 && super.anInt82 <= 375 && super.anInt83 >= 490 && super.anInt83 <= 522) {
					this.anInt169 = (this.anInt169 + 1) % 3;
					this.aBoolean33 = true;
					this.aBoolean32 = true;
					this.aClass1_Sub3_Sub3_3.method371(160, 227);
					this.aClass1_Sub3_Sub3_3.method372(this.anInt234);
					this.aClass1_Sub3_Sub3_3.method372(this.anInt133);
					this.aClass1_Sub3_Sub3_3.method372(this.anInt169);
				}
				@Pc(174) boolean local174;
				if (super.anInt82 >= 416 && super.anInt82 <= 516 && super.anInt83 >= 490 && super.anInt83 <= 522) {
					local174 = true;
				} else {
					local174 = false;
				}
			}
		} catch (@Pc(179) RuntimeException local179) {
			signlink.reporterror("29923, " + arg0 + ", " + local179.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "x", descriptor = "(I)V")
	private void method118() {
		try {
			if (super.anInt81 == 1) {
				if (super.anInt82 >= 549 && super.anInt82 <= 583 && super.anInt83 >= 195 && super.anInt83 < 231) {
					this.aBoolean44 = true;
					this.anInt202 = 0;
					this.aBoolean60 = true;
				}
				if (super.anInt82 >= 579 && super.anInt82 <= 609 && super.anInt83 >= 194 && super.anInt83 < 231) {
					this.aBoolean44 = true;
					this.anInt202 = 1;
					this.aBoolean60 = true;
				}
				if (super.anInt82 >= 607 && super.anInt82 <= 637 && super.anInt83 >= 194 && super.anInt83 < 231) {
					this.aBoolean44 = true;
					this.anInt202 = 2;
					this.aBoolean60 = true;
				}
				if (super.anInt82 >= 635 && super.anInt82 <= 679 && super.anInt83 >= 194 && super.anInt83 < 229) {
					this.aBoolean44 = true;
					this.anInt202 = 3;
					this.aBoolean60 = true;
				}
				if (super.anInt82 >= 676 && super.anInt82 <= 706 && super.anInt83 >= 194 && super.anInt83 < 231) {
					this.aBoolean44 = true;
					this.anInt202 = 4;
					this.aBoolean60 = true;
				}
				if (super.anInt82 >= 704 && super.anInt82 <= 734 && super.anInt83 >= 194 && super.anInt83 < 231) {
					this.aBoolean44 = true;
					this.anInt202 = 5;
					this.aBoolean60 = true;
				}
				if (super.anInt82 >= 732 && super.anInt82 <= 766 && super.anInt83 >= 195 && super.anInt83 < 231) {
					this.aBoolean44 = true;
					this.anInt202 = 6;
					this.aBoolean60 = true;
				}
				if (super.anInt82 >= 582 && super.anInt82 <= 612 && super.anInt83 >= 492 && super.anInt83 < 529) {
					this.aBoolean44 = true;
					this.anInt202 = 8;
					this.aBoolean60 = true;
				}
				if (super.anInt82 >= 609 && super.anInt82 <= 639 && super.anInt83 >= 492 && super.anInt83 < 529) {
					this.aBoolean44 = true;
					this.anInt202 = 9;
					this.aBoolean60 = true;
				}
				if (super.anInt82 >= 637 && super.anInt82 <= 681 && super.anInt83 >= 493 && super.anInt83 < 528) {
					this.aBoolean44 = true;
					this.anInt202 = 10;
					this.aBoolean60 = true;
				}
				if (super.anInt82 >= 679 && super.anInt82 <= 709 && super.anInt83 >= 492 && super.anInt83 < 529) {
					this.aBoolean44 = true;
					this.anInt202 = 11;
					this.aBoolean60 = true;
				}
				if (super.anInt82 >= 706 && super.anInt82 <= 736 && super.anInt83 >= 492 && super.anInt83 < 529) {
					this.aBoolean44 = true;
					this.anInt202 = 12;
					this.aBoolean60 = true;
					return;
				}
			}
		} catch (@Pc(311) RuntimeException local311) {
			signlink.reporterror("77430, " + 7 + ", " + local311.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(Lclient!kb;II)V")
	private void method119(@OriginalArg(0) Class1_Sub3_Sub3 arg0, @OriginalArg(2) int arg1) {
		try {
			for (@Pc(1) int local1 = 0; local1 < this.anInt129; local1++) {
				@Pc(8) int local8 = this.anIntArray26[local1];
				@Pc(13) Class1_Sub1_Sub3_Sub2 local13 = this.aClass1_Sub1_Sub3_Sub2Array1[local8];
				@Pc(16) int local16 = arg0.method380();
				if ((local16 & 0x80) == 128) {
					local16 += arg0.method380() << 8;
				}
				this.method107(local13, (byte) 2, local8, arg0, local16);
			}
		} catch (@Pc(53) RuntimeException local53) {
			signlink.reporterror("9981, " + arg0 + ", " + 7 + ", " + arg1 + ", " + local53.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(BLclient!ec;)V")
	private void method120(@OriginalArg(1) Class9 arg0) {
		try {
			@Pc(4) int local4 = arg0.anInt276;
			if (local4 >= 1 && local4 <= 100) {
				local4--;
				if (local4 >= this.anInt89) {
					arg0.aString16 = "";
					arg0.anInt275 = 0;
				} else {
					arg0.aString16 = this.aStringArray1[local4];
					arg0.anInt275 = 1;
					if (arg0.aString20 == null) {
						arg0.anInt275 = 0;
					}
				}
			} else if (local4 >= 101 && local4 <= 200) {
				local4 -= 101;
				if (local4 >= this.anInt89) {
					arg0.aString16 = "";
					arg0.anInt275 = 0;
				} else {
					if (this.anIntArray30[local4] == 0) {
						arg0.aString16 = "@red@Offline";
					} else if (this.anIntArray30[local4] == this.anInt118) {
						arg0.aString16 = "@gre@World-" + (this.anIntArray30[local4] - 9);
					} else {
						arg0.aString16 = "@yel@World-" + (this.anIntArray30[local4] - 9);
					}
					arg0.anInt275 = 1;
					if (arg0.aString20 == null) {
						arg0.anInt275 = 0;
					}
				}
			} else if (local4 == 203) {
				arg0.anInt282 = this.anInt89 * 15 + 20;
				if (arg0.anInt282 <= arg0.anInt278) {
					arg0.anInt282 = arg0.anInt278 + 1;
				}
			} else if (local4 >= 401 && local4 <= 500) {
				local4 -= 401;
				if (local4 >= this.anInt204) {
					arg0.aString16 = "";
					arg0.anInt275 = 0;
				} else {
					arg0.aString16 = Class37.method484(Class37.method482(this.aLongArray3[local4]));
				}
			} else if (local4 == 503) {
				arg0.anInt282 = this.anInt204 * 15 + 20;
				if (arg0.anInt282 <= arg0.anInt278) {
					arg0.anInt282 = arg0.anInt278 + 1;
				}
			} else if (local4 == 327) {
				arg0.anInt293 = 150;
				arg0.anInt294 = (int) (Math.sin((double) anInt132 / 40.0D) * 256.0D) & 0x7FF;
				if (this.aBoolean34) {
					this.aBoolean34 = false;
					@Pc(226) Class1_Sub3_Sub1[] local226 = new Class1_Sub3_Sub1[7];
					@Pc(228) int local228 = 0;
					for (@Pc(230) int local230 = 0; local230 < 7; local230++) {
						@Pc(237) int local237 = this.anIntArray54[local230];
						if (local237 >= 0) {
							local226[local228++] = Class7.aClass7Array1[local237].method183();
						}
					}
					@Pc(258) Class1_Sub3_Sub1 local258 = new Class1_Sub3_Sub1(false, local228, local226);
					for (@Pc(260) int local260 = 0; local260 < 5; local260++) {
						if (this.anIntArray32[local260] != 0) {
							local258.method213(anIntArrayArray6[local260][0], anIntArrayArray6[local260][this.anIntArray32[local260]]);
							if (local260 == 1) {
								local258.method213(anIntArray18[0], anIntArray18[this.anIntArray32[local260]]);
							}
						}
					}
					local258.method206();
					local258.method207(Class13.aClass13Array1[this.aClass1_Sub1_Sub3_Sub2_1.anInt747].anIntArray130[0]);
					local258.method216(64, 850, -30, -50, -30, true);
					arg0.aClass1_Sub3_Sub1_1 = local258;
				}
			} else if (local4 == 324) {
				if (this.aClass1_Sub3_Sub2_Sub2_7 == null) {
					this.aClass1_Sub3_Sub2_Sub2_7 = arg0.aClass1_Sub3_Sub2_Sub2_11;
					this.aClass1_Sub3_Sub2_Sub2_8 = arg0.aClass1_Sub3_Sub2_Sub2_12;
				}
				if (this.aBoolean57) {
					arg0.aClass1_Sub3_Sub2_Sub2_11 = this.aClass1_Sub3_Sub2_Sub2_8;
				} else {
					arg0.aClass1_Sub3_Sub2_Sub2_11 = this.aClass1_Sub3_Sub2_Sub2_7;
				}
			} else if (local4 == 325) {
				if (this.aClass1_Sub3_Sub2_Sub2_7 == null) {
					this.aClass1_Sub3_Sub2_Sub2_7 = arg0.aClass1_Sub3_Sub2_Sub2_11;
					this.aClass1_Sub3_Sub2_Sub2_8 = arg0.aClass1_Sub3_Sub2_Sub2_12;
				}
				if (this.aBoolean57) {
					arg0.aClass1_Sub3_Sub2_Sub2_11 = this.aClass1_Sub3_Sub2_Sub2_7;
				} else {
					arg0.aClass1_Sub3_Sub2_Sub2_11 = this.aClass1_Sub3_Sub2_Sub2_8;
				}
			}
		} catch (@Pc(381) RuntimeException local381) {
			signlink.reporterror("50878, " + 36 + ", " + arg0 + ", " + local381.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
	@Override
	public String getParameter(@OriginalArg(0) String arg0) {
		return signlink.mainapp == null ? super.getParameter(arg0) : signlink.mainapp.getParameter(arg0);
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!ec;B)Z")
	private boolean method121(@OriginalArg(0) Class9 arg0, @OriginalArg(1) byte arg1) {
		try {
			@Pc(6) boolean local6 = false;
			@Pc(18) int local18 = arg0.anInt276;
			if (local18 == 201) {
				this.aBoolean32 = true;
				this.aBoolean46 = false;
				this.aBoolean42 = true;
				this.aString11 = "";
				this.anInt233 = 1;
				this.aString3 = "Enter name of friend to add to list";
			}
			if (local18 == 202) {
				this.aBoolean32 = true;
				this.aBoolean46 = false;
				this.aBoolean42 = true;
				this.aString11 = "";
				this.anInt233 = 2;
				this.aString3 = "Enter name of friend to delete from list";
			}
			if (local18 >= 1 && local18 <= 200) {
				if (local18 >= 101) {
					local18 -= 101;
				} else {
					local18--;
				}
				if (this.anIntArray30[local18] > 0) {
					this.aBoolean32 = true;
					this.aBoolean46 = false;
					this.aBoolean42 = true;
					this.aString11 = "";
					this.anInt233 = 3;
					this.anInt90 = local18;
					this.aString3 = "Enter message to send to " + this.aStringArray1[local18];
				}
			}
			if (local18 == 501) {
				this.aBoolean32 = true;
				this.aBoolean46 = false;
				this.aBoolean42 = true;
				this.aString11 = "";
				this.anInt233 = 4;
				this.aString3 = "Enter name of player to add to list";
			}
			if (local18 == 502) {
				this.aBoolean32 = true;
				this.aBoolean46 = false;
				this.aBoolean42 = true;
				this.aString11 = "";
				this.anInt233 = 5;
				this.aString3 = "Enter name of player to delete from list";
			}
			@Pc(162) int local162;
			@Pc(166) int local166;
			@Pc(171) int local171;
			if (local18 >= 300 && local18 <= 313) {
				local162 = (local18 - 300) / 2;
				local166 = local18 & 0x1;
				local171 = this.anIntArray54[local162];
				if (local171 != -1) {
					while (true) {
						if (local166 == 0) {
							local171--;
							if (local171 < 0) {
								local171 = Class7.anInt240 - 1;
							}
						}
						if (local166 == 1) {
							local171++;
							if (local171 >= Class7.anInt240) {
								local171 = 0;
							}
						}
						if (Class7.aClass7Array1[local171].anInt241 == local162 + (this.aBoolean57 ? 0 : 7)) {
							this.anIntArray54[local162] = local171;
							this.aBoolean34 = true;
							break;
						}
					}
				}
			}
			if (local18 >= 314 && local18 <= 323) {
				local162 = (local18 - 314) / 2;
				local166 = local18 & 0x1;
				local171 = this.anIntArray32[local162];
				if (local166 == 0) {
					local171--;
					if (local171 < 0) {
						local171 = anIntArrayArray6[local162].length - 1;
					}
				}
				if (local166 == 1) {
					local171++;
					if (local171 >= anIntArrayArray6[local162].length) {
						local171 = 0;
					}
				}
				this.anIntArray32[local162] = local171;
				this.aBoolean34 = true;
			}
			if (local18 == 324 && !this.aBoolean57) {
				this.aBoolean57 = true;
				this.method95();
			}
			if (local18 == 325 && this.aBoolean57) {
				this.aBoolean57 = false;
				this.method95();
			}
			if (local18 != 326) {
				return false;
			}
			this.aClass1_Sub3_Sub3_3.method371(160, 134);
			this.aClass1_Sub3_Sub3_3.method372(this.aBoolean57 ? 0 : 1);
			for (local162 = 0; local162 < 7; local162++) {
				this.aClass1_Sub3_Sub3_3.method372(this.anIntArray54[local162]);
			}
			for (local166 = 0; local166 < 5; local166++) {
				this.aClass1_Sub3_Sub3_3.method372(this.anIntArray32[local166]);
			}
			return true;
		} catch (@Pc(343) RuntimeException local343) {
			signlink.reporterror("68513, " + arg0 + ", " + arg1 + ", " + local343.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(B)V")
	@Override
	protected void method60() {
		try {
			if (!this.aBoolean58 && !this.aBoolean50 && !this.aBoolean56) {
				anInt132++;
				if (this.aBoolean41) {
					this.method113();
				} else {
					this.method108();
				}
			}
		} catch (@Pc(34) RuntimeException local34) {
			signlink.reporterror("86467, " + 3 + ", " + local34.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "y", descriptor = "(I)V")
	private void method122(@OriginalArg(0) int arg0) {
		try {
			if (arg0 != 42788) {
				this.method59();
			}
			if (super.anInt81 == 1) {
				@Pc(15) int local15 = super.anInt82 - 21 - 561;
				@Pc(22) int local22 = super.anInt83 - 9 - 5;
				if (local15 >= 0 && local22 >= 0 && local15 < 146 && local22 < 151) {
					local15 -= 73;
					local22 -= 75;
					@Pc(39) int local39 = Class1_Sub3_Sub2_Sub1.anIntArray124[this.anInt215];
					@Pc(44) int local44 = Class1_Sub3_Sub2_Sub1.anIntArray125[this.anInt215];
					@Pc(54) int local54 = local22 * local39 + local15 * local44 >> 11;
					@Pc(64) int local64 = local22 * local44 - local15 * local39 >> 11;
					@Pc(72) int local72 = this.aClass1_Sub1_Sub3_Sub2_1.anInt742 + local54 >> 7;
					@Pc(80) int local80 = this.aClass1_Sub1_Sub3_Sub2_1.anInt743 - local64 >> 7;
					this.method126(local80, 0, true, 0, 0, 0, 0, this.aClass1_Sub1_Sub3_Sub2_1.anIntArray214[0], this.aClass1_Sub1_Sub3_Sub2_1.anIntArray213[0], local72);
					return;
				}
			}
		} catch (@Pc(104) RuntimeException local104) {
			signlink.reporterror("3689, " + arg0 + ", " + local104.toString());
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
				return new URL("http://" + this.aString15 + ":" + (this.anInt208 + 80));
			}
		} catch (@Pc(27) Exception local27) {
		}
		return super.getCodeBase();
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIII)Z")
	private boolean method123(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		try {
			@Pc(5) boolean local5 = false;
			@Pc(11) int local11 = arg2 >> 14 & 0x7FFF;
			@Pc(20) int local20 = this.aClass30_1.method441(this.anInt119, arg1, arg0, arg2);
			if (local20 == -1) {
				return false;
			}
			@Pc(29) int local29 = local20 & 0x1F;
			@Pc(35) int local35 = local20 >> 6 & 0x3;
			if (local29 == 10 || local29 == 11 || local29 == 22) {
				@Pc(47) Class39 local47 = Class39.method496(local11);
				@Pc(55) int local55;
				@Pc(58) int local58;
				if (local35 == 0 || local35 == 2) {
					local55 = local47.anInt664;
					local58 = local47.anInt665;
				} else {
					local55 = local47.anInt665;
					local58 = local47.anInt664;
				}
				@Pc(69) int local69 = local47.anInt676;
				if (local35 != 0) {
					local69 = (local69 << local35 & 0xF) + (local69 >> 4 - local35);
				}
				this.method126(arg0, 0, false, local58, local55, local69, 0, this.aClass1_Sub1_Sub3_Sub2_1.anIntArray214[0], this.aClass1_Sub1_Sub3_Sub2_1.anIntArray213[0], arg1);
			} else {
				this.method126(arg0, local29 + 1, false, 0, 0, 0, local35, this.aClass1_Sub1_Sub3_Sub2_1.anIntArray214[0], this.aClass1_Sub1_Sub3_Sub2_1.anIntArray213[0], arg1);
			}
			this.anInt164 = super.anInt82;
			this.anInt165 = super.anInt83;
			this.anInt167 = 2;
			this.anInt166 = 0;
			this.aClass1_Sub3_Sub3_3.method371(160, arg4);
			this.aClass1_Sub3_Sub3_3.method373(arg1 + this.anInt180);
			this.aClass1_Sub3_Sub3_3.method373(arg0 + this.anInt181);
			this.aClass1_Sub3_Sub3_3.method373(local11);
			return true;
		} catch (@Pc(171) RuntimeException local171) {
			signlink.reporterror("12938, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local171.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "z", descriptor = "(I)I")
	private int method124() {
		try {
			return 0;
		} catch (@Pc(9) RuntimeException local9) {
			signlink.reporterror("61717, " + -31414 + ", " + local9.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILjava/lang/String;)Z")
	private boolean method125(@OriginalArg(1) String arg0) {
		try {
			if (arg0 == null) {
				return false;
			}
			for (@Pc(5) int local5 = 0; local5 < this.anInt89; local5++) {
				if (arg0.equalsIgnoreCase(this.aStringArray1[local5])) {
					return true;
				}
			}
			return arg0.equalsIgnoreCase(this.aClass1_Sub1_Sub3_Sub2_1.aString27);
		} catch (@Pc(44) RuntimeException local44) {
			signlink.reporterror("96258, " + 7 + ", " + arg0 + ", " + local44.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IZIZIIIIIII)Z")
	private boolean method126(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		try {
			@Pc(11) int local11;
			for (@Pc(7) int local7 = 0; local7 < 104; local7++) {
				for (local11 = 0; local11 < 104; local11++) {
					this.anIntArrayArray3[local7][local11] = 0;
					this.anIntArrayArray5[local7][local11] = 99999999;
				}
			}
			local11 = arg8;
			@Pc(39) int local39 = arg7;
			this.anIntArrayArray3[arg8][arg7] = 99;
			this.anIntArrayArray5[arg8][arg7] = 0;
			@Pc(55) byte local55 = 0;
			@Pc(57) int local57 = 0;
			this.anIntArray23[0] = arg8;
			this.aBoolean41 &= true;
			@Pc(72) int local72 = local55 + 1;
			this.anIntArray24[0] = arg7;
			@Pc(76) boolean local76 = false;
			@Pc(80) int local80 = this.anIntArray23.length;
			@Pc(87) int[][] local87 = this.aClass3Array1[this.anInt119].anIntArrayArray1;
			@Pc(199) int local199;
			while (local57 != local72) {
				local11 = this.anIntArray23[local57];
				local39 = this.anIntArray24[local57];
				local57 = (local57 + 1) % local80;
				if (local11 == arg9 && local39 == arg0) {
					local76 = true;
					break;
				}
				if (arg1 != 0) {
					if ((arg1 < 5 || arg1 == 10) && this.aClass3Array1[this.anInt119].method33(local39, arg1 - 1, arg6, arg0, arg9, local11)) {
						local76 = true;
						break;
					}
					if (arg1 < 10 && this.aClass3Array1[this.anInt119].method34(arg9, local39, local11, arg1 - 1, arg0, arg6)) {
						local76 = true;
						break;
					}
				}
				if (arg4 != 0 && arg3 != 0 && this.aClass3Array1[this.anInt119].method35(arg5, this.anInt159, arg4, arg0, arg3, arg9, local11, local39)) {
					local76 = true;
					break;
				}
				local199 = this.anIntArrayArray5[local11][local39] + 1;
				if (local11 > 0 && this.anIntArrayArray3[local11 - 1][local39] == 0 && (local87[local11 - 1][local39] & 0x280108) == 0) {
					this.anIntArray23[local72] = local11 - 1;
					this.anIntArray24[local72] = local39;
					local72 = (local72 + 1) % local80;
					this.anIntArrayArray3[local11 - 1][local39] = 2;
					this.anIntArrayArray5[local11 - 1][local39] = local199;
				}
				if (local11 < 103 && this.anIntArrayArray3[local11 + 1][local39] == 0 && (local87[local11 + 1][local39] & 0x280180) == 0) {
					this.anIntArray23[local72] = local11 + 1;
					this.anIntArray24[local72] = local39;
					local72 = (local72 + 1) % local80;
					this.anIntArrayArray3[local11 + 1][local39] = 8;
					this.anIntArrayArray5[local11 + 1][local39] = local199;
				}
				if (local39 > 0 && this.anIntArrayArray3[local11][local39 - 1] == 0 && (local87[local11][local39 - 1] & 0x280102) == 0) {
					this.anIntArray23[local72] = local11;
					this.anIntArray24[local72] = local39 - 1;
					local72 = (local72 + 1) % local80;
					this.anIntArrayArray3[local11][local39 - 1] = 1;
					this.anIntArrayArray5[local11][local39 - 1] = local199;
				}
				if (local39 < 103 && this.anIntArrayArray3[local11][local39 + 1] == 0 && (local87[local11][local39 + 1] & 0x280120) == 0) {
					this.anIntArray23[local72] = local11;
					this.anIntArray24[local72] = local39 + 1;
					local72 = (local72 + 1) % local80;
					this.anIntArrayArray3[local11][local39 + 1] = 4;
					this.anIntArrayArray5[local11][local39 + 1] = local199;
				}
				if (local11 > 0 && local39 > 0 && this.anIntArrayArray3[local11 - 1][local39 - 1] == 0 && (local87[local11 - 1][local39 - 1] & 0x28010E) == 0 && (local87[local11 - 1][local39] & 0x280108) == 0 && (local87[local11][local39 - 1] & 0x280102) == 0) {
					this.anIntArray23[local72] = local11 - 1;
					this.anIntArray24[local72] = local39 - 1;
					local72 = (local72 + 1) % local80;
					this.anIntArrayArray3[local11 - 1][local39 - 1] = 3;
					this.anIntArrayArray5[local11 - 1][local39 - 1] = local199;
				}
				if (local11 < 103 && local39 > 0 && this.anIntArrayArray3[local11 + 1][local39 - 1] == 0 && (local87[local11 + 1][local39 - 1] & 0x280183) == 0 && (local87[local11 + 1][local39] & 0x280180) == 0 && (local87[local11][local39 - 1] & 0x280102) == 0) {
					this.anIntArray23[local72] = local11 + 1;
					this.anIntArray24[local72] = local39 - 1;
					local72 = (local72 + 1) % local80;
					this.anIntArrayArray3[local11 + 1][local39 - 1] = 9;
					this.anIntArrayArray5[local11 + 1][local39 - 1] = local199;
				}
				if (local11 > 0 && local39 < 103 && this.anIntArrayArray3[local11 - 1][local39 + 1] == 0 && (local87[local11 - 1][local39 + 1] & 0x280138) == 0 && (local87[local11 - 1][local39] & 0x280108) == 0 && (local87[local11][local39 + 1] & 0x280120) == 0) {
					this.anIntArray23[local72] = local11 - 1;
					this.anIntArray24[local72] = local39 + 1;
					local72 = (local72 + 1) % local80;
					this.anIntArrayArray3[local11 - 1][local39 + 1] = 6;
					this.anIntArrayArray5[local11 - 1][local39 + 1] = local199;
				}
				if (local11 < 103 && local39 < 103 && this.anIntArrayArray3[local11 + 1][local39 + 1] == 0 && (local87[local11 + 1][local39 + 1] & 0x2801E0) == 0 && (local87[local11 + 1][local39] & 0x280180) == 0 && (local87[local11][local39 + 1] & 0x280120) == 0) {
					this.anIntArray23[local72] = local11 + 1;
					this.anIntArray24[local72] = local39 + 1;
					local72 = (local72 + 1) % local80;
					this.anIntArrayArray3[local11 + 1][local39 + 1] = 12;
					this.anIntArrayArray5[local11 + 1][local39 + 1] = local199;
				}
			}
			@Pc(812) int local812;
			@Pc(818) int local818;
			@Pc(824) int local824;
			if (!local76) {
				if (arg2) {
					local199 = 100;
					for (local812 = 1; local812 < 2; local812++) {
						for (local818 = arg9 - local812; local818 <= arg9 + local812; local818++) {
							for (local824 = arg0 - local812; local824 <= arg0 + local812; local824++) {
								if (local818 >= 0 && local824 >= 0 && local818 < 104 && local824 < 104 && this.anIntArrayArray5[local818][local824] < local199) {
									local199 = this.anIntArrayArray5[local818][local824];
									local11 = local818;
									local39 = local824;
									local76 = true;
								}
							}
						}
						if (local76) {
							break;
						}
					}
				}
				if (!local76) {
					return false;
				}
			}
			@Pc(882) byte local882 = 0;
			this.anIntArray23[0] = local11;
			local57 = local882 + 1;
			this.anIntArray24[0] = local39;
			local199 = local812 = this.anIntArrayArray3[local11][local39];
			while (local11 != arg8 || local39 != arg7) {
				if (local199 != local812) {
					local812 = local199;
					this.anIntArray23[local57] = local11;
					this.anIntArray24[local57++] = local39;
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
				local199 = this.anIntArrayArray3[local11][local39];
			}
			if (local57 > 0) {
				local80 = local57;
				if (local57 > 25) {
					local80 = 25;
				}
				local57--;
				local818 = this.anIntArray23[local57];
				local824 = this.anIntArray24[local57];
				if (super.anIntArray15[5] == 1) {
					this.aClass1_Sub3_Sub3_3.method371(160, 230);
				} else {
					this.aClass1_Sub3_Sub3_3.method371(160, 204);
				}
				this.aClass1_Sub3_Sub3_3.method372(local80 + local80 + 2);
				this.aClass1_Sub3_Sub3_3.method373(local818 + this.anInt180);
				this.aClass1_Sub3_Sub3_3.method373(local824 + this.anInt181);
				for (@Pc(1019) int local1019 = 1; local1019 < local80; local1019++) {
					local57--;
					this.aClass1_Sub3_Sub3_3.method372(this.anIntArray23[local57] - local818);
					this.aClass1_Sub3_Sub3_3.method372(this.anIntArray24[local57] - local824);
				}
			}
			return true;
		} catch (@Pc(1047) RuntimeException local1047) {
			signlink.reporterror("35540, " + arg0 + ", " + true + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + local1047.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "i", descriptor = "(Z)V")
	private void method127() {
		try {
			this.method103();
			this.aClass29_9.method409();
			this.aClass1_Sub3_Sub2_Sub3_19.method307(0, this.anInt184, 0);
			@Pc(28) byte local28;
			@Pc(40) int local40;
			if (this.anInt207 == 0) {
				local28 = 20;
				this.aClass1_Sub3_Sub2_Sub4_3.method322(20, 180, 16776960, "Welcome to the RuneScape-2 BETA test.", true);
				local40 = local28 + 15;
				@Pc(41) int local41 = local40 + 15;
				this.aClass1_Sub3_Sub2_Sub4_1.method322(50, 180, 16777215, "Please note this test version of the game is provided for ", true);
				@Pc(53) int local53 = local41 + 15;
				this.aClass1_Sub3_Sub2_Sub4_1.method322(65, 180, 16777215, "testing/preview purposes only. As such please bear in mind that:", true);
				@Pc(65) int local65 = local53 + 15;
				@Pc(66) int local66 = local65 + 10;
				this.aClass1_Sub3_Sub2_Sub4_1.method322(90, 180, 16777215, "a) Everything you do/gain here will be forgotten when the beta ends.", true);
				@Pc(78) int local78 = local66 + 15;
				this.aClass1_Sub3_Sub2_Sub4_1.method322(105, 180, 16777215, "b) No customer support is available for the beta.", true);
				@Pc(90) int local90 = local78 + 15;
				this.aClass1_Sub3_Sub2_Sub4_1.method322(120, 180, 16777215, "c) The beta may be incomplete/buggy, we're still working on it.", true);
				@Pc(102) int local102 = local90 + 15;
				this.aClass1_Sub3_Sub2_Sub4_1.method322(135, 180, 16777215, "d) The beta may be totally unavailable at times.", true);
				@Pc(114) int local114 = local102 + 15;
				this.aClass1_Sub3_Sub2_Sub3_20.method307(145, this.anInt184, 107);
				this.aClass1_Sub3_Sub2_Sub4_3.method322(170, 180, 16777215, "Click here to login.", true);
			}
			if (this.anInt207 == 1 || this.anInt207 == 2) {
				local28 = 50;
				if (this.aString13.length() > 0) {
					this.aClass1_Sub3_Sub2_Sub4_3.method322(35, 180, 16776960, this.aString13, true);
					this.aClass1_Sub3_Sub2_Sub4_3.method322(50, 180, 16776960, this.aString14, true);
					local40 = local28 + 30;
				} else {
					this.aClass1_Sub3_Sub2_Sub4_3.method322(43, 180, 16776960, this.aString14, true);
					local40 = local28 + 30;
				}
				this.aClass1_Sub3_Sub2_Sub4_3.method326(true, 90, 16777215, 80, "Username: " + this.aString6 + (this.anInt190 == 0 & anInt132 % 40 < 20 ? "@yel@|" : ""));
				local40 += 15;
				this.aClass1_Sub3_Sub2_Sub4_3.method326(true, 92, 16777215, 95, "Password: " + Class37.method486((byte) 1, this.aString7) + (this.anInt190 == 1 & anInt132 % 40 < 20 ? "@yel@|" : ""));
				local40 += 15;
				if (this.anInt207 == 1) {
					this.aClass1_Sub3_Sub2_Sub4_3.method326(true, 37, 16777215, 110, "Confirm Password: " + Class37.method486((byte) 1, this.aString8) + (this.anInt190 == 2 & anInt132 % 40 < 20 ? "@yel@|" : ""));
				}
				this.aClass1_Sub3_Sub2_Sub3_20.method307(120, this.anInt184, 27);
				if (this.anInt207 == 1) {
					this.aClass1_Sub3_Sub2_Sub4_3.method322(145, 100, 16777215, "Create", true);
				} else {
					this.aClass1_Sub3_Sub2_Sub4_3.method322(145, 100, 16777215, "Login", true);
				}
				this.aClass1_Sub3_Sub2_Sub3_20.method307(120, this.anInt184, 187);
				this.aClass1_Sub3_Sub2_Sub4_3.method322(145, 260, 16777215, "Cancel", true);
			}
			this.aClass29_9.method410(214, super.aGraphics2, 186, this.aByte11);
			if (this.aBoolean37) {
				this.aBoolean37 = false;
				this.aClass29_7.method410(128, super.aGraphics2, 0, this.aByte11);
				this.aClass29_8.method410(214, super.aGraphics2, 386, this.aByte11);
				this.aClass29_12.method410(0, super.aGraphics2, 265, this.aByte11);
				this.aClass29_13.method410(574, super.aGraphics2, 265, this.aByte11);
				this.aClass29_14.method410(128, super.aGraphics2, 186, this.aByte11);
				this.aClass29_15.method410(574, super.aGraphics2, 186, this.aByte11);
			}
		} catch (@Pc(495) RuntimeException local495) {
			signlink.reporterror("50140, " + false + ", " + local495.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/String;IILjava/lang/String;)V")
	private void method128(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) String arg3) {
		try {
			if (this.anInt107 == -1) {
				this.aBoolean32 = true;
			}
			for (@Pc(8) int local8 = 99; local8 > 0; local8--) {
				this.anIntArray17[local8] = this.anIntArray17[local8 - 1];
				this.aStringArray4[local8] = this.aStringArray4[local8 - 1];
				this.aStringArray3[local8] = this.aStringArray3[local8 - 1];
			}
			this.anIntArray17[0] = arg1;
			this.aStringArray4[0] = arg3;
			this.aStringArray3[0] = arg0;
			if (arg2 < 2 || arg2 > 2) {
				anInt98 = this.aClass35_1.method475();
			}
		} catch (@Pc(70) RuntimeException local70) {
			signlink.reporterror("94480, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local70.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "A", descriptor = "(I)V")
	private void method129() {
		try {
			@Pc(2) int local2 = this.anInt94;
			@Pc(5) int local5 = this.anInt95;
			@Pc(8) int local8 = this.anInt96;
			@Pc(11) int local11 = this.anInt97;
			Class1_Sub3_Sub2.method317(6116423, this.anInt157, local11, local5, local8, local2);
			Class1_Sub3_Sub2.method317(0, this.anInt157, 16, local5 + 1, local8 - 2, local2 + 1);
			Class1_Sub3_Sub2.method318(0, local5 + 18, local8 - 2, local11 - 19, local2 + 1);
			this.aClass1_Sub3_Sub2_Sub4_3.method324("Choose Option", local2 + 3, 6116423, local5 + 14);
			@Pc(65) int local65 = super.anInt79;
			@Pc(68) int local68 = super.anInt80;
			if (this.anInt93 == 0) {
				local65 -= 8;
				local68 -= 11;
			}
			if (this.anInt93 == 1) {
				local65 -= 562;
				local68 -= 231;
			}
			for (@Pc(81) int local81 = 0; local81 < this.anInt112; local81++) {
				@Pc(96) int local96 = local5 + (this.anInt112 - 1 - local81) * 15 + 31;
				@Pc(98) int local98 = 16777215;
				if (local65 > local2 && local65 < local2 + local8 && local68 > local96 - 13 && local68 < local96 + 3) {
					local98 = 16776960;
				}
				this.aClass1_Sub3_Sub2_Sub4_3.method326(true, local2 + 3, local98, local96, this.aStringArray2[local81]);
			}
		} catch (@Pc(142) RuntimeException local142) {
			signlink.reporterror("81119, " + 9 + ", " + local142.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "B", descriptor = "(I)V")
	private void method130() {
		try {
			try {
				this.anInt194 = -1;
				this.aClass25_1.method406();
				this.aClass25_5.method406();
				this.aClass25_2.method406();
				this.aClass25_4.method406();
				Class1_Sub3_Sub2_Sub1.method254();
				this.method110(this.anInt226);
				this.aClass30_1.method413();
				for (@Pc(28) int local28 = 0; local28 < 4; local28++) {
					this.aClass3Array1[local28].method24();
				}
				System.gc();
				@Pc(52) Class4 local52 = new Class4(this.aByteArrayArrayArray7, 104, 104, this.anIntArrayArrayArray3, 362);
				@Pc(55) byte[] local55 = new byte[100000];
				@Pc(59) int local59 = this.aByteArrayArray2.length;
				Class4.aBoolean18 = Class30.aBoolean136;
				@Pc(72) int local72;
				@Pc(79) int local79;
				for (@Pc(63) int local63 = 0; local63 < local59; local63++) {
					local72 = this.anIntArray50[local63] >> 8;
					local79 = this.anIntArray50[local63] & 0xFF;
					if (local72 == 33 && local79 >= 71 && local79 <= 73) {
						Class4.aBoolean18 = false;
					}
				}
				if (aBoolean36) {
					this.aClass30_1.method414(this.anInt119);
				} else {
					this.aClass30_1.method414(0);
				}
				@Pc(151) int local151;
				for (local72 = 0; local72 < local59; local72++) {
					local79 = (this.anIntArray50[local72] >> 8) * 64 - this.anInt180;
					@Pc(137) int local137 = (this.anIntArray50[local72] & 0xFF) * 64 - this.anInt181;
					@Pc(142) byte[] local142 = this.aByteArrayArray2[local72];
					if (local142 != null) {
						local151 = (new Class1_Sub3_Sub3(local142, 4)).method385();
						Class31.method462(local55, local151, local142, local142.length - 4, 4);
						local52.method37(local137, (this.anInt105 - 6) * 8, (this.anInt106 - 6) * 8, local55, local79);
					} else if (this.anInt106 < 800) {
						local52.method36(695, local137, local79);
					}
				}
				@Pc(214) int local214;
				for (local79 = 0; local79 < local59; local79++) {
					@Pc(205) byte[] local205 = this.aByteArrayArray1[local79];
					if (local205 != null) {
						local214 = (new Class1_Sub3_Sub3(local205, 4)).method385();
						Class31.method462(local55, local214, local205, local205.length - 4, 4);
						local151 = (this.anIntArray50[local79] >> 8) * 64 - this.anInt180;
						@Pc(248) int local248 = (this.anIntArray50[local79] & 0xFF) * 64 - this.anInt181;
						local52.method38(local55, this.aClass30_1, this.aClass3Array1, local248, local151, this.aClass25_5);
					}
				}
				local52.method40(this.aClass30_1, this.aClass3Array1);
				this.aClass29_5.method409();
				for (@Pc(280) Class1_Sub6 local280 = (Class1_Sub6) this.aClass25_5.method402(); local280 != null; local280 = (Class1_Sub6) this.aClass25_5.method404()) {
					if ((this.aByteArrayArrayArray7[1][local280.anInt497][local280.anInt498] & 0x2) == 2) {
						local280.anInt495--;
						if (local280.anInt495 < 0) {
							local280.method512();
						}
					}
				}
				for (local214 = 0; local214 < 104; local214++) {
					for (local151 = 0; local151 < 104; local151++) {
						this.method69(local214, local151);
					}
				}
				for (@Pc(340) Class1_Sub4 local340 = (Class1_Sub4) this.aClass25_3.method402(); local340 != null; local340 = (Class1_Sub4) this.aClass25_3.method404()) {
					this.method165(local340.anInt454, local340.anInt460, local340.anInt457, local340.anInt456, local340.anInt455, local340.anInt458, local340.anInt459);
				}
			} catch (@Pc(369) Exception local369) {
			}
			Class39.aClass32_4.method472();
			System.gc();
			Class1_Sub3_Sub2_Sub1.method255((byte) 3);
		} catch (@Pc(380) RuntimeException local380) {
			signlink.reporterror("77381, " + ", " + local380.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "j", descriptor = "(Z)V")
	private void method131() {
		try {
			for (@Pc(1) int local1 = 0; local1 < this.anInt230; local1++) {
				@Pc(11) Class1_Sub1_Sub3_Sub1 local11 = this.aClass1_Sub1_Sub3_Sub1Array1[this.anIntArray63[local1]];
				@Pc(20) int local20 = (this.anIntArray63[local1] << 14) + 536870912;
				if (local11 != null && local11.method516()) {
					@Pc(31) int local31 = local11.anInt742 >> 7;
					@Pc(36) int local36 = local11.anInt743 >> 7;
					if (local31 >= 0 && local31 < 104 && local36 >= 0 && local36 < 104) {
						if (local11.anInt746 == 1 && (local11.anInt742 & 0x7F) == 64 && (local11.anInt743 & 0x7F) == 64) {
							if (this.anIntArrayArray4[local31][local36] == this.anInt142) {
								continue;
							}
							this.anIntArrayArray4[local31][local36] = this.anInt142;
						}
						this.aClass30_1.method424(null, this.method68(local11.anInt742, local11.anInt743, this.anInt119, (byte) 9), local11.anInt743, local11.anInt744, local11.anInt742, this.anInt119, local11.anInt745, local11, (local11.anInt746 - 1) * 64 + 60, local20);
					}
				}
			}
		} catch (@Pc(126) RuntimeException local126) {
			signlink.reporterror("40629, " + true + ", " + local126.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIBIII)V")
	private void method132(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		try {
			@Pc(5) int local5 = 2048 - arg1 & 0x7FF;
			@Pc(11) int local11 = 2048 - arg5 & 0x7FF;
			@Pc(13) int local13 = 0;
			@Pc(15) int local15 = 0;
			@Pc(17) int local17 = arg3;
			@Pc(27) int local27;
			@Pc(31) int local31;
			@Pc(41) int local41;
			if (local5 != 0) {
				local27 = Class1_Sub3_Sub1.anIntArray102[local5];
				local31 = Class1_Sub3_Sub1.anIntArray103[local5];
				local41 = local31 * 0 - arg3 * local27 >> 16;
				local17 = local27 * 0 + arg3 * local31 >> 16;
				local15 = local41;
			}
			if (local11 != 0) {
				local27 = Class1_Sub3_Sub1.anIntArray102[local11];
				local31 = Class1_Sub3_Sub1.anIntArray103[local11];
				local41 = local17 * local27 + local31 * 0 >> 16;
				local17 = local17 * local31 - local27 * 0 >> 16;
				local13 = local41;
			}
			this.anInt209 = arg4 - local13;
			this.anInt210 = arg0 - local15;
			this.anInt211 = arg2 - local17;
			this.anInt212 = arg1;
			this.anInt213 = arg5;
		} catch (@Pc(108) RuntimeException local108) {
			signlink.reporterror("2806, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 9 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local108.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "C", descriptor = "(I)V")
	private void method133() {
		try {
			if (this.anInt139 == 0) {
				this.aStringArray2[0] = "Cancel";
				this.anIntArray48[0] = 1005;
				this.anInt112 = 1;
				if (super.anInt79 > 8 && super.anInt80 > 11 && super.anInt79 < 520 && super.anInt80 < 345) {
					if (this.anInt229 == -1) {
						this.method72();
					} else {
						this.method111(0, 8, super.anInt79, Class9.aClass9Array1[this.anInt229], super.anInt80, 11);
					}
				}
				if (this.anInt170 != this.anInt156) {
					this.anInt156 = this.anInt170;
				}
				this.anInt170 = 0;
				if (super.anInt79 > 562 && super.anInt80 > 231 && super.anInt79 < 752 && super.anInt80 < 492) {
					if (this.anInt235 != -1) {
						this.method111(0, 562, super.anInt79, Class9.aClass9Array1[this.anInt235], super.anInt80, 231);
					} else if (this.anIntArray20[this.anInt202] != -1) {
						this.method111(0, 562, super.anInt79, Class9.aClass9Array1[this.anIntArray20[this.anInt202]], super.anInt80, 231);
					}
				}
				if (this.anInt170 != this.anInt221) {
					this.aBoolean44 = true;
					this.anInt221 = this.anInt170;
				}
				this.anInt170 = 0;
				if (super.anInt79 > 22 && super.anInt80 > 375 && super.anInt79 < 501 && super.anInt80 < 471 && this.anInt107 != -1) {
					this.method111(0, 22, super.anInt79, Class9.aClass9Array1[this.anInt107], super.anInt80, 375);
				}
				if (this.anInt107 != -1 && this.anInt170 != this.anInt146) {
					this.aBoolean32 = true;
					this.anInt146 = this.anInt170;
				}
				@Pc(196) boolean local196 = false;
				while (!local196) {
					local196 = true;
					for (@Pc(209) int local209 = 0; local209 < this.anInt112 - 1; local209++) {
						if (this.anIntArray48[local209] < 1000 && this.anIntArray48[local209 + 1] > 1000) {
							@Pc(230) String local230 = this.aStringArray2[local209];
							this.aStringArray2[local209] = this.aStringArray2[local209 + 1];
							this.aStringArray2[local209 + 1] = local230;
							@Pc(252) int local252 = this.anIntArray48[local209];
							this.anIntArray48[local209] = this.anIntArray48[local209 + 1];
							this.anIntArray48[local209 + 1] = local252;
							@Pc(274) int local274 = this.anIntArray46[local209];
							this.anIntArray46[local209] = this.anIntArray46[local209 + 1];
							this.anIntArray46[local209 + 1] = local274;
							@Pc(296) int local296 = this.anIntArray47[local209];
							this.anIntArray47[local209] = this.anIntArray47[local209 + 1];
							this.anIntArray47[local209 + 1] = local296;
							@Pc(318) int local318 = this.anIntArray49[local209];
							this.anIntArray49[local209] = this.anIntArray49[local209 + 1];
							this.anIntArray49[local209 + 1] = local318;
							local196 = false;
						}
					}
				}
			}
		} catch (@Pc(348) RuntimeException local348) {
			signlink.reporterror("85728, " + ", " + local348.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "k", descriptor = "(Z)V")
	private void method134() {
		try {
			for (@Pc(4) int local4 = 0; local4 < this.anInt230; local4++) {
				@Pc(11) int local11 = this.anIntArray63[local4];
				@Pc(16) Class1_Sub1_Sub3_Sub1 local16 = this.aClass1_Sub1_Sub3_Sub1Array1[local11];
				if (local16 != null) {
					this.method135(local16.aClass40_1.aByte28, local16);
				}
			}
		} catch (@Pc(32) RuntimeException local32) {
			signlink.reporterror("15057, " + false + ", " + local32.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ZILclient!x;)V")
	private void method135(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub1_Sub3 arg1) {
		try {
			if (arg1.anInt742 < 128 || arg1.anInt743 < 128 || arg1.anInt742 >= 13184 || arg1.anInt743 >= 13184) {
				arg1.anInt768 = -1;
				arg1.anInt773 = -1;
				arg1.anInt782 = 0;
				arg1.anInt783 = 0;
				arg1.anInt742 = arg1.anIntArray213[0] * 128 + arg1.anInt746 * 64;
				arg1.anInt743 = arg1.anIntArray214[0] * 128 + arg1.anInt746 * 64;
				arg1.anInt788 = 0;
			}
			if (arg1 == this.aClass1_Sub1_Sub3_Sub2_1 && (arg1.anInt742 < 1536 || arg1.anInt743 < 1536 || arg1.anInt742 >= 11776 || arg1.anInt743 >= 11776)) {
				arg1.anInt768 = -1;
				arg1.anInt773 = -1;
				arg1.anInt782 = 0;
				arg1.anInt783 = 0;
				arg1.anInt742 = arg1.anIntArray213[0] * 128 + arg1.anInt746 * 64;
				arg1.anInt743 = arg1.anIntArray214[0] * 128 + arg1.anInt746 * 64;
				arg1.anInt788 = 0;
			}
			if (arg1.anInt782 > anInt132) {
				this.method136(arg1);
			} else if (arg1.anInt783 >= anInt132) {
				this.method137(arg1);
			} else {
				this.method138(arg1);
			}
			this.method139(arg1);
			this.method140(arg1);
		} catch (@Pc(159) RuntimeException local159) {
			signlink.reporterror("3921, " + true + ", " + arg0 + ", " + arg1 + ", " + local159.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ZLclient!x;)V")
	private void method136(@OriginalArg(1) Class1_Sub1_Sub3 arg0) {
		try {
			@Pc(4) int local4 = arg0.anInt782 - anInt132;
			@Pc(14) int local14 = arg0.anInt778 * 128 + arg0.anInt746 * 64;
			@Pc(24) int local24 = arg0.anInt780 * 128 + arg0.anInt746 * 64;
			arg0.anInt742 += (local14 - arg0.anInt742) / local4;
			arg0.anInt743 += (local24 - arg0.anInt743) / local4;
			arg0.anInt789 = 0;
			if (arg0.anInt784 == 0) {
				arg0.anInt787 = 1024;
			}
			if (arg0.anInt784 == 1) {
				arg0.anInt787 = 1536;
			}
			if (arg0.anInt784 == 2) {
				arg0.anInt787 = 0;
			}
			if (arg0.anInt784 == 3) {
				arg0.anInt787 = 512;
			}
		} catch (@Pc(81) RuntimeException local81) {
			signlink.reporterror("5823, " + false + ", " + arg0 + ", " + local81.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!x;Z)V")
	private void method137(@OriginalArg(0) Class1_Sub1_Sub3 arg0) {
		try {
			if (arg0.anInt783 == anInt132 || arg0.anInt768 == -1 || arg0.anInt771 != 0 || arg0.anInt770 + 1 > Class13.aClass13Array1[arg0.anInt768].anIntArray132[arg0.anInt769]) {
				@Pc(29) int local29 = arg0.anInt783 - arg0.anInt782;
				@Pc(34) int local34 = anInt132 - arg0.anInt782;
				@Pc(44) int local44 = arg0.anInt778 * 128 + arg0.anInt746 * 64;
				@Pc(54) int local54 = arg0.anInt780 * 128 + arg0.anInt746 * 64;
				@Pc(64) int local64 = arg0.anInt779 * 128 + arg0.anInt746 * 64;
				@Pc(74) int local74 = arg0.anInt781 * 128 + arg0.anInt746 * 64;
				arg0.anInt742 = (local44 * (local29 - local34) + local64 * local34) / local29;
				arg0.anInt743 = (local54 * (local29 - local34) + local74 * local34) / local29;
			}
			arg0.anInt789 = 0;
			if (arg0.anInt784 == 0) {
				arg0.anInt787 = 1024;
			}
			if (arg0.anInt784 == 1) {
				arg0.anInt787 = 1536;
			}
			if (arg0.anInt784 == 2) {
				arg0.anInt787 = 0;
			}
			if (arg0.anInt784 == 3) {
				arg0.anInt787 = 512;
			}
			arg0.anInt744 = arg0.anInt787;
		} catch (@Pc(138) RuntimeException local138) {
			signlink.reporterror("80004, " + arg0 + ", " + false + ", " + local138.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILclient!x;)V")
	private void method138(@OriginalArg(1) Class1_Sub1_Sub3 arg0) {
		try {
			arg0.anInt765 = arg0.anInt747;
			if (arg0.anInt788 == 0) {
				arg0.anInt789 = 0;
			} else {
				if (arg0.anInt768 != -1 && arg0.anInt771 == 0) {
					@Pc(24) Class13 local24 = Class13.aClass13Array1[arg0.anInt768];
					if (local24.anIntArray133 == null) {
						arg0.anInt789++;
						return;
					}
				}
				@Pc(37) int local37 = arg0.anInt742;
				@Pc(40) int local40 = arg0.anInt743;
				@Pc(55) int local55 = arg0.anIntArray213[arg0.anInt788 - 1] * 128 + arg0.anInt746 * 64;
				@Pc(70) int local70 = arg0.anIntArray214[arg0.anInt788 - 1] * 128 + arg0.anInt746 * 64;
				if (local55 - local37 <= 256 && local55 - local37 >= -256 && local70 - local40 <= 256 && local70 - local40 >= -256) {
					if (local37 < local55) {
						if (local40 < local70) {
							arg0.anInt787 = 1280;
						} else if (local40 > local70) {
							arg0.anInt787 = 1792;
						} else {
							arg0.anInt787 = 1536;
						}
					} else if (local37 > local55) {
						if (local40 < local70) {
							arg0.anInt787 = 768;
						} else if (local40 > local70) {
							arg0.anInt787 = 256;
						} else {
							arg0.anInt787 = 512;
						}
					} else if (local40 < local70) {
						arg0.anInt787 = 1024;
					} else {
						arg0.anInt787 = 0;
					}
					@Pc(164) int local164 = arg0.anInt787 - arg0.anInt744 & 0x7FF;
					if (local164 > 1024) {
						local164 -= 2048;
					}
					@Pc(171) int local171 = arg0.anInt750;
					if (local164 >= -256 && local164 <= 256) {
						local171 = arg0.anInt749;
					} else if (local164 >= 256 && local164 < 768) {
						local171 = arg0.anInt752;
					} else if (local164 >= -768 && local164 <= -256) {
						local171 = arg0.anInt751;
					}
					if (local171 == -1) {
						local171 = arg0.anInt749;
					}
					arg0.anInt765 = local171;
					@Pc(219) int local219 = 4;
					if (arg0.anInt744 != arg0.anInt787 && arg0.anInt762 == -1) {
						local219 = 2;
					}
					if (arg0.anInt788 > 2) {
						local219 = 6;
					}
					if (arg0.anInt788 > 3) {
						local219 = 8;
					}
					if (arg0.anInt789 > 0 && arg0.anInt788 > 1) {
						local219 = 8;
						arg0.anInt789--;
					}
					if (arg0.aBooleanArray9[arg0.anInt788 - 1]) {
						local219 <<= 0x1;
					}
					if (local219 >= 8 && arg0.anInt765 == arg0.anInt749 && arg0.anInt753 != -1) {
						arg0.anInt765 = arg0.anInt753;
					}
					if (local37 < local55) {
						arg0.anInt742 += local219;
						if (arg0.anInt742 > local55) {
							arg0.anInt742 = local55;
						}
					} else if (local37 > local55) {
						arg0.anInt742 -= local219;
						if (arg0.anInt742 < local55) {
							arg0.anInt742 = local55;
						}
					}
					if (local40 < local70) {
						arg0.anInt743 += local219;
						if (arg0.anInt743 > local70) {
							arg0.anInt743 = local70;
						}
					} else if (local40 > local70) {
						arg0.anInt743 -= local219;
						if (arg0.anInt743 < local70) {
							arg0.anInt743 = local70;
						}
					}
					if (arg0.anInt742 == local55 && arg0.anInt743 == local70) {
						arg0.anInt788--;
					}
				} else {
					arg0.anInt742 = local55;
					arg0.anInt743 = local70;
				}
			}
		} catch (@Pc(369) RuntimeException local369) {
			signlink.reporterror("38909, " + ", " + arg0 + ", " + local369.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!x;I)V")
	private void method139(@OriginalArg(0) Class1_Sub1_Sub3 arg0) {
		try {
			@Pc(30) int local30;
			@Pc(36) int local36;
			if (arg0.anInt762 != -1 && arg0.anInt762 < 32768) {
				@Pc(22) Class1_Sub1_Sub3_Sub1 local22 = this.aClass1_Sub1_Sub3_Sub1Array1[arg0.anInt762];
				if (local22 != null) {
					local30 = arg0.anInt742 - local22.anInt742;
					local36 = arg0.anInt743 - local22.anInt743;
					if (local30 != 0 || local36 != 0) {
						arg0.anInt787 = (int) (Math.atan2((double) local30, (double) local36) * 325.949D) & 0x7FF;
					}
				}
			}
			@Pc(61) int local61;
			if (arg0.anInt762 >= 32768) {
				local61 = arg0.anInt762 - 32768;
				if (local61 == this.anInt102) {
					local61 = this.anInt127;
				}
				@Pc(73) Class1_Sub1_Sub3_Sub2 local73 = this.aClass1_Sub1_Sub3_Sub2Array1[local61];
				if (local73 != null) {
					local36 = arg0.anInt742 - local73.anInt742;
					@Pc(87) int local87 = arg0.anInt743 - local73.anInt743;
					if (local36 != 0 || local87 != 0) {
						arg0.anInt787 = (int) (Math.atan2((double) local36, (double) local87) * 325.949D) & 0x7FF;
					}
				}
			}
			if ((arg0.anInt763 != 0 || arg0.anInt764 != 0) && (arg0.anInt788 == 0 || arg0.anInt789 > 0)) {
				local61 = arg0.anInt742 - (arg0.anInt763 - this.anInt180 - this.anInt180) * 64;
				local30 = arg0.anInt743 - (arg0.anInt764 - this.anInt181 - this.anInt181) * 64;
				if (local61 != 0 || local30 != 0) {
					arg0.anInt787 = (int) (Math.atan2((double) local61, (double) local30) * 325.949D) & 0x7FF;
				}
				arg0.anInt763 = 0;
				arg0.anInt764 = 0;
			}
			local61 = arg0.anInt787 - arg0.anInt744 & 0x7FF;
			if (local61 != 0) {
				if (local61 < 32 || local61 > 2016) {
					arg0.anInt744 = arg0.anInt787;
				} else if (local61 > 1024) {
					arg0.anInt744 -= 32;
				} else {
					arg0.anInt744 += 32;
				}
				arg0.anInt744 &= 0x7FF;
				if (arg0.anInt765 == arg0.anInt747 && arg0.anInt744 != arg0.anInt787) {
					if (arg0.anInt748 != -1) {
						arg0.anInt765 = arg0.anInt748;
						return;
					}
					arg0.anInt765 = arg0.anInt749;
					return;
				}
			}
		} catch (@Pc(235) RuntimeException local235) {
			signlink.reporterror("22359, " + arg0 + ", " + 1 + ", " + local235.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(ZLclient!x;)V")
	private void method140(@OriginalArg(1) Class1_Sub1_Sub3 arg0) {
		try {
			this.aBoolean41 &= true;
			arg0.anInt745 = 0;
			@Pc(19) Class13 local19;
			if (arg0.anInt765 != -1) {
				local19 = Class13.aClass13Array1[arg0.anInt765];
				arg0.anInt767++;
				if (arg0.anInt766 < local19.anInt332 && arg0.anInt767 > local19.anIntArray132[arg0.anInt766]) {
					arg0.anInt767 = 0;
					arg0.anInt766++;
				}
				if (arg0.anInt766 >= local19.anInt332) {
					arg0.anInt767 = 0;
					arg0.anInt766 = 0;
				}
			}
			if (arg0.anInt768 != -1 && arg0.anInt771 == 0) {
				local19 = Class13.aClass13Array1[arg0.anInt768];
				arg0.anInt770++;
				while (arg0.anInt769 < local19.anInt332 && arg0.anInt770 > local19.anIntArray132[arg0.anInt769]) {
					arg0.anInt770 -= local19.anIntArray132[arg0.anInt769];
					arg0.anInt769++;
				}
				if (arg0.anInt769 >= local19.anInt332) {
					arg0.anInt769 -= local19.anInt333;
					arg0.anInt772++;
					if (arg0.anInt772 >= local19.anInt338) {
						arg0.anInt768 = -1;
					}
					if (arg0.anInt769 < 0 || arg0.anInt769 >= local19.anInt332) {
						arg0.anInt768 = -1;
					}
				}
				arg0.anInt745 = local19.anInt334;
			}
			if (arg0.anInt771 > 0) {
				arg0.anInt771--;
			}
			if (arg0.anInt773 != -1 && anInt132 >= arg0.anInt776) {
				if (arg0.anInt774 < 0) {
					arg0.anInt774 = 0;
				}
				local19 = Class15.aClass15Array1[arg0.anInt773].aClass13_1;
				arg0.anInt775++;
				while (arg0.anInt774 < local19.anInt332 && arg0.anInt775 > local19.anIntArray132[arg0.anInt774]) {
					arg0.anInt775 -= local19.anIntArray132[arg0.anInt774];
					arg0.anInt774++;
				}
				if (arg0.anInt774 >= local19.anInt332) {
					arg0.anInt773 = -1;
					return;
				}
			}
		} catch (@Pc(224) RuntimeException local224) {
			signlink.reporterror("70891, " + true + ", " + arg0 + ", " + local224.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "D", descriptor = "(I)V")
	private void method141(@OriginalArg(0) int arg0) {
		try {
			if (arg0 != 3073) {
				this.method59();
			}
			if (this.aBoolean37) {
				this.aBoolean37 = false;
				this.aClass29_19.method410(0, super.aGraphics2, 11, this.aByte11);
				this.aClass29_20.method410(0, super.aGraphics2, 375, this.aByte11);
				this.aClass29_21.method410(729, super.aGraphics2, 5, this.aByte11);
				this.aClass29_22.method410(752, super.aGraphics2, 231, this.aByte11);
				this.aClass29_23.method410(0, super.aGraphics2, 0, this.aByte11);
				this.aClass29_24.method410(561, super.aGraphics2, 0, this.aByte11);
				this.aClass29_25.method410(520, super.aGraphics2, 11, this.aByte11);
				this.aClass29_26.method410(520, super.aGraphics2, 231, this.aByte11);
				this.aClass29_27.method410(501, super.aGraphics2, 375, this.aByte11);
				this.aClass29_28.method410(0, super.aGraphics2, 345, this.aByte11);
				this.aBoolean44 = true;
				this.aBoolean32 = true;
				this.aBoolean60 = true;
				this.aBoolean33 = true;
				if (this.anInt232 != 2) {
					this.aClass29_5.method410(8, super.aGraphics2, 11, this.aByte11);
					this.aClass29_4.method410(561, super.aGraphics2, 5, this.aByte11);
				}
			}
			if (this.anInt232 == 2) {
				this.method98();
			}
			if (this.aBoolean52 && this.anInt93 == 1) {
				this.aBoolean44 = true;
			}
			@Pc(163) boolean local163;
			if (this.anInt235 != -1) {
				local163 = this.method100(this.anInt235, this.anInt124);
				if (local163) {
					this.aBoolean44 = true;
				}
			}
			if (this.anInt155 == 2) {
				this.aBoolean44 = true;
			}
			if (this.anInt139 == 2) {
				this.aBoolean44 = true;
			}
			if (this.aBoolean44) {
				this.method158((byte) 7);
				this.aBoolean44 = false;
			}
			if (this.anInt107 == -1) {
				this.aClass9_1.anInt283 = this.anInt99 - this.anInt122 - 77;
				if (super.anInt79 > 453 && super.anInt79 < 565 && super.anInt80 > 350) {
					this.method153(false, this.anInt99, super.anInt79 - 22, this.aClass9_1, 463, this.aByte4, 77, super.anInt80 - 375, 0);
				}
				@Pc(246) int local246 = this.anInt99 - this.aClass9_1.anInt283 - 77;
				if (local246 < 0) {
					local246 = 0;
				}
				if (local246 > this.anInt99 - 77) {
					local246 = this.anInt99 - 77;
				}
				if (this.anInt122 != local246) {
					this.anInt122 = local246;
					this.aBoolean32 = true;
				}
			}
			if (this.anInt107 != -1) {
				local163 = this.method100(this.anInt107, this.anInt124);
				if (local163) {
					this.aBoolean32 = true;
				}
			}
			if (this.anInt155 == 3) {
				this.aBoolean32 = true;
			}
			if (this.anInt139 == 3) {
				this.aBoolean32 = true;
			}
			if (this.aBoolean32) {
				this.method173((byte) 7);
				this.aBoolean32 = false;
			}
			if (this.anInt232 == 2) {
				if (aBoolean36 && this.anInt216 == 0 && anInt132 - this.anInt88 > 25) {
					this.anInt88 = anInt132;
					this.anInt87 = 1 - this.anInt87;
					if (this.anInt87 == 0) {
						this.method155();
					} else {
						this.aClass29_4.method410(561, super.aGraphics2, 5, this.aByte11);
					}
				}
				if (!aBoolean36) {
					this.method155();
					this.aClass29_4.method410(561, super.aGraphics2, 5, this.aByte11);
				}
			}
			if (this.aBoolean60) {
				this.aBoolean60 = false;
				this.aClass29_18.method409();
				this.aClass1_Sub3_Sub2_Sub3_18.method307(0, this.anInt184, 0);
				if (this.anInt235 == -1) {
					if (this.anInt202 == 0) {
						this.aClass1_Sub3_Sub2_Sub3_1.method307(30, this.anInt184, 29);
					}
					if (this.anInt202 == 1) {
						this.aClass1_Sub3_Sub2_Sub3_2.method307(29, this.anInt184, 59);
					}
					if (this.anInt202 == 2) {
						this.aClass1_Sub3_Sub2_Sub3_2.method307(29, this.anInt184, 87);
					}
					if (this.anInt202 == 3) {
						this.aClass1_Sub3_Sub2_Sub3_3.method307(29, this.anInt184, 115);
					}
					if (this.anInt202 == 4) {
						this.aClass1_Sub3_Sub2_Sub3_5.method307(29, this.anInt184, 156);
					}
					if (this.anInt202 == 5) {
						this.aClass1_Sub3_Sub2_Sub3_5.method307(29, this.anInt184, 184);
					}
					if (this.anInt202 == 6) {
						this.aClass1_Sub3_Sub2_Sub3_4.method307(30, this.anInt184, 212);
					}
					this.aClass1_Sub3_Sub2_Sub3_14.method307(33, this.anInt184, 39);
				}
				this.aClass29_18.method410(520, super.aGraphics2, 165, this.aByte11);
				this.aClass29_17.method409();
				this.aClass1_Sub3_Sub2_Sub3_17.method307(0, this.anInt184, 0);
				if (this.anInt235 == -1) {
					if (this.anInt202 == 7) {
						this.aClass1_Sub3_Sub2_Sub3_9.method307(0, this.anInt184, 49);
					}
					if (this.anInt202 == 8) {
						this.aClass1_Sub3_Sub2_Sub3_10.method307(0, this.anInt184, 81);
					}
					if (this.anInt202 == 9) {
						this.aClass1_Sub3_Sub2_Sub3_10.method307(0, this.anInt184, 108);
					}
					if (this.anInt202 == 10) {
						this.aClass1_Sub3_Sub2_Sub3_11.method307(1, this.anInt184, 136);
					}
					if (this.anInt202 == 11) {
						this.aClass1_Sub3_Sub2_Sub3_13.method307(0, this.anInt184, 178);
					}
					if (this.anInt202 == 12) {
						this.aClass1_Sub3_Sub2_Sub3_13.method307(0, this.anInt184, 205);
					}
					if (this.anInt202 == 13) {
						this.aClass1_Sub3_Sub2_Sub3_12.method307(0, this.anInt184, 233);
					}
					this.aClass1_Sub3_Sub2_Sub3_15.method307(4, this.anInt184, 83);
				}
				this.aClass29_17.method410(501, super.aGraphics2, 492, this.aByte11);
				this.aClass29_5.method409();
			}
			if (this.aBoolean33) {
				this.aBoolean33 = false;
				this.aClass29_16.method409();
				this.aClass1_Sub3_Sub2_Sub3_16.method307(0, this.anInt184, 0);
				this.aClass1_Sub3_Sub2_Sub4_2.method322(33, 57, 16777215, "Public chat", true);
				if (this.anInt234 == 0) {
					this.aClass1_Sub3_Sub2_Sub4_2.method322(46, 57, 65280, "On", true);
				}
				if (this.anInt234 == 1) {
					this.aClass1_Sub3_Sub2_Sub4_2.method322(46, 57, 16776960, "Friends", true);
				}
				if (this.anInt234 == 2) {
					this.aClass1_Sub3_Sub2_Sub4_2.method322(46, 57, 16711680, "Off", true);
				}
				this.aClass1_Sub3_Sub2_Sub4_2.method322(33, 186, 16777215, "Private chat", true);
				if (this.anInt133 == 0) {
					this.aClass1_Sub3_Sub2_Sub4_2.method322(46, 186, 65280, "On", true);
				}
				if (this.anInt133 == 1) {
					this.aClass1_Sub3_Sub2_Sub4_2.method322(46, 186, 16776960, "Friends", true);
				}
				if (this.anInt133 == 2) {
					this.aClass1_Sub3_Sub2_Sub4_2.method322(46, 186, 16711680, "Off", true);
				}
				this.aClass1_Sub3_Sub2_Sub4_2.method322(33, 326, 16777215, "Trade/duel", true);
				if (this.anInt169 == 0) {
					this.aClass1_Sub3_Sub2_Sub4_2.method322(46, 326, 65280, "On", true);
				}
				if (this.anInt169 == 1) {
					this.aClass1_Sub3_Sub2_Sub4_2.method322(46, 326, 16776960, "Friends", true);
				}
				if (this.anInt169 == 2) {
					this.aClass1_Sub3_Sub2_Sub4_2.method322(46, 326, 16711680, "Off", true);
				}
				this.aClass29_16.method410(0, super.aGraphics2, 471, this.aByte11);
				this.aClass29_5.method409();
			}
			this.anInt124 = 0;
		} catch (@Pc(767) RuntimeException local767) {
			signlink.reporterror("3296, " + arg0 + ", " + local767.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(B)Ljava/lang/String;")
	private String method142(@OriginalArg(0) byte arg0) {
		try {
			@Pc(4) boolean local4 = false;
			if (signlink.mainapp == null) {
				return super.aFrame_Sub1_2 == null ? super.getDocumentBase().getHost().toLowerCase() : "runescape.com";
			} else {
				return signlink.mainapp.getDocumentBase().getHost().toLowerCase();
			}
		} catch (@Pc(28) RuntimeException local28) {
			signlink.reporterror("43807, " + arg0 + ", " + local28.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(ILclient!kb;I)V")
	private void method143(@OriginalArg(1) Class1_Sub3_Sub3 arg0, @OriginalArg(2) int arg1) {
		try {
			while (true) {
				if (arg0.anInt434 + 21 < arg1 * 8) {
					@Pc(21) int local21 = arg0.method391(13);
					if (local21 != 8191) {
						if (this.aClass1_Sub1_Sub3_Sub1Array1[local21] == null) {
							this.aClass1_Sub1_Sub3_Sub1Array1[local21] = new Class1_Sub1_Sub3_Sub1();
						}
						@Pc(41) Class1_Sub1_Sub3_Sub1 local41 = this.aClass1_Sub1_Sub3_Sub1Array1[local21];
						this.anIntArray63[this.anInt230++] = local21;
						local41.anInt785 = anInt132;
						local41.aClass40_1 = Class40.method508(arg0.method391(11));
						local41.anInt746 = local41.aClass40_1.aByte28;
						local41.anInt749 = local41.aClass40_1.anInt731;
						local41.anInt750 = local41.aClass40_1.anInt732;
						local41.anInt751 = local41.aClass40_1.anInt733;
						local41.anInt752 = local41.aClass40_1.anInt734;
						local41.anInt747 = local41.aClass40_1.anInt730;
						@Pc(97) int local97 = arg0.method391(5);
						if (local97 > 15) {
							local97 -= 32;
						}
						@Pc(106) int local106 = arg0.method391(5);
						if (local106 > 15) {
							local106 -= 32;
						}
						local41.method514(this.aClass1_Sub1_Sub3_Sub2_1.anIntArray213[0] + local97, this.aClass1_Sub1_Sub3_Sub2_1.anIntArray214[0] + local106);
						@Pc(132) int local132 = arg0.method391(1);
						if (local132 == 1) {
							this.anIntArray26[this.anInt129++] = local21;
						}
						continue;
					}
				}
				arg0.method392(this.aByte7);
				return;
			}
		} catch (@Pc(154) RuntimeException local154) {
			signlink.reporterror("12655, " + 2 + ", " + arg0 + ", " + arg1 + ", " + local154.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIILclient!yb;I)V")
	private void method144(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class40 arg3) {
		try {
			if (this.anInt112 < 400) {
				@Pc(9) String local9 = arg3.aString25;
				if (arg3.anInt738 != 0) {
					local9 = local9 + method115(arg3.anInt738, this.aClass1_Sub1_Sub3_Sub2_1.anInt793) + " (level-" + arg3.anInt738 + ")";
				}
				if (this.anInt114 == 1) {
					this.aStringArray2[this.anInt112] = "Use " + this.aString5 + " with @yel@" + local9;
					this.anIntArray48[this.anInt112] = 985;
					this.anIntArray49[this.anInt112] = arg1;
					this.anIntArray46[this.anInt112] = arg2;
					this.anIntArray47[this.anInt112] = arg0;
					this.anInt112++;
				} else if (this.anInt109 != 1) {
					if (arg3.aStringArray8 != null) {
						for (@Pc(155) int local155 = 4; local155 >= 0; local155--) {
							if (arg3.aStringArray8[local155] != null) {
								this.aStringArray2[this.anInt112] = arg3.aStringArray8[local155] + " @yel@" + local9;
								if (local155 == 0) {
									this.anIntArray48[this.anInt112] = 490;
								}
								if (local155 == 1) {
									this.anIntArray48[this.anInt112] = 914;
								}
								if (local155 == 2) {
									this.anIntArray48[this.anInt112] = 75;
								}
								if (local155 == 3) {
									this.anIntArray48[this.anInt112] = 486;
								}
								if (local155 == 4) {
									this.anIntArray48[this.anInt112] = 772;
								}
								this.anIntArray49[this.anInt112] = arg1;
								this.anIntArray46[this.anInt112] = arg2;
								this.anIntArray47[this.anInt112] = arg0;
								this.anInt112++;
							}
						}
					}
					this.aStringArray2[this.anInt112] = "Examine @yel@" + local9;
					this.anIntArray48[this.anInt112] = 1318;
					this.anIntArray49[this.anInt112] = arg1;
					this.anIntArray46[this.anInt112] = arg2;
					this.anIntArray47[this.anInt112] = arg0;
					this.anInt112++;
				} else if ((this.anInt111 & 0x2) == 2) {
					this.aStringArray2[this.anInt112] = this.aString4 + " @yel@" + local9;
					this.anIntArray48[this.anInt112] = 946;
					this.anIntArray49[this.anInt112] = arg1;
					this.anIntArray46[this.anInt112] = arg2;
					this.anIntArray47[this.anInt112] = arg0;
					this.anInt112++;
					return;
				}
			}
		} catch (@Pc(295) RuntimeException local295) {
			signlink.reporterror("80146, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + -687 + ", " + local295.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "E", descriptor = "(I)V")
	private void method145() {
		try {
			for (@Pc(15) Class1_Sub1_Sub1 local15 = (Class1_Sub1_Sub1) this.aClass25_4.method402(); local15 != null; local15 = (Class1_Sub1_Sub1) this.aClass25_4.method404()) {
				if (local15.anInt19 != this.anInt119 || anInt132 > local15.anInt25) {
					local15.method512();
				} else if (anInt132 >= local15.anInt24) {
					if (local15.anInt28 > 0) {
						@Pc(45) Class1_Sub1_Sub3_Sub1 local45 = this.aClass1_Sub1_Sub3_Sub1Array1[local15.anInt28 - 1];
						if (local45 != null) {
							local15.method19(this.method68(local45.anInt742, local45.anInt743, local15.anInt19, (byte) 9) - local15.anInt23, local45.anInt743, anInt132, local45.anInt742, this.aBoolean55);
						}
					}
					if (local15.anInt28 < 0) {
						@Pc(77) int local77 = -local15.anInt28 - 1;
						@Pc(84) Class1_Sub1_Sub3_Sub2 local84;
						if (local77 == this.anInt102) {
							local84 = this.aClass1_Sub1_Sub3_Sub2_1;
						} else {
							local84 = this.aClass1_Sub1_Sub3_Sub2Array1[local77];
						}
						if (local84 != null) {
							local15.method19(this.method68(local84.anInt742, local84.anInt743, local15.anInt19, (byte) 9) - local15.anInt23, local84.anInt743, anInt132, local84.anInt742, this.aBoolean55);
						}
					}
					local15.method20(this.anInt124);
					this.aClass30_1.method424(null, (int) local15.aDouble3, (int) local15.aDouble2, local15.anInt29, (int) local15.aDouble1, this.anInt119, 0, local15, 60, -1);
				}
			}
		} catch (@Pc(152) RuntimeException local152) {
			signlink.reporterror("29514, " + -497 + ", " + local152.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IILclient!kb;)V")
	private void method146(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub3_Sub3 arg1) {
		try {
			for (@Pc(1) int local1 = 0; local1 < this.anInt129; local1++) {
				@Pc(8) int local8 = this.anIntArray26[local1];
				@Pc(13) Class1_Sub1_Sub3_Sub1 local13 = this.aClass1_Sub1_Sub3_Sub1Array1[local8];
				@Pc(16) int local16 = arg1.method380();
				@Pc(24) int local24;
				if ((local16 & 0x2) == 2) {
					local24 = arg1.method382();
					if (local24 == 65535) {
						local24 = -1;
					}
					if (local24 == local13.anInt768) {
						local13.anInt772 = 0;
					}
					@Pc(39) int local39 = arg1.method380();
					if (local24 == -1 || local13.anInt768 == -1 || Class13.aClass13Array1[local24].anInt335 > Class13.aClass13Array1[local13.anInt768].anInt335 || Class13.aClass13Array1[local13.anInt768].anInt335 == 0) {
						local13.anInt768 = local24;
						local13.anInt769 = 0;
						local13.anInt770 = 0;
						local13.anInt771 = local39;
						local13.anInt772 = 0;
					}
				}
				if ((local16 & 0x4) == 4) {
					local13.anInt762 = arg1.method382();
					if (local13.anInt762 == 65535) {
						local13.anInt762 = -1;
					}
				}
				if ((local16 & 0x8) == 8) {
					local13.aString26 = arg1.method387();
					local13.anInt754 = 100;
				}
				if ((local16 & 0x10) == 16) {
					local13.anInt757 = arg1.method380();
					local13.anInt758 = arg1.method380();
					local13.anInt759 = anInt132 + 400;
					local13.anInt760 = arg1.method380();
					local13.anInt761 = arg1.method380();
				}
				if ((local16 & 0x20) == 32) {
					local13.aClass40_1 = Class40.method508(arg1.method382());
					local13.anInt749 = local13.aClass40_1.anInt731;
					local13.anInt750 = local13.aClass40_1.anInt732;
					local13.anInt751 = local13.aClass40_1.anInt733;
					local13.anInt752 = local13.aClass40_1.anInt734;
					local13.anInt747 = local13.aClass40_1.anInt730;
				}
				if ((local16 & 0x40) == 64) {
					local13.anInt773 = arg1.method382();
					local24 = arg1.method385();
					local13.anInt777 = local24 >> 16;
					local13.anInt776 = anInt132 + (local24 & 0xFFFF);
					local13.anInt774 = 0;
					local13.anInt775 = 0;
					if (local13.anInt776 > anInt132) {
						local13.anInt774 = -1;
					}
					if (local13.anInt773 == 65535) {
						local13.anInt773 = -1;
					}
				}
				if ((local16 & 0x80) == 128) {
					local13.anInt763 = arg1.method382();
					local13.anInt764 = arg1.method382();
				}
			}
		} catch (@Pc(234) RuntimeException local234) {
			signlink.reporterror("99907, " + 787 + ", " + arg0 + ", " + arg1 + ", " + local234.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "G", descriptor = "(I)V")
	private void method148() {
		try {
			for (@Pc(3) int local3 = -1; local3 < this.anInt128; local3++) {
				@Pc(11) Class1_Sub1_Sub3_Sub2 local11;
				@Pc(16) int local16;
				if (local3 == -1) {
					local11 = this.aClass1_Sub1_Sub3_Sub2_1;
					local16 = this.anInt127 << 14;
				} else {
					local11 = this.aClass1_Sub1_Sub3_Sub2Array1[this.anIntArray25[local3]];
					local16 = this.anIntArray25[local3] << 14;
				}
				if (local11 != null && local11.method516()) {
					local11.aBoolean162 = false;
					if ((aBoolean36 && this.anInt128 > 50 || this.anInt128 > 200) && local3 != -1 && local11.anInt765 == local11.anInt747) {
						local11.aBoolean162 = true;
					}
					@Pc(68) int local68 = local11.anInt742 >> 7;
					@Pc(73) int local73 = local11.anInt743 >> 7;
					if (local68 >= 0 && local68 < 104 && local73 >= 0 && local73 < 104) {
						if (local11.aClass1_Sub3_Sub1_11 == null || anInt132 < local11.anInt795 || anInt132 >= local11.anInt796) {
							if ((local11.anInt742 & 0x7F) == 64 && (local11.anInt743 & 0x7F) == 64) {
								if (this.anIntArrayArray4[local68][local73] == this.anInt142) {
									continue;
								}
								this.anIntArrayArray4[local68][local73] = this.anInt142;
							}
							local11.anInt794 = this.method68(local11.anInt742, local11.anInt743, this.anInt119, (byte) 9);
							this.aClass30_1.method424(null, local11.anInt794, local11.anInt743, local11.anInt744, local11.anInt742, this.anInt119, local11.anInt745, local11, 60, local16);
						} else {
							local11.aBoolean162 = false;
							local11.anInt794 = this.method68(local11.anInt742, local11.anInt743, this.anInt119, (byte) 9);
							this.aClass30_1.method425(local11.anInt801, null, local11.anInt800, local11.anInt744, local11.anInt742, local11.anInt743, this.aByte8, local16, local11.anInt794, local11, local11.anInt802, local11.anInt803, this.anInt119);
						}
					}
				}
			}
		} catch (@Pc(217) RuntimeException local217) {
			signlink.reporterror("44826, " + 7 + ", " + local217.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Z)V")
	@Override
	protected void method61() {
		try {
			signlink.reporterror = false;
			try {
				if (this.aClass6_1 != null) {
					this.aClass6_1.method174();
				}
			} catch (@Pc(11) Exception local11) {
			}
			this.aClass6_1 = null;
			signlink.midi = "null";
			this.aClass1_Sub3_Sub3_3 = null;
			this.aClass1_Sub3_Sub3_2 = null;
			this.aClass1_Sub3_Sub3_1 = null;
			this.anIntArray50 = null;
			this.aByteArrayArray2 = null;
			this.aByteArrayArray1 = null;
			this.anIntArrayArrayArray3 = null;
			this.aByteArrayArrayArray7 = null;
			this.aClass30_1 = null;
			this.aClass3Array1 = null;
			this.anIntArrayArray3 = null;
			this.anIntArrayArray5 = null;
			this.anIntArray23 = null;
			this.anIntArray24 = null;
			this.aByteArray1 = null;
			this.aClass29_3 = null;
			this.aClass29_4 = null;
			this.aClass29_5 = null;
			this.aClass29_6 = null;
			this.aClass29_16 = null;
			this.aClass29_17 = null;
			this.aClass29_18 = null;
			this.aClass29_19 = null;
			this.aClass29_20 = null;
			this.aClass29_21 = null;
			this.aClass29_22 = null;
			this.aClass29_23 = null;
			this.aClass29_24 = null;
			this.aClass29_25 = null;
			this.aClass29_26 = null;
			this.aClass29_27 = null;
			this.aClass29_28 = null;
			this.aClass1_Sub3_Sub2_Sub3_6 = null;
			this.aClass1_Sub3_Sub2_Sub3_7 = null;
			this.aClass1_Sub3_Sub2_Sub3_8 = null;
			this.aClass1_Sub3_Sub2_Sub3_16 = null;
			this.aClass1_Sub3_Sub2_Sub3_17 = null;
			this.aClass1_Sub3_Sub2_Sub3_18 = null;
			this.aClass1_Sub3_Sub2_Sub3_14 = null;
			this.aClass1_Sub3_Sub2_Sub3_15 = null;
			this.aClass1_Sub3_Sub2_Sub3_1 = null;
			this.aClass1_Sub3_Sub2_Sub3_2 = null;
			this.aClass1_Sub3_Sub2_Sub3_3 = null;
			this.aClass1_Sub3_Sub2_Sub3_4 = null;
			this.aClass1_Sub3_Sub2_Sub3_5 = null;
			this.aClass1_Sub3_Sub2_Sub3_9 = null;
			this.aClass1_Sub3_Sub2_Sub3_10 = null;
			this.aClass1_Sub3_Sub2_Sub3_11 = null;
			this.aClass1_Sub3_Sub2_Sub3_12 = null;
			this.aClass1_Sub3_Sub2_Sub3_13 = null;
			this.aClass1_Sub3_Sub2_Sub2_9 = null;
			this.aClass1_Sub3_Sub2_Sub2Array7 = null;
			this.aClass1_Sub3_Sub2_Sub2Array3 = null;
			this.aClass1_Sub3_Sub2_Sub2Array6 = null;
			this.aClass1_Sub3_Sub2_Sub2_3 = null;
			this.aClass1_Sub3_Sub2_Sub2_4 = null;
			this.aClass1_Sub3_Sub2_Sub2_5 = null;
			this.aClass1_Sub3_Sub2_Sub2_6 = null;
			this.aClass1_Sub3_Sub2_Sub3Array1 = null;
			this.aClass1_Sub3_Sub2_Sub2Array5 = null;
			this.anIntArrayArray4 = null;
			this.aClass1_Sub1_Sub3_Sub2Array1 = null;
			this.anIntArray25 = null;
			this.anIntArray26 = null;
			this.aClass1_Sub3_Sub3Array1 = null;
			this.anIntArray44 = null;
			this.aClass1_Sub1_Sub3_Sub1Array1 = null;
			this.anIntArray63 = null;
			this.aClass25ArrayArrayArray1 = null;
			this.aClass25_3 = null;
			this.aClass25_1 = null;
			this.aClass25_4 = null;
			this.aClass25_2 = null;
			this.aClass25_5 = null;
			this.anIntArray46 = null;
			this.anIntArray47 = null;
			this.anIntArray48 = null;
			this.anIntArray49 = null;
			this.aStringArray2 = null;
			this.anIntArray41 = null;
			this.anIntArray27 = null;
			this.anIntArray28 = null;
			this.aClass1_Sub3_Sub2_Sub2Array4 = null;
			this.aClass1_Sub3_Sub2_Sub2_10 = null;
			this.aStringArray1 = null;
			this.aLongArray4 = null;
			this.anIntArray30 = null;
			this.aClass29_10 = null;
			this.aClass29_11 = null;
			this.aClass29_7 = null;
			this.aClass29_8 = null;
			this.aClass29_9 = null;
			this.aClass29_12 = null;
			this.aClass29_13 = null;
			this.aClass29_14 = null;
			this.aClass29_15 = null;
			this.method171();
			Class39.method495();
			Class40.method507();
			Class41.method521();
			Class5.aClass5Array1 = null;
			Class7.aClass7Array1 = null;
			Class9.aClass9Array1 = null;
			Class11.aClass11Array1 = null;
			Class13.aClass13Array1 = null;
			Class15.aClass15Array1 = null;
			Class15.aClass32_3 = null;
			Class17.aClass17Array1 = null;
			super.aClass29_2 = null;
			Class1_Sub1_Sub3_Sub2.aClass32_7 = null;
			Class1_Sub3_Sub2_Sub1.method251();
			Class30.method412();
			Class1_Sub3_Sub1.method201();
			Class10.aClass10Array1 = null;
			Class12.aClass12Array1 = null;
			System.gc();
		} catch (@Pc(359) RuntimeException local359) {
			signlink.reporterror("40621, " + false + ", " + local359.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IZIIII)V")
	private void method149(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		try {
			this.aClass1_Sub3_Sub2_Sub3_21.method307(arg0, this.anInt184, arg1);
			this.aClass1_Sub3_Sub2_Sub3_22.method307(arg0 + arg4 - 16, this.anInt184, arg1);
			Class1_Sub3_Sub2.method317(this.anInt195, this.anInt157, arg4 - 32, arg0 + 16, 16, arg1);
			@Pc(38) int local38 = (arg4 - 32) * arg4 / arg2;
			if (local38 < 8) {
				local38 = 8;
			}
			@Pc(55) int local55 = (arg4 - local38 - 32) * arg3 / (arg2 - arg4);
			Class1_Sub3_Sub2.method317(this.anInt198, this.anInt157, local38, arg0 + local55 + 16, 16, arg1);
			Class1_Sub3_Sub2.method320(this.anInt193, arg0 + local55 + 16, arg1, local38);
			Class1_Sub3_Sub2.method320(this.anInt193, arg0 + local55 + 16, arg1 + 1, local38);
			Class1_Sub3_Sub2.method319(16, arg1, arg0 + local55 + 16, this.anInt193);
			Class1_Sub3_Sub2.method319(16, arg1, arg0 + local55 + 17, this.anInt193);
			Class1_Sub3_Sub2.method320(this.anInt175, arg0 + local55 + 16, arg1 + 15, local38);
			Class1_Sub3_Sub2.method320(this.anInt175, arg0 + local55 + 17, arg1 + 14, local38 - 1);
			Class1_Sub3_Sub2.method319(16, arg1, arg0 + local55 + local38 + 15, this.anInt175);
			Class1_Sub3_Sub2.method319(15, arg1 + 1, arg0 + 14 + local55 + local38, this.anInt175);
		} catch (@Pc(176) RuntimeException local176) {
			signlink.reporterror("5353, " + arg0 + ", " + false + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local176.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(BLclient!ib;)V")
	private void method150(@OriginalArg(1) Class1_Sub3_Sub2_Sub3 arg0) {
		try {
			for (@Pc(5) int local5 = 0; local5 < this.anIntArray61.length; local5++) {
				this.anIntArray61[local5] = 0;
			}
			@Pc(30) int local30;
			for (@Pc(20) int local20 = 0; local20 < 5000; local20++) {
				local30 = (int) (Math.random() * 128.0D * (double) 256);
				this.anIntArray61[local30] = (int) (Math.random() * 256.0D);
			}
			@Pc(58) int local58;
			@Pc(62) int local62;
			@Pc(70) int local70;
			for (local30 = 0; local30 < 20; local30++) {
				for (local58 = 1; local58 < 255; local58++) {
					for (local62 = 1; local62 < 127; local62++) {
						local70 = local62 + (local58 << 7);
						this.anIntArray62[local70] = (this.anIntArray61[local70 - 1] + this.anIntArray61[local70 + 1] + this.anIntArray61[local70 - 128] + this.anIntArray61[local70 + 128]) / 4;
					}
				}
				@Pc(116) int[] local116 = this.anIntArray61;
				this.anIntArray61 = this.anIntArray62;
				this.anIntArray62 = local116;
			}
			if (arg0 != null) {
				local58 = 0;
				for (local62 = 0; local62 < arg0.anInt389; local62++) {
					for (local70 = 0; local70 < arg0.anInt388; local70++) {
						if (arg0.aByteArray3[local58++] != 0) {
							@Pc(152) int local152 = local70 + arg0.anInt390 + 16;
							@Pc(159) int local159 = local62 + arg0.anInt391 + 16;
							@Pc(165) int local165 = local152 + (local159 << 7);
							this.anIntArray61[local165] = 0;
						}
					}
				}
			}
		} catch (@Pc(182) RuntimeException local182) {
			signlink.reporterror("61196, " + 57 + ", " + arg0 + ", " + local182.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "()V")
	@Override
	protected void method59() {
		if (signlink.sunjava) {
			super.anInt73 = 5;
		}
		signlink.midi = "scape_main";
		if (aBoolean48) {
			this.aBoolean58 = true;
			return;
		}
		aBoolean48 = true;
		@Pc(18) boolean local18 = false;
		@Pc(22) String local22 = this.method142((byte) 2);
		if (local22.endsWith("jagex.com")) {
			local18 = true;
		}
		if (local22.endsWith("runescape.com")) {
			local18 = true;
		}
		if (local22.endsWith("192.168.1.252")) {
			local18 = true;
		}
		if (local22.endsWith("192.168.1.2")) {
			local18 = true;
		}
		if (local22.endsWith("69.1.68.43")) {
			local18 = true;
		}
		if (local22.endsWith("127.0.0.1")) {
			local18 = true;
		}
		if (!local18) {
			this.aBoolean56 = true;
			return;
		}
		try {
			@Pc(66) int local66 = 5;
			this.anIntArray21[7] = 0;
			while (this.anIntArray21[7] == 0) {
				this.method66(10, "Connecting to fileserver");
				try {
					@Pc(91) DataInputStream local91 = this.method157("crc" + (int) (Math.random() * 9.9999999E7D));
					@Pc(98) Class1_Sub3_Sub3 local98 = new Class1_Sub3_Sub3(new byte[32], 4);
					local91.readFully(local98.aByteArray4, 0, 32);
					for (@Pc(106) int local106 = 0; local106 < 8; local106++) {
						this.anIntArray21[local106] = local98.method385();
					}
					local91.close();
				} catch (@Pc(122) IOException local122) {
					for (@Pc(124) int local124 = local66; local124 > 0; local124--) {
						this.method66(10, "Error loading - Will retry in " + local124 + " secs.");
						try {
							Thread.sleep(1000L);
						} catch (@Pc(143) Exception local143) {
						}
					}
					local66 *= 2;
					if (local66 > 60) {
						local66 = 60;
					}
				}
			}
			this.aClass36_1 = this.method77(this.anIntArray21[1], "title screen", 10, "title");
			this.aClass1_Sub3_Sub2_Sub4_1 = new Class1_Sub3_Sub2_Sub4(true, this.aClass36_1, "p11");
			this.aClass1_Sub3_Sub2_Sub4_2 = new Class1_Sub3_Sub2_Sub4(true, this.aClass36_1, "p12");
			this.aClass1_Sub3_Sub2_Sub4_3 = new Class1_Sub3_Sub2_Sub4(true, this.aClass36_1, "b12");
			this.aClass1_Sub3_Sub2_Sub4_4 = new Class1_Sub3_Sub2_Sub4(true, this.aClass36_1, "q8");
			this.method159();
			this.method109();
			@Pc(227) Class36 local227 = this.method77(this.anIntArray21[2], "config", 20, "config");
			@Pc(238) Class36 local238 = this.method77(this.anIntArray21[3], "interface", 30, "interface");
			@Pc(249) Class36 local249 = this.method77(this.anIntArray21[4], "2d graphics", 40, "media");
			@Pc(260) Class36 local260 = this.method77(this.anIntArray21[5], "3d graphics", 50, "models");
			@Pc(271) Class36 local271 = this.method77(this.anIntArray21[6], "textures", 60, "textures");
			@Pc(282) Class36 local282 = this.method77(this.anIntArray21[7], "chat system", 70, "wordenc");
			this.aByteArrayArrayArray7 = new byte[4][104][104];
			this.anIntArrayArrayArray3 = new int[4][105][105];
			this.aClass30_1 = new Class30(this.anIntArrayArrayArray3, -4278, 4, 104, 104);
			for (@Pc(307) int local307 = 0; local307 < 4; local307++) {
				this.aClass3Array1[local307] = new Class3(104, anInt98, 104);
			}
			this.aClass1_Sub3_Sub2_Sub2_10 = new Class1_Sub3_Sub2_Sub2(512, 512);
			this.method66(80, "Unpacking media");
			this.aClass1_Sub3_Sub2_Sub3_6 = new Class1_Sub3_Sub2_Sub3(local249, "invback", 0);
			this.aClass1_Sub3_Sub2_Sub3_8 = new Class1_Sub3_Sub2_Sub3(local249, "chatback", 0);
			this.aClass1_Sub3_Sub2_Sub3_7 = new Class1_Sub3_Sub2_Sub3(local249, "mapback", 0);
			this.aClass1_Sub3_Sub2_Sub3_16 = new Class1_Sub3_Sub2_Sub3(local249, "backbase1", 0);
			this.aClass1_Sub3_Sub2_Sub3_17 = new Class1_Sub3_Sub2_Sub3(local249, "backbase2", 0);
			this.aClass1_Sub3_Sub2_Sub3_18 = new Class1_Sub3_Sub2_Sub3(local249, "backhmid1", 0);
			this.aClass1_Sub3_Sub2_Sub3_14 = new Class1_Sub3_Sub2_Sub3(local249, "sideicons1", 0);
			this.aClass1_Sub3_Sub2_Sub3_15 = new Class1_Sub3_Sub2_Sub3(local249, "sideicons2", 0);
			this.aClass1_Sub3_Sub2_Sub2_9 = new Class1_Sub3_Sub2_Sub2(local249, "compass", 0);
			@Pc(409) int local409;
			try {
				for (local409 = 0; local409 < 50; local409++) {
					this.aClass1_Sub3_Sub2_Sub3Array1[local409] = new Class1_Sub3_Sub2_Sub3(local249, "mapscene", local409);
				}
			} catch (@Pc(427) Exception local427) {
			}
			try {
				for (local409 = 0; local409 < 50; local409++) {
					this.aClass1_Sub3_Sub2_Sub2Array5[local409] = new Class1_Sub3_Sub2_Sub2(local249, "mapfunction", local409);
				}
			} catch (@Pc(447) Exception local447) {
			}
			try {
				for (local409 = 0; local409 < 20; local409++) {
					this.aClass1_Sub3_Sub2_Sub2Array7[local409] = new Class1_Sub3_Sub2_Sub2(local249, "hitmarks", local409);
				}
			} catch (@Pc(467) Exception local467) {
			}
			try {
				for (local409 = 0; local409 < 20; local409++) {
					this.aClass1_Sub3_Sub2_Sub2Array3[local409] = new Class1_Sub3_Sub2_Sub2(local249, "headicons", local409);
				}
			} catch (@Pc(487) Exception local487) {
			}
			for (local409 = 0; local409 < 8; local409++) {
				this.aClass1_Sub3_Sub2_Sub2Array6[local409] = new Class1_Sub3_Sub2_Sub2(local249, "cross", local409);
			}
			this.aClass1_Sub3_Sub2_Sub2_3 = new Class1_Sub3_Sub2_Sub2(local249, "mapdots", 0);
			this.aClass1_Sub3_Sub2_Sub2_4 = new Class1_Sub3_Sub2_Sub2(local249, "mapdots", 1);
			this.aClass1_Sub3_Sub2_Sub2_5 = new Class1_Sub3_Sub2_Sub2(local249, "mapdots", 2);
			this.aClass1_Sub3_Sub2_Sub2_6 = new Class1_Sub3_Sub2_Sub2(local249, "mapdots", 3);
			this.aClass1_Sub3_Sub2_Sub3_21 = new Class1_Sub3_Sub2_Sub3(local249, "scrollbar", 0);
			this.aClass1_Sub3_Sub2_Sub3_22 = new Class1_Sub3_Sub2_Sub3(local249, "scrollbar", 1);
			this.aClass1_Sub3_Sub2_Sub3_1 = new Class1_Sub3_Sub2_Sub3(local249, "redstone1", 0);
			this.aClass1_Sub3_Sub2_Sub3_2 = new Class1_Sub3_Sub2_Sub3(local249, "redstone2", 0);
			this.aClass1_Sub3_Sub2_Sub3_3 = new Class1_Sub3_Sub2_Sub3(local249, "redstone3", 0);
			this.aClass1_Sub3_Sub2_Sub3_4 = new Class1_Sub3_Sub2_Sub3(local249, "redstone1", 0);
			this.aClass1_Sub3_Sub2_Sub3_4.method305();
			this.aClass1_Sub3_Sub2_Sub3_5 = new Class1_Sub3_Sub2_Sub3(local249, "redstone2", 0);
			this.aClass1_Sub3_Sub2_Sub3_5.method305();
			this.aClass1_Sub3_Sub2_Sub3_9 = new Class1_Sub3_Sub2_Sub3(local249, "redstone1", 0);
			this.aClass1_Sub3_Sub2_Sub3_9.method306();
			this.aClass1_Sub3_Sub2_Sub3_10 = new Class1_Sub3_Sub2_Sub3(local249, "redstone2", 0);
			this.aClass1_Sub3_Sub2_Sub3_10.method306();
			this.aClass1_Sub3_Sub2_Sub3_11 = new Class1_Sub3_Sub2_Sub3(local249, "redstone3", 0);
			this.aClass1_Sub3_Sub2_Sub3_11.method306();
			this.aClass1_Sub3_Sub2_Sub3_12 = new Class1_Sub3_Sub2_Sub3(local249, "redstone1", 0);
			this.aClass1_Sub3_Sub2_Sub3_12.method305();
			this.aClass1_Sub3_Sub2_Sub3_12.method306();
			this.aClass1_Sub3_Sub2_Sub3_13 = new Class1_Sub3_Sub2_Sub3(local249, "redstone2", 0);
			this.aClass1_Sub3_Sub2_Sub3_13.method305();
			this.aClass1_Sub3_Sub2_Sub3_13.method306();
			@Pc(676) Class1_Sub3_Sub2_Sub2 local676 = new Class1_Sub3_Sub2_Sub2(local249, "backleft1", 0);
			this.aClass29_19 = new Class29(local676.anInt362, (byte) -58, this.method64(), local676.anInt361);
			local676.method281(0, anInt174, 0);
			@Pc(701) Class1_Sub3_Sub2_Sub2 local701 = new Class1_Sub3_Sub2_Sub2(local249, "backleft2", 0);
			this.aClass29_20 = new Class29(local701.anInt362, (byte) -58, this.method64(), local701.anInt361);
			local701.method281(0, anInt174, 0);
			@Pc(726) Class1_Sub3_Sub2_Sub2 local726 = new Class1_Sub3_Sub2_Sub2(local249, "backright1", 0);
			this.aClass29_21 = new Class29(local726.anInt362, (byte) -58, this.method64(), local726.anInt361);
			local726.method281(0, anInt174, 0);
			@Pc(751) Class1_Sub3_Sub2_Sub2 local751 = new Class1_Sub3_Sub2_Sub2(local249, "backright2", 0);
			this.aClass29_22 = new Class29(local751.anInt362, (byte) -58, this.method64(), local751.anInt361);
			local751.method281(0, anInt174, 0);
			@Pc(776) Class1_Sub3_Sub2_Sub2 local776 = new Class1_Sub3_Sub2_Sub2(local249, "backtop1", 0);
			this.aClass29_23 = new Class29(local776.anInt362, (byte) -58, this.method64(), local776.anInt361);
			local776.method281(0, anInt174, 0);
			@Pc(801) Class1_Sub3_Sub2_Sub2 local801 = new Class1_Sub3_Sub2_Sub2(local249, "backtop2", 0);
			this.aClass29_24 = new Class29(local801.anInt362, (byte) -58, this.method64(), local801.anInt361);
			local801.method281(0, anInt174, 0);
			@Pc(826) Class1_Sub3_Sub2_Sub2 local826 = new Class1_Sub3_Sub2_Sub2(local249, "backvmid1", 0);
			this.aClass29_25 = new Class29(local826.anInt362, (byte) -58, this.method64(), local826.anInt361);
			local826.method281(0, anInt174, 0);
			@Pc(851) Class1_Sub3_Sub2_Sub2 local851 = new Class1_Sub3_Sub2_Sub2(local249, "backvmid2", 0);
			this.aClass29_26 = new Class29(local851.anInt362, (byte) -58, this.method64(), local851.anInt361);
			local851.method281(0, anInt174, 0);
			@Pc(876) Class1_Sub3_Sub2_Sub2 local876 = new Class1_Sub3_Sub2_Sub2(local249, "backvmid3", 0);
			this.aClass29_27 = new Class29(local876.anInt362, (byte) -58, this.method64(), local876.anInt361);
			local876.method281(0, anInt174, 0);
			@Pc(901) Class1_Sub3_Sub2_Sub2 local901 = new Class1_Sub3_Sub2_Sub2(local249, "backhmid2", 0);
			this.aClass29_28 = new Class29(local901.anInt362, (byte) -58, this.method64(), local901.anInt361);
			local901.method281(0, anInt174, 0);
			this.method66(85, "Unpacking textures");
			Class1_Sub3_Sub2_Sub1.method256(aBoolean49, local271);
			Class1_Sub3_Sub2_Sub1.method260(0.8D);
			Class1_Sub3_Sub2_Sub1.method255((byte) 3);
			this.method66(85, "Unpacking models");
			Class1_Sub3_Sub1.method202(local260);
			Class10.method229(213, local260);
			Class12.method240(213, local260);
			this.method66(85, "Unpacking config");
			Class13.method268(local227);
			Class39.method494(local227);
			Class5.method51(local227);
			Class41.method520(local227);
			Class40.method506(local227);
			Class7.method181(local227);
			Class15.method290(local227);
			Class17.method309(local227);
			this.method66(90, "Unpacking interfaces");
			@Pc(1001) Class1_Sub3_Sub2_Sub4[] local1001 = new Class1_Sub3_Sub2_Sub4[] { this.aClass1_Sub3_Sub2_Sub4_1, this.aClass1_Sub3_Sub2_Sub4_2, this.aClass1_Sub3_Sub2_Sub4_3, this.aClass1_Sub3_Sub2_Sub4_4 };
			Class9.method225(local249, local238, local1001);
			this.method66(95, "Preparing game engine");
			@Pc(1017) int local1017;
			@Pc(1019) int local1019;
			@Pc(1021) int local1021;
			for (@Pc(1013) int local1013 = 0; local1013 < 33; local1013++) {
				local1017 = 999;
				local1019 = 0;
				for (local1021 = 0; local1021 < 35; local1021++) {
					if (this.aClass1_Sub3_Sub2_Sub3_7.aByteArray3[local1021 + local1013 * this.aClass1_Sub3_Sub2_Sub3_7.anInt388] == 0) {
						if (local1017 == 999) {
							local1017 = local1021;
						}
					} else if (local1017 != 999) {
						local1019 = local1021;
						break;
					}
				}
				this.anIntArray40[local1013] = local1017;
				this.anIntArray31[local1013] = local1019 - local1017;
			}
			@Pc(1079) int local1079;
			for (local1017 = 9; local1017 < 160; local1017++) {
				local1019 = 999;
				local1021 = 0;
				for (local1079 = 10; local1079 < 168; local1079++) {
					if (this.aClass1_Sub3_Sub2_Sub3_7.aByteArray3[local1079 + local1017 * this.aClass1_Sub3_Sub2_Sub3_7.anInt388] == 0 && (local1079 > 34 || local1017 > 34)) {
						if (local1019 == 999) {
							local1019 = local1079;
						}
					} else if (local1019 != 999) {
						local1021 = local1079;
						break;
					}
				}
				this.anIntArray39[local1017 - 9] = local1019 - 21;
				this.anIntArray52[local1017 - 9] = local1021 - local1019;
			}
			Class1_Sub3_Sub2_Sub1.method253(479, aBoolean51, 96);
			this.anIntArray56 = Class1_Sub3_Sub2_Sub1.anIntArray126;
			Class1_Sub3_Sub2_Sub1.method253(190, aBoolean51, 261);
			this.anIntArray57 = Class1_Sub3_Sub2_Sub1.anIntArray126;
			Class1_Sub3_Sub2_Sub1.method253(512, aBoolean51, 334);
			this.anIntArray58 = Class1_Sub3_Sub2_Sub1.anIntArray126;
			@Pc(1163) int[] local1163 = new int[9];
			for (local1021 = 0; local1021 < 9; local1021++) {
				local1079 = local1021 * 32 + 128 + 15;
				@Pc(1181) int local1181 = local1079 * 3 + 600;
				@Pc(1185) int local1185 = Class1_Sub3_Sub2_Sub1.anIntArray124[local1079];
				local1163[local1021] = local1181 * local1185 >> 16;
			}
			Class30.method447(local1163);
			Class19.method329(local282);
		} catch (@Pc(1208) Exception local1208) {
			this.aBoolean50 = true;
		}
	}

	@OriginalMember(owner = "client!client", name = "H", descriptor = "(I)Ljava/net/Socket;")
	private Socket method151(@OriginalArg(0) int arg0) throws IOException {
		return signlink.mainapp == null ? new Socket(InetAddress.getByName(this.getCodeBase().getHost()), arg0) : signlink.opensocket(arg0);
	}

	@OriginalMember(owner = "client!client", name = "getjingle", descriptor = "()Ljava/lang/String;")
	private String method152() {
		if (signlink.jingle == null) {
			return "none";
		} else {
			@Pc(12) String local12 = signlink.jingle + ".mid.gz";
			signlink.jingle = null;
			return local12;
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ZIILclient!ec;IBIII)V")
	private void method153(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class9 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) byte arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		try {
			if (arg5 == 9) {
				if (this.aBoolean45) {
					this.anInt197 = 32;
				} else {
					this.anInt197 = 0;
				}
				this.aBoolean45 = false;
				if (arg2 >= arg4 && arg2 < arg4 + 16 && arg7 >= arg8 && arg7 < arg8 + 16) {
					arg3.anInt283 -= this.anInt134 * 4;
					if (arg0) {
						this.aBoolean44 = true;
						return;
					}
				} else if (arg2 >= arg4 && arg2 < arg4 + 16 && arg7 >= arg8 + arg6 - 16 && arg7 < arg8 + arg6) {
					arg3.anInt283 += this.anInt134 * 4;
					if (arg0) {
						this.aBoolean44 = true;
						return;
					}
				} else if (arg2 >= arg4 - this.anInt197 && arg2 < arg4 + this.anInt197 + 16 && arg7 >= arg8 + 16 && arg7 < arg8 + arg6 - 16 && this.anInt134 > 0) {
					@Pc(120) int local120 = (arg6 - 32) * arg6 / arg1;
					if (local120 < 8) {
						local120 = 8;
					}
					@Pc(135) int local135 = arg7 - arg8 - local120 / 2 - 16;
					@Pc(141) int local141 = arg6 - local120 - 32;
					arg3.anInt283 = (arg1 - arg6) * local135 / local141;
					if (arg0) {
						this.aBoolean44 = true;
					}
					this.aBoolean45 = true;
				} else {
					return;
				}
			}
		} catch (@Pc(160) RuntimeException local160) {
			signlink.reporterror("35071, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + local160.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "I", descriptor = "(I)V")
	private void method154() {
		try {
			if (this.anInt139 == 0) {
				@Pc(6) int local6 = super.anInt81;
				if (this.anInt109 == 1 && super.anInt82 >= 520 && super.anInt83 >= 165 && super.anInt82 <= 788 && super.anInt83 <= 230) {
					local6 = 0;
				}
				@Pc(43) int local43;
				@Pc(46) int local46;
				@Pc(109) int local109;
				if (this.aBoolean52) {
					if (local6 != 1) {
						local43 = super.anInt79;
						local46 = super.anInt80;
						if (this.anInt93 == 0) {
							local43 -= 8;
							local46 -= 11;
						}
						if (this.anInt93 == 1) {
							local43 -= 562;
							local46 -= 231;
						}
						if (local43 < this.anInt94 - 10 || local43 > this.anInt94 + this.anInt96 + 10 || local46 < this.anInt95 - 10 || local46 > this.anInt95 + this.anInt97 + 10) {
							this.aBoolean52 = false;
							if (this.anInt93 == 1) {
								this.aBoolean44 = true;
							}
						}
					}
					if (local6 == 1) {
						local43 = this.anInt94;
						local46 = this.anInt95;
						local109 = this.anInt96;
						@Pc(112) int local112 = super.anInt82;
						@Pc(115) int local115 = super.anInt83;
						if (this.anInt93 == 0) {
							local112 -= 8;
							local115 -= 11;
						}
						if (this.anInt93 == 1) {
							local112 -= 562;
							local115 -= 231;
						}
						@Pc(128) int local128 = -1;
						for (@Pc(130) int local130 = 0; local130 < this.anInt112; local130++) {
							@Pc(145) int local145 = local46 + (this.anInt112 - 1 - local130) * 15 + 31;
							if (local112 > local43 && local112 < local43 + local109 && local115 > local145 - 13 && local115 < local145 + 3) {
								local128 = local130;
							}
						}
						if (local128 != -1) {
							this.method112(this.anInt113, local128);
						}
						this.aBoolean52 = false;
						if (this.anInt93 == 1) {
							this.aBoolean44 = true;
							return;
						}
					}
				} else {
					if (local6 == 1 && this.anInt112 > 0) {
						local43 = this.anIntArray48[this.anInt112 - 1];
						if (local43 == 288 || local43 == 776 || local43 == 857 || local43 == 881 || local43 == 688 || local43 == 649 || local43 == 408 || local43 == 176 || local43 == 294 || local43 == 622 || local43 == 517) {
							local46 = this.anIntArray46[this.anInt112 - 1];
							local109 = this.anIntArray47[this.anInt112 - 1];
							@Pc(256) Class9 local256 = Class9.aClass9Array1[local109];
							if (local256.aBoolean73) {
								this.aBoolean39 = false;
								this.anInt137 = local109;
								this.anInt138 = local46;
								this.anInt139 = 2;
								this.anInt140 = super.anInt82;
								this.anInt141 = super.anInt83;
								if (Class9.aClass9Array1[local109].anInt273 == this.anInt229) {
									this.anInt139 = 1;
								}
								if (Class9.aClass9Array1[local109].anInt273 == this.anInt107) {
									this.anInt139 = 3;
								}
								return;
							}
						}
					}
					if (local6 == 1 && this.anInt125 == 1 && this.anInt112 > 2) {
						local6 = 2;
					}
					if (local6 == 1 && this.anInt112 > 0) {
						this.method112(this.anInt113, this.anInt112 - 1);
					}
					if (local6 != 2 || this.anInt112 <= 0) {
						return;
					}
					this.method83();
				}
			}
		} catch (@Pc(338) RuntimeException local338) {
			signlink.reporterror("60973, " + ", " + local338.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "l", descriptor = "(Z)V")
	private void method155() {
		try {
			this.aClass29_4.method409();
			@Pc(13) int local13 = this.aClass1_Sub1_Sub3_Sub2_1.anInt742 / 32 + 48;
			@Pc(21) int local21 = 464 - this.aClass1_Sub1_Sub3_Sub2_1.anInt743 / 32;
			this.aClass1_Sub3_Sub2_Sub2_10.method287(this.anIntArray52, 146, 151, this.anIntArray39, 21, 9, local13, this.anInt215, local21);
			this.aClass1_Sub3_Sub2_Sub2_9.method287(this.anIntArray31, 33, 33, this.anIntArray40, 0, 0, 25, this.anInt215, 25);
			for (@Pc(55) int local55 = 0; local55 < this.anInt135; local55++) {
				local13 = this.anIntArray27[local55] * 4 + 2 - this.aClass1_Sub1_Sub3_Sub2_1.anInt742 / 32;
				local21 = this.anIntArray28[local55] * 4 + 2 - this.aClass1_Sub1_Sub3_Sub2_1.anInt743 / 32;
				this.method164(this.aByte10, local21, this.aClass1_Sub3_Sub2_Sub2Array4[local55], local13);
			}
			@Pc(108) int local108;
			for (@Pc(104) int local104 = 0; local104 < 104; local104++) {
				for (local108 = 0; local108 < 104; local108++) {
					@Pc(120) Class25 local120 = this.aClass25ArrayArrayArray1[this.anInt119][local104][local108];
					if (local120 != null) {
						local13 = local104 * 4 + 2 - this.aClass1_Sub1_Sub3_Sub2_1.anInt742 / 32;
						local21 = local108 * 4 + 2 - this.aClass1_Sub1_Sub3_Sub2_1.anInt743 / 32;
						this.method164(this.aByte10, local21, this.aClass1_Sub3_Sub2_Sub2_3, local13);
					}
				}
			}
			for (local108 = 0; local108 < this.anInt230; local108++) {
				@Pc(174) Class1_Sub1_Sub3_Sub1 local174 = this.aClass1_Sub1_Sub3_Sub1Array1[this.anIntArray63[local108]];
				if (local174 != null && local174.method516() && local174.aClass40_1.aBoolean158) {
					local13 = local174.anInt742 / 32 - this.aClass1_Sub1_Sub3_Sub2_1.anInt742 / 32;
					local21 = local174.anInt743 / 32 - this.aClass1_Sub1_Sub3_Sub2_1.anInt743 / 32;
					this.method164(this.aByte10, local21, this.aClass1_Sub3_Sub2_Sub2_4, local13);
				}
			}
			for (@Pc(221) int local221 = 0; local221 < this.anInt128; local221++) {
				@Pc(231) Class1_Sub1_Sub3_Sub2 local231 = this.aClass1_Sub1_Sub3_Sub2Array1[this.anIntArray25[local221]];
				if (local231 != null && local231.method516()) {
					local13 = local231.anInt742 / 32 - this.aClass1_Sub1_Sub3_Sub2_1.anInt742 / 32;
					local21 = local231.anInt743 / 32 - this.aClass1_Sub1_Sub3_Sub2_1.anInt743 / 32;
					@Pc(261) boolean local261 = false;
					@Pc(265) long local265 = Class37.method481(local231.aString27);
					for (@Pc(267) int local267 = 0; local267 < this.anInt89; local267++) {
						if (local265 == this.aLongArray4[local267] && this.anIntArray30[local267] != 0) {
							local261 = true;
							break;
						}
					}
					if (local261) {
						this.method164(this.aByte10, local21, this.aClass1_Sub3_Sub2_Sub2_6, local13);
					} else {
						this.method164(this.aByte10, local21, this.aClass1_Sub3_Sub2_Sub2_5, local13);
					}
				}
			}
			Class1_Sub3_Sub2.method317(16777215, this.anInt157, 3, 82, 3, 93);
			this.aClass29_5.method409();
			this.aBoolean41 &= true;
		} catch (@Pc(335) RuntimeException local335) {
			signlink.reporterror("6654, " + true + ", " + local335.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;IZ)V")
	private void method156(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		signlink.errorname = arg0;
		try {
			if (!arg3) {
				this.aString13 = "";
				this.aString14 = "Connecting to server...";
				this.method127();
			}
			this.aClass6_1 = new Class6(this, 994, this.method151(this.anInt208 + 43594));
			this.aClass6_1.method177(this.aClass1_Sub3_Sub3_1.aByteArray4, 0, 8);
			this.aClass1_Sub3_Sub3_1.anInt433 = 0;
			this.aLong6 = this.aClass1_Sub3_Sub3_1.method386();
			@Pc(48) int[] local48 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (this.aLong6 >> 32), (int) this.aLong6 };
			this.aClass1_Sub3_Sub3_3.anInt433 = 0;
			this.aClass1_Sub3_Sub3_3.method372(10);
			this.aClass1_Sub3_Sub3_3.method375(local48[0]);
			this.aClass1_Sub3_Sub3_3.method375(local48[1]);
			this.aClass1_Sub3_Sub3_3.method375(local48[2]);
			this.aClass1_Sub3_Sub3_3.method375(local48[3]);
			this.aClass1_Sub3_Sub3_3.method375(arg2);
			this.aClass1_Sub3_Sub3_3.method377(arg0);
			this.aClass1_Sub3_Sub3_3.method377(arg1);
			this.aClass1_Sub3_Sub3_3.method395(aBigInteger2, aBigInteger1);
			this.aClass1_Sub3_Sub3_2.anInt433 = 0;
			if (arg3) {
				this.aClass1_Sub3_Sub3_2.method372(18);
			} else {
				this.aClass1_Sub3_Sub3_2.method372(16);
			}
			this.aClass1_Sub3_Sub3_2.method372(this.aClass1_Sub3_Sub3_3.anInt433 + 32 + 1);
			this.aClass1_Sub3_Sub3_2.method372(194);
			for (@Pc(158) int local158 = 0; local158 < 8; local158++) {
				this.aClass1_Sub3_Sub3_2.method375(this.anIntArray21[local158]);
			}
			this.aClass1_Sub3_Sub3_2.method378(this.aClass1_Sub3_Sub3_3.aByteArray4, this.aClass1_Sub3_Sub3_3.anInt433);
			this.aClass1_Sub3_Sub3_3.aClass35_2 = new Class35(true, local48);
			for (@Pc(192) int local192 = 0; local192 < 4; local192++) {
				local48[local192] += 50;
			}
			this.aClass35_1 = new Class35(true, local48);
			this.aClass6_1.method178(this.aClass1_Sub3_Sub3_2.aByteArray4, this.aClass1_Sub3_Sub3_2.anInt433);
			@Pc(227) int local227 = this.aClass6_1.method175();
			if (local227 == 1) {
				try {
					Thread.sleep(2000L);
				} catch (@Pc(234) Exception local234) {
				}
				this.method156(arg0, arg1, arg2, arg3);
				return;
			}
			if (local227 == 2) {
				this.aBoolean41 = true;
				this.aClass1_Sub3_Sub3_3.anInt433 = 0;
				this.aClass1_Sub3_Sub3_1.anInt433 = 0;
				this.anInt161 = -1;
				this.anInt199 = -1;
				this.anInt200 = -1;
				this.anInt201 = -1;
				this.anInt160 = 0;
				this.anInt162 = 0;
				this.anInt123 = 0;
				this.anInt112 = 0;
				this.aBoolean52 = false;
				super.anInt77 = 0;
				for (@Pc(287) int local287 = 0; local287 < 100; local287++) {
					this.aStringArray3[local287] = null;
				}
				this.anInt114 = 0;
				this.anInt109 = 0;
				this.anInt232 = 0;
				this.anInt194 = -1;
				this.anInt128 = 0;
				this.anInt230 = 0;
				for (@Pc(318) int local318 = 0; local318 < this.anInt126; local318++) {
					this.aClass1_Sub1_Sub3_Sub2Array1[local318] = null;
					this.aClass1_Sub3_Sub3Array1[local318] = null;
				}
				for (@Pc(337) int local337 = 0; local337 < 8192; local337++) {
					this.aClass1_Sub1_Sub3_Sub1Array1[local337] = null;
				}
				this.aClass1_Sub1_Sub3_Sub2_1 = this.aClass1_Sub1_Sub3_Sub2Array1[this.anInt127] = new Class1_Sub1_Sub3_Sub2();
				this.aClass25_4.method406();
				this.aClass25_2.method406();
				this.aClass25_1.method406();
				@Pc(374) int local374;
				for (@Pc(370) int local370 = 0; local370 < 4; local370++) {
					for (local374 = 0; local374 < 104; local374++) {
						for (@Pc(378) int local378 = 0; local378 < 104; local378++) {
							this.aClass25ArrayArrayArray1[local370][local374][local378] = null;
						}
					}
				}
				this.aClass25_3 = new Class25(5);
				this.anInt89 = 0;
				this.anInt107 = -1;
				this.anInt229 = -1;
				this.anInt235 = -1;
				this.aBoolean53 = false;
				this.anInt202 = 3;
				this.aBoolean46 = false;
				this.aBoolean52 = false;
				this.aBoolean42 = false;
				this.anInt108 = 0;
				this.aBoolean57 = true;
				this.method95();
				for (local374 = 0; local374 < 5; local374++) {
					this.anIntArray32[local374] = 0;
				}
				this.method94();
				if (this.anInt208 >= 3) {
					Class8.method185();
				}
				return;
			}
			if (local227 == 3) {
				this.aString13 = "";
				this.aString14 = "Invalid username or password.";
				return;
			}
			if (local227 == 4) {
				this.aString13 = "Your account has been disabled.";
				this.aString14 = "Please check your message-centre for details.";
				return;
			}
			if (local227 == 5) {
				this.aString13 = "Your account is already logged in.";
				this.aString14 = "Try again in 60 secs...";
				return;
			}
			if (local227 == 6) {
				this.aString13 = "RuneScape has been updated!";
				this.aString14 = "Please reload this page.";
				return;
			}
			if (local227 == 7) {
				this.aString13 = "This world is full.";
				this.aString14 = "Please use a different world.";
				return;
			}
			if (local227 == 8) {
				this.aString13 = "Unable to connect.";
				this.aString14 = "Login server offline.";
				return;
			}
			if (local227 == 9) {
				this.aString13 = "Login limit exceeded.";
				this.aString14 = "Too many connections from your address.";
				return;
			}
			if (local227 == 10) {
				this.aString13 = "Unable to connect.";
				this.aString14 = "Bad session id.";
				return;
			}
			if (local227 == 11) {
				this.aString14 = "Login server rejected session.";
				this.aString14 = "Please try again";
				return;
			}
			if (local227 == 12) {
				this.aString13 = "You need a members account to beta-test";
				this.aString14 = "Please subscribe, or play RS1 instead";
				return;
			}
			if (local227 == 13) {
				this.aString13 = "Could not complete login";
				this.aString14 = "Please try using a different world";
				return;
			}
			if (local227 == 14) {
				this.aString13 = "The server is being updated";
				this.aString14 = "Please wait 1 minute and try again";
				return;
			}
			if (local227 == 15) {
				this.aBoolean41 = true;
				this.aClass1_Sub3_Sub3_3.anInt433 = 0;
				this.aClass1_Sub3_Sub3_1.anInt433 = 0;
				this.anInt161 = -1;
				this.anInt199 = -1;
				this.anInt200 = -1;
				this.anInt201 = -1;
				this.anInt160 = 0;
				this.anInt162 = 0;
				this.anInt123 = 0;
				this.anInt112 = 0;
				this.aBoolean52 = false;
				if (this.anInt208 >= 3) {
					Class8.method185();
				}
				return;
			}
			if (local227 == 16) {
				this.aString13 = "Login attempts exceeded";
				this.aString14 = "Please wait 1 minute and try again";
				return;
			}
		} catch (@Pc(645) IOException local645) {
			this.aString13 = "";
			this.aString14 = "Error connecting to server.";
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/Runnable;I)V")
	@Override
	public void method65(@OriginalArg(0) Runnable arg0, @OriginalArg(1) int arg1) {
		if (signlink.mainapp == null) {
			super.method65(arg0, arg1);
		} else {
			signlink.startthread(arg0, arg1);
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/String;)Ljava/io/DataInputStream;")
	private DataInputStream method157(@OriginalArg(0) String arg0) throws IOException {
		return signlink.mainapp == null ? new DataInputStream((new URL(this.getCodeBase(), arg0)).openStream()) : signlink.openurl(arg0);
	}

	@OriginalMember(owner = "client!client", name = "f", descriptor = "(B)V")
	private void method158(@OriginalArg(0) byte arg0) {
		try {
			this.aClass29_3.method409();
			Class1_Sub3_Sub2_Sub1.anIntArray126 = this.anIntArray57;
			this.aClass1_Sub3_Sub2_Sub3_6.method307(0, this.anInt184, 0);
			@Pc(20) boolean local20 = false;
			if (this.anInt235 != -1) {
				this.method106(this.aBoolean47, Class9.aClass9Array1[this.anInt235], 0, 0, 0);
			} else if (this.anIntArray20[this.anInt202] != -1) {
				this.method106(this.aBoolean47, Class9.aClass9Array1[this.anIntArray20[this.anInt202]], 0, 0, 0);
			}
			if (this.aBoolean52 && this.anInt93 == 1) {
				this.method129();
			}
			this.aClass29_3.method410(562, super.aGraphics2, 231, this.aByte11);
			this.aClass29_5.method409();
			Class1_Sub3_Sub2_Sub1.anIntArray126 = this.anIntArray58;
		} catch (@Pc(93) RuntimeException local93) {
			signlink.reporterror("78, " + arg0 + ", " + local93.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "m", descriptor = "(Z)V")
	private void method159() {
		try {
			@Pc(8) byte[] local8 = this.aClass36_1.method479((byte) 6, null, "title.dat");
			@Pc(14) Class1_Sub3_Sub2_Sub2 local14 = new Class1_Sub3_Sub2_Sub2(local8, this);
			this.aClass29_10.method409();
			local14.method281(0, anInt174, 0);
			this.aClass29_11.method409();
			local14.method281(0, anInt174, -661);
			this.aClass29_7.method409();
			local14.method281(0, anInt174, -128);
			this.aClass29_8.method409();
			local14.method281(-386, anInt174, -214);
			this.aClass29_9.method409();
			local14.method281(-186, anInt174, -214);
			this.aClass29_12.method409();
			local14.method281(-265, anInt174, 0);
			this.aClass29_13.method409();
			local14.method281(-265, anInt174, -574);
			this.aClass29_14.method409();
			local14.method281(-186, anInt174, -128);
			this.aClass29_15.method409();
			local14.method281(-186, anInt174, -574);
			@Pc(107) int[] local107 = new int[local14.anInt361];
			for (@Pc(109) int local109 = 0; local109 < local14.anInt362; local109++) {
				for (@Pc(113) int local113 = 0; local113 < local14.anInt361; local113++) {
					local107[local113] = local14.anIntArray135[local14.anInt361 + local14.anInt361 * local109 - local113 - 1];
				}
				for (@Pc(139) int local139 = 0; local139 < local14.anInt361; local139++) {
					local14.anIntArray135[local139 + local14.anInt361 * local109] = local107[local139];
				}
			}
			this.aClass29_10.method409();
			local14.method281(0, anInt174, 394);
			this.aClass29_11.method409();
			local14.method281(0, anInt174, -267);
			this.aClass29_7.method409();
			local14.method281(0, anInt174, 266);
			this.aClass29_8.method409();
			local14.method281(-386, anInt174, 180);
			this.aClass29_9.method409();
			local14.method281(-186, anInt174, 180);
			this.aClass29_12.method409();
			local14.method281(-265, anInt174, 394);
			this.aClass29_13.method409();
			local14.method281(-265, anInt174, -180);
			this.aClass29_14.method409();
			local14.method281(-186, anInt174, 212);
			this.aClass29_15.method409();
			local14.method281(-186, anInt174, -180);
			local14 = new Class1_Sub3_Sub2_Sub2(this.aClass36_1, "logo", 0);
			this.aClass29_7.method409();
			local14.method283(18, this.anInt184, super.anInt75 / 2 - local14.anInt361 / 2 - 128);
			System.gc();
		} catch (@Pc(281) RuntimeException local281) {
			signlink.reporterror("35466, " + false + ", " + local281.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Z)V")
	@Override
	protected void method63() {
		try {
			this.aBoolean37 = true;
		} catch (@Pc(9) RuntimeException local9) {
			signlink.reporterror("41445, " + false + ", " + local9.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIII)V")
	private void method160(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		try {
			@Pc(8) int local8 = this.aClass30_1.method437(arg2, arg1, arg0);
			@Pc(18) int local18;
			@Pc(24) int local24;
			@Pc(28) int local28;
			@Pc(30) int local30;
			@Pc(38) int[] local38;
			@Pc(52) int local52;
			if (local8 != 0) {
				local18 = this.aClass30_1.method441(arg2, arg1, arg0, local8);
				local24 = local18 >> 6 & 0x3;
				local28 = local18 & 0x1F;
				local30 = 15658734;
				if (local8 > 0) {
					local30 = 15597568;
				}
				local38 = this.aClass1_Sub3_Sub2_Sub2_10.anIntArray135;
				local52 = arg1 * 4 + (103 - arg0) * 512 * 4 + 24624;
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
			}
			local8 = this.aClass30_1.method439(arg2, arg1, arg0);
			if (local8 != 0) {
				local18 = this.aClass30_1.method441(arg2, arg1, arg0, local8);
				local24 = local18 >> 6 & 0x3;
				local28 = local18 & 0x1F;
				if (local28 == 9) {
					local30 = 15658734;
					if (local8 > 0) {
						local30 = 15597568;
					}
					local38 = this.aClass1_Sub3_Sub2_Sub2_10.anIntArray135;
					local52 = arg1 * 4 + (103 - arg0) * 512 * 4 + 24624;
					if (local24 == 0 || local24 == 2) {
						local38[local52 + 1536] = local30;
						local38[local52 + 1024 + 1] = local30;
						local38[local52 + 512 + 2] = local30;
						local38[local52 + 3] = local30;
					} else {
						local38[local52] = local30;
						local38[local52 + 512 + 1] = local30;
						local38[local52 + 1024 + 2] = local30;
						local38[local52 + 1536 + 3] = local30;
					}
				}
				if (local28 != 10 && local28 != 11) {
					return;
				}
				local30 = local8 >> 14 & 0x7FFF;
				@Pc(482) Class39 local482 = Class39.method496(local30);
				if (local482.anInt669 != -1) {
					@Pc(492) Class1_Sub3_Sub2_Sub3 local492 = this.aClass1_Sub3_Sub2_Sub3Array1[local482.anInt669];
					@Pc(502) int local502 = (local482.anInt664 * 4 - local492.anInt388) / 2;
					@Pc(512) int local512 = (local482.anInt665 * 4 - local492.anInt389) / 2;
					local492.method307((104 - arg0 - local482.anInt665) * 4 + local512 + 48, this.anInt184, arg1 * 4 + local502 + 48);
					return;
				}
			}
		} catch (@Pc(537) RuntimeException local537) {
			signlink.reporterror("99302, " + arg0 + ", " + arg1 + ", " + -29363 + ", " + arg2 + ", " + local537.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ZI)V")
	private void method161(@OriginalArg(1) int arg0) {
		try {
			@Pc(5) int[] local5 = this.aClass1_Sub3_Sub2_Sub2_10.anIntArray135;
			@Pc(14) int local14 = local5.length;
			for (@Pc(16) int local16 = 0; local16 < local14; local16++) {
				local5[local16] = 0;
			}
			@Pc(40) int local40;
			@Pc(42) int local42;
			for (@Pc(28) int local28 = 1; local28 < 103; local28++) {
				local40 = (103 - local28) * 512 * 4 + 24628;
				for (local42 = 1; local42 < 103; local42++) {
					if ((this.aByteArrayArrayArray7[arg0][local42][local28] & 0x18) == 0) {
						this.aClass30_1.method446(local5, local40, arg0, local42, local28);
					}
					if (arg0 < 3 && (this.aByteArrayArrayArray7[arg0 + 1][local42][local28] & 0x8) != 0) {
						this.aClass30_1.method446(local5, local40, arg0 + 1, local42, local28);
					}
					local40 += 4;
				}
			}
			this.aClass1_Sub3_Sub2_Sub2_10.method280();
			for (local40 = 1; local40 < 103; local40++) {
				for (local42 = 1; local42 < 103; local42++) {
					if ((this.aByteArrayArrayArray7[arg0][local42][local40] & 0x18) == 0) {
						this.method160(local40, local42, arg0);
					}
					if (arg0 < 3 && (this.aByteArrayArrayArray7[arg0 + 1][local42][local40] & 0x8) != 0) {
						this.method160(local40, local42, arg0 + 1);
					}
				}
			}
			this.aClass29_5.method409();
			this.anInt135 = 0;
			for (local42 = 0; local42 < 104; local42++) {
				for (@Pc(174) int local174 = 0; local174 < 104; local174++) {
					@Pc(184) int local184 = this.aClass30_1.method440(this.anInt119, local42, local174);
					if (local184 != 0) {
						local184 = local184 >> 14 & 0x7FFF;
						@Pc(196) int local196 = Class39.method496(local184).anInt668;
						if (local196 >= 0) {
							this.aClass1_Sub3_Sub2_Sub2Array4[this.anInt135] = this.aClass1_Sub3_Sub2_Sub2Array5[local196];
							this.anIntArray27[this.anInt135] = local42;
							this.anIntArray28[this.anInt135] = local174;
							this.anInt135++;
						}
					}
				}
			}
		} catch (@Pc(235) RuntimeException local235) {
			signlink.reporterror("42920, " + false + ", " + arg0 + ", " + local235.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(BLclient!ec;)Z")
	private boolean method162(@OriginalArg(1) Class9 arg0) {
		try {
			if (arg0.anIntArray108 == null) {
				return false;
			}
			for (@Pc(18) int local18 = 0; local18 < arg0.anIntArray108.length; local18++) {
				@Pc(26) int local26 = this.method76(local18, arg0);
				@Pc(31) int local31 = arg0.anIntArray109[local18];
				if (arg0.anIntArray108[local18] == 2) {
					if (local26 >= local31) {
						return false;
					}
				} else if (arg0.anIntArray108[local18] == 3) {
					if (local26 <= local31) {
						return false;
					}
				} else if (arg0.anIntArray108[local18] == 4) {
					if (local26 == local31) {
						return false;
					}
				} else if (local26 != local31) {
					return false;
				}
			}
			return true;
		} catch (@Pc(78) RuntimeException local78) {
			signlink.reporterror("20484, " + 3 + ", " + arg0 + ", " + local78.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "init", descriptor = "()V")
	@Override
	public void init() {
		this.anInt208 = Integer.parseInt(this.getParameter("portoff"));
		this.anInt118 = Integer.parseInt(this.getParameter("nodeid"));
		@Pc(15) String local15 = this.getParameter("lowmem");
		if (local15 != null && local15.equals("1")) {
			method147();
		} else {
			method168();
		}
		this.method55();
	}

	@OriginalMember(owner = "client!client", name = "gettune", descriptor = "()Ljava/lang/String;")
	private String method163() {
		if (signlink.midi == null) {
			return "none";
		} else {
			@Pc(12) String local12 = signlink.midi + ".mid.gz";
			signlink.midi = null;
			return local12;
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(BILclient!hb;I)V")
	private void method164(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class1_Sub3_Sub2_Sub2 arg2, @OriginalArg(3) int arg3) {
		try {
			@Pc(7) int local7 = arg3 * arg3 + arg1 * arg1;
			@Pc(13) int local13;
			if (arg0 != this.aByte9) {
				for (local13 = 1; local13 > 0; local13++) {
				}
			}
			if (local7 <= 6400) {
				local13 = Class1_Sub3_Sub1.anIntArray102[this.anInt215];
				@Pc(32) int local32 = Class1_Sub3_Sub1.anIntArray103[this.anInt215];
				@Pc(42) int local42 = arg1 * local13 + arg3 * local32 >> 16;
				@Pc(52) int local52 = arg1 * local32 - arg3 * local13 >> 16;
				if (local7 > 2500) {
					arg2.method288(local42 + 94 - arg2.anInt361 / 2, this.aClass1_Sub3_Sub2_Sub3_7, 83 - local52 - arg2.anInt362 / 2);
				} else {
					arg2.method283(83 - local52 - arg2.anInt362 / 2, this.anInt184, local42 + 94 - arg2.anInt361 / 2);
				}
			}
		} catch (@Pc(99) RuntimeException local99) {
			signlink.reporterror("12544, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local99.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ZIIIIIII)V")
	private void method165(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		try {
			this.aBoolean41 &= true;
			if (arg3 >= 1 && arg2 >= 1 && arg3 <= 102 && arg2 <= 102) {
				if (aBoolean36 && arg0 != this.anInt119) {
					return;
				}
				@Pc(26) int local26 = 0;
				if (arg4 == 0) {
					local26 = this.aClass30_1.method437(arg0, arg3, arg2);
				}
				if (arg4 == 1) {
					local26 = this.aClass30_1.method438(arg3, arg2, this.anInt176, arg0);
				}
				if (arg4 == 2) {
					local26 = this.aClass30_1.method439(arg0, arg3, arg2);
				}
				if (arg4 == 3) {
					local26 = this.aClass30_1.method440(arg0, arg3, arg2);
				}
				@Pc(83) int local83;
				if (local26 != 0) {
					local83 = this.aClass30_1.method441(arg0, arg3, arg2, local26);
					@Pc(89) int local89 = local26 >> 14 & 0x7FFF;
					@Pc(93) int local93 = local83 & 0x1F;
					@Pc(97) int local97 = local83 >> 6;
					@Pc(110) Class39 local110;
					if (arg4 == 0) {
						this.aClass30_1.method432(this.anInt136, arg0, arg3, arg2);
						local110 = Class39.method496(local89);
						if (local110.aBoolean146) {
							this.aClass3Array1[arg0].method29(arg3, local97, local110.aBoolean147, arg2, local93);
						}
					}
					if (arg4 == 1) {
						this.aClass30_1.method433(arg3, arg0, arg2);
					}
					if (arg4 == 2) {
						this.aClass30_1.method434(arg2, arg0, arg3);
						local110 = Class39.method496(local89);
						if (arg3 + local110.anInt664 > 103 || arg2 + local110.anInt664 > 103 || arg3 + local110.anInt665 > 103 || arg2 + local110.anInt665 > 103) {
							return;
						}
						if (local110.aBoolean146) {
							this.aClass3Array1[arg0].method30(arg2, local110.anInt665, local110.aBoolean147, local110.anInt664, local97, arg3);
						}
					}
					if (arg4 == 3) {
						this.aClass30_1.method435(arg2, arg3, arg0);
						local110 = Class39.method496(local89);
						if (local110.aBoolean146 && local110.aBoolean148) {
							this.aClass3Array1[arg0].method32(arg3, arg2);
						}
					}
				}
				if (arg5 >= 0) {
					local83 = arg0;
					if (arg0 < 3 && (this.aByteArrayArrayArray7[1][arg3][arg2] & 0x2) == 2) {
						local83 = arg0 + 1;
					}
					Class4.method49(arg5, this.aClass30_1, arg1, arg6, arg0, arg3, this.aClass3Array1[arg0], this.aClass25_5, this.anIntArrayArrayArray3, arg2, local83);
					return;
				}
			}
		} catch (@Pc(259) RuntimeException local259) {
			signlink.reporterror("66143, " + true + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + local259.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILclient!z;III)V")
	private void method166(@OriginalArg(1) Class1_Sub1_Sub3_Sub2 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		try {
			if (arg0 != this.aClass1_Sub1_Sub3_Sub2_1 && this.anInt112 < 400) {
				@Pc(38) String local38 = arg0.aString27 + method115(arg0.anInt793, this.aClass1_Sub1_Sub3_Sub2_1.anInt793) + " (level-" + arg0.anInt793 + ")";
				if (this.anInt114 == 1) {
					this.aStringArray2[this.anInt112] = "Use " + this.aString5 + " with @whi@" + local38;
					this.anIntArray48[this.anInt112] = 933;
					this.anIntArray49[this.anInt112] = arg1;
					this.anIntArray46[this.anInt112] = arg3;
					this.anIntArray47[this.anInt112] = arg2;
					this.anInt112++;
				} else if (this.anInt109 != 1) {
					this.aStringArray2[this.anInt112] = "Follow @whi@" + local38;
					this.anIntArray48[this.anInt112] = 900;
					this.anIntArray49[this.anInt112] = arg1;
					this.anIntArray46[this.anInt112] = arg3;
					this.anIntArray47[this.anInt112] = arg2;
					this.anInt112++;
					this.aStringArray2[this.anInt112] = "Trade with @whi@" + local38;
					this.anIntArray48[this.anInt112] = 364;
					this.anIntArray49[this.anInt112] = arg1;
					this.anIntArray46[this.anInt112] = arg3;
					this.anIntArray47[this.anInt112] = arg2;
					this.anInt112++;
					if (this.anInt121 <= 0) {
						return;
					}
					this.aStringArray2[this.anInt112] = "Attack @whi@" + local38;
					this.anIntArray48[this.anInt112] = 487;
					this.anIntArray49[this.anInt112] = arg1;
					this.anIntArray46[this.anInt112] = arg3;
					this.anIntArray47[this.anInt112] = arg2;
					this.anInt112++;
				} else if ((this.anInt111 & 0x8) == 8) {
					this.aStringArray2[this.anInt112] = this.aString4 + " @whi@" + local38;
					this.anIntArray48[this.anInt112] = 989;
					this.anIntArray49[this.anInt112] = arg1;
					this.anIntArray46[this.anInt112] = arg3;
					this.anIntArray47[this.anInt112] = arg2;
					this.anInt112++;
					return;
				}
			}
		} catch (@Pc(278) RuntimeException local278) {
			signlink.reporterror("47776, " + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local278.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(IIII)I")
	private int method167(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		try {
			@Pc(7) int local7 = 256 - arg1;
			return ((arg0 & 0xFF00FF) * local7 + (arg2 & 0xFF00FF) * arg1 & 0xFF00FF00) + ((arg0 & 0xFF00) * local7 + (arg2 & 0xFF00) * arg1 & 0xFF0000) >> 8;
		} catch (@Pc(38) RuntimeException local38) {
			signlink.reporterror("55888, " + 746 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local38.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "K", descriptor = "(I)V")
	private void method169() {
		try {
			for (@Pc(3) int local3 = -1; local3 < this.anInt128; local3++) {
				@Pc(11) int local11;
				if (local3 == -1) {
					local11 = this.anInt127;
				} else {
					local11 = this.anIntArray25[local3];
				}
				@Pc(23) Class1_Sub1_Sub3_Sub2 local23 = this.aClass1_Sub1_Sub3_Sub2Array1[local11];
				if (local23 != null) {
					this.method135(1, local23);
				}
			}
		} catch (@Pc(39) RuntimeException local39) {
			signlink.reporterror("91777, " + 116 + ", " + local39.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "L", descriptor = "(I)V")
	private void method170(@OriginalArg(0) int arg0) {
		try {
			if (this.anInt112 >= 2 || this.anInt114 != 0 || this.anInt109 != 0) {
				@Pc(31) String local31;
				if (this.anInt114 == 1 && this.anInt112 < 2) {
					local31 = "Use " + this.aString5 + " with...";
				} else if (this.anInt109 == 1 && this.anInt112 < 2) {
					local31 = this.aString4 + "...";
				} else {
					local31 = this.aStringArray2[this.anInt112 - 1];
				}
				if (this.anInt112 > 2) {
					local31 = local31 + "@whi@ / " + (this.anInt112 - 2) + " more options";
				}
				this.aClass1_Sub3_Sub2_Sub4_3.method326(true, 4, 16777215, 15, local31);
				if (arg0 >= 0) {
					this.anInt168 = -499;
				}
			}
		} catch (@Pc(97) RuntimeException local97) {
			signlink.reporterror("39387, " + arg0 + ", " + local97.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "M", descriptor = "(I)V")
	private void method171() {
		try {
			this.aBoolean54 = false;
			while (this.aBoolean40) {
				this.aBoolean54 = false;
				try {
					Thread.sleep(50L);
				} catch (@Pc(11) Exception local11) {
				}
			}
			this.aClass1_Sub3_Sub2_Sub3_19 = null;
			this.aClass1_Sub3_Sub2_Sub3_20 = null;
			this.aClass1_Sub3_Sub2_Sub3Array2 = null;
			this.anIntArray35 = null;
			this.anIntArray36 = null;
			this.anIntArray37 = null;
			this.anIntArray38 = null;
			this.anIntArray61 = null;
			this.anIntArray62 = null;
			this.anIntArray33 = null;
			this.anIntArray34 = null;
			this.aClass1_Sub3_Sub2_Sub2_1 = null;
			this.aClass1_Sub3_Sub2_Sub2_2 = null;
		} catch (@Pc(64) RuntimeException local64) {
			signlink.reporterror("60556, " + -43634 + ", " + local64.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(ILclient!kb;I)V")
	private void method172(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub3_Sub3 arg1) {
		try {
			arg1.method390(this.anInt168);
			@Pc(15) int local15 = arg1.method391(1);
			if (local15 != 0) {
				@Pc(23) int local23 = arg1.method391(2);
				if (local23 == 0) {
					this.anIntArray26[this.anInt129++] = this.anInt127;
				} else {
					@Pc(46) int local46;
					@Pc(57) int local57;
					if (local23 == 1) {
						local46 = arg1.method391(3);
						this.aClass1_Sub1_Sub3_Sub2_1.method515(false, local46, 112);
						local57 = arg1.method391(1);
						if (local57 == 1) {
							this.anIntArray26[this.anInt129++] = this.anInt127;
						}
					} else {
						@Pc(103) int local103;
						if (local23 == 2) {
							local46 = arg1.method391(3);
							this.aClass1_Sub1_Sub3_Sub2_1.method515(true, local46, 112);
							local57 = arg1.method391(3);
							this.aClass1_Sub1_Sub3_Sub2_1.method515(true, local57, 112);
							local103 = arg1.method391(1);
							if (local103 == 1) {
								this.anIntArray26[this.anInt129++] = this.anInt127;
							}
						} else if (local23 == 3) {
							this.anInt119 = arg1.method391(2);
							local46 = arg1.method391(7);
							local57 = arg1.method391(7);
							this.aClass1_Sub1_Sub3_Sub2_1.method514(local46, local57);
							local103 = arg1.method391(1);
							if (local103 == 1) {
								this.anIntArray26[this.anInt129++] = this.anInt127;
							}
						}
					}
				}
			}
		} catch (@Pc(166) RuntimeException local166) {
			signlink.reporterror("32694, " + arg0 + ", " + arg1 + ", " + -721 + ", " + local166.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(I)Ljava/awt/Component;")
	@Override
	protected Component method64() {
		try {
			if (signlink.mainapp == null) {
				return super.aFrame_Sub1_2 == null ? this : super.aFrame_Sub1_2;
			} else {
				return signlink.mainapp;
			}
		} catch (@Pc(19) RuntimeException local19) {
			signlink.reporterror("30567, " + -36374 + ", " + local19.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "g", descriptor = "(B)V")
	private void method173(@OriginalArg(0) byte arg0) {
		try {
			this.aClass29_6.method409();
			@Pc(10) boolean local10 = false;
			Class1_Sub3_Sub2_Sub1.anIntArray126 = this.anIntArray56;
			this.aClass1_Sub3_Sub2_Sub3_8.method307(0, this.anInt184, 0);
			if (this.aBoolean42) {
				this.aClass1_Sub3_Sub2_Sub4_3.method321(40, 0, 239, this.aString3);
				this.aClass1_Sub3_Sub2_Sub4_3.method321(60, 128, 239, this.aString11 + "*");
			} else if (this.aBoolean46) {
				this.aClass1_Sub3_Sub2_Sub4_3.method321(40, 0, 239, "Enter amount to transfer:");
				this.aClass1_Sub3_Sub2_Sub4_3.method321(60, 128, 239, this.aString12 + "*");
			} else if (this.anInt107 == -1) {
				@Pc(103) int local103 = 0;
				Class1_Sub3_Sub2.method315(77, 463, 0, 0);
				for (@Pc(111) int local111 = 0; local111 < 50; local111++) {
					if (this.aStringArray3[local111] != null) {
						@Pc(123) int local123 = this.anIntArray17[local111];
						@Pc(132) int local132 = this.anInt122 + 70 - local103 * 14;
						if (local123 == 0) {
							if (local132 > 0 && local132 < 110) {
								this.aClass1_Sub3_Sub2_Sub4_4.method324(this.aStringArray3[local111], 4, 0, local132);
							}
							local103++;
						}
						if (local123 == 1) {
							if (local132 > 0 && local132 < 110) {
								this.aClass1_Sub3_Sub2_Sub4_4.method324(this.aStringArray4[local111] + ":", 4, 16777215, local132);
								this.aClass1_Sub3_Sub2_Sub4_4.method324(this.aStringArray3[local111], this.aClass1_Sub3_Sub2_Sub4_4.method323(this.aStringArray4[local111]) + 12, 255, local132);
							}
							local103++;
						}
						if (local123 == 2 && (this.anInt234 == 0 || this.anInt234 == 1 && this.method125(this.aStringArray4[local111]))) {
							if (local132 > 0 && local132 < 110) {
								this.aClass1_Sub3_Sub2_Sub4_4.method324(this.aStringArray4[local111] + ":", 4, 0, local132);
								this.aClass1_Sub3_Sub2_Sub4_4.method324(this.aStringArray3[local111], this.aClass1_Sub3_Sub2_Sub4_4.method323(this.aStringArray4[local111]) + 12, 255, local132);
							}
							local103++;
						}
						if (local123 == 3 && (this.anInt133 == 0 || this.anInt133 == 1 && this.method125(this.aStringArray4[local111]))) {
							if (local132 > 0 && local132 < 110) {
								this.aClass1_Sub3_Sub2_Sub4_4.method324("From " + this.aStringArray4[local111] + ":", 4, 0, local132);
								this.aClass1_Sub3_Sub2_Sub4_4.method324(this.aStringArray3[local111], this.aClass1_Sub3_Sub2_Sub4_4.method323("From " + this.aStringArray4[local111]) + 12, 8388608, local132);
							}
							local103++;
						}
						if (local123 == 4 && (this.anInt169 == 0 || this.anInt169 == 1 && this.method125(this.aStringArray4[local111]))) {
							if (local132 > 0 && local132 < 110) {
								this.aClass1_Sub3_Sub2_Sub4_4.method324(this.aStringArray4[local111] + " " + this.aStringArray3[local111], 4, 8388736, local132);
							}
							local103++;
						}
						if (local123 == 5 && this.anInt133 < 2) {
							if (local132 > 0 && local132 < 110) {
								this.aClass1_Sub3_Sub2_Sub4_4.method324(this.aStringArray3[local111], 4, 8388608, local132);
							}
							local103++;
						}
						if (local123 == 6 && this.anInt133 < 2) {
							if (local132 > 0 && local132 < 110) {
								this.aClass1_Sub3_Sub2_Sub4_4.method324("To " + this.aStringArray4[local111] + ":", 4, 0, local132);
								this.aClass1_Sub3_Sub2_Sub4_4.method324(this.aStringArray3[local111], this.aClass1_Sub3_Sub2_Sub4_4.method323("To " + this.aStringArray4[local111]) + 12, 8388608, local132);
							}
							local103++;
						}
					}
				}
				Class1_Sub3_Sub2.method314();
				this.anInt99 = local103 * 14 + 7;
				if (this.anInt99 < 78) {
					this.anInt99 = 78;
				}
				this.method149(0, 463, this.anInt99, this.anInt99 - this.anInt122 - 77, 77);
				this.aClass1_Sub3_Sub2_Sub4_4.method324(this.aString10 + "*", 3, 0, 90);
				Class1_Sub3_Sub2.method319(479, 0, 77, 0);
			} else {
				this.method106(this.aBoolean47, Class9.aClass9Array1[this.anInt107], 0, 0, 0);
			}
			this.aClass29_6.method410(22, super.aGraphics2, 375, this.aByte11);
			this.aClass29_5.method409();
			Class1_Sub3_Sub2_Sub1.anIntArray126 = this.anIntArray58;
		} catch (@Pc(533) RuntimeException local533) {
			signlink.reporterror("9988, " + arg0 + ", " + local533.toString());
			throw new RuntimeException();
		}
	}
}
