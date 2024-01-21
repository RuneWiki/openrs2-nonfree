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

	@OriginalMember(owner = "client!client", name = "N", descriptor = "I")
	private static int anInt831;

	@OriginalMember(owner = "client!client", name = "Db", descriptor = "I")
	private static int anInt855;

	@OriginalMember(owner = "client!client", name = "cc", descriptor = "Z")
	private static boolean aBoolean223;

	@OriginalMember(owner = "client!client", name = "Qc", descriptor = "I")
	private static int anInt882;

	@OriginalMember(owner = "client!client", name = "Xc", descriptor = "I")
	private static int anInt887;

	@OriginalMember(owner = "client!client", name = "Fd", descriptor = "Z")
	private static boolean aBoolean233;

	@OriginalMember(owner = "client!client", name = "Pd", descriptor = "I")
	private static int anInt910;

	@OriginalMember(owner = "client!client", name = "Ud", descriptor = "I")
	private static int anInt912;

	@OriginalMember(owner = "client!client", name = "Wd", descriptor = "I")
	private static int anInt913;

	@OriginalMember(owner = "client!client", name = "ie", descriptor = "I")
	private static int anInt917;

	@OriginalMember(owner = "client!client", name = "ye", descriptor = "Lclient!QGDSNXKJ;")
	public static Class5_Sub1_Sub2_Sub4_Sub2 aClass5_Sub1_Sub2_Sub4_Sub2_1;

	@OriginalMember(owner = "client!client", name = "Ve", descriptor = "I")
	private static int anInt937;

	@OriginalMember(owner = "client!client", name = "tf", descriptor = "I")
	private static int anInt950;

	@OriginalMember(owner = "client!client", name = "wf", descriptor = "I")
	private static int anInt952;

	@OriginalMember(owner = "client!client", name = "Ef", descriptor = "I")
	private static int anInt954;

	@OriginalMember(owner = "client!client", name = "fh", descriptor = "I")
	private static int anInt992;

	@OriginalMember(owner = "client!client", name = "li", descriptor = "I")
	public static int anInt1018;

	@OriginalMember(owner = "client!client", name = "yi", descriptor = "Z")
	private static boolean aBoolean252;

	@OriginalMember(owner = "client!client", name = "Ri", descriptor = "I")
	private static int anInt1034;

	@OriginalMember(owner = "client!client", name = "Sj", descriptor = "I")
	private static int anInt1054;

	@OriginalMember(owner = "client!client", name = "Tj", descriptor = "I")
	private static int anInt1055;

	@OriginalMember(owner = "client!client", name = "Xj", descriptor = "I")
	public static int anInt1058;

	@OriginalMember(owner = "client!client", name = "Zj", descriptor = "Z")
	private static boolean aBoolean261;

	@OriginalMember(owner = "client!client", name = "ak", descriptor = "I")
	private static int anInt1059;

	@OriginalMember(owner = "client!client", name = "vb", descriptor = "Z")
	private static boolean aBoolean218 = true;

	@OriginalMember(owner = "client!client", name = "ac", descriptor = "[I")
	public static int[] anIntArray222 = new int[32];

	@OriginalMember(owner = "client!client", name = "Cc", descriptor = "Z")
	private static boolean aBoolean228;

	@OriginalMember(owner = "client!client", name = "Tc", descriptor = "[I")
	private static int[] anIntArray233;

	@OriginalMember(owner = "client!client", name = "Td", descriptor = "Ljava/math/BigInteger;")
	private static BigInteger aBigInteger1;

	@OriginalMember(owner = "client!client", name = "Zd", descriptor = "Z")
	private static boolean aBoolean236;

	@OriginalMember(owner = "client!client", name = "Ff", descriptor = "I")
	private static int anInt955;

	@OriginalMember(owner = "client!client", name = "vh", descriptor = "I")
	private static int anInt994;

	@OriginalMember(owner = "client!client", name = "Vh", descriptor = "Ljava/math/BigInteger;")
	private static BigInteger aBigInteger2;

	@OriginalMember(owner = "client!client", name = "ti", descriptor = "[I")
	public static final int[] anIntArray262;

	@OriginalMember(owner = "client!client", name = "Wi", descriptor = "Ljava/lang/String;")
	private static String aString29;

	@OriginalMember(owner = "client!client", name = "Xi", descriptor = "[[I")
	public static final int[][] anIntArrayArray25;

	@OriginalMember(owner = "client!client", name = "Wj", descriptor = "I")
	private static int anInt1057;

	@OriginalMember(owner = "client!client", name = "Yj", descriptor = "Z")
	private static boolean aBoolean260;

	@OriginalMember(owner = "client!client", name = "J", descriptor = "I")
	private int anInt829;

	@OriginalMember(owner = "client!client", name = "K", descriptor = "I")
	private int anInt830;

	@OriginalMember(owner = "client!client", name = "R", descriptor = "I")
	private int anInt832;

	@OriginalMember(owner = "client!client", name = "S", descriptor = "I")
	private int anInt833;

	@OriginalMember(owner = "client!client", name = "T", descriptor = "I")
	private int anInt834;

	@OriginalMember(owner = "client!client", name = "U", descriptor = "I")
	private int anInt835;

	@OriginalMember(owner = "client!client", name = "V", descriptor = "I")
	private int anInt836;

	@OriginalMember(owner = "client!client", name = "W", descriptor = "I")
	private int anInt837;

	@OriginalMember(owner = "client!client", name = "X", descriptor = "I")
	private int anInt838;

	@OriginalMember(owner = "client!client", name = "db", descriptor = "I")
	private int anInt839;

	@OriginalMember(owner = "client!client", name = "eb", descriptor = "I")
	private int anInt840;

	@OriginalMember(owner = "client!client", name = "fb", descriptor = "I")
	private int anInt841;

	@OriginalMember(owner = "client!client", name = "gb", descriptor = "Lclient!TTFRDWZK;")
	private Class5_Sub1_Sub1_Sub3 aClass5_Sub1_Sub1_Sub3_3;

	@OriginalMember(owner = "client!client", name = "hb", descriptor = "Lclient!TTFRDWZK;")
	private Class5_Sub1_Sub1_Sub3 aClass5_Sub1_Sub1_Sub3_4;

	@OriginalMember(owner = "client!client", name = "lb", descriptor = "I")
	private int anInt844;

	@OriginalMember(owner = "client!client", name = "nb", descriptor = "I")
	private int anInt845;

	@OriginalMember(owner = "client!client", name = "ob", descriptor = "I")
	private int anInt846;

	@OriginalMember(owner = "client!client", name = "pb", descriptor = "I")
	private int anInt847;

	@OriginalMember(owner = "client!client", name = "qb", descriptor = "I")
	private int anInt848;

	@OriginalMember(owner = "client!client", name = "sb", descriptor = "I")
	private int anInt850;

	@OriginalMember(owner = "client!client", name = "tb", descriptor = "I")
	private int anInt851;

	@OriginalMember(owner = "client!client", name = "ub", descriptor = "I")
	private int anInt852;

	@OriginalMember(owner = "client!client", name = "zb", descriptor = "Lclient!BEVLZSVU;")
	private Class6 aClass6_3;

	@OriginalMember(owner = "client!client", name = "Ab", descriptor = "Lclient!BEVLZSVU;")
	private Class6 aClass6_4;

	@OriginalMember(owner = "client!client", name = "Bb", descriptor = "Lclient!BEVLZSVU;")
	private Class6 aClass6_5;

	@OriginalMember(owner = "client!client", name = "Eb", descriptor = "I")
	private int anInt856;

	@OriginalMember(owner = "client!client", name = "Gb", descriptor = "I")
	private int anInt857;

	@OriginalMember(owner = "client!client", name = "Ob", descriptor = "I")
	private int anInt858;

	@OriginalMember(owner = "client!client", name = "Rb", descriptor = "I")
	private int anInt860;

	@OriginalMember(owner = "client!client", name = "Xb", descriptor = "I")
	private int anInt863;

	@OriginalMember(owner = "client!client", name = "Yb", descriptor = "I")
	private int anInt864;

	@OriginalMember(owner = "client!client", name = "Zb", descriptor = "I")
	private int anInt865;

	@OriginalMember(owner = "client!client", name = "fc", descriptor = "I")
	private int anInt868;

	@OriginalMember(owner = "client!client", name = "mc", descriptor = "[[[B")
	private byte[][][] aByteArrayArrayArray8;

	@OriginalMember(owner = "client!client", name = "nc", descriptor = "I")
	private int anInt870;

	@OriginalMember(owner = "client!client", name = "tc", descriptor = "I")
	private int anInt871;

	@OriginalMember(owner = "client!client", name = "uc", descriptor = "[[B")
	private byte[][] aByteArrayArray5;

	@OriginalMember(owner = "client!client", name = "yc", descriptor = "I")
	private int anInt873;

	@OriginalMember(owner = "client!client", name = "zc", descriptor = "I")
	private int anInt874;

	@OriginalMember(owner = "client!client", name = "Ac", descriptor = "I")
	private int anInt875;

	@OriginalMember(owner = "client!client", name = "Bc", descriptor = "I")
	private int anInt876;

	@OriginalMember(owner = "client!client", name = "Dc", descriptor = "I")
	private int anInt877;

	@OriginalMember(owner = "client!client", name = "Fc", descriptor = "[I")
	private int[] anIntArray227;

	@OriginalMember(owner = "client!client", name = "Gc", descriptor = "[I")
	private int[] anIntArray228;

	@OriginalMember(owner = "client!client", name = "Jc", descriptor = "I")
	private int anInt879;

	@OriginalMember(owner = "client!client", name = "Lc", descriptor = "I")
	private int anInt881;

	@OriginalMember(owner = "client!client", name = "Mc", descriptor = "[I")
	private int[] anIntArray229;

	@OriginalMember(owner = "client!client", name = "Nc", descriptor = "[I")
	private int[] anIntArray230;

	@OriginalMember(owner = "client!client", name = "Oc", descriptor = "[I")
	private int[] anIntArray231;

	@OriginalMember(owner = "client!client", name = "Pc", descriptor = "[I")
	private int[] anIntArray232;

	@OriginalMember(owner = "client!client", name = "Uc", descriptor = "I")
	private int anInt884;

	@OriginalMember(owner = "client!client", name = "Vc", descriptor = "I")
	private int anInt885;

	@OriginalMember(owner = "client!client", name = "Wc", descriptor = "I")
	private int anInt886;

	@OriginalMember(owner = "client!client", name = "Yc", descriptor = "I")
	private int anInt888;

	@OriginalMember(owner = "client!client", name = "ad", descriptor = "I")
	private int anInt890;

	@OriginalMember(owner = "client!client", name = "ed", descriptor = "I")
	private int anInt891;

	@OriginalMember(owner = "client!client", name = "fd", descriptor = "I")
	private int anInt892;

	@OriginalMember(owner = "client!client", name = "gd", descriptor = "Lclient!TXPLZUUI;")
	private Class40 aClass40_2;

	@OriginalMember(owner = "client!client", name = "jd", descriptor = "I")
	private int anInt893;

	@OriginalMember(owner = "client!client", name = "ld", descriptor = "I")
	private int anInt895;

	@OriginalMember(owner = "client!client", name = "pd", descriptor = "Lclient!JHGVYYQH;")
	private Class9_Sub1 aClass9_Sub1_1;

	@OriginalMember(owner = "client!client", name = "qd", descriptor = "Lclient!TTFRDWZK;")
	private Class5_Sub1_Sub1_Sub3 aClass5_Sub1_Sub1_Sub3_5;

	@OriginalMember(owner = "client!client", name = "ud", descriptor = "J")
	private long aLong29;

	@OriginalMember(owner = "client!client", name = "vd", descriptor = "I")
	private int anInt898;

	@OriginalMember(owner = "client!client", name = "wd", descriptor = "I")
	private int anInt899;

	@OriginalMember(owner = "client!client", name = "xd", descriptor = "I")
	private int anInt900;

	@OriginalMember(owner = "client!client", name = "yd", descriptor = "I")
	private int anInt901;

	@OriginalMember(owner = "client!client", name = "zd", descriptor = "I")
	private int anInt902;

	@OriginalMember(owner = "client!client", name = "Ad", descriptor = "I")
	private int anInt903;

	@OriginalMember(owner = "client!client", name = "Bd", descriptor = "I")
	private int anInt904;

	@OriginalMember(owner = "client!client", name = "Cd", descriptor = "I")
	private int anInt905;

	@OriginalMember(owner = "client!client", name = "Dd", descriptor = "Ljava/net/Socket;")
	private Socket aSocket3;

	@OriginalMember(owner = "client!client", name = "Ed", descriptor = "I")
	private int anInt906;

	@OriginalMember(owner = "client!client", name = "Jd", descriptor = "I")
	private int anInt907;

	@OriginalMember(owner = "client!client", name = "Ld", descriptor = "Lclient!FKSZIRZG;")
	private Class17 aClass17_1;

	@OriginalMember(owner = "client!client", name = "Nd", descriptor = "I")
	private int anInt909;

	@OriginalMember(owner = "client!client", name = "be", descriptor = "I")
	private int anInt916;

	@OriginalMember(owner = "client!client", name = "ce", descriptor = "J")
	private long aLong30;

	@OriginalMember(owner = "client!client", name = "fe", descriptor = "Lclient!SFAIBATY;")
	private Class5_Sub1_Sub1_Sub2 aClass5_Sub1_Sub1_Sub2_1;

	@OriginalMember(owner = "client!client", name = "ge", descriptor = "Lclient!SFAIBATY;")
	private Class5_Sub1_Sub1_Sub2 aClass5_Sub1_Sub1_Sub2_2;

	@OriginalMember(owner = "client!client", name = "he", descriptor = "Lclient!SFAIBATY;")
	private Class5_Sub1_Sub1_Sub2 aClass5_Sub1_Sub1_Sub2_3;

	@OriginalMember(owner = "client!client", name = "le", descriptor = "I")
	private int anInt918;

	@OriginalMember(owner = "client!client", name = "oe", descriptor = "Lclient!TLCMWCVC;")
	private Class38 aClass38_1;

	@OriginalMember(owner = "client!client", name = "qe", descriptor = "I")
	private int anInt920;

	@OriginalMember(owner = "client!client", name = "ue", descriptor = "Lclient!LAXXBEFB;")
	private Class23 aClass23_2;

	@OriginalMember(owner = "client!client", name = "ve", descriptor = "I")
	private int anInt923;

	@OriginalMember(owner = "client!client", name = "ze", descriptor = "I")
	private int anInt925;

	@OriginalMember(owner = "client!client", name = "Ae", descriptor = "I")
	private int anInt926;

	@OriginalMember(owner = "client!client", name = "Be", descriptor = "I")
	private int anInt927;

	@OriginalMember(owner = "client!client", name = "Ce", descriptor = "I")
	private int anInt928;

	@OriginalMember(owner = "client!client", name = "De", descriptor = "I")
	private int anInt929;

	@OriginalMember(owner = "client!client", name = "Fe", descriptor = "I")
	private int anInt930;

	@OriginalMember(owner = "client!client", name = "Ie", descriptor = "Lclient!SFAIBATY;")
	private Class5_Sub1_Sub1_Sub2 aClass5_Sub1_Sub1_Sub2_4;

	@OriginalMember(owner = "client!client", name = "Je", descriptor = "Lclient!SFAIBATY;")
	private Class5_Sub1_Sub1_Sub2 aClass5_Sub1_Sub1_Sub2_5;

	@OriginalMember(owner = "client!client", name = "Le", descriptor = "I")
	private int anInt934;

	@OriginalMember(owner = "client!client", name = "Me", descriptor = "Lclient!TTFRDWZK;")
	private Class5_Sub1_Sub1_Sub3 aClass5_Sub1_Sub1_Sub3_6;

	@OriginalMember(owner = "client!client", name = "Ne", descriptor = "Lclient!TTFRDWZK;")
	private Class5_Sub1_Sub1_Sub3 aClass5_Sub1_Sub1_Sub3_7;

	@OriginalMember(owner = "client!client", name = "Oe", descriptor = "Lclient!TTFRDWZK;")
	private Class5_Sub1_Sub1_Sub3 aClass5_Sub1_Sub1_Sub3_8;

	@OriginalMember(owner = "client!client", name = "Pe", descriptor = "Lclient!TTFRDWZK;")
	private Class5_Sub1_Sub1_Sub3 aClass5_Sub1_Sub1_Sub3_9;

	@OriginalMember(owner = "client!client", name = "Qe", descriptor = "Lclient!TTFRDWZK;")
	private Class5_Sub1_Sub1_Sub3 aClass5_Sub1_Sub1_Sub3_10;

	@OriginalMember(owner = "client!client", name = "Se", descriptor = "[I")
	private int[] anIntArray241;

	@OriginalMember(owner = "client!client", name = "Te", descriptor = "[I")
	private int[] anIntArray242;

	@OriginalMember(owner = "client!client", name = "We", descriptor = "Ljava/lang/String;")
	private String aString24;

	@OriginalMember(owner = "client!client", name = "Ye", descriptor = "I")
	private int anInt938;

	@OriginalMember(owner = "client!client", name = "Ze", descriptor = "I")
	private int anInt939;

	@OriginalMember(owner = "client!client", name = "af", descriptor = "I")
	private int anInt940;

	@OriginalMember(owner = "client!client", name = "bf", descriptor = "I")
	private int anInt941;

	@OriginalMember(owner = "client!client", name = "cf", descriptor = "I")
	private int anInt942;

	@OriginalMember(owner = "client!client", name = "ff", descriptor = "I")
	private int anInt943;

	@OriginalMember(owner = "client!client", name = "jf", descriptor = "I")
	private int anInt945;

	@OriginalMember(owner = "client!client", name = "kf", descriptor = "I")
	private int anInt946;

	@OriginalMember(owner = "client!client", name = "lf", descriptor = "I")
	private int anInt947;

	@OriginalMember(owner = "client!client", name = "nf", descriptor = "Lclient!TTFRDWZK;")
	private Class5_Sub1_Sub1_Sub3 aClass5_Sub1_Sub1_Sub3_11;

	@OriginalMember(owner = "client!client", name = "of", descriptor = "Lclient!TTFRDWZK;")
	private Class5_Sub1_Sub1_Sub3 aClass5_Sub1_Sub1_Sub3_12;

	@OriginalMember(owner = "client!client", name = "qf", descriptor = "I")
	private int anInt948;

	@OriginalMember(owner = "client!client", name = "sf", descriptor = "[Lclient!SFAIBATY;")
	private Class5_Sub1_Sub1_Sub2[] aClass5_Sub1_Sub1_Sub2Array4;

	@OriginalMember(owner = "client!client", name = "uf", descriptor = "I")
	private int anInt951;

	@OriginalMember(owner = "client!client", name = "xf", descriptor = "I")
	private int anInt953;

	@OriginalMember(owner = "client!client", name = "Af", descriptor = "Lclient!SFAIBATY;")
	private Class5_Sub1_Sub1_Sub2 aClass5_Sub1_Sub1_Sub2_6;

	@OriginalMember(owner = "client!client", name = "Bf", descriptor = "Lclient!SFAIBATY;")
	private Class5_Sub1_Sub1_Sub2 aClass5_Sub1_Sub1_Sub2_7;

	@OriginalMember(owner = "client!client", name = "Cf", descriptor = "Lclient!SFAIBATY;")
	private Class5_Sub1_Sub1_Sub2 aClass5_Sub1_Sub1_Sub2_8;

	@OriginalMember(owner = "client!client", name = "If", descriptor = "I")
	private int anInt956;

	@OriginalMember(owner = "client!client", name = "Kf", descriptor = "Lclient!WJVLISUF;")
	private Class46 aClass46_1;

	@OriginalMember(owner = "client!client", name = "Lf", descriptor = "I")
	private int anInt957;

	@OriginalMember(owner = "client!client", name = "Mf", descriptor = "I")
	private int anInt958;

	@OriginalMember(owner = "client!client", name = "Nf", descriptor = "I")
	private int anInt959;

	@OriginalMember(owner = "client!client", name = "Of", descriptor = "I")
	private int anInt960;

	@OriginalMember(owner = "client!client", name = "Pf", descriptor = "Ljava/lang/String;")
	private String aString26;

	@OriginalMember(owner = "client!client", name = "Rf", descriptor = "Lclient!BEVLZSVU;")
	private Class6 aClass6_6;

	@OriginalMember(owner = "client!client", name = "Sf", descriptor = "Lclient!BEVLZSVU;")
	private Class6 aClass6_7;

	@OriginalMember(owner = "client!client", name = "Tf", descriptor = "Lclient!BEVLZSVU;")
	private Class6 aClass6_8;

	@OriginalMember(owner = "client!client", name = "Uf", descriptor = "Lclient!BEVLZSVU;")
	private Class6 aClass6_9;

	@OriginalMember(owner = "client!client", name = "Vf", descriptor = "Lclient!BEVLZSVU;")
	private Class6 aClass6_10;

	@OriginalMember(owner = "client!client", name = "Wf", descriptor = "Lclient!BEVLZSVU;")
	private Class6 aClass6_11;

	@OriginalMember(owner = "client!client", name = "Xf", descriptor = "Lclient!BEVLZSVU;")
	private Class6 aClass6_12;

	@OriginalMember(owner = "client!client", name = "Yf", descriptor = "Lclient!BEVLZSVU;")
	private Class6 aClass6_13;

	@OriginalMember(owner = "client!client", name = "Zf", descriptor = "Lclient!BEVLZSVU;")
	private Class6 aClass6_14;

	@OriginalMember(owner = "client!client", name = "ag", descriptor = "I")
	private int anInt961;

	@OriginalMember(owner = "client!client", name = "bg", descriptor = "I")
	private int anInt962;

	@OriginalMember(owner = "client!client", name = "cg", descriptor = "I")
	private int anInt963;

	@OriginalMember(owner = "client!client", name = "dg", descriptor = "I")
	private int anInt964;

	@OriginalMember(owner = "client!client", name = "eg", descriptor = "I")
	private int anInt965;

	@OriginalMember(owner = "client!client", name = "gg", descriptor = "Lclient!BEVLZSVU;")
	private Class6 aClass6_15;

	@OriginalMember(owner = "client!client", name = "hg", descriptor = "Lclient!BEVLZSVU;")
	private Class6 aClass6_16;

	@OriginalMember(owner = "client!client", name = "ig", descriptor = "Lclient!BEVLZSVU;")
	private Class6 aClass6_17;

	@OriginalMember(owner = "client!client", name = "jg", descriptor = "Lclient!BEVLZSVU;")
	private Class6 aClass6_18;

	@OriginalMember(owner = "client!client", name = "og", descriptor = "I")
	private int anInt969;

	@OriginalMember(owner = "client!client", name = "pg", descriptor = "I")
	private int anInt970;

	@OriginalMember(owner = "client!client", name = "qg", descriptor = "I")
	private int anInt971;

	@OriginalMember(owner = "client!client", name = "rg", descriptor = "I")
	private int anInt972;

	@OriginalMember(owner = "client!client", name = "sg", descriptor = "I")
	private int anInt973;

	@OriginalMember(owner = "client!client", name = "wg", descriptor = "I")
	private int anInt976;

	@OriginalMember(owner = "client!client", name = "xg", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray8;

	@OriginalMember(owner = "client!client", name = "zg", descriptor = "I")
	private int anInt977;

	@OriginalMember(owner = "client!client", name = "Mg", descriptor = "I")
	private int anInt980;

	@OriginalMember(owner = "client!client", name = "Ng", descriptor = "I")
	private int anInt981;

	@OriginalMember(owner = "client!client", name = "Rg", descriptor = "I")
	private int anInt984;

	@OriginalMember(owner = "client!client", name = "Tg", descriptor = "I")
	private int anInt985;

	@OriginalMember(owner = "client!client", name = "Wg", descriptor = "J")
	private long aLong31;

	@OriginalMember(owner = "client!client", name = "Xg", descriptor = "I")
	private int anInt986;

	@OriginalMember(owner = "client!client", name = "Yg", descriptor = "I")
	private int anInt987;

	@OriginalMember(owner = "client!client", name = "Zg", descriptor = "I")
	private int anInt988;

	@OriginalMember(owner = "client!client", name = "ah", descriptor = "I")
	private int anInt989;

	@OriginalMember(owner = "client!client", name = "bh", descriptor = "I")
	private int anInt990;

	@OriginalMember(owner = "client!client", name = "ch", descriptor = "I")
	private int anInt991;

	@OriginalMember(owner = "client!client", name = "eh", descriptor = "J")
	private long aLong32;

	@OriginalMember(owner = "client!client", name = "hh", descriptor = "Lclient!BEVLZSVU;")
	private Class6 aClass6_19;

	@OriginalMember(owner = "client!client", name = "ih", descriptor = "Lclient!BEVLZSVU;")
	private Class6 aClass6_20;

	@OriginalMember(owner = "client!client", name = "jh", descriptor = "Lclient!BEVLZSVU;")
	private Class6 aClass6_21;

	@OriginalMember(owner = "client!client", name = "kh", descriptor = "Lclient!BEVLZSVU;")
	private Class6 aClass6_22;

	@OriginalMember(owner = "client!client", name = "lh", descriptor = "Lclient!BEVLZSVU;")
	private Class6 aClass6_23;

	@OriginalMember(owner = "client!client", name = "mh", descriptor = "Lclient!BEVLZSVU;")
	private Class6 aClass6_24;

	@OriginalMember(owner = "client!client", name = "nh", descriptor = "Lclient!BEVLZSVU;")
	private Class6 aClass6_25;

	@OriginalMember(owner = "client!client", name = "oh", descriptor = "Lclient!BEVLZSVU;")
	private Class6 aClass6_26;

	@OriginalMember(owner = "client!client", name = "ph", descriptor = "Lclient!BEVLZSVU;")
	private Class6 aClass6_27;

	@OriginalMember(owner = "client!client", name = "qh", descriptor = "Ljava/lang/String;")
	private String aString28;

	@OriginalMember(owner = "client!client", name = "rh", descriptor = "[I")
	private int[] anIntArray255;

	@OriginalMember(owner = "client!client", name = "sh", descriptor = "[I")
	private int[] anIntArray256;

	@OriginalMember(owner = "client!client", name = "th", descriptor = "[I")
	private int[] anIntArray257;

	@OriginalMember(owner = "client!client", name = "uh", descriptor = "[I")
	private int[] anIntArray258;

	@OriginalMember(owner = "client!client", name = "wh", descriptor = "I")
	private int anInt995;

	@OriginalMember(owner = "client!client", name = "yh", descriptor = "I")
	private int anInt996;

	@OriginalMember(owner = "client!client", name = "zh", descriptor = "Lclient!TTFRDWZK;")
	private Class5_Sub1_Sub1_Sub3 aClass5_Sub1_Sub1_Sub3_13;

	@OriginalMember(owner = "client!client", name = "Fh", descriptor = "I")
	private int anInt998;

	@OriginalMember(owner = "client!client", name = "Kh", descriptor = "I")
	private int anInt999;

	@OriginalMember(owner = "client!client", name = "Lh", descriptor = "I")
	private int anInt1000;

	@OriginalMember(owner = "client!client", name = "Mh", descriptor = "I")
	private int anInt1001;

	@OriginalMember(owner = "client!client", name = "Ph", descriptor = "I")
	private int anInt1003;

	@OriginalMember(owner = "client!client", name = "Qh", descriptor = "I")
	private int anInt1004;

	@OriginalMember(owner = "client!client", name = "Rh", descriptor = "I")
	private int anInt1005;

	@OriginalMember(owner = "client!client", name = "Sh", descriptor = "I")
	private int anInt1006;

	@OriginalMember(owner = "client!client", name = "Th", descriptor = "I")
	private int anInt1007;

	@OriginalMember(owner = "client!client", name = "Uh", descriptor = "I")
	private int anInt1008;

	@OriginalMember(owner = "client!client", name = "Wh", descriptor = "I")
	private int anInt1009;

	@OriginalMember(owner = "client!client", name = "Xh", descriptor = "I")
	private int anInt1010;

	@OriginalMember(owner = "client!client", name = "Yh", descriptor = "I")
	private int anInt1011;

	@OriginalMember(owner = "client!client", name = "Zh", descriptor = "I")
	private int anInt1012;

	@OriginalMember(owner = "client!client", name = "ai", descriptor = "I")
	private int anInt1013;

	@OriginalMember(owner = "client!client", name = "fi", descriptor = "I")
	private int anInt1016;

	@OriginalMember(owner = "client!client", name = "gi", descriptor = "Lclient!BDJKVJZU;")
	private Class5_Sub1_Sub1_Sub1 aClass5_Sub1_Sub1_Sub1_2;

	@OriginalMember(owner = "client!client", name = "hi", descriptor = "Lclient!BDJKVJZU;")
	private Class5_Sub1_Sub1_Sub1 aClass5_Sub1_Sub1_Sub1_3;

	@OriginalMember(owner = "client!client", name = "ii", descriptor = "Lclient!BDJKVJZU;")
	private Class5_Sub1_Sub1_Sub1 aClass5_Sub1_Sub1_Sub1_4;

	@OriginalMember(owner = "client!client", name = "ji", descriptor = "Lclient!BDJKVJZU;")
	private Class5_Sub1_Sub1_Sub1 aClass5_Sub1_Sub1_Sub1_5;

	@OriginalMember(owner = "client!client", name = "ki", descriptor = "I")
	private int anInt1017;

	@OriginalMember(owner = "client!client", name = "mi", descriptor = "I")
	private int anInt1019;

	@OriginalMember(owner = "client!client", name = "ni", descriptor = "I")
	private int anInt1020;

	@OriginalMember(owner = "client!client", name = "oi", descriptor = "I")
	private int anInt1021;

	@OriginalMember(owner = "client!client", name = "pi", descriptor = "I")
	private int anInt1022;

	@OriginalMember(owner = "client!client", name = "qi", descriptor = "I")
	private int anInt1023;

	@OriginalMember(owner = "client!client", name = "ri", descriptor = "I")
	private int anInt1024;

	@OriginalMember(owner = "client!client", name = "wi", descriptor = "I")
	private int anInt1025;

	@OriginalMember(owner = "client!client", name = "zi", descriptor = "I")
	private int anInt1027;

	@OriginalMember(owner = "client!client", name = "Bi", descriptor = "I")
	private int anInt1028;

	@OriginalMember(owner = "client!client", name = "Ci", descriptor = "I")
	private int anInt1029;

	@OriginalMember(owner = "client!client", name = "Di", descriptor = "Lclient!TTFRDWZK;")
	private Class5_Sub1_Sub1_Sub3 aClass5_Sub1_Sub1_Sub3_14;

	@OriginalMember(owner = "client!client", name = "Ei", descriptor = "I")
	private int anInt1030;

	@OriginalMember(owner = "client!client", name = "Gi", descriptor = "Lclient!SFAIBATY;")
	private Class5_Sub1_Sub1_Sub2 aClass5_Sub1_Sub1_Sub2_9;

	@OriginalMember(owner = "client!client", name = "Hi", descriptor = "Lclient!SFAIBATY;")
	private Class5_Sub1_Sub1_Sub2 aClass5_Sub1_Sub1_Sub2_10;

	@OriginalMember(owner = "client!client", name = "Ii", descriptor = "Lclient!SFAIBATY;")
	private Class5_Sub1_Sub1_Sub2 aClass5_Sub1_Sub1_Sub2_11;

	@OriginalMember(owner = "client!client", name = "Ji", descriptor = "Lclient!SFAIBATY;")
	private Class5_Sub1_Sub1_Sub2 aClass5_Sub1_Sub1_Sub2_12;

	@OriginalMember(owner = "client!client", name = "Ki", descriptor = "Lclient!SFAIBATY;")
	private Class5_Sub1_Sub1_Sub2 aClass5_Sub1_Sub1_Sub2_13;

	@OriginalMember(owner = "client!client", name = "Oi", descriptor = "I")
	private int anInt1032;

	@OriginalMember(owner = "client!client", name = "Qi", descriptor = "I")
	private int anInt1033;

	@OriginalMember(owner = "client!client", name = "Si", descriptor = "Lclient!SFAIBATY;")
	private Class5_Sub1_Sub1_Sub2 aClass5_Sub1_Sub1_Sub2_14;

	@OriginalMember(owner = "client!client", name = "Ti", descriptor = "Lclient!SFAIBATY;")
	private Class5_Sub1_Sub1_Sub2 aClass5_Sub1_Sub1_Sub2_15;

	@OriginalMember(owner = "client!client", name = "Ui", descriptor = "I")
	private int anInt1035;

	@OriginalMember(owner = "client!client", name = "Yi", descriptor = "I")
	private int anInt1036;

	@OriginalMember(owner = "client!client", name = "cj", descriptor = "I")
	private int anInt1039;

	@OriginalMember(owner = "client!client", name = "fj", descriptor = "Lclient!TTFRDWZK;")
	private Class5_Sub1_Sub1_Sub3 aClass5_Sub1_Sub1_Sub3_15;

	@OriginalMember(owner = "client!client", name = "gj", descriptor = "Lclient!TTFRDWZK;")
	private Class5_Sub1_Sub1_Sub3 aClass5_Sub1_Sub1_Sub3_16;

	@OriginalMember(owner = "client!client", name = "hj", descriptor = "I")
	private int anInt1040;

	@OriginalMember(owner = "client!client", name = "lj", descriptor = "[[B")
	private byte[][] aByteArrayArray6;

	@OriginalMember(owner = "client!client", name = "mj", descriptor = "I")
	private int anInt1042;

	@OriginalMember(owner = "client!client", name = "nj", descriptor = "I")
	private int anInt1043;

	@OriginalMember(owner = "client!client", name = "oj", descriptor = "I")
	private int anInt1044;

	@OriginalMember(owner = "client!client", name = "pj", descriptor = "Lclient!TTFRDWZK;")
	private Class5_Sub1_Sub1_Sub3 aClass5_Sub1_Sub1_Sub3_17;

	@OriginalMember(owner = "client!client", name = "sj", descriptor = "J")
	private long aLong33;

	@OriginalMember(owner = "client!client", name = "uj", descriptor = "I")
	private int anInt1045;

	@OriginalMember(owner = "client!client", name = "vj", descriptor = "I")
	private int anInt1046;

	@OriginalMember(owner = "client!client", name = "Aj", descriptor = "I")
	private int anInt1047;

	@OriginalMember(owner = "client!client", name = "Bj", descriptor = "I")
	private int anInt1048;

	@OriginalMember(owner = "client!client", name = "Cj", descriptor = "I")
	private int anInt1049;

	@OriginalMember(owner = "client!client", name = "Dj", descriptor = "Ljava/lang/String;")
	private String aString30;

	@OriginalMember(owner = "client!client", name = "Fj", descriptor = "I")
	private int anInt1051;

	@OriginalMember(owner = "client!client", name = "Gj", descriptor = "[I")
	private int[] anIntArray271;

	@OriginalMember(owner = "client!client", name = "Hj", descriptor = "[I")
	private int[] anIntArray272;

	@OriginalMember(owner = "client!client", name = "Ij", descriptor = "[I")
	private int[] anIntArray273;

	@OriginalMember(owner = "client!client", name = "Jj", descriptor = "I")
	private int anInt1052;

	@OriginalMember(owner = "client!client", name = "Kj", descriptor = "Lclient!SFAIBATY;")
	private Class5_Sub1_Sub1_Sub2 aClass5_Sub1_Sub1_Sub2_16;

	@OriginalMember(owner = "client!client", name = "Lj", descriptor = "Lclient!SFAIBATY;")
	private Class5_Sub1_Sub1_Sub2 aClass5_Sub1_Sub1_Sub2_17;

	@OriginalMember(owner = "client!client", name = "Mj", descriptor = "Lclient!SFAIBATY;")
	private Class5_Sub1_Sub1_Sub2 aClass5_Sub1_Sub1_Sub2_18;

	@OriginalMember(owner = "client!client", name = "Nj", descriptor = "Lclient!SFAIBATY;")
	private Class5_Sub1_Sub1_Sub2 aClass5_Sub1_Sub1_Sub2_19;

	@OriginalMember(owner = "client!client", name = "Oj", descriptor = "Lclient!SFAIBATY;")
	private Class5_Sub1_Sub1_Sub2 aClass5_Sub1_Sub1_Sub2_20;

	@OriginalMember(owner = "client!client", name = "Pj", descriptor = "I")
	private int anInt1053;

	@OriginalMember(owner = "client!client", name = "Uj", descriptor = "I")
	private int anInt1056;

	@OriginalMember(owner = "client!client", name = "L", descriptor = "[I")
	private int[] anIntArray212 = new int[33];

	@OriginalMember(owner = "client!client", name = "M", descriptor = "[I")
	private int[] anIntArray213 = new int[Class39.anInt675];

	@OriginalMember(owner = "client!client", name = "O", descriptor = "Z")
	private boolean aBoolean214 = false;

	@OriginalMember(owner = "client!client", name = "P", descriptor = "Ljava/lang/String;")
	private String aString17 = "";

	@OriginalMember(owner = "client!client", name = "Q", descriptor = "Ljava/lang/String;")
	private String aString18 = "";

	@OriginalMember(owner = "client!client", name = "Y", descriptor = "Z")
	private boolean aBoolean215 = false;

	@OriginalMember(owner = "client!client", name = "Z", descriptor = "[Lclient!TTFRDWZK;")
	private Class5_Sub1_Sub1_Sub3[] aClass5_Sub1_Sub1_Sub3Array4 = new Class5_Sub1_Sub1_Sub3[32];

	@OriginalMember(owner = "client!client", name = "ab", descriptor = "Z")
	private boolean aBoolean216 = false;

	@OriginalMember(owner = "client!client", name = "bb", descriptor = "Lclient!PKHWFJLM;")
	private Class5_Sub1_Sub4 aClass5_Sub1_Sub4_6 = Class5_Sub1_Sub4.method228(676);

	@OriginalMember(owner = "client!client", name = "cb", descriptor = "[Z")
	private boolean[] aBooleanArray11 = new boolean[5];

	@OriginalMember(owner = "client!client", name = "ib", descriptor = "I")
	private int anInt842 = -1;

	@OriginalMember(owner = "client!client", name = "jb", descriptor = "I")
	private int anInt843 = -1;

	@OriginalMember(owner = "client!client", name = "kb", descriptor = "[I")
	private int[] anIntArray214 = new int[] { 17, 24, 34, 40 };

	@OriginalMember(owner = "client!client", name = "mb", descriptor = "Z")
	private boolean aBoolean217 = false;

	@OriginalMember(owner = "client!client", name = "rb", descriptor = "I")
	private int anInt849 = -33719;

	@OriginalMember(owner = "client!client", name = "wb", descriptor = "Z")
	private boolean aBoolean219 = true;

	@OriginalMember(owner = "client!client", name = "xb", descriptor = "I")
	private int anInt853 = -918;

	@OriginalMember(owner = "client!client", name = "yb", descriptor = "I")
	private int anInt854 = 181;

	@OriginalMember(owner = "client!client", name = "Cb", descriptor = "Z")
	private boolean aBoolean220 = false;

	@OriginalMember(owner = "client!client", name = "Fb", descriptor = "[I")
	private int[] anIntArray215 = new int[151];

	@OriginalMember(owner = "client!client", name = "Hb", descriptor = "Z")
	public boolean aBoolean221 = false;

	@OriginalMember(owner = "client!client", name = "Ib", descriptor = "Ljava/lang/String;")
	private String aString19 = "";

	@OriginalMember(owner = "client!client", name = "Jb", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray7 = new int[4][13][13];

	@OriginalMember(owner = "client!client", name = "Kb", descriptor = "[I")
	public int[] anIntArray216 = new int[2000];

	@OriginalMember(owner = "client!client", name = "Lb", descriptor = "[I")
	private int[] anIntArray217 = new int[256];

	@OriginalMember(owner = "client!client", name = "Mb", descriptor = "[I")
	private final int[] anIntArray218 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

	@OriginalMember(owner = "client!client", name = "Nb", descriptor = "B")
	private byte aByte22 = -123;

	@OriginalMember(owner = "client!client", name = "Pb", descriptor = "[I")
	private int[] anIntArray219 = new int[Class39.anInt675];

	@OriginalMember(owner = "client!client", name = "Qb", descriptor = "I")
	private int anInt859 = 2301979;

	@OriginalMember(owner = "client!client", name = "Sb", descriptor = "I")
	private final int anInt861 = 100;

	@OriginalMember(owner = "client!client", name = "Tb", descriptor = "[I")
	private int[] anIntArray220 = new int[100];

	@OriginalMember(owner = "client!client", name = "Ub", descriptor = "Z")
	private boolean aBoolean222 = true;

	@OriginalMember(owner = "client!client", name = "Vb", descriptor = "I")
	private int anInt862 = -951;

	@OriginalMember(owner = "client!client", name = "Wb", descriptor = "[I")
	private int[] anIntArray221 = new int[50];

	@OriginalMember(owner = "client!client", name = "bc", descriptor = "I")
	private int anInt866 = 5;

	@OriginalMember(owner = "client!client", name = "dc", descriptor = "[J")
	private long[] aLongArray3 = new long[100];

	@OriginalMember(owner = "client!client", name = "ec", descriptor = "I")
	private int anInt867 = -165;

	@OriginalMember(owner = "client!client", name = "gc", descriptor = "I")
	private int anInt869 = 2;

	@OriginalMember(owner = "client!client", name = "hc", descriptor = "[I")
	private int[] anIntArray223 = new int[5];

	@OriginalMember(owner = "client!client", name = "ic", descriptor = "Z")
	private boolean aBoolean224 = false;

	@OriginalMember(owner = "client!client", name = "jc", descriptor = "Z")
	private boolean aBoolean225 = false;

	@OriginalMember(owner = "client!client", name = "kc", descriptor = "[I")
	private int[] anIntArray224 = new int[5];

	@OriginalMember(owner = "client!client", name = "lc", descriptor = "Lclient!UEUHLQTT;")
	private Class41 aClass41_10 = new Class41(0);

	@OriginalMember(owner = "client!client", name = "oc", descriptor = "[I")
	private int[] anIntArray225 = new int[100];

	@OriginalMember(owner = "client!client", name = "pc", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray8 = new String[100];

	@OriginalMember(owner = "client!client", name = "qc", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray9 = new String[100];

	@OriginalMember(owner = "client!client", name = "rc", descriptor = "Z")
	private volatile boolean aBoolean226 = false;

	@OriginalMember(owner = "client!client", name = "sc", descriptor = "Z")
	private boolean aBoolean227 = false;

	@OriginalMember(owner = "client!client", name = "vc", descriptor = "I")
	private int anInt872 = 7;

	@OriginalMember(owner = "client!client", name = "wc", descriptor = "Lclient!UEUHLQTT;")
	private Class41 aClass41_11 = new Class41(0);

	@OriginalMember(owner = "client!client", name = "xc", descriptor = "[I")
	private int[] anIntArray226 = new int[Class39.anInt675];

	@OriginalMember(owner = "client!client", name = "Ec", descriptor = "I")
	private int anInt878 = 2;

	@OriginalMember(owner = "client!client", name = "Hc", descriptor = "Z")
	private boolean aBoolean229 = false;

	@OriginalMember(owner = "client!client", name = "Ic", descriptor = "Z")
	private boolean aBoolean230 = true;

	@OriginalMember(owner = "client!client", name = "Kc", descriptor = "I")
	private int anInt880 = 1;

	@OriginalMember(owner = "client!client", name = "Sc", descriptor = "[Lclient!TJMGSZMW;")
	private Class37[] aClass37Array1 = new Class37[4];

	@OriginalMember(owner = "client!client", name = "Zc", descriptor = "I")
	private int anInt889 = -1;

	@OriginalMember(owner = "client!client", name = "bd", descriptor = "[I")
	private int[] anIntArray234 = new int[1000];

	@OriginalMember(owner = "client!client", name = "cd", descriptor = "[I")
	private int[] anIntArray235 = new int[1000];

	@OriginalMember(owner = "client!client", name = "dd", descriptor = "Z")
	private boolean aBoolean231 = false;

	@OriginalMember(owner = "client!client", name = "hd", descriptor = "[Lclient!TTFRDWZK;")
	private Class5_Sub1_Sub1_Sub3[] aClass5_Sub1_Sub1_Sub3Array5 = new Class5_Sub1_Sub1_Sub3[20];

	@OriginalMember(owner = "client!client", name = "id", descriptor = "[I")
	private int[] anIntArray236 = new int[9];

	@OriginalMember(owner = "client!client", name = "kd", descriptor = "I")
	private int anInt894 = 2;

	@OriginalMember(owner = "client!client", name = "md", descriptor = "I")
	private int anInt896 = 519;

	@OriginalMember(owner = "client!client", name = "nd", descriptor = "Z")
	private boolean aBoolean232 = true;

	@OriginalMember(owner = "client!client", name = "rd", descriptor = "[I")
	private int[] anIntArray237 = new int[5];

	@OriginalMember(owner = "client!client", name = "sd", descriptor = "[Lclient!SFAIBATY;")
	private Class5_Sub1_Sub1_Sub2[] aClass5_Sub1_Sub1_Sub2Array2 = new Class5_Sub1_Sub1_Sub2[100];

	@OriginalMember(owner = "client!client", name = "td", descriptor = "I")
	private int anInt897 = -658;

	@OriginalMember(owner = "client!client", name = "Gd", descriptor = "Ljava/lang/String;")
	private String aString20 = "";

	@OriginalMember(owner = "client!client", name = "Hd", descriptor = "Ljava/lang/String;")
	private String aString21 = "";

	@OriginalMember(owner = "client!client", name = "Id", descriptor = "Lclient!UEUHLQTT;")
	private Class41 aClass41_12 = new Class41(0);

	@OriginalMember(owner = "client!client", name = "Kd", descriptor = "Z")
	private boolean aBoolean234 = true;

	@OriginalMember(owner = "client!client", name = "Md", descriptor = "I")
	private int anInt908 = 3;

	@OriginalMember(owner = "client!client", name = "Od", descriptor = "Z")
	private boolean aBoolean235 = false;

	@OriginalMember(owner = "client!client", name = "Qd", descriptor = "Ljava/lang/String;")
	private String aString22 = "";

	@OriginalMember(owner = "client!client", name = "Rd", descriptor = "[J")
	private long[] aLongArray4 = new long[200];

	@OriginalMember(owner = "client!client", name = "Sd", descriptor = "I")
	private int anInt911 = -35541;

	@OriginalMember(owner = "client!client", name = "Vd", descriptor = "[I")
	private int[] anIntArray238 = new int[33];

	@OriginalMember(owner = "client!client", name = "Xd", descriptor = "[I")
	private int[] anIntArray239 = new int[151];

	@OriginalMember(owner = "client!client", name = "Yd", descriptor = "I")
	private int anInt914 = 78;

	@OriginalMember(owner = "client!client", name = "ae", descriptor = "I")
	private int anInt915 = -16153;

	@OriginalMember(owner = "client!client", name = "de", descriptor = "Z")
	private boolean aBoolean237 = false;

	@OriginalMember(owner = "client!client", name = "ee", descriptor = "Lclient!PKHWFJLM;")
	private Class5_Sub1_Sub4 aClass5_Sub1_Sub4_7 = Class5_Sub1_Sub4.method228(676);

	@OriginalMember(owner = "client!client", name = "je", descriptor = "Z")
	private boolean aBoolean238 = false;

	@OriginalMember(owner = "client!client", name = "ke", descriptor = "Z")
	private boolean aBoolean239 = false;

	@OriginalMember(owner = "client!client", name = "me", descriptor = "I")
	private int anInt919 = 1;

	@OriginalMember(owner = "client!client", name = "ne", descriptor = "Ljava/lang/String;")
	private String aString23 = "";

	@OriginalMember(owner = "client!client", name = "pe", descriptor = "[I")
	private int[] anIntArray240 = new int[200];

	@OriginalMember(owner = "client!client", name = "re", descriptor = "I")
	private int anInt921 = -653;

	@OriginalMember(owner = "client!client", name = "se", descriptor = "I")
	private int anInt922 = 44758;

	@OriginalMember(owner = "client!client", name = "te", descriptor = "[Lclient!SFAIBATY;")
	private Class5_Sub1_Sub1_Sub2[] aClass5_Sub1_Sub1_Sub2Array3 = new Class5_Sub1_Sub1_Sub2[13];

	@OriginalMember(owner = "client!client", name = "we", descriptor = "I")
	private int anInt924 = -1;

	@OriginalMember(owner = "client!client", name = "xe", descriptor = "[[[Lclient!UEUHLQTT;")
	private Class41[][][] aClass41ArrayArrayArray1 = new Class41[4][104][104];

	@OriginalMember(owner = "client!client", name = "Ee", descriptor = "Z")
	private boolean aBoolean240 = false;

	@OriginalMember(owner = "client!client", name = "Ge", descriptor = "I")
	private int anInt931 = -1;

	@OriginalMember(owner = "client!client", name = "He", descriptor = "I")
	private int anInt932 = 2;

	@OriginalMember(owner = "client!client", name = "Ke", descriptor = "I")
	private int anInt933 = -29012;

	@OriginalMember(owner = "client!client", name = "Re", descriptor = "I")
	private int anInt935 = -1;

	@OriginalMember(owner = "client!client", name = "Ue", descriptor = "I")
	private int anInt936 = -1;

	@OriginalMember(owner = "client!client", name = "Xe", descriptor = "Z")
	private boolean aBoolean241 = false;

	@OriginalMember(owner = "client!client", name = "df", descriptor = "Lclient!PKHWFJLM;")
	private Class5_Sub1_Sub4 aClass5_Sub1_Sub4_8 = new Class5_Sub1_Sub4(new byte[5000], 0);

	@OriginalMember(owner = "client!client", name = "ef", descriptor = "[Lclient!PDAYFSBN;")
	private Class5_Sub1_Sub2_Sub4_Sub1[] aClass5_Sub1_Sub2_Sub4_Sub1Array1 = new Class5_Sub1_Sub2_Sub4_Sub1[16384];

	@OriginalMember(owner = "client!client", name = "gf", descriptor = "[I")
	private int[] anIntArray243 = new int[16384];

	@OriginalMember(owner = "client!client", name = "hf", descriptor = "I")
	private int anInt944 = 128;

	@OriginalMember(owner = "client!client", name = "mf", descriptor = "[Lclient!TTFRDWZK;")
	private Class5_Sub1_Sub1_Sub3[] aClass5_Sub1_Sub1_Sub3Array6 = new Class5_Sub1_Sub1_Sub3[1000];

	@OriginalMember(owner = "client!client", name = "pf", descriptor = "[Lclient!TTFRDWZK;")
	private Class5_Sub1_Sub1_Sub3[] aClass5_Sub1_Sub1_Sub3Array7 = new Class5_Sub1_Sub1_Sub3[32];

	@OriginalMember(owner = "client!client", name = "rf", descriptor = "I")
	private int anInt949 = -1;

	@OriginalMember(owner = "client!client", name = "vf", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray10 = new String[500];

	@OriginalMember(owner = "client!client", name = "yf", descriptor = "Z")
	private boolean aBoolean242 = true;

	@OriginalMember(owner = "client!client", name = "zf", descriptor = "[I")
	private int[] anIntArray244 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

	@OriginalMember(owner = "client!client", name = "Df", descriptor = "[Lclient!SFAIBATY;")
	private Class5_Sub1_Sub1_Sub2[] aClass5_Sub1_Sub1_Sub2Array5 = new Class5_Sub1_Sub1_Sub2[2];

	@OriginalMember(owner = "client!client", name = "Gf", descriptor = "Ljava/lang/String;")
	private String aString25 = "";

	@OriginalMember(owner = "client!client", name = "Hf", descriptor = "[I")
	private int[] anIntArray245 = new int[2000];

	@OriginalMember(owner = "client!client", name = "Jf", descriptor = "Z")
	private volatile boolean aBoolean243 = false;

	@OriginalMember(owner = "client!client", name = "Qf", descriptor = "[Lclient!TTFRDWZK;")
	private Class5_Sub1_Sub1_Sub3[] aClass5_Sub1_Sub1_Sub3Array8 = new Class5_Sub1_Sub1_Sub3[100];

	@OriginalMember(owner = "client!client", name = "fg", descriptor = "I")
	private int anInt966 = 7759444;

	@OriginalMember(owner = "client!client", name = "kg", descriptor = "I")
	private int anInt967 = -29826;

	@OriginalMember(owner = "client!client", name = "lg", descriptor = "[Lclient!TTFRDWZK;")
	private Class5_Sub1_Sub1_Sub3[] aClass5_Sub1_Sub1_Sub3Array9 = new Class5_Sub1_Sub1_Sub3[32];

	@OriginalMember(owner = "client!client", name = "mg", descriptor = "I")
	private int anInt968 = 428;

	@OriginalMember(owner = "client!client", name = "ng", descriptor = "Z")
	private boolean aBoolean244 = false;

	@OriginalMember(owner = "client!client", name = "tg", descriptor = "Ljava/lang/String;")
	private String aString27 = "";

	@OriginalMember(owner = "client!client", name = "ug", descriptor = "I")
	private int anInt974 = -977;

	@OriginalMember(owner = "client!client", name = "vg", descriptor = "I")
	private int anInt975 = -1;

	@OriginalMember(owner = "client!client", name = "yg", descriptor = "Ljava/util/zip/CRC32;")
	private CRC32 aCRC32_2 = new CRC32();

	@OriginalMember(owner = "client!client", name = "Ag", descriptor = "I")
	private int anInt978 = 50;

	@OriginalMember(owner = "client!client", name = "Bg", descriptor = "[I")
	private int[] anIntArray246 = new int[this.anInt978];

	@OriginalMember(owner = "client!client", name = "Cg", descriptor = "[I")
	private int[] anIntArray247 = new int[this.anInt978];

	@OriginalMember(owner = "client!client", name = "Dg", descriptor = "[I")
	private int[] anIntArray248 = new int[this.anInt978];

	@OriginalMember(owner = "client!client", name = "Eg", descriptor = "[I")
	private int[] anIntArray249 = new int[this.anInt978];

	@OriginalMember(owner = "client!client", name = "Fg", descriptor = "[I")
	private int[] anIntArray250 = new int[this.anInt978];

	@OriginalMember(owner = "client!client", name = "Gg", descriptor = "[I")
	private int[] anIntArray251 = new int[this.anInt978];

	@OriginalMember(owner = "client!client", name = "Hg", descriptor = "[I")
	private int[] anIntArray252 = new int[this.anInt978];

	@OriginalMember(owner = "client!client", name = "Ig", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray11 = new String[this.anInt978];

	@OriginalMember(owner = "client!client", name = "Jg", descriptor = "Z")
	private boolean aBoolean245 = false;

	@OriginalMember(owner = "client!client", name = "Kg", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray12 = new String[200];

	@OriginalMember(owner = "client!client", name = "Lg", descriptor = "I")
	private int anInt979 = 2;

	@OriginalMember(owner = "client!client", name = "Og", descriptor = "I")
	private int anInt982 = 2048;

	@OriginalMember(owner = "client!client", name = "Pg", descriptor = "I")
	private int anInt983 = 2047;

	@OriginalMember(owner = "client!client", name = "Qg", descriptor = "[Lclient!QGDSNXKJ;")
	private Class5_Sub1_Sub2_Sub4_Sub2[] aClass5_Sub1_Sub2_Sub4_Sub2Array1 = new Class5_Sub1_Sub2_Sub4_Sub2[this.anInt982];

	@OriginalMember(owner = "client!client", name = "Sg", descriptor = "[I")
	private int[] anIntArray253 = new int[this.anInt982];

	@OriginalMember(owner = "client!client", name = "Ug", descriptor = "[I")
	private int[] anIntArray254 = new int[this.anInt982];

	@OriginalMember(owner = "client!client", name = "Vg", descriptor = "[Lclient!PKHWFJLM;")
	private Class5_Sub1_Sub4[] aClass5_Sub1_Sub4Array1 = new Class5_Sub1_Sub4[this.anInt982];

	@OriginalMember(owner = "client!client", name = "dh", descriptor = "Z")
	private boolean aBoolean246 = true;

	@OriginalMember(owner = "client!client", name = "gh", descriptor = "I")
	private int anInt993 = 5063219;

	@OriginalMember(owner = "client!client", name = "xh", descriptor = "[I")
	private int[] anIntArray259 = new int[1000];

	@OriginalMember(owner = "client!client", name = "Ah", descriptor = "Z")
	private boolean aBoolean247 = true;

	@OriginalMember(owner = "client!client", name = "Bh", descriptor = "[[I")
	private int[][] anIntArrayArray22 = new int[104][104];

	@OriginalMember(owner = "client!client", name = "Ch", descriptor = "Z")
	private boolean aBoolean248 = false;

	@OriginalMember(owner = "client!client", name = "Dh", descriptor = "I")
	private int anInt997 = -1;

	@OriginalMember(owner = "client!client", name = "Eh", descriptor = "Z")
	private volatile boolean aBoolean249 = false;

	@OriginalMember(owner = "client!client", name = "Gh", descriptor = "[B")
	private byte[] aByteArray21 = new byte[16384];

	@OriginalMember(owner = "client!client", name = "Hh", descriptor = "B")
	private byte aByte23 = -118;

	@OriginalMember(owner = "client!client", name = "Ih", descriptor = "[[I")
	private int[][] anIntArrayArray23 = new int[104][104];

	@OriginalMember(owner = "client!client", name = "Jh", descriptor = "[[I")
	private int[][] anIntArrayArray24 = new int[104][104];

	@OriginalMember(owner = "client!client", name = "Nh", descriptor = "Z")
	private boolean aBoolean250 = false;

	@OriginalMember(owner = "client!client", name = "Oh", descriptor = "I")
	private int anInt1002 = -1;

	@OriginalMember(owner = "client!client", name = "bi", descriptor = "I")
	private int anInt1014 = -1;

	@OriginalMember(owner = "client!client", name = "ci", descriptor = "[I")
	private int[] anIntArray260 = new int[5];

	@OriginalMember(owner = "client!client", name = "di", descriptor = "[Lclient!TTFRDWZK;")
	private Class5_Sub1_Sub1_Sub3[] aClass5_Sub1_Sub1_Sub3Array10 = new Class5_Sub1_Sub1_Sub3[8];

	@OriginalMember(owner = "client!client", name = "ei", descriptor = "I")
	private int anInt1015 = -1;

	@OriginalMember(owner = "client!client", name = "si", descriptor = "[I")
	private int[] anIntArray261 = new int[50];

	@OriginalMember(owner = "client!client", name = "ui", descriptor = "Z")
	private boolean aBoolean251 = true;

	@OriginalMember(owner = "client!client", name = "vi", descriptor = "[Lclient!UZKSGXIW;")
	public Class42[] aClass42Array1 = new Class42[5];

	@OriginalMember(owner = "client!client", name = "xi", descriptor = "I")
	private int anInt1026 = -1;

	@OriginalMember(owner = "client!client", name = "Ai", descriptor = "Z")
	private boolean aBoolean253 = false;

	@OriginalMember(owner = "client!client", name = "Fi", descriptor = "I")
	private int anInt1031 = -47097;

	@OriginalMember(owner = "client!client", name = "Li", descriptor = "Z")
	private boolean aBoolean254 = false;

	@OriginalMember(owner = "client!client", name = "Mi", descriptor = "Z")
	private boolean aBoolean255 = false;

	@OriginalMember(owner = "client!client", name = "Ni", descriptor = "Lclient!PKHWFJLM;")
	private Class5_Sub1_Sub4 aClass5_Sub1_Sub4_9 = Class5_Sub1_Sub4.method228(676);

	@OriginalMember(owner = "client!client", name = "Pi", descriptor = "[I")
	private int[] anIntArray263 = new int[5];

	@OriginalMember(owner = "client!client", name = "Vi", descriptor = "Lclient!RRTTGXYM;")
	private Class36 aClass36_1 = new Class36();

	@OriginalMember(owner = "client!client", name = "Zi", descriptor = "[I")
	private int[] anIntArray264 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

	@OriginalMember(owner = "client!client", name = "aj", descriptor = "I")
	private int anInt1037 = -1;

	@OriginalMember(owner = "client!client", name = "bj", descriptor = "I")
	private int anInt1038 = -1;

	@OriginalMember(owner = "client!client", name = "dj", descriptor = "Z")
	private boolean aBoolean256 = false;

	@OriginalMember(owner = "client!client", name = "ej", descriptor = "Z")
	private boolean aBoolean257 = true;

	@OriginalMember(owner = "client!client", name = "ij", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray13 = new String[5];

	@OriginalMember(owner = "client!client", name = "jj", descriptor = "[Z")
	private boolean[] aBooleanArray12 = new boolean[5];

	@OriginalMember(owner = "client!client", name = "kj", descriptor = "I")
	private int anInt1041 = -551;

	@OriginalMember(owner = "client!client", name = "qj", descriptor = "[I")
	private int[] anIntArray265 = new int[7];

	@OriginalMember(owner = "client!client", name = "rj", descriptor = "Z")
	private boolean aBoolean258 = false;

	@OriginalMember(owner = "client!client", name = "tj", descriptor = "[I")
	private int[] anIntArray266 = new int[50];

	@OriginalMember(owner = "client!client", name = "wj", descriptor = "[I")
	private int[] anIntArray267 = new int[500];

	@OriginalMember(owner = "client!client", name = "xj", descriptor = "[I")
	private int[] anIntArray268 = new int[500];

	@OriginalMember(owner = "client!client", name = "yj", descriptor = "[I")
	private int[] anIntArray269 = new int[500];

	@OriginalMember(owner = "client!client", name = "zj", descriptor = "[I")
	private int[] anIntArray270 = new int[500];

	@OriginalMember(owner = "client!client", name = "Ej", descriptor = "I")
	private int anInt1050 = 3353893;

	@OriginalMember(owner = "client!client", name = "Qj", descriptor = "[I")
	private int[] anIntArray274 = new int[4000];

	@OriginalMember(owner = "client!client", name = "Rj", descriptor = "[I")
	private int[] anIntArray275 = new int[4000];

	@OriginalMember(owner = "client!client", name = "Vj", descriptor = "Z")
	private boolean aBoolean259 = false;

	static {
		@Pc(6) int local6 = 2;
		@Pc(8) int local8;
		for (local8 = 0; local8 < 32; local8++) {
			anIntArray222[local8] = local6 - 1;
			local6 += local6;
		}
		aBoolean228 = true;
		anIntArray233 = new int[99];
		local6 = 0;
		for (local8 = 0; local8 < 99; local8++) {
			@Pc(37) int local37 = local8 + 1;
			@Pc(50) int local50 = (int) ((double) local37 + Math.pow(2.0D, (double) local37 / 7.0D) * 300.0D);
			local6 += local50;
			anIntArray233[local8] = local6 / 4;
		}
		aBigInteger1 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");
		aBoolean236 = true;
		anInt955 = 3;
		anInt994 = -166;
		aBigInteger2 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");
		anIntArray262 = new int[] { 9104, 10275, 7595, 3610, 7975, 8526, 918, 38802, 24466, 10145, 58654, 5027, 1457, 16565, 34991, 25486 };
		aString29 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";
		anIntArrayArray25 = new int[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, 33697, 22433, 2983, 54193 }, { 8741, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003, 25239 }, { 25238, 8742, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };
		anInt1057 = 10;
		aBoolean260 = true;
	}

	@OriginalMember(owner = "client!client", name = "g", descriptor = "(I)V")
	private static void method589() {
		try {
			Class46.aBoolean186 = true;
			Class5_Sub1_Sub1_Sub4.aBoolean206 = true;
			aBoolean261 = true;
			Class8.aBoolean33 = true;
			Class26.aBoolean83 = true;
		} catch (@Pc(24) RuntimeException local24) {
			signlink.reporterror("40666, " + 8 + ", " + local24.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "q", descriptor = "(I)V")
	private static void method637() {
		try {
			Class46.aBoolean186 = false;
			Class5_Sub1_Sub1_Sub4.aBoolean206 = false;
			aBoolean261 = false;
			Class8.aBoolean33 = false;
			Class26.aBoolean83 = false;
		} catch (@Pc(19) RuntimeException local19) {
			signlink.reporterror("95870, " + 0 + ", " + local19.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(IBI)Ljava/lang/String;")
	private static String method658(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) int arg2) {
		try {
			@Pc(4) boolean local4 = false;
			@Pc(14) int local14 = arg2 - arg0;
			if (local14 < -9) {
				return "@red@";
			} else if (local14 < -6) {
				return "@or3@";
			} else if (local14 < -3) {
				return "@or2@";
			} else if (local14 < 0) {
				return "@or1@";
			} else if (local14 > 9) {
				return "@gre@";
			} else if (local14 > 6) {
				return "@gr3@";
			} else if (local14 > 3) {
				return "@gr2@";
			} else if (local14 > 0) {
				return "@gr1@";
			} else {
				return "@yel@";
			}
		} catch (@Pc(55) RuntimeException local55) {
			signlink.reporterror("22641, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local55.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "main", descriptor = "([Ljava/lang/String;)V")
	public static void main(@OriginalArg(0) String[] arg0) {
		try {
			System.out.println("RS2 user client - release #" + 340);
			if (arg0.length == 5) {
				anInt1057 = Integer.parseInt(arg0[0]);
				anInt1058 = Integer.parseInt(arg0[1]);
				if (arg0[2].equals("lowmem")) {
					method589();
				} else if (arg0[2].equals("highmem")) {
					method637();
				} else {
					System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
					return;
				}
				if (arg0[3].equals("free")) {
					aBoolean260 = false;
				} else if (arg0[3].equals("members")) {
					aBoolean260 = true;
				} else {
					System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
					return;
				}
				signlink.anInt1062 = Integer.parseInt(arg0[4]);
				signlink.startpriv(InetAddress.getLocalHost());
				@Pc(87) client local87 = new client();
				local87.method573(381);
			} else {
				System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
			}
		} catch (@Pc(94) Exception local94) {
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(BI)Ljava/lang/String;")
	private static String method707(@OriginalArg(1) int arg0) {
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
			signlink.reporterror("14953, " + 2 + ", " + arg0 + ", " + local94.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "h", descriptor = "(II)Ljava/lang/String;")
	private static String method711(@OriginalArg(0) int arg0) {
		try {
			if (arg0 < 100000) {
				return String.valueOf(arg0);
			} else if (arg0 < 10000000) {
				return arg0 / 1000 + "K";
			} else {
				return arg0 / 1000000 + "M";
			}
		} catch (@Pc(37) RuntimeException local37) {
			signlink.reporterror("40550, " + arg0 + ", " + 0 + ", " + local37.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIIZIIIIIII)Z")
	private boolean method586(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(11) int arg10) {
		try {
			@Pc(11) int local11;
			for (@Pc(7) int local7 = 0; local7 < 104; local7++) {
				for (local11 = 0; local11 < 104; local11++) {
					this.anIntArrayArray24[local7][local11] = 0;
					this.anIntArrayArray22[local7][local11] = 99999999;
				}
			}
			local11 = arg1;
			@Pc(39) int local39 = arg0;
			this.anIntArrayArray24[arg1][arg0] = 99;
			this.anIntArrayArray22[arg1][arg0] = 0;
			@Pc(55) byte local55 = 0;
			@Pc(57) int local57 = 0;
			this.anIntArray274[0] = arg1;
			@Pc(66) int local66 = local55 + 1;
			this.anIntArray275[0] = arg0;
			@Pc(70) boolean local70 = false;
			@Pc(74) int local74 = this.anIntArray274.length;
			@Pc(81) int[][] local81 = this.aClass37Array1[this.anInt1052].anIntArrayArray15;
			@Pc(192) int local192;
			while (local57 != local66) {
				local11 = this.anIntArray274[local57];
				local39 = this.anIntArray275[local57];
				local57 = (local57 + 1) % local74;
				if (local11 == arg9 && local39 == arg10) {
					local70 = true;
					break;
				}
				if (arg2 != 0) {
					if ((arg2 < 5 || arg2 == 10) && this.aClass37Array1[this.anInt1052].method433(arg2 - 1, local11, arg9, arg10, local39, arg8)) {
						local70 = true;
						break;
					}
					if (arg2 < 10 && this.aClass37Array1[this.anInt1052].method434(arg8, arg2 - 1, local39, local11, arg9, arg10)) {
						local70 = true;
						break;
					}
				}
				if (arg5 != 0 && arg6 != 0 && this.aClass37Array1[this.anInt1052].method435(local39, arg10, arg6, arg7, arg9, arg5, local11)) {
					local70 = true;
					break;
				}
				local192 = this.anIntArrayArray22[local11][local39] + 1;
				if (local11 > 0 && this.anIntArrayArray24[local11 - 1][local39] == 0 && (local81[local11 - 1][local39] & 0x1280108) == 0) {
					this.anIntArray274[local66] = local11 - 1;
					this.anIntArray275[local66] = local39;
					local66 = (local66 + 1) % local74;
					this.anIntArrayArray24[local11 - 1][local39] = 2;
					this.anIntArrayArray22[local11 - 1][local39] = local192;
				}
				if (local11 < 103 && this.anIntArrayArray24[local11 + 1][local39] == 0 && (local81[local11 + 1][local39] & 0x1280180) == 0) {
					this.anIntArray274[local66] = local11 + 1;
					this.anIntArray275[local66] = local39;
					local66 = (local66 + 1) % local74;
					this.anIntArrayArray24[local11 + 1][local39] = 8;
					this.anIntArrayArray22[local11 + 1][local39] = local192;
				}
				if (local39 > 0 && this.anIntArrayArray24[local11][local39 - 1] == 0 && (local81[local11][local39 - 1] & 0x1280102) == 0) {
					this.anIntArray274[local66] = local11;
					this.anIntArray275[local66] = local39 - 1;
					local66 = (local66 + 1) % local74;
					this.anIntArrayArray24[local11][local39 - 1] = 1;
					this.anIntArrayArray22[local11][local39 - 1] = local192;
				}
				if (local39 < 103 && this.anIntArrayArray24[local11][local39 + 1] == 0 && (local81[local11][local39 + 1] & 0x1280120) == 0) {
					this.anIntArray274[local66] = local11;
					this.anIntArray275[local66] = local39 + 1;
					local66 = (local66 + 1) % local74;
					this.anIntArrayArray24[local11][local39 + 1] = 4;
					this.anIntArrayArray22[local11][local39 + 1] = local192;
				}
				if (local11 > 0 && local39 > 0 && this.anIntArrayArray24[local11 - 1][local39 - 1] == 0 && (local81[local11 - 1][local39 - 1] & 0x128010E) == 0 && (local81[local11 - 1][local39] & 0x1280108) == 0 && (local81[local11][local39 - 1] & 0x1280102) == 0) {
					this.anIntArray274[local66] = local11 - 1;
					this.anIntArray275[local66] = local39 - 1;
					local66 = (local66 + 1) % local74;
					this.anIntArrayArray24[local11 - 1][local39 - 1] = 3;
					this.anIntArrayArray22[local11 - 1][local39 - 1] = local192;
				}
				if (local11 < 103 && local39 > 0 && this.anIntArrayArray24[local11 + 1][local39 - 1] == 0 && (local81[local11 + 1][local39 - 1] & 0x1280183) == 0 && (local81[local11 + 1][local39] & 0x1280180) == 0 && (local81[local11][local39 - 1] & 0x1280102) == 0) {
					this.anIntArray274[local66] = local11 + 1;
					this.anIntArray275[local66] = local39 - 1;
					local66 = (local66 + 1) % local74;
					this.anIntArrayArray24[local11 + 1][local39 - 1] = 9;
					this.anIntArrayArray22[local11 + 1][local39 - 1] = local192;
				}
				if (local11 > 0 && local39 < 103 && this.anIntArrayArray24[local11 - 1][local39 + 1] == 0 && (local81[local11 - 1][local39 + 1] & 0x1280138) == 0 && (local81[local11 - 1][local39] & 0x1280108) == 0 && (local81[local11][local39 + 1] & 0x1280120) == 0) {
					this.anIntArray274[local66] = local11 - 1;
					this.anIntArray275[local66] = local39 + 1;
					local66 = (local66 + 1) % local74;
					this.anIntArrayArray24[local11 - 1][local39 + 1] = 6;
					this.anIntArrayArray22[local11 - 1][local39 + 1] = local192;
				}
				if (local11 < 103 && local39 < 103 && this.anIntArrayArray24[local11 + 1][local39 + 1] == 0 && (local81[local11 + 1][local39 + 1] & 0x12801E0) == 0 && (local81[local11 + 1][local39] & 0x1280180) == 0 && (local81[local11][local39 + 1] & 0x1280120) == 0) {
					this.anIntArray274[local66] = local11 + 1;
					this.anIntArray275[local66] = local39 + 1;
					local66 = (local66 + 1) % local74;
					this.anIntArrayArray24[local11 + 1][local39 + 1] = 12;
					this.anIntArrayArray22[local11 + 1][local39 + 1] = local192;
				}
			}
			this.anInt885 = 0;
			@Pc(808) int local808;
			@Pc(814) int local814;
			@Pc(820) int local820;
			if (!local70) {
				if (arg4) {
					local192 = 100;
					for (local808 = 1; local808 < 2; local808++) {
						for (local814 = arg9 - local808; local814 <= arg9 + local808; local814++) {
							for (local820 = arg10 - local808; local820 <= arg10 + local808; local820++) {
								if (local814 >= 0 && local820 >= 0 && local814 < 104 && local820 < 104 && this.anIntArrayArray22[local814][local820] < local192) {
									local192 = this.anIntArrayArray22[local814][local820];
									local11 = local814;
									local39 = local820;
									this.anInt885 = 1;
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
			this.anIntArray274[0] = local11;
			local57 = local881 + 1;
			this.anIntArray275[0] = local39;
			local192 = local808 = this.anIntArrayArray24[local11][local39];
			while (local11 != arg1 || local39 != arg0) {
				if (local192 != local808) {
					local808 = local192;
					this.anIntArray274[local57] = local11;
					this.anIntArray275[local57++] = local39;
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
				local192 = this.anIntArrayArray24[local11][local39];
			}
			if (local57 > 0) {
				local74 = local57;
				if (local57 > 25) {
					local74 = 25;
				}
				local57--;
				local814 = this.anIntArray274[local57];
				local820 = this.anIntArray275[local57];
				if (arg3 == 0) {
					this.aClass5_Sub1_Sub4_9.method229(185);
					this.aClass5_Sub1_Sub4_9.method230(local74 + local74 + 3);
				}
				if (arg3 == 1) {
					this.aClass5_Sub1_Sub4_9.method229(74);
					this.aClass5_Sub1_Sub4_9.method230(local74 + local74 + 3 + 14);
				}
				if (arg3 == 2) {
					this.aClass5_Sub1_Sub4_9.method229(232);
					this.aClass5_Sub1_Sub4_9.method230(local74 + local74 + 3);
				}
				this.aClass5_Sub1_Sub4_9.method231(local820 + this.anInt874);
				this.aClass5_Sub1_Sub4_9.method257(super.anIntArray210[5] == 1 ? 1 : 0);
				this.aClass5_Sub1_Sub4_9.method231(local814 + this.anInt873);
				this.anInt1028 = this.anIntArray274[0];
				this.anInt1029 = this.anIntArray275[0];
				for (@Pc(1072) int local1072 = 1; local1072 < local74; local1072++) {
					local57--;
					this.aClass5_Sub1_Sub4_9.method257(this.anIntArray274[local57] - local814);
					this.aClass5_Sub1_Sub4_9.method258(this.anIntArray275[local57] - local820);
				}
				return true;
			} else if (arg3 == 1) {
				return false;
			} else {
				return true;
			}
		} catch (@Pc(1109) RuntimeException local1109) {
			signlink.reporterror("84475, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + 3 + ", " + arg10 + ", " + local1109.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(I)V")
	private void method587() {
		try {
			if (super.anInt823 == 1) {
				if (super.anInt824 >= 6 && super.anInt824 <= 106 && super.anInt825 >= 467 && super.anInt825 <= 499) {
					this.anInt1025 = (this.anInt1025 + 1) % 4;
					this.aBoolean258 = true;
					this.aBoolean237 = true;
					this.aClass5_Sub1_Sub4_9.method229(112);
					this.aClass5_Sub1_Sub4_9.method230(this.anInt1025);
					this.aClass5_Sub1_Sub4_9.method230(this.anInt1043);
					this.aClass5_Sub1_Sub4_9.method230(this.anInt963);
				}
				if (super.anInt824 >= 135 && super.anInt824 <= 235 && super.anInt825 >= 467 && super.anInt825 <= 499) {
					this.anInt1043 = (this.anInt1043 + 1) % 3;
					this.aBoolean258 = true;
					this.aBoolean237 = true;
					this.aClass5_Sub1_Sub4_9.method229(112);
					this.aClass5_Sub1_Sub4_9.method230(this.anInt1025);
					this.aClass5_Sub1_Sub4_9.method230(this.anInt1043);
					this.aClass5_Sub1_Sub4_9.method230(this.anInt963);
				}
				if (super.anInt824 >= 273 && super.anInt824 <= 373 && super.anInt825 >= 467 && super.anInt825 <= 499) {
					this.anInt963 = (this.anInt963 + 1) % 3;
					this.aBoolean258 = true;
					this.aBoolean237 = true;
					this.aClass5_Sub1_Sub4_9.method229(112);
					this.aClass5_Sub1_Sub4_9.method230(this.anInt1025);
					this.aClass5_Sub1_Sub4_9.method230(this.anInt1043);
					this.aClass5_Sub1_Sub4_9.method230(this.anInt963);
				}
				if (super.anInt824 >= 412 && super.anInt824 <= 512 && super.anInt825 >= 467 && super.anInt825 <= 499) {
					if (this.anInt949 == -1) {
						this.method639();
						this.aString19 = "";
						this.aBoolean216 = false;
						this.anInt924 = this.anInt949 = Class36.anInt598;
						return;
					}
					this.method720(0, "", "Please close the interface you have open before using 'report abuse'");
					return;
				}
			}
		} catch (@Pc(201) RuntimeException local201) {
			signlink.reporterror("15306, " + 0 + ", " + local201.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "f", descriptor = "(I)V")
	private void method588() {
		try {
			if (this.anInt909 != 0) {
				@Pc(6) Class5_Sub1_Sub1_Sub1 local6 = this.aClass5_Sub1_Sub1_Sub1_3;
				@Pc(8) int local8 = 0;
				this.anInt938 += 0;
				if (this.anInt965 != 0) {
					local8 = 1;
				}
				for (@Pc(21) int local21 = 0; local21 < 100; local21++) {
					if (this.aStringArray9[local21] != null) {
						@Pc(33) int local33 = this.anIntArray225[local21];
						@Pc(38) String local38 = this.aStringArray8[local21];
						@Pc(40) byte local40 = 0;
						if (local38 != null && local38.startsWith("@cr1@")) {
							local38 = local38.substring(5);
							local40 = 1;
						}
						if (local38 != null && local38.startsWith("@cr2@")) {
							local38 = local38.substring(5);
							local40 = 2;
						}
						@Pc(91) int local91;
						if ((local33 == 3 || local33 == 7) && (local33 == 7 || this.anInt1043 == 0 || this.anInt1043 == 1 && this.method600(local38))) {
							local91 = 329 - local8 * 13;
							local6.method44(4, "From", 0, local91);
							local6.method44(4, "From", 65535, local91 - 1);
							@Pc(116) int local116 = local6.method42("From ") + 4;
							if (local40 == 1) {
								this.aClass5_Sub1_Sub1_Sub2Array5[0].method417(local116, local91 - 12);
								local116 += 14;
							}
							if (local40 == 2) {
								this.aClass5_Sub1_Sub1_Sub2Array5[1].method417(local116, local91 - 12);
								local116 += 14;
							}
							local6.method44(local116, local38 + ": " + this.aStringArray9[local21], 0, local91);
							local6.method44(local116, local38 + ": " + this.aStringArray9[local21], 65535, local91 - 1);
							local8++;
							if (local8 >= 5) {
								return;
							}
						}
						if (local33 == 5 && this.anInt1043 < 2) {
							local91 = 329 - local8 * 13;
							local6.method44(4, this.aStringArray9[local21], 0, local91);
							local6.method44(4, this.aStringArray9[local21], 65535, local91 - 1);
							local8++;
							if (local8 >= 5) {
								return;
							}
						}
						if (local33 == 6 && this.anInt1043 < 2) {
							local91 = 329 - local8 * 13;
							local6.method44(4, "To " + local38 + ": " + this.aStringArray9[local21], 0, local91);
							local6.method44(4, "To " + local38 + ": " + this.aStringArray9[local21], 65535, local91 - 1);
							local8++;
							if (local8 >= 5) {
								return;
							}
						}
					}
				}
			}
		} catch (@Pc(295) RuntimeException local295) {
			signlink.reporterror("11975, " + 0 + ", " + local295.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(Z)V")
	private void method590() {
		try {
			this.aBoolean221 &= true;
			try {
				@Pc(13) int local13 = aClass5_Sub1_Sub2_Sub4_Sub2_1.anInt524 + this.anInt877;
				@Pc(19) int local19 = aClass5_Sub1_Sub2_Sub4_Sub2_1.anInt525 + this.anInt868;
				if (this.anInt999 - local13 < -500 || this.anInt999 - local13 > 500 || this.anInt1000 - local19 < -500 || this.anInt1000 - local19 > 500) {
					this.anInt999 = local13;
					this.anInt1000 = local19;
				}
				if (this.anInt999 != local13) {
					this.anInt999 += (local13 - this.anInt999) / 16;
				}
				if (this.anInt1000 != local19) {
					this.anInt1000 += (local19 - this.anInt1000) / 16;
				}
				if (super.anIntArray210[1] == 1) {
					this.anInt946 += (-this.anInt946 - 24) / 2;
				} else if (super.anIntArray210[2] == 1) {
					this.anInt946 += (24 - this.anInt946) / 2;
				} else {
					this.anInt946 /= 2;
				}
				if (super.anIntArray210[3] == 1) {
					this.anInt947 += (12 - this.anInt947) / 2;
				} else if (super.anIntArray210[4] == 1) {
					this.anInt947 += (-this.anInt947 - 12) / 2;
				} else {
					this.anInt947 /= 2;
				}
				this.anInt945 = this.anInt945 + this.anInt946 / 2 & 0x7FF;
				this.anInt944 += this.anInt947 / 2;
				if (this.anInt944 < 128) {
					this.anInt944 = 128;
				}
				if (this.anInt944 > 383) {
					this.anInt944 = 383;
				}
				@Pc(206) int local206 = this.anInt999 >> 7;
				@Pc(211) int local211 = this.anInt1000 >> 7;
				@Pc(222) int local222 = this.method594(this.anInt1052, this.anInt999, this.anInt867, this.anInt1000);
				@Pc(224) int local224 = 0;
				@Pc(240) int local240;
				if (local206 > 3 && local211 > 3 && local206 < 100 && local211 < 100) {
					for (local240 = local206 - 4; local240 <= local206 + 4; local240++) {
						for (@Pc(246) int local246 = local211 - 4; local246 <= local211 + 4; local246++) {
							@Pc(251) int local251 = this.anInt1052;
							if (local251 < 3 && (this.aByteArrayArrayArray8[1][local240][local246] & 0x2) == 2) {
								local251++;
							}
							@Pc(278) int local278 = local222 - this.anIntArrayArrayArray8[local251][local240][local246];
							if (local278 > local224) {
								local224 = local278;
							}
						}
					}
				}
				local240 = local224 * 192;
				if (local240 > 98048) {
					local240 = 98048;
				}
				if (local240 < 32768) {
					local240 = 32768;
				}
				if (local240 > this.anInt1027) {
					this.anInt1027 += (local240 - this.anInt1027) / 24;
				} else if (local240 < this.anInt1027) {
					this.anInt1027 += (local240 - this.anInt1027) / 80;
				}
			} catch (@Pc(342) Exception local342) {
				signlink.reporterror("glfc_ex " + aClass5_Sub1_Sub2_Sub4_Sub2_1.anInt524 + "," + aClass5_Sub1_Sub2_Sub4_Sub2_1.anInt525 + "," + this.anInt999 + "," + this.anInt1000 + "," + this.anInt851 + "," + this.anInt852 + "," + this.anInt873 + "," + this.anInt874);
				throw new RuntimeException("eek");
			}
		} catch (@Pc(392) RuntimeException local392) {
			signlink.reporterror("23655, " + true + ", " + local392.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "h", descriptor = "(I)V")
	private void method591(@OriginalArg(0) int arg0) {
		try {
			if (arg0 <= 0) {
				this.aClass5_Sub1_Sub4_9.method230(25);
			}
			if (super.anInt823 == 1) {
				if (super.anInt824 >= 539 && super.anInt824 <= 573 && super.anInt825 >= 169 && super.anInt825 < 205 && this.anIntArray244[0] != -1) {
					this.aBoolean238 = true;
					this.anInt908 = 0;
					this.aBoolean244 = true;
				}
				if (super.anInt824 >= 569 && super.anInt824 <= 599 && super.anInt825 >= 168 && super.anInt825 < 205 && this.anIntArray244[1] != -1) {
					this.aBoolean238 = true;
					this.anInt908 = 1;
					this.aBoolean244 = true;
				}
				if (super.anInt824 >= 597 && super.anInt824 <= 627 && super.anInt825 >= 168 && super.anInt825 < 205 && this.anIntArray244[2] != -1) {
					this.aBoolean238 = true;
					this.anInt908 = 2;
					this.aBoolean244 = true;
				}
				if (super.anInt824 >= 625 && super.anInt824 <= 669 && super.anInt825 >= 168 && super.anInt825 < 203 && this.anIntArray244[3] != -1) {
					this.aBoolean238 = true;
					this.anInt908 = 3;
					this.aBoolean244 = true;
				}
				if (super.anInt824 >= 666 && super.anInt824 <= 696 && super.anInt825 >= 168 && super.anInt825 < 205 && this.anIntArray244[4] != -1) {
					this.aBoolean238 = true;
					this.anInt908 = 4;
					this.aBoolean244 = true;
				}
				if (super.anInt824 >= 694 && super.anInt824 <= 724 && super.anInt825 >= 168 && super.anInt825 < 205 && this.anIntArray244[5] != -1) {
					this.aBoolean238 = true;
					this.anInt908 = 5;
					this.aBoolean244 = true;
				}
				if (super.anInt824 >= 722 && super.anInt824 <= 756 && super.anInt825 >= 169 && super.anInt825 < 205 && this.anIntArray244[6] != -1) {
					this.aBoolean238 = true;
					this.anInt908 = 6;
					this.aBoolean244 = true;
				}
				if (super.anInt824 >= 540 && super.anInt824 <= 574 && super.anInt825 >= 466 && super.anInt825 < 502 && this.anIntArray244[7] != -1) {
					this.aBoolean238 = true;
					this.anInt908 = 7;
					this.aBoolean244 = true;
				}
				if (super.anInt824 >= 572 && super.anInt824 <= 602 && super.anInt825 >= 466 && super.anInt825 < 503 && this.anIntArray244[8] != -1) {
					this.aBoolean238 = true;
					this.anInt908 = 8;
					this.aBoolean244 = true;
				}
				if (super.anInt824 >= 599 && super.anInt824 <= 629 && super.anInt825 >= 466 && super.anInt825 < 503 && this.anIntArray244[9] != -1) {
					this.aBoolean238 = true;
					this.anInt908 = 9;
					this.aBoolean244 = true;
				}
				if (super.anInt824 >= 627 && super.anInt824 <= 671 && super.anInt825 >= 467 && super.anInt825 < 502 && this.anIntArray244[10] != -1) {
					this.aBoolean238 = true;
					this.anInt908 = 10;
					this.aBoolean244 = true;
				}
				if (super.anInt824 >= 669 && super.anInt824 <= 699 && super.anInt825 >= 466 && super.anInt825 < 503 && this.anIntArray244[11] != -1) {
					this.aBoolean238 = true;
					this.anInt908 = 11;
					this.aBoolean244 = true;
				}
				if (super.anInt824 >= 696 && super.anInt824 <= 726 && super.anInt825 >= 466 && super.anInt825 < 503 && this.anIntArray244[12] != -1) {
					this.aBoolean238 = true;
					this.anInt908 = 12;
					this.aBoolean244 = true;
				}
				if (super.anInt824 >= 724 && super.anInt824 <= 758 && super.anInt825 >= 466 && super.anInt825 < 502 && this.anIntArray244[13] != -1) {
					this.aBoolean238 = true;
					this.anInt908 = 13;
					this.aBoolean244 = true;
					return;
				}
			}
		} catch (@Pc(445) RuntimeException local445) {
			signlink.reporterror("49289, " + arg0 + ", " + local445.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "i", descriptor = "(I)V")
	private void method592(@OriginalArg(0) int arg0) {
		try {
			if (arg0 != -16153) {
				this.method578();
			}
			if (aBoolean261 && this.anInt838 == 2 && Class8.anInt87 != this.anInt1052) {
				this.method660("Loading - please wait.", null);
				this.anInt838 = 1;
				this.aLong29 = System.currentTimeMillis();
			}
			if (this.anInt838 == 1) {
				@Pc(33) int local33 = this.method593();
				if (local33 != 0 && System.currentTimeMillis() - this.aLong29 > 360000L) {
					signlink.reporterror(this.aString17 + " glcfb " + this.aLong32 + "," + local33 + "," + aBoolean261 + "," + this.aClass42Array1[0] + "," + this.aClass9_Sub1_1.method153() + "," + this.anInt1052 + "," + this.anInt851 + "," + this.anInt852);
					this.aLong29 = System.currentTimeMillis();
				}
			}
			if (this.anInt838 == 2 && this.anInt1052 != this.anInt1002) {
				this.anInt1002 = this.anInt1052;
				this.method671(this.anInt1052);
			}
		} catch (@Pc(114) RuntimeException local114) {
			signlink.reporterror("70380, " + arg0 + ", " + local114.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "j", descriptor = "(I)I")
	private int method593() {
		try {
			for (@Pc(3) int local3 = 0; local3 < this.aByteArrayArray5.length; local3++) {
				if (this.aByteArrayArray5[local3] == null && this.anIntArray272[local3] != -1) {
					return -1;
				}
				if (this.aByteArrayArray6[local3] == null && this.anIntArray273[local3] != -1) {
					return -2;
				}
			}
			@Pc(39) boolean local39 = true;
			for (@Pc(41) int local41 = 0; local41 < this.aByteArrayArray5.length; local41++) {
				@Pc(48) byte[] local48 = this.aByteArrayArray6[local41];
				if (local48 != null) {
					@Pc(62) int local62 = (this.anIntArray271[local41] >> 8) * 64 - this.anInt873;
					@Pc(74) int local74 = (this.anIntArray271[local41] & 0xFF) * 64 - this.anInt874;
					if (this.aBoolean224) {
						local62 = 10;
						local74 = 10;
					}
					local39 &= Class8.method65(local48, local62, local74);
				}
			}
			if (!local39) {
				return -3;
			} else if (this.aBoolean229) {
				return -4;
			} else {
				this.anInt838 = 2;
				Class8.anInt87 = this.anInt1052;
				this.method668();
				this.aClass5_Sub1_Sub4_9.method229(154);
				return 0;
			}
		} catch (@Pc(128) RuntimeException local128) {
			signlink.reporterror("71649, " + -726 + ", " + local128.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIII)I")
	private int method594(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		try {
			@Pc(3) int local3 = arg1 >> 7;
			@Pc(7) int local7 = arg3 >> 7;
			if (local3 < 0 || local7 < 0 || local3 > 103 || local7 > 103) {
				return 0;
			}
			@Pc(21) int local21 = arg0;
			if (arg0 < 3 && (this.aByteArrayArrayArray8[1][local3][local7] & 0x2) == 2) {
				local21 = arg0 + 1;
			}
			@Pc(41) int local41 = arg1 & 0x7F;
			@Pc(45) int local45 = arg3 & 0x7F;
			@Pc(73) int local73 = this.anIntArrayArrayArray8[local21][local3][local7] * (128 - local41) + this.anIntArrayArrayArray8[local21][local3 + 1][local7] * local41 >> 7;
			while (arg2 >= 0) {
				this.anInt854 = this.aClass23_2.method161();
			}
			@Pc(114) int local114 = this.anIntArrayArrayArray8[local21][local3][local7 + 1] * (128 - local41) + this.anIntArrayArrayArray8[local21][local3 + 1][local7 + 1] * local41 >> 7;
			return local73 * (128 - local45) + local114 * local45 >> 7;
		} catch (@Pc(127) RuntimeException local127) {
			signlink.reporterror("81399, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local127.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(B)V")
	private void method595() {
		try {
			this.aBoolean243 = true;
			try {
				@Pc(9) long local9 = System.currentTimeMillis();
				@Pc(11) int local11 = 0;
				@Pc(13) int local13 = 20;
				while (this.aBoolean249) {
					this.anInt870++;
					this.method605();
					this.method605();
					this.method651(this.aBoolean253);
					local11++;
					if (local11 > 10) {
						@Pc(37) long local37 = System.currentTimeMillis();
						@Pc(46) int local46 = (int) (local37 - local9) / 10 - local13;
						local13 = 40 - local46;
						if (local13 < 5) {
							local13 = 5;
						}
						local11 = 0;
						local9 = local37;
					}
					try {
						Thread.sleep((long) local13);
					} catch (@Pc(64) Exception local64) {
					}
				}
			} catch (@Pc(70) Exception local70) {
			}
			this.aBoolean243 = false;
		} catch (@Pc(75) RuntimeException local75) {
			signlink.reporterror("33248, " + 1 + ", " + local75.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "init", descriptor = "()V")
	@Override
	public void init() {
		anInt1057 = Integer.parseInt(this.getParameter("nodeid"));
		anInt1058 = Integer.parseInt(this.getParameter("portoff"));
		@Pc(15) String local15 = this.getParameter("lowmem");
		if (local15 != null && local15.equals("1")) {
			method589();
		} else {
			method637();
		}
		@Pc(31) String local31 = this.getParameter("free");
		if (local31 != null && local31.equals("1")) {
			aBoolean260 = false;
		} else {
			aBoolean260 = true;
		}
		this.method574();
	}

	@OriginalMember(owner = "client!client", name = "k", descriptor = "(I)V")
	private void method596(@OriginalArg(0) int arg0) {
		try {
			this.aClass6_18.method55();
			if (arg0 < 0) {
				Class5_Sub1_Sub1_Sub4.anIntArray206 = this.anIntArray229;
				this.aClass5_Sub1_Sub1_Sub2_8.method417(0, 0);
				if (this.aBoolean217) {
					this.aClass5_Sub1_Sub1_Sub1_4.method40(40, 239, this.aString25, 0);
					this.aClass5_Sub1_Sub1_Sub1_4.method40(60, 239, this.aString27 + "*", 128);
				} else if (this.anInt884 == 1) {
					this.aClass5_Sub1_Sub1_Sub1_4.method40(40, 239, "Enter amount:", 0);
					this.aClass5_Sub1_Sub1_Sub1_4.method40(60, 239, this.aString23 + "*", 128);
				} else if (this.anInt884 == 2) {
					this.aClass5_Sub1_Sub1_Sub1_4.method40(40, 239, "Enter name:", 0);
					this.aClass5_Sub1_Sub1_Sub1_4.method40(60, 239, this.aString23 + "*", 128);
				} else if (this.aString28 != null) {
					this.aClass5_Sub1_Sub1_Sub1_4.method40(40, 239, this.aString28, 0);
					this.aClass5_Sub1_Sub1_Sub1_4.method40(60, 239, "Click to continue", 128);
				} else if (this.anInt931 != -1) {
					this.method701(0, 0, Class36.method388(this.anInt931), 0);
				} else if (this.anInt1015 == -1) {
					@Pc(164) Class5_Sub1_Sub1_Sub1 local164 = this.aClass5_Sub1_Sub1_Sub1_3;
					@Pc(166) int local166 = 0;
					Class5_Sub1_Sub1.method546(77, 0, 0, (byte) 6, 463);
					for (@Pc(174) int local174 = 0; local174 < 100; local174++) {
						if (this.aStringArray9[local174] != null) {
							@Pc(186) int local186 = this.anIntArray225[local174];
							@Pc(195) int local195 = this.anInt1033 + 70 - local166 * 14;
							@Pc(200) String local200 = this.aStringArray8[local174];
							@Pc(202) byte local202 = 0;
							if (local200 != null && local200.startsWith("@cr1@")) {
								local200 = local200.substring(5);
								local202 = 1;
							}
							if (local200 != null && local200.startsWith("@cr2@")) {
								local200 = local200.substring(5);
								local202 = 2;
							}
							if (local186 == 0) {
								if (local195 > 0 && local195 < 110) {
									local164.method44(4, this.aStringArray9[local174], 0, local195);
								}
								local166++;
							}
							@Pc(272) int local272;
							if ((local186 == 1 || local186 == 2) && (local186 == 1 || this.anInt1025 == 0 || this.anInt1025 == 1 && this.method600(local200))) {
								if (local195 > 0 && local195 < 110) {
									local272 = 4;
									if (local202 == 1) {
										this.aClass5_Sub1_Sub1_Sub2Array5[0].method417(4, local195 - 12);
										local272 += 14;
									}
									if (local202 == 2) {
										this.aClass5_Sub1_Sub1_Sub2Array5[1].method417(local272, local195 - 12);
										local272 += 14;
									}
									local164.method44(local272, local200 + ":", 0, local195);
									local272 += local164.method42(local200) + 8;
									local164.method44(local272, this.aStringArray9[local174], 255, local195);
								}
								local166++;
							}
							if ((local186 == 3 || local186 == 7) && this.anInt909 == 0 && (local186 == 7 || this.anInt1043 == 0 || this.anInt1043 == 1 && this.method600(local200))) {
								if (local195 > 0 && local195 < 110) {
									local164.method44(4, "From", 0, local195);
									local272 = local164.method42("From ") + 4;
									if (local202 == 1) {
										this.aClass5_Sub1_Sub1_Sub2Array5[0].method417(local272, local195 - 12);
										local272 += 14;
									}
									if (local202 == 2) {
										this.aClass5_Sub1_Sub1_Sub2Array5[1].method417(local272, local195 - 12);
										local272 += 14;
									}
									local164.method44(local272, local200 + ":", 0, local195);
									local272 += local164.method42(local200) + 8;
									local164.method44(local272, this.aStringArray9[local174], 8388608, local195);
								}
								local166++;
							}
							if (local186 == 4 && (this.anInt963 == 0 || this.anInt963 == 1 && this.method600(local200))) {
								if (local195 > 0 && local195 < 110) {
									local164.method44(4, local200 + " " + this.aStringArray9[local174], 8388736, local195);
								}
								local166++;
							}
							if (local186 == 5 && this.anInt909 == 0 && this.anInt1043 < 2) {
								if (local195 > 0 && local195 < 110) {
									local164.method44(4, this.aStringArray9[local174], 8388608, local195);
								}
								local166++;
							}
							if (local186 == 6 && this.anInt909 == 0 && this.anInt1043 < 2) {
								if (local195 > 0 && local195 < 110) {
									local164.method44(4, "To " + local200 + ":", 0, local195);
									local164.method44(local164.method42("To " + local200) + 12, this.aStringArray9[local174], 8388608, local195);
								}
								local166++;
							}
							if (local186 == 8 && (this.anInt963 == 0 || this.anInt963 == 1 && this.method600(local200))) {
								if (local195 > 0 && local195 < 110) {
									local164.method44(4, local200 + " " + this.aStringArray9[local174], 8270336, local195);
								}
								local166++;
							}
						}
					}
					Class5_Sub1_Sub1.method545(546);
					this.anInt914 = local166 * 14 + 7;
					if (this.anInt914 < 78) {
						this.anInt914 = 78;
					}
					this.method717(this.anInt914, 77, 0, 463, this.anInt914 - this.anInt1033 - 77);
					@Pc(642) String local642;
					if (aClass5_Sub1_Sub2_Sub4_Sub2_1 == null || aClass5_Sub1_Sub2_Sub4_Sub2_1.aString8 == null) {
						local642 = Class28.method195(this.aString17);
					} else {
						local642 = aClass5_Sub1_Sub2_Sub4_Sub2_1.aString8;
					}
					local164.method44(4, local642 + ":", 0, 90);
					local164.method44(local164.method42(local642 + ": ") + 6, this.aString22 + "*", 255, 90);
					Class5_Sub1_Sub1.method552(479, 0, 0, 77);
				} else {
					this.method701(0, 0, Class36.method388(this.anInt1015), 0);
				}
				if (this.aBoolean240 && this.anInt969 == 2) {
					this.method620();
				}
				this.aClass6_18.method56(357, super.aGraphics2, 17);
				this.aClass6_17.method55();
				Class5_Sub1_Sub1_Sub4.anIntArray206 = this.anIntArray231;
			}
		} catch (@Pc(723) RuntimeException local723) {
			signlink.reporterror("27215, " + arg0 + ", " + local723.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "l", descriptor = "(I)V")
	private void method597(@OriginalArg(0) int arg0) {
		try {
			@Pc(4) Graphics local4 = this.method583().getGraphics();
			local4.setColor(Color.black);
			local4.fillRect(0, 0, 765, 503);
			@Pc(17) boolean local17 = false;
			this.method576();
			@Pc(40) byte local40;
			@Pc(46) int local46;
			if (this.aBoolean255) {
				this.aBoolean249 = false;
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
			if (this.aBoolean220) {
				this.aBoolean249 = false;
				local4.setFont(new Font("Helvetica", 1, 20));
				local4.setColor(Color.white);
				local4.drawString("Error - unable to load game!", 50, 50);
				local4.drawString("To play RuneScape make sure you play from", 50, 100);
				local4.drawString("http://www.runescape.com", 50, 150);
			}
			if (this.aBoolean239) {
				this.aBoolean249 = false;
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
			signlink.reporterror("53941, " + arg0 + ", " + local178.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "()V")
	@Override
	protected void method578() {
		this.method585("Starting up", 20);
		if (signlink.sunjava) {
			super.anInt812 = 5;
		}
		if (aBoolean233) {
			this.aBoolean239 = true;
			return;
		}
		aBoolean233 = true;
		@Pc(21) boolean local21 = false;
		@Pc(25) String local25 = this.method612();
		if (local25.endsWith("jagex.com")) {
			local21 = true;
		}
		if (local25.endsWith("runescape.com")) {
			local21 = true;
		}
		if (local25.endsWith("192.168.1.2")) {
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
		if (local25.endsWith("127.0.0.1")) {
			local21 = true;
		}
		if (!local21) {
			this.aBoolean220 = true;
			return;
		}
		if (signlink.aRandomAccessFile3 != null) {
			for (@Pc(89) int local89 = 0; local89 < 5; local89++) {
				this.aClass42Array1[local89] = new Class42(500000, signlink.aRandomAccessFile3, false, local89 + 1, signlink.aRandomAccessFileArray1[local89]);
			}
		}
		try {
			this.method696();
			this.aClass40_2 = this.method713(25, this.anIntArray236[1], "title screen", 1, "title");
			this.aClass5_Sub1_Sub1_Sub1_2 = new Class5_Sub1_Sub1_Sub1(26521, false, this.aClass40_2, "p11_full");
			this.aClass5_Sub1_Sub1_Sub1_3 = new Class5_Sub1_Sub1_Sub1(26521, false, this.aClass40_2, "p12_full");
			this.aClass5_Sub1_Sub1_Sub1_4 = new Class5_Sub1_Sub1_Sub1(26521, false, this.aClass40_2, "b12_full");
			this.aClass5_Sub1_Sub1_Sub1_5 = new Class5_Sub1_Sub1_Sub1(26521, true, this.aClass40_2, "q8_full");
			this.method677();
			this.method627(aBoolean228);
			@Pc(185) Class40 local185 = this.method713(30, this.anIntArray236[2], "config", 2, "config");
			@Pc(197) Class40 local197 = this.method713(35, this.anIntArray236[3], "interface", 3, "interface");
			@Pc(209) Class40 local209 = this.method713(40, this.anIntArray236[4], "2d graphics", 4, "media");
			@Pc(221) Class40 local221 = this.method713(45, this.anIntArray236[6], "textures", 6, "textures");
			@Pc(233) Class40 local233 = this.method713(50, this.anIntArray236[7], "chat system", 7, "wordenc");
			@Pc(245) Class40 local245 = this.method713(55, this.anIntArray236[8], "sound effects", 8, "sounds");
			this.aByteArrayArrayArray8 = new byte[4][104][104];
			this.anIntArrayArrayArray8 = new int[4][105][105];
			this.aClass46_1 = new Class46(this.anIntArrayArrayArray8, false, 4, 104, 104);
			for (@Pc(270) int local270 = 0; local270 < 4; local270++) {
				this.aClass37Array1[local270] = new Class37(104, 104, 9);
			}
			this.aClass5_Sub1_Sub1_Sub3_14 = new Class5_Sub1_Sub1_Sub3(512, 512);
			@Pc(305) Class40 local305 = this.method713(60, this.anIntArray236[5], "update list", 5, "versionlist");
			this.method585("Connecting to update server", 60);
			this.aClass9_Sub1_1 = new Class9_Sub1();
			this.aClass9_Sub1_1.method157(local305, this);
			Class3.method1(this.aClass9_Sub1_1.method140());
			Class5_Sub1_Sub2_Sub5.method321(this.aClass9_Sub1_1.method147(0, 163), this.aClass9_Sub1_1);
			if (!aBoolean261) {
				this.anInt907 = 0;
				try {
					this.anInt907 = Integer.parseInt(this.getParameter("music"));
				} catch (@Pc(346) Exception local346) {
				}
				this.aBoolean234 = true;
				this.aClass9_Sub1_1.method150(2, this.anInt907);
				while (this.aClass9_Sub1_1.method153() > 0) {
					this.method697();
					try {
						Thread.sleep(100L);
					} catch (@Pc(364) Exception local364) {
					}
					if (this.aClass9_Sub1_1.anInt243 > 3) {
						this.method690("ondemand");
						return;
					}
				}
			}
			this.method585("Requesting animations", 65);
			@Pc(388) int local388 = this.aClass9_Sub1_1.method147(1, 163);
			for (@Pc(390) int local390 = 0; local390 < local388; local390++) {
				this.aClass9_Sub1_1.method150(1, local390);
			}
			@Pc(409) int local409;
			while (this.aClass9_Sub1_1.method153() > 0) {
				local409 = local388 - this.aClass9_Sub1_1.method153();
				if (local409 > 0) {
					this.method585("Loading animations - " + local409 * 100 / local388 + "%", 65);
				}
				this.method697();
				try {
					Thread.sleep(100L);
				} catch (@Pc(435) Exception local435) {
				}
				if (this.aClass9_Sub1_1.anInt243 > 3) {
					this.method690("ondemand");
					return;
				}
			}
			this.method585("Requesting models", 70);
			local388 = this.aClass9_Sub1_1.method147(0, 163);
			@Pc(469) int local469;
			for (local409 = 0; local409 < local388; local409++) {
				local469 = this.aClass9_Sub1_1.method158(local409);
				if ((local469 & 0x1) != 0) {
					this.aClass9_Sub1_1.method150(0, local409);
				}
			}
			local388 = this.aClass9_Sub1_1.method153();
			while (this.aClass9_Sub1_1.method153() > 0) {
				local469 = local388 - this.aClass9_Sub1_1.method153();
				if (local469 > 0) {
					this.method585("Loading models - " + local469 * 100 / local388 + "%", 70);
				}
				this.method697();
				try {
					Thread.sleep(100L);
				} catch (@Pc(520) Exception local520) {
				}
			}
			if (this.aClass42Array1[0] != null) {
				this.method585("Requesting maps", 75);
				this.aClass9_Sub1_1.method150(3, this.aClass9_Sub1_1.method142(867, 47, 0, 48));
				this.aClass9_Sub1_1.method150(3, this.aClass9_Sub1_1.method142(867, 47, 1, 48));
				this.aClass9_Sub1_1.method150(3, this.aClass9_Sub1_1.method142(867, 48, 0, 48));
				this.aClass9_Sub1_1.method150(3, this.aClass9_Sub1_1.method142(867, 48, 1, 48));
				this.aClass9_Sub1_1.method150(3, this.aClass9_Sub1_1.method142(867, 49, 0, 48));
				this.aClass9_Sub1_1.method150(3, this.aClass9_Sub1_1.method142(867, 49, 1, 48));
				this.aClass9_Sub1_1.method150(3, this.aClass9_Sub1_1.method142(867, 47, 0, 47));
				this.aClass9_Sub1_1.method150(3, this.aClass9_Sub1_1.method142(867, 47, 1, 47));
				this.aClass9_Sub1_1.method150(3, this.aClass9_Sub1_1.method142(867, 48, 0, 47));
				this.aClass9_Sub1_1.method150(3, this.aClass9_Sub1_1.method142(867, 48, 1, 47));
				this.aClass9_Sub1_1.method150(3, this.aClass9_Sub1_1.method142(867, 48, 0, 148));
				this.aClass9_Sub1_1.method150(3, this.aClass9_Sub1_1.method142(867, 48, 1, 148));
				local388 = this.aClass9_Sub1_1.method153();
				while (this.aClass9_Sub1_1.method153() > 0) {
					local469 = local388 - this.aClass9_Sub1_1.method153();
					if (local469 > 0) {
						this.method585("Loading maps - " + local469 * 100 / local388 + "%", 75);
					}
					this.method697();
					try {
						Thread.sleep(100L);
					} catch (@Pc(705) Exception local705) {
					}
				}
			}
			local388 = this.aClass9_Sub1_1.method147(0, 163);
			@Pc(726) int local726;
			for (local469 = 0; local469 < local388; local469++) {
				local726 = this.aClass9_Sub1_1.method158(local469);
				@Pc(728) byte local728 = 0;
				if ((local726 & 0x8) != 0) {
					local728 = 10;
				} else if ((local726 & 0x20) != 0) {
					local728 = 9;
				} else if ((local726 & 0x10) != 0) {
					local728 = 8;
				} else if ((local726 & 0x40) != 0) {
					local728 = 7;
				} else if ((local726 & 0x80) != 0) {
					local728 = 6;
				} else if ((local726 & 0x2) != 0) {
					local728 = 5;
				} else if ((local726 & 0x4) != 0) {
					local728 = 4;
				}
				if ((local726 & 0x1) != 0) {
					local728 = 3;
				}
				if (local728 != 0) {
					this.aClass9_Sub1_1.method160(local728, local469, 0);
				}
			}
			this.aClass9_Sub1_1.method155(aBoolean260);
			if (!aBoolean261) {
				local388 = this.aClass9_Sub1_1.method147(2, 163);
				for (local726 = 1; local726 < local388; local726++) {
					if (this.aClass9_Sub1_1.method156(local726)) {
						this.aClass9_Sub1_1.method160((byte) 1, local726, 2);
					}
				}
			}
			this.method585("Unpacking media", 80);
			this.aClass5_Sub1_Sub1_Sub2_6 = new Class5_Sub1_Sub1_Sub2(local209, "invback", 0);
			this.aClass5_Sub1_Sub1_Sub2_8 = new Class5_Sub1_Sub1_Sub2(local209, "chatback", 0);
			this.aClass5_Sub1_Sub1_Sub2_7 = new Class5_Sub1_Sub1_Sub2(local209, "mapback", 0);
			this.aClass5_Sub1_Sub1_Sub2_1 = new Class5_Sub1_Sub1_Sub2(local209, "backbase1", 0);
			this.aClass5_Sub1_Sub1_Sub2_2 = new Class5_Sub1_Sub1_Sub2(local209, "backbase2", 0);
			this.aClass5_Sub1_Sub1_Sub2_3 = new Class5_Sub1_Sub1_Sub2(local209, "backhmid1", 0);
			for (local726 = 0; local726 < 13; local726++) {
				this.aClass5_Sub1_Sub1_Sub2Array3[local726] = new Class5_Sub1_Sub1_Sub2(local209, "sideicons", local726);
			}
			this.aClass5_Sub1_Sub1_Sub3_17 = new Class5_Sub1_Sub1_Sub3(local209, "compass", 0);
			this.aClass5_Sub1_Sub1_Sub3_5 = new Class5_Sub1_Sub1_Sub3(local209, "mapedge", 0);
			this.aClass5_Sub1_Sub1_Sub3_5.method452();
			for (@Pc(928) int local928 = 0; local928 < 72; local928++) {
				this.aClass5_Sub1_Sub1_Sub2Array2[local928] = new Class5_Sub1_Sub1_Sub2(local209, "mapscene", local928);
			}
			for (@Pc(946) int local946 = 0; local946 < 63; local946++) {
				this.aClass5_Sub1_Sub1_Sub3Array8[local946] = new Class5_Sub1_Sub1_Sub3(local209, "mapfunction", local946);
			}
			for (@Pc(964) int local964 = 0; local964 < 5; local964++) {
				this.aClass5_Sub1_Sub1_Sub3Array5[local964] = new Class5_Sub1_Sub1_Sub3(local209, "hitmarks", local964);
			}
			for (@Pc(982) int local982 = 0; local982 < 6; local982++) {
				this.aClass5_Sub1_Sub1_Sub3Array9[local982] = new Class5_Sub1_Sub1_Sub3(local209, "headicons_pk", local982);
			}
			for (@Pc(1000) int local1000 = 0; local1000 < 9; local1000++) {
				this.aClass5_Sub1_Sub1_Sub3Array7[local1000] = new Class5_Sub1_Sub1_Sub3(local209, "headicons_prayer", local1000);
			}
			for (@Pc(1018) int local1018 = 0; local1018 < 6; local1018++) {
				this.aClass5_Sub1_Sub1_Sub3Array4[local1018] = new Class5_Sub1_Sub1_Sub3(local209, "headicons_hint", local1018);
			}
			this.aClass5_Sub1_Sub1_Sub3_13 = new Class5_Sub1_Sub1_Sub3(local209, "overlay_multiway", 0);
			this.aClass5_Sub1_Sub1_Sub3_3 = new Class5_Sub1_Sub1_Sub3(local209, "mapmarker", 0);
			this.aClass5_Sub1_Sub1_Sub3_4 = new Class5_Sub1_Sub1_Sub3(local209, "mapmarker", 1);
			for (@Pc(1060) int local1060 = 0; local1060 < 8; local1060++) {
				this.aClass5_Sub1_Sub1_Sub3Array10[local1060] = new Class5_Sub1_Sub1_Sub3(local209, "cross", local1060);
			}
			this.aClass5_Sub1_Sub1_Sub3_6 = new Class5_Sub1_Sub1_Sub3(local209, "mapdots", 0);
			this.aClass5_Sub1_Sub1_Sub3_7 = new Class5_Sub1_Sub1_Sub3(local209, "mapdots", 1);
			this.aClass5_Sub1_Sub1_Sub3_8 = new Class5_Sub1_Sub1_Sub3(local209, "mapdots", 2);
			this.aClass5_Sub1_Sub1_Sub3_9 = new Class5_Sub1_Sub1_Sub3(local209, "mapdots", 3);
			this.aClass5_Sub1_Sub1_Sub3_10 = new Class5_Sub1_Sub1_Sub3(local209, "mapdots", 4);
			this.aClass5_Sub1_Sub1_Sub2_14 = new Class5_Sub1_Sub1_Sub2(local209, "scrollbar", 0);
			this.aClass5_Sub1_Sub1_Sub2_15 = new Class5_Sub1_Sub1_Sub2(local209, "scrollbar", 1);
			this.aClass5_Sub1_Sub1_Sub2_16 = new Class5_Sub1_Sub1_Sub2(local209, "redstone1", 0);
			this.aClass5_Sub1_Sub1_Sub2_17 = new Class5_Sub1_Sub1_Sub2(local209, "redstone2", 0);
			this.aClass5_Sub1_Sub1_Sub2_18 = new Class5_Sub1_Sub1_Sub2(local209, "redstone3", 0);
			this.aClass5_Sub1_Sub1_Sub2_19 = new Class5_Sub1_Sub1_Sub2(local209, "redstone1", 0);
			this.aClass5_Sub1_Sub1_Sub2_19.method414();
			this.aClass5_Sub1_Sub1_Sub2_20 = new Class5_Sub1_Sub1_Sub2(local209, "redstone2", 0);
			this.aClass5_Sub1_Sub1_Sub2_20.method414();
			this.aClass5_Sub1_Sub1_Sub2_9 = new Class5_Sub1_Sub1_Sub2(local209, "redstone1", 0);
			this.aClass5_Sub1_Sub1_Sub2_9.method415();
			this.aClass5_Sub1_Sub1_Sub2_10 = new Class5_Sub1_Sub1_Sub2(local209, "redstone2", 0);
			this.aClass5_Sub1_Sub1_Sub2_10.method415();
			this.aClass5_Sub1_Sub1_Sub2_11 = new Class5_Sub1_Sub1_Sub2(local209, "redstone3", 0);
			this.aClass5_Sub1_Sub1_Sub2_11.method415();
			this.aClass5_Sub1_Sub1_Sub2_12 = new Class5_Sub1_Sub1_Sub2(local209, "redstone1", 0);
			this.aClass5_Sub1_Sub1_Sub2_12.method414();
			this.aClass5_Sub1_Sub1_Sub2_12.method415();
			this.aClass5_Sub1_Sub1_Sub2_13 = new Class5_Sub1_Sub1_Sub2(local209, "redstone2", 0);
			this.aClass5_Sub1_Sub1_Sub2_13.method414();
			this.aClass5_Sub1_Sub1_Sub2_13.method415();
			for (@Pc(1250) int local1250 = 0; local1250 < 2; local1250++) {
				this.aClass5_Sub1_Sub1_Sub2Array5[local1250] = new Class5_Sub1_Sub1_Sub2(local209, "mod_icons", local1250);
			}
			@Pc(1273) Class5_Sub1_Sub1_Sub3 local1273 = new Class5_Sub1_Sub1_Sub3(local209, "backleft1", 0);
			this.aClass6_19 = new Class6(local1273.anInt670, local1273.anInt669, this.method583(), false);
			local1273.method453(0, 0);
			@Pc(1298) Class5_Sub1_Sub1_Sub3 local1298 = new Class5_Sub1_Sub1_Sub3(local209, "backleft2", 0);
			this.aClass6_20 = new Class6(local1298.anInt670, local1298.anInt669, this.method583(), false);
			local1298.method453(0, 0);
			@Pc(1323) Class5_Sub1_Sub1_Sub3 local1323 = new Class5_Sub1_Sub1_Sub3(local209, "backright1", 0);
			this.aClass6_21 = new Class6(local1323.anInt670, local1323.anInt669, this.method583(), false);
			local1323.method453(0, 0);
			@Pc(1348) Class5_Sub1_Sub1_Sub3 local1348 = new Class5_Sub1_Sub1_Sub3(local209, "backright2", 0);
			this.aClass6_22 = new Class6(local1348.anInt670, local1348.anInt669, this.method583(), false);
			local1348.method453(0, 0);
			@Pc(1373) Class5_Sub1_Sub1_Sub3 local1373 = new Class5_Sub1_Sub1_Sub3(local209, "backtop1", 0);
			this.aClass6_23 = new Class6(local1373.anInt670, local1373.anInt669, this.method583(), false);
			local1373.method453(0, 0);
			@Pc(1398) Class5_Sub1_Sub1_Sub3 local1398 = new Class5_Sub1_Sub1_Sub3(local209, "backvmid1", 0);
			this.aClass6_24 = new Class6(local1398.anInt670, local1398.anInt669, this.method583(), false);
			local1398.method453(0, 0);
			@Pc(1423) Class5_Sub1_Sub1_Sub3 local1423 = new Class5_Sub1_Sub1_Sub3(local209, "backvmid2", 0);
			this.aClass6_25 = new Class6(local1423.anInt670, local1423.anInt669, this.method583(), false);
			local1423.method453(0, 0);
			@Pc(1448) Class5_Sub1_Sub1_Sub3 local1448 = new Class5_Sub1_Sub1_Sub3(local209, "backvmid3", 0);
			this.aClass6_26 = new Class6(local1448.anInt670, local1448.anInt669, this.method583(), false);
			local1448.method453(0, 0);
			@Pc(1473) Class5_Sub1_Sub1_Sub3 local1473 = new Class5_Sub1_Sub1_Sub3(local209, "backhmid2", 0);
			this.aClass6_27 = new Class6(local1473.anInt670, local1473.anInt669, this.method583(), false);
			local1473.method453(0, 0);
			@Pc(1498) int local1498 = (int) (Math.random() * 21.0D) - 10;
			@Pc(1505) int local1505 = (int) (Math.random() * 21.0D) - 10;
			@Pc(1512) int local1512 = (int) (Math.random() * 21.0D) - 10;
			@Pc(1519) int local1519 = (int) (Math.random() * 41.0D) - 20;
			for (@Pc(1521) int local1521 = 0; local1521 < 100; local1521++) {
				if (this.aClass5_Sub1_Sub1_Sub3Array8[local1521] != null) {
					this.aClass5_Sub1_Sub1_Sub3Array8[local1521].method451(local1498 + local1519, local1505 + local1519, local1512 + local1519);
				}
				if (this.aClass5_Sub1_Sub1_Sub2Array2[local1521] != null) {
					this.aClass5_Sub1_Sub1_Sub2Array2[local1521].method416(local1498 + local1519, local1505 + local1519, local1512 + local1519);
				}
			}
			this.method585("Unpacking textures", 83);
			Class5_Sub1_Sub1_Sub4.method561(local221);
			Class5_Sub1_Sub1_Sub4.method565(0.8D);
			Class5_Sub1_Sub1_Sub4.method560(aBoolean236);
			this.method585("Unpacking config", 86);
			Class11.method95(anInt955, local185);
			Class26.method186(local185);
			Class34.method380(anInt955, local185);
			Class18.method118(local185);
			Class49.method538(local185);
			Class33.method349(anInt955, local185);
			Class20.method130(anInt955, local185);
			Class48.method532(anInt955, local185);
			Class4.method6(anInt955, local185);
			Class18.aBoolean55 = aBoolean260;
			if (!aBoolean261) {
				this.method585("Unpacking sounds", 90);
				@Pc(1624) byte[] local1624 = local245.method464("sounds.dat", null);
				@Pc(1630) Class5_Sub1_Sub4 local1630 = new Class5_Sub1_Sub4(local1624, 0);
				Class30.method197(anInt955, local1630);
			}
			this.method585("Unpacking interfaces", 95);
			@Pc(1661) Class5_Sub1_Sub1_Sub1[] local1661 = new Class5_Sub1_Sub1_Sub1[] { this.aClass5_Sub1_Sub1_Sub1_2, this.aClass5_Sub1_Sub1_Sub1_3, this.aClass5_Sub1_Sub1_Sub1_4, this.aClass5_Sub1_Sub1_Sub1_5 };
			Class36.method390(419, local1661, local197, local209);
			this.method585("Preparing game engine", 100);
			@Pc(1677) int local1677;
			@Pc(1679) int local1679;
			@Pc(1681) int local1681;
			for (@Pc(1673) int local1673 = 0; local1673 < 33; local1673++) {
				local1677 = 999;
				local1679 = 0;
				for (local1681 = 0; local1681 < 34; local1681++) {
					if (this.aClass5_Sub1_Sub1_Sub2_7.aByteArray17[local1681 + local1673 * this.aClass5_Sub1_Sub1_Sub2_7.anInt626] == 0) {
						if (local1677 == 999) {
							local1677 = local1681;
						}
					} else if (local1677 != 999) {
						local1679 = local1681;
						break;
					}
				}
				this.anIntArray212[local1673] = local1677;
				this.anIntArray238[local1673] = local1679 - local1677;
			}
			@Pc(1739) int local1739;
			for (local1677 = 5; local1677 < 156; local1677++) {
				local1679 = 999;
				local1681 = 0;
				for (local1739 = 25; local1739 < 172; local1739++) {
					if (this.aClass5_Sub1_Sub1_Sub2_7.aByteArray17[local1739 + local1677 * this.aClass5_Sub1_Sub1_Sub2_7.anInt626] == 0 && (local1739 > 34 || local1677 > 34)) {
						if (local1679 == 999) {
							local1679 = local1739;
						}
					} else if (local1679 != 999) {
						local1681 = local1739;
						break;
					}
				}
				this.anIntArray239[local1677 - 5] = local1679 - 25;
				this.anIntArray215[local1677 - 5] = local1681 - local1679;
			}
			Class5_Sub1_Sub1_Sub4.method558(503, 765);
			this.anIntArray232 = Class5_Sub1_Sub1_Sub4.anIntArray206;
			Class5_Sub1_Sub1_Sub4.method558(96, 479);
			this.anIntArray229 = Class5_Sub1_Sub1_Sub4.anIntArray206;
			Class5_Sub1_Sub1_Sub4.method558(261, 190);
			this.anIntArray230 = Class5_Sub1_Sub1_Sub4.anIntArray206;
			Class5_Sub1_Sub1_Sub4.method558(334, 512);
			this.anIntArray231 = Class5_Sub1_Sub1_Sub4.anIntArray206;
			@Pc(1830) int[] local1830 = new int[9];
			for (local1681 = 0; local1681 < 9; local1681++) {
				local1739 = local1681 * 32 + 128 + 15;
				@Pc(1848) int local1848 = local1739 * 3 + 600;
				@Pc(1852) int local1852 = Class5_Sub1_Sub1_Sub4.anIntArray204[local1739];
				local1830[local1681] = local1848 * local1852 >> 16;
			}
			Class46.method517(local1830);
			Class32.method278(local233);
			this.aClass38_1 = new Class38(-562, this);
			this.method584(this.aClass38_1, 10);
			Class5_Sub1_Sub2_Sub6.aClient3 = this;
			Class26.aClient2 = this;
			Class49.aClient5 = this;
		} catch (@Pc(1893) Exception local1893) {
			signlink.reporterror("loaderror " + this.aString24 + " " + this.anInt857);
			this.aBoolean255 = true;
		}
	}

	@OriginalMember(owner = "client!client", name = "m", descriptor = "(I)Z")
	private boolean method598() {
		try {
			return signlink.wavereplay();
		} catch (@Pc(8) RuntimeException local8) {
			signlink.reporterror("35702, " + -1384 + ", " + local8.toString());
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
				return new URL("http://127.0.0.1:" + (anInt1058 + 80));
			}
		} catch (@Pc(21) Exception local21) {
		}
		return super.getCodeBase();
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IZ)V")
	private void method599(@OriginalArg(0) int arg0) {
		try {
			this.aBoolean221 &= true;
			signlink.anInt1069 = arg0;
		} catch (@Pc(9) RuntimeException local9) {
			signlink.reporterror("58561, " + arg0 + ", " + true + ", " + local9.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/String;B)Z")
	private boolean method600(@OriginalArg(0) String arg0) {
		try {
			if (arg0 == null) {
				return false;
			}
			for (@Pc(5) int local5 = 0; local5 < this.anInt840; local5++) {
				if (arg0.equalsIgnoreCase(this.aStringArray12[local5])) {
					return true;
				}
			}
			return arg0.equalsIgnoreCase(aClass5_Sub1_Sub2_Sub4_Sub2_1.aString8);
		} catch (@Pc(37) RuntimeException local37) {
			signlink.reporterror("74037, " + arg0 + ", " + -47 + ", " + local37.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(Z)V")
	private void method601() {
		try {
			this.aBoolean221 &= true;
			signlink.aBoolean262 = false;
			signlink.anInt1067 = 0;
			signlink.midi = "stop";
		} catch (@Pc(13) RuntimeException local13) {
			signlink.reporterror("96353, " + true + ", " + local13.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "n", descriptor = "(I)V")
	private void method602() {
		try {
			if (this.anInt957 == 0 && this.anInt1047 == 0) {
				this.aStringArray10[this.anInt956] = "Walk here";
				this.anIntArray269[this.anInt956] = 124;
				this.anIntArray267[this.anInt956] = super.anInt818;
				this.anIntArray268[this.anInt956] = super.anInt819;
				this.anInt956++;
			}
			@Pc(44) int local44 = -1;
			for (@Pc(46) int local46 = 0; local46 < Class5_Sub1_Sub2_Sub5.anInt466; local46++) {
				@Pc(52) int local52 = Class5_Sub1_Sub2_Sub5.anIntArray140[local46];
				@Pc(56) int local56 = local52 & 0x7F;
				@Pc(62) int local62 = local52 >> 7 & 0x7F;
				@Pc(68) int local68 = local52 >> 29 & 0x3;
				@Pc(74) int local74 = local52 >> 14 & 0x7FFF;
				if (local52 != local44) {
					local44 = local52;
					@Pc(221) int local221;
					if (local68 == 2 && this.aClass46_1.method511(this.anInt1052, local56, local62, local52) >= 0) {
						@Pc(94) Class26 local94 = Class26.method179(local74);
						if (local94.anIntArray83 != null) {
							local94 = local94.method180(748);
						}
						if (local94 == null) {
							continue;
						}
						if (this.anInt957 == 1) {
							this.aStringArray10[this.anInt956] = "Use " + this.aString26 + " with @cya@" + local94.aString4;
							this.anIntArray269[this.anInt956] = 611;
							this.anIntArray270[this.anInt956] = local52;
							this.anIntArray267[this.anInt956] = local56;
							this.anIntArray268[this.anInt956] = local62;
							this.anInt956++;
						} else if (this.anInt1047 != 1) {
							if (local94.aStringArray3 != null) {
								for (local221 = 4; local221 >= 0; local221--) {
									if (local94.aStringArray3[local221] != null) {
										this.aStringArray10[this.anInt956] = local94.aStringArray3[local221] + " @cya@" + local94.aString4;
										if (local221 == 0) {
											this.anIntArray269[this.anInt956] = 74;
										}
										if (local221 == 1) {
											this.anIntArray269[this.anInt956] = 743;
										}
										if (local221 == 2) {
											this.anIntArray269[this.anInt956] = 125;
										}
										if (local221 == 3) {
											this.anIntArray269[this.anInt956] = 982;
										}
										if (local221 == 4) {
											this.anIntArray269[this.anInt956] = 1545;
										}
										this.anIntArray270[this.anInt956] = local52;
										this.anIntArray267[this.anInt956] = local56;
										this.anIntArray268[this.anInt956] = local62;
										this.anInt956++;
									}
								}
							}
							this.aStringArray10[this.anInt956] = "Examine @cya@" + local94.aString4;
							this.anIntArray269[this.anInt956] = 1634;
							this.anIntArray270[this.anInt956] = local94.anInt266 << 14;
							this.anIntArray267[this.anInt956] = local56;
							this.anIntArray268[this.anInt956] = local62;
							this.anInt956++;
						} else if ((this.anInt1049 & 0x4) == 4) {
							this.aStringArray10[this.anInt956] = this.aString30 + " @cya@" + local94.aString4;
							this.anIntArray269[this.anInt956] = 234;
							this.anIntArray270[this.anInt956] = local52;
							this.anIntArray267[this.anInt956] = local56;
							this.anIntArray268[this.anInt956] = local62;
							this.anInt956++;
						}
					}
					@Pc(401) Class5_Sub1_Sub2_Sub4_Sub1 local401;
					@Pc(449) Class5_Sub1_Sub2_Sub4_Sub2 local449;
					@Pc(439) int local439;
					if (local68 == 1) {
						@Pc(372) Class5_Sub1_Sub2_Sub4_Sub1 local372 = this.aClass5_Sub1_Sub2_Sub4_Sub1Array1[local74];
						if (local372.aClass49_1.aByte20 == 1 && (local372.anInt524 & 0x7F) == 64 && (local372.anInt525 & 0x7F) == 64) {
							for (local221 = 0; local221 < this.anInt943; local221++) {
								local401 = this.aClass5_Sub1_Sub2_Sub4_Sub1Array1[this.anIntArray243[local221]];
								if (local401 != null && local401 != local372 && local401.aClass49_1.aByte20 == 1 && local401.anInt524 == local372.anInt524 && local401.anInt525 == local372.anInt525) {
									this.method702(local56, local62, local401.aClass49_1, this.anIntArray243[local221]);
								}
							}
							for (local439 = 0; local439 < this.anInt984; local439++) {
								local449 = this.aClass5_Sub1_Sub2_Sub4_Sub2Array1[this.anIntArray253[local439]];
								if (local449 != null && local449.anInt524 == local372.anInt524 && local449.anInt525 == local372.anInt525) {
									this.method712(local56, local449, this.anIntArray253[local439], local62);
								}
							}
						}
						this.method702(local56, local62, local372.aClass49_1, local74);
					}
					if (local68 == 0) {
						@Pc(491) Class5_Sub1_Sub2_Sub4_Sub2 local491 = this.aClass5_Sub1_Sub2_Sub4_Sub2Array1[local74];
						if ((local491.anInt524 & 0x7F) == 64 && (local491.anInt525 & 0x7F) == 64) {
							for (local221 = 0; local221 < this.anInt943; local221++) {
								local401 = this.aClass5_Sub1_Sub2_Sub4_Sub1Array1[this.anIntArray243[local221]];
								if (local401 != null && local401.aClass49_1.aByte20 == 1 && local401.anInt524 == local491.anInt524 && local401.anInt525 == local491.anInt525) {
									this.method702(local56, local62, local401.aClass49_1, this.anIntArray243[local221]);
								}
							}
							for (local439 = 0; local439 < this.anInt984; local439++) {
								local449 = this.aClass5_Sub1_Sub2_Sub4_Sub2Array1[this.anIntArray253[local439]];
								if (local449 != null && local449 != local491 && local449.anInt524 == local491.anInt524 && local449.anInt525 == local491.anInt525) {
									this.method712(local56, local449, this.anIntArray253[local439], local62);
								}
							}
						}
						this.method712(local56, local491, local74, local62);
					}
					if (local68 == 3) {
						@Pc(610) Class41 local610 = this.aClass41ArrayArrayArray1[this.anInt1052][local56][local62];
						if (local610 != null) {
							for (@Pc(617) Class5_Sub1_Sub2_Sub3 local617 = (Class5_Sub1_Sub2_Sub3) local610.method469(); local617 != null; local617 = (Class5_Sub1_Sub2_Sub3) local610.method471(247)) {
								@Pc(623) Class18 local623 = Class18.method117(local617.anInt257);
								if (this.anInt957 == 1) {
									this.aStringArray10[this.anInt956] = "Use " + this.aString26 + " with @lre@" + local623.aString2;
									this.anIntArray269[this.anInt956] = 341;
									this.anIntArray270[this.anInt956] = local617.anInt257;
									this.anIntArray267[this.anInt956] = local56;
									this.anIntArray268[this.anInt956] = local62;
									this.anInt956++;
								} else if (this.anInt1047 != 1) {
									for (@Pc(740) int local740 = 4; local740 >= 0; local740--) {
										if (local623.aStringArray2 != null && local623.aStringArray2[local740] != null) {
											this.aStringArray10[this.anInt956] = local623.aStringArray2[local740] + " @lre@" + local623.aString2;
											if (local740 == 0) {
												this.anIntArray269[this.anInt956] = 838;
											}
											if (local740 == 1) {
												this.anIntArray269[this.anInt956] = 775;
											}
											if (local740 == 2) {
												this.anIntArray269[this.anInt956] = 167;
											}
											if (local740 == 3) {
												this.anIntArray269[this.anInt956] = 396;
											}
											if (local740 == 4) {
												this.anIntArray269[this.anInt956] = 893;
											}
											this.anIntArray270[this.anInt956] = local617.anInt257;
											this.anIntArray267[this.anInt956] = local56;
											this.anIntArray268[this.anInt956] = local62;
											this.anInt956++;
										} else if (local740 == 2) {
											this.aStringArray10[this.anInt956] = "Take @lre@" + local623.aString2;
											this.anIntArray269[this.anInt956] = 167;
											this.anIntArray270[this.anInt956] = local617.anInt257;
											this.anIntArray267[this.anInt956] = local56;
											this.anIntArray268[this.anInt956] = local62;
											this.anInt956++;
										}
									}
									this.aStringArray10[this.anInt956] = "Examine @lre@" + local623.aString2;
									this.anIntArray269[this.anInt956] = 1642;
									this.anIntArray270[this.anInt956] = local617.anInt257;
									this.anIntArray267[this.anInt956] = local56;
									this.anIntArray268[this.anInt956] = local62;
									this.anInt956++;
								} else if ((this.anInt1049 & 0x1) == 1) {
									this.aStringArray10[this.anInt956] = this.aString30 + " @lre@" + local623.aString2;
									this.anIntArray269[this.anInt956] = 855;
									this.anIntArray270[this.anInt956] = local617.anInt257;
									this.anIntArray267[this.anInt956] = local56;
									this.anIntArray268[this.anInt956] = local62;
									this.anInt956++;
								}
							}
						}
					}
				}
			}
		} catch (@Pc(947) RuntimeException local947) {
			signlink.reporterror("40030, " + 0 + ", " + local947.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(BLclient!RRTTGXYM;)V")
	private void method603(@OriginalArg(0) byte arg0, @OriginalArg(1) Class36 arg1) {
		try {
			@Pc(6) boolean local6 = false;
			@Pc(18) int local18 = arg1.anInt591;
			@Pc(74) int local74;
			if ((local18 < 1 || local18 > 100) && (local18 < 701 || local18 > 800)) {
				if (local18 >= 101 && local18 <= 200 || local18 >= 801 && local18 <= 900) {
					local74 = this.anInt840;
					if (this.anInt841 != 2) {
						local74 = 0;
					}
					if (local18 > 800) {
						local18 -= 701;
					} else {
						local18 -= 101;
					}
					if (local18 >= local74) {
						arg1.aString14 = "";
						arg1.anInt570 = 0;
					} else {
						if (this.anIntArray240[local18] == 0) {
							arg1.aString14 = "@red@Offline";
						} else if (this.anIntArray240[local18] < 200) {
							if (this.anIntArray240[local18] == anInt1057) {
								arg1.aString14 = "@gre@World-" + (this.anIntArray240[local18] - 9);
							} else {
								arg1.aString14 = "@yel@World-" + (this.anIntArray240[local18] - 9);
							}
						} else if (this.anIntArray240[local18] == anInt1057) {
							arg1.aString14 = "@gre@Classic" + (this.anIntArray240[local18] - 219);
						} else {
							arg1.aString14 = "@yel@Classic" + (this.anIntArray240[local18] - 219);
						}
						arg1.anInt570 = 1;
					}
				} else if (local18 == 203) {
					local74 = this.anInt840;
					if (this.anInt841 != 2) {
						local74 = 0;
					}
					arg1.anInt597 = local74 * 15 + 20;
					if (arg1.anInt597 <= arg1.anInt579) {
						arg1.anInt597 = arg1.anInt579 + 1;
					}
				} else if (local18 >= 401 && local18 <= 500) {
					local18 -= 401;
					if (local18 == 0 && this.anInt841 == 0) {
						arg1.aString14 = "Loading ignore list";
						arg1.anInt570 = 0;
					} else if (local18 == 1 && this.anInt841 == 0) {
						arg1.aString14 = "Please wait...";
						arg1.anInt570 = 0;
					} else {
						local74 = this.anInt844;
						if (this.anInt841 == 0) {
							local74 = 0;
						}
						if (local18 >= local74) {
							arg1.aString14 = "";
							arg1.anInt570 = 0;
						} else {
							arg1.aString14 = Class28.method195(Class28.method192((byte) 7, this.aLongArray3[local18]));
							arg1.anInt570 = 1;
						}
					}
				} else if (local18 == 503) {
					arg1.anInt597 = this.anInt844 * 15 + 20;
					if (arg1.anInt597 <= arg1.anInt579) {
						arg1.anInt597 = arg1.anInt579 + 1;
					}
				} else if (local18 == 327) {
					arg1.anInt587 = 150;
					arg1.anInt588 = (int) (Math.sin((double) anInt1018 / 40.0D) * 256.0D) & 0x7FF;
					if (this.aBoolean259) {
						for (local74 = 0; local74 < 7; local74++) {
							@Pc(387) int local387 = this.anIntArray265[local74];
							if (local387 >= 0 && !Class33.aClass33Array1[local387].method351()) {
								return;
							}
						}
						this.aBoolean259 = false;
						@Pc(406) Class5_Sub1_Sub2_Sub5[] local406 = new Class5_Sub1_Sub2_Sub5[7];
						@Pc(408) int local408 = 0;
						for (@Pc(410) int local410 = 0; local410 < 7; local410++) {
							@Pc(417) int local417 = this.anIntArray265[local410];
							if (local417 >= 0) {
								local406[local408++] = Class33.aClass33Array1[local417].method352();
							}
						}
						@Pc(439) Class5_Sub1_Sub2_Sub5 local439 = new Class5_Sub1_Sub2_Sub5(8111, local408, local406);
						for (@Pc(441) int local441 = 0; local441 < 5; local441++) {
							if (this.anIntArray263[local441] != 0) {
								local439.method338(anIntArrayArray25[local441][0], anIntArrayArray25[local441][this.anIntArray263[local441]]);
								if (local441 == 1) {
									local439.method338(anIntArray262[0], anIntArray262[this.anIntArray263[local441]]);
								}
							}
						}
						local439.method331();
						local439.method332(Class11.aClass11Array1[aClass5_Sub1_Sub2_Sub4_Sub2_1.anInt494].anIntArray25[0]);
						local439.method341(64, 850, -30, -50, -30, true);
						arg1.anInt593 = 5;
						arg1.anInt594 = 0;
						Class36.method395(local439);
					}
				} else if (local18 == 324) {
					if (this.aClass5_Sub1_Sub1_Sub3_11 == null) {
						this.aClass5_Sub1_Sub1_Sub3_11 = arg1.aClass5_Sub1_Sub1_Sub3_1;
						this.aClass5_Sub1_Sub1_Sub3_12 = arg1.aClass5_Sub1_Sub1_Sub3_2;
					}
					if (this.aBoolean257) {
						arg1.aClass5_Sub1_Sub1_Sub3_1 = this.aClass5_Sub1_Sub1_Sub3_12;
					} else {
						arg1.aClass5_Sub1_Sub1_Sub3_1 = this.aClass5_Sub1_Sub1_Sub3_11;
					}
				} else if (local18 == 325) {
					if (this.aClass5_Sub1_Sub1_Sub3_11 == null) {
						this.aClass5_Sub1_Sub1_Sub3_11 = arg1.aClass5_Sub1_Sub1_Sub3_1;
						this.aClass5_Sub1_Sub1_Sub3_12 = arg1.aClass5_Sub1_Sub1_Sub3_2;
					}
					if (this.aBoolean257) {
						arg1.aClass5_Sub1_Sub1_Sub3_1 = this.aClass5_Sub1_Sub1_Sub3_11;
					} else {
						arg1.aClass5_Sub1_Sub1_Sub3_1 = this.aClass5_Sub1_Sub1_Sub3_12;
					}
				} else if (local18 == 600) {
					arg1.aString14 = this.aString19;
					if (anInt1018 % 20 < 10) {
						arg1.aString14 = arg1.aString14 + "|";
					} else {
						arg1.aString14 = arg1.aString14 + " ";
					}
				} else {
					if (local18 == 620) {
						if (this.anInt998 < 1) {
							arg1.aString14 = "";
						} else if (this.aBoolean216) {
							arg1.anInt582 = 16711680;
							arg1.aString14 = "Moderator option: Mute player for 48 hours: <ON>";
						} else {
							arg1.anInt582 = 16777215;
							arg1.aString14 = "Moderator option: Mute player for 48 hours: <OFF>";
						}
					}
					@Pc(646) String local646;
					if (local18 == 660) {
						local74 = this.anInt850 - this.anInt1035;
						if (local74 <= 0) {
							local646 = "earlier today";
						} else if (local74 == 1) {
							local646 = "yesterday";
						} else {
							local646 = local74 + " days ago";
						}
						arg1.aString14 = "You last logged in @red@" + local646 + "@bla@ from: @red@" + signlink.dns;
					}
					if (local18 == 661) {
						if (this.anInt905 == 0) {
							arg1.aString14 = "\\nYou have not yet set any recovery questions.\\nIt is @lre@strongly@yel@ recommended that you do so.\\n\\nIf you don't you will be @lre@unable to recover your\\n@lre@password@yel@ if you forget it, or it is stolen.";
						} else if (this.anInt905 <= this.anInt850) {
							arg1.aString14 = "\\n\\nRecovery Questions Last Set:\\n@gre@" + this.method604(this.anInt905);
						} else {
							local74 = this.anInt850 + 14 - this.anInt905;
							if (local74 <= 0) {
								local646 = "Earlier today";
							} else if (local74 == 1) {
								local646 = "Yesterday";
							} else {
								local646 = local74 + " days ago";
							}
							arg1.aString14 = local646 + " you requested@lre@ new recovery\\n@lre@questions.@yel@ The requested change will occur\\non: @lre@" + this.method604(this.anInt905) + "\\n\\nIf you do not remember making this request\\ncancel it immediately, and change your password.";
						}
					}
					if (local18 == 662) {
						@Pc(764) String local764;
						if (this.anInt964 == 0) {
							local764 = "@yel@0 unread messages";
						} else if (this.anInt964 == 1) {
							local764 = "@gre@1 unread message";
						} else {
							local764 = "@gre@" + this.anInt964 + " unread messages";
						}
						arg1.aString14 = "You have " + local764 + "\\nin your message centre.";
					}
					if (local18 == 663) {
						if (this.anInt1032 > 0 && this.anInt1032 <= this.anInt850 + 10) {
							arg1.aString14 = "Last password change:\\n@gre@" + this.method604(this.anInt1032);
						} else {
							arg1.aString14 = "Last password change:\\n@gre@Never changed";
						}
					}
					if (local18 == 664) {
						if (this.anInt991 == 0) {
							arg1.aString14 = "You have not yet set\\nany contact details.";
						}
						if (this.anInt991 == 1) {
							arg1.aString14 = "Contact Details Last Set:\\n@gre@" + this.method604(this.anInt920);
						}
						if (this.anInt991 == 2) {
							arg1.aString14 = "You need to set\\nnew contact details.";
						}
					}
					if (local18 == 665) {
						if (this.anInt1013 > 2 && !aBoolean260) {
							arg1.aString14 = "This is a non-members\\nworld. To enjoy your\\nmembers benefits we\\nrecommend you play on a\\nmembers world instead.";
						} else if (this.anInt1013 > 2) {
							arg1.aString14 = "\\n\\nYou have @gre@" + this.anInt1013 + "@yel@ days of\\nmember credit remaining.";
						} else if (this.anInt1013 > 0) {
							arg1.aString14 = "You have @gre@" + this.anInt1013 + "@yel@ days of\\nmember credit remaining.\\n\\n@lre@Credit low! Renew now\\n@lre@to avoid losing members.";
						} else {
							arg1.aString14 = "You are not a member.\\n\\nChoose to subscribe and\\nyou'll get loads of extra\\nbenefits and features.";
						}
					}
					if (local18 == 667) {
						if (this.anInt1013 > 2 && !aBoolean260) {
							arg1.aString14 = "To switch to a members-only world:\\n1) Logout and return to the world selection page.\\n2) Choose one of the members world with a gold star next to it's name.\\n\\nIf you prefer you can continue to use this world,\\nbut members only features will be unavailable here.";
						} else if (this.anInt1013 > 0) {
							arg1.aString14 = "To extend or cancel a subscription:\\n1) Logout and return to the frontpage of this website.\\n2)Choose the relevant option from the 'membership' section.\\n\\nNote: If you are a credit card subscriber a top-up payment will\\nautomatically be taken when 3 days credit remain.\\n(unless you cancel your subscription, which can be done at any time.)";
						} else {
							arg1.aString14 = "To start a subscripton:\\n1) Logout and return to the frontpage of this website.\\n2) Choose 'Start a new subscription'";
						}
					}
					if (local18 == 668) {
						if (this.anInt905 > this.anInt850) {
							arg1.aString14 = "To cancel this request:\\n1) Logout and return to the frontpage of this website.\\n2) Choose 'Cancel recovery questions'.";
						} else {
							arg1.aString14 = "To change your recovery questions:\\n1) Logout and return to the frontpage of this website.\\n2) Choose 'Set new recovery questions'.";
						}
					}
				}
			} else if (local18 == 1 && this.anInt841 == 0) {
				arg1.aString14 = "Loading friend list";
				arg1.anInt570 = 0;
			} else if (local18 == 1 && this.anInt841 == 1) {
				arg1.aString14 = "Connecting to friendserver";
				arg1.anInt570 = 0;
			} else if (local18 == 2 && this.anInt841 != 2) {
				arg1.aString14 = "Please wait...";
				arg1.anInt570 = 0;
			} else {
				local74 = this.anInt840;
				if (this.anInt841 != 2) {
					local74 = 0;
				}
				if (local18 > 700) {
					local18 -= 601;
				} else {
					local18--;
				}
				if (local18 >= local74) {
					arg1.aString14 = "";
					arg1.anInt570 = 0;
				} else {
					arg1.aString14 = this.aStringArray12[local18];
					arg1.anInt570 = 1;
				}
			}
		} catch (@Pc(954) RuntimeException local954) {
			signlink.reporterror("2458, " + arg0 + ", " + arg1 + ", " + local954.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(II)Ljava/lang/String;")
	private String method604(@OriginalArg(1) int arg0) {
		try {
			if (arg0 > this.anInt850 + 10) {
				return "Unknown";
			}
			@Pc(14) long local14 = ((long) arg0 + 11745L) * 86400000L;
			@Pc(16) Calendar local16 = Calendar.getInstance();
			local16.setTime(new Date(local14));
			@Pc(26) int local26 = local16.get(5);
			@Pc(30) int local30 = local16.get(2);
			@Pc(34) int local34 = local16.get(1);
			@Pc(85) String[] local85 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };
			return local26 + "-" + local85[local30] + "-" + local34;
		} catch (@Pc(109) RuntimeException local109) {
			signlink.reporterror("2119, " + -26581 + ", " + arg0 + ", " + local109.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "o", descriptor = "(I)V")
	private void method605() {
		try {
			@Pc(12) int local12;
			for (@Pc(5) int local5 = 10; local5 < 117; local5++) {
				local12 = (int) (Math.random() * 100.0D);
				if (local12 < 50) {
					this.anIntArray241[local5 + 32512] = 255;
				}
			}
			@Pc(41) int local41;
			@Pc(48) int local48;
			@Pc(54) int local54;
			for (local12 = 0; local12 < 100; local12++) {
				local41 = (int) (Math.random() * 124.0D) + 2;
				local48 = (int) (Math.random() * 128.0D) + 128;
				local54 = local41 + (local48 << 7);
				this.anIntArray241[local54] = 192;
			}
			for (local41 = 1; local41 < 255; local41++) {
				for (local48 = 1; local48 < 127; local48++) {
					local54 = local48 + (local41 << 7);
					this.anIntArray242[local54] = (this.anIntArray241[local54 - 1] + this.anIntArray241[local54 + 1] + this.anIntArray241[local54 - 128] + this.anIntArray241[local54 + 128]) / 4;
				}
			}
			this.anInt916 += 128;
			if (this.anInt916 > this.anIntArray227.length) {
				this.anInt916 -= this.anIntArray227.length;
				local48 = (int) (Math.random() * 12.0D);
				this.method632(this.aClass5_Sub1_Sub1_Sub2Array4[local48]);
			}
			@Pc(170) int local170;
			for (local48 = 1; local48 < 255; local48++) {
				for (local54 = 1; local54 < 127; local54++) {
					local170 = local54 + (local48 << 7);
					@Pc(193) int local193 = this.anIntArray242[local170 + 128] - this.anIntArray227[local170 + this.anInt916 & this.anIntArray227.length - 1] / 5;
					if (local193 < 0) {
						local193 = 0;
					}
					this.anIntArray241[local170] = local193;
				}
			}
			for (local54 = 0; local54 < 255; local54++) {
				this.anIntArray217[local54] = this.anIntArray217[local54 + 1];
			}
			this.anIntArray217[255] = (int) (Math.sin((double) anInt1018 / 14.0D) * 16.0D + Math.sin((double) anInt1018 / 15.0D) * 14.0D + Math.sin((double) anInt1018 / 16.0D) * 12.0D);
			if (this.anInt898 > 0) {
				this.anInt898 -= 4;
			}
			if (this.anInt899 > 0) {
				this.anInt899 -= 4;
			}
			if (this.anInt898 == 0 && this.anInt899 == 0) {
				local170 = (int) (Math.random() * 2000.0D);
				if (local170 == 0) {
					this.anInt898 = 1024;
				}
				if (local170 == 1) {
					this.anInt899 = 1024;
					return;
				}
			}
		} catch (@Pc(304) RuntimeException local304) {
			signlink.reporterror("27119, " + 5 + ", " + local304.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ZI)Z")
	private boolean method606(@OriginalArg(1) int arg0) {
		try {
			if (arg0 < 0) {
				return false;
			}
			@Pc(15) int local15 = this.anIntArray269[arg0];
			if (local15 >= 2000) {
				local15 -= 2000;
			}
			return local15 == 695;
		} catch (@Pc(27) RuntimeException local27) {
			signlink.reporterror("95394, " + false + ", " + arg0 + ", " + local27.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ZIII)Z")
	private boolean method607(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		try {
			@Pc(17) int local17 = arg2 >> 14 & 0x7FFF;
			@Pc(26) int local26 = this.aClass46_1.method511(this.anInt1052, arg1, arg0, arg2);
			if (local26 == -1) {
				return false;
			}
			@Pc(35) int local35 = local26 & 0x1F;
			@Pc(41) int local41 = local26 >> 6 & 0x3;
			if (local35 == 10 || local35 == 11 || local35 == 22) {
				@Pc(53) Class26 local53 = Class26.method179(local17);
				@Pc(61) int local61;
				@Pc(64) int local64;
				if (local41 == 0 || local41 == 2) {
					local61 = local53.anInt269;
					local64 = local53.anInt265;
				} else {
					local61 = local53.anInt265;
					local64 = local53.anInt269;
				}
				@Pc(75) int local75 = local53.anInt267;
				if (local41 != 0) {
					local75 = (local75 << local41 & 0xF) + (local75 >> 4 - local41);
				}
				this.method586(aClass5_Sub1_Sub2_Sub4_Sub2_1.anIntArray152[0], aClass5_Sub1_Sub2_Sub4_Sub2_1.anIntArray151[0], 0, 2, false, local61, local64, local75, 0, arg1, arg0);
			} else {
				this.method586(aClass5_Sub1_Sub2_Sub4_Sub2_1.anIntArray152[0], aClass5_Sub1_Sub2_Sub4_Sub2_1.anIntArray151[0], local35 + 1, 2, false, 0, 0, 0, local41, arg1, arg0);
			}
			this.anInt1003 = super.anInt824;
			this.anInt1004 = super.anInt825;
			this.anInt1006 = 2;
			this.anInt1005 = 0;
			return true;
		} catch (@Pc(152) RuntimeException local152) {
			signlink.reporterror("54395, " + false + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local152.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "f", descriptor = "(Z)V")
	private void method608() {
		try {
			if (this.anInt856 == 2) {
				this.method630((this.anInt901 - this.anInt874 << 7) + this.anInt904, this.anInt902 * 2, (this.anInt900 - this.anInt873 << 7) + this.anInt903);
				if (this.anInt1037 > -1 && anInt1018 % 20 < 10) {
					this.aClass5_Sub1_Sub1_Sub3Array4[0].method455(this.anInt1037 - 12, this.anInt1038 - 28);
				}
			}
		} catch (@Pc(66) RuntimeException local66) {
			signlink.reporterror("51536, " + false + ", " + local66.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(B)V")
	private void method609() {
		try {
			this.anInt977 = 0;
			@Pc(78) int local78;
			for (@Pc(14) int local14 = -1; local14 < this.anInt984 + this.anInt943; local14++) {
				@Pc(21) Class5_Sub1_Sub2_Sub4 local21;
				if (local14 == -1) {
					local21 = aClass5_Sub1_Sub2_Sub4_Sub2_1;
				} else if (local14 < this.anInt984) {
					local21 = this.aClass5_Sub1_Sub2_Sub4_Sub2Array1[this.anIntArray253[local14]];
				} else {
					local21 = this.aClass5_Sub1_Sub2_Sub4_Sub1Array1[this.anIntArray243[local14 - this.anInt984]];
				}
				if (local21 != null && local21.method372()) {
					@Pc(62) Class49 local62;
					if (local21 instanceof Class5_Sub1_Sub2_Sub4_Sub1) {
						local62 = ((Class5_Sub1_Sub2_Sub4_Sub1) local21).aClass49_1;
						if (local62.anIntArray197 != null) {
							local62 = local62.method534();
						}
						if (local62 == null) {
							continue;
						}
					}
					if (local14 >= this.anInt984) {
						local62 = ((Class5_Sub1_Sub2_Sub4_Sub1) local21).aClass49_1;
						if (local62.anInt760 >= 0 && local62.anInt760 < this.aClass5_Sub1_Sub1_Sub3Array7.length) {
							this.method629(local21, local21.anInt522 + 15);
							if (this.anInt1037 > -1) {
								this.aClass5_Sub1_Sub1_Sub3Array7[local62.anInt760].method455(this.anInt1037 - 12, this.anInt1038 - 30);
							}
						}
						if (this.anInt856 == 1 && this.anInt886 == this.anIntArray243[local14 - this.anInt984] && anInt1018 % 20 < 10) {
							this.method629(local21, local21.anInt522 + 15);
							if (this.anInt1037 > -1) {
								this.aClass5_Sub1_Sub1_Sub3Array4[0].method455(this.anInt1037 - 12, this.anInt1038 - 28);
							}
						}
					} else {
						local78 = 30;
						@Pc(81) Class5_Sub1_Sub2_Sub4_Sub2 local81 = (Class5_Sub1_Sub2_Sub4_Sub2) local21;
						if (local81.anInt557 != -1 || local81.anInt552 != -1) {
							this.method629(local21, local21.anInt522 + 15);
							if (this.anInt1037 > -1) {
								if (local81.anInt557 != -1) {
									this.aClass5_Sub1_Sub1_Sub3Array9[local81.anInt557].method455(this.anInt1037 - 12, this.anInt1038 - 30);
									local78 += 25;
								}
								if (local81.anInt552 != -1) {
									this.aClass5_Sub1_Sub1_Sub3Array7[local81.anInt552].method455(this.anInt1037 - 12, this.anInt1038 - local78);
									local78 += 25;
								}
							}
						}
						if (local14 >= 0 && this.anInt856 == 10 && this.anInt961 == this.anIntArray253[local14]) {
							this.method629(local21, local21.anInt522 + 15);
							if (this.anInt1037 > -1) {
								this.aClass5_Sub1_Sub1_Sub3Array4[1].method455(this.anInt1037 - 12, this.anInt1038 - local78);
							}
						}
					}
					if (local21.aString7 != null && (local14 >= this.anInt984 || this.anInt1025 == 0 || this.anInt1025 == 3 || this.anInt1025 == 1 && this.method600(((Class5_Sub1_Sub2_Sub4_Sub2) local21).aString8))) {
						this.method629(local21, local21.anInt522);
						if (this.anInt1037 > -1 && this.anInt977 < this.anInt978) {
							this.anIntArray249[this.anInt977] = this.aClass5_Sub1_Sub1_Sub1_4.method43(local21.aString7) / 2;
							this.anIntArray248[this.anInt977] = this.aClass5_Sub1_Sub1_Sub1_4.anInt47;
							this.anIntArray246[this.anInt977] = this.anInt1037;
							this.anIntArray247[this.anInt977] = this.anInt1038;
							this.anIntArray250[this.anInt977] = local21.anInt509;
							this.anIntArray251[this.anInt977] = local21.anInt493;
							this.anIntArray252[this.anInt977] = local21.anInt507;
							this.aStringArray11[this.anInt977++] = local21.aString7;
							if (this.anInt881 == 0 && local21.anInt493 >= 1 && local21.anInt493 <= 3) {
								this.anIntArray248[this.anInt977] += 10;
								this.anIntArray247[this.anInt977] += 5;
							}
							if (this.anInt881 == 0 && local21.anInt493 == 4) {
								this.anIntArray249[this.anInt977] = 60;
							}
							if (this.anInt881 == 0 && local21.anInt493 == 5) {
								this.anIntArray248[this.anInt977] += 5;
							}
						}
					}
					if (local21.anInt518 > anInt1018) {
						this.method629(local21, local21.anInt522 + 15);
						if (this.anInt1037 > -1) {
							local78 = local21.anInt519 * 30 / local21.anInt520;
							if (local78 > 30) {
								local78 = 30;
							}
							Class5_Sub1_Sub1.method549(65280, this.anInt1037 - 15, local78, this.anInt1038 - 3, 5);
							Class5_Sub1_Sub1.method549(16711680, this.anInt1037 + local78 - 15, 30 - local78, this.anInt1038 - 3, 5);
						}
					}
					for (local78 = 0; local78 < 4; local78++) {
						if (local21.anIntArray155[local78] > anInt1018) {
							this.method629(local21, local21.anInt522 / 2);
							if (this.anInt1037 > -1) {
								if (local78 == 1) {
									this.anInt1038 -= 20;
								}
								if (local78 == 2) {
									this.anInt1037 -= 15;
									this.anInt1038 -= 10;
								}
								if (local78 == 3) {
									this.anInt1037 += 15;
									this.anInt1038 -= 10;
								}
								this.aClass5_Sub1_Sub1_Sub3Array5[local21.anIntArray154[local78]].method455(this.anInt1037 - 12, this.anInt1038 - 12);
								this.aClass5_Sub1_Sub1_Sub1_2.method40(this.anInt1038 + 4, this.anInt1037, String.valueOf(local21.anIntArray153[local78]), 0);
								this.aClass5_Sub1_Sub1_Sub1_2.method40(this.anInt1038 + 3, this.anInt1037 - 1, String.valueOf(local21.anIntArray153[local78]), 16777215);
							}
						}
					}
				}
			}
			for (@Pc(618) int local618 = 0; local618 < this.anInt977; local618++) {
				local78 = this.anIntArray246[local618];
				@Pc(630) int local630 = this.anIntArray247[local618];
				@Pc(635) int local635 = this.anIntArray249[local618];
				@Pc(640) int local640 = this.anIntArray248[local618];
				@Pc(642) boolean local642 = true;
				while (local642) {
					local642 = false;
					for (@Pc(648) int local648 = 0; local648 < local618; local648++) {
						if (local630 + 2 > this.anIntArray247[local648] - this.anIntArray248[local648] && local630 - local640 < this.anIntArray247[local648] + 2 && local78 - local635 < this.anIntArray246[local648] + this.anIntArray249[local648] && local78 + local635 > this.anIntArray246[local648] - this.anIntArray249[local648] && this.anIntArray247[local648] - this.anIntArray248[local648] < local630) {
							local630 = this.anIntArray247[local648] - this.anIntArray248[local648];
							local642 = true;
						}
					}
				}
				this.anInt1037 = this.anIntArray246[local618];
				this.anInt1038 = this.anIntArray247[local618] = local630;
				@Pc(747) String local747 = this.aStringArray11[local618];
				if (this.anInt881 == 0) {
					@Pc(752) int local752 = 16776960;
					if (this.anIntArray250[local618] < 6) {
						local752 = this.anIntArray264[this.anIntArray250[local618]];
					}
					if (this.anIntArray250[local618] == 6) {
						local752 = this.anInt1045 % 20 < 10 ? 16711680 : 16776960;
					}
					if (this.anIntArray250[local618] == 7) {
						local752 = this.anInt1045 % 20 < 10 ? 255 : 65535;
					}
					if (this.anIntArray250[local618] == 8) {
						local752 = this.anInt1045 % 20 < 10 ? 45056 : 8454016;
					}
					@Pc(827) int local827;
					if (this.anIntArray250[local618] == 9) {
						local827 = 150 - this.anIntArray252[local618];
						if (local827 < 50) {
							local752 = local827 * 1280 + 16711680;
						} else if (local827 < 100) {
							local752 = 16776960 - (local827 - 50) * 327680;
						} else if (local827 < 150) {
							local752 = (local827 - 100) * 5 + 65280;
						}
					}
					if (this.anIntArray250[local618] == 10) {
						local827 = 150 - this.anIntArray252[local618];
						if (local827 < 50) {
							local752 = local827 * 5 + 16711680;
						} else if (local827 < 100) {
							local752 = 16711935 - (local827 - 50) * 327680;
						} else if (local827 < 150) {
							local752 = (local827 - 100) * 327680 + 255 - (local827 - 100) * 5;
						}
					}
					if (this.anIntArray250[local618] == 11) {
						local827 = 150 - this.anIntArray252[local618];
						if (local827 < 50) {
							local752 = 16777215 - local827 * 327685;
						} else if (local827 < 100) {
							local752 = (local827 - 50) * 327685 + 65280;
						} else if (local827 < 150) {
							local752 = 16777215 - (local827 - 100) * 327680;
						}
					}
					if (this.anIntArray251[local618] == 0) {
						this.aClass5_Sub1_Sub1_Sub1_4.method40(this.anInt1038 + 1, this.anInt1037, local747, 0);
						this.aClass5_Sub1_Sub1_Sub1_4.method40(this.anInt1038, this.anInt1037, local747, local752);
					}
					if (this.anIntArray251[local618] == 1) {
						this.aClass5_Sub1_Sub1_Sub1_4.method45(0, local747, this.anInt1045, this.anInt1038 + 1, this.anInt1037);
						this.aClass5_Sub1_Sub1_Sub1_4.method45(local752, local747, this.anInt1045, this.anInt1038, this.anInt1037);
					}
					if (this.anIntArray251[local618] == 2) {
						this.aClass5_Sub1_Sub1_Sub1_4.method46(this.anInt1037, this.anInt1038 + 1, this.anInt1045, local747, 0);
						this.aClass5_Sub1_Sub1_Sub1_4.method46(this.anInt1037, this.anInt1038, this.anInt1045, local747, local752);
					}
					if (this.anIntArray251[local618] == 3) {
						this.aClass5_Sub1_Sub1_Sub1_4.method47(0, this.anInt1045, this.anInt1038 + 1, local747, this.anInt1037, 150 - this.anIntArray252[local618]);
						this.aClass5_Sub1_Sub1_Sub1_4.method47(local752, this.anInt1045, this.anInt1038, local747, this.anInt1037, 150 - this.anIntArray252[local618]);
					}
					@Pc(1124) int local1124;
					if (this.anIntArray251[local618] == 4) {
						local827 = this.aClass5_Sub1_Sub1_Sub1_4.method43(local747);
						local1124 = (150 - this.anIntArray252[local618]) * (local827 + 100) / 150;
						Class5_Sub1_Sub1.method546(334, 0, this.anInt1037 - 50, (byte) 6, this.anInt1037 + 50);
						this.aClass5_Sub1_Sub1_Sub1_4.method44(this.anInt1037 + 50 - local1124, local747, 0, this.anInt1038 + 1);
						this.aClass5_Sub1_Sub1_Sub1_4.method44(this.anInt1037 + 50 - local1124, local747, local752, this.anInt1038);
						Class5_Sub1_Sub1.method545(546);
					}
					if (this.anIntArray251[local618] == 5) {
						local827 = 150 - this.anIntArray252[local618];
						local1124 = 0;
						if (local827 < 25) {
							local1124 = local827 - 25;
						} else if (local827 > 125) {
							local1124 = local827 - 125;
						}
						Class5_Sub1_Sub1.method546(this.anInt1038 + 5, this.anInt1038 - this.aClass5_Sub1_Sub1_Sub1_4.anInt47 - 1, 0, (byte) 6, 512);
						this.aClass5_Sub1_Sub1_Sub1_4.method40(this.anInt1038 + local1124 + 1, this.anInt1037, local747, 0);
						this.aClass5_Sub1_Sub1_Sub1_4.method40(this.anInt1038 + local1124, this.anInt1037, local747, local752);
						Class5_Sub1_Sub1.method545(546);
					}
				} else {
					this.aClass5_Sub1_Sub1_Sub1_4.method40(this.anInt1038 + 1, this.anInt1037, local747, 0);
					this.aClass5_Sub1_Sub1_Sub1_4.method40(this.anInt1038, this.anInt1037, local747, 16776960);
				}
			}
		} catch (@Pc(1274) RuntimeException local1274) {
			signlink.reporterror("47724, " + -39 + ", " + local1274.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!RRTTGXYM;I)Z")
	private boolean method610(@OriginalArg(0) Class36 arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(5) boolean local5 = false;
			@Pc(8) int local8 = arg0.anInt591;
			if (local8 >= 1 && local8 <= 200 || !(local8 < 701 || local8 > 900)) {
				if (local8 >= 801) {
					local8 -= 701;
				} else if (local8 >= 701) {
					local8 -= 601;
				} else if (local8 >= 101) {
					local8 -= 101;
				} else {
					local8--;
				}
				this.aStringArray10[this.anInt956] = "Remove @whi@" + this.aStringArray12[local8];
				this.anIntArray269[this.anInt956] = 864;
				this.anInt956++;
				this.aStringArray10[this.anInt956] = "Message @whi@" + this.aStringArray12[local8];
				this.anIntArray269[this.anInt956] = 713;
				this.anInt956++;
				return true;
			} else if (local8 >= 401 && local8 <= 500) {
				this.aStringArray10[this.anInt956] = "Remove @whi@" + arg0.aString14;
				this.anIntArray269[this.anInt956] = 736;
				this.anInt956++;
				return true;
			} else {
				return false;
			}
		} catch (@Pc(131) RuntimeException local131) {
			signlink.reporterror("95786, " + arg0 + ", " + arg1 + ", " + local131.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IILclient!PKHWFJLM;)V")
	private void method611(@OriginalArg(0) int arg0, @OriginalArg(2) Class5_Sub1_Sub4 arg1) {
		try {
			for (@Pc(3) int local3 = 0; local3 < this.anInt985; local3++) {
				@Pc(10) int local10 = this.anIntArray254[local3];
				@Pc(15) Class5_Sub1_Sub2_Sub4_Sub1 local15 = this.aClass5_Sub1_Sub2_Sub4_Sub1Array1[local10];
				@Pc(18) int local18 = arg1.method240();
				@Pc(32) int local32;
				if ((local18 & 0x20) != 0) {
					local15.anInt533 = arg1.method267();
					local32 = arg1.method276(this.anInt922);
					local15.anInt537 = local32 >> 16;
					local15.anInt536 = anInt1018 + (local32 & 0xFFFF);
					local15.anInt534 = 0;
					local15.anInt535 = 0;
					if (local15.anInt536 > anInt1018) {
						local15.anInt534 = -1;
					}
					if (local15.anInt533 == 65535) {
						local15.anInt533 = -1;
					}
				}
				if ((local18 & 0x1) != 0) {
					local15.anInt530 = arg1.method269();
					local15.anInt531 = arg1.method242();
				}
				if ((local18 & 0x8) != 0) {
					local15.aClass49_1 = Class49.method537(arg1.method242());
					local15.anInt499 = local15.aClass49_1.aByte20;
					local15.anInt523 = local15.aClass49_1.anInt756;
					local15.anInt538 = local15.aClass49_1.anInt768;
					local15.anInt539 = local15.aClass49_1.anInt759;
					local15.anInt540 = local15.aClass49_1.anInt767;
					local15.anInt541 = local15.aClass49_1.anInt751;
					local15.anInt494 = local15.aClass49_1.anInt764;
				}
				if ((local18 & 0x2) != 0) {
					local15.anInt497 = arg1.method267();
					if (local15.anInt497 == 65535) {
						local15.anInt497 = -1;
					}
				}
				@Pc(149) int local149;
				if ((local18 & 0x4) != 0) {
					local32 = arg1.method261();
					local149 = arg1.method260();
					local15.method374(local149, anInt1018, local32);
					local15.anInt518 = anInt1018 + 300;
					local15.anInt519 = arg1.method259((byte) 7);
					local15.anInt520 = arg1.method259((byte) 7);
				}
				if ((local18 & 0x80) != 0) {
					local32 = arg1.method242();
					if (local32 == 65535) {
						local32 = -1;
					}
					local149 = arg1.method240();
					if (local32 == local15.anInt501 && local32 != -1) {
						@Pc(197) int local197 = Class11.aClass11Array1[local32].anInt111;
						if (local197 == 1) {
							local15.anInt502 = 0;
							local15.anInt503 = 0;
							local15.anInt504 = local149;
							local15.anInt505 = 0;
						}
						if (local197 == 2) {
							local15.anInt505 = 0;
						}
					} else if (local32 == -1 || local15.anInt501 == -1 || Class11.aClass11Array1[local32].anInt105 >= Class11.aClass11Array1[local15.anInt501].anInt105) {
						local15.anInt501 = local32;
						local15.anInt502 = 0;
						local15.anInt503 = 0;
						local15.anInt504 = local149;
						local15.anInt505 = 0;
						local15.anInt506 = local15.anInt510;
					}
				}
				if ((local18 & 0x10) != 0) {
					local15.aString7 = arg1.method247();
					local15.anInt507 = 100;
				}
				if ((local18 & 0x40) != 0) {
					local32 = arg1.method261();
					local149 = arg1.method259((byte) 7);
					local15.method374(local149, anInt1018, local32);
					local15.anInt518 = anInt1018 + 300;
					local15.anInt519 = arg1.method261();
					local15.anInt520 = arg1.method260();
				}
			}
		} catch (@Pc(321) RuntimeException local321) {
			signlink.reporterror("12642, " + arg0 + ", " + 8 + ", " + arg1 + ", " + local321.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "g", descriptor = "(Z)Ljava/lang/String;")
	private String method612() {
		try {
			if (signlink.mainapp == null) {
				return super.aFrame_Sub1_2 == null ? super.getDocumentBase().getHost().toLowerCase() : "runescape.com";
			} else {
				return signlink.mainapp.getDocumentBase().getHost().toLowerCase();
			}
		} catch (@Pc(21) RuntimeException local21) {
			signlink.reporterror("88801, " + true + ", " + local21.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!NTHYVEDA;I)V")
	private void method613(@OriginalArg(0) Class5_Sub3 arg0) {
		try {
			@Pc(1) int local1 = 0;
			@Pc(3) int local3 = -1;
			@Pc(5) int local5 = 0;
			@Pc(7) int local7 = 0;
			if (arg0.anInt305 == 0) {
				local1 = this.aClass46_1.method507(arg0.anInt304, arg0.anInt306, arg0.anInt307);
			}
			if (arg0.anInt305 == 1) {
				local1 = this.aClass46_1.method508(arg0.anInt304, arg0.anInt307, arg0.anInt306);
			}
			if (arg0.anInt305 == 2) {
				local1 = this.aClass46_1.method509(arg0.anInt304, arg0.anInt306, arg0.anInt307);
			}
			if (arg0.anInt305 == 3) {
				local1 = this.aClass46_1.method510(arg0.anInt304, arg0.anInt306, arg0.anInt307);
			}
			if (local1 != 0) {
				@Pc(76) int local76 = this.aClass46_1.method511(arg0.anInt304, arg0.anInt306, arg0.anInt307, local1);
				local3 = local1 >> 14 & 0x7FFF;
				local5 = local76 & 0x1F;
				local7 = local76 >> 6;
			}
			arg0.anInt301 = local3;
			arg0.anInt303 = local5;
			arg0.anInt302 = local7;
		} catch (@Pc(106) RuntimeException local106) {
			signlink.reporterror("91033, " + arg0 + ", " + 39431 + ", " + local106.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(IILclient!PKHWFJLM;)V")
	private void method614(@OriginalArg(1) int arg0, @OriginalArg(2) Class5_Sub1_Sub4 arg1) {
		try {
			for (@Pc(1) int local1 = 0; local1 < this.anInt985; local1++) {
				@Pc(8) int local8 = this.anIntArray254[local1];
				@Pc(13) Class5_Sub1_Sub2_Sub4_Sub2 local13 = this.aClass5_Sub1_Sub2_Sub4_Sub2Array1[local8];
				@Pc(16) int local16 = arg1.method240();
				if ((local16 & 0x40) != 0) {
					local16 += arg1.method240() << 8;
				}
				this.method624(local13, arg1, local8, local16);
			}
		} catch (@Pc(43) RuntimeException local43) {
			signlink.reporterror("27217, " + 0 + ", " + arg0 + ", " + arg1 + ", " + local43.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IZB)V")
	private void method615(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		try {
			signlink.anInt1066 = arg0;
			if (arg1) {
				signlink.midi = "voladjust";
			}
		} catch (@Pc(13) RuntimeException local13) {
			signlink.reporterror("15873, " + arg0 + ", " + arg1 + ", " + -3 + ", " + local13.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IZIIII)V")
	private void method616(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		try {
			@Pc(8) int local8 = this.aClass46_1.method507(arg3, arg2, arg4);
			@Pc(18) int local18;
			@Pc(24) int local24;
			@Pc(28) int local28;
			@Pc(30) int local30;
			@Pc(52) int local52;
			@Pc(58) int local58;
			if (local8 != 0) {
				local18 = this.aClass46_1.method511(arg3, arg2, arg4, local8);
				local24 = local18 >> 6 & 0x3;
				local28 = local18 & 0x1F;
				local30 = arg0;
				if (local8 > 0) {
					local30 = arg1;
				}
				@Pc(38) int[] local38 = this.aClass5_Sub1_Sub1_Sub3_14.anIntArray173;
				local52 = arg2 * 4 + (103 - arg4) * 512 * 4 + 24624;
				local58 = local8 >> 14 & 0x7FFF;
				@Pc(61) Class26 local61 = Class26.method179(local58);
				if (local61.anInt272 == -1) {
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
					@Pc(71) Class5_Sub1_Sub1_Sub2 local71 = this.aClass5_Sub1_Sub1_Sub2Array2[local61.anInt272];
					if (local71 != null) {
						@Pc(83) int local83 = (local61.anInt269 * 4 - local71.anInt626) / 2;
						@Pc(93) int local93 = (local61.anInt265 * 4 - local71.anInt627) / 2;
						local71.method417(arg2 * 4 + local83 + 48, (104 - arg4 - local61.anInt265) * 4 + 48 + local93);
					}
				}
			}
			local8 = this.aClass46_1.method509(arg3, arg2, arg4);
			if (local8 != 0) {
				local18 = this.aClass46_1.method511(arg3, arg2, arg4, local8);
				local24 = local18 >> 6 & 0x3;
				local28 = local18 & 0x1F;
				local30 = local8 >> 14 & 0x7FFF;
				@Pc(453) Class26 local453 = Class26.method179(local30);
				@Pc(485) int local485;
				if (local453.anInt272 != -1) {
					@Pc(463) Class5_Sub1_Sub1_Sub2 local463 = this.aClass5_Sub1_Sub1_Sub2Array2[local453.anInt272];
					if (local463 != null) {
						local58 = (local453.anInt269 * 4 - local463.anInt626) / 2;
						local485 = (local453.anInt265 * 4 - local463.anInt627) / 2;
						local463.method417(arg2 * 4 + local58 + 48, (104 - arg4 - local453.anInt265) * 4 + 48 + local485);
					}
				} else if (local28 == 9) {
					local52 = 15658734;
					if (local8 > 0) {
						local52 = 15597568;
					}
					@Pc(522) int[] local522 = this.aClass5_Sub1_Sub1_Sub3_14.anIntArray173;
					local485 = arg2 * 4 + (103 - arg4) * 512 * 4 + 24624;
					if (local24 == 0 || local24 == 2) {
						local522[local485 + 1536] = local52;
						local522[local485 + 1024 + 1] = local52;
						local522[local485 + 512 + 2] = local52;
						local522[local485 + 3] = local52;
					} else {
						local522[local485] = local52;
						local522[local485 + 512 + 1] = local52;
						local522[local485 + 1024 + 2] = local52;
						local522[local485 + 1536 + 3] = local52;
					}
				}
			}
			local8 = this.aClass46_1.method510(arg3, arg2, arg4);
			if (local8 != 0) {
				local18 = local8 >> 14 & 0x7FFF;
				@Pc(617) Class26 local617 = Class26.method179(local18);
				if (local617.anInt272 != -1) {
					@Pc(627) Class5_Sub1_Sub1_Sub2 local627 = this.aClass5_Sub1_Sub1_Sub2Array2[local617.anInt272];
					if (local627 != null) {
						local30 = (local617.anInt269 * 4 - local627.anInt626) / 2;
						@Pc(649) int local649 = (local617.anInt265 * 4 - local627.anInt627) / 2;
						local627.method417(arg2 * 4 + local30 + 48, (104 - arg4 - local617.anInt265) * 4 + 48 + local649);
						return;
					}
				}
			}
		} catch (@Pc(673) RuntimeException local673) {
			signlink.reporterror("50787, " + arg0 + ", " + false + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local673.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "p", descriptor = "(I)V")
	private void method617() {
		try {
			if (this.aClass6_6 == null) {
				super.aClass6_2 = null;
				this.aClass6_18 = null;
				this.aClass6_16 = null;
				this.aClass6_15 = null;
				this.aClass6_17 = null;
				this.aClass6_3 = null;
				this.aClass6_4 = null;
				this.aClass6_5 = null;
				this.aClass6_9 = new Class6(265, 128, this.method583(), false);
				Class5_Sub1_Sub1.method547();
				this.aClass6_10 = new Class6(265, 128, this.method583(), false);
				Class5_Sub1_Sub1.method547();
				this.aClass6_6 = new Class6(171, 509, this.method583(), false);
				Class5_Sub1_Sub1.method547();
				this.aClass6_7 = new Class6(132, 360, this.method583(), false);
				Class5_Sub1_Sub1.method547();
				this.aClass6_8 = new Class6(200, 360, this.method583(), false);
				Class5_Sub1_Sub1.method547();
				this.aClass6_11 = new Class6(238, 202, this.method583(), false);
				Class5_Sub1_Sub1.method547();
				this.aClass6_12 = new Class6(238, 203, this.method583(), false);
				Class5_Sub1_Sub1.method547();
				this.aClass6_13 = new Class6(94, 74, this.method583(), false);
				Class5_Sub1_Sub1.method547();
				this.aClass6_14 = new Class6(94, 75, this.method583(), false);
				Class5_Sub1_Sub1.method547();
				if (this.aClass40_2 != null) {
					this.method677();
					this.method627(aBoolean228);
				}
				this.aBoolean256 = true;
			}
		} catch (@Pc(166) RuntimeException local166) {
			signlink.reporterror("88876, " + -42111 + ", " + local166.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!PKHWFJLM;IZ)V")
	private void method618(@OriginalArg(0) Class5_Sub1_Sub4 arg0, @OriginalArg(1) int arg1) {
		try {
			this.anInt995 = 0;
			this.anInt985 = 0;
			this.method670(arg0, arg1);
			this.method694(arg0, arg1, this.anInt979);
			this.method611(arg1, arg0);
			this.aBoolean221 &= true;
			@Pc(38) int local38;
			for (@Pc(31) int local31 = 0; local31 < this.anInt995; local31++) {
				local38 = this.anIntArray259[local31];
				if (this.aClass5_Sub1_Sub2_Sub4_Sub1Array1[local38].anInt521 != anInt1018) {
					this.aClass5_Sub1_Sub2_Sub4_Sub1Array1[local38].aClass49_1 = null;
					this.aClass5_Sub1_Sub2_Sub4_Sub1Array1[local38] = null;
				}
			}
			if (arg0.anInt429 != arg1) {
				signlink.reporterror(this.aString17 + " size mismatch in getnpcpos - pos:" + arg0.anInt429 + " psize:" + arg1);
				throw new RuntimeException("eek");
			}
			for (local38 = 0; local38 < this.anInt943; local38++) {
				if (this.aClass5_Sub1_Sub2_Sub4_Sub1Array1[this.anIntArray243[local38]] == null) {
					signlink.reporterror(this.aString17 + " null entry in npc list - pos:" + local38 + " size:" + this.anInt943);
					throw new RuntimeException("eek");
				}
			}
		} catch (@Pc(128) RuntimeException local128) {
			signlink.reporterror("84739, " + arg0 + ", " + arg1 + ", " + true + ", " + local128.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!RRTTGXYM;Z)Z")
	private boolean method619(@OriginalArg(0) Class36 arg0) {
		try {
			if (arg0.anIntArray162 == null) {
				return false;
			}
			for (@Pc(6) int local6 = 0; local6 < arg0.anIntArray162.length; local6++) {
				@Pc(14) int local14 = this.method636(arg0, local6);
				@Pc(19) int local19 = arg0.anIntArray164[local6];
				if (arg0.anIntArray162[local6] == 2) {
					if (local14 >= local19) {
						return false;
					}
				} else if (arg0.anIntArray162[local6] == 3) {
					if (local14 <= local19) {
						return false;
					}
				} else if (arg0.anIntArray162[local6] == 4) {
					if (local14 == local19) {
						return false;
					}
				} else if (local14 != local19) {
					return false;
				}
			}
			return true;
		} catch (@Pc(71) RuntimeException local71) {
			signlink.reporterror("13001, " + arg0 + ", " + false + ", " + local71.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "h", descriptor = "(Z)V")
	private void method620() {
		try {
			@Pc(2) int local2 = this.anInt970;
			@Pc(5) int local5 = this.anInt971;
			@Pc(8) int local8 = this.anInt972;
			@Pc(11) int local11 = this.anInt973;
			Class5_Sub1_Sub1.method549(6116423, local2, local8, local5, local11);
			Class5_Sub1_Sub1.method549(0, local2 + 1, local8 - 2, local5 + 1, 16);
			Class5_Sub1_Sub1.method550(local5 + 18, local11 - 19, 0, local2 + 1, local8 - 2);
			this.aClass5_Sub1_Sub1_Sub1_4.method44(local2 + 3, "Choose Option", 6116423, local5 + 14);
			@Pc(68) int local68 = super.anInt818;
			@Pc(71) int local71 = super.anInt819;
			if (this.anInt969 == 0) {
				local68 -= 4;
				local71 -= 4;
			}
			if (this.anInt969 == 1) {
				local68 -= 553;
				local71 -= 205;
			}
			if (this.anInt969 == 2) {
				local68 -= 17;
				local71 -= 357;
			}
			for (@Pc(90) int local90 = 0; local90 < this.anInt956; local90++) {
				@Pc(105) int local105 = local5 + (this.anInt956 - 1 - local90) * 15 + 31;
				@Pc(107) int local107 = 16777215;
				if (local68 > local2 && local68 < local2 + local8 && local71 > local105 - 13 && local71 < local105 + 3) {
					local107 = 16776960;
				}
				this.aClass5_Sub1_Sub1_Sub1_4.method48(local105, local2 + 3, local107, this.aStringArray10[local90], true);
			}
		} catch (@Pc(148) RuntimeException local148) {
			signlink.reporterror("70497, " + false + ", " + local148.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIIIIII)V")
	private void method621(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		try {
			if (arg4 >= 1 && arg2 >= 1 && arg4 <= 102 && arg2 <= 102) {
				if (aBoolean261 && arg3 != this.anInt1052) {
					return;
				}
				@Pc(30) int local30 = 0;
				if (arg6 == 0) {
					local30 = this.aClass46_1.method507(arg3, arg4, arg2);
				}
				if (arg6 == 1) {
					local30 = this.aClass46_1.method508(arg3, arg2, arg4);
				}
				if (arg6 == 2) {
					local30 = this.aClass46_1.method509(arg3, arg4, arg2);
				}
				if (arg6 == 3) {
					local30 = this.aClass46_1.method510(arg3, arg4, arg2);
				}
				@Pc(86) int local86;
				if (local30 != 0) {
					local86 = this.aClass46_1.method511(arg3, arg4, arg2, local30);
					@Pc(92) int local92 = local30 >> 14 & 0x7FFF;
					@Pc(96) int local96 = local86 & 0x1F;
					@Pc(100) int local100 = local86 >> 6;
					@Pc(112) Class26 local112;
					if (arg6 == 0) {
						this.aClass46_1.method498(arg2, arg4, arg3);
						local112 = Class26.method179(local92);
						if (local112.aBoolean87) {
							this.aClass37Array1[arg3].method429(this.anInt933, local96, local112.aBoolean89, arg4, arg2, local100);
						}
					}
					if (arg6 == 1) {
						this.aClass46_1.method499(arg4, arg3, arg2);
					}
					if (arg6 == 2) {
						this.aClass46_1.method500(arg4, arg3, arg2);
						local112 = Class26.method179(local92);
						if (arg4 + local112.anInt269 > 103 || arg2 + local112.anInt269 > 103 || arg4 + local112.anInt265 > 103 || arg2 + local112.anInt265 > 103) {
							return;
						}
						if (local112.aBoolean87) {
							this.aClass37Array1[arg3].method430(arg4, local112.aBoolean89, (byte) 4, arg2, local112.anInt269, local112.anInt265, local100);
						}
					}
					if (arg6 == 3) {
						this.aClass46_1.method501(arg4, arg3, arg2);
						local112 = Class26.method179(local92);
						if (local112.aBoolean87 && local112.aBoolean78) {
							this.aClass37Array1[arg3].method432((byte) 1, arg4, arg2);
						}
					}
				}
				if (arg1 >= 0) {
					local86 = arg3;
					if (arg3 < 3 && (this.aByteArrayArrayArray8[1][arg4][arg2] & 0x2) == 2) {
						local86 = arg3 + 1;
					}
					Class8.method64(arg0, this.aClass46_1, arg1, local86, arg4, this.aClass37Array1[arg3], this.anIntArrayArrayArray8, arg2, arg5, arg3);
					return;
				}
			}
		} catch (@Pc(260) RuntimeException local260) {
			signlink.reporterror("52325, " + arg0 + ", " + arg1 + ", " + 2 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + local260.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(II)Ljava/lang/String;")
	private String method622(@OriginalArg(0) int arg0) {
		try {
			this.anInt938 += 0;
			return arg0 < 999999999 ? String.valueOf(arg0) : "*";
		} catch (@Pc(14) RuntimeException local14) {
			signlink.reporterror("72987, " + arg0 + ", " + 0 + ", " + local14.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "i", descriptor = "(Z)V")
	private void method623() {
		try {
			if (this.aClass6_18 == null) {
				this.method638();
				super.aClass6_2 = null;
				this.aClass6_6 = null;
				this.aClass6_7 = null;
				this.aClass6_8 = null;
				this.aClass6_9 = null;
				this.aClass6_10 = null;
				this.aClass6_11 = null;
				this.aClass6_12 = null;
				this.aClass6_13 = null;
				this.aClass6_14 = null;
				this.aClass6_18 = new Class6(96, 479, this.method583(), false);
				this.aClass6_16 = new Class6(156, 172, this.method583(), false);
				Class5_Sub1_Sub1.method547();
				this.aClass5_Sub1_Sub1_Sub2_7.method417(0, 0);
				this.aClass6_15 = new Class6(261, 190, this.method583(), false);
				this.aClass6_17 = new Class6(334, 512, this.method583(), false);
				Class5_Sub1_Sub1.method547();
				this.aClass6_3 = new Class6(50, 496, this.method583(), false);
				this.aClass6_4 = new Class6(37, 269, this.method583(), false);
				this.aClass6_5 = new Class6(45, 249, this.method583(), false);
				this.aBoolean256 = true;
				this.aClass6_17.method55();
				Class5_Sub1_Sub1_Sub4.anIntArray206 = this.anIntArray231;
			}
		} catch (@Pc(142) RuntimeException local142) {
			signlink.reporterror("36522, " + false + ", " + local142.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!QGDSNXKJ;Lclient!PKHWFJLM;IZI)V")
	private void method624(@OriginalArg(0) Class5_Sub1_Sub2_Sub4_Sub2 arg0, @OriginalArg(1) Class5_Sub1_Sub4 arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		try {
			if ((arg3 & 0x1) != 0) {
				arg0.aString7 = arg1.method247();
				if (arg0.aString7.charAt(0) == '~') {
					arg0.aString7 = arg0.aString7.substring(1);
					this.method720(2, arg0.aString8, arg0.aString7);
				} else if (arg0 == aClass5_Sub1_Sub2_Sub4_Sub2_1) {
					this.method720(2, arg0.aString8, arg0.aString7);
				}
				arg0.anInt509 = 0;
				arg0.anInt493 = 0;
				arg0.anInt507 = 150;
			}
			@Pc(64) int local64;
			@Pc(68) int local68;
			@Pc(71) int local71;
			if ((arg3 & 0x80) != 0) {
				local64 = arg1.method269();
				local68 = arg1.method261();
				local71 = arg1.method240();
				@Pc(74) int local74 = arg1.anInt429;
				if (arg0.aString8 != null && arg0.aBoolean140) {
					@Pc(84) long local84 = Class28.method191(arg0.aString8);
					@Pc(86) boolean local86 = false;
					if (local68 <= 1) {
						for (@Pc(91) int local91 = 0; local91 < this.anInt844; local91++) {
							if (this.aLongArray3[local91] == local84) {
								local86 = true;
								break;
							}
						}
					}
					if (!local86 && this.anInt1016 == 0) {
						try {
							this.aClass5_Sub1_Sub4_8.anInt429 = 0;
							arg1.method249(990, this.aClass5_Sub1_Sub4_8.aByteArray16, local71);
							this.aClass5_Sub1_Sub4_8.anInt429 = 0;
							@Pc(136) String local136 = Class31.method204(local71, this.aClass5_Sub1_Sub4_8);
							@Pc(140) String local140 = Class32.method288(local136);
							arg0.aString7 = local140;
							arg0.anInt509 = local64 >> 8;
							arg0.anInt493 = local64 & 0xFF;
							arg0.anInt507 = 150;
							if (local68 == 2 || local68 == 3) {
								this.method720(1, "@cr2@" + arg0.aString8, local140);
							} else if (local68 == 1) {
								this.method720(1, "@cr1@" + arg0.aString8, local140);
							} else {
								this.method720(2, arg0.aString8, local140);
							}
						} catch (@Pc(204) Exception local204) {
							signlink.reporterror("cde2");
						}
					}
				}
				arg1.anInt429 = local74 + local71;
			}
			if ((arg3 & 0x4) != 0) {
				local64 = arg1.method260();
				local68 = arg1.method260();
				arg0.method374(local68, anInt1018, local64);
				arg0.anInt518 = anInt1018 + 300;
				arg0.anInt519 = arg1.method259((byte) 7);
				arg0.anInt520 = arg1.method240();
			}
			if ((arg3 & 0x200) != 0) {
				arg0.anInt511 = arg1.method260();
				arg0.anInt513 = arg1.method260();
				arg0.anInt512 = arg1.method240();
				arg0.anInt514 = arg1.method259((byte) 7);
				arg0.anInt515 = arg1.method242() + anInt1018;
				arg0.anInt516 = arg1.method242() + anInt1018;
				arg0.anInt517 = arg1.method259((byte) 7);
				arg0.method376();
			}
			if ((arg3 & 0x8) != 0) {
				arg0.anInt497 = arg1.method268((byte) 5);
				if (arg0.anInt497 == 65535) {
					arg0.anInt497 = -1;
				}
			}
			if ((arg3 & 0x2) != 0) {
				arg0.anInt530 = arg1.method269();
				arg0.anInt531 = arg1.method268((byte) 5);
			}
			if ((arg3 & 0x20) != 0) {
				local64 = arg1.method268((byte) 5);
				if (local64 == 65535) {
					local64 = -1;
				}
				local68 = arg1.method259((byte) 7);
				if (local64 == arg0.anInt501 && local64 != -1) {
					local71 = Class11.aClass11Array1[local64].anInt111;
					if (local71 == 1) {
						arg0.anInt502 = 0;
						arg0.anInt503 = 0;
						arg0.anInt504 = local68;
						arg0.anInt505 = 0;
					}
					if (local71 == 2) {
						arg0.anInt505 = 0;
					}
				} else if (local64 == -1 || arg0.anInt501 == -1 || Class11.aClass11Array1[local64].anInt105 >= Class11.aClass11Array1[arg0.anInt501].anInt105) {
					arg0.anInt501 = local64;
					arg0.anInt502 = 0;
					arg0.anInt503 = 0;
					arg0.anInt504 = local68;
					arg0.anInt505 = 0;
					arg0.anInt506 = arg0.anInt510;
				}
			}
			if ((arg3 & 0x400) != 0) {
				arg0.anInt533 = arg1.method267();
				local64 = arg1.method245();
				arg0.anInt537 = local64 >> 16;
				arg0.anInt536 = anInt1018 + (local64 & 0xFFFF);
				arg0.anInt534 = 0;
				arg0.anInt535 = 0;
				if (arg0.anInt536 > anInt1018) {
					arg0.anInt534 = -1;
				}
				if (arg0.anInt533 == 65535) {
					arg0.anInt533 = -1;
				}
			}
			if ((arg3 & 0x10) != 0) {
				local64 = arg1.method240();
				@Pc(459) byte[] local459 = new byte[local64];
				@Pc(465) Class5_Sub1_Sub4 local465 = new Class5_Sub1_Sub4(local459, 0);
				arg1.method249(990, local459, local64);
				this.aClass5_Sub1_Sub4Array1[arg2] = local465;
				arg0.method377(local465);
			}
			if ((arg3 & 0x100) != 0) {
				local64 = arg1.method240();
				local68 = arg1.method260();
				arg0.method374(local68, anInt1018, local64);
				arg0.anInt518 = anInt1018 + 300;
				arg0.anInt519 = arg1.method260();
				arg0.anInt520 = arg1.method259((byte) 7);
			}
		} catch (@Pc(514) RuntimeException local514) {
			signlink.reporterror("95963, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + true + ", " + arg3 + ", " + local514.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ZB)V")
	private void method625(@OriginalArg(0) boolean arg0) {
		try {
			this.method617();
			this.aClass6_8.method55();
			this.aClass5_Sub1_Sub1_Sub2_4.method417(0, 0);
			@Pc(48) byte local48;
			@Pc(60) int local60;
			if (this.anInt906 == 0) {
				this.aClass5_Sub1_Sub1_Sub1_2.method41(180, this.aClass9_Sub1_1.aString3, true, 180, 7711145);
				local48 = 80;
				this.aClass5_Sub1_Sub1_Sub1_4.method41(180, "Welcome to RuneScape", true, 80, 16776960);
				local60 = local48 + 30;
				this.aClass5_Sub1_Sub1_Sub2_5.method417(27, 100);
				this.aClass5_Sub1_Sub1_Sub1_4.method41(100, "New User", true, 125, 16777215);
				this.aClass5_Sub1_Sub1_Sub2_5.method417(187, 100);
				this.aClass5_Sub1_Sub1_Sub1_4.method41(260, "Existing User", true, 125, 16777215);
			}
			if (this.anInt906 == 2) {
				local48 = 60;
				if (this.aString20.length() > 0) {
					this.aClass5_Sub1_Sub1_Sub1_4.method41(180, this.aString20, true, 45, 16776960);
					this.aClass5_Sub1_Sub1_Sub1_4.method41(180, this.aString21, true, 60, 16776960);
					local60 = local48 + 30;
				} else {
					this.aClass5_Sub1_Sub1_Sub1_4.method41(180, this.aString21, true, 53, 16776960);
					local60 = local48 + 30;
				}
				this.aClass5_Sub1_Sub1_Sub1_4.method48(90, 90, 16777215, "Username: " + this.aString17 + (this.anInt845 == 0 & anInt1018 % 40 < 20 ? "@yel@|" : ""), true);
				local60 += 15;
				this.aClass5_Sub1_Sub1_Sub1_4.method48(105, 92, 16777215, "Password: " + Class28.method196(this.aString18) + (this.anInt845 == 1 & anInt1018 % 40 < 20 ? "@yel@|" : ""), true);
				local60 += 15;
				if (!arg0) {
					this.aClass5_Sub1_Sub1_Sub2_5.method417(27, 130);
					this.aClass5_Sub1_Sub1_Sub1_4.method41(100, "Login", true, 155, 16777215);
					this.aClass5_Sub1_Sub1_Sub2_5.method417(187, 130);
					this.aClass5_Sub1_Sub1_Sub1_4.method41(260, "Cancel", true, 155, 16777215);
				}
			}
			if (this.anInt906 == 3) {
				this.aClass5_Sub1_Sub1_Sub1_4.method41(180, "Create a free account", true, 40, 16776960);
				local48 = 65;
				this.aClass5_Sub1_Sub1_Sub1_4.method41(180, "To create a new account you need to", true, 65, 16777215);
				local60 = local48 + 15;
				this.aClass5_Sub1_Sub1_Sub1_4.method41(180, "go back to the main RuneScape webpage", true, 80, 16777215);
				local60 += 15;
				this.aClass5_Sub1_Sub1_Sub1_4.method41(180, "and choose the red 'create account'", true, 95, 16777215);
				local60 += 15;
				this.aClass5_Sub1_Sub1_Sub1_4.method41(180, "button at the top right of that page.", true, 110, 16777215);
				local60 += 15;
				this.aClass5_Sub1_Sub1_Sub2_5.method417(107, 130);
				this.aClass5_Sub1_Sub1_Sub1_4.method41(180, "Cancel", true, 155, 16777215);
			}
			this.aClass6_8.method56(171, super.aGraphics2, 202);
			if (this.aBoolean256) {
				this.aBoolean256 = false;
				this.aClass6_6.method56(0, super.aGraphics2, 128);
				this.aClass6_7.method56(371, super.aGraphics2, 202);
				this.aClass6_11.method56(265, super.aGraphics2, 0);
				this.aClass6_12.method56(265, super.aGraphics2, 562);
				this.aClass6_13.method56(171, super.aGraphics2, 128);
				this.aClass6_14.method56(171, super.aGraphics2, 562);
			}
		} catch (@Pc(493) RuntimeException local493) {
			signlink.reporterror("94741, " + arg0 + ", " + 4 + ", " + local493.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
	@Override
	public AppletContext getAppletContext() {
		return signlink.mainapp == null ? super.getAppletContext() : signlink.mainapp.getAppletContext();
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(B)V")
	private void method626() {
		try {
			this.aBoolean259 = true;
			for (@Pc(14) int local14 = 0; local14 < 7; local14++) {
				this.anIntArray265[local14] = -1;
				for (@Pc(23) int local23 = 0; local23 < Class33.anInt468; local23++) {
					if (!Class33.aClass33Array1[local23].aBoolean130 && Class33.aClass33Array1[local23].anInt469 == local14 + (this.aBoolean257 ? 0 : 7)) {
						this.anIntArray265[local14] = local23;
						break;
					}
				}
			}
		} catch (@Pc(60) RuntimeException local60) {
			signlink.reporterror("54801, " + 75 + ", " + local60.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "j", descriptor = "(Z)V")
	private void method627(@OriginalArg(0) boolean arg0) {
		try {
			if (!arg0) {
				this.method578();
			}
			this.aClass5_Sub1_Sub1_Sub2_4 = new Class5_Sub1_Sub1_Sub2(this.aClass40_2, "titlebox", 0);
			this.aClass5_Sub1_Sub1_Sub2_5 = new Class5_Sub1_Sub1_Sub2(this.aClass40_2, "titlebutton", 0);
			this.aClass5_Sub1_Sub1_Sub2Array4 = new Class5_Sub1_Sub1_Sub2[12];
			@Pc(29) int local29 = 0;
			try {
				local29 = Integer.parseInt(this.getParameter("fl_icon"));
			} catch (@Pc(36) Exception local36) {
			}
			@Pc(40) int local40;
			if (local29 == 0) {
				for (local40 = 0; local40 < 12; local40++) {
					this.aClass5_Sub1_Sub1_Sub2Array4[local40] = new Class5_Sub1_Sub1_Sub2(this.aClass40_2, "runes", local40);
				}
			} else {
				for (local40 = 0; local40 < 12; local40++) {
					this.aClass5_Sub1_Sub1_Sub2Array4[local40] = new Class5_Sub1_Sub1_Sub2(this.aClass40_2, "runes", (local40 & 0x3) + 12);
				}
			}
			this.aClass5_Sub1_Sub1_Sub3_15 = new Class5_Sub1_Sub1_Sub3(128, 265);
			this.aClass5_Sub1_Sub1_Sub3_16 = new Class5_Sub1_Sub1_Sub3(128, 265);
			for (local40 = 0; local40 < 33920; local40++) {
				this.aClass5_Sub1_Sub1_Sub3_15.anIntArray173[local40] = this.aClass6_9.anIntArray12[local40];
			}
			for (@Pc(116) int local116 = 0; local116 < 33920; local116++) {
				this.aClass5_Sub1_Sub1_Sub3_16.anIntArray173[local116] = this.aClass6_10.anIntArray12[local116];
			}
			this.anIntArray256 = new int[256];
			for (@Pc(138) int local138 = 0; local138 < 64; local138++) {
				this.anIntArray256[local138] = local138 * 262144;
			}
			for (@Pc(153) int local153 = 0; local153 < 64; local153++) {
				this.anIntArray256[local153 + 64] = local153 * 1024 + 16711680;
			}
			for (@Pc(172) int local172 = 0; local172 < 64; local172++) {
				this.anIntArray256[local172 + 128] = local172 * 4 + 16776960;
			}
			for (@Pc(191) int local191 = 0; local191 < 64; local191++) {
				this.anIntArray256[local191 + 192] = 16777215;
			}
			this.anIntArray257 = new int[256];
			for (@Pc(210) int local210 = 0; local210 < 64; local210++) {
				this.anIntArray257[local210] = local210 * 1024;
			}
			for (@Pc(225) int local225 = 0; local225 < 64; local225++) {
				this.anIntArray257[local225 + 64] = local225 * 4 + 65280;
			}
			for (@Pc(244) int local244 = 0; local244 < 64; local244++) {
				this.anIntArray257[local244 + 128] = local244 * 262144 + 65535;
			}
			for (@Pc(263) int local263 = 0; local263 < 64; local263++) {
				this.anIntArray257[local263 + 192] = 16777215;
			}
			this.anIntArray258 = new int[256];
			for (@Pc(282) int local282 = 0; local282 < 64; local282++) {
				this.anIntArray258[local282] = local282 * 4;
			}
			for (@Pc(297) int local297 = 0; local297 < 64; local297++) {
				this.anIntArray258[local297 + 64] = local297 * 262144 + 255;
			}
			for (@Pc(316) int local316 = 0; local316 < 64; local316++) {
				this.anIntArray258[local316 + 128] = local316 * 1024 + 16711935;
			}
			for (@Pc(335) int local335 = 0; local335 < 64; local335++) {
				this.anIntArray258[local335 + 192] = 16777215;
			}
			this.anIntArray255 = new int[256];
			this.anIntArray227 = new int[32768];
			this.anIntArray228 = new int[32768];
			this.method632(null);
			this.anIntArray241 = new int[32768];
			this.anIntArray242 = new int[32768];
			this.method585("Connecting to fileserver", 10);
			if (!this.aBoolean249) {
				this.aBoolean226 = true;
				this.aBoolean249 = true;
				this.method584(this, 2);
			}
		} catch (@Pc(392) RuntimeException local392) {
			signlink.reporterror("61636, " + arg0 + ", " + local392.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "k", descriptor = "(Z)V")
	private void method628() {
		try {
			@Pc(6) Class5_Sub3 local6 = (Class5_Sub3) this.aClass41_10.method468();
			this.aBoolean221 &= true;
			while (local6 != null) {
				if (local6.anInt308 == -1) {
					local6.anInt297 = 0;
					this.method613(local6);
				} else {
					local6.method542();
				}
				local6 = (Class5_Sub3) this.aClass41_10.method470();
			}
		} catch (@Pc(39) RuntimeException local39) {
			signlink.reporterror("28196, " + true + ", " + local39.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ZLclient!SRUOAWPS;I)V")
	private void method629(@OriginalArg(1) Class5_Sub1_Sub2_Sub4 arg0, @OriginalArg(2) int arg1) {
		try {
			this.method630(arg0.anInt525, arg1, arg0.anInt524);
		} catch (@Pc(15) RuntimeException local15) {
			signlink.reporterror("71496, " + false + ", " + arg0 + ", " + arg1 + ", " + local15.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIBI)V")
	private void method630(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		try {
			if (arg2 >= 128 && arg0 >= 128 && arg2 <= 13056 && arg0 <= 13056) {
				@Pc(29) int local29 = this.method594(this.anInt1052, arg2, this.anInt867, arg0) - arg1;
				@Pc(34) int local34 = arg2 - this.anInt925;
				@Pc(39) int local39 = local29 - this.anInt926;
				@Pc(44) int local44 = arg0 - this.anInt927;
				@Pc(49) int local49 = Class5_Sub1_Sub2_Sub5.anIntArray141[this.anInt928];
				@Pc(54) int local54 = Class5_Sub1_Sub2_Sub5.anIntArray142[this.anInt928];
				@Pc(59) int local59 = Class5_Sub1_Sub2_Sub5.anIntArray141[this.anInt929];
				@Pc(64) int local64 = Class5_Sub1_Sub2_Sub5.anIntArray142[this.anInt929];
				@Pc(80) int local80 = local44 * local59 + local34 * local64 >> 16;
				@Pc(90) int local90 = local44 * local64 - local34 * local59 >> 16;
				@Pc(92) int local92 = local80;
				@Pc(102) int local102 = local39 * local54 - local90 * local49 >> 16;
				@Pc(112) int local112 = local39 * local49 + local90 * local54 >> 16;
				if (local112 >= 50) {
					this.anInt1037 = Class5_Sub1_Sub1_Sub4.anInt785 + (local92 << 9) / local112;
					this.anInt1038 = Class5_Sub1_Sub1_Sub4.anInt786 + (local102 << 9) / local112;
				} else {
					this.anInt1037 = -1;
					this.anInt1038 = -1;
				}
			} else {
				this.anInt1037 = -1;
				this.anInt1038 = -1;
			}
		} catch (@Pc(144) RuntimeException local144) {
			signlink.reporterror("54938, " + arg0 + ", " + arg1 + ", " + 36 + ", " + arg2 + ", " + local144.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(B)V")
	private void method631() {
		try {
			if (this.anInt965 > 1) {
				this.anInt965--;
			}
			if (this.anInt942 > 0) {
				this.anInt942--;
			}
			for (@Pc(22) int local22 = 0; local22 < 5 && this.method642(); local22++) {
			}
			if (this.aBoolean221) {
				@Pc(41) Object local41 = this.aClass38_1.anObject1;
				@Pc(66) int local66;
				@Pc(68) int local68;
				@Pc(70) int local70;
				@Pc(103) int local103;
				synchronized (this.aClass38_1.anObject1) {
					if (!aBoolean252) {
						this.aClass38_1.anInt653 = 0;
					} else if (super.anInt823 != 0 || this.aClass38_1.anInt653 >= 40) {
						this.aClass5_Sub1_Sub4_9.method229(70);
						this.aClass5_Sub1_Sub4_9.method230(0);
						local66 = this.aClass5_Sub1_Sub4_9.anInt429;
						local68 = 0;
						@Pc(86) int local86;
						for (local70 = 0; local70 < this.aClass38_1.anInt653 && local66 - this.aClass5_Sub1_Sub4_9.anInt429 < 240; local70++) {
							local68++;
							local86 = this.aClass38_1.anIntArray171[local70];
							if (local86 < 0) {
								local86 = 0;
							} else if (local86 > 502) {
								local86 = 502;
							}
							local103 = this.aClass38_1.anIntArray170[local70];
							if (local103 < 0) {
								local103 = 0;
							} else if (local103 > 764) {
								local103 = 764;
							}
							@Pc(120) int local120 = local86 * 765 + local103;
							if (this.aClass38_1.anIntArray171[local70] == -1 && this.aClass38_1.anIntArray170[local70] == -1) {
								local103 = -1;
								local86 = -1;
								local120 = 524287;
							}
							if (local103 != this.anInt829 || local86 != this.anInt830) {
								@Pc(165) int local165 = local103 - this.anInt829;
								this.anInt829 = local103;
								@Pc(173) int local173 = local86 - this.anInt830;
								this.anInt830 = local86;
								if (this.anInt1042 < 8 && local165 >= -32 && local165 <= 31 && local173 >= -32 && local173 <= 31) {
									local165 += 32;
									local173 += 32;
									this.aClass5_Sub1_Sub4_9.method231((this.anInt1042 << 12) + (local165 << 6) + local173);
									this.anInt1042 = 0;
								} else if (this.anInt1042 < 8) {
									this.aClass5_Sub1_Sub4_9.method233((this.anInt1042 << 19) + local120 + 8388608);
									this.anInt1042 = 0;
								} else {
									this.aClass5_Sub1_Sub4_9.method234((this.anInt1042 << 19) + local120 - 1073741824);
									this.anInt1042 = 0;
								}
							} else if (this.anInt1042 < 2047) {
								this.anInt1042++;
							}
						}
						this.aClass5_Sub1_Sub4_9.method239(this.aClass5_Sub1_Sub4_9.anInt429 - local66);
						if (local68 >= this.aClass38_1.anInt653) {
							this.aClass38_1.anInt653 = 0;
						} else {
							this.aClass38_1.anInt653 -= local68;
							for (local86 = 0; local86 < this.aClass38_1.anInt653; local86++) {
								this.aClass38_1.anIntArray170[local86] = this.aClass38_1.anIntArray170[local86 + local68];
								this.aClass38_1.anIntArray171[local86] = this.aClass38_1.anIntArray171[local86 + local68];
							}
						}
					}
				}
				if (super.anInt823 != 0) {
					@Pc(336) long local336 = (super.aLong28 - this.aLong30) / 50L;
					if (local336 > 4095L) {
						local336 = 4095L;
					}
					this.aLong30 = super.aLong28;
					local66 = super.anInt825;
					if (local66 < 0) {
						local66 = 0;
					} else if (local66 > 502) {
						local66 = 502;
					}
					local68 = super.anInt824;
					if (local68 < 0) {
						local68 = 0;
					} else if (local68 > 764) {
						local68 = 764;
					}
					local70 = local66 * 765 + local68;
					@Pc(382) byte local382 = 0;
					if (super.anInt823 == 2) {
						local382 = 1;
					}
					local103 = (int) local336;
					this.aClass5_Sub1_Sub4_9.method229(114);
					this.aClass5_Sub1_Sub4_9.method273((local103 << 20) + (local382 << 19) + local70);
				}
				if (this.anInt1001 > 0) {
					this.anInt1001--;
				}
				if (super.anIntArray210[1] == 1 || super.anIntArray210[2] == 1 || super.anIntArray210[3] == 1 || super.anIntArray210[4] == 1) {
					this.aBoolean250 = true;
				}
				if (this.aBoolean250 && this.anInt1001 <= 0) {
					this.anInt1001 = 20;
					this.aBoolean250 = false;
					this.aClass5_Sub1_Sub4_9.method229(19);
					this.aClass5_Sub1_Sub4_9.method231(this.anInt944);
					this.aClass5_Sub1_Sub4_9.method231(this.anInt945);
				}
				if (super.aBoolean213 && !this.aBoolean219) {
					this.aBoolean219 = true;
					this.aClass5_Sub1_Sub4_9.method229(217);
					this.aClass5_Sub1_Sub4_9.method230(1);
				}
				if (!super.aBoolean213 && this.aBoolean219) {
					this.aBoolean219 = false;
					this.aClass5_Sub1_Sub4_9.method229(217);
					this.aClass5_Sub1_Sub4_9.method230(0);
				}
				this.method592(this.anInt915);
				this.method695();
				this.method657();
				this.anInt940++;
				if (this.anInt940 > 750) {
					this.method679();
				}
				this.method664();
				this.method643();
				this.method676();
				this.anInt895++;
				if (this.anInt1006 != 0) {
					this.anInt1005 += 20;
					if (this.anInt1005 >= 400) {
						this.anInt1006 = 0;
					}
				}
				if (this.anInt1012 != 0) {
					this.anInt1009++;
					if (this.anInt1009 >= 15) {
						if (this.anInt1012 == 2) {
							this.aBoolean238 = true;
						}
						if (this.anInt1012 == 3) {
							this.aBoolean237 = true;
						}
						this.anInt1012 = 0;
					}
				}
				if (this.anInt988 != 0) {
					this.anInt934++;
					if (super.anInt818 > this.anInt989 + 5 || super.anInt818 < this.anInt989 - 5 || super.anInt819 > this.anInt990 + 5 || super.anInt819 < this.anInt990 - 5) {
						this.aBoolean225 = true;
					}
					if (super.anInt817 == 0) {
						if (this.anInt988 == 2) {
							this.aBoolean238 = true;
						}
						if (this.anInt988 == 3) {
							this.aBoolean237 = true;
						}
						this.anInt988 = 0;
						if (this.aBoolean225 && this.anInt934 >= 5) {
							this.anInt981 = -1;
							this.method714();
							if (this.anInt981 == this.anInt986 && this.anInt980 != this.anInt987) {
								@Pc(683) Class36 local683 = Class36.method388(this.anInt986);
								@Pc(685) byte local685 = 0;
								if (this.anInt1030 == 1 && local683.anInt591 == 206) {
									local685 = 1;
								}
								if (local683.anIntArray163[this.anInt980] <= 0) {
									local685 = 0;
								}
								if (local683.aBoolean146) {
									local66 = this.anInt987;
									local68 = this.anInt980;
									local683.anIntArray163[local68] = local683.anIntArray163[local66];
									local683.anIntArray166[local68] = local683.anIntArray166[local66];
									local683.anIntArray163[local66] = -1;
									local683.anIntArray166[local66] = 0;
								} else if (local685 == 1) {
									local66 = this.anInt987;
									local68 = this.anInt980;
									while (local66 != local68) {
										if (local66 > local68) {
											local683.method391(local66, local66 - 1);
											local66--;
										} else if (local66 < local68) {
											local683.method391(local66, local66 + 1);
											local66++;
										}
									}
								} else {
									local683.method391(this.anInt987, this.anInt980);
								}
								this.aClass5_Sub1_Sub4_9.method229(182);
								this.aClass5_Sub1_Sub4_9.method231(this.anInt986);
								this.aClass5_Sub1_Sub4_9.method265(this.anInt987);
								this.aClass5_Sub1_Sub4_9.method266(this.anInt980);
								this.aClass5_Sub1_Sub4_9.method256(local685);
							}
						} else if ((this.anInt1046 == 1 || this.method606(this.anInt956 - 1)) && this.anInt956 > 2) {
							this.method705();
						} else if (this.anInt956 > 0) {
							this.method661(this.anInt896, this.anInt956 - 1);
						}
						this.anInt1009 = 10;
						super.anInt823 = 0;
					}
				}
				@Pc(859) int local859;
				@Pc(861) int local861;
				if (Class46.anInt730 != -1) {
					local859 = Class46.anInt730;
					local861 = Class46.anInt731;
					@Pc(882) boolean local882 = this.method586(aClass5_Sub1_Sub2_Sub4_Sub2_1.anIntArray152[0], aClass5_Sub1_Sub2_Sub4_Sub2_1.anIntArray151[0], 0, 0, true, 0, 0, 0, 0, local859, local861);
					Class46.anInt730 = -1;
					if (local882) {
						this.anInt1003 = super.anInt824;
						this.anInt1004 = super.anInt825;
						this.anInt1006 = 1;
						this.anInt1005 = 0;
					}
				}
				if (super.anInt823 == 1 && this.aString28 != null) {
					this.aString28 = null;
					this.aBoolean237 = true;
					super.anInt823 = 0;
				}
				this.method710();
				if (this.anInt889 == -1) {
					this.method718();
					this.method591(this.anInt968);
					this.method587();
				}
				if (super.anInt817 == 1 || super.anInt823 == 1) {
					this.anInt888++;
				}
				if (this.anInt892 == 0 && this.anInt860 == 0 && this.anInt1044 == 0) {
					if (this.anInt953 > 0) {
						this.anInt953--;
					}
				} else if (this.anInt953 < 100) {
					this.anInt953++;
					if (this.anInt953 == 100) {
						if (this.anInt892 != 0) {
							this.aBoolean237 = true;
						}
						if (this.anInt860 != 0) {
							this.aBoolean238 = true;
						}
					}
				}
				if (this.anInt838 == 2) {
					this.method590();
				}
				if (this.anInt838 == 2 && this.aBoolean214) {
					this.method721();
				}
				for (local859 = 0; local859 < 5; local859++) {
					@Pc(1019) int local1019 = this.anIntArray224[local859]++;
				}
				this.method715();
				super.anInt816++;
				if (super.anInt816 > 4500) {
					this.anInt942 = 250;
					super.anInt816 -= 500;
					this.aClass5_Sub1_Sub4_9.method229(186);
				}
				this.anInt1036++;
				if (this.anInt1036 > 500) {
					this.anInt1036 = 0;
					local861 = (int) (Math.random() * 8.0D);
					if ((local861 & 0x1) == 1) {
						this.anInt877 += this.anInt878;
					}
					if ((local861 & 0x2) == 2) {
						this.anInt868 += this.anInt869;
					}
					if ((local861 & 0x4) == 4) {
						this.anInt879 += this.anInt880;
					}
				}
				if (this.anInt877 < -50) {
					this.anInt878 = 2;
				}
				if (this.anInt877 > 50) {
					this.anInt878 = -2;
				}
				if (this.anInt868 < -55) {
					this.anInt869 = 2;
				}
				if (this.anInt868 > 55) {
					this.anInt869 = -2;
				}
				if (this.anInt879 < -40) {
					this.anInt880 = 1;
				}
				if (this.anInt879 > 40) {
					this.anInt880 = -1;
				}
				this.anInt1039++;
				if (this.anInt1039 > 500) {
					this.anInt1039 = 0;
					local861 = (int) (Math.random() * 8.0D);
					if ((local861 & 0x1) == 1) {
						this.anInt893 += this.anInt894;
					}
					if ((local861 & 0x2) == 2) {
						this.anInt918 += this.anInt919;
					}
				}
				if (this.anInt893 < -60) {
					this.anInt894 = 2;
				}
				if (this.anInt893 > 60) {
					this.anInt894 = -2;
				}
				if (this.anInt918 < -20) {
					this.anInt919 = 1;
				}
				if (this.anInt918 > 10) {
					this.anInt919 = -1;
				}
				this.anInt941++;
				if (this.anInt941 > 50) {
					this.aClass5_Sub1_Sub4_9.method229(30);
				}
				try {
					if (this.aClass17_1 != null && this.aClass5_Sub1_Sub4_9.anInt429 > 0) {
						this.aClass17_1.method110(this.aClass5_Sub1_Sub4_9.aByteArray16, this.aClass5_Sub1_Sub4_9.anInt429, 866);
						this.aClass5_Sub1_Sub4_9.anInt429 = 0;
						this.anInt941 = 0;
					}
				} catch (@Pc(1267) IOException local1267) {
					this.method679();
				} catch (@Pc(1272) Exception local1272) {
					this.method659();
				}
			}
		} catch (@Pc(1277) RuntimeException local1277) {
			signlink.reporterror("32577, " + -75 + ", " + local1277.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!SFAIBATY;I)V")
	private void method632(@OriginalArg(0) Class5_Sub1_Sub1_Sub2 arg0) {
		try {
			for (@Pc(5) int local5 = 0; local5 < this.anIntArray227.length; local5++) {
				this.anIntArray227[local5] = 0;
			}
			@Pc(30) int local30;
			for (@Pc(20) int local20 = 0; local20 < 5000; local20++) {
				local30 = (int) (Math.random() * 128.0D * (double) 256);
				this.anIntArray227[local30] = (int) (Math.random() * 256.0D);
			}
			@Pc(53) int local53;
			@Pc(57) int local57;
			@Pc(65) int local65;
			for (local30 = 0; local30 < 20; local30++) {
				for (local53 = 1; local53 < 255; local53++) {
					for (local57 = 1; local57 < 127; local57++) {
						local65 = local57 + (local53 << 7);
						this.anIntArray228[local65] = (this.anIntArray227[local65 - 1] + this.anIntArray227[local65 + 1] + this.anIntArray227[local65 - 128] + this.anIntArray227[local65 + 128]) / 4;
					}
				}
				@Pc(111) int[] local111 = this.anIntArray227;
				this.anIntArray227 = this.anIntArray228;
				this.anIntArray228 = local111;
			}
			if (arg0 != null) {
				local53 = 0;
				for (local57 = 0; local57 < arg0.anInt627; local57++) {
					for (local65 = 0; local65 < arg0.anInt626; local65++) {
						if (arg0.aByteArray17[local53++] != 0) {
							@Pc(147) int local147 = local65 + arg0.anInt628 + 16;
							@Pc(154) int local154 = local57 + arg0.anInt629 + 16;
							@Pc(160) int local160 = local147 + (local154 << 7);
							this.anIntArray227[local160] = 0;
						}
					}
				}
			}
		} catch (@Pc(177) RuntimeException local177) {
			signlink.reporterror("97876, " + arg0 + ", " + -15612 + ", " + local177.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(B[BI)Z")
	private boolean method633(@OriginalArg(0) byte arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) {
		try {
			@Pc(4) boolean local4 = false;
			return arg1 == null ? true : signlink.wavesave(arg1, arg2);
		} catch (@Pc(18) RuntimeException local18) {
			signlink.reporterror("129, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local18.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(III)V")
	private void method634(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		try {
			@Pc(1) int local1 = 0;
			for (@Pc(6) int local6 = 0; local6 < 100; local6++) {
				if (this.aStringArray9[local6] != null) {
					@Pc(18) int local18 = this.anIntArray225[local6];
					@Pc(29) int local29 = this.anInt1033 + 70 + 4 - local1 * 14;
					if (local29 < -20) {
						break;
					}
					@Pc(37) String local37 = this.aStringArray8[local6];
					if (local37 != null && local37.startsWith("@cr1@")) {
						local37 = local37.substring(5);
					}
					if (local37 != null && local37.startsWith("@cr2@")) {
						local37 = local37.substring(5);
					}
					if (local18 == 0) {
						local1++;
					}
					if ((local18 == 1 || local18 == 2) && (local18 == 1 || this.anInt1025 == 0 || this.anInt1025 == 1 && this.method600(local37))) {
						if (arg0 > local29 - 14 && arg0 <= local29 && !local37.equals(aClass5_Sub1_Sub2_Sub4_Sub2_1.aString8)) {
							if (this.anInt998 >= 1) {
								this.aStringArray10[this.anInt956] = "Report abuse @whi@" + local37;
								this.anIntArray269[this.anInt956] = 556;
								this.anInt956++;
							}
							this.aStringArray10[this.anInt956] = "Add ignore @whi@" + local37;
							this.anIntArray269[this.anInt956] = 913;
							this.anInt956++;
							this.aStringArray10[this.anInt956] = "Add friend @whi@" + local37;
							this.anIntArray269[this.anInt956] = 695;
							this.anInt956++;
						}
						local1++;
					}
					if ((local18 == 3 || local18 == 7) && this.anInt909 == 0 && (local18 == 7 || this.anInt1043 == 0 || this.anInt1043 == 1 && this.method600(local37))) {
						if (arg0 > local29 - 14 && arg0 <= local29) {
							if (this.anInt998 >= 1) {
								this.aStringArray10[this.anInt956] = "Report abuse @whi@" + local37;
								this.anIntArray269[this.anInt956] = 556;
								this.anInt956++;
							}
							this.aStringArray10[this.anInt956] = "Add ignore @whi@" + local37;
							this.anIntArray269[this.anInt956] = 913;
							this.anInt956++;
							this.aStringArray10[this.anInt956] = "Add friend @whi@" + local37;
							this.anIntArray269[this.anInt956] = 695;
							this.anInt956++;
						}
						local1++;
					}
					if (local18 == 4 && (this.anInt963 == 0 || this.anInt963 == 1 && this.method600(local37))) {
						if (arg0 > local29 - 14 && arg0 <= local29) {
							this.aStringArray10[this.anInt956] = "Accept trade @whi@" + local37;
							this.anIntArray269[this.anInt956] = 117;
							this.anInt956++;
						}
						local1++;
					}
					if ((local18 == 5 || local18 == 6) && this.anInt909 == 0 && this.anInt1043 < 2) {
						local1++;
					}
					if (local18 == 8 && (this.anInt963 == 0 || this.anInt963 == 1 && this.method600(local37))) {
						if (arg0 > local29 - 14 && arg0 <= local29) {
							this.aStringArray10[this.anInt956] = "Accept challenge @whi@" + local37;
							this.anIntArray269[this.anInt956] = 264;
							this.anInt956++;
						}
						local1++;
					}
				}
			}
		} catch (@Pc(402) RuntimeException local402) {
			signlink.reporterror("74491, " + 0 + ", " + arg0 + ", " + arg1 + ", " + local402.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "l", descriptor = "(Z)V")
	private void method635() {
		try {
			@Pc(14) int local14;
			@Pc(21) int local21;
			if (this.anInt906 == 0) {
				local14 = super.anInt814 / 2 - 80;
				local21 = super.anInt815 / 2 + 20;
				local21 += 20;
				if (super.anInt823 == 1 && super.anInt824 >= local14 - 75 && super.anInt824 <= local14 + 75 && super.anInt825 >= local21 - 20 && super.anInt825 <= local21 + 20) {
					this.anInt906 = 3;
					this.anInt845 = 0;
				}
				local14 = super.anInt814 / 2 + 80;
				if (super.anInt823 == 1 && super.anInt824 >= local14 - 75 && super.anInt824 <= local14 + 75 && super.anInt825 >= local21 - 20 && super.anInt825 <= local21 + 20) {
					this.aString20 = "";
					this.aString21 = "Enter your username & password.";
					this.anInt906 = 2;
					this.anInt845 = 0;
				}
			} else if (this.anInt906 == 2) {
				local14 = super.anInt815 / 2 - 40;
				local14 += 30;
				local14 += 25;
				if (super.anInt823 == 1 && super.anInt825 >= local14 - 15 && super.anInt825 < local14) {
					this.anInt845 = 0;
				}
				local14 += 15;
				if (super.anInt823 == 1 && super.anInt825 >= local14 - 15 && super.anInt825 < local14) {
					this.anInt845 = 1;
				}
				local14 += 15;
				local21 = super.anInt814 / 2 - 80;
				@Pc(167) int local167 = super.anInt815 / 2 + 50;
				@Pc(168) int local168 = local167 + 20;
				if (super.anInt823 == 1 && super.anInt824 >= local21 - 75 && super.anInt824 <= local21 + 75 && super.anInt825 >= local168 - 20 && super.anInt825 <= local168 + 20) {
					this.anInt871 = 0;
					this.method656(this.aString17, this.aString18, false);
					if (this.aBoolean221) {
						return;
					}
				}
				local21 = super.anInt814 / 2 + 80;
				if (super.anInt823 == 1 && super.anInt824 >= local21 - 75 && super.anInt824 <= local21 + 75 && super.anInt825 >= local168 - 20 && super.anInt825 <= local168 + 20) {
					this.anInt906 = 0;
					this.aString17 = "";
					this.aString18 = "";
				}
				while (true) {
					while (true) {
						@Pc(258) int local258 = this.method577();
						if (local258 == -1) {
							return;
						}
						@Pc(263) boolean local263 = false;
						for (@Pc(265) int local265 = 0; local265 < aString29.length(); local265++) {
							if (local258 == aString29.charAt(local265)) {
								local263 = true;
								break;
							}
						}
						if (this.anInt845 == 0) {
							if (local258 == 8 && this.aString17.length() > 0) {
								this.aString17 = this.aString17.substring(0, this.aString17.length() - 1);
							}
							if (local258 == 9 || local258 == 10 || local258 == 13) {
								this.anInt845 = 1;
							}
							if (local263) {
								this.aString17 = this.aString17 + (char) local258;
							}
							if (this.aString17.length() > 12) {
								this.aString17 = this.aString17.substring(0, 12);
							}
						} else if (this.anInt845 == 1) {
							if (local258 == 8 && this.aString18.length() > 0) {
								this.aString18 = this.aString18.substring(0, this.aString18.length() - 1);
							}
							if (local258 == 9 || local258 == 10 || local258 == 13) {
								this.anInt845 = 0;
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
			} else if (this.anInt906 == 3) {
				local14 = super.anInt814 / 2;
				local21 = super.anInt815 / 2 + 50;
				@Pc(422) int local422 = local21 + 20;
				if (super.anInt823 == 1 && super.anInt824 >= local14 - 75 && super.anInt824 <= local14 + 75 && super.anInt825 >= local422 - 20 && super.anInt825 <= local422 + 20) {
					this.anInt906 = 0;
					return;
				}
			}
		} catch (@Pc(455) RuntimeException local455) {
			signlink.reporterror("93602, " + false + ", " + local455.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!RRTTGXYM;II)I")
	private int method636(@OriginalArg(0) Class36 arg0, @OriginalArg(2) int arg1) {
		try {
			if (arg0.anIntArrayArray14 == null || arg1 >= arg0.anIntArrayArray14.length) {
				return -2;
			}
			try {
				@Pc(20) int[] local20 = arg0.anIntArrayArray14[arg1];
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
						local33 = this.anIntArray213[local20[local24++]];
					}
					if (local31 == 2) {
						local33 = this.anIntArray226[local20[local24++]];
					}
					if (local31 == 3) {
						local33 = this.anIntArray219[local20[local24++]];
					}
					@Pc(81) Class36 local81;
					@Pc(86) int local86;
					@Pc(99) int local99;
					if (local31 == 4) {
						local81 = Class36.method388(local20[local24++]);
						local86 = local20[local24++];
						if (local86 >= 0 && local86 < Class18.anInt185 && (!Class18.method117(local86).aBoolean56 || aBoolean260)) {
							for (local99 = 0; local99 < local81.anIntArray163.length; local99++) {
								if (local81.anIntArray163[local99] == local86 + 1) {
									local33 += local81.anIntArray166[local99];
								}
							}
						}
					}
					if (local31 == 5) {
						local33 = this.anIntArray216[local20[local24++]];
					}
					if (local31 == 6) {
						local33 = anIntArray233[this.anIntArray226[local20[local24++]] - 1];
					}
					if (local31 == 7) {
						local33 = this.anIntArray216[local20[local24++]] * 100 / 46875;
					}
					if (local31 == 8) {
						local33 = aClass5_Sub1_Sub2_Sub4_Sub2_1.anInt544;
					}
					@Pc(174) int local174;
					if (local31 == 9) {
						for (local174 = 0; local174 < Class39.anInt675; local174++) {
							if (Class39.aBooleanArray9[local174]) {
								local33 += this.anIntArray226[local174];
							}
						}
					}
					if (local31 == 10) {
						local81 = Class36.method388(local20[local24++]);
						local86 = local20[local24++] + 1;
						if (local86 >= 0 && local86 < Class18.anInt185 && (!Class18.method117(local86).aBoolean56 || aBoolean260)) {
							for (local99 = 0; local99 < local81.anIntArray163.length; local99++) {
								if (local81.anIntArray163[local99] == local86) {
									local33 = 999999999;
									break;
								}
							}
						}
					}
					if (local31 == 11) {
						local33 = this.anInt976;
					}
					if (local31 == 12) {
						local33 = this.anInt1051;
					}
					if (local31 == 13) {
						local174 = this.anIntArray216[local20[local24++]];
						local86 = local20[local24++];
						local33 = (local174 & 0x1 << local86) == 0 ? 0 : 1;
					}
					if (local31 == 14) {
						local174 = local20[local24++];
						@Pc(288) Class4 local288 = Class4.aClass4Array1[local174];
						local99 = local288.anInt16;
						@Pc(294) int local294 = local288.anInt17;
						@Pc(297) int local297 = local288.anInt18;
						@Pc(303) int local303 = anIntArray222[local297 - local294];
						local33 = this.anIntArray216[local99] >> local294 & local303;
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
						local33 = (aClass5_Sub1_Sub2_Sub4_Sub2_1.anInt524 >> 7) + this.anInt873;
					}
					if (local31 == 19) {
						local33 = (aClass5_Sub1_Sub2_Sub4_Sub2_1.anInt525 >> 7) + this.anInt874;
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
			} catch (@Pc(396) Exception local396) {
				return -1;
			}
		} catch (@Pc(399) RuntimeException local399) {
			signlink.reporterror("23449, " + arg0 + ", " + -951 + ", " + arg1 + ", " + local399.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "m", descriptor = "(Z)V")
	private void method638() {
		try {
			this.aBoolean249 = false;
			while (this.aBoolean243) {
				this.aBoolean249 = false;
				try {
					Thread.sleep(50L);
				} catch (@Pc(11) Exception local11) {
				}
			}
			this.aClass5_Sub1_Sub1_Sub2_4 = null;
			this.aClass5_Sub1_Sub1_Sub2_5 = null;
			this.aClass5_Sub1_Sub1_Sub2Array4 = null;
			this.anIntArray255 = null;
			this.anIntArray256 = null;
			this.anIntArray257 = null;
			this.anIntArray258 = null;
			this.anIntArray227 = null;
			this.anIntArray228 = null;
			this.anIntArray241 = null;
			this.anIntArray242 = null;
			this.aClass5_Sub1_Sub1_Sub3_15 = null;
			this.aClass5_Sub1_Sub1_Sub3_16 = null;
		} catch (@Pc(60) RuntimeException local60) {
			signlink.reporterror("86016, " + true + ", " + local60.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "n", descriptor = "(Z)V")
	private void method639() {
		try {
			this.aClass5_Sub1_Sub4_9.method229(63);
			if (this.anInt1014 != -1) {
				this.method723(this.anInt1014);
				this.anInt1014 = -1;
				this.aBoolean238 = true;
				this.aBoolean227 = false;
				this.aBoolean244 = true;
			}
			if (this.anInt931 != -1) {
				this.method723(this.anInt931);
				this.anInt931 = -1;
				this.aBoolean237 = true;
				this.aBoolean227 = false;
			}
			if (this.anInt889 != -1) {
				this.method723(this.anInt889);
				this.anInt889 = -1;
				this.aBoolean256 = true;
			}
			if (this.anInt1026 != -1) {
				this.method723(this.anInt1026);
				this.anInt1026 = -1;
			}
			if (this.anInt949 != -1) {
				this.method723(this.anInt949);
				this.anInt949 = -1;
			}
		} catch (@Pc(94) RuntimeException local94) {
			signlink.reporterror("5675, " + false + ", " + local94.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(ZI)V")
	private void method640(@OriginalArg(0) boolean arg0) {
		try {
			if (aClass5_Sub1_Sub2_Sub4_Sub2_1.anInt524 >> 7 == this.anInt1028 && aClass5_Sub1_Sub2_Sub4_Sub2_1.anInt525 >> 7 == this.anInt1029) {
				this.anInt1028 = 0;
			}
			@Pc(21) int local21 = this.anInt984;
			if (arg0) {
				local21 = 1;
			}
			for (@Pc(27) int local27 = 0; local27 < local21; local27++) {
				@Pc(33) Class5_Sub1_Sub2_Sub4_Sub2 local33;
				@Pc(38) int local38;
				if (arg0) {
					local33 = aClass5_Sub1_Sub2_Sub4_Sub2_1;
					local38 = this.anInt983 << 14;
				} else {
					local33 = this.aClass5_Sub1_Sub2_Sub4_Sub2Array1[this.anIntArray253[local27]];
					local38 = this.anIntArray253[local27] << 14;
				}
				if (local33 != null && local33.method372()) {
					local33.aBoolean141 = false;
					if ((aBoolean261 && this.anInt984 > 50 || this.anInt984 > 200) && !arg0 && local33.anInt527 == local33.anInt494) {
						local33.aBoolean141 = true;
					}
					@Pc(89) int local89 = local33.anInt524 >> 7;
					@Pc(94) int local94 = local33.anInt525 >> 7;
					if (local89 >= 0 && local89 < 104 && local94 >= 0 && local94 < 104) {
						if (local33.aClass5_Sub1_Sub2_Sub5_2 == null || anInt1018 < local33.anInt542 || anInt1018 >= local33.anInt543) {
							if ((local33.anInt524 & 0x7F) == 64 && (local33.anInt525 & 0x7F) == 64) {
								if (this.anIntArrayArray23[local89][local94] == this.anInt1045) {
									continue;
								}
								this.anIntArrayArray23[local89][local94] = this.anInt1045;
							}
							local33.anInt556 = this.method594(this.anInt1052, local33.anInt524, this.anInt867, local33.anInt525);
							this.aClass46_1.method492(local33.anInt525, this.anInt1052, local33.anInt524, local33.aBoolean139, local33, local33.anInt556, 60, local33.anInt526, local38, this.anInt891);
						} else {
							local33.aBoolean141 = false;
							local33.anInt556 = this.method594(this.anInt1052, local33.anInt524, this.anInt867, local33.anInt525);
							this.aClass46_1.method493(local33.anInt525, local38, local33, local33.anInt556, local33.anInt524, local33.anInt547, local33.anInt549, local33.anInt548, this.anInt1052, local33.anInt550, local33.anInt526);
						}
					}
				}
			}
		} catch (@Pc(229) RuntimeException local229) {
			signlink.reporterror("50238, " + arg0 + ", " + 40284 + ", " + local229.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(II)V")
	private void method641(@OriginalArg(0) int arg0) {
		try {
			@Pc(4) int local4 = Class48.aClass48Array1[arg0].anInt746;
			if (local4 != 0) {
				@Pc(12) int local12 = this.anIntArray216[arg0];
				if (local4 == 1) {
					if (local12 == 1) {
						Class5_Sub1_Sub1_Sub4.method565(0.9D);
					}
					if (local12 == 2) {
						Class5_Sub1_Sub1_Sub4.method565(0.8D);
					}
					if (local12 == 3) {
						Class5_Sub1_Sub1_Sub4.method565(0.7D);
					}
					if (local12 == 4) {
						Class5_Sub1_Sub1_Sub4.method565(0.6D);
					}
					Class18.aClass45_2.method479();
					this.aBoolean256 = true;
				}
				if (local4 == 3) {
					@Pc(56) boolean local56 = this.aBoolean242;
					if (local12 == 0) {
						this.method615(0, this.aBoolean242);
						this.aBoolean242 = true;
					}
					if (local12 == 1) {
						this.method615(-400, this.aBoolean242);
						this.aBoolean242 = true;
					}
					if (local12 == 2) {
						this.method615(-800, this.aBoolean242);
						this.aBoolean242 = true;
					}
					if (local12 == 3) {
						this.method615(-1200, this.aBoolean242);
						this.aBoolean242 = true;
					}
					if (local12 == 4) {
						this.aBoolean242 = false;
					}
					if (this.aBoolean242 != local56 && !aBoolean261) {
						if (this.aBoolean242) {
							this.anInt907 = this.anInt936;
							this.aBoolean234 = true;
							this.aClass9_Sub1_1.method150(2, this.anInt907);
						} else {
							this.method601();
						}
						this.anInt1040 = 0;
					}
				}
				if (local4 == 4) {
					if (local12 == 0) {
						this.aBoolean251 = true;
						this.method599(0);
					}
					if (local12 == 1) {
						this.aBoolean251 = true;
						this.method599(-400);
					}
					if (local12 == 2) {
						this.aBoolean251 = true;
						this.method599(-800);
					}
					if (local12 == 3) {
						this.aBoolean251 = true;
						this.method599(-1200);
					}
					if (local12 == 4) {
						this.aBoolean251 = false;
					}
				}
				if (local4 == 5) {
					this.anInt1046 = local12;
				}
				if (local4 == 6) {
					this.anInt881 = local12;
				}
				if (local4 == 8) {
					this.anInt909 = local12;
					this.aBoolean237 = true;
				}
				if (local4 == 9) {
					this.anInt1030 = local12;
				}
			}
		} catch (@Pc(216) RuntimeException local216) {
			signlink.reporterror("40181, " + arg0 + ", " + 49157 + ", " + local216.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "r", descriptor = "(I)Z")
	private boolean method642() {
		try {
			if (this.anInt932 > 2 || this.anInt932 < 2) {
				this.aClass5_Sub1_Sub4_9.method230(74);
			}
			if (this.aClass17_1 == null) {
				return false;
			}
			@Pc(1356) String local1356;
			@Pc(512) int local512;
			try {
				@Pc(22) int local22 = this.aClass17_1.method108();
				if (local22 == 0) {
					return false;
				}
				if (this.anInt939 == -1) {
					this.aClass17_1.method109(this.aClass5_Sub1_Sub4_6.aByteArray16, 0, 1);
					this.anInt939 = this.aClass5_Sub1_Sub4_6.aByteArray16[0] & 0xFF;
					if (this.aClass23_2 != null) {
						this.anInt939 = this.anInt939 - this.aClass23_2.method161() & 0xFF;
					}
					this.anInt938 = Class29.anIntArray88[this.anInt939];
					local22--;
				}
				if (this.anInt938 == -1) {
					if (local22 <= 0) {
						return false;
					}
					this.aClass17_1.method109(this.aClass5_Sub1_Sub4_6.aByteArray16, 0, 1);
					this.anInt938 = this.aClass5_Sub1_Sub4_6.aByteArray16[0] & 0xFF;
					local22--;
				}
				if (this.anInt938 == -2) {
					if (local22 <= 1) {
						return false;
					}
					this.aClass17_1.method109(this.aClass5_Sub1_Sub4_6.aByteArray16, 0, 2);
					this.aClass5_Sub1_Sub4_6.anInt429 = 0;
					this.anInt938 = this.aClass5_Sub1_Sub4_6.method242();
					local22 -= 2;
				}
				if (local22 < this.anInt938) {
					return false;
				}
				this.aClass5_Sub1_Sub4_6.anInt429 = 0;
				this.aClass17_1.method109(this.aClass5_Sub1_Sub4_6.aByteArray16, 0, this.anInt938);
				this.anInt940 = 0;
				this.anInt865 = this.anInt864;
				this.anInt864 = this.anInt863;
				this.anInt863 = this.anInt939;
				if (this.anInt939 == 116 || this.anInt939 == 154 || this.anInt939 == 88 || this.anInt939 == 33 || this.anInt939 == 243 || this.anInt939 == 224 || this.anInt939 == 7 || this.anInt939 == 145 || this.anInt939 == 205 || this.anInt939 == 140 || this.anInt939 == 20) {
					this.method665(this.aClass5_Sub1_Sub4_6, this.anInt939);
					this.anInt939 = -1;
					return true;
				}
				@Pc(235) int local235;
				@Pc(337) int local337;
				@Pc(370) int local370;
				@Pc(227) int local227;
				@Pc(223) long local223;
				if (this.anInt939 == 22) {
					local223 = this.aClass5_Sub1_Sub4_6.method246();
					local227 = this.aClass5_Sub1_Sub4_6.method240();
					@Pc(233) String local233 = Class28.method195(Class28.method192((byte) 7, local223));
					for (local235 = 0; local235 < this.anInt840; local235++) {
						if (local223 == this.aLongArray4[local235]) {
							if (this.anIntArray240[local235] != local227) {
								this.anIntArray240[local235] = local227;
								this.aBoolean238 = true;
								if (local227 > 0) {
									this.method720(5, "", local233 + " has logged in.");
								}
								if (local227 == 0) {
									this.method720(5, "", local233 + " has logged out.");
								}
							}
							local233 = null;
							break;
						}
					}
					if (local233 != null && this.anInt840 < 200) {
						this.aLongArray4[this.anInt840] = local223;
						this.aStringArray12[this.anInt840] = local233;
						this.anIntArray240[this.anInt840] = local227;
						this.anInt840++;
						this.aBoolean238 = true;
					}
					@Pc(331) boolean local331 = false;
					while (!local331) {
						local331 = true;
						for (local337 = 0; local337 < this.anInt840 - 1; local337++) {
							if (this.anIntArray240[local337] != anInt1057 && this.anIntArray240[local337 + 1] == anInt1057 || this.anIntArray240[local337] == 0 && this.anIntArray240[local337 + 1] != 0) {
								local370 = this.anIntArray240[local337];
								this.anIntArray240[local337] = this.anIntArray240[local337 + 1];
								this.anIntArray240[local337 + 1] = local370;
								@Pc(392) String local392 = this.aStringArray12[local337];
								this.aStringArray12[local337] = this.aStringArray12[local337 + 1];
								this.aStringArray12[local337 + 1] = local392;
								@Pc(414) long local414 = this.aLongArray4[local337];
								this.aLongArray4[local337] = this.aLongArray4[local337 + 1];
								this.aLongArray4[local337 + 1] = local414;
								this.aBoolean238 = true;
								local331 = false;
							}
						}
					}
					this.anInt939 = -1;
					return true;
				}
				if (this.anInt939 == 104) {
					this.anInt965 = this.aClass5_Sub1_Sub4_6.method269() * 30;
					this.anInt939 = -1;
					return true;
				}
				if (this.anInt939 == 99) {
					this.anInt1025 = this.aClass5_Sub1_Sub4_6.method240();
					this.anInt1043 = this.aClass5_Sub1_Sub4_6.method240();
					this.anInt963 = this.aClass5_Sub1_Sub4_6.method240();
					this.aBoolean258 = true;
					this.aBoolean237 = true;
					this.anInt939 = -1;
					return true;
				}
				@Pc(534) int local534;
				@Pc(508) int local508;
				if (this.anInt939 == 79) {
					this.aBoolean238 = true;
					local508 = this.aClass5_Sub1_Sub4_6.method245();
					local512 = this.aClass5_Sub1_Sub4_6.method240();
					local227 = this.aClass5_Sub1_Sub4_6.method261();
					this.anIntArray219[local512] = local508;
					this.anIntArray213[local512] = local227;
					this.anIntArray226[local512] = 1;
					for (local534 = 0; local534 < 98; local534++) {
						if (local508 >= anIntArray233[local534]) {
							this.anIntArray226[local512] = local534 + 2;
						}
					}
					this.anInt939 = -1;
					return true;
				}
				@Pc(571) Class36 local571;
				if (this.anInt939 == 21) {
					this.aBoolean238 = true;
					local508 = this.aClass5_Sub1_Sub4_6.method242();
					local571 = Class36.method388(local508);
					local227 = this.aClass5_Sub1_Sub4_6.method242();
					for (local534 = 0; local534 < local227; local534++) {
						local571.anIntArray163[local534] = this.aClass5_Sub1_Sub4_6.method267();
						local235 = this.aClass5_Sub1_Sub4_6.method259((byte) 7);
						if (local235 == 255) {
							local235 = this.aClass5_Sub1_Sub4_6.method274(anInt994);
						}
						local571.anIntArray166[local534] = local235;
					}
					for (local235 = local227; local235 < local571.anIntArray163.length; local235++) {
						local571.anIntArray163[local235] = 0;
						local571.anIntArray166[local235] = 0;
					}
					this.anInt939 = -1;
					return true;
				}
				if (this.anInt939 == 36) {
					if (this.anInt908 == 12) {
						this.aBoolean238 = true;
					}
					this.anInt1051 = this.aClass5_Sub1_Sub4_6.method243();
					this.anInt939 = -1;
					return true;
				}
				if (this.anInt939 == 151) {
					local508 = this.aClass5_Sub1_Sub4_6.method242();
					local512 = this.aClass5_Sub1_Sub4_6.method268((byte) 5);
					local227 = this.aClass5_Sub1_Sub4_6.method269();
					Class36.method388(local227).anInt607 = (local512 << 16) + local508;
					this.anInt939 = -1;
					return true;
				}
				if (this.anInt939 == 110) {
					this.anInt844 = this.anInt938 / 8;
					for (local508 = 0; local508 < this.anInt844; local508++) {
						this.aLongArray3[local508] = this.aClass5_Sub1_Sub4_6.method246();
					}
					this.anInt939 = -1;
					return true;
				}
				if (this.anInt939 == 250) {
					this.anInt856 = this.aClass5_Sub1_Sub4_6.method240();
					if (this.anInt856 == 1) {
						this.anInt886 = this.aClass5_Sub1_Sub4_6.method242();
					}
					if (this.anInt856 >= 2 && this.anInt856 <= 6) {
						if (this.anInt856 == 2) {
							this.anInt903 = 64;
							this.anInt904 = 64;
						}
						if (this.anInt856 == 3) {
							this.anInt903 = 0;
							this.anInt904 = 64;
						}
						if (this.anInt856 == 4) {
							this.anInt903 = 128;
							this.anInt904 = 64;
						}
						if (this.anInt856 == 5) {
							this.anInt903 = 64;
							this.anInt904 = 0;
						}
						if (this.anInt856 == 6) {
							this.anInt903 = 64;
							this.anInt904 = 128;
						}
						this.anInt856 = 2;
						this.anInt900 = this.aClass5_Sub1_Sub4_6.method242();
						this.anInt901 = this.aClass5_Sub1_Sub4_6.method242();
						this.anInt902 = this.aClass5_Sub1_Sub4_6.method240();
					}
					if (this.anInt856 == 10) {
						this.anInt961 = this.aClass5_Sub1_Sub4_6.method242();
					}
					this.anInt939 = -1;
					return true;
				}
				if (this.anInt939 == 248) {
					this.anInt975 = this.aClass5_Sub1_Sub4_6.method242();
					this.anInt930 = this.aClass5_Sub1_Sub4_6.method259((byte) 7);
					this.anInt939 = -1;
					return true;
				}
				if (this.anInt939 == 173) {
					this.aBoolean217 = false;
					this.anInt884 = 2;
					this.aString23 = "";
					this.aBoolean237 = true;
					this.anInt939 = -1;
					return true;
				}
				if (this.anInt939 == 72) {
					local508 = this.aClass5_Sub1_Sub4_6.method268((byte) 5);
					@Pc(881) byte local881 = this.aClass5_Sub1_Sub4_6.method262();
					this.anIntArray245[local508] = local881;
					if (this.anIntArray216[local508] != local881) {
						this.anIntArray216[local508] = local881;
						this.method641(local508);
						this.aBoolean238 = true;
						if (this.anInt1015 != -1) {
							this.aBoolean237 = true;
						}
					}
					this.anInt939 = -1;
					return true;
				}
				if (this.anInt939 == 50) {
					local508 = this.aClass5_Sub1_Sub4_6.method242();
					this.method698(this.anInt866, local508);
					if (this.anInt1014 != -1) {
						this.method723(this.anInt1014);
						this.anInt1014 = -1;
						this.aBoolean238 = true;
						this.aBoolean244 = true;
					}
					if (this.anInt889 != -1) {
						this.method723(this.anInt889);
						this.anInt889 = -1;
						this.aBoolean256 = true;
					}
					if (this.anInt1026 != -1) {
						this.method723(this.anInt1026);
						this.anInt1026 = -1;
					}
					if (this.anInt949 != -1) {
						this.method723(this.anInt949);
						this.anInt949 = -1;
					}
					if (this.anInt931 != local508) {
						this.method723(this.anInt931);
						this.anInt931 = local508;
					}
					this.aBoolean227 = false;
					this.aBoolean237 = true;
					this.anInt939 = -1;
					return true;
				}
				if (this.anInt939 == 42) {
					this.aBoolean217 = false;
					this.anInt884 = 1;
					this.aString23 = "";
					this.aBoolean237 = true;
					this.anInt939 = -1;
					return true;
				}
				if (this.anInt939 == 9) {
					local508 = this.aClass5_Sub1_Sub4_6.method268((byte) 5);
					if (local508 == 65535) {
						local508 = -1;
					}
					if (local508 != this.anInt936 && this.aBoolean242 && !aBoolean261 && this.anInt1040 == 0) {
						this.anInt907 = local508;
						this.aBoolean234 = true;
						this.aClass9_Sub1_1.method150(2, this.anInt907);
					}
					this.anInt936 = local508;
					this.anInt939 = -1;
					return true;
				}
				if (this.anInt939 == 190) {
					local508 = this.aClass5_Sub1_Sub4_6.method272();
					local512 = this.aClass5_Sub1_Sub4_6.method242();
					if (this.aBoolean242 && !aBoolean261) {
						this.anInt907 = local512;
						this.aBoolean234 = false;
						this.aClass9_Sub1_1.method150(2, this.anInt907);
						this.anInt1040 = local508;
					}
					this.anInt939 = -1;
					return true;
				}
				if (this.anInt939 == 240) {
					for (local508 = 0; local508 < this.aClass5_Sub1_Sub2_Sub4_Sub2Array1.length; local508++) {
						if (this.aClass5_Sub1_Sub2_Sub4_Sub2Array1[local508] != null) {
							this.aClass5_Sub1_Sub2_Sub4_Sub2Array1[local508].anInt501 = -1;
						}
					}
					for (local512 = 0; local512 < this.aClass5_Sub1_Sub2_Sub4_Sub1Array1.length; local512++) {
						if (this.aClass5_Sub1_Sub2_Sub4_Sub1Array1[local512] != null) {
							this.aClass5_Sub1_Sub2_Sub4_Sub1Array1[local512].anInt501 = -1;
						}
					}
					this.anInt939 = -1;
					return true;
				}
				if (this.anInt939 == 160) {
					local508 = this.aClass5_Sub1_Sub4_6.method267();
					local512 = this.aClass5_Sub1_Sub4_6.method242();
					local227 = local512 >> 10 & 0x1F;
					local534 = local512 >> 5 & 0x1F;
					local235 = local512 & 0x1F;
					Class36.method388(local508).anInt582 = (local227 << 19) + (local534 << 11) + (local235 << 3);
					this.anInt939 = -1;
					return true;
				}
				if (this.anInt939 == 24) {
					local508 = this.aClass5_Sub1_Sub4_6.method270();
					if (local508 >= 0) {
						this.method698(this.anInt866, local508);
					}
					if (local508 != this.anInt843) {
						this.method723(this.anInt843);
						this.anInt843 = local508;
					}
					this.anInt939 = -1;
					return true;
				}
				if (this.anInt939 == 115) {
					local508 = this.aClass5_Sub1_Sub4_6.method242();
					this.method698(this.anInt866, local508);
					if (this.anInt931 != -1) {
						this.method723(this.anInt931);
						this.anInt931 = -1;
						this.aBoolean237 = true;
					}
					if (this.anInt889 != -1) {
						this.method723(this.anInt889);
						this.anInt889 = -1;
						this.aBoolean256 = true;
					}
					if (this.anInt1026 != -1) {
						this.method723(this.anInt1026);
						this.anInt1026 = -1;
					}
					if (this.anInt949 != -1) {
						this.method723(this.anInt949);
						this.anInt949 = -1;
					}
					if (this.anInt1014 != local508) {
						this.method723(this.anInt1014);
						this.anInt1014 = local508;
					}
					if (this.anInt884 != 0) {
						this.anInt884 = 0;
						this.aBoolean237 = true;
					}
					this.aBoolean238 = true;
					this.aBoolean244 = true;
					this.aBoolean227 = false;
					this.anInt939 = -1;
					return true;
				}
				if (this.anInt939 == 27) {
					local1356 = this.aClass5_Sub1_Sub4_6.method247();
					local512 = this.aClass5_Sub1_Sub4_6.method269();
					Class36.method388(local512).aString14 = local1356;
					@Pc(1373) int local1373 = this.anIntArray244[this.anInt908];
					if (Class36.method388(local512).anInt575 == local1373) {
						this.aBoolean238 = true;
					}
					this.anInt939 = -1;
					return true;
				}
				if (this.anInt939 == 15) {
					local508 = this.aClass5_Sub1_Sub4_6.method242();
					local571 = Class36.method388(local508);
					for (local227 = 0; local227 < local571.anIntArray163.length; local227++) {
						local571.anIntArray163[local227] = -1;
						local571.anIntArray163[local227] = 0;
					}
					this.anInt939 = -1;
					return true;
				}
				if (this.anInt939 == 17) {
					local508 = this.aClass5_Sub1_Sub4_6.method259((byte) 7);
					local512 = this.aClass5_Sub1_Sub4_6.method240();
					@Pc(1435) String local1435 = this.aClass5_Sub1_Sub4_6.method247();
					if (local512 >= 1 && local512 <= 5) {
						if (local1435.equalsIgnoreCase("null")) {
							local1435 = null;
						}
						this.aStringArray13[local512 - 1] = local1435;
						this.aBooleanArray12[local512 - 1] = local508 == 0;
					}
					this.anInt939 = -1;
					return true;
				}
				if (this.anInt939 == 232) {
					if (this.anInt1014 != -1) {
						this.method723(this.anInt1014);
						this.anInt1014 = -1;
						this.aBoolean238 = true;
						this.aBoolean244 = true;
					}
					if (this.anInt931 != -1) {
						this.method723(this.anInt931);
						this.anInt931 = -1;
						this.aBoolean237 = true;
					}
					if (this.anInt889 != -1) {
						this.method723(this.anInt889);
						this.anInt889 = -1;
						this.aBoolean256 = true;
					}
					if (this.anInt1026 != -1) {
						this.method723(this.anInt1026);
						this.anInt1026 = -1;
					}
					if (this.anInt949 != -1) {
						this.method723(this.anInt949);
						this.anInt949 = -1;
					}
					if (this.anInt884 != 0) {
						this.anInt884 = 0;
						this.aBoolean237 = true;
					}
					this.aBoolean227 = false;
					this.anInt939 = -1;
					return true;
				}
				if (this.anInt939 == 87) {
					this.aBoolean214 = true;
					this.anInt833 = this.aClass5_Sub1_Sub4_6.method240();
					this.anInt834 = this.aClass5_Sub1_Sub4_6.method240();
					this.anInt835 = this.aClass5_Sub1_Sub4_6.method242();
					this.anInt836 = this.aClass5_Sub1_Sub4_6.method240();
					this.anInt837 = this.aClass5_Sub1_Sub4_6.method240();
					if (this.anInt837 >= 100) {
						this.anInt925 = this.anInt833 * 128 + 64;
						this.anInt927 = this.anInt834 * 128 + 64;
						this.anInt926 = this.method594(this.anInt1052, this.anInt925, this.anInt867, this.anInt927) - this.anInt835;
					}
					this.anInt939 = -1;
					return true;
				}
				if (this.anInt939 == 125) {
					this.method659();
					this.anInt939 = -1;
					return false;
				}
				if (this.anInt939 == 233) {
					local508 = this.aClass5_Sub1_Sub4_6.method242();
					local512 = this.aClass5_Sub1_Sub4_6.method242();
					Class36.method388(local512).anInt593 = 2;
					Class36.method388(local512).anInt594 = local508;
					this.anInt939 = -1;
					return true;
				}
				if (this.anInt939 == 19) {
					this.anInt846 = this.aClass5_Sub1_Sub4_6.method240();
					this.anInt847 = this.aClass5_Sub1_Sub4_6.method260();
					while (this.aClass5_Sub1_Sub4_6.anInt429 < this.anInt938) {
						local508 = this.aClass5_Sub1_Sub4_6.method240();
						this.method665(this.aClass5_Sub1_Sub4_6, local508);
					}
					this.anInt939 = -1;
					return true;
				}
				if (this.anInt939 == 225) {
					this.anInt846 = this.aClass5_Sub1_Sub4_6.method261();
					this.anInt847 = this.aClass5_Sub1_Sub4_6.method259((byte) 7);
					this.anInt939 = -1;
					return true;
				}
				if (this.anInt939 == 251) {
					this.anInt908 = this.aClass5_Sub1_Sub4_6.method259((byte) 7);
					this.aBoolean238 = true;
					this.aBoolean244 = true;
					this.anInt939 = -1;
					return true;
				}
				if (this.anInt939 == 0) {
					this.anInt1032 = this.aClass5_Sub1_Sub4_6.method267();
					this.anInt1017 = this.aClass5_Sub1_Sub4_6.method242();
					this.anInt964 = this.aClass5_Sub1_Sub4_6.method268((byte) 5);
					this.anInt923 = this.aClass5_Sub1_Sub4_6.method269();
					this.anInt850 = this.aClass5_Sub1_Sub4_6.method267();
					this.anInt1035 = this.aClass5_Sub1_Sub4_6.method268((byte) 5);
					this.anInt1013 = this.aClass5_Sub1_Sub4_6.method242();
					this.anInt905 = this.aClass5_Sub1_Sub4_6.method269();
					this.anInt920 = this.aClass5_Sub1_Sub4_6.method242();
					this.anInt948 = this.aClass5_Sub1_Sub4_6.method275();
					this.anInt991 = this.aClass5_Sub1_Sub4_6.method261();
					signlink.dnslookup(Class28.method194(this.anInt948));
					this.anInt939 = -1;
					return true;
				}
				@Pc(1849) int local1849;
				@Pc(1847) boolean local1847;
				@Pc(1916) String local1916;
				if (this.anInt939 == 71) {
					local223 = this.aClass5_Sub1_Sub4_6.method246();
					local227 = this.aClass5_Sub1_Sub4_6.method245();
					local534 = this.aClass5_Sub1_Sub4_6.method240();
					local1847 = false;
					for (local1849 = 0; local1849 < 100; local1849++) {
						if (this.anIntArray220[local1849] == local227) {
							local1847 = true;
							break;
						}
					}
					if (local534 <= 1) {
						for (local337 = 0; local337 < this.anInt844; local337++) {
							if (this.aLongArray3[local337] == local223) {
								local1847 = true;
								break;
							}
						}
					}
					if (!local1847 && this.anInt1016 == 0) {
						try {
							this.anIntArray220[this.anInt1053] = local227;
							this.anInt1053 = (this.anInt1053 + 1) % 100;
							local1916 = Class31.method204(this.anInt938 - 13, this.aClass5_Sub1_Sub4_6);
							if (local534 != 3) {
								local1916 = Class32.method288(local1916);
							}
							if (local534 == 2 || local534 == 3) {
								this.method720(7, "@cr2@" + Class28.method195(Class28.method192((byte) 7, local223)), local1916);
							} else if (local534 == 1) {
								this.method720(7, "@cr1@" + Class28.method195(Class28.method192((byte) 7, local223)), local1916);
							} else {
								this.method720(3, Class28.method195(Class28.method192((byte) 7, local223)), local1916);
							}
						} catch (@Pc(1980) Exception local1980) {
							signlink.reporterror("cde1");
						}
					}
					this.anInt939 = -1;
					return true;
				}
				if (this.anInt939 == 97) {
					local1356 = this.aClass5_Sub1_Sub4_6.method247();
					@Pc(2010) long local2010;
					@Pc(2007) String local2007;
					if (local1356.endsWith(":tradereq:")) {
						local2007 = local1356.substring(0, local1356.indexOf(":"));
						local2010 = Class28.method191(local2007);
						local1847 = false;
						for (local1849 = 0; local1849 < this.anInt844; local1849++) {
							if (this.aLongArray3[local1849] == local2010) {
								local1847 = true;
								break;
							}
						}
						if (!local1847 && this.anInt1016 == 0) {
							this.method720(4, local2007, "wishes to trade with you.");
						}
					} else if (local1356.endsWith(":duelreq:")) {
						local2007 = local1356.substring(0, local1356.indexOf(":"));
						local2010 = Class28.method191(local2007);
						local1847 = false;
						for (local1849 = 0; local1849 < this.anInt844; local1849++) {
							if (this.aLongArray3[local1849] == local2010) {
								local1847 = true;
								break;
							}
						}
						if (!local1847 && this.anInt1016 == 0) {
							this.method720(8, local2007, "wishes to duel with you.");
						}
					} else if (local1356.endsWith(":chalreq:")) {
						local2007 = local1356.substring(0, local1356.indexOf(":"));
						local2010 = Class28.method191(local2007);
						local1847 = false;
						for (local1849 = 0; local1849 < this.anInt844; local1849++) {
							if (this.aLongArray3[local1849] == local2010) {
								local1847 = true;
								break;
							}
						}
						if (!local1847 && this.anInt1016 == 0) {
							local1916 = local1356.substring(local1356.indexOf(":") + 1, local1356.length() - 9);
							this.method720(8, local2007, local1916);
						}
					} else {
						this.method720(0, "", local1356);
					}
					this.anInt939 = -1;
					return true;
				}
				if (this.anInt939 == 186) {
					this.aBoolean214 = true;
					this.anInt1020 = this.aClass5_Sub1_Sub4_6.method240();
					this.anInt1021 = this.aClass5_Sub1_Sub4_6.method240();
					this.anInt1022 = this.aClass5_Sub1_Sub4_6.method242();
					this.anInt1023 = this.aClass5_Sub1_Sub4_6.method240();
					this.anInt1024 = this.aClass5_Sub1_Sub4_6.method240();
					if (this.anInt1024 >= 100) {
						local508 = this.anInt1020 * 128 + 64;
						local512 = this.anInt1021 * 128 + 64;
						local227 = this.method594(this.anInt1052, local508, this.anInt867, local512) - this.anInt1022;
						local534 = local508 - this.anInt925;
						local235 = local227 - this.anInt926;
						local1849 = local512 - this.anInt927;
						local337 = (int) Math.sqrt((double) (local534 * local534 + local1849 * local1849));
						this.anInt928 = (int) (Math.atan2((double) local235, (double) local337) * 325.949D) & 0x7FF;
						this.anInt929 = (int) (Math.atan2((double) local534, (double) local1849) * -325.949D) & 0x7FF;
						if (this.anInt928 < 128) {
							this.anInt928 = 128;
						}
						if (this.anInt928 > 383) {
							this.anInt928 = 383;
						}
					}
					this.anInt939 = -1;
					return true;
				}
				if (this.anInt939 == 8) {
					local508 = this.aClass5_Sub1_Sub4_6.method268((byte) 5);
					local512 = this.aClass5_Sub1_Sub4_6.method243();
					local227 = this.aClass5_Sub1_Sub4_6.method271();
					@Pc(2318) Class36 local2318 = Class36.method388(local508);
					local2318.anInt584 = local512;
					local2318.anInt596 = local227;
					this.anInt939 = -1;
					return true;
				}
				if (this.anInt939 == 223) {
					for (local508 = 0; local508 < this.anIntArray216.length; local508++) {
						if (this.anIntArray216[local508] != this.anIntArray245[local508]) {
							this.anIntArray216[local508] = this.anIntArray245[local508];
							this.method641(local508);
							this.aBoolean238 = true;
						}
					}
					this.anInt939 = -1;
					return true;
				}
				if (this.anInt939 == 180) {
					this.method674(this.aClass5_Sub1_Sub4_6, this.anInt938);
					this.aBoolean229 = false;
					this.anInt939 = -1;
					return true;
				}
				if (this.anInt939 == 105) {
					this.aBoolean238 = true;
					local508 = this.aClass5_Sub1_Sub4_6.method242();
					local571 = Class36.method388(local508);
					while (this.aClass5_Sub1_Sub4_6.anInt429 < this.anInt938) {
						local227 = this.aClass5_Sub1_Sub4_6.method254();
						local534 = this.aClass5_Sub1_Sub4_6.method242();
						local235 = this.aClass5_Sub1_Sub4_6.method240();
						if (local235 == 255) {
							local235 = this.aClass5_Sub1_Sub4_6.method245();
						}
						if (local227 >= 0 && local227 < local571.anIntArray163.length) {
							local571.anIntArray163[local227] = local534;
							local571.anIntArray166[local227] = local235;
						}
					}
					this.anInt939 = -1;
					return true;
				}
				if (this.anInt939 == 182) {
					local508 = this.aClass5_Sub1_Sub4_6.method267();
					local512 = this.aClass5_Sub1_Sub4_6.method276(this.anInt922);
					this.anIntArray245[local508] = local512;
					if (this.anIntArray216[local508] != local512) {
						this.anIntArray216[local508] = local512;
						this.method641(local508);
						this.aBoolean238 = true;
						if (this.anInt1015 != -1) {
							this.aBoolean237 = true;
						}
					}
					this.anInt939 = -1;
					return true;
				}
				if (this.anInt939 == 162) {
					local508 = this.aClass5_Sub1_Sub4_6.method242();
					local512 = this.aClass5_Sub1_Sub4_6.method240();
					local227 = this.aClass5_Sub1_Sub4_6.method242();
					if (this.aBoolean251 && !aBoolean261 && this.anInt848 < 50) {
						this.anIntArray221[this.anInt848] = local508;
						this.anIntArray261[this.anInt848] = local512;
						this.anIntArray266[this.anInt848] = local227 + Class30.anIntArray89[local508];
						this.anInt848++;
					}
					this.anInt939 = -1;
					return true;
				}
				if (this.anInt939 == 2) {
					this.anInt1019 = this.aClass5_Sub1_Sub4_6.method240();
					this.anInt939 = -1;
					return true;
				}
				if (this.anInt939 == 189) {
					this.anInt1028 = 0;
					this.anInt939 = -1;
					return true;
				}
				if (this.anInt939 == 139) {
					local508 = this.aClass5_Sub1_Sub4_6.method268((byte) 5);
					local512 = this.aClass5_Sub1_Sub4_6.method268((byte) 5);
					local227 = this.aClass5_Sub1_Sub4_6.method269();
					if (local508 == 65535) {
						Class36.method388(local227).anInt593 = 0;
						this.anInt939 = -1;
						return true;
					}
					@Pc(2622) Class18 local2622 = Class18.method117(local508);
					Class36.method388(local227).anInt593 = 4;
					Class36.method388(local227).anInt594 = local508;
					Class36.method388(local227).anInt587 = local2622.anInt200;
					Class36.method388(local227).anInt588 = local2622.anInt194;
					Class36.method388(local227).anInt586 = local2622.anInt189 * 100 / local512;
					this.anInt939 = -1;
					return true;
				}
				if (this.anInt939 == 188) {
					local508 = this.aClass5_Sub1_Sub4_6.method240();
					local512 = this.aClass5_Sub1_Sub4_6.method240();
					local227 = this.aClass5_Sub1_Sub4_6.method240();
					local534 = this.aClass5_Sub1_Sub4_6.method240();
					this.aBooleanArray11[local508] = true;
					this.anIntArray237[local508] = local512;
					this.anIntArray223[local508] = local227;
					this.anIntArray260[local508] = local534;
					this.anIntArray224[local508] = 0;
					this.anInt939 = -1;
					return true;
				}
				if (this.anInt939 == 18) {
					if (this.anInt908 == 12) {
						this.aBoolean238 = true;
					}
					this.anInt976 = this.aClass5_Sub1_Sub4_6.method240();
					this.anInt939 = -1;
					return true;
				}
				if (this.anInt939 == 93) {
					local508 = this.aClass5_Sub1_Sub4_6.method267();
					local512 = this.aClass5_Sub1_Sub4_6.method269();
					local227 = this.aClass5_Sub1_Sub4_6.method268((byte) 5);
					local534 = this.aClass5_Sub1_Sub4_6.method268((byte) 5);
					Class36.method388(local534).anInt587 = local508;
					Class36.method388(local534).anInt588 = local227;
					Class36.method388(local534).anInt586 = local512;
					this.anInt939 = -1;
					return true;
				}
				if (this.anInt939 == 6 || this.anInt939 == 150) {
					local508 = this.anInt851;
					local512 = this.anInt852;
					if (this.anInt939 == 6) {
						local512 = this.aClass5_Sub1_Sub4_6.method268((byte) 5);
						local508 = this.aClass5_Sub1_Sub4_6.method242();
						this.aBoolean224 = false;
					}
					if (this.anInt939 == 150) {
						local508 = this.aClass5_Sub1_Sub4_6.method242();
						local512 = this.aClass5_Sub1_Sub4_6.method242();
						this.aClass5_Sub1_Sub4_6.method250();
						local227 = 0;
						while (true) {
							if (local227 >= 4) {
								this.aClass5_Sub1_Sub4_6.method252();
								this.aBoolean224 = true;
								break;
							}
							for (local534 = 0; local534 < 13; local534++) {
								for (local235 = 0; local235 < 13; local235++) {
									local1849 = this.aClass5_Sub1_Sub4_6.method251(1);
									if (local1849 == 1) {
										this.anIntArrayArrayArray7[local227][local534][local235] = this.aClass5_Sub1_Sub4_6.method251(26);
									} else {
										this.anIntArrayArrayArray7[local227][local534][local235] = -1;
									}
								}
							}
							local227++;
						}
					}
					if (this.anInt851 == local508 && this.anInt852 == local512 && this.anInt838 == 2) {
						this.anInt939 = -1;
						return true;
					}
					this.anInt851 = local508;
					this.anInt852 = local512;
					this.anInt873 = (this.anInt851 - 6) * 8;
					this.anInt874 = (this.anInt852 - 6) * 8;
					this.aBoolean235 = false;
					if ((this.anInt851 / 8 == 48 || this.anInt851 / 8 == 49) && this.anInt852 / 8 == 48) {
						this.aBoolean235 = true;
					}
					if (this.anInt851 / 8 == 48 && this.anInt852 / 8 == 148) {
						this.aBoolean235 = true;
					}
					this.anInt838 = 1;
					this.aLong29 = System.currentTimeMillis();
					this.method660("Loading - please wait.", null);
					if (this.anInt939 == 6) {
						local227 = 0;
						local534 = (this.anInt851 - 6) / 8;
						label1203: while (true) {
							if (local534 > (this.anInt851 + 6) / 8) {
								this.aByteArrayArray5 = new byte[local227][];
								this.aByteArrayArray6 = new byte[local227][];
								this.anIntArray271 = new int[local227];
								this.anIntArray272 = new int[local227];
								this.anIntArray273 = new int[local227];
								local227 = 0;
								local235 = (this.anInt851 - 6) / 8;
								while (true) {
									if (local235 > (this.anInt851 + 6) / 8) {
										break label1203;
									}
									for (local1849 = (this.anInt852 - 6) / 8; local1849 <= (this.anInt852 + 6) / 8; local1849++) {
										this.anIntArray271[local227] = (local235 << 8) + local1849;
										if (this.aBoolean235 && (local1849 == 49 || local1849 == 149 || local1849 == 147 || local235 == 50 || local235 == 49 && local1849 == 47)) {
											this.anIntArray272[local227] = -1;
											this.anIntArray273[local227] = -1;
											local227++;
										} else {
											local337 = this.anIntArray272[local227] = this.aClass9_Sub1_1.method142(867, local235, 0, local1849);
											if (local337 != -1) {
												this.aClass9_Sub1_1.method150(3, local337);
											}
											local370 = this.anIntArray273[local227] = this.aClass9_Sub1_1.method142(867, local235, 1, local1849);
											if (local370 != -1) {
												this.aClass9_Sub1_1.method150(3, local370);
											}
											local227++;
										}
									}
									local235++;
								}
							}
							for (local235 = (this.anInt852 - 6) / 8; local235 <= (this.anInt852 + 6) / 8; local235++) {
								local227++;
							}
							local534++;
						}
					}
					if (this.anInt939 == 150) {
						local227 = 0;
						@Pc(3161) int[] local3161 = new int[676];
						local235 = 0;
						label1162: while (true) {
							@Pc(3191) int local3191;
							@Pc(3197) int local3197;
							@Pc(3207) int local3207;
							if (local235 >= 4) {
								this.aByteArrayArray5 = new byte[local227][];
								this.aByteArrayArray6 = new byte[local227][];
								this.anIntArray271 = new int[local227];
								this.anIntArray272 = new int[local227];
								this.anIntArray273 = new int[local227];
								local1849 = 0;
								while (true) {
									if (local1849 >= local227) {
										break label1162;
									}
									local337 = this.anIntArray271[local1849] = local3161[local1849];
									local370 = local337 >> 8 & 0xFF;
									local3191 = local337 & 0xFF;
									local3197 = this.anIntArray272[local1849] = this.aClass9_Sub1_1.method142(867, local370, 0, local3191);
									if (local3197 != -1) {
										this.aClass9_Sub1_1.method150(3, local3197);
									}
									local3207 = this.anIntArray273[local1849] = this.aClass9_Sub1_1.method142(867, local370, 1, local3191);
									if (local3207 != -1) {
										this.aClass9_Sub1_1.method150(3, local3207);
									}
									local1849++;
								}
							}
							for (local1849 = 0; local1849 < 13; local1849++) {
								for (local337 = 0; local337 < 13; local337++) {
									local370 = this.anIntArrayArrayArray7[local235][local1849][local337];
									if (local370 != -1) {
										local3191 = local370 >> 14 & 0x3FF;
										local3197 = local370 >> 3 & 0x7FF;
										local3207 = (local3191 / 8 << 8) + local3197 / 8;
										for (@Pc(3209) int local3209 = 0; local3209 < local227; local3209++) {
											if (local3161[local3209] == local3207) {
												local3207 = -1;
												break;
											}
										}
										if (local3207 != -1) {
											local3161[local227++] = local3207;
										}
									}
								}
							}
							local235++;
						}
					}
					local227 = this.anInt873 - this.anInt875;
					local534 = this.anInt874 - this.anInt876;
					this.anInt875 = this.anInt873;
					this.anInt876 = this.anInt874;
					for (local235 = 0; local235 < 16384; local235++) {
						@Pc(3362) Class5_Sub1_Sub2_Sub4_Sub1 local3362 = this.aClass5_Sub1_Sub2_Sub4_Sub1Array1[local235];
						if (local3362 != null) {
							for (local337 = 0; local337 < 10; local337++) {
								local3362.anIntArray151[local337] -= local227;
								local3362.anIntArray152[local337] -= local534;
							}
							local3362.anInt524 -= local227 * 128;
							local3362.anInt525 -= local534 * 128;
						}
					}
					for (local1849 = 0; local1849 < this.anInt982; local1849++) {
						@Pc(3417) Class5_Sub1_Sub2_Sub4_Sub2 local3417 = this.aClass5_Sub1_Sub2_Sub4_Sub2Array1[local1849];
						if (local3417 != null) {
							for (local370 = 0; local370 < 10; local370++) {
								local3417.anIntArray151[local370] -= local227;
								local3417.anIntArray152[local370] -= local534;
							}
							local3417.anInt524 -= local227 * 128;
							local3417.anInt525 -= local534 * 128;
						}
					}
					this.aBoolean229 = true;
					@Pc(3469) byte local3469 = 0;
					@Pc(3471) byte local3471 = 104;
					@Pc(3473) byte local3473 = 1;
					if (local227 < 0) {
						local3469 = 103;
						local3471 = -1;
						local3473 = -1;
					}
					@Pc(3483) byte local3483 = 0;
					@Pc(3485) byte local3485 = 104;
					@Pc(3487) byte local3487 = 1;
					if (local534 < 0) {
						local3483 = 103;
						local3485 = -1;
						local3487 = -1;
					}
					for (@Pc(3497) int local3497 = local3469; local3497 != local3471; local3497 += local3473) {
						for (@Pc(3501) int local3501 = local3483; local3501 != local3485; local3501 += local3487) {
							@Pc(3507) int local3507 = local3497 + local227;
							@Pc(3511) int local3511 = local3501 + local534;
							for (@Pc(3513) int local3513 = 0; local3513 < 4; local3513++) {
								if (local3507 >= 0 && local3511 >= 0 && local3507 < 104 && local3511 < 104) {
									this.aClass41ArrayArrayArray1[local3513][local3497][local3501] = this.aClass41ArrayArrayArray1[local3513][local3507][local3511];
								} else {
									this.aClass41ArrayArrayArray1[local3513][local3497][local3501] = null;
								}
							}
						}
					}
					for (@Pc(3575) Class5_Sub3 local3575 = (Class5_Sub3) this.aClass41_10.method468(); local3575 != null; local3575 = (Class5_Sub3) this.aClass41_10.method470()) {
						local3575.anInt306 -= local227;
						local3575.anInt307 -= local534;
						if (local3575.anInt306 < 0 || local3575.anInt307 < 0 || local3575.anInt306 >= 104 || local3575.anInt307 >= 104) {
							local3575.method542();
						}
					}
					if (this.anInt1028 != 0) {
						this.anInt1028 -= local227;
						this.anInt1029 -= local534;
					}
					this.aBoolean214 = false;
					this.anInt939 = -1;
					return true;
				}
				if (this.anInt939 == 134) {
					this.anInt842 = this.aClass5_Sub1_Sub4_6.method240();
					if (this.anInt842 == this.anInt908) {
						if (this.anInt842 == 3) {
							this.anInt908 = 1;
						} else {
							this.anInt908 = 3;
						}
						this.aBoolean238 = true;
					}
					this.anInt939 = -1;
					return true;
				}
				if (this.anInt939 == 197) {
					local508 = this.aClass5_Sub1_Sub4_6.method242();
					this.method698(this.anInt866, local508);
					if (this.anInt1014 != -1) {
						this.method723(this.anInt1014);
						this.anInt1014 = -1;
						this.aBoolean238 = true;
						this.aBoolean244 = true;
					}
					if (this.anInt931 != -1) {
						this.method723(this.anInt931);
						this.anInt931 = -1;
						this.aBoolean237 = true;
					}
					if (this.anInt889 != -1) {
						this.method723(this.anInt889);
						this.anInt889 = -1;
						this.aBoolean256 = true;
					}
					if (this.anInt1026 != -1) {
						this.method723(this.anInt1026);
						this.anInt1026 = -1;
					}
					if (this.anInt949 != local508) {
						this.method723(this.anInt949);
						this.anInt949 = local508;
					}
					if (this.anInt884 != 0) {
						this.anInt884 = 0;
						this.aBoolean237 = true;
					}
					this.aBoolean227 = false;
					this.anInt939 = -1;
					return true;
				}
				if (this.anInt939 == 127) {
					this.aBoolean214 = false;
					for (local508 = 0; local508 < 5; local508++) {
						this.aBooleanArray11[local508] = false;
					}
					this.anInt939 = -1;
					return true;
				}
				if (this.anInt939 == 177) {
					this.anInt841 = this.aClass5_Sub1_Sub4_6.method240();
					this.aBoolean238 = true;
					this.anInt939 = -1;
					return true;
				}
				if (this.anInt939 == 1) {
					this.anInt951 = this.aClass5_Sub1_Sub4_6.method240();
					this.anInt939 = -1;
					return true;
				}
				if (this.anInt939 == 166) {
					local508 = this.aClass5_Sub1_Sub4_6.method242();
					Class36.method388(local508).anInt593 = 3;
					if (aClass5_Sub1_Sub2_Sub4_Sub2_1.aClass49_2 == null) {
						Class36.method388(local508).anInt594 = (aClass5_Sub1_Sub2_Sub4_Sub2_1.anIntArray156[0] << 25) + (aClass5_Sub1_Sub2_Sub4_Sub2_1.anIntArray156[4] << 20) + (aClass5_Sub1_Sub2_Sub4_Sub2_1.anIntArray157[0] << 15) + (aClass5_Sub1_Sub2_Sub4_Sub2_1.anIntArray157[8] << 10) + (aClass5_Sub1_Sub2_Sub4_Sub2_1.anIntArray157[11] << 5) + aClass5_Sub1_Sub2_Sub4_Sub2_1.anIntArray157[1];
					} else {
						Class36.method388(local508).anInt594 = (int) (aClass5_Sub1_Sub2_Sub4_Sub2_1.aClass49_2.aLong25 + 305419896L);
					}
					this.anInt939 = -1;
					return true;
				}
				if (this.anInt939 == 74) {
					local508 = this.aClass5_Sub1_Sub4_6.method269();
					local512 = this.aClass5_Sub1_Sub4_6.method242();
					this.method698(this.anInt866, local512);
					if (local508 != -1) {
						this.method698(this.anInt866, local508);
					}
					if (this.anInt949 != -1) {
						this.method723(this.anInt949);
						this.anInt949 = -1;
					}
					if (this.anInt1014 != -1) {
						this.method723(this.anInt1014);
						this.anInt1014 = -1;
					}
					if (this.anInt931 != -1) {
						this.method723(this.anInt931);
						this.anInt931 = -1;
					}
					if (this.anInt889 != local512) {
						this.method723(this.anInt889);
						this.anInt889 = local512;
					}
					if (this.anInt1026 != local512) {
						this.method723(this.anInt1026);
						this.anInt1026 = local508;
					}
					this.anInt884 = 0;
					this.aBoolean227 = false;
					this.anInt939 = -1;
					return true;
				}
				if (this.anInt939 == 155) {
					local508 = this.aClass5_Sub1_Sub4_6.method268((byte) 5);
					local512 = this.aClass5_Sub1_Sub4_6.method269();
					Class36.method388(local512).anInt593 = 1;
					Class36.method388(local512).anInt594 = local508;
					this.anInt939 = -1;
					return true;
				}
				if (this.anInt939 == 201) {
					local508 = this.aClass5_Sub1_Sub4_6.method243();
					if (local508 != this.anInt1015) {
						this.method723(this.anInt1015);
						this.anInt1015 = local508;
					}
					this.aBoolean237 = true;
					this.anInt939 = -1;
					return true;
				}
				if (this.anInt939 == 12) {
					this.method618(this.aClass5_Sub1_Sub4_6, this.anInt938);
					this.anInt939 = -1;
					return true;
				}
				if (this.anInt939 == 81) {
					local508 = this.aClass5_Sub1_Sub4_6.method268((byte) 5);
					local512 = this.aClass5_Sub1_Sub4_6.method268((byte) 5);
					if (this.anInt931 != -1) {
						this.method723(this.anInt931);
						this.anInt931 = -1;
						this.aBoolean237 = true;
					}
					if (this.anInt889 != -1) {
						this.method723(this.anInt889);
						this.anInt889 = -1;
						this.aBoolean256 = true;
					}
					if (this.anInt1026 != -1) {
						this.method723(this.anInt1026);
						this.anInt1026 = -1;
					}
					if (this.anInt949 != local512) {
						this.method723(this.anInt949);
						this.anInt949 = local512;
					}
					if (this.anInt1014 != local508) {
						this.method723(this.anInt1014);
						this.anInt1014 = local508;
					}
					if (this.anInt884 != 0) {
						this.anInt884 = 0;
						this.aBoolean237 = true;
					}
					this.aBoolean238 = true;
					this.aBoolean244 = true;
					this.aBoolean227 = false;
					this.anInt939 = -1;
					return true;
				}
				if (this.anInt939 == 103) {
					local508 = this.aClass5_Sub1_Sub4_6.method267();
					local512 = this.aClass5_Sub1_Sub4_6.method259((byte) 7);
					if (local508 == 65535) {
						local508 = -1;
					}
					if (this.anIntArray244[local512] != local508) {
						this.method723(this.anIntArray244[local512]);
						this.anIntArray244[local512] = local508;
					}
					this.aBoolean238 = true;
					this.aBoolean244 = true;
					this.anInt939 = -1;
					return true;
				}
				@Pc(4236) Class36 local4236;
				if (this.anInt939 == 174) {
					local508 = this.aClass5_Sub1_Sub4_6.method242();
					local512 = this.aClass5_Sub1_Sub4_6.method267();
					local4236 = Class36.method388(local512);
					if (local4236 != null && local4236.anInt595 == 0) {
						if (local508 < 0) {
							local508 = 0;
						}
						if (local508 > local4236.anInt597 - local4236.anInt579) {
							local508 = local4236.anInt597 - local4236.anInt579;
						}
						local4236.anInt571 = local508;
					}
					this.anInt939 = -1;
					return true;
				}
				if (this.anInt939 == 247) {
					local508 = this.aClass5_Sub1_Sub4_6.method242();
					local512 = this.aClass5_Sub1_Sub4_6.method243();
					local4236 = Class36.method388(local508);
					if (local4236.anInt573 != local512 || local512 == -1) {
						local4236.anInt573 = local512;
						local4236.anInt601 = 0;
						local4236.anInt572 = 0;
					}
					this.anInt939 = -1;
					return true;
				}
				if (this.anInt939 == 109) {
					@Pc(4316) boolean local4316 = this.aClass5_Sub1_Sub4_6.method259((byte) 7) == 1;
					local512 = this.aClass5_Sub1_Sub4_6.method268((byte) 5);
					Class36.method388(local512).aBoolean150 = local4316;
					this.anInt939 = -1;
					return true;
				}
				if (this.anInt939 == 220) {
					this.anInt847 = this.aClass5_Sub1_Sub4_6.method261();
					this.anInt846 = this.aClass5_Sub1_Sub4_6.method261();
					for (local508 = this.anInt846; local508 < this.anInt846 + 8; local508++) {
						for (local512 = this.anInt847; local512 < this.anInt847 + 8; local512++) {
							if (this.aClass41ArrayArrayArray1[this.anInt1052][local508][local512] != null) {
								this.aClass41ArrayArrayArray1[this.anInt1052][local508][local512] = null;
								this.method700(local508, local512);
							}
						}
					}
					for (@Pc(4399) Class5_Sub3 local4399 = (Class5_Sub3) this.aClass41_10.method468(); local4399 != null; local4399 = (Class5_Sub3) this.aClass41_10.method470()) {
						if (local4399.anInt306 >= this.anInt846 && local4399.anInt306 < this.anInt846 + 8 && local4399.anInt307 >= this.anInt847 && local4399.anInt307 < this.anInt847 + 8 && local4399.anInt304 == this.anInt1052) {
							local4399.anInt308 = 0;
						}
					}
					this.anInt939 = -1;
					return true;
				}
				signlink.reporterror("T1 - " + this.anInt939 + "," + this.anInt938 + " - " + this.anInt864 + "," + this.anInt865);
				this.method659();
			} catch (@Pc(4475) IOException local4475) {
				this.method679();
			} catch (@Pc(4480) Exception local4480) {
				local1356 = "T2 - " + this.anInt939 + "," + this.anInt864 + "," + this.anInt865 + " - " + this.anInt938 + "," + (this.anInt873 + aClass5_Sub1_Sub2_Sub4_Sub2_1.anIntArray151[0]) + "," + (this.anInt874 + aClass5_Sub1_Sub2_Sub4_Sub2_1.anIntArray152[0]) + " - ";
				for (local512 = 0; local512 < this.anInt938 && local512 < 50; local512++) {
					local1356 = local1356 + this.aClass5_Sub1_Sub4_6.aByteArray16[local512] + ",";
				}
				signlink.reporterror(local1356);
				this.method659();
			}
			return true;
		} catch (@Pc(4561) RuntimeException local4561) {
			signlink.reporterror("61156, " + 2 + ", " + local4561.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "s", descriptor = "(I)V")
	private void method643() {
		try {
			this.anInt938 += 0;
			for (@Pc(7) int local7 = 0; local7 < this.anInt943; local7++) {
				@Pc(14) int local14 = this.anIntArray243[local7];
				@Pc(19) Class5_Sub1_Sub2_Sub4_Sub1 local19 = this.aClass5_Sub1_Sub2_Sub4_Sub1Array1[local14];
				if (local19 != null) {
					this.method644(313, local19.aClass49_1.aByte20, local19);
				}
			}
		} catch (@Pc(35) RuntimeException local35) {
			signlink.reporterror("7955, " + 0 + ", " + local35.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IILclient!SRUOAWPS;)V")
	private void method644(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class5_Sub1_Sub2_Sub4 arg2) {
		try {
			if (arg2.anInt524 < 128 || arg2.anInt525 < 128 || arg2.anInt524 >= 13184 || arg2.anInt525 >= 13184) {
				arg2.anInt501 = -1;
				arg2.anInt533 = -1;
				arg2.anInt515 = 0;
				arg2.anInt516 = 0;
				arg2.anInt524 = arg2.anIntArray151[0] * 128 + arg2.anInt499 * 64;
				arg2.anInt525 = arg2.anIntArray152[0] * 128 + arg2.anInt499 * 64;
				arg2.method376();
			}
			if (arg2 == aClass5_Sub1_Sub2_Sub4_Sub2_1 && (arg2.anInt524 < 1536 || arg2.anInt525 < 1536 || arg2.anInt524 >= 11776 || arg2.anInt525 >= 11776)) {
				arg2.anInt501 = -1;
				arg2.anInt533 = -1;
				arg2.anInt515 = 0;
				arg2.anInt516 = 0;
				arg2.anInt524 = arg2.anIntArray151[0] * 128 + arg2.anInt499 * 64;
				arg2.anInt525 = arg2.anIntArray152[0] * 128 + arg2.anInt499 * 64;
				arg2.method376();
			}
			if (arg2.anInt515 > anInt1018) {
				this.method645(arg2);
			} else if (arg2.anInt516 >= anInt1018) {
				this.method646(arg2);
			} else {
				this.method647(arg2);
			}
			this.method648(arg2);
			@Pc(150) boolean local150 = false;
			this.method649(arg2);
		} catch (@Pc(156) RuntimeException local156) {
			signlink.reporterror("22029, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local156.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILclient!SRUOAWPS;)V")
	private void method645(@OriginalArg(1) Class5_Sub1_Sub2_Sub4 arg0) {
		try {
			@Pc(4) int local4 = arg0.anInt515 - anInt1018;
			@Pc(14) int local14 = arg0.anInt511 * 128 + arg0.anInt499 * 64;
			@Pc(24) int local24 = arg0.anInt513 * 128 + arg0.anInt499 * 64;
			arg0.anInt524 += (local14 - arg0.anInt524) / local4;
			arg0.anInt525 += (local24 - arg0.anInt525) / local4;
			arg0.anInt496 = 0;
			if (arg0.anInt517 == 0) {
				arg0.anInt532 = 1024;
			}
			if (arg0.anInt517 == 1) {
				arg0.anInt532 = 1536;
			}
			if (arg0.anInt517 == 2) {
				arg0.anInt532 = 0;
			}
			if (arg0.anInt517 == 3) {
				arg0.anInt532 = 512;
			}
		} catch (@Pc(83) RuntimeException local83) {
			signlink.reporterror("49655, " + -395 + ", " + arg0 + ", " + local83.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!SRUOAWPS;Z)V")
	private void method646(@OriginalArg(0) Class5_Sub1_Sub2_Sub4 arg0) {
		try {
			if (arg0.anInt516 == anInt1018 || arg0.anInt501 == -1 || arg0.anInt504 != 0 || arg0.anInt503 + 1 > Class11.aClass11Array1[arg0.anInt501].method96(arg0.anInt502)) {
				@Pc(29) int local29 = arg0.anInt516 - arg0.anInt515;
				@Pc(34) int local34 = anInt1018 - arg0.anInt515;
				@Pc(44) int local44 = arg0.anInt511 * 128 + arg0.anInt499 * 64;
				@Pc(54) int local54 = arg0.anInt513 * 128 + arg0.anInt499 * 64;
				@Pc(64) int local64 = arg0.anInt512 * 128 + arg0.anInt499 * 64;
				@Pc(74) int local74 = arg0.anInt514 * 128 + arg0.anInt499 * 64;
				arg0.anInt524 = (local44 * (local29 - local34) + local64 * local34) / local29;
				arg0.anInt525 = (local54 * (local29 - local34) + local74 * local34) / local29;
			}
			arg0.anInt496 = 0;
			if (arg0.anInt517 == 0) {
				arg0.anInt532 = 1024;
			}
			if (arg0.anInt517 == 1) {
				arg0.anInt532 = 1536;
			}
			if (arg0.anInt517 == 2) {
				arg0.anInt532 = 0;
			}
			if (arg0.anInt517 == 3) {
				arg0.anInt532 = 512;
			}
			arg0.anInt526 = arg0.anInt532;
		} catch (@Pc(144) RuntimeException local144) {
			signlink.reporterror("50650, " + arg0 + ", " + false + ", " + local144.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(ILclient!SRUOAWPS;)V")
	private void method647(@OriginalArg(1) Class5_Sub1_Sub2_Sub4 arg0) {
		try {
			arg0.anInt527 = arg0.anInt494;
			if (arg0.anInt510 == 0) {
				arg0.anInt496 = 0;
			} else {
				if (arg0.anInt501 != -1 && arg0.anInt504 == 0) {
					@Pc(30) Class11 local30 = Class11.aClass11Array1[arg0.anInt501];
					if (arg0.anInt506 > 0 && local30.anInt109 == 0) {
						arg0.anInt496++;
						return;
					}
					if (arg0.anInt506 <= 0 && local30.anInt110 == 0) {
						arg0.anInt496++;
						return;
					}
				}
				@Pc(59) int local59 = arg0.anInt524;
				@Pc(62) int local62 = arg0.anInt525;
				@Pc(77) int local77 = arg0.anIntArray151[arg0.anInt510 - 1] * 128 + arg0.anInt499 * 64;
				@Pc(92) int local92 = arg0.anIntArray152[arg0.anInt510 - 1] * 128 + arg0.anInt499 * 64;
				if (local77 - local59 <= 256 && local77 - local59 >= -256 && local92 - local62 <= 256 && local92 - local62 >= -256) {
					if (local59 < local77) {
						if (local62 < local92) {
							arg0.anInt532 = 1280;
						} else if (local62 > local92) {
							arg0.anInt532 = 1792;
						} else {
							arg0.anInt532 = 1536;
						}
					} else if (local59 > local77) {
						if (local62 < local92) {
							arg0.anInt532 = 768;
						} else if (local62 > local92) {
							arg0.anInt532 = 256;
						} else {
							arg0.anInt532 = 512;
						}
					} else if (local62 < local92) {
						arg0.anInt532 = 1024;
					} else {
						arg0.anInt532 = 0;
					}
					@Pc(186) int local186 = arg0.anInt532 - arg0.anInt526 & 0x7FF;
					if (local186 > 1024) {
						local186 -= 2048;
					}
					@Pc(193) int local193 = arg0.anInt539;
					if (local186 >= -256 && local186 <= 256) {
						local193 = arg0.anInt538;
					} else if (local186 >= 256 && local186 < 768) {
						local193 = arg0.anInt541;
					} else if (local186 >= -768 && local186 <= -256) {
						local193 = arg0.anInt540;
					}
					if (local193 == -1) {
						local193 = arg0.anInt538;
					}
					arg0.anInt527 = local193;
					@Pc(235) int local235 = 4;
					if (arg0.anInt526 != arg0.anInt532 && arg0.anInt497 == -1 && arg0.anInt523 != 0) {
						local235 = 2;
					}
					if (arg0.anInt510 > 2) {
						local235 = 6;
					}
					if (arg0.anInt510 > 3) {
						local235 = 8;
					}
					if (arg0.anInt496 > 0 && arg0.anInt510 > 1) {
						local235 = 8;
						arg0.anInt496--;
					}
					if (arg0.aBooleanArray8[arg0.anInt510 - 1]) {
						local235 <<= 0x1;
					}
					if (local235 >= 8 && arg0.anInt527 == arg0.anInt538 && arg0.anInt500 != -1) {
						arg0.anInt527 = arg0.anInt500;
					}
					if (local59 < local77) {
						arg0.anInt524 += local235;
						if (arg0.anInt524 > local77) {
							arg0.anInt524 = local77;
						}
					} else if (local59 > local77) {
						arg0.anInt524 -= local235;
						if (arg0.anInt524 < local77) {
							arg0.anInt524 = local77;
						}
					}
					if (local62 < local92) {
						arg0.anInt525 += local235;
						if (arg0.anInt525 > local92) {
							arg0.anInt525 = local92;
						}
					} else if (local62 > local92) {
						arg0.anInt525 -= local235;
						if (arg0.anInt525 < local92) {
							arg0.anInt525 = local92;
						}
					}
					if (arg0.anInt524 == local77 && arg0.anInt525 == local92) {
						arg0.anInt510--;
						if (arg0.anInt506 > 0) {
							arg0.anInt506--;
							return;
						}
					}
				} else {
					arg0.anInt524 = local77;
					arg0.anInt525 = local92;
				}
			}
		} catch (@Pc(397) RuntimeException local397) {
			signlink.reporterror("86301, " + 2 + ", " + arg0 + ", " + local397.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ZLclient!SRUOAWPS;)V")
	private void method648(@OriginalArg(1) Class5_Sub1_Sub2_Sub4 arg0) {
		try {
			if (arg0.anInt523 != 0) {
				@Pc(34) int local34;
				@Pc(40) int local40;
				if (arg0.anInt497 != -1 && arg0.anInt497 < 32768) {
					@Pc(26) Class5_Sub1_Sub2_Sub4_Sub1 local26 = this.aClass5_Sub1_Sub2_Sub4_Sub1Array1[arg0.anInt497];
					if (local26 != null) {
						local34 = arg0.anInt524 - local26.anInt524;
						local40 = arg0.anInt525 - local26.anInt525;
						if (local34 != 0 || local40 != 0) {
							arg0.anInt532 = (int) (Math.atan2((double) local34, (double) local40) * 325.949D) & 0x7FF;
						}
					}
				}
				@Pc(65) int local65;
				if (arg0.anInt497 >= 32768) {
					local65 = arg0.anInt497 - 32768;
					if (local65 == this.anInt975) {
						local65 = this.anInt983;
					}
					@Pc(77) Class5_Sub1_Sub2_Sub4_Sub2 local77 = this.aClass5_Sub1_Sub2_Sub4_Sub2Array1[local65];
					if (local77 != null) {
						local40 = arg0.anInt524 - local77.anInt524;
						@Pc(91) int local91 = arg0.anInt525 - local77.anInt525;
						if (local40 != 0 || local91 != 0) {
							arg0.anInt532 = (int) (Math.atan2((double) local40, (double) local91) * 325.949D) & 0x7FF;
						}
					}
				}
				if ((arg0.anInt530 != 0 || arg0.anInt531 != 0) && (arg0.anInt510 == 0 || arg0.anInt496 > 0)) {
					local65 = arg0.anInt524 - (arg0.anInt530 - this.anInt873 - this.anInt873) * 64;
					local34 = arg0.anInt525 - (arg0.anInt531 - this.anInt874 - this.anInt874) * 64;
					if (local65 != 0 || local34 != 0) {
						arg0.anInt532 = (int) (Math.atan2((double) local65, (double) local34) * 325.949D) & 0x7FF;
					}
					arg0.anInt530 = 0;
					arg0.anInt531 = 0;
				}
				local65 = arg0.anInt532 - arg0.anInt526 & 0x7FF;
				if (local65 != 0) {
					if (local65 < arg0.anInt523 || local65 > 2048 - arg0.anInt523) {
						arg0.anInt526 = arg0.anInt532;
					} else if (local65 > 1024) {
						arg0.anInt526 -= arg0.anInt523;
					} else {
						arg0.anInt526 += arg0.anInt523;
					}
					arg0.anInt526 &= 0x7FF;
					if (arg0.anInt527 == arg0.anInt494 && arg0.anInt526 != arg0.anInt532) {
						if (arg0.anInt495 != -1) {
							arg0.anInt527 = arg0.anInt495;
							return;
						}
						arg0.anInt527 = arg0.anInt538;
						return;
					}
				}
			}
		} catch (@Pc(245) RuntimeException local245) {
			signlink.reporterror("90847, " + false + ", " + arg0 + ", " + local245.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!SRUOAWPS;I)V")
	private void method649(@OriginalArg(0) Class5_Sub1_Sub2_Sub4 arg0) {
		try {
			arg0.aBoolean139 = false;
			@Pc(16) Class11 local16;
			if (arg0.anInt527 != -1) {
				local16 = Class11.aClass11Array1[arg0.anInt527];
				arg0.anInt529++;
				if (arg0.anInt528 < local16.anInt103 && arg0.anInt529 > local16.method96(arg0.anInt528)) {
					arg0.anInt529 = 0;
					arg0.anInt528++;
				}
				if (arg0.anInt528 >= local16.anInt103) {
					arg0.anInt529 = 0;
					arg0.anInt528 = 0;
				}
			}
			if (arg0.anInt533 != -1 && anInt1018 >= arg0.anInt536) {
				if (arg0.anInt534 < 0) {
					arg0.anInt534 = 0;
				}
				local16 = Class20.aClass20Array1[arg0.anInt533].aClass11_1;
				arg0.anInt535++;
				while (arg0.anInt534 < local16.anInt103 && arg0.anInt535 > local16.method96(arg0.anInt534)) {
					arg0.anInt535 -= local16.method96(arg0.anInt534);
					arg0.anInt534++;
				}
				if (arg0.anInt534 >= local16.anInt103 && (arg0.anInt534 < 0 || arg0.anInt534 >= local16.anInt103)) {
					arg0.anInt533 = -1;
				}
			}
			if (arg0.anInt501 != -1 && arg0.anInt504 <= 1) {
				local16 = Class11.aClass11Array1[arg0.anInt501];
				if (local16.anInt109 == 1 && arg0.anInt506 > 0 && arg0.anInt515 <= anInt1018 && arg0.anInt516 < anInt1018) {
					arg0.anInt504 = 1;
					return;
				}
			}
			if (arg0.anInt501 != -1 && arg0.anInt504 == 0) {
				local16 = Class11.aClass11Array1[arg0.anInt501];
				arg0.anInt503++;
				while (arg0.anInt502 < local16.anInt103 && arg0.anInt503 > local16.method96(arg0.anInt502)) {
					arg0.anInt503 -= local16.method96(arg0.anInt502);
					arg0.anInt502++;
				}
				if (arg0.anInt502 >= local16.anInt103) {
					arg0.anInt502 -= local16.anInt104;
					arg0.anInt505++;
					if (arg0.anInt505 >= local16.anInt108) {
						arg0.anInt501 = -1;
					}
					if (arg0.anInt502 < 0 || arg0.anInt502 >= local16.anInt103) {
						arg0.anInt501 = -1;
					}
				}
				arg0.aBoolean139 = local16.aBoolean42;
			}
			if (arg0.anInt504 > 0) {
				arg0.anInt504--;
			}
		} catch (@Pc(261) RuntimeException local261) {
			signlink.reporterror("71416, " + arg0 + ", " + -354 + ", " + local261.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(B)V")
	private void method650() {
		try {
			if (this.anInt889 == -1 || this.anInt838 != 2 && super.aClass6_2 == null) {
				if (this.aBoolean256) {
					this.method623();
					this.aBoolean256 = false;
					this.aClass6_19.method56(4, super.aGraphics2, 0);
					this.aClass6_20.method56(357, super.aGraphics2, 0);
					this.aClass6_21.method56(4, super.aGraphics2, 722);
					this.aClass6_22.method56(205, super.aGraphics2, 743);
					this.aClass6_23.method56(0, super.aGraphics2, 0);
					this.aClass6_24.method56(4, super.aGraphics2, 516);
					this.aClass6_25.method56(205, super.aGraphics2, 516);
					this.aClass6_26.method56(357, super.aGraphics2, 496);
					this.aClass6_27.method56(338, super.aGraphics2, 0);
					this.aBoolean238 = true;
					this.aBoolean237 = true;
					this.aBoolean244 = true;
					this.aBoolean258 = true;
					if (this.anInt838 != 2) {
						this.aClass6_17.method56(4, super.aGraphics2, 4);
						this.aClass6_16.method56(4, super.aGraphics2, 550);
					}
				}
				if (this.anInt838 == 2) {
					this.method652();
				}
				if (this.aBoolean240 && this.anInt969 == 1) {
					this.aBoolean238 = true;
				}
				@Pc(277) boolean local277;
				if (this.anInt1014 != -1) {
					local277 = this.method667(this.anInt1014, this.anInt895);
					if (local277) {
						this.aBoolean238 = true;
					}
				}
				if (this.anInt1012 == 2) {
					this.aBoolean238 = true;
				}
				if (this.anInt988 == 2) {
					this.aBoolean238 = true;
				}
				if (this.aBoolean238) {
					this.method709();
					this.aBoolean238 = false;
				}
				if (this.anInt931 == -1) {
					this.aClass36_1.anInt571 = this.anInt914 - this.anInt1033 - 77;
					if (super.anInt818 > 448 && super.anInt818 < 560 && super.anInt819 > 332) {
						this.method653(77, this.anInt914, super.anInt818 - 17, this.aClass36_1, super.anInt819 - 357, -1, 463, 0);
					}
					@Pc(359) int local359 = this.anInt914 - this.aClass36_1.anInt571 - 77;
					if (local359 < 0) {
						local359 = 0;
					}
					if (local359 > this.anInt914 - 77) {
						local359 = this.anInt914 - 77;
					}
					if (this.anInt1033 != local359) {
						this.anInt1033 = local359;
						this.aBoolean237 = true;
					}
					anInt954++;
					if (anInt954 > 1972) {
						anInt954 = 0;
						this.aClass5_Sub1_Sub4_9.method229(127);
						this.aClass5_Sub1_Sub4_9.method230(0);
						@Pc(406) int local406 = this.aClass5_Sub1_Sub4_9.anInt429;
						this.aClass5_Sub1_Sub4_9.method230(255);
						this.aClass5_Sub1_Sub4_9.method230((int) (Math.random() * 256.0D));
						this.aClass5_Sub1_Sub4_9.method231((int) (Math.random() * 65536.0D));
						this.aClass5_Sub1_Sub4_9.method230((int) (Math.random() * 256.0D));
						this.aClass5_Sub1_Sub4_9.method230(172);
						if ((int) (Math.random() * 2.0D) == 0) {
							this.aClass5_Sub1_Sub4_9.method230(76);
						}
						this.aClass5_Sub1_Sub4_9.method230((int) (Math.random() * 256.0D));
						this.aClass5_Sub1_Sub4_9.method230(28);
						if ((int) (Math.random() * 2.0D) == 0) {
							this.aClass5_Sub1_Sub4_9.method231(9038);
						}
						this.aClass5_Sub1_Sub4_9.method230(64);
						this.aClass5_Sub1_Sub4_9.method239(this.aClass5_Sub1_Sub4_9.anInt429 - local406);
					}
				}
				if (this.anInt931 != -1) {
					local277 = this.method667(this.anInt931, this.anInt895);
					if (local277) {
						this.aBoolean237 = true;
					}
				}
				if (this.anInt1012 == 3) {
					this.aBoolean237 = true;
				}
				if (this.anInt988 == 3) {
					this.aBoolean237 = true;
				}
				if (this.aString28 != null) {
					this.aBoolean237 = true;
				}
				if (this.aBoolean240 && this.anInt969 == 2) {
					this.aBoolean237 = true;
				}
				if (this.aBoolean237) {
					this.method596(this.anInt921);
					this.aBoolean237 = false;
				}
				if (this.anInt838 == 2) {
					this.method703();
					this.aClass6_16.method56(4, super.aGraphics2, 550);
				}
				if (this.anInt842 != -1) {
					this.aBoolean244 = true;
				}
				if (this.aBoolean244) {
					if (this.anInt842 != -1 && this.anInt842 == this.anInt908) {
						this.anInt842 = -1;
						this.aClass5_Sub1_Sub4_9.method229(3);
						this.aClass5_Sub1_Sub4_9.method230(this.anInt908);
					}
					this.aBoolean244 = false;
					this.aClass6_5.method55();
					this.aClass5_Sub1_Sub1_Sub2_3.method417(0, 0);
					if (this.anInt1014 == -1) {
						if (this.anIntArray244[this.anInt908] != -1) {
							if (this.anInt908 == 0) {
								this.aClass5_Sub1_Sub1_Sub2_16.method417(22, 10);
							}
							if (this.anInt908 == 1) {
								this.aClass5_Sub1_Sub1_Sub2_17.method417(54, 8);
							}
							if (this.anInt908 == 2) {
								this.aClass5_Sub1_Sub1_Sub2_17.method417(82, 8);
							}
							if (this.anInt908 == 3) {
								this.aClass5_Sub1_Sub1_Sub2_18.method417(110, 8);
							}
							if (this.anInt908 == 4) {
								this.aClass5_Sub1_Sub1_Sub2_20.method417(153, 8);
							}
							if (this.anInt908 == 5) {
								this.aClass5_Sub1_Sub1_Sub2_20.method417(181, 8);
							}
							if (this.anInt908 == 6) {
								this.aClass5_Sub1_Sub1_Sub2_19.method417(209, 9);
							}
						}
						if (this.anIntArray244[0] != -1 && (this.anInt842 != 0 || anInt1018 % 20 < 10)) {
							this.aClass5_Sub1_Sub1_Sub2Array3[0].method417(29, 13);
						}
						if (this.anIntArray244[1] != -1 && (this.anInt842 != 1 || anInt1018 % 20 < 10)) {
							this.aClass5_Sub1_Sub1_Sub2Array3[1].method417(53, 11);
						}
						if (this.anIntArray244[2] != -1 && (this.anInt842 != 2 || anInt1018 % 20 < 10)) {
							this.aClass5_Sub1_Sub1_Sub2Array3[2].method417(82, 11);
						}
						if (this.anIntArray244[3] != -1 && (this.anInt842 != 3 || anInt1018 % 20 < 10)) {
							this.aClass5_Sub1_Sub1_Sub2Array3[3].method417(115, 12);
						}
						if (this.anIntArray244[4] != -1 && (this.anInt842 != 4 || anInt1018 % 20 < 10)) {
							this.aClass5_Sub1_Sub1_Sub2Array3[4].method417(153, 13);
						}
						if (this.anIntArray244[5] != -1 && (this.anInt842 != 5 || anInt1018 % 20 < 10)) {
							this.aClass5_Sub1_Sub1_Sub2Array3[5].method417(180, 11);
						}
						if (this.anIntArray244[6] != -1 && (this.anInt842 != 6 || anInt1018 % 20 < 10)) {
							this.aClass5_Sub1_Sub1_Sub2Array3[6].method417(208, 13);
						}
					}
					this.aClass6_5.method56(160, super.aGraphics2, 516);
					this.aClass6_4.method55();
					this.aClass5_Sub1_Sub1_Sub2_2.method417(0, 0);
					if (this.anInt1014 == -1) {
						if (this.anIntArray244[this.anInt908] != -1) {
							if (this.anInt908 == 7) {
								this.aClass5_Sub1_Sub1_Sub2_9.method417(42, 0);
							}
							if (this.anInt908 == 8) {
								this.aClass5_Sub1_Sub1_Sub2_10.method417(74, 0);
							}
							if (this.anInt908 == 9) {
								this.aClass5_Sub1_Sub1_Sub2_10.method417(102, 0);
							}
							if (this.anInt908 == 10) {
								this.aClass5_Sub1_Sub1_Sub2_11.method417(130, 1);
							}
							if (this.anInt908 == 11) {
								this.aClass5_Sub1_Sub1_Sub2_13.method417(173, 0);
							}
							if (this.anInt908 == 12) {
								this.aClass5_Sub1_Sub1_Sub2_13.method417(201, 0);
							}
							if (this.anInt908 == 13) {
								this.aClass5_Sub1_Sub1_Sub2_12.method417(229, 0);
							}
						}
						if (this.anIntArray244[8] != -1 && (this.anInt842 != 8 || anInt1018 % 20 < 10)) {
							this.aClass5_Sub1_Sub1_Sub2Array3[7].method417(74, 2);
						}
						if (this.anIntArray244[9] != -1 && (this.anInt842 != 9 || anInt1018 % 20 < 10)) {
							this.aClass5_Sub1_Sub1_Sub2Array3[8].method417(102, 3);
						}
						if (this.anIntArray244[10] != -1 && (this.anInt842 != 10 || anInt1018 % 20 < 10)) {
							this.aClass5_Sub1_Sub1_Sub2Array3[9].method417(137, 4);
						}
						if (this.anIntArray244[11] != -1 && (this.anInt842 != 11 || anInt1018 % 20 < 10)) {
							this.aClass5_Sub1_Sub1_Sub2Array3[10].method417(174, 2);
						}
						if (this.anIntArray244[12] != -1 && (this.anInt842 != 12 || anInt1018 % 20 < 10)) {
							this.aClass5_Sub1_Sub1_Sub2Array3[11].method417(201, 2);
						}
						if (this.anIntArray244[13] != -1 && (this.anInt842 != 13 || anInt1018 % 20 < 10)) {
							this.aClass5_Sub1_Sub1_Sub2Array3[12].method417(226, 2);
						}
					}
					this.aClass6_4.method56(466, super.aGraphics2, 496);
					this.aClass6_17.method55();
					Class5_Sub1_Sub1_Sub4.anIntArray206 = this.anIntArray231;
				}
				if (this.aBoolean258) {
					this.aBoolean258 = false;
					this.aClass6_3.method55();
					this.aClass5_Sub1_Sub1_Sub2_1.method417(0, 0);
					this.aClass5_Sub1_Sub1_Sub1_3.method41(55, "Public chat", true, 28, 16777215);
					if (this.anInt1025 == 0) {
						this.aClass5_Sub1_Sub1_Sub1_3.method41(55, "On", true, 41, 65280);
					}
					if (this.anInt1025 == 1) {
						this.aClass5_Sub1_Sub1_Sub1_3.method41(55, "Friends", true, 41, 16776960);
					}
					if (this.anInt1025 == 2) {
						this.aClass5_Sub1_Sub1_Sub1_3.method41(55, "Off", true, 41, 16711680);
					}
					if (this.anInt1025 == 3) {
						this.aClass5_Sub1_Sub1_Sub1_3.method41(55, "Hide", true, 41, 65535);
					}
					this.aClass5_Sub1_Sub1_Sub1_3.method41(184, "Private chat", true, 28, 16777215);
					if (this.anInt1043 == 0) {
						this.aClass5_Sub1_Sub1_Sub1_3.method41(184, "On", true, 41, 65280);
					}
					if (this.anInt1043 == 1) {
						this.aClass5_Sub1_Sub1_Sub1_3.method41(184, "Friends", true, 41, 16776960);
					}
					if (this.anInt1043 == 2) {
						this.aClass5_Sub1_Sub1_Sub1_3.method41(184, "Off", true, 41, 16711680);
					}
					this.aClass5_Sub1_Sub1_Sub1_3.method41(324, "Trade/compete", true, 28, 16777215);
					if (this.anInt963 == 0) {
						this.aClass5_Sub1_Sub1_Sub1_3.method41(324, "On", true, 41, 65280);
					}
					if (this.anInt963 == 1) {
						this.aClass5_Sub1_Sub1_Sub1_3.method41(324, "Friends", true, 41, 16776960);
					}
					if (this.anInt963 == 2) {
						this.aClass5_Sub1_Sub1_Sub1_3.method41(324, "Off", true, 41, 16711680);
					}
					this.aClass5_Sub1_Sub1_Sub1_3.method41(458, "Report abuse", true, 33, 16777215);
					this.aClass6_3.method56(453, super.aGraphics2, 0);
					this.aClass6_17.method55();
					Class5_Sub1_Sub1_Sub4.anIntArray206 = this.anIntArray231;
				}
				this.anInt895 = 0;
				if (this.aByte23 != -118) {
					this.aBoolean241 = !this.aBoolean241;
				}
			} else {
				if (this.anInt838 == 2) {
					this.method667(this.anInt889, this.anInt895);
					if (this.anInt1026 != -1) {
						this.method667(this.anInt1026, this.anInt895);
					}
					this.anInt895 = 0;
					this.method699();
					super.aClass6_2.method55();
					Class5_Sub1_Sub1_Sub4.anIntArray206 = this.anIntArray232;
					Class5_Sub1_Sub1.method547();
					this.aBoolean256 = true;
					@Pc(56) Class36 local56 = Class36.method388(this.anInt889);
					if (local56.anInt603 == 512 && local56.anInt579 == 334 && local56.anInt595 == 0) {
						local56.anInt603 = 765;
						local56.anInt579 = 503;
					}
					this.method701(0, 0, local56, 0);
					if (this.anInt1026 != -1) {
						local56 = Class36.method388(this.anInt1026);
						if (local56.anInt603 == 512 && local56.anInt579 == 334 && local56.anInt595 == 0) {
							local56.anInt603 = 765;
							local56.anInt579 = 503;
						}
						this.method701(0, 0, local56, 0);
					}
					if (this.aBoolean240) {
						this.method620();
					} else {
						this.method714();
						this.method706();
					}
				}
				super.aClass6_2.method56(0, super.aGraphics2, 0);
			}
		} catch (@Pc(1297) RuntimeException local1297) {
			signlink.reporterror("98680, " + -118 + ", " + local1297.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "o", descriptor = "(Z)V")
	private void method651(@OriginalArg(0) boolean arg0) {
		try {
			@Pc(8) int local8;
			if (this.anInt898 > 0) {
				for (local8 = 0; local8 < 256; local8++) {
					if (this.anInt898 > 768) {
						this.anIntArray255[local8] = this.method654(this.anIntArray257[local8], this.anIntArray256[local8], this.aBoolean232, 1024 - this.anInt898);
					} else if (this.anInt898 > 256) {
						this.anIntArray255[local8] = this.anIntArray257[local8];
					} else {
						this.anIntArray255[local8] = this.method654(this.anIntArray256[local8], this.anIntArray257[local8], this.aBoolean232, 256 - this.anInt898);
					}
				}
			} else if (this.anInt899 > 0) {
				for (local8 = 0; local8 < 256; local8++) {
					if (this.anInt899 > 768) {
						this.anIntArray255[local8] = this.method654(this.anIntArray258[local8], this.anIntArray256[local8], this.aBoolean232, 1024 - this.anInt899);
					} else if (this.anInt899 > 256) {
						this.anIntArray255[local8] = this.anIntArray258[local8];
					} else {
						this.anIntArray255[local8] = this.method654(this.anIntArray256[local8], this.anIntArray258[local8], this.aBoolean232, 256 - this.anInt899);
					}
				}
			} else {
				for (local8 = 0; local8 < 256; local8++) {
					this.anIntArray255[local8] = this.anIntArray256[local8];
				}
			}
			for (local8 = 0; local8 < 33920; local8++) {
				this.aClass6_9.anIntArray12[local8] = this.aClass5_Sub1_Sub1_Sub3_15.anIntArray173[local8];
			}
			@Pc(185) int local185 = 0;
			@Pc(187) int local187 = 1152;
			@Pc(202) int local202;
			@Pc(206) int local206;
			@Pc(216) int local216;
			@Pc(224) int local224;
			@Pc(228) int local228;
			@Pc(232) int local232;
			@Pc(243) int local243;
			for (@Pc(189) int local189 = 1; local189 < 255; local189++) {
				local202 = this.anIntArray217[local189] * (256 - local189) / 256;
				local206 = local202 + 22;
				if (local206 < 0) {
					local206 = 0;
				}
				local185 += local206;
				for (local216 = local206; local216 < 128; local216++) {
					local224 = this.anIntArray241[local185++];
					if (local224 == 0) {
						local187++;
					} else {
						local228 = local224;
						local232 = 256 - local224;
						local224 = this.anIntArray255[local224];
						local243 = this.aClass6_9.anIntArray12[local187];
						this.aClass6_9.anIntArray12[local187++] = ((local224 & 0xFF00FF) * local228 + (local243 & 0xFF00FF) * local232 & 0xFF00FF00) + ((local224 & 0xFF00) * local228 + (local243 & 0xFF00) * local232 & 0xFF0000) >> 8;
					}
				}
				local187 += local206;
			}
			this.aClass6_9.method56(0, super.aGraphics2, 0);
			for (local202 = 0; local202 < 33920; local202++) {
				this.aClass6_10.anIntArray12[local202] = this.aClass5_Sub1_Sub1_Sub3_16.anIntArray173[local202];
			}
			local185 = 0;
			local187 = 1176;
			for (local206 = 1; local206 < 255; local206++) {
				local216 = this.anIntArray217[local206] * (256 - local206) / 256;
				local224 = 103 - local216;
				local187 += local216;
				for (local228 = 0; local228 < local224; local228++) {
					local232 = this.anIntArray241[local185++];
					if (local232 == 0) {
						local187++;
					} else {
						local243 = local232;
						@Pc(366) int local366 = 256 - local232;
						local232 = this.anIntArray255[local232];
						@Pc(377) int local377 = this.aClass6_10.anIntArray12[local187];
						this.aClass6_10.anIntArray12[local187++] = ((local232 & 0xFF00FF) * local243 + (local377 & 0xFF00FF) * local366 & 0xFF00FF00) + ((local232 & 0xFF00) * local243 + (local377 & 0xFF00) * local366 & 0xFF0000) >> 8;
					}
				}
				local185 += 128 - local224;
				local187 += 128 - local224 - local216;
			}
			this.aClass6_10.method56(0, super.aGraphics2, 637);
			if (arg0) {
				this.aClass41ArrayArrayArray1 = null;
			}
		} catch (@Pc(454) RuntimeException local454) {
			signlink.reporterror("90927, " + arg0 + ", " + local454.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "p", descriptor = "(Z)V")
	private void method652() {
		try {
			this.anInt1045++;
			this.method640(true);
			this.method672(true);
			this.method640(false);
			this.method672(false);
			this.method673(251);
			this.method681();
			@Pc(35) int local35;
			@Pc(74) int local74;
			if (!this.aBoolean214) {
				local35 = this.anInt944;
				if (this.anInt1027 / 256 > local35) {
					local35 = this.anInt1027 / 256;
				}
				if (this.aBooleanArray11[4] && this.anIntArray223[4] + 128 > local35) {
					local35 = this.anIntArray223[4] + 128;
				}
				local74 = this.anInt945 + this.anInt879 & 0x7FF;
				this.method704(this.method594(this.anInt1052, aClass5_Sub1_Sub2_Sub4_Sub2_1.anInt524, this.anInt867, aClass5_Sub1_Sub2_Sub4_Sub2_1.anInt525) - 50, this.anInt1000, this.anInt999, local35 * 3 + 600, local74, local35);
				anInt882++;
				if (anInt882 > 148) {
					anInt882 = 0;
					this.aClass5_Sub1_Sub4_9.method229(142);
					this.aClass5_Sub1_Sub4_9.method233(8419562);
				}
			}
			if (this.aBoolean214) {
				local35 = this.method689();
			} else {
				local35 = this.method688();
			}
			local74 = this.anInt925;
			@Pc(137) int local137 = this.anInt926;
			@Pc(140) int local140 = this.anInt927;
			@Pc(143) int local143 = this.anInt928;
			@Pc(146) int local146 = this.anInt929;
			@Pc(195) int local195;
			for (@Pc(148) int local148 = 0; local148 < 5; local148++) {
				if (this.aBooleanArray11[local148]) {
					local195 = (int) (Math.random() * (double) (this.anIntArray237[local148] * 2 + 1) - (double) this.anIntArray237[local148] + Math.sin((double) this.anIntArray224[local148] * ((double) this.anIntArray260[local148] / 100.0D)) * (double) this.anIntArray223[local148]);
					if (local148 == 0) {
						this.anInt925 += local195;
					}
					if (local148 == 1) {
						this.anInt926 += local195;
					}
					if (local148 == 2) {
						this.anInt927 += local195;
					}
					if (local148 == 3) {
						this.anInt929 = this.anInt929 + local195 & 0x7FF;
					}
					if (local148 == 4) {
						this.anInt928 += local195;
						if (this.anInt928 < 128) {
							this.anInt928 = 128;
						}
						if (this.anInt928 > 383) {
							this.anInt928 = 383;
						}
					}
				}
			}
			local195 = Class5_Sub1_Sub1_Sub4.anInt789;
			Class5_Sub1_Sub2_Sub5.aBoolean126 = true;
			Class5_Sub1_Sub2_Sub5.anInt466 = 0;
			Class5_Sub1_Sub2_Sub5.anInt464 = super.anInt818 - 4;
			Class5_Sub1_Sub2_Sub5.anInt465 = super.anInt819 - 4;
			Class5_Sub1_Sub1.method547();
			this.aClass46_1.method520(this.anInt928, this.anInt925, this.anInt929, this.anInt927, local35, this.anInt926);
			this.aClass46_1.method495();
			this.method609();
			this.method608();
			this.method663(local195);
			this.method684((byte) 2);
			this.aClass6_17.method56(4, super.aGraphics2, 4);
			this.anInt925 = local74;
			this.anInt926 = local137;
			this.anInt927 = local140;
			this.anInt928 = local143;
			this.anInt929 = local146;
		} catch (@Pc(337) RuntimeException local337) {
			signlink.reporterror("45467, " + true + ", " + local337.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(BIIILclient!RRTTGXYM;IIII)V")
	private void method653(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class36 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		try {
			if (this.aBoolean245) {
				this.anInt1056 = 32;
			} else {
				this.anInt1056 = 0;
			}
			this.aBoolean245 = false;
			if (arg2 >= arg6 && arg2 < arg6 + 16 && arg4 >= arg7 && arg4 < arg7 + 16) {
				arg3.anInt571 -= this.anInt888 * 4;
				if (arg5 == 1) {
					this.aBoolean238 = true;
				}
				if (arg5 == 2 || arg5 == 3) {
					this.aBoolean237 = true;
				}
			} else if (arg2 >= arg6 && arg2 < arg6 + 16 && arg4 >= arg7 + arg0 - 16 && arg4 < arg7 + arg0) {
				arg3.anInt571 += this.anInt888 * 4;
				if (arg5 == 1) {
					this.aBoolean238 = true;
				}
				if (arg5 == 2 || arg5 == 3) {
					this.aBoolean237 = true;
				}
			} else if (arg2 >= arg6 - this.anInt1056 && arg2 < arg6 + this.anInt1056 + 16 && arg4 >= arg7 + 16 && arg4 < arg7 + arg0 - 16 && this.anInt888 > 0) {
				@Pc(142) int local142 = (arg0 - 32) * arg0 / arg1;
				if (local142 < 8) {
					local142 = 8;
				}
				@Pc(157) int local157 = arg4 - arg7 - local142 / 2 - 16;
				@Pc(163) int local163 = arg0 - local142 - 32;
				arg3.anInt571 = (arg1 - arg0) * local157 / local163;
				if (arg5 == 1) {
					this.aBoolean238 = true;
				}
				if (arg5 == 2 || arg5 == 3) {
					this.aBoolean237 = true;
				}
				this.aBoolean245 = true;
			}
		} catch (@Pc(192) RuntimeException local192) {
			signlink.reporterror("8578, " + -45 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + local192.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIZI)I")
	private int method654(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3) {
		try {
			@Pc(3) int local3 = 256 - arg3;
			this.aBoolean221 &= arg2;
			return ((arg1 & 0xFF00FF) * local3 + (arg0 & 0xFF00FF) * arg3 & 0xFF00FF00) + ((arg1 & 0xFF00) * local3 + (arg0 & 0xFF00) * arg3 & 0xFF0000) >> 8;
		} catch (@Pc(40) RuntimeException local40) {
			signlink.reporterror("27548, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local40.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IJ)V")
	private void method655(@OriginalArg(1) long arg0) {
		try {
			if (arg0 != 0L) {
				if (this.anInt840 >= 100 && this.anInt930 != 1) {
					this.method720(0, "", "Your friendlist is full. Max of 100 for free users, and 200 for members");
				} else if (this.anInt840 >= 200) {
					this.method720(0, "", "Your friendlist is full. Max of 100 for free users, and 200 for members");
				} else {
					@Pc(38) String local38 = Class28.method195(Class28.method192((byte) 7, arg0));
					for (@Pc(40) int local40 = 0; local40 < this.anInt840; local40++) {
						if (this.aLongArray4[local40] == arg0) {
							this.method720(0, "", local38 + " is already on your friend list");
							return;
						}
					}
					for (@Pc(70) int local70 = 0; local70 < this.anInt844; local70++) {
						if (this.aLongArray3[local70] == arg0) {
							this.method720(0, "", "Please remove " + local38 + " from your ignore list first");
							return;
						}
					}
					if (!local38.equals(aClass5_Sub1_Sub2_Sub4_Sub2_1.aString8)) {
						this.aStringArray12[this.anInt840] = local38;
						this.aLongArray4[this.anInt840] = arg0;
						this.anIntArray240[this.anInt840] = 0;
						this.anInt840++;
						this.aBoolean238 = true;
						this.aClass5_Sub1_Sub4_9.method229(105);
						this.aClass5_Sub1_Sub4_9.method236(arg0);
					}
				}
			}
		} catch (@Pc(149) RuntimeException local149) {
			signlink.reporterror("41859, " + -46843 + ", " + arg0 + ", " + local149.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;Z)V")
	private void method656(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) boolean arg2) {
		signlink.errorname = arg0;
		try {
			if (!arg2) {
				this.aString20 = "";
				this.aString21 = "Connecting to server...";
				this.method625(true);
			}
			this.aClass17_1 = new Class17((byte) 1, this.method669(anInt1058 + 43594), this);
			@Pc(30) long local30 = Class28.method191(arg0);
			@Pc(37) int local37 = (int) (local30 >> 16 & 0x1FL);
			this.aClass5_Sub1_Sub4_9.anInt429 = 0;
			this.aClass5_Sub1_Sub4_9.method230(14);
			this.aClass5_Sub1_Sub4_9.method230(local37);
			this.aClass17_1.method110(this.aClass5_Sub1_Sub4_9.aByteArray16, 2, 866);
			for (@Pc(60) int local60 = 0; local60 < 8; local60++) {
				this.aClass17_1.method107();
			}
			@Pc(74) int local74 = this.aClass17_1.method107();
			@Pc(76) int local76 = local74;
			@Pc(225) int local225;
			@Pc(259) int local259;
			if (local74 == 0) {
				this.aClass17_1.method109(this.aClass5_Sub1_Sub4_6.aByteArray16, 0, 8);
				this.aClass5_Sub1_Sub4_6.anInt429 = 0;
				this.aLong32 = this.aClass5_Sub1_Sub4_6.method246();
				@Pc(99) int[] local99 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (this.aLong32 >> 32), (int) this.aLong32 };
				this.aClass5_Sub1_Sub4_9.anInt429 = 0;
				this.aClass5_Sub1_Sub4_9.method230(10);
				this.aClass5_Sub1_Sub4_9.method234(local99[0]);
				this.aClass5_Sub1_Sub4_9.method234(local99[1]);
				this.aClass5_Sub1_Sub4_9.method234(local99[2]);
				this.aClass5_Sub1_Sub4_9.method234(local99[3]);
				this.aClass5_Sub1_Sub4_9.method234(signlink.anInt1061);
				this.aClass5_Sub1_Sub4_9.method237(arg0);
				this.aClass5_Sub1_Sub4_9.method237(arg1);
				this.aClass5_Sub1_Sub4_9.method255(aBigInteger1, aBigInteger2);
				this.aClass5_Sub1_Sub4_7.anInt429 = 0;
				if (arg2) {
					this.aClass5_Sub1_Sub4_7.method230(18);
				} else {
					this.aClass5_Sub1_Sub4_7.method230(16);
				}
				this.aClass5_Sub1_Sub4_7.method230(this.aClass5_Sub1_Sub4_9.anInt429 + 36 + 1 + 1 + 2);
				this.aClass5_Sub1_Sub4_7.method230(255);
				this.aClass5_Sub1_Sub4_7.method231(340);
				this.aClass5_Sub1_Sub4_7.method230(aBoolean261 ? 1 : 0);
				for (local225 = 0; local225 < 9; local225++) {
					this.aClass5_Sub1_Sub4_7.method234(this.anIntArray236[local225]);
				}
				this.aClass5_Sub1_Sub4_7.method238(this.aClass5_Sub1_Sub4_9.aByteArray16, this.aClass5_Sub1_Sub4_9.anInt429, (byte) 8);
				this.aClass5_Sub1_Sub4_9.aClass23_1 = new Class23(local99, true);
				for (local259 = 0; local259 < 4; local259++) {
					local99[local259] += 50;
				}
				this.aClass23_2 = new Class23(local99, true);
				this.aClass17_1.method110(this.aClass5_Sub1_Sub4_7.aByteArray16, this.aClass5_Sub1_Sub4_7.anInt429, 866);
				local74 = this.aClass17_1.method107();
			}
			if (local74 == 1) {
				try {
					Thread.sleep(2000L);
				} catch (@Pc(301) Exception local301) {
				}
				this.method656(arg0, arg1, arg2);
			} else {
				@Pc(389) int local389;
				if (local74 == 2) {
					this.anInt998 = this.aClass17_1.method107();
					aBoolean252 = this.aClass17_1.method107() == 1;
					this.aLong30 = 0L;
					this.anInt1042 = 0;
					this.aClass38_1.anInt653 = 0;
					super.aBoolean213 = true;
					this.aBoolean219 = true;
					this.aBoolean221 = true;
					this.aClass5_Sub1_Sub4_9.anInt429 = 0;
					this.aClass5_Sub1_Sub4_6.anInt429 = 0;
					this.anInt939 = -1;
					this.anInt863 = -1;
					this.anInt864 = -1;
					this.anInt865 = -1;
					this.anInt938 = 0;
					this.anInt940 = 0;
					this.anInt965 = 0;
					this.anInt942 = 0;
					this.anInt856 = 0;
					this.anInt956 = 0;
					this.aBoolean240 = false;
					super.anInt816 = 0;
					for (local389 = 0; local389 < 100; local389++) {
						this.aStringArray9[local389] = null;
					}
					this.anInt957 = 0;
					this.anInt1047 = 0;
					this.anInt838 = 0;
					this.anInt848 = 0;
					this.anInt877 = (int) (Math.random() * 100.0D) - 50;
					this.anInt868 = (int) (Math.random() * 110.0D) - 55;
					this.anInt879 = (int) (Math.random() * 80.0D) - 40;
					this.anInt893 = (int) (Math.random() * 120.0D) - 60;
					this.anInt918 = (int) (Math.random() * 30.0D) - 20;
					this.anInt945 = (int) (Math.random() * 20.0D) - 10 & 0x7FF;
					this.anInt1019 = 0;
					this.anInt1002 = -1;
					this.anInt1028 = 0;
					this.anInt1029 = 0;
					this.anInt984 = 0;
					this.anInt943 = 0;
					for (local225 = 0; local225 < this.anInt982; local225++) {
						this.aClass5_Sub1_Sub2_Sub4_Sub2Array1[local225] = null;
						this.aClass5_Sub1_Sub4Array1[local225] = null;
					}
					for (local259 = 0; local259 < 16384; local259++) {
						this.aClass5_Sub1_Sub2_Sub4_Sub1Array1[local259] = null;
					}
					aClass5_Sub1_Sub2_Sub4_Sub2_1 = this.aClass5_Sub1_Sub2_Sub4_Sub2Array1[this.anInt983] = new Class5_Sub1_Sub2_Sub4_Sub2();
					this.aClass41_12.method472();
					this.aClass41_11.method472();
					@Pc(534) int local534;
					@Pc(538) int local538;
					for (@Pc(530) int local530 = 0; local530 < 4; local530++) {
						for (local534 = 0; local534 < 104; local534++) {
							for (local538 = 0; local538 < 104; local538++) {
								this.aClass41ArrayArrayArray1[local530][local534][local538] = null;
							}
						}
					}
					this.aClass41_10 = new Class41(0);
					this.anInt841 = 0;
					this.anInt840 = 0;
					this.method723(this.anInt1015);
					this.anInt1015 = -1;
					this.method723(this.anInt931);
					this.anInt931 = -1;
					this.method723(this.anInt949);
					this.anInt949 = -1;
					this.method723(this.anInt889);
					this.anInt889 = -1;
					this.method723(this.anInt1026);
					this.anInt1026 = -1;
					this.method723(this.anInt1014);
					this.anInt1014 = -1;
					this.method723(this.anInt843);
					this.anInt843 = -1;
					this.aBoolean227 = false;
					this.anInt908 = 3;
					this.anInt884 = 0;
					this.aBoolean240 = false;
					this.aBoolean217 = false;
					this.aString28 = null;
					this.anInt951 = 0;
					this.anInt842 = -1;
					this.aBoolean257 = true;
					this.method626();
					for (local534 = 0; local534 < 5; local534++) {
						this.anIntArray263[local534] = 0;
					}
					for (local538 = 0; local538 < 5; local538++) {
						this.aStringArray13[local538] = null;
						this.aBooleanArray12[local538] = false;
					}
					anInt937 = 0;
					anInt1059 = 0;
					anInt952 = 0;
					anInt950 = 0;
					anInt1034 = 0;
					anInt992 = 0;
					anInt910 = 0;
					anInt1055 = 0;
					anInt1054 = 0;
					this.method623();
				} else if (local74 == 3) {
					this.aString20 = "";
					this.aString21 = "Invalid username or password.";
				} else if (local74 == 4) {
					this.aString20 = "Your account has been disabled.";
					this.aString21 = "Please check your message-centre for details.";
				} else if (local74 == 5) {
					this.aString20 = "Your account is already logged in.";
					this.aString21 = "Try again in 60 secs...";
				} else if (local74 == 6) {
					this.aString20 = "RuneScape has been updated!";
					this.aString21 = "Please reload this page.";
				} else if (local74 == 7) {
					this.aString20 = "This world is full.";
					this.aString21 = "Please use a different world.";
				} else if (local74 == 8) {
					this.aString20 = "Unable to connect.";
					this.aString21 = "Login server offline.";
				} else if (local74 == 9) {
					this.aString20 = "Login limit exceeded.";
					this.aString21 = "Too many connections from your address.";
				} else if (local74 == 10) {
					this.aString20 = "Unable to connect.";
					this.aString21 = "Bad session id.";
				} else if (local74 == 11) {
					this.aString20 = "Login server rejected session.";
					this.aString21 = "Please try again.";
				} else if (local74 == 12) {
					this.aString20 = "You need a members account to login to this world.";
					this.aString21 = "Please subscribe, or use a different world.";
				} else if (local74 == 13) {
					this.aString20 = "Could not complete login.";
					this.aString21 = "Please try using a different world.";
				} else if (local74 == 14) {
					this.aString20 = "The server is being updated.";
					this.aString21 = "Please wait 1 minute and try again.";
				} else if (local74 == 15) {
					this.aBoolean221 = true;
					this.aClass5_Sub1_Sub4_9.anInt429 = 0;
					this.aClass5_Sub1_Sub4_6.anInt429 = 0;
					this.anInt939 = -1;
					this.anInt863 = -1;
					this.anInt864 = -1;
					this.anInt865 = -1;
					this.anInt938 = 0;
					this.anInt940 = 0;
					this.anInt965 = 0;
					this.anInt956 = 0;
					this.aBoolean240 = false;
					this.aLong29 = System.currentTimeMillis();
				} else if (local74 == 16) {
					this.aString20 = "Login attempts exceeded.";
					this.aString21 = "Please wait 1 minute and try again.";
				} else if (local74 == 17) {
					this.aString20 = "You are standing in a members-only area.";
					this.aString21 = "To play on this world move to a free area first";
				} else if (local74 == 20) {
					this.aString20 = "Invalid loginserver requested";
					this.aString21 = "Please try using a different world.";
				} else if (local74 == 21) {
					local389 = this.aClass17_1.method107();
					for (@Pc(917) int local917 = local389 + 3; local917 >= 0; local917--) {
						this.aString20 = "You have only just left another world";
						this.aString21 = "Your profile will be transferred in: " + local917;
						this.method625(true);
						try {
							Thread.sleep(1200L);
						} catch (@Pc(939) Exception local939) {
						}
					}
					this.method656(arg0, arg1, arg2);
				} else if (local74 == 22) {
					this.aString20 = "Malformed login packet.";
					this.aString21 = "Please try again.";
				} else if (local74 != -1) {
					System.out.println("response:" + local74);
					this.aString20 = "Unexpected server response";
					this.aString21 = "Please try using a different world.";
				} else if (local76 != 0) {
					this.aString20 = "No response from server";
					this.aString21 = "Please try using a different world.";
				} else if (this.anInt871 < 2) {
					try {
						Thread.sleep(2000L);
					} catch (@Pc(971) Exception local971) {
					}
					this.anInt871++;
					this.method656(arg0, arg1, arg2);
				} else {
					this.aString20 = "No response from loginserver";
					this.aString21 = "Please wait 1 minute and try again.";
				}
			}
		} catch (@Pc(1014) IOException local1014) {
			this.aString20 = "";
			this.aString21 = "Error connecting to server.";
		}
	}

	@OriginalMember(owner = "client!client", name = "q", descriptor = "(Z)V")
	private void method657() {
		try {
			for (@Pc(10) int local10 = 0; local10 < this.anInt848; local10++) {
				if (this.anIntArray266[local10] <= 0) {
					@Pc(19) boolean local19 = false;
					try {
						if (this.anIntArray221[local10] != this.anInt997 || this.anIntArray261[local10] != this.anInt935) {
							@Pc(53) Class5_Sub1_Sub4 local53 = Class30.method198(this.anIntArray261[local10], this.aBoolean230, this.anIntArray221[local10]);
							if (System.currentTimeMillis() + (long) (local53.anInt429 / 22) > this.aLong31 + (long) (this.anInt1007 / 22)) {
								this.anInt1007 = local53.anInt429;
								this.aLong31 = System.currentTimeMillis();
								if (this.method633((byte) 7, local53.aByteArray16, local53.anInt429)) {
									this.anInt997 = this.anIntArray221[local10];
									this.anInt935 = this.anIntArray261[local10];
								} else {
									local19 = true;
								}
							}
						} else if (!this.method598()) {
							local19 = true;
						}
					} catch (@Pc(103) Exception local103) {
					}
					if (local19 && this.anIntArray266[local10] != -5) {
						this.anIntArray266[local10] = -5;
					} else {
						this.anInt848--;
						for (@Pc(119) int local119 = local10; local119 < this.anInt848; local119++) {
							this.anIntArray221[local119] = this.anIntArray221[local119 + 1];
							this.anIntArray261[local119] = this.anIntArray261[local119 + 1];
							this.anIntArray266[local119] = this.anIntArray266[local119 + 1];
						}
						local10--;
					}
				} else {
					@Pc(171) int local171 = this.anIntArray266[local10]--;
				}
			}
			anInt917++;
			if (anInt917 > 60) {
				anInt917 = 0;
				this.aClass5_Sub1_Sub4_9.method229(101);
			}
			if (this.anInt1040 > 0) {
				this.anInt1040 -= 20;
				if (this.anInt1040 < 0) {
					this.anInt1040 = 0;
				}
				if (this.anInt1040 == 0 && this.aBoolean242 && !aBoolean261) {
					this.anInt907 = this.anInt936;
					this.aBoolean234 = true;
					this.aClass9_Sub1_1.method150(2, this.anInt907);
					return;
				}
			}
		} catch (@Pc(231) RuntimeException local231) {
			signlink.reporterror("11826, " + false + ", " + local231.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "r", descriptor = "(Z)V")
	private void method659() {
		try {
			try {
				if (this.aClass17_1 != null) {
					this.aClass17_1.method106();
				}
			} catch (@Pc(7) Exception local7) {
			}
			this.aClass17_1 = null;
			this.aBoolean221 = false;
			this.anInt906 = 0;
			this.aString17 = "";
			this.aString18 = "";
			this.method683((byte) 5);
			this.aClass46_1.method481();
			for (@Pc(36) int local36 = 0; local36 < 4; local36++) {
				this.aClass37Array1[local36].method424();
			}
			System.gc();
			this.method601();
			this.anInt936 = -1;
			this.anInt907 = -1;
			this.anInt1040 = 0;
		} catch (@Pc(62) RuntimeException local62) {
			signlink.reporterror("27805, " + true + ", " + local62.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;)V")
	private void method660(@OriginalArg(0) String arg0, @OriginalArg(2) String arg1) {
		try {
			@Pc(16) int local16;
			if (this.aClass6_17 != null) {
				this.aClass6_17.method55();
				Class5_Sub1_Sub1_Sub4.anIntArray206 = this.anIntArray231;
				local16 = 151;
				if (arg1 != null) {
					local16 -= 7;
				}
				this.aClass5_Sub1_Sub1_Sub1_3.method40(local16, 257, arg0, 0);
				this.aClass5_Sub1_Sub1_Sub1_3.method40(local16 - 1, 256, arg0, 16777215);
				local16 += 15;
				if (arg1 != null) {
					this.aClass5_Sub1_Sub1_Sub1_3.method40(local16, 257, arg1, 0);
					this.aClass5_Sub1_Sub1_Sub1_3.method40(local16 - 1, 256, arg1, 16777215);
				}
				this.aClass6_17.method56(4, super.aGraphics2, 4);
			} else if (super.aClass6_2 != null) {
				super.aClass6_2.method55();
				Class5_Sub1_Sub1_Sub4.anIntArray206 = this.anIntArray232;
				local16 = 251;
				Class5_Sub1_Sub1.method549(0, 233, 300, 221, 50);
				Class5_Sub1_Sub1.method550(221, 50, 16777215, 233, 300);
				if (arg1 != null) {
					local16 -= 7;
				}
				this.aClass5_Sub1_Sub1_Sub1_3.method40(local16, 383, arg0, 0);
				this.aClass5_Sub1_Sub1_Sub1_3.method40(local16 - 1, 382, arg0, 16777215);
				local16 += 15;
				if (arg1 != null) {
					this.aClass5_Sub1_Sub1_Sub1_3.method40(local16, 383, arg1, 0);
					this.aClass5_Sub1_Sub1_Sub1_3.method40(local16 - 1, 382, arg1, 16777215);
				}
				super.aClass6_2.method56(0, super.aGraphics2, 0);
			}
		} catch (@Pc(169) RuntimeException local169) {
			signlink.reporterror("74115, " + arg0 + ", " + -182 + ", " + arg1 + ", " + local169.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(II)V")
	private void method661(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			if (arg1 >= 0) {
				if (this.anInt884 != 0) {
					this.anInt884 = 0;
					this.aBoolean237 = true;
				}
				@Pc(18) int local18 = this.anIntArray267[arg1];
				@Pc(23) int local23 = this.anIntArray268[arg1];
				@Pc(28) int local28 = this.anIntArray269[arg1];
				@Pc(33) int local33 = this.anIntArray270[arg1];
				@Pc(37) int local37 = 25 / arg0;
				if (local28 >= 2000) {
					local28 -= 2000;
				}
				@Pc(65) boolean local65;
				if (local28 == 396) {
					local65 = this.method586(aClass5_Sub1_Sub2_Sub4_Sub2_1.anIntArray152[0], aClass5_Sub1_Sub2_Sub4_Sub2_1.anIntArray151[0], 0, 2, false, 0, 0, 0, 0, local18, local23);
					if (!local65) {
						this.method586(aClass5_Sub1_Sub2_Sub4_Sub2_1.anIntArray152[0], aClass5_Sub1_Sub2_Sub4_Sub2_1.anIntArray151[0], 0, 2, false, 1, 1, 0, 0, local18, local23);
					}
					this.anInt1003 = super.anInt824;
					this.anInt1004 = super.anInt825;
					this.anInt1006 = 2;
					this.anInt1005 = 0;
					this.aClass5_Sub1_Sub4_9.method229(107);
					this.aClass5_Sub1_Sub4_9.method264(local18 + this.anInt873);
					this.aClass5_Sub1_Sub4_9.method264(local33);
					this.aClass5_Sub1_Sub4_9.method264(local23 + this.anInt874);
				}
				if (local28 == 901) {
					this.anInt957 = 1;
					this.anInt958 = local18;
					this.anInt959 = local23;
					this.anInt960 = local33;
					this.aString26 = Class18.method117(local33).aString2;
					this.anInt1047 = 0;
					this.aBoolean238 = true;
				} else {
					@Pc(163) Class5_Sub1_Sub2_Sub4_Sub1 local163;
					if (local28 == 954) {
						local163 = this.aClass5_Sub1_Sub2_Sub4_Sub1Array1[local33];
						if (local163 != null) {
							this.method586(aClass5_Sub1_Sub2_Sub4_Sub2_1.anIntArray152[0], aClass5_Sub1_Sub2_Sub4_Sub2_1.anIntArray151[0], 0, 2, false, 1, 1, 0, 0, local163.anIntArray151[0], local163.anIntArray152[0]);
							this.anInt1003 = super.anInt824;
							this.anInt1004 = super.anInt825;
							this.anInt1006 = 2;
							this.anInt1005 = 0;
							this.aClass5_Sub1_Sub4_9.method229(171);
							this.aClass5_Sub1_Sub4_9.method231(local33);
							this.aClass5_Sub1_Sub4_9.method231(this.anInt1048);
						}
					}
					@Pc(253) int local253;
					@Pc(235) Class36 local235;
					if (local28 == 877) {
						this.aClass5_Sub1_Sub4_9.method229(75);
						this.aClass5_Sub1_Sub4_9.method231(local23);
						local235 = Class36.method388(local23);
						if (local235.anIntArrayArray14 != null && local235.anIntArrayArray14[0][0] == 5) {
							local253 = local235.anIntArrayArray14[0][1];
							this.anIntArray216[local253] = 1 - this.anIntArray216[local253];
							this.method641(local253);
							this.aBoolean238 = true;
						}
					}
					if (local28 == 836) {
						local235 = Class36.method388(local23);
						@Pc(278) boolean local278 = true;
						if (local235.anInt591 > 0) {
							local278 = this.method682(local235);
						}
						if (local278) {
							this.aClass5_Sub1_Sub4_9.method229(75);
							this.aClass5_Sub1_Sub4_9.method231(local23);
						}
					}
					@Pc(305) String local305;
					if (local28 == 556) {
						local305 = this.aStringArray10[arg1];
						local253 = local305.indexOf("@whi@");
						if (local253 != -1) {
							if (this.anInt949 == -1) {
								this.method639();
								this.aString19 = local305.substring(local253 + 5).trim();
								this.aBoolean216 = false;
								this.anInt924 = this.anInt949 = Class36.anInt598;
							} else {
								this.method720(0, "", "Please close the interface you have open before using 'report abuse'");
							}
						}
					}
					if (local28 == 856 && !this.aBoolean227) {
						this.aClass5_Sub1_Sub4_9.method229(202);
						this.aClass5_Sub1_Sub4_9.method231(local23);
						this.aBoolean227 = true;
					}
					if (local28 == 991) {
						this.method639();
					}
					if (local28 == 204) {
						anInt952 += local18;
						if (anInt952 >= 146) {
							this.aClass5_Sub1_Sub4_9.method229(28);
							anInt952 = 0;
						}
						this.aClass5_Sub1_Sub4_9.method229(238);
						this.aClass5_Sub1_Sub4_9.method264(local23);
						this.aClass5_Sub1_Sub4_9.method265(local33);
						this.aClass5_Sub1_Sub4_9.method266(local18);
						this.anInt1009 = 0;
						this.anInt1010 = local23;
						this.anInt1011 = local18;
						this.anInt1012 = 2;
						if (Class36.method388(local23).anInt575 == this.anInt949) {
							this.anInt1012 = 1;
						}
						if (Class36.method388(local23).anInt575 == this.anInt931) {
							this.anInt1012 = 3;
						}
					}
					if (local28 == 743) {
						this.method607(local23, local18, local33);
						this.aClass5_Sub1_Sub4_9.method229(43);
						this.aClass5_Sub1_Sub4_9.method231(local18 + this.anInt873);
						this.aClass5_Sub1_Sub4_9.method266(local33 >> 14 & 0x7FFF);
						this.aClass5_Sub1_Sub4_9.method264(local23 + this.anInt874);
					}
					@Pc(514) String local514;
					@Pc(499) String local499;
					if (local28 == 924) {
						local235 = Class36.method388(local23);
						this.anInt1047 = 1;
						this.anInt1048 = local23;
						this.anInt1049 = local235.anInt589;
						this.anInt957 = 0;
						this.aBoolean238 = true;
						local499 = local235.aString13;
						if (local499.indexOf(" ") != -1) {
							local499 = local499.substring(0, local499.indexOf(" "));
						}
						local514 = local235.aString13;
						if (local514.indexOf(" ") != -1) {
							local514 = local514.substring(local514.indexOf(" ") + 1);
						}
						this.aString30 = local499 + " " + local235.aString11 + " " + local514;
						if (this.anInt1049 == 16) {
							this.aBoolean238 = true;
							this.anInt908 = 3;
							this.aBoolean244 = true;
						}
					} else {
						if (local28 == 529) {
							this.aClass5_Sub1_Sub4_9.method229(75);
							this.aClass5_Sub1_Sub4_9.method231(local23);
							local235 = Class36.method388(local23);
							if (local235.anIntArrayArray14 != null && local235.anIntArrayArray14[0][0] == 5) {
								local253 = local235.anIntArrayArray14[0][1];
								if (this.anIntArray216[local253] != local235.anIntArray164[0]) {
									this.anIntArray216[local253] = local235.anIntArray164[0];
									this.method641(local253);
									this.aBoolean238 = true;
								}
							}
						}
						if (local28 == 855) {
							local65 = this.method586(aClass5_Sub1_Sub2_Sub4_Sub2_1.anIntArray152[0], aClass5_Sub1_Sub2_Sub4_Sub2_1.anIntArray151[0], 0, 2, false, 0, 0, 0, 0, local18, local23);
							if (!local65) {
								this.method586(aClass5_Sub1_Sub2_Sub4_Sub2_1.anIntArray152[0], aClass5_Sub1_Sub2_Sub4_Sub2_1.anIntArray151[0], 0, 2, false, 1, 1, 0, 0, local18, local23);
							}
							this.anInt1003 = super.anInt824;
							this.anInt1004 = super.anInt825;
							this.anInt1006 = 2;
							this.anInt1005 = 0;
							this.aClass5_Sub1_Sub4_9.method229(230);
							this.aClass5_Sub1_Sub4_9.method264(local23 + this.anInt874);
							this.aClass5_Sub1_Sub4_9.method266(this.anInt1048);
							this.aClass5_Sub1_Sub4_9.method231(local33);
							this.aClass5_Sub1_Sub4_9.method231(local18 + this.anInt873);
						}
						@Pc(714) Class5_Sub1_Sub2_Sub4_Sub2 local714;
						if (local28 == 830) {
							local714 = this.aClass5_Sub1_Sub2_Sub4_Sub2Array1[local33];
							if (local714 != null) {
								this.method586(aClass5_Sub1_Sub2_Sub4_Sub2_1.anIntArray152[0], aClass5_Sub1_Sub2_Sub4_Sub2_1.anIntArray151[0], 0, 2, false, 1, 1, 0, 0, local714.anIntArray151[0], local714.anIntArray152[0]);
								this.anInt1003 = super.anInt824;
								this.anInt1004 = super.anInt825;
								this.anInt1006 = 2;
								this.anInt1005 = 0;
								this.aClass5_Sub1_Sub4_9.method229(204);
								this.aClass5_Sub1_Sub4_9.method265(local33);
							}
						}
						if (local28 == 104) {
							this.aClass5_Sub1_Sub4_9.method229(44);
							this.aClass5_Sub1_Sub4_9.method231(local23);
							this.aClass5_Sub1_Sub4_9.method231(local18);
							this.aClass5_Sub1_Sub4_9.method266(this.anInt1048);
							this.aClass5_Sub1_Sub4_9.method265(local33);
							this.anInt1009 = 0;
							this.anInt1010 = local23;
							this.anInt1011 = local18;
							this.anInt1012 = 2;
							if (Class36.method388(local23).anInt575 == this.anInt949) {
								this.anInt1012 = 1;
							}
							if (Class36.method388(local23).anInt575 == this.anInt931) {
								this.anInt1012 = 3;
							}
						}
						if (local28 == 537) {
							local714 = this.aClass5_Sub1_Sub2_Sub4_Sub2Array1[local33];
							if (local714 != null) {
								this.method586(aClass5_Sub1_Sub2_Sub4_Sub2_1.anIntArray152[0], aClass5_Sub1_Sub2_Sub4_Sub2_1.anIntArray151[0], 0, 2, false, 1, 1, 0, 0, local714.anIntArray151[0], local714.anIntArray152[0]);
								this.anInt1003 = super.anInt824;
								this.anInt1004 = super.anInt825;
								this.anInt1006 = 2;
								this.anInt1005 = 0;
								this.aClass5_Sub1_Sub4_9.method229(8);
								this.aClass5_Sub1_Sub4_9.method231(this.anInt1048);
								this.aClass5_Sub1_Sub4_9.method265(local33);
							}
						}
						@Pc(922) long local922;
						if (local28 == 695 || local28 == 913 || local28 == 864 || local28 == 736) {
							local305 = this.aStringArray10[arg1];
							local253 = local305.indexOf("@whi@");
							if (local253 != -1) {
								local922 = Class28.method191(local305.substring(local253 + 5).trim());
								if (local28 == 695) {
									this.method655(local922);
								}
								if (local28 == 913) {
									this.method662(local922);
								}
								if (local28 == 864) {
									this.method708(local922);
								}
								if (local28 == 736) {
									this.method691(local922, this.anInt854);
								}
							}
						}
						if (local28 == 481) {
							local714 = this.aClass5_Sub1_Sub2_Sub4_Sub2Array1[local33];
							if (local714 != null) {
								this.method586(aClass5_Sub1_Sub2_Sub4_Sub2_1.anIntArray152[0], aClass5_Sub1_Sub2_Sub4_Sub2_1.anIntArray151[0], 0, 2, false, 1, 1, 0, 0, local714.anIntArray151[0], local714.anIntArray152[0]);
								this.anInt1003 = super.anInt824;
								this.anInt1004 = super.anInt825;
								this.anInt1006 = 2;
								this.anInt1005 = 0;
								this.aClass5_Sub1_Sub4_9.method229(108);
								this.aClass5_Sub1_Sub4_9.method265(local33);
							}
						}
						if (local28 == 1545) {
							anInt937++;
							if (anInt937 >= 139) {
								this.aClass5_Sub1_Sub4_9.method229(206);
								this.aClass5_Sub1_Sub4_9.method231(52426);
								anInt937 = 0;
							}
							this.method607(local23, local18, local33);
							this.aClass5_Sub1_Sub4_9.method229(172);
							this.aClass5_Sub1_Sub4_9.method264(local23 + this.anInt874);
							this.aClass5_Sub1_Sub4_9.method265(local33 >> 14 & 0x7FFF);
							this.aClass5_Sub1_Sub4_9.method231(local18 + this.anInt873);
						}
						if (local28 == 99) {
							this.aClass5_Sub1_Sub4_9.method229(191);
							this.aClass5_Sub1_Sub4_9.method265(local33);
							this.aClass5_Sub1_Sub4_9.method264(local18);
							this.aClass5_Sub1_Sub4_9.method231(local23);
							this.anInt1009 = 0;
							this.anInt1010 = local23;
							this.anInt1011 = local18;
							this.anInt1012 = 2;
							if (Class36.method388(local23).anInt575 == this.anInt949) {
								this.anInt1012 = 1;
							}
							if (Class36.method388(local23).anInt575 == this.anInt931) {
								this.anInt1012 = 3;
							}
						}
						if (local28 == 74) {
							this.method607(local23, local18, local33);
							this.aClass5_Sub1_Sub4_9.method229(133);
							this.aClass5_Sub1_Sub4_9.method265(local23 + this.anInt874);
							this.aClass5_Sub1_Sub4_9.method264(local18 + this.anInt873);
							this.aClass5_Sub1_Sub4_9.method264(local33 >> 14 & 0x7FFF);
						}
						@Pc(1167) Class18 local1167;
						if (local28 == 1642) {
							local1167 = Class18.method117(local33);
							if (local1167.aByteArray9 == null) {
								local499 = "It's a " + local1167.aString2 + ".";
							} else {
								local499 = new String(local1167.aByteArray9);
							}
							this.method720(0, "", local499);
						}
						if (local28 == 92) {
							this.aClass5_Sub1_Sub4_9.method229(42);
							this.aClass5_Sub1_Sub4_9.method231(local33);
							this.aClass5_Sub1_Sub4_9.method265(local23);
							this.aClass5_Sub1_Sub4_9.method266(local18);
							this.anInt1009 = 0;
							this.anInt1010 = local23;
							this.anInt1011 = local18;
							this.anInt1012 = 2;
							if (Class36.method388(local23).anInt575 == this.anInt949) {
								this.anInt1012 = 1;
							}
							if (Class36.method388(local23).anInt575 == this.anInt931) {
								this.anInt1012 = 3;
							}
						}
						if (local28 == 773) {
							local163 = this.aClass5_Sub1_Sub2_Sub4_Sub1Array1[local33];
							if (local163 != null) {
								this.method586(aClass5_Sub1_Sub2_Sub4_Sub2_1.anIntArray152[0], aClass5_Sub1_Sub2_Sub4_Sub2_1.anIntArray151[0], 0, 2, false, 1, 1, 0, 0, local163.anIntArray151[0], local163.anIntArray152[0]);
								this.anInt1003 = super.anInt824;
								this.anInt1004 = super.anInt825;
								this.anInt1006 = 2;
								this.anInt1005 = 0;
								if ((local33 & 0x3) == 0) {
									anInt992++;
								}
								if (anInt992 >= 113) {
									this.aClass5_Sub1_Sub4_9.method229(193);
									this.aClass5_Sub1_Sub4_9.method230(61);
									anInt992 = 0;
								}
								this.aClass5_Sub1_Sub4_9.method229(254);
								this.aClass5_Sub1_Sub4_9.method264(local33);
							}
						}
						if (local28 == 1630) {
							local1167 = Class18.method117(local33);
							@Pc(1339) Class36 local1339 = Class36.method388(local23);
							if (local1339 != null && local1339.anIntArray166[local18] >= 100000) {
								local499 = local1339.anIntArray166[local18] + " x " + local1167.aString2;
							} else if (local1167.aByteArray9 == null) {
								local499 = "It's a " + local1167.aString2 + ".";
							} else {
								local499 = new String(local1167.aByteArray9);
							}
							this.method720(0, "", local499);
						}
						if (local28 == 684) {
							this.method723(this.anInt1015);
							this.anInt1015 = -1;
							this.aBoolean237 = true;
						}
						if (local28 == 1825) {
							local163 = this.aClass5_Sub1_Sub2_Sub4_Sub1Array1[local33];
							if (local163 != null) {
								@Pc(1419) Class49 local1419 = local163.aClass49_1;
								if (local1419.anIntArray197 != null) {
									local1419 = local1419.method534();
								}
								if (local1419 != null) {
									if (local1419.aByteArray20 == null) {
										local514 = "It's a " + local1419.aString16 + ".";
									} else {
										local514 = new String(local1419.aByteArray20);
									}
									this.method720(0, "", local514);
								}
							}
						}
						if (local28 == 611 && this.method607(local23, local18, local33)) {
							this.aClass5_Sub1_Sub4_9.method229(177);
							this.aClass5_Sub1_Sub4_9.method266(local18 + this.anInt873);
							this.aClass5_Sub1_Sub4_9.method266(this.anInt959);
							this.aClass5_Sub1_Sub4_9.method231(local33 >> 14 & 0x7FFF);
							this.aClass5_Sub1_Sub4_9.method266(this.anInt960);
							this.aClass5_Sub1_Sub4_9.method264(this.anInt958);
							this.aClass5_Sub1_Sub4_9.method265(local23 + this.anInt874);
						}
						if (local28 == 982) {
							anInt1059 += local23;
							if (anInt1059 >= 137) {
								this.aClass5_Sub1_Sub4_9.method229(181);
								this.aClass5_Sub1_Sub4_9.method231(27064);
								anInt1059 = 0;
							}
							this.method607(local23, local18, local33);
							this.aClass5_Sub1_Sub4_9.method229(126);
							this.aClass5_Sub1_Sub4_9.method231(local18 + this.anInt873);
							this.aClass5_Sub1_Sub4_9.method231(local33 >> 14 & 0x7FFF);
							this.aClass5_Sub1_Sub4_9.method265(local23 + this.anInt874);
						}
						if (local28 == 840) {
							this.aClass5_Sub1_Sub4_9.method229(249);
							this.aClass5_Sub1_Sub4_9.method231(local23);
							this.aClass5_Sub1_Sub4_9.method231(local33);
							this.aClass5_Sub1_Sub4_9.method231(local18);
							this.anInt1009 = 0;
							this.anInt1010 = local23;
							this.anInt1011 = local18;
							this.anInt1012 = 2;
							if (Class36.method388(local23).anInt575 == this.anInt949) {
								this.anInt1012 = 1;
							}
							if (Class36.method388(local23).anInt575 == this.anInt931) {
								this.anInt1012 = 3;
							}
						}
						if (local28 == 517) {
							local714 = this.aClass5_Sub1_Sub2_Sub4_Sub2Array1[local33];
							if (local714 != null) {
								this.method586(aClass5_Sub1_Sub2_Sub4_Sub2_1.anIntArray152[0], aClass5_Sub1_Sub2_Sub4_Sub2_1.anIntArray151[0], 0, 2, false, 1, 1, 0, 0, local714.anIntArray151[0], local714.anIntArray152[0]);
								this.anInt1003 = super.anInt824;
								this.anInt1004 = super.anInt825;
								this.anInt1006 = 2;
								this.anInt1005 = 0;
								this.aClass5_Sub1_Sub4_9.method229(18);
								this.aClass5_Sub1_Sub4_9.method266(this.anInt959);
								this.aClass5_Sub1_Sub4_9.method264(this.anInt960);
								this.aClass5_Sub1_Sub4_9.method266(local33);
								this.aClass5_Sub1_Sub4_9.method264(this.anInt958);
							}
						}
						if (local28 == 838) {
							local65 = this.method586(aClass5_Sub1_Sub2_Sub4_Sub2_1.anIntArray152[0], aClass5_Sub1_Sub2_Sub4_Sub2_1.anIntArray151[0], 0, 2, false, 0, 0, 0, 0, local18, local23);
							if (!local65) {
								this.method586(aClass5_Sub1_Sub2_Sub4_Sub2_1.anIntArray152[0], aClass5_Sub1_Sub2_Sub4_Sub2_1.anIntArray151[0], 0, 2, false, 1, 1, 0, 0, local18, local23);
							}
							this.anInt1003 = super.anInt824;
							this.anInt1004 = super.anInt825;
							this.anInt1006 = 2;
							this.anInt1005 = 0;
							this.aClass5_Sub1_Sub4_9.method229(162);
							this.aClass5_Sub1_Sub4_9.method231(local23 + this.anInt874);
							this.aClass5_Sub1_Sub4_9.method265(local33);
							this.aClass5_Sub1_Sub4_9.method265(local18 + this.anInt873);
						}
						if (local28 == 775) {
							local65 = this.method586(aClass5_Sub1_Sub2_Sub4_Sub2_1.anIntArray152[0], aClass5_Sub1_Sub2_Sub4_Sub2_1.anIntArray151[0], 0, 2, false, 0, 0, 0, 0, local18, local23);
							if (!local65) {
								this.method586(aClass5_Sub1_Sub2_Sub4_Sub2_1.anIntArray152[0], aClass5_Sub1_Sub2_Sub4_Sub2_1.anIntArray151[0], 0, 2, false, 1, 1, 0, 0, local18, local23);
							}
							this.anInt1003 = super.anInt824;
							this.anInt1004 = super.anInt825;
							this.anInt1006 = 2;
							this.anInt1005 = 0;
							this.aClass5_Sub1_Sub4_9.method229(60);
							this.aClass5_Sub1_Sub4_9.method265(local23 + this.anInt874);
							this.aClass5_Sub1_Sub4_9.method264(local33);
							this.aClass5_Sub1_Sub4_9.method264(local18 + this.anInt873);
						}
						if (local28 == 300) {
							this.aClass5_Sub1_Sub4_9.method229(241);
							this.aClass5_Sub1_Sub4_9.method265(local33);
							this.aClass5_Sub1_Sub4_9.method266(local23);
							this.aClass5_Sub1_Sub4_9.method266(local18);
							this.anInt1009 = 0;
							this.anInt1010 = local23;
							this.anInt1011 = local18;
							this.anInt1012 = 2;
							if (Class36.method388(local23).anInt575 == this.anInt949) {
								this.anInt1012 = 1;
							}
							if (Class36.method388(local23).anInt575 == this.anInt931) {
								this.anInt1012 = 3;
							}
						}
						if (local28 == 124) {
							if (this.aBoolean240) {
								this.aClass46_1.method519(local23 - 4, local18 - 4);
							} else {
								this.aClass46_1.method519(super.anInt825 - 4, super.anInt824 - 4);
							}
						}
						if (local28 == 849) {
							this.aClass5_Sub1_Sub4_9.method229(229);
							this.aClass5_Sub1_Sub4_9.method266(local23);
							this.aClass5_Sub1_Sub4_9.method231(local18);
							this.aClass5_Sub1_Sub4_9.method266(local33);
							this.anInt1009 = 0;
							this.anInt1010 = local23;
							this.anInt1011 = local18;
							this.anInt1012 = 2;
							if (Class36.method388(local23).anInt575 == this.anInt949) {
								this.anInt1012 = 1;
							}
							if (Class36.method388(local23).anInt575 == this.anInt931) {
								this.anInt1012 = 3;
							}
						}
						if (local28 == 738) {
							local714 = this.aClass5_Sub1_Sub2_Sub4_Sub2Array1[local33];
							if (local714 != null) {
								this.method586(aClass5_Sub1_Sub2_Sub4_Sub2_1.anIntArray152[0], aClass5_Sub1_Sub2_Sub4_Sub2_1.anIntArray151[0], 0, 2, false, 1, 1, 0, 0, local714.anIntArray151[0], local714.anIntArray152[0]);
								this.anInt1003 = super.anInt824;
								this.anInt1004 = super.anInt825;
								this.anInt1006 = 2;
								this.anInt1005 = 0;
								this.aClass5_Sub1_Sub4_9.method229(51);
								this.aClass5_Sub1_Sub4_9.method265(local33);
							}
						}
						if (local28 == 167) {
							local65 = this.method586(aClass5_Sub1_Sub2_Sub4_Sub2_1.anIntArray152[0], aClass5_Sub1_Sub2_Sub4_Sub2_1.anIntArray151[0], 0, 2, false, 0, 0, 0, 0, local18, local23);
							if (!local65) {
								this.method586(aClass5_Sub1_Sub2_Sub4_Sub2_1.anIntArray152[0], aClass5_Sub1_Sub2_Sub4_Sub2_1.anIntArray151[0], 0, 2, false, 1, 1, 0, 0, local18, local23);
							}
							this.anInt1003 = super.anInt824;
							this.anInt1004 = super.anInt825;
							this.anInt1006 = 2;
							this.anInt1005 = 0;
							anInt1054++;
							if (anInt1054 >= 142) {
								this.aClass5_Sub1_Sub4_9.method229(5);
								anInt1054 = 0;
							}
							this.aClass5_Sub1_Sub4_9.method229(146);
							this.aClass5_Sub1_Sub4_9.method231(local23 + this.anInt874);
							this.aClass5_Sub1_Sub4_9.method231(local18 + this.anInt873);
							this.aClass5_Sub1_Sub4_9.method266(local33);
						}
						@Pc(2202) int local2202;
						if (local28 == 117 || local28 == 264) {
							local305 = this.aStringArray10[arg1];
							local253 = local305.indexOf("@whi@");
							if (local253 != -1) {
								local305 = local305.substring(local253 + 5).trim();
								local514 = Class28.method195(Class28.method192((byte) 7, Class28.method191(local305)));
								@Pc(2200) boolean local2200 = false;
								for (local2202 = 0; local2202 < this.anInt984; local2202++) {
									@Pc(2212) Class5_Sub1_Sub2_Sub4_Sub2 local2212 = this.aClass5_Sub1_Sub2_Sub4_Sub2Array1[this.anIntArray253[local2202]];
									if (local2212 != null && local2212.aString8 != null && local2212.aString8.equalsIgnoreCase(local514)) {
										this.method586(aClass5_Sub1_Sub2_Sub4_Sub2_1.anIntArray152[0], aClass5_Sub1_Sub2_Sub4_Sub2_1.anIntArray151[0], 0, 2, false, 1, 1, 0, 0, local2212.anIntArray151[0], local2212.anIntArray152[0]);
										if (local28 == 117) {
											this.aClass5_Sub1_Sub4_9.method229(204);
											this.aClass5_Sub1_Sub4_9.method265(this.anIntArray253[local2202]);
										}
										if (local28 == 264) {
											this.aClass5_Sub1_Sub4_9.method229(82);
											this.aClass5_Sub1_Sub4_9.method266(this.anIntArray253[local2202]);
										}
										local2200 = true;
										break;
									}
								}
								if (!local2200) {
									this.method720(0, "", "Unable to find " + local514);
								}
							}
						}
						if (local28 == 713) {
							local305 = this.aStringArray10[arg1];
							local253 = local305.indexOf("@whi@");
							if (local253 != -1) {
								local922 = Class28.method191(local305.substring(local253 + 5).trim());
								local2202 = -1;
								for (@Pc(2331) int local2331 = 0; local2331 < this.anInt840; local2331++) {
									if (this.aLongArray4[local2331] == local922) {
										local2202 = local2331;
										break;
									}
								}
								if (local2202 != -1 && this.anIntArray240[local2202] > 0) {
									this.aBoolean237 = true;
									this.anInt884 = 0;
									this.aBoolean217 = true;
									this.aString27 = "";
									this.anInt1008 = 3;
									this.aLong33 = this.aLongArray4[local2202];
									this.aString25 = "Enter message to send to " + this.aStringArray12[local2202];
								}
							}
						}
						if (local28 == 994) {
							local163 = this.aClass5_Sub1_Sub2_Sub4_Sub1Array1[local33];
							if (local163 != null) {
								this.method586(aClass5_Sub1_Sub2_Sub4_Sub2_1.anIntArray152[0], aClass5_Sub1_Sub2_Sub4_Sub2_1.anIntArray151[0], 0, 2, false, 1, 1, 0, 0, local163.anIntArray151[0], local163.anIntArray152[0]);
								this.anInt1003 = super.anInt824;
								this.anInt1004 = super.anInt825;
								this.anInt1006 = 2;
								this.anInt1005 = 0;
								this.aClass5_Sub1_Sub4_9.method229(80);
								this.aClass5_Sub1_Sub4_9.method265(local33);
							}
						}
						if (local28 == 341) {
							local65 = this.method586(aClass5_Sub1_Sub2_Sub4_Sub2_1.anIntArray152[0], aClass5_Sub1_Sub2_Sub4_Sub2_1.anIntArray151[0], 0, 2, false, 0, 0, 0, 0, local18, local23);
							if (!local65) {
								this.method586(aClass5_Sub1_Sub2_Sub4_Sub2_1.anIntArray152[0], aClass5_Sub1_Sub2_Sub4_Sub2_1.anIntArray151[0], 0, 2, false, 1, 1, 0, 0, local18, local23);
							}
							this.anInt1003 = super.anInt824;
							this.anInt1004 = super.anInt825;
							this.anInt1006 = 2;
							this.anInt1005 = 0;
							this.aClass5_Sub1_Sub4_9.method229(20);
							this.aClass5_Sub1_Sub4_9.method264(local33);
							this.aClass5_Sub1_Sub4_9.method265(local23 + this.anInt874);
							this.aClass5_Sub1_Sub4_9.method265(this.anInt960);
							this.aClass5_Sub1_Sub4_9.method266(this.anInt959);
							this.aClass5_Sub1_Sub4_9.method231(this.anInt958);
							this.aClass5_Sub1_Sub4_9.method266(local18 + this.anInt873);
						}
						if (local28 == 357) {
							this.aClass5_Sub1_Sub4_9.method229(50);
							this.aClass5_Sub1_Sub4_9.method265(local18);
							this.aClass5_Sub1_Sub4_9.method231(local23);
							this.aClass5_Sub1_Sub4_9.method266(local33);
							this.anInt1009 = 0;
							this.anInt1010 = local23;
							this.anInt1011 = local18;
							this.anInt1012 = 2;
							if (Class36.method388(local23).anInt575 == this.anInt949) {
								this.anInt1012 = 1;
							}
							if (Class36.method388(local23).anInt575 == this.anInt931) {
								this.anInt1012 = 3;
							}
						}
						if (local28 == 600) {
							anInt910 += local18;
							if (anInt910 >= 55) {
								this.aClass5_Sub1_Sub4_9.method229(122);
								this.aClass5_Sub1_Sub4_9.method234(0);
								anInt910 = 0;
							}
							this.aClass5_Sub1_Sub4_9.method229(168);
							this.aClass5_Sub1_Sub4_9.method231(local18);
							this.aClass5_Sub1_Sub4_9.method266(local23);
							this.aClass5_Sub1_Sub4_9.method264(local33);
							this.anInt1009 = 0;
							this.anInt1010 = local23;
							this.anInt1011 = local18;
							this.anInt1012 = 2;
							if (Class36.method388(local23).anInt575 == this.anInt949) {
								this.anInt1012 = 1;
							}
							if (Class36.method388(local23).anInt575 == this.anInt931) {
								this.anInt1012 = 3;
							}
						}
						if (local28 == 234 && this.method607(local23, local18, local33)) {
							this.aClass5_Sub1_Sub4_9.method229(179);
							this.aClass5_Sub1_Sub4_9.method266(local33 >> 14 & 0x7FFF);
							this.aClass5_Sub1_Sub4_9.method231(local18 + this.anInt873);
							this.aClass5_Sub1_Sub4_9.method266(local23 + this.anInt874);
							this.aClass5_Sub1_Sub4_9.method231(this.anInt1048);
						}
						if (local28 == 194) {
							anInt950 += local18;
							if (anInt950 >= 51) {
								this.aClass5_Sub1_Sub4_9.method229(234);
								this.aClass5_Sub1_Sub4_9.method231(61426);
								anInt950 = 0;
							}
							this.aClass5_Sub1_Sub4_9.method229(10);
							this.aClass5_Sub1_Sub4_9.method231(local33);
							this.aClass5_Sub1_Sub4_9.method265(local18);
							this.aClass5_Sub1_Sub4_9.method231(local23);
							this.anInt1009 = 0;
							this.anInt1010 = local23;
							this.anInt1011 = local18;
							this.anInt1012 = 2;
							if (Class36.method388(local23).anInt575 == this.anInt949) {
								this.anInt1012 = 1;
							}
							if (Class36.method388(local23).anInt575 == this.anInt931) {
								this.anInt1012 = 3;
							}
						}
						if (local28 == 125) {
							this.method607(local23, local18, local33);
							this.aClass5_Sub1_Sub4_9.method229(22);
							this.aClass5_Sub1_Sub4_9.method231(local33 >> 14 & 0x7FFF);
							this.aClass5_Sub1_Sub4_9.method265(local18 + this.anInt873);
							this.aClass5_Sub1_Sub4_9.method264(local23 + this.anInt874);
						}
						if (local28 == 486) {
							this.aClass5_Sub1_Sub4_9.method229(118);
							this.aClass5_Sub1_Sub4_9.method265(this.anInt960);
							this.aClass5_Sub1_Sub4_9.method264(local33);
							this.aClass5_Sub1_Sub4_9.method265(this.anInt958);
							this.aClass5_Sub1_Sub4_9.method266(local18);
							this.aClass5_Sub1_Sub4_9.method265(this.anInt959);
							this.aClass5_Sub1_Sub4_9.method265(local23);
							this.anInt1009 = 0;
							this.anInt1010 = local23;
							this.anInt1011 = local18;
							this.anInt1012 = 2;
							if (Class36.method388(local23).anInt575 == this.anInt949) {
								this.anInt1012 = 1;
							}
							if (Class36.method388(local23).anInt575 == this.anInt931) {
								this.anInt1012 = 3;
							}
						}
						if (local28 == 771) {
							local714 = this.aClass5_Sub1_Sub2_Sub4_Sub2Array1[local33];
							if (local714 != null) {
								this.method586(aClass5_Sub1_Sub2_Sub4_Sub2_1.anIntArray152[0], aClass5_Sub1_Sub2_Sub4_Sub2_1.anIntArray151[0], 0, 2, false, 1, 1, 0, 0, local714.anIntArray151[0], local714.anIntArray152[0]);
								this.anInt1003 = super.anInt824;
								this.anInt1004 = super.anInt825;
								this.anInt1006 = 2;
								this.anInt1005 = 0;
								this.aClass5_Sub1_Sub4_9.method229(125);
								this.aClass5_Sub1_Sub4_9.method266(local33);
							}
						}
						if (local28 == 196) {
							local163 = this.aClass5_Sub1_Sub2_Sub4_Sub1Array1[local33];
							if (local163 != null) {
								this.method586(aClass5_Sub1_Sub2_Sub4_Sub2_1.anIntArray152[0], aClass5_Sub1_Sub2_Sub4_Sub2_1.anIntArray151[0], 0, 2, false, 1, 1, 0, 0, local163.anIntArray151[0], local163.anIntArray152[0]);
								this.anInt1003 = super.anInt824;
								this.anInt1004 = super.anInt825;
								this.anInt1006 = 2;
								this.anInt1005 = 0;
								this.aClass5_Sub1_Sub4_9.method229(215);
								this.aClass5_Sub1_Sub4_9.method266(local33);
							}
						}
						if (local28 == 597) {
							local163 = this.aClass5_Sub1_Sub2_Sub4_Sub1Array1[local33];
							if (local163 != null) {
								this.method586(aClass5_Sub1_Sub2_Sub4_Sub2_1.anIntArray152[0], aClass5_Sub1_Sub2_Sub4_Sub2_1.anIntArray151[0], 0, 2, false, 1, 1, 0, 0, local163.anIntArray151[0], local163.anIntArray152[0]);
								this.anInt1003 = super.anInt824;
								this.anInt1004 = super.anInt825;
								this.anInt1006 = 2;
								this.anInt1005 = 0;
								if ((local33 & 0x3) == 0) {
									anInt1055++;
								}
								if (anInt1055 >= 123) {
									this.aClass5_Sub1_Sub4_9.method229(84);
									this.aClass5_Sub1_Sub4_9.method231(10442);
									anInt1055 = 0;
								}
								this.aClass5_Sub1_Sub4_9.method229(24);
								this.aClass5_Sub1_Sub4_9.method266(local33);
							}
						}
						if (local28 == 992) {
							local163 = this.aClass5_Sub1_Sub2_Sub4_Sub1Array1[local33];
							if (local163 != null) {
								this.method586(aClass5_Sub1_Sub2_Sub4_Sub2_1.anIntArray152[0], aClass5_Sub1_Sub2_Sub4_Sub2_1.anIntArray151[0], 0, 2, false, 1, 1, 0, 0, local163.anIntArray151[0], local163.anIntArray152[0]);
								this.anInt1003 = super.anInt824;
								this.anInt1004 = super.anInt825;
								this.anInt1006 = 2;
								this.anInt1005 = 0;
								this.aClass5_Sub1_Sub4_9.method229(121);
								this.aClass5_Sub1_Sub4_9.method266(this.anInt958);
								this.aClass5_Sub1_Sub4_9.method264(this.anInt960);
								this.aClass5_Sub1_Sub4_9.method265(this.anInt959);
								this.aClass5_Sub1_Sub4_9.method265(local33);
							}
						}
						if (local28 == 371) {
							this.aClass5_Sub1_Sub4_9.method229(68);
							this.aClass5_Sub1_Sub4_9.method231(local23);
							this.aClass5_Sub1_Sub4_9.method264(local33);
							this.aClass5_Sub1_Sub4_9.method264(local18);
							this.anInt1009 = 0;
							this.anInt1010 = local23;
							this.anInt1011 = local18;
							this.anInt1012 = 2;
							if (Class36.method388(local23).anInt575 == this.anInt949) {
								this.anInt1012 = 1;
							}
							if (Class36.method388(local23).anInt575 == this.anInt931) {
								this.anInt1012 = 3;
							}
						}
						if (local28 == 1634) {
							@Pc(3245) int local3245 = local33 >> 14 & 0x7FFF;
							@Pc(3248) Class26 local3248 = Class26.method179(local3245);
							if (local3248.aByteArray13 == null) {
								local514 = "It's a " + local3248.aString4 + ".";
							} else {
								local514 = new String(local3248.aByteArray13);
							}
							this.method720(0, "", local514);
						}
						if (local28 == 893) {
							local65 = this.method586(aClass5_Sub1_Sub2_Sub4_Sub2_1.anIntArray152[0], aClass5_Sub1_Sub2_Sub4_Sub2_1.anIntArray151[0], 0, 2, false, 0, 0, 0, 0, local18, local23);
							if (!local65) {
								this.method586(aClass5_Sub1_Sub2_Sub4_Sub2_1.anIntArray152[0], aClass5_Sub1_Sub2_Sub4_Sub2_1.anIntArray151[0], 0, 2, false, 1, 1, 0, 0, local18, local23);
							}
							this.anInt1003 = super.anInt824;
							this.anInt1004 = super.anInt825;
							this.anInt1006 = 2;
							this.anInt1005 = 0;
							this.aClass5_Sub1_Sub4_9.method229(27);
							this.aClass5_Sub1_Sub4_9.method266(local23 + this.anInt874);
							this.aClass5_Sub1_Sub4_9.method265(local18 + this.anInt873);
							this.aClass5_Sub1_Sub4_9.method264(local33);
						}
						if (local28 == 41) {
							local714 = this.aClass5_Sub1_Sub2_Sub4_Sub2Array1[local33];
							if (local714 != null) {
								this.method586(aClass5_Sub1_Sub2_Sub4_Sub2_1.anIntArray152[0], aClass5_Sub1_Sub2_Sub4_Sub2_1.anIntArray151[0], 0, 2, false, 1, 1, 0, 0, local714.anIntArray151[0], local714.anIntArray152[0]);
								this.anInt1003 = super.anInt824;
								this.anInt1004 = super.anInt825;
								this.anInt1006 = 2;
								this.anInt1005 = 0;
								this.aClass5_Sub1_Sub4_9.method229(82);
								this.aClass5_Sub1_Sub4_9.method266(local33);
							}
						}
						if (local28 == 218) {
							local163 = this.aClass5_Sub1_Sub2_Sub4_Sub1Array1[local33];
							if (local163 != null) {
								this.method586(aClass5_Sub1_Sub2_Sub4_Sub2_1.anIntArray152[0], aClass5_Sub1_Sub2_Sub4_Sub2_1.anIntArray151[0], 0, 2, false, 1, 1, 0, 0, local163.anIntArray151[0], local163.anIntArray152[0]);
								this.anInt1003 = super.anInt824;
								this.anInt1004 = super.anInt825;
								this.anInt1006 = 2;
								this.anInt1005 = 0;
								if ((local33 & 0x3) == 0) {
									anInt1034++;
								}
								if (anInt1034 >= 147) {
									this.aClass5_Sub1_Sub4_9.method229(89);
									this.aClass5_Sub1_Sub4_9.method233(9802132);
									anInt1034 = 0;
								}
								this.aClass5_Sub1_Sub4_9.method229(173);
								this.aClass5_Sub1_Sub4_9.method266(local33);
							}
						}
						this.anInt957 = 0;
						this.anInt1047 = 0;
						this.aBoolean238 = true;
					}
				}
			}
		} catch (@Pc(3518) RuntimeException local3518) {
			signlink.reporterror("11439, " + arg0 + ", " + arg1 + ", " + local3518.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(JI)V")
	private void method662(@OriginalArg(0) long arg0) {
		try {
			if (this.anInt967 != -29826) {
				this.method578();
			}
			if (arg0 != 0L) {
				if (this.anInt844 >= 100) {
					this.method720(0, "", "Your ignore list is full. Max of 100 hit");
				} else {
					@Pc(29) String local29 = Class28.method195(Class28.method192((byte) 7, arg0));
					for (@Pc(31) int local31 = 0; local31 < this.anInt844; local31++) {
						if (this.aLongArray3[local31] == arg0) {
							this.method720(0, "", local29 + " is already on your ignore list");
							return;
						}
					}
					for (@Pc(61) int local61 = 0; local61 < this.anInt840; local61++) {
						if (this.aLongArray4[local61] == arg0) {
							this.method720(0, "", "Please remove " + local29 + " from your friend list first");
							return;
						}
					}
					this.aLongArray3[this.anInt844++] = arg0;
					this.aBoolean238 = true;
					this.aClass5_Sub1_Sub4_9.method229(218);
					this.aClass5_Sub1_Sub4_9.method236(arg0);
				}
			}
		} catch (@Pc(116) RuntimeException local116) {
			signlink.reporterror("74715, " + arg0 + ", " + -29826 + ", " + local116.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(BI)V")
	private void method663(@OriginalArg(1) int arg0) {
		try {
			if (!aBoolean261) {
				for (@Pc(9) int local9 = 0; local9 < this.anIntArray214.length; local9++) {
					@Pc(16) int local16 = this.anIntArray214[local9];
					if (Class5_Sub1_Sub1_Sub4.anIntArray208[local16] >= arg0) {
						@Pc(25) Class5_Sub1_Sub1_Sub2 local25 = Class5_Sub1_Sub1_Sub4.aClass5_Sub1_Sub1_Sub2Array1[local16];
						@Pc(33) int local33 = local25.anInt626 * local25.anInt627 - 1;
						@Pc(41) int local41 = local25.anInt626 * this.anInt895 * 2;
						@Pc(44) byte[] local44 = local25.aByteArray17;
						@Pc(47) byte[] local47 = this.aByteArray21;
						for (@Pc(49) int local49 = 0; local49 <= local33; local49++) {
							local47[local49] = local44[local49 - local41 & local33];
						}
						local25.aByteArray17 = local47;
						this.aByteArray21 = local44;
						Class5_Sub1_Sub1_Sub4.method563(local16);
					}
				}
			}
		} catch (@Pc(82) RuntimeException local82) {
			signlink.reporterror("33169, " + -54 + ", " + arg0 + ", " + local82.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "s", descriptor = "(Z)V")
	private void method664() {
		try {
			for (@Pc(10) int local10 = -1; local10 < this.anInt984; local10++) {
				@Pc(18) int local18;
				if (local10 == -1) {
					local18 = this.anInt983;
				} else {
					local18 = this.anIntArray253[local10];
				}
				@Pc(30) Class5_Sub1_Sub2_Sub4_Sub2 local30 = this.aClass5_Sub1_Sub2_Sub4_Sub2Array1[local18];
				if (local30 != null) {
					this.method644(313, 1, local30);
				}
			}
			anInt887++;
			if (anInt887 > 194) {
				anInt887 = 0;
				this.aClass5_Sub1_Sub4_9.method229(94);
				this.aClass5_Sub1_Sub4_9.method231(10697);
			}
		} catch (@Pc(62) RuntimeException local62) {
			signlink.reporterror("64046, " + true + ", " + local62.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!PKHWFJLM;II)V")
	private void method665(@OriginalArg(0) Class5_Sub1_Sub4 arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(37) int local37;
			@Pc(40) int local40;
			@Pc(44) int local44;
			@Pc(17) int local17;
			@Pc(21) int local21;
			@Pc(30) int local30;
			if (arg1 == 33) {
				local17 = arg0.method242();
				local21 = arg0.method260();
				local30 = this.anInt846 + (local21 >> 4 & 0x7);
				local37 = this.anInt847 + (local21 & 0x7);
				local40 = arg0.method242();
				local44 = arg0.method269();
				if (local30 >= 0 && local37 >= 0 && local30 < 104 && local37 < 104 && local17 != this.anInt975) {
					@Pc(62) Class5_Sub1_Sub2_Sub3 local62 = new Class5_Sub1_Sub2_Sub3();
					local62.anInt257 = local40;
					local62.anInt256 = local44;
					if (this.aClass41ArrayArrayArray1[this.anInt1052][local30][local37] == null) {
						this.aClass41ArrayArrayArray1[this.anInt1052][local30][local37] = new Class41(0);
					}
					this.aClass41ArrayArrayArray1[this.anInt1052][local30][local37].method465(local62);
					this.method700(local30, local37);
				}
			} else {
				@Pc(146) int local146;
				@Pc(151) int local151;
				@Pc(171) int local171;
				@Pc(197) int local197;
				@Pc(209) int local209;
				@Pc(229) int local229;
				@Pc(183) int local183;
				if (arg1 == 205) {
					local17 = arg0.method260();
					local21 = this.anInt846 + (local17 >> 4 & 0x7);
					local30 = this.anInt847 + (local17 & 0x7);
					local37 = arg0.method269();
					local40 = arg0.method260();
					local44 = local40 >> 2;
					local146 = local40 & 0x3;
					local151 = this.anIntArray218[local44];
					if (local21 >= 0 && local30 >= 0 && local21 < 103 && local30 < 103) {
						local171 = this.anIntArrayArrayArray8[this.anInt1052][local21][local30];
						local183 = this.anIntArrayArrayArray8[this.anInt1052][local21 + 1][local30];
						local197 = this.anIntArrayArrayArray8[this.anInt1052][local21 + 1][local30 + 1];
						local209 = this.anIntArrayArrayArray8[this.anInt1052][local21][local30 + 1];
						if (local151 == 0) {
							@Pc(220) Class1 local220 = this.aClass46_1.method503(local21, this.anInt1052, local30);
							if (local220 != null) {
								local229 = local220.anInt6 >> 14 & 0x7FFF;
								if (local44 == 2) {
									local220.aClass5_Sub1_Sub2_1 = new Class5_Sub1_Sub2_Sub6(local229, local146 + 4, false, local197, 9, local171, local183, 2, local209, local37);
									local220.aClass5_Sub1_Sub2_2 = new Class5_Sub1_Sub2_Sub6(local229, local146 + 1 & 0x3, false, local197, 9, local171, local183, 2, local209, local37);
								} else {
									local220.aClass5_Sub1_Sub2_1 = new Class5_Sub1_Sub2_Sub6(local229, local146, false, local197, 9, local171, local183, local44, local209, local37);
								}
							}
						}
						if (local151 == 1) {
							@Pc(297) Class43 local297 = this.aClass46_1.method504(this.anInt1052, local30, local21);
							if (local297 != null) {
								local297.aClass5_Sub1_Sub2_7 = new Class5_Sub1_Sub2_Sub6(local297.anInt685 >> 14 & 0x7FFF, 0, false, local197, 9, local171, local183, 4, local209, local37);
							}
						}
						if (local151 == 2) {
							@Pc(331) Class44 local331 = this.aClass46_1.method505(this.anInt1052, local21, local30);
							if (local44 == 11) {
								local44 = 10;
							}
							if (local331 != null) {
								local331.aClass5_Sub1_Sub2_8 = new Class5_Sub1_Sub2_Sub6(local331.anInt697 >> 14 & 0x7FFF, local146, false, local197, 9, local171, local183, local44, local209, local37);
							}
						}
						if (local151 == 3) {
							@Pc(370) Class15 local370 = this.aClass46_1.method506(local30, this.anInt1052, local21);
							if (local370 != null) {
								local370.aClass5_Sub1_Sub2_3 = new Class5_Sub1_Sub2_Sub6(local370.anInt161 >> 14 & 0x7FFF, local146, false, local197, 9, local171, local183, 22, local209, local37);
							}
						}
					}
				} else {
					@Pc(452) int local452;
					if (arg1 == 88) {
						@Pc(400) byte local400 = arg0.method262();
						@Pc(403) byte local403 = arg0.method241();
						@Pc(406) byte local406 = arg0.method241();
						local37 = arg0.method242();
						local40 = arg0.method240();
						local44 = this.anInt846 + (local40 >> 4 & 0x7);
						local146 = this.anInt847 + (local40 & 0x7);
						local151 = arg0.method269();
						local171 = arg0.method269();
						@Pc(440) byte local440 = arg0.method263();
						local197 = arg0.method259((byte) 7);
						local209 = local197 >> 2;
						local452 = local197 & 0x3;
						local229 = this.anIntArray218[local209];
						@Pc(460) int local460 = arg0.method242();
						@Pc(466) Class5_Sub1_Sub2_Sub4_Sub2 local466;
						if (local37 == this.anInt975) {
							local466 = aClass5_Sub1_Sub2_Sub4_Sub2_1;
						} else {
							local466 = this.aClass5_Sub1_Sub2_Sub4_Sub2Array1[local37];
						}
						if (local466 != null) {
							@Pc(478) Class26 local478 = Class26.method179(local171);
							@Pc(488) int local488 = this.anIntArrayArrayArray8[this.anInt1052][local44][local146];
							@Pc(500) int local500 = this.anIntArrayArrayArray8[this.anInt1052][local44 + 1][local146];
							@Pc(514) int local514 = this.anIntArrayArrayArray8[this.anInt1052][local44 + 1][local146 + 1];
							@Pc(526) int local526 = this.anIntArrayArrayArray8[this.anInt1052][local44][local146 + 1];
							@Pc(536) Class5_Sub1_Sub2_Sub5 local536 = local478.method184(local209, local452, local488, local500, local514, local526, -1);
							if (local536 != null) {
								this.method686(local229, local146, local151 + 1, 0, local44, local460 + 1, this.anInt1052, -1, 0);
								local466.anInt542 = local151 + anInt1018;
								local466.anInt543 = local460 + anInt1018;
								local466.aClass5_Sub1_Sub2_Sub5_2 = local536;
								@Pc(571) int local571 = local478.anInt269;
								@Pc(574) int local574 = local478.anInt265;
								if (local452 == 1 || local452 == 3) {
									local571 = local478.anInt265;
									local574 = local478.anInt269;
								}
								local466.anInt553 = local44 * 128 + local571 * 64;
								local466.anInt555 = local146 * 128 + local574 * 64;
								local466.anInt554 = this.method594(this.anInt1052, local466.anInt553, this.anInt867, local466.anInt555);
								@Pc(621) byte local621;
								if (local440 > local403) {
									local621 = local440;
									local440 = local403;
									local403 = local621;
								}
								if (local400 > local406) {
									local621 = local400;
									local400 = local406;
									local406 = local621;
								}
								local466.anInt547 = local44 + local440;
								local466.anInt549 = local44 + local403;
								local466.anInt548 = local146 + local400;
								local466.anInt550 = local146 + local406;
							}
						}
					}
					if (arg1 == 140) {
						local17 = arg0.method260();
						local21 = this.anInt846 + (local17 >> 4 & 0x7);
						local30 = this.anInt847 + (local17 & 0x7);
						local37 = arg0.method261();
						local40 = local37 >> 2;
						local44 = local37 & 0x3;
						local146 = this.anIntArray218[local40];
						if (local21 >= 0 && local30 >= 0 && local21 < 104 && local30 < 104) {
							this.method686(local146, local30, 0, local40, local21, -1, this.anInt1052, -1, local44);
						}
					} else {
						@Pc(771) Class5_Sub1_Sub2_Sub3 local771;
						if (arg1 == 7) {
							local17 = arg0.method260();
							local21 = this.anInt846 + (local17 >> 4 & 0x7);
							local30 = this.anInt847 + (local17 & 0x7);
							local37 = arg0.method268((byte) 5);
							if (local21 >= 0 && local30 >= 0 && local21 < 104 && local30 < 104) {
								@Pc(765) Class41 local765 = this.aClass41ArrayArrayArray1[this.anInt1052][local21][local30];
								if (local765 != null) {
									for (local771 = (Class5_Sub1_Sub2_Sub3) local765.method468(); local771 != null; local771 = (Class5_Sub1_Sub2_Sub3) local765.method470()) {
										if (local771.anInt257 == (local37 & 0x7FFF)) {
											local771.method542();
											break;
										}
									}
									if (local765.method468() == null) {
										this.aClass41ArrayArrayArray1[this.anInt1052][local21][local30] = null;
									}
									this.method700(local21, local30);
								}
							}
						} else if (arg1 == 224) {
							local17 = arg0.method240();
							local21 = this.anInt846 + (local17 >> 4 & 0x7);
							local30 = this.anInt847 + (local17 & 0x7);
							local37 = local21 + arg0.method241();
							local40 = local30 + arg0.method241();
							local44 = arg0.method243();
							local146 = arg0.method242();
							local151 = arg0.method240() * 4;
							local171 = arg0.method240() * 4;
							local183 = arg0.method242();
							local197 = arg0.method242();
							local209 = arg0.method240();
							local452 = arg0.method240();
							if (local21 >= 0 && local30 >= 0 && local21 < 104 && local30 < 104 && local37 >= 0 && local40 >= 0 && local37 < 104 && local40 < 104 && local146 != 65535) {
								local21 = local21 * 128 + 64;
								local30 = local30 * 128 + 64;
								local37 = local37 * 128 + 64;
								local40 = local40 * 128 + 64;
								@Pc(945) Class5_Sub1_Sub2_Sub2 local945 = new Class5_Sub1_Sub2_Sub2(local30, local209, local171, this.method594(this.anInt1052, local21, this.anInt867, local30) - local151, local21, local452, local183 + anInt1018, local146, true, this.anInt1052, local44, local197 + anInt1018);
								local945.method138(local37, local40, local183 + anInt1018, this.method594(this.anInt1052, local37, this.anInt867, local40) - local171);
								this.aClass41_12.method465(local945);
							}
						} else if (arg1 == 154) {
							local17 = arg0.method240();
							local21 = this.anInt846 + (local17 >> 4 & 0x7);
							local30 = this.anInt847 + (local17 & 0x7);
							local37 = arg0.method242();
							local40 = arg0.method242();
							local44 = arg0.method242();
							if (local21 >= 0 && local30 >= 0 && local21 < 104 && local30 < 104) {
								@Pc(1019) Class41 local1019 = this.aClass41ArrayArrayArray1[this.anInt1052][local21][local30];
								if (local1019 != null) {
									for (@Pc(1025) Class5_Sub1_Sub2_Sub3 local1025 = (Class5_Sub1_Sub2_Sub3) local1019.method468(); local1025 != null; local1025 = (Class5_Sub1_Sub2_Sub3) local1019.method470()) {
										if (local1025.anInt257 == (local37 & 0x7FFF) && local1025.anInt256 == local40) {
											local1025.anInt256 = local44;
											break;
										}
									}
									this.method700(local21, local30);
								}
							}
						} else {
							if (arg1 == 116) {
								local17 = arg0.method240();
								local21 = this.anInt846 + (local17 >> 4 & 0x7);
								local30 = this.anInt847 + (local17 & 0x7);
								local37 = arg0.method242();
								local40 = arg0.method240();
								local44 = local40 >> 4 & 0xF;
								local146 = local40 & 0x7;
								if (aClass5_Sub1_Sub2_Sub4_Sub2_1.anIntArray151[0] >= local21 - local44 && aClass5_Sub1_Sub2_Sub4_Sub2_1.anIntArray151[0] <= local21 + local44 && aClass5_Sub1_Sub2_Sub4_Sub2_1.anIntArray152[0] >= local30 - local44 && aClass5_Sub1_Sub2_Sub4_Sub2_1.anIntArray152[0] <= local30 + local44 && this.aBoolean251 && !aBoolean261 && this.anInt848 < 50) {
									this.anIntArray221[this.anInt848] = local37;
									this.anIntArray261[this.anInt848] = local146;
									this.anIntArray266[this.anInt848] = Class30.anIntArray89[local37];
									this.anInt848++;
								}
							}
							if (arg1 == 145) {
								local17 = arg0.method242();
								local21 = arg0.method240();
								local30 = this.anInt846 + (local21 >> 4 & 0x7);
								local37 = this.anInt847 + (local21 & 0x7);
								local40 = arg0.method242();
								if (local30 >= 0 && local37 >= 0 && local30 < 104 && local37 < 104) {
									local771 = new Class5_Sub1_Sub2_Sub3();
									local771.anInt257 = local17;
									local771.anInt256 = local40;
									if (this.aClass41ArrayArrayArray1[this.anInt1052][local30][local37] == null) {
										this.aClass41ArrayArrayArray1[this.anInt1052][local30][local37] = new Class41(0);
									}
									this.aClass41ArrayArrayArray1[this.anInt1052][local30][local37].method465(local771);
									this.method700(local30, local37);
								}
							} else if (arg1 == 20) {
								local17 = arg0.method269();
								local21 = arg0.method261();
								local30 = this.anInt846 + (local21 >> 4 & 0x7);
								local37 = this.anInt847 + (local21 & 0x7);
								local40 = arg0.method260();
								local44 = local40 >> 2;
								local146 = local40 & 0x3;
								local151 = this.anIntArray218[local44];
								if (local30 >= 0 && local37 >= 0 && local30 < 104 && local37 < 104) {
									this.method686(local151, local37, 0, local44, local30, -1, this.anInt1052, local17, local146);
								}
							} else if (arg1 == 243) {
								local17 = arg0.method240();
								local21 = this.anInt846 + (local17 >> 4 & 0x7);
								local30 = this.anInt847 + (local17 & 0x7);
								local37 = arg0.method242();
								local40 = arg0.method240();
								local44 = arg0.method242();
								if (local21 >= 0 && local30 >= 0 && local21 < 104 && local30 < 104) {
									local21 = local21 * 128 + 64;
									local30 = local30 * 128 + 64;
									@Pc(1389) Class5_Sub1_Sub2_Sub1 local1389 = new Class5_Sub1_Sub2_Sub1(local44, local37, local30, 0, this.method594(this.anInt1052, local21, this.anInt867, local30) - local40, anInt1018, local21, this.anInt1052);
									this.aClass41_11.method465(local1389);
								}
							}
						}
					}
				}
			}
		} catch (@Pc(1395) RuntimeException local1395) {
			signlink.reporterror("59938, " + arg0 + ", " + arg1 + ", " + 23254 + ", " + local1395.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILclient!PKHWFJLM;I)V")
	private void method666(@OriginalArg(1) Class5_Sub1_Sub4 arg0, @OriginalArg(2) int arg1) {
		try {
			arg0.method250();
			@Pc(12) int local12 = arg0.method251(1);
			if (local12 != 0) {
				@Pc(20) int local20 = arg0.method251(2);
				if (local20 == 0) {
					this.anIntArray254[this.anInt985++] = this.anInt983;
				} else {
					@Pc(43) int local43;
					@Pc(53) int local53;
					if (local20 == 1) {
						local43 = arg0.method251(3);
						aClass5_Sub1_Sub2_Sub4_Sub2_1.method375(false, local43);
						local53 = arg0.method251(1);
						if (local53 == 1) {
							this.anIntArray254[this.anInt985++] = this.anInt983;
						}
					} else {
						@Pc(97) int local97;
						if (local20 == 2) {
							local43 = arg0.method251(3);
							aClass5_Sub1_Sub2_Sub4_Sub2_1.method375(true, local43);
							local53 = arg0.method251(3);
							aClass5_Sub1_Sub2_Sub4_Sub2_1.method375(true, local53);
							local97 = arg0.method251(1);
							if (local97 == 1) {
								this.anIntArray254[this.anInt985++] = this.anInt983;
							}
						} else if (local20 == 3) {
							local43 = arg0.method251(7);
							local53 = arg0.method251(1);
							local97 = arg0.method251(7);
							@Pc(136) int local136 = arg0.method251(1);
							if (local136 == 1) {
								this.anIntArray254[this.anInt985++] = this.anInt983;
							}
							this.anInt1052 = arg0.method251(2);
							aClass5_Sub1_Sub2_Sub4_Sub2_1.method373(local97, local43, local53 == 1);
						}
					}
				}
			}
		} catch (@Pc(170) RuntimeException local170) {
			signlink.reporterror("55483, " + 2 + ", " + arg0 + ", " + arg1 + ", " + local170.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(III)Z")
	private boolean method667(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(10) boolean local10 = false;
			@Pc(13) Class36 local13 = Class36.method388(arg0);
			for (@Pc(15) int local15 = 0; local15 < local13.anIntArray165.length && local13.anIntArray165[local15] != -1; local15++) {
				@Pc(29) Class36 local29 = Class36.method388(local13.anIntArray165[local15]);
				if (local29.anInt595 == 1) {
					local10 |= this.method667(local29.anInt585, arg1);
				}
				@Pc(64) int local64;
				if (local29.anInt595 == 6 && (local29.anInt573 != -1 || local29.anInt574 != -1)) {
					@Pc(59) boolean local59 = this.method619(local29);
					if (local59) {
						local64 = local29.anInt574;
					} else {
						local64 = local29.anInt573;
					}
					if (local64 != -1) {
						@Pc(76) Class11 local76 = Class11.aClass11Array1[local64];
						local29.anInt572 += arg1;
						while (local29.anInt572 > local76.method96(local29.anInt601)) {
							local29.anInt572 -= local76.method96(local29.anInt601) + 1;
							local29.anInt601++;
							if (local29.anInt601 >= local76.anInt103) {
								local29.anInt601 -= local76.anInt104;
								if (local29.anInt601 < 0 || local29.anInt601 >= local76.anInt103) {
									local29.anInt601 = 0;
								}
							}
							local10 = true;
						}
					}
				}
				if (local29.anInt595 == 6 && local29.anInt607 != 0) {
					@Pc(147) int local147 = local29.anInt607 >> 16;
					local64 = local29.anInt607 << 16 >> 16;
					@Pc(158) int local158 = local147 * arg1;
					local64 *= arg1;
					local29.anInt587 = local29.anInt587 + local158 & 0x7FF;
					local29.anInt588 = local29.anInt588 + local64 & 0x7FF;
					local10 = true;
				}
			}
			return local10;
		} catch (@Pc(189) RuntimeException local189) {
			signlink.reporterror("65338, " + arg0 + ", " + arg1 + ", " + -30268 + ", " + local189.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "f", descriptor = "(B)V")
	private void method668() {
		try {
			@Pc(32) int local32;
			@Pc(117) int local117;
			@Pc(121) int local121;
			@Pc(125) int local125;
			@Pc(173) int local173;
			@Pc(187) int local187;
			@Pc(199) int local199;
			@Pc(258) int local258;
			try {
				this.anInt1002 = -1;
				this.aClass41_11.method472();
				this.aClass41_12.method472();
				anInt912++;
				if (anInt912 > 1003) {
					anInt912 = 0;
					this.aClass5_Sub1_Sub4_9.method229(90);
					this.aClass5_Sub1_Sub4_9.method230(0);
					local32 = this.aClass5_Sub1_Sub4_9.anInt429;
					this.aClass5_Sub1_Sub4_9.method231(64998);
					this.aClass5_Sub1_Sub4_9.method230(213);
					this.aClass5_Sub1_Sub4_9.method230(167);
					this.aClass5_Sub1_Sub4_9.method230(250);
					this.aClass5_Sub1_Sub4_9.method230(224);
					this.aClass5_Sub1_Sub4_9.method230((int) (Math.random() * 256.0D));
					this.aClass5_Sub1_Sub4_9.method230((int) (Math.random() * 256.0D));
					this.aClass5_Sub1_Sub4_9.method230(128);
					this.aClass5_Sub1_Sub4_9.method230(50);
					if ((int) (Math.random() * 2.0D) == 0) {
						this.aClass5_Sub1_Sub4_9.method230(192);
					}
					this.aClass5_Sub1_Sub4_9.method239(this.aClass5_Sub1_Sub4_9.anInt429 - local32);
				}
				Class5_Sub1_Sub1_Sub4.method559();
				this.method683((byte) 5);
				this.aClass46_1.method481();
				System.gc();
				for (local32 = 0; local32 < 4; local32++) {
					this.aClass37Array1[local32].method424();
				}
				for (local117 = 0; local117 < 4; local117++) {
					for (local121 = 0; local121 < 104; local121++) {
						for (local125 = 0; local125 < 104; local125++) {
							this.aByteArrayArrayArray8[local117][local121][local125] = 0;
						}
					}
				}
				@Pc(159) Class8 local159 = new Class8(this.anIntArrayArrayArray8, this.aByteArrayArrayArray8, 104, 1, 104);
				local125 = this.aByteArrayArray5.length;
				this.aClass5_Sub1_Sub4_9.method229(30);
				@Pc(320) int local320;
				@Pc(308) int local308;
				if (!this.aBoolean224) {
					@Pc(204) byte[] local204;
					for (local173 = 0; local173 < local125; local173++) {
						local187 = (this.anIntArray271[local173] >> 8) * 64 - this.anInt873;
						local199 = (this.anIntArray271[local173] & 0xFF) * 64 - this.anInt874;
						local204 = this.aByteArrayArray5[local173];
						if (local204 != null) {
							local159.method71((this.anInt852 - 6) * 8, local199, (this.anInt851 - 6) * 8, local204, local187, this.aClass37Array1);
						}
					}
					for (local187 = 0; local187 < local125; local187++) {
						local199 = (this.anIntArray271[local187] >> 8) * 64 - this.anInt873;
						local258 = (this.anIntArray271[local187] & 0xFF) * 64 - this.anInt874;
						@Pc(263) byte[] local263 = this.aByteArrayArray5[local187];
						if (local263 == null && this.anInt852 < 800) {
							local159.method66(local199, local258, 64, 64);
						}
					}
					this.aClass5_Sub1_Sub4_9.method229(30);
					for (local199 = 0; local199 < local125; local199++) {
						local204 = this.aByteArrayArray6[local199];
						if (local204 != null) {
							local308 = (this.anIntArray271[local199] >> 8) * 64 - this.anInt873;
							local320 = (this.anIntArray271[local199] & 0xFF) * 64 - this.anInt874;
							local159.method79(local308, this.aClass46_1, this.aClass37Array1, local320, local204);
						}
					}
				}
				if (this.aBoolean224) {
					local173 = 0;
					label258: while (true) {
						@Pc(379) int local379;
						@Pc(385) int local385;
						@Pc(395) int local395;
						@Pc(397) int local397;
						if (local173 >= 4) {
							for (local187 = 0; local187 < 13; local187++) {
								for (local199 = 0; local199 < 13; local199++) {
									local258 = this.anIntArrayArrayArray7[0][local187][local199];
									if (local258 == -1) {
										local159.method66(local187 * 8, local199 * 8, 8, 8);
									}
								}
							}
							this.aClass5_Sub1_Sub4_9.method229(30);
							local199 = 0;
							while (true) {
								if (local199 >= 4) {
									break label258;
								}
								for (local258 = 0; local258 < 13; local258++) {
									for (local308 = 0; local308 < 13; local308++) {
										local320 = this.anIntArrayArrayArray7[local199][local258][local308];
										if (local320 != -1) {
											local379 = local320 >> 24 & 0x3;
											local385 = local320 >> 1 & 0x3;
											local395 = local320 >> 14 & 0x3FF;
											local397 = local320 >> 3 & 0x7FF;
											@Pc(561) int local561 = (local395 / 8 << 8) + local397 / 8;
											for (@Pc(563) int local563 = 0; local563 < this.anIntArray271.length; local563++) {
												if (this.anIntArray271[local563] == local561 && this.aByteArrayArray6[local563] != null) {
													local159.method78(this.anInt911, local379, this.aByteArrayArray6[local563], (local397 & 0x7) * 8, local258 * 8, (local395 & 0x7) * 8, this.aClass46_1, local385, local199, local308 * 8, this.aClass37Array1);
													break;
												}
											}
										}
									}
								}
								local199++;
							}
						}
						for (local187 = 0; local187 < 13; local187++) {
							for (local199 = 0; local199 < 13; local199++) {
								local258 = this.anIntArrayArrayArray7[local173][local187][local199];
								if (local258 != -1) {
									local308 = local258 >> 24 & 0x3;
									local320 = local258 >> 1 & 0x3;
									local379 = local258 >> 14 & 0x3FF;
									local385 = local258 >> 3 & 0x7FF;
									local395 = (local379 / 8 << 8) + local385 / 8;
									for (local397 = 0; local397 < this.anIntArray271.length; local397++) {
										if (this.anIntArray271[local397] == local395 && this.aByteArrayArray5[local397] != null) {
											local159.method60(local308, (local385 & 0x7) * 8, this.aClass37Array1, this.aByteArrayArray5[local397], local173, (local379 & 0x7) * 8, local187 * 8, this.aByte22, local199 * 8, local320);
											break;
										}
									}
								}
							}
						}
						local173++;
					}
				}
				this.aClass5_Sub1_Sub4_9.method229(30);
				local159.method62(this.aClass46_1, this.aClass37Array1);
				if (this.aClass6_17 != null) {
					this.aClass6_17.method55();
					Class5_Sub1_Sub1_Sub4.anIntArray206 = this.anIntArray231;
				}
				this.aClass5_Sub1_Sub4_9.method229(30);
				local173 = Class8.anInt83;
				if (local173 > this.anInt1052) {
					local173 = this.anInt1052;
				}
				if (local173 < this.anInt1052 - 1) {
					local173 = this.anInt1052 - 1;
				}
				if (aBoolean261) {
					this.aClass46_1.method482(Class8.anInt83);
				} else {
					this.aClass46_1.method482(0);
				}
				for (local187 = 0; local187 < 104; local187++) {
					for (local199 = 0; local199 < 104; local199++) {
						this.method700(local187, local199);
					}
				}
				this.method628();
			} catch (@Pc(713) Exception local713) {
			}
			Class26.aClass45_4.method479();
			if (super.aFrame_Sub1_2 != null) {
				this.aClass5_Sub1_Sub4_9.method229(56);
				this.aClass5_Sub1_Sub4_9.method234(1057001181);
			}
			if (aBoolean261 && signlink.aRandomAccessFile3 != null) {
				local32 = this.aClass9_Sub1_1.method147(0, 163);
				for (local117 = 0; local117 < local32; local117++) {
					local121 = this.aClass9_Sub1_1.method158(local117);
					if ((local121 & 0x79) == 0) {
						Class5_Sub1_Sub2_Sub5.method323(local117);
					}
				}
			}
			System.gc();
			Class5_Sub1_Sub1_Sub4.method560(aBoolean236);
			this.aClass9_Sub1_1.method145();
			local32 = (this.anInt851 - 6) / 8 - 1;
			local117 = (this.anInt851 + 6) / 8 + 1;
			local121 = (this.anInt852 - 6) / 8 - 1;
			local125 = (this.anInt852 + 6) / 8 + 1;
			if (this.aBoolean235) {
				local32 = 49;
				local117 = 50;
				local121 = 49;
				local125 = 50;
			}
			for (local173 = local32; local173 <= local117; local173++) {
				for (local187 = local121; local187 <= local125; local187++) {
					if (local173 == local32 || local173 == local117 || local187 == local121 || local187 == local125) {
						local199 = this.aClass9_Sub1_1.method142(867, local173, 0, local187);
						if (local199 != -1) {
							this.aClass9_Sub1_1.method151(local199, 3);
						}
						local258 = this.aClass9_Sub1_1.method142(867, local173, 1, local187);
						if (local258 != -1) {
							this.aClass9_Sub1_1.method151(local258, 3);
						}
					}
				}
			}
		} catch (@Pc(881) RuntimeException local881) {
			signlink.reporterror("62457, " + -122 + ", " + local881.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "t", descriptor = "(I)Ljava/net/Socket;")
	public Socket method669(@OriginalArg(0) int arg0) throws IOException {
		return signlink.mainapp == null ? new Socket(InetAddress.getByName(this.getCodeBase().getHost()), arg0) : signlink.opensocket(arg0);
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(BLclient!PKHWFJLM;I)V")
	private void method670(@OriginalArg(1) Class5_Sub1_Sub4 arg0, @OriginalArg(2) int arg1) {
		try {
			arg0.method250();
			@Pc(9) int local9 = arg0.method251(8);
			@Pc(21) int local21;
			if (local9 < this.anInt943) {
				for (local21 = local9; local21 < this.anInt943; local21++) {
					this.anIntArray259[this.anInt995++] = this.anIntArray243[local21];
				}
			}
			if (local9 > this.anInt943) {
				signlink.reporterror(this.aString17 + " Too many npcs");
				throw new RuntimeException("eek");
			}
			this.anInt943 = 0;
			for (local21 = 0; local21 < local9; local21++) {
				@Pc(73) int local73 = this.anIntArray243[local21];
				@Pc(78) Class5_Sub1_Sub2_Sub4_Sub1 local78 = this.aClass5_Sub1_Sub2_Sub4_Sub1Array1[local73];
				@Pc(83) int local83 = arg0.method251(1);
				if (local83 == 0) {
					this.anIntArray243[this.anInt943++] = local73;
					local78.anInt521 = anInt1018;
				} else {
					@Pc(106) int local106 = arg0.method251(2);
					if (local106 == 0) {
						this.anIntArray243[this.anInt943++] = local73;
						local78.anInt521 = anInt1018;
						this.anIntArray254[this.anInt985++] = local73;
					} else {
						@Pc(157) int local157;
						@Pc(167) int local167;
						if (local106 == 1) {
							this.anIntArray243[this.anInt943++] = local73;
							local78.anInt521 = anInt1018;
							local157 = arg0.method251(3);
							local78.method375(false, local157);
							local167 = arg0.method251(1);
							if (local167 == 1) {
								this.anIntArray254[this.anInt985++] = local73;
							}
						} else if (local106 == 2) {
							this.anIntArray243[this.anInt943++] = local73;
							local78.anInt521 = anInt1018;
							local157 = arg0.method251(3);
							local78.method375(true, local157);
							local167 = arg0.method251(3);
							local78.method375(true, local167);
							@Pc(225) int local225 = arg0.method251(1);
							if (local225 == 1) {
								this.anIntArray254[this.anInt985++] = local73;
							}
						} else if (local106 == 3) {
							this.anIntArray259[this.anInt995++] = local73;
						}
					}
				}
			}
		} catch (@Pc(262) RuntimeException local262) {
			signlink.reporterror("28317, " + 100 + ", " + arg0 + ", " + arg1 + ", " + local262.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/Runnable;I)V")
	@Override
	public void method584(@OriginalArg(0) Runnable arg0, @OriginalArg(1) int arg1) {
		if (arg1 > 10) {
			arg1 = 10;
		}
		if (signlink.mainapp == null) {
			super.method584(arg0, arg1);
		} else {
			signlink.startthread(arg0, arg1);
		}
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(II)V")
	private void method671(@OriginalArg(1) int arg0) {
		try {
			@Pc(5) int[] local5 = this.aClass5_Sub1_Sub1_Sub3_14.anIntArray173;
			@Pc(14) int local14 = local5.length;
			for (@Pc(16) int local16 = 0; local16 < local14; local16++) {
				local5[local16] = 0;
			}
			@Pc(40) int local40;
			@Pc(42) int local42;
			for (@Pc(28) int local28 = 1; local28 < 103; local28++) {
				local40 = (103 - local28) * 512 * 4 + 24628;
				for (local42 = 1; local42 < 103; local42++) {
					if ((this.aByteArrayArrayArray8[arg0][local42][local28] & 0x18) == 0) {
						this.aClass46_1.method516(local5, local40, arg0, local42, local28);
					}
					if (arg0 < 3 && (this.aByteArrayArrayArray8[arg0 + 1][local42][local28] & 0x8) != 0) {
						this.aClass46_1.method516(local5, local40, arg0 + 1, local42, local28);
					}
					local40 += 4;
				}
			}
			local40 = ((int) (Math.random() * 20.0D) + 238 - 10 << 16) + ((int) (Math.random() * 20.0D) + 238 - 10 << 8) + (int) (Math.random() * 20.0D) + 238 - 10;
			local42 = (int) (Math.random() * 20.0D) + 238 - 10 << 16;
			this.aClass5_Sub1_Sub1_Sub3_14.method450();
			@Pc(152) int local152;
			for (@Pc(148) int local148 = 1; local148 < 103; local148++) {
				for (local152 = 1; local152 < 103; local152++) {
					if ((this.aByteArrayArrayArray8[arg0][local152][local148] & 0x18) == 0) {
						this.method616(local40, local42, local152, arg0, local148);
					}
					if (arg0 < 3 && (this.aByteArrayArrayArray8[arg0 + 1][local152][local148] & 0x8) != 0) {
						this.method616(local40, local42, local152, arg0 + 1, local148);
					}
				}
			}
			if (this.aClass6_17 != null) {
				this.aClass6_17.method55();
				Class5_Sub1_Sub1_Sub4.anIntArray206 = this.anIntArray231;
			}
			anInt831++;
			if (anInt831 > 1003) {
				anInt831 = 0;
				this.aClass5_Sub1_Sub4_9.method229(21);
				this.aClass5_Sub1_Sub4_9.method230(0);
				local152 = this.aClass5_Sub1_Sub4_9.anInt429;
				this.aClass5_Sub1_Sub4_9.method230((int) (Math.random() * 256.0D));
				this.aClass5_Sub1_Sub4_9.method231(1577);
				if ((int) (Math.random() * 2.0D) == 0) {
					this.aClass5_Sub1_Sub4_9.method231(10733);
				}
				this.aClass5_Sub1_Sub4_9.method231(30792);
				this.aClass5_Sub1_Sub4_9.method230((int) (Math.random() * 256.0D));
				this.aClass5_Sub1_Sub4_9.method230((int) (Math.random() * 256.0D));
				this.aClass5_Sub1_Sub4_9.method230(229);
				this.aClass5_Sub1_Sub4_9.method230((int) (Math.random() * 256.0D));
				if ((int) (Math.random() * 2.0D) == 0) {
					this.aClass5_Sub1_Sub4_9.method230(88);
				}
				this.aClass5_Sub1_Sub4_9.method231((int) (Math.random() * 65536.0D));
				this.aClass5_Sub1_Sub4_9.method239(this.aClass5_Sub1_Sub4_9.anInt429 - local152);
			}
			this.anInt890 = 0;
			for (local152 = 0; local152 < 104; local152++) {
				for (@Pc(322) int local322 = 0; local322 < 104; local322++) {
					@Pc(332) int local332 = this.aClass46_1.method510(this.anInt1052, local152, local322);
					if (local332 != 0) {
						local332 = local332 >> 14 & 0x7FFF;
						@Pc(344) int local344 = Class26.method179(local332).anInt277;
						if (local344 >= 0) {
							@Pc(348) int local348 = local152;
							@Pc(350) int local350 = local322;
							if (local344 != 22 && local344 != 29 && local344 != 34 && local344 != 36 && local344 != 46 && local344 != 47 && local344 != 48) {
								@Pc(382) int[][] local382 = this.aClass37Array1[this.anInt1052].anIntArrayArray15;
								for (@Pc(384) int local384 = 0; local384 < 10; local384++) {
									@Pc(391) int local391 = (int) (Math.random() * 4.0D);
									if (local391 == 0 && local348 > 0 && local348 > local152 - 3 && (local382[local348 - 1][local350] & 0x1280108) == 0) {
										local348--;
									}
									if (local391 == 1 && local348 < 103 && local348 < local152 + 3 && (local382[local348 + 1][local350] & 0x1280180) == 0) {
										local348++;
									}
									if (local391 == 2 && local350 > 0 && local350 > local322 - 3 && (local382[local348][local350 - 1] & 0x1280102) == 0) {
										local350--;
									}
									if (local391 == 3 && local350 < 103 && local350 < local322 + 3 && (local382[local348][local350 + 1] & 0x1280120) == 0) {
										local350++;
									}
								}
							}
							this.aClass5_Sub1_Sub1_Sub3Array6[this.anInt890] = this.aClass5_Sub1_Sub1_Sub3Array8[local344];
							this.anIntArray234[this.anInt890] = local348;
							this.anIntArray235[this.anInt890] = local350;
							this.anInt890++;
						}
					}
				}
			}
		} catch (@Pc(521) RuntimeException local521) {
			signlink.reporterror("72951, " + 27567 + ", " + arg0 + ", " + local521.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(IZ)V")
	private void method672(@OriginalArg(1) boolean arg0) {
		try {
			this.anInt938 += 0;
			for (@Pc(7) int local7 = 0; local7 < this.anInt943; local7++) {
				@Pc(17) Class5_Sub1_Sub2_Sub4_Sub1 local17 = this.aClass5_Sub1_Sub2_Sub4_Sub1Array1[this.anIntArray243[local7]];
				@Pc(26) int local26 = (this.anIntArray243[local7] << 14) + 536870912;
				if (local17 != null && local17.method372() && local17.aClass49_1.aBoolean196 == arg0 && local17.aClass49_1.method541()) {
					@Pc(47) int local47 = local17.anInt524 >> 7;
					@Pc(52) int local52 = local17.anInt525 >> 7;
					if (local47 >= 0 && local47 < 104 && local52 >= 0 && local52 < 104) {
						if (local17.anInt499 == 1 && (local17.anInt524 & 0x7F) == 64 && (local17.anInt525 & 0x7F) == 64) {
							if (this.anIntArrayArray23[local47][local52] == this.anInt1045) {
								continue;
							}
							this.anIntArrayArray23[local47][local52] = this.anInt1045;
						}
						if (!local17.aClass49_1.aBoolean194) {
							local26 += Integer.MIN_VALUE;
						}
						this.aClass46_1.method492(local17.anInt525, this.anInt1052, local17.anInt524, local17.aBoolean139, local17, this.method594(this.anInt1052, local17.anInt524, this.anInt867, local17.anInt525), (local17.anInt499 - 1) * 64 + 60, local17.anInt526, local26, this.anInt891);
					}
				}
			}
		} catch (@Pc(146) RuntimeException local146) {
			signlink.reporterror("69516, " + 0 + ", " + arg0 + ", " + local146.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/String;II)V")
	@Override
	protected void method585(@OriginalArg(0) String arg0, @OriginalArg(2) int arg1) {
		try {
			this.anInt857 = arg1;
			this.aString24 = arg0;
			this.method617();
			if (this.aClass40_2 == null) {
				super.method585(arg0, arg1);
			} else {
				this.aClass6_8.method55();
				this.aClass5_Sub1_Sub1_Sub1_4.method40(54, 180, "RuneScape is loading - please wait...", 16777215);
				Class5_Sub1_Sub1.method550(62, 34, 9179409, 28, 304);
				Class5_Sub1_Sub1.method550(63, 32, 0, 29, 302);
				Class5_Sub1_Sub1.method549(9179409, 30, arg1 * 3, 64, 30);
				Class5_Sub1_Sub1.method549(0, arg1 * 3 + 30, 300 - arg1 * 3, 64, 30);
				this.aClass5_Sub1_Sub1_Sub1_4.method40(85, 180, arg0, 16777215);
				this.aClass6_8.method56(171, super.aGraphics2, 202);
				if (this.aBoolean256) {
					this.aBoolean256 = false;
					if (!this.aBoolean249) {
						this.aClass6_9.method56(0, super.aGraphics2, 0);
						this.aClass6_10.method56(0, super.aGraphics2, 637);
					}
					this.aClass6_6.method56(0, super.aGraphics2, 128);
					this.aClass6_7.method56(371, super.aGraphics2, 202);
					this.aClass6_11.method56(265, super.aGraphics2, 0);
					this.aClass6_12.method56(265, super.aGraphics2, 562);
					this.aClass6_13.method56(171, super.aGraphics2, 128);
					this.aClass6_14.method56(171, super.aGraphics2, 562);
				}
			}
		} catch (@Pc(213) RuntimeException local213) {
			signlink.reporterror("74255, " + arg0 + ", " + -460 + ", " + arg1 + ", " + local213.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "run", descriptor = "()V")
	@Override
	public void run() {
		if (this.aBoolean226) {
			this.method595();
		} else {
			super.run();
		}
	}

	@OriginalMember(owner = "client!client", name = "u", descriptor = "(I)V")
	private void method673(@OriginalArg(0) int arg0) {
		try {
			@Pc(5) boolean local5 = false;
			for (@Pc(10) Class5_Sub1_Sub2_Sub2 local10 = (Class5_Sub1_Sub2_Sub2) this.aClass41_12.method468(); local10 != null; local10 = (Class5_Sub1_Sub2_Sub2) this.aClass41_12.method470()) {
				if (local10.anInt236 != this.anInt1052 || anInt1018 > local10.anInt232) {
					local10.method542();
				} else if (anInt1018 >= local10.anInt231) {
					if (local10.anInt235 > 0) {
						@Pc(40) Class5_Sub1_Sub2_Sub4_Sub1 local40 = this.aClass5_Sub1_Sub2_Sub4_Sub1Array1[local10.anInt235 - 1];
						if (local40 != null && local40.anInt524 >= 0 && local40.anInt524 < 13312 && local40.anInt525 >= 0 && local40.anInt525 < 13312) {
							local10.method138(local40.anInt524, local40.anInt525, anInt1018, this.method594(local10.anInt236, local40.anInt524, this.anInt867, local40.anInt525) - local10.anInt225);
						}
					}
					if (local10.anInt235 < 0) {
						@Pc(86) int local86 = -local10.anInt235 - 1;
						@Pc(92) Class5_Sub1_Sub2_Sub4_Sub2 local92;
						if (local86 == this.anInt975) {
							local92 = aClass5_Sub1_Sub2_Sub4_Sub2_1;
						} else {
							local92 = this.aClass5_Sub1_Sub2_Sub4_Sub2Array1[local86];
						}
						if (local92 != null && local92.anInt524 >= 0 && local92.anInt524 < 13312 && local92.anInt525 >= 0 && local92.anInt525 < 13312) {
							local10.method138(local92.anInt524, local92.anInt525, anInt1018, this.method594(local10.anInt236, local92.anInt524, this.anInt867, local92.anInt525) - local10.anInt225);
						}
					}
					local10.method137(this.anInt895, this.anInt897);
					this.aClass46_1.method492((int) local10.aDouble7, this.anInt1052, (int) local10.aDouble6, false, local10, (int) local10.aDouble8, 60, local10.anInt227, -1, this.anInt891);
				}
			}
		} catch (@Pc(175) RuntimeException local175) {
			signlink.reporterror("51567, " + arg0 + ", " + local175.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!PKHWFJLM;ZI)V")
	private void method674(@OriginalArg(0) Class5_Sub1_Sub4 arg0, @OriginalArg(2) int arg1) {
		try {
			this.anInt995 = 0;
			this.anInt985 = 0;
			this.method666(arg0, arg1);
			this.method722(arg0, arg1);
			this.method716(arg1, arg0, 489);
			this.method614(arg1, arg0);
			@Pc(40) int local40;
			for (@Pc(33) int local33 = 0; local33 < this.anInt995; local33++) {
				local40 = this.anIntArray259[local33];
				if (this.aClass5_Sub1_Sub2_Sub4_Sub2Array1[local40].anInt521 != anInt1018) {
					this.aClass5_Sub1_Sub2_Sub4_Sub2Array1[local40] = null;
				}
			}
			if (arg0.anInt429 != arg1) {
				signlink.reporterror("Error packet size mismatch in getplayer pos:" + arg0.anInt429 + " psize:" + arg1);
				throw new RuntimeException("eek");
			}
			for (local40 = 0; local40 < this.anInt984; local40++) {
				if (this.aClass5_Sub1_Sub2_Sub4_Sub2Array1[this.anIntArray253[local40]] == null) {
					signlink.reporterror(this.aString17 + " null entry in pl list - pos:" + local40 + " size:" + this.anInt984);
					throw new RuntimeException("eek");
				}
			}
		} catch (@Pc(120) RuntimeException local120) {
			signlink.reporterror("26072, " + arg0 + ", " + false + ", " + arg1 + ", " + local120.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIIIILclient!RRTTGXYM;I)V")
	private void method675(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class36 arg5, @OriginalArg(7) int arg6) {
		try {
			if (arg5.anInt595 == 0 && arg5.anIntArray165 != null && !arg5.aBoolean150 && (arg2 >= arg6 && arg0 >= arg4 && arg2 <= arg6 + arg5.anInt603 && arg0 <= arg4 + arg5.anInt579)) {
				@Pc(34) int local34 = arg5.anIntArray165.length;
				for (@Pc(43) int local43 = 0; local43 < local34; local43++) {
					@Pc(52) int local52 = arg5.anIntArray158[local43] + arg6;
					@Pc(61) int local61 = arg5.anIntArray161[local43] + arg4 - arg1;
					@Pc(67) Class36 local67 = Class36.method388(arg5.anIntArray165[local43]);
					@Pc(72) int local72 = local52 + local67.anInt584;
					@Pc(77) int local77 = local61 + local67.anInt596;
					if ((local67.anInt606 >= 0 || local67.anInt602 != 0) && arg2 >= local72 && arg0 >= local77 && arg2 < local72 + local67.anInt603 && arg0 < local77 + local67.anInt579) {
						if (local67.anInt606 >= 0) {
							this.anInt962 = local67.anInt606;
						} else {
							this.anInt962 = local67.anInt585;
						}
					}
					if (local67.anInt595 == 8 && arg2 >= local72 && arg0 >= local77 && arg2 < local72 + local67.anInt603 && arg0 < local77 + local67.anInt579) {
						this.anInt839 = local67.anInt585;
					}
					if (local67.anInt595 == 0) {
						this.method675(arg0, local67.anInt571, arg2, arg3, local77, local67, local72);
						if (local67.anInt597 > local67.anInt579) {
							this.method653(local67.anInt579, local67.anInt597, arg2, local67, arg0, arg3, local72 + local67.anInt603, local77);
						}
					} else {
						if (local67.anInt570 == 1 && arg2 >= local72 && arg0 >= local77 && arg2 < local72 + local67.anInt603 && arg0 < local77 + local67.anInt579) {
							@Pc(201) boolean local201 = false;
							if (local67.anInt591 != 0) {
								local201 = this.method610(local67, 844);
							}
							if (!local201) {
								this.aStringArray10[this.anInt956] = local67.aString12;
								this.anIntArray269[this.anInt956] = 836;
								this.anIntArray268[this.anInt956] = local67.anInt585;
								this.anInt956++;
							}
						}
						if (local67.anInt570 == 2 && this.anInt1047 == 0 && arg2 >= local72 && arg0 >= local77 && arg2 < local72 + local67.anInt603 && arg0 < local77 + local67.anInt579) {
							@Pc(265) String local265 = local67.aString13;
							if (local265.indexOf(" ") != -1) {
								local265 = local265.substring(0, local265.indexOf(" "));
							}
							this.aStringArray10[this.anInt956] = local265 + " @gre@" + local67.aString11;
							this.anIntArray269[this.anInt956] = 924;
							this.anIntArray268[this.anInt956] = local67.anInt585;
							this.anInt956++;
						}
						if (local67.anInt570 == 3 && arg2 >= local72 && arg0 >= local77 && arg2 < local72 + local67.anInt603 && arg0 < local77 + local67.anInt579) {
							this.aStringArray10[this.anInt956] = "Close";
							if (arg3 == 3) {
								this.anIntArray269[this.anInt956] = 684;
							} else {
								this.anIntArray269[this.anInt956] = 991;
							}
							this.anIntArray268[this.anInt956] = local67.anInt585;
							this.anInt956++;
						}
						if (local67.anInt570 == 4 && arg2 >= local72 && arg0 >= local77 && arg2 < local72 + local67.anInt603 && arg0 < local77 + local67.anInt579) {
							this.aStringArray10[this.anInt956] = local67.aString12;
							this.anIntArray269[this.anInt956] = 877;
							this.anIntArray268[this.anInt956] = local67.anInt585;
							this.anInt956++;
						}
						if (local67.anInt570 == 5 && arg2 >= local72 && arg0 >= local77 && arg2 < local72 + local67.anInt603 && arg0 < local77 + local67.anInt579) {
							this.aStringArray10[this.anInt956] = local67.aString12;
							this.anIntArray269[this.anInt956] = 529;
							this.anIntArray268[this.anInt956] = local67.anInt585;
							this.anInt956++;
						}
						if (local67.anInt570 == 6 && !this.aBoolean227 && arg2 >= local72 && arg0 >= local77 && arg2 < local72 + local67.anInt603 && arg0 < local77 + local67.anInt579) {
							this.aStringArray10[this.anInt956] = local67.aString12;
							this.anIntArray269[this.anInt956] = 856;
							this.anIntArray268[this.anInt956] = local67.anInt585;
							this.anInt956++;
						}
						if (local67.anInt595 == 2) {
							@Pc(524) int local524 = 0;
							for (@Pc(526) int local526 = 0; local526 < local67.anInt579; local526++) {
								for (@Pc(530) int local530 = 0; local530 < local67.anInt603; local530++) {
									@Pc(541) int local541 = local72 + local530 * (local67.anInt583 + 32);
									@Pc(550) int local550 = local77 + local526 * (local67.anInt605 + 32);
									if (local524 < 20) {
										local541 += local67.anIntArray159[local524];
										local550 += local67.anIntArray160[local524];
									}
									if (arg2 >= local541 && arg0 >= local550 && arg2 < local541 + 32 && arg0 < local550 + 32) {
										this.anInt980 = local524;
										this.anInt981 = local67.anInt585;
										if (local67.anIntArray163[local524] > 0) {
											@Pc(603) Class18 local603 = Class18.method117(local67.anIntArray163[local524] - 1);
											if (this.anInt957 == 1 && local67.aBoolean148) {
												if (local67.anInt585 != this.anInt959 || local524 != this.anInt958) {
													this.aStringArray10[this.anInt956] = "Use " + this.aString26 + " with @lre@" + local603.aString2;
													this.anIntArray269[this.anInt956] = 486;
													this.anIntArray270[this.anInt956] = local603.anInt180;
													this.anIntArray267[this.anInt956] = local524;
													this.anIntArray268[this.anInt956] = local67.anInt585;
													this.anInt956++;
												}
											} else if (this.anInt1047 != 1 || !local67.aBoolean148) {
												@Pc(740) int local740;
												if (local67.aBoolean148) {
													for (local740 = 4; local740 >= 3; local740--) {
														if (local603.aStringArray1 != null && local603.aStringArray1[local740] != null) {
															this.aStringArray10[this.anInt956] = local603.aStringArray1[local740] + " @lre@" + local603.aString2;
															if (local740 == 3) {
																this.anIntArray269[this.anInt956] = 194;
															}
															if (local740 == 4) {
																this.anIntArray269[this.anInt956] = 840;
															}
															this.anIntArray270[this.anInt956] = local603.anInt180;
															this.anIntArray267[this.anInt956] = local524;
															this.anIntArray268[this.anInt956] = local67.anInt585;
															this.anInt956++;
														} else if (local740 == 4) {
															this.aStringArray10[this.anInt956] = "Drop @lre@" + local603.aString2;
															this.anIntArray269[this.anInt956] = 840;
															this.anIntArray270[this.anInt956] = local603.anInt180;
															this.anIntArray267[this.anInt956] = local524;
															this.anIntArray268[this.anInt956] = local67.anInt585;
															this.anInt956++;
														}
													}
												}
												if (local67.aBoolean153) {
													this.aStringArray10[this.anInt956] = "Use @lre@" + local603.aString2;
													this.anIntArray269[this.anInt956] = 901;
													this.anIntArray270[this.anInt956] = local603.anInt180;
													this.anIntArray267[this.anInt956] = local524;
													this.anIntArray268[this.anInt956] = local67.anInt585;
													this.anInt956++;
												}
												if (local67.aBoolean148 && local603.aStringArray1 != null) {
													for (local740 = 2; local740 >= 0; local740--) {
														if (local603.aStringArray1[local740] != null) {
															this.aStringArray10[this.anInt956] = local603.aStringArray1[local740] + " @lre@" + local603.aString2;
															if (local740 == 0) {
																this.anIntArray269[this.anInt956] = 99;
															}
															if (local740 == 1) {
																this.anIntArray269[this.anInt956] = 600;
															}
															if (local740 == 2) {
																this.anIntArray269[this.anInt956] = 300;
															}
															this.anIntArray270[this.anInt956] = local603.anInt180;
															this.anIntArray267[this.anInt956] = local524;
															this.anIntArray268[this.anInt956] = local67.anInt585;
															this.anInt956++;
														}
													}
												}
												if (local67.aStringArray5 != null) {
													for (local740 = 4; local740 >= 0; local740--) {
														if (local67.aStringArray5[local740] != null) {
															this.aStringArray10[this.anInt956] = local67.aStringArray5[local740] + " @lre@" + local603.aString2;
															if (local740 == 0) {
																this.anIntArray269[this.anInt956] = 849;
															}
															if (local740 == 1) {
																this.anIntArray269[this.anInt956] = 92;
															}
															if (local740 == 2) {
																this.anIntArray269[this.anInt956] = 204;
															}
															if (local740 == 3) {
																this.anIntArray269[this.anInt956] = 357;
															}
															if (local740 == 4) {
																this.anIntArray269[this.anInt956] = 371;
															}
															this.anIntArray270[this.anInt956] = local603.anInt180;
															this.anIntArray267[this.anInt956] = local524;
															this.anIntArray268[this.anInt956] = local67.anInt585;
															this.anInt956++;
														}
													}
												}
												this.aStringArray10[this.anInt956] = "Examine @lre@" + local603.aString2;
												this.anIntArray269[this.anInt956] = 1630;
												this.anIntArray270[this.anInt956] = local603.anInt180;
												this.anIntArray267[this.anInt956] = local524;
												this.anIntArray268[this.anInt956] = local67.anInt585;
												this.anInt956++;
											} else if ((this.anInt1049 & 0x10) == 16) {
												this.aStringArray10[this.anInt956] = this.aString30 + " @lre@" + local603.aString2;
												this.anIntArray269[this.anInt956] = 104;
												this.anIntArray270[this.anInt956] = local603.anInt180;
												this.anIntArray267[this.anInt956] = local524;
												this.anIntArray268[this.anInt956] = local67.anInt585;
												this.anInt956++;
											}
										}
									}
									local524++;
								}
							}
						}
					}
				}
			}
		} catch (@Pc(1170) RuntimeException local1170) {
			signlink.reporterror("89512, " + -918 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + local1170.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "t", descriptor = "(Z)V")
	private void method676() {
		try {
			@Pc(16) int local16;
			for (@Pc(8) int local8 = -1; local8 < this.anInt984; local8++) {
				if (local8 == -1) {
					local16 = this.anInt983;
				} else {
					local16 = this.anIntArray253[local8];
				}
				@Pc(28) Class5_Sub1_Sub2_Sub4_Sub2 local28 = this.aClass5_Sub1_Sub2_Sub4_Sub2Array1[local16];
				if (local28 != null && local28.anInt507 > 0) {
					local28.anInt507--;
					if (local28.anInt507 == 0) {
						local28.aString7 = null;
					}
				}
			}
			for (local16 = 0; local16 < this.anInt943; local16++) {
				@Pc(59) int local59 = this.anIntArray243[local16];
				@Pc(64) Class5_Sub1_Sub2_Sub4_Sub1 local64 = this.aClass5_Sub1_Sub2_Sub4_Sub1Array1[local59];
				if (local64 != null && local64.anInt507 > 0) {
					local64.anInt507--;
					if (local64.anInt507 == 0) {
						local64.aString7 = null;
					}
				}
			}
		} catch (@Pc(88) RuntimeException local88) {
			signlink.reporterror("12786, " + false + ", " + local88.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "v", descriptor = "(I)V")
	private void method677() {
		try {
			@Pc(7) byte[] local7 = this.aClass40_2.method464("title.dat", null);
			@Pc(13) Class5_Sub1_Sub1_Sub3 local13 = new Class5_Sub1_Sub1_Sub3(local7, this);
			this.aClass6_9.method55();
			local13.method453(0, 0);
			this.aClass6_10.method55();
			local13.method453(0, -637);
			this.aClass6_6.method55();
			local13.method453(0, -128);
			this.aClass6_7.method55();
			local13.method453(-371, -202);
			this.aClass6_8.method55();
			local13.method453(-171, -202);
			this.aClass6_11.method55();
			local13.method453(-265, 0);
			this.aClass6_12.method55();
			local13.method453(-265, -562);
			this.aClass6_13.method55();
			local13.method453(-171, -128);
			this.aClass6_14.method55();
			local13.method453(-171, -562);
			@Pc(98) int[] local98 = new int[local13.anInt669];
			for (@Pc(100) int local100 = 0; local100 < local13.anInt670; local100++) {
				for (@Pc(104) int local104 = 0; local104 < local13.anInt669; local104++) {
					local98[local104] = local13.anIntArray173[local13.anInt669 + local13.anInt669 * local100 - local104 - 1];
				}
				for (@Pc(130) int local130 = 0; local130 < local13.anInt669; local130++) {
					local13.anIntArray173[local130 + local13.anInt669 * local100] = local98[local130];
				}
			}
			this.aClass6_9.method55();
			local13.method453(0, 382);
			this.aClass6_10.method55();
			local13.method453(0, -255);
			this.aClass6_6.method55();
			local13.method453(0, 254);
			this.aClass6_7.method55();
			local13.method453(-371, 180);
			this.aClass6_8.method55();
			local13.method453(-171, 180);
			this.aClass6_11.method55();
			local13.method453(-265, 382);
			this.aClass6_12.method55();
			local13.method453(-265, -180);
			this.aClass6_13.method55();
			local13.method453(-171, 254);
			this.aClass6_14.method55();
			local13.method453(-171, -180);
			this.anInt938 += 0;
			local13 = new Class5_Sub1_Sub1_Sub3(this.aClass40_2, "logo", 0);
			this.aClass6_6.method55();
			local13.method455(382 - local13.anInt669 / 2 - 128, 18);
			System.gc();
		} catch (@Pc(279) RuntimeException local279) {
			signlink.reporterror("28598, " + 0 + ", " + local279.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(I)V")
	@Override
	protected void method579() {
		try {
			this.anInt938 += 0;
			if (!this.aBoolean239 && !this.aBoolean255 && !this.aBoolean220) {
				anInt1018++;
				if (this.aBoolean221) {
					this.method631();
				} else {
					this.method635();
				}
				this.method697();
			}
		} catch (@Pc(35) RuntimeException local35) {
			signlink.reporterror("65176, " + 0 + ", " + local35.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IBLclient!TTFRDWZK;I)V")
	private void method678(@OriginalArg(0) int arg0, @OriginalArg(2) Class5_Sub1_Sub1_Sub3 arg1, @OriginalArg(3) int arg2) {
		try {
			@Pc(7) int local7 = this.anInt945 + this.anInt893 & 0x7FF;
			@Pc(15) int local15 = arg2 * arg2 + arg0 * arg0;
			if (local15 <= 6400) {
				@Pc(23) int local23 = Class5_Sub1_Sub2_Sub5.anIntArray141[local7];
				@Pc(27) int local27 = Class5_Sub1_Sub2_Sub5.anIntArray142[local7];
				@Pc(36) int local36 = local23 * 256 / (this.anInt918 + 256);
				@Pc(51) int local51 = local27 * 256 / (this.anInt918 + 256);
				@Pc(61) int local61 = arg0 * local36 + arg2 * local51 >> 16;
				@Pc(71) int local71 = arg0 * local51 - arg2 * local36 >> 16;
				if (local15 > 2500) {
					arg1.method461(this.aBoolean222, local61 + 94 + 4 - arg1.anInt673 / 2, 83 - local71 - arg1.anInt674 / 2 - 4, this.aClass5_Sub1_Sub1_Sub2_7);
				} else {
					arg1.method455(local61 + 94 + 4 - arg1.anInt673 / 2, 83 - local71 - arg1.anInt674 / 2 - 4);
				}
			}
		} catch (@Pc(126) RuntimeException local126) {
			signlink.reporterror("38758, " + arg0 + ", " + 4 + ", " + arg1 + ", " + arg2 + ", " + local126.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "w", descriptor = "(I)V")
	private void method679() {
		try {
			if (this.anInt942 > 0) {
				this.method659();
			} else {
				this.method660("Connection lost", "Please wait - attempting to reestablish");
				this.anInt1019 = 0;
				this.anInt1028 = 0;
				@Pc(24) Class17 local24 = this.aClass17_1;
				this.aBoolean221 = false;
				this.anInt871 = 0;
				this.method656(this.aString17, this.aString18, true);
				if (!this.aBoolean221) {
					this.method659();
				}
				try {
					local24.method106();
				} catch (@Pc(47) Exception local47) {
				}
			}
		} catch (@Pc(49) RuntimeException local49) {
			signlink.reporterror("68050, " + 70 + ", " + local49.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "u", descriptor = "(Z)V")
	private void method680() {
		try {
			if (this.anInt909 != 0) {
				@Pc(5) int local5 = 0;
				if (this.anInt965 != 0) {
					local5 = 1;
				}
				for (@Pc(12) int local12 = 0; local12 < 100; local12++) {
					if (this.aStringArray9[local12] != null) {
						@Pc(24) int local24 = this.anIntArray225[local12];
						@Pc(29) String local29 = this.aStringArray8[local12];
						if (local29 != null && local29.startsWith("@cr1@")) {
							local29 = local29.substring(5);
						}
						if (local29 != null && local29.startsWith("@cr2@")) {
							local29 = local29.substring(5);
						}
						if ((local24 == 3 || local24 == 7) && (local24 == 7 || this.anInt1043 == 0 || this.anInt1043 == 1 && this.method600(local29))) {
							@Pc(82) int local82 = 329 - local5 * 13;
							if (super.anInt818 > 4 && super.anInt819 - 4 > local82 - 10 && super.anInt819 - 4 <= local82 + 3) {
								@Pc(121) int local121 = this.aClass5_Sub1_Sub1_Sub1_3.method42("From:  " + local29 + this.aStringArray9[local12]) + 25;
								if (local121 > 450) {
									local121 = 450;
								}
								if (super.anInt818 < local121 + 4) {
									if (this.anInt998 >= 1) {
										this.aStringArray10[this.anInt956] = "Report abuse @whi@" + local29;
										this.anIntArray269[this.anInt956] = 2556;
										this.anInt956++;
									}
									this.aStringArray10[this.anInt956] = "Add ignore @whi@" + local29;
									this.anIntArray269[this.anInt956] = 2913;
									this.anInt956++;
									this.aStringArray10[this.anInt956] = "Add friend @whi@" + local29;
									this.anIntArray269[this.anInt956] = 2695;
									this.anInt956++;
								}
							}
							local5++;
							if (local5 >= 5) {
								return;
							}
						}
						if ((local24 == 5 || local24 == 6) && this.anInt1043 < 2) {
							local5++;
							if (local5 >= 5) {
								return;
							}
						}
					}
				}
			}
		} catch (@Pc(240) RuntimeException local240) {
			signlink.reporterror("61890, " + false + ", " + local240.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "v", descriptor = "(Z)V")
	private void method681() {
		try {
			for (@Pc(6) Class5_Sub1_Sub2_Sub1 local6 = (Class5_Sub1_Sub2_Sub1) this.aClass41_11.method468(); local6 != null; local6 = (Class5_Sub1_Sub2_Sub1) this.aClass41_11.method470()) {
				if (local6.anInt92 != this.anInt1052 || local6.aBoolean40) {
					local6.method542();
				} else if (anInt1018 >= local6.anInt98) {
					local6.method89(this.anInt895);
					if (local6.aBoolean40) {
						local6.method542();
					} else {
						this.aClass46_1.method492(local6.anInt94, local6.anInt92, local6.anInt93, false, local6, local6.anInt95, 60, 0, -1, this.anInt891);
					}
				}
			}
		} catch (@Pc(73) RuntimeException local73) {
			signlink.reporterror("7047, " + false + ", " + local73.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Lclient!RRTTGXYM;I)Z")
	private boolean method682(@OriginalArg(0) Class36 arg0) {
		try {
			@Pc(11) int local11 = arg0.anInt591;
			if (this.anInt841 == 2) {
				if (local11 == 201) {
					this.aBoolean237 = true;
					this.anInt884 = 0;
					this.aBoolean217 = true;
					this.aString27 = "";
					this.anInt1008 = 1;
					this.aString25 = "Enter name of friend to add to list";
				}
				if (local11 == 202) {
					this.aBoolean237 = true;
					this.anInt884 = 0;
					this.aBoolean217 = true;
					this.aString27 = "";
					this.anInt1008 = 2;
					this.aString25 = "Enter name of friend to delete from list";
				}
			}
			if (local11 == 205) {
				this.anInt942 = 250;
				return true;
			}
			if (local11 == 501) {
				this.aBoolean237 = true;
				this.anInt884 = 0;
				this.aBoolean217 = true;
				this.aString27 = "";
				this.anInt1008 = 4;
				this.aString25 = "Enter name of player to add to list";
			}
			if (local11 == 502) {
				this.aBoolean237 = true;
				this.anInt884 = 0;
				this.aBoolean217 = true;
				this.aString27 = "";
				this.anInt1008 = 5;
				this.aString25 = "Enter name of player to delete from list";
			}
			@Pc(119) int local119;
			@Pc(123) int local123;
			@Pc(128) int local128;
			if (local11 >= 300 && local11 <= 313) {
				local119 = (local11 - 300) / 2;
				local123 = local11 & 0x1;
				local128 = this.anIntArray265[local119];
				if (local128 != -1) {
					while (true) {
						if (local123 == 0) {
							local128--;
							if (local128 < 0) {
								local128 = Class33.anInt468 - 1;
							}
						}
						if (local123 == 1) {
							local128++;
							if (local128 >= Class33.anInt468) {
								local128 = 0;
							}
						}
						if (!Class33.aClass33Array1[local128].aBoolean130 && Class33.aClass33Array1[local128].anInt469 == local119 + (this.aBoolean257 ? 0 : 7)) {
							this.anIntArray265[local119] = local128;
							this.aBoolean259 = true;
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
						local128 = anIntArrayArray25[local119].length - 1;
					}
				}
				if (local123 == 1) {
					local128++;
					if (local128 >= anIntArrayArray25[local119].length) {
						local128 = 0;
					}
				}
				this.anIntArray263[local119] = local128;
				this.aBoolean259 = true;
			}
			if (local11 == 324 && !this.aBoolean257) {
				this.aBoolean257 = true;
				this.method626();
			}
			if (local11 == 325 && this.aBoolean257) {
				this.aBoolean257 = false;
				this.method626();
			}
			if (local11 == 326) {
				this.aClass5_Sub1_Sub4_9.method229(244);
				this.aClass5_Sub1_Sub4_9.method230(this.aBoolean257 ? 0 : 1);
				for (local119 = 0; local119 < 7; local119++) {
					this.aClass5_Sub1_Sub4_9.method230(this.anIntArray265[local119]);
				}
				for (local123 = 0; local123 < 5; local123++) {
					this.aClass5_Sub1_Sub4_9.method230(this.anIntArray263[local123]);
				}
				return true;
			}
			if (local11 == 620) {
				this.aBoolean216 = !this.aBoolean216;
			}
			if (local11 >= 601 && local11 <= 613) {
				this.method639();
				if (this.aString19.length() > 0) {
					this.aClass5_Sub1_Sub4_9.method229(164);
					this.aClass5_Sub1_Sub4_9.method236(Class28.method191(this.aString19));
					this.aClass5_Sub1_Sub4_9.method230(local11 - 601);
					this.aClass5_Sub1_Sub4_9.method230(this.aBoolean216 ? 1 : 0);
				}
			}
			return false;
		} catch (@Pc(356) RuntimeException local356) {
			signlink.reporterror("39831, " + arg0 + ", " + 0 + ", " + local356.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "g", descriptor = "(B)V")
	private void method683(@OriginalArg(0) byte arg0) {
		try {
			Class26.aClass45_4.method479();
			Class26.aClass45_5.method479();
			Class49.aClass45_9.method479();
			@Pc(10) boolean local10 = false;
			Class18.aClass45_1.method479();
			Class18.aClass45_2.method479();
			Class5_Sub1_Sub2_Sub4_Sub2.aClass45_6.method479();
			Class20.aClass45_3.method479();
		} catch (@Pc(27) RuntimeException local27) {
			signlink.reporterror("60883, " + arg0 + ", " + local27.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(I)V")
	@Override
	protected void method581() {
		try {
			if (this.aBoolean239 || this.aBoolean255 || this.aBoolean220) {
				this.method597(580);
			} else {
				anInt913++;
				if (this.aBoolean221) {
					this.method650();
				} else {
					this.method625(false);
				}
				this.anInt888 = 0;
			}
		} catch (@Pc(44) RuntimeException local44) {
			signlink.reporterror("13408, " + 4 + ", " + local44.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "h", descriptor = "(B)V")
	private void method684(@OriginalArg(0) byte arg0) {
		try {
			@Pc(6) boolean local6 = false;
			this.method588();
			if (this.anInt1006 == 1) {
				this.aClass5_Sub1_Sub1_Sub3Array10[this.anInt1005 / 100].method455(this.anInt1003 - 8 - 4, this.anInt1004 - 8 - 4);
			}
			if (this.anInt1006 == 2) {
				this.aClass5_Sub1_Sub1_Sub3Array10[this.anInt1005 / 100 + 4].method455(this.anInt1003 - 8 - 4, this.anInt1004 - 8 - 4);
			}
			if (this.anInt843 != -1) {
				this.method667(this.anInt843, this.anInt895);
				this.method701(0, 0, Class36.method388(this.anInt843), 0);
			}
			if (this.anInt949 != -1) {
				this.method667(this.anInt949, this.anInt895);
				this.method701(0, 0, Class36.method388(this.anInt949), 0);
			}
			this.method693();
			if (!this.aBoolean240) {
				this.method714();
				this.method706();
			} else if (this.anInt969 == 0) {
				this.method620();
			}
			if (this.anInt951 == 1) {
				this.aClass5_Sub1_Sub1_Sub3_13.method455(472, 296);
			}
			@Pc(182) int local182;
			if (aBoolean223) {
				@Pc(148) byte local148 = 20;
				@Pc(150) int local150 = 16776960;
				if (super.anInt813 < 30 && aBoolean261) {
					local150 = 16711680;
				}
				if (super.anInt813 < 20 && !aBoolean261) {
					local150 = 16711680;
				}
				this.aClass5_Sub1_Sub1_Sub1_3.method39("Fps:" + super.anInt813, 20, local150);
				local182 = local148 + 15;
				@Pc(184) Runtime local184 = Runtime.getRuntime();
				@Pc(193) int local193 = (int) ((local184.totalMemory() - local184.freeMemory()) / 1024L);
				if (local193 > 33554432 && aBoolean261) {
				}
				if (local193 > 67108864 && !aBoolean261) {
				}
				this.aClass5_Sub1_Sub1_Sub1_3.method39("Mem:" + local193 + "k", 35, 16776960);
				local182 += 15;
			}
			if (this.anInt965 != 0) {
				@Pc(234) int local234 = this.anInt965 / 50;
				local182 = local234 / 60;
				@Pc(242) int local242 = local234 % 60;
				if (local242 < 10) {
					this.aClass5_Sub1_Sub1_Sub1_3.method44(4, "System update in: " + local182 + ":0" + local242, 16776960, 329);
				} else {
					this.aClass5_Sub1_Sub1_Sub1_3.method44(4, "System update in: " + local182 + ":" + local242, 16776960, 329);
				}
			}
		} catch (@Pc(284) RuntimeException local284) {
			signlink.reporterror("26814, " + arg0 + ", " + local284.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!TTFRDWZK;IZI)V")
	private void method685(@OriginalArg(0) Class5_Sub1_Sub1_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		try {
			@Pc(7) int local7 = arg2 * arg2 + arg1 * arg1;
			if (local7 > 4225 && local7 < 90000) {
				@Pc(28) int local28 = this.anInt945 + this.anInt893 & 0x7FF;
				@Pc(32) int local32 = Class5_Sub1_Sub2_Sub5.anIntArray141[local28];
				@Pc(36) int local36 = Class5_Sub1_Sub2_Sub5.anIntArray142[local28];
				@Pc(45) int local45 = local32 * 256 / (this.anInt918 + 256);
				@Pc(54) int local54 = local36 * 256 / (this.anInt918 + 256);
				@Pc(64) int local64 = arg1 * local45 + arg2 * local54 >> 16;
				@Pc(74) int local74 = arg1 * local54 - arg2 * local45 >> 16;
				@Pc(80) double local80 = Math.atan2((double) local64, (double) local74);
				@Pc(86) int local86 = (int) (Math.sin(local80) * 63.0D);
				@Pc(92) int local92 = (int) (Math.cos(local80) * 57.0D);
				this.aClass5_Sub1_Sub1_Sub3_5.method460(local80, 83 - local92 - 20, local86 + 94 + 4 - 10);
			} else {
				this.method678(arg1, arg0, arg2);
			}
		} catch (@Pc(123) RuntimeException local123) {
			signlink.reporterror("85067, " + arg0 + ", " + arg1 + ", " + false + ", " + arg2 + ", " + local123.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIZIIIIIII)V")
	private void method686(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		try {
			@Pc(1) Class5_Sub3 local1 = null;
			for (@Pc(6) Class5_Sub3 local6 = (Class5_Sub3) this.aClass41_10.method468(); local6 != null; local6 = (Class5_Sub3) this.aClass41_10.method470()) {
				if (local6.anInt304 == arg6 && local6.anInt306 == arg4 && local6.anInt307 == arg1 && local6.anInt305 == arg0) {
					local1 = local6;
					break;
				}
			}
			if (local1 == null) {
				local1 = new Class5_Sub3();
				local1.anInt304 = arg6;
				local1.anInt305 = arg0;
				local1.anInt306 = arg4;
				local1.anInt307 = arg1;
				this.method613(local1);
				this.aClass41_10.method465(local1);
			}
			local1.anInt298 = arg7;
			local1.anInt300 = arg3;
			local1.anInt299 = arg8;
			local1.anInt297 = arg2;
			local1.anInt308 = arg5;
		} catch (@Pc(82) RuntimeException local82) {
			signlink.reporterror("98802, " + arg0 + ", " + arg1 + ", " + false + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + local82.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/String;)Ljava/io/DataInputStream;")
	private DataInputStream method687(@OriginalArg(0) String arg0) throws IOException {
		if (this.aBoolean215) {
			if (this.aSocket3 != null) {
				try {
					this.aSocket3.close();
				} catch (@Pc(26) Exception local26) {
				}
				this.aSocket3 = null;
			}
			this.aSocket3 = this.method669(43595);
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

	@OriginalMember(owner = "client!client", name = "x", descriptor = "(I)I")
	private int method688() {
		try {
			@Pc(3) int local3 = 3;
			if (this.anInt928 < 310) {
				@Pc(22) int local22 = this.anInt925 >> 7;
				@Pc(27) int local27 = this.anInt927 >> 7;
				@Pc(32) int local32 = aClass5_Sub1_Sub2_Sub4_Sub2_1.anInt524 >> 7;
				@Pc(37) int local37 = aClass5_Sub1_Sub2_Sub4_Sub2_1.anInt525 >> 7;
				if ((this.aByteArrayArrayArray8[this.anInt1052][local22][local27] & 0x4) != 0) {
					local3 = this.anInt1052;
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
						if ((this.aByteArrayArrayArray8[this.anInt1052][local22][local27] & 0x4) != 0) {
							local3 = this.anInt1052;
						}
						local89 += local87;
						if (local89 >= 65536) {
							local89 -= 65536;
							if (local27 < local37) {
								local27++;
							} else if (local27 > local37) {
								local27--;
							}
							if ((this.aByteArrayArrayArray8[this.anInt1052][local22][local27] & 0x4) != 0) {
								local3 = this.anInt1052;
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
						if ((this.aByteArrayArrayArray8[this.anInt1052][local22][local27] & 0x4) != 0) {
							local3 = this.anInt1052;
						}
						local89 += local87;
						if (local89 >= 65536) {
							local89 -= 65536;
							if (local22 < local32) {
								local22++;
							} else if (local22 > local32) {
								local22--;
							}
							if ((this.aByteArrayArrayArray8[this.anInt1052][local22][local27] & 0x4) != 0) {
								local3 = this.anInt1052;
							}
						}
					}
				}
			}
			if ((this.aByteArrayArrayArray8[this.anInt1052][aClass5_Sub1_Sub2_Sub4_Sub2_1.anInt524 >> 7][aClass5_Sub1_Sub2_Sub4_Sub2_1.anInt525 >> 7] & 0x4) != 0) {
				local3 = this.anInt1052;
			}
			return local3;
		} catch (@Pc(254) RuntimeException local254) {
			signlink.reporterror("68132, " + 5 + ", " + local254.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "y", descriptor = "(I)I")
	private int method689() {
		try {
			@Pc(10) int local10 = this.method594(this.anInt1052, this.anInt925, this.anInt867, this.anInt927);
			return local10 - this.anInt926 >= 800 || (this.aByteArrayArrayArray8[this.anInt1052][this.anInt925 >> 7][this.anInt927 >> 7] & 0x4) == 0 ? 3 : this.anInt1052;
		} catch (@Pc(45) RuntimeException local45) {
			signlink.reporterror("65580, " + 699 + ", " + local45.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Ljava/lang/String;)V")
	private void method690(@OriginalArg(0) String arg0) {
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

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(JI)V")
	private void method691(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1) {
		try {
			if (arg0 != 0L) {
				for (@Pc(8) int local8 = 0; local8 < this.anInt844; local8++) {
					if (this.aLongArray3[local8] == arg0) {
						this.anInt844--;
						this.aBoolean238 = true;
						for (@Pc(28) int local28 = local8; local28 < this.anInt844; local28++) {
							this.aLongArray3[local28] = this.aLongArray3[local28 + 1];
						}
						this.aClass5_Sub1_Sub4_9.method229(38);
						this.aClass5_Sub1_Sub4_9.method236(arg0);
						break;
					}
				}
				@Pc(66) int local66 = 54 / arg1;
			}
		} catch (@Pc(68) RuntimeException local68) {
			signlink.reporterror("39799, " + arg0 + ", " + arg1 + ", " + local68.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "z", descriptor = "(I)V")
	private void method692() {
		try {
			System.out.println("============");
			System.out.println("flame-cycle:" + this.anInt870);
			if (this.aClass9_Sub1_1 != null) {
				System.out.println("Od-cycle:" + this.aClass9_Sub1_1.anInt242);
			}
			System.out.println("loop-cycle:" + anInt1018);
			System.out.println("draw-cycle:" + anInt913);
			System.out.println("ptype:" + this.anInt939);
			System.out.println("psize:" + this.anInt938);
			if (this.aClass17_1 != null) {
				this.aClass17_1.method111();
			}
			super.aBoolean211 = true;
		} catch (@Pc(80) RuntimeException local80) {
			signlink.reporterror("92236, " + 7 + ", " + local80.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(I)Ljava/awt/Component;")
	@Override
	protected Component method583() {
		try {
			if (signlink.mainapp == null) {
				return super.aFrame_Sub1_2 == null ? this : super.aFrame_Sub1_2;
			} else {
				return signlink.mainapp;
			}
		} catch (@Pc(22) RuntimeException local22) {
			signlink.reporterror("80184, " + 9 + ", " + local22.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "A", descriptor = "(I)V")
	private void method693() {
		try {
			this.anInt1016 = 0;
			@Pc(15) int local15 = (aClass5_Sub1_Sub2_Sub4_Sub2_1.anInt524 >> 7) + this.anInt873;
			@Pc(23) int local23 = (aClass5_Sub1_Sub2_Sub4_Sub2_1.anInt525 >> 7) + this.anInt874;
			if (local15 >= 3053 && local15 <= 3156 && local23 >= 3056 && local23 <= 3136) {
				this.anInt1016 = 1;
			}
			if (local15 >= 3072 && local15 <= 3118 && local23 >= 9492 && local23 <= 9535) {
				this.anInt1016 = 1;
			}
			if (this.anInt1016 == 1 && local15 >= 3139 && local15 <= 3199 && local23 >= 3008 && local23 <= 3062) {
				this.anInt1016 = 0;
			}
		} catch (@Pc(74) RuntimeException local74) {
			signlink.reporterror("37418, " + -551 + ", " + local74.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(Z)V")
	@Override
	protected void method582() {
		try {
			this.aBoolean256 = true;
		} catch (@Pc(9) RuntimeException local9) {
			signlink.reporterror("65711, " + true + ", " + local9.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Lclient!PKHWFJLM;II)V")
	private void method694(@OriginalArg(0) Class5_Sub1_Sub4 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		try {
			if (arg2 < this.anInt979 || arg2 > this.anInt979) {
				this.anInt867 = this.aClass23_2.method161();
			}
			while (arg0.anInt430 + 21 < arg1 * 8) {
				@Pc(25) int local25 = arg0.method251(14);
				if (local25 == 16383) {
					break;
				}
				if (this.aClass5_Sub1_Sub2_Sub4_Sub1Array1[local25] == null) {
					this.aClass5_Sub1_Sub2_Sub4_Sub1Array1[local25] = new Class5_Sub1_Sub2_Sub4_Sub1();
				}
				@Pc(45) Class5_Sub1_Sub2_Sub4_Sub1 local45 = this.aClass5_Sub1_Sub2_Sub4_Sub1Array1[local25];
				this.anIntArray243[this.anInt943++] = local25;
				local45.anInt521 = anInt1018;
				@Pc(64) int local64 = arg0.method251(1);
				@Pc(69) int local69 = arg0.method251(5);
				if (local69 > 15) {
					local69 -= 32;
				}
				@Pc(78) int local78 = arg0.method251(1);
				if (local78 == 1) {
					this.anIntArray254[this.anInt985++] = local25;
				}
				local45.aClass49_1 = Class49.method537(arg0.method251(12));
				@Pc(104) int local104 = arg0.method251(5);
				if (local104 > 15) {
					local104 -= 32;
				}
				local45.anInt499 = local45.aClass49_1.aByte20;
				local45.anInt523 = local45.aClass49_1.anInt756;
				local45.anInt538 = local45.aClass49_1.anInt768;
				local45.anInt539 = local45.aClass49_1.anInt759;
				local45.anInt540 = local45.aClass49_1.anInt767;
				local45.anInt541 = local45.aClass49_1.anInt751;
				local45.anInt494 = local45.aClass49_1.anInt764;
				local45.method373(aClass5_Sub1_Sub2_Sub4_Sub2_1.anIntArray151[0] + local69, aClass5_Sub1_Sub2_Sub4_Sub2_1.anIntArray152[0] + local104, local64 == 1);
			}
			arg0.method252();
		} catch (@Pc(171) RuntimeException local171) {
			signlink.reporterror("58434, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local171.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "B", descriptor = "(I)V")
	private void method695() {
		try {
			if (this.anInt838 == 2) {
				for (@Pc(24) Class5_Sub3 local24 = (Class5_Sub3) this.aClass41_10.method468(); local24 != null; local24 = (Class5_Sub3) this.aClass41_10.method470()) {
					if (local24.anInt308 > 0) {
						local24.anInt308--;
					}
					if (local24.anInt308 != 0) {
						if (local24.anInt297 > 0) {
							local24.anInt297--;
						}
						if (local24.anInt297 == 0 && local24.anInt306 >= 1 && local24.anInt307 >= 1 && local24.anInt306 <= 102 && local24.anInt307 <= 102 && (local24.anInt298 < 0 || Class8.method73(local24.anInt298, local24.anInt300))) {
							this.method621(local24.anInt300, local24.anInt298, local24.anInt307, local24.anInt304, local24.anInt306, local24.anInt299, local24.anInt305);
							local24.anInt297 = -1;
							if (local24.anInt298 == local24.anInt301 && local24.anInt301 == -1) {
								local24.method542();
							} else if (local24.anInt298 == local24.anInt301 && local24.anInt299 == local24.anInt302 && local24.anInt300 == local24.anInt303) {
								local24.method542();
							}
						}
					} else if (local24.anInt301 < 0 || Class8.method73(local24.anInt301, local24.anInt303)) {
						this.method621(local24.anInt303, local24.anInt301, local24.anInt307, local24.anInt304, local24.anInt306, local24.anInt302, local24.anInt305);
						local24.method542();
					}
				}
			}
		} catch (@Pc(167) RuntimeException local167) {
			signlink.reporterror("87541, " + 1 + ", " + local167.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "C", descriptor = "(I)V")
	private void method696() {
		try {
			@Pc(3) int local3 = 5;
			this.anIntArray236[8] = 0;
			@Pc(18) int local18 = 0;
			while (this.anIntArray236[8] == 0) {
				@Pc(22) String local22 = "Unknown problem";
				this.method585("Connecting to web server", 20);
				try {
					@Pc(44) DataInputStream local44 = this.method687("crc" + (int) (Math.random() * 9.9999999E7D) + "-" + 340);
					@Pc(51) Class5_Sub1_Sub4 local51 = new Class5_Sub1_Sub4(new byte[40], 0);
					local44.readFully(local51.aByteArray16, 0, 40);
					local44.close();
					for (@Pc(61) int local61 = 0; local61 < 9; local61++) {
						this.anIntArray236[local61] = local51.method245();
					}
					@Pc(76) int local76 = local51.method245();
					@Pc(78) int local78 = 1234;
					for (@Pc(80) int local80 = 0; local80 < 9; local80++) {
						local78 = (local78 << 1) + this.anIntArray236[local80];
					}
					if (local76 != local78) {
						local22 = "checksum problem";
						this.anIntArray236[8] = 0;
					}
				} catch (@Pc(107) EOFException local107) {
					local22 = "EOF problem";
					this.anIntArray236[8] = 0;
				} catch (@Pc(116) IOException local116) {
					local22 = "connection problem";
					this.anIntArray236[8] = 0;
				} catch (@Pc(125) Exception local125) {
					local22 = "logic problem";
					this.anIntArray236[8] = 0;
					if (!signlink.reporterror) {
						return;
					}
				}
				if (this.anIntArray236[8] == 0) {
					local18++;
					for (@Pc(143) int local143 = local3; local143 > 0; local143--) {
						if (local18 >= 10) {
							this.method585("Game updated - please reload page", 10);
							local143 = 10;
						} else {
							this.method585(local22 + " - Will retry in " + local143 + " secs.", 10);
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
					this.aBoolean215 = !this.aBoolean215;
				}
			}
		} catch (@Pc(205) RuntimeException local205) {
			signlink.reporterror("67039, " + -28667 + ", " + local205.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(I)V")
	@Override
	protected void method580() {
		try {
			signlink.reporterror = false;
			try {
				if (this.aClass17_1 != null) {
					this.aClass17_1.method106();
				}
			} catch (@Pc(9) Exception local9) {
			}
			this.aClass17_1 = null;
			this.method601();
			if (this.aClass38_1 != null) {
				this.aClass38_1.aBoolean168 = false;
			}
			this.aClass38_1 = null;
			this.aClass9_Sub1_1.method159();
			this.aClass9_Sub1_1 = null;
			this.aClass5_Sub1_Sub4_8 = null;
			this.aClass5_Sub1_Sub4_9 = null;
			this.aClass5_Sub1_Sub4_7 = null;
			this.aClass5_Sub1_Sub4_6 = null;
			this.anIntArray271 = null;
			this.aByteArrayArray5 = null;
			this.aByteArrayArray6 = null;
			this.anIntArray272 = null;
			this.anIntArray273 = null;
			this.anIntArrayArrayArray8 = null;
			this.aByteArrayArrayArray8 = null;
			this.aClass46_1 = null;
			this.aClass37Array1 = null;
			this.anIntArrayArray24 = null;
			this.anIntArrayArray22 = null;
			this.anIntArray274 = null;
			this.anIntArray275 = null;
			this.aByteArray21 = null;
			this.aClass6_15 = null;
			this.aClass6_16 = null;
			this.aClass6_17 = null;
			this.aClass6_18 = null;
			this.aClass6_3 = null;
			this.aClass6_4 = null;
			this.aClass6_5 = null;
			this.aClass6_19 = null;
			this.aClass6_20 = null;
			this.aClass6_21 = null;
			this.aClass6_22 = null;
			this.aClass6_23 = null;
			this.aClass6_24 = null;
			this.aClass6_25 = null;
			this.aClass6_26 = null;
			this.aClass6_27 = null;
			this.aClass5_Sub1_Sub1_Sub2_6 = null;
			this.aClass5_Sub1_Sub1_Sub2_7 = null;
			this.aClass5_Sub1_Sub1_Sub2_8 = null;
			this.aClass5_Sub1_Sub1_Sub2_1 = null;
			this.aClass5_Sub1_Sub1_Sub2_2 = null;
			this.aClass5_Sub1_Sub1_Sub2_3 = null;
			this.aClass5_Sub1_Sub1_Sub2Array3 = null;
			this.aClass5_Sub1_Sub1_Sub2_16 = null;
			this.aClass5_Sub1_Sub1_Sub2_17 = null;
			this.aClass5_Sub1_Sub1_Sub2_18 = null;
			this.aClass5_Sub1_Sub1_Sub2_19 = null;
			this.aClass5_Sub1_Sub1_Sub2_20 = null;
			this.aClass5_Sub1_Sub1_Sub2_9 = null;
			this.aClass5_Sub1_Sub1_Sub2_10 = null;
			this.aClass5_Sub1_Sub1_Sub2_11 = null;
			this.aClass5_Sub1_Sub1_Sub2_12 = null;
			this.aClass5_Sub1_Sub1_Sub2_13 = null;
			this.aClass5_Sub1_Sub1_Sub3_17 = null;
			this.aClass5_Sub1_Sub1_Sub3Array5 = null;
			this.aClass5_Sub1_Sub1_Sub3Array9 = null;
			this.aClass5_Sub1_Sub1_Sub3Array7 = null;
			this.aClass5_Sub1_Sub1_Sub3Array4 = null;
			this.aClass5_Sub1_Sub1_Sub3Array10 = null;
			this.aClass5_Sub1_Sub1_Sub3_13 = null;
			this.aClass5_Sub1_Sub1_Sub3_6 = null;
			this.aClass5_Sub1_Sub1_Sub3_7 = null;
			this.aClass5_Sub1_Sub1_Sub3_8 = null;
			this.aClass5_Sub1_Sub1_Sub3_9 = null;
			this.aClass5_Sub1_Sub1_Sub3_10 = null;
			this.aClass5_Sub1_Sub1_Sub2Array2 = null;
			this.aClass5_Sub1_Sub1_Sub3Array8 = null;
			this.anIntArrayArray23 = null;
			this.aClass5_Sub1_Sub2_Sub4_Sub2Array1 = null;
			this.anIntArray253 = null;
			this.anIntArray254 = null;
			this.aClass5_Sub1_Sub4Array1 = null;
			this.anIntArray259 = null;
			this.aClass5_Sub1_Sub2_Sub4_Sub1Array1 = null;
			this.anIntArray243 = null;
			this.aClass41ArrayArrayArray1 = null;
			this.aClass41_10 = null;
			this.aClass41_12 = null;
			this.aClass41_11 = null;
			this.anIntArray267 = null;
			this.anIntArray268 = null;
			this.anIntArray269 = null;
			this.anIntArray270 = null;
			this.aStringArray10 = null;
			this.anIntArray216 = null;
			this.anIntArray234 = null;
			this.anIntArray235 = null;
			this.aClass5_Sub1_Sub1_Sub3Array6 = null;
			this.aClass5_Sub1_Sub1_Sub3_14 = null;
			this.aStringArray12 = null;
			this.aLongArray4 = null;
			this.anIntArray240 = null;
			this.aClass6_9 = null;
			this.aClass6_10 = null;
			this.aClass6_6 = null;
			this.aClass6_7 = null;
			this.aClass6_8 = null;
			this.aClass6_11 = null;
			this.aClass6_12 = null;
			this.aClass6_13 = null;
			this.aClass6_14 = null;
			this.method638();
			Class26.method181();
			Class49.method536();
			Class18.method120();
			Class36.method393();
			Class34.aClass34Array1 = null;
			Class33.aClass33Array1 = null;
			Class21.aClass21Array1 = null;
			Class11.aClass11Array1 = null;
			Class20.aClass20Array1 = null;
			Class20.aClass45_3 = null;
			Class48.aClass48Array1 = null;
			super.aClass6_2 = null;
			Class5_Sub1_Sub2_Sub4_Sub2.aClass45_6 = null;
			Class5_Sub1_Sub1_Sub4.method556();
			Class46.method480();
			Class5_Sub1_Sub2_Sub5.method320();
			Class3.method3();
			System.gc();
		} catch (@Pc(372) RuntimeException local372) {
			signlink.reporterror("86187, " + 744 + ", " + local372.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "D", descriptor = "(I)V")
	private void method697() {
		try {
			while (true) {
				@Pc(11) Class5_Sub1_Sub3 local11 = this.aClass9_Sub1_1.method152();
				if (local11 == null) {
					return;
				}
				if (local11.anInt288 == 0) {
					Class5_Sub1_Sub2_Sub5.method322(local11.anInt290, local11.aByteArray14);
					if ((this.aClass9_Sub1_1.method158(local11.anInt290) & 0x62) != 0) {
						this.aBoolean238 = true;
						if (this.anInt931 != -1 || this.anInt1015 != -1) {
							this.aBoolean237 = true;
						}
					}
				}
				if (local11.anInt288 == 1 && local11.aByteArray14 != null) {
					Class3.method2(local11.aByteArray14);
				}
				if (local11.anInt288 == 2 && local11.anInt290 == this.anInt907 && local11.aByteArray14 != null) {
					this.method719(local11.aByteArray14, this.aBoolean234);
				}
				if (local11.anInt288 == 3 && this.anInt838 == 1) {
					for (@Pc(86) int local86 = 0; local86 < this.aByteArrayArray5.length; local86++) {
						if (this.anIntArray272[local86] == local11.anInt290) {
							this.aByteArrayArray5[local86] = local11.aByteArray14;
							if (local11.aByteArray14 == null) {
								this.anIntArray272[local86] = -1;
							}
							break;
						}
						if (this.anIntArray273[local86] == local11.anInt290) {
							this.aByteArrayArray6[local86] = local11.aByteArray14;
							if (local11.aByteArray14 == null) {
								this.anIntArray273[local86] = -1;
							}
							break;
						}
					}
				}
				if (local11.anInt288 == 93 && this.aClass9_Sub1_1.method149(local11.anInt290)) {
					Class8.method59(new Class5_Sub1_Sub4(local11.aByteArray14, 0), this.aClass9_Sub1_1, this.anInt849);
				}
			}
		} catch (@Pc(164) RuntimeException local164) {
			signlink.reporterror("47514, " + -36407 + ", " + local164.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "f", descriptor = "(II)V")
	private void method698(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			if (arg0 < 5 || arg0 > 5) {
				this.method578();
			}
			@Pc(10) Class36 local10 = Class36.method388(arg1);
			for (@Pc(12) int local12 = 0; local12 < local10.anIntArray165.length && local10.anIntArray165[local12] != -1; local12++) {
				@Pc(26) Class36 local26 = Class36.method388(local10.anIntArray165[local12]);
				if (local26.anInt595 == 1) {
					this.method698(this.anInt866, local26.anInt585);
				}
				local26.anInt601 = 0;
				local26.anInt572 = 0;
			}
		} catch (@Pc(50) RuntimeException local50) {
			signlink.reporterror("4764, " + arg0 + ", " + arg1 + ", " + local50.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "E", descriptor = "(I)V")
	private void method699() {
		try {
			if (super.aClass6_2 == null) {
				this.method638();
				this.aClass6_6 = null;
				this.aClass6_7 = null;
				this.aClass6_8 = null;
				this.aClass6_9 = null;
				this.aClass6_10 = null;
				this.aClass6_11 = null;
				this.aClass6_12 = null;
				this.aClass6_13 = null;
				this.aClass6_14 = null;
				this.aClass6_18 = null;
				this.aClass6_16 = null;
				this.aClass6_15 = null;
				this.aClass6_17 = null;
				this.aClass6_3 = null;
				this.aClass6_4 = null;
				this.aClass6_5 = null;
				super.aClass6_2 = new Class6(503, 765, this.method583(), false);
				this.aBoolean256 = true;
			}
		} catch (@Pc(75) RuntimeException local75) {
			signlink.reporterror("35134, " + 0 + ", " + local75.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "g", descriptor = "(II)V")
	private void method700(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(9) Class41 local9 = this.aClass41ArrayArrayArray1[this.anInt1052][arg0][arg1];
		if (local9 == null) {
			this.aClass46_1.method502(this.anInt1052, arg0, arg1);
			return;
		}
		@Pc(21) int local21 = -99999999;
		@Pc(23) Class5_Sub1_Sub2_Sub3 local23 = null;
		@Pc(27) Class5_Sub1_Sub2_Sub3 local27;
		for (local27 = (Class5_Sub1_Sub2_Sub3) local9.method468(); local27 != null; local27 = (Class5_Sub1_Sub2_Sub3) local9.method470()) {
			@Pc(32) Class18 local32 = Class18.method117(local27.anInt257);
			@Pc(35) int local35 = local32.anInt183;
			if (local32.aBoolean54) {
				local35 *= local27.anInt256 + 1;
			}
			if (local35 > local21) {
				local21 = local35;
				local23 = local27;
			}
		}
		local9.method466(local23);
		@Pc(65) Class5_Sub1_Sub2_Sub3 local65 = null;
		@Pc(67) Class5_Sub1_Sub2_Sub3 local67 = null;
		for (local27 = (Class5_Sub1_Sub2_Sub3) local9.method468(); local27 != null; local27 = (Class5_Sub1_Sub2_Sub3) local9.method470()) {
			if (local27.anInt257 != local23.anInt257 && local65 == null) {
				local65 = local27;
			}
			if (local27.anInt257 != local23.anInt257 && local27.anInt257 != local65.anInt257 && local67 == null) {
				local67 = local27;
			}
		}
		@Pc(110) int local110 = arg0 + (arg1 << 7) + 1610612736;
		this.aClass46_1.method488(local65, this.anInt1052, local23, local110, arg0, arg1, local67, this.method594(this.anInt1052, arg0 * 128 + 64, this.anInt867, arg1 * 128 + 64));
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIILclient!RRTTGXYM;I)V")
	private void method701(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class36 arg2, @OriginalArg(4) int arg3) {
		try {
			if (arg2.anInt595 == 0 && arg2.anIntArray165 != null && (!arg2.aBoolean150 || this.anInt832 == arg2.anInt585 || this.anInt858 == arg2.anInt585 || this.anInt996 == arg2.anInt585)) {
				@Pc(29) int local29 = Class5_Sub1_Sub1.anInt777;
				@Pc(31) int local31 = Class5_Sub1_Sub1.anInt775;
				@Pc(33) int local33 = Class5_Sub1_Sub1.anInt778;
				@Pc(35) int local35 = Class5_Sub1_Sub1.anInt776;
				Class5_Sub1_Sub1.method546(arg0 + arg2.anInt579, arg0, arg3, (byte) 6, arg3 + arg2.anInt603);
				@Pc(51) int local51 = arg2.anIntArray165.length;
				for (@Pc(53) int local53 = 0; local53 < local51; local53++) {
					@Pc(62) int local62 = arg2.anIntArray158[local53] + arg3;
					@Pc(71) int local71 = arg2.anIntArray161[local53] + arg0 - arg1;
					@Pc(77) Class36 local77 = Class36.method388(arg2.anIntArray165[local53]);
					@Pc(82) int local82 = local62 + local77.anInt584;
					@Pc(87) int local87 = local71 + local77.anInt596;
					if (local77.anInt591 > 0) {
						this.method603((byte) 5, local77);
					}
					if (local77.anInt595 == 0) {
						if (local77.anInt571 > local77.anInt597 - local77.anInt579) {
							local77.anInt571 = local77.anInt597 - local77.anInt579;
						}
						if (local77.anInt571 < 0) {
							local77.anInt571 = 0;
						}
						this.method701(local87, local77.anInt571, local77, local82);
						if (local77.anInt597 > local77.anInt579) {
							this.method717(local77.anInt597, local77.anInt579, local87, local82 + local77.anInt603, local77.anInt571);
						}
					} else if (local77.anInt595 != 1) {
						@Pc(159) int local159;
						@Pc(163) int local163;
						@Pc(174) int local174;
						@Pc(209) int local209;
						@Pc(216) int local216;
						@Pc(241) int local241;
						@Pc(157) int local157;
						@Pc(207) int local207;
						if (local77.anInt595 == 2) {
							local157 = 0;
							for (local159 = 0; local159 < local77.anInt579; local159++) {
								for (local163 = 0; local163 < local77.anInt603; local163++) {
									local174 = local82 + local163 * (local77.anInt583 + 32);
									@Pc(183) int local183 = local87 + local159 * (local77.anInt605 + 32);
									if (local157 < 20) {
										local174 += local77.anIntArray159[local157];
										local183 += local77.anIntArray160[local157];
									}
									if (local77.anIntArray163[local157] > 0) {
										local207 = 0;
										local209 = 0;
										local216 = local77.anIntArray163[local157] - 1;
										if (local174 > Class5_Sub1_Sub1.anInt777 - 32 && local174 < Class5_Sub1_Sub1.anInt778 && local183 > Class5_Sub1_Sub1.anInt775 - 32 && local183 < Class5_Sub1_Sub1.anInt776 || this.anInt988 != 0 && this.anInt987 == local157) {
											local241 = 0;
											if (this.anInt957 == 1 && this.anInt958 == local157 && this.anInt959 == local77.anInt585) {
												local241 = 16777215;
											}
											@Pc(265) Class5_Sub1_Sub1_Sub3 local265 = Class18.method121(local241, local77.anIntArray166[local157], local216);
											if (local265 != null) {
												@Pc(344) int local344;
												if (this.anInt988 != 0 && this.anInt987 == local157 && this.anInt986 == local77.anInt585) {
													local207 = super.anInt818 - this.anInt989;
													local209 = super.anInt819 - this.anInt990;
													if (local207 < 5 && local207 > -5) {
														local207 = 0;
													}
													if (local209 < 5 && local209 > -5) {
														local209 = 0;
													}
													if (this.anInt934 < 5) {
														local207 = 0;
														local209 = 0;
													}
													local265.method457(local174 + local207, local183 + local209);
													if (local183 + local209 < Class5_Sub1_Sub1.anInt775 && arg2.anInt571 > 0) {
														local344 = this.anInt895 * (Class5_Sub1_Sub1.anInt775 - local183 - local209) / 3;
														if (local344 > this.anInt895 * 10) {
															local344 = this.anInt895 * 10;
														}
														if (local344 > arg2.anInt571) {
															local344 = arg2.anInt571;
														}
														arg2.anInt571 -= local344;
														this.anInt990 += local344;
													}
													if (local183 + local209 + 32 > Class5_Sub1_Sub1.anInt776 && arg2.anInt571 < arg2.anInt597 - arg2.anInt579) {
														local344 = this.anInt895 * (local183 + local209 + 32 - Class5_Sub1_Sub1.anInt776) / 3;
														if (local344 > this.anInt895 * 10) {
															local344 = this.anInt895 * 10;
														}
														if (local344 > arg2.anInt597 - arg2.anInt579 - arg2.anInt571) {
															local344 = arg2.anInt597 - arg2.anInt579 - arg2.anInt571;
														}
														arg2.anInt571 += local344;
														this.anInt990 -= local344;
													}
												} else if (this.anInt1012 != 0 && this.anInt1011 == local157 && this.anInt1010 == local77.anInt585) {
													local265.method457(local174, local183);
												} else {
													local265.method455(local174, local183);
												}
												if (local265.anInt673 == 33 || local77.anIntArray166[local157] != 1) {
													local344 = local77.anIntArray166[local157];
													this.aClass5_Sub1_Sub1_Sub1_2.method44(local174 + local207 + 1, method711(local344), 0, local183 + local209 + 10);
													this.aClass5_Sub1_Sub1_Sub1_2.method44(local174 + local207, method711(local344), 16776960, local183 + local209 + 9);
												}
											}
										}
									} else if (local77.aClass5_Sub1_Sub1_Sub3Array2 != null && local157 < 20) {
										@Pc(533) Class5_Sub1_Sub1_Sub3 local533 = local77.aClass5_Sub1_Sub1_Sub3Array2[local157];
										if (local533 != null) {
											local533.method455(local174, local183);
										}
									}
									local157++;
								}
							}
						} else if (local77.anInt595 == 3) {
							@Pc(558) boolean local558 = false;
							if (this.anInt996 == local77.anInt585 || this.anInt858 == local77.anInt585 || this.anInt832 == local77.anInt585) {
								local558 = true;
							}
							if (this.method619(local77)) {
								local157 = local77.anInt604;
								if (local558 && local77.anInt580 != 0) {
									local157 = local77.anInt580;
								}
							} else {
								local157 = local77.anInt582;
								if (local558 && local77.anInt602 != 0) {
									local157 = local77.anInt602;
								}
							}
							if (local77.aByte15 == 0) {
								if (local77.aBoolean147) {
									Class5_Sub1_Sub1.method549(local157, local82, local77.anInt603, local87, local77.anInt579);
								} else {
									Class5_Sub1_Sub1.method550(local87, local77.anInt579, local157, local82, local77.anInt603);
								}
							} else if (local77.aBoolean147) {
								Class5_Sub1_Sub1.method548(local157, local87, local77.anInt579, 256 - (local77.aByte15 & 0xFF), local82, local77.anInt603);
							} else {
								Class5_Sub1_Sub1.method551(local77.anInt603, 256 - (local77.aByte15 & 0xFF), local82, local77.anInt579, local87, local157);
							}
						} else {
							@Pc(676) Class5_Sub1_Sub1_Sub1 local676;
							@Pc(953) String local953;
							if (local77.anInt595 == 4) {
								local676 = local77.aClass5_Sub1_Sub1_Sub1_1;
								@Pc(679) String local679 = local77.aString14;
								@Pc(681) boolean local681 = false;
								if (this.anInt996 == local77.anInt585 || this.anInt858 == local77.anInt585 || this.anInt832 == local77.anInt585) {
									local681 = true;
								}
								if (this.method619(local77)) {
									local159 = local77.anInt604;
									if (local681 && local77.anInt580 != 0) {
										local159 = local77.anInt580;
									}
									if (local77.aString10.length() > 0) {
										local679 = local77.aString10;
									}
								} else {
									local159 = local77.anInt582;
									if (local681 && local77.anInt602 != 0) {
										local159 = local77.anInt602;
									}
								}
								if (local77.anInt570 == 6 && this.aBoolean227) {
									local679 = "Please wait...";
									local159 = local77.anInt582;
								}
								if (Class5_Sub1_Sub1.anInt773 == 479) {
									if (local159 == 16776960) {
										local159 = 255;
									}
									if (local159 == 49152) {
										local159 = 16777215;
									}
								}
								local207 = local87 + local676.anInt47;
								while (local679.length() > 0) {
									if (local679.indexOf("%") != -1) {
										label386: while (true) {
											local209 = local679.indexOf("%1");
											if (local209 == -1) {
												while (true) {
													local209 = local679.indexOf("%2");
													if (local209 == -1) {
														while (true) {
															local209 = local679.indexOf("%3");
															if (local209 == -1) {
																while (true) {
																	local209 = local679.indexOf("%4");
																	if (local209 == -1) {
																		while (true) {
																			local209 = local679.indexOf("%5");
																			if (local209 == -1) {
																				break label386;
																			}
																			local679 = local679.substring(0, local209) + this.method622(this.method636(local77, 4)) + local679.substring(local209 + 2);
																		}
																	}
																	local679 = local679.substring(0, local209) + this.method622(this.method636(local77, 3)) + local679.substring(local209 + 2);
																}
															}
															local679 = local679.substring(0, local209) + this.method622(this.method636(local77, 2)) + local679.substring(local209 + 2);
														}
													}
													local679 = local679.substring(0, local209) + this.method622(this.method636(local77, 1)) + local679.substring(local209 + 2);
												}
											}
											local679 = local679.substring(0, local209) + this.method622(this.method636(local77, 0)) + local679.substring(local209 + 2);
										}
									}
									local209 = local679.indexOf("\\n");
									if (local209 == -1) {
										local953 = local679;
										local679 = "";
									} else {
										local953 = local679.substring(0, local209);
										local679 = local679.substring(local209 + 2);
									}
									if (local77.aBoolean152) {
										local676.method41(local82 + local77.anInt603 / 2, local953, local77.aBoolean149, local207, local159);
									} else {
										local676.method48(local207, local82, local159, local953, local77.aBoolean149);
									}
									local207 += local676.anInt47;
								}
							} else if (local77.anInt595 == 5) {
								@Pc(1014) Class5_Sub1_Sub1_Sub3 local1014;
								if (this.method619(local77)) {
									local1014 = local77.aClass5_Sub1_Sub1_Sub3_2;
								} else {
									local1014 = local77.aClass5_Sub1_Sub1_Sub3_1;
								}
								if (local1014 != null) {
									local1014.method455(local82, local87);
								}
							} else if (local77.anInt595 == 6) {
								local157 = Class5_Sub1_Sub1_Sub4.anInt785;
								local159 = Class5_Sub1_Sub1_Sub4.anInt786;
								Class5_Sub1_Sub1_Sub4.anInt785 = local82 + local77.anInt603 / 2;
								Class5_Sub1_Sub1_Sub4.anInt786 = local87 + local77.anInt579 / 2;
								local163 = Class5_Sub1_Sub1_Sub4.anIntArray204[local77.anInt587] * local77.anInt586 >> 16;
								local174 = Class5_Sub1_Sub1_Sub4.anIntArray205[local77.anInt587] * local77.anInt586 >> 16;
								@Pc(1075) boolean local1075 = this.method619(local77);
								if (local1075) {
									local207 = local77.anInt574;
								} else {
									local207 = local77.anInt573;
								}
								@Pc(1096) Class5_Sub1_Sub2_Sub5 local1096;
								if (local207 == -1) {
									local1096 = local77.method396(-1, -1, local1075, this.anInt1031);
								} else {
									@Pc(1102) Class11 local1102 = Class11.aClass11Array1[local207];
									local1096 = local77.method396(local1102.anIntArray25[local77.anInt601], local1102.anIntArray26[local77.anInt601], local1075, this.anInt1031);
								}
								if (local1096 != null) {
									local1096.method344(local77.anInt588, 0, local77.anInt587, 0, local163, local174);
								}
								Class5_Sub1_Sub1_Sub4.anInt785 = local157;
								Class5_Sub1_Sub1_Sub4.anInt786 = local159;
							} else {
								if (local77.anInt595 == 7) {
									local676 = local77.aClass5_Sub1_Sub1_Sub1_1;
									local159 = 0;
									for (local163 = 0; local163 < local77.anInt579; local163++) {
										for (local174 = 0; local174 < local77.anInt603; local174++) {
											if (local77.anIntArray163[local159] > 0) {
												@Pc(1167) Class18 local1167 = Class18.method117(local77.anIntArray163[local159] - 1);
												@Pc(1170) String local1170 = local1167.aString2;
												if (local1167.aBoolean54 || local77.anIntArray166[local159] != 1) {
													local1170 = local1170 + " x" + method707(local77.anIntArray166[local159]);
												}
												local209 = local82 + local174 * (local77.anInt583 + 115);
												local216 = local87 + local163 * (local77.anInt605 + 12);
												if (local77.aBoolean152) {
													local676.method41(local209 + local77.anInt603 / 2, local1170, local77.aBoolean149, local216, local77.anInt582);
												} else {
													local676.method48(local216, local209, local77.anInt582, local1170, local77.aBoolean149);
												}
											}
											local159++;
										}
									}
								}
								if (local77.anInt595 == 8 && (this.anInt892 == local77.anInt585 || this.anInt860 == local77.anInt585 || this.anInt1044 == local77.anInt585) && this.anInt953 == 100) {
									local157 = 0;
									local159 = 0;
									@Pc(1284) Class5_Sub1_Sub1_Sub1 local1284 = this.aClass5_Sub1_Sub1_Sub1_3;
									@Pc(1287) String local1287 = local77.aString14;
									while (local1287.length() > 0) {
										local207 = local1287.indexOf("\\n");
										if (local207 == -1) {
											local953 = local1287;
											local1287 = "";
										} else {
											local953 = local1287.substring(0, local207);
											local1287 = local1287.substring(local207 + 2);
										}
										local209 = local1284.method42(local953);
										if (local209 > local157) {
											local157 = local209;
										}
										local159 += local1284.anInt47 + 1;
									}
									local157 += 6;
									local159 += 7;
									local207 = local82 + local77.anInt603 - local157 - 5;
									local209 = local87 + local77.anInt579 + 5;
									if (local207 < local82 + 5) {
										local207 = local82 + 5;
									}
									if (local207 + local157 > arg3 + arg2.anInt603) {
										local207 = arg3 + arg2.anInt603 - local157;
									}
									Class5_Sub1_Sub1.method549(16777120, local207, local157, local209, local159);
									Class5_Sub1_Sub1.method550(local209, local159, 0, local207, local157);
									local1287 = local77.aString14;
									local216 = local209 + local1284.anInt47 + 2;
									while (local1287.length() > 0) {
										local241 = local1287.indexOf("\\n");
										if (local241 == -1) {
											local953 = local1287;
											local1287 = "";
										} else {
											local953 = local1287.substring(0, local241);
											local1287 = local1287.substring(local241 + 2);
										}
										local1284.method48(local216, local207 + 3, 0, local953, false);
										local216 += local1284.anInt47 + 1;
									}
								}
							}
						}
					}
				}
				Class5_Sub1_Sub1.method546(local35, local31, local29, (byte) 6, local33);
			}
		} catch (@Pc(1464) RuntimeException local1464) {
			signlink.reporterror("95709, " + 0 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local1464.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIILclient!YIBRLAQY;I)V")
	private void method702(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class49 arg2, @OriginalArg(4) int arg3) {
		try {
			if (this.anInt956 < 400) {
				if (arg2.anIntArray197 != null) {
					arg2 = arg2.method534();
				}
				if (arg2 != null && arg2.aBoolean194) {
					@Pc(23) String local23 = arg2.aString16;
					@Pc(29) int local29;
					if (this.anInt872 != 7) {
						for (local29 = 1; local29 > 0; local29++) {
						}
					}
					if (arg2.anInt750 != 0) {
						local23 = local23 + method658(arg2.anInt750, (byte) 9, aClass5_Sub1_Sub2_Sub4_Sub2_1.anInt544) + " (level-" + arg2.anInt750 + ")";
					}
					if (this.anInt957 == 1) {
						this.aStringArray10[this.anInt956] = "Use " + this.aString26 + " with @yel@" + local23;
						this.anIntArray269[this.anInt956] = 992;
						this.anIntArray270[this.anInt956] = arg3;
						this.anIntArray267[this.anInt956] = arg0;
						this.anIntArray268[this.anInt956] = arg1;
						this.anInt956++;
					} else if (this.anInt1047 != 1) {
						if (arg2.aStringArray7 != null) {
							for (local29 = 4; local29 >= 0; local29--) {
								if (arg2.aStringArray7[local29] != null && !arg2.aStringArray7[local29].equalsIgnoreCase("attack")) {
									this.aStringArray10[this.anInt956] = arg2.aStringArray7[local29] + " @yel@" + local23;
									if (local29 == 0) {
										this.anIntArray269[this.anInt956] = 597;
									}
									if (local29 == 1) {
										this.anIntArray269[this.anInt956] = 196;
									}
									if (local29 == 2) {
										this.anIntArray269[this.anInt956] = 994;
									}
									if (local29 == 3) {
										this.anIntArray269[this.anInt956] = 773;
									}
									if (local29 == 4) {
										this.anIntArray269[this.anInt956] = 218;
									}
									this.anIntArray270[this.anInt956] = arg3;
									this.anIntArray267[this.anInt956] = arg0;
									this.anIntArray268[this.anInt956] = arg1;
									this.anInt956++;
								}
							}
						}
						if (arg2.aStringArray7 != null) {
							for (local29 = 4; local29 >= 0; local29--) {
								if (arg2.aStringArray7[local29] != null && arg2.aStringArray7[local29].equalsIgnoreCase("attack")) {
									@Pc(296) short local296 = 0;
									if (arg2.anInt750 > aClass5_Sub1_Sub2_Sub4_Sub2_1.anInt544) {
										local296 = 2000;
									}
									this.aStringArray10[this.anInt956] = arg2.aStringArray7[local29] + " @yel@" + local23;
									if (local29 == 0) {
										this.anIntArray269[this.anInt956] = local296 + 597;
									}
									if (local29 == 1) {
										this.anIntArray269[this.anInt956] = local296 + 196;
									}
									if (local29 == 2) {
										this.anIntArray269[this.anInt956] = local296 + 994;
									}
									if (local29 == 3) {
										this.anIntArray269[this.anInt956] = local296 + 773;
									}
									if (local29 == 4) {
										this.anIntArray269[this.anInt956] = local296 + 218;
									}
									this.anIntArray270[this.anInt956] = arg3;
									this.anIntArray267[this.anInt956] = arg0;
									this.anIntArray268[this.anInt956] = arg1;
									this.anInt956++;
								}
							}
						}
						this.aStringArray10[this.anInt956] = "Examine @yel@" + local23;
						this.anIntArray269[this.anInt956] = 1825;
						this.anIntArray270[this.anInt956] = arg3;
						this.anIntArray267[this.anInt956] = arg0;
						this.anIntArray268[this.anInt956] = arg1;
						this.anInt956++;
					} else if ((this.anInt1049 & 0x2) == 2) {
						this.aStringArray10[this.anInt956] = this.aString30 + " @yel@" + local23;
						this.anIntArray269[this.anInt956] = 954;
						this.anIntArray270[this.anInt956] = arg3;
						this.anIntArray267[this.anInt956] = arg0;
						this.anIntArray268[this.anInt956] = arg1;
						this.anInt956++;
						return;
					}
				}
			}
		} catch (@Pc(446) RuntimeException local446) {
			signlink.reporterror("64970, " + 7 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local446.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "F", descriptor = "(I)V")
	private void method703() {
		try {
			this.aClass6_16.method55();
			@Pc(18) int local18;
			@Pc(20) int local20;
			if (this.anInt1019 == 2) {
				@Pc(13) byte[] local13 = this.aClass5_Sub1_Sub1_Sub2_7.aByteArray17;
				@Pc(15) int[] local15 = Class5_Sub1_Sub1.anIntArray201;
				local18 = local13.length;
				for (local20 = 0; local20 < local18; local20++) {
					if (local13[local20] == 0) {
						local15[local20] = 0;
					}
				}
				this.aClass5_Sub1_Sub1_Sub3_17.method459(this.anInt945, 33, this.anIntArray238, 25, 25, 0, 0, this.anIntArray212, 33, 256);
				this.aClass6_17.method55();
				Class5_Sub1_Sub1_Sub4.anIntArray206 = this.anIntArray231;
			} else {
				@Pc(67) int local67 = this.anInt945 + this.anInt893 & 0x7FF;
				@Pc(74) int local74 = aClass5_Sub1_Sub2_Sub4_Sub2_1.anInt524 / 32 + 48;
				local18 = 464 - aClass5_Sub1_Sub2_Sub4_Sub2_1.anInt525 / 32;
				this.aClass5_Sub1_Sub1_Sub3_14.method459(local67, 146, this.anIntArray215, local18, local74, 5, 25, this.anIntArray239, 151, this.anInt918 + 256);
				this.aClass5_Sub1_Sub1_Sub3_17.method459(this.anInt945, 33, this.anIntArray238, 25, 25, 0, 0, this.anIntArray212, 33, 256);
				this.anInt938 += 0;
				for (local20 = 0; local20 < this.anInt890; local20++) {
					local74 = this.anIntArray234[local20] * 4 + 2 - aClass5_Sub1_Sub2_Sub4_Sub2_1.anInt524 / 32;
					local18 = this.anIntArray235[local20] * 4 + 2 - aClass5_Sub1_Sub2_Sub4_Sub2_1.anInt525 / 32;
					this.method678(local18, this.aClass5_Sub1_Sub1_Sub3Array6[local20], local74);
				}
				@Pc(175) int local175;
				for (@Pc(171) int local171 = 0; local171 < 104; local171++) {
					for (local175 = 0; local175 < 104; local175++) {
						@Pc(187) Class41 local187 = this.aClass41ArrayArrayArray1[this.anInt1052][local171][local175];
						if (local187 != null) {
							local74 = local171 * 4 + 2 - aClass5_Sub1_Sub2_Sub4_Sub2_1.anInt524 / 32;
							local18 = local175 * 4 + 2 - aClass5_Sub1_Sub2_Sub4_Sub2_1.anInt525 / 32;
							this.method678(local18, this.aClass5_Sub1_Sub1_Sub3_6, local74);
						}
					}
				}
				for (local175 = 0; local175 < this.anInt943; local175++) {
					@Pc(238) Class5_Sub1_Sub2_Sub4_Sub1 local238 = this.aClass5_Sub1_Sub2_Sub4_Sub1Array1[this.anIntArray243[local175]];
					if (local238 != null && local238.method372()) {
						@Pc(247) Class49 local247 = local238.aClass49_1;
						if (local247.anIntArray197 != null) {
							local247 = local247.method534();
						}
						if (local247 != null && local247.aBoolean197 && local247.aBoolean194) {
							local74 = local238.anInt524 / 32 - aClass5_Sub1_Sub2_Sub4_Sub2_1.anInt524 / 32;
							local18 = local238.anInt525 / 32 - aClass5_Sub1_Sub2_Sub4_Sub2_1.anInt525 / 32;
							this.method678(local18, this.aClass5_Sub1_Sub1_Sub3_7, local74);
						}
					}
				}
				@Pc(306) Class5_Sub1_Sub2_Sub4_Sub2 local306;
				for (@Pc(296) int local296 = 0; local296 < this.anInt984; local296++) {
					local306 = this.aClass5_Sub1_Sub2_Sub4_Sub2Array1[this.anIntArray253[local296]];
					if (local306 != null && local306.method372()) {
						local74 = local306.anInt524 / 32 - aClass5_Sub1_Sub2_Sub4_Sub2_1.anInt524 / 32;
						local18 = local306.anInt525 / 32 - aClass5_Sub1_Sub2_Sub4_Sub2_1.anInt525 / 32;
						@Pc(334) boolean local334 = false;
						@Pc(338) long local338 = Class28.method191(local306.aString8);
						for (@Pc(340) int local340 = 0; local340 < this.anInt840; local340++) {
							if (local338 == this.aLongArray4[local340] && this.anIntArray240[local340] != 0) {
								local334 = true;
								break;
							}
						}
						@Pc(365) boolean local365 = false;
						if (aClass5_Sub1_Sub2_Sub4_Sub2_1.anInt558 != 0 && local306.anInt558 != 0 && aClass5_Sub1_Sub2_Sub4_Sub2_1.anInt558 == local306.anInt558) {
							local365 = true;
						}
						if (local334) {
							this.method678(local18, this.aClass5_Sub1_Sub1_Sub3_9, local74);
						} else if (local365) {
							this.method678(local18, this.aClass5_Sub1_Sub1_Sub3_10, local74);
						} else {
							this.method678(local18, this.aClass5_Sub1_Sub1_Sub3_8, local74);
						}
					}
				}
				if (this.anInt856 != 0 && anInt1018 % 20 < 10) {
					if (this.anInt856 == 1 && this.anInt886 >= 0 && this.anInt886 < this.aClass5_Sub1_Sub2_Sub4_Sub1Array1.length) {
						@Pc(439) Class5_Sub1_Sub2_Sub4_Sub1 local439 = this.aClass5_Sub1_Sub2_Sub4_Sub1Array1[this.anInt886];
						if (local439 != null) {
							local74 = local439.anInt524 / 32 - aClass5_Sub1_Sub2_Sub4_Sub2_1.anInt524 / 32;
							local18 = local439.anInt525 / 32 - aClass5_Sub1_Sub2_Sub4_Sub2_1.anInt525 / 32;
							this.method685(this.aClass5_Sub1_Sub1_Sub3_4, local18, local74);
						}
					}
					if (this.anInt856 == 2) {
						local74 = (this.anInt900 - this.anInt873) * 4 + 2 - aClass5_Sub1_Sub2_Sub4_Sub2_1.anInt524 / 32;
						local18 = (this.anInt901 - this.anInt874) * 4 + 2 - aClass5_Sub1_Sub2_Sub4_Sub2_1.anInt525 / 32;
						this.method685(this.aClass5_Sub1_Sub1_Sub3_4, local18, local74);
					}
					if (this.anInt856 == 10 && this.anInt961 >= 0 && this.anInt961 < this.aClass5_Sub1_Sub2_Sub4_Sub2Array1.length) {
						local306 = this.aClass5_Sub1_Sub2_Sub4_Sub2Array1[this.anInt961];
						if (local306 != null) {
							local74 = local306.anInt524 / 32 - aClass5_Sub1_Sub2_Sub4_Sub2_1.anInt524 / 32;
							local18 = local306.anInt525 / 32 - aClass5_Sub1_Sub2_Sub4_Sub2_1.anInt525 / 32;
							this.method685(this.aClass5_Sub1_Sub1_Sub3_4, local18, local74);
						}
					}
				}
				if (this.anInt1028 != 0) {
					local74 = this.anInt1028 * 4 + 2 - aClass5_Sub1_Sub2_Sub4_Sub2_1.anInt524 / 32;
					local18 = this.anInt1029 * 4 + 2 - aClass5_Sub1_Sub2_Sub4_Sub2_1.anInt525 / 32;
					this.method678(local18, this.aClass5_Sub1_Sub1_Sub3_3, local74);
				}
				Class5_Sub1_Sub1.method549(16777215, 97, 3, 78, 3);
				this.aClass6_17.method55();
				Class5_Sub1_Sub1_Sub4.anIntArray206 = this.anIntArray231;
			}
		} catch (@Pc(607) RuntimeException local607) {
			signlink.reporterror("43872, " + 0 + ", " + local607.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIIIII)V")
	private void method704(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		try {
			@Pc(5) int local5 = 2048 - arg5 & 0x7FF;
			@Pc(11) int local11 = 2048 - arg4 & 0x7FF;
			this.anInt938 += 0;
			@Pc(19) int local19 = 0;
			@Pc(21) int local21 = 0;
			@Pc(23) int local23 = arg3;
			@Pc(29) int local29;
			@Pc(33) int local33;
			@Pc(43) int local43;
			if (local5 != 0) {
				local29 = Class5_Sub1_Sub2_Sub5.anIntArray141[local5];
				local33 = Class5_Sub1_Sub2_Sub5.anIntArray142[local5];
				local43 = local33 * 0 - arg3 * local29 >> 16;
				local23 = local29 * 0 + arg3 * local33 >> 16;
				local21 = local43;
			}
			if (local11 != 0) {
				local29 = Class5_Sub1_Sub2_Sub5.anIntArray141[local11];
				local33 = Class5_Sub1_Sub2_Sub5.anIntArray142[local11];
				local43 = local23 * local29 + local33 * 0 >> 16;
				local23 = local23 * local33 - local29 * 0 >> 16;
				local19 = local43;
			}
			this.anInt925 = arg2 - local19;
			this.anInt926 = arg0 - local21;
			this.anInt927 = arg1 - local23;
			this.anInt928 = arg5;
			this.anInt929 = arg4;
		} catch (@Pc(110) RuntimeException local110) {
			signlink.reporterror("40060, " + 0 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local110.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
	@Override
	public String getParameter(@OriginalArg(0) String arg0) {
		return signlink.mainapp == null ? super.getParameter(arg0) : signlink.mainapp.getParameter(arg0);
	}

	@OriginalMember(owner = "client!client", name = "i", descriptor = "(B)V")
	private void method705() {
		try {
			@Pc(7) int local7 = this.aClass5_Sub1_Sub1_Sub1_4.method42("Choose Option");
			@Pc(20) int local20;
			for (@Pc(9) int local9 = 0; local9 < this.anInt956; local9++) {
				local20 = this.aClass5_Sub1_Sub1_Sub1_4.method42(this.aStringArray10[local9]);
				if (local20 > local7) {
					local7 = local20;
				}
			}
			local7 += 8;
			local20 = this.anInt956 * 15 + 21;
			@Pc(69) int local69;
			@Pc(87) int local87;
			if (super.anInt824 > 4 && super.anInt825 > 4 && super.anInt824 < 516 && super.anInt825 < 338) {
				local69 = super.anInt824 - local7 / 2 - 4;
				if (local69 + local7 > 512) {
					local69 = 512 - local7;
				}
				if (local69 < 0) {
					local69 = 0;
				}
				local87 = super.anInt825 - 4;
				if (local87 + local20 > 334) {
					local87 = 334 - local20;
				}
				if (local87 < 0) {
					local87 = 0;
				}
				this.aBoolean240 = true;
				this.anInt969 = 0;
				this.anInt970 = local69;
				this.anInt971 = local87;
				this.anInt972 = local7;
				this.anInt973 = this.anInt956 * 15 + 22;
			}
			if (super.anInt824 > 553 && super.anInt825 > 205 && super.anInt824 < 743 && super.anInt825 < 466) {
				local69 = super.anInt824 - local7 / 2 - 553;
				if (local69 < 0) {
					local69 = 0;
				} else if (local69 + local7 > 190) {
					local69 = 190 - local7;
				}
				local87 = super.anInt825 - 205;
				if (local87 < 0) {
					local87 = 0;
				} else if (local87 + local20 > 261) {
					local87 = 261 - local20;
				}
				this.aBoolean240 = true;
				this.anInt969 = 1;
				this.anInt970 = local69;
				this.anInt971 = local87;
				this.anInt972 = local7;
				this.anInt973 = this.anInt956 * 15 + 22;
			}
			if (super.anInt824 > 17 && super.anInt825 > 357 && super.anInt824 < 496 && super.anInt825 < 453) {
				local69 = super.anInt824 - local7 / 2 - 17;
				if (local69 < 0) {
					local69 = 0;
				} else if (local69 + local7 > 479) {
					local69 = 479 - local7;
				}
				local87 = super.anInt825 - 357;
				if (local87 < 0) {
					local87 = 0;
				} else if (local87 + local20 > 96) {
					local87 = 96 - local20;
				}
				this.aBoolean240 = true;
				this.anInt969 = 2;
				this.anInt970 = local69;
				this.anInt971 = local87;
				this.anInt972 = local7;
				this.anInt973 = this.anInt956 * 15 + 22;
			}
		} catch (@Pc(291) RuntimeException local291) {
			signlink.reporterror("61180, " + -109 + ", " + local291.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "G", descriptor = "(I)V")
	private void method706() {
		try {
			if (this.anInt956 >= 2 || this.anInt957 != 0 || this.anInt1047 != 0) {
				@Pc(36) String local36;
				if (this.anInt957 == 1 && this.anInt956 < 2) {
					local36 = "Use " + this.aString26 + " with...";
				} else if (this.anInt1047 == 1 && this.anInt956 < 2) {
					local36 = this.aString30 + "...";
				} else {
					local36 = this.aStringArray10[this.anInt956 - 1];
				}
				if (this.anInt956 > 2) {
					local36 = local36 + "@whi@ / " + (this.anInt956 - 2) + " more options";
				}
				this.aClass5_Sub1_Sub1_Sub1_4.method49(anInt1018 / 1000, 4, local36, 15, 16777215);
			}
		} catch (@Pc(100) RuntimeException local100) {
			signlink.reporterror("83261, " + -3568 + ", " + local100.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(IJ)V")
	private void method708(@OriginalArg(1) long arg0) {
		try {
			if (arg0 != 0L) {
				for (@Pc(22) int local22 = 0; local22 < this.anInt840; local22++) {
					if (this.aLongArray4[local22] == arg0) {
						this.anInt840--;
						this.aBoolean238 = true;
						for (@Pc(42) int local42 = local22; local42 < this.anInt840; local42++) {
							this.aStringArray12[local42] = this.aStringArray12[local42 + 1];
							this.anIntArray240[local42] = this.anIntArray240[local42 + 1];
							this.aLongArray4[local42] = this.aLongArray4[local42 + 1];
						}
						this.aClass5_Sub1_Sub4_9.method229(150);
						this.aClass5_Sub1_Sub4_9.method236(arg0);
						return;
					}
				}
			}
		} catch (@Pc(97) RuntimeException local97) {
			signlink.reporterror("18062, " + 8 + ", " + arg0 + ", " + local97.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "H", descriptor = "(I)V")
	private void method709() {
		try {
			this.aClass6_15.method55();
			Class5_Sub1_Sub1_Sub4.anIntArray206 = this.anIntArray230;
			this.aClass5_Sub1_Sub1_Sub2_6.method417(0, 0);
			if (this.anInt1014 != -1) {
				this.method701(0, 0, Class36.method388(this.anInt1014), 0);
			} else if (this.anIntArray244[this.anInt908] != -1) {
				this.method701(0, 0, Class36.method388(this.anIntArray244[this.anInt908]), 0);
			}
			if (this.aBoolean240 && this.anInt969 == 1) {
				this.method620();
			}
			this.aClass6_15.method56(205, super.aGraphics2, 553);
			this.aClass6_17.method55();
			Class5_Sub1_Sub1_Sub4.anIntArray206 = this.anIntArray231;
		} catch (@Pc(85) RuntimeException local85) {
			signlink.reporterror("5186, " + 4 + ", " + local85.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "j", descriptor = "(B)V")
	private void method710() {
		try {
			if (this.anInt988 == 0) {
				@Pc(6) int local6 = super.anInt823;
				if (this.anInt1047 == 1 && super.anInt824 >= 516 && super.anInt825 >= 160 && super.anInt824 <= 765 && super.anInt825 <= 205) {
					local6 = 0;
				}
				@Pc(48) int local48;
				@Pc(51) int local51;
				@Pc(127) int local127;
				if (this.aBoolean240) {
					if (local6 != 1) {
						local48 = super.anInt818;
						local51 = super.anInt819;
						if (this.anInt969 == 0) {
							local48 -= 4;
							local51 -= 4;
						}
						if (this.anInt969 == 1) {
							local48 -= 553;
							local51 -= 205;
						}
						if (this.anInt969 == 2) {
							local48 -= 17;
							local51 -= 357;
						}
						if (local48 < this.anInt970 - 10 || local48 > this.anInt970 + this.anInt972 + 10 || local51 < this.anInt971 - 10 || local51 > this.anInt971 + this.anInt973 + 10) {
							this.aBoolean240 = false;
							if (this.anInt969 == 1) {
								this.aBoolean238 = true;
							}
							if (this.anInt969 == 2) {
								this.aBoolean237 = true;
							}
						}
					}
					if (local6 == 1) {
						local48 = this.anInt970;
						local51 = this.anInt971;
						local127 = this.anInt972;
						@Pc(130) int local130 = super.anInt824;
						@Pc(133) int local133 = super.anInt825;
						if (this.anInt969 == 0) {
							local130 -= 4;
							local133 -= 4;
						}
						if (this.anInt969 == 1) {
							local130 -= 553;
							local133 -= 205;
						}
						if (this.anInt969 == 2) {
							local130 -= 17;
							local133 -= 357;
						}
						@Pc(152) int local152 = -1;
						for (@Pc(154) int local154 = 0; local154 < this.anInt956; local154++) {
							@Pc(169) int local169 = local51 + (this.anInt956 - 1 - local154) * 15 + 31;
							if (local130 > local48 && local130 < local48 + local127 && local133 > local169 - 13 && local133 < local169 + 3) {
								local152 = local154;
							}
						}
						if (local152 != -1) {
							this.method661(this.anInt896, local152);
						}
						this.aBoolean240 = false;
						if (this.anInt969 == 1) {
							this.aBoolean238 = true;
						}
						if (this.anInt969 == 2) {
							this.aBoolean237 = true;
							return;
						}
					}
				} else {
					if (local6 == 1 && this.anInt956 > 0) {
						local48 = this.anIntArray269[this.anInt956 - 1];
						if (local48 == 849 || local48 == 92 || local48 == 204 || local48 == 357 || local48 == 371 || local48 == 99 || local48 == 600 || local48 == 300 || local48 == 194 || local48 == 840 || local48 == 901 || local48 == 1630) {
							local51 = this.anIntArray267[this.anInt956 - 1];
							local127 = this.anIntArray268[this.anInt956 - 1];
							@Pc(289) Class36 local289 = Class36.method388(local127);
							if (local289.aBoolean154 || local289.aBoolean146) {
								this.aBoolean225 = false;
								this.anInt934 = 0;
								this.anInt986 = local127;
								this.anInt987 = local51;
								this.anInt988 = 2;
								this.anInt989 = super.anInt824;
								this.anInt990 = super.anInt825;
								if (Class36.method388(local127).anInt575 == this.anInt949) {
									this.anInt988 = 1;
								}
								if (Class36.method388(local127).anInt575 == this.anInt931) {
									this.anInt988 = 3;
								}
								return;
							}
						}
					}
					if (local6 == 1 && (this.anInt1046 == 1 || this.method606(this.anInt956 - 1)) && this.anInt956 > 2) {
						local6 = 2;
					}
					if (local6 == 1 && this.anInt956 > 0) {
						this.method661(this.anInt896, this.anInt956 - 1);
					}
					if (local6 != 2 || this.anInt956 <= 0) {
						return;
					}
					this.method705();
				}
			}
		} catch (@Pc(383) RuntimeException local383) {
			signlink.reporterror("40800, " + 3 + ", " + local383.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IBLclient!QGDSNXKJ;II)V")
	private void method712(@OriginalArg(0) int arg0, @OriginalArg(2) Class5_Sub1_Sub2_Sub4_Sub2 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		try {
			if (arg1 != aClass5_Sub1_Sub2_Sub4_Sub2_1 && this.anInt956 < 400) {
				@Pc(35) String local35;
				if (arg1.anInt559 == 0) {
					local35 = arg1.aString8 + method658(arg1.anInt544, (byte) 9, aClass5_Sub1_Sub2_Sub4_Sub2_1.anInt544) + " (level-" + arg1.anInt544 + ")";
				} else {
					local35 = arg1.aString8 + " (skill-" + arg1.anInt559 + ")";
				}
				@Pc(165) int local165;
				if (this.anInt957 == 1) {
					this.aStringArray10[this.anInt956] = "Use " + this.aString26 + " with @whi@" + local35;
					this.anIntArray269[this.anInt956] = 517;
					this.anIntArray270[this.anInt956] = arg2;
					this.anIntArray267[this.anInt956] = arg0;
					this.anIntArray268[this.anInt956] = arg3;
					this.anInt956++;
				} else if (this.anInt1047 != 1) {
					for (local165 = 4; local165 >= 0; local165--) {
						if (this.aStringArray13[local165] != null) {
							this.aStringArray10[this.anInt956] = this.aStringArray13[local165] + " @whi@" + local35;
							@Pc(192) short local192 = 0;
							if (this.aStringArray13[local165].equalsIgnoreCase("attack")) {
								if (arg1.anInt544 > aClass5_Sub1_Sub2_Sub4_Sub2_1.anInt544) {
									local192 = 2000;
								}
								if (aClass5_Sub1_Sub2_Sub4_Sub2_1.anInt558 != 0 && arg1.anInt558 != 0) {
									if (aClass5_Sub1_Sub2_Sub4_Sub2_1.anInt558 == arg1.anInt558) {
										local192 = 2000;
									} else {
										local192 = 0;
									}
								}
							} else if (this.aBooleanArray12[local165]) {
								local192 = 2000;
							}
							if (local165 == 0) {
								this.anIntArray269[this.anInt956] = local192 + 41;
							}
							if (local165 == 1) {
								this.anIntArray269[this.anInt956] = local192 + 481;
							}
							if (local165 == 2) {
								this.anIntArray269[this.anInt956] = local192 + 771;
							}
							if (local165 == 3) {
								this.anIntArray269[this.anInt956] = local192 + 830;
							}
							if (local165 == 4) {
								this.anIntArray269[this.anInt956] = local192 + 738;
							}
							this.anIntArray270[this.anInt956] = arg2;
							this.anIntArray267[this.anInt956] = arg0;
							this.anIntArray268[this.anInt956] = arg3;
							this.anInt956++;
						}
					}
				} else if ((this.anInt1049 & 0x8) == 8) {
					this.aStringArray10[this.anInt956] = this.aString30 + " @whi@" + local35;
					this.anIntArray269[this.anInt956] = 537;
					this.anIntArray270[this.anInt956] = arg2;
					this.anIntArray267[this.anInt956] = arg0;
					this.anIntArray268[this.anInt956] = arg3;
					this.anInt956++;
				}
				for (local165 = 0; local165 < this.anInt956; local165++) {
					if (this.anIntArray269[local165] == 124) {
						this.aStringArray10[local165] = "Walk here @whi@" + local35;
						break;
					}
				}
			}
		} catch (@Pc(350) RuntimeException local350) {
			signlink.reporterror("74941, " + arg0 + ", " + 120 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local350.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IILjava/lang/String;IILjava/lang/String;)Lclient!TXPLZUUI;")
	private Class40 method713(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3, @OriginalArg(5) String arg4) {
		try {
			this.anInt938 += 0;
			@Pc(9) byte[] local9 = null;
			@Pc(11) int local11 = 5;
			try {
				if (this.aClass42Array1[0] != null) {
					local9 = this.aClass42Array1[0].method473(arg3, this.aBoolean246);
				}
			} catch (@Pc(27) Exception local27) {
			}
			@Pc(41) int local41;
			if (local9 != null) {
				this.aCRC32_2.reset();
				this.aCRC32_2.update(local9);
				local41 = (int) this.aCRC32_2.getValue();
				if (local41 != arg1) {
					local9 = null;
				}
			}
			if (local9 != null) {
				return new Class40(local9, true);
			}
			local41 = 0;
			while (local9 == null) {
				@Pc(62) String local62 = "Unknown error";
				this.method585("Requesting " + arg2, arg0);
				@Pc(77) int local77;
				try {
					local77 = 0;
					@Pc(88) DataInputStream local88 = this.method687(arg4 + arg1);
					@Pc(91) byte[] local91 = new byte[6];
					local88.readFully(local91, 0, 6);
					@Pc(102) Class5_Sub1_Sub4 local102 = new Class5_Sub1_Sub4(local91, 0);
					local102.anInt429 = 3;
					@Pc(110) int local110 = local102.method244() + 6;
					@Pc(112) int local112 = 6;
					local9 = new byte[local110];
					for (@Pc(117) int local117 = 0; local117 < 6; local117++) {
						local9[local117] = local91[local117];
					}
					@Pc(134) int local134;
					while (local112 < local110) {
						local134 = local110 - local112;
						if (local134 > 1000) {
							local134 = 1000;
						}
						@Pc(145) int local145 = local88.read(local9, local112, local134);
						if (local145 < 0) {
							(new StringBuffer("Length error: ")).append(local112).append("/").append(local110).toString();
							throw new IOException("EOF");
						}
						local112 += local145;
						@Pc(174) int local174 = local112 * 100 / local110;
						if (local174 != local77) {
							this.method585("Loading " + arg2 + " - " + local174 + "%", arg0);
						}
						local77 = local174;
					}
					local88.close();
					try {
						if (this.aClass42Array1[0] != null) {
							this.aClass42Array1[0].method474(local9, arg3, local9.length);
						}
					} catch (@Pc(219) Exception local219) {
						this.aClass42Array1[0] = null;
					}
					if (local9 != null) {
						this.aCRC32_2.reset();
						this.aCRC32_2.update(local9);
						local134 = (int) this.aCRC32_2.getValue();
						if (local134 != arg1) {
							local9 = null;
							local41++;
							local62 = "Checksum error: " + local134;
						}
					}
				} catch (@Pc(254) IOException local254) {
					if (local62.equals("Unknown error")) {
						local62 = "Connection error";
					}
					local9 = null;
				} catch (@Pc(264) NullPointerException local264) {
					local62 = "Null error";
					local9 = null;
					if (!signlink.reporterror) {
						return null;
					}
				} catch (@Pc(273) ArrayIndexOutOfBoundsException local273) {
					local62 = "Bounds error";
					local9 = null;
					if (!signlink.reporterror) {
						return null;
					}
				} catch (@Pc(282) Exception local282) {
					local62 = "Unexpected error";
					local9 = null;
					if (!signlink.reporterror) {
						return null;
					}
				}
				if (local9 == null) {
					for (local77 = local11; local77 > 0; local77--) {
						if (local41 >= 3) {
							this.method585("Game updated - please reload page", arg0);
							local77 = 10;
						} else {
							this.method585(local62 + " - Retrying in " + local77, arg0);
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
					this.aBoolean215 = !this.aBoolean215;
				}
			}
			return new Class40(local9, true);
		} catch (@Pc(358) RuntimeException local358) {
			signlink.reporterror("80321, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + 0 + ", " + arg4 + ", " + local358.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "k", descriptor = "(B)V")
	private void method714() {
		try {
			if (this.anInt988 == 0) {
				this.aStringArray10[0] = "Cancel";
				this.anIntArray269[0] = 1159;
				this.anInt956 = 1;
				if (this.anInt889 == -1) {
					this.method680();
					this.anInt962 = 0;
					this.anInt839 = 0;
					if (super.anInt818 > 4 && super.anInt819 > 4 && super.anInt818 < 516 && super.anInt819 < 338) {
						if (this.anInt949 == -1) {
							this.method602();
						} else {
							this.method675(super.anInt819, 0, super.anInt818, 0, 4, Class36.method388(this.anInt949), 4);
						}
					}
					if (this.anInt962 != this.anInt832) {
						this.anInt832 = this.anInt962;
					}
					if (this.anInt839 != this.anInt1044) {
						this.anInt1044 = this.anInt839;
					}
					this.anInt962 = 0;
					this.anInt839 = 0;
					if (super.anInt818 > 553 && super.anInt819 > 205 && super.anInt818 < 743 && super.anInt819 < 466) {
						if (this.anInt1014 != -1) {
							this.method675(super.anInt819, 0, super.anInt818, 1, 205, Class36.method388(this.anInt1014), 553);
						} else if (this.anIntArray244[this.anInt908] != -1) {
							this.method675(super.anInt819, 0, super.anInt818, 1, 205, Class36.method388(this.anIntArray244[this.anInt908]), 553);
						}
					}
					if (this.anInt962 != this.anInt858) {
						this.aBoolean238 = true;
						this.anInt858 = this.anInt962;
					}
					if (this.anInt839 != this.anInt860) {
						this.aBoolean238 = true;
						this.anInt860 = this.anInt839;
					}
					this.anInt962 = 0;
					this.anInt839 = 0;
					if (super.anInt818 > 17 && super.anInt819 > 357 && super.anInt818 < 496 && super.anInt819 < 453) {
						if (this.anInt931 != -1) {
							this.method675(super.anInt819, 0, super.anInt818, 2, 357, Class36.method388(this.anInt931), 17);
						} else if (this.anInt1015 != -1) {
							this.method675(super.anInt819, 0, super.anInt818, 3, 357, Class36.method388(this.anInt1015), 17);
						} else if (super.anInt819 < 434 && super.anInt818 < 426) {
							this.method634(super.anInt819 - 357, super.anInt818 - 17);
						}
					}
					if ((this.anInt931 != -1 || this.anInt1015 != -1) && this.anInt962 != this.anInt996) {
						this.aBoolean237 = true;
						this.anInt996 = this.anInt962;
					}
					if ((this.anInt931 != -1 || this.anInt1015 != -1) && this.anInt839 != this.anInt892) {
						this.aBoolean237 = true;
						this.anInt892 = this.anInt839;
					}
					@Pc(340) boolean local340 = false;
					while (!local340) {
						local340 = true;
						for (@Pc(353) int local353 = 0; local353 < this.anInt956 - 1; local353++) {
							if (this.anIntArray269[local353] < 1000 && this.anIntArray269[local353 + 1] > 1000) {
								@Pc(374) String local374 = this.aStringArray10[local353];
								this.aStringArray10[local353] = this.aStringArray10[local353 + 1];
								this.aStringArray10[local353 + 1] = local374;
								@Pc(396) int local396 = this.anIntArray269[local353];
								this.anIntArray269[local353] = this.anIntArray269[local353 + 1];
								this.anIntArray269[local353 + 1] = local396;
								@Pc(418) int local418 = this.anIntArray267[local353];
								this.anIntArray267[local353] = this.anIntArray267[local353 + 1];
								this.anIntArray267[local353 + 1] = local418;
								@Pc(440) int local440 = this.anIntArray268[local353];
								this.anIntArray268[local353] = this.anIntArray268[local353 + 1];
								this.anIntArray268[local353 + 1] = local440;
								@Pc(462) int local462 = this.anIntArray270[local353];
								this.anIntArray270[local353] = this.anIntArray270[local353 + 1];
								this.anIntArray270[local353 + 1] = local462;
								local340 = false;
							}
						}
					}
				} else {
					this.anInt962 = 0;
					this.anInt839 = 0;
					this.method675(super.anInt819, 0, super.anInt818, 0, 0, Class36.method388(this.anInt889), 0);
					if (this.anInt962 != this.anInt832) {
						this.anInt832 = this.anInt962;
					}
					if (this.anInt839 != this.anInt1044) {
						this.anInt1044 = this.anInt839;
					}
				}
			}
		} catch (@Pc(492) RuntimeException local492) {
			signlink.reporterror("44450, " + -10 + ", " + local492.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "I", descriptor = "(I)V")
	private void method715() {
		try {
			while (true) {
				@Pc(10) int local10 = this.method577();
				if (local10 == -1) {
					return;
				}
				if (this.anInt949 != -1 && this.anInt949 == this.anInt924) {
					if (local10 == 8 && this.aString19.length() > 0) {
						this.aString19 = this.aString19.substring(0, this.aString19.length() - 1);
					}
					if ((local10 >= 97 && local10 <= 122 || local10 >= 65 && local10 <= 90 || local10 >= 48 && local10 <= 57 || local10 == 32) && this.aString19.length() < 12) {
						this.aString19 = this.aString19 + (char) local10;
					}
				} else {
					@Pc(190) int local190;
					if (this.aBoolean217) {
						if (local10 >= 32 && local10 <= 122 && this.aString27.length() < 80) {
							this.aString27 = this.aString27 + (char) local10;
							this.aBoolean237 = true;
						}
						if (local10 == 8 && this.aString27.length() > 0) {
							this.aString27 = this.aString27.substring(0, this.aString27.length() - 1);
							this.aBoolean237 = true;
						}
						if (local10 == 13 || local10 == 10) {
							this.aBoolean217 = false;
							this.aBoolean237 = true;
							@Pc(150) long local150;
							if (this.anInt1008 == 1) {
								local150 = Class28.method191(this.aString27);
								this.method655(local150);
							}
							if (this.anInt1008 == 2 && this.anInt840 > 0) {
								local150 = Class28.method191(this.aString27);
								this.method708(local150);
							}
							if (this.anInt1008 == 3 && this.aString27.length() > 0) {
								this.aClass5_Sub1_Sub4_9.method229(248);
								this.aClass5_Sub1_Sub4_9.method230(0);
								local190 = this.aClass5_Sub1_Sub4_9.anInt429;
								this.aClass5_Sub1_Sub4_9.method236(this.aLong33);
								Class31.method205(this.aString27, this.aClass5_Sub1_Sub4_9);
								this.aClass5_Sub1_Sub4_9.method239(this.aClass5_Sub1_Sub4_9.anInt429 - local190);
								this.aString27 = Class31.method206(this.aString27);
								this.aString27 = Class32.method288(this.aString27);
								this.method720(6, Class28.method195(Class28.method192((byte) 7, this.aLong33)), this.aString27);
								if (this.anInt1043 == 2) {
									this.anInt1043 = 1;
									this.aBoolean258 = true;
									this.aClass5_Sub1_Sub4_9.method229(112);
									this.aClass5_Sub1_Sub4_9.method230(this.anInt1025);
									this.aClass5_Sub1_Sub4_9.method230(this.anInt1043);
									this.aClass5_Sub1_Sub4_9.method230(this.anInt963);
								}
							}
							if (this.anInt1008 == 4 && this.anInt844 < 100) {
								local150 = Class28.method191(this.aString27);
								this.method662(local150);
							}
							if (this.anInt1008 == 5 && this.anInt844 > 0) {
								local150 = Class28.method191(this.aString27);
								this.method691(local150, this.anInt854);
							}
						}
					} else if (this.anInt884 == 1) {
						if (local10 >= 48 && local10 <= 57 && this.aString23.length() < 10) {
							this.aString23 = this.aString23 + (char) local10;
							this.aBoolean237 = true;
						}
						if (local10 == 8 && this.aString23.length() > 0) {
							this.aString23 = this.aString23.substring(0, this.aString23.length() - 1);
							this.aBoolean237 = true;
						}
						if (local10 == 13 || local10 == 10) {
							if (this.aString23.length() > 0) {
								local190 = 0;
								try {
									local190 = Integer.parseInt(this.aString23);
								} catch (@Pc(368) Exception local368) {
								}
								this.aClass5_Sub1_Sub4_9.method229(1);
								this.aClass5_Sub1_Sub4_9.method234(local190);
							}
							this.anInt884 = 0;
							this.aBoolean237 = true;
						}
					} else if (this.anInt884 == 2) {
						if (local10 >= 32 && local10 <= 122 && this.aString23.length() < 12) {
							this.aString23 = this.aString23 + (char) local10;
							this.aBoolean237 = true;
						}
						if (local10 == 8 && this.aString23.length() > 0) {
							this.aString23 = this.aString23.substring(0, this.aString23.length() - 1);
							this.aBoolean237 = true;
						}
						if (local10 == 13 || local10 == 10) {
							if (this.aString23.length() > 0) {
								this.aClass5_Sub1_Sub4_9.method229(197);
								this.aClass5_Sub1_Sub4_9.method236(Class28.method191(this.aString23));
							}
							this.anInt884 = 0;
							this.aBoolean237 = true;
						}
					} else if (this.anInt931 == -1 && this.anInt889 == -1) {
						if (local10 >= 32 && local10 <= 122 && this.aString22.length() < 80) {
							this.aString22 = this.aString22 + (char) local10;
							this.aBoolean237 = true;
						}
						if (local10 == 8 && this.aString22.length() > 0) {
							this.aString22 = this.aString22.substring(0, this.aString22.length() - 1);
							this.aBoolean237 = true;
						}
						if ((local10 == 13 || local10 == 10) && this.aString22.length() > 0) {
							if (this.anInt998 == 2) {
								if (this.aString22.equals("::clientdrop")) {
									this.method679();
								}
								if (this.aString22.equals("::lag")) {
									this.method692();
								}
								if (this.aString22.equals("::prefetchmusic")) {
									for (local190 = 0; local190 < this.aClass9_Sub1_1.method147(2, 163); local190++) {
										this.aClass9_Sub1_1.method160((byte) 1, local190, 2);
									}
								}
								if (this.aString22.equals("::fpson")) {
									aBoolean223 = true;
								}
								if (this.aString22.equals("::fpsoff")) {
									aBoolean223 = false;
								}
								if (this.aString22.equals("::noclip")) {
									for (local190 = 0; local190 < 4; local190++) {
										for (@Pc(600) int local600 = 1; local600 < 103; local600++) {
											for (@Pc(604) int local604 = 1; local604 < 103; local604++) {
												this.aClass37Array1[local190].anIntArrayArray15[local600][local604] = 0;
											}
										}
									}
								}
							}
							if (this.aString22.startsWith("::")) {
								this.aClass5_Sub1_Sub4_9.method229(109);
								this.aClass5_Sub1_Sub4_9.method230(this.aString22.length() - 1);
								this.aClass5_Sub1_Sub4_9.method237(this.aString22.substring(2));
							} else {
								@Pc(659) String local659 = this.aString22.toLowerCase();
								@Pc(661) byte local661 = 0;
								if (local659.startsWith("yellow:")) {
									local661 = 0;
									this.aString22 = this.aString22.substring(7);
								} else if (local659.startsWith("red:")) {
									local661 = 1;
									this.aString22 = this.aString22.substring(4);
								} else if (local659.startsWith("green:")) {
									local661 = 2;
									this.aString22 = this.aString22.substring(6);
								} else if (local659.startsWith("cyan:")) {
									local661 = 3;
									this.aString22 = this.aString22.substring(5);
								} else if (local659.startsWith("purple:")) {
									local661 = 4;
									this.aString22 = this.aString22.substring(7);
								} else if (local659.startsWith("white:")) {
									local661 = 5;
									this.aString22 = this.aString22.substring(6);
								} else if (local659.startsWith("flash1:")) {
									local661 = 6;
									this.aString22 = this.aString22.substring(7);
								} else if (local659.startsWith("flash2:")) {
									local661 = 7;
									this.aString22 = this.aString22.substring(7);
								} else if (local659.startsWith("flash3:")) {
									local661 = 8;
									this.aString22 = this.aString22.substring(7);
								} else if (local659.startsWith("glow1:")) {
									local661 = 9;
									this.aString22 = this.aString22.substring(6);
								} else if (local659.startsWith("glow2:")) {
									local661 = 10;
									this.aString22 = this.aString22.substring(6);
								} else if (local659.startsWith("glow3:")) {
									local661 = 11;
									this.aString22 = this.aString22.substring(6);
								}
								local659 = this.aString22.toLowerCase();
								@Pc(833) byte local833 = 0;
								if (local659.startsWith("wave:")) {
									local833 = 1;
									this.aString22 = this.aString22.substring(5);
								} else if (local659.startsWith("wave2:")) {
									local833 = 2;
									this.aString22 = this.aString22.substring(6);
								} else if (local659.startsWith("shake:")) {
									local833 = 3;
									this.aString22 = this.aString22.substring(6);
								} else if (local659.startsWith("scroll:")) {
									local833 = 4;
									this.aString22 = this.aString22.substring(7);
								} else if (local659.startsWith("slide:")) {
									local833 = 5;
									this.aString22 = this.aString22.substring(6);
								}
								this.aClass5_Sub1_Sub4_9.method229(33);
								this.aClass5_Sub1_Sub4_9.method230(0);
								@Pc(914) int local914 = this.aClass5_Sub1_Sub4_9.anInt429;
								this.aClass5_Sub1_Sub4_9.method258(local661);
								this.aClass5_Sub1_Sub4_8.anInt429 = 0;
								Class31.method205(this.aString22, this.aClass5_Sub1_Sub4_8);
								this.aClass5_Sub1_Sub4_9.method277(this.aClass5_Sub1_Sub4_8.aByteArray16, this.aClass5_Sub1_Sub4_8.anInt429);
								this.aClass5_Sub1_Sub4_9.method230(local833);
								this.aClass5_Sub1_Sub4_9.method239(this.aClass5_Sub1_Sub4_9.anInt429 - local914);
								this.aString22 = Class31.method206(this.aString22);
								this.aString22 = Class32.method288(this.aString22);
								aClass5_Sub1_Sub2_Sub4_Sub2_1.aString7 = this.aString22;
								aClass5_Sub1_Sub2_Sub4_Sub2_1.anInt509 = local661;
								aClass5_Sub1_Sub2_Sub4_Sub2_1.anInt493 = local833;
								aClass5_Sub1_Sub2_Sub4_Sub2_1.anInt507 = 150;
								if (this.anInt998 == 2) {
									this.method720(2, "@cr2@" + aClass5_Sub1_Sub2_Sub4_Sub2_1.aString8, aClass5_Sub1_Sub2_Sub4_Sub2_1.aString7);
								} else if (this.anInt998 == 1) {
									this.method720(2, "@cr1@" + aClass5_Sub1_Sub2_Sub4_Sub2_1.aString8, aClass5_Sub1_Sub2_Sub4_Sub2_1.aString7);
								} else {
									this.method720(2, aClass5_Sub1_Sub2_Sub4_Sub2_1.aString8, aClass5_Sub1_Sub2_Sub4_Sub2_1.aString7);
								}
								if (this.anInt1025 == 2) {
									this.anInt1025 = 3;
									this.aBoolean258 = true;
									this.aClass5_Sub1_Sub4_9.method229(112);
									this.aClass5_Sub1_Sub4_9.method230(this.anInt1025);
									this.aClass5_Sub1_Sub4_9.method230(this.anInt1043);
									this.aClass5_Sub1_Sub4_9.method230(this.anInt963);
								}
							}
							this.aString22 = "";
							this.aBoolean237 = true;
						}
					}
				}
			}
		} catch (@Pc(1066) RuntimeException local1066) {
			signlink.reporterror("71209, " + 357 + ", " + local1066.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(ILclient!PKHWFJLM;I)V")
	private void method716(@OriginalArg(0) int arg0, @OriginalArg(1) Class5_Sub1_Sub4 arg1, @OriginalArg(2) int arg2) {
		try {
			@Pc(3) boolean local3 = false;
			while (arg1.anInt430 + 10 < arg0 * 8) {
				@Pc(16) int local16 = arg1.method251(11);
				if (local16 == 2047) {
					break;
				}
				if (this.aClass5_Sub1_Sub2_Sub4_Sub2Array1[local16] == null) {
					this.aClass5_Sub1_Sub2_Sub4_Sub2Array1[local16] = new Class5_Sub1_Sub2_Sub4_Sub2();
					if (this.aClass5_Sub1_Sub4Array1[local16] != null) {
						this.aClass5_Sub1_Sub2_Sub4_Sub2Array1[local16].method377(this.aClass5_Sub1_Sub4Array1[local16]);
					}
				}
				this.anIntArray253[this.anInt984++] = local16;
				@Pc(62) Class5_Sub1_Sub2_Sub4_Sub2 local62 = this.aClass5_Sub1_Sub2_Sub4_Sub2Array1[local16];
				local62.anInt521 = anInt1018;
				@Pc(70) int local70 = arg1.method251(1);
				if (local70 == 1) {
					this.anIntArray254[this.anInt985++] = local16;
				}
				@Pc(89) int local89 = arg1.method251(1);
				@Pc(94) int local94 = arg1.method251(5);
				if (local94 > 15) {
					local94 -= 32;
				}
				@Pc(103) int local103 = arg1.method251(5);
				if (local103 > 15) {
					local103 -= 32;
				}
				local62.method373(aClass5_Sub1_Sub2_Sub4_Sub2_1.anIntArray151[0] + local103, aClass5_Sub1_Sub2_Sub4_Sub2_1.anIntArray152[0] + local94, local89 == 1);
			}
			arg1.method252();
		} catch (@Pc(135) RuntimeException local135) {
			signlink.reporterror("33298, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local135.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIIIZ)V")
	private void method717(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		try {
			this.aClass5_Sub1_Sub1_Sub2_14.method417(arg3, arg2);
			this.aClass5_Sub1_Sub1_Sub2_15.method417(arg3, arg2 + arg1 - 16);
			Class5_Sub1_Sub1.method549(this.anInt859, arg3, 16, arg2 + 16, arg1 - 32);
			@Pc(35) int local35 = (arg1 - 32) * arg1 / arg0;
			if (local35 < 8) {
				local35 = 8;
			}
			@Pc(52) int local52 = (arg1 - local35 - 32) * arg4 / (arg0 - arg1);
			Class5_Sub1_Sub1.method549(this.anInt993, arg3, 16, arg2 + local52 + 16, local35);
			Class5_Sub1_Sub1.method554(this.anInt966, local35, arg2 + local52 + 16, arg3);
			Class5_Sub1_Sub1.method554(this.anInt966, local35, arg2 + local52 + 16, arg3 + 1);
			this.aBoolean221 &= true;
			Class5_Sub1_Sub1.method552(16, this.anInt966, arg3, arg2 + local52 + 16);
			Class5_Sub1_Sub1.method552(16, this.anInt966, arg3, arg2 + local52 + 17);
			Class5_Sub1_Sub1.method554(this.anInt1050, local35, arg2 + local52 + 16, arg3 + 15);
			Class5_Sub1_Sub1.method554(this.anInt1050, local35 - 1, arg2 + 17 + local52, arg3 + 14);
			Class5_Sub1_Sub1.method552(16, this.anInt1050, arg3, arg2 + local52 + local35 + 15);
			Class5_Sub1_Sub1.method552(15, this.anInt1050, arg3 + 1, arg2 + 14 + local52 + local35);
		} catch (@Pc(174) RuntimeException local174) {
			signlink.reporterror("62999, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + true + ", " + local174.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "J", descriptor = "(I)V")
	private void method718() {
		try {
			if (this.anInt1019 == 0 && super.anInt823 == 1) {
				@Pc(22) int local22 = super.anInt824 - 25 - 550;
				@Pc(29) int local29 = super.anInt825 - 5 - 4;
				@Pc(49) int local49;
				if (local22 >= 0 && local29 >= 0 && local22 < 146 && local29 < 151) {
					local22 -= 73;
					local29 -= 75;
					local49 = this.anInt945 + this.anInt893 & 0x7FF;
					@Pc(53) int local53 = Class5_Sub1_Sub1_Sub4.anIntArray204[local49];
					@Pc(57) int local57 = Class5_Sub1_Sub1_Sub4.anIntArray205[local49];
					@Pc(66) int local66 = local53 * (this.anInt918 + 256) >> 8;
					@Pc(75) int local75 = local57 * (this.anInt918 + 256) >> 8;
					@Pc(85) int local85 = local29 * local66 + local22 * local75 >> 11;
					@Pc(95) int local95 = local29 * local75 - local22 * local66 >> 11;
					@Pc(102) int local102 = aClass5_Sub1_Sub2_Sub4_Sub2_1.anInt524 + local85 >> 7;
					@Pc(109) int local109 = aClass5_Sub1_Sub2_Sub4_Sub2_1.anInt525 - local95 >> 7;
					@Pc(130) boolean local130 = this.method586(aClass5_Sub1_Sub2_Sub4_Sub2_1.anIntArray152[0], aClass5_Sub1_Sub2_Sub4_Sub2_1.anIntArray151[0], 0, 1, true, 0, 0, 0, 0, local102, local109);
					if (local130) {
						this.aClass5_Sub1_Sub4_9.method230(local22);
						this.aClass5_Sub1_Sub4_9.method230(local29);
						this.aClass5_Sub1_Sub4_9.method231(this.anInt945);
						this.aClass5_Sub1_Sub4_9.method230(57);
						this.aClass5_Sub1_Sub4_9.method230(this.anInt893);
						this.aClass5_Sub1_Sub4_9.method230(this.anInt918);
						this.aClass5_Sub1_Sub4_9.method230(89);
						this.aClass5_Sub1_Sub4_9.method231(aClass5_Sub1_Sub2_Sub4_Sub2_1.anInt524);
						this.aClass5_Sub1_Sub4_9.method231(aClass5_Sub1_Sub2_Sub4_Sub2_1.anInt525);
						this.aClass5_Sub1_Sub4_9.method230(this.anInt885);
						this.aClass5_Sub1_Sub4_9.method230(63);
					}
				}
				anInt855++;
				if (anInt855 > 1666) {
					anInt855 = 0;
					this.aClass5_Sub1_Sub4_9.method229(98);
					this.aClass5_Sub1_Sub4_9.method230(0);
					local49 = this.aClass5_Sub1_Sub4_9.anInt429;
					if ((int) (Math.random() * 2.0D) == 0) {
						this.aClass5_Sub1_Sub4_9.method231(34146);
					}
					if ((int) (Math.random() * 2.0D) == 0) {
						this.aClass5_Sub1_Sub4_9.method231(48042);
					}
					this.aClass5_Sub1_Sub4_9.method230((int) (Math.random() * 256.0D));
					this.aClass5_Sub1_Sub4_9.method231((int) (Math.random() * 65536.0D));
					this.aClass5_Sub1_Sub4_9.method230(236);
					this.aClass5_Sub1_Sub4_9.method231(19247);
					this.aClass5_Sub1_Sub4_9.method231(62113);
					if ((int) (Math.random() * 2.0D) == 0) {
						this.aClass5_Sub1_Sub4_9.method230(111);
					}
					this.aClass5_Sub1_Sub4_9.method230(104);
					if ((int) (Math.random() * 2.0D) == 0) {
						this.aClass5_Sub1_Sub4_9.method230(225);
					}
					this.aClass5_Sub1_Sub4_9.method239(this.aClass5_Sub1_Sub4_9.anInt429 - local49);
					return;
				}
			}
		} catch (@Pc(281) RuntimeException local281) {
			signlink.reporterror("93003, " + 354 + ", " + local281.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "([BIZ)V")
	private void method719(@OriginalArg(0) byte[] arg0, @OriginalArg(2) boolean arg1) {
		try {
			if (this.aBoolean242) {
				signlink.anInt1067 = arg1 ? 1 : 0;
				signlink.midisave(arg0, arg0.length);
			}
		} catch (@Pc(20) RuntimeException local20) {
			signlink.reporterror("49467, " + arg0 + ", " + 5 + ", " + arg1 + ", " + local20.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/String;B)V")
	private void method720(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2) {
		try {
			if (arg0 == 0 && this.anInt1015 != -1) {
				this.aString28 = arg2;
				super.anInt823 = 0;
			}
			if (this.anInt931 == -1) {
				this.aBoolean237 = true;
			}
			for (@Pc(20) int local20 = 99; local20 > 0; local20--) {
				this.anIntArray225[local20] = this.anIntArray225[local20 - 1];
				this.aStringArray8[local20] = this.aStringArray8[local20 - 1];
				this.aStringArray9[local20] = this.aStringArray9[local20 - 1];
			}
			this.anIntArray225[0] = arg0;
			this.aStringArray8[0] = arg1;
			this.aStringArray9[0] = arg2;
		} catch (@Pc(80) RuntimeException local80) {
			signlink.reporterror("16210, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + -92 + ", " + local80.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "K", descriptor = "(I)V")
	private void method721() {
		try {
			@Pc(16) int local16 = this.anInt833 * 128 + 64;
			@Pc(23) int local23 = this.anInt834 * 128 + 64;
			@Pc(35) int local35 = this.method594(this.anInt1052, local16, this.anInt867, local23) - this.anInt835;
			if (this.anInt925 < local16) {
				this.anInt925 += this.anInt836 + (local16 - this.anInt925) * this.anInt837 / 1000;
				if (this.anInt925 > local16) {
					this.anInt925 = local16;
				}
			}
			if (this.anInt925 > local16) {
				this.anInt925 -= this.anInt836 + (this.anInt925 - local16) * this.anInt837 / 1000;
				if (this.anInt925 < local16) {
					this.anInt925 = local16;
				}
			}
			if (this.anInt926 < local35) {
				this.anInt926 += this.anInt836 + (local35 - this.anInt926) * this.anInt837 / 1000;
				if (this.anInt926 > local35) {
					this.anInt926 = local35;
				}
			}
			if (this.anInt926 > local35) {
				this.anInt926 -= this.anInt836 + (this.anInt926 - local35) * this.anInt837 / 1000;
				if (this.anInt926 < local35) {
					this.anInt926 = local35;
				}
			}
			if (this.anInt927 < local23) {
				this.anInt927 += this.anInt836 + (local23 - this.anInt927) * this.anInt837 / 1000;
				if (this.anInt927 > local23) {
					this.anInt927 = local23;
				}
			}
			if (this.anInt927 > local23) {
				this.anInt927 -= this.anInt836 + (this.anInt927 - local23) * this.anInt837 / 1000;
				if (this.anInt927 < local23) {
					this.anInt927 = local23;
				}
			}
			local16 = this.anInt1020 * 128 + 64;
			local23 = this.anInt1021 * 128 + 64;
			local35 = this.method594(this.anInt1052, local16, this.anInt867, local23) - this.anInt1022;
			@Pc(234) int local234 = local16 - this.anInt925;
			@Pc(239) int local239 = local35 - this.anInt926;
			@Pc(244) int local244 = local23 - this.anInt927;
			@Pc(255) int local255 = (int) Math.sqrt((double) (local234 * local234 + local244 * local244));
			@Pc(266) int local266 = (int) (Math.atan2((double) local239, (double) local255) * 325.949D) & 0x7FF;
			@Pc(277) int local277 = (int) (Math.atan2((double) local234, (double) local244) * -325.949D) & 0x7FF;
			if (local266 < 128) {
				local266 = 128;
			}
			if (local266 > 383) {
				local266 = 383;
			}
			if (this.anInt928 < local266) {
				this.anInt928 += this.anInt1023 + (local266 - this.anInt928) * this.anInt1024 / 1000;
				if (this.anInt928 > local266) {
					this.anInt928 = local266;
				}
			}
			if (this.anInt928 > local266) {
				this.anInt928 -= this.anInt1023 + (this.anInt928 - local266) * this.anInt1024 / 1000;
				if (this.anInt928 < local266) {
					this.anInt928 = local266;
				}
			}
			@Pc(348) int local348 = local277 - this.anInt929;
			if (local348 > 1024) {
				local348 -= 2048;
			}
			if (local348 < -1024) {
				local348 += 2048;
			}
			if (local348 > 0) {
				this.anInt929 += this.anInt1023 + local348 * this.anInt1024 / 1000;
				this.anInt929 &= 0x7FF;
			}
			if (local348 < 0) {
				this.anInt929 -= this.anInt1023 + -local348 * this.anInt1024 / 1000;
				this.anInt929 &= 0x7FF;
			}
			@Pc(406) int local406 = local277 - this.anInt929;
			if (local406 > 1024) {
				local406 -= 2048;
			}
			if (local406 < -1024) {
				local406 += 2048;
			}
			if (local406 < 0 && local348 > 0 || local406 > 0 && local348 < 0) {
				this.anInt929 = local277;
			}
		} catch (@Pc(427) RuntimeException local427) {
			signlink.reporterror("47618, " + -39049 + ", " + local427.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(ILclient!PKHWFJLM;I)V")
	private void method722(@OriginalArg(1) Class5_Sub1_Sub4 arg0, @OriginalArg(2) int arg1) {
		try {
			@Pc(6) int local6 = arg0.method251(8);
			@Pc(12) int local12;
			if (local6 < this.anInt984) {
				for (local12 = local6; local12 < this.anInt984; local12++) {
					this.anIntArray259[this.anInt995++] = this.anIntArray253[local12];
				}
			}
			if (local6 > this.anInt984) {
				signlink.reporterror(this.aString17 + " Too many players");
				throw new RuntimeException("eek");
			}
			this.anInt984 = 0;
			for (local12 = 0; local12 < local6; local12++) {
				@Pc(64) int local64 = this.anIntArray253[local12];
				@Pc(69) Class5_Sub1_Sub2_Sub4_Sub2 local69 = this.aClass5_Sub1_Sub2_Sub4_Sub2Array1[local64];
				@Pc(74) int local74 = arg0.method251(1);
				if (local74 == 0) {
					this.anIntArray253[this.anInt984++] = local64;
					local69.anInt521 = anInt1018;
				} else {
					@Pc(97) int local97 = arg0.method251(2);
					if (local97 == 0) {
						this.anIntArray253[this.anInt984++] = local64;
						local69.anInt521 = anInt1018;
						this.anIntArray254[this.anInt985++] = local64;
					} else {
						@Pc(148) int local148;
						@Pc(158) int local158;
						if (local97 == 1) {
							this.anIntArray253[this.anInt984++] = local64;
							local69.anInt521 = anInt1018;
							local148 = arg0.method251(3);
							local69.method375(false, local148);
							local158 = arg0.method251(1);
							if (local158 == 1) {
								this.anIntArray254[this.anInt985++] = local64;
							}
						} else if (local97 == 2) {
							this.anIntArray253[this.anInt984++] = local64;
							local69.anInt521 = anInt1018;
							local148 = arg0.method251(3);
							local69.method375(true, local148);
							local158 = arg0.method251(3);
							local69.method375(true, local158);
							@Pc(216) int local216 = arg0.method251(1);
							if (local216 == 1) {
								this.anIntArray254[this.anInt985++] = local64;
							}
						} else if (local97 == 3) {
							this.anIntArray259[this.anInt995++] = local64;
						}
					}
				}
			}
			@Pc(255) int local255 = arg1 + 0;
		} catch (@Pc(257) RuntimeException local257) {
			signlink.reporterror("5808, " + 0 + ", " + arg0 + ", " + arg1 + ", " + local257.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "i", descriptor = "(II)V")
	private void method723(@OriginalArg(1) int arg0) {
		try {
			Class36.method397(arg0);
		} catch (@Pc(9) RuntimeException local9) {
			signlink.reporterror("72908, " + -12 + ", " + arg0 + ", " + local9.toString());
			throw new RuntimeException();
		}
	}
}
