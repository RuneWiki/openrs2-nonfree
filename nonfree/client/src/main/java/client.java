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

	@OriginalMember(owner = "client!client", name = "K", descriptor = "I")
	private static int anInt846;

	@OriginalMember(owner = "client!client", name = "mb", descriptor = "I")
	private static int anInt856;

	@OriginalMember(owner = "client!client", name = "Gb", descriptor = "Z")
	private static boolean aBoolean220;

	@OriginalMember(owner = "client!client", name = "Kb", descriptor = "I")
	private static int anInt868;

	@OriginalMember(owner = "client!client", name = "Lb", descriptor = "I")
	private static int anInt869;

	@OriginalMember(owner = "client!client", name = "Vb", descriptor = "I")
	public static int anInt875;

	@OriginalMember(owner = "client!client", name = "Xb", descriptor = "Z")
	private static boolean aBoolean223;

	@OriginalMember(owner = "client!client", name = "Ec", descriptor = "I")
	private static int anInt893;

	@OriginalMember(owner = "client!client", name = "Zc", descriptor = "I")
	private static int anInt896;

	@OriginalMember(owner = "client!client", name = "xd", descriptor = "Lclient!ZQANNJZE;")
	public static Class4_Sub1_Sub1_Sub2_Sub2 aClass4_Sub1_Sub1_Sub2_Sub2_1;

	@OriginalMember(owner = "client!client", name = "Gd", descriptor = "Z")
	private static boolean aBoolean232;

	@OriginalMember(owner = "client!client", name = "Rd", descriptor = "I")
	private static int anInt918;

	@OriginalMember(owner = "client!client", name = "ae", descriptor = "I")
	private static int anInt919;

	@OriginalMember(owner = "client!client", name = "ee", descriptor = "I")
	private static int anInt923;

	@OriginalMember(owner = "client!client", name = "le", descriptor = "I")
	private static int anInt926;

	@OriginalMember(owner = "client!client", name = "Ne", descriptor = "I")
	private static int anInt934;

	@OriginalMember(owner = "client!client", name = "ag", descriptor = "I")
	private static int anInt963;

	@OriginalMember(owner = "client!client", name = "eg", descriptor = "I")
	private static int anInt966;

	@OriginalMember(owner = "client!client", name = "ng", descriptor = "I")
	private static int anInt971;

	@OriginalMember(owner = "client!client", name = "zg", descriptor = "I")
	private static int anInt976;

	@OriginalMember(owner = "client!client", name = "Bg", descriptor = "I")
	private static int anInt977;

	@OriginalMember(owner = "client!client", name = "lh", descriptor = "Z")
	private static boolean aBoolean252;

	@OriginalMember(owner = "client!client", name = "Ti", descriptor = "I")
	private static int anInt1033;

	@OriginalMember(owner = "client!client", name = "Ui", descriptor = "I")
	private static int anInt1034;

	@OriginalMember(owner = "client!client", name = "Wi", descriptor = "I")
	private static int anInt1035;

	@OriginalMember(owner = "client!client", name = "Fj", descriptor = "I")
	public static int anInt1054;

	@OriginalMember(owner = "client!client", name = "Ij", descriptor = "Z")
	private static boolean aBoolean268;

	@OriginalMember(owner = "client!client", name = "R", descriptor = "Ljava/math/BigInteger;")
	private static BigInteger aBigInteger1 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");

	@OriginalMember(owner = "client!client", name = "Hb", descriptor = "I")
	private static int anInt867 = 46093;

	@OriginalMember(owner = "client!client", name = "Ib", descriptor = "[I")
	private static int[] anIntArray216 = new int[99];

	@OriginalMember(owner = "client!client", name = "Ub", descriptor = "I")
	private static int anInt874;

	@OriginalMember(owner = "client!client", name = "Wb", descriptor = "Z")
	private static boolean aBoolean222;

	@OriginalMember(owner = "client!client", name = "bc", descriptor = "I")
	private static int anInt877;

	@OriginalMember(owner = "client!client", name = "Hc", descriptor = "Ljava/math/BigInteger;")
	private static BigInteger aBigInteger2;

	@OriginalMember(owner = "client!client", name = "hd", descriptor = "Ljava/lang/String;")
	private static String aString22;

	@OriginalMember(owner = "client!client", name = "wd", descriptor = "I")
	private static int anInt909;

	@OriginalMember(owner = "client!client", name = "Od", descriptor = "I")
	private static int anInt916;

	@OriginalMember(owner = "client!client", name = "Qd", descriptor = "[I")
	public static int[] anIntArray223;

	@OriginalMember(owner = "client!client", name = "Td", descriptor = "Z")
	private static boolean aBoolean233;

	@OriginalMember(owner = "client!client", name = "Og", descriptor = "[[I")
	public static final int[][] anIntArrayArray23;

	@OriginalMember(owner = "client!client", name = "ah", descriptor = "B")
	private static byte aByte32;

	@OriginalMember(owner = "client!client", name = "Jj", descriptor = "[I")
	public static final int[] anIntArray271;

	@OriginalMember(owner = "client!client", name = "J", descriptor = "Lclient!HHMTQDYM;")
	private Class15 aClass15_1;

	@OriginalMember(owner = "client!client", name = "L", descriptor = "I")
	private int anInt847;

	@OriginalMember(owner = "client!client", name = "M", descriptor = "I")
	private int anInt848;

	@OriginalMember(owner = "client!client", name = "T", descriptor = "Lclient!TTWFVYGB;")
	private Class4_Sub1_Sub2_Sub3 aClass4_Sub1_Sub2_Sub3_3;

	@OriginalMember(owner = "client!client", name = "U", descriptor = "Lclient!TTWFVYGB;")
	private Class4_Sub1_Sub2_Sub3 aClass4_Sub1_Sub2_Sub3_4;

	@OriginalMember(owner = "client!client", name = "V", descriptor = "Lclient!TTWFVYGB;")
	private Class4_Sub1_Sub2_Sub3 aClass4_Sub1_Sub2_Sub3_5;

	@OriginalMember(owner = "client!client", name = "W", descriptor = "Lclient!TTWFVYGB;")
	private Class4_Sub1_Sub2_Sub3 aClass4_Sub1_Sub2_Sub3_6;

	@OriginalMember(owner = "client!client", name = "X", descriptor = "Lclient!TTWFVYGB;")
	private Class4_Sub1_Sub2_Sub3 aClass4_Sub1_Sub2_Sub3_7;

	@OriginalMember(owner = "client!client", name = "Y", descriptor = "I")
	private int anInt849;

	@OriginalMember(owner = "client!client", name = "Z", descriptor = "I")
	private int anInt850;

	@OriginalMember(owner = "client!client", name = "ab", descriptor = "Lclient!KWBPZBYX;")
	private Class4_Sub1_Sub2_Sub2 aClass4_Sub1_Sub2_Sub2_1;

	@OriginalMember(owner = "client!client", name = "bb", descriptor = "Lclient!KWBPZBYX;")
	private Class4_Sub1_Sub2_Sub2 aClass4_Sub1_Sub2_Sub2_2;

	@OriginalMember(owner = "client!client", name = "cb", descriptor = "Lclient!KWBPZBYX;")
	private Class4_Sub1_Sub2_Sub2 aClass4_Sub1_Sub2_Sub2_3;

	@OriginalMember(owner = "client!client", name = "db", descriptor = "Lclient!KWBPZBYX;")
	private Class4_Sub1_Sub2_Sub2 aClass4_Sub1_Sub2_Sub2_4;

	@OriginalMember(owner = "client!client", name = "eb", descriptor = "Lclient!KWBPZBYX;")
	private Class4_Sub1_Sub2_Sub2 aClass4_Sub1_Sub2_Sub2_5;

	@OriginalMember(owner = "client!client", name = "fb", descriptor = "I")
	private int anInt851;

	@OriginalMember(owner = "client!client", name = "gb", descriptor = "I")
	private int anInt852;

	@OriginalMember(owner = "client!client", name = "hb", descriptor = "I")
	private int anInt853;

	@OriginalMember(owner = "client!client", name = "ib", descriptor = "I")
	private int anInt854;

	@OriginalMember(owner = "client!client", name = "lb", descriptor = "I")
	private int anInt855;

	@OriginalMember(owner = "client!client", name = "nb", descriptor = "J")
	private long aLong29;

	@OriginalMember(owner = "client!client", name = "pb", descriptor = "I")
	private int anInt857;

	@OriginalMember(owner = "client!client", name = "rb", descriptor = "I")
	private int anInt858;

	@OriginalMember(owner = "client!client", name = "sb", descriptor = "I")
	private int anInt859;

	@OriginalMember(owner = "client!client", name = "tb", descriptor = "I")
	private int anInt860;

	@OriginalMember(owner = "client!client", name = "ub", descriptor = "I")
	private int anInt861;

	@OriginalMember(owner = "client!client", name = "vb", descriptor = "I")
	private int anInt862;

	@OriginalMember(owner = "client!client", name = "wb", descriptor = "I")
	private int anInt863;

	@OriginalMember(owner = "client!client", name = "yb", descriptor = "Lclient!QDHHNYHL;")
	private Class32 aClass32_2;

	@OriginalMember(owner = "client!client", name = "Cb", descriptor = "J")
	private long aLong30;

	@OriginalMember(owner = "client!client", name = "Db", descriptor = "I")
	private int anInt865;

	@OriginalMember(owner = "client!client", name = "Eb", descriptor = "I")
	private int anInt866;

	@OriginalMember(owner = "client!client", name = "Fb", descriptor = "Lclient!TTWFVYGB;")
	private Class4_Sub1_Sub2_Sub3 aClass4_Sub1_Sub2_Sub3_8;

	@OriginalMember(owner = "client!client", name = "Nb", descriptor = "I")
	private int anInt871;

	@OriginalMember(owner = "client!client", name = "Ob", descriptor = "I")
	private int anInt872;

	@OriginalMember(owner = "client!client", name = "Pb", descriptor = "I")
	private int anInt873;

	@OriginalMember(owner = "client!client", name = "Tb", descriptor = "Lclient!DGAWSPEW;")
	private Class8_Sub1 aClass8_Sub1_1;

	@OriginalMember(owner = "client!client", name = "ec", descriptor = "I")
	private int anInt879;

	@OriginalMember(owner = "client!client", name = "fc", descriptor = "I")
	private int anInt880;

	@OriginalMember(owner = "client!client", name = "gc", descriptor = "I")
	private int anInt881;

	@OriginalMember(owner = "client!client", name = "hc", descriptor = "I")
	private int anInt882;

	@OriginalMember(owner = "client!client", name = "ic", descriptor = "Lclient!BDQVRRZB;")
	private Class3 aClass3_2;

	@OriginalMember(owner = "client!client", name = "kc", descriptor = "[I")
	private int[] anIntArray218;

	@OriginalMember(owner = "client!client", name = "lc", descriptor = "[I")
	private int[] anIntArray219;

	@OriginalMember(owner = "client!client", name = "oc", descriptor = "[[B")
	private byte[][] aByteArrayArray5;

	@OriginalMember(owner = "client!client", name = "qc", descriptor = "Lclient!TTWFVYGB;")
	private Class4_Sub1_Sub2_Sub3 aClass4_Sub1_Sub2_Sub3_9;

	@OriginalMember(owner = "client!client", name = "wc", descriptor = "I")
	private int anInt886;

	@OriginalMember(owner = "client!client", name = "yc", descriptor = "I")
	private int anInt887;

	@OriginalMember(owner = "client!client", name = "zc", descriptor = "I")
	private int anInt888;

	@OriginalMember(owner = "client!client", name = "Ac", descriptor = "I")
	private int anInt889;

	@OriginalMember(owner = "client!client", name = "Bc", descriptor = "I")
	private int anInt890;

	@OriginalMember(owner = "client!client", name = "Cc", descriptor = "I")
	private int anInt891;

	@OriginalMember(owner = "client!client", name = "Dc", descriptor = "I")
	private int anInt892;

	@OriginalMember(owner = "client!client", name = "Fc", descriptor = "I")
	private int anInt894;

	@OriginalMember(owner = "client!client", name = "Ic", descriptor = "Lclient!XUAWPLCH;")
	private Class4_Sub1_Sub2_Sub4 aClass4_Sub1_Sub2_Sub4_2;

	@OriginalMember(owner = "client!client", name = "Jc", descriptor = "Lclient!XUAWPLCH;")
	private Class4_Sub1_Sub2_Sub4 aClass4_Sub1_Sub2_Sub4_3;

	@OriginalMember(owner = "client!client", name = "Kc", descriptor = "Lclient!XUAWPLCH;")
	private Class4_Sub1_Sub2_Sub4 aClass4_Sub1_Sub2_Sub4_4;

	@OriginalMember(owner = "client!client", name = "Lc", descriptor = "Lclient!XUAWPLCH;")
	private Class4_Sub1_Sub2_Sub4 aClass4_Sub1_Sub2_Sub4_5;

	@OriginalMember(owner = "client!client", name = "Nc", descriptor = "Lclient!MVSFNVJP;")
	private Class25 aClass25_3;

	@OriginalMember(owner = "client!client", name = "Oc", descriptor = "Lclient!MVSFNVJP;")
	private Class25 aClass25_4;

	@OriginalMember(owner = "client!client", name = "Pc", descriptor = "Lclient!MVSFNVJP;")
	private Class25 aClass25_5;

	@OriginalMember(owner = "client!client", name = "Qc", descriptor = "Lclient!MVSFNVJP;")
	private Class25 aClass25_6;

	@OriginalMember(owner = "client!client", name = "Rc", descriptor = "Lclient!MVSFNVJP;")
	private Class25 aClass25_7;

	@OriginalMember(owner = "client!client", name = "Sc", descriptor = "Lclient!MVSFNVJP;")
	private Class25 aClass25_8;

	@OriginalMember(owner = "client!client", name = "Tc", descriptor = "Lclient!MVSFNVJP;")
	private Class25 aClass25_9;

	@OriginalMember(owner = "client!client", name = "Uc", descriptor = "Lclient!MVSFNVJP;")
	private Class25 aClass25_10;

	@OriginalMember(owner = "client!client", name = "Vc", descriptor = "Lclient!MVSFNVJP;")
	private Class25 aClass25_11;

	@OriginalMember(owner = "client!client", name = "Wc", descriptor = "I")
	private int anInt895;

	@OriginalMember(owner = "client!client", name = "bd", descriptor = "I")
	private int anInt897;

	@OriginalMember(owner = "client!client", name = "cd", descriptor = "I")
	private int anInt898;

	@OriginalMember(owner = "client!client", name = "dd", descriptor = "I")
	private int anInt899;

	@OriginalMember(owner = "client!client", name = "ed", descriptor = "I")
	private int anInt900;

	@OriginalMember(owner = "client!client", name = "fd", descriptor = "I")
	private int anInt901;

	@OriginalMember(owner = "client!client", name = "md", descriptor = "Lclient!YMDQNWFI;")
	private Class46 aClass46_1;

	@OriginalMember(owner = "client!client", name = "nd", descriptor = "[[B")
	private byte[][] aByteArrayArray6;

	@OriginalMember(owner = "client!client", name = "od", descriptor = "I")
	private int anInt903;

	@OriginalMember(owner = "client!client", name = "pd", descriptor = "I")
	private int anInt904;

	@OriginalMember(owner = "client!client", name = "qd", descriptor = "I")
	private int anInt905;

	@OriginalMember(owner = "client!client", name = "yd", descriptor = "Lclient!TTWFVYGB;")
	private Class4_Sub1_Sub2_Sub3 aClass4_Sub1_Sub2_Sub3_10;

	@OriginalMember(owner = "client!client", name = "zd", descriptor = "Lclient!TTWFVYGB;")
	private Class4_Sub1_Sub2_Sub3 aClass4_Sub1_Sub2_Sub3_11;

	@OriginalMember(owner = "client!client", name = "Bd", descriptor = "J")
	private long aLong31;

	@OriginalMember(owner = "client!client", name = "Cd", descriptor = "I")
	private int anInt910;

	@OriginalMember(owner = "client!client", name = "Dd", descriptor = "I")
	private int anInt911;

	@OriginalMember(owner = "client!client", name = "Jd", descriptor = "Lclient!KWBPZBYX;")
	private Class4_Sub1_Sub2_Sub2 aClass4_Sub1_Sub2_Sub2_6;

	@OriginalMember(owner = "client!client", name = "Kd", descriptor = "Lclient!KWBPZBYX;")
	private Class4_Sub1_Sub2_Sub2 aClass4_Sub1_Sub2_Sub2_7;

	@OriginalMember(owner = "client!client", name = "Md", descriptor = "I")
	private int anInt914;

	@OriginalMember(owner = "client!client", name = "Pd", descriptor = "I")
	private int anInt917;

	@OriginalMember(owner = "client!client", name = "Vd", descriptor = "Lclient!KWBPZBYX;")
	private Class4_Sub1_Sub2_Sub2 aClass4_Sub1_Sub2_Sub2_8;

	@OriginalMember(owner = "client!client", name = "Wd", descriptor = "Lclient!KWBPZBYX;")
	private Class4_Sub1_Sub2_Sub2 aClass4_Sub1_Sub2_Sub2_9;

	@OriginalMember(owner = "client!client", name = "Xd", descriptor = "Lclient!KWBPZBYX;")
	private Class4_Sub1_Sub2_Sub2 aClass4_Sub1_Sub2_Sub2_10;

	@OriginalMember(owner = "client!client", name = "Yd", descriptor = "Lclient!KWBPZBYX;")
	private Class4_Sub1_Sub2_Sub2 aClass4_Sub1_Sub2_Sub2_11;

	@OriginalMember(owner = "client!client", name = "Zd", descriptor = "Lclient!KWBPZBYX;")
	private Class4_Sub1_Sub2_Sub2 aClass4_Sub1_Sub2_Sub2_12;

	@OriginalMember(owner = "client!client", name = "be", descriptor = "I")
	private int anInt920;

	@OriginalMember(owner = "client!client", name = "ce", descriptor = "I")
	private int anInt921;

	@OriginalMember(owner = "client!client", name = "de", descriptor = "I")
	private int anInt922;

	@OriginalMember(owner = "client!client", name = "fe", descriptor = "J")
	private long aLong32;

	@OriginalMember(owner = "client!client", name = "ge", descriptor = "I")
	private int anInt924;

	@OriginalMember(owner = "client!client", name = "he", descriptor = "I")
	private int anInt925;

	@OriginalMember(owner = "client!client", name = "ke", descriptor = "Lclient!KFVPSSJH;")
	private Class20 aClass20_1;

	@OriginalMember(owner = "client!client", name = "me", descriptor = "I")
	private int anInt927;

	@OriginalMember(owner = "client!client", name = "we", descriptor = "Lclient!KWBPZBYX;")
	private Class4_Sub1_Sub2_Sub2 aClass4_Sub1_Sub2_Sub2_13;

	@OriginalMember(owner = "client!client", name = "xe", descriptor = "Lclient!KWBPZBYX;")
	private Class4_Sub1_Sub2_Sub2 aClass4_Sub1_Sub2_Sub2_14;

	@OriginalMember(owner = "client!client", name = "ye", descriptor = "Lclient!KWBPZBYX;")
	private Class4_Sub1_Sub2_Sub2 aClass4_Sub1_Sub2_Sub2_15;

	@OriginalMember(owner = "client!client", name = "ze", descriptor = "Lclient!MVSFNVJP;")
	private Class25 aClass25_12;

	@OriginalMember(owner = "client!client", name = "Ae", descriptor = "Lclient!MVSFNVJP;")
	private Class25 aClass25_13;

	@OriginalMember(owner = "client!client", name = "Be", descriptor = "Lclient!MVSFNVJP;")
	private Class25 aClass25_14;

	@OriginalMember(owner = "client!client", name = "Ce", descriptor = "Lclient!MVSFNVJP;")
	private Class25 aClass25_15;

	@OriginalMember(owner = "client!client", name = "De", descriptor = "Lclient!MVSFNVJP;")
	private Class25 aClass25_16;

	@OriginalMember(owner = "client!client", name = "Ee", descriptor = "Lclient!MVSFNVJP;")
	private Class25 aClass25_17;

	@OriginalMember(owner = "client!client", name = "Fe", descriptor = "Lclient!MVSFNVJP;")
	private Class25 aClass25_18;

	@OriginalMember(owner = "client!client", name = "Ge", descriptor = "Lclient!MVSFNVJP;")
	private Class25 aClass25_19;

	@OriginalMember(owner = "client!client", name = "He", descriptor = "Lclient!MVSFNVJP;")
	private Class25 aClass25_20;

	@OriginalMember(owner = "client!client", name = "Ie", descriptor = "I")
	private int anInt929;

	@OriginalMember(owner = "client!client", name = "Je", descriptor = "I")
	private int anInt930;

	@OriginalMember(owner = "client!client", name = "Ke", descriptor = "I")
	private int anInt931;

	@OriginalMember(owner = "client!client", name = "Le", descriptor = "I")
	private int anInt932;

	@OriginalMember(owner = "client!client", name = "Me", descriptor = "I")
	private int anInt933;

	@OriginalMember(owner = "client!client", name = "Oe", descriptor = "I")
	private int anInt935;

	@OriginalMember(owner = "client!client", name = "Pe", descriptor = "I")
	private int anInt936;

	@OriginalMember(owner = "client!client", name = "Te", descriptor = "I")
	private int anInt937;

	@OriginalMember(owner = "client!client", name = "Ve", descriptor = "I")
	private int anInt938;

	@OriginalMember(owner = "client!client", name = "Ye", descriptor = "I")
	private int anInt939;

	@OriginalMember(owner = "client!client", name = "cf", descriptor = "I")
	private int anInt940;

	@OriginalMember(owner = "client!client", name = "df", descriptor = "I")
	private int anInt941;

	@OriginalMember(owner = "client!client", name = "ef", descriptor = "I")
	private int anInt942;

	@OriginalMember(owner = "client!client", name = "ff", descriptor = "I")
	private int anInt943;

	@OriginalMember(owner = "client!client", name = "mf", descriptor = "I")
	private int anInt944;

	@OriginalMember(owner = "client!client", name = "pf", descriptor = "[I")
	private int[] anIntArray237;

	@OriginalMember(owner = "client!client", name = "qf", descriptor = "[I")
	private int[] anIntArray238;

	@OriginalMember(owner = "client!client", name = "rf", descriptor = "[I")
	private int[] anIntArray239;

	@OriginalMember(owner = "client!client", name = "vf", descriptor = "I")
	private int anInt946;

	@OriginalMember(owner = "client!client", name = "zf", descriptor = "I")
	private int anInt949;

	@OriginalMember(owner = "client!client", name = "Bf", descriptor = "I")
	private int anInt950;

	@OriginalMember(owner = "client!client", name = "Ef", descriptor = "Ljava/lang/String;")
	private String aString24;

	@OriginalMember(owner = "client!client", name = "If", descriptor = "I")
	private int anInt952;

	@OriginalMember(owner = "client!client", name = "Jf", descriptor = "I")
	private int anInt953;

	@OriginalMember(owner = "client!client", name = "Kf", descriptor = "I")
	private int anInt954;

	@OriginalMember(owner = "client!client", name = "Mf", descriptor = "I")
	private int anInt956;

	@OriginalMember(owner = "client!client", name = "Pf", descriptor = "I")
	private int anInt957;

	@OriginalMember(owner = "client!client", name = "Qf", descriptor = "I")
	private int anInt958;

	@OriginalMember(owner = "client!client", name = "Sf", descriptor = "I")
	private int anInt959;

	@OriginalMember(owner = "client!client", name = "Tf", descriptor = "I")
	private int anInt960;

	@OriginalMember(owner = "client!client", name = "Vf", descriptor = "I")
	private int anInt961;

	@OriginalMember(owner = "client!client", name = "cg", descriptor = "I")
	private int anInt964;

	@OriginalMember(owner = "client!client", name = "dg", descriptor = "I")
	private int anInt965;

	@OriginalMember(owner = "client!client", name = "hg", descriptor = "[I")
	private int[] anIntArray247;

	@OriginalMember(owner = "client!client", name = "ig", descriptor = "[I")
	private int[] anIntArray248;

	@OriginalMember(owner = "client!client", name = "mg", descriptor = "I")
	private int anInt970;

	@OriginalMember(owner = "client!client", name = "pg", descriptor = "Lclient!MVSFNVJP;")
	private Class25 aClass25_21;

	@OriginalMember(owner = "client!client", name = "qg", descriptor = "Lclient!MVSFNVJP;")
	private Class25 aClass25_22;

	@OriginalMember(owner = "client!client", name = "rg", descriptor = "Lclient!MVSFNVJP;")
	private Class25 aClass25_23;

	@OriginalMember(owner = "client!client", name = "sg", descriptor = "Lclient!MVSFNVJP;")
	private Class25 aClass25_24;

	@OriginalMember(owner = "client!client", name = "tg", descriptor = "I")
	private int anInt973;

	@OriginalMember(owner = "client!client", name = "wg", descriptor = "I")
	private int anInt975;

	@OriginalMember(owner = "client!client", name = "Ag", descriptor = "[Lclient!KWBPZBYX;")
	private Class4_Sub1_Sub2_Sub2[] aClass4_Sub1_Sub2_Sub2Array4;

	@OriginalMember(owner = "client!client", name = "Cg", descriptor = "I")
	private int anInt978;

	@OriginalMember(owner = "client!client", name = "Dg", descriptor = "I")
	private int anInt979;

	@OriginalMember(owner = "client!client", name = "Eg", descriptor = "I")
	private int anInt980;

	@OriginalMember(owner = "client!client", name = "Fg", descriptor = "I")
	private int anInt981;

	@OriginalMember(owner = "client!client", name = "Gg", descriptor = "I")
	private int anInt982;

	@OriginalMember(owner = "client!client", name = "Hg", descriptor = "I")
	private int anInt983;

	@OriginalMember(owner = "client!client", name = "Kg", descriptor = "I")
	private int anInt985;

	@OriginalMember(owner = "client!client", name = "Mg", descriptor = "I")
	private int anInt987;

	@OriginalMember(owner = "client!client", name = "Tg", descriptor = "I")
	private int anInt989;

	@OriginalMember(owner = "client!client", name = "Ug", descriptor = "I")
	private int anInt990;

	@OriginalMember(owner = "client!client", name = "Vg", descriptor = "I")
	private int anInt991;

	@OriginalMember(owner = "client!client", name = "Wg", descriptor = "I")
	private int anInt992;

	@OriginalMember(owner = "client!client", name = "bh", descriptor = "I")
	private int anInt993;

	@OriginalMember(owner = "client!client", name = "hh", descriptor = "I")
	private int anInt996;

	@OriginalMember(owner = "client!client", name = "jh", descriptor = "I")
	private int anInt998;

	@OriginalMember(owner = "client!client", name = "mh", descriptor = "Ljava/lang/String;")
	private String aString28;

	@OriginalMember(owner = "client!client", name = "oh", descriptor = "I")
	private int anInt1000;

	@OriginalMember(owner = "client!client", name = "rh", descriptor = "I")
	private int anInt1002;

	@OriginalMember(owner = "client!client", name = "sh", descriptor = "I")
	private int anInt1003;

	@OriginalMember(owner = "client!client", name = "wh", descriptor = "I")
	private int anInt1004;

	@OriginalMember(owner = "client!client", name = "xh", descriptor = "I")
	private int anInt1005;

	@OriginalMember(owner = "client!client", name = "yh", descriptor = "I")
	private int anInt1006;

	@OriginalMember(owner = "client!client", name = "zh", descriptor = "I")
	private int anInt1007;

	@OriginalMember(owner = "client!client", name = "Ah", descriptor = "I")
	private int anInt1008;

	@OriginalMember(owner = "client!client", name = "Bh", descriptor = "I")
	private int anInt1009;

	@OriginalMember(owner = "client!client", name = "Dh", descriptor = "Lclient!TTWFVYGB;")
	private Class4_Sub1_Sub2_Sub3 aClass4_Sub1_Sub2_Sub3_12;

	@OriginalMember(owner = "client!client", name = "Eh", descriptor = "Lclient!TTWFVYGB;")
	private Class4_Sub1_Sub2_Sub3 aClass4_Sub1_Sub2_Sub3_13;

	@OriginalMember(owner = "client!client", name = "Lh", descriptor = "Lclient!TTWFVYGB;")
	private Class4_Sub1_Sub2_Sub3 aClass4_Sub1_Sub2_Sub3_14;

	@OriginalMember(owner = "client!client", name = "Mh", descriptor = "Lclient!TTWFVYGB;")
	private Class4_Sub1_Sub2_Sub3 aClass4_Sub1_Sub2_Sub3_15;

	@OriginalMember(owner = "client!client", name = "Nh", descriptor = "I")
	private int anInt1012;

	@OriginalMember(owner = "client!client", name = "Sh", descriptor = "I")
	private int anInt1013;

	@OriginalMember(owner = "client!client", name = "ai", descriptor = "Lclient!MVSFNVJP;")
	private Class25 aClass25_25;

	@OriginalMember(owner = "client!client", name = "bi", descriptor = "Lclient!MVSFNVJP;")
	private Class25 aClass25_26;

	@OriginalMember(owner = "client!client", name = "ci", descriptor = "Lclient!MVSFNVJP;")
	private Class25 aClass25_27;

	@OriginalMember(owner = "client!client", name = "ni", descriptor = "I")
	private int anInt1018;

	@OriginalMember(owner = "client!client", name = "oi", descriptor = "I")
	private int anInt1019;

	@OriginalMember(owner = "client!client", name = "pi", descriptor = "I")
	private int anInt1020;

	@OriginalMember(owner = "client!client", name = "qi", descriptor = "I")
	private int anInt1021;

	@OriginalMember(owner = "client!client", name = "ri", descriptor = "I")
	private int anInt1022;

	@OriginalMember(owner = "client!client", name = "si", descriptor = "I")
	private int anInt1023;

	@OriginalMember(owner = "client!client", name = "ti", descriptor = "I")
	private int anInt1024;

	@OriginalMember(owner = "client!client", name = "ui", descriptor = "Ljava/lang/String;")
	private String aString29;

	@OriginalMember(owner = "client!client", name = "vi", descriptor = "I")
	private int anInt1025;

	@OriginalMember(owner = "client!client", name = "wi", descriptor = "I")
	private int anInt1026;

	@OriginalMember(owner = "client!client", name = "xi", descriptor = "I")
	private int anInt1027;

	@OriginalMember(owner = "client!client", name = "yi", descriptor = "Lclient!KWBPZBYX;")
	private Class4_Sub1_Sub2_Sub2 aClass4_Sub1_Sub2_Sub2_16;

	@OriginalMember(owner = "client!client", name = "zi", descriptor = "Lclient!KWBPZBYX;")
	private Class4_Sub1_Sub2_Sub2 aClass4_Sub1_Sub2_Sub2_17;

	@OriginalMember(owner = "client!client", name = "Bi", descriptor = "[I")
	private int[] anIntArray262;

	@OriginalMember(owner = "client!client", name = "Ci", descriptor = "[I")
	private int[] anIntArray263;

	@OriginalMember(owner = "client!client", name = "Di", descriptor = "[I")
	private int[] anIntArray264;

	@OriginalMember(owner = "client!client", name = "Ei", descriptor = "[I")
	private int[] anIntArray265;

	@OriginalMember(owner = "client!client", name = "Ji", descriptor = "I")
	private int anInt1029;

	@OriginalMember(owner = "client!client", name = "Mi", descriptor = "Ljava/net/Socket;")
	private Socket aSocket3;

	@OriginalMember(owner = "client!client", name = "Ni", descriptor = "I")
	private int anInt1031;

	@OriginalMember(owner = "client!client", name = "Ri", descriptor = "J")
	private long aLong33;

	@OriginalMember(owner = "client!client", name = "Xi", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray8;

	@OriginalMember(owner = "client!client", name = "Zi", descriptor = "I")
	private int anInt1036;

	@OriginalMember(owner = "client!client", name = "cj", descriptor = "I")
	private int anInt1038;

	@OriginalMember(owner = "client!client", name = "dj", descriptor = "I")
	private int anInt1039;

	@OriginalMember(owner = "client!client", name = "ej", descriptor = "I")
	private int anInt1040;

	@OriginalMember(owner = "client!client", name = "fj", descriptor = "I")
	private int anInt1041;

	@OriginalMember(owner = "client!client", name = "gj", descriptor = "I")
	private int anInt1042;

	@OriginalMember(owner = "client!client", name = "kj", descriptor = "Lclient!TTWFVYGB;")
	private Class4_Sub1_Sub2_Sub3 aClass4_Sub1_Sub2_Sub3_16;

	@OriginalMember(owner = "client!client", name = "lj", descriptor = "Lclient!TTWFVYGB;")
	private Class4_Sub1_Sub2_Sub3 aClass4_Sub1_Sub2_Sub3_17;

	@OriginalMember(owner = "client!client", name = "oj", descriptor = "I")
	private int anInt1043;

	@OriginalMember(owner = "client!client", name = "qj", descriptor = "Lclient!KWBPZBYX;")
	private Class4_Sub1_Sub2_Sub2 aClass4_Sub1_Sub2_Sub2_18;

	@OriginalMember(owner = "client!client", name = "rj", descriptor = "Lclient!KWBPZBYX;")
	private Class4_Sub1_Sub2_Sub2 aClass4_Sub1_Sub2_Sub2_19;

	@OriginalMember(owner = "client!client", name = "sj", descriptor = "Lclient!KWBPZBYX;")
	private Class4_Sub1_Sub2_Sub2 aClass4_Sub1_Sub2_Sub2_20;

	@OriginalMember(owner = "client!client", name = "vj", descriptor = "I")
	private int anInt1045;

	@OriginalMember(owner = "client!client", name = "xj", descriptor = "I")
	private int anInt1046;

	@OriginalMember(owner = "client!client", name = "yj", descriptor = "I")
	private int anInt1047;

	@OriginalMember(owner = "client!client", name = "zj", descriptor = "I")
	private int anInt1048;

	@OriginalMember(owner = "client!client", name = "Aj", descriptor = "I")
	private int anInt1049;

	@OriginalMember(owner = "client!client", name = "Bj", descriptor = "I")
	private int anInt1050;

	@OriginalMember(owner = "client!client", name = "Dj", descriptor = "I")
	private int anInt1052;

	@OriginalMember(owner = "client!client", name = "Ej", descriptor = "I")
	private int anInt1053;

	@OriginalMember(owner = "client!client", name = "Nj", descriptor = "[[[B")
	private byte[][][] aByteArrayArrayArray8;

	@OriginalMember(owner = "client!client", name = "Pj", descriptor = "I")
	private int anInt1056;

	@OriginalMember(owner = "client!client", name = "Qj", descriptor = "I")
	private int anInt1057;

	@OriginalMember(owner = "client!client", name = "Rj", descriptor = "I")
	private int anInt1058;

	@OriginalMember(owner = "client!client", name = "Sj", descriptor = "I")
	private int anInt1059;

	@OriginalMember(owner = "client!client", name = "Uj", descriptor = "I")
	private int anInt1061;

	@OriginalMember(owner = "client!client", name = "Vj", descriptor = "I")
	private int anInt1062;

	@OriginalMember(owner = "client!client", name = "Wj", descriptor = "I")
	private int anInt1063;

	@OriginalMember(owner = "client!client", name = "Xj", descriptor = "I")
	private int anInt1064;

	@OriginalMember(owner = "client!client", name = "Yj", descriptor = "[I")
	private int[] anIntArray273;

	@OriginalMember(owner = "client!client", name = "Zj", descriptor = "[I")
	private int[] anIntArray274;

	@OriginalMember(owner = "client!client", name = "ak", descriptor = "[I")
	private int[] anIntArray275;

	@OriginalMember(owner = "client!client", name = "bk", descriptor = "[I")
	private int[] anIntArray276;

	@OriginalMember(owner = "client!client", name = "ck", descriptor = "I")
	private int anInt1065;

	@OriginalMember(owner = "client!client", name = "dk", descriptor = "I")
	private int anInt1066;

	@OriginalMember(owner = "client!client", name = "ek", descriptor = "I")
	private int anInt1067;

	@OriginalMember(owner = "client!client", name = "fk", descriptor = "I")
	private int anInt1068;

	@OriginalMember(owner = "client!client", name = "gk", descriptor = "I")
	private int anInt1069;

	@OriginalMember(owner = "client!client", name = "hk", descriptor = "Ljava/lang/String;")
	private String aString31;

	@OriginalMember(owner = "client!client", name = "ik", descriptor = "I")
	private int anInt1070;

	@OriginalMember(owner = "client!client", name = "jk", descriptor = "I")
	private int anInt1071;

	@OriginalMember(owner = "client!client", name = "kk", descriptor = "I")
	private int anInt1072;

	@OriginalMember(owner = "client!client", name = "lk", descriptor = "I")
	private int anInt1073;

	@OriginalMember(owner = "client!client", name = "mk", descriptor = "I")
	private int anInt1074;

	@OriginalMember(owner = "client!client", name = "N", descriptor = "Ljava/lang/String;")
	private String aString17 = "";

	@OriginalMember(owner = "client!client", name = "O", descriptor = "[I")
	private int[] anIntArray212 = new int[Class30.anInt488];

	@OriginalMember(owner = "client!client", name = "P", descriptor = "Z")
	private boolean aBoolean215 = true;

	@OriginalMember(owner = "client!client", name = "Q", descriptor = "Z")
	private volatile boolean aBoolean216 = false;

	@OriginalMember(owner = "client!client", name = "S", descriptor = "[I")
	private int[] anIntArray213 = new int[9];

	@OriginalMember(owner = "client!client", name = "jb", descriptor = "Z")
	private boolean aBoolean217 = false;

	@OriginalMember(owner = "client!client", name = "kb", descriptor = "[I")
	private int[] anIntArray214 = new int[2000];

	@OriginalMember(owner = "client!client", name = "ob", descriptor = "Z")
	private boolean aBoolean218 = false;

	@OriginalMember(owner = "client!client", name = "qb", descriptor = "Z")
	private boolean aBoolean219 = false;

	@OriginalMember(owner = "client!client", name = "xb", descriptor = "[[I")
	private int[][] anIntArrayArray22 = new int[104][104];

	@OriginalMember(owner = "client!client", name = "zb", descriptor = "B")
	private byte aByte29 = 9;

	@OriginalMember(owner = "client!client", name = "Ab", descriptor = "[I")
	private int[] anIntArray215 = new int[5];

	@OriginalMember(owner = "client!client", name = "Bb", descriptor = "I")
	private int anInt864 = 4;

	@OriginalMember(owner = "client!client", name = "Jb", descriptor = "B")
	private byte aByte30 = -67;

	@OriginalMember(owner = "client!client", name = "Mb", descriptor = "I")
	private int anInt870 = 78;

	@OriginalMember(owner = "client!client", name = "Qb", descriptor = "Lclient!PGNBHFUF;")
	private Class4_Sub1_Sub4 aClass4_Sub1_Sub4_6 = Class4_Sub1_Sub4.method343();

	@OriginalMember(owner = "client!client", name = "Rb", descriptor = "[Lclient!KWBPZBYX;")
	private Class4_Sub1_Sub2_Sub2[] aClass4_Sub1_Sub2_Sub2Array2 = new Class4_Sub1_Sub2_Sub2[100];

	@OriginalMember(owner = "client!client", name = "Sb", descriptor = "Z")
	private boolean aBoolean221 = false;

	@OriginalMember(owner = "client!client", name = "Yb", descriptor = "Ljava/lang/String;")
	private String aString18 = "";

	@OriginalMember(owner = "client!client", name = "Zb", descriptor = "Ljava/lang/String;")
	private String aString19 = "";

	@OriginalMember(owner = "client!client", name = "ac", descriptor = "I")
	private int anInt876 = -566;

	@OriginalMember(owner = "client!client", name = "cc", descriptor = "[I")
	private int[] anIntArray217 = new int[Class30.anInt488];

	@OriginalMember(owner = "client!client", name = "dc", descriptor = "I")
	private int anInt878 = 128;

	@OriginalMember(owner = "client!client", name = "jc", descriptor = "Lclient!FEPBPONH;")
	private Class11 aClass11_10 = new Class11(145);

	@OriginalMember(owner = "client!client", name = "mc", descriptor = "I")
	private int anInt883 = -1;

	@OriginalMember(owner = "client!client", name = "nc", descriptor = "I")
	private int anInt884 = -1;

	@OriginalMember(owner = "client!client", name = "pc", descriptor = "Z")
	private boolean aBoolean224 = false;

	@OriginalMember(owner = "client!client", name = "rc", descriptor = "[I")
	private int[] anIntArray220 = new int[50];

	@OriginalMember(owner = "client!client", name = "sc", descriptor = "I")
	private int anInt885 = -1;

	@OriginalMember(owner = "client!client", name = "tc", descriptor = "Z")
	private boolean aBoolean225 = false;

	@OriginalMember(owner = "client!client", name = "uc", descriptor = "Z")
	private boolean aBoolean226 = true;

	@OriginalMember(owner = "client!client", name = "vc", descriptor = "Z")
	private boolean aBoolean227 = false;

	@OriginalMember(owner = "client!client", name = "xc", descriptor = "Z")
	private boolean aBoolean228 = false;

	@OriginalMember(owner = "client!client", name = "Gc", descriptor = "[J")
	private long[] aLongArray3 = new long[100];

	@OriginalMember(owner = "client!client", name = "Mc", descriptor = "[I")
	private int[] anIntArray221 = new int[5];

	@OriginalMember(owner = "client!client", name = "Xc", descriptor = "Ljava/lang/String;")
	private String aString20 = "";

	@OriginalMember(owner = "client!client", name = "Yc", descriptor = "Ljava/lang/String;")
	private String aString21 = "";

	@OriginalMember(owner = "client!client", name = "ad", descriptor = "[Lclient!TTWFVYGB;")
	private Class4_Sub1_Sub2_Sub3[] aClass4_Sub1_Sub2_Sub3Array4 = new Class4_Sub1_Sub2_Sub3[32];

	@OriginalMember(owner = "client!client", name = "gd", descriptor = "[Lclient!TTWFVYGB;")
	private Class4_Sub1_Sub2_Sub3[] aClass4_Sub1_Sub2_Sub3Array5 = new Class4_Sub1_Sub2_Sub3[32];

	@OriginalMember(owner = "client!client", name = "id", descriptor = "Z")
	private boolean aBoolean229 = false;

	@OriginalMember(owner = "client!client", name = "jd", descriptor = "I")
	private int anInt902 = 40410;

	@OriginalMember(owner = "client!client", name = "kd", descriptor = "[J")
	private long[] aLongArray4 = new long[200];

	@OriginalMember(owner = "client!client", name = "ld", descriptor = "Lclient!NPNTBMMX;")
	private Class28 aClass28_1 = new Class28();

	@OriginalMember(owner = "client!client", name = "rd", descriptor = "Lclient!PGNBHFUF;")
	private Class4_Sub1_Sub4 aClass4_Sub1_Sub4_7 = Class4_Sub1_Sub4.method343();

	@OriginalMember(owner = "client!client", name = "sd", descriptor = "Z")
	private boolean aBoolean230 = true;

	@OriginalMember(owner = "client!client", name = "td", descriptor = "I")
	private int anInt906 = -1;

	@OriginalMember(owner = "client!client", name = "ud", descriptor = "I")
	private int anInt907 = 2301979;

	@OriginalMember(owner = "client!client", name = "vd", descriptor = "I")
	private int anInt908 = -620;

	@OriginalMember(owner = "client!client", name = "Ad", descriptor = "Z")
	private boolean aBoolean231 = true;

	@OriginalMember(owner = "client!client", name = "Ed", descriptor = "I")
	private int anInt912 = 9;

	@OriginalMember(owner = "client!client", name = "Fd", descriptor = "Lclient!FEPBPONH;")
	private Class11 aClass11_11 = new Class11(145);

	@OriginalMember(owner = "client!client", name = "Hd", descriptor = "[I")
	private int[] anIntArray222 = new int[] { 17, 24, 34, 40 };

	@OriginalMember(owner = "client!client", name = "Ld", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray7 = new int[4][13][13];

	@OriginalMember(owner = "client!client", name = "Nd", descriptor = "I")
	private int anInt915 = 7759444;

	@OriginalMember(owner = "client!client", name = "Sd", descriptor = "[Lclient!TTWFVYGB;")
	private Class4_Sub1_Sub2_Sub3[] aClass4_Sub1_Sub2_Sub3Array6 = new Class4_Sub1_Sub2_Sub3[1000];

	@OriginalMember(owner = "client!client", name = "Ud", descriptor = "Z")
	private boolean aBoolean234 = false;

	@OriginalMember(owner = "client!client", name = "ie", descriptor = "Z")
	private boolean aBoolean235 = true;

	@OriginalMember(owner = "client!client", name = "je", descriptor = "Z")
	private boolean aBoolean236 = false;

	@OriginalMember(owner = "client!client", name = "ne", descriptor = "I")
	private int anInt928 = 50;

	@OriginalMember(owner = "client!client", name = "oe", descriptor = "[I")
	private int[] anIntArray224 = new int[this.anInt928];

	@OriginalMember(owner = "client!client", name = "pe", descriptor = "[I")
	private int[] anIntArray225 = new int[this.anInt928];

	@OriginalMember(owner = "client!client", name = "qe", descriptor = "[I")
	private int[] anIntArray226 = new int[this.anInt928];

	@OriginalMember(owner = "client!client", name = "re", descriptor = "[I")
	private int[] anIntArray227 = new int[this.anInt928];

	@OriginalMember(owner = "client!client", name = "se", descriptor = "[I")
	private int[] anIntArray228 = new int[this.anInt928];

	@OriginalMember(owner = "client!client", name = "te", descriptor = "[I")
	private int[] anIntArray229 = new int[this.anInt928];

	@OriginalMember(owner = "client!client", name = "ue", descriptor = "[I")
	private int[] anIntArray230 = new int[this.anInt928];

	@OriginalMember(owner = "client!client", name = "ve", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray8 = new String[this.anInt928];

	@OriginalMember(owner = "client!client", name = "Qe", descriptor = "[I")
	private int[] anIntArray231 = new int[1000];

	@OriginalMember(owner = "client!client", name = "Re", descriptor = "[I")
	private int[] anIntArray232 = new int[1000];

	@OriginalMember(owner = "client!client", name = "Se", descriptor = "[B")
	private byte[] aByteArray21 = new byte[16384];

	@OriginalMember(owner = "client!client", name = "Ue", descriptor = "Ljava/lang/String;")
	private String aString23 = "";

	@OriginalMember(owner = "client!client", name = "We", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray9 = new String[100];

	@OriginalMember(owner = "client!client", name = "Xe", descriptor = "[I")
	private int[] anIntArray233 = new int[100];

	@OriginalMember(owner = "client!client", name = "Ze", descriptor = "Z")
	private boolean aBoolean237 = false;

	@OriginalMember(owner = "client!client", name = "af", descriptor = "[I")
	private int[] anIntArray234 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

	@OriginalMember(owner = "client!client", name = "bf", descriptor = "Z")
	private boolean aBoolean238 = false;

	@OriginalMember(owner = "client!client", name = "gf", descriptor = "Z")
	private boolean aBoolean239 = true;

	@OriginalMember(owner = "client!client", name = "hf", descriptor = "Z")
	private boolean aBoolean240 = true;

	@OriginalMember(owner = "client!client", name = "jf", descriptor = "[[[Lclient!FEPBPONH;")
	private Class11[][][] aClass11ArrayArrayArray1 = new Class11[4][104][104];

	@OriginalMember(owner = "client!client", name = "kf", descriptor = "[I")
	private int[] anIntArray235 = new int[200];

	@OriginalMember(owner = "client!client", name = "lf", descriptor = "[I")
	private int[] anIntArray236 = new int[5];

	@OriginalMember(owner = "client!client", name = "nf", descriptor = "I")
	private int anInt945 = 11603;

	@OriginalMember(owner = "client!client", name = "of", descriptor = "[Lclient!BBRQYCNY;")
	private Class2[] aClass2Array1 = new Class2[4];

	@OriginalMember(owner = "client!client", name = "sf", descriptor = "B")
	private byte aByte31 = 5;

	@OriginalMember(owner = "client!client", name = "tf", descriptor = "Z")
	private boolean aBoolean241 = true;

	@OriginalMember(owner = "client!client", name = "uf", descriptor = "[I")
	private int[] anIntArray240 = new int[151];

	@OriginalMember(owner = "client!client", name = "wf", descriptor = "I")
	private int anInt947 = 2048;

	@OriginalMember(owner = "client!client", name = "xf", descriptor = "I")
	private int anInt948 = 2047;

	@OriginalMember(owner = "client!client", name = "yf", descriptor = "[Lclient!ZQANNJZE;")
	private Class4_Sub1_Sub1_Sub2_Sub2[] aClass4_Sub1_Sub1_Sub2_Sub2Array1 = new Class4_Sub1_Sub1_Sub2_Sub2[this.anInt947];

	@OriginalMember(owner = "client!client", name = "Af", descriptor = "[I")
	private int[] anIntArray241 = new int[this.anInt947];

	@OriginalMember(owner = "client!client", name = "Cf", descriptor = "[I")
	private int[] anIntArray242 = new int[this.anInt947];

	@OriginalMember(owner = "client!client", name = "Df", descriptor = "[Lclient!PGNBHFUF;")
	private Class4_Sub1_Sub4[] aClass4_Sub1_Sub4Array1 = new Class4_Sub1_Sub4[this.anInt947];

	@OriginalMember(owner = "client!client", name = "Ff", descriptor = "Z")
	private boolean aBoolean242 = false;

	@OriginalMember(owner = "client!client", name = "Gf", descriptor = "I")
	private int anInt951 = -1;

	@OriginalMember(owner = "client!client", name = "Hf", descriptor = "[Lclient!TTWFVYGB;")
	private Class4_Sub1_Sub2_Sub3[] aClass4_Sub1_Sub2_Sub3Array7 = new Class4_Sub1_Sub2_Sub3[8];

	@OriginalMember(owner = "client!client", name = "Lf", descriptor = "I")
	private int anInt955 = -1;

	@OriginalMember(owner = "client!client", name = "Nf", descriptor = "[I")
	private int[] anIntArray243 = new int[4000];

	@OriginalMember(owner = "client!client", name = "Of", descriptor = "[I")
	private int[] anIntArray244 = new int[4000];

	@OriginalMember(owner = "client!client", name = "Rf", descriptor = "[I")
	private int[] anIntArray245 = new int[7];

	@OriginalMember(owner = "client!client", name = "Uf", descriptor = "Z")
	private boolean aBoolean243 = false;

	@OriginalMember(owner = "client!client", name = "Wf", descriptor = "Z")
	private boolean aBoolean244 = true;

	@OriginalMember(owner = "client!client", name = "Xf", descriptor = "I")
	private int anInt962 = -1;

	@OriginalMember(owner = "client!client", name = "Yf", descriptor = "[I")
	private int[] anIntArray246 = new int[33];

	@OriginalMember(owner = "client!client", name = "Zf", descriptor = "Lclient!PGNBHFUF;")
	private Class4_Sub1_Sub4 aClass4_Sub1_Sub4_8 = Class4_Sub1_Sub4.method343();

	@OriginalMember(owner = "client!client", name = "bg", descriptor = "Ljava/lang/String;")
	private String aString25 = "";

	@OriginalMember(owner = "client!client", name = "fg", descriptor = "I")
	private int anInt967 = -347;

	@OriginalMember(owner = "client!client", name = "gg", descriptor = "[Lclient!TTWFVYGB;")
	private Class4_Sub1_Sub2_Sub3[] aClass4_Sub1_Sub2_Sub3Array8 = new Class4_Sub1_Sub2_Sub3[20];

	@OriginalMember(owner = "client!client", name = "jg", descriptor = "I")
	private int anInt968 = -1;

	@OriginalMember(owner = "client!client", name = "kg", descriptor = "Z")
	private boolean aBoolean245 = false;

	@OriginalMember(owner = "client!client", name = "lg", descriptor = "I")
	private int anInt969 = 3353893;

	@OriginalMember(owner = "client!client", name = "og", descriptor = "I")
	private int anInt972 = -730;

	@OriginalMember(owner = "client!client", name = "ug", descriptor = "I")
	private int anInt974 = 2;

	@OriginalMember(owner = "client!client", name = "vg", descriptor = "[Lclient!KWBPZBYX;")
	private Class4_Sub1_Sub2_Sub2[] aClass4_Sub1_Sub2_Sub2Array3 = new Class4_Sub1_Sub2_Sub2[13];

	@OriginalMember(owner = "client!client", name = "xg", descriptor = "Z")
	private boolean aBoolean246 = false;

	@OriginalMember(owner = "client!client", name = "yg", descriptor = "Ljava/lang/String;")
	private String aString26 = "";

	@OriginalMember(owner = "client!client", name = "Ig", descriptor = "I")
	private int anInt984 = 974;

	@OriginalMember(owner = "client!client", name = "Jg", descriptor = "[I")
	public int[] anIntArray249 = new int[2000];

	@OriginalMember(owner = "client!client", name = "Lg", descriptor = "I")
	private int anInt986 = 1;

	@OriginalMember(owner = "client!client", name = "Ng", descriptor = "I")
	private int anInt988 = -1;

	@OriginalMember(owner = "client!client", name = "Pg", descriptor = "Ljava/lang/String;")
	private String aString27 = "";

	@OriginalMember(owner = "client!client", name = "Qg", descriptor = "Z")
	private boolean aBoolean247 = false;

	@OriginalMember(owner = "client!client", name = "Rg", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray10 = new String[5];

	@OriginalMember(owner = "client!client", name = "Sg", descriptor = "[Z")
	private boolean[] aBooleanArray11 = new boolean[5];

	@OriginalMember(owner = "client!client", name = "Xg", descriptor = "Z")
	private boolean aBoolean248 = false;

	@OriginalMember(owner = "client!client", name = "Yg", descriptor = "Z")
	private boolean aBoolean249 = false;

	@OriginalMember(owner = "client!client", name = "Zg", descriptor = "Z")
	private boolean aBoolean250 = false;

	@OriginalMember(owner = "client!client", name = "ch", descriptor = "Z")
	public boolean aBoolean251 = false;

	@OriginalMember(owner = "client!client", name = "dh", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray11 = new String[200];

	@OriginalMember(owner = "client!client", name = "eh", descriptor = "I")
	private int anInt994 = 3;

	@OriginalMember(owner = "client!client", name = "fh", descriptor = "I")
	private int anInt995 = -1;

	@OriginalMember(owner = "client!client", name = "gh", descriptor = "Ljava/util/zip/CRC32;")
	private CRC32 aCRC32_2 = new CRC32();

	@OriginalMember(owner = "client!client", name = "ih", descriptor = "I")
	private int anInt997 = 365;

	@OriginalMember(owner = "client!client", name = "kh", descriptor = "[Lclient!TTWFVYGB;")
	private Class4_Sub1_Sub2_Sub3[] aClass4_Sub1_Sub2_Sub3Array9 = new Class4_Sub1_Sub2_Sub3[32];

	@OriginalMember(owner = "client!client", name = "nh", descriptor = "I")
	private int anInt999 = -1;

	@OriginalMember(owner = "client!client", name = "ph", descriptor = "I")
	private int anInt1001 = 1;

	@OriginalMember(owner = "client!client", name = "qh", descriptor = "[I")
	private int[] anIntArray250 = new int[5];

	@OriginalMember(owner = "client!client", name = "th", descriptor = "Z")
	private boolean aBoolean253 = false;

	@OriginalMember(owner = "client!client", name = "uh", descriptor = "Z")
	private boolean aBoolean254 = false;

	@OriginalMember(owner = "client!client", name = "vh", descriptor = "Z")
	private boolean aBoolean255 = true;

	@OriginalMember(owner = "client!client", name = "Ch", descriptor = "I")
	private int anInt1010 = -1;

	@OriginalMember(owner = "client!client", name = "Fh", descriptor = "[I")
	private int[] anIntArray251 = new int[500];

	@OriginalMember(owner = "client!client", name = "Gh", descriptor = "[I")
	private int[] anIntArray252 = new int[500];

	@OriginalMember(owner = "client!client", name = "Hh", descriptor = "[I")
	private int[] anIntArray253 = new int[500];

	@OriginalMember(owner = "client!client", name = "Ih", descriptor = "[I")
	private int[] anIntArray254 = new int[500];

	@OriginalMember(owner = "client!client", name = "Jh", descriptor = "Z")
	private boolean aBoolean256 = false;

	@OriginalMember(owner = "client!client", name = "Kh", descriptor = "I")
	private int anInt1011 = -550;

	@OriginalMember(owner = "client!client", name = "Oh", descriptor = "[I")
	private int[] anIntArray255 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

	@OriginalMember(owner = "client!client", name = "Ph", descriptor = "Z")
	private boolean aBoolean257 = true;

	@OriginalMember(owner = "client!client", name = "Qh", descriptor = "Lclient!PGNBHFUF;")
	private Class4_Sub1_Sub4 aClass4_Sub1_Sub4_9 = new Class4_Sub1_Sub4(5, new byte[5000]);

	@OriginalMember(owner = "client!client", name = "Rh", descriptor = "[Lclient!GBGUDIMT;")
	private Class4_Sub1_Sub1_Sub2_Sub1[] aClass4_Sub1_Sub1_Sub2_Sub1Array1 = new Class4_Sub1_Sub1_Sub2_Sub1[16384];

	@OriginalMember(owner = "client!client", name = "Th", descriptor = "[I")
	private int[] anIntArray256 = new int[16384];

	@OriginalMember(owner = "client!client", name = "Uh", descriptor = "I")
	private int anInt1014 = -1;

	@OriginalMember(owner = "client!client", name = "Vh", descriptor = "Z")
	private boolean aBoolean258 = false;

	@OriginalMember(owner = "client!client", name = "Wh", descriptor = "[[I")
	private int[][] anIntArrayArray24 = new int[104][104];

	@OriginalMember(owner = "client!client", name = "Xh", descriptor = "[I")
	private final int[] anIntArray257 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

	@OriginalMember(owner = "client!client", name = "Yh", descriptor = "[[I")
	private int[][] anIntArrayArray25 = new int[104][104];

	@OriginalMember(owner = "client!client", name = "Zh", descriptor = "[Lclient!KWBPZBYX;")
	private Class4_Sub1_Sub2_Sub2[] aClass4_Sub1_Sub2_Sub2Array5 = new Class4_Sub1_Sub2_Sub2[2];

	@OriginalMember(owner = "client!client", name = "di", descriptor = "[I")
	private int[] anIntArray258 = new int[Class30.anInt488];

	@OriginalMember(owner = "client!client", name = "ei", descriptor = "[Lclient!RUMGIOMW;")
	public Class34[] aClass34Array1 = new Class34[5];

	@OriginalMember(owner = "client!client", name = "fi", descriptor = "[I")
	private int[] anIntArray259 = new int[151];

	@OriginalMember(owner = "client!client", name = "gi", descriptor = "[Lclient!TTWFVYGB;")
	private Class4_Sub1_Sub2_Sub3[] aClass4_Sub1_Sub2_Sub3Array10 = new Class4_Sub1_Sub2_Sub3[100];

	@OriginalMember(owner = "client!client", name = "hi", descriptor = "[I")
	private int[] anIntArray260 = new int[33];

	@OriginalMember(owner = "client!client", name = "ii", descriptor = "Lclient!FEPBPONH;")
	private Class11 aClass11_12 = new Class11(145);

	@OriginalMember(owner = "client!client", name = "ji", descriptor = "I")
	private int anInt1015 = -1;

	@OriginalMember(owner = "client!client", name = "ki", descriptor = "I")
	private final int anInt1016 = 100;

	@OriginalMember(owner = "client!client", name = "li", descriptor = "[I")
	private int[] anIntArray261 = new int[100];

	@OriginalMember(owner = "client!client", name = "mi", descriptor = "I")
	private int anInt1017 = -58;

	@OriginalMember(owner = "client!client", name = "Ai", descriptor = "Z")
	private boolean aBoolean259 = true;

	@OriginalMember(owner = "client!client", name = "Fi", descriptor = "[I")
	private int[] anIntArray266 = new int[50];

	@OriginalMember(owner = "client!client", name = "Gi", descriptor = "I")
	private int anInt1028 = -252;

	@OriginalMember(owner = "client!client", name = "Hi", descriptor = "B")
	private byte aByte33 = 97;

	@OriginalMember(owner = "client!client", name = "Ii", descriptor = "Z")
	private boolean aBoolean260 = true;

	@OriginalMember(owner = "client!client", name = "Ki", descriptor = "I")
	private int anInt1030 = 2;

	@OriginalMember(owner = "client!client", name = "Li", descriptor = "Z")
	private boolean aBoolean261 = true;

	@OriginalMember(owner = "client!client", name = "Oi", descriptor = "Ljava/lang/String;")
	private String aString30 = "";

	@OriginalMember(owner = "client!client", name = "Pi", descriptor = "B")
	private byte aByte34 = 5;

	@OriginalMember(owner = "client!client", name = "Qi", descriptor = "I")
	private int anInt1032 = 5063219;

	@OriginalMember(owner = "client!client", name = "Si", descriptor = "[I")
	private int[] anIntArray267 = new int[50];

	@OriginalMember(owner = "client!client", name = "Vi", descriptor = "Z")
	private boolean aBoolean262 = false;

	@OriginalMember(owner = "client!client", name = "Yi", descriptor = "[I")
	private int[] anIntArray268 = new int[256];

	@OriginalMember(owner = "client!client", name = "aj", descriptor = "I")
	private int anInt1037 = -398;

	@OriginalMember(owner = "client!client", name = "bj", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray12 = new String[500];

	@OriginalMember(owner = "client!client", name = "hj", descriptor = "[I")
	private int[] anIntArray269 = new int[100];

	@OriginalMember(owner = "client!client", name = "ij", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray13 = new String[100];

	@OriginalMember(owner = "client!client", name = "jj", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray14 = new String[100];

	@OriginalMember(owner = "client!client", name = "mj", descriptor = "Z")
	private volatile boolean aBoolean263 = false;

	@OriginalMember(owner = "client!client", name = "nj", descriptor = "B")
	private byte aByte35 = 9;

	@OriginalMember(owner = "client!client", name = "pj", descriptor = "Z")
	private boolean aBoolean264 = true;

	@OriginalMember(owner = "client!client", name = "tj", descriptor = "Z")
	private boolean aBoolean265 = false;

	@OriginalMember(owner = "client!client", name = "uj", descriptor = "I")
	private int anInt1044 = 6;

	@OriginalMember(owner = "client!client", name = "wj", descriptor = "[I")
	private int[] anIntArray270 = new int[1000];

	@OriginalMember(owner = "client!client", name = "Cj", descriptor = "I")
	private int anInt1051 = 2;

	@OriginalMember(owner = "client!client", name = "Gj", descriptor = "Z")
	private boolean aBoolean266 = false;

	@OriginalMember(owner = "client!client", name = "Hj", descriptor = "Z")
	private boolean aBoolean267 = true;

	@OriginalMember(owner = "client!client", name = "Kj", descriptor = "I")
	private int anInt1055 = -1;

	@OriginalMember(owner = "client!client", name = "Lj", descriptor = "Z")
	private volatile boolean aBoolean269 = false;

	@OriginalMember(owner = "client!client", name = "Mj", descriptor = "[Z")
	private boolean[] aBooleanArray12 = new boolean[5];

	@OriginalMember(owner = "client!client", name = "Oj", descriptor = "[I")
	private int[] anIntArray272 = new int[5];

	@OriginalMember(owner = "client!client", name = "Tj", descriptor = "I")
	private int anInt1060 = 6;

	@OriginalMember(owner = "client!client", name = "nk", descriptor = "I")
	private int anInt1075 = -1;

	static {
		@Pc(11) int local11 = 0;
		@Pc(13) int local13;
		for (local13 = 0; local13 < 99; local13++) {
			@Pc(18) int local18 = local13 + 1;
			@Pc(31) int local31 = (int) ((double) local18 + Math.pow(2.0D, (double) local18 / 7.0D) * 300.0D);
			local11 += local31;
			anIntArray216[local13] = local11 / 4;
		}
		anInt874 = 10;
		aBoolean222 = true;
		anInt877 = 27764;
		aBigInteger2 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");
		aString22 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";
		anInt909 = -100;
		anInt916 = 6;
		anIntArray223 = new int[32];
		local11 = 2;
		for (local13 = 0; local13 < 32; local13++) {
			anIntArray223[local13] = local11 - 1;
			local11 += local11;
		}
		aBoolean233 = true;
		anIntArrayArray23 = new int[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, 33697, 22433, 2983, 54193 }, { 8741, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003, 25239 }, { 25238, 8742, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };
		aByte32 = 7;
		anIntArray271 = new int[] { 9104, 10275, 7595, 3610, 7975, 8526, 918, 38802, 24466, 10145, 58654, 5027, 1457, 16565, 34991, 25486 };
	}

	@OriginalMember(owner = "client!client", name = "main", descriptor = "([Ljava/lang/String;)V")
	public static void main(@OriginalArg(0) String[] arg0) {
		try {
			System.out.println("RS2 user client - release #" + 355);
			if (arg0.length == 5) {
				anInt874 = Integer.parseInt(arg0[0]);
				anInt875 = Integer.parseInt(arg0[1]);
				if (arg0[2].equals("lowmem")) {
					method654();
				} else if (arg0[2].equals("highmem")) {
					method670();
				} else {
					System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
					return;
				}
				if (arg0[3].equals("free")) {
					aBoolean222 = false;
				} else if (arg0[3].equals("members")) {
					aBoolean222 = true;
				} else {
					System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
					return;
				}
				signlink.anInt1078 = Integer.parseInt(arg0[4]);
				signlink.startpriv(InetAddress.getLocalHost());
				@Pc(87) client local87 = new client();
				local87.method573();
			} else {
				System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
			}
		} catch (@Pc(94) Exception local94) {
		}
	}

	@OriginalMember(owner = "client!client", name = "j", descriptor = "(B)V")
	private static void method654() {
		try {
			Class20.aBoolean98 = true;
			Class4_Sub1_Sub2_Sub1.aBoolean49 = true;
			aBoolean223 = true;
			Class44.aBoolean185 = true;
			Class7.aBoolean25 = true;
		} catch (@Pc(15) RuntimeException local15) {
			signlink.reporterror("26036, " + 31 + ", " + local15.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(II)Ljava/lang/String;")
	private static String method661(@OriginalArg(1) int arg0) {
		try {
			if (arg0 < 100000) {
				return String.valueOf(arg0);
			} else if (arg0 < 10000000) {
				return arg0 / 1000 + "K";
			} else {
				return arg0 / 1000000 + "M";
			}
		} catch (@Pc(41) RuntimeException local41) {
			signlink.reporterror("51822, " + 8 + ", " + arg0 + ", " + local41.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "l", descriptor = "(Z)V")
	private static void method670() {
		try {
			Class20.aBoolean98 = false;
			Class4_Sub1_Sub2_Sub1.aBoolean49 = false;
			aBoolean223 = false;
			Class44.aBoolean185 = false;
			Class7.aBoolean25 = false;
		} catch (@Pc(15) RuntimeException local15) {
			signlink.reporterror("32864, " + false + ", " + local15.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(IB)Ljava/lang/String;")
	private static String method699(@OriginalArg(0) int arg0) {
		try {
			@Pc(11) String local11 = String.valueOf(arg0);
			for (@Pc(16) int local16 = local11.length() - 3; local16 > 0; local16 -= 3) {
				local11 = local11.substring(0, local16) + "," + local11.substring(local16);
			}
			if (local11.length() > 8) {
				local11 = "@gre@" + local11.substring(0, local11.length() - 8) + " million @whi@(" + local11 + ")";
			} else if (local11.length() > 4) {
				local11 = "@cya@" + local11.substring(0, local11.length() - 4) + "K @whi@(" + local11 + ")";
			}
			return " " + local11;
		} catch (@Pc(96) RuntimeException local96) {
			signlink.reporterror("23661, " + arg0 + ", " + 31 + ", " + local96.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IZI)Ljava/lang/String;")
	private static String method701(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		try {
			@Pc(7) int local7 = arg1 - arg0;
			if (local7 < -9) {
				return "@red@";
			} else if (local7 < -6) {
				return "@or3@";
			} else if (local7 < -3) {
				return "@or2@";
			} else if (local7 < 0) {
				return "@or1@";
			} else if (local7 > 9) {
				return "@gre@";
			} else if (local7 > 6) {
				return "@gr3@";
			} else if (local7 > 3) {
				return "@gr2@";
			} else if (local7 > 0) {
				return "@gr1@";
			} else {
				return "@yel@";
			}
		} catch (@Pc(48) RuntimeException local48) {
			signlink.reporterror("92287, " + arg0 + ", " + true + ", " + arg1 + ", " + local48.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(B)V")
	private void method586() {
		try {
			for (@Pc(6) Class4_Sub1_Sub1_Sub5 local6 = (Class4_Sub1_Sub1_Sub5) this.aClass11_12.method166(); local6 != null; local6 = (Class4_Sub1_Sub1_Sub5) this.aClass11_12.method168()) {
				if (local6.anInt561 != this.anInt895 || anInt1054 > local6.anInt558) {
					local6.method556();
				} else if (anInt1054 >= local6.anInt557) {
					if (local6.anInt555 > 0) {
						@Pc(42) Class4_Sub1_Sub1_Sub2_Sub1 local42 = this.aClass4_Sub1_Sub1_Sub2_Sub1Array1[local6.anInt555 - 1];
						if (local42 != null && local42.anInt764 >= 0 && local42.anInt764 < 13312 && local42.anInt765 >= 0 && local42.anInt765 < 13312) {
							local6.method432(anInt1054, local42.anInt765, this.method614(local6.anInt561, local42.anInt764, local42.anInt765) - local6.anInt551, local42.anInt764);
						}
					}
					if (local6.anInt555 < 0) {
						@Pc(87) int local87 = -local6.anInt555 - 1;
						@Pc(93) Class4_Sub1_Sub1_Sub2_Sub2 local93;
						if (local87 == this.anInt1014) {
							local93 = aClass4_Sub1_Sub1_Sub2_Sub2_1;
						} else {
							local93 = this.aClass4_Sub1_Sub1_Sub2_Sub2Array1[local87];
						}
						if (local93 != null && local93.anInt764 >= 0 && local93.anInt764 < 13312 && local93.anInt765 >= 0 && local93.anInt765 < 13312) {
							local6.method432(anInt1054, local93.anInt765, this.method614(local6.anInt561, local93.anInt764, local93.anInt765) - local6.anInt551, local93.anInt764);
						}
					}
					local6.method431(this.aBoolean241, this.anInt1043);
					this.aClass20_1.method234(local6, (int) local6.aDouble3, 1000, 60, this.anInt895, false, (int) local6.aDouble2, -1, (int) local6.aDouble1, local6.anInt559);
				}
			}
		} catch (@Pc(174) RuntimeException local174) {
			signlink.reporterror("27961, " + -48 + ", " + local174.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(I)V")
	private void method587() {
		try {
			@Pc(12) int local12;
			for (@Pc(5) int local5 = 10; local5 < 117; local5++) {
				local12 = (int) (Math.random() * 100.0D);
				if (local12 < 50) {
					this.anIntArray218[local5 + 32512] = 255;
				}
			}
			@Pc(41) int local41;
			@Pc(48) int local48;
			@Pc(54) int local54;
			for (local12 = 0; local12 < 100; local12++) {
				local41 = (int) (Math.random() * 124.0D) + 2;
				local48 = (int) (Math.random() * 128.0D) + 128;
				local54 = local41 + (local48 << 7);
				this.anIntArray218[local54] = 192;
			}
			for (local41 = 1; local41 < 255; local41++) {
				for (local48 = 1; local48 < 127; local48++) {
					local54 = local48 + (local41 << 7);
					this.anIntArray219[local54] = (this.anIntArray218[local54 - 1] + this.anIntArray218[local54 + 1] + this.anIntArray218[local54 - 128] + this.anIntArray218[local54 + 128]) / 4;
				}
			}
			this.anInt924 += 128;
			if (this.anInt924 > this.anIntArray247.length) {
				this.anInt924 -= this.anIntArray247.length;
				local48 = (int) (Math.random() * 12.0D);
				this.method600(this.aClass4_Sub1_Sub2_Sub2Array4[local48]);
			}
			@Pc(174) int local174;
			for (local48 = 1; local48 < 255; local48++) {
				for (local54 = 1; local54 < 127; local54++) {
					local174 = local54 + (local48 << 7);
					@Pc(197) int local197 = this.anIntArray219[local174 + 128] - this.anIntArray247[local174 + this.anInt924 & this.anIntArray247.length - 1] / 5;
					if (local197 < 0) {
						local197 = 0;
					}
					this.anIntArray218[local174] = local197;
				}
			}
			for (local54 = 0; local54 < 255; local54++) {
				this.anIntArray268[local54] = this.anIntArray268[local54 + 1];
			}
			this.anIntArray268[255] = (int) (Math.sin((double) anInt1054 / 14.0D) * 16.0D + Math.sin((double) anInt1054 / 15.0D) * 14.0D + Math.sin((double) anInt1054 / 16.0D) * 12.0D);
			if (this.anInt1026 > 0) {
				this.anInt1026 -= 4;
			}
			if (this.anInt1027 > 0) {
				this.anInt1027 -= 4;
			}
			if (this.anInt1026 == 0 && this.anInt1027 == 0) {
				local174 = (int) (Math.random() * 2000.0D);
				if (local174 == 0) {
					this.anInt1026 = 1024;
				}
				if (local174 == 1) {
					this.anInt1027 = 1024;
					return;
				}
			}
		} catch (@Pc(308) RuntimeException local308) {
			signlink.reporterror("35784, " + 5 + ", " + local308.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(BILjava/lang/String;Ljava/lang/String;)V")
	private void method588(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) String arg3) {
		try {
			if (arg1 == 0 && this.anInt1075 != -1) {
				this.aString24 = arg3;
				super.anInt840 = 0;
			}
			if (this.anInt955 == -1) {
				this.aBoolean247 = true;
			}
			for (@Pc(22) int local22 = 99; local22 > 0; local22--) {
				this.anIntArray269[local22] = this.anIntArray269[local22 - 1];
				this.aStringArray13[local22] = this.aStringArray13[local22 - 1];
				this.aStringArray14[local22] = this.aStringArray14[local22 - 1];
			}
			@Pc(62) boolean local62 = false;
			this.anIntArray269[0] = arg1;
			this.aStringArray13[0] = arg2;
			this.aStringArray14[0] = arg3;
		} catch (@Pc(83) RuntimeException local83) {
			signlink.reporterror("22720, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local83.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IILclient!PGNBHFUF;)V")
	private void method589(@OriginalArg(1) int arg0, @OriginalArg(2) Class4_Sub1_Sub4 arg1) {
		try {
			arg1.method365();
			@Pc(18) int local18 = arg1.method366(1, this.aBoolean229);
			if (local18 != 0) {
				@Pc(27) int local27 = arg1.method366(2, this.aBoolean229);
				if (local27 == 0) {
					this.anIntArray242[this.anInt950++] = this.anInt948;
				} else {
					@Pc(51) int local51;
					@Pc(62) int local62;
					if (local27 == 1) {
						local51 = arg1.method366(3, this.aBoolean229);
						aClass4_Sub1_Sub1_Sub2_Sub2_1.method563(local51, false);
						local62 = arg1.method366(1, this.aBoolean229);
						if (local62 == 1) {
							this.anIntArray242[this.anInt950++] = this.anInt948;
						}
					} else {
						@Pc(109) int local109;
						if (local27 == 2) {
							local51 = arg1.method366(3, this.aBoolean229);
							aClass4_Sub1_Sub1_Sub2_Sub2_1.method563(local51, true);
							local62 = arg1.method366(3, this.aBoolean229);
							aClass4_Sub1_Sub1_Sub2_Sub2_1.method563(local62, true);
							local109 = arg1.method366(1, this.aBoolean229);
							if (local109 == 1) {
								this.anIntArray242[this.anInt950++] = this.anInt948;
							}
						} else if (local27 == 3) {
							local51 = arg1.method366(1, this.aBoolean229);
							if (local51 == 1) {
								this.anIntArray242[this.anInt950++] = this.anInt948;
							}
							local62 = arg1.method366(7, this.aBoolean229);
							local109 = arg1.method366(7, this.aBoolean229);
							@Pc(167) int local167 = arg1.method366(1, this.aBoolean229);
							this.anInt895 = arg1.method366(2, this.aBoolean229);
							aClass4_Sub1_Sub1_Sub2_Sub2_1.method561(local167 == 1, local109, local62);
						}
					}
				}
			}
		} catch (@Pc(187) RuntimeException local187) {
			signlink.reporterror("7723, " + -651 + ", " + arg0 + ", " + arg1 + ", " + local187.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(III)Z")
	private boolean method590(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		try {
			@Pc(3) boolean local3 = false;
			if (arg1 < 0 || arg1 > 0) {
				this.method578();
			}
			@Pc(12) Class28 local12 = Class28.method318(arg2);
			for (@Pc(14) int local14 = 0; local14 < local12.anIntArray91.length && local12.anIntArray91[local14] != -1; local14++) {
				@Pc(28) Class28 local28 = Class28.method318(local12.anIntArray91[local14]);
				if (local28.anInt447 == 1) {
					local3 |= this.method590(arg0, anInt868, local28.anInt451);
				}
				@Pc(63) int local63;
				if (local28.anInt447 == 6 && (local28.anInt424 != -1 || local28.anInt425 != -1)) {
					@Pc(58) boolean local58 = this.method641(local28);
					if (local58) {
						local63 = local28.anInt425;
					} else {
						local63 = local28.anInt424;
					}
					if (local63 != -1) {
						@Pc(75) Class21 local75 = Class21.aClass21Array1[local63];
						local28.anInt448 += arg0;
						while (local28.anInt448 > local75.method275(this.anInt902, local28.anInt440)) {
							local28.anInt448 -= local75.method275(this.anInt902, local28.anInt440) + 1;
							local28.anInt440++;
							if (local28.anInt440 >= local75.anInt369) {
								local28.anInt440 -= local75.anInt370;
								if (local28.anInt440 < 0 || local28.anInt440 >= local75.anInt369) {
									local28.anInt440 = 0;
								}
							}
							local3 = true;
						}
					}
				}
				if (local28.anInt447 == 6 && local28.anInt432 != 0) {
					@Pc(148) int local148 = local28.anInt432 >> 16;
					local63 = local28.anInt432 << 16 >> 16;
					@Pc(159) int local159 = local148 * arg0;
					local63 *= arg0;
					local28.anInt455 = local28.anInt455 + local159 & 0x7FF;
					local28.anInt456 = local28.anInt456 + local63 & 0x7FF;
					local3 = true;
				}
			}
			return local3;
		} catch (@Pc(190) RuntimeException local190) {
			signlink.reporterror("74709, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local190.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(B)V")
	private void method591(@OriginalArg(0) byte arg0) {
		try {
			@Pc(7) byte[] local7 = this.aClass32_2.method426("title.dat", null);
			@Pc(13) Class4_Sub1_Sub2_Sub3 local13 = new Class4_Sub1_Sub2_Sub3(local7, this);
			this.aClass25_15.method302(this.aBoolean230);
			local13.method464(0, 673, 0);
			this.aClass25_16.method302(this.aBoolean230);
			@Pc(33) boolean local33 = false;
			local13.method464(-637, 673, 0);
			this.aClass25_12.method302(this.aBoolean230);
			local13.method464(-128, 673, 0);
			this.aClass25_13.method302(this.aBoolean230);
			local13.method464(-202, 673, -371);
			this.aClass25_14.method302(this.aBoolean230);
			local13.method464(-202, 673, -171);
			this.aClass25_17.method302(this.aBoolean230);
			local13.method464(0, 673, -265);
			this.aClass25_18.method302(this.aBoolean230);
			local13.method464(-562, 673, -265);
			this.aClass25_19.method302(this.aBoolean230);
			local13.method464(-128, 673, -171);
			this.aClass25_20.method302(this.aBoolean230);
			local13.method464(-562, 673, -171);
			@Pc(116) int[] local116 = new int[local13.anInt601];
			for (@Pc(118) int local118 = 0; local118 < local13.anInt602; local118++) {
				for (@Pc(122) int local122 = 0; local122 < local13.anInt601; local122++) {
					local116[local122] = local13.anIntArray149[local13.anInt601 + local13.anInt601 * local118 - local122 - 1];
				}
				for (@Pc(148) int local148 = 0; local148 < local13.anInt601; local148++) {
					local13.anIntArray149[local148 + local13.anInt601 * local118] = local116[local148];
				}
			}
			this.aClass25_15.method302(this.aBoolean230);
			local13.method464(382, 673, 0);
			this.aClass25_16.method302(this.aBoolean230);
			local13.method464(-255, 673, 0);
			this.aClass25_12.method302(this.aBoolean230);
			local13.method464(254, 673, 0);
			this.aClass25_13.method302(this.aBoolean230);
			local13.method464(180, 673, -371);
			this.aClass25_14.method302(this.aBoolean230);
			local13.method464(180, 673, -171);
			this.aClass25_17.method302(this.aBoolean230);
			local13.method464(382, 673, -265);
			this.aClass25_18.method302(this.aBoolean230);
			local13.method464(-180, 673, -265);
			this.aClass25_19.method302(this.aBoolean230);
			local13.method464(254, 673, -171);
			this.aClass25_20.method302(this.aBoolean230);
			local13.method464(-180, 673, -171);
			local13 = new Class4_Sub1_Sub2_Sub3(this.aClass32_2, "logo", 0);
			this.aClass25_12.method302(this.aBoolean230);
			local13.method466(382 - local13.anInt601 / 2 - 128, 18);
			System.gc();
		} catch (@Pc(301) RuntimeException local301) {
			signlink.reporterror("36792, " + arg0 + ", " + local301.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!PGNBHFUF;ZI)V")
	private void method592(@OriginalArg(0) Class4_Sub1_Sub4 arg0, @OriginalArg(2) int arg1) {
		try {
			arg0.method365();
			@Pc(10) int local10 = arg0.method366(8, this.aBoolean229);
			@Pc(16) int local16;
			if (local10 < this.anInt1013) {
				for (local16 = local10; local16 < this.anInt1013; local16++) {
					this.anIntArray270[this.anInt1045++] = this.anIntArray256[local16];
				}
			}
			if (local10 > this.anInt1013) {
				signlink.reporterror(this.aString20 + " Too many npcs");
				throw new RuntimeException("eek");
			}
			this.anInt1013 = 0;
			for (local16 = 0; local16 < local10; local16++) {
				@Pc(78) int local78 = this.anIntArray256[local16];
				@Pc(83) Class4_Sub1_Sub1_Sub2_Sub1 local83 = this.aClass4_Sub1_Sub1_Sub2_Sub1Array1[local78];
				@Pc(89) int local89 = arg0.method366(1, this.aBoolean229);
				if (local89 == 0) {
					this.anIntArray256[this.anInt1013++] = local78;
					local83.anInt782 = anInt1054;
				} else {
					@Pc(113) int local113 = arg0.method366(2, this.aBoolean229);
					if (local113 == 0) {
						this.anIntArray256[this.anInt1013++] = local78;
						local83.anInt782 = anInt1054;
						this.anIntArray242[this.anInt950++] = local78;
					} else {
						@Pc(165) int local165;
						@Pc(176) int local176;
						if (local113 == 1) {
							this.anIntArray256[this.anInt1013++] = local78;
							local83.anInt782 = anInt1054;
							local165 = arg0.method366(3, this.aBoolean229);
							local83.method563(local165, false);
							local176 = arg0.method366(1, this.aBoolean229);
							if (local176 == 1) {
								this.anIntArray242[this.anInt950++] = local78;
							}
						} else if (local113 == 2) {
							this.anIntArray256[this.anInt1013++] = local78;
							local83.anInt782 = anInt1054;
							local165 = arg0.method366(3, this.aBoolean229);
							local83.method563(local165, true);
							local176 = arg0.method366(3, this.aBoolean229);
							local83.method563(local176, true);
							@Pc(237) int local237 = arg0.method366(1, this.aBoolean229);
							if (local237 == 1) {
								this.anIntArray242[this.anInt950++] = local78;
							}
						} else if (local113 == 3) {
							this.anIntArray270[this.anInt1045++] = local78;
						}
					}
				}
			}
		} catch (@Pc(274) RuntimeException local274) {
			signlink.reporterror("16051, " + arg0 + ", " + true + ", " + arg1 + ", " + local274.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ZI)V")
	private void method593(@OriginalArg(0) boolean arg0) {
		try {
			for (@Pc(1) int local1 = 0; local1 < this.anInt1013; local1++) {
				@Pc(11) Class4_Sub1_Sub1_Sub2_Sub1 local11 = this.aClass4_Sub1_Sub1_Sub2_Sub1Array1[this.anIntArray256[local1]];
				@Pc(20) int local20 = (this.anIntArray256[local1] << 14) + 536870912;
				if (local11 != null && local11.method562() && local11.aClass40_1.aBoolean171 == arg0 && local11.aClass40_1.method486()) {
					@Pc(41) int local41 = local11.anInt764 >> 7;
					@Pc(46) int local46 = local11.anInt765 >> 7;
					if (local41 >= 0 && local41 < 104 && local46 >= 0 && local46 < 104) {
						if (local11.anInt756 == 1 && (local11.anInt764 & 0x7F) == 64 && (local11.anInt765 & 0x7F) == 64) {
							if (this.anIntArrayArray24[local41][local46] == this.anInt858) {
								continue;
							}
							this.anIntArrayArray24[local41][local46] = this.anInt858;
						}
						if (!local11.aClass40_1.aBoolean174) {
							local20 += Integer.MIN_VALUE;
						}
						this.aClass20_1.method234(local11, this.method614(this.anInt895, local11.anInt764, local11.anInt765), 1000, (local11.anInt756 - 1) * 64 + 60, this.anInt895, local11.aBoolean198, local11.anInt765, local20, local11.anInt764, local11.anInt766);
					}
				}
			}
		} catch (@Pc(143) RuntimeException local143) {
			signlink.reporterror("83939, " + arg0 + ", " + 0 + ", " + local143.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(II)V")
	private void method594(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(9) Class11 local9 = this.aClass11ArrayArrayArray1[this.anInt895][arg0][arg1];
		if (local9 == null) {
			this.aClass20_1.method244(this.anInt895, arg0, arg1);
			return;
		}
		@Pc(21) int local21 = -99999999;
		@Pc(23) Class4_Sub1_Sub1_Sub1 local23 = null;
		@Pc(27) Class4_Sub1_Sub1_Sub1 local27;
		for (local27 = (Class4_Sub1_Sub1_Sub1) local9.method166(); local27 != null; local27 = (Class4_Sub1_Sub1_Sub1) local9.method168()) {
			@Pc(32) Class17 local32 = Class17.method196(local27.anInt25);
			@Pc(35) int local35 = local32.anInt273;
			if (local32.aBoolean84) {
				local35 *= local27.anInt24 + 1;
			}
			if (local35 > local21) {
				local21 = local35;
				local23 = local27;
			}
		}
		local9.method164(local23);
		@Pc(65) Class4_Sub1_Sub1_Sub1 local65 = null;
		@Pc(67) Class4_Sub1_Sub1_Sub1 local67 = null;
		for (local27 = (Class4_Sub1_Sub1_Sub1) local9.method166(); local27 != null; local27 = (Class4_Sub1_Sub1_Sub1) local9.method168()) {
			if (local27.anInt25 != local23.anInt25 && local65 == null) {
				local65 = local27;
			}
			if (local27.anInt25 != local23.anInt25 && local27.anInt25 != local65.anInt25 && local67 == null) {
				local67 = local27;
			}
		}
		@Pc(110) int local110 = arg0 + (arg1 << 7) + 1610612736;
		this.aClass20_1.method230(local65, local23, this.method614(this.anInt895, arg0 * 128 + 64, arg1 * 128 + 64), local110, arg0, arg1, local67, this.anInt895);
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IILclient!NPNTBMMX;IIIIII)V")
	private void method595(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class28 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		try {
			if (this.aBoolean227) {
				this.anInt886 = 32;
			} else {
				this.anInt886 = 0;
			}
			this.aBoolean227 = false;
			@Pc(17) boolean local17 = false;
			if (arg6 >= arg3 && arg6 < arg3 + 16 && arg0 >= arg1 && arg0 < arg1 + 16) {
				arg2.anInt449 -= this.anInt941 * 4;
				if (arg4 == 1) {
					this.aBoolean246 = true;
				}
				if (arg4 == 2 || arg4 == 3) {
					this.aBoolean247 = true;
				}
			} else if (arg6 >= arg3 && arg6 < arg3 + 16 && arg0 >= arg1 + arg8 - 16 && arg0 < arg1 + arg8) {
				arg2.anInt449 += this.anInt941 * 4;
				if (arg4 == 1) {
					this.aBoolean246 = true;
				}
				if (arg4 == 2 || arg4 == 3) {
					this.aBoolean247 = true;
				}
			} else if (arg6 >= arg3 - this.anInt886 && arg6 < arg3 + this.anInt886 + 16 && arg0 >= arg1 + 16 && arg0 < arg1 + arg8 - 16 && this.anInt941 > 0) {
				@Pc(140) int local140 = (arg8 - 32) * arg8 / arg7;
				if (local140 < 8) {
					local140 = 8;
				}
				@Pc(155) int local155 = arg0 - arg1 - local140 / 2 - 16;
				@Pc(161) int local161 = arg8 - local140 - 32;
				arg2.anInt449 = (arg7 - arg8) * local155 / local161;
				if (arg4 == 1) {
					this.aBoolean246 = true;
				}
				if (arg4 == 2 || arg4 == 3) {
					this.aBoolean247 = true;
				}
				this.aBoolean227 = true;
			}
		} catch (@Pc(190) RuntimeException local190) {
			signlink.reporterror("71739, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + local190.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(IZ)V")
	private void method596(@OriginalArg(0) int arg0) {
		try {
			@Pc(5) int[] local5 = this.aClass4_Sub1_Sub2_Sub3_8.anIntArray149;
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
						this.aClass20_1.method258(local5, local34, arg0, local36, local22);
					}
					if (arg0 < 3 && (this.aByteArrayArrayArray8[arg0 + 1][local36][local22] & 0x8) != 0) {
						this.aClass20_1.method258(local5, local34, arg0 + 1, local36, local22);
					}
					local34 += 4;
				}
			}
			local34 = ((int) (Math.random() * 20.0D) + 238 - 10 << 16) + ((int) (Math.random() * 20.0D) + 238 - 10 << 8) + (int) (Math.random() * 20.0D) + 238 - 10;
			local36 = (int) (Math.random() * 20.0D) + 238 - 10 << 16;
			this.aClass4_Sub1_Sub2_Sub3_8.method461(this.aBoolean230);
			@Pc(151) int local151;
			for (@Pc(147) int local147 = 1; local147 < 103; local147++) {
				for (local151 = 1; local151 < 103; local151++) {
					if ((this.aByteArrayArrayArray8[arg0][local151][local147] & 0x18) == 0) {
						this.method668(local34, arg0, local147, local36, local151, (byte) 9);
					}
					if (arg0 < 3 && (this.aByteArrayArrayArray8[arg0 + 1][local151][local147] & 0x8) != 0) {
						this.method668(local34, arg0 + 1, local147, local36, local151, (byte) 9);
					}
				}
			}
			if (this.aClass25_23 != null) {
				this.aClass25_23.method302(this.aBoolean230);
				Class4_Sub1_Sub2_Sub1.anIntArray27 = this.anIntArray275;
			}
			this.anInt936 = 0;
			for (local151 = 0; local151 < 104; local151++) {
				for (@Pc(226) int local226 = 0; local226 < 104; local226++) {
					@Pc(236) int local236 = this.aClass20_1.method252(this.anInt895, local151, local226);
					if (local236 != 0) {
						local236 = local236 >> 14 & 0x7FFF;
						@Pc(248) int local248 = Class7.method82(local236).anInt43;
						if (local248 >= 0) {
							@Pc(252) int local252 = local151;
							@Pc(254) int local254 = local226;
							if (local248 != 22 && local248 != 29 && local248 != 34 && local248 != 36 && local248 != 46 && local248 != 47 && local248 != 48) {
								@Pc(286) int[][] local286 = this.aClass2Array1[this.anInt895].anIntArrayArray1;
								for (@Pc(288) int local288 = 0; local288 < 10; local288++) {
									@Pc(295) int local295 = (int) (Math.random() * 4.0D);
									if (local295 == 0 && local252 > 0 && local252 > local151 - 3 && (local286[local252 - 1][local254] & 0x1280108) == 0) {
										local252--;
									}
									if (local295 == 1 && local252 < 103 && local252 < local151 + 3 && (local286[local252 + 1][local254] & 0x1280180) == 0) {
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
							this.aClass4_Sub1_Sub2_Sub3Array6[this.anInt936] = this.aClass4_Sub1_Sub2_Sub3Array10[local248];
							this.anIntArray231[this.anInt936] = local252;
							this.anIntArray232[this.anInt936] = local254;
							this.anInt936++;
						}
					}
				}
			}
		} catch (@Pc(425) RuntimeException local425) {
			signlink.reporterror("5289, " + arg0 + ", " + true + ", " + local425.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "f", descriptor = "(I)V")
	private void method597(@OriginalArg(0) int arg0) {
		try {
			if (this.anInt1040 == 0) {
				this.aStringArray12[0] = "Cancel";
				this.anIntArray253[0] = 1961;
				this.anInt989 = 1;
				if (this.anInt1015 == -1) {
					this.method632(this.aBoolean259);
					this.anInt903 = 0;
					this.anInt847 = 0;
					if (super.anInt835 > 4 && super.anInt836 > 4 && super.anInt835 < 516 && super.anInt836 < 338) {
						if (this.anInt951 == -1) {
							this.method627((byte) 5);
						} else {
							this.method713(4, 0, super.anInt836, 4, (byte) 3, Class28.method318(this.anInt951), super.anInt835, 0);
						}
					}
					if (this.anInt903 != this.anInt872) {
						this.anInt872 = this.anInt903;
					}
					if (this.anInt847 != this.anInt952) {
						this.anInt952 = this.anInt847;
					}
					this.anInt903 = 0;
					this.anInt847 = 0;
					if (super.anInt835 > 553 && super.anInt836 > 205 && super.anInt835 < 743 && super.anInt836 < 466) {
						if (this.anInt995 != -1) {
							this.method713(205, 0, super.anInt836, 553, (byte) 3, Class28.method318(this.anInt995), super.anInt835, 1);
						} else if (this.anIntArray255[this.anInt994] != -1) {
							this.method713(205, 0, super.anInt836, 553, (byte) 3, Class28.method318(this.anIntArray255[this.anInt994]), super.anInt835, 1);
						}
					}
					if (this.anInt903 != this.anInt855) {
						this.aBoolean246 = true;
						this.anInt855 = this.anInt903;
					}
					if (this.anInt847 != this.anInt940) {
						this.aBoolean246 = true;
						this.anInt940 = this.anInt847;
					}
					this.anInt903 = 0;
					this.anInt847 = 0;
					@Pc(228) boolean local228 = false;
					if (super.anInt835 > 17 && super.anInt836 > 357 && super.anInt835 < 496 && super.anInt836 < 453) {
						if (this.anInt955 != -1) {
							this.method713(357, 0, super.anInt836, 17, (byte) 3, Class28.method318(this.anInt955), super.anInt835, 2);
						} else if (this.anInt1075 != -1) {
							this.method713(357, 0, super.anInt836, 17, (byte) 3, Class28.method318(this.anInt1075), super.anInt835, 3);
						} else if (super.anInt836 < 434 && super.anInt835 < 426 && this.anInt996 == 0) {
							this.method681(super.anInt836 - 357, super.anInt835 - 17);
						}
					}
					if ((this.anInt955 != -1 || this.anInt1075 != -1) && this.anInt903 != this.anInt904) {
						this.aBoolean247 = true;
						this.anInt904 = this.anInt903;
					}
					if ((this.anInt955 != -1 || this.anInt1075 != -1) && this.anInt847 != this.anInt937) {
						this.aBoolean247 = true;
						this.anInt937 = this.anInt847;
					}
					@Pc(348) boolean local348 = false;
					while (!local348) {
						local348 = true;
						for (@Pc(354) int local354 = 0; local354 < this.anInt989 - 1; local354++) {
							if (this.anIntArray253[local354] < 1000 && this.anIntArray253[local354 + 1] > 1000) {
								@Pc(375) String local375 = this.aStringArray12[local354];
								this.aStringArray12[local354] = this.aStringArray12[local354 + 1];
								this.aStringArray12[local354 + 1] = local375;
								@Pc(397) int local397 = this.anIntArray253[local354];
								this.anIntArray253[local354] = this.anIntArray253[local354 + 1];
								this.anIntArray253[local354 + 1] = local397;
								@Pc(419) int local419 = this.anIntArray251[local354];
								this.anIntArray251[local354] = this.anIntArray251[local354 + 1];
								this.anIntArray251[local354 + 1] = local419;
								@Pc(441) int local441 = this.anIntArray252[local354];
								this.anIntArray252[local354] = this.anIntArray252[local354 + 1];
								this.anIntArray252[local354 + 1] = local441;
								@Pc(463) int local463 = this.anIntArray254[local354];
								this.anIntArray254[local354] = this.anIntArray254[local354 + 1];
								this.anIntArray254[local354 + 1] = local463;
								local348 = false;
							}
						}
					}
				} else {
					this.anInt903 = 0;
					this.anInt847 = 0;
					this.method713(0, 0, super.anInt836, 0, (byte) 3, Class28.method318(this.anInt1015), super.anInt835, 0);
					if (this.anInt903 != this.anInt872) {
						this.anInt872 = this.anInt903;
					}
					if (this.anInt847 != this.anInt952) {
						this.anInt952 = this.anInt847;
					}
				}
			}
		} catch (@Pc(493) RuntimeException local493) {
			signlink.reporterror("71757, " + arg0 + ", " + local493.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(B)V")
	private void method598() {
		try {
			if (this.anInt1025 != 0) {
				@Pc(6) Class4_Sub1_Sub2_Sub4 local6 = this.aClass4_Sub1_Sub2_Sub4_3;
				@Pc(12) int local12 = 0;
				if (this.anInt953 != 0) {
					local12 = 1;
				}
				for (@Pc(19) int local19 = 0; local19 < 100; local19++) {
					if (this.aStringArray14[local19] != null) {
						@Pc(31) int local31 = this.anIntArray269[local19];
						@Pc(36) String local36 = this.aStringArray13[local19];
						@Pc(38) byte local38 = 0;
						if (local36 != null && local36.startsWith("@cr1@")) {
							local36 = local36.substring(5);
							local38 = 1;
						}
						if (local36 != null && local36.startsWith("@cr2@")) {
							local36 = local36.substring(5);
							local38 = 2;
						}
						@Pc(89) int local89;
						if ((local31 == 3 || local31 == 7) && (local31 == 7 || this.anInt970 == 0 || this.anInt970 == 1 && this.method602(local36))) {
							local89 = 329 - local12 * 13;
							local6.method508(0, local89, 4, "From");
							local6.method508(65535, local89 - 1, 4, "From");
							@Pc(114) int local114 = local6.method506("From ") + 4;
							if (local38 == 1) {
								this.aClass4_Sub1_Sub2_Sub2Array5[0].method296(local114, local89 - 12);
								local114 += 14;
							}
							if (local38 == 2) {
								this.aClass4_Sub1_Sub2_Sub2Array5[1].method296(local114, local89 - 12);
								local114 += 14;
							}
							local6.method508(0, local89, local114, local36 + ": " + this.aStringArray14[local19]);
							local6.method508(65535, local89 - 1, local114, local36 + ": " + this.aStringArray14[local19]);
							local12++;
							if (local12 >= 5) {
								return;
							}
						}
						if (local31 == 5 && this.anInt970 < 2) {
							local89 = 329 - local12 * 13;
							local6.method508(0, local89, 4, this.aStringArray14[local19]);
							local6.method508(65535, local89 - 1, 4, this.aStringArray14[local19]);
							local12++;
							if (local12 >= 5) {
								return;
							}
						}
						if (local31 == 6 && this.anInt970 < 2) {
							local89 = 329 - local12 * 13;
							local6.method508(0, local89, 4, "To " + local36 + ": " + this.aStringArray14[local19]);
							local6.method508(65535, local89 - 1, 4, "To " + local36 + ": " + this.aStringArray14[local19]);
							local12++;
							if (local12 >= 5) {
								return;
							}
						}
					}
				}
			}
		} catch (@Pc(293) RuntimeException local293) {
			signlink.reporterror("9575, " + -29 + ", " + local293.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "g", descriptor = "(I)V")
	private void method599() {
		try {
			@Pc(15) int local15;
			@Pc(22) int local22;
			if (this.anInt1031 == 0) {
				local15 = super.anInt831 / 2 - 80;
				local22 = super.anInt832 / 2 + 20;
				local22 += 20;
				if (super.anInt840 == 1 && super.anInt841 >= local15 - 75 && super.anInt841 <= local15 + 75 && super.anInt842 >= local22 - 20 && super.anInt842 <= local22 + 20) {
					this.anInt1031 = 3;
					this.anInt1036 = 0;
				}
				local15 = super.anInt831 / 2 + 80;
				if (super.anInt840 == 1 && super.anInt841 >= local15 - 75 && super.anInt841 <= local15 + 75 && super.anInt842 >= local22 - 20 && super.anInt842 <= local22 + 20) {
					this.aString18 = "";
					this.aString19 = "Enter your username & password.";
					this.anInt1031 = 2;
					this.anInt1036 = 0;
				}
			} else if (this.anInt1031 == 2) {
				local15 = super.anInt832 / 2 - 40;
				local15 += 30;
				local15 += 25;
				if (super.anInt840 == 1 && super.anInt842 >= local15 - 15 && super.anInt842 < local15) {
					this.anInt1036 = 0;
				}
				local15 += 15;
				if (super.anInt840 == 1 && super.anInt842 >= local15 - 15 && super.anInt842 < local15) {
					this.anInt1036 = 1;
				}
				local15 += 15;
				local22 = super.anInt831 / 2 - 80;
				@Pc(168) int local168 = super.anInt832 / 2 + 50;
				@Pc(169) int local169 = local168 + 20;
				if (super.anInt840 == 1 && super.anInt841 >= local22 - 75 && super.anInt841 <= local22 + 75 && super.anInt842 >= local169 - 20 && super.anInt842 <= local169 + 20) {
					this.anInt1061 = 0;
					this.method640(this.aString20, this.aString21, false);
					if (this.aBoolean251) {
						return;
					}
				}
				local22 = super.anInt831 / 2 + 80;
				if (super.anInt840 == 1 && super.anInt841 >= local22 - 75 && super.anInt841 <= local22 + 75 && super.anInt842 >= local169 - 20 && super.anInt842 <= local169 + 20) {
					this.anInt1031 = 0;
					this.aString20 = "";
					this.aString21 = "";
				}
				while (true) {
					while (true) {
						@Pc(259) int local259 = this.method577();
						if (local259 == -1) {
							return;
						}
						@Pc(264) boolean local264 = false;
						for (@Pc(266) int local266 = 0; local266 < aString22.length(); local266++) {
							if (local259 == aString22.charAt(local266)) {
								local264 = true;
								break;
							}
						}
						if (this.anInt1036 == 0) {
							if (local259 == 8 && this.aString20.length() > 0) {
								this.aString20 = this.aString20.substring(0, this.aString20.length() - 1);
							}
							if (local259 == 9 || local259 == 10 || local259 == 13) {
								this.anInt1036 = 1;
							}
							if (local264) {
								this.aString20 = this.aString20 + (char) local259;
							}
							if (this.aString20.length() > 12) {
								this.aString20 = this.aString20.substring(0, 12);
							}
						} else if (this.anInt1036 == 1) {
							if (local259 == 8 && this.aString21.length() > 0) {
								this.aString21 = this.aString21.substring(0, this.aString21.length() - 1);
							}
							if (local259 == 9 || local259 == 10 || local259 == 13) {
								this.anInt1036 = 0;
							}
							if (local264) {
								this.aString21 = this.aString21 + (char) local259;
							}
							if (this.aString21.length() > 20) {
								this.aString21 = this.aString21.substring(0, 20);
							}
						}
					}
				}
			} else if (this.anInt1031 == 3) {
				local15 = super.anInt831 / 2;
				local22 = super.anInt832 / 2 + 50;
				@Pc(423) int local423 = local22 + 20;
				if (super.anInt840 == 1 && super.anInt841 >= local15 - 75 && super.anInt841 <= local15 + 75 && super.anInt842 >= local423 - 20 && super.anInt842 <= local423 + 20) {
					this.anInt1031 = 0;
					return;
				}
			}
		} catch (@Pc(456) RuntimeException local456) {
			signlink.reporterror("23481, " + -772 + ", " + local456.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!KWBPZBYX;I)V")
	private void method600(@OriginalArg(0) Class4_Sub1_Sub2_Sub2 arg0) {
		try {
			for (@Pc(5) int local5 = 0; local5 < this.anIntArray247.length; local5++) {
				this.anIntArray247[local5] = 0;
			}
			@Pc(30) int local30;
			for (@Pc(20) int local20 = 0; local20 < 5000; local20++) {
				local30 = (int) (Math.random() * 128.0D * (double) 256);
				this.anIntArray247[local30] = (int) (Math.random() * 256.0D);
			}
			@Pc(48) int local48;
			@Pc(52) int local52;
			@Pc(60) int local60;
			for (local30 = 0; local30 < 20; local30++) {
				for (local48 = 1; local48 < 255; local48++) {
					for (local52 = 1; local52 < 127; local52++) {
						local60 = local52 + (local48 << 7);
						this.anIntArray248[local60] = (this.anIntArray247[local60 - 1] + this.anIntArray247[local60 + 1] + this.anIntArray247[local60 - 128] + this.anIntArray247[local60 + 128]) / 4;
					}
				}
				@Pc(106) int[] local106 = this.anIntArray247;
				this.anIntArray247 = this.anIntArray248;
				this.anIntArray248 = local106;
			}
			if (arg0 != null) {
				local48 = 0;
				for (local52 = 0; local52 < arg0.anInt396; local52++) {
					for (local60 = 0; local60 < arg0.anInt395; local60++) {
						if (arg0.aByteArray9[local48++] != 0) {
							@Pc(149) int local149 = local60 + arg0.anInt397 + 16;
							@Pc(156) int local156 = local52 + arg0.anInt398 + 16;
							@Pc(162) int local162 = local149 + (local156 << 7);
							this.anIntArray247[local162] = 0;
						}
					}
				}
			}
		} catch (@Pc(179) RuntimeException local179) {
			signlink.reporterror("83087, " + arg0 + ", " + 0 + ", " + local179.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(IILclient!PGNBHFUF;)V")
	private void method601(@OriginalArg(1) int arg0, @OriginalArg(2) Class4_Sub1_Sub4 arg1) {
		try {
			for (@Pc(1) int local1 = 0; local1 < this.anInt950; local1++) {
				@Pc(8) int local8 = this.anIntArray242[local1];
				@Pc(13) Class4_Sub1_Sub1_Sub2_Sub2 local13 = this.aClass4_Sub1_Sub1_Sub2_Sub2Array1[local8];
				@Pc(16) int local16 = arg1.method355();
				if ((local16 & 0x10) != 0) {
					local16 += arg1.method355() << 8;
				}
				this.method708(local8, local13, arg1, local16);
			}
		} catch (@Pc(46) RuntimeException local46) {
			signlink.reporterror("5628, " + 0 + ", " + arg0 + ", " + arg1 + ", " + local46.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(BLjava/lang/String;)Z")
	private boolean method602(@OriginalArg(1) String arg0) {
		try {
			if (arg0 == null) {
				return false;
			}
			for (@Pc(5) int local5 = 0; local5 < this.anInt957; local5++) {
				if (arg0.equalsIgnoreCase(this.aStringArray11[local5])) {
					return true;
				}
			}
			return arg0.equalsIgnoreCase(aClass4_Sub1_Sub1_Sub2_Sub2_1.aString15);
		} catch (@Pc(37) RuntimeException local37) {
			signlink.reporterror("92931, " + -124 + ", " + arg0 + ", " + local37.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ZII)V")
	private void method603(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1) {
		try {
			signlink.anInt1082 = arg1;
			if (arg0) {
				signlink.midi = "voladjust";
			}
		} catch (@Pc(18) RuntimeException local18) {
			signlink.reporterror("66180, " + arg0 + ", " + 7 + ", " + arg1 + ", " + local18.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "h", descriptor = "(I)V")
	private void method604() {
		try {
			anInt966++;
			if (anInt966 > 88) {
				anInt966 = 0;
				this.aClass4_Sub1_Sub4_7.method344(139);
			}
			for (@Pc(15) int local15 = 0; local15 < this.anInt1013; local15++) {
				@Pc(22) int local22 = this.anIntArray256[local15];
				@Pc(27) Class4_Sub1_Sub1_Sub2_Sub1 local27 = this.aClass4_Sub1_Sub1_Sub2_Sub1Array1[local22];
				if (local27 != null) {
					this.method605(local27, local27.aClass40_1.aByte25);
				}
			}
		} catch (@Pc(46) RuntimeException local46) {
			signlink.reporterror("20780, " + 4 + ", " + local46.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!EGCNSKZO;IZ)V")
	private void method605(@OriginalArg(0) Class4_Sub1_Sub1_Sub2 arg0, @OriginalArg(1) int arg1) {
		try {
			if (arg0.anInt764 < 128 || arg0.anInt765 < 128 || arg0.anInt764 >= 13184 || arg0.anInt765 >= 13184) {
				arg0.anInt777 = -1;
				arg0.anInt759 = -1;
				arg0.anInt749 = 0;
				arg0.anInt750 = 0;
				arg0.anInt764 = arg0.anIntArray187[0] * 128 + arg0.anInt756 * 64;
				arg0.anInt765 = arg0.anIntArray188[0] * 128 + arg0.anInt756 * 64;
				arg0.method560();
			}
			if (arg0 == aClass4_Sub1_Sub1_Sub2_Sub2_1 && (arg0.anInt764 < 1536 || arg0.anInt765 < 1536 || arg0.anInt764 >= 11776 || arg0.anInt765 >= 11776)) {
				arg0.anInt777 = -1;
				arg0.anInt759 = -1;
				arg0.anInt749 = 0;
				arg0.anInt750 = 0;
				arg0.anInt764 = arg0.anIntArray187[0] * 128 + arg0.anInt756 * 64;
				arg0.anInt765 = arg0.anIntArray188[0] * 128 + arg0.anInt756 * 64;
				arg0.method560();
			}
			if (arg0.anInt749 > anInt1054) {
				this.method606(arg0);
			} else if (arg0.anInt750 >= anInt1054) {
				this.method607(arg0);
			} else {
				this.method608(arg0);
			}
			this.method609(this.anInt967, arg0);
			this.method610(arg0);
		} catch (@Pc(158) RuntimeException local158) {
			signlink.reporterror("21253, " + arg0 + ", " + arg1 + ", " + false + ", " + local158.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ZLclient!EGCNSKZO;)V")
	private void method606(@OriginalArg(1) Class4_Sub1_Sub1_Sub2 arg0) {
		try {
			@Pc(4) int local4 = arg0.anInt749 - anInt1054;
			@Pc(14) int local14 = arg0.anInt745 * 128 + arg0.anInt756 * 64;
			@Pc(24) int local24 = arg0.anInt747 * 128 + arg0.anInt756 * 64;
			arg0.anInt764 += (local14 - arg0.anInt764) / local4;
			arg0.anInt765 += (local24 - arg0.anInt765) / local4;
			arg0.anInt767 = 0;
			if (arg0.anInt751 == 0) {
				arg0.anInt768 = 1024;
			}
			if (arg0.anInt751 == 1) {
				arg0.anInt768 = 1536;
			}
			if (arg0.anInt751 == 2) {
				arg0.anInt768 = 0;
			}
			if (arg0.anInt751 == 3) {
				arg0.anInt768 = 512;
			}
		} catch (@Pc(84) RuntimeException local84) {
			signlink.reporterror("12658, " + false + ", " + arg0 + ", " + local84.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!EGCNSKZO;I)V")
	private void method607(@OriginalArg(0) Class4_Sub1_Sub1_Sub2 arg0) {
		try {
			if (arg0.anInt750 == anInt1054 || arg0.anInt777 == -1 || arg0.anInt780 != 0 || arg0.anInt779 + 1 > Class21.aClass21Array1[arg0.anInt777].method275(this.anInt902, arg0.anInt778)) {
				@Pc(36) int local36 = arg0.anInt750 - arg0.anInt749;
				@Pc(41) int local41 = anInt1054 - arg0.anInt749;
				@Pc(51) int local51 = arg0.anInt745 * 128 + arg0.anInt756 * 64;
				@Pc(61) int local61 = arg0.anInt747 * 128 + arg0.anInt756 * 64;
				@Pc(71) int local71 = arg0.anInt746 * 128 + arg0.anInt756 * 64;
				@Pc(81) int local81 = arg0.anInt748 * 128 + arg0.anInt756 * 64;
				arg0.anInt764 = (local51 * (local36 - local41) + local71 * local41) / local36;
				arg0.anInt765 = (local61 * (local36 - local41) + local81 * local41) / local36;
			}
			arg0.anInt767 = 0;
			if (arg0.anInt751 == 0) {
				arg0.anInt768 = 1024;
			}
			if (arg0.anInt751 == 1) {
				arg0.anInt768 = 1536;
			}
			if (arg0.anInt751 == 2) {
				arg0.anInt768 = 0;
			}
			if (arg0.anInt751 == 3) {
				arg0.anInt768 = 512;
			}
			arg0.anInt766 = arg0.anInt768;
		} catch (@Pc(143) RuntimeException local143) {
			signlink.reporterror("72721, " + arg0 + ", " + 3 + ", " + local143.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(ZLclient!EGCNSKZO;)V")
	private void method608(@OriginalArg(1) Class4_Sub1_Sub1_Sub2 arg0) {
		try {
			arg0.anInt752 = arg0.anInt787;
			this.aBoolean251 &= true;
			if (arg0.anInt758 == 0) {
				arg0.anInt767 = 0;
			} else {
				if (arg0.anInt777 != -1 && arg0.anInt780 == 0) {
					@Pc(30) Class21 local30 = Class21.aClass21Array1[arg0.anInt777];
					if (arg0.anInt776 > 0 && local30.anInt375 == 0) {
						arg0.anInt767++;
						return;
					}
					if (arg0.anInt776 <= 0 && local30.anInt376 == 0) {
						arg0.anInt767++;
						return;
					}
				}
				@Pc(59) int local59 = arg0.anInt764;
				@Pc(62) int local62 = arg0.anInt765;
				@Pc(77) int local77 = arg0.anIntArray187[arg0.anInt758 - 1] * 128 + arg0.anInt756 * 64;
				@Pc(92) int local92 = arg0.anIntArray188[arg0.anInt758 - 1] * 128 + arg0.anInt756 * 64;
				if (local77 - local59 <= 256 && local77 - local59 >= -256 && local92 - local62 <= 256 && local92 - local62 >= -256) {
					if (local59 < local77) {
						if (local62 < local92) {
							arg0.anInt768 = 1280;
						} else if (local62 > local92) {
							arg0.anInt768 = 1792;
						} else {
							arg0.anInt768 = 1536;
						}
					} else if (local59 > local77) {
						if (local62 < local92) {
							arg0.anInt768 = 768;
						} else if (local62 > local92) {
							arg0.anInt768 = 256;
						} else {
							arg0.anInt768 = 512;
						}
					} else if (local62 < local92) {
						arg0.anInt768 = 1024;
					} else {
						arg0.anInt768 = 0;
					}
					@Pc(186) int local186 = arg0.anInt768 - arg0.anInt766 & 0x7FF;
					if (local186 > 1024) {
						local186 -= 2048;
					}
					@Pc(193) int local193 = arg0.anInt772;
					if (local186 >= -256 && local186 <= 256) {
						local193 = arg0.anInt771;
					} else if (local186 >= 256 && local186 < 768) {
						local193 = arg0.anInt774;
					} else if (local186 >= -768 && local186 <= -256) {
						local193 = arg0.anInt773;
					}
					if (local193 == -1) {
						local193 = arg0.anInt771;
					}
					arg0.anInt752 = local193;
					@Pc(235) int local235 = 4;
					if (arg0.anInt766 != arg0.anInt768 && arg0.anInt769 == -1 && arg0.anInt757 != 0) {
						local235 = 2;
					}
					if (arg0.anInt758 > 2) {
						local235 = 6;
					}
					if (arg0.anInt758 > 3) {
						local235 = 8;
					}
					if (arg0.anInt767 > 0 && arg0.anInt758 > 1) {
						local235 = 8;
						arg0.anInt767--;
					}
					if (arg0.aBooleanArray10[arg0.anInt758 - 1]) {
						local235 <<= 0x1;
					}
					if (local235 >= 8 && arg0.anInt752 == arg0.anInt771 && arg0.anInt783 != -1) {
						arg0.anInt752 = arg0.anInt783;
					}
					if (local59 < local77) {
						arg0.anInt764 += local235;
						if (arg0.anInt764 > local77) {
							arg0.anInt764 = local77;
						}
					} else if (local59 > local77) {
						arg0.anInt764 -= local235;
						if (arg0.anInt764 < local77) {
							arg0.anInt764 = local77;
						}
					}
					if (local62 < local92) {
						arg0.anInt765 += local235;
						if (arg0.anInt765 > local92) {
							arg0.anInt765 = local92;
						}
					} else if (local62 > local92) {
						arg0.anInt765 -= local235;
						if (arg0.anInt765 < local92) {
							arg0.anInt765 = local92;
						}
					}
					if (arg0.anInt764 == local77 && arg0.anInt765 == local92) {
						arg0.anInt758--;
						if (arg0.anInt776 > 0) {
							arg0.anInt776--;
							return;
						}
					}
				} else {
					arg0.anInt764 = local77;
					arg0.anInt765 = local92;
				}
			}
		} catch (@Pc(397) RuntimeException local397) {
			signlink.reporterror("54914, " + true + ", " + arg0 + ", " + local397.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILclient!EGCNSKZO;)V")
	private void method609(@OriginalArg(0) int arg0, @OriginalArg(1) Class4_Sub1_Sub1_Sub2 arg1) {
		try {
			while (arg0 >= 0) {
				this.aClass4_Sub1_Sub4_7.method345(15);
			}
			if (arg1.anInt757 != 0) {
				@Pc(35) int local35;
				@Pc(41) int local41;
				if (arg1.anInt769 != -1 && arg1.anInt769 < 32768) {
					@Pc(27) Class4_Sub1_Sub1_Sub2_Sub1 local27 = this.aClass4_Sub1_Sub1_Sub2_Sub1Array1[arg1.anInt769];
					if (local27 != null) {
						local35 = arg1.anInt764 - local27.anInt764;
						local41 = arg1.anInt765 - local27.anInt765;
						if (local35 != 0 || local41 != 0) {
							arg1.anInt768 = (int) (Math.atan2((double) local35, (double) local41) * 325.949D) & 0x7FF;
						}
					}
				}
				@Pc(66) int local66;
				if (arg1.anInt769 >= 32768) {
					local66 = arg1.anInt769 - 32768;
					if (local66 == this.anInt1014) {
						local66 = this.anInt948;
					}
					@Pc(78) Class4_Sub1_Sub1_Sub2_Sub2 local78 = this.aClass4_Sub1_Sub1_Sub2_Sub2Array1[local66];
					if (local78 != null) {
						local41 = arg1.anInt764 - local78.anInt764;
						@Pc(92) int local92 = arg1.anInt765 - local78.anInt765;
						if (local41 != 0 || local92 != 0) {
							arg1.anInt768 = (int) (Math.atan2((double) local41, (double) local92) * 325.949D) & 0x7FF;
						}
					}
				}
				if ((arg1.anInt743 != 0 || arg1.anInt744 != 0) && (arg1.anInt758 == 0 || arg1.anInt767 > 0)) {
					local66 = arg1.anInt764 - (arg1.anInt743 - this.anInt1056 - this.anInt1056) * 64;
					local35 = arg1.anInt765 - (arg1.anInt744 - this.anInt1057 - this.anInt1057) * 64;
					if (local66 != 0 || local35 != 0) {
						arg1.anInt768 = (int) (Math.atan2((double) local66, (double) local35) * 325.949D) & 0x7FF;
					}
					arg1.anInt743 = 0;
					arg1.anInt744 = 0;
				}
				local66 = arg1.anInt768 - arg1.anInt766 & 0x7FF;
				if (local66 != 0) {
					if (local66 < arg1.anInt757 || local66 > 2048 - arg1.anInt757) {
						arg1.anInt766 = arg1.anInt768;
					} else if (local66 > 1024) {
						arg1.anInt766 -= arg1.anInt757;
					} else {
						arg1.anInt766 += arg1.anInt757;
					}
					arg1.anInt766 &= 0x7FF;
					if (arg1.anInt752 == arg1.anInt787 && arg1.anInt766 != arg1.anInt768) {
						if (arg1.anInt788 != -1) {
							arg1.anInt752 = arg1.anInt788;
							return;
						}
						arg1.anInt752 = arg1.anInt771;
						return;
					}
				}
			}
		} catch (@Pc(246) RuntimeException local246) {
			signlink.reporterror("66110, " + arg0 + ", " + arg1 + ", " + local246.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!EGCNSKZO;B)V")
	private void method610(@OriginalArg(0) Class4_Sub1_Sub1_Sub2 arg0) {
		try {
			arg0.aBoolean198 = false;
			@Pc(17) Class21 local17;
			if (arg0.anInt752 != -1) {
				local17 = Class21.aClass21Array1[arg0.anInt752];
				arg0.anInt754++;
				if (arg0.anInt753 < local17.anInt369 && arg0.anInt754 > local17.method275(this.anInt902, arg0.anInt753)) {
					arg0.anInt754 = 0;
					arg0.anInt753++;
				}
				if (arg0.anInt753 >= local17.anInt369) {
					arg0.anInt754 = 0;
					arg0.anInt753 = 0;
				}
			}
			if (arg0.anInt759 != -1 && anInt1054 >= arg0.anInt762) {
				if (arg0.anInt760 < 0) {
					arg0.anInt760 = 0;
				}
				local17 = Class6.aClass6Array1[arg0.anInt759].aClass21_1;
				arg0.anInt761++;
				while (arg0.anInt760 < local17.anInt369 && arg0.anInt761 > local17.method275(this.anInt902, arg0.anInt760)) {
					arg0.anInt761 -= local17.method275(this.anInt902, arg0.anInt760);
					arg0.anInt760++;
				}
				if (arg0.anInt760 >= local17.anInt369 && (arg0.anInt760 < 0 || arg0.anInt760 >= local17.anInt369)) {
					arg0.anInt759 = -1;
				}
			}
			if (arg0.anInt777 != -1 && arg0.anInt780 <= 1) {
				local17 = Class21.aClass21Array1[arg0.anInt777];
				if (local17.anInt375 == 1 && arg0.anInt776 > 0 && arg0.anInt749 <= anInt1054 && arg0.anInt750 < anInt1054) {
					arg0.anInt780 = 1;
					return;
				}
			}
			if (arg0.anInt777 != -1 && arg0.anInt780 == 0) {
				local17 = Class21.aClass21Array1[arg0.anInt777];
				arg0.anInt779++;
				while (arg0.anInt778 < local17.anInt369 && arg0.anInt779 > local17.method275(this.anInt902, arg0.anInt778)) {
					arg0.anInt779 -= local17.method275(this.anInt902, arg0.anInt778);
					arg0.anInt778++;
				}
				if (arg0.anInt778 >= local17.anInt369) {
					arg0.anInt778 -= local17.anInt370;
					arg0.anInt781++;
					if (arg0.anInt781 >= local17.anInt374) {
						arg0.anInt777 = -1;
					}
					if (arg0.anInt778 < 0 || arg0.anInt778 >= local17.anInt369) {
						arg0.anInt777 = -1;
					}
				}
				arg0.aBoolean198 = local17.aBoolean100;
			}
			if (arg0.anInt780 > 0) {
				arg0.anInt780--;
			}
		} catch (@Pc(267) RuntimeException local267) {
			signlink.reporterror("2807, " + arg0 + ", " + 1 + ", " + local267.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(B)V")
	private void method611() {
		try {
			if (this.anInt1015 == -1 || this.anInt946 != 2 && super.aClass25_2 == null) {
				@Pc(275) int local275;
				if (this.aBoolean243) {
					this.method636();
					this.aBoolean243 = false;
					this.aClass25_3.method303(0, 4, super.aGraphics2);
					this.aClass25_4.method303(0, 357, super.aGraphics2);
					this.aClass25_5.method303(722, 4, super.aGraphics2);
					this.aClass25_6.method303(743, 205, super.aGraphics2);
					this.aClass25_7.method303(0, 0, super.aGraphics2);
					this.aClass25_8.method303(516, 4, super.aGraphics2);
					this.aClass25_9.method303(516, 205, super.aGraphics2);
					this.aClass25_10.method303(496, 357, super.aGraphics2);
					this.aClass25_11.method303(0, 338, super.aGraphics2);
					this.aBoolean246 = true;
					this.aBoolean247 = true;
					this.aBoolean254 = true;
					this.aBoolean250 = true;
					if (this.anInt946 != 2) {
						this.aClass25_23.method303(4, 4, super.aGraphics2);
						this.aClass25_22.method303(550, 4, super.aGraphics2);
					}
					anInt963++;
					if (anInt963 > 1212) {
						anInt963 = 0;
						this.aClass4_Sub1_Sub4_7.method344(186);
						this.aClass4_Sub1_Sub4_7.method345(0);
						local275 = this.aClass4_Sub1_Sub4_7.anInt506;
						this.aClass4_Sub1_Sub4_7.method345(215);
						if ((int) (Math.random() * 2.0D) == 0) {
							this.aClass4_Sub1_Sub4_7.method345(193);
						}
						this.aClass4_Sub1_Sub4_7.method345((int) (Math.random() * 256.0D));
						this.aClass4_Sub1_Sub4_7.method346((int) (Math.random() * 65536.0D));
						this.aClass4_Sub1_Sub4_7.method345((int) (Math.random() * 256.0D));
						this.aClass4_Sub1_Sub4_7.method346(42728);
						this.aClass4_Sub1_Sub4_7.method346(52291);
						if ((int) (Math.random() * 2.0D) == 0) {
							this.aClass4_Sub1_Sub4_7.method345(186);
						}
						this.aClass4_Sub1_Sub4_7.method346(18581);
						this.aClass4_Sub1_Sub4_7.method345(44);
						this.aClass4_Sub1_Sub4_7.method354((byte) 5, this.aClass4_Sub1_Sub4_7.anInt506 - local275);
					}
				}
				if (this.anInt946 == 2) {
					this.method675();
				}
				if (this.aBoolean228 && this.anInt897 == 1) {
					this.aBoolean246 = true;
				}
				@Pc(372) boolean local372;
				if (this.anInt995 != -1) {
					local372 = this.method590(this.anInt1043, anInt868, this.anInt995);
					if (local372) {
						this.aBoolean246 = true;
					}
				}
				if (this.anInt1049 == 2) {
					this.aBoolean246 = true;
				}
				if (this.anInt1040 == 2) {
					this.aBoolean246 = true;
				}
				if (this.aBoolean246) {
					this.method702();
					this.aBoolean246 = false;
				}
				if (this.anInt955 == -1 && this.anInt996 == 0) {
					this.aClass28_1.anInt449 = this.anInt870 - this.anInt1074 - 77;
					if (super.anInt835 > 448 && super.anInt835 < 560 && super.anInt836 > 332) {
						this.method595(super.anInt836 - 357, 0, this.aClass28_1, 463, -1, 706, super.anInt835 - 17, this.anInt870, 77);
					}
					local275 = this.anInt870 - this.aClass28_1.anInt449 - 77;
					if (local275 < 0) {
						local275 = 0;
					}
					if (local275 > this.anInt870 - 77) {
						local275 = this.anInt870 - 77;
					}
					if (this.anInt1074 != local275) {
						this.anInt1074 = local275;
						this.aBoolean247 = true;
					}
					anInt977++;
					if (anInt977 > 129) {
						anInt977 = 0;
						this.aClass4_Sub1_Sub4_7.method344(134);
						this.aClass4_Sub1_Sub4_7.method349(0);
					}
				}
				if (this.anInt955 == -1 && this.anInt996 == 3) {
					local275 = this.anInt938 * 14 + 7;
					this.aClass28_1.anInt449 = this.anInt939;
					if (super.anInt835 > 448 && super.anInt835 < 560 && super.anInt836 > 332) {
						this.method595(super.anInt836 - 357, 0, this.aClass28_1, 463, -1, 706, super.anInt835 - 17, local275, 77);
					}
					@Pc(554) int local554 = this.aClass28_1.anInt449;
					if (local554 < 0) {
						local554 = 0;
					}
					if (local554 > local275 - 77) {
						local554 = local275 - 77;
					}
					if (this.anInt939 != local554) {
						this.anInt939 = local554;
						this.aBoolean247 = true;
					}
				}
				if (this.anInt955 != -1) {
					local372 = this.method590(this.anInt1043, anInt868, this.anInt955);
					if (local372) {
						this.aBoolean247 = true;
					}
				}
				if (this.anInt1049 == 3) {
					this.aBoolean247 = true;
				}
				if (this.anInt1040 == 3) {
					this.aBoolean247 = true;
				}
				if (this.aString24 != null) {
					this.aBoolean247 = true;
				}
				if (this.aBoolean228 && this.anInt897 == 2) {
					this.aBoolean247 = true;
				}
				if (this.aBoolean247) {
					this.method660();
					this.aBoolean247 = false;
				}
				if (this.anInt946 == 2) {
					this.method616();
					this.aClass25_22.method303(550, 4, super.aGraphics2);
				}
				if (this.anInt1010 != -1) {
					this.aBoolean254 = true;
				}
				if (this.aBoolean254) {
					if (this.anInt1010 != -1 && this.anInt1010 == this.anInt994) {
						this.anInt1010 = -1;
						this.aClass4_Sub1_Sub4_7.method344(237);
						this.aClass4_Sub1_Sub4_7.method345(this.anInt994);
					}
					this.aBoolean254 = false;
					this.aClass25_27.method302(this.aBoolean230);
					this.aClass4_Sub1_Sub2_Sub2_20.method296(0, 0);
					if (this.anInt995 == -1) {
						if (this.anIntArray255[this.anInt994] != -1) {
							if (this.anInt994 == 0) {
								this.aClass4_Sub1_Sub2_Sub2_1.method296(22, 10);
							}
							if (this.anInt994 == 1) {
								this.aClass4_Sub1_Sub2_Sub2_2.method296(54, 8);
							}
							if (this.anInt994 == 2) {
								this.aClass4_Sub1_Sub2_Sub2_2.method296(82, 8);
							}
							if (this.anInt994 == 3) {
								this.aClass4_Sub1_Sub2_Sub2_3.method296(110, 8);
							}
							if (this.anInt994 == 4) {
								this.aClass4_Sub1_Sub2_Sub2_5.method296(153, 8);
							}
							if (this.anInt994 == 5) {
								this.aClass4_Sub1_Sub2_Sub2_5.method296(181, 8);
							}
							if (this.anInt994 == 6) {
								this.aClass4_Sub1_Sub2_Sub2_4.method296(209, 9);
							}
						}
						if (this.anIntArray255[0] != -1 && (this.anInt1010 != 0 || anInt1054 % 20 < 10)) {
							this.aClass4_Sub1_Sub2_Sub2Array3[0].method296(29, 13);
						}
						if (this.anIntArray255[1] != -1 && (this.anInt1010 != 1 || anInt1054 % 20 < 10)) {
							this.aClass4_Sub1_Sub2_Sub2Array3[1].method296(53, 11);
						}
						if (this.anIntArray255[2] != -1 && (this.anInt1010 != 2 || anInt1054 % 20 < 10)) {
							this.aClass4_Sub1_Sub2_Sub2Array3[2].method296(82, 11);
						}
						if (this.anIntArray255[3] != -1 && (this.anInt1010 != 3 || anInt1054 % 20 < 10)) {
							this.aClass4_Sub1_Sub2_Sub2Array3[3].method296(115, 12);
						}
						if (this.anIntArray255[4] != -1 && (this.anInt1010 != 4 || anInt1054 % 20 < 10)) {
							this.aClass4_Sub1_Sub2_Sub2Array3[4].method296(153, 13);
						}
						if (this.anIntArray255[5] != -1 && (this.anInt1010 != 5 || anInt1054 % 20 < 10)) {
							this.aClass4_Sub1_Sub2_Sub2Array3[5].method296(180, 11);
						}
						if (this.anIntArray255[6] != -1 && (this.anInt1010 != 6 || anInt1054 % 20 < 10)) {
							this.aClass4_Sub1_Sub2_Sub2Array3[6].method296(208, 13);
						}
					}
					this.aClass25_27.method303(516, 160, super.aGraphics2);
					this.aClass25_26.method302(this.aBoolean230);
					this.aClass4_Sub1_Sub2_Sub2_19.method296(0, 0);
					if (this.anInt995 == -1) {
						if (this.anIntArray255[this.anInt994] != -1) {
							if (this.anInt994 == 7) {
								this.aClass4_Sub1_Sub2_Sub2_8.method296(42, 0);
							}
							if (this.anInt994 == 8) {
								this.aClass4_Sub1_Sub2_Sub2_9.method296(74, 0);
							}
							if (this.anInt994 == 9) {
								this.aClass4_Sub1_Sub2_Sub2_9.method296(102, 0);
							}
							if (this.anInt994 == 10) {
								this.aClass4_Sub1_Sub2_Sub2_10.method296(130, 1);
							}
							if (this.anInt994 == 11) {
								this.aClass4_Sub1_Sub2_Sub2_12.method296(173, 0);
							}
							if (this.anInt994 == 12) {
								this.aClass4_Sub1_Sub2_Sub2_12.method296(201, 0);
							}
							if (this.anInt994 == 13) {
								this.aClass4_Sub1_Sub2_Sub2_11.method296(229, 0);
							}
						}
						if (this.anIntArray255[8] != -1 && (this.anInt1010 != 8 || anInt1054 % 20 < 10)) {
							this.aClass4_Sub1_Sub2_Sub2Array3[7].method296(74, 2);
						}
						if (this.anIntArray255[9] != -1 && (this.anInt1010 != 9 || anInt1054 % 20 < 10)) {
							this.aClass4_Sub1_Sub2_Sub2Array3[8].method296(102, 3);
						}
						if (this.anIntArray255[10] != -1 && (this.anInt1010 != 10 || anInt1054 % 20 < 10)) {
							this.aClass4_Sub1_Sub2_Sub2Array3[9].method296(137, 4);
						}
						if (this.anIntArray255[11] != -1 && (this.anInt1010 != 11 || anInt1054 % 20 < 10)) {
							this.aClass4_Sub1_Sub2_Sub2Array3[10].method296(174, 2);
						}
						if (this.anIntArray255[12] != -1 && (this.anInt1010 != 12 || anInt1054 % 20 < 10)) {
							this.aClass4_Sub1_Sub2_Sub2Array3[11].method296(201, 2);
						}
						if (this.anIntArray255[13] != -1 && (this.anInt1010 != 13 || anInt1054 % 20 < 10)) {
							this.aClass4_Sub1_Sub2_Sub2Array3[12].method296(226, 2);
						}
					}
					this.aClass25_26.method303(496, 466, super.aGraphics2);
					this.aClass25_23.method302(this.aBoolean230);
					Class4_Sub1_Sub2_Sub1.anIntArray27 = this.anIntArray275;
				}
				if (this.aBoolean250) {
					this.aBoolean250 = false;
					this.aClass25_25.method302(this.aBoolean230);
					this.aClass4_Sub1_Sub2_Sub2_18.method296(0, 0);
					this.aClass4_Sub1_Sub2_Sub4_3.method505("Public chat", 16777215, true, 28, 55);
					if (this.anInt978 == 0) {
						this.aClass4_Sub1_Sub2_Sub4_3.method505("On", 65280, true, 41, 55);
					}
					if (this.anInt978 == 1) {
						this.aClass4_Sub1_Sub2_Sub4_3.method505("Friends", 16776960, true, 41, 55);
					}
					if (this.anInt978 == 2) {
						this.aClass4_Sub1_Sub2_Sub4_3.method505("Off", 16711680, true, 41, 55);
					}
					if (this.anInt978 == 3) {
						this.aClass4_Sub1_Sub2_Sub4_3.method505("Hide", 65535, true, 41, 55);
					}
					this.aClass4_Sub1_Sub2_Sub4_3.method505("Private chat", 16777215, true, 28, 184);
					if (this.anInt970 == 0) {
						this.aClass4_Sub1_Sub2_Sub4_3.method505("On", 65280, true, 41, 184);
					}
					if (this.anInt970 == 1) {
						this.aClass4_Sub1_Sub2_Sub4_3.method505("Friends", 16776960, true, 41, 184);
					}
					if (this.anInt970 == 2) {
						this.aClass4_Sub1_Sub2_Sub4_3.method505("Off", 16711680, true, 41, 184);
					}
					this.aClass4_Sub1_Sub2_Sub4_3.method505("Trade/compete", 16777215, true, 28, 324);
					if (this.anInt1002 == 0) {
						this.aClass4_Sub1_Sub2_Sub4_3.method505("On", 65280, true, 41, 324);
					}
					if (this.anInt1002 == 1) {
						this.aClass4_Sub1_Sub2_Sub4_3.method505("Friends", 16776960, true, 41, 324);
					}
					if (this.anInt1002 == 2) {
						this.aClass4_Sub1_Sub2_Sub4_3.method505("Off", 16711680, true, 41, 324);
					}
					this.aClass4_Sub1_Sub2_Sub4_3.method505("Report abuse", 16777215, true, 33, 458);
					this.aClass25_25.method303(0, 453, super.aGraphics2);
					this.aClass25_23.method302(this.aBoolean230);
					Class4_Sub1_Sub2_Sub1.anIntArray27 = this.anIntArray275;
				}
				this.anInt1043 = 0;
			} else {
				if (this.anInt946 == 2) {
					this.method590(this.anInt1043, anInt868, this.anInt1015);
					if (this.anInt988 != -1) {
						this.method590(this.anInt1043, anInt868, this.anInt988);
					}
					this.anInt1043 = 0;
					this.method613();
					super.aClass25_2.method302(this.aBoolean230);
					Class4_Sub1_Sub2_Sub1.anIntArray27 = this.anIntArray276;
					Class4_Sub1_Sub2.method494();
					this.aBoolean243 = true;
					@Pc(61) Class28 local61 = Class28.method318(this.anInt1015);
					if (local61.anInt426 == 512 && local61.anInt423 == 334 && local61.anInt447 == 0) {
						local61.anInt426 = 765;
						local61.anInt423 = 503;
					}
					this.method688(0, local61, 0, 0);
					if (this.anInt988 != -1) {
						local61 = Class28.method318(this.anInt988);
						if (local61.anInt426 == 512 && local61.anInt423 == 334 && local61.anInt447 == 0) {
							local61.anInt426 = 765;
							local61.anInt423 = 503;
						}
						this.method688(0, local61, 0, 0);
					}
					if (this.aBoolean228) {
						this.method680();
					} else {
						this.method597(566);
						this.method637();
					}
				}
				super.aClass25_2.method303(0, 0, super.aGraphics2);
			}
		} catch (@Pc(1389) RuntimeException local1389) {
			signlink.reporterror("16246, " + 85 + ", " + local1389.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "i", descriptor = "(I)V")
	private void method612() {
		try {
			this.anInt927 = 0;
			@Pc(74) int local74;
			for (@Pc(10) int local10 = -1; local10 < this.anInt949 + this.anInt1013; local10++) {
				@Pc(17) Class4_Sub1_Sub1_Sub2 local17;
				if (local10 == -1) {
					local17 = aClass4_Sub1_Sub1_Sub2_Sub2_1;
				} else if (local10 < this.anInt949) {
					local17 = this.aClass4_Sub1_Sub1_Sub2_Sub2Array1[this.anIntArray241[local10]];
				} else {
					local17 = this.aClass4_Sub1_Sub1_Sub2_Sub1Array1[this.anIntArray256[local10 - this.anInt949]];
				}
				if (local17 != null && local17.method562()) {
					@Pc(58) Class40 local58;
					if (local17 instanceof Class4_Sub1_Sub1_Sub2_Sub1) {
						local58 = ((Class4_Sub1_Sub1_Sub2_Sub1) local17).aClass40_1;
						if (local58.anIntArray155 != null) {
							local58 = local58.method482((byte) 3);
						}
						if (local58 == null) {
							continue;
						}
					}
					if (local10 >= this.anInt949) {
						local58 = ((Class4_Sub1_Sub1_Sub2_Sub1) local17).aClass40_1;
						if (local58.anInt647 >= 0 && local58.anInt647 < this.aClass4_Sub1_Sub2_Sub3Array5.length) {
							this.method694(local17, local17.anInt775 + 15);
							if (this.anInt883 > -1) {
								this.aClass4_Sub1_Sub2_Sub3Array5[local58.anInt647].method466(this.anInt883 - 12, this.anInt884 - 30);
							}
						}
						if (this.anInt954 == 1 && this.anInt1018 == this.anIntArray256[local10 - this.anInt949] && anInt1054 % 20 < 10) {
							this.method694(local17, local17.anInt775 + 15);
							if (this.anInt883 > -1) {
								this.aClass4_Sub1_Sub2_Sub3Array4[0].method466(this.anInt883 - 12, this.anInt884 - 28);
							}
						}
					} else {
						local74 = 30;
						@Pc(77) Class4_Sub1_Sub1_Sub2_Sub2 local77 = (Class4_Sub1_Sub1_Sub2_Sub2) local17;
						if (local77.anInt800 != -1 || local77.anInt796 != -1) {
							this.method694(local17, local17.anInt775 + 15);
							if (this.anInt883 > -1) {
								if (local77.anInt800 != -1) {
									this.aClass4_Sub1_Sub2_Sub3Array9[local77.anInt800].method466(this.anInt883 - 12, this.anInt884 - 30);
									local74 += 25;
								}
								if (local77.anInt796 != -1) {
									this.aClass4_Sub1_Sub2_Sub3Array5[local77.anInt796].method466(this.anInt883 - 12, this.anInt884 - local74);
									local74 += 25;
								}
							}
						}
						if (local10 >= 0 && this.anInt954 == 10 && this.anInt887 == this.anIntArray241[local10]) {
							this.method694(local17, local17.anInt775 + 15);
							if (this.anInt883 > -1) {
								this.aClass4_Sub1_Sub2_Sub3Array4[1].method466(this.anInt883 - 12, this.anInt884 - local74);
							}
						}
					}
					if (local17.aString14 != null && (local10 >= this.anInt949 || this.anInt978 == 0 || this.anInt978 == 3 || this.anInt978 == 1 && this.method602(((Class4_Sub1_Sub1_Sub2_Sub2) local17).aString15))) {
						this.method694(local17, local17.anInt775);
						if (this.anInt883 > -1 && this.anInt927 < this.anInt928) {
							this.anIntArray227[this.anInt927] = this.aClass4_Sub1_Sub2_Sub4_4.method507(local17.aString14) / 2;
							this.anIntArray226[this.anInt927] = this.aClass4_Sub1_Sub2_Sub4_4.anInt699;
							this.anIntArray224[this.anInt927] = this.anInt883;
							this.anIntArray225[this.anInt927] = this.anInt884;
							this.anIntArray228[this.anInt927] = local17.anInt755;
							this.anIntArray229[this.anInt927] = local17.anInt789;
							this.anIntArray230[this.anInt927] = local17.anInt770;
							this.aStringArray8[this.anInt927++] = local17.aString14;
							if (this.anInt956 == 0 && local17.anInt789 >= 1 && local17.anInt789 <= 3) {
								this.anIntArray226[this.anInt927] += 10;
								this.anIntArray225[this.anInt927] += 5;
							}
							if (this.anInt956 == 0 && local17.anInt789 == 4) {
								this.anIntArray227[this.anInt927] = 60;
							}
							if (this.anInt956 == 0 && local17.anInt789 == 5) {
								this.anIntArray226[this.anInt927] += 5;
							}
						}
					}
					if (local17.anInt784 > anInt1054) {
						this.method694(local17, local17.anInt775 + 15);
						if (this.anInt883 > -1) {
							local74 = local17.anInt785 * 30 / local17.anInt786;
							if (local74 > 30) {
								local74 = 30;
							}
							Class4_Sub1_Sub2.method496(this.anInt883 - 15, 65280, local74, 5, this.anInt884 - 3);
							Class4_Sub1_Sub2.method496(this.anInt883 + local74 - 15, 16711680, 30 - local74, 5, this.anInt884 - 3);
						}
					}
					for (local74 = 0; local74 < 4; local74++) {
						if (local17.anIntArray186[local74] > anInt1054) {
							this.method694(local17, local17.anInt775 / 2);
							if (this.anInt883 > -1) {
								if (local74 == 1) {
									this.anInt884 -= 20;
								}
								if (local74 == 2) {
									this.anInt883 -= 15;
									this.anInt884 -= 10;
								}
								if (local74 == 3) {
									this.anInt883 += 15;
									this.anInt884 -= 10;
								}
								this.aClass4_Sub1_Sub2_Sub3Array8[local17.anIntArray185[local74]].method466(this.anInt883 - 12, this.anInt884 - 12);
								this.aClass4_Sub1_Sub2_Sub4_2.method504(this.anInt883, this.anInt884 + 4, String.valueOf(local17.anIntArray184[local74]), 0);
								this.aClass4_Sub1_Sub2_Sub4_2.method504(this.anInt883 - 1, this.anInt884 + 3, String.valueOf(local17.anIntArray184[local74]), 16777215);
							}
						}
					}
				}
			}
			for (@Pc(614) int local614 = 0; local614 < this.anInt927; local614++) {
				local74 = this.anIntArray224[local614];
				@Pc(626) int local626 = this.anIntArray225[local614];
				@Pc(631) int local631 = this.anIntArray227[local614];
				@Pc(636) int local636 = this.anIntArray226[local614];
				@Pc(638) boolean local638 = true;
				while (local638) {
					local638 = false;
					for (@Pc(644) int local644 = 0; local644 < local614; local644++) {
						if (local626 + 2 > this.anIntArray225[local644] - this.anIntArray226[local644] && local626 - local636 < this.anIntArray225[local644] + 2 && local74 - local631 < this.anIntArray224[local644] + this.anIntArray227[local644] && local74 + local631 > this.anIntArray224[local644] - this.anIntArray227[local644] && this.anIntArray225[local644] - this.anIntArray226[local644] < local626) {
							local626 = this.anIntArray225[local644] - this.anIntArray226[local644];
							local638 = true;
						}
					}
				}
				this.anInt883 = this.anIntArray224[local614];
				this.anInt884 = this.anIntArray225[local614] = local626;
				@Pc(743) String local743 = this.aStringArray8[local614];
				if (this.anInt956 == 0) {
					@Pc(748) int local748 = 16776960;
					if (this.anIntArray228[local614] < 6) {
						local748 = this.anIntArray234[this.anIntArray228[local614]];
					}
					if (this.anIntArray228[local614] == 6) {
						local748 = this.anInt858 % 20 < 10 ? 16711680 : 16776960;
					}
					if (this.anIntArray228[local614] == 7) {
						local748 = this.anInt858 % 20 < 10 ? 255 : 65535;
					}
					if (this.anIntArray228[local614] == 8) {
						local748 = this.anInt858 % 20 < 10 ? 45056 : 8454016;
					}
					@Pc(823) int local823;
					if (this.anIntArray228[local614] == 9) {
						local823 = 150 - this.anIntArray230[local614];
						if (local823 < 50) {
							local748 = local823 * 1280 + 16711680;
						} else if (local823 < 100) {
							local748 = 16776960 - (local823 - 50) * 327680;
						} else if (local823 < 150) {
							local748 = (local823 - 100) * 5 + 65280;
						}
					}
					if (this.anIntArray228[local614] == 10) {
						local823 = 150 - this.anIntArray230[local614];
						if (local823 < 50) {
							local748 = local823 * 5 + 16711680;
						} else if (local823 < 100) {
							local748 = 16711935 - (local823 - 50) * 327680;
						} else if (local823 < 150) {
							local748 = (local823 - 100) * 327680 + 255 - (local823 - 100) * 5;
						}
					}
					if (this.anIntArray228[local614] == 11) {
						local823 = 150 - this.anIntArray230[local614];
						if (local823 < 50) {
							local748 = 16777215 - local823 * 327685;
						} else if (local823 < 100) {
							local748 = (local823 - 50) * 327685 + 65280;
						} else if (local823 < 150) {
							local748 = 16777215 - (local823 - 100) * 327680;
						}
					}
					if (this.anIntArray229[local614] == 0) {
						this.aClass4_Sub1_Sub2_Sub4_4.method504(this.anInt883, this.anInt884 + 1, local743, 0);
						this.aClass4_Sub1_Sub2_Sub4_4.method504(this.anInt883, this.anInt884, local743, local748);
					}
					if (this.anIntArray229[local614] == 1) {
						this.aClass4_Sub1_Sub2_Sub4_4.method509(this.anInt884 + 1, 0, this.anInt883, this.anInt858, local743);
						this.aClass4_Sub1_Sub2_Sub4_4.method509(this.anInt884, local748, this.anInt883, this.anInt858, local743);
					}
					if (this.anIntArray229[local614] == 2) {
						this.aClass4_Sub1_Sub2_Sub4_4.method510(this.anInt884 + 1, (byte) 8, this.anInt858, local743, this.anInt883, 0);
						this.aClass4_Sub1_Sub2_Sub4_4.method510(this.anInt884, (byte) 8, this.anInt858, local743, this.anInt883, local748);
					}
					if (this.anIntArray229[local614] == 3) {
						this.aClass4_Sub1_Sub2_Sub4_4.method511(this.anInt858, 0, this.anInt883, local743, this.anInt884 + 1, 150 - this.anIntArray230[local614]);
						this.aClass4_Sub1_Sub2_Sub4_4.method511(this.anInt858, local748, this.anInt883, local743, this.anInt884, 150 - this.anIntArray230[local614]);
					}
					@Pc(1120) int local1120;
					if (this.anIntArray229[local614] == 4) {
						local823 = this.aClass4_Sub1_Sub2_Sub4_4.method507(local743);
						local1120 = (150 - this.anIntArray230[local614]) * (local823 + 100) / 150;
						Class4_Sub1_Sub2.method493(this.anInt883 + 50, 0, this.anInt883 - 50, 334);
						this.aClass4_Sub1_Sub2_Sub4_4.method508(0, this.anInt884 + 1, this.anInt883 + 50 - local1120, local743);
						this.aClass4_Sub1_Sub2_Sub4_4.method508(local748, this.anInt884, this.anInt883 + 50 - local1120, local743);
						Class4_Sub1_Sub2.method492();
					}
					if (this.anIntArray229[local614] == 5) {
						local823 = 150 - this.anIntArray230[local614];
						local1120 = 0;
						if (local823 < 25) {
							local1120 = local823 - 25;
						} else if (local823 > 125) {
							local1120 = local823 - 125;
						}
						Class4_Sub1_Sub2.method493(512, this.anInt884 - this.aClass4_Sub1_Sub2_Sub4_4.anInt699 - 1, 0, this.anInt884 + 5);
						this.aClass4_Sub1_Sub2_Sub4_4.method504(this.anInt883, this.anInt884 + local1120 + 1, local743, 0);
						this.aClass4_Sub1_Sub2_Sub4_4.method504(this.anInt883, this.anInt884 + local1120, local743, local748);
						Class4_Sub1_Sub2.method492();
					}
				} else {
					this.aClass4_Sub1_Sub2_Sub4_4.method504(this.anInt883, this.anInt884 + 1, local743, 0);
					this.aClass4_Sub1_Sub2_Sub4_4.method504(this.anInt883, this.anInt884, local743, 16776960);
				}
			}
		} catch (@Pc(1270) RuntimeException local1270) {
			signlink.reporterror("60003, " + 0 + ", " + local1270.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "f", descriptor = "(B)V")
	private void method613() {
		try {
			if (super.aClass25_2 == null) {
				this.method646();
				this.aClass25_12 = null;
				this.aClass25_13 = null;
				this.aClass25_14 = null;
				this.aClass25_15 = null;
				this.aClass25_16 = null;
				this.aClass25_17 = null;
				this.aClass25_18 = null;
				this.aClass25_19 = null;
				this.aClass25_20 = null;
				this.aClass25_24 = null;
				this.aClass25_22 = null;
				this.aClass25_21 = null;
				this.aClass25_23 = null;
				this.aClass25_25 = null;
				this.aClass25_26 = null;
				this.aClass25_27 = null;
				super.aClass25_2 = new Class25(this.method583(), 503, 765, 284);
				this.aBoolean243 = true;
			}
		} catch (@Pc(79) RuntimeException local79) {
			signlink.reporterror("77093, " + 26 + ", " + local79.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIZI)I")
	private int method614(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		try {
			@Pc(3) int local3 = arg1 >> 7;
			@Pc(7) int local7 = arg2 >> 7;
			if (local3 < 0 || local7 < 0 || local3 > 103 || local7 > 103) {
				return 0;
			}
			@Pc(21) int local21 = arg0;
			if (arg0 < 3 && (this.aByteArrayArrayArray8[1][local3][local7] & 0x2) == 2) {
				local21 = arg0 + 1;
			}
			@Pc(41) int local41 = arg1 & 0x7F;
			@Pc(45) int local45 = arg2 & 0x7F;
			@Pc(83) int local83 = this.anIntArrayArrayArray8[local21][local3][local7] * (128 - local41) + this.anIntArrayArrayArray8[local21][local3 + 1][local7] * local41 >> 7;
			@Pc(115) int local115 = this.anIntArrayArrayArray8[local21][local3][local7 + 1] * (128 - local41) + this.anIntArrayArrayArray8[local21][local3 + 1][local7 + 1] * local41 >> 7;
			return local83 * (128 - local45) + local115 * local45 >> 7;
		} catch (@Pc(128) RuntimeException local128) {
			signlink.reporterror("3315, " + arg0 + ", " + arg1 + ", " + false + ", " + arg2 + ", " + local128.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IB)Z")
	private boolean method615(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		try {
			@Pc(4) boolean local4 = false;
			if (arg0 < 0) {
				return false;
			}
			@Pc(18) int local18 = this.anIntArray253[arg0];
			if (local18 >= 2000) {
				local18 -= 2000;
			}
			return local18 == 201;
		} catch (@Pc(30) RuntimeException local30) {
			signlink.reporterror("9813, " + arg0 + ", " + arg1 + ", " + local30.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(Z)V")
	private void method616() {
		try {
			this.aClass25_22.method302(this.aBoolean230);
			@Pc(25) int local25;
			@Pc(27) int local27;
			if (this.anInt944 == 2) {
				@Pc(20) byte[] local20 = this.aClass4_Sub1_Sub2_Sub2_14.aByteArray9;
				@Pc(22) int[] local22 = Class4_Sub1_Sub2.anIntArray164;
				local25 = local20.length;
				for (local27 = 0; local27 < local25; local27++) {
					if (local20[local27] == 0) {
						local22[local27] = 0;
					}
				}
				this.aClass4_Sub1_Sub2_Sub3_12.method470(this.anInt879, 25, this.anIntArray246, 25, 0, 33, 256, this.anIntArray260, 33, 0);
				this.aClass25_23.method302(this.aBoolean230);
				Class4_Sub1_Sub2_Sub1.anIntArray27 = this.anIntArray275;
			} else {
				@Pc(75) int local75 = this.anInt879 + this.anInt1050 & 0x7FF;
				@Pc(82) int local82 = aClass4_Sub1_Sub1_Sub2_Sub2_1.anInt764 / 32 + 48;
				local25 = 464 - aClass4_Sub1_Sub1_Sub2_Sub2_1.anInt765 / 32;
				this.aClass4_Sub1_Sub2_Sub3_8.method470(local75, local25, this.anIntArray240, local82, 25, 151, this.anInt985 + 256, this.anIntArray259, 146, 5);
				this.aClass4_Sub1_Sub2_Sub3_12.method470(this.anInt879, 25, this.anIntArray246, 25, 0, 33, 256, this.anIntArray260, 33, 0);
				for (local27 = 0; local27 < this.anInt936; local27++) {
					local82 = this.anIntArray231[local27] * 4 + 2 - aClass4_Sub1_Sub1_Sub2_Sub2_1.anInt764 / 32;
					local25 = this.anIntArray232[local27] * 4 + 2 - aClass4_Sub1_Sub1_Sub2_Sub2_1.anInt765 / 32;
					this.method718(this.aClass4_Sub1_Sub2_Sub3Array6[local27], local82, local25);
				}
				@Pc(177) int local177;
				for (@Pc(173) int local173 = 0; local173 < 104; local173++) {
					for (local177 = 0; local177 < 104; local177++) {
						@Pc(189) Class11 local189 = this.aClass11ArrayArrayArray1[this.anInt895][local173][local177];
						if (local189 != null) {
							local82 = local173 * 4 + 2 - aClass4_Sub1_Sub1_Sub2_Sub2_1.anInt764 / 32;
							local25 = local177 * 4 + 2 - aClass4_Sub1_Sub1_Sub2_Sub2_1.anInt765 / 32;
							this.method718(this.aClass4_Sub1_Sub2_Sub3_3, local82, local25);
						}
					}
				}
				for (local177 = 0; local177 < this.anInt1013; local177++) {
					@Pc(240) Class4_Sub1_Sub1_Sub2_Sub1 local240 = this.aClass4_Sub1_Sub1_Sub2_Sub1Array1[this.anIntArray256[local177]];
					if (local240 != null && local240.method562()) {
						@Pc(249) Class40 local249 = local240.aClass40_1;
						if (local249.anIntArray155 != null) {
							local249 = local249.method482((byte) 3);
						}
						if (local249 != null && local249.aBoolean173 && local249.aBoolean174) {
							local82 = local240.anInt764 / 32 - aClass4_Sub1_Sub1_Sub2_Sub2_1.anInt764 / 32;
							local25 = local240.anInt765 / 32 - aClass4_Sub1_Sub1_Sub2_Sub2_1.anInt765 / 32;
							this.method718(this.aClass4_Sub1_Sub2_Sub3_4, local82, local25);
						}
					}
				}
				@Pc(308) Class4_Sub1_Sub1_Sub2_Sub2 local308;
				for (@Pc(298) int local298 = 0; local298 < this.anInt949; local298++) {
					local308 = this.aClass4_Sub1_Sub1_Sub2_Sub2Array1[this.anIntArray241[local298]];
					if (local308 != null && local308.method562()) {
						local82 = local308.anInt764 / 32 - aClass4_Sub1_Sub1_Sub2_Sub2_1.anInt764 / 32;
						local25 = local308.anInt765 / 32 - aClass4_Sub1_Sub1_Sub2_Sub2_1.anInt765 / 32;
						@Pc(336) boolean local336 = false;
						@Pc(340) long local340 = Class47.method550(local308.aString15);
						for (@Pc(342) int local342 = 0; local342 < this.anInt957; local342++) {
							if (local340 == this.aLongArray4[local342] && this.anIntArray235[local342] != 0) {
								local336 = true;
								break;
							}
						}
						@Pc(367) boolean local367 = false;
						if (aClass4_Sub1_Sub1_Sub2_Sub2_1.anInt801 != 0 && local308.anInt801 != 0 && aClass4_Sub1_Sub1_Sub2_Sub2_1.anInt801 == local308.anInt801) {
							local367 = true;
						}
						if (local336) {
							this.method718(this.aClass4_Sub1_Sub2_Sub3_6, local82, local25);
						} else if (local367) {
							this.method718(this.aClass4_Sub1_Sub2_Sub3_7, local82, local25);
						} else {
							this.method718(this.aClass4_Sub1_Sub2_Sub3_5, local82, local25);
						}
					}
				}
				if (this.anInt954 != 0 && anInt1054 % 20 < 10) {
					if (this.anInt954 == 1 && this.anInt1018 >= 0 && this.anInt1018 < this.aClass4_Sub1_Sub1_Sub2_Sub1Array1.length) {
						@Pc(441) Class4_Sub1_Sub1_Sub2_Sub1 local441 = this.aClass4_Sub1_Sub1_Sub2_Sub1Array1[this.anInt1018];
						if (local441 != null) {
							local82 = local441.anInt764 / 32 - aClass4_Sub1_Sub1_Sub2_Sub2_1.anInt764 / 32;
							local25 = local441.anInt765 / 32 - aClass4_Sub1_Sub1_Sub2_Sub2_1.anInt765 / 32;
							this.method648(this.aClass4_Sub1_Sub2_Sub3_17, local82, local25);
						}
					}
					if (this.anInt954 == 2) {
						local82 = (this.anInt979 - this.anInt1056) * 4 + 2 - aClass4_Sub1_Sub1_Sub2_Sub2_1.anInt764 / 32;
						local25 = (this.anInt980 - this.anInt1057) * 4 + 2 - aClass4_Sub1_Sub1_Sub2_Sub2_1.anInt765 / 32;
						this.method648(this.aClass4_Sub1_Sub2_Sub3_17, local82, local25);
					}
					if (this.anInt954 == 10 && this.anInt887 >= 0 && this.anInt887 < this.aClass4_Sub1_Sub1_Sub2_Sub2Array1.length) {
						local308 = this.aClass4_Sub1_Sub1_Sub2_Sub2Array1[this.anInt887];
						if (local308 != null) {
							local82 = local308.anInt764 / 32 - aClass4_Sub1_Sub1_Sub2_Sub2_1.anInt764 / 32;
							local25 = local308.anInt765 / 32 - aClass4_Sub1_Sub1_Sub2_Sub2_1.anInt765 / 32;
							this.method648(this.aClass4_Sub1_Sub2_Sub3_17, local82, local25);
						}
					}
				}
				if (this.anInt865 != 0) {
					local82 = this.anInt865 * 4 + 2 - aClass4_Sub1_Sub1_Sub2_Sub2_1.anInt764 / 32;
					local25 = this.anInt866 * 4 + 2 - aClass4_Sub1_Sub1_Sub2_Sub2_1.anInt765 / 32;
					this.method718(this.aClass4_Sub1_Sub2_Sub3_16, local82, local25);
				}
				Class4_Sub1_Sub2.method496(97, 16777215, 3, 3, 78);
				this.aClass25_23.method302(this.aBoolean230);
				Class4_Sub1_Sub2_Sub1.anIntArray27 = this.anIntArray275;
			}
		} catch (@Pc(610) RuntimeException local610) {
			signlink.reporterror("54823, " + true + ", " + local610.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "run", descriptor = "()V")
	@Override
	public void run() {
		if (this.aBoolean216) {
			this.method720();
		} else {
			super.run();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIII)Z")
	private boolean method617(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		try {
			@Pc(7) int local7 = arg1 >> 14 & 0x7FFF;
			@Pc(22) int local22 = this.aClass20_1.method253(this.anInt895, arg2, arg0, arg1);
			if (local22 == -1) {
				return false;
			}
			@Pc(31) int local31 = local22 & 0x1F;
			@Pc(37) int local37 = local22 >> 6 & 0x3;
			if (local31 == 10 || local31 == 11 || local31 == 22) {
				@Pc(49) Class7 local49 = Class7.method82(local7);
				@Pc(57) int local57;
				@Pc(60) int local60;
				if (local37 == 0 || local37 == 2) {
					local57 = local49.anInt58;
					local60 = local49.anInt61;
				} else {
					local57 = local49.anInt61;
					local60 = local49.anInt58;
				}
				@Pc(71) int local71 = local49.anInt54;
				if (local37 != 0) {
					local71 = (local71 << local37 & 0xF) + (local71 >> 4 - local37);
				}
				this.method671(false, local60, arg0, aClass4_Sub1_Sub1_Sub2_Sub2_1.anIntArray187[0], aClass4_Sub1_Sub1_Sub2_Sub2_1.anIntArray188[0], local57, 2, local71, arg2, 0, 0, 566);
			} else {
				this.method671(false, 0, arg0, aClass4_Sub1_Sub1_Sub2_Sub2_1.anIntArray187[0], aClass4_Sub1_Sub1_Sub2_Sub2_1.anIntArray188[0], 0, 2, 0, arg2, local37, local31 + 1, 566);
			}
			this.anInt1070 = super.anInt841;
			this.anInt1071 = super.anInt842;
			this.anInt1073 = 2;
			this.anInt1072 = 0;
			return true;
		} catch (@Pc(148) RuntimeException local148) {
			signlink.reporterror("67514, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 288 + ", " + local148.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ZJ)V")
	private void method618(@OriginalArg(0) boolean arg0, @OriginalArg(1) long arg1) {
		try {
			if (arg1 != 0L) {
				for (@Pc(8) int local8 = 0; local8 < this.anInt848; local8++) {
					if (this.aLongArray3[local8] == arg1) {
						this.anInt848--;
						this.aBoolean246 = true;
						for (@Pc(28) int local28 = local8; local28 < this.anInt848; local28++) {
							this.aLongArray3[local28] = this.aLongArray3[local28 + 1];
						}
						this.aClass4_Sub1_Sub4_7.method344(104);
						this.aClass4_Sub1_Sub4_7.method351(arg1);
						break;
					}
				}
				if (arg0) {
					this.method578();
				}
			}
		} catch (@Pc(68) RuntimeException local68) {
			signlink.reporterror("82211, " + arg0 + ", " + arg1 + ", " + local68.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ZLclient!NPNTBMMX;)V")
	private void method619(@OriginalArg(1) Class28 arg0) {
		try {
			@Pc(14) int local14 = arg0.anInt458;
			@Pc(70) int local70;
			if ((local14 < 1 || local14 > 100) && (local14 < 701 || local14 > 800)) {
				if (local14 >= 101 && local14 <= 200 || !(local14 < 801 || local14 > 900)) {
					local70 = this.anInt957;
					if (this.anInt958 != 2) {
						local70 = 0;
					}
					if (local14 > 800) {
						local14 -= 701;
					} else {
						local14 -= 101;
					}
					if (local14 >= local70) {
						arg0.aString8 = "";
						arg0.anInt459 = 0;
					} else {
						if (this.anIntArray235[local14] == 0) {
							arg0.aString8 = "@red@Offline";
						} else if (this.anIntArray235[local14] < 200) {
							if (this.anIntArray235[local14] == anInt874) {
								arg0.aString8 = "@gre@World" + (this.anIntArray235[local14] - 9);
							} else {
								arg0.aString8 = "@yel@World" + (this.anIntArray235[local14] - 9);
							}
						} else if (this.anIntArray235[local14] == anInt874) {
							arg0.aString8 = "@gre@Classic" + (this.anIntArray235[local14] - 219);
						} else {
							arg0.aString8 = "@yel@Classic" + (this.anIntArray235[local14] - 219);
						}
						arg0.anInt459 = 1;
					}
				} else if (local14 == 203) {
					local70 = this.anInt957;
					if (this.anInt958 != 2) {
						local70 = 0;
					}
					arg0.anInt437 = local70 * 15 + 20;
					if (arg0.anInt437 <= arg0.anInt423) {
						arg0.anInt437 = arg0.anInt423 + 1;
					}
				} else if (local14 >= 401 && local14 <= 500) {
					local14 -= 401;
					if (local14 == 0 && this.anInt958 == 0) {
						arg0.aString8 = "Loading ignore list";
						arg0.anInt459 = 0;
					} else if (local14 == 1 && this.anInt958 == 0) {
						arg0.aString8 = "Please wait...";
						arg0.anInt459 = 0;
					} else {
						local70 = this.anInt848;
						if (this.anInt958 == 0) {
							local70 = 0;
						}
						if (local14 >= local70) {
							arg0.aString8 = "";
							arg0.anInt459 = 0;
						} else {
							arg0.aString8 = Class47.method554(Class47.method551(this.aLongArray3[local14]));
							arg0.anInt459 = 1;
						}
					}
				} else if (local14 == 503) {
					arg0.anInt437 = this.anInt848 * 15 + 20;
					if (arg0.anInt437 <= arg0.anInt423) {
						arg0.anInt437 = arg0.anInt423 + 1;
					}
				} else if (local14 == 327) {
					arg0.anInt455 = 150;
					arg0.anInt456 = (int) (Math.sin((double) anInt1054 / 40.0D) * 256.0D) & 0x7FF;
					if (this.aBoolean217) {
						for (local70 = 0; local70 < 7; local70++) {
							@Pc(383) int local383 = this.anIntArray245[local70];
							if (local383 >= 0 && !Class18.aClass18Array1[local383].method209()) {
								return;
							}
						}
						this.aBoolean217 = false;
						@Pc(402) Class4_Sub1_Sub1_Sub4[] local402 = new Class4_Sub1_Sub1_Sub4[7];
						@Pc(404) int local404 = 0;
						for (@Pc(406) int local406 = 0; local406 < 7; local406++) {
							@Pc(413) int local413 = this.anIntArray245[local406];
							if (local413 >= 0) {
								local402[local404++] = Class18.aClass18Array1[local413].method210();
							}
						}
						@Pc(435) Class4_Sub1_Sub1_Sub4 local435 = new Class4_Sub1_Sub1_Sub4(local404, -347, local402);
						for (@Pc(437) int local437 = 0; local437 < 5; local437++) {
							if (this.anIntArray236[local437] != 0) {
								local435.method413(anIntArrayArray23[local437][0], anIntArrayArray23[local437][this.anIntArray236[local437]]);
								if (local437 == 1) {
									local435.method413(anIntArray271[0], anIntArray271[this.anIntArray236[local437]]);
								}
							}
						}
						local435.method406();
						local435.method407(Class21.aClass21Array1[aClass4_Sub1_Sub1_Sub2_Sub2_1.anInt787].anIntArray69[0]);
						local435.method416(64, 850, -30, -50, -30, true);
						arg0.anInt444 = 5;
						arg0.anInt445 = 0;
						Class28.method320(local435);
					}
				} else if (local14 == 324) {
					if (this.aClass4_Sub1_Sub2_Sub3_14 == null) {
						this.aClass4_Sub1_Sub2_Sub3_14 = arg0.aClass4_Sub1_Sub2_Sub3_2;
						this.aClass4_Sub1_Sub2_Sub3_15 = arg0.aClass4_Sub1_Sub2_Sub3_1;
					}
					if (this.aBoolean231) {
						arg0.aClass4_Sub1_Sub2_Sub3_2 = this.aClass4_Sub1_Sub2_Sub3_15;
					} else {
						arg0.aClass4_Sub1_Sub2_Sub3_2 = this.aClass4_Sub1_Sub2_Sub3_14;
					}
				} else if (local14 == 325) {
					if (this.aClass4_Sub1_Sub2_Sub3_14 == null) {
						this.aClass4_Sub1_Sub2_Sub3_14 = arg0.aClass4_Sub1_Sub2_Sub3_2;
						this.aClass4_Sub1_Sub2_Sub3_15 = arg0.aClass4_Sub1_Sub2_Sub3_1;
					}
					if (this.aBoolean231) {
						arg0.aClass4_Sub1_Sub2_Sub3_2 = this.aClass4_Sub1_Sub2_Sub3_14;
					} else {
						arg0.aClass4_Sub1_Sub2_Sub3_2 = this.aClass4_Sub1_Sub2_Sub3_15;
					}
				} else if (local14 == 600) {
					arg0.aString8 = this.aString17;
					if (anInt1054 % 20 < 10) {
						arg0.aString8 = arg0.aString8 + "|";
					} else {
						arg0.aString8 = arg0.aString8 + " ";
					}
				} else {
					if (local14 == 620) {
						if (this.anInt959 < 1) {
							arg0.aString8 = "";
						} else if (this.aBoolean262) {
							arg0.anInt441 = 16711680;
							arg0.aString8 = "Moderator option: Mute player for 48 hours: <ON>";
						} else {
							arg0.anInt441 = 16777215;
							arg0.aString8 = "Moderator option: Mute player for 48 hours: <OFF>";
						}
					}
					@Pc(642) String local642;
					if (local14 == 660) {
						local70 = this.anInt1065 - this.anInt1009;
						if (local70 <= 0) {
							local642 = "earlier today";
						} else if (local70 == 1) {
							local642 = "yesterday";
						} else {
							local642 = local70 + " days ago";
						}
						arg0.aString8 = "You last logged in @red@" + local642 + "@bla@ from: @red@" + signlink.dns;
					}
					if (local14 == 661) {
						if (this.anInt854 == 0) {
							arg0.aString8 = "\\nYou have not yet set any recovery questions.\\nIt is @lre@strongly@yel@ recommended that you do so.\\n\\nIf you don't you will be @lre@unable to recover your\\n@lre@password@yel@ if you forget it, or it is stolen.";
						} else if (this.anInt854 <= this.anInt1065) {
							arg0.aString8 = "\\n\\nRecovery Questions Last Set:\\n@gre@" + this.method620(this.anInt854);
						} else {
							local70 = this.anInt1065 + 14 - this.anInt854;
							if (local70 <= 0) {
								local642 = "Earlier today";
							} else if (local70 == 1) {
								local642 = "Yesterday";
							} else {
								local642 = local70 + " days ago";
							}
							arg0.aString8 = local642 + " you requested@lre@ new recovery\\n@lre@questions.@yel@ The requested change will occur\\non: @lre@" + this.method620(this.anInt854) + "\\n\\nIf you do not remember making this request\\ncancel it immediately, and change your password.";
						}
					}
					if (local14 == 662) {
						@Pc(760) String local760;
						if (this.anInt905 == 0) {
							local760 = "@yel@0 unread messages";
						} else if (this.anInt905 == 1) {
							local760 = "@gre@1 unread message";
						} else {
							local760 = "@gre@" + this.anInt905 + " unread messages";
						}
						arg0.aString8 = "You have " + local760 + "\\nin your message centre.";
					}
					if (local14 == 663) {
						if (this.anInt894 > 0 && this.anInt894 <= this.anInt1065 + 10) {
							arg0.aString8 = "Last password change:\\n@gre@" + this.method620(this.anInt894);
						} else {
							arg0.aString8 = "Last password change:\\n@gre@Never changed";
						}
					}
					if (local14 == 665) {
						if (this.anInt853 > 2 && !aBoolean222) {
							arg0.aString8 = "This is a non-members\\nworld. To enjoy your\\nmembers benefits we\\nrecommend you play on a\\nmembers world instead.";
						} else if (this.anInt853 > 2) {
							arg0.aString8 = "\\n\\nYou have @gre@" + this.anInt853 + "@yel@ days of\\nmember credit remaining.";
						} else if (this.anInt853 > 0) {
							arg0.aString8 = "You have @gre@" + this.anInt853 + "@yel@ days of\\nmember credit remaining.\\n\\n@lre@Credit low! Renew now\\n@lre@to avoid losing members.";
						} else {
							arg0.aString8 = "You are not a member.\\n\\nChoose to subscribe and\\nyou'll get loads of extra\\nbenefits and features.";
						}
					}
					if (local14 == 667) {
						if (this.anInt853 > 2 && !aBoolean222) {
							arg0.aString8 = "To switch to a members-only world:\\n1) Logout and return to the world selection page.\\n2) Choose one of the members world with a gold star next to it's name.\\n\\nIf you prefer you can continue to use this world,\\nbut members only features will be unavailable here.";
						} else if (this.anInt853 > 0) {
							arg0.aString8 = "To extend or cancel a subscription:\\n1) Logout and return to the frontpage of this website.\\n2)Choose the relevant option from the 'membership' section.\\n\\nNote: If you are a credit card subscriber a top-up payment will\\nautomatically be taken when 3 days credit remain.\\n(unless you cancel your subscription, which can be done at any time.)";
						} else {
							arg0.aString8 = "To start a subscripton:\\n1) Logout and return to the frontpage of this website.\\n2) Choose 'Start a new subscription'";
						}
					}
					if (local14 == 668) {
						if (this.anInt854 > this.anInt1065) {
							arg0.aString8 = "To cancel this request:\\n1) Logout and return to the frontpage of this website.\\n2) Choose 'Cancel recovery questions'.";
						} else {
							arg0.aString8 = "To change your recovery questions:\\n1) Logout and return to the frontpage of this website.\\n2) Choose 'Set new recovery questions'.";
						}
					}
				}
			} else if (local14 == 1 && this.anInt958 == 0) {
				arg0.aString8 = "Loading friend list";
				arg0.anInt459 = 0;
			} else if (local14 == 1 && this.anInt958 == 1) {
				arg0.aString8 = "Connecting to friendserver";
				arg0.anInt459 = 0;
			} else if (local14 == 2 && this.anInt958 != 2) {
				arg0.aString8 = "Please wait...";
				arg0.anInt459 = 0;
			} else {
				local70 = this.anInt957;
				if (this.anInt958 != 2) {
					local70 = 0;
				}
				if (local14 > 700) {
					local14 -= 601;
				} else {
					local14--;
				}
				if (local14 >= local70) {
					arg0.aString8 = "";
					arg0.anInt459 = 0;
				} else {
					arg0.aString8 = this.aStringArray11[local14];
					arg0.anInt459 = 1;
				}
			}
		} catch (@Pc(917) RuntimeException local917) {
			signlink.reporterror("63506, " + true + ", " + arg0 + ", " + local917.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(II)Ljava/lang/String;")
	private String method620(@OriginalArg(1) int arg0) {
		try {
			if (arg0 > this.anInt1065 + 10) {
				return "Unknown";
			}
			@Pc(14) long local14 = ((long) arg0 + 11745L) * 86400000L;
			@Pc(22) Calendar local22 = Calendar.getInstance();
			local22.setTime(new Date(local14));
			@Pc(32) int local32 = local22.get(5);
			@Pc(36) int local36 = local22.get(2);
			@Pc(40) int local40 = local22.get(1);
			@Pc(91) String[] local91 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };
			return local32 + "-" + local91[local36] + "-" + local40;
		} catch (@Pc(109) RuntimeException local109) {
			signlink.reporterror("67609, " + 392 + ", " + arg0 + ", " + local109.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "j", descriptor = "(I)V")
	private void method621() {
		try {
			this.aBoolean217 = true;
			for (@Pc(6) int local6 = 0; local6 < 7; local6++) {
				this.anIntArray245[local6] = -1;
				for (@Pc(15) int local15 = 0; local15 < Class18.anInt302; local15++) {
					if (!Class18.aClass18Array1[local15].aBoolean87 && Class18.aClass18Array1[local15].anInt303 == local6 + (this.aBoolean231 ? 0 : 7)) {
						this.anIntArray245[local6] = local15;
						break;
					}
				}
			}
		} catch (@Pc(60) RuntimeException local60) {
			signlink.reporterror("74296, " + 8 + ", " + local60.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "k", descriptor = "(I)I")
	private int method622(@OriginalArg(0) int arg0) {
		try {
			@Pc(5) boolean local5 = false;
			@Pc(7) int local7 = 3;
			if (this.anInt932 < 310) {
				@Pc(16) int local16 = this.anInt929 >> 7;
				@Pc(21) int local21 = this.anInt931 >> 7;
				@Pc(26) int local26 = aClass4_Sub1_Sub1_Sub2_Sub2_1.anInt764 >> 7;
				@Pc(31) int local31 = aClass4_Sub1_Sub1_Sub2_Sub2_1.anInt765 >> 7;
				if ((this.aByteArrayArrayArray8[this.anInt895][local16][local21] & 0x4) != 0) {
					local7 = this.anInt895;
				}
				@Pc(53) int local53;
				if (local26 > local16) {
					local53 = local26 - local16;
				} else {
					local53 = local16 - local26;
				}
				@Pc(66) int local66;
				if (local31 > local21) {
					local66 = local31 - local21;
				} else {
					local66 = local21 - local31;
				}
				@Pc(81) int local81;
				@Pc(83) int local83;
				if (local53 > local66) {
					local81 = local66 * 65536 / local53;
					local83 = 32768;
					while (local16 != local26) {
						if (local16 < local26) {
							local16++;
						} else if (local16 > local26) {
							local16--;
						}
						if ((this.aByteArrayArrayArray8[this.anInt895][local16][local21] & 0x4) != 0) {
							local7 = this.anInt895;
						}
						local83 += local81;
						if (local83 >= 65536) {
							local83 -= 65536;
							if (local21 < local31) {
								local21++;
							} else if (local21 > local31) {
								local21--;
							}
							if ((this.aByteArrayArrayArray8[this.anInt895][local16][local21] & 0x4) != 0) {
								local7 = this.anInt895;
							}
						}
					}
				} else {
					local81 = local53 * 65536 / local66;
					local83 = 32768;
					while (local21 != local31) {
						if (local21 < local31) {
							local21++;
						} else if (local21 > local31) {
							local21--;
						}
						if ((this.aByteArrayArrayArray8[this.anInt895][local16][local21] & 0x4) != 0) {
							local7 = this.anInt895;
						}
						local83 += local81;
						if (local83 >= 65536) {
							local83 -= 65536;
							if (local16 < local26) {
								local16++;
							} else if (local16 > local26) {
								local16--;
							}
							if ((this.aByteArrayArrayArray8[this.anInt895][local16][local21] & 0x4) != 0) {
								local7 = this.anInt895;
							}
						}
					}
				}
			}
			if ((this.aByteArrayArrayArray8[this.anInt895][aClass4_Sub1_Sub1_Sub2_Sub2_1.anInt764 >> 7][aClass4_Sub1_Sub1_Sub2_Sub2_1.anInt765 >> 7] & 0x4) != 0) {
				local7 = this.anInt895;
			}
			return local7;
		} catch (@Pc(249) RuntimeException local249) {
			signlink.reporterror("65733, " + arg0 + ", " + local249.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "l", descriptor = "(I)I")
	private int method623(@OriginalArg(0) int arg0) {
		try {
			if (arg0 != 4) {
				this.aClass4_Sub1_Sub4_7.method345(57);
			}
			@Pc(16) int local16 = this.method614(this.anInt895, this.anInt929, this.anInt931);
			return local16 - this.anInt930 >= 800 || (this.aByteArrayArrayArray8[this.anInt895][this.anInt929 >> 7][this.anInt931 >> 7] & 0x4) == 0 ? 3 : this.anInt895;
		} catch (@Pc(46) RuntimeException local46) {
			signlink.reporterror("56053, " + arg0 + ", " + local46.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(Z)V")
	private void method624() {
		try {
			if (this.anInt863 > 0) {
				this.method655();
			} else {
				this.method656("Please wait - attempting to reestablish", "Connection lost");
				this.anInt944 = 0;
				this.anInt865 = 0;
				@Pc(20) Class15 local20 = this.aClass15_1;
				this.aBoolean251 = false;
				this.anInt1061 = 0;
				this.method640(this.aString20, this.aString21, true);
				if (!this.aBoolean251) {
					this.method655();
				}
				try {
					local20.method183();
				} catch (@Pc(46) Exception local46) {
				}
			}
		} catch (@Pc(48) RuntimeException local48) {
			signlink.reporterror("70825, " + false + ", " + local48.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(Z)V")
	private void method625() {
		try {
			@Pc(3) int local3 = 5;
			this.anIntArray213[8] = 0;
			this.aBoolean251 &= true;
			@Pc(16) int local16 = 0;
			while (this.anIntArray213[8] == 0) {
				@Pc(20) String local20 = "Unknown problem";
				this.method585(53, "Connecting to web server", 20);
				try {
					@Pc(42) DataInputStream local42 = this.method689("crc" + (int) (Math.random() * 9.9999999E7D) + "-" + 355);
					@Pc(49) Class4_Sub1_Sub4 local49 = new Class4_Sub1_Sub4(5, new byte[40]);
					local42.readFully(local49.aByteArray10, 0, 40);
					local42.close();
					for (@Pc(59) int local59 = 0; local59 < 9; local59++) {
						this.anIntArray213[local59] = local49.method360();
					}
					@Pc(74) int local74 = local49.method360();
					@Pc(76) int local76 = 1234;
					for (@Pc(78) int local78 = 0; local78 < 9; local78++) {
						local76 = (local76 << 1) + this.anIntArray213[local78];
					}
					if (local74 != local76) {
						local20 = "checksum problem";
						this.anIntArray213[8] = 0;
					}
				} catch (@Pc(105) EOFException local105) {
					local20 = "EOF problem";
					this.anIntArray213[8] = 0;
				} catch (@Pc(114) IOException local114) {
					local20 = "connection problem";
					this.anIntArray213[8] = 0;
				} catch (@Pc(123) Exception local123) {
					local20 = "logic problem";
					this.anIntArray213[8] = 0;
					if (!signlink.reporterror) {
						return;
					}
				}
				if (this.anIntArray213[8] == 0) {
					local16++;
					for (@Pc(141) int local141 = local3; local141 > 0; local141--) {
						if (local16 >= 10) {
							this.method585(53, "Game updated - please reload page", 10);
							local141 = 10;
						} else {
							this.method585(53, local20 + " - Will retry in " + local141 + " secs.", 10);
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
					this.aBoolean245 = !this.aBoolean245;
				}
			}
		} catch (@Pc(203) RuntimeException local203) {
			signlink.reporterror("12724, " + true + ", " + local203.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "g", descriptor = "(B)V")
	private void method626(@OriginalArg(0) byte arg0) {
		try {
			for (@Pc(3) int local3 = 0; local3 < this.anInt935; local3++) {
				if (this.anIntArray220[local3] <= 0) {
					@Pc(12) boolean local12 = false;
					try {
						if (this.anIntArray266[local3] != this.anInt906 || this.anIntArray267[local3] != this.anInt962) {
							@Pc(46) Class4_Sub1_Sub4 local46 = Class36.method438(this.anIntArray266[local3], this.anIntArray267[local3], 12);
							if (System.currentTimeMillis() + (long) (local46.anInt506 / 22) > this.aLong32 + (long) (this.anInt1052 / 22)) {
								this.anInt1052 = local46.anInt506;
								this.aLong32 = System.currentTimeMillis();
								if (this.method662(this.aBoolean236, local46.anInt506, local46.aByteArray10)) {
									this.anInt906 = this.anIntArray266[local3];
									this.anInt962 = this.anIntArray267[local3];
								} else {
									local12 = true;
								}
							}
						} else if (!this.method722(this.anInt912)) {
							local12 = true;
						}
					} catch (@Pc(97) Exception local97) {
						if (signlink.reporterror) {
							this.aClass4_Sub1_Sub4_7.method344(116);
							this.aClass4_Sub1_Sub4_7.method346(this.anIntArray266[local3] & 0x7FFF);
						} else {
							this.aClass4_Sub1_Sub4_7.method344(116);
							this.aClass4_Sub1_Sub4_7.method346(-1);
						}
					}
					if (local12 && this.anIntArray220[local3] != -5) {
						this.anIntArray220[local3] = -5;
					} else {
						this.anInt935--;
						for (@Pc(140) int local140 = local3; local140 < this.anInt935; local140++) {
							this.anIntArray266[local140] = this.anIntArray266[local140 + 1];
							this.anIntArray267[local140] = this.anIntArray267[local140 + 1];
							this.anIntArray220[local140] = this.anIntArray220[local140 + 1];
						}
						local3--;
					}
				} else {
					@Pc(192) int local192 = this.anIntArray220[local3]--;
				}
			}
			@Pc(205) boolean local205 = false;
			if (this.anInt914 > 0) {
				this.anInt914 -= 20;
				if (this.anInt914 < 0) {
					this.anInt914 = 0;
				}
				if (this.anInt914 == 0 && this.aBoolean244 && !aBoolean223) {
					this.anInt925 = this.anInt1055;
					this.aBoolean235 = true;
					this.aClass8_Sub1_1.method93(2, this.anInt925);
					return;
				}
			}
		} catch (@Pc(250) RuntimeException local250) {
			signlink.reporterror("52629, " + arg0 + ", " + local250.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "h", descriptor = "(B)V")
	private void method627(@OriginalArg(0) byte arg0) {
		try {
			@Pc(6) boolean local6 = false;
			if (this.anInt1021 == 0 && this.anInt1067 == 0) {
				this.aStringArray12[this.anInt989] = "Walk here";
				this.anIntArray253[this.anInt989] = 709;
				this.anIntArray251[this.anInt989] = super.anInt835;
				this.anIntArray252[this.anInt989] = super.anInt836;
				this.anInt989++;
			}
			@Pc(53) int local53 = -1;
			for (@Pc(55) int local55 = 0; local55 < Class4_Sub1_Sub1_Sub4.anInt537; local55++) {
				@Pc(61) int local61 = Class4_Sub1_Sub1_Sub4.anIntArray136[local55];
				@Pc(65) int local65 = local61 & 0x7F;
				@Pc(71) int local71 = local61 >> 7 & 0x7F;
				@Pc(77) int local77 = local61 >> 29 & 0x3;
				@Pc(83) int local83 = local61 >> 14 & 0x7FFF;
				if (local61 != local53) {
					local53 = local61;
					@Pc(230) int local230;
					if (local77 == 2 && this.aClass20_1.method253(this.anInt895, local65, local71, local61) >= 0) {
						@Pc(103) Class7 local103 = Class7.method82(local83);
						if (local103.anIntArray14 != null) {
							local103 = local103.method75();
						}
						if (local103 == null) {
							continue;
						}
						if (this.anInt1021 == 1) {
							this.aStringArray12[this.anInt989] = "Use " + this.aString29 + " with @cya@" + local103.aString1;
							this.anIntArray253[this.anInt989] = 642;
							this.anIntArray254[this.anInt989] = local61;
							this.anIntArray251[this.anInt989] = local65;
							this.anIntArray252[this.anInt989] = local71;
							this.anInt989++;
						} else if (this.anInt1067 != 1) {
							if (local103.aStringArray2 != null) {
								for (local230 = 4; local230 >= 0; local230--) {
									if (local103.aStringArray2[local230] != null) {
										this.aStringArray12[this.anInt989] = local103.aStringArray2[local230] + " @cya@" + local103.aString1;
										if (local230 == 0) {
											this.anIntArray253[this.anInt989] = 716;
										}
										if (local230 == 1) {
											this.anIntArray253[this.anInt989] = 993;
										}
										if (local230 == 2) {
											this.anIntArray253[this.anInt989] = 885;
										}
										if (local230 == 3) {
											this.anIntArray253[this.anInt989] = 492;
										}
										if (local230 == 4) {
											this.anIntArray253[this.anInt989] = 1660;
										}
										this.anIntArray254[this.anInt989] = local61;
										this.anIntArray251[this.anInt989] = local65;
										this.anIntArray252[this.anInt989] = local71;
										this.anInt989++;
									}
								}
							}
							this.aStringArray12[this.anInt989] = "Examine @cya@" + local103.aString1;
							this.anIntArray253[this.anInt989] = 1474;
							this.anIntArray254[this.anInt989] = local103.anInt47 << 14;
							this.anIntArray251[this.anInt989] = local65;
							this.anIntArray252[this.anInt989] = local71;
							this.anInt989++;
						} else if ((this.anInt1069 & 0x4) == 4) {
							this.aStringArray12[this.anInt989] = this.aString31 + " @cya@" + local103.aString1;
							this.anIntArray253[this.anInt989] = 668;
							this.anIntArray254[this.anInt989] = local61;
							this.anIntArray251[this.anInt989] = local65;
							this.anIntArray252[this.anInt989] = local71;
							this.anInt989++;
						}
					}
					@Pc(410) Class4_Sub1_Sub1_Sub2_Sub1 local410;
					@Pc(458) Class4_Sub1_Sub1_Sub2_Sub2 local458;
					@Pc(448) int local448;
					if (local77 == 1) {
						@Pc(381) Class4_Sub1_Sub1_Sub2_Sub1 local381 = this.aClass4_Sub1_Sub1_Sub2_Sub1Array1[local83];
						if (local381.aClass40_1.aByte25 == 1 && (local381.anInt764 & 0x7F) == 64 && (local381.anInt765 & 0x7F) == 64) {
							for (local230 = 0; local230 < this.anInt1013; local230++) {
								local410 = this.aClass4_Sub1_Sub1_Sub2_Sub1Array1[this.anIntArray256[local230]];
								if (local410 != null && local410 != local381 && local410.aClass40_1.aByte25 == 1 && local410.anInt764 == local381.anInt764 && local410.anInt765 == local381.anInt765) {
									this.method678(local71, this.anIntArray256[local230], local410.aClass40_1, local65);
								}
							}
							for (local448 = 0; local448 < this.anInt949; local448++) {
								local458 = this.aClass4_Sub1_Sub1_Sub2_Sub2Array1[this.anIntArray241[local448]];
								if (local458 != null && local458.anInt764 == local381.anInt764 && local458.anInt765 == local381.anInt765) {
									this.method657(local71, this.anInt1011, local65, this.anIntArray241[local448], local458);
								}
							}
						}
						this.method678(local71, local83, local381.aClass40_1, local65);
					}
					if (local77 == 0) {
						@Pc(501) Class4_Sub1_Sub1_Sub2_Sub2 local501 = this.aClass4_Sub1_Sub1_Sub2_Sub2Array1[local83];
						if ((local501.anInt764 & 0x7F) == 64 && (local501.anInt765 & 0x7F) == 64) {
							for (local230 = 0; local230 < this.anInt1013; local230++) {
								local410 = this.aClass4_Sub1_Sub1_Sub2_Sub1Array1[this.anIntArray256[local230]];
								if (local410 != null && local410.aClass40_1.aByte25 == 1 && local410.anInt764 == local501.anInt764 && local410.anInt765 == local501.anInt765) {
									this.method678(local71, this.anIntArray256[local230], local410.aClass40_1, local65);
								}
							}
							for (local448 = 0; local448 < this.anInt949; local448++) {
								local458 = this.aClass4_Sub1_Sub1_Sub2_Sub2Array1[this.anIntArray241[local448]];
								if (local458 != null && local458 != local501 && local458.anInt764 == local501.anInt764 && local458.anInt765 == local501.anInt765) {
									this.method657(local71, this.anInt1011, local65, this.anIntArray241[local448], local458);
								}
							}
						}
						this.method657(local71, this.anInt1011, local65, local83, local501);
					}
					if (local77 == 3) {
						@Pc(622) Class11 local622 = this.aClass11ArrayArrayArray1[this.anInt895][local65][local71];
						if (local622 != null) {
							for (@Pc(629) Class4_Sub1_Sub1_Sub1 local629 = (Class4_Sub1_Sub1_Sub1) local622.method167(); local629 != null; local629 = (Class4_Sub1_Sub1_Sub1) local622.method169()) {
								@Pc(635) Class17 local635 = Class17.method196(local629.anInt25);
								if (this.anInt1021 == 1) {
									this.aStringArray12[this.anInt989] = "Use " + this.aString29 + " with @lre@" + local635.aString6;
									this.anIntArray253[this.anInt989] = 567;
									this.anIntArray254[this.anInt989] = local629.anInt25;
									this.anIntArray251[this.anInt989] = local65;
									this.anIntArray252[this.anInt989] = local71;
									this.anInt989++;
								} else if (this.anInt1067 != 1) {
									for (@Pc(752) int local752 = 4; local752 >= 0; local752--) {
										if (local635.aStringArray3 != null && local635.aStringArray3[local752] != null) {
											this.aStringArray12[this.anInt989] = local635.aStringArray3[local752] + " @lre@" + local635.aString6;
											if (local752 == 0) {
												this.anIntArray253[this.anInt989] = 635;
											}
											if (local752 == 1) {
												this.anIntArray253[this.anInt989] = 641;
											}
											if (local752 == 2) {
												this.anIntArray253[this.anInt989] = 821;
											}
											if (local752 == 3) {
												this.anIntArray253[this.anInt989] = 992;
											}
											if (local752 == 4) {
												this.anIntArray253[this.anInt989] = 330;
											}
											this.anIntArray254[this.anInt989] = local629.anInt25;
											this.anIntArray251[this.anInt989] = local65;
											this.anIntArray252[this.anInt989] = local71;
											this.anInt989++;
										} else if (local752 == 2) {
											this.aStringArray12[this.anInt989] = "Take @lre@" + local635.aString6;
											this.anIntArray253[this.anInt989] = 821;
											this.anIntArray254[this.anInt989] = local629.anInt25;
											this.anIntArray251[this.anInt989] = local65;
											this.anIntArray252[this.anInt989] = local71;
											this.anInt989++;
										}
									}
									this.aStringArray12[this.anInt989] = "Examine @lre@" + local635.aString6;
									this.anIntArray253[this.anInt989] = 1907;
									this.anIntArray254[this.anInt989] = local629.anInt25;
									this.anIntArray251[this.anInt989] = local65;
									this.anIntArray252[this.anInt989] = local71;
									this.anInt989++;
								} else if ((this.anInt1069 & 0x1) == 1) {
									this.aStringArray12[this.anInt989] = this.aString31 + " @lre@" + local635.aString6;
									this.anIntArray253[this.anInt989] = 994;
									this.anIntArray254[this.anInt989] = local629.anInt25;
									this.anIntArray251[this.anInt989] = local65;
									this.anIntArray252[this.anInt989] = local71;
									this.anInt989++;
								}
							}
						}
					}
				}
			}
		} catch (@Pc(959) RuntimeException local959) {
			signlink.reporterror("48044, " + arg0 + ", " + local959.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "f", descriptor = "(Z)V")
	private void method628() {
		try {
			@Pc(32) int local32;
			@Pc(138) int local138;
			@Pc(142) int local142;
			@Pc(146) int local146;
			@Pc(194) int local194;
			@Pc(208) int local208;
			@Pc(220) int local220;
			@Pc(279) int local279;
			try {
				this.anInt885 = -1;
				this.aClass11_10.method170();
				this.aClass11_12.method170();
				anInt919++;
				if (anInt919 > 1570) {
					anInt919 = 0;
					this.aClass4_Sub1_Sub4_7.method344(145);
					this.aClass4_Sub1_Sub4_7.method345(0);
					local32 = this.aClass4_Sub1_Sub4_7.anInt506;
					if ((int) (Math.random() * 2.0D) == 0) {
						this.aClass4_Sub1_Sub4_7.method345(120);
					}
					this.aClass4_Sub1_Sub4_7.method346((int) (Math.random() * 65536.0D));
					if ((int) (Math.random() * 2.0D) == 0) {
						this.aClass4_Sub1_Sub4_7.method346(54115);
					}
					this.aClass4_Sub1_Sub4_7.method345((int) (Math.random() * 256.0D));
					this.aClass4_Sub1_Sub4_7.method345(68);
					if ((int) (Math.random() * 2.0D) == 0) {
						this.aClass4_Sub1_Sub4_7.method346(56997);
					}
					this.aClass4_Sub1_Sub4_7.method346((int) (Math.random() * 65536.0D));
					if ((int) (Math.random() * 2.0D) == 0) {
						this.aClass4_Sub1_Sub4_7.method346(11446);
					}
					this.aClass4_Sub1_Sub4_7.method345(159);
					this.aClass4_Sub1_Sub4_7.method346((int) (Math.random() * 65536.0D));
					this.aClass4_Sub1_Sub4_7.method354((byte) 5, this.aClass4_Sub1_Sub4_7.anInt506 - local32);
				}
				Class4_Sub1_Sub2_Sub1.method138();
				this.method714();
				this.aClass20_1.method223((byte) 2);
				System.gc();
				for (local32 = 0; local32 < 4; local32++) {
					this.aClass2Array1[local32].method39();
				}
				for (local138 = 0; local138 < 4; local138++) {
					for (local142 = 0; local142 < 104; local142++) {
						for (local146 = 0; local146 < 104; local146++) {
							this.aByteArrayArrayArray8[local138][local142][local146] = 0;
						}
					}
				}
				@Pc(180) Class44 local180 = new Class44(104, this.anIntArrayArrayArray8, false, 104, this.aByteArrayArrayArray8);
				local146 = this.aByteArrayArray6.length;
				this.aClass4_Sub1_Sub4_7.method344(253);
				@Pc(341) int local341;
				@Pc(329) int local329;
				if (!this.aBoolean224) {
					@Pc(225) byte[] local225;
					for (local194 = 0; local194 < local146; local194++) {
						local208 = (this.anIntArray237[local194] >> 8) * 64 - this.anInt1056;
						local220 = (this.anIntArray237[local194] & 0xFF) * 64 - this.anInt1057;
						local225 = this.aByteArrayArray6[local194];
						if (local225 != null) {
							local180.method533((this.anInt851 - 6) * 8, this.aClass2Array1, local225, local208, (this.anInt852 - 6) * 8, local220);
						}
					}
					for (local208 = 0; local208 < local146; local208++) {
						local220 = (this.anIntArray237[local208] >> 8) * 64 - this.anInt1056;
						local279 = (this.anIntArray237[local208] & 0xFF) * 64 - this.anInt1057;
						@Pc(284) byte[] local284 = this.aByteArrayArray6[local208];
						if (local284 == null && this.anInt852 < 800) {
							local180.method537(local220, local279, 64, 64);
						}
					}
					this.aClass4_Sub1_Sub4_7.method344(253);
					for (local220 = 0; local220 < local146; local220++) {
						local225 = this.aByteArrayArray5[local220];
						if (local225 != null) {
							local329 = (this.anIntArray237[local220] >> 8) * 64 - this.anInt1056;
							local341 = (this.anIntArray237[local220] & 0xFF) * 64 - this.anInt1057;
							local180.method527(local225, local341, local329, this.aClass2Array1, this.aClass20_1);
						}
					}
				}
				if (this.aBoolean224) {
					local194 = 0;
					label287: while (true) {
						@Pc(396) int local396;
						@Pc(402) int local402;
						@Pc(408) int local408;
						@Pc(418) int local418;
						@Pc(420) int local420;
						if (local194 >= 4) {
							for (local208 = 0; local208 < 13; local208++) {
								for (local220 = 0; local220 < 13; local220++) {
									local279 = this.anIntArrayArrayArray7[0][local208][local220];
									if (local279 == -1) {
										local180.method537(local208 * 8, local220 * 8, 8, 8);
									}
								}
							}
							this.aClass4_Sub1_Sub4_7.method344(253);
							local220 = 0;
							while (true) {
								if (local220 >= 4) {
									break label287;
								}
								for (local279 = 0; local279 < 13; local279++) {
									for (local329 = 0; local329 < 13; local329++) {
										local341 = this.anIntArrayArrayArray7[local220][local279][local329];
										if (local341 != -1) {
											local396 = local341 >> 24 & 0x3;
											local402 = local341 >> 1 & 0x3;
											local408 = local341 >> 14 & 0x3FF;
											local418 = local341 >> 3 & 0x7FF;
											local420 = (local408 / 8 << 8) + local418 / 8;
											for (@Pc(599) int local599 = 0; local599 < this.anIntArray237.length; local599++) {
												if (this.anIntArray237[local599] == local420 && this.aByteArrayArray5[local599] != null) {
													local180.method528((byte) 3, local220, local402, (local418 & 0x7) * 8, (local408 & 0x7) * 8, this.aByteArrayArray5[local599], this.aClass2Array1, local279 * 8, local396, local329 * 8, this.aClass20_1);
													break;
												}
											}
										}
									}
								}
								local220++;
							}
						}
						for (local208 = 0; local208 < 13; local208++) {
							for (local220 = 0; local220 < 13; local220++) {
								@Pc(372) boolean local372 = false;
								local329 = this.anIntArrayArrayArray7[local194][local208][local220];
								if (local329 != -1) {
									local341 = local329 >> 24 & 0x3;
									local396 = local329 >> 1 & 0x3;
									local402 = local329 >> 14 & 0x3FF;
									local408 = local329 >> 3 & 0x7FF;
									local418 = (local402 / 8 << 8) + local408 / 8;
									for (local420 = 0; local420 < this.anIntArray237.length; local420++) {
										if (this.anIntArray237[local420] == local418 && this.aByteArrayArray6[local420] != null) {
											local180.method536(local396, local208 * 8, (local402 & 0x7) * 8, this.aClass2Array1, local194, local341, local220 * 8, this.aByteArrayArray6[local420], (local408 & 0x7) * 8);
											local372 = true;
											break;
										}
									}
								}
								if (!local372) {
									local180.method523(local208 * 8, local194, local220 * 8);
								}
							}
						}
						local194++;
					}
				}
				this.aClass4_Sub1_Sub4_7.method344(253);
				local180.method530(this.aClass20_1, this.aClass2Array1);
				if (this.aClass25_23 != null) {
					this.aClass25_23.method302(this.aBoolean230);
					Class4_Sub1_Sub2_Sub1.anIntArray27 = this.anIntArray275;
				}
				this.aClass4_Sub1_Sub4_7.method344(253);
				local194 = Class44.anInt706;
				if (local194 > this.anInt895) {
					local194 = this.anInt895;
				}
				if (local194 < this.anInt895 - 1) {
					local194 = this.anInt895 - 1;
				}
				if (aBoolean223) {
					this.aClass20_1.method224(Class44.anInt706);
				} else {
					this.aClass20_1.method224(0);
				}
				for (local208 = 0; local208 < 104; local208++) {
					for (local220 = 0; local220 < 104; local220++) {
						this.method594(local208, local220);
					}
				}
				anInt1033++;
				if (anInt1033 > 1843) {
					anInt1033 = 0;
					this.aClass4_Sub1_Sub4_7.method344(91);
					this.aClass4_Sub1_Sub4_7.method345(0);
					local220 = this.aClass4_Sub1_Sub4_7.anInt506;
					this.aClass4_Sub1_Sub4_7.method345((int) (Math.random() * 256.0D));
					this.aClass4_Sub1_Sub4_7.method345(85);
					if ((int) (Math.random() * 2.0D) == 0) {
						this.aClass4_Sub1_Sub4_7.method346(41546);
					}
					this.aClass4_Sub1_Sub4_7.method346(4405);
					if ((int) (Math.random() * 2.0D) == 0) {
						this.aClass4_Sub1_Sub4_7.method345(0);
					}
					this.aClass4_Sub1_Sub4_7.method345(193);
					this.aClass4_Sub1_Sub4_7.method345(99);
					this.aClass4_Sub1_Sub4_7.method345(178);
					this.aClass4_Sub1_Sub4_7.method346(11597);
					this.aClass4_Sub1_Sub4_7.method346((int) (Math.random() * 65536.0D));
					this.aClass4_Sub1_Sub4_7.method354((byte) 5, this.aClass4_Sub1_Sub4_7.anInt506 - local220);
				}
				this.method666(this.aByte33);
			} catch (@Pc(837) Exception local837) {
			}
			Class7.aClass49_2.method572();
			if (super.aFrame_Sub1_2 != null) {
				this.aClass4_Sub1_Sub4_7.method344(74);
				this.aClass4_Sub1_Sub4_7.method349(1057001181);
			}
			if (aBoolean223 && signlink.aRandomAccessFile3 != null) {
				local32 = this.aClass8_Sub1_1.method104(0);
				for (local138 = 0; local138 < local32; local138++) {
					local142 = this.aClass8_Sub1_1.method99(local138, aBoolean233);
					if ((local142 & 0x79) == 0) {
						Class4_Sub1_Sub1_Sub4.method398(local138);
					}
				}
			}
			System.gc();
			Class4_Sub1_Sub2_Sub1.method139();
			this.aClass8_Sub1_1.method96();
			local32 = (this.anInt851 - 6) / 8 - 1;
			local138 = (this.anInt851 + 6) / 8 + 1;
			local142 = (this.anInt852 - 6) / 8 - 1;
			local146 = (this.anInt852 + 6) / 8 + 1;
			if (this.aBoolean225) {
				local32 = 49;
				local138 = 50;
				local142 = 49;
				local146 = 50;
			}
			for (local194 = local32; local194 <= local138; local194++) {
				for (local208 = local142; local208 <= local146; local208++) {
					if (local194 == local32 || local194 == local138 || local208 == local142 || local208 == local146) {
						local220 = this.aClass8_Sub1_1.method91(local194, local208, 0);
						if (local220 != -1) {
							this.aClass8_Sub1_1.method88(local220, this.aBoolean215, 3);
						}
						local279 = this.aClass8_Sub1_1.method91(local194, local208, 1);
						if (local279 != -1) {
							this.aClass8_Sub1_1.method88(local279, this.aBoolean215, 3);
						}
					}
				}
			}
		} catch (@Pc(1005) RuntimeException local1005) {
			signlink.reporterror("32541, " + true + ", " + local1005.toString());
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
				return new URL("http://127.0.0.1:" + (anInt875 + 80));
			}
		} catch (@Pc(21) Exception local21) {
		}
		return super.getCodeBase();
	}

	@OriginalMember(owner = "client!client", name = "m", descriptor = "(I)V")
	private void method629(@OriginalArg(0) int arg0) {
		try {
			@Pc(5) boolean local5 = true;
			try {
				@Pc(11) int local11 = aClass4_Sub1_Sub1_Sub2_Sub2_1.anInt764 + this.anInt1029;
				@Pc(17) int local17 = aClass4_Sub1_Sub1_Sub2_Sub2_1.anInt765 + this.anInt973;
				if (this.anInt990 - local11 < -500 || this.anInt990 - local11 > 500 || this.anInt991 - local17 < -500 || this.anInt991 - local17 > 500) {
					this.anInt990 = local11;
					this.anInt991 = local17;
				}
				if (this.anInt990 != local11) {
					this.anInt990 += (local11 - this.anInt990) / 16;
				}
				if (this.anInt991 != local17) {
					this.anInt991 += (local17 - this.anInt991) / 16;
				}
				if (super.anIntArray210[1] == 1) {
					this.anInt880 += (-this.anInt880 - 24) / 2;
				} else if (super.anIntArray210[2] == 1) {
					this.anInt880 += (24 - this.anInt880) / 2;
				} else {
					this.anInt880 /= 2;
				}
				if (super.anIntArray210[3] == 1) {
					this.anInt881 += (12 - this.anInt881) / 2;
				} else if (super.anIntArray210[4] == 1) {
					this.anInt881 += (-this.anInt881 - 12) / 2;
				} else {
					this.anInt881 /= 2;
				}
				this.anInt879 = this.anInt879 + this.anInt880 / 2 & 0x7FF;
				this.anInt878 += this.anInt881 / 2;
				if (this.anInt878 < 128) {
					this.anInt878 = 128;
				}
				if (this.anInt878 > 383) {
					this.anInt878 = 383;
				}
				@Pc(204) int local204 = this.anInt990 >> 7;
				@Pc(209) int local209 = this.anInt991 >> 7;
				@Pc(219) int local219 = this.method614(this.anInt895, this.anInt990, this.anInt991);
				@Pc(221) int local221 = 0;
				@Pc(237) int local237;
				if (local204 > 3 && local209 > 3 && local204 < 100 && local209 < 100) {
					for (local237 = local204 - 4; local237 <= local204 + 4; local237++) {
						for (@Pc(243) int local243 = local209 - 4; local243 <= local209 + 4; local243++) {
							@Pc(248) int local248 = this.anInt895;
							if (local248 < 3 && (this.aByteArrayArrayArray8[1][local237][local243] & 0x2) == 2) {
								local248++;
							}
							@Pc(275) int local275 = local219 - this.anIntArrayArrayArray8[local248][local237][local243];
							if (local275 > local221) {
								local221 = local275;
							}
						}
					}
				}
				anInt1034++;
				if (anInt1034 > 1897) {
					anInt1034 = 0;
					this.aClass4_Sub1_Sub4_7.method344(125);
					this.aClass4_Sub1_Sub4_7.method345(0);
					local237 = this.aClass4_Sub1_Sub4_7.anInt506;
					this.aClass4_Sub1_Sub4_7.method345(221);
					this.aClass4_Sub1_Sub4_7.method346((int) (Math.random() * 65536.0D));
					if ((int) (Math.random() * 2.0D) == 0) {
						this.aClass4_Sub1_Sub4_7.method345(167);
					}
					this.aClass4_Sub1_Sub4_7.method345(228);
					this.aClass4_Sub1_Sub4_7.method346(36419);
					this.aClass4_Sub1_Sub4_7.method345((int) (Math.random() * 256.0D));
					this.aClass4_Sub1_Sub4_7.method346(21720);
					this.aClass4_Sub1_Sub4_7.method346((int) (Math.random() * 65536.0D));
					this.aClass4_Sub1_Sub4_7.method346((int) (Math.random() * 65536.0D));
					this.aClass4_Sub1_Sub4_7.method345(101);
					this.aClass4_Sub1_Sub4_7.method354((byte) 5, this.aClass4_Sub1_Sub4_7.anInt506 - local237);
				}
				local237 = local221 * 192;
				if (local237 > 98048) {
					local237 = 98048;
				}
				if (local237 < 32768) {
					local237 = 32768;
				}
				if (local237 > this.anInt961) {
					this.anInt961 += (local237 - this.anInt961) / 24;
				} else if (local237 < this.anInt961) {
					this.anInt961 += (local237 - this.anInt961) / 80;
				}
			} catch (@Pc(427) Exception local427) {
				signlink.reporterror("glfc_ex " + aClass4_Sub1_Sub1_Sub2_Sub2_1.anInt764 + "," + aClass4_Sub1_Sub1_Sub2_Sub2_1.anInt765 + "," + this.anInt990 + "," + this.anInt991 + "," + this.anInt851 + "," + this.anInt852 + "," + this.anInt1056 + "," + this.anInt1057);
				throw new RuntimeException("eek");
			}
		} catch (@Pc(477) RuntimeException local477) {
			signlink.reporterror("36824, " + arg0 + ", " + local477.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "g", descriptor = "(Z)V")
	private void method630() {
		try {
			@Pc(7) Graphics local7 = this.method583().getGraphics();
			local7.setColor(Color.black);
			local7.fillRect(0, 0, 765, 503);
			this.method576();
			@Pc(39) byte local39;
			@Pc(45) int local45;
			if (this.aBoolean242) {
				this.aBoolean269 = false;
				local7.setFont(new Font("Helvetica", 1, 16));
				local7.setColor(Color.yellow);
				local39 = 35;
				local7.drawString("Sorry, an error has occured whilst loading RuneScape", 30, 35);
				local45 = local39 + 50;
				local7.setColor(Color.white);
				local7.drawString("To fix this try the following (in order):", 30, 85);
				@Pc(54) int local54 = local45 + 50;
				local7.setColor(Color.white);
				local7.setFont(new Font("Helvetica", 1, 12));
				local7.drawString("1: Try closing ALL open web-browser windows, and reloading", 30, 135);
				@Pc(71) int local71 = local54 + 30;
				local7.drawString("2: Try clearing your web-browsers cache from tools->internet options", 30, 165);
				@Pc(77) int local77 = local71 + 30;
				local7.drawString("3: Try using a different game-world", 30, 195);
				@Pc(83) int local83 = local77 + 30;
				local7.drawString("4: Try rebooting your computer", 30, 225);
				@Pc(89) int local89 = local83 + 30;
				local7.drawString("5: Try selecting a different version of Java from the play-game menu", 30, 255);
			}
			if (this.aBoolean249) {
				this.aBoolean269 = false;
				local7.setFont(new Font("Helvetica", 1, 20));
				local7.setColor(Color.white);
				local7.drawString("Error - unable to load game!", 50, 50);
				local7.drawString("To play RuneScape make sure you play from", 50, 100);
				local7.drawString("http://www.runescape.com", 50, 150);
			}
			if (this.aBoolean265) {
				this.aBoolean269 = false;
				local7.setColor(Color.yellow);
				local39 = 35;
				local7.drawString("Error a copy of RuneScape already appears to be loaded", 30, 35);
				local45 = local39 + 50;
				local7.setColor(Color.white);
				local7.drawString("To fix this try the following (in order):", 30, 85);
				local45 += 50;
				local7.setColor(Color.white);
				local7.setFont(new Font("Helvetica", 1, 12));
				local7.drawString("1: Try closing ALL open web-browser windows, and reloading", 30, 135);
				local45 += 30;
				local7.drawString("2: Try rebooting your computer, and reloading", 30, 165);
				local45 += 30;
			}
		} catch (@Pc(177) RuntimeException local177) {
			signlink.reporterror("81637, " + false + ", " + local177.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(B)V")
	@Override
	protected void method580(@OriginalArg(0) byte arg0) {
		try {
			this.anIntArray237 = null;
			this.aByteArrayArray6 = null;
			this.aByteArrayArray5 = null;
			this.anIntArray238 = null;
			this.anIntArray239 = null;
			this.aByteArray21 = null;
			this.aClass4_Sub1_Sub2_Sub2_18 = null;
			this.aClass4_Sub1_Sub2_Sub2_19 = null;
			this.aClass4_Sub1_Sub2_Sub2_20 = null;
			this.aClass4_Sub1_Sub2_Sub3_9 = null;
			this.aClass25_21 = null;
			this.aClass25_22 = null;
			this.aClass25_23 = null;
			this.aClass25_24 = null;
			this.aClass4_Sub1_Sub2_Sub2_13 = null;
			this.aClass4_Sub1_Sub2_Sub2_14 = null;
			this.aClass4_Sub1_Sub2_Sub2_15 = null;
			this.aClass4_Sub1_Sub1_Sub2_Sub2Array1 = null;
			this.anIntArray241 = null;
			this.anIntArray242 = null;
			this.aClass4_Sub1_Sub4Array1 = null;
			this.anIntArray270 = null;
			this.anIntArray251 = null;
			this.anIntArray252 = null;
			this.anIntArray253 = null;
			this.anIntArray254 = null;
			this.aStringArray12 = null;
			this.anIntArray231 = null;
			this.anIntArray232 = null;
			this.aClass4_Sub1_Sub2_Sub3Array6 = null;
			this.aClass4_Sub1_Sub2_Sub3_12 = null;
			this.aClass4_Sub1_Sub2_Sub3Array8 = null;
			this.aClass4_Sub1_Sub2_Sub3Array9 = null;
			this.aClass4_Sub1_Sub2_Sub3Array5 = null;
			this.aClass4_Sub1_Sub2_Sub3Array4 = null;
			this.aClass4_Sub1_Sub2_Sub3Array7 = null;
			this.aClass4_Sub1_Sub2_Sub2_1 = null;
			this.aClass4_Sub1_Sub2_Sub2_2 = null;
			this.aClass4_Sub1_Sub2_Sub2_3 = null;
			this.aClass4_Sub1_Sub2_Sub2_4 = null;
			this.aClass4_Sub1_Sub2_Sub2_5 = null;
			this.aClass25_25 = null;
			this.aClass25_26 = null;
			this.aClass25_27 = null;
			this.aClass25_7 = null;
			this.aClass25_8 = null;
			this.aClass25_9 = null;
			this.aClass25_10 = null;
			this.aClass25_11 = null;
			this.aClass11ArrayArrayArray1 = null;
			this.aClass11_11 = null;
			if (this.aClass46_1 != null) {
				this.aClass46_1.aBoolean189 = false;
			}
			this.aClass46_1 = null;
			this.aClass25_3 = null;
			this.aClass25_4 = null;
			this.aClass25_5 = null;
			this.aClass25_6 = null;
			this.aClass11_12 = null;
			this.aClass11_10 = null;
			this.aStringArray11 = null;
			this.aLongArray4 = null;
			this.anIntArray235 = null;
			this.anIntArrayArray24 = null;
			this.method653();
			this.aClass4_Sub1_Sub2_Sub3_8 = null;
			this.aClass4_Sub1_Sub4_7 = null;
			this.aClass4_Sub1_Sub4_6 = null;
			this.aClass4_Sub1_Sub4_8 = null;
			this.aClass4_Sub1_Sub4_9 = null;
			this.aClass4_Sub1_Sub2_Sub2_8 = null;
			this.aClass4_Sub1_Sub2_Sub2_9 = null;
			this.aClass4_Sub1_Sub2_Sub2_10 = null;
			this.aClass4_Sub1_Sub2_Sub2_11 = null;
			this.aClass4_Sub1_Sub2_Sub2_12 = null;
			this.aClass4_Sub1_Sub2_Sub2Array3 = null;
			this.anIntArray249 = null;
			this.aClass4_Sub1_Sub2_Sub2Array2 = null;
			this.aClass4_Sub1_Sub2_Sub3Array10 = null;
			try {
				if (this.aClass15_1 != null) {
					this.aClass15_1.method183();
				}
			} catch (@Pc(251) Exception local251) {
			}
			this.aClass15_1 = null;
			this.aClass4_Sub1_Sub2_Sub3_3 = null;
			this.aClass4_Sub1_Sub2_Sub3_4 = null;
			this.aClass4_Sub1_Sub2_Sub3_5 = null;
			this.aClass4_Sub1_Sub2_Sub3_6 = null;
			this.aClass4_Sub1_Sub2_Sub3_7 = null;
			this.aClass25_15 = null;
			this.aClass25_16 = null;
			this.aClass25_12 = null;
			this.aClass25_13 = null;
			this.aClass25_14 = null;
			this.aClass4_Sub1_Sub1_Sub2_Sub1Array1 = null;
			this.anIntArray256 = null;
			this.aClass25_17 = null;
			this.aClass25_18 = null;
			this.aClass25_19 = null;
			this.aClass25_20 = null;
			this.anIntArrayArray22 = null;
			this.anIntArrayArray25 = null;
			this.anIntArray243 = null;
			this.anIntArray244 = null;
			this.anIntArrayArrayArray8 = null;
			this.aByteArrayArrayArray8 = null;
			this.aClass20_1 = null;
			this.aClass2Array1 = null;
			if (this.aClass8_Sub1_1 != null) {
				this.aClass8_Sub1_1.method105();
			}
			this.aClass8_Sub1_1 = null;
			this.method646();
			Class7.method79();
			Class40.method488();
			Class17.method194();
			Class28.method325();
			Class38.aClass38Array1 = null;
			Class18.aClass18Array1 = null;
			Class12.aClass12Array1 = null;
			Class21.aClass21Array1 = null;
			Class6.aClass6Array1 = null;
			Class6.aClass49_1 = null;
			Class48.aClass48Array1 = null;
			super.aClass25_2 = null;
			Class4_Sub1_Sub1_Sub2_Sub2.aClass49_9 = null;
			Class4_Sub1_Sub2_Sub1.method135();
			Class20.method222();
			Class4_Sub1_Sub1_Sub4.method395();
			Class16.method191();
			System.gc();
		} catch (@Pc(376) RuntimeException local376) {
			signlink.reporterror("15255, " + 8 + ", " + local376.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/String;I)V")
	private void method631(@OriginalArg(0) String arg0) {
		try {
			if (arg0 == null || arg0.length() == 0) {
				this.anInt938 = 0;
			} else {
				@Pc(12) String local12 = arg0;
				@Pc(15) String[] local15 = new String[100];
				@Pc(17) int local17 = 0;
				while (true) {
					@Pc(21) int local21 = local12.indexOf(" ");
					if (local21 == -1) {
						local12 = local12.trim();
						if (local12.length() > 0) {
							local15[local17++] = local12.toLowerCase();
						}
						this.anInt938 = 0;
						label49: for (local21 = 0; local21 < Class17.anInt279; local21++) {
							@Pc(70) Class17 local70 = Class17.method196(local21);
							if (local70.anInt275 == -1 && local70.aString6 != null) {
								@Pc(81) String local81 = local70.aString6.toLowerCase();
								for (@Pc(83) int local83 = 0; local83 < local17; local83++) {
									if (local81.indexOf(local15[local83]) == -1) {
										continue label49;
									}
								}
								this.aStringArray9[this.anInt938] = local81;
								this.anIntArray233[this.anInt938] = local21;
								this.anInt938++;
								if (this.anInt938 >= this.aStringArray9.length) {
									break;
								}
							}
						}
						return;
					}
					@Pc(30) String local30 = local12.substring(0, local21).trim();
					if (local30.length() > 0) {
						local15[local17++] = local30.toLowerCase();
					}
					local12 = local12.substring(local21 + 1);
				}
			}
		} catch (@Pc(138) RuntimeException local138) {
			signlink.reporterror("24063, " + arg0 + ", " + 770 + ", " + local138.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "h", descriptor = "(Z)V")
	private void method632(@OriginalArg(0) boolean arg0) {
		try {
			this.aBoolean251 &= arg0;
			if (this.anInt1025 != 0) {
				@Pc(11) int local11 = 0;
				if (this.anInt953 != 0) {
					local11 = 1;
				}
				for (@Pc(18) int local18 = 0; local18 < 100; local18++) {
					if (this.aStringArray14[local18] != null) {
						@Pc(30) int local30 = this.anIntArray269[local18];
						@Pc(35) String local35 = this.aStringArray13[local18];
						if (local35 != null && local35.startsWith("@cr1@")) {
							local35 = local35.substring(5);
						}
						if (local35 != null && local35.startsWith("@cr2@")) {
							local35 = local35.substring(5);
						}
						if ((local30 == 3 || local30 == 7) && (local30 == 7 || this.anInt970 == 0 || this.anInt970 == 1 && this.method602(local35))) {
							@Pc(88) int local88 = 329 - local11 * 13;
							if (super.anInt835 > 4 && super.anInt836 - 4 > local88 - 10 && super.anInt836 - 4 <= local88 + 3) {
								@Pc(127) int local127 = this.aClass4_Sub1_Sub2_Sub4_3.method506("From:  " + local35 + this.aStringArray14[local18]) + 25;
								if (local127 > 450) {
									local127 = 450;
								}
								if (super.anInt835 < local127 + 4) {
									if (this.anInt959 >= 1) {
										this.aStringArray12[this.anInt989] = "Report abuse @whi@" + local35;
										this.anIntArray253[this.anInt989] = 2031;
										this.anInt989++;
									}
									this.aStringArray12[this.anInt989] = "Add ignore @whi@" + local35;
									this.anIntArray253[this.anInt989] = 2370;
									this.anInt989++;
									this.aStringArray12[this.anInt989] = "Add friend @whi@" + local35;
									this.anIntArray253[this.anInt989] = 2201;
									this.anInt989++;
								}
							}
							local11++;
							if (local11 >= 5) {
								return;
							}
						}
						if ((local30 == 5 || local30 == 6) && this.anInt970 < 2) {
							local11++;
							if (local11 >= 5) {
								return;
							}
						}
					}
				}
			}
		} catch (@Pc(240) RuntimeException local240) {
			signlink.reporterror("39572, " + arg0 + ", " + local240.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILclient!NPNTBMMX;)Z")
	private boolean method633(@OriginalArg(1) Class28 arg0) {
		try {
			@Pc(4) int local4 = arg0.anInt458;
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
				this.aStringArray12[this.anInt989] = "Remove @whi@" + this.aStringArray11[local4];
				this.anIntArray253[this.anInt989] = 761;
				this.anInt989++;
				this.aStringArray12[this.anInt989] = "Message @whi@" + this.aStringArray11[local4];
				this.anIntArray253[this.anInt989] = 246;
				this.anInt989++;
				return true;
			} else if (local4 >= 401 && local4 <= 500) {
				this.aStringArray12[this.anInt989] = "Remove @whi@" + arg0.aString8;
				this.anIntArray253[this.anInt989] = 629;
				this.anInt989++;
				return true;
			} else {
				return false;
			}
		} catch (@Pc(135) RuntimeException local135) {
			signlink.reporterror("448, " + 9516 + ", " + arg0 + ", " + local135.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!PGNBHFUF;II)V")
	private void method634(@OriginalArg(0) Class4_Sub1_Sub4 arg0, @OriginalArg(2) int arg1) {
		try {
			for (@Pc(3) int local3 = 0; local3 < this.anInt950; local3++) {
				@Pc(10) int local10 = this.anIntArray242[local3];
				@Pc(15) Class4_Sub1_Sub1_Sub2_Sub1 local15 = this.aClass4_Sub1_Sub1_Sub2_Sub1Array1[local10];
				@Pc(18) int local18 = arg0.method355();
				if ((local18 & 0x80) != 0) {
					local15.anInt743 = arg0.method381();
					local15.anInt744 = arg0.method382();
				}
				@Pc(40) int local40;
				@Pc(44) int local44;
				if ((local18 & 0x1) != 0) {
					local40 = arg0.method375();
					local44 = arg0.method373();
					local15.method564(anInt1054, local44, local40);
					local15.anInt784 = anInt1054 + 300;
					local15.anInt785 = arg0.method374();
					local15.anInt786 = arg0.method355();
				}
				if ((local18 & 0x4) != 0) {
					local40 = arg0.method374();
					local44 = arg0.method373();
					local15.method564(anInt1054, local44, local40);
					local15.anInt784 = anInt1054 + 300;
					local15.anInt785 = arg0.method375();
					local15.anInt786 = arg0.method375();
				}
				if ((local18 & 0x8) != 0) {
					local15.anInt759 = arg0.method381();
					local40 = arg0.method387();
					local15.anInt763 = local40 >> 16;
					local15.anInt762 = anInt1054 + (local40 & 0xFFFF);
					local15.anInt760 = 0;
					local15.anInt761 = 0;
					if (local15.anInt762 > anInt1054) {
						local15.anInt760 = -1;
					}
					if (local15.anInt759 == 65535) {
						local15.anInt759 = -1;
					}
				}
				if ((local18 & 0x2) != 0) {
					local15.anInt769 = arg0.method357();
					if (local15.anInt769 == 65535) {
						local15.anInt769 = -1;
					}
				}
				if ((local18 & 0x10) != 0) {
					local15.aClass40_1 = Class40.method481(arg0.method382());
					local15.anInt756 = local15.aClass40_1.aByte25;
					local15.anInt757 = local15.aClass40_1.anInt643;
					local15.anInt771 = local15.aClass40_1.anInt638;
					local15.anInt772 = local15.aClass40_1.anInt633;
					local15.anInt773 = local15.aClass40_1.anInt636;
					local15.anInt774 = local15.aClass40_1.anInt644;
					local15.anInt787 = local15.aClass40_1.anInt650;
				}
				if ((local18 & 0x40) != 0) {
					local40 = arg0.method383();
					if (local40 == 65535) {
						local40 = -1;
					}
					local44 = arg0.method355();
					if (local40 == local15.anInt777 && local40 != -1) {
						@Pc(230) int local230 = Class21.aClass21Array1[local40].anInt377;
						if (local230 == 1) {
							local15.anInt778 = 0;
							local15.anInt779 = 0;
							local15.anInt780 = local44;
							local15.anInt781 = 0;
						}
						if (local230 == 2) {
							local15.anInt781 = 0;
						}
					} else if (local40 == -1 || local15.anInt777 == -1 || Class21.aClass21Array1[local40].anInt371 >= Class21.aClass21Array1[local15.anInt777].anInt371) {
						local15.anInt777 = local40;
						local15.anInt778 = 0;
						local15.anInt779 = 0;
						local15.anInt780 = local44;
						local15.anInt781 = 0;
						local15.anInt776 = local15.anInt758;
					}
				}
				if ((local18 & 0x20) != 0) {
					local15.aString14 = arg0.method362();
					local15.anInt770 = 100;
				}
			}
		} catch (@Pc(312) RuntimeException local312) {
			signlink.reporterror("56319, " + arg0 + ", " + 365 + ", " + arg1 + ", " + local312.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Lclient!PGNBHFUF;II)V")
	private void method635(@OriginalArg(0) Class4_Sub1_Sub4 arg0, @OriginalArg(1) int arg1) {
		try {
			while (true) {
				if (arg0.anInt507 + 21 < arg1 * 8) {
					@Pc(18) int local18 = arg0.method366(14, this.aBoolean229);
					if (local18 != 16383) {
						if (this.aClass4_Sub1_Sub1_Sub2_Sub1Array1[local18] == null) {
							this.aClass4_Sub1_Sub1_Sub2_Sub1Array1[local18] = new Class4_Sub1_Sub1_Sub2_Sub1();
						}
						@Pc(38) Class4_Sub1_Sub1_Sub2_Sub1 local38 = this.aClass4_Sub1_Sub1_Sub2_Sub1Array1[local18];
						this.anIntArray256[this.anInt1013++] = local18;
						local38.anInt782 = anInt1054;
						@Pc(58) int local58 = arg0.method366(1, this.aBoolean229);
						local38.aClass40_1 = Class40.method481(arg0.method366(13, this.aBoolean229));
						@Pc(72) int local72 = arg0.method366(1, this.aBoolean229);
						if (local72 == 1) {
							this.anIntArray242[this.anInt950++] = local18;
						}
						@Pc(92) int local92 = arg0.method366(5, this.aBoolean229);
						if (local92 > 15) {
							local92 -= 32;
						}
						@Pc(102) int local102 = arg0.method366(5, this.aBoolean229);
						if (local102 > 15) {
							local102 -= 32;
						}
						local38.anInt756 = local38.aClass40_1.aByte25;
						local38.anInt757 = local38.aClass40_1.anInt643;
						local38.anInt771 = local38.aClass40_1.anInt638;
						local38.anInt772 = local38.aClass40_1.anInt633;
						local38.anInt773 = local38.aClass40_1.anInt636;
						local38.anInt774 = local38.aClass40_1.anInt644;
						local38.anInt787 = local38.aClass40_1.anInt650;
						local38.method561(local58 == 1, aClass4_Sub1_Sub1_Sub2_Sub2_1.anIntArray187[0] + local102, aClass4_Sub1_Sub1_Sub2_Sub2_1.anIntArray188[0] + local92);
						continue;
					}
				}
				arg0.method367();
				return;
			}
		} catch (@Pc(169) RuntimeException local169) {
			signlink.reporterror("7456, " + arg0 + ", " + arg1 + ", " + -730 + ", " + local169.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "n", descriptor = "(I)V")
	private void method636() {
		try {
			if (this.aClass25_24 == null) {
				this.method646();
				super.aClass25_2 = null;
				this.aClass25_12 = null;
				this.aClass25_13 = null;
				this.aClass25_14 = null;
				this.aClass25_15 = null;
				this.aClass25_16 = null;
				this.aClass25_17 = null;
				this.aClass25_18 = null;
				this.aClass25_19 = null;
				this.aClass25_20 = null;
				this.aClass25_24 = new Class25(this.method583(), 96, 479, 284);
				this.aClass25_22 = new Class25(this.method583(), 156, 172, 284);
				Class4_Sub1_Sub2.method494();
				this.aClass4_Sub1_Sub2_Sub2_14.method296(0, 0);
				this.aClass25_21 = new Class25(this.method583(), 261, 190, 284);
				this.aClass25_23 = new Class25(this.method583(), 334, 512, 284);
				Class4_Sub1_Sub2.method494();
				this.aClass25_25 = new Class25(this.method583(), 50, 496, 284);
				this.aClass25_26 = new Class25(this.method583(), 37, 269, 284);
				this.aClass25_27 = new Class25(this.method583(), 45, 249, 284);
				this.aBoolean243 = true;
				this.aClass25_23.method302(this.aBoolean230);
				Class4_Sub1_Sub2_Sub1.anIntArray27 = this.anIntArray275;
			}
		} catch (@Pc(143) RuntimeException local143) {
			signlink.reporterror("41614, " + -30461 + ", " + local143.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "i", descriptor = "(Z)V")
	private void method637() {
		try {
			if (this.anInt989 >= 2 || this.anInt1021 != 0 || this.anInt1067 != 0) {
				@Pc(31) String local31;
				if (this.anInt1021 == 1 && this.anInt989 < 2) {
					local31 = "Use " + this.aString29 + " with...";
				} else if (this.anInt1067 == 1 && this.anInt989 < 2) {
					local31 = this.aString31 + "...";
				} else {
					local31 = this.aStringArray12[this.anInt989 - 1];
				}
				if (this.anInt989 > 2) {
					local31 = local31 + "@whi@ / " + (this.anInt989 - 2) + " more options";
				}
				this.aClass4_Sub1_Sub2_Sub4_4.method513(15, local31, 4, anInt1054 / 1000, 16777215);
				this.aBoolean251 &= true;
			}
		} catch (@Pc(101) RuntimeException local101) {
			signlink.reporterror("20020, " + true + ", " + local101.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIIIIIIII)V")
	private void method638(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		try {
			@Pc(1) Class4_Sub2 local1 = null;
			for (@Pc(6) Class4_Sub2 local6 = (Class4_Sub2) this.aClass11_11.method166(); local6 != null; local6 = (Class4_Sub2) this.aClass11_11.method168()) {
				if (local6.anInt312 == arg4 && local6.anInt314 == arg2 && local6.anInt315 == arg1 && local6.anInt313 == arg3) {
					local1 = local6;
					break;
				}
			}
			if (local1 == null) {
				local1 = new Class4_Sub2();
				local1.anInt312 = arg4;
				local1.anInt313 = arg3;
				local1.anInt314 = arg2;
				local1.anInt315 = arg1;
				this.method719(local1);
				this.aClass11_11.method163(local1);
			}
			local1.anInt304 = arg7;
			local1.anInt306 = arg6;
			local1.anInt305 = arg0;
			local1.anInt308 = arg5;
			local1.anInt307 = arg8;
		} catch (@Pc(81) RuntimeException local81) {
			signlink.reporterror("37876, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + 0 + ", " + arg7 + ", " + arg8 + ", " + local81.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(BLclient!NPNTBMMX;I)I")
	private int method639(@OriginalArg(1) Class28 arg0, @OriginalArg(2) int arg1) {
		try {
			if (arg0.anIntArrayArray10 == null || arg1 >= arg0.anIntArrayArray10.length) {
				return -2;
			}
			try {
				@Pc(22) int[] local22 = arg0.anIntArrayArray10[arg1];
				@Pc(24) int local24 = 0;
				@Pc(26) int local26 = 0;
				@Pc(28) byte local28 = 0;
				while (true) {
					@Pc(33) int local33 = local22[local26++];
					@Pc(35) int local35 = 0;
					@Pc(37) byte local37 = 0;
					if (local33 == 0) {
						return local24;
					}
					if (local33 == 1) {
						local35 = this.anIntArray258[local22[local26++]];
					}
					if (local33 == 2) {
						local35 = this.anIntArray212[local22[local26++]];
					}
					if (local33 == 3) {
						local35 = this.anIntArray217[local22[local26++]];
					}
					@Pc(83) Class28 local83;
					@Pc(88) int local88;
					@Pc(101) int local101;
					if (local33 == 4) {
						local83 = Class28.method318(local22[local26++]);
						local88 = local22[local26++];
						if (local88 >= 0 && local88 < Class17.anInt279 && (!Class17.method196(local88).aBoolean81 || aBoolean222)) {
							for (local101 = 0; local101 < local83.anIntArray94.length; local101++) {
								if (local83.anIntArray94[local101] == local88 + 1) {
									local35 += local83.anIntArray95[local101];
								}
							}
						}
					}
					if (local33 == 5) {
						local35 = this.anIntArray249[local22[local26++]];
					}
					if (local33 == 6) {
						local35 = anIntArray216[this.anIntArray212[local22[local26++]] - 1];
					}
					if (local33 == 7) {
						local35 = this.anIntArray249[local22[local26++]] * 100 / 46875;
					}
					if (local33 == 8) {
						local35 = aClass4_Sub1_Sub1_Sub2_Sub2_1.anInt799;
					}
					@Pc(176) int local176;
					if (local33 == 9) {
						for (local176 = 0; local176 < Class30.anInt488; local176++) {
							if (Class30.aBooleanArray5[local176]) {
								local35 += this.anIntArray212[local176];
							}
						}
					}
					if (local33 == 10) {
						local83 = Class28.method318(local22[local26++]);
						local88 = local22[local26++] + 1;
						if (local88 >= 0 && local88 < Class17.anInt279 && (!Class17.method196(local88).aBoolean81 || aBoolean222)) {
							for (local101 = 0; local101 < local83.anIntArray94.length; local101++) {
								if (local83.anIntArray94[local101] == local88) {
									local35 = 999999999;
									break;
								}
							}
						}
					}
					if (local33 == 11) {
						local35 = this.anInt882;
					}
					if (local33 == 12) {
						local35 = this.anInt910;
					}
					if (local33 == 13) {
						local176 = this.anIntArray249[local22[local26++]];
						local88 = local22[local26++];
						local35 = (local176 & 0x1 << local88) == 0 ? 0 : 1;
					}
					if (local33 == 14) {
						local176 = local22[local26++];
						@Pc(290) Class13 local290 = Class13.aClass13Array1[local176];
						local101 = local290.anInt241;
						@Pc(296) int local296 = local290.anInt242;
						@Pc(299) int local299 = local290.anInt243;
						@Pc(305) int local305 = anIntArray223[local299 - local296];
						local35 = this.anIntArray249[local101] >> local296 & local305;
					}
					if (local33 == 15) {
						local37 = 1;
					}
					if (local33 == 16) {
						local37 = 2;
					}
					if (local33 == 17) {
						local37 = 3;
					}
					if (local33 == 18) {
						local35 = (aClass4_Sub1_Sub1_Sub2_Sub2_1.anInt764 >> 7) + this.anInt1056;
					}
					if (local33 == 19) {
						local35 = (aClass4_Sub1_Sub1_Sub2_Sub2_1.anInt765 >> 7) + this.anInt1057;
					}
					if (local33 == 20) {
						local35 = local22[local26++];
					}
					if (local37 == 0) {
						if (local28 == 0) {
							local24 += local35;
						}
						if (local28 == 1) {
							local24 -= local35;
						}
						if (local28 == 2 && local35 != 0) {
							local24 /= local35;
						}
						if (local28 == 3) {
							local24 *= local35;
						}
						local28 = 0;
					} else {
						local28 = local37;
					}
				}
			} catch (@Pc(398) Exception local398) {
				return -1;
			}
		} catch (@Pc(401) RuntimeException local401) {
			signlink.reporterror("56370, " + 7 + ", " + arg0 + ", " + arg1 + ", " + local401.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;Z)V")
	private void method640(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) boolean arg2) {
		signlink.errorname = arg0;
		try {
			if (!arg2) {
				this.aString18 = "";
				this.aString19 = "Connecting to server...";
				this.method667(true);
			}
			this.aClass15_1 = new Class15(this, this.method716(anInt875 + 43594), 5029);
			@Pc(30) long local30 = Class47.method550(arg0);
			@Pc(37) int local37 = (int) (local30 >> 16 & 0x1FL);
			this.aClass4_Sub1_Sub4_7.anInt506 = 0;
			this.aClass4_Sub1_Sub4_7.method345(14);
			this.aClass4_Sub1_Sub4_7.method345(local37);
			this.aClass15_1.method187(this.aClass4_Sub1_Sub4_7.aByteArray10, 2);
			for (@Pc(60) int local60 = 0; local60 < 8; local60++) {
				this.aClass15_1.method184();
			}
			@Pc(74) int local74 = this.aClass15_1.method184();
			@Pc(76) int local76 = local74;
			@Pc(225) int local225;
			@Pc(260) int local260;
			if (local74 == 0) {
				this.aClass15_1.method186(this.aClass4_Sub1_Sub4_8.aByteArray10, 0, 8);
				this.aClass4_Sub1_Sub4_8.anInt506 = 0;
				this.aLong29 = this.aClass4_Sub1_Sub4_8.method361();
				@Pc(99) int[] local99 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (this.aLong29 >> 32), (int) this.aLong29 };
				this.aClass4_Sub1_Sub4_7.anInt506 = 0;
				this.aClass4_Sub1_Sub4_7.method345(10);
				this.aClass4_Sub1_Sub4_7.method349(local99[0]);
				this.aClass4_Sub1_Sub4_7.method349(local99[1]);
				this.aClass4_Sub1_Sub4_7.method349(local99[2]);
				this.aClass4_Sub1_Sub4_7.method349(local99[3]);
				this.aClass4_Sub1_Sub4_7.method349(signlink.anInt1077);
				this.aClass4_Sub1_Sub4_7.method352(arg0);
				this.aClass4_Sub1_Sub4_7.method352(arg1);
				this.aClass4_Sub1_Sub4_7.method370(aBigInteger2, aBigInteger1);
				this.aClass4_Sub1_Sub4_6.anInt506 = 0;
				if (arg2) {
					this.aClass4_Sub1_Sub4_6.method345(18);
				} else {
					this.aClass4_Sub1_Sub4_6.method345(16);
				}
				this.aClass4_Sub1_Sub4_6.method345(this.aClass4_Sub1_Sub4_7.anInt506 + 36 + 1 + 1 + 2);
				this.aClass4_Sub1_Sub4_6.method345(255);
				this.aClass4_Sub1_Sub4_6.method346(355);
				this.aClass4_Sub1_Sub4_6.method345(aBoolean223 ? 1 : 0);
				for (local225 = 0; local225 < 9; local225++) {
					this.aClass4_Sub1_Sub4_6.method349(this.anIntArray213[local225]);
				}
				this.aClass4_Sub1_Sub4_6.method353(this.aClass4_Sub1_Sub4_7.aByteArray10, this.aClass4_Sub1_Sub4_7.anInt506);
				this.aClass4_Sub1_Sub4_7.aClass3_1 = new Class3(this.anInt945, local99);
				for (local260 = 0; local260 < 4; local260++) {
					local99[local260] += 50;
				}
				this.aClass3_2 = new Class3(this.anInt945, local99);
				this.aClass15_1.method187(this.aClass4_Sub1_Sub4_6.aByteArray10, this.aClass4_Sub1_Sub4_6.anInt506);
				local74 = this.aClass15_1.method184();
			}
			if (local74 == 1) {
				try {
					Thread.sleep(2000L);
				} catch (@Pc(303) Exception local303) {
				}
				this.method640(arg0, arg1, arg2);
			} else {
				@Pc(391) int local391;
				if (local74 == 2) {
					this.anInt959 = this.aClass15_1.method184();
					aBoolean252 = this.aClass15_1.method184() == 1;
					this.aLong33 = 0L;
					this.anInt975 = 0;
					this.aClass46_1.anInt720 = 0;
					super.aBoolean214 = true;
					this.aBoolean240 = true;
					this.aBoolean251 = true;
					this.aClass4_Sub1_Sub4_7.anInt506 = 0;
					this.aClass4_Sub1_Sub4_8.anInt506 = 0;
					this.anInt860 = -1;
					this.anInt1062 = -1;
					this.anInt1063 = -1;
					this.anInt1064 = -1;
					this.anInt859 = 0;
					this.anInt861 = 0;
					this.anInt953 = 0;
					this.anInt863 = 0;
					this.anInt954 = 0;
					this.anInt989 = 0;
					this.aBoolean228 = false;
					super.anInt833 = 0;
					for (local391 = 0; local391 < 100; local391++) {
						this.aStringArray14[local391] = null;
					}
					this.anInt1021 = 0;
					this.anInt1067 = 0;
					this.anInt946 = 0;
					this.anInt935 = 0;
					this.anInt1029 = (int) (Math.random() * 100.0D) - 50;
					this.anInt973 = (int) (Math.random() * 110.0D) - 55;
					this.anInt1000 = (int) (Math.random() * 80.0D) - 40;
					this.anInt1050 = (int) (Math.random() * 120.0D) - 60;
					this.anInt985 = (int) (Math.random() * 30.0D) - 20;
					this.anInt879 = (int) (Math.random() * 20.0D) - 10 & 0x7FF;
					this.anInt944 = 0;
					this.anInt885 = -1;
					this.anInt865 = 0;
					this.anInt866 = 0;
					this.anInt949 = 0;
					this.anInt1013 = 0;
					for (local225 = 0; local225 < this.anInt947; local225++) {
						this.aClass4_Sub1_Sub1_Sub2_Sub2Array1[local225] = null;
						this.aClass4_Sub1_Sub4Array1[local225] = null;
					}
					for (local260 = 0; local260 < 16384; local260++) {
						this.aClass4_Sub1_Sub1_Sub2_Sub1Array1[local260] = null;
					}
					aClass4_Sub1_Sub1_Sub2_Sub2_1 = this.aClass4_Sub1_Sub1_Sub2_Sub2Array1[this.anInt948] = new Class4_Sub1_Sub1_Sub2_Sub2();
					this.aClass11_12.method170();
					this.aClass11_10.method170();
					@Pc(536) int local536;
					@Pc(540) int local540;
					for (@Pc(532) int local532 = 0; local532 < 4; local532++) {
						for (local536 = 0; local536 < 104; local536++) {
							for (local540 = 0; local540 < 104; local540++) {
								this.aClass11ArrayArrayArray1[local532][local536][local540] = null;
							}
						}
					}
					this.aClass11_11 = new Class11(145);
					this.anInt958 = 0;
					this.anInt957 = 0;
					this.method715(aByte32, this.anInt1075);
					this.anInt1075 = -1;
					this.method715(aByte32, this.anInt955);
					this.anInt955 = -1;
					this.method715(aByte32, this.anInt951);
					this.anInt951 = -1;
					this.method715(aByte32, this.anInt1015);
					this.anInt1015 = -1;
					this.method715(aByte32, this.anInt988);
					this.anInt988 = -1;
					this.method715(aByte32, this.anInt995);
					this.anInt995 = -1;
					this.method715(aByte32, this.anInt968);
					this.anInt968 = -1;
					this.aBoolean256 = false;
					this.anInt994 = 3;
					this.anInt996 = 0;
					this.aBoolean228 = false;
					this.aBoolean237 = false;
					this.aString24 = null;
					this.anInt987 = 0;
					this.anInt1010 = -1;
					this.aBoolean231 = true;
					this.method621();
					for (local536 = 0; local536 < 5; local536++) {
						this.anIntArray236[local536] = 0;
					}
					for (local540 = 0; local540 < 5; local540++) {
						this.aStringArray10[local540] = null;
						this.aBooleanArray11[local540] = false;
					}
					anInt1035 = 0;
					anInt918 = 0;
					anInt934 = 0;
					anInt856 = 0;
					anInt869 = 0;
					anInt926 = 0;
					anInt976 = 0;
					anInt893 = 0;
					anInt923 = 0;
					this.method636();
				} else if (local74 == 3) {
					this.aString18 = "";
					this.aString19 = "Invalid username or password.";
				} else if (local74 == 4) {
					this.aString18 = "Your account has been disabled.";
					this.aString19 = "Please check your message-centre for details.";
				} else if (local74 == 5) {
					this.aString18 = "Your account is already logged in.";
					this.aString19 = "Try again in 60 secs...";
				} else if (local74 == 6) {
					this.aString18 = "RuneScape has been updated!";
					this.aString19 = "Please reload this page.";
				} else if (local74 == 7) {
					this.aString18 = "This world is full.";
					this.aString19 = "Please use a different world.";
				} else if (local74 == 8) {
					this.aString18 = "Unable to connect.";
					this.aString19 = "Login server offline.";
				} else if (local74 == 9) {
					this.aString18 = "Login limit exceeded.";
					this.aString19 = "Too many connections from your address.";
				} else if (local74 == 10) {
					this.aString18 = "Unable to connect.";
					this.aString19 = "Bad session id.";
				} else if (local74 == 11) {
					this.aString18 = "Login server rejected session.";
					this.aString19 = "Please try again.";
				} else if (local74 == 12) {
					this.aString18 = "You need a members account to login to this world.";
					this.aString19 = "Please subscribe, or use a different world.";
				} else if (local74 == 13) {
					this.aString18 = "Could not complete login.";
					this.aString19 = "Please try using a different world.";
				} else if (local74 == 14) {
					this.aString18 = "The server is being updated.";
					this.aString19 = "Please wait 1 minute and try again.";
				} else if (local74 == 15) {
					this.aBoolean251 = true;
					this.aClass4_Sub1_Sub4_7.anInt506 = 0;
					this.aClass4_Sub1_Sub4_8.anInt506 = 0;
					this.anInt860 = -1;
					this.anInt1062 = -1;
					this.anInt1063 = -1;
					this.anInt1064 = -1;
					this.anInt859 = 0;
					this.anInt861 = 0;
					this.anInt953 = 0;
					this.anInt989 = 0;
					this.aBoolean228 = false;
					this.aLong30 = System.currentTimeMillis();
				} else if (local74 == 16) {
					this.aString18 = "Login attempts exceeded.";
					this.aString19 = "Please wait 1 minute and try again.";
				} else if (local74 == 17) {
					this.aString18 = "You are standing in a members-only area.";
					this.aString19 = "To play on this world move to a free area first";
				} else if (local74 == 20) {
					this.aString18 = "Invalid loginserver requested";
					this.aString19 = "Please try using a different world.";
				} else if (local74 == 21) {
					local391 = this.aClass15_1.method184();
					for (@Pc(919) int local919 = local391 + 3; local919 >= 0; local919--) {
						this.aString18 = "You have only just left another world";
						this.aString19 = "Your profile will be transferred in: " + local919;
						this.method667(true);
						try {
							Thread.sleep(1200L);
						} catch (@Pc(941) Exception local941) {
						}
					}
					this.method640(arg0, arg1, arg2);
				} else if (local74 == 22) {
					this.aString18 = "Malformed login packet.";
					this.aString19 = "Please try again.";
				} else if (local74 != -1) {
					System.out.println("response:" + local74);
					this.aString18 = "Unexpected server response";
					this.aString19 = "Please try using a different world.";
				} else if (local76 != 0) {
					this.aString18 = "No response from server";
					this.aString19 = "Please try using a different world.";
				} else if (this.anInt1061 < 2) {
					try {
						Thread.sleep(2000L);
					} catch (@Pc(973) Exception local973) {
					}
					this.anInt1061++;
					this.method640(arg0, arg1, arg2);
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

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!NPNTBMMX;I)Z")
	private boolean method641(@OriginalArg(0) Class28 arg0) {
		try {
			if (arg0.anIntArray93 == null) {
				return false;
			}
			for (@Pc(14) int local14 = 0; local14 < arg0.anIntArray93.length; local14++) {
				@Pc(22) int local22 = this.method639(arg0, local14);
				@Pc(27) int local27 = arg0.anIntArray87[local14];
				if (arg0.anIntArray93[local14] == 2) {
					if (local22 >= local27) {
						return false;
					}
				} else if (arg0.anIntArray93[local14] == 3) {
					if (local22 <= local27) {
						return false;
					}
				} else if (arg0.anIntArray93[local14] == 4) {
					if (local22 == local27) {
						return false;
					}
				} else if (local22 != local27) {
					return false;
				}
			}
			return true;
		} catch (@Pc(74) RuntimeException local74) {
			signlink.reporterror("87736, " + arg0 + ", " + 4 + ", " + local74.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILclient!PGNBHFUF;B)V")
	private void method642(@OriginalArg(0) int arg0, @OriginalArg(1) Class4_Sub1_Sub4 arg1) {
		try {
			while (true) {
				if (arg1.anInt507 + 10 < arg0 * 8) {
					@Pc(13) int local13 = arg1.method366(11, this.aBoolean229);
					if (local13 != 2047) {
						if (this.aClass4_Sub1_Sub1_Sub2_Sub2Array1[local13] == null) {
							this.aClass4_Sub1_Sub1_Sub2_Sub2Array1[local13] = new Class4_Sub1_Sub1_Sub2_Sub2();
							if (this.aClass4_Sub1_Sub4Array1[local13] != null) {
								this.aClass4_Sub1_Sub1_Sub2_Sub2Array1[local13].method565(this.anInt1037, this.aClass4_Sub1_Sub4Array1[local13]);
							}
						}
						this.anIntArray241[this.anInt949++] = local13;
						@Pc(60) Class4_Sub1_Sub1_Sub2_Sub2 local60 = this.aClass4_Sub1_Sub1_Sub2_Sub2Array1[local13];
						local60.anInt782 = anInt1054;
						@Pc(69) int local69 = arg1.method366(1, this.aBoolean229);
						if (local69 == 1) {
							this.anIntArray242[this.anInt950++] = local13;
						}
						@Pc(89) int local89 = arg1.method366(5, this.aBoolean229);
						if (local89 > 15) {
							local89 -= 32;
						}
						@Pc(99) int local99 = arg1.method366(1, this.aBoolean229);
						@Pc(105) int local105 = arg1.method366(5, this.aBoolean229);
						if (local105 > 15) {
							local105 -= 32;
						}
						local60.method561(local99 == 1, aClass4_Sub1_Sub1_Sub2_Sub2_1.anIntArray187[0] + local105, aClass4_Sub1_Sub1_Sub2_Sub2_1.anIntArray188[0] + local89);
						continue;
					}
				}
				arg1.method367();
				return;
			}
		} catch (@Pc(143) RuntimeException local143) {
			signlink.reporterror("44696, " + arg0 + ", " + arg1 + ", " + 9 + ", " + local143.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "i", descriptor = "(B)V")
	private void method643() {
		try {
			if (super.anInt840 == 1) {
				if (super.anInt841 >= 539 && super.anInt841 <= 573 && super.anInt842 >= 169 && super.anInt842 < 205 && this.anIntArray255[0] != -1) {
					this.aBoolean246 = true;
					this.anInt994 = 0;
					this.aBoolean254 = true;
				}
				if (super.anInt841 >= 569 && super.anInt841 <= 599 && super.anInt842 >= 168 && super.anInt842 < 205 && this.anIntArray255[1] != -1) {
					this.aBoolean246 = true;
					this.anInt994 = 1;
					this.aBoolean254 = true;
				}
				if (super.anInt841 >= 597 && super.anInt841 <= 627 && super.anInt842 >= 168 && super.anInt842 < 205 && this.anIntArray255[2] != -1) {
					this.aBoolean246 = true;
					this.anInt994 = 2;
					this.aBoolean254 = true;
				}
				if (super.anInt841 >= 625 && super.anInt841 <= 669 && super.anInt842 >= 168 && super.anInt842 < 203 && this.anIntArray255[3] != -1) {
					this.aBoolean246 = true;
					this.anInt994 = 3;
					this.aBoolean254 = true;
				}
				if (super.anInt841 >= 666 && super.anInt841 <= 696 && super.anInt842 >= 168 && super.anInt842 < 205 && this.anIntArray255[4] != -1) {
					this.aBoolean246 = true;
					this.anInt994 = 4;
					this.aBoolean254 = true;
				}
				if (super.anInt841 >= 694 && super.anInt841 <= 724 && super.anInt842 >= 168 && super.anInt842 < 205 && this.anIntArray255[5] != -1) {
					this.aBoolean246 = true;
					this.anInt994 = 5;
					this.aBoolean254 = true;
				}
				if (super.anInt841 >= 722 && super.anInt841 <= 756 && super.anInt842 >= 169 && super.anInt842 < 205 && this.anIntArray255[6] != -1) {
					this.aBoolean246 = true;
					this.anInt994 = 6;
					this.aBoolean254 = true;
				}
				if (super.anInt841 >= 540 && super.anInt841 <= 574 && super.anInt842 >= 466 && super.anInt842 < 502 && this.anIntArray255[7] != -1) {
					this.aBoolean246 = true;
					this.anInt994 = 7;
					this.aBoolean254 = true;
				}
				if (super.anInt841 >= 572 && super.anInt841 <= 602 && super.anInt842 >= 466 && super.anInt842 < 503 && this.anIntArray255[8] != -1) {
					this.aBoolean246 = true;
					this.anInt994 = 8;
					this.aBoolean254 = true;
				}
				if (super.anInt841 >= 599 && super.anInt841 <= 629 && super.anInt842 >= 466 && super.anInt842 < 503 && this.anIntArray255[9] != -1) {
					this.aBoolean246 = true;
					this.anInt994 = 9;
					this.aBoolean254 = true;
				}
				if (super.anInt841 >= 627 && super.anInt841 <= 671 && super.anInt842 >= 467 && super.anInt842 < 502 && this.anIntArray255[10] != -1) {
					this.aBoolean246 = true;
					this.anInt994 = 10;
					this.aBoolean254 = true;
				}
				if (super.anInt841 >= 669 && super.anInt841 <= 699 && super.anInt842 >= 466 && super.anInt842 < 503 && this.anIntArray255[11] != -1) {
					this.aBoolean246 = true;
					this.anInt994 = 11;
					this.aBoolean254 = true;
				}
				if (super.anInt841 >= 696 && super.anInt841 <= 726 && super.anInt842 >= 466 && super.anInt842 < 503 && this.anIntArray255[12] != -1) {
					this.aBoolean246 = true;
					this.anInt994 = 12;
					this.aBoolean254 = true;
				}
				if (super.anInt841 >= 724 && super.anInt841 <= 758 && super.anInt842 >= 466 && super.anInt842 < 502 && this.anIntArray255[13] != -1) {
					this.aBoolean246 = true;
					this.anInt994 = 13;
					this.aBoolean254 = true;
					return;
				}
			}
		} catch (@Pc(446) RuntimeException local446) {
			signlink.reporterror("26461, " + 6 + ", " + local446.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IZIIIII)V")
	private void method644(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		try {
			@Pc(5) int local5 = 2048 - arg5 & 0x7FF;
			@Pc(11) int local11 = 2048 - arg4 & 0x7FF;
			@Pc(13) int local13 = 0;
			@Pc(15) int local15 = 0;
			@Pc(17) int local17 = arg0;
			@Pc(32) int local32;
			@Pc(36) int local36;
			@Pc(46) int local46;
			if (local5 != 0) {
				local32 = Class4_Sub1_Sub1_Sub4.anIntArray137[local5];
				local36 = Class4_Sub1_Sub1_Sub4.anIntArray138[local5];
				local46 = local36 * 0 - arg0 * local32 >> 16;
				local17 = local32 * 0 + arg0 * local36 >> 16;
				local15 = local46;
			}
			if (local11 != 0) {
				local32 = Class4_Sub1_Sub1_Sub4.anIntArray137[local11];
				local36 = Class4_Sub1_Sub1_Sub4.anIntArray138[local11];
				local46 = local17 * local32 + local36 * 0 >> 16;
				local17 = local17 * local36 - local32 * 0 >> 16;
				local13 = local46;
			}
			this.anInt929 = arg2 - local13;
			this.anInt930 = arg3 - local15;
			this.anInt931 = arg1 - local17;
			this.anInt932 = arg5;
			this.anInt933 = arg4;
		} catch (@Pc(113) RuntimeException local113) {
			signlink.reporterror("7202, " + arg0 + ", " + false + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local113.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "()V")
	@Override
	protected void method578() {
		this.method585(53, "Starting up", 20);
		if (signlink.sunjava) {
			super.anInt829 = 5;
		}
		if (aBoolean232) {
			this.aBoolean265 = true;
			return;
		}
		aBoolean232 = true;
		@Pc(21) boolean local21 = false;
		@Pc(25) String local25 = this.method711();
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
			this.aBoolean249 = true;
			return;
		}
		if (signlink.aRandomAccessFile3 != null) {
			for (@Pc(101) int local101 = 0; local101 < 5; local101++) {
				this.aClass34Array1[local101] = new Class34(anInt867, signlink.aRandomAccessFile3, signlink.aRandomAccessFileArray1[local101], 500000, local101 + 1);
			}
		}
		try {
			this.method625();
			this.aClass32_2 = this.method697("title", "title screen", this.anIntArray213[1], 1, 25);
			this.aClass4_Sub1_Sub2_Sub4_2 = new Class4_Sub1_Sub2_Sub4(false, this.aClass32_2, (byte) 4, "p11_full");
			this.aClass4_Sub1_Sub2_Sub4_3 = new Class4_Sub1_Sub2_Sub4(false, this.aClass32_2, (byte) 4, "p12_full");
			this.aClass4_Sub1_Sub2_Sub4_4 = new Class4_Sub1_Sub2_Sub4(false, this.aClass32_2, (byte) 4, "b12_full");
			this.aClass4_Sub1_Sub2_Sub4_5 = new Class4_Sub1_Sub2_Sub4(true, this.aClass32_2, (byte) 4, "q8_full");
			this.method591((byte) 7);
			this.method672(anInt916);
			@Pc(197) Class32 local197 = this.method697("config", "config", this.anIntArray213[2], 2, 30);
			@Pc(209) Class32 local209 = this.method697("interface", "interface", this.anIntArray213[3], 3, 35);
			@Pc(221) Class32 local221 = this.method697("media", "2d graphics", this.anIntArray213[4], 4, 40);
			@Pc(233) Class32 local233 = this.method697("textures", "textures", this.anIntArray213[6], 6, 45);
			@Pc(245) Class32 local245 = this.method697("wordenc", "chat system", this.anIntArray213[7], 7, 50);
			@Pc(257) Class32 local257 = this.method697("sounds", "sound effects", this.anIntArray213[8], 8, 55);
			this.aByteArrayArrayArray8 = new byte[4][104][104];
			this.anIntArrayArrayArray8 = new int[4][105][105];
			this.aClass20_1 = new Class20(this.anIntArrayArrayArray8, 104, 0, 4, 104);
			for (@Pc(282) int local282 = 0; local282 < 4; local282++) {
				this.aClass2Array1[local282] = new Class2(104, false, 104);
			}
			this.aClass4_Sub1_Sub2_Sub3_8 = new Class4_Sub1_Sub2_Sub3(512, 512);
			@Pc(317) Class32 local317 = this.method697("versionlist", "update list", this.anIntArray213[5], 5, 60);
			this.method585(53, "Connecting to update server", 60);
			this.aClass8_Sub1_1 = new Class8_Sub1();
			this.aClass8_Sub1_1.method95(local317, this);
			Class16.method189(this.aClass8_Sub1_1.method102(anInt909));
			Class4_Sub1_Sub1_Sub4.method396(this.aClass8_Sub1_1.method104(0), this.aClass8_Sub1_1);
			if (!aBoolean223) {
				this.anInt925 = 0;
				this.aBoolean235 = true;
				this.aClass8_Sub1_1.method93(2, this.anInt925);
				while (this.aClass8_Sub1_1.method103() > 0) {
					this.method684();
					try {
						Thread.sleep(100L);
					} catch (@Pc(368) Exception local368) {
					}
					if (this.aClass8_Sub1_1.anInt67 > 3) {
						this.method665("ondemand");
						return;
					}
				}
			}
			this.method585(53, "Requesting animations", 65);
			@Pc(392) int local392 = this.aClass8_Sub1_1.method104(1);
			for (@Pc(394) int local394 = 0; local394 < local392; local394++) {
				this.aClass8_Sub1_1.method93(1, local394);
			}
			@Pc(413) int local413;
			while (this.aClass8_Sub1_1.method103() > 0) {
				local413 = local392 - this.aClass8_Sub1_1.method103();
				if (local413 > 0) {
					this.method585(53, "Loading animations - " + local413 * 100 / local392 + "%", 65);
				}
				this.method684();
				try {
					Thread.sleep(100L);
				} catch (@Pc(439) Exception local439) {
				}
				if (this.aClass8_Sub1_1.anInt67 > 3) {
					this.method665("ondemand");
					return;
				}
			}
			this.method585(53, "Requesting models", 70);
			local392 = this.aClass8_Sub1_1.method104(0);
			@Pc(473) int local473;
			for (local413 = 0; local413 < local392; local413++) {
				local473 = this.aClass8_Sub1_1.method99(local413, aBoolean233);
				if ((local473 & 0x1) != 0) {
					this.aClass8_Sub1_1.method93(0, local413);
				}
			}
			local392 = this.aClass8_Sub1_1.method103();
			while (this.aClass8_Sub1_1.method103() > 0) {
				local473 = local392 - this.aClass8_Sub1_1.method103();
				if (local473 > 0) {
					this.method585(53, "Loading models - " + local473 * 100 / local392 + "%", 70);
				}
				this.method684();
				try {
					Thread.sleep(100L);
				} catch (@Pc(524) Exception local524) {
				}
			}
			if (this.aClass34Array1[0] != null) {
				this.method585(53, "Requesting maps", 75);
				this.aClass8_Sub1_1.method93(3, this.aClass8_Sub1_1.method91(47, 48, 0));
				this.aClass8_Sub1_1.method93(3, this.aClass8_Sub1_1.method91(47, 48, 1));
				this.aClass8_Sub1_1.method93(3, this.aClass8_Sub1_1.method91(48, 48, 0));
				this.aClass8_Sub1_1.method93(3, this.aClass8_Sub1_1.method91(48, 48, 1));
				this.aClass8_Sub1_1.method93(3, this.aClass8_Sub1_1.method91(49, 48, 0));
				this.aClass8_Sub1_1.method93(3, this.aClass8_Sub1_1.method91(49, 48, 1));
				this.aClass8_Sub1_1.method93(3, this.aClass8_Sub1_1.method91(47, 47, 0));
				this.aClass8_Sub1_1.method93(3, this.aClass8_Sub1_1.method91(47, 47, 1));
				this.aClass8_Sub1_1.method93(3, this.aClass8_Sub1_1.method91(48, 47, 0));
				this.aClass8_Sub1_1.method93(3, this.aClass8_Sub1_1.method91(48, 47, 1));
				this.aClass8_Sub1_1.method93(3, this.aClass8_Sub1_1.method91(48, 148, 0));
				this.aClass8_Sub1_1.method93(3, this.aClass8_Sub1_1.method91(48, 148, 1));
				local392 = this.aClass8_Sub1_1.method103();
				while (this.aClass8_Sub1_1.method103() > 0) {
					local473 = local392 - this.aClass8_Sub1_1.method103();
					if (local473 > 0) {
						this.method585(53, "Loading maps - " + local473 * 100 / local392 + "%", 75);
					}
					this.method684();
					try {
						Thread.sleep(100L);
					} catch (@Pc(709) Exception local709) {
					}
				}
			}
			local392 = this.aClass8_Sub1_1.method104(0);
			@Pc(730) int local730;
			for (local473 = 0; local473 < local392; local473++) {
				local730 = this.aClass8_Sub1_1.method99(local473, aBoolean233);
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
					this.aClass8_Sub1_1.method87(local473, 0, local732);
				}
			}
			this.aClass8_Sub1_1.method86(aBoolean222, anInt877);
			if (!aBoolean223) {
				local392 = this.aClass8_Sub1_1.method104(2);
				for (local730 = 1; local730 < local392; local730++) {
					if (this.aClass8_Sub1_1.method97(local730)) {
						this.aClass8_Sub1_1.method87(local730, 2, (byte) 1);
					}
				}
			}
			this.method585(53, "Unpacking media", 80);
			this.aClass4_Sub1_Sub2_Sub2_13 = new Class4_Sub1_Sub2_Sub2(local221, "invback", 0);
			this.aClass4_Sub1_Sub2_Sub2_15 = new Class4_Sub1_Sub2_Sub2(local221, "chatback", 0);
			this.aClass4_Sub1_Sub2_Sub2_14 = new Class4_Sub1_Sub2_Sub2(local221, "mapback", 0);
			this.aClass4_Sub1_Sub2_Sub2_18 = new Class4_Sub1_Sub2_Sub2(local221, "backbase1", 0);
			this.aClass4_Sub1_Sub2_Sub2_19 = new Class4_Sub1_Sub2_Sub2(local221, "backbase2", 0);
			this.aClass4_Sub1_Sub2_Sub2_20 = new Class4_Sub1_Sub2_Sub2(local221, "backhmid1", 0);
			for (local730 = 0; local730 < 13; local730++) {
				this.aClass4_Sub1_Sub2_Sub2Array3[local730] = new Class4_Sub1_Sub2_Sub2(local221, "sideicons", local730);
			}
			this.aClass4_Sub1_Sub2_Sub3_12 = new Class4_Sub1_Sub2_Sub3(local221, "compass", 0);
			this.aClass4_Sub1_Sub2_Sub3_13 = new Class4_Sub1_Sub2_Sub3(local221, "mapedge", 0);
			this.aClass4_Sub1_Sub2_Sub3_13.method463();
			for (@Pc(932) int local932 = 0; local932 < 72; local932++) {
				this.aClass4_Sub1_Sub2_Sub2Array2[local932] = new Class4_Sub1_Sub2_Sub2(local221, "mapscene", local932);
			}
			for (@Pc(950) int local950 = 0; local950 < 63; local950++) {
				this.aClass4_Sub1_Sub2_Sub3Array10[local950] = new Class4_Sub1_Sub2_Sub3(local221, "mapfunction", local950);
			}
			for (@Pc(968) int local968 = 0; local968 < 5; local968++) {
				this.aClass4_Sub1_Sub2_Sub3Array8[local968] = new Class4_Sub1_Sub2_Sub3(local221, "hitmarks", local968);
			}
			for (@Pc(986) int local986 = 0; local986 < 6; local986++) {
				this.aClass4_Sub1_Sub2_Sub3Array9[local986] = new Class4_Sub1_Sub2_Sub3(local221, "headicons_pk", local986);
			}
			for (@Pc(1004) int local1004 = 0; local1004 < 9; local1004++) {
				this.aClass4_Sub1_Sub2_Sub3Array5[local1004] = new Class4_Sub1_Sub2_Sub3(local221, "headicons_prayer", local1004);
			}
			for (@Pc(1022) int local1022 = 0; local1022 < 6; local1022++) {
				this.aClass4_Sub1_Sub2_Sub3Array4[local1022] = new Class4_Sub1_Sub2_Sub3(local221, "headicons_hint", local1022);
			}
			this.aClass4_Sub1_Sub2_Sub3_9 = new Class4_Sub1_Sub2_Sub3(local221, "overlay_multiway", 0);
			this.aClass4_Sub1_Sub2_Sub3_16 = new Class4_Sub1_Sub2_Sub3(local221, "mapmarker", 0);
			this.aClass4_Sub1_Sub2_Sub3_17 = new Class4_Sub1_Sub2_Sub3(local221, "mapmarker", 1);
			for (@Pc(1064) int local1064 = 0; local1064 < 8; local1064++) {
				this.aClass4_Sub1_Sub2_Sub3Array7[local1064] = new Class4_Sub1_Sub2_Sub3(local221, "cross", local1064);
			}
			this.aClass4_Sub1_Sub2_Sub3_3 = new Class4_Sub1_Sub2_Sub3(local221, "mapdots", 0);
			this.aClass4_Sub1_Sub2_Sub3_4 = new Class4_Sub1_Sub2_Sub3(local221, "mapdots", 1);
			this.aClass4_Sub1_Sub2_Sub3_5 = new Class4_Sub1_Sub2_Sub3(local221, "mapdots", 2);
			this.aClass4_Sub1_Sub2_Sub3_6 = new Class4_Sub1_Sub2_Sub3(local221, "mapdots", 3);
			this.aClass4_Sub1_Sub2_Sub3_7 = new Class4_Sub1_Sub2_Sub3(local221, "mapdots", 4);
			this.aClass4_Sub1_Sub2_Sub2_16 = new Class4_Sub1_Sub2_Sub2(local221, "scrollbar", 0);
			this.aClass4_Sub1_Sub2_Sub2_17 = new Class4_Sub1_Sub2_Sub2(local221, "scrollbar", 1);
			this.aClass4_Sub1_Sub2_Sub2_1 = new Class4_Sub1_Sub2_Sub2(local221, "redstone1", 0);
			this.aClass4_Sub1_Sub2_Sub2_2 = new Class4_Sub1_Sub2_Sub2(local221, "redstone2", 0);
			this.aClass4_Sub1_Sub2_Sub2_3 = new Class4_Sub1_Sub2_Sub2(local221, "redstone3", 0);
			this.aClass4_Sub1_Sub2_Sub2_4 = new Class4_Sub1_Sub2_Sub2(local221, "redstone1", 0);
			this.aClass4_Sub1_Sub2_Sub2_4.method293();
			this.aClass4_Sub1_Sub2_Sub2_5 = new Class4_Sub1_Sub2_Sub2(local221, "redstone2", 0);
			this.aClass4_Sub1_Sub2_Sub2_5.method293();
			this.aClass4_Sub1_Sub2_Sub2_8 = new Class4_Sub1_Sub2_Sub2(local221, "redstone1", 0);
			this.aClass4_Sub1_Sub2_Sub2_8.method294();
			this.aClass4_Sub1_Sub2_Sub2_9 = new Class4_Sub1_Sub2_Sub2(local221, "redstone2", 0);
			this.aClass4_Sub1_Sub2_Sub2_9.method294();
			this.aClass4_Sub1_Sub2_Sub2_10 = new Class4_Sub1_Sub2_Sub2(local221, "redstone3", 0);
			this.aClass4_Sub1_Sub2_Sub2_10.method294();
			this.aClass4_Sub1_Sub2_Sub2_11 = new Class4_Sub1_Sub2_Sub2(local221, "redstone1", 0);
			this.aClass4_Sub1_Sub2_Sub2_11.method293();
			this.aClass4_Sub1_Sub2_Sub2_11.method294();
			this.aClass4_Sub1_Sub2_Sub2_12 = new Class4_Sub1_Sub2_Sub2(local221, "redstone2", 0);
			this.aClass4_Sub1_Sub2_Sub2_12.method293();
			this.aClass4_Sub1_Sub2_Sub2_12.method294();
			for (@Pc(1254) int local1254 = 0; local1254 < 2; local1254++) {
				this.aClass4_Sub1_Sub2_Sub2Array5[local1254] = new Class4_Sub1_Sub2_Sub2(local221, "mod_icons", local1254);
			}
			@Pc(1277) Class4_Sub1_Sub2_Sub3 local1277 = new Class4_Sub1_Sub2_Sub3(local221, "backleft1", 0);
			this.aClass25_3 = new Class25(this.method583(), local1277.anInt602, local1277.anInt601, 284);
			local1277.method464(0, 673, 0);
			@Pc(1302) Class4_Sub1_Sub2_Sub3 local1302 = new Class4_Sub1_Sub2_Sub3(local221, "backleft2", 0);
			this.aClass25_4 = new Class25(this.method583(), local1302.anInt602, local1302.anInt601, 284);
			local1302.method464(0, 673, 0);
			@Pc(1327) Class4_Sub1_Sub2_Sub3 local1327 = new Class4_Sub1_Sub2_Sub3(local221, "backright1", 0);
			this.aClass25_5 = new Class25(this.method583(), local1327.anInt602, local1327.anInt601, 284);
			local1327.method464(0, 673, 0);
			@Pc(1352) Class4_Sub1_Sub2_Sub3 local1352 = new Class4_Sub1_Sub2_Sub3(local221, "backright2", 0);
			this.aClass25_6 = new Class25(this.method583(), local1352.anInt602, local1352.anInt601, 284);
			local1352.method464(0, 673, 0);
			@Pc(1377) Class4_Sub1_Sub2_Sub3 local1377 = new Class4_Sub1_Sub2_Sub3(local221, "backtop1", 0);
			this.aClass25_7 = new Class25(this.method583(), local1377.anInt602, local1377.anInt601, 284);
			local1377.method464(0, 673, 0);
			@Pc(1402) Class4_Sub1_Sub2_Sub3 local1402 = new Class4_Sub1_Sub2_Sub3(local221, "backvmid1", 0);
			this.aClass25_8 = new Class25(this.method583(), local1402.anInt602, local1402.anInt601, 284);
			local1402.method464(0, 673, 0);
			@Pc(1427) Class4_Sub1_Sub2_Sub3 local1427 = new Class4_Sub1_Sub2_Sub3(local221, "backvmid2", 0);
			this.aClass25_9 = new Class25(this.method583(), local1427.anInt602, local1427.anInt601, 284);
			local1427.method464(0, 673, 0);
			@Pc(1452) Class4_Sub1_Sub2_Sub3 local1452 = new Class4_Sub1_Sub2_Sub3(local221, "backvmid3", 0);
			this.aClass25_10 = new Class25(this.method583(), local1452.anInt602, local1452.anInt601, 284);
			local1452.method464(0, 673, 0);
			@Pc(1477) Class4_Sub1_Sub2_Sub3 local1477 = new Class4_Sub1_Sub2_Sub3(local221, "backhmid2", 0);
			this.aClass25_11 = new Class25(this.method583(), local1477.anInt602, local1477.anInt601, 284);
			local1477.method464(0, 673, 0);
			@Pc(1502) int local1502 = (int) (Math.random() * 21.0D) - 10;
			@Pc(1509) int local1509 = (int) (Math.random() * 21.0D) - 10;
			@Pc(1516) int local1516 = (int) (Math.random() * 21.0D) - 10;
			@Pc(1523) int local1523 = (int) (Math.random() * 41.0D) - 20;
			for (@Pc(1525) int local1525 = 0; local1525 < 100; local1525++) {
				if (this.aClass4_Sub1_Sub2_Sub3Array10[local1525] != null) {
					this.aClass4_Sub1_Sub2_Sub3Array10[local1525].method462(local1502 + local1523, local1516 + local1523, local1509 + local1523);
				}
				if (this.aClass4_Sub1_Sub2_Sub2Array2[local1525] != null) {
					this.aClass4_Sub1_Sub2_Sub2Array2[local1525].method295(local1502 + local1523, local1516 + local1523, local1509 + local1523);
				}
			}
			this.method585(53, "Unpacking textures", 83);
			Class4_Sub1_Sub2_Sub1.method140(local233);
			Class4_Sub1_Sub2_Sub1.method144(0.8D);
			Class4_Sub1_Sub2_Sub1.method139();
			this.method585(53, "Unpacking config", 86);
			Class21.method274(local197);
			Class7.method83(local197);
			Class38.method474(local197);
			Class17.method199(local197);
			Class40.method487(local197);
			Class18.method207(local197);
			Class6.method70(local197);
			Class48.method568(local197);
			Class13.method181(local197);
			Class17.aBoolean85 = aBoolean222;
			if (!aBoolean223) {
				this.method585(53, "Unpacking sounds", 90);
				@Pc(1628) byte[] local1628 = local257.method426("sounds.dat", null);
				@Pc(1634) Class4_Sub1_Sub4 local1634 = new Class4_Sub1_Sub4(5, local1628);
				Class36.method437(local1634);
			}
			this.method585(53, "Unpacking interfaces", 95);
			@Pc(1665) Class4_Sub1_Sub2_Sub4[] local1665 = new Class4_Sub1_Sub2_Sub4[] { this.aClass4_Sub1_Sub2_Sub4_2, this.aClass4_Sub1_Sub2_Sub4_3, this.aClass4_Sub1_Sub2_Sub4_4, this.aClass4_Sub1_Sub2_Sub4_5 };
			Class28.method321(local221, local209, local1665);
			this.method585(53, "Preparing game engine", 100);
			@Pc(1681) int local1681;
			@Pc(1683) int local1683;
			@Pc(1685) int local1685;
			for (@Pc(1677) int local1677 = 0; local1677 < 33; local1677++) {
				local1681 = 999;
				local1683 = 0;
				for (local1685 = 0; local1685 < 34; local1685++) {
					if (this.aClass4_Sub1_Sub2_Sub2_14.aByteArray9[local1685 + local1677 * this.aClass4_Sub1_Sub2_Sub2_14.anInt395] == 0) {
						if (local1681 == 999) {
							local1681 = local1685;
						}
					} else if (local1681 != 999) {
						local1683 = local1685;
						break;
					}
				}
				this.anIntArray246[local1677] = local1681;
				this.anIntArray260[local1677] = local1683 - local1681;
			}
			@Pc(1743) int local1743;
			for (local1681 = 5; local1681 < 156; local1681++) {
				local1683 = 999;
				local1685 = 0;
				for (local1743 = 25; local1743 < 172; local1743++) {
					if (this.aClass4_Sub1_Sub2_Sub2_14.aByteArray9[local1743 + local1681 * this.aClass4_Sub1_Sub2_Sub2_14.anInt395] == 0 && (local1743 > 34 || local1681 > 34)) {
						if (local1683 == 999) {
							local1683 = local1743;
						}
					} else if (local1683 != 999) {
						local1685 = local1743;
						break;
					}
				}
				this.anIntArray240[local1681 - 5] = local1683 - 25;
				this.anIntArray259[local1681 - 5] = local1685 - local1683;
			}
			Class4_Sub1_Sub2_Sub1.method137(765, 503);
			this.anIntArray276 = Class4_Sub1_Sub2_Sub1.anIntArray27;
			Class4_Sub1_Sub2_Sub1.method137(479, 96);
			this.anIntArray273 = Class4_Sub1_Sub2_Sub1.anIntArray27;
			Class4_Sub1_Sub2_Sub1.method137(190, 261);
			this.anIntArray274 = Class4_Sub1_Sub2_Sub1.anIntArray27;
			Class4_Sub1_Sub2_Sub1.method137(512, 334);
			this.anIntArray275 = Class4_Sub1_Sub2_Sub1.anIntArray27;
			@Pc(1834) int[] local1834 = new int[9];
			for (local1685 = 0; local1685 < 9; local1685++) {
				local1743 = local1685 * 32 + 128 + 15;
				@Pc(1852) int local1852 = local1743 * 3 + 600;
				@Pc(1856) int local1856 = Class4_Sub1_Sub2_Sub1.anIntArray25[local1743];
				local1834[local1685] = local1852 * local1856 >> 16;
			}
			Class20.method259(local1834);
			Class1.method1(local245);
			this.aClass46_1 = new Class46((byte) 117, this);
			this.method584(this.aClass46_1, 10);
			Class4_Sub1_Sub1_Sub6.aClient5 = this;
			Class7.aClient1 = this;
			Class40.aClient3 = this;
		} catch (@Pc(1897) Exception local1897) {
			signlink.reporterror("loaderror " + this.aString28 + " " + this.anInt871);
			this.aBoolean242 = true;
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIB)I")
	private int method645(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte arg3) {
		try {
			@Pc(5) int local5;
			if (arg3 != this.aByte30) {
				for (local5 = 1; local5 > 0; local5++) {
				}
			}
			local5 = 256 - arg2;
			return ((arg1 & 0xFF00FF) * local5 + (arg0 & 0xFF00FF) * arg2 & 0xFF00FF00) + ((arg1 & 0xFF00) * local5 + (arg0 & 0xFF00) * arg2 & 0xFF0000) >> 8;
		} catch (@Pc(45) RuntimeException local45) {
			signlink.reporterror("96115, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local45.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "j", descriptor = "(Z)V")
	private void method646() {
		try {
			this.aBoolean269 = false;
			while (this.aBoolean263) {
				this.aBoolean269 = false;
				try {
					Thread.sleep(50L);
				} catch (@Pc(11) Exception local11) {
				}
			}
			this.aClass4_Sub1_Sub2_Sub2_6 = null;
			this.aClass4_Sub1_Sub2_Sub2_7 = null;
			this.aClass4_Sub1_Sub2_Sub2Array4 = null;
			this.anIntArray262 = null;
			this.aBoolean251 &= true;
			this.anIntArray263 = null;
			this.anIntArray264 = null;
			this.anIntArray265 = null;
			this.anIntArray247 = null;
			this.anIntArray248 = null;
			this.anIntArray218 = null;
			this.anIntArray219 = null;
			this.aClass4_Sub1_Sub2_Sub3_10 = null;
			this.aClass4_Sub1_Sub2_Sub3_11 = null;
		} catch (@Pc(62) RuntimeException local62) {
			signlink.reporterror("71260, " + true + ", " + local62.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "o", descriptor = "(I)V")
	private void method647() {
		try {
			if (this.aClass25_12 == null) {
				super.aClass25_2 = null;
				this.aClass25_24 = null;
				this.aClass25_22 = null;
				this.aClass25_21 = null;
				this.aClass25_23 = null;
				this.aClass25_25 = null;
				this.aClass25_26 = null;
				this.aClass25_27 = null;
				this.aClass25_15 = new Class25(this.method583(), 265, 128, 284);
				Class4_Sub1_Sub2.method494();
				this.aClass25_16 = new Class25(this.method583(), 265, 128, 284);
				Class4_Sub1_Sub2.method494();
				this.aClass25_12 = new Class25(this.method583(), 171, 509, 284);
				Class4_Sub1_Sub2.method494();
				this.aClass25_13 = new Class25(this.method583(), 132, 360, 284);
				Class4_Sub1_Sub2.method494();
				this.aClass25_14 = new Class25(this.method583(), 200, 360, 284);
				Class4_Sub1_Sub2.method494();
				this.aClass25_17 = new Class25(this.method583(), 238, 202, 284);
				Class4_Sub1_Sub2.method494();
				this.aClass25_18 = new Class25(this.method583(), 238, 203, 284);
				Class4_Sub1_Sub2.method494();
				this.aClass25_19 = new Class25(this.method583(), 94, 74, 284);
				Class4_Sub1_Sub2.method494();
				this.aClass25_20 = new Class25(this.method583(), 94, 75, 284);
				Class4_Sub1_Sub2.method494();
				if (this.aClass32_2 != null) {
					this.method591((byte) 7);
					this.method672(anInt916);
				}
				this.aBoolean243 = true;
			}
		} catch (@Pc(162) RuntimeException local162) {
			signlink.reporterror("10067, " + 0 + ", " + local162.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!TTWFVYGB;III)V")
	private void method648(@OriginalArg(0) Class4_Sub1_Sub2_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		try {
			@Pc(7) int local7 = arg1 * arg1 + arg2 * arg2;
			if (local7 > 4225 && local7 < 90000) {
				@Pc(29) int local29 = this.anInt879 + this.anInt1050 & 0x7FF;
				@Pc(33) int local33 = Class4_Sub1_Sub1_Sub4.anIntArray137[local29];
				@Pc(37) int local37 = Class4_Sub1_Sub1_Sub4.anIntArray138[local29];
				@Pc(46) int local46 = local33 * 256 / (this.anInt985 + 256);
				@Pc(55) int local55 = local37 * 256 / (this.anInt985 + 256);
				@Pc(65) int local65 = arg2 * local46 + arg1 * local55 >> 16;
				@Pc(75) int local75 = arg2 * local55 - arg1 * local46 >> 16;
				@Pc(81) double local81 = Math.atan2((double) local65, (double) local75);
				@Pc(87) int local87 = (int) (Math.sin(local81) * 63.0D);
				@Pc(93) int local93 = (int) (Math.cos(local81) * 57.0D);
				this.aClass4_Sub1_Sub2_Sub3_13.method471(local81, local87 + 94 + 4 - 10, this.aBoolean226, 83 - local93 - 20);
			} else {
				this.method718(arg0, arg1, arg2);
			}
		} catch (@Pc(125) RuntimeException local125) {
			signlink.reporterror("83320, " + arg0 + ", " + arg1 + ", " + -862 + ", " + arg2 + ", " + local125.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(JI)V")
	private void method649(@OriginalArg(0) long arg0) {
		try {
			if (arg0 != 0L) {
				if (this.anInt848 >= 100) {
					this.method588((byte) 8, 0, "", "Your ignore list is full. Max of 100 hit");
				} else {
					@Pc(23) String local23 = Class47.method554(Class47.method551(arg0));
					for (@Pc(25) int local25 = 0; local25 < this.anInt848; local25++) {
						if (this.aLongArray3[local25] == arg0) {
							this.method588((byte) 8, 0, "", local23 + " is already on your ignore list");
							return;
						}
					}
					for (@Pc(55) int local55 = 0; local55 < this.anInt957; local55++) {
						if (this.aLongArray4[local55] == arg0) {
							this.method588((byte) 8, 0, "", "Please remove " + local23 + " from your friend list first");
							return;
						}
					}
					this.aLongArray3[this.anInt848++] = arg0;
					this.aBoolean246 = true;
					this.aClass4_Sub1_Sub4_7.method344(240);
					this.aClass4_Sub1_Sub4_7.method351(arg0);
				}
			}
		} catch (@Pc(118) RuntimeException local118) {
			signlink.reporterror("1607, " + arg0 + ", " + -212 + ", " + local118.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "p", descriptor = "(I)V")
	private void method650() {
		try {
			@Pc(8) int local8;
			if (this.anInt1026 > 0) {
				for (local8 = 0; local8 < 256; local8++) {
					if (this.anInt1026 > 768) {
						this.anIntArray262[local8] = this.method645(this.anIntArray264[local8], this.anIntArray263[local8], 1024 - this.anInt1026, this.aByte30);
					} else if (this.anInt1026 > 256) {
						this.anIntArray262[local8] = this.anIntArray264[local8];
					} else {
						this.anIntArray262[local8] = this.method645(this.anIntArray263[local8], this.anIntArray264[local8], 256 - this.anInt1026, this.aByte30);
					}
				}
			} else if (this.anInt1027 > 0) {
				for (local8 = 0; local8 < 256; local8++) {
					if (this.anInt1027 > 768) {
						this.anIntArray262[local8] = this.method645(this.anIntArray265[local8], this.anIntArray263[local8], 1024 - this.anInt1027, this.aByte30);
					} else if (this.anInt1027 > 256) {
						this.anIntArray262[local8] = this.anIntArray265[local8];
					} else {
						this.anIntArray262[local8] = this.method645(this.anIntArray263[local8], this.anIntArray265[local8], 256 - this.anInt1027, this.aByte30);
					}
				}
			} else {
				for (local8 = 0; local8 < 256; local8++) {
					this.anIntArray262[local8] = this.anIntArray263[local8];
				}
			}
			for (local8 = 0; local8 < 33920; local8++) {
				this.aClass25_15.anIntArray86[local8] = this.aClass4_Sub1_Sub2_Sub3_10.anIntArray149[local8];
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
				local202 = this.anIntArray268[local189] * (256 - local189) / 256;
				local206 = local202 + 22;
				if (local206 < 0) {
					local206 = 0;
				}
				local185 += local206;
				for (local216 = local206; local216 < 128; local216++) {
					local224 = this.anIntArray218[local185++];
					if (local224 == 0) {
						local187++;
					} else {
						local228 = local224;
						local232 = 256 - local224;
						local224 = this.anIntArray262[local224];
						local243 = this.aClass25_15.anIntArray86[local187];
						this.aClass25_15.anIntArray86[local187++] = ((local224 & 0xFF00FF) * local228 + (local243 & 0xFF00FF) * local232 & 0xFF00FF00) + ((local224 & 0xFF00) * local228 + (local243 & 0xFF00) * local232 & 0xFF0000) >> 8;
					}
				}
				local187 += local206;
			}
			this.aClass25_15.method303(0, 0, super.aGraphics2);
			for (local202 = 0; local202 < 33920; local202++) {
				this.aClass25_16.anIntArray86[local202] = this.aClass4_Sub1_Sub2_Sub3_11.anIntArray149[local202];
			}
			local185 = 0;
			local187 = 1176;
			for (local206 = 1; local206 < 255; local206++) {
				local216 = this.anIntArray268[local206] * (256 - local206) / 256;
				local224 = 103 - local216;
				local187 += local216;
				for (local228 = 0; local228 < local224; local228++) {
					local232 = this.anIntArray218[local185++];
					if (local232 == 0) {
						local187++;
					} else {
						local243 = local232;
						@Pc(366) int local366 = 256 - local232;
						local232 = this.anIntArray262[local232];
						@Pc(377) int local377 = this.aClass25_16.anIntArray86[local187];
						this.aClass25_16.anIntArray86[local187++] = ((local232 & 0xFF00FF) * local243 + (local377 & 0xFF00FF) * local366 & 0xFF00FF00) + ((local232 & 0xFF00) * local243 + (local377 & 0xFF00) * local366 & 0xFF0000) >> 8;
					}
				}
				local185 += 128 - local224;
				local187 += 128 - local224 - local216;
			}
			this.aClass25_16.method303(637, 0, super.aGraphics2);
			this.anInt859 += 0;
		} catch (@Pc(455) RuntimeException local455) {
			signlink.reporterror("93098, " + 0 + ", " + local455.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "q", descriptor = "(I)V")
	private void method651() {
		try {
			@Pc(6) int local6 = this.anInt888 * 128 + 64;
			@Pc(13) int local13 = this.anInt889 * 128 + 64;
			@Pc(24) int local24 = this.method614(this.anInt895, local6, local13) - this.anInt890;
			if (this.anInt929 < local6) {
				this.anInt929 += this.anInt891 + (local6 - this.anInt929) * this.anInt892 / 1000;
				if (this.anInt929 > local6) {
					this.anInt929 = local6;
				}
			}
			if (this.anInt929 > local6) {
				this.anInt929 -= this.anInt891 + (this.anInt929 - local6) * this.anInt892 / 1000;
				if (this.anInt929 < local6) {
					this.anInt929 = local6;
				}
			}
			if (this.anInt930 < local24) {
				this.anInt930 += this.anInt891 + (local24 - this.anInt930) * this.anInt892 / 1000;
				if (this.anInt930 > local24) {
					this.anInt930 = local24;
				}
			}
			if (this.anInt930 > local24) {
				this.anInt930 -= this.anInt891 + (this.anInt930 - local24) * this.anInt892 / 1000;
				if (this.anInt930 < local24) {
					this.anInt930 = local24;
				}
			}
			if (this.anInt931 < local13) {
				this.anInt931 += this.anInt891 + (local13 - this.anInt931) * this.anInt892 / 1000;
				if (this.anInt931 > local13) {
					this.anInt931 = local13;
				}
			}
			if (this.anInt931 > local13) {
				this.anInt931 -= this.anInt891 + (this.anInt931 - local13) * this.anInt892 / 1000;
				if (this.anInt931 < local13) {
					this.anInt931 = local13;
				}
			}
			local6 = this.anInt1004 * 128 + 64;
			local13 = this.anInt1005 * 128 + 64;
			local24 = this.method614(this.anInt895, local6, local13) - this.anInt1006;
			@Pc(222) int local222 = local6 - this.anInt929;
			@Pc(227) int local227 = local24 - this.anInt930;
			@Pc(232) int local232 = local13 - this.anInt931;
			@Pc(243) int local243 = (int) Math.sqrt((double) (local222 * local222 + local232 * local232));
			@Pc(254) int local254 = (int) (Math.atan2((double) local227, (double) local243) * 325.949D) & 0x7FF;
			@Pc(265) int local265 = (int) (Math.atan2((double) local222, (double) local232) * -325.949D) & 0x7FF;
			this.anInt859 += 0;
			if (local254 < 128) {
				local254 = 128;
			}
			if (local254 > 383) {
				local254 = 383;
			}
			if (this.anInt932 < local254) {
				this.anInt932 += this.anInt1007 + (local254 - this.anInt932) * this.anInt1008 / 1000;
				if (this.anInt932 > local254) {
					this.anInt932 = local254;
				}
			}
			if (this.anInt932 > local254) {
				this.anInt932 -= this.anInt1007 + (this.anInt932 - local254) * this.anInt1008 / 1000;
				if (this.anInt932 < local254) {
					this.anInt932 = local254;
				}
			}
			@Pc(342) int local342 = local265 - this.anInt933;
			if (local342 > 1024) {
				local342 -= 2048;
			}
			if (local342 < -1024) {
				local342 += 2048;
			}
			if (local342 > 0) {
				this.anInt933 += this.anInt1007 + local342 * this.anInt1008 / 1000;
				this.anInt933 &= 0x7FF;
			}
			if (local342 < 0) {
				this.anInt933 -= this.anInt1007 + -local342 * this.anInt1008 / 1000;
				this.anInt933 &= 0x7FF;
			}
			@Pc(400) int local400 = local265 - this.anInt933;
			if (local400 > 1024) {
				local400 -= 2048;
			}
			if (local400 < -1024) {
				local400 += 2048;
			}
			if (local400 < 0 && local342 > 0 || local400 > 0 && local342 < 0) {
				this.anInt933 = local265;
			}
		} catch (@Pc(421) RuntimeException local421) {
			signlink.reporterror("93601, " + 0 + ", " + local421.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!NPNTBMMX;Z)Z")
	private boolean method652(@OriginalArg(0) Class28 arg0) {
		try {
			@Pc(4) int local4 = arg0.anInt458;
			if (this.anInt958 == 2) {
				if (local4 == 201) {
					this.aBoolean247 = true;
					this.anInt996 = 0;
					this.aBoolean237 = true;
					this.aString27 = "";
					this.anInt857 = 1;
					this.aString26 = "Enter name of friend to add to list";
				}
				if (local4 == 202) {
					this.aBoolean247 = true;
					this.anInt996 = 0;
					this.aBoolean237 = true;
					this.aString27 = "";
					this.anInt857 = 2;
					this.aString26 = "Enter name of friend to delete from list";
				}
			}
			if (local4 == 205) {
				this.anInt863 = 250;
				return true;
			}
			if (local4 == 501) {
				this.aBoolean247 = true;
				this.anInt996 = 0;
				this.aBoolean237 = true;
				this.aString27 = "";
				this.anInt857 = 4;
				this.aString26 = "Enter name of player to add to list";
			}
			if (local4 == 502) {
				this.aBoolean247 = true;
				this.anInt996 = 0;
				this.aBoolean237 = true;
				this.aString27 = "";
				this.anInt857 = 5;
				this.aString26 = "Enter name of player to delete from list";
			}
			@Pc(121) int local121;
			@Pc(125) int local125;
			@Pc(130) int local130;
			if (local4 >= 300 && local4 <= 313) {
				local121 = (local4 - 300) / 2;
				local125 = local4 & 0x1;
				local130 = this.anIntArray245[local121];
				if (local130 != -1) {
					while (true) {
						if (local125 == 0) {
							local130--;
							if (local130 < 0) {
								local130 = Class18.anInt302 - 1;
							}
						}
						if (local125 == 1) {
							local130++;
							if (local130 >= Class18.anInt302) {
								local130 = 0;
							}
						}
						if (!Class18.aClass18Array1[local130].aBoolean87 && Class18.aClass18Array1[local130].anInt303 == local121 + (this.aBoolean231 ? 0 : 7)) {
							this.anIntArray245[local121] = local130;
							this.aBoolean217 = true;
							break;
						}
					}
				}
			}
			if (local4 >= 314 && local4 <= 323) {
				local121 = (local4 - 314) / 2;
				local125 = local4 & 0x1;
				local130 = this.anIntArray236[local121];
				if (local125 == 0) {
					local130--;
					if (local130 < 0) {
						local130 = anIntArrayArray23[local121].length - 1;
					}
				}
				if (local125 == 1) {
					local130++;
					if (local130 >= anIntArrayArray23[local121].length) {
						local130 = 0;
					}
				}
				this.anIntArray236[local121] = local130;
				this.aBoolean217 = true;
			}
			if (local4 == 324 && !this.aBoolean231) {
				this.aBoolean231 = true;
				this.method621();
			}
			if (local4 == 325 && this.aBoolean231) {
				this.aBoolean231 = false;
				this.method621();
			}
			if (local4 == 326) {
				this.aClass4_Sub1_Sub4_7.method344(22);
				this.aClass4_Sub1_Sub4_7.method345(this.aBoolean231 ? 0 : 1);
				for (local121 = 0; local121 < 7; local121++) {
					this.aClass4_Sub1_Sub4_7.method345(this.anIntArray245[local121]);
				}
				for (local125 = 0; local125 < 5; local125++) {
					this.aClass4_Sub1_Sub4_7.method345(this.anIntArray236[local125]);
				}
				return true;
			}
			if (local4 == 620) {
				this.aBoolean262 = !this.aBoolean262;
			}
			if (local4 >= 601 && local4 <= 613) {
				this.method721();
				if (this.aString17.length() > 0) {
					this.aClass4_Sub1_Sub4_7.method344(251);
					this.aClass4_Sub1_Sub4_7.method351(Class47.method550(this.aString17));
					this.aClass4_Sub1_Sub4_7.method345(local4 - 601);
					this.aClass4_Sub1_Sub4_7.method345(this.aBoolean262 ? 1 : 0);
				}
			}
			return false;
		} catch (@Pc(358) RuntimeException local358) {
			signlink.reporterror("14568, " + arg0 + ", " + false + ", " + local358.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "r", descriptor = "(I)V")
	private void method653() {
		try {
			signlink.aBoolean270 = false;
			signlink.anInt1083 = 0;
			signlink.midi = "stop";
		} catch (@Pc(13) RuntimeException local13) {
			signlink.reporterror("95644, " + -958 + ", " + local13.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "init", descriptor = "()V")
	@Override
	public void init() {
		anInt874 = Integer.parseInt(this.getParameter("nodeid"));
		anInt875 = Integer.parseInt(this.getParameter("portoff"));
		@Pc(15) String local15 = this.getParameter("lowmem");
		if (local15 != null && local15.equals("1")) {
			method654();
		} else {
			method670();
		}
		@Pc(31) String local31 = this.getParameter("free");
		if (local31 != null && local31.equals("1")) {
			aBoolean222 = false;
		} else {
			aBoolean222 = true;
		}
		this.method574();
	}

	@OriginalMember(owner = "client!client", name = "s", descriptor = "(I)V")
	private void method655() {
		try {
			try {
				if (this.aClass15_1 != null) {
					this.aClass15_1.method183();
				}
			} catch (@Pc(7) Exception local7) {
			}
			this.aClass15_1 = null;
			this.aBoolean251 = false;
			this.anInt1031 = 0;
			this.aString20 = "";
			this.aString21 = "";
			this.method714();
			this.aClass20_1.method223((byte) 2);
			for (@Pc(36) int local36 = 0; local36 < 4; local36++) {
				this.aClass2Array1[local36].method39();
			}
			System.gc();
			this.method653();
			this.anInt1055 = -1;
			this.anInt925 = -1;
			this.anInt914 = 0;
		} catch (@Pc(62) RuntimeException local62) {
			signlink.reporterror("57238, " + 0 + ", " + local62.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;)V")
	private void method656(@OriginalArg(0) String arg0, @OriginalArg(2) String arg1) {
		try {
			@Pc(22) int local22;
			if (this.aClass25_23 != null) {
				this.aClass25_23.method302(this.aBoolean230);
				Class4_Sub1_Sub2_Sub1.anIntArray27 = this.anIntArray275;
				local22 = 151;
				if (arg0 != null) {
					local22 -= 7;
				}
				this.aClass4_Sub1_Sub2_Sub4_3.method504(257, local22, arg1, 0);
				this.aClass4_Sub1_Sub2_Sub4_3.method504(256, local22 - 1, arg1, 16777215);
				local22 += 15;
				if (arg0 != null) {
					this.aClass4_Sub1_Sub2_Sub4_3.method504(257, local22, arg0, 0);
					this.aClass4_Sub1_Sub2_Sub4_3.method504(256, local22 - 1, arg0, 16777215);
				}
				this.aClass25_23.method303(4, 4, super.aGraphics2);
			} else if (super.aClass25_2 != null) {
				super.aClass25_2.method302(this.aBoolean230);
				Class4_Sub1_Sub2_Sub1.anIntArray27 = this.anIntArray276;
				local22 = 251;
				Class4_Sub1_Sub2.method496(233, 0, 300, 50, 221);
				Class4_Sub1_Sub2.method497(300, 16777215, 233, 50, 221);
				if (arg0 != null) {
					local22 -= 7;
				}
				this.aClass4_Sub1_Sub2_Sub4_3.method504(383, local22, arg1, 0);
				this.aClass4_Sub1_Sub2_Sub4_3.method504(382, local22 - 1, arg1, 16777215);
				local22 += 15;
				if (arg0 != null) {
					this.aClass4_Sub1_Sub2_Sub4_3.method504(383, local22, arg0, 0);
					this.aClass4_Sub1_Sub2_Sub4_3.method504(382, local22 - 1, arg0, 16777215);
				}
				super.aClass25_2.method303(0, 0, super.aGraphics2);
			}
		} catch (@Pc(176) RuntimeException local176) {
			signlink.reporterror("23157, " + arg0 + ", " + -58 + ", " + arg1 + ", " + local176.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIILclient!ZQANNJZE;)V")
	private void method657(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class4_Sub1_Sub1_Sub2_Sub2 arg4) {
		try {
			if (arg4 != aClass4_Sub1_Sub1_Sub2_Sub2_1 && this.anInt989 < 400) {
				while (arg1 >= 0) {
					this.aClass4_Sub1_Sub4_7.method345(254);
				}
				@Pc(41) String local41;
				if (arg4.anInt797 == 0) {
					local41 = arg4.aString15 + method701(arg4.anInt799, aClass4_Sub1_Sub1_Sub2_Sub2_1.anInt799) + " (level-" + arg4.anInt799 + ")";
				} else {
					local41 = arg4.aString15 + " (skill-" + arg4.anInt797 + ")";
				}
				@Pc(171) int local171;
				if (this.anInt1021 == 1) {
					this.aStringArray12[this.anInt989] = "Use " + this.aString29 + " with @whi@" + local41;
					this.anIntArray253[this.anInt989] = 326;
					this.anIntArray254[this.anInt989] = arg3;
					this.anIntArray251[this.anInt989] = arg2;
					this.anIntArray252[this.anInt989] = arg0;
					this.anInt989++;
				} else if (this.anInt1067 != 1) {
					for (local171 = 4; local171 >= 0; local171--) {
						if (this.aStringArray10[local171] != null) {
							this.aStringArray12[this.anInt989] = this.aStringArray10[local171] + " @whi@" + local41;
							@Pc(198) short local198 = 0;
							if (this.aStringArray10[local171].equalsIgnoreCase("attack")) {
								if (arg4.anInt799 > aClass4_Sub1_Sub1_Sub2_Sub2_1.anInt799) {
									local198 = 2000;
								}
								if (aClass4_Sub1_Sub1_Sub2_Sub2_1.anInt801 != 0 && arg4.anInt801 != 0) {
									if (aClass4_Sub1_Sub1_Sub2_Sub2_1.anInt801 == arg4.anInt801) {
										local198 = 2000;
									} else {
										local198 = 0;
									}
								}
							} else if (this.aBooleanArray11[local171]) {
								local198 = 2000;
							}
							if (local171 == 0) {
								this.anIntArray253[this.anInt989] = local198 + 646;
							}
							if (local171 == 1) {
								this.anIntArray253[this.anInt989] = local198 + 479;
							}
							if (local171 == 2) {
								this.anIntArray253[this.anInt989] = local198 + 749;
							}
							if (local171 == 3) {
								this.anIntArray253[this.anInt989] = local198 + 525;
							}
							if (local171 == 4) {
								this.anIntArray253[this.anInt989] = local198 + 572;
							}
							this.anIntArray254[this.anInt989] = arg3;
							this.anIntArray251[this.anInt989] = arg2;
							this.anIntArray252[this.anInt989] = arg0;
							this.anInt989++;
						}
					}
				} else if ((this.anInt1069 & 0x8) == 8) {
					this.aStringArray12[this.anInt989] = this.aString31 + " @whi@" + local41;
					this.anIntArray253[this.anInt989] = 8;
					this.anIntArray254[this.anInt989] = arg3;
					this.anIntArray251[this.anInt989] = arg2;
					this.anIntArray252[this.anInt989] = arg0;
					this.anInt989++;
				}
				for (local171 = 0; local171 < this.anInt989; local171++) {
					if (this.anIntArray253[local171] == 709) {
						this.aStringArray12[local171] = "Walk here @whi@" + local41;
						return;
					}
				}
			}
		} catch (@Pc(348) RuntimeException local348) {
			signlink.reporterror("73568, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local348.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(I)V")
	@Override
	protected void method581() {
		try {
			if (this.aBoolean265 || this.aBoolean242 || this.aBoolean249) {
				this.method630();
			} else {
				anInt896++;
				if (this.aBoolean251) {
					this.method611();
				} else {
					this.method667(false);
				}
				this.anInt941 = 0;
				this.anInt859 += 0;
			}
		} catch (@Pc(39) RuntimeException local39) {
			signlink.reporterror("53693, " + 0 + ", " + local39.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(IB)V")
	private void method658(@OriginalArg(0) int arg0) {
		try {
			if (!aBoolean223) {
				for (@Pc(9) int local9 = 0; local9 < this.anIntArray222.length; local9++) {
					@Pc(16) int local16 = this.anIntArray222[local9];
					if (Class4_Sub1_Sub2_Sub1.anIntArray29[local16] >= arg0) {
						@Pc(25) Class4_Sub1_Sub2_Sub2 local25 = Class4_Sub1_Sub2_Sub1.aClass4_Sub1_Sub2_Sub2Array1[local16];
						@Pc(33) int local33 = local25.anInt395 * local25.anInt396 - 1;
						@Pc(41) int local41 = local25.anInt395 * this.anInt1043 * 2;
						@Pc(44) byte[] local44 = local25.aByteArray9;
						@Pc(47) byte[] local47 = this.aByteArray21;
						for (@Pc(49) int local49 = 0; local49 <= local33; local49++) {
							local47[local49] = local44[local49 - local41 & local33];
						}
						local25.aByteArray9 = local47;
						this.aByteArray21 = local44;
						Class4_Sub1_Sub2_Sub1.method142(local16);
					}
				}
				anInt971++;
				if (anInt971 > 66) {
					anInt971 = 0;
					this.aClass4_Sub1_Sub4_7.method344(213);
					return;
				}
			}
		} catch (@Pc(96) RuntimeException local96) {
			signlink.reporterror("40272, " + arg0 + ", " + 51 + ", " + local96.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(II)Ljava/lang/String;")
	private String method659(@OriginalArg(0) int arg0) {
		try {
			return arg0 < 999999999 ? String.valueOf(arg0) : "*";
		} catch (@Pc(13) RuntimeException local13) {
			signlink.reporterror("55073, " + arg0 + ", " + -566 + ", " + local13.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "t", descriptor = "(I)V")
	private void method660() {
		try {
			this.aClass25_24.method302(this.aBoolean230);
			Class4_Sub1_Sub2_Sub1.anIntArray27 = this.anIntArray273;
			this.aClass4_Sub1_Sub2_Sub2_15.method296(0, 0);
			if (this.aBoolean237) {
				this.aClass4_Sub1_Sub2_Sub4_4.method504(239, 40, this.aString26, 0);
				this.aClass4_Sub1_Sub2_Sub4_4.method504(239, 60, this.aString27 + "*", 128);
			} else if (this.anInt996 == 1) {
				this.aClass4_Sub1_Sub2_Sub4_4.method504(239, 40, "Enter amount:", 0);
				this.aClass4_Sub1_Sub2_Sub4_4.method504(239, 60, this.aString25 + "*", 128);
			} else if (this.anInt996 == 2) {
				this.aClass4_Sub1_Sub2_Sub4_4.method504(239, 40, "Enter name:", 0);
				this.aClass4_Sub1_Sub2_Sub4_4.method504(239, 60, this.aString25 + "*", 128);
			} else {
				@Pc(130) Class4_Sub1_Sub2_Sub4 local130;
				@Pc(138) int local138;
				@Pc(149) int local149;
				if (this.anInt996 == 3) {
					if (this.aString25 != this.aString23) {
						this.method631(this.aString25);
						this.aString23 = this.aString25;
					}
					local130 = this.aClass4_Sub1_Sub2_Sub4_3;
					Class4_Sub1_Sub2.method493(463, 0, 0, 77);
					for (local138 = 0; local138 < this.anInt938; local138++) {
						local149 = local138 * 14 + 18 - this.anInt939;
						if (local149 > 0 && local149 < 110) {
							local130.method504(239, local149, this.aStringArray9[local138], 0);
						}
					}
					Class4_Sub1_Sub2.method492();
					if (this.anInt938 > 5) {
						this.method724(this.anInt938 * 14 + 7, this.anInt939, 77, 0, 463);
					}
					if (this.aString25.length() == 0) {
						this.aClass4_Sub1_Sub2_Sub4_4.method504(239, 40, "Enter object name", 255);
					} else if (this.anInt938 == 0) {
						this.aClass4_Sub1_Sub2_Sub4_4.method504(239, 40, "No matching objects found, please shorten search", 0);
					}
					local130.method504(239, 90, this.aString25 + "*", 0);
					Class4_Sub1_Sub2.method499(0, 479, 77, 0);
				} else if (this.aString24 != null) {
					this.aClass4_Sub1_Sub2_Sub4_4.method504(239, 40, this.aString24, 0);
					this.aClass4_Sub1_Sub2_Sub4_4.method504(239, 60, "Click to continue", 128);
				} else if (this.anInt955 != -1) {
					this.method688(0, Class28.method318(this.anInt955), 0, 0);
				} else if (this.anInt1075 == -1) {
					local130 = this.aClass4_Sub1_Sub2_Sub4_3;
					local138 = 0;
					Class4_Sub1_Sub2.method493(463, 0, 0, 77);
					for (local149 = 0; local149 < 100; local149++) {
						if (this.aStringArray14[local149] != null) {
							@Pc(314) int local314 = this.anIntArray269[local149];
							@Pc(323) int local323 = this.anInt1074 + 70 - local138 * 14;
							@Pc(328) String local328 = this.aStringArray13[local149];
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
									local130.method508(0, local323, 4, this.aStringArray14[local149]);
								}
								local138++;
							}
							@Pc(400) int local400;
							if ((local314 == 1 || local314 == 2) && (local314 == 1 || this.anInt978 == 0 || this.anInt978 == 1 && this.method602(local328))) {
								if (local323 > 0 && local323 < 110) {
									local400 = 4;
									if (local330 == 1) {
										this.aClass4_Sub1_Sub2_Sub2Array5[0].method296(4, local323 - 12);
										local400 += 14;
									}
									if (local330 == 2) {
										this.aClass4_Sub1_Sub2_Sub2Array5[1].method296(local400, local323 - 12);
										local400 += 14;
									}
									local130.method508(0, local323, local400, local328 + ":");
									local400 += local130.method506(local328) + 8;
									local130.method508(255, local323, local400, this.aStringArray14[local149]);
								}
								local138++;
							}
							if ((local314 == 3 || local314 == 7) && this.anInt1025 == 0 && (local314 == 7 || this.anInt970 == 0 || this.anInt970 == 1 && this.method602(local328))) {
								if (local323 > 0 && local323 < 110) {
									local130.method508(0, local323, 4, "From");
									local400 = local130.method506("From ") + 4;
									if (local330 == 1) {
										this.aClass4_Sub1_Sub2_Sub2Array5[0].method296(local400, local323 - 12);
										local400 += 14;
									}
									if (local330 == 2) {
										this.aClass4_Sub1_Sub2_Sub2Array5[1].method296(local400, local323 - 12);
										local400 += 14;
									}
									local130.method508(0, local323, local400, local328 + ":");
									local400 += local130.method506(local328) + 8;
									local130.method508(8388608, local323, local400, this.aStringArray14[local149]);
								}
								local138++;
							}
							if (local314 == 4 && (this.anInt1002 == 0 || this.anInt1002 == 1 && this.method602(local328))) {
								if (local323 > 0 && local323 < 110) {
									local130.method508(8388736, local323, 4, local328 + " " + this.aStringArray14[local149]);
								}
								local138++;
							}
							if (local314 == 5 && this.anInt1025 == 0 && this.anInt970 < 2) {
								if (local323 > 0 && local323 < 110) {
									local130.method508(8388608, local323, 4, this.aStringArray14[local149]);
								}
								local138++;
							}
							if (local314 == 6 && this.anInt1025 == 0 && this.anInt970 < 2) {
								if (local323 > 0 && local323 < 110) {
									local130.method508(0, local323, 4, "To " + local328 + ":");
									local130.method508(8388608, local323, local130.method506("To " + local328) + 12, this.aStringArray14[local149]);
								}
								local138++;
							}
							if (local314 == 8 && (this.anInt1002 == 0 || this.anInt1002 == 1 && this.method602(local328))) {
								if (local323 > 0 && local323 < 110) {
									local130.method508(8270336, local323, 4, local328 + " " + this.aStringArray14[local149]);
								}
								local138++;
							}
						}
					}
					Class4_Sub1_Sub2.method492();
					this.anInt870 = local138 * 14 + 7;
					if (this.anInt870 < 78) {
						this.anInt870 = 78;
					}
					this.method724(this.anInt870, this.anInt870 - this.anInt1074 - 77, 77, 0, 463);
					@Pc(770) String local770;
					if (aClass4_Sub1_Sub1_Sub2_Sub2_1 == null || aClass4_Sub1_Sub1_Sub2_Sub2_1.aString15 == null) {
						local770 = Class47.method554(this.aString20);
					} else {
						local770 = aClass4_Sub1_Sub1_Sub2_Sub2_1.aString15;
					}
					local130.method508(0, 90, 4, local770 + ":");
					local130.method508(255, 90, local130.method506(local770 + ": ") + 6, this.aString30 + "*");
					Class4_Sub1_Sub2.method499(0, 479, 77, 0);
				} else {
					this.method688(0, Class28.method318(this.anInt1075), 0, 0);
				}
			}
			if (this.aBoolean228 && this.anInt897 == 2) {
				this.method680();
			}
			this.aClass25_24.method303(17, 357, super.aGraphics2);
			this.aClass25_23.method302(this.aBoolean230);
			Class4_Sub1_Sub2_Sub1.anIntArray27 = this.anIntArray275;
		} catch (@Pc(852) RuntimeException local852) {
			signlink.reporterror("53674, " + -12139 + ", " + local852.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
	@Override
	public AppletContext getAppletContext() {
		return signlink.mainapp == null ? super.getAppletContext() : signlink.mainapp.getAppletContext();
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ZI[B)Z")
	private boolean method662(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2) {
		try {
			if (arg0) {
				throw new NullPointerException();
			} else if (arg2 == null) {
				return true;
			} else {
				return signlink.wavesave(arg2, arg1);
			}
		} catch (@Pc(14) RuntimeException local14) {
			signlink.reporterror("66171, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local14.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "k", descriptor = "(Z)V")
	private void method663() {
		try {
			@Pc(7) int local7 = this.aClass4_Sub1_Sub2_Sub4_4.method506("Choose Option");
			@Pc(20) int local20;
			for (@Pc(9) int local9 = 0; local9 < this.anInt989; local9++) {
				local20 = this.aClass4_Sub1_Sub2_Sub4_4.method506(this.aStringArray12[local9]);
				if (local20 > local7) {
					local7 = local20;
				}
			}
			local7 += 8;
			this.aBoolean251 &= true;
			local20 = this.anInt989 * 15 + 21;
			@Pc(69) int local69;
			@Pc(87) int local87;
			if (super.anInt841 > 4 && super.anInt842 > 4 && super.anInt841 < 516 && super.anInt842 < 338) {
				local69 = super.anInt841 - local7 / 2 - 4;
				if (local69 + local7 > 512) {
					local69 = 512 - local7;
				}
				if (local69 < 0) {
					local69 = 0;
				}
				local87 = super.anInt842 - 4;
				if (local87 + local20 > 334) {
					local87 = 334 - local20;
				}
				if (local87 < 0) {
					local87 = 0;
				}
				this.aBoolean228 = true;
				this.anInt897 = 0;
				this.anInt898 = local69;
				this.anInt899 = local87;
				this.anInt900 = local7;
				this.anInt901 = this.anInt989 * 15 + 22;
			}
			if (super.anInt841 > 553 && super.anInt842 > 205 && super.anInt841 < 743 && super.anInt842 < 466) {
				local69 = super.anInt841 - local7 / 2 - 553;
				if (local69 < 0) {
					local69 = 0;
				} else if (local69 + local7 > 190) {
					local69 = 190 - local7;
				}
				local87 = super.anInt842 - 205;
				if (local87 < 0) {
					local87 = 0;
				} else if (local87 + local20 > 261) {
					local87 = 261 - local20;
				}
				this.aBoolean228 = true;
				this.anInt897 = 1;
				this.anInt898 = local69;
				this.anInt899 = local87;
				this.anInt900 = local7;
				this.anInt901 = this.anInt989 * 15 + 22;
			}
			if (super.anInt841 > 17 && super.anInt842 > 357 && super.anInt841 < 496 && super.anInt842 < 453) {
				local69 = super.anInt841 - local7 / 2 - 17;
				if (local69 < 0) {
					local69 = 0;
				} else if (local69 + local7 > 479) {
					local69 = 479 - local7;
				}
				local87 = super.anInt842 - 357;
				if (local87 < 0) {
					local87 = 0;
				} else if (local87 + local20 > 96) {
					local87 = 96 - local20;
				}
				this.aBoolean228 = true;
				this.anInt897 = 2;
				this.anInt898 = local69;
				this.anInt899 = local87;
				this.anInt900 = local7;
				this.anInt901 = this.anInt989 * 15 + 22;
			}
		} catch (@Pc(291) RuntimeException local291) {
			signlink.reporterror("14622, " + true + ", " + local291.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "u", descriptor = "(I)V")
	private void method664(@OriginalArg(0) int arg0) {
		try {
			if (arg0 != 0) {
				this.aClass11ArrayArrayArray1 = null;
			}
			if (this.anInt946 == 2) {
				for (@Pc(15) Class4_Sub2 local15 = (Class4_Sub2) this.aClass11_11.method166(); local15 != null; local15 = (Class4_Sub2) this.aClass11_11.method168()) {
					if (local15.anInt307 > 0) {
						local15.anInt307--;
					}
					if (local15.anInt307 != 0) {
						if (local15.anInt308 > 0) {
							local15.anInt308--;
						}
						if (local15.anInt308 == 0 && local15.anInt314 >= 1 && local15.anInt315 >= 1 && local15.anInt314 <= 102 && local15.anInt315 <= 102 && (local15.anInt304 < 0 || Class44.method538(local15.anInt306, this.aBoolean257, local15.anInt304))) {
							this.method698(local15.anInt314, local15.anInt306, local15.anInt304, local15.anInt312, local15.anInt305, (byte) 2, local15.anInt313, local15.anInt315);
							local15.anInt308 = -1;
							if (local15.anInt304 == local15.anInt309 && local15.anInt309 == -1) {
								local15.method556();
							} else if (local15.anInt304 == local15.anInt309 && local15.anInt305 == local15.anInt310 && local15.anInt306 == local15.anInt311) {
								local15.method556();
							}
						}
					} else if (local15.anInt309 < 0 || Class44.method538(local15.anInt311, this.aBoolean257, local15.anInt309)) {
						this.method698(local15.anInt314, local15.anInt311, local15.anInt309, local15.anInt312, local15.anInt310, (byte) 2, local15.anInt313, local15.anInt315);
						local15.method556();
					}
				}
			}
		} catch (@Pc(160) RuntimeException local160) {
			signlink.reporterror("54691, " + arg0 + ", " + local160.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/String;)V")
	private void method665(@OriginalArg(0) String arg0) {
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

	@OriginalMember(owner = "client!client", name = "k", descriptor = "(B)V")
	private void method666(@OriginalArg(0) byte arg0) {
		try {
			if (arg0 != this.aByte33) {
				this.method578();
			}
			for (@Pc(12) Class4_Sub2 local12 = (Class4_Sub2) this.aClass11_11.method166(); local12 != null; local12 = (Class4_Sub2) this.aClass11_11.method168()) {
				if (local12.anInt307 == -1) {
					local12.anInt308 = 0;
					this.method719(local12);
				} else {
					local12.method556();
				}
			}
		} catch (@Pc(39) RuntimeException local39) {
			signlink.reporterror("43019, " + arg0 + ", " + local39.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ZZ)V")
	private void method667(@OriginalArg(1) boolean arg0) {
		try {
			this.method647();
			this.aClass25_14.method302(this.aBoolean230);
			this.aClass4_Sub1_Sub2_Sub2_6.method296(0, 0);
			@Pc(48) byte local48;
			@Pc(60) int local60;
			if (this.anInt1031 == 0) {
				this.aClass4_Sub1_Sub2_Sub4_2.method505(this.aClass8_Sub1_1.aString2, 7711145, true, 180, 180);
				local48 = 80;
				this.aClass4_Sub1_Sub2_Sub4_4.method505("Welcome to RuneScape", 16776960, true, 80, 180);
				local60 = local48 + 30;
				this.aClass4_Sub1_Sub2_Sub2_7.method296(27, 100);
				this.aClass4_Sub1_Sub2_Sub4_4.method505("New User", 16777215, true, 125, 100);
				this.aClass4_Sub1_Sub2_Sub2_7.method296(187, 100);
				this.aClass4_Sub1_Sub2_Sub4_4.method505("Existing User", 16777215, true, 125, 260);
			}
			if (this.anInt1031 == 2) {
				local48 = 60;
				if (this.aString18.length() > 0) {
					this.aClass4_Sub1_Sub2_Sub4_4.method505(this.aString18, 16776960, true, 45, 180);
					this.aClass4_Sub1_Sub2_Sub4_4.method505(this.aString19, 16776960, true, 60, 180);
					local60 = local48 + 30;
				} else {
					this.aClass4_Sub1_Sub2_Sub4_4.method505(this.aString19, 16776960, true, 53, 180);
					local60 = local48 + 30;
				}
				this.aClass4_Sub1_Sub2_Sub4_4.method512(90, 16777215, 817, 90, true, "Username: " + this.aString20 + (this.anInt1036 == 0 & anInt1054 % 40 < 20 ? "@yel@|" : ""));
				local60 += 15;
				this.aClass4_Sub1_Sub2_Sub4_4.method512(105, 16777215, 817, 92, true, "Password: " + Class47.method555(this.aString21) + (this.anInt1036 == 1 & anInt1054 % 40 < 20 ? "@yel@|" : ""));
				local60 += 15;
				if (!arg0) {
					this.aClass4_Sub1_Sub2_Sub2_7.method296(27, 130);
					this.aClass4_Sub1_Sub2_Sub4_4.method505("Login", 16777215, true, 155, 100);
					this.aClass4_Sub1_Sub2_Sub2_7.method296(187, 130);
					this.aClass4_Sub1_Sub2_Sub4_4.method505("Cancel", 16777215, true, 155, 260);
				}
			}
			if (this.anInt1031 == 3) {
				this.aClass4_Sub1_Sub2_Sub4_4.method505("Create a free account", 16776960, true, 40, 180);
				local48 = 65;
				this.aClass4_Sub1_Sub2_Sub4_4.method505("To create a new account you need to", 16777215, true, 65, 180);
				local60 = local48 + 15;
				this.aClass4_Sub1_Sub2_Sub4_4.method505("go back to the main RuneScape webpage", 16777215, true, 80, 180);
				local60 += 15;
				this.aClass4_Sub1_Sub2_Sub4_4.method505("and choose the 'create account'", 16777215, true, 95, 180);
				local60 += 15;
				this.aClass4_Sub1_Sub2_Sub4_4.method505("button near the top of that page.", 16777215, true, 110, 180);
				local60 += 15;
				this.aClass4_Sub1_Sub2_Sub2_7.method296(107, 130);
				this.aClass4_Sub1_Sub2_Sub4_4.method505("Cancel", 16777215, true, 155, 180);
			}
			this.aClass25_14.method303(202, 171, super.aGraphics2);
			if (this.aBoolean243) {
				this.aBoolean243 = false;
				this.aClass25_12.method303(128, 0, super.aGraphics2);
				this.aClass25_13.method303(202, 371, super.aGraphics2);
				this.aClass25_17.method303(0, 265, super.aGraphics2);
				this.aClass25_18.method303(562, 265, super.aGraphics2);
				this.aClass25_19.method303(128, 171, super.aGraphics2);
				this.aClass25_20.method303(562, 171, super.aGraphics2);
			}
		} catch (@Pc(493) RuntimeException local493) {
			signlink.reporterror("9038, " + false + ", " + arg0 + ", " + local493.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIIIB)V")
	private void method668(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) byte arg5) {
		try {
			@Pc(8) int local8 = this.aClass20_1.method249(arg1, arg4, arg2);
			@Pc(13) boolean local13 = false;
			@Pc(33) int local33;
			@Pc(39) int local39;
			@Pc(43) int local43;
			@Pc(45) int local45;
			@Pc(67) int local67;
			@Pc(73) int local73;
			if (local8 != 0) {
				local33 = this.aClass20_1.method253(arg1, arg4, arg2, local8);
				local39 = local33 >> 6 & 0x3;
				local43 = local33 & 0x1F;
				local45 = arg0;
				if (local8 > 0) {
					local45 = arg3;
				}
				@Pc(53) int[] local53 = this.aClass4_Sub1_Sub2_Sub3_8.anIntArray149;
				local67 = arg4 * 4 + (103 - arg2) * 512 * 4 + 24624;
				local73 = local8 >> 14 & 0x7FFF;
				@Pc(76) Class7 local76 = Class7.method82(local73);
				if (local76.anInt60 == -1) {
					if (local43 == 0 || local43 == 2) {
						if (local39 == 0) {
							local53[local67] = local45;
							local53[local67 + 512] = local45;
							local53[local67 + 1024] = local45;
							local53[local67 + 1536] = local45;
						} else if (local39 == 1) {
							local53[local67] = local45;
							local53[local67 + 1] = local45;
							local53[local67 + 2] = local45;
							local53[local67 + 3] = local45;
						} else if (local39 == 2) {
							local53[local67 + 3] = local45;
							local53[local67 + 3 + 512] = local45;
							local53[local67 + 3 + 1024] = local45;
							local53[local67 + 3 + 1536] = local45;
						} else if (local39 == 3) {
							local53[local67 + 1536] = local45;
							local53[local67 + 1536 + 1] = local45;
							local53[local67 + 1536 + 2] = local45;
							local53[local67 + 1536 + 3] = local45;
						}
					}
					if (local43 == 3) {
						if (local39 == 0) {
							local53[local67] = local45;
						} else if (local39 == 1) {
							local53[local67 + 3] = local45;
						} else if (local39 == 2) {
							local53[local67 + 3 + 1536] = local45;
						} else if (local39 == 3) {
							local53[local67 + 1536] = local45;
						}
					}
					if (local43 == 2) {
						if (local39 == 3) {
							local53[local67] = local45;
							local53[local67 + 512] = local45;
							local53[local67 + 1024] = local45;
							local53[local67 + 1536] = local45;
						} else if (local39 == 0) {
							local53[local67] = local45;
							local53[local67 + 1] = local45;
							local53[local67 + 2] = local45;
							local53[local67 + 3] = local45;
						} else if (local39 == 1) {
							local53[local67 + 3] = local45;
							local53[local67 + 3 + 512] = local45;
							local53[local67 + 3 + 1024] = local45;
							local53[local67 + 3 + 1536] = local45;
						} else if (local39 == 2) {
							local53[local67 + 1536] = local45;
							local53[local67 + 1536 + 1] = local45;
							local53[local67 + 1536 + 2] = local45;
							local53[local67 + 1536 + 3] = local45;
						}
					}
				} else {
					@Pc(86) Class4_Sub1_Sub2_Sub2 local86 = this.aClass4_Sub1_Sub2_Sub2Array2[local76.anInt60];
					if (local86 != null) {
						@Pc(98) int local98 = (local76.anInt58 * 4 - local86.anInt395) / 2;
						@Pc(108) int local108 = (local76.anInt61 * 4 - local86.anInt396) / 2;
						local86.method296(arg4 * 4 + local98 + 48, (104 - arg2 - local76.anInt61) * 4 + 48 + local108);
					}
				}
			}
			local8 = this.aClass20_1.method251(arg1, arg4, arg2);
			if (local8 != 0) {
				local33 = this.aClass20_1.method253(arg1, arg4, arg2, local8);
				local39 = local33 >> 6 & 0x3;
				local43 = local33 & 0x1F;
				local45 = local8 >> 14 & 0x7FFF;
				@Pc(462) Class7 local462 = Class7.method82(local45);
				@Pc(494) int local494;
				if (local462.anInt60 != -1) {
					@Pc(472) Class4_Sub1_Sub2_Sub2 local472 = this.aClass4_Sub1_Sub2_Sub2Array2[local462.anInt60];
					if (local472 != null) {
						local73 = (local462.anInt58 * 4 - local472.anInt395) / 2;
						local494 = (local462.anInt61 * 4 - local472.anInt396) / 2;
						local472.method296(arg4 * 4 + local73 + 48, (104 - arg2 - local462.anInt61) * 4 + 48 + local494);
					}
				} else if (local43 == 9) {
					local67 = 15658734;
					if (local8 > 0) {
						local67 = 15597568;
					}
					@Pc(531) int[] local531 = this.aClass4_Sub1_Sub2_Sub3_8.anIntArray149;
					local494 = arg4 * 4 + (103 - arg2) * 512 * 4 + 24624;
					if (local39 == 0 || local39 == 2) {
						local531[local494 + 1536] = local67;
						local531[local494 + 1024 + 1] = local67;
						local531[local494 + 512 + 2] = local67;
						local531[local494 + 3] = local67;
					} else {
						local531[local494] = local67;
						local531[local494 + 512 + 1] = local67;
						local531[local494 + 1024 + 2] = local67;
						local531[local494 + 1536 + 3] = local67;
					}
				}
			}
			local8 = this.aClass20_1.method252(arg1, arg4, arg2);
			if (local8 != 0) {
				local33 = local8 >> 14 & 0x7FFF;
				@Pc(626) Class7 local626 = Class7.method82(local33);
				if (local626.anInt60 != -1) {
					@Pc(636) Class4_Sub1_Sub2_Sub2 local636 = this.aClass4_Sub1_Sub2_Sub2Array2[local626.anInt60];
					if (local636 != null) {
						local45 = (local626.anInt58 * 4 - local636.anInt395) / 2;
						@Pc(658) int local658 = (local626.anInt61 * 4 - local636.anInt396) / 2;
						local636.method296(arg4 * 4 + local45 + 48, (104 - arg2 - local626.anInt61) * 4 + 48 + local658);
						return;
					}
				}
			}
		} catch (@Pc(682) RuntimeException local682) {
			signlink.reporterror("86280, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local682.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IBLclient!PGNBHFUF;)V")
	private void method669(@OriginalArg(0) int arg0, @OriginalArg(2) Class4_Sub1_Sub4 arg1) {
		try {
			@Pc(7) int local7 = arg1.method366(8, this.aBoolean229);
			@Pc(18) int local18;
			if (local7 < this.anInt949) {
				for (local18 = local7; local18 < this.anInt949; local18++) {
					this.anIntArray270[this.anInt1045++] = this.anIntArray241[local18];
				}
			}
			if (local7 > this.anInt949) {
				signlink.reporterror(this.aString20 + " Too many players");
				throw new RuntimeException("eek");
			}
			this.anInt949 = 0;
			for (local18 = 0; local18 < local7; local18++) {
				@Pc(70) int local70 = this.anIntArray241[local18];
				@Pc(75) Class4_Sub1_Sub1_Sub2_Sub2 local75 = this.aClass4_Sub1_Sub1_Sub2_Sub2Array1[local70];
				@Pc(81) int local81 = arg1.method366(1, this.aBoolean229);
				if (local81 == 0) {
					this.anIntArray241[this.anInt949++] = local70;
					local75.anInt782 = anInt1054;
				} else {
					@Pc(105) int local105 = arg1.method366(2, this.aBoolean229);
					if (local105 == 0) {
						this.anIntArray241[this.anInt949++] = local70;
						local75.anInt782 = anInt1054;
						this.anIntArray242[this.anInt950++] = local70;
					} else {
						@Pc(157) int local157;
						@Pc(168) int local168;
						if (local105 == 1) {
							this.anIntArray241[this.anInt949++] = local70;
							local75.anInt782 = anInt1054;
							local157 = arg1.method366(3, this.aBoolean229);
							local75.method563(local157, false);
							local168 = arg1.method366(1, this.aBoolean229);
							if (local168 == 1) {
								this.anIntArray242[this.anInt950++] = local70;
							}
						} else if (local105 == 2) {
							this.anIntArray241[this.anInt949++] = local70;
							local75.anInt782 = anInt1054;
							local157 = arg1.method366(3, this.aBoolean229);
							local75.method563(local157, true);
							local168 = arg1.method366(3, this.aBoolean229);
							local75.method563(local168, true);
							@Pc(229) int local229 = arg1.method366(1, this.aBoolean229);
							if (local229 == 1) {
								this.anIntArray242[this.anInt950++] = local70;
							}
						} else if (local105 == 3) {
							this.anIntArray270[this.anInt1045++] = local70;
						}
					}
				}
			}
		} catch (@Pc(266) RuntimeException local266) {
			signlink.reporterror("26075, " + arg0 + ", " + 99 + ", " + arg1 + ", " + local266.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ZIIIIIIIIIII)Z")
	private boolean method671(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11) {
		try {
			@Pc(11) int local11;
			for (@Pc(7) int local7 = 0; local7 < 104; local7++) {
				for (local11 = 0; local11 < 104; local11++) {
					this.anIntArrayArray22[local7][local11] = 0;
					this.anIntArrayArray25[local7][local11] = 99999999;
				}
			}
			local11 = arg3;
			@Pc(39) int local39 = arg4;
			this.anIntArrayArray22[arg3][arg4] = 99;
			this.anIntArrayArray25[arg3][arg4] = 0;
			@Pc(55) byte local55 = 0;
			@Pc(57) int local57 = 0;
			this.anIntArray243[0] = arg3;
			@Pc(66) int local66 = local55 + 1;
			this.anIntArray244[0] = arg4;
			@Pc(70) boolean local70 = false;
			@Pc(74) int local74 = this.anIntArray243.length;
			@Pc(81) int[][] local81 = this.aClass2Array1[this.anInt895].anIntArrayArray1;
			@Pc(192) int local192;
			while (local57 != local66) {
				local11 = this.anIntArray243[local57];
				local39 = this.anIntArray244[local57];
				local57 = (local57 + 1) % local74;
				if (local11 == arg8 && local39 == arg2) {
					local70 = true;
					break;
				}
				if (arg10 != 0) {
					if ((arg10 < 5 || arg10 == 10) && this.aClass2Array1[this.anInt895].method48(local11, arg9, arg8, arg2, local39, arg10 - 1)) {
						local70 = true;
						break;
					}
					if (arg10 < 10 && this.aClass2Array1[this.anInt895].method49(local11, arg2, arg9, arg8, local39, arg10 - 1)) {
						local70 = true;
						break;
					}
				}
				if (arg5 != 0 && arg1 != 0 && this.aClass2Array1[this.anInt895].method50(arg7, arg8, arg1, local39, arg2, local11, arg5)) {
					local70 = true;
					break;
				}
				local192 = this.anIntArrayArray25[local11][local39] + 1;
				if (local11 > 0 && this.anIntArrayArray22[local11 - 1][local39] == 0 && (local81[local11 - 1][local39] & 0x1280108) == 0) {
					this.anIntArray243[local66] = local11 - 1;
					this.anIntArray244[local66] = local39;
					local66 = (local66 + 1) % local74;
					this.anIntArrayArray22[local11 - 1][local39] = 2;
					this.anIntArrayArray25[local11 - 1][local39] = local192;
				}
				if (local11 < 103 && this.anIntArrayArray22[local11 + 1][local39] == 0 && (local81[local11 + 1][local39] & 0x1280180) == 0) {
					this.anIntArray243[local66] = local11 + 1;
					this.anIntArray244[local66] = local39;
					local66 = (local66 + 1) % local74;
					this.anIntArrayArray22[local11 + 1][local39] = 8;
					this.anIntArrayArray25[local11 + 1][local39] = local192;
				}
				if (local39 > 0 && this.anIntArrayArray22[local11][local39 - 1] == 0 && (local81[local11][local39 - 1] & 0x1280102) == 0) {
					this.anIntArray243[local66] = local11;
					this.anIntArray244[local66] = local39 - 1;
					local66 = (local66 + 1) % local74;
					this.anIntArrayArray22[local11][local39 - 1] = 1;
					this.anIntArrayArray25[local11][local39 - 1] = local192;
				}
				if (local39 < 103 && this.anIntArrayArray22[local11][local39 + 1] == 0 && (local81[local11][local39 + 1] & 0x1280120) == 0) {
					this.anIntArray243[local66] = local11;
					this.anIntArray244[local66] = local39 + 1;
					local66 = (local66 + 1) % local74;
					this.anIntArrayArray22[local11][local39 + 1] = 4;
					this.anIntArrayArray25[local11][local39 + 1] = local192;
				}
				if (local11 > 0 && local39 > 0 && this.anIntArrayArray22[local11 - 1][local39 - 1] == 0 && (local81[local11 - 1][local39 - 1] & 0x128010E) == 0 && (local81[local11 - 1][local39] & 0x1280108) == 0 && (local81[local11][local39 - 1] & 0x1280102) == 0) {
					this.anIntArray243[local66] = local11 - 1;
					this.anIntArray244[local66] = local39 - 1;
					local66 = (local66 + 1) % local74;
					this.anIntArrayArray22[local11 - 1][local39 - 1] = 3;
					this.anIntArrayArray25[local11 - 1][local39 - 1] = local192;
				}
				if (local11 < 103 && local39 > 0 && this.anIntArrayArray22[local11 + 1][local39 - 1] == 0 && (local81[local11 + 1][local39 - 1] & 0x1280183) == 0 && (local81[local11 + 1][local39] & 0x1280180) == 0 && (local81[local11][local39 - 1] & 0x1280102) == 0) {
					this.anIntArray243[local66] = local11 + 1;
					this.anIntArray244[local66] = local39 - 1;
					local66 = (local66 + 1) % local74;
					this.anIntArrayArray22[local11 + 1][local39 - 1] = 9;
					this.anIntArrayArray25[local11 + 1][local39 - 1] = local192;
				}
				if (local11 > 0 && local39 < 103 && this.anIntArrayArray22[local11 - 1][local39 + 1] == 0 && (local81[local11 - 1][local39 + 1] & 0x1280138) == 0 && (local81[local11 - 1][local39] & 0x1280108) == 0 && (local81[local11][local39 + 1] & 0x1280120) == 0) {
					this.anIntArray243[local66] = local11 - 1;
					this.anIntArray244[local66] = local39 + 1;
					local66 = (local66 + 1) % local74;
					this.anIntArrayArray22[local11 - 1][local39 + 1] = 6;
					this.anIntArrayArray25[local11 - 1][local39 + 1] = local192;
				}
				if (local11 < 103 && local39 < 103 && this.anIntArrayArray22[local11 + 1][local39 + 1] == 0 && (local81[local11 + 1][local39 + 1] & 0x12801E0) == 0 && (local81[local11 + 1][local39] & 0x1280180) == 0 && (local81[local11][local39 + 1] & 0x1280120) == 0) {
					this.anIntArray243[local66] = local11 + 1;
					this.anIntArray244[local66] = local39 + 1;
					local66 = (local66 + 1) % local74;
					this.anIntArrayArray22[local11 + 1][local39 + 1] = 12;
					this.anIntArrayArray25[local11 + 1][local39 + 1] = local192;
				}
			}
			this.anInt922 = 0;
			@Pc(808) int local808;
			@Pc(814) int local814;
			@Pc(820) int local820;
			if (!local70) {
				if (arg0) {
					local192 = 100;
					for (local808 = 1; local808 < 2; local808++) {
						for (local814 = arg8 - local808; local814 <= arg8 + local808; local814++) {
							for (local820 = arg2 - local808; local820 <= arg2 + local808; local820++) {
								if (local814 >= 0 && local820 >= 0 && local814 < 104 && local820 < 104 && this.anIntArrayArray25[local814][local820] < local192) {
									local192 = this.anIntArrayArray25[local814][local820];
									local11 = local814;
									local39 = local820;
									this.anInt922 = 1;
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
			@Pc(885) boolean local885 = false;
			this.anIntArray243[0] = local11;
			local57 = local881 + 1;
			this.anIntArray244[0] = local39;
			local192 = local808 = this.anIntArrayArray22[local11][local39];
			while (local11 != arg3 || local39 != arg4) {
				if (local192 != local808) {
					local808 = local192;
					this.anIntArray243[local57] = local11;
					this.anIntArray244[local57++] = local39;
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
				local192 = this.anIntArrayArray22[local11][local39];
			}
			if (local57 > 0) {
				local74 = local57;
				if (local57 > 25) {
					local74 = 25;
				}
				local57--;
				local814 = this.anIntArray243[local57];
				local820 = this.anIntArray244[local57];
				if (arg6 == 0) {
					this.aClass4_Sub1_Sub4_7.method344(69);
					this.aClass4_Sub1_Sub4_7.method345(local74 + local74 + 3);
				}
				if (arg6 == 1) {
					this.aClass4_Sub1_Sub4_7.method344(159);
					this.aClass4_Sub1_Sub4_7.method345(local74 + local74 + 3 + 14);
				}
				if (arg6 == 2) {
					this.aClass4_Sub1_Sub4_7.method344(124);
					this.aClass4_Sub1_Sub4_7.method345(local74 + local74 + 3);
				}
				this.anInt865 = this.anIntArray243[0];
				this.anInt866 = this.anIntArray244[0];
				for (@Pc(1043) int local1043 = 1; local1043 < local74; local1043++) {
					local57--;
					this.aClass4_Sub1_Sub4_7.method371(this.anIntArray243[local57] - local814);
					this.aClass4_Sub1_Sub4_7.method372(this.anIntArray244[local57] - local820);
				}
				this.aClass4_Sub1_Sub4_7.method379(local814 + this.anInt1056);
				this.aClass4_Sub1_Sub4_7.method372(super.anIntArray210[5] == 1 ? 1 : 0);
				this.aClass4_Sub1_Sub4_7.method378(local820 + this.anInt1057);
				return true;
			} else if (arg6 == 1) {
				return false;
			} else {
				return true;
			}
		} catch (@Pc(1109) RuntimeException local1109) {
			signlink.reporterror("17603, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + arg10 + ", " + arg11 + ", " + local1109.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "v", descriptor = "(I)V")
	private void method672(@OriginalArg(0) int arg0) {
		try {
			this.aClass4_Sub1_Sub2_Sub2_6 = new Class4_Sub1_Sub2_Sub2(this.aClass32_2, "titlebox", 0);
			if (arg0 == this.anInt1044) {
				this.aClass4_Sub1_Sub2_Sub2_7 = new Class4_Sub1_Sub2_Sub2(this.aClass32_2, "titlebutton", 0);
				this.aClass4_Sub1_Sub2_Sub2Array4 = new Class4_Sub1_Sub2_Sub2[12];
				for (@Pc(30) int local30 = 0; local30 < 12; local30++) {
					this.aClass4_Sub1_Sub2_Sub2Array4[local30] = new Class4_Sub1_Sub2_Sub2(this.aClass32_2, "runes", local30);
				}
				this.aClass4_Sub1_Sub2_Sub3_10 = new Class4_Sub1_Sub2_Sub3(128, 265);
				this.aClass4_Sub1_Sub2_Sub3_11 = new Class4_Sub1_Sub2_Sub3(128, 265);
				for (@Pc(63) int local63 = 0; local63 < 33920; local63++) {
					this.aClass4_Sub1_Sub2_Sub3_10.anIntArray149[local63] = this.aClass25_15.anIntArray86[local63];
				}
				for (@Pc(81) int local81 = 0; local81 < 33920; local81++) {
					this.aClass4_Sub1_Sub2_Sub3_11.anIntArray149[local81] = this.aClass25_16.anIntArray86[local81];
				}
				this.anIntArray263 = new int[256];
				for (@Pc(103) int local103 = 0; local103 < 64; local103++) {
					this.anIntArray263[local103] = local103 * 262144;
				}
				for (@Pc(118) int local118 = 0; local118 < 64; local118++) {
					this.anIntArray263[local118 + 64] = local118 * 1024 + 16711680;
				}
				for (@Pc(137) int local137 = 0; local137 < 64; local137++) {
					this.anIntArray263[local137 + 128] = local137 * 4 + 16776960;
				}
				for (@Pc(156) int local156 = 0; local156 < 64; local156++) {
					this.anIntArray263[local156 + 192] = 16777215;
				}
				this.anIntArray264 = new int[256];
				for (@Pc(175) int local175 = 0; local175 < 64; local175++) {
					this.anIntArray264[local175] = local175 * 1024;
				}
				for (@Pc(190) int local190 = 0; local190 < 64; local190++) {
					this.anIntArray264[local190 + 64] = local190 * 4 + 65280;
				}
				for (@Pc(209) int local209 = 0; local209 < 64; local209++) {
					this.anIntArray264[local209 + 128] = local209 * 262144 + 65535;
				}
				for (@Pc(228) int local228 = 0; local228 < 64; local228++) {
					this.anIntArray264[local228 + 192] = 16777215;
				}
				this.anIntArray265 = new int[256];
				for (@Pc(247) int local247 = 0; local247 < 64; local247++) {
					this.anIntArray265[local247] = local247 * 4;
				}
				for (@Pc(262) int local262 = 0; local262 < 64; local262++) {
					this.anIntArray265[local262 + 64] = local262 * 262144 + 255;
				}
				for (@Pc(281) int local281 = 0; local281 < 64; local281++) {
					this.anIntArray265[local281 + 128] = local281 * 1024 + 16711935;
				}
				for (@Pc(300) int local300 = 0; local300 < 64; local300++) {
					this.anIntArray265[local300 + 192] = 16777215;
				}
				this.anIntArray262 = new int[256];
				this.anIntArray247 = new int[32768];
				this.anIntArray248 = new int[32768];
				this.method600(null);
				this.anIntArray218 = new int[32768];
				this.anIntArray219 = new int[32768];
				this.method585(53, "Connecting to fileserver", 10);
				if (!this.aBoolean269) {
					this.aBoolean216 = true;
					this.aBoolean269 = true;
					this.method584(this, 2);
				}
			}
		} catch (@Pc(357) RuntimeException local357) {
			signlink.reporterror("90301, " + arg0 + ", " + local357.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "m", descriptor = "(Z)V")
	private void method673() {
		try {
			if (this.anInt944 == 0 && super.anInt840 == 1) {
				@Pc(18) int local18 = super.anInt841 - 25 - 550;
				@Pc(25) int local25 = super.anInt842 - 5 - 4;
				if (local18 >= 0 && local25 >= 0 && local18 < 146 && local25 < 151) {
					local18 -= 73;
					local25 -= 75;
					@Pc(45) int local45 = this.anInt879 + this.anInt1050 & 0x7FF;
					@Pc(49) int local49 = Class4_Sub1_Sub2_Sub1.anIntArray25[local45];
					@Pc(53) int local53 = Class4_Sub1_Sub2_Sub1.anIntArray26[local45];
					@Pc(62) int local62 = local49 * (this.anInt985 + 256) >> 8;
					@Pc(71) int local71 = local53 * (this.anInt985 + 256) >> 8;
					@Pc(81) int local81 = local25 * local62 + local18 * local71 >> 11;
					@Pc(91) int local91 = local25 * local71 - local18 * local62 >> 11;
					@Pc(98) int local98 = aClass4_Sub1_Sub1_Sub2_Sub2_1.anInt764 + local81 >> 7;
					@Pc(105) int local105 = aClass4_Sub1_Sub1_Sub2_Sub2_1.anInt765 - local91 >> 7;
					@Pc(126) boolean local126 = this.method671(true, 0, local105, aClass4_Sub1_Sub1_Sub2_Sub2_1.anIntArray187[0], aClass4_Sub1_Sub1_Sub2_Sub2_1.anIntArray188[0], 0, 1, 0, local98, 0, 0, 566);
					if (local126) {
						this.aClass4_Sub1_Sub4_7.method345(local18);
						this.aClass4_Sub1_Sub4_7.method345(local25);
						this.aClass4_Sub1_Sub4_7.method346(this.anInt879);
						this.aClass4_Sub1_Sub4_7.method345(57);
						this.aClass4_Sub1_Sub4_7.method345(this.anInt1050);
						this.aClass4_Sub1_Sub4_7.method345(this.anInt985);
						this.aClass4_Sub1_Sub4_7.method345(89);
						this.aClass4_Sub1_Sub4_7.method346(aClass4_Sub1_Sub1_Sub2_Sub2_1.anInt764);
						this.aClass4_Sub1_Sub4_7.method346(aClass4_Sub1_Sub1_Sub2_Sub2_1.anInt765);
						this.aClass4_Sub1_Sub4_7.method345(this.anInt922);
						this.aClass4_Sub1_Sub4_7.method345(63);
						return;
					}
				}
			}
		} catch (@Pc(180) RuntimeException local180) {
			signlink.reporterror("90948, " + false + ", " + local180.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "w", descriptor = "(I)V")
	private void method674() {
		try {
			if (this.anInt953 > 1) {
				this.anInt953--;
			}
			if (this.anInt863 > 0) {
				this.anInt863--;
			}
			for (@Pc(22) int local22 = 0; local22 < 5 && this.method717(); local22++) {
			}
			if (this.aBoolean251) {
				@Pc(41) Object local41 = this.aClass46_1.anObject1;
				@Pc(66) int local66;
				@Pc(68) int local68;
				@Pc(70) int local70;
				@Pc(103) int local103;
				synchronized (this.aClass46_1.anObject1) {
					if (!aBoolean252) {
						this.aClass46_1.anInt720 = 0;
					} else if (super.anInt840 != 0 || this.aClass46_1.anInt720 >= 40) {
						this.aClass4_Sub1_Sub4_7.method344(175);
						this.aClass4_Sub1_Sub4_7.method345(0);
						local66 = this.aClass4_Sub1_Sub4_7.anInt506;
						local68 = 0;
						@Pc(86) int local86;
						for (local70 = 0; local70 < this.aClass46_1.anInt720 && local66 - this.aClass4_Sub1_Sub4_7.anInt506 < 240; local70++) {
							local68++;
							local86 = this.aClass46_1.anIntArray181[local70];
							if (local86 < 0) {
								local86 = 0;
							} else if (local86 > 502) {
								local86 = 502;
							}
							local103 = this.aClass46_1.anIntArray182[local70];
							if (local103 < 0) {
								local103 = 0;
							} else if (local103 > 764) {
								local103 = 764;
							}
							@Pc(120) int local120 = local86 * 765 + local103;
							if (this.aClass46_1.anIntArray181[local70] == -1 && this.aClass46_1.anIntArray182[local70] == -1) {
								local103 = -1;
								local86 = -1;
								local120 = 524287;
							}
							if (local103 != this.anInt964 || local86 != this.anInt965) {
								@Pc(165) int local165 = local103 - this.anInt964;
								this.anInt964 = local103;
								@Pc(173) int local173 = local86 - this.anInt965;
								this.anInt965 = local86;
								if (this.anInt975 < 8 && local165 >= -32 && local165 <= 31 && local173 >= -32 && local173 <= 31) {
									local165 += 32;
									local173 += 32;
									this.aClass4_Sub1_Sub4_7.method346((this.anInt975 << 12) + (local165 << 6) + local173);
									this.anInt975 = 0;
								} else if (this.anInt975 < 8) {
									this.aClass4_Sub1_Sub4_7.method348((this.anInt975 << 19) + local120 + 8388608);
									this.anInt975 = 0;
								} else {
									this.aClass4_Sub1_Sub4_7.method349((this.anInt975 << 19) + local120 - 1073741824);
									this.anInt975 = 0;
								}
							} else if (this.anInt975 < 2047) {
								this.anInt975++;
							}
						}
						this.aClass4_Sub1_Sub4_7.method354((byte) 5, this.aClass4_Sub1_Sub4_7.anInt506 - local66);
						if (local68 >= this.aClass46_1.anInt720) {
							this.aClass46_1.anInt720 = 0;
						} else {
							this.aClass46_1.anInt720 -= local68;
							for (local86 = 0; local86 < this.aClass46_1.anInt720; local86++) {
								this.aClass46_1.anIntArray182[local86] = this.aClass46_1.anIntArray182[local86 + local68];
								this.aClass46_1.anIntArray181[local86] = this.aClass46_1.anIntArray181[local86 + local68];
							}
						}
					}
				}
				if (super.anInt840 != 0) {
					@Pc(336) long local336 = (super.aLong28 - this.aLong33) / 50L;
					if (local336 > 4095L) {
						local336 = 4095L;
					}
					this.aLong33 = super.aLong28;
					local66 = super.anInt842;
					if (local66 < 0) {
						local66 = 0;
					} else if (local66 > 502) {
						local66 = 502;
					}
					local68 = super.anInt841;
					if (local68 < 0) {
						local68 = 0;
					} else if (local68 > 764) {
						local68 = 764;
					}
					local70 = local66 * 765 + local68;
					@Pc(382) byte local382 = 0;
					if (super.anInt840 == 2) {
						local382 = 1;
					}
					local103 = (int) local336;
					this.aClass4_Sub1_Sub4_7.method344(137);
					this.aClass4_Sub1_Sub4_7.method386((local103 << 20) + (local382 << 19) + local70);
				}
				if (this.anInt992 > 0) {
					this.anInt992--;
				}
				if (super.anIntArray210[1] == 1 || super.anIntArray210[2] == 1 || super.anIntArray210[3] == 1 || super.anIntArray210[4] == 1) {
					this.aBoolean248 = true;
				}
				if (this.aBoolean248 && this.anInt992 <= 0) {
					this.anInt992 = 20;
					this.aBoolean248 = false;
					this.aClass4_Sub1_Sub4_7.method344(136);
					this.aClass4_Sub1_Sub4_7.method380(this.anInt878);
					this.aClass4_Sub1_Sub4_7.method346(this.anInt879);
				}
				if (super.aBoolean214 && !this.aBoolean240) {
					this.aBoolean240 = true;
					this.aClass4_Sub1_Sub4_7.method344(1);
					this.aClass4_Sub1_Sub4_7.method345(1);
				}
				if (!super.aBoolean214 && this.aBoolean240) {
					this.aBoolean240 = false;
					this.aClass4_Sub1_Sub4_7.method344(1);
					this.aClass4_Sub1_Sub4_7.method345(0);
				}
				this.method706();
				this.method664(this.anInt911);
				this.method626((byte) 8);
				this.anInt861++;
				if (this.anInt861 > 750) {
					this.method624();
				}
				this.method679();
				this.method604();
				this.method676();
				this.anInt1043++;
				if (this.anInt1073 != 0) {
					this.anInt1072 += 20;
					if (this.anInt1072 >= 400) {
						this.anInt1073 = 0;
					}
				}
				if (this.anInt1049 != 0) {
					this.anInt1046++;
					if (this.anInt1046 >= 15) {
						if (this.anInt1049 == 2) {
							this.aBoolean246 = true;
						}
						if (this.anInt1049 == 3) {
							this.aBoolean247 = true;
						}
						this.anInt1049 = 0;
					}
				}
				if (this.anInt1040 != 0) {
					this.anInt921++;
					if (super.anInt835 > this.anInt1041 + 5 || super.anInt835 < this.anInt1041 - 5 || super.anInt836 > this.anInt1042 + 5 || super.anInt836 < this.anInt1042 - 5) {
						this.aBoolean218 = true;
					}
					if (super.anInt834 == 0) {
						if (this.anInt1040 == 2) {
							this.aBoolean246 = true;
						}
						if (this.anInt1040 == 3) {
							this.aBoolean247 = true;
						}
						this.anInt1040 = 0;
						if (this.aBoolean218 && this.anInt921 >= 5) {
							this.anInt850 = -1;
							this.method597(566);
							if (this.anInt850 == this.anInt1038 && this.anInt849 != this.anInt1039) {
								@Pc(684) Class28 local684 = Class28.method318(this.anInt1038);
								@Pc(686) byte local686 = 0;
								if (this.anInt998 == 1 && local684.anInt458 == 206) {
									local686 = 1;
								}
								if (local684.anIntArray94[this.anInt849] <= 0) {
									local686 = 0;
								}
								if (local684.aBoolean111) {
									local66 = this.anInt1039;
									local68 = this.anInt849;
									local684.anIntArray94[local68] = local684.anIntArray94[local66];
									local684.anIntArray95[local68] = local684.anIntArray95[local66];
									local684.anIntArray94[local66] = -1;
									local684.anIntArray95[local66] = 0;
								} else if (local686 == 1) {
									local66 = this.anInt1039;
									local68 = this.anInt849;
									while (local66 != local68) {
										if (local66 > local68) {
											local684.method327(local66 - 1, local66);
											local66--;
										} else if (local66 < local68) {
											local684.method327(local66 + 1, local66);
											local66++;
										}
									}
								} else {
									local684.method327(this.anInt849, this.anInt1039);
								}
								this.aClass4_Sub1_Sub4_7.method344(207);
								this.aClass4_Sub1_Sub4_7.method378(this.anInt849);
								this.aClass4_Sub1_Sub4_7.method372(local686);
								this.aClass4_Sub1_Sub4_7.method380(this.anInt1038);
								this.aClass4_Sub1_Sub4_7.method380(this.anInt1039);
							}
						} else if ((this.anInt1053 == 1 || this.method615(this.anInt989 - 1, (byte) 8)) && this.anInt989 > 2) {
							this.method663();
						} else if (this.anInt989 > 0) {
							this.method692(this.anInt989 - 1);
						}
						this.anInt1046 = 10;
						super.anInt840 = 0;
					}
				}
				@Pc(860) int local860;
				@Pc(862) int local862;
				if (Class20.anInt356 != -1) {
					local860 = Class20.anInt356;
					local862 = Class20.anInt357;
					@Pc(883) boolean local883 = this.method671(true, 0, local862, aClass4_Sub1_Sub1_Sub2_Sub2_1.anIntArray187[0], aClass4_Sub1_Sub1_Sub2_Sub2_1.anIntArray188[0], 0, 0, 0, local860, 0, 0, 566);
					Class20.anInt356 = -1;
					if (local883) {
						this.anInt1070 = super.anInt841;
						this.anInt1071 = super.anInt842;
						this.anInt1073 = 1;
						this.anInt1072 = 0;
					}
				}
				if (super.anInt840 == 1 && this.aString24 != null) {
					this.aString24 = null;
					this.aBoolean247 = true;
					super.anInt840 = 0;
				}
				this.method700(302);
				if (this.anInt1015 == -1) {
					this.method673();
					this.method643();
					this.method710((byte) 1);
				}
				if (super.anInt834 == 1 || super.anInt840 == 1) {
					this.anInt941++;
				}
				if (this.anInt937 == 0 && this.anInt940 == 0 && this.anInt952 == 0) {
					if (this.anInt993 > 0) {
						this.anInt993--;
					}
				} else if (this.anInt993 < 100) {
					this.anInt993++;
					if (this.anInt993 == 100) {
						if (this.anInt937 != 0) {
							this.aBoolean247 = true;
						}
						if (this.anInt940 != 0) {
							this.aBoolean246 = true;
						}
					}
				}
				if (this.anInt946 == 2) {
					this.method629(20);
				}
				if (this.anInt946 == 2 && this.aBoolean234) {
					this.method651();
				}
				for (local860 = 0; local860 < 5; local860++) {
					@Pc(1019) int local1019 = this.anIntArray221[local860]++;
				}
				this.method703();
				super.anInt833++;
				if (super.anInt833 > 4500) {
					this.anInt863 = 250;
					super.anInt833 -= 500;
					this.aClass4_Sub1_Sub4_7.method344(192);
				}
				this.anInt1019++;
				if (this.anInt1019 > 500) {
					this.anInt1019 = 0;
					local862 = (int) (Math.random() * 8.0D);
					if ((local862 & 0x1) == 1) {
						this.anInt1029 += this.anInt1030;
					}
					if ((local862 & 0x2) == 2) {
						this.anInt973 += this.anInt974;
					}
					if ((local862 & 0x4) == 4) {
						this.anInt1000 += this.anInt1001;
					}
				}
				if (this.anInt1029 < -50) {
					this.anInt1030 = 2;
				}
				if (this.anInt1029 > 50) {
					this.anInt1030 = -2;
				}
				if (this.anInt973 < -55) {
					this.anInt974 = 2;
				}
				if (this.anInt973 > 55) {
					this.anInt974 = -2;
				}
				if (this.anInt1000 < -40) {
					this.anInt1001 = 1;
				}
				if (this.anInt1000 > 40) {
					this.anInt1001 = -1;
				}
				this.anInt960++;
				if (this.anInt960 > 500) {
					this.anInt960 = 0;
					local862 = (int) (Math.random() * 8.0D);
					if ((local862 & 0x1) == 1) {
						this.anInt1050 += this.anInt1051;
					}
					if ((local862 & 0x2) == 2) {
						this.anInt985 += this.anInt986;
					}
				}
				if (this.anInt1050 < -60) {
					this.anInt1051 = 2;
				}
				if (this.anInt1050 > 60) {
					this.anInt1051 = -2;
				}
				if (this.anInt985 < -20) {
					this.anInt986 = 1;
				}
				if (this.anInt985 > 10) {
					this.anInt986 = -1;
				}
				this.anInt862++;
				if (this.anInt862 > 50) {
					this.aClass4_Sub1_Sub4_7.method344(253);
				}
				try {
					if (this.aClass15_1 != null && this.aClass4_Sub1_Sub4_7.anInt506 > 0) {
						this.aClass15_1.method187(this.aClass4_Sub1_Sub4_7.aByteArray10, this.aClass4_Sub1_Sub4_7.anInt506);
						this.aClass4_Sub1_Sub4_7.anInt506 = 0;
						this.anInt862 = 0;
					}
				} catch (@Pc(1267) IOException local1267) {
					this.method624();
				} catch (@Pc(1272) Exception local1272) {
					this.method655();
				}
			}
		} catch (@Pc(1277) RuntimeException local1277) {
			signlink.reporterror("24147, " + -34183 + ", " + local1277.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "l", descriptor = "(B)V")
	private void method675() {
		try {
			this.anInt858++;
			this.method683((byte) 9, true);
			this.method593(true);
			this.method683((byte) 9, false);
			this.method593(false);
			this.method586();
			this.method696();
			@Pc(35) int local35;
			@Pc(74) int local74;
			if (!this.aBoolean234) {
				local35 = this.anInt878;
				if (this.anInt961 / 256 > local35) {
					local35 = this.anInt961 / 256;
				}
				if (this.aBooleanArray12[4] && this.anIntArray250[4] + 128 > local35) {
					local35 = this.anIntArray250[4] + 128;
				}
				local74 = this.anInt879 + this.anInt1000 & 0x7FF;
				this.method644(local35 * 3 + 600, this.anInt991, this.anInt990, this.method614(this.anInt895, aClass4_Sub1_Sub1_Sub2_Sub2_1.anInt764, aClass4_Sub1_Sub1_Sub2_Sub2_1.anInt765) - 50, local74, local35);
			}
			if (this.aBoolean234) {
				local35 = this.method623(this.anInt864);
			} else {
				local35 = this.method622(728);
			}
			local74 = this.anInt929;
			@Pc(119) int local119 = this.anInt930;
			@Pc(122) int local122 = this.anInt931;
			@Pc(125) int local125 = this.anInt932;
			@Pc(128) int local128 = this.anInt933;
			@Pc(177) int local177;
			for (@Pc(130) int local130 = 0; local130 < 5; local130++) {
				if (this.aBooleanArray12[local130]) {
					local177 = (int) (Math.random() * (double) (this.anIntArray215[local130] * 2 + 1) - (double) this.anIntArray215[local130] + Math.sin((double) this.anIntArray221[local130] * ((double) this.anIntArray272[local130] / 100.0D)) * (double) this.anIntArray250[local130]);
					if (local130 == 0) {
						this.anInt929 += local177;
					}
					if (local130 == 1) {
						this.anInt930 += local177;
					}
					if (local130 == 2) {
						this.anInt931 += local177;
					}
					if (local130 == 3) {
						this.anInt933 = this.anInt933 + local177 & 0x7FF;
					}
					if (local130 == 4) {
						this.anInt932 += local177;
						if (this.anInt932 < 128) {
							this.anInt932 = 128;
						}
						if (this.anInt932 > 383) {
							this.anInt932 = 383;
						}
					}
				}
			}
			local177 = Class4_Sub1_Sub2_Sub1.anInt107;
			Class4_Sub1_Sub1_Sub4.aBoolean139 = true;
			Class4_Sub1_Sub1_Sub4.anInt537 = 0;
			Class4_Sub1_Sub1_Sub4.anInt535 = super.anInt835 - 4;
			Class4_Sub1_Sub1_Sub4.anInt536 = super.anInt836 - 4;
			Class4_Sub1_Sub2.method494();
			this.aClass20_1.method262(this.anInt933, this.anInt929, this.anInt930, this.anInt931, this.anInt932, local35);
			this.aClass20_1.method237();
			this.method612();
			this.method687();
			this.method658(local177);
			this.method682();
			this.aClass25_23.method303(4, 4, super.aGraphics2);
			this.anInt929 = local74;
			this.anInt930 = local119;
			this.anInt931 = local122;
			this.anInt932 = local125;
			this.anInt933 = local128;
		} catch (@Pc(322) RuntimeException local322) {
			signlink.reporterror("16134, " + -122 + ", " + local322.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "x", descriptor = "(I)V")
	private void method676() {
		try {
			@Pc(11) int local11;
			for (@Pc(3) int local3 = -1; local3 < this.anInt949; local3++) {
				if (local3 == -1) {
					local11 = this.anInt948;
				} else {
					local11 = this.anIntArray241[local3];
				}
				@Pc(23) Class4_Sub1_Sub1_Sub2_Sub2 local23 = this.aClass4_Sub1_Sub1_Sub2_Sub2Array1[local11];
				if (local23 != null && local23.anInt770 > 0) {
					local23.anInt770--;
					if (local23.anInt770 == 0) {
						local23.aString14 = null;
					}
				}
			}
			for (local11 = 0; local11 < this.anInt1013; local11++) {
				@Pc(54) int local54 = this.anIntArray256[local11];
				@Pc(59) Class4_Sub1_Sub1_Sub2_Sub1 local59 = this.aClass4_Sub1_Sub1_Sub2_Sub1Array1[local54];
				if (local59 != null && local59.anInt770 > 0) {
					local59.anInt770--;
					if (local59.anInt770 == 0) {
						local59.aString14 = null;
					}
				}
			}
		} catch (@Pc(89) RuntimeException local89) {
			signlink.reporterror("21873, " + 0 + ", " + local89.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IJ)V")
	private void method677(@OriginalArg(1) long arg0) {
		try {
			if (arg0 != 0L) {
				for (@Pc(8) int local8 = 0; local8 < this.anInt957; local8++) {
					if (this.aLongArray4[local8] == arg0) {
						this.anInt957--;
						this.aBoolean246 = true;
						for (@Pc(28) int local28 = local8; local28 < this.anInt957; local28++) {
							this.aStringArray11[local28] = this.aStringArray11[local28 + 1];
							this.anIntArray235[local28] = this.anIntArray235[local28 + 1];
							this.aLongArray4[local28] = this.aLongArray4[local28 + 1];
						}
						this.aClass4_Sub1_Sub4_7.method344(143);
						this.aClass4_Sub1_Sub4_7.method351(arg0);
						break;
					}
				}
			}
		} catch (@Pc(89) RuntimeException local89) {
			signlink.reporterror("23938, " + 987 + ", " + arg0 + ", " + local89.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIILclient!WZSDIPBR;I)V")
	private void method678(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class40 arg2, @OriginalArg(4) int arg3) {
		try {
			if (this.anInt989 < 400) {
				if (arg2.anIntArray155 != null) {
					arg2 = arg2.method482((byte) 3);
				}
				if (arg2 != null && arg2.aBoolean174) {
					@Pc(23) String local23 = arg2.aString13;
					if (arg2.anInt645 != 0) {
						local23 = local23 + method701(arg2.anInt645, aClass4_Sub1_Sub1_Sub2_Sub2_1.anInt799) + " (level-" + arg2.anInt645 + ")";
					}
					if (this.anInt1021 == 1) {
						this.aStringArray12[this.anInt989] = "Use " + this.aString29 + " with @yel@" + local23;
						this.anIntArray253[this.anInt989] = 22;
						this.anIntArray254[this.anInt989] = arg1;
						this.anIntArray251[this.anInt989] = arg3;
						this.anIntArray252[this.anInt989] = arg0;
						this.anInt989++;
					} else if (this.anInt1067 != 1) {
						@Pc(168) int local168;
						if (arg2.aStringArray7 != null) {
							for (local168 = 4; local168 >= 0; local168--) {
								if (arg2.aStringArray7[local168] != null && !arg2.aStringArray7[local168].equalsIgnoreCase("attack")) {
									this.aStringArray12[this.anInt989] = arg2.aStringArray7[local168] + " @yel@" + local23;
									if (local168 == 0) {
										this.anIntArray253[this.anInt989] = 71;
									}
									if (local168 == 1) {
										this.anIntArray253[this.anInt989] = 133;
									}
									if (local168 == 2) {
										this.anIntArray253[this.anInt989] = 946;
									}
									if (local168 == 3) {
										this.anIntArray253[this.anInt989] = 546;
									}
									if (local168 == 4) {
										this.anIntArray253[this.anInt989] = 777;
									}
									this.anIntArray254[this.anInt989] = arg1;
									this.anIntArray251[this.anInt989] = arg3;
									this.anIntArray252[this.anInt989] = arg0;
									this.anInt989++;
								}
							}
						}
						if (arg2.aStringArray7 != null) {
							for (local168 = 4; local168 >= 0; local168--) {
								if (arg2.aStringArray7[local168] != null && arg2.aStringArray7[local168].equalsIgnoreCase("attack")) {
									@Pc(292) short local292 = 0;
									if (arg2.anInt645 > aClass4_Sub1_Sub1_Sub2_Sub2_1.anInt799) {
										local292 = 2000;
									}
									this.aStringArray12[this.anInt989] = arg2.aStringArray7[local168] + " @yel@" + local23;
									if (local168 == 0) {
										this.anIntArray253[this.anInt989] = local292 + 71;
									}
									if (local168 == 1) {
										this.anIntArray253[this.anInt989] = local292 + 133;
									}
									if (local168 == 2) {
										this.anIntArray253[this.anInt989] = local292 + 946;
									}
									if (local168 == 3) {
										this.anIntArray253[this.anInt989] = local292 + 546;
									}
									if (local168 == 4) {
										this.anIntArray253[this.anInt989] = local292 + 777;
									}
									this.anIntArray254[this.anInt989] = arg1;
									this.anIntArray251[this.anInt989] = arg3;
									this.anIntArray252[this.anInt989] = arg0;
									this.anInt989++;
								}
							}
						}
						this.aStringArray12[this.anInt989] = "Examine @yel@" + local23;
						this.anIntArray253[this.anInt989] = 1317;
						this.anIntArray254[this.anInt989] = arg1;
						this.anIntArray251[this.anInt989] = arg3;
						this.anIntArray252[this.anInt989] = arg0;
						this.anInt989++;
					} else if ((this.anInt1069 & 0x2) == 2) {
						this.aStringArray12[this.anInt989] = this.aString31 + " @yel@" + local23;
						this.anIntArray253[this.anInt989] = 972;
						this.anIntArray254[this.anInt989] = arg1;
						this.anIntArray251[this.anInt989] = arg3;
						this.anIntArray252[this.anInt989] = arg0;
						this.anInt989++;
						return;
					}
				}
			}
		} catch (@Pc(442) RuntimeException local442) {
			signlink.reporterror("17735, " + arg0 + ", " + arg1 + ", " + 560 + ", " + arg2 + ", " + arg3 + ", " + local442.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "m", descriptor = "(B)V")
	private void method679() {
		try {
			for (@Pc(7) int local7 = -1; local7 < this.anInt949; local7++) {
				@Pc(15) int local15;
				if (local7 == -1) {
					local15 = this.anInt948;
				} else {
					local15 = this.anIntArray241[local7];
				}
				@Pc(27) Class4_Sub1_Sub1_Sub2_Sub2 local27 = this.aClass4_Sub1_Sub1_Sub2_Sub2Array1[local15];
				if (local27 != null) {
					this.method605(local27, 1);
				}
			}
		} catch (@Pc(41) RuntimeException local41) {
			signlink.reporterror("80382, " + -57 + ", " + local41.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "y", descriptor = "(I)V")
	private void method680() {
		try {
			@Pc(2) int local2 = this.anInt898;
			@Pc(5) int local5 = this.anInt899;
			@Pc(8) int local8 = this.anInt900;
			@Pc(11) int local11 = this.anInt901;
			Class4_Sub1_Sub2.method496(local2, 6116423, local8, local11, local5);
			this.anInt859 += 0;
			Class4_Sub1_Sub2.method496(local2 + 1, 0, local8 - 2, 16, local5 + 1);
			Class4_Sub1_Sub2.method497(local8 - 2, 0, local2 + 1, local11 - 19, local5 + 18);
			this.aClass4_Sub1_Sub2_Sub4_4.method508(6116423, local5 + 14, local2 + 3, "Choose Option");
			@Pc(69) int local69 = super.anInt835;
			@Pc(72) int local72 = super.anInt836;
			if (this.anInt897 == 0) {
				local69 -= 4;
				local72 -= 4;
			}
			if (this.anInt897 == 1) {
				local69 -= 553;
				local72 -= 205;
			}
			if (this.anInt897 == 2) {
				local69 -= 17;
				local72 -= 357;
			}
			for (@Pc(91) int local91 = 0; local91 < this.anInt989; local91++) {
				@Pc(106) int local106 = local5 + (this.anInt989 - 1 - local91) * 15 + 31;
				@Pc(108) int local108 = 16777215;
				if (local69 > local2 && local69 < local2 + local8 && local72 > local106 - 13 && local72 < local106 + 3) {
					local108 = 16776960;
				}
				this.aClass4_Sub1_Sub2_Sub4_4.method512(local106, local108, 817, local2 + 3, true, this.aStringArray12[local91]);
			}
		} catch (@Pc(149) RuntimeException local149) {
			signlink.reporterror("84675, " + 0 + ", " + local149.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(IIB)V")
	private void method681(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			if (this.aByte31 == 5) {
				@Pc(6) int local6 = 0;
				for (@Pc(8) int local8 = 0; local8 < 100; local8++) {
					if (this.aStringArray14[local8] != null) {
						@Pc(20) int local20 = this.anIntArray269[local8];
						@Pc(31) int local31 = this.anInt1074 + 70 + 4 - local6 * 14;
						if (local31 < -20) {
							break;
						}
						@Pc(39) String local39 = this.aStringArray13[local8];
						if (local39 != null && local39.startsWith("@cr1@")) {
							local39 = local39.substring(5);
						}
						if (local39 != null && local39.startsWith("@cr2@")) {
							local39 = local39.substring(5);
						}
						if (local20 == 0) {
							local6++;
						}
						if ((local20 == 1 || local20 == 2) && (local20 == 1 || this.anInt978 == 0 || this.anInt978 == 1 && this.method602(local39))) {
							if (arg0 > local31 - 14 && arg0 <= local31 && !local39.equals(aClass4_Sub1_Sub1_Sub2_Sub2_1.aString15)) {
								if (this.anInt959 >= 1) {
									this.aStringArray12[this.anInt989] = "Report abuse @whi@" + local39;
									this.anIntArray253[this.anInt989] = 31;
									this.anInt989++;
								}
								this.aStringArray12[this.anInt989] = "Add ignore @whi@" + local39;
								this.anIntArray253[this.anInt989] = 370;
								this.anInt989++;
								this.aStringArray12[this.anInt989] = "Add friend @whi@" + local39;
								this.anIntArray253[this.anInt989] = 201;
								this.anInt989++;
							}
							local6++;
						}
						if ((local20 == 3 || local20 == 7) && this.anInt1025 == 0 && (local20 == 7 || this.anInt970 == 0 || this.anInt970 == 1 && this.method602(local39))) {
							if (arg0 > local31 - 14 && arg0 <= local31) {
								if (this.anInt959 >= 1) {
									this.aStringArray12[this.anInt989] = "Report abuse @whi@" + local39;
									this.anIntArray253[this.anInt989] = 31;
									this.anInt989++;
								}
								this.aStringArray12[this.anInt989] = "Add ignore @whi@" + local39;
								this.anIntArray253[this.anInt989] = 370;
								this.anInt989++;
								this.aStringArray12[this.anInt989] = "Add friend @whi@" + local39;
								this.anIntArray253[this.anInt989] = 201;
								this.anInt989++;
							}
							local6++;
						}
						if (local20 == 4 && (this.anInt1002 == 0 || this.anInt1002 == 1 && this.method602(local39))) {
							if (arg0 > local31 - 14 && arg0 <= local31) {
								this.aStringArray12[this.anInt989] = "Accept trade @whi@" + local39;
								this.anIntArray253[this.anInt989] = 88;
								this.anInt989++;
							}
							local6++;
						}
						if ((local20 == 5 || local20 == 6) && this.anInt1025 == 0 && this.anInt970 < 2) {
							local6++;
						}
						if (local20 == 8 && (this.anInt1002 == 0 || this.anInt1002 == 1 && this.method602(local39))) {
							if (arg0 > local31 - 14 && arg0 <= local31) {
								this.aStringArray12[this.anInt989] = "Accept challenge @whi@" + local39;
								this.anIntArray253[this.anInt989] = 892;
								this.anInt989++;
							}
							local6++;
						}
					}
				}
			}
		} catch (@Pc(404) RuntimeException local404) {
			signlink.reporterror("34536, " + arg0 + ", " + arg1 + ", " + 5 + ", " + local404.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(I)V")
	@Override
	protected void method582() {
		try {
			this.aBoolean243 = true;
		} catch (@Pc(17) RuntimeException local17) {
			signlink.reporterror("31086, " + -591 + ", " + local17.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "z", descriptor = "(I)V")
	private void method682() {
		try {
			this.method598();
			if (this.anInt1073 == 1) {
				this.aClass4_Sub1_Sub2_Sub3Array7[this.anInt1072 / 100].method466(this.anInt1070 - 8 - 4, this.anInt1071 - 8 - 4);
			}
			if (this.anInt1073 == 2) {
				this.aClass4_Sub1_Sub2_Sub3Array7[this.anInt1072 / 100 + 4].method466(this.anInt1070 - 8 - 4, this.anInt1071 - 8 - 4);
				anInt846++;
				if (anInt846 > 61) {
					anInt846 = 0;
					this.aClass4_Sub1_Sub4_7.method344(62);
				}
			}
			if (this.anInt968 != -1) {
				this.method590(this.anInt1043, anInt868, this.anInt968);
				this.method688(0, Class28.method318(this.anInt968), 0, 0);
			}
			if (this.anInt951 != -1) {
				this.method590(this.anInt1043, anInt868, this.anInt951);
				this.method688(0, Class28.method318(this.anInt951), 0, 0);
			}
			this.method693();
			this.anInt859 += 0;
			if (!this.aBoolean228) {
				this.method597(566);
				this.method637();
			} else if (this.anInt897 == 0) {
				this.method680();
			}
			if (this.anInt987 == 1) {
				this.aClass4_Sub1_Sub2_Sub3_9.method466(472, 296);
			}
			@Pc(186) int local186;
			if (aBoolean268) {
				@Pc(152) byte local152 = 20;
				@Pc(154) int local154 = 16776960;
				if (super.anInt830 < 30 && aBoolean223) {
					local154 = 16711680;
				}
				if (super.anInt830 < 20 && !aBoolean223) {
					local154 = 16711680;
				}
				this.aClass4_Sub1_Sub2_Sub4_3.method503((byte) 1, 20, "Fps:" + super.anInt830, local154);
				local186 = local152 + 15;
				@Pc(188) Runtime local188 = Runtime.getRuntime();
				@Pc(197) int local197 = (int) ((local188.totalMemory() - local188.freeMemory()) / 1024L);
				if (local197 > 33554432 && aBoolean223) {
				}
				if (local197 > 67108864 && !aBoolean223) {
				}
				this.aClass4_Sub1_Sub2_Sub4_3.method503((byte) 1, 35, "Mem:" + local197 + "k", 16776960);
				local186 += 15;
			}
			if (this.anInt953 != 0) {
				@Pc(238) int local238 = this.anInt953 / 50;
				local186 = local238 / 60;
				@Pc(246) int local246 = local238 % 60;
				if (local246 < 10) {
					this.aClass4_Sub1_Sub2_Sub4_3.method508(16776960, 329, 4, "System update in: " + local186 + ":0" + local246);
				} else {
					this.aClass4_Sub1_Sub2_Sub4_3.method508(16776960, 329, 4, "System update in: " + local186 + ":" + local246);
				}
			}
		} catch (@Pc(288) RuntimeException local288) {
			signlink.reporterror("12334, " + 0 + ", " + local288.toString());
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

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(BZ)V")
	private void method683(@OriginalArg(0) byte arg0, @OriginalArg(1) boolean arg1) {
		try {
			if (aClass4_Sub1_Sub1_Sub2_Sub2_1.anInt764 >> 7 == this.anInt865 && aClass4_Sub1_Sub1_Sub2_Sub2_1.anInt765 >> 7 == this.anInt866) {
				this.anInt865 = 0;
			}
			@Pc(21) int local21 = this.anInt949;
			if (arg1) {
				local21 = 1;
			}
			for (@Pc(27) int local27 = 0; local27 < local21; local27++) {
				@Pc(33) Class4_Sub1_Sub1_Sub2_Sub2 local33;
				@Pc(38) int local38;
				if (arg1) {
					local33 = aClass4_Sub1_Sub1_Sub2_Sub2_1;
					local38 = this.anInt948 << 14;
				} else {
					local33 = this.aClass4_Sub1_Sub1_Sub2_Sub2Array1[this.anIntArray241[local27]];
					local38 = this.anIntArray241[local27] << 14;
				}
				if (local33 != null && local33.method562()) {
					local33.aBoolean202 = false;
					if ((aBoolean223 && this.anInt949 > 50 || this.anInt949 > 200) && !arg1 && local33.anInt752 == local33.anInt787) {
						local33.aBoolean202 = true;
					}
					@Pc(89) int local89 = local33.anInt764 >> 7;
					@Pc(94) int local94 = local33.anInt765 >> 7;
					if (local89 >= 0 && local89 < 104 && local94 >= 0 && local94 < 104) {
						if (local33.aClass4_Sub1_Sub1_Sub4_2 == null || anInt1054 < local33.anInt794 || anInt1054 >= local33.anInt795) {
							if ((local33.anInt764 & 0x7F) == 64 && (local33.anInt765 & 0x7F) == 64) {
								if (this.anIntArrayArray24[local89][local94] == this.anInt858) {
									continue;
								}
								this.anIntArrayArray24[local89][local94] = this.anInt858;
							}
							local33.anInt807 = this.method614(this.anInt895, local33.anInt764, local33.anInt765);
							this.aClass20_1.method234(local33, local33.anInt807, 1000, 60, this.anInt895, local33.aBoolean198, local33.anInt765, local38, local33.anInt764, local33.anInt766);
						} else {
							local33.aBoolean202 = false;
							local33.anInt807 = this.method614(this.anInt895, local33.anInt764, local33.anInt765);
							this.aClass20_1.method235(local33.anInt807, local33.anInt765, local38, local33.anInt804, local33.anInt766, local33.anInt802, this.anInt895, local33.anInt764, local33.anInt803, local33.anInt805, local33);
						}
					}
				}
			}
			@Pc(226) boolean local226 = false;
		} catch (@Pc(234) RuntimeException local234) {
			signlink.reporterror("78348, " + arg0 + ", " + arg1 + ", " + local234.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "A", descriptor = "(I)V")
	private void method684() {
		try {
			while (true) {
				@Pc(11) Class4_Sub1_Sub3 local11 = this.aClass8_Sub1_1.method90();
				if (local11 == null) {
					return;
				}
				if (local11.anInt110 == 0) {
					Class4_Sub1_Sub1_Sub4.method397(local11.anInt111, local11.aByteArray5);
					if ((this.aClass8_Sub1_1.method99(local11.anInt111, aBoolean233) & 0x62) != 0) {
						this.aBoolean246 = true;
						if (this.anInt955 != -1 || this.anInt1075 != -1) {
							this.aBoolean247 = true;
						}
					}
				}
				if (local11.anInt110 == 1 && local11.aByteArray5 != null) {
					Class16.method190(this.aBoolean264, local11.aByteArray5);
				}
				if (local11.anInt110 == 2 && local11.anInt111 == this.anInt925 && local11.aByteArray5 != null) {
					this.method709(local11.aByteArray5, this.aBoolean235, 848);
				}
				if (local11.anInt110 == 3 && this.anInt946 == 1) {
					for (@Pc(87) int local87 = 0; local87 < this.aByteArrayArray6.length; local87++) {
						if (this.anIntArray238[local87] == local11.anInt111) {
							this.aByteArrayArray6[local87] = local11.aByteArray5;
							if (local11.aByteArray5 == null) {
								this.anIntArray238[local87] = -1;
							}
							break;
						}
						if (this.anIntArray239[local87] == local11.anInt111) {
							this.aByteArrayArray5[local87] = local11.aByteArray5;
							if (local11.aByteArray5 == null) {
								this.anIntArray239[local87] = -1;
							}
							break;
						}
					}
				}
				if (local11.anInt110 == 93 && this.aClass8_Sub1_1.method98(this.aBoolean258, local11.anInt111)) {
					Class44.method539((byte) 4, this.aClass8_Sub1_1, new Class4_Sub1_Sub4(5, local11.aByteArray5));
				}
			}
		} catch (@Pc(165) RuntimeException local165) {
			signlink.reporterror("25896, " + 0 + ", " + local165.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(BI)V")
	private void method685(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(4) boolean local4 = false;
			signlink.anInt1085 = arg1;
		} catch (@Pc(13) RuntimeException local13) {
			signlink.reporterror("91257, " + arg0 + ", " + arg1 + ", " + local13.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(IBLclient!PGNBHFUF;)V")
	private void method686(@OriginalArg(0) int arg0, @OriginalArg(2) Class4_Sub1_Sub4 arg1) {
		try {
			this.anInt1045 = 0;
			this.anInt950 = 0;
			this.method589(arg0, arg1);
			this.method669(arg0, arg1);
			this.method642(arg0, arg1);
			this.method601(arg0, arg1);
			@Pc(46) int local46;
			for (@Pc(39) int local39 = 0; local39 < this.anInt1045; local39++) {
				local46 = this.anIntArray270[local39];
				if (this.aClass4_Sub1_Sub1_Sub2_Sub2Array1[local46].anInt782 != anInt1054) {
					this.aClass4_Sub1_Sub1_Sub2_Sub2Array1[local46] = null;
				}
			}
			if (arg1.anInt506 != arg0) {
				signlink.reporterror("Error packet size mismatch in getplayer pos:" + arg1.anInt506 + " psize:" + arg0);
				throw new RuntimeException("eek");
			}
			for (local46 = 0; local46 < this.anInt949; local46++) {
				if (this.aClass4_Sub1_Sub1_Sub2_Sub2Array1[this.anIntArray241[local46]] == null) {
					signlink.reporterror(this.aString20 + " null entry in pl list - pos:" + local46 + " size:" + this.anInt949);
					throw new RuntimeException("eek");
				}
			}
		} catch (@Pc(126) RuntimeException local126) {
			signlink.reporterror("50119, " + arg0 + ", " + -79 + ", " + arg1 + ", " + local126.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "B", descriptor = "(I)V")
	private void method687() {
		try {
			if (this.anInt954 == 2) {
				this.method695((this.anInt979 - this.anInt1056 << 7) + this.anInt982, this.anInt981 * 2, (this.anInt980 - this.anInt1057 << 7) + this.anInt983);
				if (this.anInt883 > -1 && anInt1054 % 20 < 10) {
					this.aClass4_Sub1_Sub2_Sub3Array4[0].method466(this.anInt883 - 12, this.anInt884 - 28);
				}
			}
		} catch (@Pc(61) RuntimeException local61) {
			signlink.reporterror("57805, " + 541 + ", " + local61.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILclient!NPNTBMMX;IIZ)V")
	private void method688(@OriginalArg(0) int arg0, @OriginalArg(1) Class28 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		try {
			if (arg1.anInt447 == 0 && arg1.anIntArray91 != null && (!arg1.aBoolean117 || this.anInt872 == arg1.anInt451 || this.anInt855 == arg1.anInt451 || this.anInt904 == arg1.anInt451)) {
				@Pc(29) int local29 = Class4_Sub1_Sub2.anInt692;
				@Pc(31) int local31 = Class4_Sub1_Sub2.anInt690;
				@Pc(33) int local33 = Class4_Sub1_Sub2.anInt693;
				@Pc(35) int local35 = Class4_Sub1_Sub2.anInt691;
				Class4_Sub1_Sub2.method493(arg2 + arg1.anInt426, arg0, arg2, arg0 + arg1.anInt423);
				@Pc(51) int local51 = arg1.anIntArray91.length;
				for (@Pc(53) int local53 = 0; local53 < local51; local53++) {
					@Pc(62) int local62 = arg1.anIntArray89[local53] + arg2;
					@Pc(71) int local71 = arg1.anIntArray90[local53] + arg0 - arg3;
					@Pc(77) Class28 local77 = Class28.method318(arg1.anIntArray91[local53]);
					@Pc(82) int local82 = local62 + local77.anInt438;
					@Pc(87) int local87 = local71 + local77.anInt430;
					if (local77.anInt458 > 0) {
						this.method619(local77);
					}
					if (local77.anInt447 == 0) {
						if (local77.anInt449 > local77.anInt437 - local77.anInt423) {
							local77.anInt449 = local77.anInt437 - local77.anInt423;
						}
						if (local77.anInt449 < 0) {
							local77.anInt449 = 0;
						}
						this.method688(local87, local77, local82, local77.anInt449);
						if (local77.anInt437 > local77.anInt423) {
							this.method724(local77.anInt437, local77.anInt449, local77.anInt423, local87, local82 + local77.anInt426);
						}
					} else if (local77.anInt447 != 1) {
						@Pc(159) int local159;
						@Pc(163) int local163;
						@Pc(174) int local174;
						@Pc(209) int local209;
						@Pc(216) int local216;
						@Pc(241) int local241;
						@Pc(157) int local157;
						@Pc(207) int local207;
						if (local77.anInt447 == 2) {
							local157 = 0;
							for (local159 = 0; local159 < local77.anInt423; local159++) {
								for (local163 = 0; local163 < local77.anInt426; local163++) {
									local174 = local82 + local163 * (local77.anInt436 + 32);
									@Pc(183) int local183 = local87 + local159 * (local77.anInt427 + 32);
									if (local157 < 20) {
										local174 += local77.anIntArray92[local157];
										local183 += local77.anIntArray88[local157];
									}
									if (local77.anIntArray94[local157] > 0) {
										local207 = 0;
										local209 = 0;
										local216 = local77.anIntArray94[local157] - 1;
										if (local174 > Class4_Sub1_Sub2.anInt692 - 32 && local174 < Class4_Sub1_Sub2.anInt693 && local183 > Class4_Sub1_Sub2.anInt690 - 32 && local183 < Class4_Sub1_Sub2.anInt691 || this.anInt1040 != 0 && this.anInt1039 == local157) {
											local241 = 0;
											if (this.anInt1021 == 1 && this.anInt1022 == local157 && this.anInt1023 == local77.anInt451) {
												local241 = 16777215;
											}
											@Pc(265) Class4_Sub1_Sub2_Sub3 local265 = Class17.method204(local216, local77.anIntArray95[local157], local241);
											if (local265 != null) {
												@Pc(344) int local344;
												if (this.anInt1040 != 0 && this.anInt1039 == local157 && this.anInt1038 == local77.anInt451) {
													local207 = super.anInt835 - this.anInt1041;
													local209 = super.anInt836 - this.anInt1042;
													if (local207 < 5 && local207 > -5) {
														local207 = 0;
													}
													if (local209 < 5 && local209 > -5) {
														local209 = 0;
													}
													if (this.anInt921 < 5) {
														local207 = 0;
														local209 = 0;
													}
													local265.method468(local174 + local207, local183 + local209);
													if (local183 + local209 < Class4_Sub1_Sub2.anInt690 && arg1.anInt449 > 0) {
														local344 = this.anInt1043 * (Class4_Sub1_Sub2.anInt690 - local183 - local209) / 3;
														if (local344 > this.anInt1043 * 10) {
															local344 = this.anInt1043 * 10;
														}
														if (local344 > arg1.anInt449) {
															local344 = arg1.anInt449;
														}
														arg1.anInt449 -= local344;
														this.anInt1042 += local344;
													}
													if (local183 + local209 + 32 > Class4_Sub1_Sub2.anInt691 && arg1.anInt449 < arg1.anInt437 - arg1.anInt423) {
														local344 = this.anInt1043 * (local183 + local209 + 32 - Class4_Sub1_Sub2.anInt691) / 3;
														if (local344 > this.anInt1043 * 10) {
															local344 = this.anInt1043 * 10;
														}
														if (local344 > arg1.anInt437 - arg1.anInt423 - arg1.anInt449) {
															local344 = arg1.anInt437 - arg1.anInt423 - arg1.anInt449;
														}
														arg1.anInt449 += local344;
														this.anInt1042 -= local344;
													}
												} else if (this.anInt1049 != 0 && this.anInt1048 == local157 && this.anInt1047 == local77.anInt451) {
													local265.method468(local174, local183);
												} else {
													local265.method466(local174, local183);
												}
												if (local265.anInt605 == 33 || local77.anIntArray95[local157] != 1) {
													local344 = local77.anIntArray95[local157];
													this.aClass4_Sub1_Sub2_Sub4_2.method508(0, local183 + local209 + 10, local174 + 1 + local207, method661(local344));
													this.aClass4_Sub1_Sub2_Sub4_2.method508(16776960, local183 + local209 + 9, local174 + local207, method661(local344));
												}
											}
										}
									} else if (local77.aClass4_Sub1_Sub2_Sub3Array1 != null && local157 < 20) {
										@Pc(533) Class4_Sub1_Sub2_Sub3 local533 = local77.aClass4_Sub1_Sub2_Sub3Array1[local157];
										if (local533 != null) {
											local533.method466(local174, local183);
										}
									}
									local157++;
								}
							}
						} else if (local77.anInt447 == 3) {
							@Pc(559) boolean local559 = false;
							if (this.anInt904 == local77.anInt451 || this.anInt855 == local77.anInt451 || this.anInt872 == local77.anInt451) {
								local559 = true;
							}
							if (this.method641(local77)) {
								local157 = local77.anInt442;
								if (local559 && local77.anInt429 != 0) {
									local157 = local77.anInt429;
								}
							} else {
								local157 = local77.anInt441;
								if (local559 && local77.anInt435 != 0) {
									local157 = local77.anInt435;
								}
							}
							if (local77.aByte15 == 0) {
								if (local77.aBoolean118) {
									Class4_Sub1_Sub2.method496(local82, local157, local77.anInt426, local77.anInt423, local87);
								} else {
									Class4_Sub1_Sub2.method497(local77.anInt426, local157, local82, local77.anInt423, local87);
								}
							} else if (local77.aBoolean118) {
								Class4_Sub1_Sub2.method495(local157, 256 - (local77.aByte15 & 0xFF), local82, local87, local77.anInt423, local77.anInt426);
							} else {
								Class4_Sub1_Sub2.method498(local77.anInt426, local77.anInt423, local87, local157, local82, 256 - (local77.aByte15 & 0xFF));
							}
						} else {
							@Pc(677) Class4_Sub1_Sub2_Sub4 local677;
							@Pc(954) String local954;
							if (local77.anInt447 == 4) {
								local677 = local77.aClass4_Sub1_Sub2_Sub4_1;
								@Pc(680) String local680 = local77.aString8;
								@Pc(682) boolean local682 = false;
								if (this.anInt904 == local77.anInt451 || this.anInt855 == local77.anInt451 || this.anInt872 == local77.anInt451) {
									local682 = true;
								}
								if (this.method641(local77)) {
									local159 = local77.anInt442;
									if (local682 && local77.anInt429 != 0) {
										local159 = local77.anInt429;
									}
									if (local77.aString9.length() > 0) {
										local680 = local77.aString9;
									}
								} else {
									local159 = local77.anInt441;
									if (local682 && local77.anInt435 != 0) {
										local159 = local77.anInt435;
									}
								}
								if (local77.anInt459 == 6 && this.aBoolean256) {
									local680 = "Please wait...";
									local159 = local77.anInt441;
								}
								if (Class4_Sub1_Sub2.anInt688 == 479) {
									if (local159 == 16776960) {
										local159 = 255;
									}
									if (local159 == 49152) {
										local159 = 16777215;
									}
								}
								local207 = local87 + local677.anInt699;
								while (local680.length() > 0) {
									if (local680.indexOf("%") != -1) {
										label390: while (true) {
											local209 = local680.indexOf("%1");
											if (local209 == -1) {
												while (true) {
													local209 = local680.indexOf("%2");
													if (local209 == -1) {
														while (true) {
															local209 = local680.indexOf("%3");
															if (local209 == -1) {
																while (true) {
																	local209 = local680.indexOf("%4");
																	if (local209 == -1) {
																		while (true) {
																			local209 = local680.indexOf("%5");
																			if (local209 == -1) {
																				break label390;
																			}
																			local680 = local680.substring(0, local209) + this.method659(this.method639(local77, 4)) + local680.substring(local209 + 2);
																		}
																	}
																	local680 = local680.substring(0, local209) + this.method659(this.method639(local77, 3)) + local680.substring(local209 + 2);
																}
															}
															local680 = local680.substring(0, local209) + this.method659(this.method639(local77, 2)) + local680.substring(local209 + 2);
														}
													}
													local680 = local680.substring(0, local209) + this.method659(this.method639(local77, 1)) + local680.substring(local209 + 2);
												}
											}
											local680 = local680.substring(0, local209) + this.method659(this.method639(local77, 0)) + local680.substring(local209 + 2);
										}
									}
									local209 = local680.indexOf("\\n");
									if (local209 == -1) {
										local954 = local680;
										local680 = "";
									} else {
										local954 = local680.substring(0, local209);
										local680 = local680.substring(local209 + 2);
									}
									if (local77.aBoolean116) {
										local677.method505(local954, local159, local77.aBoolean110, local207, local82 + local77.anInt426 / 2);
									} else {
										local677.method512(local207, local159, 817, local82, local77.aBoolean110, local954);
									}
									local207 += local677.anInt699;
								}
							} else if (local77.anInt447 == 5) {
								@Pc(1016) Class4_Sub1_Sub2_Sub3 local1016;
								if (this.method641(local77)) {
									local1016 = local77.aClass4_Sub1_Sub2_Sub3_1;
								} else {
									local1016 = local77.aClass4_Sub1_Sub2_Sub3_2;
								}
								if (local1016 != null) {
									local1016.method466(local82, local87);
								}
							} else if (local77.anInt447 == 6) {
								local157 = Class4_Sub1_Sub2_Sub1.anInt103;
								local159 = Class4_Sub1_Sub2_Sub1.anInt104;
								Class4_Sub1_Sub2_Sub1.anInt103 = local82 + local77.anInt426 / 2;
								Class4_Sub1_Sub2_Sub1.anInt104 = local87 + local77.anInt423 / 2;
								local163 = Class4_Sub1_Sub2_Sub1.anIntArray25[local77.anInt455] * local77.anInt454 >> 16;
								local174 = Class4_Sub1_Sub2_Sub1.anIntArray26[local77.anInt455] * local77.anInt454 >> 16;
								@Pc(1077) boolean local1077 = this.method641(local77);
								if (local1077) {
									local207 = local77.anInt425;
								} else {
									local207 = local77.anInt424;
								}
								@Pc(1097) Class4_Sub1_Sub1_Sub4 local1097;
								if (local207 == -1) {
									local1097 = local77.method324(local1077, -1, -1);
								} else {
									@Pc(1103) Class21 local1103 = Class21.aClass21Array1[local207];
									local1097 = local77.method324(local1077, local1103.anIntArray69[local77.anInt440], local1103.anIntArray70[local77.anInt440]);
								}
								if (local1097 != null) {
									local1097.method420(local77.anInt456, 0, local77.anInt455, 0, local163, local174);
								}
								Class4_Sub1_Sub2_Sub1.anInt103 = local157;
								Class4_Sub1_Sub2_Sub1.anInt104 = local159;
							} else {
								if (local77.anInt447 == 7) {
									local677 = local77.aClass4_Sub1_Sub2_Sub4_1;
									local159 = 0;
									for (local163 = 0; local163 < local77.anInt423; local163++) {
										for (local174 = 0; local174 < local77.anInt426; local174++) {
											if (local77.anIntArray94[local159] > 0) {
												@Pc(1167) Class17 local1167 = Class17.method196(local77.anIntArray94[local159] - 1);
												@Pc(1170) String local1170 = local1167.aString6;
												if (local1167.aBoolean84 || local77.anIntArray95[local159] != 1) {
													local1170 = local1170 + " x" + method699(local77.anIntArray95[local159]);
												}
												local209 = local82 + local174 * (local77.anInt436 + 115);
												local216 = local87 + local163 * (local77.anInt427 + 12);
												if (local77.aBoolean116) {
													local677.method505(local1170, local77.anInt441, local77.aBoolean110, local216, local209 + local77.anInt426 / 2);
												} else {
													local677.method512(local216, local77.anInt441, 817, local209, local77.aBoolean110, local1170);
												}
											}
											local159++;
										}
									}
								}
								if (local77.anInt447 == 8 && (this.anInt937 == local77.anInt451 || this.anInt940 == local77.anInt451 || this.anInt952 == local77.anInt451) && this.anInt993 == 100) {
									local157 = 0;
									local159 = 0;
									@Pc(1284) Class4_Sub1_Sub2_Sub4 local1284 = this.aClass4_Sub1_Sub2_Sub4_3;
									@Pc(1287) String local1287 = local77.aString8;
									while (local1287.length() > 0) {
										local207 = local1287.indexOf("\\n");
										if (local207 == -1) {
											local954 = local1287;
											local1287 = "";
										} else {
											local954 = local1287.substring(0, local207);
											local1287 = local1287.substring(local207 + 2);
										}
										local209 = local1284.method506(local954);
										if (local209 > local157) {
											local157 = local209;
										}
										local159 += local1284.anInt699 + 1;
									}
									local157 += 6;
									local159 += 7;
									local207 = local82 + local77.anInt426 - local157 - 5;
									local209 = local87 + local77.anInt423 + 5;
									if (local207 < local82 + 5) {
										local207 = local82 + 5;
									}
									if (local207 + local157 > arg2 + arg1.anInt426) {
										local207 = arg2 + arg1.anInt426 - local157;
									}
									if (local209 + local159 > arg0 + arg1.anInt423) {
										local209 = arg0 + arg1.anInt423 - local159;
									}
									Class4_Sub1_Sub2.method496(local207, 16777120, local157, local159, local209);
									Class4_Sub1_Sub2.method497(local157, 0, local207, local159, local209);
									local1287 = local77.aString8;
									local216 = local209 + local1284.anInt699 + 2;
									while (local1287.length() > 0) {
										local241 = local1287.indexOf("\\n");
										if (local241 == -1) {
											local954 = local1287;
											local1287 = "";
										} else {
											local954 = local1287.substring(0, local241);
											local1287 = local1287.substring(local241 + 2);
										}
										local1284.method512(local216, 0, 817, local207 + 3, false, local954);
										local216 += local1284.anInt699 + 1;
									}
								}
							}
						}
					}
				}
				Class4_Sub1_Sub2.method493(local33, local31, local29, local35);
			}
		} catch (@Pc(1476) RuntimeException local1476) {
			signlink.reporterror("82013, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + false + ", " + local1476.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Ljava/lang/String;)Ljava/io/DataInputStream;")
	private DataInputStream method689(@OriginalArg(0) String arg0) throws IOException {
		if (this.aBoolean245) {
			if (this.aSocket3 != null) {
				try {
					this.aSocket3.close();
				} catch (@Pc(26) Exception local26) {
				}
				this.aSocket3 = null;
			}
			this.aSocket3 = this.method716(43595);
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
	private void method690(@OriginalArg(0) long arg0) {
		try {
			if (arg0 != 0L) {
				if (this.anInt957 >= 100 && this.anInt920 != 1) {
					this.method588((byte) 8, 0, "", "Your friendlist is full. Max of 100 for free users, and 200 for members");
				} else if (this.anInt957 >= 200) {
					this.method588((byte) 8, 0, "", "Your friendlist is full. Max of 100 for free users, and 200 for members");
				} else {
					@Pc(38) String local38 = Class47.method554(Class47.method551(arg0));
					for (@Pc(40) int local40 = 0; local40 < this.anInt957; local40++) {
						if (this.aLongArray4[local40] == arg0) {
							this.method588((byte) 8, 0, "", local38 + " is already on your friend list");
							return;
						}
					}
					for (@Pc(70) int local70 = 0; local70 < this.anInt848; local70++) {
						if (this.aLongArray3[local70] == arg0) {
							this.method588((byte) 8, 0, "", "Please remove " + local38 + " from your ignore list first");
							return;
						}
					}
					if (!local38.equals(aClass4_Sub1_Sub1_Sub2_Sub2_1.aString15)) {
						this.aStringArray11[this.anInt957] = local38;
						this.aLongArray4[this.anInt957] = arg0;
						this.anIntArray235[this.anInt957] = 0;
						this.anInt957++;
						this.aBoolean246 = true;
						this.aClass4_Sub1_Sub4_7.method344(221);
						this.aClass4_Sub1_Sub4_7.method351(arg0);
					}
				}
			}
		} catch (@Pc(153) RuntimeException local153) {
			signlink.reporterror("16687, " + arg0 + ", " + true + ", " + local153.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "n", descriptor = "(Z)V")
	private void method691() {
		try {
			System.out.println("============");
			System.out.println("flame-cycle:" + this.anInt1012);
			if (this.aClass8_Sub1_1 != null) {
				System.out.println("Od-cycle:" + this.aClass8_Sub1_1.anInt76);
			}
			System.out.println("loop-cycle:" + anInt1054);
			System.out.println("draw-cycle:" + anInt896);
			System.out.println("ptype:" + this.anInt860);
			System.out.println("psize:" + this.anInt859);
			if (this.aClass15_1 != null) {
				this.aClass15_1.method188();
			}
			super.aBoolean212 = true;
		} catch (@Pc(81) RuntimeException local81) {
			signlink.reporterror("10849, " + false + ", " + local81.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Z)Ljava/awt/Component;")
	@Override
	protected Component method583() {
		try {
			if (signlink.mainapp == null) {
				return super.aFrame_Sub1_2 == null ? this : super.aFrame_Sub1_2;
			} else {
				return signlink.mainapp;
			}
		} catch (@Pc(18) RuntimeException local18) {
			signlink.reporterror("46737, " + false + ", " + local18.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(IZ)V")
	private void method692(@OriginalArg(0) int arg0) {
		try {
			if (arg0 >= 0) {
				@Pc(9) int local9 = this.anIntArray251[arg0];
				@Pc(14) int local14 = this.anIntArray252[arg0];
				@Pc(19) int local19 = this.anIntArray253[arg0];
				@Pc(24) int local24 = this.anIntArray254[arg0];
				if (local19 >= 2000) {
					local19 -= 2000;
				}
				if (this.anInt996 != 0 && local19 != 1961) {
					this.anInt996 = 0;
					this.aBoolean247 = true;
				}
				if (local19 == 177) {
					this.aClass4_Sub1_Sub4_7.method344(181);
					this.aClass4_Sub1_Sub4_7.method346(local24);
					this.aClass4_Sub1_Sub4_7.method380(local9);
					this.aClass4_Sub1_Sub4_7.method379(local14);
					this.anInt1046 = 0;
					this.anInt1047 = local14;
					this.anInt1048 = local9;
					this.anInt1049 = 2;
					if (Class28.method318(local14).anInt443 == this.anInt951) {
						this.anInt1049 = 1;
					}
					if (Class28.method318(local14).anInt443 == this.anInt955) {
						this.anInt1049 = 3;
					}
				}
				if (local19 == 716) {
					this.method617(local14, local24, local9);
					this.aClass4_Sub1_Sub4_7.method344(3);
					this.aClass4_Sub1_Sub4_7.method380(local14 + this.anInt1057);
					this.aClass4_Sub1_Sub4_7.method380(local24 >> 14 & 0x7FFF);
					this.aClass4_Sub1_Sub4_7.method379(local9 + this.anInt1056);
				}
				if (local19 == 537) {
					this.aClass4_Sub1_Sub4_7.method344(51);
					this.aClass4_Sub1_Sub4_7.method379(local14);
					this.aClass4_Sub1_Sub4_7.method380(local24);
					this.aClass4_Sub1_Sub4_7.method346(local9);
					this.anInt1046 = 0;
					this.anInt1047 = local14;
					this.anInt1048 = local9;
					this.anInt1049 = 2;
					if (Class28.method318(local14).anInt443 == this.anInt951) {
						this.anInt1049 = 1;
					}
					if (Class28.method318(local14).anInt443 == this.anInt955) {
						this.anInt1049 = 3;
					}
				}
				if (local19 == 996) {
					this.aClass4_Sub1_Sub4_7.method344(224);
					this.aClass4_Sub1_Sub4_7.method378(local24);
					this.aClass4_Sub1_Sub4_7.method378(local9);
					this.aClass4_Sub1_Sub4_7.method346(local14);
					this.anInt1046 = 0;
					this.anInt1047 = local14;
					this.anInt1048 = local9;
					this.anInt1049 = 2;
					if (Class28.method318(local14).anInt443 == this.anInt951) {
						this.anInt1049 = 1;
					}
					if (Class28.method318(local14).anInt443 == this.anInt955) {
						this.anInt1049 = 3;
					}
				}
				@Pc(242) Class28 local242;
				@Pc(276) String local276;
				@Pc(261) String local261;
				if (local19 == 444) {
					local242 = Class28.method318(local14);
					this.anInt1067 = 1;
					this.anInt1068 = local14;
					this.anInt1069 = local242.anInt450;
					this.anInt1021 = 0;
					this.aBoolean246 = true;
					local261 = local242.aString7;
					if (local261.indexOf(" ") != -1) {
						local261 = local261.substring(0, local261.indexOf(" "));
					}
					local276 = local242.aString7;
					if (local276.indexOf(" ") != -1) {
						local276 = local276.substring(local276.indexOf(" ") + 1);
					}
					this.aString31 = local261 + " " + local242.aString11 + " " + local276;
					if (this.anInt1069 == 16) {
						this.aBoolean246 = true;
						this.anInt994 = 3;
						this.aBoolean254 = true;
					}
				} else {
					if (local19 == 208) {
						local242 = Class28.method318(local14);
						@Pc(328) boolean local328 = true;
						if (local242.anInt458 > 0) {
							local328 = this.method652(local242);
						}
						if (local328) {
							this.aClass4_Sub1_Sub4_7.method344(75);
							this.aClass4_Sub1_Sub4_7.method346(local14);
						}
					}
					@Pc(379) long local379;
					@Pc(364) String local364;
					@Pc(368) int local368;
					if (local19 == 201 || local19 == 370 || local19 == 761 || local19 == 629) {
						local364 = this.aStringArray12[arg0];
						local368 = local364.indexOf("@whi@");
						if (local368 != -1) {
							local379 = Class47.method550(local364.substring(local368 + 5).trim());
							if (local19 == 201) {
								this.method690(local379);
							}
							if (local19 == 370) {
								this.method649(local379);
							}
							if (local19 == 761) {
								this.method677(local379);
							}
							if (local19 == 629) {
								this.method618(this.aBoolean238, local379);
							}
						}
					}
					@Pc(416) Class4_Sub1_Sub1_Sub2_Sub2 local416;
					if (local19 == 525) {
						local416 = this.aClass4_Sub1_Sub1_Sub2_Sub2Array1[local24];
						if (local416 != null) {
							this.method671(false, 1, local416.anIntArray188[0], aClass4_Sub1_Sub1_Sub2_Sub2_1.anIntArray187[0], aClass4_Sub1_Sub1_Sub2_Sub2_1.anIntArray188[0], 1, 2, 0, local416.anIntArray187[0], 0, 0, 566);
							this.anInt1070 = super.anInt841;
							this.anInt1071 = super.anInt842;
							this.anInt1073 = 2;
							this.anInt1072 = 0;
							anInt1035 += local24;
							if (anInt1035 >= 77) {
								this.aClass4_Sub1_Sub4_7.method344(42);
								this.aClass4_Sub1_Sub4_7.method349(0);
								anInt1035 = 0;
							}
							this.aClass4_Sub1_Sub4_7.method344(84);
							this.aClass4_Sub1_Sub4_7.method379(local24);
						}
					}
					if (local19 == 73) {
						this.aClass4_Sub1_Sub4_7.method344(95);
						this.aClass4_Sub1_Sub4_7.method346(local9);
						this.aClass4_Sub1_Sub4_7.method379(local24);
						this.aClass4_Sub1_Sub4_7.method346(local14);
						this.anInt1046 = 0;
						this.anInt1047 = local14;
						this.anInt1048 = local9;
						this.anInt1049 = 2;
						if (Class28.method318(local14).anInt443 == this.anInt951) {
							this.anInt1049 = 1;
						}
						if (Class28.method318(local14).anInt443 == this.anInt955) {
							this.anInt1049 = 3;
						}
					}
					if (local19 == 284 && !this.aBoolean256) {
						this.aClass4_Sub1_Sub4_7.method344(20);
						this.aClass4_Sub1_Sub4_7.method346(local14);
						this.aBoolean256 = true;
					}
					if (local19 == 1660) {
						anInt934++;
						if (anInt934 >= 146) {
							this.aClass4_Sub1_Sub4_7.method344(96);
							this.aClass4_Sub1_Sub4_7.method348(5011685);
							anInt934 = 0;
						}
						this.method617(local14, local24, local9);
						this.aClass4_Sub1_Sub4_7.method344(64);
						this.aClass4_Sub1_Sub4_7.method380(local14 + this.anInt1057);
						this.aClass4_Sub1_Sub4_7.method379(local9 + this.anInt1056);
						this.aClass4_Sub1_Sub4_7.method379(local24 >> 14 & 0x7FFF);
					}
					@Pc(638) boolean local638;
					if (local19 == 994) {
						local638 = this.method671(false, 0, local14, aClass4_Sub1_Sub1_Sub2_Sub2_1.anIntArray187[0], aClass4_Sub1_Sub1_Sub2_Sub2_1.anIntArray188[0], 0, 2, 0, local9, 0, 0, 566);
						if (!local638) {
							this.method671(false, 1, local14, aClass4_Sub1_Sub1_Sub2_Sub2_1.anIntArray187[0], aClass4_Sub1_Sub1_Sub2_Sub2_1.anIntArray188[0], 1, 2, 0, local9, 0, 0, 566);
						}
						this.anInt1070 = super.anInt841;
						this.anInt1071 = super.anInt842;
						this.anInt1073 = 2;
						this.anInt1072 = 0;
						this.aClass4_Sub1_Sub4_7.method344(142);
						this.aClass4_Sub1_Sub4_7.method379(this.anInt1068);
						this.aClass4_Sub1_Sub4_7.method380(local24);
						this.aClass4_Sub1_Sub4_7.method379(local14 + this.anInt1057);
						this.aClass4_Sub1_Sub4_7.method346(local9 + this.anInt1056);
					}
					if (local19 == 178) {
						this.method715(aByte32, this.anInt1075);
						this.anInt1075 = -1;
						this.aBoolean247 = true;
					}
					if (local19 == 479) {
						local416 = this.aClass4_Sub1_Sub1_Sub2_Sub2Array1[local24];
						if (local416 != null) {
							this.method671(false, 1, local416.anIntArray188[0], aClass4_Sub1_Sub1_Sub2_Sub2_1.anIntArray187[0], aClass4_Sub1_Sub1_Sub2_Sub2_1.anIntArray188[0], 1, 2, 0, local416.anIntArray187[0], 0, 0, 566);
							this.anInt1070 = super.anInt841;
							this.anInt1071 = super.anInt842;
							this.anInt1073 = 2;
							this.anInt1072 = 0;
							anInt893++;
							if (anInt893 >= 135) {
								this.aClass4_Sub1_Sub4_7.method344(220);
								this.aClass4_Sub1_Sub4_7.method346(7858);
								anInt893 = 0;
							}
							this.aClass4_Sub1_Sub4_7.method344(8);
							this.aClass4_Sub1_Sub4_7.method378(local24);
						}
					}
					@Pc(807) Class4_Sub1_Sub1_Sub2_Sub1 local807;
					if (local19 == 1317) {
						local807 = this.aClass4_Sub1_Sub1_Sub2_Sub1Array1[local24];
						if (local807 != null) {
							@Pc(812) Class40 local812 = local807.aClass40_1;
							if (local812.anIntArray155 != null) {
								local812 = local812.method482((byte) 3);
							}
							if (local812 != null) {
								if (local812.aByteArray14 == null) {
									local276 = "It's a " + local812.aString13 + ".";
								} else {
									local276 = new String(local812.aByteArray14);
								}
								this.method588((byte) 8, 0, "", local276);
							}
						}
					}
					if (local19 == 821) {
						local638 = this.method671(false, 0, local14, aClass4_Sub1_Sub1_Sub2_Sub2_1.anIntArray187[0], aClass4_Sub1_Sub1_Sub2_Sub2_1.anIntArray188[0], 0, 2, 0, local9, 0, 0, 566);
						if (!local638) {
							this.method671(false, 1, local14, aClass4_Sub1_Sub1_Sub2_Sub2_1.anIntArray187[0], aClass4_Sub1_Sub1_Sub2_Sub2_1.anIntArray188[0], 1, 2, 0, local9, 0, 0, 566);
						}
						this.anInt1070 = super.anInt841;
						this.anInt1071 = super.anInt842;
						this.anInt1073 = 2;
						this.anInt1072 = 0;
						this.aClass4_Sub1_Sub4_7.method344(174);
						this.aClass4_Sub1_Sub4_7.method379(local9 + this.anInt1056);
						this.aClass4_Sub1_Sub4_7.method378(local14 + this.anInt1057);
						this.aClass4_Sub1_Sub4_7.method346(local24);
					}
					if (local19 == 664) {
						this.aClass4_Sub1_Sub4_7.method344(107);
						this.aClass4_Sub1_Sub4_7.method378(local24);
						this.aClass4_Sub1_Sub4_7.method379(local14);
						this.aClass4_Sub1_Sub4_7.method380(local9);
						this.anInt1046 = 0;
						this.anInt1047 = local14;
						this.anInt1048 = local9;
						this.anInt1049 = 2;
						if (Class28.method318(local14).anInt443 == this.anInt951) {
							this.anInt1049 = 1;
						}
						if (Class28.method318(local14).anInt443 == this.anInt955) {
							this.anInt1049 = 3;
						}
					}
					if (local19 == 668 && this.method617(local14, local24, local9)) {
						this.aClass4_Sub1_Sub4_7.method344(198);
						this.aClass4_Sub1_Sub4_7.method379(local24 >> 14 & 0x7FFF);
						this.aClass4_Sub1_Sub4_7.method380(local9 + this.anInt1056);
						this.aClass4_Sub1_Sub4_7.method346(local14 + this.anInt1057);
						this.aClass4_Sub1_Sub4_7.method346(this.anInt1068);
					}
					if (local19 == 206) {
						this.aClass4_Sub1_Sub4_7.method344(141);
						this.aClass4_Sub1_Sub4_7.method378(local24);
						this.aClass4_Sub1_Sub4_7.method380(local14);
						this.aClass4_Sub1_Sub4_7.method379(local9);
						this.aClass4_Sub1_Sub4_7.method346(this.anInt1068);
						this.anInt1046 = 0;
						this.anInt1047 = local14;
						this.anInt1048 = local9;
						this.anInt1049 = 2;
						if (Class28.method318(local14).anInt443 == this.anInt951) {
							this.anInt1049 = 1;
						}
						if (Class28.method318(local14).anInt443 == this.anInt955) {
							this.anInt1049 = 3;
						}
					}
					if (local19 == 839) {
						if ((local24 & 0x3) == 0) {
							anInt923++;
						}
						if (anInt923 >= 71) {
							this.aClass4_Sub1_Sub4_7.method344(57);
							this.aClass4_Sub1_Sub4_7.method349(0);
							anInt923 = 0;
						}
						this.aClass4_Sub1_Sub4_7.method344(165);
						this.aClass4_Sub1_Sub4_7.method346(local24);
						this.aClass4_Sub1_Sub4_7.method379(local9);
						this.aClass4_Sub1_Sub4_7.method346(local14);
						this.anInt1046 = 0;
						this.anInt1047 = local14;
						this.anInt1048 = local9;
						this.anInt1049 = 2;
						if (Class28.method318(local14).anInt443 == this.anInt951) {
							this.anInt1049 = 1;
						}
						if (Class28.method318(local14).anInt443 == this.anInt955) {
							this.anInt1049 = 3;
						}
					}
					if (local19 == 31) {
						local364 = this.aStringArray12[arg0];
						local368 = local364.indexOf("@whi@");
						if (local368 != -1) {
							if (this.anInt951 == -1) {
								this.method721();
								this.aString17 = local364.substring(local368 + 5).trim();
								this.aBoolean262 = false;
								this.anInt999 = this.anInt951 = Class28.anInt439;
							} else {
								this.method588((byte) 8, 0, "", "Please close the interface you have open before using 'report abuse'");
							}
						}
					}
					if (local19 == 572) {
						local416 = this.aClass4_Sub1_Sub1_Sub2_Sub2Array1[local24];
						if (local416 != null) {
							this.method671(false, 1, local416.anIntArray188[0], aClass4_Sub1_Sub1_Sub2_Sub2_1.anIntArray187[0], aClass4_Sub1_Sub1_Sub2_Sub2_1.anIntArray188[0], 1, 2, 0, local416.anIntArray187[0], 0, 0, 566);
							this.anInt1070 = super.anInt841;
							this.anInt1071 = super.anInt842;
							this.anInt1073 = 2;
							this.anInt1072 = 0;
							this.aClass4_Sub1_Sub4_7.method344(130);
							this.aClass4_Sub1_Sub4_7.method346(local24);
						}
					}
					if (local19 == 567) {
						local638 = this.method671(false, 0, local14, aClass4_Sub1_Sub1_Sub2_Sub2_1.anIntArray187[0], aClass4_Sub1_Sub1_Sub2_Sub2_1.anIntArray188[0], 0, 2, 0, local9, 0, 0, 566);
						if (!local638) {
							this.method671(false, 1, local14, aClass4_Sub1_Sub1_Sub2_Sub2_1.anIntArray187[0], aClass4_Sub1_Sub1_Sub2_Sub2_1.anIntArray188[0], 1, 2, 0, local9, 0, 0, 566);
						}
						this.anInt1070 = super.anInt841;
						this.anInt1071 = super.anInt842;
						this.anInt1073 = 2;
						this.anInt1072 = 0;
						this.aClass4_Sub1_Sub4_7.method344(34);
						this.aClass4_Sub1_Sub4_7.method346(this.anInt1024);
						this.aClass4_Sub1_Sub4_7.method378(local24);
						this.aClass4_Sub1_Sub4_7.method379(local9 + this.anInt1056);
						this.aClass4_Sub1_Sub4_7.method380(local14 + this.anInt1057);
						this.aClass4_Sub1_Sub4_7.method380(this.anInt1023);
						this.aClass4_Sub1_Sub4_7.method378(this.anInt1022);
					}
					if (local19 == 358) {
						anInt869++;
						if (anInt869 >= 73) {
							this.aClass4_Sub1_Sub4_7.method344(27);
							this.aClass4_Sub1_Sub4_7.method349(0);
							anInt869 = 0;
						}
						this.aClass4_Sub1_Sub4_7.method344(118);
						this.aClass4_Sub1_Sub4_7.method378(local24);
						this.aClass4_Sub1_Sub4_7.method380(local9);
						this.aClass4_Sub1_Sub4_7.method380(local14);
						this.anInt1046 = 0;
						this.anInt1047 = local14;
						this.anInt1048 = local9;
						this.anInt1049 = 2;
						if (Class28.method318(local14).anInt443 == this.anInt951) {
							this.anInt1049 = 1;
						}
						if (Class28.method318(local14).anInt443 == this.anInt955) {
							this.anInt1049 = 3;
						}
					}
					@Pc(1481) int local1481;
					if (local19 == 88 || local19 == 892) {
						local364 = this.aStringArray12[arg0];
						local368 = local364.indexOf("@whi@");
						if (local368 != -1) {
							local364 = local364.substring(local368 + 5).trim();
							local276 = Class47.method554(Class47.method551(Class47.method550(local364)));
							@Pc(1479) boolean local1479 = false;
							for (local1481 = 0; local1481 < this.anInt949; local1481++) {
								@Pc(1491) Class4_Sub1_Sub1_Sub2_Sub2 local1491 = this.aClass4_Sub1_Sub1_Sub2_Sub2Array1[this.anIntArray241[local1481]];
								if (local1491 != null && local1491.aString15 != null && local1491.aString15.equalsIgnoreCase(local276)) {
									this.method671(false, 1, local1491.anIntArray188[0], aClass4_Sub1_Sub1_Sub2_Sub2_1.anIntArray187[0], aClass4_Sub1_Sub1_Sub2_Sub2_1.anIntArray188[0], 1, 2, 0, local1491.anIntArray187[0], 0, 0, 566);
									if (local19 == 88) {
										anInt1035 += local24;
										if (anInt1035 >= 77) {
											this.aClass4_Sub1_Sub4_7.method344(42);
											this.aClass4_Sub1_Sub4_7.method349(0);
											anInt1035 = 0;
										}
										this.aClass4_Sub1_Sub4_7.method344(84);
										this.aClass4_Sub1_Sub4_7.method379(this.anIntArray241[local1481]);
									}
									if (local19 == 892) {
										this.aClass4_Sub1_Sub4_7.method344(161);
										this.aClass4_Sub1_Sub4_7.method380(this.anIntArray241[local1481]);
									}
									local1479 = true;
									break;
								}
							}
							if (!local1479) {
								this.method588((byte) 8, 0, "", "Unable to find " + local276);
							}
						}
					}
					if (local19 == 71) {
						local807 = this.aClass4_Sub1_Sub1_Sub2_Sub1Array1[local24];
						if (local807 != null) {
							this.method671(false, 1, local807.anIntArray188[0], aClass4_Sub1_Sub1_Sub2_Sub2_1.anIntArray187[0], aClass4_Sub1_Sub1_Sub2_Sub2_1.anIntArray188[0], 1, 2, 0, local807.anIntArray187[0], 0, 0, 566);
							this.anInt1070 = super.anInt841;
							this.anInt1071 = super.anInt842;
							this.anInt1073 = 2;
							this.anInt1072 = 0;
							this.aClass4_Sub1_Sub4_7.method344(48);
							this.aClass4_Sub1_Sub4_7.method379(local24);
						}
					}
					if (local19 == 635) {
						local638 = this.method671(false, 0, local14, aClass4_Sub1_Sub1_Sub2_Sub2_1.anIntArray187[0], aClass4_Sub1_Sub1_Sub2_Sub2_1.anIntArray188[0], 0, 2, 0, local9, 0, 0, 566);
						if (!local638) {
							this.method671(false, 1, local14, aClass4_Sub1_Sub1_Sub2_Sub2_1.anIntArray187[0], aClass4_Sub1_Sub1_Sub2_Sub2_1.anIntArray188[0], 1, 2, 0, local9, 0, 0, 566);
						}
						this.anInt1070 = super.anInt841;
						this.anInt1071 = super.anInt842;
						this.anInt1073 = 2;
						this.anInt1072 = 0;
						this.aClass4_Sub1_Sub4_7.method344(86);
						this.aClass4_Sub1_Sub4_7.method380(local9 + this.anInt1056);
						this.aClass4_Sub1_Sub4_7.method380(local24);
						this.aClass4_Sub1_Sub4_7.method378(local14 + this.anInt1057);
					}
					if (local19 == 8) {
						local416 = this.aClass4_Sub1_Sub1_Sub2_Sub2Array1[local24];
						if (local416 != null) {
							this.method671(false, 1, local416.anIntArray188[0], aClass4_Sub1_Sub1_Sub2_Sub2_1.anIntArray187[0], aClass4_Sub1_Sub1_Sub2_Sub2_1.anIntArray188[0], 1, 2, 0, local416.anIntArray187[0], 0, 0, 566);
							this.anInt1070 = super.anInt841;
							this.anInt1071 = super.anInt842;
							this.anInt1073 = 2;
							this.anInt1072 = 0;
							this.aClass4_Sub1_Sub4_7.method344(219);
							this.aClass4_Sub1_Sub4_7.method378(this.anInt1068);
							this.aClass4_Sub1_Sub4_7.method378(local24);
						}
					}
					if (local19 == 709) {
						if (this.aBoolean228) {
							this.aClass20_1.method261((byte) 5, local14 - 4, local9 - 4);
						} else {
							this.aClass20_1.method261((byte) 5, super.anInt842 - 4, super.anInt841 - 4);
						}
					}
					if (local19 == 330) {
						local638 = this.method671(false, 0, local14, aClass4_Sub1_Sub1_Sub2_Sub2_1.anIntArray187[0], aClass4_Sub1_Sub1_Sub2_Sub2_1.anIntArray188[0], 0, 2, 0, local9, 0, 0, 566);
						if (!local638) {
							this.method671(false, 1, local14, aClass4_Sub1_Sub1_Sub2_Sub2_1.anIntArray187[0], aClass4_Sub1_Sub1_Sub2_Sub2_1.anIntArray188[0], 1, 2, 0, local9, 0, 0, 566);
						}
						this.anInt1070 = super.anInt841;
						this.anInt1071 = super.anInt842;
						this.anInt1073 = 2;
						this.anInt1072 = 0;
						anInt918 += this.anInt1057;
						if (anInt918 >= 52) {
							this.aClass4_Sub1_Sub4_7.method344(179);
							anInt918 = 0;
						}
						this.aClass4_Sub1_Sub4_7.method344(190);
						this.aClass4_Sub1_Sub4_7.method380(local24);
						this.aClass4_Sub1_Sub4_7.method379(local9 + this.anInt1056);
						this.aClass4_Sub1_Sub4_7.method379(local14 + this.anInt1057);
					}
					if (local19 == 642 && this.method617(local14, local24, local9)) {
						this.aClass4_Sub1_Sub4_7.method344(114);
						this.aClass4_Sub1_Sub4_7.method378(this.anInt1024);
						this.aClass4_Sub1_Sub4_7.method378(local14 + this.anInt1057);
						this.aClass4_Sub1_Sub4_7.method379(local9 + this.anInt1056);
						this.aClass4_Sub1_Sub4_7.method346(this.anInt1023);
						this.aClass4_Sub1_Sub4_7.method380(this.anInt1022);
						this.aClass4_Sub1_Sub4_7.method378(local24 >> 14 & 0x7FFF);
					}
					if (local19 == 777) {
						local807 = this.aClass4_Sub1_Sub1_Sub2_Sub1Array1[local24];
						if (local807 != null) {
							this.method671(false, 1, local807.anIntArray188[0], aClass4_Sub1_Sub1_Sub2_Sub2_1.anIntArray187[0], aClass4_Sub1_Sub1_Sub2_Sub2_1.anIntArray188[0], 1, 2, 0, local807.anIntArray187[0], 0, 0, 566);
							this.anInt1070 = super.anInt841;
							this.anInt1071 = super.anInt842;
							this.anInt1073 = 2;
							this.anInt1072 = 0;
							anInt926++;
							if (anInt926 >= 120) {
								this.aClass4_Sub1_Sub4_7.method344(97);
								this.aClass4_Sub1_Sub4_7.method348(1835137);
								anInt926 = 0;
							}
							this.aClass4_Sub1_Sub4_7.method344(92);
							this.aClass4_Sub1_Sub4_7.method379(local24);
						}
					}
					if (local19 == 885) {
						if ((local24 & 0x3) == 0) {
							anInt976++;
						}
						if (anInt976 >= 98) {
							this.aClass4_Sub1_Sub4_7.method344(170);
							this.aClass4_Sub1_Sub4_7.method349(0);
							anInt976 = 0;
						}
						this.method617(local14, local24, local9);
						this.aClass4_Sub1_Sub4_7.method344(37);
						this.aClass4_Sub1_Sub4_7.method378(local14 + this.anInt1057);
						this.aClass4_Sub1_Sub4_7.method378(local9 + this.anInt1056);
						this.aClass4_Sub1_Sub4_7.method346(local24 >> 14 & 0x7FFF);
					}
					if (local19 == 133) {
						local807 = this.aClass4_Sub1_Sub1_Sub2_Sub1Array1[local24];
						if (local807 != null) {
							this.method671(false, 1, local807.anIntArray188[0], aClass4_Sub1_Sub1_Sub2_Sub2_1.anIntArray187[0], aClass4_Sub1_Sub1_Sub2_Sub2_1.anIntArray188[0], 1, 2, 0, local807.anIntArray187[0], 0, 0, 566);
							this.anInt1070 = super.anInt841;
							this.anInt1071 = super.anInt842;
							this.anInt1073 = 2;
							this.anInt1072 = 0;
							if ((local24 & 0x3) == 0) {
								anInt856++;
							}
							if (anInt856 >= 146) {
								this.aClass4_Sub1_Sub4_7.method344(164);
								this.aClass4_Sub1_Sub4_7.method345(201);
								anInt856 = 0;
							}
							this.aClass4_Sub1_Sub4_7.method344(218);
							this.aClass4_Sub1_Sub4_7.method380(local24);
						}
					}
					@Pc(2234) Class17 local2234;
					if (local19 == 1516) {
						local2234 = Class17.method196(local24);
						@Pc(2237) Class28 local2237 = Class28.method318(local14);
						if (local2237 != null && local2237.anIntArray95[local9] >= 100000) {
							local261 = local2237.anIntArray95[local9] + " x " + local2234.aString6;
						} else if (local2234.aByteArray8 == null) {
							local261 = "It's a " + local2234.aString6 + ".";
						} else {
							local261 = new String(local2234.aByteArray8);
						}
						this.method588((byte) 8, 0, "", local261);
					}
					if (local19 == 993) {
						this.method617(local14, local24, local9);
						this.aClass4_Sub1_Sub4_7.method344(126);
						this.aClass4_Sub1_Sub4_7.method380(local9 + this.anInt1056);
						this.aClass4_Sub1_Sub4_7.method378(local24 >> 14 & 0x7FFF);
						this.aClass4_Sub1_Sub4_7.method346(local14 + this.anInt1057);
					}
					if (local19 == 105) {
						this.aClass4_Sub1_Sub4_7.method344(75);
						this.aClass4_Sub1_Sub4_7.method346(local14);
						local242 = Class28.method318(local14);
						if (local242.anIntArrayArray10 != null && local242.anIntArrayArray10[0][0] == 5) {
							local368 = local242.anIntArrayArray10[0][1];
							if (this.anIntArray249[local368] != local242.anIntArray87[0]) {
								this.anIntArray249[local368] = local242.anIntArray87[0];
								this.method723(local368);
								this.aBoolean246 = true;
							}
						}
					}
					if (local19 == 906) {
						this.aClass4_Sub1_Sub4_7.method344(40);
						this.aClass4_Sub1_Sub4_7.method380(local14);
						this.aClass4_Sub1_Sub4_7.method379(local9);
						this.aClass4_Sub1_Sub4_7.method380(local24);
						this.anInt1046 = 0;
						this.anInt1047 = local14;
						this.anInt1048 = local9;
						this.anInt1049 = 2;
						if (Class28.method318(local14).anInt443 == this.anInt951) {
							this.anInt1049 = 1;
						}
						if (Class28.method318(local14).anInt443 == this.anInt955) {
							this.anInt1049 = 3;
						}
					}
					if (local19 == 946) {
						local807 = this.aClass4_Sub1_Sub1_Sub2_Sub1Array1[local24];
						if (local807 != null) {
							this.method671(false, 1, local807.anIntArray188[0], aClass4_Sub1_Sub1_Sub2_Sub2_1.anIntArray187[0], aClass4_Sub1_Sub1_Sub2_Sub2_1.anIntArray188[0], 1, 2, 0, local807.anIntArray187[0], 0, 0, 566);
							this.anInt1070 = super.anInt841;
							this.anInt1071 = super.anInt842;
							this.anInt1073 = 2;
							this.anInt1072 = 0;
							this.aClass4_Sub1_Sub4_7.method344(243);
							this.aClass4_Sub1_Sub4_7.method380(local24);
						}
					}
					if (local19 == 1474) {
						@Pc(2509) int local2509 = local24 >> 14 & 0x7FFF;
						@Pc(2512) Class7 local2512 = Class7.method82(local2509);
						if (local2512.aByteArray1 == null) {
							local276 = "It's a " + local2512.aString1 + ".";
						} else {
							local276 = new String(local2512.aByteArray1);
						}
						this.method588((byte) 8, 0, "", local276);
					}
					if (local19 == 127) {
						this.aClass4_Sub1_Sub4_7.method344(204);
						this.aClass4_Sub1_Sub4_7.method379(local9);
						this.aClass4_Sub1_Sub4_7.method379(local24);
						this.aClass4_Sub1_Sub4_7.method379(local14);
						this.anInt1046 = 0;
						this.anInt1047 = local14;
						this.anInt1048 = local9;
						this.anInt1049 = 2;
						if (Class28.method318(local14).anInt443 == this.anInt951) {
							this.anInt1049 = 1;
						}
						if (Class28.method318(local14).anInt443 == this.anInt955) {
							this.anInt1049 = 3;
						}
					}
					if (local19 == 368) {
						this.method721();
					}
					if (local19 == 646) {
						local416 = this.aClass4_Sub1_Sub1_Sub2_Sub2Array1[local24];
						if (local416 != null) {
							this.method671(false, 1, local416.anIntArray188[0], aClass4_Sub1_Sub1_Sub2_Sub2_1.anIntArray187[0], aClass4_Sub1_Sub1_Sub2_Sub2_1.anIntArray188[0], 1, 2, 0, local416.anIntArray187[0], 0, 0, 566);
							this.anInt1070 = super.anInt841;
							this.anInt1071 = super.anInt842;
							this.anInt1073 = 2;
							this.anInt1072 = 0;
							this.aClass4_Sub1_Sub4_7.method344(161);
							this.aClass4_Sub1_Sub4_7.method380(local24);
						}
					}
					if (local19 == 407) {
						this.aClass4_Sub1_Sub4_7.method344(75);
						this.aClass4_Sub1_Sub4_7.method346(local14);
						local242 = Class28.method318(local14);
						if (local242.anIntArrayArray10 != null && local242.anIntArrayArray10[0][0] == 5) {
							local368 = local242.anIntArrayArray10[0][1];
							this.anIntArray249[local368] = 1 - this.anIntArray249[local368];
							this.method723(local368);
							this.aBoolean246 = true;
						}
					}
					if (local19 == 492) {
						this.method617(local14, local24, local9);
						this.aClass4_Sub1_Sub4_7.method344(167);
						this.aClass4_Sub1_Sub4_7.method346(local24 >> 14 & 0x7FFF);
						this.aClass4_Sub1_Sub4_7.method380(local9 + this.anInt1056);
						this.aClass4_Sub1_Sub4_7.method346(local14 + this.anInt1057);
					}
					if (local19 == 277) {
						this.aClass4_Sub1_Sub4_7.method344(133);
						this.aClass4_Sub1_Sub4_7.method379(local9);
						this.aClass4_Sub1_Sub4_7.method378(local24);
						this.aClass4_Sub1_Sub4_7.method380(local14);
						this.anInt1046 = 0;
						this.anInt1047 = local14;
						this.anInt1048 = local9;
						this.anInt1049 = 2;
						if (Class28.method318(local14).anInt443 == this.anInt951) {
							this.anInt1049 = 1;
						}
						if (Class28.method318(local14).anInt443 == this.anInt955) {
							this.anInt1049 = 3;
						}
					}
					if (local19 == 728) {
						this.anInt1021 = 1;
						this.anInt1022 = local9;
						this.anInt1023 = local14;
						this.anInt1024 = local24;
						this.aString29 = Class17.method196(local24).aString6;
						this.anInt1067 = 0;
						this.aBoolean246 = true;
					} else {
						if (local19 == 546) {
							local807 = this.aClass4_Sub1_Sub1_Sub2_Sub1Array1[local24];
							if (local807 != null) {
								this.method671(false, 1, local807.anIntArray188[0], aClass4_Sub1_Sub1_Sub2_Sub2_1.anIntArray187[0], aClass4_Sub1_Sub1_Sub2_Sub2_1.anIntArray188[0], 1, 2, 0, local807.anIntArray187[0], 0, 0, 566);
								this.anInt1070 = super.anInt841;
								this.anInt1071 = super.anInt842;
								this.anInt1073 = 2;
								this.anInt1072 = 0;
								this.aClass4_Sub1_Sub4_7.method344(248);
								this.aClass4_Sub1_Sub4_7.method346(local24);
							}
						}
						if (local19 == 835) {
							this.aClass4_Sub1_Sub4_7.method344(235);
							this.aClass4_Sub1_Sub4_7.method380(local24);
							this.aClass4_Sub1_Sub4_7.method379(local9);
							this.aClass4_Sub1_Sub4_7.method346(this.anInt1023);
							this.aClass4_Sub1_Sub4_7.method346(local14);
							this.aClass4_Sub1_Sub4_7.method378(this.anInt1024);
							this.aClass4_Sub1_Sub4_7.method379(this.anInt1022);
							this.anInt1046 = 0;
							this.anInt1047 = local14;
							this.anInt1048 = local9;
							this.anInt1049 = 2;
							if (Class28.method318(local14).anInt443 == this.anInt951) {
								this.anInt1049 = 1;
							}
							if (Class28.method318(local14).anInt443 == this.anInt955) {
								this.anInt1049 = 3;
							}
						}
						if (local19 == 641) {
							local638 = this.method671(false, 0, local14, aClass4_Sub1_Sub1_Sub2_Sub2_1.anIntArray187[0], aClass4_Sub1_Sub1_Sub2_Sub2_1.anIntArray188[0], 0, 2, 0, local9, 0, 0, 566);
							if (!local638) {
								this.method671(false, 1, local14, aClass4_Sub1_Sub1_Sub2_Sub2_1.anIntArray187[0], aClass4_Sub1_Sub1_Sub2_Sub2_1.anIntArray188[0], 1, 2, 0, local9, 0, 0, 566);
							}
							this.anInt1070 = super.anInt841;
							this.anInt1071 = super.anInt842;
							this.anInt1073 = 2;
							this.anInt1072 = 0;
							this.aClass4_Sub1_Sub4_7.method344(225);
							this.aClass4_Sub1_Sub4_7.method346(local24);
							this.aClass4_Sub1_Sub4_7.method380(local9 + this.anInt1056);
							this.aClass4_Sub1_Sub4_7.method378(local14 + this.anInt1057);
						}
						if (local19 == 22) {
							local807 = this.aClass4_Sub1_Sub1_Sub2_Sub1Array1[local24];
							if (local807 != null) {
								this.method671(false, 1, local807.anIntArray188[0], aClass4_Sub1_Sub1_Sub2_Sub2_1.anIntArray187[0], aClass4_Sub1_Sub1_Sub2_Sub2_1.anIntArray188[0], 1, 2, 0, local807.anIntArray187[0], 0, 0, 566);
								this.anInt1070 = super.anInt841;
								this.anInt1071 = super.anInt842;
								this.anInt1073 = 2;
								this.anInt1072 = 0;
								this.aClass4_Sub1_Sub4_7.method344(128);
								this.aClass4_Sub1_Sub4_7.method379(this.anInt1024);
								this.aClass4_Sub1_Sub4_7.method346(this.anInt1023);
								this.aClass4_Sub1_Sub4_7.method379(this.anInt1022);
								this.aClass4_Sub1_Sub4_7.method380(local24);
							}
						}
						if (local19 == 1907) {
							local2234 = Class17.method196(local24);
							if (local2234.aByteArray8 == null) {
								local261 = "It's a " + local2234.aString6 + ".";
							} else {
								local261 = new String(local2234.aByteArray8);
							}
							this.method588((byte) 8, 0, "", local261);
						}
						if (local19 == 992) {
							local638 = this.method671(false, 0, local14, aClass4_Sub1_Sub1_Sub2_Sub2_1.anIntArray187[0], aClass4_Sub1_Sub1_Sub2_Sub2_1.anIntArray188[0], 0, 2, 0, local9, 0, 0, 566);
							if (!local638) {
								this.method671(false, 1, local14, aClass4_Sub1_Sub1_Sub2_Sub2_1.anIntArray187[0], aClass4_Sub1_Sub1_Sub2_Sub2_1.anIntArray188[0], 1, 2, 0, local9, 0, 0, 566);
							}
							this.anInt1070 = super.anInt841;
							this.anInt1071 = super.anInt842;
							this.anInt1073 = 2;
							this.anInt1072 = 0;
							this.aClass4_Sub1_Sub4_7.method344(31);
							this.aClass4_Sub1_Sub4_7.method378(local9 + this.anInt1056);
							this.aClass4_Sub1_Sub4_7.method346(local24);
							this.aClass4_Sub1_Sub4_7.method346(local14 + this.anInt1057);
						}
						if (local19 == 749) {
							local416 = this.aClass4_Sub1_Sub1_Sub2_Sub2Array1[local24];
							if (local416 != null) {
								this.method671(false, 1, local416.anIntArray188[0], aClass4_Sub1_Sub1_Sub2_Sub2_1.anIntArray187[0], aClass4_Sub1_Sub1_Sub2_Sub2_1.anIntArray188[0], 1, 2, 0, local416.anIntArray187[0], 0, 0, 566);
								this.anInt1070 = super.anInt841;
								this.anInt1071 = super.anInt842;
								this.anInt1073 = 2;
								this.anInt1072 = 0;
								this.aClass4_Sub1_Sub4_7.method344(180);
								this.aClass4_Sub1_Sub4_7.method378(local24);
							}
						}
						if (local19 == 246) {
							local364 = this.aStringArray12[arg0];
							local368 = local364.indexOf("@whi@");
							if (local368 != -1) {
								local379 = Class47.method550(local364.substring(local368 + 5).trim());
								local1481 = -1;
								for (@Pc(3328) int local3328 = 0; local3328 < this.anInt957; local3328++) {
									if (this.aLongArray4[local3328] == local379) {
										local1481 = local3328;
										break;
									}
								}
								if (local1481 != -1 && this.anIntArray235[local1481] > 0) {
									this.aBoolean247 = true;
									this.anInt996 = 0;
									this.aBoolean237 = true;
									this.aString27 = "";
									this.anInt857 = 3;
									this.aLong31 = this.aLongArray4[local1481];
									this.aString26 = "Enter message to send to " + this.aStringArray11[local1481];
								}
							}
						}
						if (local19 == 972) {
							local807 = this.aClass4_Sub1_Sub1_Sub2_Sub1Array1[local24];
							if (local807 != null) {
								this.method671(false, 1, local807.anIntArray188[0], aClass4_Sub1_Sub1_Sub2_Sub2_1.anIntArray187[0], aClass4_Sub1_Sub1_Sub2_Sub2_1.anIntArray188[0], 1, 2, 0, local807.anIntArray187[0], 0, 0, 566);
								this.anInt1070 = super.anInt841;
								this.anInt1071 = super.anInt842;
								this.anInt1073 = 2;
								this.anInt1072 = 0;
								this.aClass4_Sub1_Sub4_7.method344(193);
								this.aClass4_Sub1_Sub4_7.method380(local24);
								this.aClass4_Sub1_Sub4_7.method380(this.anInt1068);
							}
						}
						if (local19 == 326) {
							local416 = this.aClass4_Sub1_Sub1_Sub2_Sub2Array1[local24];
							if (local416 != null) {
								this.method671(false, 1, local416.anIntArray188[0], aClass4_Sub1_Sub1_Sub2_Sub2_1.anIntArray187[0], aClass4_Sub1_Sub1_Sub2_Sub2_1.anIntArray188[0], 1, 2, 0, local416.anIntArray187[0], 0, 0, 566);
								this.anInt1070 = super.anInt841;
								this.anInt1071 = super.anInt842;
								this.anInt1073 = 2;
								this.anInt1072 = 0;
								this.aClass4_Sub1_Sub4_7.method344(99);
								this.aClass4_Sub1_Sub4_7.method379(this.anInt1023);
								this.aClass4_Sub1_Sub4_7.method378(this.anInt1024);
								this.aClass4_Sub1_Sub4_7.method379(this.anInt1022);
								this.aClass4_Sub1_Sub4_7.method380(local24);
							}
						}
						this.anInt1021 = 0;
						this.aBoolean251 &= true;
						this.anInt1067 = 0;
						this.aBoolean246 = true;
					}
				}
			}
		} catch (@Pc(3550) RuntimeException local3550) {
			signlink.reporterror("63817, " + arg0 + ", " + true + ", " + local3550.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "o", descriptor = "(Z)V")
	private void method693() {
		try {
			this.aBoolean251 &= true;
			this.anInt1020 = 0;
			@Pc(16) int local16 = (aClass4_Sub1_Sub1_Sub2_Sub2_1.anInt764 >> 7) + this.anInt1056;
			@Pc(24) int local24 = (aClass4_Sub1_Sub1_Sub2_Sub2_1.anInt765 >> 7) + this.anInt1057;
			if (local16 >= 3053 && local16 <= 3156 && local24 >= 3056 && local24 <= 3136) {
				this.anInt1020 = 1;
			}
			if (local16 >= 3072 && local16 <= 3118 && local24 >= 9492 && local24 <= 9535) {
				this.anInt1020 = 1;
			}
			if (this.anInt1020 == 1 && local16 >= 3139 && local16 <= 3199 && local24 >= 3008 && local24 <= 3062) {
				this.anInt1020 = 0;
			}
		} catch (@Pc(75) RuntimeException local75) {
			signlink.reporterror("63190, " + true + ", " + local75.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILclient!EGCNSKZO;I)V")
	private void method694(@OriginalArg(1) Class4_Sub1_Sub1_Sub2 arg0, @OriginalArg(2) int arg1) {
		try {
			this.method695(arg0.anInt764, arg1, arg0.anInt765);
		} catch (@Pc(19) RuntimeException local19) {
			signlink.reporterror("98042, " + -3853 + ", " + arg0 + ", " + arg1 + ", " + local19.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(IIII)V")
	private void method695(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		try {
			if (arg0 >= 128 && arg2 >= 128 && arg0 <= 13056 && arg2 <= 13056) {
				@Pc(28) int local28 = this.method614(this.anInt895, arg0, arg2) - arg1;
				@Pc(33) int local33 = arg0 - this.anInt929;
				@Pc(38) int local38 = local28 - this.anInt930;
				@Pc(43) int local43 = arg2 - this.anInt931;
				@Pc(58) int local58 = Class4_Sub1_Sub1_Sub4.anIntArray137[this.anInt932];
				@Pc(63) int local63 = Class4_Sub1_Sub1_Sub4.anIntArray138[this.anInt932];
				@Pc(68) int local68 = Class4_Sub1_Sub1_Sub4.anIntArray137[this.anInt933];
				@Pc(73) int local73 = Class4_Sub1_Sub1_Sub4.anIntArray138[this.anInt933];
				@Pc(83) int local83 = local43 * local68 + local33 * local73 >> 16;
				@Pc(93) int local93 = local43 * local73 - local33 * local68 >> 16;
				@Pc(95) int local95 = local83;
				@Pc(105) int local105 = local38 * local63 - local93 * local58 >> 16;
				@Pc(115) int local115 = local38 * local58 + local93 * local63 >> 16;
				if (local115 >= 50) {
					this.anInt883 = Class4_Sub1_Sub2_Sub1.anInt103 + (local95 << 9) / local115;
					this.anInt884 = Class4_Sub1_Sub2_Sub1.anInt104 + (local105 << 9) / local115;
				} else {
					this.anInt883 = -1;
					this.anInt884 = -1;
				}
			} else {
				this.anInt883 = -1;
				this.anInt884 = -1;
			}
		} catch (@Pc(147) RuntimeException local147) {
			signlink.reporterror("41596, " + 28544 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local147.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "p", descriptor = "(Z)V")
	private void method696() {
		try {
			for (@Pc(9) Class4_Sub1_Sub1_Sub3 local9 = (Class4_Sub1_Sub1_Sub3) this.aClass11_10.method166(); local9 != null; local9 = (Class4_Sub1_Sub1_Sub3) this.aClass11_10.method168()) {
				if (local9.anInt321 != this.anInt895 || local9.aBoolean92) {
					local9.method556();
				} else if (anInt1054 >= local9.anInt325) {
					local9.method218(this.anInt1043);
					if (local9.aBoolean92) {
						local9.method556();
					} else {
						this.aClass20_1.method234(local9, local9.anInt324, 1000, 60, local9.anInt321, false, local9.anInt323, -1, local9.anInt322, 0);
					}
				}
			}
		} catch (@Pc(67) RuntimeException local67) {
			signlink.reporterror("94209, " + true + ", " + local67.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(BLjava/lang/String;Ljava/lang/String;III)Lclient!QDHHNYHL;")
	private Class32 method697(@OriginalArg(1) String arg0, @OriginalArg(2) String arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		try {
			@Pc(9) byte[] local9 = null;
			@Pc(11) int local11 = 5;
			try {
				if (this.aClass34Array1[0] != null) {
					local9 = this.aClass34Array1[0].method433(arg3, this.anInt984);
				}
			} catch (@Pc(27) Exception local27) {
			}
			@Pc(41) int local41;
			if (local9 != null) {
				this.aCRC32_2.reset();
				this.aCRC32_2.update(local9);
				local41 = (int) this.aCRC32_2.getValue();
				if (local41 != arg2) {
					local9 = null;
				}
			}
			if (local9 != null) {
				return new Class32(local9, 0);
			}
			local41 = 0;
			while (local9 == null) {
				@Pc(62) String local62 = "Unknown error";
				this.method585(53, "Requesting " + arg1, arg4);
				@Pc(77) int local77;
				try {
					local77 = 0;
					@Pc(88) DataInputStream local88 = this.method689(arg0 + arg2);
					@Pc(91) byte[] local91 = new byte[6];
					local88.readFully(local91, 0, 6);
					@Pc(102) Class4_Sub1_Sub4 local102 = new Class4_Sub1_Sub4(5, local91);
					local102.anInt506 = 3;
					@Pc(110) int local110 = local102.method359() + 6;
					@Pc(112) int local112 = 6;
					local9 = new byte[local110];
					for (@Pc(117) int local117 = 0; local117 < 6; local117++) {
						local9[local117] = local91[local117];
					}
					@Pc(135) int local135;
					while (local112 < local110) {
						local135 = local110 - local112;
						if (local135 > 1000) {
							local135 = 1000;
						}
						@Pc(146) int local146 = local88.read(local9, local112, local135);
						if (local146 < 0) {
							(new StringBuffer("Length error: ")).append(local112).append("/").append(local110).toString();
							throw new IOException("EOF");
						}
						local112 += local146;
						@Pc(175) int local175 = local112 * 100 / local110;
						if (local175 != local77) {
							this.method585(53, "Loading " + arg1 + " - " + local175 + "%", arg4);
						}
						local77 = local175;
					}
					local88.close();
					try {
						if (this.aClass34Array1[0] != null) {
							this.aClass34Array1[0].method434(local9.length, local9, arg3);
						}
					} catch (@Pc(220) Exception local220) {
						this.aClass34Array1[0] = null;
					}
					if (local9 != null) {
						this.aCRC32_2.reset();
						this.aCRC32_2.update(local9);
						local135 = (int) this.aCRC32_2.getValue();
						if (local135 != arg2) {
							local9 = null;
							local41++;
							local62 = "Checksum error: " + local135;
						}
					}
				} catch (@Pc(255) IOException local255) {
					if (local62.equals("Unknown error")) {
						local62 = "Connection error";
					}
					local9 = null;
				} catch (@Pc(265) NullPointerException local265) {
					local62 = "Null error";
					local9 = null;
					if (!signlink.reporterror) {
						return null;
					}
				} catch (@Pc(274) ArrayIndexOutOfBoundsException local274) {
					local62 = "Bounds error";
					local9 = null;
					if (!signlink.reporterror) {
						return null;
					}
				} catch (@Pc(283) Exception local283) {
					local62 = "Unexpected error";
					local9 = null;
					if (!signlink.reporterror) {
						return null;
					}
				}
				if (local9 == null) {
					for (local77 = local11; local77 > 0; local77--) {
						if (local41 >= 3) {
							this.method585(53, "Game updated - please reload page", arg4);
							local77 = 10;
						} else {
							this.method585(53, local62 + " - Retrying in " + local77, arg4);
						}
						try {
							Thread.sleep(1000L);
						} catch (@Pc(327) Exception local327) {
						}
					}
					local11 *= 2;
					if (local11 > 60) {
						local11 = 60;
					}
					this.aBoolean245 = !this.aBoolean245;
				}
			}
			return new Class32(local9, 0);
		} catch (@Pc(359) RuntimeException local359) {
			signlink.reporterror("67314, " + 0 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local359.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIIIBII)V")
	private void method698(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) byte arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		try {
			@Pc(4) boolean local4 = false;
			if (arg0 >= 1 && arg7 >= 1 && arg0 <= 102 && arg7 <= 102) {
				if (aBoolean223 && arg3 != this.anInt895) {
					return;
				}
				@Pc(30) int local30 = 0;
				if (arg6 == 0) {
					local30 = this.aClass20_1.method249(arg3, arg0, arg7);
				}
				if (arg6 == 1) {
					local30 = this.aClass20_1.method250(arg7, arg0, arg3);
				}
				if (arg6 == 2) {
					local30 = this.aClass20_1.method251(arg3, arg0, arg7);
				}
				if (arg6 == 3) {
					local30 = this.aClass20_1.method252(arg3, arg0, arg7);
				}
				@Pc(86) int local86;
				if (local30 != 0) {
					local86 = this.aClass20_1.method253(arg3, arg0, arg7, local30);
					@Pc(92) int local92 = local30 >> 14 & 0x7FFF;
					@Pc(96) int local96 = local86 & 0x1F;
					@Pc(100) int local100 = local86 >> 6;
					@Pc(112) Class7 local112;
					if (arg6 == 0) {
						this.aClass20_1.method240(arg7, arg3, arg0);
						local112 = Class7.method82(local92);
						if (local112.aBoolean17) {
							this.aClass2Array1[arg3].method44(local96, arg0, arg7, local100, local112.aBoolean19);
						}
					}
					if (arg6 == 1) {
						this.aClass20_1.method241(arg7, arg3, arg0);
					}
					if (arg6 == 2) {
						this.aClass20_1.method242(arg3, arg0, arg7);
						local112 = Class7.method82(local92);
						if (arg0 + local112.anInt58 > 103 || arg7 + local112.anInt58 > 103 || arg0 + local112.anInt61 > 103 || arg7 + local112.anInt61 > 103) {
							return;
						}
						if (local112.aBoolean17) {
							this.aClass2Array1[arg3].method45(local112.aBoolean19, arg7, local112.anInt58, local100, arg0, local112.anInt61, 563);
						}
					}
					if (arg6 == 3) {
						this.aClass20_1.method243(arg0, arg3, arg7);
						local112 = Class7.method82(local92);
						if (local112.aBoolean17 && local112.aBoolean26) {
							this.aClass2Array1[arg3].method47(arg0, arg7);
						}
					}
				}
				if (arg2 >= 0) {
					local86 = arg3;
					if (arg3 < 3 && (this.aByteArrayArrayArray8[1][arg0][arg7] & 0x2) == 2) {
						local86 = arg3 + 1;
					}
					Class44.method525(this.anIntArrayArrayArray8, local86, arg0, arg1, arg4, arg2, this.aClass2Array1[arg3], arg3, arg7, this.aClass20_1);
					return;
				}
			}
		} catch (@Pc(259) RuntimeException local259) {
			signlink.reporterror("37382, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + local259.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "C", descriptor = "(I)V")
	private void method700(@OriginalArg(0) int arg0) {
		try {
			@Pc(3) boolean local3 = false;
			if (this.anInt1040 == 0) {
				@Pc(10) int local10 = super.anInt840;
				if (this.anInt1067 == 1 && super.anInt841 >= 516 && super.anInt842 >= 160 && super.anInt841 <= 765 && super.anInt842 <= 205) {
					local10 = 0;
				}
				@Pc(41) int local41;
				@Pc(44) int local44;
				@Pc(120) int local120;
				if (this.aBoolean228) {
					if (local10 != 1) {
						local41 = super.anInt835;
						local44 = super.anInt836;
						if (this.anInt897 == 0) {
							local41 -= 4;
							local44 -= 4;
						}
						if (this.anInt897 == 1) {
							local41 -= 553;
							local44 -= 205;
						}
						if (this.anInt897 == 2) {
							local41 -= 17;
							local44 -= 357;
						}
						if (local41 < this.anInt898 - 10 || local41 > this.anInt898 + this.anInt900 + 10 || local44 < this.anInt899 - 10 || local44 > this.anInt899 + this.anInt901 + 10) {
							this.aBoolean228 = false;
							if (this.anInt897 == 1) {
								this.aBoolean246 = true;
							}
							if (this.anInt897 == 2) {
								this.aBoolean247 = true;
							}
						}
					}
					if (local10 == 1) {
						local41 = this.anInt898;
						local44 = this.anInt899;
						local120 = this.anInt900;
						@Pc(123) int local123 = super.anInt841;
						@Pc(126) int local126 = super.anInt842;
						if (this.anInt897 == 0) {
							local123 -= 4;
							local126 -= 4;
						}
						if (this.anInt897 == 1) {
							local123 -= 553;
							local126 -= 205;
						}
						if (this.anInt897 == 2) {
							local123 -= 17;
							local126 -= 357;
						}
						@Pc(145) int local145 = -1;
						for (@Pc(147) int local147 = 0; local147 < this.anInt989; local147++) {
							@Pc(162) int local162 = local44 + (this.anInt989 - 1 - local147) * 15 + 31;
							if (local123 > local41 && local123 < local41 + local120 && local126 > local162 - 13 && local126 < local162 + 3) {
								local145 = local147;
							}
						}
						if (local145 != -1) {
							this.method692(local145);
						}
						this.aBoolean228 = false;
						if (this.anInt897 == 1) {
							this.aBoolean246 = true;
						}
						if (this.anInt897 == 2) {
							this.aBoolean247 = true;
							return;
						}
					}
				} else {
					if (local10 == 1 && this.anInt989 > 0) {
						local41 = this.anIntArray253[this.anInt989 - 1];
						if (local41 == 277 || local41 == 73 || local41 == 664 || local41 == 127 || local41 == 906 || local41 == 358 || local41 == 177 || local41 == 839 || local41 == 537 || local41 == 996 || local41 == 728 || local41 == 1516) {
							local44 = this.anIntArray251[this.anInt989 - 1];
							local120 = this.anIntArray252[this.anInt989 - 1];
							@Pc(281) Class28 local281 = Class28.method318(local120);
							if (local281.aBoolean114 || local281.aBoolean111) {
								this.aBoolean218 = false;
								this.anInt921 = 0;
								this.anInt1038 = local120;
								this.anInt1039 = local44;
								this.anInt1040 = 2;
								this.anInt1041 = super.anInt841;
								this.anInt1042 = super.anInt842;
								if (Class28.method318(local120).anInt443 == this.anInt951) {
									this.anInt1040 = 1;
								}
								if (Class28.method318(local120).anInt443 == this.anInt955) {
									this.anInt1040 = 3;
								}
								return;
							}
						}
					}
					if (local10 == 1 && (this.anInt1053 == 1 || this.method615(this.anInt989 - 1, (byte) 8)) && this.anInt989 > 2) {
						local10 = 2;
					}
					if (local10 == 1 && this.anInt989 > 0) {
						this.method692(this.anInt989 - 1);
					}
					if (local10 != 2 || this.anInt989 <= 0) {
						return;
					}
					this.method663();
				}
			}
		} catch (@Pc(374) RuntimeException local374) {
			signlink.reporterror("59529, " + arg0 + ", " + local374.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(I)V")
	@Override
	protected void method579() {
		try {
			this.anInt859 += 0;
			if (!this.aBoolean265 && !this.aBoolean242 && !this.aBoolean249) {
				anInt1054++;
				if (this.aBoolean251) {
					this.method674();
				} else {
					this.method599();
				}
				this.method684();
			}
		} catch (@Pc(35) RuntimeException local35) {
			signlink.reporterror("56141, " + 0 + ", " + local35.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "D", descriptor = "(I)V")
	private void method702() {
		try {
			this.aClass25_21.method302(this.aBoolean230);
			Class4_Sub1_Sub2_Sub1.anIntArray27 = this.anIntArray274;
			this.aClass4_Sub1_Sub2_Sub2_13.method296(0, 0);
			if (this.anInt995 != -1) {
				this.method688(0, Class28.method318(this.anInt995), 0, 0);
			} else if (this.anIntArray255[this.anInt994] != -1) {
				this.method688(0, Class28.method318(this.anIntArray255[this.anInt994]), 0, 0);
			}
			if (this.aBoolean228 && this.anInt897 == 1) {
				this.method680();
			}
			this.aClass25_21.method303(553, 205, super.aGraphics2);
			this.aClass25_23.method302(this.aBoolean230);
			Class4_Sub1_Sub2_Sub1.anIntArray27 = this.anIntArray275;
		} catch (@Pc(81) RuntimeException local81) {
			signlink.reporterror("47931, " + 7 + ", " + local81.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "E", descriptor = "(I)V")
	private void method703() {
		try {
			while (true) {
				@Pc(10) int local10 = this.method577();
				if (local10 == -1) {
					return;
				}
				if (this.anInt951 != -1 && this.anInt951 == this.anInt999) {
					if (local10 == 8 && this.aString17.length() > 0) {
						this.aString17 = this.aString17.substring(0, this.aString17.length() - 1);
					}
					if ((local10 >= 97 && local10 <= 122 || local10 >= 65 && local10 <= 90 || local10 >= 48 && local10 <= 57 || local10 == 32) && this.aString17.length() < 12) {
						this.aString17 = this.aString17 + (char) local10;
					}
				} else {
					@Pc(190) int local190;
					if (this.aBoolean237) {
						if (local10 >= 32 && local10 <= 122 && this.aString27.length() < 80) {
							this.aString27 = this.aString27 + (char) local10;
							this.aBoolean247 = true;
						}
						if (local10 == 8 && this.aString27.length() > 0) {
							this.aString27 = this.aString27.substring(0, this.aString27.length() - 1);
							this.aBoolean247 = true;
						}
						if (local10 == 13 || local10 == 10) {
							this.aBoolean237 = false;
							this.aBoolean247 = true;
							@Pc(150) long local150;
							if (this.anInt857 == 1) {
								local150 = Class47.method550(this.aString27);
								this.method690(local150);
							}
							if (this.anInt857 == 2 && this.anInt957 > 0) {
								local150 = Class47.method550(this.aString27);
								this.method677(local150);
							}
							if (this.anInt857 == 3 && this.aString27.length() > 0) {
								this.aClass4_Sub1_Sub4_7.method344(227);
								this.aClass4_Sub1_Sub4_7.method345(0);
								local190 = this.aClass4_Sub1_Sub4_7.anInt506;
								this.aClass4_Sub1_Sub4_7.method351(this.aLong31);
								Class19.method220(this.aClass4_Sub1_Sub4_7, this.aString27);
								this.aClass4_Sub1_Sub4_7.method354((byte) 5, this.aClass4_Sub1_Sub4_7.anInt506 - local190);
								this.aString27 = Class19.method221(this.aString27, 753);
								this.aString27 = Class1.method11(this.aString27, 753);
								this.method588((byte) 8, 6, Class47.method554(Class47.method551(this.aLong31)), this.aString27);
								if (this.anInt970 == 2) {
									this.anInt970 = 1;
									this.aBoolean250 = true;
									this.aClass4_Sub1_Sub4_7.method344(72);
									this.aClass4_Sub1_Sub4_7.method345(this.anInt978);
									this.aClass4_Sub1_Sub4_7.method345(this.anInt970);
									this.aClass4_Sub1_Sub4_7.method345(this.anInt1002);
								}
							}
							if (this.anInt857 == 4 && this.anInt848 < 100) {
								local150 = Class47.method550(this.aString27);
								this.method649(local150);
							}
							if (this.anInt857 == 5 && this.anInt848 > 0) {
								local150 = Class47.method550(this.aString27);
								this.method618(this.aBoolean238, local150);
							}
						}
					} else if (this.anInt996 == 1) {
						if (local10 >= 48 && local10 <= 57 && this.aString25.length() < 10) {
							this.aString25 = this.aString25 + (char) local10;
							this.aBoolean247 = true;
						}
						if (local10 == 8 && this.aString25.length() > 0) {
							this.aString25 = this.aString25.substring(0, this.aString25.length() - 1);
							this.aBoolean247 = true;
						}
						if (local10 == 13 || local10 == 10) {
							if (this.aString25.length() > 0) {
								local190 = 0;
								try {
									local190 = Integer.parseInt(this.aString25);
								} catch (@Pc(368) Exception local368) {
								}
								this.aClass4_Sub1_Sub4_7.method344(24);
								this.aClass4_Sub1_Sub4_7.method349(local190);
							}
							this.anInt996 = 0;
							this.aBoolean247 = true;
						}
					} else if (this.anInt996 == 2) {
						if (local10 >= 32 && local10 <= 122 && this.aString25.length() < 12) {
							this.aString25 = this.aString25 + (char) local10;
							this.aBoolean247 = true;
						}
						if (local10 == 8 && this.aString25.length() > 0) {
							this.aString25 = this.aString25.substring(0, this.aString25.length() - 1);
							this.aBoolean247 = true;
						}
						if (local10 == 13 || local10 == 10) {
							if (this.aString25.length() > 0) {
								this.aClass4_Sub1_Sub4_7.method344(13);
								this.aClass4_Sub1_Sub4_7.method351(Class47.method550(this.aString25));
							}
							this.anInt996 = 0;
							this.aBoolean247 = true;
						}
					} else if (this.anInt996 == 3) {
						if (local10 >= 32 && local10 <= 122 && this.aString25.length() < 40) {
							this.aString25 = this.aString25 + (char) local10;
							this.aBoolean247 = true;
						}
						if (local10 == 8 && this.aString25.length() > 0) {
							this.aString25 = this.aString25.substring(0, this.aString25.length() - 1);
							this.aBoolean247 = true;
						}
					} else if (this.anInt955 == -1 && this.anInt1015 == -1) {
						if (local10 >= 32 && local10 <= 122 && this.aString30.length() < 80) {
							this.aString30 = this.aString30 + (char) local10;
							this.aBoolean247 = true;
						}
						if (local10 == 8 && this.aString30.length() > 0) {
							this.aString30 = this.aString30.substring(0, this.aString30.length() - 1);
							this.aBoolean247 = true;
						}
						if ((local10 == 13 || local10 == 10) && this.aString30.length() > 0) {
							if (this.anInt959 == 2) {
								if (this.aString30.equals("::clientdrop")) {
									this.method624();
								}
								if (this.aString30.equals("::lag")) {
									this.method691();
								}
								if (this.aString30.equals("::prefetchmusic")) {
									for (local190 = 0; local190 < this.aClass8_Sub1_1.method104(2); local190++) {
										this.aClass8_Sub1_1.method87(local190, 2, (byte) 1);
									}
								}
								if (this.aString30.equals("::fpson")) {
									aBoolean268 = true;
								}
								if (this.aString30.equals("::fpsoff")) {
									aBoolean268 = false;
								}
								if (this.aString30.equals("::noclip")) {
									for (local190 = 0; local190 < 4; local190++) {
										for (@Pc(653) int local653 = 1; local653 < 103; local653++) {
											for (@Pc(657) int local657 = 1; local657 < 103; local657++) {
												this.aClass2Array1[local190].anIntArrayArray1[local653][local657] = 0;
											}
										}
									}
								}
							}
							if (this.aString30.startsWith("::")) {
								this.aClass4_Sub1_Sub4_7.method344(191);
								this.aClass4_Sub1_Sub4_7.method345(this.aString30.length() - 1);
								this.aClass4_Sub1_Sub4_7.method352(this.aString30.substring(2));
							} else {
								@Pc(712) String local712 = this.aString30.toLowerCase();
								@Pc(714) byte local714 = 0;
								if (local712.startsWith("yellow:")) {
									local714 = 0;
									this.aString30 = this.aString30.substring(7);
								} else if (local712.startsWith("red:")) {
									local714 = 1;
									this.aString30 = this.aString30.substring(4);
								} else if (local712.startsWith("green:")) {
									local714 = 2;
									this.aString30 = this.aString30.substring(6);
								} else if (local712.startsWith("cyan:")) {
									local714 = 3;
									this.aString30 = this.aString30.substring(5);
								} else if (local712.startsWith("purple:")) {
									local714 = 4;
									this.aString30 = this.aString30.substring(7);
								} else if (local712.startsWith("white:")) {
									local714 = 5;
									this.aString30 = this.aString30.substring(6);
								} else if (local712.startsWith("flash1:")) {
									local714 = 6;
									this.aString30 = this.aString30.substring(7);
								} else if (local712.startsWith("flash2:")) {
									local714 = 7;
									this.aString30 = this.aString30.substring(7);
								} else if (local712.startsWith("flash3:")) {
									local714 = 8;
									this.aString30 = this.aString30.substring(7);
								} else if (local712.startsWith("glow1:")) {
									local714 = 9;
									this.aString30 = this.aString30.substring(6);
								} else if (local712.startsWith("glow2:")) {
									local714 = 10;
									this.aString30 = this.aString30.substring(6);
								} else if (local712.startsWith("glow3:")) {
									local714 = 11;
									this.aString30 = this.aString30.substring(6);
								}
								local712 = this.aString30.toLowerCase();
								@Pc(886) byte local886 = 0;
								if (local712.startsWith("wave:")) {
									local886 = 1;
									this.aString30 = this.aString30.substring(5);
								} else if (local712.startsWith("wave2:")) {
									local886 = 2;
									this.aString30 = this.aString30.substring(6);
								} else if (local712.startsWith("shake:")) {
									local886 = 3;
									this.aString30 = this.aString30.substring(6);
								} else if (local712.startsWith("scroll:")) {
									local886 = 4;
									this.aString30 = this.aString30.substring(7);
								} else if (local712.startsWith("slide:")) {
									local886 = 5;
									this.aString30 = this.aString30.substring(6);
								}
								this.aClass4_Sub1_Sub4_7.method344(45);
								this.aClass4_Sub1_Sub4_7.method345(0);
								@Pc(967) int local967 = this.aClass4_Sub1_Sub4_7.anInt506;
								this.aClass4_Sub1_Sub4_7.method345(local714);
								this.aClass4_Sub1_Sub4_7.method372(local886);
								this.aClass4_Sub1_Sub4_9.anInt506 = 0;
								Class19.method220(this.aClass4_Sub1_Sub4_9, this.aString30);
								this.aClass4_Sub1_Sub4_7.method388(this.aClass4_Sub1_Sub4_9.aByteArray10, this.aClass4_Sub1_Sub4_9.anInt506);
								this.aClass4_Sub1_Sub4_7.method354((byte) 5, this.aClass4_Sub1_Sub4_7.anInt506 - local967);
								this.aString30 = Class19.method221(this.aString30, 753);
								this.aString30 = Class1.method11(this.aString30, 753);
								aClass4_Sub1_Sub1_Sub2_Sub2_1.aString14 = this.aString30;
								aClass4_Sub1_Sub1_Sub2_Sub2_1.anInt755 = local714;
								aClass4_Sub1_Sub1_Sub2_Sub2_1.anInt789 = local886;
								aClass4_Sub1_Sub1_Sub2_Sub2_1.anInt770 = 150;
								if (this.anInt959 == 2) {
									this.method588((byte) 8, 2, "@cr2@" + aClass4_Sub1_Sub1_Sub2_Sub2_1.aString15, aClass4_Sub1_Sub1_Sub2_Sub2_1.aString14);
								} else if (this.anInt959 == 1) {
									this.method588((byte) 8, 2, "@cr1@" + aClass4_Sub1_Sub1_Sub2_Sub2_1.aString15, aClass4_Sub1_Sub1_Sub2_Sub2_1.aString14);
								} else {
									this.method588((byte) 8, 2, aClass4_Sub1_Sub1_Sub2_Sub2_1.aString15, aClass4_Sub1_Sub1_Sub2_Sub2_1.aString14);
								}
								if (this.anInt978 == 2) {
									this.anInt978 = 3;
									this.aBoolean250 = true;
									this.aClass4_Sub1_Sub4_7.method344(72);
									this.aClass4_Sub1_Sub4_7.method345(this.anInt978);
									this.aClass4_Sub1_Sub4_7.method345(this.anInt970);
									this.aClass4_Sub1_Sub4_7.method345(this.anInt1002);
								}
							}
							this.aString30 = "";
							this.aBoolean247 = true;
						}
					}
				}
			}
		} catch (@Pc(1119) RuntimeException local1119) {
			signlink.reporterror("44913, " + 0 + ", " + local1119.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILjava/lang/String;I)V")
	@Override
	protected void method585(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2) {
		try {
			this.anInt871 = arg2;
			this.aString28 = arg1;
			this.method647();
			if (this.aClass32_2 == null) {
				super.method585(53, arg1, arg2);
			} else {
				this.aClass25_14.method302(this.aBoolean230);
				this.aClass4_Sub1_Sub2_Sub4_4.method504(180, 54, "RuneScape is loading - please wait...", 16777215);
				Class4_Sub1_Sub2.method497(304, 9179409, 28, 34, 62);
				Class4_Sub1_Sub2.method497(302, 0, 29, 32, 63);
				Class4_Sub1_Sub2.method496(30, 9179409, arg2 * 3, 30, 64);
				Class4_Sub1_Sub2.method496(arg2 * 3 + 30, 0, 300 - arg2 * 3, 30, 64);
				this.aClass4_Sub1_Sub2_Sub4_4.method504(180, 85, arg1, 16777215);
				this.aClass25_14.method303(202, 171, super.aGraphics2);
				if (this.aBoolean243) {
					this.aBoolean243 = false;
					if (!this.aBoolean269) {
						this.aClass25_15.method303(0, 0, super.aGraphics2);
						this.aClass25_16.method303(637, 0, super.aGraphics2);
					}
					this.aClass25_12.method303(128, 0, super.aGraphics2);
					this.aClass25_13.method303(202, 371, super.aGraphics2);
					this.aClass25_17.method303(0, 265, super.aGraphics2);
					this.aClass25_18.method303(562, 265, super.aGraphics2);
					this.aClass25_19.method303(128, 171, super.aGraphics2);
					this.aClass25_20.method303(562, 171, super.aGraphics2);
				}
			}
		} catch (@Pc(218) RuntimeException local218) {
			signlink.reporterror("35067, " + 53 + ", " + arg1 + ", " + arg2 + ", " + local218.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(BLclient!PGNBHFUF;I)V")
	private void method704(@OriginalArg(0) byte arg0, @OriginalArg(1) Class4_Sub1_Sub4 arg1, @OriginalArg(2) int arg2) {
		try {
			if (arg0 == this.aByte35) {
				@Pc(7) boolean local7 = false;
				@Pc(21) int local21;
				@Pc(25) int local25;
				@Pc(29) int local29;
				@Pc(34) int local34;
				@Pc(52) int local52;
				@Pc(55) int local55;
				@Pc(59) int local59;
				@Pc(68) int local68;
				@Pc(75) int local75;
				@Pc(79) int local79;
				if (arg2 == 39) {
					@Pc(17) byte local17 = arg1.method376();
					local21 = arg1.method373();
					local25 = local21 >> 2;
					local29 = local21 & 0x3;
					local34 = this.anIntArray257[local25];
					@Pc(39) byte local39 = arg1.method377(this.aBoolean239);
					@Pc(44) byte local44 = arg1.method377(this.aBoolean239);
					@Pc(48) byte local48 = arg1.method376();
					local52 = arg1.method383();
					local55 = arg1.method357();
					local59 = arg1.method374();
					local68 = this.anInt942 + (local59 >> 4 & 0x7);
					local75 = this.anInt943 + (local59 & 0x7);
					local79 = arg1.method383();
					@Pc(83) int local83 = arg1.method383();
					@Pc(89) Class4_Sub1_Sub1_Sub2_Sub2 local89;
					if (local55 == this.anInt1014) {
						local89 = aClass4_Sub1_Sub1_Sub2_Sub2_1;
					} else {
						local89 = this.aClass4_Sub1_Sub1_Sub2_Sub2Array1[local55];
					}
					if (local89 != null) {
						@Pc(101) Class7 local101 = Class7.method82(local52);
						@Pc(111) int local111 = this.anIntArrayArrayArray8[this.anInt895][local68][local75];
						@Pc(123) int local123 = this.anIntArrayArrayArray8[this.anInt895][local68 + 1][local75];
						@Pc(137) int local137 = this.anIntArrayArrayArray8[this.anInt895][local68 + 1][local75 + 1];
						@Pc(149) int local149 = this.anIntArrayArrayArray8[this.anInt895][local68][local75 + 1];
						@Pc(159) Class4_Sub1_Sub1_Sub4 local159 = local101.method80(local25, local29, local111, local123, local137, local149, -1);
						if (local159 != null) {
							this.method638(0, local75, local68, local34, this.anInt895, local83 + 1, 0, -1, local79 + 1);
							local89.anInt794 = local83 + anInt1054;
							local89.anInt795 = local79 + anInt1054;
							local89.aClass4_Sub1_Sub1_Sub4_2 = local159;
							@Pc(194) int local194 = local101.anInt58;
							@Pc(197) int local197 = local101.anInt61;
							if (local29 == 1 || local29 == 3) {
								local194 = local101.anInt61;
								local197 = local101.anInt58;
							}
							local89.anInt791 = local68 * 128 + local194 * 64;
							local89.anInt793 = local75 * 128 + local197 * 64;
							local89.anInt792 = this.method614(this.anInt895, local89.anInt791, local89.anInt793);
							@Pc(243) byte local243;
							if (local48 > local17) {
								local243 = local48;
								local48 = local17;
								local17 = local243;
							}
							if (local39 > local44) {
								local243 = local39;
								local39 = local44;
								local44 = local243;
							}
							local89.anInt802 = local68 + local48;
							local89.anInt804 = local68 + local17;
							local89.anInt803 = local75 + local39;
							local89.anInt805 = local75 + local44;
						}
					}
				}
				@Pc(282) int local282;
				@Pc(307) int local307;
				if (arg2 == 41) {
					local282 = arg1.method355();
					local21 = this.anInt942 + (local282 >> 4 & 0x7);
					local25 = this.anInt943 + (local282 & 0x7);
					local29 = arg1.method357();
					local34 = arg1.method357();
					local307 = arg1.method357();
					if (local21 >= 0 && local25 >= 0 && local21 < 104 && local25 < 104) {
						@Pc(327) Class11 local327 = this.aClass11ArrayArrayArray1[this.anInt895][local21][local25];
						if (local327 != null) {
							for (@Pc(333) Class4_Sub1_Sub1_Sub1 local333 = (Class4_Sub1_Sub1_Sub1) local327.method166(); local333 != null; local333 = (Class4_Sub1_Sub1_Sub1) local327.method168()) {
								if (local333.anInt25 == (local29 & 0x7FFF) && local333.anInt24 == local34) {
									local333.anInt24 = local307;
									break;
								}
							}
							this.method594(local21, local25);
						}
					}
				} else {
					@Pc(402) int local402;
					if (arg2 == 90) {
						local282 = arg1.method375();
						local21 = this.anInt942 + (local282 >> 4 & 0x7);
						local25 = this.anInt943 + (local282 & 0x7);
						local29 = arg1.method374();
						local34 = local29 >> 2;
						local307 = local29 & 0x3;
						local402 = this.anIntArray257[local34];
						if (local21 >= 0 && local25 >= 0 && local21 < 104 && local25 < 104) {
							this.method638(local307, local25, local21, local402, this.anInt895, 0, local34, -1, -1);
						}
					} else {
						@Pc(479) Class4_Sub1_Sub1_Sub1 local479;
						if (arg2 == 20) {
							local282 = arg1.method382();
							local21 = arg1.method375();
							local25 = this.anInt942 + (local21 >> 4 & 0x7);
							local29 = this.anInt943 + (local21 & 0x7);
							if (local25 >= 0 && local29 >= 0 && local25 < 104 && local29 < 104) {
								@Pc(473) Class11 local473 = this.aClass11ArrayArrayArray1[this.anInt895][local25][local29];
								if (local473 != null) {
									for (local479 = (Class4_Sub1_Sub1_Sub1) local473.method166(); local479 != null; local479 = (Class4_Sub1_Sub1_Sub1) local473.method168()) {
										if (local479.anInt25 == (local282 & 0x7FFF)) {
											local479.method556();
											break;
										}
									}
									if (local473.method166() == null) {
										this.aClass11ArrayArrayArray1[this.anInt895][local25][local29] = null;
									}
									this.method594(local25, local29);
								}
							}
						} else if (arg2 == 114) {
							local282 = arg1.method355();
							local21 = this.anInt942 + (local282 >> 4 & 0x7);
							local25 = this.anInt943 + (local282 & 0x7);
							local29 = arg1.method357();
							local34 = arg1.method355();
							local307 = arg1.method357();
							if (local21 >= 0 && local25 >= 0 && local21 < 104 && local25 < 104) {
								local21 = local21 * 128 + 64;
								local25 = local25 * 128 + 64;
								@Pc(590) Class4_Sub1_Sub1_Sub3 local590 = new Class4_Sub1_Sub1_Sub3(local29, local307, local21, (byte) -9, this.method614(this.anInt895, local21, local25) - local34, this.anInt895, local25, anInt1054);
								this.aClass11_10.method163(local590);
							}
						} else {
							if (arg2 == 216) {
								local282 = arg1.method355();
								local21 = this.anInt942 + (local282 >> 4 & 0x7);
								local25 = this.anInt943 + (local282 & 0x7);
								local29 = arg1.method357();
								local34 = arg1.method355();
								local307 = local34 >> 4 & 0xF;
								local402 = local34 & 0x7;
								if (aClass4_Sub1_Sub1_Sub2_Sub2_1.anIntArray187[0] >= local21 - local307 && aClass4_Sub1_Sub1_Sub2_Sub2_1.anIntArray187[0] <= local21 + local307 && aClass4_Sub1_Sub1_Sub2_Sub2_1.anIntArray188[0] >= local25 - local307 && aClass4_Sub1_Sub1_Sub2_Sub2_1.anIntArray188[0] <= local25 + local307 && this.aBoolean261 && !aBoolean223 && this.anInt935 < 50) {
									this.anIntArray266[this.anInt935] = local29;
									this.anIntArray267[this.anInt935] = local402;
									this.anIntArray220[this.anInt935] = Class36.anIntArray147[local29];
									this.anInt935++;
								}
							}
							if (arg2 == 51) {
								local282 = arg1.method382();
								local21 = arg1.method383();
								local25 = arg1.method373();
								local29 = this.anInt942 + (local25 >> 4 & 0x7);
								local34 = this.anInt943 + (local25 & 0x7);
								if (local29 >= 0 && local34 >= 0 && local29 < 104 && local34 < 104) {
									local479 = new Class4_Sub1_Sub1_Sub1();
									local479.anInt25 = local282;
									local479.anInt24 = local21;
									if (this.aClass11ArrayArrayArray1[this.anInt895][local29][local34] == null) {
										this.aClass11ArrayArrayArray1[this.anInt895][local29][local34] = new Class11(145);
									}
									this.aClass11ArrayArrayArray1[this.anInt895][local29][local34].method163(local479);
									this.method594(local29, local34);
								}
							} else if (arg2 == 125) {
								local282 = arg1.method383();
								local21 = arg1.method373();
								local25 = this.anInt942 + (local21 >> 4 & 0x7);
								local29 = this.anInt943 + (local21 & 0x7);
								local34 = arg1.method382();
								local307 = arg1.method357();
								if (local25 >= 0 && local29 >= 0 && local25 < 104 && local29 < 104 && local307 != this.anInt1014) {
									@Pc(842) Class4_Sub1_Sub1_Sub1 local842 = new Class4_Sub1_Sub1_Sub1();
									local842.anInt25 = local34;
									local842.anInt24 = local282;
									if (this.aClass11ArrayArrayArray1[this.anInt895][local25][local29] == null) {
										this.aClass11ArrayArrayArray1[this.anInt895][local25][local29] = new Class11(145);
									}
									this.aClass11ArrayArrayArray1[this.anInt895][local25][local29].method163(local842);
									this.method594(local25, local29);
								}
							} else {
								@Pc(930) int local930;
								if (arg2 == 127) {
									local282 = arg1.method373();
									local21 = this.anInt942 + (local282 >> 4 & 0x7);
									local25 = this.anInt943 + (local282 & 0x7);
									local29 = arg1.method382();
									local34 = arg1.method355();
									local307 = local34 >> 2;
									local402 = local34 & 0x3;
									local930 = this.anIntArray257[local307];
									if (local21 >= 0 && local25 >= 0 && local21 < 103 && local25 < 103) {
										local52 = this.anIntArrayArrayArray8[this.anInt895][local21][local25];
										local55 = this.anIntArrayArrayArray8[this.anInt895][local21 + 1][local25];
										local59 = this.anIntArrayArrayArray8[this.anInt895][local21 + 1][local25 + 1];
										local68 = this.anIntArrayArrayArray8[this.anInt895][local21][local25 + 1];
										if (local930 == 0) {
											@Pc(999) Class9 local999 = this.aClass20_1.method245(local21, local25, (byte) 4, this.anInt895);
											if (local999 != null) {
												local79 = local999.anInt168 >> 14 & 0x7FFF;
												if (local307 == 2) {
													local999.aClass4_Sub1_Sub1_1 = new Class4_Sub1_Sub1_Sub6(local29, 2, true, local59, local402 + 4, local52, local79, false, local55, local68);
													local999.aClass4_Sub1_Sub1_2 = new Class4_Sub1_Sub1_Sub6(local29, 2, true, local59, local402 + 1 & 0x3, local52, local79, false, local55, local68);
												} else {
													local999.aClass4_Sub1_Sub1_1 = new Class4_Sub1_Sub1_Sub6(local29, local307, true, local59, local402, local52, local79, false, local55, local68);
												}
											}
										}
										if (local930 == 1) {
											@Pc(1076) Class23 local1076 = this.aClass20_1.method246(local21, this.anInt895, local25);
											if (local1076 != null) {
												local1076.aClass4_Sub1_Sub1_4 = new Class4_Sub1_Sub1_Sub6(local29, 4, true, local59, 0, local52, local1076.anInt412 >> 14 & 0x7FFF, false, local55, local68);
											}
										}
										if (local930 == 2) {
											@Pc(1110) Class14 local1110 = this.aClass20_1.method247(local21, local25, this.anInt895);
											if (local307 == 11) {
												local307 = 10;
											}
											if (local1110 != null) {
												local1110.aClass4_Sub1_Sub1_3 = new Class4_Sub1_Sub1_Sub6(local29, local307, true, local59, local402, local52, local1110.anInt257 >> 14 & 0x7FFF, false, local55, local68);
											}
										}
										if (local930 == 3) {
											@Pc(1149) Class24 local1149 = this.aClass20_1.method248(this.anInt895, local25, local21);
											if (local1149 != null) {
												local1149.aClass4_Sub1_Sub1_5 = new Class4_Sub1_Sub1_Sub6(local29, 22, true, local59, local402, local52, local1149.anInt416 >> 14 & 0x7FFF, false, local55, local68);
											}
										}
									}
								} else if (arg2 == 74) {
									local282 = arg1.method383();
									local21 = arg1.method373();
									local25 = this.anInt942 + (local21 >> 4 & 0x7);
									local29 = this.anInt943 + (local21 & 0x7);
									local34 = arg1.method374();
									local307 = local34 >> 2;
									local402 = local34 & 0x3;
									local930 = this.anIntArray257[local307];
									if (local25 >= 0 && local29 >= 0 && local25 < 104 && local29 < 104) {
										this.method638(local402, local29, local25, local930, this.anInt895, 0, local307, local282, -1);
									}
								} else if (arg2 == 133) {
									local282 = arg1.method355();
									local21 = this.anInt942 + (local282 >> 4 & 0x7);
									local25 = this.anInt943 + (local282 & 0x7);
									local29 = local21 + arg1.method356();
									local34 = local25 + arg1.method356();
									local307 = arg1.method358();
									local402 = arg1.method357();
									local930 = arg1.method355() * 4;
									local52 = arg1.method355() * 4;
									local55 = arg1.method357();
									local59 = arg1.method357();
									local68 = arg1.method355();
									local75 = arg1.method355();
									if (local21 >= 0 && local25 >= 0 && local21 < 104 && local25 < 104 && local29 >= 0 && local34 >= 0 && local29 < 104 && local34 < 104 && local402 != 65535) {
										local21 = local21 * 128 + 64;
										local25 = local25 * 128 + 64;
										local29 = local29 * 128 + 64;
										local34 = local34 * 128 + 64;
										@Pc(1376) Class4_Sub1_Sub1_Sub5 local1376 = new Class4_Sub1_Sub1_Sub5(this.method614(this.anInt895, local21, local25) - local930, local59 + anInt1054, local55 + anInt1054, this.anInt895, (byte) -115, local402, local21, local68, local75, local25, local52, local307);
										local1376.method432(local55 + anInt1054, local34, this.method614(this.anInt895, local29, local34) - local52, local29);
										this.aClass11_12.method163(local1376);
									}
								}
							}
						}
					}
				}
			}
		} catch (@Pc(1399) RuntimeException local1399) {
			signlink.reporterror("68578, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local1399.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(BI)V")
	private void method705(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1) {
		try {
			if (arg0 != 5) {
				for (@Pc(6) int local6 = 1; local6 > 0; local6++) {
				}
			}
			@Pc(14) Class28 local14 = Class28.method318(arg1);
			for (@Pc(16) int local16 = 0; local16 < local14.anIntArray91.length && local14.anIntArray91[local16] != -1; local16++) {
				@Pc(30) Class28 local30 = Class28.method318(local14.anIntArray91[local16]);
				if (local30.anInt447 == 1) {
					this.method705(this.aByte34, local30.anInt451);
				}
				local30.anInt440 = 0;
				local30.anInt448 = 0;
			}
		} catch (@Pc(54) RuntimeException local54) {
			signlink.reporterror("61926, " + arg0 + ", " + arg1 + ", " + local54.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "n", descriptor = "(B)V")
	private void method706() {
		try {
			if (aBoolean223 && this.anInt946 == 2 && Class44.anInt705 != this.anInt895) {
				this.method656(null, "Loading - please wait.");
				this.anInt946 = 1;
				this.aLong30 = System.currentTimeMillis();
			}
			if (this.anInt946 == 1) {
				@Pc(38) int local38 = this.method707(867);
				if (local38 != 0 && System.currentTimeMillis() - this.aLong30 > 360000L) {
					signlink.reporterror(this.aString20 + " glcfb " + this.aLong29 + "," + local38 + "," + aBoolean223 + "," + this.aClass34Array1[0] + "," + this.aClass8_Sub1_1.method103() + "," + this.anInt895 + "," + this.anInt851 + "," + this.anInt852);
					this.aLong30 = System.currentTimeMillis();
				}
			}
			if (this.anInt946 == 2 && this.anInt895 != this.anInt885) {
				this.anInt885 = this.anInt895;
				this.method596(this.anInt895);
			}
		} catch (@Pc(119) RuntimeException local119) {
			signlink.reporterror("13870, " + 33 + ", " + local119.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "F", descriptor = "(I)I")
	private int method707(@OriginalArg(0) int arg0) {
		try {
			for (@Pc(3) int local3 = 0; local3 < this.aByteArrayArray6.length; local3++) {
				if (this.aByteArrayArray6[local3] == null && this.anIntArray238[local3] != -1) {
					return -1;
				}
				if (this.aByteArrayArray5[local3] == null && this.anIntArray239[local3] != -1) {
					return -2;
				}
			}
			@Pc(39) boolean local39 = true;
			for (@Pc(41) int local41 = 0; local41 < this.aByteArrayArray6.length; local41++) {
				@Pc(48) byte[] local48 = this.aByteArrayArray5[local41];
				if (local48 != null) {
					@Pc(62) int local62 = (this.anIntArray237[local41] >> 8) * 64 - this.anInt1056;
					@Pc(74) int local74 = (this.anIntArray237[local41] & 0xFF) * 64 - this.anInt1057;
					if (this.aBoolean224) {
						local62 = 10;
						local74 = 10;
					}
					local39 &= Class44.method534(local62, local48, local74);
				}
			}
			if (!local39) {
				return -3;
			} else if (this.aBoolean266) {
				return -4;
			} else {
				this.anInt946 = 2;
				@Pc(111) boolean local111 = false;
				Class44.anInt705 = this.anInt895;
				this.method628();
				this.aClass4_Sub1_Sub4_7.method344(12);
				return 0;
			}
		} catch (@Pc(125) RuntimeException local125) {
			signlink.reporterror("59698, " + arg0 + ", " + local125.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILclient!ZQANNJZE;ILclient!PGNBHFUF;I)V")
	private void method708(@OriginalArg(0) int arg0, @OriginalArg(1) Class4_Sub1_Sub1_Sub2_Sub2 arg1, @OriginalArg(3) Class4_Sub1_Sub4 arg2, @OriginalArg(4) int arg3) {
		try {
			@Pc(13) int local13;
			@Pc(17) int local17;
			if ((arg3 & 0x20) != 0) {
				local13 = arg2.method355();
				local17 = arg2.method374();
				arg1.method564(anInt1054, local17, local13);
				arg1.anInt784 = anInt1054 + 300;
				arg1.anInt785 = arg2.method355();
				arg1.anInt786 = arg2.method375();
			}
			if ((arg3 & 0x200) != 0) {
				arg1.anInt759 = arg2.method383();
				local13 = arg2.method387();
				arg1.anInt763 = local13 >> 16;
				arg1.anInt762 = anInt1054 + (local13 & 0xFFFF);
				arg1.anInt760 = 0;
				arg1.anInt761 = 0;
				if (arg1.anInt762 > anInt1054) {
					arg1.anInt760 = -1;
				}
				if (arg1.anInt759 == 65535) {
					arg1.anInt759 = -1;
				}
			}
			if ((arg3 & 0x40) != 0) {
				arg1.aString14 = arg2.method362();
				if (arg1.aString14.charAt(0) == '~') {
					arg1.aString14 = arg1.aString14.substring(1);
					this.method588((byte) 8, 2, arg1.aString15, arg1.aString14);
				} else if (arg1 == aClass4_Sub1_Sub1_Sub2_Sub2_1) {
					this.method588((byte) 8, 2, arg1.aString15, arg1.aString14);
				}
				arg1.anInt755 = 0;
				arg1.anInt789 = 0;
				arg1.anInt770 = 150;
			}
			if ((arg3 & 0x4) != 0) {
				arg1.anInt769 = arg2.method383();
				if (arg1.anInt769 == 65535) {
					arg1.anInt769 = -1;
				}
			}
			if ((arg3 & 0x1) != 0) {
				local13 = arg2.method374();
				@Pc(159) byte[] local159 = new byte[local13];
				@Pc(165) Class4_Sub1_Sub4 local165 = new Class4_Sub1_Sub4(5, local159);
				arg2.method390(local13, local159);
				this.aClass4_Sub1_Sub4Array1[arg0] = local165;
				arg1.method565(this.anInt1037, local165);
			}
			if ((arg3 & 0x400) != 0) {
				local13 = arg2.method375();
				local17 = arg2.method355();
				arg1.method564(anInt1054, local17, local13);
				arg1.anInt784 = anInt1054 + 300;
				arg1.anInt785 = arg2.method375();
				arg1.anInt786 = arg2.method355();
			}
			if ((arg3 & 0x100) != 0) {
				arg1.anInt745 = arg2.method374();
				arg1.anInt747 = arg2.method374();
				arg1.anInt746 = arg2.method375();
				arg1.anInt748 = arg2.method355();
				arg1.anInt749 = arg2.method383() + anInt1054;
				arg1.anInt750 = arg2.method381() + anInt1054;
				arg1.anInt751 = arg2.method375();
				arg1.method560();
			}
			@Pc(272) int local272;
			if ((arg3 & 0x80) != 0) {
				local13 = arg2.method383();
				local17 = arg2.method355();
				local272 = arg2.method374();
				@Pc(275) int local275 = arg2.anInt506;
				if (arg1.aString15 != null && arg1.aBoolean204) {
					@Pc(285) long local285 = Class47.method550(arg1.aString15);
					@Pc(287) boolean local287 = false;
					if (local17 <= 1) {
						for (@Pc(292) int local292 = 0; local292 < this.anInt848; local292++) {
							if (this.aLongArray3[local292] == local285) {
								local287 = true;
								break;
							}
						}
					}
					if (!local287 && this.anInt1020 == 0) {
						try {
							this.aClass4_Sub1_Sub4_9.anInt506 = 0;
							arg2.method389(this.aClass4_Sub1_Sub4_9.aByteArray10, local272);
							this.aClass4_Sub1_Sub4_9.anInt506 = 0;
							@Pc(337) String local337 = Class19.method219(local272, this.aClass4_Sub1_Sub4_9);
							@Pc(341) String local341 = Class1.method11(local337, 753);
							arg1.aString14 = local341;
							arg1.anInt755 = local13 >> 8;
							arg1.anInt789 = local13 & 0xFF;
							arg1.anInt770 = 150;
							if (local17 == 2 || local17 == 3) {
								this.method588((byte) 8, 1, "@cr2@" + arg1.aString15, local341);
							} else if (local17 == 1) {
								this.method588((byte) 8, 1, "@cr1@" + arg1.aString15, local341);
							} else {
								this.method588((byte) 8, 2, arg1.aString15, local341);
							}
						} catch (@Pc(405) Exception local405) {
							signlink.reporterror("cde2");
						}
					}
				}
				arg2.anInt506 = local275 + local272;
			}
			if ((arg3 & 0x8) != 0) {
				arg1.anInt743 = arg2.method382();
				arg1.anInt744 = arg2.method381();
			}
			if ((arg3 & 0x2) != 0) {
				local13 = arg2.method383();
				if (local13 == 65535) {
					local13 = -1;
				}
				local17 = arg2.method373();
				if (local13 == arg1.anInt777 && local13 != -1) {
					local272 = Class21.aClass21Array1[local13].anInt377;
					if (local272 == 1) {
						arg1.anInt778 = 0;
						arg1.anInt779 = 0;
						arg1.anInt780 = local17;
						arg1.anInt781 = 0;
					}
					if (local272 == 2) {
						arg1.anInt781 = 0;
						return;
					}
				} else if (local13 == -1 || arg1.anInt777 == -1 || Class21.aClass21Array1[local13].anInt371 >= Class21.aClass21Array1[arg1.anInt777].anInt371) {
					arg1.anInt777 = local13;
					arg1.anInt778 = 0;
					arg1.anInt779 = 0;
					arg1.anInt780 = local17;
					arg1.anInt781 = 0;
					arg1.anInt776 = arg1.anInt758;
				}
			}
		} catch (@Pc(516) RuntimeException local516) {
			signlink.reporterror("65997, " + arg0 + ", " + arg1 + ", " + -252 + ", " + arg2 + ", " + arg3 + ", " + local516.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "([BZI)V")
	private void method709(@OriginalArg(0) byte[] arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2) {
		try {
			@Pc(3) boolean local3 = false;
			if (this.aBoolean244) {
				signlink.anInt1083 = arg1 ? 1 : 0;
				signlink.midisave(arg0, arg0.length);
			}
		} catch (@Pc(19) RuntimeException local19) {
			signlink.reporterror("14981, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local19.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "o", descriptor = "(B)V")
	private void method710(@OriginalArg(0) byte arg0) {
		try {
			@Pc(4) boolean local4 = false;
			if (super.anInt840 == 1) {
				if (super.anInt841 >= 6 && super.anInt841 <= 106 && super.anInt842 >= 467 && super.anInt842 <= 499) {
					this.anInt978 = (this.anInt978 + 1) % 4;
					this.aBoolean250 = true;
					this.aBoolean247 = true;
					this.aClass4_Sub1_Sub4_7.method344(72);
					this.aClass4_Sub1_Sub4_7.method345(this.anInt978);
					this.aClass4_Sub1_Sub4_7.method345(this.anInt970);
					this.aClass4_Sub1_Sub4_7.method345(this.anInt1002);
				}
				if (super.anInt841 >= 135 && super.anInt841 <= 235 && super.anInt842 >= 467 && super.anInt842 <= 499) {
					this.anInt970 = (this.anInt970 + 1) % 3;
					this.aBoolean250 = true;
					this.aBoolean247 = true;
					this.aClass4_Sub1_Sub4_7.method344(72);
					this.aClass4_Sub1_Sub4_7.method345(this.anInt978);
					this.aClass4_Sub1_Sub4_7.method345(this.anInt970);
					this.aClass4_Sub1_Sub4_7.method345(this.anInt1002);
				}
				if (super.anInt841 >= 273 && super.anInt841 <= 373 && super.anInt842 >= 467 && super.anInt842 <= 499) {
					this.anInt1002 = (this.anInt1002 + 1) % 3;
					this.aBoolean250 = true;
					this.aBoolean247 = true;
					this.aClass4_Sub1_Sub4_7.method344(72);
					this.aClass4_Sub1_Sub4_7.method345(this.anInt978);
					this.aClass4_Sub1_Sub4_7.method345(this.anInt970);
					this.aClass4_Sub1_Sub4_7.method345(this.anInt1002);
				}
				if (super.anInt841 >= 412 && super.anInt841 <= 512 && super.anInt842 >= 467 && super.anInt842 <= 499) {
					if (this.anInt951 == -1) {
						this.method721();
						this.aString17 = "";
						this.aBoolean262 = false;
						this.anInt999 = this.anInt951 = Class28.anInt439;
						return;
					}
					this.method588((byte) 8, 0, "", "Please close the interface you have open before using 'report abuse'");
					return;
				}
			}
		} catch (@Pc(207) RuntimeException local207) {
			signlink.reporterror("33097, " + arg0 + ", " + local207.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "G", descriptor = "(I)Ljava/lang/String;")
	private String method711() {
		try {
			this.anInt859 += 0;
			if (signlink.mainapp == null) {
				return super.aFrame_Sub1_2 == null ? super.getDocumentBase().getHost().toLowerCase() : "runescape.com";
			} else {
				return signlink.mainapp.getDocumentBase().getHost().toLowerCase();
			}
		} catch (@Pc(23) RuntimeException local23) {
			signlink.reporterror("15325, " + 0 + ", " + local23.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ZLclient!PGNBHFUF;I)V")
	private void method712(@OriginalArg(1) Class4_Sub1_Sub4 arg0, @OriginalArg(2) int arg1) {
		try {
			this.anInt1045 = 0;
			this.anInt950 = 0;
			this.method592(arg0, arg1);
			this.method635(arg0, arg1);
			this.method634(arg0, arg1);
			@Pc(37) int local37;
			for (@Pc(30) int local30 = 0; local30 < this.anInt1045; local30++) {
				local37 = this.anIntArray270[local30];
				if (this.aClass4_Sub1_Sub1_Sub2_Sub1Array1[local37].anInt782 != anInt1054) {
					this.aClass4_Sub1_Sub1_Sub2_Sub1Array1[local37].aClass40_1 = null;
					this.aClass4_Sub1_Sub1_Sub2_Sub1Array1[local37] = null;
				}
			}
			if (arg0.anInt506 != arg1) {
				signlink.reporterror(this.aString20 + " size mismatch in getnpcpos - pos:" + arg0.anInt506 + " psize:" + arg1);
				throw new RuntimeException("eek");
			}
			for (local37 = 0; local37 < this.anInt1013; local37++) {
				if (this.aClass4_Sub1_Sub1_Sub2_Sub1Array1[this.anIntArray256[local37]] == null) {
					signlink.reporterror(this.aString20 + " null entry in npc list - pos:" + local37 + " size:" + this.anInt1013);
					throw new RuntimeException("eek");
				}
			}
		} catch (@Pc(127) RuntimeException local127) {
			signlink.reporterror("31299, " + false + ", " + arg0 + ", " + arg1 + ", " + local127.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIIBLclient!NPNTBMMX;II)V")
	private void method713(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte arg4, @OriginalArg(5) Class28 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		try {
			@Pc(6) boolean local6 = false;
			if (arg5.anInt447 == 0 && arg5.anIntArray91 != null && !arg5.aBoolean117 && (arg6 >= arg3 && arg2 >= arg0 && arg6 <= arg3 + arg5.anInt426 && arg2 <= arg0 + arg5.anInt423)) {
				@Pc(46) int local46 = arg5.anIntArray91.length;
				for (@Pc(48) int local48 = 0; local48 < local46; local48++) {
					@Pc(57) int local57 = arg5.anIntArray89[local48] + arg3;
					@Pc(66) int local66 = arg5.anIntArray90[local48] + arg0 - arg1;
					@Pc(72) Class28 local72 = Class28.method318(arg5.anIntArray91[local48]);
					@Pc(77) int local77 = local57 + local72.anInt438;
					@Pc(82) int local82 = local66 + local72.anInt430;
					if ((local72.anInt422 >= 0 || local72.anInt435 != 0) && arg6 >= local77 && arg2 >= local82 && arg6 < local77 + local72.anInt426 && arg2 < local82 + local72.anInt423) {
						if (local72.anInt422 >= 0) {
							this.anInt903 = local72.anInt422;
						} else {
							this.anInt903 = local72.anInt451;
						}
					}
					if (local72.anInt447 == 8 && arg6 >= local77 && arg2 >= local82 && arg6 < local77 + local72.anInt426 && arg2 < local82 + local72.anInt423) {
						this.anInt847 = local72.anInt451;
					}
					if (local72.anInt447 == 0) {
						this.method713(local82, local72.anInt449, arg2, local77, (byte) 3, local72, arg6, arg7);
						if (local72.anInt437 > local72.anInt423) {
							this.method595(arg2, local82, local72, local77 + local72.anInt426, arg7, 706, arg6, local72.anInt437, local72.anInt423);
						}
					} else {
						if (local72.anInt459 == 1 && arg6 >= local77 && arg2 >= local82 && arg6 < local77 + local72.anInt426 && arg2 < local82 + local72.anInt423) {
							@Pc(206) boolean local206 = false;
							if (local72.anInt458 != 0) {
								local206 = this.method633(local72);
							}
							if (!local206) {
								this.aStringArray12[this.anInt989] = local72.aString10;
								this.anIntArray253[this.anInt989] = 208;
								this.anIntArray252[this.anInt989] = local72.anInt451;
								this.anInt989++;
							}
						}
						if (local72.anInt459 == 2 && this.anInt1067 == 0 && arg6 >= local77 && arg2 >= local82 && arg6 < local77 + local72.anInt426 && arg2 < local82 + local72.anInt423) {
							@Pc(270) String local270 = local72.aString7;
							if (local270.indexOf(" ") != -1) {
								local270 = local270.substring(0, local270.indexOf(" "));
							}
							this.aStringArray12[this.anInt989] = local270 + " @gre@" + local72.aString11;
							this.anIntArray253[this.anInt989] = 444;
							this.anIntArray252[this.anInt989] = local72.anInt451;
							this.anInt989++;
						}
						if (local72.anInt459 == 3 && arg6 >= local77 && arg2 >= local82 && arg6 < local77 + local72.anInt426 && arg2 < local82 + local72.anInt423) {
							this.aStringArray12[this.anInt989] = "Close";
							if (arg7 == 3) {
								this.anIntArray253[this.anInt989] = 178;
							} else {
								this.anIntArray253[this.anInt989] = 368;
							}
							this.anIntArray252[this.anInt989] = local72.anInt451;
							this.anInt989++;
						}
						if (local72.anInt459 == 4 && arg6 >= local77 && arg2 >= local82 && arg6 < local77 + local72.anInt426 && arg2 < local82 + local72.anInt423) {
							this.aStringArray12[this.anInt989] = local72.aString10;
							this.anIntArray253[this.anInt989] = 407;
							this.anIntArray252[this.anInt989] = local72.anInt451;
							this.anInt989++;
						}
						if (local72.anInt459 == 5 && arg6 >= local77 && arg2 >= local82 && arg6 < local77 + local72.anInt426 && arg2 < local82 + local72.anInt423) {
							this.aStringArray12[this.anInt989] = local72.aString10;
							this.anIntArray253[this.anInt989] = 105;
							this.anIntArray252[this.anInt989] = local72.anInt451;
							this.anInt989++;
						}
						if (local72.anInt459 == 6 && !this.aBoolean256 && arg6 >= local77 && arg2 >= local82 && arg6 < local77 + local72.anInt426 && arg2 < local82 + local72.anInt423) {
							this.aStringArray12[this.anInt989] = local72.aString10;
							this.anIntArray253[this.anInt989] = 284;
							this.anIntArray252[this.anInt989] = local72.anInt451;
							this.anInt989++;
						}
						if (local72.anInt447 == 2) {
							@Pc(529) int local529 = 0;
							for (@Pc(531) int local531 = 0; local531 < local72.anInt423; local531++) {
								for (@Pc(535) int local535 = 0; local535 < local72.anInt426; local535++) {
									@Pc(546) int local546 = local77 + local535 * (local72.anInt436 + 32);
									@Pc(555) int local555 = local82 + local531 * (local72.anInt427 + 32);
									if (local529 < 20) {
										local546 += local72.anIntArray92[local529];
										local555 += local72.anIntArray88[local529];
									}
									if (arg6 >= local546 && arg2 >= local555 && arg6 < local546 + 32 && arg2 < local555 + 32) {
										this.anInt849 = local529;
										this.anInt850 = local72.anInt451;
										if (local72.anIntArray94[local529] > 0) {
											@Pc(608) Class17 local608 = Class17.method196(local72.anIntArray94[local529] - 1);
											if (this.anInt1021 == 1 && local72.aBoolean119) {
												if (local72.anInt451 != this.anInt1023 || local529 != this.anInt1022) {
													this.aStringArray12[this.anInt989] = "Use " + this.aString29 + " with @lre@" + local608.aString6;
													this.anIntArray253[this.anInt989] = 835;
													this.anIntArray254[this.anInt989] = local608.anInt286;
													this.anIntArray251[this.anInt989] = local529;
													this.anIntArray252[this.anInt989] = local72.anInt451;
													this.anInt989++;
												}
											} else if (this.anInt1067 != 1 || !local72.aBoolean119) {
												@Pc(745) int local745;
												if (local72.aBoolean119) {
													for (local745 = 4; local745 >= 3; local745--) {
														if (local608.aStringArray4 != null && local608.aStringArray4[local745] != null) {
															this.aStringArray12[this.anInt989] = local608.aStringArray4[local745] + " @lre@" + local608.aString6;
															if (local745 == 3) {
																this.anIntArray253[this.anInt989] = 537;
															}
															if (local745 == 4) {
																this.anIntArray253[this.anInt989] = 996;
															}
															this.anIntArray254[this.anInt989] = local608.anInt286;
															this.anIntArray251[this.anInt989] = local529;
															this.anIntArray252[this.anInt989] = local72.anInt451;
															this.anInt989++;
														} else if (local745 == 4) {
															this.aStringArray12[this.anInt989] = "Drop @lre@" + local608.aString6;
															this.anIntArray253[this.anInt989] = 996;
															this.anIntArray254[this.anInt989] = local608.anInt286;
															this.anIntArray251[this.anInt989] = local529;
															this.anIntArray252[this.anInt989] = local72.anInt451;
															this.anInt989++;
														}
													}
												}
												if (local72.aBoolean113) {
													this.aStringArray12[this.anInt989] = "Use @lre@" + local608.aString6;
													this.anIntArray253[this.anInt989] = 728;
													this.anIntArray254[this.anInt989] = local608.anInt286;
													this.anIntArray251[this.anInt989] = local529;
													this.anIntArray252[this.anInt989] = local72.anInt451;
													this.anInt989++;
												}
												if (local72.aBoolean119 && local608.aStringArray4 != null) {
													for (local745 = 2; local745 >= 0; local745--) {
														if (local608.aStringArray4[local745] != null) {
															this.aStringArray12[this.anInt989] = local608.aStringArray4[local745] + " @lre@" + local608.aString6;
															if (local745 == 0) {
																this.anIntArray253[this.anInt989] = 358;
															}
															if (local745 == 1) {
																this.anIntArray253[this.anInt989] = 177;
															}
															if (local745 == 2) {
																this.anIntArray253[this.anInt989] = 839;
															}
															this.anIntArray254[this.anInt989] = local608.anInt286;
															this.anIntArray251[this.anInt989] = local529;
															this.anIntArray252[this.anInt989] = local72.anInt451;
															this.anInt989++;
														}
													}
												}
												if (local72.aStringArray5 != null) {
													for (local745 = 4; local745 >= 0; local745--) {
														if (local72.aStringArray5[local745] != null) {
															this.aStringArray12[this.anInt989] = local72.aStringArray5[local745] + " @lre@" + local608.aString6;
															if (local745 == 0) {
																this.anIntArray253[this.anInt989] = 277;
															}
															if (local745 == 1) {
																this.anIntArray253[this.anInt989] = 73;
															}
															if (local745 == 2) {
																this.anIntArray253[this.anInt989] = 664;
															}
															if (local745 == 3) {
																this.anIntArray253[this.anInt989] = 127;
															}
															if (local745 == 4) {
																this.anIntArray253[this.anInt989] = 906;
															}
															this.anIntArray254[this.anInt989] = local608.anInt286;
															this.anIntArray251[this.anInt989] = local529;
															this.anIntArray252[this.anInt989] = local72.anInt451;
															this.anInt989++;
														}
													}
												}
												this.aStringArray12[this.anInt989] = "Examine @lre@" + local608.aString6;
												this.anIntArray253[this.anInt989] = 1516;
												this.anIntArray254[this.anInt989] = local608.anInt286;
												this.anIntArray251[this.anInt989] = local529;
												this.anIntArray252[this.anInt989] = local72.anInt451;
												this.anInt989++;
											} else if ((this.anInt1069 & 0x10) == 16) {
												this.aStringArray12[this.anInt989] = this.aString31 + " @lre@" + local608.aString6;
												this.anIntArray253[this.anInt989] = 206;
												this.anIntArray254[this.anInt989] = local608.anInt286;
												this.anIntArray251[this.anInt989] = local529;
												this.anIntArray252[this.anInt989] = local72.anInt451;
												this.anInt989++;
											}
										}
									}
									local529++;
								}
							}
						}
					}
				}
			}
		} catch (@Pc(1175) RuntimeException local1175) {
			signlink.reporterror("72711, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + local1175.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "H", descriptor = "(I)V")
	private void method714() {
		try {
			Class7.aClass49_2.method572();
			Class7.aClass49_3.method572();
			Class40.aClass49_8.method572();
			Class17.aClass49_5.method572();
			Class17.aClass49_4.method572();
			Class4_Sub1_Sub1_Sub2_Sub2.aClass49_9.method572();
			Class6.aClass49_1.method572();
		} catch (@Pc(21) RuntimeException local21) {
			signlink.reporterror("30010, " + -620 + ", " + local21.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
	@Override
	public String getParameter(@OriginalArg(0) String arg0) {
		return signlink.mainapp == null ? super.getParameter(arg0) : signlink.mainapp.getParameter(arg0);
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(BI)V")
	private void method715(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1) {
		try {
			if (arg0 != 7) {
				for (@Pc(4) int local4 = 1; local4 > 0; local4++) {
				}
			}
			Class28.method323(aByte32, arg1);
		} catch (@Pc(14) RuntimeException local14) {
			signlink.reporterror("46495, " + arg0 + ", " + arg1 + ", " + local14.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "I", descriptor = "(I)Ljava/net/Socket;")
	public Socket method716(@OriginalArg(0) int arg0) throws IOException {
		return signlink.mainapp == null ? new Socket(InetAddress.getByName(this.getCodeBase().getHost()), arg0) : signlink.opensocket(arg0);
	}

	@OriginalMember(owner = "client!client", name = "p", descriptor = "(B)Z")
	private boolean method717() {
		try {
			if (this.aClass15_1 == null) {
				return false;
			}
			@Pc(2125) String local2125;
			@Pc(819) int local819;
			try {
				@Pc(15) int local15 = this.aClass15_1.method185();
				if (local15 == 0) {
					return false;
				}
				if (this.anInt860 == -1) {
					this.aClass15_1.method186(this.aClass4_Sub1_Sub4_8.aByteArray10, 0, 1);
					this.anInt860 = this.aClass4_Sub1_Sub4_8.aByteArray10[0] & 0xFF;
					if (this.aClass3_2 != null) {
						this.anInt860 = this.anInt860 - this.aClass3_2.method51() & 0xFF;
					}
					this.anInt859 = Class33.anIntArray146[this.anInt860];
					local15--;
				}
				if (this.anInt859 == -1) {
					if (local15 <= 0) {
						return false;
					}
					this.aClass15_1.method186(this.aClass4_Sub1_Sub4_8.aByteArray10, 0, 1);
					this.anInt859 = this.aClass4_Sub1_Sub4_8.aByteArray10[0] & 0xFF;
					local15--;
				}
				if (this.anInt859 == -2) {
					if (local15 <= 1) {
						return false;
					}
					this.aClass15_1.method186(this.aClass4_Sub1_Sub4_8.aByteArray10, 0, 2);
					this.aClass4_Sub1_Sub4_8.anInt506 = 0;
					this.anInt859 = this.aClass4_Sub1_Sub4_8.method357();
					local15 -= 2;
				}
				if (local15 < this.anInt859) {
					return false;
				}
				this.aClass4_Sub1_Sub4_8.anInt506 = 0;
				this.aClass15_1.method186(this.aClass4_Sub1_Sub4_8.aByteArray10, 0, this.anInt859);
				this.anInt861 = 0;
				this.anInt1064 = this.anInt1063;
				this.anInt1063 = this.anInt1062;
				this.anInt1062 = this.anInt860;
				if (this.anInt860 == 173) {
					this.anInt953 = this.aClass4_Sub1_Sub4_8.method382() * 30;
					this.anInt860 = -1;
					return true;
				}
				@Pc(181) int local181;
				@Pc(189) int local189;
				@Pc(291) int local291;
				@Pc(324) int local324;
				@Pc(177) long local177;
				if (this.anInt860 == 166) {
					local177 = this.aClass4_Sub1_Sub4_8.method361();
					local181 = this.aClass4_Sub1_Sub4_8.method355();
					@Pc(187) String local187 = Class47.method554(Class47.method551(local177));
					for (local189 = 0; local189 < this.anInt957; local189++) {
						if (local177 == this.aLongArray4[local189]) {
							if (this.anIntArray235[local189] != local181) {
								this.anIntArray235[local189] = local181;
								this.aBoolean246 = true;
								if (local181 > 0) {
									this.method588((byte) 8, 5, "", local187 + " has logged in.");
								}
								if (local181 == 0) {
									this.method588((byte) 8, 5, "", local187 + " has logged out.");
								}
							}
							local187 = null;
							break;
						}
					}
					if (local187 != null && this.anInt957 < 200) {
						this.aLongArray4[this.anInt957] = local177;
						this.aStringArray11[this.anInt957] = local187;
						this.anIntArray235[this.anInt957] = local181;
						this.anInt957++;
						this.aBoolean246 = true;
					}
					@Pc(285) boolean local285 = false;
					while (!local285) {
						local285 = true;
						for (local291 = 0; local291 < this.anInt957 - 1; local291++) {
							if (this.anIntArray235[local291] != anInt874 && this.anIntArray235[local291 + 1] == anInt874 || this.anIntArray235[local291] == 0 && this.anIntArray235[local291 + 1] != 0) {
								local324 = this.anIntArray235[local291];
								this.anIntArray235[local291] = this.anIntArray235[local291 + 1];
								this.anIntArray235[local291 + 1] = local324;
								@Pc(346) String local346 = this.aStringArray11[local291];
								this.aStringArray11[local291] = this.aStringArray11[local291 + 1];
								this.aStringArray11[local291 + 1] = local346;
								@Pc(368) long local368 = this.aLongArray4[local291];
								this.aLongArray4[local291] = this.aLongArray4[local291 + 1];
								this.aLongArray4[local291 + 1] = local368;
								this.aBoolean246 = true;
								local285 = false;
							}
						}
					}
					this.anInt860 = -1;
					return true;
				}
				@Pc(424) int local424;
				@Pc(415) int local415;
				@Pc(418) Class28 local418;
				if (this.anInt860 == 237) {
					this.aBoolean246 = true;
					local415 = this.aClass4_Sub1_Sub4_8.method357();
					local418 = Class28.method318(local415);
					local181 = this.aClass4_Sub1_Sub4_8.method357();
					for (local424 = 0; local424 < local181; local424++) {
						local418.anIntArray94[local424] = this.aClass4_Sub1_Sub4_8.method381();
						local189 = this.aClass4_Sub1_Sub4_8.method375();
						if (local189 == 255) {
							local189 = this.aClass4_Sub1_Sub4_8.method387();
						}
						local418.anIntArray95[local424] = local189;
					}
					for (local189 = local181; local189 < local418.anIntArray94.length; local189++) {
						local418.anIntArray94[local189] = 0;
						local418.anIntArray95[local189] = 0;
					}
					this.anInt860 = -1;
					return true;
				}
				if (this.anInt860 == 165) {
					local415 = this.aClass4_Sub1_Sub4_8.method357();
					this.method705(this.aByte34, local415);
					if (this.anInt995 != -1) {
						this.method715(aByte32, this.anInt995);
						this.anInt995 = -1;
						this.aBoolean246 = true;
						this.aBoolean254 = true;
					}
					if (this.anInt955 != -1) {
						this.method715(aByte32, this.anInt955);
						this.anInt955 = -1;
						this.aBoolean247 = true;
					}
					if (this.anInt1015 != -1) {
						this.method715(aByte32, this.anInt1015);
						this.anInt1015 = -1;
						this.aBoolean243 = true;
					}
					if (this.anInt988 != -1) {
						this.method715(aByte32, this.anInt988);
						this.anInt988 = -1;
					}
					if (this.anInt951 != local415) {
						this.method715(aByte32, this.anInt951);
						this.anInt951 = local415;
					}
					if (this.anInt996 != 0) {
						this.anInt996 = 0;
						this.aBoolean247 = true;
					}
					this.aBoolean256 = false;
					this.anInt860 = -1;
					return true;
				}
				if (this.anInt860 == 159) {
					this.method686(this.anInt859, this.aClass4_Sub1_Sub4_8);
					this.aBoolean266 = false;
					this.anInt860 = -1;
					return true;
				}
				if (this.anInt860 == 67) {
					this.anInt848 = this.anInt859 / 8;
					for (local415 = 0; local415 < this.anInt848; local415++) {
						this.aLongArray3[local415] = this.aClass4_Sub1_Sub4_8.method361();
					}
					this.anInt860 = -1;
					return true;
				}
				@Pc(655) int local655;
				@Pc(653) boolean local653;
				@Pc(722) String local722;
				if (this.anInt860 == 220) {
					local177 = this.aClass4_Sub1_Sub4_8.method361();
					local181 = this.aClass4_Sub1_Sub4_8.method360();
					local424 = this.aClass4_Sub1_Sub4_8.method355();
					local653 = false;
					for (local655 = 0; local655 < 100; local655++) {
						if (this.anIntArray261[local655] == local181) {
							local653 = true;
							break;
						}
					}
					if (local424 <= 1) {
						for (local291 = 0; local291 < this.anInt848; local291++) {
							if (this.aLongArray3[local291] == local177) {
								local653 = true;
								break;
							}
						}
					}
					if (!local653 && this.anInt1020 == 0) {
						try {
							this.anIntArray261[this.anInt1066] = local181;
							this.anInt1066 = (this.anInt1066 + 1) % 100;
							local722 = Class19.method219(this.anInt859 - 13, this.aClass4_Sub1_Sub4_8);
							if (local424 != 3) {
								local722 = Class1.method11(local722, 753);
							}
							if (local424 == 2 || local424 == 3) {
								this.method588((byte) 8, 7, "@cr2@" + Class47.method554(Class47.method551(local177)), local722);
							} else if (local424 == 1) {
								this.method588((byte) 8, 7, "@cr1@" + Class47.method554(Class47.method551(local177)), local722);
							} else {
								this.method588((byte) 8, 3, Class47.method554(Class47.method551(local177)), local722);
							}
						} catch (@Pc(786) Exception local786) {
							signlink.reporterror("cde1");
						}
					}
					this.anInt860 = -1;
					return true;
				}
				if (this.anInt860 == 236) {
					this.anInt865 = 0;
					this.anInt860 = -1;
					return true;
				}
				if (this.anInt860 == 253) {
					local415 = this.aClass4_Sub1_Sub4_8.method382();
					local819 = this.aClass4_Sub1_Sub4_8.method357();
					Class28.method318(local819).anInt444 = 2;
					Class28.method318(local819).anInt445 = local415;
					this.anInt860 = -1;
					return true;
				}
				if (this.anInt860 == 248) {
					local415 = this.aClass4_Sub1_Sub4_8.method382();
					local819 = this.aClass4_Sub1_Sub4_8.method357();
					this.method705(this.aByte34, local415);
					if (local819 != -1) {
						this.method705(this.aByte34, local819);
					}
					if (this.anInt951 != -1) {
						this.method715(aByte32, this.anInt951);
						this.anInt951 = -1;
					}
					if (this.anInt995 != -1) {
						this.method715(aByte32, this.anInt995);
						this.anInt995 = -1;
					}
					if (this.anInt955 != -1) {
						this.method715(aByte32, this.anInt955);
						this.anInt955 = -1;
					}
					if (this.anInt1015 != local415) {
						this.method715(aByte32, this.anInt1015);
						this.anInt1015 = local415;
					}
					if (this.anInt988 != local415) {
						this.method715(aByte32, this.anInt988);
						this.anInt988 = local819;
					}
					this.anInt996 = 0;
					this.aBoolean256 = false;
					this.anInt860 = -1;
					return true;
				}
				if (this.anInt860 == 183) {
					this.anInt944 = this.aClass4_Sub1_Sub4_8.method355();
					this.anInt860 = -1;
					return true;
				}
				if (this.anInt860 == 104) {
					this.aBoolean246 = true;
					local415 = this.aClass4_Sub1_Sub4_8.method357();
					local418 = Class28.method318(local415);
					while (this.aClass4_Sub1_Sub4_8.anInt506 < this.anInt859) {
						local181 = this.aClass4_Sub1_Sub4_8.method369();
						local424 = this.aClass4_Sub1_Sub4_8.method357();
						local189 = this.aClass4_Sub1_Sub4_8.method355();
						if (local189 == 255) {
							local189 = this.aClass4_Sub1_Sub4_8.method360();
						}
						if (local181 >= 0 && local181 < local418.anIntArray94.length) {
							local418.anIntArray94[local181] = local424;
							local418.anIntArray95[local181] = local189;
						}
					}
					this.anInt860 = -1;
					return true;
				}
				if (this.anInt860 == 233) {
					local415 = this.aClass4_Sub1_Sub4_8.method357();
					local819 = this.aClass4_Sub1_Sub4_8.method381();
					local181 = local819 >> 10 & 0x1F;
					local424 = local819 >> 5 & 0x1F;
					local189 = local819 & 0x1F;
					Class28.method318(local415).anInt441 = (local181 << 19) + (local424 << 11) + (local189 << 3);
					this.anInt860 = -1;
					return true;
				}
				if (this.anInt860 == 59) {
					this.method712(this.aClass4_Sub1_Sub4_8, this.anInt859);
					this.anInt860 = -1;
					return true;
				}
				if (this.anInt860 == 235) {
					if (this.anInt994 == 12) {
						this.aBoolean246 = true;
					}
					this.anInt882 = this.aClass4_Sub1_Sub4_8.method355();
					this.anInt860 = -1;
					return true;
				}
				if (this.anInt860 == 176) {
					for (local415 = 0; local415 < this.anIntArray249.length; local415++) {
						if (this.anIntArray249[local415] != this.anIntArray214[local415]) {
							this.anIntArray249[local415] = this.anIntArray214[local415];
							this.method723(local415);
							this.aBoolean246 = true;
						}
					}
					this.anInt860 = -1;
					return true;
				}
				if (this.anInt860 == 174) {
					local415 = this.aClass4_Sub1_Sub4_8.method381();
					local819 = this.aClass4_Sub1_Sub4_8.method387();
					this.anIntArray214[local415] = local819;
					if (this.anIntArray249[local415] != local819) {
						this.anIntArray249[local415] = local819;
						this.method723(local415);
						this.aBoolean246 = true;
						if (this.anInt1075 != -1) {
							this.aBoolean247 = true;
						}
					}
					this.anInt860 = -1;
					return true;
				}
				if (this.anInt860 == 11) {
					this.anInt942 = this.aClass4_Sub1_Sub4_8.method375();
					this.anInt943 = this.aClass4_Sub1_Sub4_8.method374();
					while (this.aClass4_Sub1_Sub4_8.anInt506 < this.anInt859) {
						local415 = this.aClass4_Sub1_Sub4_8.method355();
						this.method704(this.aByte29, this.aClass4_Sub1_Sub4_8, local415);
					}
					this.anInt860 = -1;
					return true;
				}
				if (this.anInt860 == 28) {
					this.anInt943 = this.aClass4_Sub1_Sub4_8.method375();
					this.anInt942 = this.aClass4_Sub1_Sub4_8.method355();
					for (local415 = this.anInt942; local415 < this.anInt942 + 8; local415++) {
						for (local819 = this.anInt943; local819 < this.anInt943 + 8; local819++) {
							if (this.aClass11ArrayArrayArray1[this.anInt895][local415][local819] != null) {
								this.aClass11ArrayArrayArray1[this.anInt895][local415][local819] = null;
								this.method594(local415, local819);
							}
						}
					}
					for (@Pc(1291) Class4_Sub2 local1291 = (Class4_Sub2) this.aClass11_11.method166(); local1291 != null; local1291 = (Class4_Sub2) this.aClass11_11.method168()) {
						if (local1291.anInt314 >= this.anInt942 && local1291.anInt314 < this.anInt942 + 8 && local1291.anInt315 >= this.anInt943 && local1291.anInt315 < this.anInt943 + 8 && local1291.anInt312 == this.anInt895) {
							local1291.anInt307 = 0;
						}
					}
					this.anInt860 = -1;
					return true;
				}
				if (this.anInt860 == 192) {
					this.anInt1010 = this.aClass4_Sub1_Sub4_8.method355();
					if (this.anInt1010 == this.anInt994) {
						if (this.anInt1010 == 3) {
							this.anInt994 = 1;
						} else {
							this.anInt994 = 3;
						}
						this.aBoolean246 = true;
					}
					this.anInt860 = -1;
					return true;
				}
				if (this.anInt860 == 239) {
					local415 = this.aClass4_Sub1_Sub4_8.method383();
					local819 = this.aClass4_Sub1_Sub4_8.method358();
					local181 = this.aClass4_Sub1_Sub4_8.method384();
					@Pc(1393) Class28 local1393 = Class28.method318(local415);
					local1393.anInt438 = local819;
					local1393.anInt430 = local181;
					this.anInt860 = -1;
					return true;
				}
				if (this.anInt860 == 203) {
					this.anInt1065 = this.aClass4_Sub1_Sub4_8.method357();
					this.anInt873 = this.aClass4_Sub1_Sub4_8.method360();
					this.anInt1003 = this.aClass4_Sub1_Sub4_8.method357();
					this.anInt905 = this.aClass4_Sub1_Sub4_8.method381();
					this.anInt854 = this.aClass4_Sub1_Sub4_8.method382();
					this.anInt894 = this.aClass4_Sub1_Sub4_8.method383();
					this.aClass4_Sub1_Sub4_8.method375();
					this.anInt917 = this.aClass4_Sub1_Sub4_8.method382();
					this.anInt853 = this.aClass4_Sub1_Sub4_8.method383();
					this.aClass4_Sub1_Sub4_8.method381();
					this.anInt1009 = this.aClass4_Sub1_Sub4_8.method382();
					signlink.dnslookup(Class47.method553(this.anInt873));
					this.anInt860 = -1;
					return true;
				}
				if (this.anInt860 == 55) {
					if (this.anInt995 != -1) {
						this.method715(aByte32, this.anInt995);
						this.anInt995 = -1;
						this.aBoolean246 = true;
						this.aBoolean254 = true;
					}
					if (this.anInt955 != -1) {
						this.method715(aByte32, this.anInt955);
						this.anInt955 = -1;
						this.aBoolean247 = true;
					}
					if (this.anInt1015 != -1) {
						this.method715(aByte32, this.anInt1015);
						this.anInt1015 = -1;
						this.aBoolean243 = true;
					}
					if (this.anInt988 != -1) {
						this.method715(aByte32, this.anInt988);
						this.anInt988 = -1;
					}
					if (this.anInt951 != -1) {
						this.method715(aByte32, this.anInt951);
						this.anInt951 = -1;
					}
					if (this.anInt996 != 0) {
						this.anInt996 = 0;
						this.aBoolean247 = true;
					}
					this.aBoolean256 = false;
					this.anInt860 = -1;
					return true;
				}
				if (this.anInt860 == 249) {
					this.anInt987 = this.aClass4_Sub1_Sub4_8.method355();
					this.anInt860 = -1;
					return true;
				}
				if (this.anInt860 == 10) {
					local415 = this.aClass4_Sub1_Sub4_8.method357();
					local819 = this.aClass4_Sub1_Sub4_8.method355();
					local181 = this.aClass4_Sub1_Sub4_8.method357();
					if (local181 == 65535) {
						if (this.anInt935 < 50) {
							this.anIntArray266[this.anInt935] = (short) local415;
							this.anIntArray267[this.anInt935] = local819;
							this.anIntArray220[this.anInt935] = 0;
							this.anInt935++;
						}
					} else if (this.aBoolean261 && !aBoolean223 && this.anInt935 < 50) {
						this.anIntArray266[this.anInt935] = local415;
						this.anIntArray267[this.anInt935] = local819;
						this.anIntArray220[this.anInt935] = local181 + Class36.anIntArray147[local415];
						this.anInt935++;
					}
					this.anInt860 = -1;
					return true;
				}
				if (this.anInt860 == 36) {
					local415 = this.aClass4_Sub1_Sub4_8.method355();
					local819 = this.aClass4_Sub1_Sub4_8.method355();
					local181 = this.aClass4_Sub1_Sub4_8.method355();
					local424 = this.aClass4_Sub1_Sub4_8.method355();
					this.aBooleanArray12[local415] = true;
					this.anIntArray215[local415] = local819;
					this.anIntArray250[local415] = local181;
					this.anIntArray272[local415] = local424;
					this.anIntArray221[local415] = 0;
					this.anInt860 = -1;
					return true;
				}
				@Pc(1743) Class28 local1743;
				if (this.anInt860 == 190) {
					local415 = this.aClass4_Sub1_Sub4_8.method357();
					local819 = this.aClass4_Sub1_Sub4_8.method357();
					local1743 = Class28.method318(local819);
					if (local1743 != null && local1743.anInt447 == 0) {
						if (local415 < 0) {
							local415 = 0;
						}
						if (local415 > local1743.anInt437 - local1743.anInt423) {
							local415 = local1743.anInt437 - local1743.anInt423;
						}
						local1743.anInt449 = local415;
					}
					this.anInt860 = -1;
					return true;
				}
				if (this.anInt860 == 93) {
					@Pc(1787) boolean local1787 = this.aClass4_Sub1_Sub4_8.method374() == 1;
					local819 = this.aClass4_Sub1_Sub4_8.method383();
					Class28.method318(local819).aBoolean117 = local1787;
					this.anInt860 = -1;
					return true;
				}
				if (this.anInt860 == 66) {
					this.aBoolean237 = false;
					this.anInt996 = 1;
					this.aString25 = "";
					this.aBoolean247 = true;
					this.anInt860 = -1;
					return true;
				}
				if (this.anInt860 == 111) {
					local415 = this.aClass4_Sub1_Sub4_8.method381();
					local418 = Class28.method318(local415);
					for (local181 = 0; local181 < local418.anIntArray94.length; local181++) {
						local418.anIntArray94[local181] = -1;
						local418.anIntArray94[local181] = 0;
					}
					this.anInt860 = -1;
					return true;
				}
				if (this.anInt860 == 88) {
					local415 = this.aClass4_Sub1_Sub4_8.method383();
					local819 = this.aClass4_Sub1_Sub4_8.method382();
					local181 = this.aClass4_Sub1_Sub4_8.method383();
					Class28.method318(local819).anInt432 = (local415 << 16) + local181;
					this.anInt860 = -1;
					return true;
				}
				if (this.anInt860 == 142) {
					this.aBoolean237 = false;
					this.anInt996 = 2;
					this.aString25 = "";
					this.aBoolean247 = true;
					this.anInt860 = -1;
					return true;
				}
				if (this.anInt860 == 92) {
					local415 = this.aClass4_Sub1_Sub4_8.method381();
					this.method705(this.aByte34, local415);
					if (this.anInt955 != -1) {
						this.method715(aByte32, this.anInt955);
						this.anInt955 = -1;
						this.aBoolean247 = true;
					}
					if (this.anInt1015 != -1) {
						this.method715(aByte32, this.anInt1015);
						this.anInt1015 = -1;
						this.aBoolean243 = true;
					}
					if (this.anInt988 != -1) {
						this.method715(aByte32, this.anInt988);
						this.anInt988 = -1;
					}
					if (this.anInt951 != -1) {
						this.method715(aByte32, this.anInt951);
						this.anInt951 = -1;
					}
					if (this.anInt995 != local415) {
						this.method715(aByte32, this.anInt995);
						this.anInt995 = local415;
					}
					if (this.anInt996 != 0) {
						this.anInt996 = 0;
						this.aBoolean247 = true;
					}
					this.aBoolean246 = true;
					this.aBoolean254 = true;
					this.aBoolean256 = false;
					this.anInt860 = -1;
					return true;
				}
				if (this.anInt860 == 194) {
					local415 = this.aClass4_Sub1_Sub4_8.method357();
					local819 = this.aClass4_Sub1_Sub4_8.method381();
					if (this.anInt955 != -1) {
						this.method715(aByte32, this.anInt955);
						this.anInt955 = -1;
						this.aBoolean247 = true;
					}
					if (this.anInt1015 != -1) {
						this.method715(aByte32, this.anInt1015);
						this.anInt1015 = -1;
						this.aBoolean243 = true;
					}
					if (this.anInt988 != -1) {
						this.method715(aByte32, this.anInt988);
						this.anInt988 = -1;
					}
					if (this.anInt951 != local415) {
						this.method715(aByte32, this.anInt951);
						this.anInt951 = local415;
					}
					if (this.anInt995 != local819) {
						this.method715(aByte32, this.anInt995);
						this.anInt995 = local819;
					}
					if (this.anInt996 != 0) {
						this.anInt996 = 0;
						this.aBoolean247 = true;
					}
					this.aBoolean246 = true;
					this.aBoolean254 = true;
					this.aBoolean256 = false;
					this.anInt860 = -1;
					return true;
				}
				@Pc(2136) String local2136;
				if (this.anInt860 == 131) {
					local2125 = this.aClass4_Sub1_Sub4_8.method362();
					@Pc(2139) long local2139;
					if (local2125.endsWith(":tradereq:")) {
						local2136 = local2125.substring(0, local2125.indexOf(":"));
						local2139 = Class47.method550(local2136);
						local653 = false;
						for (local655 = 0; local655 < this.anInt848; local655++) {
							if (this.aLongArray3[local655] == local2139) {
								local653 = true;
								break;
							}
						}
						if (!local653 && this.anInt1020 == 0) {
							this.method588((byte) 8, 4, local2136, "wishes to trade with you.");
						}
					} else if (local2125.endsWith(":duelreq:")) {
						local2136 = local2125.substring(0, local2125.indexOf(":"));
						local2139 = Class47.method550(local2136);
						local653 = false;
						for (local655 = 0; local655 < this.anInt848; local655++) {
							if (this.aLongArray3[local655] == local2139) {
								local653 = true;
								break;
							}
						}
						if (!local653 && this.anInt1020 == 0) {
							this.method588((byte) 8, 8, local2136, "wishes to duel with you.");
						}
					} else if (local2125.endsWith(":chalreq:")) {
						local2136 = local2125.substring(0, local2125.indexOf(":"));
						local2139 = Class47.method550(local2136);
						local653 = false;
						for (local655 = 0; local655 < this.anInt848; local655++) {
							if (this.aLongArray3[local655] == local2139) {
								local653 = true;
								break;
							}
						}
						if (!local653 && this.anInt1020 == 0) {
							local722 = local2125.substring(local2125.indexOf(":") + 1, local2125.length() - 9);
							this.method588((byte) 8, 8, local2136, local722);
						}
					} else {
						this.method588((byte) 8, 0, "", local2125);
					}
					this.anInt860 = -1;
					return true;
				}
				if (this.anInt860 == 215) {
					this.aBoolean234 = false;
					for (local415 = 0; local415 < 5; local415++) {
						this.aBooleanArray12[local415] = false;
					}
					this.anInt860 = -1;
					return true;
				}
				if (this.anInt860 == 205) {
					local415 = this.aClass4_Sub1_Sub4_8.method385();
					if (local415 != this.anInt1075) {
						this.method715(aByte32, this.anInt1075);
						this.anInt1075 = local415;
					}
					this.aBoolean247 = true;
					this.anInt860 = -1;
					return true;
				}
				if (this.anInt860 == 137) {
					this.anInt954 = this.aClass4_Sub1_Sub4_8.method355();
					if (this.anInt954 == 1) {
						this.anInt1018 = this.aClass4_Sub1_Sub4_8.method357();
					}
					if (this.anInt954 >= 2 && this.anInt954 <= 6) {
						if (this.anInt954 == 2) {
							this.anInt982 = 64;
							this.anInt983 = 64;
						}
						if (this.anInt954 == 3) {
							this.anInt982 = 0;
							this.anInt983 = 64;
						}
						if (this.anInt954 == 4) {
							this.anInt982 = 128;
							this.anInt983 = 64;
						}
						if (this.anInt954 == 5) {
							this.anInt982 = 64;
							this.anInt983 = 0;
						}
						if (this.anInt954 == 6) {
							this.anInt982 = 64;
							this.anInt983 = 128;
						}
						this.anInt954 = 2;
						this.anInt979 = this.aClass4_Sub1_Sub4_8.method357();
						this.anInt980 = this.aClass4_Sub1_Sub4_8.method357();
						this.anInt981 = this.aClass4_Sub1_Sub4_8.method355();
					}
					if (this.anInt954 == 10) {
						this.anInt887 = this.aClass4_Sub1_Sub4_8.method357();
					}
					this.anInt860 = -1;
					return true;
				}
				if (this.anInt860 == 44) {
					this.aBoolean234 = true;
					this.anInt888 = this.aClass4_Sub1_Sub4_8.method355();
					this.anInt889 = this.aClass4_Sub1_Sub4_8.method355();
					this.anInt890 = this.aClass4_Sub1_Sub4_8.method357();
					this.anInt891 = this.aClass4_Sub1_Sub4_8.method355();
					this.anInt892 = this.aClass4_Sub1_Sub4_8.method355();
					if (this.anInt892 >= 100) {
						this.anInt929 = this.anInt888 * 128 + 64;
						this.anInt931 = this.anInt889 * 128 + 64;
						this.anInt930 = this.method614(this.anInt895, this.anInt929, this.anInt931) - this.anInt890;
					}
					this.anInt860 = -1;
					return true;
				}
				if (this.anInt860 == 204) {
					local2125 = this.aClass4_Sub1_Sub4_8.method362();
					local819 = this.aClass4_Sub1_Sub4_8.method381();
					Class28.method318(local819).aString8 = local2125;
					@Pc(2553) int local2553 = this.anIntArray255[this.anInt994];
					if (Class28.method318(local819).anInt443 == local2553) {
						this.aBoolean246 = true;
					}
					this.anInt860 = -1;
					return true;
				}
				if (this.anInt860 == 33) {
					if (this.anInt994 == 12) {
						this.aBoolean246 = true;
					}
					this.anInt910 = this.aClass4_Sub1_Sub4_8.method358();
					this.anInt860 = -1;
					return true;
				}
				if (this.anInt860 == 113) {
					this.method655();
					this.anInt860 = -1;
					return false;
				}
				if (this.anInt860 == 150 || this.anInt860 == 118) {
					local415 = this.anInt851;
					local819 = this.anInt852;
					if (this.anInt860 == 150) {
						local415 = this.aClass4_Sub1_Sub4_8.method381();
						local819 = this.aClass4_Sub1_Sub4_8.method383();
						this.aBoolean224 = false;
					}
					if (this.anInt860 == 118) {
						local415 = this.aClass4_Sub1_Sub4_8.method381();
						this.aClass4_Sub1_Sub4_8.method365();
						local181 = 0;
						while (true) {
							if (local181 >= 4) {
								this.aClass4_Sub1_Sub4_8.method367();
								local819 = this.aClass4_Sub1_Sub4_8.method357();
								this.aBoolean224 = true;
								break;
							}
							for (local424 = 0; local424 < 13; local424++) {
								for (local189 = 0; local189 < 13; local189++) {
									local655 = this.aClass4_Sub1_Sub4_8.method366(1, this.aBoolean229);
									if (local655 == 1) {
										this.anIntArrayArrayArray7[local181][local424][local189] = this.aClass4_Sub1_Sub4_8.method366(26, this.aBoolean229);
									} else {
										this.anIntArrayArrayArray7[local181][local424][local189] = -1;
									}
								}
							}
							local181++;
						}
					}
					if (this.anInt851 == local415 && this.anInt852 == local819 && this.anInt946 == 2) {
						this.anInt860 = -1;
						return true;
					}
					this.anInt851 = local415;
					this.anInt852 = local819;
					this.anInt1056 = (this.anInt851 - 6) * 8;
					this.anInt1057 = (this.anInt852 - 6) * 8;
					this.aBoolean225 = false;
					if ((this.anInt851 / 8 == 48 || this.anInt851 / 8 == 49) && this.anInt852 / 8 == 48) {
						this.aBoolean225 = true;
					}
					if (this.anInt851 / 8 == 48 && this.anInt852 / 8 == 148) {
						this.aBoolean225 = true;
					}
					this.anInt946 = 1;
					this.aLong30 = System.currentTimeMillis();
					this.method656(null, "Loading - please wait.");
					if (this.anInt860 == 150) {
						local181 = 0;
						local424 = (this.anInt851 - 6) / 8;
						label1208: while (true) {
							if (local424 > (this.anInt851 + 6) / 8) {
								this.aByteArrayArray6 = new byte[local181][];
								this.aByteArrayArray5 = new byte[local181][];
								this.anIntArray237 = new int[local181];
								this.anIntArray238 = new int[local181];
								this.anIntArray239 = new int[local181];
								local181 = 0;
								local189 = (this.anInt851 - 6) / 8;
								while (true) {
									if (local189 > (this.anInt851 + 6) / 8) {
										break label1208;
									}
									for (local655 = (this.anInt852 - 6) / 8; local655 <= (this.anInt852 + 6) / 8; local655++) {
										this.anIntArray237[local181] = (local189 << 8) + local655;
										if (this.aBoolean225 && (local655 == 49 || local655 == 149 || local655 == 147 || local189 == 50 || local189 == 49 && local655 == 47)) {
											this.anIntArray238[local181] = -1;
											this.anIntArray239[local181] = -1;
											local181++;
										} else {
											local291 = this.anIntArray238[local181] = this.aClass8_Sub1_1.method91(local189, local655, 0);
											if (local291 != -1) {
												this.aClass8_Sub1_1.method93(3, local291);
											}
											local324 = this.anIntArray239[local181] = this.aClass8_Sub1_1.method91(local189, local655, 1);
											if (local324 != -1) {
												this.aClass8_Sub1_1.method93(3, local324);
											}
											local181++;
										}
									}
									local189++;
								}
							}
							for (local189 = (this.anInt852 - 6) / 8; local189 <= (this.anInt852 + 6) / 8; local189++) {
								local181++;
							}
							local424++;
						}
					}
					if (this.anInt860 == 118) {
						local181 = 0;
						@Pc(2994) int[] local2994 = new int[676];
						local189 = 0;
						label1167: while (true) {
							@Pc(3024) int local3024;
							@Pc(3030) int local3030;
							@Pc(3040) int local3040;
							if (local189 >= 4) {
								this.aByteArrayArray6 = new byte[local181][];
								this.aByteArrayArray5 = new byte[local181][];
								this.anIntArray237 = new int[local181];
								this.anIntArray238 = new int[local181];
								this.anIntArray239 = new int[local181];
								local655 = 0;
								while (true) {
									if (local655 >= local181) {
										break label1167;
									}
									local291 = this.anIntArray237[local655] = local2994[local655];
									local324 = local291 >> 8 & 0xFF;
									local3024 = local291 & 0xFF;
									local3030 = this.anIntArray238[local655] = this.aClass8_Sub1_1.method91(local324, local3024, 0);
									if (local3030 != -1) {
										this.aClass8_Sub1_1.method93(3, local3030);
									}
									local3040 = this.anIntArray239[local655] = this.aClass8_Sub1_1.method91(local324, local3024, 1);
									if (local3040 != -1) {
										this.aClass8_Sub1_1.method93(3, local3040);
									}
									local655++;
								}
							}
							for (local655 = 0; local655 < 13; local655++) {
								for (local291 = 0; local291 < 13; local291++) {
									local324 = this.anIntArrayArrayArray7[local189][local655][local291];
									if (local324 != -1) {
										local3024 = local324 >> 14 & 0x3FF;
										local3030 = local324 >> 3 & 0x7FF;
										local3040 = (local3024 / 8 << 8) + local3030 / 8;
										for (@Pc(3042) int local3042 = 0; local3042 < local181; local3042++) {
											if (local2994[local3042] == local3040) {
												local3040 = -1;
												break;
											}
										}
										if (local3040 != -1) {
											local2994[local181++] = local3040;
										}
									}
								}
							}
							local189++;
						}
					}
					local181 = this.anInt1056 - this.anInt1058;
					local424 = this.anInt1057 - this.anInt1059;
					this.anInt1058 = this.anInt1056;
					this.anInt1059 = this.anInt1057;
					for (local189 = 0; local189 < 16384; local189++) {
						@Pc(3195) Class4_Sub1_Sub1_Sub2_Sub1 local3195 = this.aClass4_Sub1_Sub1_Sub2_Sub1Array1[local189];
						if (local3195 != null) {
							for (local291 = 0; local291 < 10; local291++) {
								local3195.anIntArray187[local291] -= local181;
								local3195.anIntArray188[local291] -= local424;
							}
							local3195.anInt764 -= local181 * 128;
							local3195.anInt765 -= local424 * 128;
						}
					}
					for (local655 = 0; local655 < this.anInt947; local655++) {
						@Pc(3250) Class4_Sub1_Sub1_Sub2_Sub2 local3250 = this.aClass4_Sub1_Sub1_Sub2_Sub2Array1[local655];
						if (local3250 != null) {
							for (local324 = 0; local324 < 10; local324++) {
								local3250.anIntArray187[local324] -= local181;
								local3250.anIntArray188[local324] -= local424;
							}
							local3250.anInt764 -= local181 * 128;
							local3250.anInt765 -= local424 * 128;
						}
					}
					this.aBoolean266 = true;
					@Pc(3302) byte local3302 = 0;
					@Pc(3304) byte local3304 = 104;
					@Pc(3306) byte local3306 = 1;
					if (local181 < 0) {
						local3302 = 103;
						local3304 = -1;
						local3306 = -1;
					}
					@Pc(3316) byte local3316 = 0;
					@Pc(3318) byte local3318 = 104;
					@Pc(3320) byte local3320 = 1;
					if (local424 < 0) {
						local3316 = 103;
						local3318 = -1;
						local3320 = -1;
					}
					for (@Pc(3330) int local3330 = local3302; local3330 != local3304; local3330 += local3306) {
						for (@Pc(3334) int local3334 = local3316; local3334 != local3318; local3334 += local3320) {
							@Pc(3340) int local3340 = local3330 + local181;
							@Pc(3344) int local3344 = local3334 + local424;
							for (@Pc(3346) int local3346 = 0; local3346 < 4; local3346++) {
								if (local3340 >= 0 && local3344 >= 0 && local3340 < 104 && local3344 < 104) {
									this.aClass11ArrayArrayArray1[local3346][local3330][local3334] = this.aClass11ArrayArrayArray1[local3346][local3340][local3344];
								} else {
									this.aClass11ArrayArrayArray1[local3346][local3330][local3334] = null;
								}
							}
						}
					}
					for (@Pc(3408) Class4_Sub2 local3408 = (Class4_Sub2) this.aClass11_11.method166(); local3408 != null; local3408 = (Class4_Sub2) this.aClass11_11.method168()) {
						local3408.anInt314 -= local181;
						local3408.anInt315 -= local424;
						if (local3408.anInt314 < 0 || local3408.anInt315 < 0 || local3408.anInt314 >= 104 || local3408.anInt315 >= 104) {
							local3408.method556();
						}
					}
					if (this.anInt865 != 0) {
						this.anInt865 -= local181;
						this.anInt866 -= local424;
					}
					this.aBoolean234 = false;
					this.anInt860 = -1;
					return true;
				}
				if (this.anInt860 == 216 || this.anInt860 == 41 || this.anInt860 == 39 || this.anInt860 == 125 || this.anInt860 == 114 || this.anInt860 == 133 || this.anInt860 == 20 || this.anInt860 == 51 || this.anInt860 == 127 || this.anInt860 == 90 || this.anInt860 == 74) {
					this.method704(this.aByte29, this.aClass4_Sub1_Sub4_8, this.anInt860);
					this.anInt860 = -1;
					return true;
				}
				if (this.anInt860 == 242) {
					local415 = this.aClass4_Sub1_Sub4_8.method381();
					Class28.method318(local415).anInt444 = 3;
					if (aClass4_Sub1_Sub1_Sub2_Sub2_1.aClass40_2 == null) {
						Class28.method318(local415).anInt445 = (aClass4_Sub1_Sub1_Sub2_Sub2_1.anIntArray189[0] << 25) + (aClass4_Sub1_Sub1_Sub2_Sub2_1.anIntArray189[4] << 20) + (aClass4_Sub1_Sub1_Sub2_Sub2_1.anIntArray190[0] << 15) + (aClass4_Sub1_Sub1_Sub2_Sub2_1.anIntArray190[8] << 10) + (aClass4_Sub1_Sub1_Sub2_Sub2_1.anIntArray190[11] << 5) + aClass4_Sub1_Sub1_Sub2_Sub2_1.anIntArray190[1];
					} else {
						Class28.method318(local415).anInt445 = (int) (aClass4_Sub1_Sub1_Sub2_Sub2_1.aClass40_2.aLong21 + 305419896L);
					}
					this.anInt860 = -1;
					return true;
				}
				if (this.anInt860 == 212) {
					this.anInt1014 = this.aClass4_Sub1_Sub4_8.method357();
					this.anInt920 = this.aClass4_Sub1_Sub4_8.method374();
					this.anInt860 = -1;
					return true;
				}
				if (this.anInt860 == 31) {
					this.anInt943 = this.aClass4_Sub1_Sub4_8.method373();
					this.anInt942 = this.aClass4_Sub1_Sub4_8.method373();
					this.anInt860 = -1;
					return true;
				}
				if (this.anInt860 == 54) {
					local415 = this.aClass4_Sub1_Sub4_8.method384();
					local819 = this.aClass4_Sub1_Sub4_8.method383();
					local1743 = Class28.method318(local819);
					if (local1743.anInt424 != local415 || local415 == -1) {
						local1743.anInt424 = local415;
						local1743.anInt440 = 0;
						local1743.anInt448 = 0;
					}
					this.anInt860 = -1;
					return true;
				}
				if (this.anInt860 == 135) {
					this.anInt978 = this.aClass4_Sub1_Sub4_8.method355();
					this.anInt970 = this.aClass4_Sub1_Sub4_8.method355();
					this.anInt1002 = this.aClass4_Sub1_Sub4_8.method355();
					this.aBoolean250 = true;
					this.aBoolean247 = true;
					this.anInt860 = -1;
					return true;
				}
				if (this.anInt860 == 187) {
					for (local415 = 0; local415 < this.aClass4_Sub1_Sub1_Sub2_Sub2Array1.length; local415++) {
						if (this.aClass4_Sub1_Sub1_Sub2_Sub2Array1[local415] != null) {
							this.aClass4_Sub1_Sub1_Sub2_Sub2Array1[local415].anInt777 = -1;
						}
					}
					for (local819 = 0; local819 < this.aClass4_Sub1_Sub1_Sub2_Sub1Array1.length; local819++) {
						if (this.aClass4_Sub1_Sub1_Sub2_Sub1Array1[local819] != null) {
							this.aClass4_Sub1_Sub1_Sub2_Sub1Array1[local819].anInt777 = -1;
						}
					}
					this.anInt860 = -1;
					return true;
				}
				if (this.anInt860 == 167) {
					local415 = this.aClass4_Sub1_Sub4_8.method373();
					local819 = this.aClass4_Sub1_Sub4_8.method381();
					if (local819 == 65535) {
						local819 = -1;
					}
					if (this.anIntArray255[local415] != local819) {
						this.method715(aByte32, this.anIntArray255[local415]);
						this.anIntArray255[local415] = local819;
					}
					this.aBoolean246 = true;
					this.aBoolean254 = true;
					this.anInt860 = -1;
					return true;
				}
				if (this.anInt860 == 154) {
					local415 = this.aClass4_Sub1_Sub4_8.method382();
					local819 = this.aClass4_Sub1_Sub4_8.method381();
					Class28.method318(local819).anInt444 = 1;
					Class28.method318(local819).anInt445 = local415;
					this.anInt860 = -1;
					return true;
				}
				if (this.anInt860 == 22) {
					local415 = this.aClass4_Sub1_Sub4_8.method357();
					this.method705(this.aByte34, local415);
					if (this.anInt995 != -1) {
						this.method715(aByte32, this.anInt995);
						this.anInt995 = -1;
						this.aBoolean246 = true;
						this.aBoolean254 = true;
					}
					if (this.anInt1015 != -1) {
						this.method715(aByte32, this.anInt1015);
						this.anInt1015 = -1;
						this.aBoolean243 = true;
					}
					if (this.anInt988 != -1) {
						this.method715(aByte32, this.anInt988);
						this.anInt988 = -1;
					}
					if (this.anInt951 != -1) {
						this.method715(aByte32, this.anInt951);
						this.anInt951 = -1;
					}
					if (this.anInt955 != local415) {
						this.method715(aByte32, this.anInt955);
						this.anInt955 = local415;
					}
					this.aBoolean256 = false;
					this.aBoolean247 = true;
					this.anInt860 = -1;
					return true;
				}
				if (this.anInt860 == 200) {
					this.aBoolean234 = true;
					this.anInt1004 = this.aClass4_Sub1_Sub4_8.method355();
					this.anInt1005 = this.aClass4_Sub1_Sub4_8.method355();
					this.anInt1006 = this.aClass4_Sub1_Sub4_8.method357();
					this.anInt1007 = this.aClass4_Sub1_Sub4_8.method355();
					this.anInt1008 = this.aClass4_Sub1_Sub4_8.method355();
					if (this.anInt1008 >= 100) {
						local415 = this.anInt1004 * 128 + 64;
						local819 = this.anInt1005 * 128 + 64;
						local181 = this.method614(this.anInt895, local415, local819) - this.anInt1006;
						local424 = local415 - this.anInt929;
						local189 = local181 - this.anInt930;
						local655 = local819 - this.anInt931;
						local291 = (int) Math.sqrt((double) (local424 * local424 + local655 * local655));
						this.anInt932 = (int) (Math.atan2((double) local189, (double) local291) * 325.949D) & 0x7FF;
						this.anInt933 = (int) (Math.atan2((double) local424, (double) local655) * -325.949D) & 0x7FF;
						if (this.anInt932 < 128) {
							this.anInt932 = 128;
						}
						if (this.anInt932 > 383) {
							this.anInt932 = 383;
						}
					}
					this.anInt860 = -1;
					return true;
				}
				if (this.anInt860 == 94) {
					this.anInt994 = this.aClass4_Sub1_Sub4_8.method355();
					this.aBoolean246 = true;
					this.aBoolean254 = true;
					this.anInt860 = -1;
					return true;
				}
				if (this.anInt860 == 72) {
					this.anInt958 = this.aClass4_Sub1_Sub4_8.method355();
					this.aBoolean246 = true;
					this.anInt860 = -1;
					return true;
				}
				if (this.anInt860 == 18) {
					local415 = this.aClass4_Sub1_Sub4_8.method381();
					local819 = this.aClass4_Sub1_Sub4_8.method381();
					local181 = this.aClass4_Sub1_Sub4_8.method383();
					local424 = this.aClass4_Sub1_Sub4_8.method382();
					Class28.method318(local415).anInt455 = local181;
					Class28.method318(local415).anInt456 = local424;
					Class28.method318(local415).anInt454 = local819;
					this.anInt860 = -1;
					return true;
				}
				if (this.anInt860 == 102) {
					local415 = this.aClass4_Sub1_Sub4_8.method357();
					@Pc(4150) byte local4150 = this.aClass4_Sub1_Sub4_8.method377(this.aBoolean239);
					this.anIntArray214[local415] = local4150;
					if (this.anIntArray249[local415] != local4150) {
						this.anIntArray249[local415] = local4150;
						this.method723(local415);
						this.aBoolean246 = true;
						if (this.anInt1075 != -1) {
							this.aBoolean247 = true;
						}
					}
					this.anInt860 = -1;
					return true;
				}
				if (this.anInt860 == 64) {
					local415 = this.aClass4_Sub1_Sub4_8.method383();
					local819 = this.aClass4_Sub1_Sub4_8.method381();
					local181 = this.aClass4_Sub1_Sub4_8.method382();
					if (local415 == 65535) {
						Class28.method318(local819).anInt444 = 0;
						this.anInt860 = -1;
						return true;
					}
					@Pc(4219) Class17 local4219 = Class17.method196(local415);
					Class28.method318(local819).anInt444 = 4;
					Class28.method318(local819).anInt445 = local415;
					Class28.method318(local819).anInt455 = local4219.anInt293;
					Class28.method318(local819).anInt456 = local4219.anInt282;
					Class28.method318(local819).anInt454 = local4219.anInt287 * 100 / local181;
					this.anInt860 = -1;
					return true;
				}
				if (this.anInt860 == 84) {
					local415 = this.aClass4_Sub1_Sub4_8.method357();
					if (local415 == 65535) {
						local415 = -1;
					}
					if (local415 != this.anInt1055 && this.aBoolean244 && !aBoolean223 && this.anInt914 == 0) {
						this.anInt925 = local415;
						this.aBoolean235 = true;
						this.aClass8_Sub1_1.method93(2, this.anInt925);
					}
					this.anInt1055 = local415;
					this.anInt860 = -1;
					return true;
				}
				if (this.anInt860 == 106) {
					local415 = this.aClass4_Sub1_Sub4_8.method359();
					local819 = this.aClass4_Sub1_Sub4_8.method381();
					if (this.aBoolean244 && !aBoolean223) {
						this.anInt925 = local819;
						this.aBoolean235 = false;
						this.aClass8_Sub1_1.method93(2, this.anInt925);
						this.anInt914 = local415;
					}
					this.anInt860 = -1;
					return true;
				}
				if (this.anInt860 == 95) {
					this.aBoolean246 = true;
					local415 = this.aClass4_Sub1_Sub4_8.method355();
					local819 = this.aClass4_Sub1_Sub4_8.method387();
					local181 = this.aClass4_Sub1_Sub4_8.method373();
					this.anIntArray217[local181] = local819;
					this.anIntArray258[local181] = local415;
					this.anIntArray212[local181] = 1;
					for (local424 = 0; local424 < 98; local424++) {
						if (local819 >= anIntArray216[local424]) {
							this.anIntArray212[local181] = local424 + 2;
						}
					}
					this.anInt860 = -1;
					return true;
				}
				if (this.anInt860 == 164) {
					local415 = this.aClass4_Sub1_Sub4_8.method384();
					if (local415 >= 0) {
						this.method705(this.aByte34, local415);
					}
					if (local415 != this.anInt968) {
						this.method715(aByte32, this.anInt968);
						this.anInt968 = local415;
					}
					this.anInt860 = -1;
					return true;
				}
				if (this.anInt860 == 149) {
					local415 = this.aClass4_Sub1_Sub4_8.method375();
					local2136 = this.aClass4_Sub1_Sub4_8.method362();
					local181 = this.aClass4_Sub1_Sub4_8.method373();
					if (local181 >= 1 && local181 <= 5) {
						if (local2136.equalsIgnoreCase("null")) {
							local2136 = null;
						}
						this.aStringArray10[local181 - 1] = local2136;
						this.aBooleanArray11[local181 - 1] = local415 == 0;
					}
					this.anInt860 = -1;
					return true;
				}
				signlink.reporterror("T1 - " + this.anInt860 + "," + this.anInt859 + " - " + this.anInt1063 + "," + this.anInt1064);
				this.method655();
			} catch (@Pc(4510) IOException local4510) {
				this.method624();
			} catch (@Pc(4515) Exception local4515) {
				local2125 = "T2 - " + this.anInt860 + "," + this.anInt1063 + "," + this.anInt1064 + " - " + this.anInt859 + "," + (this.anInt1056 + aClass4_Sub1_Sub1_Sub2_Sub2_1.anIntArray187[0]) + "," + (this.anInt1057 + aClass4_Sub1_Sub1_Sub2_Sub2_1.anIntArray188[0]) + " - ";
				for (local819 = 0; local819 < this.anInt859 && local819 < 50; local819++) {
					local2125 = local2125 + this.aClass4_Sub1_Sub4_8.aByteArray10[local819] + ",";
				}
				signlink.reporterror(local2125);
				this.method655();
			}
			return true;
		} catch (@Pc(4596) RuntimeException local4596) {
			signlink.reporterror("52467, " + 8 + ", " + local4596.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!TTWFVYGB;IZI)V")
	private void method718(@OriginalArg(0) Class4_Sub1_Sub2_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		try {
			@Pc(13) int local13 = this.anInt879 + this.anInt1050 & 0x7FF;
			@Pc(21) int local21 = arg1 * arg1 + arg2 * arg2;
			if (local21 <= 6400) {
				@Pc(29) int local29 = Class4_Sub1_Sub1_Sub4.anIntArray137[local13];
				@Pc(33) int local33 = Class4_Sub1_Sub1_Sub4.anIntArray138[local13];
				@Pc(42) int local42 = local29 * 256 / (this.anInt985 + 256);
				@Pc(51) int local51 = local33 * 256 / (this.anInt985 + 256);
				@Pc(61) int local61 = arg2 * local42 + arg1 * local51 >> 16;
				@Pc(71) int local71 = arg2 * local51 - arg1 * local42 >> 16;
				if (local21 > 2500) {
					arg0.method472(83 - local71 - arg0.anInt606 / 2 - 4, local61 + 94 - arg0.anInt605 / 2 + 4, this.aClass4_Sub1_Sub2_Sub2_14);
				} else {
					arg0.method466(local61 + 94 + 4 - arg0.anInt605 / 2, 83 - local71 - arg0.anInt606 / 2 - 4);
				}
			}
		} catch (@Pc(125) RuntimeException local125) {
			signlink.reporterror("64626, " + arg0 + ", " + arg1 + ", " + true + ", " + arg2 + ", " + local125.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILclient!IYHIHFOL;)V")
	private void method719(@OriginalArg(1) Class4_Sub2 arg0) {
		try {
			@Pc(1) int local1 = 0;
			@Pc(3) int local3 = -1;
			@Pc(5) int local5 = 0;
			@Pc(7) int local7 = 0;
			if (arg0.anInt313 == 0) {
				local1 = this.aClass20_1.method249(arg0.anInt312, arg0.anInt314, arg0.anInt315);
			}
			if (arg0.anInt313 == 1) {
				local1 = this.aClass20_1.method250(arg0.anInt315, arg0.anInt314, arg0.anInt312);
			}
			if (arg0.anInt313 == 2) {
				local1 = this.aClass20_1.method251(arg0.anInt312, arg0.anInt314, arg0.anInt315);
			}
			if (arg0.anInt313 == 3) {
				local1 = this.aClass20_1.method252(arg0.anInt312, arg0.anInt314, arg0.anInt315);
			}
			if (local1 != 0) {
				@Pc(76) int local76 = this.aClass20_1.method253(arg0.anInt312, arg0.anInt314, arg0.anInt315, local1);
				local3 = local1 >> 14 & 0x7FFF;
				local5 = local76 & 0x1F;
				local7 = local76 >> 6;
			}
			arg0.anInt309 = local3;
			arg0.anInt311 = local5;
			arg0.anInt310 = local7;
		} catch (@Pc(111) RuntimeException local111) {
			signlink.reporterror("99037, " + -20618 + ", " + arg0 + ", " + local111.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "J", descriptor = "(I)V")
	private void method720() {
		try {
			this.aBoolean263 = true;
			try {
				@Pc(4) long local4 = System.currentTimeMillis();
				@Pc(6) int local6 = 0;
				@Pc(8) int local8 = 20;
				while (this.aBoolean269) {
					this.anInt1012++;
					this.method587();
					this.method587();
					this.method650();
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
			this.aBoolean263 = false;
		} catch (@Pc(74) RuntimeException local74) {
			signlink.reporterror("68720, " + 0 + ", " + local74.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "q", descriptor = "(B)V")
	private void method721() {
		try {
			this.aClass4_Sub1_Sub4_7.method344(70);
			if (this.anInt995 != -1) {
				this.method715(aByte32, this.anInt995);
				this.anInt995 = -1;
				this.aBoolean246 = true;
				this.aBoolean256 = false;
				this.aBoolean254 = true;
			}
			if (this.anInt955 != -1) {
				this.method715(aByte32, this.anInt955);
				this.anInt955 = -1;
				this.aBoolean247 = true;
				this.aBoolean256 = false;
			}
			if (this.anInt1015 != -1) {
				this.method715(aByte32, this.anInt1015);
				this.anInt1015 = -1;
				this.aBoolean243 = true;
			}
			if (this.anInt988 != -1) {
				this.method715(aByte32, this.anInt988);
				this.anInt988 = -1;
			}
			if (this.anInt951 != -1) {
				this.method715(aByte32, this.anInt951);
				this.anInt951 = -1;
			}
		} catch (@Pc(90) RuntimeException local90) {
			signlink.reporterror("94144, " + 72 + ", " + local90.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "K", descriptor = "(I)Z")
	private boolean method722(@OriginalArg(0) int arg0) {
		try {
			if (arg0 != 9) {
				this.aClass4_Sub1_Sub4_7.method345(60);
			}
			return signlink.wavereplay();
		} catch (@Pc(9) RuntimeException local9) {
			signlink.reporterror("88627, " + arg0 + ", " + local9.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(II)V")
	private void method723(@OriginalArg(1) int arg0) {
		try {
			@Pc(4) int local4 = Class48.aClass48Array1[arg0].anInt812;
			if (local4 != 0) {
				@Pc(12) int local12 = this.anIntArray249[arg0];
				if (this.anInt1060 > 6 || this.anInt1060 < 6) {
					this.anInt860 = -1;
				}
				if (local4 == 1) {
					if (local12 == 1) {
						Class4_Sub1_Sub2_Sub1.method144(0.9D);
					}
					if (local12 == 2) {
						Class4_Sub1_Sub2_Sub1.method144(0.8D);
					}
					if (local12 == 3) {
						Class4_Sub1_Sub2_Sub1.method144(0.7D);
					}
					if (local12 == 4) {
						Class4_Sub1_Sub2_Sub1.method144(0.6D);
					}
					Class17.aClass49_4.method572();
					this.aBoolean243 = true;
				}
				if (local4 == 3) {
					@Pc(61) boolean local61 = this.aBoolean244;
					if (local12 == 0) {
						this.method603(this.aBoolean244, 0);
						this.aBoolean244 = true;
					}
					if (local12 == 1) {
						this.method603(this.aBoolean244, -400);
						this.aBoolean244 = true;
					}
					if (local12 == 2) {
						this.method603(this.aBoolean244, -800);
						this.aBoolean244 = true;
					}
					if (local12 == 3) {
						this.method603(this.aBoolean244, -1200);
						this.aBoolean244 = true;
					}
					if (local12 == 4) {
						this.aBoolean244 = false;
					}
					if (this.aBoolean244 != local61 && !aBoolean223) {
						if (this.aBoolean244) {
							this.anInt925 = this.anInt1055;
							this.aBoolean235 = true;
							this.aClass8_Sub1_1.method93(2, this.anInt925);
						} else {
							this.method653();
						}
						this.anInt914 = 0;
					}
				}
				if (local4 == 4) {
					if (local12 == 0) {
						this.aBoolean261 = true;
						this.method685((byte) 1, 0);
					}
					if (local12 == 1) {
						this.aBoolean261 = true;
						this.method685((byte) 1, -400);
					}
					if (local12 == 2) {
						this.aBoolean261 = true;
						this.method685((byte) 1, -800);
					}
					if (local12 == 3) {
						this.aBoolean261 = true;
						this.method685((byte) 1, -1200);
					}
					if (local12 == 4) {
						this.aBoolean261 = false;
					}
				}
				if (local4 == 5) {
					this.anInt1053 = local12;
				}
				if (local4 == 6) {
					this.anInt956 = local12;
				}
				if (local4 == 8) {
					this.anInt1025 = local12;
					this.aBoolean247 = true;
				}
				if (local4 == 9) {
					this.anInt998 = local12;
				}
			}
		} catch (@Pc(221) RuntimeException local221) {
			signlink.reporterror("30974, " + 6 + ", " + arg0 + ", " + local221.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIIII)V")
	private void method724(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		try {
			this.aClass4_Sub1_Sub2_Sub2_16.method296(arg4, arg3);
			this.aClass4_Sub1_Sub2_Sub2_17.method296(arg4, arg3 + arg2 - 16);
			Class4_Sub1_Sub2.method496(arg4, this.anInt907, 16, arg2 - 32, arg3 + 16);
			@Pc(35) int local35 = (arg2 - 32) * arg2 / arg0;
			if (local35 < 8) {
				local35 = 8;
			}
			@Pc(52) int local52 = (arg2 - local35 - 32) * arg1 / (arg0 - arg2);
			Class4_Sub1_Sub2.method496(arg4, this.anInt1032, 16, local35, arg3 + local52 + 16);
			Class4_Sub1_Sub2.method501(arg3 + local52 + 16, local35, arg4, this.anInt915);
			Class4_Sub1_Sub2.method501(arg3 + local52 + 16, local35, arg4 + 1, this.anInt915);
			Class4_Sub1_Sub2.method499(this.anInt915, 16, arg3 + local52 + 16, arg4);
			this.anInt859 += 0;
			Class4_Sub1_Sub2.method499(this.anInt915, 16, arg3 + local52 + 17, arg4);
			Class4_Sub1_Sub2.method501(arg3 + local52 + 16, local35, arg4 + 15, this.anInt969);
			Class4_Sub1_Sub2.method501(arg3 + local52 + 17, local35 - 1, arg4 + 14, this.anInt969);
			Class4_Sub1_Sub2.method499(this.anInt969, 16, arg3 + local52 + local35 + 15, arg4);
			Class4_Sub1_Sub2.method499(this.anInt969, 15, arg3 + local52 + local35 + 14, arg4 + 1);
		} catch (@Pc(174) RuntimeException local174) {
			signlink.reporterror("56853, " + 0 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local174.toString());
			throw new RuntimeException();
		}
	}
}
