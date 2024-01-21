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

	@OriginalMember(owner = "client!client", name = "rb", descriptor = "I")
	private static int anInt860;

	@OriginalMember(owner = "client!client", name = "nc", descriptor = "I")
	private static int anInt881;

	@OriginalMember(owner = "client!client", name = "Ec", descriptor = "I")
	private static int anInt887;

	@OriginalMember(owner = "client!client", name = "Ic", descriptor = "I")
	private static int anInt890;

	@OriginalMember(owner = "client!client", name = "fe", descriptor = "I")
	private static int anInt922;

	@OriginalMember(owner = "client!client", name = "Ke", descriptor = "Z")
	private static boolean aBoolean249;

	@OriginalMember(owner = "client!client", name = "Oe", descriptor = "I")
	private static int anInt943;

	@OriginalMember(owner = "client!client", name = "df", descriptor = "Z")
	private static boolean aBoolean252;

	@OriginalMember(owner = "client!client", name = "Vf", descriptor = "I")
	public static int anInt970;

	@OriginalMember(owner = "client!client", name = "Bg", descriptor = "I")
	private static int anInt993;

	@OriginalMember(owner = "client!client", name = "Cg", descriptor = "I")
	private static int anInt994;

	@OriginalMember(owner = "client!client", name = "Gg", descriptor = "I")
	private static int anInt997;

	@OriginalMember(owner = "client!client", name = "Kg", descriptor = "Z")
	private static boolean aBoolean260;

	@OriginalMember(owner = "client!client", name = "Mg", descriptor = "I")
	private static int anInt999;

	@OriginalMember(owner = "client!client", name = "Zg", descriptor = "Lclient!KZCOXKKW;")
	public static Class2_Sub1_Sub3_Sub1_Sub1 aClass2_Sub1_Sub3_Sub1_Sub1_1;

	@OriginalMember(owner = "client!client", name = "Bh", descriptor = "I")
	private static int anInt1016;

	@OriginalMember(owner = "client!client", name = "Nh", descriptor = "I")
	private static int anInt1020;

	@OriginalMember(owner = "client!client", name = "Qh", descriptor = "I")
	private static int anInt1022;

	@OriginalMember(owner = "client!client", name = "Xh", descriptor = "I")
	private static int anInt1027;

	@OriginalMember(owner = "client!client", name = "lj", descriptor = "Z")
	private static boolean aBoolean269;

	@OriginalMember(owner = "client!client", name = "Aj", descriptor = "I")
	private static int anInt1065;

	@OriginalMember(owner = "client!client", name = "Yj", descriptor = "I")
	public static int anInt1073;

	@OriginalMember(owner = "client!client", name = "ak", descriptor = "Z")
	private static boolean aBoolean272;

	@OriginalMember(owner = "client!client", name = "T", descriptor = "Z")
	private static boolean aBoolean229 = true;

	@OriginalMember(owner = "client!client", name = "ge", descriptor = "[I")
	public static int[] anIntArray241 = new int[32];

	@OriginalMember(owner = "client!client", name = "mg", descriptor = "[[I")
	public static final int[][] anIntArrayArray23;

	@OriginalMember(owner = "client!client", name = "rg", descriptor = "Ljava/math/BigInteger;")
	private static BigInteger aBigInteger1;

	@OriginalMember(owner = "client!client", name = "hh", descriptor = "Ljava/lang/String;")
	private static String aString29;

	@OriginalMember(owner = "client!client", name = "ph", descriptor = "[I")
	private static int[] anIntArray261;

	@OriginalMember(owner = "client!client", name = "Mh", descriptor = "Ljava/math/BigInteger;")
	private static BigInteger aBigInteger2;

	@OriginalMember(owner = "client!client", name = "di", descriptor = "[I")
	public static final int[] anIntArray266;

	@OriginalMember(owner = "client!client", name = "Xj", descriptor = "I")
	private static int anInt1072;

	@OriginalMember(owner = "client!client", name = "Zj", descriptor = "Z")
	private static boolean aBoolean271;

	@OriginalMember(owner = "client!client", name = "I", descriptor = "I")
	private int anInt849;

	@OriginalMember(owner = "client!client", name = "M", descriptor = "I")
	private int anInt850;

	@OriginalMember(owner = "client!client", name = "N", descriptor = "Lclient!BISLJVZR;")
	private Class2_Sub1_Sub1_Sub2 aClass2_Sub1_Sub1_Sub2_3;

	@OriginalMember(owner = "client!client", name = "O", descriptor = "I")
	private int anInt851;

	@OriginalMember(owner = "client!client", name = "Q", descriptor = "I")
	private int anInt852;

	@OriginalMember(owner = "client!client", name = "S", descriptor = "I")
	private int anInt853;

	@OriginalMember(owner = "client!client", name = "W", descriptor = "I")
	private int anInt854;

	@OriginalMember(owner = "client!client", name = "db", descriptor = "Lclient!IOGVZQTL;")
	private Class20 aClass20_3;

	@OriginalMember(owner = "client!client", name = "eb", descriptor = "Lclient!IOGVZQTL;")
	private Class20 aClass20_4;

	@OriginalMember(owner = "client!client", name = "fb", descriptor = "Lclient!IOGVZQTL;")
	private Class20 aClass20_5;

	@OriginalMember(owner = "client!client", name = "gb", descriptor = "Lclient!IOGVZQTL;")
	private Class20 aClass20_6;

	@OriginalMember(owner = "client!client", name = "hb", descriptor = "Lclient!IOGVZQTL;")
	private Class20 aClass20_7;

	@OriginalMember(owner = "client!client", name = "ib", descriptor = "Lclient!IOGVZQTL;")
	private Class20 aClass20_8;

	@OriginalMember(owner = "client!client", name = "jb", descriptor = "Lclient!IOGVZQTL;")
	private Class20 aClass20_9;

	@OriginalMember(owner = "client!client", name = "kb", descriptor = "Lclient!IOGVZQTL;")
	private Class20 aClass20_10;

	@OriginalMember(owner = "client!client", name = "lb", descriptor = "Lclient!IOGVZQTL;")
	private Class20 aClass20_11;

	@OriginalMember(owner = "client!client", name = "mb", descriptor = "Lclient!BISLJVZR;")
	private Class2_Sub1_Sub1_Sub2 aClass2_Sub1_Sub1_Sub2_4;

	@OriginalMember(owner = "client!client", name = "ob", descriptor = "I")
	private int anInt857;

	@OriginalMember(owner = "client!client", name = "pb", descriptor = "I")
	private int anInt858;

	@OriginalMember(owner = "client!client", name = "qb", descriptor = "I")
	private int anInt859;

	@OriginalMember(owner = "client!client", name = "tb", descriptor = "I")
	private int anInt861;

	@OriginalMember(owner = "client!client", name = "ub", descriptor = "I")
	private int anInt862;

	@OriginalMember(owner = "client!client", name = "vb", descriptor = "I")
	private int anInt863;

	@OriginalMember(owner = "client!client", name = "wb", descriptor = "I")
	private int anInt864;

	@OriginalMember(owner = "client!client", name = "zb", descriptor = "I")
	private int anInt865;

	@OriginalMember(owner = "client!client", name = "Db", descriptor = "I")
	private int anInt866;

	@OriginalMember(owner = "client!client", name = "Fb", descriptor = "I")
	private int anInt867;

	@OriginalMember(owner = "client!client", name = "Hb", descriptor = "Lclient!BISLJVZR;")
	private Class2_Sub1_Sub1_Sub2 aClass2_Sub1_Sub1_Sub2_5;

	@OriginalMember(owner = "client!client", name = "Ib", descriptor = "Lclient!BISLJVZR;")
	private Class2_Sub1_Sub1_Sub2 aClass2_Sub1_Sub1_Sub2_6;

	@OriginalMember(owner = "client!client", name = "Jb", descriptor = "I")
	private int anInt868;

	@OriginalMember(owner = "client!client", name = "Ob", descriptor = "[[B")
	private byte[][] aByteArrayArray5;

	@OriginalMember(owner = "client!client", name = "Rb", descriptor = "I")
	private int anInt872;

	@OriginalMember(owner = "client!client", name = "Ub", descriptor = "Lclient!PAJXYXWG;")
	private Class29 aClass29_1;

	@OriginalMember(owner = "client!client", name = "Wb", descriptor = "I")
	private int anInt875;

	@OriginalMember(owner = "client!client", name = "Xb", descriptor = "I")
	private int anInt876;

	@OriginalMember(owner = "client!client", name = "hc", descriptor = "I")
	private int anInt878;

	@OriginalMember(owner = "client!client", name = "ic", descriptor = "I")
	private int anInt879;

	@OriginalMember(owner = "client!client", name = "kc", descriptor = "I")
	private int anInt880;

	@OriginalMember(owner = "client!client", name = "qc", descriptor = "Lclient!KYEPSAQL;")
	private Class2_Sub1_Sub1_Sub4 aClass2_Sub1_Sub1_Sub4_1;

	@OriginalMember(owner = "client!client", name = "rc", descriptor = "Lclient!KYEPSAQL;")
	private Class2_Sub1_Sub1_Sub4 aClass2_Sub1_Sub1_Sub4_2;

	@OriginalMember(owner = "client!client", name = "tc", descriptor = "I")
	private int anInt882;

	@OriginalMember(owner = "client!client", name = "vc", descriptor = "I")
	private int anInt883;

	@OriginalMember(owner = "client!client", name = "yc", descriptor = "I")
	private int anInt884;

	@OriginalMember(owner = "client!client", name = "Ac", descriptor = "I")
	private int anInt885;

	@OriginalMember(owner = "client!client", name = "Bc", descriptor = "Ljava/lang/String;")
	private String aString21;

	@OriginalMember(owner = "client!client", name = "Dc", descriptor = "I")
	private int anInt886;

	@OriginalMember(owner = "client!client", name = "Gc", descriptor = "I")
	private int anInt888;

	@OriginalMember(owner = "client!client", name = "Hc", descriptor = "I")
	private int anInt889;

	@OriginalMember(owner = "client!client", name = "Jc", descriptor = "Lclient!KYEPSAQL;")
	private Class2_Sub1_Sub1_Sub4 aClass2_Sub1_Sub1_Sub4_3;

	@OriginalMember(owner = "client!client", name = "Kc", descriptor = "Lclient!KYEPSAQL;")
	private Class2_Sub1_Sub1_Sub4 aClass2_Sub1_Sub1_Sub4_4;

	@OriginalMember(owner = "client!client", name = "Lc", descriptor = "Lclient!KYEPSAQL;")
	private Class2_Sub1_Sub1_Sub4 aClass2_Sub1_Sub1_Sub4_5;

	@OriginalMember(owner = "client!client", name = "Mc", descriptor = "I")
	private int anInt891;

	@OriginalMember(owner = "client!client", name = "Rc", descriptor = "I")
	private int anInt894;

	@OriginalMember(owner = "client!client", name = "Sc", descriptor = "I")
	private int anInt895;

	@OriginalMember(owner = "client!client", name = "Uc", descriptor = "I")
	private int anInt897;

	@OriginalMember(owner = "client!client", name = "Zc", descriptor = "Ljava/lang/String;")
	private String aString22;

	@OriginalMember(owner = "client!client", name = "ad", descriptor = "I")
	private int anInt900;

	@OriginalMember(owner = "client!client", name = "bd", descriptor = "[I")
	private int[] anIntArray229;

	@OriginalMember(owner = "client!client", name = "cd", descriptor = "[I")
	private int[] anIntArray230;

	@OriginalMember(owner = "client!client", name = "dd", descriptor = "[I")
	private int[] anIntArray231;

	@OriginalMember(owner = "client!client", name = "ed", descriptor = "[I")
	private int[] anIntArray232;

	@OriginalMember(owner = "client!client", name = "fd", descriptor = "I")
	private int anInt901;

	@OriginalMember(owner = "client!client", name = "gd", descriptor = "I")
	private int anInt902;

	@OriginalMember(owner = "client!client", name = "id", descriptor = "I")
	private int anInt904;

	@OriginalMember(owner = "client!client", name = "nd", descriptor = "Lclient!IOGVZQTL;")
	private Class20 aClass20_12;

	@OriginalMember(owner = "client!client", name = "od", descriptor = "Lclient!IOGVZQTL;")
	private Class20 aClass20_13;

	@OriginalMember(owner = "client!client", name = "pd", descriptor = "Lclient!IOGVZQTL;")
	private Class20 aClass20_14;

	@OriginalMember(owner = "client!client", name = "qd", descriptor = "I")
	private int anInt906;

	@OriginalMember(owner = "client!client", name = "rd", descriptor = "I")
	private int anInt907;

	@OriginalMember(owner = "client!client", name = "sd", descriptor = "I")
	private int anInt908;

	@OriginalMember(owner = "client!client", name = "td", descriptor = "I")
	private int anInt909;

	@OriginalMember(owner = "client!client", name = "ud", descriptor = "I")
	private int anInt910;

	@OriginalMember(owner = "client!client", name = "wd", descriptor = "I")
	private int anInt911;

	@OriginalMember(owner = "client!client", name = "xd", descriptor = "[I")
	private int[] anIntArray235;

	@OriginalMember(owner = "client!client", name = "yd", descriptor = "[I")
	private int[] anIntArray236;

	@OriginalMember(owner = "client!client", name = "zd", descriptor = "[I")
	private int[] anIntArray237;

	@OriginalMember(owner = "client!client", name = "Ad", descriptor = "[I")
	private int[] anIntArray238;

	@OriginalMember(owner = "client!client", name = "Cd", descriptor = "Lclient!BISLJVZR;")
	private Class2_Sub1_Sub1_Sub2 aClass2_Sub1_Sub1_Sub2_7;

	@OriginalMember(owner = "client!client", name = "Dd", descriptor = "Lclient!BISLJVZR;")
	private Class2_Sub1_Sub1_Sub2 aClass2_Sub1_Sub1_Sub2_8;

	@OriginalMember(owner = "client!client", name = "Ed", descriptor = "[I")
	private int[] anIntArray239;

	@OriginalMember(owner = "client!client", name = "Fd", descriptor = "[I")
	private int[] anIntArray240;

	@OriginalMember(owner = "client!client", name = "Jd", descriptor = "I")
	private int anInt912;

	@OriginalMember(owner = "client!client", name = "Md", descriptor = "I")
	private int anInt913;

	@OriginalMember(owner = "client!client", name = "Nd", descriptor = "I")
	private int anInt914;

	@OriginalMember(owner = "client!client", name = "Od", descriptor = "I")
	private int anInt915;

	@OriginalMember(owner = "client!client", name = "Pd", descriptor = "I")
	private int anInt916;

	@OriginalMember(owner = "client!client", name = "Qd", descriptor = "I")
	private int anInt917;

	@OriginalMember(owner = "client!client", name = "Td", descriptor = "I")
	private int anInt918;

	@OriginalMember(owner = "client!client", name = "Ud", descriptor = "I")
	private int anInt919;

	@OriginalMember(owner = "client!client", name = "Yd", descriptor = "I")
	private int anInt921;

	@OriginalMember(owner = "client!client", name = "be", descriptor = "Lclient!AKTTXKXI;")
	private Class2_Sub1_Sub1_Sub1 aClass2_Sub1_Sub1_Sub1_2;

	@OriginalMember(owner = "client!client", name = "ce", descriptor = "Lclient!AKTTXKXI;")
	private Class2_Sub1_Sub1_Sub1 aClass2_Sub1_Sub1_Sub1_3;

	@OriginalMember(owner = "client!client", name = "de", descriptor = "Lclient!AKTTXKXI;")
	private Class2_Sub1_Sub1_Sub1 aClass2_Sub1_Sub1_Sub1_4;

	@OriginalMember(owner = "client!client", name = "ee", descriptor = "Lclient!AKTTXKXI;")
	private Class2_Sub1_Sub1_Sub1 aClass2_Sub1_Sub1_Sub1_5;

	@OriginalMember(owner = "client!client", name = "ie", descriptor = "I")
	private int anInt923;

	@OriginalMember(owner = "client!client", name = "le", descriptor = "Lclient!XXMIBCTG;")
	private Class46 aClass46_2;

	@OriginalMember(owner = "client!client", name = "me", descriptor = "I")
	private int anInt925;

	@OriginalMember(owner = "client!client", name = "ne", descriptor = "I")
	private int anInt926;

	@OriginalMember(owner = "client!client", name = "qe", descriptor = "I")
	private int anInt929;

	@OriginalMember(owner = "client!client", name = "ve", descriptor = "I")
	private int anInt931;

	@OriginalMember(owner = "client!client", name = "we", descriptor = "I")
	private int anInt932;

	@OriginalMember(owner = "client!client", name = "xe", descriptor = "Lclient!BISLJVZR;")
	private Class2_Sub1_Sub1_Sub2 aClass2_Sub1_Sub1_Sub2_9;

	@OriginalMember(owner = "client!client", name = "Ae", descriptor = "I")
	private int anInt933;

	@OriginalMember(owner = "client!client", name = "Be", descriptor = "I")
	private int anInt934;

	@OriginalMember(owner = "client!client", name = "Ce", descriptor = "I")
	private int anInt935;

	@OriginalMember(owner = "client!client", name = "De", descriptor = "I")
	private int anInt936;

	@OriginalMember(owner = "client!client", name = "Ee", descriptor = "I")
	private int anInt937;

	@OriginalMember(owner = "client!client", name = "Fe", descriptor = "I")
	private int anInt938;

	@OriginalMember(owner = "client!client", name = "Ge", descriptor = "I")
	private int anInt939;

	@OriginalMember(owner = "client!client", name = "Pe", descriptor = "I")
	private int anInt944;

	@OriginalMember(owner = "client!client", name = "Re", descriptor = "I")
	private int anInt946;

	@OriginalMember(owner = "client!client", name = "Ve", descriptor = "I")
	private int anInt949;

	@OriginalMember(owner = "client!client", name = "Xe", descriptor = "I")
	private int anInt950;

	@OriginalMember(owner = "client!client", name = "ef", descriptor = "I")
	private int anInt951;

	@OriginalMember(owner = "client!client", name = "ff", descriptor = "I")
	private int anInt952;

	@OriginalMember(owner = "client!client", name = "gf", descriptor = "I")
	private int anInt953;

	@OriginalMember(owner = "client!client", name = "hf", descriptor = "I")
	private int anInt954;

	@OriginalMember(owner = "client!client", name = "jf", descriptor = "Lclient!KYEPSAQL;")
	private Class2_Sub1_Sub1_Sub4 aClass2_Sub1_Sub1_Sub4_6;

	@OriginalMember(owner = "client!client", name = "kf", descriptor = "Lclient!KYEPSAQL;")
	private Class2_Sub1_Sub1_Sub4 aClass2_Sub1_Sub1_Sub4_7;

	@OriginalMember(owner = "client!client", name = "pf", descriptor = "I")
	private int anInt955;

	@OriginalMember(owner = "client!client", name = "qf", descriptor = "I")
	private int anInt956;

	@OriginalMember(owner = "client!client", name = "rf", descriptor = "I")
	private int anInt957;

	@OriginalMember(owner = "client!client", name = "sf", descriptor = "I")
	private int anInt958;

	@OriginalMember(owner = "client!client", name = "tf", descriptor = "Ljava/lang/String;")
	private String aString25;

	@OriginalMember(owner = "client!client", name = "uf", descriptor = "I")
	private int anInt959;

	@OriginalMember(owner = "client!client", name = "zf", descriptor = "I")
	private int anInt960;

	@OriginalMember(owner = "client!client", name = "Hf", descriptor = "I")
	private int anInt962;

	@OriginalMember(owner = "client!client", name = "If", descriptor = "I")
	private int anInt963;

	@OriginalMember(owner = "client!client", name = "Jf", descriptor = "I")
	private int anInt964;

	@OriginalMember(owner = "client!client", name = "Kf", descriptor = "I")
	private int anInt965;

	@OriginalMember(owner = "client!client", name = "Nf", descriptor = "[Lclient!KYEPSAQL;")
	private Class2_Sub1_Sub1_Sub4[] aClass2_Sub1_Sub1_Sub4Array4;

	@OriginalMember(owner = "client!client", name = "Of", descriptor = "J")
	private long aLong29;

	@OriginalMember(owner = "client!client", name = "Rf", descriptor = "I")
	private int anInt966;

	@OriginalMember(owner = "client!client", name = "Sf", descriptor = "I")
	private int anInt967;

	@OriginalMember(owner = "client!client", name = "Tf", descriptor = "I")
	private int anInt968;

	@OriginalMember(owner = "client!client", name = "Uf", descriptor = "I")
	private int anInt969;

	@OriginalMember(owner = "client!client", name = "Xf", descriptor = "I")
	private int anInt972;

	@OriginalMember(owner = "client!client", name = "Yf", descriptor = "I")
	private int anInt973;

	@OriginalMember(owner = "client!client", name = "Zf", descriptor = "I")
	private int anInt974;

	@OriginalMember(owner = "client!client", name = "ag", descriptor = "I")
	private int anInt975;

	@OriginalMember(owner = "client!client", name = "bg", descriptor = "I")
	private int anInt976;

	@OriginalMember(owner = "client!client", name = "dg", descriptor = "I")
	private int anInt977;

	@OriginalMember(owner = "client!client", name = "eg", descriptor = "I")
	private int anInt978;

	@OriginalMember(owner = "client!client", name = "fg", descriptor = "I")
	private int anInt979;

	@OriginalMember(owner = "client!client", name = "gg", descriptor = "I")
	private int anInt980;

	@OriginalMember(owner = "client!client", name = "hg", descriptor = "I")
	private int anInt981;

	@OriginalMember(owner = "client!client", name = "jg", descriptor = "I")
	private int anInt983;

	@OriginalMember(owner = "client!client", name = "kg", descriptor = "I")
	private int anInt984;

	@OriginalMember(owner = "client!client", name = "ng", descriptor = "I")
	private int anInt986;

	@OriginalMember(owner = "client!client", name = "og", descriptor = "I")
	private int anInt987;

	@OriginalMember(owner = "client!client", name = "pg", descriptor = "Lclient!NTPVSATL;")
	private Class28 aClass28_1;

	@OriginalMember(owner = "client!client", name = "sg", descriptor = "[I")
	private int[] anIntArray253;

	@OriginalMember(owner = "client!client", name = "tg", descriptor = "[I")
	private int[] anIntArray254;

	@OriginalMember(owner = "client!client", name = "ug", descriptor = "[I")
	private int[] anIntArray255;

	@OriginalMember(owner = "client!client", name = "wg", descriptor = "I")
	private int anInt989;

	@OriginalMember(owner = "client!client", name = "xg", descriptor = "I")
	private int anInt990;

	@OriginalMember(owner = "client!client", name = "yg", descriptor = "I")
	private int anInt991;

	@OriginalMember(owner = "client!client", name = "zg", descriptor = "I")
	private int anInt992;

	@OriginalMember(owner = "client!client", name = "Eg", descriptor = "I")
	private int anInt996;

	@OriginalMember(owner = "client!client", name = "Hg", descriptor = "I")
	private int anInt998;

	@OriginalMember(owner = "client!client", name = "Ng", descriptor = "I")
	private int anInt1000;

	@OriginalMember(owner = "client!client", name = "Og", descriptor = "I")
	private int anInt1001;

	@OriginalMember(owner = "client!client", name = "Pg", descriptor = "I")
	private int anInt1002;

	@OriginalMember(owner = "client!client", name = "Qg", descriptor = "Ljava/lang/String;")
	private String aString28;

	@OriginalMember(owner = "client!client", name = "Sg", descriptor = "J")
	private long aLong30;

	@OriginalMember(owner = "client!client", name = "Wg", descriptor = "I")
	private int anInt1004;

	@OriginalMember(owner = "client!client", name = "Xg", descriptor = "I")
	private int anInt1005;

	@OriginalMember(owner = "client!client", name = "Yg", descriptor = "I")
	private int anInt1006;

	@OriginalMember(owner = "client!client", name = "bh", descriptor = "I")
	private int anInt1007;

	@OriginalMember(owner = "client!client", name = "eh", descriptor = "Lclient!BISLJVZR;")
	private Class2_Sub1_Sub1_Sub2 aClass2_Sub1_Sub1_Sub2_10;

	@OriginalMember(owner = "client!client", name = "fh", descriptor = "Lclient!BISLJVZR;")
	private Class2_Sub1_Sub1_Sub2 aClass2_Sub1_Sub1_Sub2_11;

	@OriginalMember(owner = "client!client", name = "gh", descriptor = "I")
	private int anInt1009;

	@OriginalMember(owner = "client!client", name = "lh", descriptor = "Lclient!KYEPSAQL;")
	private Class2_Sub1_Sub1_Sub4 aClass2_Sub1_Sub1_Sub4_8;

	@OriginalMember(owner = "client!client", name = "mh", descriptor = "Lclient!KYEPSAQL;")
	private Class2_Sub1_Sub1_Sub4 aClass2_Sub1_Sub1_Sub4_9;

	@OriginalMember(owner = "client!client", name = "nh", descriptor = "Lclient!KYEPSAQL;")
	private Class2_Sub1_Sub1_Sub4 aClass2_Sub1_Sub1_Sub4_10;

	@OriginalMember(owner = "client!client", name = "oh", descriptor = "[[B")
	private byte[][] aByteArrayArray6;

	@OriginalMember(owner = "client!client", name = "rh", descriptor = "I")
	private int anInt1012;

	@OriginalMember(owner = "client!client", name = "sh", descriptor = "I")
	private int anInt1013;

	@OriginalMember(owner = "client!client", name = "th", descriptor = "I")
	private int anInt1014;

	@OriginalMember(owner = "client!client", name = "Ch", descriptor = "I")
	private int anInt1017;

	@OriginalMember(owner = "client!client", name = "Hh", descriptor = "Lclient!KYEPSAQL;")
	private Class2_Sub1_Sub1_Sub4 aClass2_Sub1_Sub1_Sub4_11;

	@OriginalMember(owner = "client!client", name = "Ih", descriptor = "Lclient!KYEPSAQL;")
	private Class2_Sub1_Sub1_Sub4 aClass2_Sub1_Sub1_Sub4_12;

	@OriginalMember(owner = "client!client", name = "Jh", descriptor = "Lclient!KYEPSAQL;")
	private Class2_Sub1_Sub1_Sub4 aClass2_Sub1_Sub1_Sub4_13;

	@OriginalMember(owner = "client!client", name = "Kh", descriptor = "Lclient!KYEPSAQL;")
	private Class2_Sub1_Sub1_Sub4 aClass2_Sub1_Sub1_Sub4_14;

	@OriginalMember(owner = "client!client", name = "Lh", descriptor = "Lclient!KYEPSAQL;")
	private Class2_Sub1_Sub1_Sub4 aClass2_Sub1_Sub1_Sub4_15;

	@OriginalMember(owner = "client!client", name = "Oh", descriptor = "J")
	private long aLong31;

	@OriginalMember(owner = "client!client", name = "Sh", descriptor = "I")
	private int anInt1023;

	@OriginalMember(owner = "client!client", name = "Th", descriptor = "I")
	private int anInt1024;

	@OriginalMember(owner = "client!client", name = "Uh", descriptor = "I")
	private int anInt1025;

	@OriginalMember(owner = "client!client", name = "Vh", descriptor = "Ljava/net/Socket;")
	private Socket aSocket3;

	@OriginalMember(owner = "client!client", name = "Wh", descriptor = "I")
	private int anInt1026;

	@OriginalMember(owner = "client!client", name = "Zh", descriptor = "I")
	private int anInt1028;

	@OriginalMember(owner = "client!client", name = "ai", descriptor = "Lclient!VYNRIVYZ;")
	private Class9_Sub1 aClass9_Sub1_1;

	@OriginalMember(owner = "client!client", name = "bi", descriptor = "I")
	private int anInt1029;

	@OriginalMember(owner = "client!client", name = "ei", descriptor = "I")
	private int anInt1030;

	@OriginalMember(owner = "client!client", name = "hi", descriptor = "I")
	private int anInt1032;

	@OriginalMember(owner = "client!client", name = "ii", descriptor = "I")
	private int anInt1033;

	@OriginalMember(owner = "client!client", name = "ji", descriptor = "I")
	private int anInt1034;

	@OriginalMember(owner = "client!client", name = "ki", descriptor = "I")
	private int anInt1035;

	@OriginalMember(owner = "client!client", name = "li", descriptor = "I")
	private int anInt1036;

	@OriginalMember(owner = "client!client", name = "mi", descriptor = "I")
	private int anInt1037;

	@OriginalMember(owner = "client!client", name = "ni", descriptor = "I")
	private int anInt1038;

	@OriginalMember(owner = "client!client", name = "oi", descriptor = "I")
	private int anInt1039;

	@OriginalMember(owner = "client!client", name = "si", descriptor = "I")
	private int anInt1040;

	@OriginalMember(owner = "client!client", name = "ui", descriptor = "I")
	private int anInt1042;

	@OriginalMember(owner = "client!client", name = "vi", descriptor = "I")
	private int anInt1043;

	@OriginalMember(owner = "client!client", name = "wi", descriptor = "I")
	private int anInt1044;

	@OriginalMember(owner = "client!client", name = "yi", descriptor = "I")
	private int anInt1046;

	@OriginalMember(owner = "client!client", name = "zi", descriptor = "I")
	private int anInt1047;

	@OriginalMember(owner = "client!client", name = "Ai", descriptor = "I")
	private int anInt1048;

	@OriginalMember(owner = "client!client", name = "Bi", descriptor = "I")
	private int anInt1049;

	@OriginalMember(owner = "client!client", name = "Ci", descriptor = "I")
	private int anInt1050;

	@OriginalMember(owner = "client!client", name = "Di", descriptor = "I")
	private int anInt1051;

	@OriginalMember(owner = "client!client", name = "Ei", descriptor = "I")
	private int anInt1052;

	@OriginalMember(owner = "client!client", name = "Oi", descriptor = "Lclient!IOGVZQTL;")
	private Class20 aClass20_15;

	@OriginalMember(owner = "client!client", name = "Pi", descriptor = "Lclient!IOGVZQTL;")
	private Class20 aClass20_16;

	@OriginalMember(owner = "client!client", name = "Qi", descriptor = "Lclient!IOGVZQTL;")
	private Class20 aClass20_17;

	@OriginalMember(owner = "client!client", name = "Ri", descriptor = "Lclient!IOGVZQTL;")
	private Class20 aClass20_18;

	@OriginalMember(owner = "client!client", name = "Si", descriptor = "[[[B")
	private byte[][][] aByteArrayArrayArray8;

	@OriginalMember(owner = "client!client", name = "Vi", descriptor = "I")
	private int anInt1054;

	@OriginalMember(owner = "client!client", name = "Wi", descriptor = "I")
	private int anInt1055;

	@OriginalMember(owner = "client!client", name = "Xi", descriptor = "J")
	private long aLong32;

	@OriginalMember(owner = "client!client", name = "Yi", descriptor = "I")
	private int anInt1056;

	@OriginalMember(owner = "client!client", name = "Zi", descriptor = "I")
	private int anInt1057;

	@OriginalMember(owner = "client!client", name = "aj", descriptor = "I")
	private int anInt1058;

	@OriginalMember(owner = "client!client", name = "bj", descriptor = "Lclient!SMIVAFST;")
	private Class35 aClass35_2;

	@OriginalMember(owner = "client!client", name = "dj", descriptor = "I")
	private int anInt1059;

	@OriginalMember(owner = "client!client", name = "fj", descriptor = "Lclient!KYEPSAQL;")
	private Class2_Sub1_Sub1_Sub4 aClass2_Sub1_Sub1_Sub4_16;

	@OriginalMember(owner = "client!client", name = "gj", descriptor = "Lclient!KYEPSAQL;")
	private Class2_Sub1_Sub1_Sub4 aClass2_Sub1_Sub1_Sub4_17;

	@OriginalMember(owner = "client!client", name = "hj", descriptor = "Lclient!KYEPSAQL;")
	private Class2_Sub1_Sub1_Sub4 aClass2_Sub1_Sub1_Sub4_18;

	@OriginalMember(owner = "client!client", name = "ij", descriptor = "Lclient!KYEPSAQL;")
	private Class2_Sub1_Sub1_Sub4 aClass2_Sub1_Sub1_Sub4_19;

	@OriginalMember(owner = "client!client", name = "jj", descriptor = "Lclient!KYEPSAQL;")
	private Class2_Sub1_Sub1_Sub4 aClass2_Sub1_Sub1_Sub4_20;

	@OriginalMember(owner = "client!client", name = "mj", descriptor = "I")
	private int anInt1061;

	@OriginalMember(owner = "client!client", name = "nj", descriptor = "I")
	private int anInt1062;

	@OriginalMember(owner = "client!client", name = "pj", descriptor = "Lclient!IJIEJOTK;")
	private Class19 aClass19_1;

	@OriginalMember(owner = "client!client", name = "rj", descriptor = "Lclient!BISLJVZR;")
	private Class2_Sub1_Sub1_Sub2 aClass2_Sub1_Sub1_Sub2_12;

	@OriginalMember(owner = "client!client", name = "sj", descriptor = "Lclient!BISLJVZR;")
	private Class2_Sub1_Sub1_Sub2 aClass2_Sub1_Sub1_Sub2_13;

	@OriginalMember(owner = "client!client", name = "tj", descriptor = "Lclient!BISLJVZR;")
	private Class2_Sub1_Sub1_Sub2 aClass2_Sub1_Sub1_Sub2_14;

	@OriginalMember(owner = "client!client", name = "uj", descriptor = "Lclient!BISLJVZR;")
	private Class2_Sub1_Sub1_Sub2 aClass2_Sub1_Sub1_Sub2_15;

	@OriginalMember(owner = "client!client", name = "vj", descriptor = "Lclient!BISLJVZR;")
	private Class2_Sub1_Sub1_Sub2 aClass2_Sub1_Sub1_Sub2_16;

	@OriginalMember(owner = "client!client", name = "wj", descriptor = "I")
	private int anInt1063;

	@OriginalMember(owner = "client!client", name = "Bj", descriptor = "I")
	private int anInt1066;

	@OriginalMember(owner = "client!client", name = "Cj", descriptor = "I")
	private int anInt1067;

	@OriginalMember(owner = "client!client", name = "Dj", descriptor = "I")
	private int anInt1068;

	@OriginalMember(owner = "client!client", name = "Ej", descriptor = "Lclient!IOGVZQTL;")
	private Class20 aClass20_19;

	@OriginalMember(owner = "client!client", name = "Fj", descriptor = "Lclient!IOGVZQTL;")
	private Class20 aClass20_20;

	@OriginalMember(owner = "client!client", name = "Gj", descriptor = "Lclient!IOGVZQTL;")
	private Class20 aClass20_21;

	@OriginalMember(owner = "client!client", name = "Hj", descriptor = "Lclient!IOGVZQTL;")
	private Class20 aClass20_22;

	@OriginalMember(owner = "client!client", name = "Ij", descriptor = "Lclient!IOGVZQTL;")
	private Class20 aClass20_23;

	@OriginalMember(owner = "client!client", name = "Jj", descriptor = "Lclient!IOGVZQTL;")
	private Class20 aClass20_24;

	@OriginalMember(owner = "client!client", name = "Kj", descriptor = "Lclient!IOGVZQTL;")
	private Class20 aClass20_25;

	@OriginalMember(owner = "client!client", name = "Lj", descriptor = "Lclient!IOGVZQTL;")
	private Class20 aClass20_26;

	@OriginalMember(owner = "client!client", name = "Mj", descriptor = "Lclient!IOGVZQTL;")
	private Class20 aClass20_27;

	@OriginalMember(owner = "client!client", name = "Pj", descriptor = "[I")
	private int[] anIntArray275;

	@OriginalMember(owner = "client!client", name = "Qj", descriptor = "[I")
	private int[] anIntArray276;

	@OriginalMember(owner = "client!client", name = "Sj", descriptor = "Lclient!BISLJVZR;")
	private Class2_Sub1_Sub1_Sub2 aClass2_Sub1_Sub1_Sub2_17;

	@OriginalMember(owner = "client!client", name = "Tj", descriptor = "I")
	private int anInt1070;

	@OriginalMember(owner = "client!client", name = "Uj", descriptor = "J")
	private long aLong33;

	@OriginalMember(owner = "client!client", name = "Vj", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray8;

	@OriginalMember(owner = "client!client", name = "J", descriptor = "Z")
	private boolean aBoolean226 = false;

	@OriginalMember(owner = "client!client", name = "K", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray8 = new String[500];

	@OriginalMember(owner = "client!client", name = "L", descriptor = "Lclient!BSNPYLEV;")
	private Class2_Sub1_Sub2 aClass2_Sub1_Sub2_6 = Class2_Sub1_Sub2.method82();

	@OriginalMember(owner = "client!client", name = "P", descriptor = "Z")
	private volatile boolean aBoolean227 = false;

	@OriginalMember(owner = "client!client", name = "R", descriptor = "Z")
	private boolean aBoolean228 = false;

	@OriginalMember(owner = "client!client", name = "U", descriptor = "[[[Lclient!FEIPMYNH;")
	private Class13[][][] aClass13ArrayArrayArray1 = new Class13[4][104][104];

	@OriginalMember(owner = "client!client", name = "V", descriptor = "B")
	private byte aByte59 = -89;

	@OriginalMember(owner = "client!client", name = "X", descriptor = "Z")
	private boolean aBoolean230 = true;

	@OriginalMember(owner = "client!client", name = "Y", descriptor = "[I")
	private int[] anIntArray212 = new int[7];

	@OriginalMember(owner = "client!client", name = "Z", descriptor = "I")
	private int anInt855 = 2301979;

	@OriginalMember(owner = "client!client", name = "ab", descriptor = "Z")
	private boolean aBoolean231 = false;

	@OriginalMember(owner = "client!client", name = "bb", descriptor = "[I")
	private int[] anIntArray213 = new int[151];

	@OriginalMember(owner = "client!client", name = "cb", descriptor = "[I")
	private final int[] anIntArray214 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

	@OriginalMember(owner = "client!client", name = "nb", descriptor = "I")
	private int anInt856 = 128;

	@OriginalMember(owner = "client!client", name = "sb", descriptor = "B")
	private byte aByte60 = 2;

	@OriginalMember(owner = "client!client", name = "xb", descriptor = "Ljava/lang/String;")
	private String aString17 = "";

	@OriginalMember(owner = "client!client", name = "yb", descriptor = "Ljava/lang/String;")
	private String aString18 = "";

	@OriginalMember(owner = "client!client", name = "Ab", descriptor = "B")
	private byte aByte61 = -115;

	@OriginalMember(owner = "client!client", name = "Bb", descriptor = "Lclient!BSNPYLEV;")
	private Class2_Sub1_Sub2 aClass2_Sub1_Sub2_7 = new Class2_Sub1_Sub2(new byte[5000], (byte) 3);

	@OriginalMember(owner = "client!client", name = "Cb", descriptor = "[Lclient!TOFRUGLM;")
	private Class2_Sub1_Sub3_Sub1_Sub2[] aClass2_Sub1_Sub3_Sub1_Sub2Array1 = new Class2_Sub1_Sub3_Sub1_Sub2[16384];

	@OriginalMember(owner = "client!client", name = "Eb", descriptor = "[I")
	private int[] anIntArray215 = new int[16384];

	@OriginalMember(owner = "client!client", name = "Gb", descriptor = "Lclient!BSNPYLEV;")
	private Class2_Sub1_Sub2 aClass2_Sub1_Sub2_8 = Class2_Sub1_Sub2.method82();

	@OriginalMember(owner = "client!client", name = "Kb", descriptor = "I")
	private int anInt869 = 8990;

	@OriginalMember(owner = "client!client", name = "Lb", descriptor = "[I")
	private int[] anIntArray216 = new int[4000];

	@OriginalMember(owner = "client!client", name = "Mb", descriptor = "[I")
	private int[] anIntArray217 = new int[4000];

	@OriginalMember(owner = "client!client", name = "Nb", descriptor = "I")
	private int anInt870 = -1;

	@OriginalMember(owner = "client!client", name = "Pb", descriptor = "I")
	private int anInt871 = -1;

	@OriginalMember(owner = "client!client", name = "Qb", descriptor = "Z")
	private boolean aBoolean232 = false;

	@OriginalMember(owner = "client!client", name = "Sb", descriptor = "I")
	private int anInt873 = 2;

	@OriginalMember(owner = "client!client", name = "Tb", descriptor = "Ljava/lang/String;")
	private String aString19 = "";

	@OriginalMember(owner = "client!client", name = "Vb", descriptor = "I")
	private int anInt874 = 502;

	@OriginalMember(owner = "client!client", name = "Yb", descriptor = "Z")
	private boolean aBoolean233 = false;

	@OriginalMember(owner = "client!client", name = "Zb", descriptor = "[I")
	private int[] anIntArray218 = new int[5];

	@OriginalMember(owner = "client!client", name = "ac", descriptor = "[I")
	private int[] anIntArray219 = new int[2000];

	@OriginalMember(owner = "client!client", name = "bc", descriptor = "[I")
	private int[] anIntArray220 = new int[500];

	@OriginalMember(owner = "client!client", name = "cc", descriptor = "[I")
	private int[] anIntArray221 = new int[500];

	@OriginalMember(owner = "client!client", name = "dc", descriptor = "[I")
	private int[] anIntArray222 = new int[500];

	@OriginalMember(owner = "client!client", name = "ec", descriptor = "[I")
	private int[] anIntArray223 = new int[500];

	@OriginalMember(owner = "client!client", name = "fc", descriptor = "I")
	private int anInt877 = -48151;

	@OriginalMember(owner = "client!client", name = "gc", descriptor = "Z")
	private boolean aBoolean234 = false;

	@OriginalMember(owner = "client!client", name = "jc", descriptor = "[I")
	private int[] anIntArray224 = new int[33];

	@OriginalMember(owner = "client!client", name = "lc", descriptor = "[I")
	public int[] anIntArray225 = new int[2000];

	@OriginalMember(owner = "client!client", name = "mc", descriptor = "[Lclient!BISLJVZR;")
	private Class2_Sub1_Sub1_Sub2[] aClass2_Sub1_Sub1_Sub2Array4 = new Class2_Sub1_Sub1_Sub2[100];

	@OriginalMember(owner = "client!client", name = "oc", descriptor = "[I")
	private int[] anIntArray226 = new int[5];

	@OriginalMember(owner = "client!client", name = "pc", descriptor = "Z")
	private boolean aBoolean235 = false;

	@OriginalMember(owner = "client!client", name = "sc", descriptor = "Z")
	private volatile boolean aBoolean236 = false;

	@OriginalMember(owner = "client!client", name = "uc", descriptor = "Ljava/lang/String;")
	private String aString20 = "";

	@OriginalMember(owner = "client!client", name = "wc", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray9 = new String[100];

	@OriginalMember(owner = "client!client", name = "xc", descriptor = "[I")
	private int[] anIntArray227 = new int[100];

	@OriginalMember(owner = "client!client", name = "zc", descriptor = "Z")
	private boolean aBoolean237 = false;

	@OriginalMember(owner = "client!client", name = "Cc", descriptor = "Lclient!FEIPMYNH;")
	private Class13 aClass13_10 = new Class13(true);

	@OriginalMember(owner = "client!client", name = "Fc", descriptor = "[I")
	private int[] anIntArray228 = new int[Class39.anInt728];

	@OriginalMember(owner = "client!client", name = "Nc", descriptor = "Z")
	private boolean aBoolean238 = false;

	@OriginalMember(owner = "client!client", name = "Oc", descriptor = "B")
	private byte aByte62 = 1;

	@OriginalMember(owner = "client!client", name = "Pc", descriptor = "I")
	private int anInt892 = -1;

	@OriginalMember(owner = "client!client", name = "Qc", descriptor = "I")
	private int anInt893 = 78;

	@OriginalMember(owner = "client!client", name = "Tc", descriptor = "I")
	private int anInt896 = -773;

	@OriginalMember(owner = "client!client", name = "Vc", descriptor = "I")
	private int anInt898 = 897;

	@OriginalMember(owner = "client!client", name = "Wc", descriptor = "I")
	private int anInt899 = 4;

	@OriginalMember(owner = "client!client", name = "Xc", descriptor = "Z")
	private boolean aBoolean239 = false;

	@OriginalMember(owner = "client!client", name = "Yc", descriptor = "Z")
	private boolean aBoolean240 = false;

	@OriginalMember(owner = "client!client", name = "hd", descriptor = "I")
	private int anInt903 = -1;

	@OriginalMember(owner = "client!client", name = "jd", descriptor = "[I")
	private int[] anIntArray233 = new int[50];

	@OriginalMember(owner = "client!client", name = "kd", descriptor = "[[I")
	private int[][] anIntArrayArray22 = new int[104][104];

	@OriginalMember(owner = "client!client", name = "ld", descriptor = "I")
	private final int anInt905 = 100;

	@OriginalMember(owner = "client!client", name = "md", descriptor = "[I")
	private int[] anIntArray234 = new int[100];

	@OriginalMember(owner = "client!client", name = "vd", descriptor = "Z")
	private boolean aBoolean241 = false;

	@OriginalMember(owner = "client!client", name = "Bd", descriptor = "[Lclient!BISLJVZR;")
	private Class2_Sub1_Sub1_Sub2[] aClass2_Sub1_Sub1_Sub2Array5 = new Class2_Sub1_Sub1_Sub2[32];

	@OriginalMember(owner = "client!client", name = "Gd", descriptor = "Z")
	private boolean aBoolean242 = true;

	@OriginalMember(owner = "client!client", name = "Hd", descriptor = "Z")
	private boolean aBoolean243 = false;

	@OriginalMember(owner = "client!client", name = "Id", descriptor = "Z")
	private boolean aBoolean244 = false;

	@OriginalMember(owner = "client!client", name = "Kd", descriptor = "[Lclient!TPHBVXKD;")
	public Class36[] aClass36Array1 = new Class36[5];

	@OriginalMember(owner = "client!client", name = "Ld", descriptor = "Z")
	private boolean aBoolean245 = true;

	@OriginalMember(owner = "client!client", name = "Rd", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray10 = new String[5];

	@OriginalMember(owner = "client!client", name = "Sd", descriptor = "[Z")
	private boolean[] aBooleanArray11 = new boolean[5];

	@OriginalMember(owner = "client!client", name = "Vd", descriptor = "I")
	private int anInt920 = 1;

	@OriginalMember(owner = "client!client", name = "Wd", descriptor = "B")
	private byte aByte63 = 42;

	@OriginalMember(owner = "client!client", name = "Xd", descriptor = "Lclient!QHGHUTGN;")
	private Class31 aClass31_1 = new Class31();

	@OriginalMember(owner = "client!client", name = "Zd", descriptor = "[J")
	private long[] aLongArray3 = new long[200];

	@OriginalMember(owner = "client!client", name = "ae", descriptor = "[J")
	private long[] aLongArray4 = new long[100];

	@OriginalMember(owner = "client!client", name = "he", descriptor = "[I")
	private int[] anIntArray242 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

	@OriginalMember(owner = "client!client", name = "je", descriptor = "I")
	private int anInt924 = 1;

	@OriginalMember(owner = "client!client", name = "ke", descriptor = "Ljava/lang/String;")
	private String aString23 = "";

	@OriginalMember(owner = "client!client", name = "oe", descriptor = "I")
	private int anInt927 = 1;

	@OriginalMember(owner = "client!client", name = "pe", descriptor = "I")
	private int anInt928 = -1;

	@OriginalMember(owner = "client!client", name = "re", descriptor = "Z")
	private boolean aBoolean246 = true;

	@OriginalMember(owner = "client!client", name = "se", descriptor = "Z")
	private boolean aBoolean247 = true;

	@OriginalMember(owner = "client!client", name = "te", descriptor = "[Lclient!KYEPSAQL;")
	private Class2_Sub1_Sub1_Sub4[] aClass2_Sub1_Sub1_Sub4Array2 = new Class2_Sub1_Sub1_Sub4[13];

	@OriginalMember(owner = "client!client", name = "ue", descriptor = "I")
	private int anInt930 = -1;

	@OriginalMember(owner = "client!client", name = "ye", descriptor = "Z")
	public boolean aBoolean248 = false;

	@OriginalMember(owner = "client!client", name = "ze", descriptor = "[Lclient!BISLJVZR;")
	private Class2_Sub1_Sub1_Sub2[] aClass2_Sub1_Sub1_Sub2Array6 = new Class2_Sub1_Sub1_Sub2[1000];

	@OriginalMember(owner = "client!client", name = "He", descriptor = "[I")
	private int[] anIntArray243 = new int[1000];

	@OriginalMember(owner = "client!client", name = "Ie", descriptor = "I")
	private int anInt940 = 9998;

	@OriginalMember(owner = "client!client", name = "Je", descriptor = "Ljava/lang/String;")
	private String aString24 = "";

	@OriginalMember(owner = "client!client", name = "Le", descriptor = "I")
	private int anInt941 = -1;

	@OriginalMember(owner = "client!client", name = "Me", descriptor = "I")
	private int anInt942 = -1;

	@OriginalMember(owner = "client!client", name = "Ne", descriptor = "[I")
	private int[] anIntArray244 = new int[9];

	@OriginalMember(owner = "client!client", name = "Qe", descriptor = "I")
	private int anInt945 = -98;

	@OriginalMember(owner = "client!client", name = "Se", descriptor = "I")
	private int anInt947 = 2048;

	@OriginalMember(owner = "client!client", name = "Te", descriptor = "I")
	private int anInt948 = 2047;

	@OriginalMember(owner = "client!client", name = "Ue", descriptor = "[Lclient!KZCOXKKW;")
	private Class2_Sub1_Sub3_Sub1_Sub1[] aClass2_Sub1_Sub3_Sub1_Sub1Array1 = new Class2_Sub1_Sub3_Sub1_Sub1[this.anInt947];

	@OriginalMember(owner = "client!client", name = "We", descriptor = "[I")
	private int[] anIntArray245 = new int[this.anInt947];

	@OriginalMember(owner = "client!client", name = "Ye", descriptor = "[I")
	private int[] anIntArray246 = new int[this.anInt947];

	@OriginalMember(owner = "client!client", name = "Ze", descriptor = "[Lclient!BSNPYLEV;")
	private Class2_Sub1_Sub2[] aClass2_Sub1_Sub2Array1 = new Class2_Sub1_Sub2[this.anInt947];

	@OriginalMember(owner = "client!client", name = "af", descriptor = "Z")
	private boolean aBoolean250 = true;

	@OriginalMember(owner = "client!client", name = "bf", descriptor = "[I")
	private int[] anIntArray247 = new int[50];

	@OriginalMember(owner = "client!client", name = "cf", descriptor = "Z")
	private boolean aBoolean251 = false;

	@OriginalMember(owner = "client!client", name = "lf", descriptor = "Lclient!FEIPMYNH;")
	private Class13 aClass13_11 = new Class13(true);

	@OriginalMember(owner = "client!client", name = "mf", descriptor = "[Z")
	private boolean[] aBooleanArray12 = new boolean[5];

	@OriginalMember(owner = "client!client", name = "nf", descriptor = "Z")
	private boolean aBoolean253 = false;

	@OriginalMember(owner = "client!client", name = "of", descriptor = "[Lclient!EOLCIJGV;")
	private Class12[] aClass12Array1 = new Class12[4];

	@OriginalMember(owner = "client!client", name = "vf", descriptor = "[I")
	private int[] anIntArray248 = new int[Class39.anInt728];

	@OriginalMember(owner = "client!client", name = "wf", descriptor = "Z")
	private boolean aBoolean254 = false;

	@OriginalMember(owner = "client!client", name = "xf", descriptor = "Z")
	private boolean aBoolean255 = false;

	@OriginalMember(owner = "client!client", name = "yf", descriptor = "Z")
	private boolean aBoolean256 = true;

	@OriginalMember(owner = "client!client", name = "Af", descriptor = "[I")
	private int[] anIntArray249 = new int[1000];

	@OriginalMember(owner = "client!client", name = "Bf", descriptor = "[I")
	private int[] anIntArray250 = new int[1000];

	@OriginalMember(owner = "client!client", name = "Cf", descriptor = "I")
	private int anInt961 = 7759444;

	@OriginalMember(owner = "client!client", name = "Df", descriptor = "[I")
	private int[] anIntArray251 = new int[5];

	@OriginalMember(owner = "client!client", name = "Ef", descriptor = "[Lclient!KYEPSAQL;")
	private Class2_Sub1_Sub1_Sub4[] aClass2_Sub1_Sub1_Sub4Array3 = new Class2_Sub1_Sub1_Sub4[2];

	@OriginalMember(owner = "client!client", name = "Ff", descriptor = "Ljava/lang/String;")
	private String aString26 = "";

	@OriginalMember(owner = "client!client", name = "Gf", descriptor = "Ljava/lang/String;")
	private String aString27 = "";

	@OriginalMember(owner = "client!client", name = "Lf", descriptor = "Z")
	private boolean aBoolean257 = false;

	@OriginalMember(owner = "client!client", name = "Mf", descriptor = "B")
	private byte aByte64 = 9;

	@OriginalMember(owner = "client!client", name = "Pf", descriptor = "[I")
	private int[] anIntArray252 = new int[200];

	@OriginalMember(owner = "client!client", name = "Qf", descriptor = "Z")
	private boolean aBoolean258 = false;

	@OriginalMember(owner = "client!client", name = "Wf", descriptor = "I")
	private int anInt971 = -1;

	@OriginalMember(owner = "client!client", name = "cg", descriptor = "Z")
	private boolean aBoolean259 = false;

	@OriginalMember(owner = "client!client", name = "ig", descriptor = "I")
	private int anInt982 = -1;

	@OriginalMember(owner = "client!client", name = "lg", descriptor = "I")
	private int anInt985 = 8;

	@OriginalMember(owner = "client!client", name = "vg", descriptor = "[[I")
	private int[][] anIntArrayArray24 = new int[104][104];

	@OriginalMember(owner = "client!client", name = "Ag", descriptor = "[I")
	private int[] anIntArray256 = new int[151];

	@OriginalMember(owner = "client!client", name = "Dg", descriptor = "I")
	private int anInt995 = 3353893;

	@OriginalMember(owner = "client!client", name = "Fg", descriptor = "[I")
	private int[] anIntArray257 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

	@OriginalMember(owner = "client!client", name = "Ig", descriptor = "[Lclient!BISLJVZR;")
	private Class2_Sub1_Sub1_Sub2[] aClass2_Sub1_Sub1_Sub2Array7 = new Class2_Sub1_Sub1_Sub2[32];

	@OriginalMember(owner = "client!client", name = "Jg", descriptor = "B")
	private byte aByte65 = 9;

	@OriginalMember(owner = "client!client", name = "Lg", descriptor = "[I")
	private int[] anIntArray258 = new int[33];

	@OriginalMember(owner = "client!client", name = "Rg", descriptor = "[I")
	private int[] anIntArray259 = new int[5];

	@OriginalMember(owner = "client!client", name = "Tg", descriptor = "I")
	private int anInt1003 = -1;

	@OriginalMember(owner = "client!client", name = "Ug", descriptor = "Z")
	private boolean aBoolean261 = false;

	@OriginalMember(owner = "client!client", name = "Vg", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray7 = new int[4][13][13];

	@OriginalMember(owner = "client!client", name = "ah", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray11 = new String[200];

	@OriginalMember(owner = "client!client", name = "ch", descriptor = "I")
	private int anInt1008 = -1;

	@OriginalMember(owner = "client!client", name = "dh", descriptor = "Z")
	private boolean aBoolean262 = false;

	@OriginalMember(owner = "client!client", name = "ih", descriptor = "I")
	private int anInt1010 = 711;

	@OriginalMember(owner = "client!client", name = "jh", descriptor = "[I")
	private int[] anIntArray260 = new int[Class39.anInt728];

	@OriginalMember(owner = "client!client", name = "kh", descriptor = "I")
	private int anInt1011 = 850;

	@OriginalMember(owner = "client!client", name = "qh", descriptor = "[I")
	private int[] anIntArray262 = new int[] { 17, 24, 34, 40 };

	@OriginalMember(owner = "client!client", name = "uh", descriptor = "I")
	private int anInt1015 = 9;

	@OriginalMember(owner = "client!client", name = "vh", descriptor = "Lclient!BSNPYLEV;")
	private Class2_Sub1_Sub2 aClass2_Sub1_Sub2_9 = Class2_Sub1_Sub2.method82();

	@OriginalMember(owner = "client!client", name = "wh", descriptor = "[I")
	private int[] anIntArray263 = new int[256];

	@OriginalMember(owner = "client!client", name = "xh", descriptor = "[I")
	private int[] anIntArray264 = new int[100];

	@OriginalMember(owner = "client!client", name = "yh", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray12 = new String[100];

	@OriginalMember(owner = "client!client", name = "zh", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray13 = new String[100];

	@OriginalMember(owner = "client!client", name = "Ah", descriptor = "Z")
	private boolean aBoolean263 = true;

	@OriginalMember(owner = "client!client", name = "Dh", descriptor = "I")
	private int anInt1018 = 2;

	@OriginalMember(owner = "client!client", name = "Eh", descriptor = "[Lclient!BISLJVZR;")
	private Class2_Sub1_Sub1_Sub2[] aClass2_Sub1_Sub1_Sub2Array8 = new Class2_Sub1_Sub1_Sub2[32];

	@OriginalMember(owner = "client!client", name = "Fh", descriptor = "I")
	private int anInt1019 = 939;

	@OriginalMember(owner = "client!client", name = "Gh", descriptor = "[Lclient!KYEPSAQL;")
	private Class2_Sub1_Sub1_Sub4[] aClass2_Sub1_Sub1_Sub4Array5 = new Class2_Sub1_Sub1_Sub4[100];

	@OriginalMember(owner = "client!client", name = "Ph", descriptor = "I")
	private int anInt1021 = -1;

	@OriginalMember(owner = "client!client", name = "Rh", descriptor = "[I")
	private int[] anIntArray265 = new int[50];

	@OriginalMember(owner = "client!client", name = "Yh", descriptor = "Z")
	private boolean aBoolean264 = true;

	@OriginalMember(owner = "client!client", name = "ci", descriptor = "[Lclient!BISLJVZR;")
	private Class2_Sub1_Sub1_Sub2[] aClass2_Sub1_Sub1_Sub2Array9 = new Class2_Sub1_Sub1_Sub2[20];

	@OriginalMember(owner = "client!client", name = "fi", descriptor = "Z")
	private volatile boolean aBoolean265 = false;

	@OriginalMember(owner = "client!client", name = "gi", descriptor = "I")
	private int anInt1031 = 39072;

	@OriginalMember(owner = "client!client", name = "pi", descriptor = "Z")
	private boolean aBoolean266 = false;

	@OriginalMember(owner = "client!client", name = "qi", descriptor = "Z")
	private boolean aBoolean267 = false;

	@OriginalMember(owner = "client!client", name = "ri", descriptor = "Ljava/lang/String;")
	private String aString30 = "";

	@OriginalMember(owner = "client!client", name = "ti", descriptor = "I")
	private int anInt1041 = 2;

	@OriginalMember(owner = "client!client", name = "xi", descriptor = "I")
	private int anInt1045 = -1;

	@OriginalMember(owner = "client!client", name = "Fi", descriptor = "I")
	private int anInt1053 = 50;

	@OriginalMember(owner = "client!client", name = "Gi", descriptor = "[I")
	private int[] anIntArray267 = new int[this.anInt1053];

	@OriginalMember(owner = "client!client", name = "Hi", descriptor = "[I")
	private int[] anIntArray268 = new int[this.anInt1053];

	@OriginalMember(owner = "client!client", name = "Ii", descriptor = "[I")
	private int[] anIntArray269 = new int[this.anInt1053];

	@OriginalMember(owner = "client!client", name = "Ji", descriptor = "[I")
	private int[] anIntArray270 = new int[this.anInt1053];

	@OriginalMember(owner = "client!client", name = "Ki", descriptor = "[I")
	private int[] anIntArray271 = new int[this.anInt1053];

	@OriginalMember(owner = "client!client", name = "Li", descriptor = "[I")
	private int[] anIntArray272 = new int[this.anInt1053];

	@OriginalMember(owner = "client!client", name = "Mi", descriptor = "[I")
	private int[] anIntArray273 = new int[this.anInt1053];

	@OriginalMember(owner = "client!client", name = "Ni", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray14 = new String[this.anInt1053];

	@OriginalMember(owner = "client!client", name = "Ti", descriptor = "[B")
	private byte[] aByteArray21 = new byte[16384];

	@OriginalMember(owner = "client!client", name = "Ui", descriptor = "Z")
	private boolean aBoolean268 = false;

	@OriginalMember(owner = "client!client", name = "cj", descriptor = "[Lclient!BISLJVZR;")
	private Class2_Sub1_Sub1_Sub2[] aClass2_Sub1_Sub1_Sub2Array10 = new Class2_Sub1_Sub1_Sub2[8];

	@OriginalMember(owner = "client!client", name = "ej", descriptor = "I")
	private int anInt1060 = -1;

	@OriginalMember(owner = "client!client", name = "kj", descriptor = "Ljava/lang/String;")
	private String aString31 = "";

	@OriginalMember(owner = "client!client", name = "oj", descriptor = "Z")
	private boolean aBoolean270 = false;

	@OriginalMember(owner = "client!client", name = "qj", descriptor = "[[I")
	private int[][] anIntArrayArray25 = new int[104][104];

	@OriginalMember(owner = "client!client", name = "xj", descriptor = "I")
	private int anInt1064 = 3;

	@OriginalMember(owner = "client!client", name = "yj", descriptor = "Ljava/util/zip/CRC32;")
	private CRC32 aCRC32_2 = new CRC32();

	@OriginalMember(owner = "client!client", name = "zj", descriptor = "[I")
	private int[] anIntArray274 = new int[5];

	@OriginalMember(owner = "client!client", name = "Nj", descriptor = "I")
	private int anInt1069 = -1;

	@OriginalMember(owner = "client!client", name = "Oj", descriptor = "Lclient!FEIPMYNH;")
	private Class13 aClass13_12 = new Class13(true);

	@OriginalMember(owner = "client!client", name = "Rj", descriptor = "B")
	private byte aByte66 = 8;

	@OriginalMember(owner = "client!client", name = "Wj", descriptor = "I")
	private int anInt1071 = 5063219;

	static {
		@Pc(6) int local6 = 2;
		@Pc(8) int local8;
		for (local8 = 0; local8 < 32; local8++) {
			anIntArray241[local8] = local6 - 1;
			local6 += local6;
		}
		anIntArrayArray23 = new int[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, 33697, 22433, 2983, 54193 }, { 8741, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003, 25239 }, { 25238, 8742, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };
		aBigInteger1 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");
		aString29 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";
		anIntArray261 = new int[99];
		local6 = 0;
		for (local8 = 0; local8 < 99; local8++) {
			@Pc(302) int local302 = local8 + 1;
			@Pc(315) int local315 = (int) ((double) local302 + Math.pow(2.0D, (double) local302 / 7.0D) * 300.0D);
			local6 += local315;
			anIntArray261[local8] = local6 / 4;
		}
		aBigInteger2 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");
		anIntArray266 = new int[] { 9104, 10275, 7595, 3610, 7975, 8526, 918, 38802, 24466, 10145, 58654, 5027, 1457, 16565, 34991, 25486 };
		anInt1072 = 10;
		aBoolean271 = true;
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(II)Ljava/lang/String;")
	private static String method607(@OriginalArg(0) int arg0) {
		try {
			if (arg0 < 100000) {
				return String.valueOf(arg0);
			} else if (arg0 < 10000000) {
				return arg0 / 1000 + "K";
			} else {
				return arg0 / 1000000 + "M";
			}
		} catch (@Pc(39) RuntimeException local39) {
			signlink.reporterror("51325, " + arg0 + ", " + 644 + ", " + local39.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "main", descriptor = "([Ljava/lang/String;)V")
	public static void main(@OriginalArg(0) String[] arg0) {
		try {
			System.out.println("RS2 user client - release #" + 375);
			if (arg0.length == 5) {
				anInt1072 = Integer.parseInt(arg0[0]);
				anInt1073 = Integer.parseInt(arg0[1]);
				if (arg0[2].equals("lowmem")) {
					method683();
				} else if (arg0[2].equals("highmem")) {
					method674();
				} else {
					System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
					return;
				}
				if (arg0[3].equals("free")) {
					aBoolean271 = false;
				} else if (arg0[3].equals("members")) {
					aBoolean271 = true;
				} else {
					System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
					return;
				}
				signlink.anInt1076 = Integer.parseInt(arg0[4]);
				signlink.startpriv(InetAddress.getLocalHost());
				@Pc(87) client local87 = new client();
				local87.method576();
			} else {
				System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
			}
		} catch (@Pc(94) Exception local94) {
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(III)Ljava/lang/String;")
	private static String method656(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(16) int local16 = arg1 - arg0;
			if (local16 < -9) {
				return "@red@";
			} else if (local16 < -6) {
				return "@or3@";
			} else if (local16 < -3) {
				return "@or2@";
			} else if (local16 < 0) {
				return "@or1@";
			} else if (local16 > 9) {
				return "@gre@";
			} else if (local16 > 6) {
				return "@gr3@";
			} else if (local16 > 3) {
				return "@gr2@";
			} else if (local16 > 0) {
				return "@gr1@";
			} else {
				return "@yel@";
			}
		} catch (@Pc(57) RuntimeException local57) {
			signlink.reporterror("39702, " + arg0 + ", " + arg1 + ", " + 8 + ", " + local57.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "z", descriptor = "(I)V")
	private static void method674() {
		try {
			Class29.aBoolean129 = false;
			Class2_Sub1_Sub1_Sub3.aBoolean91 = false;
			aBoolean272 = false;
			Class42.aBoolean215 = false;
			Class33.aBoolean180 = false;
		} catch (@Pc(14) RuntimeException local14) {
			signlink.reporterror("23415, " + 0 + ", " + local14.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "E", descriptor = "(I)V")
	private static void method683() {
		try {
			Class29.aBoolean129 = true;
			Class2_Sub1_Sub1_Sub3.aBoolean91 = true;
			aBoolean272 = true;
			Class42.aBoolean215 = true;
			Class33.aBoolean180 = true;
		} catch (@Pc(16) RuntimeException local16) {
			signlink.reporterror("99434, " + -444 + ", " + local16.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(IB)Ljava/lang/String;")
	private static String method701(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		try {
			@Pc(6) boolean local6 = false;
			@Pc(18) String local18 = String.valueOf(arg0);
			for (@Pc(23) int local23 = local18.length() - 3; local23 > 0; local23 -= 3) {
				local18 = local18.substring(0, local23) + "," + local18.substring(local23);
			}
			if (local18.length() > 8) {
				local18 = "@gre@" + local18.substring(0, local18.length() - 8) + " million @whi@(" + local18 + ")";
			} else if (local18.length() > 4) {
				local18 = "@cya@" + local18.substring(0, local18.length() - 4) + "K @whi@(" + local18 + ")";
			}
			return " " + local18;
		} catch (@Pc(103) RuntimeException local103) {
			signlink.reporterror("12505, " + arg0 + ", " + arg1 + ", " + local103.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!BSNPYLEV;IZ)V")
	private void method589(@OriginalArg(0) Class2_Sub1_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		try {
			if (arg2) {
				this.anInt973 = -1;
			}
			while (arg0.anInt82 + 21 < arg1 * 8) {
				@Pc(17) int local17 = arg0.method105(14, 588);
				if (local17 == 16383) {
					break;
				}
				if (this.aClass2_Sub1_Sub3_Sub1_Sub2Array1[local17] == null) {
					this.aClass2_Sub1_Sub3_Sub1_Sub2Array1[local17] = new Class2_Sub1_Sub3_Sub1_Sub2();
				}
				@Pc(37) Class2_Sub1_Sub3_Sub1_Sub2 local37 = this.aClass2_Sub1_Sub3_Sub1_Sub2Array1[local17];
				this.anIntArray215[this.anInt866++] = local17;
				local37.anInt706 = anInt970;
				@Pc(56) int local56 = arg0.method105(1, 588);
				if (local56 == 1) {
					this.anIntArray246[this.anInt950++] = local17;
				}
				@Pc(75) int local75 = arg0.method105(5, 588);
				if (local75 > 15) {
					local75 -= 32;
				}
				@Pc(84) int local84 = arg0.method105(1, 588);
				@Pc(89) int local89 = arg0.method105(5, 588);
				if (local89 > 15) {
					local89 -= 32;
				}
				local37.aClass48_2 = Class48.method568(arg0.method105(13, 588));
				local37.anInt659 = local37.aClass48_2.aByte58;
				local37.anInt696 = local37.aClass48_2.anInt816;
				local37.anInt660 = local37.aClass48_2.anInt803;
				local37.anInt661 = local37.aClass48_2.anInt806;
				local37.anInt662 = local37.aClass48_2.anInt812;
				local37.anInt663 = local37.aClass48_2.anInt813;
				local37.anInt672 = local37.aClass48_2.anInt798;
				local37.method494(593, aClass2_Sub1_Sub3_Sub1_Sub1_1.anIntArray165[0] + local75, aClass2_Sub1_Sub3_Sub1_Sub1_1.anIntArray166[0] + local89, local84 == 1);
			}
			arg0.method106();
		} catch (@Pc(163) RuntimeException local163) {
			signlink.reporterror("55857, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local163.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "f", descriptor = "(I)V")
	private void method590() {
		try {
			this.aClass20_16.method230(this.anInt1025);
			@Pc(19) int local19;
			@Pc(21) int local21;
			if (this.anInt1007 == 2) {
				@Pc(14) byte[] local14 = this.aClass2_Sub1_Sub1_Sub4_9.aByteArray10;
				@Pc(16) int[] local16 = Class2_Sub1_Sub1.anIntArray68;
				local19 = local14.length;
				for (local21 = 0; local21 < local19; local21++) {
					if (local14[local21] == 0) {
						local16[local21] = 0;
					}
				}
				this.aClass2_Sub1_Sub1_Sub2_4.method73(256, this.anIntArray258, 25, 0, this.anInt857, 0, 33, this.anIntArray224, 25, 33);
				this.aClass20_17.method230(this.anInt1025);
				Class2_Sub1_Sub1_Sub3.anIntArray59 = this.anIntArray231;
			} else {
				@Pc(69) int local69 = this.anInt857 + this.anInt1017 & 0x7FF;
				@Pc(80) int local80 = aClass2_Sub1_Sub3_Sub1_Sub1_1.anInt680 / 32 + 48;
				local19 = 464 - aClass2_Sub1_Sub3_Sub1_Sub1_1.anInt681 / 32;
				this.aClass2_Sub1_Sub1_Sub2_9.method73(this.anInt926 + 256, this.anIntArray213, local19, 5, local69, 25, 151, this.anIntArray256, local80, 146);
				this.aClass2_Sub1_Sub1_Sub2_4.method73(256, this.anIntArray258, 25, 0, this.anInt857, 0, 33, this.anIntArray224, 25, 33);
				for (local21 = 0; local21 < this.anInt960; local21++) {
					local80 = this.anIntArray249[local21] * 4 + 2 - aClass2_Sub1_Sub3_Sub1_Sub1_1.anInt680 / 32;
					local19 = this.anIntArray250[local21] * 4 + 2 - aClass2_Sub1_Sub3_Sub1_Sub1_1.anInt681 / 32;
					this.method691(this.aClass2_Sub1_Sub1_Sub2Array6[local21], local19, local80);
				}
				@Pc(175) int local175;
				for (@Pc(171) int local171 = 0; local171 < 104; local171++) {
					for (local175 = 0; local175 < 104; local175++) {
						@Pc(187) Class13 local187 = this.aClass13ArrayArrayArray1[this.anInt882][local171][local175];
						if (local187 != null) {
							local80 = local171 * 4 + 2 - aClass2_Sub1_Sub3_Sub1_Sub1_1.anInt680 / 32;
							local19 = local175 * 4 + 2 - aClass2_Sub1_Sub3_Sub1_Sub1_1.anInt681 / 32;
							this.method691(this.aClass2_Sub1_Sub1_Sub2_12, local19, local80);
						}
					}
				}
				for (local175 = 0; local175 < this.anInt866; local175++) {
					@Pc(238) Class2_Sub1_Sub3_Sub1_Sub2 local238 = this.aClass2_Sub1_Sub3_Sub1_Sub2Array1[this.anIntArray215[local175]];
					if (local238 != null && local238.method492()) {
						@Pc(247) Class48 local247 = local238.aClass48_2;
						if (local247.anIntArray195 != null) {
							local247 = local247.method570();
						}
						if (local247 != null && local247.aBoolean218 && local247.aBoolean219) {
							local80 = local238.anInt680 / 32 - aClass2_Sub1_Sub3_Sub1_Sub1_1.anInt680 / 32;
							local19 = local238.anInt681 / 32 - aClass2_Sub1_Sub3_Sub1_Sub1_1.anInt681 / 32;
							this.method691(this.aClass2_Sub1_Sub1_Sub2_13, local19, local80);
						}
					}
				}
				@Pc(306) Class2_Sub1_Sub3_Sub1_Sub1 local306;
				for (@Pc(296) int local296 = 0; local296 < this.anInt949; local296++) {
					local306 = this.aClass2_Sub1_Sub3_Sub1_Sub1Array1[this.anIntArray245[local296]];
					if (local306 != null && local306.method492()) {
						local80 = local306.anInt680 / 32 - aClass2_Sub1_Sub3_Sub1_Sub1_1.anInt680 / 32;
						local19 = local306.anInt681 / 32 - aClass2_Sub1_Sub3_Sub1_Sub1_1.anInt681 / 32;
						@Pc(334) boolean local334 = false;
						@Pc(338) long local338 = Class34.method478(local306.aString5);
						for (@Pc(340) int local340 = 0; local340 < this.anInt1013; local340++) {
							if (local338 == this.aLongArray3[local340] && this.anIntArray252[local340] != 0) {
								local334 = true;
								break;
							}
						}
						@Pc(365) boolean local365 = false;
						if (aClass2_Sub1_Sub3_Sub1_Sub1_1.anInt351 != 0 && local306.anInt351 != 0 && aClass2_Sub1_Sub3_Sub1_Sub1_1.anInt351 == local306.anInt351) {
							local365 = true;
						}
						if (local334) {
							this.method691(this.aClass2_Sub1_Sub1_Sub2_15, local19, local80);
						} else if (local365) {
							this.method691(this.aClass2_Sub1_Sub1_Sub2_16, local19, local80);
						} else {
							this.method691(this.aClass2_Sub1_Sub1_Sub2_14, local19, local80);
						}
					}
				}
				if (this.anInt1030 != 0 && anInt970 % 20 < 10) {
					if (this.anInt1030 == 1 && this.anInt1062 >= 0 && this.anInt1062 < this.aClass2_Sub1_Sub3_Sub1_Sub2Array1.length) {
						@Pc(439) Class2_Sub1_Sub3_Sub1_Sub2 local439 = this.aClass2_Sub1_Sub3_Sub1_Sub2Array1[this.anInt1062];
						if (local439 != null) {
							local80 = local439.anInt680 / 32 - aClass2_Sub1_Sub3_Sub1_Sub1_1.anInt680 / 32;
							local19 = local439.anInt681 / 32 - aClass2_Sub1_Sub3_Sub1_Sub1_1.anInt681 / 32;
							this.method591(this.aClass2_Sub1_Sub1_Sub2_6, local80, local19);
						}
					}
					if (this.anInt1030 == 2) {
						local80 = (this.anInt977 - this.anInt951) * 4 + 2 - aClass2_Sub1_Sub3_Sub1_Sub1_1.anInt680 / 32;
						local19 = (this.anInt978 - this.anInt952) * 4 + 2 - aClass2_Sub1_Sub3_Sub1_Sub1_1.anInt681 / 32;
						this.method591(this.aClass2_Sub1_Sub1_Sub2_6, local80, local19);
					}
					if (this.anInt1030 == 10 && this.anInt875 >= 0 && this.anInt875 < this.aClass2_Sub1_Sub3_Sub1_Sub1Array1.length) {
						local306 = this.aClass2_Sub1_Sub3_Sub1_Sub1Array1[this.anInt875];
						if (local306 != null) {
							local80 = local306.anInt680 / 32 - aClass2_Sub1_Sub3_Sub1_Sub1_1.anInt680 / 32;
							local19 = local306.anInt681 / 32 - aClass2_Sub1_Sub3_Sub1_Sub1_1.anInt681 / 32;
							this.method591(this.aClass2_Sub1_Sub1_Sub2_6, local80, local19);
						}
					}
				}
				if (this.anInt931 != 0) {
					local80 = this.anInt931 * 4 + 2 - aClass2_Sub1_Sub3_Sub1_Sub1_1.anInt680 / 32;
					local19 = this.anInt932 * 4 + 2 - aClass2_Sub1_Sub3_Sub1_Sub1_1.anInt681 / 32;
					this.method691(this.aClass2_Sub1_Sub1_Sub2_5, local19, local80);
				}
				Class2_Sub1_Sub1.method278(this.aByte62, 3, 78, 97, 3, 16777215);
				this.aClass20_17.method230(this.anInt1025);
				Class2_Sub1_Sub1_Sub3.anIntArray59 = this.anIntArray231;
			}
		} catch (@Pc(609) RuntimeException local609) {
			signlink.reporterror("62449, " + -7092 + ", " + local609.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILclient!BISLJVZR;II)V")
	private void method591(@OriginalArg(1) Class2_Sub1_Sub1_Sub2 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		try {
			@Pc(15) int local15 = arg1 * arg1 + arg2 * arg2;
			if (local15 > 4225 && local15 < 90000) {
				@Pc(29) int local29 = this.anInt857 + this.anInt1017 & 0x7FF;
				@Pc(33) int local33 = Class2_Sub1_Sub3_Sub4.anIntArray150[local29];
				@Pc(37) int local37 = Class2_Sub1_Sub3_Sub4.anIntArray151[local29];
				@Pc(46) int local46 = local33 * 256 / (this.anInt926 + 256);
				@Pc(55) int local55 = local37 * 256 / (this.anInt926 + 256);
				@Pc(65) int local65 = arg2 * local46 + arg1 * local55 >> 16;
				@Pc(75) int local75 = arg2 * local55 - arg1 * local46 >> 16;
				@Pc(81) double local81 = Math.atan2((double) local65, (double) local75);
				@Pc(87) int local87 = (int) (Math.sin(local81) * 63.0D);
				@Pc(93) int local93 = (int) (Math.cos(local81) * 57.0D);
				this.aClass2_Sub1_Sub1_Sub2_17.method74(83 - local93 - 20, local87 + 94 + 4 - 10, local81);
			} else {
				this.method691(arg0, arg2, arg1);
			}
		} catch (@Pc(124) RuntimeException local124) {
			signlink.reporterror("18695, " + 2 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local124.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "g", descriptor = "(I)V")
	private void method592() {
		try {
			if (this.aClass20_18 == null) {
				this.method698();
				super.aClass20_2 = null;
				this.aClass20_3 = null;
				this.aClass20_4 = null;
				this.aClass20_5 = null;
				this.aClass20_6 = null;
				this.aClass20_7 = null;
				this.aClass20_8 = null;
				this.aClass20_9 = null;
				this.aClass20_10 = null;
				this.aClass20_11 = null;
				this.aClass20_18 = new Class20(479, 96, this.method586(), aBoolean269);
				this.aClass20_16 = new Class20(172, 156, this.method586(), aBoolean269);
				Class2_Sub1_Sub1.method276();
				this.aClass2_Sub1_Sub1_Sub4_9.method290(0, 0);
				this.aClass20_15 = new Class20(190, 261, this.method586(), aBoolean269);
				this.aClass20_17 = new Class20(512, 334, this.method586(), aBoolean269);
				Class2_Sub1_Sub1.method276();
				this.aClass20_12 = new Class20(496, 50, this.method586(), aBoolean269);
				this.aClass20_13 = new Class20(269, 37, this.method586(), aBoolean269);
				this.aClass20_14 = new Class20(249, 45, this.method586(), aBoolean269);
				this.aBoolean228 = true;
				this.aClass20_17.method230(this.anInt1025);
				Class2_Sub1_Sub1_Sub3.anIntArray59 = this.anIntArray231;
			}
		} catch (@Pc(144) RuntimeException local144) {
			signlink.reporterror("89055, " + 895 + ", " + local144.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "()V")
	@Override
	protected void method581() {
		this.method588((byte) 6, 20, "Starting up");
		if (signlink.sunjava) {
			super.anInt832 = 5;
		}
		if (aBoolean252) {
			this.aBoolean266 = true;
			return;
		}
		aBoolean252 = true;
		@Pc(21) boolean local21 = false;
		@Pc(25) String local25 = this.method595();
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
			this.aBoolean232 = true;
			return;
		}
		if (signlink.aRandomAccessFile3 != null) {
			for (@Pc(107) int local107 = 0; local107 < 5; local107++) {
				this.aClass36Array1[local107] = new Class36(false, signlink.aRandomAccessFileArray1[local107], 600000, local107 + 1, signlink.aRandomAccessFile3);
			}
		}
		try {
			this.method655();
			this.aClass35_2 = this.method612(25, 1, "title screen", "title", this.anIntArray244[1]);
			this.aClass2_Sub1_Sub1_Sub1_2 = new Class2_Sub1_Sub1_Sub1((byte) 16, this.aClass35_2, false, "p11_full");
			this.aClass2_Sub1_Sub1_Sub1_3 = new Class2_Sub1_Sub1_Sub1((byte) 16, this.aClass35_2, false, "p12_full");
			this.aClass2_Sub1_Sub1_Sub1_4 = new Class2_Sub1_Sub1_Sub1((byte) 16, this.aClass35_2, false, "b12_full");
			this.aClass2_Sub1_Sub1_Sub1_5 = new Class2_Sub1_Sub1_Sub1((byte) 16, this.aClass35_2, true, "q8_full");
			this.method597();
			this.method593();
			@Pc(203) Class35 local203 = this.method612(30, 2, "config", "config", this.anIntArray244[2]);
			@Pc(215) Class35 local215 = this.method612(35, 3, "interface", "interface", this.anIntArray244[3]);
			@Pc(227) Class35 local227 = this.method612(40, 4, "2d graphics", "media", this.anIntArray244[4]);
			@Pc(239) Class35 local239 = this.method612(45, 6, "textures", "textures", this.anIntArray244[6]);
			@Pc(251) Class35 local251 = this.method612(50, 7, "chat system", "wordenc", this.anIntArray244[7]);
			@Pc(263) Class35 local263 = this.method612(55, 8, "sound effects", "sounds", this.anIntArray244[8]);
			this.aByteArrayArrayArray8 = new byte[4][104][104];
			this.anIntArrayArrayArray8 = new int[4][105][105];
			this.aClass29_1 = new Class29(0, 4, this.anIntArrayArrayArray8, 104, 104);
			for (@Pc(288) int local288 = 0; local288 < 4; local288++) {
				this.aClass12Array1[local288] = new Class12(1, 104, 104);
			}
			this.aClass2_Sub1_Sub1_Sub2_9 = new Class2_Sub1_Sub1_Sub2(512, 512);
			@Pc(323) Class35 local323 = this.method612(60, 5, "update list", "versionlist", this.anIntArray244[5]);
			this.method588((byte) 6, 60, "Connecting to update server");
			this.aClass9_Sub1_1 = new Class9_Sub1();
			this.aClass9_Sub1_1.method523(local323, this);
			Class45.method553(this.aClass9_Sub1_1.method512());
			Class2_Sub1_Sub3_Sub4.method428(this.aClass9_Sub1_1.method514(0), this.aClass9_Sub1_1);
			if (!aBoolean272) {
				this.anInt854 = 0;
				this.aBoolean230 = true;
				this.aClass9_Sub1_1.method526(2, this.anInt854);
				while (this.aClass9_Sub1_1.method522() > 0) {
					this.method694();
					try {
						Thread.sleep(100L);
					} catch (@Pc(374) Exception local374) {
					}
					if (this.aClass9_Sub1_1.anInt744 > 3) {
						this.method648("ondemand");
						return;
					}
				}
			}
			this.method588((byte) 6, 65, "Requesting animations");
			@Pc(398) int local398 = this.aClass9_Sub1_1.method514(1);
			for (@Pc(400) int local400 = 0; local400 < local398; local400++) {
				this.aClass9_Sub1_1.method526(1, local400);
			}
			@Pc(419) int local419;
			while (this.aClass9_Sub1_1.method522() > 0) {
				local419 = local398 - this.aClass9_Sub1_1.method522();
				if (local419 > 0) {
					this.method588((byte) 6, 65, "Loading animations - " + local419 * 100 / local398 + "%");
				}
				this.method694();
				try {
					Thread.sleep(100L);
				} catch (@Pc(445) Exception local445) {
				}
				if (this.aClass9_Sub1_1.anInt744 > 3) {
					this.method648("ondemand");
					return;
				}
			}
			this.method588((byte) 6, 70, "Requesting models");
			local398 = this.aClass9_Sub1_1.method514(0);
			@Pc(479) int local479;
			for (local419 = 0; local419 < local398; local419++) {
				local479 = this.aClass9_Sub1_1.method509(local419);
				if ((local479 & 0x1) != 0) {
					this.aClass9_Sub1_1.method526(0, local419);
				}
			}
			local398 = this.aClass9_Sub1_1.method522();
			while (this.aClass9_Sub1_1.method522() > 0) {
				local479 = local398 - this.aClass9_Sub1_1.method522();
				if (local479 > 0) {
					this.method588((byte) 6, 70, "Loading models - " + local479 * 100 / local398 + "%");
				}
				this.method694();
				try {
					Thread.sleep(100L);
				} catch (@Pc(530) Exception local530) {
				}
			}
			if (this.aClass36Array1[0] != null) {
				this.method588((byte) 6, 75, "Requesting maps");
				this.aClass9_Sub1_1.method526(3, this.aClass9_Sub1_1.method511(0, 47, 48));
				this.aClass9_Sub1_1.method526(3, this.aClass9_Sub1_1.method511(1, 47, 48));
				this.aClass9_Sub1_1.method526(3, this.aClass9_Sub1_1.method511(0, 48, 48));
				this.aClass9_Sub1_1.method526(3, this.aClass9_Sub1_1.method511(1, 48, 48));
				this.aClass9_Sub1_1.method526(3, this.aClass9_Sub1_1.method511(0, 49, 48));
				this.aClass9_Sub1_1.method526(3, this.aClass9_Sub1_1.method511(1, 49, 48));
				this.aClass9_Sub1_1.method526(3, this.aClass9_Sub1_1.method511(0, 47, 47));
				this.aClass9_Sub1_1.method526(3, this.aClass9_Sub1_1.method511(1, 47, 47));
				this.aClass9_Sub1_1.method526(3, this.aClass9_Sub1_1.method511(0, 48, 47));
				this.aClass9_Sub1_1.method526(3, this.aClass9_Sub1_1.method511(1, 48, 47));
				this.aClass9_Sub1_1.method526(3, this.aClass9_Sub1_1.method511(0, 48, 148));
				this.aClass9_Sub1_1.method526(3, this.aClass9_Sub1_1.method511(1, 48, 148));
				local398 = this.aClass9_Sub1_1.method522();
				while (this.aClass9_Sub1_1.method522() > 0) {
					local479 = local398 - this.aClass9_Sub1_1.method522();
					if (local479 > 0) {
						this.method588((byte) 6, 75, "Loading maps - " + local479 * 100 / local398 + "%");
					}
					this.method694();
					try {
						Thread.sleep(100L);
					} catch (@Pc(715) Exception local715) {
					}
				}
			}
			local398 = this.aClass9_Sub1_1.method514(0);
			@Pc(736) int local736;
			for (local479 = 0; local479 < local398; local479++) {
				local736 = this.aClass9_Sub1_1.method509(local479);
				@Pc(738) byte local738 = 0;
				if ((local736 & 0x8) != 0) {
					local738 = 10;
				} else if ((local736 & 0x20) != 0) {
					local738 = 9;
				} else if ((local736 & 0x10) != 0) {
					local738 = 8;
				} else if ((local736 & 0x40) != 0) {
					local738 = 7;
				} else if ((local736 & 0x80) != 0) {
					local738 = 6;
				} else if ((local736 & 0x2) != 0) {
					local738 = 5;
				} else if ((local736 & 0x4) != 0) {
					local738 = 4;
				}
				if ((local736 & 0x1) != 0) {
					local738 = 3;
				}
				if (local738 != 0) {
					this.aClass9_Sub1_1.method518(local479, local738, 0);
				}
			}
			this.aClass9_Sub1_1.method528(aBoolean271);
			if (!aBoolean272) {
				local398 = this.aClass9_Sub1_1.method514(2);
				for (local736 = 1; local736 < local398; local736++) {
					if (this.aClass9_Sub1_1.method513(local736)) {
						this.aClass9_Sub1_1.method518(local736, (byte) 1, 2);
					}
				}
			}
			local398 = this.aClass9_Sub1_1.method514(0);
			@Pc(861) int local861;
			for (local736 = 0; local736 < local398; local736++) {
				local861 = this.aClass9_Sub1_1.method509(local736);
				if (local861 == 0 && this.aClass9_Sub1_1.anInt746 < 200) {
					this.aClass9_Sub1_1.method518(local736, (byte) 1, 0);
				}
			}
			this.method588((byte) 6, 80, "Unpacking media");
			this.aClass2_Sub1_Sub1_Sub4_8 = new Class2_Sub1_Sub1_Sub4(local227, "invback", 0);
			this.aClass2_Sub1_Sub1_Sub4_10 = new Class2_Sub1_Sub1_Sub4(local227, "chatback", 0);
			this.aClass2_Sub1_Sub1_Sub4_9 = new Class2_Sub1_Sub1_Sub4(local227, "mapback", 0);
			this.aClass2_Sub1_Sub1_Sub4_3 = new Class2_Sub1_Sub1_Sub4(local227, "backbase1", 0);
			this.aClass2_Sub1_Sub1_Sub4_4 = new Class2_Sub1_Sub1_Sub4(local227, "backbase2", 0);
			this.aClass2_Sub1_Sub1_Sub4_5 = new Class2_Sub1_Sub1_Sub4(local227, "backhmid1", 0);
			for (local861 = 0; local861 < 13; local861++) {
				this.aClass2_Sub1_Sub1_Sub4Array2[local861] = new Class2_Sub1_Sub1_Sub4(local227, "sideicons", local861);
			}
			this.aClass2_Sub1_Sub1_Sub2_4 = new Class2_Sub1_Sub1_Sub2(local227, "compass", 0);
			this.aClass2_Sub1_Sub1_Sub2_17 = new Class2_Sub1_Sub1_Sub2(local227, "mapedge", 0);
			this.aClass2_Sub1_Sub1_Sub2_17.method66();
			for (@Pc(972) int local972 = 0; local972 < 72; local972++) {
				this.aClass2_Sub1_Sub1_Sub4Array5[local972] = new Class2_Sub1_Sub1_Sub4(local227, "mapscene", local972);
			}
			for (@Pc(990) int local990 = 0; local990 < 70; local990++) {
				this.aClass2_Sub1_Sub1_Sub2Array4[local990] = new Class2_Sub1_Sub1_Sub2(local227, "mapfunction", local990);
			}
			for (@Pc(1008) int local1008 = 0; local1008 < 5; local1008++) {
				this.aClass2_Sub1_Sub1_Sub2Array9[local1008] = new Class2_Sub1_Sub1_Sub2(local227, "hitmarks", local1008);
			}
			for (@Pc(1026) int local1026 = 0; local1026 < 6; local1026++) {
				this.aClass2_Sub1_Sub1_Sub2Array8[local1026] = new Class2_Sub1_Sub1_Sub2(local227, "headicons_pk", local1026);
			}
			for (@Pc(1044) int local1044 = 0; local1044 < 9; local1044++) {
				this.aClass2_Sub1_Sub1_Sub2Array5[local1044] = new Class2_Sub1_Sub1_Sub2(local227, "headicons_prayer", local1044);
			}
			for (@Pc(1062) int local1062 = 0; local1062 < 6; local1062++) {
				this.aClass2_Sub1_Sub1_Sub2Array7[local1062] = new Class2_Sub1_Sub1_Sub2(local227, "headicons_hint", local1062);
			}
			this.aClass2_Sub1_Sub1_Sub2_3 = new Class2_Sub1_Sub1_Sub2(local227, "overlay_multiway", 0);
			this.aClass2_Sub1_Sub1_Sub2_5 = new Class2_Sub1_Sub1_Sub2(local227, "mapmarker", 0);
			this.aClass2_Sub1_Sub1_Sub2_6 = new Class2_Sub1_Sub1_Sub2(local227, "mapmarker", 1);
			for (@Pc(1104) int local1104 = 0; local1104 < 8; local1104++) {
				this.aClass2_Sub1_Sub1_Sub2Array10[local1104] = new Class2_Sub1_Sub1_Sub2(local227, "cross", local1104);
			}
			this.aClass2_Sub1_Sub1_Sub2_12 = new Class2_Sub1_Sub1_Sub2(local227, "mapdots", 0);
			this.aClass2_Sub1_Sub1_Sub2_13 = new Class2_Sub1_Sub1_Sub2(local227, "mapdots", 1);
			this.aClass2_Sub1_Sub1_Sub2_14 = new Class2_Sub1_Sub1_Sub2(local227, "mapdots", 2);
			this.aClass2_Sub1_Sub1_Sub2_15 = new Class2_Sub1_Sub1_Sub2(local227, "mapdots", 3);
			this.aClass2_Sub1_Sub1_Sub2_16 = new Class2_Sub1_Sub1_Sub2(local227, "mapdots", 4);
			this.aClass2_Sub1_Sub1_Sub4_6 = new Class2_Sub1_Sub1_Sub4(local227, "scrollbar", 0);
			this.aClass2_Sub1_Sub1_Sub4_7 = new Class2_Sub1_Sub1_Sub4(local227, "scrollbar", 1);
			this.aClass2_Sub1_Sub1_Sub4_11 = new Class2_Sub1_Sub1_Sub4(local227, "redstone1", 0);
			this.aClass2_Sub1_Sub1_Sub4_12 = new Class2_Sub1_Sub1_Sub4(local227, "redstone2", 0);
			this.aClass2_Sub1_Sub1_Sub4_13 = new Class2_Sub1_Sub1_Sub4(local227, "redstone3", 0);
			this.aClass2_Sub1_Sub1_Sub4_14 = new Class2_Sub1_Sub1_Sub4(local227, "redstone1", 0);
			this.aClass2_Sub1_Sub1_Sub4_14.method287();
			this.aClass2_Sub1_Sub1_Sub4_15 = new Class2_Sub1_Sub1_Sub4(local227, "redstone2", 0);
			this.aClass2_Sub1_Sub1_Sub4_15.method287();
			this.aClass2_Sub1_Sub1_Sub4_16 = new Class2_Sub1_Sub1_Sub4(local227, "redstone1", 0);
			this.aClass2_Sub1_Sub1_Sub4_16.method288();
			this.aClass2_Sub1_Sub1_Sub4_17 = new Class2_Sub1_Sub1_Sub4(local227, "redstone2", 0);
			this.aClass2_Sub1_Sub1_Sub4_17.method288();
			this.aClass2_Sub1_Sub1_Sub4_18 = new Class2_Sub1_Sub1_Sub4(local227, "redstone3", 0);
			this.aClass2_Sub1_Sub1_Sub4_18.method288();
			this.aClass2_Sub1_Sub1_Sub4_19 = new Class2_Sub1_Sub1_Sub4(local227, "redstone1", 0);
			this.aClass2_Sub1_Sub1_Sub4_19.method287();
			this.aClass2_Sub1_Sub1_Sub4_19.method288();
			this.aClass2_Sub1_Sub1_Sub4_20 = new Class2_Sub1_Sub1_Sub4(local227, "redstone2", 0);
			this.aClass2_Sub1_Sub1_Sub4_20.method287();
			this.aClass2_Sub1_Sub1_Sub4_20.method288();
			for (@Pc(1294) int local1294 = 0; local1294 < 2; local1294++) {
				this.aClass2_Sub1_Sub1_Sub4Array3[local1294] = new Class2_Sub1_Sub1_Sub4(local227, "mod_icons", local1294);
			}
			@Pc(1317) Class2_Sub1_Sub1_Sub2 local1317 = new Class2_Sub1_Sub1_Sub2(local227, "backleft1", 0);
			this.aClass20_19 = new Class20(local1317.anInt61, local1317.anInt62, this.method586(), aBoolean269);
			local1317.method67(0, 952, 0);
			@Pc(1342) Class2_Sub1_Sub1_Sub2 local1342 = new Class2_Sub1_Sub1_Sub2(local227, "backleft2", 0);
			this.aClass20_20 = new Class20(local1342.anInt61, local1342.anInt62, this.method586(), aBoolean269);
			local1342.method67(0, 952, 0);
			@Pc(1367) Class2_Sub1_Sub1_Sub2 local1367 = new Class2_Sub1_Sub1_Sub2(local227, "backright1", 0);
			this.aClass20_21 = new Class20(local1367.anInt61, local1367.anInt62, this.method586(), aBoolean269);
			local1367.method67(0, 952, 0);
			@Pc(1392) Class2_Sub1_Sub1_Sub2 local1392 = new Class2_Sub1_Sub1_Sub2(local227, "backright2", 0);
			this.aClass20_22 = new Class20(local1392.anInt61, local1392.anInt62, this.method586(), aBoolean269);
			local1392.method67(0, 952, 0);
			@Pc(1417) Class2_Sub1_Sub1_Sub2 local1417 = new Class2_Sub1_Sub1_Sub2(local227, "backtop1", 0);
			this.aClass20_23 = new Class20(local1417.anInt61, local1417.anInt62, this.method586(), aBoolean269);
			local1417.method67(0, 952, 0);
			@Pc(1442) Class2_Sub1_Sub1_Sub2 local1442 = new Class2_Sub1_Sub1_Sub2(local227, "backvmid1", 0);
			this.aClass20_24 = new Class20(local1442.anInt61, local1442.anInt62, this.method586(), aBoolean269);
			local1442.method67(0, 952, 0);
			@Pc(1467) Class2_Sub1_Sub1_Sub2 local1467 = new Class2_Sub1_Sub1_Sub2(local227, "backvmid2", 0);
			this.aClass20_25 = new Class20(local1467.anInt61, local1467.anInt62, this.method586(), aBoolean269);
			local1467.method67(0, 952, 0);
			@Pc(1492) Class2_Sub1_Sub1_Sub2 local1492 = new Class2_Sub1_Sub1_Sub2(local227, "backvmid3", 0);
			this.aClass20_26 = new Class20(local1492.anInt61, local1492.anInt62, this.method586(), aBoolean269);
			local1492.method67(0, 952, 0);
			@Pc(1517) Class2_Sub1_Sub1_Sub2 local1517 = new Class2_Sub1_Sub1_Sub2(local227, "backhmid2", 0);
			this.aClass20_27 = new Class20(local1517.anInt61, local1517.anInt62, this.method586(), aBoolean269);
			local1517.method67(0, 952, 0);
			@Pc(1542) int local1542 = (int) (Math.random() * 21.0D) - 10;
			@Pc(1549) int local1549 = (int) (Math.random() * 21.0D) - 10;
			@Pc(1556) int local1556 = (int) (Math.random() * 21.0D) - 10;
			@Pc(1563) int local1563 = (int) (Math.random() * 41.0D) - 20;
			for (@Pc(1565) int local1565 = 0; local1565 < 100; local1565++) {
				if (this.aClass2_Sub1_Sub1_Sub2Array4[local1565] != null) {
					this.aClass2_Sub1_Sub1_Sub2Array4[local1565].method65(local1542 + local1563, local1556 + local1563, local1549 + local1563);
				}
				if (this.aClass2_Sub1_Sub1_Sub4Array5[local1565] != null) {
					this.aClass2_Sub1_Sub1_Sub4Array5[local1565].method289(local1542 + local1563, local1556 + local1563, local1549 + local1563);
				}
			}
			this.method588((byte) 6, 83, "Unpacking textures");
			Class2_Sub1_Sub1_Sub3.method252(local239);
			Class2_Sub1_Sub1_Sub3.method256(0.8D);
			Class2_Sub1_Sub1_Sub3.method251();
			this.method588((byte) 6, 86, "Unpacking config");
			Class22.method264(local203);
			Class33.method463(local203);
			Class40.method504(local203);
			Class32.method405(local203);
			Class48.method569(local203);
			Class14.method218(local203);
			Class27.method314(local203);
			Class1.method1(local203);
			Class10.method178(local203);
			Class32.aBoolean153 = aBoolean271;
			if (!aBoolean272) {
				this.method588((byte) 6, 90, "Unpacking sounds");
				@Pc(1668) byte[] local1668 = local263.method485("sounds.dat", null);
				@Pc(1674) Class2_Sub1_Sub2 local1674 = new Class2_Sub1_Sub2(local1668, (byte) 3);
				Class8.method171(local1674);
			}
			this.method588((byte) 6, 95, "Unpacking interfaces");
			@Pc(1705) Class2_Sub1_Sub1_Sub1[] local1705 = new Class2_Sub1_Sub1_Sub1[] { this.aClass2_Sub1_Sub1_Sub1_2, this.aClass2_Sub1_Sub1_Sub1_3, this.aClass2_Sub1_Sub1_Sub1_4, this.aClass2_Sub1_Sub1_Sub1_5 };
			Class31.method402(local227, local1705, local215);
			this.method588((byte) 6, 100, "Preparing game engine");
			@Pc(1721) int local1721;
			@Pc(1723) int local1723;
			@Pc(1725) int local1725;
			for (@Pc(1717) int local1717 = 0; local1717 < 33; local1717++) {
				local1721 = 999;
				local1723 = 0;
				for (local1725 = 0; local1725 < 34; local1725++) {
					if (this.aClass2_Sub1_Sub1_Sub4_9.aByteArray10[local1725 + local1717 * this.aClass2_Sub1_Sub1_Sub4_9.anInt292] == 0) {
						if (local1721 == 999) {
							local1721 = local1725;
						}
					} else if (local1721 != 999) {
						local1723 = local1725;
						break;
					}
				}
				this.anIntArray224[local1717] = local1721;
				this.anIntArray258[local1717] = local1723 - local1721;
			}
			@Pc(1783) int local1783;
			for (local1721 = 5; local1721 < 156; local1721++) {
				local1723 = 999;
				local1725 = 0;
				for (local1783 = 25; local1783 < 172; local1783++) {
					if (this.aClass2_Sub1_Sub1_Sub4_9.aByteArray10[local1783 + local1721 * this.aClass2_Sub1_Sub1_Sub4_9.anInt292] == 0 && (local1783 > 34 || local1721 > 34)) {
						if (local1723 == 999) {
							local1723 = local1783;
						}
					} else if (local1723 != 999) {
						local1725 = local1783;
						break;
					}
				}
				this.anIntArray256[local1721 - 5] = local1723 - 25;
				this.anIntArray213[local1721 - 5] = local1725 - local1723;
			}
			Class2_Sub1_Sub1_Sub3.method249(503, 765);
			this.anIntArray232 = Class2_Sub1_Sub1_Sub3.anIntArray59;
			Class2_Sub1_Sub1_Sub3.method249(96, 479);
			this.anIntArray229 = Class2_Sub1_Sub1_Sub3.anIntArray59;
			Class2_Sub1_Sub1_Sub3.method249(261, 190);
			this.anIntArray230 = Class2_Sub1_Sub1_Sub3.anIntArray59;
			Class2_Sub1_Sub1_Sub3.method249(334, 512);
			this.anIntArray231 = Class2_Sub1_Sub1_Sub3.anIntArray59;
			@Pc(1874) int[] local1874 = new int[9];
			for (local1725 = 0; local1725 < 9; local1725++) {
				local1783 = local1725 * 32 + 128 + 15;
				@Pc(1892) int local1892 = local1783 * 3 + 600;
				@Pc(1896) int local1896 = Class2_Sub1_Sub1_Sub3.anIntArray57[local1783];
				local1874[local1725] = local1892 * local1896 >> 16;
			}
			Class29.method360(local1874);
			Class6.method133(local251);
			this.aClass19_1 = new Class19(0, this);
			this.method587(this.aClass19_1, 10);
			Class2_Sub1_Sub3_Sub6.aClient3 = this;
			Class33.aClient2 = this;
			Class48.aClient5 = this;
		} catch (@Pc(1937) Exception local1937) {
			signlink.reporterror("loaderror " + this.aString21 + " " + this.anInt1063);
			this.aBoolean267 = true;
		}
	}

	@OriginalMember(owner = "client!client", name = "h", descriptor = "(I)V")
	private void method593() {
		try {
			this.aClass2_Sub1_Sub1_Sub4_1 = new Class2_Sub1_Sub1_Sub4(this.aClass35_2, "titlebox", 0);
			this.aClass2_Sub1_Sub1_Sub4_2 = new Class2_Sub1_Sub1_Sub4(this.aClass35_2, "titlebutton", 0);
			this.aClass2_Sub1_Sub1_Sub4Array4 = new Class2_Sub1_Sub1_Sub4[12];
			for (@Pc(38) int local38 = 0; local38 < 12; local38++) {
				this.aClass2_Sub1_Sub1_Sub4Array4[local38] = new Class2_Sub1_Sub1_Sub4(this.aClass35_2, "runes", local38);
			}
			this.aClass2_Sub1_Sub1_Sub2_7 = new Class2_Sub1_Sub1_Sub2(128, 265);
			this.aClass2_Sub1_Sub1_Sub2_8 = new Class2_Sub1_Sub1_Sub2(128, 265);
			for (@Pc(71) int local71 = 0; local71 < 33920; local71++) {
				this.aClass2_Sub1_Sub1_Sub2_7.anIntArray10[local71] = this.aClass20_6.anIntArray53[local71];
			}
			for (@Pc(89) int local89 = 0; local89 < 33920; local89++) {
				this.aClass2_Sub1_Sub1_Sub2_8.anIntArray10[local89] = this.aClass20_7.anIntArray53[local89];
			}
			this.anIntArray236 = new int[256];
			for (@Pc(111) int local111 = 0; local111 < 64; local111++) {
				this.anIntArray236[local111] = local111 * 262144;
			}
			for (@Pc(126) int local126 = 0; local126 < 64; local126++) {
				this.anIntArray236[local126 + 64] = local126 * 1024 + 16711680;
			}
			for (@Pc(145) int local145 = 0; local145 < 64; local145++) {
				this.anIntArray236[local145 + 128] = local145 * 4 + 16776960;
			}
			for (@Pc(164) int local164 = 0; local164 < 64; local164++) {
				this.anIntArray236[local164 + 192] = 16777215;
			}
			this.anIntArray237 = new int[256];
			for (@Pc(183) int local183 = 0; local183 < 64; local183++) {
				this.anIntArray237[local183] = local183 * 1024;
			}
			for (@Pc(198) int local198 = 0; local198 < 64; local198++) {
				this.anIntArray237[local198 + 64] = local198 * 4 + 65280;
			}
			for (@Pc(217) int local217 = 0; local217 < 64; local217++) {
				this.anIntArray237[local217 + 128] = local217 * 262144 + 65535;
			}
			for (@Pc(236) int local236 = 0; local236 < 64; local236++) {
				this.anIntArray237[local236 + 192] = 16777215;
			}
			this.anIntArray238 = new int[256];
			for (@Pc(255) int local255 = 0; local255 < 64; local255++) {
				this.anIntArray238[local255] = local255 * 4;
			}
			for (@Pc(270) int local270 = 0; local270 < 64; local270++) {
				this.anIntArray238[local270 + 64] = local270 * 262144 + 255;
			}
			for (@Pc(289) int local289 = 0; local289 < 64; local289++) {
				this.anIntArray238[local289 + 128] = local289 * 1024 + 16711935;
			}
			for (@Pc(308) int local308 = 0; local308 < 64; local308++) {
				this.anIntArray238[local308 + 192] = 16777215;
			}
			this.anIntArray235 = new int[256];
			this.anIntArray239 = new int[32768];
			this.anIntArray240 = new int[32768];
			this.method721(null);
			this.anIntArray275 = new int[32768];
			this.anIntArray276 = new int[32768];
			this.method588((byte) 6, 10, "Connecting to fileserver");
			if (!this.aBoolean236) {
				this.aBoolean227 = true;
				this.aBoolean236 = true;
				this.method587(this, 2);
			}
		} catch (@Pc(365) RuntimeException local365) {
			signlink.reporterror("39859, " + 2 + ", " + local365.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(BLclient!BSNPYLEV;I)V")
	private void method594(@OriginalArg(0) byte arg0, @OriginalArg(1) Class2_Sub1_Sub2 arg1, @OriginalArg(2) int arg2) {
		try {
			if (this.aByte66 == 8) {
				@Pc(7) boolean local7 = false;
			} else {
				this.anInt896 = this.aClass46_2.method558();
			}
			while (arg1.anInt82 + 10 < arg2 * 8) {
				@Pc(27) int local27 = arg1.method105(11, 588);
				if (local27 == 2047) {
					break;
				}
				if (this.aClass2_Sub1_Sub3_Sub1_Sub1Array1[local27] == null) {
					this.aClass2_Sub1_Sub3_Sub1_Sub1Array1[local27] = new Class2_Sub1_Sub3_Sub1_Sub1();
					if (this.aClass2_Sub1_Sub2Array1[local27] != null) {
						this.aClass2_Sub1_Sub3_Sub1_Sub1Array1[local27].method303(this.aClass2_Sub1_Sub2Array1[local27]);
					}
				}
				this.anIntArray245[this.anInt949++] = local27;
				@Pc(73) Class2_Sub1_Sub3_Sub1_Sub1 local73 = this.aClass2_Sub1_Sub3_Sub1_Sub1Array1[local27];
				local73.anInt706 = anInt970;
				@Pc(81) int local81 = arg1.method105(5, 588);
				if (local81 > 15) {
					local81 -= 32;
				}
				@Pc(90) int local90 = arg1.method105(1, 588);
				if (local90 == 1) {
					this.anIntArray246[this.anInt950++] = local27;
				}
				@Pc(109) int local109 = arg1.method105(5, 588);
				if (local109 > 15) {
					local109 -= 32;
				}
				@Pc(118) int local118 = arg1.method105(1, 588);
				local73.method494(593, aClass2_Sub1_Sub3_Sub1_Sub1_1.anIntArray165[0] + local81, aClass2_Sub1_Sub3_Sub1_Sub1_1.anIntArray166[0] + local109, local118 == 1);
			}
			arg1.method106();
		} catch (@Pc(146) RuntimeException local146) {
			signlink.reporterror("23685, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local146.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(B)Ljava/lang/String;")
	private String method595() {
		try {
			if (signlink.mainapp == null) {
				return super.aFrame_Sub1_2 == null ? super.getDocumentBase().getHost().toLowerCase() : "runescape.com";
			} else {
				return signlink.mainapp.getDocumentBase().getHost().toLowerCase();
			}
		} catch (@Pc(24) RuntimeException local24) {
			signlink.reporterror("16512, " + 107 + ", " + local24.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIII)Z")
	private boolean method596(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		try {
			@Pc(7) int local7 = arg0 >> 14 & 0x7FFF;
			@Pc(16) int local16 = this.aClass29_1.method354(this.anInt882, arg2, arg1, arg0);
			if (local16 == -1) {
				return false;
			}
			@Pc(25) int local25 = local16 & 0x1F;
			@Pc(31) int local31 = local16 >> 6 & 0x3;
			if (local25 == 10 || local25 == 11 || local25 == 22) {
				@Pc(43) Class33 local43 = Class33.method459(local7);
				@Pc(51) int local51;
				@Pc(54) int local54;
				if (local31 == 0 || local31 == 2) {
					local51 = local43.anInt609;
					local54 = local43.anInt617;
				} else {
					local51 = local43.anInt617;
					local54 = local43.anInt609;
				}
				@Pc(65) int local65 = local43.anInt612;
				if (local31 != 0) {
					local65 = (local65 << local31 & 0xF) + (local65 >> 4 - local31);
				}
				this.method659(0, local54, local51, arg2, aClass2_Sub1_Sub3_Sub1_Sub1_1.anIntArray166[0], 2, local65, aClass2_Sub1_Sub3_Sub1_Sub1_1.anIntArray165[0], true, 0, arg1);
			} else {
				this.method659(local25 + 1, 0, 0, arg2, aClass2_Sub1_Sub3_Sub1_Sub1_1.anIntArray166[0], 2, 0, aClass2_Sub1_Sub3_Sub1_Sub1_1.anIntArray165[0], true, local31, arg1);
			}
			this.anInt989 = super.anInt844;
			this.anInt990 = super.anInt845;
			this.anInt992 = 2;
			this.anInt991 = 0;
			return true;
		} catch (@Pc(147) RuntimeException local147) {
			signlink.reporterror("2900, " + arg0 + ", " + arg1 + ", " + -41461 + ", " + arg2 + ", " + local147.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(B)V")
	private void method597() {
		try {
			@Pc(7) byte[] local7 = this.aClass35_2.method485("title.dat", null);
			@Pc(13) Class2_Sub1_Sub1_Sub2 local13 = new Class2_Sub1_Sub1_Sub2(local7, this);
			this.aClass20_6.method230(this.anInt1025);
			local13.method67(0, 952, 0);
			this.aClass20_7.method230(this.anInt1025);
			local13.method67(0, 952, -637);
			this.aClass20_3.method230(this.anInt1025);
			local13.method67(0, 952, -128);
			this.aClass20_4.method230(this.anInt1025);
			local13.method67(-371, 952, -202);
			this.aClass20_5.method230(this.anInt1025);
			local13.method67(-171, 952, -202);
			this.aClass20_8.method230(this.anInt1025);
			local13.method67(-265, 952, 0);
			this.aClass20_9.method230(this.anInt1025);
			local13.method67(-265, 952, -562);
			this.aClass20_10.method230(this.anInt1025);
			local13.method67(-171, 952, -128);
			this.aClass20_11.method230(this.anInt1025);
			local13.method67(-171, 952, -562);
			@Pc(107) int[] local107 = new int[local13.anInt61];
			for (@Pc(109) int local109 = 0; local109 < local13.anInt62; local109++) {
				for (@Pc(113) int local113 = 0; local113 < local13.anInt61; local113++) {
					local107[local113] = local13.anIntArray10[local13.anInt61 + local13.anInt61 * local109 - local113 - 1];
				}
				for (@Pc(139) int local139 = 0; local139 < local13.anInt61; local139++) {
					local13.anIntArray10[local139 + local13.anInt61 * local109] = local107[local139];
				}
			}
			this.aClass20_6.method230(this.anInt1025);
			local13.method67(0, 952, 382);
			this.aClass20_7.method230(this.anInt1025);
			local13.method67(0, 952, -255);
			this.aClass20_3.method230(this.anInt1025);
			local13.method67(0, 952, 254);
			this.aClass20_4.method230(this.anInt1025);
			local13.method67(-371, 952, 180);
			this.aClass20_5.method230(this.anInt1025);
			local13.method67(-171, 952, 180);
			this.aClass20_8.method230(this.anInt1025);
			local13.method67(-265, 952, 382);
			this.aClass20_9.method230(this.anInt1025);
			local13.method67(-265, 952, -180);
			this.aClass20_10.method230(this.anInt1025);
			local13.method67(-171, 952, 254);
			this.aClass20_11.method230(this.anInt1025);
			local13.method67(-171, 952, -180);
			local13 = new Class2_Sub1_Sub1_Sub2(this.aClass35_2, "logo", 0);
			this.aClass20_3.method230(this.anInt1025);
			local13.method69(18, 382 - local13.anInt61 / 2 - 128);
			System.gc();
		} catch (@Pc(298) RuntimeException local298) {
			signlink.reporterror("64532, " + 0 + ", " + local298.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ZLjava/lang/String;)V")
	private void method598(@OriginalArg(1) String arg0) {
		try {
			if (arg0 == null || arg0.length() == 0) {
				this.anInt883 = 0;
			} else {
				@Pc(12) String local12 = arg0;
				@Pc(15) String[] local15 = new String[100];
				@Pc(17) int local17 = 0;
				while (true) {
					@Pc(28) int local28 = local12.indexOf(" ");
					if (local28 == -1) {
						local12 = local12.trim();
						if (local12.length() > 0) {
							local15[local17++] = local12.toLowerCase();
						}
						this.anInt883 = 0;
						label49: for (local28 = 0; local28 < Class32.anInt522; local28++) {
							@Pc(77) Class32 local77 = Class32.method412(local28);
							if (local77.anInt550 == -1 && local77.aString11 != null) {
								@Pc(88) String local88 = local77.aString11.toLowerCase();
								for (@Pc(90) int local90 = 0; local90 < local17; local90++) {
									if (local88.indexOf(local15[local90]) == -1) {
										continue label49;
									}
								}
								this.aStringArray9[this.anInt883] = local88;
								this.anIntArray227[this.anInt883] = local28;
								this.anInt883++;
								if (this.anInt883 >= this.aStringArray9.length) {
									return;
								}
							}
						}
						return;
					}
					@Pc(37) String local37 = local12.substring(0, local28).trim();
					if (local37.length() > 0) {
						local15[local17++] = local37.toLowerCase();
					}
					local12 = local12.substring(local28 + 1);
				}
			}
		} catch (@Pc(135) RuntimeException local135) {
			signlink.reporterror("2849, " + true + ", " + arg0 + ", " + local135.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(II)V")
	private void method599(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(9) Class13 local9 = this.aClass13ArrayArrayArray1[this.anInt882][arg0][arg1];
		if (local9 == null) {
			this.aClass29_1.method345(this.anInt882, arg0, arg1);
			return;
		}
		@Pc(21) int local21 = -99999999;
		@Pc(23) Class2_Sub1_Sub3_Sub2 local23 = null;
		@Pc(27) Class2_Sub1_Sub3_Sub2 local27;
		for (local27 = (Class2_Sub1_Sub3_Sub2) local9.method200(); local27 != null; local27 = (Class2_Sub1_Sub3_Sub2) local9.method202()) {
			@Pc(32) Class32 local32 = Class32.method412(local27.anInt276);
			@Pc(35) int local35 = local32.anInt543;
			if (local32.aBoolean154) {
				local35 *= local27.anInt275 + 1;
			}
			if (local35 > local21) {
				local21 = local35;
				local23 = local27;
			}
		}
		local9.method198(local23);
		@Pc(65) Class2_Sub1_Sub3_Sub2 local65 = null;
		@Pc(67) Class2_Sub1_Sub3_Sub2 local67 = null;
		for (local27 = (Class2_Sub1_Sub3_Sub2) local9.method200(); local27 != null; local27 = (Class2_Sub1_Sub3_Sub2) local9.method202()) {
			if (local27.anInt276 != local23.anInt276 && local65 == null) {
				local65 = local27;
			}
			if (local27.anInt276 != local23.anInt276 && local27.anInt276 != local65.anInt276 && local67 == null) {
				local67 = local27;
			}
		}
		@Pc(110) int local110 = arg0 + (arg1 << 7) + 1610612736;
		this.aClass29_1.method331(arg0, local65, local110, this.anInt882, local23, local67, this.method622(arg1 * 128 + 64, this.anInt882, arg0 * 128 + 64), arg1);
	}

	@OriginalMember(owner = "client!client", name = "i", descriptor = "(I)V")
	private void method600() {
		try {
			@Pc(6) int local6 = this.anInt1033 * 128 + 64;
			@Pc(13) int local13 = this.anInt1034 * 128 + 64;
			@Pc(24) int local24 = this.method622(local13, this.anInt882, local6) - this.anInt1035;
			if (this.anInt913 < local6) {
				this.anInt913 += this.anInt1036 + (local6 - this.anInt913) * this.anInt1037 / 1000;
				if (this.anInt913 > local6) {
					this.anInt913 = local6;
				}
			}
			if (this.anInt913 > local6) {
				this.anInt913 -= this.anInt1036 + (this.anInt913 - local6) * this.anInt1037 / 1000;
				if (this.anInt913 < local6) {
					this.anInt913 = local6;
				}
			}
			if (this.anInt914 < local24) {
				this.anInt914 += this.anInt1036 + (local24 - this.anInt914) * this.anInt1037 / 1000;
				if (this.anInt914 > local24) {
					this.anInt914 = local24;
				}
			}
			if (this.anInt914 > local24) {
				this.anInt914 -= this.anInt1036 + (this.anInt914 - local24) * this.anInt1037 / 1000;
				if (this.anInt914 < local24) {
					this.anInt914 = local24;
				}
			}
			if (this.anInt915 < local13) {
				this.anInt915 += this.anInt1036 + (local13 - this.anInt915) * this.anInt1037 / 1000;
				if (this.anInt915 > local13) {
					this.anInt915 = local13;
				}
			}
			if (this.anInt915 > local13) {
				this.anInt915 -= this.anInt1036 + (this.anInt915 - local13) * this.anInt1037 / 1000;
				if (this.anInt915 < local13) {
					this.anInt915 = local13;
				}
			}
			local6 = this.anInt906 * 128 + 64;
			local13 = this.anInt907 * 128 + 64;
			local24 = this.method622(local13, this.anInt882, local6) - this.anInt908;
			@Pc(222) int local222 = local6 - this.anInt913;
			@Pc(227) int local227 = local24 - this.anInt914;
			@Pc(232) int local232 = local13 - this.anInt915;
			@Pc(243) int local243 = (int) Math.sqrt((double) (local222 * local222 + local232 * local232));
			@Pc(254) int local254 = (int) (Math.atan2((double) local227, (double) local243) * 325.949D) & 0x7FF;
			@Pc(273) int local273 = (int) (Math.atan2((double) local222, (double) local232) * -325.949D) & 0x7FF;
			if (local254 < 128) {
				local254 = 128;
			}
			if (local254 > 383) {
				local254 = 383;
			}
			if (this.anInt916 < local254) {
				this.anInt916 += this.anInt909 + (local254 - this.anInt916) * this.anInt910 / 1000;
				if (this.anInt916 > local254) {
					this.anInt916 = local254;
				}
			}
			if (this.anInt916 > local254) {
				this.anInt916 -= this.anInt909 + (this.anInt916 - local254) * this.anInt910 / 1000;
				if (this.anInt916 < local254) {
					this.anInt916 = local254;
				}
			}
			@Pc(344) int local344 = local273 - this.anInt917;
			if (local344 > 1024) {
				local344 -= 2048;
			}
			if (local344 < -1024) {
				local344 += 2048;
			}
			if (local344 > 0) {
				this.anInt917 += this.anInt909 + local344 * this.anInt910 / 1000;
				this.anInt917 &= 0x7FF;
			}
			if (local344 < 0) {
				this.anInt917 -= this.anInt909 + -local344 * this.anInt910 / 1000;
				this.anInt917 &= 0x7FF;
			}
			@Pc(402) int local402 = local273 - this.anInt917;
			if (local402 > 1024) {
				local402 -= 2048;
			}
			if (local402 < -1024) {
				local402 += 2048;
			}
			if (local402 < 0 && local344 > 0 || local402 > 0 && local344 < 0) {
				this.anInt917 = local273;
			}
		} catch (@Pc(423) RuntimeException local423) {
			signlink.reporterror("11320, " + 49563 + ", " + local423.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IZ)V")
	private void method601(@OriginalArg(1) boolean arg0) {
		try {
			if (aClass2_Sub1_Sub3_Sub1_Sub1_1.anInt680 >> 7 == this.anInt931 && aClass2_Sub1_Sub3_Sub1_Sub1_1.anInt681 >> 7 == this.anInt932) {
				this.anInt931 = 0;
			}
			@Pc(21) int local21 = this.anInt949;
			if (arg0) {
				local21 = 1;
			}
			for (@Pc(27) int local27 = 0; local27 < local21; local27++) {
				@Pc(33) Class2_Sub1_Sub3_Sub1_Sub1 local33;
				@Pc(38) int local38;
				if (arg0) {
					local33 = aClass2_Sub1_Sub3_Sub1_Sub1_1;
					local38 = this.anInt948 << 14;
				} else {
					local33 = this.aClass2_Sub1_Sub3_Sub1_Sub1Array1[this.anIntArray245[local27]];
					local38 = this.anIntArray245[local27] << 14;
				}
				if (local33 != null && local33.method492()) {
					local33.aBoolean117 = false;
					if ((aBoolean272 && this.anInt949 > 50 || this.anInt949 > 200) && !arg0 && local33.anInt693 == local33.anInt672) {
						local33.aBoolean117 = true;
					}
					@Pc(89) int local89 = local33.anInt680 >> 7;
					@Pc(94) int local94 = local33.anInt681 >> 7;
					if (local89 >= 0 && local89 < 104 && local94 >= 0 && local94 < 104) {
						if (local33.aClass2_Sub1_Sub3_Sub4_1 == null || anInt970 < local33.anInt363 || anInt970 >= local33.anInt364) {
							if ((local33.anInt680 & 0x7F) == 64 && (local33.anInt681 & 0x7F) == 64) {
								if (this.anIntArrayArray24[local89][local94] == this.anInt886) {
									continue;
								}
								this.anIntArrayArray24[local89][local94] = this.anInt886;
							}
							local33.anInt349 = this.method622(local33.anInt681, this.anInt882, local33.anInt680);
							this.aClass29_1.method335(local33, this.anInt882, local33.anInt682, local33.aBoolean201, local38, local33.anInt349, 60, local33.anInt681, local33.anInt680);
						} else {
							local33.aBoolean117 = false;
							local33.anInt349 = this.method622(local33.anInt681, this.anInt882, local33.anInt680);
							this.aClass29_1.method336(local33.anInt682, local33.anInt358, local33.anInt357, local33.anInt360, local33.anInt349, local33.anInt359, local38, local33, local33.anInt681, local33.anInt680, this.anInt882);
						}
					}
				}
			}
		} catch (@Pc(226) RuntimeException local226) {
			signlink.reporterror("34752, " + 37609 + ", " + arg0 + ", " + local226.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "j", descriptor = "(I)V")
	private void method602() {
		try {
			for (@Pc(3) int local3 = 0; local3 < this.anInt938; local3++) {
				if (this.anIntArray233[local3] <= 0) {
					@Pc(12) boolean local12 = false;
					try {
						if (this.anIntArray247[local3] != this.anInt1045 || this.anIntArray265[local3] != this.anInt1069) {
							@Pc(45) Class2_Sub1_Sub2 local45 = Class8.method172(this.anIntArray247[local3], aBoolean229, this.anIntArray265[local3]);
							if (System.currentTimeMillis() + (long) (local45.anInt81 / 22) > this.aLong29 + (long) (this.anInt946 / 22)) {
								this.anInt946 = local45.anInt81;
								this.aLong29 = System.currentTimeMillis();
								if (this.method693(this.aBoolean264, local45.aByteArray1, local45.anInt81)) {
									this.anInt1045 = this.anIntArray247[local3];
									this.anInt1069 = this.anIntArray265[local3];
								} else {
									local12 = true;
								}
							}
						} else if (!this.method673()) {
							local12 = true;
						}
					} catch (@Pc(96) Exception local96) {
						if (signlink.reporterror) {
							this.aClass2_Sub1_Sub2_6.method83(227);
							this.aClass2_Sub1_Sub2_6.method85(this.anIntArray247[local3] & 0x7FFF);
						} else {
							this.aClass2_Sub1_Sub2_6.method83(227);
							this.aClass2_Sub1_Sub2_6.method85(-1);
						}
					}
					if (local12 && this.anIntArray233[local3] != -5) {
						this.anIntArray233[local3] = -5;
					} else {
						this.anInt938--;
						for (@Pc(139) int local139 = local3; local139 < this.anInt938; local139++) {
							this.anIntArray247[local139] = this.anIntArray247[local139 + 1];
							this.anIntArray265[local139] = this.anIntArray265[local139 + 1];
							this.anIntArray233[local139] = this.anIntArray233[local139 + 1];
						}
						local3--;
					}
				} else {
					@Pc(191) int local191 = this.anIntArray233[local3]--;
				}
			}
			if (this.anInt1015 != 9) {
				this.aBoolean263 = !this.aBoolean263;
			}
			if (this.anInt1051 > 0) {
				this.anInt1051 -= 20;
				if (this.anInt1051 < 0) {
					this.anInt1051 = 0;
				}
				if (this.anInt1051 == 0 && this.aBoolean242 && !aBoolean272) {
					this.anInt854 = this.anInt892;
					this.aBoolean230 = true;
					this.aClass9_Sub1_1.method526(2, this.anInt854);
					return;
				}
			}
		} catch (@Pc(249) RuntimeException local249) {
			signlink.reporterror("76025, " + 9 + ", " + local249.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(IIII)I")
	private int method603(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		try {
			if (arg3 != 8990) {
				this.aClass13ArrayArrayArray1 = null;
			}
			@Pc(9) int local9 = 256 - arg2;
			return ((arg1 & 0xFF00FF) * local9 + (arg0 & 0xFF00FF) * arg2 & 0xFF00FF00) + ((arg1 & 0xFF00) * local9 + (arg0 & 0xFF00) * arg2 & 0xFF0000) >> 8;
		} catch (@Pc(40) RuntimeException local40) {
			signlink.reporterror("25163, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local40.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILclient!QHGHUTGN;)Z")
	private boolean method604(@OriginalArg(1) Class31 arg0) {
		try {
			if (arg0.anIntArray107 == null) {
				return false;
			}
			for (@Pc(13) int local13 = 0; local13 < arg0.anIntArray107.length; local13++) {
				@Pc(21) int local21 = this.method692(local13, arg0);
				@Pc(26) int local26 = arg0.anIntArray105[local13];
				if (arg0.anIntArray107[local13] == 2) {
					if (local21 >= local26) {
						return false;
					}
				} else if (arg0.anIntArray107[local13] == 3) {
					if (local21 <= local26) {
						return false;
					}
				} else if (arg0.anIntArray107[local13] == 4) {
					if (local21 == local26) {
						return false;
					}
				} else if (local21 != local26) {
					return false;
				}
			}
			return true;
		} catch (@Pc(73) RuntimeException local73) {
			signlink.reporterror("75992, " + 7 + ", " + arg0 + ", " + local73.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "init", descriptor = "()V")
	@Override
	public void init() {
		anInt1072 = Integer.parseInt(this.getParameter("nodeid"));
		anInt1073 = Integer.parseInt(this.getParameter("portoff"));
		@Pc(15) String local15 = this.getParameter("lowmem");
		if (local15 != null && local15.equals("1")) {
			method683();
		} else {
			method674();
		}
		@Pc(31) String local31 = this.getParameter("free");
		if (local31 != null && local31.equals("1")) {
			aBoolean271 = false;
		} else {
			aBoolean271 = true;
		}
		this.method577();
	}

	@OriginalMember(owner = "client!client", name = "k", descriptor = "(I)V")
	private void method605() {
		try {
			@Pc(14) int local14 = this.aClass2_Sub1_Sub1_Sub1_4.method37("Choose Option");
			@Pc(27) int local27;
			for (@Pc(16) int local16 = 0; local16 < this.anInt1004; local16++) {
				local27 = this.aClass2_Sub1_Sub1_Sub1_4.method37(this.aStringArray8[local16]);
				if (local27 > local14) {
					local14 = local27;
				}
			}
			local14 += 8;
			local27 = this.anInt1004 * 15 + 21;
			@Pc(70) int local70;
			@Pc(88) int local88;
			if (super.anInt844 > 4 && super.anInt845 > 4 && super.anInt844 < 516 && super.anInt845 < 338) {
				local70 = super.anInt844 - local14 / 2 - 4;
				if (local70 + local14 > 512) {
					local70 = 512 - local14;
				}
				if (local70 < 0) {
					local70 = 0;
				}
				local88 = super.anInt845 - 4;
				if (local88 + local27 > 334) {
					local88 = 334 - local27;
				}
				if (local88 < 0) {
					local88 = 0;
				}
				this.aBoolean262 = true;
				this.anInt1046 = 0;
				this.anInt1047 = local70;
				this.anInt1048 = local88;
				this.anInt1049 = local14;
				this.anInt1050 = this.anInt1004 * 15 + 22;
			}
			if (super.anInt844 > 553 && super.anInt845 > 205 && super.anInt844 < 743 && super.anInt845 < 466) {
				local70 = super.anInt844 - local14 / 2 - 553;
				if (local70 < 0) {
					local70 = 0;
				} else if (local70 + local14 > 190) {
					local70 = 190 - local14;
				}
				local88 = super.anInt845 - 205;
				if (local88 < 0) {
					local88 = 0;
				} else if (local88 + local27 > 261) {
					local88 = 261 - local27;
				}
				this.aBoolean262 = true;
				this.anInt1046 = 1;
				this.anInt1047 = local70;
				this.anInt1048 = local88;
				this.anInt1049 = local14;
				this.anInt1050 = this.anInt1004 * 15 + 22;
			}
			if (super.anInt844 > 17 && super.anInt845 > 357 && super.anInt844 < 496 && super.anInt845 < 453) {
				local70 = super.anInt844 - local14 / 2 - 17;
				if (local70 < 0) {
					local70 = 0;
				} else if (local70 + local14 > 479) {
					local70 = 479 - local14;
				}
				local88 = super.anInt845 - 357;
				if (local88 < 0) {
					local88 = 0;
				} else if (local88 + local27 > 96) {
					local88 = 96 - local27;
				}
				this.aBoolean262 = true;
				this.anInt1046 = 2;
				this.anInt1047 = local70;
				this.anInt1048 = local88;
				this.anInt1049 = local14;
				this.anInt1050 = this.anInt1004 * 15 + 22;
			}
		} catch (@Pc(292) RuntimeException local292) {
			signlink.reporterror("18069, " + -944 + ", " + local292.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Z)V")
	private void method606() {
		try {
			this.aBoolean265 = true;
			try {
				@Pc(9) long local9 = System.currentTimeMillis();
				@Pc(11) int local11 = 0;
				@Pc(13) int local13 = 20;
				while (this.aBoolean236) {
					this.anInt983++;
					this.method611();
					this.method611();
					this.method617(this.aBoolean250);
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
			this.aBoolean265 = false;
		} catch (@Pc(75) RuntimeException local75) {
			signlink.reporterror("51035, " + false + ", " + local75.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(B)V")
	private void method608(@OriginalArg(0) byte arg0) {
		try {
			signlink.aBoolean273 = false;
			signlink.anInt1081 = 0;
			signlink.midi = "stop";
			if (arg0 == this.aByte59) {
				;
			}
		} catch (@Pc(11) RuntimeException local11) {
			signlink.reporterror("39738, " + arg0 + ", " + local11.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "l", descriptor = "(I)V")
	private void method609() {
		try {
			while (true) {
				@Pc(16) int local16 = this.method580();
				if (local16 == -1) {
					return;
				}
				if (this.anInt903 != -1 && this.anInt903 == this.anInt1021) {
					if (local16 == 8 && this.aString19.length() > 0) {
						this.aString19 = this.aString19.substring(0, this.aString19.length() - 1);
					}
					if ((local16 >= 97 && local16 <= 122 || local16 >= 65 && local16 <= 90 || local16 >= 48 && local16 <= 57 || local16 == 32) && this.aString19.length() < 12) {
						this.aString19 = this.aString19 + (char) local16;
					}
				} else {
					@Pc(196) int local196;
					if (this.aBoolean237) {
						if (local16 >= 32 && local16 <= 122 && this.aString31.length() < 80) {
							this.aString31 = this.aString31 + (char) local16;
							this.aBoolean241 = true;
						}
						if (local16 == 8 && this.aString31.length() > 0) {
							this.aString31 = this.aString31.substring(0, this.aString31.length() - 1);
							this.aBoolean241 = true;
						}
						if (local16 == 13 || local16 == 10) {
							this.aBoolean237 = false;
							this.aBoolean241 = true;
							@Pc(156) long local156;
							if (this.anInt902 == 1) {
								local156 = Class34.method478(this.aString31);
								this.method619(local156);
							}
							if (this.anInt902 == 2 && this.anInt1013 > 0) {
								local156 = Class34.method478(this.aString31);
								this.method690(local156);
							}
							if (this.anInt902 == 3 && this.aString31.length() > 0) {
								this.aClass2_Sub1_Sub2_6.method83(186);
								this.aClass2_Sub1_Sub2_6.method84(0);
								local196 = this.aClass2_Sub1_Sub2_6.anInt81;
								this.aClass2_Sub1_Sub2_6.method90(this.aLong31);
								Class47.method562(this.aString31, this.aClass2_Sub1_Sub2_6);
								this.aClass2_Sub1_Sub2_6.method93(this.aClass2_Sub1_Sub2_6.anInt81 - local196);
								this.aString31 = Class47.method563(this.aString31);
								this.aString31 = Class6.method143(this.aString31);
								this.method724(Class34.method482(Class34.method479(this.aLong31)), this.aString31, 6);
								if (this.anInt900 == 2) {
									this.anInt900 = 1;
									this.aBoolean226 = true;
									this.aClass2_Sub1_Sub2_6.method83(24);
									this.aClass2_Sub1_Sub2_6.method84(this.anInt1066);
									this.aClass2_Sub1_Sub2_6.method84(this.anInt900);
									this.aClass2_Sub1_Sub2_6.method84(this.anInt895);
								}
							}
							if (this.anInt902 == 4 && this.anInt1039 < 100) {
								local156 = Class34.method478(this.aString31);
								this.method643(local156);
							}
							if (this.anInt902 == 5 && this.anInt1039 > 0) {
								local156 = Class34.method478(this.aString31);
								this.method651(local156, this.anInt1059);
							}
						}
					} else if (this.anInt912 == 1) {
						if (local16 >= 48 && local16 <= 57 && this.aString23.length() < 10) {
							this.aString23 = this.aString23 + (char) local16;
							this.aBoolean241 = true;
						}
						if (local16 == 8 && this.aString23.length() > 0) {
							this.aString23 = this.aString23.substring(0, this.aString23.length() - 1);
							this.aBoolean241 = true;
						}
						if (local16 == 13 || local16 == 10) {
							if (this.aString23.length() > 0) {
								local196 = 0;
								try {
									local196 = Integer.parseInt(this.aString23);
								} catch (@Pc(374) Exception local374) {
								}
								this.aClass2_Sub1_Sub2_6.method83(33);
								this.aClass2_Sub1_Sub2_6.method88(local196);
							}
							this.anInt912 = 0;
							this.aBoolean241 = true;
						}
					} else if (this.anInt912 == 2) {
						if (local16 >= 32 && local16 <= 122 && this.aString23.length() < 12) {
							this.aString23 = this.aString23 + (char) local16;
							this.aBoolean241 = true;
						}
						if (local16 == 8 && this.aString23.length() > 0) {
							this.aString23 = this.aString23.substring(0, this.aString23.length() - 1);
							this.aBoolean241 = true;
						}
						if (local16 == 13 || local16 == 10) {
							if (this.aString23.length() > 0) {
								this.aClass2_Sub1_Sub2_6.method83(119);
								this.aClass2_Sub1_Sub2_6.method90(Class34.method478(this.aString23));
							}
							this.anInt912 = 0;
							this.aBoolean241 = true;
						}
					} else if (this.anInt912 == 3) {
						if (local16 >= 32 && local16 <= 122 && this.aString23.length() < 40) {
							this.aString23 = this.aString23 + (char) local16;
							this.aBoolean241 = true;
						}
						if (local16 == 8 && this.aString23.length() > 0) {
							this.aString23 = this.aString23.substring(0, this.aString23.length() - 1);
							this.aBoolean241 = true;
						}
					} else if (this.anInt871 == -1 && this.anInt1008 == -1) {
						if (local16 >= 32 && local16 <= 122 && this.aString24.length() < 80) {
							this.aString24 = this.aString24 + (char) local16;
							this.aBoolean241 = true;
						}
						if (local16 == 8 && this.aString24.length() > 0) {
							this.aString24 = this.aString24.substring(0, this.aString24.length() - 1);
							this.aBoolean241 = true;
						}
						if ((local16 == 13 || local16 == 10) && this.aString24.length() > 0) {
							if (this.anInt921 == 2) {
								if (this.aString24.equals("::clientdrop")) {
									this.method660();
								}
								if (this.aString24.equals("::lag")) {
									this.method653();
								}
								if (this.aString24.equals("::prefetchmusic")) {
									for (local196 = 0; local196 < this.aClass9_Sub1_1.method514(2); local196++) {
										this.aClass9_Sub1_1.method518(local196, (byte) 1, 2);
									}
								}
								if (this.aString24.equals("::fpson")) {
									aBoolean249 = true;
								}
								if (this.aString24.equals("::fpsoff")) {
									aBoolean249 = false;
								}
								if (this.aString24.equals("::noclip")) {
									for (local196 = 0; local196 < 4; local196++) {
										for (@Pc(659) int local659 = 1; local659 < 103; local659++) {
											for (@Pc(663) int local663 = 1; local663 < 103; local663++) {
												this.aClass12Array1[local196].anIntArrayArray3[local659][local663] = 0;
											}
										}
									}
								}
							}
							if (this.aString24.startsWith("::")) {
								this.aClass2_Sub1_Sub2_6.method83(46);
								this.aClass2_Sub1_Sub2_6.method84(this.aString24.length() - 1);
								this.aClass2_Sub1_Sub2_6.method91(this.aString24.substring(2));
							} else {
								@Pc(718) String local718 = this.aString24.toLowerCase();
								@Pc(720) byte local720 = 0;
								if (local718.startsWith("yellow:")) {
									local720 = 0;
									this.aString24 = this.aString24.substring(7);
								} else if (local718.startsWith("red:")) {
									local720 = 1;
									this.aString24 = this.aString24.substring(4);
								} else if (local718.startsWith("green:")) {
									local720 = 2;
									this.aString24 = this.aString24.substring(6);
								} else if (local718.startsWith("cyan:")) {
									local720 = 3;
									this.aString24 = this.aString24.substring(5);
								} else if (local718.startsWith("purple:")) {
									local720 = 4;
									this.aString24 = this.aString24.substring(7);
								} else if (local718.startsWith("white:")) {
									local720 = 5;
									this.aString24 = this.aString24.substring(6);
								} else if (local718.startsWith("flash1:")) {
									local720 = 6;
									this.aString24 = this.aString24.substring(7);
								} else if (local718.startsWith("flash2:")) {
									local720 = 7;
									this.aString24 = this.aString24.substring(7);
								} else if (local718.startsWith("flash3:")) {
									local720 = 8;
									this.aString24 = this.aString24.substring(7);
								} else if (local718.startsWith("glow1:")) {
									local720 = 9;
									this.aString24 = this.aString24.substring(6);
								} else if (local718.startsWith("glow2:")) {
									local720 = 10;
									this.aString24 = this.aString24.substring(6);
								} else if (local718.startsWith("glow3:")) {
									local720 = 11;
									this.aString24 = this.aString24.substring(6);
								}
								local718 = this.aString24.toLowerCase();
								@Pc(892) byte local892 = 0;
								if (local718.startsWith("wave:")) {
									local892 = 1;
									this.aString24 = this.aString24.substring(5);
								} else if (local718.startsWith("wave2:")) {
									local892 = 2;
									this.aString24 = this.aString24.substring(6);
								} else if (local718.startsWith("shake:")) {
									local892 = 3;
									this.aString24 = this.aString24.substring(6);
								} else if (local718.startsWith("scroll:")) {
									local892 = 4;
									this.aString24 = this.aString24.substring(7);
								} else if (local718.startsWith("slide:")) {
									local892 = 5;
									this.aString24 = this.aString24.substring(6);
								}
								this.aClass2_Sub1_Sub2_6.method83(145);
								this.aClass2_Sub1_Sub2_6.method84(0);
								@Pc(973) int local973 = this.aClass2_Sub1_Sub2_6.anInt81;
								this.aClass2_Sub1_Sub2_6.method111(local892);
								this.aClass2_Sub1_Sub2_6.method84(local720);
								this.aClass2_Sub1_Sub2_7.anInt81 = 0;
								Class47.method562(this.aString24, this.aClass2_Sub1_Sub2_7);
								this.aClass2_Sub1_Sub2_6.method130(this.aClass2_Sub1_Sub2_7.anInt81, this.aClass2_Sub1_Sub2_7.aByteArray1);
								this.aClass2_Sub1_Sub2_6.method93(this.aClass2_Sub1_Sub2_6.anInt81 - local973);
								this.aString24 = Class47.method563(this.aString24);
								this.aString24 = Class6.method143(this.aString24);
								aClass2_Sub1_Sub3_Sub1_Sub1_1.aString13 = this.aString24;
								aClass2_Sub1_Sub3_Sub1_Sub1_1.anInt685 = local720;
								aClass2_Sub1_Sub3_Sub1_Sub1_1.anInt689 = local892;
								aClass2_Sub1_Sub3_Sub1_Sub1_1.anInt683 = 150;
								if (this.anInt921 == 2) {
									this.method724("@cr2@" + aClass2_Sub1_Sub3_Sub1_Sub1_1.aString5, aClass2_Sub1_Sub3_Sub1_Sub1_1.aString13, 2);
								} else if (this.anInt921 == 1) {
									this.method724("@cr1@" + aClass2_Sub1_Sub3_Sub1_Sub1_1.aString5, aClass2_Sub1_Sub3_Sub1_Sub1_1.aString13, 2);
								} else {
									this.method724(aClass2_Sub1_Sub3_Sub1_Sub1_1.aString5, aClass2_Sub1_Sub3_Sub1_Sub1_1.aString13, 2);
								}
								if (this.anInt1066 == 2) {
									this.anInt1066 = 3;
									this.aBoolean226 = true;
									this.aClass2_Sub1_Sub2_6.method83(24);
									this.aClass2_Sub1_Sub2_6.method84(this.anInt1066);
									this.aClass2_Sub1_Sub2_6.method84(this.anInt900);
									this.aClass2_Sub1_Sub2_6.method84(this.anInt895);
								}
							}
							this.aString24 = "";
							this.aBoolean241 = true;
						}
					}
				}
			}
		} catch (@Pc(1125) RuntimeException local1125) {
			signlink.reporterror("17838, " + 8 + ", " + local1125.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "m", descriptor = "(I)V")
	private void method610() {
		try {
			this.aClass20_18.method230(this.anInt1025);
			Class2_Sub1_Sub1_Sub3.anIntArray59 = this.anIntArray229;
			this.aClass2_Sub1_Sub1_Sub4_10.method290(0, 0);
			if (this.aBoolean237) {
				this.aClass2_Sub1_Sub1_Sub1_4.method35(0, 40, this.aString30, 239);
				this.aClass2_Sub1_Sub1_Sub1_4.method35(128, 60, this.aString31 + "*", 239);
			} else if (this.anInt912 == 1) {
				this.aClass2_Sub1_Sub1_Sub1_4.method35(0, 40, "Enter amount:", 239);
				this.aClass2_Sub1_Sub1_Sub1_4.method35(128, 60, this.aString23 + "*", 239);
			} else if (this.anInt912 == 2) {
				this.aClass2_Sub1_Sub1_Sub1_4.method35(0, 40, "Enter name:", 239);
				this.aClass2_Sub1_Sub1_Sub1_4.method35(128, 60, this.aString23 + "*", 239);
			} else {
				@Pc(126) Class2_Sub1_Sub1_Sub1 local126;
				@Pc(134) int local134;
				@Pc(145) int local145;
				if (this.anInt912 == 3) {
					if (this.aString23 != this.aString20) {
						this.method598(this.aString23);
						this.aString20 = this.aString23;
					}
					local126 = this.aClass2_Sub1_Sub1_Sub1_3;
					Class2_Sub1_Sub1.method275(0, 0, 77, 463);
					for (local134 = 0; local134 < this.anInt883; local134++) {
						local145 = local134 * 14 + 18 - this.anInt884;
						if (local145 > 0 && local145 < 110) {
							local126.method35(0, local145, this.aStringArray9[local134], 239);
						}
					}
					Class2_Sub1_Sub1.method274(this.aByte65);
					if (this.anInt883 > 5) {
						this.method662(0, this.anInt883 * 14 + 7, this.anInt884, 463, 77);
					}
					if (this.aString23.length() == 0) {
						this.aClass2_Sub1_Sub1_Sub1_4.method35(255, 40, "Enter object name", 239);
					} else if (this.anInt883 == 0) {
						this.aClass2_Sub1_Sub1_Sub1_4.method35(0, 40, "No matching objects found, please shorten search", 239);
					}
					local126.method35(0, 90, this.aString23 + "*", 239);
					Class2_Sub1_Sub1.method281(77, 479, 0, 0);
				} else if (this.aString22 != null) {
					this.aClass2_Sub1_Sub1_Sub1_4.method35(0, 40, this.aString22, 239);
					this.aClass2_Sub1_Sub1_Sub1_4.method35(128, 60, "Click to continue", 239);
				} else if (this.anInt871 != -1) {
					this.method628(0, 0, Class31.method403(this.anInt871), 0);
				} else if (this.anInt928 == -1) {
					local126 = this.aClass2_Sub1_Sub1_Sub1_3;
					local134 = 0;
					Class2_Sub1_Sub1.method275(0, 0, 77, 463);
					for (local145 = 0; local145 < 100; local145++) {
						if (this.aStringArray13[local145] != null) {
							@Pc(311) int local311 = this.anIntArray264[local145];
							@Pc(320) int local320 = this.anInt850 + 70 - local134 * 14;
							@Pc(325) String local325 = this.aStringArray12[local145];
							@Pc(327) byte local327 = 0;
							if (local325 != null && local325.startsWith("@cr1@")) {
								local325 = local325.substring(5);
								local327 = 1;
							}
							if (local325 != null && local325.startsWith("@cr2@")) {
								local325 = local325.substring(5);
								local327 = 2;
							}
							if (local311 == 0) {
								if (local320 > 0 && local320 < 110) {
									local126.method39(4, this.aStringArray13[local145], local320, 0);
								}
								local134++;
							}
							@Pc(397) int local397;
							if ((local311 == 1 || local311 == 2) && (local311 == 1 || this.anInt1066 == 0 || this.anInt1066 == 1 && this.method642(local325))) {
								if (local320 > 0 && local320 < 110) {
									local397 = 4;
									if (local327 == 1) {
										this.aClass2_Sub1_Sub1_Sub4Array3[0].method290(local320 - 12, 4);
										local397 += 14;
									}
									if (local327 == 2) {
										this.aClass2_Sub1_Sub1_Sub4Array3[1].method290(local320 - 12, local397);
										local397 += 14;
									}
									local126.method39(local397, local325 + ":", local320, 0);
									local397 += local126.method37(local325) + 8;
									local126.method39(local397, this.aStringArray13[local145], local320, 255);
								}
								local134++;
							}
							if ((local311 == 3 || local311 == 7) && this.anInt986 == 0 && (local311 == 7 || this.anInt900 == 0 || this.anInt900 == 1 && this.method642(local325))) {
								if (local320 > 0 && local320 < 110) {
									local126.method39(4, "From", local320, 0);
									local397 = local126.method37("From ") + 4;
									if (local327 == 1) {
										this.aClass2_Sub1_Sub1_Sub4Array3[0].method290(local320 - 12, local397);
										local397 += 14;
									}
									if (local327 == 2) {
										this.aClass2_Sub1_Sub1_Sub4Array3[1].method290(local320 - 12, local397);
										local397 += 14;
									}
									local126.method39(local397, local325 + ":", local320, 0);
									local397 += local126.method37(local325) + 8;
									local126.method39(local397, this.aStringArray13[local145], local320, 8388608);
								}
								local134++;
							}
							if (local311 == 4 && (this.anInt895 == 0 || this.anInt895 == 1 && this.method642(local325))) {
								if (local320 > 0 && local320 < 110) {
									local126.method39(4, local325 + " " + this.aStringArray13[local145], local320, 8388736);
								}
								local134++;
							}
							if (local311 == 5 && this.anInt986 == 0 && this.anInt900 < 2) {
								if (local320 > 0 && local320 < 110) {
									local126.method39(4, this.aStringArray13[local145], local320, 8388608);
								}
								local134++;
							}
							if (local311 == 6 && this.anInt986 == 0 && this.anInt900 < 2) {
								if (local320 > 0 && local320 < 110) {
									local126.method39(4, "To " + local325 + ":", local320, 0);
									local126.method39(local126.method37("To " + local325) + 12, this.aStringArray13[local145], local320, 8388608);
								}
								local134++;
							}
							if (local311 == 8 && (this.anInt895 == 0 || this.anInt895 == 1 && this.method642(local325))) {
								if (local320 > 0 && local320 < 110) {
									local126.method39(4, local325 + " " + this.aStringArray13[local145], local320, 8270336);
								}
								local134++;
							}
						}
					}
					Class2_Sub1_Sub1.method274(this.aByte65);
					this.anInt893 = local134 * 14 + 7;
					if (this.anInt893 < 78) {
						this.anInt893 = 78;
					}
					this.method662(0, this.anInt893, this.anInt893 - this.anInt850 - 77, 463, 77);
					@Pc(768) String local768;
					if (aClass2_Sub1_Sub3_Sub1_Sub1_1 == null || aClass2_Sub1_Sub3_Sub1_Sub1_1.aString5 == null) {
						local768 = Class34.method482(this.aString26);
					} else {
						local768 = aClass2_Sub1_Sub3_Sub1_Sub1_1.aString5;
					}
					local126.method39(4, local768 + ":", 90, 0);
					local126.method39(local126.method37(local768 + ": ") + 6, this.aString24 + "*", 90, 255);
					Class2_Sub1_Sub1.method281(77, 479, 0, 0);
				} else {
					this.method628(0, 0, Class31.method403(this.anInt928), 0);
				}
			}
			if (this.aBoolean262 && this.anInt1046 == 2) {
				this.method697(120);
			}
			this.aClass20_18.method231(357, super.aGraphics2, 17);
			this.aClass20_17.method230(this.anInt1025);
			Class2_Sub1_Sub1_Sub3.anIntArray59 = this.anIntArray231;
		} catch (@Pc(857) RuntimeException local857) {
			signlink.reporterror("64548, " + -574 + ", " + local857.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(B)V")
	private void method611() {
		try {
			@Pc(12) int local12;
			for (@Pc(5) int local5 = 10; local5 < 117; local5++) {
				local12 = (int) (Math.random() * 100.0D);
				if (local12 < 50) {
					this.anIntArray275[local5 + 32512] = 255;
				}
			}
			@Pc(41) int local41;
			@Pc(48) int local48;
			@Pc(54) int local54;
			for (local12 = 0; local12 < 100; local12++) {
				local41 = (int) (Math.random() * 124.0D) + 2;
				local48 = (int) (Math.random() * 128.0D) + 128;
				local54 = local41 + (local48 << 7);
				this.anIntArray275[local54] = 192;
			}
			for (local41 = 1; local41 < 255; local41++) {
				for (local48 = 1; local48 < 127; local48++) {
					local54 = local48 + (local41 << 7);
					this.anIntArray276[local54] = (this.anIntArray275[local54 - 1] + this.anIntArray275[local54 + 1] + this.anIntArray275[local54 - 128] + this.anIntArray275[local54 + 128]) / 4;
				}
			}
			this.anInt878 += 128;
			if (this.anInt878 > this.anIntArray239.length) {
				this.anInt878 -= this.anIntArray239.length;
				local48 = (int) (Math.random() * 12.0D);
				this.method721(this.aClass2_Sub1_Sub1_Sub4Array4[local48]);
			}
			@Pc(166) int local166;
			for (local48 = 1; local48 < 255; local48++) {
				for (local54 = 1; local54 < 127; local54++) {
					local166 = local54 + (local48 << 7);
					@Pc(189) int local189 = this.anIntArray276[local166 + 128] - this.anIntArray239[local166 + this.anInt878 & this.anIntArray239.length - 1] / 5;
					if (local189 < 0) {
						local189 = 0;
					}
					this.anIntArray275[local166] = local189;
				}
			}
			if (this.aByte60 != 2) {
				this.aClass2_Sub1_Sub2_6.method84(214);
			}
			for (local54 = 0; local54 < 255; local54++) {
				this.anIntArray263[local54] = this.anIntArray263[local54 + 1];
			}
			this.anIntArray263[255] = (int) (Math.sin((double) anInt970 / 14.0D) * 16.0D + Math.sin((double) anInt970 / 15.0D) * 14.0D + Math.sin((double) anInt970 / 16.0D) * 12.0D);
			if (this.anInt1023 > 0) {
				this.anInt1023 -= 4;
			}
			if (this.anInt1024 > 0) {
				this.anInt1024 -= 4;
			}
			if (this.anInt1023 == 0 && this.anInt1024 == 0) {
				local166 = (int) (Math.random() * 2000.0D);
				if (local166 == 0) {
					this.anInt1023 = 1024;
				}
				if (local166 == 1) {
					this.anInt1024 = 1024;
					return;
				}
			}
		} catch (@Pc(308) RuntimeException local308) {
			signlink.reporterror("75494, " + 2 + ", " + local308.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IILjava/lang/String;Ljava/lang/String;ZI)Lclient!SMIVAFST;")
	private Class35 method612(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) String arg3, @OriginalArg(5) int arg4) {
		try {
			@Pc(3) byte[] local3 = null;
			@Pc(5) int local5 = 5;
			try {
				if (this.aClass36Array1[0] != null) {
					local3 = this.aClass36Array1[0].method496(arg1);
				}
			} catch (@Pc(20) Exception local20) {
			}
			@Pc(34) int local34;
			if (local3 != null) {
				this.aCRC32_2.reset();
				this.aCRC32_2.update(local3);
				local34 = (int) this.aCRC32_2.getValue();
				if (local34 != arg4) {
					local3 = null;
				}
			}
			if (local3 != null) {
				return new Class35(local3, 0);
			}
			local34 = 0;
			while (local3 == null) {
				@Pc(59) String local59 = "Unknown error";
				this.method588((byte) 6, arg0, "Requesting " + arg2);
				@Pc(74) int local74;
				try {
					local74 = 0;
					@Pc(85) DataInputStream local85 = this.method618(arg3 + arg4);
					@Pc(88) byte[] local88 = new byte[6];
					local85.readFully(local88, 0, 6);
					@Pc(99) Class2_Sub1_Sub2 local99 = new Class2_Sub1_Sub2(local88, (byte) 3);
					local99.anInt81 = 3;
					@Pc(107) int local107 = local99.method98() + 6;
					@Pc(109) int local109 = 6;
					local3 = new byte[local107];
					for (@Pc(114) int local114 = 0; local114 < 6; local114++) {
						local3[local114] = local88[local114];
					}
					@Pc(132) int local132;
					while (local109 < local107) {
						local132 = local107 - local109;
						if (local132 > 1000) {
							local132 = 1000;
						}
						@Pc(143) int local143 = local85.read(local3, local109, local132);
						if (local143 < 0) {
							(new StringBuffer("Length error: ")).append(local109).append("/").append(local107).toString();
							throw new IOException("EOF");
						}
						local109 += local143;
						@Pc(172) int local172 = local109 * 100 / local107;
						if (local172 != local74) {
							this.method588((byte) 6, arg0, "Loading " + arg2 + " - " + local172 + "%");
						}
						local74 = local172;
					}
					local85.close();
					try {
						if (this.aClass36Array1[0] != null) {
							this.aClass36Array1[0].method497(arg1, local3, local3.length, (byte) 1);
						}
					} catch (@Pc(217) Exception local217) {
						this.aClass36Array1[0] = null;
					}
					if (local3 != null) {
						this.aCRC32_2.reset();
						this.aCRC32_2.update(local3);
						local132 = (int) this.aCRC32_2.getValue();
						if (local132 != arg4) {
							local3 = null;
							local34++;
							local59 = "Checksum error: " + local132;
						}
					}
				} catch (@Pc(252) IOException local252) {
					if (local59.equals("Unknown error")) {
						local59 = "Connection error";
					}
					local3 = null;
				} catch (@Pc(262) NullPointerException local262) {
					local59 = "Null error";
					local3 = null;
					if (!signlink.reporterror) {
						return null;
					}
				} catch (@Pc(271) ArrayIndexOutOfBoundsException local271) {
					local59 = "Bounds error";
					local3 = null;
					if (!signlink.reporterror) {
						return null;
					}
				} catch (@Pc(280) Exception local280) {
					local59 = "Unexpected error";
					local3 = null;
					if (!signlink.reporterror) {
						return null;
					}
				}
				if (local3 == null) {
					for (local74 = local5; local74 > 0; local74--) {
						if (local34 >= 3) {
							this.method588((byte) 6, arg0, "Game updated - please reload page");
							local74 = 10;
						} else {
							this.method588((byte) 6, arg0, local59 + " - Retrying in " + local74);
						}
						try {
							Thread.sleep(1000L);
						} catch (@Pc(324) Exception local324) {
						}
					}
					local5 *= 2;
					if (local5 > 60) {
						local5 = 60;
					}
					this.aBoolean235 = !this.aBoolean235;
				}
			}
			return new Class35(local3, 0);
		} catch (@Pc(356) RuntimeException local356) {
			signlink.reporterror("64898, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + false + ", " + arg4 + ", " + local356.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!KZCOXKKW;IILclient!BSNPYLEV;Z)V")
	private void method613(@OriginalArg(0) Class2_Sub1_Sub3_Sub1_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class2_Sub1_Sub2 arg3) {
		try {
			@Pc(14) int local14;
			@Pc(18) int local18;
			@Pc(22) int local22;
			if ((arg1 & 0x80) != 0) {
				local14 = arg3.method122();
				local18 = arg3.method114();
				local22 = arg3.method113();
				@Pc(25) int local25 = arg3.anInt81;
				if (arg0.aString5 != null && arg0.aBoolean115) {
					@Pc(35) long local35 = Class34.method478(arg0.aString5);
					@Pc(37) boolean local37 = false;
					if (local18 <= 1) {
						for (@Pc(42) int local42 = 0; local42 < this.anInt1039; local42++) {
							if (this.aLongArray4[local42] == local35) {
								local37 = true;
								break;
							}
						}
					}
					if (!local37 && this.anInt1070 == 0) {
						try {
							this.aClass2_Sub1_Sub2_7.anInt81 = 0;
							arg3.method131(local22, 531, this.aClass2_Sub1_Sub2_7.aByteArray1);
							this.aClass2_Sub1_Sub2_7.anInt81 = 0;
							@Pc(87) String local87 = Class47.method561(this.aClass2_Sub1_Sub2_7, local22);
							@Pc(91) String local91 = Class6.method143(local87);
							arg0.aString13 = local91;
							arg0.anInt685 = local14 >> 8;
							arg0.anInt689 = local14 & 0xFF;
							arg0.anInt683 = 150;
							if (local18 == 2 || local18 == 3) {
								this.method724("@cr2@" + arg0.aString5, local91, 1);
							} else if (local18 == 1) {
								this.method724("@cr1@" + arg0.aString5, local91, 1);
							} else {
								this.method724(arg0.aString5, local91, 2);
							}
						} catch (@Pc(155) Exception local155) {
							signlink.reporterror("cde2");
						}
					}
				}
				arg3.anInt81 = local25 + local22;
			}
			if ((arg1 & 0x20) != 0) {
				local14 = arg3.method94();
				@Pc(173) byte[] local173 = new byte[local14];
				@Pc(179) Class2_Sub1_Sub2 local179 = new Class2_Sub1_Sub2(local173, (byte) 3);
				arg3.method132(local173, local14, (byte) 8);
				this.aClass2_Sub1_Sub2Array1[arg2] = local179;
				arg0.method303(local179);
			}
			if ((arg1 & 0x1) != 0) {
				arg0.anInt687 = arg3.method120();
				arg0.anInt688 = arg3.method96();
			}
			if ((arg1 & 0x400) != 0) {
				arg0.anInt664 = arg3.method114();
				arg0.anInt666 = arg3.method114();
				arg0.anInt665 = arg3.method114();
				arg0.anInt667 = arg3.method114();
				arg0.anInt668 = arg3.method122() + anInt970;
				arg0.anInt669 = arg3.method121() + anInt970;
				arg0.anInt670 = arg3.method113();
				arg0.method491();
			}
			if ((arg1 & 0x40) != 0) {
				arg0.anInt692 = arg3.method121();
				if (arg0.anInt692 == 65535) {
					arg0.anInt692 = -1;
				}
			}
			if ((arg1 & 0x4) != 0) {
				arg0.aString13 = arg3.method101();
				if (arg0.aString13.charAt(0) == '~') {
					arg0.aString13 = arg0.aString13.substring(1);
					this.method724(arg0.aString5, arg0.aString13, 2);
				} else if (arg0 == aClass2_Sub1_Sub3_Sub1_Sub1_1) {
					this.method724(arg0.aString5, arg0.aString13, 2);
				}
				arg0.anInt685 = 0;
				arg0.anInt689 = 0;
				arg0.anInt683 = 150;
			}
			if ((arg1 & 0x10) != 0) {
				local14 = arg3.method113();
				local18 = arg3.method113();
				arg0.method493(local18, local14, anInt970);
				arg0.anInt703 = anInt970 + 300;
				arg0.anInt704 = arg3.method113();
				arg0.anInt705 = arg3.method113();
			}
			if ((arg1 & 0x200) != 0) {
				local14 = arg3.method112();
				local18 = arg3.method112();
				arg0.method493(local18, local14, anInt970);
				arg0.anInt703 = anInt970 + 300;
				arg0.anInt704 = arg3.method113();
				arg0.anInt705 = arg3.method113();
			}
			if ((arg1 & 0x8) != 0) {
				local14 = arg3.method121();
				if (local14 == 65535) {
					local14 = -1;
				}
				local18 = arg3.method114();
				if (local14 == arg0.anInt674 && local14 != -1) {
					local22 = Class22.aClass22Array1[local14].anInt270;
					if (local22 == 1) {
						arg0.anInt675 = 0;
						arg0.anInt676 = 0;
						arg0.anInt677 = local18;
						arg0.anInt678 = 0;
					}
					if (local22 == 2) {
						arg0.anInt678 = 0;
					}
				} else if (local14 == -1 || arg0.anInt674 == -1 || Class22.aClass22Array1[local14].anInt264 >= Class22.aClass22Array1[arg0.anInt674].anInt264) {
					arg0.anInt674 = local14;
					arg0.anInt675 = 0;
					arg0.anInt676 = 0;
					arg0.anInt677 = local18;
					arg0.anInt678 = 0;
					arg0.anInt684 = arg0.anInt679;
				}
			}
			if ((arg1 & 0x100) != 0) {
				arg0.anInt698 = arg3.method120();
				local14 = arg3.method128();
				arg0.anInt702 = local14 >> 16;
				arg0.anInt701 = anInt970 + (local14 & 0xFFFF);
				arg0.anInt699 = 0;
				arg0.anInt700 = 0;
				if (arg0.anInt701 > anInt970) {
					arg0.anInt699 = -1;
				}
				if (arg0.anInt698 == 65535) {
					arg0.anInt698 = -1;
					return;
				}
			}
		} catch (@Pc(520) RuntimeException local520) {
			signlink.reporterror("92834, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + false + ", " + local520.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILclient!BSNPYLEV;I)V")
	private void method614(@OriginalArg(1) Class2_Sub1_Sub2 arg0, @OriginalArg(2) int arg1) {
		try {
			@Pc(6) int local6 = arg0.method105(8, 588);
			@Pc(17) int local17;
			if (local6 < this.anInt949) {
				for (local17 = local6; local17 < this.anInt949; local17++) {
					this.anIntArray243[this.anInt939++] = this.anIntArray245[local17];
				}
			}
			if (local6 > this.anInt949) {
				signlink.reporterror(this.aString26 + " Too many players");
				throw new RuntimeException("eek");
			}
			this.anInt949 = 0;
			for (local17 = 0; local17 < local6; local17++) {
				@Pc(69) int local69 = this.anIntArray245[local17];
				@Pc(74) Class2_Sub1_Sub3_Sub1_Sub1 local74 = this.aClass2_Sub1_Sub3_Sub1_Sub1Array1[local69];
				@Pc(79) int local79 = arg0.method105(1, 588);
				if (local79 == 0) {
					this.anIntArray245[this.anInt949++] = local69;
					local74.anInt706 = anInt970;
				} else {
					@Pc(102) int local102 = arg0.method105(2, 588);
					if (local102 == 0) {
						this.anIntArray245[this.anInt949++] = local69;
						local74.anInt706 = anInt970;
						this.anIntArray246[this.anInt950++] = local69;
					} else {
						@Pc(153) int local153;
						@Pc(163) int local163;
						if (local102 == 1) {
							this.anIntArray245[this.anInt949++] = local69;
							local74.anInt706 = anInt970;
							local153 = arg0.method105(3, 588);
							local74.method490(false, local153);
							local163 = arg0.method105(1, 588);
							if (local163 == 1) {
								this.anIntArray246[this.anInt950++] = local69;
							}
						} else if (local102 == 2) {
							this.anIntArray245[this.anInt949++] = local69;
							local74.anInt706 = anInt970;
							local153 = arg0.method105(3, 588);
							local74.method490(true, local153);
							local163 = arg0.method105(3, 588);
							local74.method490(true, local163);
							@Pc(221) int local221 = arg0.method105(1, 588);
							if (local221 == 1) {
								this.anIntArray246[this.anInt950++] = local69;
							}
						} else if (local102 == 3) {
							this.anIntArray243[this.anInt939++] = local69;
						}
					}
				}
			}
		} catch (@Pc(258) RuntimeException local258) {
			signlink.reporterror("2128, " + 854 + ", " + arg0 + ", " + arg1 + ", " + local258.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "n", descriptor = "(I)V")
	private void method615(@OriginalArg(0) int arg0) {
		try {
			this.aClass20_15.method230(this.anInt1025);
			Class2_Sub1_Sub1_Sub3.anIntArray59 = this.anIntArray230;
			this.aClass2_Sub1_Sub1_Sub4_8.method290(0, 0);
			if (this.anInt982 != -1) {
				this.method628(0, 0, Class31.method403(this.anInt982), 0);
			} else if (this.anIntArray257[this.anInt1064] != -1) {
				this.method628(0, 0, Class31.method403(this.anIntArray257[this.anInt1064]), 0);
			}
			if (this.aBoolean262 && this.anInt1046 == 1) {
				this.method697(120);
			}
			this.aClass20_15.method231(205, super.aGraphics2, 553);
			@Pc(69) boolean local69 = false;
			this.aClass20_17.method230(this.anInt1025);
			Class2_Sub1_Sub1_Sub3.anIntArray59 = this.anIntArray231;
		} catch (@Pc(79) RuntimeException local79) {
			signlink.reporterror("55894, " + arg0 + ", " + local79.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IB)V")
	private void method616(@OriginalArg(0) int arg0) {
		try {
			Class31.method396(arg0);
		} catch (@Pc(14) RuntimeException local14) {
			signlink.reporterror("29958, " + arg0 + ", " + 62 + ", " + local14.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(Z)V")
	private void method617(@OriginalArg(0) boolean arg0) {
		try {
			@Pc(8) int local8;
			if (this.anInt1023 > 0) {
				for (local8 = 0; local8 < 256; local8++) {
					if (this.anInt1023 > 768) {
						this.anIntArray235[local8] = this.method603(this.anIntArray237[local8], this.anIntArray236[local8], 1024 - this.anInt1023, this.anInt869);
					} else if (this.anInt1023 > 256) {
						this.anIntArray235[local8] = this.anIntArray237[local8];
					} else {
						this.anIntArray235[local8] = this.method603(this.anIntArray236[local8], this.anIntArray237[local8], 256 - this.anInt1023, this.anInt869);
					}
				}
			} else if (this.anInt1024 > 0) {
				for (local8 = 0; local8 < 256; local8++) {
					if (this.anInt1024 > 768) {
						this.anIntArray235[local8] = this.method603(this.anIntArray238[local8], this.anIntArray236[local8], 1024 - this.anInt1024, this.anInt869);
					} else if (this.anInt1024 > 256) {
						this.anIntArray235[local8] = this.anIntArray238[local8];
					} else {
						this.anIntArray235[local8] = this.method603(this.anIntArray236[local8], this.anIntArray238[local8], 256 - this.anInt1024, this.anInt869);
					}
				}
			} else {
				for (local8 = 0; local8 < 256; local8++) {
					this.anIntArray235[local8] = this.anIntArray236[local8];
				}
			}
			for (local8 = 0; local8 < 33920; local8++) {
				this.aClass20_6.anIntArray53[local8] = this.aClass2_Sub1_Sub1_Sub2_7.anIntArray10[local8];
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
				local202 = this.anIntArray263[local189] * (256 - local189) / 256;
				local206 = local202 + 22;
				if (local206 < 0) {
					local206 = 0;
				}
				local185 += local206;
				for (local216 = local206; local216 < 128; local216++) {
					local224 = this.anIntArray275[local185++];
					if (local224 == 0) {
						local187++;
					} else {
						local228 = local224;
						local232 = 256 - local224;
						local224 = this.anIntArray235[local224];
						local243 = this.aClass20_6.anIntArray53[local187];
						this.aClass20_6.anIntArray53[local187++] = ((local224 & 0xFF00FF) * local228 + (local243 & 0xFF00FF) * local232 & 0xFF00FF00) + ((local224 & 0xFF00) * local228 + (local243 & 0xFF00) * local232 & 0xFF0000) >> 8;
					}
				}
				local187 += local206;
			}
			this.aClass20_6.method231(0, super.aGraphics2, 0);
			for (local202 = 0; local202 < 33920; local202++) {
				this.aClass20_7.anIntArray53[local202] = this.aClass2_Sub1_Sub1_Sub2_8.anIntArray10[local202];
			}
			local185 = 0;
			local187 = 1176;
			for (local206 = 1; local206 < 255; local206++) {
				local216 = this.anIntArray263[local206] * (256 - local206) / 256;
				local224 = 103 - local216;
				local187 += local216;
				for (local228 = 0; local228 < local224; local228++) {
					local232 = this.anIntArray275[local185++];
					if (local232 == 0) {
						local187++;
					} else {
						local243 = local232;
						@Pc(366) int local366 = 256 - local232;
						local232 = this.anIntArray235[local232];
						@Pc(377) int local377 = this.aClass20_7.anIntArray53[local187];
						this.aClass20_7.anIntArray53[local187++] = ((local232 & 0xFF00FF) * local243 + (local377 & 0xFF00FF) * local366 & 0xFF00FF00) + ((local232 & 0xFF00) * local243 + (local377 & 0xFF00) * local366 & 0xFF0000) >> 8;
					}
				}
				local185 += 128 - local224;
				local187 += 128 - local224 - local216;
			}
			this.aBoolean248 &= arg0;
			this.aClass20_7.method231(0, super.aGraphics2, 637);
		} catch (@Pc(455) RuntimeException local455) {
			signlink.reporterror("39665, " + arg0 + ", " + local455.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/String;)Ljava/io/DataInputStream;")
	private DataInputStream method618(@OriginalArg(0) String arg0) throws IOException {
		if (this.aBoolean235) {
			if (this.aSocket3 != null) {
				try {
					this.aSocket3.close();
				} catch (@Pc(26) Exception local26) {
				}
				this.aSocket3 = null;
			}
			this.aSocket3 = this.method638(43595);
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

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(JZ)V")
	private void method619(@OriginalArg(0) long arg0) {
		try {
			if (arg0 != 0L) {
				if (this.anInt1013 >= 100 && this.anInt888 != 1) {
					this.method724("", "Your friendlist is full. Max of 100 for free users, and 200 for members", 0);
				} else if (this.anInt1013 >= 200) {
					this.method724("", "Your friendlist is full. Max of 100 for free users, and 200 for members", 0);
				} else {
					@Pc(38) String local38 = Class34.method482(Class34.method479(arg0));
					for (@Pc(40) int local40 = 0; local40 < this.anInt1013; local40++) {
						if (this.aLongArray3[local40] == arg0) {
							this.method724("", local38 + " is already on your friend list", 0);
							return;
						}
					}
					for (@Pc(70) int local70 = 0; local70 < this.anInt1039; local70++) {
						if (this.aLongArray4[local70] == arg0) {
							this.method724("", "Please remove " + local38 + " from your ignore list first", 0);
							return;
						}
					}
					if (!local38.equals(aClass2_Sub1_Sub3_Sub1_Sub1_1.aString5)) {
						this.aStringArray11[this.anInt1013] = local38;
						this.aLongArray3[this.anInt1013] = arg0;
						this.anIntArray252[this.anInt1013] = 0;
						this.anInt1013++;
						this.aBoolean233 = true;
						this.aClass2_Sub1_Sub2_6.method83(92);
						this.aClass2_Sub1_Sub2_6.method90(arg0);
					}
				}
			}
		} catch (@Pc(154) RuntimeException local154) {
			signlink.reporterror("27584, " + arg0 + ", " + true + ", " + local154.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!QHGHUTGN;B)Z")
	private boolean method620(@OriginalArg(0) Class31 arg0) {
		try {
			@Pc(4) int local4 = arg0.anInt499;
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
				this.aStringArray8[this.anInt1004] = "Remove @whi@" + this.aStringArray11[local4];
				this.anIntArray222[this.anInt1004] = 70;
				this.anInt1004++;
				this.aStringArray8[this.anInt1004] = "Message @whi@" + this.aStringArray11[local4];
				this.anIntArray222[this.anInt1004] = 334;
				this.anInt1004++;
				return true;
			} else if (local4 >= 401 && local4 <= 500) {
				this.aStringArray8[this.anInt1004] = "Remove @whi@" + arg0.aString6;
				this.anIntArray222[this.anInt1004] = 144;
				this.anInt1004++;
				return true;
			} else {
				return false;
			}
		} catch (@Pc(135) RuntimeException local135) {
			signlink.reporterror("39336, " + arg0 + ", " + -67 + ", " + local135.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IBLclient!BSNPYLEV;)V")
	private void method621(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub1_Sub2 arg1) {
		try {
			for (@Pc(13) int local13 = 0; local13 < this.anInt950; local13++) {
				@Pc(20) int local20 = this.anIntArray246[local13];
				@Pc(25) Class2_Sub1_Sub3_Sub1_Sub2 local25 = this.aClass2_Sub1_Sub3_Sub1_Sub2Array1[local20];
				@Pc(28) int local28 = arg1.method94();
				if ((local28 & 0x20) != 0) {
					local25.anInt687 = arg1.method121();
					local25.anInt688 = arg1.method96();
				}
				if ((local28 & 0x8) != 0) {
					local25.anInt692 = arg1.method96();
					if (local25.anInt692 == 65535) {
						local25.anInt692 = -1;
					}
				}
				if ((local28 & 0x4) != 0) {
					local25.aString13 = arg1.method101();
					local25.anInt683 = 100;
				}
				if ((local28 & 0x80) != 0) {
					local25.aClass48_2 = Class48.method568(arg1.method96());
					local25.anInt659 = local25.aClass48_2.aByte58;
					local25.anInt696 = local25.aClass48_2.anInt816;
					local25.anInt660 = local25.aClass48_2.anInt803;
					local25.anInt661 = local25.aClass48_2.anInt806;
					local25.anInt662 = local25.aClass48_2.anInt812;
					local25.anInt663 = local25.aClass48_2.anInt813;
					local25.anInt672 = local25.aClass48_2.anInt798;
				}
				@Pc(119) int local119;
				@Pc(122) int local122;
				if ((local28 & 0x40) != 0) {
					local119 = arg1.method113();
					local122 = arg1.method94();
					local25.method493(local122, local119, anInt970);
					local25.anInt703 = anInt970 + 300;
					local25.anInt704 = arg1.method114();
					local25.anInt705 = arg1.method113();
				}
				if ((local28 & 0x2) != 0) {
					local119 = arg1.method96();
					if (local119 == 65535) {
						local119 = -1;
					}
					local122 = arg1.method94();
					if (local119 == local25.anInt674 && local119 != -1) {
						@Pc(170) int local170 = Class22.aClass22Array1[local119].anInt270;
						if (local170 == 1) {
							local25.anInt675 = 0;
							local25.anInt676 = 0;
							local25.anInt677 = local122;
							local25.anInt678 = 0;
						}
						if (local170 == 2) {
							local25.anInt678 = 0;
						}
					} else if (local119 == -1 || local25.anInt674 == -1 || Class22.aClass22Array1[local119].anInt264 >= Class22.aClass22Array1[local25.anInt674].anInt264) {
						local25.anInt674 = local119;
						local25.anInt675 = 0;
						local25.anInt676 = 0;
						local25.anInt677 = local122;
						local25.anInt678 = 0;
						local25.anInt684 = local25.anInt679;
					}
				}
				if ((local28 & 0x10) != 0) {
					local119 = arg1.method113();
					local122 = arg1.method112();
					local25.method493(local122, local119, anInt970);
					local25.anInt703 = anInt970 + 300;
					local25.anInt704 = arg1.method114();
					local25.anInt705 = arg1.method113();
				}
				if ((local28 & 0x1) != 0) {
					local25.anInt698 = arg1.method120();
					local119 = arg1.method128();
					local25.anInt702 = local119 >> 16;
					local25.anInt701 = anInt970 + (local119 & 0xFFFF);
					local25.anInt699 = 0;
					local25.anInt700 = 0;
					if (local25.anInt701 > anInt970) {
						local25.anInt699 = -1;
					}
					if (local25.anInt698 == 65535) {
						local25.anInt698 = -1;
					}
				}
			}
		} catch (@Pc(314) RuntimeException local314) {
			signlink.reporterror("64577, " + arg0 + ", " + 117 + ", " + arg1 + ", " + local314.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(BILjava/lang/String;)V")
	@Override
	protected void method588(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2) {
		try {
			this.anInt1063 = arg1;
			this.aString21 = arg2;
			this.method654();
			if (this.aClass35_2 == null) {
				super.method588((byte) 6, arg1, arg2);
			} else {
				this.aClass20_5.method230(this.anInt1025);
				this.aClass2_Sub1_Sub1_Sub1_4.method35(16777215, 54, "RuneScape is loading - please wait...", 180);
				Class2_Sub1_Sub1.method279(304, 34, 62, 9179409, 28);
				Class2_Sub1_Sub1.method279(302, 32, 63, 0, 29);
				Class2_Sub1_Sub1.method278(this.aByte62, arg1 * 3, 64, 30, 30, 9179409);
				@Pc(97) boolean local97 = false;
				Class2_Sub1_Sub1.method278(this.aByte62, 300 - arg1 * 3, 64, arg1 * 3 + 30, 30, 0);
				this.aClass2_Sub1_Sub1_Sub1_4.method35(16777215, 85, arg2, 180);
				this.aClass20_5.method231(171, super.aGraphics2, 202);
				if (this.aBoolean228) {
					this.aBoolean228 = false;
					if (!this.aBoolean236) {
						this.aClass20_6.method231(0, super.aGraphics2, 0);
						this.aClass20_7.method231(0, super.aGraphics2, 637);
					}
					this.aClass20_3.method231(0, super.aGraphics2, 128);
					this.aClass20_4.method231(371, super.aGraphics2, 202);
					this.aClass20_8.method231(265, super.aGraphics2, 0);
					this.aClass20_9.method231(265, super.aGraphics2, 562);
					this.aClass20_10.method231(171, super.aGraphics2, 128);
					this.aClass20_11.method231(171, super.aGraphics2, 562);
				}
			}
		} catch (@Pc(221) RuntimeException local221) {
			signlink.reporterror("8170, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local221.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(IIII)I")
	private int method622(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
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
			@Pc(48) int local48 = arg2 & 0x7F;
			@Pc(52) int local52 = arg0 & 0x7F;
			@Pc(80) int local80 = this.anIntArrayArrayArray8[local21][local3][local7] * (128 - local48) + this.anIntArrayArrayArray8[local21][local3 + 1][local7] * local48 >> 7;
			@Pc(112) int local112 = this.anIntArrayArrayArray8[local21][local3][local7 + 1] * (128 - local48) + this.anIntArrayArrayArray8[local21][local3 + 1][local7 + 1] * local48 >> 7;
			return local80 * (128 - local52) + local112 * local52 >> 7;
		} catch (@Pc(125) RuntimeException local125) {
			signlink.reporterror("94837, " + arg0 + ", " + -70 + ", " + arg1 + ", " + arg2 + ", " + local125.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IILclient!QHGHUTGN;IIBII)V")
	private void method623(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class31 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		try {
			if (arg2.anInt503 == 0 && arg2.anIntArray100 != null && !arg2.aBoolean149 && (arg6 >= arg4 && arg0 >= arg1 && arg6 <= arg4 + arg2.anInt514 && arg0 <= arg1 + arg2.anInt504)) {
				@Pc(44) int local44 = arg2.anIntArray100.length;
				for (@Pc(46) int local46 = 0; local46 < local44; local46++) {
					@Pc(55) int local55 = arg2.anIntArray99[local46] + arg4;
					@Pc(64) int local64 = arg2.anIntArray102[local46] + arg1 - arg3;
					@Pc(70) Class31 local70 = Class31.method403(arg2.anIntArray100[local46]);
					@Pc(75) int local75 = local55 + local70.anInt490;
					@Pc(80) int local80 = local64 + local70.anInt487;
					if ((local70.anInt493 >= 0 || local70.anInt505 != 0) && arg6 >= local75 && arg0 >= local80 && arg6 < local75 + local70.anInt514 && arg0 < local80 + local70.anInt504) {
						if (local70.anInt493 >= 0) {
							this.anInt967 = local70.anInt493;
						} else {
							this.anInt967 = local70.anInt491;
						}
					}
					if (local70.anInt503 == 8 && arg6 >= local75 && arg0 >= local80 && arg6 < local75 + local70.anInt514 && arg0 < local80 + local70.anInt504) {
						this.anInt851 = local70.anInt491;
					}
					if (local70.anInt503 == 0) {
						this.method623(arg0, local80, local70, local70.anInt500, local75, arg5, arg6);
						if (local70.anInt495 > local70.anInt504) {
							this.method625(arg0, arg5, arg6, local70, local75 + local70.anInt514, local70.anInt495, local70.anInt504, local80);
						}
					} else {
						if (local70.anInt517 == 1 && arg6 >= local75 && arg0 >= local80 && arg6 < local75 + local70.anInt514 && arg0 < local80 + local70.anInt504) {
							@Pc(204) boolean local204 = false;
							if (local70.anInt499 != 0) {
								local204 = this.method620(local70);
							}
							if (!local204) {
								this.aStringArray8[this.anInt1004] = local70.aString9;
								this.anIntArray222[this.anInt1004] = 887;
								this.anIntArray221[this.anInt1004] = local70.anInt491;
								this.anInt1004++;
							}
						}
						if (local70.anInt517 == 2 && this.anInt1000 == 0 && arg6 >= local75 && arg0 >= local80 && arg6 < local75 + local70.anInt514 && arg0 < local80 + local70.anInt504) {
							@Pc(268) String local268 = local70.aString10;
							if (local268.indexOf(" ") != -1) {
								local268 = local268.substring(0, local268.indexOf(" "));
							}
							this.aStringArray8[this.anInt1004] = local268 + " @gre@" + local70.aString8;
							this.anIntArray222[this.anInt1004] = 654;
							this.anIntArray221[this.anInt1004] = local70.anInt491;
							this.anInt1004++;
						}
						if (local70.anInt517 == 3 && arg6 >= local75 && arg0 >= local80 && arg6 < local75 + local70.anInt514 && arg0 < local80 + local70.anInt504) {
							this.aStringArray8[this.anInt1004] = "Close";
							if (arg5 == 3) {
								this.anIntArray222[this.anInt1004] = 419;
							} else {
								this.anIntArray222[this.anInt1004] = 8;
							}
							this.anIntArray221[this.anInt1004] = local70.anInt491;
							this.anInt1004++;
						}
						if (local70.anInt517 == 4 && arg6 >= local75 && arg0 >= local80 && arg6 < local75 + local70.anInt514 && arg0 < local80 + local70.anInt504) {
							this.aStringArray8[this.anInt1004] = local70.aString9;
							this.anIntArray222[this.anInt1004] = 609;
							this.anIntArray221[this.anInt1004] = local70.anInt491;
							this.anInt1004++;
						}
						if (local70.anInt517 == 5 && arg6 >= local75 && arg0 >= local80 && arg6 < local75 + local70.anInt514 && arg0 < local80 + local70.anInt504) {
							this.aStringArray8[this.anInt1004] = local70.aString9;
							this.anIntArray222[this.anInt1004] = 338;
							this.anIntArray221[this.anInt1004] = local70.anInt491;
							this.anInt1004++;
						}
						if (local70.anInt517 == 6 && !this.aBoolean231 && arg6 >= local75 && arg0 >= local80 && arg6 < local75 + local70.anInt514 && arg0 < local80 + local70.anInt504) {
							this.aStringArray8[this.anInt1004] = local70.aString9;
							this.anIntArray222[this.anInt1004] = 477;
							this.anIntArray221[this.anInt1004] = local70.anInt491;
							this.anInt1004++;
						}
						if (local70.anInt503 == 2) {
							@Pc(527) int local527 = 0;
							for (@Pc(529) int local529 = 0; local529 < local70.anInt504; local529++) {
								for (@Pc(533) int local533 = 0; local533 < local70.anInt514; local533++) {
									@Pc(544) int local544 = local75 + local533 * (local70.anInt483 + 32);
									@Pc(553) int local553 = local80 + local529 * (local70.anInt515 + 32);
									if (local527 < 20) {
										local544 += local70.anIntArray104[local527];
										local553 += local70.anIntArray103[local527];
									}
									if (arg6 >= local544 && arg0 >= local553 && arg6 < local544 + 32 && arg0 < local553 + 32) {
										this.anInt968 = local527;
										this.anInt969 = local70.anInt491;
										if (local70.anIntArray101[local527] > 0) {
											@Pc(606) Class32 local606 = Class32.method412(local70.anIntArray101[local527] - 1);
											if (this.anInt955 == 1 && local70.aBoolean150) {
												if (local70.anInt491 != this.anInt957 || local527 != this.anInt956) {
													this.aStringArray8[this.anInt1004] = "Use " + this.aString25 + " with @lre@" + local606.aString11;
													this.anIntArray222[this.anInt1004] = 730;
													this.anIntArray223[this.anInt1004] = local606.anInt534;
													this.anIntArray220[this.anInt1004] = local527;
													this.anIntArray221[this.anInt1004] = local70.anInt491;
													this.anInt1004++;
												}
											} else if (this.anInt1000 != 1 || !local70.aBoolean150) {
												@Pc(743) int local743;
												if (local70.aBoolean150) {
													for (local743 = 4; local743 >= 3; local743--) {
														if (local606.aStringArray4 != null && local606.aStringArray4[local743] != null) {
															this.aStringArray8[this.anInt1004] = local606.aStringArray4[local743] + " @lre@" + local606.aString11;
															if (local743 == 3) {
																this.anIntArray222[this.anInt1004] = 19;
															}
															if (local743 == 4) {
																this.anIntArray222[this.anInt1004] = 936;
															}
															this.anIntArray223[this.anInt1004] = local606.anInt534;
															this.anIntArray220[this.anInt1004] = local527;
															this.anIntArray221[this.anInt1004] = local70.anInt491;
															this.anInt1004++;
														} else if (local743 == 4) {
															this.aStringArray8[this.anInt1004] = "Drop @lre@" + local606.aString11;
															this.anIntArray222[this.anInt1004] = 936;
															this.anIntArray223[this.anInt1004] = local606.anInt534;
															this.anIntArray220[this.anInt1004] = local527;
															this.anIntArray221[this.anInt1004] = local70.anInt491;
															this.anInt1004++;
														}
													}
												}
												if (local70.aBoolean143) {
													this.aStringArray8[this.anInt1004] = "Use @lre@" + local606.aString11;
													this.anIntArray222[this.anInt1004] = 638;
													this.anIntArray223[this.anInt1004] = local606.anInt534;
													this.anIntArray220[this.anInt1004] = local527;
													this.anIntArray221[this.anInt1004] = local70.anInt491;
													this.anInt1004++;
												}
												if (local70.aBoolean150 && local606.aStringArray4 != null) {
													for (local743 = 2; local743 >= 0; local743--) {
														if (local606.aStringArray4[local743] != null) {
															this.aStringArray8[this.anInt1004] = local606.aStringArray4[local743] + " @lre@" + local606.aString11;
															if (local743 == 0) {
																this.anIntArray222[this.anInt1004] = 414;
															}
															if (local743 == 1) {
																this.anIntArray222[this.anInt1004] = 424;
															}
															if (local743 == 2) {
																this.anIntArray222[this.anInt1004] = 38;
															}
															this.anIntArray223[this.anInt1004] = local606.anInt534;
															this.anIntArray220[this.anInt1004] = local527;
															this.anIntArray221[this.anInt1004] = local70.anInt491;
															this.anInt1004++;
														}
													}
												}
												if (local70.aStringArray2 != null) {
													for (local743 = 4; local743 >= 0; local743--) {
														if (local70.aStringArray2[local743] != null) {
															this.aStringArray8[this.anInt1004] = local70.aStringArray2[local743] + " @lre@" + local606.aString11;
															if (local743 == 0) {
																this.anIntArray222[this.anInt1004] = 155;
															}
															if (local743 == 1) {
																this.anIntArray222[this.anInt1004] = 717;
															}
															if (local743 == 2) {
																this.anIntArray222[this.anInt1004] = 242;
															}
															if (local743 == 3) {
																this.anIntArray222[this.anInt1004] = 339;
															}
															if (local743 == 4) {
																this.anIntArray222[this.anInt1004] = 509;
															}
															this.anIntArray223[this.anInt1004] = local606.anInt534;
															this.anIntArray220[this.anInt1004] = local527;
															this.anIntArray221[this.anInt1004] = local70.anInt491;
															this.anInt1004++;
														}
													}
												}
												this.aStringArray8[this.anInt1004] = "Examine @lre@" + local606.aString11;
												this.anIntArray222[this.anInt1004] = 1455;
												this.anIntArray223[this.anInt1004] = local606.anInt534;
												this.anIntArray220[this.anInt1004] = local527;
												this.anIntArray221[this.anInt1004] = local70.anInt491;
												this.anInt1004++;
											} else if ((this.anInt1002 & 0x10) == 16) {
												this.aStringArray8[this.anInt1004] = this.aString28 + " @lre@" + local606.aString11;
												this.anIntArray222[this.anInt1004] = 153;
												this.anIntArray223[this.anInt1004] = local606.anInt534;
												this.anIntArray220[this.anInt1004] = local527;
												this.anIntArray221[this.anInt1004] = local70.anInt491;
												this.anInt1004++;
											}
										}
									}
									local527++;
								}
							}
						}
					}
				}
			}
		} catch (@Pc(1173) RuntimeException local1173) {
			signlink.reporterror("16775, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + -21 + ", " + arg5 + ", " + arg6 + ", " + local1173.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "f", descriptor = "(B)V")
	private void method624() {
		try {
			@Pc(4) Graphics local4 = this.method586().getGraphics();
			local4.setColor(Color.black);
			local4.fillRect(0, 0, 765, 503);
			this.method579();
			@Pc(43) byte local43;
			@Pc(49) int local49;
			if (this.aBoolean267) {
				this.aBoolean236 = false;
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
			if (this.aBoolean232) {
				this.aBoolean236 = false;
				local4.setFont(new Font("Helvetica", 1, 20));
				local4.setColor(Color.white);
				local4.drawString("Error - unable to load game!", 50, 50);
				local4.drawString("To play RuneScape make sure you play from", 50, 100);
				local4.drawString("http://www.runescape.com", 50, 150);
			}
			if (this.aBoolean266) {
				this.aBoolean236 = false;
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
			signlink.reporterror("17969, " + 30 + ", " + local181.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIILclient!QHGHUTGN;IIIII)V")
	private void method625(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class31 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		try {
			if (this.aBoolean255) {
				this.anInt901 = 32;
			} else {
				this.anInt901 = 0;
			}
			this.aBoolean255 = false;
			if (arg2 >= arg4 && arg2 < arg4 + 16 && arg0 >= arg7 && arg0 < arg7 + 16) {
				arg3.anInt500 -= this.anInt944 * 4;
				if (arg1 == 1) {
					this.aBoolean233 = true;
				}
				if (arg1 == 2 || arg1 == 3) {
					this.aBoolean241 = true;
				}
			} else if (arg2 >= arg4 && arg2 < arg4 + 16 && arg0 >= arg7 + arg6 - 16 && arg0 < arg7 + arg6) {
				arg3.anInt500 += this.anInt944 * 4;
				if (arg1 == 1) {
					this.aBoolean233 = true;
				}
				if (arg1 == 2 || arg1 == 3) {
					this.aBoolean241 = true;
				}
			} else if (arg2 >= arg4 - this.anInt901 && arg2 < arg4 + this.anInt901 + 16 && arg0 >= arg7 + 16 && arg0 < arg7 + arg6 - 16 && this.anInt944 > 0) {
				@Pc(147) int local147 = (arg6 - 32) * arg6 / arg5;
				if (local147 < 8) {
					local147 = 8;
				}
				@Pc(162) int local162 = arg0 - arg7 - local147 / 2 - 16;
				@Pc(168) int local168 = arg6 - local147 - 32;
				arg3.anInt500 = (arg5 - arg6) * local162 / local168;
				if (arg1 == 1) {
					this.aBoolean233 = true;
				}
				if (arg1 == 2 || arg1 == 3) {
					this.aBoolean241 = true;
				}
				this.aBoolean255 = true;
			}
		} catch (@Pc(197) RuntimeException local197) {
			signlink.reporterror("79196, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + 0 + ", " + arg6 + ", " + arg7 + ", " + local197.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Lclient!BSNPYLEV;IZ)V")
	private void method626(@OriginalArg(0) Class2_Sub1_Sub2 arg0, @OriginalArg(1) int arg1) {
		try {
			this.anInt939 = 0;
			this.anInt950 = 0;
			this.method718(arg1, arg0);
			this.method589(arg0, arg1, this.aBoolean243);
			this.method621(arg1, arg0);
			@Pc(37) int local37;
			for (@Pc(30) int local30 = 0; local30 < this.anInt939; local30++) {
				local37 = this.anIntArray243[local30];
				if (this.aClass2_Sub1_Sub3_Sub1_Sub2Array1[local37].anInt706 != anInt970) {
					this.aClass2_Sub1_Sub3_Sub1_Sub2Array1[local37].aClass48_2 = null;
					this.aClass2_Sub1_Sub3_Sub1_Sub2Array1[local37] = null;
				}
			}
			if (arg0.anInt81 != arg1) {
				signlink.reporterror(this.aString26 + " size mismatch in getnpcpos - pos:" + arg0.anInt81 + " psize:" + arg1);
				throw new RuntimeException("eek");
			}
			for (local37 = 0; local37 < this.anInt866; local37++) {
				if (this.aClass2_Sub1_Sub3_Sub1_Sub2Array1[this.anIntArray215[local37]] == null) {
					signlink.reporterror(this.aString26 + " null entry in npc list - pos:" + local37 + " size:" + this.anInt866);
					throw new RuntimeException("eek");
				}
			}
		} catch (@Pc(127) RuntimeException local127) {
			signlink.reporterror("19838, " + arg0 + ", " + arg1 + ", " + true + ", " + local127.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/Runnable;I)V")
	@Override
	public void method587(@OriginalArg(0) Runnable arg0, @OriginalArg(1) int arg1) {
		if (arg1 > 10) {
			arg1 = 10;
		}
		if (signlink.mainapp == null) {
			super.method587(arg0, arg1);
		} else {
			signlink.startthread(arg0, arg1);
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(Z)V")
	private void method627() {
		try {
			if (this.anInt986 != 0) {
				@Pc(8) Class2_Sub1_Sub1_Sub1 local8 = this.aClass2_Sub1_Sub1_Sub1_3;
				@Pc(19) int local19 = 0;
				if (this.anInt1068 != 0) {
					local19 = 1;
				}
				for (@Pc(26) int local26 = 0; local26 < 100; local26++) {
					if (this.aStringArray13[local26] != null) {
						@Pc(38) int local38 = this.anIntArray264[local26];
						@Pc(43) String local43 = this.aStringArray12[local26];
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
						if ((local38 == 3 || local38 == 7) && (local38 == 7 || this.anInt900 == 0 || this.anInt900 == 1 && this.method642(local43))) {
							local96 = 329 - local19 * 13;
							local8.method39(4, "From", local96, 0);
							local8.method39(4, "From", local96 - 1, 65535);
							@Pc(121) int local121 = local8.method37("From ") + 4;
							if (local45 == 1) {
								this.aClass2_Sub1_Sub1_Sub4Array3[0].method290(local96 - 12, local121);
								local121 += 14;
							}
							if (local45 == 2) {
								this.aClass2_Sub1_Sub1_Sub4Array3[1].method290(local96 - 12, local121);
								local121 += 14;
							}
							local8.method39(local121, local43 + ": " + this.aStringArray13[local26], local96, 0);
							local8.method39(local121, local43 + ": " + this.aStringArray13[local26], local96 - 1, 65535);
							local19++;
							if (local19 >= 5) {
								return;
							}
						}
						if (local38 == 5 && this.anInt900 < 2) {
							local96 = 329 - local19 * 13;
							local8.method39(4, this.aStringArray13[local26], local96, 0);
							local8.method39(4, this.aStringArray13[local26], local96 - 1, 65535);
							local19++;
							if (local19 >= 5) {
								return;
							}
						}
						if (local38 == 6 && this.anInt900 < 2) {
							local96 = 329 - local19 * 13;
							local8.method39(4, "To " + local43 + ": " + this.aStringArray13[local26], local96, 0);
							local8.method39(4, "To " + local43 + ": " + this.aStringArray13[local26], local96 - 1, 65535);
							local19++;
							if (local19 >= 5) {
								return;
							}
						}
					}
				}
			}
		} catch (@Pc(300) RuntimeException local300) {
			signlink.reporterror("96857, " + false + ", " + local300.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IILclient!QHGHUTGN;II)V")
	private void method628(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class31 arg2, @OriginalArg(4) int arg3) {
		try {
			if (arg2.anInt503 == 0 && arg2.anIntArray100 != null && (!arg2.aBoolean149 || this.anInt897 == arg2.anInt491 || this.anInt987 == arg2.anInt491 || this.anInt1029 == arg2.anInt491)) {
				@Pc(29) int local29 = Class2_Sub1_Sub1.anInt285;
				@Pc(31) int local31 = Class2_Sub1_Sub1.anInt283;
				@Pc(33) int local33 = Class2_Sub1_Sub1.anInt286;
				@Pc(35) int local35 = Class2_Sub1_Sub1.anInt284;
				Class2_Sub1_Sub1.method275(arg0, arg3, arg3 + arg2.anInt504, arg0 + arg2.anInt514);
				@Pc(51) int local51 = arg2.anIntArray100.length;
				for (@Pc(53) int local53 = 0; local53 < local51; local53++) {
					@Pc(62) int local62 = arg2.anIntArray99[local53] + arg0;
					@Pc(71) int local71 = arg2.anIntArray102[local53] + arg3 - arg1;
					@Pc(77) Class31 local77 = Class31.method403(arg2.anIntArray100[local53]);
					@Pc(82) int local82 = local62 + local77.anInt490;
					@Pc(87) int local87 = local71 + local77.anInt487;
					if (local77.anInt499 > 0) {
						this.method699(local77);
					}
					if (local77.anInt503 == 0) {
						if (local77.anInt500 > local77.anInt495 - local77.anInt504) {
							local77.anInt500 = local77.anInt495 - local77.anInt504;
						}
						if (local77.anInt500 < 0) {
							local77.anInt500 = 0;
						}
						this.method628(local82, local77.anInt500, local77, local87);
						if (local77.anInt495 > local77.anInt504) {
							this.method662(local87, local77.anInt495, local77.anInt500, local82 + local77.anInt514, local77.anInt504);
						}
					} else if (local77.anInt503 != 1) {
						@Pc(159) int local159;
						@Pc(163) int local163;
						@Pc(174) int local174;
						@Pc(209) int local209;
						@Pc(216) int local216;
						@Pc(241) int local241;
						@Pc(157) int local157;
						@Pc(207) int local207;
						if (local77.anInt503 == 2) {
							local157 = 0;
							for (local159 = 0; local159 < local77.anInt504; local159++) {
								for (local163 = 0; local163 < local77.anInt514; local163++) {
									local174 = local82 + local163 * (local77.anInt483 + 32);
									@Pc(183) int local183 = local87 + local159 * (local77.anInt515 + 32);
									if (local157 < 20) {
										local174 += local77.anIntArray104[local157];
										local183 += local77.anIntArray103[local157];
									}
									if (local77.anIntArray101[local157] > 0) {
										local207 = 0;
										local209 = 0;
										local216 = local77.anIntArray101[local157] - 1;
										if (local174 > Class2_Sub1_Sub1.anInt285 - 32 && local174 < Class2_Sub1_Sub1.anInt286 && local183 > Class2_Sub1_Sub1.anInt283 - 32 && local183 < Class2_Sub1_Sub1.anInt284 || this.anInt935 != 0 && this.anInt934 == local157) {
											local241 = 0;
											if (this.anInt955 == 1 && this.anInt956 == local157 && this.anInt957 == local77.anInt491) {
												local241 = 16777215;
											}
											@Pc(265) Class2_Sub1_Sub1_Sub2 local265 = Class32.method409(local77.anIntArray106[local157], local216, local241);
											if (local265 != null) {
												@Pc(344) int local344;
												if (this.anInt935 != 0 && this.anInt934 == local157 && this.anInt933 == local77.anInt491) {
													local207 = super.anInt838 - this.anInt936;
													local209 = super.anInt839 - this.anInt937;
													if (local207 < 5 && local207 > -5) {
														local207 = 0;
													}
													if (local209 < 5 && local209 > -5) {
														local209 = 0;
													}
													if (this.anInt880 < 5) {
														local207 = 0;
														local209 = 0;
													}
													local265.method71(local183 + local209, local174 + local207);
													if (local183 + local209 < Class2_Sub1_Sub1.anInt283 && arg2.anInt500 > 0) {
														local344 = this.anInt885 * (Class2_Sub1_Sub1.anInt283 - local183 - local209) / 3;
														if (local344 > this.anInt885 * 10) {
															local344 = this.anInt885 * 10;
														}
														if (local344 > arg2.anInt500) {
															local344 = arg2.anInt500;
														}
														arg2.anInt500 -= local344;
														this.anInt937 += local344;
													}
													if (local183 + local209 + 32 > Class2_Sub1_Sub1.anInt284 && arg2.anInt500 < arg2.anInt495 - arg2.anInt504) {
														local344 = this.anInt885 * (local183 + local209 + 32 - Class2_Sub1_Sub1.anInt284) / 3;
														if (local344 > this.anInt885 * 10) {
															local344 = this.anInt885 * 10;
														}
														if (local344 > arg2.anInt495 - arg2.anInt504 - arg2.anInt500) {
															local344 = arg2.anInt495 - arg2.anInt504 - arg2.anInt500;
														}
														arg2.anInt500 += local344;
														this.anInt937 -= local344;
													}
												} else if (this.anInt864 != 0 && this.anInt863 == local157 && this.anInt862 == local77.anInt491) {
													local265.method71(local183, local174);
												} else {
													local265.method69(local183, local174);
												}
												if (local265.anInt65 == 33 || local77.anIntArray106[local157] != 1) {
													local344 = local77.anIntArray106[local157];
													this.aClass2_Sub1_Sub1_Sub1_2.method39(local174 + local207 + 1, method607(local344), local183 + local209 + 10, 0);
													this.aClass2_Sub1_Sub1_Sub1_2.method39(local174 + local207, method607(local344), local183 + local209 + 9, 16776960);
												}
											}
										}
									} else if (local77.aClass2_Sub1_Sub1_Sub2Array2 != null && local157 < 20) {
										@Pc(533) Class2_Sub1_Sub1_Sub2 local533 = local77.aClass2_Sub1_Sub1_Sub2Array2[local157];
										if (local533 != null) {
											local533.method69(local183, local174);
										}
									}
									local157++;
								}
							}
						} else if (local77.anInt503 == 3) {
							@Pc(559) boolean local559 = false;
							if (this.anInt1029 == local77.anInt491 || this.anInt987 == local77.anInt491 || this.anInt897 == local77.anInt491) {
								local559 = true;
							}
							if (this.method604(local77)) {
								local157 = local77.anInt513;
								if (local559 && local77.anInt512 != 0) {
									local157 = local77.anInt512;
								}
							} else {
								local157 = local77.anInt521;
								if (local559 && local77.anInt505 != 0) {
									local157 = local77.anInt505;
								}
							}
							if (local77.aByte39 == 0) {
								if (local77.aBoolean142) {
									Class2_Sub1_Sub1.method278(this.aByte62, local77.anInt514, local87, local82, local77.anInt504, local157);
								} else {
									Class2_Sub1_Sub1.method279(local77.anInt514, local77.anInt504, local87, local157, local82);
								}
							} else if (local77.aBoolean142) {
								Class2_Sub1_Sub1.method277(local77.anInt504, local77.anInt514, local82, 256 - (local77.aByte39 & 0xFF), local87, local157);
							} else {
								Class2_Sub1_Sub1.method280(local82, local87, 256 - (local77.aByte39 & 0xFF), local157, local77.anInt514, local77.anInt504);
							}
						} else {
							@Pc(678) Class2_Sub1_Sub1_Sub1 local678;
							@Pc(955) String local955;
							if (local77.anInt503 == 4) {
								local678 = local77.aClass2_Sub1_Sub1_Sub1_1;
								@Pc(681) String local681 = local77.aString6;
								@Pc(683) boolean local683 = false;
								if (this.anInt1029 == local77.anInt491 || this.anInt987 == local77.anInt491 || this.anInt897 == local77.anInt491) {
									local683 = true;
								}
								if (this.method604(local77)) {
									local159 = local77.anInt513;
									if (local683 && local77.anInt512 != 0) {
										local159 = local77.anInt512;
									}
									if (local77.aString7.length() > 0) {
										local681 = local77.aString7;
									}
								} else {
									local159 = local77.anInt521;
									if (local683 && local77.anInt505 != 0) {
										local159 = local77.anInt505;
									}
								}
								if (local77.anInt517 == 6 && this.aBoolean231) {
									local681 = "Please wait...";
									local159 = local77.anInt521;
								}
								if (Class2_Sub1_Sub1.anInt281 == 479) {
									if (local159 == 16776960) {
										local159 = 255;
									}
									if (local159 == 49152) {
										local159 = 16777215;
									}
								}
								local207 = local87 + local678.anInt38;
								while (local681.length() > 0) {
									if (local681.indexOf("%") != -1) {
										label390: while (true) {
											local209 = local681.indexOf("%1");
											if (local209 == -1) {
												while (true) {
													local209 = local681.indexOf("%2");
													if (local209 == -1) {
														while (true) {
															local209 = local681.indexOf("%3");
															if (local209 == -1) {
																while (true) {
																	local209 = local681.indexOf("%4");
																	if (local209 == -1) {
																		while (true) {
																			local209 = local681.indexOf("%5");
																			if (local209 == -1) {
																				break label390;
																			}
																			local681 = local681.substring(0, local209) + this.method684(this.method692(4, local77)) + local681.substring(local209 + 2);
																		}
																	}
																	local681 = local681.substring(0, local209) + this.method684(this.method692(3, local77)) + local681.substring(local209 + 2);
																}
															}
															local681 = local681.substring(0, local209) + this.method684(this.method692(2, local77)) + local681.substring(local209 + 2);
														}
													}
													local681 = local681.substring(0, local209) + this.method684(this.method692(1, local77)) + local681.substring(local209 + 2);
												}
											}
											local681 = local681.substring(0, local209) + this.method684(this.method692(0, local77)) + local681.substring(local209 + 2);
										}
									}
									local209 = local681.indexOf("\\n");
									if (local209 == -1) {
										local955 = local681;
										local681 = "";
									} else {
										local955 = local681.substring(0, local209);
										local681 = local681.substring(local209 + 2);
									}
									if (local77.aBoolean148) {
										local678.method36(local77.aBoolean147, local955, local207, local159, local82 + local77.anInt514 / 2);
									} else {
										local678.method43(local82, local77.aBoolean147, local207, local955, local159);
									}
									local207 += local678.anInt38;
								}
							} else if (local77.anInt503 == 5) {
								@Pc(1017) Class2_Sub1_Sub1_Sub2 local1017;
								if (this.method604(local77)) {
									local1017 = local77.aClass2_Sub1_Sub1_Sub2_1;
								} else {
									local1017 = local77.aClass2_Sub1_Sub1_Sub2_2;
								}
								if (local1017 != null) {
									local1017.method69(local87, local82);
								}
							} else if (local77.anInt503 == 6) {
								local157 = Class2_Sub1_Sub1_Sub3.anInt254;
								local159 = Class2_Sub1_Sub1_Sub3.anInt255;
								Class2_Sub1_Sub1_Sub3.anInt254 = local82 + local77.anInt514 / 2;
								Class2_Sub1_Sub1_Sub3.anInt255 = local87 + local77.anInt504 / 2;
								local163 = Class2_Sub1_Sub1_Sub3.anIntArray57[local77.anInt519] * local77.anInt518 >> 16;
								local174 = Class2_Sub1_Sub1_Sub3.anIntArray58[local77.anInt519] * local77.anInt518 >> 16;
								@Pc(1078) boolean local1078 = this.method604(local77);
								if (local1078) {
									local207 = local77.anInt498;
								} else {
									local207 = local77.anInt497;
								}
								@Pc(1098) Class2_Sub1_Sub3_Sub4 local1098;
								if (local207 == -1) {
									local1098 = local77.method399(local1078, -1, -1);
								} else {
									@Pc(1104) Class22 local1104 = Class22.aClass22Array1[local207];
									local1098 = local77.method399(local1078, local1104.anIntArray64[local77.anInt502], local1104.anIntArray65[local77.anInt502]);
								}
								if (local1098 != null) {
									local1098.method452(local77.anInt520, 0, local77.anInt519, 0, local163, local174);
								}
								Class2_Sub1_Sub1_Sub3.anInt254 = local157;
								Class2_Sub1_Sub1_Sub3.anInt255 = local159;
							} else {
								if (local77.anInt503 == 7) {
									local678 = local77.aClass2_Sub1_Sub1_Sub1_1;
									local159 = 0;
									for (local163 = 0; local163 < local77.anInt504; local163++) {
										for (local174 = 0; local174 < local77.anInt514; local174++) {
											if (local77.anIntArray101[local159] > 0) {
												@Pc(1168) Class32 local1168 = Class32.method412(local77.anIntArray101[local159] - 1);
												@Pc(1172) String local1172 = String.valueOf(local1168.aString11);
												if (local1168.aBoolean154 || local77.anIntArray106[local159] != 1) {
													local1172 = local1172 + " x" + method701(local77.anIntArray106[local159], (byte) 9);
												}
												local209 = local82 + local174 * (local77.anInt483 + 115);
												local216 = local87 + local163 * (local77.anInt515 + 12);
												if (local77.aBoolean148) {
													local678.method36(local77.aBoolean147, local1172, local216, local77.anInt521, local209 + local77.anInt514 / 2);
												} else {
													local678.method43(local209, local77.aBoolean147, local216, local1172, local77.anInt521);
												}
											}
											local159++;
										}
									}
								}
								if (local77.anInt503 == 8 && (this.anInt1032 == local77.anInt491 || this.anInt996 == local77.anInt491 || this.anInt1067 == local77.anInt491) && this.anInt904 == 100) {
									local157 = 0;
									local159 = 0;
									@Pc(1286) Class2_Sub1_Sub1_Sub1 local1286 = this.aClass2_Sub1_Sub1_Sub1_3;
									@Pc(1289) String local1289 = local77.aString6;
									while (local1289.length() > 0) {
										local207 = local1289.indexOf("\\n");
										if (local207 == -1) {
											local955 = local1289;
											local1289 = "";
										} else {
											local955 = local1289.substring(0, local207);
											local1289 = local1289.substring(local207 + 2);
										}
										local209 = local1286.method37(local955);
										if (local209 > local157) {
											local157 = local209;
										}
										local159 += local1286.anInt38 + 1;
									}
									local157 += 6;
									local159 += 7;
									local207 = local82 + local77.anInt514 - local157 - 5;
									local209 = local87 + local77.anInt504 + 5;
									if (local207 < local82 + 5) {
										local207 = local82 + 5;
									}
									if (local207 + local157 > arg0 + arg2.anInt514) {
										local207 = arg0 + arg2.anInt514 - local157;
									}
									if (local209 + local159 > arg3 + arg2.anInt504) {
										local209 = arg3 + arg2.anInt504 - local159;
									}
									Class2_Sub1_Sub1.method278(this.aByte62, local157, local209, local207, local159, 16777120);
									Class2_Sub1_Sub1.method279(local157, local159, local209, 0, local207);
									local1289 = local77.aString6;
									local216 = local209 + local1286.anInt38 + 2;
									while (local1289.length() > 0) {
										local241 = local1289.indexOf("\\n");
										if (local241 == -1) {
											local955 = local1289;
											local1289 = "";
										} else {
											local955 = local1289.substring(0, local241);
											local1289 = local1289.substring(local241 + 2);
										}
										local1286.method43(local207 + 3, false, local216, local955, 0);
										local216 += local1286.anInt38 + 1;
									}
								}
							}
						}
					}
				}
				Class2_Sub1_Sub1.method275(local29, local31, local35, local33);
			}
		} catch (@Pc(1484) RuntimeException local1484) {
			signlink.reporterror("15060, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 7 + ", " + arg3 + ", " + local1484.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "g", descriptor = "(B)V")
	private void method629() {
		try {
			try {
				if (this.aClass28_1 != null) {
					this.aClass28_1.method317();
				}
			} catch (@Pc(7) Exception local7) {
			}
			this.aClass28_1 = null;
			this.aBoolean248 = false;
			this.anInt1026 = 0;
			this.aString26 = "";
			this.aString27 = "";
			this.method710();
			this.aClass29_1.method324();
			for (@Pc(35) int local35 = 0; local35 < 4; local35++) {
				this.aClass12Array1[local35].method185();
			}
			System.gc();
			this.method608(this.aByte59);
			this.anInt892 = -1;
			this.anInt854 = -1;
			this.anInt1051 = 0;
		} catch (@Pc(62) RuntimeException local62) {
			signlink.reporterror("18034, " + -84 + ", " + local62.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;I)V")
	private void method630(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2) {
		try {
			if (arg2 >= 0) {
				this.aBoolean250 = !this.aBoolean250;
			}
			@Pc(22) int local22;
			if (this.aClass20_17 != null) {
				this.aClass20_17.method230(this.anInt1025);
				Class2_Sub1_Sub1_Sub3.anIntArray59 = this.anIntArray231;
				local22 = 151;
				if (arg1 != null) {
					local22 -= 7;
				}
				this.aClass2_Sub1_Sub1_Sub1_3.method35(0, local22, arg0, 257);
				this.aClass2_Sub1_Sub1_Sub1_3.method35(16777215, local22 - 1, arg0, 256);
				local22 += 15;
				if (arg1 != null) {
					this.aClass2_Sub1_Sub1_Sub1_3.method35(0, local22, arg1, 257);
					this.aClass2_Sub1_Sub1_Sub1_3.method35(16777215, local22 - 1, arg1, 256);
				}
				this.aClass20_17.method231(4, super.aGraphics2, 4);
			} else if (super.aClass20_2 != null) {
				super.aClass20_2.method230(this.anInt1025);
				Class2_Sub1_Sub1_Sub3.anIntArray59 = this.anIntArray232;
				local22 = 251;
				Class2_Sub1_Sub1.method278(this.aByte62, 300, 221, 233, 50, 0);
				Class2_Sub1_Sub1.method279(300, 50, 221, 16777215, 233);
				if (arg1 != null) {
					local22 -= 7;
				}
				this.aClass2_Sub1_Sub1_Sub1_3.method35(0, local22, arg0, 383);
				this.aClass2_Sub1_Sub1_Sub1_3.method35(16777215, local22 - 1, arg0, 382);
				local22 += 15;
				if (arg1 != null) {
					this.aClass2_Sub1_Sub1_Sub1_3.method35(0, local22, arg1, 383);
					this.aClass2_Sub1_Sub1_Sub1_3.method35(16777215, local22 - 1, arg1, 382);
				}
				super.aClass20_2.method231(0, super.aGraphics2, 0);
			}
		} catch (@Pc(177) RuntimeException local177) {
			signlink.reporterror("45361, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local177.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(III)Z")
	private boolean method631(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(3) boolean local3 = false;
			this.anInt972 += 0;
			@Pc(12) Class31 local12 = Class31.method403(arg1);
			for (@Pc(14) int local14 = 0; local14 < local12.anIntArray100.length && local12.anIntArray100[local14] != -1; local14++) {
				@Pc(28) Class31 local28 = Class31.method403(local12.anIntArray100[local14]);
				if (local28.anInt503 == 0) {
					local3 |= this.method631(arg0, local28.anInt491);
				}
				@Pc(62) int local62;
				if (local28.anInt503 == 6 && (local28.anInt497 != -1 || local28.anInt498 != -1)) {
					@Pc(57) boolean local57 = this.method604(local28);
					if (local57) {
						local62 = local28.anInt498;
					} else {
						local62 = local28.anInt497;
					}
					if (local62 != -1) {
						@Pc(74) Class22 local74 = Class22.aClass22Array1[local62];
						local28.anInt492 += arg0;
						while (local28.anInt492 > local74.method265(local28.anInt502, this.anInt985)) {
							local28.anInt492 -= local74.method265(local28.anInt502, this.anInt985);
							local28.anInt502++;
							if (local28.anInt502 >= local74.anInt262) {
								local28.anInt502 -= local74.anInt263;
								if (local28.anInt502 < 0 || local28.anInt502 >= local74.anInt262) {
									local28.anInt502 = 0;
								}
							}
							local3 = true;
						}
					}
				}
				if (local28.anInt503 == 6 && local28.anInt496 != 0) {
					@Pc(145) int local145 = local28.anInt496 >> 16;
					local62 = local28.anInt496 << 16 >> 16;
					@Pc(156) int local156 = local145 * arg0;
					local62 *= arg0;
					local28.anInt519 = local28.anInt519 + local156 & 0x7FF;
					local28.anInt520 = local28.anInt520 + local62 & 0x7FF;
					local3 = true;
				}
			}
			return local3;
		} catch (@Pc(187) RuntimeException local187) {
			signlink.reporterror("48305, " + arg0 + ", " + arg1 + ", " + 0 + ", " + local187.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(IZ)Z")
	private boolean method632(@OriginalArg(0) int arg0) {
		try {
			this.aBoolean248 &= true;
			if (arg0 < 0) {
				return false;
			}
			@Pc(14) int local14 = this.anIntArray222[arg0];
			if (local14 >= 2000) {
				local14 -= 2000;
			}
			return local14 == 702;
		} catch (@Pc(26) RuntimeException local26) {
			signlink.reporterror("32842, " + arg0 + ", " + true + ", " + local26.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "o", descriptor = "(I)V")
	private void method633() {
		try {
			if (this.anInt935 == 0) {
				this.aStringArray8[0] = "Cancel";
				this.anIntArray222[0] = 1122;
				this.anInt1004 = 1;
				if (this.anInt1008 == -1) {
					this.method687();
					this.anInt967 = 0;
					this.anInt851 = 0;
					if (super.anInt838 > 4 && super.anInt839 > 4 && super.anInt838 < 516 && super.anInt839 < 338) {
						if (this.anInt903 == -1) {
							this.method657();
						} else {
							this.method623(super.anInt839, 4, Class31.method403(this.anInt903), 0, 4, 0, super.anInt838);
						}
					}
					if (this.anInt967 != this.anInt897) {
						this.anInt897 = this.anInt967;
					}
					if (this.anInt851 != this.anInt1067) {
						this.anInt1067 = this.anInt851;
					}
					this.anInt967 = 0;
					this.anInt851 = 0;
					if (super.anInt838 > 553 && super.anInt839 > 205 && super.anInt838 < 743 && super.anInt839 < 466) {
						if (this.anInt982 != -1) {
							this.method623(super.anInt839, 205, Class31.method403(this.anInt982), 0, 553, 1, super.anInt838);
						} else if (this.anIntArray257[this.anInt1064] != -1) {
							this.method623(super.anInt839, 205, Class31.method403(this.anIntArray257[this.anInt1064]), 0, 553, 1, super.anInt838);
						}
					}
					if (this.anInt967 != this.anInt987) {
						this.aBoolean233 = true;
						this.anInt987 = this.anInt967;
					}
					if (this.anInt851 != this.anInt996) {
						this.aBoolean233 = true;
						this.anInt996 = this.anInt851;
					}
					this.anInt967 = 0;
					this.anInt851 = 0;
					if (super.anInt838 > 17 && super.anInt839 > 357 && super.anInt838 < 496 && super.anInt839 < 453) {
						if (this.anInt871 != -1) {
							this.method623(super.anInt839, 357, Class31.method403(this.anInt871), 0, 17, 2, super.anInt838);
						} else if (this.anInt928 != -1) {
							this.method623(super.anInt839, 357, Class31.method403(this.anInt928), 0, 17, 3, super.anInt838);
						} else if (super.anInt839 < 434 && super.anInt838 < 426 && this.anInt912 == 0) {
							this.method713(super.anInt838 - 17, super.anInt839 - 357);
						}
					}
					if ((this.anInt871 != -1 || this.anInt928 != -1) && this.anInt967 != this.anInt1029) {
						this.aBoolean241 = true;
						this.anInt1029 = this.anInt967;
					}
					if ((this.anInt871 != -1 || this.anInt928 != -1) && this.anInt851 != this.anInt1032) {
						this.aBoolean241 = true;
						this.anInt1032 = this.anInt851;
					}
					@Pc(350) boolean local350 = false;
					while (!local350) {
						local350 = true;
						for (@Pc(356) int local356 = 0; local356 < this.anInt1004 - 1; local356++) {
							if (this.anIntArray222[local356] < 1000 && this.anIntArray222[local356 + 1] > 1000) {
								@Pc(377) String local377 = this.aStringArray8[local356];
								this.aStringArray8[local356] = this.aStringArray8[local356 + 1];
								this.aStringArray8[local356 + 1] = local377;
								@Pc(399) int local399 = this.anIntArray222[local356];
								this.anIntArray222[local356] = this.anIntArray222[local356 + 1];
								this.anIntArray222[local356 + 1] = local399;
								@Pc(421) int local421 = this.anIntArray220[local356];
								this.anIntArray220[local356] = this.anIntArray220[local356 + 1];
								this.anIntArray220[local356 + 1] = local421;
								@Pc(443) int local443 = this.anIntArray221[local356];
								this.anIntArray221[local356] = this.anIntArray221[local356 + 1];
								this.anIntArray221[local356 + 1] = local443;
								@Pc(465) int local465 = this.anIntArray223[local356];
								this.anIntArray223[local356] = this.anIntArray223[local356 + 1];
								this.anIntArray223[local356 + 1] = local465;
								local350 = false;
							}
						}
					}
				} else {
					this.anInt967 = 0;
					this.anInt851 = 0;
					this.method623(super.anInt839, 0, Class31.method403(this.anInt1008), 0, 0, 0, super.anInt838);
					if (this.anInt967 != this.anInt897) {
						this.anInt897 = this.anInt967;
					}
					if (this.anInt851 != this.anInt1067) {
						this.anInt1067 = this.anInt851;
					}
				}
			}
		} catch (@Pc(495) RuntimeException local495) {
			signlink.reporterror("77396, " + 616 + ", " + local495.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(II)V")
	private void method634(@OriginalArg(0) int arg0) {
		try {
			@Pc(9) int local9 = Class1.aClass1Array1[arg0].anInt5;
			if (local9 != 0) {
				@Pc(17) int local17 = this.anIntArray225[arg0];
				if (local9 == 1) {
					if (local17 == 1) {
						Class2_Sub1_Sub1_Sub3.method256(0.9D);
					}
					if (local17 == 2) {
						Class2_Sub1_Sub1_Sub3.method256(0.8D);
					}
					if (local17 == 3) {
						Class2_Sub1_Sub1_Sub3.method256(0.7D);
					}
					if (local17 == 4) {
						Class2_Sub1_Sub1_Sub3.method256(0.6D);
					}
					Class32.aClass5_6.method79();
					this.aBoolean228 = true;
				}
				if (local9 == 3) {
					@Pc(55) boolean local55 = this.aBoolean242;
					if (local17 == 0) {
						this.method696(0, this.aBoolean242);
						this.aBoolean242 = true;
					}
					if (local17 == 1) {
						this.method696(-400, this.aBoolean242);
						this.aBoolean242 = true;
					}
					if (local17 == 2) {
						this.method696(-800, this.aBoolean242);
						this.aBoolean242 = true;
					}
					if (local17 == 3) {
						this.method696(-1200, this.aBoolean242);
						this.aBoolean242 = true;
					}
					if (local17 == 4) {
						this.aBoolean242 = false;
					}
					if (this.aBoolean242 != local55 && !aBoolean272) {
						if (this.aBoolean242) {
							this.anInt854 = this.anInt892;
							this.aBoolean230 = true;
							this.aClass9_Sub1_1.method526(2, this.anInt854);
						} else {
							this.method608(this.aByte59);
						}
						this.anInt1051 = 0;
					}
				}
				if (local9 == 4) {
					if (local17 == 0) {
						this.aBoolean246 = true;
						this.method658(0);
					}
					if (local17 == 1) {
						this.aBoolean246 = true;
						this.method658(-400);
					}
					if (local17 == 2) {
						this.aBoolean246 = true;
						this.method658(-800);
					}
					if (local17 == 3) {
						this.aBoolean246 = true;
						this.method658(-1200);
					}
					if (local17 == 4) {
						this.aBoolean246 = false;
					}
				}
				if (local9 == 5) {
					this.anInt867 = local17;
				}
				if (local9 == 6) {
					this.anInt891 = local17;
				}
				if (local9 == 8) {
					this.anInt986 = local17;
					this.aBoolean241 = true;
				}
				if (local9 == 9) {
					this.anInt1058 = local17;
				}
			}
		} catch (@Pc(216) RuntimeException local216) {
			signlink.reporterror("60244, " + arg0 + ", " + 0 + ", " + local216.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "run", descriptor = "()V")
	@Override
	public void run() {
		if (this.aBoolean227) {
			this.method606();
		} else {
			super.run();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!BSNPYLEV;BI)V")
	private void method635(@OriginalArg(0) Class2_Sub1_Sub2 arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) int arg2) {
		try {
			@Pc(6) boolean local6 = false;
			@Pc(18) int local18;
			@Pc(27) int local27;
			@Pc(34) int local34;
			@Pc(42) int local42;
			@Pc(46) int local46;
			@Pc(50) int local50;
			@Pc(54) int local54;
			@Pc(58) int local58;
			@Pc(63) int local63;
			@Pc(75) int local75;
			if (arg2 == 25) {
				local18 = arg0.method113();
				local27 = this.anInt1054 + (local18 >> 4 & 0x7);
				local34 = this.anInt1055 + (local18 & 0x7);
				@Pc(38) byte local38 = arg0.method116();
				local42 = arg0.method121();
				local46 = arg0.method122();
				local50 = arg0.method114();
				local54 = local50 >> 2;
				local58 = local50 & 0x3;
				local63 = this.anIntArray214[local54];
				@Pc(67) byte local67 = arg0.method115();
				@Pc(71) byte local71 = arg0.method115();
				local75 = arg0.method120();
				@Pc(79) byte local79 = arg0.method115();
				@Pc(82) int local82 = arg0.method96();
				@Pc(88) Class2_Sub1_Sub3_Sub1_Sub1 local88;
				if (local82 == this.anInt930) {
					local88 = aClass2_Sub1_Sub3_Sub1_Sub1_1;
				} else {
					local88 = this.aClass2_Sub1_Sub3_Sub1_Sub1Array1[local82];
				}
				if (local88 != null) {
					@Pc(100) Class33 local100 = Class33.method459(local75);
					@Pc(110) int local110 = this.anIntArrayArrayArray8[this.anInt882][local27][local34];
					@Pc(122) int local122 = this.anIntArrayArrayArray8[this.anInt882][local27 + 1][local34];
					@Pc(136) int local136 = this.anIntArrayArrayArray8[this.anInt882][local27 + 1][local34 + 1];
					@Pc(148) int local148 = this.anIntArrayArrayArray8[this.anInt882][local27][local34 + 1];
					@Pc(158) Class2_Sub1_Sub3_Sub4 local158 = local100.method457(local54, local58, local110, local122, local136, local148, -1);
					if (local158 != null) {
						this.method727(0, local63, -1, this.anInt882, local34, local42 + 1, local46 + 1, local27, 0);
						local88.anInt363 = local42 + anInt970;
						local88.anInt364 = local46 + anInt970;
						local88.aClass2_Sub1_Sub3_Sub4_1 = local158;
						@Pc(193) int local193 = local100.anInt609;
						@Pc(196) int local196 = local100.anInt617;
						if (local58 == 1 || local58 == 3) {
							local193 = local100.anInt617;
							local196 = local100.anInt609;
						}
						local88.anInt365 = local27 * 128 + local193 * 64;
						local88.anInt367 = local34 * 128 + local196 * 64;
						local88.anInt366 = this.method622(local88.anInt367, this.anInt882, local88.anInt365);
						@Pc(242) byte local242;
						if (local79 > local71) {
							local242 = local79;
							local79 = local71;
							local71 = local242;
						}
						if (local38 > local67) {
							local242 = local38;
							local38 = local67;
							local67 = local242;
						}
						local88.anInt357 = local27 + local79;
						local88.anInt359 = local27 + local71;
						local88.anInt358 = local34 + local38;
						local88.anInt360 = local34 + local67;
					}
				}
			}
			@Pc(302) int local302;
			@Pc(320) Class2_Sub1_Sub3_Sub2 local320;
			if (arg2 == 174) {
				local18 = arg0.method113();
				local27 = this.anInt1054 + (local18 >> 4 & 0x7);
				local34 = this.anInt1055 + (local18 & 0x7);
				local302 = arg0.method121();
				local42 = arg0.method122();
				if (local27 >= 0 && local34 >= 0 && local27 < 104 && local34 < 104) {
					local320 = new Class2_Sub1_Sub3_Sub2();
					local320.anInt276 = local42;
					local320.anInt275 = local302;
					if (this.aClass13ArrayArrayArray1[this.anInt882][local27][local34] == null) {
						this.aClass13ArrayArrayArray1[this.anInt882][local27][local34] = new Class13(true);
					}
					this.aClass13ArrayArrayArray1[this.anInt882][local27][local34].method197(local320);
					this.method599(local27, local34);
				}
			} else if (arg2 == 152) {
				local18 = arg0.method94();
				local27 = this.anInt1054 + (local18 >> 4 & 0x7);
				local34 = this.anInt1055 + (local18 & 0x7);
				local302 = arg0.method96();
				local42 = arg0.method96();
				local46 = arg0.method96();
				if (local27 >= 0 && local34 >= 0 && local27 < 104 && local34 < 104) {
					@Pc(416) Class13 local416 = this.aClass13ArrayArrayArray1[this.anInt882][local27][local34];
					if (local416 != null) {
						for (@Pc(422) Class2_Sub1_Sub3_Sub2 local422 = (Class2_Sub1_Sub3_Sub2) local416.method200(); local422 != null; local422 = (Class2_Sub1_Sub3_Sub2) local416.method202()) {
							if (local422.anInt276 == (local302 & 0x7FFF) && local422.anInt275 == local42) {
								local422.anInt275 = local46;
								break;
							}
						}
						this.method599(local27, local34);
					}
				}
			} else {
				if (arg2 == 183) {
					local18 = arg0.method94();
					local27 = this.anInt1054 + (local18 >> 4 & 0x7);
					local34 = this.anInt1055 + (local18 & 0x7);
					local302 = arg0.method96();
					local42 = arg0.method94();
					local46 = local42 >> 4 & 0xF;
					local50 = local42 & 0x7;
					if (aClass2_Sub1_Sub3_Sub1_Sub1_1.anIntArray165[0] >= local27 - local46 && aClass2_Sub1_Sub3_Sub1_Sub1_1.anIntArray165[0] <= local27 + local46 && aClass2_Sub1_Sub3_Sub1_Sub1_1.anIntArray166[0] >= local34 - local46 && aClass2_Sub1_Sub3_Sub1_Sub1_1.anIntArray166[0] <= local34 + local46 && this.aBoolean246 && !aBoolean272 && this.anInt938 < 50) {
						this.anIntArray247[this.anInt938] = local302;
						this.anIntArray265[this.anInt938] = local50;
						this.anIntArray233[this.anInt938] = Class8.anIntArray33[local302];
						this.anInt938++;
					}
				}
				if (arg2 == 128) {
					local18 = arg0.method113();
					local27 = local18 >> 2;
					local34 = local18 & 0x3;
					local302 = this.anIntArray214[local27];
					local42 = arg0.method94();
					local46 = this.anInt1054 + (local42 >> 4 & 0x7);
					local50 = this.anInt1055 + (local42 & 0x7);
					if (local46 >= 0 && local50 >= 0 && local46 < 104 && local50 < 104) {
						this.method727(local34, local302, -1, this.anInt882, local50, 0, -1, local46, local27);
					}
				} else if (arg2 == 143) {
					local18 = arg0.method94();
					local27 = this.anInt1054 + (local18 >> 4 & 0x7);
					local34 = this.anInt1055 + (local18 & 0x7);
					local302 = arg0.method96();
					local42 = arg0.method94();
					local46 = arg0.method96();
					if (local27 >= 0 && local34 >= 0 && local27 < 104 && local34 < 104) {
						local27 = local27 * 128 + 64;
						local34 = local34 * 128 + 64;
						@Pc(693) Class2_Sub1_Sub3_Sub5 local693 = new Class2_Sub1_Sub3_Sub5(anInt970, local27, local46, local34, this.method622(local34, this.anInt882, local27) - local42, this.anInt882, -542, local302);
						this.aClass13_10.method197(local693);
					}
				} else if (arg2 == 168) {
					local18 = arg0.method122();
					local27 = arg0.method94();
					local34 = local27 >> 2;
					local302 = local27 & 0x3;
					local42 = this.anIntArray214[local34];
					local46 = arg0.method94();
					local50 = this.anInt1054 + (local46 >> 4 & 0x7);
					local54 = this.anInt1055 + (local46 & 0x7);
					if (local50 >= 0 && local54 >= 0 && local50 < 104 && local54 < 104) {
						this.method727(local302, local42, local18, this.anInt882, local54, 0, -1, local50, local34);
					}
				} else if (arg2 == 201) {
					local18 = arg0.method122();
					local27 = arg0.method113();
					local34 = this.anInt1054 + (local27 >> 4 & 0x7);
					local302 = this.anInt1055 + (local27 & 0x7);
					if (local34 >= 0 && local302 >= 0 && local34 < 104 && local302 < 104) {
						@Pc(811) Class13 local811 = this.aClass13ArrayArrayArray1[this.anInt882][local34][local302];
						if (local811 != null) {
							for (local320 = (Class2_Sub1_Sub3_Sub2) local811.method200(); local320 != null; local320 = (Class2_Sub1_Sub3_Sub2) local811.method202()) {
								if (local320.anInt276 == (local18 & 0x7FFF)) {
									local320.method530();
									break;
								}
							}
							if (local811.method200() == null) {
								this.aClass13ArrayArrayArray1[this.anInt882][local34][local302] = null;
							}
							this.method599(local34, local302);
						}
					}
				} else if (arg2 == 1) {
					local18 = arg0.method113();
					local27 = this.anInt1054 + (local18 >> 4 & 0x7);
					local34 = this.anInt1055 + (local18 & 0x7);
					local302 = arg0.method121();
					local42 = arg0.method120();
					local46 = arg0.method121();
					if (local27 >= 0 && local34 >= 0 && local27 < 104 && local34 < 104 && local46 != this.anInt930) {
						@Pc(907) Class2_Sub1_Sub3_Sub2 local907 = new Class2_Sub1_Sub3_Sub2();
						local907.anInt276 = local302;
						local907.anInt275 = local42;
						if (this.aClass13ArrayArrayArray1[this.anInt882][local27][local34] == null) {
							this.aClass13ArrayArrayArray1[this.anInt882][local27][local34] = new Class13(true);
						}
						this.aClass13ArrayArrayArray1[this.anInt882][local27][local34].method197(local907);
						this.method599(local27, local34);
					}
				} else {
					@Pc(1042) int local1042;
					@Pc(1054) int local1054;
					if (arg2 == 39) {
						local18 = arg0.method114();
						local27 = local18 >> 2;
						local34 = local18 & 0x3;
						local302 = this.anIntArray214[local27];
						local42 = arg0.method120();
						local46 = arg0.method113();
						local50 = this.anInt1054 + (local46 >> 4 & 0x7);
						local54 = this.anInt1055 + (local46 & 0x7);
						if (local50 >= 0 && local54 >= 0 && local50 < 103 && local54 < 103) {
							local58 = this.anIntArrayArrayArray8[this.anInt882][local50][local54];
							local63 = this.anIntArrayArrayArray8[this.anInt882][local50 + 1][local54];
							local1042 = this.anIntArrayArrayArray8[this.anInt882][local50 + 1][local54 + 1];
							local1054 = this.anIntArrayArrayArray8[this.anInt882][local50][local54 + 1];
							if (local302 == 0) {
								@Pc(1065) Class44 local1065 = this.aClass29_1.method346(local54, local50, this.anInt882);
								if (local1065 != null) {
									@Pc(1074) int local1074 = local1065.anInt790 >> 14 & 0x7FFF;
									if (local27 == 2) {
										local1065.aClass2_Sub1_Sub3_4 = new Class2_Sub1_Sub3_Sub6(local1042, local34 + 4, local1074, 2, local42, false, (byte) -21, local1054, local63, local58);
										local1065.aClass2_Sub1_Sub3_5 = new Class2_Sub1_Sub3_Sub6(local1042, local34 + 1 & 0x3, local1074, 2, local42, false, (byte) -21, local1054, local63, local58);
									} else {
										local1065.aClass2_Sub1_Sub3_4 = new Class2_Sub1_Sub3_Sub6(local1042, local34, local1074, local27, local42, false, (byte) -21, local1054, local63, local58);
									}
								}
							}
							if (local302 == 1) {
								@Pc(1142) Class24 local1142 = this.aClass29_1.method347(local54, this.anInt882, local50);
								if (local1142 != null) {
									local1142.aClass2_Sub1_Sub3_3 = new Class2_Sub1_Sub3_Sub6(local1042, 0, local1142.anInt373 >> 14 & 0x7FFF, 4, local42, false, (byte) -21, local1054, local63, local58);
								}
							}
							if (local302 == 2) {
								@Pc(1176) Class17 local1176 = this.aClass29_1.method348(local50, local54, this.anInt882);
								if (local27 == 11) {
									local27 = 10;
								}
								if (local1176 != null) {
									local1176.aClass2_Sub1_Sub3_2 = new Class2_Sub1_Sub3_Sub6(local1042, local34, local1176.anInt200 >> 14 & 0x7FFF, local27, local42, false, (byte) -21, local1054, local63, local58);
								}
							}
							if (local302 == 3) {
								@Pc(1215) Class15 local1215 = this.aClass29_1.method349(local54, local50, this.anInt882);
								if (local1215 != null) {
									local1215.aClass2_Sub1_Sub3_1 = new Class2_Sub1_Sub3_Sub6(local1042, local34, local1215.anInt176 >> 14 & 0x7FFF, 22, local42, false, (byte) -21, local1054, local63, local58);
								}
							}
						}
					} else if (arg2 == 99) {
						local18 = arg0.method94();
						local27 = this.anInt1054 + (local18 >> 4 & 0x7);
						local34 = this.anInt1055 + (local18 & 0x7);
						local302 = local27 + arg0.method95();
						local42 = local34 + arg0.method95();
						local46 = arg0.method97();
						local50 = arg0.method96();
						local54 = arg0.method94() * 4;
						local58 = arg0.method94() * 4;
						local63 = arg0.method96();
						local1042 = arg0.method96();
						local1054 = arg0.method94();
						local75 = arg0.method94();
						if (local27 >= 0 && local34 >= 0 && local27 < 104 && local34 < 104 && local302 >= 0 && local42 >= 0 && local302 < 104 && local42 < 104 && local50 != 65535) {
							local27 = local27 * 128 + 64;
							local34 = local34 * 128 + 64;
							local302 = local302 * 128 + 64;
							local42 = local42 * 128 + 64;
							@Pc(1375) Class2_Sub1_Sub3_Sub3 local1375 = new Class2_Sub1_Sub3_Sub3(local63 + anInt970, local50, local1054, local75, this.anInt882, local27, local58, this.method622(local34, this.anInt882, local27) - local54, local1042 + anInt970, local46, this.aByte63, local34);
							local1375.method421(this.method622(local42, this.anInt882, local302) - local58, local302, local42, local63 + anInt970);
							this.aClass13_12.method197(local1375);
						}
					}
				}
			}
		} catch (@Pc(1398) RuntimeException local1398) {
			signlink.reporterror("27370, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local1398.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "h", descriptor = "(B)V")
	private void method636() {
		try {
			this.aClass2_Sub1_Sub2_6.method83(224);
			if (this.anInt982 != -1) {
				this.method616(this.anInt982);
				this.anInt982 = -1;
				this.aBoolean233 = true;
				this.aBoolean231 = false;
				this.aBoolean244 = true;
			}
			if (this.anInt871 != -1) {
				this.method616(this.anInt871);
				this.anInt871 = -1;
				this.aBoolean241 = true;
				this.aBoolean231 = false;
			}
			if (this.anInt1008 != -1) {
				this.method616(this.anInt1008);
				this.anInt1008 = -1;
				this.aBoolean228 = true;
			}
			if (this.anInt1003 != -1) {
				this.method616(this.anInt1003);
				this.anInt1003 = -1;
			}
			if (this.anInt903 != -1) {
				this.method616(this.anInt903);
				this.anInt903 = -1;
			}
		} catch (@Pc(89) RuntimeException local89) {
			signlink.reporterror("60087, " + 4 + ", " + local89.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ZILclient!BSNPYLEV;)V")
	private void method637(@OriginalArg(1) int arg0, @OriginalArg(2) Class2_Sub1_Sub2 arg1) {
		try {
			arg1.method104();
			@Pc(7) int local7 = arg1.method105(1, 588);
			if (local7 != 0) {
				@Pc(20) int local20 = arg1.method105(2, 588);
				if (local20 == 0) {
					this.anIntArray246[this.anInt950++] = this.anInt948;
				} else {
					@Pc(43) int local43;
					@Pc(53) int local53;
					if (local20 == 1) {
						local43 = arg1.method105(3, 588);
						aClass2_Sub1_Sub3_Sub1_Sub1_1.method490(false, local43);
						local53 = arg1.method105(1, 588);
						if (local53 == 1) {
							this.anIntArray246[this.anInt950++] = this.anInt948;
						}
					} else {
						@Pc(97) int local97;
						if (local20 == 2) {
							local43 = arg1.method105(3, 588);
							aClass2_Sub1_Sub3_Sub1_Sub1_1.method490(true, local43);
							local53 = arg1.method105(3, 588);
							aClass2_Sub1_Sub3_Sub1_Sub1_1.method490(true, local53);
							local97 = arg1.method105(1, 588);
							if (local97 == 1) {
								this.anIntArray246[this.anInt950++] = this.anInt948;
							}
						} else if (local20 == 3) {
							local43 = arg1.method105(7, 588);
							this.anInt882 = arg1.method105(2, 588);
							local53 = arg1.method105(1, 588);
							local97 = arg1.method105(7, 588);
							@Pc(142) int local142 = arg1.method105(1, 588);
							if (local142 == 1) {
								this.anIntArray246[this.anInt950++] = this.anInt948;
							}
							aClass2_Sub1_Sub3_Sub1_Sub1_1.method494(593, local97, local43, local53 == 1);
						}
					}
				}
			}
		} catch (@Pc(170) RuntimeException local170) {
			signlink.reporterror("78005, " + false + ", " + arg0 + ", " + arg1 + ", " + local170.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "p", descriptor = "(I)Ljava/net/Socket;")
	public Socket method638(@OriginalArg(0) int arg0) throws IOException {
		return signlink.mainapp == null ? new Socket(InetAddress.getByName(this.getCodeBase().getHost()), arg0) : signlink.opensocket(arg0);
	}

	@OriginalMember(owner = "client!client", name = "i", descriptor = "(B)V")
	private void method639() {
		try {
			if (super.aClass20_2 == null) {
				this.method698();
				this.aClass20_3 = null;
				this.aClass20_4 = null;
				this.aClass20_5 = null;
				this.aClass20_6 = null;
				this.aClass20_7 = null;
				this.aClass20_8 = null;
				this.aClass20_9 = null;
				this.aClass20_10 = null;
				this.aClass20_11 = null;
				this.aClass20_18 = null;
				this.aClass20_16 = null;
				this.aClass20_15 = null;
				this.aClass20_17 = null;
				this.aClass20_12 = null;
				this.aClass20_13 = null;
				this.aClass20_14 = null;
				super.aClass20_2 = new Class20(765, 503, this.method586(), aBoolean269);
				this.aBoolean228 = true;
			}
		} catch (@Pc(74) RuntimeException local74) {
			signlink.reporterror("73436, " + 90 + ", " + local74.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "q", descriptor = "(I)V")
	private void method640() {
		try {
			this.method627();
			if (this.anInt992 == 1) {
				this.aClass2_Sub1_Sub1_Sub2Array10[this.anInt991 / 100].method69(this.anInt990 - 8 - 4, this.anInt989 - 8 - 4);
			}
			if (this.anInt992 == 2) {
				this.aClass2_Sub1_Sub1_Sub2Array10[this.anInt991 / 100 + 4].method69(this.anInt990 - 8 - 4, this.anInt989 - 8 - 4);
			}
			if (this.anInt870 != -1) {
				this.method631(this.anInt885, this.anInt870);
				this.method628(0, 0, Class31.method403(this.anInt870), 0);
			}
			if (this.anInt903 != -1) {
				this.method631(this.anInt885, this.anInt903);
				this.method628(0, 0, Class31.method403(this.anInt903), 0);
			}
			this.method669();
			if (!this.aBoolean262) {
				this.method633();
				this.method650();
			} else if (this.anInt1046 == 0) {
				this.method697(120);
			}
			if (this.anInt962 == 1) {
				this.aClass2_Sub1_Sub1_Sub2_3.method69(296, 472);
			}
			@Pc(174) int local174;
			if (aBoolean249) {
				@Pc(140) byte local140 = 20;
				@Pc(142) int local142 = 16776960;
				if (super.anInt833 < 30 && aBoolean272) {
					local142 = 16711680;
				}
				if (super.anInt833 < 20 && !aBoolean272) {
					local142 = 16711680;
				}
				this.aClass2_Sub1_Sub1_Sub1_3.method34("Fps:" + super.anInt833, local142, 20);
				local174 = local140 + 15;
				@Pc(176) Runtime local176 = Runtime.getRuntime();
				@Pc(185) int local185 = (int) ((local176.totalMemory() - local176.freeMemory()) / 1024L);
				if (local185 > 33554432 && aBoolean272) {
				}
				if (local185 > 67108864 && !aBoolean272) {
				}
				this.aClass2_Sub1_Sub1_Sub1_3.method34("Mem:" + local185 + "k", 16776960, 35);
				local174 += 15;
			}
			if (this.anInt1068 != 0) {
				@Pc(226) int local226 = this.anInt1068 / 50;
				local174 = local226 / 60;
				@Pc(234) int local234 = local226 % 60;
				if (local234 < 10) {
					this.aClass2_Sub1_Sub1_Sub1_3.method39(4, "System update in: " + local174 + ":0" + local234, 329, 16776960);
				} else {
					this.aClass2_Sub1_Sub1_Sub1_3.method39(4, "System update in: " + local174 + ":" + local234, 329, 16776960);
				}
				anInt1020++;
				if (anInt1020 > 68) {
					anInt1020 = 0;
					this.aClass2_Sub1_Sub2_6.method83(179);
					return;
				}
			}
		} catch (@Pc(291) RuntimeException local291) {
			signlink.reporterror("76125, " + -60 + ", " + local291.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(ILclient!QHGHUTGN;)Z")
	private boolean method641(@OriginalArg(1) Class31 arg0) {
		try {
			@Pc(15) int local15 = arg0.anInt499;
			if (this.anInt1014 == 2) {
				if (local15 == 201) {
					this.aBoolean241 = true;
					this.anInt912 = 0;
					this.aBoolean237 = true;
					this.aString31 = "";
					this.anInt902 = 1;
					this.aString30 = "Enter name of friend to add to list";
				}
				if (local15 == 202) {
					this.aBoolean241 = true;
					this.anInt912 = 0;
					this.aBoolean237 = true;
					this.aString31 = "";
					this.anInt902 = 2;
					this.aString30 = "Enter name of friend to delete from list";
				}
			}
			if (local15 == 205) {
				this.anInt976 = 250;
				return true;
			}
			if (local15 == 501) {
				this.aBoolean241 = true;
				this.anInt912 = 0;
				this.aBoolean237 = true;
				this.aString31 = "";
				this.anInt902 = 4;
				this.aString30 = "Enter name of player to add to list";
			}
			if (local15 == 502) {
				this.aBoolean241 = true;
				this.anInt912 = 0;
				this.aBoolean237 = true;
				this.aString31 = "";
				this.anInt902 = 5;
				this.aString30 = "Enter name of player to delete from list";
			}
			@Pc(123) int local123;
			@Pc(127) int local127;
			@Pc(132) int local132;
			if (local15 >= 300 && local15 <= 313) {
				local123 = (local15 - 300) / 2;
				local127 = local15 & 0x1;
				local132 = this.anIntArray212[local123];
				if (local132 != -1) {
					while (true) {
						if (local127 == 0) {
							local132--;
							if (local132 < 0) {
								local132 = Class14.anInt171 - 1;
							}
						}
						if (local127 == 1) {
							local132++;
							if (local132 >= Class14.anInt171) {
								local132 = 0;
							}
						}
						if (!Class14.aClass14Array1[local132].aBoolean76 && Class14.aClass14Array1[local132].anInt172 == local123 + (this.aBoolean256 ? 0 : 7)) {
							this.anIntArray212[local123] = local132;
							this.aBoolean240 = true;
							break;
						}
					}
				}
			}
			if (local15 >= 314 && local15 <= 323) {
				local123 = (local15 - 314) / 2;
				local127 = local15 & 0x1;
				local132 = this.anIntArray274[local123];
				if (local127 == 0) {
					local132--;
					if (local132 < 0) {
						local132 = anIntArrayArray23[local123].length - 1;
					}
				}
				if (local127 == 1) {
					local132++;
					if (local132 >= anIntArrayArray23[local123].length) {
						local132 = 0;
					}
				}
				this.anIntArray274[local123] = local132;
				this.aBoolean240 = true;
			}
			if (local15 == 324 && !this.aBoolean256) {
				this.aBoolean256 = true;
				this.method682();
			}
			if (local15 == 325 && this.aBoolean256) {
				this.aBoolean256 = false;
				this.method682();
			}
			if (local15 == 326) {
				this.aClass2_Sub1_Sub2_6.method83(66);
				this.aClass2_Sub1_Sub2_6.method84(this.aBoolean256 ? 0 : 1);
				for (local123 = 0; local123 < 7; local123++) {
					this.aClass2_Sub1_Sub2_6.method84(this.anIntArray212[local123]);
				}
				for (local127 = 0; local127 < 5; local127++) {
					this.aClass2_Sub1_Sub2_6.method84(this.anIntArray274[local127]);
				}
				return true;
			}
			if (local15 == 620) {
				this.aBoolean234 = !this.aBoolean234;
			}
			if (local15 >= 601 && local15 <= 613) {
				this.method636();
				if (this.aString19.length() > 0) {
					this.aClass2_Sub1_Sub2_6.method83(32);
					this.aClass2_Sub1_Sub2_6.method90(Class34.method478(this.aString19));
					this.aClass2_Sub1_Sub2_6.method84(local15 - 601);
					this.aClass2_Sub1_Sub2_6.method84(this.aBoolean234 ? 1 : 0);
				}
			}
			return false;
		} catch (@Pc(360) RuntimeException local360) {
			signlink.reporterror("25379, " + 5 + ", " + arg0 + ", " + local360.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/String;B)Z")
	private boolean method642(@OriginalArg(0) String arg0) {
		try {
			if (arg0 == null) {
				return false;
			}
			for (@Pc(11) int local11 = 0; local11 < this.anInt1013; local11++) {
				if (arg0.equalsIgnoreCase(this.aStringArray11[local11])) {
					return true;
				}
			}
			return arg0.equalsIgnoreCase(aClass2_Sub1_Sub3_Sub1_Sub1_1.aString5);
		} catch (@Pc(37) RuntimeException local37) {
			signlink.reporterror("2579, " + arg0 + ", " + 17 + ", " + local37.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(JI)V")
	private void method643(@OriginalArg(0) long arg0) {
		try {
			if (arg0 != 0L) {
				if (this.anInt1039 >= 100) {
					this.method724("", "Your ignore list is full. Max of 100 hit", 0);
				} else {
					@Pc(23) String local23 = Class34.method482(Class34.method479(arg0));
					for (@Pc(30) int local30 = 0; local30 < this.anInt1039; local30++) {
						if (this.aLongArray4[local30] == arg0) {
							this.method724("", local23 + " is already on your ignore list", 0);
							return;
						}
					}
					for (@Pc(60) int local60 = 0; local60 < this.anInt1013; local60++) {
						if (this.aLongArray3[local60] == arg0) {
							this.method724("", "Please remove " + local23 + " from your friend list first", 0);
							return;
						}
					}
					this.aLongArray4[this.anInt1039++] = arg0;
					this.aBoolean233 = true;
					this.aClass2_Sub1_Sub2_6.method83(166);
					this.aClass2_Sub1_Sub2_6.method90(arg0);
				}
			}
		} catch (@Pc(115) RuntimeException local115) {
			signlink.reporterror("59970, " + arg0 + ", " + 0 + ", " + local115.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(I)V")
	@Override
	protected void method585() {
		try {
			this.aBoolean228 = true;
		} catch (@Pc(11) RuntimeException local11) {
			signlink.reporterror("23684, " + -725 + ", " + local11.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "r", descriptor = "(I)V")
	private void method644() {
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
				this.anInt971 = -1;
				this.aClass13_10.method204();
				this.aClass13_12.method204();
				Class2_Sub1_Sub1_Sub3.method250();
				this.method710();
				this.aClass29_1.method324();
				System.gc();
				for (local22 = 0; local22 < 4; local22++) {
					this.aClass12Array1[local22].method185();
				}
				for (local35 = 0; local35 < 4; local35++) {
					for (local39 = 0; local39 < 104; local39++) {
						for (local43 = 0; local43 < 104; local43++) {
							this.aByteArrayArrayArray8[local35][local39][local43] = 0;
						}
					}
				}
				@Pc(77) Class42 local77 = new Class42(104, this.aByteArrayArrayArray8, (byte) 1, 104, this.anIntArrayArrayArray8);
				local43 = this.aByteArrayArray5.length;
				this.aClass2_Sub1_Sub2_6.method83(11);
				@Pc(238) int local238;
				@Pc(226) int local226;
				if (!this.aBoolean268) {
					@Pc(122) byte[] local122;
					for (local91 = 0; local91 < local43; local91++) {
						local105 = (this.anIntArray253[local91] >> 8) * 64 - this.anInt951;
						local117 = (this.anIntArray253[local91] & 0xFF) * 64 - this.anInt952;
						local122 = this.aByteArrayArray5[local91];
						if (local122 != null) {
							local77.method544((this.anInt1005 - 6) * 8, this.aClass12Array1, (this.anInt1006 - 6) * 8, local122, local105, local117);
						}
					}
					for (local105 = 0; local105 < local43; local105++) {
						local117 = (this.anIntArray253[local105] >> 8) * 64 - this.anInt951;
						local176 = (this.anIntArray253[local105] & 0xFF) * 64 - this.anInt952;
						@Pc(181) byte[] local181 = this.aByteArrayArray5[local105];
						if (local181 == null && this.anInt1006 < 800) {
							local77.method548(64, local117, local176, 64);
						}
					}
					this.aClass2_Sub1_Sub2_6.method83(11);
					for (local117 = 0; local117 < local43; local117++) {
						local122 = this.aByteArrayArray6[local117];
						if (local122 != null) {
							local226 = (this.anIntArray253[local117] >> 8) * 64 - this.anInt951;
							local238 = (this.anIntArray253[local117] & 0xFF) * 64 - this.anInt952;
							local77.method538(local122, this.aClass12Array1, this.aClass29_1, local226, local238);
						}
					}
				}
				if (this.aBoolean268) {
					local91 = 0;
					label254: while (true) {
						@Pc(293) int local293;
						@Pc(299) int local299;
						@Pc(305) int local305;
						@Pc(315) int local315;
						@Pc(317) int local317;
						if (local91 >= 4) {
							for (local105 = 0; local105 < 13; local105++) {
								for (local117 = 0; local117 < 13; local117++) {
									local176 = this.anIntArrayArrayArray7[0][local105][local117];
									if (local176 == -1) {
										local77.method548(8, local105 * 8, local117 * 8, 8);
									}
								}
							}
							this.aClass2_Sub1_Sub2_6.method83(11);
							local117 = 0;
							while (true) {
								if (local117 >= 4) {
									break label254;
								}
								for (local176 = 0; local176 < 13; local176++) {
									for (local226 = 0; local226 < 13; local226++) {
										local238 = this.anIntArrayArrayArray7[local117][local176][local226];
										if (local238 != -1) {
											local293 = local238 >> 24 & 0x3;
											local299 = local238 >> 1 & 0x3;
											local305 = local238 >> 14 & 0x3FF;
											local315 = local238 >> 3 & 0x7FF;
											local317 = (local305 / 8 << 8) + local315 / 8;
											for (@Pc(496) int local496 = 0; local496 < this.anIntArray253.length; local496++) {
												if (this.anIntArray253[local496] == local317 && this.aByteArrayArray6[local496] != null) {
													local77.method539(local117, (local315 & 0x7) * 8, this.aClass12Array1, local293, local176 * 8, (local305 & 0x7) * 8, this.aByteArrayArray6[local496], local299, local226 * 8, this.aClass29_1);
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
								@Pc(269) boolean local269 = false;
								local226 = this.anIntArrayArrayArray7[local91][local105][local117];
								if (local226 != -1) {
									local238 = local226 >> 24 & 0x3;
									local293 = local226 >> 1 & 0x3;
									local299 = local226 >> 14 & 0x3FF;
									local305 = local226 >> 3 & 0x7FF;
									local315 = (local299 / 8 << 8) + local305 / 8;
									for (local317 = 0; local317 < this.anIntArray253.length; local317++) {
										if (this.anIntArray253[local317] == local315 && this.aByteArrayArray5[local317] != null) {
											local77.method537(this.aClass12Array1, (local305 & 0x7) * 8, local238, local105 * 8, local117 * 8, this.aByteArrayArray5[local317], local91, (local299 & 0x7) * 8, local293);
											local269 = true;
											break;
										}
									}
								}
								if (!local269) {
									local77.method547(local105 * 8, local117 * 8, local91);
								}
							}
						}
						local91++;
					}
				}
				this.aClass2_Sub1_Sub2_6.method83(11);
				local77.method535(this.aClass29_1, this.aClass12Array1);
				if (this.aClass20_17 != null) {
					this.aClass20_17.method230(this.anInt1025);
					Class2_Sub1_Sub1_Sub3.anIntArray59 = this.anIntArray231;
				}
				this.aClass2_Sub1_Sub2_6.method83(11);
				local91 = Class42.anInt776;
				if (local91 > this.anInt882) {
					local91 = this.anInt882;
				}
				if (local91 < this.anInt882 - 1) {
					local91 = this.anInt882 - 1;
				}
				if (aBoolean272) {
					this.aClass29_1.method325(this.anInt1011, Class42.anInt776);
				} else {
					this.aClass29_1.method325(this.anInt1011, 0);
				}
				for (local105 = 0; local105 < 104; local105++) {
					for (local117 = 0; local117 < 104; local117++) {
						this.method599(local105, local117);
					}
				}
				this.method717(this.anInt1009);
			} catch (@Pc(649) Exception local649) {
			}
			Class33.aClass5_7.method79();
			if (super.aFrame_Sub1_2 != null) {
				this.aClass2_Sub1_Sub2_6.method83(146);
				this.aClass2_Sub1_Sub2_6.method88(1057001181);
			}
			if (aBoolean272 && signlink.aRandomAccessFile3 != null) {
				local22 = this.aClass9_Sub1_1.method514(0);
				for (local35 = 0; local35 < local22; local35++) {
					local39 = this.aClass9_Sub1_1.method509(local35);
					if ((local39 & 0x79) == 0) {
						Class2_Sub1_Sub3_Sub4.method430(local35);
					}
				}
			}
			System.gc();
			Class2_Sub1_Sub1_Sub3.method251();
			this.aClass9_Sub1_1.method524(this.anInt1061);
			local22 = (this.anInt1005 - 6) / 8 - 1;
			local35 = (this.anInt1005 + 6) / 8 + 1;
			local39 = (this.anInt1006 - 6) / 8 - 1;
			local43 = (this.anInt1006 + 6) / 8 + 1;
			if (this.aBoolean238) {
				local22 = 49;
				local35 = 50;
				local39 = 49;
				local43 = 50;
			}
			for (local91 = local22; local91 <= local35; local91++) {
				for (local105 = local39; local105 <= local43; local105++) {
					if (local91 == local22 || local91 == local35 || local105 == local39 || local105 == local43) {
						local117 = this.aClass9_Sub1_1.method511(0, local91, local105);
						if (local117 != -1) {
							this.aClass9_Sub1_1.method519(3, local117);
						}
						local176 = this.aClass9_Sub1_1.method511(1, local91, local105);
						if (local176 != -1) {
							this.aClass9_Sub1_1.method519(3, local176);
						}
					}
				}
			}
		} catch (@Pc(821) RuntimeException local821) {
			signlink.reporterror("72667, " + -175 + ", " + local821.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IZLclient!FSZDVUBI;)V")
	private void method645(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub1_Sub3_Sub1 arg1) {
		try {
			this.method646(arg0, arg1.anInt680, arg1.anInt681);
		} catch (@Pc(12) RuntimeException local12) {
			signlink.reporterror("2029, " + arg0 + ", " + true + ", " + arg1 + ", " + local12.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(IIII)V")
	private void method646(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		try {
			if (arg1 >= 128 && arg2 >= 128 && arg1 <= 13056 && arg2 <= 13056) {
				@Pc(28) int local28 = this.method622(arg2, this.anInt882, arg1) - arg0;
				@Pc(33) int local33 = arg1 - this.anInt913;
				@Pc(38) int local38 = local28 - this.anInt914;
				@Pc(43) int local43 = arg2 - this.anInt915;
				@Pc(48) int local48 = Class2_Sub1_Sub3_Sub4.anIntArray150[this.anInt916];
				@Pc(53) int local53 = Class2_Sub1_Sub3_Sub4.anIntArray151[this.anInt916];
				@Pc(58) int local58 = Class2_Sub1_Sub3_Sub4.anIntArray150[this.anInt917];
				@Pc(63) int local63 = Class2_Sub1_Sub3_Sub4.anIntArray151[this.anInt917];
				@Pc(73) int local73 = local43 * local58 + local33 * local63 >> 16;
				@Pc(83) int local83 = local43 * local63 - local33 * local58 >> 16;
				@Pc(91) int local91 = local73;
				@Pc(101) int local101 = local38 * local53 - local83 * local48 >> 16;
				@Pc(111) int local111 = local38 * local48 + local83 * local53 >> 16;
				if (local111 >= 50) {
					this.anInt941 = Class2_Sub1_Sub1_Sub3.anInt254 + (local91 << 9) / local111;
					this.anInt942 = Class2_Sub1_Sub1_Sub3.anInt255 + (local101 << 9) / local111;
				} else {
					this.anInt941 = -1;
					this.anInt942 = -1;
				}
			} else {
				this.anInt941 = -1;
				this.anInt942 = -1;
			}
		} catch (@Pc(143) RuntimeException local143) {
			signlink.reporterror("47506, " + arg0 + ", " + arg1 + ", " + 2 + ", " + arg2 + ", " + local143.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Z)V")
	@Override
	protected void method583() {
		try {
			this.aClass20_12 = null;
			this.aClass20_13 = null;
			this.aClass20_14 = null;
			this.aByteArray21 = null;
			this.aClass20_8 = null;
			this.aClass20_9 = null;
			this.aClass20_10 = null;
			this.aClass20_11 = null;
			this.aClass2_Sub1_Sub1_Sub2_12 = null;
			this.aClass2_Sub1_Sub1_Sub2_13 = null;
			this.aClass2_Sub1_Sub1_Sub2_14 = null;
			this.aClass2_Sub1_Sub1_Sub2_15 = null;
			this.aClass2_Sub1_Sub1_Sub2_16 = null;
			this.aClass2_Sub1_Sub2_7 = null;
			this.aClass2_Sub1_Sub1_Sub4_3 = null;
			this.aClass2_Sub1_Sub1_Sub4_4 = null;
			this.aClass2_Sub1_Sub1_Sub4_5 = null;
			this.aClass20_15 = null;
			this.aClass20_16 = null;
			this.aClass20_17 = null;
			this.aClass20_18 = null;
			this.aClass2_Sub1_Sub1_Sub4_16 = null;
			this.aClass2_Sub1_Sub1_Sub4_17 = null;
			this.aClass2_Sub1_Sub1_Sub4_18 = null;
			this.aClass2_Sub1_Sub1_Sub4_19 = null;
			this.aClass2_Sub1_Sub1_Sub4_20 = null;
			this.aClass20_23 = null;
			this.aClass20_24 = null;
			this.aClass20_25 = null;
			this.aClass20_26 = null;
			this.aClass20_27 = null;
			this.anIntArray249 = null;
			this.anIntArray250 = null;
			this.aClass2_Sub1_Sub1_Sub2Array6 = null;
			this.aClass2_Sub1_Sub1_Sub4Array5 = null;
			this.aClass2_Sub1_Sub1_Sub2Array4 = null;
			this.anIntArray225 = null;
			try {
				if (this.aClass28_1 != null) {
					this.aClass28_1.method317();
				}
			} catch (@Pc(125) Exception local125) {
			}
			this.aClass28_1 = null;
			this.aClass2_Sub1_Sub1_Sub2_3 = null;
			this.aClass2_Sub1_Sub1_Sub2_9 = null;
			if (this.aClass19_1 != null) {
				this.aClass19_1.aBoolean82 = false;
			}
			this.aClass19_1 = null;
			this.aClass2_Sub1_Sub2_6 = null;
			this.aClass2_Sub1_Sub2_8 = null;
			this.aClass2_Sub1_Sub2_9 = null;
			this.anIntArrayArray24 = null;
			if (this.aClass9_Sub1_1 != null) {
				this.aClass9_Sub1_1.method529();
			}
			this.aClass9_Sub1_1 = null;
			this.aClass20_19 = null;
			this.aClass20_20 = null;
			this.aClass20_21 = null;
			this.aClass20_22 = null;
			this.aClass2_Sub1_Sub1_Sub4Array2 = null;
			this.aClass2_Sub1_Sub3_Sub1_Sub1Array1 = null;
			this.anIntArray245 = null;
			this.anIntArray246 = null;
			this.aClass2_Sub1_Sub2Array1 = null;
			this.anIntArray243 = null;
			this.aClass13_12 = null;
			this.aClass13_10 = null;
			this.method608(this.aByte59);
			this.anIntArrayArrayArray8 = null;
			this.aByteArrayArrayArray8 = null;
			this.aClass29_1 = null;
			this.aClass12Array1 = null;
			this.aClass13ArrayArrayArray1 = null;
			this.aClass13_11 = null;
			this.anIntArray220 = null;
			this.anIntArray221 = null;
			this.anIntArray222 = null;
			this.anIntArray223 = null;
			this.aStringArray8 = null;
			this.aClass20_6 = null;
			this.aClass20_7 = null;
			this.aClass20_3 = null;
			this.aClass20_4 = null;
			this.aClass20_5 = null;
			this.aClass2_Sub1_Sub1_Sub4_11 = null;
			this.aClass2_Sub1_Sub1_Sub4_12 = null;
			this.aClass2_Sub1_Sub1_Sub4_13 = null;
			this.aClass2_Sub1_Sub1_Sub4_14 = null;
			this.aClass2_Sub1_Sub1_Sub4_15 = null;
			this.aStringArray11 = null;
			this.aLongArray3 = null;
			this.anIntArray252 = null;
			this.aClass2_Sub1_Sub1_Sub2_4 = null;
			this.aClass2_Sub1_Sub1_Sub2Array9 = null;
			this.aClass2_Sub1_Sub1_Sub2Array8 = null;
			this.aClass2_Sub1_Sub1_Sub2Array5 = null;
			this.aClass2_Sub1_Sub1_Sub2Array7 = null;
			this.aClass2_Sub1_Sub1_Sub2Array10 = null;
			this.anIntArray253 = null;
			this.aByteArrayArray5 = null;
			this.aByteArrayArray6 = null;
			this.anIntArray254 = null;
			this.anIntArray255 = null;
			this.anIntArrayArray22 = null;
			this.anIntArrayArray25 = null;
			this.anIntArray216 = null;
			this.anIntArray217 = null;
			this.aClass2_Sub1_Sub1_Sub4_8 = null;
			this.aClass2_Sub1_Sub1_Sub4_9 = null;
			this.aClass2_Sub1_Sub1_Sub4_10 = null;
			this.aClass2_Sub1_Sub3_Sub1_Sub2Array1 = null;
			this.anIntArray215 = null;
			this.method698();
			Class33.method460();
			Class48.method566();
			Class32.method408();
			Class31.method394();
			Class40.aClass40Array1 = null;
			Class14.aClass14Array1 = null;
			Class4.aClass4Array1 = null;
			Class22.aClass22Array1 = null;
			Class27.aClass27Array1 = null;
			Class27.aClass5_2 = null;
			Class1.aClass1Array1 = null;
			super.aClass20_2 = null;
			Class2_Sub1_Sub3_Sub1_Sub1.aClass5_1 = null;
			Class2_Sub1_Sub1_Sub3.method247();
			Class29.method323();
			Class2_Sub1_Sub3_Sub4.method427();
			Class45.method555();
			System.gc();
		} catch (@Pc(383) RuntimeException local383) {
			signlink.reporterror("8904, " + false + ", " + local383.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "s", descriptor = "(I)V")
	private void method647() {
		try {
			for (@Pc(17) Class2_Sub1_Sub3_Sub5 local17 = (Class2_Sub1_Sub3_Sub5) this.aClass13_10.method200(); local17 != null; local17 = (Class2_Sub1_Sub3_Sub5) this.aClass13_10.method202()) {
				if (local17.anInt625 != this.anInt882 || local17.aBoolean186) {
					local17.method530();
				} else if (anInt970 >= local17.anInt623) {
					local17.method472(this.anInt885, 914);
					if (local17.aBoolean186) {
						local17.method530();
					} else {
						this.aClass29_1.method335(local17, local17.anInt625, 0, false, -1, local17.anInt628, 60, local17.anInt627, local17.anInt626);
					}
				}
			}
		} catch (@Pc(75) RuntimeException local75) {
			signlink.reporterror("90219, " + 3 + ", " + local75.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Ljava/lang/String;)V")
	private void method648(@OriginalArg(0) String arg0) {
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

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ZI)V")
	private void method649(@OriginalArg(1) int arg0) {
		try {
			this.aBoolean248 &= true;
			@Pc(8) Class31 local8 = Class31.method403(arg0);
			for (@Pc(10) int local10 = 0; local10 < local8.anIntArray100.length && local8.anIntArray100[local10] != -1; local10++) {
				@Pc(24) Class31 local24 = Class31.method403(local8.anIntArray100[local10]);
				if (local24.anInt503 == 1) {
					this.method649(local24.anInt491);
				}
				local24.anInt502 = 0;
				local24.anInt492 = 0;
			}
		} catch (@Pc(47) RuntimeException local47) {
			signlink.reporterror("93189, " + true + ", " + arg0 + ", " + local47.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "j", descriptor = "(B)V")
	private void method650() {
		try {
			if (this.anInt1004 >= 2 || this.anInt955 != 0 || this.anInt1000 != 0) {
				@Pc(31) String local31;
				if (this.anInt955 == 1 && this.anInt1004 < 2) {
					local31 = "Use " + this.aString25 + " with...";
				} else if (this.anInt1000 == 1 && this.anInt1004 < 2) {
					local31 = this.aString28 + "...";
				} else {
					local31 = this.aStringArray8[this.anInt1004 - 1];
				}
				if (this.anInt1004 > 2) {
					local31 = local31 + "@whi@ / " + (this.anInt1004 - 2) + " more options";
				}
				this.aClass2_Sub1_Sub1_Sub1_4.method44(local31, 4, 16777215, anInt970 / 1000, 15);
			}
		} catch (@Pc(104) RuntimeException local104) {
			signlink.reporterror("88685, " + 0 + ", " + local104.toString());
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
				return new URL("http://127.0.0.1:" + (anInt1073 + 80));
			}
		} catch (@Pc(21) Exception local21) {
		}
		return super.getCodeBase();
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(JI)V")
	private void method651(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1) {
		try {
			this.anInt972 += arg1;
			if (arg0 != 0L) {
				for (@Pc(14) int local14 = 0; local14 < this.anInt1039; local14++) {
					if (this.aLongArray4[local14] == arg0) {
						this.anInt1039--;
						this.aBoolean233 = true;
						for (@Pc(34) int local34 = local14; local34 < this.anInt1039; local34++) {
							this.aLongArray4[local34] = this.aLongArray4[local34 + 1];
						}
						this.aClass2_Sub1_Sub2_6.method83(87);
						this.aClass2_Sub1_Sub2_6.method90(arg0);
						return;
					}
				}
			}
		} catch (@Pc(69) RuntimeException local69) {
			signlink.reporterror("31227, " + arg0 + ", " + arg1 + ", " + local69.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "t", descriptor = "(I)V")
	private void method652() {
		try {
			if (super.anInt843 == 1) {
				if (super.anInt844 >= 6 && super.anInt844 <= 106 && super.anInt845 >= 467 && super.anInt845 <= 499) {
					this.anInt1066 = (this.anInt1066 + 1) % 4;
					this.aBoolean226 = true;
					this.aBoolean241 = true;
					this.aClass2_Sub1_Sub2_6.method83(24);
					this.aClass2_Sub1_Sub2_6.method84(this.anInt1066);
					this.aClass2_Sub1_Sub2_6.method84(this.anInt900);
					this.aClass2_Sub1_Sub2_6.method84(this.anInt895);
				}
				if (super.anInt844 >= 135 && super.anInt844 <= 235 && super.anInt845 >= 467 && super.anInt845 <= 499) {
					this.anInt900 = (this.anInt900 + 1) % 3;
					this.aBoolean226 = true;
					this.aBoolean241 = true;
					this.aClass2_Sub1_Sub2_6.method83(24);
					this.aClass2_Sub1_Sub2_6.method84(this.anInt1066);
					this.aClass2_Sub1_Sub2_6.method84(this.anInt900);
					this.aClass2_Sub1_Sub2_6.method84(this.anInt895);
				}
				if (super.anInt844 >= 273 && super.anInt844 <= 373 && super.anInt845 >= 467 && super.anInt845 <= 499) {
					this.anInt895 = (this.anInt895 + 1) % 3;
					this.aBoolean226 = true;
					this.aBoolean241 = true;
					this.aClass2_Sub1_Sub2_6.method83(24);
					this.aClass2_Sub1_Sub2_6.method84(this.anInt1066);
					this.aClass2_Sub1_Sub2_6.method84(this.anInt900);
					this.aClass2_Sub1_Sub2_6.method84(this.anInt895);
				}
				if (super.anInt844 >= 412 && super.anInt844 <= 512 && super.anInt845 >= 467 && super.anInt845 <= 499) {
					if (this.anInt903 == -1) {
						this.method636();
						this.aString19 = "";
						this.aBoolean234 = false;
						this.anInt1021 = this.anInt903 = Class31.anInt489;
						return;
					}
					this.method724("", "Please close the interface you have open before using 'report abuse'", 0);
					return;
				}
			}
		} catch (@Pc(200) RuntimeException local200) {
			signlink.reporterror("65987, " + 0 + ", " + local200.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "u", descriptor = "(I)V")
	private void method653() {
		try {
			System.out.println("============");
			System.out.println("flame-cycle:" + this.anInt983);
			if (this.aClass9_Sub1_1 != null) {
				System.out.println("Od-cycle:" + this.aClass9_Sub1_1.anInt747);
			}
			System.out.println("loop-cycle:" + anInt970);
			System.out.println("draw-cycle:" + anInt1016);
			System.out.println("ptype:" + this.anInt973);
			System.out.println("psize:" + this.anInt972);
			if (this.aClass28_1 != null) {
				this.aClass28_1.method322();
			}
			super.aBoolean223 = true;
		} catch (@Pc(85) RuntimeException local85) {
			signlink.reporterror("38829, " + -955 + ", " + local85.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(I)Ljava/awt/Component;")
	@Override
	protected Component method586() {
		try {
			if (signlink.mainapp == null) {
				return super.aFrame_Sub1_2 == null ? this : super.aFrame_Sub1_2;
			} else {
				return signlink.mainapp;
			}
		} catch (@Pc(22) RuntimeException local22) {
			signlink.reporterror("79082, " + 1 + ", " + local22.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "v", descriptor = "(I)V")
	private void method654() {
		try {
			if (this.aClass20_3 == null) {
				super.aClass20_2 = null;
				this.aClass20_18 = null;
				this.aClass20_16 = null;
				this.aClass20_15 = null;
				this.aClass20_17 = null;
				this.aClass20_12 = null;
				this.aClass20_13 = null;
				this.aClass20_14 = null;
				this.aClass20_6 = new Class20(128, 265, this.method586(), aBoolean269);
				Class2_Sub1_Sub1.method276();
				this.aClass20_7 = new Class20(128, 265, this.method586(), aBoolean269);
				Class2_Sub1_Sub1.method276();
				this.aClass20_3 = new Class20(509, 171, this.method586(), aBoolean269);
				Class2_Sub1_Sub1.method276();
				this.aClass20_4 = new Class20(360, 132, this.method586(), aBoolean269);
				Class2_Sub1_Sub1.method276();
				this.aClass20_5 = new Class20(360, 200, this.method586(), aBoolean269);
				Class2_Sub1_Sub1.method276();
				this.aClass20_8 = new Class20(202, 238, this.method586(), aBoolean269);
				Class2_Sub1_Sub1.method276();
				this.aClass20_9 = new Class20(203, 238, this.method586(), aBoolean269);
				Class2_Sub1_Sub1.method276();
				this.aClass20_10 = new Class20(74, 94, this.method586(), aBoolean269);
				Class2_Sub1_Sub1.method276();
				this.aClass20_11 = new Class20(75, 94, this.method586(), aBoolean269);
				Class2_Sub1_Sub1.method276();
				if (this.aClass35_2 != null) {
					this.method597();
					this.method593();
				}
				this.aBoolean228 = true;
			}
		} catch (@Pc(167) RuntimeException local167) {
			signlink.reporterror("84124, " + 828 + ", " + local167.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "w", descriptor = "(I)V")
	private void method655() {
		try {
			@Pc(3) int local3 = 5;
			this.anIntArray244[8] = 0;
			if (this.anInt899 <= 4 && this.anInt899 >= 4) {
				@Pc(19) int local19 = 0;
				while (this.anIntArray244[8] == 0) {
					@Pc(23) String local23 = "Unknown problem";
					this.method588((byte) 6, 20, "Connecting to web server");
					try {
						@Pc(45) DataInputStream local45 = this.method618("crc" + (int) (Math.random() * 9.9999999E7D) + "-" + 375);
						@Pc(52) Class2_Sub1_Sub2 local52 = new Class2_Sub1_Sub2(new byte[40], (byte) 3);
						local45.readFully(local52.aByteArray1, 0, 40);
						local45.close();
						for (@Pc(62) int local62 = 0; local62 < 9; local62++) {
							this.anIntArray244[local62] = local52.method99();
						}
						@Pc(77) int local77 = local52.method99();
						@Pc(79) int local79 = 1234;
						for (@Pc(81) int local81 = 0; local81 < 9; local81++) {
							local79 = (local79 << 1) + this.anIntArray244[local81];
						}
						if (local77 != local79) {
							local23 = "checksum problem";
							this.anIntArray244[8] = 0;
						}
					} catch (@Pc(108) EOFException local108) {
						local23 = "EOF problem";
						this.anIntArray244[8] = 0;
					} catch (@Pc(117) IOException local117) {
						local23 = "connection problem";
						this.anIntArray244[8] = 0;
					} catch (@Pc(126) Exception local126) {
						local23 = "logic problem";
						this.anIntArray244[8] = 0;
						if (!signlink.reporterror) {
							return;
						}
					}
					if (this.anIntArray244[8] == 0) {
						local19++;
						for (@Pc(144) int local144 = local3; local144 > 0; local144--) {
							if (local19 >= 10) {
								this.method588((byte) 6, 10, "Game updated - please reload page");
								local144 = 10;
							} else {
								this.method588((byte) 6, 10, local23 + " - Will retry in " + local144 + " secs.");
							}
							try {
								Thread.sleep(1000L);
							} catch (@Pc(178) Exception local178) {
							}
						}
						local3 *= 2;
						if (local3 > 60) {
							local3 = 60;
						}
						this.aBoolean235 = !this.aBoolean235;
					}
				}
			}
		} catch (@Pc(206) RuntimeException local206) {
			signlink.reporterror("17910, " + 4 + ", " + local206.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(Z)V")
	private void method657() {
		try {
			this.aBoolean248 &= true;
			if (this.anInt955 == 0 && this.anInt1000 == 0) {
				this.aStringArray8[this.anInt1004] = "Walk here";
				this.anIntArray222[this.anInt1004] = 46;
				this.anIntArray220[this.anInt1004] = super.anInt838;
				this.anIntArray221[this.anInt1004] = super.anInt839;
				this.anInt1004++;
			}
			@Pc(47) int local47 = -1;
			for (@Pc(49) int local49 = 0; local49 < Class2_Sub1_Sub3_Sub4.anInt598; local49++) {
				@Pc(55) int local55 = Class2_Sub1_Sub3_Sub4.anIntArray149[local49];
				@Pc(59) int local59 = local55 & 0x7F;
				@Pc(65) int local65 = local55 >> 7 & 0x7F;
				@Pc(71) int local71 = local55 >> 29 & 0x3;
				@Pc(77) int local77 = local55 >> 14 & 0x7FFF;
				if (local55 != local47) {
					local47 = local55;
					@Pc(225) int local225;
					if (local71 == 2 && this.aClass29_1.method354(this.anInt882, local59, local65, local55) >= 0) {
						@Pc(97) Class33 local97 = Class33.method459(local77);
						if (local97.anIntArray157 != null) {
							local97 = local97.method458(this.anInt1019);
						}
						if (local97 == null) {
							continue;
						}
						if (this.anInt955 == 1) {
							this.aStringArray8[this.anInt1004] = "Use " + this.aString25 + " with @cya@" + local97.aString12;
							this.anIntArray222[this.anInt1004] = 653;
							this.anIntArray223[this.anInt1004] = local55;
							this.anIntArray220[this.anInt1004] = local59;
							this.anIntArray221[this.anInt1004] = local65;
							this.anInt1004++;
						} else if (this.anInt1000 != 1) {
							if (local97.aStringArray5 != null) {
								for (local225 = 4; local225 >= 0; local225--) {
									if (local97.aStringArray5[local225] != null) {
										this.aStringArray8[this.anInt1004] = local97.aStringArray5[local225] + " @cya@" + local97.aString12;
										if (local225 == 0) {
											this.anIntArray222[this.anInt1004] = 51;
										}
										if (local225 == 1) {
											this.anIntArray222[this.anInt1004] = 66;
										}
										if (local225 == 2) {
											this.anIntArray222[this.anInt1004] = 824;
										}
										if (local225 == 3) {
											this.anIntArray222[this.anInt1004] = 106;
										}
										if (local225 == 4) {
											this.anIntArray222[this.anInt1004] = 1359;
										}
										this.anIntArray223[this.anInt1004] = local55;
										this.anIntArray220[this.anInt1004] = local59;
										this.anIntArray221[this.anInt1004] = local65;
										this.anInt1004++;
									}
								}
							}
							this.aStringArray8[this.anInt1004] = "Examine @cya@" + local97.aString12;
							this.anIntArray222[this.anInt1004] = 1456;
							this.anIntArray223[this.anInt1004] = local97.anInt608 << 14;
							this.anIntArray220[this.anInt1004] = local59;
							this.anIntArray221[this.anInt1004] = local65;
							this.anInt1004++;
						} else if ((this.anInt1002 & 0x4) == 4) {
							this.aStringArray8[this.anInt1004] = this.aString28 + " @cya@" + local97.aString12;
							this.anIntArray222[this.anInt1004] = 546;
							this.anIntArray223[this.anInt1004] = local55;
							this.anIntArray220[this.anInt1004] = local59;
							this.anIntArray221[this.anInt1004] = local65;
							this.anInt1004++;
						}
					}
					@Pc(405) Class2_Sub1_Sub3_Sub1_Sub2 local405;
					@Pc(453) Class2_Sub1_Sub3_Sub1_Sub1 local453;
					@Pc(443) int local443;
					if (local71 == 1) {
						@Pc(376) Class2_Sub1_Sub3_Sub1_Sub2 local376 = this.aClass2_Sub1_Sub3_Sub1_Sub2Array1[local77];
						if (local376.aClass48_2.aByte58 == 1 && (local376.anInt680 & 0x7F) == 64 && (local376.anInt681 & 0x7F) == 64) {
							for (local225 = 0; local225 < this.anInt866; local225++) {
								local405 = this.aClass2_Sub1_Sub3_Sub1_Sub2Array1[this.anIntArray215[local225]];
								if (local405 != null && local405 != local376 && local405.aClass48_2.aByte58 == 1 && local405.anInt680 == local376.anInt680 && local405.anInt681 == local376.anInt681) {
									this.method688(local65, this.anIntArray215[local225], local405.aClass48_2, 311, local59);
								}
							}
							for (local443 = 0; local443 < this.anInt949; local443++) {
								local453 = this.aClass2_Sub1_Sub3_Sub1_Sub1Array1[this.anIntArray245[local443]];
								if (local453 != null && local453.anInt680 == local376.anInt680 && local453.anInt681 == local376.anInt681) {
									this.method667(this.anIntArray245[local443], local65, local59, local453);
								}
							}
						}
						this.method688(local65, local77, local376.aClass48_2, 311, local59);
					}
					if (local71 == 0) {
						@Pc(495) Class2_Sub1_Sub3_Sub1_Sub1 local495 = this.aClass2_Sub1_Sub3_Sub1_Sub1Array1[local77];
						if ((local495.anInt680 & 0x7F) == 64 && (local495.anInt681 & 0x7F) == 64) {
							for (local225 = 0; local225 < this.anInt866; local225++) {
								local405 = this.aClass2_Sub1_Sub3_Sub1_Sub2Array1[this.anIntArray215[local225]];
								if (local405 != null && local405.aClass48_2.aByte58 == 1 && local405.anInt680 == local495.anInt680 && local405.anInt681 == local495.anInt681) {
									this.method688(local65, this.anIntArray215[local225], local405.aClass48_2, 311, local59);
								}
							}
							for (local443 = 0; local443 < this.anInt949; local443++) {
								local453 = this.aClass2_Sub1_Sub3_Sub1_Sub1Array1[this.anIntArray245[local443]];
								if (local453 != null && local453 != local495 && local453.anInt680 == local495.anInt680 && local453.anInt681 == local495.anInt681) {
									this.method667(this.anIntArray245[local443], local65, local59, local453);
								}
							}
						}
						this.method667(local77, local65, local59, local495);
					}
					if (local71 == 3) {
						@Pc(614) Class13 local614 = this.aClass13ArrayArrayArray1[this.anInt882][local59][local65];
						if (local614 != null) {
							for (@Pc(621) Class2_Sub1_Sub3_Sub2 local621 = (Class2_Sub1_Sub3_Sub2) local614.method201(659); local621 != null; local621 = (Class2_Sub1_Sub3_Sub2) local614.method203()) {
								@Pc(627) Class32 local627 = Class32.method412(local621.anInt276);
								if (this.anInt955 == 1) {
									this.aStringArray8[this.anInt1004] = "Use " + this.aString25 + " with @lre@" + local627.aString11;
									this.anIntArray222[this.anInt1004] = 196;
									this.anIntArray223[this.anInt1004] = local621.anInt276;
									this.anIntArray220[this.anInt1004] = local59;
									this.anIntArray221[this.anInt1004] = local65;
									this.anInt1004++;
								} else if (this.anInt1000 != 1) {
									for (@Pc(744) int local744 = 4; local744 >= 0; local744--) {
										if (local627.aStringArray3 != null && local627.aStringArray3[local744] != null) {
											this.aStringArray8[this.anInt1004] = local627.aStringArray3[local744] + " @lre@" + local627.aString11;
											if (local744 == 0) {
												this.anIntArray222[this.anInt1004] = 864;
											}
											if (local744 == 1) {
												this.anIntArray222[this.anInt1004] = 995;
											}
											if (local744 == 2) {
												this.anIntArray222[this.anInt1004] = 941;
											}
											if (local744 == 3) {
												this.anIntArray222[this.anInt1004] = 808;
											}
											if (local744 == 4) {
												this.anIntArray222[this.anInt1004] = 656;
											}
											this.anIntArray223[this.anInt1004] = local621.anInt276;
											this.anIntArray220[this.anInt1004] = local59;
											this.anIntArray221[this.anInt1004] = local65;
											this.anInt1004++;
										} else if (local744 == 2) {
											this.aStringArray8[this.anInt1004] = "Take @lre@" + local627.aString11;
											this.anIntArray222[this.anInt1004] = 941;
											this.anIntArray223[this.anInt1004] = local621.anInt276;
											this.anIntArray220[this.anInt1004] = local59;
											this.anIntArray221[this.anInt1004] = local65;
											this.anInt1004++;
										}
									}
									this.aStringArray8[this.anInt1004] = "Examine @lre@" + local627.aString11;
									this.anIntArray222[this.anInt1004] = 1686;
									this.anIntArray223[this.anInt1004] = local621.anInt276;
									this.anIntArray220[this.anInt1004] = local59;
									this.anIntArray221[this.anInt1004] = local65;
									this.anInt1004++;
								} else if ((this.anInt1002 & 0x1) == 1) {
									this.aStringArray8[this.anInt1004] = this.aString28 + " @lre@" + local627.aString11;
									this.anIntArray222[this.anInt1004] = 735;
									this.anIntArray223[this.anInt1004] = local621.anInt276;
									this.anIntArray220[this.anInt1004] = local59;
									this.anIntArray221[this.anInt1004] = local65;
									this.anInt1004++;
								}
							}
						}
					}
				}
			}
		} catch (@Pc(951) RuntimeException local951) {
			signlink.reporterror("81957, " + true + ", " + local951.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(II)V")
	private void method658(@OriginalArg(1) int arg0) {
		try {
			signlink.anInt1083 = arg0;
		} catch (@Pc(9) RuntimeException local9) {
			signlink.reporterror("64099, " + 28913 + ", " + arg0 + ", " + local9.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIIIIZIIZII)Z")
	private boolean method659(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) boolean arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		try {
			@Pc(17) int local17;
			for (@Pc(13) int local13 = 0; local13 < 104; local13++) {
				for (local17 = 0; local17 < 104; local17++) {
					this.anIntArrayArray22[local13][local17] = 0;
					this.anIntArrayArray25[local13][local17] = 99999999;
				}
			}
			local17 = arg7;
			@Pc(45) int local45 = arg4;
			this.anIntArrayArray22[arg7][arg4] = 99;
			this.anIntArrayArray25[arg7][arg4] = 0;
			@Pc(61) byte local61 = 0;
			@Pc(63) int local63 = 0;
			this.anIntArray216[0] = arg7;
			@Pc(72) int local72 = local61 + 1;
			this.anIntArray217[0] = arg4;
			@Pc(76) boolean local76 = false;
			@Pc(80) int local80 = this.anIntArray216.length;
			@Pc(87) int[][] local87 = this.aClass12Array1[this.anInt882].anIntArrayArray3;
			@Pc(198) int local198;
			while (local63 != local72) {
				local17 = this.anIntArray216[local63];
				local45 = this.anIntArray217[local63];
				local63 = (local63 + 1) % local80;
				if (local17 == arg3 && local45 == arg10) {
					local76 = true;
					break;
				}
				if (arg0 != 0) {
					if ((arg0 < 5 || arg0 == 10) && this.aClass12Array1[this.anInt882].method194(arg10, local45, arg9, local17, arg0 - 1, arg3)) {
						local76 = true;
						break;
					}
					if (arg0 < 10 && this.aClass12Array1[this.anInt882].method195(arg0 - 1, local45, arg3, arg10, local17, arg9)) {
						local76 = true;
						break;
					}
				}
				if (arg2 != 0 && arg1 != 0 && this.aClass12Array1[this.anInt882].method196(438, arg2, arg6, local45, arg3, arg1, local17, arg10)) {
					local76 = true;
					break;
				}
				local198 = this.anIntArrayArray25[local17][local45] + 1;
				if (local17 > 0 && this.anIntArrayArray22[local17 - 1][local45] == 0 && (local87[local17 - 1][local45] & 0x1280108) == 0) {
					this.anIntArray216[local72] = local17 - 1;
					this.anIntArray217[local72] = local45;
					local72 = (local72 + 1) % local80;
					this.anIntArrayArray22[local17 - 1][local45] = 2;
					this.anIntArrayArray25[local17 - 1][local45] = local198;
				}
				if (local17 < 103 && this.anIntArrayArray22[local17 + 1][local45] == 0 && (local87[local17 + 1][local45] & 0x1280180) == 0) {
					this.anIntArray216[local72] = local17 + 1;
					this.anIntArray217[local72] = local45;
					local72 = (local72 + 1) % local80;
					this.anIntArrayArray22[local17 + 1][local45] = 8;
					this.anIntArrayArray25[local17 + 1][local45] = local198;
				}
				if (local45 > 0 && this.anIntArrayArray22[local17][local45 - 1] == 0 && (local87[local17][local45 - 1] & 0x1280102) == 0) {
					this.anIntArray216[local72] = local17;
					this.anIntArray217[local72] = local45 - 1;
					local72 = (local72 + 1) % local80;
					this.anIntArrayArray22[local17][local45 - 1] = 1;
					this.anIntArrayArray25[local17][local45 - 1] = local198;
				}
				if (local45 < 103 && this.anIntArrayArray22[local17][local45 + 1] == 0 && (local87[local17][local45 + 1] & 0x1280120) == 0) {
					this.anIntArray216[local72] = local17;
					this.anIntArray217[local72] = local45 + 1;
					local72 = (local72 + 1) % local80;
					this.anIntArrayArray22[local17][local45 + 1] = 4;
					this.anIntArrayArray25[local17][local45 + 1] = local198;
				}
				if (local17 > 0 && local45 > 0 && this.anIntArrayArray22[local17 - 1][local45 - 1] == 0 && (local87[local17 - 1][local45 - 1] & 0x128010E) == 0 && (local87[local17 - 1][local45] & 0x1280108) == 0 && (local87[local17][local45 - 1] & 0x1280102) == 0) {
					this.anIntArray216[local72] = local17 - 1;
					this.anIntArray217[local72] = local45 - 1;
					local72 = (local72 + 1) % local80;
					this.anIntArrayArray22[local17 - 1][local45 - 1] = 3;
					this.anIntArrayArray25[local17 - 1][local45 - 1] = local198;
				}
				if (local17 < 103 && local45 > 0 && this.anIntArrayArray22[local17 + 1][local45 - 1] == 0 && (local87[local17 + 1][local45 - 1] & 0x1280183) == 0 && (local87[local17 + 1][local45] & 0x1280180) == 0 && (local87[local17][local45 - 1] & 0x1280102) == 0) {
					this.anIntArray216[local72] = local17 + 1;
					this.anIntArray217[local72] = local45 - 1;
					local72 = (local72 + 1) % local80;
					this.anIntArrayArray22[local17 + 1][local45 - 1] = 9;
					this.anIntArrayArray25[local17 + 1][local45 - 1] = local198;
				}
				if (local17 > 0 && local45 < 103 && this.anIntArrayArray22[local17 - 1][local45 + 1] == 0 && (local87[local17 - 1][local45 + 1] & 0x1280138) == 0 && (local87[local17 - 1][local45] & 0x1280108) == 0 && (local87[local17][local45 + 1] & 0x1280120) == 0) {
					this.anIntArray216[local72] = local17 - 1;
					this.anIntArray217[local72] = local45 + 1;
					local72 = (local72 + 1) % local80;
					this.anIntArrayArray22[local17 - 1][local45 + 1] = 6;
					this.anIntArrayArray25[local17 - 1][local45 + 1] = local198;
				}
				if (local17 < 103 && local45 < 103 && this.anIntArrayArray22[local17 + 1][local45 + 1] == 0 && (local87[local17 + 1][local45 + 1] & 0x12801E0) == 0 && (local87[local17 + 1][local45] & 0x1280180) == 0 && (local87[local17][local45 + 1] & 0x1280120) == 0) {
					this.anIntArray216[local72] = local17 + 1;
					this.anIntArray217[local72] = local45 + 1;
					local72 = (local72 + 1) % local80;
					this.anIntArrayArray22[local17 + 1][local45 + 1] = 12;
					this.anIntArrayArray25[local17 + 1][local45 + 1] = local198;
				}
			}
			this.anInt868 = 0;
			@Pc(814) int local814;
			@Pc(820) int local820;
			@Pc(826) int local826;
			if (!local76) {
				if (!arg8) {
					return false;
				}
				local198 = 1000;
				local814 = 100;
				for (local820 = arg3 - 10; local820 <= arg3 + 10; local820++) {
					for (local826 = arg10 - 10; local826 <= arg10 + 10; local826++) {
						if (local820 >= 0 && local826 >= 0 && local820 < 104 && local826 < 104 && this.anIntArrayArray25[local820][local826] < 100) {
							@Pc(848) int local848 = 0;
							if (local820 < arg3) {
								local848 = arg3 - local820;
							} else if (local820 > arg3 + arg2 - 1) {
								local848 = local820 + 1 - arg3 - arg2;
							}
							@Pc(874) int local874 = 0;
							if (local826 < arg10) {
								local874 = arg10 - local826;
							} else if (local826 > arg10 + arg1 - 1) {
								local874 = local826 + 1 - arg10 - arg1;
							}
							@Pc(906) int local906 = local848 * local848 + local874 * local874;
							if (local906 < local198 || local906 == local198 && this.anIntArrayArray25[local820][local826] < local814) {
								local198 = local906;
								local814 = this.anIntArrayArray25[local820][local826];
								local17 = local820;
								local45 = local826;
							}
						}
					}
				}
				if (local198 == 1000) {
					return false;
				}
				if (local17 == arg7 && local45 == arg4) {
					return false;
				}
				this.anInt868 = 1;
			}
			@Pc(967) byte local967 = 0;
			this.anIntArray216[0] = local17;
			local63 = local967 + 1;
			this.anIntArray217[0] = local45;
			local198 = local814 = this.anIntArrayArray22[local17][local45];
			while (local17 != arg7 || local45 != arg4) {
				if (local198 != local814) {
					local814 = local198;
					this.anIntArray216[local63] = local17;
					this.anIntArray217[local63++] = local45;
				}
				if ((local198 & 0x2) != 0) {
					local17++;
				} else if ((local198 & 0x8) != 0) {
					local17--;
				}
				if ((local198 & 0x1) != 0) {
					local45++;
				} else if ((local198 & 0x4) != 0) {
					local45--;
				}
				local198 = this.anIntArrayArray22[local17][local45];
			}
			if (local63 > 0) {
				local80 = local63;
				if (local63 > 25) {
					local80 = 25;
				}
				local63--;
				@Pc(1057) int local1057 = this.anIntArray216[local63];
				local820 = this.anIntArray217[local63];
				if (arg5 == 0) {
					this.aClass2_Sub1_Sub2_6.method83(5);
					this.aClass2_Sub1_Sub2_6.method84(local80 + local80 + 3);
				}
				if (arg5 == 1) {
					this.aClass2_Sub1_Sub2_6.method83(41);
					this.aClass2_Sub1_Sub2_6.method84(local80 + local80 + 3 + 14);
				}
				if (arg5 == 2) {
					this.aClass2_Sub1_Sub2_6.method83(74);
					this.aClass2_Sub1_Sub2_6.method84(local80 + local80 + 3);
				}
				this.anInt931 = this.anIntArray216[0];
				this.anInt932 = this.anIntArray217[0];
				for (local826 = 1; local826 < local80; local826++) {
					local63--;
					this.aClass2_Sub1_Sub2_6.method84(this.anIntArray216[local63] - local1057);
					this.aClass2_Sub1_Sub2_6.method110(868, this.anIntArray217[local63] - local820);
				}
				this.aClass2_Sub1_Sub2_6.method118(local1057 + this.anInt951);
				this.aClass2_Sub1_Sub2_6.method110(868, super.anIntArray210[5] == 1 ? 1 : 0);
				this.aClass2_Sub1_Sub2_6.method117(local820 + this.anInt952, 26);
				return true;
			} else if (arg5 == 1) {
				return false;
			} else {
				return true;
			}
		} catch (@Pc(1190) RuntimeException local1190) {
			signlink.reporterror("96600, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + false + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + arg10 + ", " + local1190.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "x", descriptor = "(I)V")
	private void method660() {
		try {
			if (this.anInt976 > 0) {
				this.method629();
			} else {
				this.method630("Connection lost", "Please wait - attempting to reestablish", this.anInt896);
				this.anInt1007 = 0;
				this.anInt931 = 0;
				@Pc(29) Class28 local29 = this.aClass28_1;
				this.aBoolean248 = false;
				this.anInt879 = 0;
				this.method725(this.aString26, this.aString27, true);
				if (!this.aBoolean248) {
					this.method629();
				}
				try {
					local29.method317();
				} catch (@Pc(52) Exception local52) {
				}
			}
		} catch (@Pc(54) RuntimeException local54) {
			signlink.reporterror("3208, " + -39300 + ", " + local54.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "k", descriptor = "(B)V")
	private void method661() {
		try {
			for (@Pc(9) int local9 = -1; local9 < this.anInt949; local9++) {
				@Pc(17) int local17;
				if (local9 == -1) {
					local17 = this.anInt948;
				} else {
					local17 = this.anIntArray245[local9];
				}
				@Pc(29) Class2_Sub1_Sub3_Sub1_Sub1 local29 = this.aClass2_Sub1_Sub3_Sub1_Sub1Array1[local17];
				if (local29 != null) {
					this.method703(1, local29);
				}
			}
		} catch (@Pc(43) RuntimeException local43) {
			signlink.reporterror("38852, " + 5 + ", " + local43.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIIZI)V")
	private void method662(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		try {
			this.aClass2_Sub1_Sub1_Sub4_6.method290(arg0, arg3);
			this.aClass2_Sub1_Sub1_Sub4_7.method290(arg0 + arg4 - 16, arg3);
			Class2_Sub1_Sub1.method278(this.aByte62, 16, arg0 + 16, arg3, arg4 - 32, this.anInt855);
			@Pc(45) int local45 = (arg4 - 32) * arg4 / arg1;
			if (local45 < 8) {
				local45 = 8;
			}
			@Pc(62) int local62 = (arg4 - local45 - 32) * arg2 / (arg1 - arg4);
			Class2_Sub1_Sub1.method278(this.aByte62, 16, arg0 + local62 + 16, arg3, local45, this.anInt1071);
			Class2_Sub1_Sub1.method283(local45, this.anInt961, arg0 + local62 + 16, arg3);
			Class2_Sub1_Sub1.method283(local45, this.anInt961, arg0 + local62 + 16, arg3 + 1);
			Class2_Sub1_Sub1.method281(arg0 + local62 + 16, 16, this.anInt961, arg3);
			Class2_Sub1_Sub1.method281(arg0 + local62 + 17, 16, this.anInt961, arg3);
			Class2_Sub1_Sub1.method283(local45, this.anInt995, arg0 + local62 + 16, arg3 + 15);
			Class2_Sub1_Sub1.method283(local45 - 1, this.anInt995, arg0 + local62 + 17, arg3 + 14);
			Class2_Sub1_Sub1.method281(arg0 + local62 + local45 + 15, 16, this.anInt995, arg3);
			Class2_Sub1_Sub1.method281(arg0 + local62 + local45 + 14, 15, this.anInt995, arg3 + 1);
		} catch (@Pc(179) RuntimeException local179) {
			signlink.reporterror("33492, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + false + ", " + arg4 + ", " + local179.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(II)V")
	private void method663(@OriginalArg(1) int arg0) {
		try {
			@Pc(5) int[] local5 = this.aClass2_Sub1_Sub1_Sub2_9.anIntArray10;
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
						this.aClass29_1.method359(local5, local34, arg0, local36, local22);
					}
					if (arg0 < 3 && (this.aByteArrayArrayArray8[arg0 + 1][local36][local22] & 0x8) != 0) {
						this.aClass29_1.method359(local5, local34, arg0 + 1, local36, local22);
					}
					local34 += 4;
				}
			}
			local34 = ((int) (Math.random() * 20.0D) + 238 - 10 << 16) + ((int) (Math.random() * 20.0D) + 238 - 10 << 8) + (int) (Math.random() * 20.0D) + 238 - 10;
			local36 = (int) (Math.random() * 20.0D) + 238 - 10 << 16;
			this.aClass2_Sub1_Sub1_Sub2_9.method64(this.anInt1025);
			@Pc(147) int local147;
			for (@Pc(143) int local143 = 1; local143 < 103; local143++) {
				for (local147 = 1; local147 < 103; local147++) {
					if ((this.aByteArrayArrayArray8[arg0][local147][local143] & 0x18) == 0) {
						this.method680(local143, local147, local36, arg0, local34);
					}
					if (arg0 < 3 && (this.aByteArrayArrayArray8[arg0 + 1][local147][local143] & 0x8) != 0) {
						this.method680(local143, local147, local36, arg0 + 1, local34);
					}
				}
			}
			if (this.aClass20_17 != null) {
				this.aClass20_17.method230(this.anInt1025);
				Class2_Sub1_Sub1_Sub3.anIntArray59 = this.anIntArray231;
			}
			anInt922++;
			if (anInt922 > 89) {
				anInt922 = 0;
				this.aClass2_Sub1_Sub2_6.method83(108);
			}
			this.anInt960 = 0;
			for (local147 = 0; local147 < 104; local147++) {
				for (@Pc(243) int local243 = 0; local243 < 104; local243++) {
					@Pc(253) int local253 = this.aClass29_1.method353(this.anInt882, local147, local243);
					if (local253 != 0) {
						local253 = local253 >> 14 & 0x7FFF;
						@Pc(265) int local265 = Class33.method459(local253).anInt618;
						if (local265 >= 0) {
							@Pc(269) int local269 = local147;
							@Pc(271) int local271 = local243;
							if (local265 != 22 && local265 != 29 && local265 != 34 && local265 != 36 && local265 != 46 && local265 != 47 && local265 != 48) {
								@Pc(303) int[][] local303 = this.aClass12Array1[this.anInt882].anIntArrayArray3;
								for (@Pc(305) int local305 = 0; local305 < 10; local305++) {
									@Pc(312) int local312 = (int) (Math.random() * 4.0D);
									if (local312 == 0 && local269 > 0 && local269 > local147 - 3 && (local303[local269 - 1][local271] & 0x1280108) == 0) {
										local269--;
									}
									if (local312 == 1 && local269 < 103 && local269 < local147 + 3 && (local303[local269 + 1][local271] & 0x1280180) == 0) {
										local269++;
									}
									if (local312 == 2 && local271 > 0 && local271 > local243 - 3 && (local303[local269][local271 - 1] & 0x1280102) == 0) {
										local271--;
									}
									if (local312 == 3 && local271 < 103 && local271 < local243 + 3 && (local303[local269][local271 + 1] & 0x1280120) == 0) {
										local271++;
									}
								}
							}
							this.aClass2_Sub1_Sub1_Sub2Array6[this.anInt960] = this.aClass2_Sub1_Sub1_Sub2Array4[local265];
							this.anIntArray249[this.anInt960] = local269;
							this.anIntArray250[this.anInt960] = local271;
							this.anInt960++;
						}
					}
				}
			}
		} catch (@Pc(442) RuntimeException local442) {
			signlink.reporterror("41346, " + -938 + ", " + arg0 + ", " + local442.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIIIZII)V")
	private void method664(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		try {
			if (arg3 >= 1 && arg6 >= 1 && arg3 <= 102 && arg6 <= 102) {
				if (aBoolean272 && arg5 != this.anInt882) {
					return;
				}
				@Pc(29) int local29 = 0;
				if (arg1 == 0) {
					local29 = this.aClass29_1.method350(arg5, arg3, arg6);
				}
				if (arg1 == 1) {
					local29 = this.aClass29_1.method351(arg6, arg5, arg3);
				}
				if (arg1 == 2) {
					local29 = this.aClass29_1.method352(arg5, arg3, arg6);
				}
				if (arg1 == 3) {
					local29 = this.aClass29_1.method353(arg5, arg3, arg6);
				}
				@Pc(85) int local85;
				if (local29 != 0) {
					local85 = this.aClass29_1.method354(arg5, arg3, arg6, local29);
					@Pc(91) int local91 = local29 >> 14 & 0x7FFF;
					@Pc(95) int local95 = local85 & 0x1F;
					@Pc(99) int local99 = local85 >> 6;
					@Pc(111) Class33 local111;
					if (arg1 == 0) {
						this.aClass29_1.method341(arg6, arg5, arg3);
						local111 = Class33.method459(local91);
						if (local111.aBoolean175) {
							this.aClass12Array1[arg5].method190(local99, arg6, local111.aBoolean181, arg3, local95);
						}
					}
					if (arg1 == 1) {
						this.aClass29_1.method342(arg6, arg5, arg3);
					}
					if (arg1 == 2) {
						this.aClass29_1.method343(arg3, arg6, arg5);
						local111 = Class33.method459(local91);
						if (arg3 + local111.anInt609 > 103 || arg6 + local111.anInt609 > 103 || arg3 + local111.anInt617 > 103 || arg6 + local111.anInt617 > 103) {
							return;
						}
						if (local111.aBoolean175) {
							this.aClass12Array1[arg5].method191(arg3, local111.aBoolean181, local99, local111.anInt617, local111.anInt609, arg6);
						}
					}
					if (arg1 == 3) {
						this.aClass29_1.method344(arg6, 815, arg5, arg3);
						local111 = Class33.method459(local91);
						if (local111.aBoolean175 && local111.aBoolean173) {
							this.aClass12Array1[arg5].method193(arg3, arg6);
						}
					}
				}
				if (arg0 >= 0) {
					local85 = arg5;
					if (arg5 < 3 && (this.aByteArrayArrayArray8[1][arg3][arg6] & 0x2) == 2) {
						local85 = arg5 + 1;
					}
					Class42.method541(this.anIntArrayArrayArray8, arg2, this.aClass29_1, arg5, this.aClass12Array1[arg5], local85, arg3, arg6, arg4, arg0);
					return;
				}
			}
		} catch (@Pc(258) RuntimeException local258) {
			signlink.reporterror("31469, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + true + ", " + arg5 + ", " + arg6 + ", " + local258.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!WGFLNQLA;I)V")
	private void method665(@OriginalArg(0) Class2_Sub3 arg0) {
		try {
			@Pc(1) int local1 = 0;
			@Pc(3) int local3 = -1;
			@Pc(5) int local5 = 0;
			@Pc(7) int local7 = 0;
			if (arg0.anInt763 == 0) {
				local1 = this.aClass29_1.method350(arg0.anInt762, arg0.anInt764, arg0.anInt765);
			}
			if (arg0.anInt763 == 1) {
				local1 = this.aClass29_1.method351(arg0.anInt765, arg0.anInt762, arg0.anInt764);
			}
			if (arg0.anInt763 == 2) {
				local1 = this.aClass29_1.method352(arg0.anInt762, arg0.anInt764, arg0.anInt765);
			}
			if (arg0.anInt763 == 3) {
				local1 = this.aClass29_1.method353(arg0.anInt762, arg0.anInt764, arg0.anInt765);
			}
			if (local1 != 0) {
				@Pc(76) int local76 = this.aClass29_1.method354(arg0.anInt762, arg0.anInt764, arg0.anInt765, local1);
				local3 = local1 >> 14 & 0x7FFF;
				local5 = local76 & 0x1F;
				local7 = local76 >> 6;
			}
			arg0.anInt756 = local3;
			arg0.anInt758 = local5;
			arg0.anInt757 = local7;
		} catch (@Pc(103) RuntimeException local103) {
			signlink.reporterror("73018, " + arg0 + ", " + -521 + ", " + local103.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(BZ)V")
	private void method666(@OriginalArg(1) boolean arg0) {
		try {
			for (@Pc(1) int local1 = 0; local1 < this.anInt866; local1++) {
				@Pc(11) Class2_Sub1_Sub3_Sub1_Sub2 local11 = this.aClass2_Sub1_Sub3_Sub1_Sub2Array1[this.anIntArray215[local1]];
				@Pc(20) int local20 = (this.anIntArray215[local1] << 14) + 536870912;
				if (local11 != null && local11.method492() && local11.aClass48_2.aBoolean217 == arg0 && local11.aClass48_2.method567()) {
					@Pc(41) int local41 = local11.anInt680 >> 7;
					@Pc(46) int local46 = local11.anInt681 >> 7;
					if (local41 >= 0 && local41 < 104 && local46 >= 0 && local46 < 104) {
						if (local11.anInt659 == 1 && (local11.anInt680 & 0x7F) == 64 && (local11.anInt681 & 0x7F) == 64) {
							if (this.anIntArrayArray24[local41][local46] == this.anInt886) {
								continue;
							}
							this.anIntArrayArray24[local41][local46] = this.anInt886;
						}
						if (!local11.aClass48_2.aBoolean219) {
							local20 += Integer.MIN_VALUE;
						}
						this.aClass29_1.method335(local11, this.anInt882, local11.anInt682, local11.aBoolean201, local20, this.method622(local11.anInt681, this.anInt882, local11.anInt680), (local11.anInt659 - 1) * 64 + 60, local11.anInt681, local11.anInt680);
					}
				}
			}
		} catch (@Pc(144) RuntimeException local144) {
			signlink.reporterror("75329, " + 109 + ", " + arg0 + ", " + local144.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIILclient!KZCOXKKW;)V")
	private void method667(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class2_Sub1_Sub3_Sub1_Sub1 arg3) {
		try {
			if (arg3 != aClass2_Sub1_Sub3_Sub1_Sub1_1 && this.anInt1004 < 400) {
				@Pc(42) String local42;
				if (arg3.anInt361 == 0) {
					local42 = arg3.aString5 + method656(arg3.anInt355, aClass2_Sub1_Sub3_Sub1_Sub1_1.anInt355) + " (level-" + arg3.anInt355 + ")";
				} else {
					local42 = arg3.aString5 + " (skill-" + arg3.anInt361 + ")";
				}
				@Pc(172) int local172;
				if (this.anInt955 == 1) {
					this.aStringArray8[this.anInt1004] = "Use " + this.aString25 + " with @whi@" + local42;
					this.anIntArray222[this.anInt1004] = 226;
					this.anIntArray223[this.anInt1004] = arg0;
					this.anIntArray220[this.anInt1004] = arg2;
					this.anIntArray221[this.anInt1004] = arg1;
					this.anInt1004++;
				} else if (this.anInt1000 != 1) {
					for (local172 = 4; local172 >= 0; local172--) {
						if (this.aStringArray10[local172] != null) {
							this.aStringArray8[this.anInt1004] = this.aStringArray10[local172] + " @whi@" + local42;
							@Pc(199) short local199 = 0;
							if (this.aStringArray10[local172].equalsIgnoreCase("attack")) {
								if (arg3.anInt355 > aClass2_Sub1_Sub3_Sub1_Sub1_1.anInt355) {
									local199 = 2000;
								}
								if (aClass2_Sub1_Sub3_Sub1_Sub1_1.anInt351 != 0 && arg3.anInt351 != 0) {
									if (aClass2_Sub1_Sub3_Sub1_Sub1_1.anInt351 == arg3.anInt351) {
										local199 = 2000;
									} else {
										local199 = 0;
									}
								}
							} else if (this.aBooleanArray11[local172]) {
								local199 = 2000;
							}
							if (local172 == 0) {
								this.anIntArray222[this.anInt1004] = local199 + 595;
							}
							if (local172 == 1) {
								this.anIntArray222[this.anInt1004] = local199 + 827;
							}
							if (local172 == 2) {
								this.anIntArray222[this.anInt1004] = local199 + 439;
							}
							if (local172 == 3) {
								this.anIntArray222[this.anInt1004] = local199 + 273;
							}
							if (local172 == 4) {
								this.anIntArray222[this.anInt1004] = local199 + 996;
							}
							this.anIntArray223[this.anInt1004] = arg0;
							this.anIntArray220[this.anInt1004] = arg2;
							this.anIntArray221[this.anInt1004] = arg1;
							this.anInt1004++;
						}
					}
				} else if ((this.anInt1002 & 0x8) == 8) {
					this.aStringArray8[this.anInt1004] = this.aString28 + " @whi@" + local42;
					this.anIntArray222[this.anInt1004] = 280;
					this.anIntArray223[this.anInt1004] = arg0;
					this.anIntArray220[this.anInt1004] = arg2;
					this.anIntArray221[this.anInt1004] = arg1;
					this.anInt1004++;
				}
				for (local172 = 0; local172 < this.anInt1004; local172++) {
					if (this.anIntArray222[local172] == 46) {
						this.aStringArray8[local172] = "Walk here @whi@" + local42;
						return;
					}
				}
			}
		} catch (@Pc(349) RuntimeException local349) {
			signlink.reporterror("97847, " + 2 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local349.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "f", descriptor = "(II)V")
	private void method668(@OriginalArg(1) int arg0) {
		try {
			if (arg0 >= 0) {
				@Pc(9) int local9 = this.anIntArray220[arg0];
				@Pc(14) int local14 = this.anIntArray221[arg0];
				@Pc(19) int local19 = this.anIntArray222[arg0];
				@Pc(24) int local24 = this.anIntArray223[arg0];
				if (local19 >= 2000) {
					local19 -= 2000;
				}
				if (this.anInt912 != 0 && local19 != 1122) {
					this.anInt912 = 0;
					this.aBoolean241 = true;
				}
				@Pc(70) boolean local70;
				if (local19 == 864) {
					local70 = this.method659(0, 0, 0, local9, aClass2_Sub1_Sub3_Sub1_Sub1_1.anIntArray166[0], 2, 0, aClass2_Sub1_Sub3_Sub1_Sub1_1.anIntArray165[0], false, 0, local14);
					if (!local70) {
						this.method659(0, 1, 1, local9, aClass2_Sub1_Sub3_Sub1_Sub1_1.anIntArray166[0], 2, 0, aClass2_Sub1_Sub3_Sub1_Sub1_1.anIntArray165[0], false, 0, local14);
					}
					this.anInt989 = super.anInt844;
					this.anInt990 = super.anInt845;
					this.anInt992 = 2;
					this.anInt991 = 0;
					anInt997++;
					if (anInt997 >= 54) {
						this.aClass2_Sub1_Sub2_6.method83(35);
						this.aClass2_Sub1_Sub2_6.method87(13984990);
						anInt997 = 0;
					}
					this.aClass2_Sub1_Sub2_6.method83(207);
					this.aClass2_Sub1_Sub2_6.method117(local24, 26);
					this.aClass2_Sub1_Sub2_6.method119(local9 + this.anInt951);
					this.aClass2_Sub1_Sub2_6.method119(local14 + this.anInt952);
				}
				if (local19 == 19) {
					this.aClass2_Sub1_Sub2_6.method83(221);
					this.aClass2_Sub1_Sub2_6.method85(local24);
					this.aClass2_Sub1_Sub2_6.method119(local9);
					this.aClass2_Sub1_Sub2_6.method117(local14, 26);
					this.anInt861 = 0;
					this.anInt862 = local14;
					this.anInt863 = local9;
					this.anInt864 = 2;
					if (Class31.method403(local14).anInt494 == this.anInt903) {
						this.anInt864 = 1;
					}
					if (Class31.method403(local14).anInt494 == this.anInt871) {
						this.anInt864 = 3;
					}
				}
				@Pc(211) Class2_Sub1_Sub3_Sub1_Sub2 local211;
				if (local19 == 669) {
					local211 = this.aClass2_Sub1_Sub3_Sub1_Sub2Array1[local24];
					if (local211 != null) {
						this.method659(0, 1, 1, local211.anIntArray165[0], aClass2_Sub1_Sub3_Sub1_Sub1_1.anIntArray166[0], 2, 0, aClass2_Sub1_Sub3_Sub1_Sub1_1.anIntArray165[0], false, 0, local211.anIntArray166[0]);
						this.anInt989 = super.anInt844;
						this.anInt990 = super.anInt845;
						this.anInt992 = 2;
						this.anInt991 = 0;
						this.aClass2_Sub1_Sub2_6.method83(188);
						this.aClass2_Sub1_Sub2_6.method85(this.anInt956);
						this.aClass2_Sub1_Sub2_6.method118(local24);
						this.aClass2_Sub1_Sub2_6.method119(this.anInt958);
						this.aClass2_Sub1_Sub2_6.method117(this.anInt957, 26);
					}
				}
				if (local19 == 533) {
					local211 = this.aClass2_Sub1_Sub3_Sub1_Sub2Array1[local24];
					if (local211 != null) {
						this.method659(0, 1, 1, local211.anIntArray165[0], aClass2_Sub1_Sub3_Sub1_Sub1_1.anIntArray166[0], 2, 0, aClass2_Sub1_Sub3_Sub1_Sub1_1.anIntArray165[0], false, 0, local211.anIntArray166[0]);
						this.anInt989 = super.anInt844;
						this.anInt990 = super.anInt845;
						this.anInt992 = 2;
						this.anInt991 = 0;
						this.aClass2_Sub1_Sub2_6.method83(213);
						this.aClass2_Sub1_Sub2_6.method118(local24);
						this.aClass2_Sub1_Sub2_6.method119(this.anInt1001);
					}
				}
				if (local19 == 46) {
					if (this.aBoolean262) {
						this.aClass29_1.method362(local14 - 4, local9 - 4);
					} else {
						this.aClass29_1.method362(super.anInt845 - 4, super.anInt844 - 4);
					}
				}
				if (local19 == 808) {
					local70 = this.method659(0, 0, 0, local9, aClass2_Sub1_Sub3_Sub1_Sub1_1.anIntArray166[0], 2, 0, aClass2_Sub1_Sub3_Sub1_Sub1_1.anIntArray165[0], false, 0, local14);
					if (!local70) {
						this.method659(0, 1, 1, local9, aClass2_Sub1_Sub3_Sub1_Sub1_1.anIntArray166[0], 2, 0, aClass2_Sub1_Sub3_Sub1_Sub1_1.anIntArray165[0], false, 0, local14);
					}
					this.anInt989 = super.anInt844;
					this.anInt990 = super.anInt845;
					this.anInt992 = 2;
					this.anInt991 = 0;
					if ((local9 & 0x3) == 0) {
						anInt993++;
					}
					if (anInt993 >= 119) {
						this.aClass2_Sub1_Sub2_6.method83(123);
						this.aClass2_Sub1_Sub2_6.method85(58942);
						anInt993 = 0;
					}
					this.aClass2_Sub1_Sub2_6.method83(29);
					this.aClass2_Sub1_Sub2_6.method119(local24);
					this.aClass2_Sub1_Sub2_6.method85(local9 + this.anInt951);
					this.aClass2_Sub1_Sub2_6.method118(local14 + this.anInt952);
				}
				if (local19 == 419) {
					this.method616(this.anInt928);
					this.anInt928 = -1;
					this.aBoolean241 = true;
				}
				if (local19 == 824) {
					this.method596(local24, local14, local9);
					this.aClass2_Sub1_Sub2_6.method83(163);
					this.aClass2_Sub1_Sub2_6.method85(local14 + this.anInt952);
					this.aClass2_Sub1_Sub2_6.method117(local24 >> 14 & 0x7FFF, 26);
					this.aClass2_Sub1_Sub2_6.method119(local9 + this.anInt951);
				}
				if (local19 == 410) {
					local211 = this.aClass2_Sub1_Sub3_Sub1_Sub2Array1[local24];
					if (local211 != null) {
						this.method659(0, 1, 1, local211.anIntArray165[0], aClass2_Sub1_Sub3_Sub1_Sub1_1.anIntArray166[0], 2, 0, aClass2_Sub1_Sub3_Sub1_Sub1_1.anIntArray165[0], false, 0, local211.anIntArray166[0]);
						this.anInt989 = super.anInt844;
						this.anInt990 = super.anInt845;
						this.anInt992 = 2;
						this.anInt991 = 0;
						if ((local24 & 0x3) == 0) {
							anInt1022++;
						}
						if (anInt1022 >= 95) {
							this.aClass2_Sub1_Sub2_6.method83(61);
							this.aClass2_Sub1_Sub2_6.method87(15541804);
							anInt1022 = 0;
						}
						this.aClass2_Sub1_Sub2_6.method83(0);
						this.aClass2_Sub1_Sub2_6.method85(local24);
					}
				}
				if (local19 == 735) {
					local70 = this.method659(0, 0, 0, local9, aClass2_Sub1_Sub3_Sub1_Sub1_1.anIntArray166[0], 2, 0, aClass2_Sub1_Sub3_Sub1_Sub1_1.anIntArray165[0], false, 0, local14);
					if (!local70) {
						this.method659(0, 1, 1, local9, aClass2_Sub1_Sub3_Sub1_Sub1_1.anIntArray166[0], 2, 0, aClass2_Sub1_Sub3_Sub1_Sub1_1.anIntArray165[0], false, 0, local14);
					}
					this.anInt989 = super.anInt844;
					this.anInt990 = super.anInt845;
					this.anInt992 = 2;
					this.anInt991 = 0;
					this.aClass2_Sub1_Sub2_6.method83(129);
					this.aClass2_Sub1_Sub2_6.method118(local24);
					this.aClass2_Sub1_Sub2_6.method85(local14 + this.anInt952);
					this.aClass2_Sub1_Sub2_6.method85(this.anInt1001);
					this.aClass2_Sub1_Sub2_6.method85(local9 + this.anInt951);
				}
				@Pc(744) int local744;
				@Pc(726) Class31 local726;
				if (local19 == 338) {
					this.aClass2_Sub1_Sub2_6.method83(190);
					this.aClass2_Sub1_Sub2_6.method85(local14);
					local726 = Class31.method403(local14);
					if (local726.anIntArrayArray14 != null && local726.anIntArrayArray14[0][0] == 5) {
						local744 = local726.anIntArrayArray14[0][1];
						if (this.anIntArray225[local744] != local726.anIntArray105[0]) {
							this.anIntArray225[local744] = local726.anIntArray105[0];
							this.method634(local744);
							this.aBoolean233 = true;
						}
					}
				}
				@Pc(800) String local800;
				@Pc(774) Class32 local774;
				if (local19 == 1455) {
					local774 = Class32.method412(local24);
					@Pc(777) Class31 local777 = Class31.method403(local14);
					if (local777 != null && local777.anIntArray106[local9] >= 100000) {
						local800 = local777.anIntArray106[local9] + " x " + local774.aString11;
					} else if (local774.aByteArray12 == null) {
						local800 = "It's a " + local774.aString11 + ".";
					} else {
						local800 = new String(local774.aByteArray12);
					}
					this.method724("", local800, 0);
				}
				@Pc(851) String local851;
				if (local19 == 1456) {
					@Pc(839) int local839 = local24 >> 14 & 0x7FFF;
					@Pc(842) Class33 local842 = Class33.method459(local839);
					if (local842.aByteArray13 == null) {
						local851 = "It's a " + local842.aString12 + ".";
					} else {
						local851 = new String(local842.aByteArray13);
					}
					this.method724("", local851, 0);
				}
				if (local19 == 8) {
					this.method636();
				}
				@Pc(884) Class2_Sub1_Sub3_Sub1_Sub1 local884;
				if (local19 == 226) {
					local884 = this.aClass2_Sub1_Sub3_Sub1_Sub1Array1[local24];
					if (local884 != null) {
						this.method659(0, 1, 1, local884.anIntArray165[0], aClass2_Sub1_Sub3_Sub1_Sub1_1.anIntArray166[0], 2, 0, aClass2_Sub1_Sub3_Sub1_Sub1_1.anIntArray165[0], false, 0, local884.anIntArray166[0]);
						this.anInt989 = super.anInt844;
						this.anInt990 = super.anInt845;
						this.anInt992 = 2;
						this.anInt991 = 0;
						this.aClass2_Sub1_Sub2_6.method83(39);
						this.aClass2_Sub1_Sub2_6.method85(this.anInt956);
						this.aClass2_Sub1_Sub2_6.method117(this.anInt957, 26);
						this.aClass2_Sub1_Sub2_6.method117(this.anInt958, 26);
						this.aClass2_Sub1_Sub2_6.method117(local24, 26);
					}
				}
				@Pc(979) int local979;
				@Pc(962) String local962;
				@Pc(977) long local977;
				if (local19 == 334) {
					local962 = this.aStringArray8[arg0];
					local744 = local962.indexOf("@whi@");
					if (local744 != -1) {
						local977 = Class34.method478(local962.substring(local744 + 5).trim());
						local979 = -1;
						for (@Pc(981) int local981 = 0; local981 < this.anInt1013; local981++) {
							if (this.aLongArray3[local981] == local977) {
								local979 = local981;
								break;
							}
						}
						if (local979 != -1 && this.anIntArray252[local979] > 0) {
							this.aBoolean241 = true;
							this.anInt912 = 0;
							this.aBoolean237 = true;
							this.aString31 = "";
							this.anInt902 = 3;
							this.aLong31 = this.aLongArray3[local979];
							this.aString30 = "Enter message to send to " + this.aStringArray11[local979];
						}
					}
				}
				if (local19 == 1020) {
					local211 = this.aClass2_Sub1_Sub3_Sub1_Sub2Array1[local24];
					if (local211 != null) {
						@Pc(1053) Class48 local1053 = local211.aClass48_2;
						if (local1053.anIntArray195 != null) {
							local1053 = local1053.method570();
						}
						if (local1053 != null) {
							if (local1053.aByteArray20 == null) {
								local851 = "It's a " + local1053.aString16 + ".";
							} else {
								local851 = new String(local1053.aByteArray20);
							}
							this.method724("", local851, 0);
						}
					}
				}
				if (local19 == 280) {
					local884 = this.aClass2_Sub1_Sub3_Sub1_Sub1Array1[local24];
					if (local884 != null) {
						this.method659(0, 1, 1, local884.anIntArray165[0], aClass2_Sub1_Sub3_Sub1_Sub1_1.anIntArray166[0], 2, 0, aClass2_Sub1_Sub3_Sub1_Sub1_1.anIntArray165[0], false, 0, local884.anIntArray166[0]);
						this.anInt989 = super.anInt844;
						this.anInt990 = super.anInt845;
						this.anInt992 = 2;
						this.anInt991 = 0;
						this.aClass2_Sub1_Sub2_6.method83(68);
						this.aClass2_Sub1_Sub2_6.method118(local24);
						this.aClass2_Sub1_Sub2_6.method117(this.anInt1001, 26);
					}
				}
				if (local19 == 764) {
					local211 = this.aClass2_Sub1_Sub3_Sub1_Sub2Array1[local24];
					if (local211 != null) {
						this.method659(0, 1, 1, local211.anIntArray165[0], aClass2_Sub1_Sub3_Sub1_Sub1_1.anIntArray166[0], 2, 0, aClass2_Sub1_Sub3_Sub1_Sub1_1.anIntArray165[0], false, 0, local211.anIntArray166[0]);
						this.anInt989 = super.anInt844;
						this.anInt990 = super.anInt845;
						this.anInt992 = 2;
						this.anInt991 = 0;
						this.aClass2_Sub1_Sub2_6.method83(193);
						this.aClass2_Sub1_Sub2_6.method117(local24, 26);
					}
				}
				if (local19 == 196) {
					local70 = this.method659(0, 0, 0, local9, aClass2_Sub1_Sub3_Sub1_Sub1_1.anIntArray166[0], 2, 0, aClass2_Sub1_Sub3_Sub1_Sub1_1.anIntArray165[0], false, 0, local14);
					if (!local70) {
						this.method659(0, 1, 1, local9, aClass2_Sub1_Sub3_Sub1_Sub1_1.anIntArray166[0], 2, 0, aClass2_Sub1_Sub3_Sub1_Sub1_1.anIntArray165[0], false, 0, local14);
					}
					this.anInt989 = super.anInt844;
					this.anInt990 = super.anInt845;
					this.anInt992 = 2;
					this.anInt991 = 0;
					this.aClass2_Sub1_Sub2_6.method83(90);
					this.aClass2_Sub1_Sub2_6.method118(local14 + this.anInt952);
					this.aClass2_Sub1_Sub2_6.method119(this.anInt958);
					this.aClass2_Sub1_Sub2_6.method119(local24);
					this.aClass2_Sub1_Sub2_6.method119(this.anInt957);
					this.aClass2_Sub1_Sub2_6.method85(local9 + this.anInt951);
					this.aClass2_Sub1_Sub2_6.method85(this.anInt956);
				}
				if (local19 == 595) {
					local884 = this.aClass2_Sub1_Sub3_Sub1_Sub1Array1[local24];
					if (local884 != null) {
						this.method659(0, 1, 1, local884.anIntArray165[0], aClass2_Sub1_Sub3_Sub1_Sub1_1.anIntArray166[0], 2, 0, aClass2_Sub1_Sub3_Sub1_Sub1_1.anIntArray165[0], false, 0, local884.anIntArray166[0]);
						this.anInt989 = super.anInt844;
						this.anInt990 = super.anInt845;
						this.anInt992 = 2;
						this.anInt991 = 0;
						this.aClass2_Sub1_Sub2_6.method83(72);
						this.aClass2_Sub1_Sub2_6.method118(local24);
					}
				}
				if (local19 == 638) {
					this.anInt955 = 1;
					this.anInt956 = local9;
					this.anInt957 = local14;
					this.anInt958 = local24;
					this.aString25 = String.valueOf(Class32.method412(local24).aString11);
					this.anInt1000 = 0;
					this.aBoolean233 = true;
				} else {
					if (local19 == 15) {
						local211 = this.aClass2_Sub1_Sub3_Sub1_Sub2Array1[local24];
						if (local211 != null) {
							this.method659(0, 1, 1, local211.anIntArray165[0], aClass2_Sub1_Sub3_Sub1_Sub1_1.anIntArray166[0], 2, 0, aClass2_Sub1_Sub3_Sub1_Sub1_1.anIntArray165[0], false, 0, local211.anIntArray166[0]);
							this.anInt989 = super.anInt844;
							this.anInt990 = super.anInt845;
							this.anInt992 = 2;
							this.anInt991 = 0;
							this.aClass2_Sub1_Sub2_6.method83(112);
							this.aClass2_Sub1_Sub2_6.method85(local24);
						}
					}
					if (local19 == 273) {
						local884 = this.aClass2_Sub1_Sub3_Sub1_Sub1Array1[local24];
						if (local884 != null) {
							this.method659(0, 1, 1, local884.anIntArray165[0], aClass2_Sub1_Sub3_Sub1_Sub1_1.anIntArray166[0], 2, 0, aClass2_Sub1_Sub3_Sub1_Sub1_1.anIntArray165[0], false, 0, local884.anIntArray166[0]);
							this.anInt989 = super.anInt844;
							this.anInt990 = super.anInt845;
							this.anInt992 = 2;
							this.anInt991 = 0;
							this.aClass2_Sub1_Sub2_6.method83(181);
							this.aClass2_Sub1_Sub2_6.method119(local24);
						}
					}
					if (local19 == 936) {
						this.aClass2_Sub1_Sub2_6.method83(55);
						this.aClass2_Sub1_Sub2_6.method117(local9, 26);
						this.aClass2_Sub1_Sub2_6.method85(local24);
						this.aClass2_Sub1_Sub2_6.method118(local14);
						this.anInt861 = 0;
						this.anInt862 = local14;
						this.anInt863 = local9;
						this.anInt864 = 2;
						if (Class31.method403(local14).anInt494 == this.anInt903) {
							this.anInt864 = 1;
						}
						if (Class31.method403(local14).anInt494 == this.anInt871) {
							this.anInt864 = 3;
						}
					}
					if (local19 == 414) {
						this.aClass2_Sub1_Sub2_6.method83(51);
						this.aClass2_Sub1_Sub2_6.method117(local9, 26);
						this.aClass2_Sub1_Sub2_6.method85(local24);
						this.aClass2_Sub1_Sub2_6.method117(local14, 26);
						this.anInt861 = 0;
						this.anInt862 = local14;
						this.anInt863 = local9;
						this.anInt864 = 2;
						if (Class31.method403(local14).anInt494 == this.anInt903) {
							this.anInt864 = 1;
						}
						if (Class31.method403(local14).anInt494 == this.anInt871) {
							this.anInt864 = 3;
						}
					}
					if (local19 == 653 && this.method596(local24, local14, local9)) {
						this.aClass2_Sub1_Sub2_6.method83(82);
						this.aClass2_Sub1_Sub2_6.method118(local14 + this.anInt952);
						this.aClass2_Sub1_Sub2_6.method119(local24 >> 14 & 0x7FFF);
						this.aClass2_Sub1_Sub2_6.method85(this.anInt958);
						this.aClass2_Sub1_Sub2_6.method118(local9 + this.anInt951);
						this.aClass2_Sub1_Sub2_6.method118(this.anInt956);
						this.aClass2_Sub1_Sub2_6.method119(this.anInt957);
					}
					if (local19 == 66) {
						anInt943++;
						if (anInt943 >= 72) {
							this.aClass2_Sub1_Sub2_6.method83(54);
							anInt943 = 0;
						}
						this.method596(local24, local14, local9);
						this.aClass2_Sub1_Sub2_6.method83(201);
						this.aClass2_Sub1_Sub2_6.method119(local9 + this.anInt951);
						this.aClass2_Sub1_Sub2_6.method117(local24 >> 14 & 0x7FFF, 26);
						this.aClass2_Sub1_Sub2_6.method117(local14 + this.anInt952, 26);
					}
					if (local19 == 816) {
						local211 = this.aClass2_Sub1_Sub3_Sub1_Sub2Array1[local24];
						if (local211 != null) {
							this.method659(0, 1, 1, local211.anIntArray165[0], aClass2_Sub1_Sub3_Sub1_Sub1_1.anIntArray166[0], 2, 0, aClass2_Sub1_Sub3_Sub1_Sub1_1.anIntArray165[0], false, 0, local211.anIntArray166[0]);
							this.anInt989 = super.anInt844;
							this.anInt990 = super.anInt845;
							this.anInt992 = 2;
							this.anInt991 = 0;
							this.aClass2_Sub1_Sub2_6.method83(2);
							this.aClass2_Sub1_Sub2_6.method85(local24);
						}
					}
					if (local19 == 609) {
						this.aClass2_Sub1_Sub2_6.method83(190);
						this.aClass2_Sub1_Sub2_6.method85(local14);
						local726 = Class31.method403(local14);
						if (local726.anIntArrayArray14 != null && local726.anIntArrayArray14[0][0] == 5) {
							local744 = local726.anIntArrayArray14[0][1];
							this.anIntArray225[local744] = 1 - this.anIntArray225[local744];
							this.method634(local744);
							this.aBoolean233 = true;
						}
					}
					if (local19 == 160) {
						local962 = this.aStringArray8[arg0];
						local744 = local962.indexOf("@whi@");
						if (local744 != -1) {
							if (this.anInt903 == -1) {
								this.method636();
								this.aString19 = local962.substring(local744 + 5).trim();
								this.aBoolean234 = false;
								this.anInt1021 = this.anInt903 = Class31.anInt489;
							} else {
								this.method724("", "Please close the interface you have open before using 'report abuse'", 0);
							}
						}
					}
					if (local19 == 424) {
						anInt999++;
						if (anInt999 >= 144) {
							this.aClass2_Sub1_Sub2_6.method83(235);
							this.aClass2_Sub1_Sub2_6.method88(0);
							anInt999 = 0;
						}
						this.aClass2_Sub1_Sub2_6.method83(243);
						this.aClass2_Sub1_Sub2_6.method117(local9, 26);
						this.aClass2_Sub1_Sub2_6.method85(local14);
						this.aClass2_Sub1_Sub2_6.method117(local24, 26);
						this.anInt861 = 0;
						this.anInt862 = local14;
						this.anInt863 = local9;
						this.anInt864 = 2;
						if (Class31.method403(local14).anInt494 == this.anInt903) {
							this.anInt864 = 1;
						}
						if (Class31.method403(local14).anInt494 == this.anInt871) {
							this.anInt864 = 3;
						}
					}
					if (local19 == 339) {
						this.aClass2_Sub1_Sub2_6.method83(140);
						this.aClass2_Sub1_Sub2_6.method118(local14);
						this.aClass2_Sub1_Sub2_6.method117(local9, 26);
						this.aClass2_Sub1_Sub2_6.method119(local24);
						this.anInt861 = 0;
						this.anInt862 = local14;
						this.anInt863 = local9;
						this.anInt864 = 2;
						if (Class31.method403(local14).anInt494 == this.anInt903) {
							this.anInt864 = 1;
						}
						if (Class31.method403(local14).anInt494 == this.anInt871) {
							this.anInt864 = 3;
						}
					}
					if (local19 == 242) {
						anInt1065 += local14;
						if (anInt1065 >= 146) {
							this.aClass2_Sub1_Sub2_6.method83(49);
							anInt1065 = 0;
						}
						this.aClass2_Sub1_Sub2_6.method83(208);
						this.aClass2_Sub1_Sub2_6.method117(local14, 26);
						this.aClass2_Sub1_Sub2_6.method117(local9, 26);
						this.aClass2_Sub1_Sub2_6.method119(local24);
						this.anInt861 = 0;
						this.anInt862 = local14;
						this.anInt863 = local9;
						this.anInt864 = 2;
						if (Class31.method403(local14).anInt494 == this.anInt903) {
							this.anInt864 = 1;
						}
						if (Class31.method403(local14).anInt494 == this.anInt871) {
							this.anInt864 = 3;
						}
					}
					if (local19 == 51) {
						anInt881++;
						if (anInt881 >= 98) {
							this.aClass2_Sub1_Sub2_6.method83(52);
							anInt881 = 0;
						}
						this.method596(local24, local14, local9);
						this.aClass2_Sub1_Sub2_6.method83(1);
						this.aClass2_Sub1_Sub2_6.method118(local24 >> 14 & 0x7FFF);
						this.aClass2_Sub1_Sub2_6.method85(local14 + this.anInt952);
						this.aClass2_Sub1_Sub2_6.method85(local9 + this.anInt951);
					}
					if (local19 == 509) {
						this.aClass2_Sub1_Sub2_6.method83(78);
						this.aClass2_Sub1_Sub2_6.method118(local14);
						this.aClass2_Sub1_Sub2_6.method117(local9, 26);
						this.aClass2_Sub1_Sub2_6.method119(local24);
						this.anInt861 = 0;
						this.anInt862 = local14;
						this.anInt863 = local9;
						this.anInt864 = 2;
						if (Class31.method403(local14).anInt494 == this.anInt903) {
							this.anInt864 = 1;
						}
						if (Class31.method403(local14).anInt494 == this.anInt871) {
							this.anInt864 = 3;
						}
					}
					if (local19 == 439) {
						local884 = this.aClass2_Sub1_Sub3_Sub1_Sub1Array1[local24];
						if (local884 != null) {
							this.method659(0, 1, 1, local884.anIntArray165[0], aClass2_Sub1_Sub3_Sub1_Sub1_1.anIntArray166[0], 2, 0, aClass2_Sub1_Sub3_Sub1_Sub1_1.anIntArray165[0], false, 0, local884.anIntArray166[0]);
							this.anInt989 = super.anInt844;
							this.anInt990 = super.anInt845;
							this.anInt992 = 2;
							this.anInt991 = 0;
							this.aClass2_Sub1_Sub2_6.method83(71);
							this.aClass2_Sub1_Sub2_6.method118(local24);
						}
					}
					if (local19 == 1359) {
						this.method596(local24, local14, local9);
						this.aClass2_Sub1_Sub2_6.method83(22);
						this.aClass2_Sub1_Sub2_6.method117(local24 >> 14 & 0x7FFF, 26);
						this.aClass2_Sub1_Sub2_6.method117(local9 + this.anInt951, 26);
						this.aClass2_Sub1_Sub2_6.method85(local14 + this.anInt952);
					}
					if (local19 == 654) {
						local726 = Class31.method403(local14);
						this.anInt1000 = 1;
						this.anInt1001 = local14;
						this.anInt1002 = local726.anInt506;
						this.anInt955 = 0;
						this.aBoolean233 = true;
						local800 = local726.aString10;
						if (local800.indexOf(" ") != -1) {
							local800 = local800.substring(0, local800.indexOf(" "));
						}
						local851 = local726.aString10;
						if (local851.indexOf(" ") != -1) {
							local851 = local851.substring(local851.indexOf(" ") + 1);
						}
						this.aString28 = local800 + " " + local726.aString8 + " " + local851;
						if (this.anInt1002 == 16) {
							this.aBoolean233 = true;
							this.anInt1064 = 3;
							this.aBoolean244 = true;
						}
					} else {
						if (local19 == 153) {
							this.aClass2_Sub1_Sub2_6.method83(62);
							this.aClass2_Sub1_Sub2_6.method118(local14);
							this.aClass2_Sub1_Sub2_6.method85(local24);
							this.aClass2_Sub1_Sub2_6.method118(local9);
							this.aClass2_Sub1_Sub2_6.method119(this.anInt1001);
							this.anInt861 = 0;
							this.anInt862 = local14;
							this.anInt863 = local9;
							this.anInt864 = 2;
							if (Class31.method403(local14).anInt494 == this.anInt903) {
								this.anInt864 = 1;
							}
							if (Class31.method403(local14).anInt494 == this.anInt871) {
								this.anInt864 = 3;
							}
						}
						if (local19 == 106) {
							this.method596(local24, local14, local9);
							this.aClass2_Sub1_Sub2_6.method83(28);
							this.aClass2_Sub1_Sub2_6.method118(local14 + this.anInt952);
							this.aClass2_Sub1_Sub2_6.method118(local9 + this.anInt951);
							this.aClass2_Sub1_Sub2_6.method119(local24 >> 14 & 0x7FFF);
						}
						if (local19 == 656) {
							local70 = this.method659(0, 0, 0, local9, aClass2_Sub1_Sub3_Sub1_Sub1_1.anIntArray166[0], 2, 0, aClass2_Sub1_Sub3_Sub1_Sub1_1.anIntArray165[0], false, 0, local14);
							if (!local70) {
								this.method659(0, 1, 1, local9, aClass2_Sub1_Sub3_Sub1_Sub1_1.anIntArray166[0], 2, 0, aClass2_Sub1_Sub3_Sub1_Sub1_1.anIntArray165[0], false, 0, local14);
							}
							this.anInt989 = super.anInt844;
							this.anInt990 = super.anInt845;
							this.anInt992 = 2;
							this.anInt991 = 0;
							if ((local9 & 0x3) == 0) {
								anInt860++;
							}
							if (anInt860 >= 115) {
								this.aClass2_Sub1_Sub2_6.method83(159);
								this.aClass2_Sub1_Sub2_6.method87(8764737);
								anInt860 = 0;
							}
							this.aClass2_Sub1_Sub2_6.method83(7);
							this.aClass2_Sub1_Sub2_6.method119(local24);
							this.aClass2_Sub1_Sub2_6.method119(local14 + this.anInt952);
							this.aClass2_Sub1_Sub2_6.method119(local9 + this.anInt951);
						}
						if (local19 == 1686) {
							local774 = Class32.method412(local24);
							if (local774.aByteArray12 == null) {
								local800 = "It's a " + local774.aString11 + ".";
							} else {
								local800 = new String(local774.aByteArray12);
							}
							this.method724("", local800, 0);
						}
						if (local19 == 271) {
							local211 = this.aClass2_Sub1_Sub3_Sub1_Sub2Array1[local24];
							if (local211 != null) {
								this.method659(0, 1, 1, local211.anIntArray165[0], aClass2_Sub1_Sub3_Sub1_Sub1_1.anIntArray166[0], 2, 0, aClass2_Sub1_Sub3_Sub1_Sub1_1.anIntArray165[0], false, 0, local211.anIntArray166[0]);
								this.anInt989 = super.anInt844;
								this.anInt990 = super.anInt845;
								this.anInt992 = 2;
								this.anInt991 = 0;
								this.aClass2_Sub1_Sub2_6.method83(12);
								this.aClass2_Sub1_Sub2_6.method85(local24);
							}
						}
						if (local19 == 827) {
							local884 = this.aClass2_Sub1_Sub3_Sub1_Sub1Array1[local24];
							if (local884 != null) {
								this.method659(0, 1, 1, local884.anIntArray165[0], aClass2_Sub1_Sub3_Sub1_Sub1_1.anIntArray166[0], 2, 0, aClass2_Sub1_Sub3_Sub1_Sub1_1.anIntArray165[0], false, 0, local884.anIntArray166[0]);
								this.anInt989 = super.anInt844;
								this.anInt990 = super.anInt845;
								this.anInt992 = 2;
								this.anInt991 = 0;
								anInt887 += local24;
								if (anInt887 >= 63) {
									this.aClass2_Sub1_Sub2_6.method83(232);
									this.aClass2_Sub1_Sub2_6.method87(16325003);
									anInt887 = 0;
								}
								this.aClass2_Sub1_Sub2_6.method83(16);
								this.aClass2_Sub1_Sub2_6.method117(local24, 26);
							}
						}
						if (local19 == 887) {
							local726 = Class31.method403(local14);
							@Pc(2770) boolean local2770 = true;
							if (local726.anInt499 > 0) {
								local2770 = this.method641(local726);
							}
							if (local2770) {
								this.aClass2_Sub1_Sub2_6.method83(190);
								this.aClass2_Sub1_Sub2_6.method85(local14);
							}
						}
						if (local19 == 155) {
							this.aClass2_Sub1_Sub2_6.method83(150);
							this.aClass2_Sub1_Sub2_6.method85(local24);
							this.aClass2_Sub1_Sub2_6.method119(local14);
							this.aClass2_Sub1_Sub2_6.method118(local9);
							this.anInt861 = 0;
							this.anInt862 = local14;
							this.anInt863 = local9;
							this.anInt864 = 2;
							if (Class31.method403(local14).anInt494 == this.anInt903) {
								this.anInt864 = 1;
							}
							if (Class31.method403(local14).anInt494 == this.anInt871) {
								this.anInt864 = 3;
							}
						}
						if (local19 == 941) {
							local70 = this.method659(0, 0, 0, local9, aClass2_Sub1_Sub3_Sub1_Sub1_1.anIntArray166[0], 2, 0, aClass2_Sub1_Sub3_Sub1_Sub1_1.anIntArray165[0], false, 0, local14);
							if (!local70) {
								this.method659(0, 1, 1, local9, aClass2_Sub1_Sub3_Sub1_Sub1_1.anIntArray166[0], 2, 0, aClass2_Sub1_Sub3_Sub1_Sub1_1.anIntArray165[0], false, 0, local14);
							}
							this.anInt989 = super.anInt844;
							this.anInt990 = super.anInt845;
							this.anInt992 = 2;
							this.anInt991 = 0;
							this.aClass2_Sub1_Sub2_6.method83(196);
							this.aClass2_Sub1_Sub2_6.method119(local9 + this.anInt951);
							this.aClass2_Sub1_Sub2_6.method119(local24);
							this.aClass2_Sub1_Sub2_6.method85(local14 + this.anInt952);
						}
						if (local19 == 995) {
							local70 = this.method659(0, 0, 0, local9, aClass2_Sub1_Sub3_Sub1_Sub1_1.anIntArray166[0], 2, 0, aClass2_Sub1_Sub3_Sub1_Sub1_1.anIntArray165[0], false, 0, local14);
							if (!local70) {
								this.method659(0, 1, 1, local9, aClass2_Sub1_Sub3_Sub1_Sub1_1.anIntArray166[0], 2, 0, aClass2_Sub1_Sub3_Sub1_Sub1_1.anIntArray165[0], false, 0, local14);
							}
							this.anInt989 = super.anInt844;
							this.anInt990 = super.anInt845;
							this.anInt992 = 2;
							this.anInt991 = 0;
							this.aClass2_Sub1_Sub2_6.method83(142);
							this.aClass2_Sub1_Sub2_6.method118(local24);
							this.aClass2_Sub1_Sub2_6.method85(local9 + this.anInt951);
							this.aClass2_Sub1_Sub2_6.method118(local14 + this.anInt952);
						}
						if (local19 == 717) {
							this.aClass2_Sub1_Sub2_6.method83(248);
							this.aClass2_Sub1_Sub2_6.method118(local24);
							this.aClass2_Sub1_Sub2_6.method118(local14);
							this.aClass2_Sub1_Sub2_6.method119(local9);
							this.anInt861 = 0;
							this.anInt862 = local14;
							this.anInt863 = local9;
							this.anInt864 = 2;
							if (Class31.method403(local14).anInt494 == this.anInt903) {
								this.anInt864 = 1;
							}
							if (Class31.method403(local14).anInt494 == this.anInt871) {
								this.anInt864 = 3;
							}
						}
						if (local19 == 996) {
							local884 = this.aClass2_Sub1_Sub3_Sub1_Sub1Array1[local24];
							if (local884 != null) {
								this.method659(0, 1, 1, local884.anIntArray165[0], aClass2_Sub1_Sub3_Sub1_Sub1_1.anIntArray166[0], 2, 0, aClass2_Sub1_Sub3_Sub1_Sub1_1.anIntArray165[0], false, 0, local884.anIntArray166[0]);
								this.anInt989 = super.anInt844;
								this.anInt990 = super.anInt845;
								this.anInt992 = 2;
								this.anInt991 = 0;
								this.aClass2_Sub1_Sub2_6.method83(4);
								this.aClass2_Sub1_Sub2_6.method119(local24);
							}
						}
						if (local19 == 477 && !this.aBoolean231) {
							this.aClass2_Sub1_Sub2_6.method83(42);
							this.aClass2_Sub1_Sub2_6.method85(local14);
							this.aBoolean231 = true;
						}
						if (local19 == 702 || local19 == 352 || local19 == 70 || local19 == 144) {
							local962 = this.aStringArray8[arg0];
							local744 = local962.indexOf("@whi@");
							if (local744 != -1) {
								local977 = Class34.method478(local962.substring(local744 + 5).trim());
								if (local19 == 702) {
									this.method619(local977);
								}
								if (local19 == 352) {
									this.method643(local977);
								}
								if (local19 == 70) {
									this.method690(local977);
								}
								if (local19 == 144) {
									this.method651(local977, this.anInt1059);
								}
							}
						}
						if (local19 == 38) {
							this.aClass2_Sub1_Sub2_6.method83(250);
							this.aClass2_Sub1_Sub2_6.method119(local14);
							this.aClass2_Sub1_Sub2_6.method117(local9, 26);
							this.aClass2_Sub1_Sub2_6.method85(local24);
							this.anInt861 = 0;
							this.anInt862 = local14;
							this.anInt863 = local9;
							this.anInt864 = 2;
							if (Class31.method403(local14).anInt494 == this.anInt903) {
								this.anInt864 = 1;
							}
							if (Class31.method403(local14).anInt494 == this.anInt871) {
								this.anInt864 = 3;
							}
						}
						if (local19 == 546 && this.method596(local24, local14, local9)) {
							this.aClass2_Sub1_Sub2_6.method83(246);
							this.aClass2_Sub1_Sub2_6.method117(local9 + this.anInt951, 26);
							this.aClass2_Sub1_Sub2_6.method117(this.anInt1001, 26);
							this.aClass2_Sub1_Sub2_6.method117(local24 >> 14 & 0x7FFF, 26);
							this.aClass2_Sub1_Sub2_6.method117(local14 + this.anInt952, 26);
						}
						if (local19 == 172 || local19 == 716) {
							local962 = this.aStringArray8[arg0];
							local744 = local962.indexOf("@whi@");
							if (local744 != -1) {
								local962 = local962.substring(local744 + 5).trim();
								local851 = Class34.method482(Class34.method479(Class34.method478(local962)));
								@Pc(3338) boolean local3338 = false;
								for (local979 = 0; local979 < this.anInt949; local979++) {
									@Pc(3350) Class2_Sub1_Sub3_Sub1_Sub1 local3350 = this.aClass2_Sub1_Sub3_Sub1_Sub1Array1[this.anIntArray245[local979]];
									if (local3350 != null && local3350.aString5 != null && local3350.aString5.equalsIgnoreCase(local851)) {
										this.method659(0, 1, 1, local3350.anIntArray165[0], aClass2_Sub1_Sub3_Sub1_Sub1_1.anIntArray166[0], 2, 0, aClass2_Sub1_Sub3_Sub1_Sub1_1.anIntArray165[0], false, 0, local3350.anIntArray166[0]);
										if (local19 == 172) {
											this.aClass2_Sub1_Sub2_6.method83(181);
											this.aClass2_Sub1_Sub2_6.method119(this.anIntArray245[local979]);
										}
										if (local19 == 716) {
											this.aClass2_Sub1_Sub2_6.method83(72);
											this.aClass2_Sub1_Sub2_6.method118(this.anIntArray245[local979]);
										}
										local3338 = true;
										break;
									}
								}
								if (!local3338) {
									this.method724("", "Unable to find " + local851, 0);
								}
							}
						}
						if (local19 == 730) {
							this.aClass2_Sub1_Sub2_6.method83(162);
							this.aClass2_Sub1_Sub2_6.method118(this.anInt957);
							this.aClass2_Sub1_Sub2_6.method119(this.anInt956);
							this.aClass2_Sub1_Sub2_6.method118(local24);
							this.aClass2_Sub1_Sub2_6.method85(local9);
							this.aClass2_Sub1_Sub2_6.method119(this.anInt958);
							this.aClass2_Sub1_Sub2_6.method119(local14);
							this.anInt861 = 0;
							this.anInt862 = local14;
							this.anInt863 = local9;
							this.anInt864 = 2;
							if (Class31.method403(local14).anInt494 == this.anInt903) {
								this.anInt864 = 1;
							}
							if (Class31.method403(local14).anInt494 == this.anInt871) {
								this.anInt864 = 3;
							}
						}
						this.anInt955 = 0;
						this.anInt1000 = 0;
						this.aBoolean233 = true;
					}
				}
			}
		} catch (@Pc(3523) RuntimeException local3523) {
			signlink.reporterror("11826, " + 9 + ", " + arg0 + ", " + local3523.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "f", descriptor = "(Z)V")
	private void method669() {
		try {
			this.anInt1070 = 0;
			@Pc(14) int local14 = (aClass2_Sub1_Sub3_Sub1_Sub1_1.anInt680 >> 7) + this.anInt951;
			@Pc(22) int local22 = (aClass2_Sub1_Sub3_Sub1_Sub1_1.anInt681 >> 7) + this.anInt952;
			if (local14 >= 3053 && local14 <= 3156 && local22 >= 3056 && local22 <= 3136) {
				this.anInt1070 = 1;
			}
			if (local14 >= 3072 && local14 <= 3118 && local22 >= 9492 && local22 <= 9535) {
				this.anInt1070 = 1;
			}
			if (this.anInt1070 == 1 && local14 >= 3139 && local14 <= 3199 && local22 >= 3008 && local22 <= 3062) {
				this.anInt1070 = 0;
			}
		} catch (@Pc(73) RuntimeException local73) {
			signlink.reporterror("86241, " + false + ", " + local73.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIIIII)V")
	private void method670(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		try {
			@Pc(5) int local5 = 2048 - arg0 & 0x7FF;
			@Pc(11) int local11 = 2048 - arg4 & 0x7FF;
			@Pc(13) int local13 = 0;
			@Pc(15) int local15 = 0;
			@Pc(17) int local17 = arg3;
			@Pc(23) int local23;
			@Pc(27) int local27;
			@Pc(37) int local37;
			if (local5 != 0) {
				local23 = Class2_Sub1_Sub3_Sub4.anIntArray150[local5];
				local27 = Class2_Sub1_Sub3_Sub4.anIntArray151[local5];
				local37 = local27 * 0 - arg3 * local23 >> 16;
				local17 = local23 * 0 + arg3 * local27 >> 16;
				local15 = local37;
			}
			if (local11 != 0) {
				local23 = Class2_Sub1_Sub3_Sub4.anIntArray150[local11];
				local27 = Class2_Sub1_Sub3_Sub4.anIntArray151[local11];
				local37 = local17 * local23 + local27 * 0 >> 16;
				local17 = local17 * local27 - local23 * 0 >> 16;
				local13 = local37;
			}
			this.anInt913 = arg1 - local13;
			this.anInt914 = arg2 - local15;
			this.anInt915 = arg5 - local17;
			this.anInt916 = arg0;
			this.anInt917 = arg4;
		} catch (@Pc(111) RuntimeException local111) {
			signlink.reporterror("79159, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + 3 + ", " + arg4 + ", " + arg5 + ", " + local111.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IILclient!BSNPYLEV;)V")
	private void method671(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class2_Sub1_Sub2 arg2) {
		try {
			this.anInt939 = 0;
			this.anInt950 = 0;
			this.method637(arg1, arg2);
			@Pc(16) boolean local16 = true;
			this.method614(arg2, arg1);
			this.method594((byte) 8, arg2, arg1);
			this.method715(arg2, arg1);
			@Pc(40) int local40;
			for (@Pc(33) int local33 = 0; local33 < this.anInt939; local33++) {
				local40 = this.anIntArray243[local33];
				if (this.aClass2_Sub1_Sub3_Sub1_Sub1Array1[local40].anInt706 != anInt970) {
					this.aClass2_Sub1_Sub3_Sub1_Sub1Array1[local40] = null;
				}
			}
			if (arg2.anInt81 != arg1) {
				signlink.reporterror("Error packet size mismatch in getplayer pos:" + arg2.anInt81 + " psize:" + arg1);
				throw new RuntimeException("eek");
			}
			for (local40 = 0; local40 < this.anInt949; local40++) {
				if (this.aClass2_Sub1_Sub3_Sub1_Sub1Array1[this.anIntArray245[local40]] == null) {
					signlink.reporterror(this.aString26 + " null entry in pl list - pos:" + local40 + " size:" + this.anInt949);
					throw new RuntimeException("eek");
				}
			}
		} catch (@Pc(120) RuntimeException local120) {
			signlink.reporterror("17734, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local120.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "g", descriptor = "(Z)Z")
	private boolean method672(@OriginalArg(0) boolean arg0) {
		try {
			if (arg0) {
				this.aClass2_Sub1_Sub2_6.method84(0);
			}
			if (this.aClass28_1 == null) {
				return false;
			}
			@Pc(1017) String local1017;
			@Pc(165) int local165;
			try {
				@Pc(16) int local16 = this.aClass28_1.method319();
				if (local16 == 0) {
					return false;
				}
				if (this.anInt973 == -1) {
					this.aClass28_1.method320(this.aClass2_Sub1_Sub2_9.aByteArray1, 0, 1);
					this.anInt973 = this.aClass2_Sub1_Sub2_9.aByteArray1[0] & 0xFF;
					if (this.aClass46_2 != null) {
						this.anInt973 = this.anInt973 - this.aClass46_2.method558() & 0xFF;
					}
					this.anInt972 = Class41.anIntArray171[this.anInt973];
					local16--;
				}
				if (this.anInt972 == -1) {
					if (local16 <= 0) {
						return false;
					}
					this.aClass28_1.method320(this.aClass2_Sub1_Sub2_9.aByteArray1, 0, 1);
					this.anInt972 = this.aClass2_Sub1_Sub2_9.aByteArray1[0] & 0xFF;
					local16--;
				}
				if (this.anInt972 == -2) {
					if (local16 <= 1) {
						return false;
					}
					this.aClass28_1.method320(this.aClass2_Sub1_Sub2_9.aByteArray1, 0, 2);
					this.aClass2_Sub1_Sub2_9.anInt81 = 0;
					this.anInt972 = this.aClass2_Sub1_Sub2_9.method96();
					local16 -= 2;
				}
				if (local16 < this.anInt972) {
					return false;
				}
				this.aClass2_Sub1_Sub2_9.anInt81 = 0;
				this.aClass28_1.method320(this.aClass2_Sub1_Sub2_9.aByteArray1, 0, this.anInt972);
				this.anInt974 = 0;
				this.anInt1044 = this.anInt1043;
				this.anInt1043 = this.anInt1042;
				this.anInt1042 = this.anInt973;
				@Pc(160) int local160;
				if (this.anInt973 == 220) {
					local160 = this.aClass2_Sub1_Sub2_9.method94();
					local165 = this.aClass2_Sub1_Sub2_9.method120();
					if (local165 == 65535) {
						local165 = -1;
					}
					if (this.anIntArray257[local160] != local165) {
						this.method616(this.anIntArray257[local160]);
						this.anIntArray257[local160] = local165;
					}
					this.aBoolean233 = true;
					this.aBoolean244 = true;
					this.anInt973 = -1;
					return true;
				}
				if (this.anInt973 == 241) {
					this.anInt1054 = this.aClass2_Sub1_Sub2_9.method94();
					this.anInt1055 = this.aClass2_Sub1_Sub2_9.method94();
					this.anInt973 = -1;
					return true;
				}
				@Pc(230) String local230;
				if (this.anInt973 == 70) {
					local160 = this.aClass2_Sub1_Sub2_9.method96();
					local230 = this.aClass2_Sub1_Sub2_9.method101();
					Class31.method403(local160).aString6 = local230;
					@Pc(242) int local242 = this.anIntArray257[this.anInt1064];
					if (Class31.method403(local160).anInt494 == local242) {
						this.aBoolean233 = true;
					}
					this.anInt973 = -1;
					return true;
				}
				@Pc(265) int local265;
				@Pc(263) Class31 local263;
				if (this.anInt973 == 228) {
					local160 = this.aClass2_Sub1_Sub2_9.method121();
					local263 = Class31.method403(local160);
					for (local265 = 0; local265 < local263.anIntArray101.length; local265++) {
						local263.anIntArray101[local265] = -1;
						local263.anIntArray101[local265] = 0;
					}
					this.anInt973 = -1;
					return true;
				}
				if (this.anInt973 == 185) {
					this.aBoolean251 = true;
					this.anInt1033 = this.aClass2_Sub1_Sub2_9.method94();
					this.anInt1034 = this.aClass2_Sub1_Sub2_9.method94();
					this.anInt1035 = this.aClass2_Sub1_Sub2_9.method96();
					this.anInt1036 = this.aClass2_Sub1_Sub2_9.method94();
					this.anInt1037 = this.aClass2_Sub1_Sub2_9.method94();
					if (this.anInt1037 >= 100) {
						this.anInt913 = this.anInt1033 * 128 + 64;
						this.anInt915 = this.anInt1034 * 128 + 64;
						this.anInt914 = this.method622(this.anInt915, this.anInt882, this.anInt913) - this.anInt1035;
					}
					this.anInt973 = -1;
					return true;
				}
				if (this.anInt973 == 236) {
					this.anInt1030 = this.aClass2_Sub1_Sub2_9.method94();
					if (this.anInt1030 == 1) {
						this.anInt1062 = this.aClass2_Sub1_Sub2_9.method96();
					}
					if (this.anInt1030 >= 2 && this.anInt1030 <= 6) {
						if (this.anInt1030 == 2) {
							this.anInt980 = 64;
							this.anInt981 = 64;
						}
						if (this.anInt1030 == 3) {
							this.anInt980 = 0;
							this.anInt981 = 64;
						}
						if (this.anInt1030 == 4) {
							this.anInt980 = 128;
							this.anInt981 = 64;
						}
						if (this.anInt1030 == 5) {
							this.anInt980 = 64;
							this.anInt981 = 0;
						}
						if (this.anInt1030 == 6) {
							this.anInt980 = 64;
							this.anInt981 = 128;
						}
						this.anInt1030 = 2;
						this.anInt977 = this.aClass2_Sub1_Sub2_9.method96();
						this.anInt978 = this.aClass2_Sub1_Sub2_9.method96();
						this.anInt979 = this.aClass2_Sub1_Sub2_9.method94();
					}
					if (this.anInt1030 == 10) {
						this.anInt875 = this.aClass2_Sub1_Sub2_9.method96();
					}
					this.anInt973 = -1;
					return true;
				}
				@Pc(484) Class31 local484;
				if (this.anInt973 == 21) {
					local160 = this.aClass2_Sub1_Sub2_9.method122();
					local165 = this.aClass2_Sub1_Sub2_9.method122();
					local484 = Class31.method403(local165);
					if (local484 != null && local484.anInt503 == 0) {
						if (local160 < 0) {
							local160 = 0;
						}
						if (local160 > local484.anInt495 - local484.anInt504) {
							local160 = local484.anInt495 - local484.anInt504;
						}
						local484.anInt500 = local160;
					}
					this.anInt973 = -1;
					return true;
				}
				if (this.anInt973 == 80) {
					this.method629();
					this.anInt973 = -1;
					return false;
				}
				if (this.anInt973 == 206) {
					local160 = this.aClass2_Sub1_Sub2_9.method96();
					local165 = this.aClass2_Sub1_Sub2_9.method94();
					local265 = this.aClass2_Sub1_Sub2_9.method96();
					if (local265 == 65535) {
						if (this.anInt938 < 50) {
							this.anIntArray247[this.anInt938] = (short) local160;
							this.anIntArray265[this.anInt938] = local165;
							this.anIntArray233[this.anInt938] = 0;
							this.anInt938++;
						}
					} else if (this.aBoolean246 && !aBoolean272 && this.anInt938 < 50) {
						this.anIntArray247[this.anInt938] = local160;
						this.anIntArray265[this.anInt938] = local165;
						this.anIntArray233[this.anInt938] = local265 + Class8.anIntArray33[local160];
						this.anInt938++;
					}
					this.anInt973 = -1;
					return true;
				}
				if (this.anInt973 == 36) {
					local160 = this.aClass2_Sub1_Sub2_9.method97();
					local165 = this.aClass2_Sub1_Sub2_9.method120();
					local265 = this.aClass2_Sub1_Sub2_9.method123();
					@Pc(639) Class31 local639 = Class31.method403(local165);
					local639.anInt490 = local160;
					local639.anInt487 = local265;
					this.anInt973 = -1;
					return true;
				}
				if (this.anInt973 == 158) {
					this.anInt1007 = this.aClass2_Sub1_Sub2_9.method94();
					this.anInt973 = -1;
					return true;
				}
				if (this.anInt973 == 230) {
					local160 = this.aClass2_Sub1_Sub2_9.method122();
					this.method649(local160);
					if (this.anInt871 != -1) {
						this.method616(this.anInt871);
						this.anInt871 = -1;
						this.aBoolean241 = true;
					}
					if (this.anInt1008 != -1) {
						this.method616(this.anInt1008);
						this.anInt1008 = -1;
						this.aBoolean228 = true;
					}
					if (this.anInt1003 != -1) {
						this.method616(this.anInt1003);
						this.anInt1003 = -1;
					}
					if (this.anInt903 != -1) {
						this.method616(this.anInt903);
						this.anInt903 = -1;
					}
					if (this.anInt982 != local160) {
						this.method616(this.anInt982);
						this.anInt982 = local160;
					}
					if (this.anInt912 != 0) {
						this.anInt912 = 0;
						this.aBoolean241 = true;
					}
					this.aBoolean233 = true;
					this.aBoolean244 = true;
					this.aBoolean231 = false;
					this.anInt973 = -1;
					return true;
				}
				if (this.anInt973 == 34) {
					local160 = this.aClass2_Sub1_Sub2_9.method122();
					local165 = this.aClass2_Sub1_Sub2_9.method96();
					local265 = this.aClass2_Sub1_Sub2_9.method120();
					Class31.method403(local265).anInt496 = (local165 << 16) + local160;
					this.anInt973 = -1;
					return true;
				}
				if (this.anInt973 == 22) {
					this.anInt1055 = this.aClass2_Sub1_Sub2_9.method114();
					this.anInt1054 = this.aClass2_Sub1_Sub2_9.method114();
					while (this.aClass2_Sub1_Sub2_9.anInt81 < this.anInt972) {
						local160 = this.aClass2_Sub1_Sub2_9.method94();
						this.method635(this.aClass2_Sub1_Sub2_9, (byte) 6, local160);
					}
					this.anInt973 = -1;
					return true;
				}
				if (this.anInt973 == 172) {
					this.method626(this.aClass2_Sub1_Sub2_9, this.anInt972);
					this.anInt973 = -1;
					return true;
				}
				@Pc(918) int local918;
				@Pc(928) int local928;
				@Pc(939) int local939;
				@Pc(923) int local923;
				if (this.anInt973 == 87) {
					this.aBoolean251 = true;
					this.anInt906 = this.aClass2_Sub1_Sub2_9.method94();
					this.anInt907 = this.aClass2_Sub1_Sub2_9.method94();
					this.anInt908 = this.aClass2_Sub1_Sub2_9.method96();
					this.anInt909 = this.aClass2_Sub1_Sub2_9.method94();
					this.anInt910 = this.aClass2_Sub1_Sub2_9.method94();
					if (this.anInt910 >= 100) {
						local160 = this.anInt906 * 128 + 64;
						local165 = this.anInt907 * 128 + 64;
						local265 = this.method622(local165, this.anInt882, local160) - this.anInt908;
						local918 = local160 - this.anInt913;
						local923 = local265 - this.anInt914;
						local928 = local165 - this.anInt915;
						local939 = (int) Math.sqrt((double) (local918 * local918 + local928 * local928));
						this.anInt916 = (int) (Math.atan2((double) local923, (double) local939) * 325.949D) & 0x7FF;
						this.anInt917 = (int) (Math.atan2((double) local918, (double) local928) * -325.949D) & 0x7FF;
						if (this.anInt916 < 128) {
							this.anInt916 = 128;
						}
						if (this.anInt916 > 383) {
							this.anInt916 = 383;
						}
					}
					this.anInt973 = -1;
					return true;
				}
				if (this.anInt973 == 123) {
					local160 = this.aClass2_Sub1_Sub2_9.method121();
					local165 = this.aClass2_Sub1_Sub2_9.method122();
					Class31.method403(local160).anInt507 = 2;
					Class31.method403(local160).anInt508 = local165;
					this.anInt973 = -1;
					return true;
				}
				@Pc(1033) boolean local1033;
				@Pc(1168) String local1168;
				if (this.anInt973 == 134) {
					local1017 = this.aClass2_Sub1_Sub2_9.method101();
					@Pc(1031) long local1031;
					if (local1017.endsWith(":tradereq:")) {
						local230 = local1017.substring(0, local1017.indexOf(":"));
						local1031 = Class34.method478(local230);
						local1033 = false;
						for (local928 = 0; local928 < this.anInt1039; local928++) {
							if (this.aLongArray4[local928] == local1031) {
								local1033 = true;
								break;
							}
						}
						if (!local1033 && this.anInt1070 == 0) {
							this.method724(local230, "wishes to trade with you.", 4);
						}
					} else if (local1017.endsWith(":duelreq:")) {
						local230 = local1017.substring(0, local1017.indexOf(":"));
						local1031 = Class34.method478(local230);
						local1033 = false;
						for (local928 = 0; local928 < this.anInt1039; local928++) {
							if (this.aLongArray4[local928] == local1031) {
								local1033 = true;
								break;
							}
						}
						if (!local1033 && this.anInt1070 == 0) {
							this.method724(local230, "wishes to duel with you.", 8);
						}
					} else if (local1017.endsWith(":chalreq:")) {
						local230 = local1017.substring(0, local1017.indexOf(":"));
						local1031 = Class34.method478(local230);
						local1033 = false;
						for (local928 = 0; local928 < this.anInt1039; local928++) {
							if (this.aLongArray4[local928] == local1031) {
								local1033 = true;
								break;
							}
						}
						if (!local1033 && this.anInt1070 == 0) {
							local1168 = local1017.substring(local1017.indexOf(":") + 1, local1017.length() - 9);
							this.method724(local230, local1168, 8);
						}
					} else {
						this.method724("", local1017, 0);
					}
					this.anInt973 = -1;
					return true;
				}
				if (this.anInt973 == 102) {
					this.anInt1039 = this.anInt972 / 8;
					for (local160 = 0; local160 < this.anInt1039; local160++) {
						this.aLongArray4[local160] = this.aClass2_Sub1_Sub2_9.method100();
					}
					this.anInt973 = -1;
					return true;
				}
				@Pc(1582) int local1582;
				if (this.anInt973 == 249 || this.anInt973 == 8) {
					local160 = this.anInt1005;
					local165 = this.anInt1006;
					if (this.anInt973 == 249) {
						local165 = this.aClass2_Sub1_Sub2_9.method122();
						local160 = this.aClass2_Sub1_Sub2_9.method121();
						this.aBoolean268 = false;
					}
					if (this.anInt973 == 8) {
						this.aClass2_Sub1_Sub2_9.method104();
						local265 = 0;
						while (true) {
							if (local265 >= 4) {
								this.aClass2_Sub1_Sub2_9.method106();
								local160 = this.aClass2_Sub1_Sub2_9.method122();
								local165 = this.aClass2_Sub1_Sub2_9.method120();
								this.aBoolean268 = true;
								break;
							}
							for (local918 = 0; local918 < 13; local918++) {
								for (local923 = 0; local923 < 13; local923++) {
									local928 = this.aClass2_Sub1_Sub2_9.method105(1, 588);
									if (local928 == 1) {
										this.anIntArrayArrayArray7[local265][local918][local923] = this.aClass2_Sub1_Sub2_9.method105(26, 588);
									} else {
										this.anIntArrayArrayArray7[local265][local918][local923] = -1;
									}
								}
							}
							local265++;
						}
					}
					if (this.anInt1005 == local160 && this.anInt1006 == local165 && this.anInt929 == 2) {
						this.anInt973 = -1;
						return true;
					}
					this.anInt1005 = local160;
					this.anInt1006 = local165;
					this.anInt951 = (this.anInt1005 - 6) * 8;
					this.anInt952 = (this.anInt1006 - 6) * 8;
					this.aBoolean238 = false;
					if ((this.anInt1005 / 8 == 48 || this.anInt1005 / 8 == 49) && this.anInt1006 / 8 == 48) {
						this.aBoolean238 = true;
					}
					if (this.anInt1005 / 8 == 48 && this.anInt1006 / 8 == 148) {
						this.aBoolean238 = true;
					}
					this.anInt929 = 1;
					this.aLong33 = System.currentTimeMillis();
					this.method630("Loading - please wait.", null, this.anInt896);
					if (this.anInt973 == 249) {
						local265 = 0;
						local918 = (this.anInt1005 - 6) / 8;
						label1207: while (true) {
							if (local918 > (this.anInt1005 + 6) / 8) {
								this.aByteArrayArray5 = new byte[local265][];
								this.aByteArrayArray6 = new byte[local265][];
								this.anIntArray253 = new int[local265];
								this.anIntArray254 = new int[local265];
								this.anIntArray255 = new int[local265];
								local265 = 0;
								local923 = (this.anInt1005 - 6) / 8;
								while (true) {
									if (local923 > (this.anInt1005 + 6) / 8) {
										break label1207;
									}
									for (local928 = (this.anInt1006 - 6) / 8; local928 <= (this.anInt1006 + 6) / 8; local928++) {
										this.anIntArray253[local265] = (local923 << 8) + local928;
										if (this.aBoolean238 && (local928 == 49 || local928 == 149 || local928 == 147 || local923 == 50 || local923 == 49 && local928 == 47)) {
											this.anIntArray254[local265] = -1;
											this.anIntArray255[local265] = -1;
											local265++;
										} else {
											local939 = this.anIntArray254[local265] = this.aClass9_Sub1_1.method511(0, local923, local928);
											if (local939 != -1) {
												this.aClass9_Sub1_1.method526(3, local939);
											}
											local1582 = this.anIntArray255[local265] = this.aClass9_Sub1_1.method511(1, local923, local928);
											if (local1582 != -1) {
												this.aClass9_Sub1_1.method526(3, local1582);
											}
											local265++;
										}
									}
									local923++;
								}
							}
							for (local923 = (this.anInt1006 - 6) / 8; local923 <= (this.anInt1006 + 6) / 8; local923++) {
								local265++;
							}
							local918++;
						}
					}
					if (this.anInt973 == 8) {
						local265 = 0;
						@Pc(1618) int[] local1618 = new int[676];
						local923 = 0;
						label1166: while (true) {
							@Pc(1664) int local1664;
							@Pc(1648) int local1648;
							@Pc(1654) int local1654;
							if (local923 >= 4) {
								this.aByteArrayArray5 = new byte[local265][];
								this.aByteArrayArray6 = new byte[local265][];
								this.anIntArray253 = new int[local265];
								this.anIntArray254 = new int[local265];
								this.anIntArray255 = new int[local265];
								local928 = 0;
								while (true) {
									if (local928 >= local265) {
										break label1166;
									}
									local939 = this.anIntArray253[local928] = local1618[local928];
									local1582 = local939 >> 8 & 0xFF;
									local1648 = local939 & 0xFF;
									local1654 = this.anIntArray254[local928] = this.aClass9_Sub1_1.method511(0, local1582, local1648);
									if (local1654 != -1) {
										this.aClass9_Sub1_1.method526(3, local1654);
									}
									local1664 = this.anIntArray255[local928] = this.aClass9_Sub1_1.method511(1, local1582, local1648);
									if (local1664 != -1) {
										this.aClass9_Sub1_1.method526(3, local1664);
									}
									local928++;
								}
							}
							for (local928 = 0; local928 < 13; local928++) {
								for (local939 = 0; local939 < 13; local939++) {
									local1582 = this.anIntArrayArrayArray7[local923][local928][local939];
									if (local1582 != -1) {
										local1648 = local1582 >> 14 & 0x3FF;
										local1654 = local1582 >> 3 & 0x7FF;
										local1664 = (local1648 / 8 << 8) + local1654 / 8;
										for (@Pc(1666) int local1666 = 0; local1666 < local265; local1666++) {
											if (local1618[local1666] == local1664) {
												local1664 = -1;
												break;
											}
										}
										if (local1664 != -1) {
											local1618[local265++] = local1664;
										}
									}
								}
							}
							local923++;
						}
					}
					local265 = this.anInt951 - this.anInt953;
					local918 = this.anInt952 - this.anInt954;
					this.anInt953 = this.anInt951;
					this.anInt954 = this.anInt952;
					for (local923 = 0; local923 < 16384; local923++) {
						@Pc(1819) Class2_Sub1_Sub3_Sub1_Sub2 local1819 = this.aClass2_Sub1_Sub3_Sub1_Sub2Array1[local923];
						if (local1819 != null) {
							for (local939 = 0; local939 < 10; local939++) {
								local1819.anIntArray165[local939] -= local265;
								local1819.anIntArray166[local939] -= local918;
							}
							local1819.anInt680 -= local265 * 128;
							local1819.anInt681 -= local918 * 128;
						}
					}
					for (local928 = 0; local928 < this.anInt947; local928++) {
						@Pc(1874) Class2_Sub1_Sub3_Sub1_Sub1 local1874 = this.aClass2_Sub1_Sub3_Sub1_Sub1Array1[local928];
						if (local1874 != null) {
							for (local1582 = 0; local1582 < 10; local1582++) {
								local1874.anIntArray165[local1582] -= local265;
								local1874.anIntArray166[local1582] -= local918;
							}
							local1874.anInt680 -= local265 * 128;
							local1874.anInt681 -= local918 * 128;
						}
					}
					this.aBoolean239 = true;
					@Pc(1926) byte local1926 = 0;
					@Pc(1928) byte local1928 = 104;
					@Pc(1930) byte local1930 = 1;
					if (local265 < 0) {
						local1926 = 103;
						local1928 = -1;
						local1930 = -1;
					}
					@Pc(1940) byte local1940 = 0;
					@Pc(1942) byte local1942 = 104;
					@Pc(1944) byte local1944 = 1;
					if (local918 < 0) {
						local1940 = 103;
						local1942 = -1;
						local1944 = -1;
					}
					for (@Pc(1954) int local1954 = local1926; local1954 != local1928; local1954 += local1930) {
						for (@Pc(1958) int local1958 = local1940; local1958 != local1942; local1958 += local1944) {
							@Pc(1964) int local1964 = local1954 + local265;
							@Pc(1968) int local1968 = local1958 + local918;
							for (@Pc(1970) int local1970 = 0; local1970 < 4; local1970++) {
								if (local1964 >= 0 && local1968 >= 0 && local1964 < 104 && local1968 < 104) {
									this.aClass13ArrayArrayArray1[local1970][local1954][local1958] = this.aClass13ArrayArrayArray1[local1970][local1964][local1968];
								} else {
									this.aClass13ArrayArrayArray1[local1970][local1954][local1958] = null;
								}
							}
						}
					}
					for (@Pc(2032) Class2_Sub3 local2032 = (Class2_Sub3) this.aClass13_11.method200(); local2032 != null; local2032 = (Class2_Sub3) this.aClass13_11.method202()) {
						local2032.anInt764 -= local265;
						local2032.anInt765 -= local918;
						if (local2032.anInt764 < 0 || local2032.anInt765 < 0 || local2032.anInt764 >= 104 || local2032.anInt765 >= 104) {
							local2032.method530();
						}
					}
					if (this.anInt931 != 0) {
						this.anInt931 -= local265;
						this.anInt932 -= local918;
					}
					this.aBoolean251 = false;
					this.anInt973 = -1;
					return true;
				}
				if (this.anInt973 == 124) {
					this.aBoolean233 = true;
					local160 = this.aClass2_Sub1_Sub2_9.method96();
					local263 = Class31.method403(local160);
					local265 = this.aClass2_Sub1_Sub2_9.method96();
					for (local918 = 0; local918 < local265; local918++) {
						local263.anIntArray101[local918] = this.aClass2_Sub1_Sub2_9.method122();
						local923 = this.aClass2_Sub1_Sub2_9.method114();
						if (local923 == 255) {
							local923 = this.aClass2_Sub1_Sub2_9.method128();
						}
						local263.anIntArray106[local918] = local923;
					}
					for (local923 = local265; local923 < local263.anIntArray101.length; local923++) {
						local263.anIntArray101[local923] = 0;
						local263.anIntArray106[local923] = 0;
					}
					this.anInt973 = -1;
					return true;
				}
				if (this.anInt973 == 103) {
					local160 = this.aClass2_Sub1_Sub2_9.method122();
					local165 = this.aClass2_Sub1_Sub2_9.method120();
					if (this.anInt871 != -1) {
						this.method616(this.anInt871);
						this.anInt871 = -1;
						this.aBoolean241 = true;
					}
					if (this.anInt1008 != -1) {
						this.method616(this.anInt1008);
						this.anInt1008 = -1;
						this.aBoolean228 = true;
					}
					if (this.anInt1003 != -1) {
						this.method616(this.anInt1003);
						this.anInt1003 = -1;
					}
					if (this.anInt903 != local160) {
						this.method616(this.anInt903);
						this.anInt903 = local160;
					}
					if (this.anInt982 != local165) {
						this.method616(this.anInt982);
						this.anInt982 = local165;
					}
					if (this.anInt912 != 0) {
						this.anInt912 = 0;
						this.aBoolean241 = true;
					}
					this.aBoolean233 = true;
					this.aBoolean244 = true;
					this.aBoolean231 = false;
					this.anInt973 = -1;
					return true;
				}
				if (this.anInt973 == 170) {
					local160 = this.aClass2_Sub1_Sub2_9.method96();
					local165 = this.aClass2_Sub1_Sub2_9.method120();
					local265 = this.aClass2_Sub1_Sub2_9.method96();
					local918 = this.aClass2_Sub1_Sub2_9.method120();
					Class31.method403(local265).anInt519 = local918;
					Class31.method403(local265).anInt520 = local160;
					Class31.method403(local265).anInt518 = local165;
					this.anInt973 = -1;
					return true;
				}
				if (this.anInt973 == 248) {
					if (this.anInt1064 == 12) {
						this.aBoolean233 = true;
					}
					this.anInt1012 = this.aClass2_Sub1_Sub2_9.method97();
					this.anInt973 = -1;
					return true;
				}
				if (this.anInt973 == 73) {
					local160 = this.aClass2_Sub1_Sub2_9.method122();
					this.method649(local160);
					if (this.anInt982 != -1) {
						this.method616(this.anInt982);
						this.anInt982 = -1;
						this.aBoolean233 = true;
						this.aBoolean244 = true;
					}
					if (this.anInt871 != -1) {
						this.method616(this.anInt871);
						this.anInt871 = -1;
						this.aBoolean241 = true;
					}
					if (this.anInt1008 != -1) {
						this.method616(this.anInt1008);
						this.anInt1008 = -1;
						this.aBoolean228 = true;
					}
					if (this.anInt1003 != -1) {
						this.method616(this.anInt1003);
						this.anInt1003 = -1;
					}
					if (this.anInt903 != local160) {
						this.method616(this.anInt903);
						this.anInt903 = local160;
					}
					if (this.anInt912 != 0) {
						this.anInt912 = 0;
						this.aBoolean241 = true;
					}
					this.aBoolean231 = false;
					this.anInt973 = -1;
					return true;
				}
				if (this.anInt973 == 240) {
					this.anInt1014 = this.aClass2_Sub1_Sub2_9.method94();
					this.aBoolean233 = true;
					this.anInt973 = -1;
					return true;
				}
				if (this.anInt973 == 247) {
					local160 = this.aClass2_Sub1_Sub2_9.method121();
					local165 = this.aClass2_Sub1_Sub2_9.method129();
					this.anIntArray219[local160] = local165;
					if (this.anIntArray225[local160] != local165) {
						this.anIntArray225[local160] = local165;
						this.method634(local160);
						this.aBoolean233 = true;
						if (this.anInt928 != -1) {
							this.aBoolean241 = true;
						}
					}
					this.anInt973 = -1;
					return true;
				}
				if (this.anInt973 == 4) {
					this.anInt930 = this.aClass2_Sub1_Sub2_9.method120();
					this.anInt888 = this.aClass2_Sub1_Sub2_9.method114();
					this.anInt973 = -1;
					return true;
				}
				if (this.anInt973 == 149) {
					for (local160 = 0; local160 < this.aClass2_Sub1_Sub3_Sub1_Sub1Array1.length; local160++) {
						if (this.aClass2_Sub1_Sub3_Sub1_Sub1Array1[local160] != null) {
							this.aClass2_Sub1_Sub3_Sub1_Sub1Array1[local160].anInt674 = -1;
						}
					}
					for (local165 = 0; local165 < this.aClass2_Sub1_Sub3_Sub1_Sub2Array1.length; local165++) {
						if (this.aClass2_Sub1_Sub3_Sub1_Sub2Array1[local165] != null) {
							this.aClass2_Sub1_Sub3_Sub1_Sub2Array1[local165].anInt674 = -1;
						}
					}
					this.anInt973 = -1;
					return true;
				}
				if (this.anInt973 == 101) {
					local160 = this.aClass2_Sub1_Sub2_9.method121();
					local165 = this.aClass2_Sub1_Sub2_9.method121();
					local265 = local160 >> 10 & 0x1F;
					local918 = local160 >> 5 & 0x1F;
					local923 = local160 & 0x1F;
					Class31.method403(local165).anInt521 = (local265 << 19) + (local918 << 11) + (local923 << 3);
					this.anInt973 = -1;
					return true;
				}
				@Pc(2631) long local2631;
				if (this.anInt973 == 74) {
					local2631 = this.aClass2_Sub1_Sub2_9.method100();
					local265 = this.aClass2_Sub1_Sub2_9.method94();
					@Pc(2641) String local2641 = Class34.method482(Class34.method479(local2631));
					for (local923 = 0; local923 < this.anInt1013; local923++) {
						if (local2631 == this.aLongArray3[local923]) {
							if (this.anIntArray252[local923] != local265) {
								this.anIntArray252[local923] = local265;
								this.aBoolean233 = true;
								if (local265 > 0) {
									this.method724("", local2641 + " has logged in.", 5);
								}
								if (local265 == 0) {
									this.method724("", local2641 + " has logged out.", 5);
								}
							}
							local2641 = null;
							break;
						}
					}
					if (local2641 != null && this.anInt1013 < 200) {
						this.aLongArray3[this.anInt1013] = local2631;
						this.aStringArray11[this.anInt1013] = local2641;
						this.anIntArray252[this.anInt1013] = local265;
						this.anInt1013++;
						this.aBoolean233 = true;
					}
					@Pc(2739) boolean local2739 = false;
					while (!local2739) {
						local2739 = true;
						for (local939 = 0; local939 < this.anInt1013 - 1; local939++) {
							if (this.anIntArray252[local939] != anInt1072 && this.anIntArray252[local939 + 1] == anInt1072 || this.anIntArray252[local939] == 0 && this.anIntArray252[local939 + 1] != 0) {
								local1582 = this.anIntArray252[local939];
								this.anIntArray252[local939] = this.anIntArray252[local939 + 1];
								this.anIntArray252[local939 + 1] = local1582;
								@Pc(2800) String local2800 = this.aStringArray11[local939];
								this.aStringArray11[local939] = this.aStringArray11[local939 + 1];
								this.aStringArray11[local939 + 1] = local2800;
								@Pc(2822) long local2822 = this.aLongArray3[local939];
								this.aLongArray3[local939] = this.aLongArray3[local939 + 1];
								this.aLongArray3[local939 + 1] = local2822;
								this.aBoolean233 = true;
								local2739 = false;
							}
						}
					}
					this.anInt973 = -1;
					return true;
				}
				if (this.anInt973 == 157) {
					this.anInt931 = 0;
					this.anInt973 = -1;
					return true;
				}
				if (this.anInt973 == 116) {
					if (this.anInt1064 == 12) {
						this.aBoolean233 = true;
					}
					this.anInt876 = this.aClass2_Sub1_Sub2_9.method94();
					this.anInt973 = -1;
					return true;
				}
				if (this.anInt973 == 165) {
					this.aBoolean237 = false;
					this.anInt912 = 1;
					this.aString23 = "";
					this.aBoolean241 = true;
					this.anInt973 = -1;
					return true;
				}
				if (this.anInt973 == 130) {
					this.aBoolean233 = true;
					local160 = this.aClass2_Sub1_Sub2_9.method96();
					local263 = Class31.method403(local160);
					while (this.aClass2_Sub1_Sub2_9.anInt81 < this.anInt972) {
						local265 = this.aClass2_Sub1_Sub2_9.method108();
						local918 = this.aClass2_Sub1_Sub2_9.method96();
						local923 = this.aClass2_Sub1_Sub2_9.method94();
						if (local923 == 255) {
							local923 = this.aClass2_Sub1_Sub2_9.method99();
						}
						if (local265 >= 0 && local265 < local263.anIntArray101.length) {
							local263.anIntArray101[local265] = local918;
							local263.anIntArray106[local265] = local923;
						}
					}
					this.anInt973 = -1;
					return true;
				}
				if (this.anInt973 == 120) {
					this.anInt1064 = this.aClass2_Sub1_Sub2_9.method112();
					this.aBoolean233 = true;
					this.aBoolean244 = true;
					this.anInt973 = -1;
					return true;
				}
				if (this.anInt973 == 105) {
					local160 = this.aClass2_Sub1_Sub2_9.method94();
					local165 = this.aClass2_Sub1_Sub2_9.method94();
					local265 = this.aClass2_Sub1_Sub2_9.method94();
					local918 = this.aClass2_Sub1_Sub2_9.method94();
					this.aBooleanArray12[local160] = true;
					this.anIntArray218[local160] = local165;
					this.anIntArray251[local160] = local265;
					this.anIntArray259[local160] = local918;
					this.anIntArray226[local160] = 0;
					this.anInt973 = -1;
					return true;
				}
				if (this.anInt973 == 166) {
					local160 = this.aClass2_Sub1_Sub2_9.method96();
					Class31.method403(local160).anInt507 = 3;
					if (aClass2_Sub1_Sub3_Sub1_Sub1_1.aClass48_1 == null) {
						Class31.method403(local160).anInt508 = (aClass2_Sub1_Sub3_Sub1_Sub1_1.anIntArray76[0] << 25) + (aClass2_Sub1_Sub3_Sub1_Sub1_1.anIntArray76[4] << 20) + (aClass2_Sub1_Sub3_Sub1_Sub1_1.anIntArray75[0] << 15) + (aClass2_Sub1_Sub3_Sub1_Sub1_1.anIntArray75[8] << 10) + (aClass2_Sub1_Sub3_Sub1_Sub1_1.anIntArray75[11] << 5) + aClass2_Sub1_Sub3_Sub1_Sub1_1.anIntArray75[1];
					} else {
						Class31.method403(local160).anInt508 = (int) (aClass2_Sub1_Sub3_Sub1_Sub1_1.aClass48_1.aLong26 + 305419896L);
					}
					this.anInt973 = -1;
					return true;
				}
				if (this.anInt973 == 197) {
					this.anInt1068 = this.aClass2_Sub1_Sub2_9.method121() * 30;
					this.anInt973 = -1;
					return true;
				}
				if (this.anInt973 == 200) {
					this.aBoolean251 = false;
					for (local160 = 0; local160 < 5; local160++) {
						this.aBooleanArray12[local160] = false;
					}
					this.anInt973 = -1;
					return true;
				}
				if (this.anInt973 == 162) {
					if (this.anInt982 != -1) {
						this.method616(this.anInt982);
						this.anInt982 = -1;
						this.aBoolean233 = true;
						this.aBoolean244 = true;
					}
					if (this.anInt871 != -1) {
						this.method616(this.anInt871);
						this.anInt871 = -1;
						this.aBoolean241 = true;
					}
					if (this.anInt1008 != -1) {
						this.method616(this.anInt1008);
						this.anInt1008 = -1;
						this.aBoolean228 = true;
					}
					if (this.anInt1003 != -1) {
						this.method616(this.anInt1003);
						this.anInt1003 = -1;
					}
					if (this.anInt903 != -1) {
						this.method616(this.anInt903);
						this.anInt903 = -1;
					}
					if (this.anInt912 != 0) {
						this.anInt912 = 0;
						this.aBoolean241 = true;
					}
					this.aBoolean231 = false;
					this.anInt973 = -1;
					return true;
				}
				if (this.anInt973 == 150) {
					this.aBoolean233 = true;
					local160 = this.aClass2_Sub1_Sub2_9.method127();
					local165 = this.aClass2_Sub1_Sub2_9.method114();
					local265 = this.aClass2_Sub1_Sub2_9.method94();
					this.anIntArray248[local165] = local160;
					this.anIntArray260[local165] = local265;
					this.anIntArray228[local165] = 1;
					for (local918 = 0; local918 < 98; local918++) {
						if (local160 >= anIntArray261[local918]) {
							this.anIntArray228[local165] = local918 + 2;
						}
					}
					this.anInt973 = -1;
					return true;
				}
				if (this.anInt973 == 212) {
					local160 = this.aClass2_Sub1_Sub2_9.method124((byte) 4);
					if (local160 >= 0) {
						this.method649(local160);
					}
					if (local160 != this.anInt870) {
						this.method616(this.anInt870);
						this.anInt870 = local160;
					}
					this.anInt973 = -1;
					return true;
				}
				if (this.anInt973 == 118) {
					local160 = this.aClass2_Sub1_Sub2_9.method112();
					local230 = this.aClass2_Sub1_Sub2_9.method101();
					local265 = this.aClass2_Sub1_Sub2_9.method113();
					if (local265 >= 1 && local265 <= 5) {
						if (local230.equalsIgnoreCase("null")) {
							local230 = null;
						}
						this.aStringArray10[local265 - 1] = local230;
						this.aBooleanArray11[local265 - 1] = local160 == 0;
					}
					this.anInt973 = -1;
					return true;
				}
				if (this.anInt973 == 215) {
					this.anInt1060 = this.aClass2_Sub1_Sub2_9.method94();
					if (this.anInt1060 == this.anInt1064) {
						if (this.anInt1060 == 3) {
							this.anInt1064 = 1;
						} else {
							this.anInt1064 = 3;
						}
						this.aBoolean233 = true;
					}
					this.anInt973 = -1;
					return true;
				}
				if (this.anInt973 == 183 || this.anInt973 == 152 || this.anInt973 == 25 || this.anInt973 == 1 || this.anInt973 == 143 || this.anInt973 == 99 || this.anInt973 == 201 || this.anInt973 == 174 || this.anInt973 == 39 || this.anInt973 == 128 || this.anInt973 == 168) {
					this.method635(this.aClass2_Sub1_Sub2_9, (byte) 6, this.anInt973);
					this.anInt973 = -1;
					return true;
				}
				if (this.anInt973 == 139) {
					for (local160 = 0; local160 < this.anIntArray225.length; local160++) {
						if (this.anIntArray225[local160] != this.anIntArray219[local160]) {
							this.anIntArray225[local160] = this.anIntArray219[local160];
							this.method634(local160);
							this.aBoolean233 = true;
						}
					}
					this.anInt973 = -1;
					return true;
				}
				if (this.anInt973 == 221) {
					this.anInt962 = this.aClass2_Sub1_Sub2_9.method94();
					this.anInt973 = -1;
					return true;
				}
				if (this.anInt973 == 72) {
					@Pc(3556) byte local3556 = this.aClass2_Sub1_Sub2_9.method115();
					local165 = this.aClass2_Sub1_Sub2_9.method122();
					this.anIntArray219[local165] = local3556;
					if (this.anIntArray225[local165] != local3556) {
						this.anIntArray225[local165] = local3556;
						this.method634(local165);
						this.aBoolean233 = true;
						if (this.anInt928 != -1) {
							this.aBoolean241 = true;
						}
					}
					this.anInt973 = -1;
					return true;
				}
				if (this.anInt973 == 43) {
					this.method671(27, this.anInt972, this.aClass2_Sub1_Sub2_9);
					this.aBoolean239 = false;
					this.anInt973 = -1;
					return true;
				}
				if (this.anInt973 == 203) {
					local160 = this.aClass2_Sub1_Sub2_9.method121();
					local165 = this.aClass2_Sub1_Sub2_9.method122();
					Class31.method403(local165).anInt507 = 1;
					Class31.method403(local165).anInt508 = local160;
					this.anInt973 = -1;
					return true;
				}
				if (this.anInt973 == 13) {
					this.anInt1066 = this.aClass2_Sub1_Sub2_9.method94();
					this.anInt900 = this.aClass2_Sub1_Sub2_9.method94();
					this.anInt895 = this.aClass2_Sub1_Sub2_9.method94();
					this.aBoolean226 = true;
					this.aBoolean241 = true;
					this.anInt973 = -1;
					return true;
				}
				if (this.anInt973 == 146) {
					local160 = this.aClass2_Sub1_Sub2_9.method96();
					@Pc(3690) boolean local3690 = this.aClass2_Sub1_Sub2_9.method113() == 1;
					Class31.method403(local160).aBoolean149 = local3690;
					this.anInt973 = -1;
					return true;
				}
				if (this.anInt973 == 144) {
					local160 = this.aClass2_Sub1_Sub2_9.method120();
					this.method649(local160);
					if (this.anInt982 != -1) {
						this.method616(this.anInt982);
						this.anInt982 = -1;
						this.aBoolean233 = true;
						this.aBoolean244 = true;
					}
					if (this.anInt1008 != -1) {
						this.method616(this.anInt1008);
						this.anInt1008 = -1;
						this.aBoolean228 = true;
					}
					if (this.anInt1003 != -1) {
						this.method616(this.anInt1003);
						this.anInt1003 = -1;
					}
					if (this.anInt903 != -1) {
						this.method616(this.anInt903);
						this.anInt903 = -1;
					}
					if (this.anInt871 != local160) {
						this.method616(this.anInt871);
						this.anInt871 = local160;
					}
					this.aBoolean231 = false;
					this.aBoolean241 = true;
					this.anInt973 = -1;
					return true;
				}
				if (this.anInt973 == 26) {
					this.aBoolean237 = false;
					this.anInt912 = 2;
					this.aString23 = "";
					this.aBoolean241 = true;
					this.anInt973 = -1;
					return true;
				}
				if (this.anInt973 == 178) {
					local160 = this.aClass2_Sub1_Sub2_9.method121();
					if (local160 == 65535) {
						local160 = -1;
					}
					if (local160 != this.anInt892 && this.aBoolean242 && !aBoolean272 && this.anInt1051 == 0) {
						this.anInt854 = local160;
						this.aBoolean230 = true;
						this.aClass9_Sub1_1.method526(2, this.anInt854);
					}
					this.anInt892 = local160;
					this.anInt973 = -1;
					return true;
				}
				if (this.anInt973 == 163) {
					local160 = this.aClass2_Sub1_Sub2_9.method125();
					local165 = this.aClass2_Sub1_Sub2_9.method120();
					if (this.aBoolean242 && !aBoolean272) {
						this.anInt854 = local165;
						this.aBoolean230 = false;
						this.aClass9_Sub1_1.method526(2, this.anInt854);
						this.anInt1051 = local160;
					}
					this.anInt973 = -1;
					return true;
				}
				if (this.anInt973 == 211) {
					local160 = this.aClass2_Sub1_Sub2_9.method96();
					local165 = this.aClass2_Sub1_Sub2_9.method120();
					this.method649(local165);
					if (local160 != -1) {
						this.method649(local160);
					}
					if (this.anInt903 != -1) {
						this.method616(this.anInt903);
						this.anInt903 = -1;
					}
					if (this.anInt982 != -1) {
						this.method616(this.anInt982);
						this.anInt982 = -1;
					}
					if (this.anInt871 != -1) {
						this.method616(this.anInt871);
						this.anInt871 = -1;
					}
					if (this.anInt1008 != local165) {
						this.method616(this.anInt1008);
						this.anInt1008 = local165;
					}
					if (this.anInt1003 != local165) {
						this.method616(this.anInt1003);
						this.anInt1003 = local160;
					}
					this.anInt912 = 0;
					this.aBoolean231 = false;
					this.anInt973 = -1;
					return true;
				}
				if (this.anInt973 == 32) {
					this.anInt925 = this.aClass2_Sub1_Sub2_9.method121();
					this.anInt998 = this.aClass2_Sub1_Sub2_9.method128();
					this.anInt849 = this.aClass2_Sub1_Sub2_9.method121();
					this.anInt984 = this.aClass2_Sub1_Sub2_9.method122();
					this.anInt889 = this.aClass2_Sub1_Sub2_9.method122();
					this.aClass2_Sub1_Sub2_9.method114();
					this.anInt1028 = this.aClass2_Sub1_Sub2_9.method96();
					this.anInt865 = this.aClass2_Sub1_Sub2_9.method120();
					this.anInt911 = this.aClass2_Sub1_Sub2_9.method96();
					this.anInt853 = this.aClass2_Sub1_Sub2_9.method121();
					this.aClass2_Sub1_Sub2_9.method122();
					signlink.dnslookup(Class34.method481(this.anInt998));
					this.anInt973 = -1;
					return true;
				}
				if (this.anInt973 == 190) {
					local160 = this.aClass2_Sub1_Sub2_9.method121();
					local165 = this.aClass2_Sub1_Sub2_9.method96();
					local265 = this.aClass2_Sub1_Sub2_9.method120();
					if (local165 == 65535) {
						Class31.method403(local160).anInt507 = 0;
						this.anInt973 = -1;
						return true;
					}
					@Pc(4102) Class32 local4102 = Class32.method412(local165);
					Class31.method403(local160).anInt507 = 4;
					Class31.method403(local160).anInt508 = local165;
					Class31.method403(local160).anInt519 = local4102.anInt525;
					Class31.method403(local160).anInt520 = local4102.anInt539;
					Class31.method403(local160).anInt518 = local4102.anInt531 * 100 / local265;
					this.anInt973 = -1;
					return true;
				}
				if (this.anInt973 == 154) {
					local2631 = this.aClass2_Sub1_Sub2_9.method100();
					local265 = this.aClass2_Sub1_Sub2_9.method99();
					local918 = this.aClass2_Sub1_Sub2_9.method94();
					local1033 = false;
					for (local928 = 0; local928 < 100; local928++) {
						if (this.anIntArray234[local928] == local265) {
							local1033 = true;
							break;
						}
					}
					if (local918 <= 1) {
						for (local939 = 0; local939 < this.anInt1039; local939++) {
							if (this.aLongArray4[local939] == local2631) {
								local1033 = true;
								break;
							}
						}
					}
					if (!local1033 && this.anInt1070 == 0) {
						try {
							this.anIntArray234[this.anInt919] = local265;
							this.anInt919 = (this.anInt919 + 1) % 100;
							local1168 = Class47.method561(this.aClass2_Sub1_Sub2_9, this.anInt972 - 13);
							if (local918 != 3) {
								local1168 = Class6.method143(local1168);
							}
							if (local918 == 2 || local918 == 3) {
								this.method724("@cr2@" + Class34.method482(Class34.method479(local2631)), local1168, 7);
							} else if (local918 == 1) {
								this.method724("@cr1@" + Class34.method482(Class34.method479(local2631)), local1168, 7);
							} else {
								this.method724(Class34.method482(Class34.method479(local2631)), local1168, 3);
							}
						} catch (@Pc(4286) Exception local4286) {
							signlink.reporterror("cde1");
						}
					}
					this.anInt973 = -1;
					return true;
				}
				if (this.anInt973 == 186) {
					local160 = this.aClass2_Sub1_Sub2_9.method120();
					local165 = this.aClass2_Sub1_Sub2_9.method97();
					local484 = Class31.method403(local160);
					if (local484.anInt497 != local165 || local165 == -1) {
						local484.anInt497 = local165;
						local484.anInt502 = 0;
						local484.anInt492 = 0;
					}
					this.anInt973 = -1;
					return true;
				}
				if (this.anInt973 == 112) {
					local160 = this.aClass2_Sub1_Sub2_9.method124((byte) 4);
					if (local160 != this.anInt928) {
						this.method616(this.anInt928);
						this.anInt928 = local160;
					}
					this.aBoolean241 = true;
					this.anInt973 = -1;
					return true;
				}
				if (this.anInt973 == 126) {
					this.anInt1054 = this.aClass2_Sub1_Sub2_9.method114();
					this.anInt1055 = this.aClass2_Sub1_Sub2_9.method94();
					for (local160 = this.anInt1054; local160 < this.anInt1054 + 8; local160++) {
						for (local165 = this.anInt1055; local165 < this.anInt1055 + 8; local165++) {
							if (this.aClass13ArrayArrayArray1[this.anInt882][local160][local165] != null) {
								this.aClass13ArrayArrayArray1[this.anInt882][local160][local165] = null;
								this.method599(local160, local165);
							}
						}
					}
					for (@Pc(4428) Class2_Sub3 local4428 = (Class2_Sub3) this.aClass13_11.method200(); local4428 != null; local4428 = (Class2_Sub3) this.aClass13_11.method202()) {
						if (local4428.anInt764 >= this.anInt1054 && local4428.anInt764 < this.anInt1054 + 8 && local4428.anInt765 >= this.anInt1055 && local4428.anInt765 < this.anInt1055 + 8 && local4428.anInt762 == this.anInt882) {
							local4428.anInt766 = 0;
						}
					}
					this.anInt973 = -1;
					return true;
				}
				signlink.reporterror("T1 - " + this.anInt973 + "," + this.anInt972 + " - " + this.anInt1043 + "," + this.anInt1044);
				this.method629();
			} catch (@Pc(4504) IOException local4504) {
				this.method660();
			} catch (@Pc(4509) Exception local4509) {
				local1017 = "T2 - " + this.anInt973 + "," + this.anInt1043 + "," + this.anInt1044 + " - " + this.anInt972 + "," + (this.anInt951 + aClass2_Sub1_Sub3_Sub1_Sub1_1.anIntArray165[0]) + "," + (this.anInt952 + aClass2_Sub1_Sub3_Sub1_Sub1_1.anIntArray166[0]) + " - ";
				for (local165 = 0; local165 < this.anInt972 && local165 < 50; local165++) {
					local1017 = local1017 + this.aClass2_Sub1_Sub2_9.aByteArray1[local165] + ",";
				}
				signlink.reporterror(local1017);
				this.method629();
			}
			return true;
		} catch (@Pc(4590) RuntimeException local4590) {
			signlink.reporterror("57892, " + arg0 + ", " + local4590.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "y", descriptor = "(I)Z")
	private boolean method673() {
		try {
			return signlink.wavereplay();
		} catch (@Pc(8) RuntimeException local8) {
			signlink.reporterror("94278, " + -313 + ", " + local8.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "A", descriptor = "(I)V")
	private void method675() {
		try {
			if (502 == this.anInt874 && (this.anInt1007 == 0 && super.anInt843 == 1)) {
				@Pc(19) int local19 = super.anInt844 - 25 - 550;
				@Pc(26) int local26 = super.anInt845 - 5 - 4;
				if (local19 >= 0 && local26 >= 0 && local19 < 146 && local26 < 151) {
					local19 -= 73;
					local26 -= 75;
					@Pc(46) int local46 = this.anInt857 + this.anInt1017 & 0x7FF;
					@Pc(50) int local50 = Class2_Sub1_Sub1_Sub3.anIntArray57[local46];
					@Pc(54) int local54 = Class2_Sub1_Sub1_Sub3.anIntArray58[local46];
					@Pc(63) int local63 = local50 * (this.anInt926 + 256) >> 8;
					@Pc(72) int local72 = local54 * (this.anInt926 + 256) >> 8;
					@Pc(82) int local82 = local26 * local63 + local19 * local72 >> 11;
					@Pc(92) int local92 = local26 * local72 - local19 * local63 >> 11;
					@Pc(99) int local99 = aClass2_Sub1_Sub3_Sub1_Sub1_1.anInt680 + local82 >> 7;
					@Pc(106) int local106 = aClass2_Sub1_Sub3_Sub1_Sub1_1.anInt681 - local92 >> 7;
					@Pc(127) boolean local127 = this.method659(0, 0, 0, local99, aClass2_Sub1_Sub3_Sub1_Sub1_1.anIntArray166[0], 1, 0, aClass2_Sub1_Sub3_Sub1_Sub1_1.anIntArray165[0], true, 0, local106);
					if (local127) {
						this.aClass2_Sub1_Sub2_6.method84(local19);
						this.aClass2_Sub1_Sub2_6.method84(local26);
						this.aClass2_Sub1_Sub2_6.method85(this.anInt857);
						this.aClass2_Sub1_Sub2_6.method84(57);
						this.aClass2_Sub1_Sub2_6.method84(this.anInt1017);
						this.aClass2_Sub1_Sub2_6.method84(this.anInt926);
						this.aClass2_Sub1_Sub2_6.method84(89);
						this.aClass2_Sub1_Sub2_6.method85(aClass2_Sub1_Sub3_Sub1_Sub1_1.anInt680);
						this.aClass2_Sub1_Sub2_6.method85(aClass2_Sub1_Sub3_Sub1_Sub1_1.anInt681);
						this.aClass2_Sub1_Sub2_6.method84(this.anInt868);
						this.aClass2_Sub1_Sub2_6.method84(63);
						return;
					}
				}
			}
		} catch (@Pc(181) RuntimeException local181) {
			signlink.reporterror("34202, " + 502 + ", " + local181.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "B", descriptor = "(I)V")
	private void method676() {
		try {
			if (super.anInt843 == 1) {
				if (super.anInt844 >= 539 && super.anInt844 <= 573 && super.anInt845 >= 169 && super.anInt845 < 205 && this.anIntArray257[0] != -1) {
					this.aBoolean233 = true;
					this.anInt1064 = 0;
					this.aBoolean244 = true;
				}
				if (super.anInt844 >= 569 && super.anInt844 <= 599 && super.anInt845 >= 168 && super.anInt845 < 205 && this.anIntArray257[1] != -1) {
					this.aBoolean233 = true;
					this.anInt1064 = 1;
					this.aBoolean244 = true;
				}
				if (super.anInt844 >= 597 && super.anInt844 <= 627 && super.anInt845 >= 168 && super.anInt845 < 205 && this.anIntArray257[2] != -1) {
					this.aBoolean233 = true;
					this.anInt1064 = 2;
					this.aBoolean244 = true;
				}
				if (super.anInt844 >= 625 && super.anInt844 <= 669 && super.anInt845 >= 168 && super.anInt845 < 203 && this.anIntArray257[3] != -1) {
					this.aBoolean233 = true;
					this.anInt1064 = 3;
					this.aBoolean244 = true;
				}
				if (super.anInt844 >= 666 && super.anInt844 <= 696 && super.anInt845 >= 168 && super.anInt845 < 205 && this.anIntArray257[4] != -1) {
					this.aBoolean233 = true;
					this.anInt1064 = 4;
					this.aBoolean244 = true;
				}
				if (super.anInt844 >= 694 && super.anInt844 <= 724 && super.anInt845 >= 168 && super.anInt845 < 205 && this.anIntArray257[5] != -1) {
					this.aBoolean233 = true;
					this.anInt1064 = 5;
					this.aBoolean244 = true;
				}
				if (super.anInt844 >= 722 && super.anInt844 <= 756 && super.anInt845 >= 169 && super.anInt845 < 205 && this.anIntArray257[6] != -1) {
					this.aBoolean233 = true;
					this.anInt1064 = 6;
					this.aBoolean244 = true;
				}
				if (super.anInt844 >= 540 && super.anInt844 <= 574 && super.anInt845 >= 466 && super.anInt845 < 502 && this.anIntArray257[7] != -1) {
					this.aBoolean233 = true;
					this.anInt1064 = 7;
					this.aBoolean244 = true;
				}
				if (super.anInt844 >= 572 && super.anInt844 <= 602 && super.anInt845 >= 466 && super.anInt845 < 503 && this.anIntArray257[8] != -1) {
					this.aBoolean233 = true;
					this.anInt1064 = 8;
					this.aBoolean244 = true;
				}
				if (super.anInt844 >= 599 && super.anInt844 <= 629 && super.anInt845 >= 466 && super.anInt845 < 503 && this.anIntArray257[9] != -1) {
					this.aBoolean233 = true;
					this.anInt1064 = 9;
					this.aBoolean244 = true;
				}
				if (super.anInt844 >= 627 && super.anInt844 <= 671 && super.anInt845 >= 467 && super.anInt845 < 502 && this.anIntArray257[10] != -1) {
					this.aBoolean233 = true;
					this.anInt1064 = 10;
					this.aBoolean244 = true;
				}
				if (super.anInt844 >= 669 && super.anInt844 <= 699 && super.anInt845 >= 466 && super.anInt845 < 503 && this.anIntArray257[11] != -1) {
					this.aBoolean233 = true;
					this.anInt1064 = 11;
					this.aBoolean244 = true;
				}
				if (super.anInt844 >= 696 && super.anInt844 <= 726 && super.anInt845 >= 466 && super.anInt845 < 503 && this.anIntArray257[12] != -1) {
					this.aBoolean233 = true;
					this.anInt1064 = 12;
					this.aBoolean244 = true;
				}
				if (super.anInt844 >= 724 && super.anInt844 <= 758 && super.anInt845 >= 466 && super.anInt845 < 502 && this.anIntArray257[13] != -1) {
					this.aBoolean233 = true;
					this.anInt1064 = 13;
					this.aBoolean244 = true;
				}
				anInt1027++;
				if (anInt1027 > 153) {
					anInt1027 = 0;
					this.aClass2_Sub1_Sub2_6.method83(155);
					this.aClass2_Sub1_Sub2_6.method84(114);
					return;
				}
			}
		} catch (@Pc(467) RuntimeException local467) {
			signlink.reporterror("50291, " + -12559 + ", " + local467.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "C", descriptor = "(I)V")
	private void method677(@OriginalArg(0) int arg0) {
		try {
			if (arg0 != 9998) {
				this.aClass13ArrayArrayArray1 = null;
			}
			if (aBoolean272 && this.anInt929 == 2 && Class42.anInt770 != this.anInt882) {
				this.method630("Loading - please wait.", null, this.anInt896);
				this.anInt929 = 1;
				this.aLong33 = System.currentTimeMillis();
			}
			if (this.anInt929 == 1) {
				@Pc(35) int local35 = this.method678();
				if (local35 != 0 && System.currentTimeMillis() - this.aLong33 > 360000L) {
					signlink.reporterror(this.aString26 + " glcfb " + this.aLong32 + "," + local35 + "," + aBoolean272 + "," + this.aClass36Array1[0] + "," + this.aClass9_Sub1_1.method522() + "," + this.anInt882 + "," + this.anInt1005 + "," + this.anInt1006);
					this.aLong33 = System.currentTimeMillis();
				}
			}
			if (this.anInt929 == 2 && this.anInt882 != this.anInt971) {
				this.anInt971 = this.anInt882;
				this.method663(this.anInt882);
			}
		} catch (@Pc(116) RuntimeException local116) {
			signlink.reporterror("51657, " + arg0 + ", " + local116.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "D", descriptor = "(I)I")
	private int method678() {
		try {
			for (@Pc(3) int local3 = 0; local3 < this.aByteArrayArray5.length; local3++) {
				if (this.aByteArrayArray5[local3] == null && this.anIntArray254[local3] != -1) {
					return -1;
				}
				if (this.aByteArrayArray6[local3] == null && this.anIntArray255[local3] != -1) {
					return -2;
				}
			}
			@Pc(39) boolean local39 = true;
			for (@Pc(41) int local41 = 0; local41 < this.aByteArrayArray5.length; local41++) {
				@Pc(48) byte[] local48 = this.aByteArrayArray6[local41];
				if (local48 != null) {
					@Pc(62) int local62 = (this.anIntArray253[local41] >> 8) * 64 - this.anInt951;
					@Pc(74) int local74 = (this.anIntArray253[local41] & 0xFF) * 64 - this.anInt952;
					if (this.aBoolean268) {
						local62 = 10;
						local74 = 10;
					}
					local39 &= Class42.method543(local74, this.anInt877, local48, local62);
				}
			}
			if (!local39) {
				return -3;
			} else if (this.aBoolean239) {
				return -4;
			} else {
				this.anInt929 = 2;
				Class42.anInt770 = this.anInt882;
				this.method644();
				this.aClass2_Sub1_Sub2_6.method83(233);
				return 0;
			}
		} catch (@Pc(126) RuntimeException local126) {
			signlink.reporterror("90709, " + 335 + ", " + local126.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(ZI)V")
	private void method679(@OriginalArg(1) int arg0) {
		try {
			if (!aBoolean272) {
				for (@Pc(10) int local10 = 0; local10 < this.anIntArray262.length; local10++) {
					@Pc(17) int local17 = this.anIntArray262[local10];
					if (Class2_Sub1_Sub1_Sub3.anIntArray61[local17] >= arg0) {
						@Pc(26) Class2_Sub1_Sub1_Sub4 local26 = Class2_Sub1_Sub1_Sub3.aClass2_Sub1_Sub1_Sub4Array1[local17];
						@Pc(34) int local34 = local26.anInt292 * local26.anInt293 - 1;
						@Pc(42) int local42 = local26.anInt292 * this.anInt885 * 2;
						@Pc(45) byte[] local45 = local26.aByteArray10;
						@Pc(48) byte[] local48 = this.aByteArray21;
						for (@Pc(50) int local50 = 0; local50 <= local34; local50++) {
							local48[local50] = local45[local50 - local42 & local34];
						}
						local26.aByteArray10 = local48;
						this.aByteArray21 = local45;
						Class2_Sub1_Sub1_Sub3.method254(local17);
					}
				}
			}
		} catch (@Pc(83) RuntimeException local83) {
			signlink.reporterror("40508, " + true + ", " + arg0 + ", " + local83.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIIIZ)V")
	private void method680(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		try {
			@Pc(8) int local8 = this.aClass29_1.method350(arg3, arg1, arg0);
			@Pc(18) int local18;
			@Pc(24) int local24;
			@Pc(28) int local28;
			@Pc(30) int local30;
			@Pc(52) int local52;
			@Pc(58) int local58;
			if (local8 != 0) {
				local18 = this.aClass29_1.method354(arg3, arg1, arg0, local8);
				local24 = local18 >> 6 & 0x3;
				local28 = local18 & 0x1F;
				local30 = arg4;
				if (local8 > 0) {
					local30 = arg2;
				}
				@Pc(38) int[] local38 = this.aClass2_Sub1_Sub1_Sub2_9.anIntArray10;
				local52 = arg1 * 4 + (103 - arg0) * 512 * 4 + 24624;
				local58 = local8 >> 14 & 0x7FFF;
				@Pc(61) Class33 local61 = Class33.method459(local58);
				if (local61.anInt600 == -1) {
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
					@Pc(71) Class2_Sub1_Sub1_Sub4 local71 = this.aClass2_Sub1_Sub1_Sub4Array5[local61.anInt600];
					if (local71 != null) {
						@Pc(83) int local83 = (local61.anInt609 * 4 - local71.anInt292) / 2;
						@Pc(93) int local93 = (local61.anInt617 * 4 - local71.anInt293) / 2;
						local71.method290((104 - arg0 - local61.anInt617) * 4 + local93 + 48, arg1 * 4 + 48 + local83);
					}
				}
			}
			local8 = this.aClass29_1.method352(arg3, arg1, arg0);
			if (local8 != 0) {
				local18 = this.aClass29_1.method354(arg3, arg1, arg0, local8);
				local24 = local18 >> 6 & 0x3;
				local28 = local18 & 0x1F;
				local30 = local8 >> 14 & 0x7FFF;
				@Pc(455) Class33 local455 = Class33.method459(local30);
				@Pc(487) int local487;
				if (local455.anInt600 != -1) {
					@Pc(465) Class2_Sub1_Sub1_Sub4 local465 = this.aClass2_Sub1_Sub1_Sub4Array5[local455.anInt600];
					if (local465 != null) {
						local58 = (local455.anInt609 * 4 - local465.anInt292) / 2;
						local487 = (local455.anInt617 * 4 - local465.anInt293) / 2;
						local465.method290((104 - arg0 - local455.anInt617) * 4 + local487 + 48, arg1 * 4 + 48 + local58);
					}
				} else if (local28 == 9) {
					local52 = 15658734;
					if (local8 > 0) {
						local52 = 15597568;
					}
					@Pc(524) int[] local524 = this.aClass2_Sub1_Sub1_Sub2_9.anIntArray10;
					local487 = arg1 * 4 + (103 - arg0) * 512 * 4 + 24624;
					if (local24 == 0 || local24 == 2) {
						local524[local487 + 1536] = local52;
						local524[local487 + 1024 + 1] = local52;
						local524[local487 + 512 + 2] = local52;
						local524[local487 + 3] = local52;
					} else {
						local524[local487] = local52;
						local524[local487 + 512 + 1] = local52;
						local524[local487 + 1024 + 2] = local52;
						local524[local487 + 1536 + 3] = local52;
					}
				}
			}
			local8 = this.aClass29_1.method353(arg3, arg1, arg0);
			if (local8 != 0) {
				local18 = local8 >> 14 & 0x7FFF;
				@Pc(619) Class33 local619 = Class33.method459(local18);
				if (local619.anInt600 != -1) {
					@Pc(629) Class2_Sub1_Sub1_Sub4 local629 = this.aClass2_Sub1_Sub1_Sub4Array5[local619.anInt600];
					if (local629 != null) {
						local30 = (local619.anInt609 * 4 - local629.anInt292) / 2;
						@Pc(651) int local651 = (local619.anInt617 * 4 - local629.anInt293) / 2;
						local629.method290((104 - arg0 - local619.anInt617) * 4 + local651 + 48, arg1 * 4 + 48 + local30);
						return;
					}
				}
			}
		} catch (@Pc(675) RuntimeException local675) {
			signlink.reporterror("81132, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + true + ", " + local675.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "l", descriptor = "(B)V")
	private void method681() {
		try {
			if (this.anInt1030 == 2) {
				this.method646(this.anInt979 * 2, (this.anInt977 - this.anInt951 << 7) + this.anInt980, (this.anInt978 - this.anInt952 << 7) + this.anInt981);
				if (this.anInt941 > -1 && anInt970 % 20 < 10) {
					this.aClass2_Sub1_Sub1_Sub2Array7[0].method69(this.anInt942 - 28, this.anInt941 - 12);
				}
			}
		} catch (@Pc(62) RuntimeException local62) {
			signlink.reporterror("83620, " + 72 + ", " + local62.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "h", descriptor = "(Z)V")
	private void method682() {
		try {
			this.aBoolean240 = true;
			for (@Pc(6) int local6 = 0; local6 < 7; local6++) {
				this.anIntArray212[local6] = -1;
				for (@Pc(15) int local15 = 0; local15 < Class14.anInt171; local15++) {
					if (!Class14.aClass14Array1[local15].aBoolean76 && Class14.aClass14Array1[local15].anInt172 == local6 + (this.aBoolean256 ? 0 : 7)) {
						this.anIntArray212[local6] = local15;
						break;
					}
				}
			}
		} catch (@Pc(57) RuntimeException local57) {
			signlink.reporterror("60852, " + false + ", " + local57.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "g", descriptor = "(II)Ljava/lang/String;")
	private String method684(@OriginalArg(0) int arg0) {
		try {
			return arg0 < 999999999 ? String.valueOf(arg0) : "*";
		} catch (@Pc(17) RuntimeException local17) {
			signlink.reporterror("95393, " + arg0 + ", " + -120 + ", " + local17.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "i", descriptor = "(Z)I")
	private int method685() {
		try {
			@Pc(3) int local3 = 3;
			if (this.anInt916 < 310) {
				@Pc(17) int local17 = this.anInt913 >> 7;
				@Pc(22) int local22 = this.anInt915 >> 7;
				@Pc(27) int local27 = aClass2_Sub1_Sub3_Sub1_Sub1_1.anInt680 >> 7;
				@Pc(32) int local32 = aClass2_Sub1_Sub3_Sub1_Sub1_1.anInt681 >> 7;
				if ((this.aByteArrayArrayArray8[this.anInt882][local17][local22] & 0x4) != 0) {
					local3 = this.anInt882;
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
						if ((this.aByteArrayArrayArray8[this.anInt882][local17][local22] & 0x4) != 0) {
							local3 = this.anInt882;
						}
						local84 += local82;
						if (local84 >= 65536) {
							local84 -= 65536;
							if (local22 < local32) {
								local22++;
							} else if (local22 > local32) {
								local22--;
							}
							if ((this.aByteArrayArrayArray8[this.anInt882][local17][local22] & 0x4) != 0) {
								local3 = this.anInt882;
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
						if ((this.aByteArrayArrayArray8[this.anInt882][local17][local22] & 0x4) != 0) {
							local3 = this.anInt882;
						}
						local84 += local82;
						if (local84 >= 65536) {
							local84 -= 65536;
							if (local17 < local27) {
								local17++;
							} else if (local17 > local27) {
								local17--;
							}
							if ((this.aByteArrayArrayArray8[this.anInt882][local17][local22] & 0x4) != 0) {
								local3 = this.anInt882;
							}
						}
					}
				}
			}
			if ((this.aByteArrayArrayArray8[this.anInt882][aClass2_Sub1_Sub3_Sub1_Sub1_1.anInt680 >> 7][aClass2_Sub1_Sub3_Sub1_Sub1_1.anInt681 >> 7] & 0x4) != 0) {
				local3 = this.anInt882;
			}
			return local3;
		} catch (@Pc(250) RuntimeException local250) {
			signlink.reporterror("13607, " + true + ", " + local250.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "F", descriptor = "(I)I")
	private int method686() {
		try {
			@Pc(16) int local16 = this.method622(this.anInt915, this.anInt882, this.anInt913);
			return local16 - this.anInt914 >= 800 || (this.aByteArrayArrayArray8[this.anInt882][this.anInt913 >> 7][this.anInt915 >> 7] & 0x4) == 0 ? 3 : this.anInt882;
		} catch (@Pc(46) RuntimeException local46) {
			signlink.reporterror("9490, " + -651 + ", " + local46.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "G", descriptor = "(I)V")
	private void method687() {
		try {
			if (this.anInt986 != 0) {
				@Pc(5) int local5 = 0;
				if (this.anInt1068 != 0) {
					local5 = 1;
				}
				for (@Pc(12) int local12 = 0; local12 < 100; local12++) {
					if (this.aStringArray13[local12] != null) {
						@Pc(24) int local24 = this.anIntArray264[local12];
						@Pc(29) String local29 = this.aStringArray12[local12];
						if (local29 != null && local29.startsWith("@cr1@")) {
							local29 = local29.substring(5);
						}
						if (local29 != null && local29.startsWith("@cr2@")) {
							local29 = local29.substring(5);
						}
						if ((local24 == 3 || local24 == 7) && (local24 == 7 || this.anInt900 == 0 || this.anInt900 == 1 && this.method642(local29))) {
							@Pc(82) int local82 = 329 - local5 * 13;
							if (super.anInt838 > 4 && super.anInt839 - 4 > local82 - 10 && super.anInt839 - 4 <= local82 + 3) {
								@Pc(121) int local121 = this.aClass2_Sub1_Sub1_Sub1_3.method37("From:  " + local29 + this.aStringArray13[local12]) + 25;
								if (local121 > 450) {
									local121 = 450;
								}
								if (super.anInt838 < local121 + 4) {
									if (this.anInt921 >= 1) {
										this.aStringArray8[this.anInt1004] = "Report abuse @whi@" + local29;
										this.anIntArray222[this.anInt1004] = 2160;
										this.anInt1004++;
									}
									this.aStringArray8[this.anInt1004] = "Add ignore @whi@" + local29;
									this.anIntArray222[this.anInt1004] = 2352;
									this.anInt1004++;
									this.aStringArray8[this.anInt1004] = "Add friend @whi@" + local29;
									this.anIntArray222[this.anInt1004] = 2702;
									this.anInt1004++;
								}
							}
							local5++;
							if (local5 >= 5) {
								return;
							}
						}
						if ((local24 == 5 || local24 == 6) && this.anInt900 < 2) {
							local5++;
							if (local5 >= 5) {
								return;
							}
						}
					}
				}
			}
		} catch (@Pc(241) RuntimeException local241) {
			signlink.reporterror("64549, " + 31518 + ", " + local241.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
	@Override
	public AppletContext getAppletContext() {
		return signlink.mainapp == null ? super.getAppletContext() : signlink.mainapp.getAppletContext();
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IILclient!YSYPMZMO;II)V")
	private void method688(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class48 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		try {
			if (this.anInt1004 < 400) {
				if (arg2.anIntArray195 != null) {
					arg2 = arg2.method570();
				}
				if (arg2 != null && arg2.aBoolean219) {
					@Pc(23) String local23 = arg2.aString16;
					@Pc(27) boolean local27 = false;
					if (arg2.anInt808 != 0) {
						local23 = local23 + method656(arg2.anInt808, aClass2_Sub1_Sub3_Sub1_Sub1_1.anInt355) + " (level-" + arg2.anInt808 + ")";
					}
					if (this.anInt955 == 1) {
						this.aStringArray8[this.anInt1004] = "Use " + this.aString25 + " with @yel@" + local23;
						this.anIntArray222[this.anInt1004] = 669;
						this.anIntArray223[this.anInt1004] = arg1;
						this.anIntArray220[this.anInt1004] = arg4;
						this.anIntArray221[this.anInt1004] = arg0;
						this.anInt1004++;
					} else if (this.anInt1000 != 1) {
						@Pc(165) int local165;
						if (arg2.aStringArray7 != null) {
							for (local165 = 4; local165 >= 0; local165--) {
								if (arg2.aStringArray7[local165] != null && !arg2.aStringArray7[local165].equalsIgnoreCase("attack")) {
									this.aStringArray8[this.anInt1004] = arg2.aStringArray7[local165] + " @yel@" + local23;
									if (local165 == 0) {
										this.anIntArray222[this.anInt1004] = 15;
									}
									if (local165 == 1) {
										this.anIntArray222[this.anInt1004] = 271;
									}
									if (local165 == 2) {
										this.anIntArray222[this.anInt1004] = 764;
									}
									if (local165 == 3) {
										this.anIntArray222[this.anInt1004] = 410;
									}
									if (local165 == 4) {
										this.anIntArray222[this.anInt1004] = 816;
									}
									this.anIntArray223[this.anInt1004] = arg1;
									this.anIntArray220[this.anInt1004] = arg4;
									this.anIntArray221[this.anInt1004] = arg0;
									this.anInt1004++;
								}
							}
						}
						if (arg2.aStringArray7 != null) {
							for (local165 = 4; local165 >= 0; local165--) {
								if (arg2.aStringArray7[local165] != null && arg2.aStringArray7[local165].equalsIgnoreCase("attack")) {
									@Pc(289) short local289 = 0;
									if (arg2.anInt808 > aClass2_Sub1_Sub3_Sub1_Sub1_1.anInt355) {
										local289 = 2000;
									}
									this.aStringArray8[this.anInt1004] = arg2.aStringArray7[local165] + " @yel@" + local23;
									if (local165 == 0) {
										this.anIntArray222[this.anInt1004] = local289 + 15;
									}
									if (local165 == 1) {
										this.anIntArray222[this.anInt1004] = local289 + 271;
									}
									if (local165 == 2) {
										this.anIntArray222[this.anInt1004] = local289 + 764;
									}
									if (local165 == 3) {
										this.anIntArray222[this.anInt1004] = local289 + 410;
									}
									if (local165 == 4) {
										this.anIntArray222[this.anInt1004] = local289 + 816;
									}
									this.anIntArray223[this.anInt1004] = arg1;
									this.anIntArray220[this.anInt1004] = arg4;
									this.anIntArray221[this.anInt1004] = arg0;
									this.anInt1004++;
								}
							}
						}
						this.aStringArray8[this.anInt1004] = "Examine @yel@" + local23;
						this.anIntArray222[this.anInt1004] = 1020;
						this.anIntArray223[this.anInt1004] = arg1;
						this.anIntArray220[this.anInt1004] = arg4;
						this.anIntArray221[this.anInt1004] = arg0;
						this.anInt1004++;
					} else if ((this.anInt1002 & 0x2) == 2) {
						this.aStringArray8[this.anInt1004] = this.aString28 + " @yel@" + local23;
						this.anIntArray222[this.anInt1004] = 533;
						this.anIntArray223[this.anInt1004] = arg1;
						this.anIntArray220[this.anInt1004] = arg4;
						this.anIntArray221[this.anInt1004] = arg0;
						this.anInt1004++;
						return;
					}
				}
			}
		} catch (@Pc(439) RuntimeException local439) {
			signlink.reporterror("29886, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local439.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "H", descriptor = "(I)V")
	private void method689() {
		try {
			this.anInt972 += 0;
			if (this.anInt935 == 0) {
				@Pc(12) int local12 = super.anInt843;
				if (this.anInt1000 == 1 && super.anInt844 >= 516 && super.anInt845 >= 160 && super.anInt844 <= 765 && super.anInt845 <= 205) {
					local12 = 0;
				}
				@Pc(43) int local43;
				@Pc(46) int local46;
				@Pc(122) int local122;
				if (this.aBoolean262) {
					if (local12 != 1) {
						local43 = super.anInt838;
						local46 = super.anInt839;
						if (this.anInt1046 == 0) {
							local43 -= 4;
							local46 -= 4;
						}
						if (this.anInt1046 == 1) {
							local43 -= 553;
							local46 -= 205;
						}
						if (this.anInt1046 == 2) {
							local43 -= 17;
							local46 -= 357;
						}
						if (local43 < this.anInt1047 - 10 || local43 > this.anInt1047 + this.anInt1049 + 10 || local46 < this.anInt1048 - 10 || local46 > this.anInt1048 + this.anInt1050 + 10) {
							this.aBoolean262 = false;
							if (this.anInt1046 == 1) {
								this.aBoolean233 = true;
							}
							if (this.anInt1046 == 2) {
								this.aBoolean241 = true;
							}
						}
					}
					if (local12 == 1) {
						local43 = this.anInt1047;
						local46 = this.anInt1048;
						local122 = this.anInt1049;
						@Pc(125) int local125 = super.anInt844;
						@Pc(128) int local128 = super.anInt845;
						if (this.anInt1046 == 0) {
							local125 -= 4;
							local128 -= 4;
						}
						if (this.anInt1046 == 1) {
							local125 -= 553;
							local128 -= 205;
						}
						if (this.anInt1046 == 2) {
							local125 -= 17;
							local128 -= 357;
						}
						@Pc(147) int local147 = -1;
						for (@Pc(149) int local149 = 0; local149 < this.anInt1004; local149++) {
							@Pc(164) int local164 = local46 + (this.anInt1004 - 1 - local149) * 15 + 31;
							if (local125 > local43 && local125 < local43 + local122 && local128 > local164 - 13 && local128 < local164 + 3) {
								local147 = local149;
							}
						}
						if (local147 != -1) {
							this.method668(local147);
						}
						this.aBoolean262 = false;
						if (this.anInt1046 == 1) {
							this.aBoolean233 = true;
						}
						if (this.anInt1046 == 2) {
							this.aBoolean241 = true;
							return;
						}
					}
				} else {
					if (local12 == 1 && this.anInt1004 > 0) {
						local43 = this.anIntArray222[this.anInt1004 - 1];
						if (local43 == 155 || local43 == 717 || local43 == 242 || local43 == 339 || local43 == 509 || local43 == 414 || local43 == 424 || local43 == 38 || local43 == 19 || local43 == 936 || local43 == 638 || local43 == 1455) {
							local46 = this.anIntArray220[this.anInt1004 - 1];
							local122 = this.anIntArray221[this.anInt1004 - 1];
							@Pc(283) Class31 local283 = Class31.method403(local122);
							if (local283.aBoolean144 || local283.aBoolean146) {
								this.aBoolean270 = false;
								this.anInt880 = 0;
								this.anInt933 = local122;
								this.anInt934 = local46;
								this.anInt935 = 2;
								this.anInt936 = super.anInt844;
								this.anInt937 = super.anInt845;
								if (Class31.method403(local122).anInt494 == this.anInt903) {
									this.anInt935 = 1;
								}
								if (Class31.method403(local122).anInt494 == this.anInt871) {
									this.anInt935 = 3;
								}
								return;
							}
						}
					}
					if (local12 == 1 && (this.anInt867 == 1 || this.method632(this.anInt1004 - 1)) && this.anInt1004 > 2) {
						local12 = 2;
					}
					if (local12 == 1 && this.anInt1004 > 0) {
						this.method668(this.anInt1004 - 1);
					}
					if (local12 != 2 || this.anInt1004 <= 0) {
						return;
					}
					this.method605();
				}
			}
		} catch (@Pc(376) RuntimeException local376) {
			signlink.reporterror("16108, " + 0 + ", " + local376.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ZJ)V")
	private void method690(@OriginalArg(1) long arg0) {
		try {
			if (arg0 != 0L) {
				for (@Pc(13) int local13 = 0; local13 < this.anInt1013; local13++) {
					if (this.aLongArray3[local13] == arg0) {
						this.anInt1013--;
						this.aBoolean233 = true;
						for (@Pc(33) int local33 = local13; local33 < this.anInt1013; local33++) {
							this.aStringArray11[local33] = this.aStringArray11[local33 + 1];
							this.anIntArray252[local33] = this.anIntArray252[local33 + 1];
							this.aLongArray3[local33] = this.aLongArray3[local33 + 1];
						}
						this.aClass2_Sub1_Sub2_6.method83(44);
						this.aClass2_Sub1_Sub2_6.method90(arg0);
						return;
					}
				}
			}
		} catch (@Pc(88) RuntimeException local88) {
			signlink.reporterror("99281, " + true + ", " + arg0 + ", " + local88.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(ILclient!BISLJVZR;II)V")
	private void method691(@OriginalArg(1) Class2_Sub1_Sub1_Sub2 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		try {
			if (arg0 != null) {
				@Pc(10) int local10 = this.anInt857 + this.anInt1017 & 0x7FF;
				@Pc(18) int local18 = arg2 * arg2 + arg1 * arg1;
				if (local18 <= 6400) {
					@Pc(26) int local26 = Class2_Sub1_Sub3_Sub4.anIntArray150[local10];
					@Pc(30) int local30 = Class2_Sub1_Sub3_Sub4.anIntArray151[local10];
					@Pc(39) int local39 = local26 * 256 / (this.anInt926 + 256);
					@Pc(59) int local59 = local30 * 256 / (this.anInt926 + 256);
					@Pc(69) int local69 = arg1 * local39 + arg2 * local59 >> 16;
					@Pc(79) int local79 = arg1 * local59 - arg2 * local39 >> 16;
					if (local18 > 2500) {
						arg0.method75(local69 + 94 + 4 - arg0.anInt65 / 2, this.aClass2_Sub1_Sub1_Sub4_9, 83 - local79 - arg0.anInt66 / 2 - 4);
					} else {
						arg0.method69(83 - local79 - arg0.anInt66 / 2 - 4, local69 + 94 - arg0.anInt65 / 2 + 4);
					}
				}
			}
		} catch (@Pc(133) RuntimeException local133) {
			signlink.reporterror("60946, " + 30930 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local133.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(B)V")
	@Override
	protected void method584() {
		try {
			if (this.aBoolean266 || this.aBoolean267 || this.aBoolean232) {
				this.method624();
			} else {
				anInt1016++;
				if (this.aBoolean248) {
					this.method709();
				} else {
					this.method712(false);
				}
				this.anInt944 = 0;
			}
		} catch (@Pc(45) RuntimeException local45) {
			signlink.reporterror("6451, " + 84 + ", " + local45.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILclient!QHGHUTGN;I)I")
	private int method692(@OriginalArg(0) int arg0, @OriginalArg(1) Class31 arg1) {
		try {
			if (arg1.anIntArrayArray14 == null || arg0 >= arg1.anIntArrayArray14.length) {
				return -2;
			}
			try {
				@Pc(21) int[] local21 = arg1.anIntArrayArray14[arg0];
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
						local34 = this.anIntArray260[local21[local25++]];
					}
					if (local32 == 2) {
						local34 = this.anIntArray228[local21[local25++]];
					}
					if (local32 == 3) {
						local34 = this.anIntArray248[local21[local25++]];
					}
					@Pc(82) Class31 local82;
					@Pc(87) int local87;
					@Pc(100) int local100;
					if (local32 == 4) {
						local82 = Class31.method403(local21[local25++]);
						local87 = local21[local25++];
						if (local87 >= 0 && local87 < Class32.anInt522 && (!Class32.method412(local87).aBoolean155 || aBoolean271)) {
							for (local100 = 0; local100 < local82.anIntArray101.length; local100++) {
								if (local82.anIntArray101[local100] == local87 + 1) {
									local34 += local82.anIntArray106[local100];
								}
							}
						}
					}
					if (local32 == 5) {
						local34 = this.anIntArray225[local21[local25++]];
					}
					if (local32 == 6) {
						local34 = anIntArray261[this.anIntArray228[local21[local25++]] - 1];
					}
					if (local32 == 7) {
						local34 = this.anIntArray225[local21[local25++]] * 100 / 46875;
					}
					if (local32 == 8) {
						local34 = aClass2_Sub1_Sub3_Sub1_Sub1_1.anInt355;
					}
					@Pc(175) int local175;
					if (local32 == 9) {
						for (local175 = 0; local175 < Class39.anInt728; local175++) {
							if (Class39.aBooleanArray9[local175]) {
								local34 += this.anIntArray228[local175];
							}
						}
					}
					if (local32 == 10) {
						local82 = Class31.method403(local21[local25++]);
						local87 = local21[local25++] + 1;
						if (local87 >= 0 && local87 < Class32.anInt522 && (!Class32.method412(local87).aBoolean155 || aBoolean271)) {
							for (local100 = 0; local100 < local82.anIntArray101.length; local100++) {
								if (local82.anIntArray101[local100] == local87) {
									local34 = 999999999;
									break;
								}
							}
						}
					}
					if (local32 == 11) {
						local34 = this.anInt876;
					}
					if (local32 == 12) {
						local34 = this.anInt1012;
					}
					if (local32 == 13) {
						local175 = this.anIntArray225[local21[local25++]];
						local87 = local21[local25++];
						local34 = (local175 & 0x1 << local87) == 0 ? 0 : 1;
					}
					if (local32 == 14) {
						local175 = local21[local25++];
						@Pc(289) Class10 local289 = Class10.aClass10Array1[local175];
						local100 = local289.anInt104;
						@Pc(295) int local295 = local289.anInt105;
						@Pc(298) int local298 = local289.anInt106;
						@Pc(304) int local304 = anIntArray241[local298 - local295];
						local34 = this.anIntArray225[local100] >> local295 & local304;
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
						local34 = (aClass2_Sub1_Sub3_Sub1_Sub1_1.anInt680 >> 7) + this.anInt951;
					}
					if (local32 == 19) {
						local34 = (aClass2_Sub1_Sub3_Sub1_Sub1_1.anInt681 >> 7) + this.anInt952;
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
			signlink.reporterror("68760, " + arg0 + ", " + arg1 + ", " + 0 + ", " + local400.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Z[BI)Z")
	private boolean method693(@OriginalArg(0) boolean arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) {
		try {
			this.aBoolean248 &= arg0;
			return arg1 == null ? true : signlink.wavesave(arg1, arg2);
		} catch (@Pc(14) RuntimeException local14) {
			signlink.reporterror("42698, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local14.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "I", descriptor = "(I)V")
	private void method694() {
		try {
			while (true) {
				@Pc(12) Class2_Sub1_Sub4 local12 = this.aClass9_Sub1_1.method521();
				if (local12 == null) {
					return;
				}
				if (local12.anInt231 == 0) {
					Class2_Sub1_Sub3_Sub4.method429(local12.anInt232, (byte) 4, local12.aByteArray9);
					if ((this.aClass9_Sub1_1.method509(local12.anInt232) & 0x62) != 0) {
						this.aBoolean233 = true;
						if (this.anInt871 != -1 || this.anInt928 != -1) {
							this.aBoolean241 = true;
						}
					}
				}
				if (local12.anInt231 == 1 && local12.aByteArray9 != null) {
					Class45.method554(local12.aByteArray9);
				}
				if (local12.anInt231 == 2 && local12.anInt232 == this.anInt854 && local12.aByteArray9 != null) {
					this.method726(this.aBoolean230, local12.aByteArray9);
				}
				if (local12.anInt231 == 3 && this.anInt929 == 1) {
					for (@Pc(87) int local87 = 0; local87 < this.aByteArrayArray5.length; local87++) {
						if (this.anIntArray254[local87] == local12.anInt232) {
							this.aByteArrayArray5[local87] = local12.aByteArray9;
							if (local12.aByteArray9 == null) {
								this.anIntArray254[local87] = -1;
							}
							break;
						}
						if (this.anIntArray255[local87] == local12.anInt232) {
							this.aByteArrayArray6[local87] = local12.aByteArray9;
							if (local12.aByteArray9 == null) {
								this.anIntArray255[local87] = -1;
							}
							break;
						}
					}
				}
				if (local12.anInt231 == 93 && this.aClass9_Sub1_1.method516(local12.anInt232)) {
					Class42.method534(new Class2_Sub1_Sub2(local12.aByteArray9, (byte) 3), this.aClass9_Sub1_1);
				}
			}
		} catch (@Pc(164) RuntimeException local164) {
			signlink.reporterror("84215, " + 897 + ", " + local164.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "j", descriptor = "(Z)V")
	private void method695() {
		try {
			for (@Pc(6) Class2_Sub1_Sub3_Sub3 local6 = (Class2_Sub1_Sub3_Sub3) this.aClass13_12.method200(); local6 != null; local6 = (Class2_Sub1_Sub3_Sub3) this.aClass13_12.method202()) {
				if (local6.anInt568 != this.anInt882 || anInt970 > local6.anInt560) {
					local6.method530();
				} else if (anInt970 >= local6.anInt559) {
					if (local6.anInt567 > 0) {
						@Pc(37) Class2_Sub1_Sub3_Sub1_Sub2 local37 = this.aClass2_Sub1_Sub3_Sub1_Sub2Array1[local6.anInt567 - 1];
						if (local37 != null && local37.anInt680 >= 0 && local37.anInt680 < 13312 && local37.anInt681 >= 0 && local37.anInt681 < 13312) {
							local6.method421(this.method622(local37.anInt681, local6.anInt568, local37.anInt680) - local6.anInt572, local37.anInt680, local37.anInt681, anInt970);
						}
					}
					if (local6.anInt567 < 0) {
						@Pc(82) int local82 = -local6.anInt567 - 1;
						@Pc(88) Class2_Sub1_Sub3_Sub1_Sub1 local88;
						if (local82 == this.anInt930) {
							local88 = aClass2_Sub1_Sub3_Sub1_Sub1_1;
						} else {
							local88 = this.aClass2_Sub1_Sub3_Sub1_Sub1Array1[local82];
						}
						if (local88 != null && local88.anInt680 >= 0 && local88.anInt680 < 13312 && local88.anInt681 >= 0 && local88.anInt681 < 13312) {
							local6.method421(this.method622(local88.anInt681, local6.anInt568, local88.anInt680) - local6.anInt572, local88.anInt680, local88.anInt681, anInt970);
						}
					}
					local6.method422(this.anInt885, (byte) 4);
					this.aClass29_1.method335(local6, this.anInt882, local6.anInt557, false, -1, (int) local6.aDouble8, 60, (int) local6.aDouble7, (int) local6.aDouble6);
				}
			}
		} catch (@Pc(168) RuntimeException local168) {
			signlink.reporterror("83160, " + true + ", " + local168.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIZ)V")
	private void method696(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1) {
		try {
			signlink.anInt1080 = arg0;
			if (arg1) {
				signlink.midi = "voladjust";
			}
		} catch (@Pc(17) RuntimeException local17) {
			signlink.reporterror("69130, " + 0 + ", " + arg0 + ", " + arg1 + ", " + local17.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "J", descriptor = "(I)V")
	private void method697(@OriginalArg(0) int arg0) {
		try {
			@Pc(2) int local2 = this.anInt1047;
			@Pc(5) int local5 = this.anInt1048;
			@Pc(8) int local8 = this.anInt1049;
			@Pc(11) int local11 = this.anInt1050;
			Class2_Sub1_Sub1.method278(this.aByte62, local8, local5, local2, local11, 6116423);
			Class2_Sub1_Sub1.method278(this.aByte62, local8 - 2, local5 + 1, local2 + 1, 16, 0);
			Class2_Sub1_Sub1.method279(local8 - 2, local11 - 19, local5 + 18, 0, local2 + 1);
			@Pc(54) boolean local54 = false;
			this.aClass2_Sub1_Sub1_Sub1_4.method39(local2 + 3, "Choose Option", local5 + 14, 6116423);
			@Pc(69) int local69 = super.anInt838;
			@Pc(72) int local72 = super.anInt839;
			if (this.anInt1046 == 0) {
				local69 -= 4;
				local72 -= 4;
			}
			if (this.anInt1046 == 1) {
				local69 -= 553;
				local72 -= 205;
			}
			if (this.anInt1046 == 2) {
				local69 -= 17;
				local72 -= 357;
			}
			for (@Pc(91) int local91 = 0; local91 < this.anInt1004; local91++) {
				@Pc(106) int local106 = local5 + (this.anInt1004 - 1 - local91) * 15 + 31;
				@Pc(108) int local108 = 16777215;
				if (local69 > local2 && local69 < local2 + local8 && local72 > local106 - 13 && local72 < local106 + 3) {
					local108 = 16776960;
				}
				this.aClass2_Sub1_Sub1_Sub1_4.method43(local2 + 3, true, local106, this.aStringArray8[local91], local108);
			}
		} catch (@Pc(149) RuntimeException local149) {
			signlink.reporterror("81049, " + arg0 + ", " + local149.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "k", descriptor = "(Z)V")
	private void method698() {
		try {
			this.aBoolean236 = false;
			while (this.aBoolean265) {
				this.aBoolean236 = false;
				try {
					Thread.sleep(50L);
				} catch (@Pc(13) Exception local13) {
				}
			}
			this.aClass2_Sub1_Sub1_Sub4_1 = null;
			this.aClass2_Sub1_Sub1_Sub4_2 = null;
			this.aClass2_Sub1_Sub1_Sub4Array4 = null;
			this.anIntArray235 = null;
			this.anIntArray236 = null;
			this.anIntArray237 = null;
			this.anIntArray238 = null;
			this.anIntArray239 = null;
			this.anIntArray240 = null;
			this.anIntArray275 = null;
			this.anIntArray276 = null;
			this.aClass2_Sub1_Sub1_Sub2_7 = null;
			this.aClass2_Sub1_Sub1_Sub2_8 = null;
		} catch (@Pc(67) RuntimeException local67) {
			signlink.reporterror("43603, " + true + ", " + local67.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
	@Override
	public String getParameter(@OriginalArg(0) String arg0) {
		return signlink.mainapp == null ? super.getParameter(arg0) : signlink.mainapp.getParameter(arg0);
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!QHGHUTGN;Z)V")
	private void method699(@OriginalArg(0) Class31 arg0) {
		try {
			@Pc(4) int local4 = arg0.anInt499;
			@Pc(70) int local70;
			if ((local4 < 1 || local4 > 100) && (local4 < 701 || local4 > 800)) {
				if (local4 >= 101 && local4 <= 200 || !(local4 < 801 || local4 > 900)) {
					local70 = this.anInt1013;
					if (this.anInt1014 != 2) {
						local70 = 0;
					}
					if (local4 > 800) {
						local4 -= 701;
					} else {
						local4 -= 101;
					}
					if (local4 >= local70) {
						arg0.aString6 = "";
						arg0.anInt517 = 0;
					} else {
						if (this.anIntArray252[local4] == 0) {
							arg0.aString6 = "@red@Offline";
						} else if (this.anIntArray252[local4] < 200) {
							if (this.anIntArray252[local4] == anInt1072) {
								arg0.aString6 = "@gre@World" + (this.anIntArray252[local4] - 9);
							} else {
								arg0.aString6 = "@yel@World" + (this.anIntArray252[local4] - 9);
							}
						} else if (this.anIntArray252[local4] == anInt1072) {
							arg0.aString6 = "@gre@Classic" + (this.anIntArray252[local4] - 219);
						} else {
							arg0.aString6 = "@yel@Classic" + (this.anIntArray252[local4] - 219);
						}
						arg0.anInt517 = 1;
					}
				} else if (local4 == 203) {
					local70 = this.anInt1013;
					if (this.anInt1014 != 2) {
						local70 = 0;
					}
					arg0.anInt495 = local70 * 15 + 20;
					if (arg0.anInt495 <= arg0.anInt504) {
						arg0.anInt495 = arg0.anInt504 + 1;
					}
				} else if (local4 >= 401 && local4 <= 500) {
					local4 -= 401;
					if (local4 == 0 && this.anInt1014 == 0) {
						arg0.aString6 = "Loading ignore list";
						arg0.anInt517 = 0;
					} else if (local4 == 1 && this.anInt1014 == 0) {
						arg0.aString6 = "Please wait...";
						arg0.anInt517 = 0;
					} else {
						local70 = this.anInt1039;
						if (this.anInt1014 == 0) {
							local70 = 0;
						}
						if (local4 >= local70) {
							arg0.aString6 = "";
							arg0.anInt517 = 0;
						} else {
							arg0.aString6 = Class34.method482(Class34.method479(this.aLongArray4[local4]));
							arg0.anInt517 = 1;
						}
					}
				} else if (local4 == 503) {
					arg0.anInt495 = this.anInt1039 * 15 + 20;
					if (arg0.anInt495 <= arg0.anInt504) {
						arg0.anInt495 = arg0.anInt504 + 1;
					}
				} else if (local4 == 327) {
					arg0.anInt519 = 150;
					arg0.anInt520 = (int) (Math.sin((double) anInt970 / 40.0D) * 256.0D) & 0x7FF;
					if (this.aBoolean240) {
						for (local70 = 0; local70 < 7; local70++) {
							@Pc(383) int local383 = this.anIntArray212[local70];
							if (local383 >= 0 && !Class14.aClass14Array1[local383].method220()) {
								return;
							}
						}
						this.aBoolean240 = false;
						@Pc(402) Class2_Sub1_Sub3_Sub4[] local402 = new Class2_Sub1_Sub3_Sub4[7];
						@Pc(404) int local404 = 0;
						for (@Pc(406) int local406 = 0; local406 < 7; local406++) {
							@Pc(413) int local413 = this.anIntArray212[local406];
							if (local413 >= 0) {
								local402[local404++] = Class14.aClass14Array1[local413].method221();
							}
						}
						@Pc(435) Class2_Sub1_Sub3_Sub4 local435 = new Class2_Sub1_Sub3_Sub4(local404, local402, 118);
						for (@Pc(437) int local437 = 0; local437 < 5; local437++) {
							if (this.anIntArray274[local437] != 0) {
								local435.method445(anIntArrayArray23[local437][0], anIntArrayArray23[local437][this.anIntArray274[local437]]);
								if (local437 == 1) {
									local435.method445(anIntArray266[0], anIntArray266[this.anIntArray274[local437]]);
								}
							}
						}
						local435.method438();
						local435.method439(Class22.aClass22Array1[aClass2_Sub1_Sub3_Sub1_Sub1_1.anInt672].anIntArray64[0]);
						local435.method448(64, 850, -30, -50, -30, true);
						arg0.anInt507 = 5;
						arg0.anInt508 = 0;
						Class31.method400(local435);
					}
				} else if (local4 == 324) {
					if (this.aClass2_Sub1_Sub1_Sub2_10 == null) {
						this.aClass2_Sub1_Sub1_Sub2_10 = arg0.aClass2_Sub1_Sub1_Sub2_2;
						this.aClass2_Sub1_Sub1_Sub2_11 = arg0.aClass2_Sub1_Sub1_Sub2_1;
					}
					if (this.aBoolean256) {
						arg0.aClass2_Sub1_Sub1_Sub2_2 = this.aClass2_Sub1_Sub1_Sub2_11;
					} else {
						arg0.aClass2_Sub1_Sub1_Sub2_2 = this.aClass2_Sub1_Sub1_Sub2_10;
					}
				} else if (local4 == 325) {
					if (this.aClass2_Sub1_Sub1_Sub2_10 == null) {
						this.aClass2_Sub1_Sub1_Sub2_10 = arg0.aClass2_Sub1_Sub1_Sub2_2;
						this.aClass2_Sub1_Sub1_Sub2_11 = arg0.aClass2_Sub1_Sub1_Sub2_1;
					}
					if (this.aBoolean256) {
						arg0.aClass2_Sub1_Sub1_Sub2_2 = this.aClass2_Sub1_Sub1_Sub2_10;
					} else {
						arg0.aClass2_Sub1_Sub1_Sub2_2 = this.aClass2_Sub1_Sub1_Sub2_11;
					}
				} else if (local4 == 600) {
					arg0.aString6 = this.aString19;
					if (anInt970 % 20 < 10) {
						arg0.aString6 = arg0.aString6 + "|";
					} else {
						arg0.aString6 = arg0.aString6 + " ";
					}
				} else {
					if (local4 == 620) {
						if (this.anInt921 < 1) {
							arg0.aString6 = "";
						} else if (this.aBoolean234) {
							arg0.anInt521 = 16711680;
							arg0.aString6 = "Moderator option: Mute player for 48 hours: <ON>";
						} else {
							arg0.anInt521 = 16777215;
							arg0.aString6 = "Moderator option: Mute player for 48 hours: <OFF>";
						}
					}
					@Pc(642) String local642;
					if (local4 == 660) {
						local70 = this.anInt1028 - this.anInt925;
						if (local70 <= 0) {
							local642 = "earlier today";
						} else if (local70 == 1) {
							local642 = "yesterday";
						} else {
							local642 = local70 + " days ago";
						}
						arg0.aString6 = "You last logged in @red@" + local642 + "@bla@ from: @red@" + signlink.dns;
					}
					if (local4 == 661) {
						if (this.anInt865 == 0) {
							arg0.aString6 = "\\nYou have not yet set any recovery questions.\\nIt is @lre@strongly@yel@ recommended that you do so.\\n\\nIf you don't you will be @lre@unable to recover your\\n@lre@password@yel@ if you forget it, or it is stolen.";
						} else if (this.anInt865 <= this.anInt1028) {
							arg0.aString6 = "\\n\\nRecovery Questions Last Set:\\n@gre@" + this.method700(this.anInt865);
						} else {
							local70 = this.anInt1028 + 14 - this.anInt865;
							if (local70 <= 0) {
								local642 = "Earlier today";
							} else if (local70 == 1) {
								local642 = "Yesterday";
							} else {
								local642 = local70 + " days ago";
							}
							arg0.aString6 = local642 + " you requested@lre@ new recovery\\n@lre@questions.@yel@ The requested change will occur\\non: @lre@" + this.method700(this.anInt865) + "\\n\\nIf you do not remember making this request\\ncancel it immediately, and change your password.";
						}
					}
					if (local4 == 662) {
						@Pc(760) String local760;
						if (this.anInt853 == 0) {
							local760 = "@yel@0 unread messages";
						} else if (this.anInt853 == 1) {
							local760 = "@gre@1 unread message";
						} else {
							local760 = "@gre@" + this.anInt853 + " unread messages";
						}
						arg0.aString6 = "You have " + local760 + "\\nin your message centre.";
					}
					if (local4 == 663) {
						if (this.anInt911 > 0 && this.anInt911 <= this.anInt1028 + 10) {
							arg0.aString6 = "Last password change:\\n@gre@" + this.method700(this.anInt911);
						} else {
							arg0.aString6 = "Last password change:\\n@gre@Never changed";
						}
					}
					if (local4 == 665) {
						if (this.anInt849 > 2 && !aBoolean271) {
							arg0.aString6 = "This is a non-members\\nworld. To enjoy your\\nmembers benefits we\\nrecommend you play on a\\nmembers world instead.";
						} else if (this.anInt849 > 2) {
							arg0.aString6 = "\\n\\nYou have @gre@" + this.anInt849 + "@yel@ days of\\nmember credit remaining.";
						} else if (this.anInt849 > 0) {
							arg0.aString6 = "You have @gre@" + this.anInt849 + "@yel@ days of\\nmember credit remaining.\\n\\n@lre@Credit low! Renew now\\n@lre@to avoid losing members.";
						} else {
							arg0.aString6 = "You are not a member.\\n\\nChoose to subscribe and\\nyou'll get loads of extra\\nbenefits and features.";
						}
					}
					if (local4 == 667) {
						if (this.anInt849 > 2 && !aBoolean271) {
							arg0.aString6 = "To switch to a members-only world:\\n1) Logout and return to the world selection page.\\n2) Choose one of the members world with a gold star next to it's name.\\n\\nIf you prefer you can continue to use this world,\\nbut members only features will be unavailable here.";
						} else if (this.anInt849 > 0) {
							arg0.aString6 = "To extend or cancel a subscription:\\n1) Logout and return to the frontpage of this website.\\n2)Choose the relevant option from the 'membership' section.\\n\\nNote: If you are a credit card subscriber a top-up payment will\\nautomatically be taken when 3 days credit remain.\\n(unless you cancel your subscription, which can be done at any time.)";
						} else {
							arg0.aString6 = "To start a subscripton:\\n1) Logout and return to the frontpage of this website.\\n2) Choose 'Start a new subscription'";
						}
					}
					if (local4 == 668) {
						if (this.anInt865 > this.anInt1028) {
							arg0.aString6 = "To cancel this request:\\n1) Logout and return to the frontpage of this website.\\n2) Choose 'Cancel recovery questions'.";
						} else {
							arg0.aString6 = "To change your recovery questions:\\n1) Logout and return to the frontpage of this website.\\n2) Choose 'Set new recovery questions'.";
						}
					}
				}
			} else if (local4 == 1 && this.anInt1014 == 0) {
				arg0.aString6 = "Loading friend list";
				arg0.anInt517 = 0;
			} else if (local4 == 1 && this.anInt1014 == 1) {
				arg0.aString6 = "Connecting to friendserver";
				arg0.anInt517 = 0;
			} else if (local4 == 2 && this.anInt1014 != 2) {
				arg0.aString6 = "Please wait...";
				arg0.anInt517 = 0;
			} else {
				local70 = this.anInt1013;
				if (this.anInt1014 != 2) {
					local70 = 0;
				}
				if (local4 > 700) {
					local4 -= 601;
				} else {
					local4--;
				}
				if (local4 >= local70) {
					arg0.aString6 = "";
					arg0.anInt517 = 0;
				} else {
					arg0.aString6 = this.aStringArray11[local4];
					arg0.anInt517 = 1;
				}
			}
		} catch (@Pc(917) RuntimeException local917) {
			signlink.reporterror("29109, " + arg0 + ", " + false + ", " + local917.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(IB)Ljava/lang/String;")
	private String method700(@OriginalArg(0) int arg0) {
		try {
			if (arg0 > this.anInt1028 + 10) {
				return "Unknown";
			}
			@Pc(14) long local14 = ((long) arg0 + 11745L) * 86400000L;
			@Pc(16) Calendar local16 = Calendar.getInstance();
			local16.setTime(new Date(local14));
			@Pc(32) int local32 = local16.get(5);
			@Pc(36) int local36 = local16.get(2);
			@Pc(40) int local40 = local16.get(1);
			@Pc(91) String[] local91 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };
			return local32 + "-" + local91[local36] + "-" + local40;
		} catch (@Pc(109) RuntimeException local109) {
			signlink.reporterror("72922, " + arg0 + ", " + -2 + ", " + local109.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "K", descriptor = "(I)V")
	private void method702() {
		try {
			for (@Pc(1) int local1 = 0; local1 < this.anInt866; local1++) {
				@Pc(8) int local8 = this.anIntArray215[local1];
				@Pc(13) Class2_Sub1_Sub3_Sub1_Sub2 local13 = this.aClass2_Sub1_Sub3_Sub1_Sub2Array1[local8];
				if (local13 != null) {
					this.method703(local13.aClass48_2.aByte58, local13);
				}
			}
		} catch (@Pc(37) RuntimeException local37) {
			signlink.reporterror("13641, " + 253 + ", " + local37.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IILclient!FSZDVUBI;)V")
	private void method703(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub1_Sub3_Sub1 arg1) {
		try {
			if (arg1.anInt680 < 128 || arg1.anInt681 < 128 || arg1.anInt680 >= 13184 || arg1.anInt681 >= 13184) {
				arg1.anInt674 = -1;
				arg1.anInt698 = -1;
				arg1.anInt668 = 0;
				arg1.anInt669 = 0;
				arg1.anInt680 = arg1.anIntArray165[0] * 128 + arg1.anInt659 * 64;
				arg1.anInt681 = arg1.anIntArray166[0] * 128 + arg1.anInt659 * 64;
				arg1.method491();
			}
			if (arg1 == aClass2_Sub1_Sub3_Sub1_Sub1_1 && (arg1.anInt680 < 1536 || arg1.anInt681 < 1536 || arg1.anInt680 >= 11776 || arg1.anInt681 >= 11776)) {
				arg1.anInt674 = -1;
				arg1.anInt698 = -1;
				arg1.anInt668 = 0;
				arg1.anInt669 = 0;
				arg1.anInt680 = arg1.anIntArray165[0] * 128 + arg1.anInt659 * 64;
				arg1.anInt681 = arg1.anIntArray166[0] * 128 + arg1.anInt659 * 64;
				arg1.method491();
			}
			if (arg1.anInt668 > anInt970) {
				this.method704(arg1);
			} else if (arg1.anInt669 >= anInt970) {
				this.method705(arg1, this.aBoolean259);
			} else {
				this.method706(arg1);
			}
			this.method707(arg1);
			this.method708(arg1);
		} catch (@Pc(161) RuntimeException local161) {
			signlink.reporterror("75424, " + arg0 + ", " + -6841 + ", " + arg1 + ", " + local161.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILclient!FSZDVUBI;)V")
	private void method704(@OriginalArg(1) Class2_Sub1_Sub3_Sub1 arg0) {
		try {
			@Pc(4) int local4 = arg0.anInt668 - anInt970;
			@Pc(14) int local14 = arg0.anInt664 * 128 + arg0.anInt659 * 64;
			@Pc(24) int local24 = arg0.anInt666 * 128 + arg0.anInt659 * 64;
			arg0.anInt680 += (local14 - arg0.anInt680) / local4;
			arg0.anInt681 += (local24 - arg0.anInt681) / local4;
			arg0.anInt671 = 0;
			if (arg0.anInt670 == 0) {
				arg0.anInt691 = 1024;
			}
			if (arg0.anInt670 == 1) {
				arg0.anInt691 = 1536;
			}
			if (arg0.anInt670 == 2) {
				arg0.anInt691 = 0;
			}
			if (arg0.anInt670 == 3) {
				arg0.anInt691 = 512;
			}
		} catch (@Pc(83) RuntimeException local83) {
			signlink.reporterror("74779, " + 5 + ", " + arg0 + ", " + local83.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!FSZDVUBI;Z)V")
	private void method705(@OriginalArg(0) Class2_Sub1_Sub3_Sub1 arg0, @OriginalArg(1) boolean arg1) {
		try {
			if (arg1) {
				this.anInt1059 = -416;
			}
			if (arg0.anInt669 == anInt970 || arg0.anInt674 == -1 || arg0.anInt677 != 0 || arg0.anInt676 + 1 > Class22.aClass22Array1[arg0.anInt674].method265(arg0.anInt675, this.anInt985)) {
				@Pc(35) int local35 = arg0.anInt669 - arg0.anInt668;
				@Pc(40) int local40 = anInt970 - arg0.anInt668;
				@Pc(50) int local50 = arg0.anInt664 * 128 + arg0.anInt659 * 64;
				@Pc(60) int local60 = arg0.anInt666 * 128 + arg0.anInt659 * 64;
				@Pc(70) int local70 = arg0.anInt665 * 128 + arg0.anInt659 * 64;
				@Pc(80) int local80 = arg0.anInt667 * 128 + arg0.anInt659 * 64;
				arg0.anInt680 = (local50 * (local35 - local40) + local70 * local40) / local35;
				arg0.anInt681 = (local60 * (local35 - local40) + local80 * local40) / local35;
			}
			arg0.anInt671 = 0;
			if (arg0.anInt670 == 0) {
				arg0.anInt691 = 1024;
			}
			if (arg0.anInt670 == 1) {
				arg0.anInt691 = 1536;
			}
			if (arg0.anInt670 == 2) {
				arg0.anInt691 = 0;
			}
			if (arg0.anInt670 == 3) {
				arg0.anInt691 = 512;
			}
			arg0.anInt682 = arg0.anInt691;
		} catch (@Pc(142) RuntimeException local142) {
			signlink.reporterror("69788, " + arg0 + ", " + arg1 + ", " + local142.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!FSZDVUBI;B)V")
	private void method706(@OriginalArg(0) Class2_Sub1_Sub3_Sub1 arg0) {
		try {
			arg0.anInt693 = arg0.anInt672;
			if (arg0.anInt679 == 0) {
				arg0.anInt671 = 0;
			} else {
				if (arg0.anInt674 != -1 && arg0.anInt677 == 0) {
					@Pc(24) Class22 local24 = Class22.aClass22Array1[arg0.anInt674];
					if (arg0.anInt684 > 0 && local24.anInt268 == 0) {
						arg0.anInt671++;
						return;
					}
					if (arg0.anInt684 <= 0 && local24.anInt269 == 0) {
						arg0.anInt671++;
						return;
					}
				}
				@Pc(53) int local53 = arg0.anInt680;
				@Pc(56) int local56 = arg0.anInt681;
				@Pc(71) int local71 = arg0.anIntArray165[arg0.anInt679 - 1] * 128 + arg0.anInt659 * 64;
				@Pc(86) int local86 = arg0.anIntArray166[arg0.anInt679 - 1] * 128 + arg0.anInt659 * 64;
				if (local71 - local53 <= 256 && local71 - local53 >= -256 && local86 - local56 <= 256 && local86 - local56 >= -256) {
					if (local53 < local71) {
						if (local56 < local86) {
							arg0.anInt691 = 1280;
						} else if (local56 > local86) {
							arg0.anInt691 = 1792;
						} else {
							arg0.anInt691 = 1536;
						}
					} else if (local53 > local71) {
						if (local56 < local86) {
							arg0.anInt691 = 768;
						} else if (local56 > local86) {
							arg0.anInt691 = 256;
						} else {
							arg0.anInt691 = 512;
						}
					} else if (local56 < local86) {
						arg0.anInt691 = 1024;
					} else {
						arg0.anInt691 = 0;
					}
					@Pc(180) int local180 = arg0.anInt691 - arg0.anInt682 & 0x7FF;
					if (local180 > 1024) {
						local180 -= 2048;
					}
					@Pc(187) int local187 = arg0.anInt661;
					if (local180 >= -256 && local180 <= 256) {
						local187 = arg0.anInt660;
					} else if (local180 >= 256 && local180 < 768) {
						local187 = arg0.anInt663;
					} else if (local180 >= -768 && local180 <= -256) {
						local187 = arg0.anInt662;
					}
					if (local187 == -1) {
						local187 = arg0.anInt660;
					}
					arg0.anInt693 = local187;
					@Pc(229) int local229 = 4;
					if (this.aByte61 == -115) {
						if (arg0.anInt682 != arg0.anInt691 && arg0.anInt692 == -1 && arg0.anInt696 != 0) {
							local229 = 2;
						}
						if (arg0.anInt679 > 2) {
							local229 = 6;
						}
						if (arg0.anInt679 > 3) {
							local229 = 8;
						}
						if (arg0.anInt671 > 0 && arg0.anInt679 > 1) {
							local229 = 8;
							arg0.anInt671--;
						}
						if (arg0.aBooleanArray8[arg0.anInt679 - 1]) {
							local229 <<= 0x1;
						}
						if (local229 >= 8 && arg0.anInt693 == arg0.anInt660 && arg0.anInt697 != -1) {
							arg0.anInt693 = arg0.anInt697;
						}
						if (local53 < local71) {
							arg0.anInt680 += local229;
							if (arg0.anInt680 > local71) {
								arg0.anInt680 = local71;
							}
						} else if (local53 > local71) {
							arg0.anInt680 -= local229;
							if (arg0.anInt680 < local71) {
								arg0.anInt680 = local71;
							}
						}
						if (local56 < local86) {
							arg0.anInt681 += local229;
							if (arg0.anInt681 > local86) {
								arg0.anInt681 = local86;
							}
						} else if (local56 > local86) {
							arg0.anInt681 -= local229;
							if (arg0.anInt681 < local86) {
								arg0.anInt681 = local86;
							}
						}
						if (arg0.anInt680 == local71 && arg0.anInt681 == local86) {
							arg0.anInt679--;
							if (arg0.anInt684 > 0) {
								arg0.anInt684--;
								return;
							}
						}
					}
				} else {
					arg0.anInt680 = local71;
					arg0.anInt681 = local86;
				}
			}
		} catch (@Pc(396) RuntimeException local396) {
			signlink.reporterror("99755, " + arg0 + ", " + -115 + ", " + local396.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(ILclient!FSZDVUBI;)V")
	private void method707(@OriginalArg(1) Class2_Sub1_Sub3_Sub1 arg0) {
		try {
			if (arg0.anInt696 != 0) {
				@Pc(34) int local34;
				@Pc(40) int local40;
				if (arg0.anInt692 != -1 && arg0.anInt692 < 32768) {
					@Pc(26) Class2_Sub1_Sub3_Sub1_Sub2 local26 = this.aClass2_Sub1_Sub3_Sub1_Sub2Array1[arg0.anInt692];
					if (local26 != null) {
						local34 = arg0.anInt680 - local26.anInt680;
						local40 = arg0.anInt681 - local26.anInt681;
						if (local34 != 0 || local40 != 0) {
							arg0.anInt691 = (int) (Math.atan2((double) local34, (double) local40) * 325.949D) & 0x7FF;
						}
					}
				}
				@Pc(65) int local65;
				if (arg0.anInt692 >= 32768) {
					local65 = arg0.anInt692 - 32768;
					if (local65 == this.anInt930) {
						local65 = this.anInt948;
					}
					@Pc(77) Class2_Sub1_Sub3_Sub1_Sub1 local77 = this.aClass2_Sub1_Sub3_Sub1_Sub1Array1[local65];
					if (local77 != null) {
						local40 = arg0.anInt680 - local77.anInt680;
						@Pc(91) int local91 = arg0.anInt681 - local77.anInt681;
						if (local40 != 0 || local91 != 0) {
							arg0.anInt691 = (int) (Math.atan2((double) local40, (double) local91) * 325.949D) & 0x7FF;
						}
					}
				}
				if ((arg0.anInt687 != 0 || arg0.anInt688 != 0) && (arg0.anInt679 == 0 || arg0.anInt671 > 0)) {
					local65 = arg0.anInt680 - (arg0.anInt687 - this.anInt951 - this.anInt951) * 64;
					local34 = arg0.anInt681 - (arg0.anInt688 - this.anInt952 - this.anInt952) * 64;
					if (local65 != 0 || local34 != 0) {
						arg0.anInt691 = (int) (Math.atan2((double) local65, (double) local34) * 325.949D) & 0x7FF;
					}
					arg0.anInt687 = 0;
					arg0.anInt688 = 0;
				}
				local65 = arg0.anInt691 - arg0.anInt682 & 0x7FF;
				if (local65 != 0) {
					if (local65 < arg0.anInt696 || local65 > 2048 - arg0.anInt696) {
						arg0.anInt682 = arg0.anInt691;
					} else if (local65 > 1024) {
						arg0.anInt682 -= arg0.anInt696;
					} else {
						arg0.anInt682 += arg0.anInt696;
					}
					arg0.anInt682 &= 0x7FF;
					if (arg0.anInt693 == arg0.anInt672 && arg0.anInt682 != arg0.anInt691) {
						if (arg0.anInt673 != -1) {
							arg0.anInt693 = arg0.anInt673;
							return;
						}
						arg0.anInt693 = arg0.anInt660;
						return;
					}
				}
			}
		} catch (@Pc(245) RuntimeException local245) {
			signlink.reporterror("18046, " + -959 + ", " + arg0 + ", " + local245.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Lclient!FSZDVUBI;B)V")
	private void method708(@OriginalArg(0) Class2_Sub1_Sub3_Sub1 arg0) {
		try {
			arg0.aBoolean201 = false;
			@Pc(15) Class22 local15;
			if (arg0.anInt693 != -1) {
				local15 = Class22.aClass22Array1[arg0.anInt693];
				arg0.anInt695++;
				if (arg0.anInt694 < local15.anInt262 && arg0.anInt695 > local15.method265(arg0.anInt694, this.anInt985)) {
					arg0.anInt695 = 1;
					arg0.anInt694++;
				}
				if (arg0.anInt694 >= local15.anInt262) {
					arg0.anInt695 = 1;
					arg0.anInt694 = 0;
				}
			}
			if (arg0.anInt698 != -1 && anInt970 >= arg0.anInt701) {
				if (arg0.anInt699 < 0) {
					arg0.anInt699 = 0;
				}
				local15 = Class27.aClass27Array1[arg0.anInt698].aClass22_1;
				arg0.anInt700++;
				if (arg0.anInt699 < local15.anInt262 && arg0.anInt700 > local15.method265(arg0.anInt699, this.anInt985)) {
					arg0.anInt700 = 1;
					arg0.anInt699++;
				}
				if (arg0.anInt699 >= local15.anInt262 && (arg0.anInt699 < 0 || arg0.anInt699 >= local15.anInt262)) {
					arg0.anInt698 = -1;
				}
			}
			if (arg0.anInt674 != -1 && arg0.anInt677 <= 1) {
				local15 = Class22.aClass22Array1[arg0.anInt674];
				if (local15.anInt268 == 1 && arg0.anInt684 > 0 && arg0.anInt668 <= anInt970 && arg0.anInt669 < anInt970) {
					arg0.anInt677 = 1;
					return;
				}
			}
			if (arg0.anInt674 != -1 && arg0.anInt677 == 0) {
				local15 = Class22.aClass22Array1[arg0.anInt674];
				arg0.anInt676++;
				if (arg0.anInt675 < local15.anInt262 && arg0.anInt676 > local15.method265(arg0.anInt675, this.anInt985)) {
					arg0.anInt676 = 1;
					arg0.anInt675++;
				}
				if (arg0.anInt675 >= local15.anInt262) {
					arg0.anInt675 -= local15.anInt263;
					arg0.anInt678++;
					if (arg0.anInt678 >= local15.anInt267) {
						arg0.anInt674 = -1;
					}
					if (arg0.anInt675 < 0 || arg0.anInt675 >= local15.anInt262) {
						arg0.anInt674 = -1;
					}
				}
				arg0.aBoolean201 = local15.aBoolean96;
			}
			if (arg0.anInt677 > 0) {
				arg0.anInt677--;
			}
		} catch (@Pc(245) RuntimeException local245) {
			signlink.reporterror("23202, " + arg0 + ", " + -114 + ", " + local245.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "m", descriptor = "(B)V")
	private void method709() {
		try {
			if (this.anInt1008 == -1 || this.anInt929 != 2 && super.aClass20_2 == null) {
				if (this.aBoolean228) {
					this.method592();
					this.aBoolean228 = false;
					this.aClass20_19.method231(4, super.aGraphics2, 0);
					this.aClass20_20.method231(357, super.aGraphics2, 0);
					this.aClass20_21.method231(4, super.aGraphics2, 722);
					this.aClass20_22.method231(205, super.aGraphics2, 743);
					this.aClass20_23.method231(0, super.aGraphics2, 0);
					this.aClass20_24.method231(4, super.aGraphics2, 516);
					this.aClass20_25.method231(205, super.aGraphics2, 516);
					this.aClass20_26.method231(357, super.aGraphics2, 496);
					this.aClass20_27.method231(338, super.aGraphics2, 0);
					this.aBoolean233 = true;
					this.aBoolean241 = true;
					this.aBoolean244 = true;
					this.aBoolean226 = true;
					if (this.anInt929 != 2) {
						this.aClass20_17.method231(4, super.aGraphics2, 4);
						this.aClass20_16.method231(4, super.aGraphics2, 550);
					}
				}
				if (this.anInt929 == 2) {
					this.method719(729);
				}
				if (this.aBoolean262 && this.anInt1046 == 1) {
					this.aBoolean233 = true;
				}
				@Pc(278) boolean local278;
				if (this.anInt982 != -1) {
					local278 = this.method631(this.anInt885, this.anInt982);
					if (local278) {
						this.aBoolean233 = true;
					}
				}
				if (this.anInt864 == 2) {
					this.aBoolean233 = true;
				}
				if (this.anInt935 == 2) {
					this.aBoolean233 = true;
				}
				if (this.aBoolean233) {
					this.method615(711);
					this.aBoolean233 = false;
				}
				anInt890++;
				if (anInt890 > 179) {
					anInt890 = 0;
					this.aClass2_Sub1_Sub2_6.method83(73);
					this.aClass2_Sub1_Sub2_6.method88(0);
				}
				@Pc(381) int local381;
				if (this.anInt871 == -1 && this.anInt912 == 0) {
					this.aClass31_1.anInt500 = this.anInt893 - this.anInt850 - 77;
					if (super.anInt838 > 448 && super.anInt838 < 560 && super.anInt839 > 332) {
						this.method625(super.anInt839 - 357, -1, super.anInt838 - 17, this.aClass31_1, 463, this.anInt893, 77, 0);
					}
					local381 = this.anInt893 - this.aClass31_1.anInt500 - 77;
					if (local381 < 0) {
						local381 = 0;
					}
					if (local381 > this.anInt893 - 77) {
						local381 = this.anInt893 - 77;
					}
					if (this.anInt850 != local381) {
						this.anInt850 = local381;
						this.aBoolean241 = true;
					}
				}
				if (this.anInt871 == -1 && this.anInt912 == 3) {
					local381 = this.anInt883 * 14 + 7;
					this.aClass31_1.anInt500 = this.anInt884;
					if (super.anInt838 > 448 && super.anInt838 < 560 && super.anInt839 > 332) {
						this.method625(super.anInt839 - 357, -1, super.anInt838 - 17, this.aClass31_1, 463, local381, 77, 0);
					}
					@Pc(460) int local460 = this.aClass31_1.anInt500;
					if (local460 < 0) {
						local460 = 0;
					}
					if (local460 > local381 - 77) {
						local460 = local381 - 77;
					}
					if (this.anInt884 != local460) {
						this.anInt884 = local460;
						this.aBoolean241 = true;
					}
				}
				if (this.anInt871 != -1) {
					local278 = this.method631(this.anInt885, this.anInt871);
					if (local278) {
						this.aBoolean241 = true;
					}
				}
				if (this.anInt864 == 3) {
					this.aBoolean241 = true;
				}
				if (this.anInt935 == 3) {
					this.aBoolean241 = true;
				}
				if (this.aString22 != null) {
					this.aBoolean241 = true;
				}
				if (this.aBoolean262 && this.anInt1046 == 2) {
					this.aBoolean241 = true;
				}
				if (this.aBoolean241) {
					this.method610();
					this.aBoolean241 = false;
				}
				if (this.anInt929 == 2) {
					this.method590();
					this.aClass20_16.method231(4, super.aGraphics2, 550);
				}
				if (this.anInt1060 != -1) {
					this.aBoolean244 = true;
				}
				if (this.aBoolean244) {
					if (this.anInt1060 != -1 && this.anInt1060 == this.anInt1064) {
						this.anInt1060 = -1;
						this.aClass2_Sub1_Sub2_6.method83(97);
						this.aClass2_Sub1_Sub2_6.method84(this.anInt1064);
					}
					this.aBoolean244 = false;
					this.aClass20_14.method230(this.anInt1025);
					this.aClass2_Sub1_Sub1_Sub4_5.method290(0, 0);
					if (this.anInt982 == -1) {
						if (this.anIntArray257[this.anInt1064] != -1) {
							if (this.anInt1064 == 0) {
								this.aClass2_Sub1_Sub1_Sub4_11.method290(10, 22);
							}
							if (this.anInt1064 == 1) {
								this.aClass2_Sub1_Sub1_Sub4_12.method290(8, 54);
							}
							if (this.anInt1064 == 2) {
								this.aClass2_Sub1_Sub1_Sub4_12.method290(8, 82);
							}
							if (this.anInt1064 == 3) {
								this.aClass2_Sub1_Sub1_Sub4_13.method290(8, 110);
							}
							if (this.anInt1064 == 4) {
								this.aClass2_Sub1_Sub1_Sub4_15.method290(8, 153);
							}
							if (this.anInt1064 == 5) {
								this.aClass2_Sub1_Sub1_Sub4_15.method290(8, 181);
							}
							if (this.anInt1064 == 6) {
								this.aClass2_Sub1_Sub1_Sub4_14.method290(9, 209);
							}
						}
						if (this.anIntArray257[0] != -1 && (this.anInt1060 != 0 || anInt970 % 20 < 10)) {
							this.aClass2_Sub1_Sub1_Sub4Array2[0].method290(13, 29);
						}
						if (this.anIntArray257[1] != -1 && (this.anInt1060 != 1 || anInt970 % 20 < 10)) {
							this.aClass2_Sub1_Sub1_Sub4Array2[1].method290(11, 53);
						}
						if (this.anIntArray257[2] != -1 && (this.anInt1060 != 2 || anInt970 % 20 < 10)) {
							this.aClass2_Sub1_Sub1_Sub4Array2[2].method290(11, 82);
						}
						if (this.anIntArray257[3] != -1 && (this.anInt1060 != 3 || anInt970 % 20 < 10)) {
							this.aClass2_Sub1_Sub1_Sub4Array2[3].method290(12, 115);
						}
						if (this.anIntArray257[4] != -1 && (this.anInt1060 != 4 || anInt970 % 20 < 10)) {
							this.aClass2_Sub1_Sub1_Sub4Array2[4].method290(13, 153);
						}
						if (this.anIntArray257[5] != -1 && (this.anInt1060 != 5 || anInt970 % 20 < 10)) {
							this.aClass2_Sub1_Sub1_Sub4Array2[5].method290(11, 180);
						}
						if (this.anIntArray257[6] != -1 && (this.anInt1060 != 6 || anInt970 % 20 < 10)) {
							this.aClass2_Sub1_Sub1_Sub4Array2[6].method290(13, 208);
						}
					}
					this.aClass20_14.method231(160, super.aGraphics2, 516);
					this.aClass20_13.method230(this.anInt1025);
					this.aClass2_Sub1_Sub1_Sub4_4.method290(0, 0);
					if (this.anInt982 == -1) {
						if (this.anIntArray257[this.anInt1064] != -1) {
							if (this.anInt1064 == 7) {
								this.aClass2_Sub1_Sub1_Sub4_16.method290(0, 42);
							}
							if (this.anInt1064 == 8) {
								this.aClass2_Sub1_Sub1_Sub4_17.method290(0, 74);
							}
							if (this.anInt1064 == 9) {
								this.aClass2_Sub1_Sub1_Sub4_17.method290(0, 102);
							}
							if (this.anInt1064 == 10) {
								this.aClass2_Sub1_Sub1_Sub4_18.method290(1, 130);
							}
							if (this.anInt1064 == 11) {
								this.aClass2_Sub1_Sub1_Sub4_20.method290(0, 173);
							}
							if (this.anInt1064 == 12) {
								this.aClass2_Sub1_Sub1_Sub4_20.method290(0, 201);
							}
							if (this.anInt1064 == 13) {
								this.aClass2_Sub1_Sub1_Sub4_19.method290(0, 229);
							}
						}
						if (this.anIntArray257[8] != -1 && (this.anInt1060 != 8 || anInt970 % 20 < 10)) {
							this.aClass2_Sub1_Sub1_Sub4Array2[7].method290(2, 74);
						}
						if (this.anIntArray257[9] != -1 && (this.anInt1060 != 9 || anInt970 % 20 < 10)) {
							this.aClass2_Sub1_Sub1_Sub4Array2[8].method290(3, 102);
						}
						if (this.anIntArray257[10] != -1 && (this.anInt1060 != 10 || anInt970 % 20 < 10)) {
							this.aClass2_Sub1_Sub1_Sub4Array2[9].method290(4, 137);
						}
						if (this.anIntArray257[11] != -1 && (this.anInt1060 != 11 || anInt970 % 20 < 10)) {
							this.aClass2_Sub1_Sub1_Sub4Array2[10].method290(2, 174);
						}
						if (this.anIntArray257[12] != -1 && (this.anInt1060 != 12 || anInt970 % 20 < 10)) {
							this.aClass2_Sub1_Sub1_Sub4Array2[11].method290(2, 201);
						}
						if (this.anIntArray257[13] != -1 && (this.anInt1060 != 13 || anInt970 % 20 < 10)) {
							this.aClass2_Sub1_Sub1_Sub4Array2[12].method290(2, 226);
						}
					}
					this.aClass20_13.method231(466, super.aGraphics2, 496);
					this.aClass20_17.method230(this.anInt1025);
					Class2_Sub1_Sub1_Sub3.anIntArray59 = this.anIntArray231;
				}
				if (this.aBoolean226) {
					this.aBoolean226 = false;
					this.aClass20_12.method230(this.anInt1025);
					this.aClass2_Sub1_Sub1_Sub4_3.method290(0, 0);
					this.aClass2_Sub1_Sub1_Sub1_3.method36(true, "Public chat", 28, 16777215, 55);
					if (this.anInt1066 == 0) {
						this.aClass2_Sub1_Sub1_Sub1_3.method36(true, "On", 41, 65280, 55);
					}
					if (this.anInt1066 == 1) {
						this.aClass2_Sub1_Sub1_Sub1_3.method36(true, "Friends", 41, 16776960, 55);
					}
					if (this.anInt1066 == 2) {
						this.aClass2_Sub1_Sub1_Sub1_3.method36(true, "Off", 41, 16711680, 55);
					}
					if (this.anInt1066 == 3) {
						this.aClass2_Sub1_Sub1_Sub1_3.method36(true, "Hide", 41, 65535, 55);
					}
					this.aClass2_Sub1_Sub1_Sub1_3.method36(true, "Private chat", 28, 16777215, 184);
					if (this.anInt900 == 0) {
						this.aClass2_Sub1_Sub1_Sub1_3.method36(true, "On", 41, 65280, 184);
					}
					if (this.anInt900 == 1) {
						this.aClass2_Sub1_Sub1_Sub1_3.method36(true, "Friends", 41, 16776960, 184);
					}
					if (this.anInt900 == 2) {
						this.aClass2_Sub1_Sub1_Sub1_3.method36(true, "Off", 41, 16711680, 184);
					}
					this.aClass2_Sub1_Sub1_Sub1_3.method36(true, "Trade/compete", 28, 16777215, 324);
					if (this.anInt895 == 0) {
						this.aClass2_Sub1_Sub1_Sub1_3.method36(true, "On", 41, 65280, 324);
					}
					if (this.anInt895 == 1) {
						this.aClass2_Sub1_Sub1_Sub1_3.method36(true, "Friends", 41, 16776960, 324);
					}
					if (this.anInt895 == 2) {
						this.aClass2_Sub1_Sub1_Sub1_3.method36(true, "Off", 41, 16711680, 324);
					}
					this.aClass2_Sub1_Sub1_Sub1_3.method36(true, "Report abuse", 33, 16777215, 458);
					this.aClass20_12.method231(453, super.aGraphics2, 0);
					this.aClass20_17.method230(this.anInt1025);
					Class2_Sub1_Sub1_Sub3.anIntArray59 = this.anIntArray231;
				}
				this.anInt885 = 0;
			} else {
				if (this.anInt929 == 2) {
					this.method631(this.anInt885, this.anInt1008);
					if (this.anInt1003 != -1) {
						this.method631(this.anInt885, this.anInt1003);
					}
					this.anInt885 = 0;
					this.method639();
					super.aClass20_2.method230(this.anInt1025);
					Class2_Sub1_Sub1_Sub3.anIntArray59 = this.anIntArray232;
					Class2_Sub1_Sub1.method276();
					this.aBoolean228 = true;
					@Pc(57) Class31 local57 = Class31.method403(this.anInt1008);
					if (local57.anInt514 == 512 && local57.anInt504 == 334 && local57.anInt503 == 0) {
						local57.anInt514 = 765;
						local57.anInt504 = 503;
					}
					this.method628(0, 0, local57, 0);
					if (this.anInt1003 != -1) {
						local57 = Class31.method403(this.anInt1003);
						if (local57.anInt514 == 512 && local57.anInt504 == 334 && local57.anInt503 == 0) {
							local57.anInt514 = 765;
							local57.anInt504 = 503;
						}
						this.method628(0, 0, local57, 0);
					}
					if (this.aBoolean262) {
						this.method697(120);
					} else {
						this.method633();
						this.method650();
					}
				}
				super.aClass20_2.method231(0, super.aGraphics2, 0);
			}
		} catch (@Pc(1303) RuntimeException local1303) {
			signlink.reporterror("7078, " + 9 + ", " + local1303.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "L", descriptor = "(I)V")
	private void method710() {
		try {
			Class33.aClass5_7.method79();
			Class33.aClass5_8.method79();
			Class48.aClass5_9.method79();
			Class32.aClass5_5.method79();
			Class32.aClass5_6.method79();
			Class2_Sub1_Sub3_Sub1_Sub1.aClass5_1.method79();
			Class27.aClass5_2.method79();
		} catch (@Pc(21) RuntimeException local21) {
			signlink.reporterror("46569, " + -17985 + ", " + local21.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "n", descriptor = "(B)V")
	private void method711() {
		try {
			this.anInt1052 = 0;
			@Pc(70) int local70;
			for (@Pc(6) int local6 = -1; local6 < this.anInt949 + this.anInt866; local6++) {
				@Pc(13) Class2_Sub1_Sub3_Sub1 local13;
				if (local6 == -1) {
					local13 = aClass2_Sub1_Sub3_Sub1_Sub1_1;
				} else if (local6 < this.anInt949) {
					local13 = this.aClass2_Sub1_Sub3_Sub1_Sub1Array1[this.anIntArray245[local6]];
				} else {
					local13 = this.aClass2_Sub1_Sub3_Sub1_Sub2Array1[this.anIntArray215[local6 - this.anInt949]];
				}
				if (local13 != null && local13.method492()) {
					@Pc(54) Class48 local54;
					if (local13 instanceof Class2_Sub1_Sub3_Sub1_Sub2) {
						local54 = ((Class2_Sub1_Sub3_Sub1_Sub2) local13).aClass48_2;
						if (local54.anIntArray195 != null) {
							local54 = local54.method570();
						}
						if (local54 == null) {
							continue;
						}
					}
					if (local6 >= this.anInt949) {
						local54 = ((Class2_Sub1_Sub3_Sub1_Sub2) local13).aClass48_2;
						if (local54.anInt817 >= 0 && local54.anInt817 < this.aClass2_Sub1_Sub1_Sub2Array5.length) {
							this.method645(local13.anInt686 + 15, local13);
							if (this.anInt941 > -1) {
								this.aClass2_Sub1_Sub1_Sub2Array5[local54.anInt817].method69(this.anInt942 - 30, this.anInt941 - 12);
							}
						}
						if (this.anInt1030 == 1 && this.anInt1062 == this.anIntArray215[local6 - this.anInt949] && anInt970 % 20 < 10) {
							this.method645(local13.anInt686 + 15, local13);
							if (this.anInt941 > -1) {
								this.aClass2_Sub1_Sub1_Sub2Array7[0].method69(this.anInt942 - 28, this.anInt941 - 12);
							}
						}
					} else {
						local70 = 30;
						@Pc(73) Class2_Sub1_Sub3_Sub1_Sub1 local73 = (Class2_Sub1_Sub3_Sub1_Sub1) local13;
						if (local73.anInt350 != -1 || local73.anInt348 != -1) {
							this.method645(local13.anInt686 + 15, local13);
							if (this.anInt941 > -1) {
								if (local73.anInt350 != -1) {
									this.aClass2_Sub1_Sub1_Sub2Array8[local73.anInt350].method69(this.anInt942 - 30, this.anInt941 - 12);
									local70 += 25;
								}
								if (local73.anInt348 != -1) {
									this.aClass2_Sub1_Sub1_Sub2Array5[local73.anInt348].method69(this.anInt942 - local70, this.anInt941 - 12);
									local70 += 25;
								}
							}
						}
						if (local6 >= 0 && this.anInt1030 == 10 && this.anInt875 == this.anIntArray245[local6]) {
							this.method645(local13.anInt686 + 15, local13);
							if (this.anInt941 > -1) {
								this.aClass2_Sub1_Sub1_Sub2Array7[1].method69(this.anInt942 - local70, this.anInt941 - 12);
							}
						}
					}
					if (local13.aString13 != null && (local6 >= this.anInt949 || this.anInt1066 == 0 || this.anInt1066 == 3 || this.anInt1066 == 1 && this.method642(((Class2_Sub1_Sub3_Sub1_Sub1) local13).aString5))) {
						this.method645(local13.anInt686, local13);
						if (this.anInt941 > -1 && this.anInt1052 < this.anInt1053) {
							this.anIntArray270[this.anInt1052] = this.aClass2_Sub1_Sub1_Sub1_4.method38(local13.aString13, 324) / 2;
							this.anIntArray269[this.anInt1052] = this.aClass2_Sub1_Sub1_Sub1_4.anInt38;
							this.anIntArray267[this.anInt1052] = this.anInt941;
							this.anIntArray268[this.anInt1052] = this.anInt942;
							this.anIntArray271[this.anInt1052] = local13.anInt685;
							this.anIntArray272[this.anInt1052] = local13.anInt689;
							this.anIntArray273[this.anInt1052] = local13.anInt683;
							this.aStringArray14[this.anInt1052++] = local13.aString13;
							if (this.anInt891 == 0 && local13.anInt689 >= 1 && local13.anInt689 <= 3) {
								this.anIntArray269[this.anInt1052] += 10;
								this.anIntArray268[this.anInt1052] += 5;
							}
							if (this.anInt891 == 0 && local13.anInt689 == 4) {
								this.anIntArray270[this.anInt1052] = 60;
							}
							if (this.anInt891 == 0 && local13.anInt689 == 5) {
								this.anIntArray269[this.anInt1052] += 5;
							}
						}
					}
					if (local13.anInt703 > anInt970) {
						this.method645(local13.anInt686 + 15, local13);
						if (this.anInt941 > -1) {
							local70 = local13.anInt704 * 30 / local13.anInt705;
							if (local70 > 30) {
								local70 = 30;
							}
							Class2_Sub1_Sub1.method278(this.aByte62, local70, this.anInt942 - 3, this.anInt941 - 15, 5, 65280);
							Class2_Sub1_Sub1.method278(this.aByte62, 30 - local70, this.anInt942 - 3, this.anInt941 + local70 - 15, 5, 16711680);
						}
					}
					for (local70 = 0; local70 < 4; local70++) {
						if (local13.anIntArray169[local70] > anInt970) {
							this.method645(local13.anInt686 / 2, local13);
							if (this.anInt941 > -1) {
								if (local70 == 1) {
									this.anInt942 -= 20;
								}
								if (local70 == 2) {
									this.anInt941 -= 15;
									this.anInt942 -= 10;
								}
								if (local70 == 3) {
									this.anInt941 += 15;
									this.anInt942 -= 10;
								}
								this.aClass2_Sub1_Sub1_Sub2Array9[local13.anIntArray168[local70]].method69(this.anInt942 - 12, this.anInt941 - 12);
								this.aClass2_Sub1_Sub1_Sub1_2.method35(0, this.anInt942 + 4, String.valueOf(local13.anIntArray167[local70]), this.anInt941);
								this.aClass2_Sub1_Sub1_Sub1_2.method35(16777215, this.anInt942 + 3, String.valueOf(local13.anIntArray167[local70]), this.anInt941 - 1);
							}
						}
					}
				}
			}
			for (@Pc(612) int local612 = 0; local612 < this.anInt1052; local612++) {
				local70 = this.anIntArray267[local612];
				@Pc(624) int local624 = this.anIntArray268[local612];
				@Pc(629) int local629 = this.anIntArray270[local612];
				@Pc(634) int local634 = this.anIntArray269[local612];
				@Pc(636) boolean local636 = true;
				while (local636) {
					local636 = false;
					for (@Pc(642) int local642 = 0; local642 < local612; local642++) {
						if (local624 + 2 > this.anIntArray268[local642] - this.anIntArray269[local642] && local624 - local634 < this.anIntArray268[local642] + 2 && local70 - local629 < this.anIntArray267[local642] + this.anIntArray270[local642] && local70 + local629 > this.anIntArray267[local642] - this.anIntArray270[local642] && this.anIntArray268[local642] - this.anIntArray269[local642] < local624) {
							local624 = this.anIntArray268[local642] - this.anIntArray269[local642];
							local636 = true;
						}
					}
				}
				this.anInt941 = this.anIntArray267[local612];
				this.anInt942 = this.anIntArray268[local612] = local624;
				@Pc(741) String local741 = this.aStringArray14[local612];
				if (this.anInt891 == 0) {
					@Pc(746) int local746 = 16776960;
					if (this.anIntArray271[local612] < 6) {
						local746 = this.anIntArray242[this.anIntArray271[local612]];
					}
					if (this.anIntArray271[local612] == 6) {
						local746 = this.anInt886 % 20 < 10 ? 16711680 : 16776960;
					}
					if (this.anIntArray271[local612] == 7) {
						local746 = this.anInt886 % 20 < 10 ? 255 : 65535;
					}
					if (this.anIntArray271[local612] == 8) {
						local746 = this.anInt886 % 20 < 10 ? 45056 : 8454016;
					}
					@Pc(821) int local821;
					if (this.anIntArray271[local612] == 9) {
						local821 = 150 - this.anIntArray273[local612];
						if (local821 < 50) {
							local746 = local821 * 1280 + 16711680;
						} else if (local821 < 100) {
							local746 = 16776960 - (local821 - 50) * 327680;
						} else if (local821 < 150) {
							local746 = (local821 - 100) * 5 + 65280;
						}
					}
					if (this.anIntArray271[local612] == 10) {
						local821 = 150 - this.anIntArray273[local612];
						if (local821 < 50) {
							local746 = local821 * 5 + 16711680;
						} else if (local821 < 100) {
							local746 = 16711935 - (local821 - 50) * 327680;
						} else if (local821 < 150) {
							local746 = (local821 - 100) * 327680 + 255 - (local821 - 100) * 5;
						}
					}
					if (this.anIntArray271[local612] == 11) {
						local821 = 150 - this.anIntArray273[local612];
						if (local821 < 50) {
							local746 = 16777215 - local821 * 327685;
						} else if (local821 < 100) {
							local746 = (local821 - 50) * 327685 + 65280;
						} else if (local821 < 150) {
							local746 = 16777215 - (local821 - 100) * 327680;
						}
					}
					if (this.anIntArray272[local612] == 0) {
						this.aClass2_Sub1_Sub1_Sub1_4.method35(0, this.anInt942 + 1, local741, this.anInt941);
						this.aClass2_Sub1_Sub1_Sub1_4.method35(local746, this.anInt942, local741, this.anInt941);
					}
					if (this.anIntArray272[local612] == 1) {
						this.aClass2_Sub1_Sub1_Sub1_4.method40(local741, this.anInt941, this.anInt942 + 1, this.anInt886, 0);
						this.aClass2_Sub1_Sub1_Sub1_4.method40(local741, this.anInt941, this.anInt942, this.anInt886, local746);
					}
					if (this.anIntArray272[local612] == 2) {
						this.aClass2_Sub1_Sub1_Sub1_4.method41(this.anInt886, 0, this.anInt942 + 1, this.anInt941, local741);
						this.aClass2_Sub1_Sub1_Sub1_4.method41(this.anInt886, local746, this.anInt942, this.anInt941, local741);
					}
					if (this.anIntArray272[local612] == 3) {
						this.aClass2_Sub1_Sub1_Sub1_4.method42(local741, 150 - this.anIntArray273[local612], this.anInt886, this.anInt920, this.anInt941, this.anInt942 + 1, 0);
						this.aClass2_Sub1_Sub1_Sub1_4.method42(local741, 150 - this.anIntArray273[local612], this.anInt886, this.anInt920, this.anInt941, this.anInt942, local746);
					}
					@Pc(1120) int local1120;
					if (this.anIntArray272[local612] == 4) {
						local821 = this.aClass2_Sub1_Sub1_Sub1_4.method38(local741, 324);
						local1120 = (150 - this.anIntArray273[local612]) * (local821 + 100) / 150;
						Class2_Sub1_Sub1.method275(this.anInt941 - 50, 0, 334, this.anInt941 + 50);
						this.aClass2_Sub1_Sub1_Sub1_4.method39(this.anInt941 + 50 - local1120, local741, this.anInt942 + 1, 0);
						this.aClass2_Sub1_Sub1_Sub1_4.method39(this.anInt941 + 50 - local1120, local741, this.anInt942, local746);
						Class2_Sub1_Sub1.method274(this.aByte65);
					}
					if (this.anIntArray272[local612] == 5) {
						local821 = 150 - this.anIntArray273[local612];
						local1120 = 0;
						if (local821 < 25) {
							local1120 = local821 - 25;
						} else if (local821 > 125) {
							local1120 = local821 - 125;
						}
						Class2_Sub1_Sub1.method275(0, this.anInt942 - this.aClass2_Sub1_Sub1_Sub1_4.anInt38 - 1, this.anInt942 + 5, 512);
						this.aClass2_Sub1_Sub1_Sub1_4.method35(0, this.anInt942 + local1120 + 1, local741, this.anInt941);
						this.aClass2_Sub1_Sub1_Sub1_4.method35(local746, this.anInt942 + local1120, local741, this.anInt941);
						Class2_Sub1_Sub1.method274(this.aByte65);
					}
				} else {
					this.aClass2_Sub1_Sub1_Sub1_4.method35(0, this.anInt942 + 1, local741, this.anInt941);
					this.aClass2_Sub1_Sub1_Sub1_4.method35(16776960, this.anInt942, local741, this.anInt941);
				}
			}
		} catch (@Pc(1275) RuntimeException local1275) {
			signlink.reporterror("91840, " + 7 + ", " + local1275.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(IZ)V")
	private void method712(@OriginalArg(1) boolean arg0) {
		try {
			this.method654();
			this.aClass20_5.method230(this.anInt1025);
			this.aClass2_Sub1_Sub1_Sub4_1.method290(0, 0);
			@Pc(47) byte local47;
			@Pc(59) int local59;
			if (this.anInt1026 == 0) {
				this.aClass2_Sub1_Sub1_Sub1_2.method36(true, this.aClass9_Sub1_1.aString15, 180, 7711145, 180);
				local47 = 80;
				this.aClass2_Sub1_Sub1_Sub1_4.method36(true, "Welcome to RuneScape", 80, 16776960, 180);
				local59 = local47 + 30;
				this.aClass2_Sub1_Sub1_Sub4_2.method290(100, 27);
				this.aClass2_Sub1_Sub1_Sub1_4.method36(true, "New User", 125, 16777215, 100);
				this.aClass2_Sub1_Sub1_Sub4_2.method290(100, 187);
				this.aClass2_Sub1_Sub1_Sub1_4.method36(true, "Existing User", 125, 16777215, 260);
			}
			if (this.anInt1026 == 2) {
				local47 = 60;
				if (this.aString17.length() > 0) {
					this.aClass2_Sub1_Sub1_Sub1_4.method36(true, this.aString17, 45, 16776960, 180);
					this.aClass2_Sub1_Sub1_Sub1_4.method36(true, this.aString18, 60, 16776960, 180);
					local59 = local47 + 30;
				} else {
					this.aClass2_Sub1_Sub1_Sub1_4.method36(true, this.aString18, 53, 16776960, 180);
					local59 = local47 + 30;
				}
				this.aClass2_Sub1_Sub1_Sub1_4.method43(90, true, 90, "Username: " + this.aString26 + (this.anInt959 == 0 & anInt970 % 40 < 20 ? "@yel@|" : ""), 16777215);
				local59 += 15;
				this.aClass2_Sub1_Sub1_Sub1_4.method43(92, true, 105, "Password: " + Class34.method483(this.aString27) + (this.anInt959 == 1 & anInt970 % 40 < 20 ? "@yel@|" : ""), 16777215);
				local59 += 15;
				if (!arg0) {
					this.aClass2_Sub1_Sub1_Sub4_2.method290(130, 27);
					this.aClass2_Sub1_Sub1_Sub1_4.method36(true, "Login", 155, 16777215, 100);
					this.aClass2_Sub1_Sub1_Sub4_2.method290(130, 187);
					this.aClass2_Sub1_Sub1_Sub1_4.method36(true, "Cancel", 155, 16777215, 260);
				}
			}
			if (this.anInt1026 == 3) {
				this.aClass2_Sub1_Sub1_Sub1_4.method36(true, "Create a free account", 40, 16776960, 180);
				local47 = 65;
				this.aClass2_Sub1_Sub1_Sub1_4.method36(true, "To create a new account you need to", 65, 16777215, 180);
				local59 = local47 + 15;
				this.aClass2_Sub1_Sub1_Sub1_4.method36(true, "go back to the main RuneScape webpage", 80, 16777215, 180);
				local59 += 15;
				this.aClass2_Sub1_Sub1_Sub1_4.method36(true, "and choose the 'create account'", 95, 16777215, 180);
				local59 += 15;
				this.aClass2_Sub1_Sub1_Sub1_4.method36(true, "button near the top of that page.", 110, 16777215, 180);
				local59 += 15;
				this.aClass2_Sub1_Sub1_Sub4_2.method290(130, 107);
				this.aClass2_Sub1_Sub1_Sub1_4.method36(true, "Cancel", 155, 16777215, 180);
			}
			this.aClass20_5.method231(171, super.aGraphics2, 202);
			if (this.aBoolean228) {
				this.aBoolean228 = false;
				this.aClass20_3.method231(0, super.aGraphics2, 128);
				this.aClass20_4.method231(371, super.aGraphics2, 202);
				this.aClass20_8.method231(265, super.aGraphics2, 0);
				this.aClass20_9.method231(265, super.aGraphics2, 562);
				this.aClass20_10.method231(171, super.aGraphics2, 128);
				this.aClass20_11.method231(171, super.aGraphics2, 562);
			}
		} catch (@Pc(500) RuntimeException local500) {
			signlink.reporterror("96233, " + -879 + ", " + arg0 + ", " + local500.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(I)V")
	@Override
	protected void method582() {
		try {
			if (!this.aBoolean266 && !this.aBoolean267 && !this.aBoolean232) {
				anInt970++;
				this.anInt972 += 0;
				if (this.aBoolean248) {
					this.method722();
				} else {
					this.method716();
				}
				this.method694();
			}
		} catch (@Pc(35) RuntimeException local35) {
			signlink.reporterror("11259, " + 0 + ", " + local35.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(IIZ)V")
	private void method713(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(1) int local1 = 0;
			for (@Pc(3) int local3 = 0; local3 < 100; local3++) {
				if (this.aStringArray13[local3] != null) {
					@Pc(15) int local15 = this.anIntArray264[local3];
					@Pc(26) int local26 = this.anInt850 + 70 + 4 - local1 * 14;
					if (local26 < -20) {
						break;
					}
					@Pc(34) String local34 = this.aStringArray12[local3];
					if (local34 != null && local34.startsWith("@cr1@")) {
						local34 = local34.substring(5);
					}
					if (local34 != null && local34.startsWith("@cr2@")) {
						local34 = local34.substring(5);
					}
					if (local15 == 0) {
						local1++;
					}
					if ((local15 == 1 || local15 == 2) && (local15 == 1 || this.anInt1066 == 0 || this.anInt1066 == 1 && this.method642(local34))) {
						if (arg1 > local26 - 14 && arg1 <= local26 && !local34.equals(aClass2_Sub1_Sub3_Sub1_Sub1_1.aString5)) {
							if (this.anInt921 >= 1) {
								this.aStringArray8[this.anInt1004] = "Report abuse @whi@" + local34;
								this.anIntArray222[this.anInt1004] = 160;
								this.anInt1004++;
							}
							this.aStringArray8[this.anInt1004] = "Add ignore @whi@" + local34;
							this.anIntArray222[this.anInt1004] = 352;
							this.anInt1004++;
							this.aStringArray8[this.anInt1004] = "Add friend @whi@" + local34;
							this.anIntArray222[this.anInt1004] = 702;
							this.anInt1004++;
						}
						local1++;
					}
					if ((local15 == 3 || local15 == 7) && this.anInt986 == 0 && (local15 == 7 || this.anInt900 == 0 || this.anInt900 == 1 && this.method642(local34))) {
						if (arg1 > local26 - 14 && arg1 <= local26) {
							if (this.anInt921 >= 1) {
								this.aStringArray8[this.anInt1004] = "Report abuse @whi@" + local34;
								this.anIntArray222[this.anInt1004] = 160;
								this.anInt1004++;
							}
							this.aStringArray8[this.anInt1004] = "Add ignore @whi@" + local34;
							this.anIntArray222[this.anInt1004] = 352;
							this.anInt1004++;
							this.aStringArray8[this.anInt1004] = "Add friend @whi@" + local34;
							this.anIntArray222[this.anInt1004] = 702;
							this.anInt1004++;
						}
						local1++;
					}
					if (local15 == 4 && (this.anInt895 == 0 || this.anInt895 == 1 && this.method642(local34))) {
						if (arg1 > local26 - 14 && arg1 <= local26) {
							this.aStringArray8[this.anInt1004] = "Accept trade @whi@" + local34;
							this.anIntArray222[this.anInt1004] = 172;
							this.anInt1004++;
						}
						local1++;
					}
					if ((local15 == 5 || local15 == 6) && this.anInt986 == 0 && this.anInt900 < 2) {
						local1++;
					}
					if (local15 == 8 && (this.anInt895 == 0 || this.anInt895 == 1 && this.method642(local34))) {
						if (arg1 > local26 - 14 && arg1 <= local26) {
							this.aStringArray8[this.anInt1004] = "Accept challenge @whi@" + local34;
							this.anIntArray222[this.anInt1004] = 716;
							this.anInt1004++;
						}
						local1++;
					}
				}
			}
		} catch (@Pc(405) RuntimeException local405) {
			signlink.reporterror("969, " + arg0 + ", " + arg1 + ", " + false + ", " + local405.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "M", descriptor = "(I)V")
	private void method714() {
		try {
			if (this.anInt929 == 2) {
				for (@Pc(14) Class2_Sub3 local14 = (Class2_Sub3) this.aClass13_11.method200(); local14 != null; local14 = (Class2_Sub3) this.aClass13_11.method202()) {
					if (local14.anInt766 > 0) {
						local14.anInt766--;
					}
					if (local14.anInt766 != 0) {
						if (local14.anInt755 > 0) {
							local14.anInt755--;
						}
						if (local14.anInt755 == 0 && local14.anInt764 >= 1 && local14.anInt765 >= 1 && local14.anInt764 <= 102 && local14.anInt765 <= 102 && (local14.anInt759 < 0 || Class42.method552(local14.anInt759, local14.anInt761))) {
							this.method664(local14.anInt759, local14.anInt763, local14.anInt760, local14.anInt764, local14.anInt761, local14.anInt762, local14.anInt765);
							local14.anInt755 = -1;
							if (local14.anInt759 == local14.anInt756 && local14.anInt756 == -1) {
								local14.method530();
							} else if (local14.anInt759 == local14.anInt756 && local14.anInt760 == local14.anInt757 && local14.anInt761 == local14.anInt758) {
								local14.method530();
							}
						}
					} else if (local14.anInt756 < 0 || Class42.method552(local14.anInt756, local14.anInt758)) {
						this.method664(local14.anInt756, local14.anInt763, local14.anInt757, local14.anInt764, local14.anInt758, local14.anInt762, local14.anInt765);
						local14.method530();
					}
				}
			}
		} catch (@Pc(157) RuntimeException local157) {
			signlink.reporterror("39445, " + 39212 + ", " + local157.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(ILclient!BSNPYLEV;I)V")
	private void method715(@OriginalArg(1) Class2_Sub1_Sub2 arg0, @OriginalArg(2) int arg1) {
		try {
			for (@Pc(5) int local5 = 0; local5 < this.anInt950; local5++) {
				@Pc(12) int local12 = this.anIntArray246[local5];
				@Pc(17) Class2_Sub1_Sub3_Sub1_Sub1 local17 = this.aClass2_Sub1_Sub3_Sub1_Sub1Array1[local12];
				@Pc(20) int local20 = arg0.method94();
				if ((local20 & 0x2) != 0) {
					local20 += arg0.method94() << 8;
				}
				this.method613(local17, local20, local12, arg0);
			}
		} catch (@Pc(45) RuntimeException local45) {
			signlink.reporterror("94807, " + 39981 + ", " + arg0 + ", " + arg1 + ", " + local45.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "N", descriptor = "(I)V")
	private void method716() {
		try {
			@Pc(17) int local17;
			@Pc(24) int local24;
			if (this.anInt1026 == 0) {
				local17 = super.anInt834 / 2 - 80;
				local24 = super.anInt835 / 2 + 20;
				local24 += 20;
				if (super.anInt843 == 1 && super.anInt844 >= local17 - 75 && super.anInt844 <= local17 + 75 && super.anInt845 >= local24 - 20 && super.anInt845 <= local24 + 20) {
					this.anInt1026 = 3;
					this.anInt959 = 0;
				}
				local17 = super.anInt834 / 2 + 80;
				if (super.anInt843 == 1 && super.anInt844 >= local17 - 75 && super.anInt844 <= local17 + 75 && super.anInt845 >= local24 - 20 && super.anInt845 <= local24 + 20) {
					this.aString17 = "";
					this.aString18 = "Enter your username & password.";
					this.anInt1026 = 2;
					this.anInt959 = 0;
				}
			} else if (this.anInt1026 == 2) {
				local17 = super.anInt835 / 2 - 40;
				local17 += 30;
				local17 += 25;
				if (super.anInt843 == 1 && super.anInt845 >= local17 - 15 && super.anInt845 < local17) {
					this.anInt959 = 0;
				}
				local17 += 15;
				if (super.anInt843 == 1 && super.anInt845 >= local17 - 15 && super.anInt845 < local17) {
					this.anInt959 = 1;
				}
				local17 += 15;
				local24 = super.anInt834 / 2 - 80;
				@Pc(170) int local170 = super.anInt835 / 2 + 50;
				@Pc(171) int local171 = local170 + 20;
				if (super.anInt843 == 1 && super.anInt844 >= local24 - 75 && super.anInt844 <= local24 + 75 && super.anInt845 >= local171 - 20 && super.anInt845 <= local171 + 20) {
					this.anInt879 = 0;
					this.method725(this.aString26, this.aString27, false);
					if (this.aBoolean248) {
						return;
					}
				}
				local24 = super.anInt834 / 2 + 80;
				if (super.anInt843 == 1 && super.anInt844 >= local24 - 75 && super.anInt844 <= local24 + 75 && super.anInt845 >= local171 - 20 && super.anInt845 <= local171 + 20) {
					this.anInt1026 = 0;
					this.aString26 = "";
					this.aString27 = "";
				}
				while (true) {
					while (true) {
						@Pc(261) int local261 = this.method580();
						if (local261 == -1) {
							return;
						}
						@Pc(266) boolean local266 = false;
						for (@Pc(268) int local268 = 0; local268 < aString29.length(); local268++) {
							if (local261 == aString29.charAt(local268)) {
								local266 = true;
								break;
							}
						}
						if (this.anInt959 == 0) {
							if (local261 == 8 && this.aString26.length() > 0) {
								this.aString26 = this.aString26.substring(0, this.aString26.length() - 1);
							}
							if (local261 == 9 || local261 == 10 || local261 == 13) {
								this.anInt959 = 1;
							}
							if (local266) {
								this.aString26 = this.aString26 + (char) local261;
							}
							if (this.aString26.length() > 12) {
								this.aString26 = this.aString26.substring(0, 12);
							}
						} else if (this.anInt959 == 1) {
							if (local261 == 8 && this.aString27.length() > 0) {
								this.aString27 = this.aString27.substring(0, this.aString27.length() - 1);
							}
							if (local261 == 9 || local261 == 10 || local261 == 13) {
								this.anInt959 = 0;
							}
							if (local266) {
								this.aString27 = this.aString27 + (char) local261;
							}
							if (this.aString27.length() > 20) {
								this.aString27 = this.aString27.substring(0, 20);
							}
						}
					}
				}
			} else if (this.anInt1026 == 3) {
				local17 = super.anInt834 / 2;
				local24 = super.anInt835 / 2 + 50;
				@Pc(425) int local425 = local24 + 20;
				if (super.anInt843 == 1 && super.anInt844 >= local17 - 75 && super.anInt844 <= local17 + 75 && super.anInt845 >= local425 - 20 && super.anInt845 <= local425 + 20) {
					this.anInt1026 = 0;
					return;
				}
			}
		} catch (@Pc(458) RuntimeException local458) {
			signlink.reporterror("52652, " + -370 + ", " + local458.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "O", descriptor = "(I)V")
	private void method717(@OriginalArg(0) int arg0) {
		try {
			@Pc(6) Class2_Sub3 local6 = (Class2_Sub3) this.aClass13_11.method200();
			if (arg0 != 0) {
				this.aClass2_Sub1_Sub2_6.method84(133);
			}
			while (local6 != null) {
				if (local6.anInt766 == -1) {
					local6.anInt755 = 0;
					this.method665(local6);
				} else {
					local6.method530();
				}
				local6 = (Class2_Sub3) this.aClass13_11.method202();
			}
		} catch (@Pc(39) RuntimeException local39) {
			signlink.reporterror("73015, " + arg0 + ", " + local39.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(BILclient!BSNPYLEV;)V")
	private void method718(@OriginalArg(1) int arg0, @OriginalArg(2) Class2_Sub1_Sub2 arg1) {
		try {
			arg1.method104();
			@Pc(9) int local9 = arg1.method105(8, 588);
			@Pc(15) int local15;
			if (local9 < this.anInt866) {
				for (local15 = local9; local15 < this.anInt866; local15++) {
					this.anIntArray243[this.anInt939++] = this.anIntArray215[local15];
				}
			}
			if (local9 > this.anInt866) {
				signlink.reporterror(this.aString26 + " Too many npcs");
				throw new RuntimeException("eek");
			}
			this.anInt866 = 0;
			for (local15 = 0; local15 < local9; local15++) {
				@Pc(67) int local67 = this.anIntArray215[local15];
				@Pc(72) Class2_Sub1_Sub3_Sub1_Sub2 local72 = this.aClass2_Sub1_Sub3_Sub1_Sub2Array1[local67];
				@Pc(77) int local77 = arg1.method105(1, 588);
				if (local77 == 0) {
					this.anIntArray215[this.anInt866++] = local67;
					local72.anInt706 = anInt970;
				} else {
					@Pc(100) int local100 = arg1.method105(2, 588);
					if (local100 == 0) {
						this.anIntArray215[this.anInt866++] = local67;
						local72.anInt706 = anInt970;
						this.anIntArray246[this.anInt950++] = local67;
					} else {
						@Pc(151) int local151;
						@Pc(161) int local161;
						if (local100 == 1) {
							this.anIntArray215[this.anInt866++] = local67;
							local72.anInt706 = anInt970;
							local151 = arg1.method105(3, 588);
							local72.method490(false, local151);
							local161 = arg1.method105(1, 588);
							if (local161 == 1) {
								this.anIntArray246[this.anInt950++] = local67;
							}
						} else if (local100 == 2) {
							this.anIntArray215[this.anInt866++] = local67;
							local72.anInt706 = anInt970;
							local151 = arg1.method105(3, 588);
							local72.method490(true, local151);
							local161 = arg1.method105(3, 588);
							local72.method490(true, local161);
							@Pc(219) int local219 = arg1.method105(1, 588);
							if (local219 == 1) {
								this.anIntArray246[this.anInt950++] = local67;
							}
						} else if (local100 == 3) {
							this.anIntArray243[this.anInt939++] = local67;
						}
					}
				}
			}
		} catch (@Pc(266) RuntimeException local266) {
			signlink.reporterror("63986, " + 7 + ", " + arg0 + ", " + arg1 + ", " + local266.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "P", descriptor = "(I)V")
	private void method719(@OriginalArg(0) int arg0) {
		try {
			this.anInt886++;
			this.method601(true);
			this.method666(true);
			this.method601(false);
			this.method666(false);
			this.method695();
			this.method647();
			@Pc(35) int local35;
			@Pc(74) int local74;
			if (!this.aBoolean251) {
				local35 = this.anInt856;
				if (this.anInt894 / 256 > local35) {
					local35 = this.anInt894 / 256;
				}
				if (this.aBooleanArray12[4] && this.anIntArray251[4] + 128 > local35) {
					local35 = this.anIntArray251[4] + 128;
				}
				local74 = this.anInt857 + this.anInt923 & 0x7FF;
				this.method670(local35, this.anInt963, this.method622(aClass2_Sub1_Sub3_Sub1_Sub1_1.anInt681, this.anInt882, aClass2_Sub1_Sub3_Sub1_Sub1_1.anInt680) - 50, local35 * 3 + 600, local74, this.anInt964);
			}
			if (this.aBoolean251) {
				local35 = this.method686();
			} else {
				local35 = this.method685();
			}
			local74 = this.anInt913;
			@Pc(118) int local118 = this.anInt914;
			@Pc(121) int local121 = this.anInt915;
			@Pc(124) int local124 = this.anInt916;
			@Pc(127) int local127 = this.anInt917;
			@Pc(176) int local176;
			for (@Pc(129) int local129 = 0; local129 < 5; local129++) {
				if (this.aBooleanArray12[local129]) {
					local176 = (int) (Math.random() * (double) (this.anIntArray218[local129] * 2 + 1) - (double) this.anIntArray218[local129] + Math.sin((double) this.anIntArray226[local129] * ((double) this.anIntArray259[local129] / 100.0D)) * (double) this.anIntArray251[local129]);
					if (local129 == 0) {
						this.anInt913 += local176;
					}
					if (local129 == 1) {
						this.anInt914 += local176;
					}
					if (local129 == 2) {
						this.anInt915 += local176;
					}
					if (local129 == 3) {
						this.anInt917 = this.anInt917 + local176 & 0x7FF;
					}
					if (local129 == 4) {
						this.anInt916 += local176;
						if (this.anInt916 < 128) {
							this.anInt916 = 128;
						}
						if (this.anInt916 > 383) {
							this.anInt916 = 383;
						}
					}
				}
			}
			local176 = Class2_Sub1_Sub1_Sub3.anInt258;
			Class2_Sub1_Sub3_Sub4.aBoolean168 = true;
			Class2_Sub1_Sub3_Sub4.anInt598 = 0;
			Class2_Sub1_Sub3_Sub4.anInt596 = super.anInt838 - 4;
			Class2_Sub1_Sub3_Sub4.anInt597 = super.anInt839 - 4;
			Class2_Sub1_Sub1.method276();
			this.aClass29_1.method363(this.anInt915, this.anInt916, local35, this.anInt913, this.anInt914, this.anInt917);
			this.aClass29_1.method338();
			this.method711();
			this.method681();
			this.method679(local176);
			@Pc(291) boolean local291 = false;
			this.method640();
			this.aClass20_17.method231(4, super.aGraphics2, 4);
			this.anInt913 = local74;
			this.anInt914 = local118;
			this.anInt915 = local121;
			this.anInt916 = local124;
			this.anInt917 = local127;
		} catch (@Pc(319) RuntimeException local319) {
			signlink.reporterror("99029, " + arg0 + ", " + local319.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "o", descriptor = "(B)V")
	private void method720(@OriginalArg(0) byte arg0) {
		try {
			@Pc(11) int local11;
			for (@Pc(3) int local3 = -1; local3 < this.anInt949; local3++) {
				if (local3 == -1) {
					local11 = this.anInt948;
				} else {
					local11 = this.anIntArray245[local3];
				}
				@Pc(23) Class2_Sub1_Sub3_Sub1_Sub1 local23 = this.aClass2_Sub1_Sub3_Sub1_Sub1Array1[local11];
				if (local23 != null && local23.anInt683 > 0) {
					local23.anInt683--;
					if (local23.anInt683 == 0) {
						local23.aString13 = null;
					}
				}
			}
			anInt994++;
			@Pc(54) boolean local54 = false;
			if (anInt994 > 189) {
				anInt994 = 0;
				this.aClass2_Sub1_Sub2_6.method83(191);
				this.aClass2_Sub1_Sub2_6.method84(247);
			}
			for (local11 = 0; local11 < this.anInt866; local11++) {
				@Pc(83) int local83 = this.anIntArray215[local11];
				@Pc(88) Class2_Sub1_Sub3_Sub1_Sub2 local88 = this.aClass2_Sub1_Sub3_Sub1_Sub2Array1[local83];
				if (local88 != null && local88.anInt683 > 0) {
					local88.anInt683--;
					if (local88.anInt683 == 0) {
						local88.aString13 = null;
					}
				}
			}
		} catch (@Pc(112) RuntimeException local112) {
			signlink.reporterror("75001, " + arg0 + ", " + local112.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILclient!KYEPSAQL;)V")
	private void method721(@OriginalArg(1) Class2_Sub1_Sub1_Sub4 arg0) {
		try {
			for (@Pc(15) int local15 = 0; local15 < this.anIntArray239.length; local15++) {
				this.anIntArray239[local15] = 0;
			}
			@Pc(40) int local40;
			for (@Pc(30) int local30 = 0; local30 < 5000; local30++) {
				local40 = (int) (Math.random() * 128.0D * (double) 256);
				this.anIntArray239[local40] = (int) (Math.random() * 256.0D);
			}
			@Pc(58) int local58;
			@Pc(62) int local62;
			@Pc(70) int local70;
			for (local40 = 0; local40 < 20; local40++) {
				for (local58 = 1; local58 < 255; local58++) {
					for (local62 = 1; local62 < 127; local62++) {
						local70 = local62 + (local58 << 7);
						this.anIntArray240[local70] = (this.anIntArray239[local70 - 1] + this.anIntArray239[local70 + 1] + this.anIntArray239[local70 - 128] + this.anIntArray239[local70 + 128]) / 4;
					}
				}
				@Pc(116) int[] local116 = this.anIntArray239;
				this.anIntArray239 = this.anIntArray240;
				this.anIntArray240 = local116;
			}
			if (arg0 != null) {
				local58 = 0;
				for (local62 = 0; local62 < arg0.anInt293; local62++) {
					for (local70 = 0; local70 < arg0.anInt292; local70++) {
						if (arg0.aByteArray10[local58++] != 0) {
							@Pc(152) int local152 = local70 + arg0.anInt294 + 16;
							@Pc(159) int local159 = local62 + arg0.anInt295 + 16;
							@Pc(165) int local165 = local152 + (local159 << 7);
							this.anIntArray239[local165] = 0;
						}
					}
				}
			}
		} catch (@Pc(182) RuntimeException local182) {
			signlink.reporterror("50056, " + 539 + ", " + arg0 + ", " + local182.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "p", descriptor = "(B)V")
	private void method722() {
		try {
			if (this.anInt1068 > 1) {
				this.anInt1068--;
			}
			if (this.anInt976 > 0) {
				this.anInt976--;
			}
			for (@Pc(32) int local32 = 0; local32 < 5 && this.method672(this.aBoolean254); local32++) {
			}
			if (this.aBoolean248) {
				@Pc(52) Object local52 = this.aClass19_1.anObject1;
				@Pc(77) int local77;
				@Pc(79) int local79;
				@Pc(81) int local81;
				@Pc(114) int local114;
				synchronized (this.aClass19_1.anObject1) {
					if (!aBoolean260) {
						this.aClass19_1.anInt233 = 0;
					} else if (super.anInt843 != 0 || this.aClass19_1.anInt233 >= 40) {
						this.aClass2_Sub1_Sub2_6.method83(148);
						this.aClass2_Sub1_Sub2_6.method84(0);
						local77 = this.aClass2_Sub1_Sub2_6.anInt81;
						local79 = 0;
						@Pc(97) int local97;
						for (local81 = 0; local81 < this.aClass19_1.anInt233 && local77 - this.aClass2_Sub1_Sub2_6.anInt81 < 240; local81++) {
							local79++;
							local97 = this.aClass19_1.anIntArray51[local81];
							if (local97 < 0) {
								local97 = 0;
							} else if (local97 > 502) {
								local97 = 502;
							}
							local114 = this.aClass19_1.anIntArray52[local81];
							if (local114 < 0) {
								local114 = 0;
							} else if (local114 > 764) {
								local114 = 764;
							}
							@Pc(131) int local131 = local97 * 765 + local114;
							if (this.aClass19_1.anIntArray51[local81] == -1 && this.aClass19_1.anIntArray52[local81] == -1) {
								local114 = -1;
								local97 = -1;
								local131 = 524287;
							}
							if (local114 != this.anInt1056 || local97 != this.anInt1057) {
								@Pc(176) int local176 = local114 - this.anInt1056;
								this.anInt1056 = local114;
								@Pc(184) int local184 = local97 - this.anInt1057;
								this.anInt1057 = local97;
								if (this.anInt918 < 8 && local176 >= -32 && local176 <= 31 && local184 >= -32 && local184 <= 31) {
									local176 += 32;
									local184 += 32;
									this.aClass2_Sub1_Sub2_6.method85((this.anInt918 << 12) + (local176 << 6) + local184);
									this.anInt918 = 0;
								} else if (this.anInt918 < 8) {
									this.aClass2_Sub1_Sub2_6.method87((this.anInt918 << 19) + local131 + 8388608);
									this.anInt918 = 0;
								} else {
									this.aClass2_Sub1_Sub2_6.method88((this.anInt918 << 19) + local131 - 1073741824);
									this.anInt918 = 0;
								}
							} else if (this.anInt918 < 2047) {
								this.anInt918++;
							}
						}
						this.aClass2_Sub1_Sub2_6.method93(this.aClass2_Sub1_Sub2_6.anInt81 - local77);
						if (local79 >= this.aClass19_1.anInt233) {
							this.aClass19_1.anInt233 = 0;
						} else {
							this.aClass19_1.anInt233 -= local79;
							for (local97 = 0; local97 < this.aClass19_1.anInt233; local97++) {
								this.aClass19_1.anIntArray52[local97] = this.aClass19_1.anIntArray52[local97 + local79];
								this.aClass19_1.anIntArray51[local97] = this.aClass19_1.anIntArray51[local97 + local79];
							}
						}
					}
				}
				if (super.anInt843 != 0) {
					@Pc(346) long local346 = (super.aLong28 - this.aLong30) / 50L;
					if (local346 > 4095L) {
						local346 = 4095L;
					}
					this.aLong30 = super.aLong28;
					local77 = super.anInt845;
					if (local77 < 0) {
						local77 = 0;
					} else if (local77 > 502) {
						local77 = 502;
					}
					local79 = super.anInt844;
					if (local79 < 0) {
						local79 = 0;
					} else if (local79 > 764) {
						local79 = 764;
					}
					local81 = local77 * 765 + local79;
					@Pc(392) byte local392 = 0;
					if (super.anInt843 == 2) {
						local392 = 1;
					}
					local114 = (int) local346;
					this.aClass2_Sub1_Sub2_6.method83(31);
					this.aClass2_Sub1_Sub2_6.method126((local114 << 20) + (local392 << 19) + local81);
				}
				if (this.anInt965 > 0) {
					this.anInt965--;
				}
				if (super.anIntArray210[1] == 1 || super.anIntArray210[2] == 1 || super.anIntArray210[3] == 1 || super.anIntArray210[4] == 1) {
					this.aBoolean257 = true;
				}
				if (this.aBoolean257 && this.anInt965 <= 0) {
					this.anInt965 = 20;
					this.aBoolean257 = false;
					this.aClass2_Sub1_Sub2_6.method83(67);
					this.aClass2_Sub1_Sub2_6.method117(this.anInt856, 26);
					this.aClass2_Sub1_Sub2_6.method119(this.anInt857);
				}
				if (super.aBoolean225 && !this.aBoolean247) {
					this.aBoolean247 = true;
					this.aClass2_Sub1_Sub2_6.method83(118);
					this.aClass2_Sub1_Sub2_6.method84(1);
				}
				if (!super.aBoolean225 && this.aBoolean247) {
					this.aBoolean247 = false;
					this.aClass2_Sub1_Sub2_6.method83(118);
					this.aClass2_Sub1_Sub2_6.method84(0);
				}
				this.method677(this.anInt940);
				this.method714();
				this.method602();
				this.anInt974++;
				if (this.anInt974 > 750) {
					this.method660();
				}
				this.method661();
				this.method702();
				this.method720((byte) 5);
				this.anInt885++;
				if (this.anInt992 != 0) {
					this.anInt991 += 20;
					if (this.anInt991 >= 400) {
						this.anInt992 = 0;
					}
				}
				if (this.anInt864 != 0) {
					this.anInt861++;
					if (this.anInt861 >= 15) {
						if (this.anInt864 == 2) {
							this.aBoolean233 = true;
						}
						if (this.anInt864 == 3) {
							this.aBoolean241 = true;
						}
						this.anInt864 = 0;
					}
				}
				if (this.anInt935 != 0) {
					this.anInt880++;
					if (super.anInt838 > this.anInt936 + 5 || super.anInt838 < this.anInt936 - 5 || super.anInt839 > this.anInt937 + 5 || super.anInt839 < this.anInt937 - 5) {
						this.aBoolean270 = true;
					}
					if (super.anInt837 == 0) {
						if (this.anInt935 == 2) {
							this.aBoolean233 = true;
						}
						if (this.anInt935 == 3) {
							this.aBoolean241 = true;
						}
						this.anInt935 = 0;
						if (this.aBoolean270 && this.anInt880 >= 5) {
							this.anInt969 = -1;
							this.method633();
							if (this.anInt969 == this.anInt933 && this.anInt968 != this.anInt934) {
								@Pc(695) Class31 local695 = Class31.method403(this.anInt933);
								@Pc(697) byte local697 = 0;
								if (this.anInt1058 == 1 && local695.anInt499 == 206) {
									local697 = 1;
								}
								if (local695.anIntArray101[this.anInt968] <= 0) {
									local697 = 0;
								}
								if (local695.aBoolean146) {
									local77 = this.anInt934;
									local79 = this.anInt968;
									local695.anIntArray101[local79] = local695.anIntArray101[local77];
									local695.anIntArray106[local79] = local695.anIntArray106[local77];
									local695.anIntArray101[local77] = -1;
									local695.anIntArray106[local77] = 0;
								} else if (local697 == 1) {
									local77 = this.anInt934;
									local79 = this.anInt968;
									while (local77 != local79) {
										if (local77 > local79) {
											local695.method398(local77, local77 - 1);
											local77--;
										} else if (local77 < local79) {
											local695.method398(local77, local77 + 1);
											local77++;
										}
									}
								} else {
									local695.method398(this.anInt934, this.anInt968);
								}
								this.aClass2_Sub1_Sub2_6.method83(99);
								this.aClass2_Sub1_Sub2_6.method117(this.anInt934, 26);
								this.aClass2_Sub1_Sub2_6.method85(this.anInt968);
								this.aClass2_Sub1_Sub2_6.method111(local697);
								this.aClass2_Sub1_Sub2_6.method118(this.anInt933);
							}
						} else if ((this.anInt867 == 1 || this.method632(this.anInt1004 - 1)) && this.anInt1004 > 2) {
							this.method605();
						} else if (this.anInt1004 > 0) {
							this.method668(this.anInt1004 - 1);
						}
						this.anInt861 = 10;
						super.anInt843 = 0;
					}
				}
				@Pc(869) int local869;
				@Pc(871) int local871;
				if (Class29.anInt438 != -1) {
					local869 = Class29.anInt438;
					local871 = Class29.anInt439;
					@Pc(892) boolean local892 = this.method659(0, 0, 0, local869, aClass2_Sub1_Sub3_Sub1_Sub1_1.anIntArray166[0], 0, 0, aClass2_Sub1_Sub3_Sub1_Sub1_1.anIntArray165[0], true, 0, local871);
					Class29.anInt438 = -1;
					if (local892) {
						this.anInt989 = super.anInt844;
						this.anInt990 = super.anInt845;
						this.anInt992 = 1;
						this.anInt991 = 0;
					}
				}
				if (super.anInt843 == 1 && this.aString22 != null) {
					this.aString22 = null;
					this.aBoolean241 = true;
					super.anInt843 = 0;
				}
				this.method689();
				if (this.anInt1008 == -1) {
					this.method675();
					this.method676();
					this.method652();
				}
				if (super.anInt837 == 1 || super.anInt843 == 1) {
					this.anInt944++;
				}
				if (this.anInt1032 == 0 && this.anInt996 == 0 && this.anInt1067 == 0) {
					if (this.anInt904 > 0) {
						this.anInt904--;
					}
				} else if (this.anInt904 < 100) {
					this.anInt904++;
					if (this.anInt904 == 100) {
						if (this.anInt1032 != 0) {
							this.aBoolean241 = true;
						}
						if (this.anInt996 != 0) {
							this.aBoolean233 = true;
						}
					}
				}
				if (this.anInt929 == 2) {
					this.method723();
				}
				if (this.anInt929 == 2 && this.aBoolean251) {
					this.method600();
				}
				for (local869 = 0; local869 < 5; local869++) {
					@Pc(1028) int local1028 = this.anIntArray226[local869]++;
				}
				this.method609();
				super.anInt836++;
				if (super.anInt836 > 4500) {
					this.anInt976 = 250;
					super.anInt836 -= 500;
					this.aClass2_Sub1_Sub2_6.method83(219);
				}
				this.anInt1038++;
				if (this.anInt1038 > 500) {
					this.anInt1038 = 0;
					local871 = (int) (Math.random() * 8.0D);
					if ((local871 & 0x1) == 1) {
						this.anInt1040 += this.anInt1041;
					}
					if ((local871 & 0x2) == 2) {
						this.anInt872 += this.anInt873;
					}
					if ((local871 & 0x4) == 4) {
						this.anInt923 += this.anInt924;
					}
				}
				if (this.anInt1040 < -50) {
					this.anInt1041 = 2;
				}
				if (this.anInt1040 > 50) {
					this.anInt1041 = -2;
				}
				if (this.anInt872 < -55) {
					this.anInt873 = 2;
				}
				if (this.anInt872 > 55) {
					this.anInt873 = -2;
				}
				if (this.anInt923 < -40) {
					this.anInt924 = 1;
				}
				if (this.anInt923 > 40) {
					this.anInt924 = -1;
				}
				this.anInt852++;
				if (this.anInt852 > 500) {
					this.anInt852 = 0;
					local871 = (int) (Math.random() * 8.0D);
					if ((local871 & 0x1) == 1) {
						this.anInt1017 += this.anInt1018;
					}
					if ((local871 & 0x2) == 2) {
						this.anInt926 += this.anInt927;
					}
				}
				if (this.anInt1017 < -60) {
					this.anInt1018 = 2;
				}
				if (this.anInt1017 > 60) {
					this.anInt1018 = -2;
				}
				if (this.anInt926 < -20) {
					this.anInt927 = 1;
				}
				if (this.anInt926 > 10) {
					this.anInt927 = -1;
				}
				this.anInt975++;
				if (this.anInt975 > 50) {
					this.aClass2_Sub1_Sub2_6.method83(11);
				}
				try {
					if (this.aClass28_1 != null && this.aClass2_Sub1_Sub2_6.anInt81 > 0) {
						this.aClass28_1.method321(this.aClass2_Sub1_Sub2_6.aByteArray1, this.aClass2_Sub1_Sub2_6.anInt81, this.anInt945);
						this.aClass2_Sub1_Sub2_6.anInt81 = 0;
						this.anInt975 = 0;
					}
				} catch (@Pc(1271) IOException local1271) {
					this.method660();
				} catch (@Pc(1276) Exception local1276) {
					this.method629();
				}
			}
		} catch (@Pc(1281) RuntimeException local1281) {
			signlink.reporterror("25813, " + -81 + ", " + local1281.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "l", descriptor = "(Z)V")
	private void method723() {
		try {
			this.aBoolean248 &= true;
			try {
				@Pc(13) int local13 = aClass2_Sub1_Sub3_Sub1_Sub1_1.anInt680 + this.anInt1040;
				@Pc(19) int local19 = aClass2_Sub1_Sub3_Sub1_Sub1_1.anInt681 + this.anInt872;
				if (this.anInt963 - local13 < -500 || this.anInt963 - local13 > 500 || this.anInt964 - local19 < -500 || this.anInt964 - local19 > 500) {
					this.anInt963 = local13;
					this.anInt964 = local19;
				}
				if (this.anInt963 != local13) {
					this.anInt963 += (local13 - this.anInt963) / 16;
				}
				if (this.anInt964 != local19) {
					this.anInt964 += (local19 - this.anInt964) / 16;
				}
				if (super.anIntArray210[1] == 1) {
					this.anInt858 += (-this.anInt858 - 24) / 2;
				} else if (super.anIntArray210[2] == 1) {
					this.anInt858 += (24 - this.anInt858) / 2;
				} else {
					this.anInt858 /= 2;
				}
				if (super.anIntArray210[3] == 1) {
					this.anInt859 += (12 - this.anInt859) / 2;
				} else if (super.anIntArray210[4] == 1) {
					this.anInt859 += (-this.anInt859 - 12) / 2;
				} else {
					this.anInt859 /= 2;
				}
				this.anInt857 = this.anInt857 + this.anInt858 / 2 & 0x7FF;
				this.anInt856 += this.anInt859 / 2;
				if (this.anInt856 < 128) {
					this.anInt856 = 128;
				}
				if (this.anInt856 > 383) {
					this.anInt856 = 383;
				}
				@Pc(206) int local206 = this.anInt963 >> 7;
				@Pc(211) int local211 = this.anInt964 >> 7;
				@Pc(221) int local221 = this.method622(this.anInt964, this.anInt882, this.anInt963);
				@Pc(223) int local223 = 0;
				@Pc(239) int local239;
				if (local206 > 3 && local211 > 3 && local206 < 100 && local211 < 100) {
					for (local239 = local206 - 4; local239 <= local206 + 4; local239++) {
						for (@Pc(245) int local245 = local211 - 4; local245 <= local211 + 4; local245++) {
							@Pc(250) int local250 = this.anInt882;
							if (local250 < 3 && (this.aByteArrayArrayArray8[1][local239][local245] & 0x2) == 2) {
								local250++;
							}
							@Pc(277) int local277 = local221 - this.anIntArrayArrayArray8[local250][local239][local245];
							if (local277 > local223) {
								local223 = local277;
							}
						}
					}
				}
				local239 = local223 * 192;
				if (local239 > 98048) {
					local239 = 98048;
				}
				if (local239 < 32768) {
					local239 = 32768;
				}
				if (local239 > this.anInt894) {
					this.anInt894 += (local239 - this.anInt894) / 24;
				} else if (local239 < this.anInt894) {
					this.anInt894 += (local239 - this.anInt894) / 80;
				}
			} catch (@Pc(341) Exception local341) {
				signlink.reporterror("glfc_ex " + aClass2_Sub1_Sub3_Sub1_Sub1_1.anInt680 + "," + aClass2_Sub1_Sub3_Sub1_Sub1_1.anInt681 + "," + this.anInt963 + "," + this.anInt964 + "," + this.anInt1005 + "," + this.anInt1006 + "," + this.anInt951 + "," + this.anInt952);
				throw new RuntimeException("eek");
			}
		} catch (@Pc(391) RuntimeException local391) {
			signlink.reporterror("41370, " + true + ", " + local391.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/String;ZLjava/lang/String;I)V")
	private void method724(@OriginalArg(0) String arg0, @OriginalArg(2) String arg1, @OriginalArg(3) int arg2) {
		try {
			if (arg2 == 0 && this.anInt928 != -1) {
				this.aString22 = arg1;
				super.anInt843 = 0;
			}
			if (this.anInt871 == -1) {
				this.aBoolean241 = true;
			}
			for (@Pc(20) int local20 = 99; local20 > 0; local20--) {
				this.anIntArray264[local20] = this.anIntArray264[local20 - 1];
				this.aStringArray12[local20] = this.aStringArray12[local20 - 1];
				this.aStringArray13[local20] = this.aStringArray13[local20 - 1];
			}
			this.anIntArray264[0] = arg2;
			this.aStringArray12[0] = arg0;
			this.aStringArray13[0] = arg1;
		} catch (@Pc(79) RuntimeException local79) {
			signlink.reporterror("89145, " + arg0 + ", " + false + ", " + arg1 + ", " + arg2 + ", " + local79.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;Z)V")
	private void method725(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) boolean arg2) {
		signlink.errorname = arg0;
		try {
			if (!arg2) {
				this.aString17 = "";
				this.aString18 = "Connecting to server...";
				this.method712(true);
			}
			this.aClass28_1 = new Class28(this, this.method638(anInt1073 + 43594), (byte) -68);
			@Pc(30) long local30 = Class34.method478(arg0);
			@Pc(37) int local37 = (int) (local30 >> 16 & 0x1FL);
			this.aClass2_Sub1_Sub2_6.anInt81 = 0;
			this.aClass2_Sub1_Sub2_6.method84(14);
			this.aClass2_Sub1_Sub2_6.method84(local37);
			this.aClass28_1.method321(this.aClass2_Sub1_Sub2_6.aByteArray1, 2, this.anInt945);
			for (@Pc(61) int local61 = 0; local61 < 8; local61++) {
				this.aClass28_1.method318();
			}
			@Pc(75) int local75 = this.aClass28_1.method318();
			@Pc(77) int local77 = local75;
			@Pc(227) int local227;
			@Pc(262) int local262;
			if (local75 == 0) {
				this.aClass28_1.method320(this.aClass2_Sub1_Sub2_9.aByteArray1, 0, 8);
				this.aClass2_Sub1_Sub2_9.anInt81 = 0;
				this.aLong32 = this.aClass2_Sub1_Sub2_9.method100();
				@Pc(100) int[] local100 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (this.aLong32 >> 32), (int) this.aLong32 };
				this.aClass2_Sub1_Sub2_6.anInt81 = 0;
				this.aClass2_Sub1_Sub2_6.method84(10);
				this.aClass2_Sub1_Sub2_6.method88(local100[0]);
				this.aClass2_Sub1_Sub2_6.method88(local100[1]);
				this.aClass2_Sub1_Sub2_6.method88(local100[2]);
				this.aClass2_Sub1_Sub2_6.method88(local100[3]);
				this.aClass2_Sub1_Sub2_6.method88(signlink.anInt1075);
				this.aClass2_Sub1_Sub2_6.method91(arg0);
				this.aClass2_Sub1_Sub2_6.method91(arg1);
				this.aClass2_Sub1_Sub2_6.method109(aBigInteger2, this.aBoolean263, aBigInteger1);
				this.aClass2_Sub1_Sub2_8.anInt81 = 0;
				if (arg2) {
					this.aClass2_Sub1_Sub2_8.method84(18);
				} else {
					this.aClass2_Sub1_Sub2_8.method84(16);
				}
				this.aClass2_Sub1_Sub2_8.method84(this.aClass2_Sub1_Sub2_6.anInt81 + 36 + 1 + 1 + 2);
				this.aClass2_Sub1_Sub2_8.method84(255);
				this.aClass2_Sub1_Sub2_8.method85(375);
				this.aClass2_Sub1_Sub2_8.method84(aBoolean272 ? 1 : 0);
				for (local227 = 0; local227 < 9; local227++) {
					this.aClass2_Sub1_Sub2_8.method88(this.anIntArray244[local227]);
				}
				this.aClass2_Sub1_Sub2_8.method92(this.aClass2_Sub1_Sub2_6.anInt81, this.aClass2_Sub1_Sub2_6.aByteArray1);
				this.aClass2_Sub1_Sub2_6.aClass46_1 = new Class46(this.aByte64, local100);
				for (local262 = 0; local262 < 4; local262++) {
					local100[local262] += 50;
				}
				this.aClass46_2 = new Class46(this.aByte64, local100);
				this.aClass28_1.method321(this.aClass2_Sub1_Sub2_8.aByteArray1, this.aClass2_Sub1_Sub2_8.anInt81, this.anInt945);
				local75 = this.aClass28_1.method318();
			}
			if (local75 == 1) {
				try {
					Thread.sleep(2000L);
				} catch (@Pc(306) Exception local306) {
				}
				this.method725(arg0, arg1, arg2);
			} else {
				@Pc(394) int local394;
				if (local75 == 2) {
					this.anInt921 = this.aClass28_1.method318();
					aBoolean260 = this.aClass28_1.method318() == 1;
					this.aLong30 = 0L;
					this.anInt918 = 0;
					this.aClass19_1.anInt233 = 0;
					super.aBoolean225 = true;
					this.aBoolean247 = true;
					this.aBoolean248 = true;
					this.aClass2_Sub1_Sub2_6.anInt81 = 0;
					this.aClass2_Sub1_Sub2_9.anInt81 = 0;
					this.anInt973 = -1;
					this.anInt1042 = -1;
					this.anInt1043 = -1;
					this.anInt1044 = -1;
					this.anInt972 = 0;
					this.anInt974 = 0;
					this.anInt1068 = 0;
					this.anInt976 = 0;
					this.anInt1030 = 0;
					this.anInt1004 = 0;
					this.aBoolean262 = false;
					super.anInt836 = 0;
					for (local394 = 0; local394 < 100; local394++) {
						this.aStringArray13[local394] = null;
					}
					this.anInt955 = 0;
					this.anInt1000 = 0;
					this.anInt929 = 0;
					this.anInt938 = 0;
					this.anInt1040 = (int) (Math.random() * 100.0D) - 50;
					this.anInt872 = (int) (Math.random() * 110.0D) - 55;
					this.anInt923 = (int) (Math.random() * 80.0D) - 40;
					this.anInt1017 = (int) (Math.random() * 120.0D) - 60;
					this.anInt926 = (int) (Math.random() * 30.0D) - 20;
					this.anInt857 = (int) (Math.random() * 20.0D) - 10 & 0x7FF;
					this.anInt1007 = 0;
					this.anInt971 = -1;
					this.anInt931 = 0;
					this.anInt932 = 0;
					this.anInt949 = 0;
					this.anInt866 = 0;
					for (local227 = 0; local227 < this.anInt947; local227++) {
						this.aClass2_Sub1_Sub3_Sub1_Sub1Array1[local227] = null;
						this.aClass2_Sub1_Sub2Array1[local227] = null;
					}
					for (local262 = 0; local262 < 16384; local262++) {
						this.aClass2_Sub1_Sub3_Sub1_Sub2Array1[local262] = null;
					}
					aClass2_Sub1_Sub3_Sub1_Sub1_1 = this.aClass2_Sub1_Sub3_Sub1_Sub1Array1[this.anInt948] = new Class2_Sub1_Sub3_Sub1_Sub1();
					this.aClass13_12.method204();
					this.aClass13_10.method204();
					@Pc(539) int local539;
					@Pc(543) int local543;
					for (@Pc(535) int local535 = 0; local535 < 4; local535++) {
						for (local539 = 0; local539 < 104; local539++) {
							for (local543 = 0; local543 < 104; local543++) {
								this.aClass13ArrayArrayArray1[local535][local539][local543] = null;
							}
						}
					}
					this.aClass13_11 = new Class13(true);
					this.anInt1014 = 0;
					this.anInt1013 = 0;
					this.method616(this.anInt928);
					this.anInt928 = -1;
					this.method616(this.anInt871);
					this.anInt871 = -1;
					this.method616(this.anInt903);
					this.anInt903 = -1;
					this.method616(this.anInt1008);
					this.anInt1008 = -1;
					this.method616(this.anInt1003);
					this.anInt1003 = -1;
					this.method616(this.anInt982);
					this.anInt982 = -1;
					this.method616(this.anInt870);
					this.anInt870 = -1;
					this.aBoolean231 = false;
					this.anInt1064 = 3;
					this.anInt912 = 0;
					this.aBoolean262 = false;
					this.aBoolean237 = false;
					this.aString22 = null;
					this.anInt962 = 0;
					this.anInt1060 = -1;
					this.aBoolean256 = true;
					this.method682();
					for (local539 = 0; local539 < 5; local539++) {
						this.anIntArray274[local539] = 0;
					}
					for (local543 = 0; local543 < 5; local543++) {
						this.aStringArray10[local543] = null;
						this.aBooleanArray11[local543] = false;
					}
					anInt1065 = 0;
					anInt993 = 0;
					anInt997 = 0;
					anInt887 = 0;
					anInt860 = 0;
					anInt999 = 0;
					anInt881 = 0;
					anInt1022 = 0;
					anInt943 = 0;
					this.method592();
				} else if (local75 == 3) {
					this.aString17 = "";
					this.aString18 = "Invalid username or password.";
				} else if (local75 == 4) {
					this.aString17 = "Your account has been disabled.";
					this.aString18 = "Please check your message-centre for details.";
				} else if (local75 == 5) {
					this.aString17 = "Your account is already logged in.";
					this.aString18 = "Try again in 60 secs...";
				} else if (local75 == 6) {
					this.aString17 = "RuneScape has been updated!";
					this.aString18 = "Please reload this page.";
				} else if (local75 == 7) {
					this.aString17 = "This world is full.";
					this.aString18 = "Please use a different world.";
				} else if (local75 == 8) {
					this.aString17 = "Unable to connect.";
					this.aString18 = "Login server offline.";
				} else if (local75 == 9) {
					this.aString17 = "Login limit exceeded.";
					this.aString18 = "Too many connections from your address.";
				} else if (local75 == 10) {
					this.aString17 = "Unable to connect.";
					this.aString18 = "Bad session id.";
				} else if (local75 == 12) {
					this.aString17 = "You need a members account to login to this world.";
					this.aString18 = "Please subscribe, or use a different world.";
				} else if (local75 == 13) {
					this.aString17 = "Could not complete login.";
					this.aString18 = "Please try using a different world.";
				} else if (local75 == 14) {
					this.aString17 = "The server is being updated.";
					this.aString18 = "Please wait 1 minute and try again.";
				} else if (local75 == 15) {
					this.aBoolean248 = true;
					this.aClass2_Sub1_Sub2_6.anInt81 = 0;
					this.aClass2_Sub1_Sub2_9.anInt81 = 0;
					this.anInt973 = -1;
					this.anInt1042 = -1;
					this.anInt1043 = -1;
					this.anInt1044 = -1;
					this.anInt972 = 0;
					this.anInt974 = 0;
					this.anInt1068 = 0;
					this.anInt1004 = 0;
					this.aBoolean262 = false;
					this.aLong33 = System.currentTimeMillis();
				} else if (local75 == 16) {
					this.aString17 = "Login attempts exceeded.";
					this.aString18 = "Please wait 1 minute and try again.";
				} else if (local75 == 17) {
					this.aString17 = "You are standing in a members-only area.";
					this.aString18 = "To play on this world move to a free area first";
				} else if (local75 == 20) {
					this.aString17 = "Invalid loginserver requested";
					this.aString18 = "Please try using a different world.";
				} else if (local75 == 21) {
					local394 = this.aClass28_1.method318();
					for (@Pc(912) int local912 = local394 + 3; local912 >= 0; local912--) {
						this.aString17 = "You have only just left another world";
						this.aString18 = "Your profile will be transferred in: " + local912;
						this.method712(true);
						try {
							Thread.sleep(1200L);
						} catch (@Pc(934) Exception local934) {
						}
					}
					this.method725(arg0, arg1, arg2);
				} else if (local75 == 22) {
					this.aString17 = "Malformed login packet.";
					this.aString18 = "Please try again.";
				} else if (local75 == 23) {
					this.aString17 = "No reply from loginserver.";
					this.aString18 = "Please try again.";
				} else if (local75 == 24) {
					this.aString17 = "Error loading your profile.";
					this.aString18 = "Please contact customer support.";
				} else if (local75 == 25) {
					this.aString17 = "Unexpected loginserver response.";
					this.aString18 = "Please try using a different world.";
				} else if (local75 == 26) {
					this.aString17 = "This computers address has been blocked";
					this.aString18 = "as it was used to break our rules";
				} else if (local75 != -1) {
					System.out.println("response:" + local75);
					this.aString17 = "Unexpected server response";
					this.aString18 = "Please try using a different world.";
				} else if (local77 != 0) {
					this.aString17 = "No response from server";
					this.aString18 = "Please try using a different world.";
				} else if (this.anInt879 < 2) {
					try {
						Thread.sleep(2000L);
					} catch (@Pc(1006) Exception local1006) {
					}
					this.anInt879++;
					this.method725(arg0, arg1, arg2);
				} else {
					this.aString17 = "No response from loginserver";
					this.aString18 = "Please wait 1 minute and try again.";
				}
			}
		} catch (@Pc(1049) IOException local1049) {
			this.aString17 = "";
			this.aString18 = "Error connecting to server.";
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Z[BI)V")
	private void method726(@OriginalArg(0) boolean arg0, @OriginalArg(1) byte[] arg1) {
		try {
			if (this.aBoolean242) {
				signlink.anInt1081 = arg0 ? 1 : 0;
				signlink.midisave(arg1, arg1.length);
			}
		} catch (@Pc(19) RuntimeException local19) {
			signlink.reporterror("87146, " + arg0 + ", " + arg1 + ", " + 0 + ", " + local19.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIIIIIIII)V")
	private void method727(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(9) int arg8) {
		try {
			this.anInt972 += 0;
			@Pc(7) Class2_Sub3 local7 = null;
			for (@Pc(12) Class2_Sub3 local12 = (Class2_Sub3) this.aClass13_11.method200(); local12 != null; local12 = (Class2_Sub3) this.aClass13_11.method202()) {
				if (local12.anInt762 == arg3 && local12.anInt764 == arg7 && local12.anInt765 == arg4 && local12.anInt763 == arg1) {
					local7 = local12;
					break;
				}
			}
			if (local7 == null) {
				local7 = new Class2_Sub3();
				local7.anInt762 = arg3;
				local7.anInt763 = arg1;
				local7.anInt764 = arg7;
				local7.anInt765 = arg4;
				this.method665(local7);
				this.aClass13_11.method197(local7);
			}
			local7.anInt759 = arg2;
			local7.anInt761 = arg8;
			local7.anInt760 = arg0;
			local7.anInt755 = arg5;
			local7.anInt766 = arg6;
		} catch (@Pc(84) RuntimeException local84) {
			signlink.reporterror("29961, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + 0 + ", " + arg8 + ", " + local84.toString());
			throw new RuntimeException();
		}
	}
}
