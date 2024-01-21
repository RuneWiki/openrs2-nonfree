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
import java.util.Calendar;
import java.util.Date;
import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!client")
public final class client extends Applet_Sub1 {

	@OriginalMember(owner = "client!client", name = "Y", descriptor = "I")
	private static int anInt857;

	@OriginalMember(owner = "client!client", name = "db", descriptor = "I")
	private static int anInt860;

	@OriginalMember(owner = "client!client", name = "pb", descriptor = "I")
	private static int anInt868;

	@OriginalMember(owner = "client!client", name = "Ib", descriptor = "I")
	private static int anInt875;

	@OriginalMember(owner = "client!client", name = "Rb", descriptor = "I")
	private static int anInt882;

	@OriginalMember(owner = "client!client", name = "Ub", descriptor = "Z")
	private static boolean aBoolean198;

	@OriginalMember(owner = "client!client", name = "Uc", descriptor = "Z")
	private static boolean aBoolean205;

	@OriginalMember(owner = "client!client", name = "Vc", descriptor = "I")
	private static int anInt913;

	@OriginalMember(owner = "client!client", name = "id", descriptor = "I")
	private static int anInt919;

	@OriginalMember(owner = "client!client", name = "ud", descriptor = "I")
	private static int anInt930;

	@OriginalMember(owner = "client!client", name = "Hd", descriptor = "I")
	private static int anInt938;

	@OriginalMember(owner = "client!client", name = "Jd", descriptor = "I")
	private static int anInt939;

	@OriginalMember(owner = "client!client", name = "re", descriptor = "I")
	private static int anInt952;

	@OriginalMember(owner = "client!client", name = "af", descriptor = "I")
	private static int anInt960;

	@OriginalMember(owner = "client!client", name = "Wf", descriptor = "I")
	public static int anInt983;

	@OriginalMember(owner = "client!client", name = "sg", descriptor = "I")
	private static int anInt991;

	@OriginalMember(owner = "client!client", name = "Rg", descriptor = "I")
	private static int anInt1002;

	@OriginalMember(owner = "client!client", name = "bh", descriptor = "I")
	private static int anInt1007;

	@OriginalMember(owner = "client!client", name = "eh", descriptor = "Z")
	private static boolean aBoolean221;

	@OriginalMember(owner = "client!client", name = "th", descriptor = "Z")
	private static boolean aBoolean222;

	@OriginalMember(owner = "client!client", name = "ki", descriptor = "I")
	private static int anInt1026;

	@OriginalMember(owner = "client!client", name = "nj", descriptor = "I")
	private static int anInt1053;

	@OriginalMember(owner = "client!client", name = "xj", descriptor = "I")
	private static int anInt1059;

	@OriginalMember(owner = "client!client", name = "Wj", descriptor = "I")
	public static int anInt1075;

	@OriginalMember(owner = "client!client", name = "Yj", descriptor = "Z")
	private static boolean aBoolean237;

	@OriginalMember(owner = "client!client", name = "ek", descriptor = "Lclient!VJDNWPCM;")
	public static Class8_Sub1_Sub1_Sub1_Sub2 aClass8_Sub1_Sub1_Sub1_Sub2_1;

	@OriginalMember(owner = "client!client", name = "W", descriptor = "B")
	private static byte aByte21 = -79;

	@OriginalMember(owner = "client!client", name = "Z", descriptor = "Ljava/lang/String;")
	private static String aString17 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";

	@OriginalMember(owner = "client!client", name = "Yb", descriptor = "[I")
	private static int[] anIntArray215 = new int[99];

	@OriginalMember(owner = "client!client", name = "Dc", descriptor = "B")
	private static byte aByte23;

	@OriginalMember(owner = "client!client", name = "Wc", descriptor = "[[I")
	public static final int[][] anIntArrayArray23;

	@OriginalMember(owner = "client!client", name = "ad", descriptor = "Ljava/math/BigInteger;")
	private static BigInteger aBigInteger1;

	@OriginalMember(owner = "client!client", name = "Je", descriptor = "Ljava/math/BigInteger;")
	private static BigInteger aBigInteger2;

	@OriginalMember(owner = "client!client", name = "Uf", descriptor = "[I")
	public static int[] anIntArray248;

	@OriginalMember(owner = "client!client", name = "ig", descriptor = "[I")
	public static final int[] anIntArray250;

	@OriginalMember(owner = "client!client", name = "dh", descriptor = "I")
	private static int anInt1008;

	@OriginalMember(owner = "client!client", name = "rj", descriptor = "I")
	private static int anInt1057;

	@OriginalMember(owner = "client!client", name = "Vj", descriptor = "I")
	private static int anInt1074;

	@OriginalMember(owner = "client!client", name = "Xj", descriptor = "Z")
	private static boolean aBoolean236;

	@OriginalMember(owner = "client!client", name = "K", descriptor = "I")
	private int anInt851;

	@OriginalMember(owner = "client!client", name = "N", descriptor = "I")
	private int anInt852;

	@OriginalMember(owner = "client!client", name = "O", descriptor = "I")
	private int anInt853;

	@OriginalMember(owner = "client!client", name = "Q", descriptor = "I")
	private int anInt854;

	@OriginalMember(owner = "client!client", name = "U", descriptor = "[[B")
	private byte[][] aByteArrayArray5;

	@OriginalMember(owner = "client!client", name = "ab", descriptor = "I")
	private int anInt858;

	@OriginalMember(owner = "client!client", name = "bb", descriptor = "I")
	private int anInt859;

	@OriginalMember(owner = "client!client", name = "hb", descriptor = "I")
	private int anInt862;

	@OriginalMember(owner = "client!client", name = "ib", descriptor = "I")
	private int anInt863;

	@OriginalMember(owner = "client!client", name = "jb", descriptor = "I")
	private int anInt864;

	@OriginalMember(owner = "client!client", name = "kb", descriptor = "I")
	private int anInt865;

	@OriginalMember(owner = "client!client", name = "lb", descriptor = "I")
	private int anInt866;

	@OriginalMember(owner = "client!client", name = "mb", descriptor = "I")
	private int anInt867;

	@OriginalMember(owner = "client!client", name = "nb", descriptor = "Ljava/lang/String;")
	private String aString18;

	@OriginalMember(owner = "client!client", name = "qb", descriptor = "Lclient!DTPUNZHN;")
	private Class11 aClass11_3;

	@OriginalMember(owner = "client!client", name = "rb", descriptor = "Lclient!DTPUNZHN;")
	private Class11 aClass11_4;

	@OriginalMember(owner = "client!client", name = "sb", descriptor = "Lclient!DTPUNZHN;")
	private Class11 aClass11_5;

	@OriginalMember(owner = "client!client", name = "tb", descriptor = "Lclient!DTPUNZHN;")
	private Class11 aClass11_6;

	@OriginalMember(owner = "client!client", name = "ub", descriptor = "I")
	private int anInt869;

	@OriginalMember(owner = "client!client", name = "wb", descriptor = "I")
	private int anInt870;

	@OriginalMember(owner = "client!client", name = "zb", descriptor = "I")
	private int anInt871;

	@OriginalMember(owner = "client!client", name = "Bb", descriptor = "Lclient!SFVBUBEZ;")
	private Class8_Sub1_Sub2_Sub2 aClass8_Sub1_Sub2_Sub2_1;

	@OriginalMember(owner = "client!client", name = "Cb", descriptor = "Lclient!SFVBUBEZ;")
	private Class8_Sub1_Sub2_Sub2 aClass8_Sub1_Sub2_Sub2_2;

	@OriginalMember(owner = "client!client", name = "Db", descriptor = "Lclient!SFVBUBEZ;")
	private Class8_Sub1_Sub2_Sub2 aClass8_Sub1_Sub2_Sub2_3;

	@OriginalMember(owner = "client!client", name = "Eb", descriptor = "I")
	private int anInt872;

	@OriginalMember(owner = "client!client", name = "Fb", descriptor = "I")
	private int anInt873;

	@OriginalMember(owner = "client!client", name = "Mb", descriptor = "I")
	private int anInt877;

	@OriginalMember(owner = "client!client", name = "Nb", descriptor = "I")
	private int anInt878;

	@OriginalMember(owner = "client!client", name = "Ob", descriptor = "I")
	private int anInt879;

	@OriginalMember(owner = "client!client", name = "Pb", descriptor = "I")
	private int anInt880;

	@OriginalMember(owner = "client!client", name = "Qb", descriptor = "I")
	private int anInt881;

	@OriginalMember(owner = "client!client", name = "Vb", descriptor = "I")
	private int anInt884;

	@OriginalMember(owner = "client!client", name = "Wb", descriptor = "I")
	private int anInt885;

	@OriginalMember(owner = "client!client", name = "Xb", descriptor = "I")
	private int anInt886;

	@OriginalMember(owner = "client!client", name = "bc", descriptor = "I")
	private int anInt888;

	@OriginalMember(owner = "client!client", name = "cc", descriptor = "I")
	private int anInt889;

	@OriginalMember(owner = "client!client", name = "dc", descriptor = "I")
	private int anInt890;

	@OriginalMember(owner = "client!client", name = "fc", descriptor = "Lclient!GPLGZASP;")
	private Class8_Sub1_Sub2_Sub1 aClass8_Sub1_Sub2_Sub1_3;

	@OriginalMember(owner = "client!client", name = "gc", descriptor = "I")
	private int anInt892;

	@OriginalMember(owner = "client!client", name = "hc", descriptor = "I")
	private int anInt893;

	@OriginalMember(owner = "client!client", name = "ic", descriptor = "I")
	private int anInt894;

	@OriginalMember(owner = "client!client", name = "jc", descriptor = "I")
	private int anInt895;

	@OriginalMember(owner = "client!client", name = "kc", descriptor = "I")
	private int anInt896;

	@OriginalMember(owner = "client!client", name = "nc", descriptor = "I")
	private int anInt898;

	@OriginalMember(owner = "client!client", name = "pc", descriptor = "I")
	private int anInt900;

	@OriginalMember(owner = "client!client", name = "rc", descriptor = "I")
	private int anInt901;

	@OriginalMember(owner = "client!client", name = "uc", descriptor = "I")
	private int anInt902;

	@OriginalMember(owner = "client!client", name = "wc", descriptor = "I")
	private int anInt903;

	@OriginalMember(owner = "client!client", name = "xc", descriptor = "I")
	private int anInt904;

	@OriginalMember(owner = "client!client", name = "yc", descriptor = "Lclient!CSJOZVFM;")
	private Class7 aClass7_1;

	@OriginalMember(owner = "client!client", name = "Ec", descriptor = "Lclient!GPLGZASP;")
	private Class8_Sub1_Sub2_Sub1 aClass8_Sub1_Sub2_Sub1_4;

	@OriginalMember(owner = "client!client", name = "Fc", descriptor = "Lclient!GPLGZASP;")
	private Class8_Sub1_Sub2_Sub1 aClass8_Sub1_Sub2_Sub1_5;

	@OriginalMember(owner = "client!client", name = "Hc", descriptor = "Lclient!GPLGZASP;")
	private Class8_Sub1_Sub2_Sub1 aClass8_Sub1_Sub2_Sub1_6;

	@OriginalMember(owner = "client!client", name = "Kc", descriptor = "Lclient!ICHYZYSQ;")
	private Class18 aClass18_2;

	@OriginalMember(owner = "client!client", name = "Lc", descriptor = "I")
	private int anInt908;

	@OriginalMember(owner = "client!client", name = "Mc", descriptor = "I")
	private int anInt909;

	@OriginalMember(owner = "client!client", name = "Xc", descriptor = "I")
	private int anInt914;

	@OriginalMember(owner = "client!client", name = "Zc", descriptor = "I")
	private int anInt915;

	@OriginalMember(owner = "client!client", name = "cd", descriptor = "I")
	private int anInt916;

	@OriginalMember(owner = "client!client", name = "dd", descriptor = "I")
	private int anInt917;

	@OriginalMember(owner = "client!client", name = "ed", descriptor = "I")
	private int anInt918;

	@OriginalMember(owner = "client!client", name = "jd", descriptor = "I")
	private int anInt920;

	@OriginalMember(owner = "client!client", name = "kd", descriptor = "I")
	private int anInt921;

	@OriginalMember(owner = "client!client", name = "nd", descriptor = "I")
	private int anInt924;

	@OriginalMember(owner = "client!client", name = "od", descriptor = "I")
	private int anInt925;

	@OriginalMember(owner = "client!client", name = "pd", descriptor = "I")
	private int anInt926;

	@OriginalMember(owner = "client!client", name = "qd", descriptor = "I")
	private int anInt927;

	@OriginalMember(owner = "client!client", name = "td", descriptor = "I")
	private int anInt929;

	@OriginalMember(owner = "client!client", name = "xd", descriptor = "Lclient!BISZONYZ;")
	private Class4_Sub1 aClass4_Sub1_1;

	@OriginalMember(owner = "client!client", name = "zd", descriptor = "I")
	private int anInt931;

	@OriginalMember(owner = "client!client", name = "Cd", descriptor = "I")
	private int anInt933;

	@OriginalMember(owner = "client!client", name = "Ed", descriptor = "I")
	private int anInt935;

	@OriginalMember(owner = "client!client", name = "Gd", descriptor = "I")
	private int anInt937;

	@OriginalMember(owner = "client!client", name = "Id", descriptor = "[[[B")
	private byte[][][] aByteArrayArrayArray8;

	@OriginalMember(owner = "client!client", name = "Ld", descriptor = "I")
	private int anInt940;

	@OriginalMember(owner = "client!client", name = "Nd", descriptor = "Ljava/lang/String;")
	private String aString21;

	@OriginalMember(owner = "client!client", name = "Qd", descriptor = "I")
	private int anInt942;

	@OriginalMember(owner = "client!client", name = "Sd", descriptor = "I")
	private int anInt943;

	@OriginalMember(owner = "client!client", name = "Ud", descriptor = "J")
	private long aLong29;

	@OriginalMember(owner = "client!client", name = "Vd", descriptor = "Lclient!SFVBUBEZ;")
	private Class8_Sub1_Sub2_Sub2 aClass8_Sub1_Sub2_Sub2_4;

	@OriginalMember(owner = "client!client", name = "Wd", descriptor = "Lclient!SFVBUBEZ;")
	private Class8_Sub1_Sub2_Sub2 aClass8_Sub1_Sub2_Sub2_5;

	@OriginalMember(owner = "client!client", name = "Xd", descriptor = "Lclient!SFVBUBEZ;")
	private Class8_Sub1_Sub2_Sub2 aClass8_Sub1_Sub2_Sub2_6;

	@OriginalMember(owner = "client!client", name = "Yd", descriptor = "Lclient!SFVBUBEZ;")
	private Class8_Sub1_Sub2_Sub2 aClass8_Sub1_Sub2_Sub2_7;

	@OriginalMember(owner = "client!client", name = "Zd", descriptor = "Lclient!SFVBUBEZ;")
	private Class8_Sub1_Sub2_Sub2 aClass8_Sub1_Sub2_Sub2_8;

	@OriginalMember(owner = "client!client", name = "be", descriptor = "I")
	private int anInt944;

	@OriginalMember(owner = "client!client", name = "ce", descriptor = "I")
	private int anInt945;

	@OriginalMember(owner = "client!client", name = "de", descriptor = "I")
	private int anInt946;

	@OriginalMember(owner = "client!client", name = "ee", descriptor = "I")
	private int anInt947;

	@OriginalMember(owner = "client!client", name = "fe", descriptor = "I")
	private int anInt948;

	@OriginalMember(owner = "client!client", name = "ge", descriptor = "I")
	private int anInt949;

	@OriginalMember(owner = "client!client", name = "ke", descriptor = "I")
	private int anInt950;

	@OriginalMember(owner = "client!client", name = "pe", descriptor = "[I")
	private int[] anIntArray224;

	@OriginalMember(owner = "client!client", name = "qe", descriptor = "[I")
	private int[] anIntArray225;

	@OriginalMember(owner = "client!client", name = "se", descriptor = "[I")
	private int[] anIntArray226;

	@OriginalMember(owner = "client!client", name = "te", descriptor = "[I")
	private int[] anIntArray227;

	@OriginalMember(owner = "client!client", name = "ue", descriptor = "[I")
	private int[] anIntArray228;

	@OriginalMember(owner = "client!client", name = "ve", descriptor = "[I")
	private int[] anIntArray229;

	@OriginalMember(owner = "client!client", name = "ye", descriptor = "I")
	private int anInt954;

	@OriginalMember(owner = "client!client", name = "Ee", descriptor = "Lclient!DTPUNZHN;")
	private Class11 aClass11_7;

	@OriginalMember(owner = "client!client", name = "Fe", descriptor = "Lclient!DTPUNZHN;")
	private Class11 aClass11_8;

	@OriginalMember(owner = "client!client", name = "Ge", descriptor = "Lclient!DTPUNZHN;")
	private Class11 aClass11_9;

	@OriginalMember(owner = "client!client", name = "He", descriptor = "Lclient!POACSVST;")
	private Class32 aClass32_1;

	@OriginalMember(owner = "client!client", name = "Se", descriptor = "Lclient!GPLGZASP;")
	private Class8_Sub1_Sub2_Sub1 aClass8_Sub1_Sub2_Sub1_7;

	@OriginalMember(owner = "client!client", name = "Te", descriptor = "Lclient!GPLGZASP;")
	private Class8_Sub1_Sub2_Sub1 aClass8_Sub1_Sub2_Sub1_8;

	@OriginalMember(owner = "client!client", name = "Ue", descriptor = "J")
	private long aLong30;

	@OriginalMember(owner = "client!client", name = "bf", descriptor = "I")
	private int anInt961;

	@OriginalMember(owner = "client!client", name = "cf", descriptor = "I")
	private int anInt962;

	@OriginalMember(owner = "client!client", name = "df", descriptor = "I")
	private int anInt963;

	@OriginalMember(owner = "client!client", name = "ef", descriptor = "I")
	private int anInt964;

	@OriginalMember(owner = "client!client", name = "ff", descriptor = "Ljava/lang/String;")
	private String aString24;

	@OriginalMember(owner = "client!client", name = "gf", descriptor = "I")
	private int anInt965;

	@OriginalMember(owner = "client!client", name = "lf", descriptor = "I")
	private int anInt968;

	@OriginalMember(owner = "client!client", name = "nf", descriptor = "I")
	private int anInt969;

	@OriginalMember(owner = "client!client", name = "qf", descriptor = "[I")
	private int[] anIntArray238;

	@OriginalMember(owner = "client!client", name = "rf", descriptor = "[I")
	private int[] anIntArray239;

	@OriginalMember(owner = "client!client", name = "sf", descriptor = "[I")
	private int[] anIntArray240;

	@OriginalMember(owner = "client!client", name = "tf", descriptor = "[I")
	private int[] anIntArray241;

	@OriginalMember(owner = "client!client", name = "uf", descriptor = "I")
	private int anInt970;

	@OriginalMember(owner = "client!client", name = "vf", descriptor = "I")
	private int anInt971;

	@OriginalMember(owner = "client!client", name = "wf", descriptor = "I")
	private int anInt972;

	@OriginalMember(owner = "client!client", name = "xf", descriptor = "Lclient!GPLGZASP;")
	private Class8_Sub1_Sub2_Sub1 aClass8_Sub1_Sub2_Sub1_9;

	@OriginalMember(owner = "client!client", name = "zf", descriptor = "[Lclient!SFVBUBEZ;")
	private Class8_Sub1_Sub2_Sub2[] aClass8_Sub1_Sub2_Sub2Array4;

	@OriginalMember(owner = "client!client", name = "Df", descriptor = "I")
	private int anInt974;

	@OriginalMember(owner = "client!client", name = "Ef", descriptor = "I")
	private int anInt975;

	@OriginalMember(owner = "client!client", name = "Ff", descriptor = "I")
	private int anInt976;

	@OriginalMember(owner = "client!client", name = "Pf", descriptor = "J")
	private long aLong31;

	@OriginalMember(owner = "client!client", name = "Vf", descriptor = "I")
	private int anInt982;

	@OriginalMember(owner = "client!client", name = "Xf", descriptor = "I")
	private int anInt984;

	@OriginalMember(owner = "client!client", name = "Yf", descriptor = "I")
	private int anInt985;

	@OriginalMember(owner = "client!client", name = "Zf", descriptor = "I")
	private int anInt986;

	@OriginalMember(owner = "client!client", name = "bg", descriptor = "Lclient!SFVBUBEZ;")
	private Class8_Sub1_Sub2_Sub2 aClass8_Sub1_Sub2_Sub2_9;

	@OriginalMember(owner = "client!client", name = "cg", descriptor = "Lclient!SFVBUBEZ;")
	private Class8_Sub1_Sub2_Sub2 aClass8_Sub1_Sub2_Sub2_10;

	@OriginalMember(owner = "client!client", name = "fg", descriptor = "I")
	private int anInt988;

	@OriginalMember(owner = "client!client", name = "gg", descriptor = "Lclient!SFVBUBEZ;")
	private Class8_Sub1_Sub2_Sub2 aClass8_Sub1_Sub2_Sub2_11;

	@OriginalMember(owner = "client!client", name = "hg", descriptor = "Lclient!SFVBUBEZ;")
	private Class8_Sub1_Sub2_Sub2 aClass8_Sub1_Sub2_Sub2_12;

	@OriginalMember(owner = "client!client", name = "kg", descriptor = "Lclient!AWEEREDT;")
	private Class2 aClass2_2;

	@OriginalMember(owner = "client!client", name = "ng", descriptor = "[I")
	private int[] anIntArray251;

	@OriginalMember(owner = "client!client", name = "og", descriptor = "[I")
	private int[] anIntArray252;

	@OriginalMember(owner = "client!client", name = "rg", descriptor = "Lclient!GPLGZASP;")
	private Class8_Sub1_Sub2_Sub1 aClass8_Sub1_Sub2_Sub1_10;

	@OriginalMember(owner = "client!client", name = "tg", descriptor = "I")
	private int anInt992;

	@OriginalMember(owner = "client!client", name = "Eg", descriptor = "I")
	private int anInt994;

	@OriginalMember(owner = "client!client", name = "Kg", descriptor = "I")
	private int anInt996;

	@OriginalMember(owner = "client!client", name = "Lg", descriptor = "I")
	private int anInt997;

	@OriginalMember(owner = "client!client", name = "Mg", descriptor = "I")
	private int anInt998;

	@OriginalMember(owner = "client!client", name = "Ng", descriptor = "I")
	private int anInt999;

	@OriginalMember(owner = "client!client", name = "Og", descriptor = "I")
	private int anInt1000;

	@OriginalMember(owner = "client!client", name = "Qg", descriptor = "I")
	private int anInt1001;

	@OriginalMember(owner = "client!client", name = "Wg", descriptor = "I")
	private int anInt1003;

	@OriginalMember(owner = "client!client", name = "Yg", descriptor = "I")
	private int anInt1004;

	@OriginalMember(owner = "client!client", name = "Zg", descriptor = "I")
	private int anInt1005;

	@OriginalMember(owner = "client!client", name = "ah", descriptor = "I")
	private int anInt1006;

	@OriginalMember(owner = "client!client", name = "gh", descriptor = "I")
	private int anInt1009;

	@OriginalMember(owner = "client!client", name = "hh", descriptor = "I")
	private int anInt1010;

	@OriginalMember(owner = "client!client", name = "ih", descriptor = "Lclient!DTPUNZHN;")
	private Class11 aClass11_10;

	@OriginalMember(owner = "client!client", name = "jh", descriptor = "Lclient!DTPUNZHN;")
	private Class11 aClass11_11;

	@OriginalMember(owner = "client!client", name = "kh", descriptor = "Lclient!DTPUNZHN;")
	private Class11 aClass11_12;

	@OriginalMember(owner = "client!client", name = "lh", descriptor = "Lclient!DTPUNZHN;")
	private Class11 aClass11_13;

	@OriginalMember(owner = "client!client", name = "mh", descriptor = "Lclient!DTPUNZHN;")
	private Class11 aClass11_14;

	@OriginalMember(owner = "client!client", name = "nh", descriptor = "Lclient!DTPUNZHN;")
	private Class11 aClass11_15;

	@OriginalMember(owner = "client!client", name = "oh", descriptor = "Lclient!DTPUNZHN;")
	private Class11 aClass11_16;

	@OriginalMember(owner = "client!client", name = "ph", descriptor = "Lclient!DTPUNZHN;")
	private Class11 aClass11_17;

	@OriginalMember(owner = "client!client", name = "qh", descriptor = "Lclient!DTPUNZHN;")
	private Class11 aClass11_18;

	@OriginalMember(owner = "client!client", name = "rh", descriptor = "[[B")
	private byte[][] aByteArrayArray6;

	@OriginalMember(owner = "client!client", name = "sh", descriptor = "I")
	private int anInt1011;

	@OriginalMember(owner = "client!client", name = "vh", descriptor = "I")
	private int anInt1013;

	@OriginalMember(owner = "client!client", name = "wh", descriptor = "I")
	private int anInt1014;

	@OriginalMember(owner = "client!client", name = "xh", descriptor = "I")
	private int anInt1015;

	@OriginalMember(owner = "client!client", name = "yh", descriptor = "I")
	private int anInt1016;

	@OriginalMember(owner = "client!client", name = "zh", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray7;

	@OriginalMember(owner = "client!client", name = "Ih", descriptor = "I")
	private int anInt1018;

	@OriginalMember(owner = "client!client", name = "Jh", descriptor = "I")
	private int anInt1019;

	@OriginalMember(owner = "client!client", name = "Kh", descriptor = "I")
	private int anInt1020;

	@OriginalMember(owner = "client!client", name = "Lh", descriptor = "I")
	private int anInt1021;

	@OriginalMember(owner = "client!client", name = "Rh", descriptor = "I")
	private int anInt1023;

	@OriginalMember(owner = "client!client", name = "Sh", descriptor = "I")
	private int anInt1024;

	@OriginalMember(owner = "client!client", name = "Yh", descriptor = "I")
	private int anInt1025;

	@OriginalMember(owner = "client!client", name = "bi", descriptor = "Lclient!DTPUNZHN;")
	private Class11 aClass11_19;

	@OriginalMember(owner = "client!client", name = "ci", descriptor = "Lclient!DTPUNZHN;")
	private Class11 aClass11_20;

	@OriginalMember(owner = "client!client", name = "di", descriptor = "Lclient!DTPUNZHN;")
	private Class11 aClass11_21;

	@OriginalMember(owner = "client!client", name = "ei", descriptor = "Lclient!DTPUNZHN;")
	private Class11 aClass11_22;

	@OriginalMember(owner = "client!client", name = "fi", descriptor = "Lclient!DTPUNZHN;")
	private Class11 aClass11_23;

	@OriginalMember(owner = "client!client", name = "gi", descriptor = "Lclient!DTPUNZHN;")
	private Class11 aClass11_24;

	@OriginalMember(owner = "client!client", name = "hi", descriptor = "Lclient!DTPUNZHN;")
	private Class11 aClass11_25;

	@OriginalMember(owner = "client!client", name = "ii", descriptor = "Lclient!DTPUNZHN;")
	private Class11 aClass11_26;

	@OriginalMember(owner = "client!client", name = "ji", descriptor = "Lclient!DTPUNZHN;")
	private Class11 aClass11_27;

	@OriginalMember(owner = "client!client", name = "li", descriptor = "[I")
	private int[] anIntArray269;

	@OriginalMember(owner = "client!client", name = "mi", descriptor = "[I")
	private int[] anIntArray270;

	@OriginalMember(owner = "client!client", name = "ni", descriptor = "[I")
	private int[] anIntArray271;

	@OriginalMember(owner = "client!client", name = "oi", descriptor = "Lclient!SFVBUBEZ;")
	private Class8_Sub1_Sub2_Sub2 aClass8_Sub1_Sub2_Sub2_13;

	@OriginalMember(owner = "client!client", name = "pi", descriptor = "Lclient!SFVBUBEZ;")
	private Class8_Sub1_Sub2_Sub2 aClass8_Sub1_Sub2_Sub2_14;

	@OriginalMember(owner = "client!client", name = "qi", descriptor = "Lclient!SFVBUBEZ;")
	private Class8_Sub1_Sub2_Sub2 aClass8_Sub1_Sub2_Sub2_15;

	@OriginalMember(owner = "client!client", name = "ri", descriptor = "Lclient!SFVBUBEZ;")
	private Class8_Sub1_Sub2_Sub2 aClass8_Sub1_Sub2_Sub2_16;

	@OriginalMember(owner = "client!client", name = "si", descriptor = "Lclient!SFVBUBEZ;")
	private Class8_Sub1_Sub2_Sub2 aClass8_Sub1_Sub2_Sub2_17;

	@OriginalMember(owner = "client!client", name = "ti", descriptor = "Lclient!GPLGZASP;")
	private Class8_Sub1_Sub2_Sub1 aClass8_Sub1_Sub2_Sub1_11;

	@OriginalMember(owner = "client!client", name = "ui", descriptor = "Lclient!GPLGZASP;")
	private Class8_Sub1_Sub2_Sub1 aClass8_Sub1_Sub2_Sub1_12;

	@OriginalMember(owner = "client!client", name = "vi", descriptor = "Lclient!GPLGZASP;")
	private Class8_Sub1_Sub2_Sub1 aClass8_Sub1_Sub2_Sub1_13;

	@OriginalMember(owner = "client!client", name = "wi", descriptor = "Lclient!GPLGZASP;")
	private Class8_Sub1_Sub2_Sub1 aClass8_Sub1_Sub2_Sub1_14;

	@OriginalMember(owner = "client!client", name = "xi", descriptor = "Lclient!GPLGZASP;")
	private Class8_Sub1_Sub2_Sub1 aClass8_Sub1_Sub2_Sub1_15;

	@OriginalMember(owner = "client!client", name = "yi", descriptor = "I")
	private int anInt1027;

	@OriginalMember(owner = "client!client", name = "zi", descriptor = "I")
	private int anInt1028;

	@OriginalMember(owner = "client!client", name = "Ai", descriptor = "I")
	private int anInt1029;

	@OriginalMember(owner = "client!client", name = "Bi", descriptor = "I")
	private int anInt1030;

	@OriginalMember(owner = "client!client", name = "Di", descriptor = "I")
	private int anInt1031;

	@OriginalMember(owner = "client!client", name = "Fi", descriptor = "I")
	private int anInt1032;

	@OriginalMember(owner = "client!client", name = "Gi", descriptor = "I")
	private int anInt1033;

	@OriginalMember(owner = "client!client", name = "Hi", descriptor = "I")
	private int anInt1034;

	@OriginalMember(owner = "client!client", name = "Ii", descriptor = "I")
	private int anInt1035;

	@OriginalMember(owner = "client!client", name = "Ji", descriptor = "J")
	private long aLong32;

	@OriginalMember(owner = "client!client", name = "Mi", descriptor = "Lclient!SFVBUBEZ;")
	private Class8_Sub1_Sub2_Sub2 aClass8_Sub1_Sub2_Sub2_18;

	@OriginalMember(owner = "client!client", name = "Ni", descriptor = "Lclient!SFVBUBEZ;")
	private Class8_Sub1_Sub2_Sub2 aClass8_Sub1_Sub2_Sub2_19;

	@OriginalMember(owner = "client!client", name = "Oi", descriptor = "Lclient!SFVBUBEZ;")
	private Class8_Sub1_Sub2_Sub2 aClass8_Sub1_Sub2_Sub2_20;

	@OriginalMember(owner = "client!client", name = "Ri", descriptor = "Lclient!UOINBUQD;")
	private Class8_Sub1_Sub2_Sub3 aClass8_Sub1_Sub2_Sub3_2;

	@OriginalMember(owner = "client!client", name = "Si", descriptor = "Lclient!UOINBUQD;")
	private Class8_Sub1_Sub2_Sub3 aClass8_Sub1_Sub2_Sub3_3;

	@OriginalMember(owner = "client!client", name = "Ti", descriptor = "Lclient!UOINBUQD;")
	private Class8_Sub1_Sub2_Sub3 aClass8_Sub1_Sub2_Sub3_4;

	@OriginalMember(owner = "client!client", name = "Ui", descriptor = "Lclient!UOINBUQD;")
	private Class8_Sub1_Sub2_Sub3 aClass8_Sub1_Sub2_Sub3_5;

	@OriginalMember(owner = "client!client", name = "Vi", descriptor = "I")
	private int anInt1038;

	@OriginalMember(owner = "client!client", name = "Wi", descriptor = "I")
	private int anInt1039;

	@OriginalMember(owner = "client!client", name = "Xi", descriptor = "I")
	private int anInt1040;

	@OriginalMember(owner = "client!client", name = "Yi", descriptor = "I")
	private int anInt1041;

	@OriginalMember(owner = "client!client", name = "Zi", descriptor = "I")
	private int anInt1042;

	@OriginalMember(owner = "client!client", name = "bj", descriptor = "I")
	private int anInt1043;

	@OriginalMember(owner = "client!client", name = "dj", descriptor = "I")
	private int anInt1044;

	@OriginalMember(owner = "client!client", name = "ej", descriptor = "I")
	private int anInt1045;

	@OriginalMember(owner = "client!client", name = "fj", descriptor = "I")
	private int anInt1046;

	@OriginalMember(owner = "client!client", name = "gj", descriptor = "I")
	private int anInt1047;

	@OriginalMember(owner = "client!client", name = "hj", descriptor = "I")
	private int anInt1048;

	@OriginalMember(owner = "client!client", name = "ij", descriptor = "I")
	private int anInt1049;

	@OriginalMember(owner = "client!client", name = "jj", descriptor = "I")
	private int anInt1050;

	@OriginalMember(owner = "client!client", name = "kj", descriptor = "J")
	private long aLong33;

	@OriginalMember(owner = "client!client", name = "lj", descriptor = "I")
	private int anInt1051;

	@OriginalMember(owner = "client!client", name = "mj", descriptor = "I")
	private int anInt1052;

	@OriginalMember(owner = "client!client", name = "oj", descriptor = "I")
	private int anInt1054;

	@OriginalMember(owner = "client!client", name = "pj", descriptor = "I")
	private int anInt1055;

	@OriginalMember(owner = "client!client", name = "tj", descriptor = "I")
	private int anInt1058;

	@OriginalMember(owner = "client!client", name = "vj", descriptor = "Lclient!LLZTMQTZ;")
	private Class22 aClass22_1;

	@OriginalMember(owner = "client!client", name = "Dj", descriptor = "I")
	private int anInt1061;

	@OriginalMember(owner = "client!client", name = "Ej", descriptor = "I")
	private int anInt1062;

	@OriginalMember(owner = "client!client", name = "Fj", descriptor = "I")
	private int anInt1063;

	@OriginalMember(owner = "client!client", name = "Gj", descriptor = "I")
	private int anInt1064;

	@OriginalMember(owner = "client!client", name = "Hj", descriptor = "I")
	private int anInt1065;

	@OriginalMember(owner = "client!client", name = "Lj", descriptor = "Ljava/lang/String;")
	private String aString31;

	@OriginalMember(owner = "client!client", name = "Mj", descriptor = "I")
	private int anInt1066;

	@OriginalMember(owner = "client!client", name = "Pj", descriptor = "I")
	private int anInt1068;

	@OriginalMember(owner = "client!client", name = "Qj", descriptor = "I")
	private int anInt1069;

	@OriginalMember(owner = "client!client", name = "Rj", descriptor = "I")
	private int anInt1070;

	@OriginalMember(owner = "client!client", name = "Sj", descriptor = "I")
	private int anInt1071;

	@OriginalMember(owner = "client!client", name = "Tj", descriptor = "I")
	private int anInt1072;

	@OriginalMember(owner = "client!client", name = "Uj", descriptor = "I")
	private int anInt1073;

	@OriginalMember(owner = "client!client", name = "ak", descriptor = "I")
	private int anInt1076;

	@OriginalMember(owner = "client!client", name = "bk", descriptor = "Lclient!GPLGZASP;")
	private Class8_Sub1_Sub2_Sub1 aClass8_Sub1_Sub2_Sub1_16;

	@OriginalMember(owner = "client!client", name = "ck", descriptor = "Lclient!GPLGZASP;")
	private Class8_Sub1_Sub2_Sub1 aClass8_Sub1_Sub2_Sub1_17;

	@OriginalMember(owner = "client!client", name = "gk", descriptor = "I")
	private int anInt1078;

	@OriginalMember(owner = "client!client", name = "jk", descriptor = "I")
	private int anInt1079;

	@OriginalMember(owner = "client!client", name = "lk", descriptor = "I")
	private int anInt1081;

	@OriginalMember(owner = "client!client", name = "mk", descriptor = "I")
	private int anInt1082;

	@OriginalMember(owner = "client!client", name = "ok", descriptor = "Ljava/net/Socket;")
	private Socket aSocket3;

	@OriginalMember(owner = "client!client", name = "pk", descriptor = "I")
	private int anInt1083;

	@OriginalMember(owner = "client!client", name = "qk", descriptor = "I")
	private int anInt1084;

	@OriginalMember(owner = "client!client", name = "L", descriptor = "[I")
	private int[] anIntArray212 = new int[1000];

	@OriginalMember(owner = "client!client", name = "M", descriptor = "[I")
	private int[] anIntArray213 = new int[7];

	@OriginalMember(owner = "client!client", name = "P", descriptor = "Lclient!IUVBENCV;")
	private Class8_Sub1_Sub3 aClass8_Sub1_Sub3_6 = Class8_Sub1_Sub3.method140(aBoolean203);

	@OriginalMember(owner = "client!client", name = "R", descriptor = "I")
	private int anInt855 = 1;

	@OriginalMember(owner = "client!client", name = "S", descriptor = "Z")
	private boolean aBoolean191 = false;

	@OriginalMember(owner = "client!client", name = "T", descriptor = "Z")
	private boolean aBoolean192 = false;

	@OriginalMember(owner = "client!client", name = "X", descriptor = "[Lclient!AOKWRKNA;")
	private Class1[] aClass1Array1 = new Class1[4];

	@OriginalMember(owner = "client!client", name = "cb", descriptor = "Z")
	private boolean aBoolean193 = false;

	@OriginalMember(owner = "client!client", name = "eb", descriptor = "[[I")
	private int[][] anIntArrayArray22 = new int[104][104];

	@OriginalMember(owner = "client!client", name = "fb", descriptor = "[I")
	private int[] anIntArray214 = new int[50];

	@OriginalMember(owner = "client!client", name = "gb", descriptor = "I")
	private int anInt861 = 128;

	@OriginalMember(owner = "client!client", name = "ob", descriptor = "[Lclient!GPLGZASP;")
	private Class8_Sub1_Sub2_Sub1[] aClass8_Sub1_Sub2_Sub1Array4 = new Class8_Sub1_Sub2_Sub1[20];

	@OriginalMember(owner = "client!client", name = "vb", descriptor = "[Lclient!GPLGZASP;")
	private Class8_Sub1_Sub2_Sub1[] aClass8_Sub1_Sub2_Sub1Array5 = new Class8_Sub1_Sub2_Sub1[8];

	@OriginalMember(owner = "client!client", name = "xb", descriptor = "Z")
	private boolean aBoolean194 = true;

	@OriginalMember(owner = "client!client", name = "yb", descriptor = "B")
	private byte aByte22 = -85;

	@OriginalMember(owner = "client!client", name = "Ab", descriptor = "Ljava/lang/String;")
	private String aString19 = "";

	@OriginalMember(owner = "client!client", name = "Gb", descriptor = "Z")
	private boolean aBoolean195 = false;

	@OriginalMember(owner = "client!client", name = "Jb", descriptor = "I")
	private int anInt876 = 2301979;

	@OriginalMember(owner = "client!client", name = "Kb", descriptor = "Z")
	private boolean aBoolean196 = false;

	@OriginalMember(owner = "client!client", name = "Lb", descriptor = "Z")
	private boolean aBoolean197 = false;

	@OriginalMember(owner = "client!client", name = "Sb", descriptor = "I")
	private int anInt883 = 3353893;

	@OriginalMember(owner = "client!client", name = "Tb", descriptor = "[Lclient!GPLGZASP;")
	private Class8_Sub1_Sub2_Sub1[] aClass8_Sub1_Sub2_Sub1Array6 = new Class8_Sub1_Sub2_Sub1[1000];

	@OriginalMember(owner = "client!client", name = "Zb", descriptor = "Z")
	private volatile boolean aBoolean199 = false;

	@OriginalMember(owner = "client!client", name = "ac", descriptor = "I")
	private int anInt887 = -41334;

	@OriginalMember(owner = "client!client", name = "ec", descriptor = "I")
	private int anInt891 = -1;

	@OriginalMember(owner = "client!client", name = "lc", descriptor = "I")
	private int anInt897 = -42;

	@OriginalMember(owner = "client!client", name = "mc", descriptor = "Z")
	private boolean aBoolean200 = false;

	@OriginalMember(owner = "client!client", name = "oc", descriptor = "I")
	private int anInt899 = -1;

	@OriginalMember(owner = "client!client", name = "qc", descriptor = "Ljava/lang/String;")
	private String aString20 = "";

	@OriginalMember(owner = "client!client", name = "sc", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray8 = new String[100];

	@OriginalMember(owner = "client!client", name = "tc", descriptor = "[I")
	private int[] anIntArray216 = new int[100];

	@OriginalMember(owner = "client!client", name = "vc", descriptor = "Z")
	private boolean aBoolean201 = false;

	@OriginalMember(owner = "client!client", name = "zc", descriptor = "I")
	private int anInt905 = -1;

	@OriginalMember(owner = "client!client", name = "Ac", descriptor = "[I")
	private int[] anIntArray217 = new int[Class17.anInt145];

	@OriginalMember(owner = "client!client", name = "Bc", descriptor = "[I")
	public int[] anIntArray218 = new int[2000];

	@OriginalMember(owner = "client!client", name = "Cc", descriptor = "I")
	private int anInt906 = 9;

	@OriginalMember(owner = "client!client", name = "Gc", descriptor = "I")
	private int anInt907 = -46618;

	@OriginalMember(owner = "client!client", name = "Ic", descriptor = "B")
	private byte aByte24 = -97;

	@OriginalMember(owner = "client!client", name = "Jc", descriptor = "[I")
	private int[] anIntArray219 = new int[33];

	@OriginalMember(owner = "client!client", name = "Nc", descriptor = "Z")
	private boolean aBoolean202 = true;

	@OriginalMember(owner = "client!client", name = "Oc", descriptor = "I")
	private int anInt910 = -1;

	@OriginalMember(owner = "client!client", name = "Qc", descriptor = "Z")
	private boolean aBoolean204 = false;

	@OriginalMember(owner = "client!client", name = "Rc", descriptor = "I")
	private int anInt911 = -1;

	@OriginalMember(owner = "client!client", name = "Sc", descriptor = "[I")
	private int[] anIntArray220 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

	@OriginalMember(owner = "client!client", name = "Yc", descriptor = "B")
	private byte aByte25 = -123;

	@OriginalMember(owner = "client!client", name = "bd", descriptor = "[[[Lclient!ZEEWTYXI;")
	private Class49[][][] aClass49ArrayArrayArray1 = new Class49[4][104][104];

	@OriginalMember(owner = "client!client", name = "fd", descriptor = "[[I")
	private int[][] anIntArrayArray24 = new int[104][104];

	@OriginalMember(owner = "client!client", name = "gd", descriptor = "Z")
	private boolean aBoolean206 = false;

	@OriginalMember(owner = "client!client", name = "hd", descriptor = "[Lclient!SFVBUBEZ;")
	private Class8_Sub1_Sub2_Sub2[] aClass8_Sub1_Sub2_Sub2Array2 = new Class8_Sub1_Sub2_Sub2[13];

	@OriginalMember(owner = "client!client", name = "ld", descriptor = "I")
	private int anInt922 = -567;

	@OriginalMember(owner = "client!client", name = "md", descriptor = "I")
	private int anInt923 = -41562;

	@OriginalMember(owner = "client!client", name = "rd", descriptor = "I")
	private int anInt928 = 631;

	@OriginalMember(owner = "client!client", name = "sd", descriptor = "[Lclient!GPLGZASP;")
	private Class8_Sub1_Sub2_Sub1[] aClass8_Sub1_Sub2_Sub1Array7 = new Class8_Sub1_Sub2_Sub1[32];

	@OriginalMember(owner = "client!client", name = "vd", descriptor = "Lclient!IUVBENCV;")
	private Class8_Sub1_Sub3 aClass8_Sub1_Sub3_7 = Class8_Sub1_Sub3.method140(aBoolean203);

	@OriginalMember(owner = "client!client", name = "wd", descriptor = "B")
	private byte aByte26 = 8;

	@OriginalMember(owner = "client!client", name = "yd", descriptor = "Z")
	private boolean aBoolean207 = false;

	@OriginalMember(owner = "client!client", name = "Ad", descriptor = "I")
	private int anInt932 = 2;

	@OriginalMember(owner = "client!client", name = "Bd", descriptor = "[I")
	private int[] anIntArray221 = new int[151];

	@OriginalMember(owner = "client!client", name = "Dd", descriptor = "I")
	private int anInt934 = -1;

	@OriginalMember(owner = "client!client", name = "Fd", descriptor = "I")
	private int anInt936 = 1;

	@OriginalMember(owner = "client!client", name = "Kd", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray9 = new String[200];

	@OriginalMember(owner = "client!client", name = "Md", descriptor = "Z")
	private boolean aBoolean208 = false;

	@OriginalMember(owner = "client!client", name = "Od", descriptor = "[J")
	private long[] aLongArray3 = new long[200];

	@OriginalMember(owner = "client!client", name = "Pd", descriptor = "I")
	private int anInt941 = 36117;

	@OriginalMember(owner = "client!client", name = "Rd", descriptor = "[Lclient!BCXJTIWC;")
	public Class3[] aClass3Array1 = new Class3[5];

	@OriginalMember(owner = "client!client", name = "Td", descriptor = "[Lclient!SFVBUBEZ;")
	private Class8_Sub1_Sub2_Sub2[] aClass8_Sub1_Sub2_Sub2Array3 = new Class8_Sub1_Sub2_Sub2[100];

	@OriginalMember(owner = "client!client", name = "ae", descriptor = "Z")
	private boolean aBoolean209 = false;

	@OriginalMember(owner = "client!client", name = "he", descriptor = "[I")
	private int[] anIntArray222 = new int[5];

	@OriginalMember(owner = "client!client", name = "ie", descriptor = "Lclient!IUVBENCV;")
	private Class8_Sub1_Sub3 aClass8_Sub1_Sub3_8 = new Class8_Sub1_Sub3(new byte[5000], 713);

	@OriginalMember(owner = "client!client", name = "je", descriptor = "[Lclient!KPZIZBER;")
	private Class8_Sub1_Sub1_Sub1_Sub1[] aClass8_Sub1_Sub1_Sub1_Sub1Array1 = new Class8_Sub1_Sub1_Sub1_Sub1[16384];

	@OriginalMember(owner = "client!client", name = "le", descriptor = "[I")
	private int[] anIntArray223 = new int[16384];

	@OriginalMember(owner = "client!client", name = "me", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray10 = new String[5];

	@OriginalMember(owner = "client!client", name = "ne", descriptor = "[Z")
	private boolean[] aBooleanArray11 = new boolean[5];

	@OriginalMember(owner = "client!client", name = "oe", descriptor = "I")
	private int anInt951 = -120;

	@OriginalMember(owner = "client!client", name = "we", descriptor = "I")
	private int anInt953 = 2;

	@OriginalMember(owner = "client!client", name = "xe", descriptor = "Z")
	private boolean aBoolean210 = false;

	@OriginalMember(owner = "client!client", name = "ze", descriptor = "[I")
	private int[] anIntArray230 = new int[1000];

	@OriginalMember(owner = "client!client", name = "Ae", descriptor = "[I")
	private int[] anIntArray231 = new int[1000];

	@OriginalMember(owner = "client!client", name = "Be", descriptor = "B")
	private byte aByte27 = 0;

	@OriginalMember(owner = "client!client", name = "Ce", descriptor = "B")
	private byte aByte28 = 0;

	@OriginalMember(owner = "client!client", name = "De", descriptor = "Z")
	private boolean aBoolean211 = false;

	@OriginalMember(owner = "client!client", name = "Ie", descriptor = "I")
	private int anInt955 = 5063219;

	@OriginalMember(owner = "client!client", name = "Ke", descriptor = "B")
	private byte aByte29 = 7;

	@OriginalMember(owner = "client!client", name = "Le", descriptor = "[I")
	private final int[] anIntArray232 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

	@OriginalMember(owner = "client!client", name = "Me", descriptor = "[Lclient!GPLGZASP;")
	private Class8_Sub1_Sub2_Sub1[] aClass8_Sub1_Sub2_Sub1Array8 = new Class8_Sub1_Sub2_Sub1[32];

	@OriginalMember(owner = "client!client", name = "Ne", descriptor = "Lclient!IUVBENCV;")
	private Class8_Sub1_Sub3 aClass8_Sub1_Sub3_9 = Class8_Sub1_Sub3.method140(aBoolean203);

	@OriginalMember(owner = "client!client", name = "Oe", descriptor = "[I")
	private int[] anIntArray233 = new int[5];

	@OriginalMember(owner = "client!client", name = "Pe", descriptor = "I")
	private int anInt956 = -1;

	@OriginalMember(owner = "client!client", name = "Qe", descriptor = "I")
	private int anInt957 = -1;

	@OriginalMember(owner = "client!client", name = "Re", descriptor = "[I")
	private int[] anIntArray234 = new int[2000];

	@OriginalMember(owner = "client!client", name = "Ve", descriptor = "Ljava/lang/String;")
	private String aString22 = "";

	@OriginalMember(owner = "client!client", name = "We", descriptor = "Ljava/lang/String;")
	private String aString23 = "";

	@OriginalMember(owner = "client!client", name = "Xe", descriptor = "I")
	private int anInt958 = -1;

	@OriginalMember(owner = "client!client", name = "Ye", descriptor = "I")
	private int anInt959 = -1;

	@OriginalMember(owner = "client!client", name = "Ze", descriptor = "[I")
	private int[] anIntArray235 = new int[50];

	@OriginalMember(owner = "client!client", name = "hf", descriptor = "I")
	private int anInt966 = 2048;

	@OriginalMember(owner = "client!client", name = "jf", descriptor = "I")
	private int anInt967 = 2047;

	@OriginalMember(owner = "client!client", name = "kf", descriptor = "[Lclient!VJDNWPCM;")
	private Class8_Sub1_Sub1_Sub1_Sub2[] aClass8_Sub1_Sub1_Sub1_Sub2Array1 = new Class8_Sub1_Sub1_Sub1_Sub2[this.anInt966];

	@OriginalMember(owner = "client!client", name = "mf", descriptor = "[I")
	private int[] anIntArray236 = new int[this.anInt966];

	@OriginalMember(owner = "client!client", name = "of", descriptor = "[I")
	private int[] anIntArray237 = new int[this.anInt966];

	@OriginalMember(owner = "client!client", name = "pf", descriptor = "[Lclient!IUVBENCV;")
	private Class8_Sub1_Sub3[] aClass8_Sub1_Sub3Array1 = new Class8_Sub1_Sub3[this.anInt966];

	@OriginalMember(owner = "client!client", name = "yf", descriptor = "Z")
	private boolean aBoolean212 = true;

	@OriginalMember(owner = "client!client", name = "Af", descriptor = "I")
	private int anInt973 = -1;

	@OriginalMember(owner = "client!client", name = "Bf", descriptor = "[I")
	private int[] anIntArray242 = new int[33];

	@OriginalMember(owner = "client!client", name = "Cf", descriptor = "Z")
	private boolean aBoolean213 = false;

	@OriginalMember(owner = "client!client", name = "Gf", descriptor = "[I")
	private int[] anIntArray243 = new int[50];

	@OriginalMember(owner = "client!client", name = "Hf", descriptor = "B")
	private byte aByte30 = 115;

	@OriginalMember(owner = "client!client", name = "If", descriptor = "I")
	private final int anInt977 = 100;

	@OriginalMember(owner = "client!client", name = "Jf", descriptor = "[I")
	private int[] anIntArray244 = new int[100];

	@OriginalMember(owner = "client!client", name = "Kf", descriptor = "[I")
	private int[] anIntArray245 = new int[] { 17, 24, 34, 40 };

	@OriginalMember(owner = "client!client", name = "Lf", descriptor = "I")
	private int anInt978 = -1;

	@OriginalMember(owner = "client!client", name = "Mf", descriptor = "I")
	private int anInt979 = 7058;

	@OriginalMember(owner = "client!client", name = "Nf", descriptor = "[I")
	private int[] anIntArray246 = new int[5];

	@OriginalMember(owner = "client!client", name = "Of", descriptor = "Z")
	public boolean aBoolean214 = false;

	@OriginalMember(owner = "client!client", name = "Qf", descriptor = "Z")
	private boolean aBoolean215 = false;

	@OriginalMember(owner = "client!client", name = "Rf", descriptor = "[I")
	private int[] anIntArray247 = new int[151];

	@OriginalMember(owner = "client!client", name = "Sf", descriptor = "I")
	private int anInt980 = 78;

	@OriginalMember(owner = "client!client", name = "Tf", descriptor = "I")
	private int anInt981 = -7662;

	@OriginalMember(owner = "client!client", name = "ag", descriptor = "[Lclient!SFVBUBEZ;")
	private Class8_Sub1_Sub2_Sub2[] aClass8_Sub1_Sub2_Sub2Array5 = new Class8_Sub1_Sub2_Sub2[2];

	@OriginalMember(owner = "client!client", name = "dg", descriptor = "I")
	private int anInt987 = -1;

	@OriginalMember(owner = "client!client", name = "eg", descriptor = "[I")
	private int[] anIntArray249 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

	@OriginalMember(owner = "client!client", name = "jg", descriptor = "[Z")
	private boolean[] aBooleanArray12 = new boolean[5];

	@OriginalMember(owner = "client!client", name = "lg", descriptor = "I")
	private int anInt989 = 919;

	@OriginalMember(owner = "client!client", name = "mg", descriptor = "Ljava/lang/String;")
	private String aString25 = "";

	@OriginalMember(owner = "client!client", name = "pg", descriptor = "Z")
	private boolean aBoolean216 = true;

	@OriginalMember(owner = "client!client", name = "qg", descriptor = "I")
	private int anInt990 = 488;

	@OriginalMember(owner = "client!client", name = "ug", descriptor = "I")
	private int anInt993 = 50;

	@OriginalMember(owner = "client!client", name = "vg", descriptor = "[I")
	private int[] anIntArray253 = new int[this.anInt993];

	@OriginalMember(owner = "client!client", name = "wg", descriptor = "[I")
	private int[] anIntArray254 = new int[this.anInt993];

	@OriginalMember(owner = "client!client", name = "xg", descriptor = "[I")
	private int[] anIntArray255 = new int[this.anInt993];

	@OriginalMember(owner = "client!client", name = "yg", descriptor = "[I")
	private int[] anIntArray256 = new int[this.anInt993];

	@OriginalMember(owner = "client!client", name = "zg", descriptor = "[I")
	private int[] anIntArray257 = new int[this.anInt993];

	@OriginalMember(owner = "client!client", name = "Ag", descriptor = "[I")
	private int[] anIntArray258 = new int[this.anInt993];

	@OriginalMember(owner = "client!client", name = "Bg", descriptor = "[I")
	private int[] anIntArray259 = new int[this.anInt993];

	@OriginalMember(owner = "client!client", name = "Cg", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray11 = new String[this.anInt993];

	@OriginalMember(owner = "client!client", name = "Dg", descriptor = "Z")
	private boolean aBoolean217 = false;

	@OriginalMember(owner = "client!client", name = "Fg", descriptor = "[I")
	private int[] anIntArray260 = new int[500];

	@OriginalMember(owner = "client!client", name = "Gg", descriptor = "[I")
	private int[] anIntArray261 = new int[500];

	@OriginalMember(owner = "client!client", name = "Hg", descriptor = "[I")
	private int[] anIntArray262 = new int[500];

	@OriginalMember(owner = "client!client", name = "Ig", descriptor = "[I")
	private int[] anIntArray263 = new int[500];

	@OriginalMember(owner = "client!client", name = "Jg", descriptor = "I")
	private int anInt995 = -205;

	@OriginalMember(owner = "client!client", name = "Pg", descriptor = "Z")
	private boolean aBoolean218 = false;

	@OriginalMember(owner = "client!client", name = "Sg", descriptor = "[B")
	private byte[] aByteArray21 = new byte[16384];

	@OriginalMember(owner = "client!client", name = "Tg", descriptor = "[I")
	private int[] anIntArray264 = new int[100];

	@OriginalMember(owner = "client!client", name = "Ug", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray12 = new String[100];

	@OriginalMember(owner = "client!client", name = "Vg", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray13 = new String[100];

	@OriginalMember(owner = "client!client", name = "Xg", descriptor = "Z")
	private boolean aBoolean219 = false;

	@OriginalMember(owner = "client!client", name = "ch", descriptor = "Z")
	private volatile boolean aBoolean220 = false;

	@OriginalMember(owner = "client!client", name = "fh", descriptor = "[Lclient!GPLGZASP;")
	private Class8_Sub1_Sub2_Sub1[] aClass8_Sub1_Sub2_Sub1Array9 = new Class8_Sub1_Sub2_Sub1[32];

	@OriginalMember(owner = "client!client", name = "uh", descriptor = "I")
	private int anInt1012 = 7;

	@OriginalMember(owner = "client!client", name = "Ah", descriptor = "Lclient!ZEEWTYXI;")
	private Class49 aClass49_10 = new Class49(223);

	@OriginalMember(owner = "client!client", name = "Bh", descriptor = "Z")
	private boolean aBoolean223 = false;

	@OriginalMember(owner = "client!client", name = "Ch", descriptor = "Z")
	private boolean aBoolean224 = true;

	@OriginalMember(owner = "client!client", name = "Dh", descriptor = "I")
	private int anInt1017 = 7759444;

	@OriginalMember(owner = "client!client", name = "Eh", descriptor = "[I")
	private int[] anIntArray265 = new int[5];

	@OriginalMember(owner = "client!client", name = "Fh", descriptor = "Lclient!ZEEWTYXI;")
	private Class49 aClass49_11 = new Class49(223);

	@OriginalMember(owner = "client!client", name = "Gh", descriptor = "B")
	private byte aByte31 = 9;

	@OriginalMember(owner = "client!client", name = "Hh", descriptor = "[I")
	private int[] anIntArray266 = new int[9];

	@OriginalMember(owner = "client!client", name = "Mh", descriptor = "Z")
	private boolean aBoolean225 = false;

	@OriginalMember(owner = "client!client", name = "Nh", descriptor = "Ljava/lang/String;")
	private String aString26 = "";

	@OriginalMember(owner = "client!client", name = "Oh", descriptor = "I")
	private int anInt1022 = -1;

	@OriginalMember(owner = "client!client", name = "Ph", descriptor = "[[I")
	private int[][] anIntArrayArray25 = new int[104][104];

	@OriginalMember(owner = "client!client", name = "Qh", descriptor = "[I")
	private int[] anIntArray267 = new int[200];

	@OriginalMember(owner = "client!client", name = "Th", descriptor = "Z")
	private boolean aBoolean226 = true;

	@OriginalMember(owner = "client!client", name = "Uh", descriptor = "Z")
	private volatile boolean aBoolean227 = false;

	@OriginalMember(owner = "client!client", name = "Wh", descriptor = "Ljava/lang/String;")
	private String aString27 = "";

	@OriginalMember(owner = "client!client", name = "Xh", descriptor = "Ljava/lang/String;")
	private String aString28 = "";

	@OriginalMember(owner = "client!client", name = "Zh", descriptor = "Ljava/lang/String;")
	private String aString29 = "";

	@OriginalMember(owner = "client!client", name = "ai", descriptor = "[I")
	private int[] anIntArray268 = new int[256];

	@OriginalMember(owner = "client!client", name = "Ci", descriptor = "Z")
	private boolean aBoolean229 = false;

	@OriginalMember(owner = "client!client", name = "Ei", descriptor = "[J")
	private long[] aLongArray4 = new long[100];

	@OriginalMember(owner = "client!client", name = "Ki", descriptor = "I")
	private int anInt1036 = -1;

	@OriginalMember(owner = "client!client", name = "Li", descriptor = "I")
	private int anInt1037 = 451;

	@OriginalMember(owner = "client!client", name = "Pi", descriptor = "Ljava/lang/String;")
	private String aString30 = "";

	@OriginalMember(owner = "client!client", name = "Qi", descriptor = "Ljava/util/zip/CRC32;")
	private CRC32 aCRC32_2 = new CRC32();

	@OriginalMember(owner = "client!client", name = "aj", descriptor = "Lclient!MIIVNBFU;")
	private Class24 aClass24_1 = new Class24();

	@OriginalMember(owner = "client!client", name = "cj", descriptor = "[I")
	private int[] anIntArray272 = new int[Class17.anInt145];

	@OriginalMember(owner = "client!client", name = "qj", descriptor = "I")
	private int anInt1056 = 2;

	@OriginalMember(owner = "client!client", name = "sj", descriptor = "Z")
	private boolean aBoolean230 = false;

	@OriginalMember(owner = "client!client", name = "uj", descriptor = "Z")
	private boolean aBoolean231 = true;

	@OriginalMember(owner = "client!client", name = "wj", descriptor = "Z")
	private boolean aBoolean232 = false;

	@OriginalMember(owner = "client!client", name = "yj", descriptor = "B")
	private byte aByte32 = 0;

	@OriginalMember(owner = "client!client", name = "zj", descriptor = "[I")
	private int[] anIntArray273 = new int[Class17.anInt145];

	@OriginalMember(owner = "client!client", name = "Aj", descriptor = "I")
	private int anInt1060 = 3;

	@OriginalMember(owner = "client!client", name = "Bj", descriptor = "Z")
	private boolean aBoolean233 = false;

	@OriginalMember(owner = "client!client", name = "Cj", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray8 = new int[4][13][13];

	@OriginalMember(owner = "client!client", name = "Ij", descriptor = "Z")
	private boolean aBoolean234 = false;

	@OriginalMember(owner = "client!client", name = "Jj", descriptor = "Z")
	private boolean aBoolean235 = false;

	@OriginalMember(owner = "client!client", name = "Kj", descriptor = "Lclient!ZEEWTYXI;")
	private Class49 aClass49_12 = new Class49(223);

	@OriginalMember(owner = "client!client", name = "Nj", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray14 = new String[500];

	@OriginalMember(owner = "client!client", name = "Oj", descriptor = "I")
	private int anInt1067 = -66;

	@OriginalMember(owner = "client!client", name = "Zj", descriptor = "Z")
	private boolean aBoolean238 = true;

	@OriginalMember(owner = "client!client", name = "dk", descriptor = "[Lclient!GPLGZASP;")
	private Class8_Sub1_Sub2_Sub1[] aClass8_Sub1_Sub2_Sub1Array10 = new Class8_Sub1_Sub2_Sub1[100];

	@OriginalMember(owner = "client!client", name = "fk", descriptor = "I")
	private int anInt1077 = -1;

	@OriginalMember(owner = "client!client", name = "hk", descriptor = "[I")
	private int[] anIntArray274 = new int[4000];

	@OriginalMember(owner = "client!client", name = "ik", descriptor = "[I")
	private int[] anIntArray275 = new int[4000];

	@OriginalMember(owner = "client!client", name = "kk", descriptor = "I")
	private int anInt1080 = 2;

	@OriginalMember(owner = "client!client", name = "nk", descriptor = "[I")
	private int[] anIntArray276 = new int[5];

	static {
		@Pc(8) int local8 = 0;
		@Pc(10) int local10;
		for (local10 = 0; local10 < 99; local10++) {
			@Pc(15) int local15 = local10 + 1;
			@Pc(28) int local28 = (int) ((double) local15 + Math.pow(2.0D, (double) local15 / 7.0D) * 300.0D);
			local8 += local28;
			anIntArray215[local10] = local8 / 4;
		}
		aByte23 = 26;
		anIntArrayArray23 = new int[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, 33697, 22433, 2983, 54193 }, { 8741, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003, 25239 }, { 25238, 8742, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };
		aBigInteger1 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");
		aBigInteger2 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");
		anIntArray248 = new int[32];
		local8 = 2;
		for (local10 = 0; local10 < 32; local10++) {
			anIntArray248[local10] = local8 - 1;
			local8 += local8;
		}
		anIntArray250 = new int[] { 9104, 10275, 7595, 3610, 7975, 8526, 918, 38802, 24466, 10145, 58654, 5027, 1457, 16565, 34991, 25486 };
		anInt1008 = -81;
		anInt1057 = 45;
		anInt1074 = 10;
		aBoolean236 = true;
	}

	@OriginalMember(owner = "client!client", name = "main", descriptor = "([Ljava/lang/String;)V")
	public static void main(@OriginalArg(0) String[] arg0) {
		try {
			System.out.println("RS2 user client - release #" + 376);
			if (arg0.length == 5) {
				anInt1074 = Integer.parseInt(arg0[0]);
				anInt1075 = Integer.parseInt(arg0[1]);
				if (arg0[2].equals("lowmem")) {
					method673();
				} else if (arg0[2].equals("highmem")) {
					method678();
				} else {
					System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
					return;
				}
				if (arg0[3].equals("free")) {
					aBoolean236 = false;
				} else if (arg0[3].equals("members")) {
					aBoolean236 = true;
				} else {
					System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
					return;
				}
				signlink.anInt1087 = Integer.parseInt(arg0[4]);
				signlink.startpriv(InetAddress.getLocalHost());
				@Pc(87) client local87 = new client();
				local87.method574(anInt875);
			} else {
				System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
			}
		} catch (@Pc(94) Exception local94) {
		}
	}

	@OriginalMember(owner = "client!client", name = "z", descriptor = "(I)V")
	private static void method673() {
		try {
			Class32.aBoolean131 = true;
			Class8_Sub1_Sub2_Sub4.aBoolean182 = true;
			aBoolean237 = true;
			Class38.aBoolean143 = true;
			Class23.aBoolean83 = true;
		} catch (@Pc(15) RuntimeException local15) {
			signlink.reporterror("89072, " + 6823 + ", " + local15.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "A", descriptor = "(I)V")
	private static void method678() {
		try {
			Class32.aBoolean131 = false;
			Class8_Sub1_Sub2_Sub4.aBoolean182 = false;
			aBoolean237 = false;
			Class38.aBoolean143 = false;
			Class23.aBoolean83 = false;
		} catch (@Pc(20) RuntimeException local20) {
			signlink.reporterror("62375, " + 26784 + ", " + local20.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "g", descriptor = "(II)Ljava/lang/String;")
	private static String method686(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(3) boolean local3 = false;
			if (arg0 < 100000) {
				return String.valueOf(arg0);
			} else if (arg0 < 10000000) {
				return arg0 / 1000 + "K";
			} else {
				return arg0 / 1000000 + "M";
			}
		} catch (@Pc(35) RuntimeException local35) {
			signlink.reporterror("71206, " + arg0 + ", " + arg1 + ", " + local35.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(III)Ljava/lang/String;")
	private static String method712(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		try {
			@Pc(9) int local9 = arg0 - arg1;
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
			signlink.reporterror("29871, " + -161 + ", " + arg0 + ", " + arg1 + ", " + local50.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(ZI)Ljava/lang/String;")
	private static String method725(@OriginalArg(1) int arg0) {
		try {
			@Pc(4) String local4 = String.valueOf(arg0);
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
			signlink.reporterror("66661, " + true + ", " + arg0 + ", " + local95.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ZI)V")
	private void method587(@OriginalArg(0) boolean arg0) {
		try {
			if (aClass8_Sub1_Sub1_Sub1_Sub2_1.anInt716 >> 7 == this.anInt971 && aClass8_Sub1_Sub1_Sub1_Sub2_1.anInt717 >> 7 == this.anInt972) {
				this.anInt971 = 0;
			}
			@Pc(25) int local25 = this.anInt968;
			if (arg0) {
				local25 = 1;
			}
			for (@Pc(31) int local31 = 0; local31 < local25; local31++) {
				@Pc(37) Class8_Sub1_Sub1_Sub1_Sub2 local37;
				@Pc(42) int local42;
				if (arg0) {
					local37 = aClass8_Sub1_Sub1_Sub1_Sub2_1;
					local42 = this.anInt967 << 14;
				} else {
					local37 = this.aClass8_Sub1_Sub1_Sub1_Sub2Array1[this.anIntArray236[local31]];
					local42 = this.anIntArray236[local31] << 14;
				}
				if (local37 != null && local37.method474(this.anInt995)) {
					local37.aBoolean162 = false;
					if ((aBoolean237 && this.anInt968 > 50 || this.anInt968 > 200) && !arg0 && local37.anInt727 == local37.anInt706) {
						local37.aBoolean162 = true;
					}
					@Pc(94) int local94 = local37.anInt716 >> 7;
					@Pc(99) int local99 = local37.anInt717 >> 7;
					if (local94 >= 0 && local94 < 104 && local99 >= 0 && local99 < 104) {
						if (local37.aClass8_Sub1_Sub1_Sub5_2 == null || anInt983 < local37.anInt748 || anInt983 >= local37.anInt749) {
							if ((local37.anInt716 & 0x7F) == 64 && (local37.anInt717 & 0x7F) == 64) {
								if (this.anIntArrayArray25[local94][local99] == this.anInt921) {
									continue;
								}
								this.anIntArrayArray25[local94][local99] = this.anInt921;
							}
							local37.anInt734 = this.method680(local37.anInt717, this.anInt933, local37.anInt716);
							this.aClass32_1.method327(this.anInt869, 60, local37.anInt716, this.anInt933, local42, local37.anInt717, local37.aBoolean160, local37, local37.anInt734, local37.anInt718);
						} else {
							local37.aBoolean162 = false;
							local37.anInt734 = this.method680(local37.anInt717, this.anInt933, local37.anInt716);
							this.aClass32_1.method328(local37.anInt735, local37.anInt738, local37.anInt734, local37.anInt737, local37.anInt717, local37.anInt716, local37, local42, this.anInt933, local37.anInt718, local37.anInt736);
						}
					}
				}
			}
		} catch (@Pc(229) RuntimeException local229) {
			signlink.reporterror("78013, " + arg0 + ", " + 7 + ", " + local229.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(BZ)V")
	private void method588(@OriginalArg(1) boolean arg0) {
		try {
			for (@Pc(1) int local1 = 0; local1 < this.anInt950; local1++) {
				@Pc(11) Class8_Sub1_Sub1_Sub1_Sub1 local11 = this.aClass8_Sub1_Sub1_Sub1_Sub1Array1[this.anIntArray223[local1]];
				@Pc(20) int local20 = (this.anIntArray223[local1] << 14) + 536870912;
				if (local11 != null && local11.method474(this.anInt995) && local11.aClass26_1.aBoolean112 == arg0 && local11.aClass26_1.method296()) {
					@Pc(42) int local42 = local11.anInt716 >> 7;
					@Pc(47) int local47 = local11.anInt717 >> 7;
					if (local42 >= 0 && local42 < 104 && local47 >= 0 && local47 < 104) {
						if (local11.anInt726 == 1 && (local11.anInt716 & 0x7F) == 64 && (local11.anInt717 & 0x7F) == 64) {
							if (this.anIntArrayArray25[local42][local47] == this.anInt921) {
								continue;
							}
							this.anIntArrayArray25[local42][local47] = this.anInt921;
						}
						if (!local11.aClass26_1.aBoolean110) {
							local20 += Integer.MIN_VALUE;
						}
						this.aClass32_1.method327(this.anInt869, (local11.anInt726 - 1) * 64 + 60, local11.anInt716, this.anInt933, local20, local11.anInt717, local11.aBoolean160, local11, this.method680(local11.anInt717, this.anInt933, local11.anInt716), local11.anInt718);
					}
				}
			}
		} catch (@Pc(145) RuntimeException local145) {
			signlink.reporterror("40314, " + 20 + ", " + arg0 + ", " + local145.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Z)V")
	private void method589(@OriginalArg(0) boolean arg0) {
		try {
			@Pc(8) int local8;
			if (this.anInt889 > 0) {
				for (local8 = 0; local8 < 256; local8++) {
					if (this.anInt889 > 768) {
						this.anIntArray238[local8] = this.method665(this.anIntArray239[local8], this.anIntArray240[local8], 1024 - this.anInt889);
					} else if (this.anInt889 > 256) {
						this.anIntArray238[local8] = this.anIntArray240[local8];
					} else {
						this.anIntArray238[local8] = this.method665(this.anIntArray240[local8], this.anIntArray239[local8], 256 - this.anInt889);
					}
				}
			} else if (this.anInt890 > 0) {
				for (local8 = 0; local8 < 256; local8++) {
					if (this.anInt890 > 768) {
						this.anIntArray238[local8] = this.method665(this.anIntArray239[local8], this.anIntArray241[local8], 1024 - this.anInt890);
					} else if (this.anInt890 > 256) {
						this.anIntArray238[local8] = this.anIntArray241[local8];
					} else {
						this.anIntArray238[local8] = this.method665(this.anIntArray241[local8], this.anIntArray239[local8], 256 - this.anInt890);
					}
				}
			} else {
				for (local8 = 0; local8 < 256; local8++) {
					this.anIntArray238[local8] = this.anIntArray239[local8];
				}
			}
			for (local8 = 0; local8 < 33920; local8++) {
				this.aClass11_13.anIntArray34[local8] = this.aClass8_Sub1_Sub2_Sub1_4.anIntArray41[local8];
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
				local198 = this.anIntArray268[local185] * (256 - local185) / 256;
				local202 = local198 + 22;
				if (local202 < 0) {
					local202 = 0;
				}
				local181 += local202;
				for (local212 = local202; local212 < 128; local212++) {
					local220 = this.anIntArray224[local181++];
					if (local220 == 0) {
						local183++;
					} else {
						local224 = local220;
						local228 = 256 - local220;
						local220 = this.anIntArray238[local220];
						local239 = this.aClass11_13.anIntArray34[local183];
						this.aClass11_13.anIntArray34[local183++] = ((local220 & 0xFF00FF) * local224 + (local239 & 0xFF00FF) * local228 & 0xFF00FF00) + ((local220 & 0xFF00) * local224 + (local239 & 0xFF00) * local228 & 0xFF0000) >> 8;
					}
				}
				local183 += local202;
			}
			this.aClass11_13.method71(0, super.aGraphics2, 0);
			this.aBoolean214 &= arg0;
			for (local198 = 0; local198 < 33920; local198++) {
				this.aClass11_14.anIntArray34[local198] = this.aClass8_Sub1_Sub2_Sub1_5.anIntArray41[local198];
			}
			local181 = 0;
			local183 = 1176;
			for (local202 = 1; local202 < 255; local202++) {
				local212 = this.anIntArray268[local202] * (256 - local202) / 256;
				local220 = 103 - local212;
				local183 += local212;
				for (local224 = 0; local224 < local220; local224++) {
					local228 = this.anIntArray224[local181++];
					if (local228 == 0) {
						local183++;
					} else {
						local239 = local228;
						@Pc(368) int local368 = 256 - local228;
						local228 = this.anIntArray238[local228];
						@Pc(379) int local379 = this.aClass11_14.anIntArray34[local183];
						this.aClass11_14.anIntArray34[local183++] = ((local228 & 0xFF00FF) * local239 + (local379 & 0xFF00FF) * local368 & 0xFF00FF00) + ((local228 & 0xFF00) * local239 + (local379 & 0xFF00) * local368 & 0xFF0000) >> 8;
					}
				}
				local181 += 128 - local220;
				local183 += 128 - local220 - local212;
			}
			this.aClass11_14.method71(637, super.aGraphics2, 0);
		} catch (@Pc(451) RuntimeException local451) {
			signlink.reporterror("82100, " + arg0 + ", " + local451.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(I)V")
	private void method590() {
		try {
			if (this.anInt1078 == 2) {
				this.method655((this.anInt996 - this.anInt924 << 7) + this.anInt999, (this.anInt997 - this.anInt925 << 7) + this.anInt1000, this.anInt998 * 2);
				this.anInt1044 += 0;
				if (this.anInt958 > -1 && anInt983 % 20 < 10) {
					this.aClass8_Sub1_Sub2_Sub1Array8[0].method117(this.anInt959 - 28, this.anInt958 - 12);
				}
			}
		} catch (@Pc(62) RuntimeException local62) {
			signlink.reporterror("17635, " + 0 + ", " + local62.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(JI)V")
	private void method591(@OriginalArg(0) long arg0) {
		try {
			if (arg0 != 0L) {
				if (this.anInt917 >= 100) {
					this.method694(0, "Your ignore list is full. Max of 100 hit", "");
				} else {
					@Pc(23) String local23 = Class36.method385(839, Class36.method382((byte) 3, arg0));
					for (@Pc(32) int local32 = 0; local32 < this.anInt917; local32++) {
						if (this.aLongArray4[local32] == arg0) {
							this.method694(0, local23 + " is already on your ignore list", "");
							return;
						}
					}
					for (@Pc(62) int local62 = 0; local62 < this.anInt1081; local62++) {
						if (this.aLongArray3[local62] == arg0) {
							this.method694(0, "Please remove " + local23 + " from your friend list first", "");
							return;
						}
					}
					this.aLongArray4[this.anInt917++] = arg0;
					this.aBoolean217 = true;
					this.aClass8_Sub1_Sub3_6.method141(238);
					this.aClass8_Sub1_Sub3_6.method148(arg0);
				}
			}
		} catch (@Pc(117) RuntimeException local117) {
			signlink.reporterror("28038, " + arg0 + ", " + 0 + ", " + local117.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(II)V")
	private void method592(@OriginalArg(1) int arg0) {
		try {
			@Pc(4) int local4 = Class41.aClass41Array1[arg0].anInt655;
			if (local4 != 0) {
				@Pc(12) int local12 = this.anIntArray218[arg0];
				if (local4 == 1) {
					if (local12 == 1) {
						Class8_Sub1_Sub2_Sub4.method566(0.9D);
					}
					if (local12 == 2) {
						Class8_Sub1_Sub2_Sub4.method566(0.8D);
					}
					if (local12 == 3) {
						Class8_Sub1_Sub2_Sub4.method566(0.7D);
					}
					if (local12 == 4) {
						Class8_Sub1_Sub2_Sub4.method566(0.6D);
					}
					Class19.aClass33_3.method369();
					this.aBoolean219 = true;
				}
				if (local4 == 3) {
					@Pc(59) boolean local59 = this.aBoolean194;
					if (local12 == 0) {
						this.method598(this.aBoolean194, this.aBoolean218, 0);
						this.aBoolean194 = true;
					}
					if (local12 == 1) {
						this.method598(this.aBoolean194, this.aBoolean218, -400);
						this.aBoolean194 = true;
					}
					if (local12 == 2) {
						this.method598(this.aBoolean194, this.aBoolean218, -800);
						this.aBoolean194 = true;
					}
					if (local12 == 3) {
						this.method598(this.aBoolean194, this.aBoolean218, -1200);
						this.aBoolean194 = true;
					}
					if (local12 == 4) {
						this.aBoolean194 = false;
					}
					if (this.aBoolean194 != local59 && !aBoolean237) {
						if (this.aBoolean194) {
							this.anInt1058 = this.anInt910;
							this.aBoolean231 = true;
							this.aClass4_Sub1_1.method41(2, this.anInt1058);
						} else {
							this.method629(79);
						}
						this.anInt918 = 0;
					}
				}
				if (local4 == 4) {
					if (local12 == 0) {
						this.aBoolean212 = true;
						this.method714(0);
					}
					if (local12 == 1) {
						this.aBoolean212 = true;
						this.method714(-400);
					}
					if (local12 == 2) {
						this.aBoolean212 = true;
						this.method714(-800);
					}
					if (local12 == 3) {
						this.aBoolean212 = true;
						this.method714(-1200);
					}
					if (local12 == 4) {
						this.aBoolean212 = false;
					}
				}
				if (local4 == 5) {
					this.anInt929 = local12;
				}
				if (local4 == 6) {
					this.anInt1084 = local12;
				}
				if (local4 == 8) {
					this.anInt858 = local12;
					this.aBoolean191 = true;
				}
				if (local4 == 9) {
					this.anInt886 = local12;
				}
			}
		} catch (@Pc(223) RuntimeException local223) {
			signlink.reporterror("93784, " + 7 + ", " + arg0 + ", " + local223.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIZIII)V")
	private void method593(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		try {
			@Pc(8) int local8 = this.aClass32_1.method342(arg1, arg2, arg0);
			@Pc(18) int local18;
			@Pc(24) int local24;
			@Pc(28) int local28;
			@Pc(30) int local30;
			@Pc(52) int local52;
			@Pc(58) int local58;
			if (local8 != 0) {
				local18 = this.aClass32_1.method346(arg1, arg2, arg0, local8);
				local24 = local18 >> 6 & 0x3;
				local28 = local18 & 0x1F;
				local30 = arg3;
				if (local8 > 0) {
					local30 = arg4;
				}
				@Pc(38) int[] local38 = this.aClass8_Sub1_Sub2_Sub1_9.anIntArray41;
				local52 = arg2 * 4 + (103 - arg0) * 512 * 4 + 24624;
				local58 = local8 >> 14 & 0x7FFF;
				@Pc(61) Class23 local61 = Class23.method260(local58);
				if (local61.anInt388 == -1) {
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
					@Pc(71) Class8_Sub1_Sub2_Sub2 local71 = this.aClass8_Sub1_Sub2_Sub2Array3[local61.anInt388];
					if (local71 != null) {
						@Pc(83) int local83 = (local61.anInt374 * 4 - local71.anInt601) / 2;
						@Pc(93) int local93 = (local61.anInt389 * 4 - local71.anInt602) / 2;
						local71.method406((104 - arg0 - local61.anInt389) * 4 + local93 + 48, arg2 * 4 + 48 + local83);
					}
				}
			}
			local8 = this.aClass32_1.method344(arg1, arg2, arg0);
			if (local8 != 0) {
				local18 = this.aClass32_1.method346(arg1, arg2, arg0, local8);
				local24 = local18 >> 6 & 0x3;
				local28 = local18 & 0x1F;
				local30 = local8 >> 14 & 0x7FFF;
				@Pc(450) Class23 local450 = Class23.method260(local30);
				@Pc(482) int local482;
				if (local450.anInt388 != -1) {
					@Pc(460) Class8_Sub1_Sub2_Sub2 local460 = this.aClass8_Sub1_Sub2_Sub2Array3[local450.anInt388];
					if (local460 != null) {
						local58 = (local450.anInt374 * 4 - local460.anInt601) / 2;
						local482 = (local450.anInt389 * 4 - local460.anInt602) / 2;
						local460.method406((104 - arg0 - local450.anInt389) * 4 + local482 + 48, arg2 * 4 + 48 + local58);
					}
				} else if (local28 == 9) {
					local52 = 15658734;
					if (local8 > 0) {
						local52 = 15597568;
					}
					@Pc(519) int[] local519 = this.aClass8_Sub1_Sub2_Sub1_9.anIntArray41;
					local482 = arg2 * 4 + (103 - arg0) * 512 * 4 + 24624;
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
			local8 = this.aClass32_1.method345(arg1, arg2, arg0);
			if (local8 != 0) {
				local18 = local8 >> 14 & 0x7FFF;
				@Pc(614) Class23 local614 = Class23.method260(local18);
				if (local614.anInt388 != -1) {
					@Pc(624) Class8_Sub1_Sub2_Sub2 local624 = this.aClass8_Sub1_Sub2_Sub2Array3[local614.anInt388];
					if (local624 != null) {
						local30 = (local614.anInt374 * 4 - local624.anInt601) / 2;
						@Pc(646) int local646 = (local614.anInt389 * 4 - local624.anInt602) / 2;
						local624.method406((104 - arg0 - local614.anInt389) * 4 + local646 + 48, arg2 * 4 + 48 + local30);
						return;
					}
				}
			}
		} catch (@Pc(670) RuntimeException local670) {
			signlink.reporterror("44338, " + arg0 + ", " + arg1 + ", " + true + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local670.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!SFVBUBEZ;B)V")
	private void method594(@OriginalArg(0) Class8_Sub1_Sub2_Sub2 arg0) {
		try {
			for (@Pc(5) int local5 = 0; local5 < this.anIntArray251.length; local5++) {
				this.anIntArray251[local5] = 0;
			}
			@Pc(30) int local30;
			for (@Pc(20) int local20 = 0; local20 < 5000; local20++) {
				local30 = (int) (Math.random() * 128.0D * (double) 256);
				this.anIntArray251[local30] = (int) (Math.random() * 256.0D);
			}
			if (this.aByte30 != 115) {
				this.method579();
			}
			@Pc(54) int local54;
			@Pc(58) int local58;
			@Pc(66) int local66;
			for (local30 = 0; local30 < 20; local30++) {
				for (local54 = 1; local54 < 255; local54++) {
					for (local58 = 1; local58 < 127; local58++) {
						local66 = local58 + (local54 << 7);
						this.anIntArray252[local66] = (this.anIntArray251[local66 - 1] + this.anIntArray251[local66 + 1] + this.anIntArray251[local66 - 128] + this.anIntArray251[local66 + 128]) / 4;
					}
				}
				@Pc(112) int[] local112 = this.anIntArray251;
				this.anIntArray251 = this.anIntArray252;
				this.anIntArray252 = local112;
			}
			if (arg0 != null) {
				local54 = 0;
				for (local58 = 0; local58 < arg0.anInt602; local58++) {
					for (local66 = 0; local66 < arg0.anInt601; local66++) {
						if (arg0.aByteArray19[local54++] != 0) {
							@Pc(148) int local148 = local66 + arg0.anInt603 + 16;
							@Pc(155) int local155 = local58 + arg0.anInt604 + 16;
							@Pc(161) int local161 = local148 + (local155 << 7);
							this.anIntArray251[local161] = 0;
						}
					}
				}
			}
		} catch (@Pc(178) RuntimeException local178) {
			signlink.reporterror("93680, " + arg0 + ", " + 115 + ", " + local178.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "f", descriptor = "(I)V")
	private void method595() {
		try {
			if (this.anInt887 != -41334) {
				for (@Pc(7) int local7 = 1; local7 > 0; local7++) {
				}
			}
			if (this.anInt915 == 2) {
				for (@Pc(21) Class8_Sub3 local21 = (Class8_Sub3) this.aClass49_12.method538(); local21 != null; local21 = (Class8_Sub3) this.aClass49_12.method540((byte) 6)) {
					if (local21.anInt311 > 0) {
						local21.anInt311--;
					}
					if (local21.anInt311 != 0) {
						if (local21.anInt312 > 0) {
							local21.anInt312--;
						}
						if (local21.anInt312 == 0 && local21.anInt315 >= 1 && local21.anInt316 >= 1 && local21.anInt315 <= 102 && local21.anInt316 <= 102 && (local21.anInt305 < 0 || Class38.method428(local21.anInt307, local21.anInt305))) {
							this.method596(local21.anInt314, local21.anInt307, local21.anInt315, local21.anInt305, local21.anInt316, local21.anInt306, local21.anInt313);
							local21.anInt312 = -1;
							if (local21.anInt305 == local21.anInt308 && local21.anInt308 == -1) {
								local21.method543();
							} else if (local21.anInt305 == local21.anInt308 && local21.anInt306 == local21.anInt309 && local21.anInt307 == local21.anInt310) {
								local21.method543();
							}
						}
					} else if (local21.anInt308 < 0 || Class38.method428(local21.anInt310, local21.anInt308)) {
						this.method596(local21.anInt314, local21.anInt310, local21.anInt315, local21.anInt308, local21.anInt316, local21.anInt309, local21.anInt313);
						local21.method543();
					}
				}
			}
		} catch (@Pc(164) RuntimeException local164) {
			signlink.reporterror("61478, " + -41334 + ", " + local164.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIIIIII)V")
	private void method596(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		try {
			if (arg2 >= 1 && arg4 >= 1 && arg2 <= 102 && arg4 <= 102) {
				if (aBoolean237 && arg6 != this.anInt933) {
					return;
				}
				@Pc(30) int local30 = 0;
				if (arg0 == 0) {
					local30 = this.aClass32_1.method342(arg6, arg2, arg4);
				}
				if (arg0 == 1) {
					local30 = this.aClass32_1.method343(arg4, arg2, arg6);
				}
				if (arg0 == 2) {
					local30 = this.aClass32_1.method344(arg6, arg2, arg4);
				}
				if (arg0 == 3) {
					local30 = this.aClass32_1.method345(arg6, arg2, arg4);
				}
				@Pc(86) int local86;
				if (local30 != 0) {
					local86 = this.aClass32_1.method346(arg6, arg2, arg4, local30);
					@Pc(92) int local92 = local30 >> 14 & 0x7FFF;
					@Pc(96) int local96 = local86 & 0x1F;
					@Pc(100) int local100 = local86 >> 6;
					@Pc(112) Class23 local112;
					if (arg0 == 0) {
						this.aClass32_1.method333(arg4, arg6, arg2);
						local112 = Class23.method260(local92);
						if (local112.aBoolean86) {
							this.aClass1Array1[arg6].method6(local96, local112.aBoolean81, local100, arg2, arg4);
						}
					}
					if (arg0 == 1) {
						this.aClass32_1.method334(390, arg6, arg4, arg2);
					}
					if (arg0 == 2) {
						this.aClass32_1.method335(arg6, arg4, arg2);
						local112 = Class23.method260(local92);
						if (arg2 + local112.anInt374 > 103 || arg4 + local112.anInt374 > 103 || arg2 + local112.anInt389 > 103 || arg4 + local112.anInt389 > 103) {
							return;
						}
						if (local112.aBoolean86) {
							this.aClass1Array1[arg6].method7(local112.aBoolean81, local112.anInt389, arg2, arg4, local100, local112.anInt374);
						}
					}
					if (arg0 == 3) {
						this.aClass32_1.method336(arg6, arg2, arg4);
						local112 = Class23.method260(local92);
						if (local112.aBoolean86 && local112.aBoolean87) {
							this.aClass1Array1[arg6].method9(arg2, arg4);
						}
					}
				}
				if (arg3 >= 0) {
					local86 = arg6;
					if (arg6 < 3 && (this.aByteArrayArrayArray8[1][arg2][arg4] & 0x2) == 2) {
						local86 = arg6 + 1;
					}
					Class38.method424(arg4, local86, arg1, arg2, arg5, arg6, this.aClass32_1, this.aClass1Array1[arg6], this.anIntArrayArrayArray7, arg3);
					return;
				}
			}
		} catch (@Pc(259) RuntimeException local259) {
			signlink.reporterror("2531, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + 369 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + local259.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "g", descriptor = "(I)V")
	private void method597() {
		try {
			@Pc(7) int local7 = this.aClass8_Sub1_Sub2_Sub3_4.method449("Choose Option");
			@Pc(24) int local24;
			for (@Pc(13) int local13 = 0; local13 < this.anInt1025; local13++) {
				local24 = this.aClass8_Sub1_Sub2_Sub3_4.method449(this.aStringArray14[local13]);
				if (local24 > local7) {
					local7 = local24;
				}
			}
			local7 += 8;
			local24 = this.anInt1025 * 15 + 21;
			@Pc(67) int local67;
			@Pc(85) int local85;
			if (super.anInt846 > 4 && super.anInt847 > 4 && super.anInt846 < 516 && super.anInt847 < 338) {
				local67 = super.anInt846 - local7 / 2 - 4;
				if (local67 + local7 > 512) {
					local67 = 512 - local7;
				}
				if (local67 < 0) {
					local67 = 0;
				}
				local85 = super.anInt847 - 4;
				if (local85 + local24 > 334) {
					local85 = 334 - local24;
				}
				if (local85 < 0) {
					local85 = 0;
				}
				this.aBoolean208 = true;
				this.anInt892 = 0;
				this.anInt893 = local67;
				this.anInt894 = local85;
				this.anInt895 = local7;
				this.anInt896 = this.anInt1025 * 15 + 22;
			}
			if (super.anInt846 > 553 && super.anInt847 > 205 && super.anInt846 < 743 && super.anInt847 < 466) {
				local67 = super.anInt846 - local7 / 2 - 553;
				if (local67 < 0) {
					local67 = 0;
				} else if (local67 + local7 > 190) {
					local67 = 190 - local7;
				}
				local85 = super.anInt847 - 205;
				if (local85 < 0) {
					local85 = 0;
				} else if (local85 + local24 > 261) {
					local85 = 261 - local24;
				}
				this.aBoolean208 = true;
				this.anInt892 = 1;
				this.anInt893 = local67;
				this.anInt894 = local85;
				this.anInt895 = local7;
				this.anInt896 = this.anInt1025 * 15 + 22;
			}
			if (super.anInt846 > 17 && super.anInt847 > 357 && super.anInt846 < 496 && super.anInt847 < 453) {
				local67 = super.anInt846 - local7 / 2 - 17;
				if (local67 < 0) {
					local67 = 0;
				} else if (local67 + local7 > 479) {
					local67 = 479 - local7;
				}
				local85 = super.anInt847 - 357;
				if (local85 < 0) {
					local85 = 0;
				} else if (local85 + local24 > 96) {
					local85 = 96 - local24;
				}
				this.aBoolean208 = true;
				this.anInt892 = 2;
				this.anInt893 = local67;
				this.anInt894 = local85;
				this.anInt895 = local7;
				this.anInt896 = this.anInt1025 * 15 + 22;
			}
		} catch (@Pc(289) RuntimeException local289) {
			signlink.reporterror("80668, " + 0 + ", " + local289.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ZZI)V")
	private void method598(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2) {
		try {
			signlink.anInt1091 = arg2;
			if (arg1) {
				for (@Pc(5) int local5 = 1; local5 > 0; local5++) {
				}
			}
			if (arg0) {
				signlink.midi = "voladjust";
			}
		} catch (@Pc(16) RuntimeException local16) {
			signlink.reporterror("26722, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local16.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "h", descriptor = "(I)V")
	private void method599() {
		try {
			while (true) {
				@Pc(9) Class8_Sub1_Sub4 local9 = this.aClass4_Sub1_1.method23();
				if (local9 == null) {
					return;
				}
				if (local9.anInt518 == 0) {
					Class8_Sub1_Sub1_Sub5.method208(local9.anInt520, local9.aByteArray17);
					if ((this.aClass4_Sub1_1.method36(local9.anInt520) & 0x62) != 0) {
						this.aBoolean217 = true;
						if (this.anInt973 != -1 || this.anInt1022 != -1) {
							this.aBoolean191 = true;
						}
					}
				}
				if (local9.anInt518 == 1 && local9.aByteArray17 != null) {
					Class29.method306(this.aByte25, local9.aByteArray17);
				}
				if (local9.anInt518 == 2 && local9.anInt520 == this.anInt1058 && local9.aByteArray17 != null) {
					this.method607(this.aBoolean231, local9.aByteArray17);
				}
				if (local9.anInt518 == 3 && this.anInt915 == 1) {
					for (@Pc(85) int local85 = 0; local85 < this.aByteArrayArray5.length; local85++) {
						if (this.anIntArray270[local85] == local9.anInt520) {
							this.aByteArrayArray5[local85] = local9.aByteArray17;
							if (local9.aByteArray17 == null) {
								this.anIntArray270[local85] = -1;
							}
							break;
						}
						if (this.anIntArray271[local85] == local9.anInt520) {
							this.aByteArrayArray6[local85] = local9.aByteArray17;
							if (local9.aByteArray17 == null) {
								this.anIntArray271[local85] = -1;
							}
							break;
						}
					}
				}
				if (local9.anInt518 == 93 && this.aClass4_Sub1_1.method38(local9.anInt520)) {
					Class38.method415(this.aClass4_Sub1_1, (byte) 3, new Class8_Sub1_Sub3(local9.aByteArray17, 713));
				}
			}
		} catch (@Pc(162) RuntimeException local162) {
			signlink.reporterror("66381, " + -7744 + ", " + local162.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIZIIIIIIIII)Z")
	private boolean method600(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11) {
		try {
			@Pc(11) int local11;
			for (@Pc(7) int local7 = 0; local7 < 104; local7++) {
				for (local11 = 0; local11 < 104; local11++) {
					this.anIntArrayArray24[local7][local11] = 0;
					this.anIntArrayArray22[local7][local11] = 99999999;
				}
			}
			local11 = arg4;
			@Pc(39) int local39 = arg10;
			this.anIntArrayArray24[arg4][arg10] = 99;
			if (arg6 <= 0) {
				this.method579();
			}
			this.anIntArrayArray22[arg4][arg10] = 0;
			@Pc(59) byte local59 = 0;
			@Pc(61) int local61 = 0;
			this.anIntArray274[0] = arg4;
			@Pc(70) int local70 = local59 + 1;
			this.anIntArray275[0] = arg10;
			@Pc(74) boolean local74 = false;
			@Pc(78) int local78 = this.anIntArray274.length;
			@Pc(85) int[][] local85 = this.aClass1Array1[this.anInt933].anIntArrayArray1;
			@Pc(196) int local196;
			while (local61 != local70) {
				local11 = this.anIntArray274[local61];
				local39 = this.anIntArray275[local61];
				local61 = (local61 + 1) % local78;
				if (local11 == arg9 && local39 == arg0) {
					local74 = true;
					break;
				}
				if (arg3 != 0) {
					if ((arg3 < 5 || arg3 == 10) && this.aClass1Array1[this.anInt933].method10(local39, arg0, arg7, arg3 - 1, local11, arg9)) {
						local74 = true;
						break;
					}
					if (arg3 < 10 && this.aClass1Array1[this.anInt933].method11(arg9, local39, local11, arg7, arg0, arg3 - 1)) {
						local74 = true;
						break;
					}
				}
				if (arg11 != 0 && arg5 != 0 && this.aClass1Array1[this.anInt933].method12(arg11, arg0, (byte) 9, arg8, arg5, local39, arg9, local11)) {
					local74 = true;
					break;
				}
				local196 = this.anIntArrayArray22[local11][local39] + 1;
				if (local11 > 0 && this.anIntArrayArray24[local11 - 1][local39] == 0 && (local85[local11 - 1][local39] & 0x1280108) == 0) {
					this.anIntArray274[local70] = local11 - 1;
					this.anIntArray275[local70] = local39;
					local70 = (local70 + 1) % local78;
					this.anIntArrayArray24[local11 - 1][local39] = 2;
					this.anIntArrayArray22[local11 - 1][local39] = local196;
				}
				if (local11 < 103 && this.anIntArrayArray24[local11 + 1][local39] == 0 && (local85[local11 + 1][local39] & 0x1280180) == 0) {
					this.anIntArray274[local70] = local11 + 1;
					this.anIntArray275[local70] = local39;
					local70 = (local70 + 1) % local78;
					this.anIntArrayArray24[local11 + 1][local39] = 8;
					this.anIntArrayArray22[local11 + 1][local39] = local196;
				}
				if (local39 > 0 && this.anIntArrayArray24[local11][local39 - 1] == 0 && (local85[local11][local39 - 1] & 0x1280102) == 0) {
					this.anIntArray274[local70] = local11;
					this.anIntArray275[local70] = local39 - 1;
					local70 = (local70 + 1) % local78;
					this.anIntArrayArray24[local11][local39 - 1] = 1;
					this.anIntArrayArray22[local11][local39 - 1] = local196;
				}
				if (local39 < 103 && this.anIntArrayArray24[local11][local39 + 1] == 0 && (local85[local11][local39 + 1] & 0x1280120) == 0) {
					this.anIntArray274[local70] = local11;
					this.anIntArray275[local70] = local39 + 1;
					local70 = (local70 + 1) % local78;
					this.anIntArrayArray24[local11][local39 + 1] = 4;
					this.anIntArrayArray22[local11][local39 + 1] = local196;
				}
				if (local11 > 0 && local39 > 0 && this.anIntArrayArray24[local11 - 1][local39 - 1] == 0 && (local85[local11 - 1][local39 - 1] & 0x128010E) == 0 && (local85[local11 - 1][local39] & 0x1280108) == 0 && (local85[local11][local39 - 1] & 0x1280102) == 0) {
					this.anIntArray274[local70] = local11 - 1;
					this.anIntArray275[local70] = local39 - 1;
					local70 = (local70 + 1) % local78;
					this.anIntArrayArray24[local11 - 1][local39 - 1] = 3;
					this.anIntArrayArray22[local11 - 1][local39 - 1] = local196;
				}
				if (local11 < 103 && local39 > 0 && this.anIntArrayArray24[local11 + 1][local39 - 1] == 0 && (local85[local11 + 1][local39 - 1] & 0x1280183) == 0 && (local85[local11 + 1][local39] & 0x1280180) == 0 && (local85[local11][local39 - 1] & 0x1280102) == 0) {
					this.anIntArray274[local70] = local11 + 1;
					this.anIntArray275[local70] = local39 - 1;
					local70 = (local70 + 1) % local78;
					this.anIntArrayArray24[local11 + 1][local39 - 1] = 9;
					this.anIntArrayArray22[local11 + 1][local39 - 1] = local196;
				}
				if (local11 > 0 && local39 < 103 && this.anIntArrayArray24[local11 - 1][local39 + 1] == 0 && (local85[local11 - 1][local39 + 1] & 0x1280138) == 0 && (local85[local11 - 1][local39] & 0x1280108) == 0 && (local85[local11][local39 + 1] & 0x1280120) == 0) {
					this.anIntArray274[local70] = local11 - 1;
					this.anIntArray275[local70] = local39 + 1;
					local70 = (local70 + 1) % local78;
					this.anIntArrayArray24[local11 - 1][local39 + 1] = 6;
					this.anIntArrayArray22[local11 - 1][local39 + 1] = local196;
				}
				if (local11 < 103 && local39 < 103 && this.anIntArrayArray24[local11 + 1][local39 + 1] == 0 && (local85[local11 + 1][local39 + 1] & 0x12801E0) == 0 && (local85[local11 + 1][local39] & 0x1280180) == 0 && (local85[local11][local39 + 1] & 0x1280120) == 0) {
					this.anIntArray274[local70] = local11 + 1;
					this.anIntArray275[local70] = local39 + 1;
					local70 = (local70 + 1) % local78;
					this.anIntArrayArray24[local11 + 1][local39 + 1] = 12;
					this.anIntArrayArray22[local11 + 1][local39 + 1] = local196;
				}
			}
			this.anInt1049 = 0;
			@Pc(812) int local812;
			@Pc(818) int local818;
			@Pc(824) int local824;
			if (!local74) {
				if (!arg2) {
					return false;
				}
				local196 = 1000;
				local812 = 100;
				for (local818 = arg9 - 10; local818 <= arg9 + 10; local818++) {
					for (local824 = arg0 - 10; local824 <= arg0 + 10; local824++) {
						if (local818 >= 0 && local824 >= 0 && local818 < 104 && local824 < 104 && this.anIntArrayArray22[local818][local824] < 100) {
							@Pc(846) int local846 = 0;
							if (local818 < arg9) {
								local846 = arg9 - local818;
							} else if (local818 > arg9 + arg11 - 1) {
								local846 = local818 + 1 - arg9 - arg11;
							}
							@Pc(872) int local872 = 0;
							if (local824 < arg0) {
								local872 = arg0 - local824;
							} else if (local824 > arg0 + arg5 - 1) {
								local872 = local824 + 1 - arg0 - arg5;
							}
							@Pc(904) int local904 = local846 * local846 + local872 * local872;
							if (local904 < local196 || local904 == local196 && this.anIntArrayArray22[local818][local824] < local812) {
								local196 = local904;
								local812 = this.anIntArrayArray22[local818][local824];
								local11 = local818;
								local39 = local824;
							}
						}
					}
				}
				if (local196 == 1000) {
					return false;
				}
				if (local11 == arg4 && local39 == arg10) {
					return false;
				}
				this.anInt1049 = 1;
			}
			@Pc(965) byte local965 = 0;
			this.anIntArray274[0] = local11;
			local61 = local965 + 1;
			this.anIntArray275[0] = local39;
			local196 = local812 = this.anIntArrayArray24[local11][local39];
			while (local11 != arg4 || local39 != arg10) {
				if (local196 != local812) {
					local812 = local196;
					this.anIntArray274[local61] = local11;
					this.anIntArray275[local61++] = local39;
				}
				if ((local196 & 0x2) != 0) {
					local11++;
				} else if ((local196 & 0x8) != 0) {
					local11--;
				}
				if ((local196 & 0x1) != 0) {
					local39++;
				} else if ((local196 & 0x4) != 0) {
					local39--;
				}
				local196 = this.anIntArrayArray24[local11][local39];
			}
			if (local61 > 0) {
				local78 = local61;
				if (local61 > 25) {
					local78 = 25;
				}
				local61--;
				@Pc(1055) int local1055 = this.anIntArray274[local61];
				local818 = this.anIntArray275[local61];
				if (arg1 == 0) {
					this.aClass8_Sub1_Sub3_6.method141(45);
					this.aClass8_Sub1_Sub3_6.method142(local78 + local78 + 3);
				}
				if (arg1 == 1) {
					this.aClass8_Sub1_Sub3_6.method141(89);
					this.aClass8_Sub1_Sub3_6.method142(local78 + local78 + 3 + 14);
				}
				if (arg1 == 2) {
					this.aClass8_Sub1_Sub3_6.method141(97);
					this.aClass8_Sub1_Sub3_6.method142(local78 + local78 + 3);
				}
				this.anInt971 = this.anIntArray274[0];
				this.anInt972 = this.anIntArray275[0];
				for (local824 = 1; local824 < local78; local824++) {
					local61--;
					this.aClass8_Sub1_Sub3_6.method142(this.anIntArray274[local61] - local1055);
					this.aClass8_Sub1_Sub3_6.method142(this.anIntArray275[local61] - local818);
				}
				this.aClass8_Sub1_Sub3_6.method168(super.anIntArray210[5] == 1 ? 1 : 0);
				this.aClass8_Sub1_Sub3_6.method177(local1055 + this.anInt924, this.anInt897);
				this.aClass8_Sub1_Sub3_6.method176(local818 + this.anInt925);
				return true;
			} else if (arg1 == 1) {
				return false;
			} else {
				return true;
			}
		} catch (@Pc(1188) RuntimeException local1188) {
			signlink.reporterror("31069, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + arg10 + ", " + arg11 + ", " + local1188.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;Z)V")
	private void method601(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) boolean arg2) {
		signlink.errorname = arg0;
		try {
			if (!arg2) {
				this.aString22 = "";
				this.aString23 = "Connecting to server...";
				this.method709(true);
			}
			this.aClass7_1 = new Class7(true, this.method692(anInt1075 + 43594), this);
			@Pc(30) long local30 = Class36.method381(arg0);
			@Pc(37) int local37 = (int) (local30 >> 16 & 0x1FL);
			this.aClass8_Sub1_Sub3_6.anInt239 = 0;
			this.aClass8_Sub1_Sub3_6.method142(14);
			this.aClass8_Sub1_Sub3_6.method142(local37);
			this.aClass7_1.method52(this.aClass8_Sub1_Sub3_6.aByteArray7, 2);
			for (@Pc(60) int local60 = 0; local60 < 8; local60++) {
				this.aClass7_1.method49();
			}
			@Pc(74) int local74 = this.aClass7_1.method49();
			@Pc(76) int local76 = local74;
			@Pc(225) int local225;
			@Pc(259) int local259;
			if (local74 == 0) {
				this.aClass7_1.method51(this.aClass8_Sub1_Sub3_9.aByteArray7, 0, 8);
				this.aClass8_Sub1_Sub3_9.anInt239 = 0;
				this.aLong32 = this.aClass8_Sub1_Sub3_9.method158();
				@Pc(99) int[] local99 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (this.aLong32 >> 32), (int) this.aLong32 };
				this.aClass8_Sub1_Sub3_6.anInt239 = 0;
				this.aClass8_Sub1_Sub3_6.method142(10);
				this.aClass8_Sub1_Sub3_6.method146(local99[0]);
				this.aClass8_Sub1_Sub3_6.method146(local99[1]);
				this.aClass8_Sub1_Sub3_6.method146(local99[2]);
				this.aClass8_Sub1_Sub3_6.method146(local99[3]);
				this.aClass8_Sub1_Sub3_6.method146(signlink.anInt1086);
				this.aClass8_Sub1_Sub3_6.method149(arg0);
				this.aClass8_Sub1_Sub3_6.method149(arg1);
				this.aClass8_Sub1_Sub3_6.method167(aBigInteger2, aBigInteger1);
				this.aClass8_Sub1_Sub3_7.anInt239 = 0;
				if (arg2) {
					this.aClass8_Sub1_Sub3_7.method142(18);
				} else {
					this.aClass8_Sub1_Sub3_7.method142(16);
				}
				this.aClass8_Sub1_Sub3_7.method142(this.aClass8_Sub1_Sub3_6.anInt239 + 36 + 1 + 1 + 2);
				this.aClass8_Sub1_Sub3_7.method142(255);
				this.aClass8_Sub1_Sub3_7.method143(376);
				this.aClass8_Sub1_Sub3_7.method142(aBoolean237 ? 1 : 0);
				for (local225 = 0; local225 < 9; local225++) {
					this.aClass8_Sub1_Sub3_7.method146(this.anIntArray266[local225]);
				}
				this.aClass8_Sub1_Sub3_7.method150(this.aClass8_Sub1_Sub3_6.aByteArray7, this.aClass8_Sub1_Sub3_6.anInt239);
				this.aClass8_Sub1_Sub3_6.aClass18_1 = new Class18(local99, (byte) 119);
				for (local259 = 0; local259 < 4; local259++) {
					local99[local259] += 50;
				}
				this.aClass18_2 = new Class18(local99, (byte) 119);
				this.aClass7_1.method52(this.aClass8_Sub1_Sub3_7.aByteArray7, this.aClass8_Sub1_Sub3_7.anInt239);
				local74 = this.aClass7_1.method49();
			}
			if (local74 == 1) {
				try {
					Thread.sleep(2000L);
				} catch (@Pc(301) Exception local301) {
				}
				this.method601(arg0, arg1, arg2);
			} else {
				@Pc(389) int local389;
				if (local74 == 2) {
					this.anInt943 = this.aClass7_1.method49();
					aBoolean205 = this.aClass7_1.method49() == 1;
					this.aLong33 = 0L;
					this.anInt1051 = 0;
					this.aClass22_1.anInt373 = 0;
					super.aBoolean190 = true;
					this.aBoolean226 = true;
					this.aBoolean214 = true;
					this.aClass8_Sub1_Sub3_6.anInt239 = 0;
					this.aClass8_Sub1_Sub3_9.anInt239 = 0;
					this.anInt1045 = -1;
					this.anInt1004 = -1;
					this.anInt1005 = -1;
					this.anInt1006 = -1;
					this.anInt1044 = 0;
					this.anInt1046 = 0;
					this.anInt871 = 0;
					this.anInt1048 = 0;
					this.anInt1078 = 0;
					this.anInt1025 = 0;
					this.aBoolean208 = false;
					super.anInt838 = 0;
					for (local389 = 0; local389 < 100; local389++) {
						this.aStringArray13[local389] = null;
					}
					this.anInt961 = 0;
					this.anInt865 = 0;
					this.anInt915 = 0;
					this.anInt1031 = 0;
					this.anInt1055 = (int) (Math.random() * 100.0D) - 50;
					this.anInt931 = (int) (Math.random() * 110.0D) - 55;
					this.anInt854 = (int) (Math.random() * 80.0D) - 40;
					this.anInt1079 = (int) (Math.random() * 120.0D) - 60;
					this.anInt935 = (int) (Math.random() * 30.0D) - 20;
					this.anInt862 = (int) (Math.random() * 20.0D) - 10 & 0x7FF;
					this.anInt1052 = 0;
					this.anInt899 = -1;
					this.anInt971 = 0;
					this.anInt972 = 0;
					this.anInt968 = 0;
					this.anInt950 = 0;
					for (local225 = 0; local225 < this.anInt966; local225++) {
						this.aClass8_Sub1_Sub1_Sub1_Sub2Array1[local225] = null;
						this.aClass8_Sub1_Sub3Array1[local225] = null;
					}
					for (local259 = 0; local259 < 16384; local259++) {
						this.aClass8_Sub1_Sub1_Sub1_Sub1Array1[local259] = null;
					}
					aClass8_Sub1_Sub1_Sub1_Sub2_1 = this.aClass8_Sub1_Sub1_Sub1_Sub2Array1[this.anInt967] = new Class8_Sub1_Sub1_Sub1_Sub2();
					this.aClass49_11.method542();
					this.aClass49_10.method542();
					@Pc(534) int local534;
					@Pc(538) int local538;
					for (@Pc(530) int local530 = 0; local530 < 4; local530++) {
						for (local534 = 0; local534 < 104; local534++) {
							for (local538 = 0; local538 < 104; local538++) {
								this.aClass49ArrayArrayArray1[local530][local534][local538] = null;
							}
						}
					}
					this.aClass49_12 = new Class49(223);
					this.anInt1082 = 0;
					this.anInt1081 = 0;
					this.method609(aByte21, this.anInt1022);
					this.anInt1022 = -1;
					this.method609(aByte21, this.anInt973);
					this.anInt973 = -1;
					this.method609(aByte21, this.anInt1077);
					this.anInt1077 = -1;
					this.method609(aByte21, this.anInt957);
					this.anInt957 = -1;
					this.method609(aByte21, this.anInt911);
					this.anInt911 = -1;
					this.method609(aByte21, this.anInt934);
					this.anInt934 = -1;
					this.method609(aByte21, this.anInt905);
					this.anInt905 = -1;
					this.aBoolean211 = false;
					this.anInt1060 = 3;
					this.anInt940 = 0;
					this.aBoolean208 = false;
					this.aBoolean201 = false;
					this.aString31 = null;
					this.anInt1001 = 0;
					this.anInt956 = -1;
					this.aBoolean216 = true;
					this.method652();
					for (local534 = 0; local534 < 5; local534++) {
						this.anIntArray265[local534] = 0;
					}
					for (local538 = 0; local538 < 5; local538++) {
						this.aStringArray10[local538] = null;
						this.aBooleanArray11[local538] = false;
					}
					anInt857 = 0;
					anInt938 = 0;
					anInt882 = 0;
					anInt939 = 0;
					anInt1059 = 0;
					anInt913 = 0;
					anInt1053 = 0;
					this.method718();
				} else if (local74 == 3) {
					this.aString22 = "";
					this.aString23 = "Invalid username or password.";
				} else if (local74 == 4) {
					this.aString22 = "Your account has been disabled.";
					this.aString23 = "Please check your message-centre for details.";
				} else if (local74 == 5) {
					this.aString22 = "Your account is already logged in.";
					this.aString23 = "Try again in 60 secs...";
				} else if (local74 == 6) {
					this.aString22 = "RuneScape has been updated!";
					this.aString23 = "Please reload this page.";
				} else if (local74 == 7) {
					this.aString22 = "This world is full.";
					this.aString23 = "Please use a different world.";
				} else if (local74 == 8) {
					this.aString22 = "Unable to connect.";
					this.aString23 = "Login server offline.";
				} else if (local74 == 9) {
					this.aString22 = "Login limit exceeded.";
					this.aString23 = "Too many connections from your address.";
				} else if (local74 == 10) {
					this.aString22 = "Unable to connect.";
					this.aString23 = "Bad session id.";
				} else if (local74 == 12) {
					this.aString22 = "You need a members account to login to this world.";
					this.aString23 = "Please subscribe, or use a different world.";
				} else if (local74 == 13) {
					this.aString22 = "Could not complete login.";
					this.aString23 = "Please try using a different world.";
				} else if (local74 == 14) {
					this.aString22 = "The server is being updated.";
					this.aString23 = "Please wait 1 minute and try again.";
				} else if (local74 == 15) {
					this.aBoolean214 = true;
					this.aClass8_Sub1_Sub3_6.anInt239 = 0;
					this.aClass8_Sub1_Sub3_9.anInt239 = 0;
					this.anInt1045 = -1;
					this.anInt1004 = -1;
					this.anInt1005 = -1;
					this.anInt1006 = -1;
					this.anInt1044 = 0;
					this.anInt1046 = 0;
					this.anInt871 = 0;
					this.anInt1025 = 0;
					this.aBoolean208 = false;
					this.aLong30 = System.currentTimeMillis();
				} else if (local74 == 16) {
					this.aString22 = "Login attempts exceeded.";
					this.aString23 = "Please wait 1 minute and try again.";
				} else if (local74 == 17) {
					this.aString22 = "You are standing in a members-only area.";
					this.aString23 = "To play on this world move to a free area first";
				} else if (local74 == 18) {
					this.aString22 = "Account locked as we suspect it has been stolen.";
					this.aString23 = "Press 'recover a locked account' on front page.";
				} else if (local74 == 20) {
					this.aString22 = "Invalid loginserver requested";
					this.aString23 = "Please try using a different world.";
				} else if (local74 == 21) {
					local389 = this.aClass7_1.method49();
					for (@Pc(917) int local917 = local389 + 3; local917 >= 0; local917--) {
						this.aString22 = "You have only just left another world";
						this.aString23 = "Your profile will be transferred in: " + local917;
						this.method709(true);
						try {
							Thread.sleep(1200L);
						} catch (@Pc(939) Exception local939) {
						}
					}
					this.method601(arg0, arg1, arg2);
				} else if (local74 == 22) {
					this.aString22 = "Malformed login packet.";
					this.aString23 = "Please try again.";
				} else if (local74 == 23) {
					this.aString22 = "No reply from loginserver.";
					this.aString23 = "Please try again.";
				} else if (local74 == 24) {
					this.aString22 = "Error loading your profile.";
					this.aString23 = "Please contact customer support.";
				} else if (local74 == 25) {
					this.aString22 = "Unexpected loginserver response.";
					this.aString23 = "Please try using a different world.";
				} else if (local74 == 26) {
					this.aString22 = "This computers address has been blocked";
					this.aString23 = "as it was used to break our rules";
				} else if (local74 != -1) {
					System.out.println("response:" + local74);
					this.aString22 = "Unexpected server response";
					this.aString23 = "Please try using a different world.";
				} else if (local76 != 0) {
					this.aString22 = "No response from server";
					this.aString23 = "Please try using a different world.";
				} else if (this.anInt859 < 2) {
					try {
						Thread.sleep(2000L);
					} catch (@Pc(1011) Exception local1011) {
					}
					this.anInt859++;
					this.method601(arg0, arg1, arg2);
				} else {
					this.aString22 = "No response from loginserver";
					this.aString23 = "Please wait 1 minute and try again.";
				}
			}
		} catch (@Pc(1054) IOException local1054) {
			this.aString22 = "";
			this.aString23 = "Error connecting to server.";
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(B)V")
	private void method602() {
		try {
			if (this.aClass11_10 == null) {
				super.aClass11_2 = null;
				this.aClass11_6 = null;
				this.aClass11_4 = null;
				this.aClass11_3 = null;
				this.aClass11_5 = null;
				this.aClass11_7 = null;
				this.aClass11_8 = null;
				this.aClass11_9 = null;
				this.aClass11_13 = new Class11(aByte23, 265, 128, this.method584((byte) 1));
				Class8_Sub1_Sub2.method548(this.anInt970);
				this.aClass11_14 = new Class11(aByte23, 265, 128, this.method584((byte) 1));
				Class8_Sub1_Sub2.method548(this.anInt970);
				this.aClass11_10 = new Class11(aByte23, 171, 509, this.method584((byte) 1));
				Class8_Sub1_Sub2.method548(this.anInt970);
				this.aClass11_11 = new Class11(aByte23, 132, 360, this.method584((byte) 1));
				Class8_Sub1_Sub2.method548(this.anInt970);
				this.aClass11_12 = new Class11(aByte23, 200, 360, this.method584((byte) 1));
				Class8_Sub1_Sub2.method548(this.anInt970);
				this.aClass11_15 = new Class11(aByte23, 238, 202, this.method584((byte) 1));
				Class8_Sub1_Sub2.method548(this.anInt970);
				this.aClass11_16 = new Class11(aByte23, 238, 203, this.method584((byte) 1));
				Class8_Sub1_Sub2.method548(this.anInt970);
				this.aClass11_17 = new Class11(aByte23, 94, 74, this.method584((byte) 1));
				Class8_Sub1_Sub2.method548(this.anInt970);
				this.aClass11_18 = new Class11(aByte23, 94, 75, this.method584((byte) 1));
				Class8_Sub1_Sub2.method548(this.anInt970);
				if (this.aClass2_2 != null) {
					this.method703();
					this.method642();
				}
				this.aBoolean219 = true;
			}
		} catch (@Pc(174) RuntimeException local174) {
			signlink.reporterror("9149, " + 4 + ", " + local174.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "i", descriptor = "(I)V")
	private void method603() {
		try {
			@Pc(16) int local16;
			@Pc(23) int local23;
			if (this.anInt1083 == 0) {
				local16 = super.anInt836 / 2 - 80;
				local23 = super.anInt837 / 2 + 20;
				local23 += 20;
				if (super.anInt845 == 1 && super.anInt846 >= local16 - 75 && super.anInt846 <= local16 + 75 && super.anInt847 >= local23 - 20 && super.anInt847 <= local23 + 20) {
					this.anInt1083 = 3;
					this.anInt904 = 0;
				}
				local16 = super.anInt836 / 2 + 80;
				if (super.anInt845 == 1 && super.anInt846 >= local16 - 75 && super.anInt846 <= local16 + 75 && super.anInt847 >= local23 - 20 && super.anInt847 <= local23 + 20) {
					this.aString22 = "";
					this.aString23 = "Enter your username & password.";
					this.anInt1083 = 2;
					this.anInt904 = 0;
				}
			} else if (this.anInt1083 == 2) {
				local16 = super.anInt837 / 2 - 40;
				local16 += 30;
				local16 += 25;
				if (super.anInt845 == 1 && super.anInt847 >= local16 - 15 && super.anInt847 < local16) {
					this.anInt904 = 0;
				}
				local16 += 15;
				if (super.anInt845 == 1 && super.anInt847 >= local16 - 15 && super.anInt847 < local16) {
					this.anInt904 = 1;
				}
				local16 += 15;
				local23 = super.anInt836 / 2 - 80;
				@Pc(169) int local169 = super.anInt837 / 2 + 50;
				@Pc(170) int local170 = local169 + 20;
				if (super.anInt845 == 1 && super.anInt846 >= local23 - 75 && super.anInt846 <= local23 + 75 && super.anInt847 >= local170 - 20 && super.anInt847 <= local170 + 20) {
					this.anInt859 = 0;
					this.method601(this.aString27, this.aString28, false);
					if (this.aBoolean214) {
						return;
					}
				}
				local23 = super.anInt836 / 2 + 80;
				if (super.anInt845 == 1 && super.anInt846 >= local23 - 75 && super.anInt846 <= local23 + 75 && super.anInt847 >= local170 - 20 && super.anInt847 <= local170 + 20) {
					this.anInt1083 = 0;
					this.aString27 = "";
					this.aString28 = "";
				}
				while (true) {
					while (true) {
						@Pc(260) int local260 = this.method578();
						if (local260 == -1) {
							return;
						}
						@Pc(265) boolean local265 = false;
						for (@Pc(267) int local267 = 0; local267 < aString17.length(); local267++) {
							if (local260 == aString17.charAt(local267)) {
								local265 = true;
								break;
							}
						}
						if (this.anInt904 == 0) {
							if (local260 == 8 && this.aString27.length() > 0) {
								this.aString27 = this.aString27.substring(0, this.aString27.length() - 1);
							}
							if (local260 == 9 || local260 == 10 || local260 == 13) {
								this.anInt904 = 1;
							}
							if (local265) {
								this.aString27 = this.aString27 + (char) local260;
							}
							if (this.aString27.length() > 12) {
								this.aString27 = this.aString27.substring(0, 12);
							}
						} else if (this.anInt904 == 1) {
							if (local260 == 8 && this.aString28.length() > 0) {
								this.aString28 = this.aString28.substring(0, this.aString28.length() - 1);
							}
							if (local260 == 9 || local260 == 10 || local260 == 13) {
								this.anInt904 = 0;
							}
							if (local265) {
								this.aString28 = this.aString28 + (char) local260;
							}
							if (this.aString28.length() > 20) {
								this.aString28 = this.aString28.substring(0, 20);
							}
						}
					}
				}
			} else if (this.anInt1083 == 3) {
				local16 = super.anInt836 / 2;
				local23 = super.anInt837 / 2 + 50;
				@Pc(424) int local424 = local23 + 20;
				if (super.anInt845 == 1 && super.anInt846 >= local16 - 75 && super.anInt846 <= local16 + 75 && super.anInt847 >= local424 - 20 && super.anInt847 <= local424 + 20) {
					this.anInt1083 = 0;
					return;
				}
			}
		} catch (@Pc(457) RuntimeException local457) {
			signlink.reporterror("89687, " + -899 + ", " + local457.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(I)V")
	@Override
	protected void method581() {
		try {
			this.aClass8_Sub1_Sub3_8 = null;
			this.aClass8_Sub1_Sub2_Sub2Array3 = null;
			this.aClass8_Sub1_Sub2_Sub1Array10 = null;
			this.aClass11_3 = null;
			this.aClass11_4 = null;
			this.aClass11_5 = null;
			this.aClass11_6 = null;
			this.anIntArray260 = null;
			this.anIntArray261 = null;
			this.anIntArray262 = null;
			this.anIntArray263 = null;
			this.aStringArray14 = null;
			this.aClass11_23 = null;
			this.aClass11_24 = null;
			this.aClass11_25 = null;
			this.aClass11_26 = null;
			this.aClass11_27 = null;
			this.aClass11_7 = null;
			this.aClass11_8 = null;
			this.aClass11_9 = null;
			this.aByteArray21 = null;
			this.aStringArray9 = null;
			this.aLongArray3 = null;
			this.anIntArray267 = null;
			if (this.aClass4_Sub1_1 != null) {
				this.aClass4_Sub1_1.method26();
			}
			this.aClass4_Sub1_1 = null;
			this.anIntArrayArray25 = null;
			this.aClass8_Sub1_Sub1_Sub1_Sub1Array1 = null;
			this.anIntArray223 = null;
			this.aClass49_11 = null;
			this.aClass49_10 = null;
			this.aClass8_Sub1_Sub2_Sub2_18 = null;
			this.aClass8_Sub1_Sub2_Sub2_19 = null;
			this.aClass8_Sub1_Sub2_Sub2_20 = null;
			this.aClass11_19 = null;
			this.aClass11_20 = null;
			this.aClass11_21 = null;
			this.aClass11_22 = null;
			this.aClass8_Sub1_Sub2_Sub1_10 = null;
			this.aClass8_Sub1_Sub2_Sub2Array2 = null;
			this.aClass8_Sub1_Sub3_6 = null;
			this.aClass8_Sub1_Sub3_7 = null;
			this.aClass8_Sub1_Sub3_9 = null;
			this.anIntArray230 = null;
			this.anIntArray231 = null;
			this.aClass8_Sub1_Sub2_Sub1Array6 = null;
			this.aClass8_Sub1_Sub2_Sub2_4 = null;
			this.aClass8_Sub1_Sub2_Sub2_5 = null;
			this.aClass8_Sub1_Sub2_Sub2_6 = null;
			this.aClass8_Sub1_Sub2_Sub2_7 = null;
			this.aClass8_Sub1_Sub2_Sub2_8 = null;
			this.anIntArrayArrayArray7 = null;
			this.aByteArrayArrayArray8 = null;
			this.aClass32_1 = null;
			this.aClass1Array1 = null;
			this.aClass11_15 = null;
			this.aClass11_16 = null;
			this.aClass11_17 = null;
			this.aClass11_18 = null;
			if (this.aClass22_1 != null) {
				this.aClass22_1.aBoolean80 = false;
			}
			this.aClass22_1 = null;
			this.aClass8_Sub1_Sub1_Sub1_Sub2Array1 = null;
			this.anIntArray236 = null;
			this.anIntArray237 = null;
			this.aClass8_Sub1_Sub3Array1 = null;
			this.anIntArray212 = null;
			this.aClass11_13 = null;
			this.aClass11_14 = null;
			this.aClass11_10 = null;
			this.aClass11_11 = null;
			this.aClass11_12 = null;
			this.aClass8_Sub1_Sub2_Sub2_13 = null;
			this.aClass8_Sub1_Sub2_Sub2_14 = null;
			this.aClass8_Sub1_Sub2_Sub2_15 = null;
			this.aClass8_Sub1_Sub2_Sub2_16 = null;
			this.aClass8_Sub1_Sub2_Sub2_17 = null;
			this.aClass8_Sub1_Sub2_Sub1_6 = null;
			this.aClass8_Sub1_Sub2_Sub1Array4 = null;
			this.aClass8_Sub1_Sub2_Sub1Array9 = null;
			this.aClass8_Sub1_Sub2_Sub1Array7 = null;
			this.aClass8_Sub1_Sub2_Sub1Array8 = null;
			this.aClass8_Sub1_Sub2_Sub1Array5 = null;
			this.aClass49ArrayArrayArray1 = null;
			this.aClass49_12 = null;
			this.aClass8_Sub1_Sub2_Sub1_9 = null;
			this.anIntArray218 = null;
			this.aClass8_Sub1_Sub2_Sub1_11 = null;
			this.aClass8_Sub1_Sub2_Sub1_12 = null;
			this.aClass8_Sub1_Sub2_Sub1_13 = null;
			this.aClass8_Sub1_Sub2_Sub1_14 = null;
			this.aClass8_Sub1_Sub2_Sub1_15 = null;
			this.aClass8_Sub1_Sub2_Sub2_1 = null;
			this.aClass8_Sub1_Sub2_Sub2_2 = null;
			this.aClass8_Sub1_Sub2_Sub2_3 = null;
			try {
				if (this.aClass7_1 != null) {
					this.aClass7_1.method48();
				}
			} catch (@Pc(300) Exception local300) {
			}
			this.aClass7_1 = null;
			this.anIntArray269 = null;
			this.aByteArrayArray5 = null;
			this.aByteArrayArray6 = null;
			this.anIntArray270 = null;
			this.anIntArray271 = null;
			this.method629(79);
			this.anIntArrayArray24 = null;
			this.anIntArrayArray22 = null;
			this.anIntArray274 = null;
			this.anIntArray275 = null;
			this.method660();
			Class23.method253();
			Class26.method293();
			Class19.method201();
			Class24.method262();
			Class48.aClass48Array1 = null;
			Class44.aClass44Array1 = null;
			Class31.aClass31Array1 = null;
			Class46.aClass46Array1 = null;
			Class12.aClass12Array1 = null;
			Class12.aClass33_1 = null;
			Class41.aClass41Array1 = null;
			super.aClass11_2 = null;
			Class8_Sub1_Sub1_Sub1_Sub2.aClass33_9 = null;
			Class8_Sub1_Sub2_Sub4.method557();
			Class32.method315();
			Class8_Sub1_Sub1_Sub5.method206();
			Class29.method307();
			System.gc();
		} catch (@Pc(374) RuntimeException local374) {
			signlink.reporterror("16012, " + -27208 + ", " + local374.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "j", descriptor = "(I)V")
	private void method604() {
		try {
			while (true) {
				@Pc(12) int local12 = this.method578();
				if (local12 == -1) {
					return;
				}
				if (this.anInt1077 != -1 && this.anInt1077 == this.anInt978) {
					if (local12 == 8 && this.aString25.length() > 0) {
						this.aString25 = this.aString25.substring(0, this.aString25.length() - 1);
					}
					if ((local12 >= 97 && local12 <= 122 || local12 >= 65 && local12 <= 90 || local12 >= 48 && local12 <= 57 || local12 == 32) && this.aString25.length() < 12) {
						this.aString25 = this.aString25 + (char) local12;
					}
				} else {
					@Pc(192) int local192;
					if (this.aBoolean201) {
						if (local12 >= 32 && local12 <= 122 && this.aString30.length() < 80) {
							this.aString30 = this.aString30 + (char) local12;
							this.aBoolean191 = true;
						}
						if (local12 == 8 && this.aString30.length() > 0) {
							this.aString30 = this.aString30.substring(0, this.aString30.length() - 1);
							this.aBoolean191 = true;
						}
						if (local12 == 13 || local12 == 10) {
							this.aBoolean201 = false;
							this.aBoolean191 = true;
							@Pc(152) long local152;
							if (this.anInt965 == 1) {
								local152 = Class36.method381(this.aString30);
								this.method664(local152);
							}
							if (this.anInt965 == 2 && this.anInt1081 > 0) {
								local152 = Class36.method381(this.aString30);
								this.method691(local152);
							}
							if (this.anInt965 == 3 && this.aString30.length() > 0) {
								this.aClass8_Sub1_Sub3_6.method141(73);
								this.aClass8_Sub1_Sub3_6.method142(0);
								local192 = this.aClass8_Sub1_Sub3_6.anInt239;
								this.aClass8_Sub1_Sub3_6.method148(this.aLong31);
								Class30.method313(this.aString30, this.aClass8_Sub1_Sub3_6);
								this.aClass8_Sub1_Sub3_6.method151(this.aClass8_Sub1_Sub3_6.anInt239 - local192);
								this.aString30 = Class30.method314(this.aString30);
								this.aString30 = Class47.method498(this.aString30);
								this.method694(6, this.aString30, Class36.method385(839, Class36.method382((byte) 3, this.aLong31)));
								if (this.anInt1016 == 2) {
									this.anInt1016 = 1;
									this.aBoolean204 = true;
									this.aClass8_Sub1_Sub3_6.method141(222);
									this.aClass8_Sub1_Sub3_6.method142(this.anInt988);
									this.aClass8_Sub1_Sub3_6.method142(this.anInt1016);
									this.aClass8_Sub1_Sub3_6.method142(this.anInt976);
								}
							}
							if (this.anInt965 == 4 && this.anInt917 < 100) {
								local152 = Class36.method381(this.aString30);
								this.method591(local152);
							}
							if (this.anInt965 == 5 && this.anInt917 > 0) {
								local152 = Class36.method381(this.aString30);
								this.method684(local152);
							}
						}
					} else if (this.anInt940 == 1) {
						if (local12 >= 48 && local12 <= 57 && this.aString19.length() < 10) {
							this.aString19 = this.aString19 + (char) local12;
							this.aBoolean191 = true;
						}
						if (local12 == 8 && this.aString19.length() > 0) {
							this.aString19 = this.aString19.substring(0, this.aString19.length() - 1);
							this.aBoolean191 = true;
						}
						if (local12 == 13 || local12 == 10) {
							if (this.aString19.length() > 0) {
								local192 = 0;
								try {
									local192 = Integer.parseInt(this.aString19);
								} catch (@Pc(369) Exception local369) {
								}
								this.aClass8_Sub1_Sub3_6.method141(0);
								this.aClass8_Sub1_Sub3_6.method146(local192);
							}
							this.anInt940 = 0;
							this.aBoolean191 = true;
						}
					} else if (this.anInt940 == 2) {
						if (local12 >= 32 && local12 <= 122 && this.aString19.length() < 12) {
							this.aString19 = this.aString19 + (char) local12;
							this.aBoolean191 = true;
						}
						if (local12 == 8 && this.aString19.length() > 0) {
							this.aString19 = this.aString19.substring(0, this.aString19.length() - 1);
							this.aBoolean191 = true;
						}
						if (local12 == 13 || local12 == 10) {
							if (this.aString19.length() > 0) {
								this.aClass8_Sub1_Sub3_6.method141(124);
								this.aClass8_Sub1_Sub3_6.method148(Class36.method381(this.aString19));
							}
							this.anInt940 = 0;
							this.aBoolean191 = true;
						}
					} else if (this.anInt940 == 3) {
						if (local12 >= 32 && local12 <= 122 && this.aString19.length() < 40) {
							this.aString19 = this.aString19 + (char) local12;
							this.aBoolean191 = true;
						}
						if (local12 == 8 && this.aString19.length() > 0) {
							this.aString19 = this.aString19.substring(0, this.aString19.length() - 1);
							this.aBoolean191 = true;
						}
					} else if (this.anInt973 == -1 && this.anInt957 == -1) {
						if (local12 >= 32 && local12 <= 122 && this.aString29.length() < 80) {
							this.aString29 = this.aString29 + (char) local12;
							this.aBoolean191 = true;
						}
						if (local12 == 8 && this.aString29.length() > 0) {
							this.aString29 = this.aString29.substring(0, this.aString29.length() - 1);
							this.aBoolean191 = true;
						}
						if ((local12 == 13 || local12 == 10) && this.aString29.length() > 0) {
							if (this.anInt943 == 2) {
								if (this.aString29.equals("::clientdrop")) {
									this.method716();
								}
								if (this.aString29.equals("::lag")) {
									this.method669();
								}
								if (this.aString29.equals("::prefetchmusic")) {
									for (local192 = 0; local192 < this.aClass4_Sub1_1.method28(2); local192++) {
										this.aClass4_Sub1_1.method24(local192, (byte) 1, 2);
									}
								}
								if (this.aString29.equals("::fpson")) {
									aBoolean198 = true;
								}
								if (this.aString29.equals("::fpsoff")) {
									aBoolean198 = false;
								}
								if (this.aString29.equals("::noclip")) {
									for (local192 = 0; local192 < 4; local192++) {
										for (@Pc(654) int local654 = 1; local654 < 103; local654++) {
											for (@Pc(658) int local658 = 1; local658 < 103; local658++) {
												this.aClass1Array1[local192].anIntArrayArray1[local654][local658] = 0;
											}
										}
									}
								}
							}
							if (this.aString29.startsWith("::")) {
								this.aClass8_Sub1_Sub3_6.method141(63);
								this.aClass8_Sub1_Sub3_6.method142(this.aString29.length() - 1);
								this.aClass8_Sub1_Sub3_6.method149(this.aString29.substring(2));
							} else {
								@Pc(713) String local713 = this.aString29.toLowerCase();
								@Pc(715) byte local715 = 0;
								if (local713.startsWith("yellow:")) {
									local715 = 0;
									this.aString29 = this.aString29.substring(7);
								} else if (local713.startsWith("red:")) {
									local715 = 1;
									this.aString29 = this.aString29.substring(4);
								} else if (local713.startsWith("green:")) {
									local715 = 2;
									this.aString29 = this.aString29.substring(6);
								} else if (local713.startsWith("cyan:")) {
									local715 = 3;
									this.aString29 = this.aString29.substring(5);
								} else if (local713.startsWith("purple:")) {
									local715 = 4;
									this.aString29 = this.aString29.substring(7);
								} else if (local713.startsWith("white:")) {
									local715 = 5;
									this.aString29 = this.aString29.substring(6);
								} else if (local713.startsWith("flash1:")) {
									local715 = 6;
									this.aString29 = this.aString29.substring(7);
								} else if (local713.startsWith("flash2:")) {
									local715 = 7;
									this.aString29 = this.aString29.substring(7);
								} else if (local713.startsWith("flash3:")) {
									local715 = 8;
									this.aString29 = this.aString29.substring(7);
								} else if (local713.startsWith("glow1:")) {
									local715 = 9;
									this.aString29 = this.aString29.substring(6);
								} else if (local713.startsWith("glow2:")) {
									local715 = 10;
									this.aString29 = this.aString29.substring(6);
								} else if (local713.startsWith("glow3:")) {
									local715 = 11;
									this.aString29 = this.aString29.substring(6);
								}
								local713 = this.aString29.toLowerCase();
								@Pc(887) byte local887 = 0;
								if (local713.startsWith("wave:")) {
									local887 = 1;
									this.aString29 = this.aString29.substring(5);
								} else if (local713.startsWith("wave2:")) {
									local887 = 2;
									this.aString29 = this.aString29.substring(6);
								} else if (local713.startsWith("shake:")) {
									local887 = 3;
									this.aString29 = this.aString29.substring(6);
								} else if (local713.startsWith("scroll:")) {
									local887 = 4;
									this.aString29 = this.aString29.substring(7);
								} else if (local713.startsWith("slide:")) {
									local887 = 5;
									this.aString29 = this.aString29.substring(6);
								}
								this.aClass8_Sub1_Sub3_6.method141(34);
								this.aClass8_Sub1_Sub3_6.method142(0);
								@Pc(968) int local968 = this.aClass8_Sub1_Sub3_6.anInt239;
								this.aClass8_Sub1_Sub3_6.method142(local887);
								this.aClass8_Sub1_Sub3_6.method142(local715);
								this.aClass8_Sub1_Sub3_8.anInt239 = 0;
								Class30.method313(this.aString29, this.aClass8_Sub1_Sub3_8);
								this.aClass8_Sub1_Sub3_6.method187(this.anInt981, this.aClass8_Sub1_Sub3_8.anInt239, this.aClass8_Sub1_Sub3_8.aByteArray7);
								this.aClass8_Sub1_Sub3_6.method151(this.aClass8_Sub1_Sub3_6.anInt239 - local968);
								this.aString29 = Class30.method314(this.aString29);
								this.aString29 = Class47.method498(this.aString29);
								aClass8_Sub1_Sub1_Sub1_Sub2_1.aString14 = this.aString29;
								aClass8_Sub1_Sub1_Sub1_Sub2_1.anInt730 = local715;
								aClass8_Sub1_Sub1_Sub1_Sub2_1.anInt725 = local887;
								aClass8_Sub1_Sub1_Sub1_Sub2_1.anInt724 = 150;
								if (this.anInt943 == 2) {
									this.method694(2, aClass8_Sub1_Sub1_Sub1_Sub2_1.aString14, "@cr2@" + aClass8_Sub1_Sub1_Sub1_Sub2_1.aString15);
								} else if (this.anInt943 == 1) {
									this.method694(2, aClass8_Sub1_Sub1_Sub1_Sub2_1.aString14, "@cr1@" + aClass8_Sub1_Sub1_Sub1_Sub2_1.aString15);
								} else {
									this.method694(2, aClass8_Sub1_Sub1_Sub1_Sub2_1.aString14, aClass8_Sub1_Sub1_Sub1_Sub2_1.aString15);
								}
								if (this.anInt988 == 2) {
									this.anInt988 = 3;
									this.aBoolean204 = true;
									this.aClass8_Sub1_Sub3_6.method141(222);
									this.aClass8_Sub1_Sub3_6.method142(this.anInt988);
									this.aClass8_Sub1_Sub3_6.method142(this.anInt1016);
									this.aClass8_Sub1_Sub3_6.method142(this.anInt976);
								}
							}
							this.aString29 = "";
							this.aBoolean191 = true;
						}
					}
				}
			}
		} catch (@Pc(1120) RuntimeException local1120) {
			signlink.reporterror("52070, " + -567 + ", " + local1120.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(Z)V")
	private void method605() {
		try {
			if (super.aClass11_2 == null) {
				this.method660();
				this.aClass11_10 = null;
				this.aClass11_11 = null;
				this.aClass11_12 = null;
				this.aClass11_13 = null;
				this.aClass11_14 = null;
				this.aClass11_15 = null;
				this.aClass11_16 = null;
				this.aClass11_17 = null;
				this.aClass11_18 = null;
				this.aClass11_6 = null;
				this.aClass11_4 = null;
				this.aClass11_3 = null;
				this.aClass11_5 = null;
				this.aClass11_7 = null;
				this.aClass11_8 = null;
				this.aClass11_9 = null;
				super.aClass11_2 = new Class11(aByte23, 503, 765, this.method584((byte) 1));
				this.aBoolean219 = true;
			}
		} catch (@Pc(74) RuntimeException local74) {
			signlink.reporterror("94253, " + false + ", " + local74.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IZLclient!GPLGZASP;I)V")
	private void method606(@OriginalArg(0) int arg0, @OriginalArg(2) Class8_Sub1_Sub2_Sub1 arg1, @OriginalArg(3) int arg2) {
		try {
			@Pc(12) int local12 = arg0 * arg0 + arg2 * arg2;
			if (local12 > 4225 && local12 < 90000) {
				@Pc(26) int local26 = this.anInt862 + this.anInt1079 & 0x7FF;
				@Pc(30) int local30 = Class8_Sub1_Sub1_Sub5.anIntArray90[local26];
				@Pc(34) int local34 = Class8_Sub1_Sub1_Sub5.anIntArray91[local26];
				@Pc(43) int local43 = local30 * 256 / (this.anInt935 + 256);
				@Pc(52) int local52 = local34 * 256 / (this.anInt935 + 256);
				@Pc(62) int local62 = arg2 * local43 + arg0 * local52 >> 16;
				@Pc(72) int local72 = arg2 * local52 - arg0 * local43 >> 16;
				@Pc(78) double local78 = Math.atan2((double) local62, (double) local72);
				@Pc(84) int local84 = (int) (Math.sin(local78) * 63.0D);
				@Pc(90) int local90 = (int) (Math.cos(local78) * 57.0D);
				this.aClass8_Sub1_Sub2_Sub1_3.method122(this.aBoolean209, local84 + 94 + 4 - 10, local78, 83 - local90 - 20);
			} else {
				this.method705(arg0, arg2, arg1, this.anInt1037);
			}
		} catch (@Pc(123) RuntimeException local123) {
			signlink.reporterror("83496, " + arg0 + ", " + false + ", " + arg1 + ", " + arg2 + ", " + local123.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Z[BI)V")
	private void method607(@OriginalArg(0) boolean arg0, @OriginalArg(1) byte[] arg1) {
		try {
			if (this.aBoolean194) {
				signlink.anInt1092 = arg0 ? 1 : 0;
				signlink.midisave(arg1, arg1.length);
			}
		} catch (@Pc(24) RuntimeException local24) {
			signlink.reporterror("64135, " + arg0 + ", " + arg1 + ", " + 446 + ", " + local24.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(B)V")
	private void method608(@OriginalArg(0) byte arg0) {
		try {
			this.aClass11_4.method70();
			@Pc(18) int local18;
			@Pc(20) int local20;
			if (this.anInt1052 == 2) {
				@Pc(13) byte[] local13 = this.aClass8_Sub1_Sub2_Sub2_19.aByteArray19;
				@Pc(15) int[] local15 = Class8_Sub1_Sub2.anIntArray201;
				local18 = local13.length;
				for (local20 = 0; local20 < local18; local20++) {
					if (local13[local20] == 0) {
						local15[local20] = 0;
					}
				}
				this.aClass8_Sub1_Sub2_Sub1_6.method121(0, 256, this.anIntArray242, 0, this.anIntArray219, 33, 33, 25, 25, this.anInt862);
				this.aClass11_5.method70();
				Class8_Sub1_Sub2_Sub4.anIntArray206 = this.anIntArray228;
			} else {
				@Pc(67) int local67 = this.anInt862 + this.anInt1079 & 0x7FF;
				@Pc(74) int local74 = aClass8_Sub1_Sub1_Sub1_Sub2_1.anInt716 / 32 + 48;
				if (arg0 == 9) {
					@Pc(79) boolean local79 = false;
				}
				local18 = 464 - aClass8_Sub1_Sub1_Sub1_Sub2_1.anInt717 / 32;
				this.aClass8_Sub1_Sub2_Sub1_9.method121(25, this.anInt935 + 256, this.anIntArray247, 5, this.anIntArray221, 146, 151, local74, local18, local67);
				this.aClass8_Sub1_Sub2_Sub1_6.method121(0, 256, this.anIntArray242, 0, this.anIntArray219, 33, 33, 25, 25, this.anInt862);
				for (local20 = 0; local20 < this.anInt954; local20++) {
					local74 = this.anIntArray230[local20] * 4 + 2 - aClass8_Sub1_Sub1_Sub1_Sub2_1.anInt716 / 32;
					local18 = this.anIntArray231[local20] * 4 + 2 - aClass8_Sub1_Sub1_Sub1_Sub2_1.anInt717 / 32;
					this.method705(local74, local18, this.aClass8_Sub1_Sub2_Sub1Array6[local20], this.anInt1037);
				}
				@Pc(183) int local183;
				for (@Pc(179) int local179 = 0; local179 < 104; local179++) {
					for (local183 = 0; local183 < 104; local183++) {
						@Pc(195) Class49 local195 = this.aClass49ArrayArrayArray1[this.anInt933][local179][local183];
						if (local195 != null) {
							local74 = local179 * 4 + 2 - aClass8_Sub1_Sub1_Sub1_Sub2_1.anInt716 / 32;
							local18 = local183 * 4 + 2 - aClass8_Sub1_Sub1_Sub1_Sub2_1.anInt717 / 32;
							this.method705(local74, local18, this.aClass8_Sub1_Sub2_Sub1_11, this.anInt1037);
						}
					}
				}
				for (local183 = 0; local183 < this.anInt950; local183++) {
					@Pc(247) Class8_Sub1_Sub1_Sub1_Sub1 local247 = this.aClass8_Sub1_Sub1_Sub1_Sub1Array1[this.anIntArray223[local183]];
					if (local247 != null && local247.method474(this.anInt995)) {
						@Pc(257) Class26 local257 = local247.aClass26_1;
						if (local257.anIntArray133 != null) {
							local257 = local257.method289();
						}
						if (local257 != null && local257.aBoolean113 && local257.aBoolean110) {
							local74 = local247.anInt716 / 32 - aClass8_Sub1_Sub1_Sub1_Sub2_1.anInt716 / 32;
							local18 = local247.anInt717 / 32 - aClass8_Sub1_Sub1_Sub1_Sub2_1.anInt717 / 32;
							this.method705(local74, local18, this.aClass8_Sub1_Sub2_Sub1_12, this.anInt1037);
						}
					}
				}
				@Pc(317) Class8_Sub1_Sub1_Sub1_Sub2 local317;
				for (@Pc(307) int local307 = 0; local307 < this.anInt968; local307++) {
					local317 = this.aClass8_Sub1_Sub1_Sub1_Sub2Array1[this.anIntArray236[local307]];
					if (local317 != null && local317.method474(this.anInt995)) {
						local74 = local317.anInt716 / 32 - aClass8_Sub1_Sub1_Sub1_Sub2_1.anInt716 / 32;
						local18 = local317.anInt717 / 32 - aClass8_Sub1_Sub1_Sub1_Sub2_1.anInt717 / 32;
						@Pc(346) boolean local346 = false;
						@Pc(350) long local350 = Class36.method381(local317.aString15);
						for (@Pc(352) int local352 = 0; local352 < this.anInt1081; local352++) {
							if (local350 == this.aLongArray3[local352] && this.anIntArray267[local352] != 0) {
								local346 = true;
								break;
							}
						}
						@Pc(377) boolean local377 = false;
						if (aClass8_Sub1_Sub1_Sub1_Sub2_1.anInt745 != 0 && local317.anInt745 != 0 && aClass8_Sub1_Sub1_Sub1_Sub2_1.anInt745 == local317.anInt745) {
							local377 = true;
						}
						if (local346) {
							this.method705(local74, local18, this.aClass8_Sub1_Sub2_Sub1_14, this.anInt1037);
						} else if (local377) {
							this.method705(local74, local18, this.aClass8_Sub1_Sub2_Sub1_15, this.anInt1037);
						} else {
							this.method705(local74, local18, this.aClass8_Sub1_Sub2_Sub1_13, this.anInt1037);
						}
					}
				}
				if (this.anInt1078 != 0 && anInt983 % 20 < 10) {
					if (this.anInt1078 == 1 && this.anInt852 >= 0 && this.anInt852 < this.aClass8_Sub1_Sub1_Sub1_Sub1Array1.length) {
						@Pc(454) Class8_Sub1_Sub1_Sub1_Sub1 local454 = this.aClass8_Sub1_Sub1_Sub1_Sub1Array1[this.anInt852];
						if (local454 != null) {
							local74 = local454.anInt716 / 32 - aClass8_Sub1_Sub1_Sub1_Sub2_1.anInt716 / 32;
							local18 = local454.anInt717 / 32 - aClass8_Sub1_Sub1_Sub1_Sub2_1.anInt717 / 32;
							this.method606(local74, this.aClass8_Sub1_Sub2_Sub1_17, local18);
						}
					}
					if (this.anInt1078 == 2) {
						local74 = (this.anInt996 - this.anInt924) * 4 + 2 - aClass8_Sub1_Sub1_Sub1_Sub2_1.anInt716 / 32;
						local18 = (this.anInt997 - this.anInt925) * 4 + 2 - aClass8_Sub1_Sub1_Sub1_Sub2_1.anInt717 / 32;
						this.method606(local74, this.aClass8_Sub1_Sub2_Sub1_17, local18);
					}
					if (this.anInt1078 == 10 && this.anInt884 >= 0 && this.anInt884 < this.aClass8_Sub1_Sub1_Sub1_Sub2Array1.length) {
						local317 = this.aClass8_Sub1_Sub1_Sub1_Sub2Array1[this.anInt884];
						if (local317 != null) {
							local74 = local317.anInt716 / 32 - aClass8_Sub1_Sub1_Sub1_Sub2_1.anInt716 / 32;
							local18 = local317.anInt717 / 32 - aClass8_Sub1_Sub1_Sub1_Sub2_1.anInt717 / 32;
							this.method606(local74, this.aClass8_Sub1_Sub2_Sub1_17, local18);
						}
					}
				}
				if (this.anInt971 != 0) {
					local74 = this.anInt971 * 4 + 2 - aClass8_Sub1_Sub1_Sub1_Sub2_1.anInt716 / 32;
					local18 = this.anInt972 * 4 + 2 - aClass8_Sub1_Sub1_Sub1_Sub2_1.anInt717 / 32;
					this.method705(local74, local18, this.aClass8_Sub1_Sub2_Sub1_16, this.anInt1037);
				}
				Class8_Sub1_Sub2.method550(3, 78, 16777215, 3, 97);
				this.aClass11_5.method70();
				Class8_Sub1_Sub2_Sub4.anIntArray206 = this.anIntArray228;
			}
		} catch (@Pc(623) RuntimeException local623) {
			signlink.reporterror("51649, " + arg0 + ", " + local623.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(BI)V")
	private void method609(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1) {
		try {
			if (arg0 != -79) {
				aBoolean222 = !aBoolean222;
			}
			Class24.method267(aByte21, arg1);
		} catch (@Pc(13) RuntimeException local13) {
			signlink.reporterror("78500, " + arg0 + ", " + arg1 + ", " + local13.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(Z)V")
	private void method610() {
		try {
			@Pc(2) int local2 = this.anInt893;
			@Pc(5) int local5 = this.anInt894;
			@Pc(8) int local8 = this.anInt895;
			@Pc(11) int local11 = this.anInt896;
			Class8_Sub1_Sub2.method550(local8, local5, 6116423, local11, local2);
			Class8_Sub1_Sub2.method550(local8 - 2, local5 + 1, 0, 16, local2 + 1);
			Class8_Sub1_Sub2.method551(0, local8 - 2, local11 - 19, local5 + 18, local2 + 1);
			this.aClass8_Sub1_Sub2_Sub3_4.method451(6116423, "Choose Option", local2 + 3, local5 + 14);
			@Pc(71) int local71 = super.anInt840;
			@Pc(74) int local74 = super.anInt841;
			if (this.anInt892 == 0) {
				local71 -= 4;
				local74 -= 4;
			}
			if (this.anInt892 == 1) {
				local71 -= 553;
				local74 -= 205;
			}
			if (this.anInt892 == 2) {
				local71 -= 17;
				local74 -= 357;
			}
			for (@Pc(93) int local93 = 0; local93 < this.anInt1025; local93++) {
				@Pc(108) int local108 = local5 + (this.anInt1025 - 1 - local93) * 15 + 31;
				@Pc(110) int local110 = 16777215;
				if (local71 > local2 && local71 < local2 + local8 && local74 > local108 - 13 && local74 < local108 + 3) {
					local110 = 16776960;
				}
				this.aClass8_Sub1_Sub2_Sub3_4.method455(this.aStringArray14[local93], true, local2 + 3, local110, local108);
			}
		} catch (@Pc(151) RuntimeException local151) {
			signlink.reporterror("4429, " + false + ", " + local151.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ZLclient!MIIVNBFU;)Z")
	private boolean method611(@OriginalArg(1) Class24 arg0) {
		try {
			this.aBoolean214 &= true;
			@Pc(10) int local10 = arg0.anInt424;
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
				this.aStringArray14[this.anInt1025] = "Remove @whi@" + this.aStringArray9[local10];
				this.anIntArray262[this.anInt1025] = 140;
				this.anInt1025++;
				this.aStringArray14[this.anInt1025] = "Message @whi@" + this.aStringArray9[local10];
				this.anIntArray262[this.anInt1025] = 788;
				this.anInt1025++;
				return true;
			} else if (local10 >= 401 && local10 <= 500) {
				this.aStringArray14[this.anInt1025] = "Remove @whi@" + arg0.aString7;
				this.anIntArray262[this.anInt1025] = 169;
				this.anInt1025++;
				return true;
			} else {
				return false;
			}
		} catch (@Pc(133) RuntimeException local133) {
			signlink.reporterror("47705, " + true + ", " + arg0 + ", " + local133.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Z)V")
	@Override
	protected void method582() {
		try {
			if (this.aBoolean233 || this.aBoolean223 || this.aBoolean207) {
				this.method708();
			} else {
				anInt919++;
				if (this.aBoolean214) {
					this.method620(this.aBoolean206);
				} else {
					this.method709(false);
				}
				this.anInt1054 = 0;
			}
		} catch (@Pc(37) RuntimeException local37) {
			signlink.reporterror("69985, " + true + ", " + local37.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "k", descriptor = "(I)V")
	private void method612(@OriginalArg(0) int arg0) {
		try {
			this.anInt921++;
			this.method587(true);
			this.method588(true);
			this.method587(false);
			this.method588(false);
			this.method637();
			this.method688();
			@Pc(35) int local35;
			@Pc(74) int local74;
			if (!this.aBoolean230) {
				local35 = this.anInt861;
				if (this.anInt984 / 256 > local35) {
					local35 = this.anInt984 / 256;
				}
				if (this.aBooleanArray12[4] && this.anIntArray233[4] + 128 > local35) {
					local35 = this.anIntArray233[4] + 128;
				}
				local74 = this.anInt862 + this.anInt854 & 0x7FF;
				this.method674(local35, this.anInt1063, this.method680(aClass8_Sub1_Sub1_Sub1_Sub2_1.anInt717, this.anInt933, aClass8_Sub1_Sub1_Sub1_Sub2_1.anInt716) - 50, this.anInt1064, local74, local35 * 3 + 600);
				anInt991++;
				if (anInt991 > 148) {
					anInt991 = 0;
					this.aClass8_Sub1_Sub3_6.method141(75);
					this.aClass8_Sub1_Sub3_6.method146(0);
				}
			}
			if (this.aBoolean230) {
				local35 = this.method651();
			} else {
				local35 = this.method650(this.aByte28);
			}
			local74 = this.anInt877;
			@Pc(137) int local137 = this.anInt878;
			@Pc(140) int local140 = this.anInt879;
			@Pc(143) int local143 = this.anInt880;
			@Pc(146) int local146 = this.anInt881;
			@Pc(195) int local195;
			for (@Pc(148) int local148 = 0; local148 < 5; local148++) {
				if (this.aBooleanArray12[local148]) {
					local195 = (int) (Math.random() * (double) (this.anIntArray222[local148] * 2 + 1) - (double) this.anIntArray222[local148] + Math.sin((double) this.anIntArray246[local148] * ((double) this.anIntArray276[local148] / 100.0D)) * (double) this.anIntArray233[local148]);
					if (local148 == 0) {
						this.anInt877 += local195;
					}
					if (local148 == 1) {
						this.anInt878 += local195;
					}
					if (local148 == 2) {
						this.anInt879 += local195;
					}
					if (local148 == 3) {
						this.anInt881 = this.anInt881 + local195 & 0x7FF;
					}
					if (local148 == 4) {
						this.anInt880 += local195;
						if (this.anInt880 < 128) {
							this.anInt880 = 128;
						}
						if (this.anInt880 > 383) {
							this.anInt880 = 383;
						}
					}
				}
			}
			local195 = Class8_Sub1_Sub2_Sub4.anInt823;
			Class8_Sub1_Sub1_Sub5.aBoolean70 = true;
			@Pc(267) boolean local267 = false;
			Class8_Sub1_Sub1_Sub5.anInt303 = 0;
			Class8_Sub1_Sub1_Sub5.anInt301 = super.anInt840 - 4;
			Class8_Sub1_Sub1_Sub5.anInt302 = super.anInt841 - 4;
			Class8_Sub1_Sub2.method548(this.anInt970);
			this.aClass32_1.method355(this.anInt881, local35, this.anInt880, this.anInt878, this.anInt879, this.anInt877);
			this.aClass32_1.method330();
			this.method699((byte) 1);
			this.method590();
			this.method683(local195);
			this.method653(this.aByte22);
			this.aClass11_5.method71(4, super.aGraphics2, 4);
			this.anInt877 = local74;
			this.anInt878 = local137;
			this.anInt879 = local140;
			this.anInt880 = local143;
			this.anInt881 = local146;
		} catch (@Pc(340) RuntimeException local340) {
			signlink.reporterror("54862, " + arg0 + ", " + local340.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "l", descriptor = "(I)V")
	private void method613() {
		try {
			for (@Pc(5) int local5 = 0; local5 < this.anInt950; local5++) {
				@Pc(12) int local12 = this.anIntArray223[local5];
				@Pc(17) Class8_Sub1_Sub1_Sub1_Sub1 local17 = this.aClass8_Sub1_Sub1_Sub1_Sub1Array1[local12];
				if (local17 != null) {
					this.method614(local17, local17.aClass26_1.aByte11);
				}
			}
		} catch (@Pc(33) RuntimeException local33) {
			signlink.reporterror("11935, " + 3 + ", " + local33.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILclient!DBHOKPMQ;I)V")
	private void method614(@OriginalArg(1) Class8_Sub1_Sub1_Sub1 arg0, @OriginalArg(2) int arg1) {
		try {
			if (arg0.anInt716 < 128 || arg0.anInt717 < 128 || arg0.anInt716 >= 13184 || arg0.anInt717 >= 13184) {
				arg0.anInt711 = -1;
				arg0.anInt701 = -1;
				arg0.anInt690 = 0;
				arg0.anInt691 = 0;
				arg0.anInt716 = arg0.anIntArray183[0] * 128 + arg0.anInt726 * 64;
				arg0.anInt717 = arg0.anIntArray184[0] * 128 + arg0.anInt726 * 64;
				arg0.method471();
			}
			if (arg0 == aClass8_Sub1_Sub1_Sub1_Sub2_1 && (arg0.anInt716 < 1536 || arg0.anInt717 < 1536 || arg0.anInt716 >= 11776 || arg0.anInt717 >= 11776)) {
				arg0.anInt711 = -1;
				arg0.anInt701 = -1;
				arg0.anInt690 = 0;
				arg0.anInt691 = 0;
				arg0.anInt716 = arg0.anIntArray183[0] * 128 + arg0.anInt726 * 64;
				arg0.anInt717 = arg0.anIntArray184[0] * 128 + arg0.anInt726 * 64;
				arg0.method471();
			}
			if (arg0.anInt690 > anInt983) {
				this.method615(arg0);
			} else if (arg0.anInt691 >= anInt983) {
				this.method616(arg0);
			} else {
				this.method617(arg0);
			}
			this.method618(arg0);
			this.method619(arg0);
		} catch (@Pc(162) RuntimeException local162) {
			signlink.reporterror("59204, " + 9 + ", " + arg0 + ", " + arg1 + ", " + local162.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ZLclient!DBHOKPMQ;)V")
	private void method615(@OriginalArg(1) Class8_Sub1_Sub1_Sub1 arg0) {
		try {
			@Pc(4) int local4 = arg0.anInt690 - anInt983;
			@Pc(14) int local14 = arg0.anInt686 * 128 + arg0.anInt726 * 64;
			@Pc(24) int local24 = arg0.anInt688 * 128 + arg0.anInt726 * 64;
			arg0.anInt716 += (local14 - arg0.anInt716) / local4;
			arg0.anInt717 += (local24 - arg0.anInt717) / local4;
			arg0.anInt723 = 0;
			if (arg0.anInt692 == 0) {
				arg0.anInt700 = 1024;
			}
			if (arg0.anInt692 == 1) {
				arg0.anInt700 = 1536;
			}
			if (arg0.anInt692 == 2) {
				arg0.anInt700 = 0;
			}
			if (arg0.anInt692 == 3) {
				arg0.anInt700 = 512;
			}
		} catch (@Pc(83) RuntimeException local83) {
			signlink.reporterror("41065, " + false + ", " + arg0 + ", " + local83.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!DBHOKPMQ;Z)V")
	private void method616(@OriginalArg(0) Class8_Sub1_Sub1_Sub1 arg0) {
		try {
			if (arg0.anInt691 == anInt983 || arg0.anInt711 == -1 || arg0.anInt714 != 0 || arg0.anInt713 + 1 > Class46.aClass46Array1[arg0.anInt711].method486(arg0.anInt712, (byte) 6)) {
				@Pc(29) int local29 = arg0.anInt691 - arg0.anInt690;
				@Pc(34) int local34 = anInt983 - arg0.anInt690;
				@Pc(44) int local44 = arg0.anInt686 * 128 + arg0.anInt726 * 64;
				@Pc(54) int local54 = arg0.anInt688 * 128 + arg0.anInt726 * 64;
				@Pc(64) int local64 = arg0.anInt687 * 128 + arg0.anInt726 * 64;
				@Pc(74) int local74 = arg0.anInt689 * 128 + arg0.anInt726 * 64;
				arg0.anInt716 = (local44 * (local29 - local34) + local64 * local34) / local29;
				arg0.anInt717 = (local54 * (local29 - local34) + local74 * local34) / local29;
			}
			arg0.anInt723 = 0;
			this.aBoolean214 &= true;
			if (arg0.anInt692 == 0) {
				arg0.anInt700 = 1024;
			}
			if (arg0.anInt692 == 1) {
				arg0.anInt700 = 1536;
			}
			if (arg0.anInt692 == 2) {
				arg0.anInt700 = 0;
			}
			if (arg0.anInt692 == 3) {
				arg0.anInt700 = 512;
			}
			arg0.anInt718 = arg0.anInt700;
		} catch (@Pc(142) RuntimeException local142) {
			signlink.reporterror("66766, " + arg0 + ", " + true + ", " + local142.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!DBHOKPMQ;I)V")
	private void method617(@OriginalArg(0) Class8_Sub1_Sub1_Sub1 arg0) {
		try {
			arg0.anInt727 = arg0.anInt706;
			if (arg0.anInt695 == 0) {
				arg0.anInt723 = 0;
			} else {
				if (arg0.anInt711 != -1 && arg0.anInt714 == 0) {
					@Pc(24) Class46 local24 = Class46.aClass46Array1[arg0.anInt711];
					if (arg0.anInt709 > 0 && local24.anInt765 == 0) {
						arg0.anInt723++;
						return;
					}
					if (arg0.anInt709 <= 0 && local24.anInt766 == 0) {
						arg0.anInt723++;
						return;
					}
				}
				@Pc(53) int local53 = arg0.anInt716;
				@Pc(56) int local56 = arg0.anInt717;
				@Pc(71) int local71 = arg0.anIntArray183[arg0.anInt695 - 1] * 128 + arg0.anInt726 * 64;
				@Pc(86) int local86 = arg0.anIntArray184[arg0.anInt695 - 1] * 128 + arg0.anInt726 * 64;
				if (local71 - local53 <= 256 && local71 - local53 >= -256 && local86 - local56 <= 256 && local86 - local56 >= -256) {
					if (local53 < local71) {
						if (local56 < local86) {
							arg0.anInt700 = 1280;
						} else if (local56 > local86) {
							arg0.anInt700 = 1792;
						} else {
							arg0.anInt700 = 1536;
						}
					} else if (local53 > local71) {
						if (local56 < local86) {
							arg0.anInt700 = 768;
						} else if (local56 > local86) {
							arg0.anInt700 = 256;
						} else {
							arg0.anInt700 = 512;
						}
					} else if (local56 < local86) {
						arg0.anInt700 = 1024;
					} else {
						arg0.anInt700 = 0;
					}
					@Pc(185) int local185 = arg0.anInt700 - arg0.anInt718 & 0x7FF;
					if (local185 > 1024) {
						local185 -= 2048;
					}
					@Pc(192) int local192 = arg0.anInt697;
					if (local185 >= -256 && local185 <= 256) {
						local192 = arg0.anInt696;
					} else if (local185 >= 256 && local185 < 768) {
						local192 = arg0.anInt699;
					} else if (local185 >= -768 && local185 <= -256) {
						local192 = arg0.anInt698;
					}
					if (local192 == -1) {
						local192 = arg0.anInt696;
					}
					arg0.anInt727 = local192;
					@Pc(234) int local234 = 4;
					if (arg0.anInt718 != arg0.anInt700 && arg0.anInt722 == -1 && arg0.anInt708 != 0) {
						local234 = 2;
					}
					if (arg0.anInt695 > 2) {
						local234 = 6;
					}
					if (arg0.anInt695 > 3) {
						local234 = 8;
					}
					if (arg0.anInt723 > 0 && arg0.anInt695 > 1) {
						local234 = 8;
						arg0.anInt723--;
					}
					if (arg0.aBooleanArray9[arg0.anInt695 - 1]) {
						local234 <<= 0x1;
					}
					if (local234 >= 8 && arg0.anInt727 == arg0.anInt696 && arg0.anInt731 != -1) {
						arg0.anInt727 = arg0.anInt731;
					}
					if (local53 < local71) {
						arg0.anInt716 += local234;
						if (arg0.anInt716 > local71) {
							arg0.anInt716 = local71;
						}
					} else if (local53 > local71) {
						arg0.anInt716 -= local234;
						if (arg0.anInt716 < local71) {
							arg0.anInt716 = local71;
						}
					}
					if (local56 < local86) {
						arg0.anInt717 += local234;
						if (arg0.anInt717 > local86) {
							arg0.anInt717 = local86;
						}
					} else if (local56 > local86) {
						arg0.anInt717 -= local234;
						if (arg0.anInt717 < local86) {
							arg0.anInt717 = local86;
						}
					}
					if (arg0.anInt716 == local71 && arg0.anInt717 == local86) {
						arg0.anInt695--;
						if (arg0.anInt709 > 0) {
							arg0.anInt709--;
							return;
						}
					}
				} else {
					arg0.anInt716 = local71;
					arg0.anInt717 = local86;
				}
			}
		} catch (@Pc(396) RuntimeException local396) {
			signlink.reporterror("20751, " + arg0 + ", " + 826 + ", " + local396.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Lclient!DBHOKPMQ;I)V")
	private void method618(@OriginalArg(0) Class8_Sub1_Sub1_Sub1 arg0) {
		try {
			if (arg0.anInt708 != 0) {
				@Pc(31) int local31;
				@Pc(37) int local37;
				if (arg0.anInt722 != -1 && arg0.anInt722 < 32768) {
					@Pc(23) Class8_Sub1_Sub1_Sub1_Sub1 local23 = this.aClass8_Sub1_Sub1_Sub1_Sub1Array1[arg0.anInt722];
					if (local23 != null) {
						local31 = arg0.anInt716 - local23.anInt716;
						local37 = arg0.anInt717 - local23.anInt717;
						if (local31 != 0 || local37 != 0) {
							arg0.anInt700 = (int) (Math.atan2((double) local31, (double) local37) * 325.949D) & 0x7FF;
						}
					}
				}
				@Pc(62) int local62;
				if (arg0.anInt722 >= 32768) {
					local62 = arg0.anInt722 - 32768;
					if (local62 == this.anInt987) {
						local62 = this.anInt967;
					}
					@Pc(74) Class8_Sub1_Sub1_Sub1_Sub2 local74 = this.aClass8_Sub1_Sub1_Sub1_Sub2Array1[local62];
					if (local74 != null) {
						local37 = arg0.anInt716 - local74.anInt716;
						@Pc(88) int local88 = arg0.anInt717 - local74.anInt717;
						if (local37 != 0 || local88 != 0) {
							arg0.anInt700 = (int) (Math.atan2((double) local37, (double) local88) * 325.949D) & 0x7FF;
						}
					}
				}
				if ((arg0.anInt693 != 0 || arg0.anInt694 != 0) && (arg0.anInt695 == 0 || arg0.anInt723 > 0)) {
					local62 = arg0.anInt716 - (arg0.anInt693 - this.anInt924 - this.anInt924) * 64;
					local31 = arg0.anInt717 - (arg0.anInt694 - this.anInt925 - this.anInt925) * 64;
					if (local62 != 0 || local31 != 0) {
						arg0.anInt700 = (int) (Math.atan2((double) local62, (double) local31) * 325.949D) & 0x7FF;
					}
					arg0.anInt693 = 0;
					arg0.anInt694 = 0;
				}
				local62 = arg0.anInt700 - arg0.anInt718 & 0x7FF;
				if (local62 != 0) {
					if (local62 < arg0.anInt708 || local62 > 2048 - arg0.anInt708) {
						arg0.anInt718 = arg0.anInt700;
					} else if (local62 > 1024) {
						arg0.anInt718 -= arg0.anInt708;
					} else {
						arg0.anInt718 += arg0.anInt708;
					}
					arg0.anInt718 &= 0x7FF;
					if (arg0.anInt727 == arg0.anInt706 && arg0.anInt718 != arg0.anInt700) {
						if (arg0.anInt707 != -1) {
							arg0.anInt727 = arg0.anInt707;
							return;
						}
						arg0.anInt727 = arg0.anInt696;
						return;
					}
				}
			}
		} catch (@Pc(242) RuntimeException local242) {
			signlink.reporterror("99326, " + arg0 + ", " + -535 + ", " + local242.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILclient!DBHOKPMQ;)V")
	private void method619(@OriginalArg(1) Class8_Sub1_Sub1_Sub1 arg0) {
		try {
			arg0.aBoolean160 = false;
			@Pc(16) Class46 local16;
			if (arg0.anInt727 != -1) {
				local16 = Class46.aClass46Array1[arg0.anInt727];
				arg0.anInt729++;
				if (arg0.anInt728 < local16.anInt759 && arg0.anInt729 > local16.method486(arg0.anInt728, (byte) 6)) {
					arg0.anInt729 = 1;
					arg0.anInt728++;
				}
				if (arg0.anInt728 >= local16.anInt759) {
					arg0.anInt729 = 1;
					arg0.anInt728 = 0;
				}
			}
			if (arg0.anInt701 != -1 && anInt983 >= arg0.anInt704) {
				if (arg0.anInt702 < 0) {
					arg0.anInt702 = 0;
				}
				local16 = Class12.aClass12Array1[arg0.anInt701].aClass46_1;
				arg0.anInt703++;
				if (arg0.anInt702 < local16.anInt759 && arg0.anInt703 > local16.method486(arg0.anInt702, (byte) 6)) {
					arg0.anInt703 = 1;
					arg0.anInt702++;
				}
				if (arg0.anInt702 >= local16.anInt759 && (arg0.anInt702 < 0 || arg0.anInt702 >= local16.anInt759)) {
					arg0.anInt701 = -1;
				}
			}
			if (arg0.anInt711 != -1 && arg0.anInt714 <= 1) {
				local16 = Class46.aClass46Array1[arg0.anInt711];
				if (local16.anInt765 == 1 && arg0.anInt709 > 0 && arg0.anInt690 <= anInt983 && arg0.anInt691 < anInt983) {
					arg0.anInt714 = 1;
					return;
				}
			}
			if (arg0.anInt711 != -1 && arg0.anInt714 == 0) {
				local16 = Class46.aClass46Array1[arg0.anInt711];
				arg0.anInt713++;
				if (arg0.anInt712 < local16.anInt759 && arg0.anInt713 > local16.method486(arg0.anInt712, (byte) 6)) {
					arg0.anInt713 = 1;
					arg0.anInt712++;
				}
				if (arg0.anInt712 >= local16.anInt759) {
					arg0.anInt712 -= local16.anInt760;
					arg0.anInt715++;
					if (arg0.anInt715 >= local16.anInt764) {
						arg0.anInt711 = -1;
					}
					if (arg0.anInt712 < 0 || arg0.anInt712 >= local16.anInt759) {
						arg0.anInt711 = -1;
					}
				}
				arg0.aBoolean160 = local16.aBoolean166;
			}
			if (arg0.anInt714 > 0) {
				arg0.anInt714--;
			}
		} catch (@Pc(243) RuntimeException local243) {
			signlink.reporterror("88754, " + 0 + ", " + arg0 + ", " + local243.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(Z)V")
	private void method620(@OriginalArg(0) boolean arg0) {
		try {
			if (!arg0) {
				if (this.anInt957 == -1 || this.anInt915 != 2 && super.aClass11_2 == null) {
					if (this.aBoolean219) {
						this.method718();
						this.aBoolean219 = false;
						this.aClass11_19.method71(0, super.aGraphics2, 4);
						this.aClass11_20.method71(0, super.aGraphics2, 357);
						this.aClass11_21.method71(722, super.aGraphics2, 4);
						this.aClass11_22.method71(743, super.aGraphics2, 205);
						this.aClass11_23.method71(0, super.aGraphics2, 0);
						this.aClass11_24.method71(516, super.aGraphics2, 4);
						this.aClass11_25.method71(516, super.aGraphics2, 205);
						this.aClass11_26.method71(496, super.aGraphics2, 357);
						this.aClass11_27.method71(0, super.aGraphics2, 338);
						this.aBoolean217 = true;
						this.aBoolean191 = true;
						this.aBoolean195 = true;
						this.aBoolean204 = true;
						if (this.anInt915 != 2) {
							this.aClass11_5.method71(4, super.aGraphics2, 4);
							this.aClass11_4.method71(550, super.aGraphics2, 4);
						}
					}
					if (this.anInt915 == 2) {
						this.method612(179);
					}
					if (this.aBoolean208 && this.anInt892 == 1) {
						this.aBoolean217 = true;
					}
					@Pc(281) boolean local281;
					if (this.anInt934 != -1) {
						local281 = this.method625(this.anInt934, this.anInt1023);
						if (local281) {
							this.aBoolean217 = true;
						}
					}
					if (this.anInt1030 == 2) {
						this.aBoolean217 = true;
					}
					if (this.anInt1070 == 2) {
						this.aBoolean217 = true;
					}
					if (this.aBoolean217) {
						this.method687();
						this.aBoolean217 = false;
					}
					anInt930++;
					@Pc(331) int local331;
					if (anInt930 > 1085) {
						anInt930 = 0;
						this.aClass8_Sub1_Sub3_6.method141(22);
						this.aClass8_Sub1_Sub3_6.method142(0);
						local331 = this.aClass8_Sub1_Sub3_6.anInt239;
						if ((int) (Math.random() * 2.0D) == 0) {
							this.aClass8_Sub1_Sub3_6.method142(22);
						}
						if ((int) (Math.random() * 2.0D) == 0) {
							this.aClass8_Sub1_Sub3_6.method142(115);
						}
						if ((int) (Math.random() * 2.0D) == 0) {
							this.aClass8_Sub1_Sub3_6.method143(11812);
						}
						if ((int) (Math.random() * 2.0D) == 0) {
							this.aClass8_Sub1_Sub3_6.method142(72);
						}
						this.aClass8_Sub1_Sub3_6.method143(38281);
						this.aClass8_Sub1_Sub3_6.method143(19117);
						if ((int) (Math.random() * 2.0D) == 0) {
							this.aClass8_Sub1_Sub3_6.method143(5064);
						}
						this.aClass8_Sub1_Sub3_6.method142(17);
						this.aClass8_Sub1_Sub3_6.method143(51022);
						this.aClass8_Sub1_Sub3_6.method142((int) (Math.random() * 256.0D));
						this.aClass8_Sub1_Sub3_6.method151(this.aClass8_Sub1_Sub3_6.anInt239 - local331);
					}
					if (this.anInt973 == -1 && this.anInt940 == 0) {
						this.aClass24_1.anInt405 = this.anInt980 - this.anInt914 - 77;
						if (super.anInt840 > 448 && super.anInt840 < 560 && super.anInt841 > 332) {
							this.method622(77, this.anInt980, 0, 463, super.anInt840 - 17, this.aClass24_1, super.anInt841 - 357, -1);
						}
						local331 = this.anInt980 - this.aClass24_1.anInt405 - 77;
						if (local331 < 0) {
							local331 = 0;
						}
						if (local331 > this.anInt980 - 77) {
							local331 = this.anInt980 - 77;
						}
						if (this.anInt914 != local331) {
							this.anInt914 = local331;
							this.aBoolean191 = true;
						}
					}
					if (this.anInt973 == -1 && this.anInt940 == 3) {
						local331 = this.anInt901 * 14 + 7;
						this.aClass24_1.anInt405 = this.anInt902;
						if (super.anInt840 > 448 && super.anInt840 < 560 && super.anInt841 > 332) {
							this.method622(77, local331, 0, 463, super.anInt840 - 17, this.aClass24_1, super.anInt841 - 357, -1);
						}
						@Pc(544) int local544 = this.aClass24_1.anInt405;
						if (local544 < 0) {
							local544 = 0;
						}
						if (local544 > local331 - 77) {
							local544 = local331 - 77;
						}
						if (this.anInt902 != local544) {
							this.anInt902 = local544;
							this.aBoolean191 = true;
						}
					}
					if (this.anInt973 != -1) {
						local281 = this.method625(this.anInt973, this.anInt1023);
						if (local281) {
							this.aBoolean191 = true;
						}
					}
					if (this.anInt1030 == 3) {
						this.aBoolean191 = true;
					}
					if (this.anInt1070 == 3) {
						this.aBoolean191 = true;
					}
					if (this.aString31 != null) {
						this.aBoolean191 = true;
					}
					if (this.aBoolean208 && this.anInt892 == 2) {
						this.aBoolean191 = true;
					}
					if (this.aBoolean191) {
						this.method679();
						this.aBoolean191 = false;
					}
					if (this.anInt915 == 2) {
						this.method608(this.aByte31);
						this.aClass11_4.method71(550, super.aGraphics2, 4);
					}
					if (this.anInt956 != -1) {
						this.aBoolean195 = true;
					}
					if (this.aBoolean195) {
						if (this.anInt956 != -1 && this.anInt956 == this.anInt1060) {
							this.anInt956 = -1;
							this.aClass8_Sub1_Sub3_6.method141(192);
							this.aClass8_Sub1_Sub3_6.method142(this.anInt1060);
						}
						this.aBoolean195 = false;
						this.aClass11_9.method70();
						this.aClass8_Sub1_Sub2_Sub2_3.method406(0, 0);
						if (this.anInt934 == -1) {
							if (this.anIntArray249[this.anInt1060] != -1) {
								if (this.anInt1060 == 0) {
									this.aClass8_Sub1_Sub2_Sub2_4.method406(10, 22);
								}
								if (this.anInt1060 == 1) {
									this.aClass8_Sub1_Sub2_Sub2_5.method406(8, 54);
								}
								if (this.anInt1060 == 2) {
									this.aClass8_Sub1_Sub2_Sub2_5.method406(8, 82);
								}
								if (this.anInt1060 == 3) {
									this.aClass8_Sub1_Sub2_Sub2_6.method406(8, 110);
								}
								if (this.anInt1060 == 4) {
									this.aClass8_Sub1_Sub2_Sub2_8.method406(8, 153);
								}
								if (this.anInt1060 == 5) {
									this.aClass8_Sub1_Sub2_Sub2_8.method406(8, 181);
								}
								if (this.anInt1060 == 6) {
									this.aClass8_Sub1_Sub2_Sub2_7.method406(9, 209);
								}
							}
							if (this.anIntArray249[0] != -1 && (this.anInt956 != 0 || anInt983 % 20 < 10)) {
								this.aClass8_Sub1_Sub2_Sub2Array2[0].method406(13, 29);
							}
							if (this.anIntArray249[1] != -1 && (this.anInt956 != 1 || anInt983 % 20 < 10)) {
								this.aClass8_Sub1_Sub2_Sub2Array2[1].method406(11, 53);
							}
							if (this.anIntArray249[2] != -1 && (this.anInt956 != 2 || anInt983 % 20 < 10)) {
								this.aClass8_Sub1_Sub2_Sub2Array2[2].method406(11, 82);
							}
							if (this.anIntArray249[3] != -1 && (this.anInt956 != 3 || anInt983 % 20 < 10)) {
								this.aClass8_Sub1_Sub2_Sub2Array2[3].method406(12, 115);
							}
							if (this.anIntArray249[4] != -1 && (this.anInt956 != 4 || anInt983 % 20 < 10)) {
								this.aClass8_Sub1_Sub2_Sub2Array2[4].method406(13, 153);
							}
							if (this.anIntArray249[5] != -1 && (this.anInt956 != 5 || anInt983 % 20 < 10)) {
								this.aClass8_Sub1_Sub2_Sub2Array2[5].method406(11, 180);
							}
							if (this.anIntArray249[6] != -1 && (this.anInt956 != 6 || anInt983 % 20 < 10)) {
								this.aClass8_Sub1_Sub2_Sub2Array2[6].method406(13, 208);
							}
						}
						this.aClass11_9.method71(516, super.aGraphics2, 160);
						this.aClass11_8.method70();
						this.aClass8_Sub1_Sub2_Sub2_2.method406(0, 0);
						if (this.anInt934 == -1) {
							if (this.anIntArray249[this.anInt1060] != -1) {
								if (this.anInt1060 == 7) {
									this.aClass8_Sub1_Sub2_Sub2_13.method406(0, 42);
								}
								if (this.anInt1060 == 8) {
									this.aClass8_Sub1_Sub2_Sub2_14.method406(0, 74);
								}
								if (this.anInt1060 == 9) {
									this.aClass8_Sub1_Sub2_Sub2_14.method406(0, 102);
								}
								if (this.anInt1060 == 10) {
									this.aClass8_Sub1_Sub2_Sub2_15.method406(1, 130);
								}
								if (this.anInt1060 == 11) {
									this.aClass8_Sub1_Sub2_Sub2_17.method406(0, 173);
								}
								if (this.anInt1060 == 12) {
									this.aClass8_Sub1_Sub2_Sub2_17.method406(0, 201);
								}
								if (this.anInt1060 == 13) {
									this.aClass8_Sub1_Sub2_Sub2_16.method406(0, 229);
								}
							}
							if (this.anIntArray249[8] != -1 && (this.anInt956 != 8 || anInt983 % 20 < 10)) {
								this.aClass8_Sub1_Sub2_Sub2Array2[7].method406(2, 74);
							}
							if (this.anIntArray249[9] != -1 && (this.anInt956 != 9 || anInt983 % 20 < 10)) {
								this.aClass8_Sub1_Sub2_Sub2Array2[8].method406(3, 102);
							}
							if (this.anIntArray249[10] != -1 && (this.anInt956 != 10 || anInt983 % 20 < 10)) {
								this.aClass8_Sub1_Sub2_Sub2Array2[9].method406(4, 137);
							}
							if (this.anIntArray249[11] != -1 && (this.anInt956 != 11 || anInt983 % 20 < 10)) {
								this.aClass8_Sub1_Sub2_Sub2Array2[10].method406(2, 174);
							}
							if (this.anIntArray249[12] != -1 && (this.anInt956 != 12 || anInt983 % 20 < 10)) {
								this.aClass8_Sub1_Sub2_Sub2Array2[11].method406(2, 201);
							}
							if (this.anIntArray249[13] != -1 && (this.anInt956 != 13 || anInt983 % 20 < 10)) {
								this.aClass8_Sub1_Sub2_Sub2Array2[12].method406(2, 226);
							}
						}
						this.aClass11_8.method71(496, super.aGraphics2, 466);
						this.aClass11_5.method70();
						Class8_Sub1_Sub2_Sub4.anIntArray206 = this.anIntArray228;
					}
					if (this.aBoolean204) {
						this.aBoolean204 = false;
						this.aClass11_7.method70();
						this.aClass8_Sub1_Sub2_Sub2_1.method406(0, 0);
						this.aClass8_Sub1_Sub2_Sub3_3.method448("Public chat", 16777215, 55, 28, true);
						if (this.anInt988 == 0) {
							this.aClass8_Sub1_Sub2_Sub3_3.method448("On", 65280, 55, 41, true);
						}
						if (this.anInt988 == 1) {
							this.aClass8_Sub1_Sub2_Sub3_3.method448("Friends", 16776960, 55, 41, true);
						}
						if (this.anInt988 == 2) {
							this.aClass8_Sub1_Sub2_Sub3_3.method448("Off", 16711680, 55, 41, true);
						}
						if (this.anInt988 == 3) {
							this.aClass8_Sub1_Sub2_Sub3_3.method448("Hide", 65535, 55, 41, true);
						}
						this.aClass8_Sub1_Sub2_Sub3_3.method448("Private chat", 16777215, 184, 28, true);
						if (this.anInt1016 == 0) {
							this.aClass8_Sub1_Sub2_Sub3_3.method448("On", 65280, 184, 41, true);
						}
						if (this.anInt1016 == 1) {
							this.aClass8_Sub1_Sub2_Sub3_3.method448("Friends", 16776960, 184, 41, true);
						}
						if (this.anInt1016 == 2) {
							this.aClass8_Sub1_Sub2_Sub3_3.method448("Off", 16711680, 184, 41, true);
						}
						this.aClass8_Sub1_Sub2_Sub3_3.method448("Trade/compete", 16777215, 324, 28, true);
						if (this.anInt976 == 0) {
							this.aClass8_Sub1_Sub2_Sub3_3.method448("On", 65280, 324, 41, true);
						}
						if (this.anInt976 == 1) {
							this.aClass8_Sub1_Sub2_Sub3_3.method448("Friends", 16776960, 324, 41, true);
						}
						if (this.anInt976 == 2) {
							this.aClass8_Sub1_Sub2_Sub3_3.method448("Off", 16711680, 324, 41, true);
						}
						this.aClass8_Sub1_Sub2_Sub3_3.method448("Report abuse", 16777215, 458, 33, true);
						this.aClass11_7.method71(0, super.aGraphics2, 453);
						this.aClass11_5.method70();
						Class8_Sub1_Sub2_Sub4.anIntArray206 = this.anIntArray228;
					}
					this.anInt1023 = 0;
				} else {
					if (this.anInt915 == 2) {
						this.method625(this.anInt957, this.anInt1023);
						if (this.anInt911 != -1) {
							this.method625(this.anInt911, this.anInt1023);
						}
						this.anInt1023 = 0;
						this.method605();
						super.aClass11_2.method70();
						Class8_Sub1_Sub2_Sub4.anIntArray206 = this.anIntArray229;
						Class8_Sub1_Sub2.method548(this.anInt970);
						this.aBoolean219 = true;
						@Pc(60) Class24 local60 = Class24.method269(this.anInt957);
						if (local60.anInt393 == 512 && local60.anInt430 == 334 && local60.anInt423 == 0) {
							local60.anInt393 = 765;
							local60.anInt430 = 503;
						}
						this.method668(0, local60, 0, 0);
						if (this.anInt911 != -1) {
							local60 = Class24.method269(this.anInt911);
							if (local60.anInt393 == 512 && local60.anInt430 == 334 && local60.anInt423 == 0) {
								local60.anInt393 = 765;
								local60.anInt430 = 503;
							}
							this.method668(0, local60, 0, 0);
						}
						if (this.aBoolean208) {
							this.method610();
						} else {
							this.method645();
							this.method632();
						}
					}
					super.aClass11_2.method71(0, super.aGraphics2, 0);
				}
			}
		} catch (@Pc(1375) RuntimeException local1375) {
			signlink.reporterror("91905, " + arg0 + ", " + local1375.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(B)V")
	private void method621() {
		try {
			for (@Pc(6) Class8_Sub3 local6 = (Class8_Sub3) this.aClass49_12.method538(); local6 != null; local6 = (Class8_Sub3) this.aClass49_12.method540((byte) 6)) {
				if (local6.anInt311 == -1) {
					local6.anInt312 = 0;
					this.method696(local6);
				} else {
					local6.method543();
				}
			}
		} catch (@Pc(41) RuntimeException local41) {
			signlink.reporterror("38596, " + -18 + ", " + local41.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIIILclient!MIIVNBFU;III)V")
	private void method622(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class24 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		try {
			if (this.aBoolean193) {
				this.anInt994 = 32;
			} else {
				this.anInt994 = 0;
			}
			this.aBoolean193 = false;
			if (arg4 >= arg3 && arg4 < arg3 + 16 && arg6 >= arg2 && arg6 < arg2 + 16) {
				arg5.anInt405 -= this.anInt1054 * 4;
				if (arg7 == 1) {
					this.aBoolean217 = true;
				}
				if (arg7 == 2 || arg7 == 3) {
					this.aBoolean191 = true;
				}
			} else if (arg4 >= arg3 && arg4 < arg3 + 16 && arg6 >= arg2 + arg0 - 16 && arg6 < arg2 + arg0) {
				arg5.anInt405 += this.anInt1054 * 4;
				if (arg7 == 1) {
					this.aBoolean217 = true;
				}
				if (arg7 == 2 || arg7 == 3) {
					this.aBoolean191 = true;
				}
			} else if (arg4 >= arg3 - this.anInt994 && arg4 < arg3 + this.anInt994 + 16 && arg6 >= arg2 + 16 && arg6 < arg2 + arg0 - 16 && this.anInt1054 > 0) {
				@Pc(141) int local141 = (arg0 - 32) * arg0 / arg1;
				if (local141 < 8) {
					local141 = 8;
				}
				@Pc(156) int local156 = arg6 - arg2 - local141 / 2 - 16;
				@Pc(162) int local162 = arg0 - local141 - 32;
				arg5.anInt405 = (arg1 - arg0) * local156 / local162;
				if (arg7 == 1) {
					this.aBoolean217 = true;
				}
				if (arg7 == 2 || arg7 == 3) {
					this.aBoolean191 = true;
				}
				this.aBoolean193 = true;
			}
		} catch (@Pc(191) RuntimeException local191) {
			signlink.reporterror("58033, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + 0 + ", " + local191.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IILclient!IUVBENCV;)V")
	private void method623(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class8_Sub1_Sub3 arg2) {
		try {
			this.anInt851 = 0;
			if (arg1 == 36117) {
				this.anInt969 = 0;
				this.method627(arg2, this.anInt907, arg0);
				this.method663(arg0, arg2);
				this.method648(arg0, arg2);
				@Pc(36) int local36;
				for (@Pc(29) int local29 = 0; local29 < this.anInt851; local29++) {
					local36 = this.anIntArray212[local29];
					if (this.aClass8_Sub1_Sub1_Sub1_Sub1Array1[local36].anInt732 != anInt983) {
						this.aClass8_Sub1_Sub1_Sub1_Sub1Array1[local36].aClass26_1 = null;
						this.aClass8_Sub1_Sub1_Sub1_Sub1Array1[local36] = null;
					}
				}
				if (arg2.anInt239 != arg0) {
					signlink.reporterror(this.aString27 + " size mismatch in getnpcpos - pos:" + arg2.anInt239 + " psize:" + arg0);
					throw new RuntimeException("eek");
				}
				for (local36 = 0; local36 < this.anInt950; local36++) {
					if (this.aClass8_Sub1_Sub1_Sub1_Sub1Array1[this.anIntArray223[local36]] == null) {
						signlink.reporterror(this.aString27 + " null entry in npc list - pos:" + local36 + " size:" + this.anInt950);
						throw new RuntimeException("eek");
					}
				}
			}
		} catch (@Pc(126) RuntimeException local126) {
			signlink.reporterror("24226, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local126.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "f", descriptor = "(Z)V")
	private void method624() {
		try {
			@Pc(6) int local6 = this.anInt1038 * 128 + 64;
			@Pc(13) int local13 = this.anInt1039 * 128 + 64;
			@Pc(24) int local24 = this.method680(local13, this.anInt933, local6) - this.anInt1040;
			if (this.anInt877 < local6) {
				this.anInt877 += this.anInt1041 + (local6 - this.anInt877) * this.anInt1042 / 1000;
				if (this.anInt877 > local6) {
					this.anInt877 = local6;
				}
			}
			if (this.anInt877 > local6) {
				this.anInt877 -= this.anInt1041 + (this.anInt877 - local6) * this.anInt1042 / 1000;
				if (this.anInt877 < local6) {
					this.anInt877 = local6;
				}
			}
			if (this.anInt878 < local24) {
				this.anInt878 += this.anInt1041 + (local24 - this.anInt878) * this.anInt1042 / 1000;
				if (this.anInt878 > local24) {
					this.anInt878 = local24;
				}
			}
			if (this.anInt878 > local24) {
				this.anInt878 -= this.anInt1041 + (this.anInt878 - local24) * this.anInt1042 / 1000;
				if (this.anInt878 < local24) {
					this.anInt878 = local24;
				}
			}
			if (this.anInt879 < local13) {
				this.anInt879 += this.anInt1041 + (local13 - this.anInt879) * this.anInt1042 / 1000;
				if (this.anInt879 > local13) {
					this.anInt879 = local13;
				}
			}
			if (this.anInt879 > local13) {
				this.anInt879 -= this.anInt1041 + (this.anInt879 - local13) * this.anInt1042 / 1000;
				if (this.anInt879 < local13) {
					this.anInt879 = local13;
				}
			}
			anInt1026++;
			if (anInt1026 > 131) {
				anInt1026 = 0;
				this.aClass8_Sub1_Sub3_6.method141(131);
				this.aClass8_Sub1_Sub3_6.method142(223);
			}
			local6 = this.anInt944 * 128 + 64;
			local13 = this.anInt945 * 128 + 64;
			local24 = this.method680(local13, this.anInt933, local6) - this.anInt946;
			@Pc(247) int local247 = local6 - this.anInt877;
			@Pc(252) int local252 = local24 - this.anInt878;
			@Pc(257) int local257 = local13 - this.anInt879;
			@Pc(268) int local268 = (int) Math.sqrt((double) (local247 * local247 + local257 * local257));
			@Pc(279) int local279 = (int) (Math.atan2((double) local252, (double) local268) * 325.949D) & 0x7FF;
			@Pc(290) int local290 = (int) (Math.atan2((double) local247, (double) local257) * -325.949D) & 0x7FF;
			if (local279 < 128) {
				local279 = 128;
			}
			if (local279 > 383) {
				local279 = 383;
			}
			if (this.anInt880 < local279) {
				this.anInt880 += this.anInt947 + (local279 - this.anInt880) * this.anInt948 / 1000;
				if (this.anInt880 > local279) {
					this.anInt880 = local279;
				}
			}
			if (this.anInt880 > local279) {
				this.anInt880 -= this.anInt947 + (this.anInt880 - local279) * this.anInt948 / 1000;
				if (this.anInt880 < local279) {
					this.anInt880 = local279;
				}
			}
			@Pc(361) int local361 = local290 - this.anInt881;
			if (local361 > 1024) {
				local361 -= 2048;
			}
			if (local361 < -1024) {
				local361 += 2048;
			}
			if (local361 > 0) {
				this.anInt881 += this.anInt947 + local361 * this.anInt948 / 1000;
				this.anInt881 &= 0x7FF;
			}
			if (local361 < 0) {
				this.anInt881 -= this.anInt947 + -local361 * this.anInt948 / 1000;
				this.anInt881 &= 0x7FF;
			}
			@Pc(419) int local419 = local290 - this.anInt881;
			if (local419 > 1024) {
				local419 -= 2048;
			}
			if (local419 < -1024) {
				local419 += 2048;
			}
			if (local419 < 0 && local361 > 0 || local419 > 0 && local361 < 0) {
				this.anInt881 = local290;
			}
		} catch (@Pc(440) RuntimeException local440) {
			signlink.reporterror("66928, " + false + ", " + local440.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IBI)Z")
	private boolean method625(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		try {
			@Pc(3) boolean local3 = false;
			@Pc(12) Class24 local12 = Class24.method269(arg0);
			for (@Pc(14) int local14 = 0; local14 < local12.anIntArray121.length && local12.anIntArray121[local14] != -1; local14++) {
				@Pc(28) Class24 local28 = Class24.method269(local12.anIntArray121[local14]);
				if (local28.anInt423 == 0) {
					local3 |= this.method625(local28.anInt394, arg1);
				}
				@Pc(62) int local62;
				if (local28.anInt423 == 6 && (local28.anInt406 != -1 || local28.anInt407 != -1)) {
					@Pc(57) boolean local57 = this.method672((byte) 2, local28);
					if (local57) {
						local62 = local28.anInt407;
					} else {
						local62 = local28.anInt406;
					}
					if (local62 != -1) {
						@Pc(74) Class46 local74 = Class46.aClass46Array1[local62];
						local28.anInt412 += arg1;
						while (local28.anInt412 > local74.method486(local28.anInt397, (byte) 6)) {
							local28.anInt412 -= local74.method486(local28.anInt397, (byte) 6);
							local28.anInt397++;
							if (local28.anInt397 >= local74.anInt759) {
								local28.anInt397 -= local74.anInt760;
								if (local28.anInt397 < 0 || local28.anInt397 >= local74.anInt759) {
									local28.anInt397 = 0;
								}
							}
							local3 = true;
						}
					}
				}
				if (local28.anInt423 == 6 && local28.anInt398 != 0) {
					@Pc(143) int local143 = local28.anInt398 >> 16;
					local62 = local28.anInt398 << 16 >> 16;
					@Pc(154) int local154 = local143 * arg1;
					local62 *= arg1;
					local28.anInt420 = local28.anInt420 + local154 & 0x7FF;
					local28.anInt421 = local28.anInt421 + local62 & 0x7FF;
					local3 = true;
				}
			}
			return local3;
		} catch (@Pc(185) RuntimeException local185) {
			signlink.reporterror("2088, " + arg0 + ", " + -13 + ", " + arg1 + ", " + local185.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILclient!IUVBENCV;I)V")
	private void method626(@OriginalArg(0) int arg0, @OriginalArg(1) Class8_Sub1_Sub3 arg1, @OriginalArg(2) int arg2) {
		try {
			@Pc(6) int local6 = arg1.method163(830, 8);
			@Pc(12) int local12;
			if (local6 < this.anInt968) {
				for (local12 = local6; local12 < this.anInt968; local12++) {
					this.anIntArray212[this.anInt851++] = this.anIntArray236[local12];
				}
			}
			if (local6 > this.anInt968) {
				signlink.reporterror(this.aString27 + " Too many players");
				throw new RuntimeException("eek");
			}
			this.anInt968 = 0;
			for (local12 = 0; local12 < local6; local12++) {
				@Pc(64) int local64 = this.anIntArray236[local12];
				@Pc(69) Class8_Sub1_Sub1_Sub1_Sub2 local69 = this.aClass8_Sub1_Sub1_Sub1_Sub2Array1[local64];
				@Pc(74) int local74 = arg1.method163(830, 1);
				if (local74 == 0) {
					this.anIntArray236[this.anInt968++] = local64;
					local69.anInt732 = anInt983;
				} else {
					@Pc(97) int local97 = arg1.method163(830, 2);
					if (local97 == 0) {
						this.anIntArray236[this.anInt968++] = local64;
						local69.anInt732 = anInt983;
						this.anIntArray237[this.anInt969++] = local64;
					} else {
						@Pc(148) int local148;
						@Pc(158) int local158;
						if (local97 == 1) {
							this.anIntArray236[this.anInt968++] = local64;
							local69.anInt732 = anInt983;
							local148 = arg1.method163(830, 3);
							local69.method472(local148, false);
							local158 = arg1.method163(830, 1);
							if (local158 == 1) {
								this.anIntArray237[this.anInt969++] = local64;
							}
						} else if (local97 == 2) {
							this.anIntArray236[this.anInt968++] = local64;
							local69.anInt732 = anInt983;
							local148 = arg1.method163(830, 3);
							local69.method472(local148, true);
							local158 = arg1.method163(830, 3);
							local69.method472(local158, true);
							@Pc(216) int local216 = arg1.method163(830, 1);
							if (local216 == 1) {
								this.anIntArray237[this.anInt969++] = local64;
							}
						} else if (local97 == 3) {
							this.anIntArray212[this.anInt851++] = local64;
						}
					}
				}
			}
			@Pc(255) boolean local255 = false;
		} catch (@Pc(257) RuntimeException local257) {
			signlink.reporterror("33362, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local257.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!IUVBENCV;II)V")
	private void method627(@OriginalArg(0) Class8_Sub1_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		try {
			arg0.method162();
			@Pc(9) int local9 = arg0.method163(830, 8);
			if (arg1 != -46618) {
				this.aClass49ArrayArrayArray1 = null;
			}
			@Pc(21) int local21;
			if (local9 < this.anInt950) {
				for (local21 = local9; local21 < this.anInt950; local21++) {
					this.anIntArray212[this.anInt851++] = this.anIntArray223[local21];
				}
			}
			if (local9 > this.anInt950) {
				signlink.reporterror(this.aString27 + " Too many npcs");
				throw new RuntimeException("eek");
			}
			this.anInt950 = 0;
			for (local21 = 0; local21 < local9; local21++) {
				@Pc(73) int local73 = this.anIntArray223[local21];
				@Pc(78) Class8_Sub1_Sub1_Sub1_Sub1 local78 = this.aClass8_Sub1_Sub1_Sub1_Sub1Array1[local73];
				@Pc(83) int local83 = arg0.method163(830, 1);
				if (local83 == 0) {
					this.anIntArray223[this.anInt950++] = local73;
					local78.anInt732 = anInt983;
				} else {
					@Pc(106) int local106 = arg0.method163(830, 2);
					if (local106 == 0) {
						this.anIntArray223[this.anInt950++] = local73;
						local78.anInt732 = anInt983;
						this.anIntArray237[this.anInt969++] = local73;
					} else {
						@Pc(157) int local157;
						@Pc(167) int local167;
						if (local106 == 1) {
							this.anIntArray223[this.anInt950++] = local73;
							local78.anInt732 = anInt983;
							local157 = arg0.method163(830, 3);
							local78.method472(local157, false);
							local167 = arg0.method163(830, 1);
							if (local167 == 1) {
								this.anIntArray237[this.anInt969++] = local73;
							}
						} else if (local106 == 2) {
							this.anIntArray223[this.anInt950++] = local73;
							local78.anInt732 = anInt983;
							local157 = arg0.method163(830, 3);
							local78.method472(local157, true);
							local167 = arg0.method163(830, 3);
							local78.method472(local167, true);
							@Pc(225) int local225 = arg0.method163(830, 1);
							if (local225 == 1) {
								this.anIntArray237[this.anInt969++] = local73;
							}
						} else if (local106 == 3) {
							this.anIntArray212[this.anInt851++] = local73;
						}
					}
				}
			}
		} catch (@Pc(262) RuntimeException local262) {
			signlink.reporterror("18451, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local262.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/Runnable;I)V")
	@Override
	public void method585(@OriginalArg(0) Runnable arg0, @OriginalArg(1) int arg1) {
		if (arg1 > 10) {
			arg1 = 10;
		}
		if (signlink.mainapp == null) {
			super.method585(arg0, arg1);
		} else {
			signlink.startthread(arg0, arg1);
		}
	}

	@OriginalMember(owner = "client!client", name = "m", descriptor = "(I)Ljava/lang/String;")
	private String method628() {
		try {
			if (signlink.mainapp == null) {
				return super.aFrame_Sub1_2 == null ? super.getDocumentBase().getHost().toLowerCase() : "runescape.com";
			} else {
				return signlink.mainapp.getDocumentBase().getHost().toLowerCase();
			}
		} catch (@Pc(25) RuntimeException local25) {
			signlink.reporterror("91555, " + 5 + ", " + local25.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "n", descriptor = "(I)V")
	private void method629(@OriginalArg(0) int arg0) {
		try {
			@Pc(3) boolean local3 = false;
			signlink.aBoolean239 = false;
			signlink.anInt1092 = 0;
			signlink.midi = "stop";
		} catch (@Pc(11) RuntimeException local11) {
			signlink.reporterror("570, " + arg0 + ", " + local11.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(IILclient!IUVBENCV;)V")
	private void method630(@OriginalArg(0) int arg0, @OriginalArg(2) Class8_Sub1_Sub3 arg1) {
		try {
			arg1.method162();
			@Pc(12) int local12 = arg1.method163(830, 1);
			if (local12 != 0) {
				@Pc(20) int local20 = arg1.method163(830, 2);
				if (local20 == 0) {
					this.anIntArray237[this.anInt969++] = this.anInt967;
				} else {
					@Pc(43) int local43;
					@Pc(53) int local53;
					if (local20 == 1) {
						local43 = arg1.method163(830, 3);
						aClass8_Sub1_Sub1_Sub1_Sub2_1.method472(local43, false);
						local53 = arg1.method163(830, 1);
						if (local53 == 1) {
							this.anIntArray237[this.anInt969++] = this.anInt967;
						}
					} else {
						@Pc(97) int local97;
						if (local20 == 2) {
							local43 = arg1.method163(830, 3);
							aClass8_Sub1_Sub1_Sub1_Sub2_1.method472(local43, true);
							local53 = arg1.method163(830, 3);
							aClass8_Sub1_Sub1_Sub1_Sub2_1.method472(local53, true);
							local97 = arg1.method163(830, 1);
							if (local97 == 1) {
								this.anIntArray237[this.anInt969++] = this.anInt967;
							}
						} else if (local20 == 3) {
							this.anInt933 = arg1.method163(830, 2);
							local43 = arg1.method163(830, 7);
							local53 = arg1.method163(830, 7);
							local97 = arg1.method163(830, 1);
							@Pc(142) int local142 = arg1.method163(830, 1);
							if (local142 == 1) {
								this.anIntArray237[this.anInt969++] = this.anInt967;
							}
							aClass8_Sub1_Sub1_Sub1_Sub2_1.method473(local53, local43, local97 == 1);
						}
					}
				}
			}
		} catch (@Pc(170) RuntimeException local170) {
			signlink.reporterror("72972, " + arg0 + ", " + -227 + ", " + arg1 + ", " + local170.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(B)V")
	@Override
	protected void method580(@OriginalArg(0) byte arg0) {
		try {
			@Pc(6) boolean local6 = false;
			if (!this.aBoolean233 && !this.aBoolean223 && !this.aBoolean207) {
				anInt983++;
				if (this.aBoolean214) {
					this.method662();
				} else {
					this.method603();
				}
				this.method599();
			}
		} catch (@Pc(39) RuntimeException local39) {
			signlink.reporterror("96834, " + arg0 + ", " + local39.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIIII)V")
	private void method631(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		try {
			this.aClass8_Sub1_Sub2_Sub2_11.method406(arg4, arg3);
			this.aClass8_Sub1_Sub2_Sub2_12.method406(arg4 + arg1 - 16, arg3);
			Class8_Sub1_Sub2.method550(16, arg4 + 16, this.anInt876, arg1 - 32, arg3);
			@Pc(40) int local40 = (arg1 - 32) * arg1 / arg2;
			if (local40 < 8) {
				local40 = 8;
			}
			@Pc(57) int local57 = (arg1 - local40 - 32) * arg0 / (arg2 - arg1);
			Class8_Sub1_Sub2.method550(16, arg4 + local57 + 16, this.anInt955, local40, arg3);
			Class8_Sub1_Sub2.method555(arg4 + local57 + 16, local40, arg3, this.anInt1017);
			Class8_Sub1_Sub2.method555(arg4 + local57 + 16, local40, arg3 + 1, this.anInt1017);
			Class8_Sub1_Sub2.method553(arg4 + local57 + 16, this.anInt1017, arg3, 16);
			Class8_Sub1_Sub2.method553(arg4 + local57 + 17, this.anInt1017, arg3, 16);
			Class8_Sub1_Sub2.method555(arg4 + local57 + 16, local40, arg3 + 15, this.anInt883);
			Class8_Sub1_Sub2.method555(arg4 + local57 + 17, local40 - 1, arg3 + 14, this.anInt883);
			Class8_Sub1_Sub2.method553(arg4 + local57 + local40 + 15, this.anInt883, arg3, 16);
			Class8_Sub1_Sub2.method553(arg4 + local57 + local40 + 14, this.anInt883, arg3 + 1, 15);
		} catch (@Pc(173) RuntimeException local173) {
			signlink.reporterror("41025, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + 462 + ", " + arg4 + ", " + local173.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "o", descriptor = "(I)V")
	private void method632() {
		try {
			if (this.anInt1025 >= 2 || this.anInt961 != 0 || this.anInt865 != 0) {
				@Pc(31) String local31;
				if (this.anInt961 == 1 && this.anInt1025 < 2) {
					local31 = "Use " + this.aString24 + " with...";
				} else if (this.anInt865 == 1 && this.anInt1025 < 2) {
					local31 = this.aString18 + "...";
				} else {
					local31 = this.aStringArray14[this.anInt1025 - 1];
				}
				if (this.anInt1025 > 2) {
					local31 = local31 + "@whi@ / " + (this.anInt1025 - 2) + " more options";
				}
				this.aClass8_Sub1_Sub2_Sub3_4.method456(anInt983 / 1000, 4, local31, 16777215, 15);
				this.anInt1044 += 0;
			}
		} catch (@Pc(101) RuntimeException local101) {
			signlink.reporterror("56635, " + 0 + ", " + local101.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(II)V")
	private void method633(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(9) Class49 local9 = this.aClass49ArrayArrayArray1[this.anInt933][arg0][arg1];
		if (local9 == null) {
			this.aClass32_1.method337(this.anInt933, arg0, arg1);
			return;
		}
		@Pc(21) int local21 = -99999999;
		@Pc(23) Class8_Sub1_Sub1_Sub3 local23 = null;
		@Pc(27) Class8_Sub1_Sub1_Sub3 local27;
		for (local27 = (Class8_Sub1_Sub1_Sub3) local9.method538(); local27 != null; local27 = (Class8_Sub1_Sub1_Sub3) local9.method540((byte) 6)) {
			@Pc(32) Class19 local32 = Class19.method191(local27.anInt201);
			@Pc(35) int local35 = local32.anInt245;
			if (local32.aBoolean60) {
				local35 *= local27.anInt202 + 1;
			}
			if (local35 > local21) {
				local21 = local35;
				local23 = local27;
			}
		}
		local9.method536(local23);
		@Pc(65) Class8_Sub1_Sub1_Sub3 local65 = null;
		@Pc(67) Class8_Sub1_Sub1_Sub3 local67 = null;
		for (local27 = (Class8_Sub1_Sub1_Sub3) local9.method538(); local27 != null; local27 = (Class8_Sub1_Sub1_Sub3) local9.method540((byte) 6)) {
			if (local27.anInt201 != local23.anInt201 && local65 == null) {
				local65 = local27;
			}
			if (local27.anInt201 != local23.anInt201 && local27.anInt201 != local65.anInt201 && local67 == null) {
				local67 = local27;
			}
		}
		@Pc(110) int local110 = arg0 + (arg1 << 7) + 1610612736;
		this.aClass32_1.method323(this.method680(arg1 * 128 + 64, this.anInt933, arg0 * 128 + 64), local67, local65, arg1, local23, this.anInt933, local110, arg0);
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(II)V")
	private void method634(@OriginalArg(0) int arg0) {
		try {
			@Pc(5) int[] local5 = this.aClass8_Sub1_Sub2_Sub1_9.anIntArray41;
			@Pc(8) int local8 = local5.length;
			for (@Pc(10) int local10 = 0; local10 < local8; local10++) {
				local5[local10] = 0;
			}
			@Pc(34) int local34;
			@Pc(36) int local36;
			for (@Pc(22) int local22 = 1; local22 < 103; local22++) {
				local34 = (103 - local22) * 512 * 4 + 24628;
				for (local36 = 1; local36 < 103; local36++) {
					if ((this.aByteArrayArrayArray8[arg0][local36][local22] & 0x18) == 0) {
						this.aClass32_1.method351(local5, local34, arg0, local36, local22);
					}
					if (arg0 < 3 && (this.aByteArrayArrayArray8[arg0 + 1][local36][local22] & 0x8) != 0) {
						this.aClass32_1.method351(local5, local34, arg0 + 1, local36, local22);
					}
					local34 += 4;
				}
			}
			local34 = ((int) (Math.random() * 20.0D) + 238 - 10 << 16) + ((int) (Math.random() * 20.0D) + 238 - 10 << 8) + (int) (Math.random() * 20.0D) + 238 - 10;
			local36 = (int) (Math.random() * 20.0D) + 238 - 10 << 16;
			this.aClass8_Sub1_Sub2_Sub1_9.method112();
			@Pc(152) int local152;
			for (@Pc(148) int local148 = 1; local148 < 103; local148++) {
				for (local152 = 1; local152 < 103; local152++) {
					if ((this.aByteArrayArrayArray8[arg0][local152][local148] & 0x18) == 0) {
						this.method593(local148, arg0, local152, local34, local36);
					}
					if (arg0 < 3 && (this.aByteArrayArrayArray8[arg0 + 1][local152][local148] & 0x8) != 0) {
						this.method593(local148, arg0 + 1, local152, local34, local36);
					}
				}
			}
			if (this.aClass11_5 != null) {
				this.aClass11_5.method70();
				Class8_Sub1_Sub2_Sub4.anIntArray206 = this.anIntArray228;
			}
			this.anInt954 = 0;
			for (local152 = 0; local152 < 104; local152++) {
				for (@Pc(226) int local226 = 0; local226 < 104; local226++) {
					@Pc(236) int local236 = this.aClass32_1.method345(this.anInt933, local152, local226);
					if (local236 != 0) {
						local236 = local236 >> 14 & 0x7FFF;
						@Pc(248) int local248 = Class23.method260(local236).anInt377;
						if (local248 >= 0) {
							@Pc(252) int local252 = local152;
							@Pc(254) int local254 = local226;
							if (local248 != 22 && local248 != 29 && local248 != 34 && local248 != 36 && local248 != 46 && local248 != 47 && local248 != 48) {
								@Pc(286) int[][] local286 = this.aClass1Array1[this.anInt933].anIntArrayArray1;
								for (@Pc(288) int local288 = 0; local288 < 10; local288++) {
									@Pc(295) int local295 = (int) (Math.random() * 4.0D);
									if (local295 == 0 && local252 > 0 && local252 > local152 - 3 && (local286[local252 - 1][local254] & 0x1280108) == 0) {
										local252--;
									}
									if (local295 == 1 && local252 < 103 && local252 < local152 + 3 && (local286[local252 + 1][local254] & 0x1280180) == 0) {
										local252++;
									}
									if (local295 == 2 && local254 > 0 && local254 > local226 - 3 && (local286[local252][local254 - 1] & 0x1280102) == 0) {
										local254--;
									}
									if (local295 == 3 && local254 < 103 && local254 < local226 + 3 && (local286[local252][local254 + 1] & 0x1280120) == 0) {
										local254++;
									}
								}
							}
							this.aClass8_Sub1_Sub2_Sub1Array6[this.anInt954] = this.aClass8_Sub1_Sub2_Sub1Array10[local248];
							this.anIntArray230[this.anInt954] = local252;
							this.anIntArray231[this.anInt954] = local254;
							this.anInt954++;
						}
					}
				}
			}
		} catch (@Pc(425) RuntimeException local425) {
			signlink.reporterror("59415, " + arg0 + ", " + 2317 + ", " + local425.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "p", descriptor = "(I)V")
	private void method635() {
		try {
			if (aBoolean237 && this.anInt915 == 2 && Class38.anInt615 != this.anInt933) {
				this.method640("Loading - please wait.", null);
				this.anInt915 = 1;
				this.aLong30 = System.currentTimeMillis();
			}
			if (this.anInt915 == 1) {
				@Pc(34) int local34 = this.method636();
				if (local34 != 0 && System.currentTimeMillis() - this.aLong30 > 360000L) {
					signlink.reporterror(this.aString27 + " glcfb " + this.aLong32 + "," + local34 + "," + aBoolean237 + "," + this.aClass3Array1[0] + "," + this.aClass4_Sub1_1.method30() + "," + this.anInt933 + "," + this.anInt1033 + "," + this.anInt1034);
					this.aLong30 = System.currentTimeMillis();
				}
			}
			if (this.anInt915 == 2 && this.anInt933 != this.anInt899) {
				this.anInt899 = this.anInt933;
				this.method634(this.anInt933);
			}
		} catch (@Pc(115) RuntimeException local115) {
			signlink.reporterror("69023, " + 2 + ", " + local115.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "f", descriptor = "(B)I")
	private int method636() {
		try {
			for (@Pc(3) int local3 = 0; local3 < this.aByteArrayArray5.length; local3++) {
				if (this.aByteArrayArray5[local3] == null && this.anIntArray270[local3] != -1) {
					return -1;
				}
				if (this.aByteArrayArray6[local3] == null && this.anIntArray271[local3] != -1) {
					return -2;
				}
			}
			@Pc(39) boolean local39 = true;
			for (@Pc(51) int local51 = 0; local51 < this.aByteArrayArray5.length; local51++) {
				@Pc(58) byte[] local58 = this.aByteArrayArray6[local51];
				if (local58 != null) {
					@Pc(72) int local72 = (this.anIntArray269[local51] >> 8) * 64 - this.anInt924;
					@Pc(84) int local84 = (this.anIntArray269[local51] & 0xFF) * 64 - this.anInt925;
					if (this.aBoolean210) {
						local72 = 10;
						local84 = 10;
					}
					local39 &= Class38.method427(local72, local58, local84);
				}
			}
			if (!local39) {
				return -3;
			} else if (this.aBoolean215) {
				return -4;
			} else {
				this.anInt915 = 2;
				Class38.anInt615 = this.anInt933;
				this.method646();
				this.aClass8_Sub1_Sub3_6.method141(66);
				return 0;
			}
		} catch (@Pc(131) RuntimeException local131) {
			signlink.reporterror("72526, " + 8 + ", " + local131.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "g", descriptor = "(B)V")
	private void method637() {
		try {
			if (this.aByte27 == 0) {
				for (@Pc(11) Class8_Sub1_Sub1_Sub4 local11 = (Class8_Sub1_Sub1_Sub4) this.aClass49_11.method538(); local11 != null; local11 = (Class8_Sub1_Sub1_Sub4) this.aClass49_11.method540((byte) 6)) {
					if (local11.anInt221 != this.anInt933 || anInt983 > local11.anInt218) {
						local11.method543();
					} else if (anInt983 >= local11.anInt217) {
						if (local11.anInt214 > 0) {
							@Pc(41) Class8_Sub1_Sub1_Sub1_Sub1 local41 = this.aClass8_Sub1_Sub1_Sub1_Sub1Array1[local11.anInt214 - 1];
							if (local41 != null && local41.anInt716 >= 0 && local41.anInt716 < 13312 && local41.anInt717 >= 0 && local41.anInt717 < 13312) {
								local11.method133(local41.anInt716, this.method680(local41.anInt717, local11.anInt221, local41.anInt716) - local11.anInt210, anInt983, local41.anInt717);
							}
						}
						if (local11.anInt214 < 0) {
							@Pc(86) int local86 = -local11.anInt214 - 1;
							@Pc(92) Class8_Sub1_Sub1_Sub1_Sub2 local92;
							if (local86 == this.anInt987) {
								local92 = aClass8_Sub1_Sub1_Sub1_Sub2_1;
							} else {
								local92 = this.aClass8_Sub1_Sub1_Sub1_Sub2Array1[local86];
							}
							if (local92 != null && local92.anInt716 >= 0 && local92.anInt716 < 13312 && local92.anInt717 >= 0 && local92.anInt717 < 13312) {
								local11.method133(local92.anInt716, this.method680(local92.anInt717, local11.anInt221, local92.anInt716) - local11.anInt210, anInt983, local92.anInt717);
							}
						}
						local11.method134(this.anInt1023);
						this.aClass32_1.method327(this.anInt869, 60, (int) local11.aDouble1, this.anInt933, -1, (int) local11.aDouble2, false, local11, (int) local11.aDouble3, local11.anInt219);
					}
				}
			}
		} catch (@Pc(173) RuntimeException local173) {
			signlink.reporterror("27861, " + 0 + ", " + local173.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "q", descriptor = "(I)V")
	private void method638() {
		try {
			this.aBoolean227 = true;
			try {
				@Pc(6) long local6 = System.currentTimeMillis();
				@Pc(8) int local8 = 0;
				@Pc(10) int local10 = 20;
				while (this.aBoolean199) {
					this.anInt1032++;
					this.method698();
					this.method698();
					this.method589(this.aBoolean202);
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
			this.aBoolean227 = false;
		} catch (@Pc(78) RuntimeException local78) {
			signlink.reporterror("4313, " + -986 + ", " + local78.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "g", descriptor = "(Z)V")
	private void method639() {
		try {
			try {
				if (this.aClass7_1 != null) {
					this.aClass7_1.method48();
				}
			} catch (@Pc(7) Exception local7) {
			}
			this.aClass7_1 = null;
			this.aBoolean214 = false;
			this.anInt1083 = 0;
			this.aString27 = "";
			this.aString28 = "";
			this.method644(919);
			this.aBoolean214 &= true;
			this.aClass32_1.method316();
			for (@Pc(37) int local37 = 0; local37 < 4; local37++) {
				this.aClass1Array1[local37].method1();
			}
			System.gc();
			this.method629(79);
			this.anInt910 = -1;
			this.anInt1058 = -1;
			this.anInt918 = 0;
		} catch (@Pc(63) RuntimeException local63) {
			signlink.reporterror("55062, " + true + ", " + local63.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;)V")
	private void method640(@OriginalArg(0) String arg0, @OriginalArg(2) String arg1) {
		try {
			@Pc(15) int local15;
			if (this.aClass11_5 != null) {
				this.aClass11_5.method70();
				Class8_Sub1_Sub2_Sub4.anIntArray206 = this.anIntArray228;
				local15 = 151;
				if (arg1 != null) {
					local15 -= 7;
				}
				this.aClass8_Sub1_Sub2_Sub3_3.method447(0, 257, arg0, local15);
				this.aClass8_Sub1_Sub2_Sub3_3.method447(16777215, 256, arg0, local15 - 1);
				local15 += 15;
				if (arg1 != null) {
					this.aClass8_Sub1_Sub2_Sub3_3.method447(0, 257, arg1, local15);
					this.aClass8_Sub1_Sub2_Sub3_3.method447(16777215, 256, arg1, local15 - 1);
				}
				this.aClass11_5.method71(4, super.aGraphics2, 4);
			} else if (super.aClass11_2 != null) {
				super.aClass11_2.method70();
				Class8_Sub1_Sub2_Sub4.anIntArray206 = this.anIntArray229;
				local15 = 251;
				Class8_Sub1_Sub2.method550(300, 221, 0, 50, 233);
				Class8_Sub1_Sub2.method551(16777215, 300, 50, 221, 233);
				if (arg1 != null) {
					local15 -= 7;
				}
				this.aClass8_Sub1_Sub2_Sub3_3.method447(0, 383, arg0, local15);
				this.aClass8_Sub1_Sub2_Sub3_3.method447(16777215, 382, arg0, local15 - 1);
				local15 += 15;
				if (arg1 != null) {
					this.aClass8_Sub1_Sub2_Sub3_3.method447(0, 383, arg1, local15);
					this.aClass8_Sub1_Sub2_Sub3_3.method447(16777215, 382, arg1, local15 - 1);
				}
				super.aClass11_2.method71(0, super.aGraphics2, 0);
			}
		} catch (@Pc(168) RuntimeException local168) {
			signlink.reporterror("46872, " + arg0 + ", " + 8389 + ", " + arg1 + ", " + local168.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(II)Z")
	private boolean method641(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			if (arg0 < 0) {
				return false;
			}
			@Pc(8) int local8 = this.anIntArray262[arg0];
			@Pc(12) boolean local12 = true;
			if (local8 >= 2000) {
				local8 -= 2000;
			}
			return local8 == 294;
		} catch (@Pc(24) RuntimeException local24) {
			signlink.reporterror("89009, " + arg0 + ", " + arg1 + ", " + local24.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "r", descriptor = "(I)V")
	private void method642() {
		try {
			this.aClass8_Sub1_Sub2_Sub2_9 = new Class8_Sub1_Sub2_Sub2(this.aClass2_2, "titlebox", 0);
			this.aClass8_Sub1_Sub2_Sub2_10 = new Class8_Sub1_Sub2_Sub2(this.aClass2_2, "titlebutton", 0);
			this.aClass8_Sub1_Sub2_Sub2Array4 = new Class8_Sub1_Sub2_Sub2[12];
			for (@Pc(33) int local33 = 0; local33 < 12; local33++) {
				this.aClass8_Sub1_Sub2_Sub2Array4[local33] = new Class8_Sub1_Sub2_Sub2(this.aClass2_2, "runes", local33);
			}
			this.aClass8_Sub1_Sub2_Sub1_4 = new Class8_Sub1_Sub2_Sub1(128, 265);
			this.aClass8_Sub1_Sub2_Sub1_5 = new Class8_Sub1_Sub2_Sub1(128, 265);
			for (@Pc(66) int local66 = 0; local66 < 33920; local66++) {
				this.aClass8_Sub1_Sub2_Sub1_4.anIntArray41[local66] = this.aClass11_13.anIntArray34[local66];
			}
			for (@Pc(84) int local84 = 0; local84 < 33920; local84++) {
				this.aClass8_Sub1_Sub2_Sub1_5.anIntArray41[local84] = this.aClass11_14.anIntArray34[local84];
			}
			this.anIntArray239 = new int[256];
			for (@Pc(106) int local106 = 0; local106 < 64; local106++) {
				this.anIntArray239[local106] = local106 * 262144;
			}
			for (@Pc(121) int local121 = 0; local121 < 64; local121++) {
				this.anIntArray239[local121 + 64] = local121 * 1024 + 16711680;
			}
			for (@Pc(140) int local140 = 0; local140 < 64; local140++) {
				this.anIntArray239[local140 + 128] = local140 * 4 + 16776960;
			}
			for (@Pc(159) int local159 = 0; local159 < 64; local159++) {
				this.anIntArray239[local159 + 192] = 16777215;
			}
			this.anIntArray240 = new int[256];
			for (@Pc(178) int local178 = 0; local178 < 64; local178++) {
				this.anIntArray240[local178] = local178 * 1024;
			}
			for (@Pc(193) int local193 = 0; local193 < 64; local193++) {
				this.anIntArray240[local193 + 64] = local193 * 4 + 65280;
			}
			for (@Pc(212) int local212 = 0; local212 < 64; local212++) {
				this.anIntArray240[local212 + 128] = local212 * 262144 + 65535;
			}
			for (@Pc(231) int local231 = 0; local231 < 64; local231++) {
				this.anIntArray240[local231 + 192] = 16777215;
			}
			this.anIntArray241 = new int[256];
			for (@Pc(250) int local250 = 0; local250 < 64; local250++) {
				this.anIntArray241[local250] = local250 * 4;
			}
			for (@Pc(265) int local265 = 0; local265 < 64; local265++) {
				this.anIntArray241[local265 + 64] = local265 * 262144 + 255;
			}
			for (@Pc(284) int local284 = 0; local284 < 64; local284++) {
				this.anIntArray241[local284 + 128] = local284 * 1024 + 16711935;
			}
			for (@Pc(303) int local303 = 0; local303 < 64; local303++) {
				this.anIntArray241[local303 + 192] = 16777215;
			}
			this.anIntArray238 = new int[256];
			this.anIntArray251 = new int[32768];
			this.anIntArray252 = new int[32768];
			this.method594(null);
			this.anIntArray224 = new int[32768];
			this.anIntArray225 = new int[32768];
			this.method586("Connecting to fileserver", 10, (byte) 6);
			if (!this.aBoolean199) {
				this.aBoolean220 = true;
				this.aBoolean199 = true;
				this.method585(this, 2);
			}
		} catch (@Pc(360) RuntimeException local360) {
			signlink.reporterror("13191, " + -88 + ", " + local360.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(ILclient!IUVBENCV;I)V")
	private void method643(@OriginalArg(0) int arg0, @OriginalArg(1) Class8_Sub1_Sub3 arg1) {
		try {
			while (true) {
				if (arg1.anInt240 + 10 < arg0 * 8) {
					@Pc(12) int local12 = arg1.method163(830, 11);
					if (local12 != 2047) {
						if (this.aClass8_Sub1_Sub1_Sub1_Sub2Array1[local12] == null) {
							this.aClass8_Sub1_Sub1_Sub1_Sub2Array1[local12] = new Class8_Sub1_Sub1_Sub1_Sub2();
							if (this.aClass8_Sub1_Sub3Array1[local12] != null) {
								this.aClass8_Sub1_Sub1_Sub1_Sub2Array1[local12].method478(this.aClass8_Sub1_Sub3Array1[local12]);
							}
						}
						this.anIntArray236[this.anInt968++] = local12;
						@Pc(58) Class8_Sub1_Sub1_Sub1_Sub2 local58 = this.aClass8_Sub1_Sub1_Sub1_Sub2Array1[local12];
						local58.anInt732 = anInt983;
						@Pc(66) int local66 = arg1.method163(830, 5);
						if (local66 > 15) {
							local66 -= 32;
						}
						@Pc(75) int local75 = arg1.method163(830, 1);
						if (local75 == 1) {
							this.anIntArray237[this.anInt969++] = local12;
						}
						@Pc(94) int local94 = arg1.method163(830, 1);
						@Pc(99) int local99 = arg1.method163(830, 5);
						if (local99 > 15) {
							local99 -= 32;
						}
						local58.method473(aClass8_Sub1_Sub1_Sub1_Sub2_1.anIntArray183[0] + local66, aClass8_Sub1_Sub1_Sub1_Sub2_1.anIntArray184[0] + local99, local94 == 1);
						continue;
					}
				}
				arg1.method164();
				return;
			}
		} catch (@Pc(135) RuntimeException local135) {
			signlink.reporterror("64636, " + arg0 + ", " + arg1 + ", " + 601 + ", " + local135.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "s", descriptor = "(I)V")
	private void method644(@OriginalArg(0) int arg0) {
		try {
			Class23.aClass33_5.method369();
			@Pc(5) boolean local5 = false;
			Class23.aClass33_4.method369();
			Class26.aClass33_8.method369();
			Class19.aClass33_2.method369();
			Class19.aClass33_3.method369();
			Class8_Sub1_Sub1_Sub1_Sub2.aClass33_9.method369();
			Class12.aClass33_1.method369();
		} catch (@Pc(19) RuntimeException local19) {
			signlink.reporterror("63691, " + arg0 + ", " + local19.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "t", descriptor = "(I)V")
	private void method645() {
		try {
			if (this.anInt1070 == 0) {
				this.aStringArray14[0] = "Cancel";
				this.anIntArray262[0] = 1957;
				this.anInt1025 = 1;
				if (this.anInt957 == -1) {
					this.method721(488);
					this.anInt898 = 0;
					this.anInt1015 = 0;
					if (super.anInt840 > 4 && super.anInt841 > 4 && super.anInt840 < 516 && super.anInt841 < 338) {
						if (this.anInt1077 == -1) {
							this.method681(this.anInt979);
						} else {
							this.method675(4, 0, 0, Class24.method269(this.anInt1077), super.anInt841, 4, super.anInt840);
						}
					}
					if (this.anInt898 != this.anInt1035) {
						this.anInt1035 = this.anInt898;
					}
					if (this.anInt1015 != this.anInt888) {
						this.anInt888 = this.anInt1015;
					}
					this.anInt898 = 0;
					this.anInt1015 = 0;
					if (super.anInt840 > 553 && super.anInt841 > 205 && super.anInt840 < 743 && super.anInt841 < 466) {
						if (this.anInt934 != -1) {
							this.method675(553, 1, 0, Class24.method269(this.anInt934), super.anInt841, 205, super.anInt840);
						} else if (this.anIntArray249[this.anInt1060] != -1) {
							this.method675(553, 1, 0, Class24.method269(this.anIntArray249[this.anInt1060]), super.anInt841, 205, super.anInt840);
						}
					}
					if (this.anInt898 != this.anInt1050) {
						this.aBoolean217 = true;
						this.anInt1050 = this.anInt898;
					}
					if (this.anInt1015 != this.anInt885) {
						this.aBoolean217 = true;
						this.anInt885 = this.anInt1015;
					}
					this.anInt898 = 0;
					this.anInt1015 = 0;
					if (super.anInt840 > 17 && super.anInt841 > 357 && super.anInt840 < 496 && super.anInt841 < 453) {
						if (this.anInt973 != -1) {
							this.method675(17, 2, 0, Class24.method269(this.anInt973), super.anInt841, 357, super.anInt840);
						} else if (this.anInt1022 != -1) {
							this.method675(17, 3, 0, Class24.method269(this.anInt1022), super.anInt841, 357, super.anInt840);
						} else if (super.anInt841 < 434 && super.anInt840 < 426 && this.anInt940 == 0) {
							this.method657(super.anInt840 - 17, super.anInt841 - 357);
						}
					}
					if ((this.anInt973 != -1 || this.anInt1022 != -1) && this.anInt898 != this.anInt1066) {
						this.aBoolean191 = true;
						this.anInt1066 = this.anInt898;
					}
					if ((this.anInt973 != -1 || this.anInt1022 != -1) && this.anInt1015 != this.anInt900) {
						this.aBoolean191 = true;
						this.anInt900 = this.anInt1015;
					}
					@Pc(350) boolean local350 = false;
					while (!local350) {
						local350 = true;
						for (@Pc(356) int local356 = 0; local356 < this.anInt1025 - 1; local356++) {
							if (this.anIntArray262[local356] < 1000 && this.anIntArray262[local356 + 1] > 1000) {
								@Pc(377) String local377 = this.aStringArray14[local356];
								this.aStringArray14[local356] = this.aStringArray14[local356 + 1];
								this.aStringArray14[local356 + 1] = local377;
								@Pc(399) int local399 = this.anIntArray262[local356];
								this.anIntArray262[local356] = this.anIntArray262[local356 + 1];
								this.anIntArray262[local356 + 1] = local399;
								@Pc(421) int local421 = this.anIntArray260[local356];
								this.anIntArray260[local356] = this.anIntArray260[local356 + 1];
								this.anIntArray260[local356 + 1] = local421;
								@Pc(443) int local443 = this.anIntArray261[local356];
								this.anIntArray261[local356] = this.anIntArray261[local356 + 1];
								this.anIntArray261[local356 + 1] = local443;
								@Pc(465) int local465 = this.anIntArray263[local356];
								this.anIntArray263[local356] = this.anIntArray263[local356 + 1];
								this.anIntArray263[local356 + 1] = local465;
								local350 = false;
							}
						}
					}
				} else {
					this.anInt898 = 0;
					this.anInt1015 = 0;
					this.method675(0, 0, 0, Class24.method269(this.anInt957), super.anInt841, 0, super.anInt840);
					if (this.anInt898 != this.anInt1035) {
						this.anInt1035 = this.anInt898;
					}
					if (this.anInt1015 != this.anInt888) {
						this.anInt888 = this.anInt1015;
					}
				}
			}
		} catch (@Pc(495) RuntimeException local495) {
			signlink.reporterror("320, " + 9 + ", " + local495.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "u", descriptor = "(I)V")
	private void method646() {
		try {
			@Pc(22) int local22;
			@Pc(35) int local35;
			@Pc(39) int local39;
			@Pc(43) int local43;
			@Pc(91) int local91;
			@Pc(105) int local105;
			@Pc(117) int local117;
			@Pc(176) int local176;
			try {
				this.anInt899 = -1;
				this.aClass49_10.method542();
				this.aClass49_11.method542();
				Class8_Sub1_Sub2_Sub4.method560();
				this.method644(919);
				this.aClass32_1.method316();
				System.gc();
				for (local22 = 0; local22 < 4; local22++) {
					this.aClass1Array1[local22].method1();
				}
				for (local35 = 0; local35 < 4; local35++) {
					for (local39 = 0; local39 < 104; local39++) {
						for (local43 = 0; local43 < 104; local43++) {
							this.aByteArrayArrayArray8[local35][local39][local43] = 0;
						}
					}
				}
				@Pc(77) Class38 local77 = new Class38(this.anIntArrayArrayArray7, this.aByteArrayArrayArray8, 104, 104, false);
				local43 = this.aByteArrayArray5.length;
				this.aClass8_Sub1_Sub3_6.method141(32);
				@Pc(256) int local256;
				@Pc(244) int local244;
				if (!this.aBoolean210) {
					@Pc(122) byte[] local122;
					for (local91 = 0; local91 < local43; local91++) {
						local105 = (this.anIntArray269[local91] >> 8) * 64 - this.anInt924;
						local117 = (this.anIntArray269[local91] & 0xFF) * 64 - this.anInt925;
						local122 = this.aByteArrayArray5[local91];
						if (local122 != null) {
							local77.method417(local122, local117, this.aClass1Array1, (this.anInt1034 - 6) * 8, (this.anInt1033 - 6) * 8, local105);
						}
					}
					for (local105 = 0; local105 < local43; local105++) {
						local117 = (this.anIntArray269[local105] >> 8) * 64 - this.anInt924;
						local176 = (this.anIntArray269[local105] & 0xFF) * 64 - this.anInt925;
						@Pc(181) byte[] local181 = this.aByteArrayArray5[local105];
						if (local181 == null && this.anInt1034 < 800) {
							local77.method411(64, local176, 64, local117);
						}
					}
					anInt1007++;
					if (anInt1007 > 107) {
						anInt1007 = 0;
						this.aClass8_Sub1_Sub3_6.method141(231);
						this.aClass8_Sub1_Sub3_6.method145(13980530);
					}
					this.aClass8_Sub1_Sub3_6.method141(32);
					for (local117 = 0; local117 < local43; local117++) {
						local122 = this.aByteArrayArray6[local117];
						if (local122 != null) {
							local244 = (this.anIntArray269[local117] >> 8) * 64 - this.anInt924;
							local256 = (this.anIntArray269[local117] & 0xFF) * 64 - this.anInt925;
							local77.method419(local256, this.aClass1Array1, this.aClass32_1, local122, local244);
						}
					}
				}
				if (this.aBoolean210) {
					local91 = 0;
					label262: while (true) {
						@Pc(311) int local311;
						@Pc(317) int local317;
						@Pc(323) int local323;
						@Pc(333) int local333;
						@Pc(335) int local335;
						if (local91 >= 4) {
							for (local105 = 0; local105 < 13; local105++) {
								for (local117 = 0; local117 < 13; local117++) {
									local176 = this.anIntArrayArrayArray8[0][local105][local117];
									if (local176 == -1) {
										local77.method411(8, local117 * 8, 8, local105 * 8);
									}
								}
							}
							this.aClass8_Sub1_Sub3_6.method141(32);
							local117 = 0;
							while (true) {
								if (local117 >= 4) {
									break label262;
								}
								for (local176 = 0; local176 < 13; local176++) {
									for (local244 = 0; local244 < 13; local244++) {
										local256 = this.anIntArrayArrayArray8[local117][local176][local244];
										if (local256 != -1) {
											local311 = local256 >> 24 & 0x3;
											local317 = local256 >> 1 & 0x3;
											local323 = local256 >> 14 & 0x3FF;
											local333 = local256 >> 3 & 0x7FF;
											local335 = (local323 / 8 << 8) + local333 / 8;
											for (@Pc(514) int local514 = 0; local514 < this.anIntArray269.length; local514++) {
												if (this.anIntArray269[local514] == local335 && this.aByteArrayArray6[local514] != null) {
													local77.method416(local176 * 8, this.aByteArrayArray6[local514], local244 * 8, (local323 & 0x7) * 8, local117, this.aClass32_1, (local333 & 0x7) * 8, local311, this.aClass1Array1, local317);
													break;
												}
											}
										}
									}
								}
								local117++;
							}
						}
						for (local105 = 0; local105 < 13; local105++) {
							for (local117 = 0; local117 < 13; local117++) {
								@Pc(287) boolean local287 = false;
								local244 = this.anIntArrayArrayArray8[local91][local105][local117];
								if (local244 != -1) {
									local256 = local244 >> 24 & 0x3;
									local311 = local244 >> 1 & 0x3;
									local317 = local244 >> 14 & 0x3FF;
									local323 = local244 >> 3 & 0x7FF;
									local333 = (local317 / 8 << 8) + local323 / 8;
									for (local335 = 0; local335 < this.anIntArray269.length; local335++) {
										if (this.anIntArray269[local335] == local333 && this.aByteArrayArray5[local335] != null) {
											local77.method410(this.aClass1Array1, local117 * 8, (local317 & 0x7) * 8, local311, local91, local256, local105 * 8, this.aByteArrayArray5[local335], anInt1057, (local323 & 0x7) * 8);
											local287 = true;
											break;
										}
									}
								}
								if (!local287) {
									local77.method421(local105 * 8, local117 * 8, local91);
								}
							}
						}
						local91++;
					}
				}
				this.aClass8_Sub1_Sub3_6.method141(32);
				local77.method429(this.aClass1Array1, aBoolean222, this.aClass32_1);
				if (this.aClass11_5 != null) {
					this.aClass11_5.method70();
					Class8_Sub1_Sub2_Sub4.anIntArray206 = this.anIntArray228;
				}
				this.aClass8_Sub1_Sub3_6.method141(32);
				local91 = Class38.anInt610;
				if (local91 > this.anInt933) {
					local91 = this.anInt933;
				}
				if (local91 < this.anInt933 - 1) {
					local91 = this.anInt933 - 1;
				}
				if (aBoolean237) {
					this.aClass32_1.method317(Class38.anInt610);
				} else {
					this.aClass32_1.method317(0);
				}
				for (local105 = 0; local105 < 104; local105++) {
					for (local117 = 0; local117 < 104; local117++) {
						this.method633(local105, local117);
					}
				}
				this.method621();
			} catch (@Pc(663) Exception local663) {
			}
			Class23.aClass33_5.method369();
			if (super.aFrame_Sub1_2 != null) {
				this.aClass8_Sub1_Sub3_6.method141(127);
				this.aClass8_Sub1_Sub3_6.method146(1057001181);
			}
			if (aBoolean237 && signlink.aRandomAccessFile3 != null) {
				local22 = this.aClass4_Sub1_1.method28(0);
				for (local35 = 0; local35 < local22; local35++) {
					local39 = this.aClass4_Sub1_1.method36(local35);
					if ((local39 & 0x79) == 0) {
						Class8_Sub1_Sub1_Sub5.method209(local35);
					}
				}
			}
			System.gc();
			Class8_Sub1_Sub2_Sub4.method561();
			this.aClass4_Sub1_1.method40();
			if (this.anInt1012 == 7) {
				local22 = (this.anInt1033 - 6) / 8 - 1;
				local35 = (this.anInt1033 + 6) / 8 + 1;
				local39 = (this.anInt1034 - 6) / 8 - 1;
				local43 = (this.anInt1034 + 6) / 8 + 1;
				if (this.aBoolean235) {
					local22 = 49;
					local35 = 50;
					local39 = 49;
					local43 = 50;
				}
				for (local91 = local22; local91 <= local35; local91++) {
					for (local105 = local39; local105 <= local43; local105++) {
						if (local91 == local22 || local91 == local35 || local105 == local39 || local105 == local43) {
							local117 = this.aClass4_Sub1_1.method29(0, local91, local105);
							if (local117 != -1) {
								this.aClass4_Sub1_1.method27(local117, 3);
							}
							local176 = this.aClass4_Sub1_1.method29(1, local91, local105);
							if (local176 != -1) {
								this.aClass4_Sub1_1.method27(local176, 3);
							}
						}
					}
				}
			}
		} catch (@Pc(832) RuntimeException local832) {
			signlink.reporterror("99895, " + 7 + ", " + local832.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(ZI)V")
	private void method647(@OriginalArg(1) int arg0) {
		try {
			@Pc(2) Class24 local2 = Class24.method269(arg0);
			for (@Pc(4) int local4 = 0; local4 < local2.anIntArray121.length && local2.anIntArray121[local4] != -1; local4++) {
				@Pc(18) Class24 local18 = Class24.method269(local2.anIntArray121[local4]);
				if (local18.anInt423 == 1) {
					this.method647(local18.anInt394);
				}
				local18.anInt397 = 0;
				local18.anInt412 = 0;
			}
		} catch (@Pc(43) RuntimeException local43) {
			signlink.reporterror("88340, " + false + ", " + arg0 + ", " + local43.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(ILclient!IUVBENCV;I)V")
	private void method648(@OriginalArg(0) int arg0, @OriginalArg(1) Class8_Sub1_Sub3 arg1) {
		try {
			@Pc(5) int local5 = arg0 + 0;
			for (@Pc(7) int local7 = 0; local7 < this.anInt969; local7++) {
				@Pc(14) int local14 = this.anIntArray237[local7];
				@Pc(19) Class8_Sub1_Sub1_Sub1_Sub1 local19 = this.aClass8_Sub1_Sub1_Sub1_Sub1Array1[local14];
				@Pc(22) int local22 = arg1.method152();
				@Pc(29) int local29;
				@Pc(34) int local34;
				if ((local22 & 0x8) != 0) {
					local29 = arg1.method152();
					local34 = arg1.method171(this.anInt906);
					local19.method475(anInt983, local34, local29);
					local19.anInt719 = anInt983 + 300;
					local19.anInt720 = arg1.method171(this.anInt906);
					local19.anInt721 = arg1.method152();
				}
				if ((local22 & 0x10) != 0) {
					local29 = arg1.method178();
					if (local29 == 65535) {
						local29 = -1;
					}
					local34 = arg1.method169();
					if (local29 == local19.anInt711 && local29 != -1) {
						@Pc(84) int local84 = Class46.aClass46Array1[local29].anInt767;
						if (local84 == 1) {
							local19.anInt712 = 0;
							local19.anInt713 = 0;
							local19.anInt714 = local34;
							local19.anInt715 = 0;
						}
						if (local84 == 2) {
							local19.anInt715 = 0;
						}
					} else if (local29 == -1 || local19.anInt711 == -1 || Class46.aClass46Array1[local29].anInt761 >= Class46.aClass46Array1[local19.anInt711].anInt761) {
						local19.anInt711 = local29;
						local19.anInt712 = 0;
						local19.anInt713 = 0;
						local19.anInt714 = local34;
						local19.anInt715 = 0;
						local19.anInt709 = local19.anInt695;
					}
				}
				if ((local22 & 0x40) != 0) {
					local19.anInt701 = arg1.method178();
					local29 = arg1.method185();
					local19.anInt705 = local29 >> 16;
					local19.anInt704 = anInt983 + (local29 & 0xFFFF);
					local19.anInt702 = 0;
					local19.anInt703 = 0;
					if (local19.anInt704 > anInt983) {
						local19.anInt702 = -1;
					}
					if (local19.anInt701 == 65535) {
						local19.anInt701 = -1;
					}
				}
				if ((local22 & 0x20) != 0) {
					local19.anInt693 = arg1.method154();
					local19.anInt694 = arg1.method154();
				}
				if ((local22 & 0x1) != 0) {
					local19.aString14 = arg1.method159();
					local19.anInt724 = 100;
				}
				if ((local22 & 0x80) != 0) {
					local19.aClass26_1 = Class26.method290(arg1.method178());
					local19.anInt726 = local19.aClass26_1.aByte11;
					local19.anInt708 = local19.aClass26_1.anInt482;
					local19.anInt696 = local19.aClass26_1.anInt468;
					local19.anInt697 = local19.aClass26_1.anInt466;
					local19.anInt698 = local19.aClass26_1.anInt472;
					local19.anInt699 = local19.aClass26_1.anInt470;
					local19.anInt706 = local19.aClass26_1.anInt467;
				}
				if ((local22 & 0x4) != 0) {
					local19.anInt722 = arg1.method180(this.anInt923);
					if (local19.anInt722 == 65535) {
						local19.anInt722 = -1;
					}
				}
				if ((local22 & 0x2) != 0) {
					local29 = arg1.method152();
					local34 = arg1.method152();
					local19.method475(anInt983, local34, local29);
					local19.anInt719 = anInt983 + 300;
					local19.anInt720 = arg1.method171(this.anInt906);
					local19.anInt721 = arg1.method152();
				}
			}
		} catch (@Pc(311) RuntimeException local311) {
			signlink.reporterror("72648, " + arg0 + ", " + arg1 + ", " + 0 + ", " + local311.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IZII)Z")
	private boolean method649(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		try {
			@Pc(7) int local7 = arg0 >> 14 & 0x7FFF;
			@Pc(16) int local16 = this.aClass32_1.method346(this.anInt933, arg1, arg2, arg0);
			if (local16 == -1) {
				return false;
			}
			@Pc(25) int local25 = local16 & 0x1F;
			@Pc(31) int local31 = local16 >> 6 & 0x3;
			if (local25 == 10 || local25 == 11 || local25 == 22) {
				@Pc(43) Class23 local43 = Class23.method260(local7);
				@Pc(51) int local51;
				@Pc(54) int local54;
				if (local31 == 0 || local31 == 2) {
					local51 = local43.anInt374;
					local54 = local43.anInt389;
				} else {
					local51 = local43.anInt389;
					local54 = local43.anInt374;
				}
				@Pc(65) int local65 = local43.anInt383;
				if (local31 != 0) {
					local65 = (local65 << local31 & 0xF) + (local65 >> 4 - local31);
				}
				this.method600(arg2, 2, true, 0, aClass8_Sub1_Sub1_Sub1_Sub2_1.anIntArray183[0], local54, this.anInt928, 0, local65, arg1, aClass8_Sub1_Sub1_Sub1_Sub2_1.anIntArray184[0], local51);
			} else {
				this.method600(arg2, 2, true, local25 + 1, aClass8_Sub1_Sub1_Sub1_Sub2_1.anIntArray183[0], 0, this.anInt928, local31, 0, arg1, aClass8_Sub1_Sub1_Sub1_Sub2_1.anIntArray184[0], 0);
			}
			this.anInt1018 = super.anInt846;
			this.anInt1019 = super.anInt847;
			this.anInt1021 = 2;
			this.anInt1020 = 0;
			return true;
		} catch (@Pc(149) RuntimeException local149) {
			signlink.reporterror("68468, " + arg0 + ", " + false + ", " + arg1 + ", " + arg2 + ", " + local149.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "h", descriptor = "(B)I")
	private int method650(@OriginalArg(0) byte arg0) {
		try {
			@Pc(3) int local3 = 3;
			if (arg0 != this.aByte32) {
				this.anInt897 = this.aClass18_2.method135();
			}
			if (this.anInt880 < 310) {
				@Pc(21) int local21 = this.anInt877 >> 7;
				@Pc(26) int local26 = this.anInt879 >> 7;
				@Pc(31) int local31 = aClass8_Sub1_Sub1_Sub1_Sub2_1.anInt716 >> 7;
				@Pc(36) int local36 = aClass8_Sub1_Sub1_Sub1_Sub2_1.anInt717 >> 7;
				if ((this.aByteArrayArrayArray8[this.anInt933][local21][local26] & 0x4) != 0) {
					local3 = this.anInt933;
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
						if ((this.aByteArrayArrayArray8[this.anInt933][local21][local26] & 0x4) != 0) {
							local3 = this.anInt933;
						}
						local88 += local86;
						if (local88 >= 65536) {
							local88 -= 65536;
							if (local26 < local36) {
								local26++;
							} else if (local26 > local36) {
								local26--;
							}
							if ((this.aByteArrayArrayArray8[this.anInt933][local21][local26] & 0x4) != 0) {
								local3 = this.anInt933;
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
						if ((this.aByteArrayArrayArray8[this.anInt933][local21][local26] & 0x4) != 0) {
							local3 = this.anInt933;
						}
						local88 += local86;
						if (local88 >= 65536) {
							local88 -= 65536;
							if (local21 < local31) {
								local21++;
							} else if (local21 > local31) {
								local21--;
							}
							if ((this.aByteArrayArrayArray8[this.anInt933][local21][local26] & 0x4) != 0) {
								local3 = this.anInt933;
							}
						}
					}
				}
			}
			if ((this.aByteArrayArrayArray8[this.anInt933][aClass8_Sub1_Sub1_Sub1_Sub2_1.anInt716 >> 7][aClass8_Sub1_Sub1_Sub1_Sub2_1.anInt717 >> 7] & 0x4) != 0) {
				local3 = this.anInt933;
			}
			return local3;
		} catch (@Pc(254) RuntimeException local254) {
			signlink.reporterror("98841, " + arg0 + ", " + local254.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "i", descriptor = "(B)I")
	private int method651() {
		try {
			@Pc(15) int local15 = this.method680(this.anInt879, this.anInt933, this.anInt877);
			return local15 - this.anInt878 >= 800 || (this.aByteArrayArrayArray8[this.anInt933][this.anInt877 >> 7][this.anInt879 >> 7] & 0x4) == 0 ? 3 : this.anInt933;
		} catch (@Pc(45) RuntimeException local45) {
			signlink.reporterror("66078, " + 125 + ", " + local45.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "v", descriptor = "(I)V")
	private void method652() {
		try {
			this.aBoolean196 = true;
			for (@Pc(11) int local11 = 0; local11 < 7; local11++) {
				this.anIntArray213[local11] = -1;
				for (@Pc(20) int local20 = 0; local20 < Class44.anInt751; local20++) {
					if (!Class44.aClass44Array1[local20].aBoolean165 && Class44.aClass44Array1[local20].anInt752 == local11 + (this.aBoolean216 ? 0 : 7)) {
						this.anIntArray213[local11] = local20;
						break;
					}
				}
			}
		} catch (@Pc(57) RuntimeException local57) {
			signlink.reporterror("89747, " + 535 + ", " + local57.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "j", descriptor = "(B)V")
	private void method653(@OriginalArg(0) byte arg0) {
		try {
			this.method661();
			@Pc(9) int local9;
			if (arg0 != -85) {
				for (local9 = 1; local9 > 0; local9++) {
				}
			}
			if (this.anInt1021 == 1) {
				this.aClass8_Sub1_Sub2_Sub1Array5[this.anInt1020 / 100].method117(this.anInt1019 - 8 - 4, this.anInt1018 - 8 - 4);
			}
			if (this.anInt1021 == 2) {
				this.aClass8_Sub1_Sub2_Sub1Array5[this.anInt1020 / 100 + 4].method117(this.anInt1019 - 8 - 4, this.anInt1018 - 8 - 4);
				anInt860++;
				if (anInt860 > 1352) {
					anInt860 = 0;
					this.aClass8_Sub1_Sub3_6.method141(145);
					this.aClass8_Sub1_Sub3_6.method142(0);
					local9 = this.aClass8_Sub1_Sub3_6.anInt239;
					this.aClass8_Sub1_Sub3_6.method143((int) (Math.random() * 65536.0D));
					this.aClass8_Sub1_Sub3_6.method143(19362);
					if ((int) (Math.random() * 2.0D) == 0) {
						this.aClass8_Sub1_Sub3_6.method143(38938);
					}
					this.aClass8_Sub1_Sub3_6.method143((int) (Math.random() * 65536.0D));
					this.aClass8_Sub1_Sub3_6.method143((int) (Math.random() * 65536.0D));
					if ((int) (Math.random() * 2.0D) == 0) {
						this.aClass8_Sub1_Sub3_6.method143(3521);
					}
					this.aClass8_Sub1_Sub3_6.method142((int) (Math.random() * 256.0D));
					this.aClass8_Sub1_Sub3_6.method142(120);
					this.aClass8_Sub1_Sub3_6.method143(14321);
					this.aClass8_Sub1_Sub3_6.method142((int) (Math.random() * 256.0D));
					this.aClass8_Sub1_Sub3_6.method151(this.aClass8_Sub1_Sub3_6.anInt239 - local9);
				}
			}
			if (this.anInt905 != -1) {
				this.method625(this.anInt905, this.anInt1023);
				this.method668(0, Class24.method269(this.anInt905), 0, 0);
			}
			if (this.anInt1077 != -1) {
				this.method625(this.anInt1077, this.anInt1023);
				this.method668(0, Class24.method269(this.anInt1077), 0, 0);
			}
			this.method658();
			if (!this.aBoolean208) {
				this.method645();
				this.method632();
			} else if (this.anInt892 == 0) {
				this.method610();
			}
			if (this.anInt1001 == 1) {
				this.aClass8_Sub1_Sub2_Sub1_10.method117(296, 472);
			}
			@Pc(242) int local242;
			@Pc(275) int local275;
			if (aBoolean198) {
				@Pc(240) byte local240 = 20;
				local242 = 16776960;
				if (super.anInt835 < 30 && aBoolean237) {
					local242 = 16711680;
				}
				if (super.anInt835 < 20 && !aBoolean237) {
					local242 = 16711680;
				}
				this.aClass8_Sub1_Sub2_Sub3_3.method446(local242, "Fps:" + super.anInt835, 20, this.anInt953);
				local275 = local240 + 15;
				@Pc(277) Runtime local277 = Runtime.getRuntime();
				@Pc(286) int local286 = (int) ((local277.totalMemory() - local277.freeMemory()) / 1024L);
				if (local286 > 33554432 && aBoolean237) {
				}
				if (local286 > 67108864 && !aBoolean237) {
				}
				this.aClass8_Sub1_Sub2_Sub3_3.method446(16776960, "Mem:" + local286 + "k", 35, this.anInt953);
				local275 += 15;
			}
			if (this.anInt871 != 0) {
				local9 = this.anInt871 / 50;
				local275 = local9 / 60;
				local9 %= 60;
				if (local9 < 10) {
					this.aClass8_Sub1_Sub2_Sub3_3.method451(16776960, "System update in: " + local275 + ":0" + local9, 4, 329);
				} else {
					this.aClass8_Sub1_Sub2_Sub3_3.method451(16776960, "System update in: " + local275 + ":" + local9, 4, 329);
				}
				anInt1002++;
				if (anInt1002 > 1517) {
					anInt1002 = 0;
					this.aClass8_Sub1_Sub3_6.method141(200);
					this.aClass8_Sub1_Sub3_6.method142(0);
					local242 = this.aClass8_Sub1_Sub3_6.anInt239;
					if ((int) (Math.random() * 2.0D) == 0) {
						this.aClass8_Sub1_Sub3_6.method142(174);
					}
					this.aClass8_Sub1_Sub3_6.method142((int) (Math.random() * 256.0D));
					this.aClass8_Sub1_Sub3_6.method142(151);
					this.aClass8_Sub1_Sub3_6.method143(48341);
					this.aClass8_Sub1_Sub3_6.method142((int) (Math.random() * 256.0D));
					this.aClass8_Sub1_Sub3_6.method142((int) (Math.random() * 256.0D));
					if ((int) (Math.random() * 2.0D) == 0) {
						this.aClass8_Sub1_Sub3_6.method143(57937);
					}
					this.aClass8_Sub1_Sub3_6.method143((int) (Math.random() * 65536.0D));
					this.aClass8_Sub1_Sub3_6.method142(188);
					this.aClass8_Sub1_Sub3_6.method142(175);
					this.aClass8_Sub1_Sub3_6.method151(this.aClass8_Sub1_Sub3_6.anInt239 - local242);
					return;
				}
			}
		} catch (@Pc(472) RuntimeException local472) {
			signlink.reporterror("39901, " + arg0 + ", " + local472.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ZILclient!DBHOKPMQ;)V")
	private void method654(@OriginalArg(1) int arg0, @OriginalArg(2) Class8_Sub1_Sub1_Sub1 arg1) {
		try {
			this.method655(arg1.anInt716, arg1.anInt717, arg0);
		} catch (@Pc(15) RuntimeException local15) {
			signlink.reporterror("29313, " + false + ", " + arg0 + ", " + arg1 + ", " + local15.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIII)V")
	private void method655(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		try {
			if (arg0 >= 128 && arg1 >= 128 && arg0 <= 13056 && arg1 <= 13056) {
				@Pc(28) int local28 = this.method680(arg1, this.anInt933, arg0) - arg2;
				@Pc(33) int local33 = arg0 - this.anInt877;
				@Pc(38) int local38 = local28 - this.anInt878;
				@Pc(43) int local43 = arg1 - this.anInt879;
				@Pc(48) int local48 = Class8_Sub1_Sub1_Sub5.anIntArray90[this.anInt880];
				@Pc(53) int local53 = Class8_Sub1_Sub1_Sub5.anIntArray91[this.anInt880];
				@Pc(58) int local58 = Class8_Sub1_Sub1_Sub5.anIntArray90[this.anInt881];
				@Pc(63) int local63 = Class8_Sub1_Sub1_Sub5.anIntArray91[this.anInt881];
				@Pc(77) int local77 = local43 * local58 + local33 * local63 >> 16;
				@Pc(87) int local87 = local43 * local63 - local33 * local58 >> 16;
				@Pc(89) int local89 = local77;
				@Pc(99) int local99 = local38 * local53 - local87 * local48 >> 16;
				@Pc(109) int local109 = local38 * local48 + local87 * local53 >> 16;
				if (local109 >= 50) {
					this.anInt958 = Class8_Sub1_Sub2_Sub4.anInt819 + (local89 << 9) / local109;
					this.anInt959 = Class8_Sub1_Sub2_Sub4.anInt820 + (local99 << 9) / local109;
				} else {
					this.anInt958 = -1;
					this.anInt959 = -1;
				}
			} else {
				this.anInt958 = -1;
				this.anInt959 = -1;
			}
		} catch (@Pc(141) RuntimeException local141) {
			signlink.reporterror("1838, " + arg0 + ", " + arg1 + ", " + -17285 + ", " + arg2 + ", " + local141.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/String;IZIILjava/lang/String;)Lclient!AWEEREDT;")
	private Class2 method656(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) String arg4) {
		try {
			@Pc(3) byte[] local3 = null;
			@Pc(5) int local5 = 5;
			try {
				if (this.aClass3Array1[0] != null) {
					local3 = this.aClass3Array1[0].method15(arg3, (byte) 1);
				}
			} catch (@Pc(20) Exception local20) {
			}
			@Pc(34) int local34;
			if (local3 != null) {
				this.aCRC32_2.reset();
				this.aCRC32_2.update(local3);
				local34 = (int) this.aCRC32_2.getValue();
				if (local34 != arg1) {
					local3 = null;
				}
			}
			if (local3 != null) {
				return new Class2(779, local3);
			}
			local34 = 0;
			while (local3 == null) {
				@Pc(55) String local55 = "Unknown error";
				this.method586("Requesting " + arg4, arg2, (byte) 6);
				@Pc(70) int local70;
				try {
					local70 = 0;
					@Pc(81) DataInputStream local81 = this.method700(arg0 + arg1);
					@Pc(84) byte[] local84 = new byte[6];
					local81.readFully(local84, 0, 6);
					@Pc(95) Class8_Sub1_Sub3 local95 = new Class8_Sub1_Sub3(local84, 713);
					local95.anInt239 = 3;
					@Pc(103) int local103 = local95.method156() + 6;
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
							this.method586("Loading " + arg4 + " - " + local168 + "%", arg2, (byte) 6);
						}
						local70 = local168;
					}
					local81.close();
					try {
						if (this.aClass3Array1[0] != null) {
							this.aClass3Array1[0].method16(local3, arg3, local3.length);
						}
					} catch (@Pc(213) Exception local213) {
						this.aClass3Array1[0] = null;
					}
					if (local3 != null) {
						this.aCRC32_2.reset();
						this.aCRC32_2.update(local3);
						local128 = (int) this.aCRC32_2.getValue();
						if (local128 != arg1) {
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
							this.method586("Game updated - please reload page", arg2, (byte) 6);
							local70 = 10;
						} else {
							this.method586(local55 + " - Retrying in " + local70, arg2, (byte) 6);
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
					this.aBoolean225 = !this.aBoolean225;
				}
			}
			@Pc(349) Class2 local349 = new Class2(779, local3);
			this.aBoolean214 &= true;
			return local349;
		} catch (@Pc(358) RuntimeException local358) {
			signlink.reporterror("85287, " + arg0 + ", " + arg1 + ", " + true + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local358.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(III)V")
	private void method657(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(3) int local3 = 0;
			for (@Pc(10) int local10 = 0; local10 < 100; local10++) {
				if (this.aStringArray13[local10] != null) {
					@Pc(22) int local22 = this.anIntArray264[local10];
					@Pc(33) int local33 = this.anInt914 + 70 + 4 - local3 * 14;
					if (local33 < -20) {
						break;
					}
					@Pc(41) String local41 = this.aStringArray12[local10];
					if (local41 != null && local41.startsWith("@cr1@")) {
						local41 = local41.substring(5);
					}
					if (local41 != null && local41.startsWith("@cr2@")) {
						local41 = local41.substring(5);
					}
					if (local22 == 0) {
						local3++;
					}
					if ((local22 == 1 || local22 == 2) && (local22 == 1 || this.anInt988 == 0 || this.anInt988 == 1 && this.method713(local41))) {
						if (arg1 > local33 - 14 && arg1 <= local33 && !local41.equals(aClass8_Sub1_Sub1_Sub1_Sub2_1.aString15)) {
							if (this.anInt943 >= 1) {
								this.aStringArray14[this.anInt1025] = "Report abuse @whi@" + local41;
								this.anIntArray262[this.anInt1025] = 702;
								this.anInt1025++;
							}
							this.aStringArray14[this.anInt1025] = "Add ignore @whi@" + local41;
							this.anIntArray262[this.anInt1025] = 38;
							this.anInt1025++;
							this.aStringArray14[this.anInt1025] = "Add friend @whi@" + local41;
							this.anIntArray262[this.anInt1025] = 294;
							this.anInt1025++;
						}
						local3++;
					}
					if ((local22 == 3 || local22 == 7) && this.anInt858 == 0 && (local22 == 7 || this.anInt1016 == 0 || this.anInt1016 == 1 && this.method713(local41))) {
						if (arg1 > local33 - 14 && arg1 <= local33) {
							if (this.anInt943 >= 1) {
								this.aStringArray14[this.anInt1025] = "Report abuse @whi@" + local41;
								this.anIntArray262[this.anInt1025] = 702;
								this.anInt1025++;
							}
							this.aStringArray14[this.anInt1025] = "Add ignore @whi@" + local41;
							this.anIntArray262[this.anInt1025] = 38;
							this.anInt1025++;
							this.aStringArray14[this.anInt1025] = "Add friend @whi@" + local41;
							this.anIntArray262[this.anInt1025] = 294;
							this.anInt1025++;
						}
						local3++;
					}
					if (local22 == 4 && (this.anInt976 == 0 || this.anInt976 == 1 && this.method713(local41))) {
						if (arg1 > local33 - 14 && arg1 <= local33) {
							this.aStringArray14[this.anInt1025] = "Accept trade @whi@" + local41;
							this.anIntArray262[this.anInt1025] = 899;
							this.anInt1025++;
						}
						local3++;
					}
					if ((local22 == 5 || local22 == 6) && this.anInt858 == 0 && this.anInt1016 < 2) {
						local3++;
					}
					if (local22 == 8 && (this.anInt976 == 0 || this.anInt976 == 1 && this.method713(local41))) {
						if (arg1 > local33 - 14 && arg1 <= local33) {
							this.aStringArray14[this.anInt1025] = "Accept challenge @whi@" + local41;
							this.anIntArray262[this.anInt1025] = 108;
							this.anInt1025++;
						}
						local3++;
					}
				}
			}
		} catch (@Pc(406) RuntimeException local406) {
			signlink.reporterror("46529, " + arg0 + ", " + arg1 + ", " + -22 + ", " + local406.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "h", descriptor = "(Z)V")
	private void method658() {
		try {
			this.anInt1043 = 0;
			@Pc(19) int local19 = (aClass8_Sub1_Sub1_Sub1_Sub2_1.anInt716 >> 7) + this.anInt924;
			@Pc(27) int local27 = (aClass8_Sub1_Sub1_Sub1_Sub2_1.anInt717 >> 7) + this.anInt925;
			if (local19 >= 3053 && local19 <= 3156 && local27 >= 3056 && local27 <= 3136) {
				this.anInt1043 = 1;
			}
			if (local19 >= 3072 && local19 <= 3118 && local27 >= 9492 && local27 <= 9535) {
				this.anInt1043 = 1;
			}
			if (this.anInt1043 == 1 && local19 >= 3139 && local19 <= 3199 && local27 >= 3008 && local27 <= 3062) {
				this.anInt1043 = 0;
			}
		} catch (@Pc(78) RuntimeException local78) {
			signlink.reporterror("45625, " + true + ", " + local78.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(BI)V")
	private void method659(@OriginalArg(1) int arg0) {
		try {
			if (arg0 >= 0) {
				@Pc(19) int local19 = this.anIntArray260[arg0];
				@Pc(24) int local24 = this.anIntArray261[arg0];
				@Pc(29) int local29 = this.anIntArray262[arg0];
				@Pc(34) int local34 = this.anIntArray263[arg0];
				if (local29 >= 2000) {
					local29 -= 2000;
				}
				if (this.anInt940 != 0 && local29 != 1957) {
					this.anInt940 = 0;
					this.aBoolean191 = true;
				}
				@Pc(58) Class8_Sub1_Sub1_Sub1_Sub2 local58;
				if (local29 == 618) {
					local58 = this.aClass8_Sub1_Sub1_Sub1_Sub2Array1[local34];
					if (local58 != null) {
						this.method600(local58.anIntArray184[0], 2, false, 0, aClass8_Sub1_Sub1_Sub1_Sub2_1.anIntArray183[0], 1, this.anInt928, 0, 0, local58.anIntArray183[0], aClass8_Sub1_Sub1_Sub1_Sub2_1.anIntArray184[0], 1);
						this.anInt1018 = super.anInt846;
						this.anInt1019 = super.anInt847;
						this.anInt1021 = 2;
						this.anInt1020 = 0;
						this.aClass8_Sub1_Sub3_6.method141(136);
						this.aClass8_Sub1_Sub3_6.method175(local34);
						this.aClass8_Sub1_Sub3_6.method143(this.anInt866);
					}
				}
				if (local29 == 584 && this.method649(local34, local19, local24)) {
					this.aClass8_Sub1_Sub3_6.method141(86);
					this.aClass8_Sub1_Sub3_6.method177(local34 >> 14 & 0x7FFF, this.anInt897);
					this.aClass8_Sub1_Sub3_6.method143(local24 + this.anInt925);
					this.aClass8_Sub1_Sub3_6.method175(local19 + this.anInt924);
					this.aClass8_Sub1_Sub3_6.method176(this.anInt866);
				}
				@Pc(188) boolean local188;
				if (local29 == 450) {
					local188 = this.method600(local24, 2, false, 0, aClass8_Sub1_Sub1_Sub1_Sub2_1.anIntArray183[0], 0, this.anInt928, 0, 0, local19, aClass8_Sub1_Sub1_Sub1_Sub2_1.anIntArray184[0], 0);
					if (!local188) {
						this.method600(local24, 2, false, 0, aClass8_Sub1_Sub1_Sub1_Sub2_1.anIntArray183[0], 1, this.anInt928, 0, 0, local19, aClass8_Sub1_Sub1_Sub1_Sub2_1.anIntArray184[0], 1);
					}
					this.anInt1018 = super.anInt846;
					this.anInt1019 = super.anInt847;
					this.anInt1021 = 2;
					this.anInt1020 = 0;
					this.aClass8_Sub1_Sub3_6.method141(201);
					this.aClass8_Sub1_Sub3_6.method176(local19 + this.anInt924);
					this.aClass8_Sub1_Sub3_6.method176(this.anInt964);
					this.aClass8_Sub1_Sub3_6.method176(this.anInt962);
					this.aClass8_Sub1_Sub3_6.method143(local34);
					this.aClass8_Sub1_Sub3_6.method177(this.anInt963, this.anInt897);
					this.aClass8_Sub1_Sub3_6.method176(local24 + this.anInt925);
				}
				@Pc(285) int local285;
				@Pc(302) String local302;
				@Pc(306) int local306;
				@Pc(281) String local281;
				if (local29 == 899 || local29 == 108) {
					local281 = this.aStringArray14[arg0];
					local285 = local281.indexOf("@whi@");
					if (local285 != -1) {
						local281 = local281.substring(local285 + 5).trim();
						local302 = Class36.method385(839, Class36.method382((byte) 3, Class36.method381(local281)));
						@Pc(304) boolean local304 = false;
						for (local306 = 0; local306 < this.anInt968; local306++) {
							@Pc(316) Class8_Sub1_Sub1_Sub1_Sub2 local316 = this.aClass8_Sub1_Sub1_Sub1_Sub2Array1[this.anIntArray236[local306]];
							if (local316 != null && local316.aString15 != null && local316.aString15.equalsIgnoreCase(local302)) {
								this.method600(local316.anIntArray184[0], 2, false, 0, aClass8_Sub1_Sub1_Sub1_Sub2_1.anIntArray183[0], 1, this.anInt928, 0, 0, local316.anIntArray183[0], aClass8_Sub1_Sub1_Sub1_Sub2_1.anIntArray184[0], 1);
								if (local29 == 899) {
									this.aClass8_Sub1_Sub3_6.method141(132);
									this.aClass8_Sub1_Sub3_6.method176(this.anIntArray236[local306]);
								}
								if (local29 == 108) {
									anInt913 += local34;
									if (anInt913 >= 71) {
										this.aClass8_Sub1_Sub3_6.method141(149);
										this.aClass8_Sub1_Sub3_6.method143(42042);
										anInt913 = 0;
									}
									this.aClass8_Sub1_Sub3_6.method141(206);
									this.aClass8_Sub1_Sub3_6.method143(this.anIntArray236[local306]);
								}
								local304 = true;
								break;
							}
						}
						if (!local304) {
							this.method694(0, "Unable to find " + local302, "");
						}
					}
				}
				if (local29 == 321) {
					local188 = this.method600(local24, 2, false, 0, aClass8_Sub1_Sub1_Sub1_Sub2_1.anIntArray183[0], 0, this.anInt928, 0, 0, local19, aClass8_Sub1_Sub1_Sub1_Sub2_1.anIntArray184[0], 0);
					if (!local188) {
						this.method600(local24, 2, false, 0, aClass8_Sub1_Sub1_Sub1_Sub2_1.anIntArray183[0], 1, this.anInt928, 0, 0, local19, aClass8_Sub1_Sub1_Sub1_Sub2_1.anIntArray184[0], 1);
					}
					this.anInt1018 = super.anInt846;
					this.anInt1019 = super.anInt847;
					this.anInt1021 = 2;
					this.anInt1020 = 0;
					this.aClass8_Sub1_Sub3_6.method141(154);
					this.aClass8_Sub1_Sub3_6.method143(local24 + this.anInt925);
					this.aClass8_Sub1_Sub3_6.method176(local34);
					this.aClass8_Sub1_Sub3_6.method176(local19 + this.anInt924);
				}
				if (local29 == 898) {
					this.aClass8_Sub1_Sub3_6.method141(94);
					this.aClass8_Sub1_Sub3_6.method177(local34, this.anInt897);
					this.aClass8_Sub1_Sub3_6.method177(local19, this.anInt897);
					this.aClass8_Sub1_Sub3_6.method175(local24);
					this.anInt1027 = 0;
					this.anInt1028 = local24;
					this.anInt1029 = local19;
					this.anInt1030 = 2;
					if (Class24.method269(local24).anInt411 == this.anInt1077) {
						this.anInt1030 = 1;
					}
					if (Class24.method269(local24).anInt411 == this.anInt973) {
						this.anInt1030 = 3;
					}
				}
				if (local29 == 665) {
					local58 = this.aClass8_Sub1_Sub1_Sub1_Sub2Array1[local34];
					if (local58 != null) {
						this.method600(local58.anIntArray184[0], 2, false, 0, aClass8_Sub1_Sub1_Sub1_Sub2_1.anIntArray183[0], 1, this.anInt928, 0, 0, local58.anIntArray183[0], aClass8_Sub1_Sub1_Sub1_Sub2_1.anIntArray184[0], 1);
						this.anInt1018 = super.anInt846;
						this.anInt1019 = super.anInt847;
						this.anInt1021 = 2;
						this.anInt1020 = 0;
						anInt913 += local34;
						if (anInt913 >= 71) {
							this.aClass8_Sub1_Sub3_6.method141(149);
							this.aClass8_Sub1_Sub3_6.method143(42042);
							anInt913 = 0;
						}
						this.aClass8_Sub1_Sub3_6.method141(206);
						this.aClass8_Sub1_Sub3_6.method143(local34);
					}
				}
				if (local29 == 386) {
					this.method649(local34, local19, local24);
					this.aClass8_Sub1_Sub3_6.method141(229);
					this.aClass8_Sub1_Sub3_6.method176(local19 + this.anInt924);
					this.aClass8_Sub1_Sub3_6.method176(local24 + this.anInt925);
					this.aClass8_Sub1_Sub3_6.method176(local34 >> 14 & 0x7FFF);
				}
				@Pc(696) Class8_Sub1_Sub1_Sub1_Sub1 local696;
				if (local29 == 845) {
					local696 = this.aClass8_Sub1_Sub1_Sub1_Sub1Array1[local34];
					if (local696 != null) {
						this.method600(local696.anIntArray184[0], 2, false, 0, aClass8_Sub1_Sub1_Sub1_Sub2_1.anIntArray183[0], 1, this.anInt928, 0, 0, local696.anIntArray183[0], aClass8_Sub1_Sub1_Sub1_Sub2_1.anIntArray184[0], 1);
						this.anInt1018 = super.anInt846;
						this.anInt1019 = super.anInt847;
						this.anInt1021 = 2;
						this.anInt1020 = 0;
						this.aClass8_Sub1_Sub3_6.method141(155);
						this.aClass8_Sub1_Sub3_6.method176(local34);
					}
				}
				if (local29 == 42) {
					local58 = this.aClass8_Sub1_Sub1_Sub1_Sub2Array1[local34];
					if (local58 != null) {
						this.method600(local58.anIntArray184[0], 2, false, 0, aClass8_Sub1_Sub1_Sub1_Sub2_1.anIntArray183[0], 1, this.anInt928, 0, 0, local58.anIntArray183[0], aClass8_Sub1_Sub1_Sub1_Sub2_1.anIntArray184[0], 1);
						this.anInt1018 = super.anInt846;
						this.anInt1019 = super.anInt847;
						this.anInt1021 = 2;
						this.anInt1020 = 0;
						this.aClass8_Sub1_Sub3_6.method141(198);
						this.aClass8_Sub1_Sub3_6.method175(local34);
					}
				}
				@Pc(844) long local844;
				if (local29 == 294 || local29 == 38 || local29 == 140 || local29 == 169) {
					local281 = this.aStringArray14[arg0];
					local285 = local281.indexOf("@whi@");
					if (local285 != -1) {
						local844 = Class36.method381(local281.substring(local285 + 5).trim());
						if (local29 == 294) {
							this.method664(local844);
						}
						if (local29 == 38) {
							this.method591(local844);
						}
						if (local29 == 140) {
							this.method691(local844);
						}
						if (local29 == 169) {
							this.method684(local844);
						}
					}
				}
				@Pc(887) Class24 local887;
				if (local29 == 871) {
					this.aClass8_Sub1_Sub3_6.method141(2);
					this.aClass8_Sub1_Sub3_6.method143(local24);
					local887 = Class24.method269(local24);
					if (local887.anIntArrayArray11 != null && local887.anIntArrayArray11[0][0] == 5) {
						local285 = local887.anIntArrayArray11[0][1];
						if (this.anIntArray218[local285] != local887.anIntArray125[0]) {
							this.anIntArray218[local285] = local887.anIntArray125[0];
							this.method592(local285);
							this.aBoolean217 = true;
						}
					}
				}
				if (local29 == 524) {
					local188 = this.method600(local24, 2, false, 0, aClass8_Sub1_Sub1_Sub1_Sub2_1.anIntArray183[0], 0, this.anInt928, 0, 0, local19, aClass8_Sub1_Sub1_Sub1_Sub2_1.anIntArray184[0], 0);
					if (!local188) {
						this.method600(local24, 2, false, 0, aClass8_Sub1_Sub1_Sub1_Sub2_1.anIntArray183[0], 1, this.anInt928, 0, 0, local19, aClass8_Sub1_Sub1_Sub1_Sub2_1.anIntArray184[0], 1);
					}
					this.anInt1018 = super.anInt846;
					this.anInt1019 = super.anInt847;
					this.anInt1021 = 2;
					this.anInt1020 = 0;
					this.aClass8_Sub1_Sub3_6.method141(33);
					this.aClass8_Sub1_Sub3_6.method143(local19 + this.anInt924);
					this.aClass8_Sub1_Sub3_6.method176(local34);
					this.aClass8_Sub1_Sub3_6.method176(this.anInt866);
					this.aClass8_Sub1_Sub3_6.method177(local24 + this.anInt925, this.anInt897);
				}
				if (local29 == 788) {
					local281 = this.aStringArray14[arg0];
					local285 = local281.indexOf("@whi@");
					if (local285 != -1) {
						local844 = Class36.method381(local281.substring(local285 + 5).trim());
						local306 = -1;
						for (@Pc(1051) int local1051 = 0; local1051 < this.anInt1081; local1051++) {
							if (this.aLongArray3[local1051] == local844) {
								local306 = local1051;
								break;
							}
						}
						if (local306 != -1 && this.anIntArray267[local306] > 0) {
							this.aBoolean191 = true;
							this.anInt940 = 0;
							this.aBoolean201 = true;
							this.aString30 = "";
							this.anInt965 = 3;
							this.aLong31 = this.aLongArray3[local306];
							this.aString26 = "Enter message to send to " + this.aStringArray9[local306];
						}
					}
				}
				if (local29 == 339) {
					local696 = this.aClass8_Sub1_Sub1_Sub1_Sub1Array1[local34];
					if (local696 != null) {
						this.method600(local696.anIntArray184[0], 2, false, 0, aClass8_Sub1_Sub1_Sub1_Sub2_1.anIntArray183[0], 1, this.anInt928, 0, 0, local696.anIntArray183[0], aClass8_Sub1_Sub1_Sub1_Sub2_1.anIntArray184[0], 1);
						this.anInt1018 = super.anInt846;
						this.anInt1019 = super.anInt847;
						this.anInt1021 = 2;
						this.anInt1020 = 0;
						this.aClass8_Sub1_Sub3_6.method141(243);
						this.aClass8_Sub1_Sub3_6.method175(local34);
					}
				}
				if (local29 == 851) {
					local696 = this.aClass8_Sub1_Sub1_Sub1_Sub1Array1[local34];
					if (local696 != null) {
						this.method600(local696.anIntArray184[0], 2, false, 0, aClass8_Sub1_Sub1_Sub1_Sub2_1.anIntArray183[0], 1, this.anInt928, 0, 0, local696.anIntArray183[0], aClass8_Sub1_Sub1_Sub1_Sub2_1.anIntArray184[0], 1);
						this.anInt1018 = super.anInt846;
						this.anInt1019 = super.anInt847;
						this.anInt1021 = 2;
						this.anInt1020 = 0;
						this.aClass8_Sub1_Sub3_6.method141(178);
						this.aClass8_Sub1_Sub3_6.method177(local34, this.anInt897);
					}
				}
				if (local29 == 409) {
					local188 = this.method600(local24, 2, false, 0, aClass8_Sub1_Sub1_Sub1_Sub2_1.anIntArray183[0], 0, this.anInt928, 0, 0, local19, aClass8_Sub1_Sub1_Sub1_Sub2_1.anIntArray184[0], 0);
					if (!local188) {
						this.method600(local24, 2, false, 0, aClass8_Sub1_Sub1_Sub1_Sub2_1.anIntArray183[0], 1, this.anInt928, 0, 0, local19, aClass8_Sub1_Sub1_Sub1_Sub2_1.anIntArray184[0], 1);
					}
					this.anInt1018 = super.anInt846;
					this.anInt1019 = super.anInt847;
					this.anInt1021 = 2;
					this.anInt1020 = 0;
					this.aClass8_Sub1_Sub3_6.method141(93);
					this.aClass8_Sub1_Sub3_6.method175(local19 + this.anInt924);
					this.aClass8_Sub1_Sub3_6.method143(local24 + this.anInt925);
					this.aClass8_Sub1_Sub3_6.method143(local34);
				}
				if (local29 == 967 && !this.aBoolean211) {
					this.aClass8_Sub1_Sub3_6.method141(115);
					this.aClass8_Sub1_Sub3_6.method143(local24);
					this.aBoolean211 = true;
				}
				if (local29 == 586) {
					this.aClass8_Sub1_Sub3_6.method141(211);
					this.aClass8_Sub1_Sub3_6.method177(local19, this.anInt897);
					this.aClass8_Sub1_Sub3_6.method143(local24);
					this.aClass8_Sub1_Sub3_6.method177(this.anInt963, this.anInt897);
					this.aClass8_Sub1_Sub3_6.method143(this.anInt962);
					this.aClass8_Sub1_Sub3_6.method177(this.anInt964, this.anInt897);
					this.aClass8_Sub1_Sub3_6.method175(local34);
					this.anInt1027 = 0;
					this.anInt1028 = local24;
					this.anInt1029 = local19;
					this.anInt1030 = 2;
					if (Class24.method269(local24).anInt411 == this.anInt1077) {
						this.anInt1030 = 1;
					}
					if (Class24.method269(local24).anInt411 == this.anInt973) {
						this.anInt1030 = 3;
					}
				}
				if (local29 == 794) {
					local188 = this.method600(local24, 2, false, 0, aClass8_Sub1_Sub1_Sub1_Sub2_1.anIntArray183[0], 0, this.anInt928, 0, 0, local19, aClass8_Sub1_Sub1_Sub1_Sub2_1.anIntArray184[0], 0);
					if (!local188) {
						this.method600(local24, 2, false, 0, aClass8_Sub1_Sub1_Sub1_Sub2_1.anIntArray183[0], 1, this.anInt928, 0, 0, local19, aClass8_Sub1_Sub1_Sub1_Sub2_1.anIntArray184[0], 1);
					}
					this.anInt1018 = super.anInt846;
					this.anInt1019 = super.anInt847;
					this.anInt1021 = 2;
					this.anInt1020 = 0;
					this.aClass8_Sub1_Sub3_6.method141(223);
					this.aClass8_Sub1_Sub3_6.method143(local34);
					this.aClass8_Sub1_Sub3_6.method143(local19 + this.anInt924);
					this.aClass8_Sub1_Sub3_6.method175(local24 + this.anInt925);
				}
				if (local29 == 36) {
					local696 = this.aClass8_Sub1_Sub1_Sub1_Sub1Array1[local34];
					if (local696 != null) {
						this.method600(local696.anIntArray184[0], 2, false, 0, aClass8_Sub1_Sub1_Sub1_Sub2_1.anIntArray183[0], 1, this.anInt928, 0, 0, local696.anIntArray183[0], aClass8_Sub1_Sub1_Sub1_Sub2_1.anIntArray184[0], 1);
						this.anInt1018 = super.anInt846;
						this.anInt1019 = super.anInt847;
						this.anInt1021 = 2;
						this.anInt1020 = 0;
						if ((local34 & 0x3) == 0) {
							anInt939++;
						}
						if (anInt939 >= 103) {
							this.aClass8_Sub1_Sub3_6.method141(74);
							this.aClass8_Sub1_Sub3_6.method145(4286979);
							anInt939 = 0;
						}
						this.aClass8_Sub1_Sub3_6.method141(169);
						this.aClass8_Sub1_Sub3_6.method175(local34);
					}
				}
				if (local29 == 877) {
					this.method666();
				}
				if (local29 == 139) {
					this.aClass8_Sub1_Sub3_6.method141(180);
					this.aClass8_Sub1_Sub3_6.method143(local24);
					this.aClass8_Sub1_Sub3_6.method177(local19, this.anInt897);
					this.aClass8_Sub1_Sub3_6.method143(local34);
					this.anInt1027 = 0;
					this.anInt1028 = local24;
					this.anInt1029 = local19;
					this.anInt1030 = 2;
					if (Class24.method269(local24).anInt411 == this.anInt1077) {
						this.anInt1030 = 1;
					}
					if (Class24.method269(local24).anInt411 == this.anInt973) {
						this.anInt1030 = 3;
					}
				}
				if (local29 == 1433) {
					local696 = this.aClass8_Sub1_Sub1_Sub1_Sub1Array1[local34];
					if (local696 != null) {
						@Pc(1654) Class26 local1654 = local696.aClass26_1;
						if (local1654.anIntArray133 != null) {
							local1654 = local1654.method289();
						}
						if (local1654 != null) {
							if (local1654.aByteArray10 == null) {
								local302 = "It's a " + local1654.aString12 + ".";
							} else {
								local302 = new String(local1654.aByteArray10);
							}
							this.method694(0, local302, "");
						}
					}
				}
				@Pc(1706) String local1706;
				@Pc(1697) Class19 local1697;
				if (local29 == 1065) {
					local1697 = Class19.method191(local34);
					if (local1697.aByteArray8 == null) {
						local1706 = "It's a " + local1697.aString4 + ".";
					} else {
						local1706 = new String(local1697.aByteArray8);
					}
					this.method694(0, local1706, "");
				}
				if (local29 == 154) {
					local696 = this.aClass8_Sub1_Sub1_Sub1_Sub1Array1[local34];
					if (local696 != null) {
						this.method600(local696.anIntArray184[0], 2, false, 0, aClass8_Sub1_Sub1_Sub1_Sub2_1.anIntArray183[0], 1, this.anInt928, 0, 0, local696.anIntArray183[0], aClass8_Sub1_Sub1_Sub1_Sub2_1.anIntArray184[0], 1);
						this.anInt1018 = super.anInt846;
						this.anInt1019 = super.anInt847;
						this.anInt1021 = 2;
						this.anInt1020 = 0;
						this.aClass8_Sub1_Sub3_6.method141(51);
						this.aClass8_Sub1_Sub3_6.method143(local34);
						this.aClass8_Sub1_Sub3_6.method176(this.anInt866);
					}
				}
				if (local29 == 263) {
					this.aClass8_Sub1_Sub3_6.method141(101);
					this.aClass8_Sub1_Sub3_6.method176(local19);
					this.aClass8_Sub1_Sub3_6.method177(local34, this.anInt897);
					this.aClass8_Sub1_Sub3_6.method175(local24);
					this.anInt1027 = 0;
					this.anInt1028 = local24;
					this.anInt1029 = local19;
					this.anInt1030 = 2;
					if (Class24.method269(local24).anInt411 == this.anInt1077) {
						this.anInt1030 = 1;
					}
					if (Class24.method269(local24).anInt411 == this.anInt973) {
						this.anInt1030 = 3;
					}
				}
				if (local29 == 638) {
					this.method649(local34, local19, local24);
					this.aClass8_Sub1_Sub3_6.method141(49);
					this.aClass8_Sub1_Sub3_6.method175(local19 + this.anInt924);
					this.aClass8_Sub1_Sub3_6.method177(local24 + this.anInt925, this.anInt897);
					this.aClass8_Sub1_Sub3_6.method143(local34 >> 14 & 0x7FFF);
				}
				if (local29 == 26) {
					this.anInt961 = 1;
					this.anInt962 = local19;
					this.anInt963 = local24;
					this.anInt964 = local34;
					this.aString24 = String.valueOf(Class19.method191(local34).aString4);
					this.anInt865 = 0;
					this.aBoolean217 = true;
				} else {
					if (local29 == 561) {
						local696 = this.aClass8_Sub1_Sub1_Sub1_Sub1Array1[local34];
						if (local696 != null) {
							this.method600(local696.anIntArray184[0], 2, false, 0, aClass8_Sub1_Sub1_Sub1_Sub2_1.anIntArray183[0], 1, this.anInt928, 0, 0, local696.anIntArray183[0], aClass8_Sub1_Sub1_Sub1_Sub2_1.anIntArray184[0], 1);
							this.anInt1018 = super.anInt846;
							this.anInt1019 = super.anInt847;
							this.anInt1021 = 2;
							this.anInt1020 = 0;
							this.aClass8_Sub1_Sub3_6.method141(52);
							this.aClass8_Sub1_Sub3_6.method176(this.anInt963);
							this.aClass8_Sub1_Sub3_6.method177(local34, this.anInt897);
							this.aClass8_Sub1_Sub3_6.method143(this.anInt962);
							this.aClass8_Sub1_Sub3_6.method143(this.anInt964);
						}
					}
					if (local29 == 859) {
						local696 = this.aClass8_Sub1_Sub1_Sub1_Sub1Array1[local34];
						if (local696 != null) {
							this.method600(local696.anIntArray184[0], 2, false, 0, aClass8_Sub1_Sub1_Sub1_Sub2_1.anIntArray183[0], 1, this.anInt928, 0, 0, local696.anIntArray183[0], aClass8_Sub1_Sub1_Sub1_Sub2_1.anIntArray184[0], 1);
							this.anInt1018 = super.anInt846;
							this.anInt1019 = super.anInt847;
							this.anInt1021 = 2;
							this.anInt1020 = 0;
							this.aClass8_Sub1_Sub3_6.method141(250);
							this.aClass8_Sub1_Sub3_6.method175(local34);
						}
					}
					if (local29 == 634) {
						local58 = this.aClass8_Sub1_Sub1_Sub1_Sub2Array1[local34];
						if (local58 != null) {
							this.method600(local58.anIntArray184[0], 2, false, 0, aClass8_Sub1_Sub1_Sub1_Sub2_1.anIntArray183[0], 1, this.anInt928, 0, 0, local58.anIntArray183[0], aClass8_Sub1_Sub1_Sub1_Sub2_1.anIntArray184[0], 1);
							this.anInt1018 = super.anInt846;
							this.anInt1019 = super.anInt847;
							this.anInt1021 = 2;
							this.anInt1020 = 0;
							this.aClass8_Sub1_Sub3_6.method141(28);
							this.aClass8_Sub1_Sub3_6.method143(local34);
						}
					}
					if (local29 == 663) {
						local58 = this.aClass8_Sub1_Sub1_Sub1_Sub2Array1[local34];
						if (local58 != null) {
							this.method600(local58.anIntArray184[0], 2, false, 0, aClass8_Sub1_Sub1_Sub1_Sub2_1.anIntArray183[0], 1, this.anInt928, 0, 0, local58.anIntArray183[0], aClass8_Sub1_Sub1_Sub1_Sub2_1.anIntArray184[0], 1);
							this.anInt1018 = super.anInt846;
							this.anInt1019 = super.anInt847;
							this.anInt1021 = 2;
							this.anInt1020 = 0;
							this.aClass8_Sub1_Sub3_6.method141(132);
							this.aClass8_Sub1_Sub3_6.method176(local34);
						}
					}
					if (local29 == 463) {
						this.method649(local34, local19, local24);
						this.aClass8_Sub1_Sub3_6.method141(105);
						this.aClass8_Sub1_Sub3_6.method176(local24 + this.anInt925);
						this.aClass8_Sub1_Sub3_6.method176(local19 + this.anInt924);
						this.aClass8_Sub1_Sub3_6.method143(local34 >> 14 & 0x7FFF);
					}
					if (local29 == 702) {
						local281 = this.aStringArray14[arg0];
						local285 = local281.indexOf("@whi@");
						if (local285 != -1) {
							if (this.anInt1077 == -1) {
								this.method666();
								this.aString25 = local281.substring(local285 + 5).trim();
								this.aBoolean229 = false;
								this.anInt978 = this.anInt1077 = Class24.anInt413;
							} else {
								this.method694(0, "Please close the interface you have open before using 'report abuse'", "");
							}
						}
					}
					if (local29 == 178) {
						anInt882++;
						if (anInt882 >= 78) {
							this.aClass8_Sub1_Sub3_6.method141(161);
							this.aClass8_Sub1_Sub3_6.method146(0);
							anInt882 = 0;
						}
						this.method649(local34, local19, local24);
						this.aClass8_Sub1_Sub3_6.method141(254);
						this.aClass8_Sub1_Sub3_6.method175(local34 >> 14 & 0x7FFF);
						this.aClass8_Sub1_Sub3_6.method177(local19 + this.anInt924, this.anInt897);
						this.aClass8_Sub1_Sub3_6.method175(local24 + this.anInt925);
					}
					if (local29 == 358) {
						local887 = Class24.method269(local24);
						this.anInt865 = 1;
						this.anInt866 = local24;
						this.anInt867 = local887.anInt404;
						this.anInt961 = 0;
						this.aBoolean217 = true;
						local1706 = local887.aString8;
						if (local1706.indexOf(" ") != -1) {
							local1706 = local1706.substring(0, local1706.indexOf(" "));
						}
						local302 = local887.aString8;
						if (local302.indexOf(" ") != -1) {
							local302 = local302.substring(local302.indexOf(" ") + 1);
						}
						this.aString18 = local1706 + " " + local887.aString10 + " " + local302;
						if (this.anInt867 == 16) {
							this.aBoolean217 = true;
							this.anInt1060 = 3;
							this.aBoolean195 = true;
						}
					} else {
						if (local29 == 426) {
							anInt1059++;
							if (anInt1059 >= 56) {
								this.aClass8_Sub1_Sub3_6.method141(202);
								this.aClass8_Sub1_Sub3_6.method145(10272641);
								anInt1059 = 0;
							}
							this.aClass8_Sub1_Sub3_6.method141(177);
							this.aClass8_Sub1_Sub3_6.method176(local34);
							this.aClass8_Sub1_Sub3_6.method175(local19);
							this.aClass8_Sub1_Sub3_6.method177(local24, this.anInt897);
							this.anInt1027 = 0;
							this.anInt1028 = local24;
							this.anInt1029 = local19;
							this.anInt1030 = 2;
							if (Class24.method269(local24).anInt411 == this.anInt1077) {
								this.anInt1030 = 1;
							}
							if (Class24.method269(local24).anInt411 == this.anInt973) {
								this.anInt1030 = 3;
							}
						}
						if (local29 == 931) {
							this.aClass8_Sub1_Sub3_6.method141(14);
							this.aClass8_Sub1_Sub3_6.method175(this.anInt866);
							this.aClass8_Sub1_Sub3_6.method177(local24, this.anInt897);
							this.aClass8_Sub1_Sub3_6.method177(local19, this.anInt897);
							this.aClass8_Sub1_Sub3_6.method176(local34);
							this.anInt1027 = 0;
							this.anInt1028 = local24;
							this.anInt1029 = local19;
							this.anInt1030 = 2;
							if (Class24.method269(local24).anInt411 == this.anInt1077) {
								this.anInt1030 = 1;
							}
							if (Class24.method269(local24).anInt411 == this.anInt973) {
								this.anInt1030 = 3;
							}
						}
						if (local29 == 245) {
							this.aClass8_Sub1_Sub3_6.method141(23);
							this.aClass8_Sub1_Sub3_6.method176(local24);
							this.aClass8_Sub1_Sub3_6.method175(local34);
							this.aClass8_Sub1_Sub3_6.method176(local19);
							this.anInt1027 = 0;
							this.anInt1028 = local24;
							this.anInt1029 = local19;
							this.anInt1030 = 2;
							if (Class24.method269(local24).anInt411 == this.anInt1077) {
								this.anInt1030 = 1;
							}
							if (Class24.method269(local24).anInt411 == this.anInt973) {
								this.anInt1030 = 3;
							}
						}
						if (local29 == 819) {
							this.method609(aByte21, this.anInt1022);
							this.anInt1022 = -1;
							this.aBoolean191 = true;
						}
						if (local29 == 331) {
							anInt857++;
							if (anInt857 >= 148) {
								this.aClass8_Sub1_Sub3_6.method141(108);
								this.aClass8_Sub1_Sub3_6.method143(64453);
								anInt857 = 0;
							}
							this.aClass8_Sub1_Sub3_6.method141(190);
							this.aClass8_Sub1_Sub3_6.method176(local19);
							this.aClass8_Sub1_Sub3_6.method177(local24, this.anInt897);
							this.aClass8_Sub1_Sub3_6.method177(local34, this.anInt897);
							this.anInt1027 = 0;
							this.anInt1028 = local24;
							this.anInt1029 = local19;
							this.anInt1030 = 2;
							if (Class24.method269(local24).anInt411 == this.anInt1077) {
								this.anInt1030 = 1;
							}
							if (Class24.method269(local24).anInt411 == this.anInt973) {
								this.anInt1030 = 3;
							}
						}
						if (local29 == 66) {
							if (this.aBoolean208) {
								this.aClass32_1.method354(local19 - 4, local24 - 4, (byte) 9);
							} else {
								this.aClass32_1.method354(super.anInt846 - 4, super.anInt847 - 4, (byte) 9);
							}
						}
						if (local29 == 80) {
							this.aClass8_Sub1_Sub3_6.method141(46);
							this.aClass8_Sub1_Sub3_6.method177(local34, this.anInt897);
							this.aClass8_Sub1_Sub3_6.method143(local19);
							this.aClass8_Sub1_Sub3_6.method176(local24);
							this.anInt1027 = 0;
							this.anInt1028 = local24;
							this.anInt1029 = local19;
							this.anInt1030 = 2;
							if (Class24.method269(local24).anInt411 == this.anInt1077) {
								this.anInt1030 = 1;
							}
							if (Class24.method269(local24).anInt411 == this.anInt973) {
								this.anInt1030 = 3;
							}
						}
						if (local29 == 124 && this.method649(local34, local19, local24)) {
							this.aClass8_Sub1_Sub3_6.method141(4);
							this.aClass8_Sub1_Sub3_6.method177(this.anInt962, this.anInt897);
							this.aClass8_Sub1_Sub3_6.method176(local24 + this.anInt925);
							this.aClass8_Sub1_Sub3_6.method175(this.anInt964);
							this.aClass8_Sub1_Sub3_6.method175(local34 >> 14 & 0x7FFF);
							this.aClass8_Sub1_Sub3_6.method176(this.anInt963);
							this.aClass8_Sub1_Sub3_6.method177(local19 + this.anInt924, this.anInt897);
						}
						if (local29 == 766) {
							local58 = this.aClass8_Sub1_Sub1_Sub1_Sub2Array1[local34];
							if (local58 != null) {
								this.method600(local58.anIntArray184[0], 2, false, 0, aClass8_Sub1_Sub1_Sub1_Sub2_1.anIntArray183[0], 1, this.anInt928, 0, 0, local58.anIntArray183[0], aClass8_Sub1_Sub1_Sub1_Sub2_1.anIntArray184[0], 1);
								this.anInt1018 = super.anInt846;
								this.anInt1019 = super.anInt847;
								this.anInt1021 = 2;
								this.anInt1020 = 0;
								this.aClass8_Sub1_Sub3_6.method141(123);
								this.aClass8_Sub1_Sub3_6.method177(this.anInt963, this.anInt897);
								this.aClass8_Sub1_Sub3_6.method177(this.anInt964, this.anInt897);
								this.aClass8_Sub1_Sub3_6.method176(this.anInt962);
								this.aClass8_Sub1_Sub3_6.method176(local34);
							}
						}
						if (local29 == 213) {
							anInt938 += local24;
							if (anInt938 >= 146) {
								this.aClass8_Sub1_Sub3_6.method141(208);
								this.aClass8_Sub1_Sub3_6.method145(7403351);
								anInt938 = 0;
							}
							this.aClass8_Sub1_Sub3_6.method141(150);
							this.aClass8_Sub1_Sub3_6.method175(local19);
							this.aClass8_Sub1_Sub3_6.method177(local24, this.anInt897);
							this.aClass8_Sub1_Sub3_6.method175(local34);
							this.anInt1027 = 0;
							this.anInt1028 = local24;
							this.anInt1029 = local19;
							this.anInt1030 = 2;
							if (Class24.method269(local24).anInt411 == this.anInt1077) {
								this.anInt1030 = 1;
							}
							if (Class24.method269(local24).anInt411 == this.anInt973) {
								this.anInt1030 = 3;
							}
						}
						if (local29 == 890) {
							this.aClass8_Sub1_Sub3_6.method141(87);
							this.aClass8_Sub1_Sub3_6.method177(local34, this.anInt897);
							this.aClass8_Sub1_Sub3_6.method143(local24);
							this.aClass8_Sub1_Sub3_6.method175(local19);
							this.anInt1027 = 0;
							this.anInt1028 = local24;
							this.anInt1029 = local19;
							this.anInt1030 = 2;
							if (Class24.method269(local24).anInt411 == this.anInt1077) {
								this.anInt1030 = 1;
							}
							if (Class24.method269(local24).anInt411 == this.anInt973) {
								this.anInt1030 = 3;
							}
						}
						if (local29 == 797) {
							this.aClass8_Sub1_Sub3_6.method141(242);
							this.aClass8_Sub1_Sub3_6.method143(local24);
							this.aClass8_Sub1_Sub3_6.method177(local19, this.anInt897);
							this.aClass8_Sub1_Sub3_6.method143(local34);
							this.anInt1027 = 0;
							this.anInt1028 = local24;
							this.anInt1029 = local19;
							this.anInt1030 = 2;
							if (Class24.method269(local24).anInt411 == this.anInt1077) {
								this.anInt1030 = 1;
							}
							if (Class24.method269(local24).anInt411 == this.anInt973) {
								this.anInt1030 = 3;
							}
						}
						if (local29 == 1901) {
							this.method649(local34, local19, local24);
							this.aClass8_Sub1_Sub3_6.method141(237);
							this.aClass8_Sub1_Sub3_6.method143(local24 + this.anInt925);
							this.aClass8_Sub1_Sub3_6.method176(local34 >> 14 & 0x7FFF);
							this.aClass8_Sub1_Sub3_6.method175(local19 + this.anInt924);
						}
						if (local29 == 776) {
							this.aClass8_Sub1_Sub3_6.method141(2);
							this.aClass8_Sub1_Sub3_6.method143(local24);
							local887 = Class24.method269(local24);
							if (local887.anIntArrayArray11 != null && local887.anIntArrayArray11[0][0] == 5) {
								local285 = local887.anIntArrayArray11[0][1];
								this.anIntArray218[local285] = 1 - this.anIntArray218[local285];
								this.method592(local285);
								this.aBoolean217 = true;
							}
						}
						if (local29 == 315) {
							local887 = Class24.method269(local24);
							@Pc(3179) boolean local3179 = true;
							if (local887.anInt424 > 0) {
								local3179 = this.method715(local887);
							}
							if (local3179) {
								this.aClass8_Sub1_Sub3_6.method141(2);
								this.aClass8_Sub1_Sub3_6.method143(local24);
							}
						}
						if (local29 == 54) {
							local188 = this.method600(local24, 2, false, 0, aClass8_Sub1_Sub1_Sub1_Sub2_1.anIntArray183[0], 0, this.anInt928, 0, 0, local19, aClass8_Sub1_Sub1_Sub1_Sub2_1.anIntArray184[0], 0);
							if (!local188) {
								this.method600(local24, 2, false, 0, aClass8_Sub1_Sub1_Sub1_Sub2_1.anIntArray183[0], 1, this.anInt928, 0, 0, local19, aClass8_Sub1_Sub1_Sub1_Sub2_1.anIntArray184[0], 1);
							}
							this.anInt1018 = super.anInt846;
							this.anInt1019 = super.anInt847;
							this.anInt1021 = 2;
							this.anInt1020 = 0;
							this.aClass8_Sub1_Sub3_6.method141(184);
							this.aClass8_Sub1_Sub3_6.method175(local19 + this.anInt924);
							this.aClass8_Sub1_Sub3_6.method177(local34, this.anInt897);
							this.aClass8_Sub1_Sub3_6.method175(local24 + this.anInt925);
						}
						if (local29 == 1881) {
							@Pc(3297) int local3297 = local34 >> 14 & 0x7FFF;
							@Pc(3300) Class23 local3300 = Class23.method260(local3297);
							if (local3300.aByteArray9 == null) {
								local302 = "It's a " + local3300.aString6 + ".";
							} else {
								local302 = new String(local3300.aByteArray9);
							}
							this.method694(0, local302, "");
						}
						if (local29 == 1164) {
							local1697 = Class19.method191(local34);
							@Pc(3337) Class24 local3337 = Class24.method269(local24);
							if (local3337 != null && local3337.anIntArray120[local19] >= 100000) {
								local1706 = local3337.anIntArray120[local19] + " x " + local1697.aString4;
							} else if (local1697.aByteArray8 == null) {
								local1706 = "It's a " + local1697.aString4 + ".";
							} else {
								local1706 = new String(local1697.aByteArray8);
							}
							this.method694(0, local1706, "");
						}
						if (local29 == 738) {
							local188 = this.method600(local24, 2, false, 0, aClass8_Sub1_Sub1_Sub1_Sub2_1.anIntArray183[0], 0, this.anInt928, 0, 0, local19, aClass8_Sub1_Sub1_Sub1_Sub2_1.anIntArray184[0], 0);
							if (!local188) {
								this.method600(local24, 2, false, 0, aClass8_Sub1_Sub1_Sub1_Sub2_1.anIntArray183[0], 1, this.anInt928, 0, 0, local19, aClass8_Sub1_Sub1_Sub1_Sub2_1.anIntArray184[0], 1);
							}
							this.anInt1018 = super.anInt846;
							this.anInt1019 = super.anInt847;
							this.anInt1021 = 2;
							this.anInt1020 = 0;
							anInt1053 += local34;
							if (anInt1053 >= 111) {
								this.aClass8_Sub1_Sub3_6.method141(173);
								this.aClass8_Sub1_Sub3_6.method145(10397469);
								anInt1053 = 0;
							}
							this.aClass8_Sub1_Sub3_6.method141(164);
							this.aClass8_Sub1_Sub3_6.method143(local34);
							this.aClass8_Sub1_Sub3_6.method176(local24 + this.anInt925);
							this.aClass8_Sub1_Sub3_6.method175(local19 + this.anInt924);
						}
						if (local29 == 429) {
							local58 = this.aClass8_Sub1_Sub1_Sub1_Sub2Array1[local34];
							if (local58 != null) {
								this.method600(local58.anIntArray184[0], 2, false, 0, aClass8_Sub1_Sub1_Sub1_Sub2_1.anIntArray183[0], 1, this.anInt928, 0, 0, local58.anIntArray183[0], aClass8_Sub1_Sub1_Sub1_Sub2_1.anIntArray184[0], 1);
								this.anInt1018 = super.anInt846;
								this.anInt1019 = super.anInt847;
								this.anInt1021 = 2;
								this.anInt1020 = 0;
								this.aClass8_Sub1_Sub3_6.method141(39);
								this.aClass8_Sub1_Sub3_6.method176(local34);
							}
						}
						this.anInt961 = 0;
						this.anInt865 = 0;
						this.aBoolean217 = true;
					}
				}
			}
		} catch (@Pc(3569) RuntimeException local3569) {
			signlink.reporterror("98924, " + -95 + ", " + arg0 + ", " + local3569.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "w", descriptor = "(I)V")
	private void method660() {
		try {
			this.aBoolean199 = false;
			while (this.aBoolean227) {
				this.aBoolean199 = false;
				try {
					Thread.sleep(50L);
				} catch (@Pc(11) Exception local11) {
				}
			}
			this.aClass8_Sub1_Sub2_Sub2_9 = null;
			this.aClass8_Sub1_Sub2_Sub2_10 = null;
			this.aClass8_Sub1_Sub2_Sub2Array4 = null;
			this.anIntArray238 = null;
			this.anIntArray239 = null;
			this.anIntArray240 = null;
			this.anIntArray241 = null;
			this.anIntArray251 = null;
			this.anIntArray252 = null;
			this.anIntArray224 = null;
			this.anIntArray225 = null;
			this.aClass8_Sub1_Sub2_Sub1_4 = null;
			this.aClass8_Sub1_Sub2_Sub1_5 = null;
		} catch (@Pc(60) RuntimeException local60) {
			signlink.reporterror("76736, " + 0 + ", " + local60.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/String;IB)V")
	@Override
	protected void method586(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte arg2) {
		try {
			this.anInt985 = arg1;
			this.aString21 = arg0;
			this.method602();
			if (this.aClass2_2 == null) {
				super.method586(arg0, arg1, (byte) 6);
			} else {
				this.aClass11_12.method70();
				this.aClass8_Sub1_Sub2_Sub3_4.method447(16777215, 180, "RuneScape is loading - please wait...", 54);
				Class8_Sub1_Sub2.method551(9179409, 304, 34, 62, 28);
				Class8_Sub1_Sub2.method551(0, 302, 32, 63, 29);
				Class8_Sub1_Sub2.method550(arg1 * 3, 64, 9179409, 30, 30);
				Class8_Sub1_Sub2.method550(300 - arg1 * 3, 64, 0, 30, arg1 * 3 + 30);
				@Pc(116) boolean local116 = false;
				this.aClass8_Sub1_Sub2_Sub3_4.method447(16777215, 180, arg0, 85);
				this.aClass11_12.method71(202, super.aGraphics2, 171);
				if (this.aBoolean219) {
					this.aBoolean219 = false;
					if (!this.aBoolean199) {
						this.aClass11_13.method71(0, super.aGraphics2, 0);
						this.aClass11_14.method71(637, super.aGraphics2, 0);
					}
					this.aClass11_10.method71(128, super.aGraphics2, 0);
					this.aClass11_11.method71(202, super.aGraphics2, 371);
					this.aClass11_15.method71(0, super.aGraphics2, 265);
					this.aClass11_16.method71(562, super.aGraphics2, 265);
					this.aClass11_17.method71(128, super.aGraphics2, 171);
					this.aClass11_18.method71(562, super.aGraphics2, 171);
				}
			}
		} catch (@Pc(223) RuntimeException local223) {
			signlink.reporterror("87052, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local223.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "i", descriptor = "(Z)V")
	private void method661() {
		try {
			if (this.anInt858 != 0) {
				@Pc(6) Class8_Sub1_Sub2_Sub3 local6 = this.aClass8_Sub1_Sub2_Sub3_3;
				@Pc(8) int local8 = 0;
				if (this.anInt871 != 0) {
					local8 = 1;
				}
				for (@Pc(22) int local22 = 0; local22 < 100; local22++) {
					if (this.aStringArray13[local22] != null) {
						@Pc(34) int local34 = this.anIntArray264[local22];
						@Pc(39) String local39 = this.aStringArray12[local22];
						@Pc(41) byte local41 = 0;
						if (local39 != null && local39.startsWith("@cr1@")) {
							local39 = local39.substring(5);
							local41 = 1;
						}
						if (local39 != null && local39.startsWith("@cr2@")) {
							local39 = local39.substring(5);
							local41 = 2;
						}
						@Pc(92) int local92;
						if ((local34 == 3 || local34 == 7) && (local34 == 7 || this.anInt1016 == 0 || this.anInt1016 == 1 && this.method713(local39))) {
							local92 = 329 - local8 * 13;
							local6.method451(0, "From", 4, local92);
							local6.method451(65535, "From", 4, local92 - 1);
							@Pc(117) int local117 = local6.method449("From ") + 4;
							if (local41 == 1) {
								this.aClass8_Sub1_Sub2_Sub2Array5[0].method406(local92 - 12, local117);
								local117 += 14;
							}
							if (local41 == 2) {
								this.aClass8_Sub1_Sub2_Sub2Array5[1].method406(local92 - 12, local117);
								local117 += 14;
							}
							local6.method451(0, local39 + ": " + this.aStringArray13[local22], local117, local92);
							local6.method451(65535, local39 + ": " + this.aStringArray13[local22], local117, local92 - 1);
							local8++;
							if (local8 >= 5) {
								return;
							}
						}
						if (local34 == 5 && this.anInt1016 < 2) {
							local92 = 329 - local8 * 13;
							local6.method451(0, this.aStringArray13[local22], 4, local92);
							local6.method451(65535, this.aStringArray13[local22], 4, local92 - 1);
							local8++;
							if (local8 >= 5) {
								return;
							}
						}
						if (local34 == 6 && this.anInt1016 < 2) {
							local92 = 329 - local8 * 13;
							local6.method451(0, "To " + local39 + ": " + this.aStringArray13[local22], 4, local92);
							local6.method451(65535, "To " + local39 + ": " + this.aStringArray13[local22], 4, local92 - 1);
							local8++;
							if (local8 >= 5) {
								return;
							}
						}
					}
				}
			}
		} catch (@Pc(296) RuntimeException local296) {
			signlink.reporterror("91221, " + false + ", " + local296.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "k", descriptor = "(B)V")
	private void method662() {
		try {
			if (this.anInt871 > 1) {
				this.anInt871--;
			}
			if (this.anInt1048 > 0) {
				this.anInt1048--;
			}
			for (@Pc(22) int local22 = 0; local22 < 5 && this.method667(); local22++) {
			}
			if (this.aBoolean214) {
				@Pc(41) Object local41 = this.aClass22_1.anObject1;
				@Pc(66) int local66;
				@Pc(68) int local68;
				@Pc(70) int local70;
				@Pc(103) int local103;
				synchronized (this.aClass22_1.anObject1) {
					if (!aBoolean205) {
						this.aClass22_1.anInt373 = 0;
					} else if (super.anInt845 != 0 || this.aClass22_1.anInt373 >= 40) {
						this.aClass8_Sub1_Sub3_6.method141(11);
						this.aClass8_Sub1_Sub3_6.method142(0);
						local66 = this.aClass8_Sub1_Sub3_6.anInt239;
						local68 = 0;
						@Pc(86) int local86;
						for (local70 = 0; local70 < this.aClass22_1.anInt373 && local66 - this.aClass8_Sub1_Sub3_6.anInt239 < 240; local70++) {
							local68++;
							local86 = this.aClass22_1.anIntArray111[local70];
							if (local86 < 0) {
								local86 = 0;
							} else if (local86 > 502) {
								local86 = 502;
							}
							local103 = this.aClass22_1.anIntArray110[local70];
							if (local103 < 0) {
								local103 = 0;
							} else if (local103 > 764) {
								local103 = 764;
							}
							@Pc(120) int local120 = local86 * 765 + local103;
							if (this.aClass22_1.anIntArray111[local70] == -1 && this.aClass22_1.anIntArray110[local70] == -1) {
								local103 = -1;
								local86 = -1;
								local120 = 524287;
							}
							if (local103 != this.anInt1061 || local86 != this.anInt1062) {
								@Pc(165) int local165 = local103 - this.anInt1061;
								this.anInt1061 = local103;
								@Pc(173) int local173 = local86 - this.anInt1062;
								this.anInt1062 = local86;
								if (this.anInt1051 < 8 && local165 >= -32 && local165 <= 31 && local173 >= -32 && local173 <= 31) {
									local165 += 32;
									local173 += 32;
									this.aClass8_Sub1_Sub3_6.method143((this.anInt1051 << 12) + (local165 << 6) + local173);
									this.anInt1051 = 0;
								} else if (this.anInt1051 < 8) {
									this.aClass8_Sub1_Sub3_6.method145((this.anInt1051 << 19) + local120 + 8388608);
									this.anInt1051 = 0;
								} else {
									this.aClass8_Sub1_Sub3_6.method146((this.anInt1051 << 19) + local120 - 1073741824);
									this.anInt1051 = 0;
								}
							} else if (this.anInt1051 < 2047) {
								this.anInt1051++;
							}
						}
						this.aClass8_Sub1_Sub3_6.method151(this.aClass8_Sub1_Sub3_6.anInt239 - local66);
						if (local68 >= this.aClass22_1.anInt373) {
							this.aClass22_1.anInt373 = 0;
						} else {
							this.aClass22_1.anInt373 -= local68;
							for (local86 = 0; local86 < this.aClass22_1.anInt373; local86++) {
								this.aClass22_1.anIntArray110[local86] = this.aClass22_1.anIntArray110[local86 + local68];
								this.aClass22_1.anIntArray111[local86] = this.aClass22_1.anIntArray111[local86 + local68];
							}
						}
					}
				}
				if (super.anInt845 != 0) {
					@Pc(336) long local336 = (super.aLong28 - this.aLong33) / 50L;
					if (local336 > 4095L) {
						local336 = 4095L;
					}
					this.aLong33 = super.aLong28;
					local66 = super.anInt847;
					if (local66 < 0) {
						local66 = 0;
					} else if (local66 > 502) {
						local66 = 502;
					}
					local68 = super.anInt846;
					if (local68 < 0) {
						local68 = 0;
					} else if (local68 > 764) {
						local68 = 764;
					}
					local70 = local66 * 765 + local68;
					@Pc(382) byte local382 = 0;
					if (super.anInt845 == 2) {
						local382 = 1;
					}
					local103 = (int) local336;
					this.aClass8_Sub1_Sub3_6.method141(62);
					this.aClass8_Sub1_Sub3_6.method146((local103 << 20) + (local382 << 19) + local70);
				}
				if (this.anInt1065 > 0) {
					this.anInt1065--;
				}
				if (super.anIntArray210[1] == 1 || super.anIntArray210[2] == 1 || super.anIntArray210[3] == 1 || super.anIntArray210[4] == 1) {
					this.aBoolean234 = true;
				}
				if (this.aBoolean234 && this.anInt1065 <= 0) {
					this.anInt1065 = 20;
					this.aBoolean234 = false;
					this.aClass8_Sub1_Sub3_6.method141(179);
					this.aClass8_Sub1_Sub3_6.method177(this.anInt862, this.anInt897);
					this.aClass8_Sub1_Sub3_6.method177(this.anInt861, this.anInt897);
				}
				if (super.aBoolean190 && !this.aBoolean226) {
					this.aBoolean226 = true;
					this.aClass8_Sub1_Sub3_6.method141(18);
					this.aClass8_Sub1_Sub3_6.method142(1);
				}
				if (!super.aBoolean190 && this.aBoolean226) {
					this.aBoolean226 = false;
					this.aClass8_Sub1_Sub3_6.method141(18);
					this.aClass8_Sub1_Sub3_6.method142(0);
				}
				this.method635();
				this.method595();
				this.method719();
				this.anInt1046++;
				if (this.anInt1046 > 750) {
					this.method716();
				}
				this.method706(this.aBoolean238);
				this.method613();
				this.method695();
				this.anInt1023++;
				if (this.anInt1021 != 0) {
					this.anInt1020 += 20;
					if (this.anInt1020 >= 400) {
						this.anInt1021 = 0;
					}
				}
				if (this.anInt1030 != 0) {
					this.anInt1027++;
					if (this.anInt1027 >= 15) {
						if (this.anInt1030 == 2) {
							this.aBoolean217 = true;
						}
						if (this.anInt1030 == 3) {
							this.aBoolean191 = true;
						}
						this.anInt1030 = 0;
					}
				}
				if (this.anInt1070 != 0) {
					this.anInt1013++;
					if (super.anInt840 > this.anInt1071 + 5 || super.anInt840 < this.anInt1071 - 5 || super.anInt841 > this.anInt1072 + 5 || super.anInt841 < this.anInt1072 - 5) {
						this.aBoolean197 = true;
					}
					if (super.anInt839 == 0) {
						if (this.anInt1070 == 2) {
							this.aBoolean217 = true;
						}
						if (this.anInt1070 == 3) {
							this.aBoolean191 = true;
						}
						this.anInt1070 = 0;
						if (this.aBoolean197 && this.anInt1013 >= 5) {
							this.anInt909 = -1;
							this.method645();
							if (this.anInt909 == this.anInt1068 && this.anInt908 != this.anInt1069) {
								@Pc(686) Class24 local686 = Class24.method269(this.anInt1068);
								@Pc(688) byte local688 = 0;
								if (this.anInt886 == 1 && local686.anInt424 == 206) {
									local688 = 1;
								}
								if (local686.anIntArray119[this.anInt908] <= 0) {
									local688 = 0;
								}
								if (local686.aBoolean96) {
									local66 = this.anInt1069;
									local68 = this.anInt908;
									local686.anIntArray119[local68] = local686.anIntArray119[local66];
									local686.anIntArray120[local68] = local686.anIntArray120[local66];
									local686.anIntArray119[local66] = -1;
									local686.anIntArray120[local66] = 0;
								} else if (local688 == 1) {
									local66 = this.anInt1069;
									local68 = this.anInt908;
									while (local66 != local68) {
										if (local66 > local68) {
											local686.method268(local66 - 1, local66);
											local66--;
										} else if (local66 < local68) {
											local686.method268(local66 + 1, local66);
											local66++;
										}
									}
								} else {
									local686.method268(this.anInt908, this.anInt1069);
								}
								this.aClass8_Sub1_Sub3_6.method141(220);
								this.aClass8_Sub1_Sub3_6.method142(local688);
								this.aClass8_Sub1_Sub3_6.method175(this.anInt1068);
								this.aClass8_Sub1_Sub3_6.method176(this.anInt908);
								this.aClass8_Sub1_Sub3_6.method143(this.anInt1069);
							}
						} else if ((this.anInt929 == 1 || this.method641(this.anInt1025 - 1, 22)) && this.anInt1025 > 2) {
							this.method597();
						} else if (this.anInt1025 > 0) {
							this.method659(this.anInt1025 - 1);
						}
						this.anInt1027 = 10;
						super.anInt845 = 0;
					}
				}
				@Pc(860) int local860;
				@Pc(862) int local862;
				if (Class32.anInt556 != -1) {
					local860 = Class32.anInt556;
					local862 = Class32.anInt557;
					@Pc(884) boolean local884 = this.method600(local862, 0, true, 0, aClass8_Sub1_Sub1_Sub1_Sub2_1.anIntArray183[0], 0, this.anInt928, 0, 0, local860, aClass8_Sub1_Sub1_Sub1_Sub2_1.anIntArray184[0], 0);
					Class32.anInt556 = -1;
					if (local884) {
						this.anInt1018 = super.anInt846;
						this.anInt1019 = super.anInt847;
						this.anInt1021 = 1;
						this.anInt1020 = 0;
					}
				}
				if (super.anInt845 == 1 && this.aString31 != null) {
					this.aString31 = null;
					this.aBoolean191 = true;
					super.anInt845 = 0;
				}
				this.method707();
				if (this.anInt957 == -1) {
					this.method717();
					this.method689();
					this.method722();
				}
				if (super.anInt839 == 1 || super.anInt845 == 1) {
					this.anInt1054++;
				}
				if (this.anInt900 == 0 && this.anInt885 == 0 && this.anInt888 == 0) {
					if (this.anInt949 > 0) {
						this.anInt949--;
					}
				} else if (this.anInt949 < 100) {
					this.anInt949++;
					if (this.anInt949 == 100) {
						if (this.anInt900 != 0) {
							this.aBoolean191 = true;
						}
						if (this.anInt885 != 0) {
							this.aBoolean217 = true;
						}
					}
				}
				if (this.anInt915 == 2) {
					this.method704();
				}
				if (this.anInt915 == 2 && this.aBoolean230) {
					this.method624();
				}
				for (local860 = 0; local860 < 5; local860++) {
					@Pc(1020) int local1020 = this.anIntArray246[local860]++;
				}
				this.method604();
				super.anInt838++;
				if (super.anInt838 > 4500) {
					this.anInt1048 = 250;
					super.anInt838 -= 500;
					this.aClass8_Sub1_Sub3_6.method141(217);
				}
				this.anInt870++;
				if (this.anInt870 > 500) {
					this.anInt870 = 0;
					local862 = (int) (Math.random() * 8.0D);
					if ((local862 & 0x1) == 1) {
						this.anInt1055 += this.anInt1056;
					}
					if ((local862 & 0x2) == 2) {
						this.anInt931 += this.anInt932;
					}
					if ((local862 & 0x4) == 4) {
						this.anInt854 += this.anInt855;
					}
				}
				if (this.anInt1055 < -50) {
					this.anInt1056 = 2;
				}
				if (this.anInt1055 > 50) {
					this.anInt1056 = -2;
				}
				if (this.anInt931 < -55) {
					this.anInt932 = 2;
				}
				if (this.anInt931 > 55) {
					this.anInt932 = -2;
				}
				if (this.anInt854 < -40) {
					this.anInt855 = 1;
				}
				if (this.anInt854 > 40) {
					this.anInt855 = -1;
				}
				this.anInt1003++;
				if (this.anInt1003 > 500) {
					this.anInt1003 = 0;
					local862 = (int) (Math.random() * 8.0D);
					if ((local862 & 0x1) == 1) {
						this.anInt1079 += this.anInt1080;
					}
					if ((local862 & 0x2) == 2) {
						this.anInt935 += this.anInt936;
					}
				}
				if (this.anInt1079 < -60) {
					this.anInt1080 = 2;
				}
				if (this.anInt1079 > 60) {
					this.anInt1080 = -2;
				}
				if (this.anInt935 < -20) {
					this.anInt936 = 1;
				}
				if (this.anInt935 > 10) {
					this.anInt936 = -1;
				}
				this.anInt1047++;
				if (this.anInt1047 > 50) {
					this.aClass8_Sub1_Sub3_6.method141(32);
				}
				try {
					if (this.aClass7_1 != null && this.aClass8_Sub1_Sub3_6.anInt239 > 0) {
						this.aClass7_1.method52(this.aClass8_Sub1_Sub3_6.aByteArray7, this.aClass8_Sub1_Sub3_6.anInt239);
						this.aClass8_Sub1_Sub3_6.anInt239 = 0;
						this.anInt1047 = 0;
					}
				} catch (@Pc(1266) IOException local1266) {
					this.method716();
				} catch (@Pc(1271) Exception local1271) {
					this.method639();
				}
			}
		} catch (@Pc(1276) RuntimeException local1276) {
			signlink.reporterror("6119, " + 6 + ", " + local1276.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ZILclient!IUVBENCV;)V")
	private void method663(@OriginalArg(1) int arg0, @OriginalArg(2) Class8_Sub1_Sub3 arg1) {
		try {
			while (true) {
				if (arg1.anInt240 + 21 < arg0 * 8) {
					@Pc(15) int local15 = arg1.method163(830, 14);
					if (local15 != 16383) {
						if (this.aClass8_Sub1_Sub1_Sub1_Sub1Array1[local15] == null) {
							this.aClass8_Sub1_Sub1_Sub1_Sub1Array1[local15] = new Class8_Sub1_Sub1_Sub1_Sub1();
						}
						@Pc(35) Class8_Sub1_Sub1_Sub1_Sub1 local35 = this.aClass8_Sub1_Sub1_Sub1_Sub1Array1[local15];
						this.anIntArray223[this.anInt950++] = local15;
						local35.anInt732 = anInt983;
						local35.aClass26_1 = Class26.method290(arg1.method163(830, 13));
						@Pc(61) int local61 = arg1.method163(830, 5);
						if (local61 > 15) {
							local61 -= 32;
						}
						@Pc(70) int local70 = arg1.method163(830, 1);
						@Pc(75) int local75 = arg1.method163(830, 1);
						if (local75 == 1) {
							this.anIntArray237[this.anInt969++] = local15;
						}
						@Pc(94) int local94 = arg1.method163(830, 5);
						if (local94 > 15) {
							local94 -= 32;
						}
						local35.anInt726 = local35.aClass26_1.aByte11;
						local35.anInt708 = local35.aClass26_1.anInt482;
						local35.anInt696 = local35.aClass26_1.anInt468;
						local35.anInt697 = local35.aClass26_1.anInt466;
						local35.anInt698 = local35.aClass26_1.anInt472;
						local35.anInt699 = local35.aClass26_1.anInt470;
						local35.anInt706 = local35.aClass26_1.anInt467;
						local35.method473(aClass8_Sub1_Sub1_Sub1_Sub2_1.anIntArray183[0] + local61, aClass8_Sub1_Sub1_Sub1_Sub2_1.anIntArray184[0] + local94, local70 == 1);
						continue;
					}
				}
				arg1.method164();
				return;
			}
		} catch (@Pc(161) RuntimeException local161) {
			signlink.reporterror("79638, " + false + ", " + arg0 + ", " + arg1 + ", " + local161.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IJ)V")
	private void method664(@OriginalArg(1) long arg0) {
		try {
			if (arg0 != 0L) {
				if (this.anInt1081 >= 100 && this.anInt937 != 1) {
					this.method694(0, "Your friendlist is full. Max of 100 for free users, and 200 for members", "");
				} else if (this.anInt1081 >= 200) {
					this.method694(0, "Your friendlist is full. Max of 100 for free users, and 200 for members", "");
				} else {
					@Pc(38) String local38 = Class36.method385(839, Class36.method382((byte) 3, arg0));
					for (@Pc(40) int local40 = 0; local40 < this.anInt1081; local40++) {
						if (this.aLongArray3[local40] == arg0) {
							this.method694(0, local38 + " is already on your friend list", "");
							return;
						}
					}
					for (@Pc(78) int local78 = 0; local78 < this.anInt917; local78++) {
						if (this.aLongArray4[local78] == arg0) {
							this.method694(0, "Please remove " + local38 + " from your ignore list first", "");
							return;
						}
					}
					if (!local38.equals(aClass8_Sub1_Sub1_Sub1_Sub2_1.aString15)) {
						this.aStringArray9[this.anInt1081] = local38;
						this.aLongArray3[this.anInt1081] = arg0;
						this.anIntArray267[this.anInt1081] = 0;
						this.anInt1081++;
						this.aBoolean217 = true;
						this.aClass8_Sub1_Sub3_6.method141(53);
						this.aClass8_Sub1_Sub3_6.method148(arg0);
					}
				}
			}
		} catch (@Pc(152) RuntimeException local152) {
			signlink.reporterror("11003, " + -633 + ", " + arg0 + ", " + local152.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(IIII)I")
	private int method665(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		try {
			@Pc(3) int local3 = 256 - arg2;
			this.anInt1044 += 0;
			return ((arg0 & 0xFF00FF) * local3 + (arg1 & 0xFF00FF) * arg2 & 0xFF00FF00) + ((arg0 & 0xFF00) * local3 + (arg1 & 0xFF00) * arg2 & 0xFF0000) >> 8;
		} catch (@Pc(40) RuntimeException local40) {
			signlink.reporterror("79407, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 0 + ", " + local40.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "x", descriptor = "(I)V")
	private void method666() {
		try {
			this.aClass8_Sub1_Sub3_6.method141(176);
			if (this.anInt934 != -1) {
				this.method609(aByte21, this.anInt934);
				this.anInt934 = -1;
				this.aBoolean217 = true;
				this.aBoolean211 = false;
				this.aBoolean195 = true;
			}
			if (this.anInt973 != -1) {
				this.method609(aByte21, this.anInt973);
				this.anInt973 = -1;
				this.aBoolean191 = true;
				this.aBoolean211 = false;
			}
			if (this.anInt957 != -1) {
				this.method609(aByte21, this.anInt957);
				this.anInt957 = -1;
				this.aBoolean219 = true;
			}
			if (this.anInt911 != -1) {
				this.method609(aByte21, this.anInt911);
				this.anInt911 = -1;
			}
			if (this.anInt1077 != -1) {
				this.method609(aByte21, this.anInt1077);
				this.anInt1077 = -1;
			}
		} catch (@Pc(94) RuntimeException local94) {
			signlink.reporterror("52978, " + 35004 + ", " + local94.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "j", descriptor = "(Z)Z")
	private boolean method667() {
		try {
			if (this.aClass7_1 == null) {
				return false;
			}
			@Pc(1817) String local1817;
			@Pc(185) int local185;
			try {
				@Pc(15) int local15 = this.aClass7_1.method50();
				if (local15 == 0) {
					return false;
				}
				if (this.anInt1045 == -1) {
					this.aClass7_1.method51(this.aClass8_Sub1_Sub3_9.aByteArray7, 0, 1);
					this.anInt1045 = this.aClass8_Sub1_Sub3_9.aByteArray7[0] & 0xFF;
					if (this.aClass18_2 != null) {
						this.anInt1045 = this.anInt1045 - this.aClass18_2.method135() & 0xFF;
					}
					this.anInt1044 = Class20.anIntArray52[this.anInt1045];
					local15--;
				}
				if (this.anInt1044 == -1) {
					if (local15 <= 0) {
						return false;
					}
					this.aClass7_1.method51(this.aClass8_Sub1_Sub3_9.aByteArray7, 0, 1);
					this.anInt1044 = this.aClass8_Sub1_Sub3_9.aByteArray7[0] & 0xFF;
					local15--;
				}
				if (this.anInt1044 == -2) {
					if (local15 <= 1) {
						return false;
					}
					this.aClass7_1.method51(this.aClass8_Sub1_Sub3_9.aByteArray7, 0, 2);
					this.aClass8_Sub1_Sub3_9.anInt239 = 0;
					this.anInt1044 = this.aClass8_Sub1_Sub3_9.method154();
					local15 -= 2;
				}
				if (local15 < this.anInt1044) {
					return false;
				}
				this.aClass8_Sub1_Sub3_9.anInt239 = 0;
				this.aClass7_1.method51(this.aClass8_Sub1_Sub3_9.aByteArray7, 0, this.anInt1044);
				this.anInt1046 = 0;
				this.anInt1006 = this.anInt1005;
				this.anInt1005 = this.anInt1004;
				this.anInt1004 = this.anInt1045;
				if (this.anInt1045 == 23) {
					this.anInt937 = this.aClass8_Sub1_Sub3_9.method171(this.anInt906);
					this.anInt987 = this.aClass8_Sub1_Sub3_9.method154();
					this.anInt1045 = -1;
					return true;
				}
				@Pc(190) int local190;
				@Pc(181) int local181;
				if (this.anInt1045 == 97) {
					local181 = this.aClass8_Sub1_Sub3_9.method179();
					local185 = this.aClass8_Sub1_Sub3_9.method155();
					local190 = this.aClass8_Sub1_Sub3_9.method182();
					@Pc(193) Class24 local193 = Class24.method269(local181);
					local193.anInt410 = local185;
					local193.anInt395 = local190;
					this.anInt1045 = -1;
					return true;
				}
				if (this.anInt1045 == 219) {
					@Pc(219) boolean local219 = this.aClass8_Sub1_Sub3_9.method170(this.aBoolean224) == 1;
					local185 = this.aClass8_Sub1_Sub3_9.method178();
					Class24.method269(local185).aBoolean98 = local219;
					this.anInt1045 = -1;
					return true;
				}
				if (this.anInt1045 == 210) {
					this.anInt956 = this.aClass8_Sub1_Sub3_9.method152();
					if (this.anInt956 == this.anInt1060) {
						if (this.anInt956 == 3) {
							this.anInt1060 = 1;
						} else {
							this.anInt1060 = 3;
						}
						this.aBoolean217 = true;
					}
					this.anInt1045 = -1;
					return true;
				}
				if (this.anInt1045 == 19) {
					this.method623(this.anInt1044, this.anInt941, this.aClass8_Sub1_Sub3_9);
					this.anInt1045 = -1;
					return true;
				}
				if (this.anInt1045 == 233) {
					this.method723(this.aClass8_Sub1_Sub3_9, this.anInt1044, this.aByte29);
					this.aBoolean215 = false;
					this.anInt1045 = -1;
					return true;
				}
				if (this.anInt1045 == 155) {
					local181 = this.aClass8_Sub1_Sub3_9.method154();
					if (local181 == 65535) {
						local181 = -1;
					}
					if (local181 != this.anInt910 && this.aBoolean194 && !aBoolean237 && this.anInt918 == 0) {
						this.anInt1058 = local181;
						this.aBoolean231 = true;
						this.aClass4_Sub1_1.method41(2, this.anInt1058);
					}
					this.anInt910 = local181;
					this.anInt1045 = -1;
					return true;
				}
				if (this.anInt1045 == 225) {
					local181 = this.aClass8_Sub1_Sub3_9.method183();
					local185 = this.aClass8_Sub1_Sub3_9.method154();
					if (this.aBoolean194 && !aBoolean237) {
						this.anInt1058 = local185;
						this.aBoolean231 = false;
						this.aClass4_Sub1_1.method41(2, this.anInt1058);
						this.anInt918 = local181;
					}
					this.anInt1045 = -1;
					return true;
				}
				if (this.anInt1045 == 213) {
					this.anInt1010 = this.aClass8_Sub1_Sub3_9.method170(this.aBoolean224);
					this.anInt1009 = this.aClass8_Sub1_Sub3_9.method171(this.anInt906);
					this.anInt1045 = -1;
					return true;
				}
				if (this.anInt1045 == 236) {
					this.anInt1052 = this.aClass8_Sub1_Sub3_9.method152();
					this.anInt1045 = -1;
					return true;
				}
				if (this.anInt1045 == 247) {
					this.method639();
					this.anInt1045 = -1;
					return false;
				}
				@Pc(447) Class24 local447;
				if (this.anInt1045 == 30) {
					local181 = this.aClass8_Sub1_Sub3_9.method154();
					local447 = Class24.method269(local181);
					for (local190 = 0; local190 < local447.anIntArray119.length; local190++) {
						local447.anIntArray119[local190] = -1;
						local447.anIntArray119[local190] = 0;
					}
					this.anInt1045 = -1;
					return true;
				}
				if (this.anInt1045 == 230) {
					local181 = this.aClass8_Sub1_Sub3_9.method154();
					local185 = this.aClass8_Sub1_Sub3_9.method152();
					local190 = this.aClass8_Sub1_Sub3_9.method154();
					if (local190 == 65535) {
						if (this.anInt1031 < 50) {
							this.anIntArray235[this.anInt1031] = (short) local181;
							this.anIntArray214[this.anInt1031] = local185;
							this.anIntArray243[this.anInt1031] = 0;
							this.anInt1031++;
						}
					} else if (this.aBoolean212 && !aBoolean237 && this.anInt1031 < 50) {
						this.anIntArray235[this.anInt1031] = local181;
						this.anIntArray214[this.anInt1031] = local185;
						this.anIntArray243[this.anInt1031] = local190 + Class35.anIntArray162[local181];
						this.anInt1031++;
					}
					this.anInt1045 = -1;
					return true;
				}
				@Pc(581) int local581;
				@Pc(585) int local585;
				@Pc(606) int local606;
				@Pc(573) long local573;
				@Pc(583) boolean local583;
				@Pc(652) String local652;
				if (this.anInt1045 == 208) {
					local573 = this.aClass8_Sub1_Sub3_9.method158();
					local190 = this.aClass8_Sub1_Sub3_9.method157();
					local581 = this.aClass8_Sub1_Sub3_9.method152();
					local583 = false;
					for (local585 = 0; local585 < 100; local585++) {
						if (this.anIntArray244[local585] == local190) {
							local583 = true;
							break;
						}
					}
					if (local581 <= 1) {
						for (local606 = 0; local606 < this.anInt917; local606++) {
							if (this.aLongArray4[local606] == local573) {
								local583 = true;
								break;
							}
						}
					}
					if (!local583 && this.anInt1043 == 0) {
						try {
							this.anIntArray244[this.anInt903] = local190;
							this.anInt903 = (this.anInt903 + 1) % 100;
							local652 = Class30.method312(448, this.anInt1044 - 13, this.aClass8_Sub1_Sub3_9);
							if (local581 != 3) {
								local652 = Class47.method498(local652);
							}
							if (local581 == 2 || local581 == 3) {
								this.method694(7, local652, "@cr2@" + Class36.method385(839, Class36.method382((byte) 3, local573)));
							} else if (local581 == 1) {
								this.method694(7, local652, "@cr1@" + Class36.method385(839, Class36.method382((byte) 3, local573)));
							} else {
								this.method694(3, local652, Class36.method385(839, Class36.method382((byte) 3, local573)));
							}
						} catch (@Pc(716) Exception local716) {
							signlink.reporterror("cde1");
						}
					}
					this.anInt1045 = -1;
					return true;
				}
				@Pc(741) Class24 local741;
				if (this.anInt1045 == 178) {
					local181 = this.aClass8_Sub1_Sub3_9.method182();
					local185 = this.aClass8_Sub1_Sub3_9.method178();
					local741 = Class24.method269(local185);
					if (local741.anInt406 != local181 || local181 == -1) {
						local741.anInt406 = local181;
						local741.anInt397 = 0;
						local741.anInt412 = 0;
					}
					this.anInt1045 = -1;
					return true;
				}
				if (this.anInt1045 == 202) {
					this.anInt1009 = this.aClass8_Sub1_Sub3_9.method171(this.anInt906);
					this.anInt1010 = this.aClass8_Sub1_Sub3_9.method152();
					while (this.aClass8_Sub1_Sub3_9.anInt239 < this.anInt1044) {
						local181 = this.aClass8_Sub1_Sub3_9.method152();
						this.method697(local181, this.aClass8_Sub1_Sub3_9);
					}
					this.anInt1045 = -1;
					return true;
				}
				if (this.anInt1045 == 180) {
					this.anInt982 = this.aClass8_Sub1_Sub3_9.method178();
					this.anInt974 = this.aClass8_Sub1_Sub3_9.method186(this.anInt1076);
					this.anInt853 = this.aClass8_Sub1_Sub3_9.method180(this.anInt923);
					this.anInt872 = this.aClass8_Sub1_Sub3_9.method180(this.anInt923);
					this.anInt942 = this.aClass8_Sub1_Sub3_9.method154();
					this.anInt986 = this.aClass8_Sub1_Sub3_9.method154();
					this.aClass8_Sub1_Sub3_9.method180(this.anInt923);
					this.anInt1011 = this.aClass8_Sub1_Sub3_9.method178();
					this.anInt1024 = this.aClass8_Sub1_Sub3_9.method180(this.anInt923);
					this.aClass8_Sub1_Sub3_9.method152();
					this.anInt1014 = this.aClass8_Sub1_Sub3_9.method180(this.anInt923);
					signlink.dnslookup(Class36.method384(this.anInt974));
					this.anInt1045 = -1;
					return true;
				}
				@Pc(913) int local913;
				if (this.anInt1045 == 181) {
					local181 = this.aClass8_Sub1_Sub3_9.method180(this.anInt923);
					local185 = this.aClass8_Sub1_Sub3_9.method179();
					local190 = local181 >> 10 & 0x1F;
					local581 = local181 >> 5 & 0x1F;
					local913 = local181 & 0x1F;
					Class24.method269(local185).anInt403 = (local190 << 19) + (local581 << 11) + (local913 << 3);
					this.anInt1045 = -1;
					return true;
				}
				if (this.anInt1045 == 237) {
					this.aBoolean217 = true;
					local181 = this.aClass8_Sub1_Sub3_9.method169();
					local185 = this.aClass8_Sub1_Sub3_9.method185();
					local190 = this.aClass8_Sub1_Sub3_9.method170(this.aBoolean224);
					this.anIntArray273[local181] = local185;
					this.anIntArray272[local181] = local190;
					this.anIntArray217[local181] = 1;
					for (local581 = 0; local581 < 98; local581++) {
						if (local185 >= anIntArray215[local581]) {
							this.anIntArray217[local181] = local581 + 2;
						}
					}
					this.anInt1045 = -1;
					return true;
				}
				if (this.anInt1045 == 43) {
					for (local181 = 0; local181 < this.anIntArray218.length; local181++) {
						if (this.anIntArray218[local181] != this.anIntArray234[local181]) {
							this.anIntArray218[local181] = this.anIntArray234[local181];
							this.method592(local181);
							this.aBoolean217 = true;
						}
					}
					this.anInt1045 = -1;
					return true;
				}
				if (this.anInt1045 == 120) {
					this.anInt1078 = this.aClass8_Sub1_Sub3_9.method152();
					if (this.anInt1078 == 1) {
						this.anInt852 = this.aClass8_Sub1_Sub3_9.method154();
					}
					if (this.anInt1078 >= 2 && this.anInt1078 <= 6) {
						if (this.anInt1078 == 2) {
							this.anInt999 = 64;
							this.anInt1000 = 64;
						}
						if (this.anInt1078 == 3) {
							this.anInt999 = 0;
							this.anInt1000 = 64;
						}
						if (this.anInt1078 == 4) {
							this.anInt999 = 128;
							this.anInt1000 = 64;
						}
						if (this.anInt1078 == 5) {
							this.anInt999 = 64;
							this.anInt1000 = 0;
						}
						if (this.anInt1078 == 6) {
							this.anInt999 = 64;
							this.anInt1000 = 128;
						}
						this.anInt1078 = 2;
						this.anInt996 = this.aClass8_Sub1_Sub3_9.method154();
						this.anInt997 = this.aClass8_Sub1_Sub3_9.method154();
						this.anInt998 = this.aClass8_Sub1_Sub3_9.method152();
					}
					if (this.anInt1078 == 10) {
						this.anInt884 = this.aClass8_Sub1_Sub3_9.method154();
					}
					this.anInt1045 = -1;
					return true;
				}
				if (this.anInt1045 == 189) {
					local181 = this.aClass8_Sub1_Sub3_9.method180(this.anInt923);
					local185 = this.aClass8_Sub1_Sub3_9.method180(this.anInt923);
					local190 = this.aClass8_Sub1_Sub3_9.method179();
					local581 = this.aClass8_Sub1_Sub3_9.method178();
					Class24.method269(local181).anInt420 = local190;
					Class24.method269(local181).anInt421 = local185;
					Class24.method269(local181).anInt419 = local581;
					this.anInt1045 = -1;
					return true;
				}
				if (this.anInt1045 == 83) {
					local181 = this.aClass8_Sub1_Sub3_9.method178();
					this.method647(local181);
					if (this.anInt934 != -1) {
						this.method609(aByte21, this.anInt934);
						this.anInt934 = -1;
						this.aBoolean217 = true;
						this.aBoolean195 = true;
					}
					if (this.anInt973 != -1) {
						this.method609(aByte21, this.anInt973);
						this.anInt973 = -1;
						this.aBoolean191 = true;
					}
					if (this.anInt957 != -1) {
						this.method609(aByte21, this.anInt957);
						this.anInt957 = -1;
						this.aBoolean219 = true;
					}
					if (this.anInt911 != -1) {
						this.method609(aByte21, this.anInt911);
						this.anInt911 = -1;
					}
					if (this.anInt1077 != local181) {
						this.method609(aByte21, this.anInt1077);
						this.anInt1077 = local181;
					}
					if (this.anInt940 != 0) {
						this.anInt940 = 0;
						this.aBoolean191 = true;
					}
					this.aBoolean211 = false;
					this.anInt1045 = -1;
					return true;
				}
				if (this.anInt1045 == 159) {
					this.aBoolean230 = false;
					for (local181 = 0; local181 < 5; local181++) {
						this.aBooleanArray12[local181] = false;
					}
					this.anInt1045 = -1;
					return true;
				}
				if (this.anInt1045 == 55 || this.anInt1045 == 114 || this.anInt1045 == 137 || this.anInt1045 == 1 || this.anInt1045 == 39 || this.anInt1045 == 68 || this.anInt1045 == 112 || this.anInt1045 == 125 || this.anInt1045 == 115 || this.anInt1045 == 132 || this.anInt1045 == 75) {
					this.method697(this.anInt1045, this.aClass8_Sub1_Sub3_9);
					this.anInt1045 = -1;
					return true;
				}
				if (this.anInt1045 == 56) {
					local181 = this.aClass8_Sub1_Sub3_9.method184();
					local185 = this.aClass8_Sub1_Sub3_9.method179();
					this.anIntArray234[local185] = local181;
					if (this.anIntArray218[local185] != local181) {
						this.anIntArray218[local185] = local181;
						this.method592(local185);
						this.aBoolean217 = true;
						if (this.anInt1022 != -1) {
							this.aBoolean191 = true;
						}
					}
					this.anInt1045 = -1;
					return true;
				}
				if (this.anInt1045 == 6) {
					for (local181 = 0; local181 < this.aClass8_Sub1_Sub1_Sub1_Sub2Array1.length; local181++) {
						if (this.aClass8_Sub1_Sub1_Sub1_Sub2Array1[local181] != null) {
							this.aClass8_Sub1_Sub1_Sub1_Sub2Array1[local181].anInt711 = -1;
						}
					}
					for (local185 = 0; local185 < this.aClass8_Sub1_Sub1_Sub1_Sub1Array1.length; local185++) {
						if (this.aClass8_Sub1_Sub1_Sub1_Sub1Array1[local185] != null) {
							this.aClass8_Sub1_Sub1_Sub1_Sub1Array1[local185].anInt711 = -1;
						}
					}
					this.anInt1045 = -1;
					return true;
				}
				if (this.anInt1045 == 52) {
					local181 = this.aClass8_Sub1_Sub3_9.method178();
					local185 = this.aClass8_Sub1_Sub3_9.method180(this.anInt923);
					local190 = this.aClass8_Sub1_Sub3_9.method178();
					Class24.method269(local190).anInt398 = (local185 << 16) + local181;
					this.anInt1045 = -1;
					return true;
				}
				if (this.anInt1045 == 161) {
					local181 = this.aClass8_Sub1_Sub3_9.method180(this.anInt923);
					local185 = this.aClass8_Sub1_Sub3_9.method180(this.anInt923);
					Class24.method269(local181).anInt408 = 1;
					Class24.method269(local181).anInt409 = local185;
					this.anInt1045 = -1;
					return true;
				}
				if (this.anInt1045 == 46) {
					this.anInt871 = this.aClass8_Sub1_Sub3_9.method154() * 30;
					this.anInt1045 = -1;
					return true;
				}
				if (this.anInt1045 == 153) {
					if (this.anInt1060 == 12) {
						this.aBoolean217 = true;
					}
					this.anInt1073 = this.aClass8_Sub1_Sub3_9.method155();
					this.anInt1045 = -1;
					return true;
				}
				if (this.anInt1045 == 88) {
					this.anInt1009 = this.aClass8_Sub1_Sub3_9.method169();
					this.anInt1010 = this.aClass8_Sub1_Sub3_9.method171(this.anInt906);
					for (local181 = this.anInt1009; local181 < this.anInt1009 + 8; local181++) {
						for (local185 = this.anInt1010; local185 < this.anInt1010 + 8; local185++) {
							if (this.aClass49ArrayArrayArray1[this.anInt933][local181][local185] != null) {
								this.aClass49ArrayArrayArray1[this.anInt933][local181][local185] = null;
								this.method633(local181, local185);
							}
						}
					}
					for (@Pc(1641) Class8_Sub3 local1641 = (Class8_Sub3) this.aClass49_12.method538(); local1641 != null; local1641 = (Class8_Sub3) this.aClass49_12.method540((byte) 6)) {
						if (local1641.anInt315 >= this.anInt1009 && local1641.anInt315 < this.anInt1009 + 8 && local1641.anInt316 >= this.anInt1010 && local1641.anInt316 < this.anInt1010 + 8 && local1641.anInt313 == this.anInt933) {
							local1641.anInt311 = 0;
						}
					}
					this.anInt1045 = -1;
					return true;
				}
				if (this.anInt1045 == 38) {
					local181 = this.aClass8_Sub1_Sub3_9.method154();
					local185 = this.aClass8_Sub1_Sub3_9.method180(this.anInt923);
					local741 = Class24.method269(local185);
					if (local741 != null && local741.anInt423 == 0) {
						if (local181 < 0) {
							local181 = 0;
						}
						if (local181 > local741.anInt417 - local741.anInt430) {
							local181 = local741.anInt417 - local741.anInt430;
						}
						local741.anInt405 = local181;
					}
					this.anInt1045 = -1;
					return true;
				}
				if (this.anInt1045 == 254) {
					this.aBoolean217 = true;
					local181 = this.aClass8_Sub1_Sub3_9.method154();
					local447 = Class24.method269(local181);
					local190 = this.aClass8_Sub1_Sub3_9.method154();
					for (local581 = 0; local581 < local190; local581++) {
						local447.anIntArray119[local581] = this.aClass8_Sub1_Sub3_9.method154();
						local913 = this.aClass8_Sub1_Sub3_9.method152();
						if (local913 == 255) {
							local913 = this.aClass8_Sub1_Sub3_9.method184();
						}
						local447.anIntArray120[local581] = local913;
					}
					for (local913 = local190; local913 < local447.anIntArray119.length; local913++) {
						local447.anIntArray119[local913] = 0;
						local447.anIntArray120[local913] = 0;
					}
					this.anInt1045 = -1;
					return true;
				}
				if (this.anInt1045 == 0) {
					local1817 = this.aClass8_Sub1_Sub3_9.method159();
					local185 = this.aClass8_Sub1_Sub3_9.method170(this.aBoolean224);
					local190 = this.aClass8_Sub1_Sub3_9.method171(this.anInt906);
					if (local185 >= 1 && local185 <= 5) {
						if (local1817.equalsIgnoreCase("null")) {
							local1817 = null;
						}
						this.aStringArray10[local185 - 1] = local1817;
						this.aBooleanArray11[local185 - 1] = local190 == 0;
					}
					this.anInt1045 = -1;
					return true;
				}
				if (this.anInt1045 == 186) {
					this.aBoolean201 = false;
					this.anInt940 = 1;
					this.aString19 = "";
					this.aBoolean191 = true;
					this.anInt1045 = -1;
					return true;
				}
				if (this.anInt1045 == 160) {
					this.anInt988 = this.aClass8_Sub1_Sub3_9.method152();
					this.anInt1016 = this.aClass8_Sub1_Sub3_9.method152();
					this.anInt976 = this.aClass8_Sub1_Sub3_9.method152();
					this.aBoolean204 = true;
					this.aBoolean191 = true;
					this.anInt1045 = -1;
					return true;
				}
				if (this.anInt1045 == 35) {
					local181 = this.aClass8_Sub1_Sub3_9.method181();
					if (local181 != this.anInt1022) {
						this.method609(aByte21, this.anInt1022);
						this.anInt1022 = local181;
					}
					this.aBoolean191 = true;
					this.anInt1045 = -1;
					return true;
				}
				if (this.anInt1045 == 205) {
					this.aBoolean230 = true;
					this.anInt944 = this.aClass8_Sub1_Sub3_9.method152();
					this.anInt945 = this.aClass8_Sub1_Sub3_9.method152();
					this.anInt946 = this.aClass8_Sub1_Sub3_9.method154();
					this.anInt947 = this.aClass8_Sub1_Sub3_9.method152();
					this.anInt948 = this.aClass8_Sub1_Sub3_9.method152();
					if (this.anInt948 >= 100) {
						local181 = this.anInt944 * 128 + 64;
						local185 = this.anInt945 * 128 + 64;
						local190 = this.method680(local185, this.anInt933, local181) - this.anInt946;
						local581 = local181 - this.anInt877;
						local913 = local190 - this.anInt878;
						local585 = local185 - this.anInt879;
						local606 = (int) Math.sqrt((double) (local581 * local581 + local585 * local585));
						this.anInt880 = (int) (Math.atan2((double) local913, (double) local606) * 325.949D) & 0x7FF;
						this.anInt881 = (int) (Math.atan2((double) local581, (double) local585) * -325.949D) & 0x7FF;
						if (this.anInt880 < 128) {
							this.anInt880 = 128;
						}
						if (this.anInt880 > 383) {
							this.anInt880 = 383;
						}
					}
					this.anInt1045 = -1;
					return true;
				}
				if (this.anInt1045 == 175) {
					local181 = this.aClass8_Sub1_Sub3_9.method179();
					this.method647(local181);
					if (this.anInt973 != -1) {
						this.method609(aByte21, this.anInt973);
						this.anInt973 = -1;
						this.aBoolean191 = true;
					}
					if (this.anInt957 != -1) {
						this.method609(aByte21, this.anInt957);
						this.anInt957 = -1;
						this.aBoolean219 = true;
					}
					if (this.anInt911 != -1) {
						this.method609(aByte21, this.anInt911);
						this.anInt911 = -1;
					}
					if (this.anInt1077 != -1) {
						this.method609(aByte21, this.anInt1077);
						this.anInt1077 = -1;
					}
					if (this.anInt934 != local181) {
						this.method609(aByte21, this.anInt934);
						this.anInt934 = local181;
					}
					if (this.anInt940 != 0) {
						this.anInt940 = 0;
						this.aBoolean191 = true;
					}
					this.aBoolean217 = true;
					this.aBoolean195 = true;
					this.aBoolean211 = false;
					this.anInt1045 = -1;
					return true;
				}
				if (this.anInt1045 == 21) {
					local181 = this.aClass8_Sub1_Sub3_9.method154();
					Class24.method269(local181).anInt408 = 3;
					if (aClass8_Sub1_Sub1_Sub1_Sub2_1.aClass26_2 == null) {
						Class24.method269(local181).anInt409 = (aClass8_Sub1_Sub1_Sub1_Sub2_1.anIntArray189[0] << 25) + (aClass8_Sub1_Sub1_Sub1_Sub2_1.anIntArray189[4] << 20) + (aClass8_Sub1_Sub1_Sub1_Sub2_1.anIntArray188[0] << 15) + (aClass8_Sub1_Sub1_Sub1_Sub2_1.anIntArray188[8] << 10) + (aClass8_Sub1_Sub1_Sub1_Sub2_1.anIntArray188[11] << 5) + aClass8_Sub1_Sub1_Sub1_Sub2_1.anIntArray188[1];
					} else {
						Class24.method269(local181).anInt409 = (int) (aClass8_Sub1_Sub1_Sub1_Sub2_1.aClass26_2.aLong18 + 305419896L);
					}
					this.anInt1045 = -1;
					return true;
				}
				if (this.anInt1045 == 170) {
					this.anInt971 = 0;
					this.anInt1045 = -1;
					return true;
				}
				if (this.anInt1045 == 50) {
					this.anInt1001 = this.aClass8_Sub1_Sub3_9.method152();
					this.anInt1045 = -1;
					return true;
				}
				if (this.anInt1045 == 200) {
					this.aBoolean217 = true;
					local181 = this.aClass8_Sub1_Sub3_9.method154();
					local447 = Class24.method269(local181);
					while (this.aClass8_Sub1_Sub3_9.anInt239 < this.anInt1044) {
						local190 = this.aClass8_Sub1_Sub3_9.method166();
						local581 = this.aClass8_Sub1_Sub3_9.method154();
						local913 = this.aClass8_Sub1_Sub3_9.method152();
						if (local913 == 255) {
							local913 = this.aClass8_Sub1_Sub3_9.method157();
						}
						if (local190 >= 0 && local190 < local447.anIntArray119.length) {
							local447.anIntArray119[local190] = local581;
							local447.anIntArray120[local190] = local913;
						}
					}
					this.anInt1045 = -1;
					return true;
				}
				@Pc(2494) int local2494;
				if (this.anInt1045 == 25) {
					local573 = this.aClass8_Sub1_Sub3_9.method158();
					local190 = this.aClass8_Sub1_Sub3_9.method152();
					@Pc(2357) String local2357 = Class36.method385(839, Class36.method382((byte) 3, local573));
					for (local913 = 0; local913 < this.anInt1081; local913++) {
						if (local573 == this.aLongArray3[local913]) {
							if (this.anIntArray267[local913] != local190) {
								this.anIntArray267[local913] = local190;
								this.aBoolean217 = true;
								if (local190 > 0) {
									this.method694(5, local2357 + " has logged in.", "");
								}
								if (local190 == 0) {
									this.method694(5, local2357 + " has logged out.", "");
								}
							}
							local2357 = null;
							break;
						}
					}
					if (local2357 != null && this.anInt1081 < 200) {
						this.aLongArray3[this.anInt1081] = local573;
						this.aStringArray9[this.anInt1081] = local2357;
						this.anIntArray267[this.anInt1081] = local190;
						this.anInt1081++;
						this.aBoolean217 = true;
					}
					@Pc(2455) boolean local2455 = false;
					while (!local2455) {
						local2455 = true;
						for (local606 = 0; local606 < this.anInt1081 - 1; local606++) {
							if (this.anIntArray267[local606] != anInt1074 && this.anIntArray267[local606 + 1] == anInt1074 || this.anIntArray267[local606] == 0 && this.anIntArray267[local606 + 1] != 0) {
								local2494 = this.anIntArray267[local606];
								this.anIntArray267[local606] = this.anIntArray267[local606 + 1];
								this.anIntArray267[local606 + 1] = local2494;
								@Pc(2516) String local2516 = this.aStringArray9[local606];
								this.aStringArray9[local606] = this.aStringArray9[local606 + 1];
								this.aStringArray9[local606 + 1] = local2516;
								@Pc(2538) long local2538 = this.aLongArray3[local606];
								this.aLongArray3[local606] = this.aLongArray3[local606 + 1];
								this.aLongArray3[local606 + 1] = local2538;
								this.aBoolean217 = true;
								local2455 = false;
							}
						}
					}
					this.anInt1045 = -1;
					return true;
				}
				if (this.anInt1045 == 142) {
					local181 = this.aClass8_Sub1_Sub3_9.method179();
					this.method647(local181);
					if (this.anInt934 != -1) {
						this.method609(aByte21, this.anInt934);
						this.anInt934 = -1;
						this.aBoolean217 = true;
						this.aBoolean195 = true;
					}
					if (this.anInt957 != -1) {
						this.method609(aByte21, this.anInt957);
						this.anInt957 = -1;
						this.aBoolean219 = true;
					}
					if (this.anInt911 != -1) {
						this.method609(aByte21, this.anInt911);
						this.anInt911 = -1;
					}
					if (this.anInt1077 != -1) {
						this.method609(aByte21, this.anInt1077);
						this.anInt1077 = -1;
					}
					if (this.anInt973 != local181) {
						this.method609(aByte21, this.anInt973);
						this.anInt973 = local181;
					}
					this.aBoolean211 = false;
					this.aBoolean191 = true;
					this.anInt1045 = -1;
					return true;
				}
				if (this.anInt1045 == 177) {
					local181 = this.aClass8_Sub1_Sub3_9.method152();
					local185 = this.aClass8_Sub1_Sub3_9.method152();
					local190 = this.aClass8_Sub1_Sub3_9.method152();
					local581 = this.aClass8_Sub1_Sub3_9.method152();
					this.aBooleanArray12[local181] = true;
					this.anIntArray222[local181] = local185;
					this.anIntArray233[local181] = local190;
					this.anIntArray276[local181] = local581;
					this.anIntArray246[local181] = 0;
					this.anInt1045 = -1;
					return true;
				}
				if (this.anInt1045 == 109) {
					local181 = this.aClass8_Sub1_Sub3_9.method155();
					if (local181 >= 0) {
						this.method647(local181);
					}
					if (local181 != this.anInt905) {
						this.method609(aByte21, this.anInt905);
						this.anInt905 = local181;
					}
					this.anInt1045 = -1;
					return true;
				}
				if (this.anInt1045 == 239) {
					local181 = this.aClass8_Sub1_Sub3_9.method154();
					local185 = this.aClass8_Sub1_Sub3_9.method171(this.anInt906);
					if (local181 == 65535) {
						local181 = -1;
					}
					if (this.anIntArray249[local185] != local181) {
						this.method609(aByte21, this.anIntArray249[local185]);
						this.anIntArray249[local185] = local181;
					}
					this.aBoolean217 = true;
					this.aBoolean195 = true;
					this.anInt1045 = -1;
					return true;
				}
				if (this.anInt1045 == 61) {
					local181 = this.aClass8_Sub1_Sub3_9.method154();
					local185 = this.aClass8_Sub1_Sub3_9.method179();
					local190 = this.aClass8_Sub1_Sub3_9.method179();
					if (local190 == 65535) {
						Class24.method269(local185).anInt408 = 0;
						this.anInt1045 = -1;
						return true;
					}
					@Pc(2829) Class19 local2829 = Class19.method191(local190);
					Class24.method269(local185).anInt408 = 4;
					Class24.method269(local185).anInt409 = local190;
					Class24.method269(local185).anInt420 = local2829.anInt272;
					Class24.method269(local185).anInt421 = local2829.anInt250;
					Class24.method269(local185).anInt419 = local2829.anInt266 * 100 / local181;
					this.anInt1045 = -1;
					return true;
				}
				if (this.anInt1045 == 235) {
					this.aBoolean201 = false;
					this.anInt940 = 2;
					this.aString19 = "";
					this.aBoolean191 = true;
					this.anInt1045 = -1;
					return true;
				}
				if (this.anInt1045 == 84) {
					this.anInt1060 = this.aClass8_Sub1_Sub3_9.method171(this.anInt906);
					this.aBoolean217 = true;
					this.aBoolean195 = true;
					this.anInt1045 = -1;
					return true;
				}
				if (this.anInt1045 == 255) {
					local181 = this.aClass8_Sub1_Sub3_9.method178();
					local185 = this.aClass8_Sub1_Sub3_9.method154();
					Class24.method269(local185).anInt408 = 2;
					Class24.method269(local185).anInt409 = local181;
					this.anInt1045 = -1;
					return true;
				}
				@Pc(2949) String local2949;
				if (this.anInt1045 == 111) {
					local1817 = this.aClass8_Sub1_Sub3_9.method159();
					@Pc(2952) long local2952;
					if (local1817.endsWith(":tradereq:")) {
						local2949 = local1817.substring(0, local1817.indexOf(":"));
						local2952 = Class36.method381(local2949);
						local583 = false;
						for (local585 = 0; local585 < this.anInt917; local585++) {
							if (this.aLongArray4[local585] == local2952) {
								local583 = true;
								break;
							}
						}
						if (!local583 && this.anInt1043 == 0) {
							this.method694(4, "wishes to trade with you.", local2949);
						}
					} else if (local1817.endsWith(":duelreq:")) {
						local2949 = local1817.substring(0, local1817.indexOf(":"));
						local2952 = Class36.method381(local2949);
						local583 = false;
						for (local585 = 0; local585 < this.anInt917; local585++) {
							if (this.aLongArray4[local585] == local2952) {
								local583 = true;
								break;
							}
						}
						if (!local583 && this.anInt1043 == 0) {
							this.method694(8, "wishes to duel with you.", local2949);
						}
					} else if (local1817.endsWith(":chalreq:")) {
						local2949 = local1817.substring(0, local1817.indexOf(":"));
						local2952 = Class36.method381(local2949);
						local583 = false;
						for (local585 = 0; local585 < this.anInt917; local585++) {
							if (this.aLongArray4[local585] == local2952) {
								local583 = true;
								break;
							}
						}
						if (!local583 && this.anInt1043 == 0) {
							local652 = local1817.substring(local1817.indexOf(":") + 1, local1817.length() - 9);
							this.method694(8, local652, local2949);
						}
					} else {
						this.method694(0, local1817, "");
					}
					this.anInt1045 = -1;
					return true;
				}
				if (this.anInt1045 == 156) {
					this.aBoolean230 = true;
					this.anInt1038 = this.aClass8_Sub1_Sub3_9.method152();
					this.anInt1039 = this.aClass8_Sub1_Sub3_9.method152();
					this.anInt1040 = this.aClass8_Sub1_Sub3_9.method154();
					this.anInt1041 = this.aClass8_Sub1_Sub3_9.method152();
					this.anInt1042 = this.aClass8_Sub1_Sub3_9.method152();
					if (this.anInt1042 >= 100) {
						this.anInt877 = this.anInt1038 * 128 + 64;
						this.anInt879 = this.anInt1039 * 128 + 64;
						this.anInt878 = this.method680(this.anInt879, this.anInt933, this.anInt877) - this.anInt1040;
					}
					this.anInt1045 = -1;
					return true;
				}
				if (this.anInt1045 == 87) {
					this.anInt1082 = this.aClass8_Sub1_Sub3_9.method152();
					this.aBoolean217 = true;
					this.anInt1045 = -1;
					return true;
				}
				if (this.anInt1045 == 62 || this.anInt1045 == 8) {
					local181 = this.anInt1033;
					local185 = this.anInt1034;
					if (this.anInt1045 == 62) {
						local185 = this.aClass8_Sub1_Sub3_9.method180(this.anInt923);
						local181 = this.aClass8_Sub1_Sub3_9.method180(this.anInt923);
						this.aBoolean210 = false;
					}
					if (this.anInt1045 == 8) {
						this.aClass8_Sub1_Sub3_9.method162();
						local190 = 0;
						while (true) {
							if (local190 >= 4) {
								this.aClass8_Sub1_Sub3_9.method164();
								local185 = this.aClass8_Sub1_Sub3_9.method178();
								local181 = this.aClass8_Sub1_Sub3_9.method154();
								this.aBoolean210 = true;
								break;
							}
							for (local581 = 0; local581 < 13; local581++) {
								for (local913 = 0; local913 < 13; local913++) {
									local585 = this.aClass8_Sub1_Sub3_9.method163(830, 1);
									if (local585 == 1) {
										this.anIntArrayArrayArray8[local190][local581][local913] = this.aClass8_Sub1_Sub3_9.method163(830, 26);
									} else {
										this.anIntArrayArrayArray8[local190][local581][local913] = -1;
									}
								}
							}
							local190++;
						}
					}
					if (this.anInt1033 == local181 && this.anInt1034 == local185 && this.anInt915 == 2) {
						this.anInt1045 = -1;
						return true;
					}
					this.anInt1033 = local181;
					this.anInt1034 = local185;
					this.anInt924 = (this.anInt1033 - 6) * 8;
					this.anInt925 = (this.anInt1034 - 6) * 8;
					this.aBoolean235 = false;
					if ((this.anInt1033 / 8 == 48 || this.anInt1033 / 8 == 49) && this.anInt1034 / 8 == 48) {
						this.aBoolean235 = true;
					}
					if (this.anInt1033 / 8 == 48 && this.anInt1034 / 8 == 148) {
						this.aBoolean235 = true;
					}
					this.anInt915 = 1;
					this.aLong30 = System.currentTimeMillis();
					this.method640("Loading - please wait.", null);
					if (this.anInt1045 == 62) {
						local190 = 0;
						local581 = (this.anInt1033 - 6) / 8;
						label1195: while (true) {
							if (local581 > (this.anInt1033 + 6) / 8) {
								this.aByteArrayArray5 = new byte[local190][];
								this.aByteArrayArray6 = new byte[local190][];
								this.anIntArray269 = new int[local190];
								this.anIntArray270 = new int[local190];
								this.anIntArray271 = new int[local190];
								local190 = 0;
								local913 = (this.anInt1033 - 6) / 8;
								while (true) {
									if (local913 > (this.anInt1033 + 6) / 8) {
										break label1195;
									}
									for (local585 = (this.anInt1034 - 6) / 8; local585 <= (this.anInt1034 + 6) / 8; local585++) {
										this.anIntArray269[local190] = (local913 << 8) + local585;
										if (this.aBoolean235 && (local585 == 49 || local585 == 149 || local585 == 147 || local913 == 50 || local913 == 49 && local585 == 47)) {
											this.anIntArray270[local190] = -1;
											this.anIntArray271[local190] = -1;
											local190++;
										} else {
											local606 = this.anIntArray270[local190] = this.aClass4_Sub1_1.method29(0, local913, local585);
											if (local606 != -1) {
												this.aClass4_Sub1_1.method41(3, local606);
											}
											local2494 = this.anIntArray271[local190] = this.aClass4_Sub1_1.method29(1, local913, local585);
											if (local2494 != -1) {
												this.aClass4_Sub1_1.method41(3, local2494);
											}
											local190++;
										}
									}
									local913++;
								}
							}
							for (local913 = (this.anInt1034 - 6) / 8; local913 <= (this.anInt1034 + 6) / 8; local913++) {
								local190++;
							}
							local581++;
						}
					}
					if (this.anInt1045 == 8) {
						local190 = 0;
						@Pc(3595) int[] local3595 = new int[676];
						local913 = 0;
						label1154: while (true) {
							@Pc(3625) int local3625;
							@Pc(3631) int local3631;
							@Pc(3641) int local3641;
							if (local913 >= 4) {
								this.aByteArrayArray5 = new byte[local190][];
								this.aByteArrayArray6 = new byte[local190][];
								this.anIntArray269 = new int[local190];
								this.anIntArray270 = new int[local190];
								this.anIntArray271 = new int[local190];
								local585 = 0;
								while (true) {
									if (local585 >= local190) {
										break label1154;
									}
									local606 = this.anIntArray269[local585] = local3595[local585];
									local2494 = local606 >> 8 & 0xFF;
									local3625 = local606 & 0xFF;
									local3631 = this.anIntArray270[local585] = this.aClass4_Sub1_1.method29(0, local2494, local3625);
									if (local3631 != -1) {
										this.aClass4_Sub1_1.method41(3, local3631);
									}
									local3641 = this.anIntArray271[local585] = this.aClass4_Sub1_1.method29(1, local2494, local3625);
									if (local3641 != -1) {
										this.aClass4_Sub1_1.method41(3, local3641);
									}
									local585++;
								}
							}
							for (local585 = 0; local585 < 13; local585++) {
								for (local606 = 0; local606 < 13; local606++) {
									local2494 = this.anIntArrayArrayArray8[local913][local585][local606];
									if (local2494 != -1) {
										local3625 = local2494 >> 14 & 0x3FF;
										local3631 = local2494 >> 3 & 0x7FF;
										local3641 = (local3625 / 8 << 8) + local3631 / 8;
										for (@Pc(3643) int local3643 = 0; local3643 < local190; local3643++) {
											if (local3595[local3643] == local3641) {
												local3641 = -1;
												break;
											}
										}
										if (local3641 != -1) {
											local3595[local190++] = local3641;
										}
									}
								}
							}
							local913++;
						}
					}
					local190 = this.anInt924 - this.anInt926;
					local581 = this.anInt925 - this.anInt927;
					this.anInt926 = this.anInt924;
					this.anInt927 = this.anInt925;
					for (local913 = 0; local913 < 16384; local913++) {
						@Pc(3796) Class8_Sub1_Sub1_Sub1_Sub1 local3796 = this.aClass8_Sub1_Sub1_Sub1_Sub1Array1[local913];
						if (local3796 != null) {
							for (local606 = 0; local606 < 10; local606++) {
								local3796.anIntArray183[local606] -= local190;
								local3796.anIntArray184[local606] -= local581;
							}
							local3796.anInt716 -= local190 * 128;
							local3796.anInt717 -= local581 * 128;
						}
					}
					for (local585 = 0; local585 < this.anInt966; local585++) {
						@Pc(3851) Class8_Sub1_Sub1_Sub1_Sub2 local3851 = this.aClass8_Sub1_Sub1_Sub1_Sub2Array1[local585];
						if (local3851 != null) {
							for (local2494 = 0; local2494 < 10; local2494++) {
								local3851.anIntArray183[local2494] -= local190;
								local3851.anIntArray184[local2494] -= local581;
							}
							local3851.anInt716 -= local190 * 128;
							local3851.anInt717 -= local581 * 128;
						}
					}
					this.aBoolean215 = true;
					@Pc(3903) byte local3903 = 0;
					@Pc(3905) byte local3905 = 104;
					@Pc(3907) byte local3907 = 1;
					if (local190 < 0) {
						local3903 = 103;
						local3905 = -1;
						local3907 = -1;
					}
					@Pc(3917) byte local3917 = 0;
					@Pc(3919) byte local3919 = 104;
					@Pc(3921) byte local3921 = 1;
					if (local581 < 0) {
						local3917 = 103;
						local3919 = -1;
						local3921 = -1;
					}
					for (@Pc(3931) int local3931 = local3903; local3931 != local3905; local3931 += local3907) {
						for (@Pc(3935) int local3935 = local3917; local3935 != local3919; local3935 += local3921) {
							@Pc(3941) int local3941 = local3931 + local190;
							@Pc(3945) int local3945 = local3935 + local581;
							for (@Pc(3947) int local3947 = 0; local3947 < 4; local3947++) {
								if (local3941 >= 0 && local3945 >= 0 && local3941 < 104 && local3945 < 104) {
									this.aClass49ArrayArrayArray1[local3947][local3931][local3935] = this.aClass49ArrayArrayArray1[local3947][local3941][local3945];
								} else {
									this.aClass49ArrayArrayArray1[local3947][local3931][local3935] = null;
								}
							}
						}
					}
					for (@Pc(4009) Class8_Sub3 local4009 = (Class8_Sub3) this.aClass49_12.method538(); local4009 != null; local4009 = (Class8_Sub3) this.aClass49_12.method540((byte) 6)) {
						local4009.anInt315 -= local190;
						local4009.anInt316 -= local581;
						if (local4009.anInt315 < 0 || local4009.anInt316 < 0 || local4009.anInt315 >= 104 || local4009.anInt316 >= 104) {
							local4009.method543();
						}
					}
					if (this.anInt971 != 0) {
						this.anInt971 -= local190;
						this.anInt972 -= local581;
					}
					this.aBoolean230 = false;
					this.anInt1045 = -1;
					return true;
				}
				if (this.anInt1045 == 232) {
					local181 = this.aClass8_Sub1_Sub3_9.method179();
					local185 = this.aClass8_Sub1_Sub3_9.method180(this.anInt923);
					if (this.anInt973 != -1) {
						this.method609(aByte21, this.anInt973);
						this.anInt973 = -1;
						this.aBoolean191 = true;
					}
					if (this.anInt957 != -1) {
						this.method609(aByte21, this.anInt957);
						this.anInt957 = -1;
						this.aBoolean219 = true;
					}
					if (this.anInt911 != -1) {
						this.method609(aByte21, this.anInt911);
						this.anInt911 = -1;
					}
					if (this.anInt1077 != local185) {
						this.method609(aByte21, this.anInt1077);
						this.anInt1077 = local185;
					}
					if (this.anInt934 != local181) {
						this.method609(aByte21, this.anInt934);
						this.anInt934 = local181;
					}
					if (this.anInt940 != 0) {
						this.anInt940 = 0;
						this.aBoolean191 = true;
					}
					this.aBoolean217 = true;
					this.aBoolean195 = true;
					this.aBoolean211 = false;
					this.anInt1045 = -1;
					return true;
				}
				if (this.anInt1045 == 150) {
					@Pc(4183) byte local4183 = this.aClass8_Sub1_Sub3_9.method173((byte) 1);
					local185 = this.aClass8_Sub1_Sub3_9.method180(this.anInt923);
					this.anIntArray234[local185] = local4183;
					if (this.anIntArray218[local185] != local4183) {
						this.anIntArray218[local185] = local4183;
						this.method592(local185);
						this.aBoolean217 = true;
						if (this.anInt1022 != -1) {
							this.aBoolean191 = true;
						}
					}
					this.anInt1045 = -1;
					return true;
				}
				if (this.anInt1045 == 18) {
					this.anInt917 = this.anInt1044 / 8;
					for (local181 = 0; local181 < this.anInt917; local181++) {
						this.aLongArray4[local181] = this.aClass8_Sub1_Sub3_9.method158();
					}
					this.anInt1045 = -1;
					return true;
				}
				if (this.anInt1045 == 171) {
					if (this.anInt934 != -1) {
						this.method609(aByte21, this.anInt934);
						this.anInt934 = -1;
						this.aBoolean217 = true;
						this.aBoolean195 = true;
					}
					if (this.anInt973 != -1) {
						this.method609(aByte21, this.anInt973);
						this.anInt973 = -1;
						this.aBoolean191 = true;
					}
					if (this.anInt957 != -1) {
						this.method609(aByte21, this.anInt957);
						this.anInt957 = -1;
						this.aBoolean219 = true;
					}
					if (this.anInt911 != -1) {
						this.method609(aByte21, this.anInt911);
						this.anInt911 = -1;
					}
					if (this.anInt1077 != -1) {
						this.method609(aByte21, this.anInt1077);
						this.anInt1077 = -1;
					}
					if (this.anInt940 != 0) {
						this.anInt940 = 0;
						this.aBoolean191 = true;
					}
					this.aBoolean211 = false;
					this.anInt1045 = -1;
					return true;
				}
				if (this.anInt1045 == 143) {
					local181 = this.aClass8_Sub1_Sub3_9.method178();
					local185 = this.aClass8_Sub1_Sub3_9.method178();
					this.method647(local181);
					if (local185 != -1) {
						this.method647(local185);
					}
					if (this.anInt1077 != -1) {
						this.method609(aByte21, this.anInt1077);
						this.anInt1077 = -1;
					}
					if (this.anInt934 != -1) {
						this.method609(aByte21, this.anInt934);
						this.anInt934 = -1;
					}
					if (this.anInt973 != -1) {
						this.method609(aByte21, this.anInt973);
						this.anInt973 = -1;
					}
					if (this.anInt957 != local181) {
						this.method609(aByte21, this.anInt957);
						this.anInt957 = local181;
					}
					if (this.anInt911 != local181) {
						this.method609(aByte21, this.anInt911);
						this.anInt911 = local185;
					}
					this.anInt940 = 0;
					this.aBoolean211 = false;
					this.anInt1045 = -1;
					return true;
				}
				if (this.anInt1045 == 85) {
					if (this.anInt1060 == 12) {
						this.aBoolean217 = true;
					}
					this.anInt975 = this.aClass8_Sub1_Sub3_9.method152();
					this.anInt1045 = -1;
					return true;
				}
				if (this.anInt1045 == 9) {
					local181 = this.aClass8_Sub1_Sub3_9.method178();
					local2949 = this.aClass8_Sub1_Sub3_9.method159();
					Class24.method269(local181).aString7 = local2949;
					@Pc(4491) int local4491 = this.anIntArray249[this.anInt1060];
					if (Class24.method269(local181).anInt411 == local4491) {
						this.aBoolean217 = true;
					}
					this.anInt1045 = -1;
					return true;
				}
				signlink.reporterror("T1 - " + this.anInt1045 + "," + this.anInt1044 + " - " + this.anInt1005 + "," + this.anInt1006);
				this.method639();
			} catch (@Pc(4529) IOException local4529) {
				this.method716();
			} catch (@Pc(4534) Exception local4534) {
				local1817 = "T2 - " + this.anInt1045 + "," + this.anInt1005 + "," + this.anInt1006 + " - " + this.anInt1044 + "," + (this.anInt924 + aClass8_Sub1_Sub1_Sub1_Sub2_1.anIntArray183[0]) + "," + (this.anInt925 + aClass8_Sub1_Sub1_Sub1_Sub2_1.anIntArray184[0]) + " - ";
				for (local185 = 0; local185 < this.anInt1044 && local185 < 50; local185++) {
					local1817 = local1817 + this.aClass8_Sub1_Sub3_9.aByteArray7[local185] + ",";
				}
				signlink.reporterror(local1817);
				this.method639();
			}
			return true;
		} catch (@Pc(4615) RuntimeException local4615) {
			signlink.reporterror("87768, " + false + ", " + local4615.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IILclient!MIIVNBFU;II)V")
	private void method668(@OriginalArg(1) int arg0, @OriginalArg(2) Class24 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		try {
			if (arg1.anInt423 == 0 && arg1.anIntArray121 != null && (!arg1.aBoolean98 || this.anInt1035 == arg1.anInt394 || this.anInt1050 == arg1.anInt394 || this.anInt1066 == arg1.anInt394)) {
				@Pc(34) int local34 = Class8_Sub1_Sub2.anInt810;
				@Pc(36) int local36 = Class8_Sub1_Sub2.anInt808;
				@Pc(38) int local38 = Class8_Sub1_Sub2.anInt811;
				@Pc(40) int local40 = Class8_Sub1_Sub2.anInt809;
				Class8_Sub1_Sub2.method547(arg2 + arg1.anInt430, arg0, arg2, arg0 + arg1.anInt393);
				@Pc(56) int local56 = arg1.anIntArray121.length;
				for (@Pc(58) int local58 = 0; local58 < local56; local58++) {
					@Pc(67) int local67 = arg1.anIntArray124[local58] + arg0;
					@Pc(76) int local76 = arg1.anIntArray123[local58] + arg2 - arg3;
					@Pc(82) Class24 local82 = Class24.method269(arg1.anIntArray121[local58]);
					@Pc(87) int local87 = local67 + local82.anInt410;
					@Pc(92) int local92 = local76 + local82.anInt395;
					if (local82.anInt424 > 0) {
						this.method676(this.anInt951, local82);
					}
					if (local82.anInt423 == 0) {
						if (local82.anInt405 > local82.anInt417 - local82.anInt430) {
							local82.anInt405 = local82.anInt417 - local82.anInt430;
						}
						if (local82.anInt405 < 0) {
							local82.anInt405 = 0;
						}
						this.method668(local87, local82, local92, local82.anInt405);
						if (local82.anInt417 > local82.anInt430) {
							this.method631(local82.anInt405, local82.anInt430, local82.anInt417, local87 + local82.anInt393, local92);
						}
					} else if (local82.anInt423 != 1) {
						@Pc(165) int local165;
						@Pc(169) int local169;
						@Pc(180) int local180;
						@Pc(215) int local215;
						@Pc(222) int local222;
						@Pc(247) int local247;
						@Pc(163) int local163;
						@Pc(213) int local213;
						if (local82.anInt423 == 2) {
							local163 = 0;
							for (local165 = 0; local165 < local82.anInt430; local165++) {
								for (local169 = 0; local169 < local82.anInt393; local169++) {
									local180 = local87 + local169 * (local82.anInt418 + 32);
									@Pc(189) int local189 = local92 + local165 * (local82.anInt399 + 32);
									if (local163 < 20) {
										local180 += local82.anIntArray126[local163];
										local189 += local82.anIntArray118[local163];
									}
									if (local82.anIntArray119[local163] > 0) {
										local213 = 0;
										local215 = 0;
										local222 = local82.anIntArray119[local163] - 1;
										if (local180 > Class8_Sub1_Sub2.anInt810 - 32 && local180 < Class8_Sub1_Sub2.anInt811 && local189 > Class8_Sub1_Sub2.anInt808 - 32 && local189 < Class8_Sub1_Sub2.anInt809 || this.anInt1070 != 0 && this.anInt1069 == local163) {
											local247 = 0;
											if (this.anInt961 == 1 && this.anInt962 == local163 && this.anInt963 == local82.anInt394) {
												local247 = 16777215;
											}
											@Pc(272) Class8_Sub1_Sub2_Sub1 local272 = Class19.method193(local82.anIntArray120[local163], this.aBoolean192, local222, local247);
											if (local272 != null) {
												@Pc(352) int local352;
												if (this.anInt1070 != 0 && this.anInt1069 == local163 && this.anInt1068 == local82.anInt394) {
													local213 = super.anInt840 - this.anInt1071;
													local215 = super.anInt841 - this.anInt1072;
													if (local213 < 5 && local213 > -5) {
														local213 = 0;
													}
													if (local215 < 5 && local215 > -5) {
														local215 = 0;
													}
													if (this.anInt1013 < 5) {
														local213 = 0;
														local215 = 0;
													}
													local272.method119(local189 + local215, local180 + local213, this.aBoolean213);
													if (local189 + local215 < Class8_Sub1_Sub2.anInt808 && arg1.anInt405 > 0) {
														local352 = this.anInt1023 * (Class8_Sub1_Sub2.anInt808 - local189 - local215) / 3;
														if (local352 > this.anInt1023 * 10) {
															local352 = this.anInt1023 * 10;
														}
														if (local352 > arg1.anInt405) {
															local352 = arg1.anInt405;
														}
														arg1.anInt405 -= local352;
														this.anInt1072 += local352;
													}
													if (local189 + local215 + 32 > Class8_Sub1_Sub2.anInt809 && arg1.anInt405 < arg1.anInt417 - arg1.anInt430) {
														local352 = this.anInt1023 * (local189 + local215 + 32 - Class8_Sub1_Sub2.anInt809) / 3;
														if (local352 > this.anInt1023 * 10) {
															local352 = this.anInt1023 * 10;
														}
														if (local352 > arg1.anInt417 - arg1.anInt430 - arg1.anInt405) {
															local352 = arg1.anInt417 - arg1.anInt430 - arg1.anInt405;
														}
														arg1.anInt405 += local352;
														this.anInt1072 -= local352;
													}
												} else if (this.anInt1030 != 0 && this.anInt1029 == local163 && this.anInt1028 == local82.anInt394) {
													local272.method119(local189, local180, this.aBoolean213);
												} else {
													local272.method117(local189, local180);
												}
												if (local272.anInt195 == 33 || local82.anIntArray120[local163] != 1) {
													local352 = local82.anIntArray120[local163];
													this.aClass8_Sub1_Sub2_Sub3_2.method451(0, method686(local352, 471), local180 + local213 + 1, local189 + 10 + local215);
													this.aClass8_Sub1_Sub2_Sub3_2.method451(16776960, method686(local352, 471), local180 + local213, local189 + 9 + local215);
												}
											}
										}
									} else if (local82.aClass8_Sub1_Sub2_Sub1Array1 != null && local163 < 20) {
										@Pc(542) Class8_Sub1_Sub2_Sub1 local542 = local82.aClass8_Sub1_Sub2_Sub1Array1[local163];
										if (local542 != null) {
											local542.method117(local189, local180);
										}
									}
									local163++;
								}
							}
						} else if (local82.anInt423 == 3) {
							@Pc(568) boolean local568 = false;
							if (this.anInt1066 == local82.anInt394 || this.anInt1050 == local82.anInt394 || this.anInt1035 == local82.anInt394) {
								local568 = true;
							}
							if (this.method672((byte) 2, local82)) {
								local163 = local82.anInt400;
								if (local568 && local82.anInt416 != 0) {
									local163 = local82.anInt416;
								}
							} else {
								local163 = local82.anInt403;
								if (local568 && local82.anInt426 != 0) {
									local163 = local82.anInt426;
								}
							}
							if (local82.aByte9 == 0) {
								if (local82.aBoolean93) {
									Class8_Sub1_Sub2.method550(local82.anInt393, local92, local163, local82.anInt430, local87);
								} else {
									Class8_Sub1_Sub2.method551(local163, local82.anInt393, local82.anInt430, local92, local87);
								}
							} else if (local82.aBoolean93) {
								Class8_Sub1_Sub2.method549(local82.anInt430, local87, local92, 256 - (local82.aByte9 & 0xFF), local82.anInt393, local163);
							} else {
								Class8_Sub1_Sub2.method552(256 - (local82.aByte9 & 0xFF), local87, local92, local163, local82.anInt393, local82.anInt430);
							}
						} else {
							@Pc(686) Class8_Sub1_Sub2_Sub3 local686;
							@Pc(963) String local963;
							if (local82.anInt423 == 4) {
								local686 = local82.aClass8_Sub1_Sub2_Sub3_1;
								@Pc(689) String local689 = local82.aString7;
								@Pc(691) boolean local691 = false;
								if (this.anInt1066 == local82.anInt394 || this.anInt1050 == local82.anInt394 || this.anInt1035 == local82.anInt394) {
									local691 = true;
								}
								if (this.method672((byte) 2, local82)) {
									local165 = local82.anInt400;
									if (local691 && local82.anInt416 != 0) {
										local165 = local82.anInt416;
									}
									if (local82.aString9.length() > 0) {
										local689 = local82.aString9;
									}
								} else {
									local165 = local82.anInt403;
									if (local691 && local82.anInt426 != 0) {
										local165 = local82.anInt426;
									}
								}
								if (local82.anInt414 == 6 && this.aBoolean211) {
									local689 = "Please wait...";
									local165 = local82.anInt403;
								}
								if (Class8_Sub1_Sub2.anInt806 == 479) {
									if (local165 == 16776960) {
										local165 = 255;
									}
									if (local165 == 49152) {
										local165 = 16777215;
									}
								}
								local213 = local92 + local686.anInt679;
								while (local689.length() > 0) {
									if (local689.indexOf("%") != -1) {
										label390: while (true) {
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
																				break label390;
																			}
																			local689 = local689.substring(0, local215) + this.method670(this.method702(local82, (byte) 7, 4)) + local689.substring(local215 + 2);
																		}
																	}
																	local689 = local689.substring(0, local215) + this.method670(this.method702(local82, (byte) 7, 3)) + local689.substring(local215 + 2);
																}
															}
															local689 = local689.substring(0, local215) + this.method670(this.method702(local82, (byte) 7, 2)) + local689.substring(local215 + 2);
														}
													}
													local689 = local689.substring(0, local215) + this.method670(this.method702(local82, (byte) 7, 1)) + local689.substring(local215 + 2);
												}
											}
											local689 = local689.substring(0, local215) + this.method670(this.method702(local82, (byte) 7, 0)) + local689.substring(local215 + 2);
										}
									}
									local215 = local689.indexOf("\\n");
									if (local215 == -1) {
										local963 = local689;
										local689 = "";
									} else {
										local963 = local689.substring(0, local215);
										local689 = local689.substring(local215 + 2);
									}
									if (local82.aBoolean100) {
										local686.method448(local963, local165, local87 + local82.anInt393 / 2, local213, local82.aBoolean94);
									} else {
										local686.method455(local963, local82.aBoolean94, local87, local165, local213);
									}
									local213 += local686.anInt679;
								}
							} else if (local82.anInt423 == 5) {
								@Pc(1025) Class8_Sub1_Sub2_Sub1 local1025;
								if (this.method672((byte) 2, local82)) {
									local1025 = local82.aClass8_Sub1_Sub2_Sub1_2;
								} else {
									local1025 = local82.aClass8_Sub1_Sub2_Sub1_1;
								}
								if (local1025 != null) {
									local1025.method117(local92, local87);
								}
							} else if (local82.anInt423 == 6) {
								local163 = Class8_Sub1_Sub2_Sub4.anInt819;
								local165 = Class8_Sub1_Sub2_Sub4.anInt820;
								Class8_Sub1_Sub2_Sub4.anInt819 = local87 + local82.anInt393 / 2;
								Class8_Sub1_Sub2_Sub4.anInt820 = local92 + local82.anInt430 / 2;
								local169 = Class8_Sub1_Sub2_Sub4.anIntArray204[local82.anInt420] * local82.anInt419 >> 16;
								local180 = Class8_Sub1_Sub2_Sub4.anIntArray205[local82.anInt420] * local82.anInt419 >> 16;
								@Pc(1086) boolean local1086 = this.method672((byte) 2, local82);
								if (local1086) {
									local213 = local82.anInt407;
								} else {
									local213 = local82.anInt406;
								}
								@Pc(1106) Class8_Sub1_Sub1_Sub5 local1106;
								if (local213 == -1) {
									local1106 = local82.method264(-1, -1, local1086);
								} else {
									@Pc(1112) Class46 local1112 = Class46.aClass46Array1[local213];
									local1106 = local82.method264(local1112.anIntArray194[local82.anInt397], local1112.anIntArray195[local82.anInt397], local1086);
								}
								if (local1106 != null) {
									local1106.method231(local82.anInt421, 0, local82.anInt420, 0, local169, local180);
								}
								Class8_Sub1_Sub2_Sub4.anInt819 = local163;
								Class8_Sub1_Sub2_Sub4.anInt820 = local165;
							} else {
								if (local82.anInt423 == 7) {
									local686 = local82.aClass8_Sub1_Sub2_Sub3_1;
									local165 = 0;
									for (local169 = 0; local169 < local82.anInt430; local169++) {
										for (local180 = 0; local180 < local82.anInt393; local180++) {
											if (local82.anIntArray119[local165] > 0) {
												@Pc(1176) Class19 local1176 = Class19.method191(local82.anIntArray119[local165] - 1);
												@Pc(1180) String local1180 = String.valueOf(local1176.aString4);
												if (local1176.aBoolean60 || local82.anIntArray120[local165] != 1) {
													local1180 = local1180 + " x" + method725(local82.anIntArray120[local165]);
												}
												local215 = local87 + local180 * (local82.anInt418 + 115);
												local222 = local92 + local169 * (local82.anInt399 + 12);
												if (local82.aBoolean100) {
													local686.method448(local1180, local82.anInt403, local215 + local82.anInt393 / 2, local222, local82.aBoolean94);
												} else {
													local686.method455(local1180, local82.aBoolean94, local215, local82.anInt403, local222);
												}
											}
											local165++;
										}
									}
								}
								if (local82.anInt423 == 8 && (this.anInt900 == local82.anInt394 || this.anInt885 == local82.anInt394 || this.anInt888 == local82.anInt394) && this.anInt949 == 100) {
									local163 = 0;
									local165 = 0;
									@Pc(1294) Class8_Sub1_Sub2_Sub3 local1294 = this.aClass8_Sub1_Sub2_Sub3_3;
									@Pc(1297) String local1297 = local82.aString7;
									while (local1297.length() > 0) {
										local213 = local1297.indexOf("\\n");
										if (local213 == -1) {
											local963 = local1297;
											local1297 = "";
										} else {
											local963 = local1297.substring(0, local213);
											local1297 = local1297.substring(local213 + 2);
										}
										local215 = local1294.method449(local963);
										if (local215 > local163) {
											local163 = local215;
										}
										local165 += local1294.anInt679 + 1;
									}
									local163 += 6;
									local165 += 7;
									local213 = local87 + local82.anInt393 - local163 - 5;
									local215 = local92 + local82.anInt430 + 5;
									if (local213 < local87 + 5) {
										local213 = local87 + 5;
									}
									if (local213 + local163 > arg0 + arg1.anInt393) {
										local213 = arg0 + arg1.anInt393 - local163;
									}
									if (local215 + local165 > arg2 + arg1.anInt430) {
										local215 = arg2 + arg1.anInt430 - local165;
									}
									Class8_Sub1_Sub2.method550(local163, local215, 16777120, local165, local213);
									Class8_Sub1_Sub2.method551(0, local163, local165, local215, local213);
									local1297 = local82.aString7;
									local222 = local215 + local1294.anInt679 + 2;
									while (local1297.length() > 0) {
										local247 = local1297.indexOf("\\n");
										if (local247 == -1) {
											local963 = local1297;
											local1297 = "";
										} else {
											local963 = local1297.substring(0, local247);
											local1297 = local1297.substring(local247 + 2);
										}
										local1294.method455(local963, false, local213 + 3, 0, local222);
										local222 += local1294.anInt679 + 1;
									}
								}
							}
						}
					}
				}
				Class8_Sub1_Sub2.method547(local40, local34, local36, local38);
			}
		} catch (@Pc(1482) RuntimeException local1482) {
			signlink.reporterror("63781, " + 0 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local1482.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "y", descriptor = "(I)V")
	private void method669() {
		try {
			this.anInt1044 += 0;
			System.out.println("============");
			System.out.println("flame-cycle:" + this.anInt1032);
			if (this.aClass4_Sub1_1 != null) {
				System.out.println("Od-cycle:" + this.aClass4_Sub1_1.anInt15);
			}
			System.out.println("loop-cycle:" + anInt983);
			System.out.println("draw-cycle:" + anInt919);
			System.out.println("ptype:" + this.anInt1045);
			System.out.println("psize:" + this.anInt1044);
			if (this.aClass7_1 != null) {
				this.aClass7_1.method53();
			}
			super.aBoolean188 = true;
		} catch (@Pc(82) RuntimeException local82) {
			signlink.reporterror("72011, " + 0 + ", " + local82.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(B)Ljava/awt/Component;")
	@Override
	protected Component method584(@OriginalArg(0) byte arg0) {
		try {
			@Pc(4) boolean local4 = false;
			if (signlink.mainapp == null) {
				return super.aFrame_Sub1_2 == null ? this : super.aFrame_Sub1_2;
			} else {
				return signlink.mainapp;
			}
		} catch (@Pc(24) RuntimeException local24) {
			signlink.reporterror("34428, " + arg0 + ", " + local24.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(II)Ljava/lang/String;")
	private String method670(@OriginalArg(1) int arg0) {
		try {
			return arg0 < 999999999 ? String.valueOf(arg0) : "*";
		} catch (@Pc(15) RuntimeException local15) {
			signlink.reporterror("60307, " + 8 + ", " + arg0 + ", " + local15.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIILclient!VJDNWPCM;Lclient!IUVBENCV;)V")
	private void method671(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class8_Sub1_Sub1_Sub1_Sub2 arg2, @OriginalArg(4) Class8_Sub1_Sub3 arg3) {
		try {
			@Pc(14) int local14;
			@Pc(18) int local18;
			if ((arg1 & 0x8) != 0) {
				local14 = arg3.method170(this.aBoolean224);
				local18 = arg3.method169();
				arg2.method475(anInt983, local18, local14);
				arg2.anInt719 = anInt983 + 300;
				arg2.anInt720 = arg3.method169();
				arg2.anInt721 = arg3.method152();
			}
			if ((arg1 & 0x20) != 0) {
				arg2.aString14 = arg3.method159();
				if (arg2.aString14.charAt(0) == '~') {
					arg2.aString14 = arg2.aString14.substring(1);
					this.method694(2, arg2.aString14, arg2.aString15);
				} else if (arg2 == aClass8_Sub1_Sub1_Sub1_Sub2_1) {
					this.method694(2, arg2.aString14, arg2.aString15);
				}
				arg2.anInt730 = 0;
				arg2.anInt725 = 0;
				arg2.anInt724 = 150;
			}
			@Pc(104) int local104;
			if ((arg1 & 0x1) != 0) {
				local14 = arg3.method179();
				local18 = arg3.method152();
				local104 = arg3.method171(this.anInt906);
				@Pc(107) int local107 = arg3.anInt239;
				if (arg2.aString15 != null && arg2.aBoolean161) {
					@Pc(117) long local117 = Class36.method381(arg2.aString15);
					@Pc(119) boolean local119 = false;
					if (local18 <= 1) {
						for (@Pc(124) int local124 = 0; local124 < this.anInt917; local124++) {
							if (this.aLongArray4[local124] == local117) {
								local119 = true;
								break;
							}
						}
					}
					if (!local119 && this.anInt1043 == 0) {
						try {
							this.aClass8_Sub1_Sub3_8.anInt239 = 0;
							arg3.method161(local104, this.aClass8_Sub1_Sub3_8.aByteArray7);
							this.aClass8_Sub1_Sub3_8.anInt239 = 0;
							@Pc(169) String local169 = Class30.method312(448, local104, this.aClass8_Sub1_Sub3_8);
							@Pc(173) String local173 = Class47.method498(local169);
							arg2.aString14 = local173;
							arg2.anInt730 = local14 >> 8;
							arg2.anInt725 = local14 & 0xFF;
							arg2.anInt724 = 150;
							if (local18 == 2 || local18 == 3) {
								this.method694(1, local173, "@cr2@" + arg2.aString15);
							} else if (local18 == 1) {
								this.method694(1, local173, "@cr1@" + arg2.aString15);
							} else {
								this.method694(2, local173, arg2.aString15);
							}
						} catch (@Pc(237) Exception local237) {
							signlink.reporterror("cde2");
						}
					}
				}
				arg3.anInt239 = local107 + local104;
			}
			if ((arg1 & 0x40) != 0) {
				arg2.anInt722 = arg3.method178();
				if (arg2.anInt722 == 65535) {
					arg2.anInt722 = -1;
				}
			}
			if ((arg1 & 0x4) != 0) {
				local14 = arg3.method180(this.anInt923);
				if (local14 == 65535) {
					local14 = -1;
				}
				local18 = arg3.method152();
				if (local14 == arg2.anInt711 && local14 != -1) {
					local104 = Class46.aClass46Array1[local14].anInt767;
					if (local104 == 1) {
						arg2.anInt712 = 0;
						arg2.anInt713 = 0;
						arg2.anInt714 = local18;
						arg2.anInt715 = 0;
					}
					if (local104 == 2) {
						arg2.anInt715 = 0;
					}
				} else if (local14 == -1 || arg2.anInt711 == -1 || Class46.aClass46Array1[local14].anInt761 >= Class46.aClass46Array1[arg2.anInt711].anInt761) {
					arg2.anInt711 = local14;
					arg2.anInt712 = 0;
					arg2.anInt713 = 0;
					arg2.anInt714 = local18;
					arg2.anInt715 = 0;
					arg2.anInt709 = arg2.anInt695;
				}
			}
			if ((arg1 & 0x200) != 0) {
				arg2.anInt686 = arg3.method170(this.aBoolean224);
				arg2.anInt688 = arg3.method152();
				arg2.anInt687 = arg3.method171(this.anInt906);
				arg2.anInt689 = arg3.method171(this.anInt906);
				arg2.anInt690 = arg3.method154() + anInt983;
				arg2.anInt691 = arg3.method178() + anInt983;
				arg2.anInt692 = arg3.method169();
				arg2.method471();
			}
			if ((arg1 & 0x400) != 0) {
				arg2.anInt701 = arg3.method179();
				local14 = arg3.method186(this.anInt1076);
				arg2.anInt705 = local14 >> 16;
				arg2.anInt704 = anInt983 + (local14 & 0xFFFF);
				arg2.anInt702 = 0;
				arg2.anInt703 = 0;
				if (arg2.anInt704 > anInt983) {
					arg2.anInt702 = -1;
				}
				if (arg2.anInt701 == 65535) {
					arg2.anInt701 = -1;
				}
			}
			if ((arg1 & 0x80) != 0) {
				local14 = arg3.method169();
				@Pc(453) byte[] local453 = new byte[local14];
				@Pc(459) Class8_Sub1_Sub3 local459 = new Class8_Sub1_Sub3(local453, 713);
				arg3.method188(local14, local453);
				this.aClass8_Sub1_Sub3Array1[arg0] = local459;
				arg2.method478(local459);
			}
			if ((arg1 & 0x2) != 0) {
				arg2.anInt693 = arg3.method179();
				arg2.anInt694 = arg3.method178();
			}
			if ((arg1 & 0x100) != 0) {
				local14 = arg3.method171(this.anInt906);
				local18 = arg3.method169();
				arg2.method475(anInt983, local18, local14);
				arg2.anInt719 = anInt983 + 300;
				arg2.anInt720 = arg3.method169();
				arg2.anInt721 = arg3.method170(this.aBoolean224);
			}
		} catch (@Pc(525) RuntimeException local525) {
			signlink.reporterror("68526, " + arg0 + ", " + 42045 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local525.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(BLclient!MIIVNBFU;)Z")
	private boolean method672(@OriginalArg(0) byte arg0, @OriginalArg(1) Class24 arg1) {
		try {
			@Pc(6) boolean local6 = false;
			if (arg1.anIntArray122 == null) {
				return false;
			}
			for (@Pc(19) int local19 = 0; local19 < arg1.anIntArray122.length; local19++) {
				@Pc(27) int local27 = this.method702(arg1, (byte) 7, local19);
				@Pc(32) int local32 = arg1.anIntArray125[local19];
				if (arg1.anIntArray122[local19] == 2) {
					if (local27 >= local32) {
						return false;
					}
				} else if (arg1.anIntArray122[local19] == 3) {
					if (local27 <= local32) {
						return false;
					}
				} else if (arg1.anIntArray122[local19] == 4) {
					if (local27 == local32) {
						return false;
					}
				} else if (local27 != local32) {
					return false;
				}
			}
			return true;
		} catch (@Pc(79) RuntimeException local79) {
			signlink.reporterror("11340, " + arg0 + ", " + arg1 + ", " + local79.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIIIII)V")
	private void method674(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		try {
			@Pc(5) int local5 = 2048 - arg0 & 0x7FF;
			@Pc(11) int local11 = 2048 - arg4 & 0x7FF;
			@Pc(13) int local13 = 0;
			@Pc(15) int local15 = 0;
			@Pc(17) int local17 = arg5;
			@Pc(23) int local23;
			@Pc(27) int local27;
			@Pc(37) int local37;
			if (local5 != 0) {
				local23 = Class8_Sub1_Sub1_Sub5.anIntArray90[local5];
				local27 = Class8_Sub1_Sub1_Sub5.anIntArray91[local5];
				local37 = local27 * 0 - arg5 * local23 >> 16;
				local17 = local23 * 0 + arg5 * local27 >> 16;
				local15 = local37;
			}
			if (local11 != 0) {
				local23 = Class8_Sub1_Sub1_Sub5.anIntArray90[local11];
				local27 = Class8_Sub1_Sub1_Sub5.anIntArray91[local11];
				local37 = local17 * local23 + local27 * 0 >> 16;
				local17 = local17 * local27 - local23 * 0 >> 16;
				local13 = local37;
			}
			this.anInt877 = arg1 - local13;
			this.anInt878 = arg2 - local15;
			this.anInt879 = arg3 - local17;
			this.anInt880 = arg0;
			this.anInt881 = arg4;
		} catch (@Pc(110) RuntimeException local110) {
			signlink.reporterror("20686, " + 58 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local110.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIILclient!MIIVNBFU;IIII)V")
	private void method675(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class24 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		try {
			if (arg3.anInt423 == 0 && arg3.anIntArray121 != null && !arg3.aBoolean98 && (arg6 >= arg0 && arg4 >= arg5 && arg6 <= arg0 + arg3.anInt393 && arg4 <= arg5 + arg3.anInt430)) {
				@Pc(34) int local34 = arg3.anIntArray121.length;
				for (@Pc(42) int local42 = 0; local42 < local34; local42++) {
					@Pc(51) int local51 = arg3.anIntArray124[local42] + arg0;
					@Pc(60) int local60 = arg3.anIntArray123[local42] + arg5 - arg2;
					@Pc(66) Class24 local66 = Class24.method269(arg3.anIntArray121[local42]);
					@Pc(71) int local71 = local51 + local66.anInt410;
					@Pc(76) int local76 = local60 + local66.anInt395;
					if ((local66.anInt415 >= 0 || local66.anInt426 != 0) && arg6 >= local71 && arg4 >= local76 && arg6 < local71 + local66.anInt393 && arg4 < local76 + local66.anInt430) {
						if (local66.anInt415 >= 0) {
							this.anInt898 = local66.anInt415;
						} else {
							this.anInt898 = local66.anInt394;
						}
					}
					if (local66.anInt423 == 8 && arg6 >= local71 && arg4 >= local76 && arg6 < local71 + local66.anInt393 && arg4 < local76 + local66.anInt430) {
						this.anInt1015 = local66.anInt394;
					}
					if (local66.anInt423 == 0) {
						this.method675(local71, arg1, local66.anInt405, local66, arg4, local76, arg6);
						if (local66.anInt417 > local66.anInt430) {
							this.method622(local66.anInt430, local66.anInt417, local76, local71 + local66.anInt393, arg6, local66, arg4, arg1);
						}
					} else {
						if (local66.anInt414 == 1 && arg6 >= local71 && arg4 >= local76 && arg6 < local71 + local66.anInt393 && arg4 < local76 + local66.anInt430) {
							@Pc(200) boolean local200 = false;
							if (local66.anInt424 != 0) {
								local200 = this.method611(local66);
							}
							if (!local200) {
								this.aStringArray14[this.anInt1025] = local66.aString11;
								this.anIntArray262[this.anInt1025] = 315;
								this.anIntArray261[this.anInt1025] = local66.anInt394;
								this.anInt1025++;
							}
						}
						if (local66.anInt414 == 2 && this.anInt865 == 0 && arg6 >= local71 && arg4 >= local76 && arg6 < local71 + local66.anInt393 && arg4 < local76 + local66.anInt430) {
							@Pc(264) String local264 = local66.aString8;
							if (local264.indexOf(" ") != -1) {
								local264 = local264.substring(0, local264.indexOf(" "));
							}
							this.aStringArray14[this.anInt1025] = local264 + " @gre@" + local66.aString10;
							this.anIntArray262[this.anInt1025] = 358;
							this.anIntArray261[this.anInt1025] = local66.anInt394;
							this.anInt1025++;
						}
						if (local66.anInt414 == 3 && arg6 >= local71 && arg4 >= local76 && arg6 < local71 + local66.anInt393 && arg4 < local76 + local66.anInt430) {
							this.aStringArray14[this.anInt1025] = "Close";
							if (arg1 == 3) {
								this.anIntArray262[this.anInt1025] = 819;
							} else {
								this.anIntArray262[this.anInt1025] = 877;
							}
							this.anIntArray261[this.anInt1025] = local66.anInt394;
							this.anInt1025++;
						}
						if (local66.anInt414 == 4 && arg6 >= local71 && arg4 >= local76 && arg6 < local71 + local66.anInt393 && arg4 < local76 + local66.anInt430) {
							this.aStringArray14[this.anInt1025] = local66.aString11;
							this.anIntArray262[this.anInt1025] = 776;
							this.anIntArray261[this.anInt1025] = local66.anInt394;
							this.anInt1025++;
						}
						if (local66.anInt414 == 5 && arg6 >= local71 && arg4 >= local76 && arg6 < local71 + local66.anInt393 && arg4 < local76 + local66.anInt430) {
							this.aStringArray14[this.anInt1025] = local66.aString11;
							this.anIntArray262[this.anInt1025] = 871;
							this.anIntArray261[this.anInt1025] = local66.anInt394;
							this.anInt1025++;
						}
						if (local66.anInt414 == 6 && !this.aBoolean211 && arg6 >= local71 && arg4 >= local76 && arg6 < local71 + local66.anInt393 && arg4 < local76 + local66.anInt430) {
							this.aStringArray14[this.anInt1025] = local66.aString11;
							this.anIntArray262[this.anInt1025] = 967;
							this.anIntArray261[this.anInt1025] = local66.anInt394;
							this.anInt1025++;
						}
						if (local66.anInt423 == 2) {
							@Pc(523) int local523 = 0;
							for (@Pc(525) int local525 = 0; local525 < local66.anInt430; local525++) {
								for (@Pc(529) int local529 = 0; local529 < local66.anInt393; local529++) {
									@Pc(540) int local540 = local71 + local529 * (local66.anInt418 + 32);
									@Pc(549) int local549 = local76 + local525 * (local66.anInt399 + 32);
									if (local523 < 20) {
										local540 += local66.anIntArray126[local523];
										local549 += local66.anIntArray118[local523];
									}
									if (arg6 >= local540 && arg4 >= local549 && arg6 < local540 + 32 && arg4 < local549 + 32) {
										this.anInt908 = local523;
										this.anInt909 = local66.anInt394;
										if (local66.anIntArray119[local523] > 0) {
											@Pc(602) Class19 local602 = Class19.method191(local66.anIntArray119[local523] - 1);
											if (this.anInt961 == 1 && local66.aBoolean95) {
												if (local66.anInt394 != this.anInt963 || local523 != this.anInt962) {
													this.aStringArray14[this.anInt1025] = "Use " + this.aString24 + " with @lre@" + local602.aString4;
													this.anIntArray262[this.anInt1025] = 586;
													this.anIntArray263[this.anInt1025] = local602.anInt256;
													this.anIntArray260[this.anInt1025] = local523;
													this.anIntArray261[this.anInt1025] = local66.anInt394;
													this.anInt1025++;
												}
											} else if (this.anInt865 != 1 || !local66.aBoolean95) {
												@Pc(739) int local739;
												if (local66.aBoolean95) {
													for (local739 = 4; local739 >= 3; local739--) {
														if (local602.aStringArray3 != null && local602.aStringArray3[local739] != null) {
															this.aStringArray14[this.anInt1025] = local602.aStringArray3[local739] + " @lre@" + local602.aString4;
															if (local739 == 3) {
																this.anIntArray262[this.anInt1025] = 213;
															}
															if (local739 == 4) {
																this.anIntArray262[this.anInt1025] = 245;
															}
															this.anIntArray263[this.anInt1025] = local602.anInt256;
															this.anIntArray260[this.anInt1025] = local523;
															this.anIntArray261[this.anInt1025] = local66.anInt394;
															this.anInt1025++;
														} else if (local739 == 4) {
															this.aStringArray14[this.anInt1025] = "Drop @lre@" + local602.aString4;
															this.anIntArray262[this.anInt1025] = 245;
															this.anIntArray263[this.anInt1025] = local602.anInt256;
															this.anIntArray260[this.anInt1025] = local523;
															this.anIntArray261[this.anInt1025] = local66.anInt394;
															this.anInt1025++;
														}
													}
												}
												if (local66.aBoolean99) {
													this.aStringArray14[this.anInt1025] = "Use @lre@" + local602.aString4;
													this.anIntArray262[this.anInt1025] = 26;
													this.anIntArray263[this.anInt1025] = local602.anInt256;
													this.anIntArray260[this.anInt1025] = local523;
													this.anIntArray261[this.anInt1025] = local66.anInt394;
													this.anInt1025++;
												}
												if (local66.aBoolean95 && local602.aStringArray3 != null) {
													for (local739 = 2; local739 >= 0; local739--) {
														if (local602.aStringArray3[local739] != null) {
															this.aStringArray14[this.anInt1025] = local602.aStringArray3[local739] + " @lre@" + local602.aString4;
															if (local739 == 0) {
																this.anIntArray262[this.anInt1025] = 80;
															}
															if (local739 == 1) {
																this.anIntArray262[this.anInt1025] = 331;
															}
															if (local739 == 2) {
																this.anIntArray262[this.anInt1025] = 426;
															}
															this.anIntArray263[this.anInt1025] = local602.anInt256;
															this.anIntArray260[this.anInt1025] = local523;
															this.anIntArray261[this.anInt1025] = local66.anInt394;
															this.anInt1025++;
														}
													}
												}
												if (local66.aStringArray5 != null) {
													for (local739 = 4; local739 >= 0; local739--) {
														if (local66.aStringArray5[local739] != null) {
															this.aStringArray14[this.anInt1025] = local66.aStringArray5[local739] + " @lre@" + local602.aString4;
															if (local739 == 0) {
																this.anIntArray262[this.anInt1025] = 263;
															}
															if (local739 == 1) {
																this.anIntArray262[this.anInt1025] = 898;
															}
															if (local739 == 2) {
																this.anIntArray262[this.anInt1025] = 890;
															}
															if (local739 == 3) {
																this.anIntArray262[this.anInt1025] = 139;
															}
															if (local739 == 4) {
																this.anIntArray262[this.anInt1025] = 797;
															}
															this.anIntArray263[this.anInt1025] = local602.anInt256;
															this.anIntArray260[this.anInt1025] = local523;
															this.anIntArray261[this.anInt1025] = local66.anInt394;
															this.anInt1025++;
														}
													}
												}
												this.aStringArray14[this.anInt1025] = "Examine @lre@" + local602.aString4;
												this.anIntArray262[this.anInt1025] = 1164;
												this.anIntArray263[this.anInt1025] = local602.anInt256;
												this.anIntArray260[this.anInt1025] = local523;
												this.anIntArray261[this.anInt1025] = local66.anInt394;
												this.anInt1025++;
											} else if ((this.anInt867 & 0x10) == 16) {
												this.aStringArray14[this.anInt1025] = this.aString18 + " @lre@" + local602.aString4;
												this.anIntArray262[this.anInt1025] = 931;
												this.anIntArray263[this.anInt1025] = local602.anInt256;
												this.anIntArray260[this.anInt1025] = local523;
												this.anIntArray261[this.anInt1025] = local66.anInt394;
												this.anInt1025++;
											}
										}
									}
									local523++;
								}
							}
						}
					}
				}
			}
		} catch (@Pc(1169) RuntimeException local1169) {
			signlink.reporterror("94111, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + -343 + ", " + local1169.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILclient!MIIVNBFU;)V")
	private void method676(@OriginalArg(0) int arg0, @OriginalArg(1) Class24 arg1) {
		try {
			@Pc(4) int local4 = arg1.anInt424;
			while (arg0 >= 0) {
				this.anInt995 = this.aClass18_2.method135();
			}
			@Pc(69) int local69;
			if ((local4 < 1 || local4 > 100) && (local4 < 701 || local4 > 800)) {
				if (local4 >= 101 && local4 <= 200 || !(local4 < 801 || local4 > 900)) {
					local69 = this.anInt1081;
					if (this.anInt1082 != 2) {
						local69 = 0;
					}
					if (local4 > 800) {
						local4 -= 701;
					} else {
						local4 -= 101;
					}
					if (local4 >= local69) {
						arg1.aString7 = "";
						arg1.anInt414 = 0;
					} else {
						if (this.anIntArray267[local4] == 0) {
							arg1.aString7 = "@red@Offline";
						} else if (this.anIntArray267[local4] < 200) {
							if (this.anIntArray267[local4] == anInt1074) {
								arg1.aString7 = "@gre@World" + (this.anIntArray267[local4] - 9);
							} else {
								arg1.aString7 = "@yel@World" + (this.anIntArray267[local4] - 9);
							}
						} else if (this.anIntArray267[local4] == anInt1074) {
							arg1.aString7 = "@gre@Classic" + (this.anIntArray267[local4] - 219);
						} else {
							arg1.aString7 = "@yel@Classic" + (this.anIntArray267[local4] - 219);
						}
						arg1.anInt414 = 1;
					}
				} else if (local4 == 203) {
					local69 = this.anInt1081;
					if (this.anInt1082 != 2) {
						local69 = 0;
					}
					arg1.anInt417 = local69 * 15 + 20;
					if (arg1.anInt417 <= arg1.anInt430) {
						arg1.anInt417 = arg1.anInt430 + 1;
					}
				} else if (local4 >= 401 && local4 <= 500) {
					local4 -= 401;
					if (local4 == 0 && this.anInt1082 == 0) {
						arg1.aString7 = "Loading ignore list";
						arg1.anInt414 = 0;
					} else if (local4 == 1 && this.anInt1082 == 0) {
						arg1.aString7 = "Please wait...";
						arg1.anInt414 = 0;
					} else {
						local69 = this.anInt917;
						if (this.anInt1082 == 0) {
							local69 = 0;
						}
						if (local4 >= local69) {
							arg1.aString7 = "";
							arg1.anInt414 = 0;
						} else {
							arg1.aString7 = Class36.method385(839, Class36.method382((byte) 3, this.aLongArray4[local4]));
							arg1.anInt414 = 1;
						}
					}
				} else if (local4 == 503) {
					arg1.anInt417 = this.anInt917 * 15 + 20;
					if (arg1.anInt417 <= arg1.anInt430) {
						arg1.anInt417 = arg1.anInt430 + 1;
					}
				} else if (local4 == 327) {
					arg1.anInt420 = 150;
					arg1.anInt421 = (int) (Math.sin((double) anInt983 / 40.0D) * 256.0D) & 0x7FF;
					if (this.aBoolean196) {
						for (local69 = 0; local69 < 7; local69++) {
							@Pc(382) int local382 = this.anIntArray213[local69];
							if (local382 >= 0 && !Class44.aClass44Array1[local382].method481()) {
								return;
							}
						}
						this.aBoolean196 = false;
						@Pc(401) Class8_Sub1_Sub1_Sub5[] local401 = new Class8_Sub1_Sub1_Sub5[7];
						@Pc(403) int local403 = 0;
						for (@Pc(405) int local405 = 0; local405 < 7; local405++) {
							@Pc(412) int local412 = this.anIntArray213[local405];
							if (local412 >= 0) {
								local401[local403++] = Class44.aClass44Array1[local412].method482();
							}
						}
						@Pc(434) Class8_Sub1_Sub1_Sub5 local434 = new Class8_Sub1_Sub1_Sub5(local401, local403, -41715);
						for (@Pc(436) int local436 = 0; local436 < 5; local436++) {
							if (this.anIntArray265[local436] != 0) {
								local434.method224(anIntArrayArray23[local436][0], anIntArrayArray23[local436][this.anIntArray265[local436]]);
								if (local436 == 1) {
									local434.method224(anIntArray250[0], anIntArray250[this.anIntArray265[local436]]);
								}
							}
						}
						local434.method217(979);
						local434.method218(Class46.aClass46Array1[aClass8_Sub1_Sub1_Sub1_Sub2_1.anInt706].anIntArray194[0]);
						local434.method227(64, 850, -30, -50, -30, true);
						arg1.anInt408 = 5;
						arg1.anInt409 = 0;
						Class24.method265(local434);
					}
				} else if (local4 == 324) {
					if (this.aClass8_Sub1_Sub2_Sub1_7 == null) {
						this.aClass8_Sub1_Sub2_Sub1_7 = arg1.aClass8_Sub1_Sub2_Sub1_1;
						this.aClass8_Sub1_Sub2_Sub1_8 = arg1.aClass8_Sub1_Sub2_Sub1_2;
					}
					if (this.aBoolean216) {
						arg1.aClass8_Sub1_Sub2_Sub1_1 = this.aClass8_Sub1_Sub2_Sub1_8;
					} else {
						arg1.aClass8_Sub1_Sub2_Sub1_1 = this.aClass8_Sub1_Sub2_Sub1_7;
					}
				} else if (local4 == 325) {
					if (this.aClass8_Sub1_Sub2_Sub1_7 == null) {
						this.aClass8_Sub1_Sub2_Sub1_7 = arg1.aClass8_Sub1_Sub2_Sub1_1;
						this.aClass8_Sub1_Sub2_Sub1_8 = arg1.aClass8_Sub1_Sub2_Sub1_2;
					}
					if (this.aBoolean216) {
						arg1.aClass8_Sub1_Sub2_Sub1_1 = this.aClass8_Sub1_Sub2_Sub1_7;
					} else {
						arg1.aClass8_Sub1_Sub2_Sub1_1 = this.aClass8_Sub1_Sub2_Sub1_8;
					}
				} else if (local4 == 600) {
					arg1.aString7 = this.aString25;
					if (anInt983 % 20 < 10) {
						arg1.aString7 = arg1.aString7 + "|";
					} else {
						arg1.aString7 = arg1.aString7 + " ";
					}
				} else {
					if (local4 == 620) {
						if (this.anInt943 < 1) {
							arg1.aString7 = "";
						} else if (this.aBoolean229) {
							arg1.anInt403 = 16711680;
							arg1.aString7 = "Moderator option: Mute player for 48 hours: <ON>";
						} else {
							arg1.anInt403 = 16777215;
							arg1.aString7 = "Moderator option: Mute player for 48 hours: <OFF>";
						}
					}
					@Pc(641) String local641;
					if (local4 == 660) {
						local69 = this.anInt853 - this.anInt1014;
						if (local69 <= 0) {
							local641 = "earlier today";
						} else if (local69 == 1) {
							local641 = "yesterday";
						} else {
							local641 = local69 + " days ago";
						}
						arg1.aString7 = "You last logged in @red@" + local641 + "@bla@ from: @red@" + signlink.dns;
					}
					if (local4 == 661) {
						if (this.anInt942 == 0) {
							arg1.aString7 = "\\nYou have not yet set any recovery questions.\\nIt is @lre@strongly@yel@ recommended that you do so.\\n\\nIf you don't you will be @lre@unable to recover your\\n@lre@password@yel@ if you forget it, or it is stolen.";
						} else if (this.anInt942 <= this.anInt853) {
							arg1.aString7 = "\\n\\nRecovery Questions Last Set:\\n@gre@" + this.method677(this.anInt942, 756);
						} else {
							local69 = this.anInt853 + 14 - this.anInt942;
							if (local69 <= 0) {
								local641 = "Earlier today";
							} else if (local69 == 1) {
								local641 = "Yesterday";
							} else {
								local641 = local69 + " days ago";
							}
							arg1.aString7 = local641 + " you requested@lre@ new recovery\\n@lre@questions.@yel@ The requested change will occur\\non: @lre@" + this.method677(this.anInt942, 756) + "\\n\\nIf you do not remember making this request\\ncancel it immediately, and change your password.";
						}
					}
					if (local4 == 662) {
						@Pc(759) String local759;
						if (this.anInt1011 == 0) {
							local759 = "@yel@0 unread messages";
						} else if (this.anInt1011 == 1) {
							local759 = "@gre@1 unread message";
						} else {
							local759 = "@gre@" + this.anInt1011 + " unread messages";
						}
						arg1.aString7 = "You have " + local759 + "\\nin your message centre.";
					}
					if (local4 == 663) {
						if (this.anInt1024 > 0 && this.anInt1024 <= this.anInt853 + 10) {
							arg1.aString7 = "Last password change:\\n@gre@" + this.method677(this.anInt1024, 756);
						} else {
							arg1.aString7 = "Last password change:\\n@gre@Never changed";
						}
					}
					if (local4 == 665) {
						if (this.anInt986 > 2 && !aBoolean236) {
							arg1.aString7 = "This is a non-members\\nworld. To enjoy your\\nmembers benefits we\\nrecommend you play on a\\nmembers world instead.";
						} else if (this.anInt986 > 2) {
							arg1.aString7 = "\\n\\nYou have @gre@" + this.anInt986 + "@yel@ days of\\nmember credit remaining.";
						} else if (this.anInt986 > 0) {
							arg1.aString7 = "You have @gre@" + this.anInt986 + "@yel@ days of\\nmember credit remaining.\\n\\n@lre@Credit low! Renew now\\n@lre@to avoid losing members.";
						} else {
							arg1.aString7 = "You are not a member.\\n\\nChoose to subscribe and\\nyou'll get loads of extra\\nbenefits and features.";
						}
					}
					if (local4 == 667) {
						if (this.anInt986 > 2 && !aBoolean236) {
							arg1.aString7 = "To switch to a members-only world:\\n1) Logout and return to the world selection page.\\n2) Choose one of the members world with a gold star next to it's name.\\n\\nIf you prefer you can continue to use this world,\\nbut members only features will be unavailable here.";
						} else if (this.anInt986 > 0) {
							arg1.aString7 = "To extend or cancel a subscription:\\n1) Logout and return to the frontpage of this website.\\n2)Choose the relevant option from the 'membership' section.\\n\\nNote: If you are a credit card subscriber a top-up payment will\\nautomatically be taken when 3 days credit remain.\\n(unless you cancel your subscription, which can be done at any time.)";
						} else {
							arg1.aString7 = "To start a subscripton:\\n1) Logout and return to the frontpage of this website.\\n2) Choose 'Start a new subscription'";
						}
					}
					if (local4 == 668) {
						if (this.anInt942 > this.anInt853) {
							arg1.aString7 = "To cancel this request:\\n1) Logout and return to the frontpage of this website.\\n2) Choose 'Cancel recovery questions'.";
						} else {
							arg1.aString7 = "To change your recovery questions:\\n1) Logout and return to the frontpage of this website.\\n2) Choose 'Set new recovery questions'.";
						}
					}
				}
			} else if (local4 == 1 && this.anInt1082 == 0) {
				arg1.aString7 = "Loading friend list";
				arg1.anInt414 = 0;
			} else if (local4 == 1 && this.anInt1082 == 1) {
				arg1.aString7 = "Connecting to friendserver";
				arg1.anInt414 = 0;
			} else if (local4 == 2 && this.anInt1082 != 2) {
				arg1.aString7 = "Please wait...";
				arg1.anInt414 = 0;
			} else {
				local69 = this.anInt1081;
				if (this.anInt1082 != 2) {
					local69 = 0;
				}
				if (local4 > 700) {
					local4 -= 601;
				} else {
					local4--;
				}
				if (local4 >= local69) {
					arg1.aString7 = "";
					arg1.anInt414 = 0;
				} else {
					arg1.aString7 = this.aStringArray9[local4];
					arg1.anInt414 = 1;
				}
			}
		} catch (@Pc(916) RuntimeException local916) {
			signlink.reporterror("85779, " + arg0 + ", " + arg1 + ", " + local916.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "f", descriptor = "(II)Ljava/lang/String;")
	private String method677(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			if (arg0 > this.anInt853 + 10) {
				return "Unknown";
			}
			@Pc(14) long local14 = ((long) arg0 + 11745L) * 86400000L;
			@Pc(18) boolean local18 = false;
			@Pc(20) Calendar local20 = Calendar.getInstance();
			local20.setTime(new Date(local14));
			@Pc(30) int local30 = local20.get(5);
			@Pc(34) int local34 = local20.get(2);
			@Pc(38) int local38 = local20.get(1);
			@Pc(89) String[] local89 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };
			return local30 + "-" + local89[local34] + "-" + local38;
		} catch (@Pc(107) RuntimeException local107) {
			signlink.reporterror("28016, " + arg0 + ", " + arg1 + ", " + local107.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "B", descriptor = "(I)V")
	private void method679() {
		try {
			this.aClass11_6.method70();
			Class8_Sub1_Sub2_Sub4.anIntArray206 = this.anIntArray226;
			this.aClass8_Sub1_Sub2_Sub2_20.method406(0, 0);
			if (this.aBoolean201) {
				this.aClass8_Sub1_Sub2_Sub3_4.method447(0, 239, this.aString26, 40);
				this.aClass8_Sub1_Sub2_Sub3_4.method447(128, 239, this.aString30 + "*", 60);
			} else if (this.anInt940 == 1) {
				this.aClass8_Sub1_Sub2_Sub3_4.method447(0, 239, "Enter amount:", 40);
				this.aClass8_Sub1_Sub2_Sub3_4.method447(128, 239, this.aString19 + "*", 60);
			} else if (this.anInt940 == 2) {
				this.aClass8_Sub1_Sub2_Sub3_4.method447(0, 239, "Enter name:", 40);
				this.aClass8_Sub1_Sub2_Sub3_4.method447(128, 239, this.aString19 + "*", 60);
			} else {
				@Pc(130) Class8_Sub1_Sub2_Sub3 local130;
				@Pc(138) int local138;
				@Pc(149) int local149;
				if (this.anInt940 == 3) {
					if (this.aString19 != this.aString20) {
						this.method720(this.aString19);
						this.aString20 = this.aString19;
					}
					local130 = this.aClass8_Sub1_Sub2_Sub3_3;
					Class8_Sub1_Sub2.method547(77, 0, 0, 463);
					for (local138 = 0; local138 < this.anInt901; local138++) {
						local149 = local138 * 14 + 18 - this.anInt902;
						if (local149 > 0 && local149 < 110) {
							local130.method447(0, 239, this.aStringArray8[local138], local149);
						}
					}
					Class8_Sub1_Sub2.method546();
					if (this.anInt901 > 5) {
						this.method631(this.anInt902, 77, this.anInt901 * 14 + 7, 463, 0);
					}
					if (this.aString19.length() == 0) {
						this.aClass8_Sub1_Sub2_Sub3_4.method447(255, 239, "Enter object name", 40);
					} else if (this.anInt901 == 0) {
						this.aClass8_Sub1_Sub2_Sub3_4.method447(0, 239, "No matching objects found, please shorten search", 40);
					}
					local130.method447(0, 239, this.aString19 + "*", 90);
					Class8_Sub1_Sub2.method553(77, 0, 0, 479);
				} else if (this.aString31 != null) {
					this.aClass8_Sub1_Sub2_Sub3_4.method447(0, 239, this.aString31, 40);
					this.aClass8_Sub1_Sub2_Sub3_4.method447(128, 239, "Click to continue", 60);
				} else if (this.anInt973 != -1) {
					this.method668(0, Class24.method269(this.anInt973), 0, 0);
				} else if (this.anInt1022 == -1) {
					local130 = this.aClass8_Sub1_Sub2_Sub3_3;
					local138 = 0;
					Class8_Sub1_Sub2.method547(77, 0, 0, 463);
					for (local149 = 0; local149 < 100; local149++) {
						if (this.aStringArray13[local149] != null) {
							@Pc(314) int local314 = this.anIntArray264[local149];
							@Pc(323) int local323 = this.anInt914 + 70 - local138 * 14;
							@Pc(328) String local328 = this.aStringArray12[local149];
							@Pc(330) byte local330 = 0;
							if (local328 != null && local328.startsWith("@cr1@")) {
								local328 = local328.substring(5);
								local330 = 1;
							}
							if (local328 != null && local328.startsWith("@cr2@")) {
								local328 = local328.substring(5);
								local330 = 2;
							}
							if (local314 == 0) {
								if (local323 > 0 && local323 < 110) {
									local130.method451(0, this.aStringArray13[local149], 4, local323);
								}
								local138++;
							}
							@Pc(400) int local400;
							if ((local314 == 1 || local314 == 2) && (local314 == 1 || this.anInt988 == 0 || this.anInt988 == 1 && this.method713(local328))) {
								if (local323 > 0 && local323 < 110) {
									local400 = 4;
									if (local330 == 1) {
										this.aClass8_Sub1_Sub2_Sub2Array5[0].method406(local323 - 12, 4);
										local400 += 14;
									}
									if (local330 == 2) {
										this.aClass8_Sub1_Sub2_Sub2Array5[1].method406(local323 - 12, local400);
										local400 += 14;
									}
									local130.method451(0, local328 + ":", local400, local323);
									local400 += local130.method449(local328) + 8;
									local130.method451(255, this.aStringArray13[local149], local400, local323);
								}
								local138++;
							}
							if ((local314 == 3 || local314 == 7) && this.anInt858 == 0 && (local314 == 7 || this.anInt1016 == 0 || this.anInt1016 == 1 && this.method713(local328))) {
								if (local323 > 0 && local323 < 110) {
									local130.method451(0, "From", 4, local323);
									local400 = local130.method449("From ") + 4;
									if (local330 == 1) {
										this.aClass8_Sub1_Sub2_Sub2Array5[0].method406(local323 - 12, local400);
										local400 += 14;
									}
									if (local330 == 2) {
										this.aClass8_Sub1_Sub2_Sub2Array5[1].method406(local323 - 12, local400);
										local400 += 14;
									}
									local130.method451(0, local328 + ":", local400, local323);
									local400 += local130.method449(local328) + 8;
									local130.method451(8388608, this.aStringArray13[local149], local400, local323);
								}
								local138++;
							}
							if (local314 == 4 && (this.anInt976 == 0 || this.anInt976 == 1 && this.method713(local328))) {
								if (local323 > 0 && local323 < 110) {
									local130.method451(8388736, local328 + " " + this.aStringArray13[local149], 4, local323);
								}
								local138++;
							}
							if (local314 == 5 && this.anInt858 == 0 && this.anInt1016 < 2) {
								if (local323 > 0 && local323 < 110) {
									local130.method451(8388608, this.aStringArray13[local149], 4, local323);
								}
								local138++;
							}
							if (local314 == 6 && this.anInt858 == 0 && this.anInt1016 < 2) {
								if (local323 > 0 && local323 < 110) {
									local130.method451(0, "To " + local328 + ":", 4, local323);
									local130.method451(8388608, this.aStringArray13[local149], local130.method449("To " + local328) + 12, local323);
								}
								local138++;
							}
							if (local314 == 8 && (this.anInt976 == 0 || this.anInt976 == 1 && this.method713(local328))) {
								if (local323 > 0 && local323 < 110) {
									local130.method451(8270336, local328 + " " + this.aStringArray13[local149], 4, local323);
								}
								local138++;
							}
						}
					}
					Class8_Sub1_Sub2.method546();
					this.anInt980 = local138 * 14 + 7;
					if (this.anInt980 < 78) {
						this.anInt980 = 78;
					}
					this.method631(this.anInt980 - this.anInt914 - 77, 77, this.anInt980, 463, 0);
					@Pc(770) String local770;
					if (aClass8_Sub1_Sub1_Sub1_Sub2_1 == null || aClass8_Sub1_Sub1_Sub1_Sub2_1.aString15 == null) {
						local770 = Class36.method385(839, this.aString27);
					} else {
						local770 = aClass8_Sub1_Sub1_Sub1_Sub2_1.aString15;
					}
					local130.method451(0, local770 + ":", 4, 90);
					local130.method451(255, this.aString29 + "*", local130.method449(local770 + ": ") + 6, 90);
					Class8_Sub1_Sub2.method553(77, 0, 0, 479);
				} else {
					this.method668(0, Class24.method269(this.anInt1022), 0, 0);
				}
			}
			if (this.aBoolean208 && this.anInt892 == 2) {
				this.method610();
			}
			this.aClass11_6.method71(17, super.aGraphics2, 357);
			this.aClass11_5.method70();
			Class8_Sub1_Sub2_Sub4.anIntArray206 = this.anIntArray228;
		} catch (@Pc(851) RuntimeException local851) {
			signlink.reporterror("50009, " + 7 + ", " + local851.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIB)I")
	private int method680(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		try {
			@Pc(3) int local3 = arg2 >> 7;
			@Pc(7) int local7 = arg0 >> 7;
			if (local3 < 0 || local7 < 0 || local3 > 103 || local7 > 103) {
				return 0;
			}
			@Pc(21) int local21 = arg1;
			if (arg1 < 3 && (this.aByteArrayArrayArray8[1][local3][local7] & 0x2) == 2) {
				local21 = arg1 + 1;
			}
			@Pc(41) int local41 = arg2 & 0x7F;
			@Pc(45) int local45 = arg0 & 0x7F;
			@Pc(73) int local73 = this.anIntArrayArrayArray7[local21][local3][local7] * (128 - local41) + this.anIntArrayArrayArray7[local21][local3 + 1][local7] * local41 >> 7;
			@Pc(105) int local105 = this.anIntArrayArrayArray7[local21][local3][local7 + 1] * (128 - local41) + this.anIntArrayArrayArray7[local21][local3 + 1][local7 + 1] * local41 >> 7;
			return local73 * (128 - local45) + local105 * local45 >> 7;
		} catch (@Pc(124) RuntimeException local124) {
			signlink.reporterror("94994, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + -112 + ", " + local124.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "C", descriptor = "(I)V")
	private void method681(@OriginalArg(0) int arg0) {
		try {
			if (this.anInt961 == 0 && this.anInt865 == 0) {
				this.aStringArray14[this.anInt1025] = "Walk here";
				this.anIntArray262[this.anInt1025] = 66;
				this.anIntArray260[this.anInt1025] = super.anInt840;
				this.anIntArray261[this.anInt1025] = super.anInt841;
				this.anInt1025++;
			}
			@Pc(41) int local41 = -1;
			for (@Pc(43) int local43 = 0; local43 < Class8_Sub1_Sub1_Sub5.anInt303; local43++) {
				@Pc(49) int local49 = Class8_Sub1_Sub1_Sub5.anIntArray89[local43];
				@Pc(53) int local53 = local49 & 0x7F;
				@Pc(59) int local59 = local49 >> 7 & 0x7F;
				@Pc(65) int local65 = local49 >> 29 & 0x3;
				@Pc(71) int local71 = local49 >> 14 & 0x7FFF;
				if (local49 != local41) {
					local41 = local49;
					@Pc(219) int local219;
					if (local65 == 2 && this.aClass32_1.method346(this.anInt933, local53, local59, local49) >= 0) {
						@Pc(91) Class23 local91 = Class23.method260(local71);
						if (local91.anIntArray112 != null) {
							local91 = local91.method251(this.aByte24);
						}
						if (local91 == null) {
							continue;
						}
						if (this.anInt961 == 1) {
							this.aStringArray14[this.anInt1025] = "Use " + this.aString24 + " with @cya@" + local91.aString6;
							this.anIntArray262[this.anInt1025] = 124;
							this.anIntArray263[this.anInt1025] = local49;
							this.anIntArray260[this.anInt1025] = local53;
							this.anIntArray261[this.anInt1025] = local59;
							this.anInt1025++;
						} else if (this.anInt865 != 1) {
							if (local91.aStringArray4 != null) {
								for (local219 = 4; local219 >= 0; local219--) {
									if (local91.aStringArray4[local219] != null) {
										this.aStringArray14[this.anInt1025] = local91.aStringArray4[local219] + " @cya@" + local91.aString6;
										if (local219 == 0) {
											this.anIntArray262[this.anInt1025] = 178;
										}
										if (local219 == 1) {
											this.anIntArray262[this.anInt1025] = 638;
										}
										if (local219 == 2) {
											this.anIntArray262[this.anInt1025] = 386;
										}
										if (local219 == 3) {
											this.anIntArray262[this.anInt1025] = 463;
										}
										if (local219 == 4) {
											this.anIntArray262[this.anInt1025] = 1901;
										}
										this.anIntArray263[this.anInt1025] = local49;
										this.anIntArray260[this.anInt1025] = local53;
										this.anIntArray261[this.anInt1025] = local59;
										this.anInt1025++;
									}
								}
							}
							this.aStringArray14[this.anInt1025] = "Examine @cya@" + local91.aString6;
							this.anIntArray262[this.anInt1025] = 1881;
							this.anIntArray263[this.anInt1025] = local91.anInt379 << 14;
							this.anIntArray260[this.anInt1025] = local53;
							this.anIntArray261[this.anInt1025] = local59;
							this.anInt1025++;
						} else if ((this.anInt867 & 0x4) == 4) {
							this.aStringArray14[this.anInt1025] = this.aString18 + " @cya@" + local91.aString6;
							this.anIntArray262[this.anInt1025] = 584;
							this.anIntArray263[this.anInt1025] = local49;
							this.anIntArray260[this.anInt1025] = local53;
							this.anIntArray261[this.anInt1025] = local59;
							this.anInt1025++;
						}
					}
					@Pc(399) Class8_Sub1_Sub1_Sub1_Sub1 local399;
					@Pc(447) Class8_Sub1_Sub1_Sub1_Sub2 local447;
					@Pc(437) int local437;
					if (local65 == 1) {
						@Pc(370) Class8_Sub1_Sub1_Sub1_Sub1 local370 = this.aClass8_Sub1_Sub1_Sub1_Sub1Array1[local71];
						if (local370.aClass26_1.aByte11 == 1 && (local370.anInt716 & 0x7F) == 64 && (local370.anInt717 & 0x7F) == 64) {
							for (local219 = 0; local219 < this.anInt950; local219++) {
								local399 = this.aClass8_Sub1_Sub1_Sub1_Sub1Array1[this.anIntArray223[local219]];
								if (local399 != null && local399 != local370 && local399.aClass26_1.aByte11 == 1 && local399.anInt716 == local370.anInt716 && local399.anInt717 == local370.anInt717) {
									this.method701(this.anIntArray223[local219], local59, local53, local399.aClass26_1);
								}
							}
							for (local437 = 0; local437 < this.anInt968; local437++) {
								local447 = this.aClass8_Sub1_Sub1_Sub1_Sub2Array1[this.anIntArray236[local437]];
								if (local447 != null && local447.anInt716 == local370.anInt716 && local447.anInt717 == local370.anInt717) {
									this.method690(local447, local59, local53, this.anIntArray236[local437]);
								}
							}
						}
						this.method701(local71, local59, local53, local370.aClass26_1);
					}
					if (local65 == 0) {
						@Pc(489) Class8_Sub1_Sub1_Sub1_Sub2 local489 = this.aClass8_Sub1_Sub1_Sub1_Sub2Array1[local71];
						if ((local489.anInt716 & 0x7F) == 64 && (local489.anInt717 & 0x7F) == 64) {
							for (local219 = 0; local219 < this.anInt950; local219++) {
								local399 = this.aClass8_Sub1_Sub1_Sub1_Sub1Array1[this.anIntArray223[local219]];
								if (local399 != null && local399.aClass26_1.aByte11 == 1 && local399.anInt716 == local489.anInt716 && local399.anInt717 == local489.anInt717) {
									this.method701(this.anIntArray223[local219], local59, local53, local399.aClass26_1);
								}
							}
							for (local437 = 0; local437 < this.anInt968; local437++) {
								local447 = this.aClass8_Sub1_Sub1_Sub1_Sub2Array1[this.anIntArray236[local437]];
								if (local447 != null && local447 != local489 && local447.anInt716 == local489.anInt716 && local447.anInt717 == local489.anInt717) {
									this.method690(local447, local59, local53, this.anIntArray236[local437]);
								}
							}
						}
						this.method690(local489, local59, local53, local71);
					}
					if (local65 == 3) {
						@Pc(608) Class49 local608 = this.aClass49ArrayArrayArray1[this.anInt933][local53][local59];
						if (local608 != null) {
							for (@Pc(615) Class8_Sub1_Sub1_Sub3 local615 = (Class8_Sub1_Sub1_Sub3) local608.method539(); local615 != null; local615 = (Class8_Sub1_Sub1_Sub3) local608.method541()) {
								@Pc(621) Class19 local621 = Class19.method191(local615.anInt201);
								if (this.anInt961 == 1) {
									this.aStringArray14[this.anInt1025] = "Use " + this.aString24 + " with @lre@" + local621.aString4;
									this.anIntArray262[this.anInt1025] = 450;
									this.anIntArray263[this.anInt1025] = local615.anInt201;
									this.anIntArray260[this.anInt1025] = local53;
									this.anIntArray261[this.anInt1025] = local59;
									this.anInt1025++;
								} else if (this.anInt865 != 1) {
									for (@Pc(738) int local738 = 4; local738 >= 0; local738--) {
										if (local621.aStringArray2 != null && local621.aStringArray2[local738] != null) {
											this.aStringArray14[this.anInt1025] = local621.aStringArray2[local738] + " @lre@" + local621.aString4;
											if (local738 == 0) {
												this.anIntArray262[this.anInt1025] = 738;
											}
											if (local738 == 1) {
												this.anIntArray262[this.anInt1025] = 794;
											}
											if (local738 == 2) {
												this.anIntArray262[this.anInt1025] = 54;
											}
											if (local738 == 3) {
												this.anIntArray262[this.anInt1025] = 409;
											}
											if (local738 == 4) {
												this.anIntArray262[this.anInt1025] = 321;
											}
											this.anIntArray263[this.anInt1025] = local615.anInt201;
											this.anIntArray260[this.anInt1025] = local53;
											this.anIntArray261[this.anInt1025] = local59;
											this.anInt1025++;
										} else if (local738 == 2) {
											this.aStringArray14[this.anInt1025] = "Take @lre@" + local621.aString4;
											this.anIntArray262[this.anInt1025] = 54;
											this.anIntArray263[this.anInt1025] = local615.anInt201;
											this.anIntArray260[this.anInt1025] = local53;
											this.anIntArray261[this.anInt1025] = local59;
											this.anInt1025++;
										}
									}
									this.aStringArray14[this.anInt1025] = "Examine @lre@" + local621.aString4;
									this.anIntArray262[this.anInt1025] = 1065;
									this.anIntArray263[this.anInt1025] = local615.anInt201;
									this.anIntArray260[this.anInt1025] = local53;
									this.anIntArray261[this.anInt1025] = local59;
									this.anInt1025++;
								} else if ((this.anInt867 & 0x1) == 1) {
									this.aStringArray14[this.anInt1025] = this.aString18 + " @lre@" + local621.aString4;
									this.anIntArray262[this.anInt1025] = 524;
									this.anIntArray263[this.anInt1025] = local615.anInt201;
									this.anIntArray260[this.anInt1025] = local53;
									this.anIntArray261[this.anInt1025] = local59;
									this.anInt1025++;
								}
							}
						}
					}
				}
			}
			if (arg0 != 7058) {
				this.anInt928 = -255;
			}
		} catch (@Pc(951) RuntimeException local951) {
			signlink.reporterror("73776, " + arg0 + ", " + local951.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "D", descriptor = "(I)V")
	private void method682() {
		try {
			@Pc(3) int local3 = 5;
			this.anIntArray266[8] = 0;
			@Pc(21) int local21 = 0;
			while (this.anIntArray266[8] == 0) {
				@Pc(25) String local25 = "Unknown problem";
				this.method586("Connecting to web server", 20, (byte) 6);
				try {
					@Pc(47) DataInputStream local47 = this.method700("crc" + (int) (Math.random() * 9.9999999E7D) + "-" + 376);
					@Pc(54) Class8_Sub1_Sub3 local54 = new Class8_Sub1_Sub3(new byte[40], 713);
					local47.readFully(local54.aByteArray7, 0, 40);
					local47.close();
					for (@Pc(64) int local64 = 0; local64 < 9; local64++) {
						this.anIntArray266[local64] = local54.method157();
					}
					@Pc(79) int local79 = local54.method157();
					@Pc(81) int local81 = 1234;
					for (@Pc(83) int local83 = 0; local83 < 9; local83++) {
						local81 = (local81 << 1) + this.anIntArray266[local83];
					}
					if (local79 != local81) {
						local25 = "checksum problem";
						this.anIntArray266[8] = 0;
					}
				} catch (@Pc(110) EOFException local110) {
					local25 = "EOF problem";
					this.anIntArray266[8] = 0;
				} catch (@Pc(119) IOException local119) {
					local25 = "connection problem";
					this.anIntArray266[8] = 0;
				} catch (@Pc(128) Exception local128) {
					local25 = "logic problem";
					this.anIntArray266[8] = 0;
					if (!signlink.reporterror) {
						return;
					}
				}
				if (this.anIntArray266[8] == 0) {
					local21++;
					for (@Pc(146) int local146 = local3; local146 > 0; local146--) {
						if (local21 >= 10) {
							this.method586("Game updated - please reload page", 10, (byte) 6);
							local146 = 10;
						} else {
							this.method586(local25 + " - Will retry in " + local146 + " secs.", 10, (byte) 6);
						}
						try {
							Thread.sleep(1000L);
						} catch (@Pc(180) Exception local180) {
						}
					}
					local3 *= 2;
					if (local3 > 60) {
						local3 = 60;
					}
					this.aBoolean225 = !this.aBoolean225;
				}
			}
		} catch (@Pc(208) RuntimeException local208) {
			signlink.reporterror("61713, " + -800 + ", " + local208.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(IZ)V")
	private void method683(@OriginalArg(0) int arg0) {
		try {
			if (!aBoolean237) {
				for (@Pc(11) int local11 = 0; local11 < this.anIntArray245.length; local11++) {
					@Pc(18) int local18 = this.anIntArray245[local11];
					if (Class8_Sub1_Sub2_Sub4.anIntArray208[local18] >= arg0) {
						@Pc(27) Class8_Sub1_Sub2_Sub2 local27 = Class8_Sub1_Sub2_Sub4.aClass8_Sub1_Sub2_Sub2Array1[local18];
						@Pc(35) int local35 = local27.anInt601 * local27.anInt602 - 1;
						@Pc(43) int local43 = local27.anInt601 * this.anInt1023 * 2;
						@Pc(46) byte[] local46 = local27.aByteArray19;
						@Pc(49) byte[] local49 = this.aByteArray21;
						for (@Pc(51) int local51 = 0; local51 <= local35; local51++) {
							local49[local51] = local46[local51 - local43 & local35];
						}
						local27.aByteArray19 = local49;
						this.aByteArray21 = local46;
						Class8_Sub1_Sub2_Sub4.method564(local18);
						anInt960++;
						if (anInt960 > 90) {
							anInt960 = 0;
							this.aClass8_Sub1_Sub3_6.method141(137);
						}
					}
				}
			}
		} catch (@Pc(98) RuntimeException local98) {
			signlink.reporterror("42140, " + arg0 + ", " + false + ", " + local98.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(JI)V")
	private void method684(@OriginalArg(0) long arg0) {
		try {
			this.anInt1044 += 0;
			if (arg0 != 0L) {
				for (@Pc(14) int local14 = 0; local14 < this.anInt917; local14++) {
					if (this.aLongArray4[local14] == arg0) {
						this.anInt917--;
						this.aBoolean217 = true;
						for (@Pc(34) int local34 = local14; local34 < this.anInt917; local34++) {
							this.aLongArray4[local34] = this.aLongArray4[local34 + 1];
						}
						this.aClass8_Sub1_Sub3_6.method141(240);
						this.aClass8_Sub1_Sub3_6.method148(arg0);
						return;
					}
				}
			}
		} catch (@Pc(69) RuntimeException local69) {
			signlink.reporterror("83503, " + arg0 + ", " + 0 + ", " + local69.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Lclient!IUVBENCV;II)V")
	private void method685(@OriginalArg(0) Class8_Sub1_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		try {
			@Pc(3) boolean local3 = false;
			for (@Pc(5) int local5 = 0; local5 < this.anInt969; local5++) {
				@Pc(12) int local12 = this.anIntArray237[local5];
				@Pc(17) Class8_Sub1_Sub1_Sub1_Sub2 local17 = this.aClass8_Sub1_Sub1_Sub1_Sub2Array1[local12];
				@Pc(20) int local20 = arg0.method152();
				if ((local20 & 0x10) != 0) {
					local20 += arg0.method152() << 8;
				}
				this.method671(local12, local20, local17, arg0);
			}
		} catch (@Pc(45) RuntimeException local45) {
			signlink.reporterror("19553, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local45.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "k", descriptor = "(Z)V")
	private void method687() {
		try {
			this.aClass11_3.method70();
			Class8_Sub1_Sub2_Sub4.anIntArray206 = this.anIntArray227;
			this.aClass8_Sub1_Sub2_Sub2_18.method406(0, 0);
			if (this.anInt934 != -1) {
				this.method668(0, Class24.method269(this.anInt934), 0, 0);
			} else if (this.anIntArray249[this.anInt1060] != -1) {
				this.method668(0, Class24.method269(this.anIntArray249[this.anInt1060]), 0, 0);
			}
			if (this.aBoolean208 && this.anInt892 == 1) {
				this.method610();
			}
			this.aClass11_3.method71(553, super.aGraphics2, 205);
			this.aClass11_5.method70();
			Class8_Sub1_Sub2_Sub4.anIntArray206 = this.anIntArray228;
		} catch (@Pc(79) RuntimeException local79) {
			signlink.reporterror("12338, " + false + ", " + local79.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "E", descriptor = "(I)V")
	private void method688() {
		try {
			for (@Pc(6) Class8_Sub1_Sub1_Sub2 local6 = (Class8_Sub1_Sub1_Sub2) this.aClass49_10.method538(); local6 != null; local6 = (Class8_Sub1_Sub1_Sub2) this.aClass49_10.method540((byte) 6)) {
				if (local6.anInt139 != this.anInt933 || local6.aBoolean31) {
					local6.method543();
				} else if (anInt983 >= local6.anInt138) {
					local6.method82(this.anInt1023);
					if (local6.aBoolean31) {
						local6.method543();
					} else {
						this.aClass32_1.method327(this.anInt869, 60, local6.anInt140, local6.anInt139, -1, local6.anInt141, false, local6, local6.anInt142, 0);
					}
				}
			}
		} catch (@Pc(73) RuntimeException local73) {
			signlink.reporterror("77303, " + 6 + ", " + local73.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "l", descriptor = "(B)V")
	private void method689() {
		try {
			if (super.anInt845 == 1) {
				if (super.anInt846 >= 539 && super.anInt846 <= 573 && super.anInt847 >= 169 && super.anInt847 < 205 && this.anIntArray249[0] != -1) {
					this.aBoolean217 = true;
					this.anInt1060 = 0;
					this.aBoolean195 = true;
				}
				if (super.anInt846 >= 569 && super.anInt846 <= 599 && super.anInt847 >= 168 && super.anInt847 < 205 && this.anIntArray249[1] != -1) {
					this.aBoolean217 = true;
					this.anInt1060 = 1;
					this.aBoolean195 = true;
				}
				if (super.anInt846 >= 597 && super.anInt846 <= 627 && super.anInt847 >= 168 && super.anInt847 < 205 && this.anIntArray249[2] != -1) {
					this.aBoolean217 = true;
					this.anInt1060 = 2;
					this.aBoolean195 = true;
				}
				if (super.anInt846 >= 625 && super.anInt846 <= 669 && super.anInt847 >= 168 && super.anInt847 < 203 && this.anIntArray249[3] != -1) {
					this.aBoolean217 = true;
					this.anInt1060 = 3;
					this.aBoolean195 = true;
				}
				if (super.anInt846 >= 666 && super.anInt846 <= 696 && super.anInt847 >= 168 && super.anInt847 < 205 && this.anIntArray249[4] != -1) {
					this.aBoolean217 = true;
					this.anInt1060 = 4;
					this.aBoolean195 = true;
				}
				if (super.anInt846 >= 694 && super.anInt846 <= 724 && super.anInt847 >= 168 && super.anInt847 < 205 && this.anIntArray249[5] != -1) {
					this.aBoolean217 = true;
					this.anInt1060 = 5;
					this.aBoolean195 = true;
				}
				if (super.anInt846 >= 722 && super.anInt846 <= 756 && super.anInt847 >= 169 && super.anInt847 < 205 && this.anIntArray249[6] != -1) {
					this.aBoolean217 = true;
					this.anInt1060 = 6;
					this.aBoolean195 = true;
				}
				if (super.anInt846 >= 540 && super.anInt846 <= 574 && super.anInt847 >= 466 && super.anInt847 < 502 && this.anIntArray249[7] != -1) {
					this.aBoolean217 = true;
					this.anInt1060 = 7;
					this.aBoolean195 = true;
				}
				if (super.anInt846 >= 572 && super.anInt846 <= 602 && super.anInt847 >= 466 && super.anInt847 < 503 && this.anIntArray249[8] != -1) {
					this.aBoolean217 = true;
					this.anInt1060 = 8;
					this.aBoolean195 = true;
				}
				if (super.anInt846 >= 599 && super.anInt846 <= 629 && super.anInt847 >= 466 && super.anInt847 < 503 && this.anIntArray249[9] != -1) {
					this.aBoolean217 = true;
					this.anInt1060 = 9;
					this.aBoolean195 = true;
				}
				if (super.anInt846 >= 627 && super.anInt846 <= 671 && super.anInt847 >= 467 && super.anInt847 < 502 && this.anIntArray249[10] != -1) {
					this.aBoolean217 = true;
					this.anInt1060 = 10;
					this.aBoolean195 = true;
				}
				if (super.anInt846 >= 669 && super.anInt846 <= 699 && super.anInt847 >= 466 && super.anInt847 < 503 && this.anIntArray249[11] != -1) {
					this.aBoolean217 = true;
					this.anInt1060 = 11;
					this.aBoolean195 = true;
				}
				if (super.anInt846 >= 696 && super.anInt846 <= 726 && super.anInt847 >= 466 && super.anInt847 < 503 && this.anIntArray249[12] != -1) {
					this.aBoolean217 = true;
					this.anInt1060 = 12;
					this.aBoolean195 = true;
				}
				if (super.anInt846 >= 724 && super.anInt846 <= 758 && super.anInt847 >= 466 && super.anInt847 < 502 && this.anIntArray249[13] != -1) {
					this.aBoolean217 = true;
					this.anInt1060 = 13;
					this.aBoolean195 = true;
					return;
				}
			}
		} catch (@Pc(448) RuntimeException local448) {
			signlink.reporterror("82645, " + -49 + ", " + local448.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ZLclient!VJDNWPCM;III)V")
	private void method690(@OriginalArg(1) Class8_Sub1_Sub1_Sub1_Sub2 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		try {
			if (arg0 != aClass8_Sub1_Sub1_Sub1_Sub2_1 && this.anInt1025 < 400) {
				@Pc(35) String local35;
				if (arg0.anInt739 == 0) {
					local35 = arg0.aString15 + method712(aClass8_Sub1_Sub1_Sub1_Sub2_1.anInt743, arg0.anInt743) + " (level-" + arg0.anInt743 + ")";
				} else {
					local35 = arg0.aString15 + " (skill-" + arg0.anInt739 + ")";
				}
				@Pc(165) int local165;
				if (this.anInt961 == 1) {
					this.aStringArray14[this.anInt1025] = "Use " + this.aString24 + " with @whi@" + local35;
					this.anIntArray262[this.anInt1025] = 766;
					this.anIntArray263[this.anInt1025] = arg3;
					this.anIntArray260[this.anInt1025] = arg2;
					this.anIntArray261[this.anInt1025] = arg1;
					this.anInt1025++;
				} else if (this.anInt865 != 1) {
					for (local165 = 4; local165 >= 0; local165--) {
						if (this.aStringArray10[local165] != null) {
							this.aStringArray14[this.anInt1025] = this.aStringArray10[local165] + " @whi@" + local35;
							@Pc(192) short local192 = 0;
							if (this.aStringArray10[local165].equalsIgnoreCase("attack")) {
								if (arg0.anInt743 > aClass8_Sub1_Sub1_Sub1_Sub2_1.anInt743) {
									local192 = 2000;
								}
								if (aClass8_Sub1_Sub1_Sub1_Sub2_1.anInt745 != 0 && arg0.anInt745 != 0) {
									if (aClass8_Sub1_Sub1_Sub1_Sub2_1.anInt745 == arg0.anInt745) {
										local192 = 2000;
									} else {
										local192 = 0;
									}
								}
							} else if (this.aBooleanArray11[local165]) {
								local192 = 2000;
							}
							if (local165 == 0) {
								this.anIntArray262[this.anInt1025] = local192 + 665;
							}
							if (local165 == 1) {
								this.anIntArray262[this.anInt1025] = local192 + 429;
							}
							if (local165 == 2) {
								this.anIntArray262[this.anInt1025] = local192 + 42;
							}
							if (local165 == 3) {
								this.anIntArray262[this.anInt1025] = local192 + 663;
							}
							if (local165 == 4) {
								this.anIntArray262[this.anInt1025] = local192 + 634;
							}
							this.anIntArray263[this.anInt1025] = arg3;
							this.anIntArray260[this.anInt1025] = arg2;
							this.anIntArray261[this.anInt1025] = arg1;
							this.anInt1025++;
						}
					}
				} else if ((this.anInt867 & 0x8) == 8) {
					this.aStringArray14[this.anInt1025] = this.aString18 + " @whi@" + local35;
					this.anIntArray262[this.anInt1025] = 618;
					this.anIntArray263[this.anInt1025] = arg3;
					this.anIntArray260[this.anInt1025] = arg2;
					this.anIntArray261[this.anInt1025] = arg1;
					this.anInt1025++;
				}
				for (local165 = 0; local165 < this.anInt1025; local165++) {
					if (this.anIntArray262[local165] == 66) {
						this.aStringArray14[local165] = "Walk here @whi@" + local35;
						break;
					}
				}
			}
		} catch (@Pc(347) RuntimeException local347) {
			signlink.reporterror("56445, " + false + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local347.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(JI)V")
	private void method691(@OriginalArg(0) long arg0) {
		try {
			if (arg0 != 0L) {
				for (@Pc(8) int local8 = 0; local8 < this.anInt1081; local8++) {
					if (this.aLongArray3[local8] == arg0) {
						this.anInt1081--;
						this.aBoolean217 = true;
						for (@Pc(28) int local28 = local8; local28 < this.anInt1081; local28++) {
							this.aStringArray9[local28] = this.aStringArray9[local28 + 1];
							this.anIntArray267[local28] = this.anIntArray267[local28 + 1];
							this.aLongArray3[local28] = this.aLongArray3[local28 + 1];
						}
						this.aClass8_Sub1_Sub3_6.method141(19);
						this.aClass8_Sub1_Sub3_6.method148(arg0);
						break;
					}
				}
			}
		} catch (@Pc(95) RuntimeException local95) {
			signlink.reporterror("95985, " + arg0 + ", " + 6362 + ", " + local95.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "F", descriptor = "(I)Ljava/net/Socket;")
	public Socket method692(@OriginalArg(0) int arg0) throws IOException {
		return signlink.mainapp == null ? new Socket(InetAddress.getByName(this.getCodeBase().getHost()), arg0) : signlink.opensocket(arg0);
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/String;)V")
	private void method693(@OriginalArg(0) String arg0) {
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

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IILjava/lang/String;Ljava/lang/String;)V")
	private void method694(@OriginalArg(1) int arg0, @OriginalArg(2) String arg1, @OriginalArg(3) String arg2) {
		try {
			if (arg0 == 0 && this.anInt1022 != -1) {
				this.aString31 = arg1;
				super.anInt845 = 0;
			}
			if (this.anInt973 == -1) {
				this.aBoolean191 = true;
			}
			for (@Pc(20) int local20 = 99; local20 > 0; local20--) {
				this.anIntArray264[local20] = this.anIntArray264[local20 - 1];
				this.aStringArray12[local20] = this.aStringArray12[local20 - 1];
				this.aStringArray13[local20] = this.aStringArray13[local20 - 1];
			}
			this.anIntArray264[0] = arg0;
			this.aStringArray12[0] = arg2;
			this.aStringArray13[0] = arg1;
		} catch (@Pc(75) RuntimeException local75) {
			signlink.reporterror("65704, " + -232 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local75.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "G", descriptor = "(I)V")
	private void method695() {
		try {
			@Pc(16) int local16;
			for (@Pc(8) int local8 = -1; local8 < this.anInt968; local8++) {
				if (local8 == -1) {
					local16 = this.anInt967;
				} else {
					local16 = this.anIntArray236[local8];
				}
				@Pc(28) Class8_Sub1_Sub1_Sub1_Sub2 local28 = this.aClass8_Sub1_Sub1_Sub1_Sub2Array1[local16];
				if (local28 != null && local28.anInt724 > 0) {
					local28.anInt724--;
					if (local28.anInt724 == 0) {
						local28.aString14 = null;
					}
				}
			}
			for (local16 = 0; local16 < this.anInt950; local16++) {
				@Pc(59) int local59 = this.anIntArray223[local16];
				@Pc(64) Class8_Sub1_Sub1_Sub1_Sub1 local64 = this.aClass8_Sub1_Sub1_Sub1_Sub1Array1[local59];
				if (local64 != null && local64.anInt724 > 0) {
					local64.anInt724--;
					if (local64.anInt724 == 0) {
						local64.aString14 = null;
					}
				}
			}
		} catch (@Pc(88) RuntimeException local88) {
			signlink.reporterror("3610, " + 6 + ", " + local88.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!JQXBQBEJ;I)V")
	private void method696(@OriginalArg(0) Class8_Sub3 arg0) {
		try {
			@Pc(1) int local1 = 0;
			@Pc(3) int local3 = -1;
			@Pc(5) int local5 = 0;
			@Pc(7) int local7 = 0;
			if (arg0.anInt314 == 0) {
				local1 = this.aClass32_1.method342(arg0.anInt313, arg0.anInt315, arg0.anInt316);
			}
			if (arg0.anInt314 == 1) {
				local1 = this.aClass32_1.method343(arg0.anInt316, arg0.anInt315, arg0.anInt313);
			}
			if (arg0.anInt314 == 2) {
				local1 = this.aClass32_1.method344(arg0.anInt313, arg0.anInt315, arg0.anInt316);
			}
			if (arg0.anInt314 == 3) {
				local1 = this.aClass32_1.method345(arg0.anInt313, arg0.anInt315, arg0.anInt316);
			}
			if (local1 != 0) {
				@Pc(76) int local76 = this.aClass32_1.method346(arg0.anInt313, arg0.anInt315, arg0.anInt316, local1);
				local3 = local1 >> 14 & 0x7FFF;
				local5 = local76 & 0x1F;
				local7 = local76 >> 6;
			}
			arg0.anInt308 = local3;
			arg0.anInt310 = local5;
			arg0.anInt309 = local7;
			this.anInt1044 += 0;
		} catch (@Pc(107) RuntimeException local107) {
			signlink.reporterror("92759, " + arg0 + ", " + 0 + ", " + local107.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILclient!IUVBENCV;Z)V")
	private void method697(@OriginalArg(0) int arg0, @OriginalArg(1) Class8_Sub1_Sub3 arg1) {
		try {
			@Pc(17) int local17;
			@Pc(22) int local22;
			@Pc(31) int local31;
			@Pc(38) int local38;
			@Pc(64) Class8_Sub1_Sub1_Sub3 local64;
			if (arg0 == 112) {
				local17 = arg1.method179();
				local22 = arg1.method171(this.anInt906);
				local31 = this.anInt1009 + (local22 >> 4 & 0x7);
				local38 = this.anInt1010 + (local22 & 0x7);
				if (local31 >= 0 && local38 >= 0 && local31 < 104 && local38 < 104) {
					@Pc(58) Class49 local58 = this.aClass49ArrayArrayArray1[this.anInt933][local31][local38];
					if (local58 != null) {
						for (local64 = (Class8_Sub1_Sub1_Sub3) local58.method538(); local64 != null; local64 = (Class8_Sub1_Sub1_Sub3) local58.method540((byte) 6)) {
							if (local64.anInt201 == (local17 & 0x7FFF)) {
								local64.method543();
								break;
							}
						}
						if (local58.method538() == null) {
							this.aClass49ArrayArrayArray1[this.anInt933][local31][local38] = null;
						}
						this.method633(local31, local38);
					}
				}
			} else {
				@Pc(129) int local129;
				@Pc(132) int local132;
				if (arg0 == 114) {
					local17 = arg1.method152();
					local22 = this.anInt1009 + (local17 >> 4 & 0x7);
					local31 = this.anInt1010 + (local17 & 0x7);
					local38 = arg1.method154();
					local129 = arg1.method154();
					local132 = arg1.method154();
					if (local22 >= 0 && local31 >= 0 && local22 < 104 && local31 < 104) {
						@Pc(152) Class49 local152 = this.aClass49ArrayArrayArray1[this.anInt933][local22][local31];
						if (local152 != null) {
							for (@Pc(158) Class8_Sub1_Sub1_Sub3 local158 = (Class8_Sub1_Sub1_Sub3) local152.method538(); local158 != null; local158 = (Class8_Sub1_Sub1_Sub3) local152.method540((byte) 6)) {
								if (local158.anInt201 == (local38 & 0x7FFF) && local158.anInt202 == local129) {
									local158.anInt202 = local132;
									break;
								}
							}
							this.method633(local22, local31);
						}
					}
				} else if (arg0 == 1) {
					local17 = arg1.method180(this.anInt923);
					local22 = arg1.method170(this.aBoolean224);
					local31 = this.anInt1009 + (local22 >> 4 & 0x7);
					local38 = this.anInt1010 + (local22 & 0x7);
					local129 = arg1.method178();
					local132 = arg1.method178();
					if (local31 >= 0 && local38 >= 0 && local31 < 104 && local38 < 104 && local17 != this.anInt987) {
						@Pc(242) Class8_Sub1_Sub1_Sub3 local242 = new Class8_Sub1_Sub1_Sub3();
						local242.anInt201 = local129;
						local242.anInt202 = local132;
						if (this.aClass49ArrayArrayArray1[this.anInt933][local31][local38] == null) {
							this.aClass49ArrayArrayArray1[this.anInt933][local31][local38] = new Class49(223);
						}
						this.aClass49ArrayArrayArray1[this.anInt933][local31][local38].method535(local242);
						this.method633(local31, local38);
					}
				} else {
					@Pc(324) int local324;
					@Pc(331) int local331;
					if (arg0 == 75) {
						local17 = arg1.method154();
						local22 = arg1.method171(this.anInt906);
						local31 = local22 >> 2;
						local38 = local22 & 0x3;
						local129 = this.anIntArray232[local31];
						local132 = arg1.method169();
						local324 = this.anInt1009 + (local132 >> 4 & 0x7);
						local331 = this.anInt1010 + (local132 & 0x7);
						if (local324 >= 0 && local331 >= 0 && local324 < 104 && local331 < 104) {
							this.method710(local324, local31, local331, local129, local38, 0, this.anInt933, -1, local17);
						}
					} else if (arg0 == 39) {
						local17 = arg1.method152();
						local22 = this.anInt1009 + (local17 >> 4 & 0x7);
						local31 = this.anInt1010 + (local17 & 0x7);
						local38 = arg1.method154();
						local129 = arg1.method152();
						local132 = arg1.method154();
						if (local22 >= 0 && local31 >= 0 && local22 < 104 && local31 < 104) {
							local22 = local22 * 128 + 64;
							local31 = local31 * 128 + 64;
							@Pc(429) Class8_Sub1_Sub1_Sub2 local429 = new Class8_Sub1_Sub1_Sub2(793, this.method680(local31, this.anInt933, local22) - local129, local38, this.anInt933, local31, anInt983, local22, local132);
							this.aClass49_10.method535(local429);
						}
					} else if (arg0 == 125) {
						local17 = arg1.method179();
						local22 = arg1.method152();
						local31 = this.anInt1009 + (local22 >> 4 & 0x7);
						local38 = this.anInt1010 + (local22 & 0x7);
						local129 = arg1.method178();
						if (local31 >= 0 && local38 >= 0 && local31 < 104 && local38 < 104) {
							local64 = new Class8_Sub1_Sub1_Sub3();
							local64.anInt201 = local17;
							local64.anInt202 = local129;
							if (this.aClass49ArrayArrayArray1[this.anInt933][local31][local38] == null) {
								this.aClass49ArrayArrayArray1[this.anInt933][local31][local38] = new Class49(223);
							}
							this.aClass49ArrayArrayArray1[this.anInt933][local31][local38].method535(local64);
							this.method633(local31, local38);
						}
					} else {
						@Pc(588) int local588;
						@Pc(600) int local600;
						@Pc(614) int local614;
						@Pc(626) int local626;
						@Pc(646) int local646;
						if (arg0 == 115) {
							local17 = arg1.method180(this.anInt923);
							local22 = arg1.method170(this.aBoolean224);
							local31 = this.anInt1009 + (local22 >> 4 & 0x7);
							local38 = this.anInt1010 + (local22 & 0x7);
							local129 = arg1.method152();
							local132 = local129 >> 2;
							local324 = local129 & 0x3;
							local331 = this.anIntArray232[local132];
							if (local31 >= 0 && local38 >= 0 && local31 < 103 && local38 < 103) {
								local588 = this.anIntArrayArrayArray7[this.anInt933][local31][local38];
								local600 = this.anIntArrayArrayArray7[this.anInt933][local31 + 1][local38];
								local614 = this.anIntArrayArrayArray7[this.anInt933][local31 + 1][local38 + 1];
								local626 = this.anIntArrayArrayArray7[this.anInt933][local31][local38 + 1];
								if (local331 == 0) {
									@Pc(637) Class50 local637 = this.aClass32_1.method338(local38, this.anInt933, local31);
									if (local637 != null) {
										local646 = local637.anInt829 >> 14 & 0x7FFF;
										if (local132 == 2) {
											local637.aClass8_Sub1_Sub1_7 = new Class8_Sub1_Sub1_Sub6(local626, local614, (byte) 7, local17, 2, false, local600, local588, local646, local324 + 4);
											local637.aClass8_Sub1_Sub1_8 = new Class8_Sub1_Sub1_Sub6(local626, local614, (byte) 7, local17, 2, false, local600, local588, local646, local324 + 1 & 0x3);
										} else {
											local637.aClass8_Sub1_Sub1_7 = new Class8_Sub1_Sub1_Sub6(local626, local614, (byte) 7, local17, local132, false, local600, local588, local646, local324);
										}
									}
								}
								if (local331 == 1) {
									@Pc(714) Class14 local714 = this.aClass32_1.method339(local38, local31, this.anInt933);
									if (local714 != null) {
										local714.aClass8_Sub1_Sub1_4 = new Class8_Sub1_Sub1_Sub6(local626, local614, (byte) 7, local17, 4, false, local600, local588, local714.anInt120 >> 14 & 0x7FFF, 0);
									}
								}
								if (local331 == 2) {
									@Pc(748) Class15 local748 = this.aClass32_1.method340(local31, local38, this.anInt933);
									if (local132 == 11) {
										local132 = 10;
									}
									if (local748 != null) {
										local748.aClass8_Sub1_Sub1_5 = new Class8_Sub1_Sub1_Sub6(local626, local614, (byte) 7, local17, local132, false, local600, local588, local748.anInt132 >> 14 & 0x7FFF, local324);
									}
								}
								if (local331 == 3) {
									@Pc(787) Class45 local787 = this.aClass32_1.method341(local31, local38, this.anInt933);
									if (local787 != null) {
										local787.aClass8_Sub1_Sub1_6 = new Class8_Sub1_Sub1_Sub6(local626, local614, (byte) 7, local17, 22, false, local600, local588, local787.anInt756 >> 14 & 0x7FFF, local324);
									}
								}
							}
						} else {
							@Pc(870) int local870;
							if (arg0 == 68) {
								local17 = arg1.method152();
								local22 = this.anInt1009 + (local17 >> 4 & 0x7);
								local31 = this.anInt1010 + (local17 & 0x7);
								local38 = local22 + arg1.method153();
								local129 = local31 + arg1.method153();
								local132 = arg1.method155();
								local324 = arg1.method154();
								local331 = arg1.method152() * 4;
								local588 = arg1.method152() * 4;
								local600 = arg1.method154();
								local614 = arg1.method154();
								local626 = arg1.method152();
								local870 = arg1.method152();
								if (local22 >= 0 && local31 >= 0 && local22 < 104 && local31 < 104 && local38 >= 0 && local129 >= 0 && local38 < 104 && local129 < 104 && local324 != 65535) {
									local22 = local22 * 128 + 64;
									local31 = local31 * 128 + 64;
									local38 = local38 * 128 + 64;
									local129 = local129 * 128 + 64;
									@Pc(946) Class8_Sub1_Sub1_Sub4 local946 = new Class8_Sub1_Sub1_Sub4(local600 + anInt983, this.method680(local31, this.anInt933, local22) - local331, local614 + anInt983, local626, (byte) 2, local132, local870, local588, this.anInt933, local31, local324, local22);
									local946.method133(local38, this.method680(local129, this.anInt933, local38) - local588, local600 + anInt983, local129);
									this.aClass49_11.method535(local946);
								}
							} else {
								if (arg0 == 55) {
									local17 = arg1.method152();
									local22 = this.anInt1009 + (local17 >> 4 & 0x7);
									local31 = this.anInt1010 + (local17 & 0x7);
									local38 = arg1.method154();
									local129 = arg1.method152();
									local132 = local129 >> 4 & 0xF;
									local324 = local129 & 0x7;
									if (aClass8_Sub1_Sub1_Sub1_Sub2_1.anIntArray183[0] >= local22 - local132 && aClass8_Sub1_Sub1_Sub1_Sub2_1.anIntArray183[0] <= local22 + local132 && aClass8_Sub1_Sub1_Sub1_Sub2_1.anIntArray184[0] >= local31 - local132 && aClass8_Sub1_Sub1_Sub1_Sub2_1.anIntArray184[0] <= local31 + local132 && this.aBoolean212 && !aBoolean237 && this.anInt1031 < 50) {
										this.anIntArray235[this.anInt1031] = local38;
										this.anIntArray214[this.anInt1031] = local324;
										this.anIntArray243[this.anInt1031] = Class35.anIntArray162[local38];
										this.anInt1031++;
									}
								}
								if (arg0 == 132) {
									local17 = arg1.method152();
									local22 = local17 >> 2;
									local31 = local17 & 0x3;
									local38 = this.anIntArray232[local22];
									local129 = arg1.method170(this.aBoolean224);
									local132 = this.anInt1009 + (local129 >> 4 & 0x7);
									local324 = this.anInt1010 + (local129 & 0x7);
									if (local132 >= 0 && local324 >= 0 && local132 < 104 && local324 < 104) {
										this.method710(local132, local22, local324, local38, local31, 0, this.anInt933, -1, -1);
									}
								} else if (arg0 == 137) {
									local17 = arg1.method154();
									local22 = arg1.method171(this.anInt906);
									local31 = this.anInt1009 + (local22 >> 4 & 0x7);
									local38 = this.anInt1010 + (local22 & 0x7);
									@Pc(1168) byte local1168 = arg1.method172();
									@Pc(1173) byte local1173 = arg1.method174(this.aByte26);
									local324 = arg1.method180(this.anInt923);
									@Pc(1183) byte local1183 = arg1.method174(this.aByte26);
									local588 = arg1.method178();
									local600 = arg1.method170(this.aBoolean224);
									local614 = local600 >> 2;
									local626 = local600 & 0x3;
									local870 = this.anIntArray232[local614];
									local646 = arg1.method178();
									@Pc(1213) byte local1213 = arg1.method173((byte) 1);
									@Pc(1219) Class8_Sub1_Sub1_Sub1_Sub2 local1219;
									if (local17 == this.anInt987) {
										local1219 = aClass8_Sub1_Sub1_Sub1_Sub2_1;
									} else {
										local1219 = this.aClass8_Sub1_Sub1_Sub1_Sub2Array1[local17];
									}
									if (local1219 != null) {
										@Pc(1231) Class23 local1231 = Class23.method260(local588);
										@Pc(1241) int local1241 = this.anIntArrayArrayArray7[this.anInt933][local31][local38];
										@Pc(1253) int local1253 = this.anIntArrayArrayArray7[this.anInt933][local31 + 1][local38];
										@Pc(1267) int local1267 = this.anIntArrayArrayArray7[this.anInt933][local31 + 1][local38 + 1];
										@Pc(1279) int local1279 = this.anIntArrayArrayArray7[this.anInt933][local31][local38 + 1];
										@Pc(1289) Class8_Sub1_Sub1_Sub5 local1289 = local1231.method257(local614, local626, local1241, local1253, local1267, local1279, -1);
										if (local1289 != null) {
											this.method710(local31, 0, local38, local870, 0, local646 + 1, this.anInt933, local324 + 1, -1);
											local1219.anInt748 = local646 + anInt983;
											local1219.anInt749 = local324 + anInt983;
											local1219.aClass8_Sub1_Sub1_Sub5_2 = local1289;
											@Pc(1324) int local1324 = local1231.anInt374;
											@Pc(1327) int local1327 = local1231.anInt389;
											if (local626 == 1 || local626 == 3) {
												local1324 = local1231.anInt389;
												local1327 = local1231.anInt374;
											}
											local1219.anInt740 = local31 * 128 + local1324 * 64;
											local1219.anInt742 = local38 * 128 + local1327 * 64;
											local1219.anInt741 = this.method680(local1219.anInt742, this.anInt933, local1219.anInt740);
											@Pc(1373) byte local1373;
											if (local1213 > local1183) {
												local1373 = local1213;
												local1213 = local1183;
												local1183 = local1373;
											}
											if (local1173 > local1168) {
												local1373 = local1173;
												local1173 = local1168;
												local1168 = local1373;
											}
											local1219.anInt735 = local31 + local1213;
											local1219.anInt737 = local31 + local1183;
											local1219.anInt736 = local38 + local1173;
											local1219.anInt738 = local38 + local1168;
											return;
										}
									}
								}
							}
						}
					}
				}
			}
		} catch (@Pc(1408) RuntimeException local1408) {
			signlink.reporterror("62757, " + arg0 + ", " + arg1 + ", " + false + ", " + local1408.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "init", descriptor = "()V")
	@Override
	public void init() {
		anInt1074 = Integer.parseInt(this.getParameter("nodeid"));
		anInt1075 = Integer.parseInt(this.getParameter("portoff"));
		@Pc(15) String local15 = this.getParameter("lowmem");
		if (local15 != null && local15.equals("1")) {
			method673();
		} else {
			method678();
		}
		@Pc(31) String local31 = this.getParameter("free");
		if (local31 != null && local31.equals("1")) {
			aBoolean236 = false;
		} else {
			aBoolean236 = true;
		}
		this.method575();
	}

	@OriginalMember(owner = "client!client", name = "H", descriptor = "(I)V")
	private void method698() {
		try {
			@Pc(12) int local12;
			for (@Pc(5) int local5 = 10; local5 < 117; local5++) {
				local12 = (int) (Math.random() * 100.0D);
				if (local12 < 50) {
					this.anIntArray224[local5 + 32512] = 255;
				}
			}
			@Pc(41) int local41;
			@Pc(48) int local48;
			@Pc(54) int local54;
			for (local12 = 0; local12 < 100; local12++) {
				local41 = (int) (Math.random() * 124.0D) + 2;
				local48 = (int) (Math.random() * 128.0D) + 128;
				local54 = local41 + (local48 << 7);
				this.anIntArray224[local54] = 192;
			}
			for (local41 = 1; local41 < 255; local41++) {
				for (local48 = 1; local48 < 127; local48++) {
					local54 = local48 + (local41 << 7);
					this.anIntArray225[local54] = (this.anIntArray224[local54 - 1] + this.anIntArray224[local54 + 1] + this.anIntArray224[local54 - 128] + this.anIntArray224[local54 + 128]) / 4;
				}
			}
			this.anInt920 += 128;
			if (this.anInt920 > this.anIntArray251.length) {
				this.anInt920 -= this.anIntArray251.length;
				local48 = (int) (Math.random() * 12.0D);
				this.method594(this.aClass8_Sub1_Sub2_Sub2Array4[local48]);
			}
			@Pc(174) int local174;
			for (local48 = 1; local48 < 255; local48++) {
				for (local54 = 1; local54 < 127; local54++) {
					local174 = local54 + (local48 << 7);
					@Pc(197) int local197 = this.anIntArray225[local174 + 128] - this.anIntArray251[local174 + this.anInt920 & this.anIntArray251.length - 1] / 5;
					if (local197 < 0) {
						local197 = 0;
					}
					this.anIntArray224[local174] = local197;
				}
			}
			for (local54 = 0; local54 < 255; local54++) {
				this.anIntArray268[local54] = this.anIntArray268[local54 + 1];
			}
			this.anIntArray268[255] = (int) (Math.sin((double) anInt983 / 14.0D) * 16.0D + Math.sin((double) anInt983 / 15.0D) * 14.0D + Math.sin((double) anInt983 / 16.0D) * 12.0D);
			if (this.anInt889 > 0) {
				this.anInt889 -= 4;
			}
			if (this.anInt890 > 0) {
				this.anInt890 -= 4;
			}
			if (this.anInt889 == 0 && this.anInt890 == 0) {
				local174 = (int) (Math.random() * 2000.0D);
				if (local174 == 0) {
					this.anInt889 = 1024;
				}
				if (local174 == 1) {
					this.anInt890 = 1024;
					return;
				}
			}
		} catch (@Pc(308) RuntimeException local308) {
			signlink.reporterror("46391, " + 1 + ", " + local308.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "run", descriptor = "()V")
	@Override
	public void run() {
		if (this.aBoolean220) {
			this.method638();
		} else {
			super.run();
		}
	}

	@OriginalMember(owner = "client!client", name = "m", descriptor = "(B)V")
	private void method699(@OriginalArg(0) byte arg0) {
		try {
			this.anInt992 = 0;
			@Pc(71) int local71;
			for (@Pc(6) int local6 = -1; local6 < this.anInt968 + this.anInt950; local6++) {
				@Pc(13) Class8_Sub1_Sub1_Sub1 local13;
				if (local6 == -1) {
					local13 = aClass8_Sub1_Sub1_Sub1_Sub2_1;
				} else if (local6 < this.anInt968) {
					local13 = this.aClass8_Sub1_Sub1_Sub1_Sub2Array1[this.anIntArray236[local6]];
				} else {
					local13 = this.aClass8_Sub1_Sub1_Sub1_Sub1Array1[this.anIntArray223[local6 - this.anInt968]];
				}
				if (local13 != null && local13.method474(this.anInt995)) {
					@Pc(55) Class26 local55;
					if (local13 instanceof Class8_Sub1_Sub1_Sub1_Sub1) {
						local55 = ((Class8_Sub1_Sub1_Sub1_Sub1) local13).aClass26_1;
						if (local55.anIntArray133 != null) {
							local55 = local55.method289();
						}
						if (local55 == null) {
							continue;
						}
					}
					if (local6 >= this.anInt968) {
						local55 = ((Class8_Sub1_Sub1_Sub1_Sub1) local13).aClass26_1;
						if (local55.anInt474 >= 0 && local55.anInt474 < this.aClass8_Sub1_Sub2_Sub1Array7.length) {
							this.method654(local13.anInt710 + 15, local13);
							if (this.anInt958 > -1) {
								this.aClass8_Sub1_Sub2_Sub1Array7[local55.anInt474].method117(this.anInt959 - 30, this.anInt958 - 12);
							}
						}
						if (this.anInt1078 == 1 && this.anInt852 == this.anIntArray223[local6 - this.anInt968] && anInt983 % 20 < 10) {
							this.method654(local13.anInt710 + 15, local13);
							if (this.anInt958 > -1) {
								this.aClass8_Sub1_Sub2_Sub1Array8[0].method117(this.anInt959 - 28, this.anInt958 - 12);
							}
						}
					} else {
						local71 = 30;
						@Pc(74) Class8_Sub1_Sub1_Sub1_Sub2 local74 = (Class8_Sub1_Sub1_Sub1_Sub2) local13;
						if (local74.anInt746 != -1 || local74.anInt747 != -1) {
							this.method654(local13.anInt710 + 15, local13);
							if (this.anInt958 > -1) {
								if (local74.anInt746 != -1) {
									this.aClass8_Sub1_Sub2_Sub1Array9[local74.anInt746].method117(this.anInt959 - 30, this.anInt958 - 12);
									local71 += 25;
								}
								if (local74.anInt747 != -1) {
									this.aClass8_Sub1_Sub2_Sub1Array7[local74.anInt747].method117(this.anInt959 - local71, this.anInt958 - 12);
									local71 += 25;
								}
							}
						}
						if (local6 >= 0 && this.anInt1078 == 10 && this.anInt884 == this.anIntArray236[local6]) {
							this.method654(local13.anInt710 + 15, local13);
							if (this.anInt958 > -1) {
								this.aClass8_Sub1_Sub2_Sub1Array8[1].method117(this.anInt959 - local71, this.anInt958 - 12);
							}
						}
					}
					if (local13.aString14 != null && (local6 >= this.anInt968 || this.anInt988 == 0 || this.anInt988 == 3 || this.anInt988 == 1 && this.method713(((Class8_Sub1_Sub1_Sub1_Sub2) local13).aString15))) {
						this.method654(local13.anInt710, local13);
						if (this.anInt958 > -1 && this.anInt992 < this.anInt993) {
							this.anIntArray256[this.anInt992] = this.aClass8_Sub1_Sub2_Sub3_4.method450(local13.aString14, 264) / 2;
							this.anIntArray255[this.anInt992] = this.aClass8_Sub1_Sub2_Sub3_4.anInt679;
							this.anIntArray253[this.anInt992] = this.anInt958;
							this.anIntArray254[this.anInt992] = this.anInt959;
							this.anIntArray257[this.anInt992] = local13.anInt730;
							this.anIntArray258[this.anInt992] = local13.anInt725;
							this.anIntArray259[this.anInt992] = local13.anInt724;
							this.aStringArray11[this.anInt992++] = local13.aString14;
							if (this.anInt1084 == 0 && local13.anInt725 >= 1 && local13.anInt725 <= 3) {
								this.anIntArray255[this.anInt992] += 10;
								this.anIntArray254[this.anInt992] += 5;
							}
							if (this.anInt1084 == 0 && local13.anInt725 == 4) {
								this.anIntArray256[this.anInt992] = 60;
							}
							if (this.anInt1084 == 0 && local13.anInt725 == 5) {
								this.anIntArray255[this.anInt992] += 5;
							}
						}
					}
					if (local13.anInt719 > anInt983) {
						this.method654(local13.anInt710 + 15, local13);
						if (this.anInt958 > -1) {
							local71 = local13.anInt720 * 30 / local13.anInt721;
							if (local71 > 30) {
								local71 = 30;
							}
							Class8_Sub1_Sub2.method550(local71, this.anInt959 - 3, 65280, 5, this.anInt958 - 15);
							Class8_Sub1_Sub2.method550(30 - local71, this.anInt959 - 3, 16711680, 5, this.anInt958 + local71 - 15);
						}
					}
					for (local71 = 0; local71 < 4; local71++) {
						if (local13.anIntArray187[local71] > anInt983) {
							this.method654(local13.anInt710 / 2, local13);
							if (this.anInt958 > -1) {
								if (local71 == 1) {
									this.anInt959 -= 20;
								}
								if (local71 == 2) {
									this.anInt958 -= 15;
									this.anInt959 -= 10;
								}
								if (local71 == 3) {
									this.anInt958 += 15;
									this.anInt959 -= 10;
								}
								this.aClass8_Sub1_Sub2_Sub1Array4[local13.anIntArray186[local71]].method117(this.anInt959 - 12, this.anInt958 - 12);
								this.aClass8_Sub1_Sub2_Sub3_2.method447(0, this.anInt958, String.valueOf(local13.anIntArray185[local71]), this.anInt959 + 4);
								this.aClass8_Sub1_Sub2_Sub3_2.method447(16777215, this.anInt958 - 1, String.valueOf(local13.anIntArray185[local71]), this.anInt959 + 3);
							}
						}
					}
				}
			}
			for (@Pc(611) int local611 = 0; local611 < this.anInt992; local611++) {
				local71 = this.anIntArray253[local611];
				@Pc(623) int local623 = this.anIntArray254[local611];
				@Pc(628) int local628 = this.anIntArray256[local611];
				@Pc(633) int local633 = this.anIntArray255[local611];
				@Pc(635) boolean local635 = true;
				while (local635) {
					local635 = false;
					for (@Pc(641) int local641 = 0; local641 < local611; local641++) {
						if (local623 + 2 > this.anIntArray254[local641] - this.anIntArray255[local641] && local623 - local633 < this.anIntArray254[local641] + 2 && local71 - local628 < this.anIntArray253[local641] + this.anIntArray256[local641] && local71 + local628 > this.anIntArray253[local641] - this.anIntArray256[local641] && this.anIntArray254[local641] - this.anIntArray255[local641] < local623) {
							local623 = this.anIntArray254[local641] - this.anIntArray255[local641];
							local635 = true;
						}
					}
				}
				this.anInt958 = this.anIntArray253[local611];
				this.anInt959 = this.anIntArray254[local611] = local623;
				@Pc(740) String local740 = this.aStringArray11[local611];
				if (this.anInt1084 == 0) {
					@Pc(745) int local745 = 16776960;
					if (this.anIntArray257[local611] < 6) {
						local745 = this.anIntArray220[this.anIntArray257[local611]];
					}
					if (this.anIntArray257[local611] == 6) {
						local745 = this.anInt921 % 20 < 10 ? 16711680 : 16776960;
					}
					if (this.anIntArray257[local611] == 7) {
						local745 = this.anInt921 % 20 < 10 ? 255 : 65535;
					}
					if (this.anIntArray257[local611] == 8) {
						local745 = this.anInt921 % 20 < 10 ? 45056 : 8454016;
					}
					@Pc(820) int local820;
					if (this.anIntArray257[local611] == 9) {
						local820 = 150 - this.anIntArray259[local611];
						if (local820 < 50) {
							local745 = local820 * 1280 + 16711680;
						} else if (local820 < 100) {
							local745 = 16776960 - (local820 - 50) * 327680;
						} else if (local820 < 150) {
							local745 = (local820 - 100) * 5 + 65280;
						}
					}
					if (this.anIntArray257[local611] == 10) {
						local820 = 150 - this.anIntArray259[local611];
						if (local820 < 50) {
							local745 = local820 * 5 + 16711680;
						} else if (local820 < 100) {
							local745 = 16711935 - (local820 - 50) * 327680;
						} else if (local820 < 150) {
							local745 = (local820 - 100) * 327680 + 255 - (local820 - 100) * 5;
						}
					}
					if (this.anIntArray257[local611] == 11) {
						local820 = 150 - this.anIntArray259[local611];
						if (local820 < 50) {
							local745 = 16777215 - local820 * 327685;
						} else if (local820 < 100) {
							local745 = (local820 - 50) * 327685 + 65280;
						} else if (local820 < 150) {
							local745 = 16777215 - (local820 - 100) * 327680;
						}
					}
					if (this.anIntArray258[local611] == 0) {
						this.aClass8_Sub1_Sub2_Sub3_4.method447(0, this.anInt958, local740, this.anInt959 + 1);
						this.aClass8_Sub1_Sub2_Sub3_4.method447(local745, this.anInt958, local740, this.anInt959);
					}
					if (this.anIntArray258[local611] == 1) {
						this.aClass8_Sub1_Sub2_Sub3_4.method452(this.anInt958, local740, this.anInt921, 0, this.anInt959 + 1);
						this.aClass8_Sub1_Sub2_Sub3_4.method452(this.anInt958, local740, this.anInt921, local745, this.anInt959);
					}
					if (this.anIntArray258[local611] == 2) {
						this.aClass8_Sub1_Sub2_Sub3_4.method453(this.anInt958, 0, this.anInt921, this.anInt959 + 1, local740);
						this.aClass8_Sub1_Sub2_Sub3_4.method453(this.anInt958, local745, this.anInt921, this.anInt959, local740);
					}
					if (this.anIntArray258[local611] == 3) {
						this.aClass8_Sub1_Sub2_Sub3_4.method454(0, this.anInt959 + 1, this.anInt958, 150 - this.anIntArray259[local611], 58, local740, this.anInt921);
						this.aClass8_Sub1_Sub2_Sub3_4.method454(local745, this.anInt959, this.anInt958, 150 - this.anIntArray259[local611], 58, local740, this.anInt921);
					}
					@Pc(1117) int local1117;
					if (this.anIntArray258[local611] == 4) {
						local820 = this.aClass8_Sub1_Sub2_Sub3_4.method450(local740, 264);
						local1117 = (150 - this.anIntArray259[local611]) * (local820 + 100) / 150;
						Class8_Sub1_Sub2.method547(334, this.anInt958 - 50, 0, this.anInt958 + 50);
						this.aClass8_Sub1_Sub2_Sub3_4.method451(0, local740, this.anInt958 + 50 - local1117, this.anInt959 + 1);
						this.aClass8_Sub1_Sub2_Sub3_4.method451(local745, local740, this.anInt958 + 50 - local1117, this.anInt959);
						Class8_Sub1_Sub2.method546();
					}
					if (this.anIntArray258[local611] == 5) {
						local820 = 150 - this.anIntArray259[local611];
						local1117 = 0;
						if (local820 < 25) {
							local1117 = local820 - 25;
						} else if (local820 > 125) {
							local1117 = local820 - 125;
						}
						Class8_Sub1_Sub2.method547(this.anInt959 + 5, 0, this.anInt959 - this.aClass8_Sub1_Sub2_Sub3_4.anInt679 - 1, 512);
						this.aClass8_Sub1_Sub2_Sub3_4.method447(0, this.anInt958, local740, this.anInt959 + local1117 + 1);
						this.aClass8_Sub1_Sub2_Sub3_4.method447(local745, this.anInt958, local740, this.anInt959 + local1117);
						Class8_Sub1_Sub2.method546();
					}
				} else {
					this.aClass8_Sub1_Sub2_Sub3_4.method447(0, this.anInt958, local740, this.anInt959 + 1);
					this.aClass8_Sub1_Sub2_Sub3_4.method447(16776960, this.anInt958, local740, this.anInt959);
				}
			}
			@Pc(1270) boolean local1270 = false;
		} catch (@Pc(1278) RuntimeException local1278) {
			signlink.reporterror("30427, " + arg0 + ", " + local1278.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Ljava/lang/String;)Ljava/io/DataInputStream;")
	private DataInputStream method700(@OriginalArg(0) String arg0) throws IOException {
		if (this.aBoolean225) {
			if (this.aSocket3 != null) {
				try {
					this.aSocket3.close();
				} catch (@Pc(26) Exception local26) {
				}
				this.aSocket3 = null;
			}
			this.aSocket3 = this.method692(43595);
			this.aSocket3.setSoTimeout(10000);
			@Pc(42) InputStream local42 = this.aSocket3.getInputStream();
			@Pc(46) OutputStream local46 = this.aSocket3.getOutputStream();
			local46.write(("JAGGRAB /" + arg0 + "\n\n").getBytes());
			return new DataInputStream(local42);
		} else if (signlink.mainapp == null) {
			return new DataInputStream((new URL(this.getCodeBase(), arg0)).openStream());
		} else {
			return signlink.openurl(arg0);
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIBLclient!NIJEYEOX;)V")
	private void method701(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) Class26 arg3) {
		try {
			if (this.anInt1025 < 400) {
				if (arg3.anIntArray133 != null) {
					arg3 = arg3.method289();
				}
				if (arg3 != null && arg3.aBoolean110) {
					@Pc(23) String local23 = arg3.aString12;
					if (arg3.anInt481 != 0) {
						local23 = local23 + method712(aClass8_Sub1_Sub1_Sub1_Sub2_1.anInt743, arg3.anInt481) + " (level-" + arg3.anInt481 + ")";
					}
					if (this.anInt961 == 1) {
						this.aStringArray14[this.anInt1025] = "Use " + this.aString24 + " with @yel@" + local23;
						this.anIntArray262[this.anInt1025] = 561;
						this.anIntArray263[this.anInt1025] = arg0;
						this.anIntArray260[this.anInt1025] = arg2;
						this.anIntArray261[this.anInt1025] = arg1;
						this.anInt1025++;
					} else if (this.anInt865 != 1) {
						@Pc(165) int local165;
						if (arg3.aStringArray6 != null) {
							for (local165 = 4; local165 >= 0; local165--) {
								if (arg3.aStringArray6[local165] != null && !arg3.aStringArray6[local165].equalsIgnoreCase("attack")) {
									this.aStringArray14[this.anInt1025] = arg3.aStringArray6[local165] + " @yel@" + local23;
									if (local165 == 0) {
										this.anIntArray262[this.anInt1025] = 339;
									}
									if (local165 == 1) {
										this.anIntArray262[this.anInt1025] = 845;
									}
									if (local165 == 2) {
										this.anIntArray262[this.anInt1025] = 851;
									}
									if (local165 == 3) {
										this.anIntArray262[this.anInt1025] = 36;
									}
									if (local165 == 4) {
										this.anIntArray262[this.anInt1025] = 859;
									}
									this.anIntArray263[this.anInt1025] = arg0;
									this.anIntArray260[this.anInt1025] = arg2;
									this.anIntArray261[this.anInt1025] = arg1;
									this.anInt1025++;
								}
							}
						}
						if (arg3.aStringArray6 != null) {
							for (local165 = 4; local165 >= 0; local165--) {
								if (arg3.aStringArray6[local165] != null && arg3.aStringArray6[local165].equalsIgnoreCase("attack")) {
									@Pc(289) short local289 = 0;
									if (arg3.anInt481 > aClass8_Sub1_Sub1_Sub1_Sub2_1.anInt743) {
										local289 = 2000;
									}
									this.aStringArray14[this.anInt1025] = arg3.aStringArray6[local165] + " @yel@" + local23;
									if (local165 == 0) {
										this.anIntArray262[this.anInt1025] = local289 + 339;
									}
									if (local165 == 1) {
										this.anIntArray262[this.anInt1025] = local289 + 845;
									}
									if (local165 == 2) {
										this.anIntArray262[this.anInt1025] = local289 + 851;
									}
									if (local165 == 3) {
										this.anIntArray262[this.anInt1025] = local289 + 36;
									}
									if (local165 == 4) {
										this.anIntArray262[this.anInt1025] = local289 + 859;
									}
									this.anIntArray263[this.anInt1025] = arg0;
									this.anIntArray260[this.anInt1025] = arg2;
									this.anIntArray261[this.anInt1025] = arg1;
									this.anInt1025++;
								}
							}
						}
						this.aStringArray14[this.anInt1025] = "Examine @yel@" + local23;
						this.anIntArray262[this.anInt1025] = 1433;
						this.anIntArray263[this.anInt1025] = arg0;
						this.anIntArray260[this.anInt1025] = arg2;
						this.anIntArray261[this.anInt1025] = arg1;
						this.anInt1025++;
					} else if ((this.anInt867 & 0x2) == 2) {
						this.aStringArray14[this.anInt1025] = this.aString18 + " @yel@" + local23;
						this.anIntArray262[this.anInt1025] = 154;
						this.anIntArray263[this.anInt1025] = arg0;
						this.anIntArray260[this.anInt1025] = arg2;
						this.anIntArray261[this.anInt1025] = arg1;
						this.anInt1025++;
						return;
					}
				}
			}
		} catch (@Pc(439) RuntimeException local439) {
			signlink.reporterror("60938, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + -113 + ", " + arg3 + ", " + local439.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!MIIVNBFU;BI)I")
	private int method702(@OriginalArg(0) Class24 arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) int arg2) {
		try {
			@Pc(6) boolean local6 = false;
			if (arg0.anIntArrayArray11 == null || arg2 >= arg0.anIntArrayArray11.length) {
				return -2;
			}
			try {
				@Pc(25) int[] local25 = arg0.anIntArrayArray11[arg2];
				@Pc(27) int local27 = 0;
				@Pc(29) int local29 = 0;
				@Pc(31) byte local31 = 0;
				while (true) {
					@Pc(36) int local36 = local25[local29++];
					@Pc(38) int local38 = 0;
					@Pc(40) byte local40 = 0;
					if (local36 == 0) {
						return local27;
					}
					if (local36 == 1) {
						local38 = this.anIntArray272[local25[local29++]];
					}
					if (local36 == 2) {
						local38 = this.anIntArray217[local25[local29++]];
					}
					if (local36 == 3) {
						local38 = this.anIntArray273[local25[local29++]];
					}
					@Pc(86) Class24 local86;
					@Pc(91) int local91;
					@Pc(104) int local104;
					if (local36 == 4) {
						local86 = Class24.method269(local25[local29++]);
						local91 = local25[local29++];
						if (local91 >= 0 && local91 < Class19.anInt247 && (!Class19.method191(local91).aBoolean59 || aBoolean236)) {
							for (local104 = 0; local104 < local86.anIntArray119.length; local104++) {
								if (local86.anIntArray119[local104] == local91 + 1) {
									local38 += local86.anIntArray120[local104];
								}
							}
						}
					}
					if (local36 == 5) {
						local38 = this.anIntArray218[local25[local29++]];
					}
					if (local36 == 6) {
						local38 = anIntArray215[this.anIntArray217[local25[local29++]] - 1];
					}
					if (local36 == 7) {
						local38 = this.anIntArray218[local25[local29++]] * 100 / 46875;
					}
					if (local36 == 8) {
						local38 = aClass8_Sub1_Sub1_Sub1_Sub2_1.anInt743;
					}
					@Pc(179) int local179;
					if (local36 == 9) {
						for (local179 = 0; local179 < Class17.anInt145; local179++) {
							if (Class17.aBooleanArray2[local179]) {
								local38 += this.anIntArray217[local179];
							}
						}
					}
					if (local36 == 10) {
						local86 = Class24.method269(local25[local29++]);
						local91 = local25[local29++] + 1;
						if (local91 >= 0 && local91 < Class19.anInt247 && (!Class19.method191(local91).aBoolean59 || aBoolean236)) {
							for (local104 = 0; local104 < local86.anIntArray119.length; local104++) {
								if (local86.anIntArray119[local104] == local91) {
									local38 = 999999999;
									break;
								}
							}
						}
					}
					if (local36 == 11) {
						local38 = this.anInt975;
					}
					if (local36 == 12) {
						local38 = this.anInt1073;
					}
					if (local36 == 13) {
						local179 = this.anIntArray218[local25[local29++]];
						local91 = local25[local29++];
						local38 = (local179 & 0x1 << local91) == 0 ? 0 : 1;
					}
					if (local36 == 14) {
						local179 = local25[local29++];
						@Pc(293) Class13 local293 = Class13.aClass13Array1[local179];
						local104 = local293.anInt110;
						@Pc(299) int local299 = local293.anInt111;
						@Pc(302) int local302 = local293.anInt112;
						@Pc(308) int local308 = anIntArray248[local302 - local299];
						local38 = this.anIntArray218[local104] >> local299 & local308;
					}
					if (local36 == 15) {
						local40 = 1;
					}
					if (local36 == 16) {
						local40 = 2;
					}
					if (local36 == 17) {
						local40 = 3;
					}
					if (local36 == 18) {
						local38 = (aClass8_Sub1_Sub1_Sub1_Sub2_1.anInt716 >> 7) + this.anInt924;
					}
					if (local36 == 19) {
						local38 = (aClass8_Sub1_Sub1_Sub1_Sub2_1.anInt717 >> 7) + this.anInt925;
					}
					if (local36 == 20) {
						local38 = local25[local29++];
					}
					if (local40 == 0) {
						if (local31 == 0) {
							local27 += local38;
						}
						if (local31 == 1) {
							local27 -= local38;
						}
						if (local31 == 2 && local38 != 0) {
							local27 /= local38;
						}
						if (local31 == 3) {
							local27 *= local38;
						}
						local31 = 0;
					} else {
						local31 = local40;
					}
				}
			} catch (@Pc(401) Exception local401) {
				return -1;
			}
		} catch (@Pc(404) RuntimeException local404) {
			signlink.reporterror("4499, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local404.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "l", descriptor = "(Z)V")
	private void method703() {
		try {
			@Pc(7) byte[] local7 = this.aClass2_2.method14("title.dat", null);
			@Pc(13) Class8_Sub1_Sub2_Sub1 local13 = new Class8_Sub1_Sub2_Sub1(local7, this);
			this.aClass11_13.method70();
			local13.method115(0, 0);
			this.aClass11_14.method70();
			local13.method115(-637, 0);
			this.aClass11_10.method70();
			local13.method115(-128, 0);
			this.aClass11_11.method70();
			local13.method115(-202, -371);
			this.aClass11_12.method70();
			local13.method115(-202, -171);
			this.aClass11_15.method70();
			local13.method115(0, -265);
			this.aClass11_16.method70();
			local13.method115(-562, -265);
			this.aClass11_17.method70();
			local13.method115(-128, -171);
			this.aClass11_18.method70();
			local13.method115(-562, -171);
			@Pc(98) int[] local98 = new int[local13.anInt191];
			for (@Pc(100) int local100 = 0; local100 < local13.anInt192; local100++) {
				for (@Pc(104) int local104 = 0; local104 < local13.anInt191; local104++) {
					local98[local104] = local13.anIntArray41[local13.anInt191 + local13.anInt191 * local100 - local104 - 1];
				}
				for (@Pc(130) int local130 = 0; local130 < local13.anInt191; local130++) {
					local13.anIntArray41[local130 + local13.anInt191 * local100] = local98[local130];
				}
			}
			this.aClass11_13.method70();
			local13.method115(382, 0);
			this.aClass11_14.method70();
			local13.method115(-255, 0);
			this.aClass11_10.method70();
			local13.method115(254, 0);
			this.aClass11_11.method70();
			local13.method115(180, -371);
			this.aClass11_12.method70();
			local13.method115(180, -171);
			this.aClass11_15.method70();
			local13.method115(382, -265);
			this.aClass11_16.method70();
			local13.method115(-180, -265);
			this.aClass11_17.method70();
			local13.method115(254, -171);
			this.aClass11_18.method70();
			local13.method115(-180, -171);
			local13 = new Class8_Sub1_Sub2_Sub1(this.aClass2_2, "logo", 0);
			this.aClass11_10.method70();
			local13.method117(18, 382 - local13.anInt191 / 2 - 128);
			System.gc();
		} catch (@Pc(278) RuntimeException local278) {
			signlink.reporterror("47777, " + true + ", " + local278.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "I", descriptor = "(I)V")
	private void method704() {
		try {
			try {
				@Pc(16) int local16 = aClass8_Sub1_Sub1_Sub1_Sub2_1.anInt716 + this.anInt1055;
				@Pc(22) int local22 = aClass8_Sub1_Sub1_Sub1_Sub2_1.anInt717 + this.anInt931;
				if (this.anInt1063 - local16 < -500 || this.anInt1063 - local16 > 500 || this.anInt1064 - local22 < -500 || this.anInt1064 - local22 > 500) {
					this.anInt1063 = local16;
					this.anInt1064 = local22;
				}
				if (this.anInt1063 != local16) {
					this.anInt1063 += (local16 - this.anInt1063) / 16;
				}
				if (this.anInt1064 != local22) {
					this.anInt1064 += (local22 - this.anInt1064) / 16;
				}
				if (super.anIntArray210[1] == 1) {
					this.anInt863 += (-this.anInt863 - 24) / 2;
				} else if (super.anIntArray210[2] == 1) {
					this.anInt863 += (24 - this.anInt863) / 2;
				} else {
					this.anInt863 /= 2;
				}
				if (super.anIntArray210[3] == 1) {
					this.anInt864 += (12 - this.anInt864) / 2;
				} else if (super.anIntArray210[4] == 1) {
					this.anInt864 += (-this.anInt864 - 12) / 2;
				} else {
					this.anInt864 /= 2;
				}
				this.anInt862 = this.anInt862 + this.anInt863 / 2 & 0x7FF;
				this.anInt861 += this.anInt864 / 2;
				if (this.anInt861 < 128) {
					this.anInt861 = 128;
				}
				if (this.anInt861 > 383) {
					this.anInt861 = 383;
				}
				anInt952++;
				@Pc(226) int local226;
				if (anInt952 > 1601) {
					anInt952 = 0;
					this.aClass8_Sub1_Sub3_6.method141(35);
					this.aClass8_Sub1_Sub3_6.method142(0);
					local226 = this.aClass8_Sub1_Sub3_6.anInt239;
					this.aClass8_Sub1_Sub3_6.method142((int) (Math.random() * 256.0D));
					if ((int) (Math.random() * 2.0D) == 0) {
						this.aClass8_Sub1_Sub3_6.method143(18929);
					}
					if ((int) (Math.random() * 2.0D) == 0) {
						this.aClass8_Sub1_Sub3_6.method142(115);
					}
					this.aClass8_Sub1_Sub3_6.method143(40940);
					this.aClass8_Sub1_Sub3_6.method143(15807);
					if ((int) (Math.random() * 2.0D) == 0) {
						this.aClass8_Sub1_Sub3_6.method142(215);
					}
					this.aClass8_Sub1_Sub3_6.method142(34);
					this.aClass8_Sub1_Sub3_6.method142(66);
					if ((int) (Math.random() * 2.0D) == 0) {
						this.aClass8_Sub1_Sub3_6.method143(27687);
					}
					this.aClass8_Sub1_Sub3_6.method143((int) (Math.random() * 65536.0D));
					this.aClass8_Sub1_Sub3_6.method151(this.aClass8_Sub1_Sub3_6.anInt239 - local226);
				}
				local226 = this.anInt1063 >> 7;
				@Pc(311) int local311 = this.anInt1064 >> 7;
				@Pc(321) int local321 = this.method680(this.anInt1064, this.anInt933, this.anInt1063);
				@Pc(323) int local323 = 0;
				@Pc(339) int local339;
				if (local226 > 3 && local311 > 3 && local226 < 100 && local311 < 100) {
					for (local339 = local226 - 4; local339 <= local226 + 4; local339++) {
						for (@Pc(345) int local345 = local311 - 4; local345 <= local311 + 4; local345++) {
							@Pc(350) int local350 = this.anInt933;
							if (local350 < 3 && (this.aByteArrayArrayArray8[1][local339][local345] & 0x2) == 2) {
								local350++;
							}
							@Pc(377) int local377 = local321 - this.anIntArrayArrayArray7[local350][local339][local345];
							if (local377 > local323) {
								local323 = local377;
							}
						}
					}
				}
				local339 = local323 * 192;
				if (local339 > 98048) {
					local339 = 98048;
				}
				if (local339 < 32768) {
					local339 = 32768;
				}
				if (local339 > this.anInt984) {
					this.anInt984 += (local339 - this.anInt984) / 24;
				} else if (local339 < this.anInt984) {
					this.anInt984 += (local339 - this.anInt984) / 80;
				}
			} catch (@Pc(441) Exception local441) {
				signlink.reporterror("glfc_ex " + aClass8_Sub1_Sub1_Sub1_Sub2_1.anInt716 + "," + aClass8_Sub1_Sub1_Sub1_Sub2_1.anInt717 + "," + this.anInt1063 + "," + this.anInt1064 + "," + this.anInt1033 + "," + this.anInt1034 + "," + this.anInt924 + "," + this.anInt925);
				throw new RuntimeException("eek");
			}
		} catch (@Pc(491) RuntimeException local491) {
			signlink.reporterror("60842, " + 8 + ", " + local491.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IILclient!GPLGZASP;I)V")
	private void method705(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class8_Sub1_Sub2_Sub1 arg2, @OriginalArg(3) int arg3) {
		try {
			if (arg2 != null) {
				@Pc(10) int local10 = this.anInt862 + this.anInt1079 & 0x7FF;
				@Pc(18) int local18 = arg0 * arg0 + arg1 * arg1;
				if (local18 <= 6400) {
					@Pc(26) int local26 = Class8_Sub1_Sub1_Sub5.anIntArray90[local10];
					@Pc(30) int local30 = Class8_Sub1_Sub1_Sub5.anIntArray91[local10];
					@Pc(39) int local39 = local26 * 256 / (this.anInt935 + 256);
					if (arg3 <= 0) {
						this.anInt979 = -240;
					}
					local30 = local30 * 256 / (this.anInt935 + 256);
					@Pc(63) int local63 = arg1 * local39 + arg0 * local30 >> 16;
					@Pc(73) int local73 = arg1 * local30 - arg0 * local39 >> 16;
					if (local18 > 2500) {
						arg2.method123(local63 + 94 + 4 - arg2.anInt195 / 2, 83 - local73 - arg2.anInt196 / 2 - 4, this.aClass8_Sub1_Sub2_Sub2_19);
					} else {
						arg2.method117(83 - local73 - arg2.anInt196 / 2 - 4, local63 + 94 - arg2.anInt195 / 2 + 4);
					}
				}
			}
		} catch (@Pc(127) RuntimeException local127) {
			signlink.reporterror("76458, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local127.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "m", descriptor = "(Z)V")
	private void method706(@OriginalArg(0) boolean arg0) {
		try {
			for (@Pc(3) int local3 = -1; local3 < this.anInt968; local3++) {
				@Pc(11) int local11;
				if (local3 == -1) {
					local11 = this.anInt967;
				} else {
					local11 = this.anIntArray236[local3];
				}
				@Pc(23) Class8_Sub1_Sub1_Sub1_Sub2 local23 = this.aClass8_Sub1_Sub1_Sub1_Sub2Array1[local11];
				if (local23 != null) {
					this.method614(local23, 1);
				}
			}
			this.aBoolean214 &= arg0;
		} catch (@Pc(43) RuntimeException local43) {
			signlink.reporterror("64509, " + arg0 + ", " + local43.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "n", descriptor = "(Z)V")
	private void method707() {
		try {
			if (this.anInt1070 == 0) {
				@Pc(6) int local6 = super.anInt845;
				this.aBoolean214 &= true;
				if (this.anInt865 == 1 && super.anInt846 >= 516 && super.anInt847 >= 160 && super.anInt846 <= 765 && super.anInt847 <= 205) {
					local6 = 0;
				}
				@Pc(43) int local43;
				@Pc(46) int local46;
				@Pc(122) int local122;
				if (this.aBoolean208) {
					if (local6 != 1) {
						local43 = super.anInt840;
						local46 = super.anInt841;
						if (this.anInt892 == 0) {
							local43 -= 4;
							local46 -= 4;
						}
						if (this.anInt892 == 1) {
							local43 -= 553;
							local46 -= 205;
						}
						if (this.anInt892 == 2) {
							local43 -= 17;
							local46 -= 357;
						}
						if (local43 < this.anInt893 - 10 || local43 > this.anInt893 + this.anInt895 + 10 || local46 < this.anInt894 - 10 || local46 > this.anInt894 + this.anInt896 + 10) {
							this.aBoolean208 = false;
							if (this.anInt892 == 1) {
								this.aBoolean217 = true;
							}
							if (this.anInt892 == 2) {
								this.aBoolean191 = true;
							}
						}
					}
					if (local6 == 1) {
						local43 = this.anInt893;
						local46 = this.anInt894;
						local122 = this.anInt895;
						@Pc(125) int local125 = super.anInt846;
						@Pc(128) int local128 = super.anInt847;
						if (this.anInt892 == 0) {
							local125 -= 4;
							local128 -= 4;
						}
						if (this.anInt892 == 1) {
							local125 -= 553;
							local128 -= 205;
						}
						if (this.anInt892 == 2) {
							local125 -= 17;
							local128 -= 357;
						}
						@Pc(147) int local147 = -1;
						for (@Pc(149) int local149 = 0; local149 < this.anInt1025; local149++) {
							@Pc(164) int local164 = local46 + (this.anInt1025 - 1 - local149) * 15 + 31;
							if (local125 > local43 && local125 < local43 + local122 && local128 > local164 - 13 && local128 < local164 + 3) {
								local147 = local149;
							}
						}
						if (local147 != -1) {
							this.method659(local147);
						}
						this.aBoolean208 = false;
						if (this.anInt892 == 1) {
							this.aBoolean217 = true;
						}
						if (this.anInt892 == 2) {
							this.aBoolean191 = true;
							return;
						}
					}
				} else {
					if (local6 == 1 && this.anInt1025 > 0) {
						local43 = this.anIntArray262[this.anInt1025 - 1];
						if (local43 == 263 || local43 == 898 || local43 == 890 || local43 == 139 || local43 == 797 || local43 == 80 || local43 == 331 || local43 == 426 || local43 == 213 || local43 == 245 || local43 == 26 || local43 == 1164) {
							local46 = this.anIntArray260[this.anInt1025 - 1];
							local122 = this.anIntArray261[this.anInt1025 - 1];
							@Pc(283) Class24 local283 = Class24.method269(local122);
							if (local283.aBoolean97 || local283.aBoolean96) {
								this.aBoolean197 = false;
								this.anInt1013 = 0;
								this.anInt1068 = local122;
								this.anInt1069 = local46;
								this.anInt1070 = 2;
								this.anInt1071 = super.anInt846;
								this.anInt1072 = super.anInt847;
								if (Class24.method269(local122).anInt411 == this.anInt1077) {
									this.anInt1070 = 1;
								}
								if (Class24.method269(local122).anInt411 == this.anInt973) {
									this.anInt1070 = 3;
								}
								return;
							}
						}
					}
					if (local6 == 1 && (this.anInt929 == 1 || this.method641(this.anInt1025 - 1, 22)) && this.anInt1025 > 2) {
						local6 = 2;
					}
					if (local6 == 1 && this.anInt1025 > 0) {
						this.method659(this.anInt1025 - 1);
					}
					if (local6 != 2 || this.anInt1025 <= 0) {
						return;
					}
					this.method597();
				}
			}
		} catch (@Pc(376) RuntimeException local376) {
			signlink.reporterror("65270, " + true + ", " + local376.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "J", descriptor = "(I)V")
	private void method708() {
		try {
			@Pc(4) Graphics local4 = this.method584((byte) 1).getGraphics();
			local4.setColor(Color.black);
			local4.fillRect(0, 0, 765, 503);
			this.method577();
			@Pc(41) byte local41;
			@Pc(47) int local47;
			if (this.aBoolean223) {
				this.aBoolean199 = false;
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
			if (this.aBoolean207) {
				this.aBoolean199 = false;
				local4.setFont(new Font("Helvetica", 1, 20));
				local4.setColor(Color.white);
				local4.drawString("Error - unable to load game!", 50, 50);
				local4.drawString("To play RuneScape make sure you play from", 50, 100);
				local4.drawString("http://www.runescape.com", 50, 150);
			}
			if (this.aBoolean233) {
				this.aBoolean199 = false;
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
			signlink.reporterror("35756, " + -473 + ", " + local179.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(IZ)V")
	private void method709(@OriginalArg(1) boolean arg0) {
		try {
			this.method602();
			this.aClass11_12.method70();
			this.aClass8_Sub1_Sub2_Sub2_9.method406(0, 0);
			@Pc(49) byte local49;
			@Pc(61) int local61;
			if (this.anInt1083 == 0) {
				this.aClass8_Sub1_Sub2_Sub3_2.method448(this.aClass4_Sub1_1.aString1, 7711145, 180, 180, true);
				local49 = 80;
				this.aClass8_Sub1_Sub2_Sub3_4.method448("Welcome to RuneScape", 16776960, 180, 80, true);
				local61 = local49 + 30;
				this.aClass8_Sub1_Sub2_Sub2_10.method406(100, 27);
				this.aClass8_Sub1_Sub2_Sub3_4.method448("New User", 16777215, 100, 125, true);
				this.aClass8_Sub1_Sub2_Sub2_10.method406(100, 187);
				this.aClass8_Sub1_Sub2_Sub3_4.method448("Existing User", 16777215, 260, 125, true);
			}
			if (this.anInt1083 == 2) {
				local49 = 60;
				if (this.aString22.length() > 0) {
					this.aClass8_Sub1_Sub2_Sub3_4.method448(this.aString22, 16776960, 180, 45, true);
					this.aClass8_Sub1_Sub2_Sub3_4.method448(this.aString23, 16776960, 180, 60, true);
					local61 = local49 + 30;
				} else {
					this.aClass8_Sub1_Sub2_Sub3_4.method448(this.aString23, 16776960, 180, 53, true);
					local61 = local49 + 30;
				}
				this.aClass8_Sub1_Sub2_Sub3_4.method455("Username: " + this.aString27 + (this.anInt904 == 0 & anInt983 % 40 < 20 ? "@yel@|" : ""), true, 90, 16777215, 90);
				local61 += 15;
				this.aClass8_Sub1_Sub2_Sub3_4.method455("Password: " + Class36.method386(this.aString28) + (this.anInt904 == 1 & anInt983 % 40 < 20 ? "@yel@|" : ""), true, 92, 16777215, 105);
				local61 += 15;
				if (!arg0) {
					this.aClass8_Sub1_Sub2_Sub2_10.method406(130, 27);
					this.aClass8_Sub1_Sub2_Sub3_4.method448("Login", 16777215, 100, 155, true);
					this.aClass8_Sub1_Sub2_Sub2_10.method406(130, 187);
					this.aClass8_Sub1_Sub2_Sub3_4.method448("Cancel", 16777215, 260, 155, true);
				}
			}
			if (this.anInt1083 == 3) {
				this.aClass8_Sub1_Sub2_Sub3_4.method448("Create a free account", 16776960, 180, 40, true);
				local49 = 65;
				this.aClass8_Sub1_Sub2_Sub3_4.method448("To create a new account you need to", 16777215, 180, 65, true);
				local61 = local49 + 15;
				this.aClass8_Sub1_Sub2_Sub3_4.method448("go back to the main RuneScape webpage", 16777215, 180, 80, true);
				local61 += 15;
				this.aClass8_Sub1_Sub2_Sub3_4.method448("and choose the 'create account'", 16777215, 180, 95, true);
				local61 += 15;
				this.aClass8_Sub1_Sub2_Sub3_4.method448("button near the top of that page.", 16777215, 180, 110, true);
				local61 += 15;
				this.aClass8_Sub1_Sub2_Sub2_10.method406(130, 107);
				this.aClass8_Sub1_Sub2_Sub3_4.method448("Cancel", 16777215, 180, 155, true);
			}
			this.aClass11_12.method71(202, super.aGraphics2, 171);
			if (this.aBoolean219) {
				this.aBoolean219 = false;
				this.aClass11_10.method71(128, super.aGraphics2, 0);
				this.aClass11_11.method71(202, super.aGraphics2, 371);
				this.aClass11_15.method71(0, super.aGraphics2, 265);
				this.aClass11_16.method71(562, super.aGraphics2, 265);
				this.aClass11_17.method71(128, super.aGraphics2, 171);
				this.aClass11_18.method71(562, super.aGraphics2, 171);
			}
		} catch (@Pc(494) RuntimeException local494) {
			signlink.reporterror("90062, " + 9542 + ", " + arg0 + ", " + local494.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "()V")
	@Override
	protected void method579() {
		this.method586("Starting up", 20, (byte) 6);
		if (signlink.sunjava) {
			super.anInt834 = 5;
		}
		if (aBoolean221) {
			this.aBoolean233 = true;
			return;
		}
		aBoolean221 = true;
		@Pc(21) boolean local21 = false;
		@Pc(25) String local25 = this.method628();
		if (local25.endsWith("jagex.com")) {
			local21 = true;
		}
		if (local25.endsWith("runescape.com")) {
			local21 = true;
		}
		if (local25.endsWith("192.168.1.2")) {
			local21 = true;
		}
		if (local25.endsWith("192.168.1.231")) {
			local21 = true;
		}
		if (local25.endsWith("192.168.1.229")) {
			local21 = true;
		}
		if (local25.endsWith("192.168.1.228")) {
			local21 = true;
		}
		if (local25.endsWith("192.168.1.227")) {
			local21 = true;
		}
		if (local25.endsWith("192.168.1.226")) {
			local21 = true;
		}
		if (local25.endsWith("192.168.1.224")) {
			local21 = true;
		}
		if (local25.endsWith("192.168.1.223")) {
			local21 = true;
		}
		if (local25.endsWith("192.168.1.221")) {
			local21 = true;
		}
		if (local25.endsWith("127.0.0.1")) {
			local21 = true;
		}
		if (!local21) {
			this.aBoolean207 = true;
			return;
		}
		if (signlink.aRandomAccessFile3 != null) {
			for (@Pc(107) int local107 = 0; local107 < 5; local107++) {
				this.aClass3Array1[local107] = new Class3(600000, signlink.aRandomAccessFile3, local107 + 1, signlink.aRandomAccessFileArray1[local107], true);
			}
		}
		try {
			this.method682();
			this.aClass2_2 = this.method656("title", this.anIntArray266[1], 25, 1, "title screen");
			this.aClass8_Sub1_Sub2_Sub3_2 = new Class8_Sub1_Sub2_Sub3(false, this.aClass2_2, false, "p11_full");
			this.aClass8_Sub1_Sub2_Sub3_3 = new Class8_Sub1_Sub2_Sub3(false, this.aClass2_2, false, "p12_full");
			this.aClass8_Sub1_Sub2_Sub3_4 = new Class8_Sub1_Sub2_Sub3(false, this.aClass2_2, false, "b12_full");
			this.aClass8_Sub1_Sub2_Sub3_5 = new Class8_Sub1_Sub2_Sub3(true, this.aClass2_2, false, "q8_full");
			this.method703();
			this.method642();
			@Pc(203) Class2 local203 = this.method656("config", this.anIntArray266[2], 30, 2, "config");
			@Pc(215) Class2 local215 = this.method656("interface", this.anIntArray266[3], 35, 3, "interface");
			@Pc(227) Class2 local227 = this.method656("media", this.anIntArray266[4], 40, 4, "2d graphics");
			@Pc(239) Class2 local239 = this.method656("textures", this.anIntArray266[6], 45, 6, "textures");
			@Pc(251) Class2 local251 = this.method656("wordenc", this.anIntArray266[7], 50, 7, "chat system");
			@Pc(263) Class2 local263 = this.method656("sounds", this.anIntArray266[8], 55, 8, "sound effects");
			this.aByteArrayArrayArray8 = new byte[4][104][104];
			this.anIntArrayArrayArray7 = new int[4][105][105];
			this.aClass32_1 = new Class32(104, 104, 834, this.anIntArrayArrayArray7, 4);
			for (@Pc(288) int local288 = 0; local288 < 4; local288++) {
				this.aClass1Array1[local288] = new Class1(646, 104, 104);
			}
			this.aClass8_Sub1_Sub2_Sub1_9 = new Class8_Sub1_Sub2_Sub1(512, 512);
			@Pc(323) Class2 local323 = this.method656("versionlist", this.anIntArray266[5], 60, 5, "update list");
			this.method586("Connecting to update server", 60, (byte) 6);
			this.aClass4_Sub1_1 = new Class4_Sub1();
			this.aClass4_Sub1_1.method37(local323, this);
			Class29.method305(this.aClass4_Sub1_1.method32());
			Class8_Sub1_Sub1_Sub5.method207(this.aClass4_Sub1_1.method28(0), this.aClass4_Sub1_1);
			if (!aBoolean237) {
				this.anInt1058 = 0;
				this.aBoolean231 = true;
				this.aClass4_Sub1_1.method41(2, this.anInt1058);
				while (this.aClass4_Sub1_1.method30() > 0) {
					this.method599();
					try {
						Thread.sleep(100L);
					} catch (@Pc(374) Exception local374) {
					}
					if (this.aClass4_Sub1_1.anInt19 > 3) {
						this.method693("ondemand");
						return;
					}
				}
			}
			this.method586("Requesting animations", 65, (byte) 6);
			@Pc(398) int local398 = this.aClass4_Sub1_1.method28(1);
			for (@Pc(400) int local400 = 0; local400 < local398; local400++) {
				this.aClass4_Sub1_1.method41(1, local400);
			}
			@Pc(418) int local418;
			while (this.aClass4_Sub1_1.method30() > 0) {
				local418 = local398 - this.aClass4_Sub1_1.method30();
				if (local418 > 0) {
					this.method586("Loading animations - " + local418 * 100 / local398 + "%", 65, (byte) 6);
				}
				this.method599();
				try {
					Thread.sleep(100L);
				} catch (@Pc(444) Exception local444) {
				}
				if (this.aClass4_Sub1_1.anInt19 > 3) {
					this.method693("ondemand");
					return;
				}
			}
			this.method586("Requesting models", 70, (byte) 6);
			local398 = this.aClass4_Sub1_1.method28(0);
			@Pc(478) int local478;
			for (local418 = 0; local418 < local398; local418++) {
				local478 = this.aClass4_Sub1_1.method36(local418);
				if ((local478 & 0x1) != 0) {
					this.aClass4_Sub1_1.method41(0, local418);
				}
			}
			local398 = this.aClass4_Sub1_1.method30();
			while (this.aClass4_Sub1_1.method30() > 0) {
				local478 = local398 - this.aClass4_Sub1_1.method30();
				if (local478 > 0) {
					this.method586("Loading models - " + local478 * 100 / local398 + "%", 70, (byte) 6);
				}
				this.method599();
				try {
					Thread.sleep(100L);
				} catch (@Pc(529) Exception local529) {
				}
			}
			if (this.aClass3Array1[0] != null) {
				this.method586("Requesting maps", 75, (byte) 6);
				this.aClass4_Sub1_1.method41(3, this.aClass4_Sub1_1.method29(0, 47, 48));
				this.aClass4_Sub1_1.method41(3, this.aClass4_Sub1_1.method29(1, 47, 48));
				this.aClass4_Sub1_1.method41(3, this.aClass4_Sub1_1.method29(0, 48, 48));
				this.aClass4_Sub1_1.method41(3, this.aClass4_Sub1_1.method29(1, 48, 48));
				this.aClass4_Sub1_1.method41(3, this.aClass4_Sub1_1.method29(0, 49, 48));
				this.aClass4_Sub1_1.method41(3, this.aClass4_Sub1_1.method29(1, 49, 48));
				this.aClass4_Sub1_1.method41(3, this.aClass4_Sub1_1.method29(0, 47, 47));
				this.aClass4_Sub1_1.method41(3, this.aClass4_Sub1_1.method29(1, 47, 47));
				this.aClass4_Sub1_1.method41(3, this.aClass4_Sub1_1.method29(0, 48, 47));
				this.aClass4_Sub1_1.method41(3, this.aClass4_Sub1_1.method29(1, 48, 47));
				this.aClass4_Sub1_1.method41(3, this.aClass4_Sub1_1.method29(0, 48, 148));
				this.aClass4_Sub1_1.method41(3, this.aClass4_Sub1_1.method29(1, 48, 148));
				local398 = this.aClass4_Sub1_1.method30();
				while (this.aClass4_Sub1_1.method30() > 0) {
					local478 = local398 - this.aClass4_Sub1_1.method30();
					if (local478 > 0) {
						this.method586("Loading maps - " + local478 * 100 / local398 + "%", 75, (byte) 6);
					}
					this.method599();
					try {
						Thread.sleep(100L);
					} catch (@Pc(714) Exception local714) {
					}
				}
			}
			local398 = this.aClass4_Sub1_1.method28(0);
			@Pc(735) int local735;
			for (local478 = 0; local478 < local398; local478++) {
				local735 = this.aClass4_Sub1_1.method36(local478);
				@Pc(737) byte local737 = 0;
				if ((local735 & 0x8) != 0) {
					local737 = 10;
				} else if ((local735 & 0x20) != 0) {
					local737 = 9;
				} else if ((local735 & 0x10) != 0) {
					local737 = 8;
				} else if ((local735 & 0x40) != 0) {
					local737 = 7;
				} else if ((local735 & 0x80) != 0) {
					local737 = 6;
				} else if ((local735 & 0x2) != 0) {
					local737 = 5;
				} else if ((local735 & 0x4) != 0) {
					local737 = 4;
				}
				if ((local735 & 0x1) != 0) {
					local737 = 3;
				}
				if (local737 != 0) {
					this.aClass4_Sub1_1.method24(local478, local737, 0);
				}
			}
			this.aClass4_Sub1_1.method35(aBoolean236);
			if (!aBoolean237) {
				local398 = this.aClass4_Sub1_1.method28(2);
				for (local735 = 1; local735 < local398; local735++) {
					if (this.aClass4_Sub1_1.method21(local735)) {
						this.aClass4_Sub1_1.method24(local735, (byte) 1, 2);
					}
				}
			}
			local398 = this.aClass4_Sub1_1.method28(0);
			@Pc(860) int local860;
			for (local735 = 0; local735 < local398; local735++) {
				local860 = this.aClass4_Sub1_1.method36(local735);
				if (local860 == 0 && this.aClass4_Sub1_1.anInt20 < 200) {
					this.aClass4_Sub1_1.method24(local735, (byte) 1, 0);
				}
			}
			this.method586("Unpacking media", 80, (byte) 6);
			this.aClass8_Sub1_Sub2_Sub2_18 = new Class8_Sub1_Sub2_Sub2(local227, "invback", 0);
			this.aClass8_Sub1_Sub2_Sub2_20 = new Class8_Sub1_Sub2_Sub2(local227, "chatback", 0);
			this.aClass8_Sub1_Sub2_Sub2_19 = new Class8_Sub1_Sub2_Sub2(local227, "mapback", 0);
			this.aClass8_Sub1_Sub2_Sub2_1 = new Class8_Sub1_Sub2_Sub2(local227, "backbase1", 0);
			this.aClass8_Sub1_Sub2_Sub2_2 = new Class8_Sub1_Sub2_Sub2(local227, "backbase2", 0);
			this.aClass8_Sub1_Sub2_Sub2_3 = new Class8_Sub1_Sub2_Sub2(local227, "backhmid1", 0);
			for (local860 = 0; local860 < 13; local860++) {
				this.aClass8_Sub1_Sub2_Sub2Array2[local860] = new Class8_Sub1_Sub2_Sub2(local227, "sideicons", local860);
			}
			this.aClass8_Sub1_Sub2_Sub1_6 = new Class8_Sub1_Sub2_Sub1(local227, "compass", 0);
			this.aClass8_Sub1_Sub2_Sub1_3 = new Class8_Sub1_Sub2_Sub1(local227, "mapedge", 0);
			this.aClass8_Sub1_Sub2_Sub1_3.method114();
			for (@Pc(971) int local971 = 0; local971 < 72; local971++) {
				this.aClass8_Sub1_Sub2_Sub2Array3[local971] = new Class8_Sub1_Sub2_Sub2(local227, "mapscene", local971);
			}
			for (@Pc(989) int local989 = 0; local989 < 70; local989++) {
				this.aClass8_Sub1_Sub2_Sub1Array10[local989] = new Class8_Sub1_Sub2_Sub1(local227, "mapfunction", local989);
			}
			for (@Pc(1007) int local1007 = 0; local1007 < 5; local1007++) {
				this.aClass8_Sub1_Sub2_Sub1Array4[local1007] = new Class8_Sub1_Sub2_Sub1(local227, "hitmarks", local1007);
			}
			for (@Pc(1025) int local1025 = 0; local1025 < 6; local1025++) {
				this.aClass8_Sub1_Sub2_Sub1Array9[local1025] = new Class8_Sub1_Sub2_Sub1(local227, "headicons_pk", local1025);
			}
			for (@Pc(1043) int local1043 = 0; local1043 < 9; local1043++) {
				this.aClass8_Sub1_Sub2_Sub1Array7[local1043] = new Class8_Sub1_Sub2_Sub1(local227, "headicons_prayer", local1043);
			}
			for (@Pc(1061) int local1061 = 0; local1061 < 6; local1061++) {
				this.aClass8_Sub1_Sub2_Sub1Array8[local1061] = new Class8_Sub1_Sub2_Sub1(local227, "headicons_hint", local1061);
			}
			this.aClass8_Sub1_Sub2_Sub1_10 = new Class8_Sub1_Sub2_Sub1(local227, "overlay_multiway", 0);
			this.aClass8_Sub1_Sub2_Sub1_16 = new Class8_Sub1_Sub2_Sub1(local227, "mapmarker", 0);
			this.aClass8_Sub1_Sub2_Sub1_17 = new Class8_Sub1_Sub2_Sub1(local227, "mapmarker", 1);
			for (@Pc(1103) int local1103 = 0; local1103 < 8; local1103++) {
				this.aClass8_Sub1_Sub2_Sub1Array5[local1103] = new Class8_Sub1_Sub2_Sub1(local227, "cross", local1103);
			}
			this.aClass8_Sub1_Sub2_Sub1_11 = new Class8_Sub1_Sub2_Sub1(local227, "mapdots", 0);
			this.aClass8_Sub1_Sub2_Sub1_12 = new Class8_Sub1_Sub2_Sub1(local227, "mapdots", 1);
			this.aClass8_Sub1_Sub2_Sub1_13 = new Class8_Sub1_Sub2_Sub1(local227, "mapdots", 2);
			this.aClass8_Sub1_Sub2_Sub1_14 = new Class8_Sub1_Sub2_Sub1(local227, "mapdots", 3);
			this.aClass8_Sub1_Sub2_Sub1_15 = new Class8_Sub1_Sub2_Sub1(local227, "mapdots", 4);
			this.aClass8_Sub1_Sub2_Sub2_11 = new Class8_Sub1_Sub2_Sub2(local227, "scrollbar", 0);
			this.aClass8_Sub1_Sub2_Sub2_12 = new Class8_Sub1_Sub2_Sub2(local227, "scrollbar", 1);
			this.aClass8_Sub1_Sub2_Sub2_4 = new Class8_Sub1_Sub2_Sub2(local227, "redstone1", 0);
			this.aClass8_Sub1_Sub2_Sub2_5 = new Class8_Sub1_Sub2_Sub2(local227, "redstone2", 0);
			this.aClass8_Sub1_Sub2_Sub2_6 = new Class8_Sub1_Sub2_Sub2(local227, "redstone3", 0);
			this.aClass8_Sub1_Sub2_Sub2_7 = new Class8_Sub1_Sub2_Sub2(local227, "redstone1", 0);
			this.aClass8_Sub1_Sub2_Sub2_7.method403();
			this.aClass8_Sub1_Sub2_Sub2_8 = new Class8_Sub1_Sub2_Sub2(local227, "redstone2", 0);
			this.aClass8_Sub1_Sub2_Sub2_8.method403();
			this.aClass8_Sub1_Sub2_Sub2_13 = new Class8_Sub1_Sub2_Sub2(local227, "redstone1", 0);
			this.aClass8_Sub1_Sub2_Sub2_13.method404();
			this.aClass8_Sub1_Sub2_Sub2_14 = new Class8_Sub1_Sub2_Sub2(local227, "redstone2", 0);
			this.aClass8_Sub1_Sub2_Sub2_14.method404();
			this.aClass8_Sub1_Sub2_Sub2_15 = new Class8_Sub1_Sub2_Sub2(local227, "redstone3", 0);
			this.aClass8_Sub1_Sub2_Sub2_15.method404();
			this.aClass8_Sub1_Sub2_Sub2_16 = new Class8_Sub1_Sub2_Sub2(local227, "redstone1", 0);
			this.aClass8_Sub1_Sub2_Sub2_16.method403();
			this.aClass8_Sub1_Sub2_Sub2_16.method404();
			this.aClass8_Sub1_Sub2_Sub2_17 = new Class8_Sub1_Sub2_Sub2(local227, "redstone2", 0);
			this.aClass8_Sub1_Sub2_Sub2_17.method403();
			this.aClass8_Sub1_Sub2_Sub2_17.method404();
			for (@Pc(1293) int local1293 = 0; local1293 < 2; local1293++) {
				this.aClass8_Sub1_Sub2_Sub2Array5[local1293] = new Class8_Sub1_Sub2_Sub2(local227, "mod_icons", local1293);
			}
			@Pc(1316) Class8_Sub1_Sub2_Sub1 local1316 = new Class8_Sub1_Sub2_Sub1(local227, "backleft1", 0);
			this.aClass11_19 = new Class11(aByte23, local1316.anInt192, local1316.anInt191, this.method584((byte) 1));
			local1316.method115(0, 0);
			@Pc(1341) Class8_Sub1_Sub2_Sub1 local1341 = new Class8_Sub1_Sub2_Sub1(local227, "backleft2", 0);
			this.aClass11_20 = new Class11(aByte23, local1341.anInt192, local1341.anInt191, this.method584((byte) 1));
			local1341.method115(0, 0);
			@Pc(1366) Class8_Sub1_Sub2_Sub1 local1366 = new Class8_Sub1_Sub2_Sub1(local227, "backright1", 0);
			this.aClass11_21 = new Class11(aByte23, local1366.anInt192, local1366.anInt191, this.method584((byte) 1));
			local1366.method115(0, 0);
			@Pc(1391) Class8_Sub1_Sub2_Sub1 local1391 = new Class8_Sub1_Sub2_Sub1(local227, "backright2", 0);
			this.aClass11_22 = new Class11(aByte23, local1391.anInt192, local1391.anInt191, this.method584((byte) 1));
			local1391.method115(0, 0);
			@Pc(1416) Class8_Sub1_Sub2_Sub1 local1416 = new Class8_Sub1_Sub2_Sub1(local227, "backtop1", 0);
			this.aClass11_23 = new Class11(aByte23, local1416.anInt192, local1416.anInt191, this.method584((byte) 1));
			local1416.method115(0, 0);
			@Pc(1441) Class8_Sub1_Sub2_Sub1 local1441 = new Class8_Sub1_Sub2_Sub1(local227, "backvmid1", 0);
			this.aClass11_24 = new Class11(aByte23, local1441.anInt192, local1441.anInt191, this.method584((byte) 1));
			local1441.method115(0, 0);
			@Pc(1466) Class8_Sub1_Sub2_Sub1 local1466 = new Class8_Sub1_Sub2_Sub1(local227, "backvmid2", 0);
			this.aClass11_25 = new Class11(aByte23, local1466.anInt192, local1466.anInt191, this.method584((byte) 1));
			local1466.method115(0, 0);
			@Pc(1491) Class8_Sub1_Sub2_Sub1 local1491 = new Class8_Sub1_Sub2_Sub1(local227, "backvmid3", 0);
			this.aClass11_26 = new Class11(aByte23, local1491.anInt192, local1491.anInt191, this.method584((byte) 1));
			local1491.method115(0, 0);
			@Pc(1516) Class8_Sub1_Sub2_Sub1 local1516 = new Class8_Sub1_Sub2_Sub1(local227, "backhmid2", 0);
			this.aClass11_27 = new Class11(aByte23, local1516.anInt192, local1516.anInt191, this.method584((byte) 1));
			local1516.method115(0, 0);
			@Pc(1541) int local1541 = (int) (Math.random() * 21.0D) - 10;
			@Pc(1548) int local1548 = (int) (Math.random() * 21.0D) - 10;
			@Pc(1555) int local1555 = (int) (Math.random() * 21.0D) - 10;
			@Pc(1562) int local1562 = (int) (Math.random() * 41.0D) - 20;
			for (@Pc(1564) int local1564 = 0; local1564 < 100; local1564++) {
				if (this.aClass8_Sub1_Sub2_Sub1Array10[local1564] != null) {
					this.aClass8_Sub1_Sub2_Sub1Array10[local1564].method113(local1541 + local1562, local1548 + local1562, local1555 + local1562, anInt1008);
				}
				if (this.aClass8_Sub1_Sub2_Sub2Array3[local1564] != null) {
					this.aClass8_Sub1_Sub2_Sub2Array3[local1564].method405(local1541 + local1562, local1548 + local1562, local1555 + local1562, anInt1008);
				}
			}
			this.method586("Unpacking textures", 83, (byte) 6);
			Class8_Sub1_Sub2_Sub4.method562(local239);
			Class8_Sub1_Sub2_Sub4.method566(0.8D);
			Class8_Sub1_Sub2_Sub4.method561();
			this.method586("Unpacking config", 86, (byte) 6);
			Class46.method485(local203);
			Class23.method258(local203);
			Class48.method526(local203);
			Class19.method194(local203);
			Class26.method292(local203);
			Class44.method479(local203);
			Class12.method73(local203);
			Class41.method430(local203);
			Class13.method76(local203);
			Class19.aBoolean61 = aBoolean236;
			if (!aBoolean237) {
				this.method586("Unpacking sounds", 90, (byte) 6);
				@Pc(1667) byte[] local1667 = local263.method14("sounds.dat", null);
				@Pc(1673) Class8_Sub1_Sub3 local1673 = new Class8_Sub1_Sub3(local1667, 713);
				Class35.method375(local1673);
			}
			this.method586("Unpacking interfaces", 95, (byte) 6);
			@Pc(1704) Class8_Sub1_Sub2_Sub3[] local1704 = new Class8_Sub1_Sub2_Sub3[] { this.aClass8_Sub1_Sub2_Sub3_2, this.aClass8_Sub1_Sub2_Sub3_3, this.aClass8_Sub1_Sub2_Sub3_4, this.aClass8_Sub1_Sub2_Sub3_5 };
			Class24.method270(local1704, local215, local227);
			this.method586("Preparing game engine", 100, (byte) 6);
			@Pc(1720) int local1720;
			@Pc(1722) int local1722;
			@Pc(1724) int local1724;
			for (@Pc(1716) int local1716 = 0; local1716 < 33; local1716++) {
				local1720 = 999;
				local1722 = 0;
				for (local1724 = 0; local1724 < 34; local1724++) {
					if (this.aClass8_Sub1_Sub2_Sub2_19.aByteArray19[local1724 + local1716 * this.aClass8_Sub1_Sub2_Sub2_19.anInt601] == 0) {
						if (local1720 == 999) {
							local1720 = local1724;
						}
					} else if (local1720 != 999) {
						local1722 = local1724;
						break;
					}
				}
				this.anIntArray219[local1716] = local1720;
				this.anIntArray242[local1716] = local1722 - local1720;
			}
			@Pc(1782) int local1782;
			for (local1720 = 5; local1720 < 156; local1720++) {
				local1722 = 999;
				local1724 = 0;
				for (local1782 = 25; local1782 < 172; local1782++) {
					if (this.aClass8_Sub1_Sub2_Sub2_19.aByteArray19[local1782 + local1720 * this.aClass8_Sub1_Sub2_Sub2_19.anInt601] == 0 && (local1782 > 34 || local1720 > 34)) {
						if (local1722 == 999) {
							local1722 = local1782;
						}
					} else if (local1722 != 999) {
						local1724 = local1782;
						break;
					}
				}
				this.anIntArray221[local1720 - 5] = local1722 - 25;
				this.anIntArray247[local1720 - 5] = local1724 - local1722;
			}
			Class8_Sub1_Sub2_Sub4.method559(765, 503);
			this.anIntArray229 = Class8_Sub1_Sub2_Sub4.anIntArray206;
			Class8_Sub1_Sub2_Sub4.method559(479, 96);
			this.anIntArray226 = Class8_Sub1_Sub2_Sub4.anIntArray206;
			Class8_Sub1_Sub2_Sub4.method559(190, 261);
			this.anIntArray227 = Class8_Sub1_Sub2_Sub4.anIntArray206;
			Class8_Sub1_Sub2_Sub4.method559(512, 334);
			this.anIntArray228 = Class8_Sub1_Sub2_Sub4.anIntArray206;
			@Pc(1873) int[] local1873 = new int[9];
			for (local1724 = 0; local1724 < 9; local1724++) {
				local1782 = local1724 * 32 + 128 + 15;
				@Pc(1891) int local1891 = local1782 * 3 + 600;
				@Pc(1895) int local1895 = Class8_Sub1_Sub2_Sub4.anIntArray204[local1782];
				local1873[local1724] = local1891 * local1895 >> 16;
			}
			Class32.method352(local1873, 178);
			Class47.method488(local251);
			this.aClass22_1 = new Class22(true, this);
			this.method585(this.aClass22_1, 10);
			Class8_Sub1_Sub1_Sub6.aClient5 = this;
			Class23.aClient3 = this;
			Class26.aClient4 = this;
		} catch (@Pc(1936) Exception local1936) {
			signlink.reporterror("loaderror " + this.aString21 + " " + this.anInt985);
			this.aBoolean223 = true;
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIIIBIIII)V")
	private void method710(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		try {
			@Pc(1) Class8_Sub3 local1 = null;
			for (@Pc(6) Class8_Sub3 local6 = (Class8_Sub3) this.aClass49_12.method538(); local6 != null; local6 = (Class8_Sub3) this.aClass49_12.method540((byte) 6)) {
				if (local6.anInt313 == arg6 && local6.anInt315 == arg0 && local6.anInt316 == arg2 && local6.anInt314 == arg3) {
					local1 = local6;
					break;
				}
			}
			if (local1 == null) {
				local1 = new Class8_Sub3();
				local1.anInt313 = arg6;
				local1.anInt314 = arg3;
				local1.anInt315 = arg0;
				local1.anInt316 = arg2;
				this.method696(local1);
				this.aClass49_12.method535(local1);
			}
			local1.anInt305 = arg8;
			local1.anInt307 = arg1;
			local1.anInt306 = arg4;
			local1.anInt312 = arg5;
			local1.anInt311 = arg7;
		} catch (@Pc(86) RuntimeException local86) {
			signlink.reporterror("82564, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + 73 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + local86.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "K", descriptor = "(I)Z")
	private boolean method711() {
		try {
			return signlink.wavereplay();
		} catch (@Pc(9) RuntimeException local9) {
			signlink.reporterror("13178, " + 1172 + ", " + local9.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/String;Z)Z")
	private boolean method713(@OriginalArg(0) String arg0) {
		try {
			if (arg0 == null) {
				return false;
			}
			for (@Pc(10) int local10 = 0; local10 < this.anInt1081; local10++) {
				if (arg0.equalsIgnoreCase(this.aStringArray9[local10])) {
					return true;
				}
			}
			return arg0.equalsIgnoreCase(aClass8_Sub1_Sub1_Sub1_Sub2_1.aString15);
		} catch (@Pc(36) RuntimeException local36) {
			signlink.reporterror("64748, " + arg0 + ", " + false + ", " + local36.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
	@Override
	public String getParameter(@OriginalArg(0) String arg0) {
		return signlink.mainapp == null ? super.getParameter(arg0) : signlink.mainapp.getParameter(arg0);
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(BI)V")
	private void method714(@OriginalArg(1) int arg0) {
		try {
			signlink.anInt1094 = arg0;
		} catch (@Pc(11) RuntimeException local11) {
			signlink.reporterror("97138, " + 6 + ", " + arg0 + ", " + local11.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(BLclient!MIIVNBFU;)Z")
	private boolean method715(@OriginalArg(1) Class24 arg0) {
		try {
			@Pc(4) int local4 = arg0.anInt424;
			if (this.anInt1082 == 2) {
				if (local4 == 201) {
					this.aBoolean191 = true;
					this.anInt940 = 0;
					this.aBoolean201 = true;
					this.aString30 = "";
					this.anInt965 = 1;
					this.aString26 = "Enter name of friend to add to list";
				}
				if (local4 == 202) {
					this.aBoolean191 = true;
					this.anInt940 = 0;
					this.aBoolean201 = true;
					this.aString30 = "";
					this.anInt965 = 2;
					this.aString26 = "Enter name of friend to delete from list";
				}
			}
			if (local4 == 205) {
				this.anInt1048 = 250;
				return true;
			}
			if (local4 == 501) {
				this.aBoolean191 = true;
				this.anInt940 = 0;
				this.aBoolean201 = true;
				this.aString30 = "";
				this.anInt965 = 4;
				this.aString26 = "Enter name of player to add to list";
			}
			if (local4 == 502) {
				this.aBoolean191 = true;
				this.anInt940 = 0;
				this.aBoolean201 = true;
				this.aString30 = "";
				this.anInt965 = 5;
				this.aString26 = "Enter name of player to delete from list";
			}
			@Pc(118) int local118;
			@Pc(122) int local122;
			@Pc(127) int local127;
			if (local4 >= 300 && local4 <= 313) {
				local118 = (local4 - 300) / 2;
				local122 = local4 & 0x1;
				local127 = this.anIntArray213[local118];
				if (local127 != -1) {
					while (true) {
						if (local122 == 0) {
							local127--;
							if (local127 < 0) {
								local127 = Class44.anInt751 - 1;
							}
						}
						if (local122 == 1) {
							local127++;
							if (local127 >= Class44.anInt751) {
								local127 = 0;
							}
						}
						if (!Class44.aClass44Array1[local127].aBoolean165 && Class44.aClass44Array1[local127].anInt752 == local118 + (this.aBoolean216 ? 0 : 7)) {
							this.anIntArray213[local118] = local127;
							this.aBoolean196 = true;
							break;
						}
					}
				}
			}
			if (local4 >= 314 && local4 <= 323) {
				local118 = (local4 - 314) / 2;
				local122 = local4 & 0x1;
				local127 = this.anIntArray265[local118];
				if (local122 == 0) {
					local127--;
					if (local127 < 0) {
						local127 = anIntArrayArray23[local118].length - 1;
					}
				}
				if (local122 == 1) {
					local127++;
					if (local127 >= anIntArrayArray23[local118].length) {
						local127 = 0;
					}
				}
				this.anIntArray265[local118] = local127;
				this.aBoolean196 = true;
			}
			if (local4 == 324 && !this.aBoolean216) {
				this.aBoolean216 = true;
				this.method652();
			}
			if (local4 == 325 && this.aBoolean216) {
				this.aBoolean216 = false;
				this.method652();
			}
			if (local4 == 326) {
				this.aClass8_Sub1_Sub3_6.method141(225);
				this.aClass8_Sub1_Sub3_6.method142(this.aBoolean216 ? 0 : 1);
				for (local118 = 0; local118 < 7; local118++) {
					this.aClass8_Sub1_Sub3_6.method142(this.anIntArray213[local118]);
				}
				for (local122 = 0; local122 < 5; local122++) {
					this.aClass8_Sub1_Sub3_6.method142(this.anIntArray265[local122]);
				}
				return true;
			}
			if (local4 == 620) {
				this.aBoolean229 = !this.aBoolean229;
			}
			if (local4 >= 601 && local4 <= 613) {
				this.method666();
				if (this.aString25.length() > 0) {
					this.aClass8_Sub1_Sub3_6.method141(158);
					this.aClass8_Sub1_Sub3_6.method148(Class36.method381(this.aString25));
					this.aClass8_Sub1_Sub3_6.method142(local4 - 601);
					this.aClass8_Sub1_Sub3_6.method142(this.aBoolean229 ? 1 : 0);
				}
			}
			return false;
		} catch (@Pc(355) RuntimeException local355) {
			signlink.reporterror("68895, " + 56 + ", " + arg0 + ", " + local355.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "o", descriptor = "(Z)V")
	private void method716() {
		try {
			if (this.anInt1048 > 0) {
				this.method639();
			} else {
				this.method640("Connection lost", "Please wait - attempting to reestablish");
				this.anInt1052 = 0;
				this.anInt971 = 0;
				@Pc(25) Class7 local25 = this.aClass7_1;
				this.aBoolean214 = false;
				this.anInt859 = 0;
				this.method601(this.aString27, this.aString28, true);
				if (!this.aBoolean214) {
					this.method639();
				}
				try {
					local25.method48();
				} catch (@Pc(48) Exception local48) {
				}
			}
		} catch (@Pc(50) RuntimeException local50) {
			signlink.reporterror("22444, " + false + ", " + local50.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "L", descriptor = "(I)V")
	private void method717() {
		try {
			if (this.anInt1052 == 0 && super.anInt845 == 1) {
				@Pc(20) int local20 = super.anInt846 - 25 - 550;
				@Pc(27) int local27 = super.anInt847 - 5 - 4;
				if (local20 >= 0 && local27 >= 0 && local20 < 146 && local27 < 151) {
					local20 -= 73;
					local27 -= 75;
					@Pc(47) int local47 = this.anInt862 + this.anInt1079 & 0x7FF;
					@Pc(51) int local51 = Class8_Sub1_Sub2_Sub4.anIntArray204[local47];
					@Pc(55) int local55 = Class8_Sub1_Sub2_Sub4.anIntArray205[local47];
					@Pc(64) int local64 = local51 * (this.anInt935 + 256) >> 8;
					@Pc(73) int local73 = local55 * (this.anInt935 + 256) >> 8;
					@Pc(83) int local83 = local27 * local64 + local20 * local73 >> 11;
					@Pc(93) int local93 = local27 * local73 - local20 * local64 >> 11;
					@Pc(100) int local100 = aClass8_Sub1_Sub1_Sub1_Sub2_1.anInt716 + local83 >> 7;
					@Pc(107) int local107 = aClass8_Sub1_Sub1_Sub1_Sub2_1.anInt717 - local93 >> 7;
					@Pc(129) boolean local129 = this.method600(local107, 1, true, 0, aClass8_Sub1_Sub1_Sub1_Sub2_1.anIntArray183[0], 0, this.anInt928, 0, 0, local100, aClass8_Sub1_Sub1_Sub1_Sub2_1.anIntArray184[0], 0);
					if (local129) {
						this.aClass8_Sub1_Sub3_6.method142(local20);
						this.aClass8_Sub1_Sub3_6.method142(local27);
						this.aClass8_Sub1_Sub3_6.method143(this.anInt862);
						this.aClass8_Sub1_Sub3_6.method142(57);
						this.aClass8_Sub1_Sub3_6.method142(this.anInt1079);
						this.aClass8_Sub1_Sub3_6.method142(this.anInt935);
						this.aClass8_Sub1_Sub3_6.method142(89);
						this.aClass8_Sub1_Sub3_6.method143(aClass8_Sub1_Sub1_Sub1_Sub2_1.anInt716);
						this.aClass8_Sub1_Sub3_6.method143(aClass8_Sub1_Sub1_Sub1_Sub2_1.anInt717);
						this.aClass8_Sub1_Sub3_6.method142(this.anInt1049);
						this.aClass8_Sub1_Sub3_6.method142(63);
						return;
					}
				}
			}
		} catch (@Pc(183) RuntimeException local183) {
			signlink.reporterror("21373, " + -374 + ", " + local183.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "M", descriptor = "(I)V")
	private void method718() {
		try {
			if (this.aClass11_6 == null) {
				this.method660();
				super.aClass11_2 = null;
				this.aClass11_10 = null;
				this.aClass11_11 = null;
				this.aClass11_12 = null;
				this.aClass11_13 = null;
				this.aClass11_14 = null;
				this.aClass11_15 = null;
				this.aClass11_16 = null;
				this.aClass11_17 = null;
				this.aClass11_18 = null;
				this.aClass11_6 = new Class11(aByte23, 96, 479, this.method584((byte) 1));
				this.aClass11_4 = new Class11(aByte23, 156, 172, this.method584((byte) 1));
				Class8_Sub1_Sub2.method548(this.anInt970);
				this.aClass8_Sub1_Sub2_Sub2_19.method406(0, 0);
				this.aClass11_3 = new Class11(aByte23, 261, 190, this.method584((byte) 1));
				this.aClass11_5 = new Class11(aByte23, 334, 512, this.method584((byte) 1));
				Class8_Sub1_Sub2.method548(this.anInt970);
				this.aClass11_7 = new Class11(aByte23, 50, 496, this.method584((byte) 1));
				this.aClass11_8 = new Class11(aByte23, 37, 269, this.method584((byte) 1));
				this.aClass11_9 = new Class11(aByte23, 45, 249, this.method584((byte) 1));
				this.aBoolean219 = true;
				this.aClass11_5.method70();
				Class8_Sub1_Sub2_Sub4.anIntArray206 = this.anIntArray228;
			}
		} catch (@Pc(143) RuntimeException local143) {
			signlink.reporterror("78657, " + 2756 + ", " + local143.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(I)V")
	@Override
	protected void method583(@OriginalArg(0) int arg0) {
		try {
			this.aBoolean219 = true;
			if (arg0 != 0) {
				for (@Pc(6) int local6 = 1; local6 > 0; local6++) {
				}
			}
		} catch (@Pc(13) RuntimeException local13) {
			signlink.reporterror("27691, " + arg0 + ", " + local13.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "N", descriptor = "(I)V")
	private void method719() {
		try {
			for (@Pc(10) int local10 = 0; local10 < this.anInt1031; local10++) {
				if (this.anIntArray243[local10] <= 0) {
					@Pc(19) boolean local19 = false;
					try {
						if (this.anIntArray235[local10] != this.anInt891 || this.anIntArray214[local10] != this.anInt1036) {
							@Pc(52) Class8_Sub1_Sub3 local52 = Class35.method376(this.anIntArray214[local10], this.anIntArray235[local10]);
							if (System.currentTimeMillis() + (long) (local52.anInt239 / 22) > this.aLong29 + (long) (this.anInt916 / 22)) {
								this.anInt916 = local52.anInt239;
								this.aLong29 = System.currentTimeMillis();
								if (this.method724(local52.aByteArray7, local52.anInt239)) {
									this.anInt891 = this.anIntArray235[local10];
									this.anInt1036 = this.anIntArray214[local10];
								} else {
									local19 = true;
								}
							}
						} else if (!this.method711()) {
							local19 = true;
						}
					} catch (@Pc(102) Exception local102) {
						if (signlink.reporterror) {
							this.aClass8_Sub1_Sub3_6.method141(199);
							this.aClass8_Sub1_Sub3_6.method143(this.anIntArray235[local10] & 0x7FFF);
						} else {
							this.aClass8_Sub1_Sub3_6.method141(199);
							this.aClass8_Sub1_Sub3_6.method143(-1);
						}
					}
					if (local19 && this.anIntArray243[local10] != -5) {
						this.anIntArray243[local10] = -5;
					} else {
						this.anInt1031--;
						for (@Pc(145) int local145 = local10; local145 < this.anInt1031; local145++) {
							this.anIntArray235[local145] = this.anIntArray235[local145 + 1];
							this.anIntArray214[local145] = this.anIntArray214[local145 + 1];
							this.anIntArray243[local145] = this.anIntArray243[local145 + 1];
						}
						local10--;
					}
				} else {
					@Pc(197) int local197 = this.anIntArray243[local10]--;
				}
			}
			if (this.anInt918 > 0) {
				this.anInt918 -= 20;
				if (this.anInt918 < 0) {
					this.anInt918 = 0;
				}
				if (this.anInt918 == 0 && this.aBoolean194 && !aBoolean237) {
					this.anInt1058 = this.anInt910;
					this.aBoolean231 = true;
					this.aClass4_Sub1_1.method41(2, this.anInt1058);
					return;
				}
			}
		} catch (@Pc(243) RuntimeException local243) {
			signlink.reporterror("65506, " + 7 + ", " + local243.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ZLjava/lang/String;)V")
	private void method720(@OriginalArg(1) String arg0) {
		try {
			if (arg0 == null || arg0.length() == 0) {
				this.anInt901 = 0;
			} else {
				@Pc(12) String local12 = arg0;
				@Pc(15) String[] local15 = new String[100];
				@Pc(17) int local17 = 0;
				while (true) {
					@Pc(26) int local26 = local12.indexOf(" ");
					if (local26 == -1) {
						local12 = local12.trim();
						if (local12.length() > 0) {
							local15[local17++] = local12.toLowerCase();
						}
						this.anInt901 = 0;
						label49: for (local26 = 0; local26 < Class19.anInt247; local26++) {
							@Pc(75) Class19 local75 = Class19.method191(local26);
							if (local75.anInt274 == -1 && local75.aString4 != null) {
								@Pc(86) String local86 = local75.aString4.toLowerCase();
								for (@Pc(88) int local88 = 0; local88 < local17; local88++) {
									if (local86.indexOf(local15[local88]) == -1) {
										continue label49;
									}
								}
								this.aStringArray8[this.anInt901] = local86;
								this.anIntArray216[this.anInt901] = local26;
								this.anInt901++;
								if (this.anInt901 >= this.aStringArray8.length) {
									return;
								}
							}
						}
						return;
					}
					@Pc(35) String local35 = local12.substring(0, local26).trim();
					if (local35.length() > 0) {
						local15[local17++] = local35.toLowerCase();
					}
					local12 = local12.substring(local26 + 1);
				}
			}
		} catch (@Pc(133) RuntimeException local133) {
			signlink.reporterror("45946, " + false + ", " + arg0 + ", " + local133.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "O", descriptor = "(I)V")
	private void method721(@OriginalArg(0) int arg0) {
		try {
			if (this.anInt858 != 0) {
				@Pc(5) int local5 = 0;
				@Pc(9) boolean local9 = false;
				if (this.anInt871 != 0) {
					local5 = 1;
				}
				for (@Pc(16) int local16 = 0; local16 < 100; local16++) {
					if (this.aStringArray13[local16] != null) {
						@Pc(28) int local28 = this.anIntArray264[local16];
						@Pc(33) String local33 = this.aStringArray12[local16];
						if (local33 != null && local33.startsWith("@cr1@")) {
							local33 = local33.substring(5);
						}
						if (local33 != null && local33.startsWith("@cr2@")) {
							local33 = local33.substring(5);
						}
						if ((local28 == 3 || local28 == 7) && (local28 == 7 || this.anInt1016 == 0 || this.anInt1016 == 1 && this.method713(local33))) {
							@Pc(86) int local86 = 329 - local5 * 13;
							if (super.anInt840 > 4 && super.anInt841 - 4 > local86 - 10 && super.anInt841 - 4 <= local86 + 3) {
								@Pc(125) int local125 = this.aClass8_Sub1_Sub2_Sub3_3.method449("From:  " + local33 + this.aStringArray13[local16]) + 25;
								if (local125 > 450) {
									local125 = 450;
								}
								if (super.anInt840 < local125 + 4) {
									if (this.anInt943 >= 1) {
										this.aStringArray14[this.anInt1025] = "Report abuse @whi@" + local33;
										this.anIntArray262[this.anInt1025] = 2702;
										this.anInt1025++;
									}
									this.aStringArray14[this.anInt1025] = "Add ignore @whi@" + local33;
									this.anIntArray262[this.anInt1025] = 2038;
									this.anInt1025++;
									this.aStringArray14[this.anInt1025] = "Add friend @whi@" + local33;
									this.anIntArray262[this.anInt1025] = 2294;
									this.anInt1025++;
								}
							}
							local5++;
							if (local5 >= 5) {
								return;
							}
						}
						if ((local28 == 5 || local28 == 6) && this.anInt1016 < 2) {
							local5++;
							if (local5 >= 5) {
								return;
							}
						}
					}
				}
			}
		} catch (@Pc(238) RuntimeException local238) {
			signlink.reporterror("52745, " + arg0 + ", " + local238.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
	@Override
	public AppletContext getAppletContext() {
		return signlink.mainapp == null ? super.getAppletContext() : signlink.mainapp.getAppletContext();
	}

	@OriginalMember(owner = "client!client", name = "getCodeBase", descriptor = "()Ljava/net/URL;")
	@Override
	public URL getCodeBase() {
		if (signlink.mainapp != null) {
			return signlink.mainapp.getCodeBase();
		}
		try {
			if (super.aFrame_Sub1_2 != null) {
				return new URL("http://127.0.0.1:" + (anInt1075 + 80));
			}
		} catch (@Pc(21) Exception local21) {
		}
		return super.getCodeBase();
	}

	@OriginalMember(owner = "client!client", name = "P", descriptor = "(I)V")
	private void method722() {
		try {
			if (super.anInt845 == 1) {
				if (super.anInt846 >= 6 && super.anInt846 <= 106 && super.anInt847 >= 467 && super.anInt847 <= 499) {
					this.anInt988 = (this.anInt988 + 1) % 4;
					this.aBoolean204 = true;
					this.aBoolean191 = true;
					this.aClass8_Sub1_Sub3_6.method141(222);
					this.aClass8_Sub1_Sub3_6.method142(this.anInt988);
					this.aClass8_Sub1_Sub3_6.method142(this.anInt1016);
					this.aClass8_Sub1_Sub3_6.method142(this.anInt976);
				}
				if (super.anInt846 >= 135 && super.anInt846 <= 235 && super.anInt847 >= 467 && super.anInt847 <= 499) {
					this.anInt1016 = (this.anInt1016 + 1) % 3;
					this.aBoolean204 = true;
					this.aBoolean191 = true;
					this.aClass8_Sub1_Sub3_6.method141(222);
					this.aClass8_Sub1_Sub3_6.method142(this.anInt988);
					this.aClass8_Sub1_Sub3_6.method142(this.anInt1016);
					this.aClass8_Sub1_Sub3_6.method142(this.anInt976);
				}
				if (super.anInt846 >= 273 && super.anInt846 <= 373 && super.anInt847 >= 467 && super.anInt847 <= 499) {
					this.anInt976 = (this.anInt976 + 1) % 3;
					this.aBoolean204 = true;
					this.aBoolean191 = true;
					this.aClass8_Sub1_Sub3_6.method141(222);
					this.aClass8_Sub1_Sub3_6.method142(this.anInt988);
					this.aClass8_Sub1_Sub3_6.method142(this.anInt1016);
					this.aClass8_Sub1_Sub3_6.method142(this.anInt976);
				}
				if (super.anInt846 >= 412 && super.anInt846 <= 512 && super.anInt847 >= 467 && super.anInt847 <= 499) {
					if (this.anInt1077 == -1) {
						this.method666();
						this.aString25 = "";
						this.aBoolean229 = false;
						this.anInt978 = this.anInt1077 = Class24.anInt413;
					} else {
						this.method694(0, "Please close the interface you have open before using 'report abuse'", "");
					}
				}
				anInt868++;
				if (anInt868 > 1392) {
					anInt868 = 0;
					this.aClass8_Sub1_Sub3_6.method141(92);
					this.aClass8_Sub1_Sub3_6.method142(0);
					@Pc(225) int local225 = this.aClass8_Sub1_Sub3_6.anInt239;
					if ((int) (Math.random() * 2.0D) == 0) {
						this.aClass8_Sub1_Sub3_6.method143(22162);
					}
					this.aClass8_Sub1_Sub3_6.method142(6);
					if ((int) (Math.random() * 2.0D) == 0) {
						this.aClass8_Sub1_Sub3_6.method143(23692);
					}
					this.aClass8_Sub1_Sub3_6.method143(43388);
					if ((int) (Math.random() * 2.0D) == 0) {
						this.aClass8_Sub1_Sub3_6.method142(88);
					}
					if ((int) (Math.random() * 2.0D) == 0) {
						this.aClass8_Sub1_Sub3_6.method142(231);
					}
					this.aClass8_Sub1_Sub3_6.method143((int) (Math.random() * 65536.0D));
					this.aClass8_Sub1_Sub3_6.method142(152);
					if ((int) (Math.random() * 2.0D) == 0) {
						this.aClass8_Sub1_Sub3_6.method143(14937);
					}
					this.aClass8_Sub1_Sub3_6.method143(64269);
					this.aClass8_Sub1_Sub3_6.method151(this.aClass8_Sub1_Sub3_6.anInt239 - local225);
					return;
				}
			}
		} catch (@Pc(304) RuntimeException local304) {
			signlink.reporterror("68693, " + -853 + ", " + local304.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!IUVBENCV;IB)V")
	private void method723(@OriginalArg(0) Class8_Sub1_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte arg2) {
		try {
			if (arg2 != 7) {
				this.anInt1045 = -1;
			}
			this.anInt851 = 0;
			this.anInt969 = 0;
			this.method630(arg1, arg0);
			this.method626(arg1, arg0, 869);
			this.method643(arg1, arg0);
			this.method685(arg0, arg1, 940);
			@Pc(42) int local42;
			for (@Pc(35) int local35 = 0; local35 < this.anInt851; local35++) {
				local42 = this.anIntArray212[local35];
				if (this.aClass8_Sub1_Sub1_Sub1_Sub2Array1[local42].anInt732 != anInt983) {
					this.aClass8_Sub1_Sub1_Sub1_Sub2Array1[local42] = null;
				}
			}
			if (arg0.anInt239 != arg1) {
				signlink.reporterror("Error packet size mismatch in getplayer pos:" + arg0.anInt239 + " psize:" + arg1);
				throw new RuntimeException("eek");
			}
			for (local42 = 0; local42 < this.anInt968; local42++) {
				if (this.aClass8_Sub1_Sub1_Sub1_Sub2Array1[this.anIntArray236[local42]] == null) {
					signlink.reporterror(this.aString27 + " null entry in pl list - pos:" + local42 + " size:" + this.anInt968);
					throw new RuntimeException("eek");
				}
			}
		} catch (@Pc(122) RuntimeException local122) {
			signlink.reporterror("70056, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local122.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "([BII)Z")
	private boolean method724(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		try {
			return arg0 == null ? true : signlink.wavesave(arg0, arg1);
		} catch (@Pc(17) RuntimeException local17) {
			signlink.reporterror("61317, " + arg0 + ", " + arg1 + ", " + -66 + ", " + local17.toString());
			throw new RuntimeException();
		}
	}
}
