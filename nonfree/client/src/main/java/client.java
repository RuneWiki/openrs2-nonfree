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
	private static int anInt828;

	@OriginalMember(owner = "client!client", name = "Z", descriptor = "I")
	private static int anInt829;

	@OriginalMember(owner = "client!client", name = "ab", descriptor = "I")
	private static int anInt830;

	@OriginalMember(owner = "client!client", name = "Yb", descriptor = "I")
	private static int anInt851;

	@OriginalMember(owner = "client!client", name = "bc", descriptor = "Lclient!SOKVSBIO;")
	public static Class2_Sub1_Sub1_Sub4_Sub2 aClass2_Sub1_Sub1_Sub4_Sub2_1;

	@OriginalMember(owner = "client!client", name = "Zc", descriptor = "I")
	public static int anInt878;

	@OriginalMember(owner = "client!client", name = "ad", descriptor = "I")
	private static int anInt879;

	@OriginalMember(owner = "client!client", name = "rd", descriptor = "I")
	private static int anInt892;

	@OriginalMember(owner = "client!client", name = "Pd", descriptor = "I")
	public static int anInt907;

	@OriginalMember(owner = "client!client", name = "Rd", descriptor = "Z")
	private static boolean aBoolean197;

	@OriginalMember(owner = "client!client", name = "Yd", descriptor = "I")
	private static int anInt913;

	@OriginalMember(owner = "client!client", name = "Ie", descriptor = "I")
	private static int anInt925;

	@OriginalMember(owner = "client!client", name = "Le", descriptor = "I")
	private static int anInt928;

	@OriginalMember(owner = "client!client", name = "qf", descriptor = "I")
	private static int anInt946;

	@OriginalMember(owner = "client!client", name = "sf", descriptor = "Z")
	private static boolean aBoolean200;

	@OriginalMember(owner = "client!client", name = "Sf", descriptor = "I")
	private static int anInt954;

	@OriginalMember(owner = "client!client", name = "ig", descriptor = "I")
	private static int anInt963;

	@OriginalMember(owner = "client!client", name = "bh", descriptor = "I")
	private static int anInt978;

	@OriginalMember(owner = "client!client", name = "mi", descriptor = "I")
	private static int anInt1004;

	@OriginalMember(owner = "client!client", name = "oi", descriptor = "Z")
	private static boolean aBoolean216;

	@OriginalMember(owner = "client!client", name = "si", descriptor = "I")
	private static int anInt1005;

	@OriginalMember(owner = "client!client", name = "yi", descriptor = "I")
	private static int anInt1009;

	@OriginalMember(owner = "client!client", name = "dj", descriptor = "I")
	private static int anInt1018;

	@OriginalMember(owner = "client!client", name = "hj", descriptor = "I")
	private static int anInt1019;

	@OriginalMember(owner = "client!client", name = "jj", descriptor = "Z")
	private static boolean aBoolean222;

	@OriginalMember(owner = "client!client", name = "yj", descriptor = "I")
	private static int anInt1026;

	@OriginalMember(owner = "client!client", name = "Oj", descriptor = "I")
	private static int anInt1031;

	@OriginalMember(owner = "client!client", name = "pk", descriptor = "I")
	private static int anInt1046;

	@OriginalMember(owner = "client!client", name = "hc", descriptor = "B")
	private static byte aByte34 = 3;

	@OriginalMember(owner = "client!client", name = "Cc", descriptor = "[[I")
	public static final int[][] anIntArrayArray23 = new int[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, 33697, 22433, 2983, 54193 }, { 8741, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003, 25239 }, { 25238, 8742, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };

	@OriginalMember(owner = "client!client", name = "Ec", descriptor = "I")
	private static int anInt864 = 38046;

	@OriginalMember(owner = "client!client", name = "Mc", descriptor = "I")
	private static int anInt868 = -597;

	@OriginalMember(owner = "client!client", name = "Od", descriptor = "I")
	private static int anInt906 = 10;

	@OriginalMember(owner = "client!client", name = "Qd", descriptor = "Z")
	private static boolean aBoolean196 = true;

	@OriginalMember(owner = "client!client", name = "de", descriptor = "B")
	private static byte aByte36 = 91;

	@OriginalMember(owner = "client!client", name = "lf", descriptor = "B")
	private static byte aByte39 = 4;

	@OriginalMember(owner = "client!client", name = "uf", descriptor = "Ljava/math/BigInteger;")
	private static BigInteger aBigInteger1 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");

	@OriginalMember(owner = "client!client", name = "vf", descriptor = "[I")
	public static final int[] anIntArray240 = new int[] { 9104, 10275, 7595, 3610, 7975, 8526, 918, 38802, 24466, 10145, 58654, 5027, 1457, 16565, 34991, 25486 };

	@OriginalMember(owner = "client!client", name = "xf", descriptor = "[I")
	private static int[] anIntArray241 = new int[99];

	@OriginalMember(owner = "client!client", name = "vg", descriptor = "B")
	private static byte aByte42;

	@OriginalMember(owner = "client!client", name = "Ii", descriptor = "Z")
	private static boolean aBoolean219;

	@OriginalMember(owner = "client!client", name = "qj", descriptor = "I")
	private static int anInt1024;

	@OriginalMember(owner = "client!client", name = "Nj", descriptor = "Ljava/math/BigInteger;")
	private static BigInteger aBigInteger2;

	@OriginalMember(owner = "client!client", name = "Xj", descriptor = "Ljava/lang/String;")
	private static String aString31;

	@OriginalMember(owner = "client!client", name = "gk", descriptor = "[I")
	public static int[] anIntArray276;

	@OriginalMember(owner = "client!client", name = "O", descriptor = "I")
	private int anInt822;

	@OriginalMember(owner = "client!client", name = "P", descriptor = "I")
	private int anInt823;

	@OriginalMember(owner = "client!client", name = "Q", descriptor = "I")
	private int anInt824;

	@OriginalMember(owner = "client!client", name = "R", descriptor = "I")
	private int anInt825;

	@OriginalMember(owner = "client!client", name = "T", descriptor = "I")
	private int anInt826;

	@OriginalMember(owner = "client!client", name = "W", descriptor = "I")
	private int anInt827;

	@OriginalMember(owner = "client!client", name = "cb", descriptor = "I")
	private int anInt832;

	@OriginalMember(owner = "client!client", name = "fb", descriptor = "I")
	private int anInt833;

	@OriginalMember(owner = "client!client", name = "gb", descriptor = "I")
	private int anInt834;

	@OriginalMember(owner = "client!client", name = "jb", descriptor = "I")
	private int anInt836;

	@OriginalMember(owner = "client!client", name = "kb", descriptor = "I")
	private int anInt837;

	@OriginalMember(owner = "client!client", name = "lb", descriptor = "Lclient!EBLTOQBO;")
	private Class8_Sub1 aClass8_Sub1_1;

	@OriginalMember(owner = "client!client", name = "mb", descriptor = "I")
	private int anInt838;

	@OriginalMember(owner = "client!client", name = "nb", descriptor = "I")
	private int anInt839;

	@OriginalMember(owner = "client!client", name = "ob", descriptor = "I")
	private int anInt840;

	@OriginalMember(owner = "client!client", name = "pb", descriptor = "I")
	private int anInt841;

	@OriginalMember(owner = "client!client", name = "qb", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray7;

	@OriginalMember(owner = "client!client", name = "rb", descriptor = "I")
	private int anInt842;

	@OriginalMember(owner = "client!client", name = "yb", descriptor = "Lclient!ZQSBFHWZ;")
	private Class2_Sub1_Sub2_Sub3 aClass2_Sub1_Sub2_Sub3_1;

	@OriginalMember(owner = "client!client", name = "zb", descriptor = "Lclient!ZQSBFHWZ;")
	private Class2_Sub1_Sub2_Sub3 aClass2_Sub1_Sub2_Sub3_2;

	@OriginalMember(owner = "client!client", name = "Ab", descriptor = "Lclient!ZQSBFHWZ;")
	private Class2_Sub1_Sub2_Sub3 aClass2_Sub1_Sub2_Sub3_3;

	@OriginalMember(owner = "client!client", name = "Bb", descriptor = "Lclient!ZQSBFHWZ;")
	private Class2_Sub1_Sub2_Sub3 aClass2_Sub1_Sub2_Sub3_4;

	@OriginalMember(owner = "client!client", name = "Cb", descriptor = "Lclient!ZQSBFHWZ;")
	private Class2_Sub1_Sub2_Sub3 aClass2_Sub1_Sub2_Sub3_5;

	@OriginalMember(owner = "client!client", name = "Gb", descriptor = "I")
	private int anInt844;

	@OriginalMember(owner = "client!client", name = "Qb", descriptor = "I")
	private int anInt846;

	@OriginalMember(owner = "client!client", name = "Tb", descriptor = "I")
	private int anInt848;

	@OriginalMember(owner = "client!client", name = "Ub", descriptor = "I")
	private int anInt849;

	@OriginalMember(owner = "client!client", name = "Vb", descriptor = "Lclient!ZQSBFHWZ;")
	private Class2_Sub1_Sub2_Sub3 aClass2_Sub1_Sub2_Sub3_6;

	@OriginalMember(owner = "client!client", name = "Wb", descriptor = "Lclient!ZQSBFHWZ;")
	private Class2_Sub1_Sub2_Sub3 aClass2_Sub1_Sub2_Sub3_7;

	@OriginalMember(owner = "client!client", name = "Xb", descriptor = "I")
	private int anInt850;

	@OriginalMember(owner = "client!client", name = "dc", descriptor = "I")
	private int anInt853;

	@OriginalMember(owner = "client!client", name = "ec", descriptor = "J")
	private long aLong29;

	@OriginalMember(owner = "client!client", name = "ic", descriptor = "Ljava/lang/String;")
	private String aString20;

	@OriginalMember(owner = "client!client", name = "jc", descriptor = "I")
	private int anInt855;

	@OriginalMember(owner = "client!client", name = "kc", descriptor = "[I")
	private int[] anIntArray222;

	@OriginalMember(owner = "client!client", name = "lc", descriptor = "[I")
	private int[] anIntArray223;

	@OriginalMember(owner = "client!client", name = "mc", descriptor = "[I")
	private int[] anIntArray224;

	@OriginalMember(owner = "client!client", name = "nc", descriptor = "[I")
	private int[] anIntArray225;

	@OriginalMember(owner = "client!client", name = "uc", descriptor = "I")
	private int anInt859;

	@OriginalMember(owner = "client!client", name = "vc", descriptor = "I")
	private int anInt860;

	@OriginalMember(owner = "client!client", name = "wc", descriptor = "I")
	private int anInt861;

	@OriginalMember(owner = "client!client", name = "xc", descriptor = "I")
	private int anInt862;

	@OriginalMember(owner = "client!client", name = "Bc", descriptor = "J")
	private long aLong30;

	@OriginalMember(owner = "client!client", name = "Hc", descriptor = "[[[B")
	private byte[][][] aByteArrayArrayArray8;

	@OriginalMember(owner = "client!client", name = "Jc", descriptor = "I")
	private int anInt866;

	@OriginalMember(owner = "client!client", name = "Nc", descriptor = "I")
	private int anInt869;

	@OriginalMember(owner = "client!client", name = "Oc", descriptor = "I")
	private int anInt870;

	@OriginalMember(owner = "client!client", name = "Pc", descriptor = "I")
	private int anInt871;

	@OriginalMember(owner = "client!client", name = "Qc", descriptor = "I")
	private int anInt872;

	@OriginalMember(owner = "client!client", name = "Rc", descriptor = "I")
	private int anInt873;

	@OriginalMember(owner = "client!client", name = "Tc", descriptor = "I")
	private int anInt874;

	@OriginalMember(owner = "client!client", name = "Uc", descriptor = "I")
	private int anInt875;

	@OriginalMember(owner = "client!client", name = "Vc", descriptor = "I")
	private int anInt876;

	@OriginalMember(owner = "client!client", name = "Wc", descriptor = "I")
	private int anInt877;

	@OriginalMember(owner = "client!client", name = "bd", descriptor = "Lclient!RHXAQRFP;")
	private Class34 aClass34_1;

	@OriginalMember(owner = "client!client", name = "ed", descriptor = "I")
	private int anInt881;

	@OriginalMember(owner = "client!client", name = "hd", descriptor = "I")
	private int anInt884;

	@OriginalMember(owner = "client!client", name = "id", descriptor = "I")
	private int anInt885;

	@OriginalMember(owner = "client!client", name = "jd", descriptor = "I")
	private int anInt886;

	@OriginalMember(owner = "client!client", name = "kd", descriptor = "I")
	private int anInt887;

	@OriginalMember(owner = "client!client", name = "ld", descriptor = "Ljava/lang/String;")
	private String aString21;

	@OriginalMember(owner = "client!client", name = "md", descriptor = "I")
	private int anInt888;

	@OriginalMember(owner = "client!client", name = "nd", descriptor = "I")
	private int anInt889;

	@OriginalMember(owner = "client!client", name = "od", descriptor = "I")
	private int anInt890;

	@OriginalMember(owner = "client!client", name = "pd", descriptor = "Ljava/lang/String;")
	private String aString22;

	@OriginalMember(owner = "client!client", name = "qd", descriptor = "I")
	private int anInt891;

	@OriginalMember(owner = "client!client", name = "sd", descriptor = "I")
	private int anInt893;

	@OriginalMember(owner = "client!client", name = "vd", descriptor = "Lclient!VZJVQLEE;")
	private Class2_Sub1_Sub2_Sub2 aClass2_Sub1_Sub2_Sub2_3;

	@OriginalMember(owner = "client!client", name = "yd", descriptor = "I")
	private int anInt894;

	@OriginalMember(owner = "client!client", name = "zd", descriptor = "I")
	private int anInt895;

	@OriginalMember(owner = "client!client", name = "Ad", descriptor = "I")
	private int anInt896;

	@OriginalMember(owner = "client!client", name = "Bd", descriptor = "I")
	private int anInt897;

	@OriginalMember(owner = "client!client", name = "Cd", descriptor = "I")
	private int anInt898;

	@OriginalMember(owner = "client!client", name = "Dd", descriptor = "I")
	private int anInt899;

	@OriginalMember(owner = "client!client", name = "Hd", descriptor = "I")
	private int anInt902;

	@OriginalMember(owner = "client!client", name = "Jd", descriptor = "I")
	private int anInt903;

	@OriginalMember(owner = "client!client", name = "Md", descriptor = "I")
	private int anInt904;

	@OriginalMember(owner = "client!client", name = "Nd", descriptor = "I")
	private int anInt905;

	@OriginalMember(owner = "client!client", name = "Td", descriptor = "I")
	private int anInt909;

	@OriginalMember(owner = "client!client", name = "Ud", descriptor = "I")
	private int anInt910;

	@OriginalMember(owner = "client!client", name = "Vd", descriptor = "I")
	private int anInt911;

	@OriginalMember(owner = "client!client", name = "Wd", descriptor = "Lclient!VZJVQLEE;")
	private Class2_Sub1_Sub2_Sub2 aClass2_Sub1_Sub2_Sub2_4;

	@OriginalMember(owner = "client!client", name = "Xd", descriptor = "I")
	private int anInt912;

	@OriginalMember(owner = "client!client", name = "Zd", descriptor = "I")
	private int anInt914;

	@OriginalMember(owner = "client!client", name = "ae", descriptor = "Ljava/net/Socket;")
	private Socket aSocket3;

	@OriginalMember(owner = "client!client", name = "be", descriptor = "I")
	private int anInt915;

	@OriginalMember(owner = "client!client", name = "fe", descriptor = "Lclient!NIUUCTKL;")
	private Class26 aClass26_2;

	@OriginalMember(owner = "client!client", name = "ge", descriptor = "I")
	private int anInt917;

	@OriginalMember(owner = "client!client", name = "he", descriptor = "I")
	private int anInt918;

	@OriginalMember(owner = "client!client", name = "ke", descriptor = "I")
	private int anInt919;

	@OriginalMember(owner = "client!client", name = "le", descriptor = "I")
	private int anInt920;

	@OriginalMember(owner = "client!client", name = "oe", descriptor = "Lclient!HURULSIZ;")
	private Class17 aClass17_3;

	@OriginalMember(owner = "client!client", name = "pe", descriptor = "Lclient!HURULSIZ;")
	private Class17 aClass17_4;

	@OriginalMember(owner = "client!client", name = "qe", descriptor = "Lclient!HURULSIZ;")
	private Class17 aClass17_5;

	@OriginalMember(owner = "client!client", name = "re", descriptor = "Lclient!HURULSIZ;")
	private Class17 aClass17_6;

	@OriginalMember(owner = "client!client", name = "se", descriptor = "Lclient!HURULSIZ;")
	private Class17 aClass17_7;

	@OriginalMember(owner = "client!client", name = "te", descriptor = "Lclient!HURULSIZ;")
	private Class17 aClass17_8;

	@OriginalMember(owner = "client!client", name = "ue", descriptor = "Lclient!HURULSIZ;")
	private Class17 aClass17_9;

	@OriginalMember(owner = "client!client", name = "ve", descriptor = "Lclient!HURULSIZ;")
	private Class17 aClass17_10;

	@OriginalMember(owner = "client!client", name = "we", descriptor = "Lclient!HURULSIZ;")
	private Class17 aClass17_11;

	@OriginalMember(owner = "client!client", name = "xe", descriptor = "Lclient!VZJVQLEE;")
	private Class2_Sub1_Sub2_Sub2 aClass2_Sub1_Sub2_Sub2_5;

	@OriginalMember(owner = "client!client", name = "ye", descriptor = "Lclient!VZJVQLEE;")
	private Class2_Sub1_Sub2_Sub2 aClass2_Sub1_Sub2_Sub2_6;

	@OriginalMember(owner = "client!client", name = "Fe", descriptor = "I")
	private int anInt922;

	@OriginalMember(owner = "client!client", name = "Je", descriptor = "I")
	private int anInt926;

	@OriginalMember(owner = "client!client", name = "Ke", descriptor = "I")
	private int anInt927;

	@OriginalMember(owner = "client!client", name = "Me", descriptor = "I")
	private int anInt929;

	@OriginalMember(owner = "client!client", name = "Ne", descriptor = "Lclient!VZJVQLEE;")
	private Class2_Sub1_Sub2_Sub2 aClass2_Sub1_Sub2_Sub2_7;

	@OriginalMember(owner = "client!client", name = "Oe", descriptor = "[I")
	private int[] anIntArray237;

	@OriginalMember(owner = "client!client", name = "Pe", descriptor = "[I")
	private int[] anIntArray238;

	@OriginalMember(owner = "client!client", name = "Qe", descriptor = "I")
	private int anInt930;

	@OriginalMember(owner = "client!client", name = "Se", descriptor = "Lclient!ZQSBFHWZ;")
	private Class2_Sub1_Sub2_Sub3 aClass2_Sub1_Sub2_Sub3_8;

	@OriginalMember(owner = "client!client", name = "Te", descriptor = "Lclient!ZQSBFHWZ;")
	private Class2_Sub1_Sub2_Sub3 aClass2_Sub1_Sub2_Sub3_9;

	@OriginalMember(owner = "client!client", name = "Ue", descriptor = "Lclient!ZQSBFHWZ;")
	private Class2_Sub1_Sub2_Sub3 aClass2_Sub1_Sub2_Sub3_10;

	@OriginalMember(owner = "client!client", name = "Ve", descriptor = "I")
	private int anInt932;

	@OriginalMember(owner = "client!client", name = "We", descriptor = "I")
	private int anInt933;

	@OriginalMember(owner = "client!client", name = "Xe", descriptor = "I")
	private int anInt934;

	@OriginalMember(owner = "client!client", name = "Ye", descriptor = "I")
	private int anInt935;

	@OriginalMember(owner = "client!client", name = "Ze", descriptor = "I")
	private int anInt936;

	@OriginalMember(owner = "client!client", name = "af", descriptor = "I")
	private int anInt937;

	@OriginalMember(owner = "client!client", name = "bf", descriptor = "I")
	private int anInt938;

	@OriginalMember(owner = "client!client", name = "ff", descriptor = "I")
	private int anInt940;

	@OriginalMember(owner = "client!client", name = "gf", descriptor = "I")
	private int anInt941;

	@OriginalMember(owner = "client!client", name = "hf", descriptor = "I")
	private int anInt942;

	@OriginalMember(owner = "client!client", name = "jf", descriptor = "I")
	private int anInt943;

	@OriginalMember(owner = "client!client", name = "mf", descriptor = "I")
	private int anInt945;

	@OriginalMember(owner = "client!client", name = "of", descriptor = "Lclient!ZQSBFHWZ;")
	private Class2_Sub1_Sub2_Sub3 aClass2_Sub1_Sub2_Sub3_11;

	@OriginalMember(owner = "client!client", name = "pf", descriptor = "Lclient!ZQSBFHWZ;")
	private Class2_Sub1_Sub2_Sub3 aClass2_Sub1_Sub2_Sub3_12;

	@OriginalMember(owner = "client!client", name = "rf", descriptor = "I")
	private int anInt947;

	@OriginalMember(owner = "client!client", name = "wf", descriptor = "Ljava/lang/String;")
	private String aString24;

	@OriginalMember(owner = "client!client", name = "Bf", descriptor = "I")
	private int anInt950;

	@OriginalMember(owner = "client!client", name = "Gf", descriptor = "J")
	private long aLong31;

	@OriginalMember(owner = "client!client", name = "If", descriptor = "I")
	private int anInt952;

	@OriginalMember(owner = "client!client", name = "Kf", descriptor = "Lclient!GBBCHPEB;")
	private Class14 aClass14_1;

	@OriginalMember(owner = "client!client", name = "Mf", descriptor = "[I")
	private int[] anIntArray243;

	@OriginalMember(owner = "client!client", name = "Nf", descriptor = "[I")
	private int[] anIntArray244;

	@OriginalMember(owner = "client!client", name = "Qf", descriptor = "I")
	private int anInt953;

	@OriginalMember(owner = "client!client", name = "Tf", descriptor = "I")
	private int anInt955;

	@OriginalMember(owner = "client!client", name = "Xf", descriptor = "I")
	private int anInt956;

	@OriginalMember(owner = "client!client", name = "Zf", descriptor = "I")
	private int anInt957;

	@OriginalMember(owner = "client!client", name = "ag", descriptor = "I")
	private int anInt958;

	@OriginalMember(owner = "client!client", name = "bg", descriptor = "I")
	private int anInt959;

	@OriginalMember(owner = "client!client", name = "fg", descriptor = "I")
	private int anInt962;

	@OriginalMember(owner = "client!client", name = "lg", descriptor = "I")
	private int anInt964;

	@OriginalMember(owner = "client!client", name = "Ag", descriptor = "I")
	private int anInt967;

	@OriginalMember(owner = "client!client", name = "Cg", descriptor = "I")
	private int anInt968;

	@OriginalMember(owner = "client!client", name = "Fg", descriptor = "I")
	private int anInt971;

	@OriginalMember(owner = "client!client", name = "Gg", descriptor = "I")
	private int anInt972;

	@OriginalMember(owner = "client!client", name = "Ig", descriptor = "Lclient!VZJVQLEE;")
	private Class2_Sub1_Sub2_Sub2 aClass2_Sub1_Sub2_Sub2_8;

	@OriginalMember(owner = "client!client", name = "Jg", descriptor = "Lclient!VZJVQLEE;")
	private Class2_Sub1_Sub2_Sub2 aClass2_Sub1_Sub2_Sub2_9;

	@OriginalMember(owner = "client!client", name = "Lg", descriptor = "I")
	private int anInt973;

	@OriginalMember(owner = "client!client", name = "Rg", descriptor = "I")
	private int anInt975;

	@OriginalMember(owner = "client!client", name = "Vg", descriptor = "I")
	private int anInt976;

	@OriginalMember(owner = "client!client", name = "Wg", descriptor = "I")
	private int anInt977;

	@OriginalMember(owner = "client!client", name = "Zg", descriptor = "[[B")
	private byte[][] aByteArrayArray5;

	@OriginalMember(owner = "client!client", name = "ah", descriptor = "Lclient!VZJVQLEE;")
	private Class2_Sub1_Sub2_Sub2 aClass2_Sub1_Sub2_Sub2_10;

	@OriginalMember(owner = "client!client", name = "ch", descriptor = "I")
	private int anInt979;

	@OriginalMember(owner = "client!client", name = "dh", descriptor = "I")
	private int anInt980;

	@OriginalMember(owner = "client!client", name = "eh", descriptor = "I")
	private int anInt981;

	@OriginalMember(owner = "client!client", name = "fh", descriptor = "I")
	private int anInt982;

	@OriginalMember(owner = "client!client", name = "gh", descriptor = "I")
	private int anInt983;

	@OriginalMember(owner = "client!client", name = "kh", descriptor = "I")
	private int anInt984;

	@OriginalMember(owner = "client!client", name = "nh", descriptor = "I")
	private int anInt985;

	@OriginalMember(owner = "client!client", name = "ph", descriptor = "I")
	private int anInt986;

	@OriginalMember(owner = "client!client", name = "sh", descriptor = "I")
	private int anInt988;

	@OriginalMember(owner = "client!client", name = "th", descriptor = "I")
	private int anInt989;

	@OriginalMember(owner = "client!client", name = "uh", descriptor = "I")
	private int anInt990;

	@OriginalMember(owner = "client!client", name = "vh", descriptor = "I")
	private int anInt991;

	@OriginalMember(owner = "client!client", name = "yh", descriptor = "I")
	private int anInt992;

	@OriginalMember(owner = "client!client", name = "Ah", descriptor = "I")
	private int anInt993;

	@OriginalMember(owner = "client!client", name = "Bh", descriptor = "I")
	private int anInt994;

	@OriginalMember(owner = "client!client", name = "Dh", descriptor = "Lclient!ZQSBFHWZ;")
	private Class2_Sub1_Sub2_Sub3 aClass2_Sub1_Sub2_Sub3_13;

	@OriginalMember(owner = "client!client", name = "Eh", descriptor = "Lclient!ZQSBFHWZ;")
	private Class2_Sub1_Sub2_Sub3 aClass2_Sub1_Sub2_Sub3_14;

	@OriginalMember(owner = "client!client", name = "Fh", descriptor = "Lclient!ZQSBFHWZ;")
	private Class2_Sub1_Sub2_Sub3 aClass2_Sub1_Sub2_Sub3_15;

	@OriginalMember(owner = "client!client", name = "Hh", descriptor = "Lclient!VZJVQLEE;")
	private Class2_Sub1_Sub2_Sub2 aClass2_Sub1_Sub2_Sub2_11;

	@OriginalMember(owner = "client!client", name = "Ih", descriptor = "Lclient!VZJVQLEE;")
	private Class2_Sub1_Sub2_Sub2 aClass2_Sub1_Sub2_Sub2_12;

	@OriginalMember(owner = "client!client", name = "Jh", descriptor = "Lclient!VZJVQLEE;")
	private Class2_Sub1_Sub2_Sub2 aClass2_Sub1_Sub2_Sub2_13;

	@OriginalMember(owner = "client!client", name = "Kh", descriptor = "Lclient!VZJVQLEE;")
	private Class2_Sub1_Sub2_Sub2 aClass2_Sub1_Sub2_Sub2_14;

	@OriginalMember(owner = "client!client", name = "Lh", descriptor = "Lclient!VZJVQLEE;")
	private Class2_Sub1_Sub2_Sub2 aClass2_Sub1_Sub2_Sub2_15;

	@OriginalMember(owner = "client!client", name = "Nh", descriptor = "I")
	private int anInt995;

	@OriginalMember(owner = "client!client", name = "Oh", descriptor = "I")
	private int anInt996;

	@OriginalMember(owner = "client!client", name = "Ph", descriptor = "I")
	private int anInt997;

	@OriginalMember(owner = "client!client", name = "Uh", descriptor = "Lclient!HURULSIZ;")
	private Class17 aClass17_12;

	@OriginalMember(owner = "client!client", name = "Vh", descriptor = "Lclient!HURULSIZ;")
	private Class17 aClass17_13;

	@OriginalMember(owner = "client!client", name = "Wh", descriptor = "Lclient!HURULSIZ;")
	private Class17 aClass17_14;

	@OriginalMember(owner = "client!client", name = "Xh", descriptor = "Lclient!HURULSIZ;")
	private Class17 aClass17_15;

	@OriginalMember(owner = "client!client", name = "Yh", descriptor = "Lclient!HURULSIZ;")
	private Class17 aClass17_16;

	@OriginalMember(owner = "client!client", name = "Zh", descriptor = "Lclient!HURULSIZ;")
	private Class17 aClass17_17;

	@OriginalMember(owner = "client!client", name = "ai", descriptor = "Lclient!HURULSIZ;")
	private Class17 aClass17_18;

	@OriginalMember(owner = "client!client", name = "bi", descriptor = "Lclient!HURULSIZ;")
	private Class17 aClass17_19;

	@OriginalMember(owner = "client!client", name = "ci", descriptor = "Lclient!HURULSIZ;")
	private Class17 aClass17_20;

	@OriginalMember(owner = "client!client", name = "fi", descriptor = "Lclient!FDKYSOCX;")
	private Class12 aClass12_1;

	@OriginalMember(owner = "client!client", name = "gi", descriptor = "I")
	private int anInt998;

	@OriginalMember(owner = "client!client", name = "hi", descriptor = "I")
	private int anInt999;

	@OriginalMember(owner = "client!client", name = "ii", descriptor = "I")
	private int anInt1000;

	@OriginalMember(owner = "client!client", name = "ji", descriptor = "I")
	private int anInt1001;

	@OriginalMember(owner = "client!client", name = "ki", descriptor = "I")
	private int anInt1002;

	@OriginalMember(owner = "client!client", name = "vi", descriptor = "I")
	private int anInt1007;

	@OriginalMember(owner = "client!client", name = "wi", descriptor = "I")
	private int anInt1008;

	@OriginalMember(owner = "client!client", name = "zi", descriptor = "I")
	private int anInt1010;

	@OriginalMember(owner = "client!client", name = "Di", descriptor = "Lclient!HURULSIZ;")
	private Class17 aClass17_21;

	@OriginalMember(owner = "client!client", name = "Ei", descriptor = "Lclient!HURULSIZ;")
	private Class17 aClass17_22;

	@OriginalMember(owner = "client!client", name = "Fi", descriptor = "Lclient!HURULSIZ;")
	private Class17 aClass17_23;

	@OriginalMember(owner = "client!client", name = "Gi", descriptor = "Lclient!HURULSIZ;")
	private Class17 aClass17_24;

	@OriginalMember(owner = "client!client", name = "Ji", descriptor = "I")
	private int anInt1011;

	@OriginalMember(owner = "client!client", name = "Ki", descriptor = "I")
	private int anInt1012;

	@OriginalMember(owner = "client!client", name = "Ni", descriptor = "Lclient!ZTYSAOXK;")
	private Class2_Sub1_Sub2_Sub4 aClass2_Sub1_Sub2_Sub4_2;

	@OriginalMember(owner = "client!client", name = "Oi", descriptor = "Lclient!ZTYSAOXK;")
	private Class2_Sub1_Sub2_Sub4 aClass2_Sub1_Sub2_Sub4_3;

	@OriginalMember(owner = "client!client", name = "Pi", descriptor = "Lclient!ZTYSAOXK;")
	private Class2_Sub1_Sub2_Sub4 aClass2_Sub1_Sub2_Sub4_4;

	@OriginalMember(owner = "client!client", name = "Qi", descriptor = "Lclient!ZTYSAOXK;")
	private Class2_Sub1_Sub2_Sub4 aClass2_Sub1_Sub2_Sub4_5;

	@OriginalMember(owner = "client!client", name = "Ui", descriptor = "Lclient!ZQSBFHWZ;")
	private Class2_Sub1_Sub2_Sub3 aClass2_Sub1_Sub2_Sub3_16;

	@OriginalMember(owner = "client!client", name = "Vi", descriptor = "Lclient!ZQSBFHWZ;")
	private Class2_Sub1_Sub2_Sub3 aClass2_Sub1_Sub2_Sub3_17;

	@OriginalMember(owner = "client!client", name = "Wi", descriptor = "Lclient!ZQSBFHWZ;")
	private Class2_Sub1_Sub2_Sub3 aClass2_Sub1_Sub2_Sub3_18;

	@OriginalMember(owner = "client!client", name = "Xi", descriptor = "Lclient!ZQSBFHWZ;")
	private Class2_Sub1_Sub2_Sub3 aClass2_Sub1_Sub2_Sub3_19;

	@OriginalMember(owner = "client!client", name = "Yi", descriptor = "Lclient!ZQSBFHWZ;")
	private Class2_Sub1_Sub2_Sub3 aClass2_Sub1_Sub2_Sub3_20;

	@OriginalMember(owner = "client!client", name = "Zi", descriptor = "I")
	private int anInt1016;

	@OriginalMember(owner = "client!client", name = "aj", descriptor = "I")
	private int anInt1017;

	@OriginalMember(owner = "client!client", name = "bj", descriptor = "[[B")
	private byte[][] aByteArrayArray6;

	@OriginalMember(owner = "client!client", name = "ej", descriptor = "Lclient!VZJVQLEE;")
	private Class2_Sub1_Sub2_Sub2 aClass2_Sub1_Sub2_Sub2_16;

	@OriginalMember(owner = "client!client", name = "fj", descriptor = "Lclient!VZJVQLEE;")
	private Class2_Sub1_Sub2_Sub2 aClass2_Sub1_Sub2_Sub2_17;

	@OriginalMember(owner = "client!client", name = "ij", descriptor = "J")
	private long aLong32;

	@OriginalMember(owner = "client!client", name = "kj", descriptor = "I")
	private int anInt1020;

	@OriginalMember(owner = "client!client", name = "oj", descriptor = "Lclient!FUZJMGZB;")
	private Class13 aClass13_2;

	@OriginalMember(owner = "client!client", name = "pj", descriptor = "I")
	private int anInt1023;

	@OriginalMember(owner = "client!client", name = "rj", descriptor = "Lclient!HURULSIZ;")
	private Class17 aClass17_25;

	@OriginalMember(owner = "client!client", name = "sj", descriptor = "Lclient!HURULSIZ;")
	private Class17 aClass17_26;

	@OriginalMember(owner = "client!client", name = "tj", descriptor = "Lclient!HURULSIZ;")
	private Class17 aClass17_27;

	@OriginalMember(owner = "client!client", name = "wj", descriptor = "I")
	private int anInt1025;

	@OriginalMember(owner = "client!client", name = "xj", descriptor = "J")
	private long aLong33;

	@OriginalMember(owner = "client!client", name = "zj", descriptor = "I")
	private int anInt1027;

	@OriginalMember(owner = "client!client", name = "Aj", descriptor = "[Lclient!ZQSBFHWZ;")
	private Class2_Sub1_Sub2_Sub3[] aClass2_Sub1_Sub2_Sub3Array5;

	@OriginalMember(owner = "client!client", name = "Cj", descriptor = "I")
	private int anInt1028;

	@OriginalMember(owner = "client!client", name = "Dj", descriptor = "I")
	private int anInt1029;

	@OriginalMember(owner = "client!client", name = "Ej", descriptor = "[I")
	private int[] anIntArray265;

	@OriginalMember(owner = "client!client", name = "Fj", descriptor = "[I")
	private int[] anIntArray266;

	@OriginalMember(owner = "client!client", name = "Gj", descriptor = "[I")
	private int[] anIntArray267;

	@OriginalMember(owner = "client!client", name = "Hj", descriptor = "[I")
	private int[] anIntArray268;

	@OriginalMember(owner = "client!client", name = "Jj", descriptor = "[I")
	private int[] anIntArray269;

	@OriginalMember(owner = "client!client", name = "Kj", descriptor = "[I")
	private int[] anIntArray270;

	@OriginalMember(owner = "client!client", name = "Lj", descriptor = "[I")
	private int[] anIntArray271;

	@OriginalMember(owner = "client!client", name = "Mj", descriptor = "I")
	private int anInt1030;

	@OriginalMember(owner = "client!client", name = "Rj", descriptor = "I")
	private int anInt1032;

	@OriginalMember(owner = "client!client", name = "Tj", descriptor = "I")
	private int anInt1034;

	@OriginalMember(owner = "client!client", name = "Vj", descriptor = "I")
	private int anInt1035;

	@OriginalMember(owner = "client!client", name = "Zj", descriptor = "I")
	private int anInt1036;

	@OriginalMember(owner = "client!client", name = "ck", descriptor = "I")
	private int anInt1037;

	@OriginalMember(owner = "client!client", name = "jk", descriptor = "I")
	private int anInt1040;

	@OriginalMember(owner = "client!client", name = "kk", descriptor = "I")
	private int anInt1041;

	@OriginalMember(owner = "client!client", name = "lk", descriptor = "I")
	private int anInt1042;

	@OriginalMember(owner = "client!client", name = "mk", descriptor = "I")
	private int anInt1043;

	@OriginalMember(owner = "client!client", name = "nk", descriptor = "I")
	private int anInt1044;

	@OriginalMember(owner = "client!client", name = "ok", descriptor = "I")
	private int anInt1045;

	@OriginalMember(owner = "client!client", name = "rk", descriptor = "I")
	private int anInt1047;

	@OriginalMember(owner = "client!client", name = "sk", descriptor = "I")
	private int anInt1048;

	@OriginalMember(owner = "client!client", name = "tk", descriptor = "I")
	private int anInt1049;

	@OriginalMember(owner = "client!client", name = "uk", descriptor = "I")
	private int anInt1050;

	@OriginalMember(owner = "client!client", name = "vk", descriptor = "I")
	private int anInt1051;

	@OriginalMember(owner = "client!client", name = "L", descriptor = "I")
	private int anInt820 = 3;

	@OriginalMember(owner = "client!client", name = "M", descriptor = "B")
	private byte aByte32 = 1;

	@OriginalMember(owner = "client!client", name = "N", descriptor = "I")
	private int anInt821 = 128;

	@OriginalMember(owner = "client!client", name = "S", descriptor = "Ljava/lang/String;")
	private String aString17 = "";

	@OriginalMember(owner = "client!client", name = "U", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray8 = new String[100];

	@OriginalMember(owner = "client!client", name = "V", descriptor = "[I")
	private int[] anIntArray212 = new int[100];

	@OriginalMember(owner = "client!client", name = "X", descriptor = "Z")
	private boolean aBoolean182 = false;

	@OriginalMember(owner = "client!client", name = "bb", descriptor = "I")
	private int anInt831 = 5063219;

	@OriginalMember(owner = "client!client", name = "db", descriptor = "Z")
	private boolean aBoolean183 = false;

	@OriginalMember(owner = "client!client", name = "eb", descriptor = "Lclient!PACANLMY;")
	private Class29 aClass29_10 = new Class29(0);

	@OriginalMember(owner = "client!client", name = "hb", descriptor = "I")
	private int anInt835 = 231;

	@OriginalMember(owner = "client!client", name = "ib", descriptor = "[I")
	private int[] anIntArray213 = new int[Class38.anInt607];

	@OriginalMember(owner = "client!client", name = "sb", descriptor = "Z")
	private boolean aBoolean184 = true;

	@OriginalMember(owner = "client!client", name = "tb", descriptor = "[Lclient!VZJVQLEE;")
	private Class2_Sub1_Sub2_Sub2[] aClass2_Sub1_Sub2_Sub2Array4 = new Class2_Sub1_Sub2_Sub2[32];

	@OriginalMember(owner = "client!client", name = "ub", descriptor = "[B")
	private byte[] aByteArray21 = new byte[16384];

	@OriginalMember(owner = "client!client", name = "vb", descriptor = "Lclient!LBBVYYXO;")
	private Class2_Sub1_Sub3 aClass2_Sub1_Sub3_6 = Class2_Sub1_Sub3.method255();

	@OriginalMember(owner = "client!client", name = "wb", descriptor = "Ljava/lang/String;")
	private String aString18 = "";

	@OriginalMember(owner = "client!client", name = "xb", descriptor = "Ljava/lang/String;")
	private String aString19 = "";

	@OriginalMember(owner = "client!client", name = "Db", descriptor = "Z")
	private boolean aBoolean185 = true;

	@OriginalMember(owner = "client!client", name = "Eb", descriptor = "I")
	private int anInt843 = 128;

	@OriginalMember(owner = "client!client", name = "Fb", descriptor = "Lclient!PQPZKUPU;")
	private Class31 aClass31_1 = new Class31();

	@OriginalMember(owner = "client!client", name = "Hb", descriptor = "I")
	private int anInt845 = 50;

	@OriginalMember(owner = "client!client", name = "Ib", descriptor = "[I")
	private int[] anIntArray214 = new int[this.anInt845];

	@OriginalMember(owner = "client!client", name = "Jb", descriptor = "[I")
	private int[] anIntArray215 = new int[this.anInt845];

	@OriginalMember(owner = "client!client", name = "Kb", descriptor = "[I")
	private int[] anIntArray216 = new int[this.anInt845];

	@OriginalMember(owner = "client!client", name = "Lb", descriptor = "[I")
	private int[] anIntArray217 = new int[this.anInt845];

	@OriginalMember(owner = "client!client", name = "Mb", descriptor = "[I")
	private int[] anIntArray218 = new int[this.anInt845];

	@OriginalMember(owner = "client!client", name = "Nb", descriptor = "[I")
	private int[] anIntArray219 = new int[this.anInt845];

	@OriginalMember(owner = "client!client", name = "Ob", descriptor = "[I")
	private int[] anIntArray220 = new int[this.anInt845];

	@OriginalMember(owner = "client!client", name = "Pb", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray9 = new String[this.anInt845];

	@OriginalMember(owner = "client!client", name = "Rb", descriptor = "I")
	private int anInt847 = 2;

	@OriginalMember(owner = "client!client", name = "Sb", descriptor = "B")
	private byte aByte33 = 4;

	@OriginalMember(owner = "client!client", name = "Zb", descriptor = "I")
	private int anInt852 = 7;

	@OriginalMember(owner = "client!client", name = "ac", descriptor = "[[I")
	private int[][] anIntArrayArray22 = new int[104][104];

	@OriginalMember(owner = "client!client", name = "cc", descriptor = "[I")
	private int[] anIntArray221 = new int[151];

	@OriginalMember(owner = "client!client", name = "fc", descriptor = "I")
	private int anInt854 = -1;

	@OriginalMember(owner = "client!client", name = "gc", descriptor = "Z")
	private boolean aBoolean186 = false;

	@OriginalMember(owner = "client!client", name = "oc", descriptor = "Z")
	private boolean aBoolean187 = false;

	@OriginalMember(owner = "client!client", name = "pc", descriptor = "I")
	private int anInt856 = -1;

	@OriginalMember(owner = "client!client", name = "qc", descriptor = "I")
	private int anInt857 = -1;

	@OriginalMember(owner = "client!client", name = "rc", descriptor = "Z")
	private boolean aBoolean188 = false;

	@OriginalMember(owner = "client!client", name = "sc", descriptor = "Z")
	private boolean aBoolean189 = false;

	@OriginalMember(owner = "client!client", name = "tc", descriptor = "I")
	private int anInt858 = 38046;

	@OriginalMember(owner = "client!client", name = "yc", descriptor = "I")
	private int anInt863 = 2;

	@OriginalMember(owner = "client!client", name = "zc", descriptor = "Z")
	private boolean aBoolean190 = false;

	@OriginalMember(owner = "client!client", name = "Ac", descriptor = "Z")
	private boolean aBoolean191 = true;

	@OriginalMember(owner = "client!client", name = "Dc", descriptor = "[I")
	private int[] anIntArray226 = new int[33];

	@OriginalMember(owner = "client!client", name = "Fc", descriptor = "[I")
	private int[] anIntArray227 = new int[200];

	@OriginalMember(owner = "client!client", name = "Gc", descriptor = "[Lclient!VZJVQLEE;")
	private Class2_Sub1_Sub2_Sub2[] aClass2_Sub1_Sub2_Sub2Array5 = new Class2_Sub1_Sub2_Sub2[100];

	@OriginalMember(owner = "client!client", name = "Ic", descriptor = "I")
	private int anInt865 = -1;

	@OriginalMember(owner = "client!client", name = "Kc", descriptor = "I")
	private final int anInt867 = 100;

	@OriginalMember(owner = "client!client", name = "Lc", descriptor = "[I")
	private int[] anIntArray228 = new int[100];

	@OriginalMember(owner = "client!client", name = "Sc", descriptor = "Z")
	private boolean aBoolean192 = false;

	@OriginalMember(owner = "client!client", name = "Xc", descriptor = "Z")
	private boolean aBoolean193 = false;

	@OriginalMember(owner = "client!client", name = "Yc", descriptor = "Z")
	private boolean aBoolean194 = false;

	@OriginalMember(owner = "client!client", name = "cd", descriptor = "I")
	private int anInt880 = 964;

	@OriginalMember(owner = "client!client", name = "dd", descriptor = "[I")
	private int[] anIntArray229 = new int[Class38.anInt607];

	@OriginalMember(owner = "client!client", name = "fd", descriptor = "I")
	private int anInt882 = -1;

	@OriginalMember(owner = "client!client", name = "gd", descriptor = "I")
	private int anInt883 = -1;

	@OriginalMember(owner = "client!client", name = "td", descriptor = "[I")
	private int[] anIntArray230 = new int[5];

	@OriginalMember(owner = "client!client", name = "ud", descriptor = "B")
	private byte aByte35 = 41;

	@OriginalMember(owner = "client!client", name = "wd", descriptor = "Z")
	private boolean aBoolean195 = false;

	@OriginalMember(owner = "client!client", name = "xd", descriptor = "[[I")
	private int[][] anIntArrayArray24 = new int[104][104];

	@OriginalMember(owner = "client!client", name = "Ed", descriptor = "I")
	private int anInt900 = 2048;

	@OriginalMember(owner = "client!client", name = "Fd", descriptor = "I")
	private int anInt901 = 2047;

	@OriginalMember(owner = "client!client", name = "Gd", descriptor = "[Lclient!SOKVSBIO;")
	private Class2_Sub1_Sub1_Sub4_Sub2[] aClass2_Sub1_Sub1_Sub4_Sub2Array1 = new Class2_Sub1_Sub1_Sub4_Sub2[this.anInt900];

	@OriginalMember(owner = "client!client", name = "Id", descriptor = "[I")
	private int[] anIntArray231 = new int[this.anInt900];

	@OriginalMember(owner = "client!client", name = "Kd", descriptor = "[I")
	private int[] anIntArray232 = new int[this.anInt900];

	@OriginalMember(owner = "client!client", name = "Ld", descriptor = "[Lclient!LBBVYYXO;")
	private Class2_Sub1_Sub3[] aClass2_Sub1_Sub3Array1 = new Class2_Sub1_Sub3[this.anInt900];

	@OriginalMember(owner = "client!client", name = "Sd", descriptor = "I")
	private int anInt908 = 2301979;

	@OriginalMember(owner = "client!client", name = "ce", descriptor = "I")
	private int anInt916 = -659;

	@OriginalMember(owner = "client!client", name = "ee", descriptor = "Ljava/lang/String;")
	private String aString23 = "";

	@OriginalMember(owner = "client!client", name = "ie", descriptor = "[[[Lclient!PACANLMY;")
	private Class29[][][] aClass29ArrayArrayArray1 = new Class29[4][104][104];

	@OriginalMember(owner = "client!client", name = "je", descriptor = "B")
	private byte aByte37 = 7;

	@OriginalMember(owner = "client!client", name = "me", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray10 = new String[200];

	@OriginalMember(owner = "client!client", name = "ne", descriptor = "[Lclient!VZJVQLEE;")
	private Class2_Sub1_Sub2_Sub2[] aClass2_Sub1_Sub2_Sub2Array6 = new Class2_Sub1_Sub2_Sub2[32];

	@OriginalMember(owner = "client!client", name = "ze", descriptor = "Z")
	private volatile boolean aBoolean198 = false;

	@OriginalMember(owner = "client!client", name = "Ae", descriptor = "I")
	private int anInt921 = 3;

	@OriginalMember(owner = "client!client", name = "Be", descriptor = "[I")
	private int[] anIntArray233 = new int[500];

	@OriginalMember(owner = "client!client", name = "Ce", descriptor = "[I")
	private int[] anIntArray234 = new int[500];

	@OriginalMember(owner = "client!client", name = "De", descriptor = "[I")
	private int[] anIntArray235 = new int[500];

	@OriginalMember(owner = "client!client", name = "Ee", descriptor = "[I")
	private int[] anIntArray236 = new int[500];

	@OriginalMember(owner = "client!client", name = "Ge", descriptor = "I")
	private int anInt923 = 1;

	@OriginalMember(owner = "client!client", name = "He", descriptor = "I")
	private int anInt924 = -1;

	@OriginalMember(owner = "client!client", name = "Re", descriptor = "I")
	private int anInt931 = 2;

	@OriginalMember(owner = "client!client", name = "df", descriptor = "B")
	private byte aByte38 = 1;

	@OriginalMember(owner = "client!client", name = "ef", descriptor = "[I")
	private int[] anIntArray239 = new int[5];

	@OriginalMember(owner = "client!client", name = "kf", descriptor = "I")
	private int anInt944 = -1;

	@OriginalMember(owner = "client!client", name = "nf", descriptor = "Z")
	private boolean aBoolean199 = false;

	@OriginalMember(owner = "client!client", name = "tf", descriptor = "Z")
	private boolean aBoolean201 = false;

	@OriginalMember(owner = "client!client", name = "yf", descriptor = "I")
	private int anInt948 = -1;

	@OriginalMember(owner = "client!client", name = "zf", descriptor = "I")
	private int anInt949 = -462;

	@OriginalMember(owner = "client!client", name = "Af", descriptor = "Ljava/lang/String;")
	private String aString25 = "";

	@OriginalMember(owner = "client!client", name = "Cf", descriptor = "Z")
	private volatile boolean aBoolean202 = false;

	@OriginalMember(owner = "client!client", name = "Df", descriptor = "Z")
	private boolean aBoolean203 = false;

	@OriginalMember(owner = "client!client", name = "Ef", descriptor = "Ljava/lang/String;")
	private String aString26 = "";

	@OriginalMember(owner = "client!client", name = "Ff", descriptor = "[Lclient!VZJVQLEE;")
	private Class2_Sub1_Sub2_Sub2[] aClass2_Sub1_Sub2_Sub2Array7 = new Class2_Sub1_Sub2_Sub2[8];

	@OriginalMember(owner = "client!client", name = "Hf", descriptor = "I")
	private int anInt951 = -1;

	@OriginalMember(owner = "client!client", name = "Jf", descriptor = "[I")
	private int[] anIntArray242 = new int[50];

	@OriginalMember(owner = "client!client", name = "Lf", descriptor = "Ljava/util/zip/CRC32;")
	private CRC32 aCRC32_2 = new CRC32();

	@OriginalMember(owner = "client!client", name = "Of", descriptor = "Z")
	public boolean aBoolean204 = false;

	@OriginalMember(owner = "client!client", name = "Pf", descriptor = "Lclient!PACANLMY;")
	private Class29 aClass29_11 = new Class29(0);

	@OriginalMember(owner = "client!client", name = "Rf", descriptor = "[I")
	private final int[] anIntArray245 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

	@OriginalMember(owner = "client!client", name = "Uf", descriptor = "[I")
	private int[] anIntArray246 = new int[Class38.anInt607];

	@OriginalMember(owner = "client!client", name = "Vf", descriptor = "[I")
	private int[] anIntArray247 = new int[4000];

	@OriginalMember(owner = "client!client", name = "Wf", descriptor = "[I")
	private int[] anIntArray248 = new int[4000];

	@OriginalMember(owner = "client!client", name = "Yf", descriptor = "[I")
	private int[] anIntArray249 = new int[5];

	@OriginalMember(owner = "client!client", name = "cg", descriptor = "Z")
	private boolean aBoolean205 = false;

	@OriginalMember(owner = "client!client", name = "dg", descriptor = "I")
	private int anInt960 = 493;

	@OriginalMember(owner = "client!client", name = "eg", descriptor = "I")
	private int anInt961 = 3353893;

	@OriginalMember(owner = "client!client", name = "gg", descriptor = "Z")
	private boolean aBoolean206 = false;

	@OriginalMember(owner = "client!client", name = "hg", descriptor = "[Lclient!MACXPWDL;")
	public Class25[] aClass25Array1 = new Class25[5];

	@OriginalMember(owner = "client!client", name = "jg", descriptor = "Lclient!LBBVYYXO;")
	private Class2_Sub1_Sub3 aClass2_Sub1_Sub3_7 = new Class2_Sub1_Sub3((byte) 114, new byte[5000]);

	@OriginalMember(owner = "client!client", name = "kg", descriptor = "[Lclient!SBPCMLRM;")
	private Class2_Sub1_Sub1_Sub4_Sub1[] aClass2_Sub1_Sub1_Sub4_Sub1Array1 = new Class2_Sub1_Sub1_Sub4_Sub1[16384];

	@OriginalMember(owner = "client!client", name = "mg", descriptor = "[I")
	private int[] anIntArray250 = new int[16384];

	@OriginalMember(owner = "client!client", name = "ng", descriptor = "B")
	private byte aByte40 = 6;

	@OriginalMember(owner = "client!client", name = "og", descriptor = "[I")
	private int[] anIntArray251 = new int[100];

	@OriginalMember(owner = "client!client", name = "pg", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray11 = new String[100];

	@OriginalMember(owner = "client!client", name = "qg", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray12 = new String[100];

	@OriginalMember(owner = "client!client", name = "rg", descriptor = "I")
	private int anInt965 = -1;

	@OriginalMember(owner = "client!client", name = "sg", descriptor = "B")
	private byte aByte41 = 0;

	@OriginalMember(owner = "client!client", name = "tg", descriptor = "[I")
	private int[] anIntArray252 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

	@OriginalMember(owner = "client!client", name = "ug", descriptor = "[I")
	public int[] anIntArray253 = new int[2000];

	@OriginalMember(owner = "client!client", name = "wg", descriptor = "B")
	private byte aByte43 = 9;

	@OriginalMember(owner = "client!client", name = "xg", descriptor = "[I")
	private int[] anIntArray254 = new int[2000];

	@OriginalMember(owner = "client!client", name = "yg", descriptor = "[Lclient!ZQSBFHWZ;")
	private Class2_Sub1_Sub2_Sub3[] aClass2_Sub1_Sub2_Sub3Array2 = new Class2_Sub1_Sub2_Sub3[2];

	@OriginalMember(owner = "client!client", name = "zg", descriptor = "I")
	private int anInt966 = -644;

	@OriginalMember(owner = "client!client", name = "Bg", descriptor = "[Lclient!VZJVQLEE;")
	private Class2_Sub1_Sub2_Sub2[] aClass2_Sub1_Sub2_Sub2Array8 = new Class2_Sub1_Sub2_Sub2[32];

	@OriginalMember(owner = "client!client", name = "Dg", descriptor = "I")
	private int anInt969 = -39349;

	@OriginalMember(owner = "client!client", name = "Eg", descriptor = "I")
	private int anInt970 = 78;

	@OriginalMember(owner = "client!client", name = "Hg", descriptor = "Lclient!PACANLMY;")
	private Class29 aClass29_12 = new Class29(0);

	@OriginalMember(owner = "client!client", name = "Kg", descriptor = "Z")
	private boolean aBoolean207 = false;

	@OriginalMember(owner = "client!client", name = "Mg", descriptor = "I")
	private int anInt974 = -1;

	@OriginalMember(owner = "client!client", name = "Ng", descriptor = "B")
	private byte aByte44 = -119;

	@OriginalMember(owner = "client!client", name = "Og", descriptor = "[J")
	private long[] aLongArray3 = new long[100];

	@OriginalMember(owner = "client!client", name = "Pg", descriptor = "[I")
	private int[] anIntArray255 = new int[256];

	@OriginalMember(owner = "client!client", name = "Qg", descriptor = "[[I")
	private int[][] anIntArrayArray25 = new int[104][104];

	@OriginalMember(owner = "client!client", name = "Sg", descriptor = "[I")
	private int[] anIntArray256 = new int[33];

	@OriginalMember(owner = "client!client", name = "Tg", descriptor = "Z")
	private boolean aBoolean208 = true;

	@OriginalMember(owner = "client!client", name = "Ug", descriptor = "B")
	private byte aByte45 = -119;

	@OriginalMember(owner = "client!client", name = "Xg", descriptor = "[Lclient!ZQSBFHWZ;")
	private Class2_Sub1_Sub2_Sub3[] aClass2_Sub1_Sub2_Sub3Array3 = new Class2_Sub1_Sub2_Sub3[100];

	@OriginalMember(owner = "client!client", name = "Yg", descriptor = "[Lclient!ZQSBFHWZ;")
	private Class2_Sub1_Sub2_Sub3[] aClass2_Sub1_Sub2_Sub3Array4 = new Class2_Sub1_Sub2_Sub3[13];

	@OriginalMember(owner = "client!client", name = "hh", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray13 = new String[5];

	@OriginalMember(owner = "client!client", name = "ih", descriptor = "[Z")
	private boolean[] aBooleanArray11 = new boolean[5];

	@OriginalMember(owner = "client!client", name = "jh", descriptor = "Z")
	private boolean aBoolean209 = false;

	@OriginalMember(owner = "client!client", name = "lh", descriptor = "Z")
	private boolean aBoolean210 = true;

	@OriginalMember(owner = "client!client", name = "mh", descriptor = "Z")
	private boolean aBoolean211 = true;

	@OriginalMember(owner = "client!client", name = "oh", descriptor = "[I")
	private int[] anIntArray257 = new int[9];

	@OriginalMember(owner = "client!client", name = "qh", descriptor = "[I")
	private int[] anIntArray258 = new int[50];

	@OriginalMember(owner = "client!client", name = "rh", descriptor = "I")
	private int anInt987 = -1;

	@OriginalMember(owner = "client!client", name = "wh", descriptor = "[I")
	private int[] anIntArray259 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

	@OriginalMember(owner = "client!client", name = "xh", descriptor = "[I")
	private int[] anIntArray260 = new int[7];

	@OriginalMember(owner = "client!client", name = "zh", descriptor = "Ljava/lang/String;")
	private String aString27 = "";

	@OriginalMember(owner = "client!client", name = "Ch", descriptor = "Z")
	private boolean aBoolean212 = false;

	@OriginalMember(owner = "client!client", name = "Gh", descriptor = "[Z")
	private boolean[] aBooleanArray12 = new boolean[5];

	@OriginalMember(owner = "client!client", name = "Mh", descriptor = "Z")
	private boolean aBoolean213 = false;

	@OriginalMember(owner = "client!client", name = "Qh", descriptor = "Z")
	private volatile boolean aBoolean214 = false;

	@OriginalMember(owner = "client!client", name = "Rh", descriptor = "Z")
	private boolean aBoolean215 = false;

	@OriginalMember(owner = "client!client", name = "Sh", descriptor = "B")
	private byte aByte46 = 5;

	@OriginalMember(owner = "client!client", name = "Th", descriptor = "B")
	private byte aByte47 = 8;

	@OriginalMember(owner = "client!client", name = "di", descriptor = "[I")
	private int[] anIntArray261 = new int[50];

	@OriginalMember(owner = "client!client", name = "ei", descriptor = "Ljava/lang/String;")
	private String aString28 = "";

	@OriginalMember(owner = "client!client", name = "li", descriptor = "I")
	private int anInt1003 = -1;

	@OriginalMember(owner = "client!client", name = "ni", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray14 = new String[500];

	@OriginalMember(owner = "client!client", name = "pi", descriptor = "Z")
	private boolean aBoolean217 = false;

	@OriginalMember(owner = "client!client", name = "qi", descriptor = "Ljava/lang/String;")
	private String aString29 = "";

	@OriginalMember(owner = "client!client", name = "ri", descriptor = "Ljava/lang/String;")
	private String aString30 = "";

	@OriginalMember(owner = "client!client", name = "ti", descriptor = "Z")
	private boolean aBoolean218 = true;

	@OriginalMember(owner = "client!client", name = "ui", descriptor = "I")
	private int anInt1006 = -1;

	@OriginalMember(owner = "client!client", name = "xi", descriptor = "[J")
	private long[] aLongArray4 = new long[200];

	@OriginalMember(owner = "client!client", name = "Ai", descriptor = "[I")
	private int[] anIntArray262 = new int[5];

	@OriginalMember(owner = "client!client", name = "Bi", descriptor = "Lclient!LBBVYYXO;")
	private Class2_Sub1_Sub3 aClass2_Sub1_Sub3_8 = Class2_Sub1_Sub3.method255();

	@OriginalMember(owner = "client!client", name = "Ci", descriptor = "B")
	private byte aByte48 = 7;

	@OriginalMember(owner = "client!client", name = "Hi", descriptor = "[Lclient!VZJVQLEE;")
	private Class2_Sub1_Sub2_Sub2[] aClass2_Sub1_Sub2_Sub2Array9 = new Class2_Sub1_Sub2_Sub2[1000];

	@OriginalMember(owner = "client!client", name = "Li", descriptor = "I")
	private int anInt1013 = 2;

	@OriginalMember(owner = "client!client", name = "Mi", descriptor = "I")
	private int anInt1014 = 105;

	@OriginalMember(owner = "client!client", name = "Ri", descriptor = "[I")
	private int[] anIntArray263 = new int[5];

	@OriginalMember(owner = "client!client", name = "Si", descriptor = "I")
	private int anInt1015 = 3169;

	@OriginalMember(owner = "client!client", name = "Ti", descriptor = "[I")
	private int[] anIntArray264 = new int[] { 17, 24, 34, 40 };

	@OriginalMember(owner = "client!client", name = "cj", descriptor = "Z")
	private boolean aBoolean220 = true;

	@OriginalMember(owner = "client!client", name = "gj", descriptor = "Z")
	private boolean aBoolean221 = false;

	@OriginalMember(owner = "client!client", name = "lj", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray8 = new int[4][13][13];

	@OriginalMember(owner = "client!client", name = "mj", descriptor = "I")
	private int anInt1021 = 7;

	@OriginalMember(owner = "client!client", name = "nj", descriptor = "I")
	private int anInt1022 = 7759444;

	@OriginalMember(owner = "client!client", name = "uj", descriptor = "Z")
	private boolean aBoolean223 = false;

	@OriginalMember(owner = "client!client", name = "vj", descriptor = "Z")
	private boolean aBoolean224 = false;

	@OriginalMember(owner = "client!client", name = "Bj", descriptor = "B")
	private byte aByte49 = 3;

	@OriginalMember(owner = "client!client", name = "Ij", descriptor = "[Lclient!CRVZDSLK;")
	private Class5[] aClass5Array1 = new Class5[4];

	@OriginalMember(owner = "client!client", name = "Pj", descriptor = "[I")
	private int[] anIntArray272 = new int[151];

	@OriginalMember(owner = "client!client", name = "Qj", descriptor = "Z")
	private boolean aBoolean225 = false;

	@OriginalMember(owner = "client!client", name = "Sj", descriptor = "I")
	private int anInt1033 = 1;

	@OriginalMember(owner = "client!client", name = "Uj", descriptor = "Z")
	private boolean aBoolean226 = true;

	@OriginalMember(owner = "client!client", name = "Wj", descriptor = "[I")
	private int[] anIntArray273 = new int[1000];

	@OriginalMember(owner = "client!client", name = "Yj", descriptor = "Z")
	private boolean aBoolean227 = false;

	@OriginalMember(owner = "client!client", name = "ak", descriptor = "[I")
	private int[] anIntArray274 = new int[1000];

	@OriginalMember(owner = "client!client", name = "bk", descriptor = "[I")
	private int[] anIntArray275 = new int[1000];

	@OriginalMember(owner = "client!client", name = "dk", descriptor = "I")
	private int anInt1038 = -347;

	@OriginalMember(owner = "client!client", name = "ek", descriptor = "I")
	private int anInt1039 = -1;

	@OriginalMember(owner = "client!client", name = "fk", descriptor = "B")
	private byte aByte50 = 1;

	@OriginalMember(owner = "client!client", name = "hk", descriptor = "[Lclient!VZJVQLEE;")
	private Class2_Sub1_Sub2_Sub2[] aClass2_Sub1_Sub2_Sub2Array10 = new Class2_Sub1_Sub2_Sub2[20];

	@OriginalMember(owner = "client!client", name = "ik", descriptor = "Lclient!LBBVYYXO;")
	private Class2_Sub1_Sub3 aClass2_Sub1_Sub3_9 = Class2_Sub1_Sub3.method255();

	@OriginalMember(owner = "client!client", name = "qk", descriptor = "Z")
	private boolean aBoolean228 = false;

	static {
		@Pc(350) int local350 = 0;
		@Pc(352) int local352;
		for (local352 = 0; local352 < 99; local352++) {
			@Pc(357) int local357 = local352 + 1;
			@Pc(370) int local370 = (int) ((double) local357 + Math.pow(2.0D, (double) local357 / 7.0D) * 300.0D);
			local350 += local370;
			anIntArray241[local352] = local350 / 4;
		}
		aByte42 = 91;
		aBoolean219 = true;
		anInt1024 = 5;
		aBigInteger2 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");
		aString31 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";
		anIntArray276 = new int[32];
		local350 = 2;
		for (local352 = 0; local352 < 32; local352++) {
			anIntArray276[local352] = local350 - 1;
			local350 += local350;
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(III)Ljava/lang/String;")
	private static String method594(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
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
			signlink.reporterror("74655, " + arg0 + ", " + arg1 + ", " + 869 + ", " + local53.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(B)V")
	private static void method626(@OriginalArg(0) byte arg0) {
		try {
			Class34.aBoolean132 = true;
			Class2_Sub1_Sub2_Sub1.aBoolean23 = true;
			if (arg0 != aByte36) {
				aBoolean219 = !aBoolean219;
			}
			aBoolean197 = true;
			Class11.aBoolean60 = true;
			Class24.aBoolean93 = true;
		} catch (@Pc(20) RuntimeException local20) {
			signlink.reporterror("27149, " + arg0 + ", " + local20.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IB)Ljava/lang/String;")
	private static String method634(@OriginalArg(0) int arg0) {
		try {
			@Pc(4) String local4 = String.valueOf(arg0);
			for (@Pc(14) int local14 = local4.length() - 3; local14 > 0; local14 -= 3) {
				local4 = local4.substring(0, local14) + "," + local4.substring(local14);
			}
			if (local4.length() > 8) {
				local4 = "@gre@" + local4.substring(0, local4.length() - 8) + " million @whi@(" + local4 + ")";
			} else if (local4.length() > 4) {
				local4 = "@cya@" + local4.substring(0, local4.length() - 4) + "K @whi@(" + local4 + ")";
			}
			return " " + local4;
		} catch (@Pc(94) RuntimeException local94) {
			signlink.reporterror("87332, " + arg0 + ", " + 119 + ", " + local94.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "y", descriptor = "(I)V")
	private static void method667() {
		try {
			Class34.aBoolean132 = false;
			Class2_Sub1_Sub2_Sub1.aBoolean23 = false;
			aBoolean197 = false;
			Class11.aBoolean60 = false;
			Class24.aBoolean93 = false;
		} catch (@Pc(14) RuntimeException local14) {
			signlink.reporterror("40841, " + 0 + ", " + local14.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "h", descriptor = "(II)Ljava/lang/String;")
	private static String method704(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			if (arg0 != anInt864) {
				anInt868 = 180;
			}
			if (arg1 < 100000) {
				return String.valueOf(arg1);
			} else if (arg1 < 10000000) {
				return arg1 / 1000 + "K";
			} else {
				return arg1 / 1000000 + "M";
			}
		} catch (@Pc(36) RuntimeException local36) {
			signlink.reporterror("83991, " + arg0 + ", " + arg1 + ", " + local36.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "main", descriptor = "([Ljava/lang/String;)V")
	public static void main(@OriginalArg(0) String[] arg0) {
		try {
			System.out.println("RS2 user client - release #" + 356);
			if (arg0.length == 5) {
				anInt906 = Integer.parseInt(arg0[0]);
				anInt907 = Integer.parseInt(arg0[1]);
				if (arg0[2].equals("lowmem")) {
					method626(aByte42);
				} else if (arg0[2].equals("highmem")) {
					method667();
				} else {
					System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
					return;
				}
				if (arg0[3].equals("free")) {
					aBoolean196 = false;
				} else if (arg0[3].equals("members")) {
					aBoolean196 = true;
				} else {
					System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
					return;
				}
				signlink.anInt1054 = Integer.parseInt(arg0[4]);
				signlink.startpriv(InetAddress.getLocalHost());
				@Pc(87) client local87 = new client();
				local87.method575(aByte39);
			} else {
				System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
			}
		} catch (@Pc(94) Exception local94) {
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/String;)Ljava/io/DataInputStream;")
	private DataInputStream method588(@OriginalArg(0) String arg0) throws IOException {
		if (this.aBoolean223) {
			if (this.aSocket3 != null) {
				try {
					this.aSocket3.close();
				} catch (@Pc(26) Exception local26) {
				}
				this.aSocket3 = null;
			}
			this.aSocket3 = this.method702(43595);
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

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(B)V")
	private void method589(@OriginalArg(0) byte arg0) {
		try {
			this.aBoolean202 = false;
			while (this.aBoolean198) {
				this.aBoolean202 = false;
				try {
					Thread.sleep(50L);
				} catch (@Pc(11) Exception local11) {
				}
			}
			this.aClass2_Sub1_Sub2_Sub3_11 = null;
			this.aClass2_Sub1_Sub2_Sub3_12 = null;
			this.aClass2_Sub1_Sub2_Sub3Array5 = null;
			this.anIntArray222 = null;
			this.anIntArray223 = null;
			this.anIntArray224 = null;
			this.anIntArray225 = null;
			this.anIntArray237 = null;
			this.anIntArray238 = null;
			if (arg0 != 3) {
				this.aBoolean185 = !this.aBoolean185;
			}
			this.anIntArray243 = null;
			this.anIntArray244 = null;
			this.aClass2_Sub1_Sub2_Sub2_16 = null;
			this.aClass2_Sub1_Sub2_Sub2_17 = null;
		} catch (@Pc(67) RuntimeException local67) {
			signlink.reporterror("69435, " + arg0 + ", " + local67.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/String;B)Z")
	private boolean method590(@OriginalArg(0) String arg0) {
		try {
			if (arg0 == null) {
				return false;
			}
			for (@Pc(12) int local12 = 0; local12 < this.anInt988; local12++) {
				if (arg0.equalsIgnoreCase(this.aStringArray10[local12])) {
					return true;
				}
			}
			return arg0.equalsIgnoreCase(aClass2_Sub1_Sub1_Sub4_Sub2_1.aString14);
		} catch (@Pc(38) RuntimeException local38) {
			signlink.reporterror("31238, " + arg0 + ", " + 9 + ", " + local38.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(B)V")
	private void method591() {
		try {
			this.aClass2_Sub1_Sub2_Sub3_11 = new Class2_Sub1_Sub2_Sub3(this.aClass13_2, "titlebox", 0);
			this.aClass2_Sub1_Sub2_Sub3_12 = new Class2_Sub1_Sub2_Sub3(this.aClass13_2, "titlebutton", 0);
			this.aClass2_Sub1_Sub2_Sub3Array5 = new Class2_Sub1_Sub2_Sub3[12];
			for (@Pc(30) int local30 = 0; local30 < 12; local30++) {
				this.aClass2_Sub1_Sub2_Sub3Array5[local30] = new Class2_Sub1_Sub2_Sub3(this.aClass13_2, "runes", local30);
			}
			this.aClass2_Sub1_Sub2_Sub2_16 = new Class2_Sub1_Sub2_Sub2(128, 265);
			this.aClass2_Sub1_Sub2_Sub2_17 = new Class2_Sub1_Sub2_Sub2(128, 265);
			for (@Pc(63) int local63 = 0; local63 < 33920; local63++) {
				this.aClass2_Sub1_Sub2_Sub2_16.anIntArray164[local63] = this.aClass17_6.anIntArray87[local63];
			}
			for (@Pc(81) int local81 = 0; local81 < 33920; local81++) {
				this.aClass2_Sub1_Sub2_Sub2_17.anIntArray164[local81] = this.aClass17_7.anIntArray87[local81];
			}
			this.anIntArray223 = new int[256];
			for (@Pc(103) int local103 = 0; local103 < 64; local103++) {
				this.anIntArray223[local103] = local103 * 262144;
			}
			for (@Pc(118) int local118 = 0; local118 < 64; local118++) {
				this.anIntArray223[local118 + 64] = local118 * 1024 + 16711680;
			}
			for (@Pc(137) int local137 = 0; local137 < 64; local137++) {
				this.anIntArray223[local137 + 128] = local137 * 4 + 16776960;
			}
			for (@Pc(156) int local156 = 0; local156 < 64; local156++) {
				this.anIntArray223[local156 + 192] = 16777215;
			}
			this.anIntArray224 = new int[256];
			for (@Pc(175) int local175 = 0; local175 < 64; local175++) {
				this.anIntArray224[local175] = local175 * 1024;
			}
			for (@Pc(190) int local190 = 0; local190 < 64; local190++) {
				this.anIntArray224[local190 + 64] = local190 * 4 + 65280;
			}
			for (@Pc(209) int local209 = 0; local209 < 64; local209++) {
				this.anIntArray224[local209 + 128] = local209 * 262144 + 65535;
			}
			for (@Pc(228) int local228 = 0; local228 < 64; local228++) {
				this.anIntArray224[local228 + 192] = 16777215;
			}
			this.anIntArray225 = new int[256];
			for (@Pc(247) int local247 = 0; local247 < 64; local247++) {
				this.anIntArray225[local247] = local247 * 4;
			}
			for (@Pc(262) int local262 = 0; local262 < 64; local262++) {
				this.anIntArray225[local262 + 64] = local262 * 262144 + 255;
			}
			for (@Pc(281) int local281 = 0; local281 < 64; local281++) {
				this.anIntArray225[local281 + 128] = local281 * 1024 + 16711935;
			}
			for (@Pc(300) int local300 = 0; local300 < 64; local300++) {
				this.anIntArray225[local300 + 192] = 16777215;
			}
			this.anIntArray222 = new int[256];
			this.anIntArray237 = new int[32768];
			this.anIntArray238 = new int[32768];
			this.method677(null);
			this.anIntArray243 = new int[32768];
			this.anIntArray244 = new int[32768];
			this.method587(10, "Connecting to fileserver");
			if (!this.aBoolean202) {
				this.aBoolean214 = true;
				this.aBoolean202 = true;
				this.method586(this, 2);
			}
		} catch (@Pc(357) RuntimeException local357) {
			signlink.reporterror("40620, " + 38 + ", " + local357.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(I)V")
	private void method592() {
		try {
			this.aClass2_Sub1_Sub3_6.method256(22);
			if (this.anInt1003 != -1) {
				this.method724(this.anInt1003);
				this.anInt1003 = -1;
				this.aBoolean228 = true;
				this.aBoolean199 = false;
				this.aBoolean190 = true;
			}
			if (this.anInt974 != -1) {
				this.method724(this.anInt974);
				this.anInt974 = -1;
				this.aBoolean225 = true;
				this.aBoolean199 = false;
			}
			if (this.anInt857 != -1) {
				this.method724(this.anInt857);
				this.anInt857 = -1;
				this.aBoolean183 = true;
			}
			if (this.anInt854 != -1) {
				this.method724(this.anInt854);
				this.anInt854 = -1;
			}
			if (this.anInt1039 != -1) {
				this.method724(this.anInt1039);
				this.anInt1039 = -1;
			}
		} catch (@Pc(91) RuntimeException local91) {
			signlink.reporterror("92036, " + 0 + ", " + local91.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "f", descriptor = "(I)V")
	private void method593() {
		try {
			@Pc(12) int local12;
			for (@Pc(5) int local5 = 10; local5 < 117; local5++) {
				local12 = (int) (Math.random() * 100.0D);
				if (local12 < 50) {
					this.anIntArray243[local5 + 32512] = 255;
				}
			}
			@Pc(41) int local41;
			@Pc(48) int local48;
			@Pc(54) int local54;
			for (local12 = 0; local12 < 100; local12++) {
				local41 = (int) (Math.random() * 124.0D) + 2;
				local48 = (int) (Math.random() * 128.0D) + 128;
				local54 = local41 + (local48 << 7);
				this.anIntArray243[local54] = 192;
			}
			for (local41 = 1; local41 < 255; local41++) {
				for (local48 = 1; local48 < 127; local48++) {
					local54 = local48 + (local41 << 7);
					this.anIntArray244[local54] = (this.anIntArray243[local54 - 1] + this.anIntArray243[local54 + 1] + this.anIntArray243[local54 - 128] + this.anIntArray243[local54 + 128]) / 4;
				}
			}
			this.anInt1040 += 128;
			if (this.anInt1040 > this.anIntArray237.length) {
				this.anInt1040 -= this.anIntArray237.length;
				local48 = (int) (Math.random() * 12.0D);
				this.method677(this.aClass2_Sub1_Sub2_Sub3Array5[local48]);
			}
			@Pc(176) int local176;
			for (local48 = 1; local48 < 255; local48++) {
				for (local54 = 1; local54 < 127; local54++) {
					local176 = local54 + (local48 << 7);
					@Pc(199) int local199 = this.anIntArray244[local176 + 128] - this.anIntArray237[local176 + this.anInt1040 & this.anIntArray237.length - 1] / 5;
					if (local199 < 0) {
						local199 = 0;
					}
					this.anIntArray243[local176] = local199;
				}
			}
			for (local54 = 0; local54 < 255; local54++) {
				this.anIntArray255[local54] = this.anIntArray255[local54 + 1];
			}
			this.anIntArray255[255] = (int) (Math.sin((double) anInt878 / 14.0D) * 16.0D + Math.sin((double) anInt878 / 15.0D) * 14.0D + Math.sin((double) anInt878 / 16.0D) * 12.0D);
			if (this.anInt1028 > 0) {
				this.anInt1028 -= 4;
			}
			if (this.anInt1029 > 0) {
				this.anInt1029 -= 4;
			}
			if (this.anInt1028 == 0 && this.anInt1029 == 0) {
				local176 = (int) (Math.random() * 2000.0D);
				if (local176 == 0) {
					this.anInt1028 = 1024;
				}
				if (local176 == 1) {
					this.anInt1029 = 1024;
					return;
				}
			}
		} catch (@Pc(310) RuntimeException local310) {
			signlink.reporterror("70498, " + 5 + ", " + local310.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(Z)V")
	private void method595() {
		try {
			for (@Pc(1) int local1 = 0; local1 < this.anInt964; local1++) {
				@Pc(8) int local8 = this.anIntArray250[local1];
				@Pc(13) Class2_Sub1_Sub1_Sub4_Sub1 local13 = this.aClass2_Sub1_Sub1_Sub4_Sub1Array1[local8];
				if (local13 != null) {
					this.method596(local13.aClass45_1.aByte22, local13);
				}
			}
		} catch (@Pc(34) RuntimeException local34) {
			signlink.reporterror("79866, " + true + ", " + local34.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IZLclient!NQXGETKS;)V")
	private void method596(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub1_Sub1_Sub4 arg1) {
		try {
			if (arg1.anInt541 < 128 || arg1.anInt542 < 128 || arg1.anInt541 >= 13184 || arg1.anInt542 >= 13184) {
				arg1.anInt573 = -1;
				arg1.anInt535 = -1;
				arg1.anInt570 = 0;
				arg1.anInt571 = 0;
				arg1.anInt541 = arg1.anIntArray143[0] * 128 + arg1.anInt552 * 64;
				arg1.anInt542 = arg1.anIntArray144[0] * 128 + arg1.anInt552 * 64;
				arg1.method444(this.aByte37);
			}
			if (arg1 == aClass2_Sub1_Sub1_Sub4_Sub2_1 && (arg1.anInt541 < 1536 || arg1.anInt542 < 1536 || arg1.anInt541 >= 11776 || arg1.anInt542 >= 11776)) {
				arg1.anInt573 = -1;
				arg1.anInt535 = -1;
				arg1.anInt570 = 0;
				arg1.anInt571 = 0;
				arg1.anInt541 = arg1.anIntArray143[0] * 128 + arg1.anInt552 * 64;
				arg1.anInt542 = arg1.anIntArray144[0] * 128 + arg1.anInt552 * 64;
				arg1.method444(this.aByte37);
			}
			if (arg1.anInt570 > anInt878) {
				this.method597(arg1);
			} else if (arg1.anInt571 >= anInt878) {
				this.method598(arg1);
			} else {
				this.method599(arg1, this.aBoolean188);
			}
			this.method600(arg1);
			this.method601(arg1);
		} catch (@Pc(159) RuntimeException local159) {
			signlink.reporterror("2929, " + arg0 + ", " + true + ", " + arg1 + ", " + local159.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(BLclient!NQXGETKS;)V")
	private void method597(@OriginalArg(1) Class2_Sub1_Sub1_Sub4 arg0) {
		try {
			@Pc(4) int local4 = arg0.anInt570 - anInt878;
			@Pc(14) int local14 = arg0.anInt566 * 128 + arg0.anInt552 * 64;
			@Pc(24) int local24 = arg0.anInt568 * 128 + arg0.anInt552 * 64;
			arg0.anInt541 += (local14 - arg0.anInt541) / local4;
			arg0.anInt542 += (local24 - arg0.anInt542) / local4;
			arg0.anInt560 = 0;
			if (arg0.anInt572 == 0) {
				arg0.anInt551 = 1024;
			}
			if (arg0.anInt572 == 1) {
				arg0.anInt551 = 1536;
			}
			if (arg0.anInt572 == 2) {
				arg0.anInt551 = 0;
			}
			if (arg0.anInt572 == 3) {
				arg0.anInt551 = 512;
			}
		} catch (@Pc(83) RuntimeException local83) {
			signlink.reporterror("39126, " + -23 + ", " + arg0 + ", " + local83.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!NQXGETKS;I)V")
	private void method598(@OriginalArg(0) Class2_Sub1_Sub1_Sub4 arg0) {
		try {
			if (arg0.anInt571 == anInt878 || arg0.anInt573 == -1 || arg0.anInt576 != 0 || arg0.anInt575 + 1 > Class10.aClass10Array1[arg0.anInt573].method160(arg0.anInt574)) {
				@Pc(29) int local29 = arg0.anInt571 - arg0.anInt570;
				@Pc(34) int local34 = anInt878 - arg0.anInt570;
				@Pc(44) int local44 = arg0.anInt566 * 128 + arg0.anInt552 * 64;
				@Pc(54) int local54 = arg0.anInt568 * 128 + arg0.anInt552 * 64;
				@Pc(64) int local64 = arg0.anInt567 * 128 + arg0.anInt552 * 64;
				@Pc(74) int local74 = arg0.anInt569 * 128 + arg0.anInt552 * 64;
				arg0.anInt541 = (local44 * (local29 - local34) + local64 * local34) / local29;
				arg0.anInt542 = (local54 * (local29 - local34) + local74 * local34) / local29;
			}
			arg0.anInt560 = 0;
			if (arg0.anInt572 == 0) {
				arg0.anInt551 = 1024;
			}
			if (arg0.anInt572 == 1) {
				arg0.anInt551 = 1536;
			}
			if (arg0.anInt572 == 2) {
				arg0.anInt551 = 0;
			}
			if (arg0.anInt572 == 3) {
				arg0.anInt551 = 512;
			}
			arg0.anInt543 = arg0.anInt551;
		} catch (@Pc(141) RuntimeException local141) {
			signlink.reporterror("96044, " + arg0 + ", " + 924 + ", " + local141.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!NQXGETKS;Z)V")
	private void method599(@OriginalArg(0) Class2_Sub1_Sub1_Sub4 arg0, @OriginalArg(1) boolean arg1) {
		try {
			arg0.anInt562 = arg0.anInt549;
			if (arg0.anInt558 == 0) {
				arg0.anInt560 = 0;
			} else {
				if (arg0.anInt573 != -1 && arg0.anInt576 == 0) {
					@Pc(24) Class10 local24 = Class10.aClass10Array1[arg0.anInt573];
					if (arg0.anInt544 > 0 && local24.anInt204 == 0) {
						arg0.anInt560++;
						return;
					}
					if (arg0.anInt544 <= 0 && local24.anInt205 == 0) {
						arg0.anInt560++;
						return;
					}
				}
				@Pc(53) int local53 = arg0.anInt541;
				@Pc(56) int local56 = arg0.anInt542;
				@Pc(71) int local71 = arg0.anIntArray143[arg0.anInt558 - 1] * 128 + arg0.anInt552 * 64;
				@Pc(86) int local86 = arg0.anIntArray144[arg0.anInt558 - 1] * 128 + arg0.anInt552 * 64;
				if (local71 - local53 <= 256 && local71 - local53 >= -256 && local86 - local56 <= 256 && local86 - local56 >= -256) {
					if (local53 < local71) {
						if (local56 < local86) {
							arg0.anInt551 = 1280;
						} else if (local56 > local86) {
							arg0.anInt551 = 1792;
						} else {
							arg0.anInt551 = 1536;
						}
					} else if (local53 > local71) {
						if (local56 < local86) {
							arg0.anInt551 = 768;
						} else if (local56 > local86) {
							arg0.anInt551 = 256;
						} else {
							arg0.anInt551 = 512;
						}
					} else if (local56 < local86) {
						arg0.anInt551 = 1024;
					} else {
						arg0.anInt551 = 0;
					}
					@Pc(180) int local180 = arg0.anInt551 - arg0.anInt543 & 0x7FF;
					if (local180 > 1024) {
						local180 -= 2048;
					}
					@Pc(187) int local187 = arg0.anInt546;
					if (local180 >= -256 && local180 <= 256) {
						local187 = arg0.anInt545;
					} else if (local180 >= 256 && local180 < 768) {
						local187 = arg0.anInt548;
					} else if (local180 >= -768 && local180 <= -256) {
						local187 = arg0.anInt547;
					}
					if (local187 == -1) {
						local187 = arg0.anInt545;
					}
					arg0.anInt562 = local187;
					@Pc(229) int local229 = 4;
					if (arg1) {
						for (@Pc(233) int local233 = 1; local233 > 0; local233++) {
						}
					}
					if (arg0.anInt543 != arg0.anInt551 && arg0.anInt565 == -1 && arg0.anInt561 != 0) {
						local229 = 2;
					}
					if (arg0.anInt558 > 2) {
						local229 = 6;
					}
					if (arg0.anInt558 > 3) {
						local229 = 8;
					}
					if (arg0.anInt560 > 0 && arg0.anInt558 > 1) {
						local229 = 8;
						arg0.anInt560--;
					}
					if (arg0.aBooleanArray7[arg0.anInt558 - 1]) {
						local229 <<= 0x1;
					}
					if (local229 >= 8 && arg0.anInt562 == arg0.anInt545 && arg0.anInt559 != -1) {
						arg0.anInt562 = arg0.anInt559;
					}
					if (local53 < local71) {
						arg0.anInt541 += local229;
						if (arg0.anInt541 > local71) {
							arg0.anInt541 = local71;
						}
					} else if (local53 > local71) {
						arg0.anInt541 -= local229;
						if (arg0.anInt541 < local71) {
							arg0.anInt541 = local71;
						}
					}
					if (local56 < local86) {
						arg0.anInt542 += local229;
						if (arg0.anInt542 > local86) {
							arg0.anInt542 = local86;
						}
					} else if (local56 > local86) {
						arg0.anInt542 -= local229;
						if (arg0.anInt542 < local86) {
							arg0.anInt542 = local86;
						}
					}
					if (arg0.anInt541 == local71 && arg0.anInt542 == local86) {
						arg0.anInt558--;
						if (arg0.anInt544 > 0) {
							arg0.anInt544--;
							return;
						}
					}
				} else {
					arg0.anInt541 = local71;
					arg0.anInt542 = local86;
				}
			}
		} catch (@Pc(400) RuntimeException local400) {
			signlink.reporterror("9847, " + arg0 + ", " + arg1 + ", " + local400.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Lclient!NQXGETKS;I)V")
	private void method600(@OriginalArg(0) Class2_Sub1_Sub1_Sub4 arg0) {
		try {
			if (arg0.anInt561 != 0) {
				@Pc(30) int local30;
				@Pc(36) int local36;
				if (arg0.anInt565 != -1 && arg0.anInt565 < 32768) {
					@Pc(22) Class2_Sub1_Sub1_Sub4_Sub1 local22 = this.aClass2_Sub1_Sub1_Sub4_Sub1Array1[arg0.anInt565];
					if (local22 != null) {
						local30 = arg0.anInt541 - local22.anInt541;
						local36 = arg0.anInt542 - local22.anInt542;
						if (local30 != 0 || local36 != 0) {
							arg0.anInt551 = (int) (Math.atan2((double) local30, (double) local36) * 325.949D) & 0x7FF;
						}
					}
				}
				@Pc(61) int local61;
				if (arg0.anInt565 >= 32768) {
					local61 = arg0.anInt565 - 32768;
					if (local61 == this.anInt1006) {
						local61 = this.anInt901;
					}
					@Pc(73) Class2_Sub1_Sub1_Sub4_Sub2 local73 = this.aClass2_Sub1_Sub1_Sub4_Sub2Array1[local61];
					if (local73 != null) {
						local36 = arg0.anInt541 - local73.anInt541;
						@Pc(87) int local87 = arg0.anInt542 - local73.anInt542;
						if (local36 != 0 || local87 != 0) {
							arg0.anInt551 = (int) (Math.atan2((double) local36, (double) local87) * 325.949D) & 0x7FF;
						}
					}
				}
				if ((arg0.anInt555 != 0 || arg0.anInt556 != 0) && (arg0.anInt558 == 0 || arg0.anInt560 > 0)) {
					local61 = arg0.anInt541 - (arg0.anInt555 - this.anInt874 - this.anInt874) * 64;
					local30 = arg0.anInt542 - (arg0.anInt556 - this.anInt875 - this.anInt875) * 64;
					if (local61 != 0 || local30 != 0) {
						arg0.anInt551 = (int) (Math.atan2((double) local61, (double) local30) * 325.949D) & 0x7FF;
					}
					arg0.anInt555 = 0;
					arg0.anInt556 = 0;
				}
				local61 = arg0.anInt551 - arg0.anInt543 & 0x7FF;
				if (local61 != 0) {
					if (local61 < arg0.anInt561 || local61 > 2048 - arg0.anInt561) {
						arg0.anInt543 = arg0.anInt551;
					} else if (local61 > 1024) {
						arg0.anInt543 -= arg0.anInt561;
					} else {
						arg0.anInt543 += arg0.anInt561;
					}
					arg0.anInt543 &= 0x7FF;
					if (arg0.anInt562 == arg0.anInt549 && arg0.anInt543 != arg0.anInt551) {
						if (arg0.anInt550 != -1) {
							arg0.anInt562 = arg0.anInt550;
							return;
						}
						arg0.anInt562 = arg0.anInt545;
						return;
					}
				}
			}
		} catch (@Pc(241) RuntimeException local241) {
			signlink.reporterror("40122, " + arg0 + ", " + 0 + ", " + local241.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILclient!NQXGETKS;)V")
	private void method601(@OriginalArg(1) Class2_Sub1_Sub1_Sub4 arg0) {
		try {
			arg0.aBoolean142 = false;
			@Pc(20) Class10 local20;
			if (arg0.anInt562 != -1) {
				local20 = Class10.aClass10Array1[arg0.anInt562];
				arg0.anInt564++;
				if (arg0.anInt563 < local20.anInt198 && arg0.anInt564 > local20.method160(arg0.anInt563)) {
					arg0.anInt564 = 0;
					arg0.anInt563++;
				}
				if (arg0.anInt563 >= local20.anInt198) {
					arg0.anInt564 = 0;
					arg0.anInt563 = 0;
				}
			}
			if (arg0.anInt535 != -1 && anInt878 >= arg0.anInt538) {
				if (arg0.anInt536 < 0) {
					arg0.anInt536 = 0;
				}
				local20 = Class4.aClass4Array1[arg0.anInt535].aClass10_1;
				arg0.anInt537++;
				while (arg0.anInt536 < local20.anInt198 && arg0.anInt537 > local20.method160(arg0.anInt536)) {
					arg0.anInt537 -= local20.method160(arg0.anInt536);
					arg0.anInt536++;
				}
				if (arg0.anInt536 >= local20.anInt198 && (arg0.anInt536 < 0 || arg0.anInt536 >= local20.anInt198)) {
					arg0.anInt535 = -1;
				}
			}
			if (arg0.anInt573 != -1 && arg0.anInt576 <= 1) {
				local20 = Class10.aClass10Array1[arg0.anInt573];
				if (local20.anInt204 == 1 && arg0.anInt544 > 0 && arg0.anInt570 <= anInt878 && arg0.anInt571 < anInt878) {
					arg0.anInt576 = 1;
					return;
				}
			}
			if (arg0.anInt573 != -1 && arg0.anInt576 == 0) {
				local20 = Class10.aClass10Array1[arg0.anInt573];
				arg0.anInt575++;
				while (arg0.anInt574 < local20.anInt198 && arg0.anInt575 > local20.method160(arg0.anInt574)) {
					arg0.anInt575 -= local20.method160(arg0.anInt574);
					arg0.anInt574++;
				}
				if (arg0.anInt574 >= local20.anInt198) {
					arg0.anInt574 -= local20.anInt199;
					arg0.anInt577++;
					if (arg0.anInt577 >= local20.anInt203) {
						arg0.anInt573 = -1;
					}
					if (arg0.anInt574 < 0 || arg0.anInt574 >= local20.anInt198) {
						arg0.anInt573 = -1;
					}
				}
				arg0.aBoolean142 = local20.aBoolean57;
			}
			if (arg0.anInt576 > 0) {
				arg0.anInt576--;
			}
		} catch (@Pc(265) RuntimeException local265) {
			signlink.reporterror("67618, " + -530 + ", " + arg0 + ", " + local265.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "g", descriptor = "(I)V")
	private void method602() {
		try {
			if (this.anInt857 == -1 || this.anInt945 != 2 && super.aClass17_2 == null) {
				if (this.aBoolean183) {
					this.method719();
					this.aBoolean183 = false;
					this.aClass17_12.method196(super.aGraphics2, 0, 4);
					this.aClass17_13.method196(super.aGraphics2, 0, 357);
					this.aClass17_14.method196(super.aGraphics2, 722, 4);
					this.aClass17_15.method196(super.aGraphics2, 743, 205);
					this.aClass17_16.method196(super.aGraphics2, 0, 0);
					this.aClass17_17.method196(super.aGraphics2, 516, 4);
					this.aClass17_18.method196(super.aGraphics2, 516, 205);
					this.aClass17_19.method196(super.aGraphics2, 496, 357);
					this.aClass17_20.method196(super.aGraphics2, 0, 338);
					this.aBoolean228 = true;
					this.aBoolean225 = true;
					this.aBoolean190 = true;
					this.aBoolean189 = true;
					if (this.anInt945 != 2) {
						this.aClass17_23.method196(super.aGraphics2, 4, 4);
						this.aClass17_22.method196(super.aGraphics2, 550, 4);
					}
				}
				if (this.anInt945 == 2) {
					this.method653(this.aByte45);
				}
				if (this.aBoolean224 && this.anInt869 == 1) {
					this.aBoolean228 = true;
				}
				@Pc(286) boolean local286;
				if (this.anInt1003 != -1) {
					local286 = this.method605(this.anInt1003, this.anInt848, (byte) 5);
					if (local286) {
						this.aBoolean228 = true;
					}
				}
				if (this.anInt943 == 2) {
					this.aBoolean228 = true;
				}
				if (this.anInt1043 == 2) {
					this.aBoolean228 = true;
				}
				if (this.aBoolean228) {
					this.method707();
					this.aBoolean228 = false;
				}
				@Pc(371) int local371;
				if (this.anInt974 == -1 && this.anInt825 == 0) {
					this.aClass31_1.anInt434 = this.anInt970 - this.anInt968 - 77;
					if (super.anInt809 > 448 && super.anInt809 < 560 && super.anInt810 > 332) {
						this.method695(super.anInt810 - 357, super.anInt809 - 17, this.aClass31_1, this.anInt970, 77, -1, 463, 0);
					}
					local371 = this.anInt970 - this.aClass31_1.anInt434 - 77;
					if (local371 < 0) {
						local371 = 0;
					}
					if (local371 > this.anInt970 - 77) {
						local371 = this.anInt970 - 77;
					}
					if (this.anInt968 != local371) {
						this.anInt968 = local371;
						this.aBoolean225 = true;
					}
				}
				if (this.anInt974 == -1 && this.anInt825 == 3) {
					local371 = this.anInt826 * 14 + 7;
					this.aClass31_1.anInt434 = this.anInt827;
					if (super.anInt809 > 448 && super.anInt809 < 560 && super.anInt810 > 332) {
						this.method695(super.anInt810 - 357, super.anInt809 - 17, this.aClass31_1, local371, 77, -1, 463, 0);
					}
					@Pc(450) int local450 = this.aClass31_1.anInt434;
					if (local450 < 0) {
						local450 = 0;
					}
					if (local450 > local371 - 77) {
						local450 = local371 - 77;
					}
					if (this.anInt827 != local450) {
						this.anInt827 = local450;
						this.aBoolean225 = true;
					}
				}
				if (this.anInt974 != -1) {
					local286 = this.method605(this.anInt974, this.anInt848, (byte) 5);
					if (local286) {
						this.aBoolean225 = true;
					}
				}
				if (this.anInt943 == 3) {
					this.aBoolean225 = true;
				}
				if (this.anInt1043 == 3) {
					this.aBoolean225 = true;
				}
				if (this.aString20 != null) {
					this.aBoolean225 = true;
				}
				if (this.aBoolean224 && this.anInt869 == 2) {
					this.aBoolean225 = true;
				}
				if (this.aBoolean225) {
					this.method628(this.aBoolean217);
					this.aBoolean225 = false;
				}
				if (this.anInt945 == 2) {
					this.method678();
					this.aClass17_22.method196(super.aGraphics2, 550, 4);
				}
				if (this.anInt865 != -1) {
					this.aBoolean190 = true;
				}
				if (this.aBoolean190) {
					if (this.anInt865 != -1 && this.anInt865 == this.anInt921) {
						this.anInt865 = -1;
						this.aClass2_Sub1_Sub3_6.method256(170);
						this.aClass2_Sub1_Sub3_6.method257(this.anInt921);
					}
					this.aBoolean190 = false;
					this.aClass17_27.method195();
					this.aClass2_Sub1_Sub2_Sub3_10.method541(0, 0);
					if (this.anInt1003 == -1) {
						if (this.anIntArray252[this.anInt921] != -1) {
							if (this.anInt921 == 0) {
								this.aClass2_Sub1_Sub2_Sub3_16.method541(22, 10);
							}
							if (this.anInt921 == 1) {
								this.aClass2_Sub1_Sub2_Sub3_17.method541(54, 8);
							}
							if (this.anInt921 == 2) {
								this.aClass2_Sub1_Sub2_Sub3_17.method541(82, 8);
							}
							if (this.anInt921 == 3) {
								this.aClass2_Sub1_Sub2_Sub3_18.method541(110, 8);
							}
							if (this.anInt921 == 4) {
								this.aClass2_Sub1_Sub2_Sub3_20.method541(153, 8);
							}
							if (this.anInt921 == 5) {
								this.aClass2_Sub1_Sub2_Sub3_20.method541(181, 8);
							}
							if (this.anInt921 == 6) {
								this.aClass2_Sub1_Sub2_Sub3_19.method541(209, 9);
							}
						}
						if (this.anIntArray252[0] != -1 && (this.anInt865 != 0 || anInt878 % 20 < 10)) {
							this.aClass2_Sub1_Sub2_Sub3Array4[0].method541(29, 13);
						}
						if (this.anIntArray252[1] != -1 && (this.anInt865 != 1 || anInt878 % 20 < 10)) {
							this.aClass2_Sub1_Sub2_Sub3Array4[1].method541(53, 11);
						}
						if (this.anIntArray252[2] != -1 && (this.anInt865 != 2 || anInt878 % 20 < 10)) {
							this.aClass2_Sub1_Sub2_Sub3Array4[2].method541(82, 11);
						}
						if (this.anIntArray252[3] != -1 && (this.anInt865 != 3 || anInt878 % 20 < 10)) {
							this.aClass2_Sub1_Sub2_Sub3Array4[3].method541(115, 12);
						}
						if (this.anIntArray252[4] != -1 && (this.anInt865 != 4 || anInt878 % 20 < 10)) {
							this.aClass2_Sub1_Sub2_Sub3Array4[4].method541(153, 13);
						}
						if (this.anIntArray252[5] != -1 && (this.anInt865 != 5 || anInt878 % 20 < 10)) {
							this.aClass2_Sub1_Sub2_Sub3Array4[5].method541(180, 11);
						}
						if (this.anIntArray252[6] != -1 && (this.anInt865 != 6 || anInt878 % 20 < 10)) {
							this.aClass2_Sub1_Sub2_Sub3Array4[6].method541(208, 13);
						}
					}
					this.aClass17_27.method196(super.aGraphics2, 516, 160);
					this.aClass17_26.method195();
					this.aClass2_Sub1_Sub2_Sub3_9.method541(0, 0);
					if (this.anInt1003 == -1) {
						if (this.anIntArray252[this.anInt921] != -1) {
							if (this.anInt921 == 7) {
								this.aClass2_Sub1_Sub2_Sub3_1.method541(42, 0);
							}
							if (this.anInt921 == 8) {
								this.aClass2_Sub1_Sub2_Sub3_2.method541(74, 0);
							}
							if (this.anInt921 == 9) {
								this.aClass2_Sub1_Sub2_Sub3_2.method541(102, 0);
							}
							if (this.anInt921 == 10) {
								this.aClass2_Sub1_Sub2_Sub3_3.method541(130, 1);
							}
							if (this.anInt921 == 11) {
								this.aClass2_Sub1_Sub2_Sub3_5.method541(173, 0);
							}
							if (this.anInt921 == 12) {
								this.aClass2_Sub1_Sub2_Sub3_5.method541(201, 0);
							}
							if (this.anInt921 == 13) {
								this.aClass2_Sub1_Sub2_Sub3_4.method541(229, 0);
							}
						}
						if (this.anIntArray252[8] != -1 && (this.anInt865 != 8 || anInt878 % 20 < 10)) {
							this.aClass2_Sub1_Sub2_Sub3Array4[7].method541(74, 2);
						}
						if (this.anIntArray252[9] != -1 && (this.anInt865 != 9 || anInt878 % 20 < 10)) {
							this.aClass2_Sub1_Sub2_Sub3Array4[8].method541(102, 3);
						}
						if (this.anIntArray252[10] != -1 && (this.anInt865 != 10 || anInt878 % 20 < 10)) {
							this.aClass2_Sub1_Sub2_Sub3Array4[9].method541(137, 4);
						}
						if (this.anIntArray252[11] != -1 && (this.anInt865 != 11 || anInt878 % 20 < 10)) {
							this.aClass2_Sub1_Sub2_Sub3Array4[10].method541(174, 2);
						}
						if (this.anIntArray252[12] != -1 && (this.anInt865 != 12 || anInt878 % 20 < 10)) {
							this.aClass2_Sub1_Sub2_Sub3Array4[11].method541(201, 2);
						}
						if (this.anIntArray252[13] != -1 && (this.anInt865 != 13 || anInt878 % 20 < 10)) {
							this.aClass2_Sub1_Sub2_Sub3Array4[12].method541(226, 2);
						}
					}
					this.aClass17_26.method196(super.aGraphics2, 496, 466);
					this.aClass17_23.method195();
					Class2_Sub1_Sub2_Sub1.anIntArray9 = this.anIntArray267;
				}
				if (this.aBoolean189) {
					this.aBoolean189 = false;
					this.aClass17_25.method195();
					this.aClass2_Sub1_Sub2_Sub3_8.method541(0, 0);
					this.aClass2_Sub1_Sub2_Sub4_3.method559(true, "Public chat", this.aByte43, 16777215, 28, 55);
					if (this.anInt918 == 0) {
						this.aClass2_Sub1_Sub2_Sub4_3.method559(true, "On", this.aByte43, 65280, 41, 55);
					}
					if (this.anInt918 == 1) {
						this.aClass2_Sub1_Sub2_Sub4_3.method559(true, "Friends", this.aByte43, 16776960, 41, 55);
					}
					if (this.anInt918 == 2) {
						this.aClass2_Sub1_Sub2_Sub4_3.method559(true, "Off", this.aByte43, 16711680, 41, 55);
					}
					if (this.anInt918 == 3) {
						this.aClass2_Sub1_Sub2_Sub4_3.method559(true, "Hide", this.aByte43, 65535, 41, 55);
					}
					this.aClass2_Sub1_Sub2_Sub4_3.method559(true, "Private chat", this.aByte43, 16777215, 28, 184);
					if (this.anInt842 == 0) {
						this.aClass2_Sub1_Sub2_Sub4_3.method559(true, "On", this.aByte43, 65280, 41, 184);
					}
					if (this.anInt842 == 1) {
						this.aClass2_Sub1_Sub2_Sub4_3.method559(true, "Friends", this.aByte43, 16776960, 41, 184);
					}
					if (this.anInt842 == 2) {
						this.aClass2_Sub1_Sub2_Sub4_3.method559(true, "Off", this.aByte43, 16711680, 41, 184);
					}
					this.aClass2_Sub1_Sub2_Sub4_3.method559(true, "Trade/compete", this.aByte43, 16777215, 28, 324);
					if (this.anInt833 == 0) {
						this.aClass2_Sub1_Sub2_Sub4_3.method559(true, "On", this.aByte43, 65280, 41, 324);
					}
					if (this.anInt833 == 1) {
						this.aClass2_Sub1_Sub2_Sub4_3.method559(true, "Friends", this.aByte43, 16776960, 41, 324);
					}
					if (this.anInt833 == 2) {
						this.aClass2_Sub1_Sub2_Sub4_3.method559(true, "Off", this.aByte43, 16711680, 41, 324);
					}
					this.aClass2_Sub1_Sub2_Sub4_3.method559(true, "Report abuse", this.aByte43, 16777215, 33, 458);
					this.aClass17_25.method196(super.aGraphics2, 0, 453);
					this.aClass17_23.method195();
					Class2_Sub1_Sub2_Sub1.anIntArray9 = this.anIntArray267;
				}
				this.anInt848 = 0;
			} else {
				if (this.anInt945 == 2) {
					this.method605(this.anInt857, this.anInt848, (byte) 5);
					if (this.anInt854 != -1) {
						this.method605(this.anInt854, this.anInt848, (byte) 5);
					}
					this.anInt848 = 0;
					this.method650();
					super.aClass17_2.method195();
					Class2_Sub1_Sub2_Sub1.anIntArray9 = this.anIntArray268;
					Class2_Sub1_Sub2.method548();
					this.aBoolean183 = true;
					@Pc(64) Class31 local64 = Class31.method366(this.anInt857);
					if (local64.anInt430 == 512 && local64.anInt429 == 334 && local64.anInt422 == 0) {
						local64.anInt430 = 765;
						local64.anInt429 = 503;
					}
					this.method612(0, 0, local64, 0);
					if (this.anInt854 != -1) {
						local64 = Class31.method366(this.anInt854);
						if (local64.anInt430 == 512 && local64.anInt429 == 334 && local64.anInt422 == 0) {
							local64.anInt430 = 765;
							local64.anInt429 = 503;
						}
						this.method612(0, 0, local64, 0);
					}
					if (this.aBoolean224) {
						this.method713();
					} else {
						this.method693();
						this.method709();
					}
				}
				super.aClass17_2.method196(super.aGraphics2, 0, 0);
			}
		} catch (@Pc(1295) RuntimeException local1295) {
			signlink.reporterror("64835, " + 4 + ", " + local1295.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;Z)V")
	private void method603(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) boolean arg2) {
		signlink.errorname = arg0;
		try {
			if (!arg2) {
				this.aString18 = "";
				this.aString19 = "Connecting to server...";
				this.method657(true, this.anInt916);
			}
			this.aClass14_1 = new Class14((byte) -87, this, this.method702(anInt907 + 43594));
			@Pc(31) long local31 = Class28.method346(arg0);
			@Pc(38) int local38 = (int) (local31 >> 16 & 0x1FL);
			this.aClass2_Sub1_Sub3_6.anInt283 = 0;
			this.aClass2_Sub1_Sub3_6.method257(14);
			this.aClass2_Sub1_Sub3_6.method257(local38);
			this.aClass14_1.method191(this.aClass2_Sub1_Sub3_6.aByteArray7, 2);
			for (@Pc(61) int local61 = 0; local61 < 8; local61++) {
				this.aClass14_1.method188();
			}
			@Pc(75) int local75 = this.aClass14_1.method188();
			@Pc(77) int local77 = local75;
			@Pc(226) int local226;
			@Pc(260) int local260;
			if (local75 == 0) {
				this.aClass14_1.method190(this.aClass2_Sub1_Sub3_9.aByteArray7, 0, 8);
				this.aClass2_Sub1_Sub3_9.anInt283 = 0;
				this.aLong30 = this.aClass2_Sub1_Sub3_9.method273();
				@Pc(100) int[] local100 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (this.aLong30 >> 32), (int) this.aLong30 };
				this.aClass2_Sub1_Sub3_6.anInt283 = 0;
				this.aClass2_Sub1_Sub3_6.method257(10);
				this.aClass2_Sub1_Sub3_6.method261(local100[0]);
				this.aClass2_Sub1_Sub3_6.method261(local100[1]);
				this.aClass2_Sub1_Sub3_6.method261(local100[2]);
				this.aClass2_Sub1_Sub3_6.method261(local100[3]);
				this.aClass2_Sub1_Sub3_6.method261(signlink.anInt1053);
				this.aClass2_Sub1_Sub3_6.method264(arg0);
				this.aClass2_Sub1_Sub3_6.method264(arg1);
				this.aClass2_Sub1_Sub3_6.method282(aBigInteger1, aBigInteger2);
				this.aClass2_Sub1_Sub3_8.anInt283 = 0;
				if (arg2) {
					this.aClass2_Sub1_Sub3_8.method257(18);
				} else {
					this.aClass2_Sub1_Sub3_8.method257(16);
				}
				this.aClass2_Sub1_Sub3_8.method257(this.aClass2_Sub1_Sub3_6.anInt283 + 36 + 1 + 1 + 2);
				this.aClass2_Sub1_Sub3_8.method257(255);
				this.aClass2_Sub1_Sub3_8.method258(356);
				this.aClass2_Sub1_Sub3_8.method257(aBoolean197 ? 1 : 0);
				for (local226 = 0; local226 < 9; local226++) {
					this.aClass2_Sub1_Sub3_8.method261(this.anIntArray257[local226]);
				}
				this.aClass2_Sub1_Sub3_8.method265(this.aClass2_Sub1_Sub3_6.aByteArray7, this.aClass2_Sub1_Sub3_6.anInt283);
				this.aClass2_Sub1_Sub3_6.aClass26_1 = new Class26(-568, local100);
				for (local260 = 0; local260 < 4; local260++) {
					local100[local260] += 50;
				}
				this.aClass26_2 = new Class26(-568, local100);
				this.aClass14_1.method191(this.aClass2_Sub1_Sub3_8.aByteArray7, this.aClass2_Sub1_Sub3_8.anInt283);
				local75 = this.aClass14_1.method188();
			}
			if (local75 == 1) {
				try {
					Thread.sleep(2000L);
				} catch (@Pc(302) Exception local302) {
				}
				this.method603(arg0, arg1, arg2);
			} else {
				@Pc(390) int local390;
				if (local75 == 2) {
					this.anInt967 = this.aClass14_1.method188();
					aBoolean222 = this.aClass14_1.method188() == 1;
					this.aLong31 = 0L;
					this.anInt1023 = 0;
					this.aClass12_1.anInt220 = 0;
					super.aBoolean181 = true;
					this.aBoolean191 = true;
					this.aBoolean204 = true;
					this.aClass2_Sub1_Sub3_6.anInt283 = 0;
					this.aClass2_Sub1_Sub3_9.anInt283 = 0;
					this.anInt895 = -1;
					this.anInt859 = -1;
					this.anInt860 = -1;
					this.anInt861 = -1;
					this.anInt894 = 0;
					this.anInt896 = 0;
					this.anInt992 = 0;
					this.anInt898 = 0;
					this.anInt927 = 0;
					this.anInt849 = 0;
					this.aBoolean224 = false;
					super.anInt807 = 0;
					for (local390 = 0; local390 < 100; local390++) {
						this.aStringArray12[local390] = null;
					}
					this.anInt884 = 0;
					this.anInt888 = 0;
					this.anInt945 = 0;
					this.anInt995 = 0;
					this.anInt846 = (int) (Math.random() * 100.0D) - 50;
					this.anInt930 = (int) (Math.random() * 110.0D) - 55;
					this.anInt922 = (int) (Math.random() * 80.0D) - 40;
					this.anInt1012 = (int) (Math.random() * 120.0D) - 60;
					this.anInt1032 = (int) (Math.random() * 30.0D) - 20;
					this.anInt822 = (int) (Math.random() * 20.0D) - 10 & 0x7FF;
					this.anInt1030 = 0;
					this.anInt944 = -1;
					this.anInt910 = 0;
					this.anInt911 = 0;
					this.anInt902 = 0;
					this.anInt964 = 0;
					for (local226 = 0; local226 < this.anInt900; local226++) {
						this.aClass2_Sub1_Sub1_Sub4_Sub2Array1[local226] = null;
						this.aClass2_Sub1_Sub3Array1[local226] = null;
					}
					for (local260 = 0; local260 < 16384; local260++) {
						this.aClass2_Sub1_Sub1_Sub4_Sub1Array1[local260] = null;
					}
					aClass2_Sub1_Sub1_Sub4_Sub2_1 = this.aClass2_Sub1_Sub1_Sub4_Sub2Array1[this.anInt901] = new Class2_Sub1_Sub1_Sub4_Sub2();
					this.aClass29_11.method359();
					this.aClass29_12.method359();
					@Pc(535) int local535;
					@Pc(539) int local539;
					for (@Pc(531) int local531 = 0; local531 < 4; local531++) {
						for (local535 = 0; local535 < 104; local535++) {
							for (local539 = 0; local539 < 104; local539++) {
								this.aClass29ArrayArrayArray1[local531][local535][local539] = null;
							}
						}
					}
					this.aClass29_10 = new Class29(0);
					this.anInt989 = 0;
					this.anInt988 = 0;
					this.method724(this.anInt856);
					this.anInt856 = -1;
					this.method724(this.anInt974);
					this.anInt974 = -1;
					this.method724(this.anInt1039);
					this.anInt1039 = -1;
					this.method724(this.anInt857);
					this.anInt857 = -1;
					this.method724(this.anInt854);
					this.anInt854 = -1;
					this.method724(this.anInt1003);
					this.anInt1003 = -1;
					this.method724(this.anInt987);
					this.anInt987 = -1;
					this.aBoolean199 = false;
					this.anInt921 = 3;
					this.anInt825 = 0;
					this.aBoolean224 = false;
					this.aBoolean182 = false;
					this.aString20 = null;
					this.anInt881 = 0;
					this.anInt865 = -1;
					this.aBoolean211 = true;
					this.method660(493);
					for (local535 = 0; local535 < 5; local535++) {
						this.anIntArray263[local535] = 0;
					}
					for (local539 = 0; local539 < 5; local539++) {
						this.aStringArray13[local539] = null;
						this.aBooleanArray11[local539] = false;
					}
					anInt1009 = 0;
					anInt851 = 0;
					anInt892 = 0;
					anInt1026 = 0;
					anInt913 = 0;
					anInt925 = 0;
					anInt1004 = 0;
					anInt1031 = 0;
					anInt830 = 0;
					this.method719();
				} else if (local75 == 3) {
					this.aString18 = "";
					this.aString19 = "Invalid username or password.";
				} else if (local75 == 4) {
					this.aString18 = "Your account has been disabled.";
					this.aString19 = "Please check your message-centre for details.";
				} else if (local75 == 5) {
					this.aString18 = "Your account is already logged in.";
					this.aString19 = "Try again in 60 secs...";
				} else if (local75 == 6) {
					this.aString18 = "RuneScape has been updated!";
					this.aString19 = "Please reload this page.";
				} else if (local75 == 7) {
					this.aString18 = "This world is full.";
					this.aString19 = "Please use a different world.";
				} else if (local75 == 8) {
					this.aString18 = "Unable to connect.";
					this.aString19 = "Login server offline.";
				} else if (local75 == 9) {
					this.aString18 = "Login limit exceeded.";
					this.aString19 = "Too many connections from your address.";
				} else if (local75 == 10) {
					this.aString18 = "Unable to connect.";
					this.aString19 = "Bad session id.";
				} else if (local75 == 11) {
					this.aString18 = "Login server rejected session.";
					this.aString19 = "Please try again.";
				} else if (local75 == 12) {
					this.aString18 = "You need a members account to login to this world.";
					this.aString19 = "Please subscribe, or use a different world.";
				} else if (local75 == 13) {
					this.aString18 = "Could not complete login.";
					this.aString19 = "Please try using a different world.";
				} else if (local75 == 14) {
					this.aString18 = "The server is being updated.";
					this.aString19 = "Please wait 1 minute and try again.";
				} else if (local75 == 15) {
					this.aBoolean204 = true;
					this.aClass2_Sub1_Sub3_6.anInt283 = 0;
					this.aClass2_Sub1_Sub3_9.anInt283 = 0;
					this.anInt895 = -1;
					this.anInt859 = -1;
					this.anInt860 = -1;
					this.anInt861 = -1;
					this.anInt894 = 0;
					this.anInt896 = 0;
					this.anInt992 = 0;
					this.anInt849 = 0;
					this.aBoolean224 = false;
					this.aLong32 = System.currentTimeMillis();
				} else if (local75 == 16) {
					this.aString18 = "Login attempts exceeded.";
					this.aString19 = "Please wait 1 minute and try again.";
				} else if (local75 == 17) {
					this.aString18 = "You are standing in a members-only area.";
					this.aString19 = "To play on this world move to a free area first";
				} else if (local75 == 20) {
					this.aString18 = "Invalid loginserver requested";
					this.aString19 = "Please try using a different world.";
				} else if (local75 == 21) {
					local390 = this.aClass14_1.method188();
					for (@Pc(918) int local918 = local390 + 3; local918 >= 0; local918--) {
						this.aString18 = "You have only just left another world";
						this.aString19 = "Your profile will be transferred in: " + local918;
						this.method657(true, this.anInt916);
						try {
							Thread.sleep(1200L);
						} catch (@Pc(941) Exception local941) {
						}
					}
					this.method603(arg0, arg1, arg2);
				} else if (local75 == 22) {
					this.aString18 = "Malformed login packet.";
					this.aString19 = "Please try again.";
				} else if (local75 != -1) {
					System.out.println("response:" + local75);
					this.aString18 = "Unexpected server response";
					this.aString19 = "Please try using a different world.";
				} else if (local77 != 0) {
					this.aString18 = "No response from server";
					this.aString19 = "Please try using a different world.";
				} else if (this.anInt1010 < 2) {
					try {
						Thread.sleep(2000L);
					} catch (@Pc(973) Exception local973) {
					}
					this.anInt1010++;
					this.method603(arg0, arg1, arg2);
				} else {
					this.aString18 = "No response from loginserver";
					this.aString19 = "Please wait 1 minute and try again.";
				}
			}
		} catch (@Pc(1016) IOException local1016) {
			this.aString18 = "";
			this.aString19 = "Error connecting to server.";
		}
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(Z)V")
	private void method604(@OriginalArg(0) boolean arg0) {
		try {
			this.anInt855 = 0;
			@Pc(10) int local10 = (aClass2_Sub1_Sub1_Sub4_Sub2_1.anInt541 >> 7) + this.anInt874;
			@Pc(18) int local18 = (aClass2_Sub1_Sub1_Sub4_Sub2_1.anInt542 >> 7) + this.anInt875;
			if (arg0) {
				this.anInt895 = this.aClass2_Sub1_Sub3_9.method267();
			}
			if (local10 >= 3053 && local10 <= 3156 && local18 >= 3056 && local18 <= 3136) {
				this.anInt855 = 1;
			}
			if (local10 >= 3072 && local10 <= 3118 && local18 >= 9492 && local18 <= 9535) {
				this.anInt855 = 1;
			}
			if (this.anInt855 == 1 && local10 >= 3139 && local10 <= 3199 && local18 >= 3008 && local18 <= 3062) {
				this.anInt855 = 0;
			}
		} catch (@Pc(76) RuntimeException local76) {
			signlink.reporterror("38295, " + arg0 + ", " + local76.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIB)Z")
	private boolean method605(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte arg2) {
		try {
			@Pc(6) boolean local6 = false;
			@Pc(14) boolean local14 = false;
			@Pc(17) Class31 local17 = Class31.method366(arg0);
			for (@Pc(19) int local19 = 0; local19 < local17.anIntArray110.length && local17.anIntArray110[local19] != -1; local19++) {
				@Pc(33) Class31 local33 = Class31.method366(local17.anIntArray110[local19]);
				if (local33.anInt422 == 0) {
					local14 |= this.method605(local33.anInt433, arg1, (byte) 5);
				}
				@Pc(67) int local67;
				if (local33.anInt422 == 6 && (local33.anInt436 != -1 || local33.anInt437 != -1)) {
					@Pc(62) boolean local62 = this.method687(local33);
					if (local62) {
						local67 = local33.anInt437;
					} else {
						local67 = local33.anInt436;
					}
					if (local67 != -1) {
						@Pc(79) Class10 local79 = Class10.aClass10Array1[local67];
						local33.anInt428 += arg1;
						while (local33.anInt428 > local79.method160(local33.anInt426)) {
							local33.anInt428 -= local79.method160(local33.anInt426) + 1;
							local33.anInt426++;
							if (local33.anInt426 >= local79.anInt198) {
								local33.anInt426 -= local79.anInt199;
								if (local33.anInt426 < 0 || local33.anInt426 >= local79.anInt198) {
									local33.anInt426 = 0;
								}
							}
							local14 = true;
						}
					}
				}
				if (local33.anInt422 == 6 && local33.anInt432 != 0) {
					@Pc(150) int local150 = local33.anInt432 >> 16;
					local67 = local33.anInt432 << 16 >> 16;
					@Pc(161) int local161 = local150 * arg1;
					local67 *= arg1;
					local33.anInt439 = local33.anInt439 + local161 & 0x7FF;
					local33.anInt440 = local33.anInt440 + local67 & 0x7FF;
					local14 = true;
				}
			}
			return local14;
		} catch (@Pc(192) RuntimeException local192) {
			signlink.reporterror("95594, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local192.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "f", descriptor = "(Z)V")
	private void method606() {
		try {
			if (this.aClass17_3 == null) {
				super.aClass17_2 = null;
				this.aClass17_24 = null;
				this.aClass17_22 = null;
				this.aClass17_21 = null;
				this.aClass17_23 = null;
				this.aClass17_25 = null;
				this.aClass17_26 = null;
				this.aClass17_27 = null;
				this.aClass17_6 = new Class17(265, 128, this.method585(), anInt978);
				Class2_Sub1_Sub2.method548();
				this.aClass17_7 = new Class17(265, 128, this.method585(), anInt978);
				Class2_Sub1_Sub2.method548();
				this.aClass17_3 = new Class17(171, 509, this.method585(), anInt978);
				Class2_Sub1_Sub2.method548();
				this.aClass17_4 = new Class17(132, 360, this.method585(), anInt978);
				Class2_Sub1_Sub2.method548();
				this.aClass17_5 = new Class17(200, 360, this.method585(), anInt978);
				this.aBoolean204 &= true;
				Class2_Sub1_Sub2.method548();
				this.aClass17_8 = new Class17(238, 202, this.method585(), anInt978);
				Class2_Sub1_Sub2.method548();
				this.aClass17_9 = new Class17(238, 203, this.method585(), anInt978);
				Class2_Sub1_Sub2.method548();
				this.aClass17_10 = new Class17(94, 74, this.method585(), anInt978);
				Class2_Sub1_Sub2.method548();
				this.aClass17_11 = new Class17(94, 75, this.method585(), anInt978);
				Class2_Sub1_Sub2.method548();
				if (this.aClass13_2 != null) {
					this.method641();
					this.method591();
				}
				this.aBoolean183 = true;
			}
		} catch (@Pc(164) RuntimeException local164) {
			signlink.reporterror("69185, " + true + ", " + local164.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IILclient!LBBVYYXO;)V")
	private void method607(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class2_Sub1_Sub3 arg2) {
		try {
			@Pc(3) boolean local3 = false;
			while (arg2.anInt284 + 10 < arg0 * 8) {
				@Pc(16) int local16 = arg2.method278(11);
				if (local16 == 2047) {
					break;
				}
				if (this.aClass2_Sub1_Sub1_Sub4_Sub2Array1[local16] == null) {
					this.aClass2_Sub1_Sub1_Sub4_Sub2Array1[local16] = new Class2_Sub1_Sub1_Sub4_Sub2();
					if (this.aClass2_Sub1_Sub3Array1[local16] != null) {
						this.aClass2_Sub1_Sub1_Sub4_Sub2Array1[local16].method449(this.aClass2_Sub1_Sub3Array1[local16], this.anInt1014);
					}
				}
				this.anIntArray231[this.anInt902++] = local16;
				@Pc(63) Class2_Sub1_Sub1_Sub4_Sub2 local63 = this.aClass2_Sub1_Sub1_Sub4_Sub2Array1[local16];
				local63.anInt534 = anInt878;
				@Pc(71) int local71 = arg2.method278(5);
				if (local71 > 15) {
					local71 -= 32;
				}
				@Pc(80) int local80 = arg2.method278(1);
				if (local80 == 1) {
					this.anIntArray232[this.anInt903++] = local16;
				}
				@Pc(99) int local99 = arg2.method278(5);
				if (local99 > 15) {
					local99 -= 32;
				}
				@Pc(108) int local108 = arg2.method278(1);
				local63.method447(aClass2_Sub1_Sub1_Sub4_Sub2_1.anIntArray143[0] + local71, aClass2_Sub1_Sub1_Sub4_Sub2_1.anIntArray144[0] + local99, this.aByte41, local108 == 1);
			}
			arg2.method279();
		} catch (@Pc(137) RuntimeException local137) {
			signlink.reporterror("38061, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local137.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(I)V")
	@Override
	protected void method583() {
		try {
			if (this.aBoolean195 || this.aBoolean192 || this.aBoolean201) {
				this.method636();
			} else {
				anInt1019++;
				if (this.aBoolean204) {
					this.method602();
				} else {
					this.method657(false, this.anInt916);
				}
				this.anInt899 = 0;
			}
		} catch (@Pc(40) RuntimeException local40) {
			signlink.reporterror("48438, " + 0 + ", " + local40.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "h", descriptor = "(I)V")
	private void method608(@OriginalArg(0) int arg0) {
		try {
			@Pc(5) boolean local5 = false;
			if (this.anInt945 == 2) {
				for (@Pc(14) Class2_Sub3 local14 = (Class2_Sub3) this.aClass29_10.method355(); local14 != null; local14 = (Class2_Sub3) this.aClass29_10.method357()) {
					if (local14.anInt221 > 0) {
						local14.anInt221--;
					}
					if (local14.anInt221 != 0) {
						if (local14.anInt232 > 0) {
							local14.anInt232--;
						}
						if (local14.anInt232 == 0 && local14.anInt227 >= 1 && local14.anInt228 >= 1 && local14.anInt227 <= 102 && local14.anInt228 <= 102 && (local14.anInt229 < 0 || Class11.method172(local14.anInt231, local14.anInt229))) {
							this.method685(local14.anInt228, local14.anInt231, local14.anInt226, local14.anInt229, local14.anInt230, local14.anInt225, local14.anInt227);
							local14.anInt232 = -1;
							if (local14.anInt229 == local14.anInt222 && local14.anInt222 == -1) {
								local14.method573();
							} else if (local14.anInt229 == local14.anInt222 && local14.anInt230 == local14.anInt223 && local14.anInt231 == local14.anInt224) {
								local14.method573();
							}
						}
					} else if (local14.anInt222 < 0 || Class11.method172(local14.anInt224, local14.anInt222)) {
						this.method685(local14.anInt228, local14.anInt224, local14.anInt226, local14.anInt222, local14.anInt223, local14.anInt225, local14.anInt227);
						local14.method573();
					}
				}
				anInt1005++;
				if (anInt1005 > 109) {
					anInt1005 = 0;
					this.aClass2_Sub1_Sub3_6.method256(229);
					this.aClass2_Sub1_Sub3_6.method258(8929);
					return;
				}
			}
		} catch (@Pc(175) RuntimeException local175) {
			signlink.reporterror("17596, " + arg0 + ", " + local175.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!LBBVYYXO;II)V")
	private void method609(@OriginalArg(0) Class2_Sub1_Sub3 arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(6) int local6 = arg0.method278(8);
			@Pc(12) int local12;
			if (local6 < this.anInt902) {
				for (local12 = local6; local12 < this.anInt902; local12++) {
					this.anIntArray273[this.anInt1035++] = this.anIntArray231[local12];
				}
			}
			if (local6 > this.anInt902) {
				signlink.reporterror(this.aString29 + " Too many players");
				throw new RuntimeException("eek");
			}
			this.anInt902 = 0;
			for (local12 = 0; local12 < local6; local12++) {
				@Pc(74) int local74 = this.anIntArray231[local12];
				@Pc(79) Class2_Sub1_Sub1_Sub4_Sub2 local79 = this.aClass2_Sub1_Sub1_Sub4_Sub2Array1[local74];
				@Pc(84) int local84 = arg0.method278(1);
				if (local84 == 0) {
					this.anIntArray231[this.anInt902++] = local74;
					local79.anInt534 = anInt878;
				} else {
					@Pc(107) int local107 = arg0.method278(2);
					if (local107 == 0) {
						this.anIntArray231[this.anInt902++] = local74;
						local79.anInt534 = anInt878;
						this.anIntArray232[this.anInt903++] = local74;
					} else {
						@Pc(158) int local158;
						@Pc(168) int local168;
						if (local107 == 1) {
							this.anIntArray231[this.anInt902++] = local74;
							local79.anInt534 = anInt878;
							local158 = arg0.method278(3);
							local79.method445(local158, false);
							local168 = arg0.method278(1);
							if (local168 == 1) {
								this.anIntArray232[this.anInt903++] = local74;
							}
						} else if (local107 == 2) {
							this.anIntArray231[this.anInt902++] = local74;
							local79.anInt534 = anInt878;
							local158 = arg0.method278(3);
							local79.method445(local158, true);
							local168 = arg0.method278(3);
							local79.method445(local168, true);
							@Pc(226) int local226 = arg0.method278(1);
							if (local226 == 1) {
								this.anIntArray232[this.anInt903++] = local74;
							}
						} else if (local107 == 3) {
							this.anIntArray273[this.anInt1035++] = local74;
						}
					}
				}
			}
		} catch (@Pc(263) RuntimeException local263) {
			signlink.reporterror("37427, " + arg0 + ", " + arg1 + ", " + 39779 + ", " + local263.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "i", descriptor = "(I)V")
	private void method610() {
		try {
			while (true) {
				@Pc(13) Class2_Sub1_Sub4 local13 = this.aClass8_Sub1_1.method138();
				if (local13 == null) {
					return;
				}
				if (local13.anInt795 == 0) {
					Class2_Sub1_Sub1_Sub2.method89(local13.anInt796, local13.aByteArray20);
					if ((this.aClass8_Sub1_1.method130(aByte34, local13.anInt796) & 0x62) != 0) {
						this.aBoolean228 = true;
						if (this.anInt974 != -1 || this.anInt856 != -1) {
							this.aBoolean225 = true;
						}
					}
				}
				if (local13.anInt795 == 1 && local13.aByteArray20 != null) {
					Class32.method371(local13.aByteArray20);
				}
				if (local13.anInt795 == 2 && local13.anInt796 == this.anInt1034 && local13.aByteArray20 != null) {
					this.method726(this.aBoolean226, local13.aByteArray20);
				}
				if (local13.anInt795 == 3 && this.anInt945 == 1) {
					for (@Pc(88) int local88 = 0; local88 < this.aByteArrayArray5.length; local88++) {
						if (this.anIntArray270[local88] == local13.anInt796) {
							this.aByteArrayArray5[local88] = local13.aByteArray20;
							if (local13.aByteArray20 == null) {
								this.anIntArray270[local88] = -1;
							}
							break;
						}
						if (this.anIntArray271[local88] == local13.anInt796) {
							this.aByteArrayArray6[local88] = local13.aByteArray20;
							if (local13.aByteArray20 == null) {
								this.anIntArray271[local88] = -1;
							}
							break;
						}
					}
				}
				if (local13.anInt795 == 93 && this.aClass8_Sub1_1.method142(local13.anInt796)) {
					Class11.method168(this.aClass8_Sub1_1, (byte) 3, new Class2_Sub1_Sub3((byte) 114, local13.aByteArray20));
				}
			}
		} catch (@Pc(165) RuntimeException local165) {
			signlink.reporterror("72516, " + 44393 + ", " + local165.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "j", descriptor = "(I)V")
	private void method611() {
		try {
			if (super.anInt814 == 1) {
				if (super.anInt815 >= 539 && super.anInt815 <= 573 && super.anInt816 >= 169 && super.anInt816 < 205 && this.anIntArray252[0] != -1) {
					this.aBoolean228 = true;
					this.anInt921 = 0;
					this.aBoolean190 = true;
				}
				if (super.anInt815 >= 569 && super.anInt815 <= 599 && super.anInt816 >= 168 && super.anInt816 < 205 && this.anIntArray252[1] != -1) {
					this.aBoolean228 = true;
					this.anInt921 = 1;
					this.aBoolean190 = true;
				}
				if (super.anInt815 >= 597 && super.anInt815 <= 627 && super.anInt816 >= 168 && super.anInt816 < 205 && this.anIntArray252[2] != -1) {
					this.aBoolean228 = true;
					this.anInt921 = 2;
					this.aBoolean190 = true;
				}
				if (super.anInt815 >= 625 && super.anInt815 <= 669 && super.anInt816 >= 168 && super.anInt816 < 203 && this.anIntArray252[3] != -1) {
					this.aBoolean228 = true;
					this.anInt921 = 3;
					this.aBoolean190 = true;
				}
				if (super.anInt815 >= 666 && super.anInt815 <= 696 && super.anInt816 >= 168 && super.anInt816 < 205 && this.anIntArray252[4] != -1) {
					this.aBoolean228 = true;
					this.anInt921 = 4;
					this.aBoolean190 = true;
				}
				if (super.anInt815 >= 694 && super.anInt815 <= 724 && super.anInt816 >= 168 && super.anInt816 < 205 && this.anIntArray252[5] != -1) {
					this.aBoolean228 = true;
					this.anInt921 = 5;
					this.aBoolean190 = true;
				}
				if (super.anInt815 >= 722 && super.anInt815 <= 756 && super.anInt816 >= 169 && super.anInt816 < 205 && this.anIntArray252[6] != -1) {
					this.aBoolean228 = true;
					this.anInt921 = 6;
					this.aBoolean190 = true;
				}
				if (super.anInt815 >= 540 && super.anInt815 <= 574 && super.anInt816 >= 466 && super.anInt816 < 502 && this.anIntArray252[7] != -1) {
					this.aBoolean228 = true;
					this.anInt921 = 7;
					this.aBoolean190 = true;
				}
				if (super.anInt815 >= 572 && super.anInt815 <= 602 && super.anInt816 >= 466 && super.anInt816 < 503 && this.anIntArray252[8] != -1) {
					this.aBoolean228 = true;
					this.anInt921 = 8;
					this.aBoolean190 = true;
				}
				if (super.anInt815 >= 599 && super.anInt815 <= 629 && super.anInt816 >= 466 && super.anInt816 < 503 && this.anIntArray252[9] != -1) {
					this.aBoolean228 = true;
					this.anInt921 = 9;
					this.aBoolean190 = true;
				}
				if (super.anInt815 >= 627 && super.anInt815 <= 671 && super.anInt816 >= 467 && super.anInt816 < 502 && this.anIntArray252[10] != -1) {
					this.aBoolean228 = true;
					this.anInt921 = 10;
					this.aBoolean190 = true;
				}
				if (super.anInt815 >= 669 && super.anInt815 <= 699 && super.anInt816 >= 466 && super.anInt816 < 503 && this.anIntArray252[11] != -1) {
					this.aBoolean228 = true;
					this.anInt921 = 11;
					this.aBoolean190 = true;
				}
				if (super.anInt815 >= 696 && super.anInt815 <= 726 && super.anInt816 >= 466 && super.anInt816 < 503 && this.anIntArray252[12] != -1) {
					this.aBoolean228 = true;
					this.anInt921 = 12;
					this.aBoolean190 = true;
				}
				if (super.anInt815 >= 724 && super.anInt815 <= 758 && super.anInt816 >= 466 && super.anInt816 < 502 && this.anIntArray252[13] != -1) {
					this.aBoolean228 = true;
					this.anInt921 = 13;
					this.aBoolean190 = true;
					return;
				}
			}
		} catch (@Pc(446) RuntimeException local446) {
			signlink.reporterror("72961, " + -346 + ", " + local446.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IILclient!PQPZKUPU;II)V")
	private void method612(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class31 arg2, @OriginalArg(4) int arg3) {
		try {
			if (arg2.anInt422 == 0 && arg2.anIntArray110 != null && (!arg2.aBoolean127 || this.anInt985 == arg2.anInt433 || this.anInt1037 == arg2.anInt433 || this.anInt1011 == arg2.anInt433)) {
				@Pc(29) int local29 = Class2_Sub1_Sub2.anInt787;
				@Pc(31) int local31 = Class2_Sub1_Sub2.anInt785;
				@Pc(33) int local33 = Class2_Sub1_Sub2.anInt788;
				@Pc(35) int local35 = Class2_Sub1_Sub2.anInt786;
				Class2_Sub1_Sub2.method547(arg3, arg1, arg1 + arg2.anInt430, arg3 + arg2.anInt429);
				@Pc(54) int local54 = arg2.anIntArray110.length;
				for (@Pc(56) int local56 = 0; local56 < local54; local56++) {
					@Pc(65) int local65 = arg2.anIntArray115[local56] + arg1;
					@Pc(74) int local74 = arg2.anIntArray116[local56] + arg3 - arg0;
					@Pc(80) Class31 local80 = Class31.method366(arg2.anIntArray110[local56]);
					@Pc(85) int local85 = local65 + local80.anInt425;
					@Pc(90) int local90 = local74 + local80.anInt417;
					if (local80.anInt407 > 0) {
						this.method665(local80);
					}
					if (local80.anInt422 == 0) {
						if (local80.anInt434 > local80.anInt421 - local80.anInt429) {
							local80.anInt434 = local80.anInt421 - local80.anInt429;
						}
						if (local80.anInt434 < 0) {
							local80.anInt434 = 0;
						}
						this.method612(local80.anInt434, local85, local80, local90);
						if (local80.anInt421 > local80.anInt429) {
							this.method615(local85 + local80.anInt430, local90, local80.anInt421, local80.anInt434, 227, local80.anInt429);
						}
					} else if (local80.anInt422 != 1) {
						@Pc(162) int local162;
						@Pc(166) int local166;
						@Pc(177) int local177;
						@Pc(212) int local212;
						@Pc(219) int local219;
						@Pc(244) int local244;
						@Pc(160) int local160;
						@Pc(210) int local210;
						if (local80.anInt422 == 2) {
							local160 = 0;
							for (local162 = 0; local162 < local80.anInt429; local162++) {
								for (local166 = 0; local166 < local80.anInt430; local166++) {
									local177 = local85 + local166 * (local80.anInt435 + 32);
									@Pc(186) int local186 = local90 + local162 * (local80.anInt412 + 32);
									if (local160 < 20) {
										local177 += local80.anIntArray114[local160];
										local186 += local80.anIntArray117[local160];
									}
									if (local80.anIntArray111[local160] > 0) {
										local210 = 0;
										local212 = 0;
										local219 = local80.anIntArray111[local160] - 1;
										if (local177 > Class2_Sub1_Sub2.anInt787 - 32 && local177 < Class2_Sub1_Sub2.anInt788 && local186 > Class2_Sub1_Sub2.anInt785 - 32 && local186 < Class2_Sub1_Sub2.anInt786 || this.anInt1043 != 0 && this.anInt1042 == local160) {
											local244 = 0;
											if (this.anInt884 == 1 && this.anInt885 == local160 && this.anInt886 == local80.anInt433) {
												local244 = 16777215;
											}
											@Pc(268) Class2_Sub1_Sub2_Sub2 local268 = Class41.method494(local80.anIntArray112[local160], local219, local244, 968);
											if (local268 != null) {
												@Pc(347) int local347;
												if (this.anInt1043 != 0 && this.anInt1042 == local160 && this.anInt1041 == local80.anInt433) {
													local210 = super.anInt809 - this.anInt1044;
													local212 = super.anInt810 - this.anInt1045;
													if (local210 < 5 && local210 > -5) {
														local210 = 0;
													}
													if (local212 < 5 && local212 > -5) {
														local212 = 0;
													}
													if (this.anInt994 < 5) {
														local210 = 0;
														local212 = 0;
													}
													local268.method484(local177 + local210, local186 + local212);
													if (local186 + local212 < Class2_Sub1_Sub2.anInt785 && arg2.anInt434 > 0) {
														local347 = this.anInt848 * (Class2_Sub1_Sub2.anInt785 - local186 - local212) / 3;
														if (local347 > this.anInt848 * 10) {
															local347 = this.anInt848 * 10;
														}
														if (local347 > arg2.anInt434) {
															local347 = arg2.anInt434;
														}
														arg2.anInt434 -= local347;
														this.anInt1045 += local347;
													}
													if (local186 + local212 + 32 > Class2_Sub1_Sub2.anInt786 && arg2.anInt434 < arg2.anInt421 - arg2.anInt429) {
														local347 = this.anInt848 * (local186 + local212 + 32 - Class2_Sub1_Sub2.anInt786) / 3;
														if (local347 > this.anInt848 * 10) {
															local347 = this.anInt848 * 10;
														}
														if (local347 > arg2.anInt421 - arg2.anInt429 - arg2.anInt434) {
															local347 = arg2.anInt421 - arg2.anInt429 - arg2.anInt434;
														}
														arg2.anInt434 += local347;
														this.anInt1045 -= local347;
													}
												} else if (this.anInt943 != 0 && this.anInt942 == local160 && this.anInt941 == local80.anInt433) {
													local268.method484(local177, local186);
												} else {
													local268.method482(local177, local186);
												}
												if (local268.anInt638 == 33 || local80.anIntArray112[local160] != 1) {
													local347 = local80.anIntArray112[local160];
													this.aClass2_Sub1_Sub2_Sub4_2.method562(method704(this.anInt858, local347), local186 + local212 + 10, local177 + 1 + local210, 0);
													this.aClass2_Sub1_Sub2_Sub4_2.method562(method704(this.anInt858, local347), local186 + local212 + 9, local177 + local210, 16776960);
												}
											}
										}
									} else if (local80.aClass2_Sub1_Sub2_Sub2Array2 != null && local160 < 20) {
										@Pc(538) Class2_Sub1_Sub2_Sub2 local538 = local80.aClass2_Sub1_Sub2_Sub2Array2[local160];
										if (local538 != null) {
											local538.method482(local177, local186);
										}
									}
									local160++;
								}
							}
						} else if (local80.anInt422 == 3) {
							@Pc(564) boolean local564 = false;
							if (this.anInt1011 == local80.anInt433 || this.anInt1037 == local80.anInt433 || this.anInt985 == local80.anInt433) {
								local564 = true;
							}
							if (this.method687(local80)) {
								local160 = local80.anInt415;
								if (local564 && local80.anInt418 != 0) {
									local160 = local80.anInt418;
								}
							} else {
								local160 = local80.anInt411;
								if (local564 && local80.anInt409 != 0) {
									local160 = local80.anInt409;
								}
							}
							if (local80.aByte16 == 0) {
								if (local80.aBoolean120) {
									Class2_Sub1_Sub2.method550(local80.anInt430, local85, local160, local90, local80.anInt429);
								} else {
									Class2_Sub1_Sub2.method551(local80.anInt429, local160, local85, local80.anInt430, local90);
								}
							} else if (local80.aBoolean120) {
								Class2_Sub1_Sub2.method549(256 - (local80.aByte16 & 0xFF), local85, local80.anInt430, local80.anInt429, local90, local160);
							} else {
								Class2_Sub1_Sub2.method552(local160, local90, local85, local80.anInt430, local80.anInt429, 28, 256 - (local80.aByte16 & 0xFF));
							}
						} else {
							@Pc(682) Class2_Sub1_Sub2_Sub4 local682;
							@Pc(959) String local959;
							if (local80.anInt422 == 4) {
								local682 = local80.aClass2_Sub1_Sub2_Sub4_1;
								@Pc(685) String local685 = local80.aString11;
								@Pc(687) boolean local687 = false;
								if (this.anInt1011 == local80.anInt433 || this.anInt1037 == local80.anInt433 || this.anInt985 == local80.anInt433) {
									local687 = true;
								}
								if (this.method687(local80)) {
									local162 = local80.anInt415;
									if (local687 && local80.anInt418 != 0) {
										local162 = local80.anInt418;
									}
									if (local80.aString10.length() > 0) {
										local685 = local80.aString10;
									}
								} else {
									local162 = local80.anInt411;
									if (local687 && local80.anInt409 != 0) {
										local162 = local80.anInt409;
									}
								}
								if (local80.anInt441 == 6 && this.aBoolean199) {
									local685 = "Please wait...";
									local162 = local80.anInt411;
								}
								if (Class2_Sub1_Sub2.anInt783 == 479) {
									if (local162 == 16776960) {
										local162 = 255;
									}
									if (local162 == 49152) {
										local162 = 16777215;
									}
								}
								local210 = local90 + local682.anInt793;
								while (local685.length() > 0) {
									if (local685.indexOf("%") != -1) {
										label390: while (true) {
											local212 = local685.indexOf("%1");
											if (local212 == -1) {
												while (true) {
													local212 = local685.indexOf("%2");
													if (local212 == -1) {
														while (true) {
															local212 = local685.indexOf("%3");
															if (local212 == -1) {
																while (true) {
																	local212 = local685.indexOf("%4");
																	if (local212 == -1) {
																		while (true) {
																			local212 = local685.indexOf("%5");
																			if (local212 == -1) {
																				break label390;
																			}
																			local685 = local685.substring(0, local212) + this.method725(this.method658(4, local80)) + local685.substring(local212 + 2);
																		}
																	}
																	local685 = local685.substring(0, local212) + this.method725(this.method658(3, local80)) + local685.substring(local212 + 2);
																}
															}
															local685 = local685.substring(0, local212) + this.method725(this.method658(2, local80)) + local685.substring(local212 + 2);
														}
													}
													local685 = local685.substring(0, local212) + this.method725(this.method658(1, local80)) + local685.substring(local212 + 2);
												}
											}
											local685 = local685.substring(0, local212) + this.method725(this.method658(0, local80)) + local685.substring(local212 + 2);
										}
									}
									local212 = local685.indexOf("\\n");
									if (local212 == -1) {
										local959 = local685;
										local685 = "";
									} else {
										local959 = local685.substring(0, local212);
										local685 = local685.substring(local212 + 2);
									}
									if (local80.aBoolean118) {
										local682.method559(local80.aBoolean125, local959, this.aByte43, local162, local210, local85 + local80.anInt430 / 2);
									} else {
										local682.method566(local162, local959, local80.aBoolean125, local85, this.aBoolean185, local210);
									}
									local210 += local682.anInt793;
								}
							} else if (local80.anInt422 == 5) {
								@Pc(1023) Class2_Sub1_Sub2_Sub2 local1023;
								if (this.method687(local80)) {
									local1023 = local80.aClass2_Sub1_Sub2_Sub2_1;
								} else {
									local1023 = local80.aClass2_Sub1_Sub2_Sub2_2;
								}
								if (local1023 != null) {
									local1023.method482(local85, local90);
								}
							} else if (local80.anInt422 == 6) {
								local160 = Class2_Sub1_Sub2_Sub1.anInt85;
								local162 = Class2_Sub1_Sub2_Sub1.anInt86;
								Class2_Sub1_Sub2_Sub1.anInt85 = local85 + local80.anInt430 / 2;
								Class2_Sub1_Sub2_Sub1.anInt86 = local90 + local80.anInt429 / 2;
								local166 = Class2_Sub1_Sub2_Sub1.anIntArray7[local80.anInt439] * local80.anInt438 >> 16;
								local177 = Class2_Sub1_Sub2_Sub1.anIntArray8[local80.anInt439] * local80.anInt438 >> 16;
								@Pc(1084) boolean local1084 = this.method687(local80);
								if (local1084) {
									local210 = local80.anInt437;
								} else {
									local210 = local80.anInt436;
								}
								@Pc(1104) Class2_Sub1_Sub1_Sub2 local1104;
								if (local210 == -1) {
									local1104 = local80.method360(-1, -1, local1084);
								} else {
									@Pc(1110) Class10 local1110 = Class10.aClass10Array1[local210];
									local1104 = local80.method360(local1110.anIntArray69[local80.anInt426], local1110.anIntArray68[local80.anInt426], local1084);
								}
								if (local1104 != null) {
									local1104.method112(local80.anInt440, 0, local80.anInt439, 0, local166, local177);
								}
								Class2_Sub1_Sub2_Sub1.anInt85 = local160;
								Class2_Sub1_Sub2_Sub1.anInt86 = local162;
							} else {
								if (local80.anInt422 == 7) {
									local682 = local80.aClass2_Sub1_Sub2_Sub4_1;
									local162 = 0;
									for (local166 = 0; local166 < local80.anInt429; local166++) {
										for (local177 = 0; local177 < local80.anInt430; local177++) {
											if (local80.anIntArray111[local162] > 0) {
												@Pc(1174) Class41 local1174 = Class41.method495(local80.anIntArray111[local162] - 1);
												@Pc(1177) String local1177 = local1174.aString15;
												if (local1174.aBoolean156 || local80.anIntArray112[local162] != 1) {
													local1177 = local1177 + " x" + method634(local80.anIntArray112[local162]);
												}
												local212 = local85 + local177 * (local80.anInt435 + 115);
												local219 = local90 + local166 * (local80.anInt412 + 12);
												if (local80.aBoolean118) {
													local682.method559(local80.aBoolean125, local1177, this.aByte43, local80.anInt411, local219, local212 + local80.anInt430 / 2);
												} else {
													local682.method566(local80.anInt411, local1177, local80.aBoolean125, local212, this.aBoolean185, local219);
												}
											}
											local162++;
										}
									}
								}
								if (local80.anInt422 == 8 && (this.anInt1017 == local80.anInt433 || this.anInt962 == local80.anInt433 || this.anInt956 == local80.anInt433) && this.anInt850 == 100) {
									local160 = 0;
									local162 = 0;
									@Pc(1293) Class2_Sub1_Sub2_Sub4 local1293 = this.aClass2_Sub1_Sub2_Sub4_3;
									@Pc(1296) String local1296 = local80.aString11;
									while (local1296.length() > 0) {
										local210 = local1296.indexOf("\\n");
										if (local210 == -1) {
											local959 = local1296;
											local1296 = "";
										} else {
											local959 = local1296.substring(0, local210);
											local1296 = local1296.substring(local210 + 2);
										}
										local212 = local1293.method560(local959, this.aByte50);
										if (local212 > local160) {
											local160 = local212;
										}
										local162 += local1293.anInt793 + 1;
									}
									local160 += 6;
									local162 += 7;
									local210 = local85 + local80.anInt430 - local160 - 5;
									local212 = local90 + local80.anInt429 + 5;
									if (local210 < local85 + 5) {
										local210 = local85 + 5;
									}
									if (local210 + local160 > arg1 + arg2.anInt430) {
										local210 = arg1 + arg2.anInt430 - local160;
									}
									if (local212 + local162 > arg3 + arg2.anInt429) {
										local212 = arg3 + arg2.anInt429 - local162;
									}
									Class2_Sub1_Sub2.method550(local160, local210, 16777120, local212, local162);
									Class2_Sub1_Sub2.method551(local162, 0, local210, local160, local212);
									local1296 = local80.aString11;
									local219 = local212 + local1293.anInt793 + 2;
									while (local1296.length() > 0) {
										local244 = local1296.indexOf("\\n");
										if (local244 == -1) {
											local959 = local1296;
											local1296 = "";
										} else {
											local959 = local1296.substring(0, local244);
											local1296 = local1296.substring(local244 + 2);
										}
										local1293.method566(0, local959, false, local210 + 3, this.aBoolean185, local219);
										local219 += local1293.anInt793 + 1;
									}
								}
							}
						}
					}
				}
				Class2_Sub1_Sub2.method547(local31, local29, local33, local35);
			}
		} catch (@Pc(1483) RuntimeException local1483) {
			signlink.reporterror("7102, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + -545 + ", " + arg3 + ", " + local1483.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "run", descriptor = "()V")
	@Override
	public void run() {
		if (this.aBoolean214) {
			this.method718();
		} else {
			super.run();
		}
	}

	@OriginalMember(owner = "client!client", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
	@Override
	public String getParameter(@OriginalArg(0) String arg0) {
		return signlink.mainapp == null ? super.getParameter(arg0) : signlink.mainapp.getParameter(arg0);
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(II)V")
	private void method613(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(4) int local4 = Class23.aClass23Array1[arg0].anInt293;
			@Pc(8) boolean local8 = false;
			if (local4 != 0) {
				@Pc(16) int local16 = this.anIntArray253[arg0];
				if (local4 == 1) {
					if (local16 == 1) {
						Class2_Sub1_Sub2_Sub1.method69(0.9D);
					}
					if (local16 == 2) {
						Class2_Sub1_Sub2_Sub1.method69(0.8D);
					}
					if (local16 == 3) {
						Class2_Sub1_Sub2_Sub1.method69(0.7D);
					}
					if (local16 == 4) {
						Class2_Sub1_Sub2_Sub1.method69(0.6D);
					}
					Class41.aClass36_8.method458();
					this.aBoolean183 = true;
				}
				if (local4 == 3) {
					@Pc(54) boolean local54 = this.aBoolean218;
					if (local16 == 0) {
						this.method723(0, this.aBoolean218);
						this.aBoolean218 = true;
					}
					if (local16 == 1) {
						this.method723(-400, this.aBoolean218);
						this.aBoolean218 = true;
					}
					if (local16 == 2) {
						this.method723(-800, this.aBoolean218);
						this.aBoolean218 = true;
					}
					if (local16 == 3) {
						this.method723(-1200, this.aBoolean218);
						this.aBoolean218 = true;
					}
					if (local16 == 4) {
						this.aBoolean218 = false;
					}
					if (this.aBoolean218 != local54 && !aBoolean197) {
						if (this.aBoolean218) {
							this.anInt1034 = this.anInt951;
							this.aBoolean226 = true;
							this.aClass8_Sub1_1.method141(2, this.anInt1034);
						} else {
							this.method679();
						}
						this.anInt950 = 0;
					}
				}
				if (local4 == 4) {
					if (local16 == 0) {
						this.aBoolean210 = true;
						this.method661(0);
					}
					if (local16 == 1) {
						this.aBoolean210 = true;
						this.method661(-400);
					}
					if (local16 == 2) {
						this.aBoolean210 = true;
						this.method661(-800);
					}
					if (local16 == 3) {
						this.aBoolean210 = true;
						this.method661(-1200);
					}
					if (local16 == 4) {
						this.aBoolean210 = false;
					}
				}
				if (local4 == 5) {
					this.anInt973 = local16;
				}
				if (local4 == 6) {
					this.anInt891 = local16;
				}
				if (local4 == 8) {
					this.anInt837 = local16;
					this.aBoolean225 = true;
				}
				if (local4 == 9) {
					this.anInt986 = local16;
				}
			}
		} catch (@Pc(214) RuntimeException local214) {
			signlink.reporterror("37856, " + arg0 + ", " + arg1 + ", " + local214.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "g", descriptor = "(Z)V")
	private void method614() {
		try {
			if (this.anInt898 > 0) {
				this.method645();
			} else {
				this.method646("Please wait - attempting to reestablish", "Connection lost");
				this.anInt1030 = 0;
				this.anInt910 = 0;
				@Pc(26) Class14 local26 = this.aClass14_1;
				this.aBoolean204 = false;
				this.anInt1010 = 0;
				this.method603(this.aString29, this.aString30, true);
				if (!this.aBoolean204) {
					this.method645();
				}
				try {
					local26.method187();
				} catch (@Pc(49) Exception local49) {
				}
			}
		} catch (@Pc(51) RuntimeException local51) {
			signlink.reporterror("76859, " + false + ", " + local51.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIIII)V")
	private void method615(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		try {
			this.aClass2_Sub1_Sub2_Sub3_6.method541(arg0, arg1);
			this.aClass2_Sub1_Sub2_Sub3_7.method541(arg0, arg1 + arg5 - 16);
			Class2_Sub1_Sub2.method550(16, arg0, this.anInt908, arg1 + 16, arg5 - 32);
			@Pc(31) boolean local31 = false;
			@Pc(39) int local39 = (arg5 - 32) * arg5 / arg2;
			if (local39 < 8) {
				local39 = 8;
			}
			@Pc(56) int local56 = (arg5 - local39 - 32) * arg3 / (arg2 - arg5);
			Class2_Sub1_Sub2.method550(16, arg0, this.anInt831, arg1 + local56 + 16, local39);
			Class2_Sub1_Sub2.method555(local39, arg1 + local56 + 16, arg0, this.anInt1022);
			Class2_Sub1_Sub2.method555(local39, arg1 + local56 + 16, arg0 + 1, this.anInt1022);
			Class2_Sub1_Sub2.method553(16, arg0, arg1 + local56 + 16, this.anInt1022);
			Class2_Sub1_Sub2.method553(16, arg0, arg1 + local56 + 17, this.anInt1022);
			Class2_Sub1_Sub2.method555(local39, arg1 + local56 + 16, arg0 + 15, this.anInt961);
			Class2_Sub1_Sub2.method555(local39 - 1, arg1 + 17 + local56, arg0 + 14, this.anInt961);
			Class2_Sub1_Sub2.method553(16, arg0, arg1 + local56 + local39 + 15, this.anInt961);
			Class2_Sub1_Sub2.method553(15, arg0 + 1, arg1 + 14 + local56 + local39, this.anInt961);
		} catch (@Pc(172) RuntimeException local172) {
			signlink.reporterror("14182, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local172.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ZB)V")
	private void method616(@OriginalArg(0) boolean arg0) {
		try {
			if (aClass2_Sub1_Sub1_Sub4_Sub2_1.anInt541 >> 7 == this.anInt910 && aClass2_Sub1_Sub1_Sub4_Sub2_1.anInt542 >> 7 == this.anInt911) {
				this.anInt910 = 0;
			}
			@Pc(27) int local27 = this.anInt902;
			if (arg0) {
				local27 = 1;
			}
			for (@Pc(33) int local33 = 0; local33 < local27; local33++) {
				@Pc(39) Class2_Sub1_Sub1_Sub4_Sub2 local39;
				@Pc(44) int local44;
				if (arg0) {
					local39 = aClass2_Sub1_Sub1_Sub4_Sub2_1;
					local44 = this.anInt901 << 14;
				} else {
					local39 = this.aClass2_Sub1_Sub1_Sub4_Sub2Array1[this.anIntArray231[local33]];
					local44 = this.anIntArray231[local33] << 14;
				}
				if (local39 != null && local39.method446()) {
					local39.aBoolean144 = false;
					if ((aBoolean197 && this.anInt902 > 50 || this.anInt902 > 200) && !arg0 && local39.anInt562 == local39.anInt549) {
						local39.aBoolean144 = true;
					}
					@Pc(95) int local95 = local39.anInt541 >> 7;
					@Pc(100) int local100 = local39.anInt542 >> 7;
					if (local95 >= 0 && local95 < 104 && local100 >= 0 && local100 < 104) {
						if (local39.aClass2_Sub1_Sub1_Sub2_2 == null || anInt878 < local39.anInt588 || anInt878 >= local39.anInt589) {
							if ((local39.anInt541 & 0x7F) == 64 && (local39.anInt542 & 0x7F) == 64) {
								if (this.anIntArrayArray22[local95][local100] == this.anInt977) {
									continue;
								}
								this.anIntArrayArray22[local95][local100] = this.anInt977;
							}
							local39.anInt587 = this.method717(local39.anInt541, this.anInt909, local39.anInt542);
							this.aClass34_1.method387(local39, this.anInt909, local39.anInt587, local39.anInt543, local44, local39.anInt541, 60, local39.aBoolean142, local39.anInt542);
						} else {
							local39.aBoolean144 = false;
							local39.anInt587 = this.method717(local39.anInt541, this.anInt909, local39.anInt542);
							this.aClass34_1.method388(local39.anInt592, local39.anInt541, local44, local39.anInt587, this.anInt909, local39.anInt591, local39, local39.anInt594, this.anInt843, local39.anInt542, local39.anInt543, local39.anInt593);
						}
					}
				}
			}
		} catch (@Pc(230) RuntimeException local230) {
			signlink.reporterror("58871, " + arg0 + ", " + -25 + ", " + local230.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIIIII)V")
	private void method617(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		try {
			@Pc(5) int local5 = 2048 - arg3 & 0x7FF;
			@Pc(11) int local11 = 2048 - arg1 & 0x7FF;
			@Pc(18) int local18 = 0;
			@Pc(20) int local20 = 0;
			@Pc(22) int local22 = arg2;
			@Pc(28) int local28;
			@Pc(32) int local32;
			@Pc(42) int local42;
			if (local5 != 0) {
				local28 = Class2_Sub1_Sub1_Sub2.anIntArray54[local5];
				local32 = Class2_Sub1_Sub1_Sub2.anIntArray55[local5];
				local42 = local32 * 0 - arg2 * local28 >> 16;
				local22 = local28 * 0 + arg2 * local32 >> 16;
				local20 = local42;
			}
			if (local11 != 0) {
				local28 = Class2_Sub1_Sub1_Sub2.anIntArray54[local11];
				local32 = Class2_Sub1_Sub1_Sub2.anIntArray55[local11];
				local42 = local22 * local28 + local32 * 0 >> 16;
				local22 = local22 * local32 - local28 * 0 >> 16;
				local18 = local42;
			}
			this.anInt998 = arg0 - local18;
			this.anInt999 = arg4 - local20;
			this.anInt1000 = arg5 - local22;
			this.anInt1001 = arg3;
			this.anInt1002 = arg1;
		} catch (@Pc(109) RuntimeException local109) {
			signlink.reporterror("38274, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 0 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local109.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!NQXGETKS;II)V")
	private void method618(@OriginalArg(0) Class2_Sub1_Sub1_Sub4 arg0, @OriginalArg(2) int arg1) {
		try {
			this.method619(142, arg0.anInt542, arg1, arg0.anInt541);
		} catch (@Pc(15) RuntimeException local15) {
			signlink.reporterror("68033, " + arg0 + ", " + 0 + ", " + arg1 + ", " + local15.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIII)V")
	private void method619(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		try {
			if (arg3 >= 128 && arg1 >= 128 && arg3 <= 13056 && arg1 <= 13056) {
				@Pc(28) int local28 = this.method717(arg3, this.anInt909, arg1) - arg2;
				@Pc(33) int local33 = arg3 - this.anInt998;
				@Pc(37) boolean local37 = false;
				@Pc(42) int local42 = local28 - this.anInt999;
				@Pc(47) int local47 = arg1 - this.anInt1000;
				@Pc(52) int local52 = Class2_Sub1_Sub1_Sub2.anIntArray54[this.anInt1001];
				@Pc(57) int local57 = Class2_Sub1_Sub1_Sub2.anIntArray55[this.anInt1001];
				@Pc(62) int local62 = Class2_Sub1_Sub1_Sub2.anIntArray54[this.anInt1002];
				@Pc(67) int local67 = Class2_Sub1_Sub1_Sub2.anIntArray55[this.anInt1002];
				@Pc(77) int local77 = local47 * local62 + local33 * local67 >> 16;
				@Pc(87) int local87 = local47 * local67 - local33 * local62 >> 16;
				@Pc(89) int local89 = local77;
				@Pc(99) int local99 = local42 * local57 - local87 * local52 >> 16;
				@Pc(109) int local109 = local42 * local52 + local87 * local57 >> 16;
				if (local109 >= 50) {
					this.anInt882 = Class2_Sub1_Sub2_Sub1.anInt85 + (local89 << 9) / local109;
					this.anInt883 = Class2_Sub1_Sub2_Sub1.anInt86 + (local99 << 9) / local109;
				} else {
					this.anInt882 = -1;
					this.anInt883 = -1;
				}
			} else {
				this.anInt882 = -1;
				this.anInt883 = -1;
			}
		} catch (@Pc(141) RuntimeException local141) {
			signlink.reporterror("43578, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local141.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(BJ)V")
	private void method620(@OriginalArg(1) long arg0) {
		try {
			if (arg0 != 0L) {
				if (this.anInt988 >= 100 && this.anInt997 != 1) {
					this.method640("Your friendlist is full. Max of 100 for free users, and 200 for members", "", 0);
				} else if (this.anInt988 >= 200) {
					this.method640("Your friendlist is full. Max of 100 for free users, and 200 for members", "", 0);
				} else {
					@Pc(48) String local48 = Class28.method350(Class28.method347(arg0));
					for (@Pc(50) int local50 = 0; local50 < this.anInt988; local50++) {
						if (this.aLongArray4[local50] == arg0) {
							this.method640(local48 + " is already on your friend list", "", 0);
							return;
						}
					}
					for (@Pc(80) int local80 = 0; local80 < this.anInt919; local80++) {
						if (this.aLongArray3[local80] == arg0) {
							this.method640("Please remove " + local48 + " from your ignore list first", "", 0);
							return;
						}
					}
					if (!local48.equals(aClass2_Sub1_Sub1_Sub4_Sub2_1.aString14)) {
						this.aStringArray10[this.anInt988] = local48;
						this.aLongArray4[this.anInt988] = arg0;
						this.anIntArray227[this.anInt988] = 0;
						this.anInt988++;
						this.aBoolean228 = true;
						this.aClass2_Sub1_Sub3_6.method256(252);
						this.aClass2_Sub1_Sub3_6.method263(arg0);
					}
				}
			}
		} catch (@Pc(154) RuntimeException local154) {
			signlink.reporterror("6421, " + 5 + ", " + arg0 + ", " + local154.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "h", descriptor = "(Z)V")
	private void method621() {
		try {
			if (this.anInt1030 == 0 && super.anInt814 == 1) {
				@Pc(21) int local21 = super.anInt815 - 25 - 550;
				@Pc(28) int local28 = super.anInt816 - 5 - 4;
				@Pc(48) int local48;
				if (local21 >= 0 && local28 >= 0 && local21 < 146 && local28 < 151) {
					local21 -= 73;
					local28 -= 75;
					local48 = this.anInt822 + this.anInt1012 & 0x7FF;
					@Pc(52) int local52 = Class2_Sub1_Sub2_Sub1.anIntArray7[local48];
					@Pc(56) int local56 = Class2_Sub1_Sub2_Sub1.anIntArray8[local48];
					@Pc(65) int local65 = local52 * (this.anInt1032 + 256) >> 8;
					@Pc(74) int local74 = local56 * (this.anInt1032 + 256) >> 8;
					@Pc(84) int local84 = local28 * local65 + local21 * local74 >> 11;
					@Pc(94) int local94 = local28 * local74 - local21 * local65 >> 11;
					@Pc(101) int local101 = aClass2_Sub1_Sub1_Sub4_Sub2_1.anInt541 + local84 >> 7;
					@Pc(108) int local108 = aClass2_Sub1_Sub1_Sub4_Sub2_1.anInt542 - local94 >> 7;
					@Pc(130) boolean local130 = this.method649(aClass2_Sub1_Sub1_Sub4_Sub2_1.anIntArray143[0], this.aByte32, 0, 0, 0, 0, 1, local108, true, aClass2_Sub1_Sub1_Sub4_Sub2_1.anIntArray144[0], 0, local101);
					if (local130) {
						this.aClass2_Sub1_Sub3_6.method257(local21);
						this.aClass2_Sub1_Sub3_6.method257(local28);
						this.aClass2_Sub1_Sub3_6.method258(this.anInt822);
						this.aClass2_Sub1_Sub3_6.method257(57);
						this.aClass2_Sub1_Sub3_6.method257(this.anInt1012);
						this.aClass2_Sub1_Sub3_6.method257(this.anInt1032);
						this.aClass2_Sub1_Sub3_6.method257(89);
						this.aClass2_Sub1_Sub3_6.method258(aClass2_Sub1_Sub1_Sub4_Sub2_1.anInt541);
						this.aClass2_Sub1_Sub3_6.method258(aClass2_Sub1_Sub1_Sub4_Sub2_1.anInt542);
						this.aClass2_Sub1_Sub3_6.method257(this.anInt836);
						this.aClass2_Sub1_Sub3_6.method257(63);
					}
				}
				anInt829++;
				if (anInt829 > 1719) {
					anInt829 = 0;
					this.aClass2_Sub1_Sub3_6.method256(13);
					this.aClass2_Sub1_Sub3_6.method257(0);
					local48 = this.aClass2_Sub1_Sub3_6.anInt283;
					this.aClass2_Sub1_Sub3_6.method258(16649);
					this.aClass2_Sub1_Sub3_6.method258(22579);
					this.aClass2_Sub1_Sub3_6.method257((int) (Math.random() * 256.0D));
					this.aClass2_Sub1_Sub3_6.method258(18261);
					this.aClass2_Sub1_Sub3_6.method258(22681);
					if ((int) (Math.random() * 2.0D) == 0) {
						this.aClass2_Sub1_Sub3_6.method257(29);
					}
					if ((int) (Math.random() * 2.0D) == 0) {
						this.aClass2_Sub1_Sub3_6.method257(167);
					}
					this.aClass2_Sub1_Sub3_6.method258(6244);
					if ((int) (Math.random() * 2.0D) == 0) {
						this.aClass2_Sub1_Sub3_6.method258(30915);
					}
					this.aClass2_Sub1_Sub3_6.method257(232);
					this.aClass2_Sub1_Sub3_6.method266(this.aClass2_Sub1_Sub3_6.anInt283 - local48);
					return;
				}
			}
		} catch (@Pc(273) RuntimeException local273) {
			signlink.reporterror("16551, " + true + ", " + local273.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "i", descriptor = "(Z)V")
	private void method622() {
		try {
			for (@Pc(6) Class2_Sub1_Sub1_Sub1 local6 = (Class2_Sub1_Sub1_Sub1) this.aClass29_12.method355(); local6 != null; local6 = (Class2_Sub1_Sub1_Sub1) this.aClass29_12.method357()) {
				if (local6.anInt23 != this.anInt909 || local6.aBoolean7) {
					local6.method573();
				} else if (anInt878 >= local6.anInt29) {
					local6.method12(this.anInt848);
					if (local6.aBoolean7) {
						local6.method573();
					} else {
						this.aClass34_1.method387(local6, local6.anInt23, local6.anInt26, 0, -1, local6.anInt24, 60, false, local6.anInt25);
					}
				}
			}
		} catch (@Pc(70) RuntimeException local70) {
			signlink.reporterror("26702, " + true + ", " + local70.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "k", descriptor = "(I)V")
	private void method623(@OriginalArg(0) int arg0) {
		try {
			if (arg0 >= 0) {
				for (@Pc(3) int local3 = 1; local3 > 0; local3++) {
				}
			}
			if (super.anInt814 == 1) {
				if (super.anInt815 >= 6 && super.anInt815 <= 106 && super.anInt816 >= 467 && super.anInt816 <= 499) {
					this.anInt918 = (this.anInt918 + 1) % 4;
					this.aBoolean189 = true;
					this.aBoolean225 = true;
					this.aClass2_Sub1_Sub3_6.method256(145);
					this.aClass2_Sub1_Sub3_6.method257(this.anInt918);
					this.aClass2_Sub1_Sub3_6.method257(this.anInt842);
					this.aClass2_Sub1_Sub3_6.method257(this.anInt833);
				}
				if (super.anInt815 >= 135 && super.anInt815 <= 235 && super.anInt816 >= 467 && super.anInt816 <= 499) {
					this.anInt842 = (this.anInt842 + 1) % 3;
					this.aBoolean189 = true;
					this.aBoolean225 = true;
					this.aClass2_Sub1_Sub3_6.method256(145);
					this.aClass2_Sub1_Sub3_6.method257(this.anInt918);
					this.aClass2_Sub1_Sub3_6.method257(this.anInt842);
					this.aClass2_Sub1_Sub3_6.method257(this.anInt833);
				}
				if (super.anInt815 >= 273 && super.anInt815 <= 373 && super.anInt816 >= 467 && super.anInt816 <= 499) {
					this.anInt833 = (this.anInt833 + 1) % 3;
					this.aBoolean189 = true;
					this.aBoolean225 = true;
					this.aClass2_Sub1_Sub3_6.method256(145);
					this.aClass2_Sub1_Sub3_6.method257(this.anInt918);
					this.aClass2_Sub1_Sub3_6.method257(this.anInt842);
					this.aClass2_Sub1_Sub3_6.method257(this.anInt833);
				}
				if (super.anInt815 >= 412 && super.anInt815 <= 512 && super.anInt816 >= 467 && super.anInt816 <= 499) {
					if (this.anInt1039 == -1) {
						this.method592();
						this.aString23 = "";
						this.aBoolean212 = false;
						this.anInt965 = this.anInt1039 = Class31.anInt408;
						return;
					}
					this.method640("Please close the interface you have open before using 'report abuse'", "", 0);
					return;
				}
			}
		} catch (@Pc(206) RuntimeException local206) {
			signlink.reporterror("49310, " + arg0 + ", " + local206.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "j", descriptor = "(Z)I")
	private int method624() {
		try {
			@Pc(13) int local13 = 3;
			if (this.anInt1001 < 310) {
				@Pc(22) int local22 = this.anInt998 >> 7;
				@Pc(27) int local27 = this.anInt1000 >> 7;
				@Pc(32) int local32 = aClass2_Sub1_Sub1_Sub4_Sub2_1.anInt541 >> 7;
				@Pc(37) int local37 = aClass2_Sub1_Sub1_Sub4_Sub2_1.anInt542 >> 7;
				if ((this.aByteArrayArrayArray8[this.anInt909][local22][local27] & 0x4) != 0) {
					local13 = this.anInt909;
				}
				@Pc(59) int local59;
				if (local32 > local22) {
					local59 = local32 - local22;
				} else {
					local59 = local22 - local32;
				}
				@Pc(72) int local72;
				if (local37 > local27) {
					local72 = local37 - local27;
				} else {
					local72 = local27 - local37;
				}
				@Pc(87) int local87;
				@Pc(89) int local89;
				if (local59 > local72) {
					local87 = local72 * 65536 / local59;
					local89 = 32768;
					while (local22 != local32) {
						if (local22 < local32) {
							local22++;
						} else if (local22 > local32) {
							local22--;
						}
						if ((this.aByteArrayArrayArray8[this.anInt909][local22][local27] & 0x4) != 0) {
							local13 = this.anInt909;
						}
						local89 += local87;
						if (local89 >= 65536) {
							local89 -= 65536;
							if (local27 < local37) {
								local27++;
							} else if (local27 > local37) {
								local27--;
							}
							if ((this.aByteArrayArrayArray8[this.anInt909][local22][local27] & 0x4) != 0) {
								local13 = this.anInt909;
							}
						}
					}
				} else {
					local87 = local59 * 65536 / local72;
					local89 = 32768;
					while (local27 != local37) {
						if (local27 < local37) {
							local27++;
						} else if (local27 > local37) {
							local27--;
						}
						if ((this.aByteArrayArrayArray8[this.anInt909][local22][local27] & 0x4) != 0) {
							local13 = this.anInt909;
						}
						local89 += local87;
						if (local89 >= 65536) {
							local89 -= 65536;
							if (local22 < local32) {
								local22++;
							} else if (local22 > local32) {
								local22--;
							}
							if ((this.aByteArrayArrayArray8[this.anInt909][local22][local27] & 0x4) != 0) {
								local13 = this.anInt909;
							}
						}
					}
				}
			}
			if ((this.aByteArrayArrayArray8[this.anInt909][aClass2_Sub1_Sub1_Sub4_Sub2_1.anInt541 >> 7][aClass2_Sub1_Sub1_Sub4_Sub2_1.anInt542 >> 7] & 0x4) != 0) {
				local13 = this.anInt909;
			}
			return local13;
		} catch (@Pc(255) RuntimeException local255) {
			signlink.reporterror("32853, " + true + ", " + local255.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "l", descriptor = "(I)I")
	private int method625() {
		try {
			if (this.anInt820 <= 3 && this.anInt820 >= 3) {
				@Pc(19) int local19 = this.method717(this.anInt998, this.anInt909, this.anInt1000);
				return local19 - this.anInt999 >= 800 || (this.aByteArrayArrayArray8[this.anInt909][this.anInt998 >> 7][this.anInt1000 >> 7] & 0x4) == 0 ? 3 : this.anInt909;
			} else {
				return 0;
			}
		} catch (@Pc(49) RuntimeException local49) {
			signlink.reporterror("14276, " + 3 + ", " + local49.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIILclient!PQPZKUPU;III)V")
	private void method627(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) Class31 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		try {
			if (arg3.anInt422 == 0 && arg3.anIntArray110 != null && !arg3.aBoolean127 && (arg2 >= arg4 && arg6 >= arg5 && arg2 <= arg4 + arg3.anInt430 && arg6 <= arg5 + arg3.anInt429)) {
				@Pc(34) int local34 = arg3.anIntArray110.length;
				for (@Pc(36) int local36 = 0; local36 < local34; local36++) {
					@Pc(45) int local45 = arg3.anIntArray115[local36] + arg4;
					@Pc(54) int local54 = arg3.anIntArray116[local36] + arg5 - arg0;
					@Pc(60) Class31 local60 = Class31.method366(arg3.anIntArray110[local36]);
					@Pc(65) int local65 = local45 + local60.anInt425;
					@Pc(70) int local70 = local54 + local60.anInt417;
					if ((local60.anInt427 >= 0 || local60.anInt409 != 0) && arg2 >= local65 && arg6 >= local70 && arg2 < local65 + local60.anInt430 && arg6 < local70 + local60.anInt429) {
						if (local60.anInt427 >= 0) {
							this.anInt1027 = local60.anInt427;
						} else {
							this.anInt1027 = local60.anInt433;
						}
					}
					if (local60.anInt422 == 8 && arg2 >= local65 && arg6 >= local70 && arg2 < local65 + local60.anInt430 && arg6 < local70 + local60.anInt429) {
						this.anInt866 = local60.anInt433;
					}
					if (local60.anInt422 == 0) {
						this.method627(local60.anInt434, arg1, arg2, local60, local65, local70, arg6);
						if (local60.anInt421 > local60.anInt429) {
							this.method695(arg6, arg2, local60, local60.anInt421, local60.anInt429, arg1, local65 + local60.anInt430, local70);
						}
					} else {
						if (local60.anInt441 == 1 && arg2 >= local65 && arg6 >= local70 && arg2 < local65 + local60.anInt430 && arg6 < local70 + local60.anInt429) {
							@Pc(194) boolean local194 = false;
							if (local60.anInt407 != 0) {
								local194 = this.method673(local60);
							}
							if (!local194) {
								this.aStringArray14[this.anInt849] = local60.aString9;
								this.anIntArray235[this.anInt849] = 496;
								this.anIntArray234[this.anInt849] = local60.anInt433;
								this.anInt849++;
							}
						}
						if (local60.anInt441 == 2 && this.anInt888 == 0 && arg2 >= local65 && arg6 >= local70 && arg2 < local65 + local60.anInt430 && arg6 < local70 + local60.anInt429) {
							@Pc(258) String local258 = local60.aString8;
							if (local258.indexOf(" ") != -1) {
								local258 = local258.substring(0, local258.indexOf(" "));
							}
							this.aStringArray14[this.anInt849] = local258 + " @gre@" + local60.aString7;
							this.anIntArray235[this.anInt849] = 619;
							this.anIntArray234[this.anInt849] = local60.anInt433;
							this.anInt849++;
						}
						if (local60.anInt441 == 3 && arg2 >= local65 && arg6 >= local70 && arg2 < local65 + local60.anInt430 && arg6 < local70 + local60.anInt429) {
							this.aStringArray14[this.anInt849] = "Close";
							if (arg1 == 3) {
								this.anIntArray235[this.anInt849] = 895;
							} else {
								this.anIntArray235[this.anInt849] = 1;
							}
							this.anIntArray234[this.anInt849] = local60.anInt433;
							this.anInt849++;
						}
						if (local60.anInt441 == 4 && arg2 >= local65 && arg6 >= local70 && arg2 < local65 + local60.anInt430 && arg6 < local70 + local60.anInt429) {
							this.aStringArray14[this.anInt849] = local60.aString9;
							this.anIntArray235[this.anInt849] = 652;
							this.anIntArray234[this.anInt849] = local60.anInt433;
							this.anInt849++;
						}
						if (local60.anInt441 == 5 && arg2 >= local65 && arg6 >= local70 && arg2 < local65 + local60.anInt430 && arg6 < local70 + local60.anInt429) {
							this.aStringArray14[this.anInt849] = local60.aString9;
							this.anIntArray235[this.anInt849] = 915;
							this.anIntArray234[this.anInt849] = local60.anInt433;
							this.anInt849++;
						}
						if (local60.anInt441 == 6 && !this.aBoolean199 && arg2 >= local65 && arg6 >= local70 && arg2 < local65 + local60.anInt430 && arg6 < local70 + local60.anInt429) {
							this.aStringArray14[this.anInt849] = local60.aString9;
							this.anIntArray235[this.anInt849] = 43;
							this.anIntArray234[this.anInt849] = local60.anInt433;
							this.anInt849++;
						}
						if (local60.anInt422 == 2) {
							@Pc(517) int local517 = 0;
							for (@Pc(519) int local519 = 0; local519 < local60.anInt429; local519++) {
								for (@Pc(523) int local523 = 0; local523 < local60.anInt430; local523++) {
									@Pc(534) int local534 = local65 + local523 * (local60.anInt435 + 32);
									@Pc(543) int local543 = local70 + local519 * (local60.anInt412 + 32);
									if (local517 < 20) {
										local534 += local60.anIntArray114[local517];
										local543 += local60.anIntArray117[local517];
									}
									if (arg2 >= local534 && arg6 >= local543 && arg2 < local534 + 32 && arg6 < local543 + 32) {
										this.anInt932 = local517;
										this.anInt933 = local60.anInt433;
										if (local60.anIntArray111[local517] > 0) {
											@Pc(596) Class41 local596 = Class41.method495(local60.anIntArray111[local517] - 1);
											if (this.anInt884 == 1 && local60.aBoolean124) {
												if (local60.anInt433 != this.anInt886 || local517 != this.anInt885) {
													this.aStringArray14[this.anInt849] = "Use " + this.aString21 + " with @lre@" + local596.aString15;
													this.anIntArray235[this.anInt849] = 402;
													this.anIntArray236[this.anInt849] = local596.anInt646;
													this.anIntArray233[this.anInt849] = local517;
													this.anIntArray234[this.anInt849] = local60.anInt433;
													this.anInt849++;
												}
											} else if (this.anInt888 != 1 || !local60.aBoolean124) {
												@Pc(733) int local733;
												if (local60.aBoolean124) {
													for (local733 = 4; local733 >= 3; local733--) {
														if (local596.aStringArray5 != null && local596.aStringArray5[local733] != null) {
															this.aStringArray14[this.anInt849] = local596.aStringArray5[local733] + " @lre@" + local596.aString15;
															if (local733 == 3) {
																this.anIntArray235[this.anInt849] = 273;
															}
															if (local733 == 4) {
																this.anIntArray235[this.anInt849] = 377;
															}
															this.anIntArray236[this.anInt849] = local596.anInt646;
															this.anIntArray233[this.anInt849] = local517;
															this.anIntArray234[this.anInt849] = local60.anInt433;
															this.anInt849++;
														} else if (local733 == 4) {
															this.aStringArray14[this.anInt849] = "Drop @lre@" + local596.aString15;
															this.anIntArray235[this.anInt849] = 377;
															this.anIntArray236[this.anInt849] = local596.anInt646;
															this.anIntArray233[this.anInt849] = local517;
															this.anIntArray234[this.anInt849] = local60.anInt433;
															this.anInt849++;
														}
													}
												}
												if (local60.aBoolean122) {
													this.aStringArray14[this.anInt849] = "Use @lre@" + local596.aString15;
													this.anIntArray235[this.anInt849] = 138;
													this.anIntArray236[this.anInt849] = local596.anInt646;
													this.anIntArray233[this.anInt849] = local517;
													this.anIntArray234[this.anInt849] = local60.anInt433;
													this.anInt849++;
												}
												if (local60.aBoolean124 && local596.aStringArray5 != null) {
													for (local733 = 2; local733 >= 0; local733--) {
														if (local596.aStringArray5[local733] != null) {
															this.aStringArray14[this.anInt849] = local596.aStringArray5[local733] + " @lre@" + local596.aString15;
															if (local733 == 0) {
																this.anIntArray235[this.anInt849] = 495;
															}
															if (local733 == 1) {
																this.anIntArray235[this.anInt849] = 220;
															}
															if (local733 == 2) {
																this.anIntArray235[this.anInt849] = 34;
															}
															this.anIntArray236[this.anInt849] = local596.anInt646;
															this.anIntArray233[this.anInt849] = local517;
															this.anIntArray234[this.anInt849] = local60.anInt433;
															this.anInt849++;
														}
													}
												}
												if (local60.aStringArray3 != null) {
													for (local733 = 4; local733 >= 0; local733--) {
														if (local60.aStringArray3[local733] != null) {
															this.aStringArray14[this.anInt849] = local60.aStringArray3[local733] + " @lre@" + local596.aString15;
															if (local733 == 0) {
																this.anIntArray235[this.anInt849] = 971;
															}
															if (local733 == 1) {
																this.anIntArray235[this.anInt849] = 364;
															}
															if (local733 == 2) {
																this.anIntArray235[this.anInt849] = 855;
															}
															if (local733 == 3) {
																this.anIntArray235[this.anInt849] = 817;
															}
															if (local733 == 4) {
																this.anIntArray235[this.anInt849] = 168;
															}
															this.anIntArray236[this.anInt849] = local596.anInt646;
															this.anIntArray233[this.anInt849] = local517;
															this.anIntArray234[this.anInt849] = local60.anInt433;
															this.anInt849++;
														}
													}
												}
												this.aStringArray14[this.anInt849] = "Examine @lre@" + local596.aString15;
												this.anIntArray235[this.anInt849] = 1759;
												this.anIntArray236[this.anInt849] = local596.anInt646;
												this.anIntArray233[this.anInt849] = local517;
												this.anIntArray234[this.anInt849] = local60.anInt433;
												this.anInt849++;
											} else if ((this.anInt890 & 0x10) == 16) {
												this.aStringArray14[this.anInt849] = this.aString22 + " @lre@" + local596.aString15;
												this.anIntArray235[this.anInt849] = 987;
												this.anIntArray236[this.anInt849] = local596.anInt646;
												this.anIntArray233[this.anInt849] = local517;
												this.anIntArray234[this.anInt849] = local60.anInt433;
												this.anInt849++;
											}
										}
									}
									local517++;
								}
							}
						}
					}
				}
			}
		} catch (@Pc(1170) RuntimeException local1170) {
			signlink.reporterror("96814, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 0 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + local1170.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "init", descriptor = "()V")
	@Override
	public void init() {
		anInt906 = Integer.parseInt(this.getParameter("nodeid"));
		anInt907 = Integer.parseInt(this.getParameter("portoff"));
		@Pc(15) String local15 = this.getParameter("lowmem");
		if (local15 != null && local15.equals("1")) {
			method626(aByte42);
		} else {
			method667();
		}
		@Pc(31) String local31 = this.getParameter("free");
		if (local31 != null && local31.equals("1")) {
			aBoolean196 = false;
		} else {
			aBoolean196 = true;
		}
		this.method576((byte) 5);
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILjava/lang/String;I)V")
	@Override
	protected void method587(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		try {
			this.anInt834 = arg0;
			this.aString24 = arg1;
			this.method606();
			if (this.aClass13_2 == null) {
				super.method587(arg0, arg1);
			} else {
				this.aClass17_5.method195();
				this.aClass2_Sub1_Sub2_Sub4_4.method558(16777215, 180, 54, "RuneScape is loading - please wait...");
				Class2_Sub1_Sub2.method551(34, 9179409, 28, 304, 62);
				Class2_Sub1_Sub2.method551(32, 0, 29, 302, 63);
				Class2_Sub1_Sub2.method550(arg0 * 3, 30, 9179409, 64, 30);
				Class2_Sub1_Sub2.method550(300 - arg0 * 3, arg0 * 3 + 30, 0, 64, 30);
				this.aClass2_Sub1_Sub2_Sub4_4.method558(16777215, 180, 85, arg1);
				this.aClass17_5.method196(super.aGraphics2, 202, 171);
				if (this.aBoolean183) {
					this.aBoolean183 = false;
					if (!this.aBoolean202) {
						this.aClass17_6.method196(super.aGraphics2, 0, 0);
						this.aClass17_7.method196(super.aGraphics2, 637, 0);
					}
					this.aClass17_3.method196(super.aGraphics2, 128, 0);
					this.aClass17_4.method196(super.aGraphics2, 202, 371);
					this.aClass17_8.method196(super.aGraphics2, 0, 265);
					this.aClass17_9.method196(super.aGraphics2, 562, 265);
					this.aClass17_10.method196(super.aGraphics2, 128, 171);
					this.aClass17_11.method196(super.aGraphics2, 562, 171);
				}
			}
		} catch (@Pc(214) RuntimeException local214) {
			signlink.reporterror("48606, " + arg0 + ", " + arg1 + ", " + -71 + ", " + local214.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "k", descriptor = "(Z)V")
	private void method628(@OriginalArg(0) boolean arg0) {
		try {
			this.aClass17_24.method195();
			Class2_Sub1_Sub2_Sub1.anIntArray9 = this.anIntArray265;
			this.aClass2_Sub1_Sub2_Sub3_15.method541(0, 0);
			if (this.aBoolean182) {
				this.aClass2_Sub1_Sub2_Sub4_4.method558(0, 239, 40, this.aString25);
				this.aClass2_Sub1_Sub2_Sub4_4.method558(128, 239, 60, this.aString26 + "*");
			} else if (this.anInt825 == 1) {
				this.aClass2_Sub1_Sub2_Sub4_4.method558(0, 239, 40, "Enter amount:");
				this.aClass2_Sub1_Sub2_Sub4_4.method558(128, 239, 60, this.aString28 + "*");
			} else if (this.anInt825 == 2) {
				this.aClass2_Sub1_Sub2_Sub4_4.method558(0, 239, 40, "Enter name:");
				this.aClass2_Sub1_Sub2_Sub4_4.method558(128, 239, 60, this.aString28 + "*");
			} else {
				@Pc(125) Class2_Sub1_Sub2_Sub4 local125;
				@Pc(133) int local133;
				@Pc(144) int local144;
				if (this.anInt825 == 3) {
					if (this.aString28 != this.aString17) {
						this.method711(this.aString28);
						this.aString17 = this.aString28;
					}
					local125 = this.aClass2_Sub1_Sub2_Sub4_3;
					Class2_Sub1_Sub2.method547(0, 0, 463, 77);
					for (local133 = 0; local133 < this.anInt826; local133++) {
						local144 = local133 * 14 + 18 - this.anInt827;
						if (local144 > 0 && local144 < 110) {
							local125.method558(0, 239, local144, this.aStringArray8[local133]);
						}
					}
					Class2_Sub1_Sub2.method546();
					if (this.anInt826 > 5) {
						this.method615(463, 0, this.anInt826 * 14 + 7, this.anInt827, 227, 77);
					}
					if (this.aString28.length() == 0) {
						this.aClass2_Sub1_Sub2_Sub4_4.method558(255, 239, 40, "Enter object name");
					} else if (this.anInt826 == 0) {
						this.aClass2_Sub1_Sub2_Sub4_4.method558(0, 239, 40, "No matching objects found, please shorten search");
					}
					local125.method558(0, 239, 90, this.aString28 + "*");
					Class2_Sub1_Sub2.method553(479, 0, 77, 0);
				} else if (this.aString20 != null) {
					this.aClass2_Sub1_Sub2_Sub4_4.method558(0, 239, 40, this.aString20);
					this.aClass2_Sub1_Sub2_Sub4_4.method558(128, 239, 60, "Click to continue");
				} else if (this.anInt974 != -1) {
					this.method612(0, 0, Class31.method366(this.anInt974), 0);
				} else if (this.anInt856 == -1) {
					local125 = this.aClass2_Sub1_Sub2_Sub4_3;
					local133 = 0;
					Class2_Sub1_Sub2.method547(0, 0, 463, 77);
					for (local144 = 0; local144 < 100; local144++) {
						if (this.aStringArray12[local144] != null) {
							@Pc(309) int local309 = this.anIntArray251[local144];
							@Pc(318) int local318 = this.anInt968 + 70 - local133 * 14;
							@Pc(323) String local323 = this.aStringArray11[local144];
							@Pc(325) byte local325 = 0;
							if (local323 != null && local323.startsWith("@cr1@")) {
								local323 = local323.substring(5);
								local325 = 1;
							}
							if (local323 != null && local323.startsWith("@cr2@")) {
								local323 = local323.substring(5);
								local325 = 2;
							}
							if (local309 == 0) {
								if (local318 > 0 && local318 < 110) {
									local125.method562(this.aStringArray12[local144], local318, 4, 0);
								}
								local133++;
							}
							@Pc(395) int local395;
							if ((local309 == 1 || local309 == 2) && (local309 == 1 || this.anInt918 == 0 || this.anInt918 == 1 && this.method590(local323))) {
								if (local318 > 0 && local318 < 110) {
									local395 = 4;
									if (local325 == 1) {
										this.aClass2_Sub1_Sub2_Sub3Array2[0].method541(4, local318 - 12);
										local395 += 14;
									}
									if (local325 == 2) {
										this.aClass2_Sub1_Sub2_Sub3Array2[1].method541(local395, local318 - 12);
										local395 += 14;
									}
									local125.method562(local323 + ":", local318, local395, 0);
									local395 += local125.method560(local323, this.aByte50) + 8;
									local125.method562(this.aStringArray12[local144], local318, local395, 255);
								}
								local133++;
							}
							if ((local309 == 3 || local309 == 7) && this.anInt837 == 0 && (local309 == 7 || this.anInt842 == 0 || this.anInt842 == 1 && this.method590(local323))) {
								if (local318 > 0 && local318 < 110) {
									local125.method562("From", local318, 4, 0);
									local395 = local125.method560("From ", this.aByte50) + 4;
									if (local325 == 1) {
										this.aClass2_Sub1_Sub2_Sub3Array2[0].method541(local395, local318 - 12);
										local395 += 14;
									}
									if (local325 == 2) {
										this.aClass2_Sub1_Sub2_Sub3Array2[1].method541(local395, local318 - 12);
										local395 += 14;
									}
									local125.method562(local323 + ":", local318, local395, 0);
									local395 += local125.method560(local323, this.aByte50) + 8;
									local125.method562(this.aStringArray12[local144], local318, local395, 8388608);
								}
								local133++;
							}
							if (local309 == 4 && (this.anInt833 == 0 || this.anInt833 == 1 && this.method590(local323))) {
								if (local318 > 0 && local318 < 110) {
									local125.method562(local323 + " " + this.aStringArray12[local144], local318, 4, 8388736);
								}
								local133++;
							}
							if (local309 == 5 && this.anInt837 == 0 && this.anInt842 < 2) {
								if (local318 > 0 && local318 < 110) {
									local125.method562(this.aStringArray12[local144], local318, 4, 8388608);
								}
								local133++;
							}
							if (local309 == 6 && this.anInt837 == 0 && this.anInt842 < 2) {
								if (local318 > 0 && local318 < 110) {
									local125.method562("To " + local323 + ":", local318, 4, 0);
									local125.method562(this.aStringArray12[local144], local318, local125.method560("To " + local323, this.aByte50) + 12, 8388608);
								}
								local133++;
							}
							if (local309 == 8 && (this.anInt833 == 0 || this.anInt833 == 1 && this.method590(local323))) {
								if (local318 > 0 && local318 < 110) {
									local125.method562(local323 + " " + this.aStringArray12[local144], local318, 4, 8270336);
								}
								local133++;
							}
						}
					}
					Class2_Sub1_Sub2.method546();
					this.anInt970 = local133 * 14 + 7;
					if (this.anInt970 < 78) {
						this.anInt970 = 78;
					}
					this.method615(463, 0, this.anInt970, this.anInt970 - this.anInt968 - 77, 227, 77);
					@Pc(769) String local769;
					if (aClass2_Sub1_Sub1_Sub4_Sub2_1 == null || aClass2_Sub1_Sub1_Sub4_Sub2_1.aString14 == null) {
						local769 = Class28.method350(this.aString29);
					} else {
						local769 = aClass2_Sub1_Sub1_Sub4_Sub2_1.aString14;
					}
					local125.method562(local769 + ":", 90, 4, 0);
					local125.method562(this.aString27 + "*", 90, local125.method560(local769 + ": ", this.aByte50) + 6, 255);
					Class2_Sub1_Sub2.method553(479, 0, 77, 0);
				} else {
					this.method612(0, 0, Class31.method366(this.anInt856), 0);
				}
			}
			if (this.aBoolean224 && this.anInt869 == 2) {
				this.method713();
			}
			this.aClass17_24.method196(super.aGraphics2, 17, 357);
			if (arg0) {
				this.aClass29ArrayArrayArray1 = null;
			}
			this.aClass17_23.method195();
			Class2_Sub1_Sub2_Sub1.anIntArray9 = this.anIntArray267;
		} catch (@Pc(856) RuntimeException local856) {
			signlink.reporterror("68870, " + arg0 + ", " + local856.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "l", descriptor = "(Z)V")
	private void method629(@OriginalArg(0) boolean arg0) {
		try {
			@Pc(11) int local11;
			for (@Pc(3) int local3 = -1; local3 < this.anInt902; local3++) {
				if (local3 == -1) {
					local11 = this.anInt901;
				} else {
					local11 = this.anIntArray231[local3];
				}
				@Pc(23) Class2_Sub1_Sub1_Sub4_Sub2 local23 = this.aClass2_Sub1_Sub1_Sub4_Sub2Array1[local11];
				if (local23 != null && local23.anInt553 > 0) {
					local23.anInt553--;
					if (local23.anInt553 == 0) {
						local23.aString13 = null;
					}
				}
			}
			for (local11 = 0; local11 < this.anInt964; local11++) {
				@Pc(54) int local54 = this.anIntArray250[local11];
				@Pc(59) Class2_Sub1_Sub1_Sub4_Sub1 local59 = this.aClass2_Sub1_Sub1_Sub4_Sub1Array1[local54];
				if (local59 != null && local59.anInt553 > 0) {
					local59.anInt553--;
					if (local59.anInt553 == 0) {
						local59.aString13 = null;
					}
				}
			}
			if (arg0) {
				anInt978 = this.aClass26_2.method322();
			}
		} catch (@Pc(89) RuntimeException local89) {
			signlink.reporterror("64644, " + arg0 + ", " + local89.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "m", descriptor = "(I)V")
	private void method630() {
		try {
			if (this.anInt992 > 1) {
				this.anInt992--;
			}
			if (this.anInt898 > 0) {
				this.anInt898--;
			}
			for (@Pc(22) int local22 = 0; local22 < 5 && this.method656(); local22++) {
			}
			if (this.aBoolean204) {
				@Pc(46) Object local46 = this.aClass12_1.anObject1;
				@Pc(71) int local71;
				@Pc(73) int local73;
				@Pc(75) int local75;
				@Pc(108) int local108;
				synchronized (this.aClass12_1.anObject1) {
					if (!aBoolean222) {
						this.aClass12_1.anInt220 = 0;
					} else if (super.anInt814 != 0 || this.aClass12_1.anInt220 >= 40) {
						this.aClass2_Sub1_Sub3_6.method256(212);
						this.aClass2_Sub1_Sub3_6.method257(0);
						local71 = this.aClass2_Sub1_Sub3_6.anInt283;
						local73 = 0;
						@Pc(91) int local91;
						for (local75 = 0; local75 < this.aClass12_1.anInt220 && local71 - this.aClass2_Sub1_Sub3_6.anInt283 < 240; local75++) {
							local73++;
							local91 = this.aClass12_1.anIntArray81[local75];
							if (local91 < 0) {
								local91 = 0;
							} else if (local91 > 502) {
								local91 = 502;
							}
							local108 = this.aClass12_1.anIntArray82[local75];
							if (local108 < 0) {
								local108 = 0;
							} else if (local108 > 764) {
								local108 = 764;
							}
							@Pc(125) int local125 = local91 * 765 + local108;
							if (this.aClass12_1.anIntArray81[local75] == -1 && this.aClass12_1.anIntArray82[local75] == -1) {
								local108 = -1;
								local91 = -1;
								local125 = 524287;
							}
							if (local108 != this.anInt904 || local91 != this.anInt905) {
								@Pc(170) int local170 = local108 - this.anInt904;
								this.anInt904 = local108;
								@Pc(178) int local178 = local91 - this.anInt905;
								this.anInt905 = local91;
								if (this.anInt1023 < 8 && local170 >= -32 && local170 <= 31 && local178 >= -32 && local178 <= 31) {
									local170 += 32;
									local178 += 32;
									this.aClass2_Sub1_Sub3_6.method258((this.anInt1023 << 12) + (local170 << 6) + local178);
									this.anInt1023 = 0;
								} else if (this.anInt1023 < 8) {
									this.aClass2_Sub1_Sub3_6.method260((this.anInt1023 << 19) + local125 + 8388608);
									this.anInt1023 = 0;
								} else {
									this.aClass2_Sub1_Sub3_6.method261((this.anInt1023 << 19) + local125 - 1073741824);
									this.anInt1023 = 0;
								}
							} else if (this.anInt1023 < 2047) {
								this.anInt1023++;
							}
						}
						this.aClass2_Sub1_Sub3_6.method266(this.aClass2_Sub1_Sub3_6.anInt283 - local71);
						if (local73 >= this.aClass12_1.anInt220) {
							this.aClass12_1.anInt220 = 0;
						} else {
							this.aClass12_1.anInt220 -= local73;
							for (local91 = 0; local91 < this.aClass12_1.anInt220; local91++) {
								this.aClass12_1.anIntArray82[local91] = this.aClass12_1.anIntArray82[local91 + local73];
								this.aClass12_1.anIntArray81[local91] = this.aClass12_1.anIntArray81[local91 + local73];
							}
						}
					}
				}
				if (super.anInt814 != 0) {
					@Pc(341) long local341 = (super.aLong28 - this.aLong31) / 50L;
					if (local341 > 4095L) {
						local341 = 4095L;
					}
					this.aLong31 = super.aLong28;
					local71 = super.anInt816;
					if (local71 < 0) {
						local71 = 0;
					} else if (local71 > 502) {
						local71 = 502;
					}
					local73 = super.anInt815;
					if (local73 < 0) {
						local73 = 0;
					} else if (local73 > 764) {
						local73 = 764;
					}
					local75 = local71 * 765 + local73;
					@Pc(387) byte local387 = 0;
					if (super.anInt814 == 2) {
						local387 = 1;
					}
					local108 = (int) local341;
					this.aClass2_Sub1_Sub3_6.method256(41);
					this.aClass2_Sub1_Sub3_6.method299((local108 << 20) + (local387 << 19) + local75, (byte) 2);
				}
				if (this.anInt959 > 0) {
					this.anInt959--;
				}
				if (super.anIntArray210[1] == 1 || super.anIntArray210[2] == 1 || super.anIntArray210[3] == 1 || super.anIntArray210[4] == 1) {
					this.aBoolean205 = true;
				}
				if (this.aBoolean205 && this.anInt959 <= 0) {
					this.anInt959 = 20;
					this.aBoolean205 = false;
					this.aClass2_Sub1_Sub3_6.method256(81);
					this.aClass2_Sub1_Sub3_6.method290(this.anInt822);
					this.aClass2_Sub1_Sub3_6.method291(this.anInt821);
				}
				if (super.aBoolean181 && !this.aBoolean191) {
					this.aBoolean191 = true;
					this.aClass2_Sub1_Sub3_6.method256(46);
					this.aClass2_Sub1_Sub3_6.method257(1);
				}
				if (!super.aBoolean181 && this.aBoolean191) {
					this.aBoolean191 = false;
					this.aClass2_Sub1_Sub3_6.method256(46);
					this.aClass2_Sub1_Sub3_6.method257(0);
				}
				this.method662();
				this.method608(493);
				this.method652();
				this.anInt896++;
				if (this.anInt896 > 750) {
					this.method614();
				}
				this.method703();
				this.method595();
				this.method629(this.aBoolean194);
				this.anInt848++;
				if (this.anInt841 != 0) {
					this.anInt840 += 20;
					if (this.anInt840 >= 400) {
						this.anInt841 = 0;
					}
				}
				if (this.anInt943 != 0) {
					this.anInt940++;
					if (this.anInt940 >= 15) {
						if (this.anInt943 == 2) {
							this.aBoolean228 = true;
						}
						if (this.anInt943 == 3) {
							this.aBoolean225 = true;
						}
						this.anInt943 = 0;
					}
				}
				if (this.anInt1043 != 0) {
					this.anInt994++;
					if (super.anInt809 > this.anInt1044 + 5 || super.anInt809 < this.anInt1044 - 5 || super.anInt810 > this.anInt1045 + 5 || super.anInt810 < this.anInt1045 - 5) {
						this.aBoolean193 = true;
					}
					if (super.anInt808 == 0) {
						if (this.anInt1043 == 2) {
							this.aBoolean228 = true;
						}
						if (this.anInt1043 == 3) {
							this.aBoolean225 = true;
						}
						this.anInt1043 = 0;
						if (this.aBoolean193 && this.anInt994 >= 5) {
							this.anInt933 = -1;
							this.method693();
							if (this.anInt933 == this.anInt1041 && this.anInt932 != this.anInt1042) {
								@Pc(690) Class31 local690 = Class31.method366(this.anInt1041);
								@Pc(692) byte local692 = 0;
								if (this.anInt986 == 1 && local690.anInt407 == 206) {
									local692 = 1;
								}
								if (local690.anIntArray111[this.anInt932] <= 0) {
									local692 = 0;
								}
								if (local690.aBoolean126) {
									local71 = this.anInt1042;
									local73 = this.anInt932;
									local690.anIntArray111[local73] = local690.anIntArray111[local71];
									local690.anIntArray112[local73] = local690.anIntArray112[local71];
									local690.anIntArray111[local71] = -1;
									local690.anIntArray112[local71] = 0;
								} else if (local692 == 1) {
									local71 = this.anInt1042;
									local73 = this.anInt932;
									while (local71 != local73) {
										if (local71 > local73) {
											local690.method365(local71 - 1, local71);
											local71--;
										} else if (local71 < local73) {
											local690.method365(local71 + 1, local71);
											local71++;
										}
									}
								} else {
									local690.method365(this.anInt932, this.anInt1042);
								}
								this.aClass2_Sub1_Sub3_6.method256(198);
								this.aClass2_Sub1_Sub3_6.method291(this.anInt1041);
								this.aClass2_Sub1_Sub3_6.method283(local692);
								this.aClass2_Sub1_Sub3_6.method258(this.anInt932);
								this.aClass2_Sub1_Sub3_6.method258(this.anInt1042);
							}
						} else if ((this.anInt973 == 1 || this.method686(this.anInt849 - 1)) && this.anInt849 > 2) {
							this.method632();
						} else if (this.anInt849 > 0) {
							this.method659(this.anInt849 - 1, 413);
						}
						this.anInt940 = 10;
						super.anInt814 = 0;
					}
				}
				@Pc(864) int local864;
				@Pc(866) int local866;
				if (Class34.anInt472 != -1) {
					local864 = Class34.anInt472;
					local866 = Class34.anInt473;
					@Pc(888) boolean local888 = this.method649(aClass2_Sub1_Sub1_Sub4_Sub2_1.anIntArray143[0], this.aByte32, 0, 0, 0, 0, 0, local866, true, aClass2_Sub1_Sub1_Sub4_Sub2_1.anIntArray144[0], 0, local864);
					Class34.anInt472 = -1;
					if (local888) {
						this.anInt838 = super.anInt815;
						this.anInt839 = super.anInt816;
						this.anInt841 = 1;
						this.anInt840 = 0;
					}
				}
				if (super.anInt814 == 1 && this.aString20 != null) {
					this.aString20 = null;
					this.aBoolean225 = true;
					super.anInt814 = 0;
				}
				this.method705();
				if (this.anInt857 == -1) {
					this.method621();
					this.method611();
					this.method623(this.anInt949);
				}
				if (super.anInt808 == 1 || super.anInt814 == 1) {
					this.anInt899++;
				}
				if (this.anInt1017 == 0 && this.anInt962 == 0 && this.anInt956 == 0) {
					if (this.anInt850 > 0) {
						this.anInt850--;
					}
				} else if (this.anInt850 < 100) {
					this.anInt850++;
					if (this.anInt850 == 100) {
						if (this.anInt1017 != 0) {
							this.aBoolean225 = true;
						}
						if (this.anInt962 != 0) {
							this.aBoolean228 = true;
						}
					}
				}
				if (this.anInt945 == 2) {
					this.method720();
				}
				if (this.anInt945 == 2 && this.aBoolean207) {
					this.method710();
				}
				for (local864 = 0; local864 < 5; local864++) {
					@Pc(1025) int local1025 = this.anIntArray249[local864]++;
				}
				this.method706();
				super.anInt807++;
				if (super.anInt807 > 4500) {
					this.anInt898 = 250;
					super.anInt807 -= 500;
					this.aClass2_Sub1_Sub3_6.method256(51);
				}
				this.anInt1016++;
				if (this.anInt1016 > 500) {
					this.anInt1016 = 0;
					local866 = (int) (Math.random() * 8.0D);
					if ((local866 & 0x1) == 1) {
						this.anInt846 += this.anInt847;
					}
					if ((local866 & 0x2) == 2) {
						this.anInt930 += this.anInt931;
					}
					if ((local866 & 0x4) == 4) {
						this.anInt922 += this.anInt923;
					}
				}
				if (this.anInt846 < -50) {
					this.anInt847 = 2;
				}
				if (this.anInt846 > 50) {
					this.anInt847 = -2;
				}
				if (this.anInt930 < -55) {
					this.anInt931 = 2;
				}
				if (this.anInt930 > 55) {
					this.anInt931 = -2;
				}
				if (this.anInt922 < -40) {
					this.anInt923 = 1;
				}
				if (this.anInt922 > 40) {
					this.anInt923 = -1;
				}
				this.anInt832++;
				if (this.anInt832 > 500) {
					this.anInt832 = 0;
					local866 = (int) (Math.random() * 8.0D);
					if ((local866 & 0x1) == 1) {
						this.anInt1012 += this.anInt1013;
					}
					if ((local866 & 0x2) == 2) {
						this.anInt1032 += this.anInt1033;
					}
				}
				if (this.anInt1012 < -60) {
					this.anInt1013 = 2;
				}
				if (this.anInt1012 > 60) {
					this.anInt1013 = -2;
				}
				if (this.anInt1032 < -20) {
					this.anInt1033 = 1;
				}
				if (this.anInt1032 > 10) {
					this.anInt1033 = -1;
				}
				this.anInt897++;
				if (this.anInt897 > 50) {
					this.aClass2_Sub1_Sub3_6.method256(100);
				}
				try {
					if (this.aClass14_1 != null && this.aClass2_Sub1_Sub3_6.anInt283 > 0) {
						this.aClass14_1.method191(this.aClass2_Sub1_Sub3_6.aByteArray7, this.aClass2_Sub1_Sub3_6.anInt283);
						this.aClass2_Sub1_Sub3_6.anInt283 = 0;
						this.anInt897 = 0;
					}
				} catch (@Pc(1267) IOException local1267) {
					this.method614();
				} catch (@Pc(1272) Exception local1272) {
					this.method645();
				}
			}
		} catch (@Pc(1277) RuntimeException local1277) {
			signlink.reporterror("50029, " + -436 + ", " + local1277.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "n", descriptor = "(I)V")
	private void method631() {
		try {
			@Pc(37) int local37;
			@Pc(50) int local50;
			@Pc(54) int local54;
			@Pc(58) int local58;
			@Pc(107) int local107;
			@Pc(121) int local121;
			@Pc(133) int local133;
			@Pc(192) int local192;
			try {
				this.anInt944 = -1;
				this.aClass29_12.method359();
				this.aClass29_11.method359();
				anInt946++;
				if (anInt946 > 62) {
					anInt946 = 0;
					this.aClass2_Sub1_Sub3_6.method256(69);
				}
				Class2_Sub1_Sub2_Sub1.method63();
				this.method642(this.aByte33);
				this.aClass34_1.method376();
				System.gc();
				for (local37 = 0; local37 < 4; local37++) {
					this.aClass5Array1[local37].method20();
				}
				for (local50 = 0; local50 < 4; local50++) {
					for (local54 = 0; local54 < 104; local54++) {
						for (local58 = 0; local58 < 104; local58++) {
							this.aByteArrayArrayArray8[local50][local54][local58] = 0;
						}
					}
				}
				@Pc(93) Class11 local93 = new Class11(this.aByteArrayArrayArray8, 104, this.anIntArrayArrayArray7, 104, this.anInt966);
				local58 = this.aByteArrayArray5.length;
				this.aClass2_Sub1_Sub3_6.method256(100);
				@Pc(255) int local255;
				@Pc(243) int local243;
				if (!this.aBoolean203) {
					@Pc(138) byte[] local138;
					for (local107 = 0; local107 < local58; local107++) {
						local121 = (this.anIntArray269[local107] >> 8) * 64 - this.anInt874;
						local133 = (this.anIntArray269[local107] & 0xFF) * 64 - this.anInt875;
						local138 = this.aByteArrayArray5[local107];
						if (local138 != null) {
							local93.method180((this.anInt972 - 6) * 8, local133, this.aClass5Array1, (this.anInt971 - 6) * 8, local121, local138);
						}
					}
					for (local121 = 0; local121 < local58; local121++) {
						local133 = (this.anIntArray269[local121] >> 8) * 64 - this.anInt874;
						local192 = (this.anIntArray269[local121] & 0xFF) * 64 - this.anInt875;
						@Pc(197) byte[] local197 = this.aByteArrayArray5[local121];
						if (local197 == null && this.anInt972 < 800) {
							local93.method179(this.anInt1038, 64, local133, 64, local192);
						}
					}
					this.aClass2_Sub1_Sub3_6.method256(100);
					for (local133 = 0; local133 < local58; local133++) {
						local138 = this.aByteArrayArray6[local133];
						if (local138 != null) {
							local243 = (this.anIntArray269[local133] >> 8) * 64 - this.anInt874;
							local255 = (this.anIntArray269[local133] & 0xFF) * 64 - this.anInt875;
							local93.method176(local243, this.aBoolean215, local255, this.aClass34_1, local138, this.aClass5Array1);
						}
					}
				}
				if (this.aBoolean203) {
					local107 = 0;
					label258: while (true) {
						@Pc(311) int local311;
						@Pc(317) int local317;
						@Pc(323) int local323;
						@Pc(333) int local333;
						@Pc(335) int local335;
						if (local107 >= 4) {
							for (local121 = 0; local121 < 13; local121++) {
								for (local133 = 0; local133 < 13; local133++) {
									local192 = this.anIntArrayArrayArray8[0][local121][local133];
									if (local192 == -1) {
										local93.method179(this.anInt1038, 8, local121 * 8, 8, local133 * 8);
									}
								}
							}
							this.aClass2_Sub1_Sub3_6.method256(100);
							local133 = 0;
							while (true) {
								if (local133 >= 4) {
									break label258;
								}
								for (local192 = 0; local192 < 13; local192++) {
									for (local243 = 0; local243 < 13; local243++) {
										local255 = this.anIntArrayArrayArray8[local133][local192][local243];
										if (local255 != -1) {
											local311 = local255 >> 24 & 0x3;
											local317 = local255 >> 1 & 0x3;
											local323 = local255 >> 14 & 0x3FF;
											local333 = local255 >> 3 & 0x7FF;
											local335 = (local323 / 8 << 8) + local333 / 8;
											for (@Pc(515) int local515 = 0; local515 < this.anIntArray269.length; local515++) {
												if (this.anIntArray269[local515] == local335 && this.aByteArrayArray6[local515] != null) {
													local93.method163(this.aClass5Array1, local192 * 8, (local323 & 0x7) * 8, local243 * 8, local311, local133, local317, this.aByteArrayArray6[local515], this.aClass34_1, (local333 & 0x7) * 8);
													break;
												}
											}
										}
									}
								}
								local133++;
							}
						}
						for (local121 = 0; local121 < 13; local121++) {
							for (local133 = 0; local133 < 13; local133++) {
								@Pc(287) boolean local287 = false;
								local243 = this.anIntArrayArrayArray8[local107][local121][local133];
								if (local243 != -1) {
									local255 = local243 >> 24 & 0x3;
									local311 = local243 >> 1 & 0x3;
									local317 = local243 >> 14 & 0x3FF;
									local323 = local243 >> 3 & 0x7FF;
									local333 = (local317 / 8 << 8) + local323 / 8;
									for (local335 = 0; local335 < this.anIntArray269.length; local335++) {
										if (this.anIntArray269[local335] == local333 && this.aByteArrayArray5[local335] != null) {
											local93.method167((local323 & 0x7) * 8, this.aClass5Array1, this.aByteArrayArray5[local335], (local317 & 0x7) * 8, local255, local133 * 8, local311, local107, local121 * 8);
											local287 = true;
											break;
										}
									}
								}
								if (!local287) {
									local93.method169(local107, local133 * 8, local121 * 8);
								}
							}
						}
						local107++;
					}
				}
				this.aClass2_Sub1_Sub3_6.method256(100);
				local93.method181(this.aClass34_1, this.aClass5Array1);
				if (this.aClass17_23 != null) {
					this.aClass17_23.method195();
					Class2_Sub1_Sub2_Sub1.anIntArray9 = this.anIntArray267;
				}
				this.aClass2_Sub1_Sub3_6.method256(100);
				local107 = Class11.anInt217;
				if (local107 > this.anInt909) {
					local107 = this.anInt909;
				}
				if (local107 < this.anInt909 - 1) {
					local107 = this.anInt909 - 1;
				}
				if (aBoolean197) {
					this.aClass34_1.method377(Class11.anInt217);
				} else {
					this.aClass34_1.method377(0);
				}
				for (local121 = 0; local121 < 104; local121++) {
					for (local133 = 0; local133 < 104; local133++) {
						this.method690(local121, local133);
					}
				}
				this.method681();
			} catch (@Pc(664) Exception local664) {
			}
			Class24.aClass36_3.method458();
			if (super.aFrame_Sub1_2 != null) {
				this.aClass2_Sub1_Sub3_6.method256(164);
				this.aClass2_Sub1_Sub3_6.method261(1057001181);
			}
			if (aBoolean197 && signlink.aRandomAccessFile3 != null) {
				local37 = this.aClass8_Sub1_1.method136(0);
				for (local50 = 0; local50 < local37; local50++) {
					local54 = this.aClass8_Sub1_1.method130(aByte34, local50);
					if ((local54 & 0x79) == 0) {
						Class2_Sub1_Sub1_Sub2.method90(local50);
					}
				}
			}
			System.gc();
			Class2_Sub1_Sub2_Sub1.method64((byte) 2);
			this.aClass8_Sub1_1.method135(this.anInt1021);
			local37 = (this.anInt971 - 6) / 8 - 1;
			local50 = (this.anInt971 + 6) / 8 + 1;
			local54 = (this.anInt972 - 6) / 8 - 1;
			local58 = (this.anInt972 + 6) / 8 + 1;
			if (this.aBoolean221) {
				local37 = 49;
				local50 = 50;
				local54 = 49;
				local58 = 50;
			}
			for (local107 = local37; local107 <= local50; local107++) {
				for (local121 = local54; local121 <= local58; local121++) {
					if (local107 == local37 || local107 == local50 || local121 == local54 || local121 == local58) {
						local133 = this.aClass8_Sub1_1.method137(local121, 0, local107);
						if (local133 != -1) {
							this.aClass8_Sub1_1.method129(local133, 3);
						}
						local192 = this.aClass8_Sub1_1.method137(local121, 1, local107);
						if (local192 != -1) {
							this.aClass8_Sub1_1.method129(local192, 3);
						}
					}
				}
			}
		} catch (@Pc(832) RuntimeException local832) {
			signlink.reporterror("82899, " + 389 + ", " + local832.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "o", descriptor = "(I)V")
	private void method632() {
		try {
			@Pc(22) int local22 = this.aClass2_Sub1_Sub2_Sub4_4.method560("Choose Option", this.aByte50);
			@Pc(36) int local36;
			for (@Pc(24) int local24 = 0; local24 < this.anInt849; local24++) {
				local36 = this.aClass2_Sub1_Sub2_Sub4_4.method560(this.aStringArray14[local24], this.aByte50);
				if (local36 > local22) {
					local22 = local36;
				}
			}
			local22 += 8;
			local36 = this.anInt849 * 15 + 21;
			@Pc(79) int local79;
			@Pc(97) int local97;
			if (super.anInt815 > 4 && super.anInt816 > 4 && super.anInt815 < 516 && super.anInt816 < 338) {
				local79 = super.anInt815 - local22 / 2 - 4;
				if (local79 + local22 > 512) {
					local79 = 512 - local22;
				}
				if (local79 < 0) {
					local79 = 0;
				}
				local97 = super.anInt816 - 4;
				if (local97 + local36 > 334) {
					local97 = 334 - local36;
				}
				if (local97 < 0) {
					local97 = 0;
				}
				this.aBoolean224 = true;
				this.anInt869 = 0;
				this.anInt870 = local79;
				this.anInt871 = local97;
				this.anInt872 = local22;
				this.anInt873 = this.anInt849 * 15 + 22;
			}
			if (super.anInt815 > 553 && super.anInt816 > 205 && super.anInt815 < 743 && super.anInt816 < 466) {
				local79 = super.anInt815 - local22 / 2 - 553;
				if (local79 < 0) {
					local79 = 0;
				} else if (local79 + local22 > 190) {
					local79 = 190 - local22;
				}
				local97 = super.anInt816 - 205;
				if (local97 < 0) {
					local97 = 0;
				} else if (local97 + local36 > 261) {
					local97 = 261 - local36;
				}
				this.aBoolean224 = true;
				this.anInt869 = 1;
				this.anInt870 = local79;
				this.anInt871 = local97;
				this.anInt872 = local22;
				this.anInt873 = this.anInt849 * 15 + 22;
			}
			if (super.anInt815 > 17 && super.anInt816 > 357 && super.anInt815 < 496 && super.anInt816 < 453) {
				local79 = super.anInt815 - local22 / 2 - 17;
				if (local79 < 0) {
					local79 = 0;
				} else if (local79 + local22 > 479) {
					local79 = 479 - local22;
				}
				local97 = super.anInt816 - 357;
				if (local97 < 0) {
					local97 = 0;
				} else if (local97 + local36 > 96) {
					local97 = 96 - local36;
				}
				this.aBoolean224 = true;
				this.anInt869 = 2;
				this.anInt870 = local79;
				this.anInt871 = local97;
				this.anInt872 = local22;
				this.anInt873 = this.anInt849 * 15 + 22;
			}
		} catch (@Pc(301) RuntimeException local301) {
			signlink.reporterror("81149, " + 3 + ", " + local301.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(B)Ljava/lang/String;")
	private String method633() {
		try {
			if (signlink.mainapp == null) {
				return super.aFrame_Sub1_2 == null ? super.getDocumentBase().getHost().toLowerCase() : "runescape.com";
			} else {
				return signlink.mainapp.getDocumentBase().getHost().toLowerCase();
			}
		} catch (@Pc(27) RuntimeException local27) {
			signlink.reporterror("83046, " + -22 + ", " + local27.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/Runnable;I)V")
	@Override
	public void method586(@OriginalArg(0) Runnable arg0, @OriginalArg(1) int arg1) {
		if (arg1 > 10) {
			arg1 = 10;
		}
		if (signlink.mainapp == null) {
			super.method586(arg0, arg1);
		} else {
			signlink.startthread(arg0, arg1);
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(I)V")
	@Override
	protected void method584() {
		try {
			this.aBoolean183 = true;
		} catch (@Pc(17) RuntimeException local17) {
			signlink.reporterror("26760, " + -83 + ", " + local17.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "p", descriptor = "(I)V")
	private void method635() {
		try {
			if (this.anInt837 != 0) {
				@Pc(6) Class2_Sub1_Sub2_Sub4 local6 = this.aClass2_Sub1_Sub2_Sub4_3;
				@Pc(8) int local8 = 0;
				if (this.anInt992 != 0) {
					local8 = 1;
				}
				for (@Pc(15) int local15 = 0; local15 < 100; local15++) {
					if (this.aStringArray12[local15] != null) {
						@Pc(27) int local27 = this.anIntArray251[local15];
						@Pc(32) String local32 = this.aStringArray11[local15];
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
						if ((local27 == 3 || local27 == 7) && (local27 == 7 || this.anInt842 == 0 || this.anInt842 == 1 && this.method590(local32))) {
							local85 = 329 - local8 * 13;
							local6.method562("From", local85, 4, 0);
							local6.method562("From", local85 - 1, 4, 65535);
							@Pc(111) int local111 = local6.method560("From ", this.aByte50) + 4;
							if (local34 == 1) {
								this.aClass2_Sub1_Sub2_Sub3Array2[0].method541(local111, local85 - 12);
								local111 += 14;
							}
							if (local34 == 2) {
								this.aClass2_Sub1_Sub2_Sub3Array2[1].method541(local111, local85 - 12);
								local111 += 14;
							}
							local6.method562(local32 + ": " + this.aStringArray12[local15], local85, local111, 0);
							local6.method562(local32 + ": " + this.aStringArray12[local15], local85 - 1, local111, 65535);
							local8++;
							if (local8 >= 5) {
								return;
							}
						}
						if (local27 == 5 && this.anInt842 < 2) {
							local85 = 329 - local8 * 13;
							local6.method562(this.aStringArray12[local15], local85, 4, 0);
							local6.method562(this.aStringArray12[local15], local85 - 1, 4, 65535);
							local8++;
							if (local8 >= 5) {
								return;
							}
						}
						if (local27 == 6 && this.anInt842 < 2) {
							local85 = 329 - local8 * 13;
							local6.method562("To " + local32 + ": " + this.aStringArray12[local15], local85, 4, 0);
							local6.method562("To " + local32 + ": " + this.aStringArray12[local15], local85 - 1, 4, 65535);
							local8++;
							if (local8 >= 5) {
								return;
							}
						}
					}
				}
				this.anInt894 += 0;
			}
		} catch (@Pc(296) RuntimeException local296) {
			signlink.reporterror("69646, " + 0 + ", " + local296.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "q", descriptor = "(I)V")
	private void method636() {
		try {
			this.anInt894 += 0;
			@Pc(10) Graphics local10 = this.method585().getGraphics();
			local10.setColor(Color.black);
			local10.fillRect(0, 0, 765, 503);
			this.method578();
			@Pc(42) byte local42;
			@Pc(48) int local48;
			if (this.aBoolean192) {
				this.aBoolean202 = false;
				local10.setFont(new Font("Helvetica", 1, 16));
				local10.setColor(Color.yellow);
				local42 = 35;
				local10.drawString("Sorry, an error has occured whilst loading RuneScape", 30, 35);
				local48 = local42 + 50;
				local10.setColor(Color.white);
				local10.drawString("To fix this try the following (in order):", 30, 85);
				@Pc(57) int local57 = local48 + 50;
				local10.setColor(Color.white);
				local10.setFont(new Font("Helvetica", 1, 12));
				local10.drawString("1: Try closing ALL open web-browser windows, and reloading", 30, 135);
				@Pc(74) int local74 = local57 + 30;
				local10.drawString("2: Try clearing your web-browsers cache from tools->internet options", 30, 165);
				@Pc(80) int local80 = local74 + 30;
				local10.drawString("3: Try using a different game-world", 30, 195);
				@Pc(86) int local86 = local80 + 30;
				local10.drawString("4: Try rebooting your computer", 30, 225);
				@Pc(92) int local92 = local86 + 30;
				local10.drawString("5: Try selecting a different version of Java from the play-game menu", 30, 255);
			}
			if (this.aBoolean201) {
				this.aBoolean202 = false;
				local10.setFont(new Font("Helvetica", 1, 20));
				local10.setColor(Color.white);
				local10.drawString("Error - unable to load game!", 50, 50);
				local10.drawString("To play RuneScape make sure you play from", 50, 100);
				local10.drawString("http://www.runescape.com", 50, 150);
			}
			if (this.aBoolean195) {
				this.aBoolean202 = false;
				local10.setColor(Color.yellow);
				local42 = 35;
				local10.drawString("Error a copy of RuneScape already appears to be loaded", 30, 35);
				local48 = local42 + 50;
				local10.setColor(Color.white);
				local10.drawString("To fix this try the following (in order):", 30, 85);
				local48 += 50;
				local10.setColor(Color.white);
				local10.setFont(new Font("Helvetica", 1, 12));
				local10.drawString("1: Try closing ALL open web-browser windows, and reloading", 30, 135);
				local48 += 30;
				local10.drawString("2: Try rebooting your computer, and reloading", 30, 165);
				local48 += 30;
			}
		} catch (@Pc(180) RuntimeException local180) {
			signlink.reporterror("33145, " + 0 + ", " + local180.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IZ)V")
	private void method637(@OriginalArg(0) int arg0) {
		try {
			@Pc(5) int[] local5 = this.aClass2_Sub1_Sub2_Sub2_4.anIntArray164;
			@Pc(8) int local8 = local5.length;
			for (@Pc(14) int local14 = 0; local14 < local8; local14++) {
				local5[local14] = 0;
			}
			@Pc(38) int local38;
			@Pc(40) int local40;
			for (@Pc(26) int local26 = 1; local26 < 103; local26++) {
				local38 = (103 - local26) * 512 * 4 + 24628;
				for (local40 = 1; local40 < 103; local40++) {
					if ((this.aByteArrayArrayArray8[arg0][local40][local26] & 0x18) == 0) {
						this.aClass34_1.method411(local5, local38, arg0, local40, local26);
					}
					if (arg0 < 3 && (this.aByteArrayArrayArray8[arg0 + 1][local40][local26] & 0x8) != 0) {
						this.aClass34_1.method411(local5, local38, arg0 + 1, local40, local26);
					}
					local38 += 4;
				}
			}
			local38 = ((int) (Math.random() * 20.0D) + 238 - 10 << 16) + ((int) (Math.random() * 20.0D) + 238 - 10 << 8) + (int) (Math.random() * 20.0D) + 238 - 10;
			local40 = (int) (Math.random() * 20.0D) + 238 - 10 << 16;
			this.aClass2_Sub1_Sub2_Sub2_4.method477();
			@Pc(150) int local150;
			for (@Pc(146) int local146 = 1; local146 < 103; local146++) {
				for (local150 = 1; local150 < 103; local150++) {
					if ((this.aByteArrayArrayArray8[arg0][local150][local146] & 0x18) == 0) {
						this.method714(arg0, local38, local150, local40, local146);
					}
					if (arg0 < 3 && (this.aByteArrayArrayArray8[arg0 + 1][local150][local146] & 0x8) != 0) {
						this.method714(arg0 + 1, local38, local150, local40, local146);
					}
				}
			}
			if (this.aClass17_23 != null) {
				this.aClass17_23.method195();
				Class2_Sub1_Sub2_Sub1.anIntArray9 = this.anIntArray267;
			}
			this.anInt1036 = 0;
			@Pc(224) int local224;
			for (local150 = 0; local150 < 104; local150++) {
				for (local224 = 0; local224 < 104; local224++) {
					@Pc(234) int local234 = this.aClass34_1.method405(this.anInt909, local150, local224);
					if (local234 != 0) {
						local234 = local234 >> 14 & 0x7FFF;
						@Pc(246) int local246 = Class24.method307(local234).anInt301;
						if (local246 >= 0) {
							@Pc(250) int local250 = local150;
							@Pc(252) int local252 = local224;
							if (local246 != 22 && local246 != 29 && local246 != 34 && local246 != 36 && local246 != 46 && local246 != 47 && local246 != 48) {
								@Pc(284) int[][] local284 = this.aClass5Array1[this.anInt909].anIntArrayArray1;
								for (@Pc(286) int local286 = 0; local286 < 10; local286++) {
									@Pc(293) int local293 = (int) (Math.random() * 4.0D);
									if (local293 == 0 && local250 > 0 && local250 > local150 - 3 && (local284[local250 - 1][local252] & 0x1280108) == 0) {
										local250--;
									}
									if (local293 == 1 && local250 < 103 && local250 < local150 + 3 && (local284[local250 + 1][local252] & 0x1280180) == 0) {
										local250++;
									}
									if (local293 == 2 && local252 > 0 && local252 > local224 - 3 && (local284[local250][local252 - 1] & 0x1280102) == 0) {
										local252--;
									}
									if (local293 == 3 && local252 < 103 && local252 < local224 + 3 && (local284[local250][local252 + 1] & 0x1280120) == 0) {
										local252++;
									}
								}
							}
							this.aClass2_Sub1_Sub2_Sub2Array9[this.anInt1036] = this.aClass2_Sub1_Sub2_Sub2Array5[local246];
							this.anIntArray274[this.anInt1036] = local250;
							this.anIntArray275[this.anInt1036] = local252;
							this.anInt1036++;
						}
					}
				}
			}
			anInt963++;
			if (anInt963 > 1809) {
				anInt963 = 0;
				this.aClass2_Sub1_Sub3_6.method256(84);
				this.aClass2_Sub1_Sub3_6.method257(0);
				local224 = this.aClass2_Sub1_Sub3_6.anInt283;
				this.aClass2_Sub1_Sub3_6.method258(62257);
				if ((int) (Math.random() * 2.0D) == 0) {
					this.aClass2_Sub1_Sub3_6.method257(110);
				}
				this.aClass2_Sub1_Sub3_6.method258(43331);
				this.aClass2_Sub1_Sub3_6.method258((int) (Math.random() * 65536.0D));
				this.aClass2_Sub1_Sub3_6.method258(25179);
				this.aClass2_Sub1_Sub3_6.method258((int) (Math.random() * 65536.0D));
				this.aClass2_Sub1_Sub3_6.method257((int) (Math.random() * 256.0D));
				this.aClass2_Sub1_Sub3_6.method258((int) (Math.random() * 65536.0D));
				if ((int) (Math.random() * 2.0D) == 0) {
					this.aClass2_Sub1_Sub3_6.method258(9644);
				}
				this.aClass2_Sub1_Sub3_6.method258((int) (Math.random() * 65536.0D));
				this.aClass2_Sub1_Sub3_6.method266(this.aClass2_Sub1_Sub3_6.anInt283 - local224);
			}
		} catch (@Pc(519) RuntimeException local519) {
			signlink.reporterror("99057, " + arg0 + ", " + true + ", " + local519.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "m", descriptor = "(Z)V")
	private void method638() {
		try {
			System.out.println("============");
			System.out.println("flame-cycle:" + this.anInt952);
			if (this.aClass8_Sub1_1 != null) {
				System.out.println("Od-cycle:" + this.aClass8_Sub1_1.anInt145);
			}
			System.out.println("loop-cycle:" + anInt878);
			System.out.println("draw-cycle:" + anInt1019);
			System.out.println("ptype:" + this.anInt895);
			System.out.println("psize:" + this.anInt894);
			if (this.aClass14_1 != null) {
				this.aClass14_1.method192();
			}
			super.aBoolean179 = true;
		} catch (@Pc(83) RuntimeException local83) {
			signlink.reporterror("68538, " + false + ", " + local83.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(Z)Ljava/awt/Component;")
	@Override
	protected Component method585() {
		try {
			this.aBoolean204 &= true;
			if (signlink.mainapp == null) {
				return super.aFrame_Sub1_2 == null ? this : super.aFrame_Sub1_2;
			} else {
				return signlink.mainapp;
			}
		} catch (@Pc(18) RuntimeException local18) {
			signlink.reporterror("4423, " + true + ", " + local18.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "n", descriptor = "(Z)V")
	private void method639() {
		try {
			if (this.anInt884 == 0 && this.anInt888 == 0) {
				this.aStringArray14[this.anInt849] = "Walk here";
				this.anIntArray235[this.anInt849] = 158;
				this.anIntArray233[this.anInt849] = super.anInt809;
				this.anIntArray234[this.anInt849] = super.anInt810;
				this.anInt849++;
			}
			@Pc(41) int local41 = -1;
			for (@Pc(47) int local47 = 0; local47 < Class2_Sub1_Sub1_Sub2.anInt114; local47++) {
				@Pc(53) int local53 = Class2_Sub1_Sub1_Sub2.anIntArray53[local47];
				@Pc(57) int local57 = local53 & 0x7F;
				@Pc(63) int local63 = local53 >> 7 & 0x7F;
				@Pc(69) int local69 = local53 >> 29 & 0x3;
				@Pc(75) int local75 = local53 >> 14 & 0x7FFF;
				if (local53 != local41) {
					local41 = local53;
					@Pc(222) int local222;
					if (local69 == 2 && this.aClass34_1.method406(this.anInt909, local57, local63, local53) >= 0) {
						@Pc(95) Class24 local95 = Class24.method307(local75);
						if (local95.anIntArray96 != null) {
							local95 = local95.method310(453);
						}
						if (local95 == null) {
							continue;
						}
						if (this.anInt884 == 1) {
							this.aStringArray14[this.anInt849] = "Use " + this.aString21 + " with @cya@" + local95.aString5;
							this.anIntArray235[this.anInt849] = 37;
							this.anIntArray236[this.anInt849] = local53;
							this.anIntArray233[this.anInt849] = local57;
							this.anIntArray234[this.anInt849] = local63;
							this.anInt849++;
						} else if (this.anInt888 != 1) {
							if (local95.aStringArray2 != null) {
								for (local222 = 4; local222 >= 0; local222--) {
									if (local95.aStringArray2[local222] != null) {
										this.aStringArray14[this.anInt849] = local95.aStringArray2[local222] + " @cya@" + local95.aString5;
										if (local222 == 0) {
											this.anIntArray235[this.anInt849] = 649;
										}
										if (local222 == 1) {
											this.anIntArray235[this.anInt849] = 912;
										}
										if (local222 == 2) {
											this.anIntArray235[this.anInt849] = 224;
										}
										if (local222 == 3) {
											this.anIntArray235[this.anInt849] = 213;
										}
										if (local222 == 4) {
											this.anIntArray235[this.anInt849] = 1161;
										}
										this.anIntArray236[this.anInt849] = local53;
										this.anIntArray233[this.anInt849] = local57;
										this.anIntArray234[this.anInt849] = local63;
										this.anInt849++;
									}
								}
							}
							this.aStringArray14[this.anInt849] = "Examine @cya@" + local95.aString5;
							this.anIntArray235[this.anInt849] = 1509;
							this.anIntArray236[this.anInt849] = local95.anInt298 << 14;
							this.anIntArray233[this.anInt849] = local57;
							this.anIntArray234[this.anInt849] = local63;
							this.anInt849++;
						} else if ((this.anInt890 & 0x4) == 4) {
							this.aStringArray14[this.anInt849] = this.aString22 + " @cya@" + local95.aString5;
							this.anIntArray235[this.anInt849] = 894;
							this.anIntArray236[this.anInt849] = local53;
							this.anIntArray233[this.anInt849] = local57;
							this.anIntArray234[this.anInt849] = local63;
							this.anInt849++;
						}
					}
					@Pc(402) Class2_Sub1_Sub1_Sub4_Sub1 local402;
					@Pc(450) Class2_Sub1_Sub1_Sub4_Sub2 local450;
					@Pc(440) int local440;
					if (local69 == 1) {
						@Pc(373) Class2_Sub1_Sub1_Sub4_Sub1 local373 = this.aClass2_Sub1_Sub1_Sub4_Sub1Array1[local75];
						if (local373.aClass45_1.aByte22 == 1 && (local373.anInt541 & 0x7F) == 64 && (local373.anInt542 & 0x7F) == 64) {
							for (local222 = 0; local222 < this.anInt964; local222++) {
								local402 = this.aClass2_Sub1_Sub1_Sub4_Sub1Array1[this.anIntArray250[local222]];
								if (local402 != null && local402 != local373 && local402.aClass45_1.aByte22 == 1 && local402.anInt541 == local373.anInt541 && local402.anInt542 == local373.anInt542) {
									this.method712(this.anIntArray250[local222], local402.aClass45_1, (byte) 5, local57, local63);
								}
							}
							for (local440 = 0; local440 < this.anInt902; local440++) {
								local450 = this.aClass2_Sub1_Sub1_Sub4_Sub2Array1[this.anIntArray231[local440]];
								if (local450 != null && local450.anInt541 == local373.anInt541 && local450.anInt542 == local373.anInt542) {
									this.method668(local450, local57, local63, this.anIntArray231[local440]);
								}
							}
						}
						this.method712(local75, local373.aClass45_1, (byte) 5, local57, local63);
					}
					if (local69 == 0) {
						@Pc(492) Class2_Sub1_Sub1_Sub4_Sub2 local492 = this.aClass2_Sub1_Sub1_Sub4_Sub2Array1[local75];
						if ((local492.anInt541 & 0x7F) == 64 && (local492.anInt542 & 0x7F) == 64) {
							for (local222 = 0; local222 < this.anInt964; local222++) {
								local402 = this.aClass2_Sub1_Sub1_Sub4_Sub1Array1[this.anIntArray250[local222]];
								if (local402 != null && local402.aClass45_1.aByte22 == 1 && local402.anInt541 == local492.anInt541 && local402.anInt542 == local492.anInt542) {
									this.method712(this.anIntArray250[local222], local402.aClass45_1, (byte) 5, local57, local63);
								}
							}
							for (local440 = 0; local440 < this.anInt902; local440++) {
								local450 = this.aClass2_Sub1_Sub1_Sub4_Sub2Array1[this.anIntArray231[local440]];
								if (local450 != null && local450 != local492 && local450.anInt541 == local492.anInt541 && local450.anInt542 == local492.anInt542) {
									this.method668(local450, local57, local63, this.anIntArray231[local440]);
								}
							}
						}
						this.method668(local492, local57, local63, local75);
					}
					if (local69 == 3) {
						@Pc(611) Class29 local611 = this.aClass29ArrayArrayArray1[this.anInt909][local57][local63];
						if (local611 != null) {
							for (@Pc(618) Class2_Sub1_Sub1_Sub6 local618 = (Class2_Sub1_Sub1_Sub6) local611.method356(); local618 != null; local618 = (Class2_Sub1_Sub1_Sub6) local611.method358()) {
								@Pc(624) Class41 local624 = Class41.method495(local618.anInt600);
								if (this.anInt884 == 1) {
									this.aStringArray14[this.anInt849] = "Use " + this.aString21 + " with @lre@" + local624.aString15;
									this.anIntArray235[this.anInt849] = 989;
									this.anIntArray236[this.anInt849] = local618.anInt600;
									this.anIntArray233[this.anInt849] = local57;
									this.anIntArray234[this.anInt849] = local63;
									this.anInt849++;
								} else if (this.anInt888 != 1) {
									for (@Pc(741) int local741 = 4; local741 >= 0; local741--) {
										if (local624.aStringArray6 != null && local624.aStringArray6[local741] != null) {
											this.aStringArray14[this.anInt849] = local624.aStringArray6[local741] + " @lre@" + local624.aString15;
											if (local741 == 0) {
												this.anIntArray235[this.anInt849] = 48;
											}
											if (local741 == 1) {
												this.anIntArray235[this.anInt849] = 357;
											}
											if (local741 == 2) {
												this.anIntArray235[this.anInt849] = 368;
											}
											if (local741 == 3) {
												this.anIntArray235[this.anInt849] = 670;
											}
											if (local741 == 4) {
												this.anIntArray235[this.anInt849] = 972;
											}
											this.anIntArray236[this.anInt849] = local618.anInt600;
											this.anIntArray233[this.anInt849] = local57;
											this.anIntArray234[this.anInt849] = local63;
											this.anInt849++;
										} else if (local741 == 2) {
											this.aStringArray14[this.anInt849] = "Take @lre@" + local624.aString15;
											this.anIntArray235[this.anInt849] = 368;
											this.anIntArray236[this.anInt849] = local618.anInt600;
											this.anIntArray233[this.anInt849] = local57;
											this.anIntArray234[this.anInt849] = local63;
											this.anInt849++;
										}
									}
									this.aStringArray14[this.anInt849] = "Examine @lre@" + local624.aString15;
									this.anIntArray235[this.anInt849] = 1876;
									this.anIntArray236[this.anInt849] = local618.anInt600;
									this.anIntArray233[this.anInt849] = local57;
									this.anIntArray234[this.anInt849] = local63;
									this.anInt849++;
								} else if ((this.anInt890 & 0x1) == 1) {
									this.aStringArray14[this.anInt849] = this.aString22 + " @lre@" + local624.aString15;
									this.anIntArray235[this.anInt849] = 924;
									this.anIntArray236[this.anInt849] = local618.anInt600;
									this.anIntArray233[this.anInt849] = local57;
									this.anIntArray234[this.anInt849] = local63;
									this.anInt849++;
								}
							}
						}
					}
				}
			}
		} catch (@Pc(948) RuntimeException local948) {
			signlink.reporterror("47702, " + false + ", " + local948.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;II)V")
	private void method640(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2) {
		try {
			if (this.anInt969 != -39349) {
				this.anInt966 = 117;
			}
			if (arg2 == 0 && this.anInt856 != -1) {
				this.aString20 = arg0;
				super.anInt814 = 0;
			}
			if (this.anInt974 == -1) {
				this.aBoolean225 = true;
			}
			for (@Pc(27) int local27 = 99; local27 > 0; local27--) {
				this.anIntArray251[local27] = this.anIntArray251[local27 - 1];
				this.aStringArray11[local27] = this.aStringArray11[local27 - 1];
				this.aStringArray12[local27] = this.aStringArray12[local27 - 1];
			}
			this.anIntArray251[0] = arg2;
			this.aStringArray11[0] = arg1;
			this.aStringArray12[0] = arg0;
		} catch (@Pc(79) RuntimeException local79) {
			signlink.reporterror("75496, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + -39349 + ", " + local79.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "r", descriptor = "(I)V")
	private void method641() {
		try {
			@Pc(7) byte[] local7 = this.aClass13_2.method186("title.dat", null);
			@Pc(13) Class2_Sub1_Sub2_Sub2 local13 = new Class2_Sub1_Sub2_Sub2(local7, this);
			this.aClass17_6.method195();
			local13.method480(0, 0);
			this.aClass17_7.method195();
			local13.method480(-637, 0);
			this.aClass17_3.method195();
			local13.method480(-128, 0);
			this.aClass17_4.method195();
			local13.method480(-202, -371);
			this.aClass17_5.method195();
			local13.method480(-202, -171);
			this.aClass17_8.method195();
			local13.method480(0, -265);
			this.aClass17_9.method195();
			local13.method480(-562, -265);
			this.aClass17_10.method195();
			local13.method480(-128, -171);
			this.aClass17_11.method195();
			local13.method480(-562, -171);
			@Pc(109) int[] local109 = new int[local13.anInt634];
			for (@Pc(111) int local111 = 0; local111 < local13.anInt635; local111++) {
				for (@Pc(115) int local115 = 0; local115 < local13.anInt634; local115++) {
					local109[local115] = local13.anIntArray164[local13.anInt634 + local13.anInt634 * local111 - local115 - 1];
				}
				for (@Pc(141) int local141 = 0; local141 < local13.anInt634; local141++) {
					local13.anIntArray164[local141 + local13.anInt634 * local111] = local109[local141];
				}
			}
			this.aClass17_6.method195();
			local13.method480(382, 0);
			this.aClass17_7.method195();
			local13.method480(-255, 0);
			this.aClass17_3.method195();
			local13.method480(254, 0);
			this.aClass17_4.method195();
			local13.method480(180, -371);
			this.aClass17_5.method195();
			local13.method480(180, -171);
			this.aClass17_8.method195();
			local13.method480(382, -265);
			this.aClass17_9.method195();
			local13.method480(-180, -265);
			this.aClass17_10.method195();
			local13.method480(254, -171);
			this.aClass17_11.method195();
			local13.method480(-180, -171);
			local13 = new Class2_Sub1_Sub2_Sub2(this.aClass13_2, "logo", 0);
			this.aClass17_3.method195();
			local13.method482(382 - local13.anInt634 / 2 - 128, 18);
			System.gc();
		} catch (@Pc(284) RuntimeException local284) {
			signlink.reporterror("27286, " + -480 + ", " + local284.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(B)V")
	private void method642(@OriginalArg(0) byte arg0) {
		try {
			Class24.aClass36_3.method458();
			Class24.aClass36_2.method458();
			Class45.aClass36_9.method458();
			if (arg0 == 4) {
				@Pc(12) boolean local12 = false;
			} else {
				for (@Pc(16) int local16 = 1; local16 > 0; local16++) {
				}
			}
			Class41.aClass36_7.method458();
			Class41.aClass36_8.method458();
			Class2_Sub1_Sub1_Sub4_Sub2.aClass36_6.method458();
			Class4.aClass36_1.method458();
		} catch (@Pc(31) RuntimeException local31) {
			signlink.reporterror("57544, " + arg0 + ", " + local31.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!PQPZKUPU;I)Z")
	private boolean method643(@OriginalArg(0) Class31 arg0) {
		try {
			@Pc(11) int local11 = arg0.anInt407;
			if (this.anInt989 == 2) {
				if (local11 == 201) {
					this.aBoolean225 = true;
					this.anInt825 = 0;
					this.aBoolean182 = true;
					this.aString26 = "";
					this.anInt993 = 1;
					this.aString25 = "Enter name of friend to add to list";
				}
				if (local11 == 202) {
					this.aBoolean225 = true;
					this.anInt825 = 0;
					this.aBoolean182 = true;
					this.aString26 = "";
					this.anInt993 = 2;
					this.aString25 = "Enter name of friend to delete from list";
				}
			}
			if (local11 == 205) {
				this.anInt898 = 250;
				return true;
			}
			if (local11 == 501) {
				this.aBoolean225 = true;
				this.anInt825 = 0;
				this.aBoolean182 = true;
				this.aString26 = "";
				this.anInt993 = 4;
				this.aString25 = "Enter name of player to add to list";
			}
			if (local11 == 502) {
				this.aBoolean225 = true;
				this.anInt825 = 0;
				this.aBoolean182 = true;
				this.aString26 = "";
				this.anInt993 = 5;
				this.aString25 = "Enter name of player to delete from list";
			}
			@Pc(119) int local119;
			@Pc(123) int local123;
			@Pc(128) int local128;
			if (local11 >= 300 && local11 <= 313) {
				local119 = (local11 - 300) / 2;
				local123 = local11 & 0x1;
				local128 = this.anIntArray260[local119];
				if (local128 != -1) {
					while (true) {
						if (local123 == 0) {
							local128--;
							if (local128 < 0) {
								local128 = Class6.anInt91 - 1;
							}
						}
						if (local123 == 1) {
							local128++;
							if (local128 >= Class6.anInt91) {
								local128 = 0;
							}
						}
						if (!Class6.aClass6Array1[local128].aBoolean28 && Class6.aClass6Array1[local128].anInt92 == local119 + (this.aBoolean211 ? 0 : 7)) {
							this.anIntArray260[local119] = local128;
							this.aBoolean206 = true;
							break;
						}
					}
				}
			}
			if (local11 >= 314 && local11 <= 323) {
				local119 = (local11 - 314) / 2;
				local123 = local11 & 0x1;
				local128 = this.anIntArray263[local119];
				if (local123 == 0) {
					local128--;
					if (local128 < 0) {
						local128 = anIntArrayArray23[local119].length - 1;
					}
				}
				if (local123 == 1) {
					local128++;
					if (local128 >= anIntArrayArray23[local119].length) {
						local128 = 0;
					}
				}
				this.anIntArray263[local119] = local128;
				this.aBoolean206 = true;
			}
			if (local11 == 324 && !this.aBoolean211) {
				this.aBoolean211 = true;
				this.method660(493);
			}
			if (local11 == 325 && this.aBoolean211) {
				this.aBoolean211 = false;
				this.method660(493);
			}
			if (local11 == 326) {
				this.aClass2_Sub1_Sub3_6.method256(6);
				this.aClass2_Sub1_Sub3_6.method257(this.aBoolean211 ? 0 : 1);
				for (local119 = 0; local119 < 7; local119++) {
					this.aClass2_Sub1_Sub3_6.method257(this.anIntArray260[local119]);
				}
				for (local123 = 0; local123 < 5; local123++) {
					this.aClass2_Sub1_Sub3_6.method257(this.anIntArray263[local123]);
				}
				return true;
			}
			if (local11 == 620) {
				this.aBoolean212 = !this.aBoolean212;
			}
			if (local11 >= 601 && local11 <= 613) {
				this.method592();
				if (this.aString23.length() > 0) {
					this.aClass2_Sub1_Sub3_6.method256(111);
					this.aClass2_Sub1_Sub3_6.method263(Class28.method346(this.aString23));
					this.aClass2_Sub1_Sub3_6.method257(local11 - 601);
					this.aClass2_Sub1_Sub3_6.method257(this.aBoolean212 ? 1 : 0);
				}
			}
			return false;
		} catch (@Pc(356) RuntimeException local356) {
			signlink.reporterror("17680, " + arg0 + ", " + 12768 + ", " + local356.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "f", descriptor = "(B)V")
	private void method644() {
		try {
			this.method635();
			@Pc(54) int local54;
			if (this.anInt841 == 1) {
				this.aClass2_Sub1_Sub2_Sub2Array7[this.anInt840 / 100].method482(this.anInt838 - 8 - 4, this.anInt839 - 8 - 4);
				anInt928++;
				if (anInt928 > 1080) {
					anInt928 = 0;
					this.aClass2_Sub1_Sub3_6.method256(87);
					this.aClass2_Sub1_Sub3_6.method257(0);
					local54 = this.aClass2_Sub1_Sub3_6.anInt283;
					this.aClass2_Sub1_Sub3_6.method258((int) (Math.random() * 65536.0D));
					this.aClass2_Sub1_Sub3_6.method258(32682);
					this.aClass2_Sub1_Sub3_6.method257((int) (Math.random() * 256.0D));
					if ((int) (Math.random() * 2.0D) == 0) {
						this.aClass2_Sub1_Sub3_6.method258(12504);
					}
					this.aClass2_Sub1_Sub3_6.method258(3838);
					this.aClass2_Sub1_Sub3_6.method258(9810);
					this.aClass2_Sub1_Sub3_6.method258(62194);
					this.aClass2_Sub1_Sub3_6.method257((int) (Math.random() * 256.0D));
					this.aClass2_Sub1_Sub3_6.method257(58);
					if ((int) (Math.random() * 2.0D) == 0) {
						this.aClass2_Sub1_Sub3_6.method258(63841);
					}
					this.aClass2_Sub1_Sub3_6.method266(this.aClass2_Sub1_Sub3_6.anInt283 - local54);
				}
			}
			if (this.anInt841 == 2) {
				this.aClass2_Sub1_Sub2_Sub2Array7[this.anInt840 / 100 + 4].method482(this.anInt838 - 8 - 4, this.anInt839 - 8 - 4);
			}
			if (this.anInt987 != -1) {
				this.method605(this.anInt987, this.anInt848, (byte) 5);
				this.method612(0, 0, Class31.method366(this.anInt987), 0);
			}
			if (this.anInt1039 != -1) {
				this.method605(this.anInt1039, this.anInt848, (byte) 5);
				this.method612(0, 0, Class31.method366(this.anInt1039), 0);
			}
			this.method604(this.aBoolean213);
			if (!this.aBoolean224) {
				this.method693();
				this.method709();
			} else if (this.anInt869 == 0) {
				this.method713();
			}
			if (this.anInt881 == 1) {
				this.aClass2_Sub1_Sub2_Sub2_7.method482(472, 296);
			}
			@Pc(262) int local262;
			if (aBoolean200) {
				@Pc(228) byte local228 = 20;
				@Pc(230) int local230 = 16776960;
				if (super.anInt804 < 30 && aBoolean197) {
					local230 = 16711680;
				}
				if (super.anInt804 < 20 && !aBoolean197) {
					local230 = 16711680;
				}
				this.aClass2_Sub1_Sub2_Sub4_3.method557(20, local230, "Fps:" + super.anInt804);
				local262 = local228 + 15;
				@Pc(264) Runtime local264 = Runtime.getRuntime();
				@Pc(273) int local273 = (int) ((local264.totalMemory() - local264.freeMemory()) / 1024L);
				if (local273 > 33554432 && aBoolean197) {
				}
				if (local273 > 67108864 && !aBoolean197) {
				}
				this.aClass2_Sub1_Sub2_Sub4_3.method557(35, 16776960, "Mem:" + local273 + "k");
				local262 += 15;
			}
			if (this.anInt992 != 0) {
				local54 = this.anInt992 / 50;
				local262 = local54 / 60;
				local54 %= 60;
				if (local54 < 10) {
					this.aClass2_Sub1_Sub2_Sub4_3.method562("System update in: " + local262 + ":0" + local54, 329, 4, 16776960);
				} else {
					this.aClass2_Sub1_Sub2_Sub4_3.method562("System update in: " + local262 + ":" + local54, 329, 4, 16776960);
				}
				anInt1046++;
				if (anInt1046 > 154) {
					anInt1046 = 0;
					this.aClass2_Sub1_Sub3_6.method256(215);
					this.aClass2_Sub1_Sub3_6.method258(2407);
					return;
				}
			}
		} catch (@Pc(383) RuntimeException local383) {
			signlink.reporterror("39416, " + 0 + ", " + local383.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "s", descriptor = "(I)V")
	private void method645() {
		try {
			try {
				if (this.aClass14_1 != null) {
					this.aClass14_1.method187();
				}
			} catch (@Pc(9) Exception local9) {
			}
			this.aClass14_1 = null;
			this.aBoolean204 = false;
			this.anInt915 = 0;
			this.aString29 = "";
			this.aString30 = "";
			this.method642(this.aByte33);
			this.aClass34_1.method376();
			for (@Pc(40) int local40 = 0; local40 < 4; local40++) {
				this.aClass5Array1[local40].method20();
			}
			System.gc();
			this.method679();
			this.anInt951 = -1;
			this.anInt1034 = -1;
			this.anInt950 = 0;
		} catch (@Pc(66) RuntimeException local66) {
			signlink.reporterror("61548, " + -852 + ", " + local66.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;)V")
	private void method646(@OriginalArg(0) String arg0, @OriginalArg(2) String arg1) {
		try {
			this.anInt894 += 0;
			@Pc(17) int local17;
			if (this.aClass17_23 != null) {
				this.aClass17_23.method195();
				Class2_Sub1_Sub2_Sub1.anIntArray9 = this.anIntArray267;
				local17 = 151;
				if (arg0 != null) {
					local17 -= 7;
				}
				this.aClass2_Sub1_Sub2_Sub4_3.method558(0, 257, local17, arg1);
				this.aClass2_Sub1_Sub2_Sub4_3.method558(16777215, 256, local17 - 1, arg1);
				local17 += 15;
				if (arg0 != null) {
					this.aClass2_Sub1_Sub2_Sub4_3.method558(0, 257, local17, arg0);
					this.aClass2_Sub1_Sub2_Sub4_3.method558(16777215, 256, local17 - 1, arg0);
				}
				this.aClass17_23.method196(super.aGraphics2, 4, 4);
			} else if (super.aClass17_2 != null) {
				super.aClass17_2.method195();
				Class2_Sub1_Sub2_Sub1.anIntArray9 = this.anIntArray268;
				local17 = 251;
				Class2_Sub1_Sub2.method550(300, 233, 0, 221, 50);
				Class2_Sub1_Sub2.method551(50, 16777215, 233, 300, 221);
				if (arg0 != null) {
					local17 -= 7;
				}
				this.aClass2_Sub1_Sub2_Sub4_3.method558(0, 383, local17, arg1);
				this.aClass2_Sub1_Sub2_Sub4_3.method558(16777215, 382, local17 - 1, arg1);
				local17 += 15;
				if (arg0 != null) {
					this.aClass2_Sub1_Sub2_Sub4_3.method558(0, 383, local17, arg0);
					this.aClass2_Sub1_Sub2_Sub4_3.method558(16777215, 382, local17 - 1, arg0);
				}
				super.aClass17_2.method196(super.aGraphics2, 0, 0);
			}
		} catch (@Pc(170) RuntimeException local170) {
			signlink.reporterror("19736, " + arg0 + ", " + 0 + ", " + arg1 + ", " + local170.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "o", descriptor = "(Z)V")
	private void method647() {
		try {
			for (@Pc(6) Class2_Sub1_Sub1_Sub5 local6 = (Class2_Sub1_Sub1_Sub5) this.aClass29_11.method355(); local6 != null; local6 = (Class2_Sub1_Sub1_Sub5) this.aClass29_11.method357()) {
				if (local6.anInt385 != this.anInt909 || anInt878 > local6.anInt387) {
					local6.method573();
				} else if (anInt878 >= local6.anInt386) {
					if (local6.anInt390 > 0) {
						@Pc(46) Class2_Sub1_Sub1_Sub4_Sub1 local46 = this.aClass2_Sub1_Sub1_Sub4_Sub1Array1[local6.anInt390 - 1];
						if (local46 != null && local46.anInt541 >= 0 && local46.anInt541 < 13312 && local46.anInt542 >= 0 && local46.anInt542 < 13312) {
							local6.method344(local46.anInt542, local46.anInt541, this.method717(local46.anInt541, local6.anInt385, local46.anInt542) - local6.anInt382, anInt878);
						}
					}
					if (local6.anInt390 < 0) {
						@Pc(91) int local91 = -local6.anInt390 - 1;
						@Pc(97) Class2_Sub1_Sub1_Sub4_Sub2 local97;
						if (local91 == this.anInt1006) {
							local97 = aClass2_Sub1_Sub1_Sub4_Sub2_1;
						} else {
							local97 = this.aClass2_Sub1_Sub1_Sub4_Sub2Array1[local91];
						}
						if (local97 != null && local97.anInt541 >= 0 && local97.anInt541 < 13312 && local97.anInt542 >= 0 && local97.anInt542 < 13312) {
							local6.method344(local97.anInt542, local97.anInt541, this.method717(local97.anInt541, local6.anInt385, local97.anInt542) - local6.anInt382, anInt878);
						}
					}
					local6.method345(this.anInt848);
					this.aClass34_1.method387(local6, this.anInt909, (int) local6.aDouble3, local6.anInt383, -1, (int) local6.aDouble1, 60, false, (int) local6.aDouble2);
				}
			}
		} catch (@Pc(177) RuntimeException local177) {
			signlink.reporterror("13256, " + true + ", " + local177.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIIIIIIII)V")
	private void method648(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		try {
			@Pc(1) Class2_Sub3 local1 = null;
			for (@Pc(6) Class2_Sub3 local6 = (Class2_Sub3) this.aClass29_10.method355(); local6 != null; local6 = (Class2_Sub3) this.aClass29_10.method357()) {
				if (local6.anInt225 == arg5 && local6.anInt227 == arg1 && local6.anInt228 == arg0 && local6.anInt226 == arg8) {
					local1 = local6;
					break;
				}
			}
			if (local1 == null) {
				local1 = new Class2_Sub3();
				local1.anInt225 = arg5;
				local1.anInt226 = arg8;
				local1.anInt227 = arg1;
				local1.anInt228 = arg0;
				this.method708(local1, this.aByte48);
				this.aClass29_10.method352(local1);
			}
			local1.anInt229 = arg3;
			local1.anInt231 = arg2;
			local1.anInt230 = arg6;
			local1.anInt232 = arg7;
			local1.anInt221 = arg4;
		} catch (@Pc(88) RuntimeException local88) {
			signlink.reporterror("85078, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + 2 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + local88.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IBIIIIIIZIII)Z")
	private boolean method649(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11) {
		try {
			@Pc(11) int local11;
			for (@Pc(7) int local7 = 0; local7 < 104; local7++) {
				for (local11 = 0; local11 < 104; local11++) {
					this.anIntArrayArray25[local7][local11] = 0;
					this.anIntArrayArray24[local7][local11] = 99999999;
				}
			}
			local11 = arg0;
			@Pc(39) int local39 = arg9;
			if (arg1 != 1) {
				throw new NullPointerException();
			}
			@Pc(44) boolean local44 = false;
			this.anIntArrayArray25[arg0][arg9] = 99;
			this.anIntArrayArray24[arg0][arg9] = 0;
			@Pc(65) byte local65 = 0;
			@Pc(67) int local67 = 0;
			this.anIntArray247[0] = arg0;
			int var30 = local65 + 1;
			this.anIntArray248[0] = arg9;
			@Pc(80) boolean local80 = false;
			@Pc(84) int local84 = this.anIntArray247.length;
			@Pc(91) int[][] local91 = this.aClass5Array1[this.anInt909].anIntArrayArray1;
			@Pc(203) int local203;
			while (local67 != var30) {
				local11 = this.anIntArray247[local67];
				local39 = this.anIntArray248[local67];
				local67 = (local67 + 1) % local84;
				if (local11 == arg11 && local39 == arg7) {
					local80 = true;
					break;
				}
				if (arg4 != 0) {
					if ((arg4 < 5 || arg4 == 10) && this.aClass5Array1[this.anInt909].method29(arg7, arg2, local11, local39, arg11, arg4 - 1)) {
						local80 = true;
						break;
					}
					if (arg4 < 10 && this.aClass5Array1[this.anInt909].method30(local11, arg2, arg7, arg4 - 1, arg11, local39)) {
						local80 = true;
						break;
					}
				}
				if (arg10 != 0 && arg3 != 0 && this.aClass5Array1[this.anInt909].method31(local39, local11, arg7, arg11, arg5, arg10, arg3)) {
					local80 = true;
					break;
				}
				local203 = this.anIntArrayArray24[local11][local39] + 1;
				if (local11 > 0 && this.anIntArrayArray25[local11 - 1][local39] == 0 && (local91[local11 - 1][local39] & 0x1280108) == 0) {
					this.anIntArray247[var30] = local11 - 1;
					this.anIntArray248[var30] = local39;
					var30 = (var30 + 1) % local84;
					this.anIntArrayArray25[local11 - 1][local39] = 2;
					this.anIntArrayArray24[local11 - 1][local39] = local203;
				}
				if (local11 < 103 && this.anIntArrayArray25[local11 + 1][local39] == 0 && (local91[local11 + 1][local39] & 0x1280180) == 0) {
					this.anIntArray247[var30] = local11 + 1;
					this.anIntArray248[var30] = local39;
					var30 = (var30 + 1) % local84;
					this.anIntArrayArray25[local11 + 1][local39] = 8;
					this.anIntArrayArray24[local11 + 1][local39] = local203;
				}
				if (local39 > 0 && this.anIntArrayArray25[local11][local39 - 1] == 0 && (local91[local11][local39 - 1] & 0x1280102) == 0) {
					this.anIntArray247[var30] = local11;
					this.anIntArray248[var30] = local39 - 1;
					var30 = (var30 + 1) % local84;
					this.anIntArrayArray25[local11][local39 - 1] = 1;
					this.anIntArrayArray24[local11][local39 - 1] = local203;
				}
				if (local39 < 103 && this.anIntArrayArray25[local11][local39 + 1] == 0 && (local91[local11][local39 + 1] & 0x1280120) == 0) {
					this.anIntArray247[var30] = local11;
					this.anIntArray248[var30] = local39 + 1;
					var30 = (var30 + 1) % local84;
					this.anIntArrayArray25[local11][local39 + 1] = 4;
					this.anIntArrayArray24[local11][local39 + 1] = local203;
				}
				if (local11 > 0 && local39 > 0 && this.anIntArrayArray25[local11 - 1][local39 - 1] == 0 && (local91[local11 - 1][local39 - 1] & 0x128010E) == 0 && (local91[local11 - 1][local39] & 0x1280108) == 0 && (local91[local11][local39 - 1] & 0x1280102) == 0) {
					this.anIntArray247[var30] = local11 - 1;
					this.anIntArray248[var30] = local39 - 1;
					var30 = (var30 + 1) % local84;
					this.anIntArrayArray25[local11 - 1][local39 - 1] = 3;
					this.anIntArrayArray24[local11 - 1][local39 - 1] = local203;
				}
				if (local11 < 103 && local39 > 0 && this.anIntArrayArray25[local11 + 1][local39 - 1] == 0 && (local91[local11 + 1][local39 - 1] & 0x1280183) == 0 && (local91[local11 + 1][local39] & 0x1280180) == 0 && (local91[local11][local39 - 1] & 0x1280102) == 0) {
					this.anIntArray247[var30] = local11 + 1;
					this.anIntArray248[var30] = local39 - 1;
					var30 = (var30 + 1) % local84;
					this.anIntArrayArray25[local11 + 1][local39 - 1] = 9;
					this.anIntArrayArray24[local11 + 1][local39 - 1] = local203;
				}
				if (local11 > 0 && local39 < 103 && this.anIntArrayArray25[local11 - 1][local39 + 1] == 0 && (local91[local11 - 1][local39 + 1] & 0x1280138) == 0 && (local91[local11 - 1][local39] & 0x1280108) == 0 && (local91[local11][local39 + 1] & 0x1280120) == 0) {
					this.anIntArray247[var30] = local11 - 1;
					this.anIntArray248[var30] = local39 + 1;
					var30 = (var30 + 1) % local84;
					this.anIntArrayArray25[local11 - 1][local39 + 1] = 6;
					this.anIntArrayArray24[local11 - 1][local39 + 1] = local203;
				}
				if (local11 < 103 && local39 < 103 && this.anIntArrayArray25[local11 + 1][local39 + 1] == 0 && (local91[local11 + 1][local39 + 1] & 0x12801E0) == 0 && (local91[local11 + 1][local39] & 0x1280180) == 0 && (local91[local11][local39 + 1] & 0x1280120) == 0) {
					this.anIntArray247[var30] = local11 + 1;
					this.anIntArray248[var30] = local39 + 1;
					var30 = (var30 + 1) % local84;
					this.anIntArrayArray25[local11 + 1][local39 + 1] = 12;
					this.anIntArrayArray24[local11 + 1][local39 + 1] = local203;
				}
			}
			this.anInt836 = 0;
			@Pc(819) int local819;
			@Pc(825) int local825;
			@Pc(831) int local831;
			if (!local80) {
				if (arg8) {
					local203 = 100;
					for (local819 = 1; local819 < 2; local819++) {
						for (local825 = arg11 - local819; local825 <= arg11 + local819; local825++) {
							for (local831 = arg7 - local819; local831 <= arg7 + local819; local831++) {
								if (local825 >= 0 && local831 >= 0 && local825 < 104 && local831 < 104 && this.anIntArrayArray24[local825][local831] < local203) {
									local203 = this.anIntArrayArray24[local825][local831];
									local11 = local825;
									local39 = local831;
									this.anInt836 = 1;
									local80 = true;
								}
							}
						}
						if (local80) {
							break;
						}
					}
				}
				if (!local80) {
					return false;
				}
			}
			@Pc(892) byte local892 = 0;
			this.anIntArray247[0] = local11;
			local67 = local892 + 1;
			this.anIntArray248[0] = local39;
			local203 = local819 = this.anIntArrayArray25[local11][local39];
			while (local11 != arg0 || local39 != arg9) {
				if (local203 != local819) {
					local819 = local203;
					this.anIntArray247[local67] = local11;
					this.anIntArray248[local67++] = local39;
				}
				if ((local203 & 0x2) != 0) {
					local11++;
				} else if ((local203 & 0x8) != 0) {
					local11--;
				}
				if ((local203 & 0x1) != 0) {
					local39++;
				} else if ((local203 & 0x4) != 0) {
					local39--;
				}
				local203 = this.anIntArrayArray25[local11][local39];
			}
			if (local67 > 0) {
				local84 = local67;
				if (local67 > 25) {
					local84 = 25;
				}
				local67--;
				local825 = this.anIntArray247[local67];
				local831 = this.anIntArray248[local67];
				if (arg6 == 0) {
					this.aClass2_Sub1_Sub3_6.method256(108);
					this.aClass2_Sub1_Sub3_6.method257(local84 + local84 + 3);
				}
				if (arg6 == 1) {
					this.aClass2_Sub1_Sub3_6.method256(131);
					this.aClass2_Sub1_Sub3_6.method257(local84 + local84 + 3 + 14);
				}
				if (arg6 == 2) {
					this.aClass2_Sub1_Sub3_6.method256(61);
					this.aClass2_Sub1_Sub3_6.method257(local84 + local84 + 3);
				}
				this.aClass2_Sub1_Sub3_6.method257(super.anIntArray210[5] == 1 ? 1 : 0);
				this.anInt910 = this.anIntArray247[0];
				this.anInt911 = this.anIntArray248[0];
				for (@Pc(1062) int local1062 = 1; local1062 < local84; local1062++) {
					local67--;
					this.aClass2_Sub1_Sub3_6.method257(this.anIntArray247[local67] - local825);
					this.aClass2_Sub1_Sub3_6.method283(this.anIntArray248[local67] - local831);
				}
				this.aClass2_Sub1_Sub3_6.method291(local831 + this.anInt875);
				this.aClass2_Sub1_Sub3_6.method291(local825 + this.anInt874);
				return true;
			} else if (arg6 == 1) {
				return false;
			} else {
				return true;
			}
		} catch (@Pc(1114) RuntimeException local1114) {
			signlink.reporterror("58880, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + arg10 + ", " + arg11 + ", " + local1114.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "p", descriptor = "(Z)V")
	private void method650() {
		try {
			if (super.aClass17_2 == null) {
				this.method589(this.aByte49);
				this.aClass17_3 = null;
				this.aClass17_4 = null;
				this.aClass17_5 = null;
				this.aClass17_6 = null;
				this.aClass17_7 = null;
				this.aClass17_8 = null;
				this.aClass17_9 = null;
				this.aClass17_10 = null;
				this.aClass17_11 = null;
				this.aClass17_24 = null;
				this.aClass17_22 = null;
				this.aClass17_21 = null;
				this.aClass17_23 = null;
				this.aClass17_25 = null;
				this.aClass17_26 = null;
				this.aClass17_27 = null;
				super.aClass17_2 = new Class17(503, 765, this.method585(), anInt978);
				this.aBoolean183 = true;
			}
		} catch (@Pc(76) RuntimeException local76) {
			signlink.reporterror("74014, " + false + ", " + local76.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "t", descriptor = "(I)V")
	private void method651() {
		try {
			this.anInt844 = 0;
			@Pc(70) int local70;
			for (@Pc(6) int local6 = -1; local6 < this.anInt902 + this.anInt964; local6++) {
				@Pc(13) Class2_Sub1_Sub1_Sub4 local13;
				if (local6 == -1) {
					local13 = aClass2_Sub1_Sub1_Sub4_Sub2_1;
				} else if (local6 < this.anInt902) {
					local13 = this.aClass2_Sub1_Sub1_Sub4_Sub2Array1[this.anIntArray231[local6]];
				} else {
					local13 = this.aClass2_Sub1_Sub1_Sub4_Sub1Array1[this.anIntArray250[local6 - this.anInt902]];
				}
				if (local13 != null && local13.method446()) {
					@Pc(54) Class45 local54;
					if (local13 instanceof Class2_Sub1_Sub1_Sub4_Sub1) {
						local54 = ((Class2_Sub1_Sub1_Sub4_Sub1) local13).aClass45_1;
						if (local54.anIntArray174 != null) {
							local54 = local54.method513();
						}
						if (local54 == null) {
							continue;
						}
					}
					if (local6 >= this.anInt902) {
						local54 = ((Class2_Sub1_Sub1_Sub4_Sub1) local13).aClass45_1;
						if (local54.anInt682 >= 0 && local54.anInt682 < this.aClass2_Sub1_Sub2_Sub2Array6.length) {
							this.method618(local13, local13.anInt554 + 15);
							if (this.anInt882 > -1) {
								this.aClass2_Sub1_Sub2_Sub2Array6[local54.anInt682].method482(this.anInt882 - 12, this.anInt883 - 30);
							}
						}
						if (this.anInt927 == 1 && this.anInt914 == this.anIntArray250[local6 - this.anInt902] && anInt878 % 20 < 10) {
							this.method618(local13, local13.anInt554 + 15);
							if (this.anInt882 > -1) {
								this.aClass2_Sub1_Sub2_Sub2Array8[0].method482(this.anInt882 - 12, this.anInt883 - 28);
							}
						}
					} else {
						local70 = 30;
						@Pc(73) Class2_Sub1_Sub1_Sub4_Sub2 local73 = (Class2_Sub1_Sub1_Sub4_Sub2) local13;
						if (local73.anInt596 != -1 || local73.anInt585 != -1) {
							this.method618(local13, local13.anInt554 + 15);
							if (this.anInt882 > -1) {
								if (local73.anInt596 != -1) {
									this.aClass2_Sub1_Sub2_Sub2Array4[local73.anInt596].method482(this.anInt882 - 12, this.anInt883 - 30);
									local70 += 25;
								}
								if (local73.anInt585 != -1) {
									this.aClass2_Sub1_Sub2_Sub2Array6[local73.anInt585].method482(this.anInt882 - 12, this.anInt883 - local70);
									local70 += 25;
								}
							}
						}
						if (local6 >= 0 && this.anInt927 == 10 && this.anInt853 == this.anIntArray231[local6]) {
							this.method618(local13, local13.anInt554 + 15);
							if (this.anInt882 > -1) {
								this.aClass2_Sub1_Sub2_Sub2Array8[1].method482(this.anInt882 - 12, this.anInt883 - local70);
							}
						}
					}
					if (local13.aString13 != null && (local6 >= this.anInt902 || this.anInt918 == 0 || this.anInt918 == 3 || this.anInt918 == 1 && this.method590(((Class2_Sub1_Sub1_Sub4_Sub2) local13).aString14))) {
						this.method618(local13, local13.anInt554);
						if (this.anInt882 > -1 && this.anInt844 < this.anInt845) {
							this.anIntArray217[this.anInt844] = this.aClass2_Sub1_Sub2_Sub4_4.method561(local13.aString13) / 2;
							this.anIntArray216[this.anInt844] = this.aClass2_Sub1_Sub2_Sub4_4.anInt793;
							this.anIntArray214[this.anInt844] = this.anInt882;
							this.anIntArray215[this.anInt844] = this.anInt883;
							this.anIntArray218[this.anInt844] = local13.anInt557;
							this.anIntArray219[this.anInt844] = local13.anInt540;
							this.anIntArray220[this.anInt844] = local13.anInt553;
							this.aStringArray9[this.anInt844++] = local13.aString13;
							if (this.anInt891 == 0 && local13.anInt540 >= 1 && local13.anInt540 <= 3) {
								this.anIntArray216[this.anInt844] += 10;
								this.anIntArray215[this.anInt844] += 5;
							}
							if (this.anInt891 == 0 && local13.anInt540 == 4) {
								this.anIntArray217[this.anInt844] = 60;
							}
							if (this.anInt891 == 0 && local13.anInt540 == 5) {
								this.anIntArray216[this.anInt844] += 5;
							}
						}
					}
					if (local13.anInt578 > anInt878) {
						this.method618(local13, local13.anInt554 + 15);
						if (this.anInt882 > -1) {
							local70 = local13.anInt579 * 30 / local13.anInt580;
							if (local70 > 30) {
								local70 = 30;
							}
							Class2_Sub1_Sub2.method550(local70, this.anInt882 - 15, 65280, this.anInt883 - 3, 5);
							Class2_Sub1_Sub2.method550(30 - local70, this.anInt882 - 15 + local70, 16711680, this.anInt883 - 3, 5);
						}
					}
					for (local70 = 0; local70 < 4; local70++) {
						if (local13.anIntArray147[local70] > anInt878) {
							this.method618(local13, local13.anInt554 / 2);
							if (this.anInt882 > -1) {
								if (local70 == 1) {
									this.anInt883 -= 20;
								}
								if (local70 == 2) {
									this.anInt882 -= 15;
									this.anInt883 -= 10;
								}
								if (local70 == 3) {
									this.anInt882 += 15;
									this.anInt883 -= 10;
								}
								this.aClass2_Sub1_Sub2_Sub2Array10[local13.anIntArray146[local70]].method482(this.anInt882 - 12, this.anInt883 - 12);
								this.aClass2_Sub1_Sub2_Sub4_2.method558(0, this.anInt882, this.anInt883 + 4, String.valueOf(local13.anIntArray145[local70]));
								this.aClass2_Sub1_Sub2_Sub4_2.method558(16777215, this.anInt882 - 1, this.anInt883 + 3, String.valueOf(local13.anIntArray145[local70]));
							}
						}
					}
				}
			}
			for (@Pc(610) int local610 = 0; local610 < this.anInt844; local610++) {
				local70 = this.anIntArray214[local610];
				@Pc(622) int local622 = this.anIntArray215[local610];
				@Pc(627) int local627 = this.anIntArray217[local610];
				@Pc(632) int local632 = this.anIntArray216[local610];
				@Pc(634) boolean local634 = true;
				while (local634) {
					local634 = false;
					for (@Pc(640) int local640 = 0; local640 < local610; local640++) {
						if (local622 + 2 > this.anIntArray215[local640] - this.anIntArray216[local640] && local622 - local632 < this.anIntArray215[local640] + 2 && local70 - local627 < this.anIntArray214[local640] + this.anIntArray217[local640] && local70 + local627 > this.anIntArray214[local640] - this.anIntArray217[local640] && this.anIntArray215[local640] - this.anIntArray216[local640] < local622) {
							local622 = this.anIntArray215[local640] - this.anIntArray216[local640];
							local634 = true;
						}
					}
				}
				this.anInt882 = this.anIntArray214[local610];
				this.anInt883 = this.anIntArray215[local610] = local622;
				@Pc(739) String local739 = this.aStringArray9[local610];
				if (this.anInt891 == 0) {
					@Pc(744) int local744 = 16776960;
					if (this.anIntArray218[local610] < 6) {
						local744 = this.anIntArray259[this.anIntArray218[local610]];
					}
					if (this.anIntArray218[local610] == 6) {
						local744 = this.anInt977 % 20 < 10 ? 16711680 : 16776960;
					}
					if (this.anIntArray218[local610] == 7) {
						local744 = this.anInt977 % 20 < 10 ? 255 : 65535;
					}
					if (this.anIntArray218[local610] == 8) {
						local744 = this.anInt977 % 20 < 10 ? 45056 : 8454016;
					}
					@Pc(819) int local819;
					if (this.anIntArray218[local610] == 9) {
						local819 = 150 - this.anIntArray220[local610];
						if (local819 < 50) {
							local744 = local819 * 1280 + 16711680;
						} else if (local819 < 100) {
							local744 = 16776960 - (local819 - 50) * 327680;
						} else if (local819 < 150) {
							local744 = (local819 - 100) * 5 + 65280;
						}
					}
					if (this.anIntArray218[local610] == 10) {
						local819 = 150 - this.anIntArray220[local610];
						if (local819 < 50) {
							local744 = local819 * 5 + 16711680;
						} else if (local819 < 100) {
							local744 = 16711935 - (local819 - 50) * 327680;
						} else if (local819 < 150) {
							local744 = (local819 - 100) * 327680 + 255 - (local819 - 100) * 5;
						}
					}
					if (this.anIntArray218[local610] == 11) {
						local819 = 150 - this.anIntArray220[local610];
						if (local819 < 50) {
							local744 = 16777215 - local819 * 327685;
						} else if (local819 < 100) {
							local744 = (local819 - 50) * 327685 + 65280;
						} else if (local819 < 150) {
							local744 = 16777215 - (local819 - 100) * 327680;
						}
					}
					if (this.anIntArray219[local610] == 0) {
						this.aClass2_Sub1_Sub2_Sub4_4.method558(0, this.anInt882, this.anInt883 + 1, local739);
						this.aClass2_Sub1_Sub2_Sub4_4.method558(local744, this.anInt882, this.anInt883, local739);
					}
					if (this.anIntArray219[local610] == 1) {
						this.aClass2_Sub1_Sub2_Sub4_4.method563(local739, this.anInt882, this.anInt977, this.anInt883 + 1, 0);
						this.aClass2_Sub1_Sub2_Sub4_4.method563(local739, this.anInt882, this.anInt977, this.anInt883, local744);
					}
					if (this.anIntArray219[local610] == 2) {
						this.aClass2_Sub1_Sub2_Sub4_4.method564(local739, this.anInt977, 0, this.anInt882, (byte) 2, this.anInt883 + 1);
						this.aClass2_Sub1_Sub2_Sub4_4.method564(local739, this.anInt977, local744, this.anInt882, (byte) 2, this.anInt883);
					}
					if (this.anIntArray219[local610] == 3) {
						this.aClass2_Sub1_Sub2_Sub4_4.method565(local739, this.anInt883 + 1, 150 - this.anIntArray220[local610], this.anInt882, 0, this.anInt977);
						this.aClass2_Sub1_Sub2_Sub4_4.method565(local739, this.anInt883, 150 - this.anIntArray220[local610], this.anInt882, local744, this.anInt977);
					}
					@Pc(1116) int local1116;
					if (this.anIntArray219[local610] == 4) {
						local819 = this.aClass2_Sub1_Sub2_Sub4_4.method561(local739);
						local1116 = (150 - this.anIntArray220[local610]) * (local819 + 100) / 150;
						Class2_Sub1_Sub2.method547(0, this.anInt882 - 50, this.anInt882 + 50, 334);
						this.aClass2_Sub1_Sub2_Sub4_4.method562(local739, this.anInt883 + 1, this.anInt882 + 50 - local1116, 0);
						this.aClass2_Sub1_Sub2_Sub4_4.method562(local739, this.anInt883, this.anInt882 + 50 - local1116, local744);
						Class2_Sub1_Sub2.method546();
					}
					if (this.anIntArray219[local610] == 5) {
						local819 = 150 - this.anIntArray220[local610];
						local1116 = 0;
						if (local819 < 25) {
							local1116 = local819 - 25;
						} else if (local819 > 125) {
							local1116 = local819 - 125;
						}
						Class2_Sub1_Sub2.method547(this.anInt883 - this.aClass2_Sub1_Sub2_Sub4_4.anInt793 - 1, 0, 512, this.anInt883 + 5);
						this.aClass2_Sub1_Sub2_Sub4_4.method558(0, this.anInt882, this.anInt883 + local1116 + 1, local739);
						this.aClass2_Sub1_Sub2_Sub4_4.method558(local744, this.anInt882, this.anInt883 + local1116, local739);
						Class2_Sub1_Sub2.method546();
					}
				} else {
					this.aClass2_Sub1_Sub2_Sub4_4.method558(0, this.anInt882, this.anInt883 + 1, local739);
					this.aClass2_Sub1_Sub2_Sub4_4.method558(16776960, this.anInt882, this.anInt883, local739);
				}
			}
			this.anInt894 += 0;
		} catch (@Pc(1272) RuntimeException local1272) {
			signlink.reporterror("21843, " + 0 + ", " + local1272.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "g", descriptor = "(B)V")
	private void method652() {
		try {
			for (@Pc(13) int local13 = 0; local13 < this.anInt995; local13++) {
				if (this.anIntArray261[local13] <= 0) {
					@Pc(22) boolean local22 = false;
					try {
						if (this.anIntArray242[local13] != this.anInt924 || this.anIntArray258[local13] != this.anInt948) {
							@Pc(55) Class2_Sub1_Sub3 local55 = Class27.method335(this.anIntArray258[local13], this.anIntArray242[local13]);
							if (System.currentTimeMillis() + (long) (local55.anInt283 / 22) > this.aLong29 + (long) (this.anInt920 / 22)) {
								this.anInt920 = local55.anInt283;
								this.aLong29 = System.currentTimeMillis();
								if (this.method697(local55.anInt283, local55.aByteArray7)) {
									this.anInt924 = this.anIntArray242[local13];
									this.anInt948 = this.anIntArray258[local13];
								} else {
									local22 = true;
								}
							}
						} else if (!this.method696((byte) 1)) {
							local22 = true;
						}
					} catch (@Pc(105) Exception local105) {
						if (signlink.reporterror) {
							this.aClass2_Sub1_Sub3_6.method256(76);
							this.aClass2_Sub1_Sub3_6.method258(this.anIntArray242[local13] & 0x7FFF);
						} else {
							this.aClass2_Sub1_Sub3_6.method256(76);
							this.aClass2_Sub1_Sub3_6.method258(-1);
						}
					}
					if (local22 && this.anIntArray261[local13] != -5) {
						this.anIntArray261[local13] = -5;
					} else {
						this.anInt995--;
						for (@Pc(148) int local148 = local13; local148 < this.anInt995; local148++) {
							this.anIntArray242[local148] = this.anIntArray242[local148 + 1];
							this.anIntArray258[local148] = this.anIntArray258[local148 + 1];
							this.anIntArray261[local148] = this.anIntArray261[local148 + 1];
						}
						local13--;
					}
				} else {
					@Pc(200) int local200 = this.anIntArray261[local13]--;
				}
			}
			if (this.anInt950 > 0) {
				this.anInt950 -= 20;
				if (this.anInt950 < 0) {
					this.anInt950 = 0;
				}
				if (this.anInt950 == 0 && this.aBoolean218 && !aBoolean197) {
					this.anInt1034 = this.anInt951;
					this.aBoolean226 = true;
					this.aClass8_Sub1_1.method141(2, this.anInt1034);
					return;
				}
			}
		} catch (@Pc(246) RuntimeException local246) {
			signlink.reporterror("90734, " + 58 + ", " + local246.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "h", descriptor = "(B)V")
	private void method653(@OriginalArg(0) byte arg0) {
		try {
			if (arg0 == this.aByte44) {
				this.anInt977++;
				this.method616(true);
				this.method654(this.anInt835, true);
				this.method616(false);
				this.method654(this.anInt835, false);
				this.method647();
				this.method622();
				@Pc(42) int local42;
				@Pc(81) int local81;
				if (!this.aBoolean207) {
					local42 = this.anInt821;
					if (this.anInt917 / 256 > local42) {
						local42 = this.anInt917 / 256;
					}
					if (this.aBooleanArray12[4] && this.anIntArray230[4] + 128 > local42) {
						local42 = this.anIntArray230[4] + 128;
					}
					local81 = this.anInt822 + this.anInt922 & 0x7FF;
					this.method617(this.anInt957, local81, local42 * 3 + 600, local42, this.method717(aClass2_Sub1_Sub1_Sub4_Sub2_1.anInt541, this.anInt909, aClass2_Sub1_Sub1_Sub4_Sub2_1.anInt542) - 50, this.anInt958);
				}
				if (this.aBoolean207) {
					local42 = this.method625();
				} else {
					local42 = this.method624();
				}
				local81 = this.anInt998;
				@Pc(125) int local125 = this.anInt999;
				@Pc(128) int local128 = this.anInt1000;
				@Pc(131) int local131 = this.anInt1001;
				@Pc(134) int local134 = this.anInt1002;
				@Pc(183) int local183;
				for (@Pc(136) int local136 = 0; local136 < 5; local136++) {
					if (this.aBooleanArray12[local136]) {
						local183 = (int) (Math.random() * (double) (this.anIntArray262[local136] * 2 + 1) - (double) this.anIntArray262[local136] + Math.sin((double) this.anIntArray249[local136] * ((double) this.anIntArray239[local136] / 100.0D)) * (double) this.anIntArray230[local136]);
						if (local136 == 0) {
							this.anInt998 += local183;
						}
						if (local136 == 1) {
							this.anInt999 += local183;
						}
						if (local136 == 2) {
							this.anInt1000 += local183;
						}
						if (local136 == 3) {
							this.anInt1002 = this.anInt1002 + local183 & 0x7FF;
						}
						if (local136 == 4) {
							this.anInt1001 += local183;
							if (this.anInt1001 < 128) {
								this.anInt1001 = 128;
							}
							if (this.anInt1001 > 383) {
								this.anInt1001 = 383;
							}
						}
					}
				}
				local183 = Class2_Sub1_Sub2_Sub1.anInt89;
				Class2_Sub1_Sub1_Sub2.aBoolean34 = true;
				Class2_Sub1_Sub1_Sub2.anInt114 = 0;
				Class2_Sub1_Sub1_Sub2.anInt112 = super.anInt809 - 4;
				Class2_Sub1_Sub1_Sub2.anInt113 = super.anInt810 - 4;
				Class2_Sub1_Sub2.method548();
				this.aClass34_1.method415(this.anInt999, this.anInt998, this.anInt1002, this.anInt1000, this.anInt1001, local42);
				this.aClass34_1.method390();
				this.method651();
				this.method670();
				this.method664(local183);
				this.method644();
				this.aClass17_23.method196(super.aGraphics2, 4, 4);
				this.anInt998 = local81;
				this.anInt999 = local125;
				this.anInt1000 = local128;
				this.anInt1001 = local131;
				this.anInt1002 = local134;
			}
		} catch (@Pc(322) RuntimeException local322) {
			signlink.reporterror("13964, " + arg0 + ", " + local322.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(IZ)V")
	private void method654(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		try {
			@Pc(3) int local3 = 72 / arg0;
			for (@Pc(5) int local5 = 0; local5 < this.anInt964; local5++) {
				@Pc(15) Class2_Sub1_Sub1_Sub4_Sub1 local15 = this.aClass2_Sub1_Sub1_Sub4_Sub1Array1[this.anIntArray250[local5]];
				@Pc(24) int local24 = (this.anIntArray250[local5] << 14) + 536870912;
				if (local15 != null && local15.method446() && local15.aClass45_1.aBoolean158 == arg1 && local15.aClass45_1.method515()) {
					@Pc(45) int local45 = local15.anInt541 >> 7;
					@Pc(50) int local50 = local15.anInt542 >> 7;
					if (local45 >= 0 && local45 < 104 && local50 >= 0 && local50 < 104) {
						if (local15.anInt552 == 1 && (local15.anInt541 & 0x7F) == 64 && (local15.anInt542 & 0x7F) == 64) {
							if (this.anIntArrayArray22[local45][local50] == this.anInt977) {
								continue;
							}
							this.anIntArrayArray22[local45][local50] = this.anInt977;
						}
						if (!local15.aClass45_1.aBoolean159) {
							local24 += Integer.MIN_VALUE;
						}
						this.aClass34_1.method387(local15, this.anInt909, this.method717(local15.anInt541, this.anInt909, local15.anInt542), local15.anInt543, local24, local15.anInt541, (local15.anInt552 - 1) * 64 + 60, local15.aBoolean142, local15.anInt542);
					}
				}
			}
		} catch (@Pc(142) RuntimeException local142) {
			signlink.reporterror("65423, " + arg0 + ", " + arg1 + ", " + local142.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(JI)V")
	private void method655(@OriginalArg(0) long arg0) {
		try {
			if (arg0 != 0L) {
				if (this.anInt919 >= 100) {
					this.method640("Your ignore list is full. Max of 100 hit", "", 0);
				} else {
					@Pc(30) String local30 = Class28.method350(Class28.method347(arg0));
					for (@Pc(32) int local32 = 0; local32 < this.anInt919; local32++) {
						if (this.aLongArray3[local32] == arg0) {
							this.method640(local30 + " is already on your ignore list", "", 0);
							return;
						}
					}
					for (@Pc(62) int local62 = 0; local62 < this.anInt988; local62++) {
						if (this.aLongArray4[local62] == arg0) {
							this.method640("Please remove " + local30 + " from your friend list first", "", 0);
							return;
						}
					}
					this.aLongArray3[this.anInt919++] = arg0;
					this.aBoolean228 = true;
					this.aClass2_Sub1_Sub3_6.method256(180);
					this.aClass2_Sub1_Sub3_6.method263(arg0);
				}
			}
		} catch (@Pc(117) RuntimeException local117) {
			signlink.reporterror("62882, " + arg0 + ", " + 954 + ", " + local117.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "u", descriptor = "(I)Z")
	private boolean method656() {
		try {
			if (this.aClass14_1 == null) {
				return false;
			}
			@Pc(1019) String local1019;
			@Pc(175) int local175;
			try {
				@Pc(15) int local15 = this.aClass14_1.method189();
				if (local15 == 0) {
					return false;
				}
				if (this.anInt895 == -1) {
					this.aClass14_1.method190(this.aClass2_Sub1_Sub3_9.aByteArray7, 0, 1);
					this.anInt895 = this.aClass2_Sub1_Sub3_9.aByteArray7[0] & 0xFF;
					if (this.aClass26_2 != null) {
						this.anInt895 = this.anInt895 - this.aClass26_2.method322() & 0xFF;
					}
					this.anInt894 = Class37.anIntArray151[this.anInt895];
					local15--;
				}
				if (this.anInt894 == -1) {
					if (local15 <= 0) {
						return false;
					}
					this.aClass14_1.method190(this.aClass2_Sub1_Sub3_9.aByteArray7, 0, 1);
					this.anInt894 = this.aClass2_Sub1_Sub3_9.aByteArray7[0] & 0xFF;
					local15--;
				}
				if (this.anInt894 == -2) {
					if (local15 <= 1) {
						return false;
					}
					this.aClass14_1.method190(this.aClass2_Sub1_Sub3_9.aByteArray7, 0, 2);
					this.aClass2_Sub1_Sub3_9.anInt283 = 0;
					this.anInt894 = this.aClass2_Sub1_Sub3_9.method269();
					local15 -= 2;
				}
				if (local15 < this.anInt894) {
					return false;
				}
				this.aClass2_Sub1_Sub3_9.anInt283 = 0;
				this.aClass14_1.method190(this.aClass2_Sub1_Sub3_9.aByteArray7, 0, this.anInt894);
				this.anInt896 = 0;
				this.anInt861 = this.anInt860;
				this.anInt860 = this.anInt859;
				this.anInt859 = this.anInt895;
				@Pc(170) int local170;
				if (this.anInt895 == 94) {
					this.anInt1008 = this.aClass2_Sub1_Sub3_9.method286();
					this.anInt1007 = this.aClass2_Sub1_Sub3_9.method287();
					for (local170 = this.anInt1007; local170 < this.anInt1007 + 8; local170++) {
						for (local175 = this.anInt1008; local175 < this.anInt1008 + 8; local175++) {
							if (this.aClass29ArrayArrayArray1[this.anInt909][local170][local175] != null) {
								this.aClass29ArrayArrayArray1[this.anInt909][local170][local175] = null;
								this.method690(local170, local175);
							}
						}
					}
					for (@Pc(220) Class2_Sub3 local220 = (Class2_Sub3) this.aClass29_10.method355(); local220 != null; local220 = (Class2_Sub3) this.aClass29_10.method357()) {
						if (local220.anInt227 >= this.anInt1007 && local220.anInt227 < this.anInt1007 + 8 && local220.anInt228 >= this.anInt1008 && local220.anInt228 < this.anInt1008 + 8 && local220.anInt225 == this.anInt909) {
							local220.anInt221 = 0;
						}
					}
					this.anInt895 = -1;
					return true;
				}
				@Pc(283) int local283;
				@Pc(287) int local287;
				if (this.anInt895 == 38) {
					local170 = this.aClass2_Sub1_Sub3_9.method267();
					local175 = this.aClass2_Sub1_Sub3_9.method267();
					local283 = this.aClass2_Sub1_Sub3_9.method267();
					local287 = this.aClass2_Sub1_Sub3_9.method267();
					this.aBooleanArray12[local170] = true;
					this.anIntArray262[local170] = local175;
					this.anIntArray230[local170] = local283;
					this.anIntArray239[local170] = local287;
					this.anIntArray249[local170] = 0;
					this.anInt895 = -1;
					return true;
				}
				if (this.anInt895 == 54) {
					this.aBoolean207 = true;
					this.anInt979 = this.aClass2_Sub1_Sub3_9.method267();
					this.anInt980 = this.aClass2_Sub1_Sub3_9.method267();
					this.anInt981 = this.aClass2_Sub1_Sub3_9.method269();
					this.anInt982 = this.aClass2_Sub1_Sub3_9.method267();
					this.anInt983 = this.aClass2_Sub1_Sub3_9.method267();
					if (this.anInt983 >= 100) {
						this.anInt998 = this.anInt979 * 128 + 64;
						this.anInt1000 = this.anInt980 * 128 + 64;
						this.anInt999 = this.method717(this.anInt998, this.anInt909, this.anInt1000) - this.anInt981;
					}
					this.anInt895 = -1;
					return true;
				}
				if (this.anInt895 == 128) {
					this.anInt927 = this.aClass2_Sub1_Sub3_9.method267();
					if (this.anInt927 == 1) {
						this.anInt914 = this.aClass2_Sub1_Sub3_9.method269();
					}
					if (this.anInt927 >= 2 && this.anInt927 <= 6) {
						if (this.anInt927 == 2) {
							this.anInt937 = 64;
							this.anInt938 = 64;
						}
						if (this.anInt927 == 3) {
							this.anInt937 = 0;
							this.anInt938 = 64;
						}
						if (this.anInt927 == 4) {
							this.anInt937 = 128;
							this.anInt938 = 64;
						}
						if (this.anInt927 == 5) {
							this.anInt937 = 64;
							this.anInt938 = 0;
						}
						if (this.anInt927 == 6) {
							this.anInt937 = 64;
							this.anInt938 = 128;
						}
						this.anInt927 = 2;
						this.anInt934 = this.aClass2_Sub1_Sub3_9.method269();
						this.anInt935 = this.aClass2_Sub1_Sub3_9.method269();
						this.anInt936 = this.aClass2_Sub1_Sub3_9.method267();
					}
					if (this.anInt927 == 10) {
						this.anInt853 = this.aClass2_Sub1_Sub3_9.method269();
					}
					this.anInt895 = -1;
					return true;
				}
				if (this.anInt895 == 143) {
					this.anInt1030 = this.aClass2_Sub1_Sub3_9.method267();
					this.anInt895 = -1;
					return true;
				}
				if (this.anInt895 == 236) {
					local170 = this.aClass2_Sub1_Sub3_9.method269();
					local175 = this.aClass2_Sub1_Sub3_9.method293();
					Class31.method366(local175).anInt423 = 1;
					Class31.method366(local175).anInt424 = local170;
					this.anInt895 = -1;
					return true;
				}
				if (this.anInt895 == 114) {
					local170 = this.aClass2_Sub1_Sub3_9.method301();
					local175 = this.aClass2_Sub1_Sub3_9.method294();
					this.anIntArray254[local175] = local170;
					if (this.anIntArray253[local175] != local170) {
						this.anIntArray253[local175] = local170;
						this.method613(local175, 667);
						this.aBoolean228 = true;
						if (this.anInt856 != -1) {
							this.aBoolean225 = true;
						}
					}
					this.anInt895 = -1;
					return true;
				}
				@Pc(619) int local619;
				@Pc(599) Class31 local599;
				if (this.anInt895 == 78) {
					this.aBoolean228 = true;
					local170 = this.aClass2_Sub1_Sub3_9.method269();
					local599 = Class31.method366(local170);
					local283 = this.aClass2_Sub1_Sub3_9.method269();
					for (local287 = 0; local287 < local283; local287++) {
						local599.anIntArray111[local287] = this.aClass2_Sub1_Sub3_9.method269();
						local619 = this.aClass2_Sub1_Sub3_9.method285();
						if (local619 == 255) {
							local619 = this.aClass2_Sub1_Sub3_9.method302();
						}
						local599.anIntArray112[local287] = local619;
					}
					for (local619 = local283; local619 < local599.anIntArray111.length; local619++) {
						local599.anIntArray111[local619] = 0;
						local599.anIntArray112[local619] = 0;
					}
					this.anInt895 = -1;
					return true;
				}
				if (this.anInt895 == 238) {
					if (this.anInt921 == 12) {
						this.aBoolean228 = true;
					}
					this.anInt926 = this.aClass2_Sub1_Sub3_9.method270();
					this.anInt895 = -1;
					return true;
				}
				if (this.anInt895 == 108) {
					local170 = this.aClass2_Sub1_Sub3_9.method293();
					local175 = this.aClass2_Sub1_Sub3_9.method269();
					local283 = this.aClass2_Sub1_Sub3_9.method295(this.aBoolean208);
					local287 = this.aClass2_Sub1_Sub3_9.method295(this.aBoolean208);
					Class31.method366(local170).anInt439 = local175;
					Class31.method366(local170).anInt440 = local287;
					Class31.method366(local170).anInt438 = local283;
					this.anInt895 = -1;
					return true;
				}
				@Pc(745) int local745;
				@Pc(766) int local766;
				@Pc(743) boolean local743;
				@Pc(812) String local812;
				@Pc(733) long local733;
				if (this.anInt895 == 3) {
					local733 = this.aClass2_Sub1_Sub3_9.method273();
					local283 = this.aClass2_Sub1_Sub3_9.method272();
					local287 = this.aClass2_Sub1_Sub3_9.method267();
					local743 = false;
					for (local745 = 0; local745 < 100; local745++) {
						if (this.anIntArray228[local745] == local283) {
							local743 = true;
							break;
						}
					}
					if (local287 <= 1) {
						for (local766 = 0; local766 < this.anInt919; local766++) {
							if (this.aLongArray3[local766] == local733) {
								local743 = true;
								break;
							}
						}
					}
					if (!local743 && this.anInt855 == 0) {
						try {
							this.anIntArray228[this.anInt1020] = local283;
							this.anInt1020 = (this.anInt1020 + 1) % 100;
							local812 = Class35.method437(this.aClass2_Sub1_Sub3_9, 555, this.anInt894 - 13);
							if (local287 != 3) {
								local812 = Class18.method208(local812);
							}
							if (local287 == 2 || local287 == 3) {
								this.method640(local812, "@cr2@" + Class28.method350(Class28.method347(local733)), 7);
							} else if (local287 == 1) {
								this.method640(local812, "@cr1@" + Class28.method350(Class28.method347(local733)), 7);
							} else {
								this.method640(local812, Class28.method350(Class28.method347(local733)), 3);
							}
						} catch (@Pc(876) Exception local876) {
							signlink.reporterror("cde1");
						}
					}
					this.anInt895 = -1;
					return true;
				}
				if (this.anInt895 == 111) {
					this.anInt1008 = this.aClass2_Sub1_Sub3_9.method267();
					this.anInt1007 = this.aClass2_Sub1_Sub3_9.method267();
					this.anInt895 = -1;
					return true;
				}
				if (this.anInt895 == 10) {
					this.anInt910 = 0;
					this.anInt895 = -1;
					return true;
				}
				if (this.anInt895 == 79) {
					this.anInt997 = this.aClass2_Sub1_Sub3_9.method285();
					this.anInt1006 = this.aClass2_Sub1_Sub3_9.method269();
					this.anInt895 = -1;
					return true;
				}
				if (this.anInt895 == 146) {
					local170 = this.aClass2_Sub1_Sub3_9.method293();
					@Pc(949) byte local949 = this.aClass2_Sub1_Sub3_9.method288();
					this.anIntArray254[local170] = local949;
					if (this.anIntArray253[local170] != local949) {
						this.anIntArray253[local170] = local949;
						this.method613(local170, 667);
						this.aBoolean228 = true;
						if (this.anInt856 != -1) {
							this.aBoolean225 = true;
						}
					}
					this.anInt895 = -1;
					return true;
				}
				if (this.anInt895 == 130) {
					local170 = this.aClass2_Sub1_Sub3_9.method294();
					local175 = this.aClass2_Sub1_Sub3_9.method294();
					Class31.method366(local170).anInt423 = 2;
					Class31.method366(local170).anInt424 = local175;
					this.anInt895 = -1;
					return true;
				}
				if (this.anInt895 == 118) {
					local1019 = this.aClass2_Sub1_Sub3_9.method274();
					@Pc(1030) String local1030;
					@Pc(1033) long local1033;
					if (local1019.endsWith(":tradereq:")) {
						local1030 = local1019.substring(0, local1019.indexOf(":"));
						local1033 = Class28.method346(local1030);
						local743 = false;
						for (local745 = 0; local745 < this.anInt919; local745++) {
							if (this.aLongArray3[local745] == local1033) {
								local743 = true;
								break;
							}
						}
						if (!local743 && this.anInt855 == 0) {
							this.method640("wishes to trade with you.", local1030, 4);
						}
					} else if (local1019.endsWith(":duelreq:")) {
						local1030 = local1019.substring(0, local1019.indexOf(":"));
						local1033 = Class28.method346(local1030);
						local743 = false;
						for (local745 = 0; local745 < this.anInt919; local745++) {
							if (this.aLongArray3[local745] == local1033) {
								local743 = true;
								break;
							}
						}
						if (!local743 && this.anInt855 == 0) {
							this.method640("wishes to duel with you.", local1030, 8);
						}
					} else if (local1019.endsWith(":chalreq:")) {
						local1030 = local1019.substring(0, local1019.indexOf(":"));
						local1033 = Class28.method346(local1030);
						local743 = false;
						for (local745 = 0; local745 < this.anInt919; local745++) {
							if (this.aLongArray3[local745] == local1033) {
								local743 = true;
								break;
							}
						}
						if (!local743 && this.anInt855 == 0) {
							local812 = local1019.substring(local1019.indexOf(":") + 1, local1019.length() - 9);
							this.method640(local812, local1030, 8);
						}
					} else {
						this.method640(local1019, "", 0);
					}
					this.anInt895 = -1;
					return true;
				}
				if (this.anInt895 == 199) {
					if (this.anInt1003 != -1) {
						this.method724(this.anInt1003);
						this.anInt1003 = -1;
						this.aBoolean228 = true;
						this.aBoolean190 = true;
					}
					if (this.anInt974 != -1) {
						this.method724(this.anInt974);
						this.anInt974 = -1;
						this.aBoolean225 = true;
					}
					if (this.anInt857 != -1) {
						this.method724(this.anInt857);
						this.anInt857 = -1;
						this.aBoolean183 = true;
					}
					if (this.anInt854 != -1) {
						this.method724(this.anInt854);
						this.anInt854 = -1;
					}
					if (this.anInt1039 != -1) {
						this.method724(this.anInt1039);
						this.anInt1039 = -1;
					}
					if (this.anInt825 != 0) {
						this.anInt825 = 0;
						this.aBoolean225 = true;
					}
					this.aBoolean199 = false;
					this.anInt895 = -1;
					return true;
				}
				if (this.anInt895 == 82) {
					this.method699(this.anInt894, this.aClass2_Sub1_Sub3_9);
					this.anInt895 = -1;
					return true;
				}
				if (this.anInt895 == 251) {
					local170 = this.aClass2_Sub1_Sub3_9.method293();
					this.method701(local170);
					if (this.anInt1003 != -1) {
						this.method724(this.anInt1003);
						this.anInt1003 = -1;
						this.aBoolean228 = true;
						this.aBoolean190 = true;
					}
					if (this.anInt974 != -1) {
						this.method724(this.anInt974);
						this.anInt974 = -1;
						this.aBoolean225 = true;
					}
					if (this.anInt857 != -1) {
						this.method724(this.anInt857);
						this.anInt857 = -1;
						this.aBoolean183 = true;
					}
					if (this.anInt854 != -1) {
						this.method724(this.anInt854);
						this.anInt854 = -1;
					}
					if (this.anInt1039 != local170) {
						this.method724(this.anInt1039);
						this.anInt1039 = local170;
					}
					if (this.anInt825 != 0) {
						this.anInt825 = 0;
						this.aBoolean225 = true;
					}
					this.aBoolean199 = false;
					this.anInt895 = -1;
					return true;
				}
				if (this.anInt895 == 61) {
					this.aBoolean207 = false;
					for (local170 = 0; local170 < 5; local170++) {
						this.aBooleanArray12[local170] = false;
					}
					this.anInt895 = -1;
					return true;
				}
				if (this.anInt895 == 24) {
					this.aClass2_Sub1_Sub3_9.method269();
					this.anInt984 = this.aClass2_Sub1_Sub3_9.method295(this.aBoolean208);
					this.anInt975 = this.aClass2_Sub1_Sub3_9.method269();
					this.aClass2_Sub1_Sub3_9.method285();
					this.anInt990 = this.aClass2_Sub1_Sub3_9.method294();
					this.anInt953 = this.aClass2_Sub1_Sub3_9.method293();
					this.anInt976 = this.aClass2_Sub1_Sub3_9.method294();
					this.anInt955 = this.aClass2_Sub1_Sub3_9.method269();
					this.anInt912 = this.aClass2_Sub1_Sub3_9.method269();
					this.anInt893 = this.aClass2_Sub1_Sub3_9.method294();
					this.anInt991 = this.aClass2_Sub1_Sub3_9.method302();
					signlink.dnslookup(Class28.method349(this.anInt991));
					this.anInt895 = -1;
					return true;
				}
				if (this.anInt895 == 150) {
					this.anInt918 = this.aClass2_Sub1_Sub3_9.method267();
					this.anInt842 = this.aClass2_Sub1_Sub3_9.method267();
					this.anInt833 = this.aClass2_Sub1_Sub3_9.method267();
					this.aBoolean189 = true;
					this.aBoolean225 = true;
					this.anInt895 = -1;
					return true;
				}
				if (this.anInt895 == 207) {
					local170 = this.aClass2_Sub1_Sub3_9.method269();
					local175 = this.aClass2_Sub1_Sub3_9.method296();
					local283 = this.aClass2_Sub1_Sub3_9.method298(this.anInt947);
					@Pc(1552) Class31 local1552 = Class31.method366(local170);
					local1552.anInt425 = local283;
					local1552.anInt417 = local175;
					this.anInt895 = -1;
					return true;
				}
				if (this.anInt895 == 144) {
					this.aBoolean228 = true;
					local170 = this.aClass2_Sub1_Sub3_9.method269();
					local599 = Class31.method366(local170);
					while (this.aClass2_Sub1_Sub3_9.anInt283 < this.anInt894) {
						local283 = this.aClass2_Sub1_Sub3_9.method281();
						local287 = this.aClass2_Sub1_Sub3_9.method269();
						local619 = this.aClass2_Sub1_Sub3_9.method267();
						if (local619 == 255) {
							local619 = this.aClass2_Sub1_Sub3_9.method272();
						}
						if (local283 >= 0 && local283 < local599.anIntArray111.length) {
							local599.anIntArray111[local283] = local287;
							local599.anIntArray112[local283] = local619;
						}
					}
					this.anInt895 = -1;
					return true;
				}
				@Pc(1782) int local1782;
				if (this.anInt895 == 100) {
					local733 = this.aClass2_Sub1_Sub3_9.method273();
					local283 = this.aClass2_Sub1_Sub3_9.method267();
					@Pc(1645) String local1645 = Class28.method350(Class28.method347(local733));
					for (local619 = 0; local619 < this.anInt988; local619++) {
						if (local733 == this.aLongArray4[local619]) {
							if (this.anIntArray227[local619] != local283) {
								this.anIntArray227[local619] = local283;
								this.aBoolean228 = true;
								if (local283 > 0) {
									this.method640(local1645 + " has logged in.", "", 5);
								}
								if (local283 == 0) {
									this.method640(local1645 + " has logged out.", "", 5);
								}
							}
							local1645 = null;
							break;
						}
					}
					if (local1645 != null && this.anInt988 < 200) {
						this.aLongArray4[this.anInt988] = local733;
						this.aStringArray10[this.anInt988] = local1645;
						this.anIntArray227[this.anInt988] = local283;
						this.anInt988++;
						this.aBoolean228 = true;
					}
					@Pc(1743) boolean local1743 = false;
					while (!local1743) {
						local1743 = true;
						for (local766 = 0; local766 < this.anInt988 - 1; local766++) {
							if (this.anIntArray227[local766] != anInt906 && this.anIntArray227[local766 + 1] == anInt906 || this.anIntArray227[local766] == 0 && this.anIntArray227[local766 + 1] != 0) {
								local1782 = this.anIntArray227[local766];
								this.anIntArray227[local766] = this.anIntArray227[local766 + 1];
								this.anIntArray227[local766 + 1] = local1782;
								@Pc(1804) String local1804 = this.aStringArray10[local766];
								this.aStringArray10[local766] = this.aStringArray10[local766 + 1];
								this.aStringArray10[local766 + 1] = local1804;
								@Pc(1826) long local1826 = this.aLongArray4[local766];
								this.aLongArray4[local766] = this.aLongArray4[local766 + 1];
								this.aLongArray4[local766 + 1] = local1826;
								this.aBoolean228 = true;
								local1743 = false;
							}
						}
					}
					this.anInt895 = -1;
					return true;
				}
				if (this.anInt895 == 96) {
					if (this.anInt921 == 12) {
						this.aBoolean228 = true;
					}
					this.anInt1025 = this.aClass2_Sub1_Sub3_9.method267();
					this.anInt895 = -1;
					return true;
				}
				if (this.anInt895 == 180) {
					local170 = this.aClass2_Sub1_Sub3_9.method293();
					if (local170 == 65535) {
						local170 = -1;
					}
					if (local170 != this.anInt951 && this.aBoolean218 && !aBoolean197 && this.anInt950 == 0) {
						this.anInt1034 = local170;
						this.aBoolean226 = true;
						this.aClass8_Sub1_1.method141(2, this.anInt1034);
					}
					this.anInt951 = local170;
					this.anInt895 = -1;
					return true;
				}
				if (this.anInt895 == 192) {
					local170 = this.aClass2_Sub1_Sub3_9.method294();
					local175 = this.aClass2_Sub1_Sub3_9.method271();
					if (this.aBoolean218 && !aBoolean197) {
						this.anInt1034 = local170;
						this.aBoolean226 = false;
						this.aClass8_Sub1_1.method141(2, this.anInt1034);
						this.anInt950 = local175;
					}
					this.anInt895 = -1;
					return true;
				}
				if (this.anInt895 == 200) {
					local170 = this.aClass2_Sub1_Sub3_9.method294();
					this.method701(local170);
					if (this.anInt974 != -1) {
						this.method724(this.anInt974);
						this.anInt974 = -1;
						this.aBoolean225 = true;
					}
					if (this.anInt857 != -1) {
						this.method724(this.anInt857);
						this.anInt857 = -1;
						this.aBoolean183 = true;
					}
					if (this.anInt854 != -1) {
						this.method724(this.anInt854);
						this.anInt854 = -1;
					}
					if (this.anInt1039 != -1) {
						this.method724(this.anInt1039);
						this.anInt1039 = -1;
					}
					if (this.anInt1003 != local170) {
						this.method724(this.anInt1003);
						this.anInt1003 = local170;
					}
					if (this.anInt825 != 0) {
						this.anInt825 = 0;
						this.aBoolean225 = true;
					}
					this.aBoolean228 = true;
					this.aBoolean190 = true;
					this.aBoolean199 = false;
					this.anInt895 = -1;
					return true;
				}
				if (this.anInt895 == 86) {
					local170 = this.aClass2_Sub1_Sub3_9.method298(this.anInt947);
					if (local170 != this.anInt856) {
						this.method724(this.anInt856);
						this.anInt856 = local170;
					}
					this.aBoolean225 = true;
					this.anInt895 = -1;
					return true;
				}
				if (this.anInt895 == 120) {
					local170 = this.aClass2_Sub1_Sub3_9.method293();
					local175 = this.aClass2_Sub1_Sub3_9.method269();
					local283 = this.aClass2_Sub1_Sub3_9.method295(this.aBoolean208);
					if (local170 == 65535) {
						Class31.method366(local175).anInt423 = 0;
						this.anInt895 = -1;
						return true;
					}
					@Pc(2133) Class41 local2133 = Class41.method495(local170);
					Class31.method366(local175).anInt423 = 4;
					Class31.method366(local175).anInt424 = local170;
					Class31.method366(local175).anInt439 = local2133.anInt663;
					Class31.method366(local175).anInt440 = local2133.anInt657;
					Class31.method366(local175).anInt438 = local2133.anInt642 * 100 / local283;
					this.anInt895 = -1;
					return true;
				}
				if (this.anInt895 == 40) {
					this.aBoolean228 = true;
					local170 = this.aClass2_Sub1_Sub3_9.method287();
					local175 = this.aClass2_Sub1_Sub3_9.method302();
					local283 = this.aClass2_Sub1_Sub3_9.method267();
					this.anIntArray246[local283] = local175;
					this.anIntArray229[local283] = local170;
					this.anIntArray213[local283] = 1;
					for (local287 = 0; local287 < 98; local287++) {
						if (local175 >= anIntArray241[local287]) {
							this.anIntArray213[local283] = local287 + 2;
						}
					}
					this.anInt895 = -1;
					return true;
				}
				if (this.anInt895 == 181) {
					for (local170 = 0; local170 < this.aClass2_Sub1_Sub1_Sub4_Sub2Array1.length; local170++) {
						if (this.aClass2_Sub1_Sub1_Sub4_Sub2Array1[local170] != null) {
							this.aClass2_Sub1_Sub1_Sub4_Sub2Array1[local170].anInt573 = -1;
						}
					}
					for (local175 = 0; local175 < this.aClass2_Sub1_Sub1_Sub4_Sub1Array1.length; local175++) {
						if (this.aClass2_Sub1_Sub1_Sub4_Sub1Array1[local175] != null) {
							this.aClass2_Sub1_Sub1_Sub4_Sub1Array1[local175].anInt573 = -1;
						}
					}
					this.anInt895 = -1;
					return true;
				}
				if (this.anInt895 == 2) {
					local170 = this.aClass2_Sub1_Sub3_9.method269();
					local175 = this.aClass2_Sub1_Sub3_9.method287();
					if (local170 == 65535) {
						local170 = -1;
					}
					if (this.anIntArray252[local175] != local170) {
						this.method724(this.anIntArray252[local175]);
						this.anIntArray252[local175] = local170;
					}
					this.aBoolean228 = true;
					this.aBoolean190 = true;
					this.anInt895 = -1;
					return true;
				}
				if (this.anInt895 == 46 || this.anInt895 == 193 || this.anInt895 == 206 || this.anInt895 == 93 || this.anInt895 == 187 || this.anInt895 == 98 || this.anInt895 == 209 || this.anInt895 == 252 || this.anInt895 == 31 || this.anInt895 == 253 || this.anInt895 == 122) {
					this.method671(this.aClass2_Sub1_Sub3_9, this.anInt895);
					this.anInt895 = -1;
					return true;
				}
				if (this.anInt895 == 214) {
					local170 = this.aClass2_Sub1_Sub3_9.method287();
					local175 = this.aClass2_Sub1_Sub3_9.method287();
					@Pc(2398) String local2398 = this.aClass2_Sub1_Sub3_9.method274();
					if (local170 >= 1 && local170 <= 5) {
						if (local2398.equalsIgnoreCase("null")) {
							local2398 = null;
						}
						this.aStringArray13[local170 - 1] = local2398;
						this.aBooleanArray11[local170 - 1] = local175 == 0;
					}
					this.anInt895 = -1;
					return true;
				}
				@Pc(2450) Class31 local2450;
				if (this.anInt895 == 26) {
					local170 = this.aClass2_Sub1_Sub3_9.method269();
					local175 = this.aClass2_Sub1_Sub3_9.method295(this.aBoolean208);
					local2450 = Class31.method366(local175);
					if (local2450 != null && local2450.anInt422 == 0) {
						if (local170 < 0) {
							local170 = 0;
						}
						if (local170 > local2450.anInt421 - local2450.anInt429) {
							local170 = local2450.anInt421 - local2450.anInt429;
						}
						local2450.anInt434 = local170;
					}
					this.anInt895 = -1;
					return true;
				}
				if (this.anInt895 == 127) {
					this.anInt921 = this.aClass2_Sub1_Sub3_9.method267();
					this.aBoolean228 = true;
					this.aBoolean190 = true;
					this.anInt895 = -1;
					return true;
				}
				if (this.anInt895 == 28) {
					local170 = this.aClass2_Sub1_Sub3_9.method294();
					@Pc(2519) boolean local2519 = this.aClass2_Sub1_Sub3_9.method286() == 1;
					Class31.method366(local170).aBoolean127 = local2519;
					this.anInt895 = -1;
					return true;
				}
				if (this.anInt895 == 177) {
					local170 = this.aClass2_Sub1_Sub3_9.method270();
					local175 = this.aClass2_Sub1_Sub3_9.method293();
					local2450 = Class31.method366(local175);
					if (local2450.anInt436 != local170 || local170 == -1) {
						local2450.anInt436 = local170;
						local2450.anInt426 = 0;
						local2450.anInt428 = 0;
					}
					this.anInt895 = -1;
					return true;
				}
				if (this.anInt895 == 33) {
					local170 = this.aClass2_Sub1_Sub3_9.method297();
					if (local170 >= 0) {
						this.method701(local170);
					}
					if (local170 != this.anInt987) {
						this.method724(this.anInt987);
						this.anInt987 = local170;
					}
					this.anInt895 = -1;
					return true;
				}
				if (this.anInt895 == 17) {
					local170 = this.aClass2_Sub1_Sub3_9.method269();
					local175 = this.aClass2_Sub1_Sub3_9.method293();
					local283 = local175 >> 10 & 0x1F;
					local287 = local175 >> 5 & 0x1F;
					local619 = local175 & 0x1F;
					Class31.method366(local170).anInt411 = (local283 << 19) + (local287 << 11) + (local619 << 3);
					this.anInt895 = -1;
					return true;
				}
				if (this.anInt895 == 172) {
					local170 = this.aClass2_Sub1_Sub3_9.method269();
					Class31.method366(local170).anInt423 = 3;
					if (aClass2_Sub1_Sub1_Sub4_Sub2_1.aClass45_2 == null) {
						Class31.method366(local170).anInt424 = (aClass2_Sub1_Sub1_Sub4_Sub2_1.anIntArray149[0] << 25) + (aClass2_Sub1_Sub1_Sub4_Sub2_1.anIntArray149[4] << 20) + (aClass2_Sub1_Sub1_Sub4_Sub2_1.anIntArray148[0] << 15) + (aClass2_Sub1_Sub1_Sub4_Sub2_1.anIntArray148[8] << 10) + (aClass2_Sub1_Sub1_Sub4_Sub2_1.anIntArray148[11] << 5) + aClass2_Sub1_Sub1_Sub4_Sub2_1.anIntArray148[1];
					} else {
						Class31.method366(local170).anInt424 = (int) (aClass2_Sub1_Sub1_Sub4_Sub2_1.aClass45_2.aLong23 + 305419896L);
					}
					this.anInt895 = -1;
					return true;
				}
				if (this.anInt895 == 182) {
					this.anInt919 = this.anInt894 / 8;
					for (local170 = 0; local170 < this.anInt919; local170++) {
						this.aLongArray3[local170] = this.aClass2_Sub1_Sub3_9.method273();
					}
					this.anInt895 = -1;
					return true;
				}
				if (this.anInt895 == 234) {
					this.aBoolean182 = false;
					this.anInt825 = 2;
					this.aString28 = "";
					this.aBoolean225 = true;
					this.anInt895 = -1;
					return true;
				}
				if (this.anInt895 == 190) {
					this.method645();
					this.anInt895 = -1;
					return false;
				}
				if (this.anInt895 == 167) {
					local170 = this.aClass2_Sub1_Sub3_9.method269();
					local175 = this.aClass2_Sub1_Sub3_9.method269();
					local283 = this.aClass2_Sub1_Sub3_9.method294();
					Class31.method366(local283).anInt432 = (local175 << 16) + local170;
					this.anInt895 = -1;
					return true;
				}
				if (this.anInt895 == 99) {
					local170 = this.aClass2_Sub1_Sub3_9.method294();
					this.method701(local170);
					if (this.anInt1003 != -1) {
						this.method724(this.anInt1003);
						this.anInt1003 = -1;
						this.aBoolean228 = true;
						this.aBoolean190 = true;
					}
					if (this.anInt857 != -1) {
						this.method724(this.anInt857);
						this.anInt857 = -1;
						this.aBoolean183 = true;
					}
					if (this.anInt854 != -1) {
						this.method724(this.anInt854);
						this.anInt854 = -1;
					}
					if (this.anInt1039 != -1) {
						this.method724(this.anInt1039);
						this.anInt1039 = -1;
					}
					if (this.anInt974 != local170) {
						this.method724(this.anInt974);
						this.anInt974 = local170;
					}
					this.aBoolean199 = false;
					this.aBoolean225 = true;
					this.anInt895 = -1;
					return true;
				}
				if (this.anInt895 == 213) {
					local170 = this.aClass2_Sub1_Sub3_9.method269();
					local175 = this.aClass2_Sub1_Sub3_9.method267();
					local283 = this.aClass2_Sub1_Sub3_9.method269();
					if (local283 == 65535) {
						if (this.anInt995 < 50) {
							this.anIntArray242[this.anInt995] = (short) local170;
							this.anIntArray258[this.anInt995] = local175;
							this.anIntArray261[this.anInt995] = 0;
							this.anInt995++;
						}
					} else if (this.aBoolean210 && !aBoolean197 && this.anInt995 < 50) {
						this.anIntArray242[this.anInt995] = local170;
						this.anIntArray258[this.anInt995] = local175;
						this.anIntArray261[this.anInt995] = local283 + Class27.anIntArray108[local170];
						this.anInt995++;
					}
					this.anInt895 = -1;
					return true;
				}
				if (this.anInt895 == 9) {
					local170 = this.aClass2_Sub1_Sub3_9.method295(this.aBoolean208);
					local599 = Class31.method366(local170);
					for (local283 = 0; local283 < local599.anIntArray111.length; local283++) {
						local599.anIntArray111[local283] = -1;
						local599.anIntArray111[local283] = 0;
					}
					this.anInt895 = -1;
					return true;
				}
				if (this.anInt895 == 133) {
					this.anInt881 = this.aClass2_Sub1_Sub3_9.method267();
					this.anInt895 = -1;
					return true;
				}
				if (this.anInt895 == 35) {
					this.aBoolean182 = false;
					this.anInt825 = 1;
					this.aString28 = "";
					this.aBoolean225 = true;
					this.anInt895 = -1;
					return true;
				}
				if (this.anInt895 == 196) {
					local170 = this.aClass2_Sub1_Sub3_9.method293();
					local175 = this.aClass2_Sub1_Sub3_9.method269();
					this.method701(local175);
					if (local170 != -1) {
						this.method701(local170);
					}
					if (this.anInt1039 != -1) {
						this.method724(this.anInt1039);
						this.anInt1039 = -1;
					}
					if (this.anInt1003 != -1) {
						this.method724(this.anInt1003);
						this.anInt1003 = -1;
					}
					if (this.anInt974 != -1) {
						this.method724(this.anInt974);
						this.anInt974 = -1;
					}
					if (this.anInt857 != local175) {
						this.method724(this.anInt857);
						this.anInt857 = local175;
					}
					if (this.anInt854 != local175) {
						this.method724(this.anInt854);
						this.anInt854 = local170;
					}
					this.anInt825 = 0;
					this.aBoolean199 = false;
					this.anInt895 = -1;
					return true;
				}
				if (this.anInt895 == 124) {
					this.method694(this.aClass2_Sub1_Sub3_9, this.anInt894);
					this.aBoolean187 = false;
					this.anInt895 = -1;
					return true;
				}
				if (this.anInt895 == 142) {
					local1019 = this.aClass2_Sub1_Sub3_9.method274();
					local175 = this.aClass2_Sub1_Sub3_9.method269();
					Class31.method366(local175).aString11 = local1019;
					@Pc(3209) int local3209 = this.anIntArray252[this.anInt921];
					if (Class31.method366(local175).anInt420 == local3209) {
						this.aBoolean228 = true;
					}
					this.anInt895 = -1;
					return true;
				}
				if (this.anInt895 == 57) {
					this.anInt1008 = this.aClass2_Sub1_Sub3_9.method285();
					this.anInt1007 = this.aClass2_Sub1_Sub3_9.method285();
					while (this.aClass2_Sub1_Sub3_9.anInt283 < this.anInt894) {
						local170 = this.aClass2_Sub1_Sub3_9.method267();
						this.method671(this.aClass2_Sub1_Sub3_9, local170);
					}
					this.anInt895 = -1;
					return true;
				}
				if (this.anInt895 == 227) {
					this.anInt865 = this.aClass2_Sub1_Sub3_9.method267();
					if (this.anInt865 == this.anInt921) {
						if (this.anInt865 == 3) {
							this.anInt921 = 1;
						} else {
							this.anInt921 = 3;
						}
						this.aBoolean228 = true;
					}
					this.anInt895 = -1;
					return true;
				}
				if (this.anInt895 == 103) {
					this.aBoolean207 = true;
					this.anInt1047 = this.aClass2_Sub1_Sub3_9.method267();
					this.anInt1048 = this.aClass2_Sub1_Sub3_9.method267();
					this.anInt1049 = this.aClass2_Sub1_Sub3_9.method269();
					this.anInt1050 = this.aClass2_Sub1_Sub3_9.method267();
					this.anInt1051 = this.aClass2_Sub1_Sub3_9.method267();
					if (this.anInt1051 >= 100) {
						local170 = this.anInt1047 * 128 + 64;
						local175 = this.anInt1048 * 128 + 64;
						local283 = this.method717(local170, this.anInt909, local175) - this.anInt1049;
						local287 = local170 - this.anInt998;
						local619 = local283 - this.anInt999;
						local745 = local175 - this.anInt1000;
						local766 = (int) Math.sqrt((double) (local287 * local287 + local745 * local745));
						this.anInt1001 = (int) (Math.atan2((double) local619, (double) local766) * 325.949D) & 0x7FF;
						this.anInt1002 = (int) (Math.atan2((double) local287, (double) local745) * -325.949D) & 0x7FF;
						if (this.anInt1001 < 128) {
							this.anInt1001 = 128;
						}
						if (this.anInt1001 > 383) {
							this.anInt1001 = 383;
						}
					}
					this.anInt895 = -1;
					return true;
				}
				if (this.anInt895 == 102) {
					this.anInt989 = this.aClass2_Sub1_Sub3_9.method267();
					this.aBoolean228 = true;
					this.anInt895 = -1;
					return true;
				}
				if (this.anInt895 == 6) {
					this.anInt992 = this.aClass2_Sub1_Sub3_9.method293() * 30;
					this.anInt895 = -1;
					return true;
				}
				if (this.anInt895 == 67) {
					for (local170 = 0; local170 < this.anIntArray253.length; local170++) {
						if (this.anIntArray253[local170] != this.anIntArray254[local170]) {
							this.anIntArray253[local170] = this.anIntArray254[local170];
							this.method613(local170, 667);
							this.aBoolean228 = true;
						}
					}
					this.anInt895 = -1;
					return true;
				}
				if (this.anInt895 == 169 || this.anInt895 == 89) {
					local170 = this.anInt971;
					local175 = this.anInt972;
					if (this.anInt895 == 169) {
						local175 = this.aClass2_Sub1_Sub3_9.method293();
						local170 = this.aClass2_Sub1_Sub3_9.method295(this.aBoolean208);
						this.aBoolean203 = false;
					}
					if (this.anInt895 == 89) {
						local175 = this.aClass2_Sub1_Sub3_9.method293();
						this.aClass2_Sub1_Sub3_9.method277();
						local283 = 0;
						while (true) {
							if (local283 >= 4) {
								this.aClass2_Sub1_Sub3_9.method279();
								local170 = this.aClass2_Sub1_Sub3_9.method269();
								this.aBoolean203 = true;
								break;
							}
							for (local287 = 0; local287 < 13; local287++) {
								for (local619 = 0; local619 < 13; local619++) {
									local745 = this.aClass2_Sub1_Sub3_9.method278(1);
									if (local745 == 1) {
										this.anIntArrayArrayArray8[local283][local287][local619] = this.aClass2_Sub1_Sub3_9.method278(26);
									} else {
										this.anIntArrayArrayArray8[local283][local287][local619] = -1;
									}
								}
							}
							local283++;
						}
					}
					if (this.anInt971 == local170 && this.anInt972 == local175 && this.anInt945 == 2) {
						this.anInt895 = -1;
						return true;
					}
					this.anInt971 = local170;
					this.anInt972 = local175;
					this.anInt874 = (this.anInt971 - 6) * 8;
					this.anInt875 = (this.anInt972 - 6) * 8;
					this.aBoolean221 = false;
					if ((this.anInt971 / 8 == 48 || this.anInt971 / 8 == 49) && this.anInt972 / 8 == 48) {
						this.aBoolean221 = true;
					}
					if (this.anInt971 / 8 == 48 && this.anInt972 / 8 == 148) {
						this.aBoolean221 = true;
					}
					this.anInt945 = 1;
					this.aLong32 = System.currentTimeMillis();
					this.method646(null, "Loading - please wait.");
					if (this.anInt895 == 169) {
						local283 = 0;
						local287 = (this.anInt971 - 6) / 8;
						label1183: while (true) {
							if (local287 > (this.anInt971 + 6) / 8) {
								this.aByteArrayArray5 = new byte[local283][];
								this.aByteArrayArray6 = new byte[local283][];
								this.anIntArray269 = new int[local283];
								this.anIntArray270 = new int[local283];
								this.anIntArray271 = new int[local283];
								local283 = 0;
								local619 = (this.anInt971 - 6) / 8;
								while (true) {
									if (local619 > (this.anInt971 + 6) / 8) {
										break label1183;
									}
									for (local745 = (this.anInt972 - 6) / 8; local745 <= (this.anInt972 + 6) / 8; local745++) {
										this.anIntArray269[local283] = (local619 << 8) + local745;
										if (this.aBoolean221 && (local745 == 49 || local745 == 149 || local745 == 147 || local619 == 50 || local619 == 49 && local745 == 47)) {
											this.anIntArray270[local283] = -1;
											this.anIntArray271[local283] = -1;
											local283++;
										} else {
											local766 = this.anIntArray270[local283] = this.aClass8_Sub1_1.method137(local745, 0, local619);
											if (local766 != -1) {
												this.aClass8_Sub1_1.method141(3, local766);
											}
											local1782 = this.anIntArray271[local283] = this.aClass8_Sub1_1.method137(local745, 1, local619);
											if (local1782 != -1) {
												this.aClass8_Sub1_1.method141(3, local1782);
											}
											local283++;
										}
									}
									local619++;
								}
							}
							for (local619 = (this.anInt972 - 6) / 8; local619 <= (this.anInt972 + 6) / 8; local619++) {
								local283++;
							}
							local287++;
						}
					}
					if (this.anInt895 == 89) {
						local283 = 0;
						@Pc(3896) int[] local3896 = new int[676];
						local619 = 0;
						label1144: while (true) {
							@Pc(3926) int local3926;
							@Pc(3932) int local3932;
							@Pc(3942) int local3942;
							if (local619 >= 4) {
								this.aByteArrayArray5 = new byte[local283][];
								this.aByteArrayArray6 = new byte[local283][];
								this.anIntArray269 = new int[local283];
								this.anIntArray270 = new int[local283];
								this.anIntArray271 = new int[local283];
								local745 = 0;
								while (true) {
									if (local745 >= local283) {
										break label1144;
									}
									local766 = this.anIntArray269[local745] = local3896[local745];
									local1782 = local766 >> 8 & 0xFF;
									local3926 = local766 & 0xFF;
									local3932 = this.anIntArray270[local745] = this.aClass8_Sub1_1.method137(local3926, 0, local1782);
									if (local3932 != -1) {
										this.aClass8_Sub1_1.method141(3, local3932);
									}
									local3942 = this.anIntArray271[local745] = this.aClass8_Sub1_1.method137(local3926, 1, local1782);
									if (local3942 != -1) {
										this.aClass8_Sub1_1.method141(3, local3942);
									}
									local745++;
								}
							}
							for (local745 = 0; local745 < 13; local745++) {
								for (local766 = 0; local766 < 13; local766++) {
									local1782 = this.anIntArrayArrayArray8[local619][local745][local766];
									if (local1782 != -1) {
										local3926 = local1782 >> 14 & 0x3FF;
										local3932 = local1782 >> 3 & 0x7FF;
										local3942 = (local3926 / 8 << 8) + local3932 / 8;
										for (@Pc(3944) int local3944 = 0; local3944 < local283; local3944++) {
											if (local3896[local3944] == local3942) {
												local3942 = -1;
												break;
											}
										}
										if (local3942 != -1) {
											local3896[local283++] = local3942;
										}
									}
								}
							}
							local619++;
						}
					}
					local283 = this.anInt874 - this.anInt876;
					local287 = this.anInt875 - this.anInt877;
					this.anInt876 = this.anInt874;
					this.anInt877 = this.anInt875;
					for (local619 = 0; local619 < 16384; local619++) {
						@Pc(4097) Class2_Sub1_Sub1_Sub4_Sub1 local4097 = this.aClass2_Sub1_Sub1_Sub4_Sub1Array1[local619];
						if (local4097 != null) {
							for (local766 = 0; local766 < 10; local766++) {
								local4097.anIntArray143[local766] -= local283;
								local4097.anIntArray144[local766] -= local287;
							}
							local4097.anInt541 -= local283 * 128;
							local4097.anInt542 -= local287 * 128;
						}
					}
					for (local745 = 0; local745 < this.anInt900; local745++) {
						@Pc(4152) Class2_Sub1_Sub1_Sub4_Sub2 local4152 = this.aClass2_Sub1_Sub1_Sub4_Sub2Array1[local745];
						if (local4152 != null) {
							for (local1782 = 0; local1782 < 10; local1782++) {
								local4152.anIntArray143[local1782] -= local283;
								local4152.anIntArray144[local1782] -= local287;
							}
							local4152.anInt541 -= local283 * 128;
							local4152.anInt542 -= local287 * 128;
						}
					}
					this.aBoolean187 = true;
					@Pc(4204) byte local4204 = 0;
					@Pc(4206) byte local4206 = 104;
					@Pc(4208) byte local4208 = 1;
					if (local283 < 0) {
						local4204 = 103;
						local4206 = -1;
						local4208 = -1;
					}
					@Pc(4218) byte local4218 = 0;
					@Pc(4220) byte local4220 = 104;
					@Pc(4222) byte local4222 = 1;
					if (local287 < 0) {
						local4218 = 103;
						local4220 = -1;
						local4222 = -1;
					}
					for (@Pc(4232) int local4232 = local4204; local4232 != local4206; local4232 += local4208) {
						for (@Pc(4236) int local4236 = local4218; local4236 != local4220; local4236 += local4222) {
							@Pc(4242) int local4242 = local4232 + local283;
							@Pc(4246) int local4246 = local4236 + local287;
							for (@Pc(4248) int local4248 = 0; local4248 < 4; local4248++) {
								if (local4242 >= 0 && local4246 >= 0 && local4242 < 104 && local4246 < 104) {
									this.aClass29ArrayArrayArray1[local4248][local4232][local4236] = this.aClass29ArrayArrayArray1[local4248][local4242][local4246];
								} else {
									this.aClass29ArrayArrayArray1[local4248][local4232][local4236] = null;
								}
							}
						}
					}
					for (@Pc(4310) Class2_Sub3 local4310 = (Class2_Sub3) this.aClass29_10.method355(); local4310 != null; local4310 = (Class2_Sub3) this.aClass29_10.method357()) {
						local4310.anInt227 -= local283;
						local4310.anInt228 -= local287;
						if (local4310.anInt227 < 0 || local4310.anInt228 < 0 || local4310.anInt227 >= 104 || local4310.anInt228 >= 104) {
							local4310.method573();
						}
					}
					if (this.anInt910 != 0) {
						this.anInt910 -= local283;
						this.anInt911 -= local287;
					}
					this.aBoolean207 = false;
					this.anInt895 = -1;
					return true;
				}
				if (this.anInt895 == 161) {
					local170 = this.aClass2_Sub1_Sub3_9.method269();
					local175 = this.aClass2_Sub1_Sub3_9.method269();
					if (this.anInt974 != -1) {
						this.method724(this.anInt974);
						this.anInt974 = -1;
						this.aBoolean225 = true;
					}
					if (this.anInt857 != -1) {
						this.method724(this.anInt857);
						this.anInt857 = -1;
						this.aBoolean183 = true;
					}
					if (this.anInt854 != -1) {
						this.method724(this.anInt854);
						this.anInt854 = -1;
					}
					if (this.anInt1039 != local175) {
						this.method724(this.anInt1039);
						this.anInt1039 = local175;
					}
					if (this.anInt1003 != local170) {
						this.method724(this.anInt1003);
						this.anInt1003 = local170;
					}
					if (this.anInt825 != 0) {
						this.anInt825 = 0;
						this.aBoolean225 = true;
					}
					this.aBoolean228 = true;
					this.aBoolean190 = true;
					this.aBoolean199 = false;
					this.anInt895 = -1;
					return true;
				}
				signlink.reporterror("T1 - " + this.anInt895 + "," + this.anInt894 + " - " + this.anInt860 + "," + this.anInt861);
				this.method645();
			} catch (@Pc(4501) IOException local4501) {
				this.method614();
			} catch (@Pc(4506) Exception local4506) {
				local1019 = "T2 - " + this.anInt895 + "," + this.anInt860 + "," + this.anInt861 + " - " + this.anInt894 + "," + (this.anInt874 + aClass2_Sub1_Sub1_Sub4_Sub2_1.anIntArray143[0]) + "," + (this.anInt875 + aClass2_Sub1_Sub1_Sub4_Sub2_1.anIntArray144[0]) + " - ";
				for (local175 = 0; local175 < this.anInt894 && local175 < 50; local175++) {
					local1019 = local1019 + this.aClass2_Sub1_Sub3_9.aByteArray7[local175] + ",";
				}
				signlink.reporterror(local1019);
				this.method645();
			}
			return true;
		} catch (@Pc(4587) RuntimeException local4587) {
			signlink.reporterror("27876, " + -37766 + ", " + local4587.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ZI)V")
	private void method657(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1) {
		try {
			this.method606();
			while (arg1 >= 0) {
				this.method580();
			}
			this.aClass17_5.method195();
			this.aClass2_Sub1_Sub2_Sub3_11.method541(0, 0);
			@Pc(53) byte local53;
			@Pc(66) int local66;
			if (this.anInt915 == 0) {
				this.aClass2_Sub1_Sub2_Sub4_2.method559(true, this.aClass8_Sub1_1.aString2, this.aByte43, 7711145, 180, 180);
				local53 = 80;
				this.aClass2_Sub1_Sub2_Sub4_4.method559(true, "Welcome to RuneScape", this.aByte43, 16776960, 80, 180);
				local66 = local53 + 30;
				this.aClass2_Sub1_Sub2_Sub3_12.method541(27, 100);
				this.aClass2_Sub1_Sub2_Sub4_4.method559(true, "New User", this.aByte43, 16777215, 125, 100);
				this.aClass2_Sub1_Sub2_Sub3_12.method541(187, 100);
				this.aClass2_Sub1_Sub2_Sub4_4.method559(true, "Existing User", this.aByte43, 16777215, 125, 260);
			}
			if (this.anInt915 == 2) {
				local53 = 60;
				if (this.aString18.length() > 0) {
					this.aClass2_Sub1_Sub2_Sub4_4.method559(true, this.aString18, this.aByte43, 16776960, 45, 180);
					this.aClass2_Sub1_Sub2_Sub4_4.method559(true, this.aString19, this.aByte43, 16776960, 60, 180);
					local66 = local53 + 30;
				} else {
					this.aClass2_Sub1_Sub2_Sub4_4.method559(true, this.aString19, this.aByte43, 16776960, 53, 180);
					local66 = local53 + 30;
				}
				this.aClass2_Sub1_Sub2_Sub4_4.method566(16777215, "Username: " + this.aString29 + (this.anInt929 == 0 & anInt878 % 40 < 20 ? "@yel@|" : ""), true, 90, this.aBoolean185, 90);
				local66 += 15;
				this.aClass2_Sub1_Sub2_Sub4_4.method566(16777215, "Password: " + Class28.method351(this.aString30) + (this.anInt929 == 1 & anInt878 % 40 < 20 ? "@yel@|" : ""), true, 92, this.aBoolean185, 105);
				local66 += 15;
				if (!arg0) {
					this.aClass2_Sub1_Sub2_Sub3_12.method541(27, 130);
					this.aClass2_Sub1_Sub2_Sub4_4.method559(true, "Login", this.aByte43, 16777215, 155, 100);
					this.aClass2_Sub1_Sub2_Sub3_12.method541(187, 130);
					this.aClass2_Sub1_Sub2_Sub4_4.method559(true, "Cancel", this.aByte43, 16777215, 155, 260);
				}
			}
			if (this.anInt915 == 3) {
				this.aClass2_Sub1_Sub2_Sub4_4.method559(true, "Create a free account", this.aByte43, 16776960, 40, 180);
				local53 = 65;
				this.aClass2_Sub1_Sub2_Sub4_4.method559(true, "To create a new account you need to", this.aByte43, 16777215, 65, 180);
				local66 = local53 + 15;
				this.aClass2_Sub1_Sub2_Sub4_4.method559(true, "go back to the main RuneScape webpage", this.aByte43, 16777215, 80, 180);
				local66 += 15;
				this.aClass2_Sub1_Sub2_Sub4_4.method559(true, "and choose the 'create account'", this.aByte43, 16777215, 95, 180);
				local66 += 15;
				this.aClass2_Sub1_Sub2_Sub4_4.method559(true, "button near the top of that page.", this.aByte43, 16777215, 110, 180);
				local66 += 15;
				this.aClass2_Sub1_Sub2_Sub3_12.method541(107, 130);
				this.aClass2_Sub1_Sub2_Sub4_4.method559(true, "Cancel", this.aByte43, 16777215, 155, 180);
			}
			this.aClass17_5.method196(super.aGraphics2, 202, 171);
			if (this.aBoolean183) {
				this.aBoolean183 = false;
				this.aClass17_3.method196(super.aGraphics2, 128, 0);
				this.aClass17_4.method196(super.aGraphics2, 202, 371);
				this.aClass17_8.method196(super.aGraphics2, 0, 265);
				this.aClass17_9.method196(super.aGraphics2, 562, 265);
				this.aClass17_10.method196(super.aGraphics2, 128, 171);
				this.aClass17_11.method196(super.aGraphics2, 562, 171);
			}
		} catch (@Pc(514) RuntimeException local514) {
			signlink.reporterror("21200, " + arg0 + ", " + arg1 + ", " + local514.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IBLclient!PQPZKUPU;)I")
	private int method658(@OriginalArg(0) int arg0, @OriginalArg(2) Class31 arg1) {
		try {
			if (arg1.anIntArrayArray13 == null || arg0 >= arg1.anIntArrayArray13.length) {
				return -2;
			}
			try {
				@Pc(21) int[] local21 = arg1.anIntArrayArray13[arg0];
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
						local34 = this.anIntArray229[local21[local25++]];
					}
					if (local32 == 2) {
						local34 = this.anIntArray213[local21[local25++]];
					}
					if (local32 == 3) {
						local34 = this.anIntArray246[local21[local25++]];
					}
					@Pc(82) Class31 local82;
					@Pc(87) int local87;
					@Pc(100) int local100;
					if (local32 == 4) {
						local82 = Class31.method366(local21[local25++]);
						local87 = local21[local25++];
						if (local87 >= 0 && local87 < Class41.anInt647 && (!Class41.method495(local87).aBoolean155 || aBoolean196)) {
							for (local100 = 0; local100 < local82.anIntArray111.length; local100++) {
								if (local82.anIntArray111[local100] == local87 + 1) {
									local34 += local82.anIntArray112[local100];
								}
							}
						}
					}
					if (local32 == 5) {
						local34 = this.anIntArray253[local21[local25++]];
					}
					if (local32 == 6) {
						local34 = anIntArray241[this.anIntArray213[local21[local25++]] - 1];
					}
					if (local32 == 7) {
						local34 = this.anIntArray253[local21[local25++]] * 100 / 46875;
					}
					if (local32 == 8) {
						local34 = aClass2_Sub1_Sub1_Sub4_Sub2_1.anInt581;
					}
					@Pc(175) int local175;
					if (local32 == 9) {
						for (local175 = 0; local175 < Class38.anInt607; local175++) {
							if (Class38.aBooleanArray8[local175]) {
								local34 += this.anIntArray213[local175];
							}
						}
					}
					if (local32 == 10) {
						local82 = Class31.method366(local21[local25++]);
						local87 = local21[local25++] + 1;
						if (local87 >= 0 && local87 < Class41.anInt647 && (!Class41.method495(local87).aBoolean155 || aBoolean196)) {
							for (local100 = 0; local100 < local82.anIntArray111.length; local100++) {
								if (local82.anIntArray111[local100] == local87) {
									local34 = 999999999;
									break;
								}
							}
						}
					}
					if (local32 == 11) {
						local34 = this.anInt1025;
					}
					if (local32 == 12) {
						local34 = this.anInt926;
					}
					if (local32 == 13) {
						local175 = this.anIntArray253[local21[local25++]];
						local87 = local21[local25++];
						local34 = (local175 & 0x1 << local87) == 0 ? 0 : 1;
					}
					if (local32 == 14) {
						local175 = local21[local25++];
						@Pc(289) Class15 local289 = Class15.aClass15Array1[local175];
						local100 = local289.anInt239;
						@Pc(295) int local295 = local289.anInt240;
						@Pc(298) int local298 = local289.anInt241;
						@Pc(304) int local304 = anIntArray276[local298 - local295];
						local34 = this.anIntArray253[local100] >> local295 & local304;
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
						local34 = (aClass2_Sub1_Sub1_Sub4_Sub2_1.anInt541 >> 7) + this.anInt874;
					}
					if (local32 == 19) {
						local34 = (aClass2_Sub1_Sub1_Sub4_Sub2_1.anInt542 >> 7) + this.anInt875;
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
			} catch (@Pc(397) Exception local397) {
				return -1;
			}
		} catch (@Pc(400) RuntimeException local400) {
			signlink.reporterror("23118, " + arg0 + ", " + 0 + ", " + arg1 + ", " + local400.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(II)V")
	private void method659(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			if (arg0 >= 0) {
				@Pc(9) int local9 = this.anIntArray233[arg0];
				@Pc(14) int local14 = this.anIntArray234[arg0];
				@Pc(19) int local19 = this.anIntArray235[arg0];
				@Pc(24) int local24 = this.anIntArray236[arg0];
				@Pc(28) boolean local28 = false;
				if (local19 >= 2000) {
					local19 -= 2000;
				}
				if (this.anInt825 != 0 && local19 != 1321) {
					this.anInt825 = 0;
					this.aBoolean225 = true;
				}
				@Pc(69) boolean local69;
				if (local19 == 972) {
					local69 = this.method649(aClass2_Sub1_Sub1_Sub4_Sub2_1.anIntArray143[0], this.aByte32, 0, 0, 0, 0, 2, local14, false, aClass2_Sub1_Sub1_Sub4_Sub2_1.anIntArray144[0], 0, local9);
					if (!local69) {
						this.method649(aClass2_Sub1_Sub1_Sub4_Sub2_1.anIntArray143[0], this.aByte32, 0, 1, 0, 0, 2, local14, false, aClass2_Sub1_Sub1_Sub4_Sub2_1.anIntArray144[0], 1, local9);
					}
					this.anInt838 = super.anInt815;
					this.anInt839 = super.anInt816;
					this.anInt841 = 2;
					this.anInt840 = 0;
					this.aClass2_Sub1_Sub3_6.method256(77);
					this.aClass2_Sub1_Sub3_6.method290(local9 + this.anInt874);
					this.aClass2_Sub1_Sub3_6.method258(local24);
					this.aClass2_Sub1_Sub3_6.method292(local14 + this.anInt875);
				}
				@Pc(165) int local165;
				@Pc(147) Class31 local147;
				if (local19 == 915) {
					this.aClass2_Sub1_Sub3_6.method256(52);
					this.aClass2_Sub1_Sub3_6.method258(local14);
					local147 = Class31.method366(local14);
					if (local147.anIntArrayArray13 != null && local147.anIntArrayArray13[0][0] == 5) {
						local165 = local147.anIntArrayArray13[0][1];
						if (this.anIntArray253[local165] != local147.anIntArray109[0]) {
							this.anIntArray253[local165] = local147.anIntArray109[0];
							this.method613(local165, 667);
							this.aBoolean228 = true;
						}
					}
				}
				@Pc(197) String local197;
				if (local19 == 564) {
					local197 = this.aStringArray14[arg0];
					local165 = local197.indexOf("@whi@");
					if (local165 != -1) {
						if (this.anInt1039 == -1) {
							this.method592();
							this.aString23 = local197.substring(local165 + 5).trim();
							this.aBoolean212 = false;
							this.anInt965 = this.anInt1039 = Class31.anInt408;
						} else {
							this.method640("Please close the interface you have open before using 'report abuse'", "", 0);
						}
					}
				}
				if (local19 == 1161) {
					this.method674(local9, local24, local14);
					this.aClass2_Sub1_Sub3_6.method256(86);
					this.aClass2_Sub1_Sub3_6.method258(local9 + this.anInt874);
					this.aClass2_Sub1_Sub3_6.method258(local14 + this.anInt875);
					this.aClass2_Sub1_Sub3_6.method291(local24 >> 14 & 0x7FFF);
				}
				@Pc(306) String local306;
				@Pc(310) int local310;
				if (local19 == 455 || local19 == 899) {
					local197 = this.aStringArray14[arg0];
					local165 = local197.indexOf("@whi@");
					if (local165 != -1) {
						local197 = local197.substring(local165 + 5).trim();
						local306 = Class28.method350(Class28.method347(Class28.method346(local197)));
						@Pc(308) boolean local308 = false;
						for (local310 = 0; local310 < this.anInt902; local310++) {
							@Pc(320) Class2_Sub1_Sub1_Sub4_Sub2 local320 = this.aClass2_Sub1_Sub1_Sub4_Sub2Array1[this.anIntArray231[local310]];
							if (local320 != null && local320.aString14 != null && local320.aString14.equalsIgnoreCase(local306)) {
								this.method649(aClass2_Sub1_Sub1_Sub4_Sub2_1.anIntArray143[0], this.aByte32, 0, 1, 0, 0, 2, local320.anIntArray144[0], false, aClass2_Sub1_Sub1_Sub4_Sub2_1.anIntArray144[0], 1, local320.anIntArray143[0]);
								if (local19 == 455) {
									this.aClass2_Sub1_Sub3_6.method256(26);
									this.aClass2_Sub1_Sub3_6.method290(this.anIntArray231[local310]);
								}
								if (local19 == 899) {
									this.aClass2_Sub1_Sub3_6.method256(48);
									this.aClass2_Sub1_Sub3_6.method290(this.anIntArray231[local310]);
								}
								local308 = true;
								break;
							}
						}
						if (!local308) {
							this.method640("Unable to find " + local306, "", 0);
						}
					}
				}
				if (local19 == 971) {
					this.aClass2_Sub1_Sub3_6.method256(221);
					this.aClass2_Sub1_Sub3_6.method292(local14);
					this.aClass2_Sub1_Sub3_6.method292(local9);
					this.aClass2_Sub1_Sub3_6.method292(local24);
					this.anInt940 = 0;
					this.anInt941 = local14;
					this.anInt942 = local9;
					this.anInt943 = 2;
					if (Class31.method366(local14).anInt420 == this.anInt1039) {
						this.anInt943 = 1;
					}
					if (Class31.method366(local14).anInt420 == this.anInt974) {
						this.anInt943 = 3;
					}
				}
				if (local19 == 273) {
					anInt892 += local9;
					if (anInt892 >= 67) {
						this.aClass2_Sub1_Sub3_6.method256(57);
						this.aClass2_Sub1_Sub3_6.method260(3721323);
						anInt892 = 0;
					}
					this.aClass2_Sub1_Sub3_6.method256(91);
					this.aClass2_Sub1_Sub3_6.method292(local9);
					this.aClass2_Sub1_Sub3_6.method292(local14);
					this.aClass2_Sub1_Sub3_6.method290(local24);
					this.anInt940 = 0;
					this.anInt941 = local14;
					this.anInt942 = local9;
					this.anInt943 = 2;
					if (Class31.method366(local14).anInt420 == this.anInt1039) {
						this.anInt943 = 1;
					}
					if (Class31.method366(local14).anInt420 == this.anInt974) {
						this.anInt943 = 3;
					}
				}
				if (local19 == 402) {
					this.aClass2_Sub1_Sub3_6.method256(59);
					this.aClass2_Sub1_Sub3_6.method258(local24);
					this.aClass2_Sub1_Sub3_6.method258(this.anInt885);
					this.aClass2_Sub1_Sub3_6.method290(this.anInt887);
					this.aClass2_Sub1_Sub3_6.method291(local9);
					this.aClass2_Sub1_Sub3_6.method290(this.anInt886);
					this.aClass2_Sub1_Sub3_6.method291(local14);
					this.anInt940 = 0;
					this.anInt941 = local14;
					this.anInt942 = local9;
					this.anInt943 = 2;
					if (Class31.method366(local14).anInt420 == this.anInt1039) {
						this.anInt943 = 1;
					}
					if (Class31.method366(local14).anInt420 == this.anInt974) {
						this.anInt943 = 3;
					}
				}
				if (local19 == 213) {
					this.method674(local9, local24, local14);
					this.aClass2_Sub1_Sub3_6.method256(126);
					this.aClass2_Sub1_Sub3_6.method291(local9 + this.anInt874);
					this.aClass2_Sub1_Sub3_6.method258(local24 >> 14 & 0x7FFF);
					this.aClass2_Sub1_Sub3_6.method258(local14 + this.anInt875);
				}
				@Pc(652) Class2_Sub1_Sub1_Sub4_Sub1 local652;
				if (local19 == 151) {
					local652 = this.aClass2_Sub1_Sub1_Sub4_Sub1Array1[local24];
					if (local652 != null) {
						this.method649(aClass2_Sub1_Sub1_Sub4_Sub2_1.anIntArray143[0], this.aByte32, 0, 1, 0, 0, 2, local652.anIntArray144[0], false, aClass2_Sub1_Sub1_Sub4_Sub2_1.anIntArray144[0], 1, local652.anIntArray143[0]);
						this.anInt838 = super.anInt815;
						this.anInt839 = super.anInt816;
						this.anInt841 = 2;
						this.anInt840 = 0;
						this.aClass2_Sub1_Sub3_6.method256(140);
						this.aClass2_Sub1_Sub3_6.method258(this.anInt887);
						this.aClass2_Sub1_Sub3_6.method292(local24);
						this.aClass2_Sub1_Sub3_6.method292(this.anInt885);
						this.aClass2_Sub1_Sub3_6.method292(this.anInt886);
					}
				}
				@Pc(755) long local755;
				if (local19 == 308 || local19 == 502 || local19 == 760 || local19 == 831) {
					local197 = this.aStringArray14[arg0];
					local165 = local197.indexOf("@whi@");
					if (local165 != -1) {
						local755 = Class28.method346(local197.substring(local165 + 5).trim());
						if (local19 == 308) {
							this.method620(local755);
						}
						if (local19 == 502) {
							this.method655(local755);
						}
						if (local19 == 760) {
							this.method675(local755);
						}
						if (local19 == 831) {
							this.method682(local755);
						}
					}
				}
				if (local19 == 776) {
					local652 = this.aClass2_Sub1_Sub1_Sub4_Sub1Array1[local24];
					if (local652 != null) {
						this.method649(aClass2_Sub1_Sub1_Sub4_Sub2_1.anIntArray143[0], this.aByte32, 0, 1, 0, 0, 2, local652.anIntArray144[0], false, aClass2_Sub1_Sub1_Sub4_Sub2_1.anIntArray144[0], 1, local652.anIntArray143[0]);
						this.anInt838 = super.anInt815;
						this.anInt839 = super.anInt816;
						this.anInt841 = 2;
						this.anInt840 = 0;
						anInt913 += local24;
						if (anInt913 >= 141) {
							this.aClass2_Sub1_Sub3_6.method256(109);
							this.aClass2_Sub1_Sub3_6.method261(0);
							anInt913 = 0;
						}
						this.aClass2_Sub1_Sub3_6.method256(135);
						this.aClass2_Sub1_Sub3_6.method258(local24);
					}
				}
				@Pc(870) Class2_Sub1_Sub1_Sub4_Sub2 local870;
				if (local19 == 72) {
					local870 = this.aClass2_Sub1_Sub1_Sub4_Sub2Array1[local24];
					if (local870 != null) {
						this.method649(aClass2_Sub1_Sub1_Sub4_Sub2_1.anIntArray143[0], this.aByte32, 0, 1, 0, 0, 2, local870.anIntArray144[0], false, aClass2_Sub1_Sub1_Sub4_Sub2_1.anIntArray144[0], 1, local870.anIntArray143[0]);
						this.anInt838 = super.anInt815;
						this.anInt839 = super.anInt816;
						this.anInt841 = 2;
						this.anInt840 = 0;
						this.aClass2_Sub1_Sub3_6.method256(222);
						this.aClass2_Sub1_Sub3_6.method258(local24);
					}
				}
				if (local19 == 368) {
					local69 = this.method649(aClass2_Sub1_Sub1_Sub4_Sub2_1.anIntArray143[0], this.aByte32, 0, 0, 0, 0, 2, local14, false, aClass2_Sub1_Sub1_Sub4_Sub2_1.anIntArray144[0], 0, local9);
					if (!local69) {
						this.method649(aClass2_Sub1_Sub1_Sub4_Sub2_1.anIntArray143[0], this.aByte32, 0, 1, 0, 0, 2, local14, false, aClass2_Sub1_Sub1_Sub4_Sub2_1.anIntArray144[0], 1, local9);
					}
					this.anInt838 = super.anInt815;
					this.anInt839 = super.anInt816;
					this.anInt841 = 2;
					this.anInt840 = 0;
					this.aClass2_Sub1_Sub3_6.method256(181);
					this.aClass2_Sub1_Sub3_6.method291(local14 + this.anInt875);
					this.aClass2_Sub1_Sub3_6.method291(local9 + this.anInt874);
					this.aClass2_Sub1_Sub3_6.method292(local24);
				}
				if (local19 == 652) {
					this.aClass2_Sub1_Sub3_6.method256(52);
					this.aClass2_Sub1_Sub3_6.method258(local14);
					local147 = Class31.method366(local14);
					if (local147.anIntArrayArray13 != null && local147.anIntArrayArray13[0][0] == 5) {
						local165 = local147.anIntArrayArray13[0][1];
						this.anIntArray253[local165] = 1 - this.anIntArray253[local165];
						this.method613(local165, 667);
						this.aBoolean228 = true;
					}
				}
				if (local19 == 114) {
					local870 = this.aClass2_Sub1_Sub1_Sub4_Sub2Array1[local24];
					if (local870 != null) {
						this.method649(aClass2_Sub1_Sub1_Sub4_Sub2_1.anIntArray143[0], this.aByte32, 0, 1, 0, 0, 2, local870.anIntArray144[0], false, aClass2_Sub1_Sub1_Sub4_Sub2_1.anIntArray144[0], 1, local870.anIntArray143[0]);
						this.anInt838 = super.anInt815;
						this.anInt839 = super.anInt816;
						this.anInt841 = 2;
						this.anInt840 = 0;
						this.aClass2_Sub1_Sub3_6.method256(193);
						this.aClass2_Sub1_Sub3_6.method291(local24);
						this.aClass2_Sub1_Sub3_6.method292(this.anInt889);
					}
				}
				if (local19 == 37 && this.method674(local9, local24, local14)) {
					this.aClass2_Sub1_Sub3_6.method256(18);
					this.aClass2_Sub1_Sub3_6.method291(this.anInt886);
					this.aClass2_Sub1_Sub3_6.method292(local14 + this.anInt875);
					this.aClass2_Sub1_Sub3_6.method292(local24 >> 14 & 0x7FFF);
					this.aClass2_Sub1_Sub3_6.method291(this.anInt887);
					this.aClass2_Sub1_Sub3_6.method290(local9 + this.anInt874);
					this.aClass2_Sub1_Sub3_6.method290(this.anInt885);
				}
				if (local19 == 220) {
					this.aClass2_Sub1_Sub3_6.method256(206);
					this.aClass2_Sub1_Sub3_6.method292(local9);
					this.aClass2_Sub1_Sub3_6.method290(local14);
					this.aClass2_Sub1_Sub3_6.method291(local24);
					this.anInt940 = 0;
					this.anInt941 = local14;
					this.anInt942 = local9;
					this.anInt943 = 2;
					if (Class31.method366(local14).anInt420 == this.anInt1039) {
						this.anInt943 = 1;
					}
					if (Class31.method366(local14).anInt420 == this.anInt974) {
						this.anInt943 = 3;
					}
				}
				if (local19 == 43 && !this.aBoolean199) {
					this.aClass2_Sub1_Sub3_6.method256(177);
					this.aClass2_Sub1_Sub3_6.method258(local14);
					this.aBoolean199 = true;
				}
				if (local19 == 132) {
					local652 = this.aClass2_Sub1_Sub1_Sub4_Sub1Array1[local24];
					if (local652 != null) {
						this.method649(aClass2_Sub1_Sub1_Sub4_Sub2_1.anIntArray143[0], this.aByte32, 0, 1, 0, 0, 2, local652.anIntArray144[0], false, aClass2_Sub1_Sub1_Sub4_Sub2_1.anIntArray144[0], 1, local652.anIntArray143[0]);
						this.anInt838 = super.anInt815;
						this.anInt839 = super.anInt816;
						this.anInt841 = 2;
						this.anInt840 = 0;
						anInt1009++;
						if (anInt1009 >= 129) {
							this.aClass2_Sub1_Sub3_6.method256(130);
							this.aClass2_Sub1_Sub3_6.method261(0);
							anInt1009 = 0;
						}
						this.aClass2_Sub1_Sub3_6.method256(60);
						this.aClass2_Sub1_Sub3_6.method292(local24);
					}
				}
				if (local19 == 581) {
					local652 = this.aClass2_Sub1_Sub1_Sub4_Sub1Array1[local24];
					if (local652 != null) {
						this.method649(aClass2_Sub1_Sub1_Sub4_Sub2_1.anIntArray143[0], this.aByte32, 0, 1, 0, 0, 2, local652.anIntArray144[0], false, aClass2_Sub1_Sub1_Sub4_Sub2_1.anIntArray144[0], 1, local652.anIntArray143[0]);
						this.anInt838 = super.anInt815;
						this.anInt839 = super.anInt816;
						this.anInt841 = 2;
						this.anInt840 = 0;
						this.aClass2_Sub1_Sub3_6.method256(95);
						this.aClass2_Sub1_Sub3_6.method258(this.anInt889);
						this.aClass2_Sub1_Sub3_6.method290(local24);
					}
				}
				if (local19 == 85) {
					local870 = this.aClass2_Sub1_Sub1_Sub4_Sub2Array1[local24];
					if (local870 != null) {
						this.method649(aClass2_Sub1_Sub1_Sub4_Sub2_1.anIntArray143[0], this.aByte32, 0, 1, 0, 0, 2, local870.anIntArray144[0], false, aClass2_Sub1_Sub1_Sub4_Sub2_1.anIntArray144[0], 1, local870.anIntArray143[0]);
						this.anInt838 = super.anInt815;
						this.anInt839 = super.anInt816;
						this.anInt841 = 2;
						this.anInt840 = 0;
						this.aClass2_Sub1_Sub3_6.method256(48);
						this.aClass2_Sub1_Sub3_6.method290(local24);
					}
				}
				if (local19 == 924) {
					local69 = this.method649(aClass2_Sub1_Sub1_Sub4_Sub2_1.anIntArray143[0], this.aByte32, 0, 0, 0, 0, 2, local14, false, aClass2_Sub1_Sub1_Sub4_Sub2_1.anIntArray144[0], 0, local9);
					if (!local69) {
						this.method649(aClass2_Sub1_Sub1_Sub4_Sub2_1.anIntArray143[0], this.aByte32, 0, 1, 0, 0, 2, local14, false, aClass2_Sub1_Sub1_Sub4_Sub2_1.anIntArray144[0], 1, local9);
					}
					this.anInt838 = super.anInt815;
					this.anInt839 = super.anInt816;
					this.anInt841 = 2;
					this.anInt840 = 0;
					this.aClass2_Sub1_Sub3_6.method256(210);
					this.aClass2_Sub1_Sub3_6.method291(local9 + this.anInt874);
					this.aClass2_Sub1_Sub3_6.method258(this.anInt889);
					this.aClass2_Sub1_Sub3_6.method292(local14 + this.anInt875);
					this.aClass2_Sub1_Sub3_6.method258(local24);
				}
				if (local19 == 565) {
					local652 = this.aClass2_Sub1_Sub1_Sub4_Sub1Array1[local24];
					if (local652 != null) {
						this.method649(aClass2_Sub1_Sub1_Sub4_Sub2_1.anIntArray143[0], this.aByte32, 0, 1, 0, 0, 2, local652.anIntArray144[0], false, aClass2_Sub1_Sub1_Sub4_Sub2_1.anIntArray144[0], 1, local652.anIntArray143[0]);
						this.anInt838 = super.anInt815;
						this.anInt839 = super.anInt816;
						this.anInt841 = 2;
						this.anInt840 = 0;
						this.aClass2_Sub1_Sub3_6.method256(186);
						this.aClass2_Sub1_Sub3_6.method291(local24);
					}
				}
				if (local19 == 1094) {
					local652 = this.aClass2_Sub1_Sub1_Sub4_Sub1Array1[local24];
					if (local652 != null) {
						@Pc(1636) Class45 local1636 = local652.aClass45_1;
						if (local1636.anIntArray174 != null) {
							local1636 = local1636.method513();
						}
						if (local1636 != null) {
							if (local1636.aByteArray12 == null) {
								local306 = "It's a " + local1636.aString16 + ".";
							} else {
								local306 = new String(local1636.aByteArray12);
							}
							this.method640(local306, "", 0);
						}
					}
				}
				if (local19 == 138) {
					this.anInt884 = 1;
					this.anInt885 = local9;
					this.anInt886 = local14;
					this.anInt887 = local24;
					this.aString21 = Class41.method495(local24).aString15;
					this.anInt888 = 0;
					this.aBoolean228 = true;
				} else {
					if (local19 == 496) {
						local147 = Class31.method366(local14);
						@Pc(1708) boolean local1708 = true;
						if (local147.anInt407 > 0) {
							local1708 = this.method643(local147);
						}
						if (local1708) {
							this.aClass2_Sub1_Sub3_6.method256(52);
							this.aClass2_Sub1_Sub3_6.method258(local14);
						}
					}
					if (local19 == 364) {
						this.aClass2_Sub1_Sub3_6.method256(156);
						this.aClass2_Sub1_Sub3_6.method292(local14);
						this.aClass2_Sub1_Sub3_6.method290(local9);
						this.aClass2_Sub1_Sub3_6.method292(local24);
						this.anInt940 = 0;
						this.anInt941 = local14;
						this.anInt942 = local9;
						this.anInt943 = 2;
						if (Class31.method366(local14).anInt420 == this.anInt1039) {
							this.anInt943 = 1;
						}
						if (Class31.method366(local14).anInt420 == this.anInt974) {
							this.anInt943 = 3;
						}
					}
					if (local19 == 168) {
						this.aClass2_Sub1_Sub3_6.method256(23);
						this.aClass2_Sub1_Sub3_6.method258(local24);
						this.aClass2_Sub1_Sub3_6.method290(local14);
						this.aClass2_Sub1_Sub3_6.method291(local9);
						this.anInt940 = 0;
						this.anInt941 = local14;
						this.anInt942 = local9;
						this.anInt943 = 2;
						if (Class31.method366(local14).anInt420 == this.anInt1039) {
							this.anInt943 = 1;
						}
						if (Class31.method366(local14).anInt420 == this.anInt974) {
							this.anInt943 = 3;
						}
					}
					@Pc(1864) String local1864;
					@Pc(1838) Class41 local1838;
					if (local19 == 1759) {
						local1838 = Class41.method495(local24);
						@Pc(1841) Class31 local1841 = Class31.method366(local14);
						if (local1841 != null && local1841.anIntArray112[local9] >= 100000) {
							local1864 = local1841.anIntArray112[local9] + " x " + local1838.aString15;
						} else if (local1838.aByteArray11 == null) {
							local1864 = "It's a " + local1838.aString15 + ".";
						} else {
							local1864 = new String(local1838.aByteArray11);
						}
						this.method640(local1864, "", 0);
					}
					if (local19 == 894 && this.method674(local9, local24, local14)) {
						this.aClass2_Sub1_Sub3_6.method256(237);
						this.aClass2_Sub1_Sub3_6.method291(local9 + this.anInt874);
						this.aClass2_Sub1_Sub3_6.method292(local14 + this.anInt875);
						this.aClass2_Sub1_Sub3_6.method291(this.anInt889);
						this.aClass2_Sub1_Sub3_6.method291(local24 >> 14 & 0x7FFF);
					}
					if (local19 == 224) {
						if ((local9 & 0x3) == 0) {
							anInt851++;
						}
						if (anInt851 >= 128) {
							this.aClass2_Sub1_Sub3_6.method256(58);
							this.aClass2_Sub1_Sub3_6.method261(0);
							anInt851 = 0;
						}
						this.method674(local9, local24, local14);
						this.aClass2_Sub1_Sub3_6.method256(99);
						this.aClass2_Sub1_Sub3_6.method290(local24 >> 14 & 0x7FFF);
						this.aClass2_Sub1_Sub3_6.method258(local14 + this.anInt875);
						this.aClass2_Sub1_Sub3_6.method292(local9 + this.anInt874);
					}
					if (local19 == 377) {
						anInt1004 += local24;
						if (anInt1004 >= 130) {
							this.aClass2_Sub1_Sub3_6.method256(90);
							this.aClass2_Sub1_Sub3_6.method261(0);
							anInt1004 = 0;
						}
						this.aClass2_Sub1_Sub3_6.method256(31);
						this.aClass2_Sub1_Sub3_6.method291(local9);
						this.aClass2_Sub1_Sub3_6.method290(local24);
						this.aClass2_Sub1_Sub3_6.method258(local14);
						this.anInt940 = 0;
						this.anInt941 = local14;
						this.anInt942 = local9;
						this.anInt943 = 2;
						if (Class31.method366(local14).anInt420 == this.anInt1039) {
							this.anInt943 = 1;
						}
						if (Class31.method366(local14).anInt420 == this.anInt974) {
							this.anInt943 = 3;
						}
					}
					if (local19 == 989) {
						local69 = this.method649(aClass2_Sub1_Sub1_Sub4_Sub2_1.anIntArray143[0], this.aByte32, 0, 0, 0, 0, 2, local14, false, aClass2_Sub1_Sub1_Sub4_Sub2_1.anIntArray144[0], 0, local9);
						if (!local69) {
							this.method649(aClass2_Sub1_Sub1_Sub4_Sub2_1.anIntArray143[0], this.aByte32, 0, 1, 0, 0, 2, local14, false, aClass2_Sub1_Sub1_Sub4_Sub2_1.anIntArray144[0], 1, local9);
						}
						this.anInt838 = super.anInt815;
						this.anInt839 = super.anInt816;
						this.anInt841 = 2;
						this.anInt840 = 0;
						this.aClass2_Sub1_Sub3_6.method256(236);
						this.aClass2_Sub1_Sub3_6.method291(local14 + this.anInt875);
						this.aClass2_Sub1_Sub3_6.method291(this.anInt887);
						this.aClass2_Sub1_Sub3_6.method292(local24);
						this.aClass2_Sub1_Sub3_6.method291(local9 + this.anInt874);
						this.aClass2_Sub1_Sub3_6.method291(this.anInt886);
						this.aClass2_Sub1_Sub3_6.method291(this.anInt885);
					}
					if (local19 == 262) {
						local870 = this.aClass2_Sub1_Sub1_Sub4_Sub2Array1[local24];
						if (local870 != null) {
							this.method649(aClass2_Sub1_Sub1_Sub4_Sub2_1.anIntArray143[0], this.aByte32, 0, 1, 0, 0, 2, local870.anIntArray144[0], false, aClass2_Sub1_Sub1_Sub4_Sub2_1.anIntArray144[0], 1, local870.anIntArray143[0]);
							this.anInt838 = super.anInt815;
							this.anInt839 = super.anInt816;
							this.anInt841 = 2;
							this.anInt840 = 0;
							this.aClass2_Sub1_Sub3_6.method256(235);
							this.aClass2_Sub1_Sub3_6.method290(local24);
						}
					}
					if (local19 == 716) {
						local870 = this.aClass2_Sub1_Sub1_Sub4_Sub2Array1[local24];
						if (local870 != null) {
							this.method649(aClass2_Sub1_Sub1_Sub4_Sub2_1.anIntArray143[0], this.aByte32, 0, 1, 0, 0, 2, local870.anIntArray144[0], false, aClass2_Sub1_Sub1_Sub4_Sub2_1.anIntArray144[0], 1, local870.anIntArray143[0]);
							this.anInt838 = super.anInt815;
							this.anInt839 = super.anInt816;
							this.anInt841 = 2;
							this.anInt840 = 0;
							this.aClass2_Sub1_Sub3_6.method256(114);
							this.aClass2_Sub1_Sub3_6.method292(local24);
						}
					}
					if (local19 == 158) {
						if (this.aBoolean224) {
							this.aClass34_1.method414(local14 - 4, local9 - 4);
						} else {
							this.aClass34_1.method414(super.anInt816 - 4, super.anInt815 - 4);
						}
					}
					if (local19 == 619) {
						local147 = Class31.method366(local14);
						this.anInt888 = 1;
						this.anInt889 = local14;
						this.anInt890 = local147.anInt431;
						this.anInt884 = 0;
						this.aBoolean228 = true;
						local1864 = local147.aString8;
						if (local1864.indexOf(" ") != -1) {
							local1864 = local1864.substring(0, local1864.indexOf(" "));
						}
						local306 = local147.aString8;
						if (local306.indexOf(" ") != -1) {
							local306 = local306.substring(local306.indexOf(" ") + 1);
						}
						this.aString22 = local1864 + " " + local147.aString7 + " " + local306;
						if (this.anInt890 == 16) {
							this.aBoolean228 = true;
							this.anInt921 = 3;
							this.aBoolean190 = true;
						}
					} else {
						if (local19 == 34) {
							this.aClass2_Sub1_Sub3_6.method256(211);
							this.aClass2_Sub1_Sub3_6.method291(local24);
							this.aClass2_Sub1_Sub3_6.method291(local9);
							this.aClass2_Sub1_Sub3_6.method292(local14);
							this.anInt940 = 0;
							this.anInt941 = local14;
							this.anInt942 = local9;
							this.anInt943 = 2;
							if (Class31.method366(local14).anInt420 == this.anInt1039) {
								this.anInt943 = 1;
							}
							if (Class31.method366(local14).anInt420 == this.anInt974) {
								this.anInt943 = 3;
							}
						}
						if (local19 == 987) {
							this.aClass2_Sub1_Sub3_6.method256(226);
							this.aClass2_Sub1_Sub3_6.method291(this.anInt889);
							this.aClass2_Sub1_Sub3_6.method290(local9);
							this.aClass2_Sub1_Sub3_6.method290(local24);
							this.aClass2_Sub1_Sub3_6.method290(local14);
							this.anInt940 = 0;
							this.anInt941 = local14;
							this.anInt942 = local9;
							this.anInt943 = 2;
							if (Class31.method366(local14).anInt420 == this.anInt1039) {
								this.anInt943 = 1;
							}
							if (Class31.method366(local14).anInt420 == this.anInt974) {
								this.anInt943 = 3;
							}
						}
						if (local19 == 964) {
							local870 = this.aClass2_Sub1_Sub1_Sub4_Sub2Array1[local24];
							if (local870 != null) {
								this.method649(aClass2_Sub1_Sub1_Sub4_Sub2_1.anIntArray143[0], this.aByte32, 0, 1, 0, 0, 2, local870.anIntArray144[0], false, aClass2_Sub1_Sub1_Sub4_Sub2_1.anIntArray144[0], 1, local870.anIntArray143[0]);
								this.anInt838 = super.anInt815;
								this.anInt839 = super.anInt816;
								this.anInt841 = 2;
								this.anInt840 = 0;
								this.aClass2_Sub1_Sub3_6.method256(219);
								this.aClass2_Sub1_Sub3_6.method258(this.anInt886);
								this.aClass2_Sub1_Sub3_6.method258(this.anInt885);
								this.aClass2_Sub1_Sub3_6.method290(this.anInt887);
								this.aClass2_Sub1_Sub3_6.method290(local24);
							}
						}
						if (local19 == 855) {
							this.aClass2_Sub1_Sub3_6.method256(82);
							this.aClass2_Sub1_Sub3_6.method292(local14);
							this.aClass2_Sub1_Sub3_6.method291(local24);
							this.aClass2_Sub1_Sub3_6.method292(local9);
							this.anInt940 = 0;
							this.anInt941 = local14;
							this.anInt942 = local9;
							this.anInt943 = 2;
							if (Class31.method366(local14).anInt420 == this.anInt1039) {
								this.anInt943 = 1;
							}
							if (Class31.method366(local14).anInt420 == this.anInt974) {
								this.anInt943 = 3;
							}
						}
						if (local19 == 1876) {
							local1838 = Class41.method495(local24);
							if (local1838.aByteArray11 == null) {
								local1864 = "It's a " + local1838.aString15 + ".";
							} else {
								local1864 = new String(local1838.aByteArray11);
							}
							this.method640(local1864, "", 0);
						}
						if (local19 == 705) {
							local652 = this.aClass2_Sub1_Sub1_Sub4_Sub1Array1[local24];
							if (local652 != null) {
								this.method649(aClass2_Sub1_Sub1_Sub4_Sub2_1.anIntArray143[0], this.aByte32, 0, 1, 0, 0, 2, local652.anIntArray144[0], false, aClass2_Sub1_Sub1_Sub4_Sub2_1.anIntArray144[0], 1, local652.anIntArray143[0]);
								this.anInt838 = super.anInt815;
								this.anInt839 = super.anInt816;
								this.anInt841 = 2;
								this.anInt840 = 0;
								this.aClass2_Sub1_Sub3_6.method256(255);
								this.aClass2_Sub1_Sub3_6.method291(local24);
							}
						}
						if (local19 == 181) {
							local652 = this.aClass2_Sub1_Sub1_Sub4_Sub1Array1[local24];
							if (local652 != null) {
								this.method649(aClass2_Sub1_Sub1_Sub4_Sub2_1.anIntArray143[0], this.aByte32, 0, 1, 0, 0, 2, local652.anIntArray144[0], false, aClass2_Sub1_Sub1_Sub4_Sub2_1.anIntArray144[0], 1, local652.anIntArray143[0]);
								this.anInt838 = super.anInt815;
								this.anInt839 = super.anInt816;
								this.anInt841 = 2;
								this.anInt840 = 0;
								this.aClass2_Sub1_Sub3_6.method256(168);
								this.aClass2_Sub1_Sub3_6.method291(local24);
							}
						}
						if (local19 == 678) {
							local197 = this.aStringArray14[arg0];
							local165 = local197.indexOf("@whi@");
							if (local165 != -1) {
								local755 = Class28.method346(local197.substring(local165 + 5).trim());
								local310 = -1;
								for (@Pc(2844) int local2844 = 0; local2844 < this.anInt988; local2844++) {
									if (this.aLongArray4[local2844] == local755) {
										local310 = local2844;
										break;
									}
								}
								if (local310 != -1 && this.anIntArray227[local310] > 0) {
									this.aBoolean225 = true;
									this.anInt825 = 0;
									this.aBoolean182 = true;
									this.aString26 = "";
									this.anInt993 = 3;
									this.aLong33 = this.aLongArray4[local310];
									this.aString25 = "Enter message to send to " + this.aStringArray10[local310];
								}
							}
						}
						if (local19 == 1) {
							this.method592();
						}
						if (local19 == 912) {
							if ((this.anInt875 & 0x3) == 0) {
								anInt1026++;
							}
							if (anInt1026 >= 57) {
								this.aClass2_Sub1_Sub3_6.method256(174);
								this.aClass2_Sub1_Sub3_6.method257(24);
								anInt1026 = 0;
							}
							this.method674(local9, local24, local14);
							this.aClass2_Sub1_Sub3_6.method256(248);
							this.aClass2_Sub1_Sub3_6.method290(local24 >> 14 & 0x7FFF);
							this.aClass2_Sub1_Sub3_6.method292(local9 + this.anInt874);
							this.aClass2_Sub1_Sub3_6.method292(local14 + this.anInt875);
						}
						if (local19 == 48) {
							local69 = this.method649(aClass2_Sub1_Sub1_Sub4_Sub2_1.anIntArray143[0], this.aByte32, 0, 0, 0, 0, 2, local14, false, aClass2_Sub1_Sub1_Sub4_Sub2_1.anIntArray144[0], 0, local9);
							if (!local69) {
								this.method649(aClass2_Sub1_Sub1_Sub4_Sub2_1.anIntArray143[0], this.aByte32, 0, 1, 0, 0, 2, local14, false, aClass2_Sub1_Sub1_Sub4_Sub2_1.anIntArray144[0], 1, local9);
							}
							this.anInt838 = super.anInt815;
							this.anInt839 = super.anInt816;
							this.anInt841 = 2;
							this.anInt840 = 0;
							anInt1031++;
							if (anInt1031 >= 136) {
								this.aClass2_Sub1_Sub3_6.method256(36);
								this.aClass2_Sub1_Sub3_6.method257(225);
								anInt1031 = 0;
							}
							this.aClass2_Sub1_Sub3_6.method256(12);
							this.aClass2_Sub1_Sub3_6.method258(local14 + this.anInt875);
							this.aClass2_Sub1_Sub3_6.method292(local9 + this.anInt874);
							this.aClass2_Sub1_Sub3_6.method258(local24);
						}
						if (local19 == 495) {
							anInt925 += local14;
							if (anInt925 >= 112) {
								this.aClass2_Sub1_Sub3_6.method256(42);
								anInt925 = 0;
							}
							this.aClass2_Sub1_Sub3_6.method256(128);
							this.aClass2_Sub1_Sub3_6.method291(local9);
							this.aClass2_Sub1_Sub3_6.method258(local24);
							this.aClass2_Sub1_Sub3_6.method290(local14);
							this.anInt940 = 0;
							this.anInt941 = local14;
							this.anInt942 = local9;
							this.anInt943 = 2;
							if (Class31.method366(local14).anInt420 == this.anInt1039) {
								this.anInt943 = 1;
							}
							if (Class31.method366(local14).anInt420 == this.anInt974) {
								this.anInt943 = 3;
							}
						}
						if (local19 == 649) {
							this.method674(local9, local24, local14);
							this.aClass2_Sub1_Sub3_6.method256(32);
							this.aClass2_Sub1_Sub3_6.method290(local9 + this.anInt874);
							this.aClass2_Sub1_Sub3_6.method291(local24 >> 14 & 0x7FFF);
							this.aClass2_Sub1_Sub3_6.method292(local14 + this.anInt875);
						}
						if (local19 == 357) {
							local69 = this.method649(aClass2_Sub1_Sub1_Sub4_Sub2_1.anIntArray143[0], this.aByte32, 0, 0, 0, 0, 2, local14, false, aClass2_Sub1_Sub1_Sub4_Sub2_1.anIntArray144[0], 0, local9);
							if (!local69) {
								this.method649(aClass2_Sub1_Sub1_Sub4_Sub2_1.anIntArray143[0], this.aByte32, 0, 1, 0, 0, 2, local14, false, aClass2_Sub1_Sub1_Sub4_Sub2_1.anIntArray144[0], 1, local9);
							}
							this.anInt838 = super.anInt815;
							this.anInt839 = super.anInt816;
							this.anInt841 = 2;
							this.anInt840 = 0;
							this.aClass2_Sub1_Sub3_6.method256(24);
							this.aClass2_Sub1_Sub3_6.method258(local9 + this.anInt874);
							this.aClass2_Sub1_Sub3_6.method258(local24);
							this.aClass2_Sub1_Sub3_6.method290(local14 + this.anInt875);
						}
						if (local19 == 1509) {
							@Pc(3279) int local3279 = local24 >> 14 & 0x7FFF;
							@Pc(3282) Class24 local3282 = Class24.method307(local3279);
							if (local3282.aByteArray8 == null) {
								local306 = "It's a " + local3282.aString5 + ".";
							} else {
								local306 = new String(local3282.aByteArray8);
							}
							this.method640(local306, "", 0);
						}
						if (local19 == 670) {
							local69 = this.method649(aClass2_Sub1_Sub1_Sub4_Sub2_1.anIntArray143[0], this.aByte32, 0, 0, 0, 0, 2, local14, false, aClass2_Sub1_Sub1_Sub4_Sub2_1.anIntArray144[0], 0, local9);
							if (!local69) {
								this.method649(aClass2_Sub1_Sub1_Sub4_Sub2_1.anIntArray143[0], this.aByte32, 0, 1, 0, 0, 2, local14, false, aClass2_Sub1_Sub1_Sub4_Sub2_1.anIntArray144[0], 1, local9);
							}
							this.anInt838 = super.anInt815;
							this.anInt839 = super.anInt816;
							this.anInt841 = 2;
							this.anInt840 = 0;
							this.aClass2_Sub1_Sub3_6.method256(151);
							this.aClass2_Sub1_Sub3_6.method258(local24);
							this.aClass2_Sub1_Sub3_6.method291(local14 + this.anInt875);
							this.aClass2_Sub1_Sub3_6.method291(local9 + this.anInt874);
						}
						if (local19 == 817) {
							if ((local9 & 0x3) == 0) {
								anInt830++;
							}
							if (anInt830 >= 94) {
								this.aClass2_Sub1_Sub3_6.method256(125);
								this.aClass2_Sub1_Sub3_6.method257(25);
								anInt830 = 0;
							}
							this.aClass2_Sub1_Sub3_6.method256(203);
							this.aClass2_Sub1_Sub3_6.method291(local9);
							this.aClass2_Sub1_Sub3_6.method292(local14);
							this.aClass2_Sub1_Sub3_6.method292(local24);
							this.anInt940 = 0;
							this.anInt941 = local14;
							this.anInt942 = local9;
							this.anInt943 = 2;
							if (Class31.method366(local14).anInt420 == this.anInt1039) {
								this.anInt943 = 1;
							}
							if (Class31.method366(local14).anInt420 == this.anInt974) {
								this.anInt943 = 3;
							}
						}
						if (local19 == 636) {
							local870 = this.aClass2_Sub1_Sub1_Sub4_Sub2Array1[local24];
							if (local870 != null) {
								this.method649(aClass2_Sub1_Sub1_Sub4_Sub2_1.anIntArray143[0], this.aByte32, 0, 1, 0, 0, 2, local870.anIntArray144[0], false, aClass2_Sub1_Sub1_Sub4_Sub2_1.anIntArray144[0], 1, local870.anIntArray143[0]);
								this.anInt838 = super.anInt815;
								this.anInt839 = super.anInt816;
								this.anInt841 = 2;
								this.anInt840 = 0;
								this.aClass2_Sub1_Sub3_6.method256(26);
								this.aClass2_Sub1_Sub3_6.method290(local24);
							}
						}
						if (local19 == 895) {
							this.method724(this.anInt856);
							this.anInt856 = -1;
							this.aBoolean225 = true;
						}
						this.anInt884 = 0;
						this.anInt888 = 0;
						this.aBoolean228 = true;
					}
				}
			}
		} catch (@Pc(3560) RuntimeException local3560) {
			signlink.reporterror("11778, " + arg0 + ", " + arg1 + ", " + local3560.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "v", descriptor = "(I)V")
	private void method660(@OriginalArg(0) int arg0) {
		try {
			this.aBoolean206 = true;
			for (@Pc(6) int local6 = 0; local6 < 7; local6++) {
				this.anIntArray260[local6] = -1;
				for (@Pc(15) int local15 = 0; local15 < Class6.anInt91; local15++) {
					if (!Class6.aClass6Array1[local15].aBoolean28 && Class6.aClass6Array1[local15].anInt92 == local6 + (this.aBoolean211 ? 0 : 7)) {
						this.anIntArray260[local6] = local15;
						break;
					}
				}
			}
			@Pc(54) boolean local54 = false;
		} catch (@Pc(56) RuntimeException local56) {
			signlink.reporterror("42448, " + arg0 + ", " + local56.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(II)V")
	private void method661(@OriginalArg(0) int arg0) {
		try {
			signlink.anInt1061 = arg0;
		} catch (@Pc(14) RuntimeException local14) {
			signlink.reporterror("95590, " + arg0 + ", " + 9 + ", " + local14.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "w", descriptor = "(I)V")
	private void method662() {
		try {
			if (aBoolean197 && this.anInt945 == 2 && Class11.anInt211 != this.anInt909) {
				this.method646(null, "Loading - please wait.");
				this.anInt945 = 1;
				this.aLong32 = System.currentTimeMillis();
			}
			if (this.anInt945 == 1) {
				@Pc(34) int local34 = this.method663();
				if (local34 != 0 && System.currentTimeMillis() - this.aLong32 > 360000L) {
					signlink.reporterror(this.aString29 + " glcfb " + this.aLong30 + "," + local34 + "," + aBoolean197 + "," + this.aClass25Array1[0] + "," + this.aClass8_Sub1_1.method140() + "," + this.anInt909 + "," + this.anInt971 + "," + this.anInt972);
					this.aLong32 = System.currentTimeMillis();
				}
			}
			if (this.anInt945 == 2 && this.anInt909 != this.anInt944) {
				this.anInt944 = this.anInt909;
				this.method637(this.anInt909);
			}
		} catch (@Pc(115) RuntimeException local115) {
			signlink.reporterror("63492, " + 0 + ", " + local115.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "x", descriptor = "(I)I")
	private int method663() {
		try {
			for (@Pc(3) int local3 = 0; local3 < this.aByteArrayArray5.length; local3++) {
				if (this.aByteArrayArray5[local3] == null && this.anIntArray270[local3] != -1) {
					return -1;
				}
				if (this.aByteArrayArray6[local3] == null && this.anIntArray271[local3] != -1) {
					return -2;
				}
			}
			this.anInt894 += 0;
			@Pc(45) boolean local45 = true;
			for (@Pc(47) int local47 = 0; local47 < this.aByteArrayArray5.length; local47++) {
				@Pc(54) byte[] local54 = this.aByteArrayArray6[local47];
				if (local54 != null) {
					@Pc(68) int local68 = (this.anIntArray269[local47] >> 8) * 64 - this.anInt874;
					@Pc(80) int local80 = (this.anIntArray269[local47] & 0xFF) * 64 - this.anInt875;
					if (this.aBoolean203) {
						local68 = 10;
						local80 = 10;
					}
					local45 &= Class11.method174(local68, local54, local80);
				}
			}
			if (!local45) {
				return -3;
			} else if (this.aBoolean187) {
				return -4;
			} else {
				this.anInt945 = 2;
				Class11.anInt211 = this.anInt909;
				this.method631();
				this.aClass2_Sub1_Sub3_6.method256(120);
				return 0;
			}
		} catch (@Pc(127) RuntimeException local127) {
			signlink.reporterror("90786, " + 0 + ", " + local127.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(II)V")
	private void method664(@OriginalArg(0) int arg0) {
		try {
			if (!aBoolean197) {
				for (@Pc(12) int local12 = 0; local12 < this.anIntArray264.length; local12++) {
					@Pc(19) int local19 = this.anIntArray264[local12];
					if (Class2_Sub1_Sub2_Sub1.anIntArray11[local19] >= arg0) {
						@Pc(28) Class2_Sub1_Sub2_Sub3 local28 = Class2_Sub1_Sub2_Sub1.aClass2_Sub1_Sub2_Sub3Array1[local19];
						@Pc(36) int local36 = local28.anInt770 * local28.anInt771 - 1;
						@Pc(44) int local44 = local28.anInt770 * this.anInt848 * 2;
						@Pc(47) byte[] local47 = local28.aByteArray19;
						@Pc(50) byte[] local50 = this.aByteArray21;
						for (@Pc(52) int local52 = 0; local52 <= local36; local52++) {
							local50[local52] = local47[local52 - local44 & local36];
						}
						local28.aByteArray19 = local50;
						this.aByteArray21 = local47;
						Class2_Sub1_Sub2_Sub1.method67(local19);
						anInt828++;
						if (anInt828 > 1462) {
							anInt828 = 0;
							this.aClass2_Sub1_Sub3_6.method256(231);
							this.aClass2_Sub1_Sub3_6.method257(0);
							@Pc(99) int local99 = this.aClass2_Sub1_Sub3_6.anInt283;
							if ((int) (Math.random() * 2.0D) == 0) {
								this.aClass2_Sub1_Sub3_6.method258(63214);
							}
							if ((int) (Math.random() * 2.0D) == 0) {
								this.aClass2_Sub1_Sub3_6.method258(14114);
							}
							this.aClass2_Sub1_Sub3_6.method258(16897);
							this.aClass2_Sub1_Sub3_6.method257(71);
							this.aClass2_Sub1_Sub3_6.method257(77);
							this.aClass2_Sub1_Sub3_6.method258((int) (Math.random() * 65536.0D));
							this.aClass2_Sub1_Sub3_6.method257(220);
							this.aClass2_Sub1_Sub3_6.method257(49);
							this.aClass2_Sub1_Sub3_6.method257(45);
							if ((int) (Math.random() * 2.0D) == 0) {
								this.aClass2_Sub1_Sub3_6.method258(59782);
							}
							this.aClass2_Sub1_Sub3_6.method266(this.aClass2_Sub1_Sub3_6.anInt283 - local99);
						}
					}
				}
			}
		} catch (@Pc(174) RuntimeException local174) {
			signlink.reporterror("33009, " + arg0 + ", " + 0 + ", " + local174.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(BLclient!PQPZKUPU;)V")
	private void method665(@OriginalArg(1) Class31 arg0) {
		try {
			@Pc(10) int local10 = arg0.anInt407;
			@Pc(66) int local66;
			if ((local10 < 1 || local10 > 100) && (local10 < 701 || local10 > 800)) {
				if (local10 >= 101 && local10 <= 200 || !(local10 < 801 || local10 > 900)) {
					local66 = this.anInt988;
					if (this.anInt989 != 2) {
						local66 = 0;
					}
					if (local10 > 800) {
						local10 -= 701;
					} else {
						local10 -= 101;
					}
					if (local10 >= local66) {
						arg0.aString11 = "";
						arg0.anInt441 = 0;
					} else {
						if (this.anIntArray227[local10] == 0) {
							arg0.aString11 = "@red@Offline";
						} else if (this.anIntArray227[local10] < 200) {
							if (this.anIntArray227[local10] == anInt906) {
								arg0.aString11 = "@gre@World" + (this.anIntArray227[local10] - 9);
							} else {
								arg0.aString11 = "@yel@World" + (this.anIntArray227[local10] - 9);
							}
						} else if (this.anIntArray227[local10] == anInt906) {
							arg0.aString11 = "@gre@Classic" + (this.anIntArray227[local10] - 219);
						} else {
							arg0.aString11 = "@yel@Classic" + (this.anIntArray227[local10] - 219);
						}
						arg0.anInt441 = 1;
					}
				} else if (local10 == 203) {
					local66 = this.anInt988;
					if (this.anInt989 != 2) {
						local66 = 0;
					}
					arg0.anInt421 = local66 * 15 + 20;
					if (arg0.anInt421 <= arg0.anInt429) {
						arg0.anInt421 = arg0.anInt429 + 1;
					}
				} else if (local10 >= 401 && local10 <= 500) {
					local10 -= 401;
					if (local10 == 0 && this.anInt989 == 0) {
						arg0.aString11 = "Loading ignore list";
						arg0.anInt441 = 0;
					} else if (local10 == 1 && this.anInt989 == 0) {
						arg0.aString11 = "Please wait...";
						arg0.anInt441 = 0;
					} else {
						local66 = this.anInt919;
						if (this.anInt989 == 0) {
							local66 = 0;
						}
						if (local10 >= local66) {
							arg0.aString11 = "";
							arg0.anInt441 = 0;
						} else {
							arg0.aString11 = Class28.method350(Class28.method347(this.aLongArray3[local10]));
							arg0.anInt441 = 1;
						}
					}
				} else if (local10 == 503) {
					arg0.anInt421 = this.anInt919 * 15 + 20;
					if (arg0.anInt421 <= arg0.anInt429) {
						arg0.anInt421 = arg0.anInt429 + 1;
					}
				} else if (local10 == 327) {
					arg0.anInt439 = 150;
					arg0.anInt440 = (int) (Math.sin((double) anInt878 / 40.0D) * 256.0D) & 0x7FF;
					if (this.aBoolean206) {
						for (local66 = 0; local66 < 7; local66++) {
							@Pc(379) int local379 = this.anIntArray260[local66];
							if (local379 >= 0 && !Class6.aClass6Array1[local379].method79()) {
								return;
							}
						}
						this.aBoolean206 = false;
						@Pc(398) Class2_Sub1_Sub1_Sub2[] local398 = new Class2_Sub1_Sub1_Sub2[7];
						@Pc(400) int local400 = 0;
						for (@Pc(402) int local402 = 0; local402 < 7; local402++) {
							@Pc(409) int local409 = this.anIntArray260[local402];
							if (local409 >= 0) {
								local398[local400++] = Class6.aClass6Array1[local409].method80();
							}
						}
						@Pc(431) Class2_Sub1_Sub1_Sub2 local431 = new Class2_Sub1_Sub1_Sub2(local398, 3, local400);
						for (@Pc(433) int local433 = 0; local433 < 5; local433++) {
							if (this.anIntArray263[local433] != 0) {
								local431.method105(anIntArrayArray23[local433][0], anIntArrayArray23[local433][this.anIntArray263[local433]]);
								if (local433 == 1) {
									local431.method105(anIntArray240[0], anIntArray240[this.anIntArray263[local433]]);
								}
							}
						}
						local431.method98();
						local431.method99(257, Class10.aClass10Array1[aClass2_Sub1_Sub1_Sub4_Sub2_1.anInt549].anIntArray68[0]);
						local431.method108(64, 850, -30, -50, -30, true);
						arg0.anInt423 = 5;
						arg0.anInt424 = 0;
						Class31.method368(local431, 787);
					}
				} else if (local10 == 324) {
					if (this.aClass2_Sub1_Sub2_Sub2_5 == null) {
						this.aClass2_Sub1_Sub2_Sub2_5 = arg0.aClass2_Sub1_Sub2_Sub2_2;
						this.aClass2_Sub1_Sub2_Sub2_6 = arg0.aClass2_Sub1_Sub2_Sub2_1;
					}
					if (this.aBoolean211) {
						arg0.aClass2_Sub1_Sub2_Sub2_2 = this.aClass2_Sub1_Sub2_Sub2_6;
					} else {
						arg0.aClass2_Sub1_Sub2_Sub2_2 = this.aClass2_Sub1_Sub2_Sub2_5;
					}
				} else if (local10 == 325) {
					if (this.aClass2_Sub1_Sub2_Sub2_5 == null) {
						this.aClass2_Sub1_Sub2_Sub2_5 = arg0.aClass2_Sub1_Sub2_Sub2_2;
						this.aClass2_Sub1_Sub2_Sub2_6 = arg0.aClass2_Sub1_Sub2_Sub2_1;
					}
					if (this.aBoolean211) {
						arg0.aClass2_Sub1_Sub2_Sub2_2 = this.aClass2_Sub1_Sub2_Sub2_5;
					} else {
						arg0.aClass2_Sub1_Sub2_Sub2_2 = this.aClass2_Sub1_Sub2_Sub2_6;
					}
				} else if (local10 == 600) {
					arg0.aString11 = this.aString23;
					if (anInt878 % 20 < 10) {
						arg0.aString11 = arg0.aString11 + "|";
					} else {
						arg0.aString11 = arg0.aString11 + " ";
					}
				} else {
					if (local10 == 620) {
						if (this.anInt967 < 1) {
							arg0.aString11 = "";
						} else if (this.aBoolean212) {
							arg0.anInt411 = 16711680;
							arg0.aString11 = "Moderator option: Mute player for 48 hours: <ON>";
						} else {
							arg0.anInt411 = 16777215;
							arg0.aString11 = "Moderator option: Mute player for 48 hours: <OFF>";
						}
					}
					@Pc(638) String local638;
					if (local10 == 660) {
						local66 = this.anInt912 - this.anInt893;
						if (local66 <= 0) {
							local638 = "earlier today";
						} else if (local66 == 1) {
							local638 = "yesterday";
						} else {
							local638 = local66 + " days ago";
						}
						arg0.aString11 = "You last logged in @red@" + local638 + "@bla@ from: @red@" + signlink.dns;
					}
					if (local10 == 661) {
						if (this.anInt976 == 0) {
							arg0.aString11 = "\\nYou have not yet set any recovery questions.\\nIt is @lre@strongly@yel@ recommended that you do so.\\n\\nIf you don't you will be @lre@unable to recover your\\n@lre@password@yel@ if you forget it, or it is stolen.";
						} else if (this.anInt976 <= this.anInt912) {
							arg0.aString11 = "\\n\\nRecovery Questions Last Set:\\n@gre@" + this.method666(this.anInt976);
						} else {
							local66 = this.anInt912 + 14 - this.anInt976;
							if (local66 <= 0) {
								local638 = "Earlier today";
							} else if (local66 == 1) {
								local638 = "Yesterday";
							} else {
								local638 = local66 + " days ago";
							}
							arg0.aString11 = local638 + " you requested@lre@ new recovery\\n@lre@questions.@yel@ The requested change will occur\\non: @lre@" + this.method666(this.anInt976) + "\\n\\nIf you do not remember making this request\\ncancel it immediately, and change your password.";
						}
					}
					if (local10 == 662) {
						@Pc(756) String local756;
						if (this.anInt984 == 0) {
							local756 = "@yel@0 unread messages";
						} else if (this.anInt984 == 1) {
							local756 = "@gre@1 unread message";
						} else {
							local756 = "@gre@" + this.anInt984 + " unread messages";
						}
						arg0.aString11 = "You have " + local756 + "\\nin your message centre.";
					}
					if (local10 == 663) {
						if (this.anInt953 > 0 && this.anInt953 <= this.anInt912 + 10) {
							arg0.aString11 = "Last password change:\\n@gre@" + this.method666(this.anInt953);
						} else {
							arg0.aString11 = "Last password change:\\n@gre@Never changed";
						}
					}
					if (local10 == 665) {
						if (this.anInt975 > 2 && !aBoolean196) {
							arg0.aString11 = "This is a non-members\\nworld. To enjoy your\\nmembers benefits we\\nrecommend you play on a\\nmembers world instead.";
						} else if (this.anInt975 > 2) {
							arg0.aString11 = "\\n\\nYou have @gre@" + this.anInt975 + "@yel@ days of\\nmember credit remaining.";
						} else if (this.anInt975 > 0) {
							arg0.aString11 = "You have @gre@" + this.anInt975 + "@yel@ days of\\nmember credit remaining.\\n\\n@lre@Credit low! Renew now\\n@lre@to avoid losing members.";
						} else {
							arg0.aString11 = "You are not a member.\\n\\nChoose to subscribe and\\nyou'll get loads of extra\\nbenefits and features.";
						}
					}
					if (local10 == 667) {
						if (this.anInt975 > 2 && !aBoolean196) {
							arg0.aString11 = "To switch to a members-only world:\\n1) Logout and return to the world selection page.\\n2) Choose one of the members world with a gold star next to it's name.\\n\\nIf you prefer you can continue to use this world,\\nbut members only features will be unavailable here.";
						} else if (this.anInt975 > 0) {
							arg0.aString11 = "To extend or cancel a subscription:\\n1) Logout and return to the frontpage of this website.\\n2)Choose the relevant option from the 'membership' section.\\n\\nNote: If you are a credit card subscriber a top-up payment will\\nautomatically be taken when 3 days credit remain.\\n(unless you cancel your subscription, which can be done at any time.)";
						} else {
							arg0.aString11 = "To start a subscripton:\\n1) Logout and return to the frontpage of this website.\\n2) Choose 'Start a new subscription'";
						}
					}
					if (local10 == 668) {
						if (this.anInt976 > this.anInt912) {
							arg0.aString11 = "To cancel this request:\\n1) Logout and return to the frontpage of this website.\\n2) Choose 'Cancel recovery questions'.";
						} else {
							arg0.aString11 = "To change your recovery questions:\\n1) Logout and return to the frontpage of this website.\\n2) Choose 'Set new recovery questions'.";
						}
					}
				}
			} else if (local10 == 1 && this.anInt989 == 0) {
				arg0.aString11 = "Loading friend list";
				arg0.anInt441 = 0;
			} else if (local10 == 1 && this.anInt989 == 1) {
				arg0.aString11 = "Connecting to friendserver";
				arg0.anInt441 = 0;
			} else if (local10 == 2 && this.anInt989 != 2) {
				arg0.aString11 = "Please wait...";
				arg0.anInt441 = 0;
			} else {
				local66 = this.anInt988;
				if (this.anInt989 != 2) {
					local66 = 0;
				}
				if (local10 > 700) {
					local10 -= 601;
				} else {
					local10--;
				}
				if (local10 >= local66) {
					arg0.aString11 = "";
					arg0.anInt441 = 0;
				} else {
					arg0.aString11 = this.aStringArray10[local10];
					arg0.anInt441 = 1;
				}
			}
		} catch (@Pc(913) RuntimeException local913) {
			signlink.reporterror("71199, " + -22 + ", " + arg0 + ", " + local913.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(IB)Ljava/lang/String;")
	private String method666(@OriginalArg(0) int arg0) {
		try {
			if (arg0 > this.anInt912 + 10) {
				return "Unknown";
			}
			@Pc(14) long local14 = ((long) arg0 + 11745L) * 86400000L;
			@Pc(27) Calendar local27 = Calendar.getInstance();
			local27.setTime(new Date(local14));
			@Pc(37) int local37 = local27.get(5);
			@Pc(41) int local41 = local27.get(2);
			@Pc(45) int local45 = local27.get(1);
			@Pc(96) String[] local96 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };
			return local37 + "-" + local96[local41] + "-" + local45;
		} catch (@Pc(114) RuntimeException local114) {
			signlink.reporterror("85455, " + arg0 + ", " + 6 + ", " + local114.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!SOKVSBIO;IBII)V")
	private void method668(@OriginalArg(0) Class2_Sub1_Sub1_Sub4_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		try {
			if (arg0 != aClass2_Sub1_Sub1_Sub4_Sub2_1 && this.anInt849 < 400) {
				@Pc(35) String local35;
				if (arg0.anInt595 == 0) {
					local35 = arg0.aString14 + method594(arg0.anInt581, aClass2_Sub1_Sub1_Sub4_Sub2_1.anInt581) + " (level-" + arg0.anInt581 + ")";
				} else {
					local35 = arg0.aString14 + " (skill-" + arg0.anInt595 + ")";
				}
				@Pc(165) int local165;
				if (this.anInt884 == 1) {
					this.aStringArray14[this.anInt849] = "Use " + this.aString21 + " with @whi@" + local35;
					this.anIntArray235[this.anInt849] = 964;
					this.anIntArray236[this.anInt849] = arg3;
					this.anIntArray233[this.anInt849] = arg1;
					this.anIntArray234[this.anInt849] = arg2;
					this.anInt849++;
				} else if (this.anInt888 != 1) {
					for (local165 = 4; local165 >= 0; local165--) {
						if (this.aStringArray13[local165] != null) {
							this.aStringArray14[this.anInt849] = this.aStringArray13[local165] + " @whi@" + local35;
							@Pc(192) short local192 = 0;
							if (this.aStringArray13[local165].equalsIgnoreCase("attack")) {
								if (arg0.anInt581 > aClass2_Sub1_Sub1_Sub4_Sub2_1.anInt581) {
									local192 = 2000;
								}
								if (aClass2_Sub1_Sub1_Sub4_Sub2_1.anInt590 != 0 && arg0.anInt590 != 0) {
									if (aClass2_Sub1_Sub1_Sub4_Sub2_1.anInt590 == arg0.anInt590) {
										local192 = 2000;
									} else {
										local192 = 0;
									}
								}
							} else if (this.aBooleanArray11[local165]) {
								local192 = 2000;
							}
							if (local165 == 0) {
								this.anIntArray235[this.anInt849] = local192 + 85;
							}
							if (local165 == 1) {
								this.anIntArray235[this.anInt849] = local192 + 72;
							}
							if (local165 == 2) {
								this.anIntArray235[this.anInt849] = local192 + 262;
							}
							if (local165 == 3) {
								this.anIntArray235[this.anInt849] = local192 + 636;
							}
							if (local165 == 4) {
								this.anIntArray235[this.anInt849] = local192 + 716;
							}
							this.anIntArray236[this.anInt849] = arg3;
							this.anIntArray233[this.anInt849] = arg1;
							this.anIntArray234[this.anInt849] = arg2;
							this.anInt849++;
						}
					}
				} else if ((this.anInt890 & 0x8) == 8) {
					this.aStringArray14[this.anInt849] = this.aString22 + " @whi@" + local35;
					this.anIntArray235[this.anInt849] = 114;
					this.anIntArray236[this.anInt849] = arg3;
					this.anIntArray233[this.anInt849] = arg1;
					this.anIntArray234[this.anInt849] = arg2;
					this.anInt849++;
				}
				for (local165 = 0; local165 < this.anInt849; local165++) {
					if (this.anIntArray235[local165] == 158) {
						this.aStringArray14[local165] = "Walk here @whi@" + local35;
						break;
					}
				}
			}
		} catch (@Pc(351) RuntimeException local351) {
			signlink.reporterror("44968, " + arg0 + ", " + arg1 + ", " + -49 + ", " + arg2 + ", " + arg3 + ", " + local351.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIB)I")
	private int method669(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte arg3) {
		try {
			@Pc(3) int local3 = 256 - arg2;
			if (arg3 != this.aByte35) {
				this.anInt895 = -1;
			}
			return ((arg0 & 0xFF00FF) * local3 + (arg1 & 0xFF00FF) * arg2 & 0xFF00FF00) + ((arg0 & 0xFF00) * local3 + (arg1 & 0xFF00) * arg2 & 0xFF0000) >> 8;
		} catch (@Pc(41) RuntimeException local41) {
			signlink.reporterror("36740, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local41.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "z", descriptor = "(I)V")
	private void method670() {
		try {
			if (this.anInt927 == 2) {
				this.method619(142, (this.anInt935 - this.anInt875 << 7) + this.anInt938, this.anInt936 * 2, (this.anInt934 - this.anInt874 << 7) + this.anInt937);
				if (this.anInt882 > -1 && anInt878 % 20 < 10) {
					this.aClass2_Sub1_Sub2_Sub2Array8[0].method482(this.anInt882 - 12, this.anInt883 - 28);
				}
			}
		} catch (@Pc(62) RuntimeException local62) {
			signlink.reporterror("10868, " + 831 + ", " + local62.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!LBBVYYXO;BI)V")
	private void method671(@OriginalArg(0) Class2_Sub1_Sub3 arg0, @OriginalArg(2) int arg1) {
		try {
			@Pc(23) int local23;
			@Pc(30) int local30;
			@Pc(33) int local33;
			@Pc(36) int local36;
			@Pc(39) int local39;
			@Pc(14) int local14;
			if (arg1 == 193) {
				local14 = arg0.method267();
				local23 = this.anInt1007 + (local14 >> 4 & 0x7);
				local30 = this.anInt1008 + (local14 & 0x7);
				local33 = arg0.method269();
				local36 = arg0.method269();
				local39 = arg0.method269();
				if (local23 >= 0 && local30 >= 0 && local23 < 104 && local30 < 104) {
					@Pc(59) Class29 local59 = this.aClass29ArrayArrayArray1[this.anInt909][local23][local30];
					if (local59 != null) {
						for (@Pc(65) Class2_Sub1_Sub1_Sub6 local65 = (Class2_Sub1_Sub1_Sub6) local59.method355(); local65 != null; local65 = (Class2_Sub1_Sub1_Sub6) local59.method357()) {
							if (local65.anInt600 == (local33 & 0x7FFF) && local65.anInt601 == local36) {
								local65.anInt601 = local39;
								break;
							}
						}
						this.method690(local23, local30);
					}
				}
			} else {
				@Pc(148) Class2_Sub1_Sub1_Sub6 local148;
				if (arg1 == 209) {
					local14 = arg0.method287();
					local23 = this.anInt1007 + (local14 >> 4 & 0x7);
					local30 = this.anInt1008 + (local14 & 0x7);
					local33 = arg0.method295(this.aBoolean208);
					if (local23 >= 0 && local30 >= 0 && local23 < 104 && local30 < 104) {
						@Pc(142) Class29 local142 = this.aClass29ArrayArrayArray1[this.anInt909][local23][local30];
						if (local142 != null) {
							for (local148 = (Class2_Sub1_Sub1_Sub6) local142.method355(); local148 != null; local148 = (Class2_Sub1_Sub1_Sub6) local142.method357()) {
								if (local148.anInt600 == (local33 & 0x7FFF)) {
									local148.method573();
									break;
								}
							}
							if (local142.method355() == null) {
								this.aClass29ArrayArrayArray1[this.anInt909][local23][local30] = null;
							}
							this.method690(local23, local30);
						}
					}
				} else {
					@Pc(233) int local233;
					@Pc(236) int local236;
					@Pc(242) int local242;
					@Pc(245) int local245;
					@Pc(223) int local223;
					@Pc(228) int local228;
					@Pc(239) int local239;
					if (arg1 == 98) {
						local14 = arg0.method267();
						local23 = this.anInt1007 + (local14 >> 4 & 0x7);
						local30 = this.anInt1008 + (local14 & 0x7);
						local33 = local23 + arg0.method268();
						local36 = local30 + arg0.method268();
						local39 = arg0.method270();
						local223 = arg0.method269();
						local228 = arg0.method267() * 4;
						local233 = arg0.method267() * 4;
						local236 = arg0.method269();
						local239 = arg0.method269();
						local242 = arg0.method267();
						local245 = arg0.method267();
						if (local23 >= 0 && local30 >= 0 && local23 < 104 && local30 < 104 && local33 >= 0 && local36 >= 0 && local33 < 104 && local36 < 104 && local223 != 65535) {
							local23 = local23 * 128 + 64;
							local30 = local30 * 128 + 64;
							local33 = local33 * 128 + 64;
							local36 = local36 * 128 + 64;
							@Pc(321) Class2_Sub1_Sub1_Sub5 local321 = new Class2_Sub1_Sub1_Sub5(this.anInt909, local23, local233, local223, local236 + anInt878, (byte) 5, this.method717(local23, this.anInt909, local30) - local228, local30, local239 + anInt878, local242, local39, local245);
							local321.method344(local36, local33, this.method717(local33, this.anInt909, local36) - local233, local236 + anInt878);
							this.aClass29_11.method352(local321);
						}
					} else if (arg1 == 252) {
						local14 = arg0.method285();
						local23 = this.anInt1007 + (local14 >> 4 & 0x7);
						local30 = this.anInt1008 + (local14 & 0x7);
						local33 = arg0.method293();
						local36 = arg0.method294();
						if (local23 >= 0 && local30 >= 0 && local23 < 104 && local30 < 104) {
							local148 = new Class2_Sub1_Sub1_Sub6();
							local148.anInt600 = local33;
							local148.anInt601 = local36;
							if (this.aClass29ArrayArrayArray1[this.anInt909][local23][local30] == null) {
								this.aClass29ArrayArrayArray1[this.anInt909][local23][local30] = new Class29(0);
							}
							this.aClass29ArrayArrayArray1[this.anInt909][local23][local30].method352(local148);
							this.method690(local23, local30);
						}
					} else if (arg1 == 253) {
						local14 = arg0.method286();
						local23 = local14 >> 2;
						local30 = local14 & 0x3;
						local33 = this.anIntArray245[local23];
						local36 = arg0.method285();
						local39 = this.anInt1007 + (local36 >> 4 & 0x7);
						local223 = this.anInt1008 + (local36 & 0x7);
						if (local39 >= 0 && local223 >= 0 && local39 < 104 && local223 < 104) {
							this.method648(local223, local39, local23, -1, -1, this.anInt909, local30, 0, local33);
						}
					} else if (arg1 == 93) {
						local14 = arg0.method293();
						local23 = arg0.method286();
						local30 = this.anInt1007 + (local23 >> 4 & 0x7);
						local33 = this.anInt1008 + (local23 & 0x7);
						local36 = arg0.method269();
						local39 = arg0.method293();
						if (local30 >= 0 && local33 >= 0 && local30 < 104 && local33 < 104 && local39 != this.anInt1006) {
							@Pc(549) Class2_Sub1_Sub1_Sub6 local549 = new Class2_Sub1_Sub1_Sub6();
							local549.anInt600 = local14;
							local549.anInt601 = local36;
							if (this.aClass29ArrayArrayArray1[this.anInt909][local30][local33] == null) {
								this.aClass29ArrayArrayArray1[this.anInt909][local30][local33] = new Class29(0);
							}
							this.aClass29ArrayArrayArray1[this.anInt909][local30][local33].method352(local549);
							this.method690(local30, local33);
						}
					} else {
						@Pc(716) int local716;
						if (arg1 == 31) {
							local14 = arg0.method267();
							local23 = this.anInt1007 + (local14 >> 4 & 0x7);
							local30 = this.anInt1008 + (local14 & 0x7);
							local33 = arg0.method295(this.aBoolean208);
							local36 = arg0.method286();
							local39 = local36 >> 2;
							local223 = local36 & 0x3;
							local228 = this.anIntArray245[local39];
							if (local23 >= 0 && local30 >= 0 && local23 < 103 && local30 < 103) {
								local233 = this.anIntArrayArrayArray7[this.anInt909][local23][local30];
								local236 = this.anIntArrayArrayArray7[this.anInt909][local23 + 1][local30];
								local239 = this.anIntArrayArrayArray7[this.anInt909][local23 + 1][local30 + 1];
								local242 = this.anIntArrayArrayArray7[this.anInt909][local23][local30 + 1];
								if (local228 == 0) {
									@Pc(707) Class16 local707 = this.aClass34_1.method398(local30, (byte) 4, this.anInt909, local23);
									if (local707 != null) {
										local716 = local707.anInt249 >> 14 & 0x7FFF;
										if (local39 == 2) {
											local707.aClass2_Sub1_Sub1_1 = new Class2_Sub1_Sub1_Sub3(local236, local33, local242, local223 + 4, local233, 2, false, local716, local239, false);
											local707.aClass2_Sub1_Sub1_2 = new Class2_Sub1_Sub1_Sub3(local236, local33, local242, local223 + 1 & 0x3, local233, 2, false, local716, local239, false);
										} else {
											local707.aClass2_Sub1_Sub1_1 = new Class2_Sub1_Sub1_Sub3(local236, local33, local242, local223, local233, local39, false, local716, local239, false);
										}
									}
								}
								if (local228 == 1) {
									@Pc(784) Class40 local784 = this.aClass34_1.method399(this.anInt909, local23, local30);
									if (local784 != null) {
										local784.aClass2_Sub1_Sub1_4 = new Class2_Sub1_Sub1_Sub3(local236, local33, local242, 0, local233, 4, false, local784.anInt618 >> 14 & 0x7FFF, local239, false);
									}
								}
								if (local228 == 2) {
									@Pc(818) Class47 local818 = this.aClass34_1.method400(local30, this.anInt909, local23);
									if (local39 == 11) {
										local39 = 10;
									}
									if (local818 != null) {
										local818.aClass2_Sub1_Sub1_8 = new Class2_Sub1_Sub1_Sub3(local236, local33, local242, local223, local233, local39, false, local818.anInt715 >> 14 & 0x7FFF, local239, false);
									}
								}
								if (local228 == 3) {
									@Pc(858) Class30 local858 = this.aClass34_1.method401(this.aByte47, local23, local30, this.anInt909);
									if (local858 != null) {
										local858.aClass2_Sub1_Sub1_3 = new Class2_Sub1_Sub1_Sub3(local236, local33, local242, local223, local233, 22, false, local858.anInt403 >> 14 & 0x7FFF, local239, false);
									}
								}
							}
						} else {
							if (arg1 == 206) {
								@Pc(888) byte local888 = arg0.method288();
								local23 = arg0.method286();
								local30 = local23 >> 2;
								local33 = local23 & 0x3;
								local36 = this.anIntArray245[local30];
								local39 = arg0.method269();
								@Pc(912) byte local912 = arg0.method289();
								@Pc(916) byte local916 = arg0.method289();
								local233 = arg0.method293();
								local236 = arg0.method269();
								@Pc(927) byte local927 = arg0.method288();
								local242 = arg0.method286();
								local245 = this.anInt1007 + (local242 >> 4 & 0x7);
								local716 = this.anInt1008 + (local242 & 0x7);
								@Pc(950) int local950 = arg0.method269();
								@Pc(956) Class2_Sub1_Sub1_Sub4_Sub2 local956;
								if (local233 == this.anInt1006) {
									local956 = aClass2_Sub1_Sub1_Sub4_Sub2_1;
								} else {
									local956 = this.aClass2_Sub1_Sub1_Sub4_Sub2Array1[local233];
								}
								if (local956 != null) {
									@Pc(968) Class24 local968 = Class24.method307(local236);
									@Pc(978) int local978 = this.anIntArrayArrayArray7[this.anInt909][local245][local716];
									@Pc(990) int local990 = this.anIntArrayArrayArray7[this.anInt909][local245 + 1][local716];
									@Pc(1004) int local1004 = this.anIntArrayArrayArray7[this.anInt909][local245 + 1][local716 + 1];
									@Pc(1016) int local1016 = this.anIntArrayArrayArray7[this.anInt909][local245][local716 + 1];
									@Pc(1026) Class2_Sub1_Sub1_Sub2 local1026 = local968.method317(local30, local33, local978, local990, local1004, local1016, -1);
									if (local1026 != null) {
										this.method648(local716, local245, 0, -1, local39 + 1, this.anInt909, 0, local950 + 1, local36);
										local956.anInt588 = local950 + anInt878;
										local956.anInt589 = local39 + anInt878;
										local956.aClass2_Sub1_Sub1_Sub2_2 = local1026;
										@Pc(1061) int local1061 = local968.anInt306;
										@Pc(1064) int local1064 = local968.anInt314;
										if (local33 == 1 || local33 == 3) {
											local1061 = local968.anInt314;
											local1064 = local968.anInt306;
										}
										local956.anInt582 = local245 * 128 + local1061 * 64;
										local956.anInt584 = local716 * 128 + local1064 * 64;
										local956.anInt583 = this.method717(local956.anInt582, this.anInt909, local956.anInt584);
										@Pc(1110) byte local1110;
										if (local888 > local912) {
											local1110 = local888;
											local888 = local912;
											local912 = local1110;
										}
										if (local916 > local927) {
											local1110 = local916;
											local916 = local927;
											local927 = local1110;
										}
										local956.anInt591 = local245 + local888;
										local956.anInt593 = local245 + local912;
										local956.anInt592 = local716 + local916;
										local956.anInt594 = local716 + local927;
									}
								}
							}
							if (arg1 == 122) {
								local14 = arg0.method287();
								local23 = this.anInt1007 + (local14 >> 4 & 0x7);
								local30 = this.anInt1008 + (local14 & 0x7);
								local33 = arg0.method267();
								local36 = local33 >> 2;
								local39 = local33 & 0x3;
								local223 = this.anIntArray245[local36];
								local228 = arg0.method295(this.aBoolean208);
								if (local23 >= 0 && local30 >= 0 && local23 < 104 && local30 < 104) {
									this.method648(local30, local23, local36, local228, -1, this.anInt909, local39, 0, local223);
								}
							} else {
								if (arg1 == 46) {
									local14 = arg0.method267();
									local23 = this.anInt1007 + (local14 >> 4 & 0x7);
									local30 = this.anInt1008 + (local14 & 0x7);
									local33 = arg0.method269();
									local36 = arg0.method267();
									local39 = local36 >> 4 & 0xF;
									local223 = local36 & 0x7;
									if (aClass2_Sub1_Sub1_Sub4_Sub2_1.anIntArray143[0] >= local23 - local39 && aClass2_Sub1_Sub1_Sub4_Sub2_1.anIntArray143[0] <= local23 + local39 && aClass2_Sub1_Sub1_Sub4_Sub2_1.anIntArray144[0] >= local30 - local39 && aClass2_Sub1_Sub1_Sub4_Sub2_1.anIntArray144[0] <= local30 + local39 && this.aBoolean210 && !aBoolean197 && this.anInt995 < 50) {
										this.anIntArray242[this.anInt995] = local33;
										this.anIntArray258[this.anInt995] = local223;
										this.anIntArray261[this.anInt995] = Class27.anIntArray108[local33];
										this.anInt995++;
									}
								}
								if (arg1 == 187) {
									local14 = arg0.method267();
									local23 = this.anInt1007 + (local14 >> 4 & 0x7);
									local30 = this.anInt1008 + (local14 & 0x7);
									local33 = arg0.method269();
									local36 = arg0.method267();
									local39 = arg0.method269();
									if (local23 >= 0 && local30 >= 0 && local23 < 104 && local30 < 104) {
										local23 = local23 * 128 + 64;
										local30 = local30 * 128 + 64;
										@Pc(1390) Class2_Sub1_Sub1_Sub1 local1390 = new Class2_Sub1_Sub1_Sub1(7, local23, local39, local30, this.anInt909, this.method717(local23, this.anInt909, local30) - local36, local33, anInt878);
										this.aClass29_12.method352(local1390);
									}
								}
							}
						}
					}
				}
			}
		} catch (@Pc(1396) RuntimeException local1396) {
			signlink.reporterror("42683, " + arg0 + ", " + -121 + ", " + arg1 + ", " + local1396.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILjava/lang/String;ZIILjava/lang/String;)Lclient!FUZJMGZB;")
	private Class13 method672(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) String arg4) {
		try {
			@Pc(3) byte[] local3 = null;
			@Pc(5) int local5 = 5;
			try {
				if (this.aClass25Array1[0] != null) {
					local3 = this.aClass25Array1[0].method318(arg3);
				}
			} catch (@Pc(20) Exception local20) {
			}
			@Pc(34) int local34;
			if (local3 != null) {
				this.aCRC32_2.reset();
				this.aCRC32_2.update(local3);
				local34 = (int) this.aCRC32_2.getValue();
				if (local34 != arg2) {
					local3 = null;
				}
			}
			if (local3 != null) {
				return new Class13(0, local3);
			}
			local34 = 0;
			while (local3 == null) {
				@Pc(55) String local55 = "Unknown error";
				this.method587(arg0, "Requesting " + arg1);
				@Pc(70) int local70;
				try {
					local70 = 0;
					@Pc(81) DataInputStream local81 = this.method588(arg4 + arg2);
					@Pc(84) byte[] local84 = new byte[6];
					local81.readFully(local84, 0, 6);
					@Pc(95) Class2_Sub1_Sub3 local95 = new Class2_Sub1_Sub3((byte) 114, local84);
					local95.anInt283 = 3;
					@Pc(103) int local103 = local95.method271() + 6;
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
							this.method587(arg0, "Loading " + arg1 + " - " + local168 + "%");
						}
						local70 = local168;
					}
					local81.close();
					try {
						if (this.aClass25Array1[0] != null) {
							this.aClass25Array1[0].method319(local3, arg3, local3.length);
						}
					} catch (@Pc(213) Exception local213) {
						this.aClass25Array1[0] = null;
					}
					if (local3 != null) {
						this.aCRC32_2.reset();
						this.aCRC32_2.update(local3);
						local128 = (int) this.aCRC32_2.getValue();
						if (local128 != arg2) {
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
							this.method587(arg0, "Game updated - please reload page");
							local70 = 10;
						} else {
							this.method587(arg0, local55 + " - Retrying in " + local70);
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
					this.aBoolean223 = !this.aBoolean223;
				}
			}
			@Pc(349) Class13 local349 = new Class13(0, local3);
			this.aBoolean204 &= true;
			return local349;
		} catch (@Pc(358) RuntimeException local358) {
			signlink.reporterror("6469, " + arg0 + ", " + arg1 + ", " + true + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local358.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILclient!PQPZKUPU;)Z")
	private boolean method673(@OriginalArg(1) Class31 arg0) {
		try {
			@Pc(10) int local10 = arg0.anInt407;
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
				this.aStringArray14[this.anInt849] = "Remove @whi@" + this.aStringArray10[local10];
				this.anIntArray235[this.anInt849] = 760;
				this.anInt849++;
				this.aStringArray14[this.anInt849] = "Message @whi@" + this.aStringArray10[local10];
				this.anIntArray235[this.anInt849] = 678;
				this.anInt849++;
				return true;
			} else if (local10 >= 401 && local10 <= 500) {
				this.aStringArray14[this.anInt849] = "Remove @whi@" + arg0.aString11;
				this.anIntArray235[this.anInt849] = 831;
				this.anInt849++;
				return true;
			} else {
				return false;
			}
		} catch (@Pc(133) RuntimeException local133) {
			signlink.reporterror("42424, " + 46001 + ", " + arg0 + ", " + local133.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ZIII)Z")
	private boolean method674(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		try {
			@Pc(7) int local7 = arg1 >> 14 & 0x7FFF;
			this.aBoolean204 &= true;
			@Pc(22) int local22 = this.aClass34_1.method406(this.anInt909, arg0, arg2, arg1);
			if (local22 == -1) {
				return false;
			}
			@Pc(31) int local31 = local22 & 0x1F;
			@Pc(37) int local37 = local22 >> 6 & 0x3;
			anInt1018++;
			if (anInt1018 > 76) {
				anInt1018 = 0;
				this.aClass2_Sub1_Sub3_6.method256(97);
			}
			if (local31 == 10 || local31 == 11 || local31 == 22) {
				@Pc(63) Class24 local63 = Class24.method307(local7);
				@Pc(71) int local71;
				@Pc(74) int local74;
				if (local37 == 0 || local37 == 2) {
					local71 = local63.anInt306;
					local74 = local63.anInt314;
				} else {
					local71 = local63.anInt314;
					local74 = local63.anInt306;
				}
				@Pc(85) int local85 = local63.anInt315;
				if (local37 != 0) {
					local85 = (local85 << local37 & 0xF) + (local85 >> 4 - local37);
				}
				this.method649(aClass2_Sub1_Sub1_Sub4_Sub2_1.anIntArray143[0], this.aByte32, 0, local74, 0, local85, 2, arg2, false, aClass2_Sub1_Sub1_Sub4_Sub2_1.anIntArray144[0], local71, arg0);
			} else {
				this.method649(aClass2_Sub1_Sub1_Sub4_Sub2_1.anIntArray143[0], this.aByte32, local37, 0, local31 + 1, 0, 2, arg2, false, aClass2_Sub1_Sub1_Sub4_Sub2_1.anIntArray144[0], 0, arg0);
			}
			this.anInt838 = super.anInt815;
			this.anInt839 = super.anInt816;
			this.anInt841 = 2;
			this.anInt840 = 0;
			return true;
		} catch (@Pc(164) RuntimeException local164) {
			signlink.reporterror("43583, " + true + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local164.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(BJ)V")
	private void method675(@OriginalArg(1) long arg0) {
		try {
			if (arg0 != 0L) {
				for (@Pc(8) int local8 = 0; local8 < this.anInt988; local8++) {
					if (this.aLongArray4[local8] == arg0) {
						this.anInt988--;
						this.aBoolean228 = true;
						for (@Pc(28) int local28 = local8; local28 < this.anInt988; local28++) {
							this.aStringArray10[local28] = this.aStringArray10[local28 + 1];
							this.anIntArray227[local28] = this.anIntArray227[local28 + 1];
							this.aLongArray4[local28] = this.aLongArray4[local28 + 1];
						}
						this.aClass2_Sub1_Sub3_6.method256(25);
						this.aClass2_Sub1_Sub3_6.method263(arg0);
						break;
					}
				}
			}
		} catch (@Pc(91) RuntimeException local91) {
			signlink.reporterror("89893, " + 117 + ", " + arg0 + ", " + local91.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "i", descriptor = "(B)V")
	private void method676() {
		try {
			@Pc(8) int local8 = 5;
			this.anIntArray257[8] = 0;
			@Pc(15) int local15 = 0;
			while (this.anIntArray257[8] == 0) {
				@Pc(19) String local19 = "Unknown problem";
				this.method587(20, "Connecting to web server");
				try {
					@Pc(41) DataInputStream local41 = this.method588("crc" + (int) (Math.random() * 9.9999999E7D) + "-" + 356);
					@Pc(48) Class2_Sub1_Sub3 local48 = new Class2_Sub1_Sub3((byte) 114, new byte[40]);
					local41.readFully(local48.aByteArray7, 0, 40);
					local41.close();
					for (@Pc(58) int local58 = 0; local58 < 9; local58++) {
						this.anIntArray257[local58] = local48.method272();
					}
					@Pc(73) int local73 = local48.method272();
					@Pc(75) int local75 = 1234;
					for (@Pc(77) int local77 = 0; local77 < 9; local77++) {
						local75 = (local75 << 1) + this.anIntArray257[local77];
					}
					if (local73 != local75) {
						local19 = "checksum problem";
						this.anIntArray257[8] = 0;
					}
				} catch (@Pc(104) EOFException local104) {
					local19 = "EOF problem";
					this.anIntArray257[8] = 0;
				} catch (@Pc(113) IOException local113) {
					local19 = "connection problem";
					this.anIntArray257[8] = 0;
				} catch (@Pc(122) Exception local122) {
					local19 = "logic problem";
					this.anIntArray257[8] = 0;
					if (!signlink.reporterror) {
						return;
					}
				}
				if (this.anIntArray257[8] == 0) {
					local15++;
					for (@Pc(140) int local140 = local8; local140 > 0; local140--) {
						if (local15 >= 10) {
							this.method587(10, "Game updated - please reload page");
							local140 = 10;
						} else {
							this.method587(10, local19 + " - Will retry in " + local140 + " secs.");
						}
						try {
							Thread.sleep(1000L);
						} catch (@Pc(174) Exception local174) {
						}
					}
					local8 *= 2;
					if (local8 > 60) {
						local8 = 60;
					}
					this.aBoolean223 = !this.aBoolean223;
				}
			}
		} catch (@Pc(202) RuntimeException local202) {
			signlink.reporterror("47392, " + -41 + ", " + local202.toString());
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
				return new URL("http://127.0.0.1:" + (anInt907 + 80));
			}
		} catch (@Pc(21) Exception local21) {
		}
		return super.getCodeBase();
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!ZQSBFHWZ;I)V")
	private void method677(@OriginalArg(0) Class2_Sub1_Sub2_Sub3 arg0) {
		try {
			for (@Pc(5) int local5 = 0; local5 < this.anIntArray237.length; local5++) {
				this.anIntArray237[local5] = 0;
			}
			@Pc(30) int local30;
			for (@Pc(20) int local20 = 0; local20 < 5000; local20++) {
				local30 = (int) (Math.random() * 128.0D * (double) 256);
				this.anIntArray237[local30] = (int) (Math.random() * 256.0D);
			}
			@Pc(48) int local48;
			@Pc(52) int local52;
			@Pc(60) int local60;
			for (local30 = 0; local30 < 20; local30++) {
				for (local48 = 1; local48 < 255; local48++) {
					for (local52 = 1; local52 < 127; local52++) {
						local60 = local52 + (local48 << 7);
						this.anIntArray238[local60] = (this.anIntArray237[local60 - 1] + this.anIntArray237[local60 + 1] + this.anIntArray237[local60 - 128] + this.anIntArray237[local60 + 128]) / 4;
					}
				}
				@Pc(106) int[] local106 = this.anIntArray237;
				this.anIntArray237 = this.anIntArray238;
				this.anIntArray238 = local106;
			}
			if (arg0 != null) {
				local48 = 0;
				for (local52 = 0; local52 < arg0.anInt771; local52++) {
					for (local60 = 0; local60 < arg0.anInt770; local60++) {
						if (arg0.aByteArray19[local48++] != 0) {
							@Pc(149) int local149 = local60 + arg0.anInt772 + 16;
							@Pc(156) int local156 = local52 + arg0.anInt773 + 16;
							@Pc(162) int local162 = local149 + (local156 << 7);
							this.anIntArray237[local162] = 0;
						}
					}
				}
			}
		} catch (@Pc(179) RuntimeException local179) {
			signlink.reporterror("74961, " + arg0 + ", " + 0 + ", " + local179.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "A", descriptor = "(I)V")
	private void method678() {
		try {
			this.aClass17_22.method195();
			@Pc(23) int local23;
			@Pc(25) int local25;
			if (this.anInt1030 == 2) {
				@Pc(18) byte[] local18 = this.aClass2_Sub1_Sub2_Sub3_14.aByteArray19;
				@Pc(20) int[] local20 = Class2_Sub1_Sub2.anIntArray204;
				local23 = local18.length;
				for (local25 = 0; local25 < local23; local25++) {
					if (local18[local25] == 0) {
						local20[local25] = 0;
					}
				}
				this.aClass2_Sub1_Sub2_Sub2_3.method486(this.anInt822, 25, 33, 256, this.anIntArray256, 0, this.anIntArray226, 33, 25, 0);
				this.aClass17_23.method195();
				Class2_Sub1_Sub2_Sub1.anIntArray9 = this.anIntArray267;
			} else {
				@Pc(72) int local72 = this.anInt822 + this.anInt1012 & 0x7FF;
				@Pc(79) int local79 = aClass2_Sub1_Sub1_Sub4_Sub2_1.anInt541 / 32 + 48;
				local23 = 464 - aClass2_Sub1_Sub1_Sub4_Sub2_1.anInt542 / 32;
				this.aClass2_Sub1_Sub2_Sub2_4.method486(local72, local23, 151, this.anInt1032 + 256, this.anIntArray272, 5, this.anIntArray221, 146, local79, 25);
				this.aClass2_Sub1_Sub2_Sub2_3.method486(this.anInt822, 25, 33, 256, this.anIntArray256, 0, this.anIntArray226, 33, 25, 0);
				for (local25 = 0; local25 < this.anInt1036; local25++) {
					local79 = this.anIntArray274[local25] * 4 + 2 - aClass2_Sub1_Sub1_Sub4_Sub2_1.anInt541 / 32;
					local23 = this.anIntArray275[local25] * 4 + 2 - aClass2_Sub1_Sub1_Sub4_Sub2_1.anInt542 / 32;
					this.method700(local79, this.aBoolean186, local23, this.aClass2_Sub1_Sub2_Sub2Array9[local25]);
				}
				@Pc(175) int local175;
				for (@Pc(171) int local171 = 0; local171 < 104; local171++) {
					for (local175 = 0; local175 < 104; local175++) {
						@Pc(187) Class29 local187 = this.aClass29ArrayArrayArray1[this.anInt909][local171][local175];
						if (local187 != null) {
							local79 = local171 * 4 + 2 - aClass2_Sub1_Sub1_Sub4_Sub2_1.anInt541 / 32;
							local23 = local175 * 4 + 2 - aClass2_Sub1_Sub1_Sub4_Sub2_1.anInt542 / 32;
							this.method700(local79, this.aBoolean186, local23, this.aClass2_Sub1_Sub2_Sub2_11);
						}
					}
				}
				for (local175 = 0; local175 < this.anInt964; local175++) {
					@Pc(239) Class2_Sub1_Sub1_Sub4_Sub1 local239 = this.aClass2_Sub1_Sub1_Sub4_Sub1Array1[this.anIntArray250[local175]];
					if (local239 != null && local239.method446()) {
						@Pc(248) Class45 local248 = local239.aClass45_1;
						if (local248.anIntArray174 != null) {
							local248 = local248.method513();
						}
						if (local248 != null && local248.aBoolean160 && local248.aBoolean159) {
							local79 = local239.anInt541 / 32 - aClass2_Sub1_Sub1_Sub4_Sub2_1.anInt541 / 32;
							local23 = local239.anInt542 / 32 - aClass2_Sub1_Sub1_Sub4_Sub2_1.anInt542 / 32;
							this.method700(local79, this.aBoolean186, local23, this.aClass2_Sub1_Sub2_Sub2_12);
						}
					}
				}
				@Pc(308) Class2_Sub1_Sub1_Sub4_Sub2 local308;
				for (@Pc(298) int local298 = 0; local298 < this.anInt902; local298++) {
					local308 = this.aClass2_Sub1_Sub1_Sub4_Sub2Array1[this.anIntArray231[local298]];
					if (local308 != null && local308.method446()) {
						local79 = local308.anInt541 / 32 - aClass2_Sub1_Sub1_Sub4_Sub2_1.anInt541 / 32;
						local23 = local308.anInt542 / 32 - aClass2_Sub1_Sub1_Sub4_Sub2_1.anInt542 / 32;
						@Pc(336) boolean local336 = false;
						@Pc(340) long local340 = Class28.method346(local308.aString14);
						for (@Pc(342) int local342 = 0; local342 < this.anInt988; local342++) {
							if (local340 == this.aLongArray4[local342] && this.anIntArray227[local342] != 0) {
								local336 = true;
								break;
							}
						}
						@Pc(367) boolean local367 = false;
						if (aClass2_Sub1_Sub1_Sub4_Sub2_1.anInt590 != 0 && local308.anInt590 != 0 && aClass2_Sub1_Sub1_Sub4_Sub2_1.anInt590 == local308.anInt590) {
							local367 = true;
						}
						if (local336) {
							this.method700(local79, this.aBoolean186, local23, this.aClass2_Sub1_Sub2_Sub2_14);
						} else if (local367) {
							this.method700(local79, this.aBoolean186, local23, this.aClass2_Sub1_Sub2_Sub2_15);
						} else {
							this.method700(local79, this.aBoolean186, local23, this.aClass2_Sub1_Sub2_Sub2_13);
						}
					}
				}
				if (this.anInt927 != 0 && anInt878 % 20 < 10) {
					if (this.anInt927 == 1 && this.anInt914 >= 0 && this.anInt914 < this.aClass2_Sub1_Sub1_Sub4_Sub1Array1.length) {
						@Pc(444) Class2_Sub1_Sub1_Sub4_Sub1 local444 = this.aClass2_Sub1_Sub1_Sub4_Sub1Array1[this.anInt914];
						if (local444 != null) {
							local79 = local444.anInt541 / 32 - aClass2_Sub1_Sub1_Sub4_Sub2_1.anInt541 / 32;
							local23 = local444.anInt542 / 32 - aClass2_Sub1_Sub1_Sub4_Sub2_1.anInt542 / 32;
							this.method689(local79, local23, this.aClass2_Sub1_Sub2_Sub2_9);
						}
					}
					if (this.anInt927 == 2) {
						local79 = (this.anInt934 - this.anInt874) * 4 + 2 - aClass2_Sub1_Sub1_Sub4_Sub2_1.anInt541 / 32;
						local23 = (this.anInt935 - this.anInt875) * 4 + 2 - aClass2_Sub1_Sub1_Sub4_Sub2_1.anInt542 / 32;
						this.method689(local79, local23, this.aClass2_Sub1_Sub2_Sub2_9);
					}
					if (this.anInt927 == 10 && this.anInt853 >= 0 && this.anInt853 < this.aClass2_Sub1_Sub1_Sub4_Sub2Array1.length) {
						local308 = this.aClass2_Sub1_Sub1_Sub4_Sub2Array1[this.anInt853];
						if (local308 != null) {
							local79 = local308.anInt541 / 32 - aClass2_Sub1_Sub1_Sub4_Sub2_1.anInt541 / 32;
							local23 = local308.anInt542 / 32 - aClass2_Sub1_Sub1_Sub4_Sub2_1.anInt542 / 32;
							this.method689(local79, local23, this.aClass2_Sub1_Sub2_Sub2_9);
						}
					}
				}
				if (this.anInt910 != 0) {
					local79 = this.anInt910 * 4 + 2 - aClass2_Sub1_Sub1_Sub4_Sub2_1.anInt541 / 32;
					local23 = this.anInt911 * 4 + 2 - aClass2_Sub1_Sub1_Sub4_Sub2_1.anInt542 / 32;
					this.method700(local79, this.aBoolean186, local23, this.aClass2_Sub1_Sub2_Sub2_8);
				}
				Class2_Sub1_Sub2.method550(3, 97, 16777215, 78, 3);
				this.aClass17_23.method195();
				Class2_Sub1_Sub2_Sub1.anIntArray9 = this.anIntArray267;
			}
		} catch (@Pc(613) RuntimeException local613) {
			signlink.reporterror("36269, " + -604 + ", " + local613.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "j", descriptor = "(B)V")
	private void method679() {
		try {
			signlink.aBoolean229 = false;
			signlink.anInt1059 = 0;
			signlink.midi = "stop";
		} catch (@Pc(14) RuntimeException local14) {
			signlink.reporterror("44760, " + -65 + ", " + local14.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Lclient!LBBVYYXO;II)V")
	private void method680(@OriginalArg(0) Class2_Sub1_Sub3 arg0, @OriginalArg(1) int arg1) {
		try {
			for (@Pc(1) int local1 = 0; local1 < this.anInt903; local1++) {
				@Pc(8) int local8 = this.anIntArray232[local1];
				@Pc(13) Class2_Sub1_Sub1_Sub4_Sub2 local13 = this.aClass2_Sub1_Sub1_Sub4_Sub2Array1[local8];
				@Pc(16) int local16 = arg0.method267();
				if ((local16 & 0x2) != 0) {
					local16 += arg0.method267() << 8;
				}
				this.method688(local8, local13, local16, arg0);
			}
			if (this.anInt863 == 2) {
				;
			}
		} catch (@Pc(45) RuntimeException local45) {
			signlink.reporterror("93582, " + arg0 + ", " + arg1 + ", " + 2 + ", " + local45.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "B", descriptor = "(I)V")
	private void method681() {
		try {
			for (@Pc(6) Class2_Sub3 local6 = (Class2_Sub3) this.aClass29_10.method355(); local6 != null; local6 = (Class2_Sub3) this.aClass29_10.method357()) {
				if (local6.anInt221 == -1) {
					local6.anInt232 = 0;
					this.method708(local6, this.aByte48);
				} else {
					local6.method573();
				}
			}
		} catch (@Pc(48) RuntimeException local48) {
			signlink.reporterror("76788, " + 4 + ", " + local48.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IJ)V")
	private void method682(@OriginalArg(1) long arg0) {
		try {
			if (arg0 != 0L) {
				for (@Pc(18) int local18 = 0; local18 < this.anInt919; local18++) {
					if (this.aLongArray3[local18] == arg0) {
						this.anInt919--;
						this.aBoolean228 = true;
						for (@Pc(38) int local38 = local18; local38 < this.anInt919; local38++) {
							this.aLongArray3[local38] = this.aLongArray3[local38 + 1];
						}
						this.aClass2_Sub1_Sub3_6.method256(246);
						this.aClass2_Sub1_Sub3_6.method263(arg0);
						return;
					}
				}
			}
		} catch (@Pc(73) RuntimeException local73) {
			signlink.reporterror("78144, " + 5 + ", " + arg0 + ", " + local73.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "C", descriptor = "(I)V")
	private void method683() {
		try {
			@Pc(15) int local15;
			if (this.anInt1028 > 0) {
				for (local15 = 0; local15 < 256; local15++) {
					if (this.anInt1028 > 768) {
						this.anIntArray222[local15] = this.method669(this.anIntArray223[local15], this.anIntArray224[local15], 1024 - this.anInt1028, this.aByte35);
					} else if (this.anInt1028 > 256) {
						this.anIntArray222[local15] = this.anIntArray224[local15];
					} else {
						this.anIntArray222[local15] = this.method669(this.anIntArray224[local15], this.anIntArray223[local15], 256 - this.anInt1028, this.aByte35);
					}
				}
			} else if (this.anInt1029 > 0) {
				for (local15 = 0; local15 < 256; local15++) {
					if (this.anInt1029 > 768) {
						this.anIntArray222[local15] = this.method669(this.anIntArray223[local15], this.anIntArray225[local15], 1024 - this.anInt1029, this.aByte35);
					} else if (this.anInt1029 > 256) {
						this.anIntArray222[local15] = this.anIntArray225[local15];
					} else {
						this.anIntArray222[local15] = this.method669(this.anIntArray225[local15], this.anIntArray223[local15], 256 - this.anInt1029, this.aByte35);
					}
				}
			} else {
				for (local15 = 0; local15 < 256; local15++) {
					this.anIntArray222[local15] = this.anIntArray223[local15];
				}
			}
			for (local15 = 0; local15 < 33920; local15++) {
				this.aClass17_6.anIntArray87[local15] = this.aClass2_Sub1_Sub2_Sub2_16.anIntArray164[local15];
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
				local209 = this.anIntArray255[local196] * (256 - local196) / 256;
				local213 = local209 + 22;
				if (local213 < 0) {
					local213 = 0;
				}
				local192 += local213;
				for (local223 = local213; local223 < 128; local223++) {
					local231 = this.anIntArray243[local192++];
					if (local231 == 0) {
						local194++;
					} else {
						local235 = local231;
						local239 = 256 - local231;
						local231 = this.anIntArray222[local231];
						local250 = this.aClass17_6.anIntArray87[local194];
						this.aClass17_6.anIntArray87[local194++] = ((local231 & 0xFF00FF) * local235 + (local250 & 0xFF00FF) * local239 & 0xFF00FF00) + ((local231 & 0xFF00) * local235 + (local250 & 0xFF00) * local239 & 0xFF0000) >> 8;
					}
				}
				local194 += local213;
			}
			this.aClass17_6.method196(super.aGraphics2, 0, 0);
			for (local209 = 0; local209 < 33920; local209++) {
				this.aClass17_7.anIntArray87[local209] = this.aClass2_Sub1_Sub2_Sub2_17.anIntArray164[local209];
			}
			local192 = 0;
			local194 = 1176;
			for (local213 = 1; local213 < 255; local213++) {
				local223 = this.anIntArray255[local213] * (256 - local213) / 256;
				local231 = 103 - local223;
				local194 += local223;
				for (local235 = 0; local235 < local231; local235++) {
					local239 = this.anIntArray243[local192++];
					if (local239 == 0) {
						local194++;
					} else {
						local250 = local239;
						@Pc(373) int local373 = 256 - local239;
						local239 = this.anIntArray222[local239];
						@Pc(384) int local384 = this.aClass17_7.anIntArray87[local194];
						this.aClass17_7.anIntArray87[local194++] = ((local239 & 0xFF00FF) * local250 + (local384 & 0xFF00FF) * local373 & 0xFF00FF00) + ((local239 & 0xFF00) * local250 + (local384 & 0xFF00) * local373 & 0xFF0000) >> 8;
					}
				}
				local192 += 128 - local231;
				local194 += 128 - local231 - local223;
			}
			this.aClass17_7.method196(super.aGraphics2, 637, 0);
		} catch (@Pc(456) RuntimeException local456) {
			signlink.reporterror("46582, " + -544 + ", " + local456.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIZ)V")
	private void method684(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(1) int local1 = 0;
			for (@Pc(3) int local3 = 0; local3 < 100; local3++) {
				if (this.aStringArray12[local3] != null) {
					@Pc(15) int local15 = this.anIntArray251[local3];
					@Pc(26) int local26 = this.anInt968 + 70 + 4 - local1 * 14;
					if (local26 < -20) {
						break;
					}
					@Pc(34) String local34 = this.aStringArray11[local3];
					if (local34 != null && local34.startsWith("@cr1@")) {
						local34 = local34.substring(5);
					}
					if (local34 != null && local34.startsWith("@cr2@")) {
						local34 = local34.substring(5);
					}
					if (local15 == 0) {
						local1++;
					}
					if ((local15 == 1 || local15 == 2) && (local15 == 1 || this.anInt918 == 0 || this.anInt918 == 1 && this.method590(local34))) {
						if (arg1 > local26 - 14 && arg1 <= local26 && !local34.equals(aClass2_Sub1_Sub1_Sub4_Sub2_1.aString14)) {
							if (this.anInt967 >= 1) {
								this.aStringArray14[this.anInt849] = "Report abuse @whi@" + local34;
								this.anIntArray235[this.anInt849] = 564;
								this.anInt849++;
							}
							this.aStringArray14[this.anInt849] = "Add ignore @whi@" + local34;
							this.anIntArray235[this.anInt849] = 502;
							this.anInt849++;
							this.aStringArray14[this.anInt849] = "Add friend @whi@" + local34;
							this.anIntArray235[this.anInt849] = 308;
							this.anInt849++;
						}
						local1++;
					}
					if ((local15 == 3 || local15 == 7) && this.anInt837 == 0 && (local15 == 7 || this.anInt842 == 0 || this.anInt842 == 1 && this.method590(local34))) {
						if (arg1 > local26 - 14 && arg1 <= local26) {
							if (this.anInt967 >= 1) {
								this.aStringArray14[this.anInt849] = "Report abuse @whi@" + local34;
								this.anIntArray235[this.anInt849] = 564;
								this.anInt849++;
							}
							this.aStringArray14[this.anInt849] = "Add ignore @whi@" + local34;
							this.anIntArray235[this.anInt849] = 502;
							this.anInt849++;
							this.aStringArray14[this.anInt849] = "Add friend @whi@" + local34;
							this.anIntArray235[this.anInt849] = 308;
							this.anInt849++;
						}
						local1++;
					}
					if (local15 == 4 && (this.anInt833 == 0 || this.anInt833 == 1 && this.method590(local34))) {
						if (arg1 > local26 - 14 && arg1 <= local26) {
							this.aStringArray14[this.anInt849] = "Accept trade @whi@" + local34;
							this.anIntArray235[this.anInt849] = 455;
							this.anInt849++;
						}
						local1++;
					}
					if ((local15 == 5 || local15 == 6) && this.anInt837 == 0 && this.anInt842 < 2) {
						local1++;
					}
					if (local15 == 8 && (this.anInt833 == 0 || this.anInt833 == 1 && this.method590(local34))) {
						if (arg1 > local26 - 14 && arg1 <= local26) {
							this.aStringArray14[this.anInt849] = "Accept challenge @whi@" + local34;
							this.anIntArray235[this.anInt849] = 899;
							this.anInt849++;
						}
						local1++;
					}
				}
			}
		} catch (@Pc(401) RuntimeException local401) {
			signlink.reporterror("73446, " + arg0 + ", " + arg1 + ", " + true + ", " + local401.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIIIIII)V")
	private void method685(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6) {
		try {
			if (arg6 >= 1 && arg0 >= 1 && arg6 <= 102 && arg0 <= 102) {
				if (aBoolean197 && arg5 != this.anInt909) {
					return;
				}
				@Pc(30) int local30 = 0;
				if (arg2 == 0) {
					local30 = this.aClass34_1.method402(arg5, arg6, arg0);
				}
				if (arg2 == 1) {
					local30 = this.aClass34_1.method403(arg5, arg6, arg0);
				}
				if (arg2 == 2) {
					local30 = this.aClass34_1.method404(arg5, arg6, arg0);
				}
				if (arg2 == 3) {
					local30 = this.aClass34_1.method405(arg5, arg6, arg0);
				}
				@Pc(86) int local86;
				if (local30 != 0) {
					local86 = this.aClass34_1.method406(arg5, arg6, arg0, local30);
					@Pc(92) int local92 = local30 >> 14 & 0x7FFF;
					@Pc(96) int local96 = local86 & 0x1F;
					@Pc(100) int local100 = local86 >> 6;
					@Pc(112) Class24 local112;
					if (arg2 == 0) {
						this.aClass34_1.method393(arg5, arg6, arg0);
						local112 = Class24.method307(local92);
						if (local112.aBoolean91) {
							this.aClass5Array1[arg5].method25(local112.aBoolean95, arg0, local100, arg6, local96);
						}
					}
					if (arg2 == 1) {
						this.aClass34_1.method394(arg5, arg0, arg6);
					}
					if (arg2 == 2) {
						this.aClass34_1.method395(arg5, arg0, arg6);
						local112 = Class24.method307(local92);
						if (arg6 + local112.anInt306 > 103 || arg0 + local112.anInt306 > 103 || arg6 + local112.anInt314 > 103 || arg0 + local112.anInt314 > 103) {
							return;
						}
						if (local112.aBoolean91) {
							this.aClass5Array1[arg5].method26(arg0, local112.aBoolean95, local100, arg6, anInt954, local112.anInt306, local112.anInt314);
						}
					}
					if (arg2 == 3) {
						this.aClass34_1.method396(arg6, arg5, arg0);
						local112 = Class24.method307(local92);
						if (local112.aBoolean91 && local112.aBoolean96) {
							this.aClass5Array1[arg5].method28(arg0, arg6);
						}
					}
				}
				if (arg3 >= 0) {
					local86 = arg5;
					if (arg5 < 3 && (this.aByteArrayArrayArray8[1][arg6][arg0] & 0x2) == 2) {
						local86 = arg5 + 1;
					}
					Class11.method165(arg4, this.anIntArrayArrayArray7, arg5, local86, arg1, this.aClass5Array1[arg5], arg0, arg3, this.aClass34_1, arg6);
					return;
				}
			}
		} catch (@Pc(259) RuntimeException local259) {
			signlink.reporterror("52395, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + -785 + ", " + arg6 + ", " + local259.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "()V")
	@Override
	protected void method580() {
		this.method587(20, "Starting up");
		if (signlink.sunjava) {
			super.anInt803 = 5;
		}
		if (aBoolean216) {
			this.aBoolean195 = true;
			return;
		}
		aBoolean216 = true;
		@Pc(21) boolean local21 = false;
		@Pc(25) String local25 = this.method633();
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
		if (local25.endsWith("127.0.0.1")) {
			local21 = true;
		}
		if (!local21) {
			this.aBoolean201 = true;
			return;
		}
		if (signlink.aRandomAccessFile3 != null) {
			for (@Pc(101) int local101 = 0; local101 < 5; local101++) {
				this.aClass25Array1[local101] = new Class25(signlink.aRandomAccessFile3, 500000, signlink.aRandomAccessFileArray1[local101], (byte) -101, local101 + 1);
			}
		}
		try {
			this.method676();
			this.aClass13_2 = this.method672(25, "title screen", this.anIntArray257[1], 1, "title");
			this.aClass2_Sub1_Sub2_Sub4_2 = new Class2_Sub1_Sub2_Sub4(false, "p11_full", this.aClass13_2, -916);
			this.aClass2_Sub1_Sub2_Sub4_3 = new Class2_Sub1_Sub2_Sub4(false, "p12_full", this.aClass13_2, -916);
			this.aClass2_Sub1_Sub2_Sub4_4 = new Class2_Sub1_Sub2_Sub4(false, "b12_full", this.aClass13_2, -916);
			this.aClass2_Sub1_Sub2_Sub4_5 = new Class2_Sub1_Sub2_Sub4(true, "q8_full", this.aClass13_2, -916);
			this.method641();
			this.method591();
			@Pc(197) Class13 local197 = this.method672(30, "config", this.anIntArray257[2], 2, "config");
			@Pc(209) Class13 local209 = this.method672(35, "interface", this.anIntArray257[3], 3, "interface");
			@Pc(221) Class13 local221 = this.method672(40, "2d graphics", this.anIntArray257[4], 4, "media");
			@Pc(233) Class13 local233 = this.method672(45, "textures", this.anIntArray257[6], 6, "textures");
			@Pc(245) Class13 local245 = this.method672(50, "chat system", this.anIntArray257[7], 7, "wordenc");
			@Pc(257) Class13 local257 = this.method672(55, "sound effects", this.anIntArray257[8], 8, "sounds");
			this.aByteArrayArrayArray8 = new byte[4][104][104];
			this.anIntArrayArrayArray7 = new int[4][105][105];
			this.aClass34_1 = new Class34(104, this.anIntArrayArrayArray7, 104, anInt1024, 4);
			for (@Pc(282) int local282 = 0; local282 < 4; local282++) {
				this.aClass5Array1[local282] = new Class5(false, 104, 104);
			}
			this.aClass2_Sub1_Sub2_Sub2_4 = new Class2_Sub1_Sub2_Sub2(512, 512);
			@Pc(317) Class13 local317 = this.method672(60, "update list", this.anIntArray257[5], 5, "versionlist");
			this.method587(60, "Connecting to update server");
			this.aClass8_Sub1_1 = new Class8_Sub1();
			this.aClass8_Sub1_1.method125(local317, this);
			Class32.method370(this.aClass8_Sub1_1.method145((byte) 7));
			Class2_Sub1_Sub1_Sub2.method88(this.aClass8_Sub1_1.method136(0), this.aClass8_Sub1_1);
			if (!aBoolean197) {
				this.anInt1034 = 0;
				this.aBoolean226 = true;
				this.aClass8_Sub1_1.method141(2, this.anInt1034);
				while (this.aClass8_Sub1_1.method140() > 0) {
					this.method610();
					try {
						Thread.sleep(100L);
					} catch (@Pc(368) Exception local368) {
					}
					if (this.aClass8_Sub1_1.anInt147 > 3) {
						this.method716("ondemand");
						return;
					}
				}
			}
			this.method587(65, "Requesting animations");
			@Pc(392) int local392 = this.aClass8_Sub1_1.method136(1);
			for (@Pc(394) int local394 = 0; local394 < local392; local394++) {
				this.aClass8_Sub1_1.method141(1, local394);
			}
			@Pc(412) int local412;
			while (this.aClass8_Sub1_1.method140() > 0) {
				local412 = local392 - this.aClass8_Sub1_1.method140();
				if (local412 > 0) {
					this.method587(65, "Loading animations - " + local412 * 100 / local392 + "%");
				}
				this.method610();
				try {
					Thread.sleep(100L);
				} catch (@Pc(438) Exception local438) {
				}
				if (this.aClass8_Sub1_1.anInt147 > 3) {
					this.method716("ondemand");
					return;
				}
			}
			this.method587(70, "Requesting models");
			local392 = this.aClass8_Sub1_1.method136(0);
			@Pc(472) int local472;
			for (local412 = 0; local412 < local392; local412++) {
				local472 = this.aClass8_Sub1_1.method130(aByte34, local412);
				if ((local472 & 0x1) != 0) {
					this.aClass8_Sub1_1.method141(0, local412);
				}
			}
			local392 = this.aClass8_Sub1_1.method140();
			while (this.aClass8_Sub1_1.method140() > 0) {
				local472 = local392 - this.aClass8_Sub1_1.method140();
				if (local472 > 0) {
					this.method587(70, "Loading models - " + local472 * 100 / local392 + "%");
				}
				this.method610();
				try {
					Thread.sleep(100L);
				} catch (@Pc(523) Exception local523) {
				}
			}
			if (this.aClass25Array1[0] != null) {
				this.method587(75, "Requesting maps");
				this.aClass8_Sub1_1.method141(3, this.aClass8_Sub1_1.method137(48, 0, 47));
				this.aClass8_Sub1_1.method141(3, this.aClass8_Sub1_1.method137(48, 1, 47));
				this.aClass8_Sub1_1.method141(3, this.aClass8_Sub1_1.method137(48, 0, 48));
				this.aClass8_Sub1_1.method141(3, this.aClass8_Sub1_1.method137(48, 1, 48));
				this.aClass8_Sub1_1.method141(3, this.aClass8_Sub1_1.method137(48, 0, 49));
				this.aClass8_Sub1_1.method141(3, this.aClass8_Sub1_1.method137(48, 1, 49));
				this.aClass8_Sub1_1.method141(3, this.aClass8_Sub1_1.method137(47, 0, 47));
				this.aClass8_Sub1_1.method141(3, this.aClass8_Sub1_1.method137(47, 1, 47));
				this.aClass8_Sub1_1.method141(3, this.aClass8_Sub1_1.method137(47, 0, 48));
				this.aClass8_Sub1_1.method141(3, this.aClass8_Sub1_1.method137(47, 1, 48));
				this.aClass8_Sub1_1.method141(3, this.aClass8_Sub1_1.method137(148, 0, 48));
				this.aClass8_Sub1_1.method141(3, this.aClass8_Sub1_1.method137(148, 1, 48));
				local392 = this.aClass8_Sub1_1.method140();
				while (this.aClass8_Sub1_1.method140() > 0) {
					local472 = local392 - this.aClass8_Sub1_1.method140();
					if (local472 > 0) {
						this.method587(75, "Loading maps - " + local472 * 100 / local392 + "%");
					}
					this.method610();
					try {
						Thread.sleep(100L);
					} catch (@Pc(708) Exception local708) {
					}
				}
			}
			local392 = this.aClass8_Sub1_1.method136(0);
			@Pc(729) int local729;
			for (local472 = 0; local472 < local392; local472++) {
				local729 = this.aClass8_Sub1_1.method130(aByte34, local472);
				@Pc(731) byte local731 = 0;
				if ((local729 & 0x8) != 0) {
					local731 = 10;
				} else if ((local729 & 0x20) != 0) {
					local731 = 9;
				} else if ((local729 & 0x10) != 0) {
					local731 = 8;
				} else if ((local729 & 0x40) != 0) {
					local731 = 7;
				} else if ((local729 & 0x80) != 0) {
					local731 = 6;
				} else if ((local729 & 0x2) != 0) {
					local731 = 5;
				} else if ((local729 & 0x4) != 0) {
					local731 = 4;
				}
				if ((local729 & 0x1) != 0) {
					local731 = 3;
				}
				if (local731 != 0) {
					this.aClass8_Sub1_1.method139(local731, local472, 0);
				}
			}
			this.aClass8_Sub1_1.method126(aBoolean196);
			if (!aBoolean197) {
				local392 = this.aClass8_Sub1_1.method136(2);
				for (local729 = 1; local729 < local392; local729++) {
					if (this.aClass8_Sub1_1.method134(local729)) {
						this.aClass8_Sub1_1.method139((byte) 1, local729, 2);
					}
				}
			}
			this.method587(80, "Unpacking media");
			this.aClass2_Sub1_Sub2_Sub3_13 = new Class2_Sub1_Sub2_Sub3(local221, "invback", 0);
			this.aClass2_Sub1_Sub2_Sub3_15 = new Class2_Sub1_Sub2_Sub3(local221, "chatback", 0);
			this.aClass2_Sub1_Sub2_Sub3_14 = new Class2_Sub1_Sub2_Sub3(local221, "mapback", 0);
			this.aClass2_Sub1_Sub2_Sub3_8 = new Class2_Sub1_Sub2_Sub3(local221, "backbase1", 0);
			this.aClass2_Sub1_Sub2_Sub3_9 = new Class2_Sub1_Sub2_Sub3(local221, "backbase2", 0);
			this.aClass2_Sub1_Sub2_Sub3_10 = new Class2_Sub1_Sub2_Sub3(local221, "backhmid1", 0);
			for (local729 = 0; local729 < 13; local729++) {
				this.aClass2_Sub1_Sub2_Sub3Array4[local729] = new Class2_Sub1_Sub2_Sub3(local221, "sideicons", local729);
			}
			this.aClass2_Sub1_Sub2_Sub2_3 = new Class2_Sub1_Sub2_Sub2(local221, "compass", 0);
			this.aClass2_Sub1_Sub2_Sub2_10 = new Class2_Sub1_Sub2_Sub2(local221, "mapedge", 0);
			this.aClass2_Sub1_Sub2_Sub2_10.method479();
			for (@Pc(931) int local931 = 0; local931 < 72; local931++) {
				this.aClass2_Sub1_Sub2_Sub3Array3[local931] = new Class2_Sub1_Sub2_Sub3(local221, "mapscene", local931);
			}
			for (@Pc(949) int local949 = 0; local949 < 63; local949++) {
				this.aClass2_Sub1_Sub2_Sub2Array5[local949] = new Class2_Sub1_Sub2_Sub2(local221, "mapfunction", local949);
			}
			for (@Pc(967) int local967 = 0; local967 < 5; local967++) {
				this.aClass2_Sub1_Sub2_Sub2Array10[local967] = new Class2_Sub1_Sub2_Sub2(local221, "hitmarks", local967);
			}
			for (@Pc(985) int local985 = 0; local985 < 6; local985++) {
				this.aClass2_Sub1_Sub2_Sub2Array4[local985] = new Class2_Sub1_Sub2_Sub2(local221, "headicons_pk", local985);
			}
			for (@Pc(1003) int local1003 = 0; local1003 < 9; local1003++) {
				this.aClass2_Sub1_Sub2_Sub2Array6[local1003] = new Class2_Sub1_Sub2_Sub2(local221, "headicons_prayer", local1003);
			}
			for (@Pc(1021) int local1021 = 0; local1021 < 6; local1021++) {
				this.aClass2_Sub1_Sub2_Sub2Array8[local1021] = new Class2_Sub1_Sub2_Sub2(local221, "headicons_hint", local1021);
			}
			this.aClass2_Sub1_Sub2_Sub2_7 = new Class2_Sub1_Sub2_Sub2(local221, "overlay_multiway", 0);
			this.aClass2_Sub1_Sub2_Sub2_8 = new Class2_Sub1_Sub2_Sub2(local221, "mapmarker", 0);
			this.aClass2_Sub1_Sub2_Sub2_9 = new Class2_Sub1_Sub2_Sub2(local221, "mapmarker", 1);
			for (@Pc(1063) int local1063 = 0; local1063 < 8; local1063++) {
				this.aClass2_Sub1_Sub2_Sub2Array7[local1063] = new Class2_Sub1_Sub2_Sub2(local221, "cross", local1063);
			}
			this.aClass2_Sub1_Sub2_Sub2_11 = new Class2_Sub1_Sub2_Sub2(local221, "mapdots", 0);
			this.aClass2_Sub1_Sub2_Sub2_12 = new Class2_Sub1_Sub2_Sub2(local221, "mapdots", 1);
			this.aClass2_Sub1_Sub2_Sub2_13 = new Class2_Sub1_Sub2_Sub2(local221, "mapdots", 2);
			this.aClass2_Sub1_Sub2_Sub2_14 = new Class2_Sub1_Sub2_Sub2(local221, "mapdots", 3);
			this.aClass2_Sub1_Sub2_Sub2_15 = new Class2_Sub1_Sub2_Sub2(local221, "mapdots", 4);
			this.aClass2_Sub1_Sub2_Sub3_6 = new Class2_Sub1_Sub2_Sub3(local221, "scrollbar", 0);
			this.aClass2_Sub1_Sub2_Sub3_7 = new Class2_Sub1_Sub2_Sub3(local221, "scrollbar", 1);
			this.aClass2_Sub1_Sub2_Sub3_16 = new Class2_Sub1_Sub2_Sub3(local221, "redstone1", 0);
			this.aClass2_Sub1_Sub2_Sub3_17 = new Class2_Sub1_Sub2_Sub3(local221, "redstone2", 0);
			this.aClass2_Sub1_Sub2_Sub3_18 = new Class2_Sub1_Sub2_Sub3(local221, "redstone3", 0);
			this.aClass2_Sub1_Sub2_Sub3_19 = new Class2_Sub1_Sub2_Sub3(local221, "redstone1", 0);
			this.aClass2_Sub1_Sub2_Sub3_19.method538();
			this.aClass2_Sub1_Sub2_Sub3_20 = new Class2_Sub1_Sub2_Sub3(local221, "redstone2", 0);
			this.aClass2_Sub1_Sub2_Sub3_20.method538();
			this.aClass2_Sub1_Sub2_Sub3_1 = new Class2_Sub1_Sub2_Sub3(local221, "redstone1", 0);
			this.aClass2_Sub1_Sub2_Sub3_1.method539();
			this.aClass2_Sub1_Sub2_Sub3_2 = new Class2_Sub1_Sub2_Sub3(local221, "redstone2", 0);
			this.aClass2_Sub1_Sub2_Sub3_2.method539();
			this.aClass2_Sub1_Sub2_Sub3_3 = new Class2_Sub1_Sub2_Sub3(local221, "redstone3", 0);
			this.aClass2_Sub1_Sub2_Sub3_3.method539();
			this.aClass2_Sub1_Sub2_Sub3_4 = new Class2_Sub1_Sub2_Sub3(local221, "redstone1", 0);
			this.aClass2_Sub1_Sub2_Sub3_4.method538();
			this.aClass2_Sub1_Sub2_Sub3_4.method539();
			this.aClass2_Sub1_Sub2_Sub3_5 = new Class2_Sub1_Sub2_Sub3(local221, "redstone2", 0);
			this.aClass2_Sub1_Sub2_Sub3_5.method538();
			this.aClass2_Sub1_Sub2_Sub3_5.method539();
			for (@Pc(1253) int local1253 = 0; local1253 < 2; local1253++) {
				this.aClass2_Sub1_Sub2_Sub3Array2[local1253] = new Class2_Sub1_Sub2_Sub3(local221, "mod_icons", local1253);
			}
			@Pc(1276) Class2_Sub1_Sub2_Sub2 local1276 = new Class2_Sub1_Sub2_Sub2(local221, "backleft1", 0);
			this.aClass17_12 = new Class17(local1276.anInt635, local1276.anInt634, this.method585(), anInt978);
			local1276.method480(0, 0);
			@Pc(1301) Class2_Sub1_Sub2_Sub2 local1301 = new Class2_Sub1_Sub2_Sub2(local221, "backleft2", 0);
			this.aClass17_13 = new Class17(local1301.anInt635, local1301.anInt634, this.method585(), anInt978);
			local1301.method480(0, 0);
			@Pc(1326) Class2_Sub1_Sub2_Sub2 local1326 = new Class2_Sub1_Sub2_Sub2(local221, "backright1", 0);
			this.aClass17_14 = new Class17(local1326.anInt635, local1326.anInt634, this.method585(), anInt978);
			local1326.method480(0, 0);
			@Pc(1351) Class2_Sub1_Sub2_Sub2 local1351 = new Class2_Sub1_Sub2_Sub2(local221, "backright2", 0);
			this.aClass17_15 = new Class17(local1351.anInt635, local1351.anInt634, this.method585(), anInt978);
			local1351.method480(0, 0);
			@Pc(1376) Class2_Sub1_Sub2_Sub2 local1376 = new Class2_Sub1_Sub2_Sub2(local221, "backtop1", 0);
			this.aClass17_16 = new Class17(local1376.anInt635, local1376.anInt634, this.method585(), anInt978);
			local1376.method480(0, 0);
			@Pc(1401) Class2_Sub1_Sub2_Sub2 local1401 = new Class2_Sub1_Sub2_Sub2(local221, "backvmid1", 0);
			this.aClass17_17 = new Class17(local1401.anInt635, local1401.anInt634, this.method585(), anInt978);
			local1401.method480(0, 0);
			@Pc(1426) Class2_Sub1_Sub2_Sub2 local1426 = new Class2_Sub1_Sub2_Sub2(local221, "backvmid2", 0);
			this.aClass17_18 = new Class17(local1426.anInt635, local1426.anInt634, this.method585(), anInt978);
			local1426.method480(0, 0);
			@Pc(1451) Class2_Sub1_Sub2_Sub2 local1451 = new Class2_Sub1_Sub2_Sub2(local221, "backvmid3", 0);
			this.aClass17_19 = new Class17(local1451.anInt635, local1451.anInt634, this.method585(), anInt978);
			local1451.method480(0, 0);
			@Pc(1476) Class2_Sub1_Sub2_Sub2 local1476 = new Class2_Sub1_Sub2_Sub2(local221, "backhmid2", 0);
			this.aClass17_20 = new Class17(local1476.anInt635, local1476.anInt634, this.method585(), anInt978);
			local1476.method480(0, 0);
			@Pc(1501) int local1501 = (int) (Math.random() * 21.0D) - 10;
			@Pc(1508) int local1508 = (int) (Math.random() * 21.0D) - 10;
			@Pc(1515) int local1515 = (int) (Math.random() * 21.0D) - 10;
			@Pc(1522) int local1522 = (int) (Math.random() * 41.0D) - 20;
			for (@Pc(1524) int local1524 = 0; local1524 < 100; local1524++) {
				if (this.aClass2_Sub1_Sub2_Sub2Array5[local1524] != null) {
					this.aClass2_Sub1_Sub2_Sub2Array5[local1524].method478(local1508 + local1522, local1501 + local1522, local1515 + local1522);
				}
				if (this.aClass2_Sub1_Sub2_Sub3Array3[local1524] != null) {
					this.aClass2_Sub1_Sub2_Sub3Array3[local1524].method540(local1508 + local1522, (byte) 1, local1501 + local1522, local1515 + local1522);
				}
			}
			this.method587(83, "Unpacking textures");
			Class2_Sub1_Sub2_Sub1.method65(local233);
			Class2_Sub1_Sub2_Sub1.method69(0.8D);
			Class2_Sub1_Sub2_Sub1.method64((byte) 2);
			this.method587(86, "Unpacking config");
			Class10.method159(local197);
			Class24.method309(local197);
			Class3.method13(local197);
			Class41.method496(local197);
			Class45.method517(local197);
			Class6.method77(local197);
			Class4.method17(local197);
			Class23.method305(local197);
			Class15.method193(local197);
			Class41.aBoolean154 = aBoolean196;
			if (!aBoolean197) {
				this.method587(90, "Unpacking sounds");
				@Pc(1627) byte[] local1627 = local257.method186("sounds.dat", null);
				@Pc(1633) Class2_Sub1_Sub3 local1633 = new Class2_Sub1_Sub3((byte) 114, local1627);
				Class27.method334(local1633);
			}
			this.method587(95, "Unpacking interfaces");
			@Pc(1664) Class2_Sub1_Sub2_Sub4[] local1664 = new Class2_Sub1_Sub2_Sub4[] { this.aClass2_Sub1_Sub2_Sub4_2, this.aClass2_Sub1_Sub2_Sub4_3, this.aClass2_Sub1_Sub2_Sub4_4, this.aClass2_Sub1_Sub2_Sub4_5 };
			Class31.method361(local209, local221, local1664);
			this.method587(100, "Preparing game engine");
			@Pc(1680) int local1680;
			@Pc(1682) int local1682;
			@Pc(1684) int local1684;
			for (@Pc(1676) int local1676 = 0; local1676 < 33; local1676++) {
				local1680 = 999;
				local1682 = 0;
				for (local1684 = 0; local1684 < 34; local1684++) {
					if (this.aClass2_Sub1_Sub2_Sub3_14.aByteArray19[local1684 + local1676 * this.aClass2_Sub1_Sub2_Sub3_14.anInt770] == 0) {
						if (local1680 == 999) {
							local1680 = local1684;
						}
					} else if (local1680 != 999) {
						local1682 = local1684;
						break;
					}
				}
				this.anIntArray256[local1676] = local1680;
				this.anIntArray226[local1676] = local1682 - local1680;
			}
			@Pc(1742) int local1742;
			for (local1680 = 5; local1680 < 156; local1680++) {
				local1682 = 999;
				local1684 = 0;
				for (local1742 = 25; local1742 < 172; local1742++) {
					if (this.aClass2_Sub1_Sub2_Sub3_14.aByteArray19[local1742 + local1680 * this.aClass2_Sub1_Sub2_Sub3_14.anInt770] == 0 && (local1742 > 34 || local1680 > 34)) {
						if (local1682 == 999) {
							local1682 = local1742;
						}
					} else if (local1682 != 999) {
						local1684 = local1742;
						break;
					}
				}
				this.anIntArray272[local1680 - 5] = local1682 - 25;
				this.anIntArray221[local1680 - 5] = local1684 - local1682;
			}
			Class2_Sub1_Sub2_Sub1.method62(503, 765);
			this.anIntArray268 = Class2_Sub1_Sub2_Sub1.anIntArray9;
			Class2_Sub1_Sub2_Sub1.method62(96, 479);
			this.anIntArray265 = Class2_Sub1_Sub2_Sub1.anIntArray9;
			Class2_Sub1_Sub2_Sub1.method62(261, 190);
			this.anIntArray266 = Class2_Sub1_Sub2_Sub1.anIntArray9;
			Class2_Sub1_Sub2_Sub1.method62(334, 512);
			this.anIntArray267 = Class2_Sub1_Sub2_Sub1.anIntArray9;
			@Pc(1833) int[] local1833 = new int[9];
			for (local1684 = 0; local1684 < 9; local1684++) {
				local1742 = local1684 * 32 + 128 + 15;
				@Pc(1851) int local1851 = local1742 * 3 + 600;
				@Pc(1855) int local1855 = Class2_Sub1_Sub2_Sub1.anIntArray7[local1742];
				local1833[local1684] = local1851 * local1855 >> 16;
			}
			Class34.method412(local1833);
			Class18.method198(local245);
			this.aClass12_1 = new Class12((byte) -60, this);
			this.method586(this.aClass12_1, 10);
			Class2_Sub1_Sub1_Sub3.aClient1 = this;
			Class24.aClient4 = this;
			Class45.aClient5 = this;
		} catch (@Pc(1896) Exception local1896) {
			signlink.reporterror("loaderror " + this.aString24 + " " + this.anInt834);
			this.aBoolean192 = true;
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(ZI)Z")
	private boolean method686(@OriginalArg(1) int arg0) {
		try {
			if (arg0 < 0) {
				return false;
			}
			@Pc(8) int local8 = this.anIntArray235[arg0];
			if (local8 >= 2000) {
				local8 -= 2000;
			}
			return local8 == 308;
		} catch (@Pc(26) RuntimeException local26) {
			signlink.reporterror("13616, " + false + ", " + arg0 + ", " + local26.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Lclient!PQPZKUPU;I)Z")
	private boolean method687(@OriginalArg(0) Class31 arg0) {
		try {
			if (arg0.anIntArray113 == null) {
				return false;
			}
			for (@Pc(6) int local6 = 0; local6 < arg0.anIntArray113.length; local6++) {
				@Pc(14) int local14 = this.method658(local6, arg0);
				@Pc(19) int local19 = arg0.anIntArray109[local6];
				if (arg0.anIntArray113[local6] == 2) {
					if (local14 >= local19) {
						return false;
					}
				} else if (arg0.anIntArray113[local6] == 3) {
					if (local14 <= local19) {
						return false;
					}
				} else if (arg0.anIntArray113[local6] == 4) {
					if (local14 == local19) {
						return false;
					}
				} else if (local14 != local19) {
					return false;
				}
			}
			return true;
		} catch (@Pc(76) RuntimeException local76) {
			signlink.reporterror("37331, " + arg0 + ", " + 0 + ", " + local76.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IILclient!SOKVSBIO;ILclient!LBBVYYXO;)V")
	private void method688(@OriginalArg(1) int arg0, @OriginalArg(2) Class2_Sub1_Sub1_Sub4_Sub2 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class2_Sub1_Sub3 arg3) {
		try {
			if ((arg2 & 0x40) != 0) {
				arg1.anInt565 = arg3.method293();
				if (arg1.anInt565 == 65535) {
					arg1.anInt565 = -1;
				}
			}
			@Pc(33) int local33;
			if ((arg2 & 0x80) != 0) {
				local33 = arg3.method286();
				@Pc(36) byte[] local36 = new byte[local33];
				@Pc(42) Class2_Sub1_Sub3 local42 = new Class2_Sub1_Sub3((byte) 114, local36);
				arg3.method304(local33, local36);
				this.aClass2_Sub1_Sub3Array1[arg0] = local42;
				arg1.method449(local42, this.anInt1014);
			}
			if ((arg2 & 0x100) != 0) {
				arg1.anInt535 = arg3.method269();
				local33 = arg3.method272();
				arg1.anInt539 = local33 >> 16;
				arg1.anInt538 = anInt878 + (local33 & 0xFFFF);
				arg1.anInt536 = 0;
				arg1.anInt537 = 0;
				if (arg1.anInt538 > anInt878) {
					arg1.anInt536 = -1;
				}
				if (arg1.anInt535 == 65535) {
					arg1.anInt535 = -1;
				}
			}
			if ((arg2 & 0x400) != 0) {
				arg1.anInt566 = arg3.method287();
				arg1.anInt568 = arg3.method267();
				arg1.anInt567 = arg3.method267();
				arg1.anInt569 = arg3.method267();
				arg1.anInt570 = arg3.method269() + anInt878;
				arg1.anInt571 = arg3.method294() + anInt878;
				arg1.anInt572 = arg3.method286();
				arg1.method444(this.aByte37);
			}
			@Pc(154) int local154;
			if ((arg2 & 0x20) != 0) {
				local33 = arg3.method267();
				local154 = arg3.method267();
				arg1.method448(local33, anInt878, local154);
				arg1.anInt578 = anInt878 + 300;
				arg1.anInt579 = arg3.method287();
				arg1.anInt580 = arg3.method287();
			}
			@Pc(191) int local191;
			if ((arg2 & 0x8) != 0) {
				local33 = arg3.method293();
				local154 = arg3.method286();
				local191 = arg3.method287();
				@Pc(194) int local194 = arg3.anInt283;
				if (arg1.aString14 != null && arg1.aBoolean143) {
					@Pc(204) long local204 = Class28.method346(arg1.aString14);
					@Pc(206) boolean local206 = false;
					if (local154 <= 1) {
						for (@Pc(211) int local211 = 0; local211 < this.anInt919; local211++) {
							if (this.aLongArray3[local211] == local204) {
								local206 = true;
								break;
							}
						}
					}
					if (!local206 && this.anInt855 == 0) {
						try {
							this.aClass2_Sub1_Sub3_7.anInt283 = 0;
							arg3.method304(local191, this.aClass2_Sub1_Sub3_7.aByteArray7);
							this.aClass2_Sub1_Sub3_7.anInt283 = 0;
							@Pc(256) String local256 = Class35.method437(this.aClass2_Sub1_Sub3_7, 555, local191);
							@Pc(260) String local260 = Class18.method208(local256);
							arg1.aString13 = local260;
							arg1.anInt557 = local33 >> 8;
							arg1.anInt540 = local33 & 0xFF;
							arg1.anInt553 = 150;
							if (local154 == 2 || local154 == 3) {
								this.method640(local260, "@cr2@" + arg1.aString14, 1);
							} else if (local154 == 1) {
								this.method640(local260, "@cr1@" + arg1.aString14, 1);
							} else {
								this.method640(local260, arg1.aString14, 2);
							}
						} catch (@Pc(324) Exception local324) {
							signlink.reporterror("cde2");
						}
					}
				}
				arg3.anInt283 = local194 + local191;
			}
			if ((arg2 & 0x4) != 0) {
				arg1.aString13 = arg3.method274();
				if (arg1.aString13.charAt(0) == '~') {
					arg1.aString13 = arg1.aString13.substring(1);
					this.method640(arg1.aString13, arg1.aString14, 2);
				} else if (arg1 == aClass2_Sub1_Sub1_Sub4_Sub2_1) {
					this.method640(arg1.aString13, arg1.aString14, 2);
				}
				arg1.anInt557 = 0;
				arg1.anInt540 = 0;
				arg1.anInt553 = 150;
			}
			if ((arg2 & 0x200) != 0) {
				local33 = arg3.method267();
				local154 = arg3.method267();
				arg1.method448(local33, anInt878, local154);
				arg1.anInt578 = anInt878 + 300;
				arg1.anInt579 = arg3.method267();
				arg1.anInt580 = arg3.method286();
			}
			if ((arg2 & 0x1) != 0) {
				local33 = arg3.method293();
				if (local33 == 65535) {
					local33 = -1;
				}
				local154 = arg3.method286();
				if (local33 == arg1.anInt573 && local33 != -1) {
					local191 = Class10.aClass10Array1[local33].anInt206;
					if (local191 == 1) {
						arg1.anInt574 = 0;
						arg1.anInt575 = 0;
						arg1.anInt576 = local154;
						arg1.anInt577 = 0;
					}
					if (local191 == 2) {
						arg1.anInt577 = 0;
					}
				} else if (local33 == -1 || arg1.anInt573 == -1 || Class10.aClass10Array1[local33].anInt200 >= Class10.aClass10Array1[arg1.anInt573].anInt200) {
					arg1.anInt573 = local33;
					arg1.anInt574 = 0;
					arg1.anInt575 = 0;
					arg1.anInt576 = local154;
					arg1.anInt577 = 0;
					arg1.anInt544 = arg1.anInt558;
				}
			}
			if ((arg2 & 0x10) != 0) {
				arg1.anInt555 = arg3.method295(this.aBoolean208);
				arg1.anInt556 = arg3.method293();
			}
		} catch (@Pc(517) RuntimeException local517) {
			signlink.reporterror("28418, " + -37382 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local517.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIILclient!VZJVQLEE;)V")
	private void method689(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class2_Sub1_Sub2_Sub2 arg2) {
		try {
			@Pc(10) int local10 = arg0 * arg0 + arg1 * arg1;
			if (local10 > 4225 && local10 < 90000) {
				@Pc(24) int local24 = this.anInt822 + this.anInt1012 & 0x7FF;
				@Pc(28) int local28 = Class2_Sub1_Sub1_Sub2.anIntArray54[local24];
				@Pc(32) int local32 = Class2_Sub1_Sub1_Sub2.anIntArray55[local24];
				@Pc(41) int local41 = local28 * 256 / (this.anInt1032 + 256);
				@Pc(50) int local50 = local32 * 256 / (this.anInt1032 + 256);
				@Pc(60) int local60 = arg1 * local41 + arg0 * local50 >> 16;
				@Pc(70) int local70 = arg1 * local50 - arg0 * local41 >> 16;
				@Pc(76) double local76 = Math.atan2((double) local60, (double) local70);
				@Pc(82) int local82 = (int) (Math.sin(local76) * 63.0D);
				@Pc(88) int local88 = (int) (Math.cos(local76) * 57.0D);
				this.aClass2_Sub1_Sub2_Sub2_10.method487(local76, 83 - local88 - 20, local82 + 94 + 4 - 10);
			} else {
				this.method700(arg0, this.aBoolean186, arg1, arg2);
			}
		} catch (@Pc(120) RuntimeException local120) {
			signlink.reporterror("90602, " + arg0 + ", " + -60 + ", " + arg1 + ", " + arg2 + ", " + local120.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "f", descriptor = "(II)V")
	private void method690(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(9) Class29 local9 = this.aClass29ArrayArrayArray1[this.anInt909][arg0][arg1];
		if (local9 == null) {
			this.aClass34_1.method397(this.anInt909, arg0, arg1);
			return;
		}
		@Pc(21) int local21 = -99999999;
		@Pc(23) Class2_Sub1_Sub1_Sub6 local23 = null;
		@Pc(27) Class2_Sub1_Sub1_Sub6 local27;
		for (local27 = (Class2_Sub1_Sub1_Sub6) local9.method355(); local27 != null; local27 = (Class2_Sub1_Sub1_Sub6) local9.method357()) {
			@Pc(32) Class41 local32 = Class41.method495(local27.anInt600);
			@Pc(35) int local35 = local32.anInt650;
			if (local32.aBoolean156) {
				local35 *= local27.anInt601 + 1;
			}
			if (local35 > local21) {
				local21 = local35;
				local23 = local27;
			}
		}
		local9.method353(local23);
		@Pc(65) Class2_Sub1_Sub1_Sub6 local65 = null;
		@Pc(67) Class2_Sub1_Sub1_Sub6 local67 = null;
		for (local27 = (Class2_Sub1_Sub1_Sub6) local9.method355(); local27 != null; local27 = (Class2_Sub1_Sub1_Sub6) local9.method357()) {
			if (local27.anInt600 != local23.anInt600 && local65 == null) {
				local65 = local27;
			}
			if (local27.anInt600 != local23.anInt600 && local27.anInt600 != local65.anInt600 && local67 == null) {
				local67 = local27;
			}
		}
		@Pc(110) int local110 = arg0 + (arg1 << 7) + 1610612736;
		this.aClass34_1.method383(this.anInt909, local23, 932, arg1, local67, local65, this.method717(arg0 * 128 + 64, this.anInt909, arg1 * 128 + 64), local110, arg0);
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IBLclient!LBBVYYXO;)V")
	private void method691(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub1_Sub3 arg1) {
		try {
			arg1.method277();
			if (this.aByte40 != 6) {
				this.aClass29ArrayArrayArray1 = null;
			}
			@Pc(14) int local14 = arg1.method278(1);
			if (local14 != 0) {
				@Pc(22) int local22 = arg1.method278(2);
				if (local22 == 0) {
					this.anIntArray232[this.anInt903++] = this.anInt901;
				} else {
					@Pc(45) int local45;
					@Pc(55) int local55;
					if (local22 == 1) {
						local45 = arg1.method278(3);
						aClass2_Sub1_Sub1_Sub4_Sub2_1.method445(local45, false);
						local55 = arg1.method278(1);
						if (local55 == 1) {
							this.anIntArray232[this.anInt903++] = this.anInt901;
						}
					} else {
						@Pc(99) int local99;
						if (local22 == 2) {
							local45 = arg1.method278(3);
							aClass2_Sub1_Sub1_Sub4_Sub2_1.method445(local45, true);
							local55 = arg1.method278(3);
							aClass2_Sub1_Sub1_Sub4_Sub2_1.method445(local55, true);
							local99 = arg1.method278(1);
							if (local99 == 1) {
								this.anIntArray232[this.anInt903++] = this.anInt901;
							}
						} else if (local22 == 3) {
							this.anInt909 = arg1.method278(2);
							local45 = arg1.method278(7);
							local55 = arg1.method278(1);
							local99 = arg1.method278(1);
							if (local99 == 1) {
								this.anIntArray232[this.anInt903++] = this.anInt901;
							}
							@Pc(159) int local159 = arg1.method278(7);
							aClass2_Sub1_Sub1_Sub4_Sub2_1.method447(local159, local45, this.aByte41, local55 == 1);
						}
					}
				}
			}
		} catch (@Pc(173) RuntimeException local173) {
			signlink.reporterror("95241, " + arg0 + ", " + 6 + ", " + arg1 + ", " + local173.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(Lclient!LBBVYYXO;II)V")
	private void method692(@OriginalArg(0) Class2_Sub1_Sub3 arg0, @OriginalArg(1) int arg1) {
		try {
			for (@Pc(17) int local17 = 0; local17 < this.anInt903; local17++) {
				@Pc(24) int local24 = this.anIntArray232[local17];
				@Pc(29) Class2_Sub1_Sub1_Sub4_Sub1 local29 = this.aClass2_Sub1_Sub1_Sub4_Sub1Array1[local24];
				@Pc(32) int local32 = arg0.method267();
				if ((local32 & 0x10) != 0) {
					local29.anInt555 = arg0.method293();
					local29.anInt556 = arg0.method294();
				}
				@Pc(54) int local54;
				@Pc(58) int local58;
				if ((local32 & 0x80) != 0) {
					local54 = arg0.method285();
					local58 = arg0.method286();
					local29.method448(local54, anInt878, local58);
					local29.anInt578 = anInt878 + 300;
					local29.anInt579 = arg0.method286();
					local29.anInt580 = arg0.method267();
				}
				if ((local32 & 0x20) != 0) {
					local29.aClass45_1 = Class45.method516(arg0.method269());
					local29.anInt552 = local29.aClass45_1.aByte22;
					local29.anInt561 = local29.aClass45_1.anInt698;
					local29.anInt545 = local29.aClass45_1.anInt697;
					local29.anInt546 = local29.aClass45_1.anInt680;
					local29.anInt547 = local29.aClass45_1.anInt687;
					local29.anInt548 = local29.aClass45_1.anInt696;
					local29.anInt549 = local29.aClass45_1.anInt692;
				}
				if ((local32 & 0x4) != 0) {
					local29.anInt535 = arg0.method293();
					local54 = arg0.method300();
					local29.anInt539 = local54 >> 16;
					local29.anInt538 = anInt878 + (local54 & 0xFFFF);
					local29.anInt536 = 0;
					local29.anInt537 = 0;
					if (local29.anInt538 > anInt878) {
						local29.anInt536 = -1;
					}
					if (local29.anInt535 == 65535) {
						local29.anInt535 = -1;
					}
				}
				if ((local32 & 0x2) != 0) {
					local29.aString13 = arg0.method274();
					local29.anInt553 = 100;
				}
				if ((local32 & 0x1) != 0) {
					local54 = arg0.method294();
					if (local54 == 65535) {
						local54 = -1;
					}
					local58 = arg0.method286();
					if (local54 == local29.anInt573 && local54 != -1) {
						@Pc(207) int local207 = Class10.aClass10Array1[local54].anInt206;
						if (local207 == 1) {
							local29.anInt574 = 0;
							local29.anInt575 = 0;
							local29.anInt576 = local58;
							local29.anInt577 = 0;
						}
						if (local207 == 2) {
							local29.anInt577 = 0;
						}
					} else if (local54 == -1 || local29.anInt573 == -1 || Class10.aClass10Array1[local54].anInt200 >= Class10.aClass10Array1[local29.anInt573].anInt200) {
						local29.anInt573 = local54;
						local29.anInt574 = 0;
						local29.anInt575 = 0;
						local29.anInt576 = local58;
						local29.anInt577 = 0;
						local29.anInt544 = local29.anInt558;
					}
				}
				if ((local32 & 0x8) != 0) {
					local29.anInt565 = arg0.method269();
					if (local29.anInt565 == 65535) {
						local29.anInt565 = -1;
					}
				}
				if ((local32 & 0x40) != 0) {
					local54 = arg0.method286();
					local58 = arg0.method287();
					local29.method448(local54, anInt878, local58);
					local29.anInt578 = anInt878 + 300;
					local29.anInt579 = arg0.method285();
					local29.anInt580 = arg0.method287();
				}
			}
		} catch (@Pc(321) RuntimeException local321) {
			signlink.reporterror("74970, " + arg0 + ", " + arg1 + ", " + 3 + ", " + local321.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "D", descriptor = "(I)V")
	private void method693() {
		try {
			if (this.anInt1043 == 0) {
				this.aStringArray14[0] = "Cancel";
				this.anIntArray235[0] = 1321;
				this.anInt849 = 1;
				if (this.anInt857 == -1) {
					this.method698((byte) 9);
					this.anInt1027 = 0;
					this.anInt866 = 0;
					if (super.anInt809 > 4 && super.anInt810 > 4 && super.anInt809 < 516 && super.anInt810 < 338) {
						if (this.anInt1039 == -1) {
							this.method639();
						} else {
							this.method627(0, 0, super.anInt809, Class31.method366(this.anInt1039), 4, 4, super.anInt810);
						}
					}
					if (this.anInt1027 != this.anInt985) {
						this.anInt985 = this.anInt1027;
					}
					if (this.anInt866 != this.anInt956) {
						this.anInt956 = this.anInt866;
					}
					this.anInt1027 = 0;
					this.anInt866 = 0;
					if (super.anInt809 > 553 && super.anInt810 > 205 && super.anInt809 < 743 && super.anInt810 < 466) {
						if (this.anInt1003 != -1) {
							this.method627(0, 1, super.anInt809, Class31.method366(this.anInt1003), 553, 205, super.anInt810);
						} else if (this.anIntArray252[this.anInt921] != -1) {
							this.method627(0, 1, super.anInt809, Class31.method366(this.anIntArray252[this.anInt921]), 553, 205, super.anInt810);
						}
					}
					if (this.anInt1027 != this.anInt1037) {
						this.aBoolean228 = true;
						this.anInt1037 = this.anInt1027;
					}
					if (this.anInt866 != this.anInt962) {
						this.aBoolean228 = true;
						this.anInt962 = this.anInt866;
					}
					this.anInt1027 = 0;
					this.anInt866 = 0;
					if (super.anInt809 > 17 && super.anInt810 > 357 && super.anInt809 < 496 && super.anInt810 < 453) {
						if (this.anInt974 != -1) {
							this.method627(0, 2, super.anInt809, Class31.method366(this.anInt974), 17, 357, super.anInt810);
						} else if (this.anInt856 != -1) {
							this.method627(0, 3, super.anInt809, Class31.method366(this.anInt856), 17, 357, super.anInt810);
						} else if (super.anInt810 < 434 && super.anInt809 < 426 && this.anInt825 == 0) {
							this.method684(super.anInt809 - 17, super.anInt810 - 357);
						}
					}
					if ((this.anInt974 != -1 || this.anInt856 != -1) && this.anInt1027 != this.anInt1011) {
						this.aBoolean225 = true;
						this.anInt1011 = this.anInt1027;
					}
					if ((this.anInt974 != -1 || this.anInt856 != -1) && this.anInt866 != this.anInt1017) {
						this.aBoolean225 = true;
						this.anInt1017 = this.anInt866;
					}
					@Pc(350) boolean local350 = false;
					while (!local350) {
						local350 = true;
						for (@Pc(356) int local356 = 0; local356 < this.anInt849 - 1; local356++) {
							if (this.anIntArray235[local356] < 1000 && this.anIntArray235[local356 + 1] > 1000) {
								@Pc(377) String local377 = this.aStringArray14[local356];
								this.aStringArray14[local356] = this.aStringArray14[local356 + 1];
								this.aStringArray14[local356 + 1] = local377;
								@Pc(399) int local399 = this.anIntArray235[local356];
								this.anIntArray235[local356] = this.anIntArray235[local356 + 1];
								this.anIntArray235[local356 + 1] = local399;
								@Pc(421) int local421 = this.anIntArray233[local356];
								this.anIntArray233[local356] = this.anIntArray233[local356 + 1];
								this.anIntArray233[local356 + 1] = local421;
								@Pc(443) int local443 = this.anIntArray234[local356];
								this.anIntArray234[local356] = this.anIntArray234[local356 + 1];
								this.anIntArray234[local356 + 1] = local443;
								@Pc(465) int local465 = this.anIntArray236[local356];
								this.anIntArray236[local356] = this.anIntArray236[local356 + 1];
								this.anIntArray236[local356 + 1] = local465;
								local350 = false;
							}
						}
					}
				} else {
					this.anInt1027 = 0;
					this.anInt866 = 0;
					this.method627(0, 0, super.anInt809, Class31.method366(this.anInt857), 0, 0, super.anInt810);
					if (this.anInt1027 != this.anInt985) {
						this.anInt985 = this.anInt1027;
					}
					if (this.anInt866 != this.anInt956) {
						this.anInt956 = this.anInt866;
					}
				}
			}
		} catch (@Pc(495) RuntimeException local495) {
			signlink.reporterror("86081, " + -597 + ", " + local495.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(BLclient!LBBVYYXO;I)V")
	private void method694(@OriginalArg(1) Class2_Sub1_Sub3 arg0, @OriginalArg(2) int arg1) {
		try {
			this.anInt1035 = 0;
			this.anInt903 = 0;
			this.method691(arg1, arg0);
			this.method609(arg0, arg1);
			this.method607(arg1, 241, arg0);
			this.method680(arg0, arg1);
			@Pc(47) int local47;
			for (@Pc(40) int local40 = 0; local40 < this.anInt1035; local40++) {
				local47 = this.anIntArray273[local40];
				if (this.aClass2_Sub1_Sub1_Sub4_Sub2Array1[local47].anInt534 != anInt878) {
					this.aClass2_Sub1_Sub1_Sub4_Sub2Array1[local47] = null;
				}
			}
			if (arg0.anInt283 != arg1) {
				signlink.reporterror("Error packet size mismatch in getplayer pos:" + arg0.anInt283 + " psize:" + arg1);
				throw new RuntimeException("eek");
			}
			for (local47 = 0; local47 < this.anInt902; local47++) {
				if (this.aClass2_Sub1_Sub1_Sub4_Sub2Array1[this.anIntArray231[local47]] == null) {
					signlink.reporterror(this.aString29 + " null entry in pl list - pos:" + local47 + " size:" + this.anInt902);
					throw new RuntimeException("eek");
				}
			}
		} catch (@Pc(127) RuntimeException local127) {
			signlink.reporterror("99314, " + 8 + ", " + arg0 + ", " + arg1 + ", " + local127.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(I)V")
	@Override
	protected void method582() {
		try {
			this.aClass2_Sub1_Sub3_7 = null;
			this.aClass17_25 = null;
			this.aClass17_26 = null;
			this.aClass17_27 = null;
			this.aClass2_Sub1_Sub2_Sub3_16 = null;
			this.aClass2_Sub1_Sub2_Sub3_17 = null;
			this.aClass2_Sub1_Sub2_Sub3_18 = null;
			this.aClass2_Sub1_Sub2_Sub3_19 = null;
			this.aClass2_Sub1_Sub2_Sub3_20 = null;
			this.aClass2_Sub1_Sub2_Sub2_3 = null;
			this.aClass2_Sub1_Sub2_Sub2Array10 = null;
			this.aClass2_Sub1_Sub2_Sub2Array4 = null;
			this.aClass2_Sub1_Sub2_Sub2Array6 = null;
			this.aClass2_Sub1_Sub2_Sub2Array8 = null;
			this.aClass2_Sub1_Sub2_Sub2Array7 = null;
			this.aClass2_Sub1_Sub2_Sub3_1 = null;
			this.aClass2_Sub1_Sub2_Sub3_2 = null;
			this.aClass2_Sub1_Sub2_Sub3_3 = null;
			this.aClass2_Sub1_Sub2_Sub3_4 = null;
			this.aClass2_Sub1_Sub2_Sub3_5 = null;
			this.aByteArray21 = null;
			this.aClass17_16 = null;
			this.aClass17_17 = null;
			this.aClass17_18 = null;
			this.aClass17_19 = null;
			this.aClass17_20 = null;
			this.aClass29_11 = null;
			this.aClass29_12 = null;
			this.aClass2_Sub1_Sub2_Sub3Array4 = null;
			this.aClass2_Sub1_Sub1_Sub4_Sub1Array1 = null;
			this.anIntArray250 = null;
			this.aClass2_Sub1_Sub1_Sub4_Sub2Array1 = null;
			this.anIntArray231 = null;
			this.anIntArray232 = null;
			this.aClass2_Sub1_Sub3Array1 = null;
			this.anIntArray273 = null;
			this.aClass2_Sub1_Sub2_Sub2_11 = null;
			this.aClass2_Sub1_Sub2_Sub2_12 = null;
			this.aClass2_Sub1_Sub2_Sub2_13 = null;
			this.aClass2_Sub1_Sub2_Sub2_14 = null;
			this.aClass2_Sub1_Sub2_Sub2_15 = null;
			this.anIntArrayArray22 = null;
			this.aClass2_Sub1_Sub2_Sub3_13 = null;
			this.aClass2_Sub1_Sub2_Sub3_14 = null;
			this.aClass2_Sub1_Sub2_Sub3_15 = null;
			this.anIntArrayArray25 = null;
			this.anIntArrayArray24 = null;
			this.anIntArray247 = null;
			this.anIntArray248 = null;
			this.aClass2_Sub1_Sub2_Sub2_7 = null;
			if (this.aClass12_1 != null) {
				this.aClass12_1.aBoolean61 = false;
			}
			this.aClass12_1 = null;
			if (this.aClass8_Sub1_1 != null) {
				this.aClass8_Sub1_1.method128();
			}
			this.aClass8_Sub1_1 = null;
			this.aClass2_Sub1_Sub2_Sub3Array3 = null;
			this.aClass2_Sub1_Sub2_Sub2Array5 = null;
			this.aClass2_Sub1_Sub2_Sub2_4 = null;
			try {
				if (this.aClass14_1 != null) {
					this.aClass14_1.method187();
				}
			} catch (@Pc(192) Exception local192) {
			}
			this.aClass14_1 = null;
			this.aClass17_12 = null;
			this.aClass17_13 = null;
			this.aClass17_14 = null;
			this.aClass17_15 = null;
			this.anIntArray274 = null;
			this.anIntArray275 = null;
			this.aClass2_Sub1_Sub2_Sub2Array9 = null;
			this.aClass29ArrayArrayArray1 = null;
			this.aClass29_10 = null;
			this.aClass17_6 = null;
			this.aClass17_7 = null;
			this.aClass17_3 = null;
			this.aClass17_4 = null;
			this.aClass17_5 = null;
			this.aClass2_Sub1_Sub2_Sub3_8 = null;
			this.aClass2_Sub1_Sub2_Sub3_9 = null;
			this.aClass2_Sub1_Sub2_Sub3_10 = null;
			this.aStringArray10 = null;
			this.aLongArray4 = null;
			this.anIntArray227 = null;
			this.aClass17_21 = null;
			this.aClass17_22 = null;
			this.aClass17_23 = null;
			this.aClass17_24 = null;
			this.anIntArray253 = null;
			this.aClass17_8 = null;
			this.aClass17_9 = null;
			this.aClass17_10 = null;
			this.aClass17_11 = null;
			this.method679();
			this.anIntArray269 = null;
			this.aByteArrayArray5 = null;
			this.aByteArrayArray6 = null;
			this.anIntArray270 = null;
			this.anIntArray271 = null;
			this.aClass2_Sub1_Sub3_6 = null;
			this.aClass2_Sub1_Sub3_8 = null;
			this.aClass2_Sub1_Sub3_9 = null;
			this.anIntArrayArrayArray7 = null;
			this.aByteArrayArrayArray8 = null;
			this.aClass34_1 = null;
			this.aClass5Array1 = null;
			this.anIntArray233 = null;
			this.anIntArray234 = null;
			this.anIntArray235 = null;
			this.anIntArray236 = null;
			this.aStringArray14 = null;
			this.method589(this.aByte49);
			Class24.method311();
			Class45.method514();
			Class41.method497();
			Class31.method363();
			Class3.aClass3Array1 = null;
			Class6.aClass6Array1 = null;
			Class7.aClass7Array1 = null;
			Class10.aClass10Array1 = null;
			Class4.aClass4Array1 = null;
			Class4.aClass36_1 = null;
			Class23.aClass23Array1 = null;
			super.aClass17_2 = null;
			Class2_Sub1_Sub1_Sub4_Sub2.aClass36_6 = null;
			Class2_Sub1_Sub2_Sub1.method60();
			Class34.method375();
			Class2_Sub1_Sub1_Sub2.method87();
			Class32.method372();
			System.gc();
		} catch (@Pc(378) RuntimeException local378) {
			signlink.reporterror("31779, " + 1 + ", " + local378.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IILclient!PQPZKUPU;IIBIII)V")
	private void method695(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class31 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		try {
			if (this.aBoolean227) {
				this.anInt996 = 32;
			} else {
				this.anInt996 = 0;
			}
			this.aBoolean227 = false;
			if (arg1 >= arg6 && arg1 < arg6 + 16 && arg0 >= arg7 && arg0 < arg7 + 16) {
				arg2.anInt434 -= this.anInt899 * 4;
				if (arg5 == 1) {
					this.aBoolean228 = true;
				}
				if (arg5 == 2 || arg5 == 3) {
					this.aBoolean225 = true;
				}
			} else if (arg1 >= arg6 && arg1 < arg6 + 16 && arg0 >= arg7 + arg4 - 16 && arg0 < arg7 + arg4) {
				arg2.anInt434 += this.anInt899 * 4;
				if (arg5 == 1) {
					this.aBoolean228 = true;
				}
				if (arg5 == 2 || arg5 == 3) {
					this.aBoolean225 = true;
				}
			} else if (arg1 >= arg6 - this.anInt996 && arg1 < arg6 + this.anInt996 + 16 && arg0 >= arg7 + 16 && arg0 < arg7 + arg4 - 16 && this.anInt899 > 0) {
				@Pc(143) int local143 = (arg4 - 32) * arg4 / arg3;
				if (local143 < 8) {
					local143 = 8;
				}
				@Pc(158) int local158 = arg0 - arg7 - local143 / 2 - 16;
				@Pc(164) int local164 = arg4 - local143 - 32;
				arg2.anInt434 = (arg3 - arg4) * local158 / local164;
				if (arg5 == 1) {
					this.aBoolean228 = true;
				}
				if (arg5 == 2 || arg5 == 3) {
					this.aBoolean225 = true;
				}
				this.aBoolean227 = true;
			}
		} catch (@Pc(193) RuntimeException local193) {
			signlink.reporterror("48228, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + 110 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + local193.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "k", descriptor = "(B)Z")
	private boolean method696(@OriginalArg(0) byte arg0) {
		try {
			if (this.aByte38 != 1) {
				throw new NullPointerException();
			}
			@Pc(5) boolean local5 = false;
			return signlink.wavereplay();
		} catch (@Pc(14) RuntimeException local14) {
			signlink.reporterror("56861, " + arg0 + ", " + local14.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(I[BI)Z")
	private boolean method697(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1) {
		try {
			return arg1 == null ? true : signlink.wavesave(arg1, arg0);
		} catch (@Pc(15) RuntimeException local15) {
			signlink.reporterror("52430, " + arg0 + ", " + arg1 + ", " + -42 + ", " + local15.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "l", descriptor = "(B)V")
	private void method698(@OriginalArg(0) byte arg0) {
		try {
			if (this.anInt837 != 0) {
				@Pc(5) int local5 = 0;
				if (this.anInt992 != 0) {
					local5 = 1;
				}
				for (@Pc(12) int local12 = 0; local12 < 100; local12++) {
					if (this.aStringArray12[local12] != null) {
						@Pc(24) int local24 = this.anIntArray251[local12];
						@Pc(29) String local29 = this.aStringArray11[local12];
						if (local29 != null && local29.startsWith("@cr1@")) {
							local29 = local29.substring(5);
						}
						if (local29 != null && local29.startsWith("@cr2@")) {
							local29 = local29.substring(5);
						}
						if ((local24 == 3 || local24 == 7) && (local24 == 7 || this.anInt842 == 0 || this.anInt842 == 1 && this.method590(local29))) {
							@Pc(82) int local82 = 329 - local5 * 13;
							if (super.anInt809 > 4 && super.anInt810 - 4 > local82 - 10 && super.anInt810 - 4 <= local82 + 3) {
								@Pc(122) int local122 = this.aClass2_Sub1_Sub2_Sub4_3.method560("From:  " + local29 + this.aStringArray12[local12], this.aByte50) + 25;
								if (local122 > 450) {
									local122 = 450;
								}
								if (super.anInt809 < local122 + 4) {
									if (this.anInt967 >= 1) {
										this.aStringArray14[this.anInt849] = "Report abuse @whi@" + local29;
										this.anIntArray235[this.anInt849] = 2564;
										this.anInt849++;
									}
									this.aStringArray14[this.anInt849] = "Add ignore @whi@" + local29;
									this.anIntArray235[this.anInt849] = 2502;
									this.anInt849++;
									this.aStringArray14[this.anInt849] = "Add friend @whi@" + local29;
									this.anIntArray235[this.anInt849] = 2308;
									this.anInt849++;
								}
							}
							local5++;
							if (local5 >= 5) {
								return;
							}
						}
						if ((local24 == 5 || local24 == 6) && this.anInt842 < 2) {
							local5++;
							if (local5 >= 5) {
								return;
							}
						}
					}
				}
				@Pc(238) boolean local238 = false;
			}
		} catch (@Pc(246) RuntimeException local246) {
			signlink.reporterror("14283, " + arg0 + ", " + local246.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(IILclient!LBBVYYXO;)V")
	private void method699(@OriginalArg(1) int arg0, @OriginalArg(2) Class2_Sub1_Sub3 arg1) {
		try {
			this.anInt1035 = 0;
			this.anInt903 = 0;
			this.method721(arg0, arg1);
			this.method722((byte) 7, arg0, arg1);
			this.method692(arg1, arg0);
			@Pc(40) int local40;
			for (@Pc(33) int local33 = 0; local33 < this.anInt1035; local33++) {
				local40 = this.anIntArray273[local33];
				if (this.aClass2_Sub1_Sub1_Sub4_Sub1Array1[local40].anInt534 != anInt878) {
					this.aClass2_Sub1_Sub1_Sub4_Sub1Array1[local40].aClass45_1 = null;
					this.aClass2_Sub1_Sub1_Sub4_Sub1Array1[local40] = null;
				}
			}
			if (arg1.anInt283 != arg0) {
				signlink.reporterror(this.aString29 + " size mismatch in getnpcpos - pos:" + arg1.anInt283 + " psize:" + arg0);
				throw new RuntimeException("eek");
			}
			for (local40 = 0; local40 < this.anInt964; local40++) {
				if (this.aClass2_Sub1_Sub1_Sub4_Sub1Array1[this.anIntArray250[local40]] == null) {
					signlink.reporterror(this.aString29 + " null entry in npc list - pos:" + local40 + " size:" + this.anInt964);
					throw new RuntimeException("eek");
				}
			}
		} catch (@Pc(130) RuntimeException local130) {
			signlink.reporterror("37296, " + 6 + ", " + arg0 + ", " + arg1 + ", " + local130.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IZILclient!VZJVQLEE;)V")
	private void method700(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class2_Sub1_Sub2_Sub2 arg3) {
		try {
			if (!arg1) {
				@Pc(10) int local10 = this.anInt822 + this.anInt1012 & 0x7FF;
				@Pc(18) int local18 = arg0 * arg0 + arg2 * arg2;
				if (local18 <= 6400) {
					@Pc(26) int local26 = Class2_Sub1_Sub1_Sub2.anIntArray54[local10];
					@Pc(30) int local30 = Class2_Sub1_Sub1_Sub2.anIntArray55[local10];
					@Pc(39) int local39 = local26 * 256 / (this.anInt1032 + 256);
					@Pc(48) int local48 = local30 * 256 / (this.anInt1032 + 256);
					@Pc(58) int local58 = arg2 * local39 + arg0 * local48 >> 16;
					@Pc(68) int local68 = arg2 * local48 - arg0 * local39 >> 16;
					if (local18 > 2500) {
						arg3.method488(83 - local68 - arg3.anInt639 / 2 - 4, local58 + 94 - arg3.anInt638 / 2 + 4, this.aClass2_Sub1_Sub2_Sub3_14);
					} else {
						arg3.method482(local58 + 94 + 4 - arg3.anInt638 / 2, 83 - local68 - arg3.anInt639 / 2 - 4);
					}
				}
			}
		} catch (@Pc(122) RuntimeException local122) {
			signlink.reporterror("62103, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local122.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "g", descriptor = "(II)V")
	private void method701(@OriginalArg(1) int arg0) {
		try {
			@Pc(9) Class31 local9 = Class31.method366(arg0);
			for (@Pc(11) int local11 = 0; local11 < local9.anIntArray110.length && local9.anIntArray110[local11] != -1; local11++) {
				@Pc(25) Class31 local25 = Class31.method366(local9.anIntArray110[local11]);
				if (local25.anInt422 == 1) {
					this.method701(local25.anInt433);
				}
				local25.anInt426 = 0;
				local25.anInt428 = 0;
			}
		} catch (@Pc(48) RuntimeException local48) {
			signlink.reporterror("88794, " + 47243 + ", " + arg0 + ", " + local48.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "E", descriptor = "(I)Ljava/net/Socket;")
	public Socket method702(@OriginalArg(0) int arg0) throws IOException {
		return signlink.mainapp == null ? new Socket(InetAddress.getByName(this.getCodeBase().getHost()), arg0) : signlink.opensocket(arg0);
	}

	@OriginalMember(owner = "client!client", name = "F", descriptor = "(I)V")
	private void method703() {
		try {
			for (@Pc(10) int local10 = -1; local10 < this.anInt902; local10++) {
				@Pc(18) int local18;
				if (local10 == -1) {
					local18 = this.anInt901;
				} else {
					local18 = this.anIntArray231[local10];
				}
				@Pc(30) Class2_Sub1_Sub1_Sub4_Sub2 local30 = this.aClass2_Sub1_Sub1_Sub4_Sub2Array1[local18];
				if (local30 != null) {
					this.method596(1, local30);
				}
			}
		} catch (@Pc(44) RuntimeException local44) {
			signlink.reporterror("83703, " + 2 + ", " + local44.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "G", descriptor = "(I)V")
	private void method705() {
		try {
			if (this.anInt1043 == 0) {
				@Pc(6) int local6 = super.anInt814;
				if (this.anInt888 == 1 && super.anInt815 >= 516 && super.anInt816 >= 160 && super.anInt815 <= 765 && super.anInt816 <= 205) {
					local6 = 0;
				}
				@Pc(45) int local45;
				@Pc(48) int local48;
				@Pc(124) int local124;
				if (this.aBoolean224) {
					if (local6 != 1) {
						local45 = super.anInt809;
						local48 = super.anInt810;
						if (this.anInt869 == 0) {
							local45 -= 4;
							local48 -= 4;
						}
						if (this.anInt869 == 1) {
							local45 -= 553;
							local48 -= 205;
						}
						if (this.anInt869 == 2) {
							local45 -= 17;
							local48 -= 357;
						}
						if (local45 < this.anInt870 - 10 || local45 > this.anInt870 + this.anInt872 + 10 || local48 < this.anInt871 - 10 || local48 > this.anInt871 + this.anInt873 + 10) {
							this.aBoolean224 = false;
							if (this.anInt869 == 1) {
								this.aBoolean228 = true;
							}
							if (this.anInt869 == 2) {
								this.aBoolean225 = true;
							}
						}
					}
					if (local6 == 1) {
						local45 = this.anInt870;
						local48 = this.anInt871;
						local124 = this.anInt872;
						@Pc(127) int local127 = super.anInt815;
						@Pc(130) int local130 = super.anInt816;
						if (this.anInt869 == 0) {
							local127 -= 4;
							local130 -= 4;
						}
						if (this.anInt869 == 1) {
							local127 -= 553;
							local130 -= 205;
						}
						if (this.anInt869 == 2) {
							local127 -= 17;
							local130 -= 357;
						}
						@Pc(149) int local149 = -1;
						for (@Pc(151) int local151 = 0; local151 < this.anInt849; local151++) {
							@Pc(166) int local166 = local48 + (this.anInt849 - 1 - local151) * 15 + 31;
							if (local127 > local45 && local127 < local45 + local124 && local130 > local166 - 13 && local130 < local166 + 3) {
								local149 = local151;
							}
						}
						if (local149 != -1) {
							this.method659(local149, 413);
						}
						this.aBoolean224 = false;
						if (this.anInt869 == 1) {
							this.aBoolean228 = true;
						}
						if (this.anInt869 == 2) {
							this.aBoolean225 = true;
							return;
						}
					}
				} else {
					if (local6 == 1 && this.anInt849 > 0) {
						local45 = this.anIntArray235[this.anInt849 - 1];
						if (local45 == 971 || local45 == 364 || local45 == 855 || local45 == 817 || local45 == 168 || local45 == 495 || local45 == 220 || local45 == 34 || local45 == 273 || local45 == 377 || local45 == 138 || local45 == 1759) {
							local48 = this.anIntArray233[this.anInt849 - 1];
							local124 = this.anIntArray234[this.anInt849 - 1];
							@Pc(285) Class31 local285 = Class31.method366(local124);
							if (local285.aBoolean119 || local285.aBoolean126) {
								this.aBoolean193 = false;
								this.anInt994 = 0;
								this.anInt1041 = local124;
								this.anInt1042 = local48;
								this.anInt1043 = 2;
								this.anInt1044 = super.anInt815;
								this.anInt1045 = super.anInt816;
								if (Class31.method366(local124).anInt420 == this.anInt1039) {
									this.anInt1043 = 1;
								}
								if (Class31.method366(local124).anInt420 == this.anInt974) {
									this.anInt1043 = 3;
								}
								return;
							}
						}
					}
					if (local6 == 1 && (this.anInt973 == 1 || this.method686(this.anInt849 - 1)) && this.anInt849 > 2) {
						local6 = 2;
					}
					if (local6 == 1 && this.anInt849 > 0) {
						this.method659(this.anInt849 - 1, 413);
					}
					if (local6 != 2 || this.anInt849 <= 0) {
						return;
					}
					this.method632();
				}
			}
		} catch (@Pc(378) RuntimeException local378) {
			signlink.reporterror("5538, " + 11405 + ", " + local378.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "H", descriptor = "(I)V")
	private void method706() {
		try {
			while (true) {
				@Pc(14) int local14 = this.method579();
				if (local14 == -1) {
					return;
				}
				if (this.anInt1039 != -1 && this.anInt1039 == this.anInt965) {
					if (local14 == 8 && this.aString23.length() > 0) {
						this.aString23 = this.aString23.substring(0, this.aString23.length() - 1);
					}
					if ((local14 >= 97 && local14 <= 122 || local14 >= 65 && local14 <= 90 || local14 >= 48 && local14 <= 57 || local14 == 32) && this.aString23.length() < 12) {
						this.aString23 = this.aString23 + (char) local14;
					}
				} else {
					@Pc(194) int local194;
					if (this.aBoolean182) {
						if (local14 >= 32 && local14 <= 122 && this.aString26.length() < 80) {
							this.aString26 = this.aString26 + (char) local14;
							this.aBoolean225 = true;
						}
						if (local14 == 8 && this.aString26.length() > 0) {
							this.aString26 = this.aString26.substring(0, this.aString26.length() - 1);
							this.aBoolean225 = true;
						}
						if (local14 == 13 || local14 == 10) {
							this.aBoolean182 = false;
							this.aBoolean225 = true;
							@Pc(154) long local154;
							if (this.anInt993 == 1) {
								local154 = Class28.method346(this.aString26);
								this.method620(local154);
							}
							if (this.anInt993 == 2 && this.anInt988 > 0) {
								local154 = Class28.method346(this.aString26);
								this.method675(local154);
							}
							if (this.anInt993 == 3 && this.aString26.length() > 0) {
								this.aClass2_Sub1_Sub3_6.method256(179);
								this.aClass2_Sub1_Sub3_6.method257(0);
								local194 = this.aClass2_Sub1_Sub3_6.anInt283;
								this.aClass2_Sub1_Sub3_6.method263(this.aLong33);
								Class35.method438(this.aString26, this.aClass2_Sub1_Sub3_6);
								this.aClass2_Sub1_Sub3_6.method266(this.aClass2_Sub1_Sub3_6.anInt283 - local194);
								this.aString26 = Class35.method439(this.aString26);
								this.aString26 = Class18.method208(this.aString26);
								this.method640(this.aString26, Class28.method350(Class28.method347(this.aLong33)), 6);
								if (this.anInt842 == 2) {
									this.anInt842 = 1;
									this.aBoolean189 = true;
									this.aClass2_Sub1_Sub3_6.method256(145);
									this.aClass2_Sub1_Sub3_6.method257(this.anInt918);
									this.aClass2_Sub1_Sub3_6.method257(this.anInt842);
									this.aClass2_Sub1_Sub3_6.method257(this.anInt833);
								}
							}
							if (this.anInt993 == 4 && this.anInt919 < 100) {
								local154 = Class28.method346(this.aString26);
								this.method655(local154);
							}
							if (this.anInt993 == 5 && this.anInt919 > 0) {
								local154 = Class28.method346(this.aString26);
								this.method682(local154);
							}
						}
					} else if (this.anInt825 == 1) {
						if (local14 >= 48 && local14 <= 57 && this.aString28.length() < 10) {
							this.aString28 = this.aString28 + (char) local14;
							this.aBoolean225 = true;
						}
						if (local14 == 8 && this.aString28.length() > 0) {
							this.aString28 = this.aString28.substring(0, this.aString28.length() - 1);
							this.aBoolean225 = true;
						}
						if (local14 == 13 || local14 == 10) {
							if (this.aString28.length() > 0) {
								local194 = 0;
								try {
									local194 = Integer.parseInt(this.aString28);
								} catch (@Pc(371) Exception local371) {
								}
								this.aClass2_Sub1_Sub3_6.method256(157);
								this.aClass2_Sub1_Sub3_6.method261(local194);
							}
							this.anInt825 = 0;
							this.aBoolean225 = true;
						}
					} else if (this.anInt825 == 2) {
						if (local14 >= 32 && local14 <= 122 && this.aString28.length() < 12) {
							this.aString28 = this.aString28 + (char) local14;
							this.aBoolean225 = true;
						}
						if (local14 == 8 && this.aString28.length() > 0) {
							this.aString28 = this.aString28.substring(0, this.aString28.length() - 1);
							this.aBoolean225 = true;
						}
						if (local14 == 13 || local14 == 10) {
							if (this.aString28.length() > 0) {
								this.aClass2_Sub1_Sub3_6.method256(190);
								this.aClass2_Sub1_Sub3_6.method263(Class28.method346(this.aString28));
							}
							this.anInt825 = 0;
							this.aBoolean225 = true;
						}
					} else if (this.anInt825 == 3) {
						if (local14 >= 32 && local14 <= 122 && this.aString28.length() < 40) {
							this.aString28 = this.aString28 + (char) local14;
							this.aBoolean225 = true;
						}
						if (local14 == 8 && this.aString28.length() > 0) {
							this.aString28 = this.aString28.substring(0, this.aString28.length() - 1);
							this.aBoolean225 = true;
						}
					} else if (this.anInt974 == -1 && this.anInt857 == -1) {
						if (local14 >= 32 && local14 <= 122 && this.aString27.length() < 80) {
							this.aString27 = this.aString27 + (char) local14;
							this.aBoolean225 = true;
						}
						if (local14 == 8 && this.aString27.length() > 0) {
							this.aString27 = this.aString27.substring(0, this.aString27.length() - 1);
							this.aBoolean225 = true;
						}
						if ((local14 == 13 || local14 == 10) && this.aString27.length() > 0) {
							if (this.anInt967 == 2) {
								if (this.aString27.equals("::clientdrop")) {
									this.method614();
								}
								if (this.aString27.equals("::lag")) {
									this.method638();
								}
								if (this.aString27.equals("::prefetchmusic")) {
									for (local194 = 0; local194 < this.aClass8_Sub1_1.method136(2); local194++) {
										this.aClass8_Sub1_1.method139((byte) 1, local194, 2);
									}
								}
								if (this.aString27.equals("::fpson")) {
									aBoolean200 = true;
								}
								if (this.aString27.equals("::fpsoff")) {
									aBoolean200 = false;
								}
								if (this.aString27.equals("::noclip")) {
									for (local194 = 0; local194 < 4; local194++) {
										for (@Pc(656) int local656 = 1; local656 < 103; local656++) {
											for (@Pc(660) int local660 = 1; local660 < 103; local660++) {
												this.aClass5Array1[local194].anIntArrayArray1[local656][local660] = 0;
											}
										}
									}
								}
							}
							if (this.aString27.startsWith("::")) {
								this.aClass2_Sub1_Sub3_6.method256(138);
								this.aClass2_Sub1_Sub3_6.method257(this.aString27.length() - 1);
								this.aClass2_Sub1_Sub3_6.method264(this.aString27.substring(2));
							} else {
								@Pc(715) String local715 = this.aString27.toLowerCase();
								@Pc(717) byte local717 = 0;
								if (local715.startsWith("yellow:")) {
									local717 = 0;
									this.aString27 = this.aString27.substring(7);
								} else if (local715.startsWith("red:")) {
									local717 = 1;
									this.aString27 = this.aString27.substring(4);
								} else if (local715.startsWith("green:")) {
									local717 = 2;
									this.aString27 = this.aString27.substring(6);
								} else if (local715.startsWith("cyan:")) {
									local717 = 3;
									this.aString27 = this.aString27.substring(5);
								} else if (local715.startsWith("purple:")) {
									local717 = 4;
									this.aString27 = this.aString27.substring(7);
								} else if (local715.startsWith("white:")) {
									local717 = 5;
									this.aString27 = this.aString27.substring(6);
								} else if (local715.startsWith("flash1:")) {
									local717 = 6;
									this.aString27 = this.aString27.substring(7);
								} else if (local715.startsWith("flash2:")) {
									local717 = 7;
									this.aString27 = this.aString27.substring(7);
								} else if (local715.startsWith("flash3:")) {
									local717 = 8;
									this.aString27 = this.aString27.substring(7);
								} else if (local715.startsWith("glow1:")) {
									local717 = 9;
									this.aString27 = this.aString27.substring(6);
								} else if (local715.startsWith("glow2:")) {
									local717 = 10;
									this.aString27 = this.aString27.substring(6);
								} else if (local715.startsWith("glow3:")) {
									local717 = 11;
									this.aString27 = this.aString27.substring(6);
								}
								local715 = this.aString27.toLowerCase();
								@Pc(889) byte local889 = 0;
								if (local715.startsWith("wave:")) {
									local889 = 1;
									this.aString27 = this.aString27.substring(5);
								} else if (local715.startsWith("wave2:")) {
									local889 = 2;
									this.aString27 = this.aString27.substring(6);
								} else if (local715.startsWith("shake:")) {
									local889 = 3;
									this.aString27 = this.aString27.substring(6);
								} else if (local715.startsWith("scroll:")) {
									local889 = 4;
									this.aString27 = this.aString27.substring(7);
								} else if (local715.startsWith("slide:")) {
									local889 = 5;
									this.aString27 = this.aString27.substring(6);
								}
								this.aClass2_Sub1_Sub3_6.method256(197);
								this.aClass2_Sub1_Sub3_6.method257(0);
								@Pc(970) int local970 = this.aClass2_Sub1_Sub3_6.anInt283;
								this.aClass2_Sub1_Sub3_7.anInt283 = 0;
								Class35.method438(this.aString27, this.aClass2_Sub1_Sub3_7);
								this.aClass2_Sub1_Sub3_6.method303(this.aClass2_Sub1_Sub3_7.aByteArray7, this.aClass2_Sub1_Sub3_7.anInt283);
								this.aClass2_Sub1_Sub3_6.method283(local889);
								this.aClass2_Sub1_Sub3_6.method284(local717);
								this.aClass2_Sub1_Sub3_6.method266(this.aClass2_Sub1_Sub3_6.anInt283 - local970);
								this.aString27 = Class35.method439(this.aString27);
								this.aString27 = Class18.method208(this.aString27);
								aClass2_Sub1_Sub1_Sub4_Sub2_1.aString13 = this.aString27;
								aClass2_Sub1_Sub1_Sub4_Sub2_1.anInt557 = local717;
								aClass2_Sub1_Sub1_Sub4_Sub2_1.anInt540 = local889;
								aClass2_Sub1_Sub1_Sub4_Sub2_1.anInt553 = 150;
								if (this.anInt967 == 2) {
									this.method640(aClass2_Sub1_Sub1_Sub4_Sub2_1.aString13, "@cr2@" + aClass2_Sub1_Sub1_Sub4_Sub2_1.aString14, 2);
								} else if (this.anInt967 == 1) {
									this.method640(aClass2_Sub1_Sub1_Sub4_Sub2_1.aString13, "@cr1@" + aClass2_Sub1_Sub1_Sub4_Sub2_1.aString14, 2);
								} else {
									this.method640(aClass2_Sub1_Sub1_Sub4_Sub2_1.aString13, aClass2_Sub1_Sub1_Sub4_Sub2_1.aString14, 2);
								}
								if (this.anInt918 == 2) {
									this.anInt918 = 3;
									this.aBoolean189 = true;
									this.aClass2_Sub1_Sub3_6.method256(145);
									this.aClass2_Sub1_Sub3_6.method257(this.anInt918);
									this.aClass2_Sub1_Sub3_6.method257(this.anInt842);
									this.aClass2_Sub1_Sub3_6.method257(this.anInt833);
								}
							}
							this.aString27 = "";
							this.aBoolean225 = true;
						}
					}
				}
			}
		} catch (@Pc(1123) RuntimeException local1123) {
			signlink.reporterror("39305, " + -979 + ", " + local1123.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "I", descriptor = "(I)V")
	private void method707() {
		try {
			this.aClass17_21.method195();
			Class2_Sub1_Sub2_Sub1.anIntArray9 = this.anIntArray266;
			this.aClass2_Sub1_Sub2_Sub3_13.method541(0, 0);
			if (this.anInt1003 != -1) {
				this.method612(0, 0, Class31.method366(this.anInt1003), 0);
			} else if (this.anIntArray252[this.anInt921] != -1) {
				this.method612(0, 0, Class31.method366(this.anIntArray252[this.anInt921]), 0);
			}
			if (this.aBoolean224 && this.anInt869 == 1) {
				this.method713();
			}
			this.aClass17_21.method196(super.aGraphics2, 553, 205);
			this.aClass17_23.method195();
			Class2_Sub1_Sub2_Sub1.anIntArray9 = this.anIntArray267;
		} catch (@Pc(87) RuntimeException local87) {
			signlink.reporterror("17380, " + -409 + ", " + local87.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!FIMQRVPL;B)V")
	private void method708(@OriginalArg(0) Class2_Sub3 arg0, @OriginalArg(1) byte arg1) {
		try {
			@Pc(1) int local1 = 0;
			@Pc(3) int local3 = -1;
			@Pc(5) int local5 = 0;
			@Pc(7) int local7 = 0;
			if (arg0.anInt226 == 0) {
				local1 = this.aClass34_1.method402(arg0.anInt225, arg0.anInt227, arg0.anInt228);
			}
			if (arg0.anInt226 == 1) {
				local1 = this.aClass34_1.method403(arg0.anInt225, arg0.anInt227, arg0.anInt228);
			}
			if (arg0.anInt226 == 2) {
				local1 = this.aClass34_1.method404(arg0.anInt225, arg0.anInt227, arg0.anInt228);
			}
			if (arg0.anInt226 == 3) {
				local1 = this.aClass34_1.method405(arg0.anInt225, arg0.anInt227, arg0.anInt228);
			}
			if (local1 != 0) {
				@Pc(76) int local76 = this.aClass34_1.method406(arg0.anInt225, arg0.anInt227, arg0.anInt228, local1);
				local3 = local1 >> 14 & 0x7FFF;
				local5 = local76 & 0x1F;
				local7 = local76 >> 6;
			}
			arg0.anInt222 = local3;
			arg0.anInt224 = local5;
			arg0.anInt223 = local7;
			if (arg1 == 7) {
				;
			}
		} catch (@Pc(104) RuntimeException local104) {
			signlink.reporterror("81287, " + arg0 + ", " + arg1 + ", " + local104.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "J", descriptor = "(I)V")
	private void method709() {
		try {
			if (this.anInt849 >= 2 || this.anInt884 != 0 || this.anInt888 != 0) {
				@Pc(40) String local40;
				if (this.anInt884 == 1 && this.anInt849 < 2) {
					local40 = "Use " + this.aString21 + " with...";
				} else if (this.anInt888 == 1 && this.anInt849 < 2) {
					local40 = this.aString22 + "...";
				} else {
					local40 = this.aStringArray14[this.anInt849 - 1];
				}
				if (this.anInt849 > 2) {
					local40 = local40 + "@whi@ / " + (this.anInt849 - 2) + " more options";
				}
				this.aClass2_Sub1_Sub2_Sub4_4.method567(local40, this.anInt1015, 15, 4, anInt878 / 1000, 16777215);
			}
		} catch (@Pc(105) RuntimeException local105) {
			signlink.reporterror("11765, " + 3 + ", " + local105.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "q", descriptor = "(Z)V")
	private void method710() {
		try {
			@Pc(6) int local6 = this.anInt979 * 128 + 64;
			@Pc(13) int local13 = this.anInt980 * 128 + 64;
			@Pc(24) int local24 = this.method717(local6, this.anInt909, local13) - this.anInt981;
			if (this.anInt998 < local6) {
				this.anInt998 += this.anInt982 + (local6 - this.anInt998) * this.anInt983 / 1000;
				if (this.anInt998 > local6) {
					this.anInt998 = local6;
				}
			}
			if (this.anInt998 > local6) {
				this.anInt998 -= this.anInt982 + (this.anInt998 - local6) * this.anInt983 / 1000;
				if (this.anInt998 < local6) {
					this.anInt998 = local6;
				}
			}
			if (this.anInt999 < local24) {
				this.anInt999 += this.anInt982 + (local24 - this.anInt999) * this.anInt983 / 1000;
				if (this.anInt999 > local24) {
					this.anInt999 = local24;
				}
			}
			if (this.anInt999 > local24) {
				this.anInt999 -= this.anInt982 + (this.anInt999 - local24) * this.anInt983 / 1000;
				if (this.anInt999 < local24) {
					this.anInt999 = local24;
				}
			}
			if (this.anInt1000 < local13) {
				this.anInt1000 += this.anInt982 + (local13 - this.anInt1000) * this.anInt983 / 1000;
				if (this.anInt1000 > local13) {
					this.anInt1000 = local13;
				}
			}
			if (this.anInt1000 > local13) {
				this.anInt1000 -= this.anInt982 + (this.anInt1000 - local13) * this.anInt983 / 1000;
				if (this.anInt1000 < local13) {
					this.anInt1000 = local13;
				}
			}
			local6 = this.anInt1047 * 128 + 64;
			local13 = this.anInt1048 * 128 + 64;
			local24 = this.method717(local6, this.anInt909, local13) - this.anInt1049;
			@Pc(222) int local222 = local6 - this.anInt998;
			@Pc(227) int local227 = local24 - this.anInt999;
			@Pc(232) int local232 = local13 - this.anInt1000;
			@Pc(250) int local250 = (int) Math.sqrt((double) (local222 * local222 + local232 * local232));
			@Pc(261) int local261 = (int) (Math.atan2((double) local227, (double) local250) * 325.949D) & 0x7FF;
			@Pc(272) int local272 = (int) (Math.atan2((double) local222, (double) local232) * -325.949D) & 0x7FF;
			if (local261 < 128) {
				local261 = 128;
			}
			if (local261 > 383) {
				local261 = 383;
			}
			if (this.anInt1001 < local261) {
				this.anInt1001 += this.anInt1050 + (local261 - this.anInt1001) * this.anInt1051 / 1000;
				if (this.anInt1001 > local261) {
					this.anInt1001 = local261;
				}
			}
			if (this.anInt1001 > local261) {
				this.anInt1001 -= this.anInt1050 + (this.anInt1001 - local261) * this.anInt1051 / 1000;
				if (this.anInt1001 < local261) {
					this.anInt1001 = local261;
				}
			}
			@Pc(343) int local343 = local272 - this.anInt1002;
			if (local343 > 1024) {
				local343 -= 2048;
			}
			if (local343 < -1024) {
				local343 += 2048;
			}
			if (local343 > 0) {
				this.anInt1002 += this.anInt1050 + local343 * this.anInt1051 / 1000;
				this.anInt1002 &= 0x7FF;
			}
			if (local343 < 0) {
				this.anInt1002 -= this.anInt1050 + -local343 * this.anInt1051 / 1000;
				this.anInt1002 &= 0x7FF;
			}
			@Pc(401) int local401 = local272 - this.anInt1002;
			if (local401 > 1024) {
				local401 -= 2048;
			}
			if (local401 < -1024) {
				local401 += 2048;
			}
			if (local401 < 0 && local343 > 0 || local401 > 0 && local343 < 0) {
				this.anInt1002 = local272;
			}
		} catch (@Pc(422) RuntimeException local422) {
			signlink.reporterror("28141, " + true + ", " + local422.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(I)V")
	@Override
	protected void method581(@OriginalArg(0) int arg0) {
		try {
			if (!this.aBoolean195 && !this.aBoolean192 && !this.aBoolean201) {
				anInt878++;
				@Pc(17) int local17 = 72 / arg0;
				if (this.aBoolean204) {
					this.method630();
				} else {
					this.method715(this.anInt880);
				}
				this.method610();
			}
		} catch (@Pc(34) RuntimeException local34) {
			signlink.reporterror("64943, " + arg0 + ", " + local34.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/String;Z)V")
	private void method711(@OriginalArg(0) String arg0) {
		try {
			if (arg0 == null || arg0.length() == 0) {
				this.anInt826 = 0;
			} else {
				@Pc(12) String local12 = arg0;
				@Pc(15) String[] local15 = new String[100];
				@Pc(22) int local22 = 0;
				while (true) {
					@Pc(26) int local26 = local12.indexOf(" ");
					if (local26 == -1) {
						local12 = local12.trim();
						if (local12.length() > 0) {
							local15[local22++] = local12.toLowerCase();
						}
						this.anInt826 = 0;
						label49: for (local26 = 0; local26 < Class41.anInt647; local26++) {
							@Pc(75) Class41 local75 = Class41.method495(local26);
							if (local75.anInt662 == -1 && local75.aString15 != null) {
								@Pc(86) String local86 = local75.aString15.toLowerCase();
								for (@Pc(88) int local88 = 0; local88 < local22; local88++) {
									if (local86.indexOf(local15[local88]) == -1) {
										continue label49;
									}
								}
								this.aStringArray8[this.anInt826] = local86;
								this.anIntArray212[this.anInt826] = local26;
								this.anInt826++;
								if (this.anInt826 >= this.aStringArray8.length) {
									return;
								}
							}
						}
						return;
					}
					@Pc(35) String local35 = local12.substring(0, local26).trim();
					if (local35.length() > 0) {
						local15[local22++] = local35.toLowerCase();
					}
					local12 = local12.substring(local26 + 1);
				}
			}
		} catch (@Pc(133) RuntimeException local133) {
			signlink.reporterror("18189, " + arg0 + ", " + true + ", " + local133.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILclient!YGGALXYD;BII)V")
	private void method712(@OriginalArg(0) int arg0, @OriginalArg(1) Class45 arg1, @OriginalArg(2) byte arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		try {
			if (this.aByte46 == 5) {
				@Pc(7) boolean local7 = false;
			} else {
				this.anInt895 = -1;
			}
			if (this.anInt849 < 400) {
				if (arg1.anIntArray174 != null) {
					arg1 = arg1.method513();
				}
				if (arg1 != null && arg1.aBoolean159) {
					@Pc(34) String local34 = arg1.aString16;
					if (arg1.anInt686 != 0) {
						local34 = local34 + method594(arg1.anInt686, aClass2_Sub1_Sub1_Sub4_Sub2_1.anInt581) + " (level-" + arg1.anInt686 + ")";
					}
					if (this.anInt884 == 1) {
						this.aStringArray14[this.anInt849] = "Use " + this.aString21 + " with @yel@" + local34;
						this.anIntArray235[this.anInt849] = 151;
						this.anIntArray236[this.anInt849] = arg0;
						this.anIntArray233[this.anInt849] = arg3;
						this.anIntArray234[this.anInt849] = arg4;
						this.anInt849++;
					} else if (this.anInt888 != 1) {
						@Pc(172) int local172;
						if (arg1.aStringArray7 != null) {
							for (local172 = 4; local172 >= 0; local172--) {
								if (arg1.aStringArray7[local172] != null && !arg1.aStringArray7[local172].equalsIgnoreCase("attack")) {
									this.aStringArray14[this.anInt849] = arg1.aStringArray7[local172] + " @yel@" + local34;
									if (local172 == 0) {
										this.anIntArray235[this.anInt849] = 132;
									}
									if (local172 == 1) {
										this.anIntArray235[this.anInt849] = 776;
									}
									if (local172 == 2) {
										this.anIntArray235[this.anInt849] = 565;
									}
									if (local172 == 3) {
										this.anIntArray235[this.anInt849] = 705;
									}
									if (local172 == 4) {
										this.anIntArray235[this.anInt849] = 181;
									}
									this.anIntArray236[this.anInt849] = arg0;
									this.anIntArray233[this.anInt849] = arg3;
									this.anIntArray234[this.anInt849] = arg4;
									this.anInt849++;
								}
							}
						}
						if (arg1.aStringArray7 != null) {
							for (local172 = 4; local172 >= 0; local172--) {
								if (arg1.aStringArray7[local172] != null && arg1.aStringArray7[local172].equalsIgnoreCase("attack")) {
									@Pc(296) short local296 = 0;
									if (arg1.anInt686 > aClass2_Sub1_Sub1_Sub4_Sub2_1.anInt581) {
										local296 = 2000;
									}
									this.aStringArray14[this.anInt849] = arg1.aStringArray7[local172] + " @yel@" + local34;
									if (local172 == 0) {
										this.anIntArray235[this.anInt849] = local296 + 132;
									}
									if (local172 == 1) {
										this.anIntArray235[this.anInt849] = local296 + 776;
									}
									if (local172 == 2) {
										this.anIntArray235[this.anInt849] = local296 + 565;
									}
									if (local172 == 3) {
										this.anIntArray235[this.anInt849] = local296 + 705;
									}
									if (local172 == 4) {
										this.anIntArray235[this.anInt849] = local296 + 181;
									}
									this.anIntArray236[this.anInt849] = arg0;
									this.anIntArray233[this.anInt849] = arg3;
									this.anIntArray234[this.anInt849] = arg4;
									this.anInt849++;
								}
							}
						}
						this.aStringArray14[this.anInt849] = "Examine @yel@" + local34;
						this.anIntArray235[this.anInt849] = 1094;
						this.anIntArray236[this.anInt849] = arg0;
						this.anIntArray233[this.anInt849] = arg3;
						this.anIntArray234[this.anInt849] = arg4;
						this.anInt849++;
					} else if ((this.anInt890 & 0x2) == 2) {
						this.aStringArray14[this.anInt849] = this.aString22 + " @yel@" + local34;
						this.anIntArray235[this.anInt849] = 581;
						this.anIntArray236[this.anInt849] = arg0;
						this.anIntArray233[this.anInt849] = arg3;
						this.anIntArray234[this.anInt849] = arg4;
						this.anInt849++;
						return;
					}
				}
			}
		} catch (@Pc(446) RuntimeException local446) {
			signlink.reporterror("17337, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local446.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "K", descriptor = "(I)V")
	private void method713() {
		try {
			@Pc(2) int local2 = this.anInt870;
			@Pc(5) int local5 = this.anInt871;
			@Pc(8) int local8 = this.anInt872;
			@Pc(11) int local11 = this.anInt873;
			Class2_Sub1_Sub2.method550(local8, local2, 6116423, local5, local11);
			Class2_Sub1_Sub2.method550(local8 - 2, local2 + 1, 0, local5 + 1, 16);
			Class2_Sub1_Sub2.method551(local11 - 19, 0, local2 + 1, local8 - 2, local5 + 18);
			this.aClass2_Sub1_Sub2_Sub4_4.method562("Choose Option", local5 + 14, local2 + 3, 6116423);
			@Pc(63) int local63 = super.anInt809;
			@Pc(66) int local66 = super.anInt810;
			if (this.anInt869 == 0) {
				local63 -= 4;
				local66 -= 4;
			}
			if (this.anInt869 == 1) {
				local63 -= 553;
				local66 -= 205;
			}
			if (this.anInt869 == 2) {
				local63 -= 17;
				local66 -= 357;
			}
			for (@Pc(85) int local85 = 0; local85 < this.anInt849; local85++) {
				@Pc(100) int local100 = local5 + (this.anInt849 - 1 - local85) * 15 + 31;
				@Pc(102) int local102 = 16777215;
				if (local63 > local2 && local63 < local2 + local8 && local66 > local100 - 13 && local66 < local100 + 3) {
					local102 = 16776960;
				}
				this.aClass2_Sub1_Sub2_Sub4_4.method566(local102, this.aStringArray14[local85], true, local2 + 3, this.aBoolean185, local100);
			}
		} catch (@Pc(151) RuntimeException local151) {
			signlink.reporterror("90903, " + 614 + ", " + local151.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(BIIIII)V")
	private void method714(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		try {
			@Pc(8) int local8 = this.aClass34_1.method402(arg0, arg2, arg4);
			@Pc(22) int local22;
			@Pc(28) int local28;
			@Pc(32) int local32;
			@Pc(34) int local34;
			@Pc(56) int local56;
			@Pc(62) int local62;
			if (local8 != 0) {
				local22 = this.aClass34_1.method406(arg0, arg2, arg4, local8);
				local28 = local22 >> 6 & 0x3;
				local32 = local22 & 0x1F;
				local34 = arg1;
				if (local8 > 0) {
					local34 = arg3;
				}
				@Pc(42) int[] local42 = this.aClass2_Sub1_Sub2_Sub2_4.anIntArray164;
				local56 = arg2 * 4 + (103 - arg4) * 512 * 4 + 24624;
				local62 = local8 >> 14 & 0x7FFF;
				@Pc(65) Class24 local65 = Class24.method307(local62);
				if (local65.anInt308 == -1) {
					if (local32 == 0 || local32 == 2) {
						if (local28 == 0) {
							local42[local56] = local34;
							local42[local56 + 512] = local34;
							local42[local56 + 1024] = local34;
							local42[local56 + 1536] = local34;
						} else if (local28 == 1) {
							local42[local56] = local34;
							local42[local56 + 1] = local34;
							local42[local56 + 2] = local34;
							local42[local56 + 3] = local34;
						} else if (local28 == 2) {
							local42[local56 + 3] = local34;
							local42[local56 + 3 + 512] = local34;
							local42[local56 + 3 + 1024] = local34;
							local42[local56 + 3 + 1536] = local34;
						} else if (local28 == 3) {
							local42[local56 + 1536] = local34;
							local42[local56 + 1536 + 1] = local34;
							local42[local56 + 1536 + 2] = local34;
							local42[local56 + 1536 + 3] = local34;
						}
					}
					if (local32 == 3) {
						if (local28 == 0) {
							local42[local56] = local34;
						} else if (local28 == 1) {
							local42[local56 + 3] = local34;
						} else if (local28 == 2) {
							local42[local56 + 3 + 1536] = local34;
						} else if (local28 == 3) {
							local42[local56 + 1536] = local34;
						}
					}
					if (local32 == 2) {
						if (local28 == 3) {
							local42[local56] = local34;
							local42[local56 + 512] = local34;
							local42[local56 + 1024] = local34;
							local42[local56 + 1536] = local34;
						} else if (local28 == 0) {
							local42[local56] = local34;
							local42[local56 + 1] = local34;
							local42[local56 + 2] = local34;
							local42[local56 + 3] = local34;
						} else if (local28 == 1) {
							local42[local56 + 3] = local34;
							local42[local56 + 3 + 512] = local34;
							local42[local56 + 3 + 1024] = local34;
							local42[local56 + 3 + 1536] = local34;
						} else if (local28 == 2) {
							local42[local56 + 1536] = local34;
							local42[local56 + 1536 + 1] = local34;
							local42[local56 + 1536 + 2] = local34;
							local42[local56 + 1536 + 3] = local34;
						}
					}
				} else {
					@Pc(75) Class2_Sub1_Sub2_Sub3 local75 = this.aClass2_Sub1_Sub2_Sub3Array3[local65.anInt308];
					if (local75 != null) {
						@Pc(87) int local87 = (local65.anInt306 * 4 - local75.anInt770) / 2;
						@Pc(97) int local97 = (local65.anInt314 * 4 - local75.anInt771) / 2;
						local75.method541(arg2 * 4 + local87 + 48, (104 - arg4 - local65.anInt314) * 4 + 48 + local97);
					}
				}
			}
			local8 = this.aClass34_1.method404(arg0, arg2, arg4);
			if (local8 != 0) {
				local22 = this.aClass34_1.method406(arg0, arg2, arg4, local8);
				local28 = local22 >> 6 & 0x3;
				local32 = local22 & 0x1F;
				local34 = local8 >> 14 & 0x7FFF;
				@Pc(451) Class24 local451 = Class24.method307(local34);
				@Pc(483) int local483;
				if (local451.anInt308 != -1) {
					@Pc(461) Class2_Sub1_Sub2_Sub3 local461 = this.aClass2_Sub1_Sub2_Sub3Array3[local451.anInt308];
					if (local461 != null) {
						local62 = (local451.anInt306 * 4 - local461.anInt770) / 2;
						local483 = (local451.anInt314 * 4 - local461.anInt771) / 2;
						local461.method541(arg2 * 4 + local62 + 48, (104 - arg4 - local451.anInt314) * 4 + 48 + local483);
					}
				} else if (local32 == 9) {
					local56 = 15658734;
					if (local8 > 0) {
						local56 = 15597568;
					}
					@Pc(520) int[] local520 = this.aClass2_Sub1_Sub2_Sub2_4.anIntArray164;
					local483 = arg2 * 4 + (103 - arg4) * 512 * 4 + 24624;
					if (local28 == 0 || local28 == 2) {
						local520[local483 + 1536] = local56;
						local520[local483 + 1024 + 1] = local56;
						local520[local483 + 512 + 2] = local56;
						local520[local483 + 3] = local56;
					} else {
						local520[local483] = local56;
						local520[local483 + 512 + 1] = local56;
						local520[local483 + 1024 + 2] = local56;
						local520[local483 + 1536 + 3] = local56;
					}
				}
			}
			local8 = this.aClass34_1.method405(arg0, arg2, arg4);
			if (local8 != 0) {
				local22 = local8 >> 14 & 0x7FFF;
				@Pc(615) Class24 local615 = Class24.method307(local22);
				if (local615.anInt308 != -1) {
					@Pc(625) Class2_Sub1_Sub2_Sub3 local625 = this.aClass2_Sub1_Sub2_Sub3Array3[local615.anInt308];
					if (local625 != null) {
						local34 = (local615.anInt306 * 4 - local625.anInt770) / 2;
						@Pc(647) int local647 = (local615.anInt314 * 4 - local625.anInt771) / 2;
						local625.method541(arg2 * 4 + local34 + 48, (104 - arg4 - local615.anInt314) * 4 + 48 + local647);
						return;
					}
				}
			}
		} catch (@Pc(671) RuntimeException local671) {
			signlink.reporterror("21494, " + -21 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local671.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "L", descriptor = "(I)V")
	private void method715(@OriginalArg(0) int arg0) {
		try {
			@Pc(5) int local5 = 94 / arg0;
			@Pc(15) int local15;
			@Pc(22) int local22;
			if (this.anInt915 == 0) {
				local15 = super.anInt805 / 2 - 80;
				local22 = super.anInt806 / 2 + 20;
				local22 += 20;
				if (super.anInt814 == 1 && super.anInt815 >= local15 - 75 && super.anInt815 <= local15 + 75 && super.anInt816 >= local22 - 20 && super.anInt816 <= local22 + 20) {
					this.anInt915 = 3;
					this.anInt929 = 0;
				}
				local15 = super.anInt805 / 2 + 80;
				if (super.anInt814 == 1 && super.anInt815 >= local15 - 75 && super.anInt815 <= local15 + 75 && super.anInt816 >= local22 - 20 && super.anInt816 <= local22 + 20) {
					this.aString18 = "";
					this.aString19 = "Enter your username & password.";
					this.anInt915 = 2;
					this.anInt929 = 0;
				}
			} else if (this.anInt915 == 2) {
				local15 = super.anInt806 / 2 - 40;
				local15 += 30;
				local15 += 25;
				if (super.anInt814 == 1 && super.anInt816 >= local15 - 15 && super.anInt816 < local15) {
					this.anInt929 = 0;
				}
				local15 += 15;
				if (super.anInt814 == 1 && super.anInt816 >= local15 - 15 && super.anInt816 < local15) {
					this.anInt929 = 1;
				}
				local15 += 15;
				local22 = super.anInt805 / 2 - 80;
				@Pc(168) int local168 = super.anInt806 / 2 + 50;
				@Pc(169) int local169 = local168 + 20;
				if (super.anInt814 == 1 && super.anInt815 >= local22 - 75 && super.anInt815 <= local22 + 75 && super.anInt816 >= local169 - 20 && super.anInt816 <= local169 + 20) {
					this.anInt1010 = 0;
					this.method603(this.aString29, this.aString30, false);
					if (this.aBoolean204) {
						return;
					}
				}
				local22 = super.anInt805 / 2 + 80;
				if (super.anInt814 == 1 && super.anInt815 >= local22 - 75 && super.anInt815 <= local22 + 75 && super.anInt816 >= local169 - 20 && super.anInt816 <= local169 + 20) {
					this.anInt915 = 0;
					this.aString29 = "";
					this.aString30 = "";
				}
				while (true) {
					while (true) {
						@Pc(259) int local259 = this.method579();
						if (local259 == -1) {
							return;
						}
						@Pc(264) boolean local264 = false;
						for (@Pc(266) int local266 = 0; local266 < aString31.length(); local266++) {
							if (local259 == aString31.charAt(local266)) {
								local264 = true;
								break;
							}
						}
						if (this.anInt929 == 0) {
							if (local259 == 8 && this.aString29.length() > 0) {
								this.aString29 = this.aString29.substring(0, this.aString29.length() - 1);
							}
							if (local259 == 9 || local259 == 10 || local259 == 13) {
								this.anInt929 = 1;
							}
							if (local264) {
								this.aString29 = this.aString29 + (char) local259;
							}
							if (this.aString29.length() > 12) {
								this.aString29 = this.aString29.substring(0, 12);
							}
						} else if (this.anInt929 == 1) {
							if (local259 == 8 && this.aString30.length() > 0) {
								this.aString30 = this.aString30.substring(0, this.aString30.length() - 1);
							}
							if (local259 == 9 || local259 == 10 || local259 == 13) {
								this.anInt929 = 0;
							}
							if (local264) {
								this.aString30 = this.aString30 + (char) local259;
							}
							if (this.aString30.length() > 20) {
								this.aString30 = this.aString30.substring(0, 20);
							}
						}
					}
				}
			} else if (this.anInt915 == 3) {
				local15 = super.anInt805 / 2;
				local22 = super.anInt806 / 2 + 50;
				@Pc(423) int local423 = local22 + 20;
				if (super.anInt814 == 1 && super.anInt815 >= local15 - 75 && super.anInt815 <= local15 + 75 && super.anInt816 >= local423 - 20 && super.anInt816 <= local423 + 20) {
					this.anInt915 = 0;
					return;
				}
			}
		} catch (@Pc(456) RuntimeException local456) {
			signlink.reporterror("68761, " + arg0 + ", " + local456.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Ljava/lang/String;)V")
	private void method716(@OriginalArg(0) String arg0) {
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

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(IIII)I")
	private int method717(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		try {
			@Pc(3) int local3 = arg0 >> 7;
			@Pc(7) int local7 = arg2 >> 7;
			if (local3 < 0 || local7 < 0 || local3 > 103 || local7 > 103) {
				return 0;
			}
			@Pc(21) int local21 = arg1;
			this.anInt894 += 0;
			if (arg1 < 3 && (this.aByteArrayArrayArray8[1][local3][local7] & 0x2) == 2) {
				local21 = arg1 + 1;
			}
			@Pc(47) int local47 = arg0 & 0x7F;
			@Pc(51) int local51 = arg2 & 0x7F;
			@Pc(79) int local79 = this.anIntArrayArrayArray7[local21][local3][local7] * (128 - local47) + this.anIntArrayArrayArray7[local21][local3 + 1][local7] * local47 >> 7;
			@Pc(111) int local111 = this.anIntArrayArrayArray7[local21][local3][local7 + 1] * (128 - local47) + this.anIntArrayArrayArray7[local21][local3 + 1][local7 + 1] * local47 >> 7;
			return local79 * (128 - local51) + local111 * local51 >> 7;
		} catch (@Pc(124) RuntimeException local124) {
			signlink.reporterror("67481, " + arg0 + ", " + 0 + ", " + arg1 + ", " + arg2 + ", " + local124.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "r", descriptor = "(Z)V")
	private void method718() {
		try {
			this.aBoolean198 = true;
			try {
				@Pc(10) long local10 = System.currentTimeMillis();
				@Pc(12) int local12 = 0;
				@Pc(14) int local14 = 20;
				while (this.aBoolean202) {
					this.anInt952++;
					this.method593();
					this.method593();
					this.method683();
					local12++;
					if (local12 > 10) {
						@Pc(37) long local37 = System.currentTimeMillis();
						@Pc(46) int local46 = (int) (local37 - local10) / 10 - local14;
						local14 = 40 - local46;
						if (local14 < 5) {
							local14 = 5;
						}
						local12 = 0;
						local10 = local37;
					}
					try {
						Thread.sleep((long) local14);
					} catch (@Pc(64) Exception local64) {
					}
				}
			} catch (@Pc(70) Exception local70) {
			}
			this.aBoolean198 = false;
		} catch (@Pc(75) RuntimeException local75) {
			signlink.reporterror("7147, " + true + ", " + local75.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "M", descriptor = "(I)V")
	private void method719() {
		try {
			if (this.aClass17_24 == null) {
				this.method589(this.aByte49);
				super.aClass17_2 = null;
				this.aClass17_3 = null;
				if (this.anInt852 != 7) {
					this.aClass2_Sub1_Sub3_6.method257(120);
				}
				this.aClass17_4 = null;
				this.aClass17_5 = null;
				this.aClass17_6 = null;
				this.aClass17_7 = null;
				this.aClass17_8 = null;
				this.aClass17_9 = null;
				this.aClass17_10 = null;
				this.aClass17_11 = null;
				this.aClass17_24 = new Class17(96, 479, this.method585(), anInt978);
				this.aClass17_22 = new Class17(156, 172, this.method585(), anInt978);
				Class2_Sub1_Sub2.method548();
				this.aClass2_Sub1_Sub2_Sub3_14.method541(0, 0);
				this.aClass17_21 = new Class17(261, 190, this.method585(), anInt978);
				this.aClass17_23 = new Class17(334, 512, this.method585(), anInt978);
				Class2_Sub1_Sub2.method548();
				this.aClass17_25 = new Class17(50, 496, this.method585(), anInt978);
				this.aClass17_26 = new Class17(37, 269, this.method585(), anInt978);
				this.aClass17_27 = new Class17(45, 249, this.method585(), anInt978);
				this.aBoolean183 = true;
				this.aClass17_23.method195();
				Class2_Sub1_Sub2_Sub1.anIntArray9 = this.anIntArray267;
			}
		} catch (@Pc(144) RuntimeException local144) {
			signlink.reporterror("79313, " + 7 + ", " + local144.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "N", descriptor = "(I)V")
	private void method720() {
		try {
			try {
				@Pc(10) int local10 = aClass2_Sub1_Sub1_Sub4_Sub2_1.anInt541 + this.anInt846;
				@Pc(16) int local16 = aClass2_Sub1_Sub1_Sub4_Sub2_1.anInt542 + this.anInt930;
				if (this.anInt957 - local10 < -500 || this.anInt957 - local10 > 500 || this.anInt958 - local16 < -500 || this.anInt958 - local16 > 500) {
					this.anInt957 = local10;
					this.anInt958 = local16;
				}
				if (this.anInt957 != local10) {
					this.anInt957 += (local10 - this.anInt957) / 16;
				}
				if (this.anInt958 != local16) {
					this.anInt958 += (local16 - this.anInt958) / 16;
				}
				if (super.anIntArray210[1] == 1) {
					this.anInt823 += (-this.anInt823 - 24) / 2;
				} else if (super.anIntArray210[2] == 1) {
					this.anInt823 += (24 - this.anInt823) / 2;
				} else {
					this.anInt823 /= 2;
				}
				if (super.anIntArray210[3] == 1) {
					this.anInt824 += (12 - this.anInt824) / 2;
				} else if (super.anIntArray210[4] == 1) {
					this.anInt824 += (-this.anInt824 - 12) / 2;
				} else {
					this.anInt824 /= 2;
				}
				this.anInt822 = this.anInt822 + this.anInt823 / 2 & 0x7FF;
				this.anInt821 += this.anInt824 / 2;
				if (this.anInt821 < 128) {
					this.anInt821 = 128;
				}
				if (this.anInt821 > 383) {
					this.anInt821 = 383;
				}
				@Pc(203) int local203 = this.anInt957 >> 7;
				@Pc(208) int local208 = this.anInt958 >> 7;
				@Pc(218) int local218 = this.method717(this.anInt957, this.anInt909, this.anInt958);
				@Pc(220) int local220 = 0;
				@Pc(236) int local236;
				if (local203 > 3 && local208 > 3 && local203 < 100 && local208 < 100) {
					for (local236 = local203 - 4; local236 <= local203 + 4; local236++) {
						for (@Pc(242) int local242 = local208 - 4; local242 <= local208 + 4; local242++) {
							@Pc(247) int local247 = this.anInt909;
							if (local247 < 3 && (this.aByteArrayArrayArray8[1][local236][local242] & 0x2) == 2) {
								local247++;
							}
							@Pc(274) int local274 = local218 - this.anIntArrayArrayArray7[local247][local236][local242];
							if (local274 > local220) {
								local220 = local274;
							}
						}
					}
				}
				anInt879++;
				if (anInt879 > 101) {
					anInt879 = 0;
					this.aClass2_Sub1_Sub3_6.method256(110);
					this.aClass2_Sub1_Sub3_6.method258(3789);
				}
				local236 = local220 * 192;
				if (local236 > 98048) {
					local236 = 98048;
				}
				if (local236 < 32768) {
					local236 = 32768;
				}
				if (local236 > this.anInt917) {
					this.anInt917 += (local236 - this.anInt917) / 24;
				} else if (local236 < this.anInt917) {
					this.anInt917 += (local236 - this.anInt917) / 80;
				}
			} catch (@Pc(356) Exception local356) {
				signlink.reporterror("glfc_ex " + aClass2_Sub1_Sub1_Sub4_Sub2_1.anInt541 + "," + aClass2_Sub1_Sub1_Sub4_Sub2_1.anInt542 + "," + this.anInt957 + "," + this.anInt958 + "," + this.anInt971 + "," + this.anInt972 + "," + this.anInt874 + "," + this.anInt875);
				throw new RuntimeException("eek");
			}
		} catch (@Pc(406) RuntimeException local406) {
			signlink.reporterror("10097, " + 438 + ", " + local406.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
	@Override
	public AppletContext getAppletContext() {
		return signlink.mainapp == null ? super.getAppletContext() : signlink.mainapp.getAppletContext();
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(BILclient!LBBVYYXO;)V")
	private void method721(@OriginalArg(1) int arg0, @OriginalArg(2) Class2_Sub1_Sub3 arg1) {
		try {
			arg1.method277();
			@Pc(9) int local9 = arg1.method278(8);
			@Pc(15) int local15;
			if (local9 < this.anInt964) {
				for (local15 = local9; local15 < this.anInt964; local15++) {
					this.anIntArray273[this.anInt1035++] = this.anIntArray250[local15];
				}
			}
			if (local9 > this.anInt964) {
				signlink.reporterror(this.aString29 + " Too many npcs");
				throw new RuntimeException("eek");
			}
			this.anInt964 = 0;
			for (local15 = 0; local15 < local9; local15++) {
				@Pc(71) int local71 = this.anIntArray250[local15];
				@Pc(76) Class2_Sub1_Sub1_Sub4_Sub1 local76 = this.aClass2_Sub1_Sub1_Sub4_Sub1Array1[local71];
				@Pc(81) int local81 = arg1.method278(1);
				if (local81 == 0) {
					this.anIntArray250[this.anInt964++] = local71;
					local76.anInt534 = anInt878;
				} else {
					@Pc(104) int local104 = arg1.method278(2);
					if (local104 == 0) {
						this.anIntArray250[this.anInt964++] = local71;
						local76.anInt534 = anInt878;
						this.anIntArray232[this.anInt903++] = local71;
					} else {
						@Pc(155) int local155;
						@Pc(165) int local165;
						if (local104 == 1) {
							this.anIntArray250[this.anInt964++] = local71;
							local76.anInt534 = anInt878;
							local155 = arg1.method278(3);
							local76.method445(local155, false);
							local165 = arg1.method278(1);
							if (local165 == 1) {
								this.anIntArray232[this.anInt903++] = local71;
							}
						} else if (local104 == 2) {
							this.anIntArray250[this.anInt964++] = local71;
							local76.anInt534 = anInt878;
							local155 = arg1.method278(3);
							local76.method445(local155, true);
							local165 = arg1.method278(3);
							local76.method445(local165, true);
							@Pc(223) int local223 = arg1.method278(1);
							if (local223 == 1) {
								this.anIntArray232[this.anInt903++] = local71;
							}
						} else if (local104 == 3) {
							this.anIntArray273[this.anInt1035++] = local71;
						}
					}
				}
			}
		} catch (@Pc(260) RuntimeException local260) {
			signlink.reporterror("29055, " + -90 + ", " + arg0 + ", " + arg1 + ", " + local260.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(BILclient!LBBVYYXO;)V")
	private void method722(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class2_Sub1_Sub3 arg2) {
		try {
			@Pc(6) boolean local6 = false;
			while (arg2.anInt284 + 21 < arg1 * 8) {
				@Pc(29) int local29 = arg2.method278(14);
				if (local29 == 16383) {
					break;
				}
				if (this.aClass2_Sub1_Sub1_Sub4_Sub1Array1[local29] == null) {
					this.aClass2_Sub1_Sub1_Sub4_Sub1Array1[local29] = new Class2_Sub1_Sub1_Sub4_Sub1();
				}
				@Pc(49) Class2_Sub1_Sub1_Sub4_Sub1 local49 = this.aClass2_Sub1_Sub1_Sub4_Sub1Array1[local29];
				this.anIntArray250[this.anInt964++] = local29;
				local49.anInt534 = anInt878;
				local49.aClass45_1 = Class45.method516(arg2.method278(13));
				@Pc(75) int local75 = arg2.method278(1);
				if (local75 == 1) {
					this.anIntArray232[this.anInt903++] = local29;
				}
				@Pc(94) int local94 = arg2.method278(1);
				@Pc(99) int local99 = arg2.method278(5);
				if (local99 > 15) {
					local99 -= 32;
				}
				@Pc(108) int local108 = arg2.method278(5);
				if (local108 > 15) {
					local108 -= 32;
				}
				local49.anInt552 = local49.aClass45_1.aByte22;
				local49.anInt561 = local49.aClass45_1.anInt698;
				local49.anInt545 = local49.aClass45_1.anInt697;
				local49.anInt546 = local49.aClass45_1.anInt680;
				local49.anInt547 = local49.aClass45_1.anInt687;
				local49.anInt548 = local49.aClass45_1.anInt696;
				local49.anInt549 = local49.aClass45_1.anInt692;
				local49.method447(aClass2_Sub1_Sub1_Sub4_Sub2_1.anIntArray143[0] + local108, aClass2_Sub1_Sub1_Sub4_Sub2_1.anIntArray144[0] + local99, this.aByte41, local94 == 1);
			}
			arg2.method279();
		} catch (@Pc(176) RuntimeException local176) {
			signlink.reporterror("53082, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local176.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IBZ)V")
	private void method723(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1) {
		try {
			signlink.anInt1058 = arg0;
			if (arg1) {
				signlink.midi = "voladjust";
			}
		} catch (@Pc(15) RuntimeException local15) {
			signlink.reporterror("13359, " + arg0 + ", " + -75 + ", " + arg1 + ", " + local15.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "i", descriptor = "(II)V")
	private void method724(@OriginalArg(1) int arg0) {
		try {
			Class31.method364(arg0);
		} catch (@Pc(17) RuntimeException local17) {
			signlink.reporterror("82960, " + 3 + ", " + arg0 + ", " + local17.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(IB)Ljava/lang/String;")
	private String method725(@OriginalArg(0) int arg0) {
		try {
			return arg0 < 999999999 ? String.valueOf(arg0) : "*";
		} catch (@Pc(15) RuntimeException local15) {
			signlink.reporterror("54421, " + arg0 + ", " + -1 + ", " + local15.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Z[BI)V")
	private void method726(@OriginalArg(0) boolean arg0, @OriginalArg(1) byte[] arg1) {
		try {
			if (this.aBoolean218) {
				signlink.anInt1059 = arg0 ? 1 : 0;
				signlink.midisave(arg1, arg1.length);
			}
		} catch (@Pc(25) RuntimeException local25) {
			signlink.reporterror("69344, " + arg0 + ", " + arg1 + ", " + 47025 + ", " + local25.toString());
			throw new RuntimeException();
		}
	}
}
