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

	@OriginalMember(owner = "client!client", name = "tb", descriptor = "Z")
	private static boolean aBoolean245;

	@OriginalMember(owner = "client!client", name = "Yb", descriptor = "I")
	private static int anInt878;

	@OriginalMember(owner = "client!client", name = "gc", descriptor = "Z")
	private static boolean aBoolean249;

	@OriginalMember(owner = "client!client", name = "uc", descriptor = "I")
	private static int anInt889;

	@OriginalMember(owner = "client!client", name = "wc", descriptor = "I")
	private static int anInt890;

	@OriginalMember(owner = "client!client", name = "Gc", descriptor = "I")
	public static int anInt893;

	@OriginalMember(owner = "client!client", name = "Ic", descriptor = "Z")
	private static boolean aBoolean252;

	@OriginalMember(owner = "client!client", name = "Xc", descriptor = "I")
	private static int anInt899;

	@OriginalMember(owner = "client!client", name = "zd", descriptor = "I")
	private static int anInt910;

	@OriginalMember(owner = "client!client", name = "Ae", descriptor = "I")
	private static int anInt941;

	@OriginalMember(owner = "client!client", name = "Ee", descriptor = "Z")
	private static boolean aBoolean263;

	@OriginalMember(owner = "client!client", name = "mf", descriptor = "I")
	private static int anInt971;

	@OriginalMember(owner = "client!client", name = "nf", descriptor = "I")
	private static int anInt972;

	@OriginalMember(owner = "client!client", name = "If", descriptor = "I")
	private static int anInt985;

	@OriginalMember(owner = "client!client", name = "zg", descriptor = "I")
	private static int anInt1007;

	@OriginalMember(owner = "client!client", name = "Kg", descriptor = "I")
	private static int anInt1011;

	@OriginalMember(owner = "client!client", name = "lh", descriptor = "Lclient!XVMRCEYW;")
	public static Class6_Sub2_Sub1_Sub1_Sub2 aClass6_Sub2_Sub1_Sub1_Sub2_1;

	@OriginalMember(owner = "client!client", name = "Ah", descriptor = "I")
	private static int anInt1020;

	@OriginalMember(owner = "client!client", name = "Ph", descriptor = "I")
	private static int anInt1026;

	@OriginalMember(owner = "client!client", name = "vi", descriptor = "I")
	private static int anInt1045;

	@OriginalMember(owner = "client!client", name = "yi", descriptor = "I")
	private static int anInt1047;

	@OriginalMember(owner = "client!client", name = "Hi", descriptor = "Z")
	private static boolean aBoolean271;

	@OriginalMember(owner = "client!client", name = "yj", descriptor = "Z")
	private static boolean aBoolean277;

	@OriginalMember(owner = "client!client", name = "Lj", descriptor = "I")
	private static int anInt1069;

	@OriginalMember(owner = "client!client", name = "dk", descriptor = "I")
	public static int anInt1077;

	@OriginalMember(owner = "client!client", name = "lc", descriptor = "[[I")
	public static final int[][] anIntArrayArray22 = new int[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, 33697, 22433, 2983, 54193 }, { 8741, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003, 25239 }, { 25238, 8742, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };

	@OriginalMember(owner = "client!client", name = "Fc", descriptor = "I")
	private static int anInt892 = 10;

	@OriginalMember(owner = "client!client", name = "Hc", descriptor = "Z")
	private static boolean aBoolean251 = true;

	@OriginalMember(owner = "client!client", name = "ed", descriptor = "Z")
	private static boolean aBoolean254 = true;

	@OriginalMember(owner = "client!client", name = "gd", descriptor = "Ljava/lang/String;")
	private static String aString21 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";

	@OriginalMember(owner = "client!client", name = "ve", descriptor = "I")
	private static int anInt938 = 14733;

	@OriginalMember(owner = "client!client", name = "Xe", descriptor = "Ljava/math/BigInteger;")
	private static BigInteger aBigInteger1 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");

	@OriginalMember(owner = "client!client", name = "Jf", descriptor = "I")
	private static int anInt986 = 43335;

	@OriginalMember(owner = "client!client", name = "Yh", descriptor = "[I")
	public static final int[] anIntArray259 = new int[] { 9104, 10275, 7595, 3610, 7975, 8526, 918, 38802, 24466, 10145, 58654, 5027, 1457, 16565, 34991, 25486 };

	@OriginalMember(owner = "client!client", name = "ii", descriptor = "Ljava/math/BigInteger;")
	private static BigInteger aBigInteger2 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");

	@OriginalMember(owner = "client!client", name = "Oi", descriptor = "[I")
	private static int[] anIntArray262 = new int[99];

	@OriginalMember(owner = "client!client", name = "Gj", descriptor = "[I")
	public static int[] anIntArray271;

	@OriginalMember(owner = "client!client", name = "L", descriptor = "I")
	private int anInt844;

	@OriginalMember(owner = "client!client", name = "Q", descriptor = "I")
	private int anInt846;

	@OriginalMember(owner = "client!client", name = "S", descriptor = "I")
	private int anInt847;

	@OriginalMember(owner = "client!client", name = "T", descriptor = "Ljava/lang/String;")
	private String aString17;

	@OriginalMember(owner = "client!client", name = "V", descriptor = "I")
	private int anInt849;

	@OriginalMember(owner = "client!client", name = "X", descriptor = "I")
	private int anInt850;

	@OriginalMember(owner = "client!client", name = "ab", descriptor = "I")
	private int anInt851;

	@OriginalMember(owner = "client!client", name = "fb", descriptor = "I")
	private int anInt852;

	@OriginalMember(owner = "client!client", name = "gb", descriptor = "I")
	private int anInt853;

	@OriginalMember(owner = "client!client", name = "hb", descriptor = "I")
	private int anInt854;

	@OriginalMember(owner = "client!client", name = "jb", descriptor = "I")
	private int anInt855;

	@OriginalMember(owner = "client!client", name = "kb", descriptor = "I")
	private int anInt856;

	@OriginalMember(owner = "client!client", name = "lb", descriptor = "I")
	private int anInt857;

	@OriginalMember(owner = "client!client", name = "rb", descriptor = "I")
	private int anInt858;

	@OriginalMember(owner = "client!client", name = "vb", descriptor = "I")
	private int anInt860;

	@OriginalMember(owner = "client!client", name = "yb", descriptor = "I")
	private int anInt862;

	@OriginalMember(owner = "client!client", name = "Cb", descriptor = "I")
	private int anInt865;

	@OriginalMember(owner = "client!client", name = "Gb", descriptor = "I")
	private int anInt866;

	@OriginalMember(owner = "client!client", name = "Hb", descriptor = "I")
	private int anInt867;

	@OriginalMember(owner = "client!client", name = "Ib", descriptor = "I")
	private int anInt868;

	@OriginalMember(owner = "client!client", name = "Jb", descriptor = "I")
	private int anInt869;

	@OriginalMember(owner = "client!client", name = "Kb", descriptor = "I")
	private int anInt870;

	@OriginalMember(owner = "client!client", name = "Lb", descriptor = "Lclient!FKNRMZJV;")
	private Class6_Sub2_Sub2_Sub1 aClass6_Sub2_Sub2_Sub1_3;

	@OriginalMember(owner = "client!client", name = "Mb", descriptor = "Lclient!FKNRMZJV;")
	private Class6_Sub2_Sub2_Sub1 aClass6_Sub2_Sub2_Sub1_4;

	@OriginalMember(owner = "client!client", name = "Nb", descriptor = "I")
	private int anInt871;

	@OriginalMember(owner = "client!client", name = "Ob", descriptor = "I")
	private int anInt872;

	@OriginalMember(owner = "client!client", name = "Pb", descriptor = "I")
	private int anInt873;

	@OriginalMember(owner = "client!client", name = "Qb", descriptor = "I")
	private int anInt874;

	@OriginalMember(owner = "client!client", name = "Rb", descriptor = "I")
	private int anInt875;

	@OriginalMember(owner = "client!client", name = "Sb", descriptor = "I")
	private int anInt876;

	@OriginalMember(owner = "client!client", name = "Tb", descriptor = "Lclient!ERQSZFRT;")
	private Class8 aClass8_3;

	@OriginalMember(owner = "client!client", name = "Ub", descriptor = "Lclient!ERQSZFRT;")
	private Class8 aClass8_4;

	@OriginalMember(owner = "client!client", name = "Vb", descriptor = "Lclient!ERQSZFRT;")
	private Class8 aClass8_5;

	@OriginalMember(owner = "client!client", name = "Zb", descriptor = "I")
	private int anInt879;

	@OriginalMember(owner = "client!client", name = "ac", descriptor = "I")
	private int anInt880;

	@OriginalMember(owner = "client!client", name = "bc", descriptor = "I")
	private int anInt881;

	@OriginalMember(owner = "client!client", name = "cc", descriptor = "I")
	private int anInt882;

	@OriginalMember(owner = "client!client", name = "dc", descriptor = "I")
	private int anInt883;

	@OriginalMember(owner = "client!client", name = "hc", descriptor = "Ljava/net/Socket;")
	private Socket aSocket3;

	@OriginalMember(owner = "client!client", name = "ic", descriptor = "I")
	private int anInt884;

	@OriginalMember(owner = "client!client", name = "mc", descriptor = "Lclient!FKNRMZJV;")
	private Class6_Sub2_Sub2_Sub1 aClass6_Sub2_Sub2_Sub1_5;

	@OriginalMember(owner = "client!client", name = "qc", descriptor = "I")
	private int anInt886;

	@OriginalMember(owner = "client!client", name = "sc", descriptor = "I")
	private int anInt887;

	@OriginalMember(owner = "client!client", name = "zc", descriptor = "Lclient!UZETOFZZ;")
	private Class6_Sub2_Sub2_Sub3 aClass6_Sub2_Sub2_Sub3_1;

	@OriginalMember(owner = "client!client", name = "Ac", descriptor = "Lclient!UZETOFZZ;")
	private Class6_Sub2_Sub2_Sub3 aClass6_Sub2_Sub2_Sub3_2;

	@OriginalMember(owner = "client!client", name = "Bc", descriptor = "Lclient!UZETOFZZ;")
	private Class6_Sub2_Sub2_Sub3 aClass6_Sub2_Sub2_Sub3_3;

	@OriginalMember(owner = "client!client", name = "Cc", descriptor = "Lclient!UZETOFZZ;")
	private Class6_Sub2_Sub2_Sub3 aClass6_Sub2_Sub2_Sub3_4;

	@OriginalMember(owner = "client!client", name = "Dc", descriptor = "Lclient!UZETOFZZ;")
	private Class6_Sub2_Sub2_Sub3 aClass6_Sub2_Sub2_Sub3_5;

	@OriginalMember(owner = "client!client", name = "Jc", descriptor = "I")
	private int anInt894;

	@OriginalMember(owner = "client!client", name = "Kc", descriptor = "I")
	private int anInt895;

	@OriginalMember(owner = "client!client", name = "Lc", descriptor = "I")
	private int anInt896;

	@OriginalMember(owner = "client!client", name = "Mc", descriptor = "I")
	private int anInt897;

	@OriginalMember(owner = "client!client", name = "Nc", descriptor = "Ljava/lang/String;")
	private String aString20;

	@OriginalMember(owner = "client!client", name = "Oc", descriptor = "[I")
	private int[] anIntArray223;

	@OriginalMember(owner = "client!client", name = "Pc", descriptor = "[I")
	private int[] anIntArray224;

	@OriginalMember(owner = "client!client", name = "Qc", descriptor = "[I")
	private int[] anIntArray225;

	@OriginalMember(owner = "client!client", name = "Rc", descriptor = "[I")
	private int[] anIntArray226;

	@OriginalMember(owner = "client!client", name = "Vc", descriptor = "Lclient!UJWODGQS;")
	private Class41 aClass41_1;

	@OriginalMember(owner = "client!client", name = "ad", descriptor = "[I")
	private int[] anIntArray229;

	@OriginalMember(owner = "client!client", name = "bd", descriptor = "[I")
	private int[] anIntArray230;

	@OriginalMember(owner = "client!client", name = "id", descriptor = "Lclient!FKNRMZJV;")
	private Class6_Sub2_Sub2_Sub1 aClass6_Sub2_Sub2_Sub1_6;

	@OriginalMember(owner = "client!client", name = "jd", descriptor = "Lclient!FKNRMZJV;")
	private Class6_Sub2_Sub2_Sub1 aClass6_Sub2_Sub2_Sub1_7;

	@OriginalMember(owner = "client!client", name = "kd", descriptor = "I")
	private int anInt903;

	@OriginalMember(owner = "client!client", name = "nd", descriptor = "Lclient!UZETOFZZ;")
	private Class6_Sub2_Sub2_Sub3 aClass6_Sub2_Sub2_Sub3_6;

	@OriginalMember(owner = "client!client", name = "od", descriptor = "Lclient!UZETOFZZ;")
	private Class6_Sub2_Sub2_Sub3 aClass6_Sub2_Sub2_Sub3_7;

	@OriginalMember(owner = "client!client", name = "pd", descriptor = "Lclient!UZETOFZZ;")
	private Class6_Sub2_Sub2_Sub3 aClass6_Sub2_Sub2_Sub3_8;

	@OriginalMember(owner = "client!client", name = "qd", descriptor = "Lclient!UZETOFZZ;")
	private Class6_Sub2_Sub2_Sub3 aClass6_Sub2_Sub2_Sub3_9;

	@OriginalMember(owner = "client!client", name = "rd", descriptor = "Lclient!UZETOFZZ;")
	private Class6_Sub2_Sub2_Sub3 aClass6_Sub2_Sub2_Sub3_10;

	@OriginalMember(owner = "client!client", name = "td", descriptor = "I")
	private int anInt905;

	@OriginalMember(owner = "client!client", name = "ud", descriptor = "I")
	private int anInt906;

	@OriginalMember(owner = "client!client", name = "vd", descriptor = "I")
	private int anInt907;

	@OriginalMember(owner = "client!client", name = "xd", descriptor = "I")
	private int anInt908;

	@OriginalMember(owner = "client!client", name = "Ad", descriptor = "I")
	private int anInt911;

	@OriginalMember(owner = "client!client", name = "Bd", descriptor = "I")
	private int anInt912;

	@OriginalMember(owner = "client!client", name = "Cd", descriptor = "I")
	private int anInt913;

	@OriginalMember(owner = "client!client", name = "Dd", descriptor = "I")
	private int anInt914;

	@OriginalMember(owner = "client!client", name = "Ed", descriptor = "I")
	private int anInt915;

	@OriginalMember(owner = "client!client", name = "Fd", descriptor = "I")
	private int anInt916;

	@OriginalMember(owner = "client!client", name = "Hd", descriptor = "[Lclient!UZETOFZZ;")
	private Class6_Sub2_Sub2_Sub3[] aClass6_Sub2_Sub2_Sub3Array2;

	@OriginalMember(owner = "client!client", name = "Id", descriptor = "I")
	private int anInt917;

	@OriginalMember(owner = "client!client", name = "Jd", descriptor = "I")
	private int anInt918;

	@OriginalMember(owner = "client!client", name = "Ld", descriptor = "I")
	private int anInt919;

	@OriginalMember(owner = "client!client", name = "Nd", descriptor = "I")
	private int anInt920;

	@OriginalMember(owner = "client!client", name = "Od", descriptor = "I")
	private int anInt921;

	@OriginalMember(owner = "client!client", name = "Rd", descriptor = "I")
	private int anInt923;

	@OriginalMember(owner = "client!client", name = "Vd", descriptor = "Ljava/lang/String;")
	private String aString23;

	@OriginalMember(owner = "client!client", name = "Wd", descriptor = "J")
	private long aLong29;

	@OriginalMember(owner = "client!client", name = "Xd", descriptor = "I")
	private int anInt925;

	@OriginalMember(owner = "client!client", name = "Yd", descriptor = "I")
	private int anInt926;

	@OriginalMember(owner = "client!client", name = "Zd", descriptor = "I")
	private int anInt927;

	@OriginalMember(owner = "client!client", name = "ae", descriptor = "I")
	private int anInt928;

	@OriginalMember(owner = "client!client", name = "be", descriptor = "I")
	private int anInt929;

	@OriginalMember(owner = "client!client", name = "ee", descriptor = "I")
	private int anInt931;

	@OriginalMember(owner = "client!client", name = "ge", descriptor = "I")
	private int anInt933;

	@OriginalMember(owner = "client!client", name = "he", descriptor = "I")
	private int anInt934;

	@OriginalMember(owner = "client!client", name = "ie", descriptor = "I")
	private int anInt935;

	@OriginalMember(owner = "client!client", name = "je", descriptor = "Lclient!RQLSQIAP;")
	private Class36 aClass36_1;

	@OriginalMember(owner = "client!client", name = "le", descriptor = "Lclient!ERQSZFRT;")
	private Class8 aClass8_6;

	@OriginalMember(owner = "client!client", name = "me", descriptor = "Lclient!ERQSZFRT;")
	private Class8 aClass8_7;

	@OriginalMember(owner = "client!client", name = "ne", descriptor = "Lclient!ERQSZFRT;")
	private Class8 aClass8_8;

	@OriginalMember(owner = "client!client", name = "oe", descriptor = "Lclient!ERQSZFRT;")
	private Class8 aClass8_9;

	@OriginalMember(owner = "client!client", name = "pe", descriptor = "I")
	private int anInt936;

	@OriginalMember(owner = "client!client", name = "te", descriptor = "I")
	private int anInt937;

	@OriginalMember(owner = "client!client", name = "ye", descriptor = "I")
	private int anInt939;

	@OriginalMember(owner = "client!client", name = "De", descriptor = "Lclient!RSPRYUFS;")
	private Class37 aClass37_2;

	@OriginalMember(owner = "client!client", name = "Fe", descriptor = "J")
	private long aLong30;

	@OriginalMember(owner = "client!client", name = "He", descriptor = "I")
	private int anInt944;

	@OriginalMember(owner = "client!client", name = "Ie", descriptor = "I")
	private int anInt945;

	@OriginalMember(owner = "client!client", name = "Je", descriptor = "I")
	private int anInt946;

	@OriginalMember(owner = "client!client", name = "Ke", descriptor = "I")
	private int anInt947;

	@OriginalMember(owner = "client!client", name = "Le", descriptor = "I")
	private int anInt948;

	@OriginalMember(owner = "client!client", name = "Me", descriptor = "J")
	private long aLong31;

	@OriginalMember(owner = "client!client", name = "Ne", descriptor = "I")
	private int anInt949;

	@OriginalMember(owner = "client!client", name = "Oe", descriptor = "I")
	private int anInt950;

	@OriginalMember(owner = "client!client", name = "Pe", descriptor = "I")
	private int anInt951;

	@OriginalMember(owner = "client!client", name = "Se", descriptor = "I")
	private int anInt953;

	@OriginalMember(owner = "client!client", name = "Te", descriptor = "I")
	private int anInt954;

	@OriginalMember(owner = "client!client", name = "Ue", descriptor = "I")
	private int anInt955;

	@OriginalMember(owner = "client!client", name = "Ve", descriptor = "I")
	private int anInt956;

	@OriginalMember(owner = "client!client", name = "We", descriptor = "I")
	private int anInt957;

	@OriginalMember(owner = "client!client", name = "Ye", descriptor = "I")
	private int anInt958;

	@OriginalMember(owner = "client!client", name = "Ze", descriptor = "I")
	private int anInt959;

	@OriginalMember(owner = "client!client", name = "af", descriptor = "I")
	private int anInt960;

	@OriginalMember(owner = "client!client", name = "df", descriptor = "I")
	private int anInt963;

	@OriginalMember(owner = "client!client", name = "ef", descriptor = "I")
	private int anInt964;

	@OriginalMember(owner = "client!client", name = "ff", descriptor = "I")
	private int anInt965;

	@OriginalMember(owner = "client!client", name = "hf", descriptor = "I")
	private int anInt967;

	@OriginalMember(owner = "client!client", name = "jf", descriptor = "I")
	private int anInt968;

	@OriginalMember(owner = "client!client", name = "kf", descriptor = "I")
	private int anInt969;

	@OriginalMember(owner = "client!client", name = "lf", descriptor = "I")
	private int anInt970;

	@OriginalMember(owner = "client!client", name = "pf", descriptor = "I")
	private int anInt973;

	@OriginalMember(owner = "client!client", name = "qf", descriptor = "I")
	private int anInt974;

	@OriginalMember(owner = "client!client", name = "rf", descriptor = "I")
	private int anInt975;

	@OriginalMember(owner = "client!client", name = "sf", descriptor = "I")
	private int anInt976;

	@OriginalMember(owner = "client!client", name = "tf", descriptor = "I")
	private int anInt977;

	@OriginalMember(owner = "client!client", name = "uf", descriptor = "I")
	private int anInt978;

	@OriginalMember(owner = "client!client", name = "xf", descriptor = "I")
	private int anInt981;

	@OriginalMember(owner = "client!client", name = "Af", descriptor = "Lclient!UZETOFZZ;")
	private Class6_Sub2_Sub2_Sub3 aClass6_Sub2_Sub2_Sub3_11;

	@OriginalMember(owner = "client!client", name = "Bf", descriptor = "Lclient!UZETOFZZ;")
	private Class6_Sub2_Sub2_Sub3 aClass6_Sub2_Sub2_Sub3_12;

	@OriginalMember(owner = "client!client", name = "Cf", descriptor = "I")
	private int anInt982;

	@OriginalMember(owner = "client!client", name = "Ef", descriptor = "I")
	private int anInt984;

	@OriginalMember(owner = "client!client", name = "Ff", descriptor = "[I")
	private int[] anIntArray237;

	@OriginalMember(owner = "client!client", name = "Gf", descriptor = "[I")
	private int[] anIntArray238;

	@OriginalMember(owner = "client!client", name = "Hf", descriptor = "[I")
	private int[] anIntArray239;

	@OriginalMember(owner = "client!client", name = "Lf", descriptor = "I")
	private int anInt987;

	@OriginalMember(owner = "client!client", name = "Nf", descriptor = "I")
	private int anInt988;

	@OriginalMember(owner = "client!client", name = "Of", descriptor = "I")
	private int anInt989;

	@OriginalMember(owner = "client!client", name = "Pf", descriptor = "I")
	private int anInt990;

	@OriginalMember(owner = "client!client", name = "Sf", descriptor = "I")
	private int anInt993;

	@OriginalMember(owner = "client!client", name = "Xf", descriptor = "I")
	private int anInt995;

	@OriginalMember(owner = "client!client", name = "hg", descriptor = "I")
	private int anInt997;

	@OriginalMember(owner = "client!client", name = "lg", descriptor = "I")
	private int anInt999;

	@OriginalMember(owner = "client!client", name = "ng", descriptor = "I")
	private int anInt1000;

	@OriginalMember(owner = "client!client", name = "pg", descriptor = "Lclient!FKNRMZJV;")
	private Class6_Sub2_Sub2_Sub1 aClass6_Sub2_Sub2_Sub1_8;

	@OriginalMember(owner = "client!client", name = "qg", descriptor = "[[B")
	private byte[][] aByteArrayArray5;

	@OriginalMember(owner = "client!client", name = "tg", descriptor = "I")
	private int anInt1002;

	@OriginalMember(owner = "client!client", name = "ug", descriptor = "I")
	private int anInt1003;

	@OriginalMember(owner = "client!client", name = "vg", descriptor = "I")
	private int anInt1004;

	@OriginalMember(owner = "client!client", name = "wg", descriptor = "I")
	private int anInt1005;

	@OriginalMember(owner = "client!client", name = "xg", descriptor = "I")
	private int anInt1006;

	@OriginalMember(owner = "client!client", name = "Eg", descriptor = "I")
	private int anInt1008;

	@OriginalMember(owner = "client!client", name = "Lg", descriptor = "Lclient!ERQSZFRT;")
	private Class8 aClass8_10;

	@OriginalMember(owner = "client!client", name = "Mg", descriptor = "Lclient!ERQSZFRT;")
	private Class8 aClass8_11;

	@OriginalMember(owner = "client!client", name = "Ng", descriptor = "Lclient!ERQSZFRT;")
	private Class8 aClass8_12;

	@OriginalMember(owner = "client!client", name = "Og", descriptor = "Lclient!ERQSZFRT;")
	private Class8 aClass8_13;

	@OriginalMember(owner = "client!client", name = "Pg", descriptor = "Lclient!ERQSZFRT;")
	private Class8 aClass8_14;

	@OriginalMember(owner = "client!client", name = "Qg", descriptor = "Lclient!ERQSZFRT;")
	private Class8 aClass8_15;

	@OriginalMember(owner = "client!client", name = "Rg", descriptor = "Lclient!ERQSZFRT;")
	private Class8 aClass8_16;

	@OriginalMember(owner = "client!client", name = "Sg", descriptor = "Lclient!ERQSZFRT;")
	private Class8 aClass8_17;

	@OriginalMember(owner = "client!client", name = "Tg", descriptor = "Lclient!ERQSZFRT;")
	private Class8 aClass8_18;

	@OriginalMember(owner = "client!client", name = "Ug", descriptor = "Lclient!TJCUOFPI;")
	private Class6_Sub2_Sub2_Sub2 aClass6_Sub2_Sub2_Sub2_2;

	@OriginalMember(owner = "client!client", name = "Vg", descriptor = "Lclient!TJCUOFPI;")
	private Class6_Sub2_Sub2_Sub2 aClass6_Sub2_Sub2_Sub2_3;

	@OriginalMember(owner = "client!client", name = "Wg", descriptor = "Lclient!TJCUOFPI;")
	private Class6_Sub2_Sub2_Sub2 aClass6_Sub2_Sub2_Sub2_4;

	@OriginalMember(owner = "client!client", name = "Xg", descriptor = "Lclient!TJCUOFPI;")
	private Class6_Sub2_Sub2_Sub2 aClass6_Sub2_Sub2_Sub2_5;

	@OriginalMember(owner = "client!client", name = "Zg", descriptor = "Lclient!ERQSZFRT;")
	private Class8 aClass8_19;

	@OriginalMember(owner = "client!client", name = "ah", descriptor = "Lclient!ERQSZFRT;")
	private Class8 aClass8_20;

	@OriginalMember(owner = "client!client", name = "bh", descriptor = "Lclient!ERQSZFRT;")
	private Class8 aClass8_21;

	@OriginalMember(owner = "client!client", name = "ch", descriptor = "Lclient!ERQSZFRT;")
	private Class8 aClass8_22;

	@OriginalMember(owner = "client!client", name = "dh", descriptor = "Lclient!ERQSZFRT;")
	private Class8 aClass8_23;

	@OriginalMember(owner = "client!client", name = "eh", descriptor = "Lclient!ERQSZFRT;")
	private Class8 aClass8_24;

	@OriginalMember(owner = "client!client", name = "fh", descriptor = "Lclient!ERQSZFRT;")
	private Class8 aClass8_25;

	@OriginalMember(owner = "client!client", name = "gh", descriptor = "Lclient!ERQSZFRT;")
	private Class8 aClass8_26;

	@OriginalMember(owner = "client!client", name = "hh", descriptor = "Lclient!ERQSZFRT;")
	private Class8 aClass8_27;

	@OriginalMember(owner = "client!client", name = "ih", descriptor = "I")
	private int anInt1012;

	@OriginalMember(owner = "client!client", name = "kh", descriptor = "Lclient!FKNRMZJV;")
	private Class6_Sub2_Sub2_Sub1 aClass6_Sub2_Sub2_Sub1_9;

	@OriginalMember(owner = "client!client", name = "mh", descriptor = "I")
	private int anInt1013;

	@OriginalMember(owner = "client!client", name = "oh", descriptor = "I")
	private int anInt1014;

	@OriginalMember(owner = "client!client", name = "ph", descriptor = "I")
	private int anInt1015;

	@OriginalMember(owner = "client!client", name = "qh", descriptor = "Lclient!FKNRMZJV;")
	private Class6_Sub2_Sub2_Sub1 aClass6_Sub2_Sub2_Sub1_10;

	@OriginalMember(owner = "client!client", name = "rh", descriptor = "I")
	private int anInt1016;

	@OriginalMember(owner = "client!client", name = "th", descriptor = "J")
	private long aLong32;

	@OriginalMember(owner = "client!client", name = "wh", descriptor = "I")
	private int anInt1018;

	@OriginalMember(owner = "client!client", name = "xh", descriptor = "Lclient!UZETOFZZ;")
	private Class6_Sub2_Sub2_Sub3 aClass6_Sub2_Sub2_Sub3_13;

	@OriginalMember(owner = "client!client", name = "yh", descriptor = "Lclient!UZETOFZZ;")
	private Class6_Sub2_Sub2_Sub3 aClass6_Sub2_Sub2_Sub3_14;

	@OriginalMember(owner = "client!client", name = "zh", descriptor = "I")
	private int anInt1019;

	@OriginalMember(owner = "client!client", name = "Ch", descriptor = "Lclient!UZETOFZZ;")
	private Class6_Sub2_Sub2_Sub3 aClass6_Sub2_Sub2_Sub3_15;

	@OriginalMember(owner = "client!client", name = "Dh", descriptor = "Lclient!UZETOFZZ;")
	private Class6_Sub2_Sub2_Sub3 aClass6_Sub2_Sub2_Sub3_16;

	@OriginalMember(owner = "client!client", name = "Eh", descriptor = "Lclient!UZETOFZZ;")
	private Class6_Sub2_Sub2_Sub3 aClass6_Sub2_Sub2_Sub3_17;

	@OriginalMember(owner = "client!client", name = "Fh", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray8;

	@OriginalMember(owner = "client!client", name = "Gh", descriptor = "Lclient!NJYVZTLI;")
	private Class25_Sub1 aClass25_Sub1_1;

	@OriginalMember(owner = "client!client", name = "Kh", descriptor = "I")
	private int anInt1024;

	@OriginalMember(owner = "client!client", name = "Mh", descriptor = "I")
	private int anInt1025;

	@OriginalMember(owner = "client!client", name = "Qh", descriptor = "I")
	private int anInt1027;

	@OriginalMember(owner = "client!client", name = "Rh", descriptor = "I")
	private int anInt1028;

	@OriginalMember(owner = "client!client", name = "Th", descriptor = "I")
	private int anInt1029;

	@OriginalMember(owner = "client!client", name = "Uh", descriptor = "I")
	private int anInt1030;

	@OriginalMember(owner = "client!client", name = "Wh", descriptor = "I")
	private int anInt1032;

	@OriginalMember(owner = "client!client", name = "Xh", descriptor = "I")
	private int anInt1033;

	@OriginalMember(owner = "client!client", name = "Zh", descriptor = "I")
	private int anInt1034;

	@OriginalMember(owner = "client!client", name = "bi", descriptor = "I")
	private int anInt1036;

	@OriginalMember(owner = "client!client", name = "di", descriptor = "I")
	private int anInt1037;

	@OriginalMember(owner = "client!client", name = "ei", descriptor = "I")
	private int anInt1038;

	@OriginalMember(owner = "client!client", name = "fi", descriptor = "I")
	private int anInt1039;

	@OriginalMember(owner = "client!client", name = "gi", descriptor = "I")
	private int anInt1040;

	@OriginalMember(owner = "client!client", name = "hi", descriptor = "Ljava/lang/String;")
	private String aString27;

	@OriginalMember(owner = "client!client", name = "ji", descriptor = "Lclient!QIACHOJO;")
	private Class34 aClass34_1;

	@OriginalMember(owner = "client!client", name = "mi", descriptor = "I")
	private int anInt1041;

	@OriginalMember(owner = "client!client", name = "pi", descriptor = "I")
	private int anInt1042;

	@OriginalMember(owner = "client!client", name = "zi", descriptor = "I")
	private int anInt1048;

	@OriginalMember(owner = "client!client", name = "Ai", descriptor = "Lclient!KAZZDHJI;")
	private Class18 aClass18_2;

	@OriginalMember(owner = "client!client", name = "Gi", descriptor = "J")
	private long aLong33;

	@OriginalMember(owner = "client!client", name = "Ji", descriptor = "I")
	private int anInt1051;

	@OriginalMember(owner = "client!client", name = "Ki", descriptor = "Lclient!UZETOFZZ;")
	private Class6_Sub2_Sub2_Sub3 aClass6_Sub2_Sub2_Sub3_18;

	@OriginalMember(owner = "client!client", name = "Li", descriptor = "Lclient!UZETOFZZ;")
	private Class6_Sub2_Sub2_Sub3 aClass6_Sub2_Sub2_Sub3_19;

	@OriginalMember(owner = "client!client", name = "Mi", descriptor = "Lclient!UZETOFZZ;")
	private Class6_Sub2_Sub2_Sub3 aClass6_Sub2_Sub2_Sub3_20;

	@OriginalMember(owner = "client!client", name = "Ni", descriptor = "I")
	private int anInt1052;

	@OriginalMember(owner = "client!client", name = "Ri", descriptor = "I")
	private int anInt1054;

	@OriginalMember(owner = "client!client", name = "Ti", descriptor = "I")
	private int anInt1055;

	@OriginalMember(owner = "client!client", name = "Ui", descriptor = "I")
	private int anInt1056;

	@OriginalMember(owner = "client!client", name = "Vi", descriptor = "I")
	private int anInt1057;

	@OriginalMember(owner = "client!client", name = "Wi", descriptor = "I")
	private int anInt1058;

	@OriginalMember(owner = "client!client", name = "Xi", descriptor = "I")
	private int anInt1059;

	@OriginalMember(owner = "client!client", name = "Yi", descriptor = "I")
	private int anInt1060;

	@OriginalMember(owner = "client!client", name = "Zi", descriptor = "I")
	private int anInt1061;

	@OriginalMember(owner = "client!client", name = "aj", descriptor = "[[[B")
	private byte[][][] aByteArrayArrayArray8;

	@OriginalMember(owner = "client!client", name = "cj", descriptor = "[I")
	private int[] anIntArray263;

	@OriginalMember(owner = "client!client", name = "dj", descriptor = "[I")
	private int[] anIntArray264;

	@OriginalMember(owner = "client!client", name = "gj", descriptor = "I")
	private int anInt1062;

	@OriginalMember(owner = "client!client", name = "ij", descriptor = "I")
	private int anInt1063;

	@OriginalMember(owner = "client!client", name = "jj", descriptor = "Lclient!FKNRMZJV;")
	private Class6_Sub2_Sub2_Sub1 aClass6_Sub2_Sub2_Sub1_11;

	@OriginalMember(owner = "client!client", name = "kj", descriptor = "Lclient!FKNRMZJV;")
	private Class6_Sub2_Sub2_Sub1 aClass6_Sub2_Sub2_Sub1_12;

	@OriginalMember(owner = "client!client", name = "lj", descriptor = "Lclient!FKNRMZJV;")
	private Class6_Sub2_Sub2_Sub1 aClass6_Sub2_Sub2_Sub1_13;

	@OriginalMember(owner = "client!client", name = "mj", descriptor = "Lclient!FKNRMZJV;")
	private Class6_Sub2_Sub2_Sub1 aClass6_Sub2_Sub2_Sub1_14;

	@OriginalMember(owner = "client!client", name = "nj", descriptor = "Lclient!FKNRMZJV;")
	private Class6_Sub2_Sub2_Sub1 aClass6_Sub2_Sub2_Sub1_15;

	@OriginalMember(owner = "client!client", name = "qj", descriptor = "I")
	private int anInt1065;

	@OriginalMember(owner = "client!client", name = "tj", descriptor = "[I")
	private int[] anIntArray265;

	@OriginalMember(owner = "client!client", name = "uj", descriptor = "[I")
	private int[] anIntArray266;

	@OriginalMember(owner = "client!client", name = "vj", descriptor = "[I")
	private int[] anIntArray267;

	@OriginalMember(owner = "client!client", name = "wj", descriptor = "[I")
	private int[] anIntArray268;

	@OriginalMember(owner = "client!client", name = "Dj", descriptor = "I")
	private int anInt1067;

	@OriginalMember(owner = "client!client", name = "Hj", descriptor = "I")
	private int anInt1068;

	@OriginalMember(owner = "client!client", name = "Mj", descriptor = "I")
	private int anInt1070;

	@OriginalMember(owner = "client!client", name = "Nj", descriptor = "I")
	private int anInt1071;

	@OriginalMember(owner = "client!client", name = "Oj", descriptor = "I")
	private int anInt1072;

	@OriginalMember(owner = "client!client", name = "Pj", descriptor = "I")
	private int anInt1073;

	@OriginalMember(owner = "client!client", name = "Qj", descriptor = "Lclient!FKNRMZJV;")
	private Class6_Sub2_Sub2_Sub1 aClass6_Sub2_Sub2_Sub1_16;

	@OriginalMember(owner = "client!client", name = "Rj", descriptor = "Lclient!FKNRMZJV;")
	private Class6_Sub2_Sub2_Sub1 aClass6_Sub2_Sub2_Sub1_17;

	@OriginalMember(owner = "client!client", name = "Sj", descriptor = "I")
	private int anInt1074;

	@OriginalMember(owner = "client!client", name = "Tj", descriptor = "I")
	private int anInt1075;

	@OriginalMember(owner = "client!client", name = "Uj", descriptor = "I")
	private int anInt1076;

	@OriginalMember(owner = "client!client", name = "ak", descriptor = "[[B")
	private byte[][] aByteArrayArray6;

	@OriginalMember(owner = "client!client", name = "fk", descriptor = "I")
	private int anInt1079;

	@OriginalMember(owner = "client!client", name = "M", descriptor = "I")
	private int anInt845 = 1;

	@OriginalMember(owner = "client!client", name = "N", descriptor = "[I")
	private int[] anIntArray212 = new int[100];

	@OriginalMember(owner = "client!client", name = "O", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray8 = new String[100];

	@OriginalMember(owner = "client!client", name = "P", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray9 = new String[100];

	@OriginalMember(owner = "client!client", name = "R", descriptor = "B")
	private byte aByte40 = 3;

	@OriginalMember(owner = "client!client", name = "U", descriptor = "I")
	private int anInt848 = 478;

	@OriginalMember(owner = "client!client", name = "W", descriptor = "Ljava/lang/String;")
	private String aString18 = "";

	@OriginalMember(owner = "client!client", name = "Y", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray10 = new String[100];

	@OriginalMember(owner = "client!client", name = "Z", descriptor = "[I")
	private int[] anIntArray213 = new int[100];

	@OriginalMember(owner = "client!client", name = "bb", descriptor = "Z")
	private boolean aBoolean241 = false;

	@OriginalMember(owner = "client!client", name = "cb", descriptor = "[I")
	private int[] anIntArray214 = new int[151];

	@OriginalMember(owner = "client!client", name = "db", descriptor = "[Lclient!FKNRMZJV;")
	private Class6_Sub2_Sub2_Sub1[] aClass6_Sub2_Sub2_Sub1Array4 = new Class6_Sub2_Sub2_Sub1[20];

	@OriginalMember(owner = "client!client", name = "eb", descriptor = "[I")
	private int[] anIntArray215 = new int[33];

	@OriginalMember(owner = "client!client", name = "ib", descriptor = "Z")
	private boolean aBoolean242 = false;

	@OriginalMember(owner = "client!client", name = "mb", descriptor = "Z")
	private boolean aBoolean243 = false;

	@OriginalMember(owner = "client!client", name = "nb", descriptor = "Ljava/util/zip/CRC32;")
	private CRC32 aCRC32_2 = new CRC32();

	@OriginalMember(owner = "client!client", name = "ob", descriptor = "Lclient!FYVRCFGT;")
	private Class13 aClass13_10 = new Class13(true);

	@OriginalMember(owner = "client!client", name = "pb", descriptor = "[I")
	private int[] anIntArray216 = new int[33];

	@OriginalMember(owner = "client!client", name = "qb", descriptor = "Lclient!NQUAUMDT;")
	private Class6_Sub2_Sub3 aClass6_Sub2_Sub3_6 = Class6_Sub2_Sub3.method250();

	@OriginalMember(owner = "client!client", name = "sb", descriptor = "Z")
	private boolean aBoolean244 = true;

	@OriginalMember(owner = "client!client", name = "ub", descriptor = "I")
	private int anInt859 = -17;

	@OriginalMember(owner = "client!client", name = "wb", descriptor = "I")
	private int anInt861 = 3;

	@OriginalMember(owner = "client!client", name = "xb", descriptor = "[I")
	private int[] anIntArray217 = new int[9];

	@OriginalMember(owner = "client!client", name = "zb", descriptor = "I")
	private int anInt863 = 3353893;

	@OriginalMember(owner = "client!client", name = "Ab", descriptor = "I")
	private final int anInt864 = 100;

	@OriginalMember(owner = "client!client", name = "Bb", descriptor = "[I")
	private int[] anIntArray218 = new int[100];

	@OriginalMember(owner = "client!client", name = "Db", descriptor = "Z")
	private boolean aBoolean246 = false;

	@OriginalMember(owner = "client!client", name = "Eb", descriptor = "[I")
	private int[] anIntArray219 = new int[151];

	@OriginalMember(owner = "client!client", name = "Fb", descriptor = "[Lclient!FKNRMZJV;")
	private Class6_Sub2_Sub2_Sub1[] aClass6_Sub2_Sub2_Sub1Array5 = new Class6_Sub2_Sub2_Sub1[32];

	@OriginalMember(owner = "client!client", name = "Wb", descriptor = "Z")
	private boolean aBoolean247 = true;

	@OriginalMember(owner = "client!client", name = "Xb", descriptor = "I")
	private int anInt877 = -1;

	@OriginalMember(owner = "client!client", name = "ec", descriptor = "Z")
	private boolean aBoolean248 = false;

	@OriginalMember(owner = "client!client", name = "fc", descriptor = "[I")
	private int[] anIntArray220 = new int[7];

	@OriginalMember(owner = "client!client", name = "jc", descriptor = "I")
	private int anInt885 = -1;

	@OriginalMember(owner = "client!client", name = "kc", descriptor = "[I")
	private final int[] anIntArray221 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

	@OriginalMember(owner = "client!client", name = "nc", descriptor = "Lclient!VGGOSQRK;")
	private Class44 aClass44_1 = new Class44();

	@OriginalMember(owner = "client!client", name = "oc", descriptor = "Lclient!NQUAUMDT;")
	private Class6_Sub2_Sub3 aClass6_Sub2_Sub3_7 = new Class6_Sub2_Sub3(-587, new byte[5000]);

	@OriginalMember(owner = "client!client", name = "pc", descriptor = "[Lclient!DWBMCYCE;")
	private Class6_Sub2_Sub1_Sub1_Sub1[] aClass6_Sub2_Sub1_Sub1_Sub1Array1 = new Class6_Sub2_Sub1_Sub1_Sub1[16384];

	@OriginalMember(owner = "client!client", name = "rc", descriptor = "[I")
	private int[] anIntArray222 = new int[16384];

	@OriginalMember(owner = "client!client", name = "tc", descriptor = "I")
	private int anInt888 = -1;

	@OriginalMember(owner = "client!client", name = "vc", descriptor = "Ljava/lang/String;")
	private String aString19 = "";

	@OriginalMember(owner = "client!client", name = "xc", descriptor = "[Lclient!AOYWVYEX;")
	public Class1[] aClass1Array1 = new Class1[5];

	@OriginalMember(owner = "client!client", name = "yc", descriptor = "I")
	private int anInt891 = -951;

	@OriginalMember(owner = "client!client", name = "Ec", descriptor = "Z")
	private boolean aBoolean250 = true;

	@OriginalMember(owner = "client!client", name = "Sc", descriptor = "[I")
	private int[] anIntArray227 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

	@OriginalMember(owner = "client!client", name = "Tc", descriptor = "Z")
	private boolean aBoolean253 = false;

	@OriginalMember(owner = "client!client", name = "Uc", descriptor = "I")
	private int anInt898 = 2301979;

	@OriginalMember(owner = "client!client", name = "Wc", descriptor = "[I")
	private int[] anIntArray228 = new int[50];

	@OriginalMember(owner = "client!client", name = "Yc", descriptor = "I")
	private int anInt900 = -1;

	@OriginalMember(owner = "client!client", name = "Zc", descriptor = "I")
	private int anInt901 = -1;

	@OriginalMember(owner = "client!client", name = "cd", descriptor = "I")
	private int anInt902 = 906;

	@OriginalMember(owner = "client!client", name = "dd", descriptor = "[I")
	private int[] anIntArray231 = new int[200];

	@OriginalMember(owner = "client!client", name = "fd", descriptor = "Z")
	private boolean aBoolean255 = false;

	@OriginalMember(owner = "client!client", name = "hd", descriptor = "Z")
	private boolean aBoolean256 = false;

	@OriginalMember(owner = "client!client", name = "ld", descriptor = "I")
	private int anInt904 = 2;

	@OriginalMember(owner = "client!client", name = "md", descriptor = "Z")
	private boolean aBoolean257 = false;

	@OriginalMember(owner = "client!client", name = "sd", descriptor = "Ljava/lang/String;")
	private String aString22 = "";

	@OriginalMember(owner = "client!client", name = "wd", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray7 = new int[4][13][13];

	@OriginalMember(owner = "client!client", name = "yd", descriptor = "I")
	private int anInt909 = 2;

	@OriginalMember(owner = "client!client", name = "Gd", descriptor = "B")
	private byte aByte41 = 48;

	@OriginalMember(owner = "client!client", name = "Kd", descriptor = "Z")
	private boolean aBoolean258 = true;

	@OriginalMember(owner = "client!client", name = "Md", descriptor = "[I")
	private int[] anIntArray232 = new int[5];

	@OriginalMember(owner = "client!client", name = "Pd", descriptor = "[[I")
	private int[][] anIntArrayArray23 = new int[104][104];

	@OriginalMember(owner = "client!client", name = "Qd", descriptor = "I")
	private int anInt922 = -490;

	@OriginalMember(owner = "client!client", name = "Sd", descriptor = "Lclient!FYVRCFGT;")
	private Class13 aClass13_11 = new Class13(true);

	@OriginalMember(owner = "client!client", name = "Td", descriptor = "I")
	private int anInt924 = -1;

	@OriginalMember(owner = "client!client", name = "Ud", descriptor = "[[I")
	private int[][] anIntArrayArray24 = new int[104][104];

	@OriginalMember(owner = "client!client", name = "ce", descriptor = "I")
	private int anInt930 = 2;

	@OriginalMember(owner = "client!client", name = "de", descriptor = "[J")
	private long[] aLongArray3 = new long[100];

	@OriginalMember(owner = "client!client", name = "fe", descriptor = "I")
	private int anInt932 = 7759444;

	@OriginalMember(owner = "client!client", name = "ke", descriptor = "Z")
	private boolean aBoolean259 = false;

	@OriginalMember(owner = "client!client", name = "qe", descriptor = "Z")
	private boolean aBoolean260 = false;

	@OriginalMember(owner = "client!client", name = "re", descriptor = "[I")
	private int[] anIntArray233 = new int[4000];

	@OriginalMember(owner = "client!client", name = "se", descriptor = "[I")
	private int[] anIntArray234 = new int[4000];

	@OriginalMember(owner = "client!client", name = "ue", descriptor = "Z")
	private boolean aBoolean261 = false;

	@OriginalMember(owner = "client!client", name = "we", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray11 = new String[5];

	@OriginalMember(owner = "client!client", name = "xe", descriptor = "[Z")
	private boolean[] aBooleanArray11 = new boolean[5];

	@OriginalMember(owner = "client!client", name = "ze", descriptor = "I")
	private int anInt940 = -1;

	@OriginalMember(owner = "client!client", name = "Be", descriptor = "Z")
	private boolean aBoolean262 = false;

	@OriginalMember(owner = "client!client", name = "Qe", descriptor = "[Lclient!UZETOFZZ;")
	private Class6_Sub2_Sub2_Sub3[] aClass6_Sub2_Sub2_Sub3Array3 = new Class6_Sub2_Sub2_Sub3[13];

	@OriginalMember(owner = "client!client", name = "Re", descriptor = "I")
	private int anInt952 = 5063219;

	@OriginalMember(owner = "client!client", name = "cf", descriptor = "I")
	private int anInt962 = 128;

	@OriginalMember(owner = "client!client", name = "gf", descriptor = "I")
	private int anInt966 = 4;

	@OriginalMember(owner = "client!client", name = "of", descriptor = "[I")
	private int[] anIntArray235 = new int[Class22.anInt366];

	@OriginalMember(owner = "client!client", name = "vf", descriptor = "I")
	private int anInt979 = 1;

	@OriginalMember(owner = "client!client", name = "wf", descriptor = "I")
	private int anInt980 = -1;

	@OriginalMember(owner = "client!client", name = "yf", descriptor = "Z")
	private boolean aBoolean264 = false;

	@OriginalMember(owner = "client!client", name = "zf", descriptor = "[I")
	private int[] anIntArray236 = new int[Class22.anInt366];

	@OriginalMember(owner = "client!client", name = "Df", descriptor = "I")
	private int anInt983 = -1;

	@OriginalMember(owner = "client!client", name = "Kf", descriptor = "Z")
	private volatile boolean aBoolean265 = false;

	@OriginalMember(owner = "client!client", name = "Mf", descriptor = "Z")
	public boolean aBoolean266 = false;

	@OriginalMember(owner = "client!client", name = "Qf", descriptor = "I")
	private int anInt991 = 3;

	@OriginalMember(owner = "client!client", name = "Rf", descriptor = "I")
	private int anInt992 = 718;

	@OriginalMember(owner = "client!client", name = "Tf", descriptor = "[I")
	private int[] anIntArray240 = new int[1000];

	@OriginalMember(owner = "client!client", name = "Uf", descriptor = "[I")
	private int[] anIntArray241 = new int[1000];

	@OriginalMember(owner = "client!client", name = "Vf", descriptor = "I")
	private int anInt994 = -1;

	@OriginalMember(owner = "client!client", name = "Wf", descriptor = "[Lclient!UZETOFZZ;")
	private Class6_Sub2_Sub2_Sub3[] aClass6_Sub2_Sub2_Sub3Array4 = new Class6_Sub2_Sub2_Sub3[2];

	@OriginalMember(owner = "client!client", name = "Yf", descriptor = "I")
	private int anInt996 = 50;

	@OriginalMember(owner = "client!client", name = "Zf", descriptor = "[I")
	private int[] anIntArray242 = new int[this.anInt996];

	@OriginalMember(owner = "client!client", name = "ag", descriptor = "[I")
	private int[] anIntArray243 = new int[this.anInt996];

	@OriginalMember(owner = "client!client", name = "bg", descriptor = "[I")
	private int[] anIntArray244 = new int[this.anInt996];

	@OriginalMember(owner = "client!client", name = "cg", descriptor = "[I")
	private int[] anIntArray245 = new int[this.anInt996];

	@OriginalMember(owner = "client!client", name = "dg", descriptor = "[I")
	private int[] anIntArray246 = new int[this.anInt996];

	@OriginalMember(owner = "client!client", name = "eg", descriptor = "[I")
	private int[] anIntArray247 = new int[this.anInt996];

	@OriginalMember(owner = "client!client", name = "fg", descriptor = "[I")
	private int[] anIntArray248 = new int[this.anInt996];

	@OriginalMember(owner = "client!client", name = "gg", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray12 = new String[this.anInt996];

	@OriginalMember(owner = "client!client", name = "ig", descriptor = "[J")
	private long[] aLongArray4 = new long[200];

	@OriginalMember(owner = "client!client", name = "jg", descriptor = "I")
	private int anInt998 = -16070;

	@OriginalMember(owner = "client!client", name = "kg", descriptor = "Lclient!NQUAUMDT;")
	private Class6_Sub2_Sub3 aClass6_Sub2_Sub3_8 = Class6_Sub2_Sub3.method250();

	@OriginalMember(owner = "client!client", name = "mg", descriptor = "[Lclient!FKNRMZJV;")
	private Class6_Sub2_Sub2_Sub1[] aClass6_Sub2_Sub2_Sub1Array6 = new Class6_Sub2_Sub2_Sub1[1000];

	@OriginalMember(owner = "client!client", name = "og", descriptor = "I")
	private int anInt1001 = -1;

	@OriginalMember(owner = "client!client", name = "rg", descriptor = "[I")
	private int[] anIntArray249 = new int[50];

	@OriginalMember(owner = "client!client", name = "sg", descriptor = "[I")
	private int[] anIntArray250 = new int[5];

	@OriginalMember(owner = "client!client", name = "yg", descriptor = "Z")
	private boolean aBoolean267 = false;

	@OriginalMember(owner = "client!client", name = "Ag", descriptor = "[[[Lclient!FYVRCFGT;")
	private Class13[][][] aClass13ArrayArrayArray1 = new Class13[4][104][104];

	@OriginalMember(owner = "client!client", name = "Bg", descriptor = "[I")
	private int[] anIntArray251 = new int[2000];

	@OriginalMember(owner = "client!client", name = "Cg", descriptor = "Ljava/lang/String;")
	private String aString24 = "";

	@OriginalMember(owner = "client!client", name = "Dg", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray13 = new String[500];

	@OriginalMember(owner = "client!client", name = "Fg", descriptor = "I")
	private int anInt1009 = -1;

	@OriginalMember(owner = "client!client", name = "Gg", descriptor = "Ljava/lang/String;")
	private String aString25 = "";

	@OriginalMember(owner = "client!client", name = "Hg", descriptor = "Ljava/lang/String;")
	private String aString26 = "";

	@OriginalMember(owner = "client!client", name = "Ig", descriptor = "I")
	private int anInt1010 = 98;

	@OriginalMember(owner = "client!client", name = "Jg", descriptor = "[I")
	private int[] anIntArray252 = new int[] { 17, 24, 34, 40 };

	@OriginalMember(owner = "client!client", name = "Yg", descriptor = "[I")
	private int[] anIntArray253 = new int[5];

	@OriginalMember(owner = "client!client", name = "jh", descriptor = "Z")
	private boolean aBoolean268 = false;

	@OriginalMember(owner = "client!client", name = "nh", descriptor = "[I")
	private int[] anIntArray254 = new int[Class22.anInt366];

	@OriginalMember(owner = "client!client", name = "sh", descriptor = "[I")
	private int[] anIntArray255 = new int[1000];

	@OriginalMember(owner = "client!client", name = "uh", descriptor = "[I")
	private int[] anIntArray256 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

	@OriginalMember(owner = "client!client", name = "vh", descriptor = "I")
	private int anInt1017 = -1;

	@OriginalMember(owner = "client!client", name = "Hh", descriptor = "I")
	private int anInt1022 = 2048;

	@OriginalMember(owner = "client!client", name = "Ih", descriptor = "I")
	private int anInt1023 = 2047;

	@OriginalMember(owner = "client!client", name = "Jh", descriptor = "[Lclient!XVMRCEYW;")
	private Class6_Sub2_Sub1_Sub1_Sub2[] aClass6_Sub2_Sub1_Sub1_Sub2Array1 = new Class6_Sub2_Sub1_Sub1_Sub2[this.anInt1022];

	@OriginalMember(owner = "client!client", name = "Lh", descriptor = "[I")
	private int[] anIntArray257 = new int[this.anInt1022];

	@OriginalMember(owner = "client!client", name = "Nh", descriptor = "[I")
	private int[] anIntArray258 = new int[this.anInt1022];

	@OriginalMember(owner = "client!client", name = "Oh", descriptor = "[Lclient!NQUAUMDT;")
	private Class6_Sub2_Sub3[] aClass6_Sub2_Sub3Array1 = new Class6_Sub2_Sub3[this.anInt1022];

	@OriginalMember(owner = "client!client", name = "Sh", descriptor = "[Lclient!FKNRMZJV;")
	private Class6_Sub2_Sub2_Sub1[] aClass6_Sub2_Sub2_Sub1Array7 = new Class6_Sub2_Sub2_Sub1[8];

	@OriginalMember(owner = "client!client", name = "Vh", descriptor = "I")
	private int anInt1031 = 6;

	@OriginalMember(owner = "client!client", name = "ai", descriptor = "I")
	private int anInt1035 = 8;

	@OriginalMember(owner = "client!client", name = "ci", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray14 = new String[200];

	@OriginalMember(owner = "client!client", name = "ki", descriptor = "B")
	private byte aByte42 = 5;

	@OriginalMember(owner = "client!client", name = "li", descriptor = "[Lclient!UZETOFZZ;")
	private Class6_Sub2_Sub2_Sub3[] aClass6_Sub2_Sub2_Sub3Array5 = new Class6_Sub2_Sub2_Sub3[100];

	@OriginalMember(owner = "client!client", name = "ni", descriptor = "[B")
	private byte[] aByteArray21 = new byte[16384];

	@OriginalMember(owner = "client!client", name = "oi", descriptor = "Z")
	private boolean aBoolean269 = false;

	@OriginalMember(owner = "client!client", name = "qi", descriptor = "Ljava/lang/String;")
	private String aString28 = "";

	@OriginalMember(owner = "client!client", name = "ri", descriptor = "Ljava/lang/String;")
	private String aString29 = "";

	@OriginalMember(owner = "client!client", name = "si", descriptor = "[[I")
	private int[][] anIntArrayArray25 = new int[104][104];

	@OriginalMember(owner = "client!client", name = "ti", descriptor = "I")
	private int anInt1043 = 353;

	@OriginalMember(owner = "client!client", name = "ui", descriptor = "I")
	private int anInt1044 = -1;

	@OriginalMember(owner = "client!client", name = "wi", descriptor = "I")
	private int anInt1046 = 793;

	@OriginalMember(owner = "client!client", name = "xi", descriptor = "Z")
	private boolean aBoolean270 = false;

	@OriginalMember(owner = "client!client", name = "Bi", descriptor = "I")
	private int anInt1049 = 4;

	@OriginalMember(owner = "client!client", name = "Ci", descriptor = "[Lclient!FKNRMZJV;")
	private Class6_Sub2_Sub2_Sub1[] aClass6_Sub2_Sub2_Sub1Array8 = new Class6_Sub2_Sub2_Sub1[100];

	@OriginalMember(owner = "client!client", name = "Di", descriptor = "[I")
	public int[] anIntArray260 = new int[2000];

	@OriginalMember(owner = "client!client", name = "Ei", descriptor = "I")
	private int anInt1050 = 78;

	@OriginalMember(owner = "client!client", name = "Fi", descriptor = "[I")
	private int[] anIntArray261 = new int[50];

	@OriginalMember(owner = "client!client", name = "Ii", descriptor = "Ljava/lang/String;")
	private String aString30 = "";

	@OriginalMember(owner = "client!client", name = "Pi", descriptor = "I")
	private int anInt1053 = -1;

	@OriginalMember(owner = "client!client", name = "Qi", descriptor = "Z")
	private boolean aBoolean272 = false;

	@OriginalMember(owner = "client!client", name = "Si", descriptor = "[Z")
	private boolean[] aBooleanArray12 = new boolean[5];

	@OriginalMember(owner = "client!client", name = "bj", descriptor = "Z")
	private boolean aBoolean273 = false;

	@OriginalMember(owner = "client!client", name = "ej", descriptor = "Z")
	private volatile boolean aBoolean274 = false;

	@OriginalMember(owner = "client!client", name = "fj", descriptor = "Z")
	private volatile boolean aBoolean275 = false;

	@OriginalMember(owner = "client!client", name = "hj", descriptor = "Z")
	private boolean aBoolean276 = true;

	@OriginalMember(owner = "client!client", name = "oj", descriptor = "I")
	private int anInt1064 = -39100;

	@OriginalMember(owner = "client!client", name = "pj", descriptor = "Ljava/lang/String;")
	private String aString31 = "";

	@OriginalMember(owner = "client!client", name = "rj", descriptor = "I")
	private int anInt1066 = -1;

	@OriginalMember(owner = "client!client", name = "sj", descriptor = "Lclient!NQUAUMDT;")
	private Class6_Sub2_Sub3 aClass6_Sub2_Sub3_9 = Class6_Sub2_Sub3.method250();

	@OriginalMember(owner = "client!client", name = "xj", descriptor = "B")
	private byte aByte43 = -123;

	@OriginalMember(owner = "client!client", name = "zj", descriptor = "[I")
	private int[] anIntArray269 = new int[5];

	@OriginalMember(owner = "client!client", name = "Aj", descriptor = "[Lclient!FKNRMZJV;")
	private Class6_Sub2_Sub2_Sub1[] aClass6_Sub2_Sub2_Sub1Array9 = new Class6_Sub2_Sub2_Sub1[32];

	@OriginalMember(owner = "client!client", name = "Bj", descriptor = "Z")
	private boolean aBoolean278 = false;

	@OriginalMember(owner = "client!client", name = "Cj", descriptor = "[I")
	private int[] anIntArray270 = new int[5];

	@OriginalMember(owner = "client!client", name = "Ej", descriptor = "[Lclient!FKNRMZJV;")
	private Class6_Sub2_Sub2_Sub1[] aClass6_Sub2_Sub2_Sub1Array10 = new Class6_Sub2_Sub2_Sub1[32];

	@OriginalMember(owner = "client!client", name = "Fj", descriptor = "Z")
	private boolean aBoolean279 = false;

	@OriginalMember(owner = "client!client", name = "Ij", descriptor = "B")
	private byte aByte44 = -83;

	@OriginalMember(owner = "client!client", name = "Jj", descriptor = "[Lclient!YCMSDYIA;")
	private Class47[] aClass47Array1 = new Class47[4];

	@OriginalMember(owner = "client!client", name = "Kj", descriptor = "Lclient!FYVRCFGT;")
	private Class13 aClass13_12 = new Class13(true);

	@OriginalMember(owner = "client!client", name = "Vj", descriptor = "[I")
	private int[] anIntArray272 = new int[500];

	@OriginalMember(owner = "client!client", name = "Wj", descriptor = "[I")
	private int[] anIntArray273 = new int[500];

	@OriginalMember(owner = "client!client", name = "Xj", descriptor = "[I")
	private int[] anIntArray274 = new int[500];

	@OriginalMember(owner = "client!client", name = "Yj", descriptor = "[I")
	private int[] anIntArray275 = new int[500];

	@OriginalMember(owner = "client!client", name = "Zj", descriptor = "Z")
	private boolean aBoolean280 = false;

	@OriginalMember(owner = "client!client", name = "bk", descriptor = "[I")
	private int[] anIntArray276 = new int[256];

	@OriginalMember(owner = "client!client", name = "ck", descriptor = "Z")
	private boolean aBoolean281 = false;

	@OriginalMember(owner = "client!client", name = "ek", descriptor = "I")
	private int anInt1078 = -680;

	@OriginalMember(owner = "client!client", name = "gk", descriptor = "Z")
	private boolean aBoolean282 = false;

	@OriginalMember(owner = "client!client", name = "hk", descriptor = "Z")
	private boolean aBoolean283 = false;

	static {
		@Pc(353) int local353 = 0;
		@Pc(355) int local355;
		for (local355 = 0; local355 < 99; local355++) {
			@Pc(360) int local360 = local355 + 1;
			@Pc(373) int local373 = (int) ((double) local360 + Math.pow(2.0D, (double) local360 / 7.0D) * 300.0D);
			local353 += local373;
			anIntArray262[local355] = local353 / 4;
		}
		anIntArray271 = new int[32];
		local353 = 2;
		for (local355 = 0; local355 < 32; local355++) {
			anIntArray271[local355] = local353 - 1;
			local353 += local353;
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(IZI)Ljava/lang/String;")
	private static String method607(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		try {
			@Pc(11) int local11 = arg1 - arg0;
			if (local11 < -9) {
				return "@red@";
			} else if (local11 < -6) {
				return "@or3@";
			} else if (local11 < -3) {
				return "@or2@";
			} else if (local11 < 0) {
				return "@or1@";
			} else if (local11 > 9) {
				return "@gre@";
			} else if (local11 > 6) {
				return "@gr3@";
			} else if (local11 > 3) {
				return "@gr2@";
			} else if (local11 > 0) {
				return "@gr1@";
			} else {
				return "@yel@";
			}
		} catch (@Pc(52) RuntimeException local52) {
			signlink.reporterror("31250, " + arg0 + ", " + false + ", " + arg1 + ", " + local52.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "k", descriptor = "(I)V")
	private static void method608() {
		try {
			Class41.aBoolean171 = true;
			Class6_Sub2_Sub2_Sub4.aBoolean233 = true;
			aBoolean252 = true;
			Class27.aBoolean128 = true;
			Class19.aBoolean99 = true;
		} catch (@Pc(21) RuntimeException local21) {
			signlink.reporterror("55893, " + 2 + ", " + local21.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(Z)V")
	private static void method627() {
		try {
			Class41.aBoolean171 = false;
			Class6_Sub2_Sub2_Sub4.aBoolean233 = false;
			aBoolean252 = false;
			Class27.aBoolean128 = false;
			Class19.aBoolean99 = false;
		} catch (@Pc(14) RuntimeException local14) {
			signlink.reporterror("3064, " + true + ", " + local14.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(IZ)Ljava/lang/String;")
	private static String method647(@OriginalArg(0) int arg0) {
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
			signlink.reporterror("62592, " + arg0 + ", " + false + ", " + local95.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "main", descriptor = "([Ljava/lang/String;)V")
	public static void main(@OriginalArg(0) String[] arg0) {
		try {
			System.out.println("RS2 user client - release #" + 358);
			if (arg0.length == 5) {
				anInt892 = Integer.parseInt(arg0[0]);
				anInt893 = Integer.parseInt(arg0[1]);
				if (arg0[2].equals("lowmem")) {
					method608();
				} else if (arg0[2].equals("highmem")) {
					method627();
				} else {
					System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
					return;
				}
				if (arg0[3].equals("free")) {
					aBoolean251 = false;
				} else if (arg0[3].equals("members")) {
					aBoolean251 = true;
				} else {
					System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
					return;
				}
				signlink.anInt1082 = Integer.parseInt(arg0[4]);
				signlink.startpriv(InetAddress.getLocalHost());
				@Pc(87) client local87 = new client();
				local87.method576();
			} else {
				System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
			}
		} catch (@Pc(94) Exception local94) {
		}
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(IZ)Ljava/lang/String;")
	private static String method717(@OriginalArg(0) int arg0) {
		try {
			if (arg0 < 100000) {
				return String.valueOf(arg0);
			} else if (arg0 < 10000000) {
				return arg0 / 1000 + "K";
			} else {
				return arg0 / 1000000 + "M";
			}
		} catch (@Pc(39) RuntimeException local39) {
			signlink.reporterror("18209, " + arg0 + ", " + false + ", " + local39.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "g", descriptor = "(I)V")
	private void method589() {
		try {
			if (this.anInt939 == 0 && super.anInt838 == 1) {
				@Pc(21) int local21 = super.anInt839 - 25 - 550;
				@Pc(28) int local28 = super.anInt840 - 5 - 4;
				if (local21 >= 0 && local28 >= 0 && local21 < 146 && local28 < 151) {
					local21 -= 73;
					local28 -= 75;
					@Pc(48) int local48 = this.anInt963 + this.anInt903 & 0x7FF;
					@Pc(52) int local52 = Class6_Sub2_Sub2_Sub4.anIntArray204[local48];
					@Pc(56) int local56 = Class6_Sub2_Sub2_Sub4.anIntArray205[local48];
					@Pc(65) int local65 = local52 * (this.anInt844 + 256) >> 8;
					@Pc(74) int local74 = local56 * (this.anInt844 + 256) >> 8;
					@Pc(84) int local84 = local28 * local65 + local21 * local74 >> 11;
					@Pc(94) int local94 = local28 * local74 - local21 * local65 >> 11;
					@Pc(101) int local101 = aClass6_Sub2_Sub1_Sub1_Sub2_1.anInt699 + local84 >> 7;
					@Pc(108) int local108 = aClass6_Sub2_Sub1_Sub1_Sub2_1.anInt700 - local94 >> 7;
					@Pc(129) boolean local129 = this.method719(0, 0, local108, 0, aClass6_Sub2_Sub1_Sub1_Sub2_1.anIntArray183[0], 0, local101, 0, true, 1, aClass6_Sub2_Sub1_Sub1_Sub2_1.anIntArray182[0]);
					if (local129) {
						this.aClass6_Sub2_Sub3_8.method252(local21);
						this.aClass6_Sub2_Sub3_8.method252(local28);
						this.aClass6_Sub2_Sub3_8.method253(this.anInt963);
						this.aClass6_Sub2_Sub3_8.method252(57);
						this.aClass6_Sub2_Sub3_8.method252(this.anInt903);
						this.aClass6_Sub2_Sub3_8.method252(this.anInt844);
						this.aClass6_Sub2_Sub3_8.method252(89);
						this.aClass6_Sub2_Sub3_8.method253(aClass6_Sub2_Sub1_Sub1_Sub2_1.anInt699);
						this.aClass6_Sub2_Sub3_8.method253(aClass6_Sub2_Sub1_Sub1_Sub2_1.anInt700);
						this.aClass6_Sub2_Sub3_8.method252(this.anInt970);
						this.aClass6_Sub2_Sub3_8.method252(63);
						return;
					}
				}
			}
		} catch (@Pc(183) RuntimeException local183) {
			signlink.reporterror("84461, " + -17 + ", " + local183.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(B)V")
	private void method590() {
		try {
			if (this.anInt883 > 0) {
				this.method594();
			} else {
				this.method595("Please wait - attempting to reestablish", "Connection lost");
				this.anInt939 = 0;
				this.anInt1014 = 0;
				@Pc(24) Class34 local24 = this.aClass34_1;
				this.aBoolean266 = false;
				this.anInt936 = 0;
				this.method609(this.aString28, this.aString29, true);
				if (!this.aBoolean266) {
					this.method594();
				}
				try {
					local24.method347();
				} catch (@Pc(47) Exception local47) {
				}
			}
		} catch (@Pc(49) RuntimeException local49) {
			signlink.reporterror("86115, " + 110 + ", " + local49.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIIIIIIII)V")
	private void method591(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		try {
			@Pc(1) Class6_Sub1 local1 = null;
			for (@Pc(6) Class6_Sub1 local6 = (Class6_Sub1) this.aClass13_10.method113(); local6 != null; local6 = (Class6_Sub1) this.aClass13_10.method115()) {
				if (local6.anInt32 == arg6 && local6.anInt34 == arg7 && local6.anInt35 == arg3 && local6.anInt33 == arg8) {
					local1 = local6;
					break;
				}
			}
			if (local1 == null) {
				local1 = new Class6_Sub1();
				local1.anInt32 = arg6;
				local1.anInt33 = arg8;
				local1.anInt34 = arg7;
				local1.anInt35 = arg3;
				this.method703(local1);
				this.aClass13_10.method110(local1);
			}
			local1.anInt37 = arg2;
			local1.anInt39 = arg1;
			local1.anInt38 = arg0;
			local1.anInt36 = arg4;
			local1.anInt40 = arg5;
		} catch (@Pc(84) RuntimeException local84) {
			signlink.reporterror("15903, " + arg0 + ", " + arg1 + ", " + 16885 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + local84.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILclient!VGGOSQRK;B)I")
	private int method592(@OriginalArg(0) int arg0, @OriginalArg(1) Class44 arg1) {
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
						local34 = this.anIntArray254[local21[local25++]];
					}
					if (local32 == 2) {
						local34 = this.anIntArray236[local21[local25++]];
					}
					if (local32 == 3) {
						local34 = this.anIntArray235[local21[local25++]];
					}
					@Pc(82) Class44 local82;
					@Pc(87) int local87;
					@Pc(100) int local100;
					if (local32 == 4) {
						local82 = Class44.method496(local21[local25++]);
						local87 = local21[local25++];
						if (local87 >= 0 && local87 < Class43.anInt560 && (!Class43.method464(local87).aBoolean176 || aBoolean251)) {
							for (local100 = 0; local100 < local82.anIntArray173.length; local100++) {
								if (local82.anIntArray173[local100] == local87 + 1) {
									local34 += local82.anIntArray179[local100];
								}
							}
						}
					}
					if (local32 == 5) {
						local34 = this.anIntArray260[local21[local25++]];
					}
					if (local32 == 6) {
						local34 = anIntArray262[this.anIntArray236[local21[local25++]] - 1];
					}
					if (local32 == 7) {
						local34 = this.anIntArray260[local21[local25++]] * 100 / 46875;
					}
					if (local32 == 8) {
						local34 = aClass6_Sub2_Sub1_Sub1_Sub2_1.anInt737;
					}
					@Pc(175) int local175;
					if (local32 == 9) {
						for (local175 = 0; local175 < Class22.anInt366; local175++) {
							if (Class22.aBooleanArray5[local175]) {
								local34 += this.anIntArray236[local175];
							}
						}
					}
					if (local32 == 10) {
						local82 = Class44.method496(local21[local25++]);
						local87 = local21[local25++] + 1;
						if (local87 >= 0 && local87 < Class43.anInt560 && (!Class43.method464(local87).aBoolean176 || aBoolean251)) {
							for (local100 = 0; local100 < local82.anIntArray173.length; local100++) {
								if (local82.anIntArray173[local100] == local87) {
									local34 = 999999999;
									break;
								}
							}
						}
					}
					if (local32 == 11) {
						local34 = this.anInt858;
					}
					if (local32 == 12) {
						local34 = this.anInt1033;
					}
					if (local32 == 13) {
						local175 = this.anIntArray260[local21[local25++]];
						local87 = local21[local25++];
						local34 = (local175 & 0x1 << local87) == 0 ? 0 : 1;
					}
					if (local32 == 14) {
						local175 = local21[local25++];
						@Pc(289) Class17 local289 = Class17.aClass17Array1[local175];
						local100 = local289.anInt294;
						@Pc(295) int local295 = local289.anInt295;
						@Pc(298) int local298 = local289.anInt296;
						@Pc(304) int local304 = anIntArray271[local298 - local295];
						local34 = this.anIntArray260[local100] >> local295 & local304;
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
						local34 = (aClass6_Sub2_Sub1_Sub1_Sub2_1.anInt699 >> 7) + this.anInt945;
					}
					if (local32 == 19) {
						local34 = (aClass6_Sub2_Sub1_Sub1_Sub2_1.anInt700 >> 7) + this.anInt946;
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
			signlink.reporterror("91697, " + arg0 + ", " + arg1 + ", " + -15 + ", " + local400.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "h", descriptor = "(I)Ljava/net/Socket;")
	public Socket method593(@OriginalArg(0) int arg0) throws IOException {
		return signlink.mainapp == null ? new Socket(InetAddress.getByName(this.getCodeBase().getHost()), arg0) : signlink.opensocket(arg0);
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(B)V")
	private void method594() {
		try {
			try {
				if (this.aClass34_1 != null) {
					this.aClass34_1.method347();
				}
			} catch (@Pc(9) Exception local9) {
			}
			this.aClass34_1 = null;
			this.aBoolean266 = false;
			this.anInt884 = 0;
			this.aString28 = "";
			this.aString29 = "";
			this.method706();
			this.aClass41_1.method402();
			for (@Pc(43) int local43 = 0; local43 < 4; local43++) {
				this.aClass47Array1[local43].method514();
			}
			System.gc();
			this.method636();
			this.anInt877 = -1;
			this.anInt1062 = -1;
			this.anInt846 = 0;
		} catch (@Pc(69) RuntimeException local69) {
			signlink.reporterror("35356, " + 64 + ", " + local69.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;I)V")
	private void method595(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1) {
		try {
			@Pc(17) int local17;
			if (this.aClass8_8 != null) {
				this.aClass8_8.method58();
				Class6_Sub2_Sub2_Sub4.anIntArray206 = this.anIntArray267;
				local17 = 151;
				if (arg0 != null) {
					local17 -= 7;
				}
				this.aClass6_Sub2_Sub2_Sub2_3.method380(0, local17, arg1, 257);
				this.aClass6_Sub2_Sub2_Sub2_3.method380(16777215, local17 - 1, arg1, 256);
				local17 += 15;
				if (arg0 != null) {
					this.aClass6_Sub2_Sub2_Sub2_3.method380(0, local17, arg0, 257);
					this.aClass6_Sub2_Sub2_Sub2_3.method380(16777215, local17 - 1, arg0, 256);
				}
				this.aClass8_8.method59(super.aGraphics2, 4, 4);
			} else if (super.aClass8_2 != null) {
				super.aClass8_2.method58();
				Class6_Sub2_Sub2_Sub4.anIntArray206 = this.anIntArray268;
				local17 = 251;
				Class6_Sub2_Sub2.method552(300, 233, 50, 221, 0);
				Class6_Sub2_Sub2.method553(233, 300, 16777215, 50, 221);
				if (arg0 != null) {
					local17 -= 7;
				}
				this.aClass6_Sub2_Sub2_Sub2_3.method380(0, local17, arg1, 383);
				this.aClass6_Sub2_Sub2_Sub2_3.method380(16777215, local17 - 1, arg1, 382);
				local17 += 15;
				if (arg0 != null) {
					this.aClass6_Sub2_Sub2_Sub2_3.method380(0, local17, arg0, 383);
					this.aClass6_Sub2_Sub2_Sub2_3.method380(16777215, local17 - 1, arg0, 382);
				}
				super.aClass8_2.method59(super.aGraphics2, 0, 0);
			}
		} catch (@Pc(170) RuntimeException local170) {
			signlink.reporterror("50918, " + arg0 + ", " + arg1 + ", " + -252 + ", " + local170.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(II)V")
	private void method596(@OriginalArg(1) int arg0) {
		try {
			if (!aBoolean252) {
				for (@Pc(12) int local12 = 0; local12 < this.anIntArray252.length; local12++) {
					@Pc(19) int local19 = this.anIntArray252[local12];
					if (Class6_Sub2_Sub2_Sub4.anIntArray208[local19] >= arg0) {
						@Pc(28) Class6_Sub2_Sub2_Sub3 local28 = Class6_Sub2_Sub2_Sub4.aClass6_Sub2_Sub2_Sub3Array1[local19];
						@Pc(36) int local36 = local28.anInt605 * local28.anInt606 - 1;
						@Pc(44) int local44 = local28.anInt605 * this.anInt860 * 2;
						@Pc(47) byte[] local47 = local28.aByteArray13;
						@Pc(50) byte[] local50 = this.aByteArray21;
						for (@Pc(52) int local52 = 0; local52 <= local36; local52++) {
							local50[local52] = local47[local52 - local44 & local36];
						}
						local28.aByteArray13 = local50;
						this.aByteArray21 = local47;
						Class6_Sub2_Sub2_Sub4.method566(local19);
					}
				}
				anInt878++;
				if (anInt878 > 136) {
					anInt878 = 0;
					this.aClass6_Sub2_Sub3_8.method251(68);
					this.aClass6_Sub2_Sub3_8.method253(8854);
					return;
				}
			}
		} catch (@Pc(103) RuntimeException local103) {
			signlink.reporterror("66451, " + 26284 + ", " + arg0 + ", " + local103.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIII)I")
	private int method597(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		try {
			@Pc(3) int local3 = 256 - arg0;
			this.anInt879 += 0;
			return ((arg1 & 0xFF00FF) * local3 + (arg2 & 0xFF00FF) * arg0 & 0xFF00FF00) + ((arg1 & 0xFF00) * local3 + (arg2 & 0xFF00) * arg0 & 0xFF0000) >> 8;
		} catch (@Pc(40) RuntimeException local40) {
			signlink.reporterror("33169, " + arg0 + ", " + 0 + ", " + arg1 + ", " + arg2 + ", " + local40.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "i", descriptor = "(I)Z")
	private boolean method598() {
		try {
			if (this.aClass34_1 == null) {
				return false;
			}
			@Pc(677) String local677;
			@Pc(213) int local213;
			try {
				@Pc(17) int local17 = this.aClass34_1.method349();
				if (local17 == 0) {
					return false;
				}
				if (this.anInt880 == -1) {
					this.aClass34_1.method350(this.aClass6_Sub2_Sub3_9.aByteArray9, 0, 1);
					this.anInt880 = this.aClass6_Sub2_Sub3_9.aByteArray9[0] & 0xFF;
					if (this.aClass18_2 != null) {
						this.anInt880 = this.anInt880 - this.aClass18_2.method161() & 0xFF;
					}
					this.anInt879 = Class15.anIntArray57[this.anInt880];
					local17--;
				}
				if (this.anInt879 == -1) {
					if (local17 <= 0) {
						return false;
					}
					this.aClass34_1.method350(this.aClass6_Sub2_Sub3_9.aByteArray9, 0, 1);
					this.anInt879 = this.aClass6_Sub2_Sub3_9.aByteArray9[0] & 0xFF;
					local17--;
				}
				if (this.anInt879 == -2) {
					if (local17 <= 1) {
						return false;
					}
					this.aClass34_1.method350(this.aClass6_Sub2_Sub3_9.aByteArray9, 0, 2);
					this.aClass6_Sub2_Sub3_9.anInt404 = 0;
					this.anInt879 = this.aClass6_Sub2_Sub3_9.method264();
					local17 -= 2;
				}
				if (local17 < this.anInt879) {
					return false;
				}
				this.aClass6_Sub2_Sub3_9.anInt404 = 0;
				this.aClass34_1.method350(this.aClass6_Sub2_Sub3_9.aByteArray9, 0, this.anInt879);
				this.anInt881 = 0;
				this.anInt907 = this.anInt906;
				this.anInt906 = this.anInt905;
				this.anInt905 = this.anInt880;
				@Pc(161) int local161;
				if (this.anInt880 == 139) {
					local161 = this.aClass6_Sub2_Sub3_9.method264();
					if (local161 == 65535) {
						local161 = -1;
					}
					if (local161 != this.anInt877 && this.aBoolean250 && !aBoolean252 && this.anInt846 == 0) {
						this.anInt1062 = local161;
						this.aBoolean276 = true;
						this.aClass25_Sub1_1.method228(2, this.anInt1062);
					}
					this.anInt877 = local161;
					this.anInt880 = -1;
					return true;
				}
				if (this.anInt880 == 93) {
					local161 = this.aClass6_Sub2_Sub3_9.method294();
					local213 = this.aClass6_Sub2_Sub3_9.method291(this.aByte43);
					if (this.aBoolean250 && !aBoolean252) {
						this.anInt1062 = local213;
						this.aBoolean276 = false;
						this.aClass25_Sub1_1.method228(2, this.anInt1062);
						this.anInt846 = local161;
					}
					this.anInt880 = -1;
					return true;
				}
				if (this.anInt880 == 23) {
					this.anInt916 = this.aClass6_Sub2_Sub3_9.method282(this.anInt1043);
					this.anInt915 = this.aClass6_Sub2_Sub3_9.method281();
					this.anInt880 = -1;
					return true;
				}
				@Pc(280) int local280;
				@Pc(284) int local284;
				@Pc(288) int local288;
				@Pc(274) Class44 local274;
				if (this.anInt880 == 229) {
					this.aBoolean279 = true;
					local161 = this.aClass6_Sub2_Sub3_9.method264();
					local274 = Class44.method496(local161);
					while (this.aClass6_Sub2_Sub3_9.anInt404 < this.anInt879) {
						local280 = this.aClass6_Sub2_Sub3_9.method276();
						local284 = this.aClass6_Sub2_Sub3_9.method264();
						local288 = this.aClass6_Sub2_Sub3_9.method262();
						if (local288 == 255) {
							local288 = this.aClass6_Sub2_Sub3_9.method267();
						}
						if (local280 >= 0 && local280 < local274.anIntArray173.length) {
							local274.anIntArray173[local280] = local284;
							local274.anIntArray179[local280] = local288;
						}
					}
					this.anInt880 = -1;
					return true;
				}
				if (this.anInt880 == 185) {
					if (this.anInt885 != -1) {
						this.method603(this.anInt885);
						this.anInt885 = -1;
						this.aBoolean279 = true;
						this.aBoolean255 = true;
					}
					if (this.anInt983 != -1) {
						this.method603(this.anInt983);
						this.anInt983 = -1;
						this.aBoolean282 = true;
					}
					if (this.anInt924 != -1) {
						this.method603(this.anInt924);
						this.anInt924 = -1;
						this.aBoolean243 = true;
					}
					if (this.anInt1009 != -1) {
						this.method603(this.anInt1009);
						this.anInt1009 = -1;
					}
					if (this.anInt994 != -1) {
						this.method603(this.anInt994);
						this.anInt994 = -1;
					}
					if (this.anInt923 != 0) {
						this.anInt923 = 0;
						this.aBoolean282 = true;
					}
					this.aBoolean267 = false;
					this.anInt880 = -1;
					return true;
				}
				if (this.anInt880 == 125) {
					this.anInt865 = this.aClass6_Sub2_Sub3_9.method262();
					if (this.anInt865 == 1) {
						this.anInt981 = this.aClass6_Sub2_Sub3_9.method264();
					}
					if (this.anInt865 >= 2 && this.anInt865 <= 6) {
						if (this.anInt865 == 2) {
							this.anInt956 = 64;
							this.anInt957 = 64;
						}
						if (this.anInt865 == 3) {
							this.anInt956 = 0;
							this.anInt957 = 64;
						}
						if (this.anInt865 == 4) {
							this.anInt956 = 128;
							this.anInt957 = 64;
						}
						if (this.anInt865 == 5) {
							this.anInt956 = 64;
							this.anInt957 = 0;
						}
						if (this.anInt865 == 6) {
							this.anInt956 = 64;
							this.anInt957 = 128;
						}
						this.anInt865 = 2;
						this.anInt953 = this.aClass6_Sub2_Sub3_9.method264();
						this.anInt954 = this.aClass6_Sub2_Sub3_9.method264();
						this.anInt955 = this.aClass6_Sub2_Sub3_9.method262();
					}
					if (this.anInt865 == 10) {
						this.anInt988 = this.aClass6_Sub2_Sub3_9.method264();
					}
					this.anInt880 = -1;
					return true;
				}
				if (this.anInt880 == 241) {
					this.anInt1028 = this.aClass6_Sub2_Sub3_9.method262();
					this.anInt887 = this.aClass6_Sub2_Sub3_9.method262();
					this.anInt951 = this.aClass6_Sub2_Sub3_9.method262();
					this.aBoolean283 = true;
					this.aBoolean282 = true;
					this.anInt880 = -1;
					return true;
				}
				if (this.anInt880 == 194) {
					local161 = this.aClass6_Sub2_Sub3_9.method291(this.aByte43);
					local213 = this.aClass6_Sub2_Sub3_9.method291(this.aByte43);
					local280 = this.aClass6_Sub2_Sub3_9.method290();
					local284 = this.aClass6_Sub2_Sub3_9.method291(this.aByte43);
					Class44.method496(local213).anInt620 = local284;
					Class44.method496(local213).anInt621 = local161;
					Class44.method496(local213).anInt619 = local280;
					this.anInt880 = -1;
					return true;
				}
				if (this.anInt880 == 158) {
					this.anInt1032 = this.aClass6_Sub2_Sub3_9.method262();
					this.anInt880 = -1;
					return true;
				}
				if (this.anInt880 == 223) {
					this.anInt1017 = this.aClass6_Sub2_Sub3_9.method262();
					if (this.anInt1017 == this.anInt861) {
						if (this.anInt1017 == 3) {
							this.anInt861 = 1;
						} else {
							this.anInt861 = 3;
						}
						this.aBoolean279 = true;
					}
					this.anInt880 = -1;
					return true;
				}
				if (this.anInt880 == 103) {
					this.anInt1066 = this.aClass6_Sub2_Sub3_9.method291(this.aByte43);
					this.anInt1061 = this.aClass6_Sub2_Sub3_9.method282(this.anInt1043);
					this.anInt880 = -1;
					return true;
				}
				@Pc(695) int local695;
				@Pc(688) String local688;
				@Pc(693) boolean local693;
				@Pc(828) String local828;
				if (this.anInt880 == 28) {
					local677 = this.aClass6_Sub2_Sub3_9.method269();
					@Pc(691) long local691;
					if (local677.endsWith(":tradereq:")) {
						local688 = local677.substring(0, local677.indexOf(":"));
						local691 = Class39.method359(local688);
						local693 = false;
						for (local695 = 0; local695 < this.anInt1052; local695++) {
							if (this.aLongArray3[local695] == local691) {
								local693 = true;
								break;
							}
						}
						if (!local693 && this.anInt1068 == 0) {
							this.method638(local688, 4, "wishes to trade with you.");
						}
					} else if (local677.endsWith(":duelreq:")) {
						local688 = local677.substring(0, local677.indexOf(":"));
						local691 = Class39.method359(local688);
						local693 = false;
						for (local695 = 0; local695 < this.anInt1052; local695++) {
							if (this.aLongArray3[local695] == local691) {
								local693 = true;
								break;
							}
						}
						if (!local693 && this.anInt1068 == 0) {
							this.method638(local688, 8, "wishes to duel with you.");
						}
					} else if (local677.endsWith(":chalreq:")) {
						local688 = local677.substring(0, local677.indexOf(":"));
						local691 = Class39.method359(local688);
						local693 = false;
						for (local695 = 0; local695 < this.anInt1052; local695++) {
							if (this.aLongArray3[local695] == local691) {
								local693 = true;
								break;
							}
						}
						if (!local693 && this.anInt1068 == 0) {
							local828 = local677.substring(local677.indexOf(":") + 1, local677.length() - 9);
							this.method638(local688, 8, local828);
						}
					} else {
						this.method638("", 0, local677);
					}
					this.anInt880 = -1;
					return true;
				}
				if (this.anInt880 == 190) {
					local161 = this.aClass6_Sub2_Sub3_9.method290();
					this.method631(local161);
					if (this.anInt983 != -1) {
						this.method603(this.anInt983);
						this.anInt983 = -1;
						this.aBoolean282 = true;
					}
					if (this.anInt924 != -1) {
						this.method603(this.anInt924);
						this.anInt924 = -1;
						this.aBoolean243 = true;
					}
					if (this.anInt1009 != -1) {
						this.method603(this.anInt1009);
						this.anInt1009 = -1;
					}
					if (this.anInt994 != -1) {
						this.method603(this.anInt994);
						this.anInt994 = -1;
					}
					if (this.anInt885 != local161) {
						this.method603(this.anInt885);
						this.anInt885 = local161;
					}
					if (this.anInt923 != 0) {
						this.anInt923 = 0;
						this.aBoolean282 = true;
					}
					this.aBoolean279 = true;
					this.aBoolean255 = true;
					this.aBoolean267 = false;
					this.anInt880 = -1;
					return true;
				}
				if (this.anInt880 == 236) {
					this.aBoolean273 = true;
					this.anInt1055 = this.aClass6_Sub2_Sub3_9.method262();
					this.anInt1056 = this.aClass6_Sub2_Sub3_9.method262();
					this.anInt1057 = this.aClass6_Sub2_Sub3_9.method264();
					this.anInt1058 = this.aClass6_Sub2_Sub3_9.method262();
					this.anInt1059 = this.aClass6_Sub2_Sub3_9.method262();
					if (this.anInt1059 >= 100) {
						this.anInt872 = this.anInt1055 * 128 + 64;
						this.anInt874 = this.anInt1056 * 128 + 64;
						this.anInt873 = this.method640(this.anInt872, this.anInt1074, this.anInt874) - this.anInt1057;
					}
					this.anInt880 = -1;
					return true;
				}
				if (this.anInt880 == 127) {
					this.anInt861 = this.aClass6_Sub2_Sub3_9.method280();
					this.aBoolean279 = true;
					this.aBoolean255 = true;
					this.anInt880 = -1;
					return true;
				}
				if (this.anInt880 == 72) {
					this.anInt916 = this.aClass6_Sub2_Sub3_9.method282(this.anInt1043);
					this.anInt915 = this.aClass6_Sub2_Sub3_9.method282(this.anInt1043);
					while (this.aClass6_Sub2_Sub3_9.anInt404 < this.anInt879) {
						local161 = this.aClass6_Sub2_Sub3_9.method262();
						this.method606(this.aClass6_Sub2_Sub3_9, local161);
					}
					this.anInt880 = -1;
					return true;
				}
				if (this.anInt880 == 249) {
					if (this.anInt861 == 12) {
						this.aBoolean279 = true;
					}
					this.anInt858 = this.aClass6_Sub2_Sub3_9.method262();
					this.anInt880 = -1;
					return true;
				}
				if (this.anInt880 == 21) {
					this.anInt1052 = this.anInt879 / 8;
					for (local161 = 0; local161 < this.anInt1052; local161++) {
						this.aLongArray3[local161] = this.aClass6_Sub2_Sub3_9.method268();
					}
					this.anInt880 = -1;
					return true;
				}
				if (this.anInt880 == 7) {
					this.aClass6_Sub2_Sub3_9.method290();
					this.aClass6_Sub2_Sub3_9.method262();
					this.anInt960 = this.aClass6_Sub2_Sub3_9.method289((byte) 1);
					this.anInt1037 = this.aClass6_Sub2_Sub3_9.method290();
					this.anInt934 = this.aClass6_Sub2_Sub3_9.method291(this.aByte43);
					this.anInt944 = this.aClass6_Sub2_Sub3_9.method290();
					this.anInt928 = this.aClass6_Sub2_Sub3_9.method291(this.aByte43);
					this.anInt997 = this.aClass6_Sub2_Sub3_9.method291(this.aByte43);
					this.anInt1067 = this.aClass6_Sub2_Sub3_9.method289((byte) 1);
					this.anInt1000 = this.aClass6_Sub2_Sub3_9.method291(this.aByte43);
					this.anInt1048 = this.aClass6_Sub2_Sub3_9.method296((byte) 6);
					signlink.dnslookup(Class39.method362(this.anInt1048));
					this.anInt880 = -1;
					return true;
				}
				if (this.anInt880 == 57) {
					local161 = this.aClass6_Sub2_Sub3_9.method265();
					if (local161 != this.anInt1053) {
						this.method603(this.anInt1053);
						this.anInt1053 = local161;
					}
					this.aBoolean282 = true;
					this.anInt880 = -1;
					return true;
				}
				if (this.anInt880 == 118) {
					local161 = this.aClass6_Sub2_Sub3_9.method293();
					local213 = this.aClass6_Sub2_Sub3_9.method292();
					local280 = this.aClass6_Sub2_Sub3_9.method264();
					@Pc(1265) Class44 local1265 = Class44.method496(local280);
					local1265.anInt643 = local161;
					local1265.anInt618 = local213;
					this.anInt880 = -1;
					return true;
				}
				@Pc(1318) int local1318;
				@Pc(1285) long local1285;
				if (this.anInt880 == 73) {
					local1285 = this.aClass6_Sub2_Sub3_9.method268();
					local280 = this.aClass6_Sub2_Sub3_9.method267();
					local284 = this.aClass6_Sub2_Sub3_9.method262();
					local693 = false;
					for (local695 = 0; local695 < 100; local695++) {
						if (this.anIntArray218[local695] == local280) {
							local693 = true;
							break;
						}
					}
					if (local284 <= 1) {
						for (local1318 = 0; local1318 < this.anInt1052; local1318++) {
							if (this.aLongArray3[local1318] == local1285) {
								local693 = true;
								break;
							}
						}
					}
					if (!local693 && this.anInt1068 == 0) {
						try {
							this.anIntArray218[this.anInt1042] = local280;
							this.anInt1042 = (this.anInt1042 + 1) % 100;
							local828 = Class49.method537(this.anInt879 - 13, this.aClass6_Sub2_Sub3_9);
							if (local284 != 3) {
								local828 = Class26.method198(local828);
							}
							if (local284 == 2 || local284 == 3) {
								this.method638("@cr2@" + Class39.method363(Class39.method360(local1285)), 7, local828);
							} else if (local284 == 1) {
								this.method638("@cr1@" + Class39.method363(Class39.method360(local1285)), 7, local828);
							} else {
								this.method638(Class39.method363(Class39.method360(local1285)), 3, local828);
							}
						} catch (@Pc(1428) Exception local1428) {
							signlink.reporterror("cde1");
						}
					}
					this.anInt880 = -1;
					return true;
				}
				if (this.anInt880 == 40) {
					this.aBoolean273 = true;
					this.anInt973 = this.aClass6_Sub2_Sub3_9.method262();
					this.anInt974 = this.aClass6_Sub2_Sub3_9.method262();
					this.anInt975 = this.aClass6_Sub2_Sub3_9.method264();
					this.anInt976 = this.aClass6_Sub2_Sub3_9.method262();
					this.anInt977 = this.aClass6_Sub2_Sub3_9.method262();
					if (this.anInt977 >= 100) {
						local161 = this.anInt973 * 128 + 64;
						local213 = this.anInt974 * 128 + 64;
						local280 = this.method640(local161, this.anInt1074, local213) - this.anInt975;
						local284 = local161 - this.anInt872;
						local288 = local280 - this.anInt873;
						local695 = local213 - this.anInt874;
						local1318 = (int) Math.sqrt((double) (local284 * local284 + local695 * local695));
						this.anInt875 = (int) (Math.atan2((double) local288, (double) local1318) * 325.949D) & 0x7FF;
						this.anInt876 = (int) (Math.atan2((double) local284, (double) local695) * -325.949D) & 0x7FF;
						if (this.anInt875 < 128) {
							this.anInt875 = 128;
						}
						if (this.anInt875 > 383) {
							this.anInt875 = 383;
						}
					}
					this.anInt880 = -1;
					return true;
				}
				if (this.anInt880 == 49) {
					local161 = this.aClass6_Sub2_Sub3_9.method289((byte) 1);
					local213 = this.aClass6_Sub2_Sub3_9.method264();
					this.method631(local213);
					if (local161 != -1) {
						this.method631(local161);
					}
					if (this.anInt994 != -1) {
						this.method603(this.anInt994);
						this.anInt994 = -1;
					}
					if (this.anInt885 != -1) {
						this.method603(this.anInt885);
						this.anInt885 = -1;
					}
					if (this.anInt983 != -1) {
						this.method603(this.anInt983);
						this.anInt983 = -1;
					}
					if (this.anInt924 != local213) {
						this.method603(this.anInt924);
						this.anInt924 = local213;
					}
					if (this.anInt1009 != local213) {
						this.method603(this.anInt1009);
						this.anInt1009 = local161;
					}
					this.anInt923 = 0;
					this.aBoolean267 = false;
					this.anInt880 = -1;
					return true;
				}
				@Pc(1817) int local1817;
				if (this.anInt880 == 121) {
					local1285 = this.aClass6_Sub2_Sub3_9.method268();
					local280 = this.aClass6_Sub2_Sub3_9.method262();
					@Pc(1680) String local1680 = Class39.method363(Class39.method360(local1285));
					for (local288 = 0; local288 < this.anInt926; local288++) {
						if (local1285 == this.aLongArray4[local288]) {
							if (this.anIntArray231[local288] != local280) {
								this.anIntArray231[local288] = local280;
								this.aBoolean279 = true;
								if (local280 > 0) {
									this.method638("", 5, local1680 + " has logged in.");
								}
								if (local280 == 0) {
									this.method638("", 5, local1680 + " has logged out.");
								}
							}
							local1680 = null;
							break;
						}
					}
					if (local1680 != null && this.anInt926 < 200) {
						this.aLongArray4[this.anInt926] = local1285;
						this.aStringArray14[this.anInt926] = local1680;
						this.anIntArray231[this.anInt926] = local280;
						this.anInt926++;
						this.aBoolean279 = true;
					}
					@Pc(1778) boolean local1778 = false;
					while (!local1778) {
						local1778 = true;
						for (local1318 = 0; local1318 < this.anInt926 - 1; local1318++) {
							if (this.anIntArray231[local1318] != anInt892 && this.anIntArray231[local1318 + 1] == anInt892 || this.anIntArray231[local1318] == 0 && this.anIntArray231[local1318 + 1] != 0) {
								local1817 = this.anIntArray231[local1318];
								this.anIntArray231[local1318] = this.anIntArray231[local1318 + 1];
								this.anIntArray231[local1318 + 1] = local1817;
								@Pc(1839) String local1839 = this.aStringArray14[local1318];
								this.aStringArray14[local1318] = this.aStringArray14[local1318 + 1];
								this.aStringArray14[local1318 + 1] = local1839;
								@Pc(1861) long local1861 = this.aLongArray4[local1318];
								this.aLongArray4[local1318] = this.aLongArray4[local1318 + 1];
								this.aLongArray4[local1318 + 1] = local1861;
								this.aBoolean279 = true;
								local1778 = false;
							}
						}
					}
					this.anInt880 = -1;
					return true;
				}
				if (this.anInt880 == 123) {
					this.aBoolean273 = false;
					for (local161 = 0; local161 < 5; local161++) {
						this.aBooleanArray12[local161] = false;
					}
					this.anInt880 = -1;
					return true;
				}
				if (this.anInt880 == 51) {
					this.aBoolean241 = false;
					this.anInt923 = 2;
					this.aString31 = "";
					this.aBoolean282 = true;
					this.anInt880 = -1;
					return true;
				}
				if (this.anInt880 == 26) {
					local161 = this.aClass6_Sub2_Sub3_9.method265();
					if (local161 >= 0) {
						this.method631(local161);
					}
					if (local161 != this.anInt1001) {
						this.method603(this.anInt1001);
						this.anInt1001 = local161;
					}
					this.anInt880 = -1;
					return true;
				}
				if (this.anInt880 == 82) {
					if (this.anInt861 == 12) {
						this.aBoolean279 = true;
					}
					this.anInt1033 = this.aClass6_Sub2_Sub3_9.method265();
					this.anInt880 = -1;
					return true;
				}
				if (this.anInt880 == 237) {
					for (local161 = 0; local161 < this.aClass6_Sub2_Sub1_Sub1_Sub2Array1.length; local161++) {
						if (this.aClass6_Sub2_Sub1_Sub1_Sub2Array1[local161] != null) {
							this.aClass6_Sub2_Sub1_Sub1_Sub2Array1[local161].anInt702 = -1;
						}
					}
					for (local213 = 0; local213 < this.aClass6_Sub2_Sub1_Sub1_Sub1Array1.length; local213++) {
						if (this.aClass6_Sub2_Sub1_Sub1_Sub1Array1[local213] != null) {
							this.aClass6_Sub2_Sub1_Sub1_Sub1Array1[local213].anInt702 = -1;
						}
					}
					this.anInt880 = -1;
					return true;
				}
				if (this.anInt880 == 181) {
					this.method681(this.anInt879, this.aClass6_Sub2_Sub3_9);
					this.aBoolean261 = false;
					this.anInt880 = -1;
					return true;
				}
				if (this.anInt880 == 128) {
					this.anInt927 = this.aClass6_Sub2_Sub3_9.method262();
					this.aBoolean279 = true;
					this.anInt880 = -1;
					return true;
				}
				if (this.anInt880 == 69) {
					this.anInt915 = this.aClass6_Sub2_Sub3_9.method282(this.anInt1043);
					this.anInt916 = this.aClass6_Sub2_Sub3_9.method282(this.anInt1043);
					for (local161 = this.anInt915; local161 < this.anInt915 + 8; local161++) {
						for (local213 = this.anInt916; local213 < this.anInt916 + 8; local213++) {
							if (this.aClass13ArrayArrayArray1[this.anInt1074][local161][local213] != null) {
								this.aClass13ArrayArrayArray1[this.anInt1074][local161][local213] = null;
								this.method667(local161, local213);
							}
						}
					}
					for (@Pc(2153) Class6_Sub1 local2153 = (Class6_Sub1) this.aClass13_10.method113(); local2153 != null; local2153 = (Class6_Sub1) this.aClass13_10.method115()) {
						if (local2153.anInt34 >= this.anInt915 && local2153.anInt34 < this.anInt915 + 8 && local2153.anInt35 >= this.anInt916 && local2153.anInt35 < this.anInt916 + 8 && local2153.anInt32 == this.anInt1074) {
							local2153.anInt40 = 0;
						}
					}
					this.anInt880 = -1;
					return true;
				}
				if (this.anInt880 == 91) {
					local161 = this.aClass6_Sub2_Sub3_9.method291(this.aByte43);
					local274 = Class44.method496(local161);
					for (local280 = 0; local280 < local274.anIntArray173.length; local280++) {
						local274.anIntArray173[local280] = -1;
						local274.anIntArray173[local280] = 0;
					}
					this.anInt880 = -1;
					return true;
				}
				if (this.anInt880 == 126) {
					local161 = this.aClass6_Sub2_Sub3_9.method264();
					local213 = this.aClass6_Sub2_Sub3_9.method262();
					local280 = this.aClass6_Sub2_Sub3_9.method264();
					if (local280 == 65535) {
						if (this.anInt1029 < 50) {
							this.anIntArray228[this.anInt1029] = (short) local161;
							this.anIntArray261[this.anInt1029] = local213;
							this.anIntArray249[this.anInt1029] = 0;
							this.anInt1029++;
						}
					} else if (this.aBoolean247 && !aBoolean252 && this.anInt1029 < 50) {
						this.anIntArray228[this.anInt1029] = local161;
						this.anIntArray261[this.anInt1029] = local213;
						this.anIntArray249[this.anInt1029] = local280 + Class23.anIntArray113[local161];
						this.anInt1029++;
					}
					this.anInt880 = -1;
					return true;
				}
				if (this.anInt880 == 81) {
					this.aBoolean241 = false;
					this.anInt923 = 1;
					this.aString31 = "";
					this.aBoolean282 = true;
					this.anInt880 = -1;
					return true;
				}
				if (this.anInt880 == 120) {
					this.aBoolean279 = true;
					local161 = this.aClass6_Sub2_Sub3_9.method264();
					local274 = Class44.method496(local161);
					local280 = this.aClass6_Sub2_Sub3_9.method264();
					for (local284 = 0; local284 < local280; local284++) {
						local288 = this.aClass6_Sub2_Sub3_9.method281();
						if (local288 == 255) {
							local288 = this.aClass6_Sub2_Sub3_9.method298();
						}
						local274.anIntArray173[local284] = this.aClass6_Sub2_Sub3_9.method289((byte) 1);
						local274.anIntArray179[local284] = local288;
					}
					for (local288 = local280; local288 < local274.anIntArray173.length; local288++) {
						local274.anIntArray173[local288] = 0;
						local274.anIntArray179[local288] = 0;
					}
					this.anInt880 = -1;
					return true;
				}
				if (this.anInt880 == 198) {
					local161 = this.aClass6_Sub2_Sub3_9.method290();
					local213 = this.aClass6_Sub2_Sub3_9.method297();
					this.anIntArray251[local161] = local213;
					if (this.anIntArray260[local161] != local213) {
						this.anIntArray260[local161] = local213;
						this.method720(local161);
						this.aBoolean279 = true;
						if (this.anInt1053 != -1) {
							this.aBoolean282 = true;
						}
					}
					this.anInt880 = -1;
					return true;
				}
				if (this.anInt880 == 212) {
					local161 = this.aClass6_Sub2_Sub3_9.method264();
					local688 = this.aClass6_Sub2_Sub3_9.method269();
					Class44.method496(local161).aString14 = local688;
					@Pc(2501) int local2501 = this.anIntArray256[this.anInt861];
					if (Class44.method496(local161).anInt644 == local2501) {
						this.aBoolean279 = true;
					}
					this.anInt880 = -1;
					return true;
				}
				if (this.anInt880 == 238) {
					local161 = this.aClass6_Sub2_Sub3_9.method262();
					local213 = this.aClass6_Sub2_Sub3_9.method262();
					local280 = this.aClass6_Sub2_Sub3_9.method262();
					local284 = this.aClass6_Sub2_Sub3_9.method262();
					this.aBooleanArray12[local161] = true;
					this.anIntArray270[local161] = local213;
					this.anIntArray232[local161] = local280;
					this.anIntArray253[local161] = local284;
					this.anIntArray269[local161] = 0;
					this.anInt880 = -1;
					return true;
				}
				if (this.anInt880 == 131) {
					this.method682(this.aClass6_Sub2_Sub3_9, this.anInt879);
					this.anInt880 = -1;
					return true;
				}
				if (this.anInt880 == 75) {
					this.anInt847 = this.aClass6_Sub2_Sub3_9.method290() * 30;
					this.anInt880 = -1;
					return true;
				}
				if (this.anInt880 != 61 && this.anInt880 != 37) {
					if (this.anInt880 == 76) {
						local161 = this.aClass6_Sub2_Sub3_9.method289((byte) 1);
						local213 = this.aClass6_Sub2_Sub3_9.method289((byte) 1);
						local280 = this.aClass6_Sub2_Sub3_9.method289((byte) 1);
						if (local280 == 65535) {
							Class44.method496(local161).anInt613 = 0;
							this.anInt880 = -1;
							return true;
						}
						@Pc(3499) Class43 local3499 = Class43.method464(local280);
						Class44.method496(local161).anInt613 = 4;
						Class44.method496(local161).anInt614 = local280;
						Class44.method496(local161).anInt620 = local3499.anInt559;
						Class44.method496(local161).anInt621 = local3499.anInt563;
						Class44.method496(local161).anInt619 = local3499.anInt586 * 100 / local213;
						this.anInt880 = -1;
						return true;
					}
					if (this.anInt880 != 58) {
						if (this.anInt880 == 4) {
							local161 = this.aClass6_Sub2_Sub3_9.method289((byte) 1);
							local213 = this.aClass6_Sub2_Sub3_9.method290();
							Class44.method496(local161).anInt613 = 1;
							Class44.method496(local161).anInt614 = local213;
							this.anInt880 = -1;
							return true;
						}
						@Pc(3676) Class44 local3676;
						if (this.anInt880 == 204) {
							local161 = this.aClass6_Sub2_Sub3_9.method289((byte) 1);
							local213 = this.aClass6_Sub2_Sub3_9.method293();
							local3676 = Class44.method496(local161);
							if (local3676.anInt623 != local213 || local213 == -1) {
								local3676.anInt623 = local213;
								local3676.anInt629 = 0;
								local3676.anInt611 = 0;
							}
							this.anInt880 = -1;
							return true;
						}
						if (this.anInt880 == 112 || this.anInt880 == 41 || this.anInt880 == 172 || this.anInt880 == 220 || this.anInt880 == 87 || this.anInt880 == 219 || this.anInt880 == 13 || this.anInt880 == 226 || this.anInt880 == 221 || this.anInt880 == 134 || this.anInt880 == 105) {
							this.method606(this.aClass6_Sub2_Sub3_9, this.anInt880);
							this.anInt880 = -1;
							return true;
						}
						if (this.anInt880 == 29) {
							local161 = this.aClass6_Sub2_Sub3_9.method289((byte) 1);
							Class44.method496(local161).anInt613 = 3;
							if (aClass6_Sub2_Sub1_Sub1_Sub2_1.aClass2_2 == null) {
								Class44.method496(local161).anInt614 = (aClass6_Sub2_Sub1_Sub1_Sub2_1.anIntArray188[0] << 25) + (aClass6_Sub2_Sub1_Sub1_Sub2_1.anIntArray188[4] << 20) + (aClass6_Sub2_Sub1_Sub1_Sub2_1.anIntArray187[0] << 15) + (aClass6_Sub2_Sub1_Sub1_Sub2_1.anIntArray187[8] << 10) + (aClass6_Sub2_Sub1_Sub1_Sub2_1.anIntArray187[11] << 5) + aClass6_Sub2_Sub1_Sub1_Sub2_1.anIntArray187[1];
							} else {
								Class44.method496(local161).anInt614 = (int) (aClass6_Sub2_Sub1_Sub1_Sub2_1.aClass2_2.aLong1 + 305419896L);
							}
							this.anInt880 = -1;
							return true;
						}
						if (this.anInt880 == 166) {
							for (local161 = 0; local161 < this.anIntArray260.length; local161++) {
								if (this.anIntArray260[local161] != this.anIntArray251[local161]) {
									this.anIntArray260[local161] = this.anIntArray251[local161];
									this.method720(local161);
									this.aBoolean279 = true;
								}
							}
							this.anInt880 = -1;
							return true;
						}
						if (this.anInt880 == 3) {
							local161 = this.aClass6_Sub2_Sub3_9.method282(this.anInt1043);
							local213 = this.aClass6_Sub2_Sub3_9.method264();
							if (local213 == 65535) {
								local213 = -1;
							}
							if (this.anIntArray256[local161] != local213) {
								this.method603(this.anIntArray256[local161]);
								this.anIntArray256[local161] = local213;
							}
							this.aBoolean279 = true;
							this.aBoolean255 = true;
							this.anInt880 = -1;
							return true;
						}
						if (this.anInt880 == 33) {
							local161 = this.aClass6_Sub2_Sub3_9.method291(this.aByte43);
							local213 = this.aClass6_Sub2_Sub3_9.method289((byte) 1);
							local280 = this.aClass6_Sub2_Sub3_9.method289((byte) 1);
							Class44.method496(local161).anInt647 = (local213 << 16) + local280;
							this.anInt880 = -1;
							return true;
						}
						if (this.anInt880 == 89) {
							this.anInt939 = this.aClass6_Sub2_Sub3_9.method262();
							this.anInt880 = -1;
							return true;
						}
						if (this.anInt880 == 122) {
							this.anInt1014 = 0;
							this.anInt880 = -1;
							return true;
						}
						if (this.anInt880 == 255) {
							local161 = this.aClass6_Sub2_Sub3_9.method290();
							this.method631(local161);
							if (this.anInt885 != -1) {
								this.method603(this.anInt885);
								this.anInt885 = -1;
								this.aBoolean279 = true;
								this.aBoolean255 = true;
							}
							if (this.anInt983 != -1) {
								this.method603(this.anInt983);
								this.anInt983 = -1;
								this.aBoolean282 = true;
							}
							if (this.anInt924 != -1) {
								this.method603(this.anInt924);
								this.anInt924 = -1;
								this.aBoolean243 = true;
							}
							if (this.anInt1009 != -1) {
								this.method603(this.anInt1009);
								this.anInt1009 = -1;
							}
							if (this.anInt994 != local161) {
								this.method603(this.anInt994);
								this.anInt994 = local161;
							}
							if (this.anInt923 != 0) {
								this.anInt923 = 0;
								this.aBoolean282 = true;
							}
							this.aBoolean267 = false;
							this.anInt880 = -1;
							return true;
						}
						if (this.anInt880 == 153) {
							this.method594();
							this.anInt880 = -1;
							return false;
						}
						if (this.anInt880 == 10) {
							local161 = this.aClass6_Sub2_Sub3_9.method289((byte) 1);
							this.method631(local161);
							if (this.anInt885 != -1) {
								this.method603(this.anInt885);
								this.anInt885 = -1;
								this.aBoolean279 = true;
								this.aBoolean255 = true;
							}
							if (this.anInt924 != -1) {
								this.method603(this.anInt924);
								this.anInt924 = -1;
								this.aBoolean243 = true;
							}
							if (this.anInt1009 != -1) {
								this.method603(this.anInt1009);
								this.anInt1009 = -1;
							}
							if (this.anInt994 != -1) {
								this.method603(this.anInt994);
								this.anInt994 = -1;
							}
							if (this.anInt983 != local161) {
								this.method603(this.anInt983);
								this.anInt983 = local161;
							}
							this.aBoolean267 = false;
							this.aBoolean282 = true;
							this.anInt880 = -1;
							return true;
						}
						if (this.anInt880 == 32) {
							local161 = this.aClass6_Sub2_Sub3_9.method264();
							@Pc(4201) boolean local4201 = this.aClass6_Sub2_Sub3_9.method262() == 1;
							Class44.method496(local161).aBoolean189 = local4201;
							this.anInt880 = -1;
							return true;
						}
						if (this.anInt880 == 234) {
							local161 = this.aClass6_Sub2_Sub3_9.method289((byte) 1);
							local213 = this.aClass6_Sub2_Sub3_9.method291(this.aByte43);
							local3676 = Class44.method496(local161);
							if (local3676 != null && local3676.anInt649 == 0) {
								if (local213 < 0) {
									local213 = 0;
								}
								if (local213 > local3676.anInt646 - local3676.anInt645) {
									local213 = local3676.anInt646 - local3676.anInt645;
								}
								local3676.anInt622 = local213;
							}
							this.anInt880 = -1;
							return true;
						}
						if (this.anInt880 == 213) {
							local161 = this.aClass6_Sub2_Sub3_9.method289((byte) 1);
							local213 = this.aClass6_Sub2_Sub3_9.method264();
							local280 = local161 >> 10 & 0x1F;
							local284 = local161 >> 5 & 0x1F;
							local288 = local161 & 0x1F;
							Class44.method496(local213).anInt637 = (local280 << 19) + (local284 << 11) + (local288 << 3);
							this.anInt880 = -1;
							return true;
						}
						if (this.anInt880 == 66) {
							@Pc(4315) byte local4315 = this.aClass6_Sub2_Sub3_9.method284();
							local213 = this.aClass6_Sub2_Sub3_9.method290();
							this.anIntArray251[local213] = local4315;
							if (this.anIntArray260[local213] != local4315) {
								this.anIntArray260[local213] = local4315;
								this.method720(local213);
								this.aBoolean279 = true;
								if (this.anInt1053 != -1) {
									this.aBoolean282 = true;
								}
							}
							this.anInt880 = -1;
							return true;
						}
						if (this.anInt880 == 244) {
							local677 = this.aClass6_Sub2_Sub3_9.method269();
							local213 = this.aClass6_Sub2_Sub3_9.method282(this.anInt1043);
							local280 = this.aClass6_Sub2_Sub3_9.method281();
							if (local213 >= 1 && local213 <= 5) {
								if (local677.equalsIgnoreCase("null")) {
									local677 = null;
								}
								this.aStringArray11[local213 - 1] = local677;
								this.aBooleanArray11[local213 - 1] = local280 == 0;
							}
							this.anInt880 = -1;
							return true;
						}
						if (this.anInt880 == 141) {
							this.aBoolean279 = true;
							local161 = this.aClass6_Sub2_Sub3_9.method280();
							local213 = this.aClass6_Sub2_Sub3_9.method296((byte) 6);
							local280 = this.aClass6_Sub2_Sub3_9.method280();
							this.anIntArray235[local161] = local213;
							this.anIntArray254[local161] = local280;
							this.anIntArray236[local161] = 1;
							for (local284 = 0; local284 < 98; local284++) {
								if (local213 >= anIntArray262[local284]) {
									this.anIntArray236[local161] = local284 + 2;
								}
							}
							this.anInt880 = -1;
							return true;
						}
						if (this.anInt880 == 63) {
							local161 = this.aClass6_Sub2_Sub3_9.method264();
							local213 = this.aClass6_Sub2_Sub3_9.method290();
							Class44.method496(local161).anInt613 = 2;
							Class44.method496(local161).anInt614 = local213;
							this.anInt880 = -1;
							return true;
						}
						signlink.reporterror("T1 - " + this.anInt880 + "," + this.anInt879 + " - " + this.anInt906 + "," + this.anInt907);
						this.method594();
						return true;
					}
					local161 = this.aClass6_Sub2_Sub3_9.method264();
					local213 = this.aClass6_Sub2_Sub3_9.method264();
					if (this.anInt983 != -1) {
						this.method603(this.anInt983);
						this.anInt983 = -1;
						this.aBoolean282 = true;
					}
					if (this.anInt924 != -1) {
						this.method603(this.anInt924);
						this.anInt924 = -1;
						this.aBoolean243 = true;
					}
					if (this.anInt1009 != -1) {
						this.method603(this.anInt1009);
						this.anInt1009 = -1;
					}
					if (this.anInt994 != local161) {
						this.method603(this.anInt994);
						this.anInt994 = local161;
					}
					if (this.anInt885 != local213) {
						this.method603(this.anInt885);
						this.anInt885 = local213;
					}
					if (this.anInt923 != 0) {
						this.anInt923 = 0;
						this.aBoolean282 = true;
					}
					this.aBoolean279 = true;
					this.aBoolean255 = true;
					this.aBoolean267 = false;
					this.anInt880 = -1;
					return true;
				}
				local161 = this.anInt949;
				local213 = this.anInt950;
				if (this.anInt880 == 61) {
					local161 = this.aClass6_Sub2_Sub3_9.method264();
					local213 = this.aClass6_Sub2_Sub3_9.method264();
					this.aBoolean246 = false;
				}
				if (this.anInt880 == 37) {
					local213 = this.aClass6_Sub2_Sub3_9.method289((byte) 1);
					local161 = this.aClass6_Sub2_Sub3_9.method290();
					this.aClass6_Sub2_Sub3_9.method272();
					local280 = 0;
					while (true) {
						if (local280 >= 4) {
							this.aClass6_Sub2_Sub3_9.method274(this.anInt902);
							this.aBoolean246 = true;
							break;
						}
						for (local284 = 0; local284 < 13; local284++) {
							for (local288 = 0; local288 < 13; local288++) {
								local695 = this.aClass6_Sub2_Sub3_9.method273(739, 1);
								if (local695 == 1) {
									this.anIntArrayArrayArray7[local280][local284][local288] = this.aClass6_Sub2_Sub3_9.method273(739, 26);
								} else {
									this.anIntArrayArrayArray7[local280][local284][local288] = -1;
								}
							}
						}
						local280++;
					}
				}
				if (this.anInt949 == local161 && this.anInt950 == local213 && this.anInt1018 == 2) {
					this.anInt880 = -1;
					return true;
				}
				this.anInt949 = local161;
				this.anInt950 = local213;
				this.anInt945 = (this.anInt949 - 6) * 8;
				this.anInt946 = (this.anInt950 - 6) * 8;
				this.aBoolean259 = false;
				if ((this.anInt949 / 8 == 48 || this.anInt949 / 8 == 49) && this.anInt950 / 8 == 48) {
					this.aBoolean259 = true;
				}
				if (this.anInt949 / 8 == 48 && this.anInt950 / 8 == 148) {
					this.aBoolean259 = true;
				}
				this.anInt1018 = 1;
				this.aLong33 = System.currentTimeMillis();
				this.method595(null, "Loading - please wait.");
				if (this.anInt880 == 61) {
					local280 = 0;
					local284 = (this.anInt949 - 6) / 8;
					label1207: while (true) {
						if (local284 > (this.anInt949 + 6) / 8) {
							this.aByteArrayArray5 = new byte[local280][];
							this.aByteArrayArray6 = new byte[local280][];
							this.anIntArray237 = new int[local280];
							this.anIntArray238 = new int[local280];
							this.anIntArray239 = new int[local280];
							local280 = 0;
							local288 = (this.anInt949 - 6) / 8;
							while (true) {
								if (local288 > (this.anInt949 + 6) / 8) {
									break label1207;
								}
								for (local695 = (this.anInt950 - 6) / 8; local695 <= (this.anInt950 + 6) / 8; local695++) {
									this.anIntArray237[local280] = (local288 << 8) + local695;
									if (this.aBoolean259 && (local695 == 49 || local695 == 149 || local695 == 147 || local288 == 50 || local288 == 49 && local695 == 47)) {
										this.anIntArray238[local280] = -1;
										this.anIntArray239[local280] = -1;
										local280++;
									} else {
										local1318 = this.anIntArray238[local280] = this.aClass25_Sub1_1.method232(0, local695, local288);
										if (local1318 != -1) {
											this.aClass25_Sub1_1.method228(3, local1318);
										}
										local1817 = this.anIntArray239[local280] = this.aClass25_Sub1_1.method232(1, local695, local288);
										if (local1817 != -1) {
											this.aClass25_Sub1_1.method228(3, local1817);
										}
										local280++;
									}
								}
								local288++;
							}
						}
						for (local288 = (this.anInt950 - 6) / 8; local288 <= (this.anInt950 + 6) / 8; local288++) {
							local280++;
						}
						local284++;
					}
				}
				if (this.anInt880 == 37) {
					local280 = 0;
					@Pc(2990) int[] local2990 = new int[676];
					local288 = 0;
					label1166: while (true) {
						@Pc(3020) int local3020;
						@Pc(3026) int local3026;
						@Pc(3036) int local3036;
						if (local288 >= 4) {
							this.aByteArrayArray5 = new byte[local280][];
							this.aByteArrayArray6 = new byte[local280][];
							this.anIntArray237 = new int[local280];
							this.anIntArray238 = new int[local280];
							this.anIntArray239 = new int[local280];
							local695 = 0;
							while (true) {
								if (local695 >= local280) {
									break label1166;
								}
								local1318 = this.anIntArray237[local695] = local2990[local695];
								local1817 = local1318 >> 8 & 0xFF;
								local3020 = local1318 & 0xFF;
								local3026 = this.anIntArray238[local695] = this.aClass25_Sub1_1.method232(0, local3020, local1817);
								if (local3026 != -1) {
									this.aClass25_Sub1_1.method228(3, local3026);
								}
								local3036 = this.anIntArray239[local695] = this.aClass25_Sub1_1.method232(1, local3020, local1817);
								if (local3036 != -1) {
									this.aClass25_Sub1_1.method228(3, local3036);
								}
								local695++;
							}
						}
						for (local695 = 0; local695 < 13; local695++) {
							for (local1318 = 0; local1318 < 13; local1318++) {
								local1817 = this.anIntArrayArrayArray7[local288][local695][local1318];
								if (local1817 != -1) {
									local3020 = local1817 >> 14 & 0x3FF;
									local3026 = local1817 >> 3 & 0x7FF;
									local3036 = (local3020 / 8 << 8) + local3026 / 8;
									for (@Pc(3038) int local3038 = 0; local3038 < local280; local3038++) {
										if (local2990[local3038] == local3036) {
											local3036 = -1;
											break;
										}
									}
									if (local3036 != -1) {
										local2990[local280++] = local3036;
									}
								}
							}
						}
						local288++;
					}
				}
				local280 = this.anInt945 - this.anInt947;
				local284 = this.anInt946 - this.anInt948;
				this.anInt947 = this.anInt945;
				this.anInt948 = this.anInt946;
				for (local288 = 0; local288 < 16384; local288++) {
					@Pc(3191) Class6_Sub2_Sub1_Sub1_Sub1 local3191 = this.aClass6_Sub2_Sub1_Sub1_Sub1Array1[local288];
					if (local3191 != null) {
						for (local1318 = 0; local1318 < 10; local1318++) {
							local3191.anIntArray182[local1318] -= local280;
							local3191.anIntArray183[local1318] -= local284;
						}
						local3191.anInt699 -= local280 * 128;
						local3191.anInt700 -= local284 * 128;
					}
				}
				for (local695 = 0; local695 < this.anInt1022; local695++) {
					@Pc(3246) Class6_Sub2_Sub1_Sub1_Sub2 local3246 = this.aClass6_Sub2_Sub1_Sub1_Sub2Array1[local695];
					if (local3246 != null) {
						for (local1817 = 0; local1817 < 10; local1817++) {
							local3246.anIntArray182[local1817] -= local280;
							local3246.anIntArray183[local1817] -= local284;
						}
						local3246.anInt699 -= local280 * 128;
						local3246.anInt700 -= local284 * 128;
					}
				}
				this.aBoolean261 = true;
				@Pc(3298) byte local3298 = 0;
				@Pc(3300) byte local3300 = 104;
				@Pc(3302) byte local3302 = 1;
				if (local280 < 0) {
					local3298 = 103;
					local3300 = -1;
					local3302 = -1;
				}
				@Pc(3312) byte local3312 = 0;
				@Pc(3314) byte local3314 = 104;
				@Pc(3316) byte local3316 = 1;
				if (local284 < 0) {
					local3312 = 103;
					local3314 = -1;
					local3316 = -1;
				}
				for (@Pc(3326) int local3326 = local3298; local3326 != local3300; local3326 += local3302) {
					for (@Pc(3330) int local3330 = local3312; local3330 != local3314; local3330 += local3316) {
						@Pc(3336) int local3336 = local3326 + local280;
						@Pc(3340) int local3340 = local3330 + local284;
						for (@Pc(3342) int local3342 = 0; local3342 < 4; local3342++) {
							if (local3336 >= 0 && local3340 >= 0 && local3336 < 104 && local3340 < 104) {
								this.aClass13ArrayArrayArray1[local3342][local3326][local3330] = this.aClass13ArrayArrayArray1[local3342][local3336][local3340];
							} else {
								this.aClass13ArrayArrayArray1[local3342][local3326][local3330] = null;
							}
						}
					}
				}
				for (@Pc(3404) Class6_Sub1 local3404 = (Class6_Sub1) this.aClass13_10.method113(); local3404 != null; local3404 = (Class6_Sub1) this.aClass13_10.method115()) {
					local3404.anInt34 -= local280;
					local3404.anInt35 -= local284;
					if (local3404.anInt34 < 0 || local3404.anInt35 < 0 || local3404.anInt34 >= 104 || local3404.anInt35 >= 104) {
						local3404.method545();
					}
				}
				if (this.anInt1014 != 0) {
					this.anInt1014 -= local280;
					this.anInt1015 -= local284;
				}
				this.aBoolean273 = false;
				this.anInt880 = -1;
				return true;
			} catch (@Pc(4526) IOException local4526) {
				this.method590();
			} catch (@Pc(4531) Exception local4531) {
				local677 = "T2 - " + this.anInt880 + "," + this.anInt906 + "," + this.anInt907 + " - " + this.anInt879 + "," + (this.anInt945 + aClass6_Sub2_Sub1_Sub1_Sub2_1.anIntArray182[0]) + "," + (this.anInt946 + aClass6_Sub2_Sub1_Sub1_Sub2_1.anIntArray183[0]) + " - ";
				for (local213 = 0; local213 < this.anInt879 && local213 < 50; local213++) {
					local677 = local677 + this.aClass6_Sub2_Sub3_9.aByteArray9[local213] + ",";
				}
				signlink.reporterror(local677);
				this.method594();
			}
			return true;
		} catch (@Pc(4612) RuntimeException local4612) {
			signlink.reporterror("32438, " + 0 + ", " + local4612.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Z)V")
	private void method599() {
		try {
			this.aBoolean266 &= true;
			if (this.anInt933 >= 2 || this.anInt894 != 0 || this.anInt1038 != 0) {
				@Pc(37) String local37;
				if (this.anInt894 == 1 && this.anInt933 < 2) {
					local37 = "Use " + this.aString20 + " with...";
				} else if (this.anInt1038 == 1 && this.anInt933 < 2) {
					local37 = this.aString27 + "...";
				} else {
					local37 = this.aStringArray13[this.anInt933 - 1];
				}
				if (this.anInt933 > 2) {
					local37 = local37 + "@whi@ / " + (this.anInt933 - 2) + " more options";
				}
				this.aClass6_Sub2_Sub2_Sub2_4.method389(15, 16777215, local37, anInt1077 / 1000, 4);
			}
		} catch (@Pc(101) RuntimeException local101) {
			signlink.reporterror("38071, " + true + ", " + local101.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IZI)V")
	private void method600(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1) {
		try {
			signlink.anInt1086 = arg1;
			if (arg0) {
				signlink.midi = "voladjust";
			}
		} catch (@Pc(13) RuntimeException local13) {
			signlink.reporterror("49244, " + 19751 + ", " + arg0 + ", " + arg1 + ", " + local13.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "j", descriptor = "(I)V")
	private void method601() {
		try {
			if (this.anInt1064 != -39100) {
				this.aBoolean269 = !this.aBoolean269;
			}
			for (@Pc(18) Class6_Sub1 local18 = (Class6_Sub1) this.aClass13_10.method113(); local18 != null; local18 = (Class6_Sub1) this.aClass13_10.method115()) {
				if (local18.anInt40 == -1) {
					local18.anInt36 = 0;
					this.method703(local18);
				} else {
					local18.method545();
				}
			}
		} catch (@Pc(45) RuntimeException local45) {
			signlink.reporterror("10922, " + -39100 + ", " + local45.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!XVMRCEYW;IIZI)V")
	private void method602(@OriginalArg(0) Class6_Sub2_Sub1_Sub1_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		try {
			if (arg0 != aClass6_Sub2_Sub1_Sub1_Sub2_1 && this.anInt933 < 400) {
				@Pc(39) String local39;
				if (arg0.anInt735 == 0) {
					local39 = arg0.aString16 + method607(arg0.anInt737, aClass6_Sub2_Sub1_Sub1_Sub2_1.anInt737) + " (level-" + arg0.anInt737 + ")";
				} else {
					local39 = arg0.aString16 + " (skill-" + arg0.anInt735 + ")";
				}
				@Pc(169) int local169;
				if (this.anInt894 == 1) {
					this.aStringArray13[this.anInt933] = "Use " + this.aString20 + " with @whi@" + local39;
					this.anIntArray274[this.anInt933] = 600;
					this.anIntArray275[this.anInt933] = arg1;
					this.anIntArray272[this.anInt933] = arg3;
					this.anIntArray273[this.anInt933] = arg2;
					this.anInt933++;
				} else if (this.anInt1038 != 1) {
					for (local169 = 4; local169 >= 0; local169--) {
						if (this.aStringArray11[local169] != null) {
							this.aStringArray13[this.anInt933] = this.aStringArray11[local169] + " @whi@" + local39;
							@Pc(196) short local196 = 0;
							if (this.aStringArray11[local169].equalsIgnoreCase("attack")) {
								if (arg0.anInt737 > aClass6_Sub2_Sub1_Sub1_Sub2_1.anInt737) {
									local196 = 2000;
								}
								if (aClass6_Sub2_Sub1_Sub1_Sub2_1.anInt740 != 0 && arg0.anInt740 != 0) {
									if (aClass6_Sub2_Sub1_Sub1_Sub2_1.anInt740 == arg0.anInt740) {
										local196 = 2000;
									} else {
										local196 = 0;
									}
								}
							} else if (this.aBooleanArray11[local169]) {
								local196 = 2000;
							}
							if (local169 == 0) {
								this.anIntArray274[this.anInt933] = local196 + 665;
							}
							if (local169 == 1) {
								this.anIntArray274[this.anInt933] = local196 + 741;
							}
							if (local169 == 2) {
								this.anIntArray274[this.anInt933] = local196 + 870;
							}
							if (local169 == 3) {
								this.anIntArray274[this.anInt933] = local196 + 711;
							}
							if (local169 == 4) {
								this.anIntArray274[this.anInt933] = local196 + 9;
							}
							this.anIntArray275[this.anInt933] = arg1;
							this.anIntArray272[this.anInt933] = arg3;
							this.anIntArray273[this.anInt933] = arg2;
							this.anInt933++;
						}
					}
				} else if ((this.anInt1040 & 0x8) == 8) {
					this.aStringArray13[this.anInt933] = this.aString27 + " @whi@" + local39;
					this.anIntArray274[this.anInt933] = 347;
					this.anIntArray275[this.anInt933] = arg1;
					this.anIntArray272[this.anInt933] = arg3;
					this.anIntArray273[this.anInt933] = arg2;
					this.anInt933++;
				}
				for (local169 = 0; local169 < this.anInt933; local169++) {
					if (this.anIntArray274[local169] == 1) {
						this.aStringArray13[local169] = "Walk here @whi@" + local39;
						return;
					}
				}
			}
		} catch (@Pc(346) RuntimeException local346) {
			signlink.reporterror("76679, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + true + ", " + arg3 + ", " + local346.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ZI)V")
	private void method603(@OriginalArg(1) int arg0) {
		try {
			Class44.method498(arg0);
		} catch (@Pc(12) RuntimeException local12) {
			signlink.reporterror("92562, " + false + ", " + arg0 + ", " + local12.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IJ)V")
	private void method604(@OriginalArg(1) long arg0) {
		try {
			if (arg0 != 0L) {
				for (@Pc(16) int local16 = 0; local16 < this.anInt926; local16++) {
					if (this.aLongArray4[local16] == arg0) {
						this.anInt926--;
						this.aBoolean279 = true;
						for (@Pc(36) int local36 = local16; local36 < this.anInt926; local36++) {
							this.aStringArray14[local36] = this.aStringArray14[local36 + 1];
							this.anIntArray231[local36] = this.anIntArray231[local36 + 1];
							this.aLongArray4[local36] = this.aLongArray4[local36 + 1];
						}
						this.aClass6_Sub2_Sub3_8.method251(112);
						this.aClass6_Sub2_Sub3_8.method258(arg0);
						return;
					}
				}
			}
		} catch (@Pc(91) RuntimeException local91) {
			signlink.reporterror("54318, " + 3 + ", " + arg0 + ", " + local91.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(B)V")
	private void method605(@OriginalArg(0) byte arg0) {
		try {
			if (this.aClass8_9 == null) {
				this.method648();
				super.aClass8_2 = null;
				this.aClass8_10 = null;
				this.aClass8_11 = null;
				this.aClass8_12 = null;
				this.aClass8_13 = null;
				this.aClass8_14 = null;
				this.aClass8_15 = null;
				this.aClass8_16 = null;
				this.aClass8_17 = null;
				this.aClass8_18 = null;
				this.aClass8_9 = new Class8(96, 479, this.method586(), (byte) 0);
				this.aClass8_7 = new Class8(156, 172, this.method586(), (byte) 0);
				Class6_Sub2_Sub2.method550();
				this.aClass6_Sub2_Sub2_Sub3_16.method488(0, 0);
				this.aClass8_6 = new Class8(261, 190, this.method586(), (byte) 0);
				this.aClass8_8 = new Class8(334, 512, this.method586(), (byte) 0);
				Class6_Sub2_Sub2.method550();
				this.aClass8_3 = new Class8(50, 496, this.method586(), (byte) 0);
				this.aClass8_4 = new Class8(37, 269, this.method586(), (byte) 0);
				this.aClass8_5 = new Class8(45, 249, this.method586(), (byte) 0);
				@Pc(128) boolean local128 = false;
				this.aBoolean243 = true;
				this.aClass8_8.method58();
				Class6_Sub2_Sub2_Sub4.anIntArray206 = this.anIntArray267;
			}
		} catch (@Pc(143) RuntimeException local143) {
			signlink.reporterror("61065, " + arg0 + ", " + local143.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILclient!NQUAUMDT;I)V")
	private void method606(@OriginalArg(1) Class6_Sub2_Sub3 arg0, @OriginalArg(2) int arg1) {
		try {
			this.anInt879 += 0;
			@Pc(14) int local14;
			@Pc(23) int local23;
			@Pc(30) int local30;
			@Pc(39) int local39;
			@Pc(43) int local43;
			@Pc(47) int local47;
			@Pc(52) int local52;
			@Pc(72) int local72;
			@Pc(110) int local110;
			@Pc(130) int local130;
			@Pc(35) int local35;
			@Pc(84) int local84;
			@Pc(98) int local98;
			if (arg1 == 221) {
				local14 = arg0.method280();
				local23 = this.anInt915 + (local14 >> 4 & 0x7);
				local30 = this.anInt916 + (local14 & 0x7);
				local35 = arg0.method291(this.aByte43);
				local39 = arg0.method280();
				local43 = local39 >> 2;
				local47 = local39 & 0x3;
				local52 = this.anIntArray221[local43];
				if (local23 >= 0 && local30 >= 0 && local23 < 103 && local30 < 103) {
					local72 = this.anIntArrayArrayArray8[this.anInt1074][local23][local30];
					local84 = this.anIntArrayArrayArray8[this.anInt1074][local23 + 1][local30];
					local98 = this.anIntArrayArrayArray8[this.anInt1074][local23 + 1][local30 + 1];
					local110 = this.anIntArrayArrayArray8[this.anInt1074][local23][local30 + 1];
					if (local52 == 0) {
						@Pc(121) Class35 local121 = this.aClass41_1.method424(local30, local23, this.anInt1074);
						if (local121 != null) {
							local130 = local121.anInt468 >> 14 & 0x7FFF;
							if (local43 == 2) {
								local121.aClass6_Sub2_Sub1_6 = new Class6_Sub2_Sub1_Sub2(local130, local72, 2, local110, local84, local98, local47 + 4, false, -126, local35);
								local121.aClass6_Sub2_Sub1_7 = new Class6_Sub2_Sub1_Sub2(local130, local72, 2, local110, local84, local98, local47 + 1 & 0x3, false, -126, local35);
							} else {
								local121.aClass6_Sub2_Sub1_6 = new Class6_Sub2_Sub1_Sub2(local130, local72, local43, local110, local84, local98, local47, false, -126, local35);
							}
						}
					}
					if (local52 == 1) {
						@Pc(198) Class16 local198 = this.aClass41_1.method425(local30, local23, this.anInt1074);
						if (local198 != null) {
							local198.aClass6_Sub2_Sub1_5 = new Class6_Sub2_Sub1_Sub2(local198.anInt253 >> 14 & 0x7FFF, local72, 4, local110, local84, local98, 0, false, -126, local35);
						}
					}
					if (local52 == 2) {
						@Pc(232) Class38 local232 = this.aClass41_1.method426(420, local30, this.anInt1074, local23);
						if (local43 == 11) {
							local43 = 10;
						}
						if (local232 != null) {
							local232.aClass6_Sub2_Sub1_8 = new Class6_Sub2_Sub1_Sub2(local232.anInt486 >> 14 & 0x7FFF, local72, local43, local110, local84, local98, local47, false, -126, local35);
						}
					}
					if (local52 == 3) {
						@Pc(271) Class9 local271 = this.aClass41_1.method427(local23, this.anInt1074, local30);
						if (local271 != null) {
							local271.aClass6_Sub2_Sub1_4 = new Class6_Sub2_Sub1_Sub2(local271.anInt185 >> 14 & 0x7FFF, local72, 22, local110, local84, local98, local47, false, -126, local35);
						}
					}
				}
			} else if (arg1 == 220) {
				local14 = arg0.method291(this.aByte43);
				local23 = arg0.method281();
				local30 = this.anInt915 + (local23 >> 4 & 0x7);
				local35 = this.anInt916 + (local23 & 0x7);
				local39 = arg0.method264();
				local43 = arg0.method291(this.aByte43);
				if (local30 >= 0 && local35 >= 0 && local30 < 104 && local35 < 104 && local39 != this.anInt1066) {
					@Pc(348) Class6_Sub2_Sub1_Sub5 local348 = new Class6_Sub2_Sub1_Sub5();
					local348.anInt472 = local14;
					local348.anInt471 = local43;
					if (this.aClass13ArrayArrayArray1[this.anInt1074][local30][local35] == null) {
						this.aClass13ArrayArrayArray1[this.anInt1074][local30][local35] = new Class13(true);
					}
					this.aClass13ArrayArrayArray1[this.anInt1074][local30][local35].method110(local348);
					this.method667(local30, local35);
				}
			} else if (arg1 == 105) {
				local14 = arg0.method290();
				local23 = arg0.method281();
				local30 = local23 >> 2;
				local35 = local23 & 0x3;
				local39 = this.anIntArray221[local30];
				local43 = arg0.method280();
				local47 = this.anInt915 + (local43 >> 4 & 0x7);
				local52 = this.anInt916 + (local43 & 0x7);
				if (local47 >= 0 && local52 >= 0 && local47 < 104 && local52 < 104) {
					this.method591(local35, local30, local14, local52, 0, -1, this.anInt1074, local47, local39);
				}
			} else {
				if (arg1 == 172) {
					local14 = arg0.method280();
					local23 = this.anInt915 + (local14 >> 4 & 0x7);
					local30 = this.anInt916 + (local14 & 0x7);
					@Pc(488) byte local488 = arg0.method284();
					local39 = arg0.method282(this.anInt1043);
					local43 = local39 >> 2;
					local47 = local39 & 0x3;
					local52 = this.anIntArray221[local43];
					local72 = arg0.method264();
					@Pc(512) byte local512 = arg0.method263();
					@Pc(516) byte local516 = arg0.method283();
					local110 = arg0.method289((byte) 1);
					@Pc(524) byte local524 = arg0.method285();
					local130 = arg0.method289((byte) 1);
					@Pc(532) int local532 = arg0.method289((byte) 1);
					@Pc(538) Class6_Sub2_Sub1_Sub1_Sub2 local538;
					if (local532 == this.anInt1066) {
						local538 = aClass6_Sub2_Sub1_Sub1_Sub2_1;
					} else {
						local538 = this.aClass6_Sub2_Sub1_Sub1_Sub2Array1[local532];
					}
					if (local538 != null) {
						@Pc(550) Class19 local550 = Class19.method169(local72);
						@Pc(560) int local560 = this.anIntArrayArrayArray8[this.anInt1074][local23][local30];
						@Pc(572) int local572 = this.anIntArrayArrayArray8[this.anInt1074][local23 + 1][local30];
						@Pc(586) int local586 = this.anIntArrayArrayArray8[this.anInt1074][local23 + 1][local30 + 1];
						@Pc(598) int local598 = this.anIntArrayArrayArray8[this.anInt1074][local23][local30 + 1];
						@Pc(608) Class6_Sub2_Sub1_Sub3 local608 = local550.method167(local43, local47, local560, local572, local586, local598, -1);
						if (local608 != null) {
							this.method591(0, 0, -1, local30, local110 + 1, local130 + 1, this.anInt1074, local23, local52);
							local538.anInt729 = local110 + anInt1077;
							local538.anInt730 = local130 + anInt1077;
							local538.aClass6_Sub2_Sub1_Sub3_2 = local608;
							@Pc(643) int local643 = local550.anInt319;
							@Pc(646) int local646 = local550.anInt304;
							if (local47 == 1 || local47 == 3) {
								local643 = local550.anInt304;
								local646 = local550.anInt319;
							}
							local538.anInt725 = local23 * 128 + local643 * 64;
							local538.anInt727 = local30 * 128 + local646 * 64;
							local538.anInt726 = this.method640(local538.anInt725, this.anInt1074, local538.anInt727);
							@Pc(692) byte local692;
							if (local512 > local524) {
								local692 = local512;
								local512 = local524;
								local524 = local692;
							}
							if (local516 > local488) {
								local692 = local516;
								local516 = local488;
								local488 = local692;
							}
							local538.anInt731 = local23 + local512;
							local538.anInt733 = local23 + local524;
							local538.anInt732 = local30 + local516;
							local538.anInt734 = local30 + local488;
						}
					}
				}
				@Pc(777) Class6_Sub2_Sub1_Sub5 local777;
				if (arg1 == 13) {
					local14 = arg0.method281();
					local23 = this.anInt915 + (local14 >> 4 & 0x7);
					local30 = this.anInt916 + (local14 & 0x7);
					local35 = arg0.method264();
					if (local23 >= 0 && local30 >= 0 && local23 < 104 && local30 < 104) {
						@Pc(771) Class13 local771 = this.aClass13ArrayArrayArray1[this.anInt1074][local23][local30];
						if (local771 != null) {
							for (local777 = (Class6_Sub2_Sub1_Sub5) local771.method113(); local777 != null; local777 = (Class6_Sub2_Sub1_Sub5) local771.method115()) {
								if (local777.anInt472 == (local35 & 0x7FFF)) {
									local777.method545();
									break;
								}
							}
							if (local771.method113() == null) {
								this.aClass13ArrayArrayArray1[this.anInt1074][local23][local30] = null;
							}
							this.method667(local23, local30);
						}
					}
				} else if (arg1 == 134) {
					local14 = arg0.method280();
					local23 = this.anInt915 + (local14 >> 4 & 0x7);
					local30 = this.anInt916 + (local14 & 0x7);
					local35 = arg0.method282(this.anInt1043);
					local39 = local35 >> 2;
					local43 = local35 & 0x3;
					local47 = this.anIntArray221[local39];
					if (local23 >= 0 && local30 >= 0 && local23 < 104 && local30 < 104) {
						this.method591(local43, local39, -1, local30, 0, -1, this.anInt1074, local23, local47);
					}
				} else if (arg1 == 219) {
					local14 = arg0.method262();
					local23 = this.anInt915 + (local14 >> 4 & 0x7);
					local30 = this.anInt916 + (local14 & 0x7);
					local35 = local23 + arg0.method263();
					local39 = local30 + arg0.method263();
					local43 = arg0.method265();
					local47 = arg0.method264();
					local52 = arg0.method262() * 4;
					local72 = arg0.method262() * 4;
					local84 = arg0.method264();
					local98 = arg0.method264();
					local110 = arg0.method262();
					@Pc(939) int local939 = arg0.method262();
					if (local23 >= 0 && local30 >= 0 && local23 < 104 && local30 < 104 && local35 >= 0 && local39 >= 0 && local35 < 104 && local39 < 104 && local47 != 65535) {
						local23 = local23 * 128 + 64;
						local30 = local30 * 128 + 64;
						local35 = local35 * 128 + 64;
						local39 = local39 * 128 + 64;
						@Pc(1015) Class6_Sub2_Sub1_Sub6 local1015 = new Class6_Sub2_Sub1_Sub6(local939, local30, this.method640(local23, this.anInt1074, local30) - local52, local72, local110, local43, local23, (byte) 66, local98 + anInt1077, local47, this.anInt1074, local84 + anInt1077);
						local1015.method531(this.method640(local35, this.anInt1074, local39) - local72, local84 + anInt1077, local35, local39);
						this.aClass13_11.method110(local1015);
					}
				} else {
					if (arg1 == 112) {
						local14 = arg0.method262();
						local23 = this.anInt915 + (local14 >> 4 & 0x7);
						local30 = this.anInt916 + (local14 & 0x7);
						local35 = arg0.method264();
						local39 = arg0.method262();
						local43 = local39 >> 4 & 0xF;
						local47 = local39 & 0x7;
						if (aClass6_Sub2_Sub1_Sub1_Sub2_1.anIntArray182[0] >= local23 - local43 && aClass6_Sub2_Sub1_Sub1_Sub2_1.anIntArray182[0] <= local23 + local43 && aClass6_Sub2_Sub1_Sub1_Sub2_1.anIntArray183[0] >= local30 - local43 && aClass6_Sub2_Sub1_Sub1_Sub2_1.anIntArray183[0] <= local30 + local43 && this.aBoolean247 && !aBoolean252 && this.anInt1029 < 50) {
							this.anIntArray228[this.anInt1029] = local35;
							this.anIntArray261[this.anInt1029] = local47;
							this.anIntArray249[this.anInt1029] = Class23.anIntArray113[local35];
							this.anInt1029++;
						}
					}
					if (arg1 == 41) {
						local14 = arg0.method262();
						local23 = this.anInt915 + (local14 >> 4 & 0x7);
						local30 = this.anInt916 + (local14 & 0x7);
						local35 = arg0.method264();
						local39 = arg0.method264();
						local43 = arg0.method264();
						if (local23 >= 0 && local30 >= 0 && local23 < 104 && local30 < 104) {
							@Pc(1193) Class13 local1193 = this.aClass13ArrayArrayArray1[this.anInt1074][local23][local30];
							if (local1193 != null) {
								for (@Pc(1199) Class6_Sub2_Sub1_Sub5 local1199 = (Class6_Sub2_Sub1_Sub5) local1193.method113(); local1199 != null; local1199 = (Class6_Sub2_Sub1_Sub5) local1193.method115()) {
									if (local1199.anInt472 == (local35 & 0x7FFF) && local1199.anInt471 == local39) {
										local1199.anInt471 = local43;
										break;
									}
								}
								this.method667(local23, local30);
							}
						}
					} else if (arg1 == 226) {
						local14 = arg0.method264();
						local23 = arg0.method282(this.anInt1043);
						local30 = this.anInt915 + (local23 >> 4 & 0x7);
						local35 = this.anInt916 + (local23 & 0x7);
						local39 = arg0.method290();
						if (local30 >= 0 && local35 >= 0 && local30 < 104 && local35 < 104) {
							local777 = new Class6_Sub2_Sub1_Sub5();
							local777.anInt472 = local39;
							local777.anInt471 = local14;
							if (this.aClass13ArrayArrayArray1[this.anInt1074][local30][local35] == null) {
								this.aClass13ArrayArrayArray1[this.anInt1074][local30][local35] = new Class13(true);
							}
							this.aClass13ArrayArrayArray1[this.anInt1074][local30][local35].method110(local777);
							this.method667(local30, local35);
						}
					} else if (arg1 == 87) {
						local14 = arg0.method262();
						local23 = this.anInt915 + (local14 >> 4 & 0x7);
						local30 = this.anInt916 + (local14 & 0x7);
						local35 = arg0.method264();
						local39 = arg0.method262();
						local43 = arg0.method264();
						if (local23 >= 0 && local30 >= 0 && local23 < 104 && local30 < 104) {
							local23 = local23 * 128 + 64;
							local30 = local30 * 128 + 64;
							@Pc(1392) Class6_Sub2_Sub1_Sub4 local1392 = new Class6_Sub2_Sub1_Sub4(this.anInt1074, local30, local35, (byte) 8, anInt1077, local43, local23, this.method640(local23, this.anInt1074, local30) - local39);
							this.aClass13_12.method110(local1392);
						}
					}
				}
			}
		} catch (@Pc(1398) RuntimeException local1398) {
			signlink.reporterror("25782, " + 0 + ", " + arg0 + ", " + arg1 + ", " + local1398.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;Z)V")
	private void method609(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) boolean arg2) {
		signlink.errorname = arg0;
		try {
			if (!arg2) {
				this.aString25 = "";
				this.aString26 = "Connecting to server...";
				this.method611(true);
			}
			this.aClass34_1 = new Class34(this.method593(anInt893 + 43594), (byte) 5, this);
			@Pc(30) long local30 = Class39.method359(arg0);
			@Pc(37) int local37 = (int) (local30 >> 16 & 0x1FL);
			this.aClass6_Sub2_Sub3_8.anInt404 = 0;
			this.aClass6_Sub2_Sub3_8.method252(14);
			this.aClass6_Sub2_Sub3_8.method252(local37);
			this.aClass34_1.method351(this.aClass6_Sub2_Sub3_8.aByteArray9, 2);
			for (@Pc(60) int local60 = 0; local60 < 8; local60++) {
				this.aClass34_1.method348();
			}
			@Pc(74) int local74 = this.aClass34_1.method348();
			@Pc(76) int local76 = local74;
			@Pc(225) int local225;
			@Pc(259) int local259;
			if (local74 == 0) {
				this.aClass34_1.method350(this.aClass6_Sub2_Sub3_9.aByteArray9, 0, 8);
				this.aClass6_Sub2_Sub3_9.anInt404 = 0;
				this.aLong31 = this.aClass6_Sub2_Sub3_9.method268();
				@Pc(99) int[] local99 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (this.aLong31 >> 32), (int) this.aLong31 };
				this.aClass6_Sub2_Sub3_8.anInt404 = 0;
				this.aClass6_Sub2_Sub3_8.method252(10);
				this.aClass6_Sub2_Sub3_8.method256(local99[0]);
				this.aClass6_Sub2_Sub3_8.method256(local99[1]);
				this.aClass6_Sub2_Sub3_8.method256(local99[2]);
				this.aClass6_Sub2_Sub3_8.method256(local99[3]);
				this.aClass6_Sub2_Sub3_8.method256(signlink.anInt1081);
				this.aClass6_Sub2_Sub3_8.method259(arg0);
				this.aClass6_Sub2_Sub3_8.method259(arg1);
				this.aClass6_Sub2_Sub3_8.method277(aBigInteger2, aBigInteger1);
				this.aClass6_Sub2_Sub3_6.anInt404 = 0;
				if (arg2) {
					this.aClass6_Sub2_Sub3_6.method252(18);
				} else {
					this.aClass6_Sub2_Sub3_6.method252(16);
				}
				this.aClass6_Sub2_Sub3_6.method252(this.aClass6_Sub2_Sub3_8.anInt404 + 36 + 1 + 1 + 2);
				this.aClass6_Sub2_Sub3_6.method252(255);
				this.aClass6_Sub2_Sub3_6.method253(358);
				this.aClass6_Sub2_Sub3_6.method252(aBoolean252 ? 1 : 0);
				for (local225 = 0; local225 < 9; local225++) {
					this.aClass6_Sub2_Sub3_6.method256(this.anIntArray217[local225]);
				}
				this.aClass6_Sub2_Sub3_6.method260(this.aClass6_Sub2_Sub3_8.aByteArray9, this.aClass6_Sub2_Sub3_8.anInt404);
				this.aClass6_Sub2_Sub3_8.aClass18_1 = new Class18(local99, aBoolean254);
				for (local259 = 0; local259 < 4; local259++) {
					local99[local259] += 50;
				}
				this.aClass18_2 = new Class18(local99, aBoolean254);
				this.aClass34_1.method351(this.aClass6_Sub2_Sub3_6.aByteArray9, this.aClass6_Sub2_Sub3_6.anInt404);
				local74 = this.aClass34_1.method348();
			}
			if (local74 == 1) {
				try {
					Thread.sleep(2000L);
				} catch (@Pc(301) Exception local301) {
				}
				this.method609(arg0, arg1, arg2);
			} else {
				@Pc(389) int local389;
				if (local74 == 2) {
					this.anInt917 = this.aClass34_1.method348();
					aBoolean245 = this.aClass34_1.method348() == 1;
					this.aLong30 = 0L;
					this.anInt855 = 0;
					this.aClass36_1.anInt473 = 0;
					super.aBoolean240 = true;
					this.aBoolean258 = true;
					this.aBoolean266 = true;
					this.aClass6_Sub2_Sub3_8.anInt404 = 0;
					this.aClass6_Sub2_Sub3_9.anInt404 = 0;
					this.anInt880 = -1;
					this.anInt905 = -1;
					this.anInt906 = -1;
					this.anInt907 = -1;
					this.anInt879 = 0;
					this.anInt881 = 0;
					this.anInt847 = 0;
					this.anInt883 = 0;
					this.anInt865 = 0;
					this.anInt933 = 0;
					this.aBoolean264 = false;
					super.anInt831 = 0;
					for (local389 = 0; local389 < 100; local389++) {
						this.aStringArray9[local389] = null;
					}
					this.anInt894 = 0;
					this.anInt1038 = 0;
					this.anInt1018 = 0;
					this.anInt1029 = 0;
					this.anInt908 = (int) (Math.random() * 100.0D) - 50;
					this.anInt929 = (int) (Math.random() * 110.0D) - 55;
					this.anInt978 = (int) (Math.random() * 80.0D) - 40;
					this.anInt903 = (int) (Math.random() * 120.0D) - 60;
					this.anInt844 = (int) (Math.random() * 30.0D) - 20;
					this.anInt963 = (int) (Math.random() * 20.0D) - 10 & 0x7FF;
					this.anInt939 = 0;
					this.anInt888 = -1;
					this.anInt1014 = 0;
					this.anInt1015 = 0;
					this.anInt1024 = 0;
					this.anInt886 = 0;
					for (local225 = 0; local225 < this.anInt1022; local225++) {
						this.aClass6_Sub2_Sub1_Sub1_Sub2Array1[local225] = null;
						this.aClass6_Sub2_Sub3Array1[local225] = null;
					}
					for (local259 = 0; local259 < 16384; local259++) {
						this.aClass6_Sub2_Sub1_Sub1_Sub1Array1[local259] = null;
					}
					aClass6_Sub2_Sub1_Sub1_Sub2_1 = this.aClass6_Sub2_Sub1_Sub1_Sub2Array1[this.anInt1023] = new Class6_Sub2_Sub1_Sub1_Sub2();
					this.aClass13_11.method117();
					this.aClass13_12.method117();
					@Pc(534) int local534;
					@Pc(538) int local538;
					for (@Pc(530) int local530 = 0; local530 < 4; local530++) {
						for (local534 = 0; local534 < 104; local534++) {
							for (local538 = 0; local538 < 104; local538++) {
								this.aClass13ArrayArrayArray1[local530][local534][local538] = null;
							}
						}
					}
					this.aClass13_10 = new Class13(true);
					this.anInt927 = 0;
					this.anInt926 = 0;
					this.method603(this.anInt1053);
					this.anInt1053 = -1;
					this.method603(this.anInt983);
					this.anInt983 = -1;
					this.method603(this.anInt994);
					this.anInt994 = -1;
					this.method603(this.anInt924);
					this.anInt924 = -1;
					this.method603(this.anInt1009);
					this.anInt1009 = -1;
					this.method603(this.anInt885);
					this.anInt885 = -1;
					this.method603(this.anInt1001);
					this.anInt1001 = -1;
					this.aBoolean267 = false;
					this.anInt861 = 3;
					this.anInt923 = 0;
					this.aBoolean264 = false;
					this.aBoolean241 = false;
					this.aString23 = null;
					this.anInt1032 = 0;
					this.anInt1017 = -1;
					this.aBoolean244 = true;
					this.method661();
					for (local534 = 0; local534 < 5; local534++) {
						this.anIntArray250[local534] = 0;
					}
					for (local538 = 0; local538 < 5; local538++) {
						this.aStringArray11[local538] = null;
						this.aBooleanArray11[local538] = false;
					}
					anInt899 = 0;
					anInt1069 = 0;
					anInt941 = 0;
					anInt1047 = 0;
					anInt1045 = 0;
					anInt910 = 0;
					this.method605((byte) 8);
				} else if (local74 == 3) {
					this.aString25 = "";
					this.aString26 = "Invalid username or password.";
				} else if (local74 == 4) {
					this.aString25 = "Your account has been disabled.";
					this.aString26 = "Please check your message-centre for details.";
				} else if (local74 == 5) {
					this.aString25 = "Your account is already logged in.";
					this.aString26 = "Try again in 60 secs...";
				} else if (local74 == 6) {
					this.aString25 = "RuneScape has been updated!";
					this.aString26 = "Please reload this page.";
				} else if (local74 == 7) {
					this.aString25 = "This world is full.";
					this.aString26 = "Please use a different world.";
				} else if (local74 == 8) {
					this.aString25 = "Unable to connect.";
					this.aString26 = "Login server offline.";
				} else if (local74 == 9) {
					this.aString25 = "Login limit exceeded.";
					this.aString26 = "Too many connections from your address.";
				} else if (local74 == 10) {
					this.aString25 = "Unable to connect.";
					this.aString26 = "Bad session id.";
				} else if (local74 == 11) {
					this.aString25 = "Login server rejected session.";
					this.aString26 = "Please try again.";
				} else if (local74 == 12) {
					this.aString25 = "You need a members account to login to this world.";
					this.aString26 = "Please subscribe, or use a different world.";
				} else if (local74 == 13) {
					this.aString25 = "Could not complete login.";
					this.aString26 = "Please try using a different world.";
				} else if (local74 == 14) {
					this.aString25 = "The server is being updated.";
					this.aString26 = "Please wait 1 minute and try again.";
				} else if (local74 == 15) {
					this.aBoolean266 = true;
					this.aClass6_Sub2_Sub3_8.anInt404 = 0;
					this.aClass6_Sub2_Sub3_9.anInt404 = 0;
					this.anInt880 = -1;
					this.anInt905 = -1;
					this.anInt906 = -1;
					this.anInt907 = -1;
					this.anInt879 = 0;
					this.anInt881 = 0;
					this.anInt847 = 0;
					this.anInt933 = 0;
					this.aBoolean264 = false;
					this.aLong33 = System.currentTimeMillis();
				} else if (local74 == 16) {
					this.aString25 = "Login attempts exceeded.";
					this.aString26 = "Please wait 1 minute and try again.";
				} else if (local74 == 17) {
					this.aString25 = "You are standing in a members-only area.";
					this.aString26 = "To play on this world move to a free area first";
				} else if (local74 == 20) {
					this.aString25 = "Invalid loginserver requested";
					this.aString26 = "Please try using a different world.";
				} else if (local74 == 21) {
					local389 = this.aClass34_1.method348();
					for (@Pc(917) int local917 = local389 + 3; local917 >= 0; local917--) {
						this.aString25 = "You have only just left another world";
						this.aString26 = "Your profile will be transferred in: " + local917;
						this.method611(true);
						try {
							Thread.sleep(1200L);
						} catch (@Pc(939) Exception local939) {
						}
					}
					this.method609(arg0, arg1, arg2);
				} else if (local74 == 22) {
					this.aString25 = "Malformed login packet.";
					this.aString26 = "Please try again.";
				} else if (local74 == 23) {
					this.aString25 = "This IP address has been blocked for 24";
					this.aString26 = "hours, as it was used to break our rules";
				} else if (local74 != -1) {
					System.out.println("response:" + local74);
					this.aString25 = "Unexpected server response";
					this.aString26 = "Please try using a different world.";
				} else if (local76 != 0) {
					this.aString25 = "No response from server";
					this.aString26 = "Please try using a different world.";
				} else if (this.anInt936 < 2) {
					try {
						Thread.sleep(2000L);
					} catch (@Pc(981) Exception local981) {
					}
					this.anInt936++;
					this.method609(arg0, arg1, arg2);
				} else {
					this.aString25 = "No response from loginserver";
					this.aString26 = "Please wait 1 minute and try again.";
				}
			}
		} catch (@Pc(1024) IOException local1024) {
			this.aString25 = "";
			this.aString26 = "Error connecting to server.";
		}
	}

	@OriginalMember(owner = "client!client", name = "l", descriptor = "(I)V")
	private void method610() {
		try {
			if (this.aClass8_10 == null) {
				super.aClass8_2 = null;
				this.aClass8_9 = null;
				this.aClass8_7 = null;
				this.aClass8_6 = null;
				this.aClass8_8 = null;
				this.aClass8_3 = null;
				this.aClass8_4 = null;
				this.aClass8_5 = null;
				this.aClass8_13 = new Class8(265, 128, this.method586(), (byte) 0);
				Class6_Sub2_Sub2.method550();
				this.aClass8_14 = new Class8(265, 128, this.method586(), (byte) 0);
				Class6_Sub2_Sub2.method550();
				this.aClass8_10 = new Class8(171, 509, this.method586(), (byte) 0);
				Class6_Sub2_Sub2.method550();
				this.aClass8_11 = new Class8(132, 360, this.method586(), (byte) 0);
				Class6_Sub2_Sub2.method550();
				this.aClass8_12 = new Class8(200, 360, this.method586(), (byte) 0);
				Class6_Sub2_Sub2.method550();
				this.aClass8_15 = new Class8(238, 202, this.method586(), (byte) 0);
				Class6_Sub2_Sub2.method550();
				this.aClass8_16 = new Class8(238, 203, this.method586(), (byte) 0);
				Class6_Sub2_Sub2.method550();
				this.aClass8_17 = new Class8(94, 74, this.method586(), (byte) 0);
				Class6_Sub2_Sub2.method550();
				this.aClass8_18 = new Class8(94, 75, this.method586(), (byte) 0);
				Class6_Sub2_Sub2.method550();
				if (this.aClass37_2 != null) {
					this.method666();
					this.method622();
				}
				this.aBoolean243 = true;
			}
		} catch (@Pc(166) RuntimeException local166) {
			signlink.reporterror("57476, " + 1 + ", " + local166.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IZ)V")
	private void method611(@OriginalArg(1) boolean arg0) {
		try {
			this.method610();
			this.aClass8_12.method58();
			this.aClass6_Sub2_Sub2_Sub3_11.method488(0, 0);
			@Pc(55) byte local55;
			@Pc(68) int local68;
			if (this.anInt884 == 0) {
				this.aClass6_Sub2_Sub2_Sub2_2.method381(180, 7711145, this.anInt990, this.aClass25_Sub1_1.aString7, true, 180);
				local55 = 80;
				this.aClass6_Sub2_Sub2_Sub2_4.method381(80, 16776960, this.anInt990, "Welcome to RuneScape", true, 180);
				local68 = local55 + 30;
				this.aClass6_Sub2_Sub2_Sub3_12.method488(100, 27);
				this.aClass6_Sub2_Sub2_Sub2_4.method381(125, 16777215, this.anInt990, "New User", true, 100);
				this.aClass6_Sub2_Sub2_Sub3_12.method488(100, 187);
				this.aClass6_Sub2_Sub2_Sub2_4.method381(125, 16777215, this.anInt990, "Existing User", true, 260);
			}
			if (this.anInt884 == 2) {
				local55 = 60;
				if (this.aString25.length() > 0) {
					this.aClass6_Sub2_Sub2_Sub2_4.method381(45, 16776960, this.anInt990, this.aString25, true, 180);
					this.aClass6_Sub2_Sub2_Sub2_4.method381(60, 16776960, this.anInt990, this.aString26, true, 180);
					local68 = local55 + 30;
				} else {
					this.aClass6_Sub2_Sub2_Sub2_4.method381(53, 16776960, this.anInt990, this.aString26, true, 180);
					local68 = local55 + 30;
				}
				this.aClass6_Sub2_Sub2_Sub2_4.method388(16777215, true, 90, 90, "Username: " + this.aString28 + (this.anInt1063 == 0 & anInt1077 % 40 < 20 ? "@yel@|" : ""));
				local68 += 15;
				this.aClass6_Sub2_Sub2_Sub2_4.method388(16777215, true, 105, 92, "Password: " + Class39.method364(this.aString29) + (this.anInt1063 == 1 & anInt1077 % 40 < 20 ? "@yel@|" : ""));
				local68 += 15;
				if (!arg0) {
					this.aClass6_Sub2_Sub2_Sub3_12.method488(130, 27);
					this.aClass6_Sub2_Sub2_Sub2_4.method381(155, 16777215, this.anInt990, "Login", true, 100);
					this.aClass6_Sub2_Sub2_Sub3_12.method488(130, 187);
					this.aClass6_Sub2_Sub2_Sub2_4.method381(155, 16777215, this.anInt990, "Cancel", true, 260);
				}
			}
			if (this.anInt884 == 3) {
				this.aClass6_Sub2_Sub2_Sub2_4.method381(40, 16776960, this.anInt990, "Create a free account", true, 180);
				local55 = 65;
				this.aClass6_Sub2_Sub2_Sub2_4.method381(65, 16777215, this.anInt990, "To create a new account you need to", true, 180);
				local68 = local55 + 15;
				this.aClass6_Sub2_Sub2_Sub2_4.method381(80, 16777215, this.anInt990, "go back to the main RuneScape webpage", true, 180);
				local68 += 15;
				this.aClass6_Sub2_Sub2_Sub2_4.method381(95, 16777215, this.anInt990, "and choose the 'create account'", true, 180);
				local68 += 15;
				this.aClass6_Sub2_Sub2_Sub2_4.method381(110, 16777215, this.anInt990, "button near the top of that page.", true, 180);
				local68 += 15;
				this.aClass6_Sub2_Sub2_Sub3_12.method488(130, 107);
				this.aClass6_Sub2_Sub2_Sub2_4.method381(155, 16777215, this.anInt990, "Cancel", true, 180);
			}
			this.aClass8_12.method59(super.aGraphics2, 171, 202);
			if (this.aBoolean243) {
				this.aBoolean243 = false;
				this.aClass8_10.method59(super.aGraphics2, 0, 128);
				this.aClass8_11.method59(super.aGraphics2, 371, 202);
				this.aClass8_15.method59(super.aGraphics2, 265, 0);
				this.aClass8_16.method59(super.aGraphics2, 265, 562);
				this.aClass8_17.method59(super.aGraphics2, 171, 128);
				this.aClass8_18.method59(super.aGraphics2, 171, 562);
			}
		} catch (@Pc(514) RuntimeException local514) {
			signlink.reporterror("79743, " + 2 + ", " + arg0 + ", " + local514.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(II)Ljava/lang/String;")
	private String method612(@OriginalArg(1) int arg0) {
		try {
			return arg0 < 999999999 ? String.valueOf(arg0) : "*";
		} catch (@Pc(16) RuntimeException local16) {
			signlink.reporterror("75955, " + 3255 + ", " + arg0 + ", " + local16.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(II)Z")
	private boolean method613(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			if (arg1 < 0) {
				return false;
			}
			@Pc(8) int local8 = this.anIntArray274[arg1];
			if (arg0 < 4 || arg0 > 4) {
				this.method581();
			}
			if (local8 >= 2000) {
				local8 -= 2000;
			}
			return local8 == 159;
		} catch (@Pc(28) RuntimeException local28) {
			signlink.reporterror("5250, " + arg0 + ", " + arg1 + ", " + local28.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(Z)V")
	private void method614() {
		try {
			this.aBoolean266 &= true;
			for (@Pc(7) int local7 = 0; local7 < this.anInt886; local7++) {
				@Pc(14) int local14 = this.anIntArray222[local7];
				@Pc(19) Class6_Sub2_Sub1_Sub1_Sub1 local19 = this.aClass6_Sub2_Sub1_Sub1_Sub1Array1[local14];
				if (local19 != null) {
					this.method615(local19.aClass2_1.aByte2, this.anInt1078, local19);
				}
			}
		} catch (@Pc(36) RuntimeException local36) {
			signlink.reporterror("82490, " + true + ", " + local36.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IILclient!XEGGEBDS;)V")
	private void method615(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class6_Sub2_Sub1_Sub1 arg2) {
		try {
			while (arg1 >= 0) {
				this.anInt880 = -1;
			}
			if (arg2.anInt699 < 128 || arg2.anInt700 < 128 || arg2.anInt699 >= 13184 || arg2.anInt700 >= 13184) {
				arg2.anInt702 = -1;
				arg2.anInt686 = -1;
				arg2.anInt720 = 0;
				arg2.anInt721 = 0;
				arg2.anInt699 = arg2.anIntArray182[0] * 128 + arg2.anInt685 * 64;
				arg2.anInt700 = arg2.anIntArray183[0] * 128 + arg2.anInt685 * 64;
				arg2.method509();
			}
			if (arg2 == aClass6_Sub2_Sub1_Sub1_Sub2_1 && (arg2.anInt699 < 1536 || arg2.anInt700 < 1536 || arg2.anInt699 >= 11776 || arg2.anInt700 >= 11776)) {
				arg2.anInt702 = -1;
				arg2.anInt686 = -1;
				arg2.anInt720 = 0;
				arg2.anInt721 = 0;
				arg2.anInt699 = arg2.anIntArray182[0] * 128 + arg2.anInt685 * 64;
				arg2.anInt700 = arg2.anIntArray183[0] * 128 + arg2.anInt685 * 64;
				arg2.method509();
			}
			if (arg2.anInt720 > anInt1077) {
				this.method616(arg2);
			} else if (arg2.anInt721 >= anInt1077) {
				this.method617(arg2);
			} else {
				this.method618(arg2);
			}
			this.method619(arg2, 346);
			this.method620((byte) 3, arg2);
		} catch (@Pc(159) RuntimeException local159) {
			signlink.reporterror("13602, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local159.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!XEGGEBDS;Z)V")
	private void method616(@OriginalArg(0) Class6_Sub2_Sub1_Sub1 arg0) {
		try {
			@Pc(4) int local4 = arg0.anInt720 - anInt1077;
			@Pc(14) int local14 = arg0.anInt716 * 128 + arg0.anInt685 * 64;
			@Pc(24) int local24 = arg0.anInt718 * 128 + arg0.anInt685 * 64;
			arg0.anInt699 += (local14 - arg0.anInt699) / local4;
			arg0.anInt700 += (local24 - arg0.anInt700) / local4;
			this.aBoolean266 &= true;
			arg0.anInt710 = 0;
			if (arg0.anInt722 == 0) {
				arg0.anInt698 = 1024;
			}
			if (arg0.anInt722 == 1) {
				arg0.anInt698 = 1536;
			}
			if (arg0.anInt722 == 2) {
				arg0.anInt698 = 0;
			}
			if (arg0.anInt722 == 3) {
				arg0.anInt698 = 512;
			}
		} catch (@Pc(84) RuntimeException local84) {
			signlink.reporterror("60612, " + arg0 + ", " + true + ", " + local84.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILclient!XEGGEBDS;)V")
	private void method617(@OriginalArg(1) Class6_Sub2_Sub1_Sub1 arg0) {
		try {
			if (arg0.anInt721 == anInt1077 || arg0.anInt702 == -1 || arg0.anInt705 != 0 || arg0.anInt704 + 1 > Class21.aClass21Array1[arg0.anInt702].method176(arg0.anInt703, 642)) {
				@Pc(29) int local29 = arg0.anInt721 - arg0.anInt720;
				@Pc(34) int local34 = anInt1077 - arg0.anInt720;
				@Pc(44) int local44 = arg0.anInt716 * 128 + arg0.anInt685 * 64;
				@Pc(54) int local54 = arg0.anInt718 * 128 + arg0.anInt685 * 64;
				@Pc(64) int local64 = arg0.anInt717 * 128 + arg0.anInt685 * 64;
				@Pc(74) int local74 = arg0.anInt719 * 128 + arg0.anInt685 * 64;
				arg0.anInt699 = (local44 * (local29 - local34) + local64 * local34) / local29;
				arg0.anInt700 = (local54 * (local29 - local34) + local74 * local34) / local29;
			}
			arg0.anInt710 = 0;
			if (arg0.anInt722 == 0) {
				arg0.anInt698 = 1024;
			}
			if (arg0.anInt722 == 1) {
				arg0.anInt698 = 1536;
			}
			if (arg0.anInt722 == 2) {
				arg0.anInt698 = 0;
			}
			if (arg0.anInt722 == 3) {
				arg0.anInt698 = 512;
			}
			arg0.anInt701 = arg0.anInt698;
		} catch (@Pc(138) RuntimeException local138) {
			signlink.reporterror("86439, " + 98 + ", " + arg0 + ", " + local138.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!XEGGEBDS;I)V")
	private void method618(@OriginalArg(0) Class6_Sub2_Sub1_Sub1 arg0) {
		try {
			this.anInt879 += 0;
			arg0.anInt681 = arg0.anInt712;
			if (arg0.anInt677 == 0) {
				arg0.anInt710 = 0;
			} else {
				if (arg0.anInt702 != -1 && arg0.anInt705 == 0) {
					@Pc(30) Class21 local30 = Class21.aClass21Array1[arg0.anInt702];
					if (arg0.anInt708 > 0 && local30.anInt350 == 0) {
						arg0.anInt710++;
						return;
					}
					if (arg0.anInt708 <= 0 && local30.anInt351 == 0) {
						arg0.anInt710++;
						return;
					}
				}
				@Pc(59) int local59 = arg0.anInt699;
				@Pc(62) int local62 = arg0.anInt700;
				@Pc(77) int local77 = arg0.anIntArray182[arg0.anInt677 - 1] * 128 + arg0.anInt685 * 64;
				@Pc(92) int local92 = arg0.anIntArray183[arg0.anInt677 - 1] * 128 + arg0.anInt685 * 64;
				if (local77 - local59 <= 256 && local77 - local59 >= -256 && local92 - local62 <= 256 && local92 - local62 >= -256) {
					if (local59 < local77) {
						if (local62 < local92) {
							arg0.anInt698 = 1280;
						} else if (local62 > local92) {
							arg0.anInt698 = 1792;
						} else {
							arg0.anInt698 = 1536;
						}
					} else if (local59 > local77) {
						if (local62 < local92) {
							arg0.anInt698 = 768;
						} else if (local62 > local92) {
							arg0.anInt698 = 256;
						} else {
							arg0.anInt698 = 512;
						}
					} else if (local62 < local92) {
						arg0.anInt698 = 1024;
					} else {
						arg0.anInt698 = 0;
					}
					@Pc(186) int local186 = arg0.anInt698 - arg0.anInt701 & 0x7FF;
					if (local186 > 1024) {
						local186 -= 2048;
					}
					@Pc(193) int local193 = arg0.anInt692;
					if (local186 >= -256 && local186 <= 256) {
						local193 = arg0.anInt691;
					} else if (local186 >= 256 && local186 < 768) {
						local193 = arg0.anInt694;
					} else if (local186 >= -768 && local186 <= -256) {
						local193 = arg0.anInt693;
					}
					if (local193 == -1) {
						local193 = arg0.anInt691;
					}
					arg0.anInt681 = local193;
					@Pc(235) int local235 = 4;
					if (arg0.anInt701 != arg0.anInt698 && arg0.anInt711 == -1 && arg0.anInt684 != 0) {
						local235 = 2;
					}
					if (arg0.anInt677 > 2) {
						local235 = 6;
					}
					if (arg0.anInt677 > 3) {
						local235 = 8;
					}
					if (arg0.anInt710 > 0 && arg0.anInt677 > 1) {
						local235 = 8;
						arg0.anInt710--;
					}
					if (arg0.aBooleanArray6[arg0.anInt677 - 1]) {
						local235 <<= 0x1;
					}
					if (local235 >= 8 && arg0.anInt681 == arg0.anInt691 && arg0.anInt709 != -1) {
						arg0.anInt681 = arg0.anInt709;
					}
					if (local59 < local77) {
						arg0.anInt699 += local235;
						if (arg0.anInt699 > local77) {
							arg0.anInt699 = local77;
						}
					} else if (local59 > local77) {
						arg0.anInt699 -= local235;
						if (arg0.anInt699 < local77) {
							arg0.anInt699 = local77;
						}
					}
					if (local62 < local92) {
						arg0.anInt700 += local235;
						if (arg0.anInt700 > local92) {
							arg0.anInt700 = local92;
						}
					} else if (local62 > local92) {
						arg0.anInt700 -= local235;
						if (arg0.anInt700 < local92) {
							arg0.anInt700 = local92;
						}
					}
					if (arg0.anInt699 == local77 && arg0.anInt700 == local92) {
						arg0.anInt677--;
						if (arg0.anInt708 > 0) {
							arg0.anInt708--;
							return;
						}
					}
				} else {
					arg0.anInt699 = local77;
					arg0.anInt700 = local92;
				}
			}
		} catch (@Pc(397) RuntimeException local397) {
			signlink.reporterror("49020, " + arg0 + ", " + 0 + ", " + local397.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Lclient!XEGGEBDS;I)V")
	private void method619(@OriginalArg(0) Class6_Sub2_Sub1_Sub1 arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(5) boolean local5 = false;
			if (arg0.anInt684 != 0) {
				@Pc(31) int local31;
				@Pc(37) int local37;
				if (arg0.anInt711 != -1 && arg0.anInt711 < 32768) {
					@Pc(23) Class6_Sub2_Sub1_Sub1_Sub1 local23 = this.aClass6_Sub2_Sub1_Sub1_Sub1Array1[arg0.anInt711];
					if (local23 != null) {
						local31 = arg0.anInt699 - local23.anInt699;
						local37 = arg0.anInt700 - local23.anInt700;
						if (local31 != 0 || local37 != 0) {
							arg0.anInt698 = (int) (Math.atan2((double) local31, (double) local37) * 325.949D) & 0x7FF;
						}
					}
				}
				@Pc(62) int local62;
				if (arg0.anInt711 >= 32768) {
					local62 = arg0.anInt711 - 32768;
					if (local62 == this.anInt1066) {
						local62 = this.anInt1023;
					}
					@Pc(74) Class6_Sub2_Sub1_Sub1_Sub2 local74 = this.aClass6_Sub2_Sub1_Sub1_Sub2Array1[local62];
					if (local74 != null) {
						local37 = arg0.anInt699 - local74.anInt699;
						@Pc(88) int local88 = arg0.anInt700 - local74.anInt700;
						if (local37 != 0 || local88 != 0) {
							arg0.anInt698 = (int) (Math.atan2((double) local37, (double) local88) * 325.949D) & 0x7FF;
						}
					}
				}
				if ((arg0.anInt675 != 0 || arg0.anInt676 != 0) && (arg0.anInt677 == 0 || arg0.anInt710 > 0)) {
					local62 = arg0.anInt699 - (arg0.anInt675 - this.anInt945 - this.anInt945) * 64;
					local31 = arg0.anInt700 - (arg0.anInt676 - this.anInt946 - this.anInt946) * 64;
					if (local62 != 0 || local31 != 0) {
						arg0.anInt698 = (int) (Math.atan2((double) local62, (double) local31) * 325.949D) & 0x7FF;
					}
					arg0.anInt675 = 0;
					arg0.anInt676 = 0;
				}
				local62 = arg0.anInt698 - arg0.anInt701 & 0x7FF;
				if (local62 != 0) {
					if (local62 < arg0.anInt684 || local62 > 2048 - arg0.anInt684) {
						arg0.anInt701 = arg0.anInt698;
					} else if (local62 > 1024) {
						arg0.anInt701 -= arg0.anInt684;
					} else {
						arg0.anInt701 += arg0.anInt684;
					}
					arg0.anInt701 &= 0x7FF;
					if (arg0.anInt681 == arg0.anInt712 && arg0.anInt701 != arg0.anInt698) {
						if (arg0.anInt713 != -1) {
							arg0.anInt681 = arg0.anInt713;
							return;
						}
						arg0.anInt681 = arg0.anInt691;
						return;
					}
				}
			}
		} catch (@Pc(242) RuntimeException local242) {
			signlink.reporterror("88331, " + arg0 + ", " + arg1 + ", " + local242.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(BLclient!XEGGEBDS;)V")
	private void method620(@OriginalArg(0) byte arg0, @OriginalArg(1) Class6_Sub2_Sub1_Sub1 arg1) {
		try {
			if (this.aByte40 == 3) {
				@Pc(7) boolean local7 = false;
			} else {
				this.method581();
			}
			arg1.aBoolean206 = false;
			@Pc(23) Class21 local23;
			if (arg1.anInt681 != -1) {
				local23 = Class21.aClass21Array1[arg1.anInt681];
				arg1.anInt683++;
				if (arg1.anInt682 < local23.anInt344 && arg1.anInt683 > local23.method176(arg1.anInt682, 642)) {
					arg1.anInt683 = 0;
					arg1.anInt682++;
				}
				if (arg1.anInt682 >= local23.anInt344) {
					arg1.anInt683 = 0;
					arg1.anInt682 = 0;
				}
			}
			if (arg1.anInt686 != -1 && anInt1077 >= arg1.anInt689) {
				if (arg1.anInt687 < 0) {
					arg1.anInt687 = 0;
				}
				local23 = Class31.aClass31Array1[arg1.anInt686].aClass21_2;
				arg1.anInt688++;
				while (arg1.anInt687 < local23.anInt344 && arg1.anInt688 > local23.method176(arg1.anInt687, 642)) {
					arg1.anInt688 -= local23.method176(arg1.anInt687, 642);
					arg1.anInt687++;
				}
				if (arg1.anInt687 >= local23.anInt344 && (arg1.anInt687 < 0 || arg1.anInt687 >= local23.anInt344)) {
					arg1.anInt686 = -1;
				}
			}
			if (arg1.anInt702 != -1 && arg1.anInt705 <= 1) {
				local23 = Class21.aClass21Array1[arg1.anInt702];
				if (local23.anInt350 == 1 && arg1.anInt708 > 0 && arg1.anInt720 <= anInt1077 && arg1.anInt721 < anInt1077) {
					arg1.anInt705 = 1;
					return;
				}
			}
			if (arg1.anInt702 != -1 && arg1.anInt705 == 0) {
				local23 = Class21.aClass21Array1[arg1.anInt702];
				arg1.anInt704++;
				while (arg1.anInt703 < local23.anInt344 && arg1.anInt704 > local23.method176(arg1.anInt703, 642)) {
					arg1.anInt704 -= local23.method176(arg1.anInt703, 642);
					arg1.anInt703++;
				}
				if (arg1.anInt703 >= local23.anInt344) {
					arg1.anInt703 -= local23.anInt345;
					arg1.anInt706++;
					if (arg1.anInt706 >= local23.anInt349) {
						arg1.anInt702 = -1;
					}
					if (arg1.anInt703 < 0 || arg1.anInt703 >= local23.anInt344) {
						arg1.anInt702 = -1;
					}
				}
				arg1.aBoolean206 = local23.aBoolean101;
			}
			if (arg1.anInt705 > 0) {
				arg1.anInt705--;
			}
		} catch (@Pc(268) RuntimeException local268) {
			signlink.reporterror("18105, " + arg0 + ", " + arg1 + ", " + local268.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(B)V")
	private void method621() {
		try {
			if (this.anInt924 == -1 || this.anInt1018 != 2 && super.aClass8_2 == null) {
				if (this.aBoolean243) {
					this.method605((byte) 8);
					this.aBoolean243 = false;
					this.aClass8_19.method59(super.aGraphics2, 4, 0);
					this.aClass8_20.method59(super.aGraphics2, 357, 0);
					this.aClass8_21.method59(super.aGraphics2, 4, 722);
					this.aClass8_22.method59(super.aGraphics2, 205, 743);
					this.aClass8_23.method59(super.aGraphics2, 0, 0);
					this.aClass8_24.method59(super.aGraphics2, 4, 516);
					this.aClass8_25.method59(super.aGraphics2, 205, 516);
					this.aClass8_26.method59(super.aGraphics2, 357, 496);
					this.aClass8_27.method59(super.aGraphics2, 338, 0);
					this.aBoolean279 = true;
					this.aBoolean282 = true;
					this.aBoolean255 = true;
					this.aBoolean283 = true;
					if (this.anInt1018 != 2) {
						this.aClass8_8.method59(super.aGraphics2, 4, 4);
						this.aClass8_7.method59(super.aGraphics2, 4, 550);
					}
				}
				if (this.anInt1018 == 2) {
					this.method710(this.aBoolean269);
				}
				if (this.aBoolean264 && this.anInt866 == 1) {
					this.aBoolean279 = true;
				}
				@Pc(280) boolean local280;
				if (this.anInt885 != -1) {
					local280 = this.method657(this.anInt885, this.anInt860);
					if (local280) {
						this.aBoolean279 = true;
					}
				}
				if (this.anInt914 == 2) {
					this.aBoolean279 = true;
				}
				if (this.anInt1004 == 2) {
					this.aBoolean279 = true;
				}
				if (this.aBoolean279) {
					this.method642();
					this.aBoolean279 = false;
				}
				anInt1007++;
				if (anInt1007 > 100) {
					anInt1007 = 0;
					this.aClass6_Sub2_Sub3_8.method251(102);
					this.aClass6_Sub2_Sub3_8.method252(192);
				}
				@Pc(393) int local393;
				if (this.anInt983 == -1 && this.anInt923 == 0) {
					this.aClass44_1.anInt622 = this.anInt1050 - this.anInt987 - 77;
					if (super.anInt833 > 448 && super.anInt833 < 560 && super.anInt834 > 332) {
						this.method707(this.aClass44_1, 0, super.anInt834 - 357, this.anInt1050, 463, 77, super.anInt833 - 17, -1);
					}
					local393 = this.anInt1050 - this.aClass44_1.anInt622 - 77;
					if (local393 < 0) {
						local393 = 0;
					}
					if (local393 > this.anInt1050 - 77) {
						local393 = this.anInt1050 - 77;
					}
					if (this.anInt987 != local393) {
						this.anInt987 = local393;
						this.aBoolean282 = true;
					}
				}
				if (this.anInt983 == -1 && this.anInt923 == 3) {
					local393 = this.anInt850 * 14 + 7;
					this.aClass44_1.anInt622 = this.anInt851;
					if (super.anInt833 > 448 && super.anInt833 < 560 && super.anInt834 > 332) {
						this.method707(this.aClass44_1, 0, super.anInt834 - 357, local393, 463, 77, super.anInt833 - 17, -1);
					}
					@Pc(472) int local472 = this.aClass44_1.anInt622;
					if (local472 < 0) {
						local472 = 0;
					}
					if (local472 > local393 - 77) {
						local472 = local393 - 77;
					}
					if (this.anInt851 != local472) {
						this.anInt851 = local472;
						this.aBoolean282 = true;
					}
				}
				if (this.anInt983 != -1) {
					local280 = this.method657(this.anInt983, this.anInt860);
					if (local280) {
						this.aBoolean282 = true;
					}
				}
				if (this.anInt914 == 3) {
					this.aBoolean282 = true;
				}
				if (this.anInt1004 == 3) {
					this.aBoolean282 = true;
				}
				if (this.aString23 != null) {
					this.aBoolean282 = true;
				}
				if (this.aBoolean264 && this.anInt866 == 2) {
					this.aBoolean282 = true;
				}
				if (this.aBoolean282) {
					this.method660();
					this.aBoolean282 = false;
				}
				if (this.anInt1018 == 2) {
					this.method669(this.aBoolean256);
					this.aClass8_7.method59(super.aGraphics2, 4, 550);
					anInt985++;
					if (anInt985 > 1394) {
						anInt985 = 0;
						this.aClass6_Sub2_Sub3_8.method251(167);
						this.aClass6_Sub2_Sub3_8.method252(0);
						local393 = this.aClass6_Sub2_Sub3_8.anInt404;
						if ((int) (Math.random() * 2.0D) == 0) {
							this.aClass6_Sub2_Sub3_8.method252(109);
						}
						this.aClass6_Sub2_Sub3_8.method253((int) (Math.random() * 65536.0D));
						this.aClass6_Sub2_Sub3_8.method253(65484);
						if ((int) (Math.random() * 2.0D) == 0) {
							this.aClass6_Sub2_Sub3_8.method253(37273);
						}
						this.aClass6_Sub2_Sub3_8.method252((int) (Math.random() * 256.0D));
						if ((int) (Math.random() * 2.0D) == 0) {
							this.aClass6_Sub2_Sub3_8.method252(212);
						}
						this.aClass6_Sub2_Sub3_8.method253(42668);
						this.aClass6_Sub2_Sub3_8.method252((int) (Math.random() * 256.0D));
						this.aClass6_Sub2_Sub3_8.method253(43683);
						this.aClass6_Sub2_Sub3_8.method252(65);
						this.aClass6_Sub2_Sub3_8.method261(this.aClass6_Sub2_Sub3_8.anInt404 - local393);
					}
				}
				if (this.anInt1017 != -1) {
					this.aBoolean255 = true;
				}
				if (this.aBoolean255) {
					if (this.anInt1017 != -1 && this.anInt1017 == this.anInt861) {
						this.anInt1017 = -1;
						this.aClass6_Sub2_Sub3_8.method251(252);
						this.aClass6_Sub2_Sub3_8.method252(this.anInt861);
					}
					this.aBoolean255 = false;
					this.aClass8_5.method58();
					this.aClass6_Sub2_Sub2_Sub3_20.method488(0, 0);
					if (this.anInt885 == -1) {
						if (this.anIntArray256[this.anInt861] != -1) {
							if (this.anInt861 == 0) {
								this.aClass6_Sub2_Sub2_Sub3_6.method488(10, 22);
							}
							if (this.anInt861 == 1) {
								this.aClass6_Sub2_Sub2_Sub3_7.method488(8, 54);
							}
							if (this.anInt861 == 2) {
								this.aClass6_Sub2_Sub2_Sub3_7.method488(8, 82);
							}
							if (this.anInt861 == 3) {
								this.aClass6_Sub2_Sub2_Sub3_8.method488(8, 110);
							}
							if (this.anInt861 == 4) {
								this.aClass6_Sub2_Sub2_Sub3_10.method488(8, 153);
							}
							if (this.anInt861 == 5) {
								this.aClass6_Sub2_Sub2_Sub3_10.method488(8, 181);
							}
							if (this.anInt861 == 6) {
								this.aClass6_Sub2_Sub2_Sub3_9.method488(9, 209);
							}
						}
						if (this.anIntArray256[0] != -1 && (this.anInt1017 != 0 || anInt1077 % 20 < 10)) {
							this.aClass6_Sub2_Sub2_Sub3Array3[0].method488(13, 29);
						}
						if (this.anIntArray256[1] != -1 && (this.anInt1017 != 1 || anInt1077 % 20 < 10)) {
							this.aClass6_Sub2_Sub2_Sub3Array3[1].method488(11, 53);
						}
						if (this.anIntArray256[2] != -1 && (this.anInt1017 != 2 || anInt1077 % 20 < 10)) {
							this.aClass6_Sub2_Sub2_Sub3Array3[2].method488(11, 82);
						}
						if (this.anIntArray256[3] != -1 && (this.anInt1017 != 3 || anInt1077 % 20 < 10)) {
							this.aClass6_Sub2_Sub2_Sub3Array3[3].method488(12, 115);
						}
						if (this.anIntArray256[4] != -1 && (this.anInt1017 != 4 || anInt1077 % 20 < 10)) {
							this.aClass6_Sub2_Sub2_Sub3Array3[4].method488(13, 153);
						}
						if (this.anIntArray256[5] != -1 && (this.anInt1017 != 5 || anInt1077 % 20 < 10)) {
							this.aClass6_Sub2_Sub2_Sub3Array3[5].method488(11, 180);
						}
						if (this.anIntArray256[6] != -1 && (this.anInt1017 != 6 || anInt1077 % 20 < 10)) {
							this.aClass6_Sub2_Sub2_Sub3Array3[6].method488(13, 208);
						}
					}
					this.aClass8_5.method59(super.aGraphics2, 160, 516);
					this.aClass8_4.method58();
					this.aClass6_Sub2_Sub2_Sub3_19.method488(0, 0);
					if (this.anInt885 == -1) {
						if (this.anIntArray256[this.anInt861] != -1) {
							if (this.anInt861 == 7) {
								this.aClass6_Sub2_Sub2_Sub3_1.method488(0, 42);
							}
							if (this.anInt861 == 8) {
								this.aClass6_Sub2_Sub2_Sub3_2.method488(0, 74);
							}
							if (this.anInt861 == 9) {
								this.aClass6_Sub2_Sub2_Sub3_2.method488(0, 102);
							}
							if (this.anInt861 == 10) {
								this.aClass6_Sub2_Sub2_Sub3_3.method488(1, 130);
							}
							if (this.anInt861 == 11) {
								this.aClass6_Sub2_Sub2_Sub3_5.method488(0, 173);
							}
							if (this.anInt861 == 12) {
								this.aClass6_Sub2_Sub2_Sub3_5.method488(0, 201);
							}
							if (this.anInt861 == 13) {
								this.aClass6_Sub2_Sub2_Sub3_4.method488(0, 229);
							}
						}
						if (this.anIntArray256[8] != -1 && (this.anInt1017 != 8 || anInt1077 % 20 < 10)) {
							this.aClass6_Sub2_Sub2_Sub3Array3[7].method488(2, 74);
						}
						if (this.anIntArray256[9] != -1 && (this.anInt1017 != 9 || anInt1077 % 20 < 10)) {
							this.aClass6_Sub2_Sub2_Sub3Array3[8].method488(3, 102);
						}
						if (this.anIntArray256[10] != -1 && (this.anInt1017 != 10 || anInt1077 % 20 < 10)) {
							this.aClass6_Sub2_Sub2_Sub3Array3[9].method488(4, 137);
						}
						if (this.anIntArray256[11] != -1 && (this.anInt1017 != 11 || anInt1077 % 20 < 10)) {
							this.aClass6_Sub2_Sub2_Sub3Array3[10].method488(2, 174);
						}
						if (this.anIntArray256[12] != -1 && (this.anInt1017 != 12 || anInt1077 % 20 < 10)) {
							this.aClass6_Sub2_Sub2_Sub3Array3[11].method488(2, 201);
						}
						if (this.anIntArray256[13] != -1 && (this.anInt1017 != 13 || anInt1077 % 20 < 10)) {
							this.aClass6_Sub2_Sub2_Sub3Array3[12].method488(2, 226);
						}
					}
					this.aClass8_4.method59(super.aGraphics2, 466, 496);
					this.aClass8_8.method58();
					Class6_Sub2_Sub2_Sub4.anIntArray206 = this.anIntArray267;
				}
				if (this.aBoolean283) {
					this.aBoolean283 = false;
					this.aClass8_3.method58();
					this.aClass6_Sub2_Sub2_Sub3_18.method488(0, 0);
					this.aClass6_Sub2_Sub2_Sub2_3.method381(28, 16777215, this.anInt990, "Public chat", true, 55);
					if (this.anInt1028 == 0) {
						this.aClass6_Sub2_Sub2_Sub2_3.method381(41, 65280, this.anInt990, "On", true, 55);
					}
					if (this.anInt1028 == 1) {
						this.aClass6_Sub2_Sub2_Sub2_3.method381(41, 16776960, this.anInt990, "Friends", true, 55);
					}
					if (this.anInt1028 == 2) {
						this.aClass6_Sub2_Sub2_Sub2_3.method381(41, 16711680, this.anInt990, "Off", true, 55);
					}
					if (this.anInt1028 == 3) {
						this.aClass6_Sub2_Sub2_Sub2_3.method381(41, 65535, this.anInt990, "Hide", true, 55);
					}
					this.aClass6_Sub2_Sub2_Sub2_3.method381(28, 16777215, this.anInt990, "Private chat", true, 184);
					if (this.anInt887 == 0) {
						this.aClass6_Sub2_Sub2_Sub2_3.method381(41, 65280, this.anInt990, "On", true, 184);
					}
					if (this.anInt887 == 1) {
						this.aClass6_Sub2_Sub2_Sub2_3.method381(41, 16776960, this.anInt990, "Friends", true, 184);
					}
					if (this.anInt887 == 2) {
						this.aClass6_Sub2_Sub2_Sub2_3.method381(41, 16711680, this.anInt990, "Off", true, 184);
					}
					this.aClass6_Sub2_Sub2_Sub2_3.method381(28, 16777215, this.anInt990, "Trade/compete", true, 324);
					if (this.anInt951 == 0) {
						this.aClass6_Sub2_Sub2_Sub2_3.method381(41, 65280, this.anInt990, "On", true, 324);
					}
					if (this.anInt951 == 1) {
						this.aClass6_Sub2_Sub2_Sub2_3.method381(41, 16776960, this.anInt990, "Friends", true, 324);
					}
					if (this.anInt951 == 2) {
						this.aClass6_Sub2_Sub2_Sub2_3.method381(41, 16711680, this.anInt990, "Off", true, 324);
					}
					this.aClass6_Sub2_Sub2_Sub2_3.method381(33, 16777215, this.anInt990, "Report abuse", true, 458);
					this.aClass8_3.method59(super.aGraphics2, 453, 0);
					this.aClass8_8.method58();
					Class6_Sub2_Sub2_Sub4.anIntArray206 = this.anIntArray267;
				}
				this.anInt860 = 0;
			} else {
				if (this.anInt1018 == 2) {
					this.method657(this.anInt924, this.anInt860);
					if (this.anInt1009 != -1) {
						this.method657(this.anInt1009, this.anInt860);
					}
					this.anInt860 = 0;
					this.method650();
					super.aClass8_2.method58();
					Class6_Sub2_Sub2_Sub4.anIntArray206 = this.anIntArray268;
					Class6_Sub2_Sub2.method550();
					this.aBoolean243 = true;
					@Pc(58) Class44 local58 = Class44.method496(this.anInt924);
					if (local58.anInt642 == 512 && local58.anInt645 == 334 && local58.anInt649 == 0) {
						local58.anInt642 = 765;
						local58.anInt645 = 503;
					}
					this.method688(0, 0, local58, 0);
					if (this.anInt1009 != -1) {
						local58 = Class44.method496(this.anInt1009);
						if (local58.anInt642 == 512 && local58.anInt645 == 334 && local58.anInt649 == 0) {
							local58.anInt642 = 765;
							local58.anInt645 = 503;
						}
						this.method688(0, 0, local58, 0);
					}
					if (this.aBoolean264) {
						this.method721();
					} else {
						this.method626();
						this.method599();
					}
				}
				super.aClass8_2.method59(super.aGraphics2, 0, 0);
			}
		} catch (@Pc(1412) RuntimeException local1412) {
			signlink.reporterror("69539, " + -35 + ", " + local1412.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(Z)V")
	private void method622() {
		try {
			this.aClass6_Sub2_Sub2_Sub3_11 = new Class6_Sub2_Sub2_Sub3(this.aClass37_2, "titlebox", 0);
			this.aClass6_Sub2_Sub2_Sub3_12 = new Class6_Sub2_Sub2_Sub3(this.aClass37_2, "titlebutton", 0);
			this.aClass6_Sub2_Sub2_Sub3Array2 = new Class6_Sub2_Sub2_Sub3[12];
			for (@Pc(35) int local35 = 0; local35 < 12; local35++) {
				this.aClass6_Sub2_Sub2_Sub3Array2[local35] = new Class6_Sub2_Sub2_Sub3(this.aClass37_2, "runes", local35);
			}
			this.aClass6_Sub2_Sub2_Sub1_16 = new Class6_Sub2_Sub2_Sub1(128, 265);
			this.aClass6_Sub2_Sub2_Sub1_17 = new Class6_Sub2_Sub2_Sub1(128, 265);
			for (@Pc(68) int local68 = 0; local68 < 33920; local68++) {
				this.aClass6_Sub2_Sub2_Sub1_16.anIntArray43[local68] = this.aClass8_13.anIntArray38[local68];
			}
			for (@Pc(86) int local86 = 0; local86 < 33920; local86++) {
				this.aClass6_Sub2_Sub2_Sub1_17.anIntArray43[local86] = this.aClass8_14.anIntArray38[local86];
			}
			this.anIntArray224 = new int[256];
			for (@Pc(108) int local108 = 0; local108 < 64; local108++) {
				this.anIntArray224[local108] = local108 * 262144;
			}
			for (@Pc(123) int local123 = 0; local123 < 64; local123++) {
				this.anIntArray224[local123 + 64] = local123 * 1024 + 16711680;
			}
			for (@Pc(142) int local142 = 0; local142 < 64; local142++) {
				this.anIntArray224[local142 + 128] = local142 * 4 + 16776960;
			}
			for (@Pc(161) int local161 = 0; local161 < 64; local161++) {
				this.anIntArray224[local161 + 192] = 16777215;
			}
			this.anIntArray225 = new int[256];
			for (@Pc(180) int local180 = 0; local180 < 64; local180++) {
				this.anIntArray225[local180] = local180 * 1024;
			}
			for (@Pc(195) int local195 = 0; local195 < 64; local195++) {
				this.anIntArray225[local195 + 64] = local195 * 4 + 65280;
			}
			for (@Pc(214) int local214 = 0; local214 < 64; local214++) {
				this.anIntArray225[local214 + 128] = local214 * 262144 + 65535;
			}
			for (@Pc(233) int local233 = 0; local233 < 64; local233++) {
				this.anIntArray225[local233 + 192] = 16777215;
			}
			this.anIntArray226 = new int[256];
			for (@Pc(252) int local252 = 0; local252 < 64; local252++) {
				this.anIntArray226[local252] = local252 * 4;
			}
			for (@Pc(267) int local267 = 0; local267 < 64; local267++) {
				this.anIntArray226[local267 + 64] = local267 * 262144 + 255;
			}
			for (@Pc(286) int local286 = 0; local286 < 64; local286++) {
				this.anIntArray226[local286 + 128] = local286 * 1024 + 16711935;
			}
			for (@Pc(305) int local305 = 0; local305 < 64; local305++) {
				this.anIntArray226[local305 + 192] = 16777215;
			}
			this.anIntArray223 = new int[256];
			this.anIntArray229 = new int[32768];
			this.anIntArray230 = new int[32768];
			this.method663(null, (byte) 8);
			this.anIntArray263 = new int[32768];
			this.anIntArray264 = new int[32768];
			this.method588(anInt1011, 10, "Connecting to fileserver");
			if (!this.aBoolean275) {
				this.aBoolean265 = true;
				this.aBoolean275 = true;
				this.method587(this, 2);
			}
		} catch (@Pc(362) RuntimeException local362) {
			signlink.reporterror("28642, " + false + ", " + local362.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "m", descriptor = "(I)Z")
	private boolean method623() {
		try {
			return signlink.wavereplay();
		} catch (@Pc(8) RuntimeException local8) {
			signlink.reporterror("82848, " + 2 + ", " + local8.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "init", descriptor = "()V")
	@Override
	public void init() {
		anInt892 = Integer.parseInt(this.getParameter("nodeid"));
		anInt893 = Integer.parseInt(this.getParameter("portoff"));
		@Pc(15) String local15 = this.getParameter("lowmem");
		if (local15 != null && local15.equals("1")) {
			method608();
		} else {
			method627();
		}
		@Pc(31) String local31 = this.getParameter("free");
		if (local31 != null && local31.equals("1")) {
			aBoolean251 = false;
		} else {
			aBoolean251 = true;
		}
		this.method577();
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(BIILclient!FKNRMZJV;)V")
	private void method624(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class6_Sub2_Sub2_Sub1 arg2) {
		try {
			@Pc(11) int local11 = arg0 * arg0 + arg1 * arg1;
			if (local11 > 4225 && local11 < 90000) {
				@Pc(25) int local25 = this.anInt963 + this.anInt903 & 0x7FF;
				@Pc(29) int local29 = Class6_Sub2_Sub1_Sub3.anIntArray96[local25];
				@Pc(33) int local33 = Class6_Sub2_Sub1_Sub3.anIntArray97[local25];
				@Pc(42) int local42 = local29 * 256 / (this.anInt844 + 256);
				@Pc(51) int local51 = local33 * 256 / (this.anInt844 + 256);
				@Pc(61) int local61 = arg1 * local42 + arg0 * local51 >> 16;
				@Pc(71) int local71 = arg1 * local51 - arg0 * local42 >> 16;
				@Pc(77) double local77 = Math.atan2((double) local61, (double) local71);
				@Pc(83) int local83 = (int) (Math.sin(local77) * 63.0D);
				@Pc(89) int local89 = (int) (Math.cos(local77) * 57.0D);
				this.aClass6_Sub2_Sub2_Sub1_9.method103(83 - local89 - 20, local83 + 94 + 4 - 10, local77);
			} else {
				this.method687(arg0, arg2, arg1);
			}
		} catch (@Pc(120) RuntimeException local120) {
			signlink.reporterror("10519, " + -120 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local120.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIILclient!APPQAEOL;I)V")
	private void method625(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class2 arg2, @OriginalArg(4) int arg3) {
		try {
			if (this.anInt933 < 400) {
				if (arg2.anIntArray1 != null) {
					arg2 = arg2.method5(this.anInt998);
				}
				if (arg2 != null && arg2.aBoolean2) {
					@Pc(24) String local24 = arg2.aString1;
					if (arg2.anInt6 != 0) {
						local24 = local24 + method607(arg2.anInt6, aClass6_Sub2_Sub1_Sub1_Sub2_1.anInt737) + " (level-" + arg2.anInt6 + ")";
					}
					if (this.anInt894 == 1) {
						this.aStringArray13[this.anInt933] = "Use " + this.aString20 + " with @yel@" + local24;
						this.anIntArray274[this.anInt933] = 219;
						this.anIntArray275[this.anInt933] = arg3;
						this.anIntArray272[this.anInt933] = arg0;
						this.anIntArray273[this.anInt933] = arg1;
						this.anInt933++;
					} else if (this.anInt1038 != 1) {
						@Pc(172) int local172;
						if (arg2.aStringArray1 != null) {
							for (local172 = 4; local172 >= 0; local172--) {
								if (arg2.aStringArray1[local172] != null && !arg2.aStringArray1[local172].equalsIgnoreCase("attack")) {
									this.aStringArray13[this.anInt933] = arg2.aStringArray1[local172] + " @yel@" + local24;
									if (local172 == 0) {
										this.anIntArray274[this.anInt933] = 90;
									}
									if (local172 == 1) {
										this.anIntArray274[this.anInt933] = 468;
									}
									if (local172 == 2) {
										this.anIntArray274[this.anInt933] = 432;
									}
									if (local172 == 3) {
										this.anIntArray274[this.anInt933] = 550;
									}
									if (local172 == 4) {
										this.anIntArray274[this.anInt933] = 866;
									}
									this.anIntArray275[this.anInt933] = arg3;
									this.anIntArray272[this.anInt933] = arg0;
									this.anIntArray273[this.anInt933] = arg1;
									this.anInt933++;
								}
							}
						}
						if (arg2.aStringArray1 != null) {
							for (local172 = 4; local172 >= 0; local172--) {
								if (arg2.aStringArray1[local172] != null && arg2.aStringArray1[local172].equalsIgnoreCase("attack")) {
									@Pc(296) short local296 = 0;
									if (arg2.anInt6 > aClass6_Sub2_Sub1_Sub1_Sub2_1.anInt737) {
										local296 = 2000;
									}
									this.aStringArray13[this.anInt933] = arg2.aStringArray1[local172] + " @yel@" + local24;
									if (local172 == 0) {
										this.anIntArray274[this.anInt933] = local296 + 90;
									}
									if (local172 == 1) {
										this.anIntArray274[this.anInt933] = local296 + 468;
									}
									if (local172 == 2) {
										this.anIntArray274[this.anInt933] = local296 + 432;
									}
									if (local172 == 3) {
										this.anIntArray274[this.anInt933] = local296 + 550;
									}
									if (local172 == 4) {
										this.anIntArray274[this.anInt933] = local296 + 866;
									}
									this.anIntArray275[this.anInt933] = arg3;
									this.anIntArray272[this.anInt933] = arg0;
									this.anIntArray273[this.anInt933] = arg1;
									this.anInt933++;
								}
							}
						}
						this.aStringArray13[this.anInt933] = "Examine @yel@" + local24;
						this.anIntArray274[this.anInt933] = 1532;
						this.anIntArray275[this.anInt933] = arg3;
						this.anIntArray272[this.anInt933] = arg0;
						this.anIntArray273[this.anInt933] = arg1;
						this.anInt933++;
					} else if ((this.anInt1040 & 0x2) == 2) {
						this.aStringArray13[this.anInt933] = this.aString27 + " @yel@" + local24;
						this.anIntArray274[this.anInt933] = 843;
						this.anIntArray275[this.anInt933] = arg3;
						this.anIntArray272[this.anInt933] = arg0;
						this.anIntArray273[this.anInt933] = arg1;
						this.anInt933++;
						return;
					}
				}
			}
		} catch (@Pc(446) RuntimeException local446) {
			signlink.reporterror("24927, " + -11478 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local446.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "n", descriptor = "(I)V")
	private void method626() {
		try {
			if (this.anInt1004 == 0) {
				this.aStringArray13[0] = "Cancel";
				this.anIntArray274[0] = 1855;
				this.anInt933 = 1;
				if (this.anInt924 == -1) {
					this.method676();
					this.anInt1019 = 0;
					this.anInt1027 = 0;
					if (super.anInt833 > 4 && super.anInt834 > 4 && super.anInt833 < 516 && super.anInt834 < 338) {
						if (this.anInt994 == -1) {
							this.method633();
						} else {
							this.method693(super.anInt833, 4, 0, Class44.method496(this.anInt994), 4, 0, super.anInt834);
						}
					}
					if (this.anInt1019 != this.anInt1012) {
						this.anInt1012 = this.anInt1019;
					}
					if (this.anInt1027 != this.anInt1051) {
						this.anInt1051 = this.anInt1027;
					}
					this.anInt1019 = 0;
					this.anInt1027 = 0;
					if (super.anInt833 > 553 && super.anInt834 > 205 && super.anInt833 < 743 && super.anInt834 < 466) {
						if (this.anInt885 != -1) {
							this.method693(super.anInt833, 553, 1, Class44.method496(this.anInt885), 205, 0, super.anInt834);
						} else if (this.anIntArray256[this.anInt861] != -1) {
							this.method693(super.anInt833, 553, 1, Class44.method496(this.anIntArray256[this.anInt861]), 205, 0, super.anInt834);
						}
					}
					if (this.anInt1019 != this.anInt871) {
						this.aBoolean279 = true;
						this.anInt871 = this.anInt1019;
					}
					if (this.anInt1027 != this.anInt920) {
						this.aBoolean279 = true;
						this.anInt920 = this.anInt1027;
					}
					this.anInt1019 = 0;
					this.anInt1027 = 0;
					if (super.anInt833 > 17 && super.anInt834 > 357 && super.anInt833 < 496 && super.anInt834 < 453) {
						if (this.anInt983 != -1) {
							this.method693(super.anInt833, 17, 2, Class44.method496(this.anInt983), 357, 0, super.anInt834);
						} else if (this.anInt1053 != -1) {
							this.method693(super.anInt833, 17, 3, Class44.method496(this.anInt1053), 357, 0, super.anInt834);
						} else if (super.anInt834 < 434 && super.anInt833 < 426 && this.anInt923 == 0) {
							this.method651(super.anInt834 - 357, super.anInt833 - 17);
						}
					}
					if ((this.anInt983 != -1 || this.anInt1053 != -1) && this.anInt1019 != this.anInt919) {
						this.aBoolean282 = true;
						this.anInt919 = this.anInt1019;
					}
					if ((this.anInt983 != -1 || this.anInt1053 != -1) && this.anInt1027 != this.anInt984) {
						this.aBoolean282 = true;
						this.anInt984 = this.anInt1027;
					}
					@Pc(343) boolean local343 = false;
					while (!local343) {
						local343 = true;
						for (@Pc(354) int local354 = 0; local354 < this.anInt933 - 1; local354++) {
							if (this.anIntArray274[local354] < 1000 && this.anIntArray274[local354 + 1] > 1000) {
								@Pc(375) String local375 = this.aStringArray13[local354];
								this.aStringArray13[local354] = this.aStringArray13[local354 + 1];
								this.aStringArray13[local354 + 1] = local375;
								@Pc(397) int local397 = this.anIntArray274[local354];
								this.anIntArray274[local354] = this.anIntArray274[local354 + 1];
								this.anIntArray274[local354 + 1] = local397;
								@Pc(419) int local419 = this.anIntArray272[local354];
								this.anIntArray272[local354] = this.anIntArray272[local354 + 1];
								this.anIntArray272[local354 + 1] = local419;
								@Pc(441) int local441 = this.anIntArray273[local354];
								this.anIntArray273[local354] = this.anIntArray273[local354 + 1];
								this.anIntArray273[local354 + 1] = local441;
								@Pc(463) int local463 = this.anIntArray275[local354];
								this.anIntArray275[local354] = this.anIntArray275[local354 + 1];
								this.anIntArray275[local354 + 1] = local463;
								local343 = false;
							}
						}
					}
				} else {
					this.anInt1019 = 0;
					this.anInt1027 = 0;
					this.method693(super.anInt833, 0, 0, Class44.method496(this.anInt924), 0, 0, super.anInt834);
					if (this.anInt1019 != this.anInt1012) {
						this.anInt1012 = this.anInt1019;
					}
					if (this.anInt1027 != this.anInt1051) {
						this.anInt1051 = this.anInt1027;
					}
				}
			}
		} catch (@Pc(493) RuntimeException local493) {
			signlink.reporterror("3482, " + -888 + ", " + local493.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(BILclient!NQUAUMDT;)V")
	private void method628(@OriginalArg(1) int arg0, @OriginalArg(2) Class6_Sub2_Sub3 arg1) {
		try {
			for (@Pc(1) int local1 = 0; local1 < this.anInt1025; local1++) {
				@Pc(8) int local8 = this.anIntArray258[local1];
				@Pc(13) Class6_Sub2_Sub1_Sub1_Sub2 local13 = this.aClass6_Sub2_Sub1_Sub1_Sub2Array1[local8];
				@Pc(16) int local16 = arg1.method262();
				if ((local16 & 0x10) != 0) {
					local16 += arg1.method262() << 8;
				}
				this.method714(local8, arg1, local13, local16);
			}
		} catch (@Pc(44) RuntimeException local44) {
			signlink.reporterror("39776, " + -50 + ", " + arg0 + ", " + arg1 + ", " + local44.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;IZII)Lclient!RSPRYUFS;")
	private Class37 method629(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		try {
			@Pc(3) byte[] local3 = null;
			this.aBoolean266 &= true;
			@Pc(11) int local11 = 5;
			try {
				if (this.aClass1Array1[0] != null) {
					local3 = this.aClass1Array1[0].method1(arg2);
				}
			} catch (@Pc(26) Exception local26) {
			}
			@Pc(40) int local40;
			if (local3 != null) {
				this.aCRC32_2.reset();
				this.aCRC32_2.update(local3);
				local40 = (int) this.aCRC32_2.getValue();
				if (local40 != arg4) {
					local3 = null;
				}
			}
			if (local3 != null) {
				return new Class37(local3, (byte) -70);
			}
			local40 = 0;
			while (local3 == null) {
				@Pc(61) String local61 = "Unknown error";
				this.method588(anInt1011, arg3, "Requesting " + arg0);
				@Pc(76) int local76;
				try {
					local76 = 0;
					@Pc(87) DataInputStream local87 = this.method711(arg1 + arg4);
					@Pc(90) byte[] local90 = new byte[6];
					local87.readFully(local90, 0, 6);
					@Pc(101) Class6_Sub2_Sub3 local101 = new Class6_Sub2_Sub3(-587, local90);
					local101.anInt404 = 3;
					@Pc(109) int local109 = local101.method266() + 6;
					@Pc(111) int local111 = 6;
					local3 = new byte[local109];
					for (@Pc(116) int local116 = 0; local116 < 6; local116++) {
						local3[local116] = local90[local116];
					}
					@Pc(134) int local134;
					while (local111 < local109) {
						local134 = local109 - local111;
						if (local134 > 1000) {
							local134 = 1000;
						}
						@Pc(145) int local145 = local87.read(local3, local111, local134);
						if (local145 < 0) {
							(new StringBuffer("Length error: ")).append(local111).append("/").append(local109).toString();
							throw new IOException("EOF");
						}
						local111 += local145;
						@Pc(174) int local174 = local111 * 100 / local109;
						if (local174 != local76) {
							this.method588(anInt1011, arg3, "Loading " + arg0 + " - " + local174 + "%");
						}
						local76 = local174;
					}
					local87.close();
					try {
						if (this.aClass1Array1[0] != null) {
							this.aClass1Array1[0].method2(local3, arg2, local3.length);
						}
					} catch (@Pc(219) Exception local219) {
						this.aClass1Array1[0] = null;
					}
					if (local3 != null) {
						this.aCRC32_2.reset();
						this.aCRC32_2.update(local3);
						local134 = (int) this.aCRC32_2.getValue();
						if (local134 != arg4) {
							local3 = null;
							local40++;
							local61 = "Checksum error: " + local134;
						}
					}
				} catch (@Pc(254) IOException local254) {
					if (local61.equals("Unknown error")) {
						local61 = "Connection error";
					}
					local3 = null;
				} catch (@Pc(264) NullPointerException local264) {
					local61 = "Null error";
					local3 = null;
					if (!signlink.reporterror) {
						return null;
					}
				} catch (@Pc(273) ArrayIndexOutOfBoundsException local273) {
					local61 = "Bounds error";
					local3 = null;
					if (!signlink.reporterror) {
						return null;
					}
				} catch (@Pc(282) Exception local282) {
					local61 = "Unexpected error";
					local3 = null;
					if (!signlink.reporterror) {
						return null;
					}
				}
				if (local3 == null) {
					for (local76 = local11; local76 > 0; local76--) {
						if (local40 >= 3) {
							this.method588(anInt1011, arg3, "Game updated - please reload page");
							local76 = 10;
						} else {
							this.method588(anInt1011, arg3, local61 + " - Retrying in " + local76);
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
					this.aBoolean268 = !this.aBoolean268;
				}
			}
			return new Class37(local3, (byte) -70);
		} catch (@Pc(358) RuntimeException local358) {
			signlink.reporterror("69191, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + true + ", " + arg3 + ", " + arg4 + ", " + local358.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(BI)V")
	private void method630(@OriginalArg(1) int arg0) {
		try {
			@Pc(5) int[] local5 = this.aClass6_Sub2_Sub2_Sub1_10.anIntArray43;
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
						this.aClass41_1.method437(local5, local34, arg0, local36, local22);
					}
					if (arg0 < 3 && (this.aByteArrayArrayArray8[arg0 + 1][local36][local22] & 0x8) != 0) {
						this.aClass41_1.method437(local5, local34, arg0 + 1, local36, local22);
					}
					local34 += 4;
				}
			}
			local34 = ((int) (Math.random() * 20.0D) + 238 - 10 << 16) + ((int) (Math.random() * 20.0D) + 238 - 10 << 8) + (int) (Math.random() * 20.0D) + 238 - 10;
			local36 = (int) (Math.random() * 20.0D) + 238 - 10 << 16;
			this.aClass6_Sub2_Sub2_Sub1_10.method93();
			@Pc(146) int local146;
			for (@Pc(142) int local142 = 1; local142 < 103; local142++) {
				for (local146 = 1; local146 < 103; local146++) {
					if ((this.aByteArrayArrayArray8[arg0][local146][local142] & 0x18) == 0) {
						this.method716(local142, local146, arg0, local34, local36);
					}
					if (arg0 < 3 && (this.aByteArrayArrayArray8[arg0 + 1][local146][local142] & 0x8) != 0) {
						this.method716(local142, local146, arg0 + 1, local34, local36);
					}
				}
			}
			if (this.aClass8_8 != null) {
				this.aClass8_8.method58();
				Class6_Sub2_Sub2_Sub4.anIntArray206 = this.anIntArray267;
			}
			this.anInt993 = 0;
			for (local146 = 0; local146 < 104; local146++) {
				for (@Pc(228) int local228 = 0; local228 < 104; local228++) {
					@Pc(238) int local238 = this.aClass41_1.method431(this.anInt1074, local146, local228);
					if (local238 != 0) {
						local238 = local238 >> 14 & 0x7FFF;
						@Pc(250) int local250 = Class19.method169(local238).anInt311;
						if (local250 >= 0) {
							@Pc(254) int local254 = local146;
							@Pc(256) int local256 = local228;
							if (local250 != 22 && local250 != 29 && local250 != 34 && local250 != 36 && local250 != 46 && local250 != 47 && local250 != 48) {
								@Pc(288) int[][] local288 = this.aClass47Array1[this.anInt1074].anIntArrayArray17;
								for (@Pc(290) int local290 = 0; local290 < 10; local290++) {
									@Pc(297) int local297 = (int) (Math.random() * 4.0D);
									if (local297 == 0 && local254 > 0 && local254 > local146 - 3 && (local288[local254 - 1][local256] & 0x1280108) == 0) {
										local254--;
									}
									if (local297 == 1 && local254 < 103 && local254 < local146 + 3 && (local288[local254 + 1][local256] & 0x1280180) == 0) {
										local254++;
									}
									if (local297 == 2 && local256 > 0 && local256 > local228 - 3 && (local288[local254][local256 - 1] & 0x1280102) == 0) {
										local256--;
									}
									if (local297 == 3 && local256 < 103 && local256 < local228 + 3 && (local288[local254][local256 + 1] & 0x1280120) == 0) {
										local256++;
									}
								}
							}
							this.aClass6_Sub2_Sub2_Sub1Array6[this.anInt993] = this.aClass6_Sub2_Sub2_Sub1Array8[local250];
							this.anIntArray240[this.anInt993] = local254;
							this.anIntArray241[this.anInt993] = local256;
							this.anInt993++;
						}
					}
				}
			}
			anInt972++;
			if (anInt972 > 62) {
				anInt972 = 0;
				this.aClass6_Sub2_Sub3_8.method251(187);
			}
		} catch (@Pc(441) RuntimeException local441) {
			signlink.reporterror("75184, " + 1 + ", " + arg0 + ", " + local441.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(IZ)V")
	private void method631(@OriginalArg(0) int arg0) {
		try {
			@Pc(2) Class44 local2 = Class44.method496(arg0);
			for (@Pc(4) int local4 = 0; local4 < local2.anIntArray176.length && local2.anIntArray176[local4] != -1; local4++) {
				@Pc(18) Class44 local18 = Class44.method496(local2.anIntArray176[local4]);
				if (local18.anInt649 == 1) {
					this.method631(local18.anInt630);
				}
				local18.anInt629 = 0;
				local18.anInt611 = 0;
			}
		} catch (@Pc(46) RuntimeException local46) {
			signlink.reporterror("27632, " + arg0 + ", " + false + ", " + local46.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(B)V")
	private void method632(@OriginalArg(0) byte arg0) {
		try {
			this.aBoolean274 = true;
			try {
				@Pc(4) long local4 = System.currentTimeMillis();
				@Pc(6) int local6 = 0;
				@Pc(8) int local8 = 20;
				while (this.aBoolean275) {
					this.anInt1008++;
					this.method723((byte) 8);
					this.method723((byte) 8);
					this.method673(this.anInt891);
					local6++;
					if (local6 > 10) {
						@Pc(32) long local32 = System.currentTimeMillis();
						@Pc(41) int local41 = (int) (local32 - local4) / 10 - local8;
						local8 = 40 - local41;
						if (local8 < 5) {
							local8 = 5;
						}
						local6 = 0;
						local4 = local32;
					}
					try {
						Thread.sleep((long) local8);
					} catch (@Pc(59) Exception local59) {
					}
				}
			} catch (@Pc(65) Exception local65) {
			}
			this.aBoolean274 = false;
			@Pc(73) boolean local73 = false;
		} catch (@Pc(80) RuntimeException local80) {
			signlink.reporterror("73621, " + arg0 + ", " + local80.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "f", descriptor = "(Z)V")
	private void method633() {
		try {
			if (this.anInt894 == 0 && this.anInt1038 == 0) {
				this.aStringArray13[this.anInt933] = "Walk here";
				this.anIntArray274[this.anInt933] = 1;
				this.anIntArray272[this.anInt933] = super.anInt833;
				this.anIntArray273[this.anInt933] = super.anInt834;
				this.anInt933++;
			}
			@Pc(41) int local41 = -1;
			for (@Pc(43) int local43 = 0; local43 < Class6_Sub2_Sub1_Sub3.anInt292; local43++) {
				@Pc(49) int local49 = Class6_Sub2_Sub1_Sub3.anIntArray95[local43];
				@Pc(53) int local53 = local49 & 0x7F;
				@Pc(59) int local59 = local49 >> 7 & 0x7F;
				@Pc(65) int local65 = local49 >> 29 & 0x3;
				@Pc(71) int local71 = local49 >> 14 & 0x7FFF;
				if (local49 != local41) {
					local41 = local49;
					@Pc(218) int local218;
					if (local65 == 2 && this.aClass41_1.method432(this.anInt1074, local53, local59, local49) >= 0) {
						@Pc(91) Class19 local91 = Class19.method169(local71);
						if (local91.anIntArray104 != null) {
							local91 = local91.method170();
						}
						if (local91 == null) {
							continue;
						}
						if (this.anInt894 == 1) {
							this.aStringArray13[this.anInt933] = "Use " + this.aString20 + " with @cya@" + local91.aString6;
							this.anIntArray274[this.anInt933] = 980;
							this.anIntArray275[this.anInt933] = local49;
							this.anIntArray272[this.anInt933] = local53;
							this.anIntArray273[this.anInt933] = local59;
							this.anInt933++;
						} else if (this.anInt1038 != 1) {
							if (local91.aStringArray2 != null) {
								for (local218 = 4; local218 >= 0; local218--) {
									if (local91.aStringArray2[local218] != null) {
										this.aStringArray13[this.anInt933] = local91.aStringArray2[local218] + " @cya@" + local91.aString6;
										if (local218 == 0) {
											this.anIntArray274[this.anInt933] = 694;
										}
										if (local218 == 1) {
											this.anIntArray274[this.anInt933] = 232;
										}
										if (local218 == 2) {
											this.anIntArray274[this.anInt933] = 308;
										}
										if (local218 == 3) {
											this.anIntArray274[this.anInt933] = 293;
										}
										if (local218 == 4) {
											this.anIntArray274[this.anInt933] = 1952;
										}
										this.anIntArray275[this.anInt933] = local49;
										this.anIntArray272[this.anInt933] = local53;
										this.anIntArray273[this.anInt933] = local59;
										this.anInt933++;
									}
								}
							}
							this.aStringArray13[this.anInt933] = "Examine @cya@" + local91.aString6;
							this.anIntArray274[this.anInt933] = 1439;
							this.anIntArray275[this.anInt933] = local91.anInt307 << 14;
							this.anIntArray272[this.anInt933] = local53;
							this.anIntArray273[this.anInt933] = local59;
							this.anInt933++;
						} else if ((this.anInt1040 & 0x4) == 4) {
							this.aStringArray13[this.anInt933] = this.aString27 + " @cya@" + local91.aString6;
							this.anIntArray274[this.anInt933] = 214;
							this.anIntArray275[this.anInt933] = local49;
							this.anIntArray272[this.anInt933] = local53;
							this.anIntArray273[this.anInt933] = local59;
							this.anInt933++;
						}
					}
					@Pc(398) Class6_Sub2_Sub1_Sub1_Sub1 local398;
					@Pc(446) Class6_Sub2_Sub1_Sub1_Sub2 local446;
					@Pc(436) int local436;
					if (local65 == 1) {
						@Pc(369) Class6_Sub2_Sub1_Sub1_Sub1 local369 = this.aClass6_Sub2_Sub1_Sub1_Sub1Array1[local71];
						if (local369.aClass2_1.aByte2 == 1 && (local369.anInt699 & 0x7F) == 64 && (local369.anInt700 & 0x7F) == 64) {
							for (local218 = 0; local218 < this.anInt886; local218++) {
								local398 = this.aClass6_Sub2_Sub1_Sub1_Sub1Array1[this.anIntArray222[local218]];
								if (local398 != null && local398 != local369 && local398.aClass2_1.aByte2 == 1 && local398.anInt699 == local369.anInt699 && local398.anInt700 == local369.anInt700) {
									this.method625(local53, local59, local398.aClass2_1, this.anIntArray222[local218]);
								}
							}
							for (local436 = 0; local436 < this.anInt1024; local436++) {
								local446 = this.aClass6_Sub2_Sub1_Sub1_Sub2Array1[this.anIntArray257[local436]];
								if (local446 != null && local446.anInt699 == local369.anInt699 && local446.anInt700 == local369.anInt700) {
									this.method602(local446, this.anIntArray257[local436], local59, local53);
								}
							}
						}
						this.method625(local53, local59, local369.aClass2_1, local71);
					}
					if (local65 == 0) {
						@Pc(488) Class6_Sub2_Sub1_Sub1_Sub2 local488 = this.aClass6_Sub2_Sub1_Sub1_Sub2Array1[local71];
						if ((local488.anInt699 & 0x7F) == 64 && (local488.anInt700 & 0x7F) == 64) {
							for (local218 = 0; local218 < this.anInt886; local218++) {
								local398 = this.aClass6_Sub2_Sub1_Sub1_Sub1Array1[this.anIntArray222[local218]];
								if (local398 != null && local398.aClass2_1.aByte2 == 1 && local398.anInt699 == local488.anInt699 && local398.anInt700 == local488.anInt700) {
									this.method625(local53, local59, local398.aClass2_1, this.anIntArray222[local218]);
								}
							}
							for (local436 = 0; local436 < this.anInt1024; local436++) {
								local446 = this.aClass6_Sub2_Sub1_Sub1_Sub2Array1[this.anIntArray257[local436]];
								if (local446 != null && local446 != local488 && local446.anInt699 == local488.anInt699 && local446.anInt700 == local488.anInt700) {
									this.method602(local446, this.anIntArray257[local436], local59, local53);
								}
							}
						}
						this.method602(local488, local71, local59, local53);
					}
					if (local65 == 3) {
						@Pc(607) Class13 local607 = this.aClass13ArrayArrayArray1[this.anInt1074][local53][local59];
						if (local607 != null) {
							for (@Pc(614) Class6_Sub2_Sub1_Sub5 local614 = (Class6_Sub2_Sub1_Sub5) local607.method114(); local614 != null; local614 = (Class6_Sub2_Sub1_Sub5) local607.method116((byte) 6)) {
								@Pc(620) Class43 local620 = Class43.method464(local614.anInt472);
								if (this.anInt894 == 1) {
									this.aStringArray13[this.anInt933] = "Use " + this.aString20 + " with @lre@" + local620.aString9;
									this.anIntArray274[this.anInt933] = 762;
									this.anIntArray275[this.anInt933] = local614.anInt472;
									this.anIntArray272[this.anInt933] = local53;
									this.anIntArray273[this.anInt933] = local59;
									this.anInt933++;
								} else if (this.anInt1038 != 1) {
									for (@Pc(737) int local737 = 4; local737 >= 0; local737--) {
										if (local620.aStringArray6 != null && local620.aStringArray6[local737] != null) {
											this.aStringArray13[this.anInt933] = local620.aStringArray6[local737] + " @lre@" + local620.aString9;
											if (local737 == 0) {
												this.anIntArray274[this.anInt933] = 873;
											}
											if (local737 == 1) {
												this.anIntArray274[this.anInt933] = 852;
											}
											if (local737 == 2) {
												this.anIntArray274[this.anInt933] = 752;
											}
											if (local737 == 3) {
												this.anIntArray274[this.anInt933] = 24;
											}
											if (local737 == 4) {
												this.anIntArray274[this.anInt933] = 64;
											}
											this.anIntArray275[this.anInt933] = local614.anInt472;
											this.anIntArray272[this.anInt933] = local53;
											this.anIntArray273[this.anInt933] = local59;
											this.anInt933++;
										} else if (local737 == 2) {
											this.aStringArray13[this.anInt933] = "Take @lre@" + local620.aString9;
											this.anIntArray274[this.anInt933] = 752;
											this.anIntArray275[this.anInt933] = local614.anInt472;
											this.anIntArray272[this.anInt933] = local53;
											this.anIntArray273[this.anInt933] = local59;
											this.anInt933++;
										}
									}
									this.aStringArray13[this.anInt933] = "Examine @lre@" + local620.aString9;
									this.anIntArray274[this.anInt933] = 1288;
									this.anIntArray275[this.anInt933] = local614.anInt472;
									this.anIntArray272[this.anInt933] = local53;
									this.anIntArray273[this.anInt933] = local59;
									this.anInt933++;
								} else if ((this.anInt1040 & 0x1) == 1) {
									this.aStringArray13[this.anInt933] = this.aString27 + " @lre@" + local620.aString9;
									this.anIntArray274[this.anInt933] = 985;
									this.anIntArray275[this.anInt933] = local614.anInt472;
									this.anIntArray272[this.anInt933] = local53;
									this.anIntArray273[this.anInt933] = local59;
									this.anInt933++;
								}
							}
						}
					}
				}
			}
			this.aBoolean266 &= true;
		} catch (@Pc(950) RuntimeException local950) {
			signlink.reporterror("2929, " + true + ", " + local950.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!NQUAUMDT;II)V")
	private void method634(@OriginalArg(0) Class6_Sub2_Sub3 arg0, @OriginalArg(2) int arg1) {
		try {
			@Pc(6) int local6 = arg0.method273(739, 8);
			@Pc(10) int local10 = arg1 + 0;
			@Pc(16) int local16;
			if (local6 < this.anInt1024) {
				for (local16 = local6; local16 < this.anInt1024; local16++) {
					this.anIntArray255[this.anInt1016++] = this.anIntArray257[local16];
				}
			}
			if (local6 > this.anInt1024) {
				signlink.reporterror(this.aString28 + " Too many players");
				throw new RuntimeException("eek");
			}
			this.anInt1024 = 0;
			for (local16 = 0; local16 < local6; local16++) {
				@Pc(68) int local68 = this.anIntArray257[local16];
				@Pc(73) Class6_Sub2_Sub1_Sub1_Sub2 local73 = this.aClass6_Sub2_Sub1_Sub1_Sub2Array1[local68];
				@Pc(78) int local78 = arg0.method273(739, 1);
				if (local78 == 0) {
					this.anIntArray257[this.anInt1024++] = local68;
					local73.anInt714 = anInt1077;
				} else {
					@Pc(101) int local101 = arg0.method273(739, 2);
					if (local101 == 0) {
						this.anIntArray257[this.anInt1024++] = local68;
						local73.anInt714 = anInt1077;
						this.anIntArray258[this.anInt1025++] = local68;
					} else {
						@Pc(152) int local152;
						@Pc(162) int local162;
						if (local101 == 1) {
							this.anIntArray257[this.anInt1024++] = local68;
							local73.anInt714 = anInt1077;
							local152 = arg0.method273(739, 3);
							local73.method506(false, local152);
							local162 = arg0.method273(739, 1);
							if (local162 == 1) {
								this.anIntArray258[this.anInt1025++] = local68;
							}
						} else if (local101 == 2) {
							this.anIntArray257[this.anInt1024++] = local68;
							local73.anInt714 = anInt1077;
							local152 = arg0.method273(739, 3);
							local73.method506(true, local152);
							local162 = arg0.method273(739, 3);
							local73.method506(true, local162);
							@Pc(220) int local220 = arg0.method273(739, 1);
							if (local220 == 1) {
								this.anIntArray258[this.anInt1025++] = local68;
							}
						} else if (local101 == 3) {
							this.anIntArray255[this.anInt1016++] = local68;
						}
					}
				}
			}
		} catch (@Pc(257) RuntimeException local257) {
			signlink.reporterror("74553, " + arg0 + ", " + 0 + ", " + arg1 + ", " + local257.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "o", descriptor = "(I)V")
	private void method635() {
		try {
			this.anInt879 += 0;
			if (this.anInt1004 == 0) {
				@Pc(12) int local12 = super.anInt838;
				if (this.anInt1038 == 1 && super.anInt839 >= 516 && super.anInt840 >= 160 && super.anInt839 <= 765 && super.anInt840 <= 205) {
					local12 = 0;
				}
				@Pc(43) int local43;
				@Pc(46) int local46;
				@Pc(122) int local122;
				if (this.aBoolean264) {
					if (local12 != 1) {
						local43 = super.anInt833;
						local46 = super.anInt834;
						if (this.anInt866 == 0) {
							local43 -= 4;
							local46 -= 4;
						}
						if (this.anInt866 == 1) {
							local43 -= 553;
							local46 -= 205;
						}
						if (this.anInt866 == 2) {
							local43 -= 17;
							local46 -= 357;
						}
						if (local43 < this.anInt867 - 10 || local43 > this.anInt867 + this.anInt869 + 10 || local46 < this.anInt868 - 10 || local46 > this.anInt868 + this.anInt870 + 10) {
							this.aBoolean264 = false;
							if (this.anInt866 == 1) {
								this.aBoolean279 = true;
							}
							if (this.anInt866 == 2) {
								this.aBoolean282 = true;
							}
						}
					}
					if (local12 == 1) {
						local43 = this.anInt867;
						local46 = this.anInt868;
						local122 = this.anInt869;
						@Pc(125) int local125 = super.anInt839;
						@Pc(128) int local128 = super.anInt840;
						if (this.anInt866 == 0) {
							local125 -= 4;
							local128 -= 4;
						}
						if (this.anInt866 == 1) {
							local125 -= 553;
							local128 -= 205;
						}
						if (this.anInt866 == 2) {
							local125 -= 17;
							local128 -= 357;
						}
						@Pc(147) int local147 = -1;
						for (@Pc(149) int local149 = 0; local149 < this.anInt933; local149++) {
							@Pc(164) int local164 = local46 + (this.anInt933 - 1 - local149) * 15 + 31;
							if (local125 > local43 && local125 < local43 + local122 && local128 > local164 - 13 && local128 < local164 + 3) {
								local147 = local149;
							}
						}
						if (local147 != -1) {
							this.method722(local147);
						}
						this.aBoolean264 = false;
						if (this.anInt866 == 1) {
							this.aBoolean279 = true;
						}
						if (this.anInt866 == 2) {
							this.aBoolean282 = true;
							return;
						}
					}
				} else {
					if (local12 == 1 && this.anInt933 > 0) {
						local43 = this.anIntArray274[this.anInt933 - 1];
						if (local43 == 236 || local43 == 29 || local43 == 651 || local43 == 605 || local43 == 490 || local43 == 504 || local43 == 486 || local43 == 18 || local43 == 675 || local43 == 393 || local43 == 871 || local43 == 1910) {
							local46 = this.anIntArray272[this.anInt933 - 1];
							local122 = this.anIntArray273[this.anInt933 - 1];
							@Pc(283) Class44 local283 = Class44.method496(local122);
							if (local283.aBoolean192 || local283.aBoolean187) {
								this.aBoolean260 = false;
								this.anInt849 = 0;
								this.anInt1002 = local122;
								this.anInt1003 = local46;
								this.anInt1004 = 2;
								this.anInt1005 = super.anInt839;
								this.anInt1006 = super.anInt840;
								if (Class44.method496(local122).anInt644 == this.anInt994) {
									this.anInt1004 = 1;
								}
								if (Class44.method496(local122).anInt644 == this.anInt983) {
									this.anInt1004 = 3;
								}
								return;
							}
						}
					}
					if (local12 == 1 && (this.anInt921 == 1 || this.method613(this.anInt966, this.anInt933 - 1)) && this.anInt933 > 2) {
						local12 = 2;
					}
					if (local12 == 1 && this.anInt933 > 0) {
						this.method722(this.anInt933 - 1);
					}
					if (local12 != 2 || this.anInt933 <= 0) {
						return;
					}
					this.method679();
				}
			}
		} catch (@Pc(377) RuntimeException local377) {
			signlink.reporterror("72189, " + 0 + ", " + local377.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "p", descriptor = "(I)V")
	private void method636() {
		try {
			signlink.aBoolean284 = false;
			signlink.anInt1087 = 0;
			signlink.midi = "stop";
		} catch (@Pc(14) RuntimeException local14) {
			signlink.reporterror("54099, " + 6 + ", " + local14.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "q", descriptor = "(I)V")
	private void method637(@OriginalArg(0) int arg0) {
		try {
			if (arg0 == 0) {
				@Pc(14) int local14;
				@Pc(21) int local21;
				if (this.anInt884 == 0) {
					local14 = super.anInt829 / 2 - 80;
					local21 = super.anInt830 / 2 + 20;
					local21 += 20;
					if (super.anInt838 == 1 && super.anInt839 >= local14 - 75 && super.anInt839 <= local14 + 75 && super.anInt840 >= local21 - 20 && super.anInt840 <= local21 + 20) {
						this.anInt884 = 3;
						this.anInt1063 = 0;
					}
					local14 = super.anInt829 / 2 + 80;
					if (super.anInt838 == 1 && super.anInt839 >= local14 - 75 && super.anInt839 <= local14 + 75 && super.anInt840 >= local21 - 20 && super.anInt840 <= local21 + 20) {
						this.aString25 = "";
						this.aString26 = "Enter your username & password.";
						this.anInt884 = 2;
						this.anInt1063 = 0;
					}
				} else if (this.anInt884 == 2) {
					local14 = super.anInt830 / 2 - 40;
					local14 += 30;
					local14 += 25;
					if (super.anInt838 == 1 && super.anInt840 >= local14 - 15 && super.anInt840 < local14) {
						this.anInt1063 = 0;
					}
					local14 += 15;
					if (super.anInt838 == 1 && super.anInt840 >= local14 - 15 && super.anInt840 < local14) {
						this.anInt1063 = 1;
					}
					local14 += 15;
					local21 = super.anInt829 / 2 - 80;
					@Pc(167) int local167 = super.anInt830 / 2 + 50;
					@Pc(168) int local168 = local167 + 20;
					if (super.anInt838 == 1 && super.anInt839 >= local21 - 75 && super.anInt839 <= local21 + 75 && super.anInt840 >= local168 - 20 && super.anInt840 <= local168 + 20) {
						this.anInt936 = 0;
						this.method609(this.aString28, this.aString29, false);
						if (this.aBoolean266) {
							return;
						}
					}
					local21 = super.anInt829 / 2 + 80;
					if (super.anInt838 == 1 && super.anInt839 >= local21 - 75 && super.anInt839 <= local21 + 75 && super.anInt840 >= local168 - 20 && super.anInt840 <= local168 + 20) {
						this.anInt884 = 0;
						this.aString28 = "";
						this.aString29 = "";
					}
					while (true) {
						while (true) {
							@Pc(258) int local258 = this.method580();
							if (local258 == -1) {
								return;
							}
							@Pc(263) boolean local263 = false;
							for (@Pc(265) int local265 = 0; local265 < aString21.length(); local265++) {
								if (local258 == aString21.charAt(local265)) {
									local263 = true;
									break;
								}
							}
							if (this.anInt1063 == 0) {
								if (local258 == 8 && this.aString28.length() > 0) {
									this.aString28 = this.aString28.substring(0, this.aString28.length() - 1);
								}
								if (local258 == 9 || local258 == 10 || local258 == 13) {
									this.anInt1063 = 1;
								}
								if (local263) {
									this.aString28 = this.aString28 + (char) local258;
								}
								if (this.aString28.length() > 12) {
									this.aString28 = this.aString28.substring(0, 12);
								}
							} else if (this.anInt1063 == 1) {
								if (local258 == 8 && this.aString29.length() > 0) {
									this.aString29 = this.aString29.substring(0, this.aString29.length() - 1);
								}
								if (local258 == 9 || local258 == 10 || local258 == 13) {
									this.anInt1063 = 0;
								}
								if (local263) {
									this.aString29 = this.aString29 + (char) local258;
								}
								if (this.aString29.length() > 20) {
									this.aString29 = this.aString29.substring(0, 20);
								}
							}
						}
					}
				} else if (this.anInt884 == 3) {
					local14 = super.anInt829 / 2;
					local21 = super.anInt830 / 2 + 50;
					@Pc(422) int local422 = local21 + 20;
					if (super.anInt838 == 1 && super.anInt839 >= local14 - 75 && super.anInt839 <= local14 + 75 && super.anInt840 >= local422 - 20 && super.anInt840 <= local422 + 20) {
						this.anInt884 = 0;
						return;
					}
				}
			}
		} catch (@Pc(455) RuntimeException local455) {
			signlink.reporterror("80580, " + arg0 + ", " + local455.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/String;ZILjava/lang/String;)V")
	private void method638(@OriginalArg(0) String arg0, @OriginalArg(2) int arg1, @OriginalArg(3) String arg2) {
		try {
			if (arg1 == 0 && this.anInt1053 != -1) {
				this.aString23 = arg2;
				super.anInt838 = 0;
			}
			if (this.anInt983 == -1) {
				this.aBoolean282 = true;
			}
			for (@Pc(20) int local20 = 99; local20 > 0; local20--) {
				this.anIntArray212[local20] = this.anIntArray212[local20 - 1];
				this.aStringArray8[local20] = this.aStringArray8[local20 - 1];
				this.aStringArray9[local20] = this.aStringArray9[local20 - 1];
			}
			this.anIntArray212[0] = arg1;
			this.aStringArray8[0] = arg0;
			this.aStringArray9[0] = arg2;
		} catch (@Pc(79) RuntimeException local79) {
			signlink.reporterror("99869, " + arg0 + ", " + false + ", " + arg1 + ", " + arg2 + ", " + local79.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(I[BI)Z")
	private boolean method639(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1) {
		try {
			this.anInt879 += 0;
			return arg1 == null ? true : signlink.wavesave(arg1, arg0);
		} catch (@Pc(14) RuntimeException local14) {
			signlink.reporterror("34053, " + arg0 + ", " + arg1 + ", " + 0 + ", " + local14.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIB)I")
	private int method640(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		try {
			@Pc(3) int local3 = arg0 >> 7;
			@Pc(7) int local7 = arg2 >> 7;
			if (local3 < 0 || local7 < 0 || local3 > 103 || local7 > 103) {
				return 0;
			}
			@Pc(21) int local21 = arg1;
			if (arg1 < 3 && (this.aByteArrayArrayArray8[1][local3][local7] & 0x2) == 2) {
				local21 = arg1 + 1;
			}
			@Pc(41) int local41 = arg0 & 0x7F;
			@Pc(45) int local45 = arg2 & 0x7F;
			@Pc(73) int local73 = this.anIntArrayArrayArray8[local21][local3][local7] * (128 - local41) + this.anIntArrayArrayArray8[local21][local3 + 1][local7] * local41 >> 7;
			@Pc(105) int local105 = this.anIntArrayArrayArray8[local21][local3][local7 + 1] * (128 - local41) + this.anIntArrayArrayArray8[local21][local3 + 1][local7 + 1] * local41 >> 7;
			return local73 * (128 - local45) + local105 * local45 >> 7;
		} catch (@Pc(124) RuntimeException local124) {
			signlink.reporterror("54589, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 117 + ", " + local124.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/String;)V")
	private void method641(@OriginalArg(0) String arg0) {
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

	@OriginalMember(owner = "client!client", name = "r", descriptor = "(I)V")
	private void method642() {
		try {
			this.aClass8_6.method58();
			Class6_Sub2_Sub2_Sub4.anIntArray206 = this.anIntArray266;
			this.aClass6_Sub2_Sub2_Sub3_15.method488(0, 0);
			if (this.anInt885 != -1) {
				this.method688(0, 0, Class44.method496(this.anInt885), 0);
			} else if (this.anIntArray256[this.anInt861] != -1) {
				this.method688(0, 0, Class44.method496(this.anIntArray256[this.anInt861]), 0);
			}
			if (this.aBoolean264 && this.anInt866 == 1) {
				this.method721();
			}
			this.aClass8_6.method59(super.aGraphics2, 205, 553);
			this.aClass8_8.method58();
			Class6_Sub2_Sub2_Sub4.anIntArray206 = this.anIntArray267;
		} catch (@Pc(79) RuntimeException local79) {
			signlink.reporterror("65648, " + 6 + ", " + local79.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "s", descriptor = "(I)V")
	private void method643() {
		try {
			System.out.println("============");
			System.out.println("flame-cycle:" + this.anInt1008);
			if (this.aClass25_Sub1_1 != null) {
				System.out.println("Od-cycle:" + this.aClass25_Sub1_1.anInt385);
			}
			System.out.println("loop-cycle:" + anInt1077);
			System.out.println("draw-cycle:" + anInt890);
			System.out.println("ptype:" + this.anInt880);
			System.out.println("psize:" + this.anInt879);
			if (this.aClass34_1 != null) {
				this.aClass34_1.method352();
			}
			super.aBoolean238 = true;
		} catch (@Pc(83) RuntimeException local83) {
			signlink.reporterror("35666, " + 2 + ", " + local83.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "f", descriptor = "(I)Ljava/awt/Component;")
	@Override
	protected Component method586() {
		try {
			if (this.anInt1034 != 0) {
				this.anInt848 = this.aClass18_2.method161();
			}
			if (signlink.mainapp == null) {
				return super.aFrame_Sub1_2 == null ? this : super.aFrame_Sub1_2;
			} else {
				return signlink.mainapp;
			}
		} catch (@Pc(21) RuntimeException local21) {
			signlink.reporterror("58263, " + 0 + ", " + local21.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ZLclient!VGGOSQRK;)Z")
	private boolean method644(@OriginalArg(1) Class44 arg0) {
		try {
			@Pc(4) int local4 = arg0.anInt615;
			if (this.anInt927 == 2) {
				if (local4 == 201) {
					this.aBoolean282 = true;
					this.anInt923 = 0;
					this.aBoolean241 = true;
					this.aString22 = "";
					this.anInt1041 = 1;
					this.aString24 = "Enter name of friend to add to list";
				}
				if (local4 == 202) {
					this.aBoolean282 = true;
					this.anInt923 = 0;
					this.aBoolean241 = true;
					this.aString22 = "";
					this.anInt1041 = 2;
					this.aString24 = "Enter name of friend to delete from list";
				}
			}
			if (local4 == 205) {
				this.anInt883 = 250;
				return true;
			}
			if (local4 == 501) {
				this.aBoolean282 = true;
				this.anInt923 = 0;
				this.aBoolean241 = true;
				this.aString22 = "";
				this.anInt1041 = 4;
				this.aString24 = "Enter name of player to add to list";
			}
			if (local4 == 502) {
				this.aBoolean282 = true;
				this.anInt923 = 0;
				this.aBoolean241 = true;
				this.aString22 = "";
				this.anInt1041 = 5;
				this.aString24 = "Enter name of player to delete from list";
			}
			@Pc(122) int local122;
			@Pc(126) int local126;
			@Pc(131) int local131;
			if (local4 >= 300 && local4 <= 313) {
				local122 = (local4 - 300) / 2;
				local126 = local4 & 0x1;
				local131 = this.anIntArray220[local122];
				if (local131 != -1) {
					while (true) {
						if (local126 == 0) {
							local131--;
							if (local131 < 0) {
								local131 = Class40.anInt508 - 1;
							}
						}
						if (local126 == 1) {
							local131++;
							if (local131 >= Class40.anInt508) {
								local131 = 0;
							}
						}
						if (!Class40.aClass40Array1[local131].aBoolean166 && Class40.aClass40Array1[local131].anInt509 == local122 + (this.aBoolean244 ? 0 : 7)) {
							this.anIntArray220[local122] = local131;
							this.aBoolean248 = true;
							break;
						}
					}
				}
			}
			if (local4 >= 314 && local4 <= 323) {
				local122 = (local4 - 314) / 2;
				local126 = local4 & 0x1;
				local131 = this.anIntArray250[local122];
				if (local126 == 0) {
					local131--;
					if (local131 < 0) {
						local131 = anIntArrayArray22[local122].length - 1;
					}
				}
				if (local126 == 1) {
					local131++;
					if (local131 >= anIntArrayArray22[local122].length) {
						local131 = 0;
					}
				}
				this.anIntArray250[local122] = local131;
				this.aBoolean248 = true;
			}
			if (local4 == 324 && !this.aBoolean244) {
				this.aBoolean244 = true;
				this.method661();
			}
			if (local4 == 325 && this.aBoolean244) {
				this.aBoolean244 = false;
				this.method661();
			}
			if (local4 == 326) {
				this.aClass6_Sub2_Sub3_8.method251(254);
				this.aClass6_Sub2_Sub3_8.method252(this.aBoolean244 ? 0 : 1);
				for (local122 = 0; local122 < 7; local122++) {
					this.aClass6_Sub2_Sub3_8.method252(this.anIntArray220[local122]);
				}
				for (local126 = 0; local126 < 5; local126++) {
					this.aClass6_Sub2_Sub3_8.method252(this.anIntArray250[local126]);
				}
				return true;
			}
			if (local4 == 620) {
				this.aBoolean253 = !this.aBoolean253;
			}
			if (local4 >= 601 && local4 <= 613) {
				this.method725();
				if (this.aString19.length() > 0) {
					this.aClass6_Sub2_Sub3_8.method251(251);
					this.aClass6_Sub2_Sub3_8.method258(Class39.method359(this.aString19));
					this.aClass6_Sub2_Sub3_8.method252(local4 - 601);
					this.aClass6_Sub2_Sub3_8.method252(this.aBoolean253 ? 1 : 0);
				}
			}
			return false;
		} catch (@Pc(359) RuntimeException local359) {
			signlink.reporterror("75699, " + false + ", " + arg0 + ", " + local359.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "t", descriptor = "(I)V")
	private void method645(@OriginalArg(0) int arg0) {
		try {
			if (arg0 == 43335) {
				while (true) {
					@Pc(9) Class6_Sub2_Sub4 local9 = this.aClass25_Sub1_1.method243();
					if (local9 == null) {
						return;
					}
					if (local9.anInt670 == 0) {
						Class6_Sub2_Sub1_Sub3.method131(local9.aByteArray14, local9.anInt669);
						if ((this.aClass25_Sub1_1.method229(local9.anInt669) & 0x62) != 0) {
							this.aBoolean279 = true;
							if (this.anInt983 != -1 || this.anInt1053 != -1) {
								this.aBoolean282 = true;
							}
						}
					}
					if (local9.anInt670 == 1 && local9.aByteArray14 != null) {
						Class48.method533(local9.aByteArray14);
					}
					if (local9.anInt670 == 2 && local9.anInt669 == this.anInt1062 && local9.aByteArray14 != null) {
						this.method654(this.aBoolean276, local9.aByteArray14);
					}
					if (local9.anInt670 == 3 && this.anInt1018 == 1) {
						for (@Pc(84) int local84 = 0; local84 < this.aByteArrayArray5.length; local84++) {
							if (this.anIntArray238[local84] == local9.anInt669) {
								this.aByteArrayArray5[local84] = local9.aByteArray14;
								if (local9.aByteArray14 == null) {
									this.anIntArray238[local84] = -1;
								}
								break;
							}
							if (this.anIntArray239[local84] == local9.anInt669) {
								this.aByteArrayArray6[local84] = local9.aByteArray14;
								if (local9.aByteArray14 == null) {
									this.anIntArray239[local84] = -1;
								}
								break;
							}
						}
					}
					if (local9.anInt670 == 93 && this.aClass25_Sub1_1.method234(local9.anInt669)) {
						Class27.method301(new Class6_Sub2_Sub3(-587, local9.aByteArray14), this.aClass25_Sub1_1);
					}
				}
			}
		} catch (@Pc(161) RuntimeException local161) {
			signlink.reporterror("27976, " + arg0 + ", " + local161.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "u", descriptor = "(I)V")
	private void method646(@OriginalArg(0) int arg0) {
		try {
			if (this.anInt847 > 1) {
				this.anInt847--;
			}
			if (this.anInt883 > 0) {
				this.anInt883--;
			}
			for (@Pc(22) int local22 = 0; local22 < 5 && this.method598(); local22++) {
			}
			if (this.aBoolean266) {
				@Pc(41) Object local41 = this.aClass36_1.anObject1;
				@Pc(66) int local66;
				@Pc(68) int local68;
				@Pc(70) int local70;
				@Pc(103) int local103;
				synchronized (this.aClass36_1.anObject1) {
					if (!aBoolean245) {
						this.aClass36_1.anInt473 = 0;
					} else if (super.anInt838 != 0 || this.aClass36_1.anInt473 >= 40) {
						this.aClass6_Sub2_Sub3_8.method251(155);
						this.aClass6_Sub2_Sub3_8.method252(0);
						local66 = this.aClass6_Sub2_Sub3_8.anInt404;
						local68 = 0;
						@Pc(86) int local86;
						for (local70 = 0; local70 < this.aClass36_1.anInt473 && local66 - this.aClass6_Sub2_Sub3_8.anInt404 < 240; local70++) {
							local68++;
							local86 = this.aClass36_1.anIntArray136[local70];
							if (local86 < 0) {
								local86 = 0;
							} else if (local86 > 502) {
								local86 = 502;
							}
							local103 = this.aClass36_1.anIntArray135[local70];
							if (local103 < 0) {
								local103 = 0;
							} else if (local103 > 764) {
								local103 = 764;
							}
							@Pc(120) int local120 = local86 * 765 + local103;
							if (this.aClass36_1.anIntArray136[local70] == -1 && this.aClass36_1.anIntArray135[local70] == -1) {
								local103 = -1;
								local86 = -1;
								local120 = 524287;
							}
							if (local103 != this.anInt1075 || local86 != this.anInt1076) {
								@Pc(165) int local165 = local103 - this.anInt1075;
								this.anInt1075 = local103;
								@Pc(173) int local173 = local86 - this.anInt1076;
								this.anInt1076 = local86;
								if (this.anInt855 < 8 && local165 >= -32 && local165 <= 31 && local173 >= -32 && local173 <= 31) {
									local165 += 32;
									local173 += 32;
									this.aClass6_Sub2_Sub3_8.method253((this.anInt855 << 12) + (local165 << 6) + local173);
									this.anInt855 = 0;
								} else if (this.anInt855 < 8) {
									this.aClass6_Sub2_Sub3_8.method255((this.anInt855 << 19) + local120 + 8388608);
									this.anInt855 = 0;
								} else {
									this.aClass6_Sub2_Sub3_8.method256((this.anInt855 << 19) + local120 - 1073741824);
									this.anInt855 = 0;
								}
							} else if (this.anInt855 < 2047) {
								this.anInt855++;
							}
						}
						this.aClass6_Sub2_Sub3_8.method261(this.aClass6_Sub2_Sub3_8.anInt404 - local66);
						if (local68 >= this.aClass36_1.anInt473) {
							this.aClass36_1.anInt473 = 0;
						} else {
							this.aClass36_1.anInt473 -= local68;
							for (local86 = 0; local86 < this.aClass36_1.anInt473; local86++) {
								this.aClass36_1.anIntArray135[local86] = this.aClass36_1.anIntArray135[local86 + local68];
								this.aClass36_1.anIntArray136[local86] = this.aClass36_1.anIntArray136[local86 + local68];
							}
						}
					}
				}
				if (super.anInt838 != 0) {
					@Pc(336) long local336 = (super.aLong28 - this.aLong30) / 50L;
					if (local336 > 4095L) {
						local336 = 4095L;
					}
					this.aLong30 = super.aLong28;
					local66 = super.anInt840;
					if (local66 < 0) {
						local66 = 0;
					} else if (local66 > 502) {
						local66 = 502;
					}
					local68 = super.anInt839;
					if (local68 < 0) {
						local68 = 0;
					} else if (local68 > 764) {
						local68 = 764;
					}
					local70 = local66 * 765 + local68;
					@Pc(382) byte local382 = 0;
					if (super.anInt838 == 2) {
						local382 = 1;
					}
					local103 = (int) local336;
					this.aClass6_Sub2_Sub3_8.method251(30);
					this.aClass6_Sub2_Sub3_8.method295((local103 << 20) + (local382 << 19) + local70);
				}
				if (this.anInt854 > 0) {
					this.anInt854--;
				}
				if (super.anIntArray210[1] == 1 || super.anIntArray210[2] == 1 || super.anIntArray210[3] == 1 || super.anIntArray210[4] == 1) {
					this.aBoolean242 = true;
				}
				if (this.aBoolean242 && this.anInt854 <= 0) {
					this.anInt854 = 20;
					this.aBoolean242 = false;
					this.aClass6_Sub2_Sub3_8.method251(10);
					this.aClass6_Sub2_Sub3_8.method287(this.anInt962);
					this.aClass6_Sub2_Sub3_8.method288(this.anInt963);
				}
				if (super.aBoolean240 && !this.aBoolean258) {
					this.aBoolean258 = true;
					this.aClass6_Sub2_Sub3_8.method251(153);
					this.aClass6_Sub2_Sub3_8.method252(1);
				}
				if (!super.aBoolean240 && this.aBoolean258) {
					this.aBoolean258 = false;
					this.aClass6_Sub2_Sub3_8.method251(153);
					this.aClass6_Sub2_Sub3_8.method252(0);
				}
				this.method670();
				this.method727();
				this.method695();
				this.anInt881++;
				if (this.anInt881 > 750) {
					this.method590();
				}
				this.method672();
				this.method614();
				this.method686();
				this.anInt860++;
				if (this.anInt1073 != 0) {
					this.anInt1072 += 20;
					if (this.anInt1072 >= 400) {
						this.anInt1073 = 0;
					}
				}
				if (this.anInt914 != 0) {
					this.anInt911++;
					if (this.anInt911 >= 15) {
						if (this.anInt914 == 2) {
							this.aBoolean279 = true;
						}
						if (this.anInt914 == 3) {
							this.aBoolean282 = true;
						}
						this.anInt914 = 0;
					}
				}
				if (this.anInt1004 != 0) {
					this.anInt849++;
					if (super.anInt833 > this.anInt1005 + 5 || super.anInt833 < this.anInt1005 - 5 || super.anInt834 > this.anInt1006 + 5 || super.anInt834 < this.anInt1006 - 5) {
						this.aBoolean260 = true;
					}
					if (super.anInt832 == 0) {
						if (this.anInt1004 == 2) {
							this.aBoolean279 = true;
						}
						if (this.anInt1004 == 3) {
							this.aBoolean282 = true;
						}
						this.anInt1004 = 0;
						if (this.aBoolean260 && this.anInt849 >= 5) {
							this.anInt959 = -1;
							this.method626();
							if (this.anInt959 == this.anInt1002 && this.anInt958 != this.anInt1003) {
								@Pc(684) Class44 local684 = Class44.method496(this.anInt1002);
								@Pc(686) byte local686 = 0;
								if (this.anInt935 == 1 && local684.anInt615 == 206) {
									local686 = 1;
								}
								if (local684.anIntArray173[this.anInt958] <= 0) {
									local686 = 0;
								}
								if (local684.aBoolean187) {
									local66 = this.anInt1003;
									local68 = this.anInt958;
									local684.anIntArray173[local68] = local684.anIntArray173[local66];
									local684.anIntArray179[local68] = local684.anIntArray179[local66];
									local684.anIntArray173[local66] = -1;
									local684.anIntArray179[local66] = 0;
								} else if (local686 == 1) {
									local66 = this.anInt1003;
									local68 = this.anInt958;
									while (local66 != local68) {
										if (local66 > local68) {
											local684.method490(this.anInt922, local66, local66 - 1);
											local66--;
										} else if (local66 < local68) {
											local684.method490(this.anInt922, local66, local66 + 1);
											local66++;
										}
									}
								} else {
									local684.method490(this.anInt922, this.anInt1003, this.anInt958);
								}
								this.aClass6_Sub2_Sub3_8.method251(140);
								this.aClass6_Sub2_Sub3_8.method253(this.anInt1003);
								this.aClass6_Sub2_Sub3_8.method279(local686);
								this.aClass6_Sub2_Sub3_8.method287(this.anInt1002);
								this.aClass6_Sub2_Sub3_8.method253(this.anInt958);
							}
						} else if ((this.anInt921 == 1 || this.method613(this.anInt966, this.anInt933 - 1)) && this.anInt933 > 2) {
							this.method679();
						} else if (this.anInt933 > 0) {
							this.method722(this.anInt933 - 1);
						}
						this.anInt911 = 10;
						super.anInt838 = 0;
					}
				}
				@Pc(862) int local862;
				@Pc(864) int local864;
				if (Class41.anInt537 != -1) {
					local862 = Class41.anInt537;
					local864 = Class41.anInt538;
					@Pc(885) boolean local885 = this.method719(0, 0, local864, 0, aClass6_Sub2_Sub1_Sub1_Sub2_1.anIntArray183[0], 0, local862, 0, true, 0, aClass6_Sub2_Sub1_Sub1_Sub2_1.anIntArray182[0]);
					Class41.anInt537 = -1;
					if (local885) {
						this.anInt1070 = super.anInt839;
						this.anInt1071 = super.anInt840;
						this.anInt1073 = 1;
						this.anInt1072 = 0;
					}
				}
				if (super.anInt838 == 1 && this.aString23 != null) {
					this.aString23 = null;
					this.aBoolean282 = true;
					super.anInt838 = 0;
				}
				this.method635();
				if (this.anInt924 == -1) {
					this.method589();
					this.method674();
					this.method691();
				}
				if (super.anInt832 == 1 || super.anInt838 == 1) {
					this.anInt989++;
				}
				if (this.anInt984 == 0 && this.anInt920 == 0 && this.anInt1051 == 0) {
					if (this.anInt1060 > 0) {
						this.anInt1060--;
					}
				} else if (this.anInt1060 < 100) {
					this.anInt1060++;
					if (this.anInt1060 == 100) {
						if (this.anInt984 != 0) {
							this.aBoolean282 = true;
						}
						if (this.anInt920 != 0) {
							this.aBoolean279 = true;
						}
					}
				}
				if (this.anInt1018 == 2) {
					this.method692();
				}
				if (this.anInt1018 == 2 && this.aBoolean273) {
					this.method690();
				}
				for (local862 = 0; local862 < 5; local862++) {
					@Pc(1021) int local1021 = this.anIntArray269[local862]++;
				}
				this.method713();
				super.anInt831++;
				if (super.anInt831 > 4500) {
					this.anInt883 = 250;
					super.anInt831 -= 500;
					this.aClass6_Sub2_Sub3_8.method251(200);
				}
				this.anInt1013++;
				if (this.anInt1013 > 500) {
					this.anInt1013 = 0;
					local864 = (int) (Math.random() * 8.0D);
					if ((local864 & 0x1) == 1) {
						this.anInt908 += this.anInt909;
					}
					if ((local864 & 0x2) == 2) {
						this.anInt929 += this.anInt930;
					}
					if ((local864 & 0x4) == 4) {
						this.anInt978 += this.anInt979;
					}
				}
				if (this.anInt908 < -50) {
					this.anInt909 = 2;
				}
				if (this.anInt908 > 50) {
					this.anInt909 = -2;
				}
				if (this.anInt929 < -55) {
					this.anInt930 = 2;
				}
				if (this.anInt929 > 55) {
					this.anInt930 = -2;
				}
				if (this.anInt978 < -40) {
					this.anInt979 = 1;
				}
				if (this.anInt978 > 40) {
					this.anInt979 = -1;
				}
				this.anInt857++;
				@Pc(1161) boolean local1161 = false;
				if (this.anInt857 > 500) {
					this.anInt857 = 0;
					local864 = (int) (Math.random() * 8.0D);
					if ((local864 & 0x1) == 1) {
						this.anInt903 += this.anInt904;
					}
					if ((local864 & 0x2) == 2) {
						this.anInt844 += this.anInt845;
					}
				}
				if (this.anInt903 < -60) {
					this.anInt904 = 2;
				}
				if (this.anInt903 > 60) {
					this.anInt904 = -2;
				}
				if (this.anInt844 < -20) {
					this.anInt845 = 1;
				}
				if (this.anInt844 > 10) {
					this.anInt845 = -1;
				}
				this.anInt882++;
				if (this.anInt882 > 50) {
					this.aClass6_Sub2_Sub3_8.method251(28);
				}
				try {
					if (this.aClass34_1 != null && this.aClass6_Sub2_Sub3_8.anInt404 > 0) {
						this.aClass34_1.method351(this.aClass6_Sub2_Sub3_8.aByteArray9, this.aClass6_Sub2_Sub3_8.anInt404);
						this.aClass6_Sub2_Sub3_8.anInt404 = 0;
						this.anInt882 = 0;
					}
				} catch (@Pc(1267) IOException local1267) {
					this.method590();
				} catch (@Pc(1272) Exception local1272) {
					this.method594();
				}
			}
		} catch (@Pc(1277) RuntimeException local1277) {
			signlink.reporterror("77504, " + arg0 + ", " + local1277.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "v", descriptor = "(I)V")
	private void method648() {
		try {
			this.aBoolean275 = false;
			while (this.aBoolean274) {
				this.aBoolean275 = false;
				try {
					Thread.sleep(50L);
				} catch (@Pc(11) Exception local11) {
				}
			}
			this.aClass6_Sub2_Sub2_Sub3_11 = null;
			this.aClass6_Sub2_Sub2_Sub3_12 = null;
			this.aClass6_Sub2_Sub2_Sub3Array2 = null;
			this.anIntArray223 = null;
			this.anIntArray224 = null;
			this.anIntArray225 = null;
			this.anIntArray226 = null;
			this.anIntArray229 = null;
			this.anIntArray230 = null;
			this.anIntArray263 = null;
			this.anIntArray264 = null;
			this.aClass6_Sub2_Sub2_Sub1_16 = null;
			this.aClass6_Sub2_Sub2_Sub1_17 = null;
		} catch (@Pc(60) RuntimeException local60) {
			signlink.reporterror("36258, " + 1 + ", " + local60.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "f", descriptor = "(B)V")
	private void method649() {
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
				this.anInt888 = -1;
				this.aClass13_12.method117();
				this.aClass13_11.method117();
				Class6_Sub2_Sub2_Sub4.method562();
				this.method706();
				this.aClass41_1.method402();
				System.gc();
				for (local22 = 0; local22 < 4; local22++) {
					this.aClass47Array1[local22].method514();
				}
				for (local35 = 0; local35 < 4; local35++) {
					for (local39 = 0; local39 < 104; local39++) {
						for (local43 = 0; local43 < 104; local43++) {
							this.aByteArrayArrayArray8[local35][local39][local43] = 0;
						}
					}
				}
				@Pc(77) Class27 local77 = new Class27(104, (byte) 8, this.anIntArrayArrayArray8, 104, this.aByteArrayArrayArray8);
				local43 = this.aByteArrayArray5.length;
				this.aClass6_Sub2_Sub3_8.method251(28);
				@Pc(238) int local238;
				@Pc(226) int local226;
				if (!this.aBoolean246) {
					@Pc(122) byte[] local122;
					for (local91 = 0; local91 < local43; local91++) {
						local105 = (this.anIntArray237[local91] >> 8) * 64 - this.anInt945;
						local117 = (this.anIntArray237[local91] & 0xFF) * 64 - this.anInt946;
						local122 = this.aByteArrayArray5[local91];
						if (local122 != null) {
							local77.method306(local117, local105, this.aClass47Array1, local122, (this.anInt950 - 6) * 8, (this.anInt949 - 6) * 8);
						}
					}
					for (local105 = 0; local105 < local43; local105++) {
						local117 = (this.anIntArray237[local105] >> 8) * 64 - this.anInt945;
						local176 = (this.anIntArray237[local105] & 0xFF) * 64 - this.anInt946;
						@Pc(181) byte[] local181 = this.aByteArrayArray5[local105];
						if (local181 == null && this.anInt950 < 800) {
							local77.method309(local176, 64, 64, local117);
						}
					}
					this.aClass6_Sub2_Sub3_8.method251(28);
					for (local117 = 0; local117 < local43; local117++) {
						local122 = this.aByteArrayArray6[local117];
						if (local122 != null) {
							local226 = (this.anIntArray237[local117] >> 8) * 64 - this.anInt945;
							local238 = (this.anIntArray237[local117] & 0xFF) * 64 - this.anInt946;
							local77.method304(local238, local122, this.aClass47Array1, this.aClass41_1, local226);
						}
					}
				}
				if (this.aBoolean246) {
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
										local77.method309(local117 * 8, 8, 8, local105 * 8);
									}
								}
							}
							this.aClass6_Sub2_Sub3_8.method251(28);
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
											for (@Pc(496) int local496 = 0; local496 < this.anIntArray237.length; local496++) {
												if (this.anIntArray237[local496] == local317 && this.aByteArrayArray6[local496] != null) {
													local77.method318(local299, this.aClass41_1, this.aClass47Array1, this.aByteArrayArray6[local496], (local305 & 0x7) * 8, local176 * 8, local293, (local315 & 0x7) * 8, local226 * 8, local117);
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
									for (local317 = 0; local317 < this.anIntArray237.length; local317++) {
										if (this.anIntArray237[local317] == local315 && this.aByteArrayArray5[local317] != null) {
											local77.method316((local299 & 0x7) * 8, local105 * 8, this.aByteArrayArray5[local317], (local305 & 0x7) * 8, local238, this.aClass47Array1, local117 * 8, local293, local91);
											local269 = true;
											break;
										}
									}
								}
								if (!local269) {
									local77.method308(local105 * 8, local91, local117 * 8);
								}
							}
						}
						local91++;
					}
				}
				this.aClass6_Sub2_Sub3_8.method251(28);
				local77.method317(this.aClass47Array1, this.aClass41_1);
				if (this.aClass8_8 != null) {
					this.aClass8_8.method58();
					Class6_Sub2_Sub2_Sub4.anIntArray206 = this.anIntArray267;
				}
				this.aClass6_Sub2_Sub3_8.method251(28);
				local91 = Class27.anInt412;
				if (local91 > this.anInt1074) {
					local91 = this.anInt1074;
				}
				if (local91 < this.anInt1074 - 1) {
					local91 = this.anInt1074 - 1;
				}
				if (aBoolean252) {
					this.aClass41_1.method403(Class27.anInt412);
				} else {
					this.aClass41_1.method403(0);
				}
				for (local105 = 0; local105 < 104; local105++) {
					for (local117 = 0; local117 < 104; local117++) {
						this.method667(local105, local117);
					}
				}
				this.method601();
			} catch (@Pc(645) Exception local645) {
			}
			Class19.aClass42_3.method455();
			if (super.aFrame_Sub1_2 != null) {
				this.aClass6_Sub2_Sub3_8.method251(205);
				this.aClass6_Sub2_Sub3_8.method256(1057001181);
			}
			if (aBoolean252 && signlink.aRandomAccessFile3 != null) {
				local22 = this.aClass25_Sub1_1.method247(0);
				for (local35 = 0; local35 < local22; local35++) {
					local39 = this.aClass25_Sub1_1.method229(local35);
					if ((local39 & 0x79) == 0) {
						Class6_Sub2_Sub1_Sub3.method132(local35);
					}
				}
			}
			System.gc();
			Class6_Sub2_Sub2_Sub4.method563();
			this.aClass25_Sub1_1.method241();
			local22 = (this.anInt949 - 6) / 8 - 1;
			local35 = (this.anInt949 + 6) / 8 + 1;
			local39 = (this.anInt950 - 6) / 8 - 1;
			local43 = (this.anInt950 + 6) / 8 + 1;
			if (this.aBoolean259) {
				local22 = 49;
				local35 = 50;
				local39 = 49;
				local43 = 50;
			}
			for (local91 = local22; local91 <= local35; local91++) {
				for (local105 = local39; local105 <= local43; local105++) {
					if (local91 == local22 || local91 == local35 || local105 == local39 || local105 == local43) {
						local117 = this.aClass25_Sub1_1.method232(0, local105, local91);
						if (local117 != -1) {
							this.aClass25_Sub1_1.method246(local117, 3);
						}
						local176 = this.aClass25_Sub1_1.method232(1, local105, local91);
						if (local176 != -1) {
							this.aClass25_Sub1_1.method246(local176, 3);
						}
					}
				}
			}
		} catch (@Pc(813) RuntimeException local813) {
			signlink.reporterror("92901, " + -24 + ", " + local813.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "w", descriptor = "(I)V")
	private void method650() {
		try {
			if (super.aClass8_2 == null) {
				this.method648();
				this.aClass8_10 = null;
				this.aClass8_11 = null;
				this.aClass8_12 = null;
				this.aClass8_13 = null;
				this.aClass8_14 = null;
				this.aClass8_15 = null;
				this.aClass8_16 = null;
				this.aClass8_17 = null;
				this.aClass8_18 = null;
				this.aClass8_9 = null;
				this.aClass8_7 = null;
				this.aClass8_6 = null;
				this.aClass8_8 = null;
				this.aClass8_3 = null;
				this.aClass8_4 = null;
				this.aClass8_5 = null;
				super.aClass8_2 = new Class8(503, 765, this.method586(), (byte) 0);
				this.aBoolean243 = true;
			}
		} catch (@Pc(79) RuntimeException local79) {
			signlink.reporterror("80634, " + -64 + ", " + local79.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Z)V")
	@Override
	protected void method582(@OriginalArg(0) boolean arg0) {
		try {
			this.aBoolean266 &= arg0;
			if (!this.aBoolean262 && !this.aBoolean257 && !this.aBoolean272) {
				anInt1077++;
				if (this.aBoolean266) {
					this.method646(44);
				} else {
					this.method637(this.anInt1030);
				}
				this.method645(anInt986);
			}
		} catch (@Pc(36) RuntimeException local36) {
			signlink.reporterror("37704, " + arg0 + ", " + local36.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(III)V")
	private void method651(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		try {
			@Pc(1) int local1 = 0;
			for (@Pc(10) int local10 = 0; local10 < 100; local10++) {
				if (this.aStringArray9[local10] != null) {
					@Pc(22) int local22 = this.anIntArray212[local10];
					@Pc(33) int local33 = this.anInt987 + 70 + 4 - local1 * 14;
					if (local33 < -20) {
						break;
					}
					@Pc(41) String local41 = this.aStringArray8[local10];
					if (local41 != null && local41.startsWith("@cr1@")) {
						local41 = local41.substring(5);
					}
					if (local41 != null && local41.startsWith("@cr2@")) {
						local41 = local41.substring(5);
					}
					if (local22 == 0) {
						local1++;
					}
					if ((local22 == 1 || local22 == 2) && (local22 == 1 || this.anInt1028 == 0 || this.anInt1028 == 1 && this.method715(local41))) {
						if (arg0 > local33 - 14 && arg0 <= local33 && !local41.equals(aClass6_Sub2_Sub1_Sub1_Sub2_1.aString16)) {
							if (this.anInt917 >= 1) {
								this.aStringArray13[this.anInt933] = "Report abuse @whi@" + local41;
								this.anIntArray274[this.anInt933] = 722;
								this.anInt933++;
							}
							this.aStringArray13[this.anInt933] = "Add ignore @whi@" + local41;
							this.anIntArray274[this.anInt933] = 444;
							this.anInt933++;
							this.aStringArray13[this.anInt933] = "Add friend @whi@" + local41;
							this.anIntArray274[this.anInt933] = 159;
							this.anInt933++;
						}
						local1++;
					}
					if ((local22 == 3 || local22 == 7) && this.anInt1079 == 0 && (local22 == 7 || this.anInt887 == 0 || this.anInt887 == 1 && this.method715(local41))) {
						if (arg0 > local33 - 14 && arg0 <= local33) {
							if (this.anInt917 >= 1) {
								this.aStringArray13[this.anInt933] = "Report abuse @whi@" + local41;
								this.anIntArray274[this.anInt933] = 722;
								this.anInt933++;
							}
							this.aStringArray13[this.anInt933] = "Add ignore @whi@" + local41;
							this.anIntArray274[this.anInt933] = 444;
							this.anInt933++;
							this.aStringArray13[this.anInt933] = "Add friend @whi@" + local41;
							this.anIntArray274[this.anInt933] = 159;
							this.anInt933++;
						}
						local1++;
					}
					if (local22 == 4 && (this.anInt951 == 0 || this.anInt951 == 1 && this.method715(local41))) {
						if (arg0 > local33 - 14 && arg0 <= local33) {
							this.aStringArray13[this.anInt933] = "Accept trade @whi@" + local41;
							this.anIntArray274[this.anInt933] = 749;
							this.anInt933++;
						}
						local1++;
					}
					if ((local22 == 5 || local22 == 6) && this.anInt1079 == 0 && this.anInt887 < 2) {
						local1++;
					}
					if (local22 == 8 && (this.anInt951 == 0 || this.anInt951 == 1 && this.method715(local41))) {
						if (arg0 > local33 - 14 && arg0 <= local33) {
							this.aStringArray13[this.anInt933] = "Accept challenge @whi@" + local41;
							this.anIntArray274[this.anInt933] = 921;
							this.anInt933++;
						}
						local1++;
					}
				}
			}
		} catch (@Pc(406) RuntimeException local406) {
			signlink.reporterror("12378, " + 2 + ", " + arg0 + ", " + arg1 + ", " + local406.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "x", descriptor = "(I)V")
	private void method652(@OriginalArg(0) int arg0) {
		try {
			@Pc(3) int local3 = 5;
			this.anIntArray217[8] = 0;
			@Pc(10) int local10 = 0;
			@Pc(14) boolean local14 = false;
			while (this.anIntArray217[8] == 0) {
				@Pc(18) String local18 = "Unknown problem";
				this.method588(anInt1011, 20, "Connecting to web server");
				try {
					@Pc(40) DataInputStream local40 = this.method711("crc" + (int) (Math.random() * 9.9999999E7D) + "-" + 358);
					@Pc(47) Class6_Sub2_Sub3 local47 = new Class6_Sub2_Sub3(-587, new byte[40]);
					local40.readFully(local47.aByteArray9, 0, 40);
					local40.close();
					for (@Pc(57) int local57 = 0; local57 < 9; local57++) {
						this.anIntArray217[local57] = local47.method267();
					}
					@Pc(72) int local72 = local47.method267();
					@Pc(74) int local74 = 1234;
					for (@Pc(76) int local76 = 0; local76 < 9; local76++) {
						local74 = (local74 << 1) + this.anIntArray217[local76];
					}
					if (local72 != local74) {
						local18 = "checksum problem";
						this.anIntArray217[8] = 0;
					}
				} catch (@Pc(103) EOFException local103) {
					local18 = "EOF problem";
					this.anIntArray217[8] = 0;
				} catch (@Pc(112) IOException local112) {
					local18 = "connection problem";
					this.anIntArray217[8] = 0;
				} catch (@Pc(121) Exception local121) {
					local18 = "logic problem";
					this.anIntArray217[8] = 0;
					if (!signlink.reporterror) {
						return;
					}
				}
				if (this.anIntArray217[8] == 0) {
					local10++;
					for (@Pc(139) int local139 = local3; local139 > 0; local139--) {
						if (local10 >= 10) {
							this.method588(anInt1011, 10, "Game updated - please reload page");
							local139 = 10;
						} else {
							this.method588(anInt1011, 10, local18 + " - Will retry in " + local139 + " secs.");
						}
						try {
							Thread.sleep(1000L);
						} catch (@Pc(173) Exception local173) {
						}
					}
					local3 *= 2;
					if (local3 > 60) {
						local3 = 60;
					}
					this.aBoolean268 = !this.aBoolean268;
				}
			}
		} catch (@Pc(201) RuntimeException local201) {
			signlink.reporterror("4510, " + arg0 + ", " + local201.toString());
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
				return new URL("http://127.0.0.1:" + (anInt893 + 80));
			}
		} catch (@Pc(21) Exception local21) {
		}
		return super.getCodeBase();
	}

	@OriginalMember(owner = "client!client", name = "g", descriptor = "(Z)V")
	private void method653() {
		try {
			for (@Pc(15) Class6_Sub2_Sub1_Sub4 local15 = (Class6_Sub2_Sub1_Sub4) this.aClass13_12.method113(); local15 != null; local15 = (Class6_Sub2_Sub1_Sub4) this.aClass13_12.method115()) {
				if (local15.anInt441 != this.anInt1074 || local15.aBoolean140) {
					local15.method545();
				} else if (anInt1077 >= local15.anInt437) {
					local15.method342(this.anInt1036, this.anInt860);
					if (local15.aBoolean140) {
						local15.method545();
					} else {
						this.aClass41_1.method413(local15, local15.anInt442, -1, local15.anInt444, 0, 60, false, local15.anInt441, local15.anInt443);
					}
				}
			}
		} catch (@Pc(74) RuntimeException local74) {
			signlink.reporterror("75862, " + true + ", " + local74.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IZ[B)V")
	private void method654(@OriginalArg(1) boolean arg0, @OriginalArg(2) byte[] arg1) {
		try {
			if (this.aBoolean250) {
				signlink.anInt1087 = arg0 ? 1 : 0;
				signlink.midisave(arg1, arg1.length);
			}
		} catch (@Pc(22) RuntimeException local22) {
			signlink.reporterror("1322, " + -38407 + ", " + arg0 + ", " + arg1 + ", " + local22.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!VGGOSQRK;I)Z")
	private boolean method655(@OriginalArg(0) Class44 arg0) {
		try {
			if (arg0.anIntArray177 == null) {
				return false;
			}
			for (@Pc(8) int local8 = 0; local8 < arg0.anIntArray177.length; local8++) {
				@Pc(16) int local16 = this.method592(local8, arg0);
				@Pc(21) int local21 = arg0.anIntArray175[local8];
				if (arg0.anIntArray177[local8] == 2) {
					if (local16 >= local21) {
						return false;
					}
				} else if (arg0.anIntArray177[local8] == 3) {
					if (local16 <= local21) {
						return false;
					}
				} else if (arg0.anIntArray177[local8] == 4) {
					if (local16 == local21) {
						return false;
					}
				} else if (local16 != local21) {
					return false;
				}
			}
			return true;
		} catch (@Pc(75) RuntimeException local75) {
			signlink.reporterror("89798, " + arg0 + ", " + -901 + ", " + local75.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ZILclient!NQUAUMDT;)V")
	private void method656(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class6_Sub2_Sub3 arg2) {
		try {
			if (arg0) {
				this.anInt1031 = 111;
			}
			for (@Pc(8) int local8 = 0; local8 < this.anInt1025; local8++) {
				@Pc(15) int local15 = this.anIntArray258[local8];
				@Pc(20) Class6_Sub2_Sub1_Sub1_Sub1 local20 = this.aClass6_Sub2_Sub1_Sub1_Sub1Array1[local15];
				@Pc(23) int local23 = arg2.method262();
				@Pc(31) int local31;
				@Pc(40) int local40;
				if ((local23 & 0x4) != 0) {
					local31 = arg2.method290();
					if (local31 == 65535) {
						local31 = -1;
					}
					local40 = arg2.method281();
					if (local31 == local20.anInt702 && local31 != -1) {
						@Pc(52) int local52 = Class21.aClass21Array1[local31].anInt352;
						if (local52 == 1) {
							local20.anInt703 = 0;
							local20.anInt704 = 0;
							local20.anInt705 = local40;
							local20.anInt706 = 0;
						}
						if (local52 == 2) {
							local20.anInt706 = 0;
						}
					} else if (local31 == -1 || local20.anInt702 == -1 || Class21.aClass21Array1[local31].anInt346 >= Class21.aClass21Array1[local20.anInt702].anInt346) {
						local20.anInt702 = local31;
						local20.anInt703 = 0;
						local20.anInt704 = 0;
						local20.anInt705 = local40;
						local20.anInt706 = 0;
						local20.anInt708 = local20.anInt677;
					}
				}
				if ((local23 & 0x20) != 0) {
					local20.aString15 = arg2.method269();
					local20.anInt707 = 100;
				}
				if ((local23 & 0x40) != 0) {
					local31 = arg2.method282(this.anInt1043);
					local40 = arg2.method281();
					local20.method507(anInt1077, local40, local31);
					local20.anInt678 = anInt1077 + 300;
					local20.anInt679 = arg2.method282(this.anInt1043);
					local20.anInt680 = arg2.method282(this.anInt1043);
				}
				if ((local23 & 0x1) != 0) {
					local20.aClass2_1 = Class2.method10(arg2.method290());
					local20.anInt685 = local20.aClass2_1.aByte2;
					local20.anInt684 = local20.aClass2_1.anInt4;
					local20.anInt691 = local20.aClass2_1.anInt19;
					local20.anInt692 = local20.aClass2_1.anInt25;
					local20.anInt693 = local20.aClass2_1.anInt20;
					local20.anInt694 = local20.aClass2_1.anInt13;
					local20.anInt712 = local20.aClass2_1.anInt15;
				}
				if ((local23 & 0x10) != 0) {
					local20.anInt711 = arg2.method290();
					if (local20.anInt711 == 65535) {
						local20.anInt711 = -1;
					}
				}
				if ((local23 & 0x80) != 0) {
					local31 = arg2.method280();
					local40 = arg2.method280();
					local20.method507(anInt1077, local40, local31);
					local20.anInt678 = anInt1077 + 300;
					local20.anInt679 = arg2.method262();
					local20.anInt680 = arg2.method280();
				}
				if ((local23 & 0x2) != 0) {
					local20.anInt675 = arg2.method290();
					local20.anInt676 = arg2.method264();
				}
				if ((local23 & 0x8) != 0) {
					local20.anInt686 = arg2.method291(this.aByte43);
					local31 = arg2.method267();
					local20.anInt690 = local31 >> 16;
					local20.anInt689 = anInt1077 + (local31 & 0xFFFF);
					local20.anInt687 = 0;
					local20.anInt688 = 0;
					if (local20.anInt689 > anInt1077) {
						local20.anInt687 = -1;
					}
					if (local20.anInt686 == 65535) {
						local20.anInt686 = -1;
					}
				}
			}
		} catch (@Pc(316) RuntimeException local316) {
			signlink.reporterror("42025, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local316.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(III)Z")
	private boolean method657(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(10) boolean local10 = false;
			@Pc(13) Class44 local13 = Class44.method496(arg0);
			for (@Pc(15) int local15 = 0; local15 < local13.anIntArray176.length && local13.anIntArray176[local15] != -1; local15++) {
				@Pc(29) Class44 local29 = Class44.method496(local13.anIntArray176[local15]);
				if (local29.anInt649 == 0) {
					local10 |= this.method657(local29.anInt630, arg1);
				}
				@Pc(63) int local63;
				if (local29.anInt649 == 6 && (local29.anInt623 != -1 || local29.anInt624 != -1)) {
					@Pc(58) boolean local58 = this.method655(local29);
					if (local58) {
						local63 = local29.anInt624;
					} else {
						local63 = local29.anInt623;
					}
					if (local63 != -1) {
						@Pc(75) Class21 local75 = Class21.aClass21Array1[local63];
						local29.anInt611 += arg1;
						while (local29.anInt611 > local75.method176(local29.anInt629, 642)) {
							local29.anInt611 -= local75.method176(local29.anInt629, 642) + 1;
							local29.anInt629++;
							if (local29.anInt629 >= local75.anInt344) {
								local29.anInt629 -= local75.anInt345;
								if (local29.anInt629 < 0 || local29.anInt629 >= local75.anInt344) {
									local29.anInt629 = 0;
								}
							}
							local10 = true;
						}
					}
				}
				if (local29.anInt649 == 6 && local29.anInt647 != 0) {
					@Pc(146) int local146 = local29.anInt647 >> 16;
					local63 = local29.anInt647 << 16 >> 16;
					@Pc(157) int local157 = local146 * arg1;
					local63 *= arg1;
					local29.anInt620 = local29.anInt620 + local157 & 0x7FF;
					local29.anInt621 = local29.anInt621 + local63 & 0x7FF;
					local10 = true;
				}
			}
			return local10;
		} catch (@Pc(188) RuntimeException local188) {
			signlink.reporterror("95297, " + arg0 + ", " + arg1 + ", " + -95 + ", " + local188.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "g", descriptor = "(B)I")
	private int method658() {
		try {
			@Pc(3) int local3 = 3;
			if (this.anInt875 < 310) {
				@Pc(18) int local18 = this.anInt872 >> 7;
				@Pc(23) int local23 = this.anInt874 >> 7;
				@Pc(28) int local28 = aClass6_Sub2_Sub1_Sub1_Sub2_1.anInt699 >> 7;
				@Pc(33) int local33 = aClass6_Sub2_Sub1_Sub1_Sub2_1.anInt700 >> 7;
				if ((this.aByteArrayArrayArray8[this.anInt1074][local18][local23] & 0x4) != 0) {
					local3 = this.anInt1074;
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
						if ((this.aByteArrayArrayArray8[this.anInt1074][local18][local23] & 0x4) != 0) {
							local3 = this.anInt1074;
						}
						local85 += local83;
						if (local85 >= 65536) {
							local85 -= 65536;
							if (local23 < local33) {
								local23++;
							} else if (local23 > local33) {
								local23--;
							}
							if ((this.aByteArrayArrayArray8[this.anInt1074][local18][local23] & 0x4) != 0) {
								local3 = this.anInt1074;
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
						if ((this.aByteArrayArrayArray8[this.anInt1074][local18][local23] & 0x4) != 0) {
							local3 = this.anInt1074;
						}
						local85 += local83;
						if (local85 >= 65536) {
							local85 -= 65536;
							if (local18 < local28) {
								local18++;
							} else if (local18 > local28) {
								local18--;
							}
							if ((this.aByteArrayArrayArray8[this.anInt1074][local18][local23] & 0x4) != 0) {
								local3 = this.anInt1074;
							}
						}
					}
				}
			}
			if ((this.aByteArrayArrayArray8[this.anInt1074][aClass6_Sub2_Sub1_Sub1_Sub2_1.anInt699 >> 7][aClass6_Sub2_Sub1_Sub1_Sub2_1.anInt700 >> 7] & 0x4) != 0) {
				local3 = this.anInt1074;
			}
			return local3;
		} catch (@Pc(251) RuntimeException local251) {
			signlink.reporterror("68944, " + 1 + ", " + local251.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "y", descriptor = "(I)I")
	private int method659(@OriginalArg(0) int arg0) {
		try {
			if (arg0 != 6) {
				this.aClass13ArrayArrayArray1 = null;
			}
			@Pc(15) int local15 = this.method640(this.anInt872, this.anInt1074, this.anInt874);
			return local15 - this.anInt873 >= 800 || (this.aByteArrayArrayArray8[this.anInt1074][this.anInt872 >> 7][this.anInt874 >> 7] & 0x4) == 0 ? 3 : this.anInt1074;
		} catch (@Pc(45) RuntimeException local45) {
			signlink.reporterror("42971, " + arg0 + ", " + local45.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "z", descriptor = "(I)V")
	private void method660() {
		try {
			this.aClass8_9.method58();
			Class6_Sub2_Sub2_Sub4.anIntArray206 = this.anIntArray265;
			this.aClass6_Sub2_Sub2_Sub3_17.method488(0, 0);
			if (this.aBoolean241) {
				this.aClass6_Sub2_Sub2_Sub2_4.method380(0, 40, this.aString24, 239);
				this.aClass6_Sub2_Sub2_Sub2_4.method380(128, 60, this.aString22 + "*", 239);
			} else if (this.anInt923 == 1) {
				this.aClass6_Sub2_Sub2_Sub2_4.method380(0, 40, "Enter amount:", 239);
				this.aClass6_Sub2_Sub2_Sub2_4.method380(128, 60, this.aString31 + "*", 239);
			} else if (this.anInt923 == 2) {
				this.aClass6_Sub2_Sub2_Sub2_4.method380(0, 40, "Enter name:", 239);
				this.aClass6_Sub2_Sub2_Sub2_4.method380(128, 60, this.aString31 + "*", 239);
			} else {
				@Pc(132) Class6_Sub2_Sub2_Sub2 local132;
				@Pc(140) int local140;
				@Pc(151) int local151;
				if (this.anInt923 == 3) {
					if (this.aString31 != this.aString18) {
						this.method685(this.aString31, this.anInt925);
						this.aString18 = this.aString31;
					}
					local132 = this.aClass6_Sub2_Sub2_Sub2_3;
					Class6_Sub2_Sub2.method549(0, 463, 0, 77);
					for (local140 = 0; local140 < this.anInt850; local140++) {
						local151 = local140 * 14 + 18 - this.anInt851;
						if (local151 > 0 && local151 < 110) {
							local132.method380(0, local151, this.aStringArray10[local140], 239);
						}
					}
					Class6_Sub2_Sub2.method548();
					if (this.anInt850 > 5) {
						this.method699(this.anInt850 * 14 + 7, 463, this.anInt851, 77, 0);
					}
					if (this.aString31.length() == 0) {
						this.aClass6_Sub2_Sub2_Sub2_4.method380(255, 40, "Enter object name", 239);
					} else if (this.anInt850 == 0) {
						this.aClass6_Sub2_Sub2_Sub2_4.method380(0, 40, "No matching objects found, please shorten search", 239);
					}
					local132.method380(0, 90, this.aString31 + "*", 239);
					Class6_Sub2_Sub2.method555(0, 77, 0, 479);
				} else if (this.aString23 != null) {
					this.aClass6_Sub2_Sub2_Sub2_4.method380(0, 40, this.aString23, 239);
					this.aClass6_Sub2_Sub2_Sub2_4.method380(128, 60, "Click to continue", 239);
				} else if (this.anInt983 != -1) {
					this.method688(0, 0, Class44.method496(this.anInt983), 0);
				} else if (this.anInt1053 == -1) {
					local132 = this.aClass6_Sub2_Sub2_Sub2_3;
					local140 = 0;
					Class6_Sub2_Sub2.method549(0, 463, 0, 77);
					for (local151 = 0; local151 < 100; local151++) {
						if (this.aStringArray9[local151] != null) {
							@Pc(316) int local316 = this.anIntArray212[local151];
							@Pc(325) int local325 = this.anInt987 + 70 - local140 * 14;
							@Pc(330) String local330 = this.aStringArray8[local151];
							@Pc(332) byte local332 = 0;
							if (local330 != null && local330.startsWith("@cr1@")) {
								local330 = local330.substring(5);
								local332 = 1;
							}
							if (local330 != null && local330.startsWith("@cr2@")) {
								local330 = local330.substring(5);
								local332 = 2;
							}
							if (local316 == 0) {
								if (local325 > 0 && local325 < 110) {
									local132.method384(0, this.aStringArray9[local151], 4, local325, this.aByte41);
								}
								local140++;
							}
							@Pc(403) int local403;
							if ((local316 == 1 || local316 == 2) && (local316 == 1 || this.anInt1028 == 0 || this.anInt1028 == 1 && this.method715(local330))) {
								if (local325 > 0 && local325 < 110) {
									local403 = 4;
									if (local332 == 1) {
										this.aClass6_Sub2_Sub2_Sub3Array4[0].method488(local325 - 12, 4);
										local403 += 14;
									}
									if (local332 == 2) {
										this.aClass6_Sub2_Sub2_Sub3Array4[1].method488(local325 - 12, local403);
										local403 += 14;
									}
									local132.method384(0, local330 + ":", local403, local325, this.aByte41);
									local403 += local132.method382(local330) + 8;
									local132.method384(255, this.aStringArray9[local151], local403, local325, this.aByte41);
								}
								local140++;
							}
							if ((local316 == 3 || local316 == 7) && this.anInt1079 == 0 && (local316 == 7 || this.anInt887 == 0 || this.anInt887 == 1 && this.method715(local330))) {
								if (local325 > 0 && local325 < 110) {
									local132.method384(0, "From", 4, local325, this.aByte41);
									local403 = local132.method382("From ") + 4;
									if (local332 == 1) {
										this.aClass6_Sub2_Sub2_Sub3Array4[0].method488(local325 - 12, local403);
										local403 += 14;
									}
									if (local332 == 2) {
										this.aClass6_Sub2_Sub2_Sub3Array4[1].method488(local325 - 12, local403);
										local403 += 14;
									}
									local132.method384(0, local330 + ":", local403, local325, this.aByte41);
									local403 += local132.method382(local330) + 8;
									local132.method384(8388608, this.aStringArray9[local151], local403, local325, this.aByte41);
								}
								local140++;
							}
							if (local316 == 4 && (this.anInt951 == 0 || this.anInt951 == 1 && this.method715(local330))) {
								if (local325 > 0 && local325 < 110) {
									local132.method384(8388736, local330 + " " + this.aStringArray9[local151], 4, local325, this.aByte41);
								}
								local140++;
							}
							if (local316 == 5 && this.anInt1079 == 0 && this.anInt887 < 2) {
								if (local325 > 0 && local325 < 110) {
									local132.method384(8388608, this.aStringArray9[local151], 4, local325, this.aByte41);
								}
								local140++;
							}
							if (local316 == 6 && this.anInt1079 == 0 && this.anInt887 < 2) {
								if (local325 > 0 && local325 < 110) {
									local132.method384(0, "To " + local330 + ":", 4, local325, this.aByte41);
									local132.method384(8388608, this.aStringArray9[local151], local132.method382("To " + local330) + 12, local325, this.aByte41);
								}
								local140++;
							}
							if (local316 == 8 && (this.anInt951 == 0 || this.anInt951 == 1 && this.method715(local330))) {
								if (local325 > 0 && local325 < 110) {
									local132.method384(8270336, local330 + " " + this.aStringArray9[local151], 4, local325, this.aByte41);
								}
								local140++;
							}
						}
					}
					Class6_Sub2_Sub2.method548();
					this.anInt1050 = local140 * 14 + 7;
					if (this.anInt1050 < 78) {
						this.anInt1050 = 78;
					}
					this.method699(this.anInt1050, 463, this.anInt1050 - this.anInt987 - 77, 77, 0);
					@Pc(783) String local783;
					if (aClass6_Sub2_Sub1_Sub1_Sub2_1 == null || aClass6_Sub2_Sub1_Sub1_Sub2_1.aString16 == null) {
						local783 = Class39.method363(this.aString28);
					} else {
						local783 = aClass6_Sub2_Sub1_Sub1_Sub2_1.aString16;
					}
					local132.method384(0, local783 + ":", 4, 90, this.aByte41);
					local132.method384(255, this.aString30 + "*", local132.method382(local783 + ": ") + 6, 90, this.aByte41);
					Class6_Sub2_Sub2.method555(0, 77, 0, 479);
				} else {
					this.method688(0, 0, Class44.method496(this.anInt1053), 0);
				}
			}
			if (this.aBoolean264 && this.anInt866 == 2) {
				this.method721();
			}
			this.aClass8_9.method59(super.aGraphics2, 357, 17);
			this.aClass8_8.method58();
			Class6_Sub2_Sub2_Sub4.anIntArray206 = this.anIntArray267;
		} catch (@Pc(866) RuntimeException local866) {
			signlink.reporterror("4419, " + 7 + ", " + local866.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "h", descriptor = "(B)V")
	private void method661() {
		try {
			this.aBoolean248 = true;
			for (@Pc(10) int local10 = 0; local10 < 7; local10++) {
				this.anIntArray220[local10] = -1;
				for (@Pc(19) int local19 = 0; local19 < Class40.anInt508; local19++) {
					if (!Class40.aClass40Array1[local19].aBoolean166 && Class40.aClass40Array1[local19].anInt509 == local10 + (this.aBoolean244 ? 0 : 7)) {
						this.anIntArray220[local10] = local19;
						break;
					}
				}
			}
		} catch (@Pc(56) RuntimeException local56) {
			signlink.reporterror("91870, " + 0 + ", " + local56.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "h", descriptor = "(Z)V")
	private void method662() {
		try {
			this.anInt995 = 0;
			this.aBoolean266 &= true;
			@Pc(77) int local77;
			for (@Pc(12) int local12 = -1; local12 < this.anInt1024 + this.anInt886; local12++) {
				@Pc(19) Class6_Sub2_Sub1_Sub1 local19;
				if (local12 == -1) {
					local19 = aClass6_Sub2_Sub1_Sub1_Sub2_1;
				} else if (local12 < this.anInt1024) {
					local19 = this.aClass6_Sub2_Sub1_Sub1_Sub2Array1[this.anIntArray257[local12]];
				} else {
					local19 = this.aClass6_Sub2_Sub1_Sub1_Sub1Array1[this.anIntArray222[local12 - this.anInt1024]];
				}
				if (local19 != null && local19.method510()) {
					@Pc(60) Class2 local60;
					if (local19 instanceof Class6_Sub2_Sub1_Sub1_Sub1) {
						local60 = ((Class6_Sub2_Sub1_Sub1_Sub1) local19).aClass2_1;
						if (local60.anIntArray1 != null) {
							local60 = local60.method5(this.anInt998);
						}
						if (local60 == null) {
							continue;
						}
					}
					if (local12 >= this.anInt1024) {
						local60 = ((Class6_Sub2_Sub1_Sub1_Sub1) local19).aClass2_1;
						if (local60.anInt23 >= 0 && local60.anInt23 < this.aClass6_Sub2_Sub2_Sub1Array5.length) {
							this.method677(local19.anInt696 + 15, local19);
							if (this.anInt900 > -1) {
								this.aClass6_Sub2_Sub2_Sub1Array5[local60.anInt23].method98(this.anInt901 - 30, this.anInt900 - 12);
							}
						}
						if (this.anInt865 == 1 && this.anInt981 == this.anIntArray222[local12 - this.anInt1024] && anInt1077 % 20 < 10) {
							this.method677(local19.anInt696 + 15, local19);
							if (this.anInt900 > -1) {
								this.aClass6_Sub2_Sub2_Sub1Array10[0].method98(this.anInt901 - 28, this.anInt900 - 12);
							}
						}
					} else {
						local77 = 30;
						@Pc(80) Class6_Sub2_Sub1_Sub1_Sub2 local80 = (Class6_Sub2_Sub1_Sub1_Sub2) local19;
						if (local80.anInt738 != -1 || local80.anInt736 != -1) {
							this.method677(local19.anInt696 + 15, local19);
							if (this.anInt900 > -1) {
								if (local80.anInt738 != -1) {
									this.aClass6_Sub2_Sub2_Sub1Array9[local80.anInt738].method98(this.anInt901 - 30, this.anInt900 - 12);
									local77 += 25;
								}
								if (local80.anInt736 != -1) {
									this.aClass6_Sub2_Sub2_Sub1Array5[local80.anInt736].method98(this.anInt901 - local77, this.anInt900 - 12);
									local77 += 25;
								}
							}
						}
						if (local12 >= 0 && this.anInt865 == 10 && this.anInt988 == this.anIntArray257[local12]) {
							this.method677(local19.anInt696 + 15, local19);
							if (this.anInt900 > -1) {
								this.aClass6_Sub2_Sub2_Sub1Array10[1].method98(this.anInt901 - local77, this.anInt900 - 12);
							}
						}
					}
					if (local19.aString15 != null && (local12 >= this.anInt1024 || this.anInt1028 == 0 || this.anInt1028 == 3 || this.anInt1028 == 1 && this.method715(((Class6_Sub2_Sub1_Sub1_Sub2) local19).aString16))) {
						this.method677(local19.anInt696, local19);
						if (this.anInt900 > -1 && this.anInt995 < this.anInt996) {
							this.anIntArray245[this.anInt995] = this.aClass6_Sub2_Sub2_Sub2_4.method383((byte) 5, local19.aString15) / 2;
							this.anIntArray244[this.anInt995] = this.aClass6_Sub2_Sub2_Sub2_4.anInt507;
							this.anIntArray242[this.anInt995] = this.anInt900;
							this.anIntArray243[this.anInt995] = this.anInt901;
							this.anIntArray246[this.anInt995] = local19.anInt695;
							this.anIntArray247[this.anInt995] = local19.anInt697;
							this.anIntArray248[this.anInt995] = local19.anInt707;
							this.aStringArray12[this.anInt995++] = local19.aString15;
							if (this.anInt856 == 0 && local19.anInt697 >= 1 && local19.anInt697 <= 3) {
								this.anIntArray244[this.anInt995] += 10;
								this.anIntArray243[this.anInt995] += 5;
							}
							if (this.anInt856 == 0 && local19.anInt697 == 4) {
								this.anIntArray245[this.anInt995] = 60;
							}
							if (this.anInt856 == 0 && local19.anInt697 == 5) {
								this.anIntArray244[this.anInt995] += 5;
							}
						}
					}
					if (local19.anInt678 > anInt1077) {
						this.method677(local19.anInt696 + 15, local19);
						if (this.anInt900 > -1) {
							local77 = local19.anInt679 * 30 / local19.anInt680;
							if (local77 > 30) {
								local77 = 30;
							}
							Class6_Sub2_Sub2.method552(local77, this.anInt900 - 15, 5, this.anInt901 - 3, 65280);
							Class6_Sub2_Sub2.method552(30 - local77, this.anInt900 - 15 + local77, 5, this.anInt901 - 3, 16711680);
						}
					}
					for (local77 = 0; local77 < 4; local77++) {
						if (local19.anIntArray186[local77] > anInt1077) {
							this.method677(local19.anInt696 / 2, local19);
							if (this.anInt900 > -1) {
								if (local77 == 1) {
									this.anInt901 -= 20;
								}
								if (local77 == 2) {
									this.anInt900 -= 15;
									this.anInt901 -= 10;
								}
								if (local77 == 3) {
									this.anInt900 += 15;
									this.anInt901 -= 10;
								}
								this.aClass6_Sub2_Sub2_Sub1Array4[local19.anIntArray185[local77]].method98(this.anInt901 - 12, this.anInt900 - 12);
								this.aClass6_Sub2_Sub2_Sub2_2.method380(0, this.anInt901 + 4, String.valueOf(local19.anIntArray184[local77]), this.anInt900);
								this.aClass6_Sub2_Sub2_Sub2_2.method380(16777215, this.anInt901 + 3, String.valueOf(local19.anIntArray184[local77]), this.anInt900 - 1);
							}
						}
					}
				}
			}
			for (@Pc(617) int local617 = 0; local617 < this.anInt995; local617++) {
				local77 = this.anIntArray242[local617];
				@Pc(629) int local629 = this.anIntArray243[local617];
				@Pc(634) int local634 = this.anIntArray245[local617];
				@Pc(639) int local639 = this.anIntArray244[local617];
				@Pc(641) boolean local641 = true;
				while (local641) {
					local641 = false;
					for (@Pc(647) int local647 = 0; local647 < local617; local647++) {
						if (local629 + 2 > this.anIntArray243[local647] - this.anIntArray244[local647] && local629 - local639 < this.anIntArray243[local647] + 2 && local77 - local634 < this.anIntArray242[local647] + this.anIntArray245[local647] && local77 + local634 > this.anIntArray242[local647] - this.anIntArray245[local647] && this.anIntArray243[local647] - this.anIntArray244[local647] < local629) {
							local629 = this.anIntArray243[local647] - this.anIntArray244[local647];
							local641 = true;
						}
					}
				}
				this.anInt900 = this.anIntArray242[local617];
				this.anInt901 = this.anIntArray243[local617] = local629;
				@Pc(746) String local746 = this.aStringArray12[local617];
				if (this.anInt856 == 0) {
					@Pc(751) int local751 = 16776960;
					if (this.anIntArray246[local617] < 6) {
						local751 = this.anIntArray227[this.anIntArray246[local617]];
					}
					if (this.anIntArray246[local617] == 6) {
						local751 = this.anInt862 % 20 < 10 ? 16711680 : 16776960;
					}
					if (this.anIntArray246[local617] == 7) {
						local751 = this.anInt862 % 20 < 10 ? 255 : 65535;
					}
					if (this.anIntArray246[local617] == 8) {
						local751 = this.anInt862 % 20 < 10 ? 45056 : 8454016;
					}
					@Pc(826) int local826;
					if (this.anIntArray246[local617] == 9) {
						local826 = 150 - this.anIntArray248[local617];
						if (local826 < 50) {
							local751 = local826 * 1280 + 16711680;
						} else if (local826 < 100) {
							local751 = 16776960 - (local826 - 50) * 327680;
						} else if (local826 < 150) {
							local751 = (local826 - 100) * 5 + 65280;
						}
					}
					if (this.anIntArray246[local617] == 10) {
						local826 = 150 - this.anIntArray248[local617];
						if (local826 < 50) {
							local751 = local826 * 5 + 16711680;
						} else if (local826 < 100) {
							local751 = 16711935 - (local826 - 50) * 327680;
						} else if (local826 < 150) {
							local751 = (local826 - 100) * 327680 + 255 - (local826 - 100) * 5;
						}
					}
					if (this.anIntArray246[local617] == 11) {
						local826 = 150 - this.anIntArray248[local617];
						if (local826 < 50) {
							local751 = 16777215 - local826 * 327685;
						} else if (local826 < 100) {
							local751 = (local826 - 50) * 327685 + 65280;
						} else if (local826 < 150) {
							local751 = 16777215 - (local826 - 100) * 327680;
						}
					}
					if (this.anIntArray247[local617] == 0) {
						this.aClass6_Sub2_Sub2_Sub2_4.method380(0, this.anInt901 + 1, local746, this.anInt900);
						this.aClass6_Sub2_Sub2_Sub2_4.method380(local751, this.anInt901, local746, this.anInt900);
					}
					if (this.anIntArray247[local617] == 1) {
						this.aClass6_Sub2_Sub2_Sub2_4.method385(this.anInt900, this.anInt901 + 1, local746, this.anInt862, 0);
						this.aClass6_Sub2_Sub2_Sub2_4.method385(this.anInt900, this.anInt901, local746, this.anInt862, local751);
					}
					if (this.anIntArray247[local617] == 2) {
						this.aClass6_Sub2_Sub2_Sub2_4.method386(this.anInt901 + 1, local746, this.anInt900, this.anInt862, 0);
						this.aClass6_Sub2_Sub2_Sub2_4.method386(this.anInt901, local746, this.anInt900, this.anInt862, local751);
					}
					if (this.anIntArray247[local617] == 3) {
						this.aClass6_Sub2_Sub2_Sub2_4.method387(this.anInt901 + 1, this.anInt862, 0, local746, this.anInt900, 150 - this.anIntArray248[local617]);
						this.aClass6_Sub2_Sub2_Sub2_4.method387(this.anInt901, this.anInt862, local751, local746, this.anInt900, 150 - this.anIntArray248[local617]);
					}
					@Pc(1123) int local1123;
					if (this.anIntArray247[local617] == 4) {
						local826 = this.aClass6_Sub2_Sub2_Sub2_4.method383((byte) 5, local746);
						local1123 = (150 - this.anIntArray248[local617]) * (local826 + 100) / 150;
						Class6_Sub2_Sub2.method549(0, this.anInt900 + 50, this.anInt900 - 50, 334);
						this.aClass6_Sub2_Sub2_Sub2_4.method384(0, local746, this.anInt900 + 50 - local1123, this.anInt901 + 1, this.aByte41);
						this.aClass6_Sub2_Sub2_Sub2_4.method384(local751, local746, this.anInt900 + 50 - local1123, this.anInt901, this.aByte41);
						Class6_Sub2_Sub2.method548();
					}
					if (this.anIntArray247[local617] == 5) {
						local826 = 150 - this.anIntArray248[local617];
						local1123 = 0;
						if (local826 < 25) {
							local1123 = local826 - 25;
						} else if (local826 > 125) {
							local1123 = local826 - 125;
						}
						Class6_Sub2_Sub2.method549(this.anInt901 - this.aClass6_Sub2_Sub2_Sub2_4.anInt507 - 1, 512, 0, this.anInt901 + 5);
						this.aClass6_Sub2_Sub2_Sub2_4.method380(0, this.anInt901 + local1123 + 1, local746, this.anInt900);
						this.aClass6_Sub2_Sub2_Sub2_4.method380(local751, this.anInt901 + local1123, local746, this.anInt900);
						Class6_Sub2_Sub2.method548();
					}
				} else {
					this.aClass6_Sub2_Sub2_Sub2_4.method380(0, this.anInt901 + 1, local746, this.anInt900);
					this.aClass6_Sub2_Sub2_Sub2_4.method380(16776960, this.anInt901, local746, this.anInt900);
				}
			}
		} catch (@Pc(1275) RuntimeException local1275) {
			signlink.reporterror("94883, " + true + ", " + local1275.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!UZETOFZZ;B)V")
	private void method663(@OriginalArg(0) Class6_Sub2_Sub2_Sub3 arg0, @OriginalArg(1) byte arg1) {
		try {
			@Pc(8) boolean local8 = false;
			for (@Pc(20) int local20 = 0; local20 < this.anIntArray229.length; local20++) {
				this.anIntArray229[local20] = 0;
			}
			@Pc(45) int local45;
			for (@Pc(35) int local35 = 0; local35 < 5000; local35++) {
				local45 = (int) (Math.random() * 128.0D * (double) 256);
				this.anIntArray229[local45] = (int) (Math.random() * 256.0D);
			}
			@Pc(63) int local63;
			@Pc(67) int local67;
			@Pc(75) int local75;
			for (local45 = 0; local45 < 20; local45++) {
				for (local63 = 1; local63 < 255; local63++) {
					for (local67 = 1; local67 < 127; local67++) {
						local75 = local67 + (local63 << 7);
						this.anIntArray230[local75] = (this.anIntArray229[local75 - 1] + this.anIntArray229[local75 + 1] + this.anIntArray229[local75 - 128] + this.anIntArray229[local75 + 128]) / 4;
					}
				}
				@Pc(121) int[] local121 = this.anIntArray229;
				this.anIntArray229 = this.anIntArray230;
				this.anIntArray230 = local121;
			}
			if (arg0 != null) {
				local63 = 0;
				for (local67 = 0; local67 < arg0.anInt606; local67++) {
					for (local75 = 0; local75 < arg0.anInt605; local75++) {
						if (arg0.aByteArray13[local63++] != 0) {
							@Pc(157) int local157 = local75 + arg0.anInt607 + 16;
							@Pc(164) int local164 = local67 + arg0.anInt608 + 16;
							@Pc(170) int local170 = local157 + (local164 << 7);
							this.anIntArray229[local170] = 0;
						}
					}
				}
			}
		} catch (@Pc(187) RuntimeException local187) {
			signlink.reporterror("19270, " + arg0 + ", " + arg1 + ", " + local187.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Lclient!NQUAUMDT;II)V")
	private void method664(@OriginalArg(0) Class6_Sub2_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		try {
			arg0.method272();
			@Pc(9) int local9 = arg0.method273(739, 8);
			@Pc(15) int local15;
			if (local9 < this.anInt886) {
				for (local15 = local9; local15 < this.anInt886; local15++) {
					this.anIntArray255[this.anInt1016++] = this.anIntArray222[local15];
				}
			}
			if (local9 > this.anInt886) {
				signlink.reporterror(this.aString28 + " Too many npcs");
				throw new RuntimeException("eek");
			}
			this.anInt886 = 0;
			for (local15 = 0; local15 < local9; local15++) {
				@Pc(67) int local67 = this.anIntArray222[local15];
				@Pc(72) Class6_Sub2_Sub1_Sub1_Sub1 local72 = this.aClass6_Sub2_Sub1_Sub1_Sub1Array1[local67];
				@Pc(77) int local77 = arg0.method273(739, 1);
				if (local77 == 0) {
					this.anIntArray222[this.anInt886++] = local67;
					local72.anInt714 = anInt1077;
				} else {
					@Pc(100) int local100 = arg0.method273(739, 2);
					if (local100 == 0) {
						this.anIntArray222[this.anInt886++] = local67;
						local72.anInt714 = anInt1077;
						this.anIntArray258[this.anInt1025++] = local67;
					} else {
						@Pc(151) int local151;
						@Pc(161) int local161;
						if (local100 == 1) {
							this.anIntArray222[this.anInt886++] = local67;
							local72.anInt714 = anInt1077;
							local151 = arg0.method273(739, 3);
							local72.method506(false, local151);
							local161 = arg0.method273(739, 1);
							if (local161 == 1) {
								this.anIntArray258[this.anInt1025++] = local67;
							}
						} else if (local100 == 2) {
							this.anIntArray222[this.anInt886++] = local67;
							local72.anInt714 = anInt1077;
							local151 = arg0.method273(739, 3);
							local72.method506(true, local151);
							local161 = arg0.method273(739, 3);
							local72.method506(true, local161);
							@Pc(219) int local219 = arg0.method273(739, 1);
							if (local219 == 1) {
								this.anIntArray258[this.anInt1025++] = local67;
							}
						} else if (local100 == 3) {
							this.anIntArray255[this.anInt1016++] = local67;
						}
					}
				}
			}
			if (arg1 == 0) {
				;
			}
		} catch (@Pc(258) RuntimeException local258) {
			signlink.reporterror("70589, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local258.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIIIII)V")
	private void method665(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
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
				local23 = Class6_Sub2_Sub1_Sub3.anIntArray96[local5];
				local27 = Class6_Sub2_Sub1_Sub3.anIntArray97[local5];
				local37 = local27 * 0 - arg2 * local23 >> 16;
				local17 = local23 * 0 + arg2 * local27 >> 16;
				local15 = local37;
			}
			if (local11 != 0) {
				local23 = Class6_Sub2_Sub1_Sub3.anIntArray96[local11];
				local27 = Class6_Sub2_Sub1_Sub3.anIntArray97[local11];
				local37 = local17 * local23 + local27 * 0 >> 16;
				local17 = local17 * local27 - local23 * 0 >> 16;
				local13 = local37;
			}
			this.anInt872 = arg1 - local13;
			this.anInt873 = arg3 - local15;
			this.anInt874 = arg4 - local17;
			this.anInt875 = arg0;
			this.anInt876 = arg5;
		} catch (@Pc(114) RuntimeException local114) {
			signlink.reporterror("73554, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + 5294 + ", " + local114.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "i", descriptor = "(Z)V")
	private void method666() {
		try {
			@Pc(7) byte[] local7 = this.aClass37_2.method358("title.dat", null);
			@Pc(13) Class6_Sub2_Sub2_Sub1 local13 = new Class6_Sub2_Sub2_Sub1(local7, this);
			this.aClass8_13.method58();
			local13.method96(0, 0);
			this.aClass8_14.method58();
			local13.method96(-637, 0);
			this.aClass8_10.method58();
			local13.method96(-128, 0);
			this.aClass8_11.method58();
			local13.method96(-202, -371);
			this.aClass8_12.method58();
			local13.method96(-202, -171);
			this.aClass8_15.method58();
			local13.method96(0, -265);
			this.aClass8_16.method58();
			local13.method96(-562, -265);
			this.aClass8_17.method58();
			local13.method96(-128, -171);
			this.aClass8_18.method58();
			local13.method96(-562, -171);
			@Pc(98) int[] local98 = new int[local13.anInt226];
			for (@Pc(100) int local100 = 0; local100 < local13.anInt227; local100++) {
				for (@Pc(104) int local104 = 0; local104 < local13.anInt226; local104++) {
					local98[local104] = local13.anIntArray43[local13.anInt226 + local13.anInt226 * local100 - local104 - 1];
				}
				for (@Pc(130) int local130 = 0; local130 < local13.anInt226; local130++) {
					local13.anIntArray43[local130 + local13.anInt226 * local100] = local98[local130];
				}
			}
			this.aClass8_13.method58();
			local13.method96(382, 0);
			this.aClass8_14.method58();
			local13.method96(-255, 0);
			this.aClass8_10.method58();
			local13.method96(254, 0);
			this.aClass8_11.method58();
			local13.method96(180, -371);
			this.aClass8_12.method58();
			local13.method96(180, -171);
			this.aClass8_15.method58();
			local13.method96(382, -265);
			this.aClass8_16.method58();
			local13.method96(-180, -265);
			this.aClass8_17.method58();
			local13.method96(254, -171);
			this.aClass8_18.method58();
			local13.method96(-180, -171);
			local13 = new Class6_Sub2_Sub2_Sub1(this.aClass37_2, "logo", 0);
			this.aClass8_10.method58();
			local13.method98(18, 382 - local13.anInt226 / 2 - 128);
			System.gc();
		} catch (@Pc(280) RuntimeException local280) {
			signlink.reporterror("42211, " + false + ", " + local280.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(II)V")
	private void method667(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(9) Class13 local9 = this.aClass13ArrayArrayArray1[this.anInt1074][arg0][arg1];
		if (local9 == null) {
			this.aClass41_1.method423(this.anInt1074, arg0, arg1);
			return;
		}
		@Pc(21) int local21 = -99999999;
		@Pc(23) Class6_Sub2_Sub1_Sub5 local23 = null;
		@Pc(27) Class6_Sub2_Sub1_Sub5 local27;
		for (local27 = (Class6_Sub2_Sub1_Sub5) local9.method113(); local27 != null; local27 = (Class6_Sub2_Sub1_Sub5) local9.method115()) {
			@Pc(32) Class43 local32 = Class43.method464(local27.anInt472);
			@Pc(35) int local35 = local32.anInt574;
			if (local32.aBoolean177) {
				local35 *= local27.anInt471 + 1;
			}
			if (local35 > local21) {
				local21 = local35;
				local23 = local27;
			}
		}
		local9.method111(local23);
		@Pc(65) Class6_Sub2_Sub1_Sub5 local65 = null;
		@Pc(67) Class6_Sub2_Sub1_Sub5 local67 = null;
		for (local27 = (Class6_Sub2_Sub1_Sub5) local9.method113(); local27 != null; local27 = (Class6_Sub2_Sub1_Sub5) local9.method115()) {
			if (local27.anInt472 != local23.anInt472 && local65 == null) {
				local65 = local27;
			}
			if (local27.anInt472 != local23.anInt472 && local27.anInt472 != local65.anInt472 && local67 == null) {
				local67 = local27;
			}
		}
		@Pc(110) int local110 = arg0 + (arg1 << 7) + 1610612736;
		this.aClass41_1.method409(local65, local23, this.method640(arg0 * 128 + 64, this.anInt1074, arg1 * 128 + 64), local110, arg1, this.anInt1074, arg0, local67);
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ZJ)V")
	private void method668(@OriginalArg(1) long arg0) {
		try {
			this.aBoolean266 &= true;
			if (arg0 != 0L) {
				for (@Pc(14) int local14 = 0; local14 < this.anInt1052; local14++) {
					if (this.aLongArray3[local14] == arg0) {
						this.anInt1052--;
						this.aBoolean279 = true;
						for (@Pc(34) int local34 = local14; local34 < this.anInt1052; local34++) {
							this.aLongArray3[local34] = this.aLongArray3[local34 + 1];
						}
						this.aClass6_Sub2_Sub3_8.method251(229);
						this.aClass6_Sub2_Sub3_8.method258(arg0);
						return;
					}
				}
			}
		} catch (@Pc(69) RuntimeException local69) {
			signlink.reporterror("32668, " + true + ", " + arg0 + ", " + local69.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "j", descriptor = "(Z)V")
	private void method669(@OriginalArg(0) boolean arg0) {
		try {
			this.aClass8_7.method58();
			if (arg0) {
				this.aClass13ArrayArrayArray1 = null;
			}
			@Pc(23) int local23;
			@Pc(25) int local25;
			if (this.anInt939 == 2) {
				@Pc(18) byte[] local18 = this.aClass6_Sub2_Sub2_Sub3_16.aByteArray13;
				@Pc(20) int[] local20 = Class6_Sub2_Sub2.anIntArray201;
				local23 = local18.length;
				for (local25 = 0; local25 < local23; local25++) {
					if (local18[local25] == 0) {
						local20[local25] = 0;
					}
				}
				this.aClass6_Sub2_Sub2_Sub1_5.method102(0, 33, 25, 33, 25, 0, 256, this.anInt963, this.anIntArray215, this.anIntArray216);
				this.aClass8_8.method58();
				Class6_Sub2_Sub2_Sub4.anIntArray206 = this.anIntArray267;
			} else {
				@Pc(72) int local72 = this.anInt963 + this.anInt903 & 0x7FF;
				@Pc(79) int local79 = aClass6_Sub2_Sub1_Sub1_Sub2_1.anInt699 / 32 + 48;
				local23 = 464 - aClass6_Sub2_Sub1_Sub1_Sub2_1.anInt700 / 32;
				this.aClass6_Sub2_Sub2_Sub1_10.method102(5, 151, local79, 146, local23, 25, this.anInt844 + 256, local72, this.anIntArray214, this.anIntArray219);
				this.aClass6_Sub2_Sub2_Sub1_5.method102(0, 33, 25, 33, 25, 0, 256, this.anInt963, this.anIntArray215, this.anIntArray216);
				for (local25 = 0; local25 < this.anInt993; local25++) {
					local79 = this.anIntArray240[local25] * 4 + 2 - aClass6_Sub2_Sub1_Sub1_Sub2_1.anInt699 / 32;
					local23 = this.anIntArray241[local25] * 4 + 2 - aClass6_Sub2_Sub1_Sub1_Sub2_1.anInt700 / 32;
					this.method687(local79, this.aClass6_Sub2_Sub2_Sub1Array6[local25], local23);
				}
				@Pc(174) int local174;
				for (@Pc(170) int local170 = 0; local170 < 104; local170++) {
					for (local174 = 0; local174 < 104; local174++) {
						@Pc(186) Class13 local186 = this.aClass13ArrayArrayArray1[this.anInt1074][local170][local174];
						if (local186 != null) {
							local79 = local170 * 4 + 2 - aClass6_Sub2_Sub1_Sub1_Sub2_1.anInt699 / 32;
							local23 = local174 * 4 + 2 - aClass6_Sub2_Sub1_Sub1_Sub2_1.anInt700 / 32;
							this.method687(local79, this.aClass6_Sub2_Sub2_Sub1_11, local23);
						}
					}
				}
				for (local174 = 0; local174 < this.anInt886; local174++) {
					@Pc(237) Class6_Sub2_Sub1_Sub1_Sub1 local237 = this.aClass6_Sub2_Sub1_Sub1_Sub1Array1[this.anIntArray222[local174]];
					if (local237 != null && local237.method510()) {
						@Pc(246) Class2 local246 = local237.aClass2_1;
						if (local246.anIntArray1 != null) {
							local246 = local246.method5(this.anInt998);
						}
						if (local246 != null && local246.aBoolean3 && local246.aBoolean2) {
							local79 = local237.anInt699 / 32 - aClass6_Sub2_Sub1_Sub1_Sub2_1.anInt699 / 32;
							local23 = local237.anInt700 / 32 - aClass6_Sub2_Sub1_Sub1_Sub2_1.anInt700 / 32;
							this.method687(local79, this.aClass6_Sub2_Sub2_Sub1_12, local23);
						}
					}
				}
				@Pc(306) Class6_Sub2_Sub1_Sub1_Sub2 local306;
				for (@Pc(296) int local296 = 0; local296 < this.anInt1024; local296++) {
					local306 = this.aClass6_Sub2_Sub1_Sub1_Sub2Array1[this.anIntArray257[local296]];
					if (local306 != null && local306.method510()) {
						local79 = local306.anInt699 / 32 - aClass6_Sub2_Sub1_Sub1_Sub2_1.anInt699 / 32;
						local23 = local306.anInt700 / 32 - aClass6_Sub2_Sub1_Sub1_Sub2_1.anInt700 / 32;
						@Pc(334) boolean local334 = false;
						@Pc(338) long local338 = Class39.method359(local306.aString16);
						for (@Pc(340) int local340 = 0; local340 < this.anInt926; local340++) {
							if (local338 == this.aLongArray4[local340] && this.anIntArray231[local340] != 0) {
								local334 = true;
								break;
							}
						}
						@Pc(365) boolean local365 = false;
						if (aClass6_Sub2_Sub1_Sub1_Sub2_1.anInt740 != 0 && local306.anInt740 != 0 && aClass6_Sub2_Sub1_Sub1_Sub2_1.anInt740 == local306.anInt740) {
							local365 = true;
						}
						if (local334) {
							this.method687(local79, this.aClass6_Sub2_Sub2_Sub1_14, local23);
						} else if (local365) {
							this.method687(local79, this.aClass6_Sub2_Sub2_Sub1_15, local23);
						} else {
							this.method687(local79, this.aClass6_Sub2_Sub2_Sub1_13, local23);
						}
					}
				}
				if (this.anInt865 != 0 && anInt1077 % 20 < 10) {
					if (this.anInt865 == 1 && this.anInt981 >= 0 && this.anInt981 < this.aClass6_Sub2_Sub1_Sub1_Sub1Array1.length) {
						@Pc(439) Class6_Sub2_Sub1_Sub1_Sub1 local439 = this.aClass6_Sub2_Sub1_Sub1_Sub1Array1[this.anInt981];
						if (local439 != null) {
							local79 = local439.anInt699 / 32 - aClass6_Sub2_Sub1_Sub1_Sub2_1.anInt699 / 32;
							local23 = local439.anInt700 / 32 - aClass6_Sub2_Sub1_Sub1_Sub2_1.anInt700 / 32;
							this.method624(local79, local23, this.aClass6_Sub2_Sub2_Sub1_4);
						}
					}
					if (this.anInt865 == 2) {
						local79 = (this.anInt953 - this.anInt945) * 4 + 2 - aClass6_Sub2_Sub1_Sub1_Sub2_1.anInt699 / 32;
						local23 = (this.anInt954 - this.anInt946) * 4 + 2 - aClass6_Sub2_Sub1_Sub1_Sub2_1.anInt700 / 32;
						this.method624(local79, local23, this.aClass6_Sub2_Sub2_Sub1_4);
					}
					if (this.anInt865 == 10 && this.anInt988 >= 0 && this.anInt988 < this.aClass6_Sub2_Sub1_Sub1_Sub2Array1.length) {
						local306 = this.aClass6_Sub2_Sub1_Sub1_Sub2Array1[this.anInt988];
						if (local306 != null) {
							local79 = local306.anInt699 / 32 - aClass6_Sub2_Sub1_Sub1_Sub2_1.anInt699 / 32;
							local23 = local306.anInt700 / 32 - aClass6_Sub2_Sub1_Sub1_Sub2_1.anInt700 / 32;
							this.method624(local79, local23, this.aClass6_Sub2_Sub2_Sub1_4);
						}
					}
				}
				if (this.anInt1014 != 0) {
					local79 = this.anInt1014 * 4 + 2 - aClass6_Sub2_Sub1_Sub1_Sub2_1.anInt699 / 32;
					local23 = this.anInt1015 * 4 + 2 - aClass6_Sub2_Sub1_Sub1_Sub2_1.anInt700 / 32;
					this.method687(local79, this.aClass6_Sub2_Sub2_Sub1_3, local23);
				}
				Class6_Sub2_Sub2.method552(3, 97, 3, 78, 16777215);
				this.aClass8_8.method58();
				Class6_Sub2_Sub2_Sub4.anIntArray206 = this.anIntArray267;
			}
		} catch (@Pc(607) RuntimeException local607) {
			signlink.reporterror("58181, " + arg0 + ", " + local607.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IILjava/lang/String;)V")
	@Override
	protected void method588(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2) {
		try {
			this.anInt918 = arg1;
			this.aString17 = arg2;
			this.method610();
			if (this.aClass37_2 == null) {
				super.method588(anInt1011, arg1, arg2);
			} else {
				this.aClass8_12.method58();
				this.aClass6_Sub2_Sub2_Sub2_4.method380(16777215, 54, "RuneScape is loading - please wait...", 180);
				Class6_Sub2_Sub2.method553(28, 304, 9179409, 34, 62);
				Class6_Sub2_Sub2.method553(29, 302, 0, 32, 63);
				Class6_Sub2_Sub2.method552(arg1 * 3, 30, 30, 64, 9179409);
				if (arg0 == 0) {
					Class6_Sub2_Sub2.method552(300 - arg1 * 3, arg1 * 3 + 30, 30, 64, 0);
					this.aClass6_Sub2_Sub2_Sub2_4.method380(16777215, 85, arg2, 180);
					this.aClass8_12.method59(super.aGraphics2, 171, 202);
					if (this.aBoolean243) {
						this.aBoolean243 = false;
						if (!this.aBoolean275) {
							this.aClass8_13.method59(super.aGraphics2, 0, 0);
							this.aClass8_14.method59(super.aGraphics2, 0, 637);
						}
						this.aClass8_10.method59(super.aGraphics2, 0, 128);
						this.aClass8_11.method59(super.aGraphics2, 371, 202);
						this.aClass8_15.method59(super.aGraphics2, 265, 0);
						this.aClass8_16.method59(super.aGraphics2, 265, 562);
						this.aClass8_17.method59(super.aGraphics2, 171, 128);
						this.aClass8_18.method59(super.aGraphics2, 171, 562);
					}
				}
			}
		} catch (@Pc(213) RuntimeException local213) {
			signlink.reporterror("73583, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local213.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "A", descriptor = "(I)V")
	private void method670() {
		try {
			if (aBoolean252 && this.anInt1018 == 2 && Class27.anInt410 != this.anInt1074) {
				this.method595(null, "Loading - please wait.");
				this.anInt1018 = 1;
				this.aLong33 = System.currentTimeMillis();
			}
			if (this.anInt1018 == 1) {
				@Pc(38) int local38 = this.method671();
				if (local38 != 0 && System.currentTimeMillis() - this.aLong33 > 360000L) {
					signlink.reporterror(this.aString28 + " glcfb " + this.aLong31 + "," + local38 + "," + aBoolean252 + "," + this.aClass1Array1[0] + "," + this.aClass25_Sub1_1.method227() + "," + this.anInt1074 + "," + this.anInt949 + "," + this.anInt950);
					this.aLong33 = System.currentTimeMillis();
				}
			}
			if (this.anInt1018 == 2 && this.anInt1074 != this.anInt888) {
				this.anInt888 = this.anInt1074;
				this.method630(this.anInt1074);
			}
		} catch (@Pc(119) RuntimeException local119) {
			signlink.reporterror("13382, " + 3 + ", " + local119.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "B", descriptor = "(I)I")
	private int method671() {
		try {
			for (@Pc(3) int local3 = 0; local3 < this.aByteArrayArray5.length; local3++) {
				if (this.aByteArrayArray5[local3] == null && this.anIntArray238[local3] != -1) {
					return -1;
				}
				if (this.aByteArrayArray6[local3] == null && this.anIntArray239[local3] != -1) {
					return -2;
				}
			}
			@Pc(39) boolean local39 = true;
			for (@Pc(41) int local41 = 0; local41 < this.aByteArrayArray5.length; local41++) {
				@Pc(48) byte[] local48 = this.aByteArrayArray6[local41];
				if (local48 != null) {
					@Pc(62) int local62 = (this.anIntArray237[local41] >> 8) * 64 - this.anInt945;
					@Pc(74) int local74 = (this.anIntArray237[local41] & 0xFF) * 64 - this.anInt946;
					if (this.aBoolean246) {
						local62 = 10;
						local74 = 10;
					}
					local39 &= Class27.method314(local74, local48, local62);
				}
			}
			if (!local39) {
				return -3;
			} else if (this.aBoolean261) {
				return -4;
			} else {
				this.anInt1018 = 2;
				Class27.anInt410 = this.anInt1074;
				this.method649();
				this.aClass6_Sub2_Sub3_8.method251(98);
				return 0;
			}
		} catch (@Pc(126) RuntimeException local126) {
			signlink.reporterror("95392, " + 31836 + ", " + local126.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
	@Override
	public String getParameter(@OriginalArg(0) String arg0) {
		return signlink.mainapp == null ? super.getParameter(arg0) : signlink.mainapp.getParameter(arg0);
	}

	@OriginalMember(owner = "client!client", name = "C", descriptor = "(I)V")
	private void method672() {
		try {
			for (@Pc(3) int local3 = -1; local3 < this.anInt1024; local3++) {
				@Pc(11) int local11;
				if (local3 == -1) {
					local11 = this.anInt1023;
				} else {
					local11 = this.anIntArray257[local3];
				}
				@Pc(23) Class6_Sub2_Sub1_Sub1_Sub2 local23 = this.aClass6_Sub2_Sub1_Sub1_Sub2Array1[local11];
				if (local23 != null) {
					this.method615(1, this.anInt1078, local23);
				}
			}
		} catch (@Pc(45) RuntimeException local45) {
			signlink.reporterror("55863, " + 3 + ", " + local45.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "D", descriptor = "(I)V")
	private void method673(@OriginalArg(0) int arg0) {
		try {
			@Pc(8) int local8;
			if (this.anInt967 > 0) {
				for (local8 = 0; local8 < 256; local8++) {
					if (this.anInt967 > 768) {
						this.anIntArray223[local8] = this.method597(1024 - this.anInt967, this.anIntArray224[local8], this.anIntArray225[local8]);
					} else if (this.anInt967 > 256) {
						this.anIntArray223[local8] = this.anIntArray225[local8];
					} else {
						this.anIntArray223[local8] = this.method597(256 - this.anInt967, this.anIntArray225[local8], this.anIntArray224[local8]);
					}
				}
			} else if (this.anInt968 > 0) {
				for (local8 = 0; local8 < 256; local8++) {
					if (this.anInt968 > 768) {
						this.anIntArray223[local8] = this.method597(1024 - this.anInt968, this.anIntArray224[local8], this.anIntArray226[local8]);
					} else if (this.anInt968 > 256) {
						this.anIntArray223[local8] = this.anIntArray226[local8];
					} else {
						this.anIntArray223[local8] = this.method597(256 - this.anInt968, this.anIntArray226[local8], this.anIntArray224[local8]);
					}
				}
			} else {
				for (local8 = 0; local8 < 256; local8++) {
					this.anIntArray223[local8] = this.anIntArray224[local8];
				}
			}
			for (local8 = 0; local8 < 33920; local8++) {
				this.aClass8_13.anIntArray38[local8] = this.aClass6_Sub2_Sub2_Sub1_16.anIntArray43[local8];
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
				local198 = this.anIntArray276[local185] * (256 - local185) / 256;
				local202 = local198 + 22;
				if (local202 < 0) {
					local202 = 0;
				}
				local181 += local202;
				for (local212 = local202; local212 < 128; local212++) {
					local220 = this.anIntArray263[local181++];
					if (local220 == 0) {
						local183++;
					} else {
						local224 = local220;
						local228 = 256 - local220;
						local220 = this.anIntArray223[local220];
						local239 = this.aClass8_13.anIntArray38[local183];
						this.aClass8_13.anIntArray38[local183++] = ((local220 & 0xFF00FF) * local224 + (local239 & 0xFF00FF) * local228 & 0xFF00FF00) + ((local220 & 0xFF00) * local224 + (local239 & 0xFF00) * local228 & 0xFF0000) >> 8;
					}
				}
				local183 += local202;
			}
			this.aClass8_13.method59(super.aGraphics2, 0, 0);
			if (arg0 < 0) {
				for (local198 = 0; local198 < 33920; local198++) {
					this.aClass8_14.anIntArray38[local198] = this.aClass6_Sub2_Sub2_Sub1_17.anIntArray43[local198];
				}
				local181 = 0;
				local183 = 1176;
				for (local202 = 1; local202 < 255; local202++) {
					local212 = this.anIntArray276[local202] * (256 - local202) / 256;
					local220 = 103 - local212;
					local183 += local212;
					for (local224 = 0; local224 < local220; local224++) {
						local228 = this.anIntArray263[local181++];
						if (local228 == 0) {
							local183++;
						} else {
							local239 = local228;
							@Pc(365) int local365 = 256 - local228;
							local228 = this.anIntArray223[local228];
							@Pc(376) int local376 = this.aClass8_14.anIntArray38[local183];
							this.aClass8_14.anIntArray38[local183++] = ((local228 & 0xFF00FF) * local239 + (local376 & 0xFF00FF) * local365 & 0xFF00FF00) + ((local228 & 0xFF00) * local239 + (local376 & 0xFF00) * local365 & 0xFF0000) >> 8;
						}
					}
					local181 += 128 - local220;
					local183 += 128 - local220 - local212;
				}
				this.aClass8_14.method59(super.aGraphics2, 0, 637);
			}
		} catch (@Pc(448) RuntimeException local448) {
			signlink.reporterror("89576, " + arg0 + ", " + local448.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "E", descriptor = "(I)V")
	private void method674() {
		try {
			if (super.anInt838 == 1) {
				if (super.anInt839 >= 539 && super.anInt839 <= 573 && super.anInt840 >= 169 && super.anInt840 < 205 && this.anIntArray256[0] != -1) {
					this.aBoolean279 = true;
					this.anInt861 = 0;
					this.aBoolean255 = true;
				}
				if (super.anInt839 >= 569 && super.anInt839 <= 599 && super.anInt840 >= 168 && super.anInt840 < 205 && this.anIntArray256[1] != -1) {
					this.aBoolean279 = true;
					this.anInt861 = 1;
					this.aBoolean255 = true;
				}
				if (super.anInt839 >= 597 && super.anInt839 <= 627 && super.anInt840 >= 168 && super.anInt840 < 205 && this.anIntArray256[2] != -1) {
					this.aBoolean279 = true;
					this.anInt861 = 2;
					this.aBoolean255 = true;
				}
				if (super.anInt839 >= 625 && super.anInt839 <= 669 && super.anInt840 >= 168 && super.anInt840 < 203 && this.anIntArray256[3] != -1) {
					this.aBoolean279 = true;
					this.anInt861 = 3;
					this.aBoolean255 = true;
				}
				if (super.anInt839 >= 666 && super.anInt839 <= 696 && super.anInt840 >= 168 && super.anInt840 < 205 && this.anIntArray256[4] != -1) {
					this.aBoolean279 = true;
					this.anInt861 = 4;
					this.aBoolean255 = true;
				}
				if (super.anInt839 >= 694 && super.anInt839 <= 724 && super.anInt840 >= 168 && super.anInt840 < 205 && this.anIntArray256[5] != -1) {
					this.aBoolean279 = true;
					this.anInt861 = 5;
					this.aBoolean255 = true;
				}
				if (super.anInt839 >= 722 && super.anInt839 <= 756 && super.anInt840 >= 169 && super.anInt840 < 205 && this.anIntArray256[6] != -1) {
					this.aBoolean279 = true;
					this.anInt861 = 6;
					this.aBoolean255 = true;
				}
				if (super.anInt839 >= 540 && super.anInt839 <= 574 && super.anInt840 >= 466 && super.anInt840 < 502 && this.anIntArray256[7] != -1) {
					this.aBoolean279 = true;
					this.anInt861 = 7;
					this.aBoolean255 = true;
				}
				if (super.anInt839 >= 572 && super.anInt839 <= 602 && super.anInt840 >= 466 && super.anInt840 < 503 && this.anIntArray256[8] != -1) {
					this.aBoolean279 = true;
					this.anInt861 = 8;
					this.aBoolean255 = true;
				}
				if (super.anInt839 >= 599 && super.anInt839 <= 629 && super.anInt840 >= 466 && super.anInt840 < 503 && this.anIntArray256[9] != -1) {
					this.aBoolean279 = true;
					this.anInt861 = 9;
					this.aBoolean255 = true;
				}
				if (super.anInt839 >= 627 && super.anInt839 <= 671 && super.anInt840 >= 467 && super.anInt840 < 502 && this.anIntArray256[10] != -1) {
					this.aBoolean279 = true;
					this.anInt861 = 10;
					this.aBoolean255 = true;
				}
				if (super.anInt839 >= 669 && super.anInt839 <= 699 && super.anInt840 >= 466 && super.anInt840 < 503 && this.anIntArray256[11] != -1) {
					this.aBoolean279 = true;
					this.anInt861 = 11;
					this.aBoolean255 = true;
				}
				if (super.anInt839 >= 696 && super.anInt839 <= 726 && super.anInt840 >= 466 && super.anInt840 < 503 && this.anIntArray256[12] != -1) {
					this.aBoolean279 = true;
					this.anInt861 = 12;
					this.aBoolean255 = true;
				}
				if (super.anInt839 >= 724 && super.anInt839 <= 758 && super.anInt840 >= 466 && super.anInt840 < 502 && this.anIntArray256[13] != -1) {
					this.aBoolean279 = true;
					this.anInt861 = 13;
					this.aBoolean255 = true;
					return;
				}
			}
		} catch (@Pc(444) RuntimeException local444) {
			signlink.reporterror("79757, " + -186 + ", " + local444.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "F", descriptor = "(I)V")
	private void method675() {
		try {
			if (this.anInt1035 != 8) {
				this.anInt880 = this.aClass6_Sub2_Sub3_9.method262();
			}
			@Pc(13) Graphics local13 = this.method586().getGraphics();
			local13.setColor(Color.black);
			local13.fillRect(0, 0, 765, 503);
			this.method579((byte) 2);
			@Pc(45) byte local45;
			@Pc(51) int local51;
			if (this.aBoolean257) {
				this.aBoolean275 = false;
				local13.setFont(new Font("Helvetica", 1, 16));
				local13.setColor(Color.yellow);
				local45 = 35;
				local13.drawString("Sorry, an error has occured whilst loading RuneScape", 30, 35);
				local51 = local45 + 50;
				local13.setColor(Color.white);
				local13.drawString("To fix this try the following (in order):", 30, 85);
				@Pc(60) int local60 = local51 + 50;
				local13.setColor(Color.white);
				local13.setFont(new Font("Helvetica", 1, 12));
				local13.drawString("1: Try closing ALL open web-browser windows, and reloading", 30, 135);
				@Pc(77) int local77 = local60 + 30;
				local13.drawString("2: Try clearing your web-browsers cache from tools->internet options", 30, 165);
				@Pc(83) int local83 = local77 + 30;
				local13.drawString("3: Try using a different game-world", 30, 195);
				@Pc(89) int local89 = local83 + 30;
				local13.drawString("4: Try rebooting your computer", 30, 225);
				@Pc(95) int local95 = local89 + 30;
				local13.drawString("5: Try selecting a different version of Java from the play-game menu", 30, 255);
			}
			if (this.aBoolean272) {
				this.aBoolean275 = false;
				local13.setFont(new Font("Helvetica", 1, 20));
				local13.setColor(Color.white);
				local13.drawString("Error - unable to load game!", 50, 50);
				local13.drawString("To play RuneScape make sure you play from", 50, 100);
				local13.drawString("http://www.runescape.com", 50, 150);
			}
			if (this.aBoolean262) {
				this.aBoolean275 = false;
				local13.setColor(Color.yellow);
				local45 = 35;
				local13.drawString("Error a copy of RuneScape already appears to be loaded", 30, 35);
				local51 = local45 + 50;
				local13.setColor(Color.white);
				local13.drawString("To fix this try the following (in order):", 30, 85);
				local51 += 50;
				local13.setColor(Color.white);
				local13.setFont(new Font("Helvetica", 1, 12));
				local13.drawString("1: Try closing ALL open web-browser windows, and reloading", 30, 135);
				local51 += 30;
				local13.drawString("2: Try rebooting your computer, and reloading", 30, 165);
				local51 += 30;
			}
		} catch (@Pc(183) RuntimeException local183) {
			signlink.reporterror("48978, " + 8 + ", " + local183.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "k", descriptor = "(Z)V")
	private void method676() {
		try {
			if (this.anInt1079 != 0) {
				@Pc(5) int local5 = 0;
				if (this.anInt847 != 0) {
					local5 = 1;
				}
				for (@Pc(12) int local12 = 0; local12 < 100; local12++) {
					if (this.aStringArray9[local12] != null) {
						@Pc(24) int local24 = this.anIntArray212[local12];
						@Pc(29) String local29 = this.aStringArray8[local12];
						if (local29 != null && local29.startsWith("@cr1@")) {
							local29 = local29.substring(5);
						}
						if (local29 != null && local29.startsWith("@cr2@")) {
							local29 = local29.substring(5);
						}
						if ((local24 == 3 || local24 == 7) && (local24 == 7 || this.anInt887 == 0 || this.anInt887 == 1 && this.method715(local29))) {
							@Pc(82) int local82 = 329 - local5 * 13;
							if (super.anInt833 > 4 && super.anInt834 - 4 > local82 - 10 && super.anInt834 - 4 <= local82 + 3) {
								@Pc(121) int local121 = this.aClass6_Sub2_Sub2_Sub2_3.method382("From:  " + local29 + this.aStringArray9[local12]) + 25;
								if (local121 > 450) {
									local121 = 450;
								}
								if (super.anInt833 < local121 + 4) {
									if (this.anInt917 >= 1) {
										this.aStringArray13[this.anInt933] = "Report abuse @whi@" + local29;
										this.anIntArray274[this.anInt933] = 2722;
										this.anInt933++;
									}
									this.aStringArray13[this.anInt933] = "Add ignore @whi@" + local29;
									this.anIntArray274[this.anInt933] = 2444;
									this.anInt933++;
									this.aStringArray13[this.anInt933] = "Add friend @whi@" + local29;
									this.anIntArray274[this.anInt933] = 2159;
									this.anInt933++;
								}
							}
							local5++;
							if (local5 >= 5) {
								return;
							}
						}
						if ((local24 == 5 || local24 == 6) && this.anInt887 < 2) {
							local5++;
							if (local5 >= 5) {
								return;
							}
						}
					}
				}
			}
		} catch (@Pc(241) RuntimeException local241) {
			signlink.reporterror("49285, " + false + ", " + local241.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILclient!XEGGEBDS;I)V")
	private void method677(@OriginalArg(0) int arg0, @OriginalArg(1) Class6_Sub2_Sub1_Sub1 arg1) {
		try {
			this.method678(arg1.anInt700, arg1.anInt699, arg0);
		} catch (@Pc(17) RuntimeException local17) {
			signlink.reporterror("77695, " + arg0 + ", " + arg1 + ", " + 8 + ", " + local17.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(IIII)V")
	private void method678(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		try {
			if (arg1 >= 128 && arg0 >= 128 && arg1 <= 13056 && arg0 <= 13056) {
				@Pc(28) int local28 = this.method640(arg1, this.anInt1074, arg0) - arg2;
				@Pc(33) int local33 = arg1 - this.anInt872;
				@Pc(38) int local38 = local28 - this.anInt873;
				@Pc(43) int local43 = arg0 - this.anInt874;
				@Pc(48) int local48 = Class6_Sub2_Sub1_Sub3.anIntArray96[this.anInt875];
				@Pc(53) int local53 = Class6_Sub2_Sub1_Sub3.anIntArray97[this.anInt875];
				@Pc(58) int local58 = Class6_Sub2_Sub1_Sub3.anIntArray96[this.anInt876];
				@Pc(63) int local63 = Class6_Sub2_Sub1_Sub3.anIntArray97[this.anInt876];
				@Pc(73) int local73 = local43 * local58 + local33 * local63 >> 16;
				@Pc(83) int local83 = local43 * local63 - local33 * local58 >> 16;
				@Pc(85) int local85 = local73;
				@Pc(95) int local95 = local38 * local53 - local83 * local48 >> 16;
				@Pc(105) int local105 = local38 * local48 + local83 * local53 >> 16;
				if (local105 >= 50) {
					this.anInt900 = Class6_Sub2_Sub2_Sub4.anInt815 + (local85 << 9) / local105;
					this.anInt901 = Class6_Sub2_Sub2_Sub4.anInt816 + (local95 << 9) / local105;
				} else {
					this.anInt900 = -1;
					this.anInt901 = -1;
				}
			} else {
				this.anInt900 = -1;
				this.anInt901 = -1;
			}
		} catch (@Pc(143) RuntimeException local143) {
			signlink.reporterror("20415, " + arg0 + ", " + -19921 + ", " + arg1 + ", " + arg2 + ", " + local143.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "i", descriptor = "(B)V")
	private void method679() {
		try {
			@Pc(7) int local7 = this.aClass6_Sub2_Sub2_Sub2_4.method382("Choose Option");
			@Pc(20) int local20;
			for (@Pc(9) int local9 = 0; local9 < this.anInt933; local9++) {
				local20 = this.aClass6_Sub2_Sub2_Sub2_4.method382(this.aStringArray13[local9]);
				if (local20 > local7) {
					local7 = local20;
				}
			}
			local7 += 8;
			local20 = this.anInt933 * 15 + 21;
			@Pc(72) int local72;
			@Pc(90) int local90;
			if (super.anInt839 > 4 && super.anInt840 > 4 && super.anInt839 < 516 && super.anInt840 < 338) {
				local72 = super.anInt839 - local7 / 2 - 4;
				if (local72 + local7 > 512) {
					local72 = 512 - local7;
				}
				if (local72 < 0) {
					local72 = 0;
				}
				local90 = super.anInt840 - 4;
				if (local90 + local20 > 334) {
					local90 = 334 - local20;
				}
				if (local90 < 0) {
					local90 = 0;
				}
				this.aBoolean264 = true;
				this.anInt866 = 0;
				this.anInt867 = local72;
				this.anInt868 = local90;
				this.anInt869 = local7;
				this.anInt870 = this.anInt933 * 15 + 22;
			}
			if (super.anInt839 > 553 && super.anInt840 > 205 && super.anInt839 < 743 && super.anInt840 < 466) {
				local72 = super.anInt839 - local7 / 2 - 553;
				if (local72 < 0) {
					local72 = 0;
				} else if (local72 + local7 > 190) {
					local72 = 190 - local7;
				}
				local90 = super.anInt840 - 205;
				if (local90 < 0) {
					local90 = 0;
				} else if (local90 + local20 > 261) {
					local90 = 261 - local20;
				}
				this.aBoolean264 = true;
				this.anInt866 = 1;
				this.anInt867 = local72;
				this.anInt868 = local90;
				this.anInt869 = local7;
				this.anInt870 = this.anInt933 * 15 + 22;
			}
			if (super.anInt839 > 17 && super.anInt840 > 357 && super.anInt839 < 496 && super.anInt840 < 453) {
				local72 = super.anInt839 - local7 / 2 - 17;
				if (local72 < 0) {
					local72 = 0;
				} else if (local72 + local7 > 479) {
					local72 = 479 - local7;
				}
				local90 = super.anInt840 - 357;
				if (local90 < 0) {
					local90 = 0;
				} else if (local90 + local20 > 96) {
					local90 = 96 - local20;
				}
				this.aBoolean264 = true;
				this.anInt866 = 2;
				this.anInt867 = local72;
				this.anInt868 = local90;
				this.anInt869 = local7;
				this.anInt870 = this.anInt933 * 15 + 22;
			}
		} catch (@Pc(294) RuntimeException local294) {
			signlink.reporterror("54124, " + 0 + ", " + local294.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
	@Override
	public AppletContext getAppletContext() {
		return signlink.mainapp == null ? super.getAppletContext() : signlink.mainapp.getAppletContext();
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(BJ)V")
	private void method680(@OriginalArg(1) long arg0) {
		try {
			if (arg0 != 0L) {
				if (this.anInt1052 >= 100) {
					this.method638("", 0, "Your ignore list is full. Max of 100 hit");
				} else {
					@Pc(23) String local23 = Class39.method363(Class39.method360(arg0));
					for (@Pc(25) int local25 = 0; local25 < this.anInt1052; local25++) {
						if (this.aLongArray3[local25] == arg0) {
							this.method638("", 0, local23 + " is already on your ignore list");
							return;
						}
					}
					for (@Pc(55) int local55 = 0; local55 < this.anInt926; local55++) {
						if (this.aLongArray4[local55] == arg0) {
							this.method638("", 0, "Please remove " + local23 + " from your friend list first");
							return;
						}
					}
					this.aLongArray3[this.anInt1052++] = arg0;
					this.aBoolean279 = true;
					this.aClass6_Sub2_Sub3_8.method251(232);
					this.aClass6_Sub2_Sub3_8.method258(arg0);
				}
			}
		} catch (@Pc(120) RuntimeException local120) {
			signlink.reporterror("21057, " + -68 + ", " + arg0 + ", " + local120.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(ILclient!NQUAUMDT;I)V")
	private void method681(@OriginalArg(0) int arg0, @OriginalArg(1) Class6_Sub2_Sub3 arg1) {
		try {
			this.anInt1016 = 0;
			this.anInt1025 = 0;
			this.method698(arg0, arg1);
			this.method634(arg1, arg0);
			this.method702(arg0, arg1);
			this.method628(arg0, arg1);
			@Pc(42) int local42;
			for (@Pc(35) int local35 = 0; local35 < this.anInt1016; local35++) {
				local42 = this.anIntArray255[local35];
				if (this.aClass6_Sub2_Sub1_Sub1_Sub2Array1[local42].anInt714 != anInt1077) {
					this.aClass6_Sub2_Sub1_Sub1_Sub2Array1[local42] = null;
				}
			}
			if (arg1.anInt404 != arg0) {
				signlink.reporterror("Error packet size mismatch in getplayer pos:" + arg1.anInt404 + " psize:" + arg0);
				throw new RuntimeException("eek");
			}
			for (local42 = 0; local42 < this.anInt1024; local42++) {
				if (this.aClass6_Sub2_Sub1_Sub1_Sub2Array1[this.anIntArray257[local42]] == null) {
					signlink.reporterror(this.aString28 + " null entry in pl list - pos:" + local42 + " size:" + this.anInt1024);
					throw new RuntimeException("eek");
				}
			}
		} catch (@Pc(122) RuntimeException local122) {
			signlink.reporterror("92722, " + arg0 + ", " + arg1 + ", " + 4918 + ", " + local122.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(I)V")
	@Override
	protected void method585() {
		try {
			this.aBoolean243 = true;
		} catch (@Pc(14) RuntimeException local14) {
			signlink.reporterror("13628, " + 0 + ", " + local14.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(ILclient!NQUAUMDT;I)V")
	private void method682(@OriginalArg(1) Class6_Sub2_Sub3 arg0, @OriginalArg(2) int arg1) {
		try {
			this.anInt1016 = 0;
			this.anInt1025 = 0;
			this.method664(arg0, this.anInt982, arg1);
			this.method696(arg1, arg0);
			this.method656(aBoolean249, arg1, arg0);
			@Pc(37) int local37;
			for (@Pc(30) int local30 = 0; local30 < this.anInt1016; local30++) {
				local37 = this.anIntArray255[local30];
				if (this.aClass6_Sub2_Sub1_Sub1_Sub1Array1[local37].anInt714 != anInt1077) {
					this.aClass6_Sub2_Sub1_Sub1_Sub1Array1[local37].aClass2_1 = null;
					this.aClass6_Sub2_Sub1_Sub1_Sub1Array1[local37] = null;
				}
			}
			if (arg0.anInt404 != arg1) {
				signlink.reporterror(this.aString28 + " size mismatch in getnpcpos - pos:" + arg0.anInt404 + " psize:" + arg1);
				throw new RuntimeException("eek");
			}
			for (local37 = 0; local37 < this.anInt886; local37++) {
				if (this.aClass6_Sub2_Sub1_Sub1_Sub1Array1[this.anIntArray222[local37]] == null) {
					signlink.reporterror(this.aString28 + " null entry in npc list - pos:" + local37 + " size:" + this.anInt886);
					throw new RuntimeException("eek");
				}
			}
		} catch (@Pc(127) RuntimeException local127) {
			signlink.reporterror("66902, " + 212 + ", " + arg0 + ", " + arg1 + ", " + local127.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(IJ)V")
	private void method683(@OriginalArg(1) long arg0) {
		try {
			if (arg0 != 0L) {
				if (this.anInt926 >= 100 && this.anInt1061 != 1) {
					this.method638("", 0, "Your friendlist is full. Max of 100 for free users, and 200 for members");
				} else if (this.anInt926 >= 200) {
					this.method638("", 0, "Your friendlist is full. Max of 100 for free users, and 200 for members");
				} else {
					@Pc(38) String local38 = Class39.method363(Class39.method360(arg0));
					for (@Pc(40) int local40 = 0; local40 < this.anInt926; local40++) {
						if (this.aLongArray4[local40] == arg0) {
							this.method638("", 0, local38 + " is already on your friend list");
							return;
						}
					}
					for (@Pc(70) int local70 = 0; local70 < this.anInt1052; local70++) {
						if (this.aLongArray3[local70] == arg0) {
							this.method638("", 0, "Please remove " + local38 + " from your ignore list first");
							return;
						}
					}
					if (!local38.equals(aClass6_Sub2_Sub1_Sub1_Sub2_1.aString16)) {
						this.aStringArray14[this.anInt926] = local38;
						this.aLongArray4[this.anInt926] = arg0;
						this.anIntArray231[this.anInt926] = 0;
						this.anInt926++;
						this.aBoolean279 = true;
						this.aClass6_Sub2_Sub3_8.method251(41);
						this.aClass6_Sub2_Sub3_8.method258(arg0);
					}
				}
			}
		} catch (@Pc(150) RuntimeException local150) {
			signlink.reporterror("71306, " + 0 + ", " + arg0 + ", " + local150.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(IZ)V")
	private void method684(@OriginalArg(0) int arg0) {
		try {
			this.aBoolean266 &= true;
			signlink.anInt1089 = arg0;
		} catch (@Pc(9) RuntimeException local9) {
			signlink.reporterror("44667, " + arg0 + ", " + true + ", " + local9.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/String;I)V")
	private void method685(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		try {
			if (arg0 == null || arg0.length() == 0) {
				this.anInt850 = 0;
			} else {
				@Pc(12) String local12 = arg0;
				this.anInt879 += arg1;
				@Pc(21) String[] local21 = new String[100];
				@Pc(23) int local23 = 0;
				while (true) {
					@Pc(27) int local27 = local12.indexOf(" ");
					if (local27 == -1) {
						local12 = local12.trim();
						if (local12.length() > 0) {
							local21[local23++] = local12.toLowerCase();
						}
						this.anInt850 = 0;
						label49: for (local27 = 0; local27 < Class43.anInt560; local27++) {
							@Pc(76) Class43 local76 = Class43.method464(local27);
							if (local76.anInt566 == -1 && local76.aString9 != null) {
								@Pc(87) String local87 = local76.aString9.toLowerCase();
								for (@Pc(89) int local89 = 0; local89 < local23; local89++) {
									if (local87.indexOf(local21[local89]) == -1) {
										continue label49;
									}
								}
								this.aStringArray10[this.anInt850] = local87;
								this.anIntArray213[this.anInt850] = local27;
								this.anInt850++;
								if (this.anInt850 >= this.aStringArray10.length) {
									return;
								}
							}
						}
						return;
					}
					@Pc(36) String local36 = local12.substring(0, local27).trim();
					if (local36.length() > 0) {
						local21[local23++] = local36.toLowerCase();
					}
					local12 = local12.substring(local27 + 1);
				}
			}
		} catch (@Pc(134) RuntimeException local134) {
			signlink.reporterror("74354, " + arg0 + ", " + arg1 + ", " + local134.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "G", descriptor = "(I)V")
	private void method686() {
		try {
			@Pc(11) int local11;
			for (@Pc(3) int local3 = -1; local3 < this.anInt1024; local3++) {
				if (local3 == -1) {
					local11 = this.anInt1023;
				} else {
					local11 = this.anIntArray257[local3];
				}
				@Pc(23) Class6_Sub2_Sub1_Sub1_Sub2 local23 = this.aClass6_Sub2_Sub1_Sub1_Sub2Array1[local11];
				if (local23 != null && local23.anInt707 > 0) {
					local23.anInt707--;
					if (local23.anInt707 == 0) {
						local23.aString15 = null;
					}
				}
			}
			anInt971++;
			if (anInt971 > 1171) {
				anInt971 = 0;
				this.aClass6_Sub2_Sub3_8.method251(53);
				this.aClass6_Sub2_Sub3_8.method252(0);
				local11 = this.aClass6_Sub2_Sub3_8.anInt404;
				this.aClass6_Sub2_Sub3_8.method253(32114);
				this.aClass6_Sub2_Sub3_8.method253(24032);
				if ((int) (Math.random() * 2.0D) == 0) {
					this.aClass6_Sub2_Sub3_8.method252(188);
				}
				this.aClass6_Sub2_Sub3_8.method253((int) (Math.random() * 65536.0D));
				this.aClass6_Sub2_Sub3_8.method253(38856);
				this.aClass6_Sub2_Sub3_8.method253(16760);
				if ((int) (Math.random() * 2.0D) == 0) {
					this.aClass6_Sub2_Sub3_8.method252(22);
				}
				this.aClass6_Sub2_Sub3_8.method253(52293);
				if ((int) (Math.random() * 2.0D) == 0) {
					this.aClass6_Sub2_Sub3_8.method253(63391);
				}
				this.aClass6_Sub2_Sub3_8.method253((int) (Math.random() * 65536.0D));
				this.aClass6_Sub2_Sub3_8.method261(this.aClass6_Sub2_Sub3_8.anInt404 - local11);
			}
			for (local11 = 0; local11 < this.anInt886; local11++) {
				@Pc(149) int local149 = this.anIntArray222[local11];
				@Pc(154) Class6_Sub2_Sub1_Sub1_Sub1 local154 = this.aClass6_Sub2_Sub1_Sub1_Sub1Array1[local149];
				if (local154 != null && local154.anInt707 > 0) {
					local154.anInt707--;
					if (local154.anInt707 == 0) {
						local154.aString15 = null;
					}
				}
			}
		} catch (@Pc(178) RuntimeException local178) {
			signlink.reporterror("42524, " + 268 + ", " + local178.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IILclient!FKNRMZJV;I)V")
	private void method687(@OriginalArg(0) int arg0, @OriginalArg(2) Class6_Sub2_Sub2_Sub1 arg1, @OriginalArg(3) int arg2) {
		try {
			@Pc(7) int local7 = this.anInt963 + this.anInt903 & 0x7FF;
			@Pc(15) int local15 = arg0 * arg0 + arg2 * arg2;
			if (local15 <= 6400) {
				@Pc(23) int local23 = Class6_Sub2_Sub1_Sub3.anIntArray96[local7];
				@Pc(27) int local27 = Class6_Sub2_Sub1_Sub3.anIntArray97[local7];
				@Pc(36) int local36 = local23 * 256 / (this.anInt844 + 256);
				@Pc(45) int local45 = local27 * 256 / (this.anInt844 + 256);
				this.anInt879 += 0;
				@Pc(61) int local61 = arg2 * local36 + arg0 * local45 >> 16;
				@Pc(71) int local71 = arg2 * local45 - arg0 * local36 >> 16;
				if (local15 > 2500) {
					arg1.method104(local61 + 94 + 4 - arg1.anInt230 / 2, 83 - local71 - arg1.anInt231 / 2 - 4, this.aClass6_Sub2_Sub2_Sub3_16);
				} else {
					arg1.method98(83 - local71 - arg1.anInt231 / 2 - 4, local61 + 94 - arg1.anInt230 / 2 + 4);
				}
			}
		} catch (@Pc(125) RuntimeException local125) {
			signlink.reporterror("21077, " + arg0 + ", " + 0 + ", " + arg1 + ", " + arg2 + ", " + local125.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIILclient!VGGOSQRK;I)V")
	private void method688(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class44 arg2, @OriginalArg(4) int arg3) {
		try {
			if (arg2.anInt649 == 0 && arg2.anIntArray176 != null && (!arg2.aBoolean189 || this.anInt1012 == arg2.anInt630 || this.anInt871 == arg2.anInt630 || this.anInt919 == arg2.anInt630)) {
				@Pc(29) int local29 = Class6_Sub2_Sub2.anInt806;
				@Pc(31) int local31 = Class6_Sub2_Sub2.anInt804;
				@Pc(33) int local33 = Class6_Sub2_Sub2.anInt807;
				@Pc(35) int local35 = Class6_Sub2_Sub2.anInt805;
				Class6_Sub2_Sub2.method549(arg3, arg0 + arg2.anInt642, arg0, arg3 + arg2.anInt645);
				@Pc(51) int local51 = arg2.anIntArray176.length;
				for (@Pc(53) int local53 = 0; local53 < local51; local53++) {
					@Pc(62) int local62 = arg2.anIntArray181[local53] + arg0;
					@Pc(71) int local71 = arg2.anIntArray178[local53] + arg3 - arg1;
					@Pc(77) Class44 local77 = Class44.method496(arg2.anIntArray176[local53]);
					@Pc(82) int local82 = local62 + local77.anInt643;
					@Pc(87) int local87 = local71 + local77.anInt618;
					if (local77.anInt615 > 0) {
						this.method700(local77);
					}
					if (local77.anInt649 == 0) {
						if (local77.anInt622 > local77.anInt646 - local77.anInt645) {
							local77.anInt622 = local77.anInt646 - local77.anInt645;
						}
						if (local77.anInt622 < 0) {
							local77.anInt622 = 0;
						}
						this.method688(local82, local77.anInt622, local77, local87);
						if (local77.anInt646 > local77.anInt645) {
							this.method699(local77.anInt646, local82 + local77.anInt642, local77.anInt622, local77.anInt645, local87);
						}
					} else if (local77.anInt649 != 1) {
						@Pc(159) int local159;
						@Pc(163) int local163;
						@Pc(174) int local174;
						@Pc(209) int local209;
						@Pc(216) int local216;
						@Pc(241) int local241;
						@Pc(157) int local157;
						@Pc(207) int local207;
						if (local77.anInt649 == 2) {
							local157 = 0;
							for (local159 = 0; local159 < local77.anInt645; local159++) {
								for (local163 = 0; local163 < local77.anInt642; local163++) {
									local174 = local82 + local163 * (local77.anInt641 + 32);
									@Pc(183) int local183 = local87 + local159 * (local77.anInt633 + 32);
									if (local157 < 20) {
										local174 += local77.anIntArray180[local157];
										local183 += local77.anIntArray174[local157];
									}
									if (local77.anIntArray173[local157] > 0) {
										local207 = 0;
										local209 = 0;
										local216 = local77.anIntArray173[local157] - 1;
										if (local174 > Class6_Sub2_Sub2.anInt806 - 32 && local174 < Class6_Sub2_Sub2.anInt807 && local183 > Class6_Sub2_Sub2.anInt804 - 32 && local183 < Class6_Sub2_Sub2.anInt805 || this.anInt1004 != 0 && this.anInt1003 == local157) {
											local241 = 0;
											if (this.anInt894 == 1 && this.anInt895 == local157 && this.anInt896 == local77.anInt630) {
												local241 = 16777215;
											}
											@Pc(266) Class6_Sub2_Sub2_Sub1 local266 = Class43.method468(local241, local77.anIntArray179[local157], this.aByte44, local216);
											if (local266 != null) {
												@Pc(345) int local345;
												if (this.anInt1004 != 0 && this.anInt1003 == local157 && this.anInt1002 == local77.anInt630) {
													local207 = super.anInt833 - this.anInt1005;
													local209 = super.anInt834 - this.anInt1006;
													if (local207 < 5 && local207 > -5) {
														local207 = 0;
													}
													if (local209 < 5 && local209 > -5) {
														local209 = 0;
													}
													if (this.anInt849 < 5) {
														local207 = 0;
														local209 = 0;
													}
													local266.method100(local174 + local207, local183 + local209);
													if (local183 + local209 < Class6_Sub2_Sub2.anInt804 && arg2.anInt622 > 0) {
														local345 = this.anInt860 * (Class6_Sub2_Sub2.anInt804 - local183 - local209) / 3;
														if (local345 > this.anInt860 * 10) {
															local345 = this.anInt860 * 10;
														}
														if (local345 > arg2.anInt622) {
															local345 = arg2.anInt622;
														}
														arg2.anInt622 -= local345;
														this.anInt1006 += local345;
													}
													if (local183 + local209 + 32 > Class6_Sub2_Sub2.anInt805 && arg2.anInt622 < arg2.anInt646 - arg2.anInt645) {
														local345 = this.anInt860 * (local183 + local209 + 32 - Class6_Sub2_Sub2.anInt805) / 3;
														if (local345 > this.anInt860 * 10) {
															local345 = this.anInt860 * 10;
														}
														if (local345 > arg2.anInt646 - arg2.anInt645 - arg2.anInt622) {
															local345 = arg2.anInt646 - arg2.anInt645 - arg2.anInt622;
														}
														arg2.anInt622 += local345;
														this.anInt1006 -= local345;
													}
												} else if (this.anInt914 != 0 && this.anInt913 == local157 && this.anInt912 == local77.anInt630) {
													local266.method100(local174, local183);
												} else {
													local266.method98(local183, local174);
												}
												if (local266.anInt230 == 33 || local77.anIntArray179[local157] != 1) {
													local345 = local77.anIntArray179[local157];
													this.aClass6_Sub2_Sub2_Sub2_2.method384(0, method717(local345), local174 + local207 + 1, local183 + 10 + local209, this.aByte41);
													this.aClass6_Sub2_Sub2_Sub2_2.method384(16776960, method717(local345), local174 + local207, local183 + 9 + local209, this.aByte41);
												}
											}
										}
									} else if (local77.aClass6_Sub2_Sub2_Sub1Array2 != null && local157 < 20) {
										@Pc(536) Class6_Sub2_Sub2_Sub1 local536 = local77.aClass6_Sub2_Sub2_Sub1Array2[local157];
										if (local536 != null) {
											local536.method98(local183, local174);
										}
									}
									local157++;
								}
							}
						} else if (local77.anInt649 == 3) {
							@Pc(562) boolean local562 = false;
							if (this.anInt919 == local77.anInt630 || this.anInt871 == local77.anInt630 || this.anInt1012 == local77.anInt630) {
								local562 = true;
							}
							if (this.method655(local77)) {
								local157 = local77.anInt628;
								if (local562 && local77.anInt640 != 0) {
									local157 = local77.anInt640;
								}
							} else {
								local157 = local77.anInt637;
								if (local562 && local77.anInt616 != 0) {
									local157 = local77.anInt616;
								}
							}
							if (local77.aByte35 == 0) {
								if (local77.aBoolean191) {
									Class6_Sub2_Sub2.method552(local77.anInt642, local82, local77.anInt645, local87, local157);
								} else {
									Class6_Sub2_Sub2.method553(local82, local77.anInt642, local157, local77.anInt645, local87);
								}
							} else if (local77.aBoolean191) {
								Class6_Sub2_Sub2.method551(local87, 256 - (local77.aByte35 & 0xFF), local77.anInt645, local82, local157, local77.anInt642);
							} else {
								Class6_Sub2_Sub2.method554(256 - (local77.aByte35 & 0xFF), local77.anInt642, local87, this.anInt1049, local82, local157, local77.anInt645);
							}
						} else {
							@Pc(681) Class6_Sub2_Sub2_Sub2 local681;
							@Pc(958) String local958;
							if (local77.anInt649 == 4) {
								local681 = local77.aClass6_Sub2_Sub2_Sub2_1;
								@Pc(684) String local684 = local77.aString14;
								@Pc(686) boolean local686 = false;
								if (this.anInt919 == local77.anInt630 || this.anInt871 == local77.anInt630 || this.anInt1012 == local77.anInt630) {
									local686 = true;
								}
								if (this.method655(local77)) {
									local159 = local77.anInt628;
									if (local686 && local77.anInt640 != 0) {
										local159 = local77.anInt640;
									}
									if (local77.aString11.length() > 0) {
										local684 = local77.aString11;
									}
								} else {
									local159 = local77.anInt637;
									if (local686 && local77.anInt616 != 0) {
										local159 = local77.anInt616;
									}
								}
								if (local77.anInt636 == 6 && this.aBoolean267) {
									local684 = "Please wait...";
									local159 = local77.anInt637;
								}
								if (Class6_Sub2_Sub2.anInt802 == 479) {
									if (local159 == 16776960) {
										local159 = 255;
									}
									if (local159 == 49152) {
										local159 = 16777215;
									}
								}
								local207 = local87 + local681.anInt507;
								while (local684.length() > 0) {
									if (local684.indexOf("%") != -1) {
										label390: while (true) {
											local209 = local684.indexOf("%1");
											if (local209 == -1) {
												while (true) {
													local209 = local684.indexOf("%2");
													if (local209 == -1) {
														while (true) {
															local209 = local684.indexOf("%3");
															if (local209 == -1) {
																while (true) {
																	local209 = local684.indexOf("%4");
																	if (local209 == -1) {
																		while (true) {
																			local209 = local684.indexOf("%5");
																			if (local209 == -1) {
																				break label390;
																			}
																			local684 = local684.substring(0, local209) + this.method612(this.method592(4, local77)) + local684.substring(local209 + 2);
																		}
																	}
																	local684 = local684.substring(0, local209) + this.method612(this.method592(3, local77)) + local684.substring(local209 + 2);
																}
															}
															local684 = local684.substring(0, local209) + this.method612(this.method592(2, local77)) + local684.substring(local209 + 2);
														}
													}
													local684 = local684.substring(0, local209) + this.method612(this.method592(1, local77)) + local684.substring(local209 + 2);
												}
											}
											local684 = local684.substring(0, local209) + this.method612(this.method592(0, local77)) + local684.substring(local209 + 2);
										}
									}
									local209 = local684.indexOf("\\n");
									if (local209 == -1) {
										local958 = local684;
										local684 = "";
									} else {
										local958 = local684.substring(0, local209);
										local684 = local684.substring(local209 + 2);
									}
									if (local77.aBoolean186) {
										local681.method381(local207, local159, this.anInt990, local958, local77.aBoolean195, local82 + local77.anInt642 / 2);
									} else {
										local681.method388(local159, local77.aBoolean195, local207, local82, local958);
									}
									local207 += local681.anInt507;
								}
							} else if (local77.anInt649 == 5) {
								@Pc(1021) Class6_Sub2_Sub2_Sub1 local1021;
								if (this.method655(local77)) {
									local1021 = local77.aClass6_Sub2_Sub2_Sub1_2;
								} else {
									local1021 = local77.aClass6_Sub2_Sub2_Sub1_1;
								}
								if (local1021 != null) {
									local1021.method98(local87, local82);
								}
							} else if (local77.anInt649 == 6) {
								local157 = Class6_Sub2_Sub2_Sub4.anInt815;
								local159 = Class6_Sub2_Sub2_Sub4.anInt816;
								Class6_Sub2_Sub2_Sub4.anInt815 = local82 + local77.anInt642 / 2;
								Class6_Sub2_Sub2_Sub4.anInt816 = local87 + local77.anInt645 / 2;
								local163 = Class6_Sub2_Sub2_Sub4.anIntArray204[local77.anInt620] * local77.anInt619 >> 16;
								local174 = Class6_Sub2_Sub2_Sub4.anIntArray205[local77.anInt620] * local77.anInt619 >> 16;
								@Pc(1082) boolean local1082 = this.method655(local77);
								if (local1082) {
									local207 = local77.anInt624;
								} else {
									local207 = local77.anInt623;
								}
								@Pc(1102) Class6_Sub2_Sub1_Sub3 local1102;
								if (local207 == -1) {
									local1102 = local77.method494(-1, local1082, -1);
								} else {
									@Pc(1108) Class21 local1108 = Class21.aClass21Array1[local207];
									local1102 = local77.method494(local1108.anIntArray109[local77.anInt629], local1082, local1108.anIntArray108[local77.anInt629]);
								}
								if (local1102 != null) {
									local1102.method154(local77.anInt621, 0, local77.anInt620, 0, local163, local174);
								}
								Class6_Sub2_Sub2_Sub4.anInt815 = local157;
								Class6_Sub2_Sub2_Sub4.anInt816 = local159;
							} else {
								if (local77.anInt649 == 7) {
									local681 = local77.aClass6_Sub2_Sub2_Sub2_1;
									local159 = 0;
									for (local163 = 0; local163 < local77.anInt645; local163++) {
										for (local174 = 0; local174 < local77.anInt642; local174++) {
											if (local77.anIntArray173[local159] > 0) {
												@Pc(1172) Class43 local1172 = Class43.method464(local77.anIntArray173[local159] - 1);
												@Pc(1176) String local1176 = String.valueOf(local1172.aString9);
												if (local1172.aBoolean177 || local77.anIntArray179[local159] != 1) {
													local1176 = local1176 + " x" + method647(local77.anIntArray179[local159]);
												}
												local209 = local82 + local174 * (local77.anInt641 + 115);
												local216 = local87 + local163 * (local77.anInt633 + 12);
												if (local77.aBoolean186) {
													local681.method381(local216, local77.anInt637, this.anInt990, local1176, local77.aBoolean195, local209 + local77.anInt642 / 2);
												} else {
													local681.method388(local77.anInt637, local77.aBoolean195, local216, local209, local1176);
												}
											}
											local159++;
										}
									}
								}
								if (local77.anInt649 == 8 && (this.anInt984 == local77.anInt630 || this.anInt920 == local77.anInt630 || this.anInt1051 == local77.anInt630) && this.anInt1060 == 100) {
									local157 = 0;
									local159 = 0;
									@Pc(1291) Class6_Sub2_Sub2_Sub2 local1291 = this.aClass6_Sub2_Sub2_Sub2_3;
									@Pc(1294) String local1294 = local77.aString14;
									while (local1294.length() > 0) {
										local207 = local1294.indexOf("\\n");
										if (local207 == -1) {
											local958 = local1294;
											local1294 = "";
										} else {
											local958 = local1294.substring(0, local207);
											local1294 = local1294.substring(local207 + 2);
										}
										local209 = local1291.method382(local958);
										if (local209 > local157) {
											local157 = local209;
										}
										local159 += local1291.anInt507 + 1;
									}
									local157 += 6;
									local159 += 7;
									local207 = local82 + local77.anInt642 - local157 - 5;
									local209 = local87 + local77.anInt645 + 5;
									if (local207 < local82 + 5) {
										local207 = local82 + 5;
									}
									if (local207 + local157 > arg0 + arg2.anInt642) {
										local207 = arg0 + arg2.anInt642 - local157;
									}
									if (local209 + local159 > arg3 + arg2.anInt645) {
										local209 = arg3 + arg2.anInt645 - local159;
									}
									Class6_Sub2_Sub2.method552(local157, local207, local159, local209, 16777120);
									Class6_Sub2_Sub2.method553(local207, local157, 0, local159, local209);
									local1294 = local77.aString14;
									local216 = local209 + local1291.anInt507 + 2;
									while (local1294.length() > 0) {
										local241 = local1294.indexOf("\\n");
										if (local241 == -1) {
											local958 = local1294;
											local1294 = "";
										} else {
											local958 = local1294.substring(0, local241);
											local1294 = local1294.substring(local241 + 2);
										}
										local1291.method388(0, false, local216, local207 + 3, local958);
										local216 += local1291.anInt507 + 1;
									}
								}
							}
						}
					}
				}
				Class6_Sub2_Sub2.method549(local31, local33, local29, local35);
			}
		} catch (@Pc(1486) RuntimeException local1486) {
			signlink.reporterror("34823, " + arg0 + ", " + -665 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local1486.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(ZI)V")
	private void method689(@OriginalArg(0) boolean arg0) {
		try {
			if (aClass6_Sub2_Sub1_Sub1_Sub2_1.anInt699 >> 7 == this.anInt1014 && aClass6_Sub2_Sub1_Sub1_Sub2_1.anInt700 >> 7 == this.anInt1015) {
				this.anInt1014 = 0;
			}
			@Pc(21) int local21 = this.anInt1024;
			if (arg0) {
				local21 = 1;
			}
			for (@Pc(36) int local36 = 0; local36 < local21; local36++) {
				@Pc(42) Class6_Sub2_Sub1_Sub1_Sub2 local42;
				@Pc(47) int local47;
				if (arg0) {
					local42 = aClass6_Sub2_Sub1_Sub1_Sub2_1;
					local47 = this.anInt1023 << 14;
				} else {
					local42 = this.aClass6_Sub2_Sub1_Sub1_Sub2Array1[this.anIntArray257[local36]];
					local47 = this.anIntArray257[local36] << 14;
				}
				if (local42 != null && local42.method510()) {
					local42.aBoolean208 = false;
					if ((aBoolean252 && this.anInt1024 > 50 || this.anInt1024 > 200) && !arg0 && local42.anInt681 == local42.anInt712) {
						local42.aBoolean208 = true;
					}
					@Pc(98) int local98 = local42.anInt699 >> 7;
					@Pc(103) int local103 = local42.anInt700 >> 7;
					if (local98 >= 0 && local98 < 104 && local103 >= 0 && local103 < 104) {
						if (local42.aClass6_Sub2_Sub1_Sub3_2 == null || anInt1077 < local42.anInt729 || anInt1077 >= local42.anInt730) {
							if ((local42.anInt699 & 0x7F) == 64 && (local42.anInt700 & 0x7F) == 64) {
								if (this.anIntArrayArray25[local98][local103] == this.anInt862) {
									continue;
								}
								this.anIntArrayArray25[local98][local103] = this.anInt862;
							}
							local42.anInt723 = this.method640(local42.anInt699, this.anInt1074, local42.anInt700);
							this.aClass41_1.method413(local42, local42.anInt699, local47, local42.anInt723, local42.anInt701, 60, local42.aBoolean206, this.anInt1074, local42.anInt700);
						} else {
							local42.aBoolean208 = false;
							local42.anInt723 = this.method640(local42.anInt699, this.anInt1074, local42.anInt700);
							this.aClass41_1.method414(local42.anInt701, this.anInt1074, local42.anInt699, local47, local42.anInt733, local42, local42.anInt732, local42.anInt731, local42.anInt723, local42.anInt734, local42.anInt700);
						}
					}
				}
			}
		} catch (@Pc(232) RuntimeException local232) {
			signlink.reporterror("53781, " + arg0 + ", " + 4 + ", " + local232.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "H", descriptor = "(I)V")
	private void method690() {
		try {
			@Pc(6) int local6 = this.anInt1055 * 128 + 64;
			@Pc(13) int local13 = this.anInt1056 * 128 + 64;
			@Pc(24) int local24 = this.method640(local6, this.anInt1074, local13) - this.anInt1057;
			if (this.anInt872 < local6) {
				this.anInt872 += this.anInt1058 + (local6 - this.anInt872) * this.anInt1059 / 1000;
				if (this.anInt872 > local6) {
					this.anInt872 = local6;
				}
			}
			if (this.anInt872 > local6) {
				this.anInt872 -= this.anInt1058 + (this.anInt872 - local6) * this.anInt1059 / 1000;
				if (this.anInt872 < local6) {
					this.anInt872 = local6;
				}
			}
			if (this.anInt873 < local24) {
				this.anInt873 += this.anInt1058 + (local24 - this.anInt873) * this.anInt1059 / 1000;
				if (this.anInt873 > local24) {
					this.anInt873 = local24;
				}
			}
			if (this.anInt873 > local24) {
				this.anInt873 -= this.anInt1058 + (this.anInt873 - local24) * this.anInt1059 / 1000;
				if (this.anInt873 < local24) {
					this.anInt873 = local24;
				}
			}
			if (this.anInt874 < local13) {
				this.anInt874 += this.anInt1058 + (local13 - this.anInt874) * this.anInt1059 / 1000;
				if (this.anInt874 > local13) {
					this.anInt874 = local13;
				}
			}
			if (this.anInt874 > local13) {
				this.anInt874 -= this.anInt1058 + (this.anInt874 - local13) * this.anInt1059 / 1000;
				if (this.anInt874 < local13) {
					this.anInt874 = local13;
				}
			}
			local6 = this.anInt973 * 128 + 64;
			local13 = this.anInt974 * 128 + 64;
			local24 = this.method640(local6, this.anInt1074, local13) - this.anInt975;
			@Pc(226) int local226 = local6 - this.anInt872;
			@Pc(231) int local231 = local24 - this.anInt873;
			@Pc(236) int local236 = local13 - this.anInt874;
			@Pc(247) int local247 = (int) Math.sqrt((double) (local226 * local226 + local236 * local236));
			@Pc(258) int local258 = (int) (Math.atan2((double) local231, (double) local247) * 325.949D) & 0x7FF;
			@Pc(269) int local269 = (int) (Math.atan2((double) local226, (double) local236) * -325.949D) & 0x7FF;
			if (local258 < 128) {
				local258 = 128;
			}
			if (local258 > 383) {
				local258 = 383;
			}
			if (this.anInt875 < local258) {
				this.anInt875 += this.anInt976 + (local258 - this.anInt875) * this.anInt977 / 1000;
				if (this.anInt875 > local258) {
					this.anInt875 = local258;
				}
			}
			if (this.anInt875 > local258) {
				this.anInt875 -= this.anInt976 + (this.anInt875 - local258) * this.anInt977 / 1000;
				if (this.anInt875 < local258) {
					this.anInt875 = local258;
				}
			}
			@Pc(340) int local340 = local269 - this.anInt876;
			if (local340 > 1024) {
				local340 -= 2048;
			}
			if (local340 < -1024) {
				local340 += 2048;
			}
			if (local340 > 0) {
				this.anInt876 += this.anInt976 + local340 * this.anInt977 / 1000;
				this.anInt876 &= 0x7FF;
			}
			if (local340 < 0) {
				this.anInt876 -= this.anInt976 + -local340 * this.anInt977 / 1000;
				this.anInt876 &= 0x7FF;
			}
			@Pc(398) int local398 = local269 - this.anInt876;
			if (local398 > 1024) {
				local398 -= 2048;
			}
			if (local398 < -1024) {
				local398 += 2048;
			}
			if (local398 < 0 && local340 > 0 || local398 > 0 && local340 < 0) {
				this.anInt876 = local269;
			}
		} catch (@Pc(419) RuntimeException local419) {
			signlink.reporterror("4135, " + 235 + ", " + local419.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "I", descriptor = "(I)V")
	private void method691() {
		try {
			if (super.anInt838 == 1) {
				if (super.anInt839 >= 6 && super.anInt839 <= 106 && super.anInt840 >= 467 && super.anInt840 <= 499) {
					this.anInt1028 = (this.anInt1028 + 1) % 4;
					this.aBoolean283 = true;
					this.aBoolean282 = true;
					this.aClass6_Sub2_Sub3_8.method251(56);
					this.aClass6_Sub2_Sub3_8.method252(this.anInt1028);
					this.aClass6_Sub2_Sub3_8.method252(this.anInt887);
					this.aClass6_Sub2_Sub3_8.method252(this.anInt951);
				}
				if (super.anInt839 >= 135 && super.anInt839 <= 235 && super.anInt840 >= 467 && super.anInt840 <= 499) {
					this.anInt887 = (this.anInt887 + 1) % 3;
					this.aBoolean283 = true;
					this.aBoolean282 = true;
					this.aClass6_Sub2_Sub3_8.method251(56);
					this.aClass6_Sub2_Sub3_8.method252(this.anInt1028);
					this.aClass6_Sub2_Sub3_8.method252(this.anInt887);
					this.aClass6_Sub2_Sub3_8.method252(this.anInt951);
				}
				if (super.anInt839 >= 273 && super.anInt839 <= 373 && super.anInt840 >= 467 && super.anInt840 <= 499) {
					this.anInt951 = (this.anInt951 + 1) % 3;
					this.aBoolean283 = true;
					this.aBoolean282 = true;
					this.aClass6_Sub2_Sub3_8.method251(56);
					this.aClass6_Sub2_Sub3_8.method252(this.anInt1028);
					this.aClass6_Sub2_Sub3_8.method252(this.anInt887);
					this.aClass6_Sub2_Sub3_8.method252(this.anInt951);
				}
				if (super.anInt839 >= 412 && super.anInt839 <= 512 && super.anInt840 >= 467 && super.anInt840 <= 499) {
					if (this.anInt994 == -1) {
						this.method725();
						this.aString19 = "";
						this.aBoolean253 = false;
						this.anInt940 = this.anInt994 = Class44.anInt631;
						return;
					}
					this.method638("", 0, "Please close the interface you have open before using 'report abuse'");
					return;
				}
			}
		} catch (@Pc(203) RuntimeException local203) {
			signlink.reporterror("15353, " + -42795 + ", " + local203.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "J", descriptor = "(I)V")
	private void method692() {
		try {
			try {
				@Pc(12) int local12 = aClass6_Sub2_Sub1_Sub1_Sub2_1.anInt699 + this.anInt908;
				@Pc(18) int local18 = aClass6_Sub2_Sub1_Sub1_Sub2_1.anInt700 + this.anInt929;
				if (this.anInt852 - local12 < -500 || this.anInt852 - local12 > 500 || this.anInt853 - local18 < -500 || this.anInt853 - local18 > 500) {
					this.anInt852 = local12;
					this.anInt853 = local18;
				}
				if (this.anInt852 != local12) {
					this.anInt852 += (local12 - this.anInt852) / 16;
				}
				if (this.anInt853 != local18) {
					this.anInt853 += (local18 - this.anInt853) / 16;
				}
				if (super.anIntArray210[1] == 1) {
					this.anInt964 += (-this.anInt964 - 24) / 2;
				} else if (super.anIntArray210[2] == 1) {
					this.anInt964 += (24 - this.anInt964) / 2;
				} else {
					this.anInt964 /= 2;
				}
				if (super.anIntArray210[3] == 1) {
					this.anInt965 += (12 - this.anInt965) / 2;
				} else if (super.anIntArray210[4] == 1) {
					this.anInt965 += (-this.anInt965 - 12) / 2;
				} else {
					this.anInt965 /= 2;
				}
				this.anInt963 = this.anInt963 + this.anInt964 / 2 & 0x7FF;
				this.anInt962 += this.anInt965 / 2;
				if (this.anInt962 < 128) {
					this.anInt962 = 128;
				}
				if (this.anInt962 > 383) {
					this.anInt962 = 383;
				}
				@Pc(205) int local205 = this.anInt852 >> 7;
				@Pc(210) int local210 = this.anInt853 >> 7;
				@Pc(220) int local220 = this.method640(this.anInt852, this.anInt1074, this.anInt853);
				@Pc(222) int local222 = 0;
				@Pc(238) int local238;
				if (local205 > 3 && local210 > 3 && local205 < 100 && local210 < 100) {
					for (local238 = local205 - 4; local238 <= local205 + 4; local238++) {
						for (@Pc(244) int local244 = local210 - 4; local244 <= local210 + 4; local244++) {
							@Pc(249) int local249 = this.anInt1074;
							if (local249 < 3 && (this.aByteArrayArrayArray8[1][local238][local244] & 0x2) == 2) {
								local249++;
							}
							@Pc(276) int local276 = local220 - this.anIntArrayArrayArray8[local249][local238][local244];
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
				if (local238 > this.anInt999) {
					this.anInt999 += (local238 - this.anInt999) / 24;
				} else if (local238 < this.anInt999) {
					this.anInt999 += (local238 - this.anInt999) / 80;
				}
			} catch (@Pc(340) Exception local340) {
				signlink.reporterror("glfc_ex " + aClass6_Sub2_Sub1_Sub1_Sub2_1.anInt699 + "," + aClass6_Sub2_Sub1_Sub1_Sub2_1.anInt700 + "," + this.anInt852 + "," + this.anInt853 + "," + this.anInt949 + "," + this.anInt950 + "," + this.anInt945 + "," + this.anInt946);
				throw new RuntimeException("eek");
			}
		} catch (@Pc(390) RuntimeException local390) {
			signlink.reporterror("22542, " + -760 + ", " + local390.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIILclient!VGGOSQRK;IIII)V")
	private void method693(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class44 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		try {
			if (arg3.anInt649 == 0 && arg3.anIntArray176 != null && !arg3.aBoolean189 && (arg0 >= arg1 && arg6 >= arg4 && arg0 <= arg1 + arg3.anInt642 && arg6 <= arg4 + arg3.anInt645)) {
				@Pc(34) int local34 = arg3.anIntArray176.length;
				for (@Pc(36) int local36 = 0; local36 < local34; local36++) {
					@Pc(45) int local45 = arg3.anIntArray181[local36] + arg1;
					@Pc(54) int local54 = arg3.anIntArray178[local36] + arg4 - arg5;
					@Pc(60) Class44 local60 = Class44.method496(arg3.anIntArray176[local36]);
					@Pc(65) int local65 = local45 + local60.anInt643;
					@Pc(70) int local70 = local54 + local60.anInt618;
					if ((local60.anInt639 >= 0 || local60.anInt616 != 0) && arg0 >= local65 && arg6 >= local70 && arg0 < local65 + local60.anInt642 && arg6 < local70 + local60.anInt645) {
						if (local60.anInt639 >= 0) {
							this.anInt1019 = local60.anInt639;
						} else {
							this.anInt1019 = local60.anInt630;
						}
					}
					if (local60.anInt649 == 8 && arg0 >= local65 && arg6 >= local70 && arg0 < local65 + local60.anInt642 && arg6 < local70 + local60.anInt645) {
						this.anInt1027 = local60.anInt630;
					}
					if (local60.anInt649 == 0) {
						this.method693(arg0, local65, arg2, local60, local70, local60.anInt622, arg6);
						if (local60.anInt646 > local60.anInt645) {
							this.method707(local60, local70, arg6, local60.anInt646, local65 + local60.anInt642, local60.anInt645, arg0, arg2);
						}
					} else {
						if (local60.anInt636 == 1 && arg0 >= local65 && arg6 >= local70 && arg0 < local65 + local60.anInt642 && arg6 < local70 + local60.anInt645) {
							@Pc(194) boolean local194 = false;
							if (local60.anInt615 != 0) {
								local194 = this.method718(this.anInt931, local60);
							}
							if (!local194) {
								this.aStringArray13[this.anInt933] = local60.aString10;
								this.anIntArray274[this.anInt933] = 455;
								this.anIntArray273[this.anInt933] = local60.anInt630;
								this.anInt933++;
							}
						}
						if (local60.anInt636 == 2 && this.anInt1038 == 0 && arg0 >= local65 && arg6 >= local70 && arg0 < local65 + local60.anInt642 && arg6 < local70 + local60.anInt645) {
							@Pc(259) String local259 = local60.aString13;
							if (local259.indexOf(" ") != -1) {
								local259 = local259.substring(0, local259.indexOf(" "));
							}
							this.aStringArray13[this.anInt933] = local259 + " @gre@" + local60.aString12;
							this.anIntArray274[this.anInt933] = 246;
							this.anIntArray273[this.anInt933] = local60.anInt630;
							this.anInt933++;
						}
						if (local60.anInt636 == 3 && arg0 >= local65 && arg6 >= local70 && arg0 < local65 + local60.anInt642 && arg6 < local70 + local60.anInt645) {
							this.aStringArray13[this.anInt933] = "Close";
							if (arg2 == 3) {
								this.anIntArray274[this.anInt933] = 405;
							} else {
								this.anIntArray274[this.anInt933] = 990;
							}
							this.anIntArray273[this.anInt933] = local60.anInt630;
							this.anInt933++;
						}
						if (local60.anInt636 == 4 && arg0 >= local65 && arg6 >= local70 && arg0 < local65 + local60.anInt642 && arg6 < local70 + local60.anInt645) {
							this.aStringArray13[this.anInt933] = local60.aString10;
							this.anIntArray274[this.anInt933] = 523;
							this.anIntArray273[this.anInt933] = local60.anInt630;
							this.anInt933++;
						}
						if (local60.anInt636 == 5 && arg0 >= local65 && arg6 >= local70 && arg0 < local65 + local60.anInt642 && arg6 < local70 + local60.anInt645) {
							this.aStringArray13[this.anInt933] = local60.aString10;
							this.anIntArray274[this.anInt933] = 883;
							this.anIntArray273[this.anInt933] = local60.anInt630;
							this.anInt933++;
						}
						if (local60.anInt636 == 6 && !this.aBoolean267 && arg0 >= local65 && arg6 >= local70 && arg0 < local65 + local60.anInt642 && arg6 < local70 + local60.anInt645) {
							this.aStringArray13[this.anInt933] = local60.aString10;
							this.anIntArray274[this.anInt933] = 149;
							this.anIntArray273[this.anInt933] = local60.anInt630;
							this.anInt933++;
						}
						if (local60.anInt649 == 2) {
							@Pc(518) int local518 = 0;
							for (@Pc(520) int local520 = 0; local520 < local60.anInt645; local520++) {
								for (@Pc(524) int local524 = 0; local524 < local60.anInt642; local524++) {
									@Pc(535) int local535 = local65 + local524 * (local60.anInt641 + 32);
									@Pc(544) int local544 = local70 + local520 * (local60.anInt633 + 32);
									if (local518 < 20) {
										local535 += local60.anIntArray180[local518];
										local544 += local60.anIntArray174[local518];
									}
									if (arg0 >= local535 && arg6 >= local544 && arg0 < local535 + 32 && arg6 < local544 + 32) {
										this.anInt958 = local518;
										this.anInt959 = local60.anInt630;
										if (local60.anIntArray173[local518] > 0) {
											@Pc(597) Class43 local597 = Class43.method464(local60.anIntArray173[local518] - 1);
											if (this.anInt894 == 1 && local60.aBoolean194) {
												if (local60.anInt630 != this.anInt896 || local518 != this.anInt895) {
													this.aStringArray13[this.anInt933] = "Use " + this.aString20 + " with @lre@" + local597.aString9;
													this.anIntArray274[this.anInt933] = 835;
													this.anIntArray275[this.anInt933] = local597.anInt558;
													this.anIntArray272[this.anInt933] = local518;
													this.anIntArray273[this.anInt933] = local60.anInt630;
													this.anInt933++;
												}
											} else if (this.anInt1038 != 1 || !local60.aBoolean194) {
												@Pc(734) int local734;
												if (local60.aBoolean194) {
													for (local734 = 4; local734 >= 3; local734--) {
														if (local597.aStringArray5 != null && local597.aStringArray5[local734] != null) {
															this.aStringArray13[this.anInt933] = local597.aStringArray5[local734] + " @lre@" + local597.aString9;
															if (local734 == 3) {
																this.anIntArray274[this.anInt933] = 675;
															}
															if (local734 == 4) {
																this.anIntArray274[this.anInt933] = 393;
															}
															this.anIntArray275[this.anInt933] = local597.anInt558;
															this.anIntArray272[this.anInt933] = local518;
															this.anIntArray273[this.anInt933] = local60.anInt630;
															this.anInt933++;
														} else if (local734 == 4) {
															this.aStringArray13[this.anInt933] = "Drop @lre@" + local597.aString9;
															this.anIntArray274[this.anInt933] = 393;
															this.anIntArray275[this.anInt933] = local597.anInt558;
															this.anIntArray272[this.anInt933] = local518;
															this.anIntArray273[this.anInt933] = local60.anInt630;
															this.anInt933++;
														}
													}
												}
												if (local60.aBoolean190) {
													this.aStringArray13[this.anInt933] = "Use @lre@" + local597.aString9;
													this.anIntArray274[this.anInt933] = 871;
													this.anIntArray275[this.anInt933] = local597.anInt558;
													this.anIntArray272[this.anInt933] = local518;
													this.anIntArray273[this.anInt933] = local60.anInt630;
													this.anInt933++;
												}
												if (local60.aBoolean194 && local597.aStringArray5 != null) {
													for (local734 = 2; local734 >= 0; local734--) {
														if (local597.aStringArray5[local734] != null) {
															this.aStringArray13[this.anInt933] = local597.aStringArray5[local734] + " @lre@" + local597.aString9;
															if (local734 == 0) {
																this.anIntArray274[this.anInt933] = 504;
															}
															if (local734 == 1) {
																this.anIntArray274[this.anInt933] = 486;
															}
															if (local734 == 2) {
																this.anIntArray274[this.anInt933] = 18;
															}
															this.anIntArray275[this.anInt933] = local597.anInt558;
															this.anIntArray272[this.anInt933] = local518;
															this.anIntArray273[this.anInt933] = local60.anInt630;
															this.anInt933++;
														}
													}
												}
												if (local60.aStringArray7 != null) {
													for (local734 = 4; local734 >= 0; local734--) {
														if (local60.aStringArray7[local734] != null) {
															this.aStringArray13[this.anInt933] = local60.aStringArray7[local734] + " @lre@" + local597.aString9;
															if (local734 == 0) {
																this.anIntArray274[this.anInt933] = 236;
															}
															if (local734 == 1) {
																this.anIntArray274[this.anInt933] = 29;
															}
															if (local734 == 2) {
																this.anIntArray274[this.anInt933] = 651;
															}
															if (local734 == 3) {
																this.anIntArray274[this.anInt933] = 605;
															}
															if (local734 == 4) {
																this.anIntArray274[this.anInt933] = 490;
															}
															this.anIntArray275[this.anInt933] = local597.anInt558;
															this.anIntArray272[this.anInt933] = local518;
															this.anIntArray273[this.anInt933] = local60.anInt630;
															this.anInt933++;
														}
													}
												}
												this.aStringArray13[this.anInt933] = "Examine @lre@" + local597.aString9;
												this.anIntArray274[this.anInt933] = 1910;
												this.anIntArray275[this.anInt933] = local597.anInt558;
												this.anIntArray272[this.anInt933] = local518;
												this.anIntArray273[this.anInt933] = local60.anInt630;
												this.anInt933++;
											} else if ((this.anInt1040 & 0x10) == 16) {
												this.aStringArray13[this.anInt933] = this.aString27 + " @lre@" + local597.aString9;
												this.anIntArray274[this.anInt933] = 632;
												this.anIntArray275[this.anInt933] = local597.anInt558;
												this.anIntArray272[this.anInt933] = local518;
												this.anIntArray273[this.anInt933] = local60.anInt630;
												this.anInt933++;
											}
										}
									}
									local518++;
								}
							}
						}
					}
				}
			}
		} catch (@Pc(1173) RuntimeException local1173) {
			signlink.reporterror("12999, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + 9 + ", " + local1173.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "l", descriptor = "(Z)Ljava/lang/String;")
	private String method694() {
		try {
			if (signlink.mainapp == null) {
				return super.aFrame_Sub1_2 == null ? super.getDocumentBase().getHost().toLowerCase() : "runescape.com";
			} else {
				return signlink.mainapp.getDocumentBase().getHost().toLowerCase();
			}
		} catch (@Pc(26) RuntimeException local26) {
			signlink.reporterror("47955, " + false + ", " + local26.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "m", descriptor = "(Z)V")
	private void method695() {
		try {
			for (@Pc(3) int local3 = 0; local3 < this.anInt1029; local3++) {
				if (this.anIntArray249[local3] <= 0) {
					@Pc(12) boolean local12 = false;
					try {
						if (this.anIntArray228[local3] != this.anInt1044 || this.anIntArray261[local3] != this.anInt980) {
							@Pc(45) Class6_Sub2_Sub3 local45 = Class23.method180(this.anIntArray228[local3], this.anIntArray261[local3]);
							if (System.currentTimeMillis() + (long) (local45.anInt404 / 22) > this.aLong29 + (long) (this.anInt1054 / 22)) {
								this.anInt1054 = local45.anInt404;
								this.aLong29 = System.currentTimeMillis();
								if (this.method639(local45.anInt404, local45.aByteArray9)) {
									this.anInt1044 = this.anIntArray228[local3];
									this.anInt980 = this.anIntArray261[local3];
								} else {
									local12 = true;
								}
							}
						} else if (!this.method623()) {
							local12 = true;
						}
					} catch (@Pc(95) Exception local95) {
						if (signlink.reporterror) {
							this.aClass6_Sub2_Sub3_8.method251(111);
							this.aClass6_Sub2_Sub3_8.method253(this.anIntArray228[local3] & 0x7FFF);
						} else {
							this.aClass6_Sub2_Sub3_8.method251(111);
							this.aClass6_Sub2_Sub3_8.method253(-1);
						}
					}
					if (local12 && this.anIntArray249[local3] != -5) {
						this.anIntArray249[local3] = -5;
					} else {
						this.anInt1029--;
						for (@Pc(138) int local138 = local3; local138 < this.anInt1029; local138++) {
							this.anIntArray228[local138] = this.anIntArray228[local138 + 1];
							this.anIntArray261[local138] = this.anIntArray261[local138 + 1];
							this.anIntArray249[local138] = this.anIntArray249[local138 + 1];
						}
						local3--;
					}
				} else {
					@Pc(190) int local190 = this.anIntArray249[local3]--;
				}
			}
			if (this.anInt846 > 0) {
				this.anInt846 -= 20;
				if (this.anInt846 < 0) {
					this.anInt846 = 0;
				}
				if (this.anInt846 == 0 && this.aBoolean250 && !aBoolean252) {
					this.anInt1062 = this.anInt877;
					this.aBoolean276 = true;
					this.aClass25_Sub1_1.method228(2, this.anInt1062);
					return;
				}
			}
		} catch (@Pc(243) RuntimeException local243) {
			signlink.reporterror("53130, " + false + ", " + local243.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IILclient!NQUAUMDT;)V")
	private void method696(@OriginalArg(0) int arg0, @OriginalArg(2) Class6_Sub2_Sub3 arg1) {
		try {
			while (true) {
				if (arg1.anInt405 + 21 < arg0 * 8) {
					@Pc(12) int local12 = arg1.method273(739, 14);
					if (local12 != 16383) {
						if (this.aClass6_Sub2_Sub1_Sub1_Sub1Array1[local12] == null) {
							this.aClass6_Sub2_Sub1_Sub1_Sub1Array1[local12] = new Class6_Sub2_Sub1_Sub1_Sub1();
						}
						@Pc(32) Class6_Sub2_Sub1_Sub1_Sub1 local32 = this.aClass6_Sub2_Sub1_Sub1_Sub1Array1[local12];
						this.anIntArray222[this.anInt886++] = local12;
						local32.anInt714 = anInt1077;
						@Pc(51) int local51 = arg1.method273(739, 1);
						if (local51 == 1) {
							this.anIntArray258[this.anInt1025++] = local12;
						}
						@Pc(70) int local70 = arg1.method273(739, 1);
						@Pc(75) int local75 = arg1.method273(739, 5);
						if (local75 > 15) {
							local75 -= 32;
						}
						@Pc(84) int local84 = arg1.method273(739, 5);
						if (local84 > 15) {
							local84 -= 32;
						}
						local32.aClass2_1 = Class2.method10(arg1.method273(739, 13));
						local32.anInt685 = local32.aClass2_1.aByte2;
						local32.anInt684 = local32.aClass2_1.anInt4;
						local32.anInt691 = local32.aClass2_1.anInt19;
						local32.anInt692 = local32.aClass2_1.anInt25;
						local32.anInt693 = local32.aClass2_1.anInt20;
						local32.anInt694 = local32.aClass2_1.anInt13;
						local32.anInt712 = local32.aClass2_1.anInt15;
						local32.method508(aClass6_Sub2_Sub1_Sub1_Sub2_1.anIntArray183[0] + local84, aClass6_Sub2_Sub1_Sub1_Sub2_1.anIntArray182[0] + local75, this.anInt848, local70 == 1);
						continue;
					}
				}
				arg1.method274(this.anInt902);
				@Pc(162) int local162 = arg0 + 0;
				return;
			}
		} catch (@Pc(164) RuntimeException local164) {
			signlink.reporterror("2601, " + arg0 + ", " + 0 + ", " + arg1 + ", " + local164.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(IIII)Z")
	private boolean method697(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		try {
			@Pc(7) int local7 = arg0 >> 14 & 0x7FFF;
			@Pc(23) int local23 = this.aClass41_1.method432(this.anInt1074, arg1, arg2, arg0);
			if (local23 == -1) {
				return false;
			}
			@Pc(32) int local32 = local23 & 0x1F;
			@Pc(38) int local38 = local23 >> 6 & 0x3;
			if (local32 == 10 || local32 == 11 || local32 == 22) {
				@Pc(50) Class19 local50 = Class19.method169(local7);
				@Pc(58) int local58;
				@Pc(61) int local61;
				if (local38 == 0 || local38 == 2) {
					local58 = local50.anInt319;
					local61 = local50.anInt304;
				} else {
					local58 = local50.anInt304;
					local61 = local50.anInt319;
				}
				@Pc(72) int local72 = local50.anInt305;
				if (local38 != 0) {
					local72 = (local72 << local38 & 0xF) + (local72 >> 4 - local38);
				}
				this.method719(0, local58, arg2, local72, aClass6_Sub2_Sub1_Sub1_Sub2_1.anIntArray183[0], local61, arg1, 0, false, 2, aClass6_Sub2_Sub1_Sub1_Sub2_1.anIntArray182[0]);
			} else {
				this.method719(local38, 0, arg2, 0, aClass6_Sub2_Sub1_Sub1_Sub2_1.anIntArray183[0], 0, arg1, local32 + 1, false, 2, aClass6_Sub2_Sub1_Sub1_Sub2_1.anIntArray182[0]);
			}
			this.anInt1070 = super.anInt839;
			this.anInt1071 = super.anInt840;
			this.anInt1073 = 2;
			this.anInt1072 = 0;
			return true;
		} catch (@Pc(149) RuntimeException local149) {
			signlink.reporterror("99787, " + arg0 + ", " + arg1 + ", " + 48241 + ", " + arg2 + ", " + local149.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IZLclient!NQUAUMDT;)V")
	private void method698(@OriginalArg(0) int arg0, @OriginalArg(2) Class6_Sub2_Sub3 arg1) {
		try {
			arg1.method272();
			@Pc(7) int local7 = arg1.method273(739, 1);
			if (local7 != 0) {
				@Pc(21) int local21 = arg1.method273(739, 2);
				if (local21 == 0) {
					this.anIntArray258[this.anInt1025++] = this.anInt1023;
				} else {
					@Pc(44) int local44;
					@Pc(54) int local54;
					if (local21 == 1) {
						local44 = arg1.method273(739, 3);
						aClass6_Sub2_Sub1_Sub1_Sub2_1.method506(false, local44);
						local54 = arg1.method273(739, 1);
						if (local54 == 1) {
							this.anIntArray258[this.anInt1025++] = this.anInt1023;
						}
					} else {
						@Pc(98) int local98;
						if (local21 == 2) {
							local44 = arg1.method273(739, 3);
							aClass6_Sub2_Sub1_Sub1_Sub2_1.method506(true, local44);
							local54 = arg1.method273(739, 3);
							aClass6_Sub2_Sub1_Sub1_Sub2_1.method506(true, local54);
							local98 = arg1.method273(739, 1);
							if (local98 == 1) {
								this.anIntArray258[this.anInt1025++] = this.anInt1023;
							}
						} else if (local21 == 3) {
							local44 = arg1.method273(739, 1);
							local54 = arg1.method273(739, 7);
							local98 = arg1.method273(739, 7);
							@Pc(137) int local137 = arg1.method273(739, 1);
							if (local137 == 1) {
								this.anIntArray258[this.anInt1025++] = this.anInt1023;
							}
							this.anInt1074 = arg1.method273(739, 2);
							aClass6_Sub2_Sub1_Sub1_Sub2_1.method508(local98, local54, this.anInt848, local44 == 1);
						}
					}
				}
			}
		} catch (@Pc(172) RuntimeException local172) {
			signlink.reporterror("41232, " + arg0 + ", " + false + ", " + arg1 + ", " + local172.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "()V")
	@Override
	protected void method581() {
		this.method588(anInt1011, 20, "Starting up");
		if (signlink.sunjava) {
			super.anInt827 = 5;
		}
		if (aBoolean263) {
			this.aBoolean262 = true;
			return;
		}
		aBoolean263 = true;
		@Pc(21) boolean local21 = false;
		@Pc(25) String local25 = this.method694();
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
			this.aBoolean272 = true;
			return;
		}
		if (signlink.aRandomAccessFile3 != null) {
			for (@Pc(101) int local101 = 0; local101 < 5; local101++) {
				this.aClass1Array1[local101] = new Class1(signlink.aRandomAccessFile3, local101 + 1, 500000, signlink.aRandomAccessFileArray1[local101], anInt938);
			}
		}
		try {
			this.method652(793);
			this.aClass37_2 = this.method629("title screen", "title", 1, 25, this.anIntArray217[1]);
			this.aClass6_Sub2_Sub2_Sub2_2 = new Class6_Sub2_Sub2_Sub2(this.aClass37_2, false, (byte) 8, "p11_full");
			this.aClass6_Sub2_Sub2_Sub2_3 = new Class6_Sub2_Sub2_Sub2(this.aClass37_2, false, (byte) 8, "p12_full");
			this.aClass6_Sub2_Sub2_Sub2_4 = new Class6_Sub2_Sub2_Sub2(this.aClass37_2, false, (byte) 8, "b12_full");
			this.aClass6_Sub2_Sub2_Sub2_5 = new Class6_Sub2_Sub2_Sub2(this.aClass37_2, true, (byte) 8, "q8_full");
			this.method666();
			this.method622();
			@Pc(197) Class37 local197 = this.method629("config", "config", 2, 30, this.anIntArray217[2]);
			@Pc(209) Class37 local209 = this.method629("interface", "interface", 3, 35, this.anIntArray217[3]);
			@Pc(221) Class37 local221 = this.method629("2d graphics", "media", 4, 40, this.anIntArray217[4]);
			@Pc(233) Class37 local233 = this.method629("textures", "textures", 6, 45, this.anIntArray217[6]);
			@Pc(245) Class37 local245 = this.method629("chat system", "wordenc", 7, 50, this.anIntArray217[7]);
			@Pc(257) Class37 local257 = this.method629("sound effects", "sounds", 8, 55, this.anIntArray217[8]);
			this.aByteArrayArrayArray8 = new byte[4][104][104];
			this.anIntArrayArrayArray8 = new int[4][105][105];
			this.aClass41_1 = new Class41(443, 104, 104, this.anIntArrayArrayArray8, 4);
			for (@Pc(282) int local282 = 0; local282 < 4; local282++) {
				this.aClass47Array1[local282] = new Class47(104, false, 104);
			}
			this.aClass6_Sub2_Sub2_Sub1_10 = new Class6_Sub2_Sub2_Sub1(512, 512);
			@Pc(317) Class37 local317 = this.method629("update list", "versionlist", 5, 60, this.anIntArray217[5]);
			this.method588(anInt1011, 60, "Connecting to update server");
			this.aClass25_Sub1_1 = new Class25_Sub1();
			this.aClass25_Sub1_1.method238(local317, this);
			Class48.method532(this.aClass25_Sub1_1.method237());
			Class6_Sub2_Sub1_Sub3.method130(this.aClass25_Sub1_1.method247(0), this.aClass25_Sub1_1);
			if (!aBoolean252) {
				this.anInt1062 = 0;
				this.aBoolean276 = true;
				this.aClass25_Sub1_1.method228(2, this.anInt1062);
				while (this.aClass25_Sub1_1.method227() > 0) {
					this.method645(anInt986);
					try {
						Thread.sleep(100L);
					} catch (@Pc(368) Exception local368) {
					}
					if (this.aClass25_Sub1_1.anInt381 > 3) {
						this.method641("ondemand");
						return;
					}
				}
			}
			this.method588(anInt1011, 65, "Requesting animations");
			@Pc(392) int local392 = this.aClass25_Sub1_1.method247(1);
			for (@Pc(394) int local394 = 0; local394 < local392; local394++) {
				this.aClass25_Sub1_1.method228(1, local394);
			}
			@Pc(413) int local413;
			while (this.aClass25_Sub1_1.method227() > 0) {
				local413 = local392 - this.aClass25_Sub1_1.method227();
				if (local413 > 0) {
					this.method588(anInt1011, 65, "Loading animations - " + local413 * 100 / local392 + "%");
				}
				this.method645(anInt986);
				try {
					Thread.sleep(100L);
				} catch (@Pc(439) Exception local439) {
				}
				if (this.aClass25_Sub1_1.anInt381 > 3) {
					this.method641("ondemand");
					return;
				}
			}
			this.method588(anInt1011, 70, "Requesting models");
			local392 = this.aClass25_Sub1_1.method247(0);
			@Pc(473) int local473;
			for (local413 = 0; local413 < local392; local413++) {
				local473 = this.aClass25_Sub1_1.method229(local413);
				if ((local473 & 0x1) != 0) {
					this.aClass25_Sub1_1.method228(0, local413);
				}
			}
			local392 = this.aClass25_Sub1_1.method227();
			while (this.aClass25_Sub1_1.method227() > 0) {
				local473 = local392 - this.aClass25_Sub1_1.method227();
				if (local473 > 0) {
					this.method588(anInt1011, 70, "Loading models - " + local473 * 100 / local392 + "%");
				}
				this.method645(anInt986);
				try {
					Thread.sleep(100L);
				} catch (@Pc(524) Exception local524) {
				}
			}
			if (this.aClass1Array1[0] != null) {
				this.method588(anInt1011, 75, "Requesting maps");
				this.aClass25_Sub1_1.method228(3, this.aClass25_Sub1_1.method232(0, 48, 47));
				this.aClass25_Sub1_1.method228(3, this.aClass25_Sub1_1.method232(1, 48, 47));
				this.aClass25_Sub1_1.method228(3, this.aClass25_Sub1_1.method232(0, 48, 48));
				this.aClass25_Sub1_1.method228(3, this.aClass25_Sub1_1.method232(1, 48, 48));
				this.aClass25_Sub1_1.method228(3, this.aClass25_Sub1_1.method232(0, 48, 49));
				this.aClass25_Sub1_1.method228(3, this.aClass25_Sub1_1.method232(1, 48, 49));
				this.aClass25_Sub1_1.method228(3, this.aClass25_Sub1_1.method232(0, 47, 47));
				this.aClass25_Sub1_1.method228(3, this.aClass25_Sub1_1.method232(1, 47, 47));
				this.aClass25_Sub1_1.method228(3, this.aClass25_Sub1_1.method232(0, 47, 48));
				this.aClass25_Sub1_1.method228(3, this.aClass25_Sub1_1.method232(1, 47, 48));
				this.aClass25_Sub1_1.method228(3, this.aClass25_Sub1_1.method232(0, 148, 48));
				this.aClass25_Sub1_1.method228(3, this.aClass25_Sub1_1.method232(1, 148, 48));
				local392 = this.aClass25_Sub1_1.method227();
				while (this.aClass25_Sub1_1.method227() > 0) {
					local473 = local392 - this.aClass25_Sub1_1.method227();
					if (local473 > 0) {
						this.method588(anInt1011, 75, "Loading maps - " + local473 * 100 / local392 + "%");
					}
					this.method645(anInt986);
					try {
						Thread.sleep(100L);
					} catch (@Pc(709) Exception local709) {
					}
				}
			}
			local392 = this.aClass25_Sub1_1.method247(0);
			@Pc(730) int local730;
			for (local473 = 0; local473 < local392; local473++) {
				local730 = this.aClass25_Sub1_1.method229(local473);
				@Pc(732) byte local732 = 0;
				if ((local730 & 0x8) != 0) {
					local732 = 10;
				} else if ((local730 & 0x20) != 0) {
					local732 = 9;
				} else if ((local730 & 0x10) != 0) {
					local732 = 8;
				} else if ((local730 & 0x40) != 0) {
					local732 = 7;
				} else if ((local730 & 0x80) != 0) {
					local732 = 6;
				} else if ((local730 & 0x2) != 0) {
					local732 = 5;
				} else if ((local730 & 0x4) != 0) {
					local732 = 4;
				}
				if ((local730 & 0x1) != 0) {
					local732 = 3;
				}
				if (local732 != 0) {
					this.aClass25_Sub1_1.method244(0, local732, local473);
				}
			}
			this.aClass25_Sub1_1.method242(aBoolean251);
			if (!aBoolean252) {
				local392 = this.aClass25_Sub1_1.method247(2);
				for (local730 = 1; local730 < local392; local730++) {
					if (this.aClass25_Sub1_1.method233(local730)) {
						this.aClass25_Sub1_1.method244(2, (byte) 1, local730);
					}
				}
			}
			this.method588(anInt1011, 80, "Unpacking media");
			this.aClass6_Sub2_Sub2_Sub3_15 = new Class6_Sub2_Sub2_Sub3(local221, "invback", 0);
			this.aClass6_Sub2_Sub2_Sub3_17 = new Class6_Sub2_Sub2_Sub3(local221, "chatback", 0);
			this.aClass6_Sub2_Sub2_Sub3_16 = new Class6_Sub2_Sub2_Sub3(local221, "mapback", 0);
			this.aClass6_Sub2_Sub2_Sub3_18 = new Class6_Sub2_Sub2_Sub3(local221, "backbase1", 0);
			this.aClass6_Sub2_Sub2_Sub3_19 = new Class6_Sub2_Sub2_Sub3(local221, "backbase2", 0);
			this.aClass6_Sub2_Sub2_Sub3_20 = new Class6_Sub2_Sub2_Sub3(local221, "backhmid1", 0);
			for (local730 = 0; local730 < 13; local730++) {
				this.aClass6_Sub2_Sub2_Sub3Array3[local730] = new Class6_Sub2_Sub2_Sub3(local221, "sideicons", local730);
			}
			this.aClass6_Sub2_Sub2_Sub1_5 = new Class6_Sub2_Sub2_Sub1(local221, "compass", 0);
			this.aClass6_Sub2_Sub2_Sub1_9 = new Class6_Sub2_Sub2_Sub1(local221, "mapedge", 0);
			this.aClass6_Sub2_Sub2_Sub1_9.method95();
			for (@Pc(932) int local932 = 0; local932 < 72; local932++) {
				this.aClass6_Sub2_Sub2_Sub3Array5[local932] = new Class6_Sub2_Sub2_Sub3(local221, "mapscene", local932);
			}
			for (@Pc(950) int local950 = 0; local950 < 63; local950++) {
				this.aClass6_Sub2_Sub2_Sub1Array8[local950] = new Class6_Sub2_Sub2_Sub1(local221, "mapfunction", local950);
			}
			for (@Pc(968) int local968 = 0; local968 < 5; local968++) {
				this.aClass6_Sub2_Sub2_Sub1Array4[local968] = new Class6_Sub2_Sub2_Sub1(local221, "hitmarks", local968);
			}
			for (@Pc(986) int local986 = 0; local986 < 6; local986++) {
				this.aClass6_Sub2_Sub2_Sub1Array9[local986] = new Class6_Sub2_Sub2_Sub1(local221, "headicons_pk", local986);
			}
			for (@Pc(1004) int local1004 = 0; local1004 < 9; local1004++) {
				this.aClass6_Sub2_Sub2_Sub1Array5[local1004] = new Class6_Sub2_Sub2_Sub1(local221, "headicons_prayer", local1004);
			}
			for (@Pc(1022) int local1022 = 0; local1022 < 6; local1022++) {
				this.aClass6_Sub2_Sub2_Sub1Array10[local1022] = new Class6_Sub2_Sub2_Sub1(local221, "headicons_hint", local1022);
			}
			this.aClass6_Sub2_Sub2_Sub1_8 = new Class6_Sub2_Sub2_Sub1(local221, "overlay_multiway", 0);
			this.aClass6_Sub2_Sub2_Sub1_3 = new Class6_Sub2_Sub2_Sub1(local221, "mapmarker", 0);
			this.aClass6_Sub2_Sub2_Sub1_4 = new Class6_Sub2_Sub2_Sub1(local221, "mapmarker", 1);
			for (@Pc(1064) int local1064 = 0; local1064 < 8; local1064++) {
				this.aClass6_Sub2_Sub2_Sub1Array7[local1064] = new Class6_Sub2_Sub2_Sub1(local221, "cross", local1064);
			}
			this.aClass6_Sub2_Sub2_Sub1_11 = new Class6_Sub2_Sub2_Sub1(local221, "mapdots", 0);
			this.aClass6_Sub2_Sub2_Sub1_12 = new Class6_Sub2_Sub2_Sub1(local221, "mapdots", 1);
			this.aClass6_Sub2_Sub2_Sub1_13 = new Class6_Sub2_Sub2_Sub1(local221, "mapdots", 2);
			this.aClass6_Sub2_Sub2_Sub1_14 = new Class6_Sub2_Sub2_Sub1(local221, "mapdots", 3);
			this.aClass6_Sub2_Sub2_Sub1_15 = new Class6_Sub2_Sub2_Sub1(local221, "mapdots", 4);
			this.aClass6_Sub2_Sub2_Sub3_13 = new Class6_Sub2_Sub2_Sub3(local221, "scrollbar", 0);
			this.aClass6_Sub2_Sub2_Sub3_14 = new Class6_Sub2_Sub2_Sub3(local221, "scrollbar", 1);
			this.aClass6_Sub2_Sub2_Sub3_6 = new Class6_Sub2_Sub2_Sub3(local221, "redstone1", 0);
			this.aClass6_Sub2_Sub2_Sub3_7 = new Class6_Sub2_Sub2_Sub3(local221, "redstone2", 0);
			this.aClass6_Sub2_Sub2_Sub3_8 = new Class6_Sub2_Sub2_Sub3(local221, "redstone3", 0);
			this.aClass6_Sub2_Sub2_Sub3_9 = new Class6_Sub2_Sub2_Sub3(local221, "redstone1", 0);
			this.aClass6_Sub2_Sub2_Sub3_9.method485();
			this.aClass6_Sub2_Sub2_Sub3_10 = new Class6_Sub2_Sub2_Sub3(local221, "redstone2", 0);
			this.aClass6_Sub2_Sub2_Sub3_10.method485();
			this.aClass6_Sub2_Sub2_Sub3_1 = new Class6_Sub2_Sub2_Sub3(local221, "redstone1", 0);
			this.aClass6_Sub2_Sub2_Sub3_1.method486();
			this.aClass6_Sub2_Sub2_Sub3_2 = new Class6_Sub2_Sub2_Sub3(local221, "redstone2", 0);
			this.aClass6_Sub2_Sub2_Sub3_2.method486();
			this.aClass6_Sub2_Sub2_Sub3_3 = new Class6_Sub2_Sub2_Sub3(local221, "redstone3", 0);
			this.aClass6_Sub2_Sub2_Sub3_3.method486();
			this.aClass6_Sub2_Sub2_Sub3_4 = new Class6_Sub2_Sub2_Sub3(local221, "redstone1", 0);
			this.aClass6_Sub2_Sub2_Sub3_4.method485();
			this.aClass6_Sub2_Sub2_Sub3_4.method486();
			this.aClass6_Sub2_Sub2_Sub3_5 = new Class6_Sub2_Sub2_Sub3(local221, "redstone2", 0);
			this.aClass6_Sub2_Sub2_Sub3_5.method485();
			this.aClass6_Sub2_Sub2_Sub3_5.method486();
			for (@Pc(1254) int local1254 = 0; local1254 < 2; local1254++) {
				this.aClass6_Sub2_Sub2_Sub3Array4[local1254] = new Class6_Sub2_Sub2_Sub3(local221, "mod_icons", local1254);
			}
			@Pc(1277) Class6_Sub2_Sub2_Sub1 local1277 = new Class6_Sub2_Sub2_Sub1(local221, "backleft1", 0);
			this.aClass8_19 = new Class8(local1277.anInt227, local1277.anInt226, this.method586(), (byte) 0);
			local1277.method96(0, 0);
			@Pc(1302) Class6_Sub2_Sub2_Sub1 local1302 = new Class6_Sub2_Sub2_Sub1(local221, "backleft2", 0);
			this.aClass8_20 = new Class8(local1302.anInt227, local1302.anInt226, this.method586(), (byte) 0);
			local1302.method96(0, 0);
			@Pc(1327) Class6_Sub2_Sub2_Sub1 local1327 = new Class6_Sub2_Sub2_Sub1(local221, "backright1", 0);
			this.aClass8_21 = new Class8(local1327.anInt227, local1327.anInt226, this.method586(), (byte) 0);
			local1327.method96(0, 0);
			@Pc(1352) Class6_Sub2_Sub2_Sub1 local1352 = new Class6_Sub2_Sub2_Sub1(local221, "backright2", 0);
			this.aClass8_22 = new Class8(local1352.anInt227, local1352.anInt226, this.method586(), (byte) 0);
			local1352.method96(0, 0);
			@Pc(1377) Class6_Sub2_Sub2_Sub1 local1377 = new Class6_Sub2_Sub2_Sub1(local221, "backtop1", 0);
			this.aClass8_23 = new Class8(local1377.anInt227, local1377.anInt226, this.method586(), (byte) 0);
			local1377.method96(0, 0);
			@Pc(1402) Class6_Sub2_Sub2_Sub1 local1402 = new Class6_Sub2_Sub2_Sub1(local221, "backvmid1", 0);
			this.aClass8_24 = new Class8(local1402.anInt227, local1402.anInt226, this.method586(), (byte) 0);
			local1402.method96(0, 0);
			@Pc(1427) Class6_Sub2_Sub2_Sub1 local1427 = new Class6_Sub2_Sub2_Sub1(local221, "backvmid2", 0);
			this.aClass8_25 = new Class8(local1427.anInt227, local1427.anInt226, this.method586(), (byte) 0);
			local1427.method96(0, 0);
			@Pc(1452) Class6_Sub2_Sub2_Sub1 local1452 = new Class6_Sub2_Sub2_Sub1(local221, "backvmid3", 0);
			this.aClass8_26 = new Class8(local1452.anInt227, local1452.anInt226, this.method586(), (byte) 0);
			local1452.method96(0, 0);
			@Pc(1477) Class6_Sub2_Sub2_Sub1 local1477 = new Class6_Sub2_Sub2_Sub1(local221, "backhmid2", 0);
			this.aClass8_27 = new Class8(local1477.anInt227, local1477.anInt226, this.method586(), (byte) 0);
			local1477.method96(0, 0);
			@Pc(1502) int local1502 = (int) (Math.random() * 21.0D) - 10;
			@Pc(1509) int local1509 = (int) (Math.random() * 21.0D) - 10;
			@Pc(1516) int local1516 = (int) (Math.random() * 21.0D) - 10;
			@Pc(1523) int local1523 = (int) (Math.random() * 41.0D) - 20;
			for (@Pc(1525) int local1525 = 0; local1525 < 100; local1525++) {
				if (this.aClass6_Sub2_Sub2_Sub1Array8[local1525] != null) {
					this.aClass6_Sub2_Sub2_Sub1Array8[local1525].method94(local1516 + local1523, local1509 + local1523, local1502 + local1523);
				}
				if (this.aClass6_Sub2_Sub2_Sub3Array5[local1525] != null) {
					this.aClass6_Sub2_Sub2_Sub3Array5[local1525].method487(local1516 + local1523, local1509 + local1523, local1502 + local1523);
				}
			}
			this.method588(anInt1011, 83, "Unpacking textures");
			Class6_Sub2_Sub2_Sub4.method564(local233);
			Class6_Sub2_Sub2_Sub4.method568(0.8D);
			Class6_Sub2_Sub2_Sub4.method563();
			this.method588(anInt1011, 86, "Unpacking config");
			Class21.method175(local197);
			Class19.method171(local197);
			Class32.method343(local197);
			Class43.method462(local197);
			Class2.method9(local197);
			Class40.method395(local197);
			Class31.method335(local197);
			Class14.method118(local197);
			Class17.method159(local197);
			Class43.aBoolean174 = aBoolean251;
			if (!aBoolean252) {
				this.method588(anInt1011, 90, "Unpacking sounds");
				@Pc(1628) byte[] local1628 = local257.method358("sounds.dat", null);
				@Pc(1634) Class6_Sub2_Sub3 local1634 = new Class6_Sub2_Sub3(-587, local1628);
				Class23.method179(local1634);
			}
			this.method588(anInt1011, 95, "Unpacking interfaces");
			@Pc(1665) Class6_Sub2_Sub2_Sub2[] local1665 = new Class6_Sub2_Sub2_Sub2[] { this.aClass6_Sub2_Sub2_Sub2_2, this.aClass6_Sub2_Sub2_Sub2_3, this.aClass6_Sub2_Sub2_Sub2_4, this.aClass6_Sub2_Sub2_Sub2_5 };
			Class44.method493(223, local1665, local221, local209);
			this.method588(anInt1011, 100, "Preparing game engine");
			@Pc(1681) int local1681;
			@Pc(1683) int local1683;
			@Pc(1685) int local1685;
			for (@Pc(1677) int local1677 = 0; local1677 < 33; local1677++) {
				local1681 = 999;
				local1683 = 0;
				for (local1685 = 0; local1685 < 34; local1685++) {
					if (this.aClass6_Sub2_Sub2_Sub3_16.aByteArray13[local1685 + local1677 * this.aClass6_Sub2_Sub2_Sub3_16.anInt605] == 0) {
						if (local1681 == 999) {
							local1681 = local1685;
						}
					} else if (local1681 != 999) {
						local1683 = local1685;
						break;
					}
				}
				this.anIntArray216[local1677] = local1681;
				this.anIntArray215[local1677] = local1683 - local1681;
			}
			@Pc(1743) int local1743;
			for (local1681 = 5; local1681 < 156; local1681++) {
				local1683 = 999;
				local1685 = 0;
				for (local1743 = 25; local1743 < 172; local1743++) {
					if (this.aClass6_Sub2_Sub2_Sub3_16.aByteArray13[local1743 + local1681 * this.aClass6_Sub2_Sub2_Sub3_16.anInt605] == 0 && (local1743 > 34 || local1681 > 34)) {
						if (local1683 == 999) {
							local1683 = local1743;
						}
					} else if (local1683 != 999) {
						local1685 = local1743;
						break;
					}
				}
				this.anIntArray219[local1681 - 5] = local1683 - 25;
				this.anIntArray214[local1681 - 5] = local1685 - local1683;
			}
			Class6_Sub2_Sub2_Sub4.method561(503, 765);
			this.anIntArray268 = Class6_Sub2_Sub2_Sub4.anIntArray206;
			Class6_Sub2_Sub2_Sub4.method561(96, 479);
			this.anIntArray265 = Class6_Sub2_Sub2_Sub4.anIntArray206;
			Class6_Sub2_Sub2_Sub4.method561(261, 190);
			this.anIntArray266 = Class6_Sub2_Sub2_Sub4.anIntArray206;
			Class6_Sub2_Sub2_Sub4.method561(334, 512);
			this.anIntArray267 = Class6_Sub2_Sub2_Sub4.anIntArray206;
			@Pc(1834) int[] local1834 = new int[9];
			for (local1685 = 0; local1685 < 9; local1685++) {
				local1743 = local1685 * 32 + 128 + 15;
				@Pc(1852) int local1852 = local1743 * 3 + 600;
				@Pc(1856) int local1856 = Class6_Sub2_Sub2_Sub4.anIntArray204[local1743];
				local1834[local1685] = local1852 * local1856 >> 16;
			}
			Class41.method438(local1834);
			Class26.method188(local245);
			this.aClass36_1 = new Class36(this, (byte) -88);
			this.method587(this.aClass36_1, 10);
			Class6_Sub2_Sub1_Sub2.aClient2 = this;
			Class19.aClient3 = this;
			Class2.aClient1 = this;
		} catch (@Pc(1897) Exception local1897) {
			signlink.reporterror("loaderror " + this.aString17 + " " + this.anInt918);
			this.aBoolean257 = true;
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIIII)V")
	private void method699(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		try {
			this.aClass6_Sub2_Sub2_Sub3_13.method488(arg4, arg1);
			this.aClass6_Sub2_Sub2_Sub3_14.method488(arg4 + arg3 - 16, arg1);
			Class6_Sub2_Sub2.method552(16, arg1, arg3 - 32, arg4 + 16, this.anInt898);
			@Pc(35) int local35 = (arg3 - 32) * arg3 / arg0;
			if (local35 < 8) {
				local35 = 8;
			}
			@Pc(52) int local52 = (arg3 - local35 - 32) * arg2 / (arg0 - arg3);
			Class6_Sub2_Sub2.method552(16, arg1, local35, arg4 + local52 + 16, this.anInt952);
			if (this.anInt991 > 3 || this.anInt991 < 3) {
				for (@Pc(74) int local74 = 1; local74 > 0; local74++) {
				}
			}
			Class6_Sub2_Sub2.method557(arg1, arg4 + local52 + 16, this.anInt932, local35);
			Class6_Sub2_Sub2.method557(arg1 + 1, arg4 + 16 + local52, this.anInt932, local35);
			Class6_Sub2_Sub2.method555(this.anInt932, arg4 + local52 + 16, arg1, 16);
			Class6_Sub2_Sub2.method555(this.anInt932, arg4 + local52 + 17, arg1, 16);
			Class6_Sub2_Sub2.method557(arg1 + 15, arg4 + 16 + local52, this.anInt863, local35);
			Class6_Sub2_Sub2.method557(arg1 + 14, arg4 + 17 + local52, this.anInt863, local35 - 1);
			Class6_Sub2_Sub2.method555(this.anInt863, arg4 + local52 + local35 + 15, arg1, 16);
			Class6_Sub2_Sub2.method555(this.anInt863, arg4 + local52 + local35 + 14, arg1 + 1, 15);
		} catch (@Pc(183) RuntimeException local183) {
			signlink.reporterror("12678, " + 3 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local183.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILclient!VGGOSQRK;)V")
	private void method700(@OriginalArg(1) Class44 arg0) {
		try {
			@Pc(4) int local4 = arg0.anInt615;
			@Pc(66) int local66;
			if ((local4 < 1 || local4 > 100) && (local4 < 701 || local4 > 800)) {
				if (local4 >= 101 && local4 <= 200 || !(local4 < 801 || local4 > 900)) {
					local66 = this.anInt926;
					if (this.anInt927 != 2) {
						local66 = 0;
					}
					if (local4 > 800) {
						local4 -= 701;
					} else {
						local4 -= 101;
					}
					if (local4 >= local66) {
						arg0.aString14 = "";
						arg0.anInt636 = 0;
					} else {
						if (this.anIntArray231[local4] == 0) {
							arg0.aString14 = "@red@Offline";
						} else if (this.anIntArray231[local4] < 200) {
							if (this.anIntArray231[local4] == anInt892) {
								arg0.aString14 = "@gre@World" + (this.anIntArray231[local4] - 9);
							} else {
								arg0.aString14 = "@yel@World" + (this.anIntArray231[local4] - 9);
							}
						} else if (this.anIntArray231[local4] == anInt892) {
							arg0.aString14 = "@gre@Classic" + (this.anIntArray231[local4] - 219);
						} else {
							arg0.aString14 = "@yel@Classic" + (this.anIntArray231[local4] - 219);
						}
						arg0.anInt636 = 1;
					}
				} else if (local4 == 203) {
					local66 = this.anInt926;
					if (this.anInt927 != 2) {
						local66 = 0;
					}
					arg0.anInt646 = local66 * 15 + 20;
					if (arg0.anInt646 <= arg0.anInt645) {
						arg0.anInt646 = arg0.anInt645 + 1;
					}
				} else if (local4 >= 401 && local4 <= 500) {
					local4 -= 401;
					if (local4 == 0 && this.anInt927 == 0) {
						arg0.aString14 = "Loading ignore list";
						arg0.anInt636 = 0;
					} else if (local4 == 1 && this.anInt927 == 0) {
						arg0.aString14 = "Please wait...";
						arg0.anInt636 = 0;
					} else {
						local66 = this.anInt1052;
						if (this.anInt927 == 0) {
							local66 = 0;
						}
						if (local4 >= local66) {
							arg0.aString14 = "";
							arg0.anInt636 = 0;
						} else {
							arg0.aString14 = Class39.method363(Class39.method360(this.aLongArray3[local4]));
							arg0.anInt636 = 1;
						}
					}
				} else if (local4 == 503) {
					arg0.anInt646 = this.anInt1052 * 15 + 20;
					if (arg0.anInt646 <= arg0.anInt645) {
						arg0.anInt646 = arg0.anInt645 + 1;
					}
				} else if (local4 == 327) {
					arg0.anInt620 = 150;
					arg0.anInt621 = (int) (Math.sin((double) anInt1077 / 40.0D) * 256.0D) & 0x7FF;
					if (this.aBoolean248) {
						for (local66 = 0; local66 < 7; local66++) {
							@Pc(379) int local379 = this.anIntArray220[local66];
							if (local379 >= 0 && !Class40.aClass40Array1[local379].method397()) {
								return;
							}
						}
						this.aBoolean248 = false;
						@Pc(398) Class6_Sub2_Sub1_Sub3[] local398 = new Class6_Sub2_Sub1_Sub3[7];
						@Pc(400) int local400 = 0;
						for (@Pc(402) int local402 = 0; local402 < 7; local402++) {
							@Pc(409) int local409 = this.anIntArray220[local402];
							if (local409 >= 0) {
								local398[local400++] = Class40.aClass40Array1[local409].method398();
							}
						}
						@Pc(431) Class6_Sub2_Sub1_Sub3 local431 = new Class6_Sub2_Sub1_Sub3(local400, 6, local398);
						for (@Pc(433) int local433 = 0; local433 < 5; local433++) {
							if (this.anIntArray250[local433] != 0) {
								local431.method147(anIntArrayArray22[local433][0], anIntArrayArray22[local433][this.anIntArray250[local433]]);
								if (local433 == 1) {
									local431.method147(anIntArray259[0], anIntArray259[this.anIntArray250[local433]]);
								}
							}
						}
						local431.method140();
						local431.method141(Class21.aClass21Array1[aClass6_Sub2_Sub1_Sub1_Sub2_1.anInt712].anIntArray108[0]);
						local431.method150(64, 850, -30, -50, -30, true);
						arg0.anInt613 = 5;
						arg0.anInt614 = 0;
						Class44.method491(local431);
					}
				} else if (local4 == 324) {
					if (this.aClass6_Sub2_Sub2_Sub1_6 == null) {
						this.aClass6_Sub2_Sub2_Sub1_6 = arg0.aClass6_Sub2_Sub2_Sub1_1;
						this.aClass6_Sub2_Sub2_Sub1_7 = arg0.aClass6_Sub2_Sub2_Sub1_2;
					}
					if (this.aBoolean244) {
						arg0.aClass6_Sub2_Sub2_Sub1_1 = this.aClass6_Sub2_Sub2_Sub1_7;
					} else {
						arg0.aClass6_Sub2_Sub2_Sub1_1 = this.aClass6_Sub2_Sub2_Sub1_6;
					}
				} else if (local4 == 325) {
					if (this.aClass6_Sub2_Sub2_Sub1_6 == null) {
						this.aClass6_Sub2_Sub2_Sub1_6 = arg0.aClass6_Sub2_Sub2_Sub1_1;
						this.aClass6_Sub2_Sub2_Sub1_7 = arg0.aClass6_Sub2_Sub2_Sub1_2;
					}
					if (this.aBoolean244) {
						arg0.aClass6_Sub2_Sub2_Sub1_1 = this.aClass6_Sub2_Sub2_Sub1_6;
					} else {
						arg0.aClass6_Sub2_Sub2_Sub1_1 = this.aClass6_Sub2_Sub2_Sub1_7;
					}
				} else if (local4 == 600) {
					arg0.aString14 = this.aString19;
					if (anInt1077 % 20 < 10) {
						arg0.aString14 = arg0.aString14 + "|";
					} else {
						arg0.aString14 = arg0.aString14 + " ";
					}
				} else {
					if (local4 == 620) {
						if (this.anInt917 < 1) {
							arg0.aString14 = "";
						} else if (this.aBoolean253) {
							arg0.anInt637 = 16711680;
							arg0.aString14 = "Moderator option: Mute player for 48 hours: <ON>";
						} else {
							arg0.anInt637 = 16777215;
							arg0.aString14 = "Moderator option: Mute player for 48 hours: <OFF>";
						}
					}
					@Pc(638) String local638;
					if (local4 == 660) {
						local66 = this.anInt1000 - this.anInt934;
						if (local66 <= 0) {
							local638 = "earlier today";
						} else if (local66 == 1) {
							local638 = "yesterday";
						} else {
							local638 = local66 + " days ago";
						}
						arg0.aString14 = "You last logged in @red@" + local638 + "@bla@ from: @red@" + signlink.dns;
					}
					if (local4 == 661) {
						if (this.anInt960 == 0) {
							arg0.aString14 = "\\nYou have not yet set any recovery questions.\\nIt is @lre@strongly@yel@ recommended that you do so.\\n\\nIf you don't you will be @lre@unable to recover your\\n@lre@password@yel@ if you forget it, or it is stolen.";
						} else if (this.anInt960 <= this.anInt1000) {
							arg0.aString14 = "\\n\\nRecovery Questions Last Set:\\n@gre@" + this.method701(this.anInt960);
						} else {
							local66 = this.anInt1000 + 14 - this.anInt960;
							if (local66 <= 0) {
								local638 = "Earlier today";
							} else if (local66 == 1) {
								local638 = "Yesterday";
							} else {
								local638 = local66 + " days ago";
							}
							arg0.aString14 = local638 + " you requested@lre@ new recovery\\n@lre@questions.@yel@ The requested change will occur\\non: @lre@" + this.method701(this.anInt960) + "\\n\\nIf you do not remember making this request\\ncancel it immediately, and change your password.";
						}
					}
					if (local4 == 662) {
						@Pc(756) String local756;
						if (this.anInt1037 == 0) {
							local756 = "@yel@0 unread messages";
						} else if (this.anInt1037 == 1) {
							local756 = "@gre@1 unread message";
						} else {
							local756 = "@gre@" + this.anInt1037 + " unread messages";
						}
						arg0.aString14 = "You have " + local756 + "\\nin your message centre.";
					}
					if (local4 == 663) {
						if (this.anInt928 > 0 && this.anInt928 <= this.anInt1000 + 10) {
							arg0.aString14 = "Last password change:\\n@gre@" + this.method701(this.anInt928);
						} else {
							arg0.aString14 = "Last password change:\\n@gre@Never changed";
						}
					}
					if (local4 == 665) {
						if (this.anInt1067 > 2 && !aBoolean251) {
							arg0.aString14 = "This is a non-members\\nworld. To enjoy your\\nmembers benefits we\\nrecommend you play on a\\nmembers world instead.";
						} else if (this.anInt1067 > 2) {
							arg0.aString14 = "\\n\\nYou have @gre@" + this.anInt1067 + "@yel@ days of\\nmember credit remaining.";
						} else if (this.anInt1067 > 0) {
							arg0.aString14 = "You have @gre@" + this.anInt1067 + "@yel@ days of\\nmember credit remaining.\\n\\n@lre@Credit low! Renew now\\n@lre@to avoid losing members.";
						} else {
							arg0.aString14 = "You are not a member.\\n\\nChoose to subscribe and\\nyou'll get loads of extra\\nbenefits and features.";
						}
					}
					if (local4 == 667) {
						if (this.anInt1067 > 2 && !aBoolean251) {
							arg0.aString14 = "To switch to a members-only world:\\n1) Logout and return to the world selection page.\\n2) Choose one of the members world with a gold star next to it's name.\\n\\nIf you prefer you can continue to use this world,\\nbut members only features will be unavailable here.";
						} else if (this.anInt1067 > 0) {
							arg0.aString14 = "To extend or cancel a subscription:\\n1) Logout and return to the frontpage of this website.\\n2)Choose the relevant option from the 'membership' section.\\n\\nNote: If you are a credit card subscriber a top-up payment will\\nautomatically be taken when 3 days credit remain.\\n(unless you cancel your subscription, which can be done at any time.)";
						} else {
							arg0.aString14 = "To start a subscripton:\\n1) Logout and return to the frontpage of this website.\\n2) Choose 'Start a new subscription'";
						}
					}
					if (local4 == 668) {
						if (this.anInt960 > this.anInt1000) {
							arg0.aString14 = "To cancel this request:\\n1) Logout and return to the frontpage of this website.\\n2) Choose 'Cancel recovery questions'.";
						} else {
							arg0.aString14 = "To change your recovery questions:\\n1) Logout and return to the frontpage of this website.\\n2) Choose 'Set new recovery questions'.";
						}
					}
				}
			} else if (local4 == 1 && this.anInt927 == 0) {
				arg0.aString14 = "Loading friend list";
				arg0.anInt636 = 0;
			} else if (local4 == 1 && this.anInt927 == 1) {
				arg0.aString14 = "Connecting to friendserver";
				arg0.anInt636 = 0;
			} else if (local4 == 2 && this.anInt927 != 2) {
				arg0.aString14 = "Please wait...";
				arg0.anInt636 = 0;
			} else {
				local66 = this.anInt926;
				if (this.anInt927 != 2) {
					local66 = 0;
				}
				if (local4 > 700) {
					local4 -= 601;
				} else {
					local4--;
				}
				if (local4 >= local66) {
					arg0.aString14 = "";
					arg0.anInt636 = 0;
				} else {
					arg0.aString14 = this.aStringArray14[local4];
					arg0.anInt636 = 1;
				}
			}
		} catch (@Pc(913) RuntimeException local913) {
			signlink.reporterror("43784, " + 32733 + ", " + arg0 + ", " + local913.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(II)Ljava/lang/String;")
	private String method701(@OriginalArg(0) int arg0) {
		try {
			if (arg0 > this.anInt1000 + 10) {
				return "Unknown";
			}
			@Pc(23) long local23 = ((long) arg0 + 11745L) * 86400000L;
			@Pc(25) Calendar local25 = Calendar.getInstance();
			local25.setTime(new Date(local23));
			@Pc(35) int local35 = local25.get(5);
			@Pc(39) int local39 = local25.get(2);
			@Pc(43) int local43 = local25.get(1);
			@Pc(94) String[] local94 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };
			return local35 + "-" + local94[local39] + "-" + local43;
		} catch (@Pc(112) RuntimeException local112) {
			signlink.reporterror("90367, " + arg0 + ", " + 2 + ", " + local112.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(I)V")
	@Override
	protected void method583(@OriginalArg(0) int arg0) {
		try {
			this.aClass6_Sub2_Sub2_Sub3_18 = null;
			this.aClass6_Sub2_Sub2_Sub3_19 = null;
			this.aClass6_Sub2_Sub2_Sub3_20 = null;
			this.aClass8_13 = null;
			this.aClass8_14 = null;
			this.aClass8_10 = null;
			this.aClass8_11 = null;
			this.aClass8_12 = null;
			this.aClass6_Sub2_Sub1_Sub1_Sub1Array1 = null;
			this.anIntArray222 = null;
			try {
				if (this.aClass34_1 != null) {
					this.aClass34_1.method347();
				}
			} catch (@Pc(37) Exception local37) {
			}
			this.aClass34_1 = null;
			this.aClass6_Sub2_Sub2_Sub3Array5 = null;
			this.aClass6_Sub2_Sub2_Sub1Array8 = null;
			this.method636();
			this.aClass8_15 = null;
			this.aClass8_16 = null;
			this.aClass8_17 = null;
			this.aClass8_18 = null;
			this.aClass6_Sub2_Sub2_Sub1_11 = null;
			this.aClass6_Sub2_Sub2_Sub1_12 = null;
			this.aClass6_Sub2_Sub2_Sub1_13 = null;
			this.aClass6_Sub2_Sub2_Sub1_14 = null;
			this.aClass6_Sub2_Sub2_Sub1_15 = null;
			this.aClass6_Sub2_Sub2_Sub1_10 = null;
			this.anIntArray260 = null;
			this.aClass6_Sub2_Sub2_Sub3_6 = null;
			this.aClass6_Sub2_Sub2_Sub3_7 = null;
			this.aClass6_Sub2_Sub2_Sub3_8 = null;
			this.aClass6_Sub2_Sub2_Sub3_9 = null;
			this.aClass6_Sub2_Sub2_Sub3_10 = null;
			this.anIntArrayArray25 = null;
			this.aClass6_Sub2_Sub2_Sub3Array3 = null;
			this.aClass6_Sub2_Sub2_Sub3_1 = null;
			this.aClass6_Sub2_Sub2_Sub3_2 = null;
			this.aClass6_Sub2_Sub2_Sub3_3 = null;
			this.aClass6_Sub2_Sub2_Sub3_4 = null;
			this.aClass6_Sub2_Sub2_Sub3_5 = null;
			this.anIntArrayArrayArray8 = null;
			this.aByteArrayArrayArray8 = null;
			this.aClass41_1 = null;
			this.aClass47Array1 = null;
			this.aClass8_3 = null;
			this.aClass8_4 = null;
			this.aClass8_5 = null;
			if (this.aClass36_1 != null) {
				this.aClass36_1.aBoolean151 = false;
			}
			this.aClass36_1 = null;
			this.aClass6_Sub2_Sub2_Sub1_8 = null;
			this.aClass6_Sub2_Sub3_8 = null;
			this.aClass6_Sub2_Sub3_6 = null;
			this.aClass6_Sub2_Sub3_9 = null;
			this.aClass6_Sub2_Sub1_Sub1_Sub2Array1 = null;
			this.anIntArray257 = null;
			this.anIntArray258 = null;
			this.aClass6_Sub2_Sub3Array1 = null;
			this.anIntArray255 = null;
			this.aClass13_11 = null;
			this.aClass13_12 = null;
			this.anIntArrayArray23 = null;
			this.anIntArrayArray24 = null;
			this.anIntArray233 = null;
			this.anIntArray234 = null;
			this.aClass8_19 = null;
			this.aClass8_20 = null;
			this.aClass8_21 = null;
			this.aClass8_22 = null;
			if (this.aClass25_Sub1_1 != null) {
				this.aClass25_Sub1_1.method236();
			}
			this.aClass25_Sub1_1 = null;
			this.anIntArray240 = null;
			this.anIntArray241 = null;
			this.aClass6_Sub2_Sub2_Sub1Array6 = null;
			this.aStringArray14 = null;
			this.aLongArray4 = null;
			this.anIntArray231 = null;
			this.aClass6_Sub2_Sub3_7 = null;
			this.aClass13ArrayArrayArray1 = null;
			this.aClass13_10 = null;
			this.aClass8_23 = null;
			this.aClass8_24 = null;
			this.aClass8_25 = null;
			this.aClass8_26 = null;
			this.aClass8_27 = null;
			this.aClass8_6 = null;
			this.aClass8_7 = null;
			this.aClass8_8 = null;
			this.aClass8_9 = null;
			this.aClass6_Sub2_Sub2_Sub1_5 = null;
			this.aClass6_Sub2_Sub2_Sub1Array4 = null;
			this.aClass6_Sub2_Sub2_Sub1Array9 = null;
			this.aClass6_Sub2_Sub2_Sub1Array5 = null;
			this.aClass6_Sub2_Sub2_Sub1Array10 = null;
			this.aClass6_Sub2_Sub2_Sub1Array7 = null;
			this.anIntArray272 = null;
			this.anIntArray273 = null;
			this.anIntArray274 = null;
			this.anIntArray275 = null;
			this.aStringArray13 = null;
			this.anIntArray237 = null;
			this.aByteArrayArray5 = null;
			this.aByteArrayArray6 = null;
			this.anIntArray238 = null;
			this.anIntArray239 = null;
			this.aClass6_Sub2_Sub2_Sub3_15 = null;
			this.aClass6_Sub2_Sub2_Sub3_16 = null;
			this.aClass6_Sub2_Sub2_Sub3_17 = null;
			this.aByteArray21 = null;
			this.method648();
			Class19.method168();
			Class2.method8();
			Class43.method467();
			Class44.method497();
			Class32.aClass32Array1 = null;
			Class40.aClass40Array1 = null;
			Class12.aClass12Array1 = null;
			Class21.aClass21Array1 = null;
			Class31.aClass31Array1 = null;
			Class31.aClass42_4 = null;
			Class14.aClass14Array1 = null;
			super.aClass8_2 = null;
			Class6_Sub2_Sub1_Sub1_Sub2.aClass42_9 = null;
			Class6_Sub2_Sub2_Sub4.method559();
			Class41.method401();
			Class6_Sub2_Sub1_Sub3.method129();
			Class48.method534();
			System.gc();
		} catch (@Pc(373) RuntimeException local373) {
			signlink.reporterror("72846, " + 638 + ", " + local373.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(I)V")
	@Override
	protected void method584() {
		try {
			if (this.aBoolean262 || this.aBoolean257 || this.aBoolean272) {
				this.method675();
			} else {
				anInt890++;
				if (this.aBoolean266) {
					this.method621();
				} else {
					this.method611(false);
				}
				this.anInt989 = 0;
			}
		} catch (@Pc(40) RuntimeException local40) {
			signlink.reporterror("68147, " + 718 + ", " + local40.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(IILclient!NQUAUMDT;)V")
	private void method702(@OriginalArg(0) int arg0, @OriginalArg(2) Class6_Sub2_Sub3 arg1) {
		try {
			while (true) {
				if (arg1.anInt405 + 10 < arg0 * 8) {
					@Pc(12) int local12 = arg1.method273(739, 11);
					if (local12 != 2047) {
						if (this.aClass6_Sub2_Sub1_Sub1_Sub2Array1[local12] == null) {
							this.aClass6_Sub2_Sub1_Sub1_Sub2Array1[local12] = new Class6_Sub2_Sub1_Sub1_Sub2();
							if (this.aClass6_Sub2_Sub3Array1[local12] != null) {
								this.aClass6_Sub2_Sub1_Sub1_Sub2Array1[local12].method511(this.aClass6_Sub2_Sub3Array1[local12]);
							}
						}
						this.anIntArray257[this.anInt1024++] = local12;
						@Pc(58) Class6_Sub2_Sub1_Sub1_Sub2 local58 = this.aClass6_Sub2_Sub1_Sub1_Sub2Array1[local12];
						local58.anInt714 = anInt1077;
						@Pc(66) int local66 = arg1.method273(739, 5);
						if (local66 > 15) {
							local66 -= 32;
						}
						@Pc(75) int local75 = arg1.method273(739, 5);
						if (local75 > 15) {
							local75 -= 32;
						}
						@Pc(84) int local84 = arg1.method273(739, 1);
						@Pc(89) int local89 = arg1.method273(739, 1);
						if (local89 == 1) {
							this.anIntArray258[this.anInt1025++] = local12;
						}
						local58.method508(aClass6_Sub2_Sub1_Sub1_Sub2_1.anIntArray183[0] + local66, aClass6_Sub2_Sub1_Sub1_Sub2_1.anIntArray182[0] + local75, this.anInt848, local84 == 1);
						continue;
					}
				}
				arg1.method274(this.anInt902);
				return;
			}
		} catch (@Pc(139) RuntimeException local139) {
			signlink.reporterror("9822, " + arg0 + ", " + 6 + ", " + arg1 + ", " + local139.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!CPAFTRRP;I)V")
	private void method703(@OriginalArg(0) Class6_Sub1 arg0) {
		try {
			@Pc(1) int local1 = 0;
			@Pc(3) int local3 = -1;
			@Pc(5) int local5 = 0;
			@Pc(7) int local7 = 0;
			if (arg0.anInt33 == 0) {
				local1 = this.aClass41_1.method428(arg0.anInt32, arg0.anInt34, arg0.anInt35);
			}
			if (arg0.anInt33 == 1) {
				local1 = this.aClass41_1.method429(arg0.anInt34, arg0.anInt32, arg0.anInt35);
			}
			if (arg0.anInt33 == 2) {
				local1 = this.aClass41_1.method430(arg0.anInt32, arg0.anInt34, arg0.anInt35);
			}
			if (arg0.anInt33 == 3) {
				local1 = this.aClass41_1.method431(arg0.anInt32, arg0.anInt34, arg0.anInt35);
			}
			if (local1 != 0) {
				@Pc(76) int local76 = this.aClass41_1.method432(arg0.anInt32, arg0.anInt34, arg0.anInt35, local1);
				local3 = local1 >> 14 & 0x7FFF;
				local5 = local76 & 0x1F;
				local7 = local76 >> 6;
			}
			arg0.anInt41 = local3;
			arg0.anInt43 = local5;
			arg0.anInt42 = local7;
		} catch (@Pc(110) RuntimeException local110) {
			signlink.reporterror("51129, " + arg0 + ", " + -404 + ", " + local110.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "K", descriptor = "(I)V")
	private void method704() {
		try {
			if (this.anInt865 == 2) {
				this.method678((this.anInt954 - this.anInt946 << 7) + this.anInt957, (this.anInt953 - this.anInt945 << 7) + this.anInt956, this.anInt955 * 2);
				if (this.anInt900 > -1 && anInt1077 % 20 < 10) {
					this.aClass6_Sub2_Sub2_Sub1Array10[0].method98(this.anInt901 - 28, this.anInt900 - 12);
				}
			}
		} catch (@Pc(62) RuntimeException local62) {
			signlink.reporterror("79668, " + 0 + ", " + local62.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "L", descriptor = "(I)V")
	private void method705() {
		try {
			this.method726();
			@Pc(58) int local58;
			if (this.anInt1073 == 1) {
				this.aClass6_Sub2_Sub2_Sub1Array7[this.anInt1072 / 100].method98(this.anInt1071 - 8 - 4, this.anInt1070 - 8 - 4);
				anInt1026++;
				if (anInt1026 > 1225) {
					anInt1026 = 0;
					this.aClass6_Sub2_Sub3_8.method251(92);
					this.aClass6_Sub2_Sub3_8.method252(0);
					local58 = this.aClass6_Sub2_Sub3_8.anInt404;
					this.aClass6_Sub2_Sub3_8.method252((int) (Math.random() * 256.0D));
					this.aClass6_Sub2_Sub3_8.method252(186);
					if ((int) (Math.random() * 2.0D) == 0) {
						this.aClass6_Sub2_Sub3_8.method252(216);
					}
					this.aClass6_Sub2_Sub3_8.method252(210);
					this.aClass6_Sub2_Sub3_8.method252(2);
					this.aClass6_Sub2_Sub3_8.method253((int) (Math.random() * 65536.0D));
					if ((int) (Math.random() * 2.0D) == 0) {
						this.aClass6_Sub2_Sub3_8.method252(230);
					}
					this.aClass6_Sub2_Sub3_8.method253((int) (Math.random() * 65536.0D));
					this.aClass6_Sub2_Sub3_8.method253(52559);
					this.aClass6_Sub2_Sub3_8.method253(29994);
					this.aClass6_Sub2_Sub3_8.method261(this.aClass6_Sub2_Sub3_8.anInt404 - local58);
				}
			}
			if (this.anInt1073 == 2) {
				this.aClass6_Sub2_Sub2_Sub1Array7[this.anInt1072 / 100 + 4].method98(this.anInt1071 - 8 - 4, this.anInt1070 - 8 - 4);
			}
			if (this.anInt1001 != -1) {
				this.method657(this.anInt1001, this.anInt860);
				this.method688(0, 0, Class44.method496(this.anInt1001), 0);
			}
			if (this.anInt994 != -1) {
				this.method657(this.anInt994, this.anInt860);
				this.method688(0, 0, Class44.method496(this.anInt994), 0);
			}
			this.method709(this.aBoolean270);
			if (!this.aBoolean264) {
				this.method626();
				this.method599();
			} else if (this.anInt866 == 0) {
				this.method721();
			}
			if (this.anInt1032 == 1) {
				this.aClass6_Sub2_Sub2_Sub1_8.method98(296, 472);
			}
			@Pc(266) int local266;
			if (aBoolean271) {
				@Pc(232) byte local232 = 20;
				@Pc(234) int local234 = 16776960;
				if (super.anInt828 < 30 && aBoolean252) {
					local234 = 16711680;
				}
				if (super.anInt828 < 20 && !aBoolean252) {
					local234 = 16711680;
				}
				this.aClass6_Sub2_Sub2_Sub2_3.method379("Fps:" + super.anInt828, 20, local234);
				local266 = local232 + 15;
				@Pc(268) Runtime local268 = Runtime.getRuntime();
				@Pc(277) int local277 = (int) ((local268.totalMemory() - local268.freeMemory()) / 1024L);
				if (local277 > 33554432 && aBoolean252) {
				}
				if (local277 > 67108864 && !aBoolean252) {
				}
				this.aClass6_Sub2_Sub2_Sub2_3.method379("Mem:" + local277 + "k", 35, 16776960);
				local266 += 15;
			}
			if (this.anInt847 != 0) {
				local58 = this.anInt847 / 50;
				local266 = local58 / 60;
				local58 %= 60;
				if (local58 < 10) {
					this.aClass6_Sub2_Sub2_Sub2_3.method384(16776960, "System update in: " + local266 + ":0" + local58, 4, 329, this.aByte41);
				} else {
					this.aClass6_Sub2_Sub2_Sub2_3.method384(16776960, "System update in: " + local266 + ":" + local58, 4, 329, this.aByte41);
				}
				anInt1020++;
				if (anInt1020 > 85) {
					anInt1020 = 0;
					this.aClass6_Sub2_Sub3_8.method251(246);
					return;
				}
			}
		} catch (@Pc(385) RuntimeException local385) {
			signlink.reporterror("58722, " + 103 + ", " + local385.toString());
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

	@OriginalMember(owner = "client!client", name = "M", descriptor = "(I)V")
	private void method706() {
		try {
			Class19.aClass42_3.method455();
			Class19.aClass42_2.method455();
			Class2.aClass42_1.method455();
			Class43.aClass42_6.method455();
			Class43.aClass42_5.method455();
			Class6_Sub2_Sub1_Sub1_Sub2.aClass42_9.method455();
			Class31.aClass42_4.method455();
		} catch (@Pc(18) RuntimeException local18) {
			signlink.reporterror("65782, " + -920 + ", " + local18.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILclient!VGGOSQRK;IIIIIII)V")
	private void method707(@OriginalArg(1) Class44 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		try {
			if (this.aBoolean278) {
				this.anInt969 = 32;
			} else {
				this.anInt969 = 0;
			}
			this.aBoolean278 = false;
			if (arg6 >= arg4 && arg6 < arg4 + 16 && arg2 >= arg1 && arg2 < arg1 + 16) {
				arg0.anInt622 -= this.anInt989 * 4;
				if (arg7 == 1) {
					this.aBoolean279 = true;
				}
				if (arg7 == 2 || arg7 == 3) {
					this.aBoolean282 = true;
				}
			} else if (arg6 >= arg4 && arg6 < arg4 + 16 && arg2 >= arg1 + arg5 - 16 && arg2 < arg1 + arg5) {
				arg0.anInt622 += this.anInt989 * 4;
				if (arg7 == 1) {
					this.aBoolean279 = true;
				}
				if (arg7 == 2 || arg7 == 3) {
					this.aBoolean282 = true;
				}
			} else if (arg6 >= arg4 - this.anInt969 && arg6 < arg4 + this.anInt969 + 16 && arg2 >= arg1 + 16 && arg2 < arg1 + arg5 - 16 && this.anInt989 > 0) {
				@Pc(139) int local139 = (arg5 - 32) * arg5 / arg3;
				if (local139 < 8) {
					local139 = 8;
				}
				@Pc(154) int local154 = arg2 - arg1 - local139 / 2 - 16;
				@Pc(160) int local160 = arg5 - local139 - 32;
				arg0.anInt622 = (arg3 - arg5) * local154 / local160;
				if (arg7 == 1) {
					this.aBoolean279 = true;
				}
				if (arg7 == 2 || arg7 == 3) {
					this.aBoolean282 = true;
				}
				this.aBoolean278 = true;
			}
		} catch (@Pc(189) RuntimeException local189) {
			signlink.reporterror("49861, " + -184 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + local189.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "N", descriptor = "(I)V")
	private void method708() {
		try {
			for (@Pc(6) Class6_Sub2_Sub1_Sub6 local6 = (Class6_Sub2_Sub1_Sub6) this.aClass13_11.method113(); local6 != null; local6 = (Class6_Sub2_Sub1_Sub6) this.aClass13_11.method115()) {
				if (local6.anInt789 != this.anInt1074 || anInt1077 > local6.anInt788) {
					local6.method545();
				} else if (anInt1077 >= local6.anInt787) {
					if (local6.anInt786 > 0) {
						@Pc(45) Class6_Sub2_Sub1_Sub1_Sub1 local45 = this.aClass6_Sub2_Sub1_Sub1_Sub1Array1[local6.anInt786 - 1];
						if (local45 != null && local45.anInt699 >= 0 && local45.anInt699 < 13312 && local45.anInt700 >= 0 && local45.anInt700 < 13312) {
							local6.method531(this.method640(local45.anInt699, local6.anInt789, local45.anInt700) - local6.anInt783, anInt1077, local45.anInt699, local45.anInt700);
						}
					}
					if (local6.anInt786 < 0) {
						@Pc(90) int local90 = -local6.anInt786 - 1;
						@Pc(96) Class6_Sub2_Sub1_Sub1_Sub2 local96;
						if (local90 == this.anInt1066) {
							local96 = aClass6_Sub2_Sub1_Sub1_Sub2_1;
						} else {
							local96 = this.aClass6_Sub2_Sub1_Sub1_Sub2Array1[local90];
						}
						if (local96 != null && local96.anInt699 >= 0 && local96.anInt699 < 13312 && local96.anInt700 >= 0 && local96.anInt700 < 13312) {
							local6.method531(this.method640(local96.anInt699, local6.anInt789, local96.anInt700) - local6.anInt783, anInt1077, local96.anInt699, local96.anInt700);
						}
					}
					local6.method530(this.anInt860);
					this.aClass41_1.method413(local6, (int) local6.aDouble5, -1, (int) local6.aDouble7, local6.anInt778, 60, false, this.anInt1074, (int) local6.aDouble6);
				}
			}
		} catch (@Pc(176) RuntimeException local176) {
			signlink.reporterror("4788, " + 3 + ", " + local176.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "n", descriptor = "(Z)V")
	private void method709(@OriginalArg(0) boolean arg0) {
		try {
			this.anInt1068 = 0;
			@Pc(10) int local10 = (aClass6_Sub2_Sub1_Sub1_Sub2_1.anInt699 >> 7) + this.anInt945;
			@Pc(18) int local18 = (aClass6_Sub2_Sub1_Sub1_Sub2_1.anInt700 >> 7) + this.anInt946;
			if (arg0) {
				this.anInt880 = -1;
			}
			if (local10 >= 3053 && local10 <= 3156 && local18 >= 3056 && local18 <= 3136) {
				this.anInt1068 = 1;
			}
			if (local10 >= 3072 && local10 <= 3118 && local18 >= 9492 && local18 <= 9535) {
				this.anInt1068 = 1;
			}
			if (this.anInt1068 == 1 && local10 >= 3139 && local10 <= 3199 && local18 >= 3008 && local18 <= 3062) {
				this.anInt1068 = 0;
			}
		} catch (@Pc(74) RuntimeException local74) {
			signlink.reporterror("60278, " + arg0 + ", " + local74.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "o", descriptor = "(Z)V")
	private void method710(@OriginalArg(0) boolean arg0) {
		try {
			this.anInt862++;
			if (arg0) {
				this.aClass13ArrayArrayArray1 = null;
			}
			this.method689(true);
			this.method724(true);
			this.method689(false);
			this.method724(false);
			this.method708();
			this.method653();
			@Pc(40) int local40;
			@Pc(79) int local79;
			if (!this.aBoolean273) {
				local40 = this.anInt962;
				if (this.anInt999 / 256 > local40) {
					local40 = this.anInt999 / 256;
				}
				if (this.aBooleanArray12[4] && this.anIntArray232[4] + 128 > local40) {
					local40 = this.anIntArray232[4] + 128;
				}
				local79 = this.anInt963 + this.anInt978 & 0x7FF;
				this.method665(local40, this.anInt852, local40 * 3 + 600, this.method640(aClass6_Sub2_Sub1_Sub1_Sub2_1.anInt699, this.anInt1074, aClass6_Sub2_Sub1_Sub1_Sub2_1.anInt700) - 50, this.anInt853, local79);
			}
			if (this.aBoolean273) {
				local40 = this.method659(this.anInt1031);
			} else {
				local40 = this.method658();
			}
			local79 = this.anInt872;
			@Pc(124) int local124 = this.anInt873;
			@Pc(127) int local127 = this.anInt874;
			@Pc(130) int local130 = this.anInt875;
			@Pc(133) int local133 = this.anInt876;
			@Pc(182) int local182;
			for (@Pc(135) int local135 = 0; local135 < 5; local135++) {
				if (this.aBooleanArray12[local135]) {
					local182 = (int) (Math.random() * (double) (this.anIntArray270[local135] * 2 + 1) - (double) this.anIntArray270[local135] + Math.sin((double) this.anIntArray269[local135] * ((double) this.anIntArray253[local135] / 100.0D)) * (double) this.anIntArray232[local135]);
					if (local135 == 0) {
						this.anInt872 += local182;
					}
					if (local135 == 1) {
						this.anInt873 += local182;
					}
					if (local135 == 2) {
						this.anInt874 += local182;
					}
					if (local135 == 3) {
						this.anInt876 = this.anInt876 + local182 & 0x7FF;
					}
					if (local135 == 4) {
						this.anInt875 += local182;
						if (this.anInt875 < 128) {
							this.anInt875 = 128;
						}
						if (this.anInt875 > 383) {
							this.anInt875 = 383;
						}
					}
				}
			}
			local182 = Class6_Sub2_Sub2_Sub4.anInt819;
			Class6_Sub2_Sub1_Sub3.aBoolean85 = true;
			Class6_Sub2_Sub1_Sub3.anInt292 = 0;
			Class6_Sub2_Sub1_Sub3.anInt290 = super.anInt833 - 4;
			Class6_Sub2_Sub1_Sub3.anInt291 = super.anInt834 - 4;
			Class6_Sub2_Sub2.method550();
			this.aClass41_1.method441(this.anInt874, this.anInt876, local40, this.anInt872, this.anInt875, this.anInt873);
			this.aClass41_1.method416();
			this.method662();
			this.method704();
			this.method596(local182);
			this.method705();
			this.aClass8_8.method59(super.aGraphics2, 4, 4);
			this.anInt872 = local79;
			this.anInt873 = local124;
			this.anInt874 = local127;
			this.anInt875 = local130;
			this.anInt876 = local133;
		} catch (@Pc(321) RuntimeException local321) {
			signlink.reporterror("44463, " + arg0 + ", " + local321.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Ljava/lang/String;)Ljava/io/DataInputStream;")
	private DataInputStream method711(@OriginalArg(0) String arg0) throws IOException {
		if (this.aBoolean268) {
			if (this.aSocket3 != null) {
				try {
					this.aSocket3.close();
				} catch (@Pc(26) Exception local26) {
				}
				this.aSocket3 = null;
			}
			this.aSocket3 = this.method593(43595);
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

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIIIZII)V")
	private void method712(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		try {
			this.aBoolean266 &= true;
			if (arg4 >= 1 && arg0 >= 1 && arg4 <= 102 && arg0 <= 102) {
				if (aBoolean252 && arg6 != this.anInt1074) {
					return;
				}
				@Pc(26) int local26 = 0;
				if (arg3 == 0) {
					local26 = this.aClass41_1.method428(arg6, arg4, arg0);
				}
				if (arg3 == 1) {
					local26 = this.aClass41_1.method429(arg4, arg6, arg0);
				}
				if (arg3 == 2) {
					local26 = this.aClass41_1.method430(arg6, arg4, arg0);
				}
				if (arg3 == 3) {
					local26 = this.aClass41_1.method431(arg6, arg4, arg0);
				}
				@Pc(82) int local82;
				if (local26 != 0) {
					local82 = this.aClass41_1.method432(arg6, arg4, arg0, local26);
					@Pc(88) int local88 = local26 >> 14 & 0x7FFF;
					@Pc(92) int local92 = local82 & 0x1F;
					@Pc(96) int local96 = local82 >> 6;
					@Pc(108) Class19 local108;
					if (arg3 == 0) {
						this.aClass41_1.method419(arg6, arg4, arg0);
						local108 = Class19.method169(local88);
						if (local108.aBoolean97) {
							this.aClass47Array1[arg6].method519(local108.aBoolean90, local96, arg0, local92, arg4);
						}
					}
					if (arg3 == 1) {
						this.aClass41_1.method420(arg6, arg0, arg4);
					}
					if (arg3 == 2) {
						this.aClass41_1.method421(arg6, arg4, arg0);
						local108 = Class19.method169(local88);
						if (arg4 + local108.anInt319 > 103 || arg0 + local108.anInt319 > 103 || arg4 + local108.anInt304 > 103 || arg0 + local108.anInt304 > 103) {
							return;
						}
						if (local108.aBoolean97) {
							this.aClass47Array1[arg6].method520(local108.anInt319, local108.aBoolean90, arg4, local96, local108.anInt304, arg0);
						}
					}
					if (arg3 == 3) {
						this.aClass41_1.method422(arg4, arg6, arg0);
						local108 = Class19.method169(local88);
						if (local108.aBoolean97 && local108.aBoolean89) {
							this.aClass47Array1[arg6].method522(arg0, arg4);
						}
					}
				}
				if (arg5 >= 0) {
					local82 = arg6;
					if (arg6 < 3 && (this.aByteArrayArrayArray8[1][arg4][arg0] & 0x2) == 2) {
						local82 = arg6 + 1;
					}
					Class27.method305(arg5, arg0, arg6, this.aClass41_1, this.aClass47Array1[arg6], arg1, this.anIntArrayArrayArray8, arg4, local82, arg2);
					return;
				}
			}
		} catch (@Pc(255) RuntimeException local255) {
			signlink.reporterror("66570, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + true + ", " + arg5 + ", " + arg6 + ", " + local255.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "p", descriptor = "(Z)V")
	private void method713() {
		try {
			anInt889++;
			if (anInt889 > 168) {
				anInt889 = 0;
				this.aClass6_Sub2_Sub3_8.method251(23);
				this.aClass6_Sub2_Sub3_8.method256(0);
			}
			while (true) {
				@Pc(28) int local28;
				do {
					while (true) {
						local28 = this.method580();
						if (local28 == -1) {
							return;
						}
						if (this.anInt994 != -1 && this.anInt994 == this.anInt940) {
							if (local28 == 8 && this.aString19.length() > 0) {
								this.aString19 = this.aString19.substring(0, this.aString19.length() - 1);
							}
							break;
						}
						@Pc(208) int local208;
						if (this.aBoolean241) {
							if (local28 >= 32 && local28 <= 122 && this.aString22.length() < 80) {
								this.aString22 = this.aString22 + (char) local28;
								this.aBoolean282 = true;
							}
							if (local28 == 8 && this.aString22.length() > 0) {
								this.aString22 = this.aString22.substring(0, this.aString22.length() - 1);
								this.aBoolean282 = true;
							}
							if (local28 == 13 || local28 == 10) {
								this.aBoolean241 = false;
								this.aBoolean282 = true;
								@Pc(168) long local168;
								if (this.anInt1041 == 1) {
									local168 = Class39.method359(this.aString22);
									this.method683(local168);
								}
								if (this.anInt1041 == 2 && this.anInt926 > 0) {
									local168 = Class39.method359(this.aString22);
									this.method604(local168);
								}
								if (this.anInt1041 == 3 && this.aString22.length() > 0) {
									this.aClass6_Sub2_Sub3_8.method251(58);
									this.aClass6_Sub2_Sub3_8.method252(0);
									local208 = this.aClass6_Sub2_Sub3_8.anInt404;
									this.aClass6_Sub2_Sub3_8.method258(this.aLong32);
									Class49.method538(this.aString22, this.aClass6_Sub2_Sub3_8);
									this.aClass6_Sub2_Sub3_8.method261(this.aClass6_Sub2_Sub3_8.anInt404 - local208);
									this.aString22 = Class49.method539(this.aString22);
									this.aString22 = Class26.method198(this.aString22);
									this.method638(Class39.method363(Class39.method360(this.aLong32)), 6, this.aString22);
									if (this.anInt887 == 2) {
										this.anInt887 = 1;
										this.aBoolean283 = true;
										this.aClass6_Sub2_Sub3_8.method251(56);
										this.aClass6_Sub2_Sub3_8.method252(this.anInt1028);
										this.aClass6_Sub2_Sub3_8.method252(this.anInt887);
										this.aClass6_Sub2_Sub3_8.method252(this.anInt951);
									}
								}
								if (this.anInt1041 == 4 && this.anInt1052 < 100) {
									local168 = Class39.method359(this.aString22);
									this.method680(local168);
								}
								if (this.anInt1041 == 5 && this.anInt1052 > 0) {
									local168 = Class39.method359(this.aString22);
									this.method668(local168);
								}
							}
						} else if (this.anInt923 == 1) {
							if (local28 >= 48 && local28 <= 57 && this.aString31.length() < 10) {
								this.aString31 = this.aString31 + (char) local28;
								this.aBoolean282 = true;
							}
							if (local28 == 8 && this.aString31.length() > 0) {
								this.aString31 = this.aString31.substring(0, this.aString31.length() - 1);
								this.aBoolean282 = true;
							}
							if (local28 == 13 || local28 == 10) {
								if (this.aString31.length() > 0) {
									local208 = 0;
									try {
										local208 = Integer.parseInt(this.aString31);
									} catch (@Pc(385) Exception local385) {
									}
									this.aClass6_Sub2_Sub3_8.method251(5);
									this.aClass6_Sub2_Sub3_8.method256(local208);
								}
								this.anInt923 = 0;
								this.aBoolean282 = true;
							}
						} else if (this.anInt923 == 2) {
							if (local28 >= 32 && local28 <= 122 && this.aString31.length() < 12) {
								this.aString31 = this.aString31 + (char) local28;
								this.aBoolean282 = true;
							}
							if (local28 == 8 && this.aString31.length() > 0) {
								this.aString31 = this.aString31.substring(0, this.aString31.length() - 1);
								this.aBoolean282 = true;
							}
							if (local28 == 13 || local28 == 10) {
								if (this.aString31.length() > 0) {
									this.aClass6_Sub2_Sub3_8.method251(192);
									this.aClass6_Sub2_Sub3_8.method258(Class39.method359(this.aString31));
								}
								this.anInt923 = 0;
								this.aBoolean282 = true;
							}
						} else if (this.anInt923 == 3) {
							if (local28 >= 32 && local28 <= 122 && this.aString31.length() < 40) {
								this.aString31 = this.aString31 + (char) local28;
								this.aBoolean282 = true;
							}
							if (local28 == 8 && this.aString31.length() > 0) {
								this.aString31 = this.aString31.substring(0, this.aString31.length() - 1);
								this.aBoolean282 = true;
							}
						} else if (this.anInt983 == -1 && this.anInt924 == -1) {
							if (local28 >= 32 && local28 <= 122 && this.aString30.length() < 80) {
								this.aString30 = this.aString30 + (char) local28;
								this.aBoolean282 = true;
							}
							if (local28 == 8 && this.aString30.length() > 0) {
								this.aString30 = this.aString30.substring(0, this.aString30.length() - 1);
								this.aBoolean282 = true;
							}
							if ((local28 == 13 || local28 == 10) && this.aString30.length() > 0) {
								if (this.anInt917 == 2) {
									if (this.aString30.equals("::clientdrop")) {
										this.method590();
									}
									if (this.aString30.equals("::lag")) {
										this.method643();
									}
									if (this.aString30.equals("::prefetchmusic")) {
										for (local208 = 0; local208 < this.aClass25_Sub1_1.method247(2); local208++) {
											this.aClass25_Sub1_1.method244(2, (byte) 1, local208);
										}
									}
									if (this.aString30.equals("::fpson")) {
										aBoolean271 = true;
									}
									if (this.aString30.equals("::fpsoff")) {
										aBoolean271 = false;
									}
									if (this.aString30.equals("::noclip")) {
										for (local208 = 0; local208 < 4; local208++) {
											for (@Pc(670) int local670 = 1; local670 < 103; local670++) {
												for (@Pc(674) int local674 = 1; local674 < 103; local674++) {
													this.aClass47Array1[local208].anIntArrayArray17[local670][local674] = 0;
												}
											}
										}
									}
								}
								if (this.aString30.startsWith("::")) {
									this.aClass6_Sub2_Sub3_8.method251(15);
									this.aClass6_Sub2_Sub3_8.method252(this.aString30.length() - 1);
									this.aClass6_Sub2_Sub3_8.method259(this.aString30.substring(2));
								} else {
									@Pc(729) String local729 = this.aString30.toLowerCase();
									@Pc(731) byte local731 = 0;
									if (local729.startsWith("yellow:")) {
										local731 = 0;
										this.aString30 = this.aString30.substring(7);
									} else if (local729.startsWith("red:")) {
										local731 = 1;
										this.aString30 = this.aString30.substring(4);
									} else if (local729.startsWith("green:")) {
										local731 = 2;
										this.aString30 = this.aString30.substring(6);
									} else if (local729.startsWith("cyan:")) {
										local731 = 3;
										this.aString30 = this.aString30.substring(5);
									} else if (local729.startsWith("purple:")) {
										local731 = 4;
										this.aString30 = this.aString30.substring(7);
									} else if (local729.startsWith("white:")) {
										local731 = 5;
										this.aString30 = this.aString30.substring(6);
									} else if (local729.startsWith("flash1:")) {
										local731 = 6;
										this.aString30 = this.aString30.substring(7);
									} else if (local729.startsWith("flash2:")) {
										local731 = 7;
										this.aString30 = this.aString30.substring(7);
									} else if (local729.startsWith("flash3:")) {
										local731 = 8;
										this.aString30 = this.aString30.substring(7);
									} else if (local729.startsWith("glow1:")) {
										local731 = 9;
										this.aString30 = this.aString30.substring(6);
									} else if (local729.startsWith("glow2:")) {
										local731 = 10;
										this.aString30 = this.aString30.substring(6);
									} else if (local729.startsWith("glow3:")) {
										local731 = 11;
										this.aString30 = this.aString30.substring(6);
									}
									local729 = this.aString30.toLowerCase();
									@Pc(903) byte local903 = 0;
									if (local729.startsWith("wave:")) {
										local903 = 1;
										this.aString30 = this.aString30.substring(5);
									} else if (local729.startsWith("wave2:")) {
										local903 = 2;
										this.aString30 = this.aString30.substring(6);
									} else if (local729.startsWith("shake:")) {
										local903 = 3;
										this.aString30 = this.aString30.substring(6);
									} else if (local729.startsWith("scroll:")) {
										local903 = 4;
										this.aString30 = this.aString30.substring(7);
									} else if (local729.startsWith("slide:")) {
										local903 = 5;
										this.aString30 = this.aString30.substring(6);
									}
									this.aClass6_Sub2_Sub3_8.method251(47);
									this.aClass6_Sub2_Sub3_8.method252(0);
									@Pc(984) int local984 = this.aClass6_Sub2_Sub3_8.anInt404;
									this.aClass6_Sub2_Sub3_8.method278(local903);
									this.aClass6_Sub2_Sub3_8.method279(local731);
									this.aClass6_Sub2_Sub3_7.anInt404 = 0;
									Class49.method538(this.aString30, this.aClass6_Sub2_Sub3_7);
									this.aClass6_Sub2_Sub3_8.method299(this.aByte42, this.aClass6_Sub2_Sub3_7.anInt404, this.aClass6_Sub2_Sub3_7.aByteArray9);
									this.aClass6_Sub2_Sub3_8.method261(this.aClass6_Sub2_Sub3_8.anInt404 - local984);
									this.aString30 = Class49.method539(this.aString30);
									this.aString30 = Class26.method198(this.aString30);
									aClass6_Sub2_Sub1_Sub1_Sub2_1.aString15 = this.aString30;
									aClass6_Sub2_Sub1_Sub1_Sub2_1.anInt695 = local731;
									aClass6_Sub2_Sub1_Sub1_Sub2_1.anInt697 = local903;
									aClass6_Sub2_Sub1_Sub1_Sub2_1.anInt707 = 150;
									if (this.anInt917 == 2) {
										this.method638("@cr2@" + aClass6_Sub2_Sub1_Sub1_Sub2_1.aString16, 2, aClass6_Sub2_Sub1_Sub1_Sub2_1.aString15);
									} else if (this.anInt917 == 1) {
										this.method638("@cr1@" + aClass6_Sub2_Sub1_Sub1_Sub2_1.aString16, 2, aClass6_Sub2_Sub1_Sub1_Sub2_1.aString15);
									} else {
										this.method638(aClass6_Sub2_Sub1_Sub1_Sub2_1.aString16, 2, aClass6_Sub2_Sub1_Sub1_Sub2_1.aString15);
									}
									if (this.anInt1028 == 2) {
										this.anInt1028 = 3;
										this.aBoolean283 = true;
										this.aClass6_Sub2_Sub3_8.method251(56);
										this.aClass6_Sub2_Sub3_8.method252(this.anInt1028);
										this.aClass6_Sub2_Sub3_8.method252(this.anInt887);
										this.aClass6_Sub2_Sub3_8.method252(this.anInt951);
									}
								}
								this.aString30 = "";
								this.aBoolean282 = true;
							}
						}
					}
				} while ((local28 < 97 || local28 > 122) && (local28 < 65 || local28 > 90) && (local28 < 48 || local28 > 57) && local28 != 32);
				if (this.aString19.length() < 12) {
					this.aString19 = this.aString19 + (char) local28;
				}
			}
		} catch (@Pc(1138) RuntimeException local1138) {
			signlink.reporterror("53449, " + false + ", " + local1138.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILclient!NQUAUMDT;Lclient!XVMRCEYW;II)V")
	private void method714(@OriginalArg(0) int arg0, @OriginalArg(1) Class6_Sub2_Sub3 arg1, @OriginalArg(2) Class6_Sub2_Sub1_Sub1_Sub2 arg2, @OriginalArg(4) int arg3) {
		try {
			@Pc(19) int local19;
			if ((arg3 & 0x4) != 0) {
				local19 = arg1.method282(this.anInt1043);
				@Pc(22) byte[] local22 = new byte[local19];
				@Pc(28) Class6_Sub2_Sub3 local28 = new Class6_Sub2_Sub3(-587, local22);
				arg1.method300(local22, local19, this.anInt1065);
				this.aClass6_Sub2_Sub3Array1[arg0] = local28;
				arg2.method511(local28);
			}
			if ((arg3 & 0x20) != 0) {
				arg2.anInt675 = arg1.method291(this.aByte43);
				arg2.anInt676 = arg1.method290();
			}
			@Pc(73) int local73;
			if ((arg3 & 0x200) != 0) {
				local19 = arg1.method282(this.anInt1043);
				local73 = arg1.method282(this.anInt1043);
				arg2.method507(anInt1077, local73, local19);
				arg2.anInt678 = anInt1077 + 300;
				arg2.anInt679 = arg1.method280();
				arg2.anInt680 = arg1.method282(this.anInt1043);
			}
			if ((arg3 & 0x80) != 0) {
				arg2.aString15 = arg1.method269();
				if (arg2.aString15.charAt(0) == '~') {
					arg2.aString15 = arg2.aString15.substring(1);
					this.method638(arg2.aString16, 2, arg2.aString15);
				} else if (arg2 == aClass6_Sub2_Sub1_Sub1_Sub2_1) {
					this.method638(arg2.aString16, 2, arg2.aString15);
				}
				arg2.anInt695 = 0;
				arg2.anInt697 = 0;
				arg2.anInt707 = 150;
			}
			@Pc(174) int local174;
			if ((arg3 & 0x2) != 0) {
				local19 = arg1.method290();
				if (local19 == 65535) {
					local19 = -1;
				}
				local73 = arg1.method281();
				if (local19 == arg2.anInt702 && local19 != -1) {
					local174 = Class21.aClass21Array1[local19].anInt352;
					if (local174 == 1) {
						arg2.anInt703 = 0;
						arg2.anInt704 = 0;
						arg2.anInt705 = local73;
						arg2.anInt706 = 0;
					}
					if (local174 == 2) {
						arg2.anInt706 = 0;
					}
				} else if (local19 == -1 || arg2.anInt702 == -1 || Class21.aClass21Array1[local19].anInt346 >= Class21.aClass21Array1[arg2.anInt702].anInt346) {
					arg2.anInt702 = local19;
					arg2.anInt703 = 0;
					arg2.anInt704 = 0;
					arg2.anInt705 = local73;
					arg2.anInt706 = 0;
					arg2.anInt708 = arg2.anInt677;
				}
			}
			if ((arg3 & 0x1) != 0) {
				local19 = arg1.method262();
				local73 = arg1.method282(this.anInt1043);
				arg2.method507(anInt1077, local73, local19);
				arg2.anInt678 = anInt1077 + 300;
				arg2.anInt679 = arg1.method281();
				arg2.anInt680 = arg1.method282(this.anInt1043);
			}
			if ((arg3 & 0x400) != 0) {
				arg2.anInt686 = arg1.method289((byte) 1);
				local19 = arg1.method297();
				arg2.anInt690 = local19 >> 16;
				arg2.anInt689 = anInt1077 + (local19 & 0xFFFF);
				arg2.anInt687 = 0;
				arg2.anInt688 = 0;
				if (arg2.anInt689 > anInt1077) {
					arg2.anInt687 = -1;
				}
				if (arg2.anInt686 == 65535) {
					arg2.anInt686 = -1;
				}
			}
			if ((arg3 & 0x40) != 0) {
				arg2.anInt711 = arg1.method264();
				if (arg2.anInt711 == 65535) {
					arg2.anInt711 = -1;
				}
			}
			if ((arg3 & 0x8) != 0) {
				local19 = arg1.method289((byte) 1);
				local73 = arg1.method280();
				local174 = arg1.method282(this.anInt1043);
				@Pc(347) int local347 = arg1.anInt404;
				if (arg2.aString16 != null && arg2.aBoolean207) {
					@Pc(357) long local357 = Class39.method359(arg2.aString16);
					@Pc(359) boolean local359 = false;
					if (local73 <= 1) {
						for (@Pc(364) int local364 = 0; local364 < this.anInt1052; local364++) {
							if (this.aLongArray3[local364] == local357) {
								local359 = true;
								break;
							}
						}
					}
					if (!local359 && this.anInt1068 == 0) {
						try {
							this.aClass6_Sub2_Sub3_7.anInt404 = 0;
							arg1.method271(this.aClass6_Sub2_Sub3_7.aByteArray9, local174, 520);
							this.aClass6_Sub2_Sub3_7.anInt404 = 0;
							@Pc(409) String local409 = Class49.method537(local174, this.aClass6_Sub2_Sub3_7);
							@Pc(413) String local413 = Class26.method198(local409);
							arg2.aString15 = local413;
							arg2.anInt695 = local19 >> 8;
							arg2.anInt697 = local19 & 0xFF;
							arg2.anInt707 = 150;
							if (local73 == 2 || local73 == 3) {
								this.method638("@cr2@" + arg2.aString16, 1, local413);
							} else if (local73 == 1) {
								this.method638("@cr1@" + arg2.aString16, 1, local413);
							} else {
								this.method638(arg2.aString16, 2, local413);
							}
						} catch (@Pc(477) Exception local477) {
							signlink.reporterror("cde2");
						}
					}
				}
				arg1.anInt404 = local347 + local174;
			}
			if ((arg3 & 0x100) != 0) {
				arg2.anInt716 = arg1.method281();
				arg2.anInt718 = arg1.method281();
				arg2.anInt717 = arg1.method262();
				arg2.anInt719 = arg1.method282(this.anInt1043);
				arg2.anInt720 = arg1.method264() + anInt1077;
				arg2.anInt721 = arg1.method290() + anInt1077;
				arg2.anInt722 = arg1.method282(this.anInt1043);
				arg2.method509();
			}
		} catch (@Pc(533) RuntimeException local533) {
			signlink.reporterror("28787, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 2 + ", " + arg3 + ", " + local533.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ZLjava/lang/String;)Z")
	private boolean method715(@OriginalArg(1) String arg0) {
		try {
			if (arg0 == null) {
				return false;
			}
			for (@Pc(10) int local10 = 0; local10 < this.anInt926; local10++) {
				if (arg0.equalsIgnoreCase(this.aStringArray14[local10])) {
					return true;
				}
			}
			return arg0.equalsIgnoreCase(aClass6_Sub2_Sub1_Sub1_Sub2_1.aString16);
		} catch (@Pc(36) RuntimeException local36) {
			signlink.reporterror("72138, " + true + ", " + arg0 + ", " + local36.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "run", descriptor = "()V")
	@Override
	public void run() {
		if (this.aBoolean265) {
			this.method632((byte) 3);
		} else {
			super.run();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(IIIIII)V")
	private void method716(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		try {
			this.anInt879 += 0;
			@Pc(14) int local14 = this.aClass41_1.method428(arg2, arg1, arg0);
			@Pc(24) int local24;
			@Pc(30) int local30;
			@Pc(34) int local34;
			@Pc(36) int local36;
			@Pc(58) int local58;
			@Pc(64) int local64;
			if (local14 != 0) {
				local24 = this.aClass41_1.method432(arg2, arg1, arg0, local14);
				local30 = local24 >> 6 & 0x3;
				local34 = local24 & 0x1F;
				local36 = arg3;
				if (local14 > 0) {
					local36 = arg4;
				}
				@Pc(44) int[] local44 = this.aClass6_Sub2_Sub2_Sub1_10.anIntArray43;
				local58 = arg1 * 4 + (103 - arg0) * 512 * 4 + 24624;
				local64 = local14 >> 14 & 0x7FFF;
				@Pc(67) Class19 local67 = Class19.method169(local64);
				if (local67.anInt314 == -1) {
					if (local34 == 0 || local34 == 2) {
						if (local30 == 0) {
							local44[local58] = local36;
							local44[local58 + 512] = local36;
							local44[local58 + 1024] = local36;
							local44[local58 + 1536] = local36;
						} else if (local30 == 1) {
							local44[local58] = local36;
							local44[local58 + 1] = local36;
							local44[local58 + 2] = local36;
							local44[local58 + 3] = local36;
						} else if (local30 == 2) {
							local44[local58 + 3] = local36;
							local44[local58 + 3 + 512] = local36;
							local44[local58 + 3 + 1024] = local36;
							local44[local58 + 3 + 1536] = local36;
						} else if (local30 == 3) {
							local44[local58 + 1536] = local36;
							local44[local58 + 1536 + 1] = local36;
							local44[local58 + 1536 + 2] = local36;
							local44[local58 + 1536 + 3] = local36;
						}
					}
					if (local34 == 3) {
						if (local30 == 0) {
							local44[local58] = local36;
						} else if (local30 == 1) {
							local44[local58 + 3] = local36;
						} else if (local30 == 2) {
							local44[local58 + 3 + 1536] = local36;
						} else if (local30 == 3) {
							local44[local58 + 1536] = local36;
						}
					}
					if (local34 == 2) {
						if (local30 == 3) {
							local44[local58] = local36;
							local44[local58 + 512] = local36;
							local44[local58 + 1024] = local36;
							local44[local58 + 1536] = local36;
						} else if (local30 == 0) {
							local44[local58] = local36;
							local44[local58 + 1] = local36;
							local44[local58 + 2] = local36;
							local44[local58 + 3] = local36;
						} else if (local30 == 1) {
							local44[local58 + 3] = local36;
							local44[local58 + 3 + 512] = local36;
							local44[local58 + 3 + 1024] = local36;
							local44[local58 + 3 + 1536] = local36;
						} else if (local30 == 2) {
							local44[local58 + 1536] = local36;
							local44[local58 + 1536 + 1] = local36;
							local44[local58 + 1536 + 2] = local36;
							local44[local58 + 1536 + 3] = local36;
						}
					}
				} else {
					@Pc(77) Class6_Sub2_Sub2_Sub3 local77 = this.aClass6_Sub2_Sub2_Sub3Array5[local67.anInt314];
					if (local77 != null) {
						@Pc(89) int local89 = (local67.anInt319 * 4 - local77.anInt605) / 2;
						@Pc(99) int local99 = (local67.anInt304 * 4 - local77.anInt606) / 2;
						local77.method488((104 - arg0 - local67.anInt304) * 4 + local99 + 48, arg1 * 4 + 48 + local89);
					}
				}
			}
			local14 = this.aClass41_1.method430(arg2, arg1, arg0);
			if (local14 != 0) {
				local24 = this.aClass41_1.method432(arg2, arg1, arg0, local14);
				local30 = local24 >> 6 & 0x3;
				local34 = local24 & 0x1F;
				local36 = local14 >> 14 & 0x7FFF;
				@Pc(453) Class19 local453 = Class19.method169(local36);
				@Pc(485) int local485;
				if (local453.anInt314 != -1) {
					@Pc(463) Class6_Sub2_Sub2_Sub3 local463 = this.aClass6_Sub2_Sub2_Sub3Array5[local453.anInt314];
					if (local463 != null) {
						local64 = (local453.anInt319 * 4 - local463.anInt605) / 2;
						local485 = (local453.anInt304 * 4 - local463.anInt606) / 2;
						local463.method488((104 - arg0 - local453.anInt304) * 4 + local485 + 48, arg1 * 4 + 48 + local64);
					}
				} else if (local34 == 9) {
					local58 = 15658734;
					if (local14 > 0) {
						local58 = 15597568;
					}
					@Pc(522) int[] local522 = this.aClass6_Sub2_Sub2_Sub1_10.anIntArray43;
					local485 = arg1 * 4 + (103 - arg0) * 512 * 4 + 24624;
					if (local30 == 0 || local30 == 2) {
						local522[local485 + 1536] = local58;
						local522[local485 + 1024 + 1] = local58;
						local522[local485 + 512 + 2] = local58;
						local522[local485 + 3] = local58;
					} else {
						local522[local485] = local58;
						local522[local485 + 512 + 1] = local58;
						local522[local485 + 1024 + 2] = local58;
						local522[local485 + 1536 + 3] = local58;
					}
				}
			}
			local14 = this.aClass41_1.method431(arg2, arg1, arg0);
			if (local14 != 0) {
				local24 = local14 >> 14 & 0x7FFF;
				@Pc(617) Class19 local617 = Class19.method169(local24);
				if (local617.anInt314 != -1) {
					@Pc(627) Class6_Sub2_Sub2_Sub3 local627 = this.aClass6_Sub2_Sub2_Sub3Array5[local617.anInt314];
					if (local627 != null) {
						local36 = (local617.anInt319 * 4 - local627.anInt605) / 2;
						@Pc(649) int local649 = (local617.anInt304 * 4 - local627.anInt606) / 2;
						local627.method488((104 - arg0 - local617.anInt304) * 4 + local649 + 48, arg1 * 4 + 48 + local36);
						return;
					}
				}
			}
		} catch (@Pc(673) RuntimeException local673) {
			signlink.reporterror("99725, " + arg0 + ", " + 0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local673.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(ILclient!VGGOSQRK;)Z")
	private boolean method718(@OriginalArg(0) int arg0, @OriginalArg(1) Class44 arg1) {
		try {
			@Pc(4) int local4 = arg1.anInt615;
			this.anInt879 += arg0;
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
				this.aStringArray13[this.anInt933] = "Remove @whi@" + this.aStringArray14[local4];
				this.anIntArray274[this.anInt933] = 641;
				this.anInt933++;
				this.aStringArray13[this.anInt933] = "Message @whi@" + this.aStringArray14[local4];
				this.anIntArray274[this.anInt933] = 664;
				this.anInt933++;
				return true;
			} else if (local4 >= 401 && local4 <= 500) {
				this.aStringArray13[this.anInt933] = "Remove @whi@" + arg1.aString14;
				this.anIntArray274[this.anInt933] = 387;
				this.anInt933++;
				return true;
			} else {
				return false;
			}
		} catch (@Pc(133) RuntimeException local133) {
			signlink.reporterror("35441, " + arg0 + ", " + arg1 + ", " + local133.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIIIIIIZIII)Z")
	private boolean method719(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		try {
			@Pc(11) int local11;
			for (@Pc(7) int local7 = 0; local7 < 104; local7++) {
				for (local11 = 0; local11 < 104; local11++) {
					this.anIntArrayArray23[local7][local11] = 0;
					this.anIntArrayArray24[local7][local11] = 99999999;
				}
			}
			local11 = arg10;
			@Pc(39) int local39 = arg4;
			this.anIntArrayArray23[arg10][arg4] = 99;
			this.anIntArrayArray24[arg10][arg4] = 0;
			@Pc(55) byte local55 = 0;
			@Pc(57) int local57 = 0;
			this.anIntArray233[0] = arg10;
			@Pc(66) int local66 = local55 + 1;
			this.anIntArray234[0] = arg4;
			@Pc(70) boolean local70 = false;
			@Pc(74) int local74 = this.anIntArray233.length;
			@Pc(81) int[][] local81 = this.aClass47Array1[this.anInt1074].anIntArrayArray17;
			@Pc(192) int local192;
			while (local57 != local66) {
				local11 = this.anIntArray233[local57];
				local39 = this.anIntArray234[local57];
				local57 = (local57 + 1) % local74;
				if (local11 == arg6 && local39 == arg2) {
					local70 = true;
					break;
				}
				if (arg7 != 0) {
					if ((arg7 < 5 || arg7 == 10) && this.aClass47Array1[this.anInt1074].method523(local39, arg7 - 1, arg2, local11, arg6, arg0)) {
						local70 = true;
						break;
					}
					if (arg7 < 10 && this.aClass47Array1[this.anInt1074].method524(local11, arg7 - 1, arg6, arg2, arg0, local39)) {
						local70 = true;
						break;
					}
				}
				if (arg1 != 0 && arg5 != 0 && this.aClass47Array1[this.anInt1074].method525(arg1, local39, arg6, arg5, local11, arg3, arg2)) {
					local70 = true;
					break;
				}
				local192 = this.anIntArrayArray24[local11][local39] + 1;
				if (local11 > 0 && this.anIntArrayArray23[local11 - 1][local39] == 0 && (local81[local11 - 1][local39] & 0x1280108) == 0) {
					this.anIntArray233[local66] = local11 - 1;
					this.anIntArray234[local66] = local39;
					local66 = (local66 + 1) % local74;
					this.anIntArrayArray23[local11 - 1][local39] = 2;
					this.anIntArrayArray24[local11 - 1][local39] = local192;
				}
				if (local11 < 103 && this.anIntArrayArray23[local11 + 1][local39] == 0 && (local81[local11 + 1][local39] & 0x1280180) == 0) {
					this.anIntArray233[local66] = local11 + 1;
					this.anIntArray234[local66] = local39;
					local66 = (local66 + 1) % local74;
					this.anIntArrayArray23[local11 + 1][local39] = 8;
					this.anIntArrayArray24[local11 + 1][local39] = local192;
				}
				if (local39 > 0 && this.anIntArrayArray23[local11][local39 - 1] == 0 && (local81[local11][local39 - 1] & 0x1280102) == 0) {
					this.anIntArray233[local66] = local11;
					this.anIntArray234[local66] = local39 - 1;
					local66 = (local66 + 1) % local74;
					this.anIntArrayArray23[local11][local39 - 1] = 1;
					this.anIntArrayArray24[local11][local39 - 1] = local192;
				}
				if (local39 < 103 && this.anIntArrayArray23[local11][local39 + 1] == 0 && (local81[local11][local39 + 1] & 0x1280120) == 0) {
					this.anIntArray233[local66] = local11;
					this.anIntArray234[local66] = local39 + 1;
					local66 = (local66 + 1) % local74;
					this.anIntArrayArray23[local11][local39 + 1] = 4;
					this.anIntArrayArray24[local11][local39 + 1] = local192;
				}
				if (local11 > 0 && local39 > 0 && this.anIntArrayArray23[local11 - 1][local39 - 1] == 0 && (local81[local11 - 1][local39 - 1] & 0x128010E) == 0 && (local81[local11 - 1][local39] & 0x1280108) == 0 && (local81[local11][local39 - 1] & 0x1280102) == 0) {
					this.anIntArray233[local66] = local11 - 1;
					this.anIntArray234[local66] = local39 - 1;
					local66 = (local66 + 1) % local74;
					this.anIntArrayArray23[local11 - 1][local39 - 1] = 3;
					this.anIntArrayArray24[local11 - 1][local39 - 1] = local192;
				}
				if (local11 < 103 && local39 > 0 && this.anIntArrayArray23[local11 + 1][local39 - 1] == 0 && (local81[local11 + 1][local39 - 1] & 0x1280183) == 0 && (local81[local11 + 1][local39] & 0x1280180) == 0 && (local81[local11][local39 - 1] & 0x1280102) == 0) {
					this.anIntArray233[local66] = local11 + 1;
					this.anIntArray234[local66] = local39 - 1;
					local66 = (local66 + 1) % local74;
					this.anIntArrayArray23[local11 + 1][local39 - 1] = 9;
					this.anIntArrayArray24[local11 + 1][local39 - 1] = local192;
				}
				if (local11 > 0 && local39 < 103 && this.anIntArrayArray23[local11 - 1][local39 + 1] == 0 && (local81[local11 - 1][local39 + 1] & 0x1280138) == 0 && (local81[local11 - 1][local39] & 0x1280108) == 0 && (local81[local11][local39 + 1] & 0x1280120) == 0) {
					this.anIntArray233[local66] = local11 - 1;
					this.anIntArray234[local66] = local39 + 1;
					local66 = (local66 + 1) % local74;
					this.anIntArrayArray23[local11 - 1][local39 + 1] = 6;
					this.anIntArrayArray24[local11 - 1][local39 + 1] = local192;
				}
				if (local11 < 103 && local39 < 103 && this.anIntArrayArray23[local11 + 1][local39 + 1] == 0 && (local81[local11 + 1][local39 + 1] & 0x12801E0) == 0 && (local81[local11 + 1][local39] & 0x1280180) == 0 && (local81[local11][local39 + 1] & 0x1280120) == 0) {
					this.anIntArray233[local66] = local11 + 1;
					this.anIntArray234[local66] = local39 + 1;
					local66 = (local66 + 1) % local74;
					this.anIntArrayArray23[local11 + 1][local39 + 1] = 12;
					this.anIntArrayArray24[local11 + 1][local39 + 1] = local192;
				}
			}
			this.anInt970 = 0;
			@Pc(808) int local808;
			@Pc(814) int local814;
			@Pc(820) int local820;
			if (!local70) {
				if (arg8) {
					local192 = 100;
					for (local808 = 1; local808 < 2; local808++) {
						for (local814 = arg6 - local808; local814 <= arg6 + local808; local814++) {
							for (local820 = arg2 - local808; local820 <= arg2 + local808; local820++) {
								if (local814 >= 0 && local820 >= 0 && local814 < 104 && local820 < 104 && this.anIntArrayArray24[local814][local820] < local192) {
									local192 = this.anIntArrayArray24[local814][local820];
									local11 = local814;
									local39 = local820;
									this.anInt970 = 1;
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
			this.anIntArray233[0] = local11;
			local57 = local881 + 1;
			this.anIntArray234[0] = local39;
			local192 = local808 = this.anIntArrayArray23[local11][local39];
			while (local11 != arg10 || local39 != arg4) {
				if (local192 != local808) {
					local808 = local192;
					this.anIntArray233[local57] = local11;
					this.anIntArray234[local57++] = local39;
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
				local192 = this.anIntArrayArray23[local11][local39];
			}
			if (local57 > 0) {
				local74 = local57;
				if (local57 > 25) {
					local74 = 25;
				}
				local57--;
				local814 = this.anIntArray233[local57];
				local820 = this.anIntArray234[local57];
				if ((local74 & 0x3) == 0) {
					anInt941++;
				}
				if (anInt941 >= 59) {
					this.aClass6_Sub2_Sub3_8.method251(13);
					anInt941 = 0;
				}
				if (arg9 == 0) {
					this.aClass6_Sub2_Sub3_8.method251(215);
					this.aClass6_Sub2_Sub3_8.method252(local74 + local74 + 3);
				}
				if (arg9 == 1) {
					this.aClass6_Sub2_Sub3_8.method251(31);
					this.aClass6_Sub2_Sub3_8.method252(local74 + local74 + 3 + 14);
				}
				if (arg9 == 2) {
					this.aClass6_Sub2_Sub3_8.method251(238);
					this.aClass6_Sub2_Sub3_8.method252(local74 + local74 + 3);
				}
				this.aClass6_Sub2_Sub3_8.method278(super.anIntArray210[5] == 1 ? 1 : 0);
				this.aClass6_Sub2_Sub3_8.method288(local814 + this.anInt945);
				this.anInt1014 = this.anIntArray233[0];
				this.anInt1015 = this.anIntArray234[0];
				for (@Pc(1084) int local1084 = 1; local1084 < local74; local1084++) {
					local57--;
					this.aClass6_Sub2_Sub3_8.method278(this.anIntArray233[local57] - local814);
					this.aClass6_Sub2_Sub3_8.method279(this.anIntArray234[local57] - local820);
				}
				this.aClass6_Sub2_Sub3_8.method253(local820 + this.anInt946);
				return true;
			} else if (arg9 == 1) {
				return false;
			} else {
				return true;
			}
		} catch (@Pc(1128) RuntimeException local1128) {
			signlink.reporterror("58220, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + 0 + ", " + arg9 + ", " + arg10 + ", " + local1128.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "f", descriptor = "(II)V")
	private void method720(@OriginalArg(0) int arg0) {
		try {
			@Pc(6) int local6 = Class14.aClass14Array1[arg0].anInt244;
			if (local6 != 0) {
				@Pc(23) int local23 = this.anIntArray260[arg0];
				if (local6 == 1) {
					if (local23 == 1) {
						Class6_Sub2_Sub2_Sub4.method568(0.9D);
					}
					if (local23 == 2) {
						Class6_Sub2_Sub2_Sub4.method568(0.8D);
					}
					if (local23 == 3) {
						Class6_Sub2_Sub2_Sub4.method568(0.7D);
					}
					if (local23 == 4) {
						Class6_Sub2_Sub2_Sub4.method568(0.6D);
					}
					Class43.aClass42_5.method455();
					this.aBoolean243 = true;
				}
				if (local6 == 3) {
					@Pc(61) boolean local61 = this.aBoolean250;
					if (local23 == 0) {
						this.method600(this.aBoolean250, 0);
						this.aBoolean250 = true;
					}
					if (local23 == 1) {
						this.method600(this.aBoolean250, -400);
						this.aBoolean250 = true;
					}
					if (local23 == 2) {
						this.method600(this.aBoolean250, -800);
						this.aBoolean250 = true;
					}
					if (local23 == 3) {
						this.method600(this.aBoolean250, -1200);
						this.aBoolean250 = true;
					}
					if (local23 == 4) {
						this.aBoolean250 = false;
					}
					if (this.aBoolean250 != local61 && !aBoolean252) {
						if (this.aBoolean250) {
							this.anInt1062 = this.anInt877;
							this.aBoolean276 = true;
							this.aClass25_Sub1_1.method228(2, this.anInt1062);
						} else {
							this.method636();
						}
						this.anInt846 = 0;
					}
				}
				if (local6 == 4) {
					if (local23 == 0) {
						this.aBoolean247 = true;
						this.method684(0);
					}
					if (local23 == 1) {
						this.aBoolean247 = true;
						this.method684(-400);
					}
					if (local23 == 2) {
						this.aBoolean247 = true;
						this.method684(-800);
					}
					if (local23 == 3) {
						this.aBoolean247 = true;
						this.method684(-1200);
					}
					if (local23 == 4) {
						this.aBoolean247 = false;
					}
				}
				if (local6 == 5) {
					this.anInt921 = local23;
				}
				if (local6 == 6) {
					this.anInt856 = local23;
				}
				if (local6 == 8) {
					this.anInt1079 = local23;
					this.aBoolean282 = true;
				}
				if (local6 == 9) {
					this.anInt935 = local23;
				}
			}
		} catch (@Pc(221) RuntimeException local221) {
			signlink.reporterror("14260, " + arg0 + ", " + 469 + ", " + local221.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "j", descriptor = "(B)V")
	private void method721() {
		try {
			@Pc(2) int local2 = this.anInt867;
			@Pc(5) int local5 = this.anInt868;
			@Pc(8) int local8 = this.anInt869;
			@Pc(11) int local11 = this.anInt870;
			Class6_Sub2_Sub2.method552(local8, local2, local11, local5, 6116423);
			Class6_Sub2_Sub2.method552(local8 - 2, local2 + 1, 16, local5 + 1, 0);
			Class6_Sub2_Sub2.method553(local2 + 1, local8 - 2, 0, local11 - 19, local5 + 18);
			this.aClass6_Sub2_Sub2_Sub2_4.method384(6116423, "Choose Option", local2 + 3, local5 + 14, this.aByte41);
			@Pc(71) int local71 = super.anInt833;
			@Pc(74) int local74 = super.anInt834;
			if (this.anInt866 == 0) {
				local71 -= 4;
				local74 -= 4;
			}
			if (this.anInt866 == 1) {
				local71 -= 553;
				local74 -= 205;
			}
			if (this.anInt866 == 2) {
				local71 -= 17;
				local74 -= 357;
			}
			for (@Pc(93) int local93 = 0; local93 < this.anInt933; local93++) {
				@Pc(108) int local108 = local5 + (this.anInt933 - 1 - local93) * 15 + 31;
				@Pc(110) int local110 = 16777215;
				if (local71 > local2 && local71 < local2 + local8 && local74 > local108 - 13 && local74 < local108 + 3) {
					local110 = 16776960;
				}
				this.aClass6_Sub2_Sub2_Sub2_4.method388(local110, true, local108, local2 + 3, this.aStringArray13[local93]);
			}
		} catch (@Pc(151) RuntimeException local151) {
			signlink.reporterror("1145, " + -93 + ", " + local151.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "g", descriptor = "(II)V")
	private void method722(@OriginalArg(0) int arg0) {
		try {
			if (arg0 >= 0) {
				@Pc(20) int local20 = this.anIntArray272[arg0];
				@Pc(25) int local25 = this.anIntArray273[arg0];
				@Pc(30) int local30 = this.anIntArray274[arg0];
				@Pc(35) int local35 = this.anIntArray275[arg0];
				if (local30 >= 2000) {
					local30 -= 2000;
				}
				if (this.anInt923 != 0 && local30 != 1855) {
					this.anInt923 = 0;
					this.aBoolean282 = true;
				}
				@Pc(75) boolean local75;
				if (local30 == 64) {
					local75 = this.method719(0, 0, local25, 0, aClass6_Sub2_Sub1_Sub1_Sub2_1.anIntArray183[0], 0, local20, 0, false, 2, aClass6_Sub2_Sub1_Sub1_Sub2_1.anIntArray182[0]);
					if (!local75) {
						this.method719(0, 1, local25, 0, aClass6_Sub2_Sub1_Sub1_Sub2_1.anIntArray183[0], 1, local20, 0, false, 2, aClass6_Sub2_Sub1_Sub1_Sub2_1.anIntArray182[0]);
					}
					this.anInt1070 = super.anInt839;
					this.anInt1071 = super.anInt840;
					this.anInt1073 = 2;
					this.anInt1072 = 0;
					this.aClass6_Sub2_Sub3_8.method251(46);
					this.aClass6_Sub2_Sub3_8.method286(local20 + this.anInt945);
					this.aClass6_Sub2_Sub3_8.method288(local25 + this.anInt946);
					this.aClass6_Sub2_Sub3_8.method253(local35);
				}
				@Pc(158) String local158;
				if (local30 == 1439) {
					@Pc(146) int local146 = local35 >> 14 & 0x7FFF;
					@Pc(149) Class19 local149 = Class19.method169(local146);
					if (local149.aByteArray3 == null) {
						local158 = "It's a " + local149.aString6 + ".";
					} else {
						local158 = new String(local149.aByteArray3);
					}
					this.method638("", 0, local158);
				}
				if (local30 == 871) {
					this.anInt894 = 1;
					this.anInt895 = local20;
					this.anInt896 = local25;
					this.anInt897 = local35;
					this.aString20 = String.valueOf(Class43.method464(local35).aString9);
					this.anInt1038 = 0;
					this.aBoolean279 = true;
				} else {
					@Pc(213) Class6_Sub2_Sub1_Sub1_Sub1 local213;
					if (local30 == 219) {
						local213 = this.aClass6_Sub2_Sub1_Sub1_Sub1Array1[local35];
						if (local213 != null) {
							this.method719(0, 1, local213.anIntArray183[0], 0, aClass6_Sub2_Sub1_Sub1_Sub2_1.anIntArray183[0], 1, local213.anIntArray182[0], 0, false, 2, aClass6_Sub2_Sub1_Sub1_Sub2_1.anIntArray182[0]);
							this.anInt1070 = super.anInt839;
							this.anInt1071 = super.anInt840;
							this.anInt1073 = 2;
							this.anInt1072 = 0;
							this.aClass6_Sub2_Sub3_8.method251(250);
							this.aClass6_Sub2_Sub3_8.method287(this.anInt895);
							this.aClass6_Sub2_Sub3_8.method288(this.anInt896);
							this.aClass6_Sub2_Sub3_8.method253(this.anInt897);
							this.aClass6_Sub2_Sub3_8.method253(local35);
						}
					}
					@Pc(297) Class44 local297;
					@Pc(315) int local315;
					if (local30 == 523) {
						this.aClass6_Sub2_Sub3_8.method251(154);
						this.aClass6_Sub2_Sub3_8.method253(local25);
						local297 = Class44.method496(local25);
						if (local297.anIntArrayArray13 != null && local297.anIntArrayArray13[0][0] == 5) {
							local315 = local297.anIntArrayArray13[0][1];
							this.anIntArray260[local315] = 1 - this.anIntArray260[local315];
							this.method720(local315);
							this.aBoolean279 = true;
						}
					}
					if (local30 == 18) {
						this.aClass6_Sub2_Sub3_8.method251(162);
						this.aClass6_Sub2_Sub3_8.method286(local20);
						this.aClass6_Sub2_Sub3_8.method253(local25);
						this.aClass6_Sub2_Sub3_8.method286(local35);
						this.anInt911 = 0;
						this.anInt912 = local25;
						this.anInt913 = local20;
						this.anInt914 = 2;
						if (Class44.method496(local25).anInt644 == this.anInt994) {
							this.anInt914 = 1;
						}
						if (Class44.method496(local25).anInt644 == this.anInt983) {
							this.anInt914 = 3;
						}
					}
					if (local30 == 752) {
						local75 = this.method719(0, 0, local25, 0, aClass6_Sub2_Sub1_Sub1_Sub2_1.anIntArray183[0], 0, local20, 0, false, 2, aClass6_Sub2_Sub1_Sub1_Sub2_1.anIntArray182[0]);
						if (!local75) {
							this.method719(0, 1, local25, 0, aClass6_Sub2_Sub1_Sub1_Sub2_1.anIntArray183[0], 1, local20, 0, false, 2, aClass6_Sub2_Sub1_Sub1_Sub2_1.anIntArray182[0]);
						}
						this.anInt1070 = super.anInt839;
						this.anInt1071 = super.anInt840;
						this.anInt1073 = 2;
						this.anInt1072 = 0;
						if ((local25 & 0x3) == 0) {
							anInt1069++;
						}
						if (anInt1069 >= 50) {
							this.aClass6_Sub2_Sub3_8.method251(49);
							this.aClass6_Sub2_Sub3_8.method253(23270);
							anInt1069 = 0;
						}
						this.aClass6_Sub2_Sub3_8.method251(121);
						this.aClass6_Sub2_Sub3_8.method253(local35);
						this.aClass6_Sub2_Sub3_8.method288(local25 + this.anInt946);
						this.aClass6_Sub2_Sub3_8.method288(local20 + this.anInt945);
					}
					if (local30 == 694) {
						this.method697(local35, local20, local25);
						this.aClass6_Sub2_Sub3_8.method251(158);
						this.aClass6_Sub2_Sub3_8.method286(local25 + this.anInt946);
						this.aClass6_Sub2_Sub3_8.method288(local20 + this.anInt945);
						this.aClass6_Sub2_Sub3_8.method286(local35 >> 14 & 0x7FFF);
					}
					if (local30 == 90) {
						local213 = this.aClass6_Sub2_Sub1_Sub1_Sub1Array1[local35];
						if (local213 != null) {
							this.method719(0, 1, local213.anIntArray183[0], 0, aClass6_Sub2_Sub1_Sub1_Sub2_1.anIntArray183[0], 1, local213.anIntArray182[0], 0, false, 2, aClass6_Sub2_Sub1_Sub1_Sub2_1.anIntArray182[0]);
							this.anInt1070 = super.anInt839;
							this.anInt1071 = super.anInt840;
							this.anInt1073 = 2;
							this.anInt1072 = 0;
							this.aClass6_Sub2_Sub3_8.method251(21);
							this.aClass6_Sub2_Sub3_8.method253(local35);
						}
					}
					if (local30 == 468) {
						local213 = this.aClass6_Sub2_Sub1_Sub1_Sub1Array1[local35];
						if (local213 != null) {
							this.method719(0, 1, local213.anIntArray183[0], 0, aClass6_Sub2_Sub1_Sub1_Sub2_1.anIntArray183[0], 1, local213.anIntArray182[0], 0, false, 2, aClass6_Sub2_Sub1_Sub1_Sub2_1.anIntArray182[0]);
							this.anInt1070 = super.anInt839;
							this.anInt1071 = super.anInt840;
							this.anInt1073 = 2;
							this.anInt1072 = 0;
							this.aClass6_Sub2_Sub3_8.method251(152);
							this.aClass6_Sub2_Sub3_8.method288(local35);
						}
					}
					if (local30 == 232) {
						this.method697(local35, local20, local25);
						this.aClass6_Sub2_Sub3_8.method251(249);
						this.aClass6_Sub2_Sub3_8.method288(local35 >> 14 & 0x7FFF);
						this.aClass6_Sub2_Sub3_8.method288(local20 + this.anInt945);
						this.aClass6_Sub2_Sub3_8.method287(local25 + this.anInt946);
					}
					@Pc(729) int local729;
					@Pc(704) String local704;
					if (local30 == 749 || local30 == 921) {
						local704 = this.aStringArray13[arg0];
						local315 = local704.indexOf("@whi@");
						if (local315 != -1) {
							local704 = local704.substring(local315 + 5).trim();
							local158 = Class39.method363(Class39.method360(Class39.method359(local704)));
							@Pc(727) boolean local727 = false;
							for (local729 = 0; local729 < this.anInt1024; local729++) {
								@Pc(739) Class6_Sub2_Sub1_Sub1_Sub2 local739 = this.aClass6_Sub2_Sub1_Sub1_Sub2Array1[this.anIntArray257[local729]];
								if (local739 != null && local739.aString16 != null && local739.aString16.equalsIgnoreCase(local158)) {
									this.method719(0, 1, local739.anIntArray183[0], 0, aClass6_Sub2_Sub1_Sub1_Sub2_1.anIntArray183[0], 1, local739.anIntArray182[0], 0, false, 2, aClass6_Sub2_Sub1_Sub1_Sub2_1.anIntArray182[0]);
									if (local30 == 749) {
										this.aClass6_Sub2_Sub3_8.method251(16);
										this.aClass6_Sub2_Sub3_8.method253(this.anIntArray257[local729]);
									}
									if (local30 == 921) {
										this.aClass6_Sub2_Sub3_8.method251(201);
										this.aClass6_Sub2_Sub3_8.method288(this.anIntArray257[local729]);
									}
									local727 = true;
									break;
								}
							}
							if (!local727) {
								this.method638("", 0, "Unable to find " + local158);
							}
						}
					}
					if (local30 == 1952) {
						this.method697(local35, local20, local25);
						this.aClass6_Sub2_Sub3_8.method251(0);
						this.aClass6_Sub2_Sub3_8.method253(local20 + this.anInt945);
						this.aClass6_Sub2_Sub3_8.method288(local35 >> 14 & 0x7FFF);
						this.aClass6_Sub2_Sub3_8.method288(local25 + this.anInt946);
					}
					if (local30 == 883) {
						this.aClass6_Sub2_Sub3_8.method251(154);
						this.aClass6_Sub2_Sub3_8.method253(local25);
						local297 = Class44.method496(local25);
						if (local297.anIntArrayArray13 != null && local297.anIntArrayArray13[0][0] == 5) {
							local315 = local297.anIntArrayArray13[0][1];
							if (this.anIntArray260[local315] != local297.anIntArray175[0]) {
								this.anIntArray260[local315] = local297.anIntArray175[0];
								this.method720(local315);
								this.aBoolean279 = true;
							}
						}
					}
					if (local30 == 843) {
						local213 = this.aClass6_Sub2_Sub1_Sub1_Sub1Array1[local35];
						if (local213 != null) {
							this.method719(0, 1, local213.anIntArray183[0], 0, aClass6_Sub2_Sub1_Sub1_Sub2_1.anIntArray183[0], 1, local213.anIntArray182[0], 0, false, 2, aClass6_Sub2_Sub1_Sub1_Sub2_1.anIntArray182[0]);
							this.anInt1070 = super.anInt839;
							this.anInt1071 = super.anInt840;
							this.anInt1073 = 2;
							this.anInt1072 = 0;
							this.aClass6_Sub2_Sub3_8.method251(219);
							this.aClass6_Sub2_Sub3_8.method286(local35);
							this.aClass6_Sub2_Sub3_8.method288(this.anInt1039);
						}
					}
					if (local30 == 550) {
						local213 = this.aClass6_Sub2_Sub1_Sub1_Sub1Array1[local35];
						if (local213 != null) {
							this.method719(0, 1, local213.anIntArray183[0], 0, aClass6_Sub2_Sub1_Sub1_Sub2_1.anIntArray183[0], 1, local213.anIntArray182[0], 0, false, 2, aClass6_Sub2_Sub1_Sub1_Sub2_1.anIntArray182[0]);
							this.anInt1070 = super.anInt839;
							this.anInt1071 = super.anInt840;
							this.anInt1073 = 2;
							this.anInt1072 = 0;
							this.aClass6_Sub2_Sub3_8.method251(133);
							this.aClass6_Sub2_Sub3_8.method288(local35);
						}
					}
					if (local30 == 980 && this.method697(local35, local20, local25)) {
						this.aClass6_Sub2_Sub3_8.method251(186);
						this.aClass6_Sub2_Sub3_8.method287(local35 >> 14 & 0x7FFF);
						this.aClass6_Sub2_Sub3_8.method253(this.anInt897);
						this.aClass6_Sub2_Sub3_8.method288(this.anInt896);
						this.aClass6_Sub2_Sub3_8.method253(this.anInt895);
						this.aClass6_Sub2_Sub3_8.method253(local20 + this.anInt945);
						this.aClass6_Sub2_Sub3_8.method288(local25 + this.anInt946);
					}
					@Pc(1132) long local1132;
					if (local30 == 664) {
						local704 = this.aStringArray13[arg0];
						local315 = local704.indexOf("@whi@");
						if (local315 != -1) {
							local1132 = Class39.method359(local704.substring(local315 + 5).trim());
							local729 = -1;
							for (@Pc(1136) int local1136 = 0; local1136 < this.anInt926; local1136++) {
								if (this.aLongArray4[local1136] == local1132) {
									local729 = local1136;
									break;
								}
							}
							if (local729 != -1 && this.anIntArray231[local729] > 0) {
								this.aBoolean282 = true;
								this.anInt923 = 0;
								this.aBoolean241 = true;
								this.aString22 = "";
								this.anInt1041 = 3;
								this.aLong32 = this.aLongArray4[local729];
								this.aString24 = "Enter message to send to " + this.aStringArray14[local729];
							}
						}
					}
					@Pc(1203) Class6_Sub2_Sub1_Sub1_Sub2 local1203;
					if (local30 == 665) {
						local1203 = this.aClass6_Sub2_Sub1_Sub1_Sub2Array1[local35];
						if (local1203 != null) {
							this.method719(0, 1, local1203.anIntArray183[0], 0, aClass6_Sub2_Sub1_Sub1_Sub2_1.anIntArray183[0], 1, local1203.anIntArray182[0], 0, false, 2, aClass6_Sub2_Sub1_Sub1_Sub2_1.anIntArray182[0]);
							this.anInt1070 = super.anInt839;
							this.anInt1071 = super.anInt840;
							this.anInt1073 = 2;
							this.anInt1072 = 0;
							this.aClass6_Sub2_Sub3_8.method251(201);
							this.aClass6_Sub2_Sub3_8.method288(local35);
						}
					}
					if (local30 == 293) {
						this.method697(local35, local20, local25);
						this.aClass6_Sub2_Sub3_8.method251(189);
						this.aClass6_Sub2_Sub3_8.method288(local35 >> 14 & 0x7FFF);
						this.aClass6_Sub2_Sub3_8.method287(local20 + this.anInt945);
						this.aClass6_Sub2_Sub3_8.method286(local25 + this.anInt946);
					}
					if (local30 == 870) {
						local1203 = this.aClass6_Sub2_Sub1_Sub1_Sub2Array1[local35];
						if (local1203 != null) {
							this.method719(0, 1, local1203.anIntArray183[0], 0, aClass6_Sub2_Sub1_Sub1_Sub2_1.anIntArray183[0], 1, local1203.anIntArray182[0], 0, false, 2, aClass6_Sub2_Sub1_Sub1_Sub2_1.anIntArray182[0]);
							this.anInt1070 = super.anInt839;
							this.anInt1071 = super.anInt840;
							this.anInt1073 = 2;
							this.anInt1072 = 0;
							anInt1045++;
							if (anInt1045 >= 85) {
								this.aClass6_Sub2_Sub3_8.method251(147);
								this.aClass6_Sub2_Sub3_8.method253(13671);
								anInt1045 = 0;
							}
							this.aClass6_Sub2_Sub3_8.method251(217);
							this.aClass6_Sub2_Sub3_8.method286(local35);
						}
					}
					if (local30 == 455) {
						local297 = Class44.method496(local25);
						@Pc(1383) boolean local1383 = true;
						if (local297.anInt615 > 0) {
							local1383 = this.method644(local297);
						}
						if (local1383) {
							this.aClass6_Sub2_Sub3_8.method251(154);
							this.aClass6_Sub2_Sub3_8.method253(local25);
						}
					}
					if (local30 == 873) {
						local75 = this.method719(0, 0, local25, 0, aClass6_Sub2_Sub1_Sub1_Sub2_1.anIntArray183[0], 0, local20, 0, false, 2, aClass6_Sub2_Sub1_Sub1_Sub2_1.anIntArray182[0]);
						if (!local75) {
							this.method719(0, 1, local25, 0, aClass6_Sub2_Sub1_Sub1_Sub2_1.anIntArray183[0], 1, local20, 0, false, 2, aClass6_Sub2_Sub1_Sub1_Sub2_1.anIntArray182[0]);
						}
						this.anInt1070 = super.anInt839;
						this.anInt1071 = super.anInt840;
						this.anInt1073 = 2;
						this.anInt1072 = 0;
						this.aClass6_Sub2_Sub3_8.method251(213);
						this.aClass6_Sub2_Sub3_8.method287(local25 + this.anInt946);
						this.aClass6_Sub2_Sub3_8.method287(local35);
						this.aClass6_Sub2_Sub3_8.method288(local20 + this.anInt945);
					}
					if (local30 == 504) {
						this.aClass6_Sub2_Sub3_8.method251(9);
						this.aClass6_Sub2_Sub3_8.method288(local20);
						this.aClass6_Sub2_Sub3_8.method287(local25);
						this.aClass6_Sub2_Sub3_8.method287(local35);
						this.anInt911 = 0;
						this.anInt912 = local25;
						this.anInt913 = local20;
						this.anInt914 = 2;
						if (Class44.method496(local25).anInt644 == this.anInt994) {
							this.anInt914 = 1;
						}
						if (Class44.method496(local25).anInt644 == this.anInt983) {
							this.anInt914 = 3;
						}
					}
					if (local30 == 1) {
						if (this.aBoolean264) {
							this.aClass41_1.method440(local20 - 4, local25 - 4, (byte) 6);
						} else {
							this.aClass41_1.method440(super.anInt839 - 4, super.anInt840 - 4, (byte) 6);
						}
					}
					if (local30 == 722) {
						local704 = this.aStringArray13[arg0];
						local315 = local704.indexOf("@whi@");
						if (local315 != -1) {
							if (this.anInt994 == -1) {
								this.method725();
								this.aString19 = local704.substring(local315 + 5).trim();
								this.aBoolean253 = false;
								this.anInt940 = this.anInt994 = Class44.anInt631;
							} else {
								this.method638("", 0, "Please close the interface you have open before using 'report abuse'");
							}
						}
					}
					if (local30 == 632) {
						this.aClass6_Sub2_Sub3_8.method251(11);
						this.aClass6_Sub2_Sub3_8.method253(local20);
						this.aClass6_Sub2_Sub3_8.method286(this.anInt1039);
						this.aClass6_Sub2_Sub3_8.method287(local25);
						this.aClass6_Sub2_Sub3_8.method288(local35);
						this.anInt911 = 0;
						this.anInt912 = local25;
						this.anInt913 = local20;
						this.anInt914 = 2;
						if (Class44.method496(local25).anInt644 == this.anInt994) {
							this.anInt914 = 1;
						}
						if (Class44.method496(local25).anInt644 == this.anInt983) {
							this.anInt914 = 3;
						}
					}
					if (local30 == 29) {
						if ((local35 & 0x3) == 0) {
							anInt1047++;
						}
						if (anInt1047 >= 84) {
							this.aClass6_Sub2_Sub3_8.method251(90);
							this.aClass6_Sub2_Sub3_8.method253(40661);
							anInt1047 = 0;
						}
						this.aClass6_Sub2_Sub3_8.method251(57);
						this.aClass6_Sub2_Sub3_8.method286(local20);
						this.aClass6_Sub2_Sub3_8.method287(local35);
						this.aClass6_Sub2_Sub3_8.method287(local25);
						this.anInt911 = 0;
						this.anInt912 = local25;
						this.anInt913 = local20;
						this.anInt914 = 2;
						if (Class44.method496(local25).anInt644 == this.anInt994) {
							this.anInt914 = 1;
						}
						if (Class44.method496(local25).anInt644 == this.anInt983) {
							this.anInt914 = 3;
						}
					}
					if (local30 == 486) {
						this.aClass6_Sub2_Sub3_8.method251(127);
						this.aClass6_Sub2_Sub3_8.method253(local25);
						this.aClass6_Sub2_Sub3_8.method288(local35);
						this.aClass6_Sub2_Sub3_8.method288(local20);
						this.anInt911 = 0;
						this.anInt912 = local25;
						this.anInt913 = local20;
						this.anInt914 = 2;
						if (Class44.method496(local25).anInt644 == this.anInt994) {
							this.anInt914 = 1;
						}
						if (Class44.method496(local25).anInt644 == this.anInt983) {
							this.anInt914 = 3;
						}
					}
					if (local30 == 990) {
						this.method725();
					}
					if (local30 == 347) {
						local1203 = this.aClass6_Sub2_Sub1_Sub1_Sub2Array1[local35];
						if (local1203 != null) {
							this.method719(0, 1, local1203.anIntArray183[0], 0, aClass6_Sub2_Sub1_Sub1_Sub2_1.anIntArray183[0], 1, local1203.anIntArray182[0], 0, false, 2, aClass6_Sub2_Sub1_Sub1_Sub2_1.anIntArray182[0]);
							this.anInt1070 = super.anInt839;
							this.anInt1071 = super.anInt840;
							this.anInt1073 = 2;
							this.anInt1072 = 0;
							this.aClass6_Sub2_Sub3_8.method251(237);
							this.aClass6_Sub2_Sub3_8.method286(local35);
							this.aClass6_Sub2_Sub3_8.method286(this.anInt1039);
						}
					}
					if (local30 == 159 || local30 == 444 || local30 == 641 || local30 == 387) {
						local704 = this.aStringArray13[arg0];
						local315 = local704.indexOf("@whi@");
						if (local315 != -1) {
							local1132 = Class39.method359(local704.substring(local315 + 5).trim());
							if (local30 == 159) {
								this.method683(local1132);
							}
							if (local30 == 444) {
								this.method680(local1132);
							}
							if (local30 == 641) {
								this.method604(local1132);
							}
							if (local30 == 387) {
								this.method668(local1132);
							}
						}
					}
					if (local30 == 866) {
						local213 = this.aClass6_Sub2_Sub1_Sub1_Sub1Array1[local35];
						if (local213 != null) {
							this.method719(0, 1, local213.anIntArray183[0], 0, aClass6_Sub2_Sub1_Sub1_Sub2_1.anIntArray183[0], 1, local213.anIntArray182[0], 0, false, 2, aClass6_Sub2_Sub1_Sub1_Sub2_1.anIntArray182[0]);
							this.anInt1070 = super.anInt839;
							this.anInt1071 = super.anInt840;
							this.anInt1073 = 2;
							this.anInt1072 = 0;
							this.aClass6_Sub2_Sub3_8.method251(94);
							this.aClass6_Sub2_Sub3_8.method253(local35);
						}
					}
					if (local30 == 651) {
						this.aClass6_Sub2_Sub3_8.method251(55);
						this.aClass6_Sub2_Sub3_8.method286(local20);
						this.aClass6_Sub2_Sub3_8.method253(local25);
						this.aClass6_Sub2_Sub3_8.method253(local35);
						this.anInt911 = 0;
						this.anInt912 = local25;
						this.anInt913 = local20;
						this.anInt914 = 2;
						if (Class44.method496(local25).anInt644 == this.anInt994) {
							this.anInt914 = 1;
						}
						if (Class44.method496(local25).anInt644 == this.anInt983) {
							this.anInt914 = 3;
						}
					}
					if (local30 == 675) {
						this.aClass6_Sub2_Sub3_8.method251(118);
						this.aClass6_Sub2_Sub3_8.method286(local25);
						this.aClass6_Sub2_Sub3_8.method287(local35);
						this.aClass6_Sub2_Sub3_8.method286(local20);
						this.anInt911 = 0;
						this.anInt912 = local25;
						this.anInt913 = local20;
						this.anInt914 = 2;
						if (Class44.method496(local25).anInt644 == this.anInt994) {
							this.anInt914 = 1;
						}
						if (Class44.method496(local25).anInt644 == this.anInt983) {
							this.anInt914 = 3;
						}
					}
					if (local30 == 600) {
						local1203 = this.aClass6_Sub2_Sub1_Sub1_Sub2Array1[local35];
						if (local1203 != null) {
							this.method719(0, 1, local1203.anIntArray183[0], 0, aClass6_Sub2_Sub1_Sub1_Sub2_1.anIntArray183[0], 1, local1203.anIntArray182[0], 0, false, 2, aClass6_Sub2_Sub1_Sub1_Sub2_1.anIntArray182[0]);
							this.anInt1070 = super.anInt839;
							this.anInt1071 = super.anInt840;
							this.anInt1073 = 2;
							this.anInt1072 = 0;
							this.aClass6_Sub2_Sub3_8.method251(177);
							this.aClass6_Sub2_Sub3_8.method287(this.anInt895);
							this.aClass6_Sub2_Sub3_8.method287(local35);
							this.aClass6_Sub2_Sub3_8.method286(this.anInt896);
							this.aClass6_Sub2_Sub3_8.method288(this.anInt897);
						}
					}
					if (local30 == 393) {
						this.aClass6_Sub2_Sub3_8.method251(85);
						this.aClass6_Sub2_Sub3_8.method287(local35);
						this.aClass6_Sub2_Sub3_8.method288(local20);
						this.aClass6_Sub2_Sub3_8.method287(local25);
						this.anInt911 = 0;
						this.anInt912 = local25;
						this.anInt913 = local20;
						this.anInt914 = 2;
						if (Class44.method496(local25).anInt644 == this.anInt994) {
							this.anInt914 = 1;
						}
						if (Class44.method496(local25).anInt644 == this.anInt983) {
							this.anInt914 = 3;
						}
					}
					@Pc(2248) String local2248;
					@Pc(2239) Class43 local2239;
					if (local30 == 1288) {
						local2239 = Class43.method464(local35);
						if (local2239.aByteArray12 == null) {
							local2248 = "It's a " + local2239.aString9 + ".";
						} else {
							local2248 = new String(local2239.aByteArray12);
						}
						this.method638("", 0, local2248);
					}
					if (local30 == 605) {
						this.aClass6_Sub2_Sub3_8.method251(150);
						this.aClass6_Sub2_Sub3_8.method288(local20);
						this.aClass6_Sub2_Sub3_8.method253(local35);
						this.aClass6_Sub2_Sub3_8.method287(local25);
						this.anInt911 = 0;
						this.anInt912 = local25;
						this.anInt913 = local20;
						this.anInt914 = 2;
						if (Class44.method496(local25).anInt644 == this.anInt994) {
							this.anInt914 = 1;
						}
						if (Class44.method496(local25).anInt644 == this.anInt983) {
							this.anInt914 = 3;
						}
					}
					if (local30 == 24) {
						local75 = this.method719(0, 0, local25, 0, aClass6_Sub2_Sub1_Sub1_Sub2_1.anIntArray183[0], 0, local20, 0, false, 2, aClass6_Sub2_Sub1_Sub1_Sub2_1.anIntArray182[0]);
						if (!local75) {
							this.method719(0, 1, local25, 0, aClass6_Sub2_Sub1_Sub1_Sub2_1.anIntArray183[0], 1, local20, 0, false, 2, aClass6_Sub2_Sub1_Sub1_Sub2_1.anIntArray182[0]);
						}
						this.anInt1070 = super.anInt839;
						this.anInt1071 = super.anInt840;
						this.anInt1073 = 2;
						this.anInt1072 = 0;
						this.aClass6_Sub2_Sub3_8.method251(12);
						this.aClass6_Sub2_Sub3_8.method253(local20 + this.anInt945);
						this.aClass6_Sub2_Sub3_8.method288(local25 + this.anInt946);
						this.aClass6_Sub2_Sub3_8.method287(local35);
					}
					if (local30 == 835) {
						this.aClass6_Sub2_Sub3_8.method251(51);
						this.aClass6_Sub2_Sub3_8.method286(local25);
						this.aClass6_Sub2_Sub3_8.method253(local20);
						this.aClass6_Sub2_Sub3_8.method253(this.anInt895);
						this.aClass6_Sub2_Sub3_8.method287(local35);
						this.aClass6_Sub2_Sub3_8.method286(this.anInt896);
						this.aClass6_Sub2_Sub3_8.method288(this.anInt897);
						this.anInt911 = 0;
						this.anInt912 = local25;
						this.anInt913 = local20;
						this.anInt914 = 2;
						if (Class44.method496(local25).anInt644 == this.anInt994) {
							this.anInt914 = 1;
						}
						if (Class44.method496(local25).anInt644 == this.anInt983) {
							this.anInt914 = 3;
						}
					}
					if (local30 == 308) {
						this.method697(local35, local20, local25);
						this.aClass6_Sub2_Sub3_8.method251(170);
						this.aClass6_Sub2_Sub3_8.method253(local25 + this.anInt946);
						this.aClass6_Sub2_Sub3_8.method253(local20 + this.anInt945);
						this.aClass6_Sub2_Sub3_8.method287(local35 >> 14 & 0x7FFF);
					}
					if (local30 == 9) {
						local1203 = this.aClass6_Sub2_Sub1_Sub1_Sub2Array1[local35];
						if (local1203 != null) {
							this.method719(0, 1, local1203.anIntArray183[0], 0, aClass6_Sub2_Sub1_Sub1_Sub2_1.anIntArray183[0], 1, local1203.anIntArray182[0], 0, false, 2, aClass6_Sub2_Sub1_Sub1_Sub2_1.anIntArray182[0]);
							this.anInt1070 = super.anInt839;
							this.anInt1071 = super.anInt840;
							this.anInt1073 = 2;
							this.anInt1072 = 0;
							this.aClass6_Sub2_Sub3_8.method251(59);
							this.aClass6_Sub2_Sub3_8.method253(local35);
						}
					}
					if (local30 == 762) {
						local75 = this.method719(0, 0, local25, 0, aClass6_Sub2_Sub1_Sub1_Sub2_1.anIntArray183[0], 0, local20, 0, false, 2, aClass6_Sub2_Sub1_Sub1_Sub2_1.anIntArray182[0]);
						if (!local75) {
							this.method719(0, 1, local25, 0, aClass6_Sub2_Sub1_Sub1_Sub2_1.anIntArray183[0], 1, local20, 0, false, 2, aClass6_Sub2_Sub1_Sub1_Sub2_1.anIntArray182[0]);
						}
						this.anInt1070 = super.anInt839;
						this.anInt1071 = super.anInt840;
						this.anInt1073 = 2;
						this.anInt1072 = 0;
						this.aClass6_Sub2_Sub3_8.method251(216);
						this.aClass6_Sub2_Sub3_8.method287(this.anInt897);
						this.aClass6_Sub2_Sub3_8.method286(this.anInt896);
						this.aClass6_Sub2_Sub3_8.method253(this.anInt895);
						this.aClass6_Sub2_Sub3_8.method288(local35);
						this.aClass6_Sub2_Sub3_8.method288(local20 + this.anInt945);
						this.aClass6_Sub2_Sub3_8.method288(local25 + this.anInt946);
					}
					if (local30 == 985) {
						local75 = this.method719(0, 0, local25, 0, aClass6_Sub2_Sub1_Sub1_Sub2_1.anIntArray183[0], 0, local20, 0, false, 2, aClass6_Sub2_Sub1_Sub1_Sub2_1.anIntArray182[0]);
						if (!local75) {
							this.method719(0, 1, local25, 0, aClass6_Sub2_Sub1_Sub1_Sub2_1.anIntArray183[0], 1, local20, 0, false, 2, aClass6_Sub2_Sub1_Sub1_Sub2_1.anIntArray182[0]);
						}
						this.anInt1070 = super.anInt839;
						this.anInt1071 = super.anInt840;
						this.anInt1073 = 2;
						this.anInt1072 = 0;
						this.aClass6_Sub2_Sub3_8.method251(159);
						this.aClass6_Sub2_Sub3_8.method287(local20 + this.anInt945);
						this.aClass6_Sub2_Sub3_8.method253(local25 + this.anInt946);
						this.aClass6_Sub2_Sub3_8.method287(local35);
						this.aClass6_Sub2_Sub3_8.method286(this.anInt1039);
					}
					if (local30 == 214 && this.method697(local35, local20, local25)) {
						this.aClass6_Sub2_Sub3_8.method251(188);
						this.aClass6_Sub2_Sub3_8.method288(this.anInt1039);
						this.aClass6_Sub2_Sub3_8.method287(local20 + this.anInt945);
						this.aClass6_Sub2_Sub3_8.method286(local35 >> 14 & 0x7FFF);
						this.aClass6_Sub2_Sub3_8.method288(local25 + this.anInt946);
					}
					if (local30 == 852) {
						local75 = this.method719(0, 0, local25, 0, aClass6_Sub2_Sub1_Sub1_Sub2_1.anIntArray183[0], 0, local20, 0, false, 2, aClass6_Sub2_Sub1_Sub1_Sub2_1.anIntArray182[0]);
						if (!local75) {
							this.method719(0, 1, local25, 0, aClass6_Sub2_Sub1_Sub1_Sub2_1.anIntArray183[0], 1, local20, 0, false, 2, aClass6_Sub2_Sub1_Sub1_Sub2_1.anIntArray182[0]);
						}
						this.anInt1070 = super.anInt839;
						this.anInt1071 = super.anInt840;
						this.anInt1073 = 2;
						this.anInt1072 = 0;
						this.aClass6_Sub2_Sub3_8.method251(4);
						this.aClass6_Sub2_Sub3_8.method287(local35);
						this.aClass6_Sub2_Sub3_8.method287(local20 + this.anInt945);
						this.aClass6_Sub2_Sub3_8.method288(local25 + this.anInt946);
					}
					if (local30 == 741) {
						local1203 = this.aClass6_Sub2_Sub1_Sub1_Sub2Array1[local35];
						if (local1203 != null) {
							this.method719(0, 1, local1203.anIntArray183[0], 0, aClass6_Sub2_Sub1_Sub1_Sub2_1.anIntArray183[0], 1, local1203.anIntArray182[0], 0, false, 2, aClass6_Sub2_Sub1_Sub1_Sub2_1.anIntArray182[0]);
							this.anInt1070 = super.anInt839;
							this.anInt1071 = super.anInt840;
							this.anInt1073 = 2;
							this.anInt1072 = 0;
							if ((local35 & 0x3) == 0) {
								anInt899++;
							}
							if (anInt899 >= 74) {
								this.aClass6_Sub2_Sub3_8.method251(203);
								this.aClass6_Sub2_Sub3_8.method252(232);
								anInt899 = 0;
							}
							this.aClass6_Sub2_Sub3_8.method251(6);
							this.aClass6_Sub2_Sub3_8.method253(local35);
						}
					}
					if (local30 == 432) {
						local213 = this.aClass6_Sub2_Sub1_Sub1_Sub1Array1[local35];
						if (local213 != null) {
							this.method719(0, 1, local213.anIntArray183[0], 0, aClass6_Sub2_Sub1_Sub1_Sub2_1.anIntArray183[0], 1, local213.anIntArray182[0], 0, false, 2, aClass6_Sub2_Sub1_Sub1_Sub2_1.anIntArray182[0]);
							this.anInt1070 = super.anInt839;
							this.anInt1071 = super.anInt840;
							this.anInt1073 = 2;
							this.anInt1072 = 0;
							this.aClass6_Sub2_Sub3_8.method251(87);
							this.aClass6_Sub2_Sub3_8.method287(local35);
						}
					}
					if (local30 == 490) {
						this.aClass6_Sub2_Sub3_8.method251(65);
						this.aClass6_Sub2_Sub3_8.method287(local20);
						this.aClass6_Sub2_Sub3_8.method287(local35);
						this.aClass6_Sub2_Sub3_8.method288(local25);
						this.anInt911 = 0;
						this.anInt912 = local25;
						this.anInt913 = local20;
						this.anInt914 = 2;
						if (Class44.method496(local25).anInt644 == this.anInt994) {
							this.anInt914 = 1;
						}
						if (Class44.method496(local25).anInt644 == this.anInt983) {
							this.anInt914 = 3;
						}
					}
					if (local30 == 711) {
						local1203 = this.aClass6_Sub2_Sub1_Sub1_Sub2Array1[local35];
						if (local1203 != null) {
							this.method719(0, 1, local1203.anIntArray183[0], 0, aClass6_Sub2_Sub1_Sub1_Sub2_1.anIntArray183[0], 1, local1203.anIntArray182[0], 0, false, 2, aClass6_Sub2_Sub1_Sub1_Sub2_1.anIntArray182[0]);
							this.anInt1070 = super.anInt839;
							this.anInt1071 = super.anInt840;
							this.anInt1073 = 2;
							this.anInt1072 = 0;
							this.aClass6_Sub2_Sub3_8.method251(16);
							this.aClass6_Sub2_Sub3_8.method253(local35);
						}
					}
					if (local30 == 1910) {
						local2239 = Class43.method464(local35);
						@Pc(3166) Class44 local3166 = Class44.method496(local25);
						if (local3166 != null && local3166.anIntArray179[local20] >= 100000) {
							local2248 = local3166.anIntArray179[local20] + " x " + local2239.aString9;
						} else if (local2239.aByteArray12 == null) {
							local2248 = "It's a " + local2239.aString9 + ".";
						} else {
							local2248 = new String(local2239.aByteArray12);
						}
						this.method638("", 0, local2248);
					}
					if (local30 == 149 && !this.aBoolean267) {
						this.aClass6_Sub2_Sub3_8.method251(214);
						this.aClass6_Sub2_Sub3_8.method253(local25);
						this.aBoolean267 = true;
					}
					if (local30 == 246) {
						local297 = Class44.method496(local25);
						this.anInt1038 = 1;
						this.anInt1039 = local25;
						this.anInt1040 = local297.anInt617;
						this.anInt894 = 0;
						this.aBoolean279 = true;
						local2248 = local297.aString13;
						if (local2248.indexOf(" ") != -1) {
							local2248 = local2248.substring(0, local2248.indexOf(" "));
						}
						local158 = local297.aString13;
						if (local158.indexOf(" ") != -1) {
							local158 = local158.substring(local158.indexOf(" ") + 1);
						}
						this.aString27 = local2248 + " " + local297.aString12 + " " + local158;
						if (this.anInt1040 == 16) {
							this.aBoolean279 = true;
							this.anInt861 = 3;
							this.aBoolean255 = true;
						}
					} else {
						if (local30 == 405) {
							this.method603(this.anInt1053);
							this.anInt1053 = -1;
							this.aBoolean282 = true;
						}
						if (local30 == 236) {
							anInt910++;
							if (anInt910 >= 146) {
								this.aClass6_Sub2_Sub3_8.method251(36);
								this.aClass6_Sub2_Sub3_8.method256(0);
								anInt910 = 0;
							}
							this.aClass6_Sub2_Sub3_8.method251(226);
							this.aClass6_Sub2_Sub3_8.method286(local35);
							this.aClass6_Sub2_Sub3_8.method288(local20);
							this.aClass6_Sub2_Sub3_8.method286(local25);
							this.anInt911 = 0;
							this.anInt912 = local25;
							this.anInt913 = local20;
							this.anInt914 = 2;
							if (Class44.method496(local25).anInt644 == this.anInt994) {
								this.anInt914 = 1;
							}
							if (Class44.method496(local25).anInt644 == this.anInt983) {
								this.anInt914 = 3;
							}
						}
						if (local30 == 1532) {
							local213 = this.aClass6_Sub2_Sub1_Sub1_Sub1Array1[local35];
							if (local213 != null) {
								@Pc(3419) Class2 local3419 = local213.aClass2_1;
								if (local3419.anIntArray1 != null) {
									local3419 = local3419.method5(this.anInt998);
								}
								if (local3419 != null) {
									if (local3419.aByteArray2 == null) {
										local158 = "It's a " + local3419.aString1 + ".";
									} else {
										local158 = new String(local3419.aByteArray2);
									}
									this.method638("", 0, local158);
								}
							}
						}
						this.anInt894 = 0;
						this.anInt1038 = 0;
						this.aBoolean279 = true;
					}
				}
			}
		} catch (@Pc(3468) RuntimeException local3468) {
			signlink.reporterror("52532, " + arg0 + ", " + 5 + ", " + local3468.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "k", descriptor = "(B)V")
	private void method723(@OriginalArg(0) byte arg0) {
		try {
			@Pc(6) boolean local6 = false;
			@Pc(26) int local26;
			for (@Pc(19) int local19 = 10; local19 < 117; local19++) {
				local26 = (int) (Math.random() * 100.0D);
				if (local26 < 50) {
					this.anIntArray263[local19 + 32512] = 255;
				}
			}
			@Pc(55) int local55;
			@Pc(62) int local62;
			@Pc(68) int local68;
			for (local26 = 0; local26 < 100; local26++) {
				local55 = (int) (Math.random() * 124.0D) + 2;
				local62 = (int) (Math.random() * 128.0D) + 128;
				local68 = local55 + (local62 << 7);
				this.anIntArray263[local68] = 192;
			}
			for (local55 = 1; local55 < 255; local55++) {
				for (local62 = 1; local62 < 127; local62++) {
					local68 = local62 + (local55 << 7);
					this.anIntArray264[local68] = (this.anIntArray263[local68 - 1] + this.anIntArray263[local68 + 1] + this.anIntArray263[local68 - 128] + this.anIntArray263[local68 + 128]) / 4;
				}
			}
			this.anInt937 += 128;
			if (this.anInt937 > this.anIntArray229.length) {
				this.anInt937 -= this.anIntArray229.length;
				local62 = (int) (Math.random() * 12.0D);
				this.method663(this.aClass6_Sub2_Sub2_Sub3Array2[local62], (byte) 8);
			}
			@Pc(180) int local180;
			for (local62 = 1; local62 < 255; local62++) {
				for (local68 = 1; local68 < 127; local68++) {
					local180 = local68 + (local62 << 7);
					@Pc(203) int local203 = this.anIntArray264[local180 + 128] - this.anIntArray229[local180 + this.anInt937 & this.anIntArray229.length - 1] / 5;
					if (local203 < 0) {
						local203 = 0;
					}
					this.anIntArray263[local180] = local203;
				}
			}
			for (local68 = 0; local68 < 255; local68++) {
				this.anIntArray276[local68] = this.anIntArray276[local68 + 1];
			}
			this.anIntArray276[255] = (int) (Math.sin((double) anInt1077 / 14.0D) * 16.0D + Math.sin((double) anInt1077 / 15.0D) * 14.0D + Math.sin((double) anInt1077 / 16.0D) * 12.0D);
			if (this.anInt967 > 0) {
				this.anInt967 -= 4;
			}
			if (this.anInt968 > 0) {
				this.anInt968 -= 4;
			}
			if (this.anInt967 == 0 && this.anInt968 == 0) {
				local180 = (int) (Math.random() * 2000.0D);
				if (local180 == 0) {
					this.anInt967 = 1024;
				}
				if (local180 == 1) {
					this.anInt968 = 1024;
					return;
				}
			}
		} catch (@Pc(314) RuntimeException local314) {
			signlink.reporterror("6872, " + arg0 + ", " + local314.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(ZI)V")
	private void method724(@OriginalArg(0) boolean arg0) {
		try {
			for (@Pc(8) int local8 = 0; local8 < this.anInt886; local8++) {
				@Pc(18) Class6_Sub2_Sub1_Sub1_Sub1 local18 = this.aClass6_Sub2_Sub1_Sub1_Sub1Array1[this.anIntArray222[local8]];
				@Pc(27) int local27 = (this.anIntArray222[local8] << 14) + 536870912;
				if (local18 != null && local18.method510() && local18.aClass2_1.aBoolean4 == arg0 && local18.aClass2_1.method6()) {
					@Pc(48) int local48 = local18.anInt699 >> 7;
					@Pc(53) int local53 = local18.anInt700 >> 7;
					if (local48 >= 0 && local48 < 104 && local53 >= 0 && local53 < 104) {
						if (local18.anInt685 == 1 && (local18.anInt699 & 0x7F) == 64 && (local18.anInt700 & 0x7F) == 64) {
							if (this.anIntArrayArray25[local48][local53] == this.anInt862) {
								continue;
							}
							this.anIntArrayArray25[local48][local53] = this.anInt862;
						}
						if (!local18.aClass2_1.aBoolean2) {
							local27 += Integer.MIN_VALUE;
						}
						this.aClass41_1.method413(local18, local18.anInt699, local27, this.method640(local18.anInt699, this.anInt1074, local18.anInt700), local18.anInt701, (local18.anInt685 - 1) * 64 + 60, local18.aBoolean206, this.anInt1074, local18.anInt700);
					}
				}
			}
		} catch (@Pc(145) RuntimeException local145) {
			signlink.reporterror("33724, " + arg0 + ", " + 7 + ", " + local145.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "q", descriptor = "(Z)V")
	private void method725() {
		try {
			this.aClass6_Sub2_Sub3_8.method251(116);
			if (this.anInt885 != -1) {
				this.method603(this.anInt885);
				this.anInt885 = -1;
				this.aBoolean279 = true;
				this.aBoolean267 = false;
				this.aBoolean255 = true;
			}
			if (this.anInt983 != -1) {
				this.method603(this.anInt983);
				this.anInt983 = -1;
				this.aBoolean282 = true;
				this.aBoolean267 = false;
			}
			if (this.anInt924 != -1) {
				this.method603(this.anInt924);
				this.anInt924 = -1;
				this.aBoolean243 = true;
			}
			if (this.anInt1009 != -1) {
				this.method603(this.anInt1009);
				this.anInt1009 = -1;
			}
			if (this.anInt994 != -1) {
				this.method603(this.anInt994);
				this.anInt994 = -1;
			}
		} catch (@Pc(92) RuntimeException local92) {
			signlink.reporterror("71353, " + false + ", " + local92.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "O", descriptor = "(I)V")
	private void method726() {
		try {
			if (this.anInt1079 != 0) {
				@Pc(6) Class6_Sub2_Sub2_Sub2 local6 = this.aClass6_Sub2_Sub2_Sub2_3;
				@Pc(8) int local8 = 0;
				if (this.anInt847 != 0) {
					local8 = 1;
				}
				for (@Pc(26) int local26 = 0; local26 < 100; local26++) {
					if (this.aStringArray9[local26] != null) {
						@Pc(38) int local38 = this.anIntArray212[local26];
						@Pc(43) String local43 = this.aStringArray8[local26];
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
						if ((local38 == 3 || local38 == 7) && (local38 == 7 || this.anInt887 == 0 || this.anInt887 == 1 && this.method715(local43))) {
							local96 = 329 - local8 * 13;
							local6.method384(0, "From", 4, local96, this.aByte41);
							local6.method384(65535, "From", 4, local96 - 1, this.aByte41);
							@Pc(123) int local123 = local6.method382("From ") + 4;
							if (local45 == 1) {
								this.aClass6_Sub2_Sub2_Sub3Array4[0].method488(local96 - 12, local123);
								local123 += 14;
							}
							if (local45 == 2) {
								this.aClass6_Sub2_Sub2_Sub3Array4[1].method488(local96 - 12, local123);
								local123 += 14;
							}
							local6.method384(0, local43 + ": " + this.aStringArray9[local26], local123, local96, this.aByte41);
							local6.method384(65535, local43 + ": " + this.aStringArray9[local26], local123, local96 - 1, this.aByte41);
							local8++;
							if (local8 >= 5) {
								return;
							}
						}
						if (local38 == 5 && this.anInt887 < 2) {
							local96 = 329 - local8 * 13;
							local6.method384(0, this.aStringArray9[local26], 4, local96, this.aByte41);
							local6.method384(65535, this.aStringArray9[local26], 4, local96 - 1, this.aByte41);
							local8++;
							if (local8 >= 5) {
								return;
							}
						}
						if (local38 == 6 && this.anInt887 < 2) {
							local96 = 329 - local8 * 13;
							local6.method384(0, "To " + local43 + ": " + this.aStringArray9[local26], 4, local96, this.aByte41);
							local6.method384(65535, "To " + local43 + ": " + this.aStringArray9[local26], 4, local96 - 1, this.aByte41);
							local8++;
							if (local8 >= 5) {
								return;
							}
						}
					}
				}
			}
		} catch (@Pc(308) RuntimeException local308) {
			signlink.reporterror("88064, " + 8 + ", " + local308.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "P", descriptor = "(I)V")
	private void method727() {
		try {
			if (this.anInt1018 == 2) {
				for (@Pc(24) Class6_Sub1 local24 = (Class6_Sub1) this.aClass13_10.method113(); local24 != null; local24 = (Class6_Sub1) this.aClass13_10.method115()) {
					if (local24.anInt40 > 0) {
						local24.anInt40--;
					}
					if (local24.anInt40 != 0) {
						if (local24.anInt36 > 0) {
							local24.anInt36--;
						}
						if (local24.anInt36 == 0 && local24.anInt34 >= 1 && local24.anInt35 >= 1 && local24.anInt34 <= 102 && local24.anInt35 <= 102 && (local24.anInt37 < 0 || Class27.method302(local24.anInt37, local24.anInt39))) {
							this.method712(local24.anInt35, local24.anInt38, local24.anInt39, local24.anInt33, local24.anInt34, local24.anInt37, local24.anInt32);
							local24.anInt36 = -1;
							if (local24.anInt37 == local24.anInt41 && local24.anInt41 == -1) {
								local24.method545();
							} else if (local24.anInt37 == local24.anInt41 && local24.anInt38 == local24.anInt42 && local24.anInt39 == local24.anInt43) {
								local24.method545();
							}
						}
					} else if (local24.anInt41 < 0 || Class27.method302(local24.anInt41, local24.anInt43)) {
						this.method712(local24.anInt35, local24.anInt42, local24.anInt43, local24.anInt33, local24.anInt34, local24.anInt41, local24.anInt32);
						local24.method545();
					}
				}
			}
		} catch (@Pc(167) RuntimeException local167) {
			signlink.reporterror("30696, " + 8 + ", " + local167.toString());
			throw new RuntimeException();
		}
	}
}
